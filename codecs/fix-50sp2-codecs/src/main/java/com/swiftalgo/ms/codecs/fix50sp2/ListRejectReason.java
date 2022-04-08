/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum ListRejectReason implements IntRepresentable
{
    BROKER_EXCHANGE_OPTION(0),
    EXCHANGE_CLOSED(2),
    TOO_LATE_TO_ENTER(4),
    UNKNOWN_ORDER(5),
    DUPLICATE_ORDER(6),
    UNSUPPORTED_ORDER_CHARACTERISTIC(11),
    OTHER(99),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    ListRejectReason(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(14);
        static
    {
        intSet.add(0);
        intSet.add(2);
        intSet.add(4);
        intSet.add(5);
        intSet.add(6);
        intSet.add(11);
        intSet.add(99);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static ListRejectReason decode(final int representation)
    {
        switch(representation)
        {
        case 0: return BROKER_EXCHANGE_OPTION;
        case 2: return EXCHANGE_CLOSED;
        case 4: return TOO_LATE_TO_ENTER;
        case 5: return UNKNOWN_ORDER;
        case 6: return DUPLICATE_ORDER;
        case 11: return UNSUPPORTED_ORDER_CHARACTERISTIC;
        case 99: return OTHER;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
