/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum StatsType implements IntRepresentable
{
    EXCHANGE_LAST(1),
    HIGH_LOW_PRICE(2),
    AVERAGE_PRICE(3),
    TURNOVER(4),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    StatsType(final int representation)
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
    public static StatsType decode(final int representation)
    {
        switch(representation)
        {
        case 1: return EXCHANGE_LAST;
        case 2: return HIGH_LOW_PRICE;
        case 3: return AVERAGE_PRICE;
        case 4: return TURNOVER;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
