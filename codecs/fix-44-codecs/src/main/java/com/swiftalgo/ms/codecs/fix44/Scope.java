/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.StringRepresentable;
public enum Scope implements StringRepresentable
{
    LOCAL("1"),
    NATIONAL("2"),
    GLOBAL("3"),
    NULL_VAL(""),
    ARTIO_UNKNOWN("");

    private final String representation;

    Scope(final String representation)
    {
         this.representation = representation;
    }

    public final String representation() { return representation; }

    private static final CharArrayMap<Scope> charMap;
    static
    {
        final Map<String, Scope> stringMap = new HashMap<>();
        stringMap.put("1", LOCAL);
        stringMap.put("2", NATIONAL);
        stringMap.put("3", GLOBAL);
        charMap = new CharArrayMap<>(stringMap);
    }

    public static Scope decode(final CharArrayWrapper key)
    {
        final Scope value = charMap.get(key);
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
    public static Scope decode(final String representation)
    {
        switch(representation)
        {
        case "1": return LOCAL;
        case "2": return NATIONAL;
        case "3": return GLOBAL;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
