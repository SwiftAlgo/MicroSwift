/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum MDQuoteType implements IntRepresentable
{
    INDICATIVE(0),
    TRADEABLE(1),
    RESTRICTED_TRADEABLE(2),
    COUNTER(3),
    INDICATIVE_AND_TRADEABLE(4),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    MDQuoteType(final int representation)
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
    public static MDQuoteType decode(final int representation)
    {
        switch(representation)
        {
        case 0: return INDICATIVE;
        case 1: return TRADEABLE;
        case 2: return RESTRICTED_TRADEABLE;
        case 3: return COUNTER;
        case 4: return INDICATIVE_AND_TRADEABLE;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
