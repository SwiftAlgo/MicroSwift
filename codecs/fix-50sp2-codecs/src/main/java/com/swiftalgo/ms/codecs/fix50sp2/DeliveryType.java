/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum DeliveryType implements IntRepresentable
{
    VERSUS_PAYMENT_DELIVER_PAYMENT(0),
    FREE_DELIVER_FREE(1),
    TRI_PARTY(2),
    HOLD_IN_CUSTODY(3),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    DeliveryType(final int representation)
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
    public static DeliveryType decode(final int representation)
    {
        switch(representation)
        {
        case 0: return VERSUS_PAYMENT_DELIVER_PAYMENT;
        case 1: return FREE_DELIVER_FREE;
        case 2: return TRI_PARTY;
        case 3: return HOLD_IN_CUSTODY;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
