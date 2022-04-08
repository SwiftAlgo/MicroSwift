/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum QtyType implements IntRepresentable
{
    UNITS(0),
    CONTRACTS(1),
    UNITS_OF_MEASURE_PER_TIME_UNIT(2),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    QtyType(final int representation)
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
    public static QtyType decode(final int representation)
    {
        switch(representation)
        {
        case 0: return UNITS;
        case 1: return CONTRACTS;
        case 2: return UNITS_OF_MEASURE_PER_TIME_UNIT;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
