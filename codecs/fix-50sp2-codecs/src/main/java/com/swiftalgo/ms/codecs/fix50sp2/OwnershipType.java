/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum OwnershipType implements CharRepresentable
{
    JOINT_INVESTORS('J'),
    TENANTS_IN_COMMON('T'),
    JOINT_TRUSTEES('2'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    OwnershipType(final char representation)
    {
         this.representation = representation;
    }

    public final char representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(6);
        static
    {
        intSet.add('J');
        intSet.add('T');
        intSet.add('2');
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static OwnershipType decode(final int representation)
    {
        switch(representation)
        {
        case 'J': return JOINT_INVESTORS;
        case 'T': return TENANTS_IN_COMMON;
        case '2': return JOINT_TRUSTEES;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
