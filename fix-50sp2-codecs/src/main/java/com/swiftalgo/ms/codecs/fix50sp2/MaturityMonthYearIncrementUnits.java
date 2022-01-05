/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum MaturityMonthYearIncrementUnits implements IntRepresentable
{
    MONTHS(0),
    DAYS(1),
    WEEKS(2),
    YEARS(3),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    MaturityMonthYearIncrementUnits(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(8);
        static
    {
        intSet.add(0);
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static MaturityMonthYearIncrementUnits decode(final int representation)
    {
        switch(representation)
        {
        case 0: return MONTHS;
        case 1: return DAYS;
        case 2: return WEEKS;
        case 3: return YEARS;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
