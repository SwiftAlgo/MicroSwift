/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum ConfirmStatus implements IntRepresentable
{
    RECEIVED(1),
    MISMATCHED_ACCOUNT(2),
    MISSING_SETTLEMENT_INSTRUCTIONS(3),
    CONFIRMED(4),
    REQUEST_REJECTED(5),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    ConfirmStatus(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(10);
        static
    {
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
        intSet.add(4);
        intSet.add(5);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static ConfirmStatus decode(final int representation)
    {
        switch(representation)
        {
        case 1: return RECEIVED;
        case 2: return MISMATCHED_ACCOUNT;
        case 3: return MISSING_SETTLEMENT_INSTRUCTIONS;
        case 4: return CONFIRMED;
        case 5: return REQUEST_REJECTED;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
