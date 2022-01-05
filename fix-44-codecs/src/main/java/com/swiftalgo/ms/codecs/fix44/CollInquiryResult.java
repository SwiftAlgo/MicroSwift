/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum CollInquiryResult implements IntRepresentable
{
    SUCCESSFUL(0),
    INVALID_OR_UNKNOWN_INSTRUMENT(1),
    INVALID_OR_UNKNOWN_COLLATERAL_TYPE(2),
    INVALID_PARTIES(3),
    INVALID_TRANSPORT_TYPE_REQUESTED(4),
    INVALID_DESTINATION_REQUESTED(5),
    NO_COLLATERAL_FOUND_FOR_THE_TRADE_SPECIFIED(6),
    NO_COLLATERAL_FOUND_FOR_THE_ORDER_SPECIFIED(7),
    COLLATERAL_INQUIRY_TYPE_NOT_SUPPORTED(8),
    UNAUTHORIZED_FOR_COLLATERAL_INQUIRY(9),
    OTHER(99),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    CollInquiryResult(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(22);
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
        intSet.add(99);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static CollInquiryResult decode(final int representation)
    {
        switch(representation)
        {
        case 0: return SUCCESSFUL;
        case 1: return INVALID_OR_UNKNOWN_INSTRUMENT;
        case 2: return INVALID_OR_UNKNOWN_COLLATERAL_TYPE;
        case 3: return INVALID_PARTIES;
        case 4: return INVALID_TRANSPORT_TYPE_REQUESTED;
        case 5: return INVALID_DESTINATION_REQUESTED;
        case 6: return NO_COLLATERAL_FOUND_FOR_THE_TRADE_SPECIFIED;
        case 7: return NO_COLLATERAL_FOUND_FOR_THE_ORDER_SPECIFIED;
        case 8: return COLLATERAL_INQUIRY_TYPE_NOT_SUPPORTED;
        case 9: return UNAUTHORIZED_FOR_COLLATERAL_INQUIRY;
        case 99: return OTHER;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
