/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2.decoder;

import org.agrona.AsciiNumberFormatException;
import org.agrona.MutableDirectBuffer;
import org.agrona.AsciiSequenceView;
import static uk.co.real_logic.artio.dictionary.generation.CodecUtil.*;
import static uk.co.real_logic.artio.dictionary.SessionConstants.*;
import uk.co.real_logic.artio.builder.Decoder;
import uk.co.real_logic.artio.fields.DecimalFloat;
import uk.co.real_logic.artio.util.MutableAsciiBuffer;
import uk.co.real_logic.artio.util.AsciiBuffer;
import uk.co.real_logic.artio.fields.LocalMktDateEncoder;
import uk.co.real_logic.artio.fields.UtcTimestampEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import uk.co.real_logic.artio.dictionary.CharArraySet;
import org.agrona.collections.IntHashSet;
import org.agrona.collections.IntHashSet.IntIterator;
import uk.co.real_logic.artio.EncodingException;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import uk.co.real_logic.artio.builder.Encoder;
import uk.co.real_logic.artio.builder.CommonDecoderImpl;
import static java.nio.charset.StandardCharsets.US_ASCII;
import static uk.co.real_logic.artio.builder.Validation.CODEC_VALIDATION_ENABLED;
import static uk.co.real_logic.artio.builder.RejectUnknownField.CODEC_REJECT_UNKNOWN_FIELD_ENABLED;
import static uk.co.real_logic.artio.builder.RejectUnknownEnumValue.CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED;
import com.swiftalgo.ms.codecs.fix50sp2.*;
import com.swiftalgo.ms.codecs.fix50sp2.builder.ListOrdGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.ListOrdGrpEncoder.OrdersGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.PartiesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.PartiesEncoder.PartyIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.PtysSubGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.PtysSubGrpEncoder.PartySubIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.PreAllocGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.PreAllocGrpEncoder.AllocsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.NestedPartiesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.NestedPartiesEncoder.NestedPartyIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.NstdPtysSubGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.NstdPtysSubGrpEncoder.NestedPartySubIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.DisplayInstructionEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.TrdgSesGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.TrdgSesGrpEncoder.TradingSessionsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.InstrumentEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.SecAltIDGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.SecAltIDGrpEncoder.SecurityAltIDGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.SecurityXMLEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.EvntGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.EvntGrpEncoder.EventsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.InstrumentPartiesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.InstrumentPartiesEncoder.InstrumentPartiesGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.InstrumentPtysSubGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.InstrumentPtysSubGrpEncoder.InstrumentPartySubIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.ComplexEventsEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.ComplexEventsEncoder.ComplexEventsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.ComplexEventDatesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.ComplexEventDatesEncoder.ComplexEventDatesGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.ComplexEventTimesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.ComplexEventTimesEncoder.ComplexEventTimesGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.UndInstrmtGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.UndInstrmtGrpEncoder.UnderlyingsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.UnderlyingInstrumentEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.UndSecAltIDGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.UndSecAltIDGrpEncoder.UnderlyingSecurityAltIDGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.UnderlyingStipulationsEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.UnderlyingStipulationsEncoder.UnderlyingStipsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.UndlyInstrumentPartiesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.UndlyInstrumentPartiesEncoder.UndlyInstrumentPartiesGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.UndlyInstrumentPtysSubGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.UndlyInstrumentPtysSubGrpEncoder.UndlyInstrumentPartySubIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.StipulationsEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.StipulationsEncoder.StipulationsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.OrderQtyDataEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.TriggeringInstructionEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.SpreadOrBenchmarkCurveDataEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.YieldDataEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.CommissionDataEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.PegInstructionsEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.DiscretionInstructionsEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.StrategyParametersGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.StrategyParametersGrpEncoder.StrategyParametersGroupEncoder;

public interface ListOrdGrpDecoder 
{



public class OrdersGroupDecoder extends CommonDecoderImpl implements PartiesDecoder, PreAllocGrpDecoder, DisplayInstructionDecoder, TrdgSesGrpDecoder, InstrumentDecoder, UndInstrmtGrpDecoder, StipulationsDecoder, OrderQtyDataDecoder, TriggeringInstructionDecoder, SpreadOrBenchmarkCurveDataDecoder, YieldDataDecoder, CommissionDataDecoder, PegInstructionsDecoder, DiscretionInstructionsDecoder, StrategyParametersGrpDecoder
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(6);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            REQUIRED_FIELDS.add(Constants.CL_ORD_ID);
            REQUIRED_FIELDS.add(Constants.LIST_SEQ_NO);
            REQUIRED_FIELDS.add(Constants.SIDE);
        }
    }

    public final IntHashSet GROUP_FIELDS = new IntHashSet(436);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            GROUP_FIELDS.add(Constants.CL_ORD_ID);
            GROUP_FIELDS.add(Constants.SECONDARY_CL_ORD_ID);
            GROUP_FIELDS.add(Constants.LIST_SEQ_NO);
            GROUP_FIELDS.add(Constants.CL_ORD_LINK_ID);
            GROUP_FIELDS.add(Constants.SETTL_INST_MODE);
            GROUP_FIELDS.add(Constants.TRADE_ORIGINATION_DATE);
            GROUP_FIELDS.add(Constants.TRADE_DATE);
            GROUP_FIELDS.add(Constants.ACCOUNT);
            GROUP_FIELDS.add(Constants.ACCT_ID_SOURCE);
            GROUP_FIELDS.add(Constants.ACCOUNT_TYPE);
            GROUP_FIELDS.add(Constants.DAY_BOOKING_INST);
            GROUP_FIELDS.add(Constants.BOOKING_UNIT);
            GROUP_FIELDS.add(Constants.ALLOC_ID);
            GROUP_FIELDS.add(Constants.PREALLOC_METHOD);
            GROUP_FIELDS.add(Constants.SETTL_TYPE);
            GROUP_FIELDS.add(Constants.SETTL_DATE);
            GROUP_FIELDS.add(Constants.CASH_MARGIN);
            GROUP_FIELDS.add(Constants.CLEARING_FEE_INDICATOR);
            GROUP_FIELDS.add(Constants.HANDL_INST);
            GROUP_FIELDS.add(Constants.EXEC_INST);
            GROUP_FIELDS.add(Constants.MIN_QTY);
            GROUP_FIELDS.add(Constants.MATCH_INCREMENT);
            GROUP_FIELDS.add(Constants.MAX_PRICE_LEVELS);
            GROUP_FIELDS.add(Constants.DISPLAY_QTY);
            GROUP_FIELDS.add(Constants.SECONDARY_DISPLAY_QTY);
            GROUP_FIELDS.add(Constants.DISPLAY_WHEN);
            GROUP_FIELDS.add(Constants.DISPLAY_METHOD);
            GROUP_FIELDS.add(Constants.DISPLAY_LOW_QTY);
            GROUP_FIELDS.add(Constants.DISPLAY_HIGH_QTY);
            GROUP_FIELDS.add(Constants.DISPLAY_MIN_INCR);
            GROUP_FIELDS.add(Constants.REFRESH_QTY);
            GROUP_FIELDS.add(Constants.MAX_FLOOR);
            GROUP_FIELDS.add(Constants.EX_DESTINATION);
            GROUP_FIELDS.add(Constants.EX_DESTINATION_ID_SOURCE);
            GROUP_FIELDS.add(Constants.PROCESS_CODE);
            GROUP_FIELDS.add(Constants.SYMBOL);
            GROUP_FIELDS.add(Constants.SYMBOL_SFX);
            GROUP_FIELDS.add(Constants.SECURITY_ID);
            GROUP_FIELDS.add(Constants.SECURITY_ID_SOURCE);
            GROUP_FIELDS.add(Constants.PRODUCT);
            GROUP_FIELDS.add(Constants.PRODUCT_COMPLEX);
            GROUP_FIELDS.add(Constants.SECURITY_GROUP);
            GROUP_FIELDS.add(Constants.C_F_I_CODE);
            GROUP_FIELDS.add(Constants.SECURITY_TYPE);
            GROUP_FIELDS.add(Constants.SECURITY_SUB_TYPE);
            GROUP_FIELDS.add(Constants.MATURITY_MONTH_YEAR);
            GROUP_FIELDS.add(Constants.MATURITY_DATE);
            GROUP_FIELDS.add(Constants.MATURITY_TIME);
            GROUP_FIELDS.add(Constants.SETTLE_ON_OPEN_FLAG);
            GROUP_FIELDS.add(Constants.INSTRMT_ASSIGNMENT_METHOD);
            GROUP_FIELDS.add(Constants.SECURITY_STATUS);
            GROUP_FIELDS.add(Constants.COUPON_PAYMENT_DATE);
            GROUP_FIELDS.add(Constants.RESTRUCTURING_TYPE);
            GROUP_FIELDS.add(Constants.SENIORITY);
            GROUP_FIELDS.add(Constants.NOTIONAL_PERCENTAGE_OUTSTANDING);
            GROUP_FIELDS.add(Constants.ORIGINAL_NOTIONAL_PERCENTAGE_OUTSTANDING);
            GROUP_FIELDS.add(Constants.ATTACHMENT_POINT);
            GROUP_FIELDS.add(Constants.DETACHMENT_POINT);
            GROUP_FIELDS.add(Constants.ISSUE_DATE);
            GROUP_FIELDS.add(Constants.REPO_COLLATERAL_SECURITY_TYPE);
            GROUP_FIELDS.add(Constants.REPURCHASE_TERM);
            GROUP_FIELDS.add(Constants.REPURCHASE_RATE);
            GROUP_FIELDS.add(Constants.FACTOR);
            GROUP_FIELDS.add(Constants.CREDIT_RATING);
            GROUP_FIELDS.add(Constants.INSTR_REGISTRY);
            GROUP_FIELDS.add(Constants.COUNTRY_OF_ISSUE);
            GROUP_FIELDS.add(Constants.STATE_OR_PROVINCE_OF_ISSUE);
            GROUP_FIELDS.add(Constants.LOCALE_OF_ISSUE);
            GROUP_FIELDS.add(Constants.REDEMPTION_DATE);
            GROUP_FIELDS.add(Constants.STRIKE_PRICE);
            GROUP_FIELDS.add(Constants.STRIKE_CURRENCY);
            GROUP_FIELDS.add(Constants.STRIKE_MULTIPLIER);
            GROUP_FIELDS.add(Constants.STRIKE_VALUE);
            GROUP_FIELDS.add(Constants.STRIKE_PRICE_DETERMINATION_METHOD);
            GROUP_FIELDS.add(Constants.STRIKE_PRICE_BOUNDARY_METHOD);
            GROUP_FIELDS.add(Constants.STRIKE_PRICE_BOUNDARY_PRECISION);
            GROUP_FIELDS.add(Constants.UNDERLYING_PRICE_DETERMINATION_METHOD);
            GROUP_FIELDS.add(Constants.OPT_ATTRIBUTE);
            GROUP_FIELDS.add(Constants.CONTRACT_MULTIPLIER);
            GROUP_FIELDS.add(Constants.CONTRACT_MULTIPLIER_UNIT);
            GROUP_FIELDS.add(Constants.FLOW_SCHEDULE_TYPE);
            GROUP_FIELDS.add(Constants.MIN_PRICE_INCREMENT);
            GROUP_FIELDS.add(Constants.MIN_PRICE_INCREMENT_AMOUNT);
            GROUP_FIELDS.add(Constants.UNIT_OF_MEASURE);
            GROUP_FIELDS.add(Constants.UNIT_OF_MEASURE_QTY);
            GROUP_FIELDS.add(Constants.PRICE_UNIT_OF_MEASURE);
            GROUP_FIELDS.add(Constants.PRICE_UNIT_OF_MEASURE_QTY);
            GROUP_FIELDS.add(Constants.SETTL_METHOD);
            GROUP_FIELDS.add(Constants.EXERCISE_STYLE);
            GROUP_FIELDS.add(Constants.OPT_PAYOUT_TYPE);
            GROUP_FIELDS.add(Constants.OPT_PAYOUT_AMOUNT);
            GROUP_FIELDS.add(Constants.PRICE_QUOTE_METHOD);
            GROUP_FIELDS.add(Constants.VALUATION_METHOD);
            GROUP_FIELDS.add(Constants.LIST_METHOD);
            GROUP_FIELDS.add(Constants.CAP_PRICE);
            GROUP_FIELDS.add(Constants.FLOOR_PRICE);
            GROUP_FIELDS.add(Constants.PUT_OR_CALL);
            GROUP_FIELDS.add(Constants.FLEXIBLE_INDICATOR);
            GROUP_FIELDS.add(Constants.FLEX_PRODUCT_ELIGIBILITY_INDICATOR);
            GROUP_FIELDS.add(Constants.TIME_UNIT);
            GROUP_FIELDS.add(Constants.COUPON_RATE);
            GROUP_FIELDS.add(Constants.SECURITY_EXCHANGE);
            GROUP_FIELDS.add(Constants.POSITION_LIMIT);
            GROUP_FIELDS.add(Constants.N_T_POSITION_LIMIT);
            GROUP_FIELDS.add(Constants.ISSUER);
            GROUP_FIELDS.add(Constants.ENCODED_ISSUER_LEN);
            GROUP_FIELDS.add(Constants.ENCODED_ISSUER);
            GROUP_FIELDS.add(Constants.SECURITY_DESC);
            GROUP_FIELDS.add(Constants.ENCODED_SECURITY_DESC_LEN);
            GROUP_FIELDS.add(Constants.ENCODED_SECURITY_DESC);
            GROUP_FIELDS.add(Constants.SECURITY_X_M_L_LEN);
            GROUP_FIELDS.add(Constants.SECURITY_X_M_L);
            GROUP_FIELDS.add(Constants.SECURITY_X_M_L_SCHEMA);
            GROUP_FIELDS.add(Constants.POOL);
            GROUP_FIELDS.add(Constants.CONTRACT_SETTL_MONTH);
            GROUP_FIELDS.add(Constants.C_P_PROGRAM);
            GROUP_FIELDS.add(Constants.C_P_REG_TYPE);
            GROUP_FIELDS.add(Constants.DATED_DATE);
            GROUP_FIELDS.add(Constants.INTEREST_ACCRUAL_DATE);
            GROUP_FIELDS.add(Constants.PREV_CLOSE_PX);
            GROUP_FIELDS.add(Constants.SIDE);
            GROUP_FIELDS.add(Constants.SIDE_VALUE_IND);
            GROUP_FIELDS.add(Constants.LOCATE_REQD);
            GROUP_FIELDS.add(Constants.TRANSACT_TIME);
            GROUP_FIELDS.add(Constants.QTY_TYPE);
            GROUP_FIELDS.add(Constants.ORDER_QTY);
            GROUP_FIELDS.add(Constants.CASH_ORDER_QTY);
            GROUP_FIELDS.add(Constants.ORDER_PERCENT);
            GROUP_FIELDS.add(Constants.ROUNDING_DIRECTION);
            GROUP_FIELDS.add(Constants.ROUNDING_MODULUS);
            GROUP_FIELDS.add(Constants.ORD_TYPE);
            GROUP_FIELDS.add(Constants.PRICE_TYPE);
            GROUP_FIELDS.add(Constants.PRICE);
            GROUP_FIELDS.add(Constants.PRICE_PROTECTION_SCOPE);
            GROUP_FIELDS.add(Constants.STOP_PX);
            GROUP_FIELDS.add(Constants.TRIGGER_TYPE);
            GROUP_FIELDS.add(Constants.TRIGGER_ACTION);
            GROUP_FIELDS.add(Constants.TRIGGER_PRICE);
            GROUP_FIELDS.add(Constants.TRIGGER_SYMBOL);
            GROUP_FIELDS.add(Constants.TRIGGER_SECURITY_ID);
            GROUP_FIELDS.add(Constants.TRIGGER_SECURITY_ID_SOURCE);
            GROUP_FIELDS.add(Constants.TRIGGER_SECURITY_DESC);
            GROUP_FIELDS.add(Constants.TRIGGER_PRICE_TYPE);
            GROUP_FIELDS.add(Constants.TRIGGER_PRICE_TYPE_SCOPE);
            GROUP_FIELDS.add(Constants.TRIGGER_PRICE_DIRECTION);
            GROUP_FIELDS.add(Constants.TRIGGER_NEW_PRICE);
            GROUP_FIELDS.add(Constants.TRIGGER_ORDER_TYPE);
            GROUP_FIELDS.add(Constants.TRIGGER_NEW_QTY);
            GROUP_FIELDS.add(Constants.TRIGGER_TRADING_SESSION_ID);
            GROUP_FIELDS.add(Constants.TRIGGER_TRADING_SESSION_SUB_ID);
            GROUP_FIELDS.add(Constants.SPREAD);
            GROUP_FIELDS.add(Constants.BENCHMARK_CURVE_CURRENCY);
            GROUP_FIELDS.add(Constants.BENCHMARK_CURVE_NAME);
            GROUP_FIELDS.add(Constants.BENCHMARK_CURVE_POINT);
            GROUP_FIELDS.add(Constants.BENCHMARK_PRICE);
            GROUP_FIELDS.add(Constants.BENCHMARK_PRICE_TYPE);
            GROUP_FIELDS.add(Constants.BENCHMARK_SECURITY_ID);
            GROUP_FIELDS.add(Constants.BENCHMARK_SECURITY_ID_SOURCE);
            GROUP_FIELDS.add(Constants.YIELD_TYPE);
            GROUP_FIELDS.add(Constants.YIELD);
            GROUP_FIELDS.add(Constants.YIELD_CALC_DATE);
            GROUP_FIELDS.add(Constants.YIELD_REDEMPTION_DATE);
            GROUP_FIELDS.add(Constants.YIELD_REDEMPTION_PRICE);
            GROUP_FIELDS.add(Constants.YIELD_REDEMPTION_PRICE_TYPE);
            GROUP_FIELDS.add(Constants.CURRENCY);
            GROUP_FIELDS.add(Constants.COMPLIANCE_ID);
            GROUP_FIELDS.add(Constants.SOLICITED_FLAG);
            GROUP_FIELDS.add(Constants.I_O_I_ID);
            GROUP_FIELDS.add(Constants.QUOTE_ID);
            GROUP_FIELDS.add(Constants.REF_ORDER_ID);
            GROUP_FIELDS.add(Constants.REF_ORDER_ID_SOURCE);
            GROUP_FIELDS.add(Constants.TIME_IN_FORCE);
            GROUP_FIELDS.add(Constants.EFFECTIVE_TIME);
            GROUP_FIELDS.add(Constants.EXPIRE_DATE);
            GROUP_FIELDS.add(Constants.EXPIRE_TIME);
            GROUP_FIELDS.add(Constants.G_T_BOOKING_INST);
            GROUP_FIELDS.add(Constants.COMMISSION);
            GROUP_FIELDS.add(Constants.COMM_TYPE);
            GROUP_FIELDS.add(Constants.COMM_CURRENCY);
            GROUP_FIELDS.add(Constants.FUND_RENEW_WAIV);
            GROUP_FIELDS.add(Constants.ORDER_CAPACITY);
            GROUP_FIELDS.add(Constants.ORDER_RESTRICTIONS);
            GROUP_FIELDS.add(Constants.PRE_TRADE_ANONYMITY);
            GROUP_FIELDS.add(Constants.CUST_ORDER_CAPACITY);
            GROUP_FIELDS.add(Constants.FOREX_REQ);
            GROUP_FIELDS.add(Constants.SETTL_CURRENCY);
            GROUP_FIELDS.add(Constants.BOOKING_TYPE);
            GROUP_FIELDS.add(Constants.TEXT);
            GROUP_FIELDS.add(Constants.ENCODED_TEXT_LEN);
            GROUP_FIELDS.add(Constants.ENCODED_TEXT);
            GROUP_FIELDS.add(Constants.SETTL_DATE2);
            GROUP_FIELDS.add(Constants.ORDER_QTY2);
            GROUP_FIELDS.add(Constants.PRICE2);
            GROUP_FIELDS.add(Constants.POSITION_EFFECT);
            GROUP_FIELDS.add(Constants.COVERED_OR_UNCOVERED);
            GROUP_FIELDS.add(Constants.MAX_SHOW);
            GROUP_FIELDS.add(Constants.PEG_OFFSET_VALUE);
            GROUP_FIELDS.add(Constants.PEG_PRICE_TYPE);
            GROUP_FIELDS.add(Constants.PEG_MOVE_TYPE);
            GROUP_FIELDS.add(Constants.PEG_OFFSET_TYPE);
            GROUP_FIELDS.add(Constants.PEG_LIMIT_TYPE);
            GROUP_FIELDS.add(Constants.PEG_ROUND_DIRECTION);
            GROUP_FIELDS.add(Constants.PEG_SCOPE);
            GROUP_FIELDS.add(Constants.PEG_SECURITY_ID_SOURCE);
            GROUP_FIELDS.add(Constants.PEG_SECURITY_ID);
            GROUP_FIELDS.add(Constants.PEG_SYMBOL);
            GROUP_FIELDS.add(Constants.PEG_SECURITY_DESC);
            GROUP_FIELDS.add(Constants.DISCRETION_INST);
            GROUP_FIELDS.add(Constants.DISCRETION_OFFSET_VALUE);
            GROUP_FIELDS.add(Constants.DISCRETION_MOVE_TYPE);
            GROUP_FIELDS.add(Constants.DISCRETION_OFFSET_TYPE);
            GROUP_FIELDS.add(Constants.DISCRETION_LIMIT_TYPE);
            GROUP_FIELDS.add(Constants.DISCRETION_ROUND_DIRECTION);
            GROUP_FIELDS.add(Constants.DISCRETION_SCOPE);
            GROUP_FIELDS.add(Constants.TARGET_STRATEGY);
            GROUP_FIELDS.add(Constants.TARGET_STRATEGY_PARAMETERS);
            GROUP_FIELDS.add(Constants.PARTICIPATION_RATE);
            GROUP_FIELDS.add(Constants.DESIGNATION);
        }
    }

    public final IntHashSet ALL_GROUP_FIELDS = new IntHashSet(140);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            ALL_GROUP_FIELDS.add(Constants.CL_ORD_ID);
            ALL_GROUP_FIELDS.add(Constants.SECONDARY_CL_ORD_ID);
            ALL_GROUP_FIELDS.add(Constants.LIST_SEQ_NO);
            ALL_GROUP_FIELDS.add(Constants.CL_ORD_LINK_ID);
            ALL_GROUP_FIELDS.add(Constants.SETTL_INST_MODE);
            ALL_GROUP_FIELDS.add(Constants.TRADE_ORIGINATION_DATE);
            ALL_GROUP_FIELDS.add(Constants.TRADE_DATE);
            ALL_GROUP_FIELDS.add(Constants.ACCOUNT);
            ALL_GROUP_FIELDS.add(Constants.ACCT_ID_SOURCE);
            ALL_GROUP_FIELDS.add(Constants.ACCOUNT_TYPE);
            ALL_GROUP_FIELDS.add(Constants.DAY_BOOKING_INST);
            ALL_GROUP_FIELDS.add(Constants.BOOKING_UNIT);
            ALL_GROUP_FIELDS.add(Constants.ALLOC_ID);
            ALL_GROUP_FIELDS.add(Constants.PREALLOC_METHOD);
            ALL_GROUP_FIELDS.add(Constants.SETTL_TYPE);
            ALL_GROUP_FIELDS.add(Constants.SETTL_DATE);
            ALL_GROUP_FIELDS.add(Constants.CASH_MARGIN);
            ALL_GROUP_FIELDS.add(Constants.CLEARING_FEE_INDICATOR);
            ALL_GROUP_FIELDS.add(Constants.HANDL_INST);
            ALL_GROUP_FIELDS.add(Constants.EXEC_INST);
            ALL_GROUP_FIELDS.add(Constants.MIN_QTY);
            ALL_GROUP_FIELDS.add(Constants.MATCH_INCREMENT);
            ALL_GROUP_FIELDS.add(Constants.MAX_PRICE_LEVELS);
            ALL_GROUP_FIELDS.add(Constants.MAX_FLOOR);
            ALL_GROUP_FIELDS.add(Constants.EX_DESTINATION);
            ALL_GROUP_FIELDS.add(Constants.EX_DESTINATION_ID_SOURCE);
            ALL_GROUP_FIELDS.add(Constants.PROCESS_CODE);
            ALL_GROUP_FIELDS.add(Constants.PREV_CLOSE_PX);
            ALL_GROUP_FIELDS.add(Constants.SIDE);
            ALL_GROUP_FIELDS.add(Constants.SIDE_VALUE_IND);
            ALL_GROUP_FIELDS.add(Constants.LOCATE_REQD);
            ALL_GROUP_FIELDS.add(Constants.TRANSACT_TIME);
            ALL_GROUP_FIELDS.add(Constants.QTY_TYPE);
            ALL_GROUP_FIELDS.add(Constants.ORD_TYPE);
            ALL_GROUP_FIELDS.add(Constants.PRICE_TYPE);
            ALL_GROUP_FIELDS.add(Constants.PRICE);
            ALL_GROUP_FIELDS.add(Constants.PRICE_PROTECTION_SCOPE);
            ALL_GROUP_FIELDS.add(Constants.STOP_PX);
            ALL_GROUP_FIELDS.add(Constants.CURRENCY);
            ALL_GROUP_FIELDS.add(Constants.COMPLIANCE_ID);
            ALL_GROUP_FIELDS.add(Constants.SOLICITED_FLAG);
            ALL_GROUP_FIELDS.add(Constants.I_O_I_ID);
            ALL_GROUP_FIELDS.add(Constants.QUOTE_ID);
            ALL_GROUP_FIELDS.add(Constants.REF_ORDER_ID);
            ALL_GROUP_FIELDS.add(Constants.REF_ORDER_ID_SOURCE);
            ALL_GROUP_FIELDS.add(Constants.TIME_IN_FORCE);
            ALL_GROUP_FIELDS.add(Constants.EFFECTIVE_TIME);
            ALL_GROUP_FIELDS.add(Constants.EXPIRE_DATE);
            ALL_GROUP_FIELDS.add(Constants.EXPIRE_TIME);
            ALL_GROUP_FIELDS.add(Constants.G_T_BOOKING_INST);
            ALL_GROUP_FIELDS.add(Constants.ORDER_CAPACITY);
            ALL_GROUP_FIELDS.add(Constants.ORDER_RESTRICTIONS);
            ALL_GROUP_FIELDS.add(Constants.PRE_TRADE_ANONYMITY);
            ALL_GROUP_FIELDS.add(Constants.CUST_ORDER_CAPACITY);
            ALL_GROUP_FIELDS.add(Constants.FOREX_REQ);
            ALL_GROUP_FIELDS.add(Constants.SETTL_CURRENCY);
            ALL_GROUP_FIELDS.add(Constants.BOOKING_TYPE);
            ALL_GROUP_FIELDS.add(Constants.TEXT);
            ALL_GROUP_FIELDS.add(Constants.ENCODED_TEXT_LEN);
            ALL_GROUP_FIELDS.add(Constants.ENCODED_TEXT);
            ALL_GROUP_FIELDS.add(Constants.SETTL_DATE2);
            ALL_GROUP_FIELDS.add(Constants.ORDER_QTY2);
            ALL_GROUP_FIELDS.add(Constants.PRICE2);
            ALL_GROUP_FIELDS.add(Constants.POSITION_EFFECT);
            ALL_GROUP_FIELDS.add(Constants.COVERED_OR_UNCOVERED);
            ALL_GROUP_FIELDS.add(Constants.MAX_SHOW);
            ALL_GROUP_FIELDS.add(Constants.TARGET_STRATEGY);
            ALL_GROUP_FIELDS.add(Constants.TARGET_STRATEGY_PARAMETERS);
            ALL_GROUP_FIELDS.add(Constants.PARTICIPATION_RATE);
            ALL_GROUP_FIELDS.add(Constants.DESIGNATION);
        }
    }

    private final IntHashSet missingRequiredFields = new IntHashSet(6);

    public boolean validate()
    {
        if (rejectReason != Decoder.NO_ERROR)
        {
            return false;
        }
        final IntIterator missingFieldsIterator = missingRequiredFields.iterator();
        if (missingFieldsIterator.hasNext())
        {
            invalidTagId = missingFieldsIterator.nextValue();
            rejectReason = 1;
            return false;
        }
        if (hasSettlInstMode)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !SettlInstMode.isValid(settlInstMode()))
        {
            invalidTagId = 160;
            rejectReason = 5;
            return false;
        }
        }

        if (hasAcctIDSource)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !AcctIDSource.isValid(acctIDSource()))
        {
            invalidTagId = 660;
            rejectReason = 5;
            return false;
        }
        }

        if (hasAccountType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !AccountType.isValid(accountType()))
        {
            invalidTagId = 581;
            rejectReason = 5;
            return false;
        }
        }

        if (hasDayBookingInst)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !DayBookingInst.isValid(dayBookingInst()))
        {
            invalidTagId = 589;
            rejectReason = 5;
            return false;
        }
        }

        if (hasBookingUnit)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !BookingUnit.isValid(bookingUnit()))
        {
            invalidTagId = 590;
            rejectReason = 5;
            return false;
        }
        }

        if (hasPreallocMethod)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !PreallocMethod.isValid(preallocMethod()))
        {
            invalidTagId = 591;
            rejectReason = 5;
            return false;
        }
        }

        if (hasSettlType)
        {
        settlTypeWrapper.wrap(this.settlType(), settlTypeLength);
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !SettlType.isValid(settlTypeWrapper))
        {
            invalidTagId = 63;
            rejectReason = 5;
            return false;
        }
        }

        if (hasCashMargin)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !CashMargin.isValid(cashMargin()))
        {
            invalidTagId = 544;
            rejectReason = 5;
            return false;
        }
        }

        if (hasClearingFeeIndicator)
        {
        clearingFeeIndicatorWrapper.wrap(this.clearingFeeIndicator(), clearingFeeIndicatorLength);
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !ClearingFeeIndicator.isValid(clearingFeeIndicatorWrapper))
        {
            invalidTagId = 635;
            rejectReason = 5;
            return false;
        }
        }

        if (hasHandlInst)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !HandlInst.isValid(handlInst()))
        {
            invalidTagId = 21;
            rejectReason = 5;
            return false;
        }
        }

        if (hasExecInst)
        {
          int execInstOffset = 0;
          for (int i = 0; i < execInstLength; i++)
          {
              if (this.execInst()[i] == ' ')
              {
                  execInstWrapper.wrap(this.execInst(), execInstOffset, i - execInstOffset);
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !ExecInst.isValid(execInstWrapper))
        {
            invalidTagId = 18;
            rejectReason = 5;
            return false;
        }
                  execInstOffset = i + 1;
              }
          }
          execInstWrapper.wrap(this.execInst(), execInstOffset, execInstLength - execInstOffset);
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !ExecInst.isValid(execInstWrapper))
        {
            invalidTagId = 18;
            rejectReason = 5;
            return false;
        }
        }

        if (hasDisplayWhen)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !DisplayWhen.isValid(displayWhen()))
        {
            invalidTagId = 1083;
            rejectReason = 5;
            return false;
        }
        }

        if (hasDisplayMethod)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !DisplayMethod.isValid(displayMethod()))
        {
            invalidTagId = 1084;
            rejectReason = 5;
            return false;
        }
        }

        if (hasExDestinationIDSource)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !ExDestinationIDSource.isValid(exDestinationIDSource()))
        {
            invalidTagId = 1133;
            rejectReason = 5;
            return false;
        }
        }

        if (hasProcessCode)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !ProcessCode.isValid(processCode()))
        {
            invalidTagId = 81;
            rejectReason = 5;
            return false;
        }
        }

        if (hasSymbolSfx)
        {
        symbolSfxWrapper.wrap(this.symbolSfx(), symbolSfxLength);
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !SymbolSfx.isValid(symbolSfxWrapper))
        {
            invalidTagId = 65;
            rejectReason = 5;
            return false;
        }
        }

        if (hasSecurityIDSource)
        {
        securityIDSourceWrapper.wrap(this.securityIDSource(), securityIDSourceLength);
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !SecurityIDSource.isValid(securityIDSourceWrapper))
        {
            invalidTagId = 22;
            rejectReason = 5;
            return false;
        }
        }

        if (hasProduct)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !Product.isValid(product()))
        {
            invalidTagId = 460;
            rejectReason = 5;
            return false;
        }
        }

        if (hasSecurityType)
        {
        securityTypeWrapper.wrap(this.securityType(), securityTypeLength);
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !SecurityType.isValid(securityTypeWrapper))
        {
            invalidTagId = 167;
            rejectReason = 5;
            return false;
        }
        }

        if (hasSecurityStatus)
        {
        securityStatusWrapper.wrap(this.securityStatus(), securityStatusLength);
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !SecurityStatus.isValid(securityStatusWrapper))
        {
            invalidTagId = 965;
            rejectReason = 5;
            return false;
        }
        }

        if (hasRestructuringType)
        {
        restructuringTypeWrapper.wrap(this.restructuringType(), restructuringTypeLength);
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !RestructuringType.isValid(restructuringTypeWrapper))
        {
            invalidTagId = 1449;
            rejectReason = 5;
            return false;
        }
        }

        if (hasSeniority)
        {
        seniorityWrapper.wrap(this.seniority(), seniorityLength);
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !Seniority.isValid(seniorityWrapper))
        {
            invalidTagId = 1450;
            rejectReason = 5;
            return false;
        }
        }

        if (hasStrikePriceDeterminationMethod)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !StrikePriceDeterminationMethod.isValid(strikePriceDeterminationMethod()))
        {
            invalidTagId = 1478;
            rejectReason = 5;
            return false;
        }
        }

        if (hasStrikePriceBoundaryMethod)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !StrikePriceBoundaryMethod.isValid(strikePriceBoundaryMethod()))
        {
            invalidTagId = 1479;
            rejectReason = 5;
            return false;
        }
        }

        if (hasUnderlyingPriceDeterminationMethod)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !UnderlyingPriceDeterminationMethod.isValid(underlyingPriceDeterminationMethod()))
        {
            invalidTagId = 1481;
            rejectReason = 5;
            return false;
        }
        }

        if (hasContractMultiplierUnit)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !ContractMultiplierUnit.isValid(contractMultiplierUnit()))
        {
            invalidTagId = 1435;
            rejectReason = 5;
            return false;
        }
        }

        if (hasFlowScheduleType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !FlowScheduleType.isValid(flowScheduleType()))
        {
            invalidTagId = 1439;
            rejectReason = 5;
            return false;
        }
        }

        if (hasUnitOfMeasure)
        {
        unitOfMeasureWrapper.wrap(this.unitOfMeasure(), unitOfMeasureLength);
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !UnitOfMeasure.isValid(unitOfMeasureWrapper))
        {
            invalidTagId = 996;
            rejectReason = 5;
            return false;
        }
        }

        if (hasSettlMethod)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !SettlMethod.isValid(settlMethod()))
        {
            invalidTagId = 1193;
            rejectReason = 5;
            return false;
        }
        }

        if (hasExerciseStyle)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !ExerciseStyle.isValid(exerciseStyle()))
        {
            invalidTagId = 1194;
            rejectReason = 5;
            return false;
        }
        }

        if (hasOptPayoutType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !OptPayoutType.isValid(optPayoutType()))
        {
            invalidTagId = 1482;
            rejectReason = 5;
            return false;
        }
        }

        if (hasPriceQuoteMethod)
        {
        priceQuoteMethodWrapper.wrap(this.priceQuoteMethod(), priceQuoteMethodLength);
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !PriceQuoteMethod.isValid(priceQuoteMethodWrapper))
        {
            invalidTagId = 1196;
            rejectReason = 5;
            return false;
        }
        }

        if (hasValuationMethod)
        {
        valuationMethodWrapper.wrap(this.valuationMethod(), valuationMethodLength);
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !ValuationMethod.isValid(valuationMethodWrapper))
        {
            invalidTagId = 1197;
            rejectReason = 5;
            return false;
        }
        }

        if (hasListMethod)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !ListMethod.isValid(listMethod()))
        {
            invalidTagId = 1198;
            rejectReason = 5;
            return false;
        }
        }

        if (hasPutOrCall)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !PutOrCall.isValid(putOrCall()))
        {
            invalidTagId = 201;
            rejectReason = 5;
            return false;
        }
        }

        if (hasTimeUnit)
        {
        timeUnitWrapper.wrap(this.timeUnit(), timeUnitLength);
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !TimeUnit.isValid(timeUnitWrapper))
        {
            invalidTagId = 997;
            rejectReason = 5;
            return false;
        }
        }

        if (hasCPProgram)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !CPProgram.isValid(cPProgram()))
        {
            invalidTagId = 875;
            rejectReason = 5;
            return false;
        }
        }

        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !Side.isValid(side()))
        {
            invalidTagId = 54;
            rejectReason = 5;
            return false;
        }

        if (hasSideValueInd)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !SideValueInd.isValid(sideValueInd()))
        {
            invalidTagId = 401;
            rejectReason = 5;
            return false;
        }
        }


        if (hasQtyType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !QtyType.isValid(qtyType()))
        {
            invalidTagId = 854;
            rejectReason = 5;
            return false;
        }
        }

        if (hasRoundingDirection)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !RoundingDirection.isValid(roundingDirection()))
        {
            invalidTagId = 468;
            rejectReason = 5;
            return false;
        }
        }

        if (hasOrdType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !OrdType.isValid(ordType()))
        {
            invalidTagId = 40;
            rejectReason = 5;
            return false;
        }
        }

        if (hasPriceType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !PriceType.isValid(priceType()))
        {
            invalidTagId = 423;
            rejectReason = 5;
            return false;
        }
        }

        if (hasPriceProtectionScope)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !PriceProtectionScope.isValid(priceProtectionScope()))
        {
            invalidTagId = 1092;
            rejectReason = 5;
            return false;
        }
        }

        if (hasTriggerType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !TriggerType.isValid(triggerType()))
        {
            invalidTagId = 1100;
            rejectReason = 5;
            return false;
        }
        }

        if (hasTriggerAction)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !TriggerAction.isValid(triggerAction()))
        {
            invalidTagId = 1101;
            rejectReason = 5;
            return false;
        }
        }

        if (hasTriggerPriceType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !TriggerPriceType.isValid(triggerPriceType()))
        {
            invalidTagId = 1107;
            rejectReason = 5;
            return false;
        }
        }

        if (hasTriggerPriceTypeScope)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !TriggerPriceTypeScope.isValid(triggerPriceTypeScope()))
        {
            invalidTagId = 1108;
            rejectReason = 5;
            return false;
        }
        }

        if (hasTriggerPriceDirection)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !TriggerPriceDirection.isValid(triggerPriceDirection()))
        {
            invalidTagId = 1109;
            rejectReason = 5;
            return false;
        }
        }

        if (hasTriggerOrderType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !TriggerOrderType.isValid(triggerOrderType()))
        {
            invalidTagId = 1111;
            rejectReason = 5;
            return false;
        }
        }

        if (hasBenchmarkCurveName)
        {
        benchmarkCurveNameWrapper.wrap(this.benchmarkCurveName(), benchmarkCurveNameLength);
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !BenchmarkCurveName.isValid(benchmarkCurveNameWrapper))
        {
            invalidTagId = 221;
            rejectReason = 5;
            return false;
        }
        }

        if (hasYieldType)
        {
        yieldTypeWrapper.wrap(this.yieldType(), yieldTypeLength);
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !YieldType.isValid(yieldTypeWrapper))
        {
            invalidTagId = 235;
            rejectReason = 5;
            return false;
        }
        }


        if (hasRefOrderIDSource)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !RefOrderIDSource.isValid(refOrderIDSource()))
        {
            invalidTagId = 1081;
            rejectReason = 5;
            return false;
        }
        }

        if (hasTimeInForce)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !TimeInForce.isValid(timeInForce()))
        {
            invalidTagId = 59;
            rejectReason = 5;
            return false;
        }
        }

        if (hasGTBookingInst)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !GTBookingInst.isValid(gTBookingInst()))
        {
            invalidTagId = 427;
            rejectReason = 5;
            return false;
        }
        }

        if (hasCommType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !CommType.isValid(commType()))
        {
            invalidTagId = 13;
            rejectReason = 5;
            return false;
        }
        }

        if (hasFundRenewWaiv)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !FundRenewWaiv.isValid(fundRenewWaiv()))
        {
            invalidTagId = 497;
            rejectReason = 5;
            return false;
        }
        }

        if (hasOrderCapacity)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !OrderCapacity.isValid(orderCapacity()))
        {
            invalidTagId = 528;
            rejectReason = 5;
            return false;
        }
        }

        if (hasOrderRestrictions)
        {
          int orderRestrictionsOffset = 0;
          for (int i = 0; i < orderRestrictionsLength; i++)
          {
              if (this.orderRestrictions()[i] == ' ')
              {
                  orderRestrictionsWrapper.wrap(this.orderRestrictions(), orderRestrictionsOffset, i - orderRestrictionsOffset);
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !OrderRestrictions.isValid(orderRestrictionsWrapper))
        {
            invalidTagId = 529;
            rejectReason = 5;
            return false;
        }
                  orderRestrictionsOffset = i + 1;
              }
          }
          orderRestrictionsWrapper.wrap(this.orderRestrictions(), orderRestrictionsOffset, orderRestrictionsLength - orderRestrictionsOffset);
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !OrderRestrictions.isValid(orderRestrictionsWrapper))
        {
            invalidTagId = 529;
            rejectReason = 5;
            return false;
        }
        }

        if (hasCustOrderCapacity)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !CustOrderCapacity.isValid(custOrderCapacity()))
        {
            invalidTagId = 582;
            rejectReason = 5;
            return false;
        }
        }


        if (hasBookingType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !BookingType.isValid(bookingType()))
        {
            invalidTagId = 775;
            rejectReason = 5;
            return false;
        }
        }

        if (hasPositionEffect)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !PositionEffect.isValid(positionEffect()))
        {
            invalidTagId = 77;
            rejectReason = 5;
            return false;
        }
        }

        if (hasCoveredOrUncovered)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !CoveredOrUncovered.isValid(coveredOrUncovered()))
        {
            invalidTagId = 203;
            rejectReason = 5;
            return false;
        }
        }

        if (hasPegPriceType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !PegPriceType.isValid(pegPriceType()))
        {
            invalidTagId = 1094;
            rejectReason = 5;
            return false;
        }
        }

        if (hasPegMoveType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !PegMoveType.isValid(pegMoveType()))
        {
            invalidTagId = 835;
            rejectReason = 5;
            return false;
        }
        }

        if (hasPegOffsetType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !PegOffsetType.isValid(pegOffsetType()))
        {
            invalidTagId = 836;
            rejectReason = 5;
            return false;
        }
        }

        if (hasPegLimitType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !PegLimitType.isValid(pegLimitType()))
        {
            invalidTagId = 837;
            rejectReason = 5;
            return false;
        }
        }

        if (hasPegRoundDirection)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !PegRoundDirection.isValid(pegRoundDirection()))
        {
            invalidTagId = 838;
            rejectReason = 5;
            return false;
        }
        }

        if (hasPegScope)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !PegScope.isValid(pegScope()))
        {
            invalidTagId = 840;
            rejectReason = 5;
            return false;
        }
        }

        if (hasDiscretionInst)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !DiscretionInst.isValid(discretionInst()))
        {
            invalidTagId = 388;
            rejectReason = 5;
            return false;
        }
        }

        if (hasDiscretionMoveType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !DiscretionMoveType.isValid(discretionMoveType()))
        {
            invalidTagId = 841;
            rejectReason = 5;
            return false;
        }
        }

        if (hasDiscretionOffsetType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !DiscretionOffsetType.isValid(discretionOffsetType()))
        {
            invalidTagId = 842;
            rejectReason = 5;
            return false;
        }
        }

        if (hasDiscretionLimitType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !DiscretionLimitType.isValid(discretionLimitType()))
        {
            invalidTagId = 843;
            rejectReason = 5;
            return false;
        }
        }

        if (hasDiscretionRoundDirection)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !DiscretionRoundDirection.isValid(discretionRoundDirection()))
        {
            invalidTagId = 844;
            rejectReason = 5;
            return false;
        }
        }

        if (hasDiscretionScope)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !DiscretionScope.isValid(discretionScope()))
        {
            invalidTagId = 846;
            rejectReason = 5;
            return false;
        }
        }

        if (hasTargetStrategy)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !TargetStrategy.isValid(targetStrategy()))
        {
            invalidTagId = 847;
            rejectReason = 5;
            return false;
        }
        }
        if (hasNoPartyIDsGroupCounter)
        {
            {
                int count = 0;
                final PartyIDsGroupIterator iterator = partyIDsGroupIterator.iterator();
                for (final PartyIDsGroupDecoder group : iterator)
                {
                    count++;                    if (!group.validate())
                    {
                        invalidTagId = group.invalidTagId();
                        rejectReason = group.rejectReason();
                        return false;
                    }
                }
                if (count != iterator.numberFieldValue())
                {
                    invalidTagId = 453;
                    rejectReason = 16;
                    return false;
                }
            }
        }

        if (hasNoAllocsGroupCounter)
        {
            {
                int count = 0;
                final AllocsGroupIterator iterator = allocsGroupIterator.iterator();
                for (final AllocsGroupDecoder group : iterator)
                {
                    count++;                    if (!group.validate())
                    {
                        invalidTagId = group.invalidTagId();
                        rejectReason = group.rejectReason();
                        return false;
                    }
                }
                if (count != iterator.numberFieldValue())
                {
                    invalidTagId = 78;
                    rejectReason = 16;
                    return false;
                }
            }
        }

        if (hasNoTradingSessionsGroupCounter)
        {
            {
                int count = 0;
                final TradingSessionsGroupIterator iterator = tradingSessionsGroupIterator.iterator();
                for (final TradingSessionsGroupDecoder group : iterator)
                {
                    count++;                    if (!group.validate())
                    {
                        invalidTagId = group.invalidTagId();
                        rejectReason = group.rejectReason();
                        return false;
                    }
                }
                if (count != iterator.numberFieldValue())
                {
                    invalidTagId = 386;
                    rejectReason = 16;
                    return false;
                }
            }
        }

        if (hasNoSecurityAltIDGroupCounter)
        {
            {
                int count = 0;
                final SecurityAltIDGroupIterator iterator = securityAltIDGroupIterator.iterator();
                for (final SecurityAltIDGroupDecoder group : iterator)
                {
                    count++;                    if (!group.validate())
                    {
                        invalidTagId = group.invalidTagId();
                        rejectReason = group.rejectReason();
                        return false;
                    }
                }
                if (count != iterator.numberFieldValue())
                {
                    invalidTagId = 454;
                    rejectReason = 16;
                    return false;
                }
            }
        }

        if (hasNoEventsGroupCounter)
        {
            {
                int count = 0;
                final EventsGroupIterator iterator = eventsGroupIterator.iterator();
                for (final EventsGroupDecoder group : iterator)
                {
                    count++;                    if (!group.validate())
                    {
                        invalidTagId = group.invalidTagId();
                        rejectReason = group.rejectReason();
                        return false;
                    }
                }
                if (count != iterator.numberFieldValue())
                {
                    invalidTagId = 864;
                    rejectReason = 16;
                    return false;
                }
            }
        }

        if (hasNoInstrumentPartiesGroupCounter)
        {
            {
                int count = 0;
                final InstrumentPartiesGroupIterator iterator = instrumentPartiesGroupIterator.iterator();
                for (final InstrumentPartiesGroupDecoder group : iterator)
                {
                    count++;                    if (!group.validate())
                    {
                        invalidTagId = group.invalidTagId();
                        rejectReason = group.rejectReason();
                        return false;
                    }
                }
                if (count != iterator.numberFieldValue())
                {
                    invalidTagId = 1018;
                    rejectReason = 16;
                    return false;
                }
            }
        }

        if (hasNoComplexEventsGroupCounter)
        {
            {
                int count = 0;
                final ComplexEventsGroupIterator iterator = complexEventsGroupIterator.iterator();
                for (final ComplexEventsGroupDecoder group : iterator)
                {
                    count++;                    if (!group.validate())
                    {
                        invalidTagId = group.invalidTagId();
                        rejectReason = group.rejectReason();
                        return false;
                    }
                }
                if (count != iterator.numberFieldValue())
                {
                    invalidTagId = 1483;
                    rejectReason = 16;
                    return false;
                }
            }
        }

        if (hasNoUnderlyingsGroupCounter)
        {
            {
                int count = 0;
                final UnderlyingsGroupIterator iterator = underlyingsGroupIterator.iterator();
                for (final UnderlyingsGroupDecoder group : iterator)
                {
                    count++;                    if (!group.validate())
                    {
                        invalidTagId = group.invalidTagId();
                        rejectReason = group.rejectReason();
                        return false;
                    }
                }
                if (count != iterator.numberFieldValue())
                {
                    invalidTagId = 711;
                    rejectReason = 16;
                    return false;
                }
            }
        }

        if (hasNoStipulationsGroupCounter)
        {
            {
                int count = 0;
                final StipulationsGroupIterator iterator = stipulationsGroupIterator.iterator();
                for (final StipulationsGroupDecoder group : iterator)
                {
                    count++;                    if (!group.validate())
                    {
                        invalidTagId = group.invalidTagId();
                        rejectReason = group.rejectReason();
                        return false;
                    }
                }
                if (count != iterator.numberFieldValue())
                {
                    invalidTagId = 232;
                    rejectReason = 16;
                    return false;
                }
            }
        }

        if (hasNoStrategyParametersGroupCounter)
        {
            {
                int count = 0;
                final StrategyParametersGroupIterator iterator = strategyParametersGroupIterator.iterator();
                for (final StrategyParametersGroupDecoder group : iterator)
                {
                    count++;                    if (!group.validate())
                    {
                        invalidTagId = group.invalidTagId();
                        rejectReason = group.rejectReason();
                        return false;
                    }
                }
                if (count != iterator.numberFieldValue())
                {
                    invalidTagId = 957;
                    rejectReason = 16;
                    return false;
                }
            }
        }
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public OrdersGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private OrdersGroupDecoder next = null;

    public OrdersGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(170);

    private char[] clOrdID = new char[1];

    public char[] clOrdID()
    {
        return clOrdID;
    }


    private int clOrdIDOffset;

    private int clOrdIDLength;

    public int clOrdIDLength()
    {
        return clOrdIDLength;
    }

    public String clOrdIDAsString()
    {
        return new String(clOrdID, 0, clOrdIDLength);
    }

    public void clOrdID(final AsciiSequenceView view)
    {
        view.wrap(buffer, clOrdIDOffset, clOrdIDLength);
    }


    private final CharArrayWrapper clOrdIDWrapper = new CharArrayWrapper();
    private char[] secondaryClOrdID = new char[1];

    private boolean hasSecondaryClOrdID;

    public char[] secondaryClOrdID()
    {
        if (!hasSecondaryClOrdID)
        {
            throw new IllegalArgumentException("No value for optional field: SecondaryClOrdID");
        }

        return secondaryClOrdID;
    }

    public boolean hasSecondaryClOrdID()
    {
        return hasSecondaryClOrdID;
    }


    private int secondaryClOrdIDOffset;

    private int secondaryClOrdIDLength;

    public int secondaryClOrdIDLength()
    {
        if (!hasSecondaryClOrdID)
        {
            throw new IllegalArgumentException("No value for optional field: SecondaryClOrdID");
        }

        return secondaryClOrdIDLength;
    }

    public String secondaryClOrdIDAsString()
    {
        return hasSecondaryClOrdID ? new String(secondaryClOrdID, 0, secondaryClOrdIDLength) : null;
    }

    public void secondaryClOrdID(final AsciiSequenceView view)
    {
        if (!hasSecondaryClOrdID)
        {
            throw new IllegalArgumentException("No value for optional field: SecondaryClOrdID");
        }

        view.wrap(buffer, secondaryClOrdIDOffset, secondaryClOrdIDLength);
    }


    private final CharArrayWrapper secondaryClOrdIDWrapper = new CharArrayWrapper();
    private int listSeqNo = MISSING_INT;

    public int listSeqNo()
    {
        return listSeqNo;
    }



    private char[] clOrdLinkID = new char[1];

    private boolean hasClOrdLinkID;

    public char[] clOrdLinkID()
    {
        if (!hasClOrdLinkID)
        {
            throw new IllegalArgumentException("No value for optional field: ClOrdLinkID");
        }

        return clOrdLinkID;
    }

    public boolean hasClOrdLinkID()
    {
        return hasClOrdLinkID;
    }


    private int clOrdLinkIDOffset;

    private int clOrdLinkIDLength;

    public int clOrdLinkIDLength()
    {
        if (!hasClOrdLinkID)
        {
            throw new IllegalArgumentException("No value for optional field: ClOrdLinkID");
        }

        return clOrdLinkIDLength;
    }

    public String clOrdLinkIDAsString()
    {
        return hasClOrdLinkID ? new String(clOrdLinkID, 0, clOrdLinkIDLength) : null;
    }

    public void clOrdLinkID(final AsciiSequenceView view)
    {
        if (!hasClOrdLinkID)
        {
            throw new IllegalArgumentException("No value for optional field: ClOrdLinkID");
        }

        view.wrap(buffer, clOrdLinkIDOffset, clOrdLinkIDLength);
    }


    private final CharArrayWrapper clOrdLinkIDWrapper = new CharArrayWrapper();
    private char settlInstMode = MISSING_CHAR;

    private boolean hasSettlInstMode;

    public char settlInstMode()
    {
        if (!hasSettlInstMode)
        {
            throw new IllegalArgumentException("No value for optional field: SettlInstMode");
        }

        return settlInstMode;
    }

    public boolean hasSettlInstMode()
    {
        return hasSettlInstMode;
    }



    private final CharArrayWrapper settlInstModeWrapper = new CharArrayWrapper();
    public SettlInstMode settlInstModeAsEnum()
    {
        if (!hasSettlInstMode)
 return SettlInstMode.NULL_VAL;
        return SettlInstMode.decode(settlInstMode);
    }



    private PartyIDsGroupDecoder partyIDsGroup = null;
    public PartyIDsGroupDecoder partyIDsGroup()
    {
        return partyIDsGroup;
    }

    private int noPartyIDsGroupCounter = MISSING_INT;

    private boolean hasNoPartyIDsGroupCounter;

    public int noPartyIDsGroupCounter()
    {
        if (!hasNoPartyIDsGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoPartyIDsGroupCounter");
        }

        return noPartyIDsGroupCounter;
    }

    public boolean hasNoPartyIDsGroupCounter()
    {
        return hasNoPartyIDsGroupCounter;
    }




    private PartyIDsGroupIterator partyIDsGroupIterator = new PartyIDsGroupIterator(this);
    public PartyIDsGroupIterator partyIDsGroupIterator()
    {
        return partyIDsGroupIterator.iterator();
    }


    private byte[] tradeOriginationDate = new byte[8];

    private boolean hasTradeOriginationDate;

    public byte[] tradeOriginationDate()
    {
        if (!hasTradeOriginationDate)
        {
            throw new IllegalArgumentException("No value for optional field: TradeOriginationDate");
        }

        return tradeOriginationDate;
    }

    public boolean hasTradeOriginationDate()
    {
        return hasTradeOriginationDate;
    }


    private int tradeOriginationDateOffset;

    private int tradeOriginationDateLength;

    public int tradeOriginationDateLength()
    {
        if (!hasTradeOriginationDate)
        {
            throw new IllegalArgumentException("No value for optional field: TradeOriginationDate");
        }

        return tradeOriginationDateLength;
    }

    public String tradeOriginationDateAsString()
    {
        return hasTradeOriginationDate ? new String(tradeOriginationDate, 0, tradeOriginationDateLength) : null;
    }

    public void tradeOriginationDate(final AsciiSequenceView view)
    {
        if (!hasTradeOriginationDate)
        {
            throw new IllegalArgumentException("No value for optional field: TradeOriginationDate");
        }

        view.wrap(buffer, tradeOriginationDateOffset, tradeOriginationDateLength);
    }


    private byte[] tradeDate = new byte[8];

    private boolean hasTradeDate;

    public byte[] tradeDate()
    {
        if (!hasTradeDate)
        {
            throw new IllegalArgumentException("No value for optional field: TradeDate");
        }

        return tradeDate;
    }

    public boolean hasTradeDate()
    {
        return hasTradeDate;
    }


    private int tradeDateOffset;

    private int tradeDateLength;

    public int tradeDateLength()
    {
        if (!hasTradeDate)
        {
            throw new IllegalArgumentException("No value for optional field: TradeDate");
        }

        return tradeDateLength;
    }

    public String tradeDateAsString()
    {
        return hasTradeDate ? new String(tradeDate, 0, tradeDateLength) : null;
    }

    public void tradeDate(final AsciiSequenceView view)
    {
        if (!hasTradeDate)
        {
            throw new IllegalArgumentException("No value for optional field: TradeDate");
        }

        view.wrap(buffer, tradeDateOffset, tradeDateLength);
    }


    private char[] account = new char[1];

    private boolean hasAccount;

    public char[] account()
    {
        if (!hasAccount)
        {
            throw new IllegalArgumentException("No value for optional field: Account");
        }

        return account;
    }

    public boolean hasAccount()
    {
        return hasAccount;
    }


    private int accountOffset;

    private int accountLength;

    public int accountLength()
    {
        if (!hasAccount)
        {
            throw new IllegalArgumentException("No value for optional field: Account");
        }

        return accountLength;
    }

    public String accountAsString()
    {
        return hasAccount ? new String(account, 0, accountLength) : null;
    }

    public void account(final AsciiSequenceView view)
    {
        if (!hasAccount)
        {
            throw new IllegalArgumentException("No value for optional field: Account");
        }

        view.wrap(buffer, accountOffset, accountLength);
    }


    private final CharArrayWrapper accountWrapper = new CharArrayWrapper();
    private int acctIDSource = MISSING_INT;

    private boolean hasAcctIDSource;

    public int acctIDSource()
    {
        if (!hasAcctIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: AcctIDSource");
        }

        return acctIDSource;
    }

    public boolean hasAcctIDSource()
    {
        return hasAcctIDSource;
    }



    private final CharArrayWrapper acctIDSourceWrapper = new CharArrayWrapper();
    public AcctIDSource acctIDSourceAsEnum()
    {
        if (!hasAcctIDSource)
 return AcctIDSource.NULL_VAL;
        return AcctIDSource.decode(acctIDSource);
    }

    private int accountType = MISSING_INT;

    private boolean hasAccountType;

    public int accountType()
    {
        if (!hasAccountType)
        {
            throw new IllegalArgumentException("No value for optional field: AccountType");
        }

        return accountType;
    }

    public boolean hasAccountType()
    {
        return hasAccountType;
    }



    private final CharArrayWrapper accountTypeWrapper = new CharArrayWrapper();
    public AccountType accountTypeAsEnum()
    {
        if (!hasAccountType)
 return AccountType.NULL_VAL;
        return AccountType.decode(accountType);
    }

    private char dayBookingInst = MISSING_CHAR;

    private boolean hasDayBookingInst;

    public char dayBookingInst()
    {
        if (!hasDayBookingInst)
        {
            throw new IllegalArgumentException("No value for optional field: DayBookingInst");
        }

        return dayBookingInst;
    }

    public boolean hasDayBookingInst()
    {
        return hasDayBookingInst;
    }



    private final CharArrayWrapper dayBookingInstWrapper = new CharArrayWrapper();
    public DayBookingInst dayBookingInstAsEnum()
    {
        if (!hasDayBookingInst)
 return DayBookingInst.NULL_VAL;
        return DayBookingInst.decode(dayBookingInst);
    }

    private char bookingUnit = MISSING_CHAR;

    private boolean hasBookingUnit;

    public char bookingUnit()
    {
        if (!hasBookingUnit)
        {
            throw new IllegalArgumentException("No value for optional field: BookingUnit");
        }

        return bookingUnit;
    }

    public boolean hasBookingUnit()
    {
        return hasBookingUnit;
    }



    private final CharArrayWrapper bookingUnitWrapper = new CharArrayWrapper();
    public BookingUnit bookingUnitAsEnum()
    {
        if (!hasBookingUnit)
 return BookingUnit.NULL_VAL;
        return BookingUnit.decode(bookingUnit);
    }

    private char[] allocID = new char[1];

    private boolean hasAllocID;

    public char[] allocID()
    {
        if (!hasAllocID)
        {
            throw new IllegalArgumentException("No value for optional field: AllocID");
        }

        return allocID;
    }

    public boolean hasAllocID()
    {
        return hasAllocID;
    }


    private int allocIDOffset;

    private int allocIDLength;

    public int allocIDLength()
    {
        if (!hasAllocID)
        {
            throw new IllegalArgumentException("No value for optional field: AllocID");
        }

        return allocIDLength;
    }

    public String allocIDAsString()
    {
        return hasAllocID ? new String(allocID, 0, allocIDLength) : null;
    }

    public void allocID(final AsciiSequenceView view)
    {
        if (!hasAllocID)
        {
            throw new IllegalArgumentException("No value for optional field: AllocID");
        }

        view.wrap(buffer, allocIDOffset, allocIDLength);
    }


    private final CharArrayWrapper allocIDWrapper = new CharArrayWrapper();
    private char preallocMethod = MISSING_CHAR;

    private boolean hasPreallocMethod;

    public char preallocMethod()
    {
        if (!hasPreallocMethod)
        {
            throw new IllegalArgumentException("No value for optional field: PreallocMethod");
        }

        return preallocMethod;
    }

    public boolean hasPreallocMethod()
    {
        return hasPreallocMethod;
    }



    private final CharArrayWrapper preallocMethodWrapper = new CharArrayWrapper();
    public PreallocMethod preallocMethodAsEnum()
    {
        if (!hasPreallocMethod)
 return PreallocMethod.NULL_VAL;
        return PreallocMethod.decode(preallocMethod);
    }



    private AllocsGroupDecoder allocsGroup = null;
    public AllocsGroupDecoder allocsGroup()
    {
        return allocsGroup;
    }

    private int noAllocsGroupCounter = MISSING_INT;

    private boolean hasNoAllocsGroupCounter;

    public int noAllocsGroupCounter()
    {
        if (!hasNoAllocsGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoAllocsGroupCounter");
        }

        return noAllocsGroupCounter;
    }

    public boolean hasNoAllocsGroupCounter()
    {
        return hasNoAllocsGroupCounter;
    }




    private AllocsGroupIterator allocsGroupIterator = new AllocsGroupIterator(this);
    public AllocsGroupIterator allocsGroupIterator()
    {
        return allocsGroupIterator.iterator();
    }


    private char[] settlType = new char[1];

    private boolean hasSettlType;

    public char[] settlType()
    {
        if (!hasSettlType)
        {
            throw new IllegalArgumentException("No value for optional field: SettlType");
        }

        return settlType;
    }

    public boolean hasSettlType()
    {
        return hasSettlType;
    }


    private int settlTypeOffset;

    private int settlTypeLength;

    public int settlTypeLength()
    {
        if (!hasSettlType)
        {
            throw new IllegalArgumentException("No value for optional field: SettlType");
        }

        return settlTypeLength;
    }

    public String settlTypeAsString()
    {
        return hasSettlType ? new String(settlType, 0, settlTypeLength) : null;
    }

    public void settlType(final AsciiSequenceView view)
    {
        if (!hasSettlType)
        {
            throw new IllegalArgumentException("No value for optional field: SettlType");
        }

        view.wrap(buffer, settlTypeOffset, settlTypeLength);
    }


    private final CharArrayWrapper settlTypeWrapper = new CharArrayWrapper();
    public SettlType settlTypeAsEnum()
    {
        if (!hasSettlType)
 return SettlType.NULL_VAL;
        settlTypeWrapper.wrap(this.settlType(), settlTypeLength);
        return SettlType.decode(settlTypeWrapper);
    }

    private byte[] settlDate = new byte[8];

    private boolean hasSettlDate;

    public byte[] settlDate()
    {
        if (!hasSettlDate)
        {
            throw new IllegalArgumentException("No value for optional field: SettlDate");
        }

        return settlDate;
    }

    public boolean hasSettlDate()
    {
        return hasSettlDate;
    }


    private int settlDateOffset;

    private int settlDateLength;

    public int settlDateLength()
    {
        if (!hasSettlDate)
        {
            throw new IllegalArgumentException("No value for optional field: SettlDate");
        }

        return settlDateLength;
    }

    public String settlDateAsString()
    {
        return hasSettlDate ? new String(settlDate, 0, settlDateLength) : null;
    }

    public void settlDate(final AsciiSequenceView view)
    {
        if (!hasSettlDate)
        {
            throw new IllegalArgumentException("No value for optional field: SettlDate");
        }

        view.wrap(buffer, settlDateOffset, settlDateLength);
    }


    private char cashMargin = MISSING_CHAR;

    private boolean hasCashMargin;

    public char cashMargin()
    {
        if (!hasCashMargin)
        {
            throw new IllegalArgumentException("No value for optional field: CashMargin");
        }

        return cashMargin;
    }

    public boolean hasCashMargin()
    {
        return hasCashMargin;
    }



    private final CharArrayWrapper cashMarginWrapper = new CharArrayWrapper();
    public CashMargin cashMarginAsEnum()
    {
        if (!hasCashMargin)
 return CashMargin.NULL_VAL;
        return CashMargin.decode(cashMargin);
    }

    private char[] clearingFeeIndicator = new char[1];

    private boolean hasClearingFeeIndicator;

    public char[] clearingFeeIndicator()
    {
        if (!hasClearingFeeIndicator)
        {
            throw new IllegalArgumentException("No value for optional field: ClearingFeeIndicator");
        }

        return clearingFeeIndicator;
    }

    public boolean hasClearingFeeIndicator()
    {
        return hasClearingFeeIndicator;
    }


    private int clearingFeeIndicatorOffset;

    private int clearingFeeIndicatorLength;

    public int clearingFeeIndicatorLength()
    {
        if (!hasClearingFeeIndicator)
        {
            throw new IllegalArgumentException("No value for optional field: ClearingFeeIndicator");
        }

        return clearingFeeIndicatorLength;
    }

    public String clearingFeeIndicatorAsString()
    {
        return hasClearingFeeIndicator ? new String(clearingFeeIndicator, 0, clearingFeeIndicatorLength) : null;
    }

    public void clearingFeeIndicator(final AsciiSequenceView view)
    {
        if (!hasClearingFeeIndicator)
        {
            throw new IllegalArgumentException("No value for optional field: ClearingFeeIndicator");
        }

        view.wrap(buffer, clearingFeeIndicatorOffset, clearingFeeIndicatorLength);
    }


    private final CharArrayWrapper clearingFeeIndicatorWrapper = new CharArrayWrapper();
    public ClearingFeeIndicator clearingFeeIndicatorAsEnum()
    {
        if (!hasClearingFeeIndicator)
 return ClearingFeeIndicator.NULL_VAL;
        clearingFeeIndicatorWrapper.wrap(this.clearingFeeIndicator(), clearingFeeIndicatorLength);
        return ClearingFeeIndicator.decode(clearingFeeIndicatorWrapper);
    }

    private char handlInst = MISSING_CHAR;

    private boolean hasHandlInst;

    public char handlInst()
    {
        if (!hasHandlInst)
        {
            throw new IllegalArgumentException("No value for optional field: HandlInst");
        }

        return handlInst;
    }

    public boolean hasHandlInst()
    {
        return hasHandlInst;
    }



    private final CharArrayWrapper handlInstWrapper = new CharArrayWrapper();
    public HandlInst handlInstAsEnum()
    {
        if (!hasHandlInst)
 return HandlInst.NULL_VAL;
        return HandlInst.decode(handlInst);
    }

    private char[] execInst = new char[1];

    private boolean hasExecInst;

    public char[] execInst()
    {
        if (!hasExecInst)
        {
            throw new IllegalArgumentException("No value for optional field: ExecInst");
        }

        return execInst;
    }

    public boolean hasExecInst()
    {
        return hasExecInst;
    }


    private int execInstOffset;

    private int execInstLength;

    public int execInstLength()
    {
        if (!hasExecInst)
        {
            throw new IllegalArgumentException("No value for optional field: ExecInst");
        }

        return execInstLength;
    }

    public String execInstAsString()
    {
        return hasExecInst ? new String(execInst, 0, execInstLength) : null;
    }

    public void execInst(final AsciiSequenceView view)
    {
        if (!hasExecInst)
        {
            throw new IllegalArgumentException("No value for optional field: ExecInst");
        }

        view.wrap(buffer, execInstOffset, execInstLength);
    }


    private final CharArrayWrapper execInstWrapper = new CharArrayWrapper();
    private DecimalFloat minQty = DecimalFloat.newNaNValue();

    private boolean hasMinQty;

    public DecimalFloat minQty()
    {
        if (!hasMinQty)
        {
            throw new IllegalArgumentException("No value for optional field: MinQty");
        }

        return minQty;
    }

    public boolean hasMinQty()
    {
        return hasMinQty;
    }



    private DecimalFloat matchIncrement = DecimalFloat.newNaNValue();

    private boolean hasMatchIncrement;

    public DecimalFloat matchIncrement()
    {
        if (!hasMatchIncrement)
        {
            throw new IllegalArgumentException("No value for optional field: MatchIncrement");
        }

        return matchIncrement;
    }

    public boolean hasMatchIncrement()
    {
        return hasMatchIncrement;
    }



    private int maxPriceLevels = MISSING_INT;

    private boolean hasMaxPriceLevels;

    public int maxPriceLevels()
    {
        if (!hasMaxPriceLevels)
        {
            throw new IllegalArgumentException("No value for optional field: MaxPriceLevels");
        }

        return maxPriceLevels;
    }

    public boolean hasMaxPriceLevels()
    {
        return hasMaxPriceLevels;
    }




    private DecimalFloat displayQty = DecimalFloat.newNaNValue();

    private boolean hasDisplayQty;

    public DecimalFloat displayQty()
    {
        if (!hasDisplayQty)
        {
            throw new IllegalArgumentException("No value for optional field: DisplayQty");
        }

        return displayQty;
    }

    public boolean hasDisplayQty()
    {
        return hasDisplayQty;
    }



    private DecimalFloat secondaryDisplayQty = DecimalFloat.newNaNValue();

    private boolean hasSecondaryDisplayQty;

    public DecimalFloat secondaryDisplayQty()
    {
        if (!hasSecondaryDisplayQty)
        {
            throw new IllegalArgumentException("No value for optional field: SecondaryDisplayQty");
        }

        return secondaryDisplayQty;
    }

    public boolean hasSecondaryDisplayQty()
    {
        return hasSecondaryDisplayQty;
    }



    private char displayWhen = MISSING_CHAR;

    private boolean hasDisplayWhen;

    public char displayWhen()
    {
        if (!hasDisplayWhen)
        {
            throw new IllegalArgumentException("No value for optional field: DisplayWhen");
        }

        return displayWhen;
    }

    public boolean hasDisplayWhen()
    {
        return hasDisplayWhen;
    }



    private final CharArrayWrapper displayWhenWrapper = new CharArrayWrapper();
    public DisplayWhen displayWhenAsEnum()
    {
        if (!hasDisplayWhen)
 return DisplayWhen.NULL_VAL;
        return DisplayWhen.decode(displayWhen);
    }

    private char displayMethod = MISSING_CHAR;

    private boolean hasDisplayMethod;

    public char displayMethod()
    {
        if (!hasDisplayMethod)
        {
            throw new IllegalArgumentException("No value for optional field: DisplayMethod");
        }

        return displayMethod;
    }

    public boolean hasDisplayMethod()
    {
        return hasDisplayMethod;
    }



    private final CharArrayWrapper displayMethodWrapper = new CharArrayWrapper();
    public DisplayMethod displayMethodAsEnum()
    {
        if (!hasDisplayMethod)
 return DisplayMethod.NULL_VAL;
        return DisplayMethod.decode(displayMethod);
    }

    private DecimalFloat displayLowQty = DecimalFloat.newNaNValue();

    private boolean hasDisplayLowQty;

    public DecimalFloat displayLowQty()
    {
        if (!hasDisplayLowQty)
        {
            throw new IllegalArgumentException("No value for optional field: DisplayLowQty");
        }

        return displayLowQty;
    }

    public boolean hasDisplayLowQty()
    {
        return hasDisplayLowQty;
    }



    private DecimalFloat displayHighQty = DecimalFloat.newNaNValue();

    private boolean hasDisplayHighQty;

    public DecimalFloat displayHighQty()
    {
        if (!hasDisplayHighQty)
        {
            throw new IllegalArgumentException("No value for optional field: DisplayHighQty");
        }

        return displayHighQty;
    }

    public boolean hasDisplayHighQty()
    {
        return hasDisplayHighQty;
    }



    private DecimalFloat displayMinIncr = DecimalFloat.newNaNValue();

    private boolean hasDisplayMinIncr;

    public DecimalFloat displayMinIncr()
    {
        if (!hasDisplayMinIncr)
        {
            throw new IllegalArgumentException("No value for optional field: DisplayMinIncr");
        }

        return displayMinIncr;
    }

    public boolean hasDisplayMinIncr()
    {
        return hasDisplayMinIncr;
    }



    private DecimalFloat refreshQty = DecimalFloat.newNaNValue();

    private boolean hasRefreshQty;

    public DecimalFloat refreshQty()
    {
        if (!hasRefreshQty)
        {
            throw new IllegalArgumentException("No value for optional field: RefreshQty");
        }

        return refreshQty;
    }

    public boolean hasRefreshQty()
    {
        return hasRefreshQty;
    }




    private DecimalFloat maxFloor = DecimalFloat.newNaNValue();

    private boolean hasMaxFloor;

    public DecimalFloat maxFloor()
    {
        if (!hasMaxFloor)
        {
            throw new IllegalArgumentException("No value for optional field: MaxFloor");
        }

        return maxFloor;
    }

    public boolean hasMaxFloor()
    {
        return hasMaxFloor;
    }



    private char[] exDestination = new char[1];

    private boolean hasExDestination;

    public char[] exDestination()
    {
        if (!hasExDestination)
        {
            throw new IllegalArgumentException("No value for optional field: ExDestination");
        }

        return exDestination;
    }

    public boolean hasExDestination()
    {
        return hasExDestination;
    }


    private int exDestinationOffset;

    private int exDestinationLength;

    public int exDestinationLength()
    {
        if (!hasExDestination)
        {
            throw new IllegalArgumentException("No value for optional field: ExDestination");
        }

        return exDestinationLength;
    }

    public String exDestinationAsString()
    {
        return hasExDestination ? new String(exDestination, 0, exDestinationLength) : null;
    }

    public void exDestination(final AsciiSequenceView view)
    {
        if (!hasExDestination)
        {
            throw new IllegalArgumentException("No value for optional field: ExDestination");
        }

        view.wrap(buffer, exDestinationOffset, exDestinationLength);
    }


    private char exDestinationIDSource = MISSING_CHAR;

    private boolean hasExDestinationIDSource;

    public char exDestinationIDSource()
    {
        if (!hasExDestinationIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: ExDestinationIDSource");
        }

        return exDestinationIDSource;
    }

    public boolean hasExDestinationIDSource()
    {
        return hasExDestinationIDSource;
    }



    private final CharArrayWrapper exDestinationIDSourceWrapper = new CharArrayWrapper();
    public ExDestinationIDSource exDestinationIDSourceAsEnum()
    {
        if (!hasExDestinationIDSource)
 return ExDestinationIDSource.NULL_VAL;
        return ExDestinationIDSource.decode(exDestinationIDSource);
    }



    private TradingSessionsGroupDecoder tradingSessionsGroup = null;
    public TradingSessionsGroupDecoder tradingSessionsGroup()
    {
        return tradingSessionsGroup;
    }

    private int noTradingSessionsGroupCounter = MISSING_INT;

    private boolean hasNoTradingSessionsGroupCounter;

    public int noTradingSessionsGroupCounter()
    {
        if (!hasNoTradingSessionsGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoTradingSessionsGroupCounter");
        }

        return noTradingSessionsGroupCounter;
    }

    public boolean hasNoTradingSessionsGroupCounter()
    {
        return hasNoTradingSessionsGroupCounter;
    }




    private TradingSessionsGroupIterator tradingSessionsGroupIterator = new TradingSessionsGroupIterator(this);
    public TradingSessionsGroupIterator tradingSessionsGroupIterator()
    {
        return tradingSessionsGroupIterator.iterator();
    }


    private char processCode = MISSING_CHAR;

    private boolean hasProcessCode;

    public char processCode()
    {
        if (!hasProcessCode)
        {
            throw new IllegalArgumentException("No value for optional field: ProcessCode");
        }

        return processCode;
    }

    public boolean hasProcessCode()
    {
        return hasProcessCode;
    }



    private final CharArrayWrapper processCodeWrapper = new CharArrayWrapper();
    public ProcessCode processCodeAsEnum()
    {
        if (!hasProcessCode)
 return ProcessCode.NULL_VAL;
        return ProcessCode.decode(processCode);
    }


    private char[] symbol = new char[1];

    private boolean hasSymbol;

    public char[] symbol()
    {
        if (!hasSymbol)
        {
            throw new IllegalArgumentException("No value for optional field: Symbol");
        }

        return symbol;
    }

    public boolean hasSymbol()
    {
        return hasSymbol;
    }


    private int symbolOffset;

    private int symbolLength;

    public int symbolLength()
    {
        if (!hasSymbol)
        {
            throw new IllegalArgumentException("No value for optional field: Symbol");
        }

        return symbolLength;
    }

    public String symbolAsString()
    {
        return hasSymbol ? new String(symbol, 0, symbolLength) : null;
    }

    public void symbol(final AsciiSequenceView view)
    {
        if (!hasSymbol)
        {
            throw new IllegalArgumentException("No value for optional field: Symbol");
        }

        view.wrap(buffer, symbolOffset, symbolLength);
    }


    private final CharArrayWrapper symbolWrapper = new CharArrayWrapper();
    private char[] symbolSfx = new char[1];

    private boolean hasSymbolSfx;

    public char[] symbolSfx()
    {
        if (!hasSymbolSfx)
        {
            throw new IllegalArgumentException("No value for optional field: SymbolSfx");
        }

        return symbolSfx;
    }

    public boolean hasSymbolSfx()
    {
        return hasSymbolSfx;
    }


    private int symbolSfxOffset;

    private int symbolSfxLength;

    public int symbolSfxLength()
    {
        if (!hasSymbolSfx)
        {
            throw new IllegalArgumentException("No value for optional field: SymbolSfx");
        }

        return symbolSfxLength;
    }

    public String symbolSfxAsString()
    {
        return hasSymbolSfx ? new String(symbolSfx, 0, symbolSfxLength) : null;
    }

    public void symbolSfx(final AsciiSequenceView view)
    {
        if (!hasSymbolSfx)
        {
            throw new IllegalArgumentException("No value for optional field: SymbolSfx");
        }

        view.wrap(buffer, symbolSfxOffset, symbolSfxLength);
    }


    private final CharArrayWrapper symbolSfxWrapper = new CharArrayWrapper();
    public SymbolSfx symbolSfxAsEnum()
    {
        if (!hasSymbolSfx)
 return SymbolSfx.NULL_VAL;
        symbolSfxWrapper.wrap(this.symbolSfx(), symbolSfxLength);
        return SymbolSfx.decode(symbolSfxWrapper);
    }

    private char[] securityID = new char[1];

    private boolean hasSecurityID;

    public char[] securityID()
    {
        if (!hasSecurityID)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityID");
        }

        return securityID;
    }

    public boolean hasSecurityID()
    {
        return hasSecurityID;
    }


    private int securityIDOffset;

    private int securityIDLength;

    public int securityIDLength()
    {
        if (!hasSecurityID)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityID");
        }

        return securityIDLength;
    }

    public String securityIDAsString()
    {
        return hasSecurityID ? new String(securityID, 0, securityIDLength) : null;
    }

    public void securityID(final AsciiSequenceView view)
    {
        if (!hasSecurityID)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityID");
        }

        view.wrap(buffer, securityIDOffset, securityIDLength);
    }


    private final CharArrayWrapper securityIDWrapper = new CharArrayWrapper();
    private char[] securityIDSource = new char[1];

    private boolean hasSecurityIDSource;

    public char[] securityIDSource()
    {
        if (!hasSecurityIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityIDSource");
        }

        return securityIDSource;
    }

    public boolean hasSecurityIDSource()
    {
        return hasSecurityIDSource;
    }


    private int securityIDSourceOffset;

    private int securityIDSourceLength;

    public int securityIDSourceLength()
    {
        if (!hasSecurityIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityIDSource");
        }

        return securityIDSourceLength;
    }

    public String securityIDSourceAsString()
    {
        return hasSecurityIDSource ? new String(securityIDSource, 0, securityIDSourceLength) : null;
    }

    public void securityIDSource(final AsciiSequenceView view)
    {
        if (!hasSecurityIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityIDSource");
        }

        view.wrap(buffer, securityIDSourceOffset, securityIDSourceLength);
    }


    private final CharArrayWrapper securityIDSourceWrapper = new CharArrayWrapper();
    public SecurityIDSource securityIDSourceAsEnum()
    {
        if (!hasSecurityIDSource)
 return SecurityIDSource.NULL_VAL;
        securityIDSourceWrapper.wrap(this.securityIDSource(), securityIDSourceLength);
        return SecurityIDSource.decode(securityIDSourceWrapper);
    }



    private SecurityAltIDGroupDecoder securityAltIDGroup = null;
    public SecurityAltIDGroupDecoder securityAltIDGroup()
    {
        return securityAltIDGroup;
    }

    private int noSecurityAltIDGroupCounter = MISSING_INT;

    private boolean hasNoSecurityAltIDGroupCounter;

    public int noSecurityAltIDGroupCounter()
    {
        if (!hasNoSecurityAltIDGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoSecurityAltIDGroupCounter");
        }

        return noSecurityAltIDGroupCounter;
    }

    public boolean hasNoSecurityAltIDGroupCounter()
    {
        return hasNoSecurityAltIDGroupCounter;
    }




    private SecurityAltIDGroupIterator securityAltIDGroupIterator = new SecurityAltIDGroupIterator(this);
    public SecurityAltIDGroupIterator securityAltIDGroupIterator()
    {
        return securityAltIDGroupIterator.iterator();
    }


    private int product = MISSING_INT;

    private boolean hasProduct;

    public int product()
    {
        if (!hasProduct)
        {
            throw new IllegalArgumentException("No value for optional field: Product");
        }

        return product;
    }

    public boolean hasProduct()
    {
        return hasProduct;
    }



    private final CharArrayWrapper productWrapper = new CharArrayWrapper();
    public Product productAsEnum()
    {
        if (!hasProduct)
 return Product.NULL_VAL;
        return Product.decode(product);
    }

    private char[] productComplex = new char[1];

    private boolean hasProductComplex;

    public char[] productComplex()
    {
        if (!hasProductComplex)
        {
            throw new IllegalArgumentException("No value for optional field: ProductComplex");
        }

        return productComplex;
    }

    public boolean hasProductComplex()
    {
        return hasProductComplex;
    }


    private int productComplexOffset;

    private int productComplexLength;

    public int productComplexLength()
    {
        if (!hasProductComplex)
        {
            throw new IllegalArgumentException("No value for optional field: ProductComplex");
        }

        return productComplexLength;
    }

    public String productComplexAsString()
    {
        return hasProductComplex ? new String(productComplex, 0, productComplexLength) : null;
    }

    public void productComplex(final AsciiSequenceView view)
    {
        if (!hasProductComplex)
        {
            throw new IllegalArgumentException("No value for optional field: ProductComplex");
        }

        view.wrap(buffer, productComplexOffset, productComplexLength);
    }


    private final CharArrayWrapper productComplexWrapper = new CharArrayWrapper();
    private char[] securityGroup = new char[1];

    private boolean hasSecurityGroup;

    public char[] securityGroup()
    {
        if (!hasSecurityGroup)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityGroup");
        }

        return securityGroup;
    }

    public boolean hasSecurityGroup()
    {
        return hasSecurityGroup;
    }


    private int securityGroupOffset;

    private int securityGroupLength;

    public int securityGroupLength()
    {
        if (!hasSecurityGroup)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityGroup");
        }

        return securityGroupLength;
    }

    public String securityGroupAsString()
    {
        return hasSecurityGroup ? new String(securityGroup, 0, securityGroupLength) : null;
    }

    public void securityGroup(final AsciiSequenceView view)
    {
        if (!hasSecurityGroup)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityGroup");
        }

        view.wrap(buffer, securityGroupOffset, securityGroupLength);
    }


    private final CharArrayWrapper securityGroupWrapper = new CharArrayWrapper();
    private char[] cFICode = new char[1];

    private boolean hasCFICode;

    public char[] cFICode()
    {
        if (!hasCFICode)
        {
            throw new IllegalArgumentException("No value for optional field: CFICode");
        }

        return cFICode;
    }

    public boolean hasCFICode()
    {
        return hasCFICode;
    }


    private int cFICodeOffset;

    private int cFICodeLength;

    public int cFICodeLength()
    {
        if (!hasCFICode)
        {
            throw new IllegalArgumentException("No value for optional field: CFICode");
        }

        return cFICodeLength;
    }

    public String cFICodeAsString()
    {
        return hasCFICode ? new String(cFICode, 0, cFICodeLength) : null;
    }

    public void cFICode(final AsciiSequenceView view)
    {
        if (!hasCFICode)
        {
            throw new IllegalArgumentException("No value for optional field: CFICode");
        }

        view.wrap(buffer, cFICodeOffset, cFICodeLength);
    }


    private final CharArrayWrapper cFICodeWrapper = new CharArrayWrapper();
    private char[] securityType = new char[1];

    private boolean hasSecurityType;

    public char[] securityType()
    {
        if (!hasSecurityType)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityType");
        }

        return securityType;
    }

    public boolean hasSecurityType()
    {
        return hasSecurityType;
    }


    private int securityTypeOffset;

    private int securityTypeLength;

    public int securityTypeLength()
    {
        if (!hasSecurityType)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityType");
        }

        return securityTypeLength;
    }

    public String securityTypeAsString()
    {
        return hasSecurityType ? new String(securityType, 0, securityTypeLength) : null;
    }

    public void securityType(final AsciiSequenceView view)
    {
        if (!hasSecurityType)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityType");
        }

        view.wrap(buffer, securityTypeOffset, securityTypeLength);
    }


    private final CharArrayWrapper securityTypeWrapper = new CharArrayWrapper();
    public SecurityType securityTypeAsEnum()
    {
        if (!hasSecurityType)
 return SecurityType.NULL_VAL;
        securityTypeWrapper.wrap(this.securityType(), securityTypeLength);
        return SecurityType.decode(securityTypeWrapper);
    }

    private char[] securitySubType = new char[1];

    private boolean hasSecuritySubType;

    public char[] securitySubType()
    {
        if (!hasSecuritySubType)
        {
            throw new IllegalArgumentException("No value for optional field: SecuritySubType");
        }

        return securitySubType;
    }

    public boolean hasSecuritySubType()
    {
        return hasSecuritySubType;
    }


    private int securitySubTypeOffset;

    private int securitySubTypeLength;

    public int securitySubTypeLength()
    {
        if (!hasSecuritySubType)
        {
            throw new IllegalArgumentException("No value for optional field: SecuritySubType");
        }

        return securitySubTypeLength;
    }

    public String securitySubTypeAsString()
    {
        return hasSecuritySubType ? new String(securitySubType, 0, securitySubTypeLength) : null;
    }

    public void securitySubType(final AsciiSequenceView view)
    {
        if (!hasSecuritySubType)
        {
            throw new IllegalArgumentException("No value for optional field: SecuritySubType");
        }

        view.wrap(buffer, securitySubTypeOffset, securitySubTypeLength);
    }


    private final CharArrayWrapper securitySubTypeWrapper = new CharArrayWrapper();
    private byte[] maturityMonthYear = new byte[8];

    private boolean hasMaturityMonthYear;

    public byte[] maturityMonthYear()
    {
        if (!hasMaturityMonthYear)
        {
            throw new IllegalArgumentException("No value for optional field: MaturityMonthYear");
        }

        return maturityMonthYear;
    }

    public boolean hasMaturityMonthYear()
    {
        return hasMaturityMonthYear;
    }


    private int maturityMonthYearOffset;

    private int maturityMonthYearLength;

    public int maturityMonthYearLength()
    {
        if (!hasMaturityMonthYear)
        {
            throw new IllegalArgumentException("No value for optional field: MaturityMonthYear");
        }

        return maturityMonthYearLength;
    }

    public String maturityMonthYearAsString()
    {
        return hasMaturityMonthYear ? new String(maturityMonthYear, 0, maturityMonthYearLength) : null;
    }

    public void maturityMonthYear(final AsciiSequenceView view)
    {
        if (!hasMaturityMonthYear)
        {
            throw new IllegalArgumentException("No value for optional field: MaturityMonthYear");
        }

        view.wrap(buffer, maturityMonthYearOffset, maturityMonthYearLength);
    }


    private byte[] maturityDate = new byte[8];

    private boolean hasMaturityDate;

    public byte[] maturityDate()
    {
        if (!hasMaturityDate)
        {
            throw new IllegalArgumentException("No value for optional field: MaturityDate");
        }

        return maturityDate;
    }

    public boolean hasMaturityDate()
    {
        return hasMaturityDate;
    }


    private int maturityDateOffset;

    private int maturityDateLength;

    public int maturityDateLength()
    {
        if (!hasMaturityDate)
        {
            throw new IllegalArgumentException("No value for optional field: MaturityDate");
        }

        return maturityDateLength;
    }

    public String maturityDateAsString()
    {
        return hasMaturityDate ? new String(maturityDate, 0, maturityDateLength) : null;
    }

    public void maturityDate(final AsciiSequenceView view)
    {
        if (!hasMaturityDate)
        {
            throw new IllegalArgumentException("No value for optional field: MaturityDate");
        }

        view.wrap(buffer, maturityDateOffset, maturityDateLength);
    }


    private byte[] maturityTime = new byte[19];

    private boolean hasMaturityTime;

    public byte[] maturityTime()
    {
        if (!hasMaturityTime)
        {
            throw new IllegalArgumentException("No value for optional field: MaturityTime");
        }

        return maturityTime;
    }

    public boolean hasMaturityTime()
    {
        return hasMaturityTime;
    }


    private int maturityTimeOffset;

    private int maturityTimeLength;

    public int maturityTimeLength()
    {
        if (!hasMaturityTime)
        {
            throw new IllegalArgumentException("No value for optional field: MaturityTime");
        }

        return maturityTimeLength;
    }

    public String maturityTimeAsString()
    {
        return hasMaturityTime ? new String(maturityTime, 0, maturityTimeLength) : null;
    }

    public void maturityTime(final AsciiSequenceView view)
    {
        if (!hasMaturityTime)
        {
            throw new IllegalArgumentException("No value for optional field: MaturityTime");
        }

        view.wrap(buffer, maturityTimeOffset, maturityTimeLength);
    }


    private char[] settleOnOpenFlag = new char[1];

    private boolean hasSettleOnOpenFlag;

    public char[] settleOnOpenFlag()
    {
        if (!hasSettleOnOpenFlag)
        {
            throw new IllegalArgumentException("No value for optional field: SettleOnOpenFlag");
        }

        return settleOnOpenFlag;
    }

    public boolean hasSettleOnOpenFlag()
    {
        return hasSettleOnOpenFlag;
    }


    private int settleOnOpenFlagOffset;

    private int settleOnOpenFlagLength;

    public int settleOnOpenFlagLength()
    {
        if (!hasSettleOnOpenFlag)
        {
            throw new IllegalArgumentException("No value for optional field: SettleOnOpenFlag");
        }

        return settleOnOpenFlagLength;
    }

    public String settleOnOpenFlagAsString()
    {
        return hasSettleOnOpenFlag ? new String(settleOnOpenFlag, 0, settleOnOpenFlagLength) : null;
    }

    public void settleOnOpenFlag(final AsciiSequenceView view)
    {
        if (!hasSettleOnOpenFlag)
        {
            throw new IllegalArgumentException("No value for optional field: SettleOnOpenFlag");
        }

        view.wrap(buffer, settleOnOpenFlagOffset, settleOnOpenFlagLength);
    }


    private final CharArrayWrapper settleOnOpenFlagWrapper = new CharArrayWrapper();
    private char instrmtAssignmentMethod = MISSING_CHAR;

    private boolean hasInstrmtAssignmentMethod;

    public char instrmtAssignmentMethod()
    {
        if (!hasInstrmtAssignmentMethod)
        {
            throw new IllegalArgumentException("No value for optional field: InstrmtAssignmentMethod");
        }

        return instrmtAssignmentMethod;
    }

    public boolean hasInstrmtAssignmentMethod()
    {
        return hasInstrmtAssignmentMethod;
    }



    private char[] securityStatus = new char[1];

    private boolean hasSecurityStatus;

    public char[] securityStatus()
    {
        if (!hasSecurityStatus)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityStatus");
        }

        return securityStatus;
    }

    public boolean hasSecurityStatus()
    {
        return hasSecurityStatus;
    }


    private int securityStatusOffset;

    private int securityStatusLength;

    public int securityStatusLength()
    {
        if (!hasSecurityStatus)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityStatus");
        }

        return securityStatusLength;
    }

    public String securityStatusAsString()
    {
        return hasSecurityStatus ? new String(securityStatus, 0, securityStatusLength) : null;
    }

    public void securityStatus(final AsciiSequenceView view)
    {
        if (!hasSecurityStatus)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityStatus");
        }

        view.wrap(buffer, securityStatusOffset, securityStatusLength);
    }


    private final CharArrayWrapper securityStatusWrapper = new CharArrayWrapper();
    public SecurityStatus securityStatusAsEnum()
    {
        if (!hasSecurityStatus)
 return SecurityStatus.NULL_VAL;
        securityStatusWrapper.wrap(this.securityStatus(), securityStatusLength);
        return SecurityStatus.decode(securityStatusWrapper);
    }

    private byte[] couponPaymentDate = new byte[8];

    private boolean hasCouponPaymentDate;

    public byte[] couponPaymentDate()
    {
        if (!hasCouponPaymentDate)
        {
            throw new IllegalArgumentException("No value for optional field: CouponPaymentDate");
        }

        return couponPaymentDate;
    }

    public boolean hasCouponPaymentDate()
    {
        return hasCouponPaymentDate;
    }


    private int couponPaymentDateOffset;

    private int couponPaymentDateLength;

    public int couponPaymentDateLength()
    {
        if (!hasCouponPaymentDate)
        {
            throw new IllegalArgumentException("No value for optional field: CouponPaymentDate");
        }

        return couponPaymentDateLength;
    }

    public String couponPaymentDateAsString()
    {
        return hasCouponPaymentDate ? new String(couponPaymentDate, 0, couponPaymentDateLength) : null;
    }

    public void couponPaymentDate(final AsciiSequenceView view)
    {
        if (!hasCouponPaymentDate)
        {
            throw new IllegalArgumentException("No value for optional field: CouponPaymentDate");
        }

        view.wrap(buffer, couponPaymentDateOffset, couponPaymentDateLength);
    }


    private char[] restructuringType = new char[1];

    private boolean hasRestructuringType;

    public char[] restructuringType()
    {
        if (!hasRestructuringType)
        {
            throw new IllegalArgumentException("No value for optional field: RestructuringType");
        }

        return restructuringType;
    }

    public boolean hasRestructuringType()
    {
        return hasRestructuringType;
    }


    private int restructuringTypeOffset;

    private int restructuringTypeLength;

    public int restructuringTypeLength()
    {
        if (!hasRestructuringType)
        {
            throw new IllegalArgumentException("No value for optional field: RestructuringType");
        }

        return restructuringTypeLength;
    }

    public String restructuringTypeAsString()
    {
        return hasRestructuringType ? new String(restructuringType, 0, restructuringTypeLength) : null;
    }

    public void restructuringType(final AsciiSequenceView view)
    {
        if (!hasRestructuringType)
        {
            throw new IllegalArgumentException("No value for optional field: RestructuringType");
        }

        view.wrap(buffer, restructuringTypeOffset, restructuringTypeLength);
    }


    private final CharArrayWrapper restructuringTypeWrapper = new CharArrayWrapper();
    public RestructuringType restructuringTypeAsEnum()
    {
        if (!hasRestructuringType)
 return RestructuringType.NULL_VAL;
        restructuringTypeWrapper.wrap(this.restructuringType(), restructuringTypeLength);
        return RestructuringType.decode(restructuringTypeWrapper);
    }

    private char[] seniority = new char[1];

    private boolean hasSeniority;

    public char[] seniority()
    {
        if (!hasSeniority)
        {
            throw new IllegalArgumentException("No value for optional field: Seniority");
        }

        return seniority;
    }

    public boolean hasSeniority()
    {
        return hasSeniority;
    }


    private int seniorityOffset;

    private int seniorityLength;

    public int seniorityLength()
    {
        if (!hasSeniority)
        {
            throw new IllegalArgumentException("No value for optional field: Seniority");
        }

        return seniorityLength;
    }

    public String seniorityAsString()
    {
        return hasSeniority ? new String(seniority, 0, seniorityLength) : null;
    }

    public void seniority(final AsciiSequenceView view)
    {
        if (!hasSeniority)
        {
            throw new IllegalArgumentException("No value for optional field: Seniority");
        }

        view.wrap(buffer, seniorityOffset, seniorityLength);
    }


    private final CharArrayWrapper seniorityWrapper = new CharArrayWrapper();
    public Seniority seniorityAsEnum()
    {
        if (!hasSeniority)
 return Seniority.NULL_VAL;
        seniorityWrapper.wrap(this.seniority(), seniorityLength);
        return Seniority.decode(seniorityWrapper);
    }

    private DecimalFloat notionalPercentageOutstanding = DecimalFloat.newNaNValue();

    private boolean hasNotionalPercentageOutstanding;

    public DecimalFloat notionalPercentageOutstanding()
    {
        if (!hasNotionalPercentageOutstanding)
        {
            throw new IllegalArgumentException("No value for optional field: NotionalPercentageOutstanding");
        }

        return notionalPercentageOutstanding;
    }

    public boolean hasNotionalPercentageOutstanding()
    {
        return hasNotionalPercentageOutstanding;
    }



    private DecimalFloat originalNotionalPercentageOutstanding = DecimalFloat.newNaNValue();

    private boolean hasOriginalNotionalPercentageOutstanding;

    public DecimalFloat originalNotionalPercentageOutstanding()
    {
        if (!hasOriginalNotionalPercentageOutstanding)
        {
            throw new IllegalArgumentException("No value for optional field: OriginalNotionalPercentageOutstanding");
        }

        return originalNotionalPercentageOutstanding;
    }

    public boolean hasOriginalNotionalPercentageOutstanding()
    {
        return hasOriginalNotionalPercentageOutstanding;
    }



    private DecimalFloat attachmentPoint = DecimalFloat.newNaNValue();

    private boolean hasAttachmentPoint;

    public DecimalFloat attachmentPoint()
    {
        if (!hasAttachmentPoint)
        {
            throw new IllegalArgumentException("No value for optional field: AttachmentPoint");
        }

        return attachmentPoint;
    }

    public boolean hasAttachmentPoint()
    {
        return hasAttachmentPoint;
    }



    private DecimalFloat detachmentPoint = DecimalFloat.newNaNValue();

    private boolean hasDetachmentPoint;

    public DecimalFloat detachmentPoint()
    {
        if (!hasDetachmentPoint)
        {
            throw new IllegalArgumentException("No value for optional field: DetachmentPoint");
        }

        return detachmentPoint;
    }

    public boolean hasDetachmentPoint()
    {
        return hasDetachmentPoint;
    }



    private byte[] issueDate = new byte[8];

    private boolean hasIssueDate;

    public byte[] issueDate()
    {
        if (!hasIssueDate)
        {
            throw new IllegalArgumentException("No value for optional field: IssueDate");
        }

        return issueDate;
    }

    public boolean hasIssueDate()
    {
        return hasIssueDate;
    }


    private int issueDateOffset;

    private int issueDateLength;

    public int issueDateLength()
    {
        if (!hasIssueDate)
        {
            throw new IllegalArgumentException("No value for optional field: IssueDate");
        }

        return issueDateLength;
    }

    public String issueDateAsString()
    {
        return hasIssueDate ? new String(issueDate, 0, issueDateLength) : null;
    }

    public void issueDate(final AsciiSequenceView view)
    {
        if (!hasIssueDate)
        {
            throw new IllegalArgumentException("No value for optional field: IssueDate");
        }

        view.wrap(buffer, issueDateOffset, issueDateLength);
    }


    private char[] repoCollateralSecurityType = new char[1];

    private boolean hasRepoCollateralSecurityType;

    public char[] repoCollateralSecurityType()
    {
        if (!hasRepoCollateralSecurityType)
        {
            throw new IllegalArgumentException("No value for optional field: RepoCollateralSecurityType");
        }

        return repoCollateralSecurityType;
    }

    public boolean hasRepoCollateralSecurityType()
    {
        return hasRepoCollateralSecurityType;
    }


    private int repoCollateralSecurityTypeOffset;

    private int repoCollateralSecurityTypeLength;

    public int repoCollateralSecurityTypeLength()
    {
        if (!hasRepoCollateralSecurityType)
        {
            throw new IllegalArgumentException("No value for optional field: RepoCollateralSecurityType");
        }

        return repoCollateralSecurityTypeLength;
    }

    public String repoCollateralSecurityTypeAsString()
    {
        return hasRepoCollateralSecurityType ? new String(repoCollateralSecurityType, 0, repoCollateralSecurityTypeLength) : null;
    }

    public void repoCollateralSecurityType(final AsciiSequenceView view)
    {
        if (!hasRepoCollateralSecurityType)
        {
            throw new IllegalArgumentException("No value for optional field: RepoCollateralSecurityType");
        }

        view.wrap(buffer, repoCollateralSecurityTypeOffset, repoCollateralSecurityTypeLength);
    }


    private final CharArrayWrapper repoCollateralSecurityTypeWrapper = new CharArrayWrapper();
    private int repurchaseTerm = MISSING_INT;

    private boolean hasRepurchaseTerm;

    public int repurchaseTerm()
    {
        if (!hasRepurchaseTerm)
        {
            throw new IllegalArgumentException("No value for optional field: RepurchaseTerm");
        }

        return repurchaseTerm;
    }

    public boolean hasRepurchaseTerm()
    {
        return hasRepurchaseTerm;
    }



    private DecimalFloat repurchaseRate = DecimalFloat.newNaNValue();

    private boolean hasRepurchaseRate;

    public DecimalFloat repurchaseRate()
    {
        if (!hasRepurchaseRate)
        {
            throw new IllegalArgumentException("No value for optional field: RepurchaseRate");
        }

        return repurchaseRate;
    }

    public boolean hasRepurchaseRate()
    {
        return hasRepurchaseRate;
    }



    private DecimalFloat factor = DecimalFloat.newNaNValue();

    private boolean hasFactor;

    public DecimalFloat factor()
    {
        if (!hasFactor)
        {
            throw new IllegalArgumentException("No value for optional field: Factor");
        }

        return factor;
    }

    public boolean hasFactor()
    {
        return hasFactor;
    }



    private char[] creditRating = new char[1];

    private boolean hasCreditRating;

    public char[] creditRating()
    {
        if (!hasCreditRating)
        {
            throw new IllegalArgumentException("No value for optional field: CreditRating");
        }

        return creditRating;
    }

    public boolean hasCreditRating()
    {
        return hasCreditRating;
    }


    private int creditRatingOffset;

    private int creditRatingLength;

    public int creditRatingLength()
    {
        if (!hasCreditRating)
        {
            throw new IllegalArgumentException("No value for optional field: CreditRating");
        }

        return creditRatingLength;
    }

    public String creditRatingAsString()
    {
        return hasCreditRating ? new String(creditRating, 0, creditRatingLength) : null;
    }

    public void creditRating(final AsciiSequenceView view)
    {
        if (!hasCreditRating)
        {
            throw new IllegalArgumentException("No value for optional field: CreditRating");
        }

        view.wrap(buffer, creditRatingOffset, creditRatingLength);
    }


    private final CharArrayWrapper creditRatingWrapper = new CharArrayWrapper();
    private char[] instrRegistry = new char[1];

    private boolean hasInstrRegistry;

    public char[] instrRegistry()
    {
        if (!hasInstrRegistry)
        {
            throw new IllegalArgumentException("No value for optional field: InstrRegistry");
        }

        return instrRegistry;
    }

    public boolean hasInstrRegistry()
    {
        return hasInstrRegistry;
    }


    private int instrRegistryOffset;

    private int instrRegistryLength;

    public int instrRegistryLength()
    {
        if (!hasInstrRegistry)
        {
            throw new IllegalArgumentException("No value for optional field: InstrRegistry");
        }

        return instrRegistryLength;
    }

    public String instrRegistryAsString()
    {
        return hasInstrRegistry ? new String(instrRegistry, 0, instrRegistryLength) : null;
    }

    public void instrRegistry(final AsciiSequenceView view)
    {
        if (!hasInstrRegistry)
        {
            throw new IllegalArgumentException("No value for optional field: InstrRegistry");
        }

        view.wrap(buffer, instrRegistryOffset, instrRegistryLength);
    }


    private final CharArrayWrapper instrRegistryWrapper = new CharArrayWrapper();
    private char[] countryOfIssue = new char[1];

    private boolean hasCountryOfIssue;

    public char[] countryOfIssue()
    {
        if (!hasCountryOfIssue)
        {
            throw new IllegalArgumentException("No value for optional field: CountryOfIssue");
        }

        return countryOfIssue;
    }

    public boolean hasCountryOfIssue()
    {
        return hasCountryOfIssue;
    }


    private int countryOfIssueOffset;

    private int countryOfIssueLength;

    public int countryOfIssueLength()
    {
        if (!hasCountryOfIssue)
        {
            throw new IllegalArgumentException("No value for optional field: CountryOfIssue");
        }

        return countryOfIssueLength;
    }

    public String countryOfIssueAsString()
    {
        return hasCountryOfIssue ? new String(countryOfIssue, 0, countryOfIssueLength) : null;
    }

    public void countryOfIssue(final AsciiSequenceView view)
    {
        if (!hasCountryOfIssue)
        {
            throw new IllegalArgumentException("No value for optional field: CountryOfIssue");
        }

        view.wrap(buffer, countryOfIssueOffset, countryOfIssueLength);
    }


    private char[] stateOrProvinceOfIssue = new char[1];

    private boolean hasStateOrProvinceOfIssue;

    public char[] stateOrProvinceOfIssue()
    {
        if (!hasStateOrProvinceOfIssue)
        {
            throw new IllegalArgumentException("No value for optional field: StateOrProvinceOfIssue");
        }

        return stateOrProvinceOfIssue;
    }

    public boolean hasStateOrProvinceOfIssue()
    {
        return hasStateOrProvinceOfIssue;
    }


    private int stateOrProvinceOfIssueOffset;

    private int stateOrProvinceOfIssueLength;

    public int stateOrProvinceOfIssueLength()
    {
        if (!hasStateOrProvinceOfIssue)
        {
            throw new IllegalArgumentException("No value for optional field: StateOrProvinceOfIssue");
        }

        return stateOrProvinceOfIssueLength;
    }

    public String stateOrProvinceOfIssueAsString()
    {
        return hasStateOrProvinceOfIssue ? new String(stateOrProvinceOfIssue, 0, stateOrProvinceOfIssueLength) : null;
    }

    public void stateOrProvinceOfIssue(final AsciiSequenceView view)
    {
        if (!hasStateOrProvinceOfIssue)
        {
            throw new IllegalArgumentException("No value for optional field: StateOrProvinceOfIssue");
        }

        view.wrap(buffer, stateOrProvinceOfIssueOffset, stateOrProvinceOfIssueLength);
    }


    private final CharArrayWrapper stateOrProvinceOfIssueWrapper = new CharArrayWrapper();
    private char[] localeOfIssue = new char[1];

    private boolean hasLocaleOfIssue;

    public char[] localeOfIssue()
    {
        if (!hasLocaleOfIssue)
        {
            throw new IllegalArgumentException("No value for optional field: LocaleOfIssue");
        }

        return localeOfIssue;
    }

    public boolean hasLocaleOfIssue()
    {
        return hasLocaleOfIssue;
    }


    private int localeOfIssueOffset;

    private int localeOfIssueLength;

    public int localeOfIssueLength()
    {
        if (!hasLocaleOfIssue)
        {
            throw new IllegalArgumentException("No value for optional field: LocaleOfIssue");
        }

        return localeOfIssueLength;
    }

    public String localeOfIssueAsString()
    {
        return hasLocaleOfIssue ? new String(localeOfIssue, 0, localeOfIssueLength) : null;
    }

    public void localeOfIssue(final AsciiSequenceView view)
    {
        if (!hasLocaleOfIssue)
        {
            throw new IllegalArgumentException("No value for optional field: LocaleOfIssue");
        }

        view.wrap(buffer, localeOfIssueOffset, localeOfIssueLength);
    }


    private final CharArrayWrapper localeOfIssueWrapper = new CharArrayWrapper();
    private byte[] redemptionDate = new byte[8];

    private boolean hasRedemptionDate;

    public byte[] redemptionDate()
    {
        if (!hasRedemptionDate)
        {
            throw new IllegalArgumentException("No value for optional field: RedemptionDate");
        }

        return redemptionDate;
    }

    public boolean hasRedemptionDate()
    {
        return hasRedemptionDate;
    }


    private int redemptionDateOffset;

    private int redemptionDateLength;

    public int redemptionDateLength()
    {
        if (!hasRedemptionDate)
        {
            throw new IllegalArgumentException("No value for optional field: RedemptionDate");
        }

        return redemptionDateLength;
    }

    public String redemptionDateAsString()
    {
        return hasRedemptionDate ? new String(redemptionDate, 0, redemptionDateLength) : null;
    }

    public void redemptionDate(final AsciiSequenceView view)
    {
        if (!hasRedemptionDate)
        {
            throw new IllegalArgumentException("No value for optional field: RedemptionDate");
        }

        view.wrap(buffer, redemptionDateOffset, redemptionDateLength);
    }


    private DecimalFloat strikePrice = DecimalFloat.newNaNValue();

    private boolean hasStrikePrice;

    public DecimalFloat strikePrice()
    {
        if (!hasStrikePrice)
        {
            throw new IllegalArgumentException("No value for optional field: StrikePrice");
        }

        return strikePrice;
    }

    public boolean hasStrikePrice()
    {
        return hasStrikePrice;
    }



    private char[] strikeCurrency = new char[1];

    private boolean hasStrikeCurrency;

    public char[] strikeCurrency()
    {
        if (!hasStrikeCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: StrikeCurrency");
        }

        return strikeCurrency;
    }

    public boolean hasStrikeCurrency()
    {
        return hasStrikeCurrency;
    }


    private int strikeCurrencyOffset;

    private int strikeCurrencyLength;

    public int strikeCurrencyLength()
    {
        if (!hasStrikeCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: StrikeCurrency");
        }

        return strikeCurrencyLength;
    }

    public String strikeCurrencyAsString()
    {
        return hasStrikeCurrency ? new String(strikeCurrency, 0, strikeCurrencyLength) : null;
    }

    public void strikeCurrency(final AsciiSequenceView view)
    {
        if (!hasStrikeCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: StrikeCurrency");
        }

        view.wrap(buffer, strikeCurrencyOffset, strikeCurrencyLength);
    }


    private DecimalFloat strikeMultiplier = DecimalFloat.newNaNValue();

    private boolean hasStrikeMultiplier;

    public DecimalFloat strikeMultiplier()
    {
        if (!hasStrikeMultiplier)
        {
            throw new IllegalArgumentException("No value for optional field: StrikeMultiplier");
        }

        return strikeMultiplier;
    }

    public boolean hasStrikeMultiplier()
    {
        return hasStrikeMultiplier;
    }



    private DecimalFloat strikeValue = DecimalFloat.newNaNValue();

    private boolean hasStrikeValue;

    public DecimalFloat strikeValue()
    {
        if (!hasStrikeValue)
        {
            throw new IllegalArgumentException("No value for optional field: StrikeValue");
        }

        return strikeValue;
    }

    public boolean hasStrikeValue()
    {
        return hasStrikeValue;
    }



    private int strikePriceDeterminationMethod = MISSING_INT;

    private boolean hasStrikePriceDeterminationMethod;

    public int strikePriceDeterminationMethod()
    {
        if (!hasStrikePriceDeterminationMethod)
        {
            throw new IllegalArgumentException("No value for optional field: StrikePriceDeterminationMethod");
        }

        return strikePriceDeterminationMethod;
    }

    public boolean hasStrikePriceDeterminationMethod()
    {
        return hasStrikePriceDeterminationMethod;
    }



    private final CharArrayWrapper strikePriceDeterminationMethodWrapper = new CharArrayWrapper();
    public StrikePriceDeterminationMethod strikePriceDeterminationMethodAsEnum()
    {
        if (!hasStrikePriceDeterminationMethod)
 return StrikePriceDeterminationMethod.NULL_VAL;
        return StrikePriceDeterminationMethod.decode(strikePriceDeterminationMethod);
    }

    private int strikePriceBoundaryMethod = MISSING_INT;

    private boolean hasStrikePriceBoundaryMethod;

    public int strikePriceBoundaryMethod()
    {
        if (!hasStrikePriceBoundaryMethod)
        {
            throw new IllegalArgumentException("No value for optional field: StrikePriceBoundaryMethod");
        }

        return strikePriceBoundaryMethod;
    }

    public boolean hasStrikePriceBoundaryMethod()
    {
        return hasStrikePriceBoundaryMethod;
    }



    private final CharArrayWrapper strikePriceBoundaryMethodWrapper = new CharArrayWrapper();
    public StrikePriceBoundaryMethod strikePriceBoundaryMethodAsEnum()
    {
        if (!hasStrikePriceBoundaryMethod)
 return StrikePriceBoundaryMethod.NULL_VAL;
        return StrikePriceBoundaryMethod.decode(strikePriceBoundaryMethod);
    }

    private DecimalFloat strikePriceBoundaryPrecision = DecimalFloat.newNaNValue();

    private boolean hasStrikePriceBoundaryPrecision;

    public DecimalFloat strikePriceBoundaryPrecision()
    {
        if (!hasStrikePriceBoundaryPrecision)
        {
            throw new IllegalArgumentException("No value for optional field: StrikePriceBoundaryPrecision");
        }

        return strikePriceBoundaryPrecision;
    }

    public boolean hasStrikePriceBoundaryPrecision()
    {
        return hasStrikePriceBoundaryPrecision;
    }



    private int underlyingPriceDeterminationMethod = MISSING_INT;

    private boolean hasUnderlyingPriceDeterminationMethod;

    public int underlyingPriceDeterminationMethod()
    {
        if (!hasUnderlyingPriceDeterminationMethod)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingPriceDeterminationMethod");
        }

        return underlyingPriceDeterminationMethod;
    }

    public boolean hasUnderlyingPriceDeterminationMethod()
    {
        return hasUnderlyingPriceDeterminationMethod;
    }



    private final CharArrayWrapper underlyingPriceDeterminationMethodWrapper = new CharArrayWrapper();
    public UnderlyingPriceDeterminationMethod underlyingPriceDeterminationMethodAsEnum()
    {
        if (!hasUnderlyingPriceDeterminationMethod)
 return UnderlyingPriceDeterminationMethod.NULL_VAL;
        return UnderlyingPriceDeterminationMethod.decode(underlyingPriceDeterminationMethod);
    }

    private char optAttribute = MISSING_CHAR;

    private boolean hasOptAttribute;

    public char optAttribute()
    {
        if (!hasOptAttribute)
        {
            throw new IllegalArgumentException("No value for optional field: OptAttribute");
        }

        return optAttribute;
    }

    public boolean hasOptAttribute()
    {
        return hasOptAttribute;
    }



    private DecimalFloat contractMultiplier = DecimalFloat.newNaNValue();

    private boolean hasContractMultiplier;

    public DecimalFloat contractMultiplier()
    {
        if (!hasContractMultiplier)
        {
            throw new IllegalArgumentException("No value for optional field: ContractMultiplier");
        }

        return contractMultiplier;
    }

    public boolean hasContractMultiplier()
    {
        return hasContractMultiplier;
    }



    private int contractMultiplierUnit = MISSING_INT;

    private boolean hasContractMultiplierUnit;

    public int contractMultiplierUnit()
    {
        if (!hasContractMultiplierUnit)
        {
            throw new IllegalArgumentException("No value for optional field: ContractMultiplierUnit");
        }

        return contractMultiplierUnit;
    }

    public boolean hasContractMultiplierUnit()
    {
        return hasContractMultiplierUnit;
    }



    private final CharArrayWrapper contractMultiplierUnitWrapper = new CharArrayWrapper();
    public ContractMultiplierUnit contractMultiplierUnitAsEnum()
    {
        if (!hasContractMultiplierUnit)
 return ContractMultiplierUnit.NULL_VAL;
        return ContractMultiplierUnit.decode(contractMultiplierUnit);
    }

    private int flowScheduleType = MISSING_INT;

    private boolean hasFlowScheduleType;

    public int flowScheduleType()
    {
        if (!hasFlowScheduleType)
        {
            throw new IllegalArgumentException("No value for optional field: FlowScheduleType");
        }

        return flowScheduleType;
    }

    public boolean hasFlowScheduleType()
    {
        return hasFlowScheduleType;
    }



    private final CharArrayWrapper flowScheduleTypeWrapper = new CharArrayWrapper();
    public FlowScheduleType flowScheduleTypeAsEnum()
    {
        if (!hasFlowScheduleType)
 return FlowScheduleType.NULL_VAL;
        return FlowScheduleType.decode(flowScheduleType);
    }

    private DecimalFloat minPriceIncrement = DecimalFloat.newNaNValue();

    private boolean hasMinPriceIncrement;

    public DecimalFloat minPriceIncrement()
    {
        if (!hasMinPriceIncrement)
        {
            throw new IllegalArgumentException("No value for optional field: MinPriceIncrement");
        }

        return minPriceIncrement;
    }

    public boolean hasMinPriceIncrement()
    {
        return hasMinPriceIncrement;
    }



    private DecimalFloat minPriceIncrementAmount = DecimalFloat.newNaNValue();

    private boolean hasMinPriceIncrementAmount;

    public DecimalFloat minPriceIncrementAmount()
    {
        if (!hasMinPriceIncrementAmount)
        {
            throw new IllegalArgumentException("No value for optional field: MinPriceIncrementAmount");
        }

        return minPriceIncrementAmount;
    }

    public boolean hasMinPriceIncrementAmount()
    {
        return hasMinPriceIncrementAmount;
    }



    private char[] unitOfMeasure = new char[1];

    private boolean hasUnitOfMeasure;

    public char[] unitOfMeasure()
    {
        if (!hasUnitOfMeasure)
        {
            throw new IllegalArgumentException("No value for optional field: UnitOfMeasure");
        }

        return unitOfMeasure;
    }

    public boolean hasUnitOfMeasure()
    {
        return hasUnitOfMeasure;
    }


    private int unitOfMeasureOffset;

    private int unitOfMeasureLength;

    public int unitOfMeasureLength()
    {
        if (!hasUnitOfMeasure)
        {
            throw new IllegalArgumentException("No value for optional field: UnitOfMeasure");
        }

        return unitOfMeasureLength;
    }

    public String unitOfMeasureAsString()
    {
        return hasUnitOfMeasure ? new String(unitOfMeasure, 0, unitOfMeasureLength) : null;
    }

    public void unitOfMeasure(final AsciiSequenceView view)
    {
        if (!hasUnitOfMeasure)
        {
            throw new IllegalArgumentException("No value for optional field: UnitOfMeasure");
        }

        view.wrap(buffer, unitOfMeasureOffset, unitOfMeasureLength);
    }


    private final CharArrayWrapper unitOfMeasureWrapper = new CharArrayWrapper();
    public UnitOfMeasure unitOfMeasureAsEnum()
    {
        if (!hasUnitOfMeasure)
 return UnitOfMeasure.NULL_VAL;
        unitOfMeasureWrapper.wrap(this.unitOfMeasure(), unitOfMeasureLength);
        return UnitOfMeasure.decode(unitOfMeasureWrapper);
    }

    private DecimalFloat unitOfMeasureQty = DecimalFloat.newNaNValue();

    private boolean hasUnitOfMeasureQty;

    public DecimalFloat unitOfMeasureQty()
    {
        if (!hasUnitOfMeasureQty)
        {
            throw new IllegalArgumentException("No value for optional field: UnitOfMeasureQty");
        }

        return unitOfMeasureQty;
    }

    public boolean hasUnitOfMeasureQty()
    {
        return hasUnitOfMeasureQty;
    }



    private char[] priceUnitOfMeasure = new char[1];

    private boolean hasPriceUnitOfMeasure;

    public char[] priceUnitOfMeasure()
    {
        if (!hasPriceUnitOfMeasure)
        {
            throw new IllegalArgumentException("No value for optional field: PriceUnitOfMeasure");
        }

        return priceUnitOfMeasure;
    }

    public boolean hasPriceUnitOfMeasure()
    {
        return hasPriceUnitOfMeasure;
    }


    private int priceUnitOfMeasureOffset;

    private int priceUnitOfMeasureLength;

    public int priceUnitOfMeasureLength()
    {
        if (!hasPriceUnitOfMeasure)
        {
            throw new IllegalArgumentException("No value for optional field: PriceUnitOfMeasure");
        }

        return priceUnitOfMeasureLength;
    }

    public String priceUnitOfMeasureAsString()
    {
        return hasPriceUnitOfMeasure ? new String(priceUnitOfMeasure, 0, priceUnitOfMeasureLength) : null;
    }

    public void priceUnitOfMeasure(final AsciiSequenceView view)
    {
        if (!hasPriceUnitOfMeasure)
        {
            throw new IllegalArgumentException("No value for optional field: PriceUnitOfMeasure");
        }

        view.wrap(buffer, priceUnitOfMeasureOffset, priceUnitOfMeasureLength);
    }


    private final CharArrayWrapper priceUnitOfMeasureWrapper = new CharArrayWrapper();
    private DecimalFloat priceUnitOfMeasureQty = DecimalFloat.newNaNValue();

    private boolean hasPriceUnitOfMeasureQty;

    public DecimalFloat priceUnitOfMeasureQty()
    {
        if (!hasPriceUnitOfMeasureQty)
        {
            throw new IllegalArgumentException("No value for optional field: PriceUnitOfMeasureQty");
        }

        return priceUnitOfMeasureQty;
    }

    public boolean hasPriceUnitOfMeasureQty()
    {
        return hasPriceUnitOfMeasureQty;
    }



    private char settlMethod = MISSING_CHAR;

    private boolean hasSettlMethod;

    public char settlMethod()
    {
        if (!hasSettlMethod)
        {
            throw new IllegalArgumentException("No value for optional field: SettlMethod");
        }

        return settlMethod;
    }

    public boolean hasSettlMethod()
    {
        return hasSettlMethod;
    }



    private final CharArrayWrapper settlMethodWrapper = new CharArrayWrapper();
    public SettlMethod settlMethodAsEnum()
    {
        if (!hasSettlMethod)
 return SettlMethod.NULL_VAL;
        return SettlMethod.decode(settlMethod);
    }

    private int exerciseStyle = MISSING_INT;

    private boolean hasExerciseStyle;

    public int exerciseStyle()
    {
        if (!hasExerciseStyle)
        {
            throw new IllegalArgumentException("No value for optional field: ExerciseStyle");
        }

        return exerciseStyle;
    }

    public boolean hasExerciseStyle()
    {
        return hasExerciseStyle;
    }



    private final CharArrayWrapper exerciseStyleWrapper = new CharArrayWrapper();
    public ExerciseStyle exerciseStyleAsEnum()
    {
        if (!hasExerciseStyle)
 return ExerciseStyle.NULL_VAL;
        return ExerciseStyle.decode(exerciseStyle);
    }

    private int optPayoutType = MISSING_INT;

    private boolean hasOptPayoutType;

    public int optPayoutType()
    {
        if (!hasOptPayoutType)
        {
            throw new IllegalArgumentException("No value for optional field: OptPayoutType");
        }

        return optPayoutType;
    }

    public boolean hasOptPayoutType()
    {
        return hasOptPayoutType;
    }



    private final CharArrayWrapper optPayoutTypeWrapper = new CharArrayWrapper();
    public OptPayoutType optPayoutTypeAsEnum()
    {
        if (!hasOptPayoutType)
 return OptPayoutType.NULL_VAL;
        return OptPayoutType.decode(optPayoutType);
    }

    private DecimalFloat optPayoutAmount = DecimalFloat.newNaNValue();

    private boolean hasOptPayoutAmount;

    public DecimalFloat optPayoutAmount()
    {
        if (!hasOptPayoutAmount)
        {
            throw new IllegalArgumentException("No value for optional field: OptPayoutAmount");
        }

        return optPayoutAmount;
    }

    public boolean hasOptPayoutAmount()
    {
        return hasOptPayoutAmount;
    }



    private char[] priceQuoteMethod = new char[1];

    private boolean hasPriceQuoteMethod;

    public char[] priceQuoteMethod()
    {
        if (!hasPriceQuoteMethod)
        {
            throw new IllegalArgumentException("No value for optional field: PriceQuoteMethod");
        }

        return priceQuoteMethod;
    }

    public boolean hasPriceQuoteMethod()
    {
        return hasPriceQuoteMethod;
    }


    private int priceQuoteMethodOffset;

    private int priceQuoteMethodLength;

    public int priceQuoteMethodLength()
    {
        if (!hasPriceQuoteMethod)
        {
            throw new IllegalArgumentException("No value for optional field: PriceQuoteMethod");
        }

        return priceQuoteMethodLength;
    }

    public String priceQuoteMethodAsString()
    {
        return hasPriceQuoteMethod ? new String(priceQuoteMethod, 0, priceQuoteMethodLength) : null;
    }

    public void priceQuoteMethod(final AsciiSequenceView view)
    {
        if (!hasPriceQuoteMethod)
        {
            throw new IllegalArgumentException("No value for optional field: PriceQuoteMethod");
        }

        view.wrap(buffer, priceQuoteMethodOffset, priceQuoteMethodLength);
    }


    private final CharArrayWrapper priceQuoteMethodWrapper = new CharArrayWrapper();
    public PriceQuoteMethod priceQuoteMethodAsEnum()
    {
        if (!hasPriceQuoteMethod)
 return PriceQuoteMethod.NULL_VAL;
        priceQuoteMethodWrapper.wrap(this.priceQuoteMethod(), priceQuoteMethodLength);
        return PriceQuoteMethod.decode(priceQuoteMethodWrapper);
    }

    private char[] valuationMethod = new char[1];

    private boolean hasValuationMethod;

    public char[] valuationMethod()
    {
        if (!hasValuationMethod)
        {
            throw new IllegalArgumentException("No value for optional field: ValuationMethod");
        }

        return valuationMethod;
    }

    public boolean hasValuationMethod()
    {
        return hasValuationMethod;
    }


    private int valuationMethodOffset;

    private int valuationMethodLength;

    public int valuationMethodLength()
    {
        if (!hasValuationMethod)
        {
            throw new IllegalArgumentException("No value for optional field: ValuationMethod");
        }

        return valuationMethodLength;
    }

    public String valuationMethodAsString()
    {
        return hasValuationMethod ? new String(valuationMethod, 0, valuationMethodLength) : null;
    }

    public void valuationMethod(final AsciiSequenceView view)
    {
        if (!hasValuationMethod)
        {
            throw new IllegalArgumentException("No value for optional field: ValuationMethod");
        }

        view.wrap(buffer, valuationMethodOffset, valuationMethodLength);
    }


    private final CharArrayWrapper valuationMethodWrapper = new CharArrayWrapper();
    public ValuationMethod valuationMethodAsEnum()
    {
        if (!hasValuationMethod)
 return ValuationMethod.NULL_VAL;
        valuationMethodWrapper.wrap(this.valuationMethod(), valuationMethodLength);
        return ValuationMethod.decode(valuationMethodWrapper);
    }

    private int listMethod = MISSING_INT;

    private boolean hasListMethod;

    public int listMethod()
    {
        if (!hasListMethod)
        {
            throw new IllegalArgumentException("No value for optional field: ListMethod");
        }

        return listMethod;
    }

    public boolean hasListMethod()
    {
        return hasListMethod;
    }



    private final CharArrayWrapper listMethodWrapper = new CharArrayWrapper();
    public ListMethod listMethodAsEnum()
    {
        if (!hasListMethod)
 return ListMethod.NULL_VAL;
        return ListMethod.decode(listMethod);
    }

    private DecimalFloat capPrice = DecimalFloat.newNaNValue();

    private boolean hasCapPrice;

    public DecimalFloat capPrice()
    {
        if (!hasCapPrice)
        {
            throw new IllegalArgumentException("No value for optional field: CapPrice");
        }

        return capPrice;
    }

    public boolean hasCapPrice()
    {
        return hasCapPrice;
    }



    private DecimalFloat floorPrice = DecimalFloat.newNaNValue();

    private boolean hasFloorPrice;

    public DecimalFloat floorPrice()
    {
        if (!hasFloorPrice)
        {
            throw new IllegalArgumentException("No value for optional field: FloorPrice");
        }

        return floorPrice;
    }

    public boolean hasFloorPrice()
    {
        return hasFloorPrice;
    }



    private int putOrCall = MISSING_INT;

    private boolean hasPutOrCall;

    public int putOrCall()
    {
        if (!hasPutOrCall)
        {
            throw new IllegalArgumentException("No value for optional field: PutOrCall");
        }

        return putOrCall;
    }

    public boolean hasPutOrCall()
    {
        return hasPutOrCall;
    }



    private final CharArrayWrapper putOrCallWrapper = new CharArrayWrapper();
    public PutOrCall putOrCallAsEnum()
    {
        if (!hasPutOrCall)
 return PutOrCall.NULL_VAL;
        return PutOrCall.decode(putOrCall);
    }

    private boolean flexibleIndicator;

    private boolean hasFlexibleIndicator;

    public boolean flexibleIndicator()
    {
        if (!hasFlexibleIndicator)
        {
            throw new IllegalArgumentException("No value for optional field: FlexibleIndicator");
        }

        return flexibleIndicator;
    }

    public boolean hasFlexibleIndicator()
    {
        return hasFlexibleIndicator;
    }



    private boolean flexProductEligibilityIndicator;

    private boolean hasFlexProductEligibilityIndicator;

    public boolean flexProductEligibilityIndicator()
    {
        if (!hasFlexProductEligibilityIndicator)
        {
            throw new IllegalArgumentException("No value for optional field: FlexProductEligibilityIndicator");
        }

        return flexProductEligibilityIndicator;
    }

    public boolean hasFlexProductEligibilityIndicator()
    {
        return hasFlexProductEligibilityIndicator;
    }



    private char[] timeUnit = new char[1];

    private boolean hasTimeUnit;

    public char[] timeUnit()
    {
        if (!hasTimeUnit)
        {
            throw new IllegalArgumentException("No value for optional field: TimeUnit");
        }

        return timeUnit;
    }

    public boolean hasTimeUnit()
    {
        return hasTimeUnit;
    }


    private int timeUnitOffset;

    private int timeUnitLength;

    public int timeUnitLength()
    {
        if (!hasTimeUnit)
        {
            throw new IllegalArgumentException("No value for optional field: TimeUnit");
        }

        return timeUnitLength;
    }

    public String timeUnitAsString()
    {
        return hasTimeUnit ? new String(timeUnit, 0, timeUnitLength) : null;
    }

    public void timeUnit(final AsciiSequenceView view)
    {
        if (!hasTimeUnit)
        {
            throw new IllegalArgumentException("No value for optional field: TimeUnit");
        }

        view.wrap(buffer, timeUnitOffset, timeUnitLength);
    }


    private final CharArrayWrapper timeUnitWrapper = new CharArrayWrapper();
    public TimeUnit timeUnitAsEnum()
    {
        if (!hasTimeUnit)
 return TimeUnit.NULL_VAL;
        timeUnitWrapper.wrap(this.timeUnit(), timeUnitLength);
        return TimeUnit.decode(timeUnitWrapper);
    }

    private DecimalFloat couponRate = DecimalFloat.newNaNValue();

    private boolean hasCouponRate;

    public DecimalFloat couponRate()
    {
        if (!hasCouponRate)
        {
            throw new IllegalArgumentException("No value for optional field: CouponRate");
        }

        return couponRate;
    }

    public boolean hasCouponRate()
    {
        return hasCouponRate;
    }



    private char[] securityExchange = new char[1];

    private boolean hasSecurityExchange;

    public char[] securityExchange()
    {
        if (!hasSecurityExchange)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityExchange");
        }

        return securityExchange;
    }

    public boolean hasSecurityExchange()
    {
        return hasSecurityExchange;
    }


    private int securityExchangeOffset;

    private int securityExchangeLength;

    public int securityExchangeLength()
    {
        if (!hasSecurityExchange)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityExchange");
        }

        return securityExchangeLength;
    }

    public String securityExchangeAsString()
    {
        return hasSecurityExchange ? new String(securityExchange, 0, securityExchangeLength) : null;
    }

    public void securityExchange(final AsciiSequenceView view)
    {
        if (!hasSecurityExchange)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityExchange");
        }

        view.wrap(buffer, securityExchangeOffset, securityExchangeLength);
    }


    private int positionLimit = MISSING_INT;

    private boolean hasPositionLimit;

    public int positionLimit()
    {
        if (!hasPositionLimit)
        {
            throw new IllegalArgumentException("No value for optional field: PositionLimit");
        }

        return positionLimit;
    }

    public boolean hasPositionLimit()
    {
        return hasPositionLimit;
    }



    private int nTPositionLimit = MISSING_INT;

    private boolean hasNTPositionLimit;

    public int nTPositionLimit()
    {
        if (!hasNTPositionLimit)
        {
            throw new IllegalArgumentException("No value for optional field: NTPositionLimit");
        }

        return nTPositionLimit;
    }

    public boolean hasNTPositionLimit()
    {
        return hasNTPositionLimit;
    }



    private char[] issuer = new char[1];

    private boolean hasIssuer;

    public char[] issuer()
    {
        if (!hasIssuer)
        {
            throw new IllegalArgumentException("No value for optional field: Issuer");
        }

        return issuer;
    }

    public boolean hasIssuer()
    {
        return hasIssuer;
    }


    private int issuerOffset;

    private int issuerLength;

    public int issuerLength()
    {
        if (!hasIssuer)
        {
            throw new IllegalArgumentException("No value for optional field: Issuer");
        }

        return issuerLength;
    }

    public String issuerAsString()
    {
        return hasIssuer ? new String(issuer, 0, issuerLength) : null;
    }

    public void issuer(final AsciiSequenceView view)
    {
        if (!hasIssuer)
        {
            throw new IllegalArgumentException("No value for optional field: Issuer");
        }

        view.wrap(buffer, issuerOffset, issuerLength);
    }


    private final CharArrayWrapper issuerWrapper = new CharArrayWrapper();
    private int encodedIssuerLen = MISSING_INT;

    private boolean hasEncodedIssuerLen;

    public int encodedIssuerLen()
    {
        if (!hasEncodedIssuerLen)
        {
            throw new IllegalArgumentException("No value for optional field: EncodedIssuerLen");
        }

        return encodedIssuerLen;
    }

    public boolean hasEncodedIssuerLen()
    {
        return hasEncodedIssuerLen;
    }



    private byte[] encodedIssuer = new byte[1];

    private boolean hasEncodedIssuer;

    public byte[] encodedIssuer()
    {
        if (!hasEncodedIssuer)
        {
            throw new IllegalArgumentException("No value for optional field: EncodedIssuer");
        }

        return encodedIssuer;
    }

    public boolean hasEncodedIssuer()
    {
        return hasEncodedIssuer;
    }



    private char[] securityDesc = new char[1];

    private boolean hasSecurityDesc;

    public char[] securityDesc()
    {
        if (!hasSecurityDesc)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityDesc");
        }

        return securityDesc;
    }

    public boolean hasSecurityDesc()
    {
        return hasSecurityDesc;
    }


    private int securityDescOffset;

    private int securityDescLength;

    public int securityDescLength()
    {
        if (!hasSecurityDesc)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityDesc");
        }

        return securityDescLength;
    }

    public String securityDescAsString()
    {
        return hasSecurityDesc ? new String(securityDesc, 0, securityDescLength) : null;
    }

    public void securityDesc(final AsciiSequenceView view)
    {
        if (!hasSecurityDesc)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityDesc");
        }

        view.wrap(buffer, securityDescOffset, securityDescLength);
    }


    private final CharArrayWrapper securityDescWrapper = new CharArrayWrapper();
    private int encodedSecurityDescLen = MISSING_INT;

    private boolean hasEncodedSecurityDescLen;

    public int encodedSecurityDescLen()
    {
        if (!hasEncodedSecurityDescLen)
        {
            throw new IllegalArgumentException("No value for optional field: EncodedSecurityDescLen");
        }

        return encodedSecurityDescLen;
    }

    public boolean hasEncodedSecurityDescLen()
    {
        return hasEncodedSecurityDescLen;
    }



    private byte[] encodedSecurityDesc = new byte[1];

    private boolean hasEncodedSecurityDesc;

    public byte[] encodedSecurityDesc()
    {
        if (!hasEncodedSecurityDesc)
        {
            throw new IllegalArgumentException("No value for optional field: EncodedSecurityDesc");
        }

        return encodedSecurityDesc;
    }

    public boolean hasEncodedSecurityDesc()
    {
        return hasEncodedSecurityDesc;
    }




    private int securityXMLLen = MISSING_INT;

    private boolean hasSecurityXMLLen;

    public int securityXMLLen()
    {
        if (!hasSecurityXMLLen)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityXMLLen");
        }

        return securityXMLLen;
    }

    public boolean hasSecurityXMLLen()
    {
        return hasSecurityXMLLen;
    }



    private byte[] securityXML = new byte[1];

    private boolean hasSecurityXML;

    public byte[] securityXML()
    {
        if (!hasSecurityXML)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityXML");
        }

        return securityXML;
    }

    public boolean hasSecurityXML()
    {
        return hasSecurityXML;
    }



    private char[] securityXMLSchema = new char[1];

    private boolean hasSecurityXMLSchema;

    public char[] securityXMLSchema()
    {
        if (!hasSecurityXMLSchema)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityXMLSchema");
        }

        return securityXMLSchema;
    }

    public boolean hasSecurityXMLSchema()
    {
        return hasSecurityXMLSchema;
    }


    private int securityXMLSchemaOffset;

    private int securityXMLSchemaLength;

    public int securityXMLSchemaLength()
    {
        if (!hasSecurityXMLSchema)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityXMLSchema");
        }

        return securityXMLSchemaLength;
    }

    public String securityXMLSchemaAsString()
    {
        return hasSecurityXMLSchema ? new String(securityXMLSchema, 0, securityXMLSchemaLength) : null;
    }

    public void securityXMLSchema(final AsciiSequenceView view)
    {
        if (!hasSecurityXMLSchema)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityXMLSchema");
        }

        view.wrap(buffer, securityXMLSchemaOffset, securityXMLSchemaLength);
    }


    private final CharArrayWrapper securityXMLSchemaWrapper = new CharArrayWrapper();

    private char[] pool = new char[1];

    private boolean hasPool;

    public char[] pool()
    {
        if (!hasPool)
        {
            throw new IllegalArgumentException("No value for optional field: Pool");
        }

        return pool;
    }

    public boolean hasPool()
    {
        return hasPool;
    }


    private int poolOffset;

    private int poolLength;

    public int poolLength()
    {
        if (!hasPool)
        {
            throw new IllegalArgumentException("No value for optional field: Pool");
        }

        return poolLength;
    }

    public String poolAsString()
    {
        return hasPool ? new String(pool, 0, poolLength) : null;
    }

    public void pool(final AsciiSequenceView view)
    {
        if (!hasPool)
        {
            throw new IllegalArgumentException("No value for optional field: Pool");
        }

        view.wrap(buffer, poolOffset, poolLength);
    }


    private final CharArrayWrapper poolWrapper = new CharArrayWrapper();
    private byte[] contractSettlMonth = new byte[8];

    private boolean hasContractSettlMonth;

    public byte[] contractSettlMonth()
    {
        if (!hasContractSettlMonth)
        {
            throw new IllegalArgumentException("No value for optional field: ContractSettlMonth");
        }

        return contractSettlMonth;
    }

    public boolean hasContractSettlMonth()
    {
        return hasContractSettlMonth;
    }


    private int contractSettlMonthOffset;

    private int contractSettlMonthLength;

    public int contractSettlMonthLength()
    {
        if (!hasContractSettlMonth)
        {
            throw new IllegalArgumentException("No value for optional field: ContractSettlMonth");
        }

        return contractSettlMonthLength;
    }

    public String contractSettlMonthAsString()
    {
        return hasContractSettlMonth ? new String(contractSettlMonth, 0, contractSettlMonthLength) : null;
    }

    public void contractSettlMonth(final AsciiSequenceView view)
    {
        if (!hasContractSettlMonth)
        {
            throw new IllegalArgumentException("No value for optional field: ContractSettlMonth");
        }

        view.wrap(buffer, contractSettlMonthOffset, contractSettlMonthLength);
    }


    private int cPProgram = MISSING_INT;

    private boolean hasCPProgram;

    public int cPProgram()
    {
        if (!hasCPProgram)
        {
            throw new IllegalArgumentException("No value for optional field: CPProgram");
        }

        return cPProgram;
    }

    public boolean hasCPProgram()
    {
        return hasCPProgram;
    }



    private final CharArrayWrapper cPProgramWrapper = new CharArrayWrapper();
    public CPProgram cPProgramAsEnum()
    {
        if (!hasCPProgram)
 return CPProgram.NULL_VAL;
        return CPProgram.decode(cPProgram);
    }

    private char[] cPRegType = new char[1];

    private boolean hasCPRegType;

    public char[] cPRegType()
    {
        if (!hasCPRegType)
        {
            throw new IllegalArgumentException("No value for optional field: CPRegType");
        }

        return cPRegType;
    }

    public boolean hasCPRegType()
    {
        return hasCPRegType;
    }


    private int cPRegTypeOffset;

    private int cPRegTypeLength;

    public int cPRegTypeLength()
    {
        if (!hasCPRegType)
        {
            throw new IllegalArgumentException("No value for optional field: CPRegType");
        }

        return cPRegTypeLength;
    }

    public String cPRegTypeAsString()
    {
        return hasCPRegType ? new String(cPRegType, 0, cPRegTypeLength) : null;
    }

    public void cPRegType(final AsciiSequenceView view)
    {
        if (!hasCPRegType)
        {
            throw new IllegalArgumentException("No value for optional field: CPRegType");
        }

        view.wrap(buffer, cPRegTypeOffset, cPRegTypeLength);
    }


    private final CharArrayWrapper cPRegTypeWrapper = new CharArrayWrapper();


    private EventsGroupDecoder eventsGroup = null;
    public EventsGroupDecoder eventsGroup()
    {
        return eventsGroup;
    }

    private int noEventsGroupCounter = MISSING_INT;

    private boolean hasNoEventsGroupCounter;

    public int noEventsGroupCounter()
    {
        if (!hasNoEventsGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoEventsGroupCounter");
        }

        return noEventsGroupCounter;
    }

    public boolean hasNoEventsGroupCounter()
    {
        return hasNoEventsGroupCounter;
    }




    private EventsGroupIterator eventsGroupIterator = new EventsGroupIterator(this);
    public EventsGroupIterator eventsGroupIterator()
    {
        return eventsGroupIterator.iterator();
    }


    private byte[] datedDate = new byte[8];

    private boolean hasDatedDate;

    public byte[] datedDate()
    {
        if (!hasDatedDate)
        {
            throw new IllegalArgumentException("No value for optional field: DatedDate");
        }

        return datedDate;
    }

    public boolean hasDatedDate()
    {
        return hasDatedDate;
    }


    private int datedDateOffset;

    private int datedDateLength;

    public int datedDateLength()
    {
        if (!hasDatedDate)
        {
            throw new IllegalArgumentException("No value for optional field: DatedDate");
        }

        return datedDateLength;
    }

    public String datedDateAsString()
    {
        return hasDatedDate ? new String(datedDate, 0, datedDateLength) : null;
    }

    public void datedDate(final AsciiSequenceView view)
    {
        if (!hasDatedDate)
        {
            throw new IllegalArgumentException("No value for optional field: DatedDate");
        }

        view.wrap(buffer, datedDateOffset, datedDateLength);
    }


    private byte[] interestAccrualDate = new byte[8];

    private boolean hasInterestAccrualDate;

    public byte[] interestAccrualDate()
    {
        if (!hasInterestAccrualDate)
        {
            throw new IllegalArgumentException("No value for optional field: InterestAccrualDate");
        }

        return interestAccrualDate;
    }

    public boolean hasInterestAccrualDate()
    {
        return hasInterestAccrualDate;
    }


    private int interestAccrualDateOffset;

    private int interestAccrualDateLength;

    public int interestAccrualDateLength()
    {
        if (!hasInterestAccrualDate)
        {
            throw new IllegalArgumentException("No value for optional field: InterestAccrualDate");
        }

        return interestAccrualDateLength;
    }

    public String interestAccrualDateAsString()
    {
        return hasInterestAccrualDate ? new String(interestAccrualDate, 0, interestAccrualDateLength) : null;
    }

    public void interestAccrualDate(final AsciiSequenceView view)
    {
        if (!hasInterestAccrualDate)
        {
            throw new IllegalArgumentException("No value for optional field: InterestAccrualDate");
        }

        view.wrap(buffer, interestAccrualDateOffset, interestAccrualDateLength);
    }




    private InstrumentPartiesGroupDecoder instrumentPartiesGroup = null;
    public InstrumentPartiesGroupDecoder instrumentPartiesGroup()
    {
        return instrumentPartiesGroup;
    }

    private int noInstrumentPartiesGroupCounter = MISSING_INT;

    private boolean hasNoInstrumentPartiesGroupCounter;

    public int noInstrumentPartiesGroupCounter()
    {
        if (!hasNoInstrumentPartiesGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoInstrumentPartiesGroupCounter");
        }

        return noInstrumentPartiesGroupCounter;
    }

    public boolean hasNoInstrumentPartiesGroupCounter()
    {
        return hasNoInstrumentPartiesGroupCounter;
    }




    private InstrumentPartiesGroupIterator instrumentPartiesGroupIterator = new InstrumentPartiesGroupIterator(this);
    public InstrumentPartiesGroupIterator instrumentPartiesGroupIterator()
    {
        return instrumentPartiesGroupIterator.iterator();
    }




    private ComplexEventsGroupDecoder complexEventsGroup = null;
    public ComplexEventsGroupDecoder complexEventsGroup()
    {
        return complexEventsGroup;
    }

    private int noComplexEventsGroupCounter = MISSING_INT;

    private boolean hasNoComplexEventsGroupCounter;

    public int noComplexEventsGroupCounter()
    {
        if (!hasNoComplexEventsGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoComplexEventsGroupCounter");
        }

        return noComplexEventsGroupCounter;
    }

    public boolean hasNoComplexEventsGroupCounter()
    {
        return hasNoComplexEventsGroupCounter;
    }




    private ComplexEventsGroupIterator complexEventsGroupIterator = new ComplexEventsGroupIterator(this);
    public ComplexEventsGroupIterator complexEventsGroupIterator()
    {
        return complexEventsGroupIterator.iterator();
    }





    private UnderlyingsGroupDecoder underlyingsGroup = null;
    public UnderlyingsGroupDecoder underlyingsGroup()
    {
        return underlyingsGroup;
    }

    private int noUnderlyingsGroupCounter = MISSING_INT;

    private boolean hasNoUnderlyingsGroupCounter;

    public int noUnderlyingsGroupCounter()
    {
        if (!hasNoUnderlyingsGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoUnderlyingsGroupCounter");
        }

        return noUnderlyingsGroupCounter;
    }

    public boolean hasNoUnderlyingsGroupCounter()
    {
        return hasNoUnderlyingsGroupCounter;
    }




    private UnderlyingsGroupIterator underlyingsGroupIterator = new UnderlyingsGroupIterator(this);
    public UnderlyingsGroupIterator underlyingsGroupIterator()
    {
        return underlyingsGroupIterator.iterator();
    }


    private DecimalFloat prevClosePx = DecimalFloat.newNaNValue();

    private boolean hasPrevClosePx;

    public DecimalFloat prevClosePx()
    {
        if (!hasPrevClosePx)
        {
            throw new IllegalArgumentException("No value for optional field: PrevClosePx");
        }

        return prevClosePx;
    }

    public boolean hasPrevClosePx()
    {
        return hasPrevClosePx;
    }



    private char side = MISSING_CHAR;

    public char side()
    {
        return side;
    }



    private final CharArrayWrapper sideWrapper = new CharArrayWrapper();
    public Side sideAsEnum()
    {
        return Side.decode(side);
    }

    private int sideValueInd = MISSING_INT;

    private boolean hasSideValueInd;

    public int sideValueInd()
    {
        if (!hasSideValueInd)
        {
            throw new IllegalArgumentException("No value for optional field: SideValueInd");
        }

        return sideValueInd;
    }

    public boolean hasSideValueInd()
    {
        return hasSideValueInd;
    }



    private final CharArrayWrapper sideValueIndWrapper = new CharArrayWrapper();
    public SideValueInd sideValueIndAsEnum()
    {
        if (!hasSideValueInd)
 return SideValueInd.NULL_VAL;
        return SideValueInd.decode(sideValueInd);
    }

    private boolean locateReqd;

    private boolean hasLocateReqd;

    public boolean locateReqd()
    {
        if (!hasLocateReqd)
        {
            throw new IllegalArgumentException("No value for optional field: LocateReqd");
        }

        return locateReqd;
    }

    public boolean hasLocateReqd()
    {
        return hasLocateReqd;
    }



    private byte[] transactTime = new byte[24];

    private boolean hasTransactTime;

    public byte[] transactTime()
    {
        if (!hasTransactTime)
        {
            throw new IllegalArgumentException("No value for optional field: TransactTime");
        }

        return transactTime;
    }

    public boolean hasTransactTime()
    {
        return hasTransactTime;
    }


    private int transactTimeOffset;

    private int transactTimeLength;

    public int transactTimeLength()
    {
        if (!hasTransactTime)
        {
            throw new IllegalArgumentException("No value for optional field: TransactTime");
        }

        return transactTimeLength;
    }

    public String transactTimeAsString()
    {
        return hasTransactTime ? new String(transactTime, 0, transactTimeLength) : null;
    }

    public void transactTime(final AsciiSequenceView view)
    {
        if (!hasTransactTime)
        {
            throw new IllegalArgumentException("No value for optional field: TransactTime");
        }

        view.wrap(buffer, transactTimeOffset, transactTimeLength);
    }




    private StipulationsGroupDecoder stipulationsGroup = null;
    public StipulationsGroupDecoder stipulationsGroup()
    {
        return stipulationsGroup;
    }

    private int noStipulationsGroupCounter = MISSING_INT;

    private boolean hasNoStipulationsGroupCounter;

    public int noStipulationsGroupCounter()
    {
        if (!hasNoStipulationsGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoStipulationsGroupCounter");
        }

        return noStipulationsGroupCounter;
    }

    public boolean hasNoStipulationsGroupCounter()
    {
        return hasNoStipulationsGroupCounter;
    }




    private StipulationsGroupIterator stipulationsGroupIterator = new StipulationsGroupIterator(this);
    public StipulationsGroupIterator stipulationsGroupIterator()
    {
        return stipulationsGroupIterator.iterator();
    }


    private int qtyType = MISSING_INT;

    private boolean hasQtyType;

    public int qtyType()
    {
        if (!hasQtyType)
        {
            throw new IllegalArgumentException("No value for optional field: QtyType");
        }

        return qtyType;
    }

    public boolean hasQtyType()
    {
        return hasQtyType;
    }



    private final CharArrayWrapper qtyTypeWrapper = new CharArrayWrapper();
    public QtyType qtyTypeAsEnum()
    {
        if (!hasQtyType)
 return QtyType.NULL_VAL;
        return QtyType.decode(qtyType);
    }


    private DecimalFloat orderQty = DecimalFloat.newNaNValue();

    private boolean hasOrderQty;

    public DecimalFloat orderQty()
    {
        if (!hasOrderQty)
        {
            throw new IllegalArgumentException("No value for optional field: OrderQty");
        }

        return orderQty;
    }

    public boolean hasOrderQty()
    {
        return hasOrderQty;
    }



    private DecimalFloat cashOrderQty = DecimalFloat.newNaNValue();

    private boolean hasCashOrderQty;

    public DecimalFloat cashOrderQty()
    {
        if (!hasCashOrderQty)
        {
            throw new IllegalArgumentException("No value for optional field: CashOrderQty");
        }

        return cashOrderQty;
    }

    public boolean hasCashOrderQty()
    {
        return hasCashOrderQty;
    }



    private DecimalFloat orderPercent = DecimalFloat.newNaNValue();

    private boolean hasOrderPercent;

    public DecimalFloat orderPercent()
    {
        if (!hasOrderPercent)
        {
            throw new IllegalArgumentException("No value for optional field: OrderPercent");
        }

        return orderPercent;
    }

    public boolean hasOrderPercent()
    {
        return hasOrderPercent;
    }



    private char roundingDirection = MISSING_CHAR;

    private boolean hasRoundingDirection;

    public char roundingDirection()
    {
        if (!hasRoundingDirection)
        {
            throw new IllegalArgumentException("No value for optional field: RoundingDirection");
        }

        return roundingDirection;
    }

    public boolean hasRoundingDirection()
    {
        return hasRoundingDirection;
    }



    private final CharArrayWrapper roundingDirectionWrapper = new CharArrayWrapper();
    public RoundingDirection roundingDirectionAsEnum()
    {
        if (!hasRoundingDirection)
 return RoundingDirection.NULL_VAL;
        return RoundingDirection.decode(roundingDirection);
    }

    private DecimalFloat roundingModulus = DecimalFloat.newNaNValue();

    private boolean hasRoundingModulus;

    public DecimalFloat roundingModulus()
    {
        if (!hasRoundingModulus)
        {
            throw new IllegalArgumentException("No value for optional field: RoundingModulus");
        }

        return roundingModulus;
    }

    public boolean hasRoundingModulus()
    {
        return hasRoundingModulus;
    }




    private char ordType = MISSING_CHAR;

    private boolean hasOrdType;

    public char ordType()
    {
        if (!hasOrdType)
        {
            throw new IllegalArgumentException("No value for optional field: OrdType");
        }

        return ordType;
    }

    public boolean hasOrdType()
    {
        return hasOrdType;
    }



    private final CharArrayWrapper ordTypeWrapper = new CharArrayWrapper();
    public OrdType ordTypeAsEnum()
    {
        if (!hasOrdType)
 return OrdType.NULL_VAL;
        return OrdType.decode(ordType);
    }

    private int priceType = MISSING_INT;

    private boolean hasPriceType;

    public int priceType()
    {
        if (!hasPriceType)
        {
            throw new IllegalArgumentException("No value for optional field: PriceType");
        }

        return priceType;
    }

    public boolean hasPriceType()
    {
        return hasPriceType;
    }



    private final CharArrayWrapper priceTypeWrapper = new CharArrayWrapper();
    public PriceType priceTypeAsEnum()
    {
        if (!hasPriceType)
 return PriceType.NULL_VAL;
        return PriceType.decode(priceType);
    }

    private DecimalFloat price = DecimalFloat.newNaNValue();

    private boolean hasPrice;

    public DecimalFloat price()
    {
        if (!hasPrice)
        {
            throw new IllegalArgumentException("No value for optional field: Price");
        }

        return price;
    }

    public boolean hasPrice()
    {
        return hasPrice;
    }



    private char priceProtectionScope = MISSING_CHAR;

    private boolean hasPriceProtectionScope;

    public char priceProtectionScope()
    {
        if (!hasPriceProtectionScope)
        {
            throw new IllegalArgumentException("No value for optional field: PriceProtectionScope");
        }

        return priceProtectionScope;
    }

    public boolean hasPriceProtectionScope()
    {
        return hasPriceProtectionScope;
    }



    private final CharArrayWrapper priceProtectionScopeWrapper = new CharArrayWrapper();
    public PriceProtectionScope priceProtectionScopeAsEnum()
    {
        if (!hasPriceProtectionScope)
 return PriceProtectionScope.NULL_VAL;
        return PriceProtectionScope.decode(priceProtectionScope);
    }

    private DecimalFloat stopPx = DecimalFloat.newNaNValue();

    private boolean hasStopPx;

    public DecimalFloat stopPx()
    {
        if (!hasStopPx)
        {
            throw new IllegalArgumentException("No value for optional field: StopPx");
        }

        return stopPx;
    }

    public boolean hasStopPx()
    {
        return hasStopPx;
    }




    private char triggerType = MISSING_CHAR;

    private boolean hasTriggerType;

    public char triggerType()
    {
        if (!hasTriggerType)
        {
            throw new IllegalArgumentException("No value for optional field: TriggerType");
        }

        return triggerType;
    }

    public boolean hasTriggerType()
    {
        return hasTriggerType;
    }



    private final CharArrayWrapper triggerTypeWrapper = new CharArrayWrapper();
    public TriggerType triggerTypeAsEnum()
    {
        if (!hasTriggerType)
 return TriggerType.NULL_VAL;
        return TriggerType.decode(triggerType);
    }

    private char triggerAction = MISSING_CHAR;

    private boolean hasTriggerAction;

    public char triggerAction()
    {
        if (!hasTriggerAction)
        {
            throw new IllegalArgumentException("No value for optional field: TriggerAction");
        }

        return triggerAction;
    }

    public boolean hasTriggerAction()
    {
        return hasTriggerAction;
    }



    private final CharArrayWrapper triggerActionWrapper = new CharArrayWrapper();
    public TriggerAction triggerActionAsEnum()
    {
        if (!hasTriggerAction)
 return TriggerAction.NULL_VAL;
        return TriggerAction.decode(triggerAction);
    }

    private DecimalFloat triggerPrice = DecimalFloat.newNaNValue();

    private boolean hasTriggerPrice;

    public DecimalFloat triggerPrice()
    {
        if (!hasTriggerPrice)
        {
            throw new IllegalArgumentException("No value for optional field: TriggerPrice");
        }

        return triggerPrice;
    }

    public boolean hasTriggerPrice()
    {
        return hasTriggerPrice;
    }



    private char[] triggerSymbol = new char[1];

    private boolean hasTriggerSymbol;

    public char[] triggerSymbol()
    {
        if (!hasTriggerSymbol)
        {
            throw new IllegalArgumentException("No value for optional field: TriggerSymbol");
        }

        return triggerSymbol;
    }

    public boolean hasTriggerSymbol()
    {
        return hasTriggerSymbol;
    }


    private int triggerSymbolOffset;

    private int triggerSymbolLength;

    public int triggerSymbolLength()
    {
        if (!hasTriggerSymbol)
        {
            throw new IllegalArgumentException("No value for optional field: TriggerSymbol");
        }

        return triggerSymbolLength;
    }

    public String triggerSymbolAsString()
    {
        return hasTriggerSymbol ? new String(triggerSymbol, 0, triggerSymbolLength) : null;
    }

    public void triggerSymbol(final AsciiSequenceView view)
    {
        if (!hasTriggerSymbol)
        {
            throw new IllegalArgumentException("No value for optional field: TriggerSymbol");
        }

        view.wrap(buffer, triggerSymbolOffset, triggerSymbolLength);
    }


    private final CharArrayWrapper triggerSymbolWrapper = new CharArrayWrapper();
    private char[] triggerSecurityID = new char[1];

    private boolean hasTriggerSecurityID;

    public char[] triggerSecurityID()
    {
        if (!hasTriggerSecurityID)
        {
            throw new IllegalArgumentException("No value for optional field: TriggerSecurityID");
        }

        return triggerSecurityID;
    }

    public boolean hasTriggerSecurityID()
    {
        return hasTriggerSecurityID;
    }


    private int triggerSecurityIDOffset;

    private int triggerSecurityIDLength;

    public int triggerSecurityIDLength()
    {
        if (!hasTriggerSecurityID)
        {
            throw new IllegalArgumentException("No value for optional field: TriggerSecurityID");
        }

        return triggerSecurityIDLength;
    }

    public String triggerSecurityIDAsString()
    {
        return hasTriggerSecurityID ? new String(triggerSecurityID, 0, triggerSecurityIDLength) : null;
    }

    public void triggerSecurityID(final AsciiSequenceView view)
    {
        if (!hasTriggerSecurityID)
        {
            throw new IllegalArgumentException("No value for optional field: TriggerSecurityID");
        }

        view.wrap(buffer, triggerSecurityIDOffset, triggerSecurityIDLength);
    }


    private final CharArrayWrapper triggerSecurityIDWrapper = new CharArrayWrapper();
    private char[] triggerSecurityIDSource = new char[1];

    private boolean hasTriggerSecurityIDSource;

    public char[] triggerSecurityIDSource()
    {
        if (!hasTriggerSecurityIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: TriggerSecurityIDSource");
        }

        return triggerSecurityIDSource;
    }

    public boolean hasTriggerSecurityIDSource()
    {
        return hasTriggerSecurityIDSource;
    }


    private int triggerSecurityIDSourceOffset;

    private int triggerSecurityIDSourceLength;

    public int triggerSecurityIDSourceLength()
    {
        if (!hasTriggerSecurityIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: TriggerSecurityIDSource");
        }

        return triggerSecurityIDSourceLength;
    }

    public String triggerSecurityIDSourceAsString()
    {
        return hasTriggerSecurityIDSource ? new String(triggerSecurityIDSource, 0, triggerSecurityIDSourceLength) : null;
    }

    public void triggerSecurityIDSource(final AsciiSequenceView view)
    {
        if (!hasTriggerSecurityIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: TriggerSecurityIDSource");
        }

        view.wrap(buffer, triggerSecurityIDSourceOffset, triggerSecurityIDSourceLength);
    }


    private final CharArrayWrapper triggerSecurityIDSourceWrapper = new CharArrayWrapper();
    private char[] triggerSecurityDesc = new char[1];

    private boolean hasTriggerSecurityDesc;

    public char[] triggerSecurityDesc()
    {
        if (!hasTriggerSecurityDesc)
        {
            throw new IllegalArgumentException("No value for optional field: TriggerSecurityDesc");
        }

        return triggerSecurityDesc;
    }

    public boolean hasTriggerSecurityDesc()
    {
        return hasTriggerSecurityDesc;
    }


    private int triggerSecurityDescOffset;

    private int triggerSecurityDescLength;

    public int triggerSecurityDescLength()
    {
        if (!hasTriggerSecurityDesc)
        {
            throw new IllegalArgumentException("No value for optional field: TriggerSecurityDesc");
        }

        return triggerSecurityDescLength;
    }

    public String triggerSecurityDescAsString()
    {
        return hasTriggerSecurityDesc ? new String(triggerSecurityDesc, 0, triggerSecurityDescLength) : null;
    }

    public void triggerSecurityDesc(final AsciiSequenceView view)
    {
        if (!hasTriggerSecurityDesc)
        {
            throw new IllegalArgumentException("No value for optional field: TriggerSecurityDesc");
        }

        view.wrap(buffer, triggerSecurityDescOffset, triggerSecurityDescLength);
    }


    private final CharArrayWrapper triggerSecurityDescWrapper = new CharArrayWrapper();
    private char triggerPriceType = MISSING_CHAR;

    private boolean hasTriggerPriceType;

    public char triggerPriceType()
    {
        if (!hasTriggerPriceType)
        {
            throw new IllegalArgumentException("No value for optional field: TriggerPriceType");
        }

        return triggerPriceType;
    }

    public boolean hasTriggerPriceType()
    {
        return hasTriggerPriceType;
    }



    private final CharArrayWrapper triggerPriceTypeWrapper = new CharArrayWrapper();
    public TriggerPriceType triggerPriceTypeAsEnum()
    {
        if (!hasTriggerPriceType)
 return TriggerPriceType.NULL_VAL;
        return TriggerPriceType.decode(triggerPriceType);
    }

    private char triggerPriceTypeScope = MISSING_CHAR;

    private boolean hasTriggerPriceTypeScope;

    public char triggerPriceTypeScope()
    {
        if (!hasTriggerPriceTypeScope)
        {
            throw new IllegalArgumentException("No value for optional field: TriggerPriceTypeScope");
        }

        return triggerPriceTypeScope;
    }

    public boolean hasTriggerPriceTypeScope()
    {
        return hasTriggerPriceTypeScope;
    }



    private final CharArrayWrapper triggerPriceTypeScopeWrapper = new CharArrayWrapper();
    public TriggerPriceTypeScope triggerPriceTypeScopeAsEnum()
    {
        if (!hasTriggerPriceTypeScope)
 return TriggerPriceTypeScope.NULL_VAL;
        return TriggerPriceTypeScope.decode(triggerPriceTypeScope);
    }

    private char triggerPriceDirection = MISSING_CHAR;

    private boolean hasTriggerPriceDirection;

    public char triggerPriceDirection()
    {
        if (!hasTriggerPriceDirection)
        {
            throw new IllegalArgumentException("No value for optional field: TriggerPriceDirection");
        }

        return triggerPriceDirection;
    }

    public boolean hasTriggerPriceDirection()
    {
        return hasTriggerPriceDirection;
    }



    private final CharArrayWrapper triggerPriceDirectionWrapper = new CharArrayWrapper();
    public TriggerPriceDirection triggerPriceDirectionAsEnum()
    {
        if (!hasTriggerPriceDirection)
 return TriggerPriceDirection.NULL_VAL;
        return TriggerPriceDirection.decode(triggerPriceDirection);
    }

    private DecimalFloat triggerNewPrice = DecimalFloat.newNaNValue();

    private boolean hasTriggerNewPrice;

    public DecimalFloat triggerNewPrice()
    {
        if (!hasTriggerNewPrice)
        {
            throw new IllegalArgumentException("No value for optional field: TriggerNewPrice");
        }

        return triggerNewPrice;
    }

    public boolean hasTriggerNewPrice()
    {
        return hasTriggerNewPrice;
    }



    private char triggerOrderType = MISSING_CHAR;

    private boolean hasTriggerOrderType;

    public char triggerOrderType()
    {
        if (!hasTriggerOrderType)
        {
            throw new IllegalArgumentException("No value for optional field: TriggerOrderType");
        }

        return triggerOrderType;
    }

    public boolean hasTriggerOrderType()
    {
        return hasTriggerOrderType;
    }



    private final CharArrayWrapper triggerOrderTypeWrapper = new CharArrayWrapper();
    public TriggerOrderType triggerOrderTypeAsEnum()
    {
        if (!hasTriggerOrderType)
 return TriggerOrderType.NULL_VAL;
        return TriggerOrderType.decode(triggerOrderType);
    }

    private DecimalFloat triggerNewQty = DecimalFloat.newNaNValue();

    private boolean hasTriggerNewQty;

    public DecimalFloat triggerNewQty()
    {
        if (!hasTriggerNewQty)
        {
            throw new IllegalArgumentException("No value for optional field: TriggerNewQty");
        }

        return triggerNewQty;
    }

    public boolean hasTriggerNewQty()
    {
        return hasTriggerNewQty;
    }



    private char[] triggerTradingSessionID = new char[1];

    private boolean hasTriggerTradingSessionID;

    public char[] triggerTradingSessionID()
    {
        if (!hasTriggerTradingSessionID)
        {
            throw new IllegalArgumentException("No value for optional field: TriggerTradingSessionID");
        }

        return triggerTradingSessionID;
    }

    public boolean hasTriggerTradingSessionID()
    {
        return hasTriggerTradingSessionID;
    }


    private int triggerTradingSessionIDOffset;

    private int triggerTradingSessionIDLength;

    public int triggerTradingSessionIDLength()
    {
        if (!hasTriggerTradingSessionID)
        {
            throw new IllegalArgumentException("No value for optional field: TriggerTradingSessionID");
        }

        return triggerTradingSessionIDLength;
    }

    public String triggerTradingSessionIDAsString()
    {
        return hasTriggerTradingSessionID ? new String(triggerTradingSessionID, 0, triggerTradingSessionIDLength) : null;
    }

    public void triggerTradingSessionID(final AsciiSequenceView view)
    {
        if (!hasTriggerTradingSessionID)
        {
            throw new IllegalArgumentException("No value for optional field: TriggerTradingSessionID");
        }

        view.wrap(buffer, triggerTradingSessionIDOffset, triggerTradingSessionIDLength);
    }


    private final CharArrayWrapper triggerTradingSessionIDWrapper = new CharArrayWrapper();
    private char[] triggerTradingSessionSubID = new char[1];

    private boolean hasTriggerTradingSessionSubID;

    public char[] triggerTradingSessionSubID()
    {
        if (!hasTriggerTradingSessionSubID)
        {
            throw new IllegalArgumentException("No value for optional field: TriggerTradingSessionSubID");
        }

        return triggerTradingSessionSubID;
    }

    public boolean hasTriggerTradingSessionSubID()
    {
        return hasTriggerTradingSessionSubID;
    }


    private int triggerTradingSessionSubIDOffset;

    private int triggerTradingSessionSubIDLength;

    public int triggerTradingSessionSubIDLength()
    {
        if (!hasTriggerTradingSessionSubID)
        {
            throw new IllegalArgumentException("No value for optional field: TriggerTradingSessionSubID");
        }

        return triggerTradingSessionSubIDLength;
    }

    public String triggerTradingSessionSubIDAsString()
    {
        return hasTriggerTradingSessionSubID ? new String(triggerTradingSessionSubID, 0, triggerTradingSessionSubIDLength) : null;
    }

    public void triggerTradingSessionSubID(final AsciiSequenceView view)
    {
        if (!hasTriggerTradingSessionSubID)
        {
            throw new IllegalArgumentException("No value for optional field: TriggerTradingSessionSubID");
        }

        view.wrap(buffer, triggerTradingSessionSubIDOffset, triggerTradingSessionSubIDLength);
    }


    private final CharArrayWrapper triggerTradingSessionSubIDWrapper = new CharArrayWrapper();


    private DecimalFloat spread = DecimalFloat.newNaNValue();

    private boolean hasSpread;

    public DecimalFloat spread()
    {
        if (!hasSpread)
        {
            throw new IllegalArgumentException("No value for optional field: Spread");
        }

        return spread;
    }

    public boolean hasSpread()
    {
        return hasSpread;
    }



    private char[] benchmarkCurveCurrency = new char[1];

    private boolean hasBenchmarkCurveCurrency;

    public char[] benchmarkCurveCurrency()
    {
        if (!hasBenchmarkCurveCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: BenchmarkCurveCurrency");
        }

        return benchmarkCurveCurrency;
    }

    public boolean hasBenchmarkCurveCurrency()
    {
        return hasBenchmarkCurveCurrency;
    }


    private int benchmarkCurveCurrencyOffset;

    private int benchmarkCurveCurrencyLength;

    public int benchmarkCurveCurrencyLength()
    {
        if (!hasBenchmarkCurveCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: BenchmarkCurveCurrency");
        }

        return benchmarkCurveCurrencyLength;
    }

    public String benchmarkCurveCurrencyAsString()
    {
        return hasBenchmarkCurveCurrency ? new String(benchmarkCurveCurrency, 0, benchmarkCurveCurrencyLength) : null;
    }

    public void benchmarkCurveCurrency(final AsciiSequenceView view)
    {
        if (!hasBenchmarkCurveCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: BenchmarkCurveCurrency");
        }

        view.wrap(buffer, benchmarkCurveCurrencyOffset, benchmarkCurveCurrencyLength);
    }


    private char[] benchmarkCurveName = new char[1];

    private boolean hasBenchmarkCurveName;

    public char[] benchmarkCurveName()
    {
        if (!hasBenchmarkCurveName)
        {
            throw new IllegalArgumentException("No value for optional field: BenchmarkCurveName");
        }

        return benchmarkCurveName;
    }

    public boolean hasBenchmarkCurveName()
    {
        return hasBenchmarkCurveName;
    }


    private int benchmarkCurveNameOffset;

    private int benchmarkCurveNameLength;

    public int benchmarkCurveNameLength()
    {
        if (!hasBenchmarkCurveName)
        {
            throw new IllegalArgumentException("No value for optional field: BenchmarkCurveName");
        }

        return benchmarkCurveNameLength;
    }

    public String benchmarkCurveNameAsString()
    {
        return hasBenchmarkCurveName ? new String(benchmarkCurveName, 0, benchmarkCurveNameLength) : null;
    }

    public void benchmarkCurveName(final AsciiSequenceView view)
    {
        if (!hasBenchmarkCurveName)
        {
            throw new IllegalArgumentException("No value for optional field: BenchmarkCurveName");
        }

        view.wrap(buffer, benchmarkCurveNameOffset, benchmarkCurveNameLength);
    }


    private final CharArrayWrapper benchmarkCurveNameWrapper = new CharArrayWrapper();
    public BenchmarkCurveName benchmarkCurveNameAsEnum()
    {
        if (!hasBenchmarkCurveName)
 return BenchmarkCurveName.NULL_VAL;
        benchmarkCurveNameWrapper.wrap(this.benchmarkCurveName(), benchmarkCurveNameLength);
        return BenchmarkCurveName.decode(benchmarkCurveNameWrapper);
    }

    private char[] benchmarkCurvePoint = new char[1];

    private boolean hasBenchmarkCurvePoint;

    public char[] benchmarkCurvePoint()
    {
        if (!hasBenchmarkCurvePoint)
        {
            throw new IllegalArgumentException("No value for optional field: BenchmarkCurvePoint");
        }

        return benchmarkCurvePoint;
    }

    public boolean hasBenchmarkCurvePoint()
    {
        return hasBenchmarkCurvePoint;
    }


    private int benchmarkCurvePointOffset;

    private int benchmarkCurvePointLength;

    public int benchmarkCurvePointLength()
    {
        if (!hasBenchmarkCurvePoint)
        {
            throw new IllegalArgumentException("No value for optional field: BenchmarkCurvePoint");
        }

        return benchmarkCurvePointLength;
    }

    public String benchmarkCurvePointAsString()
    {
        return hasBenchmarkCurvePoint ? new String(benchmarkCurvePoint, 0, benchmarkCurvePointLength) : null;
    }

    public void benchmarkCurvePoint(final AsciiSequenceView view)
    {
        if (!hasBenchmarkCurvePoint)
        {
            throw new IllegalArgumentException("No value for optional field: BenchmarkCurvePoint");
        }

        view.wrap(buffer, benchmarkCurvePointOffset, benchmarkCurvePointLength);
    }


    private final CharArrayWrapper benchmarkCurvePointWrapper = new CharArrayWrapper();
    private DecimalFloat benchmarkPrice = DecimalFloat.newNaNValue();

    private boolean hasBenchmarkPrice;

    public DecimalFloat benchmarkPrice()
    {
        if (!hasBenchmarkPrice)
        {
            throw new IllegalArgumentException("No value for optional field: BenchmarkPrice");
        }

        return benchmarkPrice;
    }

    public boolean hasBenchmarkPrice()
    {
        return hasBenchmarkPrice;
    }



    private int benchmarkPriceType = MISSING_INT;

    private boolean hasBenchmarkPriceType;

    public int benchmarkPriceType()
    {
        if (!hasBenchmarkPriceType)
        {
            throw new IllegalArgumentException("No value for optional field: BenchmarkPriceType");
        }

        return benchmarkPriceType;
    }

    public boolean hasBenchmarkPriceType()
    {
        return hasBenchmarkPriceType;
    }



    private char[] benchmarkSecurityID = new char[1];

    private boolean hasBenchmarkSecurityID;

    public char[] benchmarkSecurityID()
    {
        if (!hasBenchmarkSecurityID)
        {
            throw new IllegalArgumentException("No value for optional field: BenchmarkSecurityID");
        }

        return benchmarkSecurityID;
    }

    public boolean hasBenchmarkSecurityID()
    {
        return hasBenchmarkSecurityID;
    }


    private int benchmarkSecurityIDOffset;

    private int benchmarkSecurityIDLength;

    public int benchmarkSecurityIDLength()
    {
        if (!hasBenchmarkSecurityID)
        {
            throw new IllegalArgumentException("No value for optional field: BenchmarkSecurityID");
        }

        return benchmarkSecurityIDLength;
    }

    public String benchmarkSecurityIDAsString()
    {
        return hasBenchmarkSecurityID ? new String(benchmarkSecurityID, 0, benchmarkSecurityIDLength) : null;
    }

    public void benchmarkSecurityID(final AsciiSequenceView view)
    {
        if (!hasBenchmarkSecurityID)
        {
            throw new IllegalArgumentException("No value for optional field: BenchmarkSecurityID");
        }

        view.wrap(buffer, benchmarkSecurityIDOffset, benchmarkSecurityIDLength);
    }


    private final CharArrayWrapper benchmarkSecurityIDWrapper = new CharArrayWrapper();
    private char[] benchmarkSecurityIDSource = new char[1];

    private boolean hasBenchmarkSecurityIDSource;

    public char[] benchmarkSecurityIDSource()
    {
        if (!hasBenchmarkSecurityIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: BenchmarkSecurityIDSource");
        }

        return benchmarkSecurityIDSource;
    }

    public boolean hasBenchmarkSecurityIDSource()
    {
        return hasBenchmarkSecurityIDSource;
    }


    private int benchmarkSecurityIDSourceOffset;

    private int benchmarkSecurityIDSourceLength;

    public int benchmarkSecurityIDSourceLength()
    {
        if (!hasBenchmarkSecurityIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: BenchmarkSecurityIDSource");
        }

        return benchmarkSecurityIDSourceLength;
    }

    public String benchmarkSecurityIDSourceAsString()
    {
        return hasBenchmarkSecurityIDSource ? new String(benchmarkSecurityIDSource, 0, benchmarkSecurityIDSourceLength) : null;
    }

    public void benchmarkSecurityIDSource(final AsciiSequenceView view)
    {
        if (!hasBenchmarkSecurityIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: BenchmarkSecurityIDSource");
        }

        view.wrap(buffer, benchmarkSecurityIDSourceOffset, benchmarkSecurityIDSourceLength);
    }


    private final CharArrayWrapper benchmarkSecurityIDSourceWrapper = new CharArrayWrapper();


    private char[] yieldType = new char[1];

    private boolean hasYieldType;

    public char[] yieldType()
    {
        if (!hasYieldType)
        {
            throw new IllegalArgumentException("No value for optional field: YieldType");
        }

        return yieldType;
    }

    public boolean hasYieldType()
    {
        return hasYieldType;
    }


    private int yieldTypeOffset;

    private int yieldTypeLength;

    public int yieldTypeLength()
    {
        if (!hasYieldType)
        {
            throw new IllegalArgumentException("No value for optional field: YieldType");
        }

        return yieldTypeLength;
    }

    public String yieldTypeAsString()
    {
        return hasYieldType ? new String(yieldType, 0, yieldTypeLength) : null;
    }

    public void yieldType(final AsciiSequenceView view)
    {
        if (!hasYieldType)
        {
            throw new IllegalArgumentException("No value for optional field: YieldType");
        }

        view.wrap(buffer, yieldTypeOffset, yieldTypeLength);
    }


    private final CharArrayWrapper yieldTypeWrapper = new CharArrayWrapper();
    public YieldType yieldTypeAsEnum()
    {
        if (!hasYieldType)
 return YieldType.NULL_VAL;
        yieldTypeWrapper.wrap(this.yieldType(), yieldTypeLength);
        return YieldType.decode(yieldTypeWrapper);
    }

    private DecimalFloat yield = DecimalFloat.newNaNValue();

    private boolean hasYield;

    public DecimalFloat yield()
    {
        if (!hasYield)
        {
            throw new IllegalArgumentException("No value for optional field: Yield");
        }

        return yield;
    }

    public boolean hasYield()
    {
        return hasYield;
    }



    private byte[] yieldCalcDate = new byte[8];

    private boolean hasYieldCalcDate;

    public byte[] yieldCalcDate()
    {
        if (!hasYieldCalcDate)
        {
            throw new IllegalArgumentException("No value for optional field: YieldCalcDate");
        }

        return yieldCalcDate;
    }

    public boolean hasYieldCalcDate()
    {
        return hasYieldCalcDate;
    }


    private int yieldCalcDateOffset;

    private int yieldCalcDateLength;

    public int yieldCalcDateLength()
    {
        if (!hasYieldCalcDate)
        {
            throw new IllegalArgumentException("No value for optional field: YieldCalcDate");
        }

        return yieldCalcDateLength;
    }

    public String yieldCalcDateAsString()
    {
        return hasYieldCalcDate ? new String(yieldCalcDate, 0, yieldCalcDateLength) : null;
    }

    public void yieldCalcDate(final AsciiSequenceView view)
    {
        if (!hasYieldCalcDate)
        {
            throw new IllegalArgumentException("No value for optional field: YieldCalcDate");
        }

        view.wrap(buffer, yieldCalcDateOffset, yieldCalcDateLength);
    }


    private byte[] yieldRedemptionDate = new byte[8];

    private boolean hasYieldRedemptionDate;

    public byte[] yieldRedemptionDate()
    {
        if (!hasYieldRedemptionDate)
        {
            throw new IllegalArgumentException("No value for optional field: YieldRedemptionDate");
        }

        return yieldRedemptionDate;
    }

    public boolean hasYieldRedemptionDate()
    {
        return hasYieldRedemptionDate;
    }


    private int yieldRedemptionDateOffset;

    private int yieldRedemptionDateLength;

    public int yieldRedemptionDateLength()
    {
        if (!hasYieldRedemptionDate)
        {
            throw new IllegalArgumentException("No value for optional field: YieldRedemptionDate");
        }

        return yieldRedemptionDateLength;
    }

    public String yieldRedemptionDateAsString()
    {
        return hasYieldRedemptionDate ? new String(yieldRedemptionDate, 0, yieldRedemptionDateLength) : null;
    }

    public void yieldRedemptionDate(final AsciiSequenceView view)
    {
        if (!hasYieldRedemptionDate)
        {
            throw new IllegalArgumentException("No value for optional field: YieldRedemptionDate");
        }

        view.wrap(buffer, yieldRedemptionDateOffset, yieldRedemptionDateLength);
    }


    private DecimalFloat yieldRedemptionPrice = DecimalFloat.newNaNValue();

    private boolean hasYieldRedemptionPrice;

    public DecimalFloat yieldRedemptionPrice()
    {
        if (!hasYieldRedemptionPrice)
        {
            throw new IllegalArgumentException("No value for optional field: YieldRedemptionPrice");
        }

        return yieldRedemptionPrice;
    }

    public boolean hasYieldRedemptionPrice()
    {
        return hasYieldRedemptionPrice;
    }



    private int yieldRedemptionPriceType = MISSING_INT;

    private boolean hasYieldRedemptionPriceType;

    public int yieldRedemptionPriceType()
    {
        if (!hasYieldRedemptionPriceType)
        {
            throw new IllegalArgumentException("No value for optional field: YieldRedemptionPriceType");
        }

        return yieldRedemptionPriceType;
    }

    public boolean hasYieldRedemptionPriceType()
    {
        return hasYieldRedemptionPriceType;
    }




    private char[] currency = new char[1];

    private boolean hasCurrency;

    public char[] currency()
    {
        if (!hasCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: Currency");
        }

        return currency;
    }

    public boolean hasCurrency()
    {
        return hasCurrency;
    }


    private int currencyOffset;

    private int currencyLength;

    public int currencyLength()
    {
        if (!hasCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: Currency");
        }

        return currencyLength;
    }

    public String currencyAsString()
    {
        return hasCurrency ? new String(currency, 0, currencyLength) : null;
    }

    public void currency(final AsciiSequenceView view)
    {
        if (!hasCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: Currency");
        }

        view.wrap(buffer, currencyOffset, currencyLength);
    }


    private char[] complianceID = new char[1];

    private boolean hasComplianceID;

    public char[] complianceID()
    {
        if (!hasComplianceID)
        {
            throw new IllegalArgumentException("No value for optional field: ComplianceID");
        }

        return complianceID;
    }

    public boolean hasComplianceID()
    {
        return hasComplianceID;
    }


    private int complianceIDOffset;

    private int complianceIDLength;

    public int complianceIDLength()
    {
        if (!hasComplianceID)
        {
            throw new IllegalArgumentException("No value for optional field: ComplianceID");
        }

        return complianceIDLength;
    }

    public String complianceIDAsString()
    {
        return hasComplianceID ? new String(complianceID, 0, complianceIDLength) : null;
    }

    public void complianceID(final AsciiSequenceView view)
    {
        if (!hasComplianceID)
        {
            throw new IllegalArgumentException("No value for optional field: ComplianceID");
        }

        view.wrap(buffer, complianceIDOffset, complianceIDLength);
    }


    private final CharArrayWrapper complianceIDWrapper = new CharArrayWrapper();
    private boolean solicitedFlag;

    private boolean hasSolicitedFlag;

    public boolean solicitedFlag()
    {
        if (!hasSolicitedFlag)
        {
            throw new IllegalArgumentException("No value for optional field: SolicitedFlag");
        }

        return solicitedFlag;
    }

    public boolean hasSolicitedFlag()
    {
        return hasSolicitedFlag;
    }



    private char[] iOIID = new char[1];

    private boolean hasIOIID;

    public char[] iOIID()
    {
        if (!hasIOIID)
        {
            throw new IllegalArgumentException("No value for optional field: IOIID");
        }

        return iOIID;
    }

    public boolean hasIOIID()
    {
        return hasIOIID;
    }


    private int iOIIDOffset;

    private int iOIIDLength;

    public int iOIIDLength()
    {
        if (!hasIOIID)
        {
            throw new IllegalArgumentException("No value for optional field: IOIID");
        }

        return iOIIDLength;
    }

    public String iOIIDAsString()
    {
        return hasIOIID ? new String(iOIID, 0, iOIIDLength) : null;
    }

    public void iOIID(final AsciiSequenceView view)
    {
        if (!hasIOIID)
        {
            throw new IllegalArgumentException("No value for optional field: IOIID");
        }

        view.wrap(buffer, iOIIDOffset, iOIIDLength);
    }


    private final CharArrayWrapper iOIIDWrapper = new CharArrayWrapper();
    private char[] quoteID = new char[1];

    private boolean hasQuoteID;

    public char[] quoteID()
    {
        if (!hasQuoteID)
        {
            throw new IllegalArgumentException("No value for optional field: QuoteID");
        }

        return quoteID;
    }

    public boolean hasQuoteID()
    {
        return hasQuoteID;
    }


    private int quoteIDOffset;

    private int quoteIDLength;

    public int quoteIDLength()
    {
        if (!hasQuoteID)
        {
            throw new IllegalArgumentException("No value for optional field: QuoteID");
        }

        return quoteIDLength;
    }

    public String quoteIDAsString()
    {
        return hasQuoteID ? new String(quoteID, 0, quoteIDLength) : null;
    }

    public void quoteID(final AsciiSequenceView view)
    {
        if (!hasQuoteID)
        {
            throw new IllegalArgumentException("No value for optional field: QuoteID");
        }

        view.wrap(buffer, quoteIDOffset, quoteIDLength);
    }


    private final CharArrayWrapper quoteIDWrapper = new CharArrayWrapper();
    private char[] refOrderID = new char[1];

    private boolean hasRefOrderID;

    public char[] refOrderID()
    {
        if (!hasRefOrderID)
        {
            throw new IllegalArgumentException("No value for optional field: RefOrderID");
        }

        return refOrderID;
    }

    public boolean hasRefOrderID()
    {
        return hasRefOrderID;
    }


    private int refOrderIDOffset;

    private int refOrderIDLength;

    public int refOrderIDLength()
    {
        if (!hasRefOrderID)
        {
            throw new IllegalArgumentException("No value for optional field: RefOrderID");
        }

        return refOrderIDLength;
    }

    public String refOrderIDAsString()
    {
        return hasRefOrderID ? new String(refOrderID, 0, refOrderIDLength) : null;
    }

    public void refOrderID(final AsciiSequenceView view)
    {
        if (!hasRefOrderID)
        {
            throw new IllegalArgumentException("No value for optional field: RefOrderID");
        }

        view.wrap(buffer, refOrderIDOffset, refOrderIDLength);
    }


    private final CharArrayWrapper refOrderIDWrapper = new CharArrayWrapper();
    private char refOrderIDSource = MISSING_CHAR;

    private boolean hasRefOrderIDSource;

    public char refOrderIDSource()
    {
        if (!hasRefOrderIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: RefOrderIDSource");
        }

        return refOrderIDSource;
    }

    public boolean hasRefOrderIDSource()
    {
        return hasRefOrderIDSource;
    }



    private final CharArrayWrapper refOrderIDSourceWrapper = new CharArrayWrapper();
    public RefOrderIDSource refOrderIDSourceAsEnum()
    {
        if (!hasRefOrderIDSource)
 return RefOrderIDSource.NULL_VAL;
        return RefOrderIDSource.decode(refOrderIDSource);
    }

    private char timeInForce = MISSING_CHAR;

    private boolean hasTimeInForce;

    public char timeInForce()
    {
        if (!hasTimeInForce)
        {
            throw new IllegalArgumentException("No value for optional field: TimeInForce");
        }

        return timeInForce;
    }

    public boolean hasTimeInForce()
    {
        return hasTimeInForce;
    }



    private final CharArrayWrapper timeInForceWrapper = new CharArrayWrapper();
    public TimeInForce timeInForceAsEnum()
    {
        if (!hasTimeInForce)
 return TimeInForce.NULL_VAL;
        return TimeInForce.decode(timeInForce);
    }

    private byte[] effectiveTime = new byte[24];

    private boolean hasEffectiveTime;

    public byte[] effectiveTime()
    {
        if (!hasEffectiveTime)
        {
            throw new IllegalArgumentException("No value for optional field: EffectiveTime");
        }

        return effectiveTime;
    }

    public boolean hasEffectiveTime()
    {
        return hasEffectiveTime;
    }


    private int effectiveTimeOffset;

    private int effectiveTimeLength;

    public int effectiveTimeLength()
    {
        if (!hasEffectiveTime)
        {
            throw new IllegalArgumentException("No value for optional field: EffectiveTime");
        }

        return effectiveTimeLength;
    }

    public String effectiveTimeAsString()
    {
        return hasEffectiveTime ? new String(effectiveTime, 0, effectiveTimeLength) : null;
    }

    public void effectiveTime(final AsciiSequenceView view)
    {
        if (!hasEffectiveTime)
        {
            throw new IllegalArgumentException("No value for optional field: EffectiveTime");
        }

        view.wrap(buffer, effectiveTimeOffset, effectiveTimeLength);
    }


    private byte[] expireDate = new byte[8];

    private boolean hasExpireDate;

    public byte[] expireDate()
    {
        if (!hasExpireDate)
        {
            throw new IllegalArgumentException("No value for optional field: ExpireDate");
        }

        return expireDate;
    }

    public boolean hasExpireDate()
    {
        return hasExpireDate;
    }


    private int expireDateOffset;

    private int expireDateLength;

    public int expireDateLength()
    {
        if (!hasExpireDate)
        {
            throw new IllegalArgumentException("No value for optional field: ExpireDate");
        }

        return expireDateLength;
    }

    public String expireDateAsString()
    {
        return hasExpireDate ? new String(expireDate, 0, expireDateLength) : null;
    }

    public void expireDate(final AsciiSequenceView view)
    {
        if (!hasExpireDate)
        {
            throw new IllegalArgumentException("No value for optional field: ExpireDate");
        }

        view.wrap(buffer, expireDateOffset, expireDateLength);
    }


    private byte[] expireTime = new byte[24];

    private boolean hasExpireTime;

    public byte[] expireTime()
    {
        if (!hasExpireTime)
        {
            throw new IllegalArgumentException("No value for optional field: ExpireTime");
        }

        return expireTime;
    }

    public boolean hasExpireTime()
    {
        return hasExpireTime;
    }


    private int expireTimeOffset;

    private int expireTimeLength;

    public int expireTimeLength()
    {
        if (!hasExpireTime)
        {
            throw new IllegalArgumentException("No value for optional field: ExpireTime");
        }

        return expireTimeLength;
    }

    public String expireTimeAsString()
    {
        return hasExpireTime ? new String(expireTime, 0, expireTimeLength) : null;
    }

    public void expireTime(final AsciiSequenceView view)
    {
        if (!hasExpireTime)
        {
            throw new IllegalArgumentException("No value for optional field: ExpireTime");
        }

        view.wrap(buffer, expireTimeOffset, expireTimeLength);
    }


    private int gTBookingInst = MISSING_INT;

    private boolean hasGTBookingInst;

    public int gTBookingInst()
    {
        if (!hasGTBookingInst)
        {
            throw new IllegalArgumentException("No value for optional field: GTBookingInst");
        }

        return gTBookingInst;
    }

    public boolean hasGTBookingInst()
    {
        return hasGTBookingInst;
    }



    private final CharArrayWrapper gTBookingInstWrapper = new CharArrayWrapper();
    public GTBookingInst gTBookingInstAsEnum()
    {
        if (!hasGTBookingInst)
 return GTBookingInst.NULL_VAL;
        return GTBookingInst.decode(gTBookingInst);
    }


    private DecimalFloat commission = DecimalFloat.newNaNValue();

    private boolean hasCommission;

    public DecimalFloat commission()
    {
        if (!hasCommission)
        {
            throw new IllegalArgumentException("No value for optional field: Commission");
        }

        return commission;
    }

    public boolean hasCommission()
    {
        return hasCommission;
    }



    private char commType = MISSING_CHAR;

    private boolean hasCommType;

    public char commType()
    {
        if (!hasCommType)
        {
            throw new IllegalArgumentException("No value for optional field: CommType");
        }

        return commType;
    }

    public boolean hasCommType()
    {
        return hasCommType;
    }



    private final CharArrayWrapper commTypeWrapper = new CharArrayWrapper();
    public CommType commTypeAsEnum()
    {
        if (!hasCommType)
 return CommType.NULL_VAL;
        return CommType.decode(commType);
    }

    private char[] commCurrency = new char[1];

    private boolean hasCommCurrency;

    public char[] commCurrency()
    {
        if (!hasCommCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: CommCurrency");
        }

        return commCurrency;
    }

    public boolean hasCommCurrency()
    {
        return hasCommCurrency;
    }


    private int commCurrencyOffset;

    private int commCurrencyLength;

    public int commCurrencyLength()
    {
        if (!hasCommCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: CommCurrency");
        }

        return commCurrencyLength;
    }

    public String commCurrencyAsString()
    {
        return hasCommCurrency ? new String(commCurrency, 0, commCurrencyLength) : null;
    }

    public void commCurrency(final AsciiSequenceView view)
    {
        if (!hasCommCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: CommCurrency");
        }

        view.wrap(buffer, commCurrencyOffset, commCurrencyLength);
    }


    private char fundRenewWaiv = MISSING_CHAR;

    private boolean hasFundRenewWaiv;

    public char fundRenewWaiv()
    {
        if (!hasFundRenewWaiv)
        {
            throw new IllegalArgumentException("No value for optional field: FundRenewWaiv");
        }

        return fundRenewWaiv;
    }

    public boolean hasFundRenewWaiv()
    {
        return hasFundRenewWaiv;
    }



    private final CharArrayWrapper fundRenewWaivWrapper = new CharArrayWrapper();
    public FundRenewWaiv fundRenewWaivAsEnum()
    {
        if (!hasFundRenewWaiv)
 return FundRenewWaiv.NULL_VAL;
        return FundRenewWaiv.decode(fundRenewWaiv);
    }


    private char orderCapacity = MISSING_CHAR;

    private boolean hasOrderCapacity;

    public char orderCapacity()
    {
        if (!hasOrderCapacity)
        {
            throw new IllegalArgumentException("No value for optional field: OrderCapacity");
        }

        return orderCapacity;
    }

    public boolean hasOrderCapacity()
    {
        return hasOrderCapacity;
    }



    private final CharArrayWrapper orderCapacityWrapper = new CharArrayWrapper();
    public OrderCapacity orderCapacityAsEnum()
    {
        if (!hasOrderCapacity)
 return OrderCapacity.NULL_VAL;
        return OrderCapacity.decode(orderCapacity);
    }

    private char[] orderRestrictions = new char[1];

    private boolean hasOrderRestrictions;

    public char[] orderRestrictions()
    {
        if (!hasOrderRestrictions)
        {
            throw new IllegalArgumentException("No value for optional field: OrderRestrictions");
        }

        return orderRestrictions;
    }

    public boolean hasOrderRestrictions()
    {
        return hasOrderRestrictions;
    }


    private int orderRestrictionsOffset;

    private int orderRestrictionsLength;

    public int orderRestrictionsLength()
    {
        if (!hasOrderRestrictions)
        {
            throw new IllegalArgumentException("No value for optional field: OrderRestrictions");
        }

        return orderRestrictionsLength;
    }

    public String orderRestrictionsAsString()
    {
        return hasOrderRestrictions ? new String(orderRestrictions, 0, orderRestrictionsLength) : null;
    }

    public void orderRestrictions(final AsciiSequenceView view)
    {
        if (!hasOrderRestrictions)
        {
            throw new IllegalArgumentException("No value for optional field: OrderRestrictions");
        }

        view.wrap(buffer, orderRestrictionsOffset, orderRestrictionsLength);
    }


    private final CharArrayWrapper orderRestrictionsWrapper = new CharArrayWrapper();
    private boolean preTradeAnonymity;

    private boolean hasPreTradeAnonymity;

    public boolean preTradeAnonymity()
    {
        if (!hasPreTradeAnonymity)
        {
            throw new IllegalArgumentException("No value for optional field: PreTradeAnonymity");
        }

        return preTradeAnonymity;
    }

    public boolean hasPreTradeAnonymity()
    {
        return hasPreTradeAnonymity;
    }



    private int custOrderCapacity = MISSING_INT;

    private boolean hasCustOrderCapacity;

    public int custOrderCapacity()
    {
        if (!hasCustOrderCapacity)
        {
            throw new IllegalArgumentException("No value for optional field: CustOrderCapacity");
        }

        return custOrderCapacity;
    }

    public boolean hasCustOrderCapacity()
    {
        return hasCustOrderCapacity;
    }



    private final CharArrayWrapper custOrderCapacityWrapper = new CharArrayWrapper();
    public CustOrderCapacity custOrderCapacityAsEnum()
    {
        if (!hasCustOrderCapacity)
 return CustOrderCapacity.NULL_VAL;
        return CustOrderCapacity.decode(custOrderCapacity);
    }

    private boolean forexReq;

    private boolean hasForexReq;

    public boolean forexReq()
    {
        if (!hasForexReq)
        {
            throw new IllegalArgumentException("No value for optional field: ForexReq");
        }

        return forexReq;
    }

    public boolean hasForexReq()
    {
        return hasForexReq;
    }



    private char[] settlCurrency = new char[1];

    private boolean hasSettlCurrency;

    public char[] settlCurrency()
    {
        if (!hasSettlCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: SettlCurrency");
        }

        return settlCurrency;
    }

    public boolean hasSettlCurrency()
    {
        return hasSettlCurrency;
    }


    private int settlCurrencyOffset;

    private int settlCurrencyLength;

    public int settlCurrencyLength()
    {
        if (!hasSettlCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: SettlCurrency");
        }

        return settlCurrencyLength;
    }

    public String settlCurrencyAsString()
    {
        return hasSettlCurrency ? new String(settlCurrency, 0, settlCurrencyLength) : null;
    }

    public void settlCurrency(final AsciiSequenceView view)
    {
        if (!hasSettlCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: SettlCurrency");
        }

        view.wrap(buffer, settlCurrencyOffset, settlCurrencyLength);
    }


    private int bookingType = MISSING_INT;

    private boolean hasBookingType;

    public int bookingType()
    {
        if (!hasBookingType)
        {
            throw new IllegalArgumentException("No value for optional field: BookingType");
        }

        return bookingType;
    }

    public boolean hasBookingType()
    {
        return hasBookingType;
    }



    private final CharArrayWrapper bookingTypeWrapper = new CharArrayWrapper();
    public BookingType bookingTypeAsEnum()
    {
        if (!hasBookingType)
 return BookingType.NULL_VAL;
        return BookingType.decode(bookingType);
    }

    private char[] text = new char[1];

    private boolean hasText;

    public char[] text()
    {
        if (!hasText)
        {
            throw new IllegalArgumentException("No value for optional field: Text");
        }

        return text;
    }

    public boolean hasText()
    {
        return hasText;
    }


    private int textOffset;

    private int textLength;

    public int textLength()
    {
        if (!hasText)
        {
            throw new IllegalArgumentException("No value for optional field: Text");
        }

        return textLength;
    }

    public String textAsString()
    {
        return hasText ? new String(text, 0, textLength) : null;
    }

    public void text(final AsciiSequenceView view)
    {
        if (!hasText)
        {
            throw new IllegalArgumentException("No value for optional field: Text");
        }

        view.wrap(buffer, textOffset, textLength);
    }


    private final CharArrayWrapper textWrapper = new CharArrayWrapper();
    private int encodedTextLen = MISSING_INT;

    private boolean hasEncodedTextLen;

    public int encodedTextLen()
    {
        if (!hasEncodedTextLen)
        {
            throw new IllegalArgumentException("No value for optional field: EncodedTextLen");
        }

        return encodedTextLen;
    }

    public boolean hasEncodedTextLen()
    {
        return hasEncodedTextLen;
    }



    private byte[] encodedText = new byte[1];

    private boolean hasEncodedText;

    public byte[] encodedText()
    {
        if (!hasEncodedText)
        {
            throw new IllegalArgumentException("No value for optional field: EncodedText");
        }

        return encodedText;
    }

    public boolean hasEncodedText()
    {
        return hasEncodedText;
    }



    private byte[] settlDate2 = new byte[8];

    private boolean hasSettlDate2;

    public byte[] settlDate2()
    {
        if (!hasSettlDate2)
        {
            throw new IllegalArgumentException("No value for optional field: SettlDate2");
        }

        return settlDate2;
    }

    public boolean hasSettlDate2()
    {
        return hasSettlDate2;
    }


    private int settlDate2Offset;

    private int settlDate2Length;

    public int settlDate2Length()
    {
        if (!hasSettlDate2)
        {
            throw new IllegalArgumentException("No value for optional field: SettlDate2");
        }

        return settlDate2Length;
    }

    public String settlDate2AsString()
    {
        return hasSettlDate2 ? new String(settlDate2, 0, settlDate2Length) : null;
    }

    public void settlDate2(final AsciiSequenceView view)
    {
        if (!hasSettlDate2)
        {
            throw new IllegalArgumentException("No value for optional field: SettlDate2");
        }

        view.wrap(buffer, settlDate2Offset, settlDate2Length);
    }


    private DecimalFloat orderQty2 = DecimalFloat.newNaNValue();

    private boolean hasOrderQty2;

    public DecimalFloat orderQty2()
    {
        if (!hasOrderQty2)
        {
            throw new IllegalArgumentException("No value for optional field: OrderQty2");
        }

        return orderQty2;
    }

    public boolean hasOrderQty2()
    {
        return hasOrderQty2;
    }



    private DecimalFloat price2 = DecimalFloat.newNaNValue();

    private boolean hasPrice2;

    public DecimalFloat price2()
    {
        if (!hasPrice2)
        {
            throw new IllegalArgumentException("No value for optional field: Price2");
        }

        return price2;
    }

    public boolean hasPrice2()
    {
        return hasPrice2;
    }



    private char positionEffect = MISSING_CHAR;

    private boolean hasPositionEffect;

    public char positionEffect()
    {
        if (!hasPositionEffect)
        {
            throw new IllegalArgumentException("No value for optional field: PositionEffect");
        }

        return positionEffect;
    }

    public boolean hasPositionEffect()
    {
        return hasPositionEffect;
    }



    private final CharArrayWrapper positionEffectWrapper = new CharArrayWrapper();
    public PositionEffect positionEffectAsEnum()
    {
        if (!hasPositionEffect)
 return PositionEffect.NULL_VAL;
        return PositionEffect.decode(positionEffect);
    }

    private int coveredOrUncovered = MISSING_INT;

    private boolean hasCoveredOrUncovered;

    public int coveredOrUncovered()
    {
        if (!hasCoveredOrUncovered)
        {
            throw new IllegalArgumentException("No value for optional field: CoveredOrUncovered");
        }

        return coveredOrUncovered;
    }

    public boolean hasCoveredOrUncovered()
    {
        return hasCoveredOrUncovered;
    }



    private final CharArrayWrapper coveredOrUncoveredWrapper = new CharArrayWrapper();
    public CoveredOrUncovered coveredOrUncoveredAsEnum()
    {
        if (!hasCoveredOrUncovered)
 return CoveredOrUncovered.NULL_VAL;
        return CoveredOrUncovered.decode(coveredOrUncovered);
    }

    private DecimalFloat maxShow = DecimalFloat.newNaNValue();

    private boolean hasMaxShow;

    public DecimalFloat maxShow()
    {
        if (!hasMaxShow)
        {
            throw new IllegalArgumentException("No value for optional field: MaxShow");
        }

        return maxShow;
    }

    public boolean hasMaxShow()
    {
        return hasMaxShow;
    }




    private DecimalFloat pegOffsetValue = DecimalFloat.newNaNValue();

    private boolean hasPegOffsetValue;

    public DecimalFloat pegOffsetValue()
    {
        if (!hasPegOffsetValue)
        {
            throw new IllegalArgumentException("No value for optional field: PegOffsetValue");
        }

        return pegOffsetValue;
    }

    public boolean hasPegOffsetValue()
    {
        return hasPegOffsetValue;
    }



    private int pegPriceType = MISSING_INT;

    private boolean hasPegPriceType;

    public int pegPriceType()
    {
        if (!hasPegPriceType)
        {
            throw new IllegalArgumentException("No value for optional field: PegPriceType");
        }

        return pegPriceType;
    }

    public boolean hasPegPriceType()
    {
        return hasPegPriceType;
    }



    private final CharArrayWrapper pegPriceTypeWrapper = new CharArrayWrapper();
    public PegPriceType pegPriceTypeAsEnum()
    {
        if (!hasPegPriceType)
 return PegPriceType.NULL_VAL;
        return PegPriceType.decode(pegPriceType);
    }

    private int pegMoveType = MISSING_INT;

    private boolean hasPegMoveType;

    public int pegMoveType()
    {
        if (!hasPegMoveType)
        {
            throw new IllegalArgumentException("No value for optional field: PegMoveType");
        }

        return pegMoveType;
    }

    public boolean hasPegMoveType()
    {
        return hasPegMoveType;
    }



    private final CharArrayWrapper pegMoveTypeWrapper = new CharArrayWrapper();
    public PegMoveType pegMoveTypeAsEnum()
    {
        if (!hasPegMoveType)
 return PegMoveType.NULL_VAL;
        return PegMoveType.decode(pegMoveType);
    }

    private int pegOffsetType = MISSING_INT;

    private boolean hasPegOffsetType;

    public int pegOffsetType()
    {
        if (!hasPegOffsetType)
        {
            throw new IllegalArgumentException("No value for optional field: PegOffsetType");
        }

        return pegOffsetType;
    }

    public boolean hasPegOffsetType()
    {
        return hasPegOffsetType;
    }



    private final CharArrayWrapper pegOffsetTypeWrapper = new CharArrayWrapper();
    public PegOffsetType pegOffsetTypeAsEnum()
    {
        if (!hasPegOffsetType)
 return PegOffsetType.NULL_VAL;
        return PegOffsetType.decode(pegOffsetType);
    }

    private int pegLimitType = MISSING_INT;

    private boolean hasPegLimitType;

    public int pegLimitType()
    {
        if (!hasPegLimitType)
        {
            throw new IllegalArgumentException("No value for optional field: PegLimitType");
        }

        return pegLimitType;
    }

    public boolean hasPegLimitType()
    {
        return hasPegLimitType;
    }



    private final CharArrayWrapper pegLimitTypeWrapper = new CharArrayWrapper();
    public PegLimitType pegLimitTypeAsEnum()
    {
        if (!hasPegLimitType)
 return PegLimitType.NULL_VAL;
        return PegLimitType.decode(pegLimitType);
    }

    private int pegRoundDirection = MISSING_INT;

    private boolean hasPegRoundDirection;

    public int pegRoundDirection()
    {
        if (!hasPegRoundDirection)
        {
            throw new IllegalArgumentException("No value for optional field: PegRoundDirection");
        }

        return pegRoundDirection;
    }

    public boolean hasPegRoundDirection()
    {
        return hasPegRoundDirection;
    }



    private final CharArrayWrapper pegRoundDirectionWrapper = new CharArrayWrapper();
    public PegRoundDirection pegRoundDirectionAsEnum()
    {
        if (!hasPegRoundDirection)
 return PegRoundDirection.NULL_VAL;
        return PegRoundDirection.decode(pegRoundDirection);
    }

    private int pegScope = MISSING_INT;

    private boolean hasPegScope;

    public int pegScope()
    {
        if (!hasPegScope)
        {
            throw new IllegalArgumentException("No value for optional field: PegScope");
        }

        return pegScope;
    }

    public boolean hasPegScope()
    {
        return hasPegScope;
    }



    private final CharArrayWrapper pegScopeWrapper = new CharArrayWrapper();
    public PegScope pegScopeAsEnum()
    {
        if (!hasPegScope)
 return PegScope.NULL_VAL;
        return PegScope.decode(pegScope);
    }

    private char[] pegSecurityIDSource = new char[1];

    private boolean hasPegSecurityIDSource;

    public char[] pegSecurityIDSource()
    {
        if (!hasPegSecurityIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: PegSecurityIDSource");
        }

        return pegSecurityIDSource;
    }

    public boolean hasPegSecurityIDSource()
    {
        return hasPegSecurityIDSource;
    }


    private int pegSecurityIDSourceOffset;

    private int pegSecurityIDSourceLength;

    public int pegSecurityIDSourceLength()
    {
        if (!hasPegSecurityIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: PegSecurityIDSource");
        }

        return pegSecurityIDSourceLength;
    }

    public String pegSecurityIDSourceAsString()
    {
        return hasPegSecurityIDSource ? new String(pegSecurityIDSource, 0, pegSecurityIDSourceLength) : null;
    }

    public void pegSecurityIDSource(final AsciiSequenceView view)
    {
        if (!hasPegSecurityIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: PegSecurityIDSource");
        }

        view.wrap(buffer, pegSecurityIDSourceOffset, pegSecurityIDSourceLength);
    }


    private final CharArrayWrapper pegSecurityIDSourceWrapper = new CharArrayWrapper();
    private char[] pegSecurityID = new char[1];

    private boolean hasPegSecurityID;

    public char[] pegSecurityID()
    {
        if (!hasPegSecurityID)
        {
            throw new IllegalArgumentException("No value for optional field: PegSecurityID");
        }

        return pegSecurityID;
    }

    public boolean hasPegSecurityID()
    {
        return hasPegSecurityID;
    }


    private int pegSecurityIDOffset;

    private int pegSecurityIDLength;

    public int pegSecurityIDLength()
    {
        if (!hasPegSecurityID)
        {
            throw new IllegalArgumentException("No value for optional field: PegSecurityID");
        }

        return pegSecurityIDLength;
    }

    public String pegSecurityIDAsString()
    {
        return hasPegSecurityID ? new String(pegSecurityID, 0, pegSecurityIDLength) : null;
    }

    public void pegSecurityID(final AsciiSequenceView view)
    {
        if (!hasPegSecurityID)
        {
            throw new IllegalArgumentException("No value for optional field: PegSecurityID");
        }

        view.wrap(buffer, pegSecurityIDOffset, pegSecurityIDLength);
    }


    private final CharArrayWrapper pegSecurityIDWrapper = new CharArrayWrapper();
    private char[] pegSymbol = new char[1];

    private boolean hasPegSymbol;

    public char[] pegSymbol()
    {
        if (!hasPegSymbol)
        {
            throw new IllegalArgumentException("No value for optional field: PegSymbol");
        }

        return pegSymbol;
    }

    public boolean hasPegSymbol()
    {
        return hasPegSymbol;
    }


    private int pegSymbolOffset;

    private int pegSymbolLength;

    public int pegSymbolLength()
    {
        if (!hasPegSymbol)
        {
            throw new IllegalArgumentException("No value for optional field: PegSymbol");
        }

        return pegSymbolLength;
    }

    public String pegSymbolAsString()
    {
        return hasPegSymbol ? new String(pegSymbol, 0, pegSymbolLength) : null;
    }

    public void pegSymbol(final AsciiSequenceView view)
    {
        if (!hasPegSymbol)
        {
            throw new IllegalArgumentException("No value for optional field: PegSymbol");
        }

        view.wrap(buffer, pegSymbolOffset, pegSymbolLength);
    }


    private final CharArrayWrapper pegSymbolWrapper = new CharArrayWrapper();
    private char[] pegSecurityDesc = new char[1];

    private boolean hasPegSecurityDesc;

    public char[] pegSecurityDesc()
    {
        if (!hasPegSecurityDesc)
        {
            throw new IllegalArgumentException("No value for optional field: PegSecurityDesc");
        }

        return pegSecurityDesc;
    }

    public boolean hasPegSecurityDesc()
    {
        return hasPegSecurityDesc;
    }


    private int pegSecurityDescOffset;

    private int pegSecurityDescLength;

    public int pegSecurityDescLength()
    {
        if (!hasPegSecurityDesc)
        {
            throw new IllegalArgumentException("No value for optional field: PegSecurityDesc");
        }

        return pegSecurityDescLength;
    }

    public String pegSecurityDescAsString()
    {
        return hasPegSecurityDesc ? new String(pegSecurityDesc, 0, pegSecurityDescLength) : null;
    }

    public void pegSecurityDesc(final AsciiSequenceView view)
    {
        if (!hasPegSecurityDesc)
        {
            throw new IllegalArgumentException("No value for optional field: PegSecurityDesc");
        }

        view.wrap(buffer, pegSecurityDescOffset, pegSecurityDescLength);
    }


    private final CharArrayWrapper pegSecurityDescWrapper = new CharArrayWrapper();


    private char discretionInst = MISSING_CHAR;

    private boolean hasDiscretionInst;

    public char discretionInst()
    {
        if (!hasDiscretionInst)
        {
            throw new IllegalArgumentException("No value for optional field: DiscretionInst");
        }

        return discretionInst;
    }

    public boolean hasDiscretionInst()
    {
        return hasDiscretionInst;
    }



    private final CharArrayWrapper discretionInstWrapper = new CharArrayWrapper();
    public DiscretionInst discretionInstAsEnum()
    {
        if (!hasDiscretionInst)
 return DiscretionInst.NULL_VAL;
        return DiscretionInst.decode(discretionInst);
    }

    private DecimalFloat discretionOffsetValue = DecimalFloat.newNaNValue();

    private boolean hasDiscretionOffsetValue;

    public DecimalFloat discretionOffsetValue()
    {
        if (!hasDiscretionOffsetValue)
        {
            throw new IllegalArgumentException("No value for optional field: DiscretionOffsetValue");
        }

        return discretionOffsetValue;
    }

    public boolean hasDiscretionOffsetValue()
    {
        return hasDiscretionOffsetValue;
    }



    private int discretionMoveType = MISSING_INT;

    private boolean hasDiscretionMoveType;

    public int discretionMoveType()
    {
        if (!hasDiscretionMoveType)
        {
            throw new IllegalArgumentException("No value for optional field: DiscretionMoveType");
        }

        return discretionMoveType;
    }

    public boolean hasDiscretionMoveType()
    {
        return hasDiscretionMoveType;
    }



    private final CharArrayWrapper discretionMoveTypeWrapper = new CharArrayWrapper();
    public DiscretionMoveType discretionMoveTypeAsEnum()
    {
        if (!hasDiscretionMoveType)
 return DiscretionMoveType.NULL_VAL;
        return DiscretionMoveType.decode(discretionMoveType);
    }

    private int discretionOffsetType = MISSING_INT;

    private boolean hasDiscretionOffsetType;

    public int discretionOffsetType()
    {
        if (!hasDiscretionOffsetType)
        {
            throw new IllegalArgumentException("No value for optional field: DiscretionOffsetType");
        }

        return discretionOffsetType;
    }

    public boolean hasDiscretionOffsetType()
    {
        return hasDiscretionOffsetType;
    }



    private final CharArrayWrapper discretionOffsetTypeWrapper = new CharArrayWrapper();
    public DiscretionOffsetType discretionOffsetTypeAsEnum()
    {
        if (!hasDiscretionOffsetType)
 return DiscretionOffsetType.NULL_VAL;
        return DiscretionOffsetType.decode(discretionOffsetType);
    }

    private int discretionLimitType = MISSING_INT;

    private boolean hasDiscretionLimitType;

    public int discretionLimitType()
    {
        if (!hasDiscretionLimitType)
        {
            throw new IllegalArgumentException("No value for optional field: DiscretionLimitType");
        }

        return discretionLimitType;
    }

    public boolean hasDiscretionLimitType()
    {
        return hasDiscretionLimitType;
    }



    private final CharArrayWrapper discretionLimitTypeWrapper = new CharArrayWrapper();
    public DiscretionLimitType discretionLimitTypeAsEnum()
    {
        if (!hasDiscretionLimitType)
 return DiscretionLimitType.NULL_VAL;
        return DiscretionLimitType.decode(discretionLimitType);
    }

    private int discretionRoundDirection = MISSING_INT;

    private boolean hasDiscretionRoundDirection;

    public int discretionRoundDirection()
    {
        if (!hasDiscretionRoundDirection)
        {
            throw new IllegalArgumentException("No value for optional field: DiscretionRoundDirection");
        }

        return discretionRoundDirection;
    }

    public boolean hasDiscretionRoundDirection()
    {
        return hasDiscretionRoundDirection;
    }



    private final CharArrayWrapper discretionRoundDirectionWrapper = new CharArrayWrapper();
    public DiscretionRoundDirection discretionRoundDirectionAsEnum()
    {
        if (!hasDiscretionRoundDirection)
 return DiscretionRoundDirection.NULL_VAL;
        return DiscretionRoundDirection.decode(discretionRoundDirection);
    }

    private int discretionScope = MISSING_INT;

    private boolean hasDiscretionScope;

    public int discretionScope()
    {
        if (!hasDiscretionScope)
        {
            throw new IllegalArgumentException("No value for optional field: DiscretionScope");
        }

        return discretionScope;
    }

    public boolean hasDiscretionScope()
    {
        return hasDiscretionScope;
    }



    private final CharArrayWrapper discretionScopeWrapper = new CharArrayWrapper();
    public DiscretionScope discretionScopeAsEnum()
    {
        if (!hasDiscretionScope)
 return DiscretionScope.NULL_VAL;
        return DiscretionScope.decode(discretionScope);
    }


    private int targetStrategy = MISSING_INT;

    private boolean hasTargetStrategy;

    public int targetStrategy()
    {
        if (!hasTargetStrategy)
        {
            throw new IllegalArgumentException("No value for optional field: TargetStrategy");
        }

        return targetStrategy;
    }

    public boolean hasTargetStrategy()
    {
        return hasTargetStrategy;
    }



    private final CharArrayWrapper targetStrategyWrapper = new CharArrayWrapper();
    public TargetStrategy targetStrategyAsEnum()
    {
        if (!hasTargetStrategy)
 return TargetStrategy.NULL_VAL;
        return TargetStrategy.decode(targetStrategy);
    }



    private StrategyParametersGroupDecoder strategyParametersGroup = null;
    public StrategyParametersGroupDecoder strategyParametersGroup()
    {
        return strategyParametersGroup;
    }

    private int noStrategyParametersGroupCounter = MISSING_INT;

    private boolean hasNoStrategyParametersGroupCounter;

    public int noStrategyParametersGroupCounter()
    {
        if (!hasNoStrategyParametersGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoStrategyParametersGroupCounter");
        }

        return noStrategyParametersGroupCounter;
    }

    public boolean hasNoStrategyParametersGroupCounter()
    {
        return hasNoStrategyParametersGroupCounter;
    }




    private StrategyParametersGroupIterator strategyParametersGroupIterator = new StrategyParametersGroupIterator(this);
    public StrategyParametersGroupIterator strategyParametersGroupIterator()
    {
        return strategyParametersGroupIterator.iterator();
    }


    private char[] targetStrategyParameters = new char[1];

    private boolean hasTargetStrategyParameters;

    public char[] targetStrategyParameters()
    {
        if (!hasTargetStrategyParameters)
        {
            throw new IllegalArgumentException("No value for optional field: TargetStrategyParameters");
        }

        return targetStrategyParameters;
    }

    public boolean hasTargetStrategyParameters()
    {
        return hasTargetStrategyParameters;
    }


    private int targetStrategyParametersOffset;

    private int targetStrategyParametersLength;

    public int targetStrategyParametersLength()
    {
        if (!hasTargetStrategyParameters)
        {
            throw new IllegalArgumentException("No value for optional field: TargetStrategyParameters");
        }

        return targetStrategyParametersLength;
    }

    public String targetStrategyParametersAsString()
    {
        return hasTargetStrategyParameters ? new String(targetStrategyParameters, 0, targetStrategyParametersLength) : null;
    }

    public void targetStrategyParameters(final AsciiSequenceView view)
    {
        if (!hasTargetStrategyParameters)
        {
            throw new IllegalArgumentException("No value for optional field: TargetStrategyParameters");
        }

        view.wrap(buffer, targetStrategyParametersOffset, targetStrategyParametersLength);
    }


    private final CharArrayWrapper targetStrategyParametersWrapper = new CharArrayWrapper();
    private DecimalFloat participationRate = DecimalFloat.newNaNValue();

    private boolean hasParticipationRate;

    public DecimalFloat participationRate()
    {
        if (!hasParticipationRate)
        {
            throw new IllegalArgumentException("No value for optional field: ParticipationRate");
        }

        return participationRate;
    }

    public boolean hasParticipationRate()
    {
        return hasParticipationRate;
    }



    private char[] designation = new char[1];

    private boolean hasDesignation;

    public char[] designation()
    {
        if (!hasDesignation)
        {
            throw new IllegalArgumentException("No value for optional field: Designation");
        }

        return designation;
    }

    public boolean hasDesignation()
    {
        return hasDesignation;
    }


    private int designationOffset;

    private int designationLength;

    public int designationLength()
    {
        if (!hasDesignation)
        {
            throw new IllegalArgumentException("No value for optional field: Designation");
        }

        return designationLength;
    }

    public String designationAsString()
    {
        return hasDesignation ? new String(designation, 0, designationLength) : null;
    }

    public void designation(final AsciiSequenceView view)
    {
        if (!hasDesignation)
        {
            throw new IllegalArgumentException("No value for optional field: Designation");
        }

        view.wrap(buffer, designationOffset, designationLength);
    }


    private final CharArrayWrapper designationWrapper = new CharArrayWrapper();
    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode OrdersGroup
        int seenFieldCount = 0;
        if (CODEC_VALIDATION_ENABLED)
        {
            missingRequiredFields.copy(REQUIRED_FIELDS);
        }
        this.buffer = buffer;
        final int end = offset + length;
        int position = offset;
        seenFields.clear();
        int tag;

        while (position < end)
        {
            final int equalsPosition = buffer.scan(position, end, '=');
            if (equalsPosition == AsciiBuffer.UNKNOWN_INDEX)
            {
               return position;
            }
            tag = buffer.getInt(position, equalsPosition);
            if (!seenFields.add(tag))
            {
                if (next == null)
                {
                    next = new OrdersGroupDecoder(trailer, messageFields);
                }
                return position - offset;
            }
            final int valueOffset = equalsPosition + 1;
            int endOfField = buffer.scan(valueOffset, end, START_OF_HEADER);
            if (endOfField == AsciiBuffer.UNKNOWN_INDEX || equalsPosition == AsciiBuffer.UNKNOWN_INDEX)
            {
                rejectReason = 5;
                break;
            }
            final int valueLength = endOfField - valueOffset;
            if (CODEC_VALIDATION_ENABLED)
            {
                if (tag <= 0)
                {
                    invalidTagId = tag;
                    rejectReason = 0;
                }
                else if (valueLength == 0)
                {
                    invalidTagId = tag;
                    rejectReason = 4;
                }
                missingRequiredFields.remove(tag);
                seenFieldCount++;
            }

            switch (tag)
            {
            case Constants.CL_ORD_ID:
                clOrdID = buffer.getChars(clOrdID, valueOffset, valueLength);
                clOrdIDOffset = valueOffset;
                clOrdIDLength = valueLength;
                break;

            case Constants.SECONDARY_CL_ORD_ID:
                hasSecondaryClOrdID = true;
                secondaryClOrdID = buffer.getChars(secondaryClOrdID, valueOffset, valueLength);
                secondaryClOrdIDOffset = valueOffset;
                secondaryClOrdIDLength = valueLength;
                break;

            case Constants.LIST_SEQ_NO:
                listSeqNo = getInt(buffer, valueOffset, endOfField, 67, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.CL_ORD_LINK_ID:
                hasClOrdLinkID = true;
                clOrdLinkID = buffer.getChars(clOrdLinkID, valueOffset, valueLength);
                clOrdLinkIDOffset = valueOffset;
                clOrdLinkIDLength = valueLength;
                break;

            case Constants.SETTL_INST_MODE:
                hasSettlInstMode = true;
                settlInstMode = buffer.getChar(valueOffset);
                break;

            case Constants.NO_PARTY_IDS_GROUP_COUNTER:
                hasNoPartyIDsGroupCounter = true;
                noPartyIDsGroupCounter = getInt(buffer, valueOffset, endOfField, 453, CODEC_VALIDATION_ENABLED);
                if (partyIDsGroup == null)
                {
                    partyIDsGroup = new PartyIDsGroupDecoder(trailer, messageFields);
                }
                PartyIDsGroupDecoder partyIDsGroupCurrent = partyIDsGroup;
                position = endOfField + 1;
                final int noPartyIDsGroupCounter = this.noPartyIDsGroupCounter;
                for (int i = 0; i < noPartyIDsGroupCounter && position < end; i++)
                {
                    if (partyIDsGroupCurrent != null)
                    {
                        position += partyIDsGroupCurrent.decode(buffer, position, end - position);
                        partyIDsGroupCurrent = partyIDsGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (partyIDsGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;


            case Constants.TRADE_ORIGINATION_DATE:
                hasTradeOriginationDate = true;
                tradeOriginationDate = buffer.getBytes(tradeOriginationDate, valueOffset, valueLength);
                tradeOriginationDateOffset = valueOffset;
                tradeOriginationDateLength = valueLength;
                break;

            case Constants.TRADE_DATE:
                hasTradeDate = true;
                tradeDate = buffer.getBytes(tradeDate, valueOffset, valueLength);
                tradeDateOffset = valueOffset;
                tradeDateLength = valueLength;
                break;

            case Constants.ACCOUNT:
                hasAccount = true;
                account = buffer.getChars(account, valueOffset, valueLength);
                accountOffset = valueOffset;
                accountLength = valueLength;
                break;

            case Constants.ACCT_ID_SOURCE:
                hasAcctIDSource = true;
                acctIDSource = getInt(buffer, valueOffset, endOfField, 660, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.ACCOUNT_TYPE:
                hasAccountType = true;
                accountType = getInt(buffer, valueOffset, endOfField, 581, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.DAY_BOOKING_INST:
                hasDayBookingInst = true;
                dayBookingInst = buffer.getChar(valueOffset);
                break;

            case Constants.BOOKING_UNIT:
                hasBookingUnit = true;
                bookingUnit = buffer.getChar(valueOffset);
                break;

            case Constants.ALLOC_ID:
                hasAllocID = true;
                allocID = buffer.getChars(allocID, valueOffset, valueLength);
                allocIDOffset = valueOffset;
                allocIDLength = valueLength;
                break;

            case Constants.PREALLOC_METHOD:
                hasPreallocMethod = true;
                preallocMethod = buffer.getChar(valueOffset);
                break;

            case Constants.NO_ALLOCS_GROUP_COUNTER:
                hasNoAllocsGroupCounter = true;
                noAllocsGroupCounter = getInt(buffer, valueOffset, endOfField, 78, CODEC_VALIDATION_ENABLED);
                if (allocsGroup == null)
                {
                    allocsGroup = new AllocsGroupDecoder(trailer, messageFields);
                }
                AllocsGroupDecoder allocsGroupCurrent = allocsGroup;
                position = endOfField + 1;
                final int noAllocsGroupCounter = this.noAllocsGroupCounter;
                for (int i = 0; i < noAllocsGroupCounter && position < end; i++)
                {
                    if (allocsGroupCurrent != null)
                    {
                        position += allocsGroupCurrent.decode(buffer, position, end - position);
                        allocsGroupCurrent = allocsGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (allocsGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;


            case Constants.SETTL_TYPE:
                hasSettlType = true;
                settlType = buffer.getChars(settlType, valueOffset, valueLength);
                settlTypeOffset = valueOffset;
                settlTypeLength = valueLength;
                break;

            case Constants.SETTL_DATE:
                hasSettlDate = true;
                settlDate = buffer.getBytes(settlDate, valueOffset, valueLength);
                settlDateOffset = valueOffset;
                settlDateLength = valueLength;
                break;

            case Constants.CASH_MARGIN:
                hasCashMargin = true;
                cashMargin = buffer.getChar(valueOffset);
                break;

            case Constants.CLEARING_FEE_INDICATOR:
                hasClearingFeeIndicator = true;
                clearingFeeIndicator = buffer.getChars(clearingFeeIndicator, valueOffset, valueLength);
                clearingFeeIndicatorOffset = valueOffset;
                clearingFeeIndicatorLength = valueLength;
                break;

            case Constants.HANDL_INST:
                hasHandlInst = true;
                handlInst = buffer.getChar(valueOffset);
                break;

            case Constants.EXEC_INST:
                hasExecInst = true;
                execInst = buffer.getChars(execInst, valueOffset, valueLength);
                execInstOffset = valueOffset;
                execInstLength = valueLength;
                break;

            case Constants.MIN_QTY:
                hasMinQty = true;
                minQty = getFloat(buffer, minQty, valueOffset, valueLength, 110, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.MATCH_INCREMENT:
                hasMatchIncrement = true;
                matchIncrement = getFloat(buffer, matchIncrement, valueOffset, valueLength, 1089, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.MAX_PRICE_LEVELS:
                hasMaxPriceLevels = true;
                maxPriceLevels = getInt(buffer, valueOffset, endOfField, 1090, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.DISPLAY_QTY:
                hasDisplayQty = true;
                displayQty = getFloat(buffer, displayQty, valueOffset, valueLength, 1138, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.SECONDARY_DISPLAY_QTY:
                hasSecondaryDisplayQty = true;
                secondaryDisplayQty = getFloat(buffer, secondaryDisplayQty, valueOffset, valueLength, 1082, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.DISPLAY_WHEN:
                hasDisplayWhen = true;
                displayWhen = buffer.getChar(valueOffset);
                break;

            case Constants.DISPLAY_METHOD:
                hasDisplayMethod = true;
                displayMethod = buffer.getChar(valueOffset);
                break;

            case Constants.DISPLAY_LOW_QTY:
                hasDisplayLowQty = true;
                displayLowQty = getFloat(buffer, displayLowQty, valueOffset, valueLength, 1085, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.DISPLAY_HIGH_QTY:
                hasDisplayHighQty = true;
                displayHighQty = getFloat(buffer, displayHighQty, valueOffset, valueLength, 1086, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.DISPLAY_MIN_INCR:
                hasDisplayMinIncr = true;
                displayMinIncr = getFloat(buffer, displayMinIncr, valueOffset, valueLength, 1087, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.REFRESH_QTY:
                hasRefreshQty = true;
                refreshQty = getFloat(buffer, refreshQty, valueOffset, valueLength, 1088, CODEC_VALIDATION_ENABLED);
                break;


            case Constants.MAX_FLOOR:
                hasMaxFloor = true;
                maxFloor = getFloat(buffer, maxFloor, valueOffset, valueLength, 111, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.EX_DESTINATION:
                hasExDestination = true;
                exDestination = buffer.getChars(exDestination, valueOffset, valueLength);
                exDestinationOffset = valueOffset;
                exDestinationLength = valueLength;
                break;

            case Constants.EX_DESTINATION_ID_SOURCE:
                hasExDestinationIDSource = true;
                exDestinationIDSource = buffer.getChar(valueOffset);
                break;

            case Constants.NO_TRADING_SESSIONS_GROUP_COUNTER:
                hasNoTradingSessionsGroupCounter = true;
                noTradingSessionsGroupCounter = getInt(buffer, valueOffset, endOfField, 386, CODEC_VALIDATION_ENABLED);
                if (tradingSessionsGroup == null)
                {
                    tradingSessionsGroup = new TradingSessionsGroupDecoder(trailer, messageFields);
                }
                TradingSessionsGroupDecoder tradingSessionsGroupCurrent = tradingSessionsGroup;
                position = endOfField + 1;
                final int noTradingSessionsGroupCounter = this.noTradingSessionsGroupCounter;
                for (int i = 0; i < noTradingSessionsGroupCounter && position < end; i++)
                {
                    if (tradingSessionsGroupCurrent != null)
                    {
                        position += tradingSessionsGroupCurrent.decode(buffer, position, end - position);
                        tradingSessionsGroupCurrent = tradingSessionsGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (tradingSessionsGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;


            case Constants.PROCESS_CODE:
                hasProcessCode = true;
                processCode = buffer.getChar(valueOffset);
                break;

            case Constants.SYMBOL:
                hasSymbol = true;
                symbol = buffer.getChars(symbol, valueOffset, valueLength);
                symbolOffset = valueOffset;
                symbolLength = valueLength;
                break;

            case Constants.SYMBOL_SFX:
                hasSymbolSfx = true;
                symbolSfx = buffer.getChars(symbolSfx, valueOffset, valueLength);
                symbolSfxOffset = valueOffset;
                symbolSfxLength = valueLength;
                break;

            case Constants.SECURITY_ID:
                hasSecurityID = true;
                securityID = buffer.getChars(securityID, valueOffset, valueLength);
                securityIDOffset = valueOffset;
                securityIDLength = valueLength;
                break;

            case Constants.SECURITY_ID_SOURCE:
                hasSecurityIDSource = true;
                securityIDSource = buffer.getChars(securityIDSource, valueOffset, valueLength);
                securityIDSourceOffset = valueOffset;
                securityIDSourceLength = valueLength;
                break;

            case Constants.NO_SECURITY_ALT_ID_GROUP_COUNTER:
                hasNoSecurityAltIDGroupCounter = true;
                noSecurityAltIDGroupCounter = getInt(buffer, valueOffset, endOfField, 454, CODEC_VALIDATION_ENABLED);
                if (securityAltIDGroup == null)
                {
                    securityAltIDGroup = new SecurityAltIDGroupDecoder(trailer, messageFields);
                }
                SecurityAltIDGroupDecoder securityAltIDGroupCurrent = securityAltIDGroup;
                position = endOfField + 1;
                final int noSecurityAltIDGroupCounter = this.noSecurityAltIDGroupCounter;
                for (int i = 0; i < noSecurityAltIDGroupCounter && position < end; i++)
                {
                    if (securityAltIDGroupCurrent != null)
                    {
                        position += securityAltIDGroupCurrent.decode(buffer, position, end - position);
                        securityAltIDGroupCurrent = securityAltIDGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (securityAltIDGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;


            case Constants.PRODUCT:
                hasProduct = true;
                product = getInt(buffer, valueOffset, endOfField, 460, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.PRODUCT_COMPLEX:
                hasProductComplex = true;
                productComplex = buffer.getChars(productComplex, valueOffset, valueLength);
                productComplexOffset = valueOffset;
                productComplexLength = valueLength;
                break;

            case Constants.SECURITY_GROUP:
                hasSecurityGroup = true;
                securityGroup = buffer.getChars(securityGroup, valueOffset, valueLength);
                securityGroupOffset = valueOffset;
                securityGroupLength = valueLength;
                break;

            case Constants.C_F_I_CODE:
                hasCFICode = true;
                cFICode = buffer.getChars(cFICode, valueOffset, valueLength);
                cFICodeOffset = valueOffset;
                cFICodeLength = valueLength;
                break;

            case Constants.SECURITY_TYPE:
                hasSecurityType = true;
                securityType = buffer.getChars(securityType, valueOffset, valueLength);
                securityTypeOffset = valueOffset;
                securityTypeLength = valueLength;
                break;

            case Constants.SECURITY_SUB_TYPE:
                hasSecuritySubType = true;
                securitySubType = buffer.getChars(securitySubType, valueOffset, valueLength);
                securitySubTypeOffset = valueOffset;
                securitySubTypeLength = valueLength;
                break;

            case Constants.MATURITY_MONTH_YEAR:
                hasMaturityMonthYear = true;
                maturityMonthYear = buffer.getBytes(maturityMonthYear, valueOffset, valueLength);
                maturityMonthYearOffset = valueOffset;
                maturityMonthYearLength = valueLength;
                break;

            case Constants.MATURITY_DATE:
                hasMaturityDate = true;
                maturityDate = buffer.getBytes(maturityDate, valueOffset, valueLength);
                maturityDateOffset = valueOffset;
                maturityDateLength = valueLength;
                break;

            case Constants.MATURITY_TIME:
                hasMaturityTime = true;
                maturityTime = buffer.getBytes(maturityTime, valueOffset, valueLength);
                maturityTimeOffset = valueOffset;
                maturityTimeLength = valueLength;
                break;

            case Constants.SETTLE_ON_OPEN_FLAG:
                hasSettleOnOpenFlag = true;
                settleOnOpenFlag = buffer.getChars(settleOnOpenFlag, valueOffset, valueLength);
                settleOnOpenFlagOffset = valueOffset;
                settleOnOpenFlagLength = valueLength;
                break;

            case Constants.INSTRMT_ASSIGNMENT_METHOD:
                hasInstrmtAssignmentMethod = true;
                instrmtAssignmentMethod = buffer.getChar(valueOffset);
                break;

            case Constants.SECURITY_STATUS:
                hasSecurityStatus = true;
                securityStatus = buffer.getChars(securityStatus, valueOffset, valueLength);
                securityStatusOffset = valueOffset;
                securityStatusLength = valueLength;
                break;

            case Constants.COUPON_PAYMENT_DATE:
                hasCouponPaymentDate = true;
                couponPaymentDate = buffer.getBytes(couponPaymentDate, valueOffset, valueLength);
                couponPaymentDateOffset = valueOffset;
                couponPaymentDateLength = valueLength;
                break;

            case Constants.RESTRUCTURING_TYPE:
                hasRestructuringType = true;
                restructuringType = buffer.getChars(restructuringType, valueOffset, valueLength);
                restructuringTypeOffset = valueOffset;
                restructuringTypeLength = valueLength;
                break;

            case Constants.SENIORITY:
                hasSeniority = true;
                seniority = buffer.getChars(seniority, valueOffset, valueLength);
                seniorityOffset = valueOffset;
                seniorityLength = valueLength;
                break;

            case Constants.NOTIONAL_PERCENTAGE_OUTSTANDING:
                hasNotionalPercentageOutstanding = true;
                notionalPercentageOutstanding = getFloat(buffer, notionalPercentageOutstanding, valueOffset, valueLength, 1451, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.ORIGINAL_NOTIONAL_PERCENTAGE_OUTSTANDING:
                hasOriginalNotionalPercentageOutstanding = true;
                originalNotionalPercentageOutstanding = getFloat(buffer, originalNotionalPercentageOutstanding, valueOffset, valueLength, 1452, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.ATTACHMENT_POINT:
                hasAttachmentPoint = true;
                attachmentPoint = getFloat(buffer, attachmentPoint, valueOffset, valueLength, 1457, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.DETACHMENT_POINT:
                hasDetachmentPoint = true;
                detachmentPoint = getFloat(buffer, detachmentPoint, valueOffset, valueLength, 1458, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.ISSUE_DATE:
                hasIssueDate = true;
                issueDate = buffer.getBytes(issueDate, valueOffset, valueLength);
                issueDateOffset = valueOffset;
                issueDateLength = valueLength;
                break;

            case Constants.REPO_COLLATERAL_SECURITY_TYPE:
                hasRepoCollateralSecurityType = true;
                repoCollateralSecurityType = buffer.getChars(repoCollateralSecurityType, valueOffset, valueLength);
                repoCollateralSecurityTypeOffset = valueOffset;
                repoCollateralSecurityTypeLength = valueLength;
                break;

            case Constants.REPURCHASE_TERM:
                hasRepurchaseTerm = true;
                repurchaseTerm = getInt(buffer, valueOffset, endOfField, 226, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.REPURCHASE_RATE:
                hasRepurchaseRate = true;
                repurchaseRate = getFloat(buffer, repurchaseRate, valueOffset, valueLength, 227, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.FACTOR:
                hasFactor = true;
                factor = getFloat(buffer, factor, valueOffset, valueLength, 228, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.CREDIT_RATING:
                hasCreditRating = true;
                creditRating = buffer.getChars(creditRating, valueOffset, valueLength);
                creditRatingOffset = valueOffset;
                creditRatingLength = valueLength;
                break;

            case Constants.INSTR_REGISTRY:
                hasInstrRegistry = true;
                instrRegistry = buffer.getChars(instrRegistry, valueOffset, valueLength);
                instrRegistryOffset = valueOffset;
                instrRegistryLength = valueLength;
                break;

            case Constants.COUNTRY_OF_ISSUE:
                hasCountryOfIssue = true;
                countryOfIssue = buffer.getChars(countryOfIssue, valueOffset, valueLength);
                countryOfIssueOffset = valueOffset;
                countryOfIssueLength = valueLength;
                break;

            case Constants.STATE_OR_PROVINCE_OF_ISSUE:
                hasStateOrProvinceOfIssue = true;
                stateOrProvinceOfIssue = buffer.getChars(stateOrProvinceOfIssue, valueOffset, valueLength);
                stateOrProvinceOfIssueOffset = valueOffset;
                stateOrProvinceOfIssueLength = valueLength;
                break;

            case Constants.LOCALE_OF_ISSUE:
                hasLocaleOfIssue = true;
                localeOfIssue = buffer.getChars(localeOfIssue, valueOffset, valueLength);
                localeOfIssueOffset = valueOffset;
                localeOfIssueLength = valueLength;
                break;

            case Constants.REDEMPTION_DATE:
                hasRedemptionDate = true;
                redemptionDate = buffer.getBytes(redemptionDate, valueOffset, valueLength);
                redemptionDateOffset = valueOffset;
                redemptionDateLength = valueLength;
                break;

            case Constants.STRIKE_PRICE:
                hasStrikePrice = true;
                strikePrice = getFloat(buffer, strikePrice, valueOffset, valueLength, 202, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.STRIKE_CURRENCY:
                hasStrikeCurrency = true;
                strikeCurrency = buffer.getChars(strikeCurrency, valueOffset, valueLength);
                strikeCurrencyOffset = valueOffset;
                strikeCurrencyLength = valueLength;
                break;

            case Constants.STRIKE_MULTIPLIER:
                hasStrikeMultiplier = true;
                strikeMultiplier = getFloat(buffer, strikeMultiplier, valueOffset, valueLength, 967, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.STRIKE_VALUE:
                hasStrikeValue = true;
                strikeValue = getFloat(buffer, strikeValue, valueOffset, valueLength, 968, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.STRIKE_PRICE_DETERMINATION_METHOD:
                hasStrikePriceDeterminationMethod = true;
                strikePriceDeterminationMethod = getInt(buffer, valueOffset, endOfField, 1478, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.STRIKE_PRICE_BOUNDARY_METHOD:
                hasStrikePriceBoundaryMethod = true;
                strikePriceBoundaryMethod = getInt(buffer, valueOffset, endOfField, 1479, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.STRIKE_PRICE_BOUNDARY_PRECISION:
                hasStrikePriceBoundaryPrecision = true;
                strikePriceBoundaryPrecision = getFloat(buffer, strikePriceBoundaryPrecision, valueOffset, valueLength, 1480, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.UNDERLYING_PRICE_DETERMINATION_METHOD:
                hasUnderlyingPriceDeterminationMethod = true;
                underlyingPriceDeterminationMethod = getInt(buffer, valueOffset, endOfField, 1481, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.OPT_ATTRIBUTE:
                hasOptAttribute = true;
                optAttribute = buffer.getChar(valueOffset);
                break;

            case Constants.CONTRACT_MULTIPLIER:
                hasContractMultiplier = true;
                contractMultiplier = getFloat(buffer, contractMultiplier, valueOffset, valueLength, 231, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.CONTRACT_MULTIPLIER_UNIT:
                hasContractMultiplierUnit = true;
                contractMultiplierUnit = getInt(buffer, valueOffset, endOfField, 1435, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.FLOW_SCHEDULE_TYPE:
                hasFlowScheduleType = true;
                flowScheduleType = getInt(buffer, valueOffset, endOfField, 1439, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.MIN_PRICE_INCREMENT:
                hasMinPriceIncrement = true;
                minPriceIncrement = getFloat(buffer, minPriceIncrement, valueOffset, valueLength, 969, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.MIN_PRICE_INCREMENT_AMOUNT:
                hasMinPriceIncrementAmount = true;
                minPriceIncrementAmount = getFloat(buffer, minPriceIncrementAmount, valueOffset, valueLength, 1146, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.UNIT_OF_MEASURE:
                hasUnitOfMeasure = true;
                unitOfMeasure = buffer.getChars(unitOfMeasure, valueOffset, valueLength);
                unitOfMeasureOffset = valueOffset;
                unitOfMeasureLength = valueLength;
                break;

            case Constants.UNIT_OF_MEASURE_QTY:
                hasUnitOfMeasureQty = true;
                unitOfMeasureQty = getFloat(buffer, unitOfMeasureQty, valueOffset, valueLength, 1147, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.PRICE_UNIT_OF_MEASURE:
                hasPriceUnitOfMeasure = true;
                priceUnitOfMeasure = buffer.getChars(priceUnitOfMeasure, valueOffset, valueLength);
                priceUnitOfMeasureOffset = valueOffset;
                priceUnitOfMeasureLength = valueLength;
                break;

            case Constants.PRICE_UNIT_OF_MEASURE_QTY:
                hasPriceUnitOfMeasureQty = true;
                priceUnitOfMeasureQty = getFloat(buffer, priceUnitOfMeasureQty, valueOffset, valueLength, 1192, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.SETTL_METHOD:
                hasSettlMethod = true;
                settlMethod = buffer.getChar(valueOffset);
                break;

            case Constants.EXERCISE_STYLE:
                hasExerciseStyle = true;
                exerciseStyle = getInt(buffer, valueOffset, endOfField, 1194, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.OPT_PAYOUT_TYPE:
                hasOptPayoutType = true;
                optPayoutType = getInt(buffer, valueOffset, endOfField, 1482, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.OPT_PAYOUT_AMOUNT:
                hasOptPayoutAmount = true;
                optPayoutAmount = getFloat(buffer, optPayoutAmount, valueOffset, valueLength, 1195, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.PRICE_QUOTE_METHOD:
                hasPriceQuoteMethod = true;
                priceQuoteMethod = buffer.getChars(priceQuoteMethod, valueOffset, valueLength);
                priceQuoteMethodOffset = valueOffset;
                priceQuoteMethodLength = valueLength;
                break;

            case Constants.VALUATION_METHOD:
                hasValuationMethod = true;
                valuationMethod = buffer.getChars(valuationMethod, valueOffset, valueLength);
                valuationMethodOffset = valueOffset;
                valuationMethodLength = valueLength;
                break;

            case Constants.LIST_METHOD:
                hasListMethod = true;
                listMethod = getInt(buffer, valueOffset, endOfField, 1198, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.CAP_PRICE:
                hasCapPrice = true;
                capPrice = getFloat(buffer, capPrice, valueOffset, valueLength, 1199, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.FLOOR_PRICE:
                hasFloorPrice = true;
                floorPrice = getFloat(buffer, floorPrice, valueOffset, valueLength, 1200, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.PUT_OR_CALL:
                hasPutOrCall = true;
                putOrCall = getInt(buffer, valueOffset, endOfField, 201, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.FLEXIBLE_INDICATOR:
                hasFlexibleIndicator = true;
                flexibleIndicator = buffer.getBoolean(valueOffset);
                break;

            case Constants.FLEX_PRODUCT_ELIGIBILITY_INDICATOR:
                hasFlexProductEligibilityIndicator = true;
                flexProductEligibilityIndicator = buffer.getBoolean(valueOffset);
                break;

            case Constants.TIME_UNIT:
                hasTimeUnit = true;
                timeUnit = buffer.getChars(timeUnit, valueOffset, valueLength);
                timeUnitOffset = valueOffset;
                timeUnitLength = valueLength;
                break;

            case Constants.COUPON_RATE:
                hasCouponRate = true;
                couponRate = getFloat(buffer, couponRate, valueOffset, valueLength, 223, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.SECURITY_EXCHANGE:
                hasSecurityExchange = true;
                securityExchange = buffer.getChars(securityExchange, valueOffset, valueLength);
                securityExchangeOffset = valueOffset;
                securityExchangeLength = valueLength;
                break;

            case Constants.POSITION_LIMIT:
                hasPositionLimit = true;
                positionLimit = getInt(buffer, valueOffset, endOfField, 970, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.N_T_POSITION_LIMIT:
                hasNTPositionLimit = true;
                nTPositionLimit = getInt(buffer, valueOffset, endOfField, 971, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.ISSUER:
                hasIssuer = true;
                issuer = buffer.getChars(issuer, valueOffset, valueLength);
                issuerOffset = valueOffset;
                issuerLength = valueLength;
                break;

            case Constants.ENCODED_ISSUER_LEN:
                hasEncodedIssuerLen = true;
                encodedIssuerLen = getInt(buffer, valueOffset, endOfField, 348, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.ENCODED_ISSUER:
                hasEncodedIssuer = true;
                encodedIssuer = buffer.getBytes(encodedIssuer, valueOffset, encodedIssuerLen);
                endOfField = valueOffset + encodedIssuerLen;
                break;

            case Constants.SECURITY_DESC:
                hasSecurityDesc = true;
                securityDesc = buffer.getChars(securityDesc, valueOffset, valueLength);
                securityDescOffset = valueOffset;
                securityDescLength = valueLength;
                break;

            case Constants.ENCODED_SECURITY_DESC_LEN:
                hasEncodedSecurityDescLen = true;
                encodedSecurityDescLen = getInt(buffer, valueOffset, endOfField, 350, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.ENCODED_SECURITY_DESC:
                hasEncodedSecurityDesc = true;
                encodedSecurityDesc = buffer.getBytes(encodedSecurityDesc, valueOffset, encodedSecurityDescLen);
                endOfField = valueOffset + encodedSecurityDescLen;
                break;

            case Constants.SECURITY_X_M_L_LEN:
                hasSecurityXMLLen = true;
                securityXMLLen = getInt(buffer, valueOffset, endOfField, 1184, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.SECURITY_X_M_L:
                hasSecurityXML = true;
                securityXML = buffer.getBytes(securityXML, valueOffset, securityXMLLen);
                endOfField = valueOffset + securityXMLLen;
                break;

            case Constants.SECURITY_X_M_L_SCHEMA:
                hasSecurityXMLSchema = true;
                securityXMLSchema = buffer.getChars(securityXMLSchema, valueOffset, valueLength);
                securityXMLSchemaOffset = valueOffset;
                securityXMLSchemaLength = valueLength;
                break;


            case Constants.POOL:
                hasPool = true;
                pool = buffer.getChars(pool, valueOffset, valueLength);
                poolOffset = valueOffset;
                poolLength = valueLength;
                break;

            case Constants.CONTRACT_SETTL_MONTH:
                hasContractSettlMonth = true;
                contractSettlMonth = buffer.getBytes(contractSettlMonth, valueOffset, valueLength);
                contractSettlMonthOffset = valueOffset;
                contractSettlMonthLength = valueLength;
                break;

            case Constants.C_P_PROGRAM:
                hasCPProgram = true;
                cPProgram = getInt(buffer, valueOffset, endOfField, 875, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.C_P_REG_TYPE:
                hasCPRegType = true;
                cPRegType = buffer.getChars(cPRegType, valueOffset, valueLength);
                cPRegTypeOffset = valueOffset;
                cPRegTypeLength = valueLength;
                break;

            case Constants.NO_EVENTS_GROUP_COUNTER:
                hasNoEventsGroupCounter = true;
                noEventsGroupCounter = getInt(buffer, valueOffset, endOfField, 864, CODEC_VALIDATION_ENABLED);
                if (eventsGroup == null)
                {
                    eventsGroup = new EventsGroupDecoder(trailer, messageFields);
                }
                EventsGroupDecoder eventsGroupCurrent = eventsGroup;
                position = endOfField + 1;
                final int noEventsGroupCounter = this.noEventsGroupCounter;
                for (int i = 0; i < noEventsGroupCounter && position < end; i++)
                {
                    if (eventsGroupCurrent != null)
                    {
                        position += eventsGroupCurrent.decode(buffer, position, end - position);
                        eventsGroupCurrent = eventsGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (eventsGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;


            case Constants.DATED_DATE:
                hasDatedDate = true;
                datedDate = buffer.getBytes(datedDate, valueOffset, valueLength);
                datedDateOffset = valueOffset;
                datedDateLength = valueLength;
                break;

            case Constants.INTEREST_ACCRUAL_DATE:
                hasInterestAccrualDate = true;
                interestAccrualDate = buffer.getBytes(interestAccrualDate, valueOffset, valueLength);
                interestAccrualDateOffset = valueOffset;
                interestAccrualDateLength = valueLength;
                break;

            case Constants.NO_INSTRUMENT_PARTIES_GROUP_COUNTER:
                hasNoInstrumentPartiesGroupCounter = true;
                noInstrumentPartiesGroupCounter = getInt(buffer, valueOffset, endOfField, 1018, CODEC_VALIDATION_ENABLED);
                if (instrumentPartiesGroup == null)
                {
                    instrumentPartiesGroup = new InstrumentPartiesGroupDecoder(trailer, messageFields);
                }
                InstrumentPartiesGroupDecoder instrumentPartiesGroupCurrent = instrumentPartiesGroup;
                position = endOfField + 1;
                final int noInstrumentPartiesGroupCounter = this.noInstrumentPartiesGroupCounter;
                for (int i = 0; i < noInstrumentPartiesGroupCounter && position < end; i++)
                {
                    if (instrumentPartiesGroupCurrent != null)
                    {
                        position += instrumentPartiesGroupCurrent.decode(buffer, position, end - position);
                        instrumentPartiesGroupCurrent = instrumentPartiesGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (instrumentPartiesGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;


            case Constants.NO_COMPLEX_EVENTS_GROUP_COUNTER:
                hasNoComplexEventsGroupCounter = true;
                noComplexEventsGroupCounter = getInt(buffer, valueOffset, endOfField, 1483, CODEC_VALIDATION_ENABLED);
                if (complexEventsGroup == null)
                {
                    complexEventsGroup = new ComplexEventsGroupDecoder(trailer, messageFields);
                }
                ComplexEventsGroupDecoder complexEventsGroupCurrent = complexEventsGroup;
                position = endOfField + 1;
                final int noComplexEventsGroupCounter = this.noComplexEventsGroupCounter;
                for (int i = 0; i < noComplexEventsGroupCounter && position < end; i++)
                {
                    if (complexEventsGroupCurrent != null)
                    {
                        position += complexEventsGroupCurrent.decode(buffer, position, end - position);
                        complexEventsGroupCurrent = complexEventsGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (complexEventsGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;



            case Constants.NO_UNDERLYINGS_GROUP_COUNTER:
                hasNoUnderlyingsGroupCounter = true;
                noUnderlyingsGroupCounter = getInt(buffer, valueOffset, endOfField, 711, CODEC_VALIDATION_ENABLED);
                if (underlyingsGroup == null)
                {
                    underlyingsGroup = new UnderlyingsGroupDecoder(trailer, messageFields);
                }
                UnderlyingsGroupDecoder underlyingsGroupCurrent = underlyingsGroup;
                position = endOfField + 1;
                final int noUnderlyingsGroupCounter = this.noUnderlyingsGroupCounter;
                for (int i = 0; i < noUnderlyingsGroupCounter && position < end; i++)
                {
                    if (underlyingsGroupCurrent != null)
                    {
                        position += underlyingsGroupCurrent.decode(buffer, position, end - position);
                        underlyingsGroupCurrent = underlyingsGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (underlyingsGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;


            case Constants.PREV_CLOSE_PX:
                hasPrevClosePx = true;
                prevClosePx = getFloat(buffer, prevClosePx, valueOffset, valueLength, 140, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.SIDE:
                side = buffer.getChar(valueOffset);
                break;

            case Constants.SIDE_VALUE_IND:
                hasSideValueInd = true;
                sideValueInd = getInt(buffer, valueOffset, endOfField, 401, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.LOCATE_REQD:
                hasLocateReqd = true;
                locateReqd = buffer.getBoolean(valueOffset);
                break;

            case Constants.TRANSACT_TIME:
                hasTransactTime = true;
                transactTime = buffer.getBytes(transactTime, valueOffset, valueLength);
                transactTimeOffset = valueOffset;
                transactTimeLength = valueLength;
                break;

            case Constants.NO_STIPULATIONS_GROUP_COUNTER:
                hasNoStipulationsGroupCounter = true;
                noStipulationsGroupCounter = getInt(buffer, valueOffset, endOfField, 232, CODEC_VALIDATION_ENABLED);
                if (stipulationsGroup == null)
                {
                    stipulationsGroup = new StipulationsGroupDecoder(trailer, messageFields);
                }
                StipulationsGroupDecoder stipulationsGroupCurrent = stipulationsGroup;
                position = endOfField + 1;
                final int noStipulationsGroupCounter = this.noStipulationsGroupCounter;
                for (int i = 0; i < noStipulationsGroupCounter && position < end; i++)
                {
                    if (stipulationsGroupCurrent != null)
                    {
                        position += stipulationsGroupCurrent.decode(buffer, position, end - position);
                        stipulationsGroupCurrent = stipulationsGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (stipulationsGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;


            case Constants.QTY_TYPE:
                hasQtyType = true;
                qtyType = getInt(buffer, valueOffset, endOfField, 854, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.ORDER_QTY:
                hasOrderQty = true;
                orderQty = getFloat(buffer, orderQty, valueOffset, valueLength, 38, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.CASH_ORDER_QTY:
                hasCashOrderQty = true;
                cashOrderQty = getFloat(buffer, cashOrderQty, valueOffset, valueLength, 152, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.ORDER_PERCENT:
                hasOrderPercent = true;
                orderPercent = getFloat(buffer, orderPercent, valueOffset, valueLength, 516, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.ROUNDING_DIRECTION:
                hasRoundingDirection = true;
                roundingDirection = buffer.getChar(valueOffset);
                break;

            case Constants.ROUNDING_MODULUS:
                hasRoundingModulus = true;
                roundingModulus = getFloat(buffer, roundingModulus, valueOffset, valueLength, 469, CODEC_VALIDATION_ENABLED);
                break;


            case Constants.ORD_TYPE:
                hasOrdType = true;
                ordType = buffer.getChar(valueOffset);
                break;

            case Constants.PRICE_TYPE:
                hasPriceType = true;
                priceType = getInt(buffer, valueOffset, endOfField, 423, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.PRICE:
                hasPrice = true;
                price = getFloat(buffer, price, valueOffset, valueLength, 44, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.PRICE_PROTECTION_SCOPE:
                hasPriceProtectionScope = true;
                priceProtectionScope = buffer.getChar(valueOffset);
                break;

            case Constants.STOP_PX:
                hasStopPx = true;
                stopPx = getFloat(buffer, stopPx, valueOffset, valueLength, 99, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.TRIGGER_TYPE:
                hasTriggerType = true;
                triggerType = buffer.getChar(valueOffset);
                break;

            case Constants.TRIGGER_ACTION:
                hasTriggerAction = true;
                triggerAction = buffer.getChar(valueOffset);
                break;

            case Constants.TRIGGER_PRICE:
                hasTriggerPrice = true;
                triggerPrice = getFloat(buffer, triggerPrice, valueOffset, valueLength, 1102, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.TRIGGER_SYMBOL:
                hasTriggerSymbol = true;
                triggerSymbol = buffer.getChars(triggerSymbol, valueOffset, valueLength);
                triggerSymbolOffset = valueOffset;
                triggerSymbolLength = valueLength;
                break;

            case Constants.TRIGGER_SECURITY_ID:
                hasTriggerSecurityID = true;
                triggerSecurityID = buffer.getChars(triggerSecurityID, valueOffset, valueLength);
                triggerSecurityIDOffset = valueOffset;
                triggerSecurityIDLength = valueLength;
                break;

            case Constants.TRIGGER_SECURITY_ID_SOURCE:
                hasTriggerSecurityIDSource = true;
                triggerSecurityIDSource = buffer.getChars(triggerSecurityIDSource, valueOffset, valueLength);
                triggerSecurityIDSourceOffset = valueOffset;
                triggerSecurityIDSourceLength = valueLength;
                break;

            case Constants.TRIGGER_SECURITY_DESC:
                hasTriggerSecurityDesc = true;
                triggerSecurityDesc = buffer.getChars(triggerSecurityDesc, valueOffset, valueLength);
                triggerSecurityDescOffset = valueOffset;
                triggerSecurityDescLength = valueLength;
                break;

            case Constants.TRIGGER_PRICE_TYPE:
                hasTriggerPriceType = true;
                triggerPriceType = buffer.getChar(valueOffset);
                break;

            case Constants.TRIGGER_PRICE_TYPE_SCOPE:
                hasTriggerPriceTypeScope = true;
                triggerPriceTypeScope = buffer.getChar(valueOffset);
                break;

            case Constants.TRIGGER_PRICE_DIRECTION:
                hasTriggerPriceDirection = true;
                triggerPriceDirection = buffer.getChar(valueOffset);
                break;

            case Constants.TRIGGER_NEW_PRICE:
                hasTriggerNewPrice = true;
                triggerNewPrice = getFloat(buffer, triggerNewPrice, valueOffset, valueLength, 1110, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.TRIGGER_ORDER_TYPE:
                hasTriggerOrderType = true;
                triggerOrderType = buffer.getChar(valueOffset);
                break;

            case Constants.TRIGGER_NEW_QTY:
                hasTriggerNewQty = true;
                triggerNewQty = getFloat(buffer, triggerNewQty, valueOffset, valueLength, 1112, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.TRIGGER_TRADING_SESSION_ID:
                hasTriggerTradingSessionID = true;
                triggerTradingSessionID = buffer.getChars(triggerTradingSessionID, valueOffset, valueLength);
                triggerTradingSessionIDOffset = valueOffset;
                triggerTradingSessionIDLength = valueLength;
                break;

            case Constants.TRIGGER_TRADING_SESSION_SUB_ID:
                hasTriggerTradingSessionSubID = true;
                triggerTradingSessionSubID = buffer.getChars(triggerTradingSessionSubID, valueOffset, valueLength);
                triggerTradingSessionSubIDOffset = valueOffset;
                triggerTradingSessionSubIDLength = valueLength;
                break;


            case Constants.SPREAD:
                hasSpread = true;
                spread = getFloat(buffer, spread, valueOffset, valueLength, 218, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.BENCHMARK_CURVE_CURRENCY:
                hasBenchmarkCurveCurrency = true;
                benchmarkCurveCurrency = buffer.getChars(benchmarkCurveCurrency, valueOffset, valueLength);
                benchmarkCurveCurrencyOffset = valueOffset;
                benchmarkCurveCurrencyLength = valueLength;
                break;

            case Constants.BENCHMARK_CURVE_NAME:
                hasBenchmarkCurveName = true;
                benchmarkCurveName = buffer.getChars(benchmarkCurveName, valueOffset, valueLength);
                benchmarkCurveNameOffset = valueOffset;
                benchmarkCurveNameLength = valueLength;
                break;

            case Constants.BENCHMARK_CURVE_POINT:
                hasBenchmarkCurvePoint = true;
                benchmarkCurvePoint = buffer.getChars(benchmarkCurvePoint, valueOffset, valueLength);
                benchmarkCurvePointOffset = valueOffset;
                benchmarkCurvePointLength = valueLength;
                break;

            case Constants.BENCHMARK_PRICE:
                hasBenchmarkPrice = true;
                benchmarkPrice = getFloat(buffer, benchmarkPrice, valueOffset, valueLength, 662, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.BENCHMARK_PRICE_TYPE:
                hasBenchmarkPriceType = true;
                benchmarkPriceType = getInt(buffer, valueOffset, endOfField, 663, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.BENCHMARK_SECURITY_ID:
                hasBenchmarkSecurityID = true;
                benchmarkSecurityID = buffer.getChars(benchmarkSecurityID, valueOffset, valueLength);
                benchmarkSecurityIDOffset = valueOffset;
                benchmarkSecurityIDLength = valueLength;
                break;

            case Constants.BENCHMARK_SECURITY_ID_SOURCE:
                hasBenchmarkSecurityIDSource = true;
                benchmarkSecurityIDSource = buffer.getChars(benchmarkSecurityIDSource, valueOffset, valueLength);
                benchmarkSecurityIDSourceOffset = valueOffset;
                benchmarkSecurityIDSourceLength = valueLength;
                break;


            case Constants.YIELD_TYPE:
                hasYieldType = true;
                yieldType = buffer.getChars(yieldType, valueOffset, valueLength);
                yieldTypeOffset = valueOffset;
                yieldTypeLength = valueLength;
                break;

            case Constants.YIELD:
                hasYield = true;
                yield = getFloat(buffer, yield, valueOffset, valueLength, 236, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.YIELD_CALC_DATE:
                hasYieldCalcDate = true;
                yieldCalcDate = buffer.getBytes(yieldCalcDate, valueOffset, valueLength);
                yieldCalcDateOffset = valueOffset;
                yieldCalcDateLength = valueLength;
                break;

            case Constants.YIELD_REDEMPTION_DATE:
                hasYieldRedemptionDate = true;
                yieldRedemptionDate = buffer.getBytes(yieldRedemptionDate, valueOffset, valueLength);
                yieldRedemptionDateOffset = valueOffset;
                yieldRedemptionDateLength = valueLength;
                break;

            case Constants.YIELD_REDEMPTION_PRICE:
                hasYieldRedemptionPrice = true;
                yieldRedemptionPrice = getFloat(buffer, yieldRedemptionPrice, valueOffset, valueLength, 697, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.YIELD_REDEMPTION_PRICE_TYPE:
                hasYieldRedemptionPriceType = true;
                yieldRedemptionPriceType = getInt(buffer, valueOffset, endOfField, 698, CODEC_VALIDATION_ENABLED);
                break;


            case Constants.CURRENCY:
                hasCurrency = true;
                currency = buffer.getChars(currency, valueOffset, valueLength);
                currencyOffset = valueOffset;
                currencyLength = valueLength;
                break;

            case Constants.COMPLIANCE_ID:
                hasComplianceID = true;
                complianceID = buffer.getChars(complianceID, valueOffset, valueLength);
                complianceIDOffset = valueOffset;
                complianceIDLength = valueLength;
                break;

            case Constants.SOLICITED_FLAG:
                hasSolicitedFlag = true;
                solicitedFlag = buffer.getBoolean(valueOffset);
                break;

            case Constants.I_O_I_ID:
                hasIOIID = true;
                iOIID = buffer.getChars(iOIID, valueOffset, valueLength);
                iOIIDOffset = valueOffset;
                iOIIDLength = valueLength;
                break;

            case Constants.QUOTE_ID:
                hasQuoteID = true;
                quoteID = buffer.getChars(quoteID, valueOffset, valueLength);
                quoteIDOffset = valueOffset;
                quoteIDLength = valueLength;
                break;

            case Constants.REF_ORDER_ID:
                hasRefOrderID = true;
                refOrderID = buffer.getChars(refOrderID, valueOffset, valueLength);
                refOrderIDOffset = valueOffset;
                refOrderIDLength = valueLength;
                break;

            case Constants.REF_ORDER_ID_SOURCE:
                hasRefOrderIDSource = true;
                refOrderIDSource = buffer.getChar(valueOffset);
                break;

            case Constants.TIME_IN_FORCE:
                hasTimeInForce = true;
                timeInForce = buffer.getChar(valueOffset);
                break;

            case Constants.EFFECTIVE_TIME:
                hasEffectiveTime = true;
                effectiveTime = buffer.getBytes(effectiveTime, valueOffset, valueLength);
                effectiveTimeOffset = valueOffset;
                effectiveTimeLength = valueLength;
                break;

            case Constants.EXPIRE_DATE:
                hasExpireDate = true;
                expireDate = buffer.getBytes(expireDate, valueOffset, valueLength);
                expireDateOffset = valueOffset;
                expireDateLength = valueLength;
                break;

            case Constants.EXPIRE_TIME:
                hasExpireTime = true;
                expireTime = buffer.getBytes(expireTime, valueOffset, valueLength);
                expireTimeOffset = valueOffset;
                expireTimeLength = valueLength;
                break;

            case Constants.G_T_BOOKING_INST:
                hasGTBookingInst = true;
                gTBookingInst = getInt(buffer, valueOffset, endOfField, 427, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.COMMISSION:
                hasCommission = true;
                commission = getFloat(buffer, commission, valueOffset, valueLength, 12, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.COMM_TYPE:
                hasCommType = true;
                commType = buffer.getChar(valueOffset);
                break;

            case Constants.COMM_CURRENCY:
                hasCommCurrency = true;
                commCurrency = buffer.getChars(commCurrency, valueOffset, valueLength);
                commCurrencyOffset = valueOffset;
                commCurrencyLength = valueLength;
                break;

            case Constants.FUND_RENEW_WAIV:
                hasFundRenewWaiv = true;
                fundRenewWaiv = buffer.getChar(valueOffset);
                break;


            case Constants.ORDER_CAPACITY:
                hasOrderCapacity = true;
                orderCapacity = buffer.getChar(valueOffset);
                break;

            case Constants.ORDER_RESTRICTIONS:
                hasOrderRestrictions = true;
                orderRestrictions = buffer.getChars(orderRestrictions, valueOffset, valueLength);
                orderRestrictionsOffset = valueOffset;
                orderRestrictionsLength = valueLength;
                break;

            case Constants.PRE_TRADE_ANONYMITY:
                hasPreTradeAnonymity = true;
                preTradeAnonymity = buffer.getBoolean(valueOffset);
                break;

            case Constants.CUST_ORDER_CAPACITY:
                hasCustOrderCapacity = true;
                custOrderCapacity = getInt(buffer, valueOffset, endOfField, 582, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.FOREX_REQ:
                hasForexReq = true;
                forexReq = buffer.getBoolean(valueOffset);
                break;

            case Constants.SETTL_CURRENCY:
                hasSettlCurrency = true;
                settlCurrency = buffer.getChars(settlCurrency, valueOffset, valueLength);
                settlCurrencyOffset = valueOffset;
                settlCurrencyLength = valueLength;
                break;

            case Constants.BOOKING_TYPE:
                hasBookingType = true;
                bookingType = getInt(buffer, valueOffset, endOfField, 775, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.TEXT:
                hasText = true;
                text = buffer.getChars(text, valueOffset, valueLength);
                textOffset = valueOffset;
                textLength = valueLength;
                break;

            case Constants.ENCODED_TEXT_LEN:
                hasEncodedTextLen = true;
                encodedTextLen = getInt(buffer, valueOffset, endOfField, 354, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.ENCODED_TEXT:
                hasEncodedText = true;
                encodedText = buffer.getBytes(encodedText, valueOffset, encodedTextLen);
                endOfField = valueOffset + encodedTextLen;
                break;

            case Constants.SETTL_DATE2:
                hasSettlDate2 = true;
                settlDate2 = buffer.getBytes(settlDate2, valueOffset, valueLength);
                settlDate2Offset = valueOffset;
                settlDate2Length = valueLength;
                break;

            case Constants.ORDER_QTY2:
                hasOrderQty2 = true;
                orderQty2 = getFloat(buffer, orderQty2, valueOffset, valueLength, 192, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.PRICE2:
                hasPrice2 = true;
                price2 = getFloat(buffer, price2, valueOffset, valueLength, 640, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.POSITION_EFFECT:
                hasPositionEffect = true;
                positionEffect = buffer.getChar(valueOffset);
                break;

            case Constants.COVERED_OR_UNCOVERED:
                hasCoveredOrUncovered = true;
                coveredOrUncovered = getInt(buffer, valueOffset, endOfField, 203, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.MAX_SHOW:
                hasMaxShow = true;
                maxShow = getFloat(buffer, maxShow, valueOffset, valueLength, 210, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.PEG_OFFSET_VALUE:
                hasPegOffsetValue = true;
                pegOffsetValue = getFloat(buffer, pegOffsetValue, valueOffset, valueLength, 211, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.PEG_PRICE_TYPE:
                hasPegPriceType = true;
                pegPriceType = getInt(buffer, valueOffset, endOfField, 1094, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.PEG_MOVE_TYPE:
                hasPegMoveType = true;
                pegMoveType = getInt(buffer, valueOffset, endOfField, 835, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.PEG_OFFSET_TYPE:
                hasPegOffsetType = true;
                pegOffsetType = getInt(buffer, valueOffset, endOfField, 836, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.PEG_LIMIT_TYPE:
                hasPegLimitType = true;
                pegLimitType = getInt(buffer, valueOffset, endOfField, 837, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.PEG_ROUND_DIRECTION:
                hasPegRoundDirection = true;
                pegRoundDirection = getInt(buffer, valueOffset, endOfField, 838, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.PEG_SCOPE:
                hasPegScope = true;
                pegScope = getInt(buffer, valueOffset, endOfField, 840, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.PEG_SECURITY_ID_SOURCE:
                hasPegSecurityIDSource = true;
                pegSecurityIDSource = buffer.getChars(pegSecurityIDSource, valueOffset, valueLength);
                pegSecurityIDSourceOffset = valueOffset;
                pegSecurityIDSourceLength = valueLength;
                break;

            case Constants.PEG_SECURITY_ID:
                hasPegSecurityID = true;
                pegSecurityID = buffer.getChars(pegSecurityID, valueOffset, valueLength);
                pegSecurityIDOffset = valueOffset;
                pegSecurityIDLength = valueLength;
                break;

            case Constants.PEG_SYMBOL:
                hasPegSymbol = true;
                pegSymbol = buffer.getChars(pegSymbol, valueOffset, valueLength);
                pegSymbolOffset = valueOffset;
                pegSymbolLength = valueLength;
                break;

            case Constants.PEG_SECURITY_DESC:
                hasPegSecurityDesc = true;
                pegSecurityDesc = buffer.getChars(pegSecurityDesc, valueOffset, valueLength);
                pegSecurityDescOffset = valueOffset;
                pegSecurityDescLength = valueLength;
                break;


            case Constants.DISCRETION_INST:
                hasDiscretionInst = true;
                discretionInst = buffer.getChar(valueOffset);
                break;

            case Constants.DISCRETION_OFFSET_VALUE:
                hasDiscretionOffsetValue = true;
                discretionOffsetValue = getFloat(buffer, discretionOffsetValue, valueOffset, valueLength, 389, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.DISCRETION_MOVE_TYPE:
                hasDiscretionMoveType = true;
                discretionMoveType = getInt(buffer, valueOffset, endOfField, 841, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.DISCRETION_OFFSET_TYPE:
                hasDiscretionOffsetType = true;
                discretionOffsetType = getInt(buffer, valueOffset, endOfField, 842, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.DISCRETION_LIMIT_TYPE:
                hasDiscretionLimitType = true;
                discretionLimitType = getInt(buffer, valueOffset, endOfField, 843, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.DISCRETION_ROUND_DIRECTION:
                hasDiscretionRoundDirection = true;
                discretionRoundDirection = getInt(buffer, valueOffset, endOfField, 844, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.DISCRETION_SCOPE:
                hasDiscretionScope = true;
                discretionScope = getInt(buffer, valueOffset, endOfField, 846, CODEC_VALIDATION_ENABLED);
                break;


            case Constants.TARGET_STRATEGY:
                hasTargetStrategy = true;
                targetStrategy = getInt(buffer, valueOffset, endOfField, 847, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.NO_STRATEGY_PARAMETERS_GROUP_COUNTER:
                hasNoStrategyParametersGroupCounter = true;
                noStrategyParametersGroupCounter = getInt(buffer, valueOffset, endOfField, 957, CODEC_VALIDATION_ENABLED);
                if (strategyParametersGroup == null)
                {
                    strategyParametersGroup = new StrategyParametersGroupDecoder(trailer, messageFields);
                }
                StrategyParametersGroupDecoder strategyParametersGroupCurrent = strategyParametersGroup;
                position = endOfField + 1;
                final int noStrategyParametersGroupCounter = this.noStrategyParametersGroupCounter;
                for (int i = 0; i < noStrategyParametersGroupCounter && position < end; i++)
                {
                    if (strategyParametersGroupCurrent != null)
                    {
                        position += strategyParametersGroupCurrent.decode(buffer, position, end - position);
                        strategyParametersGroupCurrent = strategyParametersGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (strategyParametersGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;


            case Constants.TARGET_STRATEGY_PARAMETERS:
                hasTargetStrategyParameters = true;
                targetStrategyParameters = buffer.getChars(targetStrategyParameters, valueOffset, valueLength);
                targetStrategyParametersOffset = valueOffset;
                targetStrategyParametersLength = valueLength;
                break;

            case Constants.PARTICIPATION_RATE:
                hasParticipationRate = true;
                participationRate = getFloat(buffer, participationRate, valueOffset, valueLength, 849, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.DESIGNATION:
                hasDesignation = true;
                designation = buffer.getChars(designation, valueOffset, valueLength);
                designationOffset = valueOffset;
                designationLength = valueLength;
                break;

            default:
                if (!CODEC_REJECT_UNKNOWN_FIELD_ENABLED)
                {
                    seenFields.remove(tag);
                }
                if (CODEC_REJECT_UNKNOWN_FIELD_ENABLED || (trailer.REQUIRED_FIELDS.contains(tag) || messageFields.contains(tag)))
                {
                    return position - offset;
                }

            }

            if (position < (endOfField + 1))
            {
                position = endOfField + 1;
            }
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetClOrdID();
        this.resetSecondaryClOrdID();
        this.resetListSeqNo();
        this.resetClOrdLinkID();
        this.resetSettlInstMode();
        this.resetTradeOriginationDate();
        this.resetTradeDate();
        this.resetAccount();
        this.resetAcctIDSource();
        this.resetAccountType();
        this.resetDayBookingInst();
        this.resetBookingUnit();
        this.resetAllocID();
        this.resetPreallocMethod();
        this.resetSettlType();
        this.resetSettlDate();
        this.resetCashMargin();
        this.resetClearingFeeIndicator();
        this.resetHandlInst();
        this.resetExecInst();
        this.resetMinQty();
        this.resetMatchIncrement();
        this.resetMaxPriceLevels();
        this.resetMaxFloor();
        this.resetExDestination();
        this.resetExDestinationIDSource();
        this.resetProcessCode();
        this.resetPrevClosePx();
        this.resetSide();
        this.resetSideValueInd();
        this.resetLocateReqd();
        this.resetTransactTime();
        this.resetQtyType();
        this.resetOrdType();
        this.resetPriceType();
        this.resetPrice();
        this.resetPriceProtectionScope();
        this.resetStopPx();
        this.resetCurrency();
        this.resetComplianceID();
        this.resetSolicitedFlag();
        this.resetIOIID();
        this.resetQuoteID();
        this.resetRefOrderID();
        this.resetRefOrderIDSource();
        this.resetTimeInForce();
        this.resetEffectiveTime();
        this.resetExpireDate();
        this.resetExpireTime();
        this.resetGTBookingInst();
        this.resetOrderCapacity();
        this.resetOrderRestrictions();
        this.resetPreTradeAnonymity();
        this.resetCustOrderCapacity();
        this.resetForexReq();
        this.resetSettlCurrency();
        this.resetBookingType();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        this.resetSettlDate2();
        this.resetOrderQty2();
        this.resetPrice2();
        this.resetPositionEffect();
        this.resetCoveredOrUncovered();
        this.resetMaxShow();
        this.resetTargetStrategy();
        this.resetTargetStrategyParameters();
        this.resetParticipationRate();
        this.resetDesignation();
        this.resetPartyIDsGroup();
        this.resetAllocsGroup();
        this.resetDisplayQty();
        this.resetSecondaryDisplayQty();
        this.resetDisplayWhen();
        this.resetDisplayMethod();
        this.resetDisplayLowQty();
        this.resetDisplayHighQty();
        this.resetDisplayMinIncr();
        this.resetRefreshQty();
        this.resetTradingSessionsGroup();
        this.resetSymbol();
        this.resetSymbolSfx();
        this.resetSecurityID();
        this.resetSecurityIDSource();
        this.resetProduct();
        this.resetProductComplex();
        this.resetSecurityGroup();
        this.resetCFICode();
        this.resetSecurityType();
        this.resetSecuritySubType();
        this.resetMaturityMonthYear();
        this.resetMaturityDate();
        this.resetMaturityTime();
        this.resetSettleOnOpenFlag();
        this.resetInstrmtAssignmentMethod();
        this.resetSecurityStatus();
        this.resetCouponPaymentDate();
        this.resetRestructuringType();
        this.resetSeniority();
        this.resetNotionalPercentageOutstanding();
        this.resetOriginalNotionalPercentageOutstanding();
        this.resetAttachmentPoint();
        this.resetDetachmentPoint();
        this.resetIssueDate();
        this.resetRepoCollateralSecurityType();
        this.resetRepurchaseTerm();
        this.resetRepurchaseRate();
        this.resetFactor();
        this.resetCreditRating();
        this.resetInstrRegistry();
        this.resetCountryOfIssue();
        this.resetStateOrProvinceOfIssue();
        this.resetLocaleOfIssue();
        this.resetRedemptionDate();
        this.resetStrikePrice();
        this.resetStrikeCurrency();
        this.resetStrikeMultiplier();
        this.resetStrikeValue();
        this.resetStrikePriceDeterminationMethod();
        this.resetStrikePriceBoundaryMethod();
        this.resetStrikePriceBoundaryPrecision();
        this.resetUnderlyingPriceDeterminationMethod();
        this.resetOptAttribute();
        this.resetContractMultiplier();
        this.resetContractMultiplierUnit();
        this.resetFlowScheduleType();
        this.resetMinPriceIncrement();
        this.resetMinPriceIncrementAmount();
        this.resetUnitOfMeasure();
        this.resetUnitOfMeasureQty();
        this.resetPriceUnitOfMeasure();
        this.resetPriceUnitOfMeasureQty();
        this.resetSettlMethod();
        this.resetExerciseStyle();
        this.resetOptPayoutType();
        this.resetOptPayoutAmount();
        this.resetPriceQuoteMethod();
        this.resetValuationMethod();
        this.resetListMethod();
        this.resetCapPrice();
        this.resetFloorPrice();
        this.resetPutOrCall();
        this.resetFlexibleIndicator();
        this.resetFlexProductEligibilityIndicator();
        this.resetTimeUnit();
        this.resetCouponRate();
        this.resetSecurityExchange();
        this.resetPositionLimit();
        this.resetNTPositionLimit();
        this.resetIssuer();
        this.resetEncodedIssuerLen();
        this.resetEncodedIssuer();
        this.resetSecurityDesc();
        this.resetEncodedSecurityDescLen();
        this.resetEncodedSecurityDesc();
        this.resetPool();
        this.resetContractSettlMonth();
        this.resetCPProgram();
        this.resetCPRegType();
        this.resetDatedDate();
        this.resetInterestAccrualDate();
        this.resetSecurityAltIDGroup();
        this.resetSecurityXMLLen();
        this.resetSecurityXML();
        this.resetSecurityXMLSchema();
        this.resetEventsGroup();
        this.resetInstrumentPartiesGroup();
        this.resetComplexEventsGroup();
        this.resetUnderlyingsGroup();
        this.resetStipulationsGroup();
        this.resetOrderQty();
        this.resetCashOrderQty();
        this.resetOrderPercent();
        this.resetRoundingDirection();
        this.resetRoundingModulus();
        this.resetTriggerType();
        this.resetTriggerAction();
        this.resetTriggerPrice();
        this.resetTriggerSymbol();
        this.resetTriggerSecurityID();
        this.resetTriggerSecurityIDSource();
        this.resetTriggerSecurityDesc();
        this.resetTriggerPriceType();
        this.resetTriggerPriceTypeScope();
        this.resetTriggerPriceDirection();
        this.resetTriggerNewPrice();
        this.resetTriggerOrderType();
        this.resetTriggerNewQty();
        this.resetTriggerTradingSessionID();
        this.resetTriggerTradingSessionSubID();
        this.resetSpread();
        this.resetBenchmarkCurveCurrency();
        this.resetBenchmarkCurveName();
        this.resetBenchmarkCurvePoint();
        this.resetBenchmarkPrice();
        this.resetBenchmarkPriceType();
        this.resetBenchmarkSecurityID();
        this.resetBenchmarkSecurityIDSource();
        this.resetYieldType();
        this.resetYield();
        this.resetYieldCalcDate();
        this.resetYieldRedemptionDate();
        this.resetYieldRedemptionPrice();
        this.resetYieldRedemptionPriceType();
        this.resetCommission();
        this.resetCommType();
        this.resetCommCurrency();
        this.resetFundRenewWaiv();
        this.resetPegOffsetValue();
        this.resetPegPriceType();
        this.resetPegMoveType();
        this.resetPegOffsetType();
        this.resetPegLimitType();
        this.resetPegRoundDirection();
        this.resetPegScope();
        this.resetPegSecurityIDSource();
        this.resetPegSecurityID();
        this.resetPegSymbol();
        this.resetPegSecurityDesc();
        this.resetDiscretionInst();
        this.resetDiscretionOffsetValue();
        this.resetDiscretionMoveType();
        this.resetDiscretionOffsetType();
        this.resetDiscretionLimitType();
        this.resetDiscretionRoundDirection();
        this.resetDiscretionScope();
        this.resetStrategyParametersGroup();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetClOrdID()
    {
        clOrdIDOffset = 0;
        clOrdIDLength = 0;
    }

    public void resetSecondaryClOrdID()
    {
        hasSecondaryClOrdID = false;
    }

    public void resetListSeqNo()
    {
        listSeqNo = MISSING_INT;
    }

    public void resetClOrdLinkID()
    {
        hasClOrdLinkID = false;
    }

    public void resetSettlInstMode()
    {
        hasSettlInstMode = false;
    }

    public void resetTradeOriginationDate()
    {
        hasTradeOriginationDate = false;
    }

    public void resetTradeDate()
    {
        hasTradeDate = false;
    }

    public void resetAccount()
    {
        hasAccount = false;
    }

    public void resetAcctIDSource()
    {
        hasAcctIDSource = false;
    }

    public void resetAccountType()
    {
        hasAccountType = false;
    }

    public void resetDayBookingInst()
    {
        hasDayBookingInst = false;
    }

    public void resetBookingUnit()
    {
        hasBookingUnit = false;
    }

    public void resetAllocID()
    {
        hasAllocID = false;
    }

    public void resetPreallocMethod()
    {
        hasPreallocMethod = false;
    }

    public void resetSettlType()
    {
        hasSettlType = false;
    }

    public void resetSettlDate()
    {
        hasSettlDate = false;
    }

    public void resetCashMargin()
    {
        hasCashMargin = false;
    }

    public void resetClearingFeeIndicator()
    {
        hasClearingFeeIndicator = false;
    }

    public void resetHandlInst()
    {
        hasHandlInst = false;
    }

    public void resetExecInst()
    {
        hasExecInst = false;
    }

    public void resetMinQty()
    {
        hasMinQty = false;
    }

    public void resetMatchIncrement()
    {
        hasMatchIncrement = false;
    }

    public void resetMaxPriceLevels()
    {
        hasMaxPriceLevels = false;
    }

    public void resetMaxFloor()
    {
        hasMaxFloor = false;
    }

    public void resetExDestination()
    {
        hasExDestination = false;
    }

    public void resetExDestinationIDSource()
    {
        hasExDestinationIDSource = false;
    }

    public void resetProcessCode()
    {
        hasProcessCode = false;
    }

    public void resetPrevClosePx()
    {
        hasPrevClosePx = false;
    }

    public void resetSide()
    {
        side = MISSING_CHAR;
    }

    public void resetSideValueInd()
    {
        hasSideValueInd = false;
    }

    public void resetLocateReqd()
    {
        hasLocateReqd = false;
    }

    public void resetTransactTime()
    {
        hasTransactTime = false;
    }

    public void resetQtyType()
    {
        hasQtyType = false;
    }

    public void resetOrdType()
    {
        hasOrdType = false;
    }

    public void resetPriceType()
    {
        hasPriceType = false;
    }

    public void resetPrice()
    {
        hasPrice = false;
    }

    public void resetPriceProtectionScope()
    {
        hasPriceProtectionScope = false;
    }

    public void resetStopPx()
    {
        hasStopPx = false;
    }

    public void resetCurrency()
    {
        hasCurrency = false;
    }

    public void resetComplianceID()
    {
        hasComplianceID = false;
    }

    public void resetSolicitedFlag()
    {
        hasSolicitedFlag = false;
    }

    public void resetIOIID()
    {
        hasIOIID = false;
    }

    public void resetQuoteID()
    {
        hasQuoteID = false;
    }

    public void resetRefOrderID()
    {
        hasRefOrderID = false;
    }

    public void resetRefOrderIDSource()
    {
        hasRefOrderIDSource = false;
    }

    public void resetTimeInForce()
    {
        hasTimeInForce = false;
    }

    public void resetEffectiveTime()
    {
        hasEffectiveTime = false;
    }

    public void resetExpireDate()
    {
        hasExpireDate = false;
    }

    public void resetExpireTime()
    {
        hasExpireTime = false;
    }

    public void resetGTBookingInst()
    {
        hasGTBookingInst = false;
    }

    public void resetOrderCapacity()
    {
        hasOrderCapacity = false;
    }

    public void resetOrderRestrictions()
    {
        hasOrderRestrictions = false;
    }

    public void resetPreTradeAnonymity()
    {
        hasPreTradeAnonymity = false;
    }

    public void resetCustOrderCapacity()
    {
        hasCustOrderCapacity = false;
    }

    public void resetForexReq()
    {
        hasForexReq = false;
    }

    public void resetSettlCurrency()
    {
        hasSettlCurrency = false;
    }

    public void resetBookingType()
    {
        hasBookingType = false;
    }

    public void resetText()
    {
        hasText = false;
    }

    public void resetEncodedTextLen()
    {
        hasEncodedTextLen = false;
    }

    public void resetEncodedText()
    {
        hasEncodedText = false;
    }

    public void resetSettlDate2()
    {
        hasSettlDate2 = false;
    }

    public void resetOrderQty2()
    {
        hasOrderQty2 = false;
    }

    public void resetPrice2()
    {
        hasPrice2 = false;
    }

    public void resetPositionEffect()
    {
        hasPositionEffect = false;
    }

    public void resetCoveredOrUncovered()
    {
        hasCoveredOrUncovered = false;
    }

    public void resetMaxShow()
    {
        hasMaxShow = false;
    }

    public void resetTargetStrategy()
    {
        hasTargetStrategy = false;
    }

    public void resetTargetStrategyParameters()
    {
        hasTargetStrategyParameters = false;
    }

    public void resetParticipationRate()
    {
        hasParticipationRate = false;
    }

    public void resetDesignation()
    {
        hasDesignation = false;
    }

    public void resetPartyIDsGroup()
    {
        for (final PartyIDsGroupDecoder partyIDsGroupDecoder : partyIDsGroupIterator.iterator())
        {
            partyIDsGroupDecoder.reset();
            if (partyIDsGroupDecoder.next() == null)
            {
                break;
            }
        }
        noPartyIDsGroupCounter = MISSING_INT;
        hasNoPartyIDsGroupCounter = false;
    }

    public void resetAllocsGroup()
    {
        for (final AllocsGroupDecoder allocsGroupDecoder : allocsGroupIterator.iterator())
        {
            allocsGroupDecoder.reset();
            if (allocsGroupDecoder.next() == null)
            {
                break;
            }
        }
        noAllocsGroupCounter = MISSING_INT;
        hasNoAllocsGroupCounter = false;
    }

    public void resetDisplayQty()
    {
        hasDisplayQty = false;
    }

    public void resetSecondaryDisplayQty()
    {
        hasSecondaryDisplayQty = false;
    }

    public void resetDisplayWhen()
    {
        hasDisplayWhen = false;
    }

    public void resetDisplayMethod()
    {
        hasDisplayMethod = false;
    }

    public void resetDisplayLowQty()
    {
        hasDisplayLowQty = false;
    }

    public void resetDisplayHighQty()
    {
        hasDisplayHighQty = false;
    }

    public void resetDisplayMinIncr()
    {
        hasDisplayMinIncr = false;
    }

    public void resetRefreshQty()
    {
        hasRefreshQty = false;
    }

    public void resetTradingSessionsGroup()
    {
        for (final TradingSessionsGroupDecoder tradingSessionsGroupDecoder : tradingSessionsGroupIterator.iterator())
        {
            tradingSessionsGroupDecoder.reset();
            if (tradingSessionsGroupDecoder.next() == null)
            {
                break;
            }
        }
        noTradingSessionsGroupCounter = MISSING_INT;
        hasNoTradingSessionsGroupCounter = false;
    }

    public void resetSymbol()
    {
        hasSymbol = false;
    }

    public void resetSymbolSfx()
    {
        hasSymbolSfx = false;
    }

    public void resetSecurityID()
    {
        hasSecurityID = false;
    }

    public void resetSecurityIDSource()
    {
        hasSecurityIDSource = false;
    }

    public void resetProduct()
    {
        hasProduct = false;
    }

    public void resetProductComplex()
    {
        hasProductComplex = false;
    }

    public void resetSecurityGroup()
    {
        hasSecurityGroup = false;
    }

    public void resetCFICode()
    {
        hasCFICode = false;
    }

    public void resetSecurityType()
    {
        hasSecurityType = false;
    }

    public void resetSecuritySubType()
    {
        hasSecuritySubType = false;
    }

    public void resetMaturityMonthYear()
    {
        hasMaturityMonthYear = false;
    }

    public void resetMaturityDate()
    {
        hasMaturityDate = false;
    }

    public void resetMaturityTime()
    {
        hasMaturityTime = false;
    }

    public void resetSettleOnOpenFlag()
    {
        hasSettleOnOpenFlag = false;
    }

    public void resetInstrmtAssignmentMethod()
    {
        hasInstrmtAssignmentMethod = false;
    }

    public void resetSecurityStatus()
    {
        hasSecurityStatus = false;
    }

    public void resetCouponPaymentDate()
    {
        hasCouponPaymentDate = false;
    }

    public void resetRestructuringType()
    {
        hasRestructuringType = false;
    }

    public void resetSeniority()
    {
        hasSeniority = false;
    }

    public void resetNotionalPercentageOutstanding()
    {
        hasNotionalPercentageOutstanding = false;
    }

    public void resetOriginalNotionalPercentageOutstanding()
    {
        hasOriginalNotionalPercentageOutstanding = false;
    }

    public void resetAttachmentPoint()
    {
        hasAttachmentPoint = false;
    }

    public void resetDetachmentPoint()
    {
        hasDetachmentPoint = false;
    }

    public void resetIssueDate()
    {
        hasIssueDate = false;
    }

    public void resetRepoCollateralSecurityType()
    {
        hasRepoCollateralSecurityType = false;
    }

    public void resetRepurchaseTerm()
    {
        hasRepurchaseTerm = false;
    }

    public void resetRepurchaseRate()
    {
        hasRepurchaseRate = false;
    }

    public void resetFactor()
    {
        hasFactor = false;
    }

    public void resetCreditRating()
    {
        hasCreditRating = false;
    }

    public void resetInstrRegistry()
    {
        hasInstrRegistry = false;
    }

    public void resetCountryOfIssue()
    {
        hasCountryOfIssue = false;
    }

    public void resetStateOrProvinceOfIssue()
    {
        hasStateOrProvinceOfIssue = false;
    }

    public void resetLocaleOfIssue()
    {
        hasLocaleOfIssue = false;
    }

    public void resetRedemptionDate()
    {
        hasRedemptionDate = false;
    }

    public void resetStrikePrice()
    {
        hasStrikePrice = false;
    }

    public void resetStrikeCurrency()
    {
        hasStrikeCurrency = false;
    }

    public void resetStrikeMultiplier()
    {
        hasStrikeMultiplier = false;
    }

    public void resetStrikeValue()
    {
        hasStrikeValue = false;
    }

    public void resetStrikePriceDeterminationMethod()
    {
        hasStrikePriceDeterminationMethod = false;
    }

    public void resetStrikePriceBoundaryMethod()
    {
        hasStrikePriceBoundaryMethod = false;
    }

    public void resetStrikePriceBoundaryPrecision()
    {
        hasStrikePriceBoundaryPrecision = false;
    }

    public void resetUnderlyingPriceDeterminationMethod()
    {
        hasUnderlyingPriceDeterminationMethod = false;
    }

    public void resetOptAttribute()
    {
        hasOptAttribute = false;
    }

    public void resetContractMultiplier()
    {
        hasContractMultiplier = false;
    }

    public void resetContractMultiplierUnit()
    {
        hasContractMultiplierUnit = false;
    }

    public void resetFlowScheduleType()
    {
        hasFlowScheduleType = false;
    }

    public void resetMinPriceIncrement()
    {
        hasMinPriceIncrement = false;
    }

    public void resetMinPriceIncrementAmount()
    {
        hasMinPriceIncrementAmount = false;
    }

    public void resetUnitOfMeasure()
    {
        hasUnitOfMeasure = false;
    }

    public void resetUnitOfMeasureQty()
    {
        hasUnitOfMeasureQty = false;
    }

    public void resetPriceUnitOfMeasure()
    {
        hasPriceUnitOfMeasure = false;
    }

    public void resetPriceUnitOfMeasureQty()
    {
        hasPriceUnitOfMeasureQty = false;
    }

    public void resetSettlMethod()
    {
        hasSettlMethod = false;
    }

    public void resetExerciseStyle()
    {
        hasExerciseStyle = false;
    }

    public void resetOptPayoutType()
    {
        hasOptPayoutType = false;
    }

    public void resetOptPayoutAmount()
    {
        hasOptPayoutAmount = false;
    }

    public void resetPriceQuoteMethod()
    {
        hasPriceQuoteMethod = false;
    }

    public void resetValuationMethod()
    {
        hasValuationMethod = false;
    }

    public void resetListMethod()
    {
        hasListMethod = false;
    }

    public void resetCapPrice()
    {
        hasCapPrice = false;
    }

    public void resetFloorPrice()
    {
        hasFloorPrice = false;
    }

    public void resetPutOrCall()
    {
        hasPutOrCall = false;
    }

    public void resetFlexibleIndicator()
    {
        hasFlexibleIndicator = false;
    }

    public void resetFlexProductEligibilityIndicator()
    {
        hasFlexProductEligibilityIndicator = false;
    }

    public void resetTimeUnit()
    {
        hasTimeUnit = false;
    }

    public void resetCouponRate()
    {
        hasCouponRate = false;
    }

    public void resetSecurityExchange()
    {
        hasSecurityExchange = false;
    }

    public void resetPositionLimit()
    {
        hasPositionLimit = false;
    }

    public void resetNTPositionLimit()
    {
        hasNTPositionLimit = false;
    }

    public void resetIssuer()
    {
        hasIssuer = false;
    }

    public void resetEncodedIssuerLen()
    {
        hasEncodedIssuerLen = false;
    }

    public void resetEncodedIssuer()
    {
        hasEncodedIssuer = false;
    }

    public void resetSecurityDesc()
    {
        hasSecurityDesc = false;
    }

    public void resetEncodedSecurityDescLen()
    {
        hasEncodedSecurityDescLen = false;
    }

    public void resetEncodedSecurityDesc()
    {
        hasEncodedSecurityDesc = false;
    }

    public void resetPool()
    {
        hasPool = false;
    }

    public void resetContractSettlMonth()
    {
        hasContractSettlMonth = false;
    }

    public void resetCPProgram()
    {
        hasCPProgram = false;
    }

    public void resetCPRegType()
    {
        hasCPRegType = false;
    }

    public void resetDatedDate()
    {
        hasDatedDate = false;
    }

    public void resetInterestAccrualDate()
    {
        hasInterestAccrualDate = false;
    }

    public void resetSecurityAltIDGroup()
    {
        for (final SecurityAltIDGroupDecoder securityAltIDGroupDecoder : securityAltIDGroupIterator.iterator())
        {
            securityAltIDGroupDecoder.reset();
            if (securityAltIDGroupDecoder.next() == null)
            {
                break;
            }
        }
        noSecurityAltIDGroupCounter = MISSING_INT;
        hasNoSecurityAltIDGroupCounter = false;
    }

    public void resetSecurityXMLLen()
    {
        hasSecurityXMLLen = false;
    }

    public void resetSecurityXML()
    {
        hasSecurityXML = false;
    }

    public void resetSecurityXMLSchema()
    {
        hasSecurityXMLSchema = false;
    }

    public void resetEventsGroup()
    {
        for (final EventsGroupDecoder eventsGroupDecoder : eventsGroupIterator.iterator())
        {
            eventsGroupDecoder.reset();
            if (eventsGroupDecoder.next() == null)
            {
                break;
            }
        }
        noEventsGroupCounter = MISSING_INT;
        hasNoEventsGroupCounter = false;
    }

    public void resetInstrumentPartiesGroup()
    {
        for (final InstrumentPartiesGroupDecoder instrumentPartiesGroupDecoder : instrumentPartiesGroupIterator.iterator())
        {
            instrumentPartiesGroupDecoder.reset();
            if (instrumentPartiesGroupDecoder.next() == null)
            {
                break;
            }
        }
        noInstrumentPartiesGroupCounter = MISSING_INT;
        hasNoInstrumentPartiesGroupCounter = false;
    }

    public void resetComplexEventsGroup()
    {
        for (final ComplexEventsGroupDecoder complexEventsGroupDecoder : complexEventsGroupIterator.iterator())
        {
            complexEventsGroupDecoder.reset();
            if (complexEventsGroupDecoder.next() == null)
            {
                break;
            }
        }
        noComplexEventsGroupCounter = MISSING_INT;
        hasNoComplexEventsGroupCounter = false;
    }

    public void resetUnderlyingsGroup()
    {
        for (final UnderlyingsGroupDecoder underlyingsGroupDecoder : underlyingsGroupIterator.iterator())
        {
            underlyingsGroupDecoder.reset();
            if (underlyingsGroupDecoder.next() == null)
            {
                break;
            }
        }
        noUnderlyingsGroupCounter = MISSING_INT;
        hasNoUnderlyingsGroupCounter = false;
    }

    public void resetStipulationsGroup()
    {
        for (final StipulationsGroupDecoder stipulationsGroupDecoder : stipulationsGroupIterator.iterator())
        {
            stipulationsGroupDecoder.reset();
            if (stipulationsGroupDecoder.next() == null)
            {
                break;
            }
        }
        noStipulationsGroupCounter = MISSING_INT;
        hasNoStipulationsGroupCounter = false;
    }

    public void resetOrderQty()
    {
        hasOrderQty = false;
    }

    public void resetCashOrderQty()
    {
        hasCashOrderQty = false;
    }

    public void resetOrderPercent()
    {
        hasOrderPercent = false;
    }

    public void resetRoundingDirection()
    {
        hasRoundingDirection = false;
    }

    public void resetRoundingModulus()
    {
        hasRoundingModulus = false;
    }

    public void resetTriggerType()
    {
        hasTriggerType = false;
    }

    public void resetTriggerAction()
    {
        hasTriggerAction = false;
    }

    public void resetTriggerPrice()
    {
        hasTriggerPrice = false;
    }

    public void resetTriggerSymbol()
    {
        hasTriggerSymbol = false;
    }

    public void resetTriggerSecurityID()
    {
        hasTriggerSecurityID = false;
    }

    public void resetTriggerSecurityIDSource()
    {
        hasTriggerSecurityIDSource = false;
    }

    public void resetTriggerSecurityDesc()
    {
        hasTriggerSecurityDesc = false;
    }

    public void resetTriggerPriceType()
    {
        hasTriggerPriceType = false;
    }

    public void resetTriggerPriceTypeScope()
    {
        hasTriggerPriceTypeScope = false;
    }

    public void resetTriggerPriceDirection()
    {
        hasTriggerPriceDirection = false;
    }

    public void resetTriggerNewPrice()
    {
        hasTriggerNewPrice = false;
    }

    public void resetTriggerOrderType()
    {
        hasTriggerOrderType = false;
    }

    public void resetTriggerNewQty()
    {
        hasTriggerNewQty = false;
    }

    public void resetTriggerTradingSessionID()
    {
        hasTriggerTradingSessionID = false;
    }

    public void resetTriggerTradingSessionSubID()
    {
        hasTriggerTradingSessionSubID = false;
    }

    public void resetSpread()
    {
        hasSpread = false;
    }

    public void resetBenchmarkCurveCurrency()
    {
        hasBenchmarkCurveCurrency = false;
    }

    public void resetBenchmarkCurveName()
    {
        hasBenchmarkCurveName = false;
    }

    public void resetBenchmarkCurvePoint()
    {
        hasBenchmarkCurvePoint = false;
    }

    public void resetBenchmarkPrice()
    {
        hasBenchmarkPrice = false;
    }

    public void resetBenchmarkPriceType()
    {
        hasBenchmarkPriceType = false;
    }

    public void resetBenchmarkSecurityID()
    {
        hasBenchmarkSecurityID = false;
    }

    public void resetBenchmarkSecurityIDSource()
    {
        hasBenchmarkSecurityIDSource = false;
    }

    public void resetYieldType()
    {
        hasYieldType = false;
    }

    public void resetYield()
    {
        hasYield = false;
    }

    public void resetYieldCalcDate()
    {
        hasYieldCalcDate = false;
    }

    public void resetYieldRedemptionDate()
    {
        hasYieldRedemptionDate = false;
    }

    public void resetYieldRedemptionPrice()
    {
        hasYieldRedemptionPrice = false;
    }

    public void resetYieldRedemptionPriceType()
    {
        hasYieldRedemptionPriceType = false;
    }

    public void resetCommission()
    {
        hasCommission = false;
    }

    public void resetCommType()
    {
        hasCommType = false;
    }

    public void resetCommCurrency()
    {
        hasCommCurrency = false;
    }

    public void resetFundRenewWaiv()
    {
        hasFundRenewWaiv = false;
    }

    public void resetPegOffsetValue()
    {
        hasPegOffsetValue = false;
    }

    public void resetPegPriceType()
    {
        hasPegPriceType = false;
    }

    public void resetPegMoveType()
    {
        hasPegMoveType = false;
    }

    public void resetPegOffsetType()
    {
        hasPegOffsetType = false;
    }

    public void resetPegLimitType()
    {
        hasPegLimitType = false;
    }

    public void resetPegRoundDirection()
    {
        hasPegRoundDirection = false;
    }

    public void resetPegScope()
    {
        hasPegScope = false;
    }

    public void resetPegSecurityIDSource()
    {
        hasPegSecurityIDSource = false;
    }

    public void resetPegSecurityID()
    {
        hasPegSecurityID = false;
    }

    public void resetPegSymbol()
    {
        hasPegSymbol = false;
    }

    public void resetPegSecurityDesc()
    {
        hasPegSecurityDesc = false;
    }

    public void resetDiscretionInst()
    {
        hasDiscretionInst = false;
    }

    public void resetDiscretionOffsetValue()
    {
        hasDiscretionOffsetValue = false;
    }

    public void resetDiscretionMoveType()
    {
        hasDiscretionMoveType = false;
    }

    public void resetDiscretionOffsetType()
    {
        hasDiscretionOffsetType = false;
    }

    public void resetDiscretionLimitType()
    {
        hasDiscretionLimitType = false;
    }

    public void resetDiscretionRoundDirection()
    {
        hasDiscretionRoundDirection = false;
    }

    public void resetDiscretionScope()
    {
        hasDiscretionScope = false;
    }

    public void resetStrategyParametersGroup()
    {
        for (final StrategyParametersGroupDecoder strategyParametersGroupDecoder : strategyParametersGroupIterator.iterator())
        {
            strategyParametersGroupDecoder.reset();
            if (strategyParametersGroupDecoder.next() == null)
            {
                break;
            }
        }
        noStrategyParametersGroupCounter = MISSING_INT;
        hasNoStrategyParametersGroupCounter = false;
    }

    public String toString()
    {
        return appendTo(new StringBuilder()).toString();
    }

    public StringBuilder appendTo(final StringBuilder builder)
    {
        return appendTo(builder, 1);
    }

    public StringBuilder appendTo(final StringBuilder builder, final int level)
    {
        builder.append("{\n");        indent(builder, level);
        builder.append("\"MessageName\": \"OrdersGroup\",\n");
        indent(builder, level);
        builder.append("\"ClOrdID\": \"");
        builder.append(this.clOrdID(), 0, clOrdIDLength());
        builder.append("\",\n");

        if (hasSecondaryClOrdID())
        {
            indent(builder, level);
            builder.append("\"SecondaryClOrdID\": \"");
            builder.append(this.secondaryClOrdID(), 0, secondaryClOrdIDLength());
            builder.append("\",\n");
        }

        indent(builder, level);
        builder.append("\"ListSeqNo\": \"");
        builder.append(listSeqNo);
        builder.append("\",\n");

        if (hasClOrdLinkID())
        {
            indent(builder, level);
            builder.append("\"ClOrdLinkID\": \"");
            builder.append(this.clOrdLinkID(), 0, clOrdLinkIDLength());
            builder.append("\",\n");
        }

        if (hasSettlInstMode())
        {
            indent(builder, level);
            builder.append("\"SettlInstMode\": \"");
            builder.append(settlInstMode);
            builder.append("\",\n");
        }

        if (hasNoPartyIDsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"PartyIDsGroup\": [\n");
            PartyIDsGroupDecoder partyIDsGroup = this.partyIDsGroup;
            for (int i = 0, size = this.noPartyIDsGroupCounter; i < size; i++)
            {
                indent(builder, level);
                partyIDsGroup.appendTo(builder, level + 1);
                if (partyIDsGroup.next() != null)
                {
                    builder.append(',');
                }
                builder.append('\n');
                partyIDsGroup = partyIDsGroup.next();            }
            indent(builder, level);
            builder.append("],\n");
        }

        if (hasTradeOriginationDate())
        {
            indent(builder, level);
            builder.append("\"TradeOriginationDate\": \"");
            appendData(builder, tradeOriginationDate, tradeOriginationDateLength);
            builder.append("\",\n");
        }

        if (hasTradeDate())
        {
            indent(builder, level);
            builder.append("\"TradeDate\": \"");
            appendData(builder, tradeDate, tradeDateLength);
            builder.append("\",\n");
        }

        if (hasAccount())
        {
            indent(builder, level);
            builder.append("\"Account\": \"");
            builder.append(this.account(), 0, accountLength());
            builder.append("\",\n");
        }

        if (hasAcctIDSource())
        {
            indent(builder, level);
            builder.append("\"AcctIDSource\": \"");
            builder.append(acctIDSource);
            builder.append("\",\n");
        }

        if (hasAccountType())
        {
            indent(builder, level);
            builder.append("\"AccountType\": \"");
            builder.append(accountType);
            builder.append("\",\n");
        }

        if (hasDayBookingInst())
        {
            indent(builder, level);
            builder.append("\"DayBookingInst\": \"");
            builder.append(dayBookingInst);
            builder.append("\",\n");
        }

        if (hasBookingUnit())
        {
            indent(builder, level);
            builder.append("\"BookingUnit\": \"");
            builder.append(bookingUnit);
            builder.append("\",\n");
        }

        if (hasAllocID())
        {
            indent(builder, level);
            builder.append("\"AllocID\": \"");
            builder.append(this.allocID(), 0, allocIDLength());
            builder.append("\",\n");
        }

        if (hasPreallocMethod())
        {
            indent(builder, level);
            builder.append("\"PreallocMethod\": \"");
            builder.append(preallocMethod);
            builder.append("\",\n");
        }

        if (hasNoAllocsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"AllocsGroup\": [\n");
            AllocsGroupDecoder allocsGroup = this.allocsGroup;
            for (int i = 0, size = this.noAllocsGroupCounter; i < size; i++)
            {
                indent(builder, level);
                allocsGroup.appendTo(builder, level + 1);
                if (allocsGroup.next() != null)
                {
                    builder.append(',');
                }
                builder.append('\n');
                allocsGroup = allocsGroup.next();            }
            indent(builder, level);
            builder.append("],\n");
        }

        if (hasSettlType())
        {
            indent(builder, level);
            builder.append("\"SettlType\": \"");
            builder.append(this.settlType(), 0, settlTypeLength());
            builder.append("\",\n");
        }

        if (hasSettlDate())
        {
            indent(builder, level);
            builder.append("\"SettlDate\": \"");
            appendData(builder, settlDate, settlDateLength);
            builder.append("\",\n");
        }

        if (hasCashMargin())
        {
            indent(builder, level);
            builder.append("\"CashMargin\": \"");
            builder.append(cashMargin);
            builder.append("\",\n");
        }

        if (hasClearingFeeIndicator())
        {
            indent(builder, level);
            builder.append("\"ClearingFeeIndicator\": \"");
            builder.append(this.clearingFeeIndicator(), 0, clearingFeeIndicatorLength());
            builder.append("\",\n");
        }

        if (hasHandlInst())
        {
            indent(builder, level);
            builder.append("\"HandlInst\": \"");
            builder.append(handlInst);
            builder.append("\",\n");
        }

        if (hasExecInst())
        {
            indent(builder, level);
            builder.append("\"ExecInst\": \"");
            builder.append(this.execInst(), 0, execInstLength());
            builder.append("\",\n");
        }

        if (hasMinQty())
        {
            indent(builder, level);
            builder.append("\"MinQty\": \"");
            minQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasMatchIncrement())
        {
            indent(builder, level);
            builder.append("\"MatchIncrement\": \"");
            matchIncrement.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasMaxPriceLevels())
        {
            indent(builder, level);
            builder.append("\"MaxPriceLevels\": \"");
            builder.append(maxPriceLevels);
            builder.append("\",\n");
        }

        if (hasDisplayQty())
        {
            indent(builder, level);
            builder.append("\"DisplayQty\": \"");
            displayQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasSecondaryDisplayQty())
        {
            indent(builder, level);
            builder.append("\"SecondaryDisplayQty\": \"");
            secondaryDisplayQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasDisplayWhen())
        {
            indent(builder, level);
            builder.append("\"DisplayWhen\": \"");
            builder.append(displayWhen);
            builder.append("\",\n");
        }

        if (hasDisplayMethod())
        {
            indent(builder, level);
            builder.append("\"DisplayMethod\": \"");
            builder.append(displayMethod);
            builder.append("\",\n");
        }

        if (hasDisplayLowQty())
        {
            indent(builder, level);
            builder.append("\"DisplayLowQty\": \"");
            displayLowQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasDisplayHighQty())
        {
            indent(builder, level);
            builder.append("\"DisplayHighQty\": \"");
            displayHighQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasDisplayMinIncr())
        {
            indent(builder, level);
            builder.append("\"DisplayMinIncr\": \"");
            displayMinIncr.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasRefreshQty())
        {
            indent(builder, level);
            builder.append("\"RefreshQty\": \"");
            refreshQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasMaxFloor())
        {
            indent(builder, level);
            builder.append("\"MaxFloor\": \"");
            maxFloor.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasExDestination())
        {
            indent(builder, level);
            builder.append("\"ExDestination\": \"");
            builder.append(this.exDestination(), 0, exDestinationLength());
            builder.append("\",\n");
        }

        if (hasExDestinationIDSource())
        {
            indent(builder, level);
            builder.append("\"ExDestinationIDSource\": \"");
            builder.append(exDestinationIDSource);
            builder.append("\",\n");
        }

        if (hasNoTradingSessionsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"TradingSessionsGroup\": [\n");
            TradingSessionsGroupDecoder tradingSessionsGroup = this.tradingSessionsGroup;
            for (int i = 0, size = this.noTradingSessionsGroupCounter; i < size; i++)
            {
                indent(builder, level);
                tradingSessionsGroup.appendTo(builder, level + 1);
                if (tradingSessionsGroup.next() != null)
                {
                    builder.append(',');
                }
                builder.append('\n');
                tradingSessionsGroup = tradingSessionsGroup.next();            }
            indent(builder, level);
            builder.append("],\n");
        }

        if (hasProcessCode())
        {
            indent(builder, level);
            builder.append("\"ProcessCode\": \"");
            builder.append(processCode);
            builder.append("\",\n");
        }

        if (hasSymbol())
        {
            indent(builder, level);
            builder.append("\"Symbol\": \"");
            builder.append(this.symbol(), 0, symbolLength());
            builder.append("\",\n");
        }

        if (hasSymbolSfx())
        {
            indent(builder, level);
            builder.append("\"SymbolSfx\": \"");
            builder.append(this.symbolSfx(), 0, symbolSfxLength());
            builder.append("\",\n");
        }

        if (hasSecurityID())
        {
            indent(builder, level);
            builder.append("\"SecurityID\": \"");
            builder.append(this.securityID(), 0, securityIDLength());
            builder.append("\",\n");
        }

        if (hasSecurityIDSource())
        {
            indent(builder, level);
            builder.append("\"SecurityIDSource\": \"");
            builder.append(this.securityIDSource(), 0, securityIDSourceLength());
            builder.append("\",\n");
        }

        if (hasNoSecurityAltIDGroupCounter)
        {
            indent(builder, level);
            builder.append("\"SecurityAltIDGroup\": [\n");
            SecurityAltIDGroupDecoder securityAltIDGroup = this.securityAltIDGroup;
            for (int i = 0, size = this.noSecurityAltIDGroupCounter; i < size; i++)
            {
                indent(builder, level);
                securityAltIDGroup.appendTo(builder, level + 1);
                if (securityAltIDGroup.next() != null)
                {
                    builder.append(',');
                }
                builder.append('\n');
                securityAltIDGroup = securityAltIDGroup.next();            }
            indent(builder, level);
            builder.append("],\n");
        }

        if (hasProduct())
        {
            indent(builder, level);
            builder.append("\"Product\": \"");
            builder.append(product);
            builder.append("\",\n");
        }

        if (hasProductComplex())
        {
            indent(builder, level);
            builder.append("\"ProductComplex\": \"");
            builder.append(this.productComplex(), 0, productComplexLength());
            builder.append("\",\n");
        }

        if (hasSecurityGroup())
        {
            indent(builder, level);
            builder.append("\"SecurityGroup\": \"");
            builder.append(this.securityGroup(), 0, securityGroupLength());
            builder.append("\",\n");
        }

        if (hasCFICode())
        {
            indent(builder, level);
            builder.append("\"CFICode\": \"");
            builder.append(this.cFICode(), 0, cFICodeLength());
            builder.append("\",\n");
        }

        if (hasSecurityType())
        {
            indent(builder, level);
            builder.append("\"SecurityType\": \"");
            builder.append(this.securityType(), 0, securityTypeLength());
            builder.append("\",\n");
        }

        if (hasSecuritySubType())
        {
            indent(builder, level);
            builder.append("\"SecuritySubType\": \"");
            builder.append(this.securitySubType(), 0, securitySubTypeLength());
            builder.append("\",\n");
        }

        if (hasMaturityMonthYear())
        {
            indent(builder, level);
            builder.append("\"MaturityMonthYear\": \"");
            appendData(builder, maturityMonthYear, maturityMonthYearLength);
            builder.append("\",\n");
        }

        if (hasMaturityDate())
        {
            indent(builder, level);
            builder.append("\"MaturityDate\": \"");
            appendData(builder, maturityDate, maturityDateLength);
            builder.append("\",\n");
        }

        if (hasMaturityTime())
        {
            indent(builder, level);
            builder.append("\"MaturityTime\": \"");
            appendData(builder, maturityTime, maturityTimeLength);
            builder.append("\",\n");
        }

        if (hasSettleOnOpenFlag())
        {
            indent(builder, level);
            builder.append("\"SettleOnOpenFlag\": \"");
            builder.append(this.settleOnOpenFlag(), 0, settleOnOpenFlagLength());
            builder.append("\",\n");
        }

        if (hasInstrmtAssignmentMethod())
        {
            indent(builder, level);
            builder.append("\"InstrmtAssignmentMethod\": \"");
            builder.append(instrmtAssignmentMethod);
            builder.append("\",\n");
        }

        if (hasSecurityStatus())
        {
            indent(builder, level);
            builder.append("\"SecurityStatus\": \"");
            builder.append(this.securityStatus(), 0, securityStatusLength());
            builder.append("\",\n");
        }

        if (hasCouponPaymentDate())
        {
            indent(builder, level);
            builder.append("\"CouponPaymentDate\": \"");
            appendData(builder, couponPaymentDate, couponPaymentDateLength);
            builder.append("\",\n");
        }

        if (hasRestructuringType())
        {
            indent(builder, level);
            builder.append("\"RestructuringType\": \"");
            builder.append(this.restructuringType(), 0, restructuringTypeLength());
            builder.append("\",\n");
        }

        if (hasSeniority())
        {
            indent(builder, level);
            builder.append("\"Seniority\": \"");
            builder.append(this.seniority(), 0, seniorityLength());
            builder.append("\",\n");
        }

        if (hasNotionalPercentageOutstanding())
        {
            indent(builder, level);
            builder.append("\"NotionalPercentageOutstanding\": \"");
            notionalPercentageOutstanding.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasOriginalNotionalPercentageOutstanding())
        {
            indent(builder, level);
            builder.append("\"OriginalNotionalPercentageOutstanding\": \"");
            originalNotionalPercentageOutstanding.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasAttachmentPoint())
        {
            indent(builder, level);
            builder.append("\"AttachmentPoint\": \"");
            attachmentPoint.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasDetachmentPoint())
        {
            indent(builder, level);
            builder.append("\"DetachmentPoint\": \"");
            detachmentPoint.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasIssueDate())
        {
            indent(builder, level);
            builder.append("\"IssueDate\": \"");
            appendData(builder, issueDate, issueDateLength);
            builder.append("\",\n");
        }

        if (hasRepoCollateralSecurityType())
        {
            indent(builder, level);
            builder.append("\"RepoCollateralSecurityType\": \"");
            builder.append(this.repoCollateralSecurityType(), 0, repoCollateralSecurityTypeLength());
            builder.append("\",\n");
        }

        if (hasRepurchaseTerm())
        {
            indent(builder, level);
            builder.append("\"RepurchaseTerm\": \"");
            builder.append(repurchaseTerm);
            builder.append("\",\n");
        }

        if (hasRepurchaseRate())
        {
            indent(builder, level);
            builder.append("\"RepurchaseRate\": \"");
            repurchaseRate.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasFactor())
        {
            indent(builder, level);
            builder.append("\"Factor\": \"");
            factor.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasCreditRating())
        {
            indent(builder, level);
            builder.append("\"CreditRating\": \"");
            builder.append(this.creditRating(), 0, creditRatingLength());
            builder.append("\",\n");
        }

        if (hasInstrRegistry())
        {
            indent(builder, level);
            builder.append("\"InstrRegistry\": \"");
            builder.append(this.instrRegistry(), 0, instrRegistryLength());
            builder.append("\",\n");
        }

        if (hasCountryOfIssue())
        {
            indent(builder, level);
            builder.append("\"CountryOfIssue\": \"");
            builder.append(this.countryOfIssue(), 0, countryOfIssueLength());
            builder.append("\",\n");
        }

        if (hasStateOrProvinceOfIssue())
        {
            indent(builder, level);
            builder.append("\"StateOrProvinceOfIssue\": \"");
            builder.append(this.stateOrProvinceOfIssue(), 0, stateOrProvinceOfIssueLength());
            builder.append("\",\n");
        }

        if (hasLocaleOfIssue())
        {
            indent(builder, level);
            builder.append("\"LocaleOfIssue\": \"");
            builder.append(this.localeOfIssue(), 0, localeOfIssueLength());
            builder.append("\",\n");
        }

        if (hasRedemptionDate())
        {
            indent(builder, level);
            builder.append("\"RedemptionDate\": \"");
            appendData(builder, redemptionDate, redemptionDateLength);
            builder.append("\",\n");
        }

        if (hasStrikePrice())
        {
            indent(builder, level);
            builder.append("\"StrikePrice\": \"");
            strikePrice.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasStrikeCurrency())
        {
            indent(builder, level);
            builder.append("\"StrikeCurrency\": \"");
            builder.append(this.strikeCurrency(), 0, strikeCurrencyLength());
            builder.append("\",\n");
        }

        if (hasStrikeMultiplier())
        {
            indent(builder, level);
            builder.append("\"StrikeMultiplier\": \"");
            strikeMultiplier.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasStrikeValue())
        {
            indent(builder, level);
            builder.append("\"StrikeValue\": \"");
            strikeValue.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasStrikePriceDeterminationMethod())
        {
            indent(builder, level);
            builder.append("\"StrikePriceDeterminationMethod\": \"");
            builder.append(strikePriceDeterminationMethod);
            builder.append("\",\n");
        }

        if (hasStrikePriceBoundaryMethod())
        {
            indent(builder, level);
            builder.append("\"StrikePriceBoundaryMethod\": \"");
            builder.append(strikePriceBoundaryMethod);
            builder.append("\",\n");
        }

        if (hasStrikePriceBoundaryPrecision())
        {
            indent(builder, level);
            builder.append("\"StrikePriceBoundaryPrecision\": \"");
            strikePriceBoundaryPrecision.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasUnderlyingPriceDeterminationMethod())
        {
            indent(builder, level);
            builder.append("\"UnderlyingPriceDeterminationMethod\": \"");
            builder.append(underlyingPriceDeterminationMethod);
            builder.append("\",\n");
        }

        if (hasOptAttribute())
        {
            indent(builder, level);
            builder.append("\"OptAttribute\": \"");
            builder.append(optAttribute);
            builder.append("\",\n");
        }

        if (hasContractMultiplier())
        {
            indent(builder, level);
            builder.append("\"ContractMultiplier\": \"");
            contractMultiplier.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasContractMultiplierUnit())
        {
            indent(builder, level);
            builder.append("\"ContractMultiplierUnit\": \"");
            builder.append(contractMultiplierUnit);
            builder.append("\",\n");
        }

        if (hasFlowScheduleType())
        {
            indent(builder, level);
            builder.append("\"FlowScheduleType\": \"");
            builder.append(flowScheduleType);
            builder.append("\",\n");
        }

        if (hasMinPriceIncrement())
        {
            indent(builder, level);
            builder.append("\"MinPriceIncrement\": \"");
            minPriceIncrement.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasMinPriceIncrementAmount())
        {
            indent(builder, level);
            builder.append("\"MinPriceIncrementAmount\": \"");
            minPriceIncrementAmount.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasUnitOfMeasure())
        {
            indent(builder, level);
            builder.append("\"UnitOfMeasure\": \"");
            builder.append(this.unitOfMeasure(), 0, unitOfMeasureLength());
            builder.append("\",\n");
        }

        if (hasUnitOfMeasureQty())
        {
            indent(builder, level);
            builder.append("\"UnitOfMeasureQty\": \"");
            unitOfMeasureQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasPriceUnitOfMeasure())
        {
            indent(builder, level);
            builder.append("\"PriceUnitOfMeasure\": \"");
            builder.append(this.priceUnitOfMeasure(), 0, priceUnitOfMeasureLength());
            builder.append("\",\n");
        }

        if (hasPriceUnitOfMeasureQty())
        {
            indent(builder, level);
            builder.append("\"PriceUnitOfMeasureQty\": \"");
            priceUnitOfMeasureQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasSettlMethod())
        {
            indent(builder, level);
            builder.append("\"SettlMethod\": \"");
            builder.append(settlMethod);
            builder.append("\",\n");
        }

        if (hasExerciseStyle())
        {
            indent(builder, level);
            builder.append("\"ExerciseStyle\": \"");
            builder.append(exerciseStyle);
            builder.append("\",\n");
        }

        if (hasOptPayoutType())
        {
            indent(builder, level);
            builder.append("\"OptPayoutType\": \"");
            builder.append(optPayoutType);
            builder.append("\",\n");
        }

        if (hasOptPayoutAmount())
        {
            indent(builder, level);
            builder.append("\"OptPayoutAmount\": \"");
            optPayoutAmount.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasPriceQuoteMethod())
        {
            indent(builder, level);
            builder.append("\"PriceQuoteMethod\": \"");
            builder.append(this.priceQuoteMethod(), 0, priceQuoteMethodLength());
            builder.append("\",\n");
        }

        if (hasValuationMethod())
        {
            indent(builder, level);
            builder.append("\"ValuationMethod\": \"");
            builder.append(this.valuationMethod(), 0, valuationMethodLength());
            builder.append("\",\n");
        }

        if (hasListMethod())
        {
            indent(builder, level);
            builder.append("\"ListMethod\": \"");
            builder.append(listMethod);
            builder.append("\",\n");
        }

        if (hasCapPrice())
        {
            indent(builder, level);
            builder.append("\"CapPrice\": \"");
            capPrice.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasFloorPrice())
        {
            indent(builder, level);
            builder.append("\"FloorPrice\": \"");
            floorPrice.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasPutOrCall())
        {
            indent(builder, level);
            builder.append("\"PutOrCall\": \"");
            builder.append(putOrCall);
            builder.append("\",\n");
        }

        if (hasFlexibleIndicator())
        {
            indent(builder, level);
            builder.append("\"FlexibleIndicator\": \"");
            builder.append(flexibleIndicator);
            builder.append("\",\n");
        }

        if (hasFlexProductEligibilityIndicator())
        {
            indent(builder, level);
            builder.append("\"FlexProductEligibilityIndicator\": \"");
            builder.append(flexProductEligibilityIndicator);
            builder.append("\",\n");
        }

        if (hasTimeUnit())
        {
            indent(builder, level);
            builder.append("\"TimeUnit\": \"");
            builder.append(this.timeUnit(), 0, timeUnitLength());
            builder.append("\",\n");
        }

        if (hasCouponRate())
        {
            indent(builder, level);
            builder.append("\"CouponRate\": \"");
            couponRate.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasSecurityExchange())
        {
            indent(builder, level);
            builder.append("\"SecurityExchange\": \"");
            builder.append(this.securityExchange(), 0, securityExchangeLength());
            builder.append("\",\n");
        }

        if (hasPositionLimit())
        {
            indent(builder, level);
            builder.append("\"PositionLimit\": \"");
            builder.append(positionLimit);
            builder.append("\",\n");
        }

        if (hasNTPositionLimit())
        {
            indent(builder, level);
            builder.append("\"NTPositionLimit\": \"");
            builder.append(nTPositionLimit);
            builder.append("\",\n");
        }

        if (hasIssuer())
        {
            indent(builder, level);
            builder.append("\"Issuer\": \"");
            builder.append(this.issuer(), 0, issuerLength());
            builder.append("\",\n");
        }

        if (hasEncodedIssuerLen())
        {
            indent(builder, level);
            builder.append("\"EncodedIssuerLen\": \"");
            builder.append(encodedIssuerLen);
            builder.append("\",\n");
        }

        if (hasEncodedIssuer())
        {
            indent(builder, level);
            builder.append("\"EncodedIssuer\": \"");
            appendData(builder, encodedIssuer, encodedIssuerLen);
            builder.append("\",\n");
        }

        if (hasSecurityDesc())
        {
            indent(builder, level);
            builder.append("\"SecurityDesc\": \"");
            builder.append(this.securityDesc(), 0, securityDescLength());
            builder.append("\",\n");
        }

        if (hasEncodedSecurityDescLen())
        {
            indent(builder, level);
            builder.append("\"EncodedSecurityDescLen\": \"");
            builder.append(encodedSecurityDescLen);
            builder.append("\",\n");
        }

        if (hasEncodedSecurityDesc())
        {
            indent(builder, level);
            builder.append("\"EncodedSecurityDesc\": \"");
            appendData(builder, encodedSecurityDesc, encodedSecurityDescLen);
            builder.append("\",\n");
        }

        if (hasSecurityXMLLen())
        {
            indent(builder, level);
            builder.append("\"SecurityXMLLen\": \"");
            builder.append(securityXMLLen);
            builder.append("\",\n");
        }

        if (hasSecurityXML())
        {
            indent(builder, level);
            builder.append("\"SecurityXML\": \"");
            appendData(builder, securityXML, securityXMLLen);
            builder.append("\",\n");
        }

        if (hasSecurityXMLSchema())
        {
            indent(builder, level);
            builder.append("\"SecurityXMLSchema\": \"");
            builder.append(this.securityXMLSchema(), 0, securityXMLSchemaLength());
            builder.append("\",\n");
        }

        if (hasPool())
        {
            indent(builder, level);
            builder.append("\"Pool\": \"");
            builder.append(this.pool(), 0, poolLength());
            builder.append("\",\n");
        }

        if (hasContractSettlMonth())
        {
            indent(builder, level);
            builder.append("\"ContractSettlMonth\": \"");
            appendData(builder, contractSettlMonth, contractSettlMonthLength);
            builder.append("\",\n");
        }

        if (hasCPProgram())
        {
            indent(builder, level);
            builder.append("\"CPProgram\": \"");
            builder.append(cPProgram);
            builder.append("\",\n");
        }

        if (hasCPRegType())
        {
            indent(builder, level);
            builder.append("\"CPRegType\": \"");
            builder.append(this.cPRegType(), 0, cPRegTypeLength());
            builder.append("\",\n");
        }

        if (hasNoEventsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"EventsGroup\": [\n");
            EventsGroupDecoder eventsGroup = this.eventsGroup;
            for (int i = 0, size = this.noEventsGroupCounter; i < size; i++)
            {
                indent(builder, level);
                eventsGroup.appendTo(builder, level + 1);
                if (eventsGroup.next() != null)
                {
                    builder.append(',');
                }
                builder.append('\n');
                eventsGroup = eventsGroup.next();            }
            indent(builder, level);
            builder.append("],\n");
        }

        if (hasDatedDate())
        {
            indent(builder, level);
            builder.append("\"DatedDate\": \"");
            appendData(builder, datedDate, datedDateLength);
            builder.append("\",\n");
        }

        if (hasInterestAccrualDate())
        {
            indent(builder, level);
            builder.append("\"InterestAccrualDate\": \"");
            appendData(builder, interestAccrualDate, interestAccrualDateLength);
            builder.append("\",\n");
        }

        if (hasNoInstrumentPartiesGroupCounter)
        {
            indent(builder, level);
            builder.append("\"InstrumentPartiesGroup\": [\n");
            InstrumentPartiesGroupDecoder instrumentPartiesGroup = this.instrumentPartiesGroup;
            for (int i = 0, size = this.noInstrumentPartiesGroupCounter; i < size; i++)
            {
                indent(builder, level);
                instrumentPartiesGroup.appendTo(builder, level + 1);
                if (instrumentPartiesGroup.next() != null)
                {
                    builder.append(',');
                }
                builder.append('\n');
                instrumentPartiesGroup = instrumentPartiesGroup.next();            }
            indent(builder, level);
            builder.append("],\n");
        }

        if (hasNoComplexEventsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"ComplexEventsGroup\": [\n");
            ComplexEventsGroupDecoder complexEventsGroup = this.complexEventsGroup;
            for (int i = 0, size = this.noComplexEventsGroupCounter; i < size; i++)
            {
                indent(builder, level);
                complexEventsGroup.appendTo(builder, level + 1);
                if (complexEventsGroup.next() != null)
                {
                    builder.append(',');
                }
                builder.append('\n');
                complexEventsGroup = complexEventsGroup.next();            }
            indent(builder, level);
            builder.append("],\n");
        }

        if (hasNoUnderlyingsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"UnderlyingsGroup\": [\n");
            UnderlyingsGroupDecoder underlyingsGroup = this.underlyingsGroup;
            for (int i = 0, size = this.noUnderlyingsGroupCounter; i < size; i++)
            {
                indent(builder, level);
                underlyingsGroup.appendTo(builder, level + 1);
                if (underlyingsGroup.next() != null)
                {
                    builder.append(',');
                }
                builder.append('\n');
                underlyingsGroup = underlyingsGroup.next();            }
            indent(builder, level);
            builder.append("],\n");
        }

        if (hasPrevClosePx())
        {
            indent(builder, level);
            builder.append("\"PrevClosePx\": \"");
            prevClosePx.appendTo(builder);
            builder.append("\",\n");
        }

        indent(builder, level);
        builder.append("\"Side\": \"");
        builder.append(side);
        builder.append("\",\n");

        if (hasSideValueInd())
        {
            indent(builder, level);
            builder.append("\"SideValueInd\": \"");
            builder.append(sideValueInd);
            builder.append("\",\n");
        }

        if (hasLocateReqd())
        {
            indent(builder, level);
            builder.append("\"LocateReqd\": \"");
            builder.append(locateReqd);
            builder.append("\",\n");
        }

        if (hasTransactTime())
        {
            indent(builder, level);
            builder.append("\"TransactTime\": \"");
            appendData(builder, transactTime, transactTimeLength);
            builder.append("\",\n");
        }

        if (hasNoStipulationsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"StipulationsGroup\": [\n");
            StipulationsGroupDecoder stipulationsGroup = this.stipulationsGroup;
            for (int i = 0, size = this.noStipulationsGroupCounter; i < size; i++)
            {
                indent(builder, level);
                stipulationsGroup.appendTo(builder, level + 1);
                if (stipulationsGroup.next() != null)
                {
                    builder.append(',');
                }
                builder.append('\n');
                stipulationsGroup = stipulationsGroup.next();            }
            indent(builder, level);
            builder.append("],\n");
        }

        if (hasQtyType())
        {
            indent(builder, level);
            builder.append("\"QtyType\": \"");
            builder.append(qtyType);
            builder.append("\",\n");
        }

        if (hasOrderQty())
        {
            indent(builder, level);
            builder.append("\"OrderQty\": \"");
            orderQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasCashOrderQty())
        {
            indent(builder, level);
            builder.append("\"CashOrderQty\": \"");
            cashOrderQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasOrderPercent())
        {
            indent(builder, level);
            builder.append("\"OrderPercent\": \"");
            orderPercent.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasRoundingDirection())
        {
            indent(builder, level);
            builder.append("\"RoundingDirection\": \"");
            builder.append(roundingDirection);
            builder.append("\",\n");
        }

        if (hasRoundingModulus())
        {
            indent(builder, level);
            builder.append("\"RoundingModulus\": \"");
            roundingModulus.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasOrdType())
        {
            indent(builder, level);
            builder.append("\"OrdType\": \"");
            builder.append(ordType);
            builder.append("\",\n");
        }

        if (hasPriceType())
        {
            indent(builder, level);
            builder.append("\"PriceType\": \"");
            builder.append(priceType);
            builder.append("\",\n");
        }

        if (hasPrice())
        {
            indent(builder, level);
            builder.append("\"Price\": \"");
            price.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasPriceProtectionScope())
        {
            indent(builder, level);
            builder.append("\"PriceProtectionScope\": \"");
            builder.append(priceProtectionScope);
            builder.append("\",\n");
        }

        if (hasStopPx())
        {
            indent(builder, level);
            builder.append("\"StopPx\": \"");
            stopPx.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasTriggerType())
        {
            indent(builder, level);
            builder.append("\"TriggerType\": \"");
            builder.append(triggerType);
            builder.append("\",\n");
        }

        if (hasTriggerAction())
        {
            indent(builder, level);
            builder.append("\"TriggerAction\": \"");
            builder.append(triggerAction);
            builder.append("\",\n");
        }

        if (hasTriggerPrice())
        {
            indent(builder, level);
            builder.append("\"TriggerPrice\": \"");
            triggerPrice.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasTriggerSymbol())
        {
            indent(builder, level);
            builder.append("\"TriggerSymbol\": \"");
            builder.append(this.triggerSymbol(), 0, triggerSymbolLength());
            builder.append("\",\n");
        }

        if (hasTriggerSecurityID())
        {
            indent(builder, level);
            builder.append("\"TriggerSecurityID\": \"");
            builder.append(this.triggerSecurityID(), 0, triggerSecurityIDLength());
            builder.append("\",\n");
        }

        if (hasTriggerSecurityIDSource())
        {
            indent(builder, level);
            builder.append("\"TriggerSecurityIDSource\": \"");
            builder.append(this.triggerSecurityIDSource(), 0, triggerSecurityIDSourceLength());
            builder.append("\",\n");
        }

        if (hasTriggerSecurityDesc())
        {
            indent(builder, level);
            builder.append("\"TriggerSecurityDesc\": \"");
            builder.append(this.triggerSecurityDesc(), 0, triggerSecurityDescLength());
            builder.append("\",\n");
        }

        if (hasTriggerPriceType())
        {
            indent(builder, level);
            builder.append("\"TriggerPriceType\": \"");
            builder.append(triggerPriceType);
            builder.append("\",\n");
        }

        if (hasTriggerPriceTypeScope())
        {
            indent(builder, level);
            builder.append("\"TriggerPriceTypeScope\": \"");
            builder.append(triggerPriceTypeScope);
            builder.append("\",\n");
        }

        if (hasTriggerPriceDirection())
        {
            indent(builder, level);
            builder.append("\"TriggerPriceDirection\": \"");
            builder.append(triggerPriceDirection);
            builder.append("\",\n");
        }

        if (hasTriggerNewPrice())
        {
            indent(builder, level);
            builder.append("\"TriggerNewPrice\": \"");
            triggerNewPrice.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasTriggerOrderType())
        {
            indent(builder, level);
            builder.append("\"TriggerOrderType\": \"");
            builder.append(triggerOrderType);
            builder.append("\",\n");
        }

        if (hasTriggerNewQty())
        {
            indent(builder, level);
            builder.append("\"TriggerNewQty\": \"");
            triggerNewQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasTriggerTradingSessionID())
        {
            indent(builder, level);
            builder.append("\"TriggerTradingSessionID\": \"");
            builder.append(this.triggerTradingSessionID(), 0, triggerTradingSessionIDLength());
            builder.append("\",\n");
        }

        if (hasTriggerTradingSessionSubID())
        {
            indent(builder, level);
            builder.append("\"TriggerTradingSessionSubID\": \"");
            builder.append(this.triggerTradingSessionSubID(), 0, triggerTradingSessionSubIDLength());
            builder.append("\",\n");
        }

        if (hasSpread())
        {
            indent(builder, level);
            builder.append("\"Spread\": \"");
            spread.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasBenchmarkCurveCurrency())
        {
            indent(builder, level);
            builder.append("\"BenchmarkCurveCurrency\": \"");
            builder.append(this.benchmarkCurveCurrency(), 0, benchmarkCurveCurrencyLength());
            builder.append("\",\n");
        }

        if (hasBenchmarkCurveName())
        {
            indent(builder, level);
            builder.append("\"BenchmarkCurveName\": \"");
            builder.append(this.benchmarkCurveName(), 0, benchmarkCurveNameLength());
            builder.append("\",\n");
        }

        if (hasBenchmarkCurvePoint())
        {
            indent(builder, level);
            builder.append("\"BenchmarkCurvePoint\": \"");
            builder.append(this.benchmarkCurvePoint(), 0, benchmarkCurvePointLength());
            builder.append("\",\n");
        }

        if (hasBenchmarkPrice())
        {
            indent(builder, level);
            builder.append("\"BenchmarkPrice\": \"");
            benchmarkPrice.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasBenchmarkPriceType())
        {
            indent(builder, level);
            builder.append("\"BenchmarkPriceType\": \"");
            builder.append(benchmarkPriceType);
            builder.append("\",\n");
        }

        if (hasBenchmarkSecurityID())
        {
            indent(builder, level);
            builder.append("\"BenchmarkSecurityID\": \"");
            builder.append(this.benchmarkSecurityID(), 0, benchmarkSecurityIDLength());
            builder.append("\",\n");
        }

        if (hasBenchmarkSecurityIDSource())
        {
            indent(builder, level);
            builder.append("\"BenchmarkSecurityIDSource\": \"");
            builder.append(this.benchmarkSecurityIDSource(), 0, benchmarkSecurityIDSourceLength());
            builder.append("\",\n");
        }

        if (hasYieldType())
        {
            indent(builder, level);
            builder.append("\"YieldType\": \"");
            builder.append(this.yieldType(), 0, yieldTypeLength());
            builder.append("\",\n");
        }

        if (hasYield())
        {
            indent(builder, level);
            builder.append("\"Yield\": \"");
            yield.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasYieldCalcDate())
        {
            indent(builder, level);
            builder.append("\"YieldCalcDate\": \"");
            appendData(builder, yieldCalcDate, yieldCalcDateLength);
            builder.append("\",\n");
        }

        if (hasYieldRedemptionDate())
        {
            indent(builder, level);
            builder.append("\"YieldRedemptionDate\": \"");
            appendData(builder, yieldRedemptionDate, yieldRedemptionDateLength);
            builder.append("\",\n");
        }

        if (hasYieldRedemptionPrice())
        {
            indent(builder, level);
            builder.append("\"YieldRedemptionPrice\": \"");
            yieldRedemptionPrice.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasYieldRedemptionPriceType())
        {
            indent(builder, level);
            builder.append("\"YieldRedemptionPriceType\": \"");
            builder.append(yieldRedemptionPriceType);
            builder.append("\",\n");
        }

        if (hasCurrency())
        {
            indent(builder, level);
            builder.append("\"Currency\": \"");
            builder.append(this.currency(), 0, currencyLength());
            builder.append("\",\n");
        }

        if (hasComplianceID())
        {
            indent(builder, level);
            builder.append("\"ComplianceID\": \"");
            builder.append(this.complianceID(), 0, complianceIDLength());
            builder.append("\",\n");
        }

        if (hasSolicitedFlag())
        {
            indent(builder, level);
            builder.append("\"SolicitedFlag\": \"");
            builder.append(solicitedFlag);
            builder.append("\",\n");
        }

        if (hasIOIID())
        {
            indent(builder, level);
            builder.append("\"IOIID\": \"");
            builder.append(this.iOIID(), 0, iOIIDLength());
            builder.append("\",\n");
        }

        if (hasQuoteID())
        {
            indent(builder, level);
            builder.append("\"QuoteID\": \"");
            builder.append(this.quoteID(), 0, quoteIDLength());
            builder.append("\",\n");
        }

        if (hasRefOrderID())
        {
            indent(builder, level);
            builder.append("\"RefOrderID\": \"");
            builder.append(this.refOrderID(), 0, refOrderIDLength());
            builder.append("\",\n");
        }

        if (hasRefOrderIDSource())
        {
            indent(builder, level);
            builder.append("\"RefOrderIDSource\": \"");
            builder.append(refOrderIDSource);
            builder.append("\",\n");
        }

        if (hasTimeInForce())
        {
            indent(builder, level);
            builder.append("\"TimeInForce\": \"");
            builder.append(timeInForce);
            builder.append("\",\n");
        }

        if (hasEffectiveTime())
        {
            indent(builder, level);
            builder.append("\"EffectiveTime\": \"");
            appendData(builder, effectiveTime, effectiveTimeLength);
            builder.append("\",\n");
        }

        if (hasExpireDate())
        {
            indent(builder, level);
            builder.append("\"ExpireDate\": \"");
            appendData(builder, expireDate, expireDateLength);
            builder.append("\",\n");
        }

        if (hasExpireTime())
        {
            indent(builder, level);
            builder.append("\"ExpireTime\": \"");
            appendData(builder, expireTime, expireTimeLength);
            builder.append("\",\n");
        }

        if (hasGTBookingInst())
        {
            indent(builder, level);
            builder.append("\"GTBookingInst\": \"");
            builder.append(gTBookingInst);
            builder.append("\",\n");
        }

        if (hasCommission())
        {
            indent(builder, level);
            builder.append("\"Commission\": \"");
            commission.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasCommType())
        {
            indent(builder, level);
            builder.append("\"CommType\": \"");
            builder.append(commType);
            builder.append("\",\n");
        }

        if (hasCommCurrency())
        {
            indent(builder, level);
            builder.append("\"CommCurrency\": \"");
            builder.append(this.commCurrency(), 0, commCurrencyLength());
            builder.append("\",\n");
        }

        if (hasFundRenewWaiv())
        {
            indent(builder, level);
            builder.append("\"FundRenewWaiv\": \"");
            builder.append(fundRenewWaiv);
            builder.append("\",\n");
        }

        if (hasOrderCapacity())
        {
            indent(builder, level);
            builder.append("\"OrderCapacity\": \"");
            builder.append(orderCapacity);
            builder.append("\",\n");
        }

        if (hasOrderRestrictions())
        {
            indent(builder, level);
            builder.append("\"OrderRestrictions\": \"");
            builder.append(this.orderRestrictions(), 0, orderRestrictionsLength());
            builder.append("\",\n");
        }

        if (hasPreTradeAnonymity())
        {
            indent(builder, level);
            builder.append("\"PreTradeAnonymity\": \"");
            builder.append(preTradeAnonymity);
            builder.append("\",\n");
        }

        if (hasCustOrderCapacity())
        {
            indent(builder, level);
            builder.append("\"CustOrderCapacity\": \"");
            builder.append(custOrderCapacity);
            builder.append("\",\n");
        }

        if (hasForexReq())
        {
            indent(builder, level);
            builder.append("\"ForexReq\": \"");
            builder.append(forexReq);
            builder.append("\",\n");
        }

        if (hasSettlCurrency())
        {
            indent(builder, level);
            builder.append("\"SettlCurrency\": \"");
            builder.append(this.settlCurrency(), 0, settlCurrencyLength());
            builder.append("\",\n");
        }

        if (hasBookingType())
        {
            indent(builder, level);
            builder.append("\"BookingType\": \"");
            builder.append(bookingType);
            builder.append("\",\n");
        }

        if (hasText())
        {
            indent(builder, level);
            builder.append("\"Text\": \"");
            builder.append(this.text(), 0, textLength());
            builder.append("\",\n");
        }

        if (hasEncodedTextLen())
        {
            indent(builder, level);
            builder.append("\"EncodedTextLen\": \"");
            builder.append(encodedTextLen);
            builder.append("\",\n");
        }

        if (hasEncodedText())
        {
            indent(builder, level);
            builder.append("\"EncodedText\": \"");
            appendData(builder, encodedText, encodedTextLen);
            builder.append("\",\n");
        }

        if (hasSettlDate2())
        {
            indent(builder, level);
            builder.append("\"SettlDate2\": \"");
            appendData(builder, settlDate2, settlDate2Length);
            builder.append("\",\n");
        }

        if (hasOrderQty2())
        {
            indent(builder, level);
            builder.append("\"OrderQty2\": \"");
            orderQty2.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasPrice2())
        {
            indent(builder, level);
            builder.append("\"Price2\": \"");
            price2.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasPositionEffect())
        {
            indent(builder, level);
            builder.append("\"PositionEffect\": \"");
            builder.append(positionEffect);
            builder.append("\",\n");
        }

        if (hasCoveredOrUncovered())
        {
            indent(builder, level);
            builder.append("\"CoveredOrUncovered\": \"");
            builder.append(coveredOrUncovered);
            builder.append("\",\n");
        }

        if (hasMaxShow())
        {
            indent(builder, level);
            builder.append("\"MaxShow\": \"");
            maxShow.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasPegOffsetValue())
        {
            indent(builder, level);
            builder.append("\"PegOffsetValue\": \"");
            pegOffsetValue.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasPegPriceType())
        {
            indent(builder, level);
            builder.append("\"PegPriceType\": \"");
            builder.append(pegPriceType);
            builder.append("\",\n");
        }

        if (hasPegMoveType())
        {
            indent(builder, level);
            builder.append("\"PegMoveType\": \"");
            builder.append(pegMoveType);
            builder.append("\",\n");
        }

        if (hasPegOffsetType())
        {
            indent(builder, level);
            builder.append("\"PegOffsetType\": \"");
            builder.append(pegOffsetType);
            builder.append("\",\n");
        }

        if (hasPegLimitType())
        {
            indent(builder, level);
            builder.append("\"PegLimitType\": \"");
            builder.append(pegLimitType);
            builder.append("\",\n");
        }

        if (hasPegRoundDirection())
        {
            indent(builder, level);
            builder.append("\"PegRoundDirection\": \"");
            builder.append(pegRoundDirection);
            builder.append("\",\n");
        }

        if (hasPegScope())
        {
            indent(builder, level);
            builder.append("\"PegScope\": \"");
            builder.append(pegScope);
            builder.append("\",\n");
        }

        if (hasPegSecurityIDSource())
        {
            indent(builder, level);
            builder.append("\"PegSecurityIDSource\": \"");
            builder.append(this.pegSecurityIDSource(), 0, pegSecurityIDSourceLength());
            builder.append("\",\n");
        }

        if (hasPegSecurityID())
        {
            indent(builder, level);
            builder.append("\"PegSecurityID\": \"");
            builder.append(this.pegSecurityID(), 0, pegSecurityIDLength());
            builder.append("\",\n");
        }

        if (hasPegSymbol())
        {
            indent(builder, level);
            builder.append("\"PegSymbol\": \"");
            builder.append(this.pegSymbol(), 0, pegSymbolLength());
            builder.append("\",\n");
        }

        if (hasPegSecurityDesc())
        {
            indent(builder, level);
            builder.append("\"PegSecurityDesc\": \"");
            builder.append(this.pegSecurityDesc(), 0, pegSecurityDescLength());
            builder.append("\",\n");
        }

        if (hasDiscretionInst())
        {
            indent(builder, level);
            builder.append("\"DiscretionInst\": \"");
            builder.append(discretionInst);
            builder.append("\",\n");
        }

        if (hasDiscretionOffsetValue())
        {
            indent(builder, level);
            builder.append("\"DiscretionOffsetValue\": \"");
            discretionOffsetValue.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasDiscretionMoveType())
        {
            indent(builder, level);
            builder.append("\"DiscretionMoveType\": \"");
            builder.append(discretionMoveType);
            builder.append("\",\n");
        }

        if (hasDiscretionOffsetType())
        {
            indent(builder, level);
            builder.append("\"DiscretionOffsetType\": \"");
            builder.append(discretionOffsetType);
            builder.append("\",\n");
        }

        if (hasDiscretionLimitType())
        {
            indent(builder, level);
            builder.append("\"DiscretionLimitType\": \"");
            builder.append(discretionLimitType);
            builder.append("\",\n");
        }

        if (hasDiscretionRoundDirection())
        {
            indent(builder, level);
            builder.append("\"DiscretionRoundDirection\": \"");
            builder.append(discretionRoundDirection);
            builder.append("\",\n");
        }

        if (hasDiscretionScope())
        {
            indent(builder, level);
            builder.append("\"DiscretionScope\": \"");
            builder.append(discretionScope);
            builder.append("\",\n");
        }

        if (hasTargetStrategy())
        {
            indent(builder, level);
            builder.append("\"TargetStrategy\": \"");
            builder.append(targetStrategy);
            builder.append("\",\n");
        }

        if (hasNoStrategyParametersGroupCounter)
        {
            indent(builder, level);
            builder.append("\"StrategyParametersGroup\": [\n");
            StrategyParametersGroupDecoder strategyParametersGroup = this.strategyParametersGroup;
            for (int i = 0, size = this.noStrategyParametersGroupCounter; i < size; i++)
            {
                indent(builder, level);
                strategyParametersGroup.appendTo(builder, level + 1);
                if (strategyParametersGroup.next() != null)
                {
                    builder.append(',');
                }
                builder.append('\n');
                strategyParametersGroup = strategyParametersGroup.next();            }
            indent(builder, level);
            builder.append("],\n");
        }

        if (hasTargetStrategyParameters())
        {
            indent(builder, level);
            builder.append("\"TargetStrategyParameters\": \"");
            builder.append(this.targetStrategyParameters(), 0, targetStrategyParametersLength());
            builder.append("\",\n");
        }

        if (hasParticipationRate())
        {
            indent(builder, level);
            builder.append("\"ParticipationRate\": \"");
            participationRate.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasDesignation())
        {
            indent(builder, level);
            builder.append("\"Designation\": \"");
            builder.append(this.designation(), 0, designationLength());
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public ListOrdGrpEncoder.OrdersGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((ListOrdGrpEncoder.OrdersGroupEncoder)encoder);
    }

    public ListOrdGrpEncoder.OrdersGroupEncoder toEncoder(final ListOrdGrpEncoder.OrdersGroupEncoder encoder)
    {
        encoder.reset();
        encoder.clOrdID(this.clOrdID(), 0, clOrdIDLength());
        if (hasSecondaryClOrdID())
        {
            encoder.secondaryClOrdID(this.secondaryClOrdID(), 0, secondaryClOrdIDLength());
        }

        encoder.listSeqNo(this.listSeqNo());
        if (hasClOrdLinkID())
        {
            encoder.clOrdLinkID(this.clOrdLinkID(), 0, clOrdLinkIDLength());
        }

        if (hasSettlInstMode())
        {
            encoder.settlInstMode(this.settlInstMode());
        }


        final PartiesEncoder parties = encoder.parties();        if (hasNoPartyIDsGroupCounter)
        {
            final int size = this.noPartyIDsGroupCounter;
            PartyIDsGroupDecoder partyIDsGroup = this.partyIDsGroup;
            PartyIDsGroupEncoder partyIDsGroupEncoder = parties.partyIDsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (partyIDsGroup != null)
                {
                    partyIDsGroup.toEncoder(partyIDsGroupEncoder);
                    partyIDsGroup = partyIDsGroup.next();
                    partyIDsGroupEncoder = partyIDsGroupEncoder.next();
                }
            }
        }


        if (hasTradeOriginationDate())
        {
            encoder.tradeOriginationDateAsCopy(this.tradeOriginationDate(), 0, tradeOriginationDateLength());
        }

        if (hasTradeDate())
        {
            encoder.tradeDateAsCopy(this.tradeDate(), 0, tradeDateLength());
        }

        if (hasAccount())
        {
            encoder.account(this.account(), 0, accountLength());
        }

        if (hasAcctIDSource())
        {
            encoder.acctIDSource(this.acctIDSource());
        }

        if (hasAccountType())
        {
            encoder.accountType(this.accountType());
        }

        if (hasDayBookingInst())
        {
            encoder.dayBookingInst(this.dayBookingInst());
        }

        if (hasBookingUnit())
        {
            encoder.bookingUnit(this.bookingUnit());
        }

        if (hasAllocID())
        {
            encoder.allocID(this.allocID(), 0, allocIDLength());
        }

        if (hasPreallocMethod())
        {
            encoder.preallocMethod(this.preallocMethod());
        }


        final PreAllocGrpEncoder preAllocGrp = encoder.preAllocGrp();        if (hasNoAllocsGroupCounter)
        {
            final int size = this.noAllocsGroupCounter;
            AllocsGroupDecoder allocsGroup = this.allocsGroup;
            AllocsGroupEncoder allocsGroupEncoder = preAllocGrp.allocsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (allocsGroup != null)
                {
                    allocsGroup.toEncoder(allocsGroupEncoder);
                    allocsGroup = allocsGroup.next();
                    allocsGroupEncoder = allocsGroupEncoder.next();
                }
            }
        }


        if (hasSettlType())
        {
            encoder.settlType(this.settlType(), 0, settlTypeLength());
        }

        if (hasSettlDate())
        {
            encoder.settlDateAsCopy(this.settlDate(), 0, settlDateLength());
        }

        if (hasCashMargin())
        {
            encoder.cashMargin(this.cashMargin());
        }

        if (hasClearingFeeIndicator())
        {
            encoder.clearingFeeIndicator(this.clearingFeeIndicator(), 0, clearingFeeIndicatorLength());
        }

        if (hasHandlInst())
        {
            encoder.handlInst(this.handlInst());
        }

        if (hasExecInst())
        {
            encoder.execInst(this.execInst(), 0, execInstLength());
        }

        if (hasMinQty())
        {
            encoder.minQty(this.minQty());
        }

        if (hasMatchIncrement())
        {
            encoder.matchIncrement(this.matchIncrement());
        }

        if (hasMaxPriceLevels())
        {
            encoder.maxPriceLevels(this.maxPriceLevels());
        }


        final DisplayInstructionEncoder displayInstruction = encoder.displayInstruction();        if (hasDisplayQty())
        {
            displayInstruction.displayQty(this.displayQty());
        }

        if (hasSecondaryDisplayQty())
        {
            displayInstruction.secondaryDisplayQty(this.secondaryDisplayQty());
        }

        if (hasDisplayWhen())
        {
            displayInstruction.displayWhen(this.displayWhen());
        }

        if (hasDisplayMethod())
        {
            displayInstruction.displayMethod(this.displayMethod());
        }

        if (hasDisplayLowQty())
        {
            displayInstruction.displayLowQty(this.displayLowQty());
        }

        if (hasDisplayHighQty())
        {
            displayInstruction.displayHighQty(this.displayHighQty());
        }

        if (hasDisplayMinIncr())
        {
            displayInstruction.displayMinIncr(this.displayMinIncr());
        }

        if (hasRefreshQty())
        {
            displayInstruction.refreshQty(this.refreshQty());
        }


        if (hasMaxFloor())
        {
            encoder.maxFloor(this.maxFloor());
        }

        if (hasExDestination())
        {
            encoder.exDestination(this.exDestination(), 0, exDestinationLength());
        }

        if (hasExDestinationIDSource())
        {
            encoder.exDestinationIDSource(this.exDestinationIDSource());
        }


        final TrdgSesGrpEncoder trdgSesGrp = encoder.trdgSesGrp();        if (hasNoTradingSessionsGroupCounter)
        {
            final int size = this.noTradingSessionsGroupCounter;
            TradingSessionsGroupDecoder tradingSessionsGroup = this.tradingSessionsGroup;
            TradingSessionsGroupEncoder tradingSessionsGroupEncoder = trdgSesGrp.tradingSessionsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (tradingSessionsGroup != null)
                {
                    tradingSessionsGroup.toEncoder(tradingSessionsGroupEncoder);
                    tradingSessionsGroup = tradingSessionsGroup.next();
                    tradingSessionsGroupEncoder = tradingSessionsGroupEncoder.next();
                }
            }
        }


        if (hasProcessCode())
        {
            encoder.processCode(this.processCode());
        }


        final InstrumentEncoder instrument = encoder.instrument();        if (hasSymbol())
        {
            instrument.symbol(this.symbol(), 0, symbolLength());
        }

        if (hasSymbolSfx())
        {
            instrument.symbolSfx(this.symbolSfx(), 0, symbolSfxLength());
        }

        if (hasSecurityID())
        {
            instrument.securityID(this.securityID(), 0, securityIDLength());
        }

        if (hasSecurityIDSource())
        {
            instrument.securityIDSource(this.securityIDSource(), 0, securityIDSourceLength());
        }


        final SecAltIDGrpEncoder secAltIDGrp = instrument.secAltIDGrp();        if (hasNoSecurityAltIDGroupCounter)
        {
            final int size = this.noSecurityAltIDGroupCounter;
            SecurityAltIDGroupDecoder securityAltIDGroup = this.securityAltIDGroup;
            SecurityAltIDGroupEncoder securityAltIDGroupEncoder = secAltIDGrp.securityAltIDGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (securityAltIDGroup != null)
                {
                    securityAltIDGroup.toEncoder(securityAltIDGroupEncoder);
                    securityAltIDGroup = securityAltIDGroup.next();
                    securityAltIDGroupEncoder = securityAltIDGroupEncoder.next();
                }
            }
        }


        if (hasProduct())
        {
            instrument.product(this.product());
        }

        if (hasProductComplex())
        {
            instrument.productComplex(this.productComplex(), 0, productComplexLength());
        }

        if (hasSecurityGroup())
        {
            instrument.securityGroup(this.securityGroup(), 0, securityGroupLength());
        }

        if (hasCFICode())
        {
            instrument.cFICode(this.cFICode(), 0, cFICodeLength());
        }

        if (hasSecurityType())
        {
            instrument.securityType(this.securityType(), 0, securityTypeLength());
        }

        if (hasSecuritySubType())
        {
            instrument.securitySubType(this.securitySubType(), 0, securitySubTypeLength());
        }

        if (hasMaturityMonthYear())
        {
            instrument.maturityMonthYearAsCopy(this.maturityMonthYear(), 0, maturityMonthYearLength());
        }

        if (hasMaturityDate())
        {
            instrument.maturityDateAsCopy(this.maturityDate(), 0, maturityDateLength());
        }

        if (hasMaturityTime())
        {
            instrument.maturityTimeAsCopy(this.maturityTime(), 0, maturityTimeLength());
        }

        if (hasSettleOnOpenFlag())
        {
            instrument.settleOnOpenFlag(this.settleOnOpenFlag(), 0, settleOnOpenFlagLength());
        }

        if (hasInstrmtAssignmentMethod())
        {
            instrument.instrmtAssignmentMethod(this.instrmtAssignmentMethod());
        }

        if (hasSecurityStatus())
        {
            instrument.securityStatus(this.securityStatus(), 0, securityStatusLength());
        }

        if (hasCouponPaymentDate())
        {
            instrument.couponPaymentDateAsCopy(this.couponPaymentDate(), 0, couponPaymentDateLength());
        }

        if (hasRestructuringType())
        {
            instrument.restructuringType(this.restructuringType(), 0, restructuringTypeLength());
        }

        if (hasSeniority())
        {
            instrument.seniority(this.seniority(), 0, seniorityLength());
        }

        if (hasNotionalPercentageOutstanding())
        {
            instrument.notionalPercentageOutstanding(this.notionalPercentageOutstanding());
        }

        if (hasOriginalNotionalPercentageOutstanding())
        {
            instrument.originalNotionalPercentageOutstanding(this.originalNotionalPercentageOutstanding());
        }

        if (hasAttachmentPoint())
        {
            instrument.attachmentPoint(this.attachmentPoint());
        }

        if (hasDetachmentPoint())
        {
            instrument.detachmentPoint(this.detachmentPoint());
        }

        if (hasIssueDate())
        {
            instrument.issueDateAsCopy(this.issueDate(), 0, issueDateLength());
        }

        if (hasRepoCollateralSecurityType())
        {
            instrument.repoCollateralSecurityType(this.repoCollateralSecurityType(), 0, repoCollateralSecurityTypeLength());
        }

        if (hasRepurchaseTerm())
        {
            instrument.repurchaseTerm(this.repurchaseTerm());
        }

        if (hasRepurchaseRate())
        {
            instrument.repurchaseRate(this.repurchaseRate());
        }

        if (hasFactor())
        {
            instrument.factor(this.factor());
        }

        if (hasCreditRating())
        {
            instrument.creditRating(this.creditRating(), 0, creditRatingLength());
        }

        if (hasInstrRegistry())
        {
            instrument.instrRegistry(this.instrRegistry(), 0, instrRegistryLength());
        }

        if (hasCountryOfIssue())
        {
            instrument.countryOfIssue(this.countryOfIssue(), 0, countryOfIssueLength());
        }

        if (hasStateOrProvinceOfIssue())
        {
            instrument.stateOrProvinceOfIssue(this.stateOrProvinceOfIssue(), 0, stateOrProvinceOfIssueLength());
        }

        if (hasLocaleOfIssue())
        {
            instrument.localeOfIssue(this.localeOfIssue(), 0, localeOfIssueLength());
        }

        if (hasRedemptionDate())
        {
            instrument.redemptionDateAsCopy(this.redemptionDate(), 0, redemptionDateLength());
        }

        if (hasStrikePrice())
        {
            instrument.strikePrice(this.strikePrice());
        }

        if (hasStrikeCurrency())
        {
            instrument.strikeCurrency(this.strikeCurrency(), 0, strikeCurrencyLength());
        }

        if (hasStrikeMultiplier())
        {
            instrument.strikeMultiplier(this.strikeMultiplier());
        }

        if (hasStrikeValue())
        {
            instrument.strikeValue(this.strikeValue());
        }

        if (hasStrikePriceDeterminationMethod())
        {
            instrument.strikePriceDeterminationMethod(this.strikePriceDeterminationMethod());
        }

        if (hasStrikePriceBoundaryMethod())
        {
            instrument.strikePriceBoundaryMethod(this.strikePriceBoundaryMethod());
        }

        if (hasStrikePriceBoundaryPrecision())
        {
            instrument.strikePriceBoundaryPrecision(this.strikePriceBoundaryPrecision());
        }

        if (hasUnderlyingPriceDeterminationMethod())
        {
            instrument.underlyingPriceDeterminationMethod(this.underlyingPriceDeterminationMethod());
        }

        if (hasOptAttribute())
        {
            instrument.optAttribute(this.optAttribute());
        }

        if (hasContractMultiplier())
        {
            instrument.contractMultiplier(this.contractMultiplier());
        }

        if (hasContractMultiplierUnit())
        {
            instrument.contractMultiplierUnit(this.contractMultiplierUnit());
        }

        if (hasFlowScheduleType())
        {
            instrument.flowScheduleType(this.flowScheduleType());
        }

        if (hasMinPriceIncrement())
        {
            instrument.minPriceIncrement(this.minPriceIncrement());
        }

        if (hasMinPriceIncrementAmount())
        {
            instrument.minPriceIncrementAmount(this.minPriceIncrementAmount());
        }

        if (hasUnitOfMeasure())
        {
            instrument.unitOfMeasure(this.unitOfMeasure(), 0, unitOfMeasureLength());
        }

        if (hasUnitOfMeasureQty())
        {
            instrument.unitOfMeasureQty(this.unitOfMeasureQty());
        }

        if (hasPriceUnitOfMeasure())
        {
            instrument.priceUnitOfMeasure(this.priceUnitOfMeasure(), 0, priceUnitOfMeasureLength());
        }

        if (hasPriceUnitOfMeasureQty())
        {
            instrument.priceUnitOfMeasureQty(this.priceUnitOfMeasureQty());
        }

        if (hasSettlMethod())
        {
            instrument.settlMethod(this.settlMethod());
        }

        if (hasExerciseStyle())
        {
            instrument.exerciseStyle(this.exerciseStyle());
        }

        if (hasOptPayoutType())
        {
            instrument.optPayoutType(this.optPayoutType());
        }

        if (hasOptPayoutAmount())
        {
            instrument.optPayoutAmount(this.optPayoutAmount());
        }

        if (hasPriceQuoteMethod())
        {
            instrument.priceQuoteMethod(this.priceQuoteMethod(), 0, priceQuoteMethodLength());
        }

        if (hasValuationMethod())
        {
            instrument.valuationMethod(this.valuationMethod(), 0, valuationMethodLength());
        }

        if (hasListMethod())
        {
            instrument.listMethod(this.listMethod());
        }

        if (hasCapPrice())
        {
            instrument.capPrice(this.capPrice());
        }

        if (hasFloorPrice())
        {
            instrument.floorPrice(this.floorPrice());
        }

        if (hasPutOrCall())
        {
            instrument.putOrCall(this.putOrCall());
        }

        if (hasFlexibleIndicator())
        {
            instrument.flexibleIndicator(this.flexibleIndicator());
        }

        if (hasFlexProductEligibilityIndicator())
        {
            instrument.flexProductEligibilityIndicator(this.flexProductEligibilityIndicator());
        }

        if (hasTimeUnit())
        {
            instrument.timeUnit(this.timeUnit(), 0, timeUnitLength());
        }

        if (hasCouponRate())
        {
            instrument.couponRate(this.couponRate());
        }

        if (hasSecurityExchange())
        {
            instrument.securityExchange(this.securityExchange(), 0, securityExchangeLength());
        }

        if (hasPositionLimit())
        {
            instrument.positionLimit(this.positionLimit());
        }

        if (hasNTPositionLimit())
        {
            instrument.nTPositionLimit(this.nTPositionLimit());
        }

        if (hasIssuer())
        {
            instrument.issuer(this.issuer(), 0, issuerLength());
        }

        if (hasEncodedIssuerLen())
        {
            instrument.encodedIssuerLen(this.encodedIssuerLen());
        }

        if (hasEncodedIssuer())
        {
            instrument.encodedIssuerAsCopy(this.encodedIssuer(), 0, encodedIssuerLen());
            instrument.encodedIssuerLen(this.encodedIssuerLen());
        }

        if (hasSecurityDesc())
        {
            instrument.securityDesc(this.securityDesc(), 0, securityDescLength());
        }

        if (hasEncodedSecurityDescLen())
        {
            instrument.encodedSecurityDescLen(this.encodedSecurityDescLen());
        }

        if (hasEncodedSecurityDesc())
        {
            instrument.encodedSecurityDescAsCopy(this.encodedSecurityDesc(), 0, encodedSecurityDescLen());
            instrument.encodedSecurityDescLen(this.encodedSecurityDescLen());
        }


        final SecurityXMLEncoder securityXML = instrument.securityXML();        if (hasSecurityXMLLen())
        {
            securityXML.securityXMLLen(this.securityXMLLen());
        }

        if (hasSecurityXML())
        {
            securityXML.securityXMLAsCopy(this.securityXML(), 0, securityXMLLen());
            securityXML.securityXMLLen(this.securityXMLLen());
        }

        if (hasSecurityXMLSchema())
        {
            securityXML.securityXMLSchema(this.securityXMLSchema(), 0, securityXMLSchemaLength());
        }


        if (hasPool())
        {
            instrument.pool(this.pool(), 0, poolLength());
        }

        if (hasContractSettlMonth())
        {
            instrument.contractSettlMonthAsCopy(this.contractSettlMonth(), 0, contractSettlMonthLength());
        }

        if (hasCPProgram())
        {
            instrument.cPProgram(this.cPProgram());
        }

        if (hasCPRegType())
        {
            instrument.cPRegType(this.cPRegType(), 0, cPRegTypeLength());
        }


        final EvntGrpEncoder evntGrp = instrument.evntGrp();        if (hasNoEventsGroupCounter)
        {
            final int size = this.noEventsGroupCounter;
            EventsGroupDecoder eventsGroup = this.eventsGroup;
            EventsGroupEncoder eventsGroupEncoder = evntGrp.eventsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (eventsGroup != null)
                {
                    eventsGroup.toEncoder(eventsGroupEncoder);
                    eventsGroup = eventsGroup.next();
                    eventsGroupEncoder = eventsGroupEncoder.next();
                }
            }
        }


        if (hasDatedDate())
        {
            instrument.datedDateAsCopy(this.datedDate(), 0, datedDateLength());
        }

        if (hasInterestAccrualDate())
        {
            instrument.interestAccrualDateAsCopy(this.interestAccrualDate(), 0, interestAccrualDateLength());
        }


        final InstrumentPartiesEncoder instrumentParties = instrument.instrumentParties();        if (hasNoInstrumentPartiesGroupCounter)
        {
            final int size = this.noInstrumentPartiesGroupCounter;
            InstrumentPartiesGroupDecoder instrumentPartiesGroup = this.instrumentPartiesGroup;
            InstrumentPartiesGroupEncoder instrumentPartiesGroupEncoder = instrumentParties.instrumentPartiesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (instrumentPartiesGroup != null)
                {
                    instrumentPartiesGroup.toEncoder(instrumentPartiesGroupEncoder);
                    instrumentPartiesGroup = instrumentPartiesGroup.next();
                    instrumentPartiesGroupEncoder = instrumentPartiesGroupEncoder.next();
                }
            }
        }



        final ComplexEventsEncoder complexEvents = instrument.complexEvents();        if (hasNoComplexEventsGroupCounter)
        {
            final int size = this.noComplexEventsGroupCounter;
            ComplexEventsGroupDecoder complexEventsGroup = this.complexEventsGroup;
            ComplexEventsGroupEncoder complexEventsGroupEncoder = complexEvents.complexEventsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (complexEventsGroup != null)
                {
                    complexEventsGroup.toEncoder(complexEventsGroupEncoder);
                    complexEventsGroup = complexEventsGroup.next();
                    complexEventsGroupEncoder = complexEventsGroupEncoder.next();
                }
            }
        }




        final UndInstrmtGrpEncoder undInstrmtGrp = encoder.undInstrmtGrp();        if (hasNoUnderlyingsGroupCounter)
        {
            final int size = this.noUnderlyingsGroupCounter;
            UnderlyingsGroupDecoder underlyingsGroup = this.underlyingsGroup;
            UnderlyingsGroupEncoder underlyingsGroupEncoder = undInstrmtGrp.underlyingsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (underlyingsGroup != null)
                {
                    underlyingsGroup.toEncoder(underlyingsGroupEncoder);
                    underlyingsGroup = underlyingsGroup.next();
                    underlyingsGroupEncoder = underlyingsGroupEncoder.next();
                }
            }
        }


        if (hasPrevClosePx())
        {
            encoder.prevClosePx(this.prevClosePx());
        }

        encoder.side(this.side());
        if (hasSideValueInd())
        {
            encoder.sideValueInd(this.sideValueInd());
        }

        if (hasLocateReqd())
        {
            encoder.locateReqd(this.locateReqd());
        }

        if (hasTransactTime())
        {
            encoder.transactTimeAsCopy(this.transactTime(), 0, transactTimeLength());
        }


        final StipulationsEncoder stipulations = encoder.stipulations();        if (hasNoStipulationsGroupCounter)
        {
            final int size = this.noStipulationsGroupCounter;
            StipulationsGroupDecoder stipulationsGroup = this.stipulationsGroup;
            StipulationsGroupEncoder stipulationsGroupEncoder = stipulations.stipulationsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (stipulationsGroup != null)
                {
                    stipulationsGroup.toEncoder(stipulationsGroupEncoder);
                    stipulationsGroup = stipulationsGroup.next();
                    stipulationsGroupEncoder = stipulationsGroupEncoder.next();
                }
            }
        }


        if (hasQtyType())
        {
            encoder.qtyType(this.qtyType());
        }


        final OrderQtyDataEncoder orderQtyData = encoder.orderQtyData();        if (hasOrderQty())
        {
            orderQtyData.orderQty(this.orderQty());
        }

        if (hasCashOrderQty())
        {
            orderQtyData.cashOrderQty(this.cashOrderQty());
        }

        if (hasOrderPercent())
        {
            orderQtyData.orderPercent(this.orderPercent());
        }

        if (hasRoundingDirection())
        {
            orderQtyData.roundingDirection(this.roundingDirection());
        }

        if (hasRoundingModulus())
        {
            orderQtyData.roundingModulus(this.roundingModulus());
        }


        if (hasOrdType())
        {
            encoder.ordType(this.ordType());
        }

        if (hasPriceType())
        {
            encoder.priceType(this.priceType());
        }

        if (hasPrice())
        {
            encoder.price(this.price());
        }

        if (hasPriceProtectionScope())
        {
            encoder.priceProtectionScope(this.priceProtectionScope());
        }

        if (hasStopPx())
        {
            encoder.stopPx(this.stopPx());
        }


        final TriggeringInstructionEncoder triggeringInstruction = encoder.triggeringInstruction();        if (hasTriggerType())
        {
            triggeringInstruction.triggerType(this.triggerType());
        }

        if (hasTriggerAction())
        {
            triggeringInstruction.triggerAction(this.triggerAction());
        }

        if (hasTriggerPrice())
        {
            triggeringInstruction.triggerPrice(this.triggerPrice());
        }

        if (hasTriggerSymbol())
        {
            triggeringInstruction.triggerSymbol(this.triggerSymbol(), 0, triggerSymbolLength());
        }

        if (hasTriggerSecurityID())
        {
            triggeringInstruction.triggerSecurityID(this.triggerSecurityID(), 0, triggerSecurityIDLength());
        }

        if (hasTriggerSecurityIDSource())
        {
            triggeringInstruction.triggerSecurityIDSource(this.triggerSecurityIDSource(), 0, triggerSecurityIDSourceLength());
        }

        if (hasTriggerSecurityDesc())
        {
            triggeringInstruction.triggerSecurityDesc(this.triggerSecurityDesc(), 0, triggerSecurityDescLength());
        }

        if (hasTriggerPriceType())
        {
            triggeringInstruction.triggerPriceType(this.triggerPriceType());
        }

        if (hasTriggerPriceTypeScope())
        {
            triggeringInstruction.triggerPriceTypeScope(this.triggerPriceTypeScope());
        }

        if (hasTriggerPriceDirection())
        {
            triggeringInstruction.triggerPriceDirection(this.triggerPriceDirection());
        }

        if (hasTriggerNewPrice())
        {
            triggeringInstruction.triggerNewPrice(this.triggerNewPrice());
        }

        if (hasTriggerOrderType())
        {
            triggeringInstruction.triggerOrderType(this.triggerOrderType());
        }

        if (hasTriggerNewQty())
        {
            triggeringInstruction.triggerNewQty(this.triggerNewQty());
        }

        if (hasTriggerTradingSessionID())
        {
            triggeringInstruction.triggerTradingSessionID(this.triggerTradingSessionID(), 0, triggerTradingSessionIDLength());
        }

        if (hasTriggerTradingSessionSubID())
        {
            triggeringInstruction.triggerTradingSessionSubID(this.triggerTradingSessionSubID(), 0, triggerTradingSessionSubIDLength());
        }



        final SpreadOrBenchmarkCurveDataEncoder spreadOrBenchmarkCurveData = encoder.spreadOrBenchmarkCurveData();        if (hasSpread())
        {
            spreadOrBenchmarkCurveData.spread(this.spread());
        }

        if (hasBenchmarkCurveCurrency())
        {
            spreadOrBenchmarkCurveData.benchmarkCurveCurrency(this.benchmarkCurveCurrency(), 0, benchmarkCurveCurrencyLength());
        }

        if (hasBenchmarkCurveName())
        {
            spreadOrBenchmarkCurveData.benchmarkCurveName(this.benchmarkCurveName(), 0, benchmarkCurveNameLength());
        }

        if (hasBenchmarkCurvePoint())
        {
            spreadOrBenchmarkCurveData.benchmarkCurvePoint(this.benchmarkCurvePoint(), 0, benchmarkCurvePointLength());
        }

        if (hasBenchmarkPrice())
        {
            spreadOrBenchmarkCurveData.benchmarkPrice(this.benchmarkPrice());
        }

        if (hasBenchmarkPriceType())
        {
            spreadOrBenchmarkCurveData.benchmarkPriceType(this.benchmarkPriceType());
        }

        if (hasBenchmarkSecurityID())
        {
            spreadOrBenchmarkCurveData.benchmarkSecurityID(this.benchmarkSecurityID(), 0, benchmarkSecurityIDLength());
        }

        if (hasBenchmarkSecurityIDSource())
        {
            spreadOrBenchmarkCurveData.benchmarkSecurityIDSource(this.benchmarkSecurityIDSource(), 0, benchmarkSecurityIDSourceLength());
        }



        final YieldDataEncoder yieldData = encoder.yieldData();        if (hasYieldType())
        {
            yieldData.yieldType(this.yieldType(), 0, yieldTypeLength());
        }

        if (hasYield())
        {
            yieldData.yield(this.yield());
        }

        if (hasYieldCalcDate())
        {
            yieldData.yieldCalcDateAsCopy(this.yieldCalcDate(), 0, yieldCalcDateLength());
        }

        if (hasYieldRedemptionDate())
        {
            yieldData.yieldRedemptionDateAsCopy(this.yieldRedemptionDate(), 0, yieldRedemptionDateLength());
        }

        if (hasYieldRedemptionPrice())
        {
            yieldData.yieldRedemptionPrice(this.yieldRedemptionPrice());
        }

        if (hasYieldRedemptionPriceType())
        {
            yieldData.yieldRedemptionPriceType(this.yieldRedemptionPriceType());
        }


        if (hasCurrency())
        {
            encoder.currency(this.currency(), 0, currencyLength());
        }

        if (hasComplianceID())
        {
            encoder.complianceID(this.complianceID(), 0, complianceIDLength());
        }

        if (hasSolicitedFlag())
        {
            encoder.solicitedFlag(this.solicitedFlag());
        }

        if (hasIOIID())
        {
            encoder.iOIID(this.iOIID(), 0, iOIIDLength());
        }

        if (hasQuoteID())
        {
            encoder.quoteID(this.quoteID(), 0, quoteIDLength());
        }

        if (hasRefOrderID())
        {
            encoder.refOrderID(this.refOrderID(), 0, refOrderIDLength());
        }

        if (hasRefOrderIDSource())
        {
            encoder.refOrderIDSource(this.refOrderIDSource());
        }

        if (hasTimeInForce())
        {
            encoder.timeInForce(this.timeInForce());
        }

        if (hasEffectiveTime())
        {
            encoder.effectiveTimeAsCopy(this.effectiveTime(), 0, effectiveTimeLength());
        }

        if (hasExpireDate())
        {
            encoder.expireDateAsCopy(this.expireDate(), 0, expireDateLength());
        }

        if (hasExpireTime())
        {
            encoder.expireTimeAsCopy(this.expireTime(), 0, expireTimeLength());
        }

        if (hasGTBookingInst())
        {
            encoder.gTBookingInst(this.gTBookingInst());
        }


        final CommissionDataEncoder commissionData = encoder.commissionData();        if (hasCommission())
        {
            commissionData.commission(this.commission());
        }

        if (hasCommType())
        {
            commissionData.commType(this.commType());
        }

        if (hasCommCurrency())
        {
            commissionData.commCurrency(this.commCurrency(), 0, commCurrencyLength());
        }

        if (hasFundRenewWaiv())
        {
            commissionData.fundRenewWaiv(this.fundRenewWaiv());
        }


        if (hasOrderCapacity())
        {
            encoder.orderCapacity(this.orderCapacity());
        }

        if (hasOrderRestrictions())
        {
            encoder.orderRestrictions(this.orderRestrictions(), 0, orderRestrictionsLength());
        }

        if (hasPreTradeAnonymity())
        {
            encoder.preTradeAnonymity(this.preTradeAnonymity());
        }

        if (hasCustOrderCapacity())
        {
            encoder.custOrderCapacity(this.custOrderCapacity());
        }

        if (hasForexReq())
        {
            encoder.forexReq(this.forexReq());
        }

        if (hasSettlCurrency())
        {
            encoder.settlCurrency(this.settlCurrency(), 0, settlCurrencyLength());
        }

        if (hasBookingType())
        {
            encoder.bookingType(this.bookingType());
        }

        if (hasText())
        {
            encoder.text(this.text(), 0, textLength());
        }

        if (hasEncodedTextLen())
        {
            encoder.encodedTextLen(this.encodedTextLen());
        }

        if (hasEncodedText())
        {
            encoder.encodedTextAsCopy(this.encodedText(), 0, encodedTextLen());
            encoder.encodedTextLen(this.encodedTextLen());
        }

        if (hasSettlDate2())
        {
            encoder.settlDate2AsCopy(this.settlDate2(), 0, settlDate2Length());
        }

        if (hasOrderQty2())
        {
            encoder.orderQty2(this.orderQty2());
        }

        if (hasPrice2())
        {
            encoder.price2(this.price2());
        }

        if (hasPositionEffect())
        {
            encoder.positionEffect(this.positionEffect());
        }

        if (hasCoveredOrUncovered())
        {
            encoder.coveredOrUncovered(this.coveredOrUncovered());
        }

        if (hasMaxShow())
        {
            encoder.maxShow(this.maxShow());
        }


        final PegInstructionsEncoder pegInstructions = encoder.pegInstructions();        if (hasPegOffsetValue())
        {
            pegInstructions.pegOffsetValue(this.pegOffsetValue());
        }

        if (hasPegPriceType())
        {
            pegInstructions.pegPriceType(this.pegPriceType());
        }

        if (hasPegMoveType())
        {
            pegInstructions.pegMoveType(this.pegMoveType());
        }

        if (hasPegOffsetType())
        {
            pegInstructions.pegOffsetType(this.pegOffsetType());
        }

        if (hasPegLimitType())
        {
            pegInstructions.pegLimitType(this.pegLimitType());
        }

        if (hasPegRoundDirection())
        {
            pegInstructions.pegRoundDirection(this.pegRoundDirection());
        }

        if (hasPegScope())
        {
            pegInstructions.pegScope(this.pegScope());
        }

        if (hasPegSecurityIDSource())
        {
            pegInstructions.pegSecurityIDSource(this.pegSecurityIDSource(), 0, pegSecurityIDSourceLength());
        }

        if (hasPegSecurityID())
        {
            pegInstructions.pegSecurityID(this.pegSecurityID(), 0, pegSecurityIDLength());
        }

        if (hasPegSymbol())
        {
            pegInstructions.pegSymbol(this.pegSymbol(), 0, pegSymbolLength());
        }

        if (hasPegSecurityDesc())
        {
            pegInstructions.pegSecurityDesc(this.pegSecurityDesc(), 0, pegSecurityDescLength());
        }



        final DiscretionInstructionsEncoder discretionInstructions = encoder.discretionInstructions();        if (hasDiscretionInst())
        {
            discretionInstructions.discretionInst(this.discretionInst());
        }

        if (hasDiscretionOffsetValue())
        {
            discretionInstructions.discretionOffsetValue(this.discretionOffsetValue());
        }

        if (hasDiscretionMoveType())
        {
            discretionInstructions.discretionMoveType(this.discretionMoveType());
        }

        if (hasDiscretionOffsetType())
        {
            discretionInstructions.discretionOffsetType(this.discretionOffsetType());
        }

        if (hasDiscretionLimitType())
        {
            discretionInstructions.discretionLimitType(this.discretionLimitType());
        }

        if (hasDiscretionRoundDirection())
        {
            discretionInstructions.discretionRoundDirection(this.discretionRoundDirection());
        }

        if (hasDiscretionScope())
        {
            discretionInstructions.discretionScope(this.discretionScope());
        }


        if (hasTargetStrategy())
        {
            encoder.targetStrategy(this.targetStrategy());
        }


        final StrategyParametersGrpEncoder strategyParametersGrp = encoder.strategyParametersGrp();        if (hasNoStrategyParametersGroupCounter)
        {
            final int size = this.noStrategyParametersGroupCounter;
            StrategyParametersGroupDecoder strategyParametersGroup = this.strategyParametersGroup;
            StrategyParametersGroupEncoder strategyParametersGroupEncoder = strategyParametersGrp.strategyParametersGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (strategyParametersGroup != null)
                {
                    strategyParametersGroup.toEncoder(strategyParametersGroupEncoder);
                    strategyParametersGroup = strategyParametersGroup.next();
                    strategyParametersGroupEncoder = strategyParametersGroupEncoder.next();
                }
            }
        }


        if (hasTargetStrategyParameters())
        {
            encoder.targetStrategyParameters(this.targetStrategyParameters(), 0, targetStrategyParametersLength());
        }

        if (hasParticipationRate())
        {
            encoder.participationRate(this.participationRate());
        }

        if (hasDesignation())
        {
            encoder.designation(this.designation(), 0, designationLength());
        }
        return encoder;
    }

}
    public class OrdersGroupIterator implements Iterable<OrdersGroupDecoder>, java.util.Iterator<OrdersGroupDecoder>
    {
        private final ListOrdGrpDecoder parent;
        private int remainder;
        private OrdersGroupDecoder current;

        public OrdersGroupIterator(final ListOrdGrpDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }

        public OrdersGroupDecoder next()
        {
            remainder--;
            final OrdersGroupDecoder value = current;
            current = current.next();
            return value;
        }

        public int numberFieldValue()
        {
            return parent.hasNoOrdersGroupCounter() ? parent.noOrdersGroupCounter() : 0;
        }

        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.ordersGroup();
        }

        public OrdersGroupIterator iterator()
        {
            reset();
            return this;
        }

    }

    public OrdersGroupIterator ordersGroupIterator();
    public int noOrdersGroupCounter();
    public boolean hasNoOrdersGroupCounter();
    public OrdersGroupDecoder ordersGroup();

}
