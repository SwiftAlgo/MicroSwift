/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum BidTradeType implements CharRepresentable
{
    RISK_TRADE('R'),
    VWAP_GUARANTEE('G'),
    AGENCY('A'),
    GUARANTEED_CLOSE('J'),
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
        intSet.add('R');
        intSet.add('G');
        intSet.add('A');
        intSet.add('J');
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static BidTradeType decode(final int representation)
    {
        switch(representation)
        {
        case 'R': return RISK_TRADE;
        case 'G': return VWAP_GUARANTEE;
        case 'A': return AGENCY;
        case 'J': return GUARANTEED_CLOSE;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
