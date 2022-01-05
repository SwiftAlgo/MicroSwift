/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum SecurityListRequestType implements IntRepresentable
{
    SYMBOL(0),
    SECURITYTYPE_AND_OR_CFICODE(1),
    PRODUCT(2),
    TRADINGSESSIONID(3),
    ALL_SECURITIES(4),
    MARKETID_OR_MARKETID_MARKETSEGMENTID(5),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    SecurityListRequestType(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(12);
        static
    {
        intSet.add(0);
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
        intSet.add(4);
        intSet.add(5);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static SecurityListRequestType decode(final int representation)
    {
        switch(representation)
        {
        case 0: return SYMBOL;
        case 1: return SECURITYTYPE_AND_OR_CFICODE;
        case 2: return PRODUCT;
        case 3: return TRADINGSESSIONID;
        case 4: return ALL_SECURITIES;
        case 5: return MARKETID_OR_MARKETID_MARKETSEGMENTID;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
