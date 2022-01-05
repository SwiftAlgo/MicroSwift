/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum UserStatus implements IntRepresentable
{
    LOGGED_IN(1),
    NOT_LOGGED_IN(2),
    USER_NOT_RECOGNISED(3),
    PASSWORD_INCORRECT(4),
    PASSWORD_CHANGED(5),
    OTHER(6),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    UserStatus(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(12);
        static
    {
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
        intSet.add(4);
        intSet.add(5);
        intSet.add(6);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static UserStatus decode(final int representation)
    {
        switch(representation)
        {
        case 1: return LOGGED_IN;
        case 2: return NOT_LOGGED_IN;
        case 3: return USER_NOT_RECOGNISED;
        case 4: return PASSWORD_INCORRECT;
        case 5: return PASSWORD_CHANGED;
        case 6: return OTHER;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
