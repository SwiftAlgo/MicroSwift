/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum StreamAsgnReqType implements IntRepresentable
{
    STREAM_ASSIGNMENT_FOR_NEW_CUSTOMER(1),
    STREAM_ASSIGNMENT_FOR_EXISTING_CUSTOMER(2),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    StreamAsgnReqType(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(4);
        static
    {
        intSet.add(1);
        intSet.add(2);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static StreamAsgnReqType decode(final int representation)
    {
        switch(representation)
        {
        case 1: return STREAM_ASSIGNMENT_FOR_NEW_CUSTOMER;
        case 2: return STREAM_ASSIGNMENT_FOR_EXISTING_CUSTOMER;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
