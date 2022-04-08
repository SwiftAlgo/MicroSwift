/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum SecurityRequestType implements IntRepresentable
{
    REQUEST_SECURITY_IDENTITY_AND_SPECIFICATIONS(0),
    REQUEST_SECURITY_IDENTITY_FOR_THE_SPECIFICATIONS_PROVIDED(1),
    REQUEST_LIST_SECURITY_TYPES(2),
    REQUEST_LIST_SECURITIES(3),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    SecurityRequestType(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(8);
        static
    {
        intSet.add(0);
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static SecurityRequestType decode(final int representation)
    {
        switch(representation)
        {
        case 0: return REQUEST_SECURITY_IDENTITY_AND_SPECIFICATIONS;
        case 1: return REQUEST_SECURITY_IDENTITY_FOR_THE_SPECIFICATIONS_PROVIDED;
        case 2: return REQUEST_LIST_SECURITY_TYPES;
        case 3: return REQUEST_LIST_SECURITIES;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
