/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum EventType implements IntRepresentable
{
    PUT(1),
    CALL(2),
    TENDER(3),
    SINKING_FUND_CALL(4),
    OTHER(99),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    EventType(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(10);
        static
    {
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
        intSet.add(4);
        intSet.add(99);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static EventType decode(final int representation)
    {
        switch(representation)
        {
        case 1: return PUT;
        case 2: return CALL;
        case 3: return TENDER;
        case 4: return SINKING_FUND_CALL;
        case 99: return OTHER;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
