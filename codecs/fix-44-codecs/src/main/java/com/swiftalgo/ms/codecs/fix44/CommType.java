/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum CommType implements CharRepresentable
{
    PER_UNIT('1'),
    PERCENTAGE('2'),
    ABSOLUTE('3'),
    PERCENTAGE_WAIVED_CASH_DISCOUNT('4'),
    PERCENTAGE_WAIVED_ENHANCED_UNITS('5'),
    POINTS_PER_BOND_OR_OR_CONTRACT('6'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    CommType(final char representation)
    {
         this.representation = representation;
    }

    public final char representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(12);
        static
    {
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
    public static CommType decode(final int representation)
    {
        switch(representation)
        {
        case '1': return PER_UNIT;
        case '2': return PERCENTAGE;
        case '3': return ABSOLUTE;
        case '4': return PERCENTAGE_WAIVED_CASH_DISCOUNT;
        case '5': return PERCENTAGE_WAIVED_ENHANCED_UNITS;
        case '6': return POINTS_PER_BOND_OR_OR_CONTRACT;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
