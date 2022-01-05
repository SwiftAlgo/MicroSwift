/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum AllocRejCode implements IntRepresentable
{
    UNKNOWN_ACCOUNT(0),
    INCORRECT_QUANTITY(1),
    INCORRECT_AVERAGE_PRICE(2),
    UNKNOWN_EXECUTING_BROKER_MNEMONIC(3),
    COMMISSION_DIFFERENCE(4),
    UNKNOWN_ORDERID(5),
    UNKNOWN_LISTID(6),
    OTHER(7),
    INCORRECT_ALLOCATED_QUANTITY(8),
    CALCULATION_DIFFERENCE(9),
    UNKNOWN_OR_STALE_EXEC_ID(10),
    MISMATCHED_DATA_VALUE(11),
    UNKNOWN_CLORDID(12),
    WAREHOUSE_REQUEST_REJECTED(13),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    AllocRejCode(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(28);
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
        intSet.add(8);
        intSet.add(9);
        intSet.add(10);
        intSet.add(11);
        intSet.add(12);
        intSet.add(13);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static AllocRejCode decode(final int representation)
    {
        switch(representation)
        {
        case 0: return UNKNOWN_ACCOUNT;
        case 1: return INCORRECT_QUANTITY;
        case 2: return INCORRECT_AVERAGE_PRICE;
        case 3: return UNKNOWN_EXECUTING_BROKER_MNEMONIC;
        case 4: return COMMISSION_DIFFERENCE;
        case 5: return UNKNOWN_ORDERID;
        case 6: return UNKNOWN_LISTID;
        case 7: return OTHER;
        case 8: return INCORRECT_ALLOCATED_QUANTITY;
        case 9: return CALCULATION_DIFFERENCE;
        case 10: return UNKNOWN_OR_STALE_EXEC_ID;
        case 11: return MISMATCHED_DATA_VALUE;
        case 12: return UNKNOWN_CLORDID;
        case 13: return WAREHOUSE_REQUEST_REJECTED;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
