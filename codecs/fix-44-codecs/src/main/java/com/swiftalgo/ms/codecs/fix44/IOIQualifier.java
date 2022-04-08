/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum IOIQualifier implements CharRepresentable
{
    ALL_OR_NONE('A'),
    MARKET_ON_CLOSE('B'),
    AT_THE_CLOSE('C'),
    VWAP('D'),
    IN_TOUCH_WITH('I'),
    LIMIT('L'),
    MORE_BEHIND('M'),
    AT_THE_OPEN('O'),
    TAKING_A_POSITION('P'),
    AT_THE_MARKET('Q'),
    READY_TO_TRADE('R'),
    PORTFOLIO_SHOWN('S'),
    THROUGH_THE_DAY('T'),
    VERSUS('V'),
    INDICATION_WORKING_AWAY('W'),
    CROSSING_OPPORTUNITY('X'),
    AT_THE_MIDPOINT('Y'),
    PRE_OPEN('Z'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    IOIQualifier(final char representation)
    {
         this.representation = representation;
    }

    public final char representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(36);
        static
    {
        intSet.add('A');
        intSet.add('B');
        intSet.add('C');
        intSet.add('D');
        intSet.add('I');
        intSet.add('L');
        intSet.add('M');
        intSet.add('O');
        intSet.add('P');
        intSet.add('Q');
        intSet.add('R');
        intSet.add('S');
        intSet.add('T');
        intSet.add('V');
        intSet.add('W');
        intSet.add('X');
        intSet.add('Y');
        intSet.add('Z');
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static IOIQualifier decode(final int representation)
    {
        switch(representation)
        {
        case 'A': return ALL_OR_NONE;
        case 'B': return MARKET_ON_CLOSE;
        case 'C': return AT_THE_CLOSE;
        case 'D': return VWAP;
        case 'I': return IN_TOUCH_WITH;
        case 'L': return LIMIT;
        case 'M': return MORE_BEHIND;
        case 'O': return AT_THE_OPEN;
        case 'P': return TAKING_A_POSITION;
        case 'Q': return AT_THE_MARKET;
        case 'R': return READY_TO_TRADE;
        case 'S': return PORTFOLIO_SHOWN;
        case 'T': return THROUGH_THE_DAY;
        case 'V': return VERSUS;
        case 'W': return INDICATION_WORKING_AWAY;
        case 'X': return CROSSING_OPPORTUNITY;
        case 'Y': return AT_THE_MIDPOINT;
        case 'Z': return PRE_OPEN;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
