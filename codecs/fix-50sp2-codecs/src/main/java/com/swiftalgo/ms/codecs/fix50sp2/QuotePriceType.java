/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum QuotePriceType implements IntRepresentable
{
    PERCENT(1),
    PER_SHARE(2),
    FIXED_AMOUNT(3),
    DISCOUNT_PERCENTAGE_POINTS_BELOW_PAR(4),
    PREMIUM_PERCENTAGE_POINTS_OVER_PAR(5),
    SPREAD_BASIS_POINTS_RELATIVE_TO_BENCHMARK(6),
    TED_PRICE(7),
    TED_YIELD(8),
    YIELD_SPREAD(9),
    YIELD(10),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    QuotePriceType(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(20);
        static
    {
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
        intSet.add(4);
        intSet.add(5);
        intSet.add(6);
        intSet.add(7);
        intSet.add(8);
        intSet.add(9);
        intSet.add(10);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static QuotePriceType decode(final int representation)
    {
        switch(representation)
        {
        case 1: return PERCENT;
        case 2: return PER_SHARE;
        case 3: return FIXED_AMOUNT;
        case 4: return DISCOUNT_PERCENTAGE_POINTS_BELOW_PAR;
        case 5: return PREMIUM_PERCENTAGE_POINTS_OVER_PAR;
        case 6: return SPREAD_BASIS_POINTS_RELATIVE_TO_BENCHMARK;
        case 7: return TED_PRICE;
        case 8: return TED_YIELD;
        case 9: return YIELD_SPREAD;
        case 10: return YIELD;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
