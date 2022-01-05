/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.StringRepresentable;
public enum StipulationType implements StringRepresentable
{
    AMT("AMT"),
    AUTO_REINVESTMENT_AT_OR_BETTER("AUTOREINV"),
    BANK_QUALIFIED("BANKQUAL"),
    BARGAIN_CONDITIONS("BGNCON"),
    COUPON_RANGE("COUPON"),
    ISO_CURRENCY_CODE("CURRENCY"),
    CUSTOM_START_END_DATE("CUSTOMDATE"),
    GEOGRAPHICS_AND_PERCENT_RANGE("GEOG"),
    VALUATION_DISCOUNT("HAIRCUT"),
    INSURED("INSURED"),
    YEAR_OR_YEAR_MONTH_OF_ISSUE("ISSUE"),
    ISSUERS_TICKER("ISSUER"),
    ISSUE_SIZE_RANGE("ISSUESIZE"),
    LOOKBACK_DAYS("LOOKBACK"),
    EXPLICIT_LOT_IDENTIFIER("LOT"),
    LOT_VARIANCE("LOTVAR"),
    MATURITY_YEAR_AND_MONTH("MAT"),
    MATURITY_RANGE("MATURITY"),
    MAXIMUM_SUBSTITUTIONS("MAXSUBS"),
    MINIMUM_QUANTITY("MINQTY"),
    MINIMUM_INCREMENT("MININCR"),
    MINIMUM_DENOMINATION("MINDNOM"),
    PAYMENT_FREQUENCY_CALENDAR("PAYFREQ"),
    NUMBER_OF_PIECES("PIECES"),
    POOLS_MAXIMUM("PMAX"),
    POOLS_PER_MILLION("PPM"),
    POOLS_PER_LOT("PPL"),
    POOLS_PER_TRADE("PPT"),
    PRICE_RANGE("PRICE"),
    PRICING_FREQUENCY("PRICEFREQ"),
    PRODUCTION_YEAR("PROD"),
    CALL_PROTECTION("PROTECT"),
    PURPOSE("PURPOSE"),
    BENCHMARK_PRICE_SOURCE("PXSOURCE"),
    RATING_SOURCE_AND_RANGE("RATING"),
    RESTRICTED("RESTRICTED"),
    MARKET_SECTOR("SECTOR"),
    SECURITYTYPE_INCLUDED_OR_EXCLUDED("SECTYPE"),
    STRUCTURE("STRUCT"),
    SUBSTITUTIONS_FREQUENCY("SUBSFREQ"),
    SUBSTITUTIONS_LEFT("SUBSLEFT"),
    FREEFORM_TEXT("TEXT"),
    TRADE_VARIANCE("TRDVAR"),
    WEIGHTED_AVERAGE_COUPON("WAC"),
    WEIGHTED_AVERAGE_LIFE_COUPON("WAL"),
    WEIGHTED_AVERAGE_LOAN_AGE("WALA"),
    WEIGHTED_AVERAGE_MATURITY("WAM"),
    WHOLE_POOL("WHOLE"),
    YIELD_RANGE("YIELD"),
    SINGLE_MONTHLY_MORTALITY("SMM"),
    CONSTANT_PREPAYMENT_RATE("CPR"),
    CONSTANT_PREPAYMENT_YIELD("CPY"),
    CONSTANT_PREPAYMENT_PENALTY("CPP"),
    ABSOLUTE_PREPAYMENT_SPEED("ABS"),
    MONTHLY_PREPAYMENT_RATE("MPR"),
    PERCENT_OF_BMA_PREPAYMENT_CURVE("PSA"),
    PERCENT_OF_PROSPECTUS_PREPAYMENT_CURVE("PPC"),
    PERCENT_OF_MANUFACTURED_HOUSING_PREPAYMENT_CURVE("MHP"),
    FINAL_CPR_OF_HOME_EQUITY_PREPAYMENT_CURVE("HEP"),
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
        stringMap.put("AMT", AMT);
        stringMap.put("AUTOREINV", AUTO_REINVESTMENT_AT_OR_BETTER);
        stringMap.put("BANKQUAL", BANK_QUALIFIED);
        stringMap.put("BGNCON", BARGAIN_CONDITIONS);
        stringMap.put("COUPON", COUPON_RANGE);
        stringMap.put("CURRENCY", ISO_CURRENCY_CODE);
        stringMap.put("CUSTOMDATE", CUSTOM_START_END_DATE);
        stringMap.put("GEOG", GEOGRAPHICS_AND_PERCENT_RANGE);
        stringMap.put("HAIRCUT", VALUATION_DISCOUNT);
        stringMap.put("INSURED", INSURED);
        stringMap.put("ISSUE", YEAR_OR_YEAR_MONTH_OF_ISSUE);
        stringMap.put("ISSUER", ISSUERS_TICKER);
        stringMap.put("ISSUESIZE", ISSUE_SIZE_RANGE);
        stringMap.put("LOOKBACK", LOOKBACK_DAYS);
        stringMap.put("LOT", EXPLICIT_LOT_IDENTIFIER);
        stringMap.put("LOTVAR", LOT_VARIANCE);
        stringMap.put("MAT", MATURITY_YEAR_AND_MONTH);
        stringMap.put("MATURITY", MATURITY_RANGE);
        stringMap.put("MAXSUBS", MAXIMUM_SUBSTITUTIONS);
        stringMap.put("MINQTY", MINIMUM_QUANTITY);
        stringMap.put("MININCR", MINIMUM_INCREMENT);
        stringMap.put("MINDNOM", MINIMUM_DENOMINATION);
        stringMap.put("PAYFREQ", PAYMENT_FREQUENCY_CALENDAR);
        stringMap.put("PIECES", NUMBER_OF_PIECES);
        stringMap.put("PMAX", POOLS_MAXIMUM);
        stringMap.put("PPM", POOLS_PER_MILLION);
        stringMap.put("PPL", POOLS_PER_LOT);
        stringMap.put("PPT", POOLS_PER_TRADE);
        stringMap.put("PRICE", PRICE_RANGE);
        stringMap.put("PRICEFREQ", PRICING_FREQUENCY);
        stringMap.put("PROD", PRODUCTION_YEAR);
        stringMap.put("PROTECT", CALL_PROTECTION);
        stringMap.put("PURPOSE", PURPOSE);
        stringMap.put("PXSOURCE", BENCHMARK_PRICE_SOURCE);
        stringMap.put("RATING", RATING_SOURCE_AND_RANGE);
        stringMap.put("RESTRICTED", RESTRICTED);
        stringMap.put("SECTOR", MARKET_SECTOR);
        stringMap.put("SECTYPE", SECURITYTYPE_INCLUDED_OR_EXCLUDED);
        stringMap.put("STRUCT", STRUCTURE);
        stringMap.put("SUBSFREQ", SUBSTITUTIONS_FREQUENCY);
        stringMap.put("SUBSLEFT", SUBSTITUTIONS_LEFT);
        stringMap.put("TEXT", FREEFORM_TEXT);
        stringMap.put("TRDVAR", TRADE_VARIANCE);
        stringMap.put("WAC", WEIGHTED_AVERAGE_COUPON);
        stringMap.put("WAL", WEIGHTED_AVERAGE_LIFE_COUPON);
        stringMap.put("WALA", WEIGHTED_AVERAGE_LOAN_AGE);
        stringMap.put("WAM", WEIGHTED_AVERAGE_MATURITY);
        stringMap.put("WHOLE", WHOLE_POOL);
        stringMap.put("YIELD", YIELD_RANGE);
        stringMap.put("SMM", SINGLE_MONTHLY_MORTALITY);
        stringMap.put("CPR", CONSTANT_PREPAYMENT_RATE);
        stringMap.put("CPY", CONSTANT_PREPAYMENT_YIELD);
        stringMap.put("CPP", CONSTANT_PREPAYMENT_PENALTY);
        stringMap.put("ABS", ABSOLUTE_PREPAYMENT_SPEED);
        stringMap.put("MPR", MONTHLY_PREPAYMENT_RATE);
        stringMap.put("PSA", PERCENT_OF_BMA_PREPAYMENT_CURVE);
        stringMap.put("PPC", PERCENT_OF_PROSPECTUS_PREPAYMENT_CURVE);
        stringMap.put("MHP", PERCENT_OF_MANUFACTURED_HOUSING_PREPAYMENT_CURVE);
        stringMap.put("HEP", FINAL_CPR_OF_HOME_EQUITY_PREPAYMENT_CURVE);
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
        case "AMT": return AMT;
        case "AUTOREINV": return AUTO_REINVESTMENT_AT_OR_BETTER;
        case "BANKQUAL": return BANK_QUALIFIED;
        case "BGNCON": return BARGAIN_CONDITIONS;
        case "COUPON": return COUPON_RANGE;
        case "CURRENCY": return ISO_CURRENCY_CODE;
        case "CUSTOMDATE": return CUSTOM_START_END_DATE;
        case "GEOG": return GEOGRAPHICS_AND_PERCENT_RANGE;
        case "HAIRCUT": return VALUATION_DISCOUNT;
        case "INSURED": return INSURED;
        case "ISSUE": return YEAR_OR_YEAR_MONTH_OF_ISSUE;
        case "ISSUER": return ISSUERS_TICKER;
        case "ISSUESIZE": return ISSUE_SIZE_RANGE;
        case "LOOKBACK": return LOOKBACK_DAYS;
        case "LOT": return EXPLICIT_LOT_IDENTIFIER;
        case "LOTVAR": return LOT_VARIANCE;
        case "MAT": return MATURITY_YEAR_AND_MONTH;
        case "MATURITY": return MATURITY_RANGE;
        case "MAXSUBS": return MAXIMUM_SUBSTITUTIONS;
        case "MINQTY": return MINIMUM_QUANTITY;
        case "MININCR": return MINIMUM_INCREMENT;
        case "MINDNOM": return MINIMUM_DENOMINATION;
        case "PAYFREQ": return PAYMENT_FREQUENCY_CALENDAR;
        case "PIECES": return NUMBER_OF_PIECES;
        case "PMAX": return POOLS_MAXIMUM;
        case "PPM": return POOLS_PER_MILLION;
        case "PPL": return POOLS_PER_LOT;
        case "PPT": return POOLS_PER_TRADE;
        case "PRICE": return PRICE_RANGE;
        case "PRICEFREQ": return PRICING_FREQUENCY;
        case "PROD": return PRODUCTION_YEAR;
        case "PROTECT": return CALL_PROTECTION;
        case "PURPOSE": return PURPOSE;
        case "PXSOURCE": return BENCHMARK_PRICE_SOURCE;
        case "RATING": return RATING_SOURCE_AND_RANGE;
        case "RESTRICTED": return RESTRICTED;
        case "SECTOR": return MARKET_SECTOR;
        case "SECTYPE": return SECURITYTYPE_INCLUDED_OR_EXCLUDED;
        case "STRUCT": return STRUCTURE;
        case "SUBSFREQ": return SUBSTITUTIONS_FREQUENCY;
        case "SUBSLEFT": return SUBSTITUTIONS_LEFT;
        case "TEXT": return FREEFORM_TEXT;
        case "TRDVAR": return TRADE_VARIANCE;
        case "WAC": return WEIGHTED_AVERAGE_COUPON;
        case "WAL": return WEIGHTED_AVERAGE_LIFE_COUPON;
        case "WALA": return WEIGHTED_AVERAGE_LOAN_AGE;
        case "WAM": return WEIGHTED_AVERAGE_MATURITY;
        case "WHOLE": return WHOLE_POOL;
        case "YIELD": return YIELD_RANGE;
        case "SMM": return SINGLE_MONTHLY_MORTALITY;
        case "CPR": return CONSTANT_PREPAYMENT_RATE;
        case "CPY": return CONSTANT_PREPAYMENT_YIELD;
        case "CPP": return CONSTANT_PREPAYMENT_PENALTY;
        case "ABS": return ABSOLUTE_PREPAYMENT_SPEED;
        case "MPR": return MONTHLY_PREPAYMENT_RATE;
        case "PSA": return PERCENT_OF_BMA_PREPAYMENT_CURVE;
        case "PPC": return PERCENT_OF_PROSPECTUS_PREPAYMENT_CURVE;
        case "MHP": return PERCENT_OF_MANUFACTURED_HOUSING_PREPAYMENT_CURVE;
        case "HEP": return FINAL_CPR_OF_HOME_EQUITY_PREPAYMENT_CURVE;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
