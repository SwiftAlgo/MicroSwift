/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum OrderDelayUnit implements IntRepresentable
{
    SECONDS(0),
    TENTHS_OF_A_SECOND(1),
    HUNDREDTHS_OF_A_SECOND(2),
    MILLISECONDS(3),
    MICROSECONDS(4),
    NANOSECONDS(5),
    MINUTES(10),
    HOURS(11),
    DAYS(12),
    WEEKS(13),
    MONTHS(14),
    YEARS(15),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    OrderDelayUnit(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(24);
        static
    {
        intSet.add(0);
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
        intSet.add(4);
        intSet.add(5);
        intSet.add(10);
        intSet.add(11);
        intSet.add(12);
        intSet.add(13);
        intSet.add(14);
        intSet.add(15);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static OrderDelayUnit decode(final int representation)
    {
        switch(representation)
        {
        case 0: return SECONDS;
        case 1: return TENTHS_OF_A_SECOND;
        case 2: return HUNDREDTHS_OF_A_SECOND;
        case 3: return MILLISECONDS;
        case 4: return MICROSECONDS;
        case 5: return NANOSECONDS;
        case 10: return MINUTES;
        case 11: return HOURS;
        case 12: return DAYS;
        case 13: return WEEKS;
        case 14: return MONTHS;
        case 15: return YEARS;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
