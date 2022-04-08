/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum IOIQltyInd implements CharRepresentable
{
    HIGH('H'),
    LOW('L'),
    MEDIUM('M'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    IOIQltyInd(final char representation)
    {
         this.representation = representation;
    }

    public final char representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(6);
        static
    {
        intSet.add('H');
        intSet.add('L');
        intSet.add('M');
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static IOIQltyInd decode(final int representation)
    {
        switch(representation)
        {
        case 'H': return HIGH;
        case 'L': return LOW;
        case 'M': return MEDIUM;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
