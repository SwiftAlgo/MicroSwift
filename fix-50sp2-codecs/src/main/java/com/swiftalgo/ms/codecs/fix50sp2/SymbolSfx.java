/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.StringRepresentable;
public enum SymbolSfx implements StringRepresentable
{
    EUCP_WITH_LUMP_SUM_INTEREST_RATHER_THAN_DISCOUNT_PRICE("CD"),
    WHEN_ISSUED_FOR_A_SECURITY_TO_BE_REISSUED_UNDER_AN_OLD_CUSIP_OR_ISIN("WI"),
    NULL_VAL(""),
    ARTIO_UNKNOWN("");

    private final String representation;

    SymbolSfx(final String representation)
    {
         this.representation = representation;
    }

    public final String representation() { return representation; }

    private static final CharArrayMap<SymbolSfx> charMap;
    static
    {
        final Map<String, SymbolSfx> stringMap = new HashMap<>();
        stringMap.put("CD", EUCP_WITH_LUMP_SUM_INTEREST_RATHER_THAN_DISCOUNT_PRICE);
        stringMap.put("WI", WHEN_ISSUED_FOR_A_SECURITY_TO_BE_REISSUED_UNDER_AN_OLD_CUSIP_OR_ISIN);
        charMap = new CharArrayMap<>(stringMap);
    }

    public static SymbolSfx decode(final CharArrayWrapper key)
    {
        final SymbolSfx value = charMap.get(key);
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
    public static SymbolSfx decode(final String representation)
    {
        switch(representation)
        {
        case "CD": return EUCP_WITH_LUMP_SUM_INTEREST_RATHER_THAN_DISCOUNT_PRICE;
        case "WI": return WHEN_ISSUED_FOR_A_SECURITY_TO_BE_REISSUED_UNDER_AN_OLD_CUSIP_OR_ISIN;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
