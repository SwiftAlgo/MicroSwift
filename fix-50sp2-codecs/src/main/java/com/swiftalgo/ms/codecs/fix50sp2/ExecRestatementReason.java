/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum ExecRestatementReason implements IntRepresentable
{
    GT_CORPORATE_ACTION(0),
    GT_RENEWAL_RESTATEMENT(1),
    VERBAL_CHANGE(2),
    REPRICING_OF_ORDER(3),
    BROKER_OPTION(4),
    PARTIAL_DECLINE_OF_ORDERQTY(5),
    CANCEL_ON_TRADING_HALT(6),
    CANCEL_ON_SYSTEM_FAILURE(7),
    MARKET_OPTION(8),
    CANCELED_NOT_BEST(9),
    WAREHOUSE_RECAP(10),
    PEG_REFRESH(11),
    OTHER(99),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    ExecRestatementReason(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(26);
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
        intSet.add(99);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static ExecRestatementReason decode(final int representation)
    {
        switch(representation)
        {
        case 0: return GT_CORPORATE_ACTION;
        case 1: return GT_RENEWAL_RESTATEMENT;
        case 2: return VERBAL_CHANGE;
        case 3: return REPRICING_OF_ORDER;
        case 4: return BROKER_OPTION;
        case 5: return PARTIAL_DECLINE_OF_ORDERQTY;
        case 6: return CANCEL_ON_TRADING_HALT;
        case 7: return CANCEL_ON_SYSTEM_FAILURE;
        case 8: return MARKET_OPTION;
        case 9: return CANCELED_NOT_BEST;
        case 10: return WAREHOUSE_RECAP;
        case 11: return PEG_REFRESH;
        case 99: return OTHER;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
