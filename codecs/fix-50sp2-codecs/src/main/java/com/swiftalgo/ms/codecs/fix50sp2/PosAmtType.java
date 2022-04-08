/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.StringRepresentable;
public enum PosAmtType implements StringRepresentable
{
    CASH_AMOUNT("CASH"),
    CASH_RESIDUAL_AMOUNT("CRES"),
    FINAL_MARK_TO_MARKET_AMOUNT("FMTM"),
    INCREMENTAL_MARK_TO_MARKET_AMOUNT("IMTM"),
    PREMIUM_AMOUNT("PREM"),
    START_OF_DAY_MARK_TO_MARKET_AMOUNT("SMTM"),
    TRADE_VARIATION_AMOUNT("TVAR"),
    VALUE_ADJUSTED_AMOUNT("VADJ"),
    SETTLEMENT_VALUE("SETL"),
    INITIAL_TRADE_COUPON_AMOUNT("ICPN"),
    ACCRUED_COUPON_AMOUNT("ACPN"),
    COUPON_AMOUNT("CPN"),
    INCREMENTAL_ACCRUED_COUPON("IACPN"),
    COLLATERALIZED_MARK_TO_MARKET("CMTM"),
    INCREMENTAL_COLLATERALIZED_MARK_TO_MARKET("ICMTM"),
    COMPENSATION_AMOUNT("DLV"),
    TOTAL_BANKED_AMOUNT("BANK"),
    TOTAL_COLLATERALIZED_AMOUNT("COLAT"),
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
        stringMap.put("CASH", CASH_AMOUNT);
        stringMap.put("CRES", CASH_RESIDUAL_AMOUNT);
        stringMap.put("FMTM", FINAL_MARK_TO_MARKET_AMOUNT);
        stringMap.put("IMTM", INCREMENTAL_MARK_TO_MARKET_AMOUNT);
        stringMap.put("PREM", PREMIUM_AMOUNT);
        stringMap.put("SMTM", START_OF_DAY_MARK_TO_MARKET_AMOUNT);
        stringMap.put("TVAR", TRADE_VARIATION_AMOUNT);
        stringMap.put("VADJ", VALUE_ADJUSTED_AMOUNT);
        stringMap.put("SETL", SETTLEMENT_VALUE);
        stringMap.put("ICPN", INITIAL_TRADE_COUPON_AMOUNT);
        stringMap.put("ACPN", ACCRUED_COUPON_AMOUNT);
        stringMap.put("CPN", COUPON_AMOUNT);
        stringMap.put("IACPN", INCREMENTAL_ACCRUED_COUPON);
        stringMap.put("CMTM", COLLATERALIZED_MARK_TO_MARKET);
        stringMap.put("ICMTM", INCREMENTAL_COLLATERALIZED_MARK_TO_MARKET);
        stringMap.put("DLV", COMPENSATION_AMOUNT);
        stringMap.put("BANK", TOTAL_BANKED_AMOUNT);
        stringMap.put("COLAT", TOTAL_COLLATERALIZED_AMOUNT);
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
        case "CASH": return CASH_AMOUNT;
        case "CRES": return CASH_RESIDUAL_AMOUNT;
        case "FMTM": return FINAL_MARK_TO_MARKET_AMOUNT;
        case "IMTM": return INCREMENTAL_MARK_TO_MARKET_AMOUNT;
        case "PREM": return PREMIUM_AMOUNT;
        case "SMTM": return START_OF_DAY_MARK_TO_MARKET_AMOUNT;
        case "TVAR": return TRADE_VARIATION_AMOUNT;
        case "VADJ": return VALUE_ADJUSTED_AMOUNT;
        case "SETL": return SETTLEMENT_VALUE;
        case "ICPN": return INITIAL_TRADE_COUPON_AMOUNT;
        case "ACPN": return ACCRUED_COUPON_AMOUNT;
        case "CPN": return COUPON_AMOUNT;
        case "IACPN": return INCREMENTAL_ACCRUED_COUPON;
        case "CMTM": return COLLATERALIZED_MARK_TO_MARKET;
        case "ICMTM": return INCREMENTAL_COLLATERALIZED_MARK_TO_MARKET;
        case "DLV": return COMPENSATION_AMOUNT;
        case "BANK": return TOTAL_BANKED_AMOUNT;
        case "COLAT": return TOTAL_COLLATERALIZED_AMOUNT;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
