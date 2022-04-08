/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum StandInstDbType implements IntRepresentable
{
    OTHER(0),
    DTC_SID(1),
    THOMSON_ALERT(2),
    A_GLOBAL_CUSTODIAN(3),
    ACCOUNTNET(4),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    StandInstDbType(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(10);
        static
    {
        intSet.add(0);
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
        intSet.add(4);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static StandInstDbType decode(final int representation)
    {
        switch(representation)
        {
        case 0: return OTHER;
        case 1: return DTC_SID;
        case 2: return THOMSON_ALERT;
        case 3: return A_GLOBAL_CUSTODIAN;
        case 4: return ACCOUNTNET;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
