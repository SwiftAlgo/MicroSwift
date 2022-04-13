/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum MiscFeeBasis implements IntRepresentable
{
    ABSOLUTE(0),
    PER_UNIT(1),
    PERCENTAGE(2),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    MiscFeeBasis(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(6);
        static
    {
        intSet.add(0);
        intSet.add(1);
        intSet.add(2);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static MiscFeeBasis decode(final int representation)
    {
        switch(representation)
        {
        case 0: return ABSOLUTE;
        case 1: return PER_UNIT;
        case 2: return PERCENTAGE;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}