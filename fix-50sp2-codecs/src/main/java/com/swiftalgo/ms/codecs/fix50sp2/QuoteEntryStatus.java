/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum QuoteEntryStatus implements IntRepresentable
{
    ACCEPTED(0),
    REJECTED(5),
    REMOVED_FROM_MARKET(6),
    EXPIRED(7),
    LOCKED_MARKET_WARNING(12),
    CROSS_MARKET_WARNING(13),
    CANCELED_DUE_TO_LOCK_MARKET(14),
    CANCELED_DUE_TO_CROSS_MARKET(15),
    ACTIVE(16),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    QuoteEntryStatus(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(18);
        static
    {
        intSet.add(0);
        intSet.add(5);
        intSet.add(6);
        intSet.add(7);
        intSet.add(12);
        intSet.add(13);
        intSet.add(14);
        intSet.add(15);
        intSet.add(16);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static QuoteEntryStatus decode(final int representation)
    {
        switch(representation)
        {
        case 0: return ACCEPTED;
        case 5: return REJECTED;
        case 6: return REMOVED_FROM_MARKET;
        case 7: return EXPIRED;
        case 12: return LOCKED_MARKET_WARNING;
        case 13: return CROSS_MARKET_WARNING;
        case 14: return CANCELED_DUE_TO_LOCK_MARKET;
        case 15: return CANCELED_DUE_TO_CROSS_MARKET;
        case 16: return ACTIVE;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
