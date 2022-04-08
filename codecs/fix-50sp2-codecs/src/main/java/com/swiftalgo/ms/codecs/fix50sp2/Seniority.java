/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.StringRepresentable;
public enum Seniority implements StringRepresentable
{
    SENIOR_SECURED("SD"),
    SENIOR("SR"),
    SUBORDINATED("SB"),
    NULL_VAL(""),
    ARTIO_UNKNOWN("");

    private final String representation;

    Seniority(final String representation)
    {
         this.representation = representation;
    }

    public final String representation() { return representation; }

    private static final CharArrayMap<Seniority> charMap;
    static
    {
        final Map<String, Seniority> stringMap = new HashMap<>();
        stringMap.put("SD", SENIOR_SECURED);
        stringMap.put("SR", SENIOR);
        stringMap.put("SB", SUBORDINATED);
        charMap = new CharArrayMap<>(stringMap);
    }

    public static Seniority decode(final CharArrayWrapper key)
    {
        final Seniority value = charMap.get(key);
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
    public static Seniority decode(final String representation)
    {
        switch(representation)
        {
        case "SD": return SENIOR_SECURED;
        case "SR": return SENIOR;
        case "SB": return SUBORDINATED;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
