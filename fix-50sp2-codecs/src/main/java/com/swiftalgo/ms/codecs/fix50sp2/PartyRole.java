/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

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
    CONTRA_INVESTOR_ID(39),
    TRANSFER_TO_FIRM(40),
    CONTRA_POSITION_ACCOUNT(41),
    CONTRA_EXCHANGE(42),
    INTERNAL_CARRY_ACCOUNT(43),
    ORDER_ENTRY_OPERATOR_ID(44),
    SECONDARY_ACCOUNT_NUMBER(45),
    FOREIGN_FIRM(46),
    THIRD_PARTY_ALLOCATION_FIRM(47),
    CLAIMING_ACCOUNT(48),
    ASSET_MANAGER(49),
    PLEDGOR_ACCOUNT(50),
    PLEDGEE_ACCOUNT(51),
    LARGE_TRADER_REPORTABLE_ACCOUNT(52),
    TRADER_MNEMONIC(53),
    SENDER_LOCATION(54),
    SESSION_ID(55),
    ACCEPTABLE_COUNTERPARTY(56),
    UNACCEPTABLE_COUNTERPARTY(57),
    ENTERING_UNIT(58),
    EXECUTING_UNIT(59),
    INTRODUCING_BROKER(60),
    QUOTE_ORIGINATOR(61),
    REPORT_ORIGINATOR(62),
    SYSTEMATIC_INTERNALISER(63),
    MULTILATERAL_TRADING_FACILITY(64),
    REGULATED_MARKET(65),
    MARKET_MAKER(66),
    INVESTMENT_FIRM(67),
    HOST_COMPETENT_AUTHORITY(68),
    HOME_COMPETENT_AUTHORITY(69),
    COMPETENT_AUTHORITY_OF_THE_MOST_RELEVANT_MARKET_IN_TERMS_OF_LIQUIDITY(70),
    COMPETENT_AUTHORITY_OF_THE_TRANSACTION(71),
    REPORTING_INTERMEDIARY(72),
    EXECUTION_VENUE(73),
    MARKET_DATA_ENTRY_ORIGINATOR(74),
    LOCATION_ID(75),
    DESK_ID(76),
    MARKET_DATA_MARKET(77),
    ALLOCATION_ENTITY(78),
    PRIME_BROKER_PROVIDING_GENERAL_TRADE_SERVICES(79),
    STEP_OUT_FIRM(80),
    BROKERCLEARINGID(81),
    CENTRAL_REGISTRATION_DEPOSITORY(82),
    CLEARING_ACCOUNT(83),
    ACCEPTABLE_SETTLING_COUNTERPARTY(84),
    UNACCEPTABLE_SETTLING_COUNTERPARTY(85),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    PartyRole(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(168);
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
        intSet.add(39);
        intSet.add(40);
        intSet.add(41);
        intSet.add(42);
        intSet.add(43);
        intSet.add(44);
        intSet.add(45);
        intSet.add(46);
        intSet.add(47);
        intSet.add(48);
        intSet.add(49);
        intSet.add(50);
        intSet.add(51);
        intSet.add(52);
        intSet.add(53);
        intSet.add(54);
        intSet.add(55);
        intSet.add(56);
        intSet.add(57);
        intSet.add(58);
        intSet.add(59);
        intSet.add(60);
        intSet.add(61);
        intSet.add(62);
        intSet.add(63);
        intSet.add(64);
        intSet.add(65);
        intSet.add(66);
        intSet.add(67);
        intSet.add(68);
        intSet.add(69);
        intSet.add(70);
        intSet.add(71);
        intSet.add(72);
        intSet.add(73);
        intSet.add(74);
        intSet.add(75);
        intSet.add(76);
        intSet.add(77);
        intSet.add(78);
        intSet.add(79);
        intSet.add(80);
        intSet.add(81);
        intSet.add(82);
        intSet.add(83);
        intSet.add(84);
        intSet.add(85);
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
        case 39: return CONTRA_INVESTOR_ID;
        case 40: return TRANSFER_TO_FIRM;
        case 41: return CONTRA_POSITION_ACCOUNT;
        case 42: return CONTRA_EXCHANGE;
        case 43: return INTERNAL_CARRY_ACCOUNT;
        case 44: return ORDER_ENTRY_OPERATOR_ID;
        case 45: return SECONDARY_ACCOUNT_NUMBER;
        case 46: return FOREIGN_FIRM;
        case 47: return THIRD_PARTY_ALLOCATION_FIRM;
        case 48: return CLAIMING_ACCOUNT;
        case 49: return ASSET_MANAGER;
        case 50: return PLEDGOR_ACCOUNT;
        case 51: return PLEDGEE_ACCOUNT;
        case 52: return LARGE_TRADER_REPORTABLE_ACCOUNT;
        case 53: return TRADER_MNEMONIC;
        case 54: return SENDER_LOCATION;
        case 55: return SESSION_ID;
        case 56: return ACCEPTABLE_COUNTERPARTY;
        case 57: return UNACCEPTABLE_COUNTERPARTY;
        case 58: return ENTERING_UNIT;
        case 59: return EXECUTING_UNIT;
        case 60: return INTRODUCING_BROKER;
        case 61: return QUOTE_ORIGINATOR;
        case 62: return REPORT_ORIGINATOR;
        case 63: return SYSTEMATIC_INTERNALISER;
        case 64: return MULTILATERAL_TRADING_FACILITY;
        case 65: return REGULATED_MARKET;
        case 66: return MARKET_MAKER;
        case 67: return INVESTMENT_FIRM;
        case 68: return HOST_COMPETENT_AUTHORITY;
        case 69: return HOME_COMPETENT_AUTHORITY;
        case 70: return COMPETENT_AUTHORITY_OF_THE_MOST_RELEVANT_MARKET_IN_TERMS_OF_LIQUIDITY;
        case 71: return COMPETENT_AUTHORITY_OF_THE_TRANSACTION;
        case 72: return REPORTING_INTERMEDIARY;
        case 73: return EXECUTION_VENUE;
        case 74: return MARKET_DATA_ENTRY_ORIGINATOR;
        case 75: return LOCATION_ID;
        case 76: return DESK_ID;
        case 77: return MARKET_DATA_MARKET;
        case 78: return ALLOCATION_ENTITY;
        case 79: return PRIME_BROKER_PROVIDING_GENERAL_TRADE_SERVICES;
        case 80: return STEP_OUT_FIRM;
        case 81: return BROKERCLEARINGID;
        case 82: return CENTRAL_REGISTRATION_DEPOSITORY;
        case 83: return CLEARING_ACCOUNT;
        case 84: return ACCEPTABLE_SETTLING_COUNTERPARTY;
        case 85: return UNACCEPTABLE_SETTLING_COUNTERPARTY;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
