/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.StringRepresentable;
public enum MiscFeeType implements StringRepresentable
{
    REGULATORY("1"),
    TAX("2"),
    LOCAL_COMMISSION("3"),
    EXCHANGE_FEES("4"),
    STAMP("5"),
    LEVY("6"),
    OTHER("7"),
    MARKUP("8"),
    CONSUMPTION_TAX("9"),
    PER_TRANSACTION("10"),
    CONVERSION("11"),
    AGENT("12"),
    TRANSFER_FEE("13"),
    SECURITY_LENDING("14"),
    NULL_VAL(""),
    ARTIO_UNKNOWN("");

    private final String representation;

    MiscFeeType(final String representation)
    {
         this.representation = representation;
    }

    public final String representation() { return representation; }

    private static final CharArrayMap<MiscFeeType> charMap;
    static
    {
        final Map<String, MiscFeeType> stringMap = new HashMap<>();
        stringMap.put("1", REGULATORY);
        stringMap.put("2", TAX);
        stringMap.put("3", LOCAL_COMMISSION);
        stringMap.put("4", EXCHANGE_FEES);
        stringMap.put("5", STAMP);
        stringMap.put("6", LEVY);
        stringMap.put("7", OTHER);
        stringMap.put("8", MARKUP);
        stringMap.put("9", CONSUMPTION_TAX);
        stringMap.put("10", PER_TRANSACTION);
        stringMap.put("11", CONVERSION);
        stringMap.put("12", AGENT);
        stringMap.put("13", TRANSFER_FEE);
        stringMap.put("14", SECURITY_LENDING);
        charMap = new CharArrayMap<>(stringMap);
    }

    public static MiscFeeType decode(final CharArrayWrapper key)
    {
        final MiscFeeType value = charMap.get(key);
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
    public static MiscFeeType decode(final String representation)
    {
        switch(representation)
        {
        case "1": return REGULATORY;
        case "2": return TAX;
        case "3": return LOCAL_COMMISSION;
        case "4": return EXCHANGE_FEES;
        case "5": return STAMP;
        case "6": return LEVY;
        case "7": return OTHER;
        case "8": return MARKUP;
        case "9": return CONSUMPTION_TAX;
        case "10": return PER_TRANSACTION;
        case "11": return CONVERSION;
        case "12": return AGENT;
        case "13": return TRANSFER_FEE;
        case "14": return SECURITY_LENDING;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
