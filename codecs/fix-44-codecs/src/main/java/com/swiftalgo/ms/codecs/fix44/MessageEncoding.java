/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.StringRepresentable;
public enum MessageEncoding implements StringRepresentable
{
    ISO_2022_JP("ISO-2022-JP"),
    EUC_JP("EUC-JP"),
    SHIFT_JIS("SHIFT_JIS"),
    UTF_8("UTF-8"),
    NULL_VAL(""),
    ARTIO_UNKNOWN("");

    private final String representation;

    MessageEncoding(final String representation)
    {
         this.representation = representation;
    }

    public final String representation() { return representation; }

    private static final CharArrayMap<MessageEncoding> charMap;
    static
    {
        final Map<String, MessageEncoding> stringMap = new HashMap<>();
        stringMap.put("ISO-2022-JP", ISO_2022_JP);
        stringMap.put("EUC-JP", EUC_JP);
        stringMap.put("SHIFT_JIS", SHIFT_JIS);
        stringMap.put("UTF-8", UTF_8);
        charMap = new CharArrayMap<>(stringMap);
    }

    public static MessageEncoding decode(final CharArrayWrapper key)
    {
        final MessageEncoding value = charMap.get(key);
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
    public static MessageEncoding decode(final String representation)
    {
        switch(representation)
        {
        case "ISO-2022-JP": return ISO_2022_JP;
        case "EUC-JP": return EUC_JP;
        case "SHIFT_JIS": return SHIFT_JIS;
        case "UTF-8": return UTF_8;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
