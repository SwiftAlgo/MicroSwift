/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum TrdSubType implements IntRepresentable
{
    CMTA(0),
    INTERNAL_TRANSFER_OR_ADJUSTMENT(1),
    EXTERNAL_TRANSFER_OR_TRANSFER_OF_ACCOUNT(2),
    REJECT_FOR_SUBMITTING_SIDE(3),
    ADVISORY_FOR_CONTRA_SIDE(4),
    OFFSET_DUE_TO_AN_ALLOCATION(5),
    ONSET_DUE_TO_AN_ALLOCATION(6),
    DIFFERENTIAL_SPREAD(7),
    IMPLIED_SPREAD_LEG_EXECUTED_AGAINST_AN_OUTRIGHT(8),
    TRANSACTION_FROM_EXERCISE(9),
    TRANSACTION_FROM_ASSIGNMENT(10),
    ACATS(11),
    AI(14),
    B(15),
    K(16),
    LC(17),
    M(18),
    N(19),
    NM_TRANSACTION_WHERE_EXCHANGE_HAS_GRANTED_PERMISSION_FOR_NON_PUBLICATION_II_IDB_IS_REPORTING_AS_SELLER_III_SUBMITTING_A_TRANSACTION_REPORT_TO_THE_EXCHANGE_WHERE_THE_TRANSACTION_REPORT_IS_NOT_ALSO_A_TRADE_REPORT_(20),
    NR(21),
    P(22),
    PA(23),
    PC(24),
    PN(25),
    R_OR(26),
    RO(27),
    RT(28),
    SW(29),
    T(30),
    WN(31),
    WT(32),
    OFF_HOURS_TRADE(33),
    ON_HOURS_TRADE(34),
    OTC_QUOTE(35),
    CONVERTED_SWAP(36),
    CROSSED_TRADE(37),
    INTERIM_PROTECTED_TRADE(38),
    LARGE_IN_SCALE(39),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    TrdSubType(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(76);
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
        intSet.add(14);
        intSet.add(15);
        intSet.add(16);
        intSet.add(17);
        intSet.add(18);
        intSet.add(19);
        intSet.add(20);
        intSet.add(21);
        intSet.add(22);
        intSet.add(23);
        intSet.add(24);
        intSet.add(25);
        intSet.add(26);
        intSet.add(27);
        intSet.add(28);
        intSet.add(29);
        intSet.add(30);
        intSet.add(31);
        intSet.add(32);
        intSet.add(33);
        intSet.add(34);
        intSet.add(35);
        intSet.add(36);
        intSet.add(37);
        intSet.add(38);
        intSet.add(39);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static TrdSubType decode(final int representation)
    {
        switch(representation)
        {
        case 0: return CMTA;
        case 1: return INTERNAL_TRANSFER_OR_ADJUSTMENT;
        case 2: return EXTERNAL_TRANSFER_OR_TRANSFER_OF_ACCOUNT;
        case 3: return REJECT_FOR_SUBMITTING_SIDE;
        case 4: return ADVISORY_FOR_CONTRA_SIDE;
        case 5: return OFFSET_DUE_TO_AN_ALLOCATION;
        case 6: return ONSET_DUE_TO_AN_ALLOCATION;
        case 7: return DIFFERENTIAL_SPREAD;
        case 8: return IMPLIED_SPREAD_LEG_EXECUTED_AGAINST_AN_OUTRIGHT;
        case 9: return TRANSACTION_FROM_EXERCISE;
        case 10: return TRANSACTION_FROM_ASSIGNMENT;
        case 11: return ACATS;
        case 14: return AI;
        case 15: return B;
        case 16: return K;
        case 17: return LC;
        case 18: return M;
        case 19: return N;
        case 20: return NM_TRANSACTION_WHERE_EXCHANGE_HAS_GRANTED_PERMISSION_FOR_NON_PUBLICATION_II_IDB_IS_REPORTING_AS_SELLER_III_SUBMITTING_A_TRANSACTION_REPORT_TO_THE_EXCHANGE_WHERE_THE_TRANSACTION_REPORT_IS_NOT_ALSO_A_TRADE_REPORT_;
        case 21: return NR;
        case 22: return P;
        case 23: return PA;
        case 24: return PC;
        case 25: return PN;
        case 26: return R_OR;
        case 27: return RO;
        case 28: return RT;
        case 29: return SW;
        case 30: return T;
        case 31: return WN;
        case 32: return WT;
        case 33: return OFF_HOURS_TRADE;
        case 34: return ON_HOURS_TRADE;
        case 35: return OTC_QUOTE;
        case 36: return CONVERTED_SWAP;
        case 37: return CROSSED_TRADE;
        case 38: return INTERIM_PROTECTED_TRADE;
        case 39: return LARGE_IN_SCALE;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
