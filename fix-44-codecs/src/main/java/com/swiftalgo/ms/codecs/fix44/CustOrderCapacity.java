/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum CustOrderCapacity implements IntRepresentable
{
    MEMBER_TRADING_FOR_THEIR_OWN_ACCOUNT(1),
    CLEARING_FIRM_TRADING_FOR_ITS_PROPRIETARY_ACCOUNT(2),
    MEMBER_TRADING_FOR_ANOTHER_MEMBER(3),
    ALL_OTHER(4),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    CustOrderCapacity(final int representation)
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
    public static CustOrderCapacity decode(final int representation)
    {
        switch(representation)
        {
        case 1: return MEMBER_TRADING_FOR_THEIR_OWN_ACCOUNT;
        case 2: return CLEARING_FIRM_TRADING_FOR_ITS_PROPRIETARY_ACCOUNT;
        case 3: return MEMBER_TRADING_FOR_ANOTHER_MEMBER;
        case 4: return ALL_OTHER;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
