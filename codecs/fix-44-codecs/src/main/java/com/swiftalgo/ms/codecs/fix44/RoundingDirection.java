/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum RoundingDirection implements CharRepresentable
{
    ROUND_TO_NEAREST('0'),
    ROUND_DOWN('1'),
    ROUND_UP('2'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    RoundingDirection(final char representation)
    {
         this.representation = representation;
    }

    public final char representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(6);
        static
    {
        intSet.add('0');
        intSet.add('1');
        intSet.add('2');
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static RoundingDirection decode(final int representation)
    {
        switch(representation)
        {
        case '0': return ROUND_TO_NEAREST;
        case '1': return ROUND_DOWN;
        case '2': return ROUND_UP;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
