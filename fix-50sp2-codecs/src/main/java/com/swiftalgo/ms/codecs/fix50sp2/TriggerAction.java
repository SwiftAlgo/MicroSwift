/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum TriggerAction implements CharRepresentable
{
    ACTIVATE('1'),
    MODIFY('2'),
    CANCEL('3'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    TriggerAction(final char representation)
    {
         this.representation = representation;
    }

    public final char representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(6);
        static
    {
        intSet.add('1');
        intSet.add('2');
        intSet.add('3');
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static TriggerAction decode(final int representation)
    {
        switch(representation)
        {
        case '1': return ACTIVATE;
        case '2': return MODIFY;
        case '3': return CANCEL;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
