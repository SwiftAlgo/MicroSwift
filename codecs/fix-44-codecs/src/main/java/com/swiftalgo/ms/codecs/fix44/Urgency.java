/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum Urgency implements CharRepresentable
{
    NORMAL('0'),
    FLASH('1'),
    BACKGROUND('2'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    Urgency(final char representation)
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
    public static Urgency decode(final int representation)
    {
        switch(representation)
        {
        case '0': return NORMAL;
        case '1': return FLASH;
        case '2': return BACKGROUND;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
