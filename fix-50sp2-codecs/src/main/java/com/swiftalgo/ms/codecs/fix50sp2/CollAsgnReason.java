/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum CollAsgnReason implements IntRepresentable
{
    INITIAL(0),
    SCHEDULED(1),
    TIME_WARNING(2),
    MARGIN_DEFICIENCY(3),
    MARGIN_EXCESS(4),
    FORWARD_COLLATERAL_DEMAND(5),
    EVENT_OF_DEFAULT(6),
    ADVERSE_TAX_EVENT(7),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    CollAsgnReason(final int representation)
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
    public static CollAsgnReason decode(final int representation)
    {
        switch(representation)
        {
        case 0: return INITIAL;
        case 1: return SCHEDULED;
        case 2: return TIME_WARNING;
        case 3: return MARGIN_DEFICIENCY;
        case 4: return MARGIN_EXCESS;
        case 5: return FORWARD_COLLATERAL_DEMAND;
        case 6: return EVENT_OF_DEFAULT;
        case 7: return ADVERSE_TAX_EVENT;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
