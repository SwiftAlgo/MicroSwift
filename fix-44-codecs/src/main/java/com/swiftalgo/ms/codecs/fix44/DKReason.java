/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum DKReason implements CharRepresentable
{
    UNKNOWN_SYMBOL('A'),
    WRONG_SIDE('B'),
    QUANTITY_EXCEEDS_ORDER('C'),
    NO_MATCHING_ORDER('D'),
    PRICE_EXCEEDS_LIMIT('E'),
    CALCULATION_DIFFERENCE('F'),
    OTHER('Z'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    DKReason(final char representation)
    {
         this.representation = representation;
    }

    public final char representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(14);
        static
    {
        intSet.add('A');
        intSet.add('B');
        intSet.add('C');
        intSet.add('D');
        intSet.add('E');
        intSet.add('F');
        intSet.add('Z');
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static DKReason decode(final int representation)
    {
        switch(representation)
        {
        case 'A': return UNKNOWN_SYMBOL;
        case 'B': return WRONG_SIDE;
        case 'C': return QUANTITY_EXCEEDS_ORDER;
        case 'D': return NO_MATCHING_ORDER;
        case 'E': return PRICE_EXCEEDS_LIMIT;
        case 'F': return CALCULATION_DIFFERENCE;
        case 'Z': return OTHER;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
