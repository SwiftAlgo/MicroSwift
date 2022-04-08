/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum QuoteRequestRejectReason implements IntRepresentable
{
    UNKNOWN_SYMBOL(1),
    EXCHANGE_CLOSED(2),
    QUOTE_REQUEST_EXCEEDS_LIMIT(3),
    TOO_LATE_TO_ENTER(4),
    INVALID_PRICE(5),
    NOT_AUTHORIZED_TO_REQUEST_QUOTE(6),
    NO_MATCH_FOR_INQUIRY(7),
    NO_MARKET_FOR_INSTRUMENT(8),
    NO_INVENTORY(9),
    PASS(10),
    OTHER(99),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    QuoteRequestRejectReason(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(22);
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
        intSet.add(99);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static QuoteRequestRejectReason decode(final int representation)
    {
        switch(representation)
        {
        case 1: return UNKNOWN_SYMBOL;
        case 2: return EXCHANGE_CLOSED;
        case 3: return QUOTE_REQUEST_EXCEEDS_LIMIT;
        case 4: return TOO_LATE_TO_ENTER;
        case 5: return INVALID_PRICE;
        case 6: return NOT_AUTHORIZED_TO_REQUEST_QUOTE;
        case 7: return NO_MATCH_FOR_INQUIRY;
        case 8: return NO_MARKET_FOR_INSTRUMENT;
        case 9: return NO_INVENTORY;
        case 10: return PASS;
        case 99: return OTHER;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
