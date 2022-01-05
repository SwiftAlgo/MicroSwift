/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum AllocReportType implements IntRepresentable
{
    SELLSIDE_CALCULATED_USING_PRELIMINARY(3),
    SELLSIDE_CALCULATED_WITHOUT_PRELIMINARY(4),
    WAREHOUSE_RECAP(5),
    REQUEST_TO_INTERMEDIARY(8),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    AllocReportType(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(8);
        static
    {
        intSet.add(3);
        intSet.add(4);
        intSet.add(5);
        intSet.add(8);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static AllocReportType decode(final int representation)
    {
        switch(representation)
        {
        case 3: return SELLSIDE_CALCULATED_USING_PRELIMINARY;
        case 4: return SELLSIDE_CALCULATED_WITHOUT_PRELIMINARY;
        case 5: return WAREHOUSE_RECAP;
        case 8: return REQUEST_TO_INTERMEDIARY;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
