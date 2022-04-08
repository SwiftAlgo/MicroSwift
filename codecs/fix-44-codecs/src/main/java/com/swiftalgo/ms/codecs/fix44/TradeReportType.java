/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum TradeReportType implements IntRepresentable
{
    SUBMIT(0),
    ALLEGED(1),
    ACCEPT(2),
    DECLINE(3),
    ADDENDUM(4),
    NO_WAS(5),
    TRADE_REPORT_CANCEL(6),
    LOCKED_IN_TRADE_BREAK(7),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    TradeReportType(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(16);
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
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static TradeReportType decode(final int representation)
    {
        switch(representation)
        {
        case 0: return SUBMIT;
        case 1: return ALLEGED;
        case 2: return ACCEPT;
        case 3: return DECLINE;
        case 4: return ADDENDUM;
        case 5: return NO_WAS;
        case 6: return TRADE_REPORT_CANCEL;
        case 7: return LOCKED_IN_TRADE_BREAK;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
