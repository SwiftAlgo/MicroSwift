/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum BidType implements IntRepresentable
{
    NON_DISCLOSED(1),
    DISCLOSED_STYLE(2),
    NO_BIDDING_PROCESS(3),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    BidType(final int representation)
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
    public static BidType decode(final int representation)
    {
        switch(representation)
        {
        case 1: return NON_DISCLOSED;
        case 2: return DISCLOSED_STYLE;
        case 3: return NO_BIDDING_PROCESS;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
