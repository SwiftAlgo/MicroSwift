/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum PreallocMethod implements CharRepresentable
{
    PRO_RATA('0'),
    DO_NOT_PRO_RATA('1'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    PreallocMethod(final char representation)
    {
         this.representation = representation;
    }

    public final char representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(4);
        static
    {
        intSet.add('0');
        intSet.add('1');
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static PreallocMethod decode(final int representation)
    {
        switch(representation)
        {
        case '0': return PRO_RATA;
        case '1': return DO_NOT_PRO_RATA;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
