/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum ExecType implements CharRepresentable
{
    NEW('0'),
    DONE_FOR_DAY('3'),
    CANCELED('4'),
    REPLACED('5'),
    PENDING_CANCEL('6'),
    STOPPED('7'),
    REJECTED('8'),
    SUSPENDED('9'),
    PENDING_NEW('A'),
    CALCULATED('B'),
    EXPIRED('C'),
    RESTATED('D'),
    PENDING_REPLACE('E'),
    TRADE('F'),
    TRADE_CORRECT('G'),
    TRADE_CANCEL('H'),
    ORDER_STATUS('I'),
    TRADE_IN_A_CLEARING_HOLD('J'),
    TRADE_HAS_BEEN_RELEASED_TO_CLEARING('K'),
    TRIGGERED_OR_ACTIVATED_BY_SYSTEM('L'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    ExecType(final char representation)
    {
         this.representation = representation;
    }

    public final char representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(40);
        static
    {
        intSet.add('0');
        intSet.add('3');
        intSet.add('4');
        intSet.add('5');
        intSet.add('6');
        intSet.add('7');
        intSet.add('8');
        intSet.add('9');
        intSet.add('A');
        intSet.add('B');
        intSet.add('C');
        intSet.add('D');
        intSet.add('E');
        intSet.add('F');
        intSet.add('G');
        intSet.add('H');
        intSet.add('I');
        intSet.add('J');
        intSet.add('K');
        intSet.add('L');
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static ExecType decode(final int representation)
    {
        switch(representation)
        {
        case '0': return NEW;
        case '3': return DONE_FOR_DAY;
        case '4': return CANCELED;
        case '5': return REPLACED;
        case '6': return PENDING_CANCEL;
        case '7': return STOPPED;
        case '8': return REJECTED;
        case '9': return SUSPENDED;
        case 'A': return PENDING_NEW;
        case 'B': return CALCULATED;
        case 'C': return EXPIRED;
        case 'D': return RESTATED;
        case 'E': return PENDING_REPLACE;
        case 'F': return TRADE;
        case 'G': return TRADE_CORRECT;
        case 'H': return TRADE_CANCEL;
        case 'I': return ORDER_STATUS;
        case 'J': return TRADE_IN_A_CLEARING_HOLD;
        case 'K': return TRADE_HAS_BEEN_RELEASED_TO_CLEARING;
        case 'L': return TRIGGERED_OR_ACTIVATED_BY_SYSTEM;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
