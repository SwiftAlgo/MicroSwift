/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.StringRepresentable;
public enum BenchmarkCurveName implements StringRepresentable
{
    MUNIAAA("MuniAAA"),
    FUTURESWAP("FutureSWAP"),
    LIBID("LIBID"),
    LIBOR("LIBOR"),
    OTHER("OTHER"),
    SWAP("SWAP"),
    TREASURY("Treasury"),
    EURIBOR("Euribor"),
    PFANDBRIEFE("Pfandbriefe"),
    EONIA("EONIA"),
    SONIA("SONIA"),
    EUREPO("EUREPO"),
    NULL_VAL(""),
    ARTIO_UNKNOWN("");

    private final String representation;

    BenchmarkCurveName(final String representation)
    {
         this.representation = representation;
    }

    public final String representation() { return representation; }

    private static final CharArrayMap<BenchmarkCurveName> charMap;
    static
    {
        final Map<String, BenchmarkCurveName> stringMap = new HashMap<>();
        stringMap.put("MuniAAA", MUNIAAA);
        stringMap.put("FutureSWAP", FUTURESWAP);
        stringMap.put("LIBID", LIBID);
        stringMap.put("LIBOR", LIBOR);
        stringMap.put("OTHER", OTHER);
        stringMap.put("SWAP", SWAP);
        stringMap.put("Treasury", TREASURY);
        stringMap.put("Euribor", EURIBOR);
        stringMap.put("Pfandbriefe", PFANDBRIEFE);
        stringMap.put("EONIA", EONIA);
        stringMap.put("SONIA", SONIA);
        stringMap.put("EUREPO", EUREPO);
        charMap = new CharArrayMap<>(stringMap);
    }

    public static BenchmarkCurveName decode(final CharArrayWrapper key)
    {
        final BenchmarkCurveName value = charMap.get(key);
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
    public static BenchmarkCurveName decode(final String representation)
    {
        switch(representation)
        {
        case "MuniAAA": return MUNIAAA;
        case "FutureSWAP": return FUTURESWAP;
        case "LIBID": return LIBID;
        case "LIBOR": return LIBOR;
        case "OTHER": return OTHER;
        case "SWAP": return SWAP;
        case "Treasury": return TREASURY;
        case "Euribor": return EURIBOR;
        case "Pfandbriefe": return PFANDBRIEFE;
        case "EONIA": return EONIA;
        case "SONIA": return SONIA;
        case "EUREPO": return EUREPO;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
