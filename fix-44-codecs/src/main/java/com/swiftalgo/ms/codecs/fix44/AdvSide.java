/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum AdvSide implements CharRepresentable
{
    BUY('B'),
    SELL('S'),
    CROSS('X'),
    TRADE('T'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    AdvSide(final char representation)
    {
         this.representation = representation;
    }

    public final char representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(8);
        static
    {
        intSet.add('B');
        intSet.add('S');
        intSet.add('X');
        intSet.add('T');
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static AdvSide decode(final int representation)
    {
        switch(representation)
        {
        case 'B': return BUY;
        case 'S': return SELL;
        case 'X': return CROSS;
        case 'T': return TRADE;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
