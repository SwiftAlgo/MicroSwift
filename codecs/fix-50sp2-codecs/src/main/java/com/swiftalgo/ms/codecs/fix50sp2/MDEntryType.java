/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum MDEntryType implements CharRepresentable
{
    BID('0'),
    OFFER('1'),
    TRADE('2'),
    INDEX_VALUE('3'),
    OPENING_PRICE('4'),
    CLOSING_PRICE('5'),
    SETTLEMENT_PRICE('6'),
    TRADING_SESSION_HIGH_PRICE('7'),
    TRADING_SESSION_LOW_PRICE('8'),
    TRADING_SESSION_VWAP_PRICE('9'),
    IMBALANCE('A'),
    TRADE_VOLUME('B'),
    OPEN_INTEREST('C'),
    COMPOSITE_UNDERLYING_PRICE('D'),
    SIMULATED_SELL_PRICE('E'),
    SIMULATED_BUY_PRICE('F'),
    MARGIN_RATE('G'),
    MID_PRICE('H'),
    EMPTY_BOOK('J'),
    SETTLE_HIGH_PRICE('K'),
    SETTLE_LOW_PRICE('L'),
    PRIOR_SETTLE_PRICE('M'),
    SESSION_HIGH_BID('N'),
    SESSION_LOW_OFFER('O'),
    EARLY_PRICES('P'),
    AUCTION_CLEARING_PRICE('Q'),
    SWAP_VALUE_FACTOR('S'),
    DAILY_VALUE_ADJUSTMENT_FOR_LONG_POSITIONS('R'),
    CUMULATIVE_VALUE_ADJUSTMENT_FOR_LONG_POSITIONS('T'),
    DAILY_VALUE_ADJUSTMENT_FOR_SHORT_POSITIONS('U'),
    CUMULATIVE_VALUE_ADJUSTMENT_FOR_SHORT_POSITIONS('V'),
    FIXING_PRICE('W'),
    CASH_RATE('X'),
    RECOVERY_RATE('Y'),
    RECOVERY_RATE_FOR_LONG('Z'),
    RECOVERY_RATE_FOR_SHORT('a'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    MDEntryType(final char representation)
    {
         this.representation = representation;
    }

    public final char representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(72);
        static
    {
        intSet.add('0');
        intSet.add('1');
        intSet.add('2');
        intSet.add('3');
        intSet.add('4');
        intSet.add('5');
        intSet.add('6');
        intSet.add('7');
        intSet.add('8');
        intSet.add('9');
        intSet.add('A');
        intSet.add('B');
        intSet.add('C');
        intSet.add('D');
        intSet.add('E');
        intSet.add('F');
        intSet.add('G');
        intSet.add('H');
        intSet.add('J');
        intSet.add('K');
        intSet.add('L');
        intSet.add('M');
        intSet.add('N');
        intSet.add('O');
        intSet.add('P');
        intSet.add('Q');
        intSet.add('S');
        intSet.add('R');
        intSet.add('T');
        intSet.add('U');
        intSet.add('V');
        intSet.add('W');
        intSet.add('X');
        intSet.add('Y');
        intSet.add('Z');
        intSet.add('a');
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static MDEntryType decode(final int representation)
    {
        switch(representation)
        {
        case '0': return BID;
        case '1': return OFFER;
        case '2': return TRADE;
        case '3': return INDEX_VALUE;
        case '4': return OPENING_PRICE;
        case '5': return CLOSING_PRICE;
        case '6': return SETTLEMENT_PRICE;
        case '7': return TRADING_SESSION_HIGH_PRICE;
        case '8': return TRADING_SESSION_LOW_PRICE;
        case '9': return TRADING_SESSION_VWAP_PRICE;
        case 'A': return IMBALANCE;
        case 'B': return TRADE_VOLUME;
        case 'C': return OPEN_INTEREST;
        case 'D': return COMPOSITE_UNDERLYING_PRICE;
        case 'E': return SIMULATED_SELL_PRICE;
        case 'F': return SIMULATED_BUY_PRICE;
        case 'G': return MARGIN_RATE;
        case 'H': return MID_PRICE;
        case 'J': return EMPTY_BOOK;
        case 'K': return SETTLE_HIGH_PRICE;
        case 'L': return SETTLE_LOW_PRICE;
        case 'M': return PRIOR_SETTLE_PRICE;
        case 'N': return SESSION_HIGH_BID;
        case 'O': return SESSION_LOW_OFFER;
        case 'P': return EARLY_PRICES;
        case 'Q': return AUCTION_CLEARING_PRICE;
        case 'S': return SWAP_VALUE_FACTOR;
        case 'R': return DAILY_VALUE_ADJUSTMENT_FOR_LONG_POSITIONS;
        case 'T': return CUMULATIVE_VALUE_ADJUSTMENT_FOR_LONG_POSITIONS;
        case 'U': return DAILY_VALUE_ADJUSTMENT_FOR_SHORT_POSITIONS;
        case 'V': return CUMULATIVE_VALUE_ADJUSTMENT_FOR_SHORT_POSITIONS;
        case 'W': return FIXING_PRICE;
        case 'X': return CASH_RATE;
        case 'Y': return RECOVERY_RATE;
        case 'Z': return RECOVERY_RATE_FOR_LONG;
        case 'a': return RECOVERY_RATE_FOR_SHORT;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
