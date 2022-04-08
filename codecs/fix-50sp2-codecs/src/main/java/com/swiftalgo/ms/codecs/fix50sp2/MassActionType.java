/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum MassActionType implements IntRepresentable
{
    SUSPEND_ORDERS(1),
    RELEASE_ORDERS_FROM_SUSPENSION(2),
    CANCEL_ORDERS(3),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    MassActionType(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(6);
        static
    {
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static MassActionType decode(final int representation)
    {
        switch(representation)
        {
        case 1: return SUSPEND_ORDERS;
        case 2: return RELEASE_ORDERS_FROM_SUSPENSION;
        case 3: return CANCEL_ORDERS;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
