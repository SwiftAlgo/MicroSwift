/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.StringRepresentable;
public enum MsgType implements StringRepresentable
{
    HEARTBEAT("0"),
    TEST_REQUEST("1"),
    RESEND_REQUEST("2"),
    REJECT("3"),
    SEQUENCE_RESET("4"),
    LOGOUT("5"),
    INDICATION_OF_INTEREST("6"),
    ADVERTISEMENT("7"),
    EXECUTION_REPORT("8"),
    ORDER_CANCEL_REJECT("9"),
    LOGON("A"),
    NEWS("B"),
    EMAIL("C"),
    ORDER_SINGLE("D"),
    ORDER_LIST("E"),
    ORDER_CANCEL_REQUEST("F"),
    ORDER_CANCEL_REPLACE_REQUEST("G"),
    ORDER_STATUS_REQUEST("H"),
    ALLOCATION_INSTRUCTION("J"),
    LIST_CANCEL_REQUEST("K"),
    LIST_EXECUTE("L"),
    LIST_STATUS_REQUEST("M"),
    LIST_STATUS("N"),
    ALLOCATION_INSTRUCTION_ACK("P"),
    DONT_KNOW_TRADE("Q"),
    QUOTE_REQUEST("R"),
    QUOTE("S"),
    SETTLEMENT_INSTRUCTIONS("T"),
    MARKET_DATA_REQUEST("V"),
    MARKET_DATA_SNAPSHOT_FULL_REFRESH("W"),
    MARKET_DATA_INCREMENTAL_REFRESH("X"),
    MARKET_DATA_REQUEST_REJECT("Y"),
    QUOTE_CANCEL("Z"),
    QUOTE_STATUS_REQUEST("a"),
    MASS_QUOTE_ACKNOWLEDGEMENT("b"),
    SECURITY_DEFINITION_REQUEST("c"),
    SECURITY_DEFINITION("d"),
    SECURITY_STATUS_REQUEST("e"),
    SECURITY_STATUS("f"),
    TRADING_SESSION_STATUS_REQUEST("g"),
    TRADING_SESSION_STATUS("h"),
    MASS_QUOTE("i"),
    BUSINESS_MESSAGE_REJECT("j"),
    BID_REQUEST("k"),
    BID_RESPONSE("l"),
    LIST_STRIKE_PRICE("m"),
    XML_MESSAGE("n"),
    REGISTRATION_INSTRUCTIONS("o"),
    REGISTRATION_INSTRUCTIONS_RESPONSE("p"),
    ORDER_MASS_CANCEL_REQUEST("q"),
    ORDER_MASS_CANCEL_REPORT("r"),
    NEW_ORDER_CROSS("s"),
    CROSS_ORDER_CANCEL_REPLACE_REQUEST("t"),
    CROSS_ORDER_CANCEL_REQUEST("u"),
    SECURITY_TYPE_REQUEST("v"),
    SECURITY_TYPES("w"),
    SECURITY_LIST_REQUEST("x"),
    SECURITY_LIST("y"),
    DERIVATIVE_SECURITY_LIST_REQUEST("z"),
    DERIVATIVE_SECURITY_LIST("AA"),
    NEW_ORDER_MULTILEG("AB"),
    MULTILEG_ORDER_CANCEL_REPLACE("AC"),
    TRADE_CAPTURE_REPORT_REQUEST("AD"),
    TRADE_CAPTURE_REPORT("AE"),
    ORDER_MASS_STATUS_REQUEST("AF"),
    QUOTE_REQUEST_REJECT("AG"),
    RFQ_REQUEST("AH"),
    QUOTE_STATUS_REPORT("AI"),
    QUOTE_RESPONSE("AJ"),
    CONFIRMATION("AK"),
    POSITION_MAINTENANCE_REQUEST("AL"),
    POSITION_MAINTENANCE_REPORT("AM"),
    REQUEST_FOR_POSITIONS("AN"),
    REQUEST_FOR_POSITIONS_ACK("AO"),
    POSITION_REPORT("AP"),
    TRADE_CAPTURE_REPORT_REQUEST_ACK("AQ"),
    TRADE_CAPTURE_REPORT_ACK("AR"),
    ALLOCATION_REPORT("AS"),
    ALLOCATION_REPORT_ACK("AT"),
    CONFIRMATION_ACK("AU"),
    SETTLEMENT_INSTRUCTION_REQUEST("AV"),
    ASSIGNMENT_REPORT("AW"),
    COLLATERAL_REQUEST("AX"),
    COLLATERAL_ASSIGNMENT("AY"),
    COLLATERAL_RESPONSE("AZ"),
    COLLATERAL_REPORT("BA"),
    COLLATERAL_INQUIRY("BB"),
    NETWORK_STATUS_REQUEST("BC"),
    NETWORK_STATUS_RESPONSE("BD"),
    USER_REQUEST("BE"),
    USER_RESPONSE("BF"),
    COLLATERAL_INQUIRY_ACK("BG"),
    CONFIRMATION_REQUEST("BH"),
    NULL_VAL(""),
    ARTIO_UNKNOWN("");

    private final String representation;

    MsgType(final String representation)
    {
         this.representation = representation;
    }

    public final String representation() { return representation; }

    private static final CharArrayMap<MsgType> charMap;
    static
    {
        final Map<String, MsgType> stringMap = new HashMap<>();
        stringMap.put("0", HEARTBEAT);
        stringMap.put("1", TEST_REQUEST);
        stringMap.put("2", RESEND_REQUEST);
        stringMap.put("3", REJECT);
        stringMap.put("4", SEQUENCE_RESET);
        stringMap.put("5", LOGOUT);
        stringMap.put("6", INDICATION_OF_INTEREST);
        stringMap.put("7", ADVERTISEMENT);
        stringMap.put("8", EXECUTION_REPORT);
        stringMap.put("9", ORDER_CANCEL_REJECT);
        stringMap.put("A", LOGON);
        stringMap.put("B", NEWS);
        stringMap.put("C", EMAIL);
        stringMap.put("D", ORDER_SINGLE);
        stringMap.put("E", ORDER_LIST);
        stringMap.put("F", ORDER_CANCEL_REQUEST);
        stringMap.put("G", ORDER_CANCEL_REPLACE_REQUEST);
        stringMap.put("H", ORDER_STATUS_REQUEST);
        stringMap.put("J", ALLOCATION_INSTRUCTION);
        stringMap.put("K", LIST_CANCEL_REQUEST);
        stringMap.put("L", LIST_EXECUTE);
        stringMap.put("M", LIST_STATUS_REQUEST);
        stringMap.put("N", LIST_STATUS);
        stringMap.put("P", ALLOCATION_INSTRUCTION_ACK);
        stringMap.put("Q", DONT_KNOW_TRADE);
        stringMap.put("R", QUOTE_REQUEST);
        stringMap.put("S", QUOTE);
        stringMap.put("T", SETTLEMENT_INSTRUCTIONS);
        stringMap.put("V", MARKET_DATA_REQUEST);
        stringMap.put("W", MARKET_DATA_SNAPSHOT_FULL_REFRESH);
        stringMap.put("X", MARKET_DATA_INCREMENTAL_REFRESH);
        stringMap.put("Y", MARKET_DATA_REQUEST_REJECT);
        stringMap.put("Z", QUOTE_CANCEL);
        stringMap.put("a", QUOTE_STATUS_REQUEST);
        stringMap.put("b", MASS_QUOTE_ACKNOWLEDGEMENT);
        stringMap.put("c", SECURITY_DEFINITION_REQUEST);
        stringMap.put("d", SECURITY_DEFINITION);
        stringMap.put("e", SECURITY_STATUS_REQUEST);
        stringMap.put("f", SECURITY_STATUS);
        stringMap.put("g", TRADING_SESSION_STATUS_REQUEST);
        stringMap.put("h", TRADING_SESSION_STATUS);
        stringMap.put("i", MASS_QUOTE);
        stringMap.put("j", BUSINESS_MESSAGE_REJECT);
        stringMap.put("k", BID_REQUEST);
        stringMap.put("l", BID_RESPONSE);
        stringMap.put("m", LIST_STRIKE_PRICE);
        stringMap.put("n", XML_MESSAGE);
        stringMap.put("o", REGISTRATION_INSTRUCTIONS);
        stringMap.put("p", REGISTRATION_INSTRUCTIONS_RESPONSE);
        stringMap.put("q", ORDER_MASS_CANCEL_REQUEST);
        stringMap.put("r", ORDER_MASS_CANCEL_REPORT);
        stringMap.put("s", NEW_ORDER_CROSS);
        stringMap.put("t", CROSS_ORDER_CANCEL_REPLACE_REQUEST);
        stringMap.put("u", CROSS_ORDER_CANCEL_REQUEST);
        stringMap.put("v", SECURITY_TYPE_REQUEST);
        stringMap.put("w", SECURITY_TYPES);
        stringMap.put("x", SECURITY_LIST_REQUEST);
        stringMap.put("y", SECURITY_LIST);
        stringMap.put("z", DERIVATIVE_SECURITY_LIST_REQUEST);
        stringMap.put("AA", DERIVATIVE_SECURITY_LIST);
        stringMap.put("AB", NEW_ORDER_MULTILEG);
        stringMap.put("AC", MULTILEG_ORDER_CANCEL_REPLACE);
        stringMap.put("AD", TRADE_CAPTURE_REPORT_REQUEST);
        stringMap.put("AE", TRADE_CAPTURE_REPORT);
        stringMap.put("AF", ORDER_MASS_STATUS_REQUEST);
        stringMap.put("AG", QUOTE_REQUEST_REJECT);
        stringMap.put("AH", RFQ_REQUEST);
        stringMap.put("AI", QUOTE_STATUS_REPORT);
        stringMap.put("AJ", QUOTE_RESPONSE);
        stringMap.put("AK", CONFIRMATION);
        stringMap.put("AL", POSITION_MAINTENANCE_REQUEST);
        stringMap.put("AM", POSITION_MAINTENANCE_REPORT);
        stringMap.put("AN", REQUEST_FOR_POSITIONS);
        stringMap.put("AO", REQUEST_FOR_POSITIONS_ACK);
        stringMap.put("AP", POSITION_REPORT);
        stringMap.put("AQ", TRADE_CAPTURE_REPORT_REQUEST_ACK);
        stringMap.put("AR", TRADE_CAPTURE_REPORT_ACK);
        stringMap.put("AS", ALLOCATION_REPORT);
        stringMap.put("AT", ALLOCATION_REPORT_ACK);
        stringMap.put("AU", CONFIRMATION_ACK);
        stringMap.put("AV", SETTLEMENT_INSTRUCTION_REQUEST);
        stringMap.put("AW", ASSIGNMENT_REPORT);
        stringMap.put("AX", COLLATERAL_REQUEST);
        stringMap.put("AY", COLLATERAL_ASSIGNMENT);
        stringMap.put("AZ", COLLATERAL_RESPONSE);
        stringMap.put("BA", COLLATERAL_REPORT);
        stringMap.put("BB", COLLATERAL_INQUIRY);
        stringMap.put("BC", NETWORK_STATUS_REQUEST);
        stringMap.put("BD", NETWORK_STATUS_RESPONSE);
        stringMap.put("BE", USER_REQUEST);
        stringMap.put("BF", USER_RESPONSE);
        stringMap.put("BG", COLLATERAL_INQUIRY_ACK);
        stringMap.put("BH", CONFIRMATION_REQUEST);
        charMap = new CharArrayMap<>(stringMap);
    }

    public static MsgType decode(final CharArrayWrapper key)
    {
        final MsgType value = charMap.get(key);
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
    public static MsgType decode(final String representation)
    {
        switch(representation)
        {
        case "0": return HEARTBEAT;
        case "1": return TEST_REQUEST;
        case "2": return RESEND_REQUEST;
        case "3": return REJECT;
        case "4": return SEQUENCE_RESET;
        case "5": return LOGOUT;
        case "6": return INDICATION_OF_INTEREST;
        case "7": return ADVERTISEMENT;
        case "8": return EXECUTION_REPORT;
        case "9": return ORDER_CANCEL_REJECT;
        case "A": return LOGON;
        case "B": return NEWS;
        case "C": return EMAIL;
        case "D": return ORDER_SINGLE;
        case "E": return ORDER_LIST;
        case "F": return ORDER_CANCEL_REQUEST;
        case "G": return ORDER_CANCEL_REPLACE_REQUEST;
        case "H": return ORDER_STATUS_REQUEST;
        case "J": return ALLOCATION_INSTRUCTION;
        case "K": return LIST_CANCEL_REQUEST;
        case "L": return LIST_EXECUTE;
        case "M": return LIST_STATUS_REQUEST;
        case "N": return LIST_STATUS;
        case "P": return ALLOCATION_INSTRUCTION_ACK;
        case "Q": return DONT_KNOW_TRADE;
        case "R": return QUOTE_REQUEST;
        case "S": return QUOTE;
        case "T": return SETTLEMENT_INSTRUCTIONS;
        case "V": return MARKET_DATA_REQUEST;
        case "W": return MARKET_DATA_SNAPSHOT_FULL_REFRESH;
        case "X": return MARKET_DATA_INCREMENTAL_REFRESH;
        case "Y": return MARKET_DATA_REQUEST_REJECT;
        case "Z": return QUOTE_CANCEL;
        case "a": return QUOTE_STATUS_REQUEST;
        case "b": return MASS_QUOTE_ACKNOWLEDGEMENT;
        case "c": return SECURITY_DEFINITION_REQUEST;
        case "d": return SECURITY_DEFINITION;
        case "e": return SECURITY_STATUS_REQUEST;
        case "f": return SECURITY_STATUS;
        case "g": return TRADING_SESSION_STATUS_REQUEST;
        case "h": return TRADING_SESSION_STATUS;
        case "i": return MASS_QUOTE;
        case "j": return BUSINESS_MESSAGE_REJECT;
        case "k": return BID_REQUEST;
        case "l": return BID_RESPONSE;
        case "m": return LIST_STRIKE_PRICE;
        case "n": return XML_MESSAGE;
        case "o": return REGISTRATION_INSTRUCTIONS;
        case "p": return REGISTRATION_INSTRUCTIONS_RESPONSE;
        case "q": return ORDER_MASS_CANCEL_REQUEST;
        case "r": return ORDER_MASS_CANCEL_REPORT;
        case "s": return NEW_ORDER_CROSS;
        case "t": return CROSS_ORDER_CANCEL_REPLACE_REQUEST;
        case "u": return CROSS_ORDER_CANCEL_REQUEST;
        case "v": return SECURITY_TYPE_REQUEST;
        case "w": return SECURITY_TYPES;
        case "x": return SECURITY_LIST_REQUEST;
        case "y": return SECURITY_LIST;
        case "z": return DERIVATIVE_SECURITY_LIST_REQUEST;
        case "AA": return DERIVATIVE_SECURITY_LIST;
        case "AB": return NEW_ORDER_MULTILEG;
        case "AC": return MULTILEG_ORDER_CANCEL_REPLACE;
        case "AD": return TRADE_CAPTURE_REPORT_REQUEST;
        case "AE": return TRADE_CAPTURE_REPORT;
        case "AF": return ORDER_MASS_STATUS_REQUEST;
        case "AG": return QUOTE_REQUEST_REJECT;
        case "AH": return RFQ_REQUEST;
        case "AI": return QUOTE_STATUS_REPORT;
        case "AJ": return QUOTE_RESPONSE;
        case "AK": return CONFIRMATION;
        case "AL": return POSITION_MAINTENANCE_REQUEST;
        case "AM": return POSITION_MAINTENANCE_REPORT;
        case "AN": return REQUEST_FOR_POSITIONS;
        case "AO": return REQUEST_FOR_POSITIONS_ACK;
        case "AP": return POSITION_REPORT;
        case "AQ": return TRADE_CAPTURE_REPORT_REQUEST_ACK;
        case "AR": return TRADE_CAPTURE_REPORT_ACK;
        case "AS": return ALLOCATION_REPORT;
        case "AT": return ALLOCATION_REPORT_ACK;
        case "AU": return CONFIRMATION_ACK;
        case "AV": return SETTLEMENT_INSTRUCTION_REQUEST;
        case "AW": return ASSIGNMENT_REPORT;
        case "AX": return COLLATERAL_REQUEST;
        case "AY": return COLLATERAL_ASSIGNMENT;
        case "AZ": return COLLATERAL_RESPONSE;
        case "BA": return COLLATERAL_REPORT;
        case "BB": return COLLATERAL_INQUIRY;
        case "BC": return NETWORK_STATUS_REQUEST;
        case "BD": return NETWORK_STATUS_RESPONSE;
        case "BE": return USER_REQUEST;
        case "BF": return USER_RESPONSE;
        case "BG": return COLLATERAL_INQUIRY_ACK;
        case "BH": return CONFIRMATION_REQUEST;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
