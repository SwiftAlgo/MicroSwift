/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.StringRepresentable;
public enum TimeUnit implements StringRepresentable
{
    HOUR("H"),
    MINUTE("Min"),
    SECOND("S"),
    DAY("D"),
    WEEK("Wk"),
    MONTH("Mo"),
    YEAR("Yr"),
    NULL_VAL(""),
    ARTIO_UNKNOWN("");

    private final String representation;

    TimeUnit(final String representation)
    {
         this.representation = representation;
    }

    public final String representation() { return representation; }

    private static final CharArrayMap<TimeUnit> charMap;
    static
    {
        final Map<String, TimeUnit> stringMap = new HashMap<>();
        stringMap.put("H", HOUR);
        stringMap.put("Min", MINUTE);
        stringMap.put("S", SECOND);
        stringMap.put("D", DAY);
        stringMap.put("Wk", WEEK);
        stringMap.put("Mo", MONTH);
        stringMap.put("Yr", YEAR);
        charMap = new CharArrayMap<>(stringMap);
    }

    public static TimeUnit decode(final CharArrayWrapper key)
    {
        final TimeUnit value = charMap.get(key);
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
    public static TimeUnit decode(final String representation)
    {
        switch(representation)
        {
        case "H": return HOUR;
        case "Min": return MINUTE;
        case "S": return SECOND;
        case "D": return DAY;
        case "Wk": return WEEK;
        case "Mo": return MONTH;
        case "Yr": return YEAR;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
