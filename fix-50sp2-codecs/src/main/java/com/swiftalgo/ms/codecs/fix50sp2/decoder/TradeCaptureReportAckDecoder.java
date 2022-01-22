/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2.decoder;

import org.agrona.AsciiNumberFormatException;
import org.agrona.MutableDirectBuffer;
import org.agrona.AsciiSequenceView;
import static uk.co.real_logic.artio.dictionary.generation.CodecUtil.*;
import static uk.co.real_logic.artio.dictionary.SessionConstants.*;
import uk.co.real_logic.artio.builder.Decoder;
import com.swiftalgo.ms.codecs.fix50sp2.decoder.HeaderDecoder;
import com.swiftalgo.ms.codecs.fix50sp2.decoder.TrailerDecoder;
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
import com.swiftalgo.ms.codecs.fix50sp2.builder.TradeCaptureReportAckEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.RootPartiesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.RootPartiesEncoder.RootPartyIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.RootSubPartiesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.RootSubPartiesEncoder.RootPartySubIDsGroupEncoder;
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
import com.swiftalgo.ms.codecs.fix50sp2.builder.TrdRepIndicatorsGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.TrdRepIndicatorsGrpEncoder.TrdRepIndicatorsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.TrdInstrmtLegGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.TrdInstrmtLegGrpEncoder.LegsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.InstrumentLegEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.LegSecAltIDGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.LegSecAltIDGrpEncoder.LegSecurityAltIDGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.LegStipulationsEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.LegStipulationsEncoder.LegStipulationsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.NestedPartiesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.NestedPartiesEncoder.NestedPartyIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.NstdPtysSubGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.NstdPtysSubGrpEncoder.NestedPartySubIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.TradeCapLegUnderlyingsGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.TradeCapLegUnderlyingsGrpEncoder.OfLegUnderlyingsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.UnderlyingLegInstrumentEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.UnderlyingLegSecurityAltIDGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.UnderlyingLegSecurityAltIDGrpEncoder.UnderlyingLegSecurityAltIDGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.TrdRegTimestampsEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.TrdRegTimestampsEncoder.TrdRegTimestampsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.PositionAmountDataEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.PositionAmountDataEncoder.PosAmtGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.TrdCapRptAckSideGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.TrdCapRptAckSideGrpEncoder.SidesGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.PartiesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.PartiesEncoder.PartyIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.PtysSubGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.PtysSubGrpEncoder.PartySubIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.ClrInstGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.ClrInstGrpEncoder.ClearingInstructionsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.CommissionDataEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.ContAmtGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.ContAmtGrpEncoder.ContAmtsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.StipulationsEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.StipulationsEncoder.StipulationsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.MiscFeesGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.MiscFeesGrpEncoder.MiscFeesGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.SettlDetailsEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.SettlDetailsEncoder.SettlDetailsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.SettlPartiesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.SettlPartiesEncoder.SettlPartyIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.SettlPtysSubGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.SettlPtysSubGrpEncoder.SettlPartySubIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.TrdAllocGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.TrdAllocGrpEncoder.AllocsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.NestedParties2Encoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.NestedParties2Encoder.Nested2PartyIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.NstdPtys2SubGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.NstdPtys2SubGrpEncoder.Nested2PartySubIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.TradeReportOrderDetailEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.OrderQtyDataEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.DisplayInstructionEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.SideTrdRegTSEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.SideTrdRegTSEncoder.SideTrdRegTSGroupEncoder;


public class TradeCaptureReportAckDecoder extends CommonDecoderImpl implements RootPartiesDecoder, InstrumentDecoder, UndInstrmtGrpDecoder, TrdRepIndicatorsGrpDecoder, TrdInstrmtLegGrpDecoder, TrdRegTimestampsDecoder, PositionAmountDataDecoder, TrdCapRptAckSideGrpDecoder, MessageDecoder
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(0);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
        }
    }

    public final IntHashSet GROUP_FIELDS = new IntHashSet(322);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            GROUP_FIELDS.add(Constants.TRADE_REPORT_ID);
            GROUP_FIELDS.add(Constants.TRADE_ID);
            GROUP_FIELDS.add(Constants.SECONDARY_TRADE_ID);
            GROUP_FIELDS.add(Constants.FIRM_TRADE_ID);
            GROUP_FIELDS.add(Constants.SECONDARY_FIRM_TRADE_ID);
            GROUP_FIELDS.add(Constants.TRADE_REPORT_TRANS_TYPE);
            GROUP_FIELDS.add(Constants.TRADE_REPORT_TYPE);
            GROUP_FIELDS.add(Constants.TRD_TYPE);
            GROUP_FIELDS.add(Constants.TRD_SUB_TYPE);
            GROUP_FIELDS.add(Constants.SECONDARY_TRD_TYPE);
            GROUP_FIELDS.add(Constants.TRADE_HANDLING_INSTR);
            GROUP_FIELDS.add(Constants.ORIG_TRADE_HANDLING_INSTR);
            GROUP_FIELDS.add(Constants.ORIG_TRADE_DATE);
            GROUP_FIELDS.add(Constants.ORIG_TRADE_ID);
            GROUP_FIELDS.add(Constants.ORIG_SECONDARY_TRADE_ID);
            GROUP_FIELDS.add(Constants.TRANSFER_REASON);
            GROUP_FIELDS.add(Constants.EXEC_TYPE);
            GROUP_FIELDS.add(Constants.TRADE_REPORT_REF_ID);
            GROUP_FIELDS.add(Constants.SECONDARY_TRADE_REPORT_REF_ID);
            GROUP_FIELDS.add(Constants.TRD_RPT_STATUS);
            GROUP_FIELDS.add(Constants.TRADE_REPORT_REJECT_REASON);
            GROUP_FIELDS.add(Constants.SECONDARY_TRADE_REPORT_ID);
            GROUP_FIELDS.add(Constants.SUBSCRIPTION_REQUEST_TYPE);
            GROUP_FIELDS.add(Constants.TRADE_LINK_ID);
            GROUP_FIELDS.add(Constants.TRD_MATCH_ID);
            GROUP_FIELDS.add(Constants.EXEC_ID);
            GROUP_FIELDS.add(Constants.SECONDARY_EXEC_ID);
            GROUP_FIELDS.add(Constants.EXEC_RESTATEMENT_REASON);
            GROUP_FIELDS.add(Constants.PREVIOUSLY_REPORTED);
            GROUP_FIELDS.add(Constants.PRICE_TYPE);
            GROUP_FIELDS.add(Constants.UNDERLYING_TRADING_SESSION_ID);
            GROUP_FIELDS.add(Constants.UNDERLYING_TRADING_SESSION_SUB_ID);
            GROUP_FIELDS.add(Constants.SETTL_SESS_ID);
            GROUP_FIELDS.add(Constants.SETTL_SESS_SUB_ID);
            GROUP_FIELDS.add(Constants.QTY_TYPE);
            GROUP_FIELDS.add(Constants.LAST_QTY);
            GROUP_FIELDS.add(Constants.LAST_PX);
            GROUP_FIELDS.add(Constants.VENUE_TYPE);
            GROUP_FIELDS.add(Constants.MARKET_SEGMENT_ID);
            GROUP_FIELDS.add(Constants.MARKET_ID);
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
            GROUP_FIELDS.add(Constants.LAST_PAR_PX);
            GROUP_FIELDS.add(Constants.CALCULATED_CCY_LAST_QTY);
            GROUP_FIELDS.add(Constants.LAST_SWAP_POINTS);
            GROUP_FIELDS.add(Constants.CURRENCY);
            GROUP_FIELDS.add(Constants.SETTL_CURRENCY);
            GROUP_FIELDS.add(Constants.LAST_SPOT_RATE);
            GROUP_FIELDS.add(Constants.LAST_FORWARD_POINTS);
            GROUP_FIELDS.add(Constants.LAST_MKT);
            GROUP_FIELDS.add(Constants.TRADE_DATE);
            GROUP_FIELDS.add(Constants.CLEARING_BUSINESS_DATE);
            GROUP_FIELDS.add(Constants.AVG_PX);
            GROUP_FIELDS.add(Constants.AVG_PX_INDICATOR);
            GROUP_FIELDS.add(Constants.MULTI_LEG_REPORTING_TYPE);
            GROUP_FIELDS.add(Constants.TRADE_LEG_REF_ID);
            GROUP_FIELDS.add(Constants.TRANSACT_TIME);
            GROUP_FIELDS.add(Constants.SETTL_TYPE);
            GROUP_FIELDS.add(Constants.MATCH_STATUS);
            GROUP_FIELDS.add(Constants.MATCH_TYPE);
            GROUP_FIELDS.add(Constants.COPY_MSG_INDICATOR);
            GROUP_FIELDS.add(Constants.PUBLISH_TRD_INDICATOR);
            GROUP_FIELDS.add(Constants.TRADE_PUBLISH_INDICATOR);
            GROUP_FIELDS.add(Constants.SHORT_SALE_REASON);
            GROUP_FIELDS.add(Constants.RESPONSE_TRANSPORT_TYPE);
            GROUP_FIELDS.add(Constants.RESPONSE_DESTINATION);
            GROUP_FIELDS.add(Constants.TEXT);
            GROUP_FIELDS.add(Constants.ENCODED_TEXT_LEN);
            GROUP_FIELDS.add(Constants.ENCODED_TEXT);
            GROUP_FIELDS.add(Constants.AS_OF_INDICATOR);
            GROUP_FIELDS.add(Constants.CLEARING_FEE_INDICATOR);
            GROUP_FIELDS.add(Constants.TIER_CODE);
            GROUP_FIELDS.add(Constants.MESSAGE_EVENT_SOURCE);
            GROUP_FIELDS.add(Constants.LAST_UPDATE_TIME);
            GROUP_FIELDS.add(Constants.RND_PX);
            GROUP_FIELDS.add(Constants.RPT_SYS);
            GROUP_FIELDS.add(Constants.GROSS_TRADE_AMT);
            GROUP_FIELDS.add(Constants.SETTL_DATE);
            GROUP_FIELDS.add(Constants.FEE_MULTIPLIER);
        }
    }

    private final IntHashSet alreadyVisitedFields = new IntHashSet(322);

    private final IntHashSet unknownFields = new IntHashSet(10);

    private final IntHashSet missingRequiredFields = new IntHashSet(0);

    public boolean validate()
    {
        if (rejectReason != Decoder.NO_ERROR)
        {
            return false;
        }
        final IntIterator missingFieldsIterator = missingRequiredFields.iterator();
        final IntIterator unknownFieldsIterator = unknownFields.iterator();
        if (CODEC_REJECT_UNKNOWN_FIELD_ENABLED && unknownFieldsIterator.hasNext())
        {
            invalidTagId = unknownFieldsIterator.nextValue();
            rejectReason = Constants.ALL_FIELDS.contains(invalidTagId) ? 2 : 0;
            return false;
        }
        if (!header.validate())
        {
            invalidTagId = header.invalidTagId();
            rejectReason = header.rejectReason();
            return false;
        }
        else if (!trailer.validate())
        {
            invalidTagId = trailer.invalidTagId();
            rejectReason = trailer.rejectReason();
            return false;
        }
        if (missingFieldsIterator.hasNext())
        {
            invalidTagId = missingFieldsIterator.nextValue();
            rejectReason = 1;
            return false;
        }
        if (hasTradeReportTransType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !TradeReportTransType.isValid(tradeReportTransType()))
        {
            invalidTagId = 487;
            rejectReason = 5;
            return false;
        }
        }

        if (hasTradeReportType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !TradeReportType.isValid(tradeReportType()))
        {
            invalidTagId = 856;
            rejectReason = 5;
            return false;
        }
        }

        if (hasTrdType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !TrdType.isValid(trdType()))
        {
            invalidTagId = 828;
            rejectReason = 5;
            return false;
        }
        }

        if (hasTrdSubType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !TrdSubType.isValid(trdSubType()))
        {
            invalidTagId = 829;
            rejectReason = 5;
            return false;
        }
        }

        if (hasTradeHandlingInstr)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !TradeHandlingInstr.isValid(tradeHandlingInstr()))
        {
            invalidTagId = 1123;
            rejectReason = 5;
            return false;
        }
        }

        if (hasExecType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !ExecType.isValid(execType()))
        {
            invalidTagId = 150;
            rejectReason = 5;
            return false;
        }
        }

        if (hasTrdRptStatus)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !TrdRptStatus.isValid(trdRptStatus()))
        {
            invalidTagId = 939;
            rejectReason = 5;
            return false;
        }
        }

        if (hasTradeReportRejectReason)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !TradeReportRejectReason.isValid(tradeReportRejectReason()))
        {
            invalidTagId = 751;
            rejectReason = 5;
            return false;
        }
        }

        if (hasSubscriptionRequestType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !SubscriptionRequestType.isValid(subscriptionRequestType()))
        {
            invalidTagId = 263;
            rejectReason = 5;
            return false;
        }
        }

        if (hasExecRestatementReason)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !ExecRestatementReason.isValid(execRestatementReason()))
        {
            invalidTagId = 378;
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

        if (hasSettlSessID)
        {
        settlSessIDWrapper.wrap(this.settlSessID(), settlSessIDLength);
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !SettlSessID.isValid(settlSessIDWrapper))
        {
            invalidTagId = 716;
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

        if (hasVenueType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !VenueType.isValid(venueType()))
        {
            invalidTagId = 1430;
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

        if (hasAvgPxIndicator)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !AvgPxIndicator.isValid(avgPxIndicator()))
        {
            invalidTagId = 819;
            rejectReason = 5;
            return false;
        }
        }

        if (hasMultiLegReportingType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !MultiLegReportingType.isValid(multiLegReportingType()))
        {
            invalidTagId = 442;
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

        if (hasMatchStatus)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !MatchStatus.isValid(matchStatus()))
        {
            invalidTagId = 573;
            rejectReason = 5;
            return false;
        }
        }

        if (hasMatchType)
        {
        matchTypeWrapper.wrap(this.matchType(), matchTypeLength);
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !MatchType.isValid(matchTypeWrapper))
        {
            invalidTagId = 574;
            rejectReason = 5;
            return false;
        }
        }


        if (hasTradePublishIndicator)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !TradePublishIndicator.isValid(tradePublishIndicator()))
        {
            invalidTagId = 1390;
            rejectReason = 5;
            return false;
        }
        }

        if (hasShortSaleReason)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !ShortSaleReason.isValid(shortSaleReason()))
        {
            invalidTagId = 853;
            rejectReason = 5;
            return false;
        }
        }

        if (hasResponseTransportType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !ResponseTransportType.isValid(responseTransportType()))
        {
            invalidTagId = 725;
            rejectReason = 5;
            return false;
        }
        }

        if (hasAsOfIndicator)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !AsOfIndicator.isValid(asOfIndicator()))
        {
            invalidTagId = 1015;
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
        if (hasNoRootPartyIDsGroupCounter)
        {
            {
                int count = 0;
                final RootPartyIDsGroupIterator iterator = rootPartyIDsGroupIterator.iterator();
                for (final RootPartyIDsGroupDecoder group : iterator)
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
                    invalidTagId = 1116;
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

        if (hasNoTrdRepIndicatorsGroupCounter)
        {
            {
                int count = 0;
                final TrdRepIndicatorsGroupIterator iterator = trdRepIndicatorsGroupIterator.iterator();
                for (final TrdRepIndicatorsGroupDecoder group : iterator)
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
                    invalidTagId = 1387;
                    rejectReason = 16;
                    return false;
                }
            }
        }

        if (hasNoLegsGroupCounter)
        {
            {
                int count = 0;
                final LegsGroupIterator iterator = legsGroupIterator.iterator();
                for (final LegsGroupDecoder group : iterator)
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
                    invalidTagId = 555;
                    rejectReason = 16;
                    return false;
                }
            }
        }

        if (hasNoTrdRegTimestampsGroupCounter)
        {
            {
                int count = 0;
                final TrdRegTimestampsGroupIterator iterator = trdRegTimestampsGroupIterator.iterator();
                for (final TrdRegTimestampsGroupDecoder group : iterator)
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
                    invalidTagId = 768;
                    rejectReason = 16;
                    return false;
                }
            }
        }

        if (hasNoPosAmtGroupCounter)
        {
            {
                int count = 0;
                final PosAmtGroupIterator iterator = posAmtGroupIterator.iterator();
                for (final PosAmtGroupDecoder group : iterator)
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
                    invalidTagId = 753;
                    rejectReason = 16;
                    return false;
                }
            }
        }

        {
            int count = 0;
            final SidesGroupIterator iterator = sidesGroupIterator.iterator();
            for (final SidesGroupDecoder group : iterator)
            {
                count++;                if (!group.validate())
                {
                    invalidTagId = group.invalidTagId();
                    rejectReason = group.rejectReason();
                    return false;
                }
            }
            if (count != iterator.numberFieldValue())
            {
                invalidTagId = 552;
                rejectReason = 16;
                return false;
            }
        }
        return true;
    }

    public static final long MESSAGE_TYPE = 21057L;

    public static final String MESSAGE_TYPE_AS_STRING = "AR";

    public static final char[] MESSAGE_TYPE_CHARS = MESSAGE_TYPE_AS_STRING.toCharArray();

    public static final byte[] MESSAGE_TYPE_BYTES = MESSAGE_TYPE_AS_STRING.getBytes(US_ASCII);

    public final IntHashSet messageFields = new IntHashSet(1150);

    {
        messageFields.add(Constants.BEGIN_STRING);
        messageFields.add(Constants.BODY_LENGTH);
        messageFields.add(Constants.MSG_TYPE);
        messageFields.add(Constants.APPL_VER_ID);
        messageFields.add(Constants.APPL_EXT_ID);
        messageFields.add(Constants.CSTM_APPL_VER_ID);
        messageFields.add(Constants.SENDER_COMP_ID);
        messageFields.add(Constants.TARGET_COMP_ID);
        messageFields.add(Constants.ON_BEHALF_OF_COMP_ID);
        messageFields.add(Constants.DELIVER_TO_COMP_ID);
        messageFields.add(Constants.SECURE_DATA_LEN);
        messageFields.add(Constants.SECURE_DATA);
        messageFields.add(Constants.MSG_SEQ_NUM);
        messageFields.add(Constants.SENDER_SUB_ID);
        messageFields.add(Constants.SENDER_LOCATION_ID);
        messageFields.add(Constants.TARGET_SUB_ID);
        messageFields.add(Constants.TARGET_LOCATION_ID);
        messageFields.add(Constants.ON_BEHALF_OF_SUB_ID);
        messageFields.add(Constants.ON_BEHALF_OF_LOCATION_ID);
        messageFields.add(Constants.DELIVER_TO_SUB_ID);
        messageFields.add(Constants.DELIVER_TO_LOCATION_ID);
        messageFields.add(Constants.POSS_DUP_FLAG);
        messageFields.add(Constants.POSS_RESEND);
        messageFields.add(Constants.SENDING_TIME);
        messageFields.add(Constants.ORIG_SENDING_TIME);
        messageFields.add(Constants.XML_DATA_LEN);
        messageFields.add(Constants.XML_DATA);
        messageFields.add(Constants.MESSAGE_ENCODING);
        messageFields.add(Constants.LAST_MSG_SEQ_NUM_PROCESSED);
        messageFields.add(Constants.TRADE_REPORT_ID);
        messageFields.add(Constants.TRADE_ID);
        messageFields.add(Constants.SECONDARY_TRADE_ID);
        messageFields.add(Constants.FIRM_TRADE_ID);
        messageFields.add(Constants.SECONDARY_FIRM_TRADE_ID);
        messageFields.add(Constants.TRADE_REPORT_TRANS_TYPE);
        messageFields.add(Constants.TRADE_REPORT_TYPE);
        messageFields.add(Constants.TRD_TYPE);
        messageFields.add(Constants.TRD_SUB_TYPE);
        messageFields.add(Constants.SECONDARY_TRD_TYPE);
        messageFields.add(Constants.TRADE_HANDLING_INSTR);
        messageFields.add(Constants.ORIG_TRADE_HANDLING_INSTR);
        messageFields.add(Constants.ORIG_TRADE_DATE);
        messageFields.add(Constants.ORIG_TRADE_ID);
        messageFields.add(Constants.ORIG_SECONDARY_TRADE_ID);
        messageFields.add(Constants.TRANSFER_REASON);
        messageFields.add(Constants.NO_ROOT_PARTY_IDS_GROUP_COUNTER);
        messageFields.add(Constants.ROOT_PARTY_ID);
        messageFields.add(Constants.ROOT_PARTY_ID_SOURCE);
        messageFields.add(Constants.ROOT_PARTY_ROLE);
        messageFields.add(Constants.NO_ROOT_PARTY_SUB_IDS_GROUP_COUNTER);
        messageFields.add(Constants.ROOT_PARTY_SUB_ID);
        messageFields.add(Constants.ROOT_PARTY_SUB_ID_TYPE);
        messageFields.add(Constants.EXEC_TYPE);
        messageFields.add(Constants.TRADE_REPORT_REF_ID);
        messageFields.add(Constants.SECONDARY_TRADE_REPORT_REF_ID);
        messageFields.add(Constants.TRD_RPT_STATUS);
        messageFields.add(Constants.TRADE_REPORT_REJECT_REASON);
        messageFields.add(Constants.SECONDARY_TRADE_REPORT_ID);
        messageFields.add(Constants.SUBSCRIPTION_REQUEST_TYPE);
        messageFields.add(Constants.TRADE_LINK_ID);
        messageFields.add(Constants.TRD_MATCH_ID);
        messageFields.add(Constants.EXEC_ID);
        messageFields.add(Constants.SECONDARY_EXEC_ID);
        messageFields.add(Constants.EXEC_RESTATEMENT_REASON);
        messageFields.add(Constants.PREVIOUSLY_REPORTED);
        messageFields.add(Constants.PRICE_TYPE);
        messageFields.add(Constants.UNDERLYING_TRADING_SESSION_ID);
        messageFields.add(Constants.UNDERLYING_TRADING_SESSION_SUB_ID);
        messageFields.add(Constants.SETTL_SESS_ID);
        messageFields.add(Constants.SETTL_SESS_SUB_ID);
        messageFields.add(Constants.QTY_TYPE);
        messageFields.add(Constants.LAST_QTY);
        messageFields.add(Constants.LAST_PX);
        messageFields.add(Constants.VENUE_TYPE);
        messageFields.add(Constants.MARKET_SEGMENT_ID);
        messageFields.add(Constants.MARKET_ID);
        messageFields.add(Constants.SYMBOL);
        messageFields.add(Constants.SYMBOL_SFX);
        messageFields.add(Constants.SECURITY_ID);
        messageFields.add(Constants.SECURITY_ID_SOURCE);
        messageFields.add(Constants.NO_SECURITY_ALT_ID_GROUP_COUNTER);
        messageFields.add(Constants.SECURITY_ALT_ID);
        messageFields.add(Constants.SECURITY_ALT_ID_SOURCE);
        messageFields.add(Constants.PRODUCT);
        messageFields.add(Constants.PRODUCT_COMPLEX);
        messageFields.add(Constants.SECURITY_GROUP);
        messageFields.add(Constants.C_F_I_CODE);
        messageFields.add(Constants.SECURITY_TYPE);
        messageFields.add(Constants.SECURITY_SUB_TYPE);
        messageFields.add(Constants.MATURITY_MONTH_YEAR);
        messageFields.add(Constants.MATURITY_DATE);
        messageFields.add(Constants.MATURITY_TIME);
        messageFields.add(Constants.SETTLE_ON_OPEN_FLAG);
        messageFields.add(Constants.INSTRMT_ASSIGNMENT_METHOD);
        messageFields.add(Constants.SECURITY_STATUS);
        messageFields.add(Constants.COUPON_PAYMENT_DATE);
        messageFields.add(Constants.RESTRUCTURING_TYPE);
        messageFields.add(Constants.SENIORITY);
        messageFields.add(Constants.NOTIONAL_PERCENTAGE_OUTSTANDING);
        messageFields.add(Constants.ORIGINAL_NOTIONAL_PERCENTAGE_OUTSTANDING);
        messageFields.add(Constants.ATTACHMENT_POINT);
        messageFields.add(Constants.DETACHMENT_POINT);
        messageFields.add(Constants.ISSUE_DATE);
        messageFields.add(Constants.REPO_COLLATERAL_SECURITY_TYPE);
        messageFields.add(Constants.REPURCHASE_TERM);
        messageFields.add(Constants.REPURCHASE_RATE);
        messageFields.add(Constants.FACTOR);
        messageFields.add(Constants.CREDIT_RATING);
        messageFields.add(Constants.INSTR_REGISTRY);
        messageFields.add(Constants.COUNTRY_OF_ISSUE);
        messageFields.add(Constants.STATE_OR_PROVINCE_OF_ISSUE);
        messageFields.add(Constants.LOCALE_OF_ISSUE);
        messageFields.add(Constants.REDEMPTION_DATE);
        messageFields.add(Constants.STRIKE_PRICE);
        messageFields.add(Constants.STRIKE_CURRENCY);
        messageFields.add(Constants.STRIKE_MULTIPLIER);
        messageFields.add(Constants.STRIKE_VALUE);
        messageFields.add(Constants.STRIKE_PRICE_DETERMINATION_METHOD);
        messageFields.add(Constants.STRIKE_PRICE_BOUNDARY_METHOD);
        messageFields.add(Constants.STRIKE_PRICE_BOUNDARY_PRECISION);
        messageFields.add(Constants.UNDERLYING_PRICE_DETERMINATION_METHOD);
        messageFields.add(Constants.OPT_ATTRIBUTE);
        messageFields.add(Constants.CONTRACT_MULTIPLIER);
        messageFields.add(Constants.CONTRACT_MULTIPLIER_UNIT);
        messageFields.add(Constants.FLOW_SCHEDULE_TYPE);
        messageFields.add(Constants.MIN_PRICE_INCREMENT);
        messageFields.add(Constants.MIN_PRICE_INCREMENT_AMOUNT);
        messageFields.add(Constants.UNIT_OF_MEASURE);
        messageFields.add(Constants.UNIT_OF_MEASURE_QTY);
        messageFields.add(Constants.PRICE_UNIT_OF_MEASURE);
        messageFields.add(Constants.PRICE_UNIT_OF_MEASURE_QTY);
        messageFields.add(Constants.SETTL_METHOD);
        messageFields.add(Constants.EXERCISE_STYLE);
        messageFields.add(Constants.OPT_PAYOUT_TYPE);
        messageFields.add(Constants.OPT_PAYOUT_AMOUNT);
        messageFields.add(Constants.PRICE_QUOTE_METHOD);
        messageFields.add(Constants.VALUATION_METHOD);
        messageFields.add(Constants.LIST_METHOD);
        messageFields.add(Constants.CAP_PRICE);
        messageFields.add(Constants.FLOOR_PRICE);
        messageFields.add(Constants.PUT_OR_CALL);
        messageFields.add(Constants.FLEXIBLE_INDICATOR);
        messageFields.add(Constants.FLEX_PRODUCT_ELIGIBILITY_INDICATOR);
        messageFields.add(Constants.TIME_UNIT);
        messageFields.add(Constants.COUPON_RATE);
        messageFields.add(Constants.SECURITY_EXCHANGE);
        messageFields.add(Constants.POSITION_LIMIT);
        messageFields.add(Constants.N_T_POSITION_LIMIT);
        messageFields.add(Constants.ISSUER);
        messageFields.add(Constants.ENCODED_ISSUER_LEN);
        messageFields.add(Constants.ENCODED_ISSUER);
        messageFields.add(Constants.SECURITY_DESC);
        messageFields.add(Constants.ENCODED_SECURITY_DESC_LEN);
        messageFields.add(Constants.ENCODED_SECURITY_DESC);
        messageFields.add(Constants.SECURITY_X_M_L_LEN);
        messageFields.add(Constants.SECURITY_X_M_L);
        messageFields.add(Constants.SECURITY_X_M_L_SCHEMA);
        messageFields.add(Constants.POOL);
        messageFields.add(Constants.CONTRACT_SETTL_MONTH);
        messageFields.add(Constants.C_P_PROGRAM);
        messageFields.add(Constants.C_P_REG_TYPE);
        messageFields.add(Constants.NO_EVENTS_GROUP_COUNTER);
        messageFields.add(Constants.EVENT_TYPE);
        messageFields.add(Constants.EVENT_DATE);
        messageFields.add(Constants.EVENT_TIME);
        messageFields.add(Constants.EVENT_PX);
        messageFields.add(Constants.EVENT_TEXT);
        messageFields.add(Constants.DATED_DATE);
        messageFields.add(Constants.INTEREST_ACCRUAL_DATE);
        messageFields.add(Constants.NO_INSTRUMENT_PARTIES_GROUP_COUNTER);
        messageFields.add(Constants.INSTRUMENT_PARTY_ID);
        messageFields.add(Constants.INSTRUMENT_PARTY_ID_SOURCE);
        messageFields.add(Constants.INSTRUMENT_PARTY_ROLE);
        messageFields.add(Constants.NO_INSTRUMENT_PARTY_SUB_IDS_GROUP_COUNTER);
        messageFields.add(Constants.INSTRUMENT_PARTY_SUB_ID);
        messageFields.add(Constants.INSTRUMENT_PARTY_SUB_ID_TYPE);
        messageFields.add(Constants.NO_COMPLEX_EVENTS_GROUP_COUNTER);
        messageFields.add(Constants.COMPLEX_EVENT_TYPE);
        messageFields.add(Constants.COMPLEX_OPT_PAYOUT_AMOUNT);
        messageFields.add(Constants.COMPLEX_EVENT_PRICE);
        messageFields.add(Constants.COMPLEX_EVENT_PRICE_BOUNDARY_METHOD);
        messageFields.add(Constants.COMPLEX_EVENT_PRICE_BOUNDARY_PRECISION);
        messageFields.add(Constants.COMPLEX_EVENT_PRICE_TIME_TYPE);
        messageFields.add(Constants.COMPLEX_EVENT_CONDITION);
        messageFields.add(Constants.NO_COMPLEX_EVENT_DATES_GROUP_COUNTER);
        messageFields.add(Constants.COMPLEX_EVENT_START_DATE);
        messageFields.add(Constants.COMPLEX_EVENT_END_DATE);
        messageFields.add(Constants.NO_COMPLEX_EVENT_TIMES_GROUP_COUNTER);
        messageFields.add(Constants.COMPLEX_EVENT_START_TIME);
        messageFields.add(Constants.COMPLEX_EVENT_END_TIME);
        messageFields.add(Constants.LAST_PAR_PX);
        messageFields.add(Constants.CALCULATED_CCY_LAST_QTY);
        messageFields.add(Constants.LAST_SWAP_POINTS);
        messageFields.add(Constants.CURRENCY);
        messageFields.add(Constants.SETTL_CURRENCY);
        messageFields.add(Constants.LAST_SPOT_RATE);
        messageFields.add(Constants.LAST_FORWARD_POINTS);
        messageFields.add(Constants.LAST_MKT);
        messageFields.add(Constants.TRADE_DATE);
        messageFields.add(Constants.CLEARING_BUSINESS_DATE);
        messageFields.add(Constants.AVG_PX);
        messageFields.add(Constants.AVG_PX_INDICATOR);
        messageFields.add(Constants.MULTI_LEG_REPORTING_TYPE);
        messageFields.add(Constants.TRADE_LEG_REF_ID);
        messageFields.add(Constants.TRANSACT_TIME);
        messageFields.add(Constants.SETTL_TYPE);
        messageFields.add(Constants.NO_UNDERLYINGS_GROUP_COUNTER);
        messageFields.add(Constants.UNDERLYING_SYMBOL);
        messageFields.add(Constants.UNDERLYING_SYMBOL_SFX);
        messageFields.add(Constants.UNDERLYING_SECURITY_ID);
        messageFields.add(Constants.UNDERLYING_SECURITY_ID_SOURCE);
        messageFields.add(Constants.NO_UNDERLYING_SECURITY_ALT_ID_GROUP_COUNTER);
        messageFields.add(Constants.UNDERLYING_SECURITY_ALT_ID);
        messageFields.add(Constants.UNDERLYING_SECURITY_ALT_ID_SOURCE);
        messageFields.add(Constants.UNDERLYING_PRODUCT);
        messageFields.add(Constants.UNDERLYING_C_F_I_CODE);
        messageFields.add(Constants.UNDERLYING_SECURITY_TYPE);
        messageFields.add(Constants.UNDERLYING_SECURITY_SUB_TYPE);
        messageFields.add(Constants.UNDERLYING_MATURITY_MONTH_YEAR);
        messageFields.add(Constants.UNDERLYING_MATURITY_DATE);
        messageFields.add(Constants.UNDERLYING_MATURITY_TIME);
        messageFields.add(Constants.UNDERLYING_COUPON_PAYMENT_DATE);
        messageFields.add(Constants.UNDERLYING_RESTRUCTURING_TYPE);
        messageFields.add(Constants.UNDERLYING_SENIORITY);
        messageFields.add(Constants.UNDERLYING_NOTIONAL_PERCENTAGE_OUTSTANDING);
        messageFields.add(Constants.UNDERLYING_ORIGINAL_NOTIONAL_PERCENTAGE_OUTSTANDING);
        messageFields.add(Constants.UNDERLYING_ATTACHMENT_POINT);
        messageFields.add(Constants.UNDERLYING_DETACHMENT_POINT);
        messageFields.add(Constants.UNDERLYING_ISSUE_DATE);
        messageFields.add(Constants.UNDERLYING_REPO_COLLATERAL_SECURITY_TYPE);
        messageFields.add(Constants.UNDERLYING_REPURCHASE_TERM);
        messageFields.add(Constants.UNDERLYING_REPURCHASE_RATE);
        messageFields.add(Constants.UNDERLYING_FACTOR);
        messageFields.add(Constants.UNDERLYING_CREDIT_RATING);
        messageFields.add(Constants.UNDERLYING_INSTR_REGISTRY);
        messageFields.add(Constants.UNDERLYING_COUNTRY_OF_ISSUE);
        messageFields.add(Constants.UNDERLYING_STATE_OR_PROVINCE_OF_ISSUE);
        messageFields.add(Constants.UNDERLYING_LOCALE_OF_ISSUE);
        messageFields.add(Constants.UNDERLYING_REDEMPTION_DATE);
        messageFields.add(Constants.UNDERLYING_STRIKE_PRICE);
        messageFields.add(Constants.UNDERLYING_STRIKE_CURRENCY);
        messageFields.add(Constants.UNDERLYING_OPT_ATTRIBUTE);
        messageFields.add(Constants.UNDERLYING_CONTRACT_MULTIPLIER);
        messageFields.add(Constants.UNDERLYING_CONTRACT_MULTIPLIER_UNIT);
        messageFields.add(Constants.UNDERLYING_FLOW_SCHEDULE_TYPE);
        messageFields.add(Constants.UNDERLYING_UNIT_OF_MEASURE);
        messageFields.add(Constants.UNDERLYING_UNIT_OF_MEASURE_QTY);
        messageFields.add(Constants.UNDERLYING_PRICE_UNIT_OF_MEASURE);
        messageFields.add(Constants.UNDERLYING_PRICE_UNIT_OF_MEASURE_QTY);
        messageFields.add(Constants.UNDERLYING_TIME_UNIT);
        messageFields.add(Constants.UNDERLYING_EXERCISE_STYLE);
        messageFields.add(Constants.UNDERLYING_COUPON_RATE);
        messageFields.add(Constants.UNDERLYING_SECURITY_EXCHANGE);
        messageFields.add(Constants.UNDERLYING_ISSUER);
        messageFields.add(Constants.ENCODED_UNDERLYING_ISSUER_LEN);
        messageFields.add(Constants.ENCODED_UNDERLYING_ISSUER);
        messageFields.add(Constants.UNDERLYING_SECURITY_DESC);
        messageFields.add(Constants.ENCODED_UNDERLYING_SECURITY_DESC_LEN);
        messageFields.add(Constants.ENCODED_UNDERLYING_SECURITY_DESC);
        messageFields.add(Constants.UNDERLYING_C_P_PROGRAM);
        messageFields.add(Constants.UNDERLYING_C_P_REG_TYPE);
        messageFields.add(Constants.UNDERLYING_ALLOCATION_PERCENT);
        messageFields.add(Constants.UNDERLYING_CURRENCY);
        messageFields.add(Constants.UNDERLYING_QTY);
        messageFields.add(Constants.UNDERLYING_SETTLEMENT_TYPE);
        messageFields.add(Constants.UNDERLYING_CASH_AMOUNT);
        messageFields.add(Constants.UNDERLYING_CASH_TYPE);
        messageFields.add(Constants.UNDERLYING_PX);
        messageFields.add(Constants.UNDERLYING_DIRTY_PRICE);
        messageFields.add(Constants.UNDERLYING_END_PRICE);
        messageFields.add(Constants.UNDERLYING_START_VALUE);
        messageFields.add(Constants.UNDERLYING_CURRENT_VALUE);
        messageFields.add(Constants.UNDERLYING_END_VALUE);
        messageFields.add(Constants.NO_UNDERLYING_STIPS_GROUP_COUNTER);
        messageFields.add(Constants.UNDERLYING_STIP_TYPE);
        messageFields.add(Constants.UNDERLYING_STIP_VALUE);
        messageFields.add(Constants.UNDERLYING_ADJUSTED_QUANTITY);
        messageFields.add(Constants.UNDERLYING_F_X_RATE);
        messageFields.add(Constants.UNDERLYING_F_X_RATE_CALC);
        messageFields.add(Constants.UNDERLYING_CAP_VALUE);
        messageFields.add(Constants.NO_UNDLY_INSTRUMENT_PARTIES_GROUP_COUNTER);
        messageFields.add(Constants.UNDERLYING_INSTRUMENT_PARTY_ID);
        messageFields.add(Constants.UNDERLYING_INSTRUMENT_PARTY_ID_SOURCE);
        messageFields.add(Constants.UNDERLYING_INSTRUMENT_PARTY_ROLE);
        messageFields.add(Constants.NO_UNDLY_INSTRUMENT_PARTY_SUB_IDS_GROUP_COUNTER);
        messageFields.add(Constants.UNDERLYING_INSTRUMENT_PARTY_SUB_ID);
        messageFields.add(Constants.UNDERLYING_INSTRUMENT_PARTY_SUB_ID_TYPE);
        messageFields.add(Constants.UNDERLYING_SETTL_METHOD);
        messageFields.add(Constants.UNDERLYING_PUT_OR_CALL);
        messageFields.add(Constants.MATCH_STATUS);
        messageFields.add(Constants.MATCH_TYPE);
        messageFields.add(Constants.COPY_MSG_INDICATOR);
        messageFields.add(Constants.NO_TRD_REP_INDICATORS_GROUP_COUNTER);
        messageFields.add(Constants.TRD_REP_PARTY_ROLE);
        messageFields.add(Constants.TRD_REP_INDICATOR);
        messageFields.add(Constants.PUBLISH_TRD_INDICATOR);
        messageFields.add(Constants.TRADE_PUBLISH_INDICATOR);
        messageFields.add(Constants.SHORT_SALE_REASON);
        messageFields.add(Constants.NO_LEGS_GROUP_COUNTER);
        messageFields.add(Constants.LEG_SYMBOL);
        messageFields.add(Constants.LEG_SYMBOL_SFX);
        messageFields.add(Constants.LEG_SECURITY_ID);
        messageFields.add(Constants.LEG_SECURITY_ID_SOURCE);
        messageFields.add(Constants.NO_LEG_SECURITY_ALT_ID_GROUP_COUNTER);
        messageFields.add(Constants.LEG_SECURITY_ALT_ID);
        messageFields.add(Constants.LEG_SECURITY_ALT_ID_SOURCE);
        messageFields.add(Constants.LEG_PRODUCT);
        messageFields.add(Constants.LEG_C_F_I_CODE);
        messageFields.add(Constants.LEG_SECURITY_TYPE);
        messageFields.add(Constants.LEG_SECURITY_SUB_TYPE);
        messageFields.add(Constants.LEG_MATURITY_MONTH_YEAR);
        messageFields.add(Constants.LEG_MATURITY_DATE);
        messageFields.add(Constants.LEG_MATURITY_TIME);
        messageFields.add(Constants.LEG_COUPON_PAYMENT_DATE);
        messageFields.add(Constants.LEG_ISSUE_DATE);
        messageFields.add(Constants.LEG_REPO_COLLATERAL_SECURITY_TYPE);
        messageFields.add(Constants.LEG_REPURCHASE_TERM);
        messageFields.add(Constants.LEG_REPURCHASE_RATE);
        messageFields.add(Constants.LEG_FACTOR);
        messageFields.add(Constants.LEG_CREDIT_RATING);
        messageFields.add(Constants.LEG_INSTR_REGISTRY);
        messageFields.add(Constants.LEG_COUNTRY_OF_ISSUE);
        messageFields.add(Constants.LEG_STATE_OR_PROVINCE_OF_ISSUE);
        messageFields.add(Constants.LEG_LOCALE_OF_ISSUE);
        messageFields.add(Constants.LEG_REDEMPTION_DATE);
        messageFields.add(Constants.LEG_STRIKE_PRICE);
        messageFields.add(Constants.LEG_STRIKE_CURRENCY);
        messageFields.add(Constants.LEG_OPT_ATTRIBUTE);
        messageFields.add(Constants.LEG_CONTRACT_MULTIPLIER);
        messageFields.add(Constants.LEG_CONTRACT_MULTIPLIER_UNIT);
        messageFields.add(Constants.LEG_FLOW_SCHEDULE_TYPE);
        messageFields.add(Constants.LEG_UNIT_OF_MEASURE);
        messageFields.add(Constants.LEG_UNIT_OF_MEASURE_QTY);
        messageFields.add(Constants.LEG_PRICE_UNIT_OF_MEASURE);
        messageFields.add(Constants.LEG_PRICE_UNIT_OF_MEASURE_QTY);
        messageFields.add(Constants.LEG_TIME_UNIT);
        messageFields.add(Constants.LEG_EXERCISE_STYLE);
        messageFields.add(Constants.LEG_COUPON_RATE);
        messageFields.add(Constants.LEG_SECURITY_EXCHANGE);
        messageFields.add(Constants.LEG_ISSUER);
        messageFields.add(Constants.ENCODED_LEG_ISSUER_LEN);
        messageFields.add(Constants.ENCODED_LEG_ISSUER);
        messageFields.add(Constants.LEG_SECURITY_DESC);
        messageFields.add(Constants.ENCODED_LEG_SECURITY_DESC_LEN);
        messageFields.add(Constants.ENCODED_LEG_SECURITY_DESC);
        messageFields.add(Constants.LEG_RATIO_QTY);
        messageFields.add(Constants.LEG_SIDE);
        messageFields.add(Constants.LEG_CURRENCY);
        messageFields.add(Constants.LEG_POOL);
        messageFields.add(Constants.LEG_DATED_DATE);
        messageFields.add(Constants.LEG_CONTRACT_SETTL_MONTH);
        messageFields.add(Constants.LEG_INTEREST_ACCRUAL_DATE);
        messageFields.add(Constants.LEG_PUT_OR_CALL);
        messageFields.add(Constants.LEG_OPTION_RATIO);
        messageFields.add(Constants.LEG_PRICE);
        messageFields.add(Constants.LEG_QTY);
        messageFields.add(Constants.LEG_SWAP_TYPE);
        messageFields.add(Constants.LEG_REPORT_ID);
        messageFields.add(Constants.LEG_NUMBER);
        messageFields.add(Constants.NO_LEG_STIPULATIONS_GROUP_COUNTER);
        messageFields.add(Constants.LEG_STIPULATION_TYPE);
        messageFields.add(Constants.LEG_STIPULATION_VALUE);
        messageFields.add(Constants.LEG_POSITION_EFFECT);
        messageFields.add(Constants.LEG_COVERED_OR_UNCOVERED);
        messageFields.add(Constants.NO_NESTED_PARTY_IDS_GROUP_COUNTER);
        messageFields.add(Constants.NESTED_PARTY_ID);
        messageFields.add(Constants.NESTED_PARTY_ID_SOURCE);
        messageFields.add(Constants.NESTED_PARTY_ROLE);
        messageFields.add(Constants.NO_NESTED_PARTY_SUB_IDS_GROUP_COUNTER);
        messageFields.add(Constants.NESTED_PARTY_SUB_ID);
        messageFields.add(Constants.NESTED_PARTY_SUB_ID_TYPE);
        messageFields.add(Constants.LEG_REF_ID);
        messageFields.add(Constants.LEG_SETTL_TYPE);
        messageFields.add(Constants.LEG_SETTL_DATE);
        messageFields.add(Constants.LEG_LAST_PX);
        messageFields.add(Constants.LEG_SETTL_CURRENCY);
        messageFields.add(Constants.LEG_LAST_FORWARD_POINTS);
        messageFields.add(Constants.LEG_CALCULATED_CCY_LAST_QTY);
        messageFields.add(Constants.LEG_GROSS_TRADE_AMT);
        messageFields.add(Constants.LEG_VOLATILITY);
        messageFields.add(Constants.LEG_DIVIDEND_YIELD);
        messageFields.add(Constants.LEG_CURRENCY_RATIO);
        messageFields.add(Constants.LEG_EXEC_INST);
        messageFields.add(Constants.LEG_LAST_QTY);
        messageFields.add(Constants.NO_OF_LEG_UNDERLYINGS_GROUP_COUNTER);
        messageFields.add(Constants.UNDERLYING_LEG_SYMBOL);
        messageFields.add(Constants.UNDERLYING_LEG_SYMBOL_SFX);
        messageFields.add(Constants.UNDERLYING_LEG_SECURITY_ID);
        messageFields.add(Constants.UNDERLYING_LEG_SECURITY_ID_SOURCE);
        messageFields.add(Constants.NO_UNDERLYING_LEG_SECURITY_ALT_ID_GROUP_COUNTER);
        messageFields.add(Constants.UNDERLYING_LEG_SECURITY_ALT_ID);
        messageFields.add(Constants.UNDERLYING_LEG_SECURITY_ALT_ID_SOURCE);
        messageFields.add(Constants.UNDERLYING_LEG_C_F_I_CODE);
        messageFields.add(Constants.UNDERLYING_LEG_SECURITY_TYPE);
        messageFields.add(Constants.UNDERLYING_LEG_SECURITY_SUB_TYPE);
        messageFields.add(Constants.UNDERLYING_LEG_MATURITY_MONTH_YEAR);
        messageFields.add(Constants.UNDERLYING_LEG_MATURITY_DATE);
        messageFields.add(Constants.UNDERLYING_LEG_MATURITY_TIME);
        messageFields.add(Constants.UNDERLYING_LEG_STRIKE_PRICE);
        messageFields.add(Constants.UNDERLYING_LEG_OPT_ATTRIBUTE);
        messageFields.add(Constants.UNDERLYING_LEG_PUT_OR_CALL);
        messageFields.add(Constants.UNDERLYING_LEG_SECURITY_EXCHANGE);
        messageFields.add(Constants.UNDERLYING_LEG_SECURITY_DESC);
        messageFields.add(Constants.NO_TRD_REG_TIMESTAMPS_GROUP_COUNTER);
        messageFields.add(Constants.TRD_REG_TIMESTAMP);
        messageFields.add(Constants.TRD_REG_TIMESTAMP_TYPE);
        messageFields.add(Constants.TRD_REG_TIMESTAMP_ORIGIN);
        messageFields.add(Constants.DESK_TYPE);
        messageFields.add(Constants.DESK_TYPE_SOURCE);
        messageFields.add(Constants.DESK_ORDER_HANDLING_INST);
        messageFields.add(Constants.RESPONSE_TRANSPORT_TYPE);
        messageFields.add(Constants.RESPONSE_DESTINATION);
        messageFields.add(Constants.TEXT);
        messageFields.add(Constants.ENCODED_TEXT_LEN);
        messageFields.add(Constants.ENCODED_TEXT);
        messageFields.add(Constants.AS_OF_INDICATOR);
        messageFields.add(Constants.CLEARING_FEE_INDICATOR);
        messageFields.add(Constants.NO_POS_AMT_GROUP_COUNTER);
        messageFields.add(Constants.POS_AMT_TYPE);
        messageFields.add(Constants.POS_AMT);
        messageFields.add(Constants.POSITION_CURRENCY);
        messageFields.add(Constants.TIER_CODE);
        messageFields.add(Constants.MESSAGE_EVENT_SOURCE);
        messageFields.add(Constants.LAST_UPDATE_TIME);
        messageFields.add(Constants.RND_PX);
        messageFields.add(Constants.NO_SIDES_GROUP_COUNTER);
        messageFields.add(Constants.SIDE);
        messageFields.add(Constants.SIDE_EXEC_ID);
        messageFields.add(Constants.ORDER_DELAY);
        messageFields.add(Constants.ORDER_DELAY_UNIT);
        messageFields.add(Constants.NO_PARTY_IDS_GROUP_COUNTER);
        messageFields.add(Constants.PARTY_ID);
        messageFields.add(Constants.PARTY_ID_SOURCE);
        messageFields.add(Constants.PARTY_ROLE);
        messageFields.add(Constants.NO_PARTY_SUB_IDS_GROUP_COUNTER);
        messageFields.add(Constants.PARTY_SUB_ID);
        messageFields.add(Constants.PARTY_SUB_ID_TYPE);
        messageFields.add(Constants.ACCOUNT);
        messageFields.add(Constants.ACCT_ID_SOURCE);
        messageFields.add(Constants.ACCOUNT_TYPE);
        messageFields.add(Constants.PROCESS_CODE);
        messageFields.add(Constants.ODD_LOT);
        messageFields.add(Constants.NO_CLEARING_INSTRUCTIONS_GROUP_COUNTER);
        messageFields.add(Constants.CLEARING_INSTRUCTION);
        messageFields.add(Constants.TRADE_INPUT_SOURCE);
        messageFields.add(Constants.TRADE_INPUT_DEVICE);
        messageFields.add(Constants.COMPLIANCE_ID);
        messageFields.add(Constants.SOLICITED_FLAG);
        messageFields.add(Constants.CUST_ORDER_CAPACITY);
        messageFields.add(Constants.TRADING_SESSION_ID);
        messageFields.add(Constants.TRADING_SESSION_SUB_ID);
        messageFields.add(Constants.TIME_BRACKET);
        messageFields.add(Constants.NET_GROSS_IND);
        messageFields.add(Constants.SIDE_CURRENCY);
        messageFields.add(Constants.SIDE_SETTL_CURRENCY);
        messageFields.add(Constants.COMMISSION);
        messageFields.add(Constants.COMM_TYPE);
        messageFields.add(Constants.COMM_CURRENCY);
        messageFields.add(Constants.FUND_RENEW_WAIV);
        messageFields.add(Constants.NUM_DAYS_INTEREST);
        messageFields.add(Constants.EX_DATE);
        messageFields.add(Constants.ACCRUED_INTEREST_RATE);
        messageFields.add(Constants.ACCRUED_INTEREST_AMT);
        messageFields.add(Constants.INTEREST_AT_MATURITY);
        messageFields.add(Constants.END_ACCRUED_INTEREST_AMT);
        messageFields.add(Constants.START_CASH);
        messageFields.add(Constants.END_CASH);
        messageFields.add(Constants.CONCESSION);
        messageFields.add(Constants.TOTAL_TAKEDOWN);
        messageFields.add(Constants.NET_MONEY);
        messageFields.add(Constants.SETTL_CURR_AMT);
        messageFields.add(Constants.SETTL_CURR_FX_RATE);
        messageFields.add(Constants.SETTL_CURR_FX_RATE_CALC);
        messageFields.add(Constants.POSITION_EFFECT);
        messageFields.add(Constants.SIDE_MULTI_LEG_REPORTING_TYPE);
        messageFields.add(Constants.NO_CONT_AMTS_GROUP_COUNTER);
        messageFields.add(Constants.CONT_AMT_TYPE);
        messageFields.add(Constants.CONT_AMT_VALUE);
        messageFields.add(Constants.CONT_AMT_CURR);
        messageFields.add(Constants.NO_STIPULATIONS_GROUP_COUNTER);
        messageFields.add(Constants.STIPULATION_TYPE);
        messageFields.add(Constants.STIPULATION_VALUE);
        messageFields.add(Constants.NO_MISC_FEES_GROUP_COUNTER);
        messageFields.add(Constants.MISC_FEE_AMT);
        messageFields.add(Constants.MISC_FEE_CURR);
        messageFields.add(Constants.MISC_FEE_TYPE);
        messageFields.add(Constants.MISC_FEE_BASIS);
        messageFields.add(Constants.EXCHANGE_RULE);
        messageFields.add(Constants.NO_SETTL_DETAILS_GROUP_COUNTER);
        messageFields.add(Constants.SETTL_OBLIG_SOURCE);
        messageFields.add(Constants.NO_SETTL_PARTY_IDS_GROUP_COUNTER);
        messageFields.add(Constants.SETTL_PARTY_ID);
        messageFields.add(Constants.SETTL_PARTY_ID_SOURCE);
        messageFields.add(Constants.SETTL_PARTY_ROLE);
        messageFields.add(Constants.NO_SETTL_PARTY_SUB_IDS_GROUP_COUNTER);
        messageFields.add(Constants.SETTL_PARTY_SUB_ID);
        messageFields.add(Constants.SETTL_PARTY_SUB_ID_TYPE);
        messageFields.add(Constants.TRADE_ALLOC_INDICATOR);
        messageFields.add(Constants.PREALLOC_METHOD);
        messageFields.add(Constants.ALLOC_ID);
        messageFields.add(Constants.NO_ALLOCS_GROUP_COUNTER);
        messageFields.add(Constants.ALLOC_ACCOUNT);
        messageFields.add(Constants.ALLOC_ACCT_ID_SOURCE);
        messageFields.add(Constants.ALLOC_SETTL_CURRENCY);
        messageFields.add(Constants.INDIVIDUAL_ALLOC_ID);
        messageFields.add(Constants.NO_NESTED2_PARTY_IDS_GROUP_COUNTER);
        messageFields.add(Constants.NESTED2_PARTY_ID);
        messageFields.add(Constants.NESTED2_PARTY_ID_SOURCE);
        messageFields.add(Constants.NESTED2_PARTY_ROLE);
        messageFields.add(Constants.NO_NESTED2_PARTY_SUB_IDS_GROUP_COUNTER);
        messageFields.add(Constants.NESTED2_PARTY_SUB_ID);
        messageFields.add(Constants.NESTED2_PARTY_SUB_ID_TYPE);
        messageFields.add(Constants.ALLOC_QTY);
        messageFields.add(Constants.ALLOC_CUSTOMER_CAPACITY);
        messageFields.add(Constants.ALLOC_METHOD);
        messageFields.add(Constants.SECONDARY_INDIVIDUAL_ALLOC_ID);
        messageFields.add(Constants.ALLOC_CLEARING_FEE_INDICATOR);
        messageFields.add(Constants.SIDE_GROSS_TRADE_AMT);
        messageFields.add(Constants.AGGRESSOR_INDICATOR);
        messageFields.add(Constants.SIDE_LAST_QTY);
        messageFields.add(Constants.SIDE_TRADE_REPORT_ID);
        messageFields.add(Constants.SIDE_FILL_STATION_CD);
        messageFields.add(Constants.SIDE_REASON_CD);
        messageFields.add(Constants.RPT_SEQ);
        messageFields.add(Constants.SIDE_TRD_SUB_TYP);
        messageFields.add(Constants.ORDER_CATEGORY);
        messageFields.add(Constants.ORDER_ID);
        messageFields.add(Constants.SECONDARY_ORDER_ID);
        messageFields.add(Constants.CL_ORD_ID);
        messageFields.add(Constants.SECONDARY_CL_ORD_ID);
        messageFields.add(Constants.LIST_ID);
        messageFields.add(Constants.REF_ORDER_ID);
        messageFields.add(Constants.REF_ORDER_ID_SOURCE);
        messageFields.add(Constants.REF_ORD_ID_REASON);
        messageFields.add(Constants.ORD_TYPE);
        messageFields.add(Constants.PRICE);
        messageFields.add(Constants.STOP_PX);
        messageFields.add(Constants.EXEC_INST);
        messageFields.add(Constants.ORD_STATUS);
        messageFields.add(Constants.ORDER_QTY);
        messageFields.add(Constants.CASH_ORDER_QTY);
        messageFields.add(Constants.ORDER_PERCENT);
        messageFields.add(Constants.ROUNDING_DIRECTION);
        messageFields.add(Constants.ROUNDING_MODULUS);
        messageFields.add(Constants.LEAVES_QTY);
        messageFields.add(Constants.CUM_QTY);
        messageFields.add(Constants.TIME_IN_FORCE);
        messageFields.add(Constants.EXPIRE_TIME);
        messageFields.add(Constants.DISPLAY_QTY);
        messageFields.add(Constants.SECONDARY_DISPLAY_QTY);
        messageFields.add(Constants.DISPLAY_WHEN);
        messageFields.add(Constants.DISPLAY_METHOD);
        messageFields.add(Constants.DISPLAY_LOW_QTY);
        messageFields.add(Constants.DISPLAY_HIGH_QTY);
        messageFields.add(Constants.DISPLAY_MIN_INCR);
        messageFields.add(Constants.REFRESH_QTY);
        messageFields.add(Constants.ORDER_CAPACITY);
        messageFields.add(Constants.ORDER_RESTRICTIONS);
        messageFields.add(Constants.BOOKING_TYPE);
        messageFields.add(Constants.ORIG_CUST_ORDER_CAPACITY);
        messageFields.add(Constants.ORDER_INPUT_DEVICE);
        messageFields.add(Constants.LOT_TYPE);
        messageFields.add(Constants.TRANS_BKD_TIME);
        messageFields.add(Constants.ORIG_ORD_MOD_TIME);
        messageFields.add(Constants.NO_SIDE_TRD_REG_T_S_GROUP_COUNTER);
        messageFields.add(Constants.SIDE_TRD_REG_TIMESTAMP);
        messageFields.add(Constants.SIDE_TRD_REG_TIMESTAMP_TYPE);
        messageFields.add(Constants.SIDE_TRD_REG_TIMESTAMP_SRC);
        messageFields.add(Constants.RPT_SYS);
        messageFields.add(Constants.GROSS_TRADE_AMT);
        messageFields.add(Constants.SETTL_DATE);
        messageFields.add(Constants.FEE_MULTIPLIER);
        messageFields.add(Constants.SIGNATURE_LENGTH);
        messageFields.add(Constants.SIGNATURE);
        messageFields.add(Constants.CHECK_SUM);
    }

    private final TrailerDecoder trailer = new TrailerDecoder();

    public TrailerDecoder trailer()
    {
        return trailer;
    }

    private final HeaderDecoder header = new HeaderDecoder(trailer);

    public HeaderDecoder header()
    {
        return header;
    }

    private char[] tradeReportID = new char[1];

    private boolean hasTradeReportID;

    public char[] tradeReportID()
    {
        if (!hasTradeReportID)
        {
            throw new IllegalArgumentException("No value for optional field: TradeReportID");
        }

        return tradeReportID;
    }

    public boolean hasTradeReportID()
    {
        return hasTradeReportID;
    }


    private int tradeReportIDOffset;

    private int tradeReportIDLength;

    public int tradeReportIDLength()
    {
        if (!hasTradeReportID)
        {
            throw new IllegalArgumentException("No value for optional field: TradeReportID");
        }

        return tradeReportIDLength;
    }

    public String tradeReportIDAsString()
    {
        return hasTradeReportID ? new String(tradeReportID, 0, tradeReportIDLength) : null;
    }

    public void tradeReportID(final AsciiSequenceView view)
    {
        if (!hasTradeReportID)
        {
            throw new IllegalArgumentException("No value for optional field: TradeReportID");
        }

        view.wrap(buffer, tradeReportIDOffset, tradeReportIDLength);
    }


    private final CharArrayWrapper tradeReportIDWrapper = new CharArrayWrapper();
    private char[] tradeID = new char[1];

    private boolean hasTradeID;

    public char[] tradeID()
    {
        if (!hasTradeID)
        {
            throw new IllegalArgumentException("No value for optional field: TradeID");
        }

        return tradeID;
    }

    public boolean hasTradeID()
    {
        return hasTradeID;
    }


    private int tradeIDOffset;

    private int tradeIDLength;

    public int tradeIDLength()
    {
        if (!hasTradeID)
        {
            throw new IllegalArgumentException("No value for optional field: TradeID");
        }

        return tradeIDLength;
    }

    public String tradeIDAsString()
    {
        return hasTradeID ? new String(tradeID, 0, tradeIDLength) : null;
    }

    public void tradeID(final AsciiSequenceView view)
    {
        if (!hasTradeID)
        {
            throw new IllegalArgumentException("No value for optional field: TradeID");
        }

        view.wrap(buffer, tradeIDOffset, tradeIDLength);
    }


    private final CharArrayWrapper tradeIDWrapper = new CharArrayWrapper();
    private char[] secondaryTradeID = new char[1];

    private boolean hasSecondaryTradeID;

    public char[] secondaryTradeID()
    {
        if (!hasSecondaryTradeID)
        {
            throw new IllegalArgumentException("No value for optional field: SecondaryTradeID");
        }

        return secondaryTradeID;
    }

    public boolean hasSecondaryTradeID()
    {
        return hasSecondaryTradeID;
    }


    private int secondaryTradeIDOffset;

    private int secondaryTradeIDLength;

    public int secondaryTradeIDLength()
    {
        if (!hasSecondaryTradeID)
        {
            throw new IllegalArgumentException("No value for optional field: SecondaryTradeID");
        }

        return secondaryTradeIDLength;
    }

    public String secondaryTradeIDAsString()
    {
        return hasSecondaryTradeID ? new String(secondaryTradeID, 0, secondaryTradeIDLength) : null;
    }

    public void secondaryTradeID(final AsciiSequenceView view)
    {
        if (!hasSecondaryTradeID)
        {
            throw new IllegalArgumentException("No value for optional field: SecondaryTradeID");
        }

        view.wrap(buffer, secondaryTradeIDOffset, secondaryTradeIDLength);
    }


    private final CharArrayWrapper secondaryTradeIDWrapper = new CharArrayWrapper();
    private char[] firmTradeID = new char[1];

    private boolean hasFirmTradeID;

    public char[] firmTradeID()
    {
        if (!hasFirmTradeID)
        {
            throw new IllegalArgumentException("No value for optional field: FirmTradeID");
        }

        return firmTradeID;
    }

    public boolean hasFirmTradeID()
    {
        return hasFirmTradeID;
    }


    private int firmTradeIDOffset;

    private int firmTradeIDLength;

    public int firmTradeIDLength()
    {
        if (!hasFirmTradeID)
        {
            throw new IllegalArgumentException("No value for optional field: FirmTradeID");
        }

        return firmTradeIDLength;
    }

    public String firmTradeIDAsString()
    {
        return hasFirmTradeID ? new String(firmTradeID, 0, firmTradeIDLength) : null;
    }

    public void firmTradeID(final AsciiSequenceView view)
    {
        if (!hasFirmTradeID)
        {
            throw new IllegalArgumentException("No value for optional field: FirmTradeID");
        }

        view.wrap(buffer, firmTradeIDOffset, firmTradeIDLength);
    }


    private final CharArrayWrapper firmTradeIDWrapper = new CharArrayWrapper();
    private char[] secondaryFirmTradeID = new char[1];

    private boolean hasSecondaryFirmTradeID;

    public char[] secondaryFirmTradeID()
    {
        if (!hasSecondaryFirmTradeID)
        {
            throw new IllegalArgumentException("No value for optional field: SecondaryFirmTradeID");
        }

        return secondaryFirmTradeID;
    }

    public boolean hasSecondaryFirmTradeID()
    {
        return hasSecondaryFirmTradeID;
    }


    private int secondaryFirmTradeIDOffset;

    private int secondaryFirmTradeIDLength;

    public int secondaryFirmTradeIDLength()
    {
        if (!hasSecondaryFirmTradeID)
        {
            throw new IllegalArgumentException("No value for optional field: SecondaryFirmTradeID");
        }

        return secondaryFirmTradeIDLength;
    }

    public String secondaryFirmTradeIDAsString()
    {
        return hasSecondaryFirmTradeID ? new String(secondaryFirmTradeID, 0, secondaryFirmTradeIDLength) : null;
    }

    public void secondaryFirmTradeID(final AsciiSequenceView view)
    {
        if (!hasSecondaryFirmTradeID)
        {
            throw new IllegalArgumentException("No value for optional field: SecondaryFirmTradeID");
        }

        view.wrap(buffer, secondaryFirmTradeIDOffset, secondaryFirmTradeIDLength);
    }


    private final CharArrayWrapper secondaryFirmTradeIDWrapper = new CharArrayWrapper();
    private int tradeReportTransType = MISSING_INT;

    private boolean hasTradeReportTransType;

    public int tradeReportTransType()
    {
        if (!hasTradeReportTransType)
        {
            throw new IllegalArgumentException("No value for optional field: TradeReportTransType");
        }

        return tradeReportTransType;
    }

    public boolean hasTradeReportTransType()
    {
        return hasTradeReportTransType;
    }



    private final CharArrayWrapper tradeReportTransTypeWrapper = new CharArrayWrapper();
    public TradeReportTransType tradeReportTransTypeAsEnum()
    {
        if (!hasTradeReportTransType)
 return TradeReportTransType.NULL_VAL;
        return TradeReportTransType.decode(tradeReportTransType);
    }

    private int tradeReportType = MISSING_INT;

    private boolean hasTradeReportType;

    public int tradeReportType()
    {
        if (!hasTradeReportType)
        {
            throw new IllegalArgumentException("No value for optional field: TradeReportType");
        }

        return tradeReportType;
    }

    public boolean hasTradeReportType()
    {
        return hasTradeReportType;
    }



    private final CharArrayWrapper tradeReportTypeWrapper = new CharArrayWrapper();
    public TradeReportType tradeReportTypeAsEnum()
    {
        if (!hasTradeReportType)
 return TradeReportType.NULL_VAL;
        return TradeReportType.decode(tradeReportType);
    }

    private int trdType = MISSING_INT;

    private boolean hasTrdType;

    public int trdType()
    {
        if (!hasTrdType)
        {
            throw new IllegalArgumentException("No value for optional field: TrdType");
        }

        return trdType;
    }

    public boolean hasTrdType()
    {
        return hasTrdType;
    }



    private final CharArrayWrapper trdTypeWrapper = new CharArrayWrapper();
    public TrdType trdTypeAsEnum()
    {
        if (!hasTrdType)
 return TrdType.NULL_VAL;
        return TrdType.decode(trdType);
    }

    private int trdSubType = MISSING_INT;

    private boolean hasTrdSubType;

    public int trdSubType()
    {
        if (!hasTrdSubType)
        {
            throw new IllegalArgumentException("No value for optional field: TrdSubType");
        }

        return trdSubType;
    }

    public boolean hasTrdSubType()
    {
        return hasTrdSubType;
    }



    private final CharArrayWrapper trdSubTypeWrapper = new CharArrayWrapper();
    public TrdSubType trdSubTypeAsEnum()
    {
        if (!hasTrdSubType)
 return TrdSubType.NULL_VAL;
        return TrdSubType.decode(trdSubType);
    }

    private int secondaryTrdType = MISSING_INT;

    private boolean hasSecondaryTrdType;

    public int secondaryTrdType()
    {
        if (!hasSecondaryTrdType)
        {
            throw new IllegalArgumentException("No value for optional field: SecondaryTrdType");
        }

        return secondaryTrdType;
    }

    public boolean hasSecondaryTrdType()
    {
        return hasSecondaryTrdType;
    }



    private char tradeHandlingInstr = MISSING_CHAR;

    private boolean hasTradeHandlingInstr;

    public char tradeHandlingInstr()
    {
        if (!hasTradeHandlingInstr)
        {
            throw new IllegalArgumentException("No value for optional field: TradeHandlingInstr");
        }

        return tradeHandlingInstr;
    }

    public boolean hasTradeHandlingInstr()
    {
        return hasTradeHandlingInstr;
    }



    private final CharArrayWrapper tradeHandlingInstrWrapper = new CharArrayWrapper();
    public TradeHandlingInstr tradeHandlingInstrAsEnum()
    {
        if (!hasTradeHandlingInstr)
 return TradeHandlingInstr.NULL_VAL;
        return TradeHandlingInstr.decode(tradeHandlingInstr);
    }

    private char origTradeHandlingInstr = MISSING_CHAR;

    private boolean hasOrigTradeHandlingInstr;

    public char origTradeHandlingInstr()
    {
        if (!hasOrigTradeHandlingInstr)
        {
            throw new IllegalArgumentException("No value for optional field: OrigTradeHandlingInstr");
        }

        return origTradeHandlingInstr;
    }

    public boolean hasOrigTradeHandlingInstr()
    {
        return hasOrigTradeHandlingInstr;
    }



    private byte[] origTradeDate = new byte[8];

    private boolean hasOrigTradeDate;

    public byte[] origTradeDate()
    {
        if (!hasOrigTradeDate)
        {
            throw new IllegalArgumentException("No value for optional field: OrigTradeDate");
        }

        return origTradeDate;
    }

    public boolean hasOrigTradeDate()
    {
        return hasOrigTradeDate;
    }


    private int origTradeDateOffset;

    private int origTradeDateLength;

    public int origTradeDateLength()
    {
        if (!hasOrigTradeDate)
        {
            throw new IllegalArgumentException("No value for optional field: OrigTradeDate");
        }

        return origTradeDateLength;
    }

    public String origTradeDateAsString()
    {
        return hasOrigTradeDate ? new String(origTradeDate, 0, origTradeDateLength) : null;
    }

    public void origTradeDate(final AsciiSequenceView view)
    {
        if (!hasOrigTradeDate)
        {
            throw new IllegalArgumentException("No value for optional field: OrigTradeDate");
        }

        view.wrap(buffer, origTradeDateOffset, origTradeDateLength);
    }


    private char[] origTradeID = new char[1];

    private boolean hasOrigTradeID;

    public char[] origTradeID()
    {
        if (!hasOrigTradeID)
        {
            throw new IllegalArgumentException("No value for optional field: OrigTradeID");
        }

        return origTradeID;
    }

    public boolean hasOrigTradeID()
    {
        return hasOrigTradeID;
    }


    private int origTradeIDOffset;

    private int origTradeIDLength;

    public int origTradeIDLength()
    {
        if (!hasOrigTradeID)
        {
            throw new IllegalArgumentException("No value for optional field: OrigTradeID");
        }

        return origTradeIDLength;
    }

    public String origTradeIDAsString()
    {
        return hasOrigTradeID ? new String(origTradeID, 0, origTradeIDLength) : null;
    }

    public void origTradeID(final AsciiSequenceView view)
    {
        if (!hasOrigTradeID)
        {
            throw new IllegalArgumentException("No value for optional field: OrigTradeID");
        }

        view.wrap(buffer, origTradeIDOffset, origTradeIDLength);
    }


    private final CharArrayWrapper origTradeIDWrapper = new CharArrayWrapper();
    private char[] origSecondaryTradeID = new char[1];

    private boolean hasOrigSecondaryTradeID;

    public char[] origSecondaryTradeID()
    {
        if (!hasOrigSecondaryTradeID)
        {
            throw new IllegalArgumentException("No value for optional field: OrigSecondaryTradeID");
        }

        return origSecondaryTradeID;
    }

    public boolean hasOrigSecondaryTradeID()
    {
        return hasOrigSecondaryTradeID;
    }


    private int origSecondaryTradeIDOffset;

    private int origSecondaryTradeIDLength;

    public int origSecondaryTradeIDLength()
    {
        if (!hasOrigSecondaryTradeID)
        {
            throw new IllegalArgumentException("No value for optional field: OrigSecondaryTradeID");
        }

        return origSecondaryTradeIDLength;
    }

    public String origSecondaryTradeIDAsString()
    {
        return hasOrigSecondaryTradeID ? new String(origSecondaryTradeID, 0, origSecondaryTradeIDLength) : null;
    }

    public void origSecondaryTradeID(final AsciiSequenceView view)
    {
        if (!hasOrigSecondaryTradeID)
        {
            throw new IllegalArgumentException("No value for optional field: OrigSecondaryTradeID");
        }

        view.wrap(buffer, origSecondaryTradeIDOffset, origSecondaryTradeIDLength);
    }


    private final CharArrayWrapper origSecondaryTradeIDWrapper = new CharArrayWrapper();
    private char[] transferReason = new char[1];

    private boolean hasTransferReason;

    public char[] transferReason()
    {
        if (!hasTransferReason)
        {
            throw new IllegalArgumentException("No value for optional field: TransferReason");
        }

        return transferReason;
    }

    public boolean hasTransferReason()
    {
        return hasTransferReason;
    }


    private int transferReasonOffset;

    private int transferReasonLength;

    public int transferReasonLength()
    {
        if (!hasTransferReason)
        {
            throw new IllegalArgumentException("No value for optional field: TransferReason");
        }

        return transferReasonLength;
    }

    public String transferReasonAsString()
    {
        return hasTransferReason ? new String(transferReason, 0, transferReasonLength) : null;
    }

    public void transferReason(final AsciiSequenceView view)
    {
        if (!hasTransferReason)
        {
            throw new IllegalArgumentException("No value for optional field: TransferReason");
        }

        view.wrap(buffer, transferReasonOffset, transferReasonLength);
    }


    private final CharArrayWrapper transferReasonWrapper = new CharArrayWrapper();


    private RootPartyIDsGroupDecoder rootPartyIDsGroup = null;
    public RootPartyIDsGroupDecoder rootPartyIDsGroup()
    {
        return rootPartyIDsGroup;
    }

    private int noRootPartyIDsGroupCounter = MISSING_INT;

    private boolean hasNoRootPartyIDsGroupCounter;

    public int noRootPartyIDsGroupCounter()
    {
        if (!hasNoRootPartyIDsGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoRootPartyIDsGroupCounter");
        }

        return noRootPartyIDsGroupCounter;
    }

    public boolean hasNoRootPartyIDsGroupCounter()
    {
        return hasNoRootPartyIDsGroupCounter;
    }




    private RootPartyIDsGroupIterator rootPartyIDsGroupIterator = new RootPartyIDsGroupIterator(this);
    public RootPartyIDsGroupIterator rootPartyIDsGroupIterator()
    {
        return rootPartyIDsGroupIterator.iterator();
    }


    private char execType = MISSING_CHAR;

    private boolean hasExecType;

    public char execType()
    {
        if (!hasExecType)
        {
            throw new IllegalArgumentException("No value for optional field: ExecType");
        }

        return execType;
    }

    public boolean hasExecType()
    {
        return hasExecType;
    }



    private final CharArrayWrapper execTypeWrapper = new CharArrayWrapper();
    public ExecType execTypeAsEnum()
    {
        if (!hasExecType)
 return ExecType.NULL_VAL;
        return ExecType.decode(execType);
    }

    private char[] tradeReportRefID = new char[1];

    private boolean hasTradeReportRefID;

    public char[] tradeReportRefID()
    {
        if (!hasTradeReportRefID)
        {
            throw new IllegalArgumentException("No value for optional field: TradeReportRefID");
        }

        return tradeReportRefID;
    }

    public boolean hasTradeReportRefID()
    {
        return hasTradeReportRefID;
    }


    private int tradeReportRefIDOffset;

    private int tradeReportRefIDLength;

    public int tradeReportRefIDLength()
    {
        if (!hasTradeReportRefID)
        {
            throw new IllegalArgumentException("No value for optional field: TradeReportRefID");
        }

        return tradeReportRefIDLength;
    }

    public String tradeReportRefIDAsString()
    {
        return hasTradeReportRefID ? new String(tradeReportRefID, 0, tradeReportRefIDLength) : null;
    }

    public void tradeReportRefID(final AsciiSequenceView view)
    {
        if (!hasTradeReportRefID)
        {
            throw new IllegalArgumentException("No value for optional field: TradeReportRefID");
        }

        view.wrap(buffer, tradeReportRefIDOffset, tradeReportRefIDLength);
    }


    private final CharArrayWrapper tradeReportRefIDWrapper = new CharArrayWrapper();
    private char[] secondaryTradeReportRefID = new char[1];

    private boolean hasSecondaryTradeReportRefID;

    public char[] secondaryTradeReportRefID()
    {
        if (!hasSecondaryTradeReportRefID)
        {
            throw new IllegalArgumentException("No value for optional field: SecondaryTradeReportRefID");
        }

        return secondaryTradeReportRefID;
    }

    public boolean hasSecondaryTradeReportRefID()
    {
        return hasSecondaryTradeReportRefID;
    }


    private int secondaryTradeReportRefIDOffset;

    private int secondaryTradeReportRefIDLength;

    public int secondaryTradeReportRefIDLength()
    {
        if (!hasSecondaryTradeReportRefID)
        {
            throw new IllegalArgumentException("No value for optional field: SecondaryTradeReportRefID");
        }

        return secondaryTradeReportRefIDLength;
    }

    public String secondaryTradeReportRefIDAsString()
    {
        return hasSecondaryTradeReportRefID ? new String(secondaryTradeReportRefID, 0, secondaryTradeReportRefIDLength) : null;
    }

    public void secondaryTradeReportRefID(final AsciiSequenceView view)
    {
        if (!hasSecondaryTradeReportRefID)
        {
            throw new IllegalArgumentException("No value for optional field: SecondaryTradeReportRefID");
        }

        view.wrap(buffer, secondaryTradeReportRefIDOffset, secondaryTradeReportRefIDLength);
    }


    private final CharArrayWrapper secondaryTradeReportRefIDWrapper = new CharArrayWrapper();
    private int trdRptStatus = MISSING_INT;

    private boolean hasTrdRptStatus;

    public int trdRptStatus()
    {
        if (!hasTrdRptStatus)
        {
            throw new IllegalArgumentException("No value for optional field: TrdRptStatus");
        }

        return trdRptStatus;
    }

    public boolean hasTrdRptStatus()
    {
        return hasTrdRptStatus;
    }



    private final CharArrayWrapper trdRptStatusWrapper = new CharArrayWrapper();
    public TrdRptStatus trdRptStatusAsEnum()
    {
        if (!hasTrdRptStatus)
 return TrdRptStatus.NULL_VAL;
        return TrdRptStatus.decode(trdRptStatus);
    }

    private int tradeReportRejectReason = MISSING_INT;

    private boolean hasTradeReportRejectReason;

    public int tradeReportRejectReason()
    {
        if (!hasTradeReportRejectReason)
        {
            throw new IllegalArgumentException("No value for optional field: TradeReportRejectReason");
        }

        return tradeReportRejectReason;
    }

    public boolean hasTradeReportRejectReason()
    {
        return hasTradeReportRejectReason;
    }



    private final CharArrayWrapper tradeReportRejectReasonWrapper = new CharArrayWrapper();
    public TradeReportRejectReason tradeReportRejectReasonAsEnum()
    {
        if (!hasTradeReportRejectReason)
 return TradeReportRejectReason.NULL_VAL;
        return TradeReportRejectReason.decode(tradeReportRejectReason);
    }

    private char[] secondaryTradeReportID = new char[1];

    private boolean hasSecondaryTradeReportID;

    public char[] secondaryTradeReportID()
    {
        if (!hasSecondaryTradeReportID)
        {
            throw new IllegalArgumentException("No value for optional field: SecondaryTradeReportID");
        }

        return secondaryTradeReportID;
    }

    public boolean hasSecondaryTradeReportID()
    {
        return hasSecondaryTradeReportID;
    }


    private int secondaryTradeReportIDOffset;

    private int secondaryTradeReportIDLength;

    public int secondaryTradeReportIDLength()
    {
        if (!hasSecondaryTradeReportID)
        {
            throw new IllegalArgumentException("No value for optional field: SecondaryTradeReportID");
        }

        return secondaryTradeReportIDLength;
    }

    public String secondaryTradeReportIDAsString()
    {
        return hasSecondaryTradeReportID ? new String(secondaryTradeReportID, 0, secondaryTradeReportIDLength) : null;
    }

    public void secondaryTradeReportID(final AsciiSequenceView view)
    {
        if (!hasSecondaryTradeReportID)
        {
            throw new IllegalArgumentException("No value for optional field: SecondaryTradeReportID");
        }

        view.wrap(buffer, secondaryTradeReportIDOffset, secondaryTradeReportIDLength);
    }


    private final CharArrayWrapper secondaryTradeReportIDWrapper = new CharArrayWrapper();
    private char subscriptionRequestType = MISSING_CHAR;

    private boolean hasSubscriptionRequestType;

    public char subscriptionRequestType()
    {
        if (!hasSubscriptionRequestType)
        {
            throw new IllegalArgumentException("No value for optional field: SubscriptionRequestType");
        }

        return subscriptionRequestType;
    }

    public boolean hasSubscriptionRequestType()
    {
        return hasSubscriptionRequestType;
    }



    private final CharArrayWrapper subscriptionRequestTypeWrapper = new CharArrayWrapper();
    public SubscriptionRequestType subscriptionRequestTypeAsEnum()
    {
        if (!hasSubscriptionRequestType)
 return SubscriptionRequestType.NULL_VAL;
        return SubscriptionRequestType.decode(subscriptionRequestType);
    }

    private char[] tradeLinkID = new char[1];

    private boolean hasTradeLinkID;

    public char[] tradeLinkID()
    {
        if (!hasTradeLinkID)
        {
            throw new IllegalArgumentException("No value for optional field: TradeLinkID");
        }

        return tradeLinkID;
    }

    public boolean hasTradeLinkID()
    {
        return hasTradeLinkID;
    }


    private int tradeLinkIDOffset;

    private int tradeLinkIDLength;

    public int tradeLinkIDLength()
    {
        if (!hasTradeLinkID)
        {
            throw new IllegalArgumentException("No value for optional field: TradeLinkID");
        }

        return tradeLinkIDLength;
    }

    public String tradeLinkIDAsString()
    {
        return hasTradeLinkID ? new String(tradeLinkID, 0, tradeLinkIDLength) : null;
    }

    public void tradeLinkID(final AsciiSequenceView view)
    {
        if (!hasTradeLinkID)
        {
            throw new IllegalArgumentException("No value for optional field: TradeLinkID");
        }

        view.wrap(buffer, tradeLinkIDOffset, tradeLinkIDLength);
    }


    private final CharArrayWrapper tradeLinkIDWrapper = new CharArrayWrapper();
    private char[] trdMatchID = new char[1];

    private boolean hasTrdMatchID;

    public char[] trdMatchID()
    {
        if (!hasTrdMatchID)
        {
            throw new IllegalArgumentException("No value for optional field: TrdMatchID");
        }

        return trdMatchID;
    }

    public boolean hasTrdMatchID()
    {
        return hasTrdMatchID;
    }


    private int trdMatchIDOffset;

    private int trdMatchIDLength;

    public int trdMatchIDLength()
    {
        if (!hasTrdMatchID)
        {
            throw new IllegalArgumentException("No value for optional field: TrdMatchID");
        }

        return trdMatchIDLength;
    }

    public String trdMatchIDAsString()
    {
        return hasTrdMatchID ? new String(trdMatchID, 0, trdMatchIDLength) : null;
    }

    public void trdMatchID(final AsciiSequenceView view)
    {
        if (!hasTrdMatchID)
        {
            throw new IllegalArgumentException("No value for optional field: TrdMatchID");
        }

        view.wrap(buffer, trdMatchIDOffset, trdMatchIDLength);
    }


    private final CharArrayWrapper trdMatchIDWrapper = new CharArrayWrapper();
    private char[] execID = new char[1];

    private boolean hasExecID;

    public char[] execID()
    {
        if (!hasExecID)
        {
            throw new IllegalArgumentException("No value for optional field: ExecID");
        }

        return execID;
    }

    public boolean hasExecID()
    {
        return hasExecID;
    }


    private int execIDOffset;

    private int execIDLength;

    public int execIDLength()
    {
        if (!hasExecID)
        {
            throw new IllegalArgumentException("No value for optional field: ExecID");
        }

        return execIDLength;
    }

    public String execIDAsString()
    {
        return hasExecID ? new String(execID, 0, execIDLength) : null;
    }

    public void execID(final AsciiSequenceView view)
    {
        if (!hasExecID)
        {
            throw new IllegalArgumentException("No value for optional field: ExecID");
        }

        view.wrap(buffer, execIDOffset, execIDLength);
    }


    private final CharArrayWrapper execIDWrapper = new CharArrayWrapper();
    private char[] secondaryExecID = new char[1];

    private boolean hasSecondaryExecID;

    public char[] secondaryExecID()
    {
        if (!hasSecondaryExecID)
        {
            throw new IllegalArgumentException("No value for optional field: SecondaryExecID");
        }

        return secondaryExecID;
    }

    public boolean hasSecondaryExecID()
    {
        return hasSecondaryExecID;
    }


    private int secondaryExecIDOffset;

    private int secondaryExecIDLength;

    public int secondaryExecIDLength()
    {
        if (!hasSecondaryExecID)
        {
            throw new IllegalArgumentException("No value for optional field: SecondaryExecID");
        }

        return secondaryExecIDLength;
    }

    public String secondaryExecIDAsString()
    {
        return hasSecondaryExecID ? new String(secondaryExecID, 0, secondaryExecIDLength) : null;
    }

    public void secondaryExecID(final AsciiSequenceView view)
    {
        if (!hasSecondaryExecID)
        {
            throw new IllegalArgumentException("No value for optional field: SecondaryExecID");
        }

        view.wrap(buffer, secondaryExecIDOffset, secondaryExecIDLength);
    }


    private final CharArrayWrapper secondaryExecIDWrapper = new CharArrayWrapper();
    private int execRestatementReason = MISSING_INT;

    private boolean hasExecRestatementReason;

    public int execRestatementReason()
    {
        if (!hasExecRestatementReason)
        {
            throw new IllegalArgumentException("No value for optional field: ExecRestatementReason");
        }

        return execRestatementReason;
    }

    public boolean hasExecRestatementReason()
    {
        return hasExecRestatementReason;
    }



    private final CharArrayWrapper execRestatementReasonWrapper = new CharArrayWrapper();
    public ExecRestatementReason execRestatementReasonAsEnum()
    {
        if (!hasExecRestatementReason)
 return ExecRestatementReason.NULL_VAL;
        return ExecRestatementReason.decode(execRestatementReason);
    }

    private boolean previouslyReported;

    private boolean hasPreviouslyReported;

    public boolean previouslyReported()
    {
        if (!hasPreviouslyReported)
        {
            throw new IllegalArgumentException("No value for optional field: PreviouslyReported");
        }

        return previouslyReported;
    }

    public boolean hasPreviouslyReported()
    {
        return hasPreviouslyReported;
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

    private char[] underlyingTradingSessionID = new char[1];

    private boolean hasUnderlyingTradingSessionID;

    public char[] underlyingTradingSessionID()
    {
        if (!hasUnderlyingTradingSessionID)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingTradingSessionID");
        }

        return underlyingTradingSessionID;
    }

    public boolean hasUnderlyingTradingSessionID()
    {
        return hasUnderlyingTradingSessionID;
    }


    private int underlyingTradingSessionIDOffset;

    private int underlyingTradingSessionIDLength;

    public int underlyingTradingSessionIDLength()
    {
        if (!hasUnderlyingTradingSessionID)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingTradingSessionID");
        }

        return underlyingTradingSessionIDLength;
    }

    public String underlyingTradingSessionIDAsString()
    {
        return hasUnderlyingTradingSessionID ? new String(underlyingTradingSessionID, 0, underlyingTradingSessionIDLength) : null;
    }

    public void underlyingTradingSessionID(final AsciiSequenceView view)
    {
        if (!hasUnderlyingTradingSessionID)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingTradingSessionID");
        }

        view.wrap(buffer, underlyingTradingSessionIDOffset, underlyingTradingSessionIDLength);
    }


    private final CharArrayWrapper underlyingTradingSessionIDWrapper = new CharArrayWrapper();
    private char[] underlyingTradingSessionSubID = new char[1];

    private boolean hasUnderlyingTradingSessionSubID;

    public char[] underlyingTradingSessionSubID()
    {
        if (!hasUnderlyingTradingSessionSubID)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingTradingSessionSubID");
        }

        return underlyingTradingSessionSubID;
    }

    public boolean hasUnderlyingTradingSessionSubID()
    {
        return hasUnderlyingTradingSessionSubID;
    }


    private int underlyingTradingSessionSubIDOffset;

    private int underlyingTradingSessionSubIDLength;

    public int underlyingTradingSessionSubIDLength()
    {
        if (!hasUnderlyingTradingSessionSubID)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingTradingSessionSubID");
        }

        return underlyingTradingSessionSubIDLength;
    }

    public String underlyingTradingSessionSubIDAsString()
    {
        return hasUnderlyingTradingSessionSubID ? new String(underlyingTradingSessionSubID, 0, underlyingTradingSessionSubIDLength) : null;
    }

    public void underlyingTradingSessionSubID(final AsciiSequenceView view)
    {
        if (!hasUnderlyingTradingSessionSubID)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingTradingSessionSubID");
        }

        view.wrap(buffer, underlyingTradingSessionSubIDOffset, underlyingTradingSessionSubIDLength);
    }


    private final CharArrayWrapper underlyingTradingSessionSubIDWrapper = new CharArrayWrapper();
    private char[] settlSessID = new char[1];

    private boolean hasSettlSessID;

    public char[] settlSessID()
    {
        if (!hasSettlSessID)
        {
            throw new IllegalArgumentException("No value for optional field: SettlSessID");
        }

        return settlSessID;
    }

    public boolean hasSettlSessID()
    {
        return hasSettlSessID;
    }


    private int settlSessIDOffset;

    private int settlSessIDLength;

    public int settlSessIDLength()
    {
        if (!hasSettlSessID)
        {
            throw new IllegalArgumentException("No value for optional field: SettlSessID");
        }

        return settlSessIDLength;
    }

    public String settlSessIDAsString()
    {
        return hasSettlSessID ? new String(settlSessID, 0, settlSessIDLength) : null;
    }

    public void settlSessID(final AsciiSequenceView view)
    {
        if (!hasSettlSessID)
        {
            throw new IllegalArgumentException("No value for optional field: SettlSessID");
        }

        view.wrap(buffer, settlSessIDOffset, settlSessIDLength);
    }


    private final CharArrayWrapper settlSessIDWrapper = new CharArrayWrapper();
    public SettlSessID settlSessIDAsEnum()
    {
        if (!hasSettlSessID)
 return SettlSessID.NULL_VAL;
        settlSessIDWrapper.wrap(this.settlSessID(), settlSessIDLength);
        return SettlSessID.decode(settlSessIDWrapper);
    }

    private char[] settlSessSubID = new char[1];

    private boolean hasSettlSessSubID;

    public char[] settlSessSubID()
    {
        if (!hasSettlSessSubID)
        {
            throw new IllegalArgumentException("No value for optional field: SettlSessSubID");
        }

        return settlSessSubID;
    }

    public boolean hasSettlSessSubID()
    {
        return hasSettlSessSubID;
    }


    private int settlSessSubIDOffset;

    private int settlSessSubIDLength;

    public int settlSessSubIDLength()
    {
        if (!hasSettlSessSubID)
        {
            throw new IllegalArgumentException("No value for optional field: SettlSessSubID");
        }

        return settlSessSubIDLength;
    }

    public String settlSessSubIDAsString()
    {
        return hasSettlSessSubID ? new String(settlSessSubID, 0, settlSessSubIDLength) : null;
    }

    public void settlSessSubID(final AsciiSequenceView view)
    {
        if (!hasSettlSessSubID)
        {
            throw new IllegalArgumentException("No value for optional field: SettlSessSubID");
        }

        view.wrap(buffer, settlSessSubIDOffset, settlSessSubIDLength);
    }


    private final CharArrayWrapper settlSessSubIDWrapper = new CharArrayWrapper();
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

    private DecimalFloat lastQty = DecimalFloat.newNaNValue();

    private boolean hasLastQty;

    public DecimalFloat lastQty()
    {
        if (!hasLastQty)
        {
            throw new IllegalArgumentException("No value for optional field: LastQty");
        }

        return lastQty;
    }

    public boolean hasLastQty()
    {
        return hasLastQty;
    }



    private DecimalFloat lastPx = DecimalFloat.newNaNValue();

    private boolean hasLastPx;

    public DecimalFloat lastPx()
    {
        if (!hasLastPx)
        {
            throw new IllegalArgumentException("No value for optional field: LastPx");
        }

        return lastPx;
    }

    public boolean hasLastPx()
    {
        return hasLastPx;
    }



    private char venueType = MISSING_CHAR;

    private boolean hasVenueType;

    public char venueType()
    {
        if (!hasVenueType)
        {
            throw new IllegalArgumentException("No value for optional field: VenueType");
        }

        return venueType;
    }

    public boolean hasVenueType()
    {
        return hasVenueType;
    }



    private final CharArrayWrapper venueTypeWrapper = new CharArrayWrapper();
    public VenueType venueTypeAsEnum()
    {
        if (!hasVenueType)
 return VenueType.NULL_VAL;
        return VenueType.decode(venueType);
    }

    private char[] marketSegmentID = new char[1];

    private boolean hasMarketSegmentID;

    public char[] marketSegmentID()
    {
        if (!hasMarketSegmentID)
        {
            throw new IllegalArgumentException("No value for optional field: MarketSegmentID");
        }

        return marketSegmentID;
    }

    public boolean hasMarketSegmentID()
    {
        return hasMarketSegmentID;
    }


    private int marketSegmentIDOffset;

    private int marketSegmentIDLength;

    public int marketSegmentIDLength()
    {
        if (!hasMarketSegmentID)
        {
            throw new IllegalArgumentException("No value for optional field: MarketSegmentID");
        }

        return marketSegmentIDLength;
    }

    public String marketSegmentIDAsString()
    {
        return hasMarketSegmentID ? new String(marketSegmentID, 0, marketSegmentIDLength) : null;
    }

    public void marketSegmentID(final AsciiSequenceView view)
    {
        if (!hasMarketSegmentID)
        {
            throw new IllegalArgumentException("No value for optional field: MarketSegmentID");
        }

        view.wrap(buffer, marketSegmentIDOffset, marketSegmentIDLength);
    }


    private final CharArrayWrapper marketSegmentIDWrapper = new CharArrayWrapper();
    private char[] marketID = new char[1];

    private boolean hasMarketID;

    public char[] marketID()
    {
        if (!hasMarketID)
        {
            throw new IllegalArgumentException("No value for optional field: MarketID");
        }

        return marketID;
    }

    public boolean hasMarketID()
    {
        return hasMarketID;
    }


    private int marketIDOffset;

    private int marketIDLength;

    public int marketIDLength()
    {
        if (!hasMarketID)
        {
            throw new IllegalArgumentException("No value for optional field: MarketID");
        }

        return marketIDLength;
    }

    public String marketIDAsString()
    {
        return hasMarketID ? new String(marketID, 0, marketIDLength) : null;
    }

    public void marketID(final AsciiSequenceView view)
    {
        if (!hasMarketID)
        {
            throw new IllegalArgumentException("No value for optional field: MarketID");
        }

        view.wrap(buffer, marketIDOffset, marketIDLength);
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



    private DecimalFloat lastParPx = DecimalFloat.newNaNValue();

    private boolean hasLastParPx;

    public DecimalFloat lastParPx()
    {
        if (!hasLastParPx)
        {
            throw new IllegalArgumentException("No value for optional field: LastParPx");
        }

        return lastParPx;
    }

    public boolean hasLastParPx()
    {
        return hasLastParPx;
    }



    private DecimalFloat calculatedCcyLastQty = DecimalFloat.newNaNValue();

    private boolean hasCalculatedCcyLastQty;

    public DecimalFloat calculatedCcyLastQty()
    {
        if (!hasCalculatedCcyLastQty)
        {
            throw new IllegalArgumentException("No value for optional field: CalculatedCcyLastQty");
        }

        return calculatedCcyLastQty;
    }

    public boolean hasCalculatedCcyLastQty()
    {
        return hasCalculatedCcyLastQty;
    }



    private DecimalFloat lastSwapPoints = DecimalFloat.newNaNValue();

    private boolean hasLastSwapPoints;

    public DecimalFloat lastSwapPoints()
    {
        if (!hasLastSwapPoints)
        {
            throw new IllegalArgumentException("No value for optional field: LastSwapPoints");
        }

        return lastSwapPoints;
    }

    public boolean hasLastSwapPoints()
    {
        return hasLastSwapPoints;
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


    private DecimalFloat lastSpotRate = DecimalFloat.newNaNValue();

    private boolean hasLastSpotRate;

    public DecimalFloat lastSpotRate()
    {
        if (!hasLastSpotRate)
        {
            throw new IllegalArgumentException("No value for optional field: LastSpotRate");
        }

        return lastSpotRate;
    }

    public boolean hasLastSpotRate()
    {
        return hasLastSpotRate;
    }



    private DecimalFloat lastForwardPoints = DecimalFloat.newNaNValue();

    private boolean hasLastForwardPoints;

    public DecimalFloat lastForwardPoints()
    {
        if (!hasLastForwardPoints)
        {
            throw new IllegalArgumentException("No value for optional field: LastForwardPoints");
        }

        return lastForwardPoints;
    }

    public boolean hasLastForwardPoints()
    {
        return hasLastForwardPoints;
    }



    private char[] lastMkt = new char[1];

    private boolean hasLastMkt;

    public char[] lastMkt()
    {
        if (!hasLastMkt)
        {
            throw new IllegalArgumentException("No value for optional field: LastMkt");
        }

        return lastMkt;
    }

    public boolean hasLastMkt()
    {
        return hasLastMkt;
    }


    private int lastMktOffset;

    private int lastMktLength;

    public int lastMktLength()
    {
        if (!hasLastMkt)
        {
            throw new IllegalArgumentException("No value for optional field: LastMkt");
        }

        return lastMktLength;
    }

    public String lastMktAsString()
    {
        return hasLastMkt ? new String(lastMkt, 0, lastMktLength) : null;
    }

    public void lastMkt(final AsciiSequenceView view)
    {
        if (!hasLastMkt)
        {
            throw new IllegalArgumentException("No value for optional field: LastMkt");
        }

        view.wrap(buffer, lastMktOffset, lastMktLength);
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


    private byte[] clearingBusinessDate = new byte[8];

    private boolean hasClearingBusinessDate;

    public byte[] clearingBusinessDate()
    {
        if (!hasClearingBusinessDate)
        {
            throw new IllegalArgumentException("No value for optional field: ClearingBusinessDate");
        }

        return clearingBusinessDate;
    }

    public boolean hasClearingBusinessDate()
    {
        return hasClearingBusinessDate;
    }


    private int clearingBusinessDateOffset;

    private int clearingBusinessDateLength;

    public int clearingBusinessDateLength()
    {
        if (!hasClearingBusinessDate)
        {
            throw new IllegalArgumentException("No value for optional field: ClearingBusinessDate");
        }

        return clearingBusinessDateLength;
    }

    public String clearingBusinessDateAsString()
    {
        return hasClearingBusinessDate ? new String(clearingBusinessDate, 0, clearingBusinessDateLength) : null;
    }

    public void clearingBusinessDate(final AsciiSequenceView view)
    {
        if (!hasClearingBusinessDate)
        {
            throw new IllegalArgumentException("No value for optional field: ClearingBusinessDate");
        }

        view.wrap(buffer, clearingBusinessDateOffset, clearingBusinessDateLength);
    }


    private DecimalFloat avgPx = DecimalFloat.newNaNValue();

    private boolean hasAvgPx;

    public DecimalFloat avgPx()
    {
        if (!hasAvgPx)
        {
            throw new IllegalArgumentException("No value for optional field: AvgPx");
        }

        return avgPx;
    }

    public boolean hasAvgPx()
    {
        return hasAvgPx;
    }



    private int avgPxIndicator = MISSING_INT;

    private boolean hasAvgPxIndicator;

    public int avgPxIndicator()
    {
        if (!hasAvgPxIndicator)
        {
            throw new IllegalArgumentException("No value for optional field: AvgPxIndicator");
        }

        return avgPxIndicator;
    }

    public boolean hasAvgPxIndicator()
    {
        return hasAvgPxIndicator;
    }



    private final CharArrayWrapper avgPxIndicatorWrapper = new CharArrayWrapper();
    public AvgPxIndicator avgPxIndicatorAsEnum()
    {
        if (!hasAvgPxIndicator)
 return AvgPxIndicator.NULL_VAL;
        return AvgPxIndicator.decode(avgPxIndicator);
    }

    private char multiLegReportingType = MISSING_CHAR;

    private boolean hasMultiLegReportingType;

    public char multiLegReportingType()
    {
        if (!hasMultiLegReportingType)
        {
            throw new IllegalArgumentException("No value for optional field: MultiLegReportingType");
        }

        return multiLegReportingType;
    }

    public boolean hasMultiLegReportingType()
    {
        return hasMultiLegReportingType;
    }



    private final CharArrayWrapper multiLegReportingTypeWrapper = new CharArrayWrapper();
    public MultiLegReportingType multiLegReportingTypeAsEnum()
    {
        if (!hasMultiLegReportingType)
 return MultiLegReportingType.NULL_VAL;
        return MultiLegReportingType.decode(multiLegReportingType);
    }

    private char[] tradeLegRefID = new char[1];

    private boolean hasTradeLegRefID;

    public char[] tradeLegRefID()
    {
        if (!hasTradeLegRefID)
        {
            throw new IllegalArgumentException("No value for optional field: TradeLegRefID");
        }

        return tradeLegRefID;
    }

    public boolean hasTradeLegRefID()
    {
        return hasTradeLegRefID;
    }


    private int tradeLegRefIDOffset;

    private int tradeLegRefIDLength;

    public int tradeLegRefIDLength()
    {
        if (!hasTradeLegRefID)
        {
            throw new IllegalArgumentException("No value for optional field: TradeLegRefID");
        }

        return tradeLegRefIDLength;
    }

    public String tradeLegRefIDAsString()
    {
        return hasTradeLegRefID ? new String(tradeLegRefID, 0, tradeLegRefIDLength) : null;
    }

    public void tradeLegRefID(final AsciiSequenceView view)
    {
        if (!hasTradeLegRefID)
        {
            throw new IllegalArgumentException("No value for optional field: TradeLegRefID");
        }

        view.wrap(buffer, tradeLegRefIDOffset, tradeLegRefIDLength);
    }


    private final CharArrayWrapper tradeLegRefIDWrapper = new CharArrayWrapper();
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


    private char matchStatus = MISSING_CHAR;

    private boolean hasMatchStatus;

    public char matchStatus()
    {
        if (!hasMatchStatus)
        {
            throw new IllegalArgumentException("No value for optional field: MatchStatus");
        }

        return matchStatus;
    }

    public boolean hasMatchStatus()
    {
        return hasMatchStatus;
    }



    private final CharArrayWrapper matchStatusWrapper = new CharArrayWrapper();
    public MatchStatus matchStatusAsEnum()
    {
        if (!hasMatchStatus)
 return MatchStatus.NULL_VAL;
        return MatchStatus.decode(matchStatus);
    }

    private char[] matchType = new char[1];

    private boolean hasMatchType;

    public char[] matchType()
    {
        if (!hasMatchType)
        {
            throw new IllegalArgumentException("No value for optional field: MatchType");
        }

        return matchType;
    }

    public boolean hasMatchType()
    {
        return hasMatchType;
    }


    private int matchTypeOffset;

    private int matchTypeLength;

    public int matchTypeLength()
    {
        if (!hasMatchType)
        {
            throw new IllegalArgumentException("No value for optional field: MatchType");
        }

        return matchTypeLength;
    }

    public String matchTypeAsString()
    {
        return hasMatchType ? new String(matchType, 0, matchTypeLength) : null;
    }

    public void matchType(final AsciiSequenceView view)
    {
        if (!hasMatchType)
        {
            throw new IllegalArgumentException("No value for optional field: MatchType");
        }

        view.wrap(buffer, matchTypeOffset, matchTypeLength);
    }


    private final CharArrayWrapper matchTypeWrapper = new CharArrayWrapper();
    public MatchType matchTypeAsEnum()
    {
        if (!hasMatchType)
 return MatchType.NULL_VAL;
        matchTypeWrapper.wrap(this.matchType(), matchTypeLength);
        return MatchType.decode(matchTypeWrapper);
    }

    private boolean copyMsgIndicator;

    private boolean hasCopyMsgIndicator;

    public boolean copyMsgIndicator()
    {
        if (!hasCopyMsgIndicator)
        {
            throw new IllegalArgumentException("No value for optional field: CopyMsgIndicator");
        }

        return copyMsgIndicator;
    }

    public boolean hasCopyMsgIndicator()
    {
        return hasCopyMsgIndicator;
    }





    private TrdRepIndicatorsGroupDecoder trdRepIndicatorsGroup = null;
    public TrdRepIndicatorsGroupDecoder trdRepIndicatorsGroup()
    {
        return trdRepIndicatorsGroup;
    }

    private int noTrdRepIndicatorsGroupCounter = MISSING_INT;

    private boolean hasNoTrdRepIndicatorsGroupCounter;

    public int noTrdRepIndicatorsGroupCounter()
    {
        if (!hasNoTrdRepIndicatorsGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoTrdRepIndicatorsGroupCounter");
        }

        return noTrdRepIndicatorsGroupCounter;
    }

    public boolean hasNoTrdRepIndicatorsGroupCounter()
    {
        return hasNoTrdRepIndicatorsGroupCounter;
    }




    private TrdRepIndicatorsGroupIterator trdRepIndicatorsGroupIterator = new TrdRepIndicatorsGroupIterator(this);
    public TrdRepIndicatorsGroupIterator trdRepIndicatorsGroupIterator()
    {
        return trdRepIndicatorsGroupIterator.iterator();
    }


    private boolean publishTrdIndicator;

    private boolean hasPublishTrdIndicator;

    public boolean publishTrdIndicator()
    {
        if (!hasPublishTrdIndicator)
        {
            throw new IllegalArgumentException("No value for optional field: PublishTrdIndicator");
        }

        return publishTrdIndicator;
    }

    public boolean hasPublishTrdIndicator()
    {
        return hasPublishTrdIndicator;
    }



    private int tradePublishIndicator = MISSING_INT;

    private boolean hasTradePublishIndicator;

    public int tradePublishIndicator()
    {
        if (!hasTradePublishIndicator)
        {
            throw new IllegalArgumentException("No value for optional field: TradePublishIndicator");
        }

        return tradePublishIndicator;
    }

    public boolean hasTradePublishIndicator()
    {
        return hasTradePublishIndicator;
    }



    private final CharArrayWrapper tradePublishIndicatorWrapper = new CharArrayWrapper();
    public TradePublishIndicator tradePublishIndicatorAsEnum()
    {
        if (!hasTradePublishIndicator)
 return TradePublishIndicator.NULL_VAL;
        return TradePublishIndicator.decode(tradePublishIndicator);
    }

    private int shortSaleReason = MISSING_INT;

    private boolean hasShortSaleReason;

    public int shortSaleReason()
    {
        if (!hasShortSaleReason)
        {
            throw new IllegalArgumentException("No value for optional field: ShortSaleReason");
        }

        return shortSaleReason;
    }

    public boolean hasShortSaleReason()
    {
        return hasShortSaleReason;
    }



    private final CharArrayWrapper shortSaleReasonWrapper = new CharArrayWrapper();
    public ShortSaleReason shortSaleReasonAsEnum()
    {
        if (!hasShortSaleReason)
 return ShortSaleReason.NULL_VAL;
        return ShortSaleReason.decode(shortSaleReason);
    }



    private LegsGroupDecoder legsGroup = null;
    public LegsGroupDecoder legsGroup()
    {
        return legsGroup;
    }

    private int noLegsGroupCounter = MISSING_INT;

    private boolean hasNoLegsGroupCounter;

    public int noLegsGroupCounter()
    {
        if (!hasNoLegsGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoLegsGroupCounter");
        }

        return noLegsGroupCounter;
    }

    public boolean hasNoLegsGroupCounter()
    {
        return hasNoLegsGroupCounter;
    }




    private LegsGroupIterator legsGroupIterator = new LegsGroupIterator(this);
    public LegsGroupIterator legsGroupIterator()
    {
        return legsGroupIterator.iterator();
    }




    private TrdRegTimestampsGroupDecoder trdRegTimestampsGroup = null;
    public TrdRegTimestampsGroupDecoder trdRegTimestampsGroup()
    {
        return trdRegTimestampsGroup;
    }

    private int noTrdRegTimestampsGroupCounter = MISSING_INT;

    private boolean hasNoTrdRegTimestampsGroupCounter;

    public int noTrdRegTimestampsGroupCounter()
    {
        if (!hasNoTrdRegTimestampsGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoTrdRegTimestampsGroupCounter");
        }

        return noTrdRegTimestampsGroupCounter;
    }

    public boolean hasNoTrdRegTimestampsGroupCounter()
    {
        return hasNoTrdRegTimestampsGroupCounter;
    }




    private TrdRegTimestampsGroupIterator trdRegTimestampsGroupIterator = new TrdRegTimestampsGroupIterator(this);
    public TrdRegTimestampsGroupIterator trdRegTimestampsGroupIterator()
    {
        return trdRegTimestampsGroupIterator.iterator();
    }


    private int responseTransportType = MISSING_INT;

    private boolean hasResponseTransportType;

    public int responseTransportType()
    {
        if (!hasResponseTransportType)
        {
            throw new IllegalArgumentException("No value for optional field: ResponseTransportType");
        }

        return responseTransportType;
    }

    public boolean hasResponseTransportType()
    {
        return hasResponseTransportType;
    }



    private final CharArrayWrapper responseTransportTypeWrapper = new CharArrayWrapper();
    public ResponseTransportType responseTransportTypeAsEnum()
    {
        if (!hasResponseTransportType)
 return ResponseTransportType.NULL_VAL;
        return ResponseTransportType.decode(responseTransportType);
    }

    private char[] responseDestination = new char[1];

    private boolean hasResponseDestination;

    public char[] responseDestination()
    {
        if (!hasResponseDestination)
        {
            throw new IllegalArgumentException("No value for optional field: ResponseDestination");
        }

        return responseDestination;
    }

    public boolean hasResponseDestination()
    {
        return hasResponseDestination;
    }


    private int responseDestinationOffset;

    private int responseDestinationLength;

    public int responseDestinationLength()
    {
        if (!hasResponseDestination)
        {
            throw new IllegalArgumentException("No value for optional field: ResponseDestination");
        }

        return responseDestinationLength;
    }

    public String responseDestinationAsString()
    {
        return hasResponseDestination ? new String(responseDestination, 0, responseDestinationLength) : null;
    }

    public void responseDestination(final AsciiSequenceView view)
    {
        if (!hasResponseDestination)
        {
            throw new IllegalArgumentException("No value for optional field: ResponseDestination");
        }

        view.wrap(buffer, responseDestinationOffset, responseDestinationLength);
    }


    private final CharArrayWrapper responseDestinationWrapper = new CharArrayWrapper();
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



    private char asOfIndicator = MISSING_CHAR;

    private boolean hasAsOfIndicator;

    public char asOfIndicator()
    {
        if (!hasAsOfIndicator)
        {
            throw new IllegalArgumentException("No value for optional field: AsOfIndicator");
        }

        return asOfIndicator;
    }

    public boolean hasAsOfIndicator()
    {
        return hasAsOfIndicator;
    }



    private final CharArrayWrapper asOfIndicatorWrapper = new CharArrayWrapper();
    public AsOfIndicator asOfIndicatorAsEnum()
    {
        if (!hasAsOfIndicator)
 return AsOfIndicator.NULL_VAL;
        return AsOfIndicator.decode(asOfIndicator);
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



    private PosAmtGroupDecoder posAmtGroup = null;
    public PosAmtGroupDecoder posAmtGroup()
    {
        return posAmtGroup;
    }

    private int noPosAmtGroupCounter = MISSING_INT;

    private boolean hasNoPosAmtGroupCounter;

    public int noPosAmtGroupCounter()
    {
        if (!hasNoPosAmtGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoPosAmtGroupCounter");
        }

        return noPosAmtGroupCounter;
    }

    public boolean hasNoPosAmtGroupCounter()
    {
        return hasNoPosAmtGroupCounter;
    }




    private PosAmtGroupIterator posAmtGroupIterator = new PosAmtGroupIterator(this);
    public PosAmtGroupIterator posAmtGroupIterator()
    {
        return posAmtGroupIterator.iterator();
    }


    private char[] tierCode = new char[1];

    private boolean hasTierCode;

    public char[] tierCode()
    {
        if (!hasTierCode)
        {
            throw new IllegalArgumentException("No value for optional field: TierCode");
        }

        return tierCode;
    }

    public boolean hasTierCode()
    {
        return hasTierCode;
    }


    private int tierCodeOffset;

    private int tierCodeLength;

    public int tierCodeLength()
    {
        if (!hasTierCode)
        {
            throw new IllegalArgumentException("No value for optional field: TierCode");
        }

        return tierCodeLength;
    }

    public String tierCodeAsString()
    {
        return hasTierCode ? new String(tierCode, 0, tierCodeLength) : null;
    }

    public void tierCode(final AsciiSequenceView view)
    {
        if (!hasTierCode)
        {
            throw new IllegalArgumentException("No value for optional field: TierCode");
        }

        view.wrap(buffer, tierCodeOffset, tierCodeLength);
    }


    private final CharArrayWrapper tierCodeWrapper = new CharArrayWrapper();
    private char[] messageEventSource = new char[1];

    private boolean hasMessageEventSource;

    public char[] messageEventSource()
    {
        if (!hasMessageEventSource)
        {
            throw new IllegalArgumentException("No value for optional field: MessageEventSource");
        }

        return messageEventSource;
    }

    public boolean hasMessageEventSource()
    {
        return hasMessageEventSource;
    }


    private int messageEventSourceOffset;

    private int messageEventSourceLength;

    public int messageEventSourceLength()
    {
        if (!hasMessageEventSource)
        {
            throw new IllegalArgumentException("No value for optional field: MessageEventSource");
        }

        return messageEventSourceLength;
    }

    public String messageEventSourceAsString()
    {
        return hasMessageEventSource ? new String(messageEventSource, 0, messageEventSourceLength) : null;
    }

    public void messageEventSource(final AsciiSequenceView view)
    {
        if (!hasMessageEventSource)
        {
            throw new IllegalArgumentException("No value for optional field: MessageEventSource");
        }

        view.wrap(buffer, messageEventSourceOffset, messageEventSourceLength);
    }


    private final CharArrayWrapper messageEventSourceWrapper = new CharArrayWrapper();
    private byte[] lastUpdateTime = new byte[24];

    private boolean hasLastUpdateTime;

    public byte[] lastUpdateTime()
    {
        if (!hasLastUpdateTime)
        {
            throw new IllegalArgumentException("No value for optional field: LastUpdateTime");
        }

        return lastUpdateTime;
    }

    public boolean hasLastUpdateTime()
    {
        return hasLastUpdateTime;
    }


    private int lastUpdateTimeOffset;

    private int lastUpdateTimeLength;

    public int lastUpdateTimeLength()
    {
        if (!hasLastUpdateTime)
        {
            throw new IllegalArgumentException("No value for optional field: LastUpdateTime");
        }

        return lastUpdateTimeLength;
    }

    public String lastUpdateTimeAsString()
    {
        return hasLastUpdateTime ? new String(lastUpdateTime, 0, lastUpdateTimeLength) : null;
    }

    public void lastUpdateTime(final AsciiSequenceView view)
    {
        if (!hasLastUpdateTime)
        {
            throw new IllegalArgumentException("No value for optional field: LastUpdateTime");
        }

        view.wrap(buffer, lastUpdateTimeOffset, lastUpdateTimeLength);
    }


    private DecimalFloat rndPx = DecimalFloat.newNaNValue();

    private boolean hasRndPx;

    public DecimalFloat rndPx()
    {
        if (!hasRndPx)
        {
            throw new IllegalArgumentException("No value for optional field: RndPx");
        }

        return rndPx;
    }

    public boolean hasRndPx()
    {
        return hasRndPx;
    }





    private SidesGroupDecoder sidesGroup = null;
    public SidesGroupDecoder sidesGroup()
    {
        return sidesGroup;
    }

    private int noSidesGroupCounter = MISSING_INT;

    private boolean hasNoSidesGroupCounter;

    public int noSidesGroupCounter()
    {
        if (!hasNoSidesGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoSidesGroupCounter");
        }

        return noSidesGroupCounter;
    }

    public boolean hasNoSidesGroupCounter()
    {
        return hasNoSidesGroupCounter;
    }




    private SidesGroupIterator sidesGroupIterator = new SidesGroupIterator(this);
    public SidesGroupIterator sidesGroupIterator()
    {
        return sidesGroupIterator.iterator();
    }


    private char[] rptSys = new char[1];

    private boolean hasRptSys;

    public char[] rptSys()
    {
        if (!hasRptSys)
        {
            throw new IllegalArgumentException("No value for optional field: RptSys");
        }

        return rptSys;
    }

    public boolean hasRptSys()
    {
        return hasRptSys;
    }


    private int rptSysOffset;

    private int rptSysLength;

    public int rptSysLength()
    {
        if (!hasRptSys)
        {
            throw new IllegalArgumentException("No value for optional field: RptSys");
        }

        return rptSysLength;
    }

    public String rptSysAsString()
    {
        return hasRptSys ? new String(rptSys, 0, rptSysLength) : null;
    }

    public void rptSys(final AsciiSequenceView view)
    {
        if (!hasRptSys)
        {
            throw new IllegalArgumentException("No value for optional field: RptSys");
        }

        view.wrap(buffer, rptSysOffset, rptSysLength);
    }


    private final CharArrayWrapper rptSysWrapper = new CharArrayWrapper();
    private DecimalFloat grossTradeAmt = DecimalFloat.newNaNValue();

    private boolean hasGrossTradeAmt;

    public DecimalFloat grossTradeAmt()
    {
        if (!hasGrossTradeAmt)
        {
            throw new IllegalArgumentException("No value for optional field: GrossTradeAmt");
        }

        return grossTradeAmt;
    }

    public boolean hasGrossTradeAmt()
    {
        return hasGrossTradeAmt;
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


    private DecimalFloat feeMultiplier = DecimalFloat.newNaNValue();

    private boolean hasFeeMultiplier;

    public DecimalFloat feeMultiplier()
    {
        if (!hasFeeMultiplier)
        {
            throw new IllegalArgumentException("No value for optional field: FeeMultiplier");
        }

        return feeMultiplier;
    }

    public boolean hasFeeMultiplier()
    {
        return hasFeeMultiplier;
    }



    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode TradeCaptureReportAck
        int seenFieldCount = 0;
        if (CODEC_VALIDATION_ENABLED)
        {
            missingRequiredFields.copy(REQUIRED_FIELDS);
            alreadyVisitedFields.clear();
        }
        this.buffer = buffer;
        final int end = offset + length;
        int position = offset;
        position += header.decode(buffer, position, length);
        int tag;

        while (position < end)
        {
            final int equalsPosition = buffer.scan(position, end, '=');
            if (equalsPosition == AsciiBuffer.UNKNOWN_INDEX)
            {
               return position;
            }
            tag = buffer.getInt(position, equalsPosition);
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
                if (!alreadyVisitedFields.add(tag))
                {
                    invalidTagId = tag;
                    rejectReason = 13;
                }
                missingRequiredFields.remove(tag);
                seenFieldCount++;
            }

            switch (tag)
            {
            case Constants.TRADE_REPORT_ID:
                hasTradeReportID = true;
                tradeReportID = buffer.getChars(tradeReportID, valueOffset, valueLength);
                tradeReportIDOffset = valueOffset;
                tradeReportIDLength = valueLength;
                break;

            case Constants.TRADE_ID:
                hasTradeID = true;
                tradeID = buffer.getChars(tradeID, valueOffset, valueLength);
                tradeIDOffset = valueOffset;
                tradeIDLength = valueLength;
                break;

            case Constants.SECONDARY_TRADE_ID:
                hasSecondaryTradeID = true;
                secondaryTradeID = buffer.getChars(secondaryTradeID, valueOffset, valueLength);
                secondaryTradeIDOffset = valueOffset;
                secondaryTradeIDLength = valueLength;
                break;

            case Constants.FIRM_TRADE_ID:
                hasFirmTradeID = true;
                firmTradeID = buffer.getChars(firmTradeID, valueOffset, valueLength);
                firmTradeIDOffset = valueOffset;
                firmTradeIDLength = valueLength;
                break;

            case Constants.SECONDARY_FIRM_TRADE_ID:
                hasSecondaryFirmTradeID = true;
                secondaryFirmTradeID = buffer.getChars(secondaryFirmTradeID, valueOffset, valueLength);
                secondaryFirmTradeIDOffset = valueOffset;
                secondaryFirmTradeIDLength = valueLength;
                break;

            case Constants.TRADE_REPORT_TRANS_TYPE:
                hasTradeReportTransType = true;
                tradeReportTransType = getInt(buffer, valueOffset, endOfField, 487, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.TRADE_REPORT_TYPE:
                hasTradeReportType = true;
                tradeReportType = getInt(buffer, valueOffset, endOfField, 856, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.TRD_TYPE:
                hasTrdType = true;
                trdType = getInt(buffer, valueOffset, endOfField, 828, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.TRD_SUB_TYPE:
                hasTrdSubType = true;
                trdSubType = getInt(buffer, valueOffset, endOfField, 829, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.SECONDARY_TRD_TYPE:
                hasSecondaryTrdType = true;
                secondaryTrdType = getInt(buffer, valueOffset, endOfField, 855, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.TRADE_HANDLING_INSTR:
                hasTradeHandlingInstr = true;
                tradeHandlingInstr = buffer.getChar(valueOffset);
                break;

            case Constants.ORIG_TRADE_HANDLING_INSTR:
                hasOrigTradeHandlingInstr = true;
                origTradeHandlingInstr = buffer.getChar(valueOffset);
                break;

            case Constants.ORIG_TRADE_DATE:
                hasOrigTradeDate = true;
                origTradeDate = buffer.getBytes(origTradeDate, valueOffset, valueLength);
                origTradeDateOffset = valueOffset;
                origTradeDateLength = valueLength;
                break;

            case Constants.ORIG_TRADE_ID:
                hasOrigTradeID = true;
                origTradeID = buffer.getChars(origTradeID, valueOffset, valueLength);
                origTradeIDOffset = valueOffset;
                origTradeIDLength = valueLength;
                break;

            case Constants.ORIG_SECONDARY_TRADE_ID:
                hasOrigSecondaryTradeID = true;
                origSecondaryTradeID = buffer.getChars(origSecondaryTradeID, valueOffset, valueLength);
                origSecondaryTradeIDOffset = valueOffset;
                origSecondaryTradeIDLength = valueLength;
                break;

            case Constants.TRANSFER_REASON:
                hasTransferReason = true;
                transferReason = buffer.getChars(transferReason, valueOffset, valueLength);
                transferReasonOffset = valueOffset;
                transferReasonLength = valueLength;
                break;

            case Constants.NO_ROOT_PARTY_IDS_GROUP_COUNTER:
                hasNoRootPartyIDsGroupCounter = true;
                noRootPartyIDsGroupCounter = getInt(buffer, valueOffset, endOfField, 1116, CODEC_VALIDATION_ENABLED);
                if (rootPartyIDsGroup == null)
                {
                    rootPartyIDsGroup = new RootPartyIDsGroupDecoder(trailer, messageFields);
                }
                RootPartyIDsGroupDecoder rootPartyIDsGroupCurrent = rootPartyIDsGroup;
                position = endOfField + 1;
                final int noRootPartyIDsGroupCounter = this.noRootPartyIDsGroupCounter;
                for (int i = 0; i < noRootPartyIDsGroupCounter && position < end; i++)
                {
                    if (rootPartyIDsGroupCurrent != null)
                    {
                        position += rootPartyIDsGroupCurrent.decode(buffer, position, end - position);
                        rootPartyIDsGroupCurrent = rootPartyIDsGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (rootPartyIDsGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;


            case Constants.EXEC_TYPE:
                hasExecType = true;
                execType = buffer.getChar(valueOffset);
                break;

            case Constants.TRADE_REPORT_REF_ID:
                hasTradeReportRefID = true;
                tradeReportRefID = buffer.getChars(tradeReportRefID, valueOffset, valueLength);
                tradeReportRefIDOffset = valueOffset;
                tradeReportRefIDLength = valueLength;
                break;

            case Constants.SECONDARY_TRADE_REPORT_REF_ID:
                hasSecondaryTradeReportRefID = true;
                secondaryTradeReportRefID = buffer.getChars(secondaryTradeReportRefID, valueOffset, valueLength);
                secondaryTradeReportRefIDOffset = valueOffset;
                secondaryTradeReportRefIDLength = valueLength;
                break;

            case Constants.TRD_RPT_STATUS:
                hasTrdRptStatus = true;
                trdRptStatus = getInt(buffer, valueOffset, endOfField, 939, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.TRADE_REPORT_REJECT_REASON:
                hasTradeReportRejectReason = true;
                tradeReportRejectReason = getInt(buffer, valueOffset, endOfField, 751, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.SECONDARY_TRADE_REPORT_ID:
                hasSecondaryTradeReportID = true;
                secondaryTradeReportID = buffer.getChars(secondaryTradeReportID, valueOffset, valueLength);
                secondaryTradeReportIDOffset = valueOffset;
                secondaryTradeReportIDLength = valueLength;
                break;

            case Constants.SUBSCRIPTION_REQUEST_TYPE:
                hasSubscriptionRequestType = true;
                subscriptionRequestType = buffer.getChar(valueOffset);
                break;

            case Constants.TRADE_LINK_ID:
                hasTradeLinkID = true;
                tradeLinkID = buffer.getChars(tradeLinkID, valueOffset, valueLength);
                tradeLinkIDOffset = valueOffset;
                tradeLinkIDLength = valueLength;
                break;

            case Constants.TRD_MATCH_ID:
                hasTrdMatchID = true;
                trdMatchID = buffer.getChars(trdMatchID, valueOffset, valueLength);
                trdMatchIDOffset = valueOffset;
                trdMatchIDLength = valueLength;
                break;

            case Constants.EXEC_ID:
                hasExecID = true;
                execID = buffer.getChars(execID, valueOffset, valueLength);
                execIDOffset = valueOffset;
                execIDLength = valueLength;
                break;

            case Constants.SECONDARY_EXEC_ID:
                hasSecondaryExecID = true;
                secondaryExecID = buffer.getChars(secondaryExecID, valueOffset, valueLength);
                secondaryExecIDOffset = valueOffset;
                secondaryExecIDLength = valueLength;
                break;

            case Constants.EXEC_RESTATEMENT_REASON:
                hasExecRestatementReason = true;
                execRestatementReason = getInt(buffer, valueOffset, endOfField, 378, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.PREVIOUSLY_REPORTED:
                hasPreviouslyReported = true;
                previouslyReported = buffer.getBoolean(valueOffset);
                break;

            case Constants.PRICE_TYPE:
                hasPriceType = true;
                priceType = getInt(buffer, valueOffset, endOfField, 423, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.UNDERLYING_TRADING_SESSION_ID:
                hasUnderlyingTradingSessionID = true;
                underlyingTradingSessionID = buffer.getChars(underlyingTradingSessionID, valueOffset, valueLength);
                underlyingTradingSessionIDOffset = valueOffset;
                underlyingTradingSessionIDLength = valueLength;
                break;

            case Constants.UNDERLYING_TRADING_SESSION_SUB_ID:
                hasUnderlyingTradingSessionSubID = true;
                underlyingTradingSessionSubID = buffer.getChars(underlyingTradingSessionSubID, valueOffset, valueLength);
                underlyingTradingSessionSubIDOffset = valueOffset;
                underlyingTradingSessionSubIDLength = valueLength;
                break;

            case Constants.SETTL_SESS_ID:
                hasSettlSessID = true;
                settlSessID = buffer.getChars(settlSessID, valueOffset, valueLength);
                settlSessIDOffset = valueOffset;
                settlSessIDLength = valueLength;
                break;

            case Constants.SETTL_SESS_SUB_ID:
                hasSettlSessSubID = true;
                settlSessSubID = buffer.getChars(settlSessSubID, valueOffset, valueLength);
                settlSessSubIDOffset = valueOffset;
                settlSessSubIDLength = valueLength;
                break;

            case Constants.QTY_TYPE:
                hasQtyType = true;
                qtyType = getInt(buffer, valueOffset, endOfField, 854, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.LAST_QTY:
                hasLastQty = true;
                lastQty = getFloat(buffer, lastQty, valueOffset, valueLength, 32, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.LAST_PX:
                hasLastPx = true;
                lastPx = getFloat(buffer, lastPx, valueOffset, valueLength, 31, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.VENUE_TYPE:
                hasVenueType = true;
                venueType = buffer.getChar(valueOffset);
                break;

            case Constants.MARKET_SEGMENT_ID:
                hasMarketSegmentID = true;
                marketSegmentID = buffer.getChars(marketSegmentID, valueOffset, valueLength);
                marketSegmentIDOffset = valueOffset;
                marketSegmentIDLength = valueLength;
                break;

            case Constants.MARKET_ID:
                hasMarketID = true;
                marketID = buffer.getChars(marketID, valueOffset, valueLength);
                marketIDOffset = valueOffset;
                marketIDLength = valueLength;
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



            case Constants.LAST_PAR_PX:
                hasLastParPx = true;
                lastParPx = getFloat(buffer, lastParPx, valueOffset, valueLength, 669, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.CALCULATED_CCY_LAST_QTY:
                hasCalculatedCcyLastQty = true;
                calculatedCcyLastQty = getFloat(buffer, calculatedCcyLastQty, valueOffset, valueLength, 1056, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.LAST_SWAP_POINTS:
                hasLastSwapPoints = true;
                lastSwapPoints = getFloat(buffer, lastSwapPoints, valueOffset, valueLength, 1071, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.CURRENCY:
                hasCurrency = true;
                currency = buffer.getChars(currency, valueOffset, valueLength);
                currencyOffset = valueOffset;
                currencyLength = valueLength;
                break;

            case Constants.SETTL_CURRENCY:
                hasSettlCurrency = true;
                settlCurrency = buffer.getChars(settlCurrency, valueOffset, valueLength);
                settlCurrencyOffset = valueOffset;
                settlCurrencyLength = valueLength;
                break;

            case Constants.LAST_SPOT_RATE:
                hasLastSpotRate = true;
                lastSpotRate = getFloat(buffer, lastSpotRate, valueOffset, valueLength, 194, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.LAST_FORWARD_POINTS:
                hasLastForwardPoints = true;
                lastForwardPoints = getFloat(buffer, lastForwardPoints, valueOffset, valueLength, 195, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.LAST_MKT:
                hasLastMkt = true;
                lastMkt = buffer.getChars(lastMkt, valueOffset, valueLength);
                lastMktOffset = valueOffset;
                lastMktLength = valueLength;
                break;

            case Constants.TRADE_DATE:
                hasTradeDate = true;
                tradeDate = buffer.getBytes(tradeDate, valueOffset, valueLength);
                tradeDateOffset = valueOffset;
                tradeDateLength = valueLength;
                break;

            case Constants.CLEARING_BUSINESS_DATE:
                hasClearingBusinessDate = true;
                clearingBusinessDate = buffer.getBytes(clearingBusinessDate, valueOffset, valueLength);
                clearingBusinessDateOffset = valueOffset;
                clearingBusinessDateLength = valueLength;
                break;

            case Constants.AVG_PX:
                hasAvgPx = true;
                avgPx = getFloat(buffer, avgPx, valueOffset, valueLength, 6, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.AVG_PX_INDICATOR:
                hasAvgPxIndicator = true;
                avgPxIndicator = getInt(buffer, valueOffset, endOfField, 819, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.MULTI_LEG_REPORTING_TYPE:
                hasMultiLegReportingType = true;
                multiLegReportingType = buffer.getChar(valueOffset);
                break;

            case Constants.TRADE_LEG_REF_ID:
                hasTradeLegRefID = true;
                tradeLegRefID = buffer.getChars(tradeLegRefID, valueOffset, valueLength);
                tradeLegRefIDOffset = valueOffset;
                tradeLegRefIDLength = valueLength;
                break;

            case Constants.TRANSACT_TIME:
                hasTransactTime = true;
                transactTime = buffer.getBytes(transactTime, valueOffset, valueLength);
                transactTimeOffset = valueOffset;
                transactTimeLength = valueLength;
                break;

            case Constants.SETTL_TYPE:
                hasSettlType = true;
                settlType = buffer.getChars(settlType, valueOffset, valueLength);
                settlTypeOffset = valueOffset;
                settlTypeLength = valueLength;
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


            case Constants.MATCH_STATUS:
                hasMatchStatus = true;
                matchStatus = buffer.getChar(valueOffset);
                break;

            case Constants.MATCH_TYPE:
                hasMatchType = true;
                matchType = buffer.getChars(matchType, valueOffset, valueLength);
                matchTypeOffset = valueOffset;
                matchTypeLength = valueLength;
                break;

            case Constants.COPY_MSG_INDICATOR:
                hasCopyMsgIndicator = true;
                copyMsgIndicator = buffer.getBoolean(valueOffset);
                break;

            case Constants.NO_TRD_REP_INDICATORS_GROUP_COUNTER:
                hasNoTrdRepIndicatorsGroupCounter = true;
                noTrdRepIndicatorsGroupCounter = getInt(buffer, valueOffset, endOfField, 1387, CODEC_VALIDATION_ENABLED);
                if (trdRepIndicatorsGroup == null)
                {
                    trdRepIndicatorsGroup = new TrdRepIndicatorsGroupDecoder(trailer, messageFields);
                }
                TrdRepIndicatorsGroupDecoder trdRepIndicatorsGroupCurrent = trdRepIndicatorsGroup;
                position = endOfField + 1;
                final int noTrdRepIndicatorsGroupCounter = this.noTrdRepIndicatorsGroupCounter;
                for (int i = 0; i < noTrdRepIndicatorsGroupCounter && position < end; i++)
                {
                    if (trdRepIndicatorsGroupCurrent != null)
                    {
                        position += trdRepIndicatorsGroupCurrent.decode(buffer, position, end - position);
                        trdRepIndicatorsGroupCurrent = trdRepIndicatorsGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (trdRepIndicatorsGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;


            case Constants.PUBLISH_TRD_INDICATOR:
                hasPublishTrdIndicator = true;
                publishTrdIndicator = buffer.getBoolean(valueOffset);
                break;

            case Constants.TRADE_PUBLISH_INDICATOR:
                hasTradePublishIndicator = true;
                tradePublishIndicator = getInt(buffer, valueOffset, endOfField, 1390, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.SHORT_SALE_REASON:
                hasShortSaleReason = true;
                shortSaleReason = getInt(buffer, valueOffset, endOfField, 853, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.NO_LEGS_GROUP_COUNTER:
                hasNoLegsGroupCounter = true;
                noLegsGroupCounter = getInt(buffer, valueOffset, endOfField, 555, CODEC_VALIDATION_ENABLED);
                if (legsGroup == null)
                {
                    legsGroup = new LegsGroupDecoder(trailer, messageFields);
                }
                LegsGroupDecoder legsGroupCurrent = legsGroup;
                position = endOfField + 1;
                final int noLegsGroupCounter = this.noLegsGroupCounter;
                for (int i = 0; i < noLegsGroupCounter && position < end; i++)
                {
                    if (legsGroupCurrent != null)
                    {
                        position += legsGroupCurrent.decode(buffer, position, end - position);
                        legsGroupCurrent = legsGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (legsGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;


            case Constants.NO_TRD_REG_TIMESTAMPS_GROUP_COUNTER:
                hasNoTrdRegTimestampsGroupCounter = true;
                noTrdRegTimestampsGroupCounter = getInt(buffer, valueOffset, endOfField, 768, CODEC_VALIDATION_ENABLED);
                if (trdRegTimestampsGroup == null)
                {
                    trdRegTimestampsGroup = new TrdRegTimestampsGroupDecoder(trailer, messageFields);
                }
                TrdRegTimestampsGroupDecoder trdRegTimestampsGroupCurrent = trdRegTimestampsGroup;
                position = endOfField + 1;
                final int noTrdRegTimestampsGroupCounter = this.noTrdRegTimestampsGroupCounter;
                for (int i = 0; i < noTrdRegTimestampsGroupCounter && position < end; i++)
                {
                    if (trdRegTimestampsGroupCurrent != null)
                    {
                        position += trdRegTimestampsGroupCurrent.decode(buffer, position, end - position);
                        trdRegTimestampsGroupCurrent = trdRegTimestampsGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (trdRegTimestampsGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;


            case Constants.RESPONSE_TRANSPORT_TYPE:
                hasResponseTransportType = true;
                responseTransportType = getInt(buffer, valueOffset, endOfField, 725, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.RESPONSE_DESTINATION:
                hasResponseDestination = true;
                responseDestination = buffer.getChars(responseDestination, valueOffset, valueLength);
                responseDestinationOffset = valueOffset;
                responseDestinationLength = valueLength;
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

            case Constants.AS_OF_INDICATOR:
                hasAsOfIndicator = true;
                asOfIndicator = buffer.getChar(valueOffset);
                break;

            case Constants.CLEARING_FEE_INDICATOR:
                hasClearingFeeIndicator = true;
                clearingFeeIndicator = buffer.getChars(clearingFeeIndicator, valueOffset, valueLength);
                clearingFeeIndicatorOffset = valueOffset;
                clearingFeeIndicatorLength = valueLength;
                break;

            case Constants.NO_POS_AMT_GROUP_COUNTER:
                hasNoPosAmtGroupCounter = true;
                noPosAmtGroupCounter = getInt(buffer, valueOffset, endOfField, 753, CODEC_VALIDATION_ENABLED);
                if (posAmtGroup == null)
                {
                    posAmtGroup = new PosAmtGroupDecoder(trailer, messageFields);
                }
                PosAmtGroupDecoder posAmtGroupCurrent = posAmtGroup;
                position = endOfField + 1;
                final int noPosAmtGroupCounter = this.noPosAmtGroupCounter;
                for (int i = 0; i < noPosAmtGroupCounter && position < end; i++)
                {
                    if (posAmtGroupCurrent != null)
                    {
                        position += posAmtGroupCurrent.decode(buffer, position, end - position);
                        posAmtGroupCurrent = posAmtGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (posAmtGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;


            case Constants.TIER_CODE:
                hasTierCode = true;
                tierCode = buffer.getChars(tierCode, valueOffset, valueLength);
                tierCodeOffset = valueOffset;
                tierCodeLength = valueLength;
                break;

            case Constants.MESSAGE_EVENT_SOURCE:
                hasMessageEventSource = true;
                messageEventSource = buffer.getChars(messageEventSource, valueOffset, valueLength);
                messageEventSourceOffset = valueOffset;
                messageEventSourceLength = valueLength;
                break;

            case Constants.LAST_UPDATE_TIME:
                hasLastUpdateTime = true;
                lastUpdateTime = buffer.getBytes(lastUpdateTime, valueOffset, valueLength);
                lastUpdateTimeOffset = valueOffset;
                lastUpdateTimeLength = valueLength;
                break;

            case Constants.RND_PX:
                hasRndPx = true;
                rndPx = getFloat(buffer, rndPx, valueOffset, valueLength, 991, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.NO_SIDES_GROUP_COUNTER:
                hasNoSidesGroupCounter = true;
                noSidesGroupCounter = getInt(buffer, valueOffset, endOfField, 552, CODEC_VALIDATION_ENABLED);
                if (sidesGroup == null)
                {
                    sidesGroup = new SidesGroupDecoder(trailer, messageFields);
                }
                SidesGroupDecoder sidesGroupCurrent = sidesGroup;
                position = endOfField + 1;
                final int noSidesGroupCounter = this.noSidesGroupCounter;
                for (int i = 0; i < noSidesGroupCounter && position < end; i++)
                {
                    if (sidesGroupCurrent != null)
                    {
                        position += sidesGroupCurrent.decode(buffer, position, end - position);
                        sidesGroupCurrent = sidesGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (sidesGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;


            case Constants.RPT_SYS:
                hasRptSys = true;
                rptSys = buffer.getChars(rptSys, valueOffset, valueLength);
                rptSysOffset = valueOffset;
                rptSysLength = valueLength;
                break;

            case Constants.GROSS_TRADE_AMT:
                hasGrossTradeAmt = true;
                grossTradeAmt = getFloat(buffer, grossTradeAmt, valueOffset, valueLength, 381, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.SETTL_DATE:
                hasSettlDate = true;
                settlDate = buffer.getBytes(settlDate, valueOffset, valueLength);
                settlDateOffset = valueOffset;
                settlDateLength = valueLength;
                break;

            case Constants.FEE_MULTIPLIER:
                hasFeeMultiplier = true;
                feeMultiplier = getFloat(buffer, feeMultiplier, valueOffset, valueLength, 1329, CODEC_VALIDATION_ENABLED);
                break;

            default:
                if (!CODEC_REJECT_UNKNOWN_FIELD_ENABLED)
                {
                    alreadyVisitedFields.remove(tag);
                }
                else
                {
                    if (!(trailer.REQUIRED_FIELDS.contains(tag)))
                    {
                        unknownFields.add(tag);
                    }
                }
                if (CODEC_REJECT_UNKNOWN_FIELD_ENABLED || (trailer.REQUIRED_FIELDS.contains(tag)))
                {
                    position += trailer.decode(buffer, position, end - position);
                    return position - offset;
                }

            }

            if (position < (endOfField + 1))
            {
                position = endOfField + 1;
            }
        }
        position += trailer.decode(buffer, position, end - position);
        return position - offset;
    }

    public void reset()
    {
        header.reset();
        trailer.reset();
        resetMessage();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
            unknownFields.clear();
            alreadyVisitedFields.clear();
        }
    }

    public void resetMessage()
    {
        this.resetTradeReportID();
        this.resetTradeID();
        this.resetSecondaryTradeID();
        this.resetFirmTradeID();
        this.resetSecondaryFirmTradeID();
        this.resetTradeReportTransType();
        this.resetTradeReportType();
        this.resetTrdType();
        this.resetTrdSubType();
        this.resetSecondaryTrdType();
        this.resetTradeHandlingInstr();
        this.resetOrigTradeHandlingInstr();
        this.resetOrigTradeDate();
        this.resetOrigTradeID();
        this.resetOrigSecondaryTradeID();
        this.resetTransferReason();
        this.resetExecType();
        this.resetTradeReportRefID();
        this.resetSecondaryTradeReportRefID();
        this.resetTrdRptStatus();
        this.resetTradeReportRejectReason();
        this.resetSecondaryTradeReportID();
        this.resetSubscriptionRequestType();
        this.resetTradeLinkID();
        this.resetTrdMatchID();
        this.resetExecID();
        this.resetSecondaryExecID();
        this.resetExecRestatementReason();
        this.resetPreviouslyReported();
        this.resetPriceType();
        this.resetUnderlyingTradingSessionID();
        this.resetUnderlyingTradingSessionSubID();
        this.resetSettlSessID();
        this.resetSettlSessSubID();
        this.resetQtyType();
        this.resetLastQty();
        this.resetLastPx();
        this.resetVenueType();
        this.resetMarketSegmentID();
        this.resetMarketID();
        this.resetLastParPx();
        this.resetCalculatedCcyLastQty();
        this.resetLastSwapPoints();
        this.resetCurrency();
        this.resetSettlCurrency();
        this.resetLastSpotRate();
        this.resetLastForwardPoints();
        this.resetLastMkt();
        this.resetTradeDate();
        this.resetClearingBusinessDate();
        this.resetAvgPx();
        this.resetAvgPxIndicator();
        this.resetMultiLegReportingType();
        this.resetTradeLegRefID();
        this.resetTransactTime();
        this.resetSettlType();
        this.resetMatchStatus();
        this.resetMatchType();
        this.resetCopyMsgIndicator();
        this.resetPublishTrdIndicator();
        this.resetTradePublishIndicator();
        this.resetShortSaleReason();
        this.resetResponseTransportType();
        this.resetResponseDestination();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        this.resetAsOfIndicator();
        this.resetClearingFeeIndicator();
        this.resetTierCode();
        this.resetMessageEventSource();
        this.resetLastUpdateTime();
        this.resetRndPx();
        this.resetRptSys();
        this.resetGrossTradeAmt();
        this.resetSettlDate();
        this.resetFeeMultiplier();
        this.resetRootPartyIDsGroup();
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
        this.resetTrdRepIndicatorsGroup();
        this.resetLegsGroup();
        this.resetTrdRegTimestampsGroup();
        this.resetPosAmtGroup();
        this.resetSidesGroup();
    }

    public void resetTradeReportID()
    {
        hasTradeReportID = false;
    }

    public void resetTradeID()
    {
        hasTradeID = false;
    }

    public void resetSecondaryTradeID()
    {
        hasSecondaryTradeID = false;
    }

    public void resetFirmTradeID()
    {
        hasFirmTradeID = false;
    }

    public void resetSecondaryFirmTradeID()
    {
        hasSecondaryFirmTradeID = false;
    }

    public void resetTradeReportTransType()
    {
        hasTradeReportTransType = false;
    }

    public void resetTradeReportType()
    {
        hasTradeReportType = false;
    }

    public void resetTrdType()
    {
        hasTrdType = false;
    }

    public void resetTrdSubType()
    {
        hasTrdSubType = false;
    }

    public void resetSecondaryTrdType()
    {
        hasSecondaryTrdType = false;
    }

    public void resetTradeHandlingInstr()
    {
        hasTradeHandlingInstr = false;
    }

    public void resetOrigTradeHandlingInstr()
    {
        hasOrigTradeHandlingInstr = false;
    }

    public void resetOrigTradeDate()
    {
        hasOrigTradeDate = false;
    }

    public void resetOrigTradeID()
    {
        hasOrigTradeID = false;
    }

    public void resetOrigSecondaryTradeID()
    {
        hasOrigSecondaryTradeID = false;
    }

    public void resetTransferReason()
    {
        hasTransferReason = false;
    }

    public void resetExecType()
    {
        hasExecType = false;
    }

    public void resetTradeReportRefID()
    {
        hasTradeReportRefID = false;
    }

    public void resetSecondaryTradeReportRefID()
    {
        hasSecondaryTradeReportRefID = false;
    }

    public void resetTrdRptStatus()
    {
        hasTrdRptStatus = false;
    }

    public void resetTradeReportRejectReason()
    {
        hasTradeReportRejectReason = false;
    }

    public void resetSecondaryTradeReportID()
    {
        hasSecondaryTradeReportID = false;
    }

    public void resetSubscriptionRequestType()
    {
        hasSubscriptionRequestType = false;
    }

    public void resetTradeLinkID()
    {
        hasTradeLinkID = false;
    }

    public void resetTrdMatchID()
    {
        hasTrdMatchID = false;
    }

    public void resetExecID()
    {
        hasExecID = false;
    }

    public void resetSecondaryExecID()
    {
        hasSecondaryExecID = false;
    }

    public void resetExecRestatementReason()
    {
        hasExecRestatementReason = false;
    }

    public void resetPreviouslyReported()
    {
        hasPreviouslyReported = false;
    }

    public void resetPriceType()
    {
        hasPriceType = false;
    }

    public void resetUnderlyingTradingSessionID()
    {
        hasUnderlyingTradingSessionID = false;
    }

    public void resetUnderlyingTradingSessionSubID()
    {
        hasUnderlyingTradingSessionSubID = false;
    }

    public void resetSettlSessID()
    {
        hasSettlSessID = false;
    }

    public void resetSettlSessSubID()
    {
        hasSettlSessSubID = false;
    }

    public void resetQtyType()
    {
        hasQtyType = false;
    }

    public void resetLastQty()
    {
        hasLastQty = false;
    }

    public void resetLastPx()
    {
        hasLastPx = false;
    }

    public void resetVenueType()
    {
        hasVenueType = false;
    }

    public void resetMarketSegmentID()
    {
        hasMarketSegmentID = false;
    }

    public void resetMarketID()
    {
        hasMarketID = false;
    }

    public void resetLastParPx()
    {
        hasLastParPx = false;
    }

    public void resetCalculatedCcyLastQty()
    {
        hasCalculatedCcyLastQty = false;
    }

    public void resetLastSwapPoints()
    {
        hasLastSwapPoints = false;
    }

    public void resetCurrency()
    {
        hasCurrency = false;
    }

    public void resetSettlCurrency()
    {
        hasSettlCurrency = false;
    }

    public void resetLastSpotRate()
    {
        hasLastSpotRate = false;
    }

    public void resetLastForwardPoints()
    {
        hasLastForwardPoints = false;
    }

    public void resetLastMkt()
    {
        hasLastMkt = false;
    }

    public void resetTradeDate()
    {
        hasTradeDate = false;
    }

    public void resetClearingBusinessDate()
    {
        hasClearingBusinessDate = false;
    }

    public void resetAvgPx()
    {
        hasAvgPx = false;
    }

    public void resetAvgPxIndicator()
    {
        hasAvgPxIndicator = false;
    }

    public void resetMultiLegReportingType()
    {
        hasMultiLegReportingType = false;
    }

    public void resetTradeLegRefID()
    {
        hasTradeLegRefID = false;
    }

    public void resetTransactTime()
    {
        hasTransactTime = false;
    }

    public void resetSettlType()
    {
        hasSettlType = false;
    }

    public void resetMatchStatus()
    {
        hasMatchStatus = false;
    }

    public void resetMatchType()
    {
        hasMatchType = false;
    }

    public void resetCopyMsgIndicator()
    {
        hasCopyMsgIndicator = false;
    }

    public void resetPublishTrdIndicator()
    {
        hasPublishTrdIndicator = false;
    }

    public void resetTradePublishIndicator()
    {
        hasTradePublishIndicator = false;
    }

    public void resetShortSaleReason()
    {
        hasShortSaleReason = false;
    }

    public void resetResponseTransportType()
    {
        hasResponseTransportType = false;
    }

    public void resetResponseDestination()
    {
        hasResponseDestination = false;
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

    public void resetAsOfIndicator()
    {
        hasAsOfIndicator = false;
    }

    public void resetClearingFeeIndicator()
    {
        hasClearingFeeIndicator = false;
    }

    public void resetTierCode()
    {
        hasTierCode = false;
    }

    public void resetMessageEventSource()
    {
        hasMessageEventSource = false;
    }

    public void resetLastUpdateTime()
    {
        hasLastUpdateTime = false;
    }

    public void resetRndPx()
    {
        hasRndPx = false;
    }

    public void resetRptSys()
    {
        hasRptSys = false;
    }

    public void resetGrossTradeAmt()
    {
        hasGrossTradeAmt = false;
    }

    public void resetSettlDate()
    {
        hasSettlDate = false;
    }

    public void resetFeeMultiplier()
    {
        hasFeeMultiplier = false;
    }

    public void resetRootPartyIDsGroup()
    {
        for (final RootPartyIDsGroupDecoder rootPartyIDsGroupDecoder : rootPartyIDsGroupIterator.iterator())
        {
            rootPartyIDsGroupDecoder.reset();
            if (rootPartyIDsGroupDecoder.next() == null)
            {
                break;
            }
        }
        noRootPartyIDsGroupCounter = MISSING_INT;
        hasNoRootPartyIDsGroupCounter = false;
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

    public void resetTrdRepIndicatorsGroup()
    {
        for (final TrdRepIndicatorsGroupDecoder trdRepIndicatorsGroupDecoder : trdRepIndicatorsGroupIterator.iterator())
        {
            trdRepIndicatorsGroupDecoder.reset();
            if (trdRepIndicatorsGroupDecoder.next() == null)
            {
                break;
            }
        }
        noTrdRepIndicatorsGroupCounter = MISSING_INT;
        hasNoTrdRepIndicatorsGroupCounter = false;
    }

    public void resetLegsGroup()
    {
        for (final LegsGroupDecoder legsGroupDecoder : legsGroupIterator.iterator())
        {
            legsGroupDecoder.reset();
            if (legsGroupDecoder.next() == null)
            {
                break;
            }
        }
        noLegsGroupCounter = MISSING_INT;
        hasNoLegsGroupCounter = false;
    }

    public void resetTrdRegTimestampsGroup()
    {
        for (final TrdRegTimestampsGroupDecoder trdRegTimestampsGroupDecoder : trdRegTimestampsGroupIterator.iterator())
        {
            trdRegTimestampsGroupDecoder.reset();
            if (trdRegTimestampsGroupDecoder.next() == null)
            {
                break;
            }
        }
        noTrdRegTimestampsGroupCounter = MISSING_INT;
        hasNoTrdRegTimestampsGroupCounter = false;
    }

    public void resetPosAmtGroup()
    {
        for (final PosAmtGroupDecoder posAmtGroupDecoder : posAmtGroupIterator.iterator())
        {
            posAmtGroupDecoder.reset();
            if (posAmtGroupDecoder.next() == null)
            {
                break;
            }
        }
        noPosAmtGroupCounter = MISSING_INT;
        hasNoPosAmtGroupCounter = false;
    }

    public void resetSidesGroup()
    {
        for (final SidesGroupDecoder sidesGroupDecoder : sidesGroupIterator.iterator())
        {
            sidesGroupDecoder.reset();
            if (sidesGroupDecoder.next() == null)
            {
                break;
            }
        }
        noSidesGroupCounter = MISSING_INT;
        hasNoSidesGroupCounter = false;
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
        builder.append("\"MessageName\": \"TradeCaptureReportAck\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasTradeReportID())
        {
            indent(builder, level);
            builder.append("\"TradeReportID\": \"");
            builder.append(this.tradeReportID(), 0, tradeReportIDLength());
            builder.append("\",\n");
        }

        if (hasTradeID())
        {
            indent(builder, level);
            builder.append("\"TradeID\": \"");
            builder.append(this.tradeID(), 0, tradeIDLength());
            builder.append("\",\n");
        }

        if (hasSecondaryTradeID())
        {
            indent(builder, level);
            builder.append("\"SecondaryTradeID\": \"");
            builder.append(this.secondaryTradeID(), 0, secondaryTradeIDLength());
            builder.append("\",\n");
        }

        if (hasFirmTradeID())
        {
            indent(builder, level);
            builder.append("\"FirmTradeID\": \"");
            builder.append(this.firmTradeID(), 0, firmTradeIDLength());
            builder.append("\",\n");
        }

        if (hasSecondaryFirmTradeID())
        {
            indent(builder, level);
            builder.append("\"SecondaryFirmTradeID\": \"");
            builder.append(this.secondaryFirmTradeID(), 0, secondaryFirmTradeIDLength());
            builder.append("\",\n");
        }

        if (hasTradeReportTransType())
        {
            indent(builder, level);
            builder.append("\"TradeReportTransType\": \"");
            builder.append(tradeReportTransType);
            builder.append("\",\n");
        }

        if (hasTradeReportType())
        {
            indent(builder, level);
            builder.append("\"TradeReportType\": \"");
            builder.append(tradeReportType);
            builder.append("\",\n");
        }

        if (hasTrdType())
        {
            indent(builder, level);
            builder.append("\"TrdType\": \"");
            builder.append(trdType);
            builder.append("\",\n");
        }

        if (hasTrdSubType())
        {
            indent(builder, level);
            builder.append("\"TrdSubType\": \"");
            builder.append(trdSubType);
            builder.append("\",\n");
        }

        if (hasSecondaryTrdType())
        {
            indent(builder, level);
            builder.append("\"SecondaryTrdType\": \"");
            builder.append(secondaryTrdType);
            builder.append("\",\n");
        }

        if (hasTradeHandlingInstr())
        {
            indent(builder, level);
            builder.append("\"TradeHandlingInstr\": \"");
            builder.append(tradeHandlingInstr);
            builder.append("\",\n");
        }

        if (hasOrigTradeHandlingInstr())
        {
            indent(builder, level);
            builder.append("\"OrigTradeHandlingInstr\": \"");
            builder.append(origTradeHandlingInstr);
            builder.append("\",\n");
        }

        if (hasOrigTradeDate())
        {
            indent(builder, level);
            builder.append("\"OrigTradeDate\": \"");
            appendData(builder, origTradeDate, origTradeDateLength);
            builder.append("\",\n");
        }

        if (hasOrigTradeID())
        {
            indent(builder, level);
            builder.append("\"OrigTradeID\": \"");
            builder.append(this.origTradeID(), 0, origTradeIDLength());
            builder.append("\",\n");
        }

        if (hasOrigSecondaryTradeID())
        {
            indent(builder, level);
            builder.append("\"OrigSecondaryTradeID\": \"");
            builder.append(this.origSecondaryTradeID(), 0, origSecondaryTradeIDLength());
            builder.append("\",\n");
        }

        if (hasTransferReason())
        {
            indent(builder, level);
            builder.append("\"TransferReason\": \"");
            builder.append(this.transferReason(), 0, transferReasonLength());
            builder.append("\",\n");
        }

        if (hasNoRootPartyIDsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"RootPartyIDsGroup\": [\n");
            RootPartyIDsGroupDecoder rootPartyIDsGroup = this.rootPartyIDsGroup;
            for (int i = 0, size = this.noRootPartyIDsGroupCounter; i < size; i++)
            {
                indent(builder, level);
                rootPartyIDsGroup.appendTo(builder, level + 1);
                if (rootPartyIDsGroup.next() != null)
                {
                    builder.append(',');
                }
                builder.append('\n');
                rootPartyIDsGroup = rootPartyIDsGroup.next();            }
            indent(builder, level);
            builder.append("],\n");
        }

        if (hasExecType())
        {
            indent(builder, level);
            builder.append("\"ExecType\": \"");
            builder.append(execType);
            builder.append("\",\n");
        }

        if (hasTradeReportRefID())
        {
            indent(builder, level);
            builder.append("\"TradeReportRefID\": \"");
            builder.append(this.tradeReportRefID(), 0, tradeReportRefIDLength());
            builder.append("\",\n");
        }

        if (hasSecondaryTradeReportRefID())
        {
            indent(builder, level);
            builder.append("\"SecondaryTradeReportRefID\": \"");
            builder.append(this.secondaryTradeReportRefID(), 0, secondaryTradeReportRefIDLength());
            builder.append("\",\n");
        }

        if (hasTrdRptStatus())
        {
            indent(builder, level);
            builder.append("\"TrdRptStatus\": \"");
            builder.append(trdRptStatus);
            builder.append("\",\n");
        }

        if (hasTradeReportRejectReason())
        {
            indent(builder, level);
            builder.append("\"TradeReportRejectReason\": \"");
            builder.append(tradeReportRejectReason);
            builder.append("\",\n");
        }

        if (hasSecondaryTradeReportID())
        {
            indent(builder, level);
            builder.append("\"SecondaryTradeReportID\": \"");
            builder.append(this.secondaryTradeReportID(), 0, secondaryTradeReportIDLength());
            builder.append("\",\n");
        }

        if (hasSubscriptionRequestType())
        {
            indent(builder, level);
            builder.append("\"SubscriptionRequestType\": \"");
            builder.append(subscriptionRequestType);
            builder.append("\",\n");
        }

        if (hasTradeLinkID())
        {
            indent(builder, level);
            builder.append("\"TradeLinkID\": \"");
            builder.append(this.tradeLinkID(), 0, tradeLinkIDLength());
            builder.append("\",\n");
        }

        if (hasTrdMatchID())
        {
            indent(builder, level);
            builder.append("\"TrdMatchID\": \"");
            builder.append(this.trdMatchID(), 0, trdMatchIDLength());
            builder.append("\",\n");
        }

        if (hasExecID())
        {
            indent(builder, level);
            builder.append("\"ExecID\": \"");
            builder.append(this.execID(), 0, execIDLength());
            builder.append("\",\n");
        }

        if (hasSecondaryExecID())
        {
            indent(builder, level);
            builder.append("\"SecondaryExecID\": \"");
            builder.append(this.secondaryExecID(), 0, secondaryExecIDLength());
            builder.append("\",\n");
        }

        if (hasExecRestatementReason())
        {
            indent(builder, level);
            builder.append("\"ExecRestatementReason\": \"");
            builder.append(execRestatementReason);
            builder.append("\",\n");
        }

        if (hasPreviouslyReported())
        {
            indent(builder, level);
            builder.append("\"PreviouslyReported\": \"");
            builder.append(previouslyReported);
            builder.append("\",\n");
        }

        if (hasPriceType())
        {
            indent(builder, level);
            builder.append("\"PriceType\": \"");
            builder.append(priceType);
            builder.append("\",\n");
        }

        if (hasUnderlyingTradingSessionID())
        {
            indent(builder, level);
            builder.append("\"UnderlyingTradingSessionID\": \"");
            builder.append(this.underlyingTradingSessionID(), 0, underlyingTradingSessionIDLength());
            builder.append("\",\n");
        }

        if (hasUnderlyingTradingSessionSubID())
        {
            indent(builder, level);
            builder.append("\"UnderlyingTradingSessionSubID\": \"");
            builder.append(this.underlyingTradingSessionSubID(), 0, underlyingTradingSessionSubIDLength());
            builder.append("\",\n");
        }

        if (hasSettlSessID())
        {
            indent(builder, level);
            builder.append("\"SettlSessID\": \"");
            builder.append(this.settlSessID(), 0, settlSessIDLength());
            builder.append("\",\n");
        }

        if (hasSettlSessSubID())
        {
            indent(builder, level);
            builder.append("\"SettlSessSubID\": \"");
            builder.append(this.settlSessSubID(), 0, settlSessSubIDLength());
            builder.append("\",\n");
        }

        if (hasQtyType())
        {
            indent(builder, level);
            builder.append("\"QtyType\": \"");
            builder.append(qtyType);
            builder.append("\",\n");
        }

        if (hasLastQty())
        {
            indent(builder, level);
            builder.append("\"LastQty\": \"");
            lastQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasLastPx())
        {
            indent(builder, level);
            builder.append("\"LastPx\": \"");
            lastPx.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasVenueType())
        {
            indent(builder, level);
            builder.append("\"VenueType\": \"");
            builder.append(venueType);
            builder.append("\",\n");
        }

        if (hasMarketSegmentID())
        {
            indent(builder, level);
            builder.append("\"MarketSegmentID\": \"");
            builder.append(this.marketSegmentID(), 0, marketSegmentIDLength());
            builder.append("\",\n");
        }

        if (hasMarketID())
        {
            indent(builder, level);
            builder.append("\"MarketID\": \"");
            builder.append(this.marketID(), 0, marketIDLength());
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

        if (hasLastParPx())
        {
            indent(builder, level);
            builder.append("\"LastParPx\": \"");
            lastParPx.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasCalculatedCcyLastQty())
        {
            indent(builder, level);
            builder.append("\"CalculatedCcyLastQty\": \"");
            calculatedCcyLastQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasLastSwapPoints())
        {
            indent(builder, level);
            builder.append("\"LastSwapPoints\": \"");
            lastSwapPoints.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasCurrency())
        {
            indent(builder, level);
            builder.append("\"Currency\": \"");
            builder.append(this.currency(), 0, currencyLength());
            builder.append("\",\n");
        }

        if (hasSettlCurrency())
        {
            indent(builder, level);
            builder.append("\"SettlCurrency\": \"");
            builder.append(this.settlCurrency(), 0, settlCurrencyLength());
            builder.append("\",\n");
        }

        if (hasLastSpotRate())
        {
            indent(builder, level);
            builder.append("\"LastSpotRate\": \"");
            lastSpotRate.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasLastForwardPoints())
        {
            indent(builder, level);
            builder.append("\"LastForwardPoints\": \"");
            lastForwardPoints.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasLastMkt())
        {
            indent(builder, level);
            builder.append("\"LastMkt\": \"");
            builder.append(this.lastMkt(), 0, lastMktLength());
            builder.append("\",\n");
        }

        if (hasTradeDate())
        {
            indent(builder, level);
            builder.append("\"TradeDate\": \"");
            appendData(builder, tradeDate, tradeDateLength);
            builder.append("\",\n");
        }

        if (hasClearingBusinessDate())
        {
            indent(builder, level);
            builder.append("\"ClearingBusinessDate\": \"");
            appendData(builder, clearingBusinessDate, clearingBusinessDateLength);
            builder.append("\",\n");
        }

        if (hasAvgPx())
        {
            indent(builder, level);
            builder.append("\"AvgPx\": \"");
            avgPx.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasAvgPxIndicator())
        {
            indent(builder, level);
            builder.append("\"AvgPxIndicator\": \"");
            builder.append(avgPxIndicator);
            builder.append("\",\n");
        }

        if (hasMultiLegReportingType())
        {
            indent(builder, level);
            builder.append("\"MultiLegReportingType\": \"");
            builder.append(multiLegReportingType);
            builder.append("\",\n");
        }

        if (hasTradeLegRefID())
        {
            indent(builder, level);
            builder.append("\"TradeLegRefID\": \"");
            builder.append(this.tradeLegRefID(), 0, tradeLegRefIDLength());
            builder.append("\",\n");
        }

        if (hasTransactTime())
        {
            indent(builder, level);
            builder.append("\"TransactTime\": \"");
            appendData(builder, transactTime, transactTimeLength);
            builder.append("\",\n");
        }

        if (hasSettlType())
        {
            indent(builder, level);
            builder.append("\"SettlType\": \"");
            builder.append(this.settlType(), 0, settlTypeLength());
            builder.append("\",\n");
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

        if (hasMatchStatus())
        {
            indent(builder, level);
            builder.append("\"MatchStatus\": \"");
            builder.append(matchStatus);
            builder.append("\",\n");
        }

        if (hasMatchType())
        {
            indent(builder, level);
            builder.append("\"MatchType\": \"");
            builder.append(this.matchType(), 0, matchTypeLength());
            builder.append("\",\n");
        }

        if (hasCopyMsgIndicator())
        {
            indent(builder, level);
            builder.append("\"CopyMsgIndicator\": \"");
            builder.append(copyMsgIndicator);
            builder.append("\",\n");
        }

        if (hasNoTrdRepIndicatorsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"TrdRepIndicatorsGroup\": [\n");
            TrdRepIndicatorsGroupDecoder trdRepIndicatorsGroup = this.trdRepIndicatorsGroup;
            for (int i = 0, size = this.noTrdRepIndicatorsGroupCounter; i < size; i++)
            {
                indent(builder, level);
                trdRepIndicatorsGroup.appendTo(builder, level + 1);
                if (trdRepIndicatorsGroup.next() != null)
                {
                    builder.append(',');
                }
                builder.append('\n');
                trdRepIndicatorsGroup = trdRepIndicatorsGroup.next();            }
            indent(builder, level);
            builder.append("],\n");
        }

        if (hasPublishTrdIndicator())
        {
            indent(builder, level);
            builder.append("\"PublishTrdIndicator\": \"");
            builder.append(publishTrdIndicator);
            builder.append("\",\n");
        }

        if (hasTradePublishIndicator())
        {
            indent(builder, level);
            builder.append("\"TradePublishIndicator\": \"");
            builder.append(tradePublishIndicator);
            builder.append("\",\n");
        }

        if (hasShortSaleReason())
        {
            indent(builder, level);
            builder.append("\"ShortSaleReason\": \"");
            builder.append(shortSaleReason);
            builder.append("\",\n");
        }

        if (hasNoLegsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"LegsGroup\": [\n");
            LegsGroupDecoder legsGroup = this.legsGroup;
            for (int i = 0, size = this.noLegsGroupCounter; i < size; i++)
            {
                indent(builder, level);
                legsGroup.appendTo(builder, level + 1);
                if (legsGroup.next() != null)
                {
                    builder.append(',');
                }
                builder.append('\n');
                legsGroup = legsGroup.next();            }
            indent(builder, level);
            builder.append("],\n");
        }

        if (hasNoTrdRegTimestampsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"TrdRegTimestampsGroup\": [\n");
            TrdRegTimestampsGroupDecoder trdRegTimestampsGroup = this.trdRegTimestampsGroup;
            for (int i = 0, size = this.noTrdRegTimestampsGroupCounter; i < size; i++)
            {
                indent(builder, level);
                trdRegTimestampsGroup.appendTo(builder, level + 1);
                if (trdRegTimestampsGroup.next() != null)
                {
                    builder.append(',');
                }
                builder.append('\n');
                trdRegTimestampsGroup = trdRegTimestampsGroup.next();            }
            indent(builder, level);
            builder.append("],\n");
        }

        if (hasResponseTransportType())
        {
            indent(builder, level);
            builder.append("\"ResponseTransportType\": \"");
            builder.append(responseTransportType);
            builder.append("\",\n");
        }

        if (hasResponseDestination())
        {
            indent(builder, level);
            builder.append("\"ResponseDestination\": \"");
            builder.append(this.responseDestination(), 0, responseDestinationLength());
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

        if (hasAsOfIndicator())
        {
            indent(builder, level);
            builder.append("\"AsOfIndicator\": \"");
            builder.append(asOfIndicator);
            builder.append("\",\n");
        }

        if (hasClearingFeeIndicator())
        {
            indent(builder, level);
            builder.append("\"ClearingFeeIndicator\": \"");
            builder.append(this.clearingFeeIndicator(), 0, clearingFeeIndicatorLength());
            builder.append("\",\n");
        }

        if (hasNoPosAmtGroupCounter)
        {
            indent(builder, level);
            builder.append("\"PosAmtGroup\": [\n");
            PosAmtGroupDecoder posAmtGroup = this.posAmtGroup;
            for (int i = 0, size = this.noPosAmtGroupCounter; i < size; i++)
            {
                indent(builder, level);
                posAmtGroup.appendTo(builder, level + 1);
                if (posAmtGroup.next() != null)
                {
                    builder.append(',');
                }
                builder.append('\n');
                posAmtGroup = posAmtGroup.next();            }
            indent(builder, level);
            builder.append("],\n");
        }

        if (hasTierCode())
        {
            indent(builder, level);
            builder.append("\"TierCode\": \"");
            builder.append(this.tierCode(), 0, tierCodeLength());
            builder.append("\",\n");
        }

        if (hasMessageEventSource())
        {
            indent(builder, level);
            builder.append("\"MessageEventSource\": \"");
            builder.append(this.messageEventSource(), 0, messageEventSourceLength());
            builder.append("\",\n");
        }

        if (hasLastUpdateTime())
        {
            indent(builder, level);
            builder.append("\"LastUpdateTime\": \"");
            appendData(builder, lastUpdateTime, lastUpdateTimeLength);
            builder.append("\",\n");
        }

        if (hasRndPx())
        {
            indent(builder, level);
            builder.append("\"RndPx\": \"");
            rndPx.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasNoSidesGroupCounter)
        {
            indent(builder, level);
            builder.append("\"SidesGroup\": [\n");
            SidesGroupDecoder sidesGroup = this.sidesGroup;
            for (int i = 0, size = this.noSidesGroupCounter; i < size; i++)
            {
                indent(builder, level);
                sidesGroup.appendTo(builder, level + 1);
                if (sidesGroup.next() != null)
                {
                    builder.append(',');
                }
                builder.append('\n');
                sidesGroup = sidesGroup.next();            }
            indent(builder, level);
            builder.append("],\n");
        }

        if (hasRptSys())
        {
            indent(builder, level);
            builder.append("\"RptSys\": \"");
            builder.append(this.rptSys(), 0, rptSysLength());
            builder.append("\",\n");
        }

        if (hasGrossTradeAmt())
        {
            indent(builder, level);
            builder.append("\"GrossTradeAmt\": \"");
            grossTradeAmt.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasSettlDate())
        {
            indent(builder, level);
            builder.append("\"SettlDate\": \"");
            appendData(builder, settlDate, settlDateLength);
            builder.append("\",\n");
        }

        if (hasFeeMultiplier())
        {
            indent(builder, level);
            builder.append("\"FeeMultiplier\": \"");
            feeMultiplier.appendTo(builder);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public TradeCaptureReportAckEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((TradeCaptureReportAckEncoder)encoder);
    }

    public TradeCaptureReportAckEncoder toEncoder(final TradeCaptureReportAckEncoder encoder)
    {
        encoder.reset();
        if (hasTradeReportID())
        {
            encoder.tradeReportID(this.tradeReportID(), 0, tradeReportIDLength());
        }

        if (hasTradeID())
        {
            encoder.tradeID(this.tradeID(), 0, tradeIDLength());
        }

        if (hasSecondaryTradeID())
        {
            encoder.secondaryTradeID(this.secondaryTradeID(), 0, secondaryTradeIDLength());
        }

        if (hasFirmTradeID())
        {
            encoder.firmTradeID(this.firmTradeID(), 0, firmTradeIDLength());
        }

        if (hasSecondaryFirmTradeID())
        {
            encoder.secondaryFirmTradeID(this.secondaryFirmTradeID(), 0, secondaryFirmTradeIDLength());
        }

        if (hasTradeReportTransType())
        {
            encoder.tradeReportTransType(this.tradeReportTransType());
        }

        if (hasTradeReportType())
        {
            encoder.tradeReportType(this.tradeReportType());
        }

        if (hasTrdType())
        {
            encoder.trdType(this.trdType());
        }

        if (hasTrdSubType())
        {
            encoder.trdSubType(this.trdSubType());
        }

        if (hasSecondaryTrdType())
        {
            encoder.secondaryTrdType(this.secondaryTrdType());
        }

        if (hasTradeHandlingInstr())
        {
            encoder.tradeHandlingInstr(this.tradeHandlingInstr());
        }

        if (hasOrigTradeHandlingInstr())
        {
            encoder.origTradeHandlingInstr(this.origTradeHandlingInstr());
        }

        if (hasOrigTradeDate())
        {
            encoder.origTradeDateAsCopy(this.origTradeDate(), 0, origTradeDateLength());
        }

        if (hasOrigTradeID())
        {
            encoder.origTradeID(this.origTradeID(), 0, origTradeIDLength());
        }

        if (hasOrigSecondaryTradeID())
        {
            encoder.origSecondaryTradeID(this.origSecondaryTradeID(), 0, origSecondaryTradeIDLength());
        }

        if (hasTransferReason())
        {
            encoder.transferReason(this.transferReason(), 0, transferReasonLength());
        }


        final RootPartiesEncoder rootParties = encoder.rootParties();        if (hasNoRootPartyIDsGroupCounter)
        {
            final int size = this.noRootPartyIDsGroupCounter;
            RootPartyIDsGroupDecoder rootPartyIDsGroup = this.rootPartyIDsGroup;
            RootPartyIDsGroupEncoder rootPartyIDsGroupEncoder = rootParties.rootPartyIDsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (rootPartyIDsGroup != null)
                {
                    rootPartyIDsGroup.toEncoder(rootPartyIDsGroupEncoder);
                    rootPartyIDsGroup = rootPartyIDsGroup.next();
                    rootPartyIDsGroupEncoder = rootPartyIDsGroupEncoder.next();
                }
            }
        }


        if (hasExecType())
        {
            encoder.execType(this.execType());
        }

        if (hasTradeReportRefID())
        {
            encoder.tradeReportRefID(this.tradeReportRefID(), 0, tradeReportRefIDLength());
        }

        if (hasSecondaryTradeReportRefID())
        {
            encoder.secondaryTradeReportRefID(this.secondaryTradeReportRefID(), 0, secondaryTradeReportRefIDLength());
        }

        if (hasTrdRptStatus())
        {
            encoder.trdRptStatus(this.trdRptStatus());
        }

        if (hasTradeReportRejectReason())
        {
            encoder.tradeReportRejectReason(this.tradeReportRejectReason());
        }

        if (hasSecondaryTradeReportID())
        {
            encoder.secondaryTradeReportID(this.secondaryTradeReportID(), 0, secondaryTradeReportIDLength());
        }

        if (hasSubscriptionRequestType())
        {
            encoder.subscriptionRequestType(this.subscriptionRequestType());
        }

        if (hasTradeLinkID())
        {
            encoder.tradeLinkID(this.tradeLinkID(), 0, tradeLinkIDLength());
        }

        if (hasTrdMatchID())
        {
            encoder.trdMatchID(this.trdMatchID(), 0, trdMatchIDLength());
        }

        if (hasExecID())
        {
            encoder.execID(this.execID(), 0, execIDLength());
        }

        if (hasSecondaryExecID())
        {
            encoder.secondaryExecID(this.secondaryExecID(), 0, secondaryExecIDLength());
        }

        if (hasExecRestatementReason())
        {
            encoder.execRestatementReason(this.execRestatementReason());
        }

        if (hasPreviouslyReported())
        {
            encoder.previouslyReported(this.previouslyReported());
        }

        if (hasPriceType())
        {
            encoder.priceType(this.priceType());
        }

        if (hasUnderlyingTradingSessionID())
        {
            encoder.underlyingTradingSessionID(this.underlyingTradingSessionID(), 0, underlyingTradingSessionIDLength());
        }

        if (hasUnderlyingTradingSessionSubID())
        {
            encoder.underlyingTradingSessionSubID(this.underlyingTradingSessionSubID(), 0, underlyingTradingSessionSubIDLength());
        }

        if (hasSettlSessID())
        {
            encoder.settlSessID(this.settlSessID(), 0, settlSessIDLength());
        }

        if (hasSettlSessSubID())
        {
            encoder.settlSessSubID(this.settlSessSubID(), 0, settlSessSubIDLength());
        }

        if (hasQtyType())
        {
            encoder.qtyType(this.qtyType());
        }

        if (hasLastQty())
        {
            encoder.lastQty(this.lastQty());
        }

        if (hasLastPx())
        {
            encoder.lastPx(this.lastPx());
        }

        if (hasVenueType())
        {
            encoder.venueType(this.venueType());
        }

        if (hasMarketSegmentID())
        {
            encoder.marketSegmentID(this.marketSegmentID(), 0, marketSegmentIDLength());
        }

        if (hasMarketID())
        {
            encoder.marketID(this.marketID(), 0, marketIDLength());
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



        if (hasLastParPx())
        {
            encoder.lastParPx(this.lastParPx());
        }

        if (hasCalculatedCcyLastQty())
        {
            encoder.calculatedCcyLastQty(this.calculatedCcyLastQty());
        }

        if (hasLastSwapPoints())
        {
            encoder.lastSwapPoints(this.lastSwapPoints());
        }

        if (hasCurrency())
        {
            encoder.currency(this.currency(), 0, currencyLength());
        }

        if (hasSettlCurrency())
        {
            encoder.settlCurrency(this.settlCurrency(), 0, settlCurrencyLength());
        }

        if (hasLastSpotRate())
        {
            encoder.lastSpotRate(this.lastSpotRate());
        }

        if (hasLastForwardPoints())
        {
            encoder.lastForwardPoints(this.lastForwardPoints());
        }

        if (hasLastMkt())
        {
            encoder.lastMkt(this.lastMkt(), 0, lastMktLength());
        }

        if (hasTradeDate())
        {
            encoder.tradeDateAsCopy(this.tradeDate(), 0, tradeDateLength());
        }

        if (hasClearingBusinessDate())
        {
            encoder.clearingBusinessDateAsCopy(this.clearingBusinessDate(), 0, clearingBusinessDateLength());
        }

        if (hasAvgPx())
        {
            encoder.avgPx(this.avgPx());
        }

        if (hasAvgPxIndicator())
        {
            encoder.avgPxIndicator(this.avgPxIndicator());
        }

        if (hasMultiLegReportingType())
        {
            encoder.multiLegReportingType(this.multiLegReportingType());
        }

        if (hasTradeLegRefID())
        {
            encoder.tradeLegRefID(this.tradeLegRefID(), 0, tradeLegRefIDLength());
        }

        if (hasTransactTime())
        {
            encoder.transactTimeAsCopy(this.transactTime(), 0, transactTimeLength());
        }

        if (hasSettlType())
        {
            encoder.settlType(this.settlType(), 0, settlTypeLength());
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


        if (hasMatchStatus())
        {
            encoder.matchStatus(this.matchStatus());
        }

        if (hasMatchType())
        {
            encoder.matchType(this.matchType(), 0, matchTypeLength());
        }

        if (hasCopyMsgIndicator())
        {
            encoder.copyMsgIndicator(this.copyMsgIndicator());
        }


        final TrdRepIndicatorsGrpEncoder trdRepIndicatorsGrp = encoder.trdRepIndicatorsGrp();        if (hasNoTrdRepIndicatorsGroupCounter)
        {
            final int size = this.noTrdRepIndicatorsGroupCounter;
            TrdRepIndicatorsGroupDecoder trdRepIndicatorsGroup = this.trdRepIndicatorsGroup;
            TrdRepIndicatorsGroupEncoder trdRepIndicatorsGroupEncoder = trdRepIndicatorsGrp.trdRepIndicatorsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (trdRepIndicatorsGroup != null)
                {
                    trdRepIndicatorsGroup.toEncoder(trdRepIndicatorsGroupEncoder);
                    trdRepIndicatorsGroup = trdRepIndicatorsGroup.next();
                    trdRepIndicatorsGroupEncoder = trdRepIndicatorsGroupEncoder.next();
                }
            }
        }


        if (hasPublishTrdIndicator())
        {
            encoder.publishTrdIndicator(this.publishTrdIndicator());
        }

        if (hasTradePublishIndicator())
        {
            encoder.tradePublishIndicator(this.tradePublishIndicator());
        }

        if (hasShortSaleReason())
        {
            encoder.shortSaleReason(this.shortSaleReason());
        }


        final TrdInstrmtLegGrpEncoder trdInstrmtLegGrp = encoder.trdInstrmtLegGrp();        if (hasNoLegsGroupCounter)
        {
            final int size = this.noLegsGroupCounter;
            LegsGroupDecoder legsGroup = this.legsGroup;
            LegsGroupEncoder legsGroupEncoder = trdInstrmtLegGrp.legsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (legsGroup != null)
                {
                    legsGroup.toEncoder(legsGroupEncoder);
                    legsGroup = legsGroup.next();
                    legsGroupEncoder = legsGroupEncoder.next();
                }
            }
        }



        final TrdRegTimestampsEncoder trdRegTimestamps = encoder.trdRegTimestamps();        if (hasNoTrdRegTimestampsGroupCounter)
        {
            final int size = this.noTrdRegTimestampsGroupCounter;
            TrdRegTimestampsGroupDecoder trdRegTimestampsGroup = this.trdRegTimestampsGroup;
            TrdRegTimestampsGroupEncoder trdRegTimestampsGroupEncoder = trdRegTimestamps.trdRegTimestampsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (trdRegTimestampsGroup != null)
                {
                    trdRegTimestampsGroup.toEncoder(trdRegTimestampsGroupEncoder);
                    trdRegTimestampsGroup = trdRegTimestampsGroup.next();
                    trdRegTimestampsGroupEncoder = trdRegTimestampsGroupEncoder.next();
                }
            }
        }


        if (hasResponseTransportType())
        {
            encoder.responseTransportType(this.responseTransportType());
        }

        if (hasResponseDestination())
        {
            encoder.responseDestination(this.responseDestination(), 0, responseDestinationLength());
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

        if (hasAsOfIndicator())
        {
            encoder.asOfIndicator(this.asOfIndicator());
        }

        if (hasClearingFeeIndicator())
        {
            encoder.clearingFeeIndicator(this.clearingFeeIndicator(), 0, clearingFeeIndicatorLength());
        }


        final PositionAmountDataEncoder positionAmountData = encoder.positionAmountData();        if (hasNoPosAmtGroupCounter)
        {
            final int size = this.noPosAmtGroupCounter;
            PosAmtGroupDecoder posAmtGroup = this.posAmtGroup;
            PosAmtGroupEncoder posAmtGroupEncoder = positionAmountData.posAmtGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (posAmtGroup != null)
                {
                    posAmtGroup.toEncoder(posAmtGroupEncoder);
                    posAmtGroup = posAmtGroup.next();
                    posAmtGroupEncoder = posAmtGroupEncoder.next();
                }
            }
        }


        if (hasTierCode())
        {
            encoder.tierCode(this.tierCode(), 0, tierCodeLength());
        }

        if (hasMessageEventSource())
        {
            encoder.messageEventSource(this.messageEventSource(), 0, messageEventSourceLength());
        }

        if (hasLastUpdateTime())
        {
            encoder.lastUpdateTimeAsCopy(this.lastUpdateTime(), 0, lastUpdateTimeLength());
        }

        if (hasRndPx())
        {
            encoder.rndPx(this.rndPx());
        }


        final TrdCapRptAckSideGrpEncoder trdCapRptAckSideGrp = encoder.trdCapRptAckSideGrp();        if (hasNoSidesGroupCounter)
        {
            final int size = this.noSidesGroupCounter;
            SidesGroupDecoder sidesGroup = this.sidesGroup;
            SidesGroupEncoder sidesGroupEncoder = trdCapRptAckSideGrp.sidesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (sidesGroup != null)
                {
                    sidesGroup.toEncoder(sidesGroupEncoder);
                    sidesGroup = sidesGroup.next();
                    sidesGroupEncoder = sidesGroupEncoder.next();
                }
            }
        }


        if (hasRptSys())
        {
            encoder.rptSys(this.rptSys(), 0, rptSysLength());
        }

        if (hasGrossTradeAmt())
        {
            encoder.grossTradeAmt(this.grossTradeAmt());
        }

        if (hasSettlDate())
        {
            encoder.settlDateAsCopy(this.settlDate(), 0, settlDateLength());
        }

        if (hasFeeMultiplier())
        {
            encoder.feeMultiplier(this.feeMultiplier());
        }
        return encoder;
    }

}
