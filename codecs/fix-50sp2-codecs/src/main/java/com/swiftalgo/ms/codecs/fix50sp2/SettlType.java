/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.StringRepresentable;
public enum SettlType implements StringRepresentable
{
    REGULAR_FX_SPOT_SETTLEMENT("0"),
    CASH("1"),
    NEXT_DAY("2"),
    T_2("3"),
    T_3("4"),
    T_4("5"),
    FUTURE("6"),
    WHEN_AND_IF_ISSUED("7"),
    SELLERS_OPTION("8"),
    T_5("9"),
    BROKEN_DATE_FOR_FX_EXPRESSING_NON_STANDARD_TENOR_SETTLDATE_MUST_BE_SPECIFIED("B"),
    FX_SPOT_NEXT_SETTLEMENT("C"),
    NULL_VAL(""),
    ARTIO_UNKNOWN("");

    private final String representation;

    SettlType(final String representation)
    {
         this.representation = representation;
    }

    public final String representation() { return representation; }

    private static final CharArrayMap<SettlType> charMap;
    static
    {
        final Map<String, SettlType> stringMap = new HashMap<>();
        stringMap.put("0", REGULAR_FX_SPOT_SETTLEMENT);
        stringMap.put("1", CASH);
        stringMap.put("2", NEXT_DAY);
        stringMap.put("3", T_2);
        stringMap.put("4", T_3);
        stringMap.put("5", T_4);
        stringMap.put("6", FUTURE);
        stringMap.put("7", WHEN_AND_IF_ISSUED);
        stringMap.put("8", SELLERS_OPTION);
        stringMap.put("9", T_5);
        stringMap.put("B", BROKEN_DATE_FOR_FX_EXPRESSING_NON_STANDARD_TENOR_SETTLDATE_MUST_BE_SPECIFIED);
        stringMap.put("C", FX_SPOT_NEXT_SETTLEMENT);
        charMap = new CharArrayMap<>(stringMap);
    }

    public static SettlType decode(final CharArrayWrapper key)
    {
        final SettlType value = charMap.get(key);
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
    public static SettlType decode(final String representation)
    {
        switch(representation)
        {
        case "0": return REGULAR_FX_SPOT_SETTLEMENT;
        case "1": return CASH;
        case "2": return NEXT_DAY;
        case "3": return T_2;
        case "4": return T_3;
        case "5": return T_4;
        case "6": return FUTURE;
        case "7": return WHEN_AND_IF_ISSUED;
        case "8": return SELLERS_OPTION;
        case "9": return T_5;
        case "B": return BROKEN_DATE_FOR_FX_EXPRESSING_NON_STANDARD_TENOR_SETTLDATE_MUST_BE_SPECIFIED;
        case "C": return FX_SPOT_NEXT_SETTLEMENT;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
