/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum QuoteEntryRejectReason implements IntRepresentable
{
    UNKNOWN_SYMBOL(1),
    EXCHANGE_CLOSED(2),
    QUOTE_EXCEEDS_LIMIT(3),
    TOO_LATE_TO_ENTER(4),
    UNKNOWN_QUOTE(5),
    DUPLICATE_QUOTE(6),
    INVALID_BID_ASK_SPREAD(7),
    INVALID_PRICE(8),
    NOT_AUTHORIZED_TO_QUOTE_SECURITY(9),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    QuoteEntryRejectReason(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(18);
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
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static QuoteEntryRejectReason decode(final int representation)
    {
        switch(representation)
        {
        case 1: return UNKNOWN_SYMBOL;
        case 2: return EXCHANGE_CLOSED;
        case 3: return QUOTE_EXCEEDS_LIMIT;
        case 4: return TOO_LATE_TO_ENTER;
        case 5: return UNKNOWN_QUOTE;
        case 6: return DUPLICATE_QUOTE;
        case 7: return INVALID_BID_ASK_SPREAD;
        case 8: return INVALID_PRICE;
        case 9: return NOT_AUTHORIZED_TO_QUOTE_SECURITY;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
