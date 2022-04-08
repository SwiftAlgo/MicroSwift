/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum BidRequestTransType implements CharRepresentable
{
    CANCEL('C'),
    NEW('N'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    BidRequestTransType(final char representation)
    {
         this.representation = representation;
    }

    public final char representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(4);
        static
    {
        intSet.add('C');
        intSet.add('N');
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static BidRequestTransType decode(final int representation)
    {
        switch(representation)
        {
        case 'C': return CANCEL;
        case 'N': return NEW;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
