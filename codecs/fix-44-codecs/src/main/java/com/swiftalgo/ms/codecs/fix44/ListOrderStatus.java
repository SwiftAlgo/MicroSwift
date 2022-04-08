/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum ListOrderStatus implements IntRepresentable
{
    INBIDDINGPROCESS(1),
    RECEIVEDFOREXECUTION(2),
    EXECUTING(3),
    CANCELING(4),
    ALERT(5),
    ALL_DONE(6),
    REJECT(7),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    ListOrderStatus(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(14);
        static
    {
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
        intSet.add(4);
        intSet.add(5);
        intSet.add(6);
        intSet.add(7);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static ListOrderStatus decode(final int representation)
    {
        switch(representation)
        {
        case 1: return INBIDDINGPROCESS;
        case 2: return RECEIVEDFOREXECUTION;
        case 3: return EXECUTING;
        case 4: return CANCELING;
        case 5: return ALERT;
        case 6: return ALL_DONE;
        case 7: return REJECT;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
