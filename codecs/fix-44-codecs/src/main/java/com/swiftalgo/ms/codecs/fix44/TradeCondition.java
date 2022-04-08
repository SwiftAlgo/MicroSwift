/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.StringRepresentable;
public enum TradeCondition implements StringRepresentable
{
    CASH_MARKET("A"),
    AVERAGE_PRICE_TRADE("B"),
    CASH_TRADE("C"),
    NEXT_DAY_MARKET("D"),
    OPENING_REOPENING_TRADE_DETAIL("E"),
    INTRADAY_TRADE_DETAIL("F"),
    RULE127("G"),
    RULE155("H"),
    SOLD_LAST("I"),
    NEXT_DAY_TRADE("J"),
    OPENED("K"),
    SELLER("L"),
    SOLD("M"),
    STOPPED_STOCK("N"),
    IMBALANCE_MORE_BUYERS("P"),
    IMBALANCE_MORE_SELLERS("Q"),
    OPENING_PRICE("R"),
    NULL_VAL(""),
    ARTIO_UNKNOWN("");

    private final String representation;

    TradeCondition(final String representation)
    {
         this.representation = representation;
    }

    public final String representation() { return representation; }

    private static final CharArrayMap<TradeCondition> charMap;
    static
    {
        final Map<String, TradeCondition> stringMap = new HashMap<>();
        stringMap.put("A", CASH_MARKET);
        stringMap.put("B", AVERAGE_PRICE_TRADE);
        stringMap.put("C", CASH_TRADE);
        stringMap.put("D", NEXT_DAY_MARKET);
        stringMap.put("E", OPENING_REOPENING_TRADE_DETAIL);
        stringMap.put("F", INTRADAY_TRADE_DETAIL);
        stringMap.put("G", RULE127);
        stringMap.put("H", RULE155);
        stringMap.put("I", SOLD_LAST);
        stringMap.put("J", NEXT_DAY_TRADE);
        stringMap.put("K", OPENED);
        stringMap.put("L", SELLER);
        stringMap.put("M", SOLD);
        stringMap.put("N", STOPPED_STOCK);
        stringMap.put("P", IMBALANCE_MORE_BUYERS);
        stringMap.put("Q", IMBALANCE_MORE_SELLERS);
        stringMap.put("R", OPENING_PRICE);
        charMap = new CharArrayMap<>(stringMap);
    }

    public static TradeCondition decode(final CharArrayWrapper key)
    {
        final TradeCondition value = charMap.get(key);
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
    public static TradeCondition decode(final String representation)
    {
        switch(representation)
        {
        case "A": return CASH_MARKET;
        case "B": return AVERAGE_PRICE_TRADE;
        case "C": return CASH_TRADE;
        case "D": return NEXT_DAY_MARKET;
        case "E": return OPENING_REOPENING_TRADE_DETAIL;
        case "F": return INTRADAY_TRADE_DETAIL;
        case "G": return RULE127;
        case "H": return RULE155;
        case "I": return SOLD_LAST;
        case "J": return NEXT_DAY_TRADE;
        case "K": return OPENED;
        case "L": return SELLER;
        case "M": return SOLD;
        case "N": return STOPPED_STOCK;
        case "P": return IMBALANCE_MORE_BUYERS;
        case "Q": return IMBALANCE_MORE_SELLERS;
        case "R": return OPENING_PRICE;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
