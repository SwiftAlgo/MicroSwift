/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum QuoteType implements IntRepresentable
{
    INDICATIVE(0),
    TRADEABLE(1),
    RESTRICTED_TRADEABLE(2),
    COUNTER(3),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    QuoteType(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(8);
        static
    {
        intSet.add(0);
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static QuoteType decode(final int representation)
    {
        switch(representation)
        {
        case 0: return INDICATIVE;
        case 1: return TRADEABLE;
        case 2: return RESTRICTED_TRADEABLE;
        case 3: return COUNTER;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
