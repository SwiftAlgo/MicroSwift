/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum BidTradeType implements CharRepresentable
{
    AGENCY('A'),
    VWAP_GUARANTEE('G'),
    GUARANTEED_CLOSE('J'),
    RISK_TRADE('R'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    BidTradeType(final char representation)
    {
         this.representation = representation;
    }

    public final char representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(8);
        static
    {
        intSet.add('A');
        intSet.add('G');
        intSet.add('J');
        intSet.add('R');
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static BidTradeType decode(final int representation)
    {
        switch(representation)
        {
        case 'A': return AGENCY;
        case 'G': return VWAP_GUARANTEE;
        case 'J': return GUARANTEED_CLOSE;
        case 'R': return RISK_TRADE;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
