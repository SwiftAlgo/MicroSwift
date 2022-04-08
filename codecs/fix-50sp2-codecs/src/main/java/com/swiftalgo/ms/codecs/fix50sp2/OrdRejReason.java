/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum OrdRejReason implements IntRepresentable
{
    BROKER_EXCHANGE_OPTION(0),
    UNKNOWN_SYMBOL(1),
    EXCHANGE_CLOSED(2),
    ORDER_EXCEEDS_LIMIT(3),
    TOO_LATE_TO_ENTER(4),
    UNKNOWN_ORDER(5),
    DUPLICATE_ORDER(6),
    DUPLICATE_OF_A_VERBALLY_COMMUNICATED_ORDER(7),
    STALE_ORDER(8),
    TRADE_ALONG_REQUIRED(9),
    INVALID_INVESTOR_ID(10),
    UNSUPPORTED_ORDER_CHARACTERISTIC(11),
    SURVEILLENCE_OPTION(12),
    INCORRECT_QUANTITY(13),
    INCORRECT_ALLOCATED_QUANTITY(14),
    UNKNOWN_ACCOUNT(15),
    PRICE_EXCEEDS_CURRENT_PRICE_BAND(16),
    INVALID_PRICE_INCREMENT(18),
    OTHER(99),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    OrdRejReason(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(38);
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
        intSet.add(14);
        intSet.add(15);
        intSet.add(16);
        intSet.add(18);
        intSet.add(99);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static OrdRejReason decode(final int representation)
    {
        switch(representation)
        {
        case 0: return BROKER_EXCHANGE_OPTION;
        case 1: return UNKNOWN_SYMBOL;
        case 2: return EXCHANGE_CLOSED;
        case 3: return ORDER_EXCEEDS_LIMIT;
        case 4: return TOO_LATE_TO_ENTER;
        case 5: return UNKNOWN_ORDER;
        case 6: return DUPLICATE_ORDER;
        case 7: return DUPLICATE_OF_A_VERBALLY_COMMUNICATED_ORDER;
        case 8: return STALE_ORDER;
        case 9: return TRADE_ALONG_REQUIRED;
        case 10: return INVALID_INVESTOR_ID;
        case 11: return UNSUPPORTED_ORDER_CHARACTERISTIC;
        case 12: return SURVEILLENCE_OPTION;
        case 13: return INCORRECT_QUANTITY;
        case 14: return INCORRECT_ALLOCATED_QUANTITY;
        case 15: return UNKNOWN_ACCOUNT;
        case 16: return PRICE_EXCEEDS_CURRENT_PRICE_BAND;
        case 18: return INVALID_PRICE_INCREMENT;
        case 99: return OTHER;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
