/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum PegRoundDirection implements IntRepresentable
{
    MORE_AGGRESSIVE_ON_A_BUY_ORDER_ROUND_THE_PRICE_UP_TO_THE_NEAREST_TICK_ON_A_SELL_ORDER_ROUND_DOWN_TO_THE_NEAREST_TICK(1),
    MORE_PASSIVE_ON_A_BUY_ORDER_ROUND_DOWN_TO_THE_NEAREST_TICK_ON_A_SELL_ORDER_ROUND_UP_TO_THE_NEAREST_TICK(2),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    PegRoundDirection(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(4);
        static
    {
        intSet.add(1);
        intSet.add(2);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static PegRoundDirection decode(final int representation)
    {
        switch(representation)
        {
        case 1: return MORE_AGGRESSIVE_ON_A_BUY_ORDER_ROUND_THE_PRICE_UP_TO_THE_NEAREST_TICK_ON_A_SELL_ORDER_ROUND_DOWN_TO_THE_NEAREST_TICK;
        case 2: return MORE_PASSIVE_ON_A_BUY_ORDER_ROUND_DOWN_TO_THE_NEAREST_TICK_ON_A_SELL_ORDER_ROUND_UP_TO_THE_NEAREST_TICK;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
