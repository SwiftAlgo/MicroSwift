/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum MassActionScope implements IntRepresentable
{
    ALL_ORDERS_FOR_A_SECURITY(1),
    ALL_ORDERS_FOR_AN_UNDERLYING_SECURITY(2),
    ALL_ORDERS_FOR_A_PRODUCT(3),
    ALL_ORDERS_FOR_A_CFICODE(4),
    ALL_ORDERS_FOR_A_SECURITYTYPE(5),
    ALL_ORDERS_FOR_A_TRADING_SESSION(6),
    ALL_ORDERS(7),
    ALL_ORDERS_FOR_A_MARKET(8),
    ALL_ORDERS_FOR_A_MARKET_SEGMENT(9),
    ALL_ORDERS_FOR_A_SECURITY_GROUP(10),
    CANCEL_FOR_SECURITY_ISSUER(11),
    CANCEL_FOR_ISSUER_OF_UNDERLYING_SECURITY(12),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    MassActionScope(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(24);
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
        intSet.add(9);
        intSet.add(10);
        intSet.add(11);
        intSet.add(12);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static MassActionScope decode(final int representation)
    {
        switch(representation)
        {
        case 1: return ALL_ORDERS_FOR_A_SECURITY;
        case 2: return ALL_ORDERS_FOR_AN_UNDERLYING_SECURITY;
        case 3: return ALL_ORDERS_FOR_A_PRODUCT;
        case 4: return ALL_ORDERS_FOR_A_CFICODE;
        case 5: return ALL_ORDERS_FOR_A_SECURITYTYPE;
        case 6: return ALL_ORDERS_FOR_A_TRADING_SESSION;
        case 7: return ALL_ORDERS;
        case 8: return ALL_ORDERS_FOR_A_MARKET;
        case 9: return ALL_ORDERS_FOR_A_MARKET_SEGMENT;
        case 10: return ALL_ORDERS_FOR_A_SECURITY_GROUP;
        case 11: return CANCEL_FOR_SECURITY_ISSUER;
        case 12: return CANCEL_FOR_ISSUER_OF_UNDERLYING_SECURITY;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
