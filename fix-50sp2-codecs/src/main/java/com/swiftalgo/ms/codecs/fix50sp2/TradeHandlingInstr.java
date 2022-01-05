/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum TradeHandlingInstr implements CharRepresentable
{
    TRADE_CONFIRMATION('0'),
    TWO_PARTY_REPORT('1'),
    ONE_PARTY_REPORT_FOR_MATCHING('2'),
    ONE_PARTY_REPORT_FOR_PASS_THROUGH('3'),
    AUTOMATED_FLOOR_ORDER_ROUTING('4'),
    TWO_PARTY_REPORT_FOR_CLAIM('5'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    TradeHandlingInstr(final char representation)
    {
         this.representation = representation;
    }

    public final char representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(12);
        static
    {
        intSet.add('0');
        intSet.add('1');
        intSet.add('2');
        intSet.add('3');
        intSet.add('4');
        intSet.add('5');
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static TradeHandlingInstr decode(final int representation)
    {
        switch(representation)
        {
        case '0': return TRADE_CONFIRMATION;
        case '1': return TWO_PARTY_REPORT;
        case '2': return ONE_PARTY_REPORT_FOR_MATCHING;
        case '3': return ONE_PARTY_REPORT_FOR_PASS_THROUGH;
        case '4': return AUTOMATED_FLOOR_ORDER_ROUTING;
        case '5': return TWO_PARTY_REPORT_FOR_CLAIM;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
