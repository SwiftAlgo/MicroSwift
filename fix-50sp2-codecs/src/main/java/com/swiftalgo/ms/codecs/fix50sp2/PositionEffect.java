/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum PositionEffect implements CharRepresentable
{
    CLOSE('C'),
    FIFO('F'),
    OPEN('O'),
    ROLLED('R'),
    CLOSE_BUT_NOTIFY_ON_OPEN('N'),
    DEFAULT('D'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    PositionEffect(final char representation)
    {
         this.representation = representation;
    }

    public final char representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(12);
        static
    {
        intSet.add('C');
        intSet.add('F');
        intSet.add('O');
        intSet.add('R');
        intSet.add('N');
        intSet.add('D');
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static PositionEffect decode(final int representation)
    {
        switch(representation)
        {
        case 'C': return CLOSE;
        case 'F': return FIFO;
        case 'O': return OPEN;
        case 'R': return ROLLED;
        case 'N': return CLOSE_BUT_NOTIFY_ON_OPEN;
        case 'D': return DEFAULT;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
