/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum PosReqType implements IntRepresentable
{
    POSITIONS(0),
    TRADES(1),
    EXERCISES(2),
    ASSIGNMENTS(3),
    SETTLEMENT_ACTIVITY(4),
    BACKOUT_MESSAGE(5),
    DELTA_POSITIONS(6),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    PosReqType(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(14);
        static
    {
        intSet.add(0);
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
        intSet.add(4);
        intSet.add(5);
        intSet.add(6);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static PosReqType decode(final int representation)
    {
        switch(representation)
        {
        case 0: return POSITIONS;
        case 1: return TRADES;
        case 2: return EXERCISES;
        case 3: return ASSIGNMENTS;
        case 4: return SETTLEMENT_ACTIVITY;
        case 5: return BACKOUT_MESSAGE;
        case 6: return DELTA_POSITIONS;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
