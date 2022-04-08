/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum StrikePriceDeterminationMethod implements IntRepresentable
{
    FIXED_STRIKE(1),
    STRIKE_SET_AT_EXPIRATION_TO_UNDERLYING_OR_OTHER_VALUE(2),
    STRIKE_SET_TO_AVERAGE_OF_UNDERLYING_SETTLEMENT_PRICE_ACROSS_THE_LIFE_OF_THE_OPTION(3),
    STRIKE_SET_TO_OPTIMAL_VALUE(4),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    StrikePriceDeterminationMethod(final int representation)
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
    public static StrikePriceDeterminationMethod decode(final int representation)
    {
        switch(representation)
        {
        case 1: return FIXED_STRIKE;
        case 2: return STRIKE_SET_AT_EXPIRATION_TO_UNDERLYING_OR_OTHER_VALUE;
        case 3: return STRIKE_SET_TO_AVERAGE_OF_UNDERLYING_SETTLEMENT_PRICE_ACROSS_THE_LIFE_OF_THE_OPTION;
        case 4: return STRIKE_SET_TO_OPTIMAL_VALUE;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
