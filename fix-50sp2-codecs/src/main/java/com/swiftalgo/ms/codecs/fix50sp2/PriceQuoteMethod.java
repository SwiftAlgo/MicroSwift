/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.StringRepresentable;
public enum PriceQuoteMethod implements StringRepresentable
{
    STANDARD_MONEY_PER_UNIT_OF_A_PHYSICAL("STD"),
    INDEX("INX"),
    INTEREST_RATE_INDEX("INT"),
    PERCENT_OF_PAR("PCTPAR"),
    NULL_VAL(""),
    ARTIO_UNKNOWN("");

    private final String representation;

    PriceQuoteMethod(final String representation)
    {
         this.representation = representation;
    }

    public final String representation() { return representation; }

    private static final CharArrayMap<PriceQuoteMethod> charMap;
    static
    {
        final Map<String, PriceQuoteMethod> stringMap = new HashMap<>();
        stringMap.put("STD", STANDARD_MONEY_PER_UNIT_OF_A_PHYSICAL);
        stringMap.put("INX", INDEX);
        stringMap.put("INT", INTEREST_RATE_INDEX);
        stringMap.put("PCTPAR", PERCENT_OF_PAR);
        charMap = new CharArrayMap<>(stringMap);
    }

    public static PriceQuoteMethod decode(final CharArrayWrapper key)
    {
        final PriceQuoteMethod value = charMap.get(key);
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
    public static PriceQuoteMethod decode(final String representation)
    {
        switch(representation)
        {
        case "STD": return STANDARD_MONEY_PER_UNIT_OF_A_PHYSICAL;
        case "INX": return INDEX;
        case "INT": return INTEREST_RATE_INDEX;
        case "PCTPAR": return PERCENT_OF_PAR;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
