/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum AllocStatus implements IntRepresentable
{
    ACCEPTED(0),
    BLOCK_LEVEL_REJECT(1),
    ACCOUNT_LEVEL_REJECT(2),
    RECEIVED(3),
    INCOMPLETE(4),
    REJECTED_BY_INTERMEDIARY(5),
    ALLOCATION_PENDING(6),
    REVERSED(7),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    AllocStatus(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(16);
        static
    {
        intSet.add(0);
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
        intSet.add(4);
        intSet.add(5);
        intSet.add(6);
        intSet.add(7);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static AllocStatus decode(final int representation)
    {
        switch(representation)
        {
        case 0: return ACCEPTED;
        case 1: return BLOCK_LEVEL_REJECT;
        case 2: return ACCOUNT_LEVEL_REJECT;
        case 3: return RECEIVED;
        case 4: return INCOMPLETE;
        case 5: return REJECTED_BY_INTERMEDIARY;
        case 6: return ALLOCATION_PENDING;
        case 7: return REVERSED;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
