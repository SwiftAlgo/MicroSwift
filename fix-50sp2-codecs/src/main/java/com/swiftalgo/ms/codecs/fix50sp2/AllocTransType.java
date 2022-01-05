/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum AllocTransType implements CharRepresentable
{
    NEW('0'),
    REPLACE('1'),
    CANCEL('2'),
    PRELIMINARY('3'),
    CALCULATED('4'),
    CALCULATED_WITHOUT_PRELIMINARY('5'),
    REVERSAL('6'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    AllocTransType(final char representation)
    {
         this.representation = representation;
    }

    public final char representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(14);
        static
    {
        intSet.add('0');
        intSet.add('1');
        intSet.add('2');
        intSet.add('3');
        intSet.add('4');
        intSet.add('5');
        intSet.add('6');
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static AllocTransType decode(final int representation)
    {
        switch(representation)
        {
        case '0': return NEW;
        case '1': return REPLACE;
        case '2': return CANCEL;
        case '3': return PRELIMINARY;
        case '4': return CALCULATED;
        case '5': return CALCULATED_WITHOUT_PRELIMINARY;
        case '6': return REVERSAL;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
