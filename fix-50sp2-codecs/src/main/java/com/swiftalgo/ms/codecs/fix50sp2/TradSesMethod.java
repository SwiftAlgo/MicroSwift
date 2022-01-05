/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum TradSesMethod implements IntRepresentable
{
    ELECTRONIC(1),
    OPEN_OUTCRY(2),
    TWO_PARTY(3),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    TradSesMethod(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(6);
        static
    {
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static TradSesMethod decode(final int representation)
    {
        switch(representation)
        {
        case 1: return ELECTRONIC;
        case 2: return OPEN_OUTCRY;
        case 3: return TWO_PARTY;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
