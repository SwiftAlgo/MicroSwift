/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum LotType implements CharRepresentable
{
    ODD_LOT('1'),
    ROUND_LOT('2'),
    BLOCK_LOT('3'),
    ROUND_LOT_BASED_UPON_UNITOFMEASURE('4'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    LotType(final char representation)
    {
         this.representation = representation;
    }

    public final char representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(8);
        static
    {
        intSet.add('1');
        intSet.add('2');
        intSet.add('3');
        intSet.add('4');
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static LotType decode(final int representation)
    {
        switch(representation)
        {
        case '1': return ODD_LOT;
        case '2': return ROUND_LOT;
        case '3': return BLOCK_LOT;
        case '4': return ROUND_LOT_BASED_UPON_UNITOFMEASURE;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
