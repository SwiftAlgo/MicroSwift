/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.StringRepresentable;
public enum FinancialStatus implements StringRepresentable
{
    BANKRUPT("1"),
    PENDING_DELISTING("2"),
    NULL_VAL(""),
    ARTIO_UNKNOWN("");

    private final String representation;

    FinancialStatus(final String representation)
    {
         this.representation = representation;
    }

    public final String representation() { return representation; }

    private static final CharArrayMap<FinancialStatus> charMap;
    static
    {
        final Map<String, FinancialStatus> stringMap = new HashMap<>();
        stringMap.put("1", BANKRUPT);
        stringMap.put("2", PENDING_DELISTING);
        charMap = new CharArrayMap<>(stringMap);
    }

    public static FinancialStatus decode(final CharArrayWrapper key)
    {
        final FinancialStatus value = charMap.get(key);
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
    public static FinancialStatus decode(final String representation)
    {
        switch(representation)
        {
        case "1": return BANKRUPT;
        case "2": return PENDING_DELISTING;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
