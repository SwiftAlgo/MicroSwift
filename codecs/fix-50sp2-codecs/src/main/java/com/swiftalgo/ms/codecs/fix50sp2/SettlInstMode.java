/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum SettlInstMode implements CharRepresentable
{
    DEFAULT('0'),
    STANDING_INSTRUCTIONS_PROVIDED('1'),
    SPECIFIC_ALLOCATION_ACCOUNT_OVERRIDING('2'),
    SPECIFIC_ALLOCATION_ACCOUNT_STANDING('3'),
    SPECIFIC_ORDER_FOR_A_SINGLE_ACCOUNT('4'),
    REQUEST_REJECT('5'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    SettlInstMode(final char representation)
    {
         this.representation = representation;
    }

    public final char representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(12);
        static
    {
        intSet.add('0');
        intSet.add('1');
        intSet.add('2');
        intSet.add('3');
        intSet.add('4');
        intSet.add('5');
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static SettlInstMode decode(final int representation)
    {
        switch(representation)
        {
        case '0': return DEFAULT;
        case '1': return STANDING_INSTRUCTIONS_PROVIDED;
        case '2': return SPECIFIC_ALLOCATION_ACCOUNT_OVERRIDING;
        case '3': return SPECIFIC_ALLOCATION_ACCOUNT_STANDING;
        case '4': return SPECIFIC_ORDER_FOR_A_SINGLE_ACCOUNT;
        case '5': return REQUEST_REJECT;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
