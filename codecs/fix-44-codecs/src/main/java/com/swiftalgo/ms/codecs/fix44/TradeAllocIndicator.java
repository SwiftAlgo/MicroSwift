/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum TradeAllocIndicator implements IntRepresentable
{
    ALLOCATION_NOT_REQUIRED(0),
    ALLOCATION_REQUIRED(1),
    USE_ALLOCATION_PROVIDED_WITH_THE_TRADE(2),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    TradeAllocIndicator(final int representation)
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
    public static TradeAllocIndicator decode(final int representation)
    {
        switch(representation)
        {
        case 0: return ALLOCATION_NOT_REQUIRED;
        case 1: return ALLOCATION_REQUIRED;
        case 2: return USE_ALLOCATION_PROVIDED_WITH_THE_TRADE;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
