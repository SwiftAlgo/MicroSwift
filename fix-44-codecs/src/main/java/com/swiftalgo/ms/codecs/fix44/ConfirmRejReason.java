/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum ConfirmRejReason implements IntRepresentable
{
    MISMATCHED_ACCOUNT(1),
    MISSING_SETTLEMENT_INSTRUCTIONS(2),
    OTHER(99),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    ConfirmRejReason(final int representation)
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
    public static ConfirmRejReason decode(final int representation)
    {
        switch(representation)
        {
        case 1: return MISMATCHED_ACCOUNT;
        case 2: return MISSING_SETTLEMENT_INSTRUCTIONS;
        case 99: return OTHER;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
