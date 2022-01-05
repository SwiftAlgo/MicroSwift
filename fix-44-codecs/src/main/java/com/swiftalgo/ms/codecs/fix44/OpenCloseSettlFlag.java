/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.StringRepresentable;
public enum OpenCloseSettlFlag implements StringRepresentable
{
    DAILY_OPEN_CLOSE_SETTLEMENT_ENTRY("0"),
    SESSION_OPEN_CLOSE_SETTLEMENT_ENTRY("1"),
    DELIVERY_SETTLEMENT_ENTRY("2"),
    EXPECTED_ENTRY("3"),
    ENTRY_FROM_PREVIOUS_BUSINESS_DAY("4"),
    THEORETICAL_PRICE_VALUE("5"),
    NULL_VAL(""),
    ARTIO_UNKNOWN("");

    private final String representation;

    OpenCloseSettlFlag(final String representation)
    {
         this.representation = representation;
    }

    public final String representation() { return representation; }

    private static final CharArrayMap<OpenCloseSettlFlag> charMap;
    static
    {
        final Map<String, OpenCloseSettlFlag> stringMap = new HashMap<>();
        stringMap.put("0", DAILY_OPEN_CLOSE_SETTLEMENT_ENTRY);
        stringMap.put("1", SESSION_OPEN_CLOSE_SETTLEMENT_ENTRY);
        stringMap.put("2", DELIVERY_SETTLEMENT_ENTRY);
        stringMap.put("3", EXPECTED_ENTRY);
        stringMap.put("4", ENTRY_FROM_PREVIOUS_BUSINESS_DAY);
        stringMap.put("5", THEORETICAL_PRICE_VALUE);
        charMap = new CharArrayMap<>(stringMap);
    }

    public static OpenCloseSettlFlag decode(final CharArrayWrapper key)
    {
        final OpenCloseSettlFlag value = charMap.get(key);
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
    public static OpenCloseSettlFlag decode(final String representation)
    {
        switch(representation)
        {
        case "0": return DAILY_OPEN_CLOSE_SETTLEMENT_ENTRY;
        case "1": return SESSION_OPEN_CLOSE_SETTLEMENT_ENTRY;
        case "2": return DELIVERY_SETTLEMENT_ENTRY;
        case "3": return EXPECTED_ENTRY;
        case "4": return ENTRY_FROM_PREVIOUS_BUSINESS_DAY;
        case "5": return THEORETICAL_PRICE_VALUE;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
