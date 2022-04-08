/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.StringRepresentable;
public enum TradingSessionSubID implements StringRepresentable
{
    PRE_TRADING("1"),
    OPENING_OR_OPENING_AUCTION("2"),
    TRADING("3"),
    CLOSING_OR_CLOSING_AUCTION("4"),
    POST_TRADING("5"),
    INTRADAY_AUCTION("6"),
    QUIESCENT("7"),
    NULL_VAL(""),
    ARTIO_UNKNOWN("");

    private final String representation;

    TradingSessionSubID(final String representation)
    {
         this.representation = representation;
    }

    public final String representation() { return representation; }

    private static final CharArrayMap<TradingSessionSubID> charMap;
    static
    {
        final Map<String, TradingSessionSubID> stringMap = new HashMap<>();
        stringMap.put("1", PRE_TRADING);
        stringMap.put("2", OPENING_OR_OPENING_AUCTION);
        stringMap.put("3", TRADING);
        stringMap.put("4", CLOSING_OR_CLOSING_AUCTION);
        stringMap.put("5", POST_TRADING);
        stringMap.put("6", INTRADAY_AUCTION);
        stringMap.put("7", QUIESCENT);
        charMap = new CharArrayMap<>(stringMap);
    }

    public static TradingSessionSubID decode(final CharArrayWrapper key)
    {
        final TradingSessionSubID value = charMap.get(key);
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
    public static TradingSessionSubID decode(final String representation)
    {
        switch(representation)
        {
        case "1": return PRE_TRADING;
        case "2": return OPENING_OR_OPENING_AUCTION;
        case "3": return TRADING;
        case "4": return CLOSING_OR_CLOSING_AUCTION;
        case "5": return POST_TRADING;
        case "6": return INTRADAY_AUCTION;
        case "7": return QUIESCENT;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
