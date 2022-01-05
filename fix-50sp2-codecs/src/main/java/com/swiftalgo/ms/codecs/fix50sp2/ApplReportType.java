/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum ApplReportType implements IntRepresentable
{
    RESET_APPLSEQNUM_TO_NEW_VALUE_SPECIFIED_IN_APPLNEWSEQNUM(0),
    REPORTS_THAT_THE_LAST_MESSAGE_HAS_BEEN_SENT_FOR_THE_APPLIDS_REFER_TO_REFAPPLLASTSEQNUM_FOR_THE_APPLICATION_SEQUENCE_NUMBER_OF_THE_LAST_MESSAGE_(1),
    HEARTBEAT_MESSAGE_INDICATING_THAT_APPLICATION_IDENTIFIED_BY_REFAPPLID_FOR_THE_APPLICATION_SEQUENCE_NUMBER_OF_THE_PREVIOUS_MESSAGE_(2),
    APPLICATION_MESSAGE_RE_SEND_COMPLETED_(3),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    ApplReportType(final int representation)
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
    public static ApplReportType decode(final int representation)
    {
        switch(representation)
        {
        case 0: return RESET_APPLSEQNUM_TO_NEW_VALUE_SPECIFIED_IN_APPLNEWSEQNUM;
        case 1: return REPORTS_THAT_THE_LAST_MESSAGE_HAS_BEEN_SENT_FOR_THE_APPLIDS_REFER_TO_REFAPPLLASTSEQNUM_FOR_THE_APPLICATION_SEQUENCE_NUMBER_OF_THE_LAST_MESSAGE_;
        case 2: return HEARTBEAT_MESSAGE_INDICATING_THAT_APPLICATION_IDENTIFIED_BY_REFAPPLID_FOR_THE_APPLICATION_SEQUENCE_NUMBER_OF_THE_PREVIOUS_MESSAGE_;
        case 3: return APPLICATION_MESSAGE_RE_SEND_COMPLETED_;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
