/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum MassCancelRequestType implements CharRepresentable
{
    CANCEL_ORDERS_FOR_A_SECURITY('1'),
    CANCEL_ORDERS_FOR_AN_UNDERLYING_SECURITY('2'),
    CANCEL_ORDERS_FOR_A_PRODUCT('3'),
    CANCEL_ORDERS_FOR_A_CFICODE('4'),
    CANCEL_ORDERS_FOR_A_SECURITYTYPE('5'),
    CANCEL_ORDERS_FOR_A_TRADING_SESSION('6'),
    CANCEL_ALL_ORDERS('7'),
    CANCEL_ORDERS_FOR_A_MARKET('8'),
    CANCEL_ORDERS_FOR_A_MARKET_SEGMENT('9'),
    CANCEL_ORDERS_FOR_A_SECURITY_GROUP('A'),
    CANCEL_FOR_SECURITY_ISSUER('B'),
    CANCEL_FOR_ISSUER_OF_UNDERLYING_SECURITY('C'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    MassCancelRequestType(final char representation)
    {
         this.representation = representation;
    }

    public final char representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(24);
        static
    {
        intSet.add('1');
        intSet.add('2');
        intSet.add('3');
        intSet.add('4');
        intSet.add('5');
        intSet.add('6');
        intSet.add('7');
        intSet.add('8');
        intSet.add('9');
        intSet.add('A');
        intSet.add('B');
        intSet.add('C');
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static MassCancelRequestType decode(final int representation)
    {
        switch(representation)
        {
        case '1': return CANCEL_ORDERS_FOR_A_SECURITY;
        case '2': return CANCEL_ORDERS_FOR_AN_UNDERLYING_SECURITY;
        case '3': return CANCEL_ORDERS_FOR_A_PRODUCT;
        case '4': return CANCEL_ORDERS_FOR_A_CFICODE;
        case '5': return CANCEL_ORDERS_FOR_A_SECURITYTYPE;
        case '6': return CANCEL_ORDERS_FOR_A_TRADING_SESSION;
        case '7': return CANCEL_ALL_ORDERS;
        case '8': return CANCEL_ORDERS_FOR_A_MARKET;
        case '9': return CANCEL_ORDERS_FOR_A_MARKET_SEGMENT;
        case 'A': return CANCEL_ORDERS_FOR_A_SECURITY_GROUP;
        case 'B': return CANCEL_FOR_SECURITY_ISSUER;
        case 'C': return CANCEL_FOR_ISSUER_OF_UNDERLYING_SECURITY;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
