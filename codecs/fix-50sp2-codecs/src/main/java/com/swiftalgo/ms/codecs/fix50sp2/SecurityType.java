/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.StringRepresentable;
public enum SecurityType implements StringRepresentable
{
    EURO_SUPRANATIONAL_COUPONS_("EUSUPRA"),
    CORPORATE_BOND("CORP"),
    FOREIGN_EXCHANGE_CONTRACT("FOR"),
    CREDIT_DEFAULT_SWAP("CDS"),
    COMMON_STOCK("CS"),
    REPURCHASE("REPO"),
    BRADY_BOND("BRADY"),
    TERM_LOAN("TERM"),
    BANKERS_ACCEPTANCE("BA"),
    ASSET_BACKED_SECURITIES("ABS"),
    OTHER_ANTICIPATION_NOTES("AN"),
    MUTUAL_FUND("MF"),
    FEDERAL_AGENCY_COUPON("FAC"),
    CORPORATE_PRIVATE_PLACEMENT("CPP"),
    FUTURE("FUT"),
    PREFERRED_STOCK("PS"),
    FORWARD("FORWARD"),
    CANADIAN_TREASURY_NOTES("CAN"),
    REVOLVER_LOAN("RVLV"),
    BANK_DEPOSITORY_NOTE("BDN"),
    CANADIAN_MORTGAGE_BONDS("CMB"),
    CERTIFICATE_OF_OBLIGATION("COFO"),
    MULTI_LEG_INSTRUMENT("MLEG"),
    NON_DELIVERABLE_FORWARD("FXNDF"),
    FEDERAL_AGENCY_DISCOUNT_NOTE("FADN"),
    CONVERTIBLE_BOND("CB"),
    OPTION("OPT"),
    BUY_SELLBACK("BUYSELL"),
    CANADIAN_TREASURY_BILLS("CTB"),
    REVOLVER_TERM_LOAN("RVLVTRM"),
    BANK_NOTES("BN"),
    CORP_MORTGAGE_BACKED_SECURITIES("CMBS"),
    CERTIFICATE_OF_PARTICIPATION("COFP"),
    NO_SECURITY_TYPE("NONE"),
    FX_SPOT("FXSPOT"),
    US_TREASURY_NOTE("UST"),
    PRIVATE_EXPORT_FUNDING_("PEF"),
    DUAL_CURRENCY("DUAL"),
    OPTIONS_ON_FUTURES("OOF"),
    SECURITIES_LOAN("SECLOAN"),
    EURO_SOVEREIGNS_("EUSOV"),
    BRIDGE_LOAN("BRIDGE"),
    BILL_OF_EXCHANGES("BOX"),
    COLLATERALIZED_MORTGAGE_OBLIGATION("CMO"),
    GENERAL_OBLIGATION_BONDS("GO"),
    FX_FORWARD("FXFWD"),
    US_TREASURY_BILL("USTB"),
    USD_SUPRANATIONAL_COUPONS_("SUPRA"),
    EURO_CORPORATE_BOND("EUCORP"),
    OPTIONS_ON_PHYSICAL_USE_NOT_RECOMMENDED("OOP"),
    SECURITIES_PLEDGE("SECPLEDGE"),
    CANADIAN_PROVINCIAL_BONDS("PROV"),
    LETTER_OF_CREDIT("LOFC"),
    CANADIAN_MONEY_MARKETS("CAMM"),
    IOETTE_MORTGAGE("IET"),
    MANDATORY_TENDER("MT"),
    FX_SWAP("FXSWAP"),
    EURO_CORPORATE_FLOATING_RATE_NOTES("EUFRN"),
    INTEREST_RATE_SWAP("IRS"),
    TREASURY_BILL_NON_US("TB"),
    SWING_LINE_FACILITY("SWING"),
    CERTIFICATE_OF_DEPOSIT("CD"),
    MORTGAGE_BACKED_SECURITIES("MBS"),
    REVENUE_ANTICIPATION_NOTE("RAN"),
    WILDCARD_ENTRY_FOR_USE_ON_SECURITY_DEFINITION_REQUEST("?"),
    US_CORPORATE_FLOATING_RATE_NOTES("FRN"),
    OPTIONS_ON_COMBO("OOC"),
    US_TREASURY_BOND("TBOND"),
    DEBTOR_IN_POSSESSION("DINP"),
    CALL_LOANS("CL"),
    MORTGAGE_INTEREST_ONLY("MIO"),
    REVENUE_BONDS("REV"),
    CASH("CASH"),
    INDEXED_LINKED("XLINKD"),
    INTEREST_STRIP_FROM_ANY_BOND_OR_NOTE("TINT"),
    DEFAULTED("DEFLTED"),
    COMMERCIAL_PAPER("CP"),
    MORTGAGE_PRINCIPAL_ONLY("MPO"),
    SPECIAL_ASSESSMENT("SPCLA"),
    STRUCTURED_NOTES("STRUCT"),
    US_TREASURY_BILL_1("TBILL"),
    TREASURY_INFLATION_PROTECTED_SECURITIES("TIPS"),
    WITHDRAWN("WITHDRN"),
    DEPOSIT_NOTES("DN"),
    MORTGAGE_PRIVATE_PLACEMENT("MPP"),
    SPECIAL_OBLIGATION("SPCLO"),
    YANKEE_CORPORATE_BOND("YANK"),
    PRINCIPAL_STRIP_OF_A_CALLABLE_BOND_OR_NOTE("TCAL"),
    REPLACED("REPLACD"),
    EURO_CERTIFICATE_OF_DEPOSIT("EUCD"),
    MISCELLANEOUS_PASS_THROUGH("MPT"),
    SPECIAL_TAX("SPCLT"),
    PRINCIPAL_STRIP_FROM_A_NON_CALLABLE_BOND_OR_NOTE("TPRN"),
    MATURED("MATURED"),
    EURO_COMMERCIAL_PAPER("EUCP"),
    PFANDBRIEFE_("PFAND"),
    TAX_ANTICIPATION_NOTE("TAN"),
    US_TREASURY_NOTE_1("TNOTE"),
    AMENDED_RESTATED("AMENDED"),
    LIQUIDITY_NOTE("LQN"),
    TO_BE_ANNOUNCED("TBA"),
    TAX_ALLOCATION("TAXA"),
    RETIRED("RETIRED"),
    MEDIUM_TERM_NOTES("MTN"),
    TAX_EXEMPT_COMMERCIAL_PAPER("TECP"),
    OVERNIGHT("ONITE"),
    TAXABLE_MUNICIPAL_CP("TMCP"),
    PROMISSORY_NOTE("PN"),
    SHORT_TERM_LOAN_NOTE("STN"),
    TAX_REVENUE_ANTICIPATION_NOTE("TRAN"),
    PLAZOS_FIJOS("PZFJ"),
    VARIABLE_RATE_DEMAND_NOTE("VRDN"),
    SECURED_LIQUIDITY_NOTE("SLQN"),
    WARRANT("WAR"),
    TIME_DEPOSIT("TD"),
    TERM_LIQUIDITY_NOTE("TLQN"),
    EXTENDED_COMM_NOTE("XCN"),
    YANKEE_CERTIFICATE_OF_DEPOSIT("YCD"),
    NULL_VAL(""),
    ARTIO_UNKNOWN("");

    private final String representation;

    SecurityType(final String representation)
    {
         this.representation = representation;
    }

    public final String representation() { return representation; }

    private static final CharArrayMap<SecurityType> charMap;
    static
    {
        final Map<String, SecurityType> stringMap = new HashMap<>();
        stringMap.put("EUSUPRA", EURO_SUPRANATIONAL_COUPONS_);
        stringMap.put("CORP", CORPORATE_BOND);
        stringMap.put("FOR", FOREIGN_EXCHANGE_CONTRACT);
        stringMap.put("CDS", CREDIT_DEFAULT_SWAP);
        stringMap.put("CS", COMMON_STOCK);
        stringMap.put("REPO", REPURCHASE);
        stringMap.put("BRADY", BRADY_BOND);
        stringMap.put("TERM", TERM_LOAN);
        stringMap.put("BA", BANKERS_ACCEPTANCE);
        stringMap.put("ABS", ASSET_BACKED_SECURITIES);
        stringMap.put("AN", OTHER_ANTICIPATION_NOTES);
        stringMap.put("MF", MUTUAL_FUND);
        stringMap.put("FAC", FEDERAL_AGENCY_COUPON);
        stringMap.put("CPP", CORPORATE_PRIVATE_PLACEMENT);
        stringMap.put("FUT", FUTURE);
        stringMap.put("PS", PREFERRED_STOCK);
        stringMap.put("FORWARD", FORWARD);
        stringMap.put("CAN", CANADIAN_TREASURY_NOTES);
        stringMap.put("RVLV", REVOLVER_LOAN);
        stringMap.put("BDN", BANK_DEPOSITORY_NOTE);
        stringMap.put("CMB", CANADIAN_MORTGAGE_BONDS);
        stringMap.put("COFO", CERTIFICATE_OF_OBLIGATION);
        stringMap.put("MLEG", MULTI_LEG_INSTRUMENT);
        stringMap.put("FXNDF", NON_DELIVERABLE_FORWARD);
        stringMap.put("FADN", FEDERAL_AGENCY_DISCOUNT_NOTE);
        stringMap.put("CB", CONVERTIBLE_BOND);
        stringMap.put("OPT", OPTION);
        stringMap.put("BUYSELL", BUY_SELLBACK);
        stringMap.put("CTB", CANADIAN_TREASURY_BILLS);
        stringMap.put("RVLVTRM", REVOLVER_TERM_LOAN);
        stringMap.put("BN", BANK_NOTES);
        stringMap.put("CMBS", CORP_MORTGAGE_BACKED_SECURITIES);
        stringMap.put("COFP", CERTIFICATE_OF_PARTICIPATION);
        stringMap.put("NONE", NO_SECURITY_TYPE);
        stringMap.put("FXSPOT", FX_SPOT);
        stringMap.put("UST", US_TREASURY_NOTE);
        stringMap.put("PEF", PRIVATE_EXPORT_FUNDING_);
        stringMap.put("DUAL", DUAL_CURRENCY);
        stringMap.put("OOF", OPTIONS_ON_FUTURES);
        stringMap.put("SECLOAN", SECURITIES_LOAN);
        stringMap.put("EUSOV", EURO_SOVEREIGNS_);
        stringMap.put("BRIDGE", BRIDGE_LOAN);
        stringMap.put("BOX", BILL_OF_EXCHANGES);
        stringMap.put("CMO", COLLATERALIZED_MORTGAGE_OBLIGATION);
        stringMap.put("GO", GENERAL_OBLIGATION_BONDS);
        stringMap.put("FXFWD", FX_FORWARD);
        stringMap.put("USTB", US_TREASURY_BILL);
        stringMap.put("SUPRA", USD_SUPRANATIONAL_COUPONS_);
        stringMap.put("EUCORP", EURO_CORPORATE_BOND);
        stringMap.put("OOP", OPTIONS_ON_PHYSICAL_USE_NOT_RECOMMENDED);
        stringMap.put("SECPLEDGE", SECURITIES_PLEDGE);
        stringMap.put("PROV", CANADIAN_PROVINCIAL_BONDS);
        stringMap.put("LOFC", LETTER_OF_CREDIT);
        stringMap.put("CAMM", CANADIAN_MONEY_MARKETS);
        stringMap.put("IET", IOETTE_MORTGAGE);
        stringMap.put("MT", MANDATORY_TENDER);
        stringMap.put("FXSWAP", FX_SWAP);
        stringMap.put("EUFRN", EURO_CORPORATE_FLOATING_RATE_NOTES);
        stringMap.put("IRS", INTEREST_RATE_SWAP);
        stringMap.put("TB", TREASURY_BILL_NON_US);
        stringMap.put("SWING", SWING_LINE_FACILITY);
        stringMap.put("CD", CERTIFICATE_OF_DEPOSIT);
        stringMap.put("MBS", MORTGAGE_BACKED_SECURITIES);
        stringMap.put("RAN", REVENUE_ANTICIPATION_NOTE);
        stringMap.put("?", WILDCARD_ENTRY_FOR_USE_ON_SECURITY_DEFINITION_REQUEST);
        stringMap.put("FRN", US_CORPORATE_FLOATING_RATE_NOTES);
        stringMap.put("OOC", OPTIONS_ON_COMBO);
        stringMap.put("TBOND", US_TREASURY_BOND);
        stringMap.put("DINP", DEBTOR_IN_POSSESSION);
        stringMap.put("CL", CALL_LOANS);
        stringMap.put("MIO", MORTGAGE_INTEREST_ONLY);
        stringMap.put("REV", REVENUE_BONDS);
        stringMap.put("CASH", CASH);
        stringMap.put("XLINKD", INDEXED_LINKED);
        stringMap.put("TINT", INTEREST_STRIP_FROM_ANY_BOND_OR_NOTE);
        stringMap.put("DEFLTED", DEFAULTED);
        stringMap.put("CP", COMMERCIAL_PAPER);
        stringMap.put("MPO", MORTGAGE_PRINCIPAL_ONLY);
        stringMap.put("SPCLA", SPECIAL_ASSESSMENT);
        stringMap.put("STRUCT", STRUCTURED_NOTES);
        stringMap.put("TBILL", US_TREASURY_BILL_1);
        stringMap.put("TIPS", TREASURY_INFLATION_PROTECTED_SECURITIES);
        stringMap.put("WITHDRN", WITHDRAWN);
        stringMap.put("DN", DEPOSIT_NOTES);
        stringMap.put("MPP", MORTGAGE_PRIVATE_PLACEMENT);
        stringMap.put("SPCLO", SPECIAL_OBLIGATION);
        stringMap.put("YANK", YANKEE_CORPORATE_BOND);
        stringMap.put("TCAL", PRINCIPAL_STRIP_OF_A_CALLABLE_BOND_OR_NOTE);
        stringMap.put("REPLACD", REPLACED);
        stringMap.put("EUCD", EURO_CERTIFICATE_OF_DEPOSIT);
        stringMap.put("MPT", MISCELLANEOUS_PASS_THROUGH);
        stringMap.put("SPCLT", SPECIAL_TAX);
        stringMap.put("TPRN", PRINCIPAL_STRIP_FROM_A_NON_CALLABLE_BOND_OR_NOTE);
        stringMap.put("MATURED", MATURED);
        stringMap.put("EUCP", EURO_COMMERCIAL_PAPER);
        stringMap.put("PFAND", PFANDBRIEFE_);
        stringMap.put("TAN", TAX_ANTICIPATION_NOTE);
        stringMap.put("TNOTE", US_TREASURY_NOTE_1);
        stringMap.put("AMENDED", AMENDED_RESTATED);
        stringMap.put("LQN", LIQUIDITY_NOTE);
        stringMap.put("TBA", TO_BE_ANNOUNCED);
        stringMap.put("TAXA", TAX_ALLOCATION);
        stringMap.put("RETIRED", RETIRED);
        stringMap.put("MTN", MEDIUM_TERM_NOTES);
        stringMap.put("TECP", TAX_EXEMPT_COMMERCIAL_PAPER);
        stringMap.put("ONITE", OVERNIGHT);
        stringMap.put("TMCP", TAXABLE_MUNICIPAL_CP);
        stringMap.put("PN", PROMISSORY_NOTE);
        stringMap.put("STN", SHORT_TERM_LOAN_NOTE);
        stringMap.put("TRAN", TAX_REVENUE_ANTICIPATION_NOTE);
        stringMap.put("PZFJ", PLAZOS_FIJOS);
        stringMap.put("VRDN", VARIABLE_RATE_DEMAND_NOTE);
        stringMap.put("SLQN", SECURED_LIQUIDITY_NOTE);
        stringMap.put("WAR", WARRANT);
        stringMap.put("TD", TIME_DEPOSIT);
        stringMap.put("TLQN", TERM_LIQUIDITY_NOTE);
        stringMap.put("XCN", EXTENDED_COMM_NOTE);
        stringMap.put("YCD", YANKEE_CERTIFICATE_OF_DEPOSIT);
        charMap = new CharArrayMap<>(stringMap);
    }

    public static SecurityType decode(final CharArrayWrapper key)
    {
        final SecurityType value = charMap.get(key);
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
    public static SecurityType decode(final String representation)
    {
        switch(representation)
        {
        case "EUSUPRA": return EURO_SUPRANATIONAL_COUPONS_;
        case "CORP": return CORPORATE_BOND;
        case "FOR": return FOREIGN_EXCHANGE_CONTRACT;
        case "CDS": return CREDIT_DEFAULT_SWAP;
        case "CS": return COMMON_STOCK;
        case "REPO": return REPURCHASE;
        case "BRADY": return BRADY_BOND;
        case "TERM": return TERM_LOAN;
        case "BA": return BANKERS_ACCEPTANCE;
        case "ABS": return ASSET_BACKED_SECURITIES;
        case "AN": return OTHER_ANTICIPATION_NOTES;
        case "MF": return MUTUAL_FUND;
        case "FAC": return FEDERAL_AGENCY_COUPON;
        case "CPP": return CORPORATE_PRIVATE_PLACEMENT;
        case "FUT": return FUTURE;
        case "PS": return PREFERRED_STOCK;
        case "FORWARD": return FORWARD;
        case "CAN": return CANADIAN_TREASURY_NOTES;
        case "RVLV": return REVOLVER_LOAN;
        case "BDN": return BANK_DEPOSITORY_NOTE;
        case "CMB": return CANADIAN_MORTGAGE_BONDS;
        case "COFO": return CERTIFICATE_OF_OBLIGATION;
        case "MLEG": return MULTI_LEG_INSTRUMENT;
        case "FXNDF": return NON_DELIVERABLE_FORWARD;
        case "FADN": return FEDERAL_AGENCY_DISCOUNT_NOTE;
        case "CB": return CONVERTIBLE_BOND;
        case "OPT": return OPTION;
        case "BUYSELL": return BUY_SELLBACK;
        case "CTB": return CANADIAN_TREASURY_BILLS;
        case "RVLVTRM": return REVOLVER_TERM_LOAN;
        case "BN": return BANK_NOTES;
        case "CMBS": return CORP_MORTGAGE_BACKED_SECURITIES;
        case "COFP": return CERTIFICATE_OF_PARTICIPATION;
        case "NONE": return NO_SECURITY_TYPE;
        case "FXSPOT": return FX_SPOT;
        case "UST": return US_TREASURY_NOTE;
        case "PEF": return PRIVATE_EXPORT_FUNDING_;
        case "DUAL": return DUAL_CURRENCY;
        case "OOF": return OPTIONS_ON_FUTURES;
        case "SECLOAN": return SECURITIES_LOAN;
        case "EUSOV": return EURO_SOVEREIGNS_;
        case "BRIDGE": return BRIDGE_LOAN;
        case "BOX": return BILL_OF_EXCHANGES;
        case "CMO": return COLLATERALIZED_MORTGAGE_OBLIGATION;
        case "GO": return GENERAL_OBLIGATION_BONDS;
        case "FXFWD": return FX_FORWARD;
        case "USTB": return US_TREASURY_BILL;
        case "SUPRA": return USD_SUPRANATIONAL_COUPONS_;
        case "EUCORP": return EURO_CORPORATE_BOND;
        case "OOP": return OPTIONS_ON_PHYSICAL_USE_NOT_RECOMMENDED;
        case "SECPLEDGE": return SECURITIES_PLEDGE;
        case "PROV": return CANADIAN_PROVINCIAL_BONDS;
        case "LOFC": return LETTER_OF_CREDIT;
        case "CAMM": return CANADIAN_MONEY_MARKETS;
        case "IET": return IOETTE_MORTGAGE;
        case "MT": return MANDATORY_TENDER;
        case "FXSWAP": return FX_SWAP;
        case "EUFRN": return EURO_CORPORATE_FLOATING_RATE_NOTES;
        case "IRS": return INTEREST_RATE_SWAP;
        case "TB": return TREASURY_BILL_NON_US;
        case "SWING": return SWING_LINE_FACILITY;
        case "CD": return CERTIFICATE_OF_DEPOSIT;
        case "MBS": return MORTGAGE_BACKED_SECURITIES;
        case "RAN": return REVENUE_ANTICIPATION_NOTE;
        case "?": return WILDCARD_ENTRY_FOR_USE_ON_SECURITY_DEFINITION_REQUEST;
        case "FRN": return US_CORPORATE_FLOATING_RATE_NOTES;
        case "OOC": return OPTIONS_ON_COMBO;
        case "TBOND": return US_TREASURY_BOND;
        case "DINP": return DEBTOR_IN_POSSESSION;
        case "CL": return CALL_LOANS;
        case "MIO": return MORTGAGE_INTEREST_ONLY;
        case "REV": return REVENUE_BONDS;
        case "CASH": return CASH;
        case "XLINKD": return INDEXED_LINKED;
        case "TINT": return INTEREST_STRIP_FROM_ANY_BOND_OR_NOTE;
        case "DEFLTED": return DEFAULTED;
        case "CP": return COMMERCIAL_PAPER;
        case "MPO": return MORTGAGE_PRINCIPAL_ONLY;
        case "SPCLA": return SPECIAL_ASSESSMENT;
        case "STRUCT": return STRUCTURED_NOTES;
        case "TBILL": return US_TREASURY_BILL_1;
        case "TIPS": return TREASURY_INFLATION_PROTECTED_SECURITIES;
        case "WITHDRN": return WITHDRAWN;
        case "DN": return DEPOSIT_NOTES;
        case "MPP": return MORTGAGE_PRIVATE_PLACEMENT;
        case "SPCLO": return SPECIAL_OBLIGATION;
        case "YANK": return YANKEE_CORPORATE_BOND;
        case "TCAL": return PRINCIPAL_STRIP_OF_A_CALLABLE_BOND_OR_NOTE;
        case "REPLACD": return REPLACED;
        case "EUCD": return EURO_CERTIFICATE_OF_DEPOSIT;
        case "MPT": return MISCELLANEOUS_PASS_THROUGH;
        case "SPCLT": return SPECIAL_TAX;
        case "TPRN": return PRINCIPAL_STRIP_FROM_A_NON_CALLABLE_BOND_OR_NOTE;
        case "MATURED": return MATURED;
        case "EUCP": return EURO_COMMERCIAL_PAPER;
        case "PFAND": return PFANDBRIEFE_;
        case "TAN": return TAX_ANTICIPATION_NOTE;
        case "TNOTE": return US_TREASURY_NOTE_1;
        case "AMENDED": return AMENDED_RESTATED;
        case "LQN": return LIQUIDITY_NOTE;
        case "TBA": return TO_BE_ANNOUNCED;
        case "TAXA": return TAX_ALLOCATION;
        case "RETIRED": return RETIRED;
        case "MTN": return MEDIUM_TERM_NOTES;
        case "TECP": return TAX_EXEMPT_COMMERCIAL_PAPER;
        case "ONITE": return OVERNIGHT;
        case "TMCP": return TAXABLE_MUNICIPAL_CP;
        case "PN": return PROMISSORY_NOTE;
        case "STN": return SHORT_TERM_LOAN_NOTE;
        case "TRAN": return TAX_REVENUE_ANTICIPATION_NOTE;
        case "PZFJ": return PLAZOS_FIJOS;
        case "VRDN": return VARIABLE_RATE_DEMAND_NOTE;
        case "SLQN": return SECURED_LIQUIDITY_NOTE;
        case "WAR": return WARRANT;
        case "TD": return TIME_DEPOSIT;
        case "TLQN": return TERM_LIQUIDITY_NOTE;
        case "XCN": return EXTENDED_COMM_NOTE;
        case "YCD": return YANKEE_CERTIFICATE_OF_DEPOSIT;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
