/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum TickDirection implements CharRepresentable
{
    PLUS_TICK('0'),
    ZERO_PLUS_TICK('1'),
    MINUS_TICK('2'),
    ZERO_MINUS_TICK('3'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    TickDirection(final char representation)
    {
         this.representation = representation;
    }

    public final char representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(8);
        static
    {
        intSet.add('0');
        intSet.add('1');
        intSet.add('2');
        intSet.add('3');
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static TickDirection decode(final int representation)
    {
        switch(representation)
        {
        case '0': return PLUS_TICK;
        case '1': return ZERO_PLUS_TICK;
        case '2': return MINUS_TICK;
        case '3': return ZERO_MINUS_TICK;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
