/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum EmailType implements CharRepresentable
{
    NEW('0'),
    REPLY('1'),
    ADMIN_REPLY('2'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    EmailType(final char representation)
    {
         this.representation = representation;
    }

    public final char representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(6);
        static
    {
        intSet.add('0');
        intSet.add('1');
        intSet.add('2');
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static EmailType decode(final int representation)
    {
        switch(representation)
        {
        case '0': return NEW;
        case '1': return REPLY;
        case '2': return ADMIN_REPLY;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
