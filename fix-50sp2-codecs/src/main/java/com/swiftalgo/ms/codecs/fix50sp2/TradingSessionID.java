/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.StringRepresentable;
public enum TradingSessionID implements StringRepresentable
{
    DAY("1"),
    HALFDAY("2"),
    MORNING("3"),
    AFTERNOON("4"),
    EVENING("5"),
    AFTER_HOURS("6"),
    NULL_VAL(""),
    ARTIO_UNKNOWN("");

    private final String representation;

    TradingSessionID(final String representation)
    {
         this.representation = representation;
    }

    public final String representation() { return representation; }

    private static final CharArrayMap<TradingSessionID> charMap;
    static
    {
        final Map<String, TradingSessionID> stringMap = new HashMap<>();
        stringMap.put("1", DAY);
        stringMap.put("2", HALFDAY);
        stringMap.put("3", MORNING);
        stringMap.put("4", AFTERNOON);
        stringMap.put("5", EVENING);
        stringMap.put("6", AFTER_HOURS);
        charMap = new CharArrayMap<>(stringMap);
    }

    public static TradingSessionID decode(final CharArrayWrapper key)
    {
        final TradingSessionID value = charMap.get(key);
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
    public static TradingSessionID decode(final String representation)
    {
        switch(representation)
        {
        case "1": return DAY;
        case "2": return HALFDAY;
        case "3": return MORNING;
        case "4": return AFTERNOON;
        case "5": return EVENING;
        case "6": return AFTER_HOURS;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
