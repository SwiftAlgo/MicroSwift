/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum VenueType implements CharRepresentable
{
    ELECTRONIC('E'),
    PIT('P'),
    EX_PIT('X'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    VenueType(final char representation)
    {
         this.representation = representation;
    }

    public final char representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(6);
        static
    {
        intSet.add('E');
        intSet.add('P');
        intSet.add('X');
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static VenueType decode(final int representation)
    {
        switch(representation)
        {
        case 'E': return ELECTRONIC;
        case 'P': return PIT;
        case 'X': return EX_PIT;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
