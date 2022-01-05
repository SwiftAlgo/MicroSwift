/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum MDReqRejReason implements CharRepresentable
{
    UNKNOWN_SYMBOL('0'),
    DUPLICATE_MDREQID('1'),
    INSUFFICIENT_BANDWIDTH('2'),
    INSUFFICIENT_PERMISSIONS('3'),
    UNSUPPORTED_SUBSCRIPTIONREQUESTTYPE('4'),
    UNSUPPORTED_MARKETDEPTH('5'),
    UNSUPPORTED_MDUPDATETYPE('6'),
    UNSUPPORTED_AGGREGATEDBOOK('7'),
    UNSUPPORTED_MDENTRYTYPE('8'),
    UNSUPPORTED_TRADINGSESSIONID('9'),
    UNSUPPORTED_SCOPE('A'),
    UNSUPPORTED_OPENCLOSESETTLEFLAG('B'),
    UNSUPPORTED_MDIMPLICITDELETE('C'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    MDReqRejReason(final char representation)
    {
         this.representation = representation;
    }

    public final char representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(26);
        static
    {
        intSet.add('0');
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
    public static MDReqRejReason decode(final int representation)
    {
        switch(representation)
        {
        case '0': return UNKNOWN_SYMBOL;
        case '1': return DUPLICATE_MDREQID;
        case '2': return INSUFFICIENT_BANDWIDTH;
        case '3': return INSUFFICIENT_PERMISSIONS;
        case '4': return UNSUPPORTED_SUBSCRIPTIONREQUESTTYPE;
        case '5': return UNSUPPORTED_MARKETDEPTH;
        case '6': return UNSUPPORTED_MDUPDATETYPE;
        case '7': return UNSUPPORTED_AGGREGATEDBOOK;
        case '8': return UNSUPPORTED_MDENTRYTYPE;
        case '9': return UNSUPPORTED_TRADINGSESSIONID;
        case 'A': return UNSUPPORTED_SCOPE;
        case 'B': return UNSUPPORTED_OPENCLOSESETTLEFLAG;
        case 'C': return UNSUPPORTED_MDIMPLICITDELETE;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
