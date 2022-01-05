/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.StringRepresentable;
public enum RestructuringType implements StringRepresentable
{
    FULL_RESTRUCTURING("FR"),
    MODIFIED_RESTRUCTURING("MR"),
    MODIFIED_MOD_RESTRUCTURING("MM"),
    NO_RESTRUCTURING_SPECIFIED("XR"),
    NULL_VAL(""),
    ARTIO_UNKNOWN("");

    private final String representation;

    RestructuringType(final String representation)
    {
         this.representation = representation;
    }

    public final String representation() { return representation; }

    private static final CharArrayMap<RestructuringType> charMap;
    static
    {
        final Map<String, RestructuringType> stringMap = new HashMap<>();
        stringMap.put("FR", FULL_RESTRUCTURING);
        stringMap.put("MR", MODIFIED_RESTRUCTURING);
        stringMap.put("MM", MODIFIED_MOD_RESTRUCTURING);
        stringMap.put("XR", NO_RESTRUCTURING_SPECIFIED);
        charMap = new CharArrayMap<>(stringMap);
    }

    public static RestructuringType decode(final CharArrayWrapper key)
    {
        final RestructuringType value = charMap.get(key);
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
    public static RestructuringType decode(final String representation)
    {
        switch(representation)
        {
        case "FR": return FULL_RESTRUCTURING;
        case "MR": return MODIFIED_RESTRUCTURING;
        case "MM": return MODIFIED_MOD_RESTRUCTURING;
        case "XR": return NO_RESTRUCTURING_SPECIFIED;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
