/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import org.agrona.collections.IntHashSet;
import uk.co.real_logic.artio.dictionary.CharArraySet;
public class Constants
{

    public static String VERSION = "FIX.4.4";
    public static char[] VERSION_CHARS = VERSION.toCharArray();

    public static final String HEARTBEAT_MESSAGE_AS_STR = "0";
    public static final long HEARTBEAT_MESSAGE = 48L;

    public static final String LOGON_MESSAGE_AS_STR = "A";
    public static final long LOGON_MESSAGE = 65L;

    public static final String TEST_REQUEST_MESSAGE_AS_STR = "1";
    public static final long TEST_REQUEST_MESSAGE = 49L;

    public static final String RESEND_REQUEST_MESSAGE_AS_STR = "2";
    public static final long RESEND_REQUEST_MESSAGE = 50L;

    public static final String REJECT_MESSAGE_AS_STR = "3";
    public static final long REJECT_MESSAGE = 51L;

    public static final String SEQUENCE_RESET_MESSAGE_AS_STR = "4";
    public static final long SEQUENCE_RESET_MESSAGE = 52L;

    public static final String LOGOUT_MESSAGE_AS_STR = "5";
    public static final long LOGOUT_MESSAGE = 53L;

    public static final String BUSINESS_MESSAGE_REJECT_MESSAGE_AS_STR = "j";
    public static final long BUSINESS_MESSAGE_REJECT_MESSAGE = 106L;

    public static final String USER_REQUEST_MESSAGE_AS_STR = "BE";
    public static final long USER_REQUEST_MESSAGE = 17730L;

    public static final String USER_RESPONSE_MESSAGE_AS_STR = "BF";
    public static final long USER_RESPONSE_MESSAGE = 17986L;

    public static final String ADVERTISEMENT_MESSAGE_AS_STR = "7";
    public static final long ADVERTISEMENT_MESSAGE = 55L;

    public static final String INDICATION_OF_INTEREST_MESSAGE_AS_STR = "6";
    public static final long INDICATION_OF_INTEREST_MESSAGE = 54L;

    public static final String NEWS_MESSAGE_AS_STR = "B";
    public static final long NEWS_MESSAGE = 66L;

    public static final String EMAIL_MESSAGE_AS_STR = "C";
    public static final long EMAIL_MESSAGE = 67L;

    public static final String QUOTE_REQUEST_MESSAGE_AS_STR = "R";
    public static final long QUOTE_REQUEST_MESSAGE = 82L;

    public static final String QUOTE_RESPONSE_MESSAGE_AS_STR = "AJ";
    public static final long QUOTE_RESPONSE_MESSAGE = 19009L;

    public static final String QUOTE_REQUEST_REJECT_MESSAGE_AS_STR = "AG";
    public static final long QUOTE_REQUEST_REJECT_MESSAGE = 18241L;

    public static final String R_F_Q_REQUEST_MESSAGE_AS_STR = "AH";
    public static final long R_F_Q_REQUEST_MESSAGE = 18497L;

    public static final String QUOTE_MESSAGE_AS_STR = "S";
    public static final long QUOTE_MESSAGE = 83L;

    public static final String QUOTE_CANCEL_MESSAGE_AS_STR = "Z";
    public static final long QUOTE_CANCEL_MESSAGE = 90L;

    public static final String QUOTE_STATUS_REQUEST_MESSAGE_AS_STR = "a";
    public static final long QUOTE_STATUS_REQUEST_MESSAGE = 97L;

    public static final String QUOTE_STATUS_REPORT_MESSAGE_AS_STR = "AI";
    public static final long QUOTE_STATUS_REPORT_MESSAGE = 18753L;

    public static final String MASS_QUOTE_MESSAGE_AS_STR = "i";
    public static final long MASS_QUOTE_MESSAGE = 105L;

    public static final String MASS_QUOTE_ACKNOWLEDGEMENT_MESSAGE_AS_STR = "b";
    public static final long MASS_QUOTE_ACKNOWLEDGEMENT_MESSAGE = 98L;

    public static final String MARKET_DATA_REQUEST_MESSAGE_AS_STR = "V";
    public static final long MARKET_DATA_REQUEST_MESSAGE = 86L;

    public static final String MARKET_DATA_SNAPSHOT_FULL_REFRESH_MESSAGE_AS_STR = "W";
    public static final long MARKET_DATA_SNAPSHOT_FULL_REFRESH_MESSAGE = 87L;

    public static final String MARKET_DATA_INCREMENTAL_REFRESH_MESSAGE_AS_STR = "X";
    public static final long MARKET_DATA_INCREMENTAL_REFRESH_MESSAGE = 88L;

    public static final String MARKET_DATA_REQUEST_REJECT_MESSAGE_AS_STR = "Y";
    public static final long MARKET_DATA_REQUEST_REJECT_MESSAGE = 89L;

    public static final String SECURITY_DEFINITION_REQUEST_MESSAGE_AS_STR = "c";
    public static final long SECURITY_DEFINITION_REQUEST_MESSAGE = 99L;

    public static final String SECURITY_DEFINITION_MESSAGE_AS_STR = "d";
    public static final long SECURITY_DEFINITION_MESSAGE = 100L;

    public static final String SECURITY_TYPE_REQUEST_MESSAGE_AS_STR = "v";
    public static final long SECURITY_TYPE_REQUEST_MESSAGE = 118L;

    public static final String SECURITY_TYPES_MESSAGE_AS_STR = "w";
    public static final long SECURITY_TYPES_MESSAGE = 119L;

    public static final String SECURITY_LIST_REQUEST_MESSAGE_AS_STR = "x";
    public static final long SECURITY_LIST_REQUEST_MESSAGE = 120L;

    public static final String SECURITY_LIST_MESSAGE_AS_STR = "y";
    public static final long SECURITY_LIST_MESSAGE = 121L;

    public static final String DERIVATIVE_SECURITY_LIST_REQUEST_MESSAGE_AS_STR = "z";
    public static final long DERIVATIVE_SECURITY_LIST_REQUEST_MESSAGE = 122L;

    public static final String DERIVATIVE_SECURITY_LIST_MESSAGE_AS_STR = "AA";
    public static final long DERIVATIVE_SECURITY_LIST_MESSAGE = 16705L;

    public static final String SECURITY_STATUS_REQUEST_MESSAGE_AS_STR = "e";
    public static final long SECURITY_STATUS_REQUEST_MESSAGE = 101L;

    public static final String SECURITY_STATUS_MESSAGE_AS_STR = "f";
    public static final long SECURITY_STATUS_MESSAGE = 102L;

    public static final String TRADING_SESSION_STATUS_REQUEST_MESSAGE_AS_STR = "g";
    public static final long TRADING_SESSION_STATUS_REQUEST_MESSAGE = 103L;

    public static final String TRADING_SESSION_STATUS_MESSAGE_AS_STR = "h";
    public static final long TRADING_SESSION_STATUS_MESSAGE = 104L;

    public static final String NEW_ORDER_SINGLE_MESSAGE_AS_STR = "D";
    public static final long NEW_ORDER_SINGLE_MESSAGE = 68L;

    public static final String EXECUTION_REPORT_MESSAGE_AS_STR = "8";
    public static final long EXECUTION_REPORT_MESSAGE = 56L;

    public static final String DONT_KNOW_TRADE_MESSAGE_AS_STR = "Q";
    public static final long DONT_KNOW_TRADE_MESSAGE = 81L;

    public static final String ORDER_CANCEL_REPLACE_REQUEST_MESSAGE_AS_STR = "G";
    public static final long ORDER_CANCEL_REPLACE_REQUEST_MESSAGE = 71L;

    public static final String ORDER_CANCEL_REQUEST_MESSAGE_AS_STR = "F";
    public static final long ORDER_CANCEL_REQUEST_MESSAGE = 70L;

    public static final String ORDER_CANCEL_REJECT_MESSAGE_AS_STR = "9";
    public static final long ORDER_CANCEL_REJECT_MESSAGE = 57L;

    public static final String ORDER_STATUS_REQUEST_MESSAGE_AS_STR = "H";
    public static final long ORDER_STATUS_REQUEST_MESSAGE = 72L;

    public static final String ORDER_MASS_CANCEL_REQUEST_MESSAGE_AS_STR = "q";
    public static final long ORDER_MASS_CANCEL_REQUEST_MESSAGE = 113L;

    public static final String ORDER_MASS_CANCEL_REPORT_MESSAGE_AS_STR = "r";
    public static final long ORDER_MASS_CANCEL_REPORT_MESSAGE = 114L;

    public static final String ORDER_MASS_STATUS_REQUEST_MESSAGE_AS_STR = "AF";
    public static final long ORDER_MASS_STATUS_REQUEST_MESSAGE = 17985L;

    public static final String NEW_ORDER_CROSS_MESSAGE_AS_STR = "s";
    public static final long NEW_ORDER_CROSS_MESSAGE = 115L;

    public static final String CROSS_ORDER_CANCEL_REPLACE_REQUEST_MESSAGE_AS_STR = "t";
    public static final long CROSS_ORDER_CANCEL_REPLACE_REQUEST_MESSAGE = 116L;

    public static final String CROSS_ORDER_CANCEL_REQUEST_MESSAGE_AS_STR = "u";
    public static final long CROSS_ORDER_CANCEL_REQUEST_MESSAGE = 117L;

    public static final String NEW_ORDER_MULTILEG_MESSAGE_AS_STR = "AB";
    public static final long NEW_ORDER_MULTILEG_MESSAGE = 16961L;

    public static final String MULTILEG_ORDER_CANCEL_REPLACE_REQUEST_MESSAGE_AS_STR = "AC";
    public static final long MULTILEG_ORDER_CANCEL_REPLACE_REQUEST_MESSAGE = 17217L;

    public static final String BID_REQUEST_MESSAGE_AS_STR = "k";
    public static final long BID_REQUEST_MESSAGE = 107L;

    public static final String BID_RESPONSE_MESSAGE_AS_STR = "l";
    public static final long BID_RESPONSE_MESSAGE = 108L;

    public static final String NEW_ORDER_LIST_MESSAGE_AS_STR = "E";
    public static final long NEW_ORDER_LIST_MESSAGE = 69L;

    public static final String LIST_STRIKE_PRICE_MESSAGE_AS_STR = "m";
    public static final long LIST_STRIKE_PRICE_MESSAGE = 109L;

    public static final String LIST_STATUS_MESSAGE_AS_STR = "N";
    public static final long LIST_STATUS_MESSAGE = 78L;

    public static final String LIST_EXECUTE_MESSAGE_AS_STR = "L";
    public static final long LIST_EXECUTE_MESSAGE = 76L;

    public static final String LIST_CANCEL_REQUEST_MESSAGE_AS_STR = "K";
    public static final long LIST_CANCEL_REQUEST_MESSAGE = 75L;

    public static final String LIST_STATUS_REQUEST_MESSAGE_AS_STR = "M";
    public static final long LIST_STATUS_REQUEST_MESSAGE = 77L;

    public static final String ALLOCATION_INSTRUCTION_MESSAGE_AS_STR = "J";
    public static final long ALLOCATION_INSTRUCTION_MESSAGE = 74L;

    public static final String ALLOCATION_INSTRUCTION_ACK_MESSAGE_AS_STR = "P";
    public static final long ALLOCATION_INSTRUCTION_ACK_MESSAGE = 80L;

    public static final String ALLOCATION_REPORT_MESSAGE_AS_STR = "AS";
    public static final long ALLOCATION_REPORT_MESSAGE = 21313L;

    public static final String ALLOCATION_REPORT_ACK_MESSAGE_AS_STR = "AT";
    public static final long ALLOCATION_REPORT_ACK_MESSAGE = 21569L;

    public static final String CONFIRMATION_MESSAGE_AS_STR = "AK";
    public static final long CONFIRMATION_MESSAGE = 19265L;

    public static final String CONFIRMATION_ACK_MESSAGE_AS_STR = "AU";
    public static final long CONFIRMATION_ACK_MESSAGE = 21825L;

    public static final String CONFIRMATION_REQUEST_MESSAGE_AS_STR = "BH";
    public static final long CONFIRMATION_REQUEST_MESSAGE = 18498L;

    public static final String SETTLEMENT_INSTRUCTIONS_MESSAGE_AS_STR = "T";
    public static final long SETTLEMENT_INSTRUCTIONS_MESSAGE = 84L;

    public static final String SETTLEMENT_INSTRUCTION_REQUEST_MESSAGE_AS_STR = "AV";
    public static final long SETTLEMENT_INSTRUCTION_REQUEST_MESSAGE = 22081L;

    public static final String TRADE_CAPTURE_REPORT_REQUEST_MESSAGE_AS_STR = "AD";
    public static final long TRADE_CAPTURE_REPORT_REQUEST_MESSAGE = 17473L;

    public static final String TRADE_CAPTURE_REPORT_REQUEST_ACK_MESSAGE_AS_STR = "AQ";
    public static final long TRADE_CAPTURE_REPORT_REQUEST_ACK_MESSAGE = 20801L;

    public static final String TRADE_CAPTURE_REPORT_MESSAGE_AS_STR = "AE";
    public static final long TRADE_CAPTURE_REPORT_MESSAGE = 17729L;

    public static final String TRADE_CAPTURE_REPORT_ACK_MESSAGE_AS_STR = "AR";
    public static final long TRADE_CAPTURE_REPORT_ACK_MESSAGE = 21057L;

    public static final String REGISTRATION_INSTRUCTIONS_MESSAGE_AS_STR = "o";
    public static final long REGISTRATION_INSTRUCTIONS_MESSAGE = 111L;

    public static final String REGISTRATION_INSTRUCTIONS_RESPONSE_MESSAGE_AS_STR = "p";
    public static final long REGISTRATION_INSTRUCTIONS_RESPONSE_MESSAGE = 112L;

    public static final String POSITION_MAINTENANCE_REQUEST_MESSAGE_AS_STR = "AL";
    public static final long POSITION_MAINTENANCE_REQUEST_MESSAGE = 19521L;

    public static final String POSITION_MAINTENANCE_REPORT_MESSAGE_AS_STR = "AM";
    public static final long POSITION_MAINTENANCE_REPORT_MESSAGE = 19777L;

    public static final String REQUEST_FOR_POSITIONS_MESSAGE_AS_STR = "AN";
    public static final long REQUEST_FOR_POSITIONS_MESSAGE = 20033L;

    public static final String REQUEST_FOR_POSITIONS_ACK_MESSAGE_AS_STR = "AO";
    public static final long REQUEST_FOR_POSITIONS_ACK_MESSAGE = 20289L;

    public static final String POSITION_REPORT_MESSAGE_AS_STR = "AP";
    public static final long POSITION_REPORT_MESSAGE = 20545L;

    public static final String ASSIGNMENT_REPORT_MESSAGE_AS_STR = "AW";
    public static final long ASSIGNMENT_REPORT_MESSAGE = 22337L;

    public static final String COLLATERAL_REQUEST_MESSAGE_AS_STR = "AX";
    public static final long COLLATERAL_REQUEST_MESSAGE = 22593L;

    public static final String COLLATERAL_ASSIGNMENT_MESSAGE_AS_STR = "AY";
    public static final long COLLATERAL_ASSIGNMENT_MESSAGE = 22849L;

    public static final String COLLATERAL_RESPONSE_MESSAGE_AS_STR = "AZ";
    public static final long COLLATERAL_RESPONSE_MESSAGE = 23105L;

    public static final String COLLATERAL_REPORT_MESSAGE_AS_STR = "BA";
    public static final long COLLATERAL_REPORT_MESSAGE = 16706L;

    public static final String COLLATERAL_INQUIRY_MESSAGE_AS_STR = "BB";
    public static final long COLLATERAL_INQUIRY_MESSAGE = 16962L;

    public static final String NETWORK_STATUS_REQUEST_MESSAGE_AS_STR = "BC";
    public static final long NETWORK_STATUS_REQUEST_MESSAGE = 17218L;

    public static final String NETWORK_STATUS_RESPONSE_MESSAGE_AS_STR = "BD";
    public static final long NETWORK_STATUS_RESPONSE_MESSAGE = 17474L;

    public static final String COLLATERAL_INQUIRY_ACK_MESSAGE_AS_STR = "BG";
    public static final long COLLATERAL_INQUIRY_ACK_MESSAGE = 18242L;

    public static final int LIST_STATUS_TEXT = 444;

    public static final int EVENT_DATE = 866;

    public static final int AGREEMENT_ID = 914;

    public static final int MAILING_INST = 482;

    public static final int UNDERLYING_LAST_PX = 651;

    public static final int M_D_IMPLICIT_DELETE = 547;

    public static final int BID_PX = 132;

    public static final int NOTIFY_BROKER_OF_CREDIT = 208;

    public static final int REF_SEQ_NUM = 45;

    public static final int M_D_ENTRY_BUYER = 288;

    public static final int SETTL_INST_SOURCE = 165;

    public static final int TRANS_BKD_TIME = 483;

    public static final int NO_NESTED2_PARTY_IDS_GROUP_COUNTER = 756;

    public static final int CONFIRM_REF_ID = 772;

    public static final int UNDERLYING_QTY = 879;

    public static final int COLL_REQ_ID = 894;

    public static final int CROSS_ID = 548;

    public static final int CUST_ORDER_CAPACITY = 582;

    public static final int LEG_SECURITY_ALT_ID_SOURCE = 606;

    public static final int NO_SETTL_PARTY_IDS = 781;

    public static final int NETWORK_REQUEST_TYPE = 935;

    public static final int LEG_SETTL_DATE = 588;

    public static final int TRAD_SES_MODE = 339;

    public static final int AVG_PX_PRECISION = 74;

    public static final int CASH_DISTRIB_AGENT_NAME = 498;

    public static final int UNDERLYING_SECURITY_ALT_ID_SOURCE = 459;

    public static final int CORPORATE_ACTION = 292;

    public static final int CONFIRM_ID = 664;

    public static final int OPEN_CLOSE_SETTL_FLAG = 286;

    public static final int TARGET_STRATEGY_PERFORMANCE = 850;

    public static final int DUE_TO_RELATED = 329;

    public static final int M_D_ENTRY_PX = 270;

    public static final int LEG_SECURITY_ID = 602;

    public static final int VALUE_OF_FUTURES = 408;

    public static final int QUOTE_RESP_ID = 693;

    public static final int BASIS_FEATURE_PRICE = 260;

    public static final int BUY_VOLUME = 330;

    public static final int SETTL_PARTY_SUB_ID = 785;

    public static final int FOREX_REQ = 121;

    public static final int POS_TYPE = 703;

    public static final int DESK_ID = 284;

    public static final int DISTRIB_PERCENTAGE = 512;

    public static final int NO_REGIST_DTLS_GROUP_COUNTER = 473;

    public static final int TRAD_SES_STATUS = 340;

    public static final int LIST_NAME = 392;

    public static final int FAIR_VALUE = 406;

    public static final int LOCATE_REQD = 114;

    public static final int MESSAGE_ENCODING = 347;

    public static final int NO_BID_DESCRIPTORS = 398;

    public static final int EXEC_VALUATION_POINT = 515;

    public static final int LEG_LOCALE_OF_ISSUE = 598;

    public static final int TRADE_LEG_REF_ID = 824;

    public static final int ORIG_POS_REQ_REF_ID = 713;

    public static final int CROSS_PRIORITIZATION = 550;

    public static final int NO_M_D_ENTRIES = 268;

    public static final int UNDERLYING_ISSUER = 306;

    public static final int ALLOC_QTY = 80;

    public static final int SYMBOL_SFX = 65;

    public static final int EXPIRE_DATE = 432;

    public static final int NO_LEG_SECURITY_ALT_ID = 604;

    public static final int NO_EVENTS = 864;

    public static final int ALLOC_ACCT_ID_SOURCE = 661;

    public static final int XML_DATA_LEN = 212;

    public static final int C_F_I_CODE = 461;

    public static final int COLL_INQUIRY_STATUS = 945;

    public static final int LEG_SETTL_TYPE = 587;

    public static final int NO_PARTY_SUB_IDS = 802;

    public static final int REGIST_REJ_REASON_TEXT = 496;

    public static final int ENCODED_TEXT_LEN = 354;

    public static final int LIST_EXEC_INST_TYPE = 433;

    public static final int DEF_BID_SIZE = 293;

    public static final int NO_RELATED_SYM_GROUP_COUNTER = 146;

    public static final int INTEREST_AT_MATURITY = 738;

    public static final int HEADLINE = 148;

    public static final int LEG_PRICE_TYPE = 686;

    public static final int MATCH_STATUS = 573;

    public static final int BOOKING_TYPE = 775;

    public static final int NO_QUOTE_SETS = 296;

    public static final int PARTY_ROLE = 452;

    public static final int SENDER_SUB_ID = 50;

    public static final int CASH_ORDER_QTY = 152;

    public static final int SIDE_VALUE_IND = 401;

    public static final int NO_DATES_GROUP_COUNTER = 580;

    public static final int LEG_SECURITY_DESC = 620;

    public static final int YIELD_REDEMPTION_DATE = 696;

    public static final int UNDERLYING_INSTR_REGISTRY = 595;

    public static final int NO_MSG_TYPES = 384;

    public static final int UNDERLYING_STIP_VALUE = 889;

    public static final int PRICE_TYPE = 423;

    public static final int LEGAL_CONFIRM = 650;

    public static final int TOTAL_NET_VALUE = 900;

    public static final int TRAD_SES_REQ_ID = 335;

    public static final int NO_STRIKES_GROUP_COUNTER = 428;

    public static final int LEG_POSITION_EFFECT = 564;

    public static final int NO_SIDES = 552;

    public static final int ASGN_RPT_ID = 833;

    public static final int NO_ROUTING_IDS = 215;

    public static final int ROUND_LOT = 561;

    public static final int ALLOC_PRICE = 366;

    public static final int SECURITY_ID = 48;

    public static final int TRADE_LINK_ID = 820;

    public static final int AFFIRM_STATUS = 940;

    public static final int LAST_LIQUIDITY_IND = 851;

    public static final int NO_M_D_ENTRIES_GROUP_COUNTER = 268;

    public static final int SETTL_CURR_AMT = 119;

    public static final int ALLOC_REPORT_ID = 755;

    public static final int RPT_SEQ = 83;

    public static final int NO_RELATED_SYM = 146;

    public static final int BUSINESS_REJECT_REASON = 380;

    public static final int DISCRETION_MOVE_TYPE = 841;

    public static final int SECONDARY_ORDER_ID = 198;

    public static final int NO_TRADES = 897;

    public static final int NO_COMP_IDS_GROUP_COUNTER = 936;

    public static final int NO_STIPULATIONS = 232;

    public static final int QUOTE_STATUS_REQ_ID = 649;

    public static final int NO_LEG_SECURITY_ALT_ID_GROUP_COUNTER = 604;

    public static final int USERNAME = 553;

    public static final int ALLOWABLE_ONE_SIDEDNESS_PCT = 765;

    public static final int TEST_REQ_ID = 112;

    public static final int LAST_MSG_SEQ_NUM_PROCESSED = 369;

    public static final int CLEARING_INSTRUCTION = 577;

    public static final int TOT_NO_QUOTE_ENTRIES = 304;

    public static final int BID_TRADE_TYPE = 418;

    public static final int MAILING_DTLS = 474;

    public static final int EXEC_ID = 17;

    public static final int ENCODED_TEXT = 355;

    public static final int SETTL_INST_REQ_REJ_CODE = 792;

    public static final int LOCATION_ID = 283;

    public static final int UNDERLYING_PUT_OR_CALL = 315;

    public static final int WORKING_INDICATOR = 636;

    public static final int MIN_BID_SIZE = 647;

    public static final int POSITION_EFFECT = 77;

    public static final int LEG_FACTOR = 253;

    public static final int DATE_OF_BIRTH = 486;

    public static final int ENCODED_SUBJECT = 357;

    public static final int MARKET_DEPTH = 264;

    public static final int NO_POSITIONS = 702;

    public static final int NO_POSITIONS_GROUP_COUNTER = 702;

    public static final int NO_AFFECTED_ORDERS = 534;

    public static final int SELLER_DAYS = 287;

    public static final int CONTRA_LEG_REF_ID = 655;

    public static final int NO_SETTL_INST = 778;

    public static final int UNDERLYING_STRIKE_CURRENCY = 941;

    public static final int MAX_MESSAGE_SIZE = 383;

    public static final int SETTL_PRICE = 730;

    public static final int UNDERLYING_SYMBOL = 311;

    public static final int SETTL_PARTY_SUB_ID_TYPE = 786;

    public static final int NO_DISTRIB_INSTS = 510;

    public static final int TRADE_REQUEST_STATUS = 750;

    public static final int LIST_EXEC_INST = 69;

    public static final int NET_CHG_PREV_DAY = 451;

    public static final int SETTL_DATE2 = 193;

    public static final int QUOTE_PRICE_TYPE = 692;

    public static final int I_O_I_REF_ID = 26;

    public static final int SIDE = 54;

    public static final int SECURITY_STATUS_REQ_ID = 324;

    public static final int UNDERLYING_ISSUE_DATE = 242;

    public static final int SENDING_TIME = 52;

    public static final int DISCRETION_OFFSET_TYPE = 842;

    public static final int SECURE_DATA_LEN = 90;

    public static final int ALLOC_INTEREST_AT_MATURITY = 741;

    public static final int LEG_REPURCHASE_TERM = 251;

    public static final int DAY_CUM_QTY = 425;

    public static final int COUPON_RATE = 223;

    public static final int UNDERLYING_C_P_PROGRAM = 877;

    public static final int ALLOC_REPORT_REF_ID = 795;

    public static final int REF_SUB_ID = 931;

    public static final int NO_CLEARING_INSTRUCTIONS_GROUP_COUNTER = 576;

    public static final int QUOTE_REJECT_REASON = 300;

    public static final int POS_MAINT_RESULT = 723;

    public static final int TRADE_INPUT_SOURCE = 578;

    public static final int TEXT = 58;

    public static final int MSG_TYPE = 35;

    public static final int BID_ID = 390;

    public static final int CONCESSION = 238;

    public static final int CONFIRM_REQ_ID = 859;

    public static final int ALLOC_AVG_PX = 153;

    public static final int COLL_ASGN_RESP_TYPE = 905;

    public static final int ENCODED_LEG_ISSUER = 619;

    public static final int ALT_M_D_SOURCE_ID = 817;

    public static final int NO_ALLOCS_GROUP_COUNTER = 78;

    public static final int CASH_DISTRIB_CURR = 478;

    public static final int TRADE_INPUT_DEVICE = 579;

    public static final int NO_SETTL_PARTY_IDS_GROUP_COUNTER = 781;

    public static final int NO_NESTED2_PARTY_SUB_IDS = 806;

    public static final int MATURITY_MONTH_YEAR = 200;

    public static final int LEG_REF_ID = 654;

    public static final int EVENT_TYPE = 865;

    public static final int NO_MSG_TYPES_GROUP_COUNTER = 384;

    public static final int EXEC_PRICE_TYPE = 484;

    public static final int DISCRETION_INST = 388;

    public static final int LEG_CREDIT_RATING = 257;

    public static final int PREVIOUSLY_REPORTED = 570;

    public static final int SETTL_PARTY_ID_SOURCE = 783;

    public static final int SPREAD = 218;

    public static final int LAST_RPT_REQUESTED = 912;

    public static final int LEG_COUPON_RATE = 615;

    public static final int NO_HOPS = 627;

    public static final int PARTY_ID = 448;

    public static final int FACTOR = 228;

    public static final int HALT_REASON = 327;

    public static final int CL_ORD_LINK_ID = 583;

    public static final int CANCELLATION_RIGHTS = 480;

    public static final int NESTED_PARTY_SUB_ID = 545;

    public static final int COLL_RESP_ID = 904;

    public static final int NETWORK_RESPONSE_ID = 932;

    public static final int M_D_ENTRY_TIME = 273;

    public static final int LEG_SETTL_CURRENCY = 675;

    public static final int UNDERLYING_REPO_COLLATERAL_SECURITY_TYPE = 243;

    public static final int LEG_DATED_DATE = 739;

    public static final int UNDERLYING_PX = 810;

    public static final int NO_SECURITY_TYPES = 558;

    public static final int NO_TRD_REG_TIMESTAMPS_GROUP_COUNTER = 768;

    public static final int LIST_SEQ_NO = 67;

    public static final int LEG_POOL = 740;

    public static final int SECURITY_RESPONSE_ID = 322;

    public static final int SECURITY_ALT_ID_SOURCE = 456;

    public static final int NO_UNDERLYINGS = 711;

    public static final int NO_QUOTE_QUALIFIERS = 735;

    public static final int NO_UNDERLYING_STIPS = 887;

    public static final int NO_TRD_REG_TIMESTAMPS = 768;

    public static final int AGREEMENT_DATE = 915;

    public static final int MISC_FEE_BASIS = 891;

    public static final int STATUS_TEXT = 929;

    public static final int CROSS_TYPE = 549;

    public static final int REGIST_REF_ID = 508;

    public static final int NO_NESTED3_PARTY_IDS_GROUP_COUNTER = 948;

    public static final int LIQUIDITY_VALUE = 404;

    public static final int LIQUIDITY_PCT_HIGH = 403;

    public static final int ALLOC_SETTL_CURRENCY = 736;

    public static final int LEG_REPURCHASE_RATE = 252;

    public static final int QUOTE_ENTRY_ID = 299;

    public static final int NO_PARTY_IDS = 453;

    public static final int SECURITY_SUB_TYPE = 762;

    public static final int TRADE_REPORT_TRANS_TYPE = 487;

    public static final int NESTED3_PARTY_ID = 949;

    public static final int NO_RPTS = 82;

    public static final int QUOTE_CANCEL_TYPE = 298;

    public static final int END_CASH = 922;

    public static final int ACCOUNT_TYPE = 581;

    public static final int CONTRA_BROKER = 375;

    public static final int STOP_PX = 99;

    public static final int LIST_ID = 66;

    public static final int ROUTING_ID = 217;

    public static final int LEG_PRICE = 566;

    public static final int NO_REGIST_DTLS = 473;

    public static final int LEG_INSTR_REGISTRY = 599;

    public static final int LEG_SECURITY_TYPE = 609;

    public static final int NO_EVENTS_GROUP_COUNTER = 864;

    public static final int HEART_BT_INT = 108;

    public static final int LEG_ALLOC_ACCT_ID_SOURCE = 674;

    public static final int ROUNDING_DIRECTION = 468;

    public static final int NO_LEG_STIPULATIONS = 683;

    public static final int DELETE_REASON = 285;

    public static final int MISC_FEE_AMT = 137;

    public static final int NUM_BIDDERS = 417;

    public static final int CLEARING_BUSINESS_DATE = 715;

    public static final int PRIOR_SPREAD_INDICATOR = 720;

    public static final int LEG_PRODUCT = 607;

    public static final int USER_STATUS = 926;

    public static final int CURRENCY = 15;

    public static final int NO_DLVY_INST = 85;

    public static final int PRICE_DELTA = 811;

    public static final int EXEC_TYPE = 150;

    public static final int DISTRIB_PAYMENT_METHOD = 477;

    public static final int LAST_NETWORK_RESPONSE_ID = 934;

    public static final int RAW_DATA = 96;

    public static final int PEG_OFFSET_VALUE = 211;

    public static final int TOTAL_TAKEDOWN = 237;

    public static final int TOTAL_NUM_POS_REPORTS = 727;

    public static final int BID_DESCRIPTOR_TYPE = 399;

    public static final int REVERSAL_INDICATOR = 700;

    public static final int ORDER_CAPACITY = 528;

    public static final int LEG_COUPON_PAYMENT_DATE = 248;

    public static final int NO_LEG_ALLOCS_GROUP_COUNTER = 670;

    public static final int NEXT_EXPECTED_MSG_SEQ_NUM = 789;

    public static final int USER_REQUEST_ID = 923;

    public static final int ON_BEHALF_OF_SUB_ID = 116;

    public static final int ENCODED_ALLOC_TEXT_LEN = 360;

    public static final int PAYMENT_REF = 476;

    public static final int BENCHMARK_CURVE_POINT = 222;

    public static final int SECONDARY_EXEC_ID = 527;

    public static final int LEG_STRIKE_CURRENCY = 942;

    public static final int RESET_SEQ_NUM_FLAG = 141;

    public static final int STAND_INST_DB_NAME = 170;

    public static final int COPY_MSG_INDICATOR = 797;

    public static final int MID_PX = 631;

    public static final int NO_UNDERLYING_STIPS_GROUP_COUNTER = 887;

    public static final int TAX_ADVANTAGE_TYPE = 495;

    public static final int MIN_QTY = 110;

    public static final int REGIST_STATUS = 506;

    public static final int LEG_BENCHMARK_PRICE_TYPE = 680;

    public static final int UNDERLYING_COUPON_PAYMENT_DATE = 241;

    public static final int POS_MAINT_RPT_REF_ID = 714;

    public static final int TRADE_REQUEST_TYPE = 569;

    public static final int PRIOR_SETTL_PRICE = 734;

    public static final int TRD_TYPE = 828;

    public static final int DESIGNATION = 494;

    public static final int UNDERLYING_CURRENT_VALUE = 885;

    public static final int CUM_QTY = 14;

    public static final int TRADE_REPORT_ID = 571;

    public static final int UNDERLYING_START_VALUE = 884;

    public static final int VALID_UNTIL_TIME = 62;

    public static final int QUOTE_REQUEST_TYPE = 303;

    public static final int ISSUE_DATE = 225;

    public static final int CASH_DISTRIB_AGENT_ACCT_NUMBER = 500;

    public static final int CASH_DISTRIB_AGENT_ACCT_NAME = 502;

    public static final int NO_SECURITY_TYPES_GROUP_COUNTER = 558;

    public static final int STRIKE_TIME = 443;

    public static final int SECURITY_REQUEST_RESULT = 560;

    public static final int ALLOC_REPORT_TYPE = 794;

    public static final int YIELD = 236;

    public static final int BID_SPOT_RATE = 188;

    public static final int REGIST_TRANS_TYPE = 514;

    public static final int LEG_QTY = 687;

    public static final int COMMISSION = 12;

    public static final int NO_TRADING_SESSIONS_GROUP_COUNTER = 386;

    public static final int PARTY_SUB_ID = 523;

    public static final int NO_CONTRA_BROKERS_GROUP_COUNTER = 382;

    public static final int MASS_STATUS_REQ_ID = 584;

    public static final int USER_STATUS_TEXT = 927;

    public static final int M_D_ENTRY_REF_ID = 280;

    public static final int ACCRUED_INTEREST_RATE = 158;

    public static final int QUOTE_SET_ID = 302;

    public static final int LEG_CURRENCY = 556;

    public static final int M_D_ENTRY_ORIGINATOR = 282;

    public static final int NET_MONEY = 118;

    public static final int LEG_I_O_I_QTY = 682;

    public static final int ENCODED_LIST_STATUS_TEXT_LEN = 445;

    public static final int NESTED_PARTY_ID = 524;

    public static final int HANDL_INST = 21;

    public static final int LEG_MATURITY_DATE = 611;

    public static final int ON_BEHALF_OF_LOCATION_ID = 144;

    public static final int LEG_STIPULATION_TYPE = 688;

    public static final int MID_YIELD = 633;

    public static final int ENCRYPT_METHOD = 98;

    public static final int QUOTE_ID = 117;

    public static final int ORD_TYPE = 40;

    public static final int REGIST_REJ_REASON_CODE = 507;

    public static final int OFFER_YIELD = 634;

    public static final int SIDE_MULTI_LEG_REPORTING_TYPE = 752;

    public static final int NESTED2_PARTY_SUB_ID = 760;

    public static final int NUMBER_OF_ORDERS = 346;

    public static final int QUOTE_RESPONSE_LEVEL = 301;

    public static final int PUBLISH_TRD_INDICATOR = 852;

    public static final int ENCODED_SECURITY_DESC_LEN = 350;

    public static final int QUOTE_REQUEST_REJECT_REASON = 658;

    public static final int LEG_SECURITY_ALT_ID = 605;

    public static final int NESTED2_PARTY_SUB_ID_TYPE = 807;

    public static final int LEG_LAST_PX = 637;

    public static final int ENCODED_ISSUER = 349;

    public static final int BUSINESS_REJECT_REF_ID = 379;

    public static final int ADV_ID = 2;

    public static final int DISCRETION_PRICE = 845;

    public static final int NO_NESTED_PARTY_IDS = 539;

    public static final int MIN_TRADE_VOL = 562;

    public static final int NO_UNDERLYINGS_GROUP_COUNTER = 711;

    public static final int PRICE2 = 640;

    public static final int PROG_PERIOD_INTERVAL = 415;

    public static final int SECURITY_EXCHANGE = 207;

    public static final int CLIENT_BID_ID = 391;

    public static final int I_O_I_QTY = 27;

    public static final int LEAVES_QTY = 151;

    public static final int PASSWORD = 554;

    public static final int LEG_SIDE = 624;

    public static final int DISCRETION_OFFSET_VALUE = 389;

    public static final int NO_NESTED2_PARTY_SUB_IDS_GROUP_COUNTER = 806;

    public static final int LEG_CONTRACT_SETTL_MONTH = 955;

    public static final int NO_LINES_OF_TEXT_GROUP_COUNTER = 33;

    public static final int UNDERLYING_TRADING_SESSION_SUB_ID = 823;

    public static final int STIPULATION_VALUE = 234;

    public static final int START_CASH = 921;

    public static final int SETTL_TYPE = 63;

    public static final int BENCHMARK_CURVE_NAME = 221;

    public static final int SCOPE = 546;

    public static final int NO_STIPULATIONS_GROUP_COUNTER = 232;

    public static final int POSS_DUP_FLAG = 43;

    public static final int ENCODED_UNDERLYING_ISSUER = 363;

    public static final int OFFER_SIZE = 135;

    public static final int ALLOC_ACCOUNT = 79;

    public static final int COLL_ASGN_REJECT_REASON = 906;

    public static final int UNDERLYING_COUPON_RATE = 435;

    public static final int STRIKE_CURRENCY = 947;

    public static final int ORDER_BOOKING_QTY = 800;

    public static final int COUPON_PAYMENT_DATE = 224;

    public static final int SETTL_SESS_ID = 716;

    public static final int UNDERLYING_TRADING_SESSION_ID = 822;

    public static final int YIELD_REDEMPTION_PRICE_TYPE = 698;

    public static final int ORIG_ORD_MOD_TIME = 586;

    public static final int SETTL_CURR_OFFER_FX_RATE = 657;

    public static final int UNDERLYING_SETTL_PRICE = 732;

    public static final int EXEC_INST = 18;

    public static final int DELIVERY_TYPE = 919;

    public static final int M_D_REQ_REJ_REASON = 281;

    public static final int CASH_MARGIN = 544;

    public static final int LEG_ISSUE_DATE = 249;

    public static final int ALLOC_TRANS_TYPE = 71;

    public static final int RESPONSE_TRANSPORT_TYPE = 725;

    public static final int NO_EXECS = 124;

    public static final int UNDERLYING_SECURITY_ALT_ID = 458;

    public static final int G_T_BOOKING_INST = 427;

    public static final int COUNTRY = 421;

    public static final int ORIG_CL_ORD_ID = 41;

    public static final int BID_REQUEST_TRANS_TYPE = 374;

    public static final int NO_M_D_ENTRY_TYPES_GROUP_COUNTER = 267;

    public static final int PARTICIPATION_RATE = 849;

    public static final int UNDERLYING_DIRTY_PRICE = 882;

    public static final int TRD_SUB_TYPE = 829;

    public static final int SETTL_DATE = 64;

    public static final int ORDER_PERCENT = 516;

    public static final int MARGIN_RATIO = 898;

    public static final int LEG_MATURITY_MONTH_YEAR = 610;

    public static final int NO_LEG_STIPULATIONS_GROUP_COUNTER = 683;

    public static final int COLL_INQUIRY_QUALIFIER = 896;

    public static final int DELIVER_TO_LOCATION_ID = 145;

    public static final int POS_MAINT_RPT_ID = 721;

    public static final int CONTRA_TRADER = 337;

    public static final int ALLOC_SETTL_INST_TYPE = 780;

    public static final int E_F_P_TRACKING_ERROR = 405;

    public static final int TRADING_SESSION_SUB_ID = 625;

    public static final int INSTR_ATTRIB_VALUE = 872;

    public static final int LEG_COVERED_OR_UNCOVERED = 565;

    public static final int UNDERLYING_STRIKE_PRICE = 316;

    public static final int OFFER_PX = 133;

    public static final int NO_BID_COMPONENTS_GROUP_COUNTER = 420;

    public static final int LEG_OPT_ATTRIBUTE = 613;

    public static final int DELIVERY_DATE = 743;

    public static final int ALLOC_NET_MONEY = 154;

    public static final int NO_SETTL_INST_GROUP_COUNTER = 778;

    public static final int AVG_PX = 6;

    public static final int SETTL_CURR_BID_FX_RATE = 656;

    public static final int LIQUIDITY_PCT_LOW = 402;

    public static final int EXPIRATION_CYCLE = 827;

    public static final int LEG_STRIKE_PRICE = 612;

    public static final int R_F_Q_REQ_ID = 644;

    public static final int BODY_LENGTH = 9;

    public static final int AUTO_ACCEPT_INDICATOR = 754;

    public static final int MSG_SEQ_NUM = 34;

    public static final int MASS_STATUS_REQ_TYPE = 585;

    public static final int REPORTED_PX = 861;

    public static final int OPEN_INTEREST = 746;

    public static final int I_O_I_NATURAL_FLAG = 130;

    public static final int CONT_AMT_VALUE = 520;

    public static final int SECURE_DATA = 91;

    public static final int MKT_BID_PX = 645;

    public static final int TARGET_STRATEGY = 847;

    public static final int PAYMENT_METHOD = 492;

    public static final int ODD_LOT = 575;

    public static final int REPO_COLLATERAL_SECURITY_TYPE = 239;

    public static final int LEG_SECURITY_ID_SOURCE = 603;

    public static final int NO_INSTR_ATTRIB = 870;

    public static final int HIGH_PX = 332;

    public static final int AVG_PX_INDICATOR = 819;

    public static final int SIDE_VALUE1 = 396;

    public static final int UNDERLYING_REDEMPTION_DATE = 247;

    public static final int TRADE_ORIGINATION_DATE = 229;

    public static final int DISCRETION_ROUND_DIRECTION = 844;

    public static final int ENCODED_LEG_ISSUER_LEN = 618;

    public static final int LAST_SPOT_RATE = 194;

    public static final int DELIVER_TO_COMP_ID = 128;

    public static final int SIDE_VALUE2 = 397;

    public static final int UNDERLYING_REPURCHASE_RATE = 245;

    public static final int TRADE_REPORT_REJECT_REASON = 751;

    public static final int ENCODED_LEG_SECURITY_DESC = 622;

    public static final int COLL_ASGN_ID = 902;

    public static final int SHORT_QTY = 705;

    public static final int UNDERLYING_C_P_REG_TYPE = 878;

    public static final int UNDERLYING_LOCALE_OF_ISSUE = 594;

    public static final int ADV_TRANS_TYPE = 5;

    public static final int CASH_DISTRIB_AGENT_CODE = 499;

    public static final int MAX_FLOOR = 111;

    public static final int ALLOC_INTERMED_REQ_TYPE = 808;

    public static final int SHORT_SALE_REASON = 853;

    public static final int TRADED_FLAT_SWITCH = 258;

    public static final int DLVY_INST_TYPE = 787;

    public static final int NO_CONTRA_BROKERS = 382;

    public static final int AFFECTED_ORDER_ID = 535;

    public static final int SETTL_DELIVERY_TYPE = 172;

    public static final int NESTED3_PARTY_ROLE = 951;

    public static final int TRADE_CONDITION = 277;

    public static final int TRAD_SES_END_TIME = 345;

    public static final int SHARED_COMMISSION = 858;

    public static final int TARGET_STRATEGY_PARAMETERS = 848;

    public static final int ENCODED_LEG_SECURITY_DESC_LEN = 621;

    public static final int URGENCY = 61;

    public static final int EX_DESTINATION = 100;

    public static final int POS_TRANS_TYPE = 709;

    public static final int ALLOC_ACCRUED_INTEREST_AMT = 742;

    public static final int UNDERLYING_END_VALUE = 886;

    public static final int NET_GROSS_IND = 430;

    public static final int BEGIN_STRING = 8;

    public static final int ORIG_SENDING_TIME = 122;

    public static final int SECONDARY_TRADE_REPORT_ID = 818;

    public static final int PRODUCT = 460;

    public static final int NO_QUOTE_QUALIFIERS_GROUP_COUNTER = 735;

    public static final int OWNER_TYPE = 522;

    public static final int PARTY_SUB_ID_TYPE = 803;

    public static final int I_O_I_ID = 23;

    public static final int POOL = 691;

    public static final int DEF_OFFER_SIZE = 294;

    public static final int NO_LINES_OF_TEXT = 33;

    public static final int SECURITY_TRADING_STATUS = 326;

    public static final int POS_AMT = 708;

    public static final int CREDIT_RATING = 255;

    public static final int PEG_MOVE_TYPE = 835;

    public static final int COLL_INQUIRY_ID = 909;

    public static final int NO_ROUTING_IDS_GROUP_COUNTER = 215;

    public static final int OPT_ATTRIBUTE = 206;

    public static final int TOTAL_VOLUME_TRADED = 387;

    public static final int DAY_BOOKING_INST = 589;

    public static final int NO_NESTED3_PARTY_IDS = 948;

    public static final int LEG_INTEREST_ACCRUAL_DATE = 956;

    public static final int CONTRA_TRADE_TIME = 438;

    public static final int ADV_REF_ID = 3;

    public static final int NO_NESTED_PARTY_IDS_GROUP_COUNTER = 539;

    public static final int MATURITY_NET_MONEY = 890;

    public static final int NO_SETTL_PARTY_SUB_IDS_GROUP_COUNTER = 801;

    public static final int SENDER_LOCATION_ID = 142;

    public static final int REF_ALLOC_ID = 72;

    public static final int COUNTRY_OF_ISSUE = 470;

    public static final int NO_NESTED_PARTY_SUB_IDS_GROUP_COUNTER = 804;

    public static final int TOT_NO_ALLOCS = 892;

    public static final int LOW_PX = 333;

    public static final int MONEY_LAUNDERING_STATUS = 481;

    public static final int CARD_START_DATE = 503;

    public static final int NUM_TICKETS = 395;

    public static final int TOTAL_ACCRUED_INTEREST_AMT = 540;

    public static final int LAST_QTY = 32;

    public static final int M_D_ENTRY_DATE = 272;

    public static final int AVG_PAR_PX = 860;

    public static final int AGREEMENT_CURRENCY = 918;

    public static final int NO_I_O_I_QUALIFIERS = 199;

    public static final int C_P_PROGRAM = 875;

    public static final int LIQUIDITY_IND_TYPE = 409;

    public static final int POS_MAINT_ACTION = 712;

    public static final int UNDERLYING_REPURCHASE_TERM = 244;

    public static final int LEG_SYMBOL = 600;

    public static final int LAST_PX = 31;

    public static final int LEG_STIPULATION_VALUE = 689;

    public static final int NO_UNDERLYING_SECURITY_ALT_ID_GROUP_COUNTER = 457;

    public static final int LAST_MKT = 30;

    public static final int LEG_SECURITY_EXCHANGE = 616;

    public static final int UNDERLYING_CONTRACT_MULTIPLIER = 436;

    public static final int END_DATE = 917;

    public static final int ACCRUED_INTEREST_AMT = 159;

    public static final int TRAD_SES_METHOD = 338;

    public static final int MASS_CANCEL_REJECT_REASON = 532;

    public static final int COLL_ASGN_REF_ID = 907;

    public static final int UNDERLYING_END_PRICE = 883;

    public static final int TOT_NUM_TRADE_REPORTS = 748;

    public static final int BENCHMARK_SECURITY_ID = 699;

    public static final int NO_QUOTE_ENTRIES_GROUP_COUNTER = 295;

    public static final int ALLOC_HANDL_INST = 209;

    public static final int TOT_NUM_ASSIGNMENT_REPORTS = 832;

    public static final int ALLOC_LINK_TYPE = 197;

    public static final int END_SEQ_NO = 16;

    public static final int SETTL_CURR_FX_RATE_CALC = 156;

    public static final int TARGET_COMP_ID = 56;

    public static final int NO_SIDES_GROUP_COUNTER = 552;

    public static final int CONTRACT_SETTL_MONTH = 667;

    public static final int UNDERLYING_STIP_TYPE = 888;

    public static final int CARD_HOLDER_NAME = 488;

    public static final int DELIVERY_FORM = 668;

    public static final int ORDER_QTY2 = 192;

    public static final int NO_COLL_INQUIRY_QUALIFIER = 938;

    public static final int M_D_ENTRY_SIZE = 271;

    public static final int OFFER_FORWARD_POINTS2 = 643;

    public static final int SETTL_INST_ID = 162;

    public static final int REF_COMP_ID = 930;

    public static final int ENCODED_HEADLINE_LEN = 358;

    public static final int UNDERLYING_SETTL_PRICE_TYPE = 733;

    public static final int TRAD_SES_STATUS_REJ_REASON = 567;

    public static final int CONFIRM_TRANS_TYPE = 666;

    public static final int LEG_CONTRACT_MULTIPLIER = 614;

    public static final int COLL_ASGN_REASON = 895;

    public static final int QUANTITY_TYPE = 465;

    public static final int BASIS_PX_TYPE = 419;

    public static final int NO_BID_COMPONENTS = 420;

    public static final int WAVE_NO = 105;

    public static final int M_D_ENTRY_POSITION_NO = 290;

    public static final int COVERED_OR_UNCOVERED = 203;

    public static final int QUOTE_TYPE = 537;

    public static final int HOP_REF_ID = 630;

    public static final int NO_SECURITY_ALT_ID = 454;

    public static final int UNDERLYING_MATURITY_MONTH_YEAR = 313;

    public static final int EFFECTIVE_TIME = 168;

    public static final int UNDERLYING_MATURITY_DATE = 542;

    public static final int TRAD_SES_OPEN_TIME = 342;

    public static final int TRANSACT_TIME = 60;

    public static final int NO_ORDERS_GROUP_COUNTER = 73;

    public static final int CROSS_PERCENT = 413;

    public static final int TOT_NUM_REPORTS = 911;

    public static final int CONFIRM_STATUS = 665;

    public static final int PEG_ROUND_DIRECTION = 838;

    public static final int NO_NESTED_PARTY_SUB_IDS = 804;

    public static final int OFFER_FORWARD_POINTS = 191;

    public static final int EXCHANGE_RULE = 825;

    public static final int TERMINATION_TYPE = 788;

    public static final int NESTED3_PARTY_SUB_ID_TYPE = 954;

    public static final int NO_MISC_FEES_GROUP_COUNTER = 136;

    public static final int TRADE_REPORT_REF_ID = 572;

    public static final int NO_BID_DESCRIPTORS_GROUP_COUNTER = 398;

    public static final int NO_TRADING_SESSIONS = 386;

    public static final int NESTED3_PARTY_SUB_ID = 953;

    public static final int ALLOWABLE_ONE_SIDEDNESS_CURR = 767;

    public static final int C_P_REG_TYPE = 876;

    public static final int LEG_OFFER_PX = 684;

    public static final int REPORT_TO_EXCH = 113;

    public static final int NO_CONT_AMTS = 518;

    public static final int LEG_ALLOC_ACCOUNT = 671;

    public static final int COLL_INQUIRY_RESULT = 946;

    public static final int NUM_DAYS_INTEREST = 157;

    public static final int SENDER_COMP_ID = 49;

    public static final int EMAIL_TYPE = 94;

    public static final int NESTED2_PARTY_ROLE = 759;

    public static final int PROG_RPT_REQS = 414;

    public static final int EMAIL_THREAD_ID = 164;

    public static final int AFFECTED_SECONDARY_ORDER_ID = 536;

    public static final int TRADING_SESSION_ID = 336;

    public static final int SETTL_CURRENCY = 120;

    public static final int ASSIGNMENT_METHOD = 744;

    public static final int UNDERLYING_SECURITY_DESC = 307;

    public static final int NO_CLEARING_INSTRUCTIONS = 576;

    public static final int POS_REQ_STATUS = 729;

    public static final int BID_DESCRIPTOR = 400;

    public static final int ENCODED_SECURITY_DESC = 351;

    public static final int CARD_EXP_DATE = 490;

    public static final int SETTL_INST_REF_ID = 214;

    public static final int M_D_MKT = 275;

    public static final int SETTL_INST_MODE = 160;

    public static final int ADJUSTMENT = 334;

    public static final int PAYMENT_DATE = 504;

    public static final int SECURITY_ID_SOURCE = 22;

    public static final int SECONDARY_CL_ORD_ID = 526;

    public static final int CXL_REJ_RESPONSE_TO = 434;

    public static final int INTEREST_ACCRUAL_DATE = 874;

    public static final int PEG_SCOPE = 840;

    public static final int ENCODED_UNDERLYING_ISSUER_LEN = 362;

    public static final int STATE_OR_PROVINCE_OF_ISSUE = 471;

    public static final int NESTED_PARTY_ID_SOURCE = 525;

    public static final int PEGGED_PRICE = 839;

    public static final int ORDER_RESTRICTIONS = 529;

    public static final int RESPONSE_DESTINATION = 726;

    public static final int EXCHANGE_FOR_PHYSICAL = 411;

    public static final int UNDERLYING_STATE_OR_PROVINCE_OF_ISSUE = 593;

    public static final int NO_ALT_M_D_SOURCE = 816;

    public static final int PRICE_IMPROVEMENT = 639;

    public static final int LEG_ORDER_QTY = 685;

    public static final int D_K_REASON = 127;

    public static final int NO_ALT_M_D_SOURCE_GROUP_COUNTER = 816;

    public static final int UNDERLYING_CREDIT_RATING = 256;

    public static final int NO_PARTY_IDS_GROUP_COUNTER = 453;

    public static final int FINANCIAL_STATUS = 291;

    public static final int TOTAL_AFFECTED_ORDERS = 533;

    public static final int THRESHOLD_AMOUNT = 834;

    public static final int NO_POS_AMT = 753;

    public static final int NO_CAPACITIES_GROUP_COUNTER = 862;

    public static final int TOT_NO_RELATED_SYM = 393;

    public static final int ORDER_INPUT_DEVICE = 821;

    public static final int U_R_L_LINK = 149;

    public static final int ALLOC_NO_ORDERS_TYPE = 857;

    public static final int TRADE_ALLOC_INDICATOR = 826;

    public static final int DISCRETION_LIMIT_TYPE = 843;

    public static final int NESTED2_PARTY_ID = 757;

    public static final int ALLOC_TEXT = 161;

    public static final int QUOTE_SET_VALID_UNTIL_TIME = 367;

    public static final int NESTED2_PARTY_ID_SOURCE = 758;

    public static final int CXL_REJ_REASON = 102;

    public static final int QUOTE_QUALIFIER = 695;

    public static final int LIQUIDITY_NUM_SECURITIES = 441;

    public static final int TIME_BRACKET = 943;

    public static final int I_O_I_QLTY_IND = 25;

    public static final int TOT_NO_STRIKES = 422;

    public static final int LEG_STATE_OR_PROVINCE_OF_ISSUE = 597;

    public static final int NO_NESTED3_PARTY_SUB_IDS_GROUP_COUNTER = 952;

    public static final int REGIST_DTLS = 509;

    public static final int BID_TYPE = 394;

    public static final int REGIST_ID = 513;

    public static final int POS_AMT_TYPE = 707;

    public static final int NETWORK_STATUS_RESPONSE_TYPE = 937;

    public static final int MKT_OFFER_PX = 646;

    public static final int ASGN_REQ_ID = 831;

    public static final int LAST_UPDATE_TIME = 779;

    public static final int STAND_INST_DB_ID = 171;

    public static final int ENCODED_UNDERLYING_SECURITY_DESC = 365;

    public static final int CXL_QTY = 84;

    public static final int ALLOC_SETTL_CURR_AMT = 737;

    public static final int INC_TAX_IND = 416;

    public static final int ASSIGNMENT_UNIT = 745;

    public static final int NEW_SEQ_NO = 36;

    public static final int LEG_ISSUER = 617;

    public static final int APPL_QUEUE_MAX = 812;

    public static final int SUBSCRIPTION_REQUEST_TYPE = 263;

    public static final int CL_ORD_ID = 11;

    public static final int LEG_SECURITY_SUB_TYPE = 764;

    public static final int UNDERLYING_SECURITY_TYPE = 310;

    public static final int APPL_QUEUE_DEPTH = 813;

    public static final int ENCODED_ISSUER_LEN = 348;

    public static final int PRICE = 44;

    public static final int ENCODED_ALLOC_TEXT = 361;

    public static final int NETWORK_REQUEST_ID = 933;

    public static final int CLEARING_FEE_INDICATOR = 635;

    public static final int TRAD_SES_PRE_CLOSE_TIME = 343;

    public static final int WT_AVERAGE_LIQUIDITY = 410;

    public static final int INVESTOR_COUNTRY_OF_RESIDENCE = 475;

    public static final int EXPIRE_TIME = 126;

    public static final int STATUS_VALUE = 928;

    public static final int EXEC_PRICE_ADJUSTMENT = 485;

    public static final int ORDER_QTY = 38;

    public static final int ISSUER = 106;

    public static final int SYMBOL = 55;

    public static final int TOT_NO_ORDERS = 68;

    public static final int QUOTE_STATUS = 297;

    public static final int SECURITY_REQUEST_TYPE = 321;

    public static final int INSTR_REGISTRY = 543;

    public static final int INDIVIDUAL_ALLOC_ID = 467;

    public static final int TRANSFER_REASON = 830;

    public static final int QUOTE_CONDITION = 276;

    public static final int M_D_ENTRY_TYPE = 269;

    public static final int NO_QUOTE_ENTRIES = 295;

    public static final int LEG_REDEMPTION_DATE = 254;

    public static final int LEG_C_F_I_CODE = 608;

    public static final int RAW_DATA_LENGTH = 95;

    public static final int NESTED3_PARTY_ID_SOURCE = 950;

    public static final int IN_VIEW_OF_COMMON = 328;

    public static final int UNDERLYING_FACTOR = 246;

    public static final int UNDERLYING_SYMBOL_SFX = 312;

    public static final int GAP_FILL_FLAG = 123;

    public static final int NO_LEG_ALLOCS = 670;

    public static final int LEG_REPO_COLLATERAL_SECURITY_TYPE = 250;

    public static final int CARD_ISS_NUM = 491;

    public static final int ALLOWABLE_ONE_SIDEDNESS_VALUE = 766;

    public static final int COLL_ACTION = 944;

    public static final int GROSS_TRADE_AMT = 381;

    public static final int ACCT_ID_SOURCE = 660;

    public static final int HOP_SENDING_TIME = 629;

    public static final int CONTRARY_INSTRUCTION_INDICATOR = 719;

    public static final int PREALLOC_METHOD = 591;

    public static final int I_O_I_TRANS_TYPE = 28;

    public static final int CONFIRM_TYPE = 773;

    public static final int MULTI_LEG_RPT_TYPE_REQ = 563;

    public static final int QUOTE_ENTRY_REJECT_REASON = 368;

    public static final int INSTR_ATTRIB_TYPE = 871;

    public static final int NO_COLL_INQUIRY_QUALIFIER_GROUP_COUNTER = 938;

    public static final int REGIST_ACCT_TYPE = 493;

    public static final int BOOKING_REF_ID = 466;

    public static final int TRADE_REQUEST_RESULT = 749;

    public static final int ALLOC_ID = 70;

    public static final int OUTSIDE_INDEX_PCT = 407;

    public static final int UNDERLYING_PRODUCT = 462;

    public static final int PAYMENT_REMITTER_ID = 505;

    public static final int POS_QTY_STATUS = 706;

    public static final int BID_FORWARD_POINTS = 189;

    public static final int REPURCHASE_TERM = 226;

    public static final int UNDERLYING_SECURITY_EXCHANGE = 308;

    public static final int LIST_STATUS_TYPE = 429;

    public static final int UNDERLYING_LAST_QTY = 652;

    public static final int MASS_CANCEL_RESPONSE = 531;

    public static final int I_O_I_QUALIFIER = 104;

    public static final int POS_MAINT_STATUS = 722;

    public static final int LEG_SWAP_TYPE = 690;

    public static final int POSS_RESEND = 97;

    public static final int USER_REQUEST_TYPE = 924;

    public static final int ENCODED_LIST_EXEC_INST = 353;

    public static final int POS_REQ_RESULT = 728;

    public static final int LIST_ORDER_STATUS = 431;

    public static final int BID_SIZE = 134;

    public static final int NO_CONT_AMTS_GROUP_COUNTER = 518;

    public static final int SECURITY_REQ_ID = 320;

    public static final int TICK_DIRECTION = 274;

    public static final int REF_TAG_ID = 371;

    public static final int AGGREGATED_BOOK = 266;

    public static final int LOCALE_OF_ISSUE = 472;

    public static final int YIELD_CALC_DATE = 701;

    public static final int NO_DATES = 580;

    public static final int BENCHMARK_SECURITY_ID_SOURCE = 761;

    public static final int NO_ALLOCS = 78;

    public static final int PUT_OR_CALL = 201;

    public static final int ORDER_CAPACITY_QTY = 863;

    public static final int COMM_CURRENCY = 479;

    public static final int UNDERLYING_COUNTRY_OF_ISSUE = 592;

    public static final int ENCODED_HEADLINE = 359;

    public static final int CONT_AMT_CURR = 521;

    public static final int MATCH_TYPE = 574;

    public static final int SETTL_INST_REQ_ID = 791;

    public static final int NO_TRADES_GROUP_COUNTER = 897;

    public static final int PEG_LIMIT_TYPE = 837;

    public static final int CONFIRM_REJ_REASON = 774;

    public static final int LONG_QTY = 704;

    public static final int DAY_ORDER_QTY = 424;

    public static final int NESTED_PARTY_SUB_ID_TYPE = 805;

    public static final int FUND_RENEW_WAIV = 497;

    public static final int BID_YIELD = 632;

    public static final int NO_CAPACITIES = 862;

    public static final int TEST_MESSAGE_INDICATOR = 464;

    public static final int UNDERLYING_C_F_I_CODE = 463;

    public static final int NO_NESTED2_PARTY_IDS = 756;

    public static final int NO_AFFECTED_ORDERS_GROUP_COUNTER = 534;

    public static final int MISC_FEE_CURR = 138;

    public static final int TIME_IN_FORCE = 59;

    public static final int SECONDARY_TRD_TYPE = 855;

    public static final int SECONDARY_ALLOC_ID = 793;

    public static final int LAST_CAPACITY = 29;

    public static final int NO_DLVY_INST_GROUP_COUNTER = 85;

    public static final int TARGET_SUB_ID = 57;

    public static final int UNDERLYING_CURRENCY = 318;

    public static final int UNSOLICITED_INDICATOR = 325;

    public static final int ALLOC_STATUS = 87;

    public static final int NO_POS_AMT_GROUP_COUNTER = 753;

    public static final int NO_MISC_FEES = 136;

    public static final int CONTRA_TRADE_QTY = 437;

    public static final int M_D_UPDATE_TYPE = 265;

    public static final int BENCHMARK_PRICE = 662;

    public static final int MARGIN_EXCESS = 899;

    public static final int EXEC_REF_ID = 19;

    public static final int TARGET_LOCATION_ID = 143;

    public static final int LEG_SYMBOL_SFX = 601;

    public static final int HOP_COMP_ID = 628;

    public static final int ORIG_TIME = 42;

    public static final int BOOKING_UNIT = 590;

    public static final int TRD_REG_TIMESTAMP = 769;

    public static final int SELL_VOLUME = 331;

    public static final int PARTY_ID_SOURCE = 447;

    public static final int APPL_QUEUE_RESOLUTION = 814;

    public static final int NO_M_D_ENTRY_TYPES = 267;

    public static final int NEW_PASSWORD = 925;

    public static final int ORD_REJ_REASON = 103;

    public static final int STRIKE_PRICE = 202;

    public static final int TRD_MATCH_ID = 880;

    public static final int AGREEMENT_DESC = 913;

    public static final int DELIVER_TO_SUB_ID = 129;

    public static final int TRAD_SES_START_TIME = 341;

    public static final int SUBJECT = 147;

    public static final int TOT_NO_SECURITY_TYPES = 557;

    public static final int ADJUSTMENT_TYPE = 718;

    public static final int SETTL_PARTY_ID = 782;

    public static final int SECURITY_ALT_ID = 455;

    public static final int NO_LEGS = 555;

    public static final int PEG_OFFSET_TYPE = 836;

    public static final int PCT_AT_RISK = 869;

    public static final int ACCOUNT = 1;

    public static final int SETTL_SESS_SUB_ID = 717;

    public static final int UNDERLYING_SECURITY_ID_SOURCE = 305;

    public static final int SETTL_CURR_FX_RATE = 155;

    public static final int LEG_ALLOC_QTY = 673;

    public static final int TRADE_REPORT_TYPE = 856;

    public static final int SETTL_INST_TRANS_TYPE = 163;

    public static final int LEG_RATIO_QTY = 623;

    public static final int ALLOC_ACCOUNT_TYPE = 798;

    public static final int M_D_UPDATE_ACTION = 279;

    public static final int ON_BEHALF_OF_COMP_ID = 115;

    public static final int EVENT_PX = 867;

    public static final int DAY_AVG_PX = 426;

    public static final int BASIS_FEATURE_DATE = 259;

    public static final int NO_QUOTE_SETS_GROUP_COUNTER = 296;

    public static final int BEGIN_SEQ_NO = 7;

    public static final int POS_REQ_TYPE = 724;

    public static final int MASS_CANCEL_REQUEST_TYPE = 530;

    public static final int SOLICITED_FLAG = 377;

    public static final int M_D_REQ_ID = 262;

    public static final int COLL_ASGN_TRANS_TYPE = 903;

    public static final int CASH_DISTRIB_PAY_REF = 501;

    public static final int SIDE_COMPLIANCE_ID = 659;

    public static final int TRD_REG_TIMESTAMP_ORIGIN = 771;

    public static final int SECURITY_RESPONSE_TYPE = 323;

    public static final int ENCODED_LIST_STATUS_TEXT = 446;

    public static final int OFFER_SPOT_RATE = 190;

    public static final int COLL_STATUS = 910;

    public static final int NO_EXECS_GROUP_COUNTER = 124;

    public static final int STIPULATION_TYPE = 233;

    public static final int TRAD_SES_CLOSE_TIME = 344;

    public static final int ALLOC_REJ_CODE = 88;

    public static final int M_D_ENTRY_SELLER = 289;

    public static final int ADV_SIDE = 4;

    public static final int LEG_BENCHMARK_CURVE_NAME = 677;

    public static final int CHECK_SUM = 10;

    public static final int LEG_BENCHMARK_PRICE = 679;

    public static final int REDEMPTION_DATE = 240;

    public static final int QUOTE_RESP_TYPE = 694;

    public static final int LEG_BENCHMARK_CURVE_POINT = 678;

    public static final int SECURITY_TYPE = 167;

    public static final int EXERCISE_METHOD = 747;

    public static final int POS_REQ_ID = 710;

    public static final int STAND_INST_DB_TYPE = 169;

    public static final int ALLOC_LINK_ID = 196;

    public static final int MIN_OFFER_SIZE = 648;

    public static final int LEG_COUNTRY_OF_ISSUE = 596;

    public static final int SETTL_INST_MSG_ID = 777;

    public static final int NO_UNDERLYING_SECURITY_ALT_ID = 457;

    public static final int CONT_AMT_TYPE = 519;

    public static final int LEG_INDIVIDUAL_ALLOC_ID = 672;

    public static final int COLL_RPT_ID = 908;

    public static final int EX_DATE = 230;

    public static final int TRADE_DATE = 75;

    public static final int INDIVIDUAL_ALLOC_REJ_CODE = 776;

    public static final int NO_LEGS_GROUP_COUNTER = 555;

    public static final int ORD_STATUS_REQ_ID = 790;

    public static final int ROUTING_TYPE = 216;

    public static final int APPL_QUEUE_ACTION = 815;

    public static final int ENCODED_SUBJECT_LEN = 356;

    public static final int TRD_RPT_STATUS = 939;

    public static final int BENCHMARK_PRICE_TYPE = 663;

    public static final int PRIORITY_INDICATOR = 638;

    public static final int ENCODED_LIST_EXEC_INST_LEN = 352;

    public static final int SECURITY_LIST_REQUEST_TYPE = 559;

    public static final int ALLOC_TYPE = 626;

    public static final int NO_STRIKES = 428;

    public static final int COMM_TYPE = 13;

    public static final int QTY_TYPE = 854;

    public static final int EXEC_RESTATEMENT_REASON = 378;

    public static final int LEG_BENCHMARK_CURVE_CURRENCY = 676;

    public static final int SIGNATURE_LENGTH = 93;

    public static final int NO_COMP_IDS = 936;

    public static final int CONTRACT_MULTIPLIER = 231;

    public static final int XML_DATA = 213;

    public static final int SETTL_PRICE_TYPE = 731;

    public static final int MULTI_LEG_REPORTING_TYPE = 442;

    public static final int LAST_FORWARD_POINTS = 195;

    public static final int NO_I_O_I_QUALIFIERS_GROUP_COUNTER = 199;

    public static final int CARD_NUMBER = 489;

    public static final int SECONDARY_TRADE_REPORT_REF_ID = 881;

    public static final int TRADE_REQUEST_ID = 568;

    public static final int ORDER_ID = 37;

    public static final int NO_NESTED3_PARTY_SUB_IDS = 952;

    public static final int START_DATE = 916;

    public static final int END_ACCRUED_INTEREST_AMT = 920;

    public static final int ORD_STATUS = 39;

    public static final int NO_ORDERS = 73;

    public static final int EVENT_TEXT = 868;

    public static final int PREV_CLOSE_PX = 140;

    public static final int LAST_FORWARD_POINTS2 = 641;

    public static final int BENCHMARK_CURVE_CURRENCY = 220;

    public static final int REPURCHASE_RATE = 227;

    public static final int COMPLIANCE_ID = 376;

    public static final int ROUNDING_MODULUS = 469;

    public static final int CASH_OUTSTANDING = 901;

    public static final int PROCESS_CODE = 81;

    public static final int YIELD_TYPE = 235;

    public static final int BID_FORWARD_POINTS2 = 642;

    public static final int TRD_REG_TIMESTAMP_TYPE = 770;

    public static final int ORDER_AVG_PX = 799;

    public static final int ORIG_CROSS_ID = 551;

    public static final int M_D_ENTRY_ID = 278;

    public static final int QUOTE_REQ_ID = 131;

    public static final int NESTED_PARTY_ROLE = 538;

    public static final int NO_INSTR_ATTRIB_GROUP_COUNTER = 870;

    public static final int NO_SECURITY_ALT_ID_GROUP_COUNTER = 454;

    public static final int DISCRETION_SCOPE = 846;

    public static final int UNDERLYING_SECURITY_ID = 309;

    public static final int OWNERSHIP_TYPE = 517;

    public static final int UNDERLYING_OPT_ATTRIBUTE = 317;

    public static final int OUT_MAIN_CNTRY_U_INDEX = 412;

    public static final int LAST_FRAGMENT = 893;

    public static final int NO_PARTY_SUB_IDS_GROUP_COUNTER = 802;

    public static final int SETTL_PARTY_ROLE = 784;

    public static final int ENCODED_UNDERLYING_SECURITY_DESC_LEN = 364;

    public static final int LEG_BID_PX = 681;

    public static final int MSG_DIRECTION = 385;

    public static final int NO_DISTRIB_INSTS_GROUP_COUNTER = 510;

    public static final int REGIST_EMAIL = 511;

    public static final int YIELD_REDEMPTION_PRICE = 697;

    public static final int ALLOC_CANC_REPLACE_REASON = 796;

    public static final int SECURITY_DESC = 107;

    public static final int NO_SETTL_PARTY_SUB_IDS = 801;

    public static final int LAST_PAR_PX = 669;

    public static final int REF_MSG_TYPE = 372;

    public static final int QUANTITY = 53;

    public static final int MAX_SHOW = 210;

    public static final int DATED_DATE = 873;

    public static final int SESSION_REJECT_REASON = 373;

    public static final int MATURITY_DATE = 541;

    public static final int MISC_FEE_TYPE = 139;

    public static final int SIGNATURE = 89;

    public static final int UNDERLYING_SECURITY_SUB_TYPE = 763;

    public static final IntHashSet ALL_FIELDS = new IntHashSet(1948);
    static
    {
        ALL_FIELDS.add(Constants.LIST_STATUS_TEXT);
        ALL_FIELDS.add(Constants.EVENT_DATE);
        ALL_FIELDS.add(Constants.AGREEMENT_ID);
        ALL_FIELDS.add(Constants.MAILING_INST);
        ALL_FIELDS.add(Constants.UNDERLYING_LAST_PX);
        ALL_FIELDS.add(Constants.M_D_IMPLICIT_DELETE);
        ALL_FIELDS.add(Constants.BID_PX);
        ALL_FIELDS.add(Constants.NOTIFY_BROKER_OF_CREDIT);
        ALL_FIELDS.add(Constants.REF_SEQ_NUM);
        ALL_FIELDS.add(Constants.M_D_ENTRY_BUYER);
        ALL_FIELDS.add(Constants.SETTL_INST_SOURCE);
        ALL_FIELDS.add(Constants.TRANS_BKD_TIME);
        ALL_FIELDS.add(Constants.NO_NESTED2_PARTY_IDS_GROUP_COUNTER);
        ALL_FIELDS.add(Constants.CONFIRM_REF_ID);
        ALL_FIELDS.add(Constants.UNDERLYING_QTY);
        ALL_FIELDS.add(Constants.COLL_REQ_ID);
        ALL_FIELDS.add(Constants.CROSS_ID);
        ALL_FIELDS.add(Constants.CUST_ORDER_CAPACITY);
        ALL_FIELDS.add(Constants.LEG_SECURITY_ALT_ID_SOURCE);
        ALL_FIELDS.add(Constants.NO_SETTL_PARTY_IDS);
        ALL_FIELDS.add(Constants.NETWORK_REQUEST_TYPE);
        ALL_FIELDS.add(Constants.LEG_SETTL_DATE);
        ALL_FIELDS.add(Constants.TRAD_SES_MODE);
        ALL_FIELDS.add(Constants.AVG_PX_PRECISION);
        ALL_FIELDS.add(Constants.CASH_DISTRIB_AGENT_NAME);
        ALL_FIELDS.add(Constants.UNDERLYING_SECURITY_ALT_ID_SOURCE);
        ALL_FIELDS.add(Constants.CORPORATE_ACTION);
        ALL_FIELDS.add(Constants.CONFIRM_ID);
        ALL_FIELDS.add(Constants.OPEN_CLOSE_SETTL_FLAG);
        ALL_FIELDS.add(Constants.TARGET_STRATEGY_PERFORMANCE);
        ALL_FIELDS.add(Constants.DUE_TO_RELATED);
        ALL_FIELDS.add(Constants.M_D_ENTRY_PX);
        ALL_FIELDS.add(Constants.LEG_SECURITY_ID);
        ALL_FIELDS.add(Constants.VALUE_OF_FUTURES);
        ALL_FIELDS.add(Constants.QUOTE_RESP_ID);
        ALL_FIELDS.add(Constants.BASIS_FEATURE_PRICE);
        ALL_FIELDS.add(Constants.BUY_VOLUME);
        ALL_FIELDS.add(Constants.SETTL_PARTY_SUB_ID);
        ALL_FIELDS.add(Constants.FOREX_REQ);
        ALL_FIELDS.add(Constants.POS_TYPE);
        ALL_FIELDS.add(Constants.DESK_ID);
        ALL_FIELDS.add(Constants.DISTRIB_PERCENTAGE);
        ALL_FIELDS.add(Constants.NO_REGIST_DTLS_GROUP_COUNTER);
        ALL_FIELDS.add(Constants.TRAD_SES_STATUS);
        ALL_FIELDS.add(Constants.LIST_NAME);
        ALL_FIELDS.add(Constants.FAIR_VALUE);
        ALL_FIELDS.add(Constants.LOCATE_REQD);
        ALL_FIELDS.add(Constants.MESSAGE_ENCODING);
        ALL_FIELDS.add(Constants.NO_BID_DESCRIPTORS);
        ALL_FIELDS.add(Constants.EXEC_VALUATION_POINT);
        ALL_FIELDS.add(Constants.LEG_LOCALE_OF_ISSUE);
        ALL_FIELDS.add(Constants.TRADE_LEG_REF_ID);
        ALL_FIELDS.add(Constants.ORIG_POS_REQ_REF_ID);
        ALL_FIELDS.add(Constants.CROSS_PRIORITIZATION);
        ALL_FIELDS.add(Constants.NO_M_D_ENTRIES);
        ALL_FIELDS.add(Constants.UNDERLYING_ISSUER);
        ALL_FIELDS.add(Constants.ALLOC_QTY);
        ALL_FIELDS.add(Constants.SYMBOL_SFX);
        ALL_FIELDS.add(Constants.EXPIRE_DATE);
        ALL_FIELDS.add(Constants.NO_LEG_SECURITY_ALT_ID);
        ALL_FIELDS.add(Constants.NO_EVENTS);
        ALL_FIELDS.add(Constants.ALLOC_ACCT_ID_SOURCE);
        ALL_FIELDS.add(Constants.XML_DATA_LEN);
        ALL_FIELDS.add(Constants.C_F_I_CODE);
        ALL_FIELDS.add(Constants.COLL_INQUIRY_STATUS);
        ALL_FIELDS.add(Constants.LEG_SETTL_TYPE);
        ALL_FIELDS.add(Constants.NO_PARTY_SUB_IDS);
        ALL_FIELDS.add(Constants.REGIST_REJ_REASON_TEXT);
        ALL_FIELDS.add(Constants.ENCODED_TEXT_LEN);
        ALL_FIELDS.add(Constants.LIST_EXEC_INST_TYPE);
        ALL_FIELDS.add(Constants.DEF_BID_SIZE);
        ALL_FIELDS.add(Constants.NO_RELATED_SYM_GROUP_COUNTER);
        ALL_FIELDS.add(Constants.INTEREST_AT_MATURITY);
        ALL_FIELDS.add(Constants.HEADLINE);
        ALL_FIELDS.add(Constants.LEG_PRICE_TYPE);
        ALL_FIELDS.add(Constants.MATCH_STATUS);
        ALL_FIELDS.add(Constants.BOOKING_TYPE);
        ALL_FIELDS.add(Constants.NO_QUOTE_SETS);
        ALL_FIELDS.add(Constants.PARTY_ROLE);
        ALL_FIELDS.add(Constants.SENDER_SUB_ID);
        ALL_FIELDS.add(Constants.CASH_ORDER_QTY);
        ALL_FIELDS.add(Constants.SIDE_VALUE_IND);
        ALL_FIELDS.add(Constants.NO_DATES_GROUP_COUNTER);
        ALL_FIELDS.add(Constants.LEG_SECURITY_DESC);
        ALL_FIELDS.add(Constants.YIELD_REDEMPTION_DATE);
        ALL_FIELDS.add(Constants.UNDERLYING_INSTR_REGISTRY);
        ALL_FIELDS.add(Constants.NO_MSG_TYPES);
        ALL_FIELDS.add(Constants.UNDERLYING_STIP_VALUE);
        ALL_FIELDS.add(Constants.PRICE_TYPE);
        ALL_FIELDS.add(Constants.LEGAL_CONFIRM);
        ALL_FIELDS.add(Constants.TOTAL_NET_VALUE);
        ALL_FIELDS.add(Constants.TRAD_SES_REQ_ID);
        ALL_FIELDS.add(Constants.NO_STRIKES_GROUP_COUNTER);
        ALL_FIELDS.add(Constants.LEG_POSITION_EFFECT);
        ALL_FIELDS.add(Constants.NO_SIDES);
        ALL_FIELDS.add(Constants.ASGN_RPT_ID);
        ALL_FIELDS.add(Constants.NO_ROUTING_IDS);
        ALL_FIELDS.add(Constants.ROUND_LOT);
        ALL_FIELDS.add(Constants.ALLOC_PRICE);
        ALL_FIELDS.add(Constants.SECURITY_ID);
        ALL_FIELDS.add(Constants.TRADE_LINK_ID);
        ALL_FIELDS.add(Constants.AFFIRM_STATUS);
        ALL_FIELDS.add(Constants.LAST_LIQUIDITY_IND);
        ALL_FIELDS.add(Constants.NO_M_D_ENTRIES_GROUP_COUNTER);
        ALL_FIELDS.add(Constants.SETTL_CURR_AMT);
        ALL_FIELDS.add(Constants.ALLOC_REPORT_ID);
        ALL_FIELDS.add(Constants.RPT_SEQ);
        ALL_FIELDS.add(Constants.NO_RELATED_SYM);
        ALL_FIELDS.add(Constants.BUSINESS_REJECT_REASON);
        ALL_FIELDS.add(Constants.DISCRETION_MOVE_TYPE);
        ALL_FIELDS.add(Constants.SECONDARY_ORDER_ID);
        ALL_FIELDS.add(Constants.NO_TRADES);
        ALL_FIELDS.add(Constants.NO_COMP_IDS_GROUP_COUNTER);
        ALL_FIELDS.add(Constants.NO_STIPULATIONS);
        ALL_FIELDS.add(Constants.QUOTE_STATUS_REQ_ID);
        ALL_FIELDS.add(Constants.NO_LEG_SECURITY_ALT_ID_GROUP_COUNTER);
        ALL_FIELDS.add(Constants.USERNAME);
        ALL_FIELDS.add(Constants.ALLOWABLE_ONE_SIDEDNESS_PCT);
        ALL_FIELDS.add(Constants.TEST_REQ_ID);
        ALL_FIELDS.add(Constants.LAST_MSG_SEQ_NUM_PROCESSED);
        ALL_FIELDS.add(Constants.CLEARING_INSTRUCTION);
        ALL_FIELDS.add(Constants.TOT_NO_QUOTE_ENTRIES);
        ALL_FIELDS.add(Constants.BID_TRADE_TYPE);
        ALL_FIELDS.add(Constants.MAILING_DTLS);
        ALL_FIELDS.add(Constants.EXEC_ID);
        ALL_FIELDS.add(Constants.ENCODED_TEXT);
        ALL_FIELDS.add(Constants.SETTL_INST_REQ_REJ_CODE);
        ALL_FIELDS.add(Constants.LOCATION_ID);
        ALL_FIELDS.add(Constants.UNDERLYING_PUT_OR_CALL);
        ALL_FIELDS.add(Constants.WORKING_INDICATOR);
        ALL_FIELDS.add(Constants.MIN_BID_SIZE);
        ALL_FIELDS.add(Constants.POSITION_EFFECT);
        ALL_FIELDS.add(Constants.LEG_FACTOR);
        ALL_FIELDS.add(Constants.DATE_OF_BIRTH);
        ALL_FIELDS.add(Constants.ENCODED_SUBJECT);
        ALL_FIELDS.add(Constants.MARKET_DEPTH);
        ALL_FIELDS.add(Constants.NO_POSITIONS);
        ALL_FIELDS.add(Constants.NO_POSITIONS_GROUP_COUNTER);
        ALL_FIELDS.add(Constants.NO_AFFECTED_ORDERS);
        ALL_FIELDS.add(Constants.SELLER_DAYS);
        ALL_FIELDS.add(Constants.CONTRA_LEG_REF_ID);
        ALL_FIELDS.add(Constants.NO_SETTL_INST);
        ALL_FIELDS.add(Constants.UNDERLYING_STRIKE_CURRENCY);
        ALL_FIELDS.add(Constants.MAX_MESSAGE_SIZE);
        ALL_FIELDS.add(Constants.SETTL_PRICE);
        ALL_FIELDS.add(Constants.UNDERLYING_SYMBOL);
        ALL_FIELDS.add(Constants.SETTL_PARTY_SUB_ID_TYPE);
        ALL_FIELDS.add(Constants.NO_DISTRIB_INSTS);
        ALL_FIELDS.add(Constants.TRADE_REQUEST_STATUS);
        ALL_FIELDS.add(Constants.LIST_EXEC_INST);
        ALL_FIELDS.add(Constants.NET_CHG_PREV_DAY);
        ALL_FIELDS.add(Constants.SETTL_DATE2);
        ALL_FIELDS.add(Constants.QUOTE_PRICE_TYPE);
        ALL_FIELDS.add(Constants.I_O_I_REF_ID);
        ALL_FIELDS.add(Constants.SIDE);
        ALL_FIELDS.add(Constants.SECURITY_STATUS_REQ_ID);
        ALL_FIELDS.add(Constants.UNDERLYING_ISSUE_DATE);
        ALL_FIELDS.add(Constants.SENDING_TIME);
        ALL_FIELDS.add(Constants.DISCRETION_OFFSET_TYPE);
        ALL_FIELDS.add(Constants.SECURE_DATA_LEN);
        ALL_FIELDS.add(Constants.ALLOC_INTEREST_AT_MATURITY);
        ALL_FIELDS.add(Constants.LEG_REPURCHASE_TERM);
        ALL_FIELDS.add(Constants.DAY_CUM_QTY);
        ALL_FIELDS.add(Constants.COUPON_RATE);
        ALL_FIELDS.add(Constants.UNDERLYING_C_P_PROGRAM);
        ALL_FIELDS.add(Constants.ALLOC_REPORT_REF_ID);
        ALL_FIELDS.add(Constants.REF_SUB_ID);
        ALL_FIELDS.add(Constants.NO_CLEARING_INSTRUCTIONS_GROUP_COUNTER);
        ALL_FIELDS.add(Constants.QUOTE_REJECT_REASON);
        ALL_FIELDS.add(Constants.POS_MAINT_RESULT);
        ALL_FIELDS.add(Constants.TRADE_INPUT_SOURCE);
        ALL_FIELDS.add(Constants.TEXT);
        ALL_FIELDS.add(Constants.MSG_TYPE);
        ALL_FIELDS.add(Constants.BID_ID);
        ALL_FIELDS.add(Constants.CONCESSION);
        ALL_FIELDS.add(Constants.CONFIRM_REQ_ID);
        ALL_FIELDS.add(Constants.ALLOC_AVG_PX);
        ALL_FIELDS.add(Constants.COLL_ASGN_RESP_TYPE);
        ALL_FIELDS.add(Constants.ENCODED_LEG_ISSUER);
        ALL_FIELDS.add(Constants.ALT_M_D_SOURCE_ID);
        ALL_FIELDS.add(Constants.NO_ALLOCS_GROUP_COUNTER);
        ALL_FIELDS.add(Constants.CASH_DISTRIB_CURR);
        ALL_FIELDS.add(Constants.TRADE_INPUT_DEVICE);
        ALL_FIELDS.add(Constants.NO_SETTL_PARTY_IDS_GROUP_COUNTER);
        ALL_FIELDS.add(Constants.NO_NESTED2_PARTY_SUB_IDS);
        ALL_FIELDS.add(Constants.MATURITY_MONTH_YEAR);
        ALL_FIELDS.add(Constants.LEG_REF_ID);
        ALL_FIELDS.add(Constants.EVENT_TYPE);
        ALL_FIELDS.add(Constants.NO_MSG_TYPES_GROUP_COUNTER);
        ALL_FIELDS.add(Constants.EXEC_PRICE_TYPE);
        ALL_FIELDS.add(Constants.DISCRETION_INST);
        ALL_FIELDS.add(Constants.LEG_CREDIT_RATING);
        ALL_FIELDS.add(Constants.PREVIOUSLY_REPORTED);
        ALL_FIELDS.add(Constants.SETTL_PARTY_ID_SOURCE);
        ALL_FIELDS.add(Constants.SPREAD);
        ALL_FIELDS.add(Constants.LAST_RPT_REQUESTED);
        ALL_FIELDS.add(Constants.LEG_COUPON_RATE);
        ALL_FIELDS.add(Constants.NO_HOPS);
        ALL_FIELDS.add(Constants.PARTY_ID);
        ALL_FIELDS.add(Constants.FACTOR);
        ALL_FIELDS.add(Constants.HALT_REASON);
        ALL_FIELDS.add(Constants.CL_ORD_LINK_ID);
        ALL_FIELDS.add(Constants.CANCELLATION_RIGHTS);
        ALL_FIELDS.add(Constants.NESTED_PARTY_SUB_ID);
        ALL_FIELDS.add(Constants.COLL_RESP_ID);
        ALL_FIELDS.add(Constants.NETWORK_RESPONSE_ID);
        ALL_FIELDS.add(Constants.M_D_ENTRY_TIME);
        ALL_FIELDS.add(Constants.LEG_SETTL_CURRENCY);
        ALL_FIELDS.add(Constants.UNDERLYING_REPO_COLLATERAL_SECURITY_TYPE);
        ALL_FIELDS.add(Constants.LEG_DATED_DATE);
        ALL_FIELDS.add(Constants.UNDERLYING_PX);
        ALL_FIELDS.add(Constants.NO_SECURITY_TYPES);
        ALL_FIELDS.add(Constants.NO_TRD_REG_TIMESTAMPS_GROUP_COUNTER);
        ALL_FIELDS.add(Constants.LIST_SEQ_NO);
        ALL_FIELDS.add(Constants.LEG_POOL);
        ALL_FIELDS.add(Constants.SECURITY_RESPONSE_ID);
        ALL_FIELDS.add(Constants.SECURITY_ALT_ID_SOURCE);
        ALL_FIELDS.add(Constants.NO_UNDERLYINGS);
        ALL_FIELDS.add(Constants.NO_QUOTE_QUALIFIERS);
        ALL_FIELDS.add(Constants.NO_UNDERLYING_STIPS);
        ALL_FIELDS.add(Constants.NO_TRD_REG_TIMESTAMPS);
        ALL_FIELDS.add(Constants.AGREEMENT_DATE);
        ALL_FIELDS.add(Constants.MISC_FEE_BASIS);
        ALL_FIELDS.add(Constants.STATUS_TEXT);
        ALL_FIELDS.add(Constants.CROSS_TYPE);
        ALL_FIELDS.add(Constants.REGIST_REF_ID);
        ALL_FIELDS.add(Constants.NO_NESTED3_PARTY_IDS_GROUP_COUNTER);
        ALL_FIELDS.add(Constants.LIQUIDITY_VALUE);
        ALL_FIELDS.add(Constants.LIQUIDITY_PCT_HIGH);
        ALL_FIELDS.add(Constants.ALLOC_SETTL_CURRENCY);
        ALL_FIELDS.add(Constants.LEG_REPURCHASE_RATE);
        ALL_FIELDS.add(Constants.QUOTE_ENTRY_ID);
        ALL_FIELDS.add(Constants.NO_PARTY_IDS);
        ALL_FIELDS.add(Constants.SECURITY_SUB_TYPE);
        ALL_FIELDS.add(Constants.TRADE_REPORT_TRANS_TYPE);
        ALL_FIELDS.add(Constants.NESTED3_PARTY_ID);
        ALL_FIELDS.add(Constants.NO_RPTS);
        ALL_FIELDS.add(Constants.QUOTE_CANCEL_TYPE);
        ALL_FIELDS.add(Constants.END_CASH);
        ALL_FIELDS.add(Constants.ACCOUNT_TYPE);
        ALL_FIELDS.add(Constants.CONTRA_BROKER);
        ALL_FIELDS.add(Constants.STOP_PX);
        ALL_FIELDS.add(Constants.LIST_ID);
        ALL_FIELDS.add(Constants.ROUTING_ID);
        ALL_FIELDS.add(Constants.LEG_PRICE);
        ALL_FIELDS.add(Constants.NO_REGIST_DTLS);
        ALL_FIELDS.add(Constants.LEG_INSTR_REGISTRY);
        ALL_FIELDS.add(Constants.LEG_SECURITY_TYPE);
        ALL_FIELDS.add(Constants.NO_EVENTS_GROUP_COUNTER);
        ALL_FIELDS.add(Constants.HEART_BT_INT);
        ALL_FIELDS.add(Constants.LEG_ALLOC_ACCT_ID_SOURCE);
        ALL_FIELDS.add(Constants.ROUNDING_DIRECTION);
        ALL_FIELDS.add(Constants.NO_LEG_STIPULATIONS);
        ALL_FIELDS.add(Constants.DELETE_REASON);
        ALL_FIELDS.add(Constants.MISC_FEE_AMT);
        ALL_FIELDS.add(Constants.NUM_BIDDERS);
        ALL_FIELDS.add(Constants.CLEARING_BUSINESS_DATE);
        ALL_FIELDS.add(Constants.PRIOR_SPREAD_INDICATOR);
        ALL_FIELDS.add(Constants.LEG_PRODUCT);
        ALL_FIELDS.add(Constants.USER_STATUS);
        ALL_FIELDS.add(Constants.CURRENCY);
        ALL_FIELDS.add(Constants.NO_DLVY_INST);
        ALL_FIELDS.add(Constants.PRICE_DELTA);
        ALL_FIELDS.add(Constants.EXEC_TYPE);
        ALL_FIELDS.add(Constants.DISTRIB_PAYMENT_METHOD);
        ALL_FIELDS.add(Constants.LAST_NETWORK_RESPONSE_ID);
        ALL_FIELDS.add(Constants.RAW_DATA);
        ALL_FIELDS.add(Constants.PEG_OFFSET_VALUE);
        ALL_FIELDS.add(Constants.TOTAL_TAKEDOWN);
        ALL_FIELDS.add(Constants.TOTAL_NUM_POS_REPORTS);
        ALL_FIELDS.add(Constants.BID_DESCRIPTOR_TYPE);
        ALL_FIELDS.add(Constants.REVERSAL_INDICATOR);
        ALL_FIELDS.add(Constants.ORDER_CAPACITY);
        ALL_FIELDS.add(Constants.LEG_COUPON_PAYMENT_DATE);
        ALL_FIELDS.add(Constants.NO_LEG_ALLOCS_GROUP_COUNTER);
        ALL_FIELDS.add(Constants.NEXT_EXPECTED_MSG_SEQ_NUM);
        ALL_FIELDS.add(Constants.USER_REQUEST_ID);
        ALL_FIELDS.add(Constants.ON_BEHALF_OF_SUB_ID);
        ALL_FIELDS.add(Constants.ENCODED_ALLOC_TEXT_LEN);
        ALL_FIELDS.add(Constants.PAYMENT_REF);
        ALL_FIELDS.add(Constants.BENCHMARK_CURVE_POINT);
        ALL_FIELDS.add(Constants.SECONDARY_EXEC_ID);
        ALL_FIELDS.add(Constants.LEG_STRIKE_CURRENCY);
        ALL_FIELDS.add(Constants.RESET_SEQ_NUM_FLAG);
        ALL_FIELDS.add(Constants.STAND_INST_DB_NAME);
        ALL_FIELDS.add(Constants.COPY_MSG_INDICATOR);
        ALL_FIELDS.add(Constants.MID_PX);
        ALL_FIELDS.add(Constants.NO_UNDERLYING_STIPS_GROUP_COUNTER);
        ALL_FIELDS.add(Constants.TAX_ADVANTAGE_TYPE);
        ALL_FIELDS.add(Constants.MIN_QTY);
        ALL_FIELDS.add(Constants.REGIST_STATUS);
        ALL_FIELDS.add(Constants.LEG_BENCHMARK_PRICE_TYPE);
        ALL_FIELDS.add(Constants.UNDERLYING_COUPON_PAYMENT_DATE);
        ALL_FIELDS.add(Constants.POS_MAINT_RPT_REF_ID);
        ALL_FIELDS.add(Constants.TRADE_REQUEST_TYPE);
        ALL_FIELDS.add(Constants.PRIOR_SETTL_PRICE);
        ALL_FIELDS.add(Constants.TRD_TYPE);
        ALL_FIELDS.add(Constants.DESIGNATION);
        ALL_FIELDS.add(Constants.UNDERLYING_CURRENT_VALUE);
        ALL_FIELDS.add(Constants.CUM_QTY);
        ALL_FIELDS.add(Constants.TRADE_REPORT_ID);
        ALL_FIELDS.add(Constants.UNDERLYING_START_VALUE);
        ALL_FIELDS.add(Constants.VALID_UNTIL_TIME);
        ALL_FIELDS.add(Constants.QUOTE_REQUEST_TYPE);
        ALL_FIELDS.add(Constants.ISSUE_DATE);
        ALL_FIELDS.add(Constants.CASH_DISTRIB_AGENT_ACCT_NUMBER);
        ALL_FIELDS.add(Constants.CASH_DISTRIB_AGENT_ACCT_NAME);
        ALL_FIELDS.add(Constants.NO_SECURITY_TYPES_GROUP_COUNTER);
        ALL_FIELDS.add(Constants.STRIKE_TIME);
        ALL_FIELDS.add(Constants.SECURITY_REQUEST_RESULT);
        ALL_FIELDS.add(Constants.ALLOC_REPORT_TYPE);
        ALL_FIELDS.add(Constants.YIELD);
        ALL_FIELDS.add(Constants.BID_SPOT_RATE);
        ALL_FIELDS.add(Constants.REGIST_TRANS_TYPE);
        ALL_FIELDS.add(Constants.LEG_QTY);
        ALL_FIELDS.add(Constants.COMMISSION);
        ALL_FIELDS.add(Constants.NO_TRADING_SESSIONS_GROUP_COUNTER);
        ALL_FIELDS.add(Constants.PARTY_SUB_ID);
        ALL_FIELDS.add(Constants.NO_CONTRA_BROKERS_GROUP_COUNTER);
        ALL_FIELDS.add(Constants.MASS_STATUS_REQ_ID);
        ALL_FIELDS.add(Constants.USER_STATUS_TEXT);
        ALL_FIELDS.add(Constants.M_D_ENTRY_REF_ID);
        ALL_FIELDS.add(Constants.ACCRUED_INTEREST_RATE);
        ALL_FIELDS.add(Constants.QUOTE_SET_ID);
        ALL_FIELDS.add(Constants.LEG_CURRENCY);
        ALL_FIELDS.add(Constants.M_D_ENTRY_ORIGINATOR);
        ALL_FIELDS.add(Constants.NET_MONEY);
        ALL_FIELDS.add(Constants.LEG_I_O_I_QTY);
        ALL_FIELDS.add(Constants.ENCODED_LIST_STATUS_TEXT_LEN);
        ALL_FIELDS.add(Constants.NESTED_PARTY_ID);
        ALL_FIELDS.add(Constants.HANDL_INST);
        ALL_FIELDS.add(Constants.LEG_MATURITY_DATE);
        ALL_FIELDS.add(Constants.ON_BEHALF_OF_LOCATION_ID);
        ALL_FIELDS.add(Constants.LEG_STIPULATION_TYPE);
        ALL_FIELDS.add(Constants.MID_YIELD);
        ALL_FIELDS.add(Constants.ENCRYPT_METHOD);
        ALL_FIELDS.add(Constants.QUOTE_ID);
        ALL_FIELDS.add(Constants.ORD_TYPE);
        ALL_FIELDS.add(Constants.REGIST_REJ_REASON_CODE);
        ALL_FIELDS.add(Constants.OFFER_YIELD);
        ALL_FIELDS.add(Constants.SIDE_MULTI_LEG_REPORTING_TYPE);
        ALL_FIELDS.add(Constants.NESTED2_PARTY_SUB_ID);
        ALL_FIELDS.add(Constants.NUMBER_OF_ORDERS);
        ALL_FIELDS.add(Constants.QUOTE_RESPONSE_LEVEL);
        ALL_FIELDS.add(Constants.PUBLISH_TRD_INDICATOR);
        ALL_FIELDS.add(Constants.ENCODED_SECURITY_DESC_LEN);
        ALL_FIELDS.add(Constants.QUOTE_REQUEST_REJECT_REASON);
        ALL_FIELDS.add(Constants.LEG_SECURITY_ALT_ID);
        ALL_FIELDS.add(Constants.NESTED2_PARTY_SUB_ID_TYPE);
        ALL_FIELDS.add(Constants.LEG_LAST_PX);
        ALL_FIELDS.add(Constants.ENCODED_ISSUER);
        ALL_FIELDS.add(Constants.BUSINESS_REJECT_REF_ID);
        ALL_FIELDS.add(Constants.ADV_ID);
        ALL_FIELDS.add(Constants.DISCRETION_PRICE);
        ALL_FIELDS.add(Constants.NO_NESTED_PARTY_IDS);
        ALL_FIELDS.add(Constants.MIN_TRADE_VOL);
        ALL_FIELDS.add(Constants.NO_UNDERLYINGS_GROUP_COUNTER);
        ALL_FIELDS.add(Constants.PRICE2);
        ALL_FIELDS.add(Constants.PROG_PERIOD_INTERVAL);
        ALL_FIELDS.add(Constants.SECURITY_EXCHANGE);
        ALL_FIELDS.add(Constants.CLIENT_BID_ID);
        ALL_FIELDS.add(Constants.I_O_I_QTY);
        ALL_FIELDS.add(Constants.LEAVES_QTY);
        ALL_FIELDS.add(Constants.PASSWORD);
        ALL_FIELDS.add(Constants.LEG_SIDE);
        ALL_FIELDS.add(Constants.DISCRETION_OFFSET_VALUE);
        ALL_FIELDS.add(Constants.NO_NESTED2_PARTY_SUB_IDS_GROUP_COUNTER);
        ALL_FIELDS.add(Constants.LEG_CONTRACT_SETTL_MONTH);
        ALL_FIELDS.add(Constants.NO_LINES_OF_TEXT_GROUP_COUNTER);
        ALL_FIELDS.add(Constants.UNDERLYING_TRADING_SESSION_SUB_ID);
        ALL_FIELDS.add(Constants.STIPULATION_VALUE);
        ALL_FIELDS.add(Constants.START_CASH);
        ALL_FIELDS.add(Constants.SETTL_TYPE);
        ALL_FIELDS.add(Constants.BENCHMARK_CURVE_NAME);
        ALL_FIELDS.add(Constants.SCOPE);
        ALL_FIELDS.add(Constants.NO_STIPULATIONS_GROUP_COUNTER);
        ALL_FIELDS.add(Constants.POSS_DUP_FLAG);
        ALL_FIELDS.add(Constants.ENCODED_UNDERLYING_ISSUER);
        ALL_FIELDS.add(Constants.OFFER_SIZE);
        ALL_FIELDS.add(Constants.ALLOC_ACCOUNT);
        ALL_FIELDS.add(Constants.COLL_ASGN_REJECT_REASON);
        ALL_FIELDS.add(Constants.UNDERLYING_COUPON_RATE);
        ALL_FIELDS.add(Constants.STRIKE_CURRENCY);
        ALL_FIELDS.add(Constants.ORDER_BOOKING_QTY);
        ALL_FIELDS.add(Constants.COUPON_PAYMENT_DATE);
        ALL_FIELDS.add(Constants.SETTL_SESS_ID);
        ALL_FIELDS.add(Constants.UNDERLYING_TRADING_SESSION_ID);
        ALL_FIELDS.add(Constants.YIELD_REDEMPTION_PRICE_TYPE);
        ALL_FIELDS.add(Constants.ORIG_ORD_MOD_TIME);
        ALL_FIELDS.add(Constants.SETTL_CURR_OFFER_FX_RATE);
        ALL_FIELDS.add(Constants.UNDERLYING_SETTL_PRICE);
        ALL_FIELDS.add(Constants.EXEC_INST);
        ALL_FIELDS.add(Constants.DELIVERY_TYPE);
        ALL_FIELDS.add(Constants.M_D_REQ_REJ_REASON);
        ALL_FIELDS.add(Constants.CASH_MARGIN);
        ALL_FIELDS.add(Constants.LEG_ISSUE_DATE);
        ALL_FIELDS.add(Constants.ALLOC_TRANS_TYPE);
        ALL_FIELDS.add(Constants.RESPONSE_TRANSPORT_TYPE);
        ALL_FIELDS.add(Constants.NO_EXECS);
        ALL_FIELDS.add(Constants.UNDERLYING_SECURITY_ALT_ID);
        ALL_FIELDS.add(Constants.G_T_BOOKING_INST);
        ALL_FIELDS.add(Constants.COUNTRY);
        ALL_FIELDS.add(Constants.ORIG_CL_ORD_ID);
        ALL_FIELDS.add(Constants.BID_REQUEST_TRANS_TYPE);
        ALL_FIELDS.add(Constants.NO_M_D_ENTRY_TYPES_GROUP_COUNTER);
        ALL_FIELDS.add(Constants.PARTICIPATION_RATE);
        ALL_FIELDS.add(Constants.UNDERLYING_DIRTY_PRICE);
        ALL_FIELDS.add(Constants.TRD_SUB_TYPE);
        ALL_FIELDS.add(Constants.SETTL_DATE);
        ALL_FIELDS.add(Constants.ORDER_PERCENT);
        ALL_FIELDS.add(Constants.MARGIN_RATIO);
        ALL_FIELDS.add(Constants.LEG_MATURITY_MONTH_YEAR);
        ALL_FIELDS.add(Constants.NO_LEG_STIPULATIONS_GROUP_COUNTER);
        ALL_FIELDS.add(Constants.COLL_INQUIRY_QUALIFIER);
        ALL_FIELDS.add(Constants.DELIVER_TO_LOCATION_ID);
        ALL_FIELDS.add(Constants.POS_MAINT_RPT_ID);
        ALL_FIELDS.add(Constants.CONTRA_TRADER);
        ALL_FIELDS.add(Constants.ALLOC_SETTL_INST_TYPE);
        ALL_FIELDS.add(Constants.E_F_P_TRACKING_ERROR);
        ALL_FIELDS.add(Constants.TRADING_SESSION_SUB_ID);
        ALL_FIELDS.add(Constants.INSTR_ATTRIB_VALUE);
        ALL_FIELDS.add(Constants.LEG_COVERED_OR_UNCOVERED);
        ALL_FIELDS.add(Constants.UNDERLYING_STRIKE_PRICE);
        ALL_FIELDS.add(Constants.OFFER_PX);
        ALL_FIELDS.add(Constants.NO_BID_COMPONENTS_GROUP_COUNTER);
        ALL_FIELDS.add(Constants.LEG_OPT_ATTRIBUTE);
        ALL_FIELDS.add(Constants.DELIVERY_DATE);
        ALL_FIELDS.add(Constants.ALLOC_NET_MONEY);
        ALL_FIELDS.add(Constants.NO_SETTL_INST_GROUP_COUNTER);
        ALL_FIELDS.add(Constants.AVG_PX);
        ALL_FIELDS.add(Constants.SETTL_CURR_BID_FX_RATE);
        ALL_FIELDS.add(Constants.LIQUIDITY_PCT_LOW);
        ALL_FIELDS.add(Constants.EXPIRATION_CYCLE);
        ALL_FIELDS.add(Constants.LEG_STRIKE_PRICE);
        ALL_FIELDS.add(Constants.R_F_Q_REQ_ID);
        ALL_FIELDS.add(Constants.BODY_LENGTH);
        ALL_FIELDS.add(Constants.AUTO_ACCEPT_INDICATOR);
        ALL_FIELDS.add(Constants.MSG_SEQ_NUM);
        ALL_FIELDS.add(Constants.MASS_STATUS_REQ_TYPE);
        ALL_FIELDS.add(Constants.REPORTED_PX);
        ALL_FIELDS.add(Constants.OPEN_INTEREST);
        ALL_FIELDS.add(Constants.I_O_I_NATURAL_FLAG);
        ALL_FIELDS.add(Constants.CONT_AMT_VALUE);
        ALL_FIELDS.add(Constants.SECURE_DATA);
        ALL_FIELDS.add(Constants.MKT_BID_PX);
        ALL_FIELDS.add(Constants.TARGET_STRATEGY);
        ALL_FIELDS.add(Constants.PAYMENT_METHOD);
        ALL_FIELDS.add(Constants.ODD_LOT);
        ALL_FIELDS.add(Constants.REPO_COLLATERAL_SECURITY_TYPE);
        ALL_FIELDS.add(Constants.LEG_SECURITY_ID_SOURCE);
        ALL_FIELDS.add(Constants.NO_INSTR_ATTRIB);
        ALL_FIELDS.add(Constants.HIGH_PX);
        ALL_FIELDS.add(Constants.AVG_PX_INDICATOR);
        ALL_FIELDS.add(Constants.SIDE_VALUE1);
        ALL_FIELDS.add(Constants.UNDERLYING_REDEMPTION_DATE);
        ALL_FIELDS.add(Constants.TRADE_ORIGINATION_DATE);
        ALL_FIELDS.add(Constants.DISCRETION_ROUND_DIRECTION);
        ALL_FIELDS.add(Constants.ENCODED_LEG_ISSUER_LEN);
        ALL_FIELDS.add(Constants.LAST_SPOT_RATE);
        ALL_FIELDS.add(Constants.DELIVER_TO_COMP_ID);
        ALL_FIELDS.add(Constants.SIDE_VALUE2);
        ALL_FIELDS.add(Constants.UNDERLYING_REPURCHASE_RATE);
        ALL_FIELDS.add(Constants.TRADE_REPORT_REJECT_REASON);
        ALL_FIELDS.add(Constants.ENCODED_LEG_SECURITY_DESC);
        ALL_FIELDS.add(Constants.COLL_ASGN_ID);
        ALL_FIELDS.add(Constants.SHORT_QTY);
        ALL_FIELDS.add(Constants.UNDERLYING_C_P_REG_TYPE);
        ALL_FIELDS.add(Constants.UNDERLYING_LOCALE_OF_ISSUE);
        ALL_FIELDS.add(Constants.ADV_TRANS_TYPE);
        ALL_FIELDS.add(Constants.CASH_DISTRIB_AGENT_CODE);
        ALL_FIELDS.add(Constants.MAX_FLOOR);
        ALL_FIELDS.add(Constants.ALLOC_INTERMED_REQ_TYPE);
        ALL_FIELDS.add(Constants.SHORT_SALE_REASON);
        ALL_FIELDS.add(Constants.TRADED_FLAT_SWITCH);
        ALL_FIELDS.add(Constants.DLVY_INST_TYPE);
        ALL_FIELDS.add(Constants.NO_CONTRA_BROKERS);
        ALL_FIELDS.add(Constants.AFFECTED_ORDER_ID);
        ALL_FIELDS.add(Constants.SETTL_DELIVERY_TYPE);
        ALL_FIELDS.add(Constants.NESTED3_PARTY_ROLE);
        ALL_FIELDS.add(Constants.TRADE_CONDITION);
        ALL_FIELDS.add(Constants.TRAD_SES_END_TIME);
        ALL_FIELDS.add(Constants.SHARED_COMMISSION);
        ALL_FIELDS.add(Constants.TARGET_STRATEGY_PARAMETERS);
        ALL_FIELDS.add(Constants.ENCODED_LEG_SECURITY_DESC_LEN);
        ALL_FIELDS.add(Constants.URGENCY);
        ALL_FIELDS.add(Constants.EX_DESTINATION);
        ALL_FIELDS.add(Constants.POS_TRANS_TYPE);
        ALL_FIELDS.add(Constants.ALLOC_ACCRUED_INTEREST_AMT);
        ALL_FIELDS.add(Constants.UNDERLYING_END_VALUE);
        ALL_FIELDS.add(Constants.NET_GROSS_IND);
        ALL_FIELDS.add(Constants.BEGIN_STRING);
        ALL_FIELDS.add(Constants.ORIG_SENDING_TIME);
        ALL_FIELDS.add(Constants.SECONDARY_TRADE_REPORT_ID);
        ALL_FIELDS.add(Constants.PRODUCT);
        ALL_FIELDS.add(Constants.NO_QUOTE_QUALIFIERS_GROUP_COUNTER);
        ALL_FIELDS.add(Constants.OWNER_TYPE);
        ALL_FIELDS.add(Constants.PARTY_SUB_ID_TYPE);
        ALL_FIELDS.add(Constants.I_O_I_ID);
        ALL_FIELDS.add(Constants.POOL);
        ALL_FIELDS.add(Constants.DEF_OFFER_SIZE);
        ALL_FIELDS.add(Constants.NO_LINES_OF_TEXT);
        ALL_FIELDS.add(Constants.SECURITY_TRADING_STATUS);
        ALL_FIELDS.add(Constants.POS_AMT);
        ALL_FIELDS.add(Constants.CREDIT_RATING);
        ALL_FIELDS.add(Constants.PEG_MOVE_TYPE);
        ALL_FIELDS.add(Constants.COLL_INQUIRY_ID);
        ALL_FIELDS.add(Constants.NO_ROUTING_IDS_GROUP_COUNTER);
        ALL_FIELDS.add(Constants.OPT_ATTRIBUTE);
        ALL_FIELDS.add(Constants.TOTAL_VOLUME_TRADED);
        ALL_FIELDS.add(Constants.DAY_BOOKING_INST);
        ALL_FIELDS.add(Constants.NO_NESTED3_PARTY_IDS);
        ALL_FIELDS.add(Constants.LEG_INTEREST_ACCRUAL_DATE);
        ALL_FIELDS.add(Constants.CONTRA_TRADE_TIME);
        ALL_FIELDS.add(Constants.ADV_REF_ID);
        ALL_FIELDS.add(Constants.NO_NESTED_PARTY_IDS_GROUP_COUNTER);
        ALL_FIELDS.add(Constants.MATURITY_NET_MONEY);
        ALL_FIELDS.add(Constants.NO_SETTL_PARTY_SUB_IDS_GROUP_COUNTER);
        ALL_FIELDS.add(Constants.SENDER_LOCATION_ID);
        ALL_FIELDS.add(Constants.REF_ALLOC_ID);
        ALL_FIELDS.add(Constants.COUNTRY_OF_ISSUE);
        ALL_FIELDS.add(Constants.NO_NESTED_PARTY_SUB_IDS_GROUP_COUNTER);
        ALL_FIELDS.add(Constants.TOT_NO_ALLOCS);
        ALL_FIELDS.add(Constants.LOW_PX);
        ALL_FIELDS.add(Constants.MONEY_LAUNDERING_STATUS);
        ALL_FIELDS.add(Constants.CARD_START_DATE);
        ALL_FIELDS.add(Constants.NUM_TICKETS);
        ALL_FIELDS.add(Constants.TOTAL_ACCRUED_INTEREST_AMT);
        ALL_FIELDS.add(Constants.LAST_QTY);
        ALL_FIELDS.add(Constants.M_D_ENTRY_DATE);
        ALL_FIELDS.add(Constants.AVG_PAR_PX);
        ALL_FIELDS.add(Constants.AGREEMENT_CURRENCY);
        ALL_FIELDS.add(Constants.NO_I_O_I_QUALIFIERS);
        ALL_FIELDS.add(Constants.C_P_PROGRAM);
        ALL_FIELDS.add(Constants.LIQUIDITY_IND_TYPE);
        ALL_FIELDS.add(Constants.POS_MAINT_ACTION);
        ALL_FIELDS.add(Constants.UNDERLYING_REPURCHASE_TERM);
        ALL_FIELDS.add(Constants.LEG_SYMBOL);
        ALL_FIELDS.add(Constants.LAST_PX);
        ALL_FIELDS.add(Constants.LEG_STIPULATION_VALUE);
        ALL_FIELDS.add(Constants.NO_UNDERLYING_SECURITY_ALT_ID_GROUP_COUNTER);
        ALL_FIELDS.add(Constants.LAST_MKT);
        ALL_FIELDS.add(Constants.LEG_SECURITY_EXCHANGE);
        ALL_FIELDS.add(Constants.UNDERLYING_CONTRACT_MULTIPLIER);
        ALL_FIELDS.add(Constants.END_DATE);
        ALL_FIELDS.add(Constants.ACCRUED_INTEREST_AMT);
        ALL_FIELDS.add(Constants.TRAD_SES_METHOD);
        ALL_FIELDS.add(Constants.MASS_CANCEL_REJECT_REASON);
        ALL_FIELDS.add(Constants.COLL_ASGN_REF_ID);
        ALL_FIELDS.add(Constants.UNDERLYING_END_PRICE);
        ALL_FIELDS.add(Constants.TOT_NUM_TRADE_REPORTS);
        ALL_FIELDS.add(Constants.BENCHMARK_SECURITY_ID);
        ALL_FIELDS.add(Constants.NO_QUOTE_ENTRIES_GROUP_COUNTER);
        ALL_FIELDS.add(Constants.ALLOC_HANDL_INST);
        ALL_FIELDS.add(Constants.TOT_NUM_ASSIGNMENT_REPORTS);
        ALL_FIELDS.add(Constants.ALLOC_LINK_TYPE);
        ALL_FIELDS.add(Constants.END_SEQ_NO);
        ALL_FIELDS.add(Constants.SETTL_CURR_FX_RATE_CALC);
        ALL_FIELDS.add(Constants.TARGET_COMP_ID);
        ALL_FIELDS.add(Constants.NO_SIDES_GROUP_COUNTER);
        ALL_FIELDS.add(Constants.CONTRACT_SETTL_MONTH);
        ALL_FIELDS.add(Constants.UNDERLYING_STIP_TYPE);
        ALL_FIELDS.add(Constants.CARD_HOLDER_NAME);
        ALL_FIELDS.add(Constants.DELIVERY_FORM);
        ALL_FIELDS.add(Constants.ORDER_QTY2);
        ALL_FIELDS.add(Constants.NO_COLL_INQUIRY_QUALIFIER);
        ALL_FIELDS.add(Constants.M_D_ENTRY_SIZE);
        ALL_FIELDS.add(Constants.OFFER_FORWARD_POINTS2);
        ALL_FIELDS.add(Constants.SETTL_INST_ID);
        ALL_FIELDS.add(Constants.REF_COMP_ID);
        ALL_FIELDS.add(Constants.ENCODED_HEADLINE_LEN);
        ALL_FIELDS.add(Constants.UNDERLYING_SETTL_PRICE_TYPE);
        ALL_FIELDS.add(Constants.TRAD_SES_STATUS_REJ_REASON);
        ALL_FIELDS.add(Constants.CONFIRM_TRANS_TYPE);
        ALL_FIELDS.add(Constants.LEG_CONTRACT_MULTIPLIER);
        ALL_FIELDS.add(Constants.COLL_ASGN_REASON);
        ALL_FIELDS.add(Constants.QUANTITY_TYPE);
        ALL_FIELDS.add(Constants.BASIS_PX_TYPE);
        ALL_FIELDS.add(Constants.NO_BID_COMPONENTS);
        ALL_FIELDS.add(Constants.WAVE_NO);
        ALL_FIELDS.add(Constants.M_D_ENTRY_POSITION_NO);
        ALL_FIELDS.add(Constants.COVERED_OR_UNCOVERED);
        ALL_FIELDS.add(Constants.QUOTE_TYPE);
        ALL_FIELDS.add(Constants.HOP_REF_ID);
        ALL_FIELDS.add(Constants.NO_SECURITY_ALT_ID);
        ALL_FIELDS.add(Constants.UNDERLYING_MATURITY_MONTH_YEAR);
        ALL_FIELDS.add(Constants.EFFECTIVE_TIME);
        ALL_FIELDS.add(Constants.UNDERLYING_MATURITY_DATE);
        ALL_FIELDS.add(Constants.TRAD_SES_OPEN_TIME);
        ALL_FIELDS.add(Constants.TRANSACT_TIME);
        ALL_FIELDS.add(Constants.NO_ORDERS_GROUP_COUNTER);
        ALL_FIELDS.add(Constants.CROSS_PERCENT);
        ALL_FIELDS.add(Constants.TOT_NUM_REPORTS);
        ALL_FIELDS.add(Constants.CONFIRM_STATUS);
        ALL_FIELDS.add(Constants.PEG_ROUND_DIRECTION);
        ALL_FIELDS.add(Constants.NO_NESTED_PARTY_SUB_IDS);
        ALL_FIELDS.add(Constants.OFFER_FORWARD_POINTS);
        ALL_FIELDS.add(Constants.EXCHANGE_RULE);
        ALL_FIELDS.add(Constants.TERMINATION_TYPE);
        ALL_FIELDS.add(Constants.NESTED3_PARTY_SUB_ID_TYPE);
        ALL_FIELDS.add(Constants.NO_MISC_FEES_GROUP_COUNTER);
        ALL_FIELDS.add(Constants.TRADE_REPORT_REF_ID);
        ALL_FIELDS.add(Constants.NO_BID_DESCRIPTORS_GROUP_COUNTER);
        ALL_FIELDS.add(Constants.NO_TRADING_SESSIONS);
        ALL_FIELDS.add(Constants.NESTED3_PARTY_SUB_ID);
        ALL_FIELDS.add(Constants.ALLOWABLE_ONE_SIDEDNESS_CURR);
        ALL_FIELDS.add(Constants.C_P_REG_TYPE);
        ALL_FIELDS.add(Constants.LEG_OFFER_PX);
        ALL_FIELDS.add(Constants.REPORT_TO_EXCH);
        ALL_FIELDS.add(Constants.NO_CONT_AMTS);
        ALL_FIELDS.add(Constants.LEG_ALLOC_ACCOUNT);
        ALL_FIELDS.add(Constants.COLL_INQUIRY_RESULT);
        ALL_FIELDS.add(Constants.NUM_DAYS_INTEREST);
        ALL_FIELDS.add(Constants.SENDER_COMP_ID);
        ALL_FIELDS.add(Constants.EMAIL_TYPE);
        ALL_FIELDS.add(Constants.NESTED2_PARTY_ROLE);
        ALL_FIELDS.add(Constants.PROG_RPT_REQS);
        ALL_FIELDS.add(Constants.EMAIL_THREAD_ID);
        ALL_FIELDS.add(Constants.AFFECTED_SECONDARY_ORDER_ID);
        ALL_FIELDS.add(Constants.TRADING_SESSION_ID);
        ALL_FIELDS.add(Constants.SETTL_CURRENCY);
        ALL_FIELDS.add(Constants.ASSIGNMENT_METHOD);
        ALL_FIELDS.add(Constants.UNDERLYING_SECURITY_DESC);
        ALL_FIELDS.add(Constants.NO_CLEARING_INSTRUCTIONS);
        ALL_FIELDS.add(Constants.POS_REQ_STATUS);
        ALL_FIELDS.add(Constants.BID_DESCRIPTOR);
        ALL_FIELDS.add(Constants.ENCODED_SECURITY_DESC);
        ALL_FIELDS.add(Constants.CARD_EXP_DATE);
        ALL_FIELDS.add(Constants.SETTL_INST_REF_ID);
        ALL_FIELDS.add(Constants.M_D_MKT);
        ALL_FIELDS.add(Constants.SETTL_INST_MODE);
        ALL_FIELDS.add(Constants.ADJUSTMENT);
        ALL_FIELDS.add(Constants.PAYMENT_DATE);
        ALL_FIELDS.add(Constants.SECURITY_ID_SOURCE);
        ALL_FIELDS.add(Constants.SECONDARY_CL_ORD_ID);
        ALL_FIELDS.add(Constants.CXL_REJ_RESPONSE_TO);
        ALL_FIELDS.add(Constants.INTEREST_ACCRUAL_DATE);
        ALL_FIELDS.add(Constants.PEG_SCOPE);
        ALL_FIELDS.add(Constants.ENCODED_UNDERLYING_ISSUER_LEN);
        ALL_FIELDS.add(Constants.STATE_OR_PROVINCE_OF_ISSUE);
        ALL_FIELDS.add(Constants.NESTED_PARTY_ID_SOURCE);
        ALL_FIELDS.add(Constants.PEGGED_PRICE);
        ALL_FIELDS.add(Constants.ORDER_RESTRICTIONS);
        ALL_FIELDS.add(Constants.RESPONSE_DESTINATION);
        ALL_FIELDS.add(Constants.EXCHANGE_FOR_PHYSICAL);
        ALL_FIELDS.add(Constants.UNDERLYING_STATE_OR_PROVINCE_OF_ISSUE);
        ALL_FIELDS.add(Constants.NO_ALT_M_D_SOURCE);
        ALL_FIELDS.add(Constants.PRICE_IMPROVEMENT);
        ALL_FIELDS.add(Constants.LEG_ORDER_QTY);
        ALL_FIELDS.add(Constants.D_K_REASON);
        ALL_FIELDS.add(Constants.NO_ALT_M_D_SOURCE_GROUP_COUNTER);
        ALL_FIELDS.add(Constants.UNDERLYING_CREDIT_RATING);
        ALL_FIELDS.add(Constants.NO_PARTY_IDS_GROUP_COUNTER);
        ALL_FIELDS.add(Constants.FINANCIAL_STATUS);
        ALL_FIELDS.add(Constants.TOTAL_AFFECTED_ORDERS);
        ALL_FIELDS.add(Constants.THRESHOLD_AMOUNT);
        ALL_FIELDS.add(Constants.NO_POS_AMT);
        ALL_FIELDS.add(Constants.NO_CAPACITIES_GROUP_COUNTER);
        ALL_FIELDS.add(Constants.TOT_NO_RELATED_SYM);
        ALL_FIELDS.add(Constants.ORDER_INPUT_DEVICE);
        ALL_FIELDS.add(Constants.U_R_L_LINK);
        ALL_FIELDS.add(Constants.ALLOC_NO_ORDERS_TYPE);
        ALL_FIELDS.add(Constants.TRADE_ALLOC_INDICATOR);
        ALL_FIELDS.add(Constants.DISCRETION_LIMIT_TYPE);
        ALL_FIELDS.add(Constants.NESTED2_PARTY_ID);
        ALL_FIELDS.add(Constants.ALLOC_TEXT);
        ALL_FIELDS.add(Constants.QUOTE_SET_VALID_UNTIL_TIME);
        ALL_FIELDS.add(Constants.NESTED2_PARTY_ID_SOURCE);
        ALL_FIELDS.add(Constants.CXL_REJ_REASON);
        ALL_FIELDS.add(Constants.QUOTE_QUALIFIER);
        ALL_FIELDS.add(Constants.LIQUIDITY_NUM_SECURITIES);
        ALL_FIELDS.add(Constants.TIME_BRACKET);
        ALL_FIELDS.add(Constants.I_O_I_QLTY_IND);
        ALL_FIELDS.add(Constants.TOT_NO_STRIKES);
        ALL_FIELDS.add(Constants.LEG_STATE_OR_PROVINCE_OF_ISSUE);
        ALL_FIELDS.add(Constants.NO_NESTED3_PARTY_SUB_IDS_GROUP_COUNTER);
        ALL_FIELDS.add(Constants.REGIST_DTLS);
        ALL_FIELDS.add(Constants.BID_TYPE);
        ALL_FIELDS.add(Constants.REGIST_ID);
        ALL_FIELDS.add(Constants.POS_AMT_TYPE);
        ALL_FIELDS.add(Constants.NETWORK_STATUS_RESPONSE_TYPE);
        ALL_FIELDS.add(Constants.MKT_OFFER_PX);
        ALL_FIELDS.add(Constants.ASGN_REQ_ID);
        ALL_FIELDS.add(Constants.LAST_UPDATE_TIME);
        ALL_FIELDS.add(Constants.STAND_INST_DB_ID);
        ALL_FIELDS.add(Constants.ENCODED_UNDERLYING_SECURITY_DESC);
        ALL_FIELDS.add(Constants.CXL_QTY);
        ALL_FIELDS.add(Constants.ALLOC_SETTL_CURR_AMT);
        ALL_FIELDS.add(Constants.INC_TAX_IND);
        ALL_FIELDS.add(Constants.ASSIGNMENT_UNIT);
        ALL_FIELDS.add(Constants.NEW_SEQ_NO);
        ALL_FIELDS.add(Constants.LEG_ISSUER);
        ALL_FIELDS.add(Constants.APPL_QUEUE_MAX);
        ALL_FIELDS.add(Constants.SUBSCRIPTION_REQUEST_TYPE);
        ALL_FIELDS.add(Constants.CL_ORD_ID);
        ALL_FIELDS.add(Constants.LEG_SECURITY_SUB_TYPE);
        ALL_FIELDS.add(Constants.UNDERLYING_SECURITY_TYPE);
        ALL_FIELDS.add(Constants.APPL_QUEUE_DEPTH);
        ALL_FIELDS.add(Constants.ENCODED_ISSUER_LEN);
        ALL_FIELDS.add(Constants.PRICE);
        ALL_FIELDS.add(Constants.ENCODED_ALLOC_TEXT);
        ALL_FIELDS.add(Constants.NETWORK_REQUEST_ID);
        ALL_FIELDS.add(Constants.CLEARING_FEE_INDICATOR);
        ALL_FIELDS.add(Constants.TRAD_SES_PRE_CLOSE_TIME);
        ALL_FIELDS.add(Constants.WT_AVERAGE_LIQUIDITY);
        ALL_FIELDS.add(Constants.INVESTOR_COUNTRY_OF_RESIDENCE);
        ALL_FIELDS.add(Constants.EXPIRE_TIME);
        ALL_FIELDS.add(Constants.STATUS_VALUE);
        ALL_FIELDS.add(Constants.EXEC_PRICE_ADJUSTMENT);
        ALL_FIELDS.add(Constants.ORDER_QTY);
        ALL_FIELDS.add(Constants.ISSUER);
        ALL_FIELDS.add(Constants.SYMBOL);
        ALL_FIELDS.add(Constants.TOT_NO_ORDERS);
        ALL_FIELDS.add(Constants.QUOTE_STATUS);
        ALL_FIELDS.add(Constants.SECURITY_REQUEST_TYPE);
        ALL_FIELDS.add(Constants.INSTR_REGISTRY);
        ALL_FIELDS.add(Constants.INDIVIDUAL_ALLOC_ID);
        ALL_FIELDS.add(Constants.TRANSFER_REASON);
        ALL_FIELDS.add(Constants.QUOTE_CONDITION);
        ALL_FIELDS.add(Constants.M_D_ENTRY_TYPE);
        ALL_FIELDS.add(Constants.NO_QUOTE_ENTRIES);
        ALL_FIELDS.add(Constants.LEG_REDEMPTION_DATE);
        ALL_FIELDS.add(Constants.LEG_C_F_I_CODE);
        ALL_FIELDS.add(Constants.RAW_DATA_LENGTH);
        ALL_FIELDS.add(Constants.NESTED3_PARTY_ID_SOURCE);
        ALL_FIELDS.add(Constants.IN_VIEW_OF_COMMON);
        ALL_FIELDS.add(Constants.UNDERLYING_FACTOR);
        ALL_FIELDS.add(Constants.UNDERLYING_SYMBOL_SFX);
        ALL_FIELDS.add(Constants.GAP_FILL_FLAG);
        ALL_FIELDS.add(Constants.NO_LEG_ALLOCS);
        ALL_FIELDS.add(Constants.LEG_REPO_COLLATERAL_SECURITY_TYPE);
        ALL_FIELDS.add(Constants.CARD_ISS_NUM);
        ALL_FIELDS.add(Constants.ALLOWABLE_ONE_SIDEDNESS_VALUE);
        ALL_FIELDS.add(Constants.COLL_ACTION);
        ALL_FIELDS.add(Constants.GROSS_TRADE_AMT);
        ALL_FIELDS.add(Constants.ACCT_ID_SOURCE);
        ALL_FIELDS.add(Constants.HOP_SENDING_TIME);
        ALL_FIELDS.add(Constants.CONTRARY_INSTRUCTION_INDICATOR);
        ALL_FIELDS.add(Constants.PREALLOC_METHOD);
        ALL_FIELDS.add(Constants.I_O_I_TRANS_TYPE);
        ALL_FIELDS.add(Constants.CONFIRM_TYPE);
        ALL_FIELDS.add(Constants.MULTI_LEG_RPT_TYPE_REQ);
        ALL_FIELDS.add(Constants.QUOTE_ENTRY_REJECT_REASON);
        ALL_FIELDS.add(Constants.INSTR_ATTRIB_TYPE);
        ALL_FIELDS.add(Constants.NO_COLL_INQUIRY_QUALIFIER_GROUP_COUNTER);
        ALL_FIELDS.add(Constants.REGIST_ACCT_TYPE);
        ALL_FIELDS.add(Constants.BOOKING_REF_ID);
        ALL_FIELDS.add(Constants.TRADE_REQUEST_RESULT);
        ALL_FIELDS.add(Constants.ALLOC_ID);
        ALL_FIELDS.add(Constants.OUTSIDE_INDEX_PCT);
        ALL_FIELDS.add(Constants.UNDERLYING_PRODUCT);
        ALL_FIELDS.add(Constants.PAYMENT_REMITTER_ID);
        ALL_FIELDS.add(Constants.POS_QTY_STATUS);
        ALL_FIELDS.add(Constants.BID_FORWARD_POINTS);
        ALL_FIELDS.add(Constants.REPURCHASE_TERM);
        ALL_FIELDS.add(Constants.UNDERLYING_SECURITY_EXCHANGE);
        ALL_FIELDS.add(Constants.LIST_STATUS_TYPE);
        ALL_FIELDS.add(Constants.UNDERLYING_LAST_QTY);
        ALL_FIELDS.add(Constants.MASS_CANCEL_RESPONSE);
        ALL_FIELDS.add(Constants.I_O_I_QUALIFIER);
        ALL_FIELDS.add(Constants.POS_MAINT_STATUS);
        ALL_FIELDS.add(Constants.LEG_SWAP_TYPE);
        ALL_FIELDS.add(Constants.POSS_RESEND);
        ALL_FIELDS.add(Constants.USER_REQUEST_TYPE);
        ALL_FIELDS.add(Constants.ENCODED_LIST_EXEC_INST);
        ALL_FIELDS.add(Constants.POS_REQ_RESULT);
        ALL_FIELDS.add(Constants.LIST_ORDER_STATUS);
        ALL_FIELDS.add(Constants.BID_SIZE);
        ALL_FIELDS.add(Constants.NO_CONT_AMTS_GROUP_COUNTER);
        ALL_FIELDS.add(Constants.SECURITY_REQ_ID);
        ALL_FIELDS.add(Constants.TICK_DIRECTION);
        ALL_FIELDS.add(Constants.REF_TAG_ID);
        ALL_FIELDS.add(Constants.AGGREGATED_BOOK);
        ALL_FIELDS.add(Constants.LOCALE_OF_ISSUE);
        ALL_FIELDS.add(Constants.YIELD_CALC_DATE);
        ALL_FIELDS.add(Constants.NO_DATES);
        ALL_FIELDS.add(Constants.BENCHMARK_SECURITY_ID_SOURCE);
        ALL_FIELDS.add(Constants.NO_ALLOCS);
        ALL_FIELDS.add(Constants.PUT_OR_CALL);
        ALL_FIELDS.add(Constants.ORDER_CAPACITY_QTY);
        ALL_FIELDS.add(Constants.COMM_CURRENCY);
        ALL_FIELDS.add(Constants.UNDERLYING_COUNTRY_OF_ISSUE);
        ALL_FIELDS.add(Constants.ENCODED_HEADLINE);
        ALL_FIELDS.add(Constants.CONT_AMT_CURR);
        ALL_FIELDS.add(Constants.MATCH_TYPE);
        ALL_FIELDS.add(Constants.SETTL_INST_REQ_ID);
        ALL_FIELDS.add(Constants.NO_TRADES_GROUP_COUNTER);
        ALL_FIELDS.add(Constants.PEG_LIMIT_TYPE);
        ALL_FIELDS.add(Constants.CONFIRM_REJ_REASON);
        ALL_FIELDS.add(Constants.LONG_QTY);
        ALL_FIELDS.add(Constants.DAY_ORDER_QTY);
        ALL_FIELDS.add(Constants.NESTED_PARTY_SUB_ID_TYPE);
        ALL_FIELDS.add(Constants.FUND_RENEW_WAIV);
        ALL_FIELDS.add(Constants.BID_YIELD);
        ALL_FIELDS.add(Constants.NO_CAPACITIES);
        ALL_FIELDS.add(Constants.TEST_MESSAGE_INDICATOR);
        ALL_FIELDS.add(Constants.UNDERLYING_C_F_I_CODE);
        ALL_FIELDS.add(Constants.NO_NESTED2_PARTY_IDS);
        ALL_FIELDS.add(Constants.NO_AFFECTED_ORDERS_GROUP_COUNTER);
        ALL_FIELDS.add(Constants.MISC_FEE_CURR);
        ALL_FIELDS.add(Constants.TIME_IN_FORCE);
        ALL_FIELDS.add(Constants.SECONDARY_TRD_TYPE);
        ALL_FIELDS.add(Constants.SECONDARY_ALLOC_ID);
        ALL_FIELDS.add(Constants.LAST_CAPACITY);
        ALL_FIELDS.add(Constants.NO_DLVY_INST_GROUP_COUNTER);
        ALL_FIELDS.add(Constants.TARGET_SUB_ID);
        ALL_FIELDS.add(Constants.UNDERLYING_CURRENCY);
        ALL_FIELDS.add(Constants.UNSOLICITED_INDICATOR);
        ALL_FIELDS.add(Constants.ALLOC_STATUS);
        ALL_FIELDS.add(Constants.NO_POS_AMT_GROUP_COUNTER);
        ALL_FIELDS.add(Constants.NO_MISC_FEES);
        ALL_FIELDS.add(Constants.CONTRA_TRADE_QTY);
        ALL_FIELDS.add(Constants.M_D_UPDATE_TYPE);
        ALL_FIELDS.add(Constants.BENCHMARK_PRICE);
        ALL_FIELDS.add(Constants.MARGIN_EXCESS);
        ALL_FIELDS.add(Constants.EXEC_REF_ID);
        ALL_FIELDS.add(Constants.TARGET_LOCATION_ID);
        ALL_FIELDS.add(Constants.LEG_SYMBOL_SFX);
        ALL_FIELDS.add(Constants.HOP_COMP_ID);
        ALL_FIELDS.add(Constants.ORIG_TIME);
        ALL_FIELDS.add(Constants.BOOKING_UNIT);
        ALL_FIELDS.add(Constants.TRD_REG_TIMESTAMP);
        ALL_FIELDS.add(Constants.SELL_VOLUME);
        ALL_FIELDS.add(Constants.PARTY_ID_SOURCE);
        ALL_FIELDS.add(Constants.APPL_QUEUE_RESOLUTION);
        ALL_FIELDS.add(Constants.NO_M_D_ENTRY_TYPES);
        ALL_FIELDS.add(Constants.NEW_PASSWORD);
        ALL_FIELDS.add(Constants.ORD_REJ_REASON);
        ALL_FIELDS.add(Constants.STRIKE_PRICE);
        ALL_FIELDS.add(Constants.TRD_MATCH_ID);
        ALL_FIELDS.add(Constants.AGREEMENT_DESC);
        ALL_FIELDS.add(Constants.DELIVER_TO_SUB_ID);
        ALL_FIELDS.add(Constants.TRAD_SES_START_TIME);
        ALL_FIELDS.add(Constants.SUBJECT);
        ALL_FIELDS.add(Constants.TOT_NO_SECURITY_TYPES);
        ALL_FIELDS.add(Constants.ADJUSTMENT_TYPE);
        ALL_FIELDS.add(Constants.SETTL_PARTY_ID);
        ALL_FIELDS.add(Constants.SECURITY_ALT_ID);
        ALL_FIELDS.add(Constants.NO_LEGS);
        ALL_FIELDS.add(Constants.PEG_OFFSET_TYPE);
        ALL_FIELDS.add(Constants.PCT_AT_RISK);
        ALL_FIELDS.add(Constants.ACCOUNT);
        ALL_FIELDS.add(Constants.SETTL_SESS_SUB_ID);
        ALL_FIELDS.add(Constants.UNDERLYING_SECURITY_ID_SOURCE);
        ALL_FIELDS.add(Constants.SETTL_CURR_FX_RATE);
        ALL_FIELDS.add(Constants.LEG_ALLOC_QTY);
        ALL_FIELDS.add(Constants.TRADE_REPORT_TYPE);
        ALL_FIELDS.add(Constants.SETTL_INST_TRANS_TYPE);
        ALL_FIELDS.add(Constants.LEG_RATIO_QTY);
        ALL_FIELDS.add(Constants.ALLOC_ACCOUNT_TYPE);
        ALL_FIELDS.add(Constants.M_D_UPDATE_ACTION);
        ALL_FIELDS.add(Constants.ON_BEHALF_OF_COMP_ID);
        ALL_FIELDS.add(Constants.EVENT_PX);
        ALL_FIELDS.add(Constants.DAY_AVG_PX);
        ALL_FIELDS.add(Constants.BASIS_FEATURE_DATE);
        ALL_FIELDS.add(Constants.NO_QUOTE_SETS_GROUP_COUNTER);
        ALL_FIELDS.add(Constants.BEGIN_SEQ_NO);
        ALL_FIELDS.add(Constants.POS_REQ_TYPE);
        ALL_FIELDS.add(Constants.MASS_CANCEL_REQUEST_TYPE);
        ALL_FIELDS.add(Constants.SOLICITED_FLAG);
        ALL_FIELDS.add(Constants.M_D_REQ_ID);
        ALL_FIELDS.add(Constants.COLL_ASGN_TRANS_TYPE);
        ALL_FIELDS.add(Constants.CASH_DISTRIB_PAY_REF);
        ALL_FIELDS.add(Constants.SIDE_COMPLIANCE_ID);
        ALL_FIELDS.add(Constants.TRD_REG_TIMESTAMP_ORIGIN);
        ALL_FIELDS.add(Constants.SECURITY_RESPONSE_TYPE);
        ALL_FIELDS.add(Constants.ENCODED_LIST_STATUS_TEXT);
        ALL_FIELDS.add(Constants.OFFER_SPOT_RATE);
        ALL_FIELDS.add(Constants.COLL_STATUS);
        ALL_FIELDS.add(Constants.NO_EXECS_GROUP_COUNTER);
        ALL_FIELDS.add(Constants.STIPULATION_TYPE);
        ALL_FIELDS.add(Constants.TRAD_SES_CLOSE_TIME);
        ALL_FIELDS.add(Constants.ALLOC_REJ_CODE);
        ALL_FIELDS.add(Constants.M_D_ENTRY_SELLER);
        ALL_FIELDS.add(Constants.ADV_SIDE);
        ALL_FIELDS.add(Constants.LEG_BENCHMARK_CURVE_NAME);
        ALL_FIELDS.add(Constants.CHECK_SUM);
        ALL_FIELDS.add(Constants.LEG_BENCHMARK_PRICE);
        ALL_FIELDS.add(Constants.REDEMPTION_DATE);
        ALL_FIELDS.add(Constants.QUOTE_RESP_TYPE);
        ALL_FIELDS.add(Constants.LEG_BENCHMARK_CURVE_POINT);
        ALL_FIELDS.add(Constants.SECURITY_TYPE);
        ALL_FIELDS.add(Constants.EXERCISE_METHOD);
        ALL_FIELDS.add(Constants.POS_REQ_ID);
        ALL_FIELDS.add(Constants.STAND_INST_DB_TYPE);
        ALL_FIELDS.add(Constants.ALLOC_LINK_ID);
        ALL_FIELDS.add(Constants.MIN_OFFER_SIZE);
        ALL_FIELDS.add(Constants.LEG_COUNTRY_OF_ISSUE);
        ALL_FIELDS.add(Constants.SETTL_INST_MSG_ID);
        ALL_FIELDS.add(Constants.NO_UNDERLYING_SECURITY_ALT_ID);
        ALL_FIELDS.add(Constants.CONT_AMT_TYPE);
        ALL_FIELDS.add(Constants.LEG_INDIVIDUAL_ALLOC_ID);
        ALL_FIELDS.add(Constants.COLL_RPT_ID);
        ALL_FIELDS.add(Constants.EX_DATE);
        ALL_FIELDS.add(Constants.TRADE_DATE);
        ALL_FIELDS.add(Constants.INDIVIDUAL_ALLOC_REJ_CODE);
        ALL_FIELDS.add(Constants.NO_LEGS_GROUP_COUNTER);
        ALL_FIELDS.add(Constants.ORD_STATUS_REQ_ID);
        ALL_FIELDS.add(Constants.ROUTING_TYPE);
        ALL_FIELDS.add(Constants.APPL_QUEUE_ACTION);
        ALL_FIELDS.add(Constants.ENCODED_SUBJECT_LEN);
        ALL_FIELDS.add(Constants.TRD_RPT_STATUS);
        ALL_FIELDS.add(Constants.BENCHMARK_PRICE_TYPE);
        ALL_FIELDS.add(Constants.PRIORITY_INDICATOR);
        ALL_FIELDS.add(Constants.ENCODED_LIST_EXEC_INST_LEN);
        ALL_FIELDS.add(Constants.SECURITY_LIST_REQUEST_TYPE);
        ALL_FIELDS.add(Constants.ALLOC_TYPE);
        ALL_FIELDS.add(Constants.NO_STRIKES);
        ALL_FIELDS.add(Constants.COMM_TYPE);
        ALL_FIELDS.add(Constants.QTY_TYPE);
        ALL_FIELDS.add(Constants.EXEC_RESTATEMENT_REASON);
        ALL_FIELDS.add(Constants.LEG_BENCHMARK_CURVE_CURRENCY);
        ALL_FIELDS.add(Constants.SIGNATURE_LENGTH);
        ALL_FIELDS.add(Constants.NO_COMP_IDS);
        ALL_FIELDS.add(Constants.CONTRACT_MULTIPLIER);
        ALL_FIELDS.add(Constants.XML_DATA);
        ALL_FIELDS.add(Constants.SETTL_PRICE_TYPE);
        ALL_FIELDS.add(Constants.MULTI_LEG_REPORTING_TYPE);
        ALL_FIELDS.add(Constants.LAST_FORWARD_POINTS);
        ALL_FIELDS.add(Constants.NO_I_O_I_QUALIFIERS_GROUP_COUNTER);
        ALL_FIELDS.add(Constants.CARD_NUMBER);
        ALL_FIELDS.add(Constants.SECONDARY_TRADE_REPORT_REF_ID);
        ALL_FIELDS.add(Constants.TRADE_REQUEST_ID);
        ALL_FIELDS.add(Constants.ORDER_ID);
        ALL_FIELDS.add(Constants.NO_NESTED3_PARTY_SUB_IDS);
        ALL_FIELDS.add(Constants.START_DATE);
        ALL_FIELDS.add(Constants.END_ACCRUED_INTEREST_AMT);
        ALL_FIELDS.add(Constants.ORD_STATUS);
        ALL_FIELDS.add(Constants.NO_ORDERS);
        ALL_FIELDS.add(Constants.EVENT_TEXT);
        ALL_FIELDS.add(Constants.PREV_CLOSE_PX);
        ALL_FIELDS.add(Constants.LAST_FORWARD_POINTS2);
        ALL_FIELDS.add(Constants.BENCHMARK_CURVE_CURRENCY);
        ALL_FIELDS.add(Constants.REPURCHASE_RATE);
        ALL_FIELDS.add(Constants.COMPLIANCE_ID);
        ALL_FIELDS.add(Constants.ROUNDING_MODULUS);
        ALL_FIELDS.add(Constants.CASH_OUTSTANDING);
        ALL_FIELDS.add(Constants.PROCESS_CODE);
        ALL_FIELDS.add(Constants.YIELD_TYPE);
        ALL_FIELDS.add(Constants.BID_FORWARD_POINTS2);
        ALL_FIELDS.add(Constants.TRD_REG_TIMESTAMP_TYPE);
        ALL_FIELDS.add(Constants.ORDER_AVG_PX);
        ALL_FIELDS.add(Constants.ORIG_CROSS_ID);
        ALL_FIELDS.add(Constants.M_D_ENTRY_ID);
        ALL_FIELDS.add(Constants.QUOTE_REQ_ID);
        ALL_FIELDS.add(Constants.NESTED_PARTY_ROLE);
        ALL_FIELDS.add(Constants.NO_INSTR_ATTRIB_GROUP_COUNTER);
        ALL_FIELDS.add(Constants.NO_SECURITY_ALT_ID_GROUP_COUNTER);
        ALL_FIELDS.add(Constants.DISCRETION_SCOPE);
        ALL_FIELDS.add(Constants.UNDERLYING_SECURITY_ID);
        ALL_FIELDS.add(Constants.OWNERSHIP_TYPE);
        ALL_FIELDS.add(Constants.UNDERLYING_OPT_ATTRIBUTE);
        ALL_FIELDS.add(Constants.OUT_MAIN_CNTRY_U_INDEX);
        ALL_FIELDS.add(Constants.LAST_FRAGMENT);
        ALL_FIELDS.add(Constants.NO_PARTY_SUB_IDS_GROUP_COUNTER);
        ALL_FIELDS.add(Constants.SETTL_PARTY_ROLE);
        ALL_FIELDS.add(Constants.ENCODED_UNDERLYING_SECURITY_DESC_LEN);
        ALL_FIELDS.add(Constants.LEG_BID_PX);
        ALL_FIELDS.add(Constants.MSG_DIRECTION);
        ALL_FIELDS.add(Constants.NO_DISTRIB_INSTS_GROUP_COUNTER);
        ALL_FIELDS.add(Constants.REGIST_EMAIL);
        ALL_FIELDS.add(Constants.YIELD_REDEMPTION_PRICE);
        ALL_FIELDS.add(Constants.ALLOC_CANC_REPLACE_REASON);
        ALL_FIELDS.add(Constants.SECURITY_DESC);
        ALL_FIELDS.add(Constants.NO_SETTL_PARTY_SUB_IDS);
        ALL_FIELDS.add(Constants.LAST_PAR_PX);
        ALL_FIELDS.add(Constants.REF_MSG_TYPE);
        ALL_FIELDS.add(Constants.QUANTITY);
        ALL_FIELDS.add(Constants.MAX_SHOW);
        ALL_FIELDS.add(Constants.DATED_DATE);
        ALL_FIELDS.add(Constants.SESSION_REJECT_REASON);
        ALL_FIELDS.add(Constants.MATURITY_DATE);
        ALL_FIELDS.add(Constants.MISC_FEE_TYPE);
        ALL_FIELDS.add(Constants.SIGNATURE);
        ALL_FIELDS.add(Constants.UNDERLYING_SECURITY_SUB_TYPE);
    }

}
