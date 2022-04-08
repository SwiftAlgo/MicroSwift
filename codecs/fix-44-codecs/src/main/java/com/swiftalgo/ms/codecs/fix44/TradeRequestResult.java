/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum TradeRequestResult implements IntRepresentable
{
    SUCCESSFUL(0),
    INVALID_OR_UNKNOWN_INSTRUMENT(1),
    INVALID_TYPE_OF_TRADE_REQUESTED(2),
    INVALID_PARTIES(3),
    INVALID_TRANSPORT_TYPE_REQUESTED(4),
    INVALID_DESTINATION_REQUESTED(5),
    TRADEREQUESTTYPE_NOT_SUPPORTED(8),
    UNAUTHORIZED_FOR_TRADE_CAPTURE_REPORT_REQUEST(9),
    OTHER(99),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    TradeRequestResult(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(18);
        static
    {
        intSet.add(0);
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
        intSet.add(4);
        intSet.add(5);
        intSet.add(8);
        intSet.add(9);
        intSet.add(99);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static TradeRequestResult decode(final int representation)
    {
        switch(representation)
        {
        case 0: return SUCCESSFUL;
        case 1: return INVALID_OR_UNKNOWN_INSTRUMENT;
        case 2: return INVALID_TYPE_OF_TRADE_REQUESTED;
        case 3: return INVALID_PARTIES;
        case 4: return INVALID_TRANSPORT_TYPE_REQUESTED;
        case 5: return INVALID_DESTINATION_REQUESTED;
        case 8: return TRADEREQUESTTYPE_NOT_SUPPORTED;
        case 9: return UNAUTHORIZED_FOR_TRADE_CAPTURE_REPORT_REQUEST;
        case 99: return OTHER;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
