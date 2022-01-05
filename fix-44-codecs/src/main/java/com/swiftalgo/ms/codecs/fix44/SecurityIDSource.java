/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.StringRepresentable;
public enum SecurityIDSource implements StringRepresentable
{
    CUSIP("1"),
    SEDOL("2"),
    QUIK("3"),
    ISIN_NUMBER("4"),
    RIC_CODE("5"),
    ISO_CURRENCY_CODE("6"),
    ISO_COUNTRY_CODE("7"),
    EXCHANGE_SYMBOL("8"),
    CONSOLIDATED_TAPE_ASSOCIATION("9"),
    BLOOMBERG_SYMBOL("A"),
    WERTPAPIER("B"),
    DUTCH("C"),
    VALOREN("D"),
    SICOVAM("E"),
    BELGIAN("F"),
    COMMON("G"),
    CLEARING_HOUSE_CLEARING_ORGANIZATION("H"),
    ISDA_FPML_PRODUCT_SPECIFICATION("I"),
    OPTIONS_PRICE_REPORTING_AUTHORITY("J"),
    NULL_VAL(""),
    ARTIO_UNKNOWN("");

    private final String representation;

    SecurityIDSource(final String representation)
    {
         this.representation = representation;
    }

    public final String representation() { return representation; }

    private static final CharArrayMap<SecurityIDSource> charMap;
    static
    {
        final Map<String, SecurityIDSource> stringMap = new HashMap<>();
        stringMap.put("1", CUSIP);
        stringMap.put("2", SEDOL);
        stringMap.put("3", QUIK);
        stringMap.put("4", ISIN_NUMBER);
        stringMap.put("5", RIC_CODE);
        stringMap.put("6", ISO_CURRENCY_CODE);
        stringMap.put("7", ISO_COUNTRY_CODE);
        stringMap.put("8", EXCHANGE_SYMBOL);
        stringMap.put("9", CONSOLIDATED_TAPE_ASSOCIATION);
        stringMap.put("A", BLOOMBERG_SYMBOL);
        stringMap.put("B", WERTPAPIER);
        stringMap.put("C", DUTCH);
        stringMap.put("D", VALOREN);
        stringMap.put("E", SICOVAM);
        stringMap.put("F", BELGIAN);
        stringMap.put("G", COMMON);
        stringMap.put("H", CLEARING_HOUSE_CLEARING_ORGANIZATION);
        stringMap.put("I", ISDA_FPML_PRODUCT_SPECIFICATION);
        stringMap.put("J", OPTIONS_PRICE_REPORTING_AUTHORITY);
        charMap = new CharArrayMap<>(stringMap);
    }

    public static SecurityIDSource decode(final CharArrayWrapper key)
    {
        final SecurityIDSource value = charMap.get(key);
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
    public static SecurityIDSource decode(final String representation)
    {
        switch(representation)
        {
        case "1": return CUSIP;
        case "2": return SEDOL;
        case "3": return QUIK;
        case "4": return ISIN_NUMBER;
        case "5": return RIC_CODE;
        case "6": return ISO_CURRENCY_CODE;
        case "7": return ISO_COUNTRY_CODE;
        case "8": return EXCHANGE_SYMBOL;
        case "9": return CONSOLIDATED_TAPE_ASSOCIATION;
        case "A": return BLOOMBERG_SYMBOL;
        case "B": return WERTPAPIER;
        case "C": return DUTCH;
        case "D": return VALOREN;
        case "E": return SICOVAM;
        case "F": return BELGIAN;
        case "G": return COMMON;
        case "H": return CLEARING_HOUSE_CLEARING_ORGANIZATION;
        case "I": return ISDA_FPML_PRODUCT_SPECIFICATION;
        case "J": return OPTIONS_PRICE_REPORTING_AUTHORITY;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
