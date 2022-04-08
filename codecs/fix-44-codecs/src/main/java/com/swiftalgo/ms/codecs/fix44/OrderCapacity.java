/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum OrderCapacity implements CharRepresentable
{
    AGENCY('A'),
    PROPRIETARY('G'),
    INDIVIDUAL('I'),
    PRINCIPAL('P'),
    RISKLESS_PRINCIPAL('R'),
    AGENT_FOR_OTHER_MEMBER('W'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    OrderCapacity(final char representation)
    {
         this.representation = representation;
    }

    public final char representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(12);
        static
    {
        intSet.add('A');
        intSet.add('G');
        intSet.add('I');
        intSet.add('P');
        intSet.add('R');
        intSet.add('W');
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static OrderCapacity decode(final int representation)
    {
        switch(representation)
        {
        case 'A': return AGENCY;
        case 'G': return PROPRIETARY;
        case 'I': return INDIVIDUAL;
        case 'P': return PRINCIPAL;
        case 'R': return RISKLESS_PRINCIPAL;
        case 'W': return AGENT_FOR_OTHER_MEMBER;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
