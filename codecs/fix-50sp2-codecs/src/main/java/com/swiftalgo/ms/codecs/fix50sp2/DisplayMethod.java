/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum DisplayMethod implements CharRepresentable
{
    INITIAL('1'),
    NEW('2'),
    RANDOM('3'),
    UNDISCLOSED('4'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    DisplayMethod(final char representation)
    {
         this.representation = representation;
    }

    public final char representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(8);
        static
    {
        intSet.add('1');
        intSet.add('2');
        intSet.add('3');
        intSet.add('4');
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static DisplayMethod decode(final int representation)
    {
        switch(representation)
        {
        case '1': return INITIAL;
        case '2': return NEW;
        case '3': return RANDOM;
        case '4': return UNDISCLOSED;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
