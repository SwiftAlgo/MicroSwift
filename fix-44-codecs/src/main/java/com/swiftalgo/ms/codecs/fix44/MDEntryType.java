/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

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
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    MDEntryType(final char representation)
    {
         this.representation = representation;
    }

    public final char representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(26);
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
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
