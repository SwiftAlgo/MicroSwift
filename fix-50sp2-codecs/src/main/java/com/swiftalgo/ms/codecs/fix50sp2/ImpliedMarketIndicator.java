/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum ImpliedMarketIndicator implements IntRepresentable
{
    NOT_IMPLIED(0),
    IMPLIED_IN_THE_EXISTENCE_OF_A_MULTI_LEG_INSTRUMENT_IS_IMPLIED_BY_THE_LEGS_OF_THAT_INSTRUMENT(1),
    IMPLIED_OUT_THE_EXISTENCE_OF_THE_UNDERLYING_LEGS_ARE_IMPLIED_BY_THE_MULTI_LEG_INSTRUMENT(2),
    BOTH_IMPLIED_IN_AND_IMPLIED_OUT(3),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    ImpliedMarketIndicator(final int representation)
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
    public static ImpliedMarketIndicator decode(final int representation)
    {
        switch(representation)
        {
        case 0: return NOT_IMPLIED;
        case 1: return IMPLIED_IN_THE_EXISTENCE_OF_A_MULTI_LEG_INSTRUMENT_IS_IMPLIED_BY_THE_LEGS_OF_THAT_INSTRUMENT;
        case 2: return IMPLIED_OUT_THE_EXISTENCE_OF_THE_UNDERLYING_LEGS_ARE_IMPLIED_BY_THE_MULTI_LEG_INSTRUMENT;
        case 3: return BOTH_IMPLIED_IN_AND_IMPLIED_OUT;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
