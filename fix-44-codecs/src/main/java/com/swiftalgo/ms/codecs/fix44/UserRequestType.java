/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum UserRequestType implements IntRepresentable
{
    LOGONUSER(1),
    LOGOFFUSER(2),
    CHANGEPASSWORDFORUSER(3),
    REQUEST_INDIVIDUAL_USER_STATUS(4),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    UserRequestType(final int representation)
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
    public static UserRequestType decode(final int representation)
    {
        switch(representation)
        {
        case 1: return LOGONUSER;
        case 2: return LOGOFFUSER;
        case 3: return CHANGEPASSWORDFORUSER;
        case 4: return REQUEST_INDIVIDUAL_USER_STATUS;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
