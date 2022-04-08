/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum TimeInForce implements CharRepresentable
{
    DAY('0'),
    GOOD_TILL_CANCEL('1'),
    AT_THE_OPENING('2'),
    IMMEDIATE_OR_CANCEL('3'),
    FILL_OR_KILL('4'),
    GOOD_TILL_CROSSING('5'),
    GOOD_TILL_DATE('6'),
    AT_THE_CLOSE('7'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    TimeInForce(final char representation)
    {
         this.representation = representation;
    }

    public final char representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(16);
        static
    {
        intSet.add('0');
        intSet.add('1');
        intSet.add('2');
        intSet.add('3');
        intSet.add('4');
        intSet.add('5');
        intSet.add('6');
        intSet.add('7');
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static TimeInForce decode(final int representation)
    {
        switch(representation)
        {
        case '0': return DAY;
        case '1': return GOOD_TILL_CANCEL;
        case '2': return AT_THE_OPENING;
        case '3': return IMMEDIATE_OR_CANCEL;
        case '4': return FILL_OR_KILL;
        case '5': return GOOD_TILL_CROSSING;
        case '6': return GOOD_TILL_DATE;
        case '7': return AT_THE_CLOSE;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
