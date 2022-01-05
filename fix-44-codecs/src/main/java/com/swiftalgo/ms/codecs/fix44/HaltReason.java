/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum HaltReason implements CharRepresentable
{
    ORDER_IMBALANCE('I'),
    EQUIPMENT_CHANGEOVER('X'),
    NEWS_PENDING('P'),
    NEWS_DISSEMINATION('D'),
    ORDER_INFLUX('E'),
    ADDITIONAL_INFORMATION('M'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    HaltReason(final char representation)
    {
         this.representation = representation;
    }

    public final char representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(12);
        static
    {
        intSet.add('I');
        intSet.add('X');
        intSet.add('P');
        intSet.add('D');
        intSet.add('E');
        intSet.add('M');
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static HaltReason decode(final int representation)
    {
        switch(representation)
        {
        case 'I': return ORDER_IMBALANCE;
        case 'X': return EQUIPMENT_CHANGEOVER;
        case 'P': return NEWS_PENDING;
        case 'D': return NEWS_DISSEMINATION;
        case 'E': return ORDER_INFLUX;
        case 'M': return ADDITIONAL_INFORMATION;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
