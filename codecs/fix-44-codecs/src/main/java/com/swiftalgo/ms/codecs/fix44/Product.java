/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum Product implements IntRepresentable
{
    AGENCY(1),
    COMMODITY(2),
    CORPORATE(3),
    CURRENCY(4),
    EQUITY(5),
    GOVERNMENT(6),
    INDEX(7),
    LOAN(8),
    MONEYMARKET(9),
    MORTGAGE(10),
    MUNICIPAL(11),
    OTHER(12),
    FINANCING(13),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    Product(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(26);
        static
    {
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
        intSet.add(4);
        intSet.add(5);
        intSet.add(6);
        intSet.add(7);
        intSet.add(8);
        intSet.add(9);
        intSet.add(10);
        intSet.add(11);
        intSet.add(12);
        intSet.add(13);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static Product decode(final int representation)
    {
        switch(representation)
        {
        case 1: return AGENCY;
        case 2: return COMMODITY;
        case 3: return CORPORATE;
        case 4: return CURRENCY;
        case 5: return EQUITY;
        case 6: return GOVERNMENT;
        case 7: return INDEX;
        case 8: return LOAN;
        case 9: return MONEYMARKET;
        case 10: return MORTGAGE;
        case 11: return MUNICIPAL;
        case 12: return OTHER;
        case 13: return FINANCING;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
