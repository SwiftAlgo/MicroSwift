/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum ShortSaleReason implements IntRepresentable
{
    DEALER_SOLD_SHORT(0),
    DEALER_SOLD_SHORT_EXEMPT(1),
    SELLING_CUSTOMER_SOLD_SHORT(2),
    SELLING_CUSTOMER_SOLD_SHORT_EXEMPT(3),
    QUALIFIED_SERVICE_REPRESENTATIVE_CONTRA_SIDE_SOLD_SHORT(4),
    QSR_OR_AGU_CONTRA_SIDE_SOLD_SHORT_EXEMPT(5),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    ShortSaleReason(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(12);
        static
    {
        intSet.add(0);
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
    public static ShortSaleReason decode(final int representation)
    {
        switch(representation)
        {
        case 0: return DEALER_SOLD_SHORT;
        case 1: return DEALER_SOLD_SHORT_EXEMPT;
        case 2: return SELLING_CUSTOMER_SOLD_SHORT;
        case 3: return SELLING_CUSTOMER_SOLD_SHORT_EXEMPT;
        case 4: return QUALIFIED_SERVICE_REPRESENTATIVE_CONTRA_SIDE_SOLD_SHORT;
        case 5: return QSR_OR_AGU_CONTRA_SIDE_SOLD_SHORT_EXEMPT;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
