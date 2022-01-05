/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.StringRepresentable;
public enum MassCancelRejectReason implements StringRepresentable
{
    MASS_CANCEL_NOT_SUPPORTED("0"),
    INVALID_OR_UNKNOWN_SECURITY("1"),
    INVALID_OR_UNKNOWN_UNDERLYING("2"),
    INVALID_OR_UNKNOWN_PRODUCT("3"),
    INVALID_OR_UNKNOWN_CFICODE("4"),
    INVALID_OR_UNKNOWN_SECURITY_TYPE("5"),
    INVALID_OR_UNKNOWN_TRADING_SESSION("6"),
    OTHER("99"),
    NULL_VAL(""),
    ARTIO_UNKNOWN("");

    private final String representation;

    MassCancelRejectReason(final String representation)
    {
         this.representation = representation;
    }

    public final String representation() { return representation; }

    private static final CharArrayMap<MassCancelRejectReason> charMap;
    static
    {
        final Map<String, MassCancelRejectReason> stringMap = new HashMap<>();
        stringMap.put("0", MASS_CANCEL_NOT_SUPPORTED);
        stringMap.put("1", INVALID_OR_UNKNOWN_SECURITY);
        stringMap.put("2", INVALID_OR_UNKNOWN_UNDERLYING);
        stringMap.put("3", INVALID_OR_UNKNOWN_PRODUCT);
        stringMap.put("4", INVALID_OR_UNKNOWN_CFICODE);
        stringMap.put("5", INVALID_OR_UNKNOWN_SECURITY_TYPE);
        stringMap.put("6", INVALID_OR_UNKNOWN_TRADING_SESSION);
        stringMap.put("99", OTHER);
        charMap = new CharArrayMap<>(stringMap);
    }

    public static MassCancelRejectReason decode(final CharArrayWrapper key)
    {
        final MassCancelRejectReason value = charMap.get(key);
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
    public static MassCancelRejectReason decode(final String representation)
    {
        switch(representation)
        {
        case "0": return MASS_CANCEL_NOT_SUPPORTED;
        case "1": return INVALID_OR_UNKNOWN_SECURITY;
        case "2": return INVALID_OR_UNKNOWN_UNDERLYING;
        case "3": return INVALID_OR_UNKNOWN_PRODUCT;
        case "4": return INVALID_OR_UNKNOWN_CFICODE;
        case "5": return INVALID_OR_UNKNOWN_SECURITY_TYPE;
        case "6": return INVALID_OR_UNKNOWN_TRADING_SESSION;
        case "99": return OTHER;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
