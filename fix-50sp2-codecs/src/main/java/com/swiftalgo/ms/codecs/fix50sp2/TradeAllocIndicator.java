/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum TradeAllocIndicator implements IntRepresentable
{
    ALLOCATION_NOT_REQUIRED(0),
    ALLOCATION_REQUIRED(1),
    USE_ALLOCATION_PROVIDED_WITH_THE_TRADE(2),
    ALLOCATION_GIVE_UP_EXECUTOR(3),
    ALLOCATION_FROM_EXECUTOR(4),
    ALLOCATION_TO_CLAIM_ACCOUNT(5),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    TradeAllocIndicator(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(12);
        static
    {
        intSet.add(0);
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
        intSet.add(4);
        intSet.add(5);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static TradeAllocIndicator decode(final int representation)
    {
        switch(representation)
        {
        case 0: return ALLOCATION_NOT_REQUIRED;
        case 1: return ALLOCATION_REQUIRED;
        case 2: return USE_ALLOCATION_PROVIDED_WITH_THE_TRADE;
        case 3: return ALLOCATION_GIVE_UP_EXECUTOR;
        case 4: return ALLOCATION_FROM_EXECUTOR;
        case 5: return ALLOCATION_TO_CLAIM_ACCOUNT;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
