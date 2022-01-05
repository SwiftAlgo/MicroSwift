/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum SessionStatus implements IntRepresentable
{
    SESSION_ACTIVE(0),
    SESSION_PASSWORD_CHANGED(1),
    SESSION_PASSWORD_DUE_TO_EXPIRE(2),
    NEW_SESSION_PASSWORD_DOES_NOT_COMPLY_WITH_POLICY(3),
    SESSION_LOGOUT_COMPLETE(4),
    INVALID_USERNAME_OR_PASSWORD(5),
    ACCOUNT_LOCKED(6),
    LOGONS_ARE_NOT_ALLOWED_AT_THIS_TIME(7),
    PASSWORD_EXPIRED(8),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    SessionStatus(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(18);
        static
    {
        intSet.add(0);
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
        intSet.add(4);
        intSet.add(5);
        intSet.add(6);
        intSet.add(7);
        intSet.add(8);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static SessionStatus decode(final int representation)
    {
        switch(representation)
        {
        case 0: return SESSION_ACTIVE;
        case 1: return SESSION_PASSWORD_CHANGED;
        case 2: return SESSION_PASSWORD_DUE_TO_EXPIRE;
        case 3: return NEW_SESSION_PASSWORD_DOES_NOT_COMPLY_WITH_POLICY;
        case 4: return SESSION_LOGOUT_COMPLETE;
        case 5: return INVALID_USERNAME_OR_PASSWORD;
        case 6: return ACCOUNT_LOCKED;
        case 7: return LOGONS_ARE_NOT_ALLOWED_AT_THIS_TIME;
        case 8: return PASSWORD_EXPIRED;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
