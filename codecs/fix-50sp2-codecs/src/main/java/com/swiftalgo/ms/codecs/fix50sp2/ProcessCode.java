/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum ProcessCode implements CharRepresentable
{
    REGULAR('0'),
    SOFT_DOLLAR('1'),
    STEP_IN('2'),
    STEP_OUT('3'),
    SOFT_DOLLAR_STEP_IN('4'),
    SOFT_DOLLAR_STEP_OUT('5'),
    PLAN_SPONSOR('6'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    ProcessCode(final char representation)
    {
         this.representation = representation;
    }

    public final char representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(14);
        static
    {
        intSet.add('0');
        intSet.add('1');
        intSet.add('2');
        intSet.add('3');
        intSet.add('4');
        intSet.add('5');
        intSet.add('6');
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static ProcessCode decode(final int representation)
    {
        switch(representation)
        {
        case '0': return REGULAR;
        case '1': return SOFT_DOLLAR;
        case '2': return STEP_IN;
        case '3': return STEP_OUT;
        case '4': return SOFT_DOLLAR_STEP_IN;
        case '5': return SOFT_DOLLAR_STEP_OUT;
        case '6': return PLAN_SPONSOR;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
