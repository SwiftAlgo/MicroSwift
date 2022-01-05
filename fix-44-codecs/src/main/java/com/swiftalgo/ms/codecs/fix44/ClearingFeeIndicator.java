/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.StringRepresentable;
public enum ClearingFeeIndicator implements StringRepresentable
{
    CBOE_MEMBER("B"),
    NON_MEMBER_AND_CUSTOMER("C"),
    EQUITY_MEMBER_AND_CLEARING_MEMBER("E"),
    FULL_AND_ASSOCIATE_MEMBER_TRADING_FOR_OWN_ACCOUNT_AND_AS_FLOOR_BROKERS("F"),
    FIRMS_106H_AND_106J("H"),
    GIM_IDEM_AND_COM_MEMBERSHIP_INTEREST_HOLDERS("I"),
    LESSEE_AND_106F_EMPLOYEES("L"),
    ALL_OTHER_OWNERSHIP_TYPES("M"),
    NULL_VAL(""),
    ARTIO_UNKNOWN("");

    private final String representation;

    ClearingFeeIndicator(final String representation)
    {
         this.representation = representation;
    }

    public final String representation() { return representation; }

    private static final CharArrayMap<ClearingFeeIndicator> charMap;
    static
    {
        final Map<String, ClearingFeeIndicator> stringMap = new HashMap<>();
        stringMap.put("B", CBOE_MEMBER);
        stringMap.put("C", NON_MEMBER_AND_CUSTOMER);
        stringMap.put("E", EQUITY_MEMBER_AND_CLEARING_MEMBER);
        stringMap.put("F", FULL_AND_ASSOCIATE_MEMBER_TRADING_FOR_OWN_ACCOUNT_AND_AS_FLOOR_BROKERS);
        stringMap.put("H", FIRMS_106H_AND_106J);
        stringMap.put("I", GIM_IDEM_AND_COM_MEMBERSHIP_INTEREST_HOLDERS);
        stringMap.put("L", LESSEE_AND_106F_EMPLOYEES);
        stringMap.put("M", ALL_OTHER_OWNERSHIP_TYPES);
        charMap = new CharArrayMap<>(stringMap);
    }

    public static ClearingFeeIndicator decode(final CharArrayWrapper key)
    {
        final ClearingFeeIndicator value = charMap.get(key);
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
    public static ClearingFeeIndicator decode(final String representation)
    {
        switch(representation)
        {
        case "B": return CBOE_MEMBER;
        case "C": return NON_MEMBER_AND_CUSTOMER;
        case "E": return EQUITY_MEMBER_AND_CLEARING_MEMBER;
        case "F": return FULL_AND_ASSOCIATE_MEMBER_TRADING_FOR_OWN_ACCOUNT_AND_AS_FLOOR_BROKERS;
        case "H": return FIRMS_106H_AND_106J;
        case "I": return GIM_IDEM_AND_COM_MEMBERSHIP_INTEREST_HOLDERS;
        case "L": return LESSEE_AND_106F_EMPLOYEES;
        case "M": return ALL_OTHER_OWNERSHIP_TYPES;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
