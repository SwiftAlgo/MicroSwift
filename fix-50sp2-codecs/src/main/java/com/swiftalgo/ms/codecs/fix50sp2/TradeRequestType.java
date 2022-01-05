/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum TradeRequestType implements IntRepresentable
{
    ALL_TRADES(0),
    MATCHED_TRADES_MATCHING_CRITERIA_PROVIDED_ON_REQUEST(1),
    UNMATCHED_TRADES_THAT_MATCH_CRITERIA(2),
    UNREPORTED_TRADES_THAT_MATCH_CRITERIA(3),
    ADVISORIES_THAT_MATCH_CRITERIA(4),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    TradeRequestType(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(10);
        static
    {
        intSet.add(0);
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
        intSet.add(4);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static TradeRequestType decode(final int representation)
    {
        switch(representation)
        {
        case 0: return ALL_TRADES;
        case 1: return MATCHED_TRADES_MATCHING_CRITERIA_PROVIDED_ON_REQUEST;
        case 2: return UNMATCHED_TRADES_THAT_MATCH_CRITERIA;
        case 3: return UNREPORTED_TRADES_THAT_MATCH_CRITERIA;
        case 4: return ADVISORIES_THAT_MATCH_CRITERIA;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
