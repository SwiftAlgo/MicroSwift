/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum TradSesStatusRejReason implements IntRepresentable
{
    UNKNOWN_OR_INVALID_TRADINGSESSIONID(1),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    TradSesStatusRejReason(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(2);
        static
    {
        intSet.add(1);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static TradSesStatusRejReason decode(final int representation)
    {
        switch(representation)
        {
        case 1: return UNKNOWN_OR_INVALID_TRADINGSESSIONID;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
