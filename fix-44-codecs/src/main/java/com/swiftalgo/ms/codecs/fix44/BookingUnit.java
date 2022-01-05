/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum BookingUnit implements CharRepresentable
{
    EACH_PARTIAL_EXECUTION_IS_A_BOOKABLE_UNIT('0'),
    AGGREGATE_PARTIAL_EXECUTIONS_ON_THIS_ORDER_AND_BOOK_ONE_TRADE_PER_ORDER('1'),
    AGGREGATE_EXECUTIONS_FOR_THIS_SYMBOL_SIDE_AND_SETTLEMENT_DATE('2'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    BookingUnit(final char representation)
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
    public static BookingUnit decode(final int representation)
    {
        switch(representation)
        {
        case '0': return EACH_PARTIAL_EXECUTION_IS_A_BOOKABLE_UNIT;
        case '1': return AGGREGATE_PARTIAL_EXECUTIONS_ON_THIS_ORDER_AND_BOOK_ONE_TRADE_PER_ORDER;
        case '2': return AGGREGATE_EXECUTIONS_FOR_THIS_SYMBOL_SIDE_AND_SETTLEMENT_DATE;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
