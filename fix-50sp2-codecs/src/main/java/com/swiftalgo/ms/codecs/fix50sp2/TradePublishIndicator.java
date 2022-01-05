/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum TradePublishIndicator implements IntRepresentable
{
    DO_NOT_PUBLISH_TRADE(0),
    PUBLISH_TRADE(1),
    DEFERRED_PUBLICATION(2),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    TradePublishIndicator(final int representation)
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
    public static TradePublishIndicator decode(final int representation)
    {
        switch(representation)
        {
        case 0: return DO_NOT_PUBLISH_TRADE;
        case 1: return PUBLISH_TRADE;
        case 2: return DEFERRED_PUBLICATION;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
