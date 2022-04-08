/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.StringRepresentable;
public enum AdvTransType implements StringRepresentable
{
    NEW("N"),
    CANCEL("C"),
    REPLACE("R"),
    NULL_VAL(""),
    ARTIO_UNKNOWN("");

    private final String representation;

    AdvTransType(final String representation)
    {
         this.representation = representation;
    }

    public final String representation() { return representation; }

    private static final CharArrayMap<AdvTransType> charMap;
    static
    {
        final Map<String, AdvTransType> stringMap = new HashMap<>();
        stringMap.put("N", NEW);
        stringMap.put("C", CANCEL);
        stringMap.put("R", REPLACE);
        charMap = new CharArrayMap<>(stringMap);
    }

    public static AdvTransType decode(final CharArrayWrapper key)
    {
        final AdvTransType value = charMap.get(key);
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
    public static AdvTransType decode(final String representation)
    {
        switch(representation)
        {
        case "N": return NEW;
        case "C": return CANCEL;
        case "R": return REPLACE;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
