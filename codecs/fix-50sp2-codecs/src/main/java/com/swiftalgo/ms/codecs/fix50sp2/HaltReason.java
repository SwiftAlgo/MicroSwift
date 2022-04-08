/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum HaltReason implements IntRepresentable
{
    NEWS_DISSEMINATION(0),
    ORDER_INFLUX(1),
    ORDER_IMBALANCE(2),
    ADDITIONAL_INFORMATION(3),
    NEWS_PENDING(4),
    EQUIPMENT_CHANGEOVER(5),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    HaltReason(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(12);
        static
    {
        intSet.add(0);
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
    public static HaltReason decode(final int representation)
    {
        switch(representation)
        {
        case 0: return NEWS_DISSEMINATION;
        case 1: return ORDER_INFLUX;
        case 2: return ORDER_IMBALANCE;
        case 3: return ADDITIONAL_INFORMATION;
        case 4: return NEWS_PENDING;
        case 5: return EQUIPMENT_CHANGEOVER;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
