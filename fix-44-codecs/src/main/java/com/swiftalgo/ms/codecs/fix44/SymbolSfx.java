/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.StringRepresentable;
public enum SymbolSfx implements StringRepresentable
{
    WHEN_ISSUED("WI"),
    A_EUCP_WITH_LUMP_SUM_INTEREST("CD"),
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
        stringMap.put("WI", WHEN_ISSUED);
        stringMap.put("CD", A_EUCP_WITH_LUMP_SUM_INTEREST);
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
        case "WI": return WHEN_ISSUED;
        case "CD": return A_EUCP_WITH_LUMP_SUM_INTEREST;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
