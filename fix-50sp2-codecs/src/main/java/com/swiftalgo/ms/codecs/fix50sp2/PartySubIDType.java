/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum PartySubIDType implements IntRepresentable
{
    FIRM(1),
    PERSON(2),
    SYSTEM(3),
    APPLICATION(4),
    FULL_LEGAL_NAME_OF_FIRM(5),
    POSTAL_ADDRESS(6),
    PHONE_NUMBER(7),
    EMAIL_ADDRESS(8),
    CONTACT_NAME(9),
    SECURITIES_ACCOUNT_NUMBER(10),
    REGISTRATION_NUMBER(11),
    REGISTERED_ADDRESS(12),
    REGULATORY_STATUS(13),
    REGISTRATION_NAME(14),
    CASH_ACCOUNT_NUMBER(15),
    BIC(16),
    CSD_PARTICIPANT_MEMBER_CODE(17),
    REGISTERED_ADDRESS_1(18),
    FUND_ACCOUNT_NAME(19),
    TELEX_NUMBER(20),
    FAX_NUMBER(21),
    SECURITIES_ACCOUNT_NAME(22),
    CASH_ACCOUNT_NAME(23),
    DEPARTMENT(24),
    LOCATION_DESK(25),
    POSITION_ACCOUNT_TYPE(26),
    SECURITY_LOCATE_ID(27),
    MARKET_MAKER(28),
    ELIGIBLE_COUNTERPARTY(29),
    PROFESSIONAL_CLIENT(30),
    LOCATION(31),
    EXECUTION_VENUE(32),
    CURRENCY_DELIVERY_IDENTIFIER(33),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    PartySubIDType(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(66);
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
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static PartySubIDType decode(final int representation)
    {
        switch(representation)
        {
        case 1: return FIRM;
        case 2: return PERSON;
        case 3: return SYSTEM;
        case 4: return APPLICATION;
        case 5: return FULL_LEGAL_NAME_OF_FIRM;
        case 6: return POSTAL_ADDRESS;
        case 7: return PHONE_NUMBER;
        case 8: return EMAIL_ADDRESS;
        case 9: return CONTACT_NAME;
        case 10: return SECURITIES_ACCOUNT_NUMBER;
        case 11: return REGISTRATION_NUMBER;
        case 12: return REGISTERED_ADDRESS;
        case 13: return REGULATORY_STATUS;
        case 14: return REGISTRATION_NAME;
        case 15: return CASH_ACCOUNT_NUMBER;
        case 16: return BIC;
        case 17: return CSD_PARTICIPANT_MEMBER_CODE;
        case 18: return REGISTERED_ADDRESS_1;
        case 19: return FUND_ACCOUNT_NAME;
        case 20: return TELEX_NUMBER;
        case 21: return FAX_NUMBER;
        case 22: return SECURITIES_ACCOUNT_NAME;
        case 23: return CASH_ACCOUNT_NAME;
        case 24: return DEPARTMENT;
        case 25: return LOCATION_DESK;
        case 26: return POSITION_ACCOUNT_TYPE;
        case 27: return SECURITY_LOCATE_ID;
        case 28: return MARKET_MAKER;
        case 29: return ELIGIBLE_COUNTERPARTY;
        case 30: return PROFESSIONAL_CLIENT;
        case 31: return LOCATION;
        case 32: return EXECUTION_VENUE;
        case 33: return CURRENCY_DELIVERY_IDENTIFIER;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
