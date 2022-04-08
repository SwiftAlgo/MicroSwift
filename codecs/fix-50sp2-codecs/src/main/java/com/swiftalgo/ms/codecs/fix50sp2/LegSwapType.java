/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum LegSwapType implements IntRepresentable
{
    PAR_FOR_PAR(1),
    MODIFIED_DURATION(2),
    RISK(4),
    PROCEEDS(5),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    LegSwapType(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(8);
        static
    {
        intSet.add(1);
        intSet.add(2);
        intSet.add(4);
        intSet.add(5);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static LegSwapType decode(final int representation)
    {
        switch(representation)
        {
        case 1: return PAR_FOR_PAR;
        case 2: return MODIFIED_DURATION;
        case 4: return RISK;
        case 5: return PROCEEDS;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
