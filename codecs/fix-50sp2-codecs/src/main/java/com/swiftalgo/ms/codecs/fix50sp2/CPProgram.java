/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum CPProgram implements IntRepresentable
{
    _3(1),
    _4(2),
    OTHER(99),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    CPProgram(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(6);
        static
    {
        intSet.add(1);
        intSet.add(2);
        intSet.add(99);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static CPProgram decode(final int representation)
    {
        switch(representation)
        {
        case 1: return _3;
        case 2: return _4;
        case 99: return OTHER;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
