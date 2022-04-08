/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum QuoteCancelType implements IntRepresentable
{
    CANCEL_FOR_ONE_OR_MORE_SECURITIES(1),
    CANCEL_FOR_SECURITY_TYPE(2),
    CANCEL_FOR_UNDERLYING_SECURITY(3),
    CANCEL_ALL_QUOTES(4),
    CANCEL_QUOTE_SPECIFIED_IN_QUOTEID(5),
    CANCEL_BY_QUOTETYPE(6),
    CANCEL_FOR_SECURITY_ISSUER(7),
    CANCEL_FOR_ISSUER_OF_UNDERLYING_SECURITY(8),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    QuoteCancelType(final int representation)
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
    public static QuoteCancelType decode(final int representation)
    {
        switch(representation)
        {
        case 1: return CANCEL_FOR_ONE_OR_MORE_SECURITIES;
        case 2: return CANCEL_FOR_SECURITY_TYPE;
        case 3: return CANCEL_FOR_UNDERLYING_SECURITY;
        case 4: return CANCEL_ALL_QUOTES;
        case 5: return CANCEL_QUOTE_SPECIFIED_IN_QUOTEID;
        case 6: return CANCEL_BY_QUOTETYPE;
        case 7: return CANCEL_FOR_SECURITY_ISSUER;
        case 8: return CANCEL_FOR_ISSUER_OF_UNDERLYING_SECURITY;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
