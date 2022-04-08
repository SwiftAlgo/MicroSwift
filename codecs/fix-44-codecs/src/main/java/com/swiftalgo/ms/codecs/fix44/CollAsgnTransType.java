/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum CollAsgnTransType implements IntRepresentable
{
    NEW(0),
    REPLACE(1),
    CANCEL(2),
    RELEASE(3),
    REVERSE(4),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    CollAsgnTransType(final int representation)
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
        intSet.add(4);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static CollAsgnTransType decode(final int representation)
    {
        switch(representation)
        {
        case 0: return NEW;
        case 1: return REPLACE;
        case 2: return CANCEL;
        case 3: return RELEASE;
        case 4: return REVERSE;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
