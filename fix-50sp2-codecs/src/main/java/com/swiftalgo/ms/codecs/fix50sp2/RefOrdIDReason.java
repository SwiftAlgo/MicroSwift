/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum RefOrdIDReason implements IntRepresentable
{
    GTC_FROM_PREVIOUS_DAY(0),
    PARTIAL_FILL_REMAINING(1),
    ORDER_CHANGED(2),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    RefOrdIDReason(final int representation)
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
    public static RefOrdIDReason decode(final int representation)
    {
        switch(representation)
        {
        case 0: return GTC_FROM_PREVIOUS_DAY;
        case 1: return PARTIAL_FILL_REMAINING;
        case 2: return ORDER_CHANGED;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
