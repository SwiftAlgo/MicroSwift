/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.StringRepresentable;
public enum ClearingFeeIndicator implements StringRepresentable
{
    _1ST_YEAR_DELEGATE_TRADING_FOR_OWN_ACCOUNT("1"),
    _2ND_YEAR_DELEGATE_TRADING_FOR_OWN_ACCOUNT("2"),
    _3RD_YEAR_DELEGATE_TRADING_FOR_OWN_ACCOUNT("3"),
    _4TH_YEAR_DELEGATE_TRADING_FOR_OWN_ACCOUNT("4"),
    _5TH_YEAR_DELEGATE_TRADING_FOR_OWN_ACCOUNT("5"),
    _6TH_YEAR_DELEGATE_TRADING_FOR_OWN_ACCOUNT("9"),
    CBOE_MEMBER("B"),
    NON_MEMBER_AND_CUSTOMER("C"),
    EQUITY_MEMBER_AND_CLEARING_MEMBER("E"),
    FULL_AND_ASSOCIATE_MEMBER_TRADING_FOR_OWN_ACCOUNT_AND_AS_FLOOR_BROKERS("F"),
    _106_H_AND_106_J_FIRMS("H"),
    GIM_IDEM_AND_COM_MEMBERSHIP_INTEREST_HOLDERS("I"),
    LESSEE_106_F_EMPLOYEES("L"),
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
        stringMap.put("1", _1ST_YEAR_DELEGATE_TRADING_FOR_OWN_ACCOUNT);
        stringMap.put("2", _2ND_YEAR_DELEGATE_TRADING_FOR_OWN_ACCOUNT);
        stringMap.put("3", _3RD_YEAR_DELEGATE_TRADING_FOR_OWN_ACCOUNT);
        stringMap.put("4", _4TH_YEAR_DELEGATE_TRADING_FOR_OWN_ACCOUNT);
        stringMap.put("5", _5TH_YEAR_DELEGATE_TRADING_FOR_OWN_ACCOUNT);
        stringMap.put("9", _6TH_YEAR_DELEGATE_TRADING_FOR_OWN_ACCOUNT);
        stringMap.put("B", CBOE_MEMBER);
        stringMap.put("C", NON_MEMBER_AND_CUSTOMER);
        stringMap.put("E", EQUITY_MEMBER_AND_CLEARING_MEMBER);
        stringMap.put("F", FULL_AND_ASSOCIATE_MEMBER_TRADING_FOR_OWN_ACCOUNT_AND_AS_FLOOR_BROKERS);
        stringMap.put("H", _106_H_AND_106_J_FIRMS);
        stringMap.put("I", GIM_IDEM_AND_COM_MEMBERSHIP_INTEREST_HOLDERS);
        stringMap.put("L", LESSEE_106_F_EMPLOYEES);
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
        case "1": return _1ST_YEAR_DELEGATE_TRADING_FOR_OWN_ACCOUNT;
        case "2": return _2ND_YEAR_DELEGATE_TRADING_FOR_OWN_ACCOUNT;
        case "3": return _3RD_YEAR_DELEGATE_TRADING_FOR_OWN_ACCOUNT;
        case "4": return _4TH_YEAR_DELEGATE_TRADING_FOR_OWN_ACCOUNT;
        case "5": return _5TH_YEAR_DELEGATE_TRADING_FOR_OWN_ACCOUNT;
        case "9": return _6TH_YEAR_DELEGATE_TRADING_FOR_OWN_ACCOUNT;
        case "B": return CBOE_MEMBER;
        case "C": return NON_MEMBER_AND_CUSTOMER;
        case "E": return EQUITY_MEMBER_AND_CLEARING_MEMBER;
        case "F": return FULL_AND_ASSOCIATE_MEMBER_TRADING_FOR_OWN_ACCOUNT_AND_AS_FLOOR_BROKERS;
        case "H": return _106_H_AND_106_J_FIRMS;
        case "I": return GIM_IDEM_AND_COM_MEMBERSHIP_INTEREST_HOLDERS;
        case "L": return LESSEE_106_F_EMPLOYEES;
        case "M": return ALL_OTHER_OWNERSHIP_TYPES;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
