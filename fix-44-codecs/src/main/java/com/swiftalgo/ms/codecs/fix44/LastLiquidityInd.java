/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum LastLiquidityInd implements IntRepresentable
{
    ADDED_LIQUIDITY(1),
    REMOVED_LIQUIDITY(2),
    LIQUIDITY_ROUTED_OUT(3),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    LastLiquidityInd(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(6);
        static
    {
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static LastLiquidityInd decode(final int representation)
    {
        switch(representation)
        {
        case 1: return ADDED_LIQUIDITY;
        case 2: return REMOVED_LIQUIDITY;
        case 3: return LIQUIDITY_ROUTED_OUT;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
