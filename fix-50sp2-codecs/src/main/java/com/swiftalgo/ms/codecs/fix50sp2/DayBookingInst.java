/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum DayBookingInst implements CharRepresentable
{
    CAN_TRIGGER_BOOKING_WITHOUT_REFERENCE_TO_THE_ORDER_INITIATOR('0'),
    SPEAK_WITH_ORDER_INITIATOR_BEFORE_BOOKING('1'),
    ACCUMULATE('2'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    DayBookingInst(final char representation)
    {
         this.representation = representation;
    }

    public final char representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(6);
        static
    {
        intSet.add('0');
        intSet.add('1');
        intSet.add('2');
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static DayBookingInst decode(final int representation)
    {
        switch(representation)
        {
        case '0': return CAN_TRIGGER_BOOKING_WITHOUT_REFERENCE_TO_THE_ORDER_INITIATOR;
        case '1': return SPEAK_WITH_ORDER_INITIATOR_BEFORE_BOOKING;
        case '2': return ACCUMULATE;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
