/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum AllocIntermedReqType implements IntRepresentable
{
    PENDING_ACCEPT(1),
    PENDING_RELEASE(2),
    PENDING_REVERSAL(3),
    ACCEPT(4),
    BLOCK_LEVEL_REJECT(5),
    ACCOUNT_LEVEL_REJECT(6),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    AllocIntermedReqType(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(12);
        static
    {
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
        intSet.add(4);
        intSet.add(5);
        intSet.add(6);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static AllocIntermedReqType decode(final int representation)
    {
        switch(representation)
        {
        case 1: return PENDING_ACCEPT;
        case 2: return PENDING_RELEASE;
        case 3: return PENDING_REVERSAL;
        case 4: return ACCEPT;
        case 5: return BLOCK_LEVEL_REJECT;
        case 6: return ACCOUNT_LEVEL_REJECT;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
