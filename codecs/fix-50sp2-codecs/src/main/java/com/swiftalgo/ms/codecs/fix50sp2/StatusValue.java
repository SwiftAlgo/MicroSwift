/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum StatusValue implements IntRepresentable
{
    CONNECTED(1),
    NOT_CONNECTED_DOWN_EXPECTED_UP(2),
    NOT_CONNECTED_DOWN_EXPECTED_DOWN(3),
    IN_PROCESS(4),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    StatusValue(final int representation)
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
    public static StatusValue decode(final int representation)
    {
        switch(representation)
        {
        case 1: return CONNECTED;
        case 2: return NOT_CONNECTED_DOWN_EXPECTED_UP;
        case 3: return NOT_CONNECTED_DOWN_EXPECTED_DOWN;
        case 4: return IN_PROCESS;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
