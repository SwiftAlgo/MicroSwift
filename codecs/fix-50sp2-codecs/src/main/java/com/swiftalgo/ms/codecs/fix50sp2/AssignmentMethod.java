/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum AssignmentMethod implements CharRepresentable
{
    PRO_RATA('P'),
    RANDOM('R'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    AssignmentMethod(final char representation)
    {
         this.representation = representation;
    }

    public final char representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(4);
        static
    {
        intSet.add('P');
        intSet.add('R');
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static AssignmentMethod decode(final int representation)
    {
        switch(representation)
        {
        case 'P': return PRO_RATA;
        case 'R': return RANDOM;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
