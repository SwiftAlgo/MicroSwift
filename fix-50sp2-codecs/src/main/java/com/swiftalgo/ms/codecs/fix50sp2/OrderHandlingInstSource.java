/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum OrderHandlingInstSource implements IntRepresentable
{
    NASD_OATS(1),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    OrderHandlingInstSource(final int representation)
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
    public static OrderHandlingInstSource decode(final int representation)
    {
        switch(representation)
        {
        case 1: return NASD_OATS;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
