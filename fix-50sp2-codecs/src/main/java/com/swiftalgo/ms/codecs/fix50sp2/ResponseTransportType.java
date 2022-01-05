/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum ResponseTransportType implements IntRepresentable
{
    INBAND_TRANSPORT_THE_REQUEST_WAS_SENT_OVER(0),
    OUT_OF_BAND_PRE_ARRANGED_OUT_OF_BAND_DELIVERY_MECHANIZM_(1),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    ResponseTransportType(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(4);
        static
    {
        intSet.add(0);
        intSet.add(1);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static ResponseTransportType decode(final int representation)
    {
        switch(representation)
        {
        case 0: return INBAND_TRANSPORT_THE_REQUEST_WAS_SENT_OVER;
        case 1: return OUT_OF_BAND_PRE_ARRANGED_OUT_OF_BAND_DELIVERY_MECHANIZM_;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
