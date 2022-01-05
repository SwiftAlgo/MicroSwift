/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum LastCapacity implements CharRepresentable
{
    AGENT('1'),
    CROSS_AS_AGENT('2'),
    CROSS_AS_PRINCIPAL('3'),
    PRINCIPAL('4'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    LastCapacity(final char representation)
    {
         this.representation = representation;
    }

    public final char representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(8);
        static
    {
        intSet.add('1');
        intSet.add('2');
        intSet.add('3');
        intSet.add('4');
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static LastCapacity decode(final int representation)
    {
        switch(representation)
        {
        case '1': return AGENT;
        case '2': return CROSS_AS_AGENT;
        case '3': return CROSS_AS_PRINCIPAL;
        case '4': return PRINCIPAL;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
