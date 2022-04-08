/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.StringRepresentable;
public enum SettlSessID implements StringRepresentable
{
    INTRADAY("ITD"),
    REGULAR_TRADING_HOURS("RTH"),
    ELECTRONIC_TRADING_HOURS("ETH"),
    END_OF_DAY("EOD"),
    NULL_VAL(""),
    ARTIO_UNKNOWN("");

    private final String representation;

    SettlSessID(final String representation)
    {
         this.representation = representation;
    }

    public final String representation() { return representation; }

    private static final CharArrayMap<SettlSessID> charMap;
    static
    {
        final Map<String, SettlSessID> stringMap = new HashMap<>();
        stringMap.put("ITD", INTRADAY);
        stringMap.put("RTH", REGULAR_TRADING_HOURS);
        stringMap.put("ETH", ELECTRONIC_TRADING_HOURS);
        stringMap.put("EOD", END_OF_DAY);
        charMap = new CharArrayMap<>(stringMap);
    }

    public static SettlSessID decode(final CharArrayWrapper key)
    {
        final SettlSessID value = charMap.get(key);
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
    public static SettlSessID decode(final String representation)
    {
        switch(representation)
        {
        case "ITD": return INTRADAY;
        case "RTH": return REGULAR_TRADING_HOURS;
        case "ETH": return ELECTRONIC_TRADING_HOURS;
        case "EOD": return END_OF_DAY;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
