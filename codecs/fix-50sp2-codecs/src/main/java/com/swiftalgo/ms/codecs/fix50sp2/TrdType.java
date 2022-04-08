/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum TrdType implements IntRepresentable
{
    REGULAR_TRADE(0),
    BLOCK_TRADE(1),
    EFP(2),
    TRANSFER(3),
    LATE_TRADE(4),
    T_TRADE(5),
    WEIGHTED_AVERAGE_PRICE_TRADE(6),
    BUNCHED_TRADE(7),
    LATE_BUNCHED_TRADE(8),
    PRIOR_REFERENCE_PRICE_TRADE(9),
    AFTER_HOURS_TRADE(10),
    EXCHANGE_FOR_RISK(11),
    EXCHANGE_FOR_SWAP(12),
    EXCHANGE_OF_FUTURES_FOR(13),
    EXCHANGE_OF_OPTIONS_FOR_OPTIONS(14),
    TRADING_AT_SETTLEMENT(15),
    ALL_OR_NONE(16),
    FUTURES_LARGE_ORDER_EXECUTION(17),
    EXCHANGE_OF_FUTURES_FOR_FUTURES(18),
    OPTION_INTERIM_TRADE(19),
    OPTION_CABINET_TRADE(20),
    PRIVATELY_NEGOTIATED_TRADES(22),
    SUBSTITUTION_OF_FUTURES_FOR_FORWARDS(23),
    ERROR_TRADE(24),
    SPECIAL_CUM_DIVIDEND(25),
    SPECIAL_EX_DIVIDEND(26),
    SPECIAL_CUM_COUPON(27),
    SPECIAL_EX_COUPON(28),
    CASH_SETTLEMENT(29),
    SPECIAL_PRICE(30),
    GUARANTEED_DELIVERY(31),
    SPECIAL_CUM_RIGHTS(32),
    SPECIAL_EX_RIGHTS(33),
    SPECIAL_CUM_CAPITAL_REPAYMENTS(34),
    SPECIAL_EX_CAPITAL_REPAYMENTS(35),
    SPECIAL_CUM_BONUS(36),
    SPECIAL_EX_BONUS(37),
    BLOCK_TRADE_1(38),
    WORKED_PRINCIPAL_TRADE(39),
    BLOCK_TRADES_AFTER_MARKET(40),
    NAME_CHANGE(41),
    PORTFOLIO_TRANSFER(42),
    PROROGATION_BUY_EURONEXT_PARIS_ONLY_IS_USED_TO_DEFER_SETTLEMENT_UNDER_FRENCH_SRD_TRADES_MUST_BE_REPORTED_AS_CROSSES_AT_ZERO_PRICE(43),
    PROROGATION_SELL_SEE_PROROGATION_BUY(44),
    OPTION_EXERCISE(45),
    DELTA_NEUTRAL_TRANSACTION(46),
    FINANCING_TRANSACTION(47),
    NON_STANDARD_SETTLEMENT(48),
    DERIVATIVE_RELATED_TRANSACTION(49),
    PORTFOLIO_TRADE(50),
    VOLUME_WEIGHTED_AVERAGE_TRADE(51),
    EXCHANGE_GRANTED_TRADE(52),
    REPURCHASE_AGREEMENT(53),
    OTC(54),
    EXCHANGE_BASIS_FACILITY(55),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    TrdType(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(110);
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
        intSet.add(19);
        intSet.add(20);
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
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static TrdType decode(final int representation)
    {
        switch(representation)
        {
        case 0: return REGULAR_TRADE;
        case 1: return BLOCK_TRADE;
        case 2: return EFP;
        case 3: return TRANSFER;
        case 4: return LATE_TRADE;
        case 5: return T_TRADE;
        case 6: return WEIGHTED_AVERAGE_PRICE_TRADE;
        case 7: return BUNCHED_TRADE;
        case 8: return LATE_BUNCHED_TRADE;
        case 9: return PRIOR_REFERENCE_PRICE_TRADE;
        case 10: return AFTER_HOURS_TRADE;
        case 11: return EXCHANGE_FOR_RISK;
        case 12: return EXCHANGE_FOR_SWAP;
        case 13: return EXCHANGE_OF_FUTURES_FOR;
        case 14: return EXCHANGE_OF_OPTIONS_FOR_OPTIONS;
        case 15: return TRADING_AT_SETTLEMENT;
        case 16: return ALL_OR_NONE;
        case 17: return FUTURES_LARGE_ORDER_EXECUTION;
        case 18: return EXCHANGE_OF_FUTURES_FOR_FUTURES;
        case 19: return OPTION_INTERIM_TRADE;
        case 20: return OPTION_CABINET_TRADE;
        case 22: return PRIVATELY_NEGOTIATED_TRADES;
        case 23: return SUBSTITUTION_OF_FUTURES_FOR_FORWARDS;
        case 24: return ERROR_TRADE;
        case 25: return SPECIAL_CUM_DIVIDEND;
        case 26: return SPECIAL_EX_DIVIDEND;
        case 27: return SPECIAL_CUM_COUPON;
        case 28: return SPECIAL_EX_COUPON;
        case 29: return CASH_SETTLEMENT;
        case 30: return SPECIAL_PRICE;
        case 31: return GUARANTEED_DELIVERY;
        case 32: return SPECIAL_CUM_RIGHTS;
        case 33: return SPECIAL_EX_RIGHTS;
        case 34: return SPECIAL_CUM_CAPITAL_REPAYMENTS;
        case 35: return SPECIAL_EX_CAPITAL_REPAYMENTS;
        case 36: return SPECIAL_CUM_BONUS;
        case 37: return SPECIAL_EX_BONUS;
        case 38: return BLOCK_TRADE_1;
        case 39: return WORKED_PRINCIPAL_TRADE;
        case 40: return BLOCK_TRADES_AFTER_MARKET;
        case 41: return NAME_CHANGE;
        case 42: return PORTFOLIO_TRANSFER;
        case 43: return PROROGATION_BUY_EURONEXT_PARIS_ONLY_IS_USED_TO_DEFER_SETTLEMENT_UNDER_FRENCH_SRD_TRADES_MUST_BE_REPORTED_AS_CROSSES_AT_ZERO_PRICE;
        case 44: return PROROGATION_SELL_SEE_PROROGATION_BUY;
        case 45: return OPTION_EXERCISE;
        case 46: return DELTA_NEUTRAL_TRANSACTION;
        case 47: return FINANCING_TRANSACTION;
        case 48: return NON_STANDARD_SETTLEMENT;
        case 49: return DERIVATIVE_RELATED_TRANSACTION;
        case 50: return PORTFOLIO_TRADE;
        case 51: return VOLUME_WEIGHTED_AVERAGE_TRADE;
        case 52: return EXCHANGE_GRANTED_TRADE;
        case 53: return REPURCHASE_AGREEMENT;
        case 54: return OTC;
        case 55: return EXCHANGE_BASIS_FACILITY;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
