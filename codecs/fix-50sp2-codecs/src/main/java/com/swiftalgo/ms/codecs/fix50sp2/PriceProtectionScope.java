/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum PriceProtectionScope implements CharRepresentable
{
    NONE('0'),
    LOCAL('1'),
    NATIONAL('2'),
    GLOBAL('3'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    PriceProtectionScope(final char representation)
    {
         this.representation = representation;
    }

    public final char representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(8);
        static
    {
        intSet.add('0');
        intSet.add('1');
        intSet.add('2');
        intSet.add('3');
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static PriceProtectionScope decode(final int representation)
    {
        switch(representation)
        {
        case '0': return NONE;
        case '1': return LOCAL;
        case '2': return NATIONAL;
        case '3': return GLOBAL;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
