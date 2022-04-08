/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum RegistTransType implements CharRepresentable
{
    NEW('0'),
    CANCEL('2'),
    REPLACE('1'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    RegistTransType(final char representation)
    {
         this.representation = representation;
    }

    public final char representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(6);
        static
    {
        intSet.add('0');
        intSet.add('2');
        intSet.add('1');
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static RegistTransType decode(final int representation)
    {
        switch(representation)
        {
        case '0': return NEW;
        case '2': return CANCEL;
        case '1': return REPLACE;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
