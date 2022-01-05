/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum CxlRejReason implements IntRepresentable
{
    TOO_LATE_TO_CANCEL(0),
    UNKNOWN_ORDER(1),
    BROKER_EXCHANGE_OPTION(2),
    ORDER_ALREADY_IN_PENDING_CANCEL_OR_PENDING_REPLACE_STATUS(3),
    UNABLE_TO_PROCESS_ORDER_MASS_CANCEL_REQUEST(4),
    ORIGORDMODTIME_DID_NOT_MATCH_LAST_TRANSACTTIME_OF_ORDER(5),
    DUPLICATE_CLORDID_RECEIVED(6),
    OTHER(99),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    CxlRejReason(final int representation)
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
        intSet.add(99);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static CxlRejReason decode(final int representation)
    {
        switch(representation)
        {
        case 0: return TOO_LATE_TO_CANCEL;
        case 1: return UNKNOWN_ORDER;
        case 2: return BROKER_EXCHANGE_OPTION;
        case 3: return ORDER_ALREADY_IN_PENDING_CANCEL_OR_PENDING_REPLACE_STATUS;
        case 4: return UNABLE_TO_PROCESS_ORDER_MASS_CANCEL_REQUEST;
        case 5: return ORIGORDMODTIME_DID_NOT_MATCH_LAST_TRANSACTTIME_OF_ORDER;
        case 6: return DUPLICATE_CLORDID_RECEIVED;
        case 99: return OTHER;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
