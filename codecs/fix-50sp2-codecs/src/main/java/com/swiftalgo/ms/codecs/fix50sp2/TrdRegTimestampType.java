/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum TrdRegTimestampType implements IntRepresentable
{
    EXECUTION_TIME(1),
    TIME_IN(2),
    TIME_OUT(3),
    BROKER_RECEIPT(4),
    BROKER_EXECUTION(5),
    DESK_RECEIPT(6),
    SUBMISSION_TO_CLEARING(7),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    TrdRegTimestampType(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(14);
        static
    {
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
        intSet.add(4);
        intSet.add(5);
        intSet.add(6);
        intSet.add(7);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static TrdRegTimestampType decode(final int representation)
    {
        switch(representation)
        {
        case 1: return EXECUTION_TIME;
        case 2: return TIME_IN;
        case 3: return TIME_OUT;
        case 4: return BROKER_RECEIPT;
        case 5: return BROKER_EXECUTION;
        case 6: return DESK_RECEIPT;
        case 7: return SUBMISSION_TO_CLEARING;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
