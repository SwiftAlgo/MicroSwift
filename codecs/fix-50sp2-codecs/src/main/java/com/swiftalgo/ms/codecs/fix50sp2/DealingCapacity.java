/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum DealingCapacity implements CharRepresentable
{
    AGENT('A'),
    PRINCIPAL('P'),
    RISKLESS_PRINCIPAL('R'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    DealingCapacity(final char representation)
    {
         this.representation = representation;
    }

    public final char representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(6);
        static
    {
        intSet.add('A');
        intSet.add('P');
        intSet.add('R');
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static DealingCapacity decode(final int representation)
    {
        switch(representation)
        {
        case 'A': return AGENT;
        case 'P': return PRINCIPAL;
        case 'R': return RISKLESS_PRINCIPAL;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
