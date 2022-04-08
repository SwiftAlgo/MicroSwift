/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum MassActionRejectReason implements IntRepresentable
{
    MASS_ACTION_NOT_SUPPORTED(0),
    INVALID_OR_UNKNOWN_SECURITY(1),
    INVALID_OR_UNKNOWN_UNDERLYING_SECURITY(2),
    INVALID_OR_UNKNOWN_PRODUCT(3),
    INVALID_OR_UNKNOWN_CFICODE(4),
    INVALID_OR_UNKNOWN_SECURITYTYPE(5),
    INVALID_OR_UNKNOWN_TRADING_SESSION(6),
    INVALID_OR_UNKNOWN_MARKET(7),
    INVALID_OR_UNKNOWN_MARKET_SEGMENT(8),
    INVALID_OR_UNKNOWN_SECURITY_GROUP(9),
    INVALID_OR_UNKNOWN_SECURITY_ISSUER(10),
    INVALID_OR_UNKNOWN_ISSUER_OF_UNDERLYING_SECURITY(11),
    OTHER(99),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    MassActionRejectReason(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(26);
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
        intSet.add(10);
        intSet.add(11);
        intSet.add(99);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static MassActionRejectReason decode(final int representation)
    {
        switch(representation)
        {
        case 0: return MASS_ACTION_NOT_SUPPORTED;
        case 1: return INVALID_OR_UNKNOWN_SECURITY;
        case 2: return INVALID_OR_UNKNOWN_UNDERLYING_SECURITY;
        case 3: return INVALID_OR_UNKNOWN_PRODUCT;
        case 4: return INVALID_OR_UNKNOWN_CFICODE;
        case 5: return INVALID_OR_UNKNOWN_SECURITYTYPE;
        case 6: return INVALID_OR_UNKNOWN_TRADING_SESSION;
        case 7: return INVALID_OR_UNKNOWN_MARKET;
        case 8: return INVALID_OR_UNKNOWN_MARKET_SEGMENT;
        case 9: return INVALID_OR_UNKNOWN_SECURITY_GROUP;
        case 10: return INVALID_OR_UNKNOWN_SECURITY_ISSUER;
        case 11: return INVALID_OR_UNKNOWN_ISSUER_OF_UNDERLYING_SECURITY;
        case 99: return OTHER;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
