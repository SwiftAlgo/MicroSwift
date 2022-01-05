/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum TradeReportRejectReason implements IntRepresentable
{
    SUCCESSFUL(0),
    INVALID_PARTY_INFORMATION(1),
    UNKNOWN_INSTRUMENT(2),
    UNAUTHORIZED_TO_REPORT_TRADES(3),
    INVALID_TRADE_TYPE(4),
    OTHER(99),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    TradeReportRejectReason(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(12);
        static
    {
        intSet.add(0);
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
        intSet.add(4);
        intSet.add(99);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static TradeReportRejectReason decode(final int representation)
    {
        switch(representation)
        {
        case 0: return SUCCESSFUL;
        case 1: return INVALID_PARTY_INFORMATION;
        case 2: return UNKNOWN_INSTRUMENT;
        case 3: return UNAUTHORIZED_TO_REPORT_TRADES;
        case 4: return INVALID_TRADE_TYPE;
        case 99: return OTHER;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
