/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.StringRepresentable;
public enum IOIQty implements StringRepresentable
{
    SMALL("S"),
    MEDIUM("M"),
    LARGE("L"),
    UNDISCLOSED_QUANTITY("U"),
    NULL_VAL(""),
    ARTIO_UNKNOWN("");

    private final String representation;

    IOIQty(final String representation)
    {
         this.representation = representation;
    }

    public final String representation() { return representation; }

    private static final CharArrayMap<IOIQty> charMap;
    static
    {
        final Map<String, IOIQty> stringMap = new HashMap<>();
        stringMap.put("S", SMALL);
        stringMap.put("M", MEDIUM);
        stringMap.put("L", LARGE);
        stringMap.put("U", UNDISCLOSED_QUANTITY);
        charMap = new CharArrayMap<>(stringMap);
    }

    public static IOIQty decode(final CharArrayWrapper key)
    {
        final IOIQty value = charMap.get(key);
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
    public static IOIQty decode(final String representation)
    {
        switch(representation)
        {
        case "S": return SMALL;
        case "M": return MEDIUM;
        case "L": return LARGE;
        case "U": return UNDISCLOSED_QUANTITY;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
