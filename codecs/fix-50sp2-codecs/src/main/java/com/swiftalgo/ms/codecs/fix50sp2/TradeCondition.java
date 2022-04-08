/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.StringRepresentable;
public enum TradeCondition implements StringRepresentable
{
    CASH_MARKET("A"),
    AVERAGE_PRICE_TRADE("B"),
    CASH_TRADE("C"),
    NEXT_DAY_MARKET("D"),
    OPENING_REOPENING_TRADE_DETAIL("E"),
    INTRADAY_TRADE_DETAIL("F"),
    RULE_127_TRADE("G"),
    RULE_155_TRADE("H"),
    SOLD_LAST("I"),
    NEXT_DAY_TRADE("J"),
    OPENED("K"),
    SELLER("L"),
    SOLD("M"),
    STOPPED_STOCK("N"),
    IMBALANCE_MORE_BUYERS("P"),
    IMBALANCE_MORE_SELLERS("Q"),
    OPENING_PRICE("R"),
    BARGAIN_CONDITION("S"),
    CONVERTED_PRICE_INDICATOR("T"),
    EXCHANGE_LAST("U"),
    FINAL_PRICE_OF_SESSION("V"),
    EX_PIT("W"),
    CROSSED("X"),
    TRADES_RESULTING_FROM_MANUAL_SLOW_QUOTE("Y"),
    TRADES_RESULTING_FROM_INTERMARKET_SWEEP("Z"),
    VOLUME_ONLY("a"),
    DIRECT_PLUS("b"),
    ACQUISITION("c"),
    BUNCHED("d"),
    DISTRIBUTION("e"),
    BUNCHED_SALE("f"),
    SPLIT_TRADE("g"),
    CANCEL_STOPPED("h"),
    CANCEL_ETH("i"),
    CANCEL_STOPPED_ETH("j"),
    OUT_OF_SEQUENCE_ETH("k"),
    CANCEL_LAST_ETH("l"),
    SOLD_LAST_SALE_ETH("m"),
    CANCEL_LAST("n"),
    SOLD_LAST_SALE("o"),
    CANCEL_OPEN("p"),
    CANCEL_OPEN_ETH("q"),
    OPENED_SALE_ETH("r"),
    CANCEL_ONLY("s"),
    CANCEL_ONLY_ETH("t"),
    LATE_OPEN_ETH("u"),
    AUTO_EXECUTION_ETH("v"),
    REOPEN("w"),
    REOPEN_ETH("x"),
    ADJUSTED("y"),
    ADJUSTED_ETH("z"),
    SPREAD("AA"),
    SPREAD_ETH("AB"),
    STRADDLE("AC"),
    STRADDLE_ETH("AD"),
    STOPPED("AE"),
    STOPPED_ETH("AF"),
    REGULAR_ETH("AG"),
    COMBO("AH"),
    COMBO_ETH("AI"),
    OFFICIAL_CLOSING_PRICE("AJ"),
    PRIOR_REFERENCE_PRICE("AK"),
    CANCEL("0"),
    STOPPED_SOLD_LAST("AL"),
    STOPPED_OUT_OF_SEQUENCE("AM"),
    OFFICAL_CLOSING_PRICE("AN"),
    CROSSED_1("AO"),
    FAST_MARKET("AP"),
    AUTOMATIC_EXECUTION("AQ"),
    FORM_T("AR"),
    BASKET_INDEX("AS"),
    BURST_BASKET("AT"),
    OUTSIDE_SPREAD("AV"),
    IMPLIED_TRADE("1"),
    MARKETPLACE_ENTERED_TRADE("2"),
    MULT_ASSET_CLASS_MULTILEG_TRADE("3"),
    MULTILEG_TO_MULTILEG_TRADE("4"),
    NULL_VAL(""),
    ARTIO_UNKNOWN("");

    private final String representation;

    TradeCondition(final String representation)
    {
         this.representation = representation;
    }

    public final String representation() { return representation; }

    private static final CharArrayMap<TradeCondition> charMap;
    static
    {
        final Map<String, TradeCondition> stringMap = new HashMap<>();
        stringMap.put("A", CASH_MARKET);
        stringMap.put("B", AVERAGE_PRICE_TRADE);
        stringMap.put("C", CASH_TRADE);
        stringMap.put("D", NEXT_DAY_MARKET);
        stringMap.put("E", OPENING_REOPENING_TRADE_DETAIL);
        stringMap.put("F", INTRADAY_TRADE_DETAIL);
        stringMap.put("G", RULE_127_TRADE);
        stringMap.put("H", RULE_155_TRADE);
        stringMap.put("I", SOLD_LAST);
        stringMap.put("J", NEXT_DAY_TRADE);
        stringMap.put("K", OPENED);
        stringMap.put("L", SELLER);
        stringMap.put("M", SOLD);
        stringMap.put("N", STOPPED_STOCK);
        stringMap.put("P", IMBALANCE_MORE_BUYERS);
        stringMap.put("Q", IMBALANCE_MORE_SELLERS);
        stringMap.put("R", OPENING_PRICE);
        stringMap.put("S", BARGAIN_CONDITION);
        stringMap.put("T", CONVERTED_PRICE_INDICATOR);
        stringMap.put("U", EXCHANGE_LAST);
        stringMap.put("V", FINAL_PRICE_OF_SESSION);
        stringMap.put("W", EX_PIT);
        stringMap.put("X", CROSSED);
        stringMap.put("Y", TRADES_RESULTING_FROM_MANUAL_SLOW_QUOTE);
        stringMap.put("Z", TRADES_RESULTING_FROM_INTERMARKET_SWEEP);
        stringMap.put("a", VOLUME_ONLY);
        stringMap.put("b", DIRECT_PLUS);
        stringMap.put("c", ACQUISITION);
        stringMap.put("d", BUNCHED);
        stringMap.put("e", DISTRIBUTION);
        stringMap.put("f", BUNCHED_SALE);
        stringMap.put("g", SPLIT_TRADE);
        stringMap.put("h", CANCEL_STOPPED);
        stringMap.put("i", CANCEL_ETH);
        stringMap.put("j", CANCEL_STOPPED_ETH);
        stringMap.put("k", OUT_OF_SEQUENCE_ETH);
        stringMap.put("l", CANCEL_LAST_ETH);
        stringMap.put("m", SOLD_LAST_SALE_ETH);
        stringMap.put("n", CANCEL_LAST);
        stringMap.put("o", SOLD_LAST_SALE);
        stringMap.put("p", CANCEL_OPEN);
        stringMap.put("q", CANCEL_OPEN_ETH);
        stringMap.put("r", OPENED_SALE_ETH);
        stringMap.put("s", CANCEL_ONLY);
        stringMap.put("t", CANCEL_ONLY_ETH);
        stringMap.put("u", LATE_OPEN_ETH);
        stringMap.put("v", AUTO_EXECUTION_ETH);
        stringMap.put("w", REOPEN);
        stringMap.put("x", REOPEN_ETH);
        stringMap.put("y", ADJUSTED);
        stringMap.put("z", ADJUSTED_ETH);
        stringMap.put("AA", SPREAD);
        stringMap.put("AB", SPREAD_ETH);
        stringMap.put("AC", STRADDLE);
        stringMap.put("AD", STRADDLE_ETH);
        stringMap.put("AE", STOPPED);
        stringMap.put("AF", STOPPED_ETH);
        stringMap.put("AG", REGULAR_ETH);
        stringMap.put("AH", COMBO);
        stringMap.put("AI", COMBO_ETH);
        stringMap.put("AJ", OFFICIAL_CLOSING_PRICE);
        stringMap.put("AK", PRIOR_REFERENCE_PRICE);
        stringMap.put("0", CANCEL);
        stringMap.put("AL", STOPPED_SOLD_LAST);
        stringMap.put("AM", STOPPED_OUT_OF_SEQUENCE);
        stringMap.put("AN", OFFICAL_CLOSING_PRICE);
        stringMap.put("AO", CROSSED_1);
        stringMap.put("AP", FAST_MARKET);
        stringMap.put("AQ", AUTOMATIC_EXECUTION);
        stringMap.put("AR", FORM_T);
        stringMap.put("AS", BASKET_INDEX);
        stringMap.put("AT", BURST_BASKET);
        stringMap.put("AV", OUTSIDE_SPREAD);
        stringMap.put("1", IMPLIED_TRADE);
        stringMap.put("2", MARKETPLACE_ENTERED_TRADE);
        stringMap.put("3", MULT_ASSET_CLASS_MULTILEG_TRADE);
        stringMap.put("4", MULTILEG_TO_MULTILEG_TRADE);
        charMap = new CharArrayMap<>(stringMap);
    }

    public static TradeCondition decode(final CharArrayWrapper key)
    {
        final TradeCondition value = charMap.get(key);
        if (value == null)
        {
            return ARTIO_UNKNOWN;
        }
        return value;
    }
    public static boolean isValid(final CharArrayWrapper key)
    {
        return charMap.containsKey(key);
    }
    public static TradeCondition decode(final String representation)
    {
        switch(representation)
        {
        case "A": return CASH_MARKET;
        case "B": return AVERAGE_PRICE_TRADE;
        case "C": return CASH_TRADE;
        case "D": return NEXT_DAY_MARKET;
        case "E": return OPENING_REOPENING_TRADE_DETAIL;
        case "F": return INTRADAY_TRADE_DETAIL;
        case "G": return RULE_127_TRADE;
        case "H": return RULE_155_TRADE;
        case "I": return SOLD_LAST;
        case "J": return NEXT_DAY_TRADE;
        case "K": return OPENED;
        case "L": return SELLER;
        case "M": return SOLD;
        case "N": return STOPPED_STOCK;
        case "P": return IMBALANCE_MORE_BUYERS;
        case "Q": return IMBALANCE_MORE_SELLERS;
        case "R": return OPENING_PRICE;
        case "S": return BARGAIN_CONDITION;
        case "T": return CONVERTED_PRICE_INDICATOR;
        case "U": return EXCHANGE_LAST;
        case "V": return FINAL_PRICE_OF_SESSION;
        case "W": return EX_PIT;
        case "X": return CROSSED;
        case "Y": return TRADES_RESULTING_FROM_MANUAL_SLOW_QUOTE;
        case "Z": return TRADES_RESULTING_FROM_INTERMARKET_SWEEP;
        case "a": return VOLUME_ONLY;
        case "b": return DIRECT_PLUS;
        case "c": return ACQUISITION;
        case "d": return BUNCHED;
        case "e": return DISTRIBUTION;
        case "f": return BUNCHED_SALE;
        case "g": return SPLIT_TRADE;
        case "h": return CANCEL_STOPPED;
        case "i": return CANCEL_ETH;
        case "j": return CANCEL_STOPPED_ETH;
        case "k": return OUT_OF_SEQUENCE_ETH;
        case "l": return CANCEL_LAST_ETH;
        case "m": return SOLD_LAST_SALE_ETH;
        case "n": return CANCEL_LAST;
        case "o": return SOLD_LAST_SALE;
        case "p": return CANCEL_OPEN;
        case "q": return CANCEL_OPEN_ETH;
        case "r": return OPENED_SALE_ETH;
        case "s": return CANCEL_ONLY;
        case "t": return CANCEL_ONLY_ETH;
        case "u": return LATE_OPEN_ETH;
        case "v": return AUTO_EXECUTION_ETH;
        case "w": return REOPEN;
        case "x": return REOPEN_ETH;
        case "y": return ADJUSTED;
        case "z": return ADJUSTED_ETH;
        case "AA": return SPREAD;
        case "AB": return SPREAD_ETH;
        case "AC": return STRADDLE;
        case "AD": return STRADDLE_ETH;
        case "AE": return STOPPED;
        case "AF": return STOPPED_ETH;
        case "AG": return REGULAR_ETH;
        case "AH": return COMBO;
        case "AI": return COMBO_ETH;
        case "AJ": return OFFICIAL_CLOSING_PRICE;
        case "AK": return PRIOR_REFERENCE_PRICE;
        case "0": return CANCEL;
        case "AL": return STOPPED_SOLD_LAST;
        case "AM": return STOPPED_OUT_OF_SEQUENCE;
        case "AN": return OFFICAL_CLOSING_PRICE;
        case "AO": return CROSSED_1;
        case "AP": return FAST_MARKET;
        case "AQ": return AUTOMATIC_EXECUTION;
        case "AR": return FORM_T;
        case "AS": return BASKET_INDEX;
        case "AT": return BURST_BASKET;
        case "AV": return OUTSIDE_SPREAD;
        case "1": return IMPLIED_TRADE;
        case "2": return MARKETPLACE_ENTERED_TRADE;
        case "3": return MULT_ASSET_CLASS_MULTILEG_TRADE;
        case "4": return MULTILEG_TO_MULTILEG_TRADE;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
