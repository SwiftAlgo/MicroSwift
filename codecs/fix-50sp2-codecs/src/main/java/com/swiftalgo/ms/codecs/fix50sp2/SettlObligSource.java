/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum SettlObligSource implements CharRepresentable
{
    INSTRUCTIONS_OF_BROKER('1'),
    INSTRUCTIONS_FOR_INSTITUTION('2'),
    INVESTOR('3'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    SettlObligSource(final char representation)
    {
         this.representation = representation;
    }

    public final char representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(6);
        static
    {
        intSet.add('1');
        intSet.add('2');
        intSet.add('3');
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static SettlObligSource decode(final int representation)
    {
        switch(representation)
        {
        case '1': return INSTRUCTIONS_OF_BROKER;
        case '2': return INSTRUCTIONS_FOR_INSTITUTION;
        case '3': return INVESTOR;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
