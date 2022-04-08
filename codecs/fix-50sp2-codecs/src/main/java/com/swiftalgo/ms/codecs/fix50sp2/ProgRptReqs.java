/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum ProgRptReqs implements IntRepresentable
{
    BUY_SIDE_EXPLICITLY_REQUESTS_STATUS_USING_STATUE_REQUEST_THE_SELL_SIDE_FIRM_CAN_HOWEVER_SEND_A_DONE_STATUS_LIST_STATUS_RESPONSE_IN_AN_UNSOLICITED_FASHION(1),
    SELL_SIDE_PERIODICALLY_SENDS_STATUS_USING_LIST_STATUS_PERIOD_OPTIONALLY_SPECIFIED_IN_PROGRESSPERIOD_(2),
    REAL_TIME_EXECUTION_REPORTS(3),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    ProgRptReqs(final int representation)
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
    public static ProgRptReqs decode(final int representation)
    {
        switch(representation)
        {
        case 1: return BUY_SIDE_EXPLICITLY_REQUESTS_STATUS_USING_STATUE_REQUEST_THE_SELL_SIDE_FIRM_CAN_HOWEVER_SEND_A_DONE_STATUS_LIST_STATUS_RESPONSE_IN_AN_UNSOLICITED_FASHION;
        case 2: return SELL_SIDE_PERIODICALLY_SENDS_STATUS_USING_LIST_STATUS_PERIOD_OPTIONALLY_SPECIFIED_IN_PROGRESSPERIOD_;
        case 3: return REAL_TIME_EXECUTION_REPORTS;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
