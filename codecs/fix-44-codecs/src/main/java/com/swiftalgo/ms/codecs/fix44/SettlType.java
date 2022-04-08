/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum SettlType implements CharRepresentable
{
    REGULAR('0'),
    CASH('1'),
    NEXT_DAY('2'),
    T_PLUS_2('3'),
    T_PLUS_3('4'),
    T_PLUS_4('5'),
    FUTURE('6'),
    WHEN_AND_IF_ISSUED('7'),
    SELLERS_OPTION('8'),
    T_PLUS_5('9'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    SettlType(final char representation)
    {
         this.representation = representation;
    }

    public final char representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(20);
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
        intSet.add('8');
        intSet.add('9');
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static SettlType decode(final int representation)
    {
        switch(representation)
        {
        case '0': return REGULAR;
        case '1': return CASH;
        case '2': return NEXT_DAY;
        case '3': return T_PLUS_2;
        case '4': return T_PLUS_3;
        case '5': return T_PLUS_4;
        case '6': return FUTURE;
        case '7': return WHEN_AND_IF_ISSUED;
        case '8': return SELLERS_OPTION;
        case '9': return T_PLUS_5;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
