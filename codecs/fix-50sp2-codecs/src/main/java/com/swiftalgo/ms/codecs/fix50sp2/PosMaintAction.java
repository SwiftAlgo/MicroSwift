/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum PosMaintAction implements IntRepresentable
{
    NEW_USED_TO_INCREMENT_THE_OVERALL_TRANSACTION_QUANTITY(1),
    REPLACE_USED_TO_OVERRIDE_THE_OVERALL_TRANSACTION_QUANTITY_OR_SPECIFI_ADD_MESSAGES_BASED_ON_THE_REFERENCE_ID(2),
    CANCEL_USED_TO_REMOVE_THE_OVERALL_TRANSACTION_OR_SPECIFIC_ADD_MESSAGES_BASED_ON_REFERENCE_ID(3),
    REVERSE_USED_TO_COMPLETELLY_BACK_OUT_THE_TRANSACTION_SUCH_THAT_THE_TRANSACTION_NEVER_EXISTED(4),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    PosMaintAction(final int representation)
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
    public static PosMaintAction decode(final int representation)
    {
        switch(representation)
        {
        case 1: return NEW_USED_TO_INCREMENT_THE_OVERALL_TRANSACTION_QUANTITY;
        case 2: return REPLACE_USED_TO_OVERRIDE_THE_OVERALL_TRANSACTION_QUANTITY_OR_SPECIFI_ADD_MESSAGES_BASED_ON_THE_REFERENCE_ID;
        case 3: return CANCEL_USED_TO_REMOVE_THE_OVERALL_TRANSACTION_OR_SPECIFIC_ADD_MESSAGES_BASED_ON_REFERENCE_ID;
        case 4: return REVERSE_USED_TO_COMPLETELLY_BACK_OUT_THE_TRANSACTION_SUCH_THAT_THE_TRANSACTION_NEVER_EXISTED;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
