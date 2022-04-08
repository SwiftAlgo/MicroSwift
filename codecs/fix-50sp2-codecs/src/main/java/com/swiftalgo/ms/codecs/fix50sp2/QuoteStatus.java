/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum QuoteStatus implements IntRepresentable
{
    ACCEPTED(0),
    CANCEL_FOR_SYMBOL(1),
    CANCELED_FOR_SECURITY_TYPE(2),
    CANCELED_FOR_UNDERLYING(3),
    CANCELED_ALL(4),
    REJECTED(5),
    REMOVED_FROM_MARKET(6),
    EXPIRED(7),
    QUERY(8),
    QUOTE_NOT_FOUND(9),
    PENDING(10),
    PASS(11),
    LOCKED_MARKET_WARNING(12),
    CROSS_MARKET_WARNING(13),
    CANCELED_DUE_TO_LOCK_MARKET(14),
    CANCELED_DUE_TO_CROSS_MARKET(15),
    ACTIVE(16),
    CANCELED(17),
    UNSOLICITED_QUOTE_REPLENISHMENT(18),
    PENDING_END_TRADE(19),
    TOO_LATE_TO_END(20),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    QuoteStatus(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(42);
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
        intSet.add(17);
        intSet.add(18);
        intSet.add(19);
        intSet.add(20);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static QuoteStatus decode(final int representation)
    {
        switch(representation)
        {
        case 0: return ACCEPTED;
        case 1: return CANCEL_FOR_SYMBOL;
        case 2: return CANCELED_FOR_SECURITY_TYPE;
        case 3: return CANCELED_FOR_UNDERLYING;
        case 4: return CANCELED_ALL;
        case 5: return REJECTED;
        case 6: return REMOVED_FROM_MARKET;
        case 7: return EXPIRED;
        case 8: return QUERY;
        case 9: return QUOTE_NOT_FOUND;
        case 10: return PENDING;
        case 11: return PASS;
        case 12: return LOCKED_MARKET_WARNING;
        case 13: return CROSS_MARKET_WARNING;
        case 14: return CANCELED_DUE_TO_LOCK_MARKET;
        case 15: return CANCELED_DUE_TO_CROSS_MARKET;
        case 16: return ACTIVE;
        case 17: return CANCELED;
        case 18: return UNSOLICITED_QUOTE_REPLENISHMENT;
        case 19: return PENDING_END_TRADE;
        case 20: return TOO_LATE_TO_END;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
