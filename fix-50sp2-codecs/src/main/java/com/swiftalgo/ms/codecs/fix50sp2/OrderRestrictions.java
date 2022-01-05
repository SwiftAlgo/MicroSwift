/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.StringRepresentable;
public enum OrderRestrictions implements StringRepresentable
{
    PROGRAM_TRADE("1"),
    INDEX_ARBITRAGE("2"),
    NON_INDEX_ARBITRAGE("3"),
    COMPETING_MARKET_MAKER("4"),
    ACTING_AS_MARKET_MAKER_OR_SPECIALIST_IN_THE_SECURITY("5"),
    ACTING_AS_MARKET_MAKER_OR_SPECIALIST_IN_THE_UNDERLYING_SECURITY_OF_A_DERIVATIVE_SECURITY("6"),
    FOREIGN_ENTITY("7"),
    EXTERNAL_MARKET_PARTICIPANT("8"),
    EXTERNAL_INTER_CONNECTED_MARKET_LINKAGE("9"),
    RISKLESS_ARBITRAGE("A"),
    ISSUER_HOLDING("B"),
    ISSUE_PRICE_STABILIZATION("C"),
    NON_ALGORITHMIC("D"),
    ALGORITHMIC("E"),
    CROSS("F"),
    NULL_VAL(""),
    ARTIO_UNKNOWN("");

    private final String representation;

    OrderRestrictions(final String representation)
    {
         this.representation = representation;
    }

    public final String representation() { return representation; }

    private static final CharArrayMap<OrderRestrictions> charMap;
    static
    {
        final Map<String, OrderRestrictions> stringMap = new HashMap<>();
        stringMap.put("1", PROGRAM_TRADE);
        stringMap.put("2", INDEX_ARBITRAGE);
        stringMap.put("3", NON_INDEX_ARBITRAGE);
        stringMap.put("4", COMPETING_MARKET_MAKER);
        stringMap.put("5", ACTING_AS_MARKET_MAKER_OR_SPECIALIST_IN_THE_SECURITY);
        stringMap.put("6", ACTING_AS_MARKET_MAKER_OR_SPECIALIST_IN_THE_UNDERLYING_SECURITY_OF_A_DERIVATIVE_SECURITY);
        stringMap.put("7", FOREIGN_ENTITY);
        stringMap.put("8", EXTERNAL_MARKET_PARTICIPANT);
        stringMap.put("9", EXTERNAL_INTER_CONNECTED_MARKET_LINKAGE);
        stringMap.put("A", RISKLESS_ARBITRAGE);
        stringMap.put("B", ISSUER_HOLDING);
        stringMap.put("C", ISSUE_PRICE_STABILIZATION);
        stringMap.put("D", NON_ALGORITHMIC);
        stringMap.put("E", ALGORITHMIC);
        stringMap.put("F", CROSS);
        charMap = new CharArrayMap<>(stringMap);
    }

    public static OrderRestrictions decode(final CharArrayWrapper key)
    {
        final OrderRestrictions value = charMap.get(key);
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
    public static OrderRestrictions decode(final String representation)
    {
        switch(representation)
        {
        case "1": return PROGRAM_TRADE;
        case "2": return INDEX_ARBITRAGE;
        case "3": return NON_INDEX_ARBITRAGE;
        case "4": return COMPETING_MARKET_MAKER;
        case "5": return ACTING_AS_MARKET_MAKER_OR_SPECIALIST_IN_THE_SECURITY;
        case "6": return ACTING_AS_MARKET_MAKER_OR_SPECIALIST_IN_THE_UNDERLYING_SECURITY_OF_A_DERIVATIVE_SECURITY;
        case "7": return FOREIGN_ENTITY;
        case "8": return EXTERNAL_MARKET_PARTICIPANT;
        case "9": return EXTERNAL_INTER_CONNECTED_MARKET_LINKAGE;
        case "A": return RISKLESS_ARBITRAGE;
        case "B": return ISSUER_HOLDING;
        case "C": return ISSUE_PRICE_STABILIZATION;
        case "D": return NON_ALGORITHMIC;
        case "E": return ALGORITHMIC;
        case "F": return CROSS;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
