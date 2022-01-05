/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.StringRepresentable;
public enum QuoteCondition implements StringRepresentable
{
    OPEN_ACTIVE("A"),
    CLOSED_INACTIVE("B"),
    EXCHANGE_BEST("C"),
    CONSOLIDATED_BEST("D"),
    LOCKED("E"),
    CROSSED("F"),
    DEPTH("G"),
    FAST_TRADING("H"),
    NON_FIRM("I"),
    NULL_VAL(""),
    ARTIO_UNKNOWN("");

    private final String representation;

    QuoteCondition(final String representation)
    {
         this.representation = representation;
    }

    public final String representation() { return representation; }

    private static final CharArrayMap<QuoteCondition> charMap;
    static
    {
        final Map<String, QuoteCondition> stringMap = new HashMap<>();
        stringMap.put("A", OPEN_ACTIVE);
        stringMap.put("B", CLOSED_INACTIVE);
        stringMap.put("C", EXCHANGE_BEST);
        stringMap.put("D", CONSOLIDATED_BEST);
        stringMap.put("E", LOCKED);
        stringMap.put("F", CROSSED);
        stringMap.put("G", DEPTH);
        stringMap.put("H", FAST_TRADING);
        stringMap.put("I", NON_FIRM);
        charMap = new CharArrayMap<>(stringMap);
    }

    public static QuoteCondition decode(final CharArrayWrapper key)
    {
        final QuoteCondition value = charMap.get(key);
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
    public static QuoteCondition decode(final String representation)
    {
        switch(representation)
        {
        case "A": return OPEN_ACTIVE;
        case "B": return CLOSED_INACTIVE;
        case "C": return EXCHANGE_BEST;
        case "D": return CONSOLIDATED_BEST;
        case "E": return LOCKED;
        case "F": return CROSSED;
        case "G": return DEPTH;
        case "H": return FAST_TRADING;
        case "I": return NON_FIRM;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
