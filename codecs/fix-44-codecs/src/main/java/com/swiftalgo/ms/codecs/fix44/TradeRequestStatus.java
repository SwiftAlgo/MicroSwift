/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum TradeRequestStatus implements IntRepresentable
{
    ACCEPTED(0),
    COMPLETED(1),
    REJECTED(2),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    TradeRequestStatus(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(6);
        static
    {
        intSet.add(0);
        intSet.add(1);
        intSet.add(2);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static TradeRequestStatus decode(final int representation)
    {
        switch(representation)
        {
        case 0: return ACCEPTED;
        case 1: return COMPLETED;
        case 2: return REJECTED;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
