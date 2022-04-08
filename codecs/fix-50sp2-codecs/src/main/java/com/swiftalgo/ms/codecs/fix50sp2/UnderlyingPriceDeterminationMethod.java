/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum UnderlyingPriceDeterminationMethod implements IntRepresentable
{
    REGULAR(1),
    SPECIAL_REFERENCE(2),
    OPTIMAL_VALUE(3),
    AVERAGE_VALUE(4),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    UnderlyingPriceDeterminationMethod(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(8);
        static
    {
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
        intSet.add(4);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static UnderlyingPriceDeterminationMethod decode(final int representation)
    {
        switch(representation)
        {
        case 1: return REGULAR;
        case 2: return SPECIAL_REFERENCE;
        case 3: return OPTIMAL_VALUE;
        case 4: return AVERAGE_VALUE;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
