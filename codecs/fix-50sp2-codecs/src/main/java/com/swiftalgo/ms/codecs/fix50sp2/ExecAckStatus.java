/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum ExecAckStatus implements CharRepresentable
{
    RECEIVED_NOT_YET_PROCESSED('0'),
    ACCEPTED('1'),
    DONT_KNOW_REJECTED('2'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    ExecAckStatus(final char representation)
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
    public static ExecAckStatus decode(final int representation)
    {
        switch(representation)
        {
        case '0': return RECEIVED_NOT_YET_PROCESSED;
        case '1': return ACCEPTED;
        case '2': return DONT_KNOW_REJECTED;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
