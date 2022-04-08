/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum TriggerOrderType implements CharRepresentable
{
    MARKET('1'),
    LIMIT('2'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    TriggerOrderType(final char representation)
    {
         this.representation = representation;
    }

    public final char representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(4);
        static
    {
        intSet.add('1');
        intSet.add('2');
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static TriggerOrderType decode(final int representation)
    {
        switch(representation)
        {
        case '1': return MARKET;
        case '2': return LIMIT;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
