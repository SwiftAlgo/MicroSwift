/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum TradeReportTransType implements IntRepresentable
{
    NEW(0),
    CANCEL(1),
    REPLACE(2),
    RELEASE(3),
    REVERSE(4),
    CANCEL_DUE_TO_BACK_OUT_OF_TRADE(5),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    TradeReportTransType(final int representation)
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
    public static TradeReportTransType decode(final int representation)
    {
        switch(representation)
        {
        case 0: return NEW;
        case 1: return CANCEL;
        case 2: return REPLACE;
        case 3: return RELEASE;
        case 4: return REVERSE;
        case 5: return CANCEL_DUE_TO_BACK_OUT_OF_TRADE;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
