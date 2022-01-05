/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum ExDestinationIDSource implements CharRepresentable
{
    BIC('B'),
    GENERALLY_ACCEPTED_MARKET_PARTICIPANT_IDENTIFIER('C'),
    PROPRIETARY_CUSTOM_CODE('D'),
    ISO_COUNTRY_CODE('E'),
    MIC('G'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    ExDestinationIDSource(final char representation)
    {
         this.representation = representation;
    }

    public final char representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(10);
        static
    {
        intSet.add('B');
        intSet.add('C');
        intSet.add('D');
        intSet.add('E');
        intSet.add('G');
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static ExDestinationIDSource decode(final int representation)
    {
        switch(representation)
        {
        case 'B': return BIC;
        case 'C': return GENERALLY_ACCEPTED_MARKET_PARTICIPANT_IDENTIFIER;
        case 'D': return PROPRIETARY_CUSTOM_CODE;
        case 'E': return ISO_COUNTRY_CODE;
        case 'G': return MIC;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
