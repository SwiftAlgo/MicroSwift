/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.StringRepresentable;
public enum ApplVerID implements StringRepresentable
{
    FIX27("0"),
    FIX30("1"),
    FIX40("2"),
    FIX41("3"),
    FIX42("4"),
    FIX43("5"),
    FIX44("6"),
    FIX50("7"),
    FIX50SP1("8"),
    FIX50SP2("9"),
    NULL_VAL(""),
    ARTIO_UNKNOWN("");

    private final String representation;

    ApplVerID(final String representation)
    {
         this.representation = representation;
    }

    public final String representation() { return representation; }

    private static final CharArrayMap<ApplVerID> charMap;
    static
    {
        final Map<String, ApplVerID> stringMap = new HashMap<>();
        stringMap.put("0", FIX27);
        stringMap.put("1", FIX30);
        stringMap.put("2", FIX40);
        stringMap.put("3", FIX41);
        stringMap.put("4", FIX42);
        stringMap.put("5", FIX43);
        stringMap.put("6", FIX44);
        stringMap.put("7", FIX50);
        stringMap.put("8", FIX50SP1);
        stringMap.put("9", FIX50SP2);
        charMap = new CharArrayMap<>(stringMap);
    }

    public static ApplVerID decode(final CharArrayWrapper key)
    {
        final ApplVerID value = charMap.get(key);
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
    public static ApplVerID decode(final String representation)
    {
        switch(representation)
        {
        case "0": return FIX27;
        case "1": return FIX30;
        case "2": return FIX40;
        case "3": return FIX41;
        case "4": return FIX42;
        case "5": return FIX43;
        case "6": return FIX44;
        case "7": return FIX50;
        case "8": return FIX50SP1;
        case "9": return FIX50SP2;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
