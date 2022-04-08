/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum ContingencyType implements IntRepresentable
{
    ONE_CANCELS_THE_OTHER(1),
    ONE_TRIGGERS_THE_OTHER(2),
    ONE_UPDATES_THE_OTHER_ABSOLUTE_QUANTITY_REDUCTION(3),
    ONE_UPDATES_THE_OTHER_PROPORTIONAL_QUANTITY_REDUCTION(4),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    ContingencyType(final int representation)
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
    public static ContingencyType decode(final int representation)
    {
        switch(representation)
        {
        case 1: return ONE_CANCELS_THE_OTHER;
        case 2: return ONE_TRIGGERS_THE_OTHER;
        case 3: return ONE_UPDATES_THE_OTHER_ABSOLUTE_QUANTITY_REDUCTION;
        case 4: return ONE_UPDATES_THE_OTHER_PROPORTIONAL_QUANTITY_REDUCTION;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
