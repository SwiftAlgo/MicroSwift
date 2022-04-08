/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.StringRepresentable;
public enum CorporateAction implements StringRepresentable
{
    EX_DIVIDEND("A"),
    EX_DISTRIBUTION("B"),
    EX_RIGHTS("C"),
    NEW("D"),
    EX_INTEREST("E"),
    NULL_VAL(""),
    ARTIO_UNKNOWN("");

    private final String representation;

    CorporateAction(final String representation)
    {
         this.representation = representation;
    }

    public final String representation() { return representation; }

    private static final CharArrayMap<CorporateAction> charMap;
    static
    {
        final Map<String, CorporateAction> stringMap = new HashMap<>();
        stringMap.put("A", EX_DIVIDEND);
        stringMap.put("B", EX_DISTRIBUTION);
        stringMap.put("C", EX_RIGHTS);
        stringMap.put("D", NEW);
        stringMap.put("E", EX_INTEREST);
        charMap = new CharArrayMap<>(stringMap);
    }

    public static CorporateAction decode(final CharArrayWrapper key)
    {
        final CorporateAction value = charMap.get(key);
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
    public static CorporateAction decode(final String representation)
    {
        switch(representation)
        {
        case "A": return EX_DIVIDEND;
        case "B": return EX_DISTRIBUTION;
        case "C": return EX_RIGHTS;
        case "D": return NEW;
        case "E": return EX_INTEREST;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
