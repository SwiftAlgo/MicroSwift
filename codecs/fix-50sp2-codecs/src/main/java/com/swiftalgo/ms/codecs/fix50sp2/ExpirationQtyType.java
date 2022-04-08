/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum ExpirationQtyType implements IntRepresentable
{
    AUTO_EXERCISE(1),
    NON_AUTO_EXERCISE(2),
    FINAL_WILL_BE_EXERCISED(3),
    CONTRARY_INTENTION(4),
    DIFFERENCE(5),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    ExpirationQtyType(final int representation)
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
        intSet.add(5);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static ExpirationQtyType decode(final int representation)
    {
        switch(representation)
        {
        case 1: return AUTO_EXERCISE;
        case 2: return NON_AUTO_EXERCISE;
        case 3: return FINAL_WILL_BE_EXERCISED;
        case 4: return CONTRARY_INTENTION;
        case 5: return DIFFERENCE;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
