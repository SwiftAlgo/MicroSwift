/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum StreamAsgnRejReason implements IntRepresentable
{
    UNKNOWN_CLIENT(0),
    EXCEEDS_MAXIMUM_SIZE(1),
    UNKNOWN_OR_INVALID_CURRENCY_PAIR(2),
    NO_AVAILABLE_STREAM(3),
    OTHER(99),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    StreamAsgnRejReason(final int representation)
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
    public static StreamAsgnRejReason decode(final int representation)
    {
        switch(representation)
        {
        case 0: return UNKNOWN_CLIENT;
        case 1: return EXCEEDS_MAXIMUM_SIZE;
        case 2: return UNKNOWN_OR_INVALID_CURRENCY_PAIR;
        case 3: return NO_AVAILABLE_STREAM;
        case 99: return OTHER;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
