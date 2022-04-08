/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum NetworkRequestType implements IntRepresentable
{
    SNAPSHOT(1),
    SUBSCRIBE(2),
    STOP_SUBSCRIBING(4),
    LEVEL_OF_DETAIL(8),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    NetworkRequestType(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(8);
        static
    {
        intSet.add(1);
        intSet.add(2);
        intSet.add(4);
        intSet.add(8);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static NetworkRequestType decode(final int representation)
    {
        switch(representation)
        {
        case 1: return SNAPSHOT;
        case 2: return SUBSCRIBE;
        case 4: return STOP_SUBSCRIBING;
        case 8: return LEVEL_OF_DETAIL;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
