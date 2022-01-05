/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum NewsCategory implements IntRepresentable
{
    COMPANY_NEWS(0),
    MARKETPLACE_NEWS(1),
    FINANCIAL_MARKET_NEWS(2),
    TECHNICAL_NEWS(3),
    OTHER_NEWS(99),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    NewsCategory(final int representation)
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
        intSet.add(99);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static NewsCategory decode(final int representation)
    {
        switch(representation)
        {
        case 0: return COMPANY_NEWS;
        case 1: return MARKETPLACE_NEWS;
        case 2: return FINANCIAL_MARKET_NEWS;
        case 3: return TECHNICAL_NEWS;
        case 99: return OTHER_NEWS;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
