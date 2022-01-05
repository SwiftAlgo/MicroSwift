/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum MassStatusReqType implements IntRepresentable
{
    STATUS_FOR_ORDERS_FOR_A_SECURITY(1),
    STATUS_FOR_ORDERS_FOR_AN_UNDERLYING_SECURITY(2),
    STATUS_FOR_ORDERS_FOR_A_PRODUCT(3),
    STATUS_FOR_ORDERS_FOR_A_CFICODE(4),
    STATUS_FOR_ORDERS_FOR_A_SECURITYTYPE(5),
    STATUS_FOR_ORDERS_FOR_A_TRADING_SESSION(6),
    STATUS_FOR_ALL_ORDERS(7),
    STATUS_FOR_ORDERS_FOR_A_PARTYID(8),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    MassStatusReqType(final int representation)
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
    public static MassStatusReqType decode(final int representation)
    {
        switch(representation)
        {
        case 1: return STATUS_FOR_ORDERS_FOR_A_SECURITY;
        case 2: return STATUS_FOR_ORDERS_FOR_AN_UNDERLYING_SECURITY;
        case 3: return STATUS_FOR_ORDERS_FOR_A_PRODUCT;
        case 4: return STATUS_FOR_ORDERS_FOR_A_CFICODE;
        case 5: return STATUS_FOR_ORDERS_FOR_A_SECURITYTYPE;
        case 6: return STATUS_FOR_ORDERS_FOR_A_TRADING_SESSION;
        case 7: return STATUS_FOR_ALL_ORDERS;
        case 8: return STATUS_FOR_ORDERS_FOR_A_PARTYID;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
