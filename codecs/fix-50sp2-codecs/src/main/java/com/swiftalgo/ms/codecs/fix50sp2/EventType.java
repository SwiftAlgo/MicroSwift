/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum EventType implements IntRepresentable
{
    PUT(1),
    CALL(2),
    TENDER(3),
    SINKING_FUND_CALL(4),
    ACTIVATION(5),
    INACTIVIATION(6),
    LAST_ELIGIBLE_TRADE_DATE(7),
    SWAP_START_DATE(8),
    SWAP_END_DATE(9),
    SWAP_ROLL_DATE(10),
    SWAP_NEXT_START_DATE(11),
    SWAP_NEXT_ROLL_DATE(12),
    FIRST_DELIVERY_DATE(13),
    LAST_DELIVERY_DATE(14),
    INITIAL_INVENTORY_DUE_DATE(15),
    FINAL_INVENTORY_DUE_DATE(16),
    FIRST_INTENT_DATE(17),
    LAST_INTENT_DATE(18),
    POSITION_REMOVAL_DATE(19),
    OTHER(99),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    EventType(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(40);
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
        intSet.add(15);
        intSet.add(16);
        intSet.add(17);
        intSet.add(18);
        intSet.add(19);
        intSet.add(99);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static EventType decode(final int representation)
    {
        switch(representation)
        {
        case 1: return PUT;
        case 2: return CALL;
        case 3: return TENDER;
        case 4: return SINKING_FUND_CALL;
        case 5: return ACTIVATION;
        case 6: return INACTIVIATION;
        case 7: return LAST_ELIGIBLE_TRADE_DATE;
        case 8: return SWAP_START_DATE;
        case 9: return SWAP_END_DATE;
        case 10: return SWAP_ROLL_DATE;
        case 11: return SWAP_NEXT_START_DATE;
        case 12: return SWAP_NEXT_ROLL_DATE;
        case 13: return FIRST_DELIVERY_DATE;
        case 14: return LAST_DELIVERY_DATE;
        case 15: return INITIAL_INVENTORY_DUE_DATE;
        case 16: return FINAL_INVENTORY_DUE_DATE;
        case 17: return FIRST_INTENT_DATE;
        case 18: return LAST_INTENT_DATE;
        case 19: return POSITION_REMOVAL_DATE;
        case 99: return OTHER;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
