/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum ExerciseMethod implements CharRepresentable
{
    AUTOMATIC('A'),
    MANUAL('M'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    ExerciseMethod(final char representation)
    {
         this.representation = representation;
    }

    public final char representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(4);
        static
    {
        intSet.add('A');
        intSet.add('M');
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static ExerciseMethod decode(final int representation)
    {
        switch(representation)
        {
        case 'A': return AUTOMATIC;
        case 'M': return MANUAL;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
