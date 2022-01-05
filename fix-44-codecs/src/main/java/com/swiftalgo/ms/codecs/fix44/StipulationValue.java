/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.StringRepresentable;
public enum StipulationValue implements StringRepresentable
{
    SPECIAL_CUM_DIVIDEND("CD"),
    SPECIAL_EX_DIVIDEND("XD"),
    SPECIAL_CUM_COUPON("CC"),
    SPECIAL_EX_COUPON("XC"),
    SPECIAL_CUM_BONUS("CB"),
    SPECIAL_EX_BONUS("XB"),
    SPECIAL_CUM_RIGHTS("CR"),
    SPECIAL_EX_RIGHTS("XR"),
    SPECIAL_CUM_CAPITAL_REPAYMENTS("CP"),
    SPECIAL_EX_CAPITAL_REPAYMENTS("XP"),
    CASH_SETTLEMENT("CS"),
    SPECIAL_PRICE("SP"),
    REPORT_FOR_EUROPEAN_EQUITY_MARKET_SECURITIES("TR"),
    GUARANTEED_DELIVERY("GD"),
    NULL_VAL(""),
    ARTIO_UNKNOWN("");

    private final String representation;

    StipulationValue(final String representation)
    {
         this.representation = representation;
    }

    public final String representation() { return representation; }

    private static final CharArrayMap<StipulationValue> charMap;
    static
    {
        final Map<String, StipulationValue> stringMap = new HashMap<>();
        stringMap.put("CD", SPECIAL_CUM_DIVIDEND);
        stringMap.put("XD", SPECIAL_EX_DIVIDEND);
        stringMap.put("CC", SPECIAL_CUM_COUPON);
        stringMap.put("XC", SPECIAL_EX_COUPON);
        stringMap.put("CB", SPECIAL_CUM_BONUS);
        stringMap.put("XB", SPECIAL_EX_BONUS);
        stringMap.put("CR", SPECIAL_CUM_RIGHTS);
        stringMap.put("XR", SPECIAL_EX_RIGHTS);
        stringMap.put("CP", SPECIAL_CUM_CAPITAL_REPAYMENTS);
        stringMap.put("XP", SPECIAL_EX_CAPITAL_REPAYMENTS);
        stringMap.put("CS", CASH_SETTLEMENT);
        stringMap.put("SP", SPECIAL_PRICE);
        stringMap.put("TR", REPORT_FOR_EUROPEAN_EQUITY_MARKET_SECURITIES);
        stringMap.put("GD", GUARANTEED_DELIVERY);
        charMap = new CharArrayMap<>(stringMap);
    }

    public static StipulationValue decode(final CharArrayWrapper key)
    {
        final StipulationValue value = charMap.get(key);
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
    public static StipulationValue decode(final String representation)
    {
        switch(representation)
        {
        case "CD": return SPECIAL_CUM_DIVIDEND;
        case "XD": return SPECIAL_EX_DIVIDEND;
        case "CC": return SPECIAL_CUM_COUPON;
        case "XC": return SPECIAL_EX_COUPON;
        case "CB": return SPECIAL_CUM_BONUS;
        case "XB": return SPECIAL_EX_BONUS;
        case "CR": return SPECIAL_CUM_RIGHTS;
        case "XR": return SPECIAL_EX_RIGHTS;
        case "CP": return SPECIAL_CUM_CAPITAL_REPAYMENTS;
        case "XP": return SPECIAL_EX_CAPITAL_REPAYMENTS;
        case "CS": return CASH_SETTLEMENT;
        case "SP": return SPECIAL_PRICE;
        case "TR": return REPORT_FOR_EUROPEAN_EQUITY_MARKET_SECURITIES;
        case "GD": return GUARANTEED_DELIVERY;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
