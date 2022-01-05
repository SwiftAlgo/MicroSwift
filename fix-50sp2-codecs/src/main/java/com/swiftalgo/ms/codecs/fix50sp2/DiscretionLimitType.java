/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum DiscretionLimitType implements IntRepresentable
{
    OR_BETTER_PRICE_IMPROVEMENT_ALLOWED(0),
    STRICT_LIMIT_IS_A_STRICT_LIMIT(1),
    OR_WORSE_FOR_A_BUY_THE_DISCRETION_PRICE_IS_A_MINIMUM_AND_FOR_A_SELL_THE_DISCRETION_PRICE_IS_A_MAXIMUM(2),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    DiscretionLimitType(final int representation)
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
    public static DiscretionLimitType decode(final int representation)
    {
        switch(representation)
        {
        case 0: return OR_BETTER_PRICE_IMPROVEMENT_ALLOWED;
        case 1: return STRICT_LIMIT_IS_A_STRICT_LIMIT;
        case 2: return OR_WORSE_FOR_A_BUY_THE_DISCRETION_PRICE_IS_A_MINIMUM_AND_FOR_A_SELL_THE_DISCRETION_PRICE_IS_A_MAXIMUM;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
