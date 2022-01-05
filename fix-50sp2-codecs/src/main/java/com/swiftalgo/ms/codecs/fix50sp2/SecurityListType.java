/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum SecurityListType implements IntRepresentable
{
    INDUSTRY_CLASSIFICATION(1),
    TRADING_LIST(2),
    MARKET_MARKET_SEGMENT_LIST(3),
    NEWSPAPER_LIST(4),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    SecurityListType(final int representation)
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
    public static SecurityListType decode(final int representation)
    {
        switch(representation)
        {
        case 1: return INDUSTRY_CLASSIFICATION;
        case 2: return TRADING_LIST;
        case 3: return MARKET_MARKET_SEGMENT_LIST;
        case 4: return NEWSPAPER_LIST;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
