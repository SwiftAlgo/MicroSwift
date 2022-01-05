/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum QuoteCancelType implements IntRepresentable
{
    CANCEL_FOR_SYMBOL(1),
    CANCEL_FOR_SECURITY_TYPE(2),
    CANCEL_FOR_UNDERLYING_SYMBOL(3),
    CANCEL_ALL_QUOTES(4),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    QuoteCancelType(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(8);
        static
    {
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
        intSet.add(4);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static QuoteCancelType decode(final int representation)
    {
        switch(representation)
        {
        case 1: return CANCEL_FOR_SYMBOL;
        case 2: return CANCEL_FOR_SECURITY_TYPE;
        case 3: return CANCEL_FOR_UNDERLYING_SYMBOL;
        case 4: return CANCEL_ALL_QUOTES;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
