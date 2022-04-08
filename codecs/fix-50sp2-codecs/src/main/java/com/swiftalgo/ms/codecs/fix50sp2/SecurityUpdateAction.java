/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum SecurityUpdateAction implements CharRepresentable
{
    ADD('A'),
    DELETE('D'),
    MODIFY('M'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    SecurityUpdateAction(final char representation)
    {
         this.representation = representation;
    }

    public final char representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(6);
        static
    {
        intSet.add('A');
        intSet.add('D');
        intSet.add('M');
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static SecurityUpdateAction decode(final int representation)
    {
        switch(representation)
        {
        case 'A': return ADD;
        case 'D': return DELETE;
        case 'M': return MODIFY;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
