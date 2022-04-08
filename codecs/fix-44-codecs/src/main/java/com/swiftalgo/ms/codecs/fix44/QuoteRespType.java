/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum QuoteRespType implements IntRepresentable
{
    HIT_LIFT(1),
    COUNTER(2),
    EXPIRED(3),
    COVER(4),
    DONE_AWAY(5),
    PASS(6),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    QuoteRespType(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(12);
        static
    {
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
        intSet.add(4);
        intSet.add(5);
        intSet.add(6);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static QuoteRespType decode(final int representation)
    {
        switch(representation)
        {
        case 1: return HIT_LIFT;
        case 2: return COUNTER;
        case 3: return EXPIRED;
        case 4: return COVER;
        case 5: return DONE_AWAY;
        case 6: return PASS;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
