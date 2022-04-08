/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum ListExecInstType implements CharRepresentable
{
    IMMEDIATE('1'),
    WAIT_FOR_EXECUT_INSTRUCTION('2'),
    EXCHANGE_SWITCH_CIV_ORDER_SELL_DRIVEN('3'),
    EXCHANGE_SWITCH_CIV_ORDER_BUY_DRIVEN_CASH_TOP_UP('4'),
    EXCHANGE_SWITCH_CIV_ORDER_BUY_DRIVEN_CASH_WITHDRAW('5'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    ListExecInstType(final char representation)
    {
         this.representation = representation;
    }

    public final char representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(10);
        static
    {
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
    public static ListExecInstType decode(final int representation)
    {
        switch(representation)
        {
        case '1': return IMMEDIATE;
        case '2': return WAIT_FOR_EXECUT_INSTRUCTION;
        case '3': return EXCHANGE_SWITCH_CIV_ORDER_SELL_DRIVEN;
        case '4': return EXCHANGE_SWITCH_CIV_ORDER_BUY_DRIVEN_CASH_TOP_UP;
        case '5': return EXCHANGE_SWITCH_CIV_ORDER_BUY_DRIVEN_CASH_WITHDRAW;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
