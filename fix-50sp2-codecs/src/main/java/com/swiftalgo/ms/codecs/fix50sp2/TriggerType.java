/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum TriggerType implements CharRepresentable
{
    PARTIAL_EXECUTION('1'),
    SPECIFIED_TRADING_SESSION('2'),
    NEXT_AUCTION('3'),
    PRICE_MOVEMENT('4'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    TriggerType(final char representation)
    {
         this.representation = representation;
    }

    public final char representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(8);
        static
    {
        intSet.add('1');
        intSet.add('2');
        intSet.add('3');
        intSet.add('4');
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static TriggerType decode(final int representation)
    {
        switch(representation)
        {
        case '1': return PARTIAL_EXECUTION;
        case '2': return SPECIFIED_TRADING_SESSION;
        case '3': return NEXT_AUCTION;
        case '4': return PRICE_MOVEMENT;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
