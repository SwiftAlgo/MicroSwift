/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum MultilegPriceMethod implements IntRepresentable
{
    NET_PRICE(0),
    REVERSED_NET_PRICE(1),
    YIELD_DIFFERENCE(2),
    INDIVIDUAL(3),
    CONTRACT_WEIGHTED_AVERAGE_PRICE(4),
    MULTIPLIED_PRICE(5),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    MultilegPriceMethod(final int representation)
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
        intSet.add(5);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static MultilegPriceMethod decode(final int representation)
    {
        switch(representation)
        {
        case 0: return NET_PRICE;
        case 1: return REVERSED_NET_PRICE;
        case 2: return YIELD_DIFFERENCE;
        case 3: return INDIVIDUAL;
        case 4: return CONTRACT_WEIGHTED_AVERAGE_PRICE;
        case 5: return MULTIPLIED_PRICE;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
