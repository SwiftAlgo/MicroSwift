/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.StringRepresentable;
public enum PosType implements StringRepresentable
{
    ALLOCATION_TRADE_QTY("ALC"),
    OPTION_ASSIGNMENT("AS"),
    AS_OF_TRADE_QTY("ASF"),
    DELIVERY_QTY("DLV"),
    ELECTRONIC_TRADE_QTY("ETR"),
    OPTION_EXERCISE_QTY("EX"),
    END_OF_DAY_QTY("FIN"),
    INTRA_SPREAD_QTY("IAS"),
    INTER_SPREAD_QTY("IES"),
    ADJUSTMENT_QTY("PA"),
    PIT_TRADE_QTY("PIT"),
    START_OF_DAY_QTY("SOD"),
    INTEGRAL_SPLIT("SPL"),
    TRANSACTION_FROM_ASSIGNMENT("TA"),
    TOTAL_TRANSACTION_QTY("TOT"),
    TRANSACTION_QUANTITY("TQ"),
    TRANSFER_TRADE_QTY("TRF"),
    TRANSACTION_FROM_EXERCISE("TX"),
    CROSS_MARGIN_QTY("XM"),
    RECEIVE_QUANTITY("RCV"),
    CORPORATE_ACTION_ADJUSTMENT("CAA"),
    DELIVERY_NOTICE_QTY("DN"),
    EXCHANGE_FOR_PHYSICAL_QTY("EP"),
    PRIVATELY_NEGOTIATED_TRADE_QTY("PNTN"),
    NET_DELTA_QTY("DLT"),
    CREDIT_EVENT_ADJUSTMENT("CEA"),
    SUCCESSION_EVENT_ADJUSTMENT("SEA"),
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
        stringMap.put("ALC", ALLOCATION_TRADE_QTY);
        stringMap.put("AS", OPTION_ASSIGNMENT);
        stringMap.put("ASF", AS_OF_TRADE_QTY);
        stringMap.put("DLV", DELIVERY_QTY);
        stringMap.put("ETR", ELECTRONIC_TRADE_QTY);
        stringMap.put("EX", OPTION_EXERCISE_QTY);
        stringMap.put("FIN", END_OF_DAY_QTY);
        stringMap.put("IAS", INTRA_SPREAD_QTY);
        stringMap.put("IES", INTER_SPREAD_QTY);
        stringMap.put("PA", ADJUSTMENT_QTY);
        stringMap.put("PIT", PIT_TRADE_QTY);
        stringMap.put("SOD", START_OF_DAY_QTY);
        stringMap.put("SPL", INTEGRAL_SPLIT);
        stringMap.put("TA", TRANSACTION_FROM_ASSIGNMENT);
        stringMap.put("TOT", TOTAL_TRANSACTION_QTY);
        stringMap.put("TQ", TRANSACTION_QUANTITY);
        stringMap.put("TRF", TRANSFER_TRADE_QTY);
        stringMap.put("TX", TRANSACTION_FROM_EXERCISE);
        stringMap.put("XM", CROSS_MARGIN_QTY);
        stringMap.put("RCV", RECEIVE_QUANTITY);
        stringMap.put("CAA", CORPORATE_ACTION_ADJUSTMENT);
        stringMap.put("DN", DELIVERY_NOTICE_QTY);
        stringMap.put("EP", EXCHANGE_FOR_PHYSICAL_QTY);
        stringMap.put("PNTN", PRIVATELY_NEGOTIATED_TRADE_QTY);
        stringMap.put("DLT", NET_DELTA_QTY);
        stringMap.put("CEA", CREDIT_EVENT_ADJUSTMENT);
        stringMap.put("SEA", SUCCESSION_EVENT_ADJUSTMENT);
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
        case "ALC": return ALLOCATION_TRADE_QTY;
        case "AS": return OPTION_ASSIGNMENT;
        case "ASF": return AS_OF_TRADE_QTY;
        case "DLV": return DELIVERY_QTY;
        case "ETR": return ELECTRONIC_TRADE_QTY;
        case "EX": return OPTION_EXERCISE_QTY;
        case "FIN": return END_OF_DAY_QTY;
        case "IAS": return INTRA_SPREAD_QTY;
        case "IES": return INTER_SPREAD_QTY;
        case "PA": return ADJUSTMENT_QTY;
        case "PIT": return PIT_TRADE_QTY;
        case "SOD": return START_OF_DAY_QTY;
        case "SPL": return INTEGRAL_SPLIT;
        case "TA": return TRANSACTION_FROM_ASSIGNMENT;
        case "TOT": return TOTAL_TRANSACTION_QTY;
        case "TQ": return TRANSACTION_QUANTITY;
        case "TRF": return TRANSFER_TRADE_QTY;
        case "TX": return TRANSACTION_FROM_EXERCISE;
        case "XM": return CROSS_MARGIN_QTY;
        case "RCV": return RECEIVE_QUANTITY;
        case "CAA": return CORPORATE_ACTION_ADJUSTMENT;
        case "DN": return DELIVERY_NOTICE_QTY;
        case "EP": return EXCHANGE_FOR_PHYSICAL_QTY;
        case "PNTN": return PRIVATELY_NEGOTIATED_TRADE_QTY;
        case "DLT": return NET_DELTA_QTY;
        case "CEA": return CREDIT_EVENT_ADJUSTMENT;
        case "SEA": return SUCCESSION_EVENT_ADJUSTMENT;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
