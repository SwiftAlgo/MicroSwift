/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum DiscretionInst implements CharRepresentable
{
    RELATED_TO_DISPLAYED_PRICE('0'),
    RELATED_TO_MARKET_PRICE('1'),
    RELATED_TO_PRIMARY_PRICE('2'),
    RELATED_TO_LOCAL_PRIMARY_PRICE('3'),
    RELATED_TO_MIDPOINT_PRICE('4'),
    RELATED_TO_LAST_TRADE_PRICE('5'),
    RELATED_TO_VWAP('6'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    DiscretionInst(final char representation)
    {
         this.representation = representation;
    }

    public final char representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(14);
        static
    {
        intSet.add('0');
        intSet.add('1');
        intSet.add('2');
        intSet.add('3');
        intSet.add('4');
        intSet.add('5');
        intSet.add('6');
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static DiscretionInst decode(final int representation)
    {
        switch(representation)
        {
        case '0': return RELATED_TO_DISPLAYED_PRICE;
        case '1': return RELATED_TO_MARKET_PRICE;
        case '2': return RELATED_TO_PRIMARY_PRICE;
        case '3': return RELATED_TO_LOCAL_PRIMARY_PRICE;
        case '4': return RELATED_TO_MIDPOINT_PRICE;
        case '5': return RELATED_TO_LAST_TRADE_PRICE;
        case '6': return RELATED_TO_VWAP;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
