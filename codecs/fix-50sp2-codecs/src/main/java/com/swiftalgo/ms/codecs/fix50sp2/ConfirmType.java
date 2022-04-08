/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum ConfirmType implements IntRepresentable
{
    STATUS(1),
    CONFIRMATION(2),
    CONFIRMATION_REQUEST_REJECTED(3),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    ConfirmType(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(6);
        static
    {
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static ConfirmType decode(final int representation)
    {
        switch(representation)
        {
        case 1: return STATUS;
        case 2: return CONFIRMATION;
        case 3: return CONFIRMATION_REQUEST_REJECTED;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
