/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum AsOfIndicator implements CharRepresentable
{
    FALSE_TRADE_IS_NOT_AN_ASOF_TRADE('0'),
    TRUE_TRADE_IS_AN_ASOF_TRADE('1'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    AsOfIndicator(final char representation)
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
    public static AsOfIndicator decode(final int representation)
    {
        switch(representation)
        {
        case '0': return FALSE_TRADE_IS_NOT_AN_ASOF_TRADE;
        case '1': return TRUE_TRADE_IS_AN_ASOF_TRADE;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
