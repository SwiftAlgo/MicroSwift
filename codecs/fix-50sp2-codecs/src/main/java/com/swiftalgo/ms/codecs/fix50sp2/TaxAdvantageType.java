/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum TaxAdvantageType implements IntRepresentable
{
    NONE_NOT_APPLICABLE(0),
    MAXI_ISA(1),
    TESSA(2),
    MINI_CASH_ISA(3),
    MINI_STOCKS_AND_SHARES_ISA(4),
    MINI_INSURANCE_ISA(5),
    CURRENT_YEAR_PAYMENT(6),
    PRIOR_YEAR_PAYMENT(7),
    ASSET_TRANSFER(8),
    EMPLOYEE_PRIOR_YEAR(9),
    EMPLOYEE_CURRENT_YEAR(10),
    EMPLOYER_PRIOR_YEAR(11),
    EMPLOYER_CURRENT_YEAR(12),
    NON_FUND_PROTOTYPE_IRA(13),
    NON_FUND_QUALIFIED_PLAN(14),
    DEFINED_CONTRIBUTION_PLAN(15),
    INDIVIDUAL_RETIREMENT_ACCOUNT(16),
    INDIVIDUAL_RETIREMENT_ACCOUNT_ROLLOVER(17),
    KEOGH(18),
    PROFIT_SHARING_PLAN(19),
    _401(20),
    SELF_DIRECTED_IRA(21),
    _403(22),
    _457(23),
    ROTH_IRA(24),
    ROTH_IRA_1(25),
    ROTH_CONVERSION_IRA(26),
    ROTH_CONVERSION_IRA_1(27),
    EDUCATION_IRA(28),
    EDUCATION_IRA_1(29),
    OTHER(999),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    TaxAdvantageType(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(62);
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
        intSet.add(10);
        intSet.add(11);
        intSet.add(12);
        intSet.add(13);
        intSet.add(14);
        intSet.add(15);
        intSet.add(16);
        intSet.add(17);
        intSet.add(18);
        intSet.add(19);
        intSet.add(20);
        intSet.add(21);
        intSet.add(22);
        intSet.add(23);
        intSet.add(24);
        intSet.add(25);
        intSet.add(26);
        intSet.add(27);
        intSet.add(28);
        intSet.add(29);
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
        case 0: return NONE_NOT_APPLICABLE;
        case 1: return MAXI_ISA;
        case 2: return TESSA;
        case 3: return MINI_CASH_ISA;
        case 4: return MINI_STOCKS_AND_SHARES_ISA;
        case 5: return MINI_INSURANCE_ISA;
        case 6: return CURRENT_YEAR_PAYMENT;
        case 7: return PRIOR_YEAR_PAYMENT;
        case 8: return ASSET_TRANSFER;
        case 9: return EMPLOYEE_PRIOR_YEAR;
        case 10: return EMPLOYEE_CURRENT_YEAR;
        case 11: return EMPLOYER_PRIOR_YEAR;
        case 12: return EMPLOYER_CURRENT_YEAR;
        case 13: return NON_FUND_PROTOTYPE_IRA;
        case 14: return NON_FUND_QUALIFIED_PLAN;
        case 15: return DEFINED_CONTRIBUTION_PLAN;
        case 16: return INDIVIDUAL_RETIREMENT_ACCOUNT;
        case 17: return INDIVIDUAL_RETIREMENT_ACCOUNT_ROLLOVER;
        case 18: return KEOGH;
        case 19: return PROFIT_SHARING_PLAN;
        case 20: return _401;
        case 21: return SELF_DIRECTED_IRA;
        case 22: return _403;
        case 23: return _457;
        case 24: return ROTH_IRA;
        case 25: return ROTH_IRA_1;
        case 26: return ROTH_CONVERSION_IRA;
        case 27: return ROTH_CONVERSION_IRA_1;
        case 28: return EDUCATION_IRA;
        case 29: return EDUCATION_IRA_1;
        case 999: return OTHER;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
