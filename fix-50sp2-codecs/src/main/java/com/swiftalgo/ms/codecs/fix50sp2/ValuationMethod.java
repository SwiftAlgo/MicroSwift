/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.StringRepresentable;
public enum ValuationMethod implements StringRepresentable
{
    PREMIUM_STYLE("EQTY"),
    FUTURES_STYLE_MARK_TO_MARKET("FUT"),
    FUTURES_STYLE_WITH_AN_ATTACHED_CASH_ADJUSTMENT("FUTDA"),
    CDS_STYLE_COLLATERALIZATION_OF_MARKET_TO_MARKET_AND_COUPON("CDS"),
    CDS_IN_DELIVERY_USE_RECOVERY_RATE_TO_CALCULATE_OBLIGATION("CDSD"),
    NULL_VAL(""),
    ARTIO_UNKNOWN("");

    private final String representation;

    ValuationMethod(final String representation)
    {
         this.representation = representation;
    }

    public final String representation() { return representation; }

    private static final CharArrayMap<ValuationMethod> charMap;
    static
    {
        final Map<String, ValuationMethod> stringMap = new HashMap<>();
        stringMap.put("EQTY", PREMIUM_STYLE);
        stringMap.put("FUT", FUTURES_STYLE_MARK_TO_MARKET);
        stringMap.put("FUTDA", FUTURES_STYLE_WITH_AN_ATTACHED_CASH_ADJUSTMENT);
        stringMap.put("CDS", CDS_STYLE_COLLATERALIZATION_OF_MARKET_TO_MARKET_AND_COUPON);
        stringMap.put("CDSD", CDS_IN_DELIVERY_USE_RECOVERY_RATE_TO_CALCULATE_OBLIGATION);
        charMap = new CharArrayMap<>(stringMap);
    }

    public static ValuationMethod decode(final CharArrayWrapper key)
    {
        final ValuationMethod value = charMap.get(key);
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
    public static ValuationMethod decode(final String representation)
    {
        switch(representation)
        {
        case "EQTY": return PREMIUM_STYLE;
        case "FUT": return FUTURES_STYLE_MARK_TO_MARKET;
        case "FUTDA": return FUTURES_STYLE_WITH_AN_ATTACHED_CASH_ADJUSTMENT;
        case "CDS": return CDS_STYLE_COLLATERALIZATION_OF_MARKET_TO_MARKET_AND_COUPON;
        case "CDSD": return CDS_IN_DELIVERY_USE_RECOVERY_RATE_TO_CALCULATE_OBLIGATION;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
