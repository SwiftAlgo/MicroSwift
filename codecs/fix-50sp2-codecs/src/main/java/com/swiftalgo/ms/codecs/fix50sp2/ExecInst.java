/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.StringRepresentable;
public enum ExecInst implements StringRepresentable
{
    STAY_ON_OFFER_SIDE("0"),
    NOT_HELD("1"),
    WORK("2"),
    GO_ALONG("3"),
    OVER_THE_DAY("4"),
    HELD("5"),
    PARTICIPATE_DONT_INITIATE("6"),
    STRICT_SCALE("7"),
    TRY_TO_SCALE("8"),
    STAY_ON_BID_SIDE("9"),
    NO_CROSS("A"),
    OK_TO_CROSS("B"),
    CALL_FIRST("C"),
    PERCENT_OF_VOLUME("D"),
    DO_NOT_INCREASE_DNI("E"),
    DO_NOT_REDUCE_DNR("F"),
    ALL_OR_NONE_AON("G"),
    REINSTATE_ON_SYSTEM_FAILURE("H"),
    INSTITUTIONS_ONLY("I"),
    REINSTATE_ON_TRADING_HALT("J"),
    CANCEL_ON_TRADING_HALT("K"),
    LAST_PEG("L"),
    MID_PRICE_PEG("M"),
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
    INTERMARKET_SWEEP("f"),
    EXTERNAL_ROUTING_ALLOWED("g"),
    EXTERNAL_ROUTING_NOT_ALLOWED("h"),
    IMBALANCE_ONLY("i"),
    SINGLE_EXECUTION_REQUESTED_FOR_BLOCK_TRADE("j"),
    BEST_EXECUTION("k"),
    SUSPEND_ON_SYSTEM_FAILURE("l"),
    SUSPEND_ON_TRADING_HALT("m"),
    REINSTATE_ON_CONNECTION_LOSS("n"),
    CANCEL_ON_CONNECTION_LOSS("o"),
    SUSPEND_ON_CONNECTION_LOSS("p"),
    RELEASE_FROM_SUSPENSION("q"),
    EXECUTE_AS_DELTA_NEUTRAL_USING_VOLATILITY_PROVIDED("r"),
    EXECUTE_AS_DURATION_NEUTRAL("s"),
    EXECUTE_AS_FX_NEUTRAL("t"),
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
        stringMap.put("0", STAY_ON_OFFER_SIDE);
        stringMap.put("1", NOT_HELD);
        stringMap.put("2", WORK);
        stringMap.put("3", GO_ALONG);
        stringMap.put("4", OVER_THE_DAY);
        stringMap.put("5", HELD);
        stringMap.put("6", PARTICIPATE_DONT_INITIATE);
        stringMap.put("7", STRICT_SCALE);
        stringMap.put("8", TRY_TO_SCALE);
        stringMap.put("9", STAY_ON_BID_SIDE);
        stringMap.put("A", NO_CROSS);
        stringMap.put("B", OK_TO_CROSS);
        stringMap.put("C", CALL_FIRST);
        stringMap.put("D", PERCENT_OF_VOLUME);
        stringMap.put("E", DO_NOT_INCREASE_DNI);
        stringMap.put("F", DO_NOT_REDUCE_DNR);
        stringMap.put("G", ALL_OR_NONE_AON);
        stringMap.put("H", REINSTATE_ON_SYSTEM_FAILURE);
        stringMap.put("I", INSTITUTIONS_ONLY);
        stringMap.put("J", REINSTATE_ON_TRADING_HALT);
        stringMap.put("K", CANCEL_ON_TRADING_HALT);
        stringMap.put("L", LAST_PEG);
        stringMap.put("M", MID_PRICE_PEG);
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
        stringMap.put("f", INTERMARKET_SWEEP);
        stringMap.put("g", EXTERNAL_ROUTING_ALLOWED);
        stringMap.put("h", EXTERNAL_ROUTING_NOT_ALLOWED);
        stringMap.put("i", IMBALANCE_ONLY);
        stringMap.put("j", SINGLE_EXECUTION_REQUESTED_FOR_BLOCK_TRADE);
        stringMap.put("k", BEST_EXECUTION);
        stringMap.put("l", SUSPEND_ON_SYSTEM_FAILURE);
        stringMap.put("m", SUSPEND_ON_TRADING_HALT);
        stringMap.put("n", REINSTATE_ON_CONNECTION_LOSS);
        stringMap.put("o", CANCEL_ON_CONNECTION_LOSS);
        stringMap.put("p", SUSPEND_ON_CONNECTION_LOSS);
        stringMap.put("q", RELEASE_FROM_SUSPENSION);
        stringMap.put("r", EXECUTE_AS_DELTA_NEUTRAL_USING_VOLATILITY_PROVIDED);
        stringMap.put("s", EXECUTE_AS_DURATION_NEUTRAL);
        stringMap.put("t", EXECUTE_AS_FX_NEUTRAL);
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
        case "0": return STAY_ON_OFFER_SIDE;
        case "1": return NOT_HELD;
        case "2": return WORK;
        case "3": return GO_ALONG;
        case "4": return OVER_THE_DAY;
        case "5": return HELD;
        case "6": return PARTICIPATE_DONT_INITIATE;
        case "7": return STRICT_SCALE;
        case "8": return TRY_TO_SCALE;
        case "9": return STAY_ON_BID_SIDE;
        case "A": return NO_CROSS;
        case "B": return OK_TO_CROSS;
        case "C": return CALL_FIRST;
        case "D": return PERCENT_OF_VOLUME;
        case "E": return DO_NOT_INCREASE_DNI;
        case "F": return DO_NOT_REDUCE_DNR;
        case "G": return ALL_OR_NONE_AON;
        case "H": return REINSTATE_ON_SYSTEM_FAILURE;
        case "I": return INSTITUTIONS_ONLY;
        case "J": return REINSTATE_ON_TRADING_HALT;
        case "K": return CANCEL_ON_TRADING_HALT;
        case "L": return LAST_PEG;
        case "M": return MID_PRICE_PEG;
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
        case "f": return INTERMARKET_SWEEP;
        case "g": return EXTERNAL_ROUTING_ALLOWED;
        case "h": return EXTERNAL_ROUTING_NOT_ALLOWED;
        case "i": return IMBALANCE_ONLY;
        case "j": return SINGLE_EXECUTION_REQUESTED_FOR_BLOCK_TRADE;
        case "k": return BEST_EXECUTION;
        case "l": return SUSPEND_ON_SYSTEM_FAILURE;
        case "m": return SUSPEND_ON_TRADING_HALT;
        case "n": return REINSTATE_ON_CONNECTION_LOSS;
        case "o": return CANCEL_ON_CONNECTION_LOSS;
        case "p": return SUSPEND_ON_CONNECTION_LOSS;
        case "q": return RELEASE_FROM_SUSPENSION;
        case "r": return EXECUTE_AS_DELTA_NEUTRAL_USING_VOLATILITY_PROVIDED;
        case "s": return EXECUTE_AS_DURATION_NEUTRAL;
        case "t": return EXECUTE_AS_FX_NEUTRAL;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
