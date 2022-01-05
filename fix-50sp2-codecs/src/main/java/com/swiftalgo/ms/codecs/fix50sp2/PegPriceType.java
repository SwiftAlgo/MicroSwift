/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum PegPriceType implements IntRepresentable
{
    LAST_PEG(1),
    MID_PRICE_PEG(2),
    OPENING_PEG(3),
    MARKET_PEG(4),
    PRIMARY_PEG(5),
    PEG_TO_VWAP(7),
    TRAILING_STOP_PEG(8),
    PEG_TO_LIMIT_PRICE(9),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    PegPriceType(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(16);
        static
    {
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
        intSet.add(4);
        intSet.add(5);
        intSet.add(7);
        intSet.add(8);
        intSet.add(9);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static PegPriceType decode(final int representation)
    {
        switch(representation)
        {
        case 1: return LAST_PEG;
        case 2: return MID_PRICE_PEG;
        case 3: return OPENING_PEG;
        case 4: return MARKET_PEG;
        case 5: return PRIMARY_PEG;
        case 7: return PEG_TO_VWAP;
        case 8: return TRAILING_STOP_PEG;
        case 9: return PEG_TO_LIMIT_PRICE;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
