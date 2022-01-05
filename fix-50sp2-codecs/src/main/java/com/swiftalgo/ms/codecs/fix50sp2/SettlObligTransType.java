/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum SettlObligTransType implements CharRepresentable
{
    CANCEL('C'),
    NEW('N'),
    REPLACE('R'),
    RESTATE('T'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    SettlObligTransType(final char representation)
    {
         this.representation = representation;
    }

    public final char representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(8);
        static
    {
        intSet.add('C');
        intSet.add('N');
        intSet.add('R');
        intSet.add('T');
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static SettlObligTransType decode(final int representation)
    {
        switch(representation)
        {
        case 'C': return CANCEL;
        case 'N': return NEW;
        case 'R': return REPLACE;
        case 'T': return RESTATE;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
