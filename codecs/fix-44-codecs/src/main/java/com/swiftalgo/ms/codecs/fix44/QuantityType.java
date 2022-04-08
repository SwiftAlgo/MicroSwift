/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum QuantityType implements IntRepresentable
{
    SHARES(1),
    BONDS(2),
    CURRENTFACE(3),
    ORIGINALFACE(4),
    CURRENCY(5),
    CONTRACTS(6),
    OTHER(7),
    PAR(8),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    QuantityType(final int representation)
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
    public static QuantityType decode(final int representation)
    {
        switch(representation)
        {
        case 1: return SHARES;
        case 2: return BONDS;
        case 3: return CURRENTFACE;
        case 4: return ORIGINALFACE;
        case 5: return CURRENCY;
        case 6: return CONTRACTS;
        case 7: return OTHER;
        case 8: return PAR;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
