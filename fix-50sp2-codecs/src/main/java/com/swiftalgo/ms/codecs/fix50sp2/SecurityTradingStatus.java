/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum SecurityTradingStatus implements IntRepresentable
{
    OPENING_DELAY(1),
    TRADING_HALT(2),
    RESUME(3),
    NO_OPEN_NO_RESUME(4),
    PRICE_INDICATION(5),
    TRADING_RANGE_INDICATION(6),
    MARKET_IMBALANCE_BUY(7),
    MARKET_IMBALANCE_SELL(8),
    MARKET_ON_CLOSE_IMBALANCE_BUY(9),
    MARKET_ON_CLOSE_IMBALANCE_SELL(10),
    NO_MARKET_IMBALANCE(12),
    NO_MARKET_ON_CLOSE_IMBALANCE(13),
    ITS_PRE_OPENING(14),
    NEW_PRICE_INDICATION(15),
    TRADE_DISSEMINATION_TIME(16),
    READY_TO_TRADE(17),
    NOT_AVAILABLE_FOR_TRADING(18),
    NOT_TRADED_ON_THIS_MARKET(19),
    UNKNOWN_OR_INVALID(20),
    PRE_OPEN(21),
    OPENING_ROTATION(22),
    FAST_MARKET(23),
    PRE_CROSS_SYSTEM_IS_IN_A_PRE_CROSS_STATE_ALLOWING_MARKET_TO_RESPOND_TO_EITHER_SIDE_OF_CROSS(24),
    CROSS_SYSTEM_HAS_CROSSED_A_PERCENTAGE_OF_THE_ORDERS_AND_ALLOWS_MARKET_TO_RESPOND_PRIOR_TO_CROSSING_REMAINING_PORTION(25),
    POST_CLOSE(26),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    SecurityTradingStatus(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(50);
        static
    {
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
        intSet.add(4);
        intSet.add(5);
        intSet.add(6);
        intSet.add(7);
        intSet.add(8);
        intSet.add(9);
        intSet.add(10);
        intSet.add(12);
        intSet.add(13);
        intSet.add(14);
        intSet.add(15);
        intSet.add(16);
        intSet.add(17);
        intSet.add(18);
        intSet.add(19);
        intSet.add(20);
        intSet.add(21);
        intSet.add(22);
        intSet.add(23);
        intSet.add(24);
        intSet.add(25);
        intSet.add(26);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static SecurityTradingStatus decode(final int representation)
    {
        switch(representation)
        {
        case 1: return OPENING_DELAY;
        case 2: return TRADING_HALT;
        case 3: return RESUME;
        case 4: return NO_OPEN_NO_RESUME;
        case 5: return PRICE_INDICATION;
        case 6: return TRADING_RANGE_INDICATION;
        case 7: return MARKET_IMBALANCE_BUY;
        case 8: return MARKET_IMBALANCE_SELL;
        case 9: return MARKET_ON_CLOSE_IMBALANCE_BUY;
        case 10: return MARKET_ON_CLOSE_IMBALANCE_SELL;
        case 12: return NO_MARKET_IMBALANCE;
        case 13: return NO_MARKET_ON_CLOSE_IMBALANCE;
        case 14: return ITS_PRE_OPENING;
        case 15: return NEW_PRICE_INDICATION;
        case 16: return TRADE_DISSEMINATION_TIME;
        case 17: return READY_TO_TRADE;
        case 18: return NOT_AVAILABLE_FOR_TRADING;
        case 19: return NOT_TRADED_ON_THIS_MARKET;
        case 20: return UNKNOWN_OR_INVALID;
        case 21: return PRE_OPEN;
        case 22: return OPENING_ROTATION;
        case 23: return FAST_MARKET;
        case 24: return PRE_CROSS_SYSTEM_IS_IN_A_PRE_CROSS_STATE_ALLOWING_MARKET_TO_RESPOND_TO_EITHER_SIDE_OF_CROSS;
        case 25: return CROSS_SYSTEM_HAS_CROSSED_A_PERCENTAGE_OF_THE_ORDERS_AND_ALLOWS_MARKET_TO_RESPOND_PRIOR_TO_CROSSING_REMAINING_PORTION;
        case 26: return POST_CLOSE;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
