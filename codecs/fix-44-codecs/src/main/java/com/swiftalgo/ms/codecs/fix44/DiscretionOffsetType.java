/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum DiscretionOffsetType implements IntRepresentable
{
    PRICE(0),
    BASIS_POINTS(1),
    TICKS(2),
    PRICE_TIER_LEVEL(3),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    DiscretionOffsetType(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(8);
        static
    {
        intSet.add(0);
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static DiscretionOffsetType decode(final int representation)
    {
        switch(representation)
        {
        case 0: return PRICE;
        case 1: return BASIS_POINTS;
        case 2: return TICKS;
        case 3: return PRICE_TIER_LEVEL;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
