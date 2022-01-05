/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum RoutingType implements IntRepresentable
{
    TARGET_FIRM(1),
    TARGET_LIST(2),
    BLOCK_FIRM(3),
    BLOCK_LIST(4),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    RoutingType(final int representation)
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
    public static RoutingType decode(final int representation)
    {
        switch(representation)
        {
        case 1: return TARGET_FIRM;
        case 2: return TARGET_LIST;
        case 3: return BLOCK_FIRM;
        case 4: return BLOCK_LIST;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
