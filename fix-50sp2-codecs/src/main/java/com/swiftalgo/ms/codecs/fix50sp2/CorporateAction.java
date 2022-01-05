/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.StringRepresentable;
public enum CorporateAction implements StringRepresentable
{
    EX_DIVIDEND("A"),
    EX_DISTRIBUTION("B"),
    EX_RIGHTS("C"),
    NEW("D"),
    EX_INTEREST("E"),
    CASH_DIVIDEND("F"),
    STOCK_DIVIDEND("G"),
    NON_INTEGER_STOCK_SPLIT("H"),
    REVERSE_STOCK_SPLIT("I"),
    STANDARD_INTEGER_STOCK_SPLIT("J"),
    POSITION_CONSOLIDATION("K"),
    LIQUIDATION_REORGANIZATION("L"),
    MERGER_REORGANIZATION("M"),
    RIGHTS_OFFERING("N"),
    SHAREHOLDER_MEETING("O"),
    SPINOFF("P"),
    TENDER_OFFER("Q"),
    WARRANT("R"),
    SPECIAL_ACTION("S"),
    SYMBOL_CONVERSION("T"),
    CUSIP_NAME_CHANGE("U"),
    LEAP_ROLLOVER("V"),
    SUCCESSION_EVENT("W"),
    NULL_VAL(""),
    ARTIO_UNKNOWN("");

    private final String representation;

    CorporateAction(final String representation)
    {
         this.representation = representation;
    }

    public final String representation() { return representation; }

    private static final CharArrayMap<CorporateAction> charMap;
    static
    {
        final Map<String, CorporateAction> stringMap = new HashMap<>();
        stringMap.put("A", EX_DIVIDEND);
        stringMap.put("B", EX_DISTRIBUTION);
        stringMap.put("C", EX_RIGHTS);
        stringMap.put("D", NEW);
        stringMap.put("E", EX_INTEREST);
        stringMap.put("F", CASH_DIVIDEND);
        stringMap.put("G", STOCK_DIVIDEND);
        stringMap.put("H", NON_INTEGER_STOCK_SPLIT);
        stringMap.put("I", REVERSE_STOCK_SPLIT);
        stringMap.put("J", STANDARD_INTEGER_STOCK_SPLIT);
        stringMap.put("K", POSITION_CONSOLIDATION);
        stringMap.put("L", LIQUIDATION_REORGANIZATION);
        stringMap.put("M", MERGER_REORGANIZATION);
        stringMap.put("N", RIGHTS_OFFERING);
        stringMap.put("O", SHAREHOLDER_MEETING);
        stringMap.put("P", SPINOFF);
        stringMap.put("Q", TENDER_OFFER);
        stringMap.put("R", WARRANT);
        stringMap.put("S", SPECIAL_ACTION);
        stringMap.put("T", SYMBOL_CONVERSION);
        stringMap.put("U", CUSIP_NAME_CHANGE);
        stringMap.put("V", LEAP_ROLLOVER);
        stringMap.put("W", SUCCESSION_EVENT);
        charMap = new CharArrayMap<>(stringMap);
    }

    public static CorporateAction decode(final CharArrayWrapper key)
    {
        final CorporateAction value = charMap.get(key);
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
    public static CorporateAction decode(final String representation)
    {
        switch(representation)
        {
        case "A": return EX_DIVIDEND;
        case "B": return EX_DISTRIBUTION;
        case "C": return EX_RIGHTS;
        case "D": return NEW;
        case "E": return EX_INTEREST;
        case "F": return CASH_DIVIDEND;
        case "G": return STOCK_DIVIDEND;
        case "H": return NON_INTEGER_STOCK_SPLIT;
        case "I": return REVERSE_STOCK_SPLIT;
        case "J": return STANDARD_INTEGER_STOCK_SPLIT;
        case "K": return POSITION_CONSOLIDATION;
        case "L": return LIQUIDATION_REORGANIZATION;
        case "M": return MERGER_REORGANIZATION;
        case "N": return RIGHTS_OFFERING;
        case "O": return SHAREHOLDER_MEETING;
        case "P": return SPINOFF;
        case "Q": return TENDER_OFFER;
        case "R": return WARRANT;
        case "S": return SPECIAL_ACTION;
        case "T": return SYMBOL_CONVERSION;
        case "U": return CUSIP_NAME_CHANGE;
        case "V": return LEAP_ROLLOVER;
        case "W": return SUCCESSION_EVENT;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
