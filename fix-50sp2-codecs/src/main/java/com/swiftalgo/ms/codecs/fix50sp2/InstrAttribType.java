/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum InstrAttribType implements IntRepresentable
{
    FLAT(1),
    ZERO_COUPON(2),
    INTEREST_BEARING(3),
    NO_PERIODIC_PAYMENTS(4),
    VARIABLE_RATE(5),
    LESS_FEE_FOR_PUT(6),
    STEPPED_COUPON(7),
    COUPON_PERIOD_FIELD_(8),
    WHEN_AND_IF_ISSUED(9),
    ORIGINAL_ISSUE_DISCOUNT(10),
    CALLABLE_PUTTABLE(11),
    ESCROWED_TO_MATURITY(12),
    ESCROWED_TO_REDEMPTION_DATE_CALLABLE_SUPPLY_REDEMPTION_DATE_IN_THE_INSTRATTRIBVALUE_FIELD(13),
    PRE_REFUNDED(14),
    IN_DEFAULT(15),
    UNRATED(16),
    TAXABLE(17),
    INDEXED(18),
    SUBJECT_TO_ALTERNATIVE_MINIMUM_TAX(19),
    ORIGINAL_ISSUE_DISCOUNT_PRICE_SUPPLY_PRICE_IN_THE_INSTRATTRIBVALUE_FIELD(20),
    CALLABLE_BELOW_MATURITY_VALUE(21),
    CALLABLE_WITHOUT_NOTICE_BY_MAIL_TO_HOLDER_UNLESS_REGISTERED(22),
    PRICE_TICK_RULES_FOR_SECURITY_(23),
    TRADE_TYPE_ELIGIBILITY_DETAILS_FOR_SECURITY_(24),
    INSTRUMENT_DENOMINATOR(25),
    INSTRUMENT_NUMERATOR(26),
    INSTRUMENT_PRICE_PRECISION(27),
    INSTRUMENT_STRIKE_PRICE(28),
    TRADEABLE_INDICATOR(29),
    TEXT_SUPPLY_THE_TEXT_OF_THE_ATTRIBUTE_OR_DISCLAIMER_IN_THE_INSTRATTRIBVALUE_FIELD_(99),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    InstrAttribType(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(60);
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
        intSet.add(99);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static InstrAttribType decode(final int representation)
    {
        switch(representation)
        {
        case 1: return FLAT;
        case 2: return ZERO_COUPON;
        case 3: return INTEREST_BEARING;
        case 4: return NO_PERIODIC_PAYMENTS;
        case 5: return VARIABLE_RATE;
        case 6: return LESS_FEE_FOR_PUT;
        case 7: return STEPPED_COUPON;
        case 8: return COUPON_PERIOD_FIELD_;
        case 9: return WHEN_AND_IF_ISSUED;
        case 10: return ORIGINAL_ISSUE_DISCOUNT;
        case 11: return CALLABLE_PUTTABLE;
        case 12: return ESCROWED_TO_MATURITY;
        case 13: return ESCROWED_TO_REDEMPTION_DATE_CALLABLE_SUPPLY_REDEMPTION_DATE_IN_THE_INSTRATTRIBVALUE_FIELD;
        case 14: return PRE_REFUNDED;
        case 15: return IN_DEFAULT;
        case 16: return UNRATED;
        case 17: return TAXABLE;
        case 18: return INDEXED;
        case 19: return SUBJECT_TO_ALTERNATIVE_MINIMUM_TAX;
        case 20: return ORIGINAL_ISSUE_DISCOUNT_PRICE_SUPPLY_PRICE_IN_THE_INSTRATTRIBVALUE_FIELD;
        case 21: return CALLABLE_BELOW_MATURITY_VALUE;
        case 22: return CALLABLE_WITHOUT_NOTICE_BY_MAIL_TO_HOLDER_UNLESS_REGISTERED;
        case 23: return PRICE_TICK_RULES_FOR_SECURITY_;
        case 24: return TRADE_TYPE_ELIGIBILITY_DETAILS_FOR_SECURITY_;
        case 25: return INSTRUMENT_DENOMINATOR;
        case 26: return INSTRUMENT_NUMERATOR;
        case 27: return INSTRUMENT_PRICE_PRECISION;
        case 28: return INSTRUMENT_STRIKE_PRICE;
        case 29: return TRADEABLE_INDICATOR;
        case 99: return TEXT_SUPPLY_THE_TEXT_OF_THE_ATTRIBUTE_OR_DISCLAIMER_IN_THE_INSTRATTRIBVALUE_FIELD_;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
