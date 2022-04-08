/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum OwnerType implements IntRepresentable
{
    INDIVIDUAL_INVESTOR(1),
    PUBLIC_COMPANY(2),
    PRIVATE_COMPANY(3),
    INDIVIDUAL_TRUSTEE(4),
    COMPANY_TRUSTEE(5),
    PENSION_PLAN(6),
    CUSTODIAN_UNDER_GIFTS_TO_MINORS_ACT(7),
    TRUSTS(8),
    FIDUCIARIES(9),
    NETWORKING_SUB_ACCOUNT(10),
    NON_PROFIT_ORGANIZATION(11),
    CORPORATE_BODY(12),
    NOMINEE(13),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    OwnerType(final int representation)
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
    public static OwnerType decode(final int representation)
    {
        switch(representation)
        {
        case 1: return INDIVIDUAL_INVESTOR;
        case 2: return PUBLIC_COMPANY;
        case 3: return PRIVATE_COMPANY;
        case 4: return INDIVIDUAL_TRUSTEE;
        case 5: return COMPANY_TRUSTEE;
        case 6: return PENSION_PLAN;
        case 7: return CUSTODIAN_UNDER_GIFTS_TO_MINORS_ACT;
        case 8: return TRUSTS;
        case 9: return FIDUCIARIES;
        case 10: return NETWORKING_SUB_ACCOUNT;
        case 11: return NON_PROFIT_ORGANIZATION;
        case 12: return CORPORATE_BODY;
        case 13: return NOMINEE;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
