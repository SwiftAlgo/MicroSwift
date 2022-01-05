/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum SettlInstSource implements CharRepresentable
{
    BROKERS_INSTRUCTIONS('1'),
    INSTITUTIONS_INSTRUCTIONS('2'),
    INVESTOR('3'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    SettlInstSource(final char representation)
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
    public static SettlInstSource decode(final int representation)
    {
        switch(representation)
        {
        case '1': return BROKERS_INSTRUCTIONS;
        case '2': return INSTITUTIONS_INSTRUCTIONS;
        case '3': return INVESTOR;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
