/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum ComplexEventPriceBoundaryMethod implements IntRepresentable
{
    LESS_THAN_COMPLEXEVENTPRICE(1),
    LESS_THAN_OR_EQUAL_TO_COMPLEXEVENTPRICE(2),
    EQUAL_TO_COMPLEXEVENTPRICE(3),
    GREATER_THAN_OR_EQUAL_TO_COMPLEXEVENTPRICE(4),
    GREATER_THAN_COMPLEXEVENTPRICE(5),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    ComplexEventPriceBoundaryMethod(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(10);
        static
    {
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
        intSet.add(4);
        intSet.add(5);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static ComplexEventPriceBoundaryMethod decode(final int representation)
    {
        switch(representation)
        {
        case 1: return LESS_THAN_COMPLEXEVENTPRICE;
        case 2: return LESS_THAN_OR_EQUAL_TO_COMPLEXEVENTPRICE;
        case 3: return EQUAL_TO_COMPLEXEVENTPRICE;
        case 4: return GREATER_THAN_OR_EQUAL_TO_COMPLEXEVENTPRICE;
        case 5: return GREATER_THAN_COMPLEXEVENTPRICE;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
