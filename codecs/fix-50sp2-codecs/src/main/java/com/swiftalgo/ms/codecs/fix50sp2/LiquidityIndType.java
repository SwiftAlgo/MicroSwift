/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum LiquidityIndType implements IntRepresentable
{
    _5_DAY_MOVING_AVERAGE(1),
    _20_DAY_MOVING_AVERAGE(2),
    NORMAL_MARKET_SIZE(3),
    OTHER(4),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    LiquidityIndType(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(8);
        static
    {
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
        intSet.add(4);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static LiquidityIndType decode(final int representation)
    {
        switch(representation)
        {
        case 1: return _5_DAY_MOVING_AVERAGE;
        case 2: return _20_DAY_MOVING_AVERAGE;
        case 3: return NORMAL_MARKET_SIZE;
        case 4: return OTHER;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
