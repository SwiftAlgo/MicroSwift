/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.StringRepresentable;
public enum SecurityStatus implements StringRepresentable
{
    ACTIVE("1"),
    INACTIVE("2"),
    NULL_VAL(""),
    ARTIO_UNKNOWN("");

    private final String representation;

    SecurityStatus(final String representation)
    {
         this.representation = representation;
    }

    public final String representation() { return representation; }

    private static final CharArrayMap<SecurityStatus> charMap;
    static
    {
        final Map<String, SecurityStatus> stringMap = new HashMap<>();
        stringMap.put("1", ACTIVE);
        stringMap.put("2", INACTIVE);
        charMap = new CharArrayMap<>(stringMap);
    }

    public static SecurityStatus decode(final CharArrayWrapper key)
    {
        final SecurityStatus value = charMap.get(key);
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
    public static SecurityStatus decode(final String representation)
    {
        switch(representation)
        {
        case "1": return ACTIVE;
        case "2": return INACTIVE;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
