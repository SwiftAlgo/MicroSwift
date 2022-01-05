/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum TaxAdvantageType implements IntRepresentable
{
    NONE(0),
    MAXI_ISA(1),
    TESSA(2),
    MINI_CASH_ISA(3),
    MINI_STOCKS_AND_SHARES_ISA(4),
    MINI_INSURANCE_ISA(5),
    CURRENT_YEAR_PAYMENT(6),
    PRIOR_YEAR_PAYMENT(7),
    ASSET_TRANSFER(8),
    EMPLOYEE_PRIOR_YEAR(9),
    OTHER(999),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    TaxAdvantageType(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(22);
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
        intSet.add(8);
        intSet.add(9);
        intSet.add(999);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static TaxAdvantageType decode(final int representation)
    {
        switch(representation)
        {
        case 0: return NONE;
        case 1: return MAXI_ISA;
        case 2: return TESSA;
        case 3: return MINI_CASH_ISA;
        case 4: return MINI_STOCKS_AND_SHARES_ISA;
        case 5: return MINI_INSURANCE_ISA;
        case 6: return CURRENT_YEAR_PAYMENT;
        case 7: return PRIOR_YEAR_PAYMENT;
        case 8: return ASSET_TRANSFER;
        case 9: return EMPLOYEE_PRIOR_YEAR;
        case 999: return OTHER;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
