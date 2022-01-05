/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum CollInquiryQualifier implements IntRepresentable
{
    TRADEDATE(0),
    GC_INSTRUMENT(1),
    COLLATERALINSTRUMENT(2),
    SUBSTITUTION_ELIGIBLE(3),
    NOT_ASSIGNED(4),
    PARTIALLY_ASSIGNED(5),
    FULLY_ASSIGNED(6),
    OUTSTANDING_TRADES(7),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    CollInquiryQualifier(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(16);
        static
    {
        intSet.add(0);
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
        intSet.add(4);
        intSet.add(5);
        intSet.add(6);
        intSet.add(7);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static CollInquiryQualifier decode(final int representation)
    {
        switch(representation)
        {
        case 0: return TRADEDATE;
        case 1: return GC_INSTRUMENT;
        case 2: return COLLATERALINSTRUMENT;
        case 3: return SUBSTITUTION_ELIGIBLE;
        case 4: return NOT_ASSIGNED;
        case 5: return PARTIALLY_ASSIGNED;
        case 6: return FULLY_ASSIGNED;
        case 7: return OUTSTANDING_TRADES;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
