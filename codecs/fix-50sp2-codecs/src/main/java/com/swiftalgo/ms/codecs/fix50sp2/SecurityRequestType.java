/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum SecurityRequestType implements IntRepresentable
{
    REQUEST_SECURITY_IDENTITY_AND_SPECIFICATIONS(0),
    REQUEST_SECURITY_IDENTITY_FOR_THE_SPECIFICATIONS_PROVIDED(1),
    REQUEST_LIST_SECURITY_TYPES(2),
    REQUEST_LIST_SECURITIES(3),
    SYMBOL(4),
    SECURITYTYPE_AND_OR_CFICODE(5),
    PRODUCT(6),
    TRADINGSESSIONID(7),
    ALL_SECURITIES(8),
    MARKETID_OR_MARKETID_MARKETSEGMENTID(9),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    SecurityRequestType(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(20);
        static
    {
        intSet.add(0);
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
        intSet.add(4);
        intSet.add(5);
        intSet.add(6);
        intSet.add(7);
        intSet.add(8);
        intSet.add(9);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static SecurityRequestType decode(final int representation)
    {
        switch(representation)
        {
        case 0: return REQUEST_SECURITY_IDENTITY_AND_SPECIFICATIONS;
        case 1: return REQUEST_SECURITY_IDENTITY_FOR_THE_SPECIFICATIONS_PROVIDED;
        case 2: return REQUEST_LIST_SECURITY_TYPES;
        case 3: return REQUEST_LIST_SECURITIES;
        case 4: return SYMBOL;
        case 5: return SECURITYTYPE_AND_OR_CFICODE;
        case 6: return PRODUCT;
        case 7: return TRADINGSESSIONID;
        case 8: return ALL_SECURITIES;
        case 9: return MARKETID_OR_MARKETID_MARKETSEGMENTID;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
