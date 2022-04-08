/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum TradSesEvent implements IntRepresentable
{
    TRADING_RESUMES(0),
    CHANGE_OF_TRADING_SESSION(1),
    CHANGE_OF_TRADING_SUBSESSION(2),
    CHANGE_OF_TRADING_STATUS(3),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    TradSesEvent(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(8);
        static
    {
        intSet.add(0);
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static TradSesEvent decode(final int representation)
    {
        switch(representation)
        {
        case 0: return TRADING_RESUMES;
        case 1: return CHANGE_OF_TRADING_SESSION;
        case 2: return CHANGE_OF_TRADING_SUBSESSION;
        case 3: return CHANGE_OF_TRADING_STATUS;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
