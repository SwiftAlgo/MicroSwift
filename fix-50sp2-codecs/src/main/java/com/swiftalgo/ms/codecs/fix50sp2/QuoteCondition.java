/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

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
    MANUAL_SLOW_QUOTE("L"),
    OUTRIGHT_PRICE("J"),
    IMPLIED_PRICE("K"),
    DEPTH_ON_OFFER("M"),
    DEPTH_ON_BID("N"),
    CLOSING("O"),
    NEWS_DISSEMINATION("P"),
    TRADING_RANGE("Q"),
    ORDER_INFLUX("R"),
    DUE_TO_RELATED("S"),
    NEWS_PENDING("T"),
    ADDITIONAL_INFO("U"),
    ADDITIONAL_INFO_DUE_TO_RELATED("V"),
    RESUME("W"),
    VIEW_OF_COMMON("X"),
    VOLUME_ALERT("Y"),
    ORDER_IMBALANCE("Z"),
    EQUIPMENT_CHANGEOVER("a"),
    NO_OPEN_NO_RESUME("b"),
    REGULAR_ETH("c"),
    AUTOMATIC_EXECUTION("d"),
    AUTOMATIC_EXECUTION_ETH("e"),
    FAST_MARKET_ETH("f"),
    INACTIVE_ETH("g"),
    ROTATION("h"),
    ROTATION_ETH("i"),
    HALT("j"),
    HALT_ETH("k"),
    DUE_TO_NEWS_DISSEMINATION("l"),
    DUE_TO_NEWS_PENDING("m"),
    TRADING_RESUME("n"),
    OUT_OF_SEQUENCE("o"),
    BID_SPECIALIST("p"),
    OFFER_SPECIALIST("q"),
    BID_OFFER_SPECIALIST("r"),
    END_OF_DAY_SAM("s"),
    FORBIDDEN_SAM("t"),
    FROZEN_SAM("u"),
    PREOPENING_SAM("v"),
    OPENING_SAM("w"),
    OPEN_SAM("x"),
    SURVEILLANCE_SAM("y"),
    SUSPENDED_SAM("z"),
    RESERVED_SAM("0"),
    NO_ACTIVE_SAM("1"),
    RESTRICTED("2"),
    REST_OF_BOOK_VWAP("3"),
    BETTER_PRICES_IN_CONDITIONAL_ORDERS("4"),
    MEDIAN_PRICE("5"),
    FULL_CURVE("6"),
    FLAT_CURVE("7"),
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
        stringMap.put("L", MANUAL_SLOW_QUOTE);
        stringMap.put("J", OUTRIGHT_PRICE);
        stringMap.put("K", IMPLIED_PRICE);
        stringMap.put("M", DEPTH_ON_OFFER);
        stringMap.put("N", DEPTH_ON_BID);
        stringMap.put("O", CLOSING);
        stringMap.put("P", NEWS_DISSEMINATION);
        stringMap.put("Q", TRADING_RANGE);
        stringMap.put("R", ORDER_INFLUX);
        stringMap.put("S", DUE_TO_RELATED);
        stringMap.put("T", NEWS_PENDING);
        stringMap.put("U", ADDITIONAL_INFO);
        stringMap.put("V", ADDITIONAL_INFO_DUE_TO_RELATED);
        stringMap.put("W", RESUME);
        stringMap.put("X", VIEW_OF_COMMON);
        stringMap.put("Y", VOLUME_ALERT);
        stringMap.put("Z", ORDER_IMBALANCE);
        stringMap.put("a", EQUIPMENT_CHANGEOVER);
        stringMap.put("b", NO_OPEN_NO_RESUME);
        stringMap.put("c", REGULAR_ETH);
        stringMap.put("d", AUTOMATIC_EXECUTION);
        stringMap.put("e", AUTOMATIC_EXECUTION_ETH);
        stringMap.put("f", FAST_MARKET_ETH);
        stringMap.put("g", INACTIVE_ETH);
        stringMap.put("h", ROTATION);
        stringMap.put("i", ROTATION_ETH);
        stringMap.put("j", HALT);
        stringMap.put("k", HALT_ETH);
        stringMap.put("l", DUE_TO_NEWS_DISSEMINATION);
        stringMap.put("m", DUE_TO_NEWS_PENDING);
        stringMap.put("n", TRADING_RESUME);
        stringMap.put("o", OUT_OF_SEQUENCE);
        stringMap.put("p", BID_SPECIALIST);
        stringMap.put("q", OFFER_SPECIALIST);
        stringMap.put("r", BID_OFFER_SPECIALIST);
        stringMap.put("s", END_OF_DAY_SAM);
        stringMap.put("t", FORBIDDEN_SAM);
        stringMap.put("u", FROZEN_SAM);
        stringMap.put("v", PREOPENING_SAM);
        stringMap.put("w", OPENING_SAM);
        stringMap.put("x", OPEN_SAM);
        stringMap.put("y", SURVEILLANCE_SAM);
        stringMap.put("z", SUSPENDED_SAM);
        stringMap.put("0", RESERVED_SAM);
        stringMap.put("1", NO_ACTIVE_SAM);
        stringMap.put("2", RESTRICTED);
        stringMap.put("3", REST_OF_BOOK_VWAP);
        stringMap.put("4", BETTER_PRICES_IN_CONDITIONAL_ORDERS);
        stringMap.put("5", MEDIAN_PRICE);
        stringMap.put("6", FULL_CURVE);
        stringMap.put("7", FLAT_CURVE);
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
        case "L": return MANUAL_SLOW_QUOTE;
        case "J": return OUTRIGHT_PRICE;
        case "K": return IMPLIED_PRICE;
        case "M": return DEPTH_ON_OFFER;
        case "N": return DEPTH_ON_BID;
        case "O": return CLOSING;
        case "P": return NEWS_DISSEMINATION;
        case "Q": return TRADING_RANGE;
        case "R": return ORDER_INFLUX;
        case "S": return DUE_TO_RELATED;
        case "T": return NEWS_PENDING;
        case "U": return ADDITIONAL_INFO;
        case "V": return ADDITIONAL_INFO_DUE_TO_RELATED;
        case "W": return RESUME;
        case "X": return VIEW_OF_COMMON;
        case "Y": return VOLUME_ALERT;
        case "Z": return ORDER_IMBALANCE;
        case "a": return EQUIPMENT_CHANGEOVER;
        case "b": return NO_OPEN_NO_RESUME;
        case "c": return REGULAR_ETH;
        case "d": return AUTOMATIC_EXECUTION;
        case "e": return AUTOMATIC_EXECUTION_ETH;
        case "f": return FAST_MARKET_ETH;
        case "g": return INACTIVE_ETH;
        case "h": return ROTATION;
        case "i": return ROTATION_ETH;
        case "j": return HALT;
        case "k": return HALT_ETH;
        case "l": return DUE_TO_NEWS_DISSEMINATION;
        case "m": return DUE_TO_NEWS_PENDING;
        case "n": return TRADING_RESUME;
        case "o": return OUT_OF_SEQUENCE;
        case "p": return BID_SPECIALIST;
        case "q": return OFFER_SPECIALIST;
        case "r": return BID_OFFER_SPECIALIST;
        case "s": return END_OF_DAY_SAM;
        case "t": return FORBIDDEN_SAM;
        case "u": return FROZEN_SAM;
        case "v": return PREOPENING_SAM;
        case "w": return OPENING_SAM;
        case "x": return OPEN_SAM;
        case "y": return SURVEILLANCE_SAM;
        case "z": return SUSPENDED_SAM;
        case "0": return RESERVED_SAM;
        case "1": return NO_ACTIVE_SAM;
        case "2": return RESTRICTED;
        case "3": return REST_OF_BOOK_VWAP;
        case "4": return BETTER_PRICES_IN_CONDITIONAL_ORDERS;
        case "5": return MEDIAN_PRICE;
        case "6": return FULL_CURVE;
        case "7": return FLAT_CURVE;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
