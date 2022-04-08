/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum HandlInst implements CharRepresentable
{
    AUTOMATED_EXECUTION_ORDER_PRIVATE_NO_BROKER_INTERVENTION('1'),
    AUTOMATED_EXECUTION_ORDER_PUBLIC_BROKER_INTERVENTION_OK('2'),
    MANUAL_ORDER_BEST_EXECUTION('3'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    HandlInst(final char representation)
    {
         this.representation = representation;
    }

    public final char representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(6);
        static
    {
        intSet.add('1');
        intSet.add('2');
        intSet.add('3');
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static HandlInst decode(final int representation)
    {
        switch(representation)
        {
        case '1': return AUTOMATED_EXECUTION_ORDER_PRIVATE_NO_BROKER_INTERVENTION;
        case '2': return AUTOMATED_EXECUTION_ORDER_PUBLIC_BROKER_INTERVENTION_OK;
        case '3': return MANUAL_ORDER_BEST_EXECUTION;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
