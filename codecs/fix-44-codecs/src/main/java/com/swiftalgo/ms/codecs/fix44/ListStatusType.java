/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum ListStatusType implements IntRepresentable
{
    ACK(1),
    RESPONSE(2),
    TIMED(3),
    EXECSTARTED(4),
    ALLDONE(5),
    ALERT(6),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    ListStatusType(final int representation)
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
    public static ListStatusType decode(final int representation)
    {
        switch(representation)
        {
        case 1: return ACK;
        case 2: return RESPONSE;
        case 3: return TIMED;
        case 4: return EXECSTARTED;
        case 5: return ALLDONE;
        case 6: return ALERT;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
