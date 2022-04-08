/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.StringRepresentable;
public enum UnitOfMeasure implements StringRepresentable
{
    BARRELS("Bbl"),
    BILLION_CUBIC_FEET("Bcf"),
    BUSHELS("Bu"),
    POUNDS("lbs"),
    GALLONS("Gal"),
    MILLION_BARRELS("MMbbl"),
    ONE_MILLION_BTU("MMBtu"),
    MEGAWATT_HOURS("MWh"),
    TROY_OUNCES("oz_tr"),
    METRIC_TONS("t"),
    TONS("tn"),
    US_DOLLARS("USD"),
    ALLOWANCES("Alw"),
    NULL_VAL(""),
    ARTIO_UNKNOWN("");

    private final String representation;

    UnitOfMeasure(final String representation)
    {
         this.representation = representation;
    }

    public final String representation() { return representation; }

    private static final CharArrayMap<UnitOfMeasure> charMap;
    static
    {
        final Map<String, UnitOfMeasure> stringMap = new HashMap<>();
        stringMap.put("Bbl", BARRELS);
        stringMap.put("Bcf", BILLION_CUBIC_FEET);
        stringMap.put("Bu", BUSHELS);
        stringMap.put("lbs", POUNDS);
        stringMap.put("Gal", GALLONS);
        stringMap.put("MMbbl", MILLION_BARRELS);
        stringMap.put("MMBtu", ONE_MILLION_BTU);
        stringMap.put("MWh", MEGAWATT_HOURS);
        stringMap.put("oz_tr", TROY_OUNCES);
        stringMap.put("t", METRIC_TONS);
        stringMap.put("tn", TONS);
        stringMap.put("USD", US_DOLLARS);
        stringMap.put("Alw", ALLOWANCES);
        charMap = new CharArrayMap<>(stringMap);
    }

    public static UnitOfMeasure decode(final CharArrayWrapper key)
    {
        final UnitOfMeasure value = charMap.get(key);
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
    public static UnitOfMeasure decode(final String representation)
    {
        switch(representation)
        {
        case "Bbl": return BARRELS;
        case "Bcf": return BILLION_CUBIC_FEET;
        case "Bu": return BUSHELS;
        case "lbs": return POUNDS;
        case "Gal": return GALLONS;
        case "MMbbl": return MILLION_BARRELS;
        case "MMBtu": return ONE_MILLION_BTU;
        case "MWh": return MEGAWATT_HOURS;
        case "oz_tr": return TROY_OUNCES;
        case "t": return METRIC_TONS;
        case "tn": return TONS;
        case "USD": return US_DOLLARS;
        case "Alw": return ALLOWANCES;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
