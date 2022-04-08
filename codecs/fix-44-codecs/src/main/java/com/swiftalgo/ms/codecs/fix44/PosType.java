/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.StringRepresentable;
public enum PosType implements StringRepresentable
{
    TRANSACTION_QUANTITY("TQ"),
    INTRA_SPREAD_QTY("IAS"),
    INTER_SPREAD_QTY("IES"),
    END_OF_DAY_QTY("FIN"),
    START_OF_DAY_QTY("SOD"),
    OPTION_EXERCISE_QTY("EX"),
    OPTION_ASSIGNMENT("AS"),
    TRANSACTION_FROM_EXERCISE("TX"),
    TRANSACTION_FROM_ASSIGNMENT("TA"),
    PIT_TRADE_QTY("PIT"),
    TRANSFER_TRADE_QTY("TRF"),
    ELECTRONIC_TRADE_QTY("ETR"),
    ALLOCATION_TRADE_QTY("ALC"),
    ADJUSTMENT_QTY("PA"),
    AS_OF_TRADE_QTY("ASF"),
    DELIVERY_QTY("DLV"),
    TOTAL_TRANSACTION_QTY("TOT"),
    CROSS_MARGIN_QTY("XM"),
    INTEGRAL_SPLIT("SPL"),
    NULL_VAL(""),
    ARTIO_UNKNOWN("");

    private final String representation;

    PosType(final String representation)
    {
         this.representation = representation;
    }

    public final String representation() { return representation; }

    private static final CharArrayMap<PosType> charMap;
    static
    {
        final Map<String, PosType> stringMap = new HashMap<>();
        stringMap.put("TQ", TRANSACTION_QUANTITY);
        stringMap.put("IAS", INTRA_SPREAD_QTY);
        stringMap.put("IES", INTER_SPREAD_QTY);
        stringMap.put("FIN", END_OF_DAY_QTY);
        stringMap.put("SOD", START_OF_DAY_QTY);
        stringMap.put("EX", OPTION_EXERCISE_QTY);
        stringMap.put("AS", OPTION_ASSIGNMENT);
        stringMap.put("TX", TRANSACTION_FROM_EXERCISE);
        stringMap.put("TA", TRANSACTION_FROM_ASSIGNMENT);
        stringMap.put("PIT", PIT_TRADE_QTY);
        stringMap.put("TRF", TRANSFER_TRADE_QTY);
        stringMap.put("ETR", ELECTRONIC_TRADE_QTY);
        stringMap.put("ALC", ALLOCATION_TRADE_QTY);
        stringMap.put("PA", ADJUSTMENT_QTY);
        stringMap.put("ASF", AS_OF_TRADE_QTY);
        stringMap.put("DLV", DELIVERY_QTY);
        stringMap.put("TOT", TOTAL_TRANSACTION_QTY);
        stringMap.put("XM", CROSS_MARGIN_QTY);
        stringMap.put("SPL", INTEGRAL_SPLIT);
        charMap = new CharArrayMap<>(stringMap);
    }

    public static PosType decode(final CharArrayWrapper key)
    {
        final PosType value = charMap.get(key);
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
    public static PosType decode(final String representation)
    {
        switch(representation)
        {
        case "TQ": return TRANSACTION_QUANTITY;
        case "IAS": return INTRA_SPREAD_QTY;
        case "IES": return INTER_SPREAD_QTY;
        case "FIN": return END_OF_DAY_QTY;
        case "SOD": return START_OF_DAY_QTY;
        case "EX": return OPTION_EXERCISE_QTY;
        case "AS": return OPTION_ASSIGNMENT;
        case "TX": return TRANSACTION_FROM_EXERCISE;
        case "TA": return TRANSACTION_FROM_ASSIGNMENT;
        case "PIT": return PIT_TRADE_QTY;
        case "TRF": return TRANSFER_TRADE_QTY;
        case "ETR": return ELECTRONIC_TRADE_QTY;
        case "ALC": return ALLOCATION_TRADE_QTY;
        case "PA": return ADJUSTMENT_QTY;
        case "ASF": return AS_OF_TRADE_QTY;
        case "DLV": return DELIVERY_QTY;
        case "TOT": return TOTAL_TRANSACTION_QTY;
        case "XM": return CROSS_MARGIN_QTY;
        case "SPL": return INTEGRAL_SPLIT;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
