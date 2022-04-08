/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum FlowScheduleType implements IntRepresentable
{
    NERC_EASTERN_OFF_PEAK(0),
    NERC_WESTERN_OFF_PEAK(1),
    NERC_CALENDAR_ALL_DAYS_IN_MONTH(2),
    NERC_EASTERN_PEAK(3),
    NERC_WESTERN_PEAK(4),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    FlowScheduleType(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(10);
        static
    {
        intSet.add(0);
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
        intSet.add(4);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static FlowScheduleType decode(final int representation)
    {
        switch(representation)
        {
        case 0: return NERC_EASTERN_OFF_PEAK;
        case 1: return NERC_WESTERN_OFF_PEAK;
        case 2: return NERC_CALENDAR_ALL_DAYS_IN_MONTH;
        case 3: return NERC_EASTERN_PEAK;
        case 4: return NERC_WESTERN_PEAK;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
