/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.StringRepresentable;
public enum StipulationType implements StringRepresentable
{
    ALTERNATIVE_MINIMUM_TAX("AMT"),
    ABSOLUTE_PREPAYMENT_SPEED("ABS"),
    AUTO_REINVESTMENT_AT_RATE_OR_BETTER("AUTOREINV"),
    CONSTANT_PREPAYMENT_PENALTY("CPP"),
    BANK_QUALIFIED("BANKQUAL"),
    CONSTANT_PREPAYMENT_RATE("CPR"),
    BARGAIN_CONDITIONS("BGNCON"),
    CONSTANT_PREPAYMENT_YIELD("CPY"),
    COUPON_RANGE("COUPON"),
    FINAL_CPR_OF_HOME_EQUITY_PREPAYMENT_CURVE("HEP"),
    ISO_CURRENCY_CODE("CURRENCY"),
    PERCENT_OF_MANUFACTURED_HOUSING_PREPAYMENT_CURVE("MHP"),
    CUSTOM_START_END_DATE("CUSTOMDATE"),
    MONTHLY_PREPAYMENT_RATE("MPR"),
    GEOGRAPHICS_AND_RANGE("GEOG"),
    PERCENT_OF_PROSPECTUS_PREPAYMENT_CURVE("PPC"),
    VALUATION_DISCOUNT("HAIRCUT"),
    PERCENT_OF_BMA_PREPAYMENT_CURVE("PSA"),
    INSURED("INSURED"),
    SINGLE_MONTHLY_MORTALITY("SMM"),
    YEAR_OR_YEAR_MONTH_OF_ISSUE("ISSUE"),
    ISSUERS_TICKER("ISSUER"),
    ISSUE_SIZE_RANGE("ISSUESIZE"),
    LOOKBACK_DAYS("LOOKBACK"),
    EXPLICIT_LOT_IDENTIFIER("LOT"),
    LOT_VARIANCE("LOTVAR"),
    MATURITY_YEAR_AND_MONTH("MAT"),
    MATURITY_RANGE("MATURITY"),
    MAXIMUM_SUBSTITUTIONS("MAXSUBS"),
    MINIMUM_DENOMINATION("MINDNOM"),
    MINIMUM_INCREMENT("MININCR"),
    MINIMUM_QUANTITY("MINQTY"),
    PAYMENT_FREQUENCY_CALENDAR("PAYFREQ"),
    NUMBER_OF_PIECES("PIECES"),
    POOLS_MAXIMUM("PMAX"),
    POOLS_PER_LOT("PPL"),
    POOLS_PER_MILLION("PPM"),
    POOLS_PER_TRADE("PPT"),
    PRICE_RANGE("PRICE"),
    PRICING_FREQUENCY("PRICEFREQ"),
    PRODUCTION_YEAR("PROD"),
    CALL_PROTECTION("PROTECT"),
    PURPOSE("PURPOSE"),
    BENCHMARK_PRICE_SOURCE("PXSOURCE"),
    RATING_SOURCE_AND_RANGE("RATING"),
    TYPE_OF_REDEMPTION_VALUES_ARE_NONCALLABLE_PREFUNDED_ESCROWEDTOMATURITY_PUTABLE_CONVERTIBLE("REDEMPTION"),
    RESTRICTED("RESTRICTED"),
    MARKET_SECTOR("SECTOR"),
    SECURITY_TYPE_INCLUDED_OR_EXCLUDED("SECTYPE"),
    STRUCTURE("STRUCT"),
    SUBSTITUTIONS_FREQUENCY("SUBSFREQ"),
    SUBSTITUTIONS_LEFT("SUBSLEFT"),
    FREEFORM_TEXT("TEXT"),
    TRADE_VARIANCE("TRDVAR"),
    WEIGHTED_AVERAGE_COUPON_VALUE_IN_PERCENT("WAC"),
    WEIGHTED_AVERAGE_LIFE_COUPON_VALUE_IN_PERCENT("WAL"),
    WEIGHTED_AVERAGE_LOAN_AGE_VALUE_IN_MONTHS("WALA"),
    WEIGHTED_AVERAGE_MATURITY_VALUE_IN_MONTHS("WAM"),
    WHOLE_POOL("WHOLE"),
    YIELD_RANGE("YIELD"),
    AVERAGE_FICO_SCORE("AVFICO"),
    AVERAGE_LOAN_SIZE("AVSIZE"),
    MAXIMUM_LOAN_BALANCE("MAXBAL"),
    POOL_IDENTIFIER("POOL"),
    TYPE_OF_ROLL_TRADE("ROLLTYPE"),
    REFERENCE_TO_ROLLING_OR_CLOSING_TRADE("REFTRADE"),
    PRINCIPAL_OF_ROLLING_OR_CLOSING_TRADE("REFPRIN"),
    INTEREST_OF_ROLLING_OR_CLOSING_TRADE("REFINT"),
    AVAILABLE_OFFER_QUANTITY_TO_BE_SHOWN_TO_THE_STREET("AVAILQTY"),
    BROKERS_SALES_CREDIT("BROKERCREDIT"),
    OFFER_PRICE_TO_BE_SHOWN_TO_INTERNAL_BROKERS("INTERNALPX"),
    OFFER_QUANTITY_TO_BE_SHOWN_TO_INTERNAL_BROKERS("INTERNALQTY"),
    THE_MINIMUM_RESIDUAL_OFFER_QUANTITY("LEAVEQTY"),
    MAXIMUM_ORDER_SIZE("MAXORDQTY"),
    ORDER_QUANTITY_INCREMENT("ORDRINCR"),
    PRIMARY_OR_SECONDARY_MARKET_INDICATOR("PRIMARY"),
    BROKER_SALES_CREDIT_OVERRIDE("SALESCREDITOVR"),
    TRADERS_CREDIT("TRADERCREDIT"),
    DISCOUNT_RATE("DISCOUNT"),
    YIELD_TO_MATURITY("YTM"),
    NULL_VAL(""),
    ARTIO_UNKNOWN("");

    private final String representation;

    StipulationType(final String representation)
    {
         this.representation = representation;
    }

    public final String representation() { return representation; }

    private static final CharArrayMap<StipulationType> charMap;
    static
    {
        final Map<String, StipulationType> stringMap = new HashMap<>();
        stringMap.put("AMT", ALTERNATIVE_MINIMUM_TAX);
        stringMap.put("ABS", ABSOLUTE_PREPAYMENT_SPEED);
        stringMap.put("AUTOREINV", AUTO_REINVESTMENT_AT_RATE_OR_BETTER);
        stringMap.put("CPP", CONSTANT_PREPAYMENT_PENALTY);
        stringMap.put("BANKQUAL", BANK_QUALIFIED);
        stringMap.put("CPR", CONSTANT_PREPAYMENT_RATE);
        stringMap.put("BGNCON", BARGAIN_CONDITIONS);
        stringMap.put("CPY", CONSTANT_PREPAYMENT_YIELD);
        stringMap.put("COUPON", COUPON_RANGE);
        stringMap.put("HEP", FINAL_CPR_OF_HOME_EQUITY_PREPAYMENT_CURVE);
        stringMap.put("CURRENCY", ISO_CURRENCY_CODE);
        stringMap.put("MHP", PERCENT_OF_MANUFACTURED_HOUSING_PREPAYMENT_CURVE);
        stringMap.put("CUSTOMDATE", CUSTOM_START_END_DATE);
        stringMap.put("MPR", MONTHLY_PREPAYMENT_RATE);
        stringMap.put("GEOG", GEOGRAPHICS_AND_RANGE);
        stringMap.put("PPC", PERCENT_OF_PROSPECTUS_PREPAYMENT_CURVE);
        stringMap.put("HAIRCUT", VALUATION_DISCOUNT);
        stringMap.put("PSA", PERCENT_OF_BMA_PREPAYMENT_CURVE);
        stringMap.put("INSURED", INSURED);
        stringMap.put("SMM", SINGLE_MONTHLY_MORTALITY);
        stringMap.put("ISSUE", YEAR_OR_YEAR_MONTH_OF_ISSUE);
        stringMap.put("ISSUER", ISSUERS_TICKER);
        stringMap.put("ISSUESIZE", ISSUE_SIZE_RANGE);
        stringMap.put("LOOKBACK", LOOKBACK_DAYS);
        stringMap.put("LOT", EXPLICIT_LOT_IDENTIFIER);
        stringMap.put("LOTVAR", LOT_VARIANCE);
        stringMap.put("MAT", MATURITY_YEAR_AND_MONTH);
        stringMap.put("MATURITY", MATURITY_RANGE);
        stringMap.put("MAXSUBS", MAXIMUM_SUBSTITUTIONS);
        stringMap.put("MINDNOM", MINIMUM_DENOMINATION);
        stringMap.put("MININCR", MINIMUM_INCREMENT);
        stringMap.put("MINQTY", MINIMUM_QUANTITY);
        stringMap.put("PAYFREQ", PAYMENT_FREQUENCY_CALENDAR);
        stringMap.put("PIECES", NUMBER_OF_PIECES);
        stringMap.put("PMAX", POOLS_MAXIMUM);
        stringMap.put("PPL", POOLS_PER_LOT);
        stringMap.put("PPM", POOLS_PER_MILLION);
        stringMap.put("PPT", POOLS_PER_TRADE);
        stringMap.put("PRICE", PRICE_RANGE);
        stringMap.put("PRICEFREQ", PRICING_FREQUENCY);
        stringMap.put("PROD", PRODUCTION_YEAR);
        stringMap.put("PROTECT", CALL_PROTECTION);
        stringMap.put("PURPOSE", PURPOSE);
        stringMap.put("PXSOURCE", BENCHMARK_PRICE_SOURCE);
        stringMap.put("RATING", RATING_SOURCE_AND_RANGE);
        stringMap.put("REDEMPTION", TYPE_OF_REDEMPTION_VALUES_ARE_NONCALLABLE_PREFUNDED_ESCROWEDTOMATURITY_PUTABLE_CONVERTIBLE);
        stringMap.put("RESTRICTED", RESTRICTED);
        stringMap.put("SECTOR", MARKET_SECTOR);
        stringMap.put("SECTYPE", SECURITY_TYPE_INCLUDED_OR_EXCLUDED);
        stringMap.put("STRUCT", STRUCTURE);
        stringMap.put("SUBSFREQ", SUBSTITUTIONS_FREQUENCY);
        stringMap.put("SUBSLEFT", SUBSTITUTIONS_LEFT);
        stringMap.put("TEXT", FREEFORM_TEXT);
        stringMap.put("TRDVAR", TRADE_VARIANCE);
        stringMap.put("WAC", WEIGHTED_AVERAGE_COUPON_VALUE_IN_PERCENT);
        stringMap.put("WAL", WEIGHTED_AVERAGE_LIFE_COUPON_VALUE_IN_PERCENT);
        stringMap.put("WALA", WEIGHTED_AVERAGE_LOAN_AGE_VALUE_IN_MONTHS);
        stringMap.put("WAM", WEIGHTED_AVERAGE_MATURITY_VALUE_IN_MONTHS);
        stringMap.put("WHOLE", WHOLE_POOL);
        stringMap.put("YIELD", YIELD_RANGE);
        stringMap.put("AVFICO", AVERAGE_FICO_SCORE);
        stringMap.put("AVSIZE", AVERAGE_LOAN_SIZE);
        stringMap.put("MAXBAL", MAXIMUM_LOAN_BALANCE);
        stringMap.put("POOL", POOL_IDENTIFIER);
        stringMap.put("ROLLTYPE", TYPE_OF_ROLL_TRADE);
        stringMap.put("REFTRADE", REFERENCE_TO_ROLLING_OR_CLOSING_TRADE);
        stringMap.put("REFPRIN", PRINCIPAL_OF_ROLLING_OR_CLOSING_TRADE);
        stringMap.put("REFINT", INTEREST_OF_ROLLING_OR_CLOSING_TRADE);
        stringMap.put("AVAILQTY", AVAILABLE_OFFER_QUANTITY_TO_BE_SHOWN_TO_THE_STREET);
        stringMap.put("BROKERCREDIT", BROKERS_SALES_CREDIT);
        stringMap.put("INTERNALPX", OFFER_PRICE_TO_BE_SHOWN_TO_INTERNAL_BROKERS);
        stringMap.put("INTERNALQTY", OFFER_QUANTITY_TO_BE_SHOWN_TO_INTERNAL_BROKERS);
        stringMap.put("LEAVEQTY", THE_MINIMUM_RESIDUAL_OFFER_QUANTITY);
        stringMap.put("MAXORDQTY", MAXIMUM_ORDER_SIZE);
        stringMap.put("ORDRINCR", ORDER_QUANTITY_INCREMENT);
        stringMap.put("PRIMARY", PRIMARY_OR_SECONDARY_MARKET_INDICATOR);
        stringMap.put("SALESCREDITOVR", BROKER_SALES_CREDIT_OVERRIDE);
        stringMap.put("TRADERCREDIT", TRADERS_CREDIT);
        stringMap.put("DISCOUNT", DISCOUNT_RATE);
        stringMap.put("YTM", YIELD_TO_MATURITY);
        charMap = new CharArrayMap<>(stringMap);
    }

    public static StipulationType decode(final CharArrayWrapper key)
    {
        final StipulationType value = charMap.get(key);
        if (value == null)
        {
            return ARTIO_UNKNOWN;
        }
        return value;
    }
    public static boolean isValid(final CharArrayWrapper key)
    {
        return charMap.containsKey(key);
    }
    public static StipulationType decode(final String representation)
    {
        switch(representation)
        {
        case "AMT": return ALTERNATIVE_MINIMUM_TAX;
        case "ABS": return ABSOLUTE_PREPAYMENT_SPEED;
        case "AUTOREINV": return AUTO_REINVESTMENT_AT_RATE_OR_BETTER;
        case "CPP": return CONSTANT_PREPAYMENT_PENALTY;
        case "BANKQUAL": return BANK_QUALIFIED;
        case "CPR": return CONSTANT_PREPAYMENT_RATE;
        case "BGNCON": return BARGAIN_CONDITIONS;
        case "CPY": return CONSTANT_PREPAYMENT_YIELD;
        case "COUPON": return COUPON_RANGE;
        case "HEP": return FINAL_CPR_OF_HOME_EQUITY_PREPAYMENT_CURVE;
        case "CURRENCY": return ISO_CURRENCY_CODE;
        case "MHP": return PERCENT_OF_MANUFACTURED_HOUSING_PREPAYMENT_CURVE;
        case "CUSTOMDATE": return CUSTOM_START_END_DATE;
        case "MPR": return MONTHLY_PREPAYMENT_RATE;
        case "GEOG": return GEOGRAPHICS_AND_RANGE;
        case "PPC": return PERCENT_OF_PROSPECTUS_PREPAYMENT_CURVE;
        case "HAIRCUT": return VALUATION_DISCOUNT;
        case "PSA": return PERCENT_OF_BMA_PREPAYMENT_CURVE;
        case "INSURED": return INSURED;
        case "SMM": return SINGLE_MONTHLY_MORTALITY;
        case "ISSUE": return YEAR_OR_YEAR_MONTH_OF_ISSUE;
        case "ISSUER": return ISSUERS_TICKER;
        case "ISSUESIZE": return ISSUE_SIZE_RANGE;
        case "LOOKBACK": return LOOKBACK_DAYS;
        case "LOT": return EXPLICIT_LOT_IDENTIFIER;
        case "LOTVAR": return LOT_VARIANCE;
        case "MAT": return MATURITY_YEAR_AND_MONTH;
        case "MATURITY": return MATURITY_RANGE;
        case "MAXSUBS": return MAXIMUM_SUBSTITUTIONS;
        case "MINDNOM": return MINIMUM_DENOMINATION;
        case "MININCR": return MINIMUM_INCREMENT;
        case "MINQTY": return MINIMUM_QUANTITY;
        case "PAYFREQ": return PAYMENT_FREQUENCY_CALENDAR;
        case "PIECES": return NUMBER_OF_PIECES;
        case "PMAX": return POOLS_MAXIMUM;
        case "PPL": return POOLS_PER_LOT;
        case "PPM": return POOLS_PER_MILLION;
        case "PPT": return POOLS_PER_TRADE;
        case "PRICE": return PRICE_RANGE;
        case "PRICEFREQ": return PRICING_FREQUENCY;
        case "PROD": return PRODUCTION_YEAR;
        case "PROTECT": return CALL_PROTECTION;
        case "PURPOSE": return PURPOSE;
        case "PXSOURCE": return BENCHMARK_PRICE_SOURCE;
        case "RATING": return RATING_SOURCE_AND_RANGE;
        case "REDEMPTION": return TYPE_OF_REDEMPTION_VALUES_ARE_NONCALLABLE_PREFUNDED_ESCROWEDTOMATURITY_PUTABLE_CONVERTIBLE;
        case "RESTRICTED": return RESTRICTED;
        case "SECTOR": return MARKET_SECTOR;
        case "SECTYPE": return SECURITY_TYPE_INCLUDED_OR_EXCLUDED;
        case "STRUCT": return STRUCTURE;
        case "SUBSFREQ": return SUBSTITUTIONS_FREQUENCY;
        case "SUBSLEFT": return SUBSTITUTIONS_LEFT;
        case "TEXT": return FREEFORM_TEXT;
        case "TRDVAR": return TRADE_VARIANCE;
        case "WAC": return WEIGHTED_AVERAGE_COUPON_VALUE_IN_PERCENT;
        case "WAL": return WEIGHTED_AVERAGE_LIFE_COUPON_VALUE_IN_PERCENT;
        case "WALA": return WEIGHTED_AVERAGE_LOAN_AGE_VALUE_IN_MONTHS;
        case "WAM": return WEIGHTED_AVERAGE_MATURITY_VALUE_IN_MONTHS;
        case "WHOLE": return WHOLE_POOL;
        case "YIELD": return YIELD_RANGE;
        case "AVFICO": return AVERAGE_FICO_SCORE;
        case "AVSIZE": return AVERAGE_LOAN_SIZE;
        case "MAXBAL": return MAXIMUM_LOAN_BALANCE;
        case "POOL": return POOL_IDENTIFIER;
        case "ROLLTYPE": return TYPE_OF_ROLL_TRADE;
        case "REFTRADE": return REFERENCE_TO_ROLLING_OR_CLOSING_TRADE;
        case "REFPRIN": return PRINCIPAL_OF_ROLLING_OR_CLOSING_TRADE;
        case "REFINT": return INTEREST_OF_ROLLING_OR_CLOSING_TRADE;
        case "AVAILQTY": return AVAILABLE_OFFER_QUANTITY_TO_BE_SHOWN_TO_THE_STREET;
        case "BROKERCREDIT": return BROKERS_SALES_CREDIT;
        case "INTERNALPX": return OFFER_PRICE_TO_BE_SHOWN_TO_INTERNAL_BROKERS;
        case "INTERNALQTY": return OFFER_QUANTITY_TO_BE_SHOWN_TO_INTERNAL_BROKERS;
        case "LEAVEQTY": return THE_MINIMUM_RESIDUAL_OFFER_QUANTITY;
        case "MAXORDQTY": return MAXIMUM_ORDER_SIZE;
        case "ORDRINCR": return ORDER_QUANTITY_INCREMENT;
        case "PRIMARY": return PRIMARY_OR_SECONDARY_MARKET_INDICATOR;
        case "SALESCREDITOVR": return BROKER_SALES_CREDIT_OVERRIDE;
        case "TRADERCREDIT": return TRADERS_CREDIT;
        case "DISCOUNT": return DISCOUNT_RATE;
        case "YTM": return YIELD_TO_MATURITY;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
