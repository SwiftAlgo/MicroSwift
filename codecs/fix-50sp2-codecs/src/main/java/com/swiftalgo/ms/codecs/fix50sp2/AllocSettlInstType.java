/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum AllocSettlInstType implements IntRepresentable
{
    USE_DEFAULT_INSTRUCTIONS(0),
    DERIVE_FROM_PARAMETERS_PROVIDED(1),
    FULL_DETAILS_PROVIDED(2),
    SSI_DB_IDS_PROVIDED(3),
    PHONE_FOR_INSTRUCTIONS(4),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    AllocSettlInstType(final int representation)
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
    public static AllocSettlInstType decode(final int representation)
    {
        switch(representation)
        {
        case 0: return USE_DEFAULT_INSTRUCTIONS;
        case 1: return DERIVE_FROM_PARAMETERS_PROVIDED;
        case 2: return FULL_DETAILS_PROVIDED;
        case 3: return SSI_DB_IDS_PROVIDED;
        case 4: return PHONE_FOR_INSTRUCTIONS;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
