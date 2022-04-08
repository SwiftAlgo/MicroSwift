/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.StringRepresentable;
public enum DeskOrderHandlingInst implements StringRepresentable
{
    ADD_ON_ORDER("ADD"),
    ALL_OR_NONE("AON"),
    CASH_NOT_HELD("CNH"),
    DIRECTED_ORDER("DIR"),
    EXCHANGE_FOR_PHYSICAL_TRANSACTION("E.W"),
    FILL_OR_KILL("FOK"),
    IMBALANCE_ONLY("IO"),
    IMMEDIATE_OR_CANCEL("IOC"),
    LIMIT_ON_OPEN("LOO"),
    LIMIT_ON_CLOSE("LOC"),
    MARKET_AT_OPEN("MAO"),
    MARKET_AT_CLOSE("MAC"),
    MARKET_ON_OPEN("MOO"),
    MARKET_ON_CLOSE("MOC"),
    MINIMUM_QUANTITY("MQT"),
    NOT_HELD("NH"),
    OVER_THE_DAY("OVD"),
    PEGGED("PEG"),
    RESERVE_SIZE_ORDER("RSV"),
    STOP_STOCK_TRANSACTION("S.W"),
    SCALE("SCL"),
    TIME_ORDER("TMO"),
    TRAILING_STOP("TS"),
    WORK("WRK"),
    NULL_VAL(""),
    ARTIO_UNKNOWN("");

    private final String representation;

    DeskOrderHandlingInst(final String representation)
    {
         this.representation = representation;
    }

    public final String representation() { return representation; }

    private static final CharArrayMap<DeskOrderHandlingInst> charMap;
    static
    {
        final Map<String, DeskOrderHandlingInst> stringMap = new HashMap<>();
        stringMap.put("ADD", ADD_ON_ORDER);
        stringMap.put("AON", ALL_OR_NONE);
        stringMap.put("CNH", CASH_NOT_HELD);
        stringMap.put("DIR", DIRECTED_ORDER);
        stringMap.put("E.W", EXCHANGE_FOR_PHYSICAL_TRANSACTION);
        stringMap.put("FOK", FILL_OR_KILL);
        stringMap.put("IO", IMBALANCE_ONLY);
        stringMap.put("IOC", IMMEDIATE_OR_CANCEL);
        stringMap.put("LOO", LIMIT_ON_OPEN);
        stringMap.put("LOC", LIMIT_ON_CLOSE);
        stringMap.put("MAO", MARKET_AT_OPEN);
        stringMap.put("MAC", MARKET_AT_CLOSE);
        stringMap.put("MOO", MARKET_ON_OPEN);
        stringMap.put("MOC", MARKET_ON_CLOSE);
        stringMap.put("MQT", MINIMUM_QUANTITY);
        stringMap.put("NH", NOT_HELD);
        stringMap.put("OVD", OVER_THE_DAY);
        stringMap.put("PEG", PEGGED);
        stringMap.put("RSV", RESERVE_SIZE_ORDER);
        stringMap.put("S.W", STOP_STOCK_TRANSACTION);
        stringMap.put("SCL", SCALE);
        stringMap.put("TMO", TIME_ORDER);
        stringMap.put("TS", TRAILING_STOP);
        stringMap.put("WRK", WORK);
        charMap = new CharArrayMap<>(stringMap);
    }

    public static DeskOrderHandlingInst decode(final CharArrayWrapper key)
    {
        final DeskOrderHandlingInst value = charMap.get(key);
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
    public static DeskOrderHandlingInst decode(final String representation)
    {
        switch(representation)
        {
        case "ADD": return ADD_ON_ORDER;
        case "AON": return ALL_OR_NONE;
        case "CNH": return CASH_NOT_HELD;
        case "DIR": return DIRECTED_ORDER;
        case "E.W": return EXCHANGE_FOR_PHYSICAL_TRANSACTION;
        case "FOK": return FILL_OR_KILL;
        case "IO": return IMBALANCE_ONLY;
        case "IOC": return IMMEDIATE_OR_CANCEL;
        case "LOO": return LIMIT_ON_OPEN;
        case "LOC": return LIMIT_ON_CLOSE;
        case "MAO": return MARKET_AT_OPEN;
        case "MAC": return MARKET_AT_CLOSE;
        case "MOO": return MARKET_ON_OPEN;
        case "MOC": return MARKET_ON_CLOSE;
        case "MQT": return MINIMUM_QUANTITY;
        case "NH": return NOT_HELD;
        case "OVD": return OVER_THE_DAY;
        case "PEG": return PEGGED;
        case "RSV": return RESERVE_SIZE_ORDER;
        case "S.W": return STOP_STOCK_TRANSACTION;
        case "SCL": return SCALE;
        case "TMO": return TIME_ORDER;
        case "TS": return TRAILING_STOP;
        case "WRK": return WORK;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
