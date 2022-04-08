/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum TriggerPriceType implements CharRepresentable
{
    BEST_OFFER('1'),
    LAST_TRADE('2'),
    BEST_BID('3'),
    BEST_BID_OR_LAST_TRADE('4'),
    BEST_OFFER_OR_LAST_TRADE('5'),
    BEST_MID('6'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    TriggerPriceType(final char representation)
    {
         this.representation = representation;
    }

    public final char representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(12);
        static
    {
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
    public static TriggerPriceType decode(final int representation)
    {
        switch(representation)
        {
        case '1': return BEST_OFFER;
        case '2': return LAST_TRADE;
        case '3': return BEST_BID;
        case '4': return BEST_BID_OR_LAST_TRADE;
        case '5': return BEST_OFFER_OR_LAST_TRADE;
        case '6': return BEST_MID;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
