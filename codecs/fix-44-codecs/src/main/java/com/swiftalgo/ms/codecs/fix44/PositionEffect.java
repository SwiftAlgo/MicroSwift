/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum PositionEffect implements CharRepresentable
{
    OPEN('O'),
    CLOSE('C'),
    ROLLED('R'),
    FIFO('F'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    PositionEffect(final char representation)
    {
         this.representation = representation;
    }

    public final char representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(8);
        static
    {
        intSet.add('O');
        intSet.add('C');
        intSet.add('R');
        intSet.add('F');
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static PositionEffect decode(final int representation)
    {
        switch(representation)
        {
        case 'O': return OPEN;
        case 'C': return CLOSE;
        case 'R': return ROLLED;
        case 'F': return FIFO;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
