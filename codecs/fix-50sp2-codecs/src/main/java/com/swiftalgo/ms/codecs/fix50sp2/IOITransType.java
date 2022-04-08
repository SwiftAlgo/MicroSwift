/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum IOITransType implements CharRepresentable
{
    NEW('N'),
    CANCEL('C'),
    REPLACE('R'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    IOITransType(final char representation)
    {
         this.representation = representation;
    }

    public final char representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(6);
        static
    {
        intSet.add('N');
        intSet.add('C');
        intSet.add('R');
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static IOITransType decode(final int representation)
    {
        switch(representation)
        {
        case 'N': return NEW;
        case 'C': return CANCEL;
        case 'R': return REPLACE;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
