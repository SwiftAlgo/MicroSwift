/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum GTBookingInst implements IntRepresentable
{
    BOOK_OUT_ALL_TRADES_ON_DAY_OF_EXECUTION(0),
    ACCUMULATE_EXECUTIONS_UNTIL_ORDER_IS_FILLED_OR_EXPIRES(1),
    ACCUMULATE_UNTIL_VERBALLY_NOTIFIED_OTHERWISE(2),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    GTBookingInst(final int representation)
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
    public static GTBookingInst decode(final int representation)
    {
        switch(representation)
        {
        case 0: return BOOK_OUT_ALL_TRADES_ON_DAY_OF_EXECUTION;
        case 1: return ACCUMULATE_EXECUTIONS_UNTIL_ORDER_IS_FILLED_OR_EXPIRES;
        case 2: return ACCUMULATE_UNTIL_VERBALLY_NOTIFIED_OTHERWISE;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
