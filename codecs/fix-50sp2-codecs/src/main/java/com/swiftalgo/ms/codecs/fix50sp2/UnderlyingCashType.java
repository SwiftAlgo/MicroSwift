/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.StringRepresentable;
public enum UnderlyingCashType implements StringRepresentable
{
    FIXED("FIXED"),
    DIFF("DIFF"),
    NULL_VAL(""),
    ARTIO_UNKNOWN("");

    private final String representation;

    UnderlyingCashType(final String representation)
    {
         this.representation = representation;
    }

    public final String representation() { return representation; }

    private static final CharArrayMap<UnderlyingCashType> charMap;
    static
    {
        final Map<String, UnderlyingCashType> stringMap = new HashMap<>();
        stringMap.put("FIXED", FIXED);
        stringMap.put("DIFF", DIFF);
        charMap = new CharArrayMap<>(stringMap);
    }

    public static UnderlyingCashType decode(final CharArrayWrapper key)
    {
        final UnderlyingCashType value = charMap.get(key);
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
    public static UnderlyingCashType decode(final String representation)
    {
        switch(representation)
        {
        case "FIXED": return FIXED;
        case "DIFF": return DIFF;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
