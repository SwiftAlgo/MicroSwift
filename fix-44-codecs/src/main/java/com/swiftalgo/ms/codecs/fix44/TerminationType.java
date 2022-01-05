/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum TerminationType implements IntRepresentable
{
    OVERNIGHT(1),
    TERM(2),
    FLEXIBLE(3),
    OPEN(4),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    TerminationType(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(8);
        static
    {
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
        intSet.add(4);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static TerminationType decode(final int representation)
    {
        switch(representation)
        {
        case 1: return OVERNIGHT;
        case 2: return TERM;
        case 3: return FLEXIBLE;
        case 4: return OPEN;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
