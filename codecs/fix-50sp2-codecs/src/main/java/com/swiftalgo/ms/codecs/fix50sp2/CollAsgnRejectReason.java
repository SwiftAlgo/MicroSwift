/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum CollAsgnRejectReason implements IntRepresentable
{
    UNKNOWN_DEAL(0),
    UNKNOWN_OR_INVALID_INSTRUMENT(1),
    UNAUTHORIZED_TRANSACTION(2),
    INSUFFICIENT_COLLATERAL(3),
    INVALID_TYPE_OF_COLLATERAL(4),
    EXCESSIVE_SUBSTITUTION(5),
    OTHER(99),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    CollAsgnRejectReason(final int representation)
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
        intSet.add(99);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static CollAsgnRejectReason decode(final int representation)
    {
        switch(representation)
        {
        case 0: return UNKNOWN_DEAL;
        case 1: return UNKNOWN_OR_INVALID_INSTRUMENT;
        case 2: return UNAUTHORIZED_TRANSACTION;
        case 3: return INSUFFICIENT_COLLATERAL;
        case 4: return INVALID_TYPE_OF_COLLATERAL;
        case 5: return EXCESSIVE_SUBSTITUTION;
        case 99: return OTHER;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
