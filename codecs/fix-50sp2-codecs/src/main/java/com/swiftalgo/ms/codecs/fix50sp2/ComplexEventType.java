/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum ComplexEventType implements IntRepresentable
{
    CAPPED(1),
    TRIGGER(2),
    KNOCK_IN_UP(3),
    KOCK_IN_DOWN(4),
    KNOCK_OUT_UP(5),
    KNOCK_OUT_DOWN(6),
    UNDERLYING(7),
    RESET_BARRIER(8),
    ROLLING_BARRIER(9),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    ComplexEventType(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(18);
        static
    {
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
        intSet.add(4);
        intSet.add(5);
        intSet.add(6);
        intSet.add(7);
        intSet.add(8);
        intSet.add(9);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static ComplexEventType decode(final int representation)
    {
        switch(representation)
        {
        case 1: return CAPPED;
        case 2: return TRIGGER;
        case 3: return KNOCK_IN_UP;
        case 4: return KOCK_IN_DOWN;
        case 5: return KNOCK_OUT_UP;
        case 6: return KNOCK_OUT_DOWN;
        case 7: return UNDERLYING;
        case 8: return RESET_BARRIER;
        case 9: return ROLLING_BARRIER;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
