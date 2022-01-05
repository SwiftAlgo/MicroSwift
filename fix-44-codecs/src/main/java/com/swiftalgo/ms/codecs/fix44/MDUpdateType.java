/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum MDUpdateType implements IntRepresentable
{
    FULL_REFRESH(0),
    INCREMENTAL_REFRESH(1),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    MDUpdateType(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(4);
        static
    {
        intSet.add(0);
        intSet.add(1);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static MDUpdateType decode(final int representation)
    {
        switch(representation)
        {
        case 0: return FULL_REFRESH;
        case 1: return INCREMENTAL_REFRESH;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
