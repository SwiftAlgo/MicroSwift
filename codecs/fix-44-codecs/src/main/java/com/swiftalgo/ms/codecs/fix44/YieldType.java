/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.StringRepresentable;
public enum YieldType implements StringRepresentable
{
    AFTER_TAX_YIELD("AFTERTAX"),
    ANNUAL_YIELD("ANNUAL"),
    YIELD_AT_ISSUE("ATISSUE"),
    YIELD_TO_AVERAGE_MATURITY("AVGMATURITY"),
    BOOK_YIELD("BOOK"),
    YIELD_TO_NEXT_CALL("CALL"),
    YIELD_CHANGE_SINCE_CLOSE("CHANGE"),
    CLOSING_YIELD("CLOSE"),
    COMPOUND_YIELD("COMPOUND"),
    CURRENT_YIELD("CURRENT"),
    TRUE_GROSS_YIELD("GROSS"),
    GOVERNMENT_EQUIVALENT_YIELD("GOVTEQUIV"),
    YIELD_WITH_INFLATION_ASSUMPTION("INFLATION"),
    INVERSE_FLOATER_BOND_YIELD("INVERSEFLOATER"),
    MOST_RECENT_CLOSING_YIELD("LASTCLOSE"),
    CLOSING_YIELD_MOST_RECENT_MONTH("LASTMONTH"),
    CLOSING_YIELD_MOST_RECENT_QUARTER("LASTQUARTER"),
    CLOSING_YIELD_MOST_RECENT_YEAR("LASTYEAR"),
    YIELD_TO_LONGEST_AVERAGE_LIFE("LONGAVGLIFE"),
    MARK_TO_MARKET_YIELD("MARK"),
    YIELD_TO_MATURITY("MATURITY"),
    YIELD_TO_NEXT_REFUND("NEXTREFUND"),
    OPEN_AVERAGE_YIELD("OPENAVG"),
    YIELD_TO_NEXT_PUT("PUT"),
    PREVIOUS_CLOSE_YIELD("PREVCLOSE"),
    PROCEEDS_YIELD("PROCEEDS"),
    SEMI_ANNUAL_YIELD("SEMIANNUAL"),
    YIELD_TO_SHORTEST_AVERAGE_LIFE("SHORTAVGLIFE"),
    SIMPLE_YIELD("SIMPLE"),
    TAX_EQUIVALENT_YIELD("TAXEQUIV"),
    YIELD_TO_TENDER_DATE("TENDER"),
    TRUE_YIELD("TRUE"),
    YIELD_VALUE_OF_1_32("VALUE1_32"),
    YIELD_TO_WORST("WORST"),
    NULL_VAL(""),
    ARTIO_UNKNOWN("");

    private final String representation;

    YieldType(final String representation)
    {
         this.representation = representation;
    }

    public final String representation() { return representation; }

    private static final CharArrayMap<YieldType> charMap;
    static
    {
        final Map<String, YieldType> stringMap = new HashMap<>();
        stringMap.put("AFTERTAX", AFTER_TAX_YIELD);
        stringMap.put("ANNUAL", ANNUAL_YIELD);
        stringMap.put("ATISSUE", YIELD_AT_ISSUE);
        stringMap.put("AVGMATURITY", YIELD_TO_AVERAGE_MATURITY);
        stringMap.put("BOOK", BOOK_YIELD);
        stringMap.put("CALL", YIELD_TO_NEXT_CALL);
        stringMap.put("CHANGE", YIELD_CHANGE_SINCE_CLOSE);
        stringMap.put("CLOSE", CLOSING_YIELD);
        stringMap.put("COMPOUND", COMPOUND_YIELD);
        stringMap.put("CURRENT", CURRENT_YIELD);
        stringMap.put("GROSS", TRUE_GROSS_YIELD);
        stringMap.put("GOVTEQUIV", GOVERNMENT_EQUIVALENT_YIELD);
        stringMap.put("INFLATION", YIELD_WITH_INFLATION_ASSUMPTION);
        stringMap.put("INVERSEFLOATER", INVERSE_FLOATER_BOND_YIELD);
        stringMap.put("LASTCLOSE", MOST_RECENT_CLOSING_YIELD);
        stringMap.put("LASTMONTH", CLOSING_YIELD_MOST_RECENT_MONTH);
        stringMap.put("LASTQUARTER", CLOSING_YIELD_MOST_RECENT_QUARTER);
        stringMap.put("LASTYEAR", CLOSING_YIELD_MOST_RECENT_YEAR);
        stringMap.put("LONGAVGLIFE", YIELD_TO_LONGEST_AVERAGE_LIFE);
        stringMap.put("MARK", MARK_TO_MARKET_YIELD);
        stringMap.put("MATURITY", YIELD_TO_MATURITY);
        stringMap.put("NEXTREFUND", YIELD_TO_NEXT_REFUND);
        stringMap.put("OPENAVG", OPEN_AVERAGE_YIELD);
        stringMap.put("PUT", YIELD_TO_NEXT_PUT);
        stringMap.put("PREVCLOSE", PREVIOUS_CLOSE_YIELD);
        stringMap.put("PROCEEDS", PROCEEDS_YIELD);
        stringMap.put("SEMIANNUAL", SEMI_ANNUAL_YIELD);
        stringMap.put("SHORTAVGLIFE", YIELD_TO_SHORTEST_AVERAGE_LIFE);
        stringMap.put("SIMPLE", SIMPLE_YIELD);
        stringMap.put("TAXEQUIV", TAX_EQUIVALENT_YIELD);
        stringMap.put("TENDER", YIELD_TO_TENDER_DATE);
        stringMap.put("TRUE", TRUE_YIELD);
        stringMap.put("VALUE1_32", YIELD_VALUE_OF_1_32);
        stringMap.put("WORST", YIELD_TO_WORST);
        charMap = new CharArrayMap<>(stringMap);
    }

    public static YieldType decode(final CharArrayWrapper key)
    {
        final YieldType value = charMap.get(key);
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
    public static YieldType decode(final String representation)
    {
        switch(representation)
        {
        case "AFTERTAX": return AFTER_TAX_YIELD;
        case "ANNUAL": return ANNUAL_YIELD;
        case "ATISSUE": return YIELD_AT_ISSUE;
        case "AVGMATURITY": return YIELD_TO_AVERAGE_MATURITY;
        case "BOOK": return BOOK_YIELD;
        case "CALL": return YIELD_TO_NEXT_CALL;
        case "CHANGE": return YIELD_CHANGE_SINCE_CLOSE;
        case "CLOSE": return CLOSING_YIELD;
        case "COMPOUND": return COMPOUND_YIELD;
        case "CURRENT": return CURRENT_YIELD;
        case "GROSS": return TRUE_GROSS_YIELD;
        case "GOVTEQUIV": return GOVERNMENT_EQUIVALENT_YIELD;
        case "INFLATION": return YIELD_WITH_INFLATION_ASSUMPTION;
        case "INVERSEFLOATER": return INVERSE_FLOATER_BOND_YIELD;
        case "LASTCLOSE": return MOST_RECENT_CLOSING_YIELD;
        case "LASTMONTH": return CLOSING_YIELD_MOST_RECENT_MONTH;
        case "LASTQUARTER": return CLOSING_YIELD_MOST_RECENT_QUARTER;
        case "LASTYEAR": return CLOSING_YIELD_MOST_RECENT_YEAR;
        case "LONGAVGLIFE": return YIELD_TO_LONGEST_AVERAGE_LIFE;
        case "MARK": return MARK_TO_MARKET_YIELD;
        case "MATURITY": return YIELD_TO_MATURITY;
        case "NEXTREFUND": return YIELD_TO_NEXT_REFUND;
        case "OPENAVG": return OPEN_AVERAGE_YIELD;
        case "PUT": return YIELD_TO_NEXT_PUT;
        case "PREVCLOSE": return PREVIOUS_CLOSE_YIELD;
        case "PROCEEDS": return PROCEEDS_YIELD;
        case "SEMIANNUAL": return SEMI_ANNUAL_YIELD;
        case "SHORTAVGLIFE": return YIELD_TO_SHORTEST_AVERAGE_LIFE;
        case "SIMPLE": return SIMPLE_YIELD;
        case "TAXEQUIV": return TAX_EQUIVALENT_YIELD;
        case "TENDER": return YIELD_TO_TENDER_DATE;
        case "TRUE": return TRUE_YIELD;
        case "VALUE1_32": return YIELD_VALUE_OF_1_32;
        case "WORST": return YIELD_TO_WORST;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
