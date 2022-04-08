/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum SideMultiLegReportingType implements IntRepresentable
{
    SINGLE_SECURITY(1),
    INDIVIDUAL_LEG_OF_A_MULTI_LEG_SECURITY(2),
    MULTI_LEG_SECURITY(3),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    SideMultiLegReportingType(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(6);
        static
    {
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static SideMultiLegReportingType decode(final int representation)
    {
        switch(representation)
        {
        case 1: return SINGLE_SECURITY;
        case 2: return INDIVIDUAL_LEG_OF_A_MULTI_LEG_SECURITY;
        case 3: return MULTI_LEG_SECURITY;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
