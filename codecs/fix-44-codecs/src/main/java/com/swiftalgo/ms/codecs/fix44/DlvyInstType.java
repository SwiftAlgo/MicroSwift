/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum DlvyInstType implements CharRepresentable
{
    SECURITIES('S'),
    CASH('C'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    DlvyInstType(final char representation)
    {
         this.representation = representation;
    }

    public final char representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(4);
        static
    {
        intSet.add('S');
        intSet.add('C');
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static DlvyInstType decode(final int representation)
    {
        switch(representation)
        {
        case 'S': return SECURITIES;
        case 'C': return CASH;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
