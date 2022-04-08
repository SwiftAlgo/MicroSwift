/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.StringRepresentable;
public enum ExecInst implements StringRepresentable
{
    NOT_HELD("1"),
    WORK("2"),
    GO_ALONG("3"),
    OVER_THE_DAY("4"),
    HELD("5"),
    PARTICIPATE_DONT_INITIATE("6"),
    STRICT_SCALE("7"),
    TRY_TO_SCALE("8"),
    STAY_ON_BIDSIDE("9"),
    STAY_ON_OFFERSIDE("0"),
    NO_CROSS("A"),
    OK_TO_CROSS("B"),
    CALL_FIRST("C"),
    PERCENT_OF_VOLUME("D"),
    DO_NOT_INCREASE("E"),
    DO_NOT_REDUCE("F"),
    ALL_OR_NONE("G"),
    REINSTATE_ON_SYSTEM_FAILURE("H"),
    INSTITUTIONS_ONLY("I"),
    REINSTATE_ON_TRADING_HALT("J"),
    CANCEL_ON_TRADING_HALT("K"),
    LAST_PEG("L"),
    MID_PRICE("M"),
    NON_NEGOTIABLE("N"),
    OPENING_PEG("O"),
    MARKET_PEG("P"),
    CANCEL_ON_SYSTEM_FAILURE("Q"),
    PRIMARY_PEG("R"),
    SUSPEND("S"),
    FIXED_PEG_TO_LOCAL_BEST_BID_OR_OFFER_AT_TIME_OF_ORDER("T"),
    CUSTOMER_DISPLAY_INSTRUCTION("U"),
    NETTING("V"),
    PEG_TO_VWAP("W"),
    TRADE_ALONG("X"),
    TRY_TO_STOP("Y"),
    CANCEL_IF_NOT_BEST("Z"),
    TRAILING_STOP_PEG("a"),
    STRICT_LIMIT("b"),
    IGNORE_PRICE_VALIDITY_CHECKS("c"),
    PEG_TO_LIMIT_PRICE("d"),
    WORK_TO_TARGET_STRATEGY("e"),
    NULL_VAL(""),
    ARTIO_UNKNOWN("");

    private final String representation;

    ExecInst(final String representation)
    {
         this.representation = representation;
    }

    public final String representation() { return representation; }

    private static final CharArrayMap<ExecInst> charMap;
    static
    {
        final Map<String, ExecInst> stringMap = new HashMap<>();
        stringMap.put("1", NOT_HELD);
        stringMap.put("2", WORK);
        stringMap.put("3", GO_ALONG);
        stringMap.put("4", OVER_THE_DAY);
        stringMap.put("5", HELD);
        stringMap.put("6", PARTICIPATE_DONT_INITIATE);
        stringMap.put("7", STRICT_SCALE);
        stringMap.put("8", TRY_TO_SCALE);
        stringMap.put("9", STAY_ON_BIDSIDE);
        stringMap.put("0", STAY_ON_OFFERSIDE);
        stringMap.put("A", NO_CROSS);
        stringMap.put("B", OK_TO_CROSS);
        stringMap.put("C", CALL_FIRST);
        stringMap.put("D", PERCENT_OF_VOLUME);
        stringMap.put("E", DO_NOT_INCREASE);
        stringMap.put("F", DO_NOT_REDUCE);
        stringMap.put("G", ALL_OR_NONE);
        stringMap.put("H", REINSTATE_ON_SYSTEM_FAILURE);
        stringMap.put("I", INSTITUTIONS_ONLY);
        stringMap.put("J", REINSTATE_ON_TRADING_HALT);
        stringMap.put("K", CANCEL_ON_TRADING_HALT);
        stringMap.put("L", LAST_PEG);
        stringMap.put("M", MID_PRICE);
        stringMap.put("N", NON_NEGOTIABLE);
        stringMap.put("O", OPENING_PEG);
        stringMap.put("P", MARKET_PEG);
        stringMap.put("Q", CANCEL_ON_SYSTEM_FAILURE);
        stringMap.put("R", PRIMARY_PEG);
        stringMap.put("S", SUSPEND);
        stringMap.put("T", FIXED_PEG_TO_LOCAL_BEST_BID_OR_OFFER_AT_TIME_OF_ORDER);
        stringMap.put("U", CUSTOMER_DISPLAY_INSTRUCTION);
        stringMap.put("V", NETTING);
        stringMap.put("W", PEG_TO_VWAP);
        stringMap.put("X", TRADE_ALONG);
        stringMap.put("Y", TRY_TO_STOP);
        stringMap.put("Z", CANCEL_IF_NOT_BEST);
        stringMap.put("a", TRAILING_STOP_PEG);
        stringMap.put("b", STRICT_LIMIT);
        stringMap.put("c", IGNORE_PRICE_VALIDITY_CHECKS);
        stringMap.put("d", PEG_TO_LIMIT_PRICE);
        stringMap.put("e", WORK_TO_TARGET_STRATEGY);
        charMap = new CharArrayMap<>(stringMap);
    }

    public static ExecInst decode(final CharArrayWrapper key)
    {
        final ExecInst value = charMap.get(key);
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
    public static ExecInst decode(final String representation)
    {
        switch(representation)
        {
        case "1": return NOT_HELD;
        case "2": return WORK;
        case "3": return GO_ALONG;
        case "4": return OVER_THE_DAY;
        case "5": return HELD;
        case "6": return PARTICIPATE_DONT_INITIATE;
        case "7": return STRICT_SCALE;
        case "8": return TRY_TO_SCALE;
        case "9": return STAY_ON_BIDSIDE;
        case "0": return STAY_ON_OFFERSIDE;
        case "A": return NO_CROSS;
        case "B": return OK_TO_CROSS;
        case "C": return CALL_FIRST;
        case "D": return PERCENT_OF_VOLUME;
        case "E": return DO_NOT_INCREASE;
        case "F": return DO_NOT_REDUCE;
        case "G": return ALL_OR_NONE;
        case "H": return REINSTATE_ON_SYSTEM_FAILURE;
        case "I": return INSTITUTIONS_ONLY;
        case "J": return REINSTATE_ON_TRADING_HALT;
        case "K": return CANCEL_ON_TRADING_HALT;
        case "L": return LAST_PEG;
        case "M": return MID_PRICE;
        case "N": return NON_NEGOTIABLE;
        case "O": return OPENING_PEG;
        case "P": return MARKET_PEG;
        case "Q": return CANCEL_ON_SYSTEM_FAILURE;
        case "R": return PRIMARY_PEG;
        case "S": return SUSPEND;
        case "T": return FIXED_PEG_TO_LOCAL_BEST_BID_OR_OFFER_AT_TIME_OF_ORDER;
        case "U": return CUSTOMER_DISPLAY_INSTRUCTION;
        case "V": return NETTING;
        case "W": return PEG_TO_VWAP;
        case "X": return TRADE_ALONG;
        case "Y": return TRY_TO_STOP;
        case "Z": return CANCEL_IF_NOT_BEST;
        case "a": return TRAILING_STOP_PEG;
        case "b": return STRICT_LIMIT;
        case "c": return IGNORE_PRICE_VALIDITY_CHECKS;
        case "d": return PEG_TO_LIMIT_PRICE;
        case "e": return WORK_TO_TARGET_STRATEGY;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
