/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

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
    SELLSIDE_CALCULATED_USING_PRELIMINARY(3),
    SELLSIDE_CALCULATED_WITHOUT_PRELIMINARY(4),
    READY_TO_BOOK_SINGLE_ORDER(5),
    BUYSIDE_READY_TO_BOOK_COMBINED_SET_OF_ORDERS(6),
    WAREHOUSE_INSTRUCTION(7),
    REQUEST_TO_INTERMEDIARY(8),
    ACCEPT(9),
    REJECT(10),
    ACCEPT_PENDING(11),
    INCOMPLETE_GROUP(12),
    COMPLETE_GROUP(13),
    REVERSAL_PENDING(14),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    AllocType(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(28);
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
        intSet.add(10);
        intSet.add(11);
        intSet.add(12);
        intSet.add(13);
        intSet.add(14);
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
        case 3: return SELLSIDE_CALCULATED_USING_PRELIMINARY;
        case 4: return SELLSIDE_CALCULATED_WITHOUT_PRELIMINARY;
        case 5: return READY_TO_BOOK_SINGLE_ORDER;
        case 6: return BUYSIDE_READY_TO_BOOK_COMBINED_SET_OF_ORDERS;
        case 7: return WAREHOUSE_INSTRUCTION;
        case 8: return REQUEST_TO_INTERMEDIARY;
        case 9: return ACCEPT;
        case 10: return REJECT;
        case 11: return ACCEPT_PENDING;
        case 12: return INCOMPLETE_GROUP;
        case 13: return COMPLETE_GROUP;
        case 14: return REVERSAL_PENDING;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
