/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum DeleteReason implements CharRepresentable
{
    CANCELATION_TRADE_BUST('0'),
    ERROR('1'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    DeleteReason(final char representation)
    {
         this.representation = representation;
    }

    public final char representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(4);
        static
    {
        intSet.add('0');
        intSet.add('1');
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static DeleteReason decode(final int representation)
    {
        switch(representation)
        {
        case '0': return CANCELATION_TRADE_BUST;
        case '1': return ERROR;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
