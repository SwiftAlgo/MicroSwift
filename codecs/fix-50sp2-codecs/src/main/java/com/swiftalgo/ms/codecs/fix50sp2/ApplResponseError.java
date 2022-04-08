/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum ApplResponseError implements IntRepresentable
{
    APPLICATION_DOES_NOT_EXIST(0),
    MESSAGES_REQUESTED_ARE_NOT_AVAILABLE(1),
    USER_NOT_AUTHORIZED_FOR_APPLICATION(2),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    ApplResponseError(final int representation)
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
    public static ApplResponseError decode(final int representation)
    {
        switch(representation)
        {
        case 0: return APPLICATION_DOES_NOT_EXIST;
        case 1: return MESSAGES_REQUESTED_ARE_NOT_AVAILABLE;
        case 2: return USER_NOT_AUTHORIZED_FOR_APPLICATION;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
