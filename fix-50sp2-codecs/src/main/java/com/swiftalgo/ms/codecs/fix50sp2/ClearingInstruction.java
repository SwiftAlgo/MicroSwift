/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum ClearingInstruction implements IntRepresentable
{
    PROCESS_NORMALLY(0),
    EXCLUDE_FROM_ALL_NETTING(1),
    BILATERAL_NETTING_ONLY(2),
    EX_CLEARING(3),
    SPECIAL_TRADE(4),
    MULTILATERAL_NETTING(5),
    CLEAR_AGAINST_CENTRAL_COUNTERPARTY(6),
    EXCLUDE_FROM_CENTRAL_COUNTERPARTY(7),
    MANUAL_MODE(8),
    AUTOMATIC_POSTING_MODE(9),
    AUTOMATIC_GIVE_UP_MODE(10),
    QUALIFIED_SERVICE_REPRESENTATIVE_QSR(11),
    CUSTOMER_TRADE(12),
    SELF_CLEARING(13),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    ClearingInstruction(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(28);
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
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static ClearingInstruction decode(final int representation)
    {
        switch(representation)
        {
        case 0: return PROCESS_NORMALLY;
        case 1: return EXCLUDE_FROM_ALL_NETTING;
        case 2: return BILATERAL_NETTING_ONLY;
        case 3: return EX_CLEARING;
        case 4: return SPECIAL_TRADE;
        case 5: return MULTILATERAL_NETTING;
        case 6: return CLEAR_AGAINST_CENTRAL_COUNTERPARTY;
        case 7: return EXCLUDE_FROM_CENTRAL_COUNTERPARTY;
        case 8: return MANUAL_MODE;
        case 9: return AUTOMATIC_POSTING_MODE;
        case 10: return AUTOMATIC_GIVE_UP_MODE;
        case 11: return QUALIFIED_SERVICE_REPRESENTATIVE_QSR;
        case 12: return CUSTOMER_TRADE;
        case 13: return SELF_CLEARING;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
