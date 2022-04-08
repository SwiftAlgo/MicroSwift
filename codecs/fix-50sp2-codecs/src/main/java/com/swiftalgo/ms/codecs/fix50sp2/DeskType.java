/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.StringRepresentable;
public enum DeskType implements StringRepresentable
{
    AGENCY("A"),
    ARBITRAGE("AR"),
    DERIVATIVES("D"),
    INTERNATIONAL("IN"),
    INSTITUTIONAL("IS"),
    OTHER("O"),
    PREFERRED_TRADING("PF"),
    PROPRIETARY("PR"),
    PROGRAM_TRADING("PT"),
    SALES("S"),
    TRADING("T"),
    NULL_VAL(""),
    ARTIO_UNKNOWN("");

    private final String representation;

    DeskType(final String representation)
    {
         this.representation = representation;
    }

    public final String representation() { return representation; }

    private static final CharArrayMap<DeskType> charMap;
    static
    {
        final Map<String, DeskType> stringMap = new HashMap<>();
        stringMap.put("A", AGENCY);
        stringMap.put("AR", ARBITRAGE);
        stringMap.put("D", DERIVATIVES);
        stringMap.put("IN", INTERNATIONAL);
        stringMap.put("IS", INSTITUTIONAL);
        stringMap.put("O", OTHER);
        stringMap.put("PF", PREFERRED_TRADING);
        stringMap.put("PR", PROPRIETARY);
        stringMap.put("PT", PROGRAM_TRADING);
        stringMap.put("S", SALES);
        stringMap.put("T", TRADING);
        charMap = new CharArrayMap<>(stringMap);
    }

    public static DeskType decode(final CharArrayWrapper key)
    {
        final DeskType value = charMap.get(key);
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
    public static DeskType decode(final String representation)
    {
        switch(representation)
        {
        case "A": return AGENCY;
        case "AR": return ARBITRAGE;
        case "D": return DERIVATIVES;
        case "IN": return INTERNATIONAL;
        case "IS": return INSTITUTIONAL;
        case "O": return OTHER;
        case "PF": return PREFERRED_TRADING;
        case "PR": return PROPRIETARY;
        case "PT": return PROGRAM_TRADING;
        case "S": return SALES;
        case "T": return TRADING;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
