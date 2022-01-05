/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum AllocCancReplaceReason implements IntRepresentable
{
    ORIGINAL_DETAILS_INCOMPLETE_INCORRECT(1),
    CHANGE_IN_UNDERLYING_ORDER_DETAILS(2),
    OTHER(99),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    AllocCancReplaceReason(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(6);
        static
    {
        intSet.add(1);
        intSet.add(2);
        intSet.add(99);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static AllocCancReplaceReason decode(final int representation)
    {
        switch(representation)
        {
        case 1: return ORIGINAL_DETAILS_INCOMPLETE_INCORRECT;
        case 2: return CHANGE_IN_UNDERLYING_ORDER_DETAILS;
        case 99: return OTHER;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
