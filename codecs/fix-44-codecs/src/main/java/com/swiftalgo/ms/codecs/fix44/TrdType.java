/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum TrdType implements IntRepresentable
{
    REGULAR_TRADE(0),
    BLOCK_TRADE(1),
    EFP(2),
    TRANSFER(3),
    LATE_TRADE(4),
    T_TRADE(5),
    WEIGHTED_AVERAGE_PRICE_TRADE(6),
    BUNCHED_TRADE(7),
    LATE_BUNCHED_TRADE(8),
    PRIOR_REFERENCE_PRICE_TRADE(9),
    AFTER_HOURS_TRADE(10),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    TrdType(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(22);
        static
    {
        intSet.add(0);
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
    public static TrdType decode(final int representation)
    {
        switch(representation)
        {
        case 0: return REGULAR_TRADE;
        case 1: return BLOCK_TRADE;
        case 2: return EFP;
        case 3: return TRANSFER;
        case 4: return LATE_TRADE;
        case 5: return T_TRADE;
        case 6: return WEIGHTED_AVERAGE_PRICE_TRADE;
        case 7: return BUNCHED_TRADE;
        case 8: return LATE_BUNCHED_TRADE;
        case 9: return PRIOR_REFERENCE_PRICE_TRADE;
        case 10: return AFTER_HOURS_TRADE;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
