/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum SecurityTradingEvent implements IntRepresentable
{
    ORDER_IMBALANCE_AUCTION_IS_EXTENDED(1),
    TRADING_RESUMES(2),
    PRICE_VOLATILITY_INTERRUPTION(3),
    CHANGE_OF_TRADING_SESSION(4),
    CHANGE_OF_TRADING_SUBSESSION(5),
    CHANGE_OF_SECURITY_TRADING_STATUS(6),
    CHANGE_OF_BOOK_TYPE(7),
    CHANGE_OF_MARKET_DEPTH(8),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    SecurityTradingEvent(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(16);
        static
    {
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
        intSet.add(4);
        intSet.add(5);
        intSet.add(6);
        intSet.add(7);
        intSet.add(8);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static SecurityTradingEvent decode(final int representation)
    {
        switch(representation)
        {
        case 1: return ORDER_IMBALANCE_AUCTION_IS_EXTENDED;
        case 2: return TRADING_RESUMES;
        case 3: return PRICE_VOLATILITY_INTERRUPTION;
        case 4: return CHANGE_OF_TRADING_SESSION;
        case 5: return CHANGE_OF_TRADING_SUBSESSION;
        case 6: return CHANGE_OF_SECURITY_TRADING_STATUS;
        case 7: return CHANGE_OF_BOOK_TYPE;
        case 8: return CHANGE_OF_MARKET_DEPTH;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
