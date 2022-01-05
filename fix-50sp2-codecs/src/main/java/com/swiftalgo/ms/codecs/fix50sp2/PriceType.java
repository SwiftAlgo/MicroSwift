/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum PriceType implements IntRepresentable
{
    PERCENTAGE(1),
    PER_UNIT(2),
    FIXED_AMOUNT(3),
    DISCOUNT_PERCENTAGE_POINTS_BELOW_PAR(4),
    PREMIUM_PERCENTAGE_POINTS_OVER_PAR(5),
    SPREAD(6),
    TED_PRICE(7),
    TED_YIELD(8),
    YIELD(9),
    FIXED_CABINET_TRADE_PRICE(10),
    VARIABLE_CABINET_TRADE_PRICE(11),
    PRODUCT_TICKS_IN_HALFS(13),
    PRODUCT_TICKS_IN_FOURTHS(14),
    PRODUCT_TICKS_IN_EIGHTS(15),
    PRODUCT_TICKS_IN_SIXTEENTHS(16),
    PRODUCT_TICKS_IN_THIRTY_SECONDS(17),
    PRODUCT_TICKS_IN_SIXTY_FORTHS(18),
    PRODUCT_TICKS_IN_ONE_TWENTY_EIGHTS(19),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    PriceType(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(36);
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
        intSet.add(11);
        intSet.add(13);
        intSet.add(14);
        intSet.add(15);
        intSet.add(16);
        intSet.add(17);
        intSet.add(18);
        intSet.add(19);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static PriceType decode(final int representation)
    {
        switch(representation)
        {
        case 1: return PERCENTAGE;
        case 2: return PER_UNIT;
        case 3: return FIXED_AMOUNT;
        case 4: return DISCOUNT_PERCENTAGE_POINTS_BELOW_PAR;
        case 5: return PREMIUM_PERCENTAGE_POINTS_OVER_PAR;
        case 6: return SPREAD;
        case 7: return TED_PRICE;
        case 8: return TED_YIELD;
        case 9: return YIELD;
        case 10: return FIXED_CABINET_TRADE_PRICE;
        case 11: return VARIABLE_CABINET_TRADE_PRICE;
        case 13: return PRODUCT_TICKS_IN_HALFS;
        case 14: return PRODUCT_TICKS_IN_FOURTHS;
        case 15: return PRODUCT_TICKS_IN_EIGHTS;
        case 16: return PRODUCT_TICKS_IN_SIXTEENTHS;
        case 17: return PRODUCT_TICKS_IN_THIRTY_SECONDS;
        case 18: return PRODUCT_TICKS_IN_SIXTY_FORTHS;
        case 19: return PRODUCT_TICKS_IN_ONE_TWENTY_EIGHTS;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
