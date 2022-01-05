/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum CancellationRights implements CharRepresentable
{
    YES('Y'),
    NO_EXECUTION_ONLY('N'),
    NO_WAIVER_AGREEMENT('M'),
    NO_INSTITUTIONAL('O'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    CancellationRights(final char representation)
    {
         this.representation = representation;
    }

    public final char representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(8);
        static
    {
        intSet.add('Y');
        intSet.add('N');
        intSet.add('M');
        intSet.add('O');
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static CancellationRights decode(final int representation)
    {
        switch(representation)
        {
        case 'Y': return YES;
        case 'N': return NO_EXECUTION_ONLY;
        case 'M': return NO_WAIVER_AGREEMENT;
        case 'O': return NO_INSTITUTIONAL;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
