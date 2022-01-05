/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum MultilegModel implements IntRepresentable
{
    PREDEFINED_MULTILEG_SECURITY(0),
    USER_DEFINED_MULTLEG_SECURITY(1),
    USER_DEFINED_NON_SECURITIZED_MULTILEG(2),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    MultilegModel(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(6);
        static
    {
        intSet.add(0);
        intSet.add(1);
        intSet.add(2);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static MultilegModel decode(final int representation)
    {
        switch(representation)
        {
        case 0: return PREDEFINED_MULTILEG_SECURITY;
        case 1: return USER_DEFINED_MULTLEG_SECURITY;
        case 2: return USER_DEFINED_NON_SECURITIZED_MULTILEG;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
