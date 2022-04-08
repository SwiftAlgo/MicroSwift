/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum QuoteRejectReason implements IntRepresentable
{
    UNKNOWN_SYMBOL(1),
    EXCHANGE_CLOSED(2),
    QUOTE_REQUEST_EXCEEDS_LIMIT(3),
    TOO_LATE_TO_ENTER(4),
    UNKNOWN_QUOTE(5),
    DUPLICATE_QUOTE(6),
    INVALID_BID_ASK_SPREAD(7),
    INVALID_PRICE(8),
    NOT_AUTHORIZED_TO_QUOTE_SECURITY(9),
    PRICE_EXCEEDS_CURRENT_PRICE_BAND(10),
    QUOTE_LOCKED_UNABLE_TO_UPDATE_CANCEL(11),
    INVALID_OR_UNKNOWN_SECURITY_ISSUER(12),
    INVALID_OR_UNKNOWN_ISSUER_OF_UNDERLYING_SECURITY(13),
    OTHER(99),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    QuoteRejectReason(final int representation)
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
        intSet.add(99);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static QuoteRejectReason decode(final int representation)
    {
        switch(representation)
        {
        case 1: return UNKNOWN_SYMBOL;
        case 2: return EXCHANGE_CLOSED;
        case 3: return QUOTE_REQUEST_EXCEEDS_LIMIT;
        case 4: return TOO_LATE_TO_ENTER;
        case 5: return UNKNOWN_QUOTE;
        case 6: return DUPLICATE_QUOTE;
        case 7: return INVALID_BID_ASK_SPREAD;
        case 8: return INVALID_PRICE;
        case 9: return NOT_AUTHORIZED_TO_QUOTE_SECURITY;
        case 10: return PRICE_EXCEEDS_CURRENT_PRICE_BAND;
        case 11: return QUOTE_LOCKED_UNABLE_TO_UPDATE_CANCEL;
        case 12: return INVALID_OR_UNKNOWN_SECURITY_ISSUER;
        case 13: return INVALID_OR_UNKNOWN_ISSUER_OF_UNDERLYING_SECURITY;
        case 99: return OTHER;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
