/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum OrderCategory implements CharRepresentable
{
    ORDER('1'),
    QUOTE('2'),
    PRIVATELY_NEGOTIATED_TRADE('3'),
    MULTILEG_ORDER('4'),
    LINKED_ORDER('5'),
    QUOTE_REQUEST('6'),
    IMPLIED_ORDER('7'),
    CROSS_ORDER('8'),
    STREAMING_PRICE('9'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    OrderCategory(final char representation)
    {
         this.representation = representation;
    }

    public final char representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(18);
        static
    {
        intSet.add('1');
        intSet.add('2');
        intSet.add('3');
        intSet.add('4');
        intSet.add('5');
        intSet.add('6');
        intSet.add('7');
        intSet.add('8');
        intSet.add('9');
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static OrderCategory decode(final int representation)
    {
        switch(representation)
        {
        case '1': return ORDER;
        case '2': return QUOTE;
        case '3': return PRIVATELY_NEGOTIATED_TRADE;
        case '4': return MULTILEG_ORDER;
        case '5': return LINKED_ORDER;
        case '6': return QUOTE_REQUEST;
        case '7': return IMPLIED_ORDER;
        case '8': return CROSS_ORDER;
        case '9': return STREAMING_PRICE;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
