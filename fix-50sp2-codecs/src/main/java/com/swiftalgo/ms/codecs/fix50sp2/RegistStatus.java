/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum RegistStatus implements CharRepresentable
{
    ACCEPTED('A'),
    REJECTED('R'),
    HELD('H'),
    REMINDER_I_E_REGISTRATION_INSTRUCTIONS_ARE_STILL_OUTSTANDING('N'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    RegistStatus(final char representation)
    {
         this.representation = representation;
    }

    public final char representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(8);
        static
    {
        intSet.add('A');
        intSet.add('R');
        intSet.add('H');
        intSet.add('N');
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static RegistStatus decode(final int representation)
    {
        switch(representation)
        {
        case 'A': return ACCEPTED;
        case 'R': return REJECTED;
        case 'H': return HELD;
        case 'N': return REMINDER_I_E_REGISTRATION_INSTRUCTIONS_ARE_STILL_OUTSTANDING;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
