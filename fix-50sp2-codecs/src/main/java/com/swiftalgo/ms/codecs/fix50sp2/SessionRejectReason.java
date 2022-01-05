/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum SessionRejectReason implements IntRepresentable
{
    INVALID_TAG_NUMBER(0),
    REQUIRED_TAG_MISSING(1),
    TAG_NOT_DEFINED_FOR_THIS_MESSAGE_TYPE(2),
    UNDEFINED_TAG(3),
    TAG_SPECIFIED_WITHOUT_A_VALUE(4),
    VALUE_IS_INCORRECT(5),
    INCORRECT_DATA_FORMAT_FOR_VALUE(6),
    DECRYPTION_PROBLEM(7),
    SIGNATURE_PROBLEM(8),
    COMPID_PROBLEM(9),
    SENDINGTIME_ACCURACY_PROBLEM(10),
    INVALID_MSGTYPE(11),
    XML_VALIDATION_ERROR(12),
    TAG_APPEARS_MORE_THAN_ONCE(13),
    TAG_SPECIFIED_OUT_OF_REQUIRED_ORDER(14),
    REPEATING_GROUP_FIELDS_OUT_OF_ORDER(15),
    INCORRECT_NUMINGROUP_COUNT_FOR_REPEATING_GROUP(16),
    NON_DATA_VALUE_INCLUDES_FIELD_DELIMITER(17),
    INVALID_UNSUPPORTED_APPLICATION_VERSION(18),
    OTHER(99),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    SessionRejectReason(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(40);
        static
    {
        intSet.add(0);
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
        intSet.add(4);
        intSet.add(5);
        intSet.add(6);
        intSet.add(7);
        intSet.add(8);
        intSet.add(9);
        intSet.add(10);
        intSet.add(11);
        intSet.add(12);
        intSet.add(13);
        intSet.add(14);
        intSet.add(15);
        intSet.add(16);
        intSet.add(17);
        intSet.add(18);
        intSet.add(99);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static SessionRejectReason decode(final int representation)
    {
        switch(representation)
        {
        case 0: return INVALID_TAG_NUMBER;
        case 1: return REQUIRED_TAG_MISSING;
        case 2: return TAG_NOT_DEFINED_FOR_THIS_MESSAGE_TYPE;
        case 3: return UNDEFINED_TAG;
        case 4: return TAG_SPECIFIED_WITHOUT_A_VALUE;
        case 5: return VALUE_IS_INCORRECT;
        case 6: return INCORRECT_DATA_FORMAT_FOR_VALUE;
        case 7: return DECRYPTION_PROBLEM;
        case 8: return SIGNATURE_PROBLEM;
        case 9: return COMPID_PROBLEM;
        case 10: return SENDINGTIME_ACCURACY_PROBLEM;
        case 11: return INVALID_MSGTYPE;
        case 12: return XML_VALIDATION_ERROR;
        case 13: return TAG_APPEARS_MORE_THAN_ONCE;
        case 14: return TAG_SPECIFIED_OUT_OF_REQUIRED_ORDER;
        case 15: return REPEATING_GROUP_FIELDS_OUT_OF_ORDER;
        case 16: return INCORRECT_NUMINGROUP_COUNT_FOR_REPEATING_GROUP;
        case 17: return NON_DATA_VALUE_INCLUDES_FIELD_DELIMITER;
        case 18: return INVALID_UNSUPPORTED_APPLICATION_VERSION;
        case 99: return OTHER;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
