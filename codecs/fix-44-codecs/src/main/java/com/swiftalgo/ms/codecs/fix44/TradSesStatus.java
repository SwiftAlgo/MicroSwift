/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum TradSesStatus implements IntRepresentable
{
    UNKNOWN(0),
    HALTED(1),
    OPEN(2),
    CLOSED(3),
    PRE_OPEN(4),
    PRE_CLOSE(5),
    REQUEST_REJECTED(6),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    TradSesStatus(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(14);
        static
    {
        intSet.add(0);
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
        intSet.add(4);
        intSet.add(5);
        intSet.add(6);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static TradSesStatus decode(final int representation)
    {
        switch(representation)
        {
        case 0: return UNKNOWN;
        case 1: return HALTED;
        case 2: return OPEN;
        case 3: return CLOSED;
        case 4: return PRE_OPEN;
        case 5: return PRE_CLOSE;
        case 6: return REQUEST_REJECTED;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
