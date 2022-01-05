/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum MDUpdateAction implements CharRepresentable
{
    NEW('0'),
    CHANGE('1'),
    DELETE('2'),
    DELETE_THRU('3'),
    DELETE_FROM('4'),
    OVERLAY('5'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    MDUpdateAction(final char representation)
    {
         this.representation = representation;
    }

    public final char representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(12);
        static
    {
        intSet.add('0');
        intSet.add('1');
        intSet.add('2');
        intSet.add('3');
        intSet.add('4');
        intSet.add('5');
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static MDUpdateAction decode(final int representation)
    {
        switch(representation)
        {
        case '0': return NEW;
        case '1': return CHANGE;
        case '2': return DELETE;
        case '3': return DELETE_THRU;
        case '4': return DELETE_FROM;
        case '5': return OVERLAY;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
