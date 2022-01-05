/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum RefOrderIDSource implements CharRepresentable
{
    SECONDARYORDERID('0'),
    ORDERID('1'),
    MDENTRYID('2'),
    QUOTEENTRYID('3'),
    ORIGINAL_ORDER_ID('4'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    RefOrderIDSource(final char representation)
    {
         this.representation = representation;
    }

    public final char representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(10);
        static
    {
        intSet.add('0');
        intSet.add('1');
        intSet.add('2');
        intSet.add('3');
        intSet.add('4');
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static RefOrderIDSource decode(final int representation)
    {
        switch(representation)
        {
        case '0': return SECONDARYORDERID;
        case '1': return ORDERID;
        case '2': return MDENTRYID;
        case '3': return QUOTEENTRYID;
        case '4': return ORIGINAL_ORDER_ID;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
