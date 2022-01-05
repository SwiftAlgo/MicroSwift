/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.StringRepresentable;
public enum BenchmarkCurveName implements StringRepresentable
{
    EONIA("EONIA"),
    EUREPO("EUREPO"),
    EURIBOR("Euribor"),
    FUTURESWAP("FutureSWAP"),
    LIBID("LIBID"),
    LIBOR("LIBOR"),
    MUNIAAA("MuniAAA"),
    OTHER("OTHER"),
    PFANDBRIEFE("Pfandbriefe"),
    SONIA("SONIA"),
    SWAP("SWAP"),
    TREASURY("Treasury"),
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
        stringMap.put("EONIA", EONIA);
        stringMap.put("EUREPO", EUREPO);
        stringMap.put("Euribor", EURIBOR);
        stringMap.put("FutureSWAP", FUTURESWAP);
        stringMap.put("LIBID", LIBID);
        stringMap.put("LIBOR", LIBOR);
        stringMap.put("MuniAAA", MUNIAAA);
        stringMap.put("OTHER", OTHER);
        stringMap.put("Pfandbriefe", PFANDBRIEFE);
        stringMap.put("SONIA", SONIA);
        stringMap.put("SWAP", SWAP);
        stringMap.put("Treasury", TREASURY);
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
        case "EONIA": return EONIA;
        case "EUREPO": return EUREPO;
        case "Euribor": return EURIBOR;
        case "FutureSWAP": return FUTURESWAP;
        case "LIBID": return LIBID;
        case "LIBOR": return LIBOR;
        case "MuniAAA": return MUNIAAA;
        case "OTHER": return OTHER;
        case "Pfandbriefe": return PFANDBRIEFE;
        case "SONIA": return SONIA;
        case "SWAP": return SWAP;
        case "Treasury": return TREASURY;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
