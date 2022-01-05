/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum OrdType implements CharRepresentable
{
    MARKET('1'),
    LIMIT('2'),
    STOP('3'),
    STOP_LIMIT('4'),
    MARKET_ON_CLOSE('5'),
    WITH_OR_WITHOUT('6'),
    LIMIT_OR_BETTER('7'),
    LIMIT_WITH_OR_WITHOUT('8'),
    ON_BASIS('9'),
    ON_CLOSE('A'),
    LIMIT_ON_CLOSE('B'),
    FOREX_MARKET('C'),
    PREVIOUSLY_QUOTED('D'),
    PREVIOUSLY_INDICATED('E'),
    FOREX_LIMIT('F'),
    FOREX_SWAP('G'),
    FOREX_PREVIOUSLY_QUOTED('H'),
    FUNARI('I'),
    MARKET_IF_TOUCHED('J'),
    MARKET_WITH_LEFTOVER_AS_LIMIT('K'),
    PREVIOUS_FUND_VALUATION_POINT('L'),
    NEXT_FUND_VALUATION_POINT('M'),
    PEGGED('P'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    OrdType(final char representation)
    {
         this.representation = representation;
    }

    public final char representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(46);
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
        intSet.add('H');
        intSet.add('I');
        intSet.add('J');
        intSet.add('K');
        intSet.add('L');
        intSet.add('M');
        intSet.add('P');
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static OrdType decode(final int representation)
    {
        switch(representation)
        {
        case '1': return MARKET;
        case '2': return LIMIT;
        case '3': return STOP;
        case '4': return STOP_LIMIT;
        case '5': return MARKET_ON_CLOSE;
        case '6': return WITH_OR_WITHOUT;
        case '7': return LIMIT_OR_BETTER;
        case '8': return LIMIT_WITH_OR_WITHOUT;
        case '9': return ON_BASIS;
        case 'A': return ON_CLOSE;
        case 'B': return LIMIT_ON_CLOSE;
        case 'C': return FOREX_MARKET;
        case 'D': return PREVIOUSLY_QUOTED;
        case 'E': return PREVIOUSLY_INDICATED;
        case 'F': return FOREX_LIMIT;
        case 'G': return FOREX_SWAP;
        case 'H': return FOREX_PREVIOUSLY_QUOTED;
        case 'I': return FUNARI;
        case 'J': return MARKET_IF_TOUCHED;
        case 'K': return MARKET_WITH_LEFTOVER_AS_LIMIT;
        case 'L': return PREVIOUS_FUND_VALUATION_POINT;
        case 'M': return NEXT_FUND_VALUATION_POINT;
        case 'P': return PEGGED;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
