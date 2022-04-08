/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum ApplReqType implements IntRepresentable
{
    RETRANSMISSION_OF_APPLICATION_MESSAGES_FOR_THE_SPECIFIED_APPLICATIONS(0),
    SUBSCRIPTION_TO_THE_SPECIFIED_APPLICATIONS(1),
    REQUEST_FOR_THE_LAST_APPLLASTSEQNUM_PUBLISHED_FOR_THE_SPECIFIED_APPLICATIONS(2),
    REQUEST_VALID_SET_OF_APPLICATIONS(3),
    UNSUBSCRIBE_TO_THE_SPECIFIED_APPLICATIONS(4),
    CANCEL_RETRANSMISSION(5),
    CANCEL_RETRANSMISSION_AND_UNSUBSCRIBE_TO_THE_SPECIFIED_APPLICATIONS(6),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    ApplReqType(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(14);
        static
    {
        intSet.add(0);
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
    public static ApplReqType decode(final int representation)
    {
        switch(representation)
        {
        case 0: return RETRANSMISSION_OF_APPLICATION_MESSAGES_FOR_THE_SPECIFIED_APPLICATIONS;
        case 1: return SUBSCRIPTION_TO_THE_SPECIFIED_APPLICATIONS;
        case 2: return REQUEST_FOR_THE_LAST_APPLLASTSEQNUM_PUBLISHED_FOR_THE_SPECIFIED_APPLICATIONS;
        case 3: return REQUEST_VALID_SET_OF_APPLICATIONS;
        case 4: return UNSUBSCRIBE_TO_THE_SPECIFIED_APPLICATIONS;
        case 5: return CANCEL_RETRANSMISSION;
        case 6: return CANCEL_RETRANSMISSION_AND_UNSUBSCRIBE_TO_THE_SPECIFIED_APPLICATIONS;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
