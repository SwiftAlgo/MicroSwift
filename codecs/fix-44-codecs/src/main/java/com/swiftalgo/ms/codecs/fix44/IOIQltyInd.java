/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum IOIQltyInd implements CharRepresentable
{
    LOW('L'),
    MEDIUM('M'),
    HIGH('H'),
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
        intSet.add('L');
        intSet.add('M');
        intSet.add('H');
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static IOIQltyInd decode(final int representation)
    {
        switch(representation)
        {
        case 'L': return LOW;
        case 'M': return MEDIUM;
        case 'H': return HIGH;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
