/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.StringRepresentable;
public enum PosAmtType implements StringRepresentable
{
    FINAL_MARK_TO_MARKET_AMOUNT("FMTM"),
    INCREMENTAL_MARK_TO_MARKET_AMOUNT("IMTM"),
    TRADE_VARIATION_AMOUNT("TVAR"),
    START_OF_DAY_MARK_TO_MARKET_AMOUNT("SMTM"),
    PREMIUM_AMOUNT("PREM"),
    CASH_RESIDUAL_AMOUNT("CRES"),
    CASH_AMOUNT("CASH"),
    VALUE_ADJUSTED_AMOUNT("VADJ"),
    NULL_VAL(""),
    ARTIO_UNKNOWN("");

    private final String representation;

    PosAmtType(final String representation)
    {
         this.representation = representation;
    }

    public final String representation() { return representation; }

    private static final CharArrayMap<PosAmtType> charMap;
    static
    {
        final Map<String, PosAmtType> stringMap = new HashMap<>();
        stringMap.put("FMTM", FINAL_MARK_TO_MARKET_AMOUNT);
        stringMap.put("IMTM", INCREMENTAL_MARK_TO_MARKET_AMOUNT);
        stringMap.put("TVAR", TRADE_VARIATION_AMOUNT);
        stringMap.put("SMTM", START_OF_DAY_MARK_TO_MARKET_AMOUNT);
        stringMap.put("PREM", PREMIUM_AMOUNT);
        stringMap.put("CRES", CASH_RESIDUAL_AMOUNT);
        stringMap.put("CASH", CASH_AMOUNT);
        stringMap.put("VADJ", VALUE_ADJUSTED_AMOUNT);
        charMap = new CharArrayMap<>(stringMap);
    }

    public static PosAmtType decode(final CharArrayWrapper key)
    {
        final PosAmtType value = charMap.get(key);
        if (value == null)
        {
            return ARTIO_UNKNOWN;
        }
        return value;
    }
    public static boolean isValid(final CharArrayWrapper key)
    {
        return charMap.containsKey(key);
    }
    public static PosAmtType decode(final String representation)
    {
        switch(representation)
        {
        case "FMTM": return FINAL_MARK_TO_MARKET_AMOUNT;
        case "IMTM": return INCREMENTAL_MARK_TO_MARKET_AMOUNT;
        case "TVAR": return TRADE_VARIATION_AMOUNT;
        case "SMTM": return START_OF_DAY_MARK_TO_MARKET_AMOUNT;
        case "PREM": return PREMIUM_AMOUNT;
        case "CRES": return CASH_RESIDUAL_AMOUNT;
        case "CASH": return CASH_AMOUNT;
        case "VADJ": return VALUE_ADJUSTED_AMOUNT;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
