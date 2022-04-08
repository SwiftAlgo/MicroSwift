/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum PartyRole implements IntRepresentable
{
    EXECUTING_FIRM(1),
    BROKER_OF_CREDIT(2),
    CLIENT_ID(3),
    CLEARING_FIRM(4),
    INVESTOR_ID(5),
    INTRODUCING_FIRM(6),
    ENTERING_FIRM(7),
    LOCATE_LENDING_FIRM(8),
    FUND_MANAGER_CLIENT_ID(9),
    SETTLEMENT_LOCATION(10),
    ORDER_ORIGINATION_TRADER(11),
    EXECUTING_TRADER(12),
    ORDER_ORIGINATION_FIRM(13),
    GIVEUP_CLEARING_FIRM(14),
    CORRESPONDANT_CLEARING_FIRM(15),
    EXECUTING_SYSTEM(16),
    CONTRA_FIRM(17),
    CONTRA_CLEARING_FIRM(18),
    SPONSORING_FIRM(19),
    UNDERLYING_CONTRA_FIRM(20),
    CLEARING_ORGANIZATION(21),
    EXCHANGE(22),
    CUSTOMER_ACCOUNT(24),
    CORRESPONDENT_CLEARING_ORGANIZATION(25),
    CORRESPONDENT_BROKER(26),
    BUYER_SELLER(27),
    CUSTODIAN(28),
    INTERMEDIARY(29),
    AGENT(30),
    SUB_CUSTODIAN(31),
    BENEFICIARY(32),
    INTERESTED_PARTY(33),
    REGULATORY_BODY(34),
    LIQUIDITY_PROVIDER(35),
    ENTERING_TRADER(36),
    CONTRA_TRADER(37),
    POSITION_ACCOUNT(38),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    PartyRole(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(74);
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
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static PartyRole decode(final int representation)
    {
        switch(representation)
        {
        case 1: return EXECUTING_FIRM;
        case 2: return BROKER_OF_CREDIT;
        case 3: return CLIENT_ID;
        case 4: return CLEARING_FIRM;
        case 5: return INVESTOR_ID;
        case 6: return INTRODUCING_FIRM;
        case 7: return ENTERING_FIRM;
        case 8: return LOCATE_LENDING_FIRM;
        case 9: return FUND_MANAGER_CLIENT_ID;
        case 10: return SETTLEMENT_LOCATION;
        case 11: return ORDER_ORIGINATION_TRADER;
        case 12: return EXECUTING_TRADER;
        case 13: return ORDER_ORIGINATION_FIRM;
        case 14: return GIVEUP_CLEARING_FIRM;
        case 15: return CORRESPONDANT_CLEARING_FIRM;
        case 16: return EXECUTING_SYSTEM;
        case 17: return CONTRA_FIRM;
        case 18: return CONTRA_CLEARING_FIRM;
        case 19: return SPONSORING_FIRM;
        case 20: return UNDERLYING_CONTRA_FIRM;
        case 21: return CLEARING_ORGANIZATION;
        case 22: return EXCHANGE;
        case 24: return CUSTOMER_ACCOUNT;
        case 25: return CORRESPONDENT_CLEARING_ORGANIZATION;
        case 26: return CORRESPONDENT_BROKER;
        case 27: return BUYER_SELLER;
        case 28: return CUSTODIAN;
        case 29: return INTERMEDIARY;
        case 30: return AGENT;
        case 31: return SUB_CUSTODIAN;
        case 32: return BENEFICIARY;
        case 33: return INTERESTED_PARTY;
        case 34: return REGULATORY_BODY;
        case 35: return LIQUIDITY_PROVIDER;
        case 36: return ENTERING_TRADER;
        case 37: return CONTRA_TRADER;
        case 38: return POSITION_ACCOUNT;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
