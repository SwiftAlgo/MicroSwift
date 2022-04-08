/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum BasisPxType implements CharRepresentable
{
    CLOSING_PRICE_AT_MORNING_SESSION('2'),
    CLOSING_PRICE('3'),
    CURRENT_PRICE('4'),
    SQ('5'),
    VWAP_THROUGH_A_DAY('6'),
    VWAP_THROUGH_A_MORNING_SESSION('7'),
    VWAP_THROUGH_AN_AFTERNOON_SESSION('8'),
    VWAP_THROUGH_A_DAY_EXCEPT_YORI('9'),
    VWAP_THROUGH_A_MORNING_SESSION_EXCEPT_YORI('A'),
    VWAP_THROUGH_AN_AFTERNOON_SESSION_EXCEPT_YORI('B'),
    STRIKE('C'),
    OPEN('D'),
    OTHERS('Z'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    BasisPxType(final char representation)
    {
         this.representation = representation;
    }

    public final char representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(26);
        static
    {
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
        intSet.add('Z');
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static BasisPxType decode(final int representation)
    {
        switch(representation)
        {
        case '2': return CLOSING_PRICE_AT_MORNING_SESSION;
        case '3': return CLOSING_PRICE;
        case '4': return CURRENT_PRICE;
        case '5': return SQ;
        case '6': return VWAP_THROUGH_A_DAY;
        case '7': return VWAP_THROUGH_A_MORNING_SESSION;
        case '8': return VWAP_THROUGH_AN_AFTERNOON_SESSION;
        case '9': return VWAP_THROUGH_A_DAY_EXCEPT_YORI;
        case 'A': return VWAP_THROUGH_A_MORNING_SESSION_EXCEPT_YORI;
        case 'B': return VWAP_THROUGH_AN_AFTERNOON_SESSION_EXCEPT_YORI;
        case 'C': return STRIKE;
        case 'D': return OPEN;
        case 'Z': return OTHERS;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
