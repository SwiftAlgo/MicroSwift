/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum ApplQueueAction implements IntRepresentable
{
    NO_ACTION_TAKEN(0),
    QUEUE_FLUSHED(1),
    OVERLAY_LAST(2),
    END_SESSION(3),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    ApplQueueAction(final int representation)
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
    public static ApplQueueAction decode(final int representation)
    {
        switch(representation)
        {
        case 0: return NO_ACTION_TAKEN;
        case 1: return QUEUE_FLUSHED;
        case 2: return OVERLAY_LAST;
        case 3: return END_SESSION;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
