/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum AllocAccountType implements IntRepresentable
{
    ACCOUNT_IS_CARRIED_ON_CUSTOMER_SIDE_OF_BOOKS(1),
    ACCOUNT_IS_CARRIED_ON_NON_CUSTOMER_SIDE_OF_BOOKS(2),
    HOUSE_TRADER(3),
    FLOOR_TRADER(4),
    ACCOUNT_IS_CARRIED_ON_NON_CUSTOMER_SIDE_OF_BOOKS_AND_IS_CROSS_MARGINED(6),
    ACCOUNT_IS_HOUSE_TRADER_AND_IS_CROSS_MARGINED(7),
    JOINT_BACKOFFICE_ACCOUNT(8),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    AllocAccountType(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(14);
        static
    {
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
        intSet.add(4);
        intSet.add(6);
        intSet.add(7);
        intSet.add(8);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static AllocAccountType decode(final int representation)
    {
        switch(representation)
        {
        case 1: return ACCOUNT_IS_CARRIED_ON_CUSTOMER_SIDE_OF_BOOKS;
        case 2: return ACCOUNT_IS_CARRIED_ON_NON_CUSTOMER_SIDE_OF_BOOKS;
        case 3: return HOUSE_TRADER;
        case 4: return FLOOR_TRADER;
        case 6: return ACCOUNT_IS_CARRIED_ON_NON_CUSTOMER_SIDE_OF_BOOKS_AND_IS_CROSS_MARGINED;
        case 7: return ACCOUNT_IS_HOUSE_TRADER_AND_IS_CROSS_MARGINED;
        case 8: return JOINT_BACKOFFICE_ACCOUNT;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
