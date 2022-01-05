/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum RegistRejReasonCode implements IntRepresentable
{
    INVALID_UNACCEPTABLE_ACCOUNT_TYPE(1),
    INVALID_UNACCEPTABLE_TAX_EXEMPT_TYPE(2),
    INVALID_UNACCEPTABLE_OWNERSHIP_TYPE(3),
    INVALID_UNACCEPTABLE_NO_REG_DETLS(4),
    INVALID_UNACCEPTABLE_REG_SEQ_NO(5),
    INVALID_UNACCEPTABLE_REG_DTLS(6),
    INVALID_UNACCEPTABLE_MAILING_DTLS(7),
    INVALID_UNACCEPTABLE_MAILING_INST(8),
    INVALID_UNACCEPTABLE_INVESTOR_ID(9),
    INVALID_UNACCEPTABLE_INVESTOR_ID_SOURCE(10),
    INVALID_UNACCEPTABLE_DATE_OF_BIRTH(11),
    INVALID_UNACCEPTABLE_INVESTOR_COUNTRY_OF_RESIDENCE(12),
    INVALID_UNACCEPTABLE_NODISTRIBINSTNS(13),
    INVALID_UNACCEPTABLE_DISTRIB_PERCENTAGE(14),
    INVALID_UNACCEPTABLE_DISTRIB_PAYMENT_METHOD(15),
    INVALID_UNACCEPTABLE_CASH_DISTRIB_AGENT_ACCT_NAME(16),
    INVALID_UNACCEPTABLE_CASH_DISTRIB_AGENT_CODE(17),
    INVALID_UNACCEPTABLE_CASH_DISTRIB_AGENT_ACCT_NUM(18),
    OTHER(99),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    RegistRejReasonCode(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(38);
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
        intSet.add(16);
        intSet.add(17);
        intSet.add(18);
        intSet.add(99);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static RegistRejReasonCode decode(final int representation)
    {
        switch(representation)
        {
        case 1: return INVALID_UNACCEPTABLE_ACCOUNT_TYPE;
        case 2: return INVALID_UNACCEPTABLE_TAX_EXEMPT_TYPE;
        case 3: return INVALID_UNACCEPTABLE_OWNERSHIP_TYPE;
        case 4: return INVALID_UNACCEPTABLE_NO_REG_DETLS;
        case 5: return INVALID_UNACCEPTABLE_REG_SEQ_NO;
        case 6: return INVALID_UNACCEPTABLE_REG_DTLS;
        case 7: return INVALID_UNACCEPTABLE_MAILING_DTLS;
        case 8: return INVALID_UNACCEPTABLE_MAILING_INST;
        case 9: return INVALID_UNACCEPTABLE_INVESTOR_ID;
        case 10: return INVALID_UNACCEPTABLE_INVESTOR_ID_SOURCE;
        case 11: return INVALID_UNACCEPTABLE_DATE_OF_BIRTH;
        case 12: return INVALID_UNACCEPTABLE_INVESTOR_COUNTRY_OF_RESIDENCE;
        case 13: return INVALID_UNACCEPTABLE_NODISTRIBINSTNS;
        case 14: return INVALID_UNACCEPTABLE_DISTRIB_PERCENTAGE;
        case 15: return INVALID_UNACCEPTABLE_DISTRIB_PAYMENT_METHOD;
        case 16: return INVALID_UNACCEPTABLE_CASH_DISTRIB_AGENT_ACCT_NAME;
        case 17: return INVALID_UNACCEPTABLE_CASH_DISTRIB_AGENT_CODE;
        case 18: return INVALID_UNACCEPTABLE_CASH_DISTRIB_AGENT_ACCT_NUM;
        case 99: return OTHER;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
