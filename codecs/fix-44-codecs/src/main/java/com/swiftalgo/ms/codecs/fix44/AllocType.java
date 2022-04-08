/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum AllocType implements IntRepresentable
{
    CALCULATED(1),
    PRELIMINARY(2),
    READY_TO_BOOK_SINGLE_ORDER(5),
    WAREHOUSE_INSTRUCTION(7),
    REQUEST_TO_INTERMEDIARY(8),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    AllocType(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(10);
        static
    {
        intSet.add(1);
        intSet.add(2);
        intSet.add(5);
        intSet.add(7);
        intSet.add(8);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static AllocType decode(final int representation)
    {
        switch(representation)
        {
        case 1: return CALCULATED;
        case 2: return PRELIMINARY;
        case 5: return READY_TO_BOOK_SINGLE_ORDER;
        case 7: return WAREHOUSE_INSTRUCTION;
        case 8: return REQUEST_TO_INTERMEDIARY;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
