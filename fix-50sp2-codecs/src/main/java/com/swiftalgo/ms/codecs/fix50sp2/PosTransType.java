/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum PosTransType implements IntRepresentable
{
    EXERCISE(1),
    DO_NOT_EXERCISE(2),
    POSITION_ADJUSTMENT(3),
    POSITION_CHANGE_SUBMISSION_MARGIN_DISPOSITION(4),
    PLEDGE(5),
    LARGE_TRADER_SUBMISSION(6),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    PosTransType(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(12);
        static
    {
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
    public static PosTransType decode(final int representation)
    {
        switch(representation)
        {
        case 1: return EXERCISE;
        case 2: return DO_NOT_EXERCISE;
        case 3: return POSITION_ADJUSTMENT;
        case 4: return POSITION_CHANGE_SUBMISSION_MARGIN_DISPOSITION;
        case 5: return PLEDGE;
        case 6: return LARGE_TRADER_SUBMISSION;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
