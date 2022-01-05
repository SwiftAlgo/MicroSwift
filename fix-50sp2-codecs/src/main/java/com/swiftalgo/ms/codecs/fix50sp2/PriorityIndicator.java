/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum PriorityIndicator implements IntRepresentable
{
    PRIORITY_UNCHANGED(0),
    LOST_PRIORITY_AS_RESULT_OF_ORDER_CHANGE(1),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    PriorityIndicator(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(4);
        static
    {
        intSet.add(0);
        intSet.add(1);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static PriorityIndicator decode(final int representation)
    {
        switch(representation)
        {
        case 0: return PRIORITY_UNCHANGED;
        case 1: return LOST_PRIORITY_AS_RESULT_OF_ORDER_CHANGE;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
