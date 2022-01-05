/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import org.agrona.collections.IntHashSet;
import uk.co.real_logic.artio.dictionary.CharArraySet;
public class Constants
{

    public static String VERSION = "FIXT.1.1";
    public static char[] VERSION_CHARS = VERSION.toCharArray();

    public static final String HEARTBEAT_MESSAGE_AS_STR = "0";
    public static final long HEARTBEAT_MESSAGE = 48L;

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

    public static final String LOGON_MESSAGE_AS_STR = "A";
    public static final long LOGON_MESSAGE = 65L;

    public static final String I_O_I_MESSAGE_AS_STR = "6";
    public static final long I_O_I_MESSAGE = 54L;

    public static final String ADVERTISEMENT_MESSAGE_AS_STR = "7";
    public static final long ADVERTISEMENT_MESSAGE = 55L;

    public static final String EXECUTION_REPORT_MESSAGE_AS_STR = "8";
    public static final long EXECUTION_REPORT_MESSAGE = 56L;

    public static final String ORDER_CANCEL_REJECT_MESSAGE_AS_STR = "9";
    public static final long ORDER_CANCEL_REJECT_MESSAGE = 57L;

    public static final String DERIVATIVE_SECURITY_LIST_MESSAGE_AS_STR = "AA";
    public static final long DERIVATIVE_SECURITY_LIST_MESSAGE = 16705L;

    public static final String NEW_ORDER_MULTILEG_MESSAGE_AS_STR = "AB";
    public static final long NEW_ORDER_MULTILEG_MESSAGE = 16961L;

    public static final String MULTILEG_ORDER_CANCEL_REPLACE_MESSAGE_AS_STR = "AC";
    public static final long MULTILEG_ORDER_CANCEL_REPLACE_MESSAGE = 17217L;

    public static final String TRADE_CAPTURE_REPORT_REQUEST_MESSAGE_AS_STR = "AD";
    public static final long TRADE_CAPTURE_REPORT_REQUEST_MESSAGE = 17473L;

    public static final String TRADE_CAPTURE_REPORT_MESSAGE_AS_STR = "AE";
    public static final long TRADE_CAPTURE_REPORT_MESSAGE = 17729L;

    public static final String ORDER_MASS_STATUS_REQUEST_MESSAGE_AS_STR = "AF";
    public static final long ORDER_MASS_STATUS_REQUEST_MESSAGE = 17985L;

    public static final String QUOTE_REQUEST_REJECT_MESSAGE_AS_STR = "AG";
    public static final long QUOTE_REQUEST_REJECT_MESSAGE = 18241L;

    public static final String R_F_Q_REQUEST_MESSAGE_AS_STR = "AH";
    public static final long R_F_Q_REQUEST_MESSAGE = 18497L;

    public static final String QUOTE_STATUS_REPORT_MESSAGE_AS_STR = "AI";
    public static final long QUOTE_STATUS_REPORT_MESSAGE = 18753L;

    public static final String QUOTE_RESPONSE_MESSAGE_AS_STR = "AJ";
    public static final long QUOTE_RESPONSE_MESSAGE = 19009L;

    public static final String CONFIRMATION_MESSAGE_AS_STR = "AK";
    public static final long CONFIRMATION_MESSAGE = 19265L;

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

    public static final String TRADE_CAPTURE_REPORT_REQUEST_ACK_MESSAGE_AS_STR = "AQ";
    public static final long TRADE_CAPTURE_REPORT_REQUEST_ACK_MESSAGE = 20801L;

    public static final String TRADE_CAPTURE_REPORT_ACK_MESSAGE_AS_STR = "AR";
    public static final long TRADE_CAPTURE_REPORT_ACK_MESSAGE = 21057L;

    public static final String ALLOCATION_REPORT_MESSAGE_AS_STR = "AS";
    public static final long ALLOCATION_REPORT_MESSAGE = 21313L;

    public static final String ALLOCATION_REPORT_ACK_MESSAGE_AS_STR = "AT";
    public static final long ALLOCATION_REPORT_ACK_MESSAGE = 21569L;

    public static final String CONFIRMATION_ACK_MESSAGE_AS_STR = "AU";
    public static final long CONFIRMATION_ACK_MESSAGE = 21825L;

    public static final String SETTLEMENT_INSTRUCTION_REQUEST_MESSAGE_AS_STR = "AV";
    public static final long SETTLEMENT_INSTRUCTION_REQUEST_MESSAGE = 22081L;

    public static final String ASSIGNMENT_REPORT_MESSAGE_AS_STR = "AW";
    public static final long ASSIGNMENT_REPORT_MESSAGE = 22337L;

    public static final String COLLATERAL_REQUEST_MESSAGE_AS_STR = "AX";
    public static final long COLLATERAL_REQUEST_MESSAGE = 22593L;

    public static final String COLLATERAL_ASSIGNMENT_MESSAGE_AS_STR = "AY";
    public static final long COLLATERAL_ASSIGNMENT_MESSAGE = 22849L;

    public static final String COLLATERAL_RESPONSE_MESSAGE_AS_STR = "AZ";
    public static final long COLLATERAL_RESPONSE_MESSAGE = 23105L;

    public static final String NEWS_MESSAGE_AS_STR = "B";
    public static final long NEWS_MESSAGE = 66L;

    public static final String COLLATERAL_REPORT_MESSAGE_AS_STR = "BA";
    public static final long COLLATERAL_REPORT_MESSAGE = 16706L;

    public static final String COLLATERAL_INQUIRY_MESSAGE_AS_STR = "BB";
    public static final long COLLATERAL_INQUIRY_MESSAGE = 16962L;

    public static final String NETWORK_COUNTERPARTY_SYSTEM_STATUS_REQUEST_MESSAGE_AS_STR = "BC";
    public static final long NETWORK_COUNTERPARTY_SYSTEM_STATUS_REQUEST_MESSAGE = 17218L;

    public static final String NETWORK_COUNTERPARTY_SYSTEM_STATUS_RESPONSE_MESSAGE_AS_STR = "BD";
    public static final long NETWORK_COUNTERPARTY_SYSTEM_STATUS_RESPONSE_MESSAGE = 17474L;

    public static final String USER_REQUEST_MESSAGE_AS_STR = "BE";
    public static final long USER_REQUEST_MESSAGE = 17730L;

    public static final String USER_RESPONSE_MESSAGE_AS_STR = "BF";
    public static final long USER_RESPONSE_MESSAGE = 17986L;

    public static final String COLLATERAL_INQUIRY_ACK_MESSAGE_AS_STR = "BG";
    public static final long COLLATERAL_INQUIRY_ACK_MESSAGE = 18242L;

    public static final String CONFIRMATION_REQUEST_MESSAGE_AS_STR = "BH";
    public static final long CONFIRMATION_REQUEST_MESSAGE = 18498L;

    public static final String TRADING_SESSION_LIST_REQUEST_MESSAGE_AS_STR = "BI";
    public static final long TRADING_SESSION_LIST_REQUEST_MESSAGE = 18754L;

    public static final String TRADING_SESSION_LIST_MESSAGE_AS_STR = "BJ";
    public static final long TRADING_SESSION_LIST_MESSAGE = 19010L;

    public static final String SECURITY_LIST_UPDATE_REPORT_MESSAGE_AS_STR = "BK";
    public static final long SECURITY_LIST_UPDATE_REPORT_MESSAGE = 19266L;

    public static final String ADJUSTED_POSITION_REPORT_MESSAGE_AS_STR = "BL";
    public static final long ADJUSTED_POSITION_REPORT_MESSAGE = 19522L;

    public static final String ALLOCATION_INSTRUCTION_ALERT_MESSAGE_AS_STR = "BM";
    public static final long ALLOCATION_INSTRUCTION_ALERT_MESSAGE = 19778L;

    public static final String EXECUTION_ACKNOWLEDGEMENT_MESSAGE_AS_STR = "BN";
    public static final long EXECUTION_ACKNOWLEDGEMENT_MESSAGE = 20034L;

    public static final String CONTRARY_INTENTION_REPORT_MESSAGE_AS_STR = "BO";
    public static final long CONTRARY_INTENTION_REPORT_MESSAGE = 20290L;

    public static final String SECURITY_DEFINITION_UPDATE_REPORT_MESSAGE_AS_STR = "BP";
    public static final long SECURITY_DEFINITION_UPDATE_REPORT_MESSAGE = 20546L;

    public static final String SETTLEMENT_OBLIGATION_REPORT_MESSAGE_AS_STR = "BQ";
    public static final long SETTLEMENT_OBLIGATION_REPORT_MESSAGE = 20802L;

    public static final String DERIVATIVE_SECURITY_LIST_UPDATE_REPORT_MESSAGE_AS_STR = "BR";
    public static final long DERIVATIVE_SECURITY_LIST_UPDATE_REPORT_MESSAGE = 21058L;

    public static final String TRADING_SESSION_LIST_UPDATE_REPORT_MESSAGE_AS_STR = "BS";
    public static final long TRADING_SESSION_LIST_UPDATE_REPORT_MESSAGE = 21314L;

    public static final String MARKET_DEFINITION_REQUEST_MESSAGE_AS_STR = "BT";
    public static final long MARKET_DEFINITION_REQUEST_MESSAGE = 21570L;

    public static final String MARKET_DEFINITION_MESSAGE_AS_STR = "BU";
    public static final long MARKET_DEFINITION_MESSAGE = 21826L;

    public static final String MARKET_DEFINITION_UPDATE_REPORT_MESSAGE_AS_STR = "BV";
    public static final long MARKET_DEFINITION_UPDATE_REPORT_MESSAGE = 22082L;

    public static final String APPLICATION_MESSAGE_REQUEST_MESSAGE_AS_STR = "BW";
    public static final long APPLICATION_MESSAGE_REQUEST_MESSAGE = 22338L;

    public static final String APPLICATION_MESSAGE_REQUEST_ACK_MESSAGE_AS_STR = "BX";
    public static final long APPLICATION_MESSAGE_REQUEST_ACK_MESSAGE = 22594L;

    public static final String APPLICATION_MESSAGE_REPORT_MESSAGE_AS_STR = "BY";
    public static final long APPLICATION_MESSAGE_REPORT_MESSAGE = 22850L;

    public static final String ORDER_MASS_ACTION_REPORT_MESSAGE_AS_STR = "BZ";
    public static final long ORDER_MASS_ACTION_REPORT_MESSAGE = 23106L;

    public static final String EMAIL_MESSAGE_AS_STR = "C";
    public static final long EMAIL_MESSAGE = 67L;

    public static final String ORDER_MASS_ACTION_REQUEST_MESSAGE_AS_STR = "CA";
    public static final long ORDER_MASS_ACTION_REQUEST_MESSAGE = 16707L;

    public static final String USER_NOTIFICATION_MESSAGE_AS_STR = "CB";
    public static final long USER_NOTIFICATION_MESSAGE = 16963L;

    public static final String STREAM_ASSIGNMENT_REQUEST_MESSAGE_AS_STR = "CC";
    public static final long STREAM_ASSIGNMENT_REQUEST_MESSAGE = 17219L;

    public static final String STREAM_ASSIGNMENT_REPORT_MESSAGE_AS_STR = "CD";
    public static final long STREAM_ASSIGNMENT_REPORT_MESSAGE = 17475L;

    public static final String STREAM_ASSIGNMENT_REPORT_A_C_K_MESSAGE_AS_STR = "CE";
    public static final long STREAM_ASSIGNMENT_REPORT_A_C_K_MESSAGE = 17731L;

    public static final String NEW_ORDER_SINGLE_MESSAGE_AS_STR = "D";
    public static final long NEW_ORDER_SINGLE_MESSAGE = 68L;

    public static final String NEW_ORDER_LIST_MESSAGE_AS_STR = "E";
    public static final long NEW_ORDER_LIST_MESSAGE = 69L;

    public static final String ORDER_CANCEL_REQUEST_MESSAGE_AS_STR = "F";
    public static final long ORDER_CANCEL_REQUEST_MESSAGE = 70L;

    public static final String ORDER_CANCEL_REPLACE_REQUEST_MESSAGE_AS_STR = "G";
    public static final long ORDER_CANCEL_REPLACE_REQUEST_MESSAGE = 71L;

    public static final String ORDER_STATUS_REQUEST_MESSAGE_AS_STR = "H";
    public static final long ORDER_STATUS_REQUEST_MESSAGE = 72L;

    public static final String ALLOCATION_INSTRUCTION_MESSAGE_AS_STR = "J";
    public static final long ALLOCATION_INSTRUCTION_MESSAGE = 74L;

    public static final String LIST_CANCEL_REQUEST_MESSAGE_AS_STR = "K";
    public static final long LIST_CANCEL_REQUEST_MESSAGE = 75L;

    public static final String LIST_EXECUTE_MESSAGE_AS_STR = "L";
    public static final long LIST_EXECUTE_MESSAGE = 76L;

    public static final String LIST_STATUS_REQUEST_MESSAGE_AS_STR = "M";
    public static final long LIST_STATUS_REQUEST_MESSAGE = 77L;

    public static final String LIST_STATUS_MESSAGE_AS_STR = "N";
    public static final long LIST_STATUS_MESSAGE = 78L;

    public static final String ALLOCATION_INSTRUCTION_ACK_MESSAGE_AS_STR = "P";
    public static final long ALLOCATION_INSTRUCTION_ACK_MESSAGE = 80L;

    public static final String DONT_KNOW_TRADE_MESSAGE_AS_STR = "Q";
    public static final long DONT_KNOW_TRADE_MESSAGE = 81L;

    public static final String QUOTE_REQUEST_MESSAGE_AS_STR = "R";
    public static final long QUOTE_REQUEST_MESSAGE = 82L;

    public static final String QUOTE_MESSAGE_AS_STR = "S";
    public static final long QUOTE_MESSAGE = 83L;

    public static final String SETTLEMENT_INSTRUCTIONS_MESSAGE_AS_STR = "T";
    public static final long SETTLEMENT_INSTRUCTIONS_MESSAGE = 84L;

    public static final String MARKET_DATA_REQUEST_MESSAGE_AS_STR = "V";
    public static final long MARKET_DATA_REQUEST_MESSAGE = 86L;

    public static final String MARKET_DATA_SNAPSHOT_FULL_REFRESH_MESSAGE_AS_STR = "W";
    public static final long MARKET_DATA_SNAPSHOT_FULL_REFRESH_MESSAGE = 87L;

    public static final String MARKET_DATA_INCREMENTAL_REFRESH_MESSAGE_AS_STR = "X";
    public static final long MARKET_DATA_INCREMENTAL_REFRESH_MESSAGE = 88L;

    public static final String MARKET_DATA_REQUEST_REJECT_MESSAGE_AS_STR = "Y";
    public static final long MARKET_DATA_REQUEST_REJECT_MESSAGE = 89L;

    public static final String QUOTE_CANCEL_MESSAGE_AS_STR = "Z";
    public static final long QUOTE_CANCEL_MESSAGE = 90L;

    public static final String QUOTE_STATUS_REQUEST_MESSAGE_AS_STR = "a";
    public static final long QUOTE_STATUS_REQUEST_MESSAGE = 97L;

    public static final String MASS_QUOTE_ACKNOWLEDGEMENT_MESSAGE_AS_STR = "b";
    public static final long MASS_QUOTE_ACKNOWLEDGEMENT_MESSAGE = 98L;

    public static final String SECURITY_DEFINITION_REQUEST_MESSAGE_AS_STR = "c";
    public static final long SECURITY_DEFINITION_REQUEST_MESSAGE = 99L;

    public static final String SECURITY_DEFINITION_MESSAGE_AS_STR = "d";
    public static final long SECURITY_DEFINITION_MESSAGE = 100L;

    public static final String SECURITY_STATUS_REQUEST_MESSAGE_AS_STR = "e";
    public static final long SECURITY_STATUS_REQUEST_MESSAGE = 101L;

    public static final String SECURITY_STATUS_MESSAGE_AS_STR = "f";
    public static final long SECURITY_STATUS_MESSAGE = 102L;

    public static final String TRADING_SESSION_STATUS_REQUEST_MESSAGE_AS_STR = "g";
    public static final long TRADING_SESSION_STATUS_REQUEST_MESSAGE = 103L;

    public static final String TRADING_SESSION_STATUS_MESSAGE_AS_STR = "h";
    public static final long TRADING_SESSION_STATUS_MESSAGE = 104L;

    public static final String MASS_QUOTE_MESSAGE_AS_STR = "i";
    public static final long MASS_QUOTE_MESSAGE = 105L;

    public static final String BUSINESS_MESSAGE_REJECT_MESSAGE_AS_STR = "j";
    public static final long BUSINESS_MESSAGE_REJECT_MESSAGE = 106L;

    public static final String BID_REQUEST_MESSAGE_AS_STR = "k";
    public static final long BID_REQUEST_MESSAGE = 107L;

    public static final String BID_RESPONSE_MESSAGE_AS_STR = "l";
    public static final long BID_RESPONSE_MESSAGE = 108L;

    public static final String LIST_STRIKE_PRICE_MESSAGE_AS_STR = "m";
    public static final long LIST_STRIKE_PRICE_MESSAGE = 109L;

    public static final String REGISTRATION_INSTRUCTIONS_MESSAGE_AS_STR = "o";
    public static final long REGISTRATION_INSTRUCTIONS_MESSAGE = 111L;

    public static final String REGISTRATION_INSTRUCTIONS_RESPONSE_MESSAGE_AS_STR = "p";
    public static final long REGISTRATION_INSTRUCTIONS_RESPONSE_MESSAGE = 112L;

    public static final String ORDER_MASS_CANCEL_REQUEST_MESSAGE_AS_STR = "q";
    public static final long ORDER_MASS_CANCEL_REQUEST_MESSAGE = 113L;

    public static final String ORDER_MASS_CANCEL_REPORT_MESSAGE_AS_STR = "r";
    public static final long ORDER_MASS_CANCEL_REPORT_MESSAGE = 114L;

    public static final String NEW_ORDER_CROSS_MESSAGE_AS_STR = "s";
    public static final long NEW_ORDER_CROSS_MESSAGE = 115L;

    public static final String CROSS_ORDER_CANCEL_REPLACE_REQUEST_MESSAGE_AS_STR = "t";
    public static final long CROSS_ORDER_CANCEL_REPLACE_REQUEST_MESSAGE = 116L;

    public static final String CROSS_ORDER_CANCEL_REQUEST_MESSAGE_AS_STR = "u";
    public static final long CROSS_ORDER_CANCEL_REQUEST_MESSAGE = 117L;

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

    public static final int LIST_STATUS_TEXT = 444;

    public static final int CUST_DIRECTED_ORDER = 1029;

    public static final int EVENT_DATE = 866;

    public static final int AGREEMENT_ID = 914;

    public static final int STRATEGY_PARAMETER_TYPE = 959;

    public static final int STRIKE_RULE_ID = 1223;

    public static final int MAILING_INST = 482;

    public static final int ALLOC_CLEARING_FEE_INDICATOR = 1136;

    public static final int UNDERLYING_LAST_PX = 651;

    public static final int M_D_IMPLICIT_DELETE = 547;

    public static final int SETTL_OBLIG_SOURCE = 1164;

    public static final int BID_PX = 132;

    public static final int NOTIFY_BROKER_OF_CREDIT = 208;

    public static final int REF_SEQ_NUM = 45;

    public static final int M_D_ENTRY_BUYER = 288;

    public static final int INSTRUMENT_PARTY_ROLE = 1051;

    public static final int SETTL_INST_SOURCE = 165;

    public static final int TRANS_BKD_TIME = 483;

    public static final int NO_APPL_IDS = 1351;

    public static final int CONFIRM_REF_ID = 772;

    public static final int UNDERLYING_QTY = 879;

    public static final int FIRST_PX = 1025;

    public static final int MATURITY_MONTH_YEAR_INCREMENT = 1229;

    public static final int COLL_REQ_ID = 894;

    public static final int CROSS_ID = 548;

    public static final int CUST_ORDER_CAPACITY = 582;

    public static final int LEG_SECURITY_ALT_ID_SOURCE = 606;

    public static final int NOT_AFFECTED_ORDER_ID = 1371;

    public static final int STREAM_ASGN_RPT_ID = 1501;

    public static final int NO_SETTL_PARTY_IDS = 781;

    public static final int NETWORK_REQUEST_TYPE = 935;

    public static final int LEG_SETTL_DATE = 588;

    public static final int TRAD_SES_MODE = 339;

    public static final int AVG_PX_PRECISION = 74;

    public static final int CASH_DISTRIB_AGENT_NAME = 498;

    public static final int UNDERLYING_SECURITY_ALT_ID_SOURCE = 459;

    public static final int MATURITY_MONTH_YEAR_FORMAT = 1303;

    public static final int CORPORATE_ACTION = 292;

    public static final int CONFIRM_ID = 664;

    public static final int OPEN_CLOSE_SETTL_FLAG = 286;

    public static final int TARGET_STRATEGY_PERFORMANCE = 850;

    public static final int DUE_TO_RELATED = 329;

    public static final int PEG_SECURITY_ID = 1097;

    public static final int M_D_ENTRY_PX = 270;

    public static final int UNDERLYING_COLLECT_AMOUNT = 986;

    public static final int LEG_SECURITY_ID = 602;

    public static final int VALUE_OF_FUTURES = 408;

    public static final int QUOTE_RESP_ID = 693;

    public static final int BASIS_FEATURE_PRICE = 260;

    public static final int BUY_VOLUME = 330;

    public static final int SETTL_PARTY_SUB_ID = 785;

    public static final int FOREX_REQ = 121;

    public static final int POS_TYPE = 703;

    public static final int N_T_POSITION_LIMIT = 971;

    public static final int DERIVATIVE_SECURITY_DESC = 1279;

    public static final int DESK_ID = 284;

    public static final int DISTRIB_PERCENTAGE = 512;

    public static final int LOW_LIMIT_PRICE = 1148;

    public static final int UNDERLYING_MATURITY_TIME = 1213;

    public static final int NO_DERIVATIVE_EVENTS = 1286;

    public static final int TRAD_SES_STATUS = 340;

    public static final int LIST_NAME = 392;

    public static final int FAIR_VALUE = 406;

    public static final int UNDERLYING_ALLOCATION_PERCENT = 972;

    public static final int SIDE_TRADE_REPORT_ID = 1005;

    public static final int APPL_TOTAL_MESSAGE_COUNT = 1349;

    public static final int LOCATE_REQD = 114;

    public static final int MESSAGE_ENCODING = 347;

    public static final int NO_BID_DESCRIPTORS = 398;

    public static final int START_TICK_PRICE_RANGE = 1206;

    public static final int EXEC_VALUATION_POINT = 515;

    public static final int LEG_LOCALE_OF_ISSUE = 598;

    public static final int ENCRYPTED_PASSWORD_METHOD = 1400;

    public static final int TRADE_LEG_REF_ID = 824;

    public static final int APPL_REQ_TYPE = 1347;

    public static final int ORIG_POS_REQ_REF_ID = 713;

    public static final int CROSS_PRIORITIZATION = 550;

    public static final int NO_M_D_ENTRIES = 268;

    public static final int UNDERLYING_ISSUER = 306;

    public static final int ALLOC_QTY = 80;

    public static final int SYMBOL_SFX = 65;

    public static final int ORIG_SECONDARY_TRADE_ID = 1127;

    public static final int EXPIRE_DATE = 432;

    public static final int NO_LEG_SECURITY_ALT_ID = 604;

    public static final int NO_EVENTS = 864;

    public static final int ALLOC_ACCT_ID_SOURCE = 661;

    public static final int LEG_OPTION_RATIO = 1017;

    public static final int DERIVATIVE_SECURITY_TYPE = 1249;

    public static final int XML_DATA_LEN = 212;

    public static final int C_F_I_CODE = 461;

    public static final int COLL_INQUIRY_STATUS = 945;

    public static final int HIGH_LIMIT_PRICE = 1149;

    public static final int SETTL_OBLIG_REF_ID = 1163;

    public static final int LEG_SETTL_TYPE = 587;

    public static final int NO_PARTY_SUB_IDS = 802;

    public static final int START_MATURITY_MONTH_YEAR = 1241;

    public static final int REGIST_REJ_REASON_TEXT = 496;

    public static final int ENCODED_TEXT_LEN = 354;

    public static final int LIST_EXEC_INST_TYPE = 433;

    public static final int DERIVATIVE_INSTR_ATTRIB_TYPE = 1313;

    public static final int LANGUAGE_CODE = 1474;

    public static final int MARKET_REQ_ID = 1393;

    public static final int DEF_BID_SIZE = 293;

    public static final int INTEREST_AT_MATURITY = 738;

    public static final int HEADLINE = 148;

    public static final int LEG_PRICE_TYPE = 686;

    public static final int LEG_CALCULATED_CCY_LAST_QTY = 1074;

    public static final int TRIGGER_NEW_QTY = 1112;

    public static final int MATCH_STATUS = 573;

    public static final int MAX_PRICE_VARIATION = 1143;

    public static final int DERIVATIVE_SECURITY_X_M_L_LEN = 1282;

    public static final int BOOKING_TYPE = 775;

    public static final int NO_QUOTE_SETS = 296;

    public static final int TRIGGER_PRICE_DIRECTION = 1109;

    public static final int PARTY_ROLE = 452;

    public static final int DERIVATIVE_OPT_ATTRIBUTE = 1265;

    public static final int DERIVATIVE_SETTL_METHOD = 1317;

    public static final int SENDER_SUB_ID = 50;

    public static final int UNIT_OF_MEASURE = 996;

    public static final int CASH_ORDER_QTY = 152;

    public static final int M_D_QUOTE_TYPE = 1070;

    public static final int SIDE_VALUE_IND = 401;

    public static final int STRATEGY_PARAMETER_VALUE = 960;

    public static final int DERIVATIVE_CONTRACT_SETTL_MONTH = 1285;

    public static final int M_D_SEC_SIZE_TYPE = 1178;

    public static final int UNDERLYING_F_X_RATE = 1045;

    public static final int LEG_SECURITY_DESC = 620;

    public static final int YIELD_REDEMPTION_DATE = 696;

    public static final int DERIVATIVE_INSTRUMENT_PARTY_ROLE = 1295;

    public static final int UNDERLYING_INSTR_REGISTRY = 595;

    public static final int NO_MSG_TYPES = 384;

    public static final int UNDERLYING_STIP_VALUE = 889;

    public static final int PRICE_TYPE = 423;

    public static final int LEGAL_CONFIRM = 650;

    public static final int TOTAL_NET_VALUE = 900;

    public static final int UNDERLYING_SETTLEMENT_DATE = 987;

    public static final int TRAD_SES_REQ_ID = 335;

    public static final int LEG_POSITION_EFFECT = 564;

    public static final int NO_SIDES = 552;

    public static final int ASGN_RPT_ID = 833;

    public static final int NO_ROUTING_IDS = 215;

    public static final int ROUND_LOT = 561;

    public static final int UNDERLYING_LEG_MATURITY_MONTH_YEAR = 1339;

    public static final int ALLOC_PRICE = 366;

    public static final int SECURITY_ID = 48;

    public static final int TRADE_LINK_ID = 820;

    public static final int AFFIRM_STATUS = 940;

    public static final int LAST_LIQUIDITY_IND = 851;

    public static final int MASS_ACTION_TYPE = 1373;

    public static final int LEG_FLOW_SCHEDULE_TYPE = 1440;

    public static final int SETTL_CURR_AMT = 119;

    public static final int ALLOC_REPORT_ID = 755;

    public static final int PRICE_PROTECTION_SCOPE = 1092;

    public static final int RPT_SEQ = 83;

    public static final int TRADING_CURRENCY = 1245;

    public static final int MARKET_ID = 1301;

    public static final int NO_RELATED_SYM = 146;

    public static final int BUSINESS_REJECT_REASON = 380;

    public static final int DISCRETION_MOVE_TYPE = 841;

    public static final int FLEX_PRODUCT_ELIGIBILITY_INDICATOR = 1242;

    public static final int SECONDARY_ORDER_ID = 198;

    public static final int NO_TRADES = 897;

    public static final int DERIVATIVE_ENCODED_SECURITY_DESC_LEN = 1280;

    public static final int OPT_PAYOUT_TYPE = 1482;

    public static final int NO_STIPULATIONS = 232;

    public static final int QUOTE_STATUS_REQ_ID = 649;

    public static final int USERNAME = 553;

    public static final int ROOT_PARTY_ROLE = 1119;

    public static final int ALLOWABLE_ONE_SIDEDNESS_PCT = 765;

    public static final int TEST_REQ_ID = 112;

    public static final int LAST_MSG_SEQ_NUM_PROCESSED = 369;

    public static final int CLEARING_INSTRUCTION = 577;

    public static final int TOT_NO_QUOTE_ENTRIES = 304;

    public static final int BID_TRADE_TYPE = 418;

    public static final int MAILING_DTLS = 474;

    public static final int SECURITY_X_M_L_LEN = 1184;

    public static final int DERIVATIVE_PUT_OR_CALL = 1323;

    public static final int EXEC_ID = 17;

    public static final int ENCODED_TEXT = 355;

    public static final int SETTL_INST_REQ_REJ_CODE = 792;

    public static final int NO_STRATEGY_PARAMETERS = 957;

    public static final int LOCATION_ID = 283;

    public static final int UNDERLYING_PUT_OR_CALL = 315;

    public static final int END_STRIKE_PX_RANGE = 1203;

    public static final int DERIVATIVE_MATURITY_MONTH_YEAR = 1251;

    public static final int WORKING_INDICATOR = 636;

    public static final int MIN_BID_SIZE = 647;

    public static final int DISPLAY_HIGH_QTY = 1086;

    public static final int DERIVATIVE_INSTR_ATTRIB_VALUE = 1314;

    public static final int SESSION_STATUS = 1409;

    public static final int POSITION_EFFECT = 77;

    public static final int NO_UNDLY_INSTRUMENT_PARTIES = 1058;

    public static final int REF_APPL_VER_ID = 1130;

    public static final int UNDERLYING_LEG_SYMBOL = 1330;

    public static final int TRADE_HANDLING_INSTR = 1123;

    public static final int MARKET_SEGMENT_ID = 1300;

    public static final int COMPLEX_EVENT_PRICE = 1486;

    public static final int NEWS_REF_ID = 1476;

    public static final int LEG_FACTOR = 253;

    public static final int DATE_OF_BIRTH = 486;

    public static final int UNDERLYING_ORIGINAL_NOTIONAL_PERCENTAGE_OUTSTANDING = 1456;

    public static final int REF_ORD_ID_REASON = 1431;

    public static final int ENCODED_SUBJECT = 357;

    public static final int MARKET_DEPTH = 264;

    public static final int NO_POSITIONS = 702;

    public static final int DERIVATIVE_ISSUER = 1275;

    public static final int DESK_TYPE_SOURCE = 1034;

    public static final int PRICE_QUOTE_METHOD = 1196;

    public static final int EXEC_ACK_STATUS = 1036;

    public static final int NO_AFFECTED_ORDERS = 534;

    public static final int TRIGGER_ORDER_TYPE = 1111;

    public static final int SELLER_DAYS = 287;

    public static final int CONTRA_LEG_REF_ID = 655;

    public static final int NO_SETTL_INST = 778;

    public static final int NO_ROOT_PARTY_SUB_IDS = 1120;

    public static final int MARKET_UPDATE_ACTION = 1395;

    public static final int UNDERLYING_STRIKE_CURRENCY = 941;

    public static final int DERIVATIVE_ENCODED_ISSUER = 1278;

    public static final int MAX_MESSAGE_SIZE = 383;

    public static final int SETTL_PRICE = 730;

    public static final int UNDERLYING_SYMBOL = 311;

    public static final int APPL_NEW_SEQ_NUM = 1399;

    public static final int SETTL_PARTY_SUB_ID_TYPE = 786;

    public static final int NO_DISTRIB_INSTS = 510;

    public static final int TRADE_REQUEST_STATUS = 750;

    public static final int TIME_TO_EXPIRATION = 1189;

    public static final int LIST_EXEC_INST = 69;

    public static final int NET_CHG_PREV_DAY = 451;

    public static final int SETTL_DATE2 = 193;

    public static final int QUOTE_PRICE_TYPE = 692;

    public static final int NO_NESTED_INSTR_ATTRIB = 1312;

    public static final int EX_DESTINATION_ID_SOURCE = 1133;

    public static final int NO_LOT_TYPE_RULES = 1234;

    public static final int I_O_I_REF_ID = 26;

    public static final int SIDE = 54;

    public static final int SECURITY_STATUS_REQ_ID = 324;

    public static final int UNDERLYING_LEG_MATURITY_TIME = 1405;

    public static final int RESPONDENT_TYPE = 1172;

    public static final int SECURITY_LIST_REF_ID = 1466;

    public static final int UNDERLYING_ISSUE_DATE = 242;

    public static final int SENDING_TIME = 52;

    public static final int DISCRETION_OFFSET_TYPE = 842;

    public static final int SECURE_DATA_LEN = 90;

    public static final int ALLOC_INTEREST_AT_MATURITY = 741;

    public static final int MIN_LOT_SIZE = 1231;

    public static final int NESTED4_PARTY_SUB_ID = 1412;

    public static final int REPORTED_PX_DIFF = 1134;

    public static final int LEG_REPURCHASE_TERM = 251;

    public static final int DAY_CUM_QTY = 425;

    public static final int COUPON_RATE = 223;

    public static final int UNDERLYING_C_P_PROGRAM = 877;

    public static final int ALLOC_REPORT_REF_ID = 795;

    public static final int DERIVATIVE_POSITION_LIMIT = 1273;

    public static final int REF_SUB_ID = 931;

    public static final int SIDE_TRD_REG_TIMESTAMP = 1012;

    public static final int QUOTE_REJECT_REASON = 300;

    public static final int POS_MAINT_RESULT = 723;

    public static final int UNDERLYING_TIME_UNIT = 1000;

    public static final int TOT_NO_ACC_QUOTES = 1169;

    public static final int TRADE_INPUT_SOURCE = 578;

    public static final int TEXT = 58;

    public static final int MSG_TYPE = 35;

    public static final int BID_ID = 390;

    public static final int START_STRIKE_PX_RANGE = 1202;

    public static final int DERIVATIVE_EVENT_TYPE = 1287;

    public static final int T_Z_TRANSACT_TIME = 1132;

    public static final int CUST_ORDER_HANDLING_INST = 1031;

    public static final int NO_COMPLEX_EVENTS = 1483;

    public static final int DERIVATIVE_INSTR_REGISTRY = 1257;

    public static final int REF_ORDER_ID = 1080;

    public static final int CONCESSION = 238;

    public static final int CONFIRM_REQ_ID = 859;

    public static final int ALLOC_AVG_PX = 153;

    public static final int COLL_ASGN_RESP_TYPE = 905;

    public static final int ENCODED_LEG_ISSUER = 619;

    public static final int ALT_M_D_SOURCE_ID = 817;

    public static final int UNDERLYING_SETTLEMENT_TYPE = 975;

    public static final int DESK_TYPE = 1033;

    public static final int CASH_DISTRIB_CURR = 478;

    public static final int TRADE_INPUT_DEVICE = 579;

    public static final int NO_NESTED2_PARTY_SUB_IDS = 806;

    public static final int DERIVATIVE_INSTRUMENT_PARTY_SUB_ID_TYPE = 1298;

    public static final int MATURITY_MONTH_YEAR = 200;

    public static final int LEG_REF_ID = 654;

    public static final int DERIVATIVE_FLOOR_PRICE = 1322;

    public static final int EVENT_TYPE = 865;

    public static final int EXEC_PRICE_TYPE = 484;

    public static final int SIDE_LAST_QTY = 1009;

    public static final int DISCRETION_INST = 388;

    public static final int LEG_CREDIT_RATING = 257;

    public static final int DISPLAY_LOW_QTY = 1085;

    public static final int PREVIOUSLY_REPORTED = 570;

    public static final int SETTL_PARTY_ID_SOURCE = 783;

    public static final int UNDERLYING_CASH_AMOUNT = 973;

    public static final int SPREAD = 218;

    public static final int LAST_RPT_REQUESTED = 912;

    public static final int DERIVATIVE_VALUATION_METHOD = 1319;

    public static final int TARGET_PARTY_ROLE = 1464;

    public static final int NO_HOPS = 627;

    public static final int LEG_COUPON_RATE = 615;

    public static final int PARTY_ID = 448;

    public static final int FACTOR = 228;

    public static final int HALT_REASON = 327;

    public static final int COMPLEX_EVENT_START_DATE = 1492;

    public static final int CL_ORD_LINK_ID = 583;

    public static final int NO_DERIVATIVE_INSTRUMENT_PARTIES = 1292;

    public static final int CANCELLATION_RIGHTS = 480;

    public static final int REJECT_TEXT = 1328;

    public static final int NESTED_PARTY_SUB_ID = 545;

    public static final int COLL_RESP_ID = 904;

    public static final int NETWORK_RESPONSE_ID = 932;

    public static final int DERIVATIVE_SYMBOL_SFX = 1215;

    public static final int PARENT_MKT_SEGM_ID = 1325;

    public static final int M_D_ENTRY_TIME = 273;

    public static final int LEG_SETTL_CURRENCY = 675;

    public static final int UNDERLYING_LEG_SYMBOL_SFX = 1331;

    public static final int UNDERLYING_REPO_COLLATERAL_SECURITY_TYPE = 243;

    public static final int LEG_DATED_DATE = 739;

    public static final int UNDERLYING_PX = 810;

    public static final int NO_SECURITY_TYPES = 558;

    public static final int UNDERLYING_INSTRUMENT_PARTY_ROLE = 1061;

    public static final int ATTACHMENT_POINT = 1457;

    public static final int LIST_SEQ_NO = 67;

    public static final int LEG_POOL = 740;

    public static final int NO_DERIVATIVE_SECURITY_ALT_ID = 1218;

    public static final int NO_UNDLY_INSTRUMENT_PARTY_SUB_IDS = 1062;

    public static final int SECURITY_RESPONSE_ID = 322;

    public static final int SECURITY_ALT_ID_SOURCE = 456;

    public static final int ROOT_PARTY_SUB_ID_TYPE = 1122;

    public static final int NO_UNDERLYINGS = 711;

    public static final int NO_QUOTE_QUALIFIERS = 735;

    public static final int NO_UNDERLYING_STIPS = 887;

    public static final int NO_TRD_REG_TIMESTAMPS = 768;

    public static final int DERIVATIVE_ISSUE_DATE = 1276;

    public static final int AGREEMENT_DATE = 915;

    public static final int MISC_FEE_BASIS = 891;

    public static final int STATUS_TEXT = 929;

    public static final int CONTINGENCY_TYPE = 1385;

    public static final int CROSS_TYPE = 549;

    public static final int REGIST_REF_ID = 508;

    public static final int LEG_GROSS_TRADE_AMT = 1075;

    public static final int LIQUIDITY_VALUE = 404;

    public static final int SETTL_METHOD = 1193;

    public static final int LIQUIDITY_PCT_HIGH = 403;

    public static final int ALLOC_SETTL_CURRENCY = 736;

    public static final int LEG_REPURCHASE_RATE = 252;

    public static final int QUOTE_ENTRY_ID = 299;

    public static final int NO_NEWS_REF_IDS = 1475;

    public static final int NO_PARTY_IDS = 453;

    public static final int NO_NOT_AFFECTED_ORDERS = 1370;

    public static final int SECURITY_SUB_TYPE = 762;

    public static final int LEG_PUT_OR_CALL = 1358;

    public static final int TRADE_REPORT_TRANS_TYPE = 487;

    public static final int DERIVATIVE_SETTLE_ON_OPEN_FLAG = 1254;

    public static final int NESTED3_PARTY_ID = 949;

    public static final int FLEXIBLE_INDICATOR = 1244;

    public static final int DERIVATIVE_EVENT_DATE = 1288;

    public static final int UNDERLYING_PRICE_UNIT_OF_MEASURE = 1424;

    public static final int NO_RPTS = 82;

    public static final int MARKET_SEGMENT_DESC = 1396;

    public static final int STREAM_ASGN_REJ_REASON = 1502;

    public static final int QUOTE_CANCEL_TYPE = 298;

    public static final int END_CASH = 922;

    public static final int PEG_SECURITY_ID_SOURCE = 1096;

    public static final int STRIKE_EXERCISE_STYLE = 1304;

    public static final int ACCOUNT_TYPE = 581;

    public static final int CONTRA_BROKER = 375;

    public static final int STOP_PX = 99;

    public static final int LIST_ID = 66;

    public static final int ROUTING_ID = 217;

    public static final int LEG_PRICE = 566;

    public static final int NO_REGIST_DTLS = 473;

    public static final int LEG_INSTR_REGISTRY = 599;

    public static final int LEG_SECURITY_TYPE = 609;

    public static final int HEART_BT_INT = 108;

    public static final int LEG_ALLOC_ACCT_ID_SOURCE = 674;

    public static final int TOT_NO_FILLS = 1361;

    public static final int ROUNDING_DIRECTION = 468;

    public static final int NO_LEG_STIPULATIONS = 683;

    public static final int DELETE_REASON = 285;

    public static final int UNDERLYING_LEG_PUT_OR_CALL = 1343;

    public static final int MISC_FEE_AMT = 137;

    public static final int NUM_BIDDERS = 417;

    public static final int CLEARING_BUSINESS_DATE = 715;

    public static final int PRIOR_SPREAD_INDICATOR = 720;

    public static final int LEG_PRODUCT = 607;

    public static final int USER_STATUS = 926;

    public static final int ENCODED_MKT_SEGM_DESC_LEN = 1397;

    public static final int TRAD_SES_UPDATE_ACTION = 1327;

    public static final int DERIVATIVE_ENCODED_ISSUER_LEN = 1277;

    public static final int CURRENCY = 15;

    public static final int NO_DLVY_INST = 85;

    public static final int PRICE_DELTA = 811;

    public static final int EXEC_TYPE = 150;

    public static final int DISTRIB_PAYMENT_METHOD = 477;

    public static final int DERIVATIVE_MIN_PRICE_INCREMENT_AMOUNT = 1268;

    public static final int LAST_NETWORK_RESPONSE_ID = 934;

    public static final int UNDERLYING_SETTLEMENT_STATUS = 988;

    public static final int RAW_DATA = 96;

    public static final int PEG_OFFSET_VALUE = 211;

    public static final int TOTAL_TAKEDOWN = 237;

    public static final int TOTAL_NUM_POS_REPORTS = 727;

    public static final int UNDERLYING_LEG_SECURITY_ID_SOURCE = 1333;

    public static final int BID_DESCRIPTOR_TYPE = 399;

    public static final int REVERSAL_INDICATOR = 700;

    public static final int NO_COMPLEX_EVENT_DATES = 1491;

    public static final int ORDER_CAPACITY = 528;

    public static final int ENCODED_SECURITY_LIST_DESC_LEN = 1468;

    public static final int LEG_COUPON_PAYMENT_DATE = 248;

    public static final int FLOOR_PRICE = 1200;

    public static final int UNDERLYING_LEG_SECURITY_SUB_TYPE = 1338;

    public static final int NEXT_EXPECTED_MSG_SEQ_NUM = 789;

    public static final int USER_REQUEST_ID = 923;

    public static final int SECONDARY_LOW_LIMIT_PRICE = 1221;

    public static final int ON_BEHALF_OF_SUB_ID = 116;

    public static final int ENCODED_ALLOC_TEXT_LEN = 360;

    public static final int PAYMENT_REF = 476;

    public static final int BENCHMARK_CURVE_POINT = 222;

    public static final int SECONDARY_EXEC_ID = 527;

    public static final int DERIVATIVE_SECURITY_ALT_ID_SOURCE = 1220;

    public static final int LEG_STRIKE_CURRENCY = 942;

    public static final int RESET_SEQ_NUM_FLAG = 141;

    public static final int STAND_INST_DB_NAME = 170;

    public static final int COPY_MSG_INDICATOR = 797;

    public static final int MID_PX = 631;

    public static final int TAX_ADVANTAGE_TYPE = 495;

    public static final int REFRESH_INDICATOR = 1187;

    public static final int TARGET_PARTY_ID = 1462;

    public static final int MIN_PRICE_INCREMENT = 969;

    public static final int MIN_QTY = 110;

    public static final int REGIST_STATUS = 506;

    public static final int LEG_BENCHMARK_PRICE_TYPE = 680;

    public static final int UNDERLYING_COUPON_PAYMENT_DATE = 241;

    public static final int ROOT_PARTY_ID_SOURCE = 1118;

    public static final int COMPLEX_EVENT_END_DATE = 1493;

    public static final int UNDERLYING_CAP_VALUE = 1038;

    public static final int POS_MAINT_RPT_REF_ID = 714;

    public static final int MULTILEG_PRICE_METHOD = 1378;

    public static final int LEG_NUMBER = 1152;

    public static final int TRADE_REQUEST_TYPE = 569;

    public static final int NO_DERIVATIVE_INSTRUMENT_PARTY_SUB_IDS = 1296;

    public static final int PRIOR_SETTL_PRICE = 734;

    public static final int LEG_OFFER_FORWARD_POINTS = 1068;

    public static final int LIST_UPDATE_ACTION = 1324;

    public static final int TRD_TYPE = 828;

    public static final int IMPLIED_MARKET_INDICATOR = 1144;

    public static final int DESIGNATION = 494;

    public static final int UNDERLYING_CURRENT_VALUE = 885;

    public static final int MAX_TRADE_VOL = 1140;

    public static final int CUM_QTY = 14;

    public static final int TRADE_REPORT_ID = 571;

    public static final int UNDERLYING_START_VALUE = 884;

    public static final int VALID_UNTIL_TIME = 62;

    public static final int FILL_PX = 1364;

    public static final int UNDERLYING_LEG_SECURITY_ALT_ID_SOURCE = 1336;

    public static final int QUOTE_REQUEST_TYPE = 303;

    public static final int DERIVATIVE_UNIT_OF_MEASURE = 1269;

    public static final int ISSUE_DATE = 225;

    public static final int CASH_DISTRIB_AGENT_ACCT_NUMBER = 500;

    public static final int PRIVATE_QUOTE = 1171;

    public static final int CASH_DISTRIB_AGENT_ACCT_NAME = 502;

    public static final int STRIKE_TIME = 443;

    public static final int NO_FILLS = 1362;

    public static final int SECURITY_REQUEST_RESULT = 560;

    public static final int ALLOC_REPORT_TYPE = 794;

    public static final int UNDERLYING_F_X_RATE_CALC = 1046;

    public static final int TRIGGER_TRADING_SESSION_SUB_ID = 1114;

    public static final int NO_COMPLEX_EVENT_TIMES = 1494;

    public static final int YIELD = 236;

    public static final int BID_SPOT_RATE = 188;

    public static final int NO_RATE_SOURCES = 1445;

    public static final int APPL_RESEND_FLAG = 1352;

    public static final int REGIST_TRANS_TYPE = 514;

    public static final int LEG_QTY = 687;

    public static final int COMMISSION = 12;

    public static final int PARTY_SUB_ID = 523;

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

    public static final int UNDERLYING_INSTRUMENT_PARTY_SUB_ID_TYPE = 1064;

    public static final int LEG_MATURITY_DATE = 611;

    public static final int ON_BEHALF_OF_LOCATION_ID = 144;

    public static final int LEG_STIPULATION_TYPE = 688;

    public static final int MID_YIELD = 633;

    public static final int ENCRYPT_METHOD = 98;

    public static final int LEG_LAST_QTY = 1418;

    public static final int DERIVATIVE_MATURITY_DATE = 1252;

    public static final int QUOTE_ID = 117;

    public static final int ORD_TYPE = 40;

    public static final int CURRENCY_RATIO = 1382;

    public static final int REGIST_REJ_REASON_CODE = 507;

    public static final int OFFER_YIELD = 634;

    public static final int SIDE_MULTI_LEG_REPORTING_TYPE = 752;

    public static final int NESTED2_PARTY_SUB_ID = 760;

    public static final int AS_OF_INDICATOR = 1015;

    public static final int SECURITY_GROUP = 1151;

    public static final int NUMBER_OF_ORDERS = 346;

    public static final int QUOTE_RESPONSE_LEVEL = 301;

    public static final int PUBLISH_TRD_INDICATOR = 852;

    public static final int ENCODED_SECURITY_DESC_LEN = 350;

    public static final int QUOTE_REQUEST_REJECT_REASON = 658;

    public static final int COMPLEX_EVENT_TYPE = 1484;

    public static final int TOT_NO_REJ_QUOTES = 1170;

    public static final int LIST_METHOD = 1198;

    public static final int STREAM_ASGN_ACK_TYPE = 1503;

    public static final int LEG_SECURITY_ALT_ID = 605;

    public static final int TRADING_SESSION_DESC = 1326;

    public static final int NESTED2_PARTY_SUB_ID_TYPE = 807;

    public static final int TRADE_ID = 1003;

    public static final int DERIVATIVE_EVENT_PX = 1290;

    public static final int UNDERLYING_INSTRUMENT_PARTY_ID = 1059;

    public static final int LEG_LAST_PX = 637;

    public static final int ENCODED_ISSUER = 349;

    public static final int BUSINESS_REJECT_REF_ID = 379;

    public static final int ADV_ID = 2;

    public static final int DISCRETION_PRICE = 845;

    public static final int NO_NESTED_PARTY_IDS = 539;

    public static final int DERIVATIVE_INSTRUMENT_PARTY_ID_SOURCE = 1294;

    public static final int MIN_TRADE_VOL = 562;

    public static final int PRICE2 = 640;

    public static final int OPT_PAYOUT_AMOUNT = 1195;

    public static final int PROG_PERIOD_INTERVAL = 415;

    public static final int SECURITY_EXCHANGE = 207;

    public static final int CLIENT_BID_ID = 391;

    public static final int SECURITY_LIST_DESC = 1467;

    public static final int NO_UNDERLYING_AMOUNTS = 984;

    public static final int I_O_I_QTY = 27;

    public static final int LEAVES_QTY = 151;

    public static final int EXEC_INST_VALUE = 1308;

    public static final int PASSWORD = 554;

    public static final int LEG_SIDE = 624;

    public static final int DISCRETION_OFFSET_VALUE = 389;

    public static final int SIDE_TRD_REG_TIMESTAMP_SRC = 1014;

    public static final int LEG_CONTRACT_SETTL_MONTH = 955;

    public static final int UNDERLYING_TRADING_SESSION_SUB_ID = 823;

    public static final int STIPULATION_VALUE = 234;

    public static final int START_CASH = 921;

    public static final int UNDERLYING_INSTRUMENT_PARTY_ID_SOURCE = 1060;

    public static final int SETTL_TYPE = 63;

    public static final int BENCHMARK_CURVE_NAME = 221;

    public static final int SCOPE = 546;

    public static final int SIDE_EXEC_ID = 1427;

    public static final int NO_INSTRUMENT_PARTY_SUB_IDS = 1052;

    public static final int DISPLAY_QTY = 1138;

    public static final int ORIG_TRADE_DATE = 1125;

    public static final int POSS_DUP_FLAG = 43;

    public static final int ENCODED_UNDERLYING_ISSUER = 363;

    public static final int OFFER_SIZE = 135;

    public static final int MATURITY_TIME = 1079;

    public static final int ALLOC_ACCOUNT = 79;

    public static final int COLL_ASGN_REJECT_REASON = 906;

    public static final int NEWS_CATEGORY = 1473;

    public static final int UNDERLYING_COUPON_RATE = 435;

    public static final int LEG_PRICE_UNIT_OF_MEASURE = 1421;

    public static final int SWAP_POINTS = 1069;

    public static final int STRIKE_CURRENCY = 947;

    public static final int SECONDARY_TRADING_REFERENCE_PRICE = 1240;

    public static final int INSTRUMENT_PARTY_ID = 1019;

    public static final int NO_TRADING_SESSION_RULES = 1309;

    public static final int RISK_FREE_RATE = 1190;

    public static final int ORDER_BOOKING_QTY = 800;

    public static final int COUPON_PAYMENT_DATE = 224;

    public static final int UNDERLYING_DELIVERY_AMOUNT = 1037;

    public static final int SETTL_SESS_ID = 716;

    public static final int UNDERLYING_TRADING_SESSION_ID = 822;

    public static final int SETTLE_ON_OPEN_FLAG = 966;

    public static final int YIELD_REDEMPTION_PRICE_TYPE = 698;

    public static final int ORIG_ORD_MOD_TIME = 586;

    public static final int NO_TIME_IN_FORCE_RULES = 1239;

    public static final int SETTL_CURR_OFFER_FX_RATE = 657;

    public static final int UNDERLYING_SETTL_PRICE = 732;

    public static final int EXEC_INST = 18;

    public static final int DELIVERY_TYPE = 919;

    public static final int ORIG_CUST_ORDER_CAPACITY = 1432;

    public static final int M_D_REQ_REJ_REASON = 281;

    public static final int CASH_MARGIN = 544;

    public static final int LEG_ISSUE_DATE = 249;

    public static final int ALLOC_TRANS_TYPE = 71;

    public static final int RESPONSE_TRANSPORT_TYPE = 725;

    public static final int DERIVATIVE_LIST_METHOD = 1320;

    public static final int NO_EXECS = 124;

    public static final int UNDERLYING_SECURITY_ALT_ID = 458;

    public static final int G_T_BOOKING_INST = 427;

    public static final int COUNTRY = 421;

    public static final int LATE_INDICATOR = 978;

    public static final int ORIG_CL_ORD_ID = 41;

    public static final int BID_REQUEST_TRANS_TYPE = 374;

    public static final int UNDERLYING_LEG_C_F_I_CODE = 1344;

    public static final int DERIVATIVE_MIN_PRICE_INCREMENT = 1267;

    public static final int TICK_RULE_TYPE = 1209;

    public static final int ENCRYPTED_PASSWORD_LEN = 1401;

    public static final int REF_APPL_EXT_ID = 1406;

    public static final int DERIVATIVE_SECURITY_X_M_L_SCHEMA = 1284;

    public static final int PARTICIPATION_RATE = 849;

    public static final int UNDERLYING_DIRTY_PRICE = 882;

    public static final int TRD_SUB_TYPE = 829;

    public static final int SETTL_DATE = 64;

    public static final int ORDER_PERCENT = 516;

    public static final int MARGIN_RATIO = 898;

    public static final int SECURITY_X_M_L = 1185;

    public static final int LEG_MATURITY_MONTH_YEAR = 610;

    public static final int TRIGGER_TRADING_SESSION_ID = 1113;

    public static final int COLL_INQUIRY_QUALIFIER = 896;

    public static final int SECURITY_X_M_L_SCHEMA = 1186;

    public static final int DELIVER_TO_LOCATION_ID = 145;

    public static final int DERIVATIVE_EVENT_TEXT = 1291;

    public static final int POS_MAINT_RPT_ID = 721;

    public static final int CONTRA_TRADER = 337;

    public static final int TRADE_PUBLISH_INDICATOR = 1390;

    public static final int ALLOC_SETTL_INST_TYPE = 780;

    public static final int E_F_P_TRACKING_ERROR = 405;

    public static final int TRADING_SESSION_SUB_ID = 625;

    public static final int PEG_SYMBOL = 1098;

    public static final int INSTR_ATTRIB_VALUE = 872;

    public static final int NO_UNDERLYING_LEG_SECURITY_ALT_ID = 1334;

    public static final int LEG_EXEC_INST = 1384;

    public static final int NO_USERNAMES = 809;

    public static final int EXERCISE_STYLE = 1194;

    public static final int LEG_COVERED_OR_UNCOVERED = 565;

    public static final int UNDERLYING_STRIKE_PRICE = 316;

    public static final int DERIVATIVE_INSTRUMENT_PARTY_ID = 1293;

    public static final int OFFER_PX = 133;

    public static final int UNIT_OF_MEASURE_QTY = 1147;

    public static final int PRICE_UNIT_OF_MEASURE_QTY = 1192;

    public static final int DERIVATIVE_CONTRACT_MULTIPLIER_UNIT = 1438;

    public static final int DERIVATIVE_INSTRUMENT_PARTY_SUB_ID = 1297;

    public static final int NEWS_REF_TYPE = 1477;

    public static final int APPL_BEG_SEQ_NUM = 1182;

    public static final int LEG_OPT_ATTRIBUTE = 613;

    public static final int DELIVERY_DATE = 743;

    public static final int ALLOC_NET_MONEY = 154;

    public static final int AVG_PX = 6;

    public static final int SETTL_CURR_BID_FX_RATE = 656;

    public static final int INSTRUMENT_PARTY_SUB_ID = 1053;

    public static final int LIQUIDITY_PCT_LOW = 402;

    public static final int EXPIRATION_CYCLE = 827;

    public static final int UNDERLYING_SETTL_METHOD = 1039;

    public static final int MASS_ACTION_REPORT_ID = 1369;

    public static final int LEG_STRIKE_PRICE = 612;

    public static final int R_F_Q_REQ_ID = 644;

    public static final int BODY_LENGTH = 9;

    public static final int AUTO_ACCEPT_INDICATOR = 754;

    public static final int MARKET_REPORT_ID = 1394;

    public static final int TICK_INCREMENT = 1208;

    public static final int MASS_ACTION_RESPONSE = 1375;

    public static final int SECURITY_TRADING_EVENT = 1174;

    public static final int MSG_SEQ_NUM = 34;

    public static final int MASS_STATUS_REQ_TYPE = 585;

    public static final int REPORTED_PX = 861;

    public static final int OPEN_INTEREST = 746;

    public static final int I_O_I_NATURAL_FLAG = 130;

    public static final int DERIVATIVE_PRICE_QUOTE_METHOD = 1318;

    public static final int CONT_AMT_VALUE = 520;

    public static final int POSITION_CURRENCY = 1055;

    public static final int SECURE_DATA = 91;

    public static final int MKT_BID_PX = 645;

    public static final int TARGET_STRATEGY = 847;

    public static final int DERIVATIVE_SECURITY_GROUP = 1247;

    public static final int PAYMENT_METHOD = 492;

    public static final int STATS_TYPE = 1176;

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

    public static final int COLL_APPL_TYPE = 1043;

    public static final int TRADE_REPORT_REJECT_REASON = 751;

    public static final int DIVIDEND_YIELD = 1380;

    public static final int ENCODED_LEG_SECURITY_DESC = 622;

    public static final int NO_LINES_OF_TEXT = 33;

    public static final int COLL_ASGN_ID = 902;

    public static final int NOTIONAL_PERCENTAGE_OUTSTANDING = 1451;

    public static final int SHORT_QTY = 705;

    public static final int UNDERLYING_C_P_REG_TYPE = 878;

    public static final int UNDERLYING_LOCALE_OF_ISSUE = 594;

    public static final int ADV_TRANS_TYPE = 5;

    public static final int ROOT_PARTY_ID = 1117;

    public static final int CASH_DISTRIB_AGENT_CODE = 499;

    public static final int MAX_FLOOR = 111;

    public static final int ALLOC_INTERMED_REQ_TYPE = 808;

    public static final int SHORT_SALE_REASON = 853;

    public static final int TRADED_FLAT_SWITCH = 258;

    public static final int DLVY_INST_TYPE = 787;

    public static final int SECURITY_UPDATE_ACTION = 980;

    public static final int NO_CONTRA_BROKERS = 382;

    public static final int AFFECTED_ORDER_ID = 535;

    public static final int SETTL_DELIVERY_TYPE = 172;

    public static final int APPL_RESPONSE_ID = 1353;

    public static final int NESTED3_PARTY_ROLE = 951;

    public static final int TRADE_CONDITION = 277;

    public static final int SECURITY_LIST_TYPE_SOURCE = 1471;

    public static final int TRAD_SES_END_TIME = 345;

    public static final int SHARED_COMMISSION = 858;

    public static final int APPL_REQ_ID = 1346;

    public static final int TARGET_STRATEGY_PARAMETERS = 848;

    public static final int EXP_QTY = 983;

    public static final int ENCODED_LEG_SECURITY_DESC_LEN = 621;

    public static final int URGENCY = 61;

    public static final int EX_DESTINATION = 100;

    public static final int POS_TRANS_TYPE = 709;

    public static final int DERIVATIVE_FLOW_SCHEDULE_TYPE = 1442;

    public static final int ALLOC_ACCRUED_INTEREST_AMT = 742;

    public static final int UNDERLYING_END_VALUE = 886;

    public static final int REF_ORDER_ID_SOURCE = 1081;

    public static final int NET_GROSS_IND = 430;

    public static final int BEGIN_STRING = 8;

    public static final int M_D_FEED_TYPE = 1022;

    public static final int OFFER_SWAP_POINTS = 1066;

    public static final int ORIG_SENDING_TIME = 122;

    public static final int TRIGGER_ACTION = 1101;

    public static final int SECONDARY_TRADE_REPORT_ID = 818;

    public static final int PRODUCT = 460;

    public static final int LEG_UNIT_OF_MEASURE_QTY = 1224;

    public static final int UNDERLYING_INSTRUMENT_PARTY_SUB_ID = 1063;

    public static final int LEG_ALLOC_ID = 1366;

    public static final int NO_ORD_TYPE_RULES = 1237;

    public static final int OWNER_TYPE = 522;

    public static final int PARTY_SUB_ID_TYPE = 803;

    public static final int DERIVATIVE_SECURITY_ALT_ID = 1219;

    public static final int PRODUCT_COMPLEX = 1227;

    public static final int I_O_I_ID = 23;

    public static final int UNDERLYING_LEG_OPT_ATTRIBUTE = 1391;

    public static final int POOL = 691;

    public static final int DEF_OFFER_SIZE = 294;

    public static final int TIER_CODE = 994;

    public static final int CONTRACT_MULTIPLIER_UNIT = 1435;

    public static final int SECURITY_TRADING_STATUS = 326;

    public static final int FILL_EXEC_ID = 1363;

    public static final int POS_AMT = 708;

    public static final int NO_DERIVATIVE_INSTR_ATTRIB = 1311;

    public static final int UNDERLYING_PRICE_DETERMINATION_METHOD = 1481;

    public static final int CREDIT_RATING = 255;

    public static final int PEG_MOVE_TYPE = 835;

    public static final int TRIGGER_SECURITY_ID = 1104;

    public static final int COLL_INQUIRY_ID = 909;

    public static final int OPT_ATTRIBUTE = 206;

    public static final int ENCRYPTED_PASSWORD = 1402;

    public static final int SIDE_TRD_SUB_TYP = 1008;

    public static final int TOTAL_VOLUME_TRADED = 387;

    public static final int DAY_BOOKING_INST = 589;

    public static final int NO_NESTED3_PARTY_IDS = 948;

    public static final int DERIVATIVE_SECURITY_EXCHANGE = 1272;

    public static final int LEG_INTEREST_ACCRUAL_DATE = 956;

    public static final int REF_APPL_LAST_SEQ_NUM = 1357;

    public static final int CONTRA_TRADE_TIME = 438;

    public static final int ADV_REF_ID = 3;

    public static final int LEG_VOLATILITY = 1379;

    public static final int MATURITY_NET_MONEY = 890;

    public static final int SENDER_LOCATION_ID = 142;

    public static final int REF_ALLOC_ID = 72;

    public static final int COUNTRY_OF_ISSUE = 470;

    public static final int TOT_NO_ALLOCS = 892;

    public static final int LOW_PX = 333;

    public static final int MONEY_LAUNDERING_STATUS = 481;

    public static final int CARD_START_DATE = 503;

    public static final int NUM_TICKETS = 395;

    public static final int TOTAL_ACCRUED_INTEREST_AMT = 540;

    public static final int DESK_ORDER_HANDLING_INST = 1035;

    public static final int LAST_QTY = 32;

    public static final int M_D_ENTRY_DATE = 272;

    public static final int AVG_PAR_PX = 860;

    public static final int AGREEMENT_CURRENCY = 918;

    public static final int NO_I_O_I_QUALIFIERS = 199;

    public static final int C_P_PROGRAM = 875;

    public static final int END_TICK_PRICE_RANGE = 1207;

    public static final int LIQUIDITY_IND_TYPE = 409;

    public static final int NO_NESTED4_PARTY_SUB_IDS = 1413;

    public static final int POS_MAINT_ACTION = 712;

    public static final int UNDERLYING_REPURCHASE_TERM = 244;

    public static final int LEG_SYMBOL = 600;

    public static final int LAST_PX = 31;

    public static final int LEG_STIPULATION_VALUE = 689;

    public static final int RECEIVED_DEPT_ID = 1030;

    public static final int DERIV_FLEX_PRODUCT_ELIGIBILITY_INDICATOR = 1243;

    public static final int LAST_MKT = 30;

    public static final int NESTED_INSTR_ATTRIB_VALUE = 1211;

    public static final int LEG_SECURITY_EXCHANGE = 616;

    public static final int TARGET_PARTY_ID_SOURCE = 1463;

    public static final int UNDERLYING_CONTRACT_MULTIPLIER = 436;

    public static final int END_DATE = 917;

    public static final int ACCRUED_INTEREST_AMT = 159;

    public static final int TRAD_SES_METHOD = 338;

    public static final int MASS_CANCEL_REJECT_REASON = 532;

    public static final int COLL_ASGN_REF_ID = 907;

    public static final int UNDERLYING_LEG_SECURITY_DESC = 1392;

    public static final int UNDERLYING_END_PRICE = 883;

    public static final int TOT_NUM_TRADE_REPORTS = 748;

    public static final int BENCHMARK_SECURITY_ID = 699;

    public static final int ALLOC_HANDL_INST = 209;

    public static final int TOT_NUM_ASSIGNMENT_REPORTS = 832;

    public static final int HOST_CROSS_ID = 961;

    public static final int ALLOC_LINK_TYPE = 197;

    public static final int END_SEQ_NO = 16;

    public static final int INPUT_SOURCE = 979;

    public static final int UNDERLYING_CASH_TYPE = 974;

    public static final int SETTL_CURR_FX_RATE_CALC = 156;

    public static final int QUOTE_ENTRY_STATUS = 1167;

    public static final int TARGET_COMP_ID = 56;

    public static final int TRIGGER_SYMBOL = 1103;

    public static final int NESTED4_PARTY_SUB_ID_TYPE = 1411;

    public static final int CONTRACT_SETTL_MONTH = 667;

    public static final int UNDERLYING_STIP_TYPE = 888;

    public static final int CARD_HOLDER_NAME = 488;

    public static final int ORDER_DELAY = 1428;

    public static final int STRIKE_PRICE_DETERMINATION_METHOD = 1478;

    public static final int DELIVERY_FORM = 668;

    public static final int ORDER_QTY2 = 192;

    public static final int NO_COLL_INQUIRY_QUALIFIER = 938;

    public static final int SIDE_CURRENCY = 1154;

    public static final int M_D_ENTRY_SIZE = 271;

    public static final int DISPLAY_METHOD = 1084;

    public static final int OFFER_FORWARD_POINTS2 = 643;

    public static final int SETTL_INST_ID = 162;

    public static final int FEE_MULTIPLIER = 1329;

    public static final int LEG_BID_FORWARD_POINTS = 1067;

    public static final int REF_COMP_ID = 930;

    public static final int NO_STATS_INDICATORS = 1175;

    public static final int ENCODED_MKT_SEGM_DESC = 1398;

    public static final int NESTED4_PARTY_ID_SOURCE = 1416;

    public static final int ENCODED_HEADLINE_LEN = 358;

    public static final int NO_INSTRUMENT_PARTIES = 1018;

    public static final int MULTILEG_MODEL = 1377;

    public static final int UNDERLYING_SETTL_PRICE_TYPE = 733;

    public static final int DEALING_CAPACITY = 1048;

    public static final int SECONDARY_HIGH_LIMIT_PRICE = 1230;

    public static final int NESTED4_PARTY_ROLE = 1417;

    public static final int TRAD_SES_STATUS_REJ_REASON = 567;

    public static final int APPL_RESPONSE_TYPE = 1348;

    public static final int END_MATURITY_MONTH_YEAR = 1226;

    public static final int DERIVATIVE_ENCODED_SECURITY_DESC = 1281;

    public static final int TRD_REP_INDICATOR = 1389;

    public static final int CONFIRM_TRANS_TYPE = 666;

    public static final int UNDERLYING_NOTIONAL_PERCENTAGE_OUTSTANDING = 1455;

    public static final int STRATEGY_PARAMETER_NAME = 958;

    public static final int LEG_CONTRACT_MULTIPLIER = 614;

    public static final int COLL_ASGN_REASON = 895;

    public static final int BASIS_PX_TYPE = 419;

    public static final int NO_BID_COMPONENTS = 420;

    public static final int M_D_ENTRY_POSITION_NO = 290;

    public static final int COVERED_OR_UNCOVERED = 203;

    public static final int QUOTE_TYPE = 537;

    public static final int UNDERLYING_LEG_SECURITY_ID = 1332;

    public static final int INSTRUMENT_PARTY_SUB_ID_TYPE = 1054;

    public static final int STRIKE_PRICE_BOUNDARY_PRECISION = 1480;

    public static final int HOP_REF_ID = 630;

    public static final int TRIGGER_PRICE_TYPE_SCOPE = 1108;

    public static final int DERIVATIVE_EXERCISE_STYLE = 1299;

    public static final int TRIGGER_SECURITY_ID_SOURCE = 1105;

    public static final int NO_SECURITY_ALT_ID = 454;

    public static final int UNDERLYING_MATURITY_MONTH_YEAR = 313;

    public static final int EFFECTIVE_TIME = 168;

    public static final int VOLATILITY = 1188;

    public static final int DERIVATIVE_C_F_I_CODE = 1248;

    public static final int UNDERLYING_MATURITY_DATE = 542;

    public static final int DERIVATIVE_EVENT_TIME = 1289;

    public static final int TRAD_SES_OPEN_TIME = 342;

    public static final int SECONDARY_DISPLAY_QTY = 1082;

    public static final int NO_OF_LEG_UNDERLYINGS = 1342;

    public static final int DERIVATIVE_OPT_PAY_AMOUNT = 1225;

    public static final int TRANSACT_TIME = 60;

    public static final int TRIGGER_NEW_PRICE = 1110;

    public static final int QUANTITY_DATE = 976;

    public static final int EXCHANGE_SPECIAL_INSTRUCTIONS = 1139;

    public static final int VALUATION_METHOD = 1197;

    public static final int CROSS_PERCENT = 413;

    public static final int TOT_NUM_REPORTS = 911;

    public static final int CONFIRM_STATUS = 665;

    public static final int PEG_ROUND_DIRECTION = 838;

    public static final int CALCULATED_CCY_LAST_QTY = 1056;

    public static final int NO_NESTED_PARTY_SUB_IDS = 804;

    public static final int UNDERLYING_ADJUSTED_QUANTITY = 1044;

    public static final int FIRM_TRADE_ID = 1041;

    public static final int MASS_ACTION_SCOPE = 1374;

    public static final int OFFER_FORWARD_POINTS = 191;

    public static final int EXCHANGE_RULE = 825;

    public static final int NESTED4_PARTY_ID = 1415;

    public static final int TERMINATION_TYPE = 788;

    public static final int NESTED3_PARTY_SUB_ID_TYPE = 954;

    public static final int ALLOC_CUSTOMER_CAPACITY = 993;

    public static final int RATE_SOURCE_TYPE = 1447;

    public static final int ENCRYPTED_NEW_PASSWORD_LEN = 1403;

    public static final int TRADE_REPORT_REF_ID = 572;

    public static final int CCY_AMT = 1157;

    public static final int NO_TRADING_SESSIONS = 386;

    public static final int NESTED3_PARTY_SUB_ID = 953;

    public static final int ALLOWABLE_ONE_SIDEDNESS_CURR = 767;

    public static final int C_P_REG_TYPE = 876;

    public static final int UNDERLYING_LEG_SECURITY_EXCHANGE = 1341;

    public static final int DEFAULT_VER_INDICATOR = 1410;

    public static final int LEG_OFFER_PX = 684;

    public static final int TRADE_VOLUME = 1020;

    public static final int REPORT_TO_EXCH = 113;

    public static final int NO_CONT_AMTS = 518;

    public static final int LEG_ALLOC_ACCOUNT = 671;

    public static final int DERIVATIVE_SECURITY_X_M_L = 1283;

    public static final int COLL_INQUIRY_RESULT = 946;

    public static final int NUM_DAYS_INTEREST = 157;

    public static final int SENDER_COMP_ID = 49;

    public static final int NESTED_INSTR_ATTRIB_TYPE = 1210;

    public static final int EMAIL_TYPE = 94;

    public static final int DEFAULT_APPL_EXT_ID = 1407;

    public static final int NESTED2_PARTY_ROLE = 759;

    public static final int M_D_ENTRY_FORWARD_POINTS = 1027;

    public static final int RND_PX = 991;

    public static final int PROG_RPT_REQS = 414;

    public static final int MAX_PRICE_LEVELS = 1090;

    public static final int EMAIL_THREAD_ID = 164;

    public static final int DERIVATIVE_STRIKE_MULTIPLIER = 1263;

    public static final int AFFECTED_SECONDARY_ORDER_ID = 536;

    public static final int TRADING_SESSION_ID = 336;

    public static final int SETTL_CURRENCY = 120;

    public static final int ASSIGNMENT_METHOD = 744;

    public static final int LEG_UNIT_OF_MEASURE = 999;

    public static final int UNDERLYING_SECURITY_DESC = 307;

    public static final int ORIGINAL_NOTIONAL_PERCENTAGE_OUTSTANDING = 1452;

    public static final int NO_CLEARING_INSTRUCTIONS = 576;

    public static final int POS_REQ_STATUS = 729;

    public static final int BID_DESCRIPTOR = 400;

    public static final int ENCODED_SECURITY_DESC = 351;

    public static final int ORDER_HANDLING_INST_SOURCE = 1032;

    public static final int CARD_EXP_DATE = 490;

    public static final int SETTL_INST_REF_ID = 214;

    public static final int M_D_MKT = 275;

    public static final int SETTL_INST_MODE = 160;

    public static final int ADJUSTMENT = 334;

    public static final int PAYMENT_DATE = 504;

    public static final int QUOTE_MSG_ID = 1166;

    public static final int SECURITY_ID_SOURCE = 22;

    public static final int SECONDARY_CL_ORD_ID = 526;

    public static final int CXL_REJ_RESPONSE_TO = 434;

    public static final int INTEREST_ACCRUAL_DATE = 874;

    public static final int PEG_SCOPE = 840;

    public static final int EVENT_TIME = 1145;

    public static final int VENUE_TYPE = 1430;

    public static final int ENCODED_UNDERLYING_ISSUER_LEN = 362;

    public static final int STATE_OR_PROVINCE_OF_ISSUE = 471;

    public static final int NESTED_PARTY_ID_SOURCE = 525;

    public static final int PEGGED_PRICE = 839;

    public static final int ORDER_RESTRICTIONS = 529;

    public static final int RESPONSE_DESTINATION = 726;

    public static final int INDIVIDUAL_ALLOC_TYPE = 992;

    public static final int EXCHANGE_FOR_PHYSICAL = 411;

    public static final int UNDERLYING_STATE_OR_PROVINCE_OF_ISSUE = 593;

    public static final int NO_ALT_M_D_SOURCE = 816;

    public static final int PRICE_IMPROVEMENT = 639;

    public static final int LEG_ORDER_QTY = 685;

    public static final int D_K_REASON = 127;

    public static final int SIDE_REASON_CD = 1007;

    public static final int SIDE_LIQUIDITY_IND = 1444;

    public static final int FLOW_SCHEDULE_TYPE = 1439;

    public static final int UNDERLYING_CREDIT_RATING = 256;

    public static final int DERIVATIVE_SECURITY_SUB_TYPE = 1250;

    public static final int DETACHMENT_POINT = 1458;

    public static final int FINANCIAL_STATUS = 291;

    public static final int TOTAL_AFFECTED_ORDERS = 533;

    public static final int THRESHOLD_AMOUNT = 834;

    public static final int NO_POS_AMT = 753;

    public static final int NO_ASGN_REQS = 1499;

    public static final int TOT_NO_RELATED_SYM = 393;

    public static final int ORIG_TRADE_ID = 1126;

    public static final int ORDER_INPUT_DEVICE = 821;

    public static final int U_R_L_LINK = 149;

    public static final int ALLOC_NO_ORDERS_TYPE = 857;

    public static final int TRADE_ALLOC_INDICATOR = 826;

    public static final int DISCRETION_LIMIT_TYPE = 843;

    public static final int NESTED2_PARTY_ID = 757;

    public static final int SECURITY_LIST_TYPE = 1470;

    public static final int ALLOC_TEXT = 161;

    public static final int QUOTE_SET_VALID_UNTIL_TIME = 367;

    public static final int NESTED2_PARTY_ID_SOURCE = 758;

    public static final int CXL_REJ_REASON = 102;

    public static final int QUOTE_QUALIFIER = 695;

    public static final int LIQUIDITY_NUM_SECURITIES = 441;

    public static final int TIME_BRACKET = 943;

    public static final int UNDERLYING_FLOW_SCHEDULE_TYPE = 1441;

    public static final int SECONDARY_FIRM_TRADE_ID = 1042;

    public static final int I_O_I_QLTY_IND = 25;

    public static final int ORDER_CATEGORY = 1115;

    public static final int DERIVATIVE_SECURITY_STATUS = 1256;

    public static final int TOT_NO_STRIKES = 422;

    public static final int LEG_STATE_OR_PROVINCE_OF_ISSUE = 597;

    public static final int REGIST_DTLS = 509;

    public static final int BID_TYPE = 394;

    public static final int DERIVATIVE_COUNTRY_OF_ISSUE = 1258;

    public static final int REGIST_ID = 513;

    public static final int POS_AMT_TYPE = 707;

    public static final int M_D_STREAM_ID = 1500;

    public static final int NETWORK_STATUS_RESPONSE_TYPE = 937;

    public static final int MKT_OFFER_PX = 646;

    public static final int LEG_TIME_UNIT = 1001;

    public static final int UNDERLYING_PAY_AMOUNT = 985;

    public static final int UNDERLYING_RESTRUCTURING_TYPE = 1453;

    public static final int LAST_UPDATE_TIME = 779;

    public static final int STAND_INST_DB_ID = 171;

    public static final int ENCODED_UNDERLYING_SECURITY_DESC = 365;

    public static final int CXL_QTY = 84;

    public static final int NO_ROOT_PARTY_IDS = 1116;

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

    public static final int APPL_ID = 1180;

    public static final int NEWS_ID = 1472;

    public static final int ENCODED_ISSUER_LEN = 348;

    public static final int PRICE = 44;

    public static final int ENCODED_ALLOC_TEXT = 361;

    public static final int NETWORK_REQUEST_ID = 933;

    public static final int CLEARING_FEE_INDICATOR = 635;

    public static final int LEG_CONTRACT_MULTIPLIER_UNIT = 1436;

    public static final int NO_OF_SEC_SIZES = 1177;

    public static final int TRAD_SES_PRE_CLOSE_TIME = 343;

    public static final int PEG_SECURITY_DESC = 1099;

    public static final int WT_AVERAGE_LIQUIDITY = 410;

    public static final int INVESTOR_COUNTRY_OF_RESIDENCE = 475;

    public static final int EXPIRE_TIME = 126;

    public static final int STATUS_VALUE = 928;

    public static final int DERIVATIVE_PRODUCT_COMPLEX = 1228;

    public static final int SETTL_OBLIG_TRANS_TYPE = 1162;

    public static final int APPL_REPORT_TYPE = 1426;

    public static final int EXEC_PRICE_ADJUSTMENT = 485;

    public static final int ORDER_QTY = 38;

    public static final int ISSUER = 106;

    public static final int SYMBOL = 55;

    public static final int TOT_NO_ORDERS = 68;

    public static final int QUOTE_STATUS = 297;

    public static final int SECURITY_REQUEST_TYPE = 321;

    public static final int DERIVATIVE_MATURITY_TIME = 1253;

    public static final int REF_CSTM_APPL_VER_ID = 1131;

    public static final int INSTR_REGISTRY = 543;

    public static final int TRIGGER_PRICE = 1102;

    public static final int DERIVATIVE_SYMBOL = 1214;

    public static final int NO_MATURITY_RULES = 1236;

    public static final int DERIVATIVE_UNIT_OF_MEASURE_QTY = 1270;

    public static final int INDIVIDUAL_ALLOC_ID = 467;

    public static final int TRANSFER_REASON = 830;

    public static final int QUOTE_CONDITION = 276;

    public static final int ORIG_TRADE_HANDLING_INSTR = 1124;

    public static final int SECURITY_STATUS = 965;

    public static final int M_D_ENTRY_TYPE = 269;

    public static final int REF_APPL_ID = 1355;

    public static final int NO_QUOTE_ENTRIES = 295;

    public static final int SETTL_OBLIG_MSG_ID = 1160;

    public static final int LEG_REDEMPTION_DATE = 254;

    public static final int LEG_C_F_I_CODE = 608;

    public static final int RAW_DATA_LENGTH = 95;

    public static final int NESTED3_PARTY_ID_SOURCE = 950;

    public static final int APPL_VER_ID = 1128;

    public static final int IN_VIEW_OF_COMMON = 328;

    public static final int UNDERLYING_FACTOR = 246;

    public static final int POSITION_LIMIT = 970;

    public static final int UNDERLYING_SYMBOL_SFX = 312;

    public static final int STREAM_ASGN_REQ_ID = 1497;

    public static final int GAP_FILL_FLAG = 123;

    public static final int NO_LEG_ALLOCS = 670;

    public static final int LEG_REPO_COLLATERAL_SECURITY_TYPE = 250;

    public static final int CARD_ISS_NUM = 491;

    public static final int ALLOWABLE_ONE_SIDEDNESS_VALUE = 766;

    public static final int COLL_ACTION = 944;

    public static final int SECONDARY_TRADE_ID = 1040;

    public static final int GROSS_TRADE_AMT = 381;

    public static final int UNDERLYING_SENIORITY = 1454;

    public static final int STRIKE_VALUE = 968;

    public static final int ACCT_ID_SOURCE = 660;

    public static final int HOP_SENDING_TIME = 629;

    public static final int CONTRARY_INSTRUCTION_INDICATOR = 719;

    public static final int PREALLOC_METHOD = 591;

    public static final int I_O_I_TRANS_TYPE = 28;

    public static final int CONFIRM_TYPE = 773;

    public static final int MULTI_LEG_RPT_TYPE_REQ = 563;

    public static final int QUOTE_ENTRY_REJECT_REASON = 368;

    public static final int ENCODED_SECURITY_LIST_DESC = 1469;

    public static final int INSTR_ATTRIB_TYPE = 871;

    public static final int REGIST_ACCT_TYPE = 493;

    public static final int BOOKING_REF_ID = 466;

    public static final int TRADE_REQUEST_RESULT = 749;

    public static final int TOT_NO_CXLD_QUOTES = 1168;

    public static final int DERIVATIVE_PRICE_UNIT_OF_MEASURE_QTY = 1316;

    public static final int COMPLEX_EVENT_PRICE_BOUNDARY_METHOD = 1487;

    public static final int ALLOC_ID = 70;

    public static final int UNDERLYING_ATTACHMENT_POINT = 1459;

    public static final int TIME_UNIT = 997;

    public static final int NO_TRD_REP_INDICATORS = 1387;

    public static final int OUTSIDE_INDEX_PCT = 407;

    public static final int UNDERLYING_PRODUCT = 462;

    public static final int TRIGGER_TYPE = 1100;

    public static final int PAYMENT_REMITTER_ID = 505;

    public static final int SETTL_OBLIG_MODE = 1159;

    public static final int POS_QTY_STATUS = 706;

    public static final int MIN_PRICE_INCREMENT_AMOUNT = 1146;

    public static final int SENIORITY = 1450;

    public static final int BID_FORWARD_POINTS = 189;

    public static final int COMPLEX_EVENT_PRICE_TIME_TYPE = 1489;

    public static final int REPURCHASE_TERM = 226;

    public static final int ALLOC_POSITION_EFFECT = 1047;

    public static final int UNDERLYING_SECURITY_EXCHANGE = 308;

    public static final int LIST_STATUS_TYPE = 429;

    public static final int UNDERLYING_LAST_QTY = 652;

    public static final int PRICE_LIMIT_TYPE = 1306;

    public static final int MASS_CANCEL_RESPONSE = 531;

    public static final int I_O_I_QUALIFIER = 104;

    public static final int POS_MAINT_STATUS = 722;

    public static final int MATURITY_MONTH_YEAR_INCREMENT_UNITS = 1302;

    public static final int LEG_SWAP_TYPE = 690;

    public static final int NO_M_D_FEED_TYPES = 1141;

    public static final int POSS_RESEND = 97;

    public static final int USER_REQUEST_TYPE = 924;

    public static final int ENCODED_LIST_EXEC_INST = 353;

    public static final int LOT_TYPE = 1093;

    public static final int POS_REQ_RESULT = 728;

    public static final int LEG_LAST_FORWARD_POINTS = 1073;

    public static final int LIST_REJECT_REASON = 1386;

    public static final int LIST_ORDER_STATUS = 431;

    public static final int BID_SIZE = 134;

    public static final int SECURITY_REQ_ID = 320;

    public static final int CAP_PRICE = 1199;

    public static final int ENCRYPTED_NEW_PASSWORD = 1404;

    public static final int TICK_DIRECTION = 274;

    public static final int CONT_INT_RPT_ID = 977;

    public static final int REF_TAG_ID = 371;

    public static final int AGGREGATED_BOOK = 266;

    public static final int LOCALE_OF_ISSUE = 472;

    public static final int YIELD_CALC_DATE = 701;

    public static final int FILL_QTY = 1365;

    public static final int NO_DATES = 580;

    public static final int REFRESH_QTY = 1088;

    public static final int BENCHMARK_SECURITY_ID_SOURCE = 761;

    public static final int NO_ALLOCS = 78;

    public static final int NO_MATCH_RULES = 1235;

    public static final int PUT_OR_CALL = 201;

    public static final int ORDER_CAPACITY_QTY = 863;

    public static final int MANUAL_ORDER_INDICATOR = 1028;

    public static final int UNDERLYING_LEG_MATURITY_DATE = 1345;

    public static final int STRIKE_PRICE_BOUNDARY_METHOD = 1479;

    public static final int UNDERLYING_CONTRACT_MULTIPLIER_UNIT = 1437;

    public static final int DERIVATIVE_INSTRMT_ASSIGNMENT_METHOD = 1255;

    public static final int COMM_CURRENCY = 479;

    public static final int LEG_EXERCISE_STYLE = 1420;

    public static final int UNDERLYING_COUNTRY_OF_ISSUE = 592;

    public static final int ENCODED_HEADLINE = 359;

    public static final int CONT_AMT_CURR = 521;

    public static final int UNDERLYING_UNIT_OF_MEASURE_QTY = 1423;

    public static final int MATCH_TYPE = 574;

    public static final int SETTL_INST_REQ_ID = 791;

    public static final int PEG_LIMIT_TYPE = 837;

    public static final int INSTRMT_ASSIGNMENT_METHOD = 1049;

    public static final int CONFIRM_REJ_REASON = 774;

    public static final int MODEL_TYPE = 1434;

    public static final int LONG_QTY = 704;

    public static final int LEG_MATURITY_TIME = 1212;

    public static final int DAY_ORDER_QTY = 424;

    public static final int COMPLEX_EVENT_START_TIME = 1495;

    public static final int DERIVATIVE_TIME_UNIT = 1271;

    public static final int NESTED_PARTY_SUB_ID_TYPE = 805;

    public static final int NOT_AFF_ORIG_CL_ORD_ID = 1372;

    public static final int FUND_RENEW_WAIV = 497;

    public static final int BID_YIELD = 632;

    public static final int NO_CAPACITIES = 862;

    public static final int ROOT_PARTY_SUB_ID = 1121;

    public static final int DEFAULT_CSTM_APPL_VER_ID = 1408;

    public static final int TEST_MESSAGE_INDICATOR = 464;

    public static final int UNDERLYING_C_F_I_CODE = 463;

    public static final int NO_NESTED2_PARTY_IDS = 756;

    public static final int MISC_FEE_CURR = 138;

    public static final int ALLOC_METHOD = 1002;

    public static final int TIME_IN_FORCE = 59;

    public static final int CSTM_APPL_VER_ID = 1129;

    public static final int SECONDARY_TRD_TYPE = 855;

    public static final int SIDE_FILL_STATION_CD = 1006;

    public static final int SECONDARY_ALLOC_ID = 793;

    public static final int LAST_CAPACITY = 29;

    public static final int M_D_SEC_SIZE = 1179;

    public static final int TARGET_SUB_ID = 57;

    public static final int UNDERLYING_CURRENCY = 318;

    public static final int UNSOLICITED_INDICATOR = 325;

    public static final int SIDE_TIME_IN_FORCE = 962;

    public static final int M_D_REPORT_ID = 963;

    public static final int ALLOC_STATUS = 87;

    public static final int APPL_SEQ_NUM = 1181;

    public static final int MATURITY_RULE_ID = 1222;

    public static final int DISPLAY_MIN_INCR = 1087;

    public static final int STRIKE_INCREMENT = 1204;

    public static final int NO_MISC_FEES = 136;

    public static final int DERIVATIVE_PRODUCT = 1246;

    public static final int TRADING_REFERENCE_PRICE = 1150;

    public static final int CONTRA_TRADE_QTY = 437;

    public static final int REL_SYM_TRANSACT_TIME = 1504;

    public static final int LAST_SWAP_POINTS = 1071;

    public static final int M_D_UPDATE_TYPE = 265;

    public static final int BENCHMARK_PRICE = 662;

    public static final int MARGIN_EXCESS = 899;

    public static final int DERIVATIVE_LOCALE_OF_ISSUE = 1260;

    public static final int TARGET_LOCATION_ID = 143;

    public static final int EXEC_REF_ID = 19;

    public static final int HOP_COMP_ID = 628;

    public static final int LEG_SYMBOL_SFX = 601;

    public static final int ORIG_TIME = 42;

    public static final int BOOKING_UNIT = 590;

    public static final int TRD_REG_TIMESTAMP = 769;

    public static final int TRAD_SES_EVENT = 1368;

    public static final int SELL_VOLUME = 331;

    public static final int PARTY_ID_SOURCE = 447;

    public static final int FILL_LIQUIDITY_IND = 1443;

    public static final int APPL_QUEUE_RESOLUTION = 814;

    public static final int NO_M_D_ENTRY_TYPES = 267;

    public static final int SIDE_TRD_REG_TIMESTAMP_TYPE = 1013;

    public static final int RESTRUCTURING_TYPE = 1449;

    public static final int DERIVATIVE_CONTRACT_MULTIPLIER = 1266;

    public static final int STRIKE_MULTIPLIER = 967;

    public static final int NEW_PASSWORD = 925;

    public static final int ORD_REJ_REASON = 103;

    public static final int STRIKE_PRICE = 202;

    public static final int TRD_MATCH_ID = 880;

    public static final int AGREEMENT_DESC = 913;

    public static final int PRICE_UNIT_OF_MEASURE = 1191;

    public static final int DELIVER_TO_SUB_ID = 129;

    public static final int TRAD_SES_START_TIME = 341;

    public static final int SUBJECT = 147;

    public static final int TOT_NO_SECURITY_TYPES = 557;

    public static final int ADJUSTMENT_TYPE = 718;

    public static final int MATCH_INCREMENT = 1089;

    public static final int SETTL_PARTY_ID = 782;

    public static final int SECURITY_ALT_ID = 455;

    public static final int COMPLEX_OPT_PAYOUT_AMOUNT = 1485;

    public static final int DERIVATIVE_CAP_PRICE = 1321;

    public static final int NO_LEGS = 555;

    public static final int PEG_OFFSET_TYPE = 836;

    public static final int PCT_AT_RISK = 869;

    public static final int ACCOUNT = 1;

    public static final int SETTL_SESS_SUB_ID = 717;

    public static final int UNDERLYING_SECURITY_ID_SOURCE = 305;

    public static final int SETTL_CURR_FX_RATE = 155;

    public static final int LEG_ALLOC_QTY = 673;

    public static final int TRADE_REPORT_TYPE = 856;

    public static final int M_D_PRICE_LEVEL = 1023;

    public static final int SETTL_INST_TRANS_TYPE = 163;

    public static final int LEG_RATIO_QTY = 623;

    public static final int ALLOC_ACCOUNT_TYPE = 798;

    public static final int M_D_UPDATE_ACTION = 279;

    public static final int ON_BEHALF_OF_COMP_ID = 115;

    public static final int TRIGGER_PRICE_TYPE = 1107;

    public static final int EVENT_PX = 867;

    public static final int DAY_AVG_PX = 426;

    public static final int UNDERLYING_LEG_SECURITY_TYPE = 1337;

    public static final int BASIS_FEATURE_DATE = 259;

    public static final int COMPLEX_EVENT_PRICE_BOUNDARY_PRECISION = 1488;

    public static final int STREAM_ASGN_TYPE = 1617;

    public static final int UNDERLYING_DETACHMENT_POINT = 1460;

    public static final int NO_SETTL_OBLIG = 1165;

    public static final int LEG_DIVIDEND_YIELD = 1381;

    public static final int BEGIN_SEQ_NO = 7;

    public static final int POS_REQ_TYPE = 724;

    public static final int MASS_CANCEL_REQUEST_TYPE = 530;

    public static final int SOLICITED_FLAG = 377;

    public static final int MASS_ACTION_REJECT_REASON = 1376;

    public static final int M_D_REQ_ID = 262;

    public static final int COLL_ASGN_TRANS_TYPE = 903;

    public static final int SETTL_OBLIG_ID = 1161;

    public static final int CASH_DISTRIB_PAY_REF = 501;

    public static final int STREAM_ASGN_REQ_TYPE = 1498;

    public static final int SIDE_COMPLIANCE_ID = 659;

    public static final int TRD_REG_TIMESTAMP_ORIGIN = 771;

    public static final int SECURITY_RESPONSE_TYPE = 323;

    public static final int ENCODED_LIST_STATUS_TEXT = 446;

    public static final int DEFAULT_APPL_VER_ID = 1137;

    public static final int OFFER_SPOT_RATE = 190;

    public static final int COLL_STATUS = 910;

    public static final int STIPULATION_TYPE = 233;

    public static final int TRAD_SES_CLOSE_TIME = 344;

    public static final int ALLOC_REJ_CODE = 88;

    public static final int M_D_ENTRY_SELLER = 289;

    public static final int TRD_REP_PARTY_ROLE = 1388;

    public static final int ADV_SIDE = 4;

    public static final int LEG_BENCHMARK_CURVE_NAME = 677;

    public static final int CHECK_SUM = 10;

    public static final int LEG_BENCHMARK_PRICE = 679;

    public static final int REDEMPTION_DATE = 240;

    public static final int LEG_CURRENCY_RATIO = 1383;

    public static final int NO_SIDE_TRD_REG_T_S = 1016;

    public static final int QUOTE_RESP_TYPE = 694;

    public static final int LEG_BENCHMARK_CURVE_POINT = 678;

    public static final int NO_EXPIRATION = 981;

    public static final int SECURITY_TYPE = 167;

    public static final int UNDERLYING_EXERCISE_STYLE = 1419;

    public static final int EXERCISE_METHOD = 747;

    public static final int POS_REQ_ID = 710;

    public static final int NO_STRIKE_RULES = 1201;

    public static final int STAND_INST_DB_TYPE = 169;

    public static final int ALLOC_LINK_ID = 196;

    public static final int MIN_OFFER_SIZE = 648;

    public static final int MATCH_ALGORITHM = 1142;

    public static final int LEG_COUNTRY_OF_ISSUE = 596;

    public static final int SETTL_INST_MSG_ID = 777;

    public static final int NO_UNDERLYING_SECURITY_ALT_ID = 457;

    public static final int CONT_AMT_TYPE = 519;

    public static final int REFERENCE_PAGE = 1448;

    public static final int LEG_INDIVIDUAL_ALLOC_ID = 672;

    public static final int COLL_RPT_ID = 908;

    public static final int DERIVATIVE_SECURITY_ID = 1216;

    public static final int EX_DATE = 230;

    public static final int TRADE_DATE = 75;

    public static final int PEG_PRICE_TYPE = 1094;

    public static final int RPT_SYS = 1135;

    public static final int NO_MARKET_SEGMENTS = 1310;

    public static final int INDIVIDUAL_ALLOC_REJ_CODE = 776;

    public static final int REF_APPL_REQ_ID = 1433;

    public static final int ORD_STATUS_REQ_ID = 790;

    public static final int DERIVATIVE_SECURITY_ID_SOURCE = 1217;

    public static final int ROUTING_TYPE = 216;

    public static final int APPL_QUEUE_ACTION = 815;

    public static final int ENCODED_SUBJECT_LEN = 356;

    public static final int DERIVATIVE_STRIKE_CURRENCY = 1262;

    public static final int TRD_RPT_STATUS = 939;

    public static final int BENCHMARK_PRICE_TYPE = 663;

    public static final int BID_SWAP_POINTS = 1065;

    public static final int DISPLAY_WHEN = 1083;

    public static final int COMPLEX_EVENT_END_TIME = 1496;

    public static final int PRIORITY_INDICATOR = 638;

    public static final int AGGRESSOR_INDICATOR = 1057;

    public static final int ENCODED_LIST_EXEC_INST_LEN = 352;

    public static final int SECURITY_LIST_REQUEST_TYPE = 559;

    public static final int ALLOC_TYPE = 626;

    public static final int NO_STRIKES = 428;

    public static final int NO_NESTED4_PARTY_IDS = 1414;

    public static final int COMM_TYPE = 13;

    public static final int QTY_TYPE = 854;

    public static final int EXEC_RESTATEMENT_REASON = 378;

    public static final int LEG_BENCHMARK_CURVE_CURRENCY = 676;

    public static final int SIGNATURE_LENGTH = 93;

    public static final int NO_COMP_IDS = 936;

    public static final int APPL_REPORT_ID = 1356;

    public static final int CONTRACT_MULTIPLIER = 231;

    public static final int XML_DATA = 213;

    public static final int PEGGED_REF_PRICE = 1095;

    public static final int SETTL_PRICE_TYPE = 731;

    public static final int MULTI_LEG_REPORTING_TYPE = 442;

    public static final int RATE_SOURCE = 1446;

    public static final int SECONDARY_PRICE_LIMIT_TYPE = 1305;

    public static final int LAST_FORWARD_POINTS = 195;

    public static final int CARD_NUMBER = 489;

    public static final int SECONDARY_TRADE_REPORT_REF_ID = 881;

    public static final int SECONDARY_INDIVIDUAL_ALLOC_ID = 989;

    public static final int DERIVATIVE_STRIKE_PRICE = 1261;

    public static final int ORDER_DELAY_UNIT = 1429;

    public static final int TRADE_REQUEST_ID = 568;

    public static final int ORDER_ID = 37;

    public static final int NO_NESTED3_PARTY_SUB_IDS = 952;

    public static final int START_DATE = 916;

    public static final int LEG_REPORT_ID = 990;

    public static final int LEG_ALLOC_SETTL_CURRENCY = 1367;

    public static final int END_ACCRUED_INTEREST_AMT = 920;

    public static final int ORD_STATUS = 39;

    public static final int NO_ORDERS = 73;

    public static final int EVENT_TEXT = 868;

    public static final int PREV_CLOSE_PX = 140;

    public static final int APPL_END_SEQ_NUM = 1183;

    public static final int UNDERLYING_PRICE_UNIT_OF_MEASURE_QTY = 1425;

    public static final int LAST_FORWARD_POINTS2 = 641;

    public static final int NO_SETTL_DETAILS = 1158;

    public static final int SECURITY_LIST_ID = 1465;

    public static final int BENCHMARK_CURVE_CURRENCY = 220;

    public static final int REPURCHASE_RATE = 227;

    public static final int COMPLIANCE_ID = 376;

    public static final int LEG_PRICE_UNIT_OF_MEASURE_QTY = 1422;

    public static final int UNDERLYING_UNIT_OF_MEASURE = 998;

    public static final int DERIVATIVE_STATE_OR_PROVINCE_OF_ISSUE = 1259;

    public static final int ROUNDING_MODULUS = 469;

    public static final int CASH_OUTSTANDING = 901;

    public static final int PROCESS_CODE = 81;

    public static final int YIELD_TYPE = 235;

    public static final int BID_FORWARD_POINTS2 = 642;

    public static final int TRD_REG_TIMESTAMP_TYPE = 770;

    public static final int ORDER_AVG_PX = 799;

    public static final int SETTLEMENT_CYCLE_NO = 1153;

    public static final int DERIVATIVE_PRICE_UNIT_OF_MEASURE = 1315;

    public static final int ORIG_CROSS_ID = 551;

    public static final int MESSAGE_EVENT_SOURCE = 1011;

    public static final int M_D_ENTRY_ID = 278;

    public static final int DERIVATIVE_N_T_POSITION_LIMIT = 1274;

    public static final int QUOTE_REQ_ID = 131;

    public static final int NESTED_PARTY_ROLE = 538;

    public static final int APPL_LAST_SEQ_NUM = 1350;

    public static final int DISCRETION_SCOPE = 846;

    public static final int SECURITY_REPORT_ID = 964;

    public static final int UNDERLYING_SECURITY_ID = 309;

    public static final int OWNERSHIP_TYPE = 517;

    public static final int UNDERLYING_OPT_ATTRIBUTE = 317;

    public static final int UNDERLYING_LEG_STRIKE_PRICE = 1340;

    public static final int OUT_MAIN_CNTRY_U_INDEX = 412;

    public static final int LAST_FRAGMENT = 893;

    public static final int NO_EXEC_INST_RULES = 1232;

    public static final int M_D_ORIGIN_TYPE = 1024;

    public static final int NO_TICK_RULES = 1205;

    public static final int SIDE_SETTL_CURRENCY = 1155;

    public static final int SETTL_PARTY_ROLE = 784;

    public static final int EXPIRATION_QTY_TYPE = 982;

    public static final int INSTRUMENT_PARTY_ID_SOURCE = 1050;

    public static final int ENCODED_UNDERLYING_SECURITY_DESC_LEN = 364;

    public static final int LEG_BID_PX = 681;

    public static final int M_D_SUB_BOOK_TYPE = 1173;

    public static final int MSG_DIRECTION = 385;

    public static final int M_D_ENTRY_SPOT_RATE = 1026;

    public static final int DERIVATIVE_STRIKE_VALUE = 1264;

    public static final int REGIST_EMAIL = 511;

    public static final int YIELD_REDEMPTION_PRICE = 697;

    public static final int APPL_EXT_ID = 1156;

    public static final int NO_TARGET_PARTY_IDS = 1461;

    public static final int COMPLEX_EVENT_CONDITION = 1490;

    public static final int ALLOC_CANC_REPLACE_REASON = 796;

    public static final int APPL_RESPONSE_ERROR = 1354;

    public static final int SECURITY_DESC = 107;

    public static final int M_D_BOOK_TYPE = 1021;

    public static final int SIDE_GROSS_TRADE_AMT = 1072;

    public static final int NO_SETTL_PARTY_SUB_IDS = 801;

    public static final int LAST_PAR_PX = 669;

    public static final int TRIGGER_SECURITY_DESC = 1106;

    public static final int REF_MSG_TYPE = 372;

    public static final int QUANTITY = 53;

    public static final int MAX_SHOW = 210;

    public static final int DATED_DATE = 873;

    public static final int SESSION_REJECT_REASON = 373;

    public static final int MATURITY_DATE = 541;

    public static final int PRE_TRADE_ANONYMITY = 1091;

    public static final int MISC_FEE_TYPE = 139;

    public static final int SIGNATURE = 89;

    public static final int UNDERLYING_LEG_SECURITY_ALT_ID = 1335;

    public static final int UNDERLYING_SECURITY_SUB_TYPE = 763;

    public static final IntHashSet ALL_FIELDS = new IntHashSet(2904);
    static
    {
        ALL_FIELDS.add(Constants.LIST_STATUS_TEXT);
        ALL_FIELDS.add(Constants.CUST_DIRECTED_ORDER);
        ALL_FIELDS.add(Constants.EVENT_DATE);
        ALL_FIELDS.add(Constants.AGREEMENT_ID);
        ALL_FIELDS.add(Constants.STRATEGY_PARAMETER_TYPE);
        ALL_FIELDS.add(Constants.STRIKE_RULE_ID);
        ALL_FIELDS.add(Constants.MAILING_INST);
        ALL_FIELDS.add(Constants.ALLOC_CLEARING_FEE_INDICATOR);
        ALL_FIELDS.add(Constants.UNDERLYING_LAST_PX);
        ALL_FIELDS.add(Constants.M_D_IMPLICIT_DELETE);
        ALL_FIELDS.add(Constants.SETTL_OBLIG_SOURCE);
        ALL_FIELDS.add(Constants.BID_PX);
        ALL_FIELDS.add(Constants.NOTIFY_BROKER_OF_CREDIT);
        ALL_FIELDS.add(Constants.REF_SEQ_NUM);
        ALL_FIELDS.add(Constants.M_D_ENTRY_BUYER);
        ALL_FIELDS.add(Constants.INSTRUMENT_PARTY_ROLE);
        ALL_FIELDS.add(Constants.SETTL_INST_SOURCE);
        ALL_FIELDS.add(Constants.TRANS_BKD_TIME);
        ALL_FIELDS.add(Constants.NO_APPL_IDS);
        ALL_FIELDS.add(Constants.CONFIRM_REF_ID);
        ALL_FIELDS.add(Constants.UNDERLYING_QTY);
        ALL_FIELDS.add(Constants.FIRST_PX);
        ALL_FIELDS.add(Constants.MATURITY_MONTH_YEAR_INCREMENT);
        ALL_FIELDS.add(Constants.COLL_REQ_ID);
        ALL_FIELDS.add(Constants.CROSS_ID);
        ALL_FIELDS.add(Constants.CUST_ORDER_CAPACITY);
        ALL_FIELDS.add(Constants.LEG_SECURITY_ALT_ID_SOURCE);
        ALL_FIELDS.add(Constants.NOT_AFFECTED_ORDER_ID);
        ALL_FIELDS.add(Constants.STREAM_ASGN_RPT_ID);
        ALL_FIELDS.add(Constants.NO_SETTL_PARTY_IDS);
        ALL_FIELDS.add(Constants.NETWORK_REQUEST_TYPE);
        ALL_FIELDS.add(Constants.LEG_SETTL_DATE);
        ALL_FIELDS.add(Constants.TRAD_SES_MODE);
        ALL_FIELDS.add(Constants.AVG_PX_PRECISION);
        ALL_FIELDS.add(Constants.CASH_DISTRIB_AGENT_NAME);
        ALL_FIELDS.add(Constants.UNDERLYING_SECURITY_ALT_ID_SOURCE);
        ALL_FIELDS.add(Constants.MATURITY_MONTH_YEAR_FORMAT);
        ALL_FIELDS.add(Constants.CORPORATE_ACTION);
        ALL_FIELDS.add(Constants.CONFIRM_ID);
        ALL_FIELDS.add(Constants.OPEN_CLOSE_SETTL_FLAG);
        ALL_FIELDS.add(Constants.TARGET_STRATEGY_PERFORMANCE);
        ALL_FIELDS.add(Constants.DUE_TO_RELATED);
        ALL_FIELDS.add(Constants.PEG_SECURITY_ID);
        ALL_FIELDS.add(Constants.M_D_ENTRY_PX);
        ALL_FIELDS.add(Constants.UNDERLYING_COLLECT_AMOUNT);
        ALL_FIELDS.add(Constants.LEG_SECURITY_ID);
        ALL_FIELDS.add(Constants.VALUE_OF_FUTURES);
        ALL_FIELDS.add(Constants.QUOTE_RESP_ID);
        ALL_FIELDS.add(Constants.BASIS_FEATURE_PRICE);
        ALL_FIELDS.add(Constants.BUY_VOLUME);
        ALL_FIELDS.add(Constants.SETTL_PARTY_SUB_ID);
        ALL_FIELDS.add(Constants.FOREX_REQ);
        ALL_FIELDS.add(Constants.POS_TYPE);
        ALL_FIELDS.add(Constants.N_T_POSITION_LIMIT);
        ALL_FIELDS.add(Constants.DERIVATIVE_SECURITY_DESC);
        ALL_FIELDS.add(Constants.DESK_ID);
        ALL_FIELDS.add(Constants.DISTRIB_PERCENTAGE);
        ALL_FIELDS.add(Constants.LOW_LIMIT_PRICE);
        ALL_FIELDS.add(Constants.UNDERLYING_MATURITY_TIME);
        ALL_FIELDS.add(Constants.NO_DERIVATIVE_EVENTS);
        ALL_FIELDS.add(Constants.TRAD_SES_STATUS);
        ALL_FIELDS.add(Constants.LIST_NAME);
        ALL_FIELDS.add(Constants.FAIR_VALUE);
        ALL_FIELDS.add(Constants.UNDERLYING_ALLOCATION_PERCENT);
        ALL_FIELDS.add(Constants.SIDE_TRADE_REPORT_ID);
        ALL_FIELDS.add(Constants.APPL_TOTAL_MESSAGE_COUNT);
        ALL_FIELDS.add(Constants.LOCATE_REQD);
        ALL_FIELDS.add(Constants.MESSAGE_ENCODING);
        ALL_FIELDS.add(Constants.NO_BID_DESCRIPTORS);
        ALL_FIELDS.add(Constants.START_TICK_PRICE_RANGE);
        ALL_FIELDS.add(Constants.EXEC_VALUATION_POINT);
        ALL_FIELDS.add(Constants.LEG_LOCALE_OF_ISSUE);
        ALL_FIELDS.add(Constants.ENCRYPTED_PASSWORD_METHOD);
        ALL_FIELDS.add(Constants.TRADE_LEG_REF_ID);
        ALL_FIELDS.add(Constants.APPL_REQ_TYPE);
        ALL_FIELDS.add(Constants.ORIG_POS_REQ_REF_ID);
        ALL_FIELDS.add(Constants.CROSS_PRIORITIZATION);
        ALL_FIELDS.add(Constants.NO_M_D_ENTRIES);
        ALL_FIELDS.add(Constants.UNDERLYING_ISSUER);
        ALL_FIELDS.add(Constants.ALLOC_QTY);
        ALL_FIELDS.add(Constants.SYMBOL_SFX);
        ALL_FIELDS.add(Constants.ORIG_SECONDARY_TRADE_ID);
        ALL_FIELDS.add(Constants.EXPIRE_DATE);
        ALL_FIELDS.add(Constants.NO_LEG_SECURITY_ALT_ID);
        ALL_FIELDS.add(Constants.NO_EVENTS);
        ALL_FIELDS.add(Constants.ALLOC_ACCT_ID_SOURCE);
        ALL_FIELDS.add(Constants.LEG_OPTION_RATIO);
        ALL_FIELDS.add(Constants.DERIVATIVE_SECURITY_TYPE);
        ALL_FIELDS.add(Constants.XML_DATA_LEN);
        ALL_FIELDS.add(Constants.C_F_I_CODE);
        ALL_FIELDS.add(Constants.COLL_INQUIRY_STATUS);
        ALL_FIELDS.add(Constants.HIGH_LIMIT_PRICE);
        ALL_FIELDS.add(Constants.SETTL_OBLIG_REF_ID);
        ALL_FIELDS.add(Constants.LEG_SETTL_TYPE);
        ALL_FIELDS.add(Constants.NO_PARTY_SUB_IDS);
        ALL_FIELDS.add(Constants.START_MATURITY_MONTH_YEAR);
        ALL_FIELDS.add(Constants.REGIST_REJ_REASON_TEXT);
        ALL_FIELDS.add(Constants.ENCODED_TEXT_LEN);
        ALL_FIELDS.add(Constants.LIST_EXEC_INST_TYPE);
        ALL_FIELDS.add(Constants.DERIVATIVE_INSTR_ATTRIB_TYPE);
        ALL_FIELDS.add(Constants.LANGUAGE_CODE);
        ALL_FIELDS.add(Constants.MARKET_REQ_ID);
        ALL_FIELDS.add(Constants.DEF_BID_SIZE);
        ALL_FIELDS.add(Constants.INTEREST_AT_MATURITY);
        ALL_FIELDS.add(Constants.HEADLINE);
        ALL_FIELDS.add(Constants.LEG_PRICE_TYPE);
        ALL_FIELDS.add(Constants.LEG_CALCULATED_CCY_LAST_QTY);
        ALL_FIELDS.add(Constants.TRIGGER_NEW_QTY);
        ALL_FIELDS.add(Constants.MATCH_STATUS);
        ALL_FIELDS.add(Constants.MAX_PRICE_VARIATION);
        ALL_FIELDS.add(Constants.DERIVATIVE_SECURITY_X_M_L_LEN);
        ALL_FIELDS.add(Constants.BOOKING_TYPE);
        ALL_FIELDS.add(Constants.NO_QUOTE_SETS);
        ALL_FIELDS.add(Constants.TRIGGER_PRICE_DIRECTION);
        ALL_FIELDS.add(Constants.PARTY_ROLE);
        ALL_FIELDS.add(Constants.DERIVATIVE_OPT_ATTRIBUTE);
        ALL_FIELDS.add(Constants.DERIVATIVE_SETTL_METHOD);
        ALL_FIELDS.add(Constants.SENDER_SUB_ID);
        ALL_FIELDS.add(Constants.UNIT_OF_MEASURE);
        ALL_FIELDS.add(Constants.CASH_ORDER_QTY);
        ALL_FIELDS.add(Constants.M_D_QUOTE_TYPE);
        ALL_FIELDS.add(Constants.SIDE_VALUE_IND);
        ALL_FIELDS.add(Constants.STRATEGY_PARAMETER_VALUE);
        ALL_FIELDS.add(Constants.DERIVATIVE_CONTRACT_SETTL_MONTH);
        ALL_FIELDS.add(Constants.M_D_SEC_SIZE_TYPE);
        ALL_FIELDS.add(Constants.UNDERLYING_F_X_RATE);
        ALL_FIELDS.add(Constants.LEG_SECURITY_DESC);
        ALL_FIELDS.add(Constants.YIELD_REDEMPTION_DATE);
        ALL_FIELDS.add(Constants.DERIVATIVE_INSTRUMENT_PARTY_ROLE);
        ALL_FIELDS.add(Constants.UNDERLYING_INSTR_REGISTRY);
        ALL_FIELDS.add(Constants.NO_MSG_TYPES);
        ALL_FIELDS.add(Constants.UNDERLYING_STIP_VALUE);
        ALL_FIELDS.add(Constants.PRICE_TYPE);
        ALL_FIELDS.add(Constants.LEGAL_CONFIRM);
        ALL_FIELDS.add(Constants.TOTAL_NET_VALUE);
        ALL_FIELDS.add(Constants.UNDERLYING_SETTLEMENT_DATE);
        ALL_FIELDS.add(Constants.TRAD_SES_REQ_ID);
        ALL_FIELDS.add(Constants.LEG_POSITION_EFFECT);
        ALL_FIELDS.add(Constants.NO_SIDES);
        ALL_FIELDS.add(Constants.ASGN_RPT_ID);
        ALL_FIELDS.add(Constants.NO_ROUTING_IDS);
        ALL_FIELDS.add(Constants.ROUND_LOT);
        ALL_FIELDS.add(Constants.UNDERLYING_LEG_MATURITY_MONTH_YEAR);
        ALL_FIELDS.add(Constants.ALLOC_PRICE);
        ALL_FIELDS.add(Constants.SECURITY_ID);
        ALL_FIELDS.add(Constants.TRADE_LINK_ID);
        ALL_FIELDS.add(Constants.AFFIRM_STATUS);
        ALL_FIELDS.add(Constants.LAST_LIQUIDITY_IND);
        ALL_FIELDS.add(Constants.MASS_ACTION_TYPE);
        ALL_FIELDS.add(Constants.LEG_FLOW_SCHEDULE_TYPE);
        ALL_FIELDS.add(Constants.SETTL_CURR_AMT);
        ALL_FIELDS.add(Constants.ALLOC_REPORT_ID);
        ALL_FIELDS.add(Constants.PRICE_PROTECTION_SCOPE);
        ALL_FIELDS.add(Constants.RPT_SEQ);
        ALL_FIELDS.add(Constants.TRADING_CURRENCY);
        ALL_FIELDS.add(Constants.MARKET_ID);
        ALL_FIELDS.add(Constants.NO_RELATED_SYM);
        ALL_FIELDS.add(Constants.BUSINESS_REJECT_REASON);
        ALL_FIELDS.add(Constants.DISCRETION_MOVE_TYPE);
        ALL_FIELDS.add(Constants.FLEX_PRODUCT_ELIGIBILITY_INDICATOR);
        ALL_FIELDS.add(Constants.SECONDARY_ORDER_ID);
        ALL_FIELDS.add(Constants.NO_TRADES);
        ALL_FIELDS.add(Constants.DERIVATIVE_ENCODED_SECURITY_DESC_LEN);
        ALL_FIELDS.add(Constants.OPT_PAYOUT_TYPE);
        ALL_FIELDS.add(Constants.NO_STIPULATIONS);
        ALL_FIELDS.add(Constants.QUOTE_STATUS_REQ_ID);
        ALL_FIELDS.add(Constants.USERNAME);
        ALL_FIELDS.add(Constants.ROOT_PARTY_ROLE);
        ALL_FIELDS.add(Constants.ALLOWABLE_ONE_SIDEDNESS_PCT);
        ALL_FIELDS.add(Constants.TEST_REQ_ID);
        ALL_FIELDS.add(Constants.LAST_MSG_SEQ_NUM_PROCESSED);
        ALL_FIELDS.add(Constants.CLEARING_INSTRUCTION);
        ALL_FIELDS.add(Constants.TOT_NO_QUOTE_ENTRIES);
        ALL_FIELDS.add(Constants.BID_TRADE_TYPE);
        ALL_FIELDS.add(Constants.MAILING_DTLS);
        ALL_FIELDS.add(Constants.SECURITY_X_M_L_LEN);
        ALL_FIELDS.add(Constants.DERIVATIVE_PUT_OR_CALL);
        ALL_FIELDS.add(Constants.EXEC_ID);
        ALL_FIELDS.add(Constants.ENCODED_TEXT);
        ALL_FIELDS.add(Constants.SETTL_INST_REQ_REJ_CODE);
        ALL_FIELDS.add(Constants.NO_STRATEGY_PARAMETERS);
        ALL_FIELDS.add(Constants.LOCATION_ID);
        ALL_FIELDS.add(Constants.UNDERLYING_PUT_OR_CALL);
        ALL_FIELDS.add(Constants.END_STRIKE_PX_RANGE);
        ALL_FIELDS.add(Constants.DERIVATIVE_MATURITY_MONTH_YEAR);
        ALL_FIELDS.add(Constants.WORKING_INDICATOR);
        ALL_FIELDS.add(Constants.MIN_BID_SIZE);
        ALL_FIELDS.add(Constants.DISPLAY_HIGH_QTY);
        ALL_FIELDS.add(Constants.DERIVATIVE_INSTR_ATTRIB_VALUE);
        ALL_FIELDS.add(Constants.SESSION_STATUS);
        ALL_FIELDS.add(Constants.POSITION_EFFECT);
        ALL_FIELDS.add(Constants.NO_UNDLY_INSTRUMENT_PARTIES);
        ALL_FIELDS.add(Constants.REF_APPL_VER_ID);
        ALL_FIELDS.add(Constants.UNDERLYING_LEG_SYMBOL);
        ALL_FIELDS.add(Constants.TRADE_HANDLING_INSTR);
        ALL_FIELDS.add(Constants.MARKET_SEGMENT_ID);
        ALL_FIELDS.add(Constants.COMPLEX_EVENT_PRICE);
        ALL_FIELDS.add(Constants.NEWS_REF_ID);
        ALL_FIELDS.add(Constants.LEG_FACTOR);
        ALL_FIELDS.add(Constants.DATE_OF_BIRTH);
        ALL_FIELDS.add(Constants.UNDERLYING_ORIGINAL_NOTIONAL_PERCENTAGE_OUTSTANDING);
        ALL_FIELDS.add(Constants.REF_ORD_ID_REASON);
        ALL_FIELDS.add(Constants.ENCODED_SUBJECT);
        ALL_FIELDS.add(Constants.MARKET_DEPTH);
        ALL_FIELDS.add(Constants.NO_POSITIONS);
        ALL_FIELDS.add(Constants.DERIVATIVE_ISSUER);
        ALL_FIELDS.add(Constants.DESK_TYPE_SOURCE);
        ALL_FIELDS.add(Constants.PRICE_QUOTE_METHOD);
        ALL_FIELDS.add(Constants.EXEC_ACK_STATUS);
        ALL_FIELDS.add(Constants.NO_AFFECTED_ORDERS);
        ALL_FIELDS.add(Constants.TRIGGER_ORDER_TYPE);
        ALL_FIELDS.add(Constants.SELLER_DAYS);
        ALL_FIELDS.add(Constants.CONTRA_LEG_REF_ID);
        ALL_FIELDS.add(Constants.NO_SETTL_INST);
        ALL_FIELDS.add(Constants.NO_ROOT_PARTY_SUB_IDS);
        ALL_FIELDS.add(Constants.MARKET_UPDATE_ACTION);
        ALL_FIELDS.add(Constants.UNDERLYING_STRIKE_CURRENCY);
        ALL_FIELDS.add(Constants.DERIVATIVE_ENCODED_ISSUER);
        ALL_FIELDS.add(Constants.MAX_MESSAGE_SIZE);
        ALL_FIELDS.add(Constants.SETTL_PRICE);
        ALL_FIELDS.add(Constants.UNDERLYING_SYMBOL);
        ALL_FIELDS.add(Constants.APPL_NEW_SEQ_NUM);
        ALL_FIELDS.add(Constants.SETTL_PARTY_SUB_ID_TYPE);
        ALL_FIELDS.add(Constants.NO_DISTRIB_INSTS);
        ALL_FIELDS.add(Constants.TRADE_REQUEST_STATUS);
        ALL_FIELDS.add(Constants.TIME_TO_EXPIRATION);
        ALL_FIELDS.add(Constants.LIST_EXEC_INST);
        ALL_FIELDS.add(Constants.NET_CHG_PREV_DAY);
        ALL_FIELDS.add(Constants.SETTL_DATE2);
        ALL_FIELDS.add(Constants.QUOTE_PRICE_TYPE);
        ALL_FIELDS.add(Constants.NO_NESTED_INSTR_ATTRIB);
        ALL_FIELDS.add(Constants.EX_DESTINATION_ID_SOURCE);
        ALL_FIELDS.add(Constants.NO_LOT_TYPE_RULES);
        ALL_FIELDS.add(Constants.I_O_I_REF_ID);
        ALL_FIELDS.add(Constants.SIDE);
        ALL_FIELDS.add(Constants.SECURITY_STATUS_REQ_ID);
        ALL_FIELDS.add(Constants.UNDERLYING_LEG_MATURITY_TIME);
        ALL_FIELDS.add(Constants.RESPONDENT_TYPE);
        ALL_FIELDS.add(Constants.SECURITY_LIST_REF_ID);
        ALL_FIELDS.add(Constants.UNDERLYING_ISSUE_DATE);
        ALL_FIELDS.add(Constants.SENDING_TIME);
        ALL_FIELDS.add(Constants.DISCRETION_OFFSET_TYPE);
        ALL_FIELDS.add(Constants.SECURE_DATA_LEN);
        ALL_FIELDS.add(Constants.ALLOC_INTEREST_AT_MATURITY);
        ALL_FIELDS.add(Constants.MIN_LOT_SIZE);
        ALL_FIELDS.add(Constants.NESTED4_PARTY_SUB_ID);
        ALL_FIELDS.add(Constants.REPORTED_PX_DIFF);
        ALL_FIELDS.add(Constants.LEG_REPURCHASE_TERM);
        ALL_FIELDS.add(Constants.DAY_CUM_QTY);
        ALL_FIELDS.add(Constants.COUPON_RATE);
        ALL_FIELDS.add(Constants.UNDERLYING_C_P_PROGRAM);
        ALL_FIELDS.add(Constants.ALLOC_REPORT_REF_ID);
        ALL_FIELDS.add(Constants.DERIVATIVE_POSITION_LIMIT);
        ALL_FIELDS.add(Constants.REF_SUB_ID);
        ALL_FIELDS.add(Constants.SIDE_TRD_REG_TIMESTAMP);
        ALL_FIELDS.add(Constants.QUOTE_REJECT_REASON);
        ALL_FIELDS.add(Constants.POS_MAINT_RESULT);
        ALL_FIELDS.add(Constants.UNDERLYING_TIME_UNIT);
        ALL_FIELDS.add(Constants.TOT_NO_ACC_QUOTES);
        ALL_FIELDS.add(Constants.TRADE_INPUT_SOURCE);
        ALL_FIELDS.add(Constants.TEXT);
        ALL_FIELDS.add(Constants.MSG_TYPE);
        ALL_FIELDS.add(Constants.BID_ID);
        ALL_FIELDS.add(Constants.START_STRIKE_PX_RANGE);
        ALL_FIELDS.add(Constants.DERIVATIVE_EVENT_TYPE);
        ALL_FIELDS.add(Constants.T_Z_TRANSACT_TIME);
        ALL_FIELDS.add(Constants.CUST_ORDER_HANDLING_INST);
        ALL_FIELDS.add(Constants.NO_COMPLEX_EVENTS);
        ALL_FIELDS.add(Constants.DERIVATIVE_INSTR_REGISTRY);
        ALL_FIELDS.add(Constants.REF_ORDER_ID);
        ALL_FIELDS.add(Constants.CONCESSION);
        ALL_FIELDS.add(Constants.CONFIRM_REQ_ID);
        ALL_FIELDS.add(Constants.ALLOC_AVG_PX);
        ALL_FIELDS.add(Constants.COLL_ASGN_RESP_TYPE);
        ALL_FIELDS.add(Constants.ENCODED_LEG_ISSUER);
        ALL_FIELDS.add(Constants.ALT_M_D_SOURCE_ID);
        ALL_FIELDS.add(Constants.UNDERLYING_SETTLEMENT_TYPE);
        ALL_FIELDS.add(Constants.DESK_TYPE);
        ALL_FIELDS.add(Constants.CASH_DISTRIB_CURR);
        ALL_FIELDS.add(Constants.TRADE_INPUT_DEVICE);
        ALL_FIELDS.add(Constants.NO_NESTED2_PARTY_SUB_IDS);
        ALL_FIELDS.add(Constants.DERIVATIVE_INSTRUMENT_PARTY_SUB_ID_TYPE);
        ALL_FIELDS.add(Constants.MATURITY_MONTH_YEAR);
        ALL_FIELDS.add(Constants.LEG_REF_ID);
        ALL_FIELDS.add(Constants.DERIVATIVE_FLOOR_PRICE);
        ALL_FIELDS.add(Constants.EVENT_TYPE);
        ALL_FIELDS.add(Constants.EXEC_PRICE_TYPE);
        ALL_FIELDS.add(Constants.SIDE_LAST_QTY);
        ALL_FIELDS.add(Constants.DISCRETION_INST);
        ALL_FIELDS.add(Constants.LEG_CREDIT_RATING);
        ALL_FIELDS.add(Constants.DISPLAY_LOW_QTY);
        ALL_FIELDS.add(Constants.PREVIOUSLY_REPORTED);
        ALL_FIELDS.add(Constants.SETTL_PARTY_ID_SOURCE);
        ALL_FIELDS.add(Constants.UNDERLYING_CASH_AMOUNT);
        ALL_FIELDS.add(Constants.SPREAD);
        ALL_FIELDS.add(Constants.LAST_RPT_REQUESTED);
        ALL_FIELDS.add(Constants.DERIVATIVE_VALUATION_METHOD);
        ALL_FIELDS.add(Constants.TARGET_PARTY_ROLE);
        ALL_FIELDS.add(Constants.NO_HOPS);
        ALL_FIELDS.add(Constants.LEG_COUPON_RATE);
        ALL_FIELDS.add(Constants.PARTY_ID);
        ALL_FIELDS.add(Constants.FACTOR);
        ALL_FIELDS.add(Constants.HALT_REASON);
        ALL_FIELDS.add(Constants.COMPLEX_EVENT_START_DATE);
        ALL_FIELDS.add(Constants.CL_ORD_LINK_ID);
        ALL_FIELDS.add(Constants.NO_DERIVATIVE_INSTRUMENT_PARTIES);
        ALL_FIELDS.add(Constants.CANCELLATION_RIGHTS);
        ALL_FIELDS.add(Constants.REJECT_TEXT);
        ALL_FIELDS.add(Constants.NESTED_PARTY_SUB_ID);
        ALL_FIELDS.add(Constants.COLL_RESP_ID);
        ALL_FIELDS.add(Constants.NETWORK_RESPONSE_ID);
        ALL_FIELDS.add(Constants.DERIVATIVE_SYMBOL_SFX);
        ALL_FIELDS.add(Constants.PARENT_MKT_SEGM_ID);
        ALL_FIELDS.add(Constants.M_D_ENTRY_TIME);
        ALL_FIELDS.add(Constants.LEG_SETTL_CURRENCY);
        ALL_FIELDS.add(Constants.UNDERLYING_LEG_SYMBOL_SFX);
        ALL_FIELDS.add(Constants.UNDERLYING_REPO_COLLATERAL_SECURITY_TYPE);
        ALL_FIELDS.add(Constants.LEG_DATED_DATE);
        ALL_FIELDS.add(Constants.UNDERLYING_PX);
        ALL_FIELDS.add(Constants.NO_SECURITY_TYPES);
        ALL_FIELDS.add(Constants.UNDERLYING_INSTRUMENT_PARTY_ROLE);
        ALL_FIELDS.add(Constants.ATTACHMENT_POINT);
        ALL_FIELDS.add(Constants.LIST_SEQ_NO);
        ALL_FIELDS.add(Constants.LEG_POOL);
        ALL_FIELDS.add(Constants.NO_DERIVATIVE_SECURITY_ALT_ID);
        ALL_FIELDS.add(Constants.NO_UNDLY_INSTRUMENT_PARTY_SUB_IDS);
        ALL_FIELDS.add(Constants.SECURITY_RESPONSE_ID);
        ALL_FIELDS.add(Constants.SECURITY_ALT_ID_SOURCE);
        ALL_FIELDS.add(Constants.ROOT_PARTY_SUB_ID_TYPE);
        ALL_FIELDS.add(Constants.NO_UNDERLYINGS);
        ALL_FIELDS.add(Constants.NO_QUOTE_QUALIFIERS);
        ALL_FIELDS.add(Constants.NO_UNDERLYING_STIPS);
        ALL_FIELDS.add(Constants.NO_TRD_REG_TIMESTAMPS);
        ALL_FIELDS.add(Constants.DERIVATIVE_ISSUE_DATE);
        ALL_FIELDS.add(Constants.AGREEMENT_DATE);
        ALL_FIELDS.add(Constants.MISC_FEE_BASIS);
        ALL_FIELDS.add(Constants.STATUS_TEXT);
        ALL_FIELDS.add(Constants.CONTINGENCY_TYPE);
        ALL_FIELDS.add(Constants.CROSS_TYPE);
        ALL_FIELDS.add(Constants.REGIST_REF_ID);
        ALL_FIELDS.add(Constants.LEG_GROSS_TRADE_AMT);
        ALL_FIELDS.add(Constants.LIQUIDITY_VALUE);
        ALL_FIELDS.add(Constants.SETTL_METHOD);
        ALL_FIELDS.add(Constants.LIQUIDITY_PCT_HIGH);
        ALL_FIELDS.add(Constants.ALLOC_SETTL_CURRENCY);
        ALL_FIELDS.add(Constants.LEG_REPURCHASE_RATE);
        ALL_FIELDS.add(Constants.QUOTE_ENTRY_ID);
        ALL_FIELDS.add(Constants.NO_NEWS_REF_IDS);
        ALL_FIELDS.add(Constants.NO_PARTY_IDS);
        ALL_FIELDS.add(Constants.NO_NOT_AFFECTED_ORDERS);
        ALL_FIELDS.add(Constants.SECURITY_SUB_TYPE);
        ALL_FIELDS.add(Constants.LEG_PUT_OR_CALL);
        ALL_FIELDS.add(Constants.TRADE_REPORT_TRANS_TYPE);
        ALL_FIELDS.add(Constants.DERIVATIVE_SETTLE_ON_OPEN_FLAG);
        ALL_FIELDS.add(Constants.NESTED3_PARTY_ID);
        ALL_FIELDS.add(Constants.FLEXIBLE_INDICATOR);
        ALL_FIELDS.add(Constants.DERIVATIVE_EVENT_DATE);
        ALL_FIELDS.add(Constants.UNDERLYING_PRICE_UNIT_OF_MEASURE);
        ALL_FIELDS.add(Constants.NO_RPTS);
        ALL_FIELDS.add(Constants.MARKET_SEGMENT_DESC);
        ALL_FIELDS.add(Constants.STREAM_ASGN_REJ_REASON);
        ALL_FIELDS.add(Constants.QUOTE_CANCEL_TYPE);
        ALL_FIELDS.add(Constants.END_CASH);
        ALL_FIELDS.add(Constants.PEG_SECURITY_ID_SOURCE);
        ALL_FIELDS.add(Constants.STRIKE_EXERCISE_STYLE);
        ALL_FIELDS.add(Constants.ACCOUNT_TYPE);
        ALL_FIELDS.add(Constants.CONTRA_BROKER);
        ALL_FIELDS.add(Constants.STOP_PX);
        ALL_FIELDS.add(Constants.LIST_ID);
        ALL_FIELDS.add(Constants.ROUTING_ID);
        ALL_FIELDS.add(Constants.LEG_PRICE);
        ALL_FIELDS.add(Constants.NO_REGIST_DTLS);
        ALL_FIELDS.add(Constants.LEG_INSTR_REGISTRY);
        ALL_FIELDS.add(Constants.LEG_SECURITY_TYPE);
        ALL_FIELDS.add(Constants.HEART_BT_INT);
        ALL_FIELDS.add(Constants.LEG_ALLOC_ACCT_ID_SOURCE);
        ALL_FIELDS.add(Constants.TOT_NO_FILLS);
        ALL_FIELDS.add(Constants.ROUNDING_DIRECTION);
        ALL_FIELDS.add(Constants.NO_LEG_STIPULATIONS);
        ALL_FIELDS.add(Constants.DELETE_REASON);
        ALL_FIELDS.add(Constants.UNDERLYING_LEG_PUT_OR_CALL);
        ALL_FIELDS.add(Constants.MISC_FEE_AMT);
        ALL_FIELDS.add(Constants.NUM_BIDDERS);
        ALL_FIELDS.add(Constants.CLEARING_BUSINESS_DATE);
        ALL_FIELDS.add(Constants.PRIOR_SPREAD_INDICATOR);
        ALL_FIELDS.add(Constants.LEG_PRODUCT);
        ALL_FIELDS.add(Constants.USER_STATUS);
        ALL_FIELDS.add(Constants.ENCODED_MKT_SEGM_DESC_LEN);
        ALL_FIELDS.add(Constants.TRAD_SES_UPDATE_ACTION);
        ALL_FIELDS.add(Constants.DERIVATIVE_ENCODED_ISSUER_LEN);
        ALL_FIELDS.add(Constants.CURRENCY);
        ALL_FIELDS.add(Constants.NO_DLVY_INST);
        ALL_FIELDS.add(Constants.PRICE_DELTA);
        ALL_FIELDS.add(Constants.EXEC_TYPE);
        ALL_FIELDS.add(Constants.DISTRIB_PAYMENT_METHOD);
        ALL_FIELDS.add(Constants.DERIVATIVE_MIN_PRICE_INCREMENT_AMOUNT);
        ALL_FIELDS.add(Constants.LAST_NETWORK_RESPONSE_ID);
        ALL_FIELDS.add(Constants.UNDERLYING_SETTLEMENT_STATUS);
        ALL_FIELDS.add(Constants.RAW_DATA);
        ALL_FIELDS.add(Constants.PEG_OFFSET_VALUE);
        ALL_FIELDS.add(Constants.TOTAL_TAKEDOWN);
        ALL_FIELDS.add(Constants.TOTAL_NUM_POS_REPORTS);
        ALL_FIELDS.add(Constants.UNDERLYING_LEG_SECURITY_ID_SOURCE);
        ALL_FIELDS.add(Constants.BID_DESCRIPTOR_TYPE);
        ALL_FIELDS.add(Constants.REVERSAL_INDICATOR);
        ALL_FIELDS.add(Constants.NO_COMPLEX_EVENT_DATES);
        ALL_FIELDS.add(Constants.ORDER_CAPACITY);
        ALL_FIELDS.add(Constants.ENCODED_SECURITY_LIST_DESC_LEN);
        ALL_FIELDS.add(Constants.LEG_COUPON_PAYMENT_DATE);
        ALL_FIELDS.add(Constants.FLOOR_PRICE);
        ALL_FIELDS.add(Constants.UNDERLYING_LEG_SECURITY_SUB_TYPE);
        ALL_FIELDS.add(Constants.NEXT_EXPECTED_MSG_SEQ_NUM);
        ALL_FIELDS.add(Constants.USER_REQUEST_ID);
        ALL_FIELDS.add(Constants.SECONDARY_LOW_LIMIT_PRICE);
        ALL_FIELDS.add(Constants.ON_BEHALF_OF_SUB_ID);
        ALL_FIELDS.add(Constants.ENCODED_ALLOC_TEXT_LEN);
        ALL_FIELDS.add(Constants.PAYMENT_REF);
        ALL_FIELDS.add(Constants.BENCHMARK_CURVE_POINT);
        ALL_FIELDS.add(Constants.SECONDARY_EXEC_ID);
        ALL_FIELDS.add(Constants.DERIVATIVE_SECURITY_ALT_ID_SOURCE);
        ALL_FIELDS.add(Constants.LEG_STRIKE_CURRENCY);
        ALL_FIELDS.add(Constants.RESET_SEQ_NUM_FLAG);
        ALL_FIELDS.add(Constants.STAND_INST_DB_NAME);
        ALL_FIELDS.add(Constants.COPY_MSG_INDICATOR);
        ALL_FIELDS.add(Constants.MID_PX);
        ALL_FIELDS.add(Constants.TAX_ADVANTAGE_TYPE);
        ALL_FIELDS.add(Constants.REFRESH_INDICATOR);
        ALL_FIELDS.add(Constants.TARGET_PARTY_ID);
        ALL_FIELDS.add(Constants.MIN_PRICE_INCREMENT);
        ALL_FIELDS.add(Constants.MIN_QTY);
        ALL_FIELDS.add(Constants.REGIST_STATUS);
        ALL_FIELDS.add(Constants.LEG_BENCHMARK_PRICE_TYPE);
        ALL_FIELDS.add(Constants.UNDERLYING_COUPON_PAYMENT_DATE);
        ALL_FIELDS.add(Constants.ROOT_PARTY_ID_SOURCE);
        ALL_FIELDS.add(Constants.COMPLEX_EVENT_END_DATE);
        ALL_FIELDS.add(Constants.UNDERLYING_CAP_VALUE);
        ALL_FIELDS.add(Constants.POS_MAINT_RPT_REF_ID);
        ALL_FIELDS.add(Constants.MULTILEG_PRICE_METHOD);
        ALL_FIELDS.add(Constants.LEG_NUMBER);
        ALL_FIELDS.add(Constants.TRADE_REQUEST_TYPE);
        ALL_FIELDS.add(Constants.NO_DERIVATIVE_INSTRUMENT_PARTY_SUB_IDS);
        ALL_FIELDS.add(Constants.PRIOR_SETTL_PRICE);
        ALL_FIELDS.add(Constants.LEG_OFFER_FORWARD_POINTS);
        ALL_FIELDS.add(Constants.LIST_UPDATE_ACTION);
        ALL_FIELDS.add(Constants.TRD_TYPE);
        ALL_FIELDS.add(Constants.IMPLIED_MARKET_INDICATOR);
        ALL_FIELDS.add(Constants.DESIGNATION);
        ALL_FIELDS.add(Constants.UNDERLYING_CURRENT_VALUE);
        ALL_FIELDS.add(Constants.MAX_TRADE_VOL);
        ALL_FIELDS.add(Constants.CUM_QTY);
        ALL_FIELDS.add(Constants.TRADE_REPORT_ID);
        ALL_FIELDS.add(Constants.UNDERLYING_START_VALUE);
        ALL_FIELDS.add(Constants.VALID_UNTIL_TIME);
        ALL_FIELDS.add(Constants.FILL_PX);
        ALL_FIELDS.add(Constants.UNDERLYING_LEG_SECURITY_ALT_ID_SOURCE);
        ALL_FIELDS.add(Constants.QUOTE_REQUEST_TYPE);
        ALL_FIELDS.add(Constants.DERIVATIVE_UNIT_OF_MEASURE);
        ALL_FIELDS.add(Constants.ISSUE_DATE);
        ALL_FIELDS.add(Constants.CASH_DISTRIB_AGENT_ACCT_NUMBER);
        ALL_FIELDS.add(Constants.PRIVATE_QUOTE);
        ALL_FIELDS.add(Constants.CASH_DISTRIB_AGENT_ACCT_NAME);
        ALL_FIELDS.add(Constants.STRIKE_TIME);
        ALL_FIELDS.add(Constants.NO_FILLS);
        ALL_FIELDS.add(Constants.SECURITY_REQUEST_RESULT);
        ALL_FIELDS.add(Constants.ALLOC_REPORT_TYPE);
        ALL_FIELDS.add(Constants.UNDERLYING_F_X_RATE_CALC);
        ALL_FIELDS.add(Constants.TRIGGER_TRADING_SESSION_SUB_ID);
        ALL_FIELDS.add(Constants.NO_COMPLEX_EVENT_TIMES);
        ALL_FIELDS.add(Constants.YIELD);
        ALL_FIELDS.add(Constants.BID_SPOT_RATE);
        ALL_FIELDS.add(Constants.NO_RATE_SOURCES);
        ALL_FIELDS.add(Constants.APPL_RESEND_FLAG);
        ALL_FIELDS.add(Constants.REGIST_TRANS_TYPE);
        ALL_FIELDS.add(Constants.LEG_QTY);
        ALL_FIELDS.add(Constants.COMMISSION);
        ALL_FIELDS.add(Constants.PARTY_SUB_ID);
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
        ALL_FIELDS.add(Constants.UNDERLYING_INSTRUMENT_PARTY_SUB_ID_TYPE);
        ALL_FIELDS.add(Constants.LEG_MATURITY_DATE);
        ALL_FIELDS.add(Constants.ON_BEHALF_OF_LOCATION_ID);
        ALL_FIELDS.add(Constants.LEG_STIPULATION_TYPE);
        ALL_FIELDS.add(Constants.MID_YIELD);
        ALL_FIELDS.add(Constants.ENCRYPT_METHOD);
        ALL_FIELDS.add(Constants.LEG_LAST_QTY);
        ALL_FIELDS.add(Constants.DERIVATIVE_MATURITY_DATE);
        ALL_FIELDS.add(Constants.QUOTE_ID);
        ALL_FIELDS.add(Constants.ORD_TYPE);
        ALL_FIELDS.add(Constants.CURRENCY_RATIO);
        ALL_FIELDS.add(Constants.REGIST_REJ_REASON_CODE);
        ALL_FIELDS.add(Constants.OFFER_YIELD);
        ALL_FIELDS.add(Constants.SIDE_MULTI_LEG_REPORTING_TYPE);
        ALL_FIELDS.add(Constants.NESTED2_PARTY_SUB_ID);
        ALL_FIELDS.add(Constants.AS_OF_INDICATOR);
        ALL_FIELDS.add(Constants.SECURITY_GROUP);
        ALL_FIELDS.add(Constants.NUMBER_OF_ORDERS);
        ALL_FIELDS.add(Constants.QUOTE_RESPONSE_LEVEL);
        ALL_FIELDS.add(Constants.PUBLISH_TRD_INDICATOR);
        ALL_FIELDS.add(Constants.ENCODED_SECURITY_DESC_LEN);
        ALL_FIELDS.add(Constants.QUOTE_REQUEST_REJECT_REASON);
        ALL_FIELDS.add(Constants.COMPLEX_EVENT_TYPE);
        ALL_FIELDS.add(Constants.TOT_NO_REJ_QUOTES);
        ALL_FIELDS.add(Constants.LIST_METHOD);
        ALL_FIELDS.add(Constants.STREAM_ASGN_ACK_TYPE);
        ALL_FIELDS.add(Constants.LEG_SECURITY_ALT_ID);
        ALL_FIELDS.add(Constants.TRADING_SESSION_DESC);
        ALL_FIELDS.add(Constants.NESTED2_PARTY_SUB_ID_TYPE);
        ALL_FIELDS.add(Constants.TRADE_ID);
        ALL_FIELDS.add(Constants.DERIVATIVE_EVENT_PX);
        ALL_FIELDS.add(Constants.UNDERLYING_INSTRUMENT_PARTY_ID);
        ALL_FIELDS.add(Constants.LEG_LAST_PX);
        ALL_FIELDS.add(Constants.ENCODED_ISSUER);
        ALL_FIELDS.add(Constants.BUSINESS_REJECT_REF_ID);
        ALL_FIELDS.add(Constants.ADV_ID);
        ALL_FIELDS.add(Constants.DISCRETION_PRICE);
        ALL_FIELDS.add(Constants.NO_NESTED_PARTY_IDS);
        ALL_FIELDS.add(Constants.DERIVATIVE_INSTRUMENT_PARTY_ID_SOURCE);
        ALL_FIELDS.add(Constants.MIN_TRADE_VOL);
        ALL_FIELDS.add(Constants.PRICE2);
        ALL_FIELDS.add(Constants.OPT_PAYOUT_AMOUNT);
        ALL_FIELDS.add(Constants.PROG_PERIOD_INTERVAL);
        ALL_FIELDS.add(Constants.SECURITY_EXCHANGE);
        ALL_FIELDS.add(Constants.CLIENT_BID_ID);
        ALL_FIELDS.add(Constants.SECURITY_LIST_DESC);
        ALL_FIELDS.add(Constants.NO_UNDERLYING_AMOUNTS);
        ALL_FIELDS.add(Constants.I_O_I_QTY);
        ALL_FIELDS.add(Constants.LEAVES_QTY);
        ALL_FIELDS.add(Constants.EXEC_INST_VALUE);
        ALL_FIELDS.add(Constants.PASSWORD);
        ALL_FIELDS.add(Constants.LEG_SIDE);
        ALL_FIELDS.add(Constants.DISCRETION_OFFSET_VALUE);
        ALL_FIELDS.add(Constants.SIDE_TRD_REG_TIMESTAMP_SRC);
        ALL_FIELDS.add(Constants.LEG_CONTRACT_SETTL_MONTH);
        ALL_FIELDS.add(Constants.UNDERLYING_TRADING_SESSION_SUB_ID);
        ALL_FIELDS.add(Constants.STIPULATION_VALUE);
        ALL_FIELDS.add(Constants.START_CASH);
        ALL_FIELDS.add(Constants.UNDERLYING_INSTRUMENT_PARTY_ID_SOURCE);
        ALL_FIELDS.add(Constants.SETTL_TYPE);
        ALL_FIELDS.add(Constants.BENCHMARK_CURVE_NAME);
        ALL_FIELDS.add(Constants.SCOPE);
        ALL_FIELDS.add(Constants.SIDE_EXEC_ID);
        ALL_FIELDS.add(Constants.NO_INSTRUMENT_PARTY_SUB_IDS);
        ALL_FIELDS.add(Constants.DISPLAY_QTY);
        ALL_FIELDS.add(Constants.ORIG_TRADE_DATE);
        ALL_FIELDS.add(Constants.POSS_DUP_FLAG);
        ALL_FIELDS.add(Constants.ENCODED_UNDERLYING_ISSUER);
        ALL_FIELDS.add(Constants.OFFER_SIZE);
        ALL_FIELDS.add(Constants.MATURITY_TIME);
        ALL_FIELDS.add(Constants.ALLOC_ACCOUNT);
        ALL_FIELDS.add(Constants.COLL_ASGN_REJECT_REASON);
        ALL_FIELDS.add(Constants.NEWS_CATEGORY);
        ALL_FIELDS.add(Constants.UNDERLYING_COUPON_RATE);
        ALL_FIELDS.add(Constants.LEG_PRICE_UNIT_OF_MEASURE);
        ALL_FIELDS.add(Constants.SWAP_POINTS);
        ALL_FIELDS.add(Constants.STRIKE_CURRENCY);
        ALL_FIELDS.add(Constants.SECONDARY_TRADING_REFERENCE_PRICE);
        ALL_FIELDS.add(Constants.INSTRUMENT_PARTY_ID);
        ALL_FIELDS.add(Constants.NO_TRADING_SESSION_RULES);
        ALL_FIELDS.add(Constants.RISK_FREE_RATE);
        ALL_FIELDS.add(Constants.ORDER_BOOKING_QTY);
        ALL_FIELDS.add(Constants.COUPON_PAYMENT_DATE);
        ALL_FIELDS.add(Constants.UNDERLYING_DELIVERY_AMOUNT);
        ALL_FIELDS.add(Constants.SETTL_SESS_ID);
        ALL_FIELDS.add(Constants.UNDERLYING_TRADING_SESSION_ID);
        ALL_FIELDS.add(Constants.SETTLE_ON_OPEN_FLAG);
        ALL_FIELDS.add(Constants.YIELD_REDEMPTION_PRICE_TYPE);
        ALL_FIELDS.add(Constants.ORIG_ORD_MOD_TIME);
        ALL_FIELDS.add(Constants.NO_TIME_IN_FORCE_RULES);
        ALL_FIELDS.add(Constants.SETTL_CURR_OFFER_FX_RATE);
        ALL_FIELDS.add(Constants.UNDERLYING_SETTL_PRICE);
        ALL_FIELDS.add(Constants.EXEC_INST);
        ALL_FIELDS.add(Constants.DELIVERY_TYPE);
        ALL_FIELDS.add(Constants.ORIG_CUST_ORDER_CAPACITY);
        ALL_FIELDS.add(Constants.M_D_REQ_REJ_REASON);
        ALL_FIELDS.add(Constants.CASH_MARGIN);
        ALL_FIELDS.add(Constants.LEG_ISSUE_DATE);
        ALL_FIELDS.add(Constants.ALLOC_TRANS_TYPE);
        ALL_FIELDS.add(Constants.RESPONSE_TRANSPORT_TYPE);
        ALL_FIELDS.add(Constants.DERIVATIVE_LIST_METHOD);
        ALL_FIELDS.add(Constants.NO_EXECS);
        ALL_FIELDS.add(Constants.UNDERLYING_SECURITY_ALT_ID);
        ALL_FIELDS.add(Constants.G_T_BOOKING_INST);
        ALL_FIELDS.add(Constants.COUNTRY);
        ALL_FIELDS.add(Constants.LATE_INDICATOR);
        ALL_FIELDS.add(Constants.ORIG_CL_ORD_ID);
        ALL_FIELDS.add(Constants.BID_REQUEST_TRANS_TYPE);
        ALL_FIELDS.add(Constants.UNDERLYING_LEG_C_F_I_CODE);
        ALL_FIELDS.add(Constants.DERIVATIVE_MIN_PRICE_INCREMENT);
        ALL_FIELDS.add(Constants.TICK_RULE_TYPE);
        ALL_FIELDS.add(Constants.ENCRYPTED_PASSWORD_LEN);
        ALL_FIELDS.add(Constants.REF_APPL_EXT_ID);
        ALL_FIELDS.add(Constants.DERIVATIVE_SECURITY_X_M_L_SCHEMA);
        ALL_FIELDS.add(Constants.PARTICIPATION_RATE);
        ALL_FIELDS.add(Constants.UNDERLYING_DIRTY_PRICE);
        ALL_FIELDS.add(Constants.TRD_SUB_TYPE);
        ALL_FIELDS.add(Constants.SETTL_DATE);
        ALL_FIELDS.add(Constants.ORDER_PERCENT);
        ALL_FIELDS.add(Constants.MARGIN_RATIO);
        ALL_FIELDS.add(Constants.SECURITY_X_M_L);
        ALL_FIELDS.add(Constants.LEG_MATURITY_MONTH_YEAR);
        ALL_FIELDS.add(Constants.TRIGGER_TRADING_SESSION_ID);
        ALL_FIELDS.add(Constants.COLL_INQUIRY_QUALIFIER);
        ALL_FIELDS.add(Constants.SECURITY_X_M_L_SCHEMA);
        ALL_FIELDS.add(Constants.DELIVER_TO_LOCATION_ID);
        ALL_FIELDS.add(Constants.DERIVATIVE_EVENT_TEXT);
        ALL_FIELDS.add(Constants.POS_MAINT_RPT_ID);
        ALL_FIELDS.add(Constants.CONTRA_TRADER);
        ALL_FIELDS.add(Constants.TRADE_PUBLISH_INDICATOR);
        ALL_FIELDS.add(Constants.ALLOC_SETTL_INST_TYPE);
        ALL_FIELDS.add(Constants.E_F_P_TRACKING_ERROR);
        ALL_FIELDS.add(Constants.TRADING_SESSION_SUB_ID);
        ALL_FIELDS.add(Constants.PEG_SYMBOL);
        ALL_FIELDS.add(Constants.INSTR_ATTRIB_VALUE);
        ALL_FIELDS.add(Constants.NO_UNDERLYING_LEG_SECURITY_ALT_ID);
        ALL_FIELDS.add(Constants.LEG_EXEC_INST);
        ALL_FIELDS.add(Constants.NO_USERNAMES);
        ALL_FIELDS.add(Constants.EXERCISE_STYLE);
        ALL_FIELDS.add(Constants.LEG_COVERED_OR_UNCOVERED);
        ALL_FIELDS.add(Constants.UNDERLYING_STRIKE_PRICE);
        ALL_FIELDS.add(Constants.DERIVATIVE_INSTRUMENT_PARTY_ID);
        ALL_FIELDS.add(Constants.OFFER_PX);
        ALL_FIELDS.add(Constants.UNIT_OF_MEASURE_QTY);
        ALL_FIELDS.add(Constants.PRICE_UNIT_OF_MEASURE_QTY);
        ALL_FIELDS.add(Constants.DERIVATIVE_CONTRACT_MULTIPLIER_UNIT);
        ALL_FIELDS.add(Constants.DERIVATIVE_INSTRUMENT_PARTY_SUB_ID);
        ALL_FIELDS.add(Constants.NEWS_REF_TYPE);
        ALL_FIELDS.add(Constants.APPL_BEG_SEQ_NUM);
        ALL_FIELDS.add(Constants.LEG_OPT_ATTRIBUTE);
        ALL_FIELDS.add(Constants.DELIVERY_DATE);
        ALL_FIELDS.add(Constants.ALLOC_NET_MONEY);
        ALL_FIELDS.add(Constants.AVG_PX);
        ALL_FIELDS.add(Constants.SETTL_CURR_BID_FX_RATE);
        ALL_FIELDS.add(Constants.INSTRUMENT_PARTY_SUB_ID);
        ALL_FIELDS.add(Constants.LIQUIDITY_PCT_LOW);
        ALL_FIELDS.add(Constants.EXPIRATION_CYCLE);
        ALL_FIELDS.add(Constants.UNDERLYING_SETTL_METHOD);
        ALL_FIELDS.add(Constants.MASS_ACTION_REPORT_ID);
        ALL_FIELDS.add(Constants.LEG_STRIKE_PRICE);
        ALL_FIELDS.add(Constants.R_F_Q_REQ_ID);
        ALL_FIELDS.add(Constants.BODY_LENGTH);
        ALL_FIELDS.add(Constants.AUTO_ACCEPT_INDICATOR);
        ALL_FIELDS.add(Constants.MARKET_REPORT_ID);
        ALL_FIELDS.add(Constants.TICK_INCREMENT);
        ALL_FIELDS.add(Constants.MASS_ACTION_RESPONSE);
        ALL_FIELDS.add(Constants.SECURITY_TRADING_EVENT);
        ALL_FIELDS.add(Constants.MSG_SEQ_NUM);
        ALL_FIELDS.add(Constants.MASS_STATUS_REQ_TYPE);
        ALL_FIELDS.add(Constants.REPORTED_PX);
        ALL_FIELDS.add(Constants.OPEN_INTEREST);
        ALL_FIELDS.add(Constants.I_O_I_NATURAL_FLAG);
        ALL_FIELDS.add(Constants.DERIVATIVE_PRICE_QUOTE_METHOD);
        ALL_FIELDS.add(Constants.CONT_AMT_VALUE);
        ALL_FIELDS.add(Constants.POSITION_CURRENCY);
        ALL_FIELDS.add(Constants.SECURE_DATA);
        ALL_FIELDS.add(Constants.MKT_BID_PX);
        ALL_FIELDS.add(Constants.TARGET_STRATEGY);
        ALL_FIELDS.add(Constants.DERIVATIVE_SECURITY_GROUP);
        ALL_FIELDS.add(Constants.PAYMENT_METHOD);
        ALL_FIELDS.add(Constants.STATS_TYPE);
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
        ALL_FIELDS.add(Constants.COLL_APPL_TYPE);
        ALL_FIELDS.add(Constants.TRADE_REPORT_REJECT_REASON);
        ALL_FIELDS.add(Constants.DIVIDEND_YIELD);
        ALL_FIELDS.add(Constants.ENCODED_LEG_SECURITY_DESC);
        ALL_FIELDS.add(Constants.NO_LINES_OF_TEXT);
        ALL_FIELDS.add(Constants.COLL_ASGN_ID);
        ALL_FIELDS.add(Constants.NOTIONAL_PERCENTAGE_OUTSTANDING);
        ALL_FIELDS.add(Constants.SHORT_QTY);
        ALL_FIELDS.add(Constants.UNDERLYING_C_P_REG_TYPE);
        ALL_FIELDS.add(Constants.UNDERLYING_LOCALE_OF_ISSUE);
        ALL_FIELDS.add(Constants.ADV_TRANS_TYPE);
        ALL_FIELDS.add(Constants.ROOT_PARTY_ID);
        ALL_FIELDS.add(Constants.CASH_DISTRIB_AGENT_CODE);
        ALL_FIELDS.add(Constants.MAX_FLOOR);
        ALL_FIELDS.add(Constants.ALLOC_INTERMED_REQ_TYPE);
        ALL_FIELDS.add(Constants.SHORT_SALE_REASON);
        ALL_FIELDS.add(Constants.TRADED_FLAT_SWITCH);
        ALL_FIELDS.add(Constants.DLVY_INST_TYPE);
        ALL_FIELDS.add(Constants.SECURITY_UPDATE_ACTION);
        ALL_FIELDS.add(Constants.NO_CONTRA_BROKERS);
        ALL_FIELDS.add(Constants.AFFECTED_ORDER_ID);
        ALL_FIELDS.add(Constants.SETTL_DELIVERY_TYPE);
        ALL_FIELDS.add(Constants.APPL_RESPONSE_ID);
        ALL_FIELDS.add(Constants.NESTED3_PARTY_ROLE);
        ALL_FIELDS.add(Constants.TRADE_CONDITION);
        ALL_FIELDS.add(Constants.SECURITY_LIST_TYPE_SOURCE);
        ALL_FIELDS.add(Constants.TRAD_SES_END_TIME);
        ALL_FIELDS.add(Constants.SHARED_COMMISSION);
        ALL_FIELDS.add(Constants.APPL_REQ_ID);
        ALL_FIELDS.add(Constants.TARGET_STRATEGY_PARAMETERS);
        ALL_FIELDS.add(Constants.EXP_QTY);
        ALL_FIELDS.add(Constants.ENCODED_LEG_SECURITY_DESC_LEN);
        ALL_FIELDS.add(Constants.URGENCY);
        ALL_FIELDS.add(Constants.EX_DESTINATION);
        ALL_FIELDS.add(Constants.POS_TRANS_TYPE);
        ALL_FIELDS.add(Constants.DERIVATIVE_FLOW_SCHEDULE_TYPE);
        ALL_FIELDS.add(Constants.ALLOC_ACCRUED_INTEREST_AMT);
        ALL_FIELDS.add(Constants.UNDERLYING_END_VALUE);
        ALL_FIELDS.add(Constants.REF_ORDER_ID_SOURCE);
        ALL_FIELDS.add(Constants.NET_GROSS_IND);
        ALL_FIELDS.add(Constants.BEGIN_STRING);
        ALL_FIELDS.add(Constants.M_D_FEED_TYPE);
        ALL_FIELDS.add(Constants.OFFER_SWAP_POINTS);
        ALL_FIELDS.add(Constants.ORIG_SENDING_TIME);
        ALL_FIELDS.add(Constants.TRIGGER_ACTION);
        ALL_FIELDS.add(Constants.SECONDARY_TRADE_REPORT_ID);
        ALL_FIELDS.add(Constants.PRODUCT);
        ALL_FIELDS.add(Constants.LEG_UNIT_OF_MEASURE_QTY);
        ALL_FIELDS.add(Constants.UNDERLYING_INSTRUMENT_PARTY_SUB_ID);
        ALL_FIELDS.add(Constants.LEG_ALLOC_ID);
        ALL_FIELDS.add(Constants.NO_ORD_TYPE_RULES);
        ALL_FIELDS.add(Constants.OWNER_TYPE);
        ALL_FIELDS.add(Constants.PARTY_SUB_ID_TYPE);
        ALL_FIELDS.add(Constants.DERIVATIVE_SECURITY_ALT_ID);
        ALL_FIELDS.add(Constants.PRODUCT_COMPLEX);
        ALL_FIELDS.add(Constants.I_O_I_ID);
        ALL_FIELDS.add(Constants.UNDERLYING_LEG_OPT_ATTRIBUTE);
        ALL_FIELDS.add(Constants.POOL);
        ALL_FIELDS.add(Constants.DEF_OFFER_SIZE);
        ALL_FIELDS.add(Constants.TIER_CODE);
        ALL_FIELDS.add(Constants.CONTRACT_MULTIPLIER_UNIT);
        ALL_FIELDS.add(Constants.SECURITY_TRADING_STATUS);
        ALL_FIELDS.add(Constants.FILL_EXEC_ID);
        ALL_FIELDS.add(Constants.POS_AMT);
        ALL_FIELDS.add(Constants.NO_DERIVATIVE_INSTR_ATTRIB);
        ALL_FIELDS.add(Constants.UNDERLYING_PRICE_DETERMINATION_METHOD);
        ALL_FIELDS.add(Constants.CREDIT_RATING);
        ALL_FIELDS.add(Constants.PEG_MOVE_TYPE);
        ALL_FIELDS.add(Constants.TRIGGER_SECURITY_ID);
        ALL_FIELDS.add(Constants.COLL_INQUIRY_ID);
        ALL_FIELDS.add(Constants.OPT_ATTRIBUTE);
        ALL_FIELDS.add(Constants.ENCRYPTED_PASSWORD);
        ALL_FIELDS.add(Constants.SIDE_TRD_SUB_TYP);
        ALL_FIELDS.add(Constants.TOTAL_VOLUME_TRADED);
        ALL_FIELDS.add(Constants.DAY_BOOKING_INST);
        ALL_FIELDS.add(Constants.NO_NESTED3_PARTY_IDS);
        ALL_FIELDS.add(Constants.DERIVATIVE_SECURITY_EXCHANGE);
        ALL_FIELDS.add(Constants.LEG_INTEREST_ACCRUAL_DATE);
        ALL_FIELDS.add(Constants.REF_APPL_LAST_SEQ_NUM);
        ALL_FIELDS.add(Constants.CONTRA_TRADE_TIME);
        ALL_FIELDS.add(Constants.ADV_REF_ID);
        ALL_FIELDS.add(Constants.LEG_VOLATILITY);
        ALL_FIELDS.add(Constants.MATURITY_NET_MONEY);
        ALL_FIELDS.add(Constants.SENDER_LOCATION_ID);
        ALL_FIELDS.add(Constants.REF_ALLOC_ID);
        ALL_FIELDS.add(Constants.COUNTRY_OF_ISSUE);
        ALL_FIELDS.add(Constants.TOT_NO_ALLOCS);
        ALL_FIELDS.add(Constants.LOW_PX);
        ALL_FIELDS.add(Constants.MONEY_LAUNDERING_STATUS);
        ALL_FIELDS.add(Constants.CARD_START_DATE);
        ALL_FIELDS.add(Constants.NUM_TICKETS);
        ALL_FIELDS.add(Constants.TOTAL_ACCRUED_INTEREST_AMT);
        ALL_FIELDS.add(Constants.DESK_ORDER_HANDLING_INST);
        ALL_FIELDS.add(Constants.LAST_QTY);
        ALL_FIELDS.add(Constants.M_D_ENTRY_DATE);
        ALL_FIELDS.add(Constants.AVG_PAR_PX);
        ALL_FIELDS.add(Constants.AGREEMENT_CURRENCY);
        ALL_FIELDS.add(Constants.NO_I_O_I_QUALIFIERS);
        ALL_FIELDS.add(Constants.C_P_PROGRAM);
        ALL_FIELDS.add(Constants.END_TICK_PRICE_RANGE);
        ALL_FIELDS.add(Constants.LIQUIDITY_IND_TYPE);
        ALL_FIELDS.add(Constants.NO_NESTED4_PARTY_SUB_IDS);
        ALL_FIELDS.add(Constants.POS_MAINT_ACTION);
        ALL_FIELDS.add(Constants.UNDERLYING_REPURCHASE_TERM);
        ALL_FIELDS.add(Constants.LEG_SYMBOL);
        ALL_FIELDS.add(Constants.LAST_PX);
        ALL_FIELDS.add(Constants.LEG_STIPULATION_VALUE);
        ALL_FIELDS.add(Constants.RECEIVED_DEPT_ID);
        ALL_FIELDS.add(Constants.DERIV_FLEX_PRODUCT_ELIGIBILITY_INDICATOR);
        ALL_FIELDS.add(Constants.LAST_MKT);
        ALL_FIELDS.add(Constants.NESTED_INSTR_ATTRIB_VALUE);
        ALL_FIELDS.add(Constants.LEG_SECURITY_EXCHANGE);
        ALL_FIELDS.add(Constants.TARGET_PARTY_ID_SOURCE);
        ALL_FIELDS.add(Constants.UNDERLYING_CONTRACT_MULTIPLIER);
        ALL_FIELDS.add(Constants.END_DATE);
        ALL_FIELDS.add(Constants.ACCRUED_INTEREST_AMT);
        ALL_FIELDS.add(Constants.TRAD_SES_METHOD);
        ALL_FIELDS.add(Constants.MASS_CANCEL_REJECT_REASON);
        ALL_FIELDS.add(Constants.COLL_ASGN_REF_ID);
        ALL_FIELDS.add(Constants.UNDERLYING_LEG_SECURITY_DESC);
        ALL_FIELDS.add(Constants.UNDERLYING_END_PRICE);
        ALL_FIELDS.add(Constants.TOT_NUM_TRADE_REPORTS);
        ALL_FIELDS.add(Constants.BENCHMARK_SECURITY_ID);
        ALL_FIELDS.add(Constants.ALLOC_HANDL_INST);
        ALL_FIELDS.add(Constants.TOT_NUM_ASSIGNMENT_REPORTS);
        ALL_FIELDS.add(Constants.HOST_CROSS_ID);
        ALL_FIELDS.add(Constants.ALLOC_LINK_TYPE);
        ALL_FIELDS.add(Constants.END_SEQ_NO);
        ALL_FIELDS.add(Constants.INPUT_SOURCE);
        ALL_FIELDS.add(Constants.UNDERLYING_CASH_TYPE);
        ALL_FIELDS.add(Constants.SETTL_CURR_FX_RATE_CALC);
        ALL_FIELDS.add(Constants.QUOTE_ENTRY_STATUS);
        ALL_FIELDS.add(Constants.TARGET_COMP_ID);
        ALL_FIELDS.add(Constants.TRIGGER_SYMBOL);
        ALL_FIELDS.add(Constants.NESTED4_PARTY_SUB_ID_TYPE);
        ALL_FIELDS.add(Constants.CONTRACT_SETTL_MONTH);
        ALL_FIELDS.add(Constants.UNDERLYING_STIP_TYPE);
        ALL_FIELDS.add(Constants.CARD_HOLDER_NAME);
        ALL_FIELDS.add(Constants.ORDER_DELAY);
        ALL_FIELDS.add(Constants.STRIKE_PRICE_DETERMINATION_METHOD);
        ALL_FIELDS.add(Constants.DELIVERY_FORM);
        ALL_FIELDS.add(Constants.ORDER_QTY2);
        ALL_FIELDS.add(Constants.NO_COLL_INQUIRY_QUALIFIER);
        ALL_FIELDS.add(Constants.SIDE_CURRENCY);
        ALL_FIELDS.add(Constants.M_D_ENTRY_SIZE);
        ALL_FIELDS.add(Constants.DISPLAY_METHOD);
        ALL_FIELDS.add(Constants.OFFER_FORWARD_POINTS2);
        ALL_FIELDS.add(Constants.SETTL_INST_ID);
        ALL_FIELDS.add(Constants.FEE_MULTIPLIER);
        ALL_FIELDS.add(Constants.LEG_BID_FORWARD_POINTS);
        ALL_FIELDS.add(Constants.REF_COMP_ID);
        ALL_FIELDS.add(Constants.NO_STATS_INDICATORS);
        ALL_FIELDS.add(Constants.ENCODED_MKT_SEGM_DESC);
        ALL_FIELDS.add(Constants.NESTED4_PARTY_ID_SOURCE);
        ALL_FIELDS.add(Constants.ENCODED_HEADLINE_LEN);
        ALL_FIELDS.add(Constants.NO_INSTRUMENT_PARTIES);
        ALL_FIELDS.add(Constants.MULTILEG_MODEL);
        ALL_FIELDS.add(Constants.UNDERLYING_SETTL_PRICE_TYPE);
        ALL_FIELDS.add(Constants.DEALING_CAPACITY);
        ALL_FIELDS.add(Constants.SECONDARY_HIGH_LIMIT_PRICE);
        ALL_FIELDS.add(Constants.NESTED4_PARTY_ROLE);
        ALL_FIELDS.add(Constants.TRAD_SES_STATUS_REJ_REASON);
        ALL_FIELDS.add(Constants.APPL_RESPONSE_TYPE);
        ALL_FIELDS.add(Constants.END_MATURITY_MONTH_YEAR);
        ALL_FIELDS.add(Constants.DERIVATIVE_ENCODED_SECURITY_DESC);
        ALL_FIELDS.add(Constants.TRD_REP_INDICATOR);
        ALL_FIELDS.add(Constants.CONFIRM_TRANS_TYPE);
        ALL_FIELDS.add(Constants.UNDERLYING_NOTIONAL_PERCENTAGE_OUTSTANDING);
        ALL_FIELDS.add(Constants.STRATEGY_PARAMETER_NAME);
        ALL_FIELDS.add(Constants.LEG_CONTRACT_MULTIPLIER);
        ALL_FIELDS.add(Constants.COLL_ASGN_REASON);
        ALL_FIELDS.add(Constants.BASIS_PX_TYPE);
        ALL_FIELDS.add(Constants.NO_BID_COMPONENTS);
        ALL_FIELDS.add(Constants.M_D_ENTRY_POSITION_NO);
        ALL_FIELDS.add(Constants.COVERED_OR_UNCOVERED);
        ALL_FIELDS.add(Constants.QUOTE_TYPE);
        ALL_FIELDS.add(Constants.UNDERLYING_LEG_SECURITY_ID);
        ALL_FIELDS.add(Constants.INSTRUMENT_PARTY_SUB_ID_TYPE);
        ALL_FIELDS.add(Constants.STRIKE_PRICE_BOUNDARY_PRECISION);
        ALL_FIELDS.add(Constants.HOP_REF_ID);
        ALL_FIELDS.add(Constants.TRIGGER_PRICE_TYPE_SCOPE);
        ALL_FIELDS.add(Constants.DERIVATIVE_EXERCISE_STYLE);
        ALL_FIELDS.add(Constants.TRIGGER_SECURITY_ID_SOURCE);
        ALL_FIELDS.add(Constants.NO_SECURITY_ALT_ID);
        ALL_FIELDS.add(Constants.UNDERLYING_MATURITY_MONTH_YEAR);
        ALL_FIELDS.add(Constants.EFFECTIVE_TIME);
        ALL_FIELDS.add(Constants.VOLATILITY);
        ALL_FIELDS.add(Constants.DERIVATIVE_C_F_I_CODE);
        ALL_FIELDS.add(Constants.UNDERLYING_MATURITY_DATE);
        ALL_FIELDS.add(Constants.DERIVATIVE_EVENT_TIME);
        ALL_FIELDS.add(Constants.TRAD_SES_OPEN_TIME);
        ALL_FIELDS.add(Constants.SECONDARY_DISPLAY_QTY);
        ALL_FIELDS.add(Constants.NO_OF_LEG_UNDERLYINGS);
        ALL_FIELDS.add(Constants.DERIVATIVE_OPT_PAY_AMOUNT);
        ALL_FIELDS.add(Constants.TRANSACT_TIME);
        ALL_FIELDS.add(Constants.TRIGGER_NEW_PRICE);
        ALL_FIELDS.add(Constants.QUANTITY_DATE);
        ALL_FIELDS.add(Constants.EXCHANGE_SPECIAL_INSTRUCTIONS);
        ALL_FIELDS.add(Constants.VALUATION_METHOD);
        ALL_FIELDS.add(Constants.CROSS_PERCENT);
        ALL_FIELDS.add(Constants.TOT_NUM_REPORTS);
        ALL_FIELDS.add(Constants.CONFIRM_STATUS);
        ALL_FIELDS.add(Constants.PEG_ROUND_DIRECTION);
        ALL_FIELDS.add(Constants.CALCULATED_CCY_LAST_QTY);
        ALL_FIELDS.add(Constants.NO_NESTED_PARTY_SUB_IDS);
        ALL_FIELDS.add(Constants.UNDERLYING_ADJUSTED_QUANTITY);
        ALL_FIELDS.add(Constants.FIRM_TRADE_ID);
        ALL_FIELDS.add(Constants.MASS_ACTION_SCOPE);
        ALL_FIELDS.add(Constants.OFFER_FORWARD_POINTS);
        ALL_FIELDS.add(Constants.EXCHANGE_RULE);
        ALL_FIELDS.add(Constants.NESTED4_PARTY_ID);
        ALL_FIELDS.add(Constants.TERMINATION_TYPE);
        ALL_FIELDS.add(Constants.NESTED3_PARTY_SUB_ID_TYPE);
        ALL_FIELDS.add(Constants.ALLOC_CUSTOMER_CAPACITY);
        ALL_FIELDS.add(Constants.RATE_SOURCE_TYPE);
        ALL_FIELDS.add(Constants.ENCRYPTED_NEW_PASSWORD_LEN);
        ALL_FIELDS.add(Constants.TRADE_REPORT_REF_ID);
        ALL_FIELDS.add(Constants.CCY_AMT);
        ALL_FIELDS.add(Constants.NO_TRADING_SESSIONS);
        ALL_FIELDS.add(Constants.NESTED3_PARTY_SUB_ID);
        ALL_FIELDS.add(Constants.ALLOWABLE_ONE_SIDEDNESS_CURR);
        ALL_FIELDS.add(Constants.C_P_REG_TYPE);
        ALL_FIELDS.add(Constants.UNDERLYING_LEG_SECURITY_EXCHANGE);
        ALL_FIELDS.add(Constants.DEFAULT_VER_INDICATOR);
        ALL_FIELDS.add(Constants.LEG_OFFER_PX);
        ALL_FIELDS.add(Constants.TRADE_VOLUME);
        ALL_FIELDS.add(Constants.REPORT_TO_EXCH);
        ALL_FIELDS.add(Constants.NO_CONT_AMTS);
        ALL_FIELDS.add(Constants.LEG_ALLOC_ACCOUNT);
        ALL_FIELDS.add(Constants.DERIVATIVE_SECURITY_X_M_L);
        ALL_FIELDS.add(Constants.COLL_INQUIRY_RESULT);
        ALL_FIELDS.add(Constants.NUM_DAYS_INTEREST);
        ALL_FIELDS.add(Constants.SENDER_COMP_ID);
        ALL_FIELDS.add(Constants.NESTED_INSTR_ATTRIB_TYPE);
        ALL_FIELDS.add(Constants.EMAIL_TYPE);
        ALL_FIELDS.add(Constants.DEFAULT_APPL_EXT_ID);
        ALL_FIELDS.add(Constants.NESTED2_PARTY_ROLE);
        ALL_FIELDS.add(Constants.M_D_ENTRY_FORWARD_POINTS);
        ALL_FIELDS.add(Constants.RND_PX);
        ALL_FIELDS.add(Constants.PROG_RPT_REQS);
        ALL_FIELDS.add(Constants.MAX_PRICE_LEVELS);
        ALL_FIELDS.add(Constants.EMAIL_THREAD_ID);
        ALL_FIELDS.add(Constants.DERIVATIVE_STRIKE_MULTIPLIER);
        ALL_FIELDS.add(Constants.AFFECTED_SECONDARY_ORDER_ID);
        ALL_FIELDS.add(Constants.TRADING_SESSION_ID);
        ALL_FIELDS.add(Constants.SETTL_CURRENCY);
        ALL_FIELDS.add(Constants.ASSIGNMENT_METHOD);
        ALL_FIELDS.add(Constants.LEG_UNIT_OF_MEASURE);
        ALL_FIELDS.add(Constants.UNDERLYING_SECURITY_DESC);
        ALL_FIELDS.add(Constants.ORIGINAL_NOTIONAL_PERCENTAGE_OUTSTANDING);
        ALL_FIELDS.add(Constants.NO_CLEARING_INSTRUCTIONS);
        ALL_FIELDS.add(Constants.POS_REQ_STATUS);
        ALL_FIELDS.add(Constants.BID_DESCRIPTOR);
        ALL_FIELDS.add(Constants.ENCODED_SECURITY_DESC);
        ALL_FIELDS.add(Constants.ORDER_HANDLING_INST_SOURCE);
        ALL_FIELDS.add(Constants.CARD_EXP_DATE);
        ALL_FIELDS.add(Constants.SETTL_INST_REF_ID);
        ALL_FIELDS.add(Constants.M_D_MKT);
        ALL_FIELDS.add(Constants.SETTL_INST_MODE);
        ALL_FIELDS.add(Constants.ADJUSTMENT);
        ALL_FIELDS.add(Constants.PAYMENT_DATE);
        ALL_FIELDS.add(Constants.QUOTE_MSG_ID);
        ALL_FIELDS.add(Constants.SECURITY_ID_SOURCE);
        ALL_FIELDS.add(Constants.SECONDARY_CL_ORD_ID);
        ALL_FIELDS.add(Constants.CXL_REJ_RESPONSE_TO);
        ALL_FIELDS.add(Constants.INTEREST_ACCRUAL_DATE);
        ALL_FIELDS.add(Constants.PEG_SCOPE);
        ALL_FIELDS.add(Constants.EVENT_TIME);
        ALL_FIELDS.add(Constants.VENUE_TYPE);
        ALL_FIELDS.add(Constants.ENCODED_UNDERLYING_ISSUER_LEN);
        ALL_FIELDS.add(Constants.STATE_OR_PROVINCE_OF_ISSUE);
        ALL_FIELDS.add(Constants.NESTED_PARTY_ID_SOURCE);
        ALL_FIELDS.add(Constants.PEGGED_PRICE);
        ALL_FIELDS.add(Constants.ORDER_RESTRICTIONS);
        ALL_FIELDS.add(Constants.RESPONSE_DESTINATION);
        ALL_FIELDS.add(Constants.INDIVIDUAL_ALLOC_TYPE);
        ALL_FIELDS.add(Constants.EXCHANGE_FOR_PHYSICAL);
        ALL_FIELDS.add(Constants.UNDERLYING_STATE_OR_PROVINCE_OF_ISSUE);
        ALL_FIELDS.add(Constants.NO_ALT_M_D_SOURCE);
        ALL_FIELDS.add(Constants.PRICE_IMPROVEMENT);
        ALL_FIELDS.add(Constants.LEG_ORDER_QTY);
        ALL_FIELDS.add(Constants.D_K_REASON);
        ALL_FIELDS.add(Constants.SIDE_REASON_CD);
        ALL_FIELDS.add(Constants.SIDE_LIQUIDITY_IND);
        ALL_FIELDS.add(Constants.FLOW_SCHEDULE_TYPE);
        ALL_FIELDS.add(Constants.UNDERLYING_CREDIT_RATING);
        ALL_FIELDS.add(Constants.DERIVATIVE_SECURITY_SUB_TYPE);
        ALL_FIELDS.add(Constants.DETACHMENT_POINT);
        ALL_FIELDS.add(Constants.FINANCIAL_STATUS);
        ALL_FIELDS.add(Constants.TOTAL_AFFECTED_ORDERS);
        ALL_FIELDS.add(Constants.THRESHOLD_AMOUNT);
        ALL_FIELDS.add(Constants.NO_POS_AMT);
        ALL_FIELDS.add(Constants.NO_ASGN_REQS);
        ALL_FIELDS.add(Constants.TOT_NO_RELATED_SYM);
        ALL_FIELDS.add(Constants.ORIG_TRADE_ID);
        ALL_FIELDS.add(Constants.ORDER_INPUT_DEVICE);
        ALL_FIELDS.add(Constants.U_R_L_LINK);
        ALL_FIELDS.add(Constants.ALLOC_NO_ORDERS_TYPE);
        ALL_FIELDS.add(Constants.TRADE_ALLOC_INDICATOR);
        ALL_FIELDS.add(Constants.DISCRETION_LIMIT_TYPE);
        ALL_FIELDS.add(Constants.NESTED2_PARTY_ID);
        ALL_FIELDS.add(Constants.SECURITY_LIST_TYPE);
        ALL_FIELDS.add(Constants.ALLOC_TEXT);
        ALL_FIELDS.add(Constants.QUOTE_SET_VALID_UNTIL_TIME);
        ALL_FIELDS.add(Constants.NESTED2_PARTY_ID_SOURCE);
        ALL_FIELDS.add(Constants.CXL_REJ_REASON);
        ALL_FIELDS.add(Constants.QUOTE_QUALIFIER);
        ALL_FIELDS.add(Constants.LIQUIDITY_NUM_SECURITIES);
        ALL_FIELDS.add(Constants.TIME_BRACKET);
        ALL_FIELDS.add(Constants.UNDERLYING_FLOW_SCHEDULE_TYPE);
        ALL_FIELDS.add(Constants.SECONDARY_FIRM_TRADE_ID);
        ALL_FIELDS.add(Constants.I_O_I_QLTY_IND);
        ALL_FIELDS.add(Constants.ORDER_CATEGORY);
        ALL_FIELDS.add(Constants.DERIVATIVE_SECURITY_STATUS);
        ALL_FIELDS.add(Constants.TOT_NO_STRIKES);
        ALL_FIELDS.add(Constants.LEG_STATE_OR_PROVINCE_OF_ISSUE);
        ALL_FIELDS.add(Constants.REGIST_DTLS);
        ALL_FIELDS.add(Constants.BID_TYPE);
        ALL_FIELDS.add(Constants.DERIVATIVE_COUNTRY_OF_ISSUE);
        ALL_FIELDS.add(Constants.REGIST_ID);
        ALL_FIELDS.add(Constants.POS_AMT_TYPE);
        ALL_FIELDS.add(Constants.M_D_STREAM_ID);
        ALL_FIELDS.add(Constants.NETWORK_STATUS_RESPONSE_TYPE);
        ALL_FIELDS.add(Constants.MKT_OFFER_PX);
        ALL_FIELDS.add(Constants.LEG_TIME_UNIT);
        ALL_FIELDS.add(Constants.UNDERLYING_PAY_AMOUNT);
        ALL_FIELDS.add(Constants.UNDERLYING_RESTRUCTURING_TYPE);
        ALL_FIELDS.add(Constants.LAST_UPDATE_TIME);
        ALL_FIELDS.add(Constants.STAND_INST_DB_ID);
        ALL_FIELDS.add(Constants.ENCODED_UNDERLYING_SECURITY_DESC);
        ALL_FIELDS.add(Constants.CXL_QTY);
        ALL_FIELDS.add(Constants.NO_ROOT_PARTY_IDS);
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
        ALL_FIELDS.add(Constants.APPL_ID);
        ALL_FIELDS.add(Constants.NEWS_ID);
        ALL_FIELDS.add(Constants.ENCODED_ISSUER_LEN);
        ALL_FIELDS.add(Constants.PRICE);
        ALL_FIELDS.add(Constants.ENCODED_ALLOC_TEXT);
        ALL_FIELDS.add(Constants.NETWORK_REQUEST_ID);
        ALL_FIELDS.add(Constants.CLEARING_FEE_INDICATOR);
        ALL_FIELDS.add(Constants.LEG_CONTRACT_MULTIPLIER_UNIT);
        ALL_FIELDS.add(Constants.NO_OF_SEC_SIZES);
        ALL_FIELDS.add(Constants.TRAD_SES_PRE_CLOSE_TIME);
        ALL_FIELDS.add(Constants.PEG_SECURITY_DESC);
        ALL_FIELDS.add(Constants.WT_AVERAGE_LIQUIDITY);
        ALL_FIELDS.add(Constants.INVESTOR_COUNTRY_OF_RESIDENCE);
        ALL_FIELDS.add(Constants.EXPIRE_TIME);
        ALL_FIELDS.add(Constants.STATUS_VALUE);
        ALL_FIELDS.add(Constants.DERIVATIVE_PRODUCT_COMPLEX);
        ALL_FIELDS.add(Constants.SETTL_OBLIG_TRANS_TYPE);
        ALL_FIELDS.add(Constants.APPL_REPORT_TYPE);
        ALL_FIELDS.add(Constants.EXEC_PRICE_ADJUSTMENT);
        ALL_FIELDS.add(Constants.ORDER_QTY);
        ALL_FIELDS.add(Constants.ISSUER);
        ALL_FIELDS.add(Constants.SYMBOL);
        ALL_FIELDS.add(Constants.TOT_NO_ORDERS);
        ALL_FIELDS.add(Constants.QUOTE_STATUS);
        ALL_FIELDS.add(Constants.SECURITY_REQUEST_TYPE);
        ALL_FIELDS.add(Constants.DERIVATIVE_MATURITY_TIME);
        ALL_FIELDS.add(Constants.REF_CSTM_APPL_VER_ID);
        ALL_FIELDS.add(Constants.INSTR_REGISTRY);
        ALL_FIELDS.add(Constants.TRIGGER_PRICE);
        ALL_FIELDS.add(Constants.DERIVATIVE_SYMBOL);
        ALL_FIELDS.add(Constants.NO_MATURITY_RULES);
        ALL_FIELDS.add(Constants.DERIVATIVE_UNIT_OF_MEASURE_QTY);
        ALL_FIELDS.add(Constants.INDIVIDUAL_ALLOC_ID);
        ALL_FIELDS.add(Constants.TRANSFER_REASON);
        ALL_FIELDS.add(Constants.QUOTE_CONDITION);
        ALL_FIELDS.add(Constants.ORIG_TRADE_HANDLING_INSTR);
        ALL_FIELDS.add(Constants.SECURITY_STATUS);
        ALL_FIELDS.add(Constants.M_D_ENTRY_TYPE);
        ALL_FIELDS.add(Constants.REF_APPL_ID);
        ALL_FIELDS.add(Constants.NO_QUOTE_ENTRIES);
        ALL_FIELDS.add(Constants.SETTL_OBLIG_MSG_ID);
        ALL_FIELDS.add(Constants.LEG_REDEMPTION_DATE);
        ALL_FIELDS.add(Constants.LEG_C_F_I_CODE);
        ALL_FIELDS.add(Constants.RAW_DATA_LENGTH);
        ALL_FIELDS.add(Constants.NESTED3_PARTY_ID_SOURCE);
        ALL_FIELDS.add(Constants.APPL_VER_ID);
        ALL_FIELDS.add(Constants.IN_VIEW_OF_COMMON);
        ALL_FIELDS.add(Constants.UNDERLYING_FACTOR);
        ALL_FIELDS.add(Constants.POSITION_LIMIT);
        ALL_FIELDS.add(Constants.UNDERLYING_SYMBOL_SFX);
        ALL_FIELDS.add(Constants.STREAM_ASGN_REQ_ID);
        ALL_FIELDS.add(Constants.GAP_FILL_FLAG);
        ALL_FIELDS.add(Constants.NO_LEG_ALLOCS);
        ALL_FIELDS.add(Constants.LEG_REPO_COLLATERAL_SECURITY_TYPE);
        ALL_FIELDS.add(Constants.CARD_ISS_NUM);
        ALL_FIELDS.add(Constants.ALLOWABLE_ONE_SIDEDNESS_VALUE);
        ALL_FIELDS.add(Constants.COLL_ACTION);
        ALL_FIELDS.add(Constants.SECONDARY_TRADE_ID);
        ALL_FIELDS.add(Constants.GROSS_TRADE_AMT);
        ALL_FIELDS.add(Constants.UNDERLYING_SENIORITY);
        ALL_FIELDS.add(Constants.STRIKE_VALUE);
        ALL_FIELDS.add(Constants.ACCT_ID_SOURCE);
        ALL_FIELDS.add(Constants.HOP_SENDING_TIME);
        ALL_FIELDS.add(Constants.CONTRARY_INSTRUCTION_INDICATOR);
        ALL_FIELDS.add(Constants.PREALLOC_METHOD);
        ALL_FIELDS.add(Constants.I_O_I_TRANS_TYPE);
        ALL_FIELDS.add(Constants.CONFIRM_TYPE);
        ALL_FIELDS.add(Constants.MULTI_LEG_RPT_TYPE_REQ);
        ALL_FIELDS.add(Constants.QUOTE_ENTRY_REJECT_REASON);
        ALL_FIELDS.add(Constants.ENCODED_SECURITY_LIST_DESC);
        ALL_FIELDS.add(Constants.INSTR_ATTRIB_TYPE);
        ALL_FIELDS.add(Constants.REGIST_ACCT_TYPE);
        ALL_FIELDS.add(Constants.BOOKING_REF_ID);
        ALL_FIELDS.add(Constants.TRADE_REQUEST_RESULT);
        ALL_FIELDS.add(Constants.TOT_NO_CXLD_QUOTES);
        ALL_FIELDS.add(Constants.DERIVATIVE_PRICE_UNIT_OF_MEASURE_QTY);
        ALL_FIELDS.add(Constants.COMPLEX_EVENT_PRICE_BOUNDARY_METHOD);
        ALL_FIELDS.add(Constants.ALLOC_ID);
        ALL_FIELDS.add(Constants.UNDERLYING_ATTACHMENT_POINT);
        ALL_FIELDS.add(Constants.TIME_UNIT);
        ALL_FIELDS.add(Constants.NO_TRD_REP_INDICATORS);
        ALL_FIELDS.add(Constants.OUTSIDE_INDEX_PCT);
        ALL_FIELDS.add(Constants.UNDERLYING_PRODUCT);
        ALL_FIELDS.add(Constants.TRIGGER_TYPE);
        ALL_FIELDS.add(Constants.PAYMENT_REMITTER_ID);
        ALL_FIELDS.add(Constants.SETTL_OBLIG_MODE);
        ALL_FIELDS.add(Constants.POS_QTY_STATUS);
        ALL_FIELDS.add(Constants.MIN_PRICE_INCREMENT_AMOUNT);
        ALL_FIELDS.add(Constants.SENIORITY);
        ALL_FIELDS.add(Constants.BID_FORWARD_POINTS);
        ALL_FIELDS.add(Constants.COMPLEX_EVENT_PRICE_TIME_TYPE);
        ALL_FIELDS.add(Constants.REPURCHASE_TERM);
        ALL_FIELDS.add(Constants.ALLOC_POSITION_EFFECT);
        ALL_FIELDS.add(Constants.UNDERLYING_SECURITY_EXCHANGE);
        ALL_FIELDS.add(Constants.LIST_STATUS_TYPE);
        ALL_FIELDS.add(Constants.UNDERLYING_LAST_QTY);
        ALL_FIELDS.add(Constants.PRICE_LIMIT_TYPE);
        ALL_FIELDS.add(Constants.MASS_CANCEL_RESPONSE);
        ALL_FIELDS.add(Constants.I_O_I_QUALIFIER);
        ALL_FIELDS.add(Constants.POS_MAINT_STATUS);
        ALL_FIELDS.add(Constants.MATURITY_MONTH_YEAR_INCREMENT_UNITS);
        ALL_FIELDS.add(Constants.LEG_SWAP_TYPE);
        ALL_FIELDS.add(Constants.NO_M_D_FEED_TYPES);
        ALL_FIELDS.add(Constants.POSS_RESEND);
        ALL_FIELDS.add(Constants.USER_REQUEST_TYPE);
        ALL_FIELDS.add(Constants.ENCODED_LIST_EXEC_INST);
        ALL_FIELDS.add(Constants.LOT_TYPE);
        ALL_FIELDS.add(Constants.POS_REQ_RESULT);
        ALL_FIELDS.add(Constants.LEG_LAST_FORWARD_POINTS);
        ALL_FIELDS.add(Constants.LIST_REJECT_REASON);
        ALL_FIELDS.add(Constants.LIST_ORDER_STATUS);
        ALL_FIELDS.add(Constants.BID_SIZE);
        ALL_FIELDS.add(Constants.SECURITY_REQ_ID);
        ALL_FIELDS.add(Constants.CAP_PRICE);
        ALL_FIELDS.add(Constants.ENCRYPTED_NEW_PASSWORD);
        ALL_FIELDS.add(Constants.TICK_DIRECTION);
        ALL_FIELDS.add(Constants.CONT_INT_RPT_ID);
        ALL_FIELDS.add(Constants.REF_TAG_ID);
        ALL_FIELDS.add(Constants.AGGREGATED_BOOK);
        ALL_FIELDS.add(Constants.LOCALE_OF_ISSUE);
        ALL_FIELDS.add(Constants.YIELD_CALC_DATE);
        ALL_FIELDS.add(Constants.FILL_QTY);
        ALL_FIELDS.add(Constants.NO_DATES);
        ALL_FIELDS.add(Constants.REFRESH_QTY);
        ALL_FIELDS.add(Constants.BENCHMARK_SECURITY_ID_SOURCE);
        ALL_FIELDS.add(Constants.NO_ALLOCS);
        ALL_FIELDS.add(Constants.NO_MATCH_RULES);
        ALL_FIELDS.add(Constants.PUT_OR_CALL);
        ALL_FIELDS.add(Constants.ORDER_CAPACITY_QTY);
        ALL_FIELDS.add(Constants.MANUAL_ORDER_INDICATOR);
        ALL_FIELDS.add(Constants.UNDERLYING_LEG_MATURITY_DATE);
        ALL_FIELDS.add(Constants.STRIKE_PRICE_BOUNDARY_METHOD);
        ALL_FIELDS.add(Constants.UNDERLYING_CONTRACT_MULTIPLIER_UNIT);
        ALL_FIELDS.add(Constants.DERIVATIVE_INSTRMT_ASSIGNMENT_METHOD);
        ALL_FIELDS.add(Constants.COMM_CURRENCY);
        ALL_FIELDS.add(Constants.LEG_EXERCISE_STYLE);
        ALL_FIELDS.add(Constants.UNDERLYING_COUNTRY_OF_ISSUE);
        ALL_FIELDS.add(Constants.ENCODED_HEADLINE);
        ALL_FIELDS.add(Constants.CONT_AMT_CURR);
        ALL_FIELDS.add(Constants.UNDERLYING_UNIT_OF_MEASURE_QTY);
        ALL_FIELDS.add(Constants.MATCH_TYPE);
        ALL_FIELDS.add(Constants.SETTL_INST_REQ_ID);
        ALL_FIELDS.add(Constants.PEG_LIMIT_TYPE);
        ALL_FIELDS.add(Constants.INSTRMT_ASSIGNMENT_METHOD);
        ALL_FIELDS.add(Constants.CONFIRM_REJ_REASON);
        ALL_FIELDS.add(Constants.MODEL_TYPE);
        ALL_FIELDS.add(Constants.LONG_QTY);
        ALL_FIELDS.add(Constants.LEG_MATURITY_TIME);
        ALL_FIELDS.add(Constants.DAY_ORDER_QTY);
        ALL_FIELDS.add(Constants.COMPLEX_EVENT_START_TIME);
        ALL_FIELDS.add(Constants.DERIVATIVE_TIME_UNIT);
        ALL_FIELDS.add(Constants.NESTED_PARTY_SUB_ID_TYPE);
        ALL_FIELDS.add(Constants.NOT_AFF_ORIG_CL_ORD_ID);
        ALL_FIELDS.add(Constants.FUND_RENEW_WAIV);
        ALL_FIELDS.add(Constants.BID_YIELD);
        ALL_FIELDS.add(Constants.NO_CAPACITIES);
        ALL_FIELDS.add(Constants.ROOT_PARTY_SUB_ID);
        ALL_FIELDS.add(Constants.DEFAULT_CSTM_APPL_VER_ID);
        ALL_FIELDS.add(Constants.TEST_MESSAGE_INDICATOR);
        ALL_FIELDS.add(Constants.UNDERLYING_C_F_I_CODE);
        ALL_FIELDS.add(Constants.NO_NESTED2_PARTY_IDS);
        ALL_FIELDS.add(Constants.MISC_FEE_CURR);
        ALL_FIELDS.add(Constants.ALLOC_METHOD);
        ALL_FIELDS.add(Constants.TIME_IN_FORCE);
        ALL_FIELDS.add(Constants.CSTM_APPL_VER_ID);
        ALL_FIELDS.add(Constants.SECONDARY_TRD_TYPE);
        ALL_FIELDS.add(Constants.SIDE_FILL_STATION_CD);
        ALL_FIELDS.add(Constants.SECONDARY_ALLOC_ID);
        ALL_FIELDS.add(Constants.LAST_CAPACITY);
        ALL_FIELDS.add(Constants.M_D_SEC_SIZE);
        ALL_FIELDS.add(Constants.TARGET_SUB_ID);
        ALL_FIELDS.add(Constants.UNDERLYING_CURRENCY);
        ALL_FIELDS.add(Constants.UNSOLICITED_INDICATOR);
        ALL_FIELDS.add(Constants.SIDE_TIME_IN_FORCE);
        ALL_FIELDS.add(Constants.M_D_REPORT_ID);
        ALL_FIELDS.add(Constants.ALLOC_STATUS);
        ALL_FIELDS.add(Constants.APPL_SEQ_NUM);
        ALL_FIELDS.add(Constants.MATURITY_RULE_ID);
        ALL_FIELDS.add(Constants.DISPLAY_MIN_INCR);
        ALL_FIELDS.add(Constants.STRIKE_INCREMENT);
        ALL_FIELDS.add(Constants.NO_MISC_FEES);
        ALL_FIELDS.add(Constants.DERIVATIVE_PRODUCT);
        ALL_FIELDS.add(Constants.TRADING_REFERENCE_PRICE);
        ALL_FIELDS.add(Constants.CONTRA_TRADE_QTY);
        ALL_FIELDS.add(Constants.REL_SYM_TRANSACT_TIME);
        ALL_FIELDS.add(Constants.LAST_SWAP_POINTS);
        ALL_FIELDS.add(Constants.M_D_UPDATE_TYPE);
        ALL_FIELDS.add(Constants.BENCHMARK_PRICE);
        ALL_FIELDS.add(Constants.MARGIN_EXCESS);
        ALL_FIELDS.add(Constants.DERIVATIVE_LOCALE_OF_ISSUE);
        ALL_FIELDS.add(Constants.TARGET_LOCATION_ID);
        ALL_FIELDS.add(Constants.EXEC_REF_ID);
        ALL_FIELDS.add(Constants.HOP_COMP_ID);
        ALL_FIELDS.add(Constants.LEG_SYMBOL_SFX);
        ALL_FIELDS.add(Constants.ORIG_TIME);
        ALL_FIELDS.add(Constants.BOOKING_UNIT);
        ALL_FIELDS.add(Constants.TRD_REG_TIMESTAMP);
        ALL_FIELDS.add(Constants.TRAD_SES_EVENT);
        ALL_FIELDS.add(Constants.SELL_VOLUME);
        ALL_FIELDS.add(Constants.PARTY_ID_SOURCE);
        ALL_FIELDS.add(Constants.FILL_LIQUIDITY_IND);
        ALL_FIELDS.add(Constants.APPL_QUEUE_RESOLUTION);
        ALL_FIELDS.add(Constants.NO_M_D_ENTRY_TYPES);
        ALL_FIELDS.add(Constants.SIDE_TRD_REG_TIMESTAMP_TYPE);
        ALL_FIELDS.add(Constants.RESTRUCTURING_TYPE);
        ALL_FIELDS.add(Constants.DERIVATIVE_CONTRACT_MULTIPLIER);
        ALL_FIELDS.add(Constants.STRIKE_MULTIPLIER);
        ALL_FIELDS.add(Constants.NEW_PASSWORD);
        ALL_FIELDS.add(Constants.ORD_REJ_REASON);
        ALL_FIELDS.add(Constants.STRIKE_PRICE);
        ALL_FIELDS.add(Constants.TRD_MATCH_ID);
        ALL_FIELDS.add(Constants.AGREEMENT_DESC);
        ALL_FIELDS.add(Constants.PRICE_UNIT_OF_MEASURE);
        ALL_FIELDS.add(Constants.DELIVER_TO_SUB_ID);
        ALL_FIELDS.add(Constants.TRAD_SES_START_TIME);
        ALL_FIELDS.add(Constants.SUBJECT);
        ALL_FIELDS.add(Constants.TOT_NO_SECURITY_TYPES);
        ALL_FIELDS.add(Constants.ADJUSTMENT_TYPE);
        ALL_FIELDS.add(Constants.MATCH_INCREMENT);
        ALL_FIELDS.add(Constants.SETTL_PARTY_ID);
        ALL_FIELDS.add(Constants.SECURITY_ALT_ID);
        ALL_FIELDS.add(Constants.COMPLEX_OPT_PAYOUT_AMOUNT);
        ALL_FIELDS.add(Constants.DERIVATIVE_CAP_PRICE);
        ALL_FIELDS.add(Constants.NO_LEGS);
        ALL_FIELDS.add(Constants.PEG_OFFSET_TYPE);
        ALL_FIELDS.add(Constants.PCT_AT_RISK);
        ALL_FIELDS.add(Constants.ACCOUNT);
        ALL_FIELDS.add(Constants.SETTL_SESS_SUB_ID);
        ALL_FIELDS.add(Constants.UNDERLYING_SECURITY_ID_SOURCE);
        ALL_FIELDS.add(Constants.SETTL_CURR_FX_RATE);
        ALL_FIELDS.add(Constants.LEG_ALLOC_QTY);
        ALL_FIELDS.add(Constants.TRADE_REPORT_TYPE);
        ALL_FIELDS.add(Constants.M_D_PRICE_LEVEL);
        ALL_FIELDS.add(Constants.SETTL_INST_TRANS_TYPE);
        ALL_FIELDS.add(Constants.LEG_RATIO_QTY);
        ALL_FIELDS.add(Constants.ALLOC_ACCOUNT_TYPE);
        ALL_FIELDS.add(Constants.M_D_UPDATE_ACTION);
        ALL_FIELDS.add(Constants.ON_BEHALF_OF_COMP_ID);
        ALL_FIELDS.add(Constants.TRIGGER_PRICE_TYPE);
        ALL_FIELDS.add(Constants.EVENT_PX);
        ALL_FIELDS.add(Constants.DAY_AVG_PX);
        ALL_FIELDS.add(Constants.UNDERLYING_LEG_SECURITY_TYPE);
        ALL_FIELDS.add(Constants.BASIS_FEATURE_DATE);
        ALL_FIELDS.add(Constants.COMPLEX_EVENT_PRICE_BOUNDARY_PRECISION);
        ALL_FIELDS.add(Constants.STREAM_ASGN_TYPE);
        ALL_FIELDS.add(Constants.UNDERLYING_DETACHMENT_POINT);
        ALL_FIELDS.add(Constants.NO_SETTL_OBLIG);
        ALL_FIELDS.add(Constants.LEG_DIVIDEND_YIELD);
        ALL_FIELDS.add(Constants.BEGIN_SEQ_NO);
        ALL_FIELDS.add(Constants.POS_REQ_TYPE);
        ALL_FIELDS.add(Constants.MASS_CANCEL_REQUEST_TYPE);
        ALL_FIELDS.add(Constants.SOLICITED_FLAG);
        ALL_FIELDS.add(Constants.MASS_ACTION_REJECT_REASON);
        ALL_FIELDS.add(Constants.M_D_REQ_ID);
        ALL_FIELDS.add(Constants.COLL_ASGN_TRANS_TYPE);
        ALL_FIELDS.add(Constants.SETTL_OBLIG_ID);
        ALL_FIELDS.add(Constants.CASH_DISTRIB_PAY_REF);
        ALL_FIELDS.add(Constants.STREAM_ASGN_REQ_TYPE);
        ALL_FIELDS.add(Constants.SIDE_COMPLIANCE_ID);
        ALL_FIELDS.add(Constants.TRD_REG_TIMESTAMP_ORIGIN);
        ALL_FIELDS.add(Constants.SECURITY_RESPONSE_TYPE);
        ALL_FIELDS.add(Constants.ENCODED_LIST_STATUS_TEXT);
        ALL_FIELDS.add(Constants.DEFAULT_APPL_VER_ID);
        ALL_FIELDS.add(Constants.OFFER_SPOT_RATE);
        ALL_FIELDS.add(Constants.COLL_STATUS);
        ALL_FIELDS.add(Constants.STIPULATION_TYPE);
        ALL_FIELDS.add(Constants.TRAD_SES_CLOSE_TIME);
        ALL_FIELDS.add(Constants.ALLOC_REJ_CODE);
        ALL_FIELDS.add(Constants.M_D_ENTRY_SELLER);
        ALL_FIELDS.add(Constants.TRD_REP_PARTY_ROLE);
        ALL_FIELDS.add(Constants.ADV_SIDE);
        ALL_FIELDS.add(Constants.LEG_BENCHMARK_CURVE_NAME);
        ALL_FIELDS.add(Constants.CHECK_SUM);
        ALL_FIELDS.add(Constants.LEG_BENCHMARK_PRICE);
        ALL_FIELDS.add(Constants.REDEMPTION_DATE);
        ALL_FIELDS.add(Constants.LEG_CURRENCY_RATIO);
        ALL_FIELDS.add(Constants.NO_SIDE_TRD_REG_T_S);
        ALL_FIELDS.add(Constants.QUOTE_RESP_TYPE);
        ALL_FIELDS.add(Constants.LEG_BENCHMARK_CURVE_POINT);
        ALL_FIELDS.add(Constants.NO_EXPIRATION);
        ALL_FIELDS.add(Constants.SECURITY_TYPE);
        ALL_FIELDS.add(Constants.UNDERLYING_EXERCISE_STYLE);
        ALL_FIELDS.add(Constants.EXERCISE_METHOD);
        ALL_FIELDS.add(Constants.POS_REQ_ID);
        ALL_FIELDS.add(Constants.NO_STRIKE_RULES);
        ALL_FIELDS.add(Constants.STAND_INST_DB_TYPE);
        ALL_FIELDS.add(Constants.ALLOC_LINK_ID);
        ALL_FIELDS.add(Constants.MIN_OFFER_SIZE);
        ALL_FIELDS.add(Constants.MATCH_ALGORITHM);
        ALL_FIELDS.add(Constants.LEG_COUNTRY_OF_ISSUE);
        ALL_FIELDS.add(Constants.SETTL_INST_MSG_ID);
        ALL_FIELDS.add(Constants.NO_UNDERLYING_SECURITY_ALT_ID);
        ALL_FIELDS.add(Constants.CONT_AMT_TYPE);
        ALL_FIELDS.add(Constants.REFERENCE_PAGE);
        ALL_FIELDS.add(Constants.LEG_INDIVIDUAL_ALLOC_ID);
        ALL_FIELDS.add(Constants.COLL_RPT_ID);
        ALL_FIELDS.add(Constants.DERIVATIVE_SECURITY_ID);
        ALL_FIELDS.add(Constants.EX_DATE);
        ALL_FIELDS.add(Constants.TRADE_DATE);
        ALL_FIELDS.add(Constants.PEG_PRICE_TYPE);
        ALL_FIELDS.add(Constants.RPT_SYS);
        ALL_FIELDS.add(Constants.NO_MARKET_SEGMENTS);
        ALL_FIELDS.add(Constants.INDIVIDUAL_ALLOC_REJ_CODE);
        ALL_FIELDS.add(Constants.REF_APPL_REQ_ID);
        ALL_FIELDS.add(Constants.ORD_STATUS_REQ_ID);
        ALL_FIELDS.add(Constants.DERIVATIVE_SECURITY_ID_SOURCE);
        ALL_FIELDS.add(Constants.ROUTING_TYPE);
        ALL_FIELDS.add(Constants.APPL_QUEUE_ACTION);
        ALL_FIELDS.add(Constants.ENCODED_SUBJECT_LEN);
        ALL_FIELDS.add(Constants.DERIVATIVE_STRIKE_CURRENCY);
        ALL_FIELDS.add(Constants.TRD_RPT_STATUS);
        ALL_FIELDS.add(Constants.BENCHMARK_PRICE_TYPE);
        ALL_FIELDS.add(Constants.BID_SWAP_POINTS);
        ALL_FIELDS.add(Constants.DISPLAY_WHEN);
        ALL_FIELDS.add(Constants.COMPLEX_EVENT_END_TIME);
        ALL_FIELDS.add(Constants.PRIORITY_INDICATOR);
        ALL_FIELDS.add(Constants.AGGRESSOR_INDICATOR);
        ALL_FIELDS.add(Constants.ENCODED_LIST_EXEC_INST_LEN);
        ALL_FIELDS.add(Constants.SECURITY_LIST_REQUEST_TYPE);
        ALL_FIELDS.add(Constants.ALLOC_TYPE);
        ALL_FIELDS.add(Constants.NO_STRIKES);
        ALL_FIELDS.add(Constants.NO_NESTED4_PARTY_IDS);
        ALL_FIELDS.add(Constants.COMM_TYPE);
        ALL_FIELDS.add(Constants.QTY_TYPE);
        ALL_FIELDS.add(Constants.EXEC_RESTATEMENT_REASON);
        ALL_FIELDS.add(Constants.LEG_BENCHMARK_CURVE_CURRENCY);
        ALL_FIELDS.add(Constants.SIGNATURE_LENGTH);
        ALL_FIELDS.add(Constants.NO_COMP_IDS);
        ALL_FIELDS.add(Constants.APPL_REPORT_ID);
        ALL_FIELDS.add(Constants.CONTRACT_MULTIPLIER);
        ALL_FIELDS.add(Constants.XML_DATA);
        ALL_FIELDS.add(Constants.PEGGED_REF_PRICE);
        ALL_FIELDS.add(Constants.SETTL_PRICE_TYPE);
        ALL_FIELDS.add(Constants.MULTI_LEG_REPORTING_TYPE);
        ALL_FIELDS.add(Constants.RATE_SOURCE);
        ALL_FIELDS.add(Constants.SECONDARY_PRICE_LIMIT_TYPE);
        ALL_FIELDS.add(Constants.LAST_FORWARD_POINTS);
        ALL_FIELDS.add(Constants.CARD_NUMBER);
        ALL_FIELDS.add(Constants.SECONDARY_TRADE_REPORT_REF_ID);
        ALL_FIELDS.add(Constants.SECONDARY_INDIVIDUAL_ALLOC_ID);
        ALL_FIELDS.add(Constants.DERIVATIVE_STRIKE_PRICE);
        ALL_FIELDS.add(Constants.ORDER_DELAY_UNIT);
        ALL_FIELDS.add(Constants.TRADE_REQUEST_ID);
        ALL_FIELDS.add(Constants.ORDER_ID);
        ALL_FIELDS.add(Constants.NO_NESTED3_PARTY_SUB_IDS);
        ALL_FIELDS.add(Constants.START_DATE);
        ALL_FIELDS.add(Constants.LEG_REPORT_ID);
        ALL_FIELDS.add(Constants.LEG_ALLOC_SETTL_CURRENCY);
        ALL_FIELDS.add(Constants.END_ACCRUED_INTEREST_AMT);
        ALL_FIELDS.add(Constants.ORD_STATUS);
        ALL_FIELDS.add(Constants.NO_ORDERS);
        ALL_FIELDS.add(Constants.EVENT_TEXT);
        ALL_FIELDS.add(Constants.PREV_CLOSE_PX);
        ALL_FIELDS.add(Constants.APPL_END_SEQ_NUM);
        ALL_FIELDS.add(Constants.UNDERLYING_PRICE_UNIT_OF_MEASURE_QTY);
        ALL_FIELDS.add(Constants.LAST_FORWARD_POINTS2);
        ALL_FIELDS.add(Constants.NO_SETTL_DETAILS);
        ALL_FIELDS.add(Constants.SECURITY_LIST_ID);
        ALL_FIELDS.add(Constants.BENCHMARK_CURVE_CURRENCY);
        ALL_FIELDS.add(Constants.REPURCHASE_RATE);
        ALL_FIELDS.add(Constants.COMPLIANCE_ID);
        ALL_FIELDS.add(Constants.LEG_PRICE_UNIT_OF_MEASURE_QTY);
        ALL_FIELDS.add(Constants.UNDERLYING_UNIT_OF_MEASURE);
        ALL_FIELDS.add(Constants.DERIVATIVE_STATE_OR_PROVINCE_OF_ISSUE);
        ALL_FIELDS.add(Constants.ROUNDING_MODULUS);
        ALL_FIELDS.add(Constants.CASH_OUTSTANDING);
        ALL_FIELDS.add(Constants.PROCESS_CODE);
        ALL_FIELDS.add(Constants.YIELD_TYPE);
        ALL_FIELDS.add(Constants.BID_FORWARD_POINTS2);
        ALL_FIELDS.add(Constants.TRD_REG_TIMESTAMP_TYPE);
        ALL_FIELDS.add(Constants.ORDER_AVG_PX);
        ALL_FIELDS.add(Constants.SETTLEMENT_CYCLE_NO);
        ALL_FIELDS.add(Constants.DERIVATIVE_PRICE_UNIT_OF_MEASURE);
        ALL_FIELDS.add(Constants.ORIG_CROSS_ID);
        ALL_FIELDS.add(Constants.MESSAGE_EVENT_SOURCE);
        ALL_FIELDS.add(Constants.M_D_ENTRY_ID);
        ALL_FIELDS.add(Constants.DERIVATIVE_N_T_POSITION_LIMIT);
        ALL_FIELDS.add(Constants.QUOTE_REQ_ID);
        ALL_FIELDS.add(Constants.NESTED_PARTY_ROLE);
        ALL_FIELDS.add(Constants.APPL_LAST_SEQ_NUM);
        ALL_FIELDS.add(Constants.DISCRETION_SCOPE);
        ALL_FIELDS.add(Constants.SECURITY_REPORT_ID);
        ALL_FIELDS.add(Constants.UNDERLYING_SECURITY_ID);
        ALL_FIELDS.add(Constants.OWNERSHIP_TYPE);
        ALL_FIELDS.add(Constants.UNDERLYING_OPT_ATTRIBUTE);
        ALL_FIELDS.add(Constants.UNDERLYING_LEG_STRIKE_PRICE);
        ALL_FIELDS.add(Constants.OUT_MAIN_CNTRY_U_INDEX);
        ALL_FIELDS.add(Constants.LAST_FRAGMENT);
        ALL_FIELDS.add(Constants.NO_EXEC_INST_RULES);
        ALL_FIELDS.add(Constants.M_D_ORIGIN_TYPE);
        ALL_FIELDS.add(Constants.NO_TICK_RULES);
        ALL_FIELDS.add(Constants.SIDE_SETTL_CURRENCY);
        ALL_FIELDS.add(Constants.SETTL_PARTY_ROLE);
        ALL_FIELDS.add(Constants.EXPIRATION_QTY_TYPE);
        ALL_FIELDS.add(Constants.INSTRUMENT_PARTY_ID_SOURCE);
        ALL_FIELDS.add(Constants.ENCODED_UNDERLYING_SECURITY_DESC_LEN);
        ALL_FIELDS.add(Constants.LEG_BID_PX);
        ALL_FIELDS.add(Constants.M_D_SUB_BOOK_TYPE);
        ALL_FIELDS.add(Constants.MSG_DIRECTION);
        ALL_FIELDS.add(Constants.M_D_ENTRY_SPOT_RATE);
        ALL_FIELDS.add(Constants.DERIVATIVE_STRIKE_VALUE);
        ALL_FIELDS.add(Constants.REGIST_EMAIL);
        ALL_FIELDS.add(Constants.YIELD_REDEMPTION_PRICE);
        ALL_FIELDS.add(Constants.APPL_EXT_ID);
        ALL_FIELDS.add(Constants.NO_TARGET_PARTY_IDS);
        ALL_FIELDS.add(Constants.COMPLEX_EVENT_CONDITION);
        ALL_FIELDS.add(Constants.ALLOC_CANC_REPLACE_REASON);
        ALL_FIELDS.add(Constants.APPL_RESPONSE_ERROR);
        ALL_FIELDS.add(Constants.SECURITY_DESC);
        ALL_FIELDS.add(Constants.M_D_BOOK_TYPE);
        ALL_FIELDS.add(Constants.SIDE_GROSS_TRADE_AMT);
        ALL_FIELDS.add(Constants.NO_SETTL_PARTY_SUB_IDS);
        ALL_FIELDS.add(Constants.LAST_PAR_PX);
        ALL_FIELDS.add(Constants.TRIGGER_SECURITY_DESC);
        ALL_FIELDS.add(Constants.REF_MSG_TYPE);
        ALL_FIELDS.add(Constants.QUANTITY);
        ALL_FIELDS.add(Constants.MAX_SHOW);
        ALL_FIELDS.add(Constants.DATED_DATE);
        ALL_FIELDS.add(Constants.SESSION_REJECT_REASON);
        ALL_FIELDS.add(Constants.MATURITY_DATE);
        ALL_FIELDS.add(Constants.PRE_TRADE_ANONYMITY);
        ALL_FIELDS.add(Constants.MISC_FEE_TYPE);
        ALL_FIELDS.add(Constants.SIGNATURE);
        ALL_FIELDS.add(Constants.UNDERLYING_LEG_SECURITY_ALT_ID);
        ALL_FIELDS.add(Constants.UNDERLYING_SECURITY_SUB_TYPE);
    }

}
