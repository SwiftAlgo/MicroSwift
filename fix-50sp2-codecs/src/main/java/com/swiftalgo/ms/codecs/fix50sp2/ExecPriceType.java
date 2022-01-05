/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum ExecPriceType implements CharRepresentable
{
    BID_PRICE('B'),
    CREATION_PRICE('C'),
    CREATION_PRICE_PLUS_ADJUSTMENT_PERCENT('D'),
    CREATION_PRICE_PLUS_ADJUSTMENT_AMOUNT('E'),
    OFFER_PRICE('O'),
    OFFER_PRICE_MINUS_ADJUSTMENT_PERCENT('P'),
    OFFER_PRICE_MINUS_ADJUSTMENT_AMOUNT('Q'),
    SINGLE_PRICE('S'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    ExecPriceType(final char representation)
    {
         this.representation = representation;
    }

    public final char representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(16);
        static
    {
        intSet.add('B');
        intSet.add('C');
        intSet.add('D');
        intSet.add('E');
        intSet.add('O');
        intSet.add('P');
        intSet.add('Q');
        intSet.add('S');
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static ExecPriceType decode(final int representation)
    {
        switch(representation)
        {
        case 'B': return BID_PRICE;
        case 'C': return CREATION_PRICE;
        case 'D': return CREATION_PRICE_PLUS_ADJUSTMENT_PERCENT;
        case 'E': return CREATION_PRICE_PLUS_ADJUSTMENT_AMOUNT;
        case 'O': return OFFER_PRICE;
        case 'P': return OFFER_PRICE_MINUS_ADJUSTMENT_PERCENT;
        case 'Q': return OFFER_PRICE_MINUS_ADJUSTMENT_AMOUNT;
        case 'S': return SINGLE_PRICE;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
