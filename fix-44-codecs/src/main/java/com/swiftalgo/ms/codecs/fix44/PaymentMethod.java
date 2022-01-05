/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum PaymentMethod implements IntRepresentable
{
    CREST(1),
    NSCC(2),
    EUROCLEAR(3),
    CLEARSTREAM(4),
    CHEQUE(5),
    TELEGRAPHIC_TRANSFER(6),
    FEDWIRE(7),
    DEBIT_CARD(8),
    DIRECT_DEBIT(9),
    DIRECT_CREDIT(10),
    CREDIT_CARD(11),
    ACH_DEBIT(12),
    ACH_CREDIT(13),
    BPAY(14),
    HIGH_VALUE_CLEARING_SYSTEM(15),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    PaymentMethod(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(30);
        static
    {
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
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static PaymentMethod decode(final int representation)
    {
        switch(representation)
        {
        case 1: return CREST;
        case 2: return NSCC;
        case 3: return EUROCLEAR;
        case 4: return CLEARSTREAM;
        case 5: return CHEQUE;
        case 6: return TELEGRAPHIC_TRANSFER;
        case 7: return FEDWIRE;
        case 8: return DEBIT_CARD;
        case 9: return DIRECT_DEBIT;
        case 10: return DIRECT_CREDIT;
        case 11: return CREDIT_CARD;
        case 12: return ACH_DEBIT;
        case 13: return ACH_CREDIT;
        case 14: return BPAY;
        case 15: return HIGH_VALUE_CLEARING_SYSTEM;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
