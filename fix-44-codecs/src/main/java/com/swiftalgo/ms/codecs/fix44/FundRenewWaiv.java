/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum FundRenewWaiv implements CharRepresentable
{
    YES('Y'),
    NO('N'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    FundRenewWaiv(final char representation)
    {
         this.representation = representation;
    }

    public final char representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(4);
        static
    {
        intSet.add('Y');
        intSet.add('N');
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static FundRenewWaiv decode(final int representation)
    {
        switch(representation)
        {
        case 'Y': return YES;
        case 'N': return NO;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
