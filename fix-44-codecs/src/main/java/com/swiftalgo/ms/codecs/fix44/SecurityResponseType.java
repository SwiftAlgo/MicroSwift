/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum SecurityResponseType implements IntRepresentable
{
    ACCEPT_SECURITY_PROPOSAL_AS_IS(1),
    ACCEPT_SECURITY_PROPOSAL_WITH_REVISIONS_AS_INDICATED_IN_THE_MESSAGE(2),
    LIST_OF_SECURITY_TYPES_RETURNED_PER_REQUEST(3),
    LIST_OF_SECURITIES_RETURNED_PER_REQUEST(4),
    REJECT_SECURITY_PROPOSAL(5),
    CAN_NOT_MATCH_SELECTION_CRITERIA(6),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    SecurityResponseType(final int representation)
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
    public static SecurityResponseType decode(final int representation)
    {
        switch(representation)
        {
        case 1: return ACCEPT_SECURITY_PROPOSAL_AS_IS;
        case 2: return ACCEPT_SECURITY_PROPOSAL_WITH_REVISIONS_AS_INDICATED_IN_THE_MESSAGE;
        case 3: return LIST_OF_SECURITY_TYPES_RETURNED_PER_REQUEST;
        case 4: return LIST_OF_SECURITIES_RETURNED_PER_REQUEST;
        case 5: return REJECT_SECURITY_PROPOSAL;
        case 6: return CAN_NOT_MATCH_SELECTION_CRITERIA;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
