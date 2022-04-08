/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.StringRepresentable;
public enum MsgType implements StringRepresentable
{
    HEARTBEAT("0"),
    TESTREQUEST("1"),
    RESENDREQUEST("2"),
    REJECT("3"),
    SEQUENCERESET("4"),
    LOGOUT("5"),
    IOI("6"),
    ADVERTISEMENT("7"),
    EXECUTIONREPORT("8"),
    ORDERCANCELREJECT("9"),
    LOGON("A"),
    DERIVATIVESECURITYLIST("AA"),
    NEWORDERMULTILEG("AB"),
    MULTILEGORDERCANCELREPLACE("AC"),
    TRADECAPTUREREPORTREQUEST("AD"),
    TRADECAPTUREREPORT("AE"),
    ORDERMASSSTATUSREQUEST("AF"),
    QUOTEREQUESTREJECT("AG"),
    RFQREQUEST("AH"),
    QUOTESTATUSREPORT("AI"),
    QUOTERESPONSE("AJ"),
    CONFIRMATION("AK"),
    POSITIONMAINTENANCEREQUEST("AL"),
    POSITIONMAINTENANCEREPORT("AM"),
    REQUESTFORPOSITIONS("AN"),
    REQUESTFORPOSITIONSACK("AO"),
    POSITIONREPORT("AP"),
    TRADECAPTUREREPORTREQUESTACK("AQ"),
    TRADECAPTUREREPORTACK("AR"),
    ALLOCATIONREPORT("AS"),
    ALLOCATIONREPORTACK("AT"),
    CONFIRMATIONACK("AU"),
    SETTLEMENTINSTRUCTIONREQUEST("AV"),
    ASSIGNMENTREPORT("AW"),
    COLLATERALREQUEST("AX"),
    COLLATERALASSIGNMENT("AY"),
    COLLATERALRESPONSE("AZ"),
    NEWS("B"),
    COLLATERALREPORT("BA"),
    COLLATERALINQUIRY("BB"),
    NETWORKCOUNTERPARTYSYSTEMSTATUSREQUEST("BC"),
    NETWORKCOUNTERPARTYSYSTEMSTATUSRESPONSE("BD"),
    USERREQUEST("BE"),
    USERRESPONSE("BF"),
    COLLATERALINQUIRYACK("BG"),
    CONFIRMATIONREQUEST("BH"),
    TRADINGSESSIONLISTREQUEST("BI"),
    TRADINGSESSIONLIST("BJ"),
    SECURITYLISTUPDATEREPORT("BK"),
    ADJUSTEDPOSITIONREPORT("BL"),
    ALLOCATIONINSTRUCTIONALERT("BM"),
    EXECUTIONACKNOWLEDGEMENT("BN"),
    CONTRARYINTENTIONREPORT("BO"),
    SECURITYDEFINITIONUPDATEREPORT("BP"),
    SETTLEMENTOBLIGATIONREPORT("BQ"),
    DERIVATIVESECURITYLISTUPDATEREPORT("BR"),
    TRADINGSESSIONLISTUPDATEREPORT("BS"),
    MARKETDEFINITIONREQUEST("BT"),
    MARKETDEFINITION("BU"),
    MARKETDEFINITIONUPDATEREPORT("BV"),
    APPLICATIONMESSAGEREQUEST("BW"),
    APPLICATIONMESSAGEREQUESTACK("BX"),
    APPLICATIONMESSAGEREPORT("BY"),
    ORDERMASSACTIONREPORT("BZ"),
    EMAIL("C"),
    ORDERMASSACTIONREQUEST("CA"),
    USERNOTIFICATION("CB"),
    STREAMASSIGNMENTREQUEST("CC"),
    STREAMASSIGNMENTREPORT("CD"),
    STREAMASSIGNMENTREPORTACK("CE"),
    NEWORDERSINGLE("D"),
    NEWORDERLIST("E"),
    ORDERCANCELREQUEST("F"),
    ORDERCANCELREPLACEREQUEST("G"),
    ORDERSTATUSREQUEST("H"),
    ALLOCATIONINSTRUCTION("J"),
    LISTCANCELREQUEST("K"),
    LISTEXECUTE("L"),
    LISTSTATUSREQUEST("M"),
    LISTSTATUS("N"),
    ALLOCATIONINSTRUCTIONACK("P"),
    DONTKNOWTRADE("Q"),
    QUOTEREQUEST("R"),
    QUOTE("S"),
    SETTLEMENTINSTRUCTIONS("T"),
    MARKETDATAREQUEST("V"),
    MARKETDATASNAPSHOTFULLREFRESH("W"),
    MARKETDATAINCREMENTALREFRESH("X"),
    MARKETDATAREQUESTREJECT("Y"),
    QUOTECANCEL("Z"),
    QUOTESTATUSREQUEST("a"),
    MASSQUOTEACKNOWLEDGEMENT("b"),
    SECURITYDEFINITIONREQUEST("c"),
    SECURITYDEFINITION("d"),
    SECURITYSTATUSREQUEST("e"),
    SECURITYSTATUS("f"),
    TRADINGSESSIONSTATUSREQUEST("g"),
    TRADINGSESSIONSTATUS("h"),
    MASSQUOTE("i"),
    BUSINESSMESSAGEREJECT("j"),
    BIDREQUEST("k"),
    BIDRESPONSE("l"),
    LISTSTRIKEPRICE("m"),
    XMLNONFIX("n"),
    REGISTRATIONINSTRUCTIONS("o"),
    REGISTRATIONINSTRUCTIONSRESPONSE("p"),
    ORDERMASSCANCELREQUEST("q"),
    ORDERMASSCANCELREPORT("r"),
    NEWORDERCROSS("s"),
    CROSSORDERCANCELREPLACEREQUEST("t"),
    CROSSORDERCANCELREQUEST("u"),
    SECURITYTYPEREQUEST("v"),
    SECURITYTYPES("w"),
    SECURITYLISTREQUEST("x"),
    SECURITYLIST("y"),
    DERIVATIVESECURITYLISTREQUEST("z"),
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
        stringMap.put("1", TESTREQUEST);
        stringMap.put("2", RESENDREQUEST);
        stringMap.put("3", REJECT);
        stringMap.put("4", SEQUENCERESET);
        stringMap.put("5", LOGOUT);
        stringMap.put("6", IOI);
        stringMap.put("7", ADVERTISEMENT);
        stringMap.put("8", EXECUTIONREPORT);
        stringMap.put("9", ORDERCANCELREJECT);
        stringMap.put("A", LOGON);
        stringMap.put("AA", DERIVATIVESECURITYLIST);
        stringMap.put("AB", NEWORDERMULTILEG);
        stringMap.put("AC", MULTILEGORDERCANCELREPLACE);
        stringMap.put("AD", TRADECAPTUREREPORTREQUEST);
        stringMap.put("AE", TRADECAPTUREREPORT);
        stringMap.put("AF", ORDERMASSSTATUSREQUEST);
        stringMap.put("AG", QUOTEREQUESTREJECT);
        stringMap.put("AH", RFQREQUEST);
        stringMap.put("AI", QUOTESTATUSREPORT);
        stringMap.put("AJ", QUOTERESPONSE);
        stringMap.put("AK", CONFIRMATION);
        stringMap.put("AL", POSITIONMAINTENANCEREQUEST);
        stringMap.put("AM", POSITIONMAINTENANCEREPORT);
        stringMap.put("AN", REQUESTFORPOSITIONS);
        stringMap.put("AO", REQUESTFORPOSITIONSACK);
        stringMap.put("AP", POSITIONREPORT);
        stringMap.put("AQ", TRADECAPTUREREPORTREQUESTACK);
        stringMap.put("AR", TRADECAPTUREREPORTACK);
        stringMap.put("AS", ALLOCATIONREPORT);
        stringMap.put("AT", ALLOCATIONREPORTACK);
        stringMap.put("AU", CONFIRMATIONACK);
        stringMap.put("AV", SETTLEMENTINSTRUCTIONREQUEST);
        stringMap.put("AW", ASSIGNMENTREPORT);
        stringMap.put("AX", COLLATERALREQUEST);
        stringMap.put("AY", COLLATERALASSIGNMENT);
        stringMap.put("AZ", COLLATERALRESPONSE);
        stringMap.put("B", NEWS);
        stringMap.put("BA", COLLATERALREPORT);
        stringMap.put("BB", COLLATERALINQUIRY);
        stringMap.put("BC", NETWORKCOUNTERPARTYSYSTEMSTATUSREQUEST);
        stringMap.put("BD", NETWORKCOUNTERPARTYSYSTEMSTATUSRESPONSE);
        stringMap.put("BE", USERREQUEST);
        stringMap.put("BF", USERRESPONSE);
        stringMap.put("BG", COLLATERALINQUIRYACK);
        stringMap.put("BH", CONFIRMATIONREQUEST);
        stringMap.put("BI", TRADINGSESSIONLISTREQUEST);
        stringMap.put("BJ", TRADINGSESSIONLIST);
        stringMap.put("BK", SECURITYLISTUPDATEREPORT);
        stringMap.put("BL", ADJUSTEDPOSITIONREPORT);
        stringMap.put("BM", ALLOCATIONINSTRUCTIONALERT);
        stringMap.put("BN", EXECUTIONACKNOWLEDGEMENT);
        stringMap.put("BO", CONTRARYINTENTIONREPORT);
        stringMap.put("BP", SECURITYDEFINITIONUPDATEREPORT);
        stringMap.put("BQ", SETTLEMENTOBLIGATIONREPORT);
        stringMap.put("BR", DERIVATIVESECURITYLISTUPDATEREPORT);
        stringMap.put("BS", TRADINGSESSIONLISTUPDATEREPORT);
        stringMap.put("BT", MARKETDEFINITIONREQUEST);
        stringMap.put("BU", MARKETDEFINITION);
        stringMap.put("BV", MARKETDEFINITIONUPDATEREPORT);
        stringMap.put("BW", APPLICATIONMESSAGEREQUEST);
        stringMap.put("BX", APPLICATIONMESSAGEREQUESTACK);
        stringMap.put("BY", APPLICATIONMESSAGEREPORT);
        stringMap.put("BZ", ORDERMASSACTIONREPORT);
        stringMap.put("C", EMAIL);
        stringMap.put("CA", ORDERMASSACTIONREQUEST);
        stringMap.put("CB", USERNOTIFICATION);
        stringMap.put("CC", STREAMASSIGNMENTREQUEST);
        stringMap.put("CD", STREAMASSIGNMENTREPORT);
        stringMap.put("CE", STREAMASSIGNMENTREPORTACK);
        stringMap.put("D", NEWORDERSINGLE);
        stringMap.put("E", NEWORDERLIST);
        stringMap.put("F", ORDERCANCELREQUEST);
        stringMap.put("G", ORDERCANCELREPLACEREQUEST);
        stringMap.put("H", ORDERSTATUSREQUEST);
        stringMap.put("J", ALLOCATIONINSTRUCTION);
        stringMap.put("K", LISTCANCELREQUEST);
        stringMap.put("L", LISTEXECUTE);
        stringMap.put("M", LISTSTATUSREQUEST);
        stringMap.put("N", LISTSTATUS);
        stringMap.put("P", ALLOCATIONINSTRUCTIONACK);
        stringMap.put("Q", DONTKNOWTRADE);
        stringMap.put("R", QUOTEREQUEST);
        stringMap.put("S", QUOTE);
        stringMap.put("T", SETTLEMENTINSTRUCTIONS);
        stringMap.put("V", MARKETDATAREQUEST);
        stringMap.put("W", MARKETDATASNAPSHOTFULLREFRESH);
        stringMap.put("X", MARKETDATAINCREMENTALREFRESH);
        stringMap.put("Y", MARKETDATAREQUESTREJECT);
        stringMap.put("Z", QUOTECANCEL);
        stringMap.put("a", QUOTESTATUSREQUEST);
        stringMap.put("b", MASSQUOTEACKNOWLEDGEMENT);
        stringMap.put("c", SECURITYDEFINITIONREQUEST);
        stringMap.put("d", SECURITYDEFINITION);
        stringMap.put("e", SECURITYSTATUSREQUEST);
        stringMap.put("f", SECURITYSTATUS);
        stringMap.put("g", TRADINGSESSIONSTATUSREQUEST);
        stringMap.put("h", TRADINGSESSIONSTATUS);
        stringMap.put("i", MASSQUOTE);
        stringMap.put("j", BUSINESSMESSAGEREJECT);
        stringMap.put("k", BIDREQUEST);
        stringMap.put("l", BIDRESPONSE);
        stringMap.put("m", LISTSTRIKEPRICE);
        stringMap.put("n", XMLNONFIX);
        stringMap.put("o", REGISTRATIONINSTRUCTIONS);
        stringMap.put("p", REGISTRATIONINSTRUCTIONSRESPONSE);
        stringMap.put("q", ORDERMASSCANCELREQUEST);
        stringMap.put("r", ORDERMASSCANCELREPORT);
        stringMap.put("s", NEWORDERCROSS);
        stringMap.put("t", CROSSORDERCANCELREPLACEREQUEST);
        stringMap.put("u", CROSSORDERCANCELREQUEST);
        stringMap.put("v", SECURITYTYPEREQUEST);
        stringMap.put("w", SECURITYTYPES);
        stringMap.put("x", SECURITYLISTREQUEST);
        stringMap.put("y", SECURITYLIST);
        stringMap.put("z", DERIVATIVESECURITYLISTREQUEST);
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
        case "1": return TESTREQUEST;
        case "2": return RESENDREQUEST;
        case "3": return REJECT;
        case "4": return SEQUENCERESET;
        case "5": return LOGOUT;
        case "6": return IOI;
        case "7": return ADVERTISEMENT;
        case "8": return EXECUTIONREPORT;
        case "9": return ORDERCANCELREJECT;
        case "A": return LOGON;
        case "AA": return DERIVATIVESECURITYLIST;
        case "AB": return NEWORDERMULTILEG;
        case "AC": return MULTILEGORDERCANCELREPLACE;
        case "AD": return TRADECAPTUREREPORTREQUEST;
        case "AE": return TRADECAPTUREREPORT;
        case "AF": return ORDERMASSSTATUSREQUEST;
        case "AG": return QUOTEREQUESTREJECT;
        case "AH": return RFQREQUEST;
        case "AI": return QUOTESTATUSREPORT;
        case "AJ": return QUOTERESPONSE;
        case "AK": return CONFIRMATION;
        case "AL": return POSITIONMAINTENANCEREQUEST;
        case "AM": return POSITIONMAINTENANCEREPORT;
        case "AN": return REQUESTFORPOSITIONS;
        case "AO": return REQUESTFORPOSITIONSACK;
        case "AP": return POSITIONREPORT;
        case "AQ": return TRADECAPTUREREPORTREQUESTACK;
        case "AR": return TRADECAPTUREREPORTACK;
        case "AS": return ALLOCATIONREPORT;
        case "AT": return ALLOCATIONREPORTACK;
        case "AU": return CONFIRMATIONACK;
        case "AV": return SETTLEMENTINSTRUCTIONREQUEST;
        case "AW": return ASSIGNMENTREPORT;
        case "AX": return COLLATERALREQUEST;
        case "AY": return COLLATERALASSIGNMENT;
        case "AZ": return COLLATERALRESPONSE;
        case "B": return NEWS;
        case "BA": return COLLATERALREPORT;
        case "BB": return COLLATERALINQUIRY;
        case "BC": return NETWORKCOUNTERPARTYSYSTEMSTATUSREQUEST;
        case "BD": return NETWORKCOUNTERPARTYSYSTEMSTATUSRESPONSE;
        case "BE": return USERREQUEST;
        case "BF": return USERRESPONSE;
        case "BG": return COLLATERALINQUIRYACK;
        case "BH": return CONFIRMATIONREQUEST;
        case "BI": return TRADINGSESSIONLISTREQUEST;
        case "BJ": return TRADINGSESSIONLIST;
        case "BK": return SECURITYLISTUPDATEREPORT;
        case "BL": return ADJUSTEDPOSITIONREPORT;
        case "BM": return ALLOCATIONINSTRUCTIONALERT;
        case "BN": return EXECUTIONACKNOWLEDGEMENT;
        case "BO": return CONTRARYINTENTIONREPORT;
        case "BP": return SECURITYDEFINITIONUPDATEREPORT;
        case "BQ": return SETTLEMENTOBLIGATIONREPORT;
        case "BR": return DERIVATIVESECURITYLISTUPDATEREPORT;
        case "BS": return TRADINGSESSIONLISTUPDATEREPORT;
        case "BT": return MARKETDEFINITIONREQUEST;
        case "BU": return MARKETDEFINITION;
        case "BV": return MARKETDEFINITIONUPDATEREPORT;
        case "BW": return APPLICATIONMESSAGEREQUEST;
        case "BX": return APPLICATIONMESSAGEREQUESTACK;
        case "BY": return APPLICATIONMESSAGEREPORT;
        case "BZ": return ORDERMASSACTIONREPORT;
        case "C": return EMAIL;
        case "CA": return ORDERMASSACTIONREQUEST;
        case "CB": return USERNOTIFICATION;
        case "CC": return STREAMASSIGNMENTREQUEST;
        case "CD": return STREAMASSIGNMENTREPORT;
        case "CE": return STREAMASSIGNMENTREPORTACK;
        case "D": return NEWORDERSINGLE;
        case "E": return NEWORDERLIST;
        case "F": return ORDERCANCELREQUEST;
        case "G": return ORDERCANCELREPLACEREQUEST;
        case "H": return ORDERSTATUSREQUEST;
        case "J": return ALLOCATIONINSTRUCTION;
        case "K": return LISTCANCELREQUEST;
        case "L": return LISTEXECUTE;
        case "M": return LISTSTATUSREQUEST;
        case "N": return LISTSTATUS;
        case "P": return ALLOCATIONINSTRUCTIONACK;
        case "Q": return DONTKNOWTRADE;
        case "R": return QUOTEREQUEST;
        case "S": return QUOTE;
        case "T": return SETTLEMENTINSTRUCTIONS;
        case "V": return MARKETDATAREQUEST;
        case "W": return MARKETDATASNAPSHOTFULLREFRESH;
        case "X": return MARKETDATAINCREMENTALREFRESH;
        case "Y": return MARKETDATAREQUESTREJECT;
        case "Z": return QUOTECANCEL;
        case "a": return QUOTESTATUSREQUEST;
        case "b": return MASSQUOTEACKNOWLEDGEMENT;
        case "c": return SECURITYDEFINITIONREQUEST;
        case "d": return SECURITYDEFINITION;
        case "e": return SECURITYSTATUSREQUEST;
        case "f": return SECURITYSTATUS;
        case "g": return TRADINGSESSIONSTATUSREQUEST;
        case "h": return TRADINGSESSIONSTATUS;
        case "i": return MASSQUOTE;
        case "j": return BUSINESSMESSAGEREJECT;
        case "k": return BIDREQUEST;
        case "l": return BIDRESPONSE;
        case "m": return LISTSTRIKEPRICE;
        case "n": return XMLNONFIX;
        case "o": return REGISTRATIONINSTRUCTIONS;
        case "p": return REGISTRATIONINSTRUCTIONSRESPONSE;
        case "q": return ORDERMASSCANCELREQUEST;
        case "r": return ORDERMASSCANCELREPORT;
        case "s": return NEWORDERCROSS;
        case "t": return CROSSORDERCANCELREPLACEREQUEST;
        case "u": return CROSSORDERCANCELREQUEST;
        case "v": return SECURITYTYPEREQUEST;
        case "w": return SECURITYTYPES;
        case "x": return SECURITYLISTREQUEST;
        case "y": return SECURITYLIST;
        case "z": return DERIVATIVESECURITYLISTREQUEST;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
