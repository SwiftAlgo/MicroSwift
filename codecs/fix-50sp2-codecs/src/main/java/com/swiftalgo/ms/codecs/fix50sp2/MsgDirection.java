/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum MsgDirection implements CharRepresentable
{
    RECEIVE('R'),
    SEND('S'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    MsgDirection(final char representation)
    {
         this.representation = representation;
    }

    public final char representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(4);
        static
    {
        intSet.add('R');
        intSet.add('S');
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static MsgDirection decode(final int representation)
    {
        switch(representation)
        {
        case 'R': return RECEIVE;
        case 'S': return SEND;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
