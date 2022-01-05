/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum ContAmtType implements IntRepresentable
{
    COMMISSION_AMOUNT(1),
    COMMISSION_PERCENT(2),
    INITIAL_CHARGE_AMOUNT(3),
    INITIAL_CHARGE_PERCENT(4),
    DISCOUNT_AMOUNT(5),
    DISCOUNT_PERCENT(6),
    DILUTION_LEVY_AMOUNT(7),
    DILUTION_LEVY_PERCENT(8),
    EXIT_CHARGE_AMOUNT(9),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    ContAmtType(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(18);
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
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static ContAmtType decode(final int representation)
    {
        switch(representation)
        {
        case 1: return COMMISSION_AMOUNT;
        case 2: return COMMISSION_PERCENT;
        case 3: return INITIAL_CHARGE_AMOUNT;
        case 4: return INITIAL_CHARGE_PERCENT;
        case 5: return DISCOUNT_AMOUNT;
        case 6: return DISCOUNT_PERCENT;
        case 7: return DILUTION_LEVY_AMOUNT;
        case 8: return DILUTION_LEVY_PERCENT;
        case 9: return EXIT_CHARGE_AMOUNT;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
