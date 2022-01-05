/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum Side implements CharRepresentable
{
    BUY('1'),
    SELL('2'),
    BUY_MINUS('3'),
    SELL_PLUS('4'),
    SELL_SHORT('5'),
    SELL_SHORT_EXEMPT('6'),
    UNDISCLOSED('7'),
    CROSS('8'),
    CROSS_SHORT('9'),
    CROSS_SHORT_EXEMPT('A'),
    AS_DEFINED('B'),
    OPPOSITE('C'),
    SUBSCRIBE('D'),
    REDEEM('E'),
    LEND('F'),
    BORROW('G'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    Side(final char representation)
    {
         this.representation = representation;
    }

    public final char representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(32);
        static
    {
        intSet.add('1');
        intSet.add('2');
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
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static Side decode(final int representation)
    {
        switch(representation)
        {
        case '1': return BUY;
        case '2': return SELL;
        case '3': return BUY_MINUS;
        case '4': return SELL_PLUS;
        case '5': return SELL_SHORT;
        case '6': return SELL_SHORT_EXEMPT;
        case '7': return UNDISCLOSED;
        case '8': return CROSS;
        case '9': return CROSS_SHORT;
        case 'A': return CROSS_SHORT_EXEMPT;
        case 'B': return AS_DEFINED;
        case 'C': return OPPOSITE;
        case 'D': return SUBSCRIBE;
        case 'E': return REDEEM;
        case 'F': return LEND;
        case 'G': return BORROW;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
