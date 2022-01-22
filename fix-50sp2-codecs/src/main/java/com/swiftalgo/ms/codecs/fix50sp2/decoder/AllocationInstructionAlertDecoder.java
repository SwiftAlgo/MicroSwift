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
import com.swiftalgo.ms.codecs.fix50sp2.builder.AllocationInstructionAlertEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.OrdAllocGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.OrdAllocGrpEncoder.OrdersGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.NestedParties2Encoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.NestedParties2Encoder.Nested2PartyIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.NstdPtys2SubGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.NstdPtys2SubGrpEncoder.Nested2PartySubIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.ExecAllocGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.ExecAllocGrpEncoder.ExecsGroupEncoder;
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
import com.swiftalgo.ms.codecs.fix50sp2.builder.InstrumentExtensionEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.AttrbGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.AttrbGrpEncoder.InstrAttribGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.FinancingDetailsEncoder;
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
import com.swiftalgo.ms.codecs.fix50sp2.builder.InstrmtLegGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.InstrmtLegGrpEncoder.LegsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.InstrumentLegEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.LegSecAltIDGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.LegSecAltIDGrpEncoder.LegSecurityAltIDGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.SpreadOrBenchmarkCurveDataEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.PartiesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.PartiesEncoder.PartyIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.PtysSubGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.PtysSubGrpEncoder.PartySubIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.StipulationsEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.StipulationsEncoder.StipulationsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.YieldDataEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.PositionAmountDataEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.PositionAmountDataEncoder.PosAmtGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.AllocGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.AllocGrpEncoder.AllocsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.NestedPartiesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.NestedPartiesEncoder.NestedPartyIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.NstdPtysSubGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.NstdPtysSubGrpEncoder.NestedPartySubIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.CommissionDataEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.MiscFeesGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.MiscFeesGrpEncoder.MiscFeesGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.ClrInstGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.ClrInstGrpEncoder.ClearingInstructionsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.SettlInstructionsDataEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.DlvyInstGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.DlvyInstGrpEncoder.DlvyInstGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.SettlPartiesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.SettlPartiesEncoder.SettlPartyIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.SettlPtysSubGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.SettlPtysSubGrpEncoder.SettlPartySubIDsGroupEncoder;


public class AllocationInstructionAlertDecoder extends CommonDecoderImpl implements OrdAllocGrpDecoder, ExecAllocGrpDecoder, InstrumentDecoder, InstrumentExtensionDecoder, FinancingDetailsDecoder, UndInstrmtGrpDecoder, InstrmtLegGrpDecoder, SpreadOrBenchmarkCurveDataDecoder, PartiesDecoder, StipulationsDecoder, YieldDataDecoder, PositionAmountDataDecoder, AllocGrpDecoder, MessageDecoder
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(12);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            REQUIRED_FIELDS.add(Constants.ALLOC_ID);
            REQUIRED_FIELDS.add(Constants.ALLOC_TRANS_TYPE);
            REQUIRED_FIELDS.add(Constants.ALLOC_TYPE);
            REQUIRED_FIELDS.add(Constants.SIDE);
            REQUIRED_FIELDS.add(Constants.QUANTITY);
            REQUIRED_FIELDS.add(Constants.TRADE_DATE);
        }
    }

    public final IntHashSet GROUP_FIELDS = new IntHashSet(338);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            GROUP_FIELDS.add(Constants.ALLOC_ID);
            GROUP_FIELDS.add(Constants.ALLOC_TRANS_TYPE);
            GROUP_FIELDS.add(Constants.ALLOC_TYPE);
            GROUP_FIELDS.add(Constants.SECONDARY_ALLOC_ID);
            GROUP_FIELDS.add(Constants.REF_ALLOC_ID);
            GROUP_FIELDS.add(Constants.ALLOC_CANC_REPLACE_REASON);
            GROUP_FIELDS.add(Constants.ALLOC_INTERMED_REQ_TYPE);
            GROUP_FIELDS.add(Constants.ALLOC_LINK_ID);
            GROUP_FIELDS.add(Constants.ALLOC_LINK_TYPE);
            GROUP_FIELDS.add(Constants.BOOKING_REF_ID);
            GROUP_FIELDS.add(Constants.ALLOC_NO_ORDERS_TYPE);
            GROUP_FIELDS.add(Constants.PREVIOUSLY_REPORTED);
            GROUP_FIELDS.add(Constants.REVERSAL_INDICATOR);
            GROUP_FIELDS.add(Constants.MATCH_TYPE);
            GROUP_FIELDS.add(Constants.SIDE);
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
            GROUP_FIELDS.add(Constants.DELIVERY_FORM);
            GROUP_FIELDS.add(Constants.PCT_AT_RISK);
            GROUP_FIELDS.add(Constants.AGREEMENT_DESC);
            GROUP_FIELDS.add(Constants.AGREEMENT_ID);
            GROUP_FIELDS.add(Constants.AGREEMENT_DATE);
            GROUP_FIELDS.add(Constants.AGREEMENT_CURRENCY);
            GROUP_FIELDS.add(Constants.TERMINATION_TYPE);
            GROUP_FIELDS.add(Constants.START_DATE);
            GROUP_FIELDS.add(Constants.END_DATE);
            GROUP_FIELDS.add(Constants.DELIVERY_TYPE);
            GROUP_FIELDS.add(Constants.MARGIN_RATIO);
            GROUP_FIELDS.add(Constants.QUANTITY);
            GROUP_FIELDS.add(Constants.QTY_TYPE);
            GROUP_FIELDS.add(Constants.LAST_MKT);
            GROUP_FIELDS.add(Constants.TRADE_ORIGINATION_DATE);
            GROUP_FIELDS.add(Constants.TRADING_SESSION_ID);
            GROUP_FIELDS.add(Constants.TRADING_SESSION_SUB_ID);
            GROUP_FIELDS.add(Constants.PRICE_TYPE);
            GROUP_FIELDS.add(Constants.AVG_PX);
            GROUP_FIELDS.add(Constants.AVG_PAR_PX);
            GROUP_FIELDS.add(Constants.SPREAD);
            GROUP_FIELDS.add(Constants.BENCHMARK_CURVE_CURRENCY);
            GROUP_FIELDS.add(Constants.BENCHMARK_CURVE_NAME);
            GROUP_FIELDS.add(Constants.BENCHMARK_CURVE_POINT);
            GROUP_FIELDS.add(Constants.BENCHMARK_PRICE);
            GROUP_FIELDS.add(Constants.BENCHMARK_PRICE_TYPE);
            GROUP_FIELDS.add(Constants.BENCHMARK_SECURITY_ID);
            GROUP_FIELDS.add(Constants.BENCHMARK_SECURITY_ID_SOURCE);
            GROUP_FIELDS.add(Constants.CURRENCY);
            GROUP_FIELDS.add(Constants.AVG_PX_PRECISION);
            GROUP_FIELDS.add(Constants.TRADE_DATE);
            GROUP_FIELDS.add(Constants.TRANSACT_TIME);
            GROUP_FIELDS.add(Constants.SETTL_TYPE);
            GROUP_FIELDS.add(Constants.SETTL_DATE);
            GROUP_FIELDS.add(Constants.BOOKING_TYPE);
            GROUP_FIELDS.add(Constants.GROSS_TRADE_AMT);
            GROUP_FIELDS.add(Constants.CONCESSION);
            GROUP_FIELDS.add(Constants.TOTAL_TAKEDOWN);
            GROUP_FIELDS.add(Constants.NET_MONEY);
            GROUP_FIELDS.add(Constants.POSITION_EFFECT);
            GROUP_FIELDS.add(Constants.AUTO_ACCEPT_INDICATOR);
            GROUP_FIELDS.add(Constants.TEXT);
            GROUP_FIELDS.add(Constants.ENCODED_TEXT_LEN);
            GROUP_FIELDS.add(Constants.ENCODED_TEXT);
            GROUP_FIELDS.add(Constants.NUM_DAYS_INTEREST);
            GROUP_FIELDS.add(Constants.ACCRUED_INTEREST_RATE);
            GROUP_FIELDS.add(Constants.ACCRUED_INTEREST_AMT);
            GROUP_FIELDS.add(Constants.TOTAL_ACCRUED_INTEREST_AMT);
            GROUP_FIELDS.add(Constants.INTEREST_AT_MATURITY);
            GROUP_FIELDS.add(Constants.END_ACCRUED_INTEREST_AMT);
            GROUP_FIELDS.add(Constants.START_CASH);
            GROUP_FIELDS.add(Constants.END_CASH);
            GROUP_FIELDS.add(Constants.LEGAL_CONFIRM);
            GROUP_FIELDS.add(Constants.YIELD_TYPE);
            GROUP_FIELDS.add(Constants.YIELD);
            GROUP_FIELDS.add(Constants.YIELD_CALC_DATE);
            GROUP_FIELDS.add(Constants.YIELD_REDEMPTION_DATE);
            GROUP_FIELDS.add(Constants.YIELD_REDEMPTION_PRICE);
            GROUP_FIELDS.add(Constants.YIELD_REDEMPTION_PRICE_TYPE);
            GROUP_FIELDS.add(Constants.TOT_NO_ALLOCS);
            GROUP_FIELDS.add(Constants.LAST_FRAGMENT);
            GROUP_FIELDS.add(Constants.AVG_PX_INDICATOR);
            GROUP_FIELDS.add(Constants.CLEARING_BUSINESS_DATE);
            GROUP_FIELDS.add(Constants.TRD_TYPE);
            GROUP_FIELDS.add(Constants.TRD_SUB_TYPE);
            GROUP_FIELDS.add(Constants.CUST_ORDER_CAPACITY);
            GROUP_FIELDS.add(Constants.TRADE_INPUT_SOURCE);
            GROUP_FIELDS.add(Constants.MULTI_LEG_REPORTING_TYPE);
            GROUP_FIELDS.add(Constants.MESSAGE_EVENT_SOURCE);
            GROUP_FIELDS.add(Constants.RND_PX);
        }
    }

    private final IntHashSet alreadyVisitedFields = new IntHashSet(338);

    private final IntHashSet unknownFields = new IntHashSet(10);

    private final IntHashSet missingRequiredFields = new IntHashSet(12);

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
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !AllocTransType.isValid(allocTransType()))
        {
            invalidTagId = 71;
            rejectReason = 5;
            return false;
        }

        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !AllocType.isValid(allocType()))
        {
            invalidTagId = 626;
            rejectReason = 5;
            return false;
        }

        if (hasAllocCancReplaceReason)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !AllocCancReplaceReason.isValid(allocCancReplaceReason()))
        {
            invalidTagId = 796;
            rejectReason = 5;
            return false;
        }
        }

        if (hasAllocIntermedReqType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !AllocIntermedReqType.isValid(allocIntermedReqType()))
        {
            invalidTagId = 808;
            rejectReason = 5;
            return false;
        }
        }

        if (hasAllocLinkType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !AllocLinkType.isValid(allocLinkType()))
        {
            invalidTagId = 197;
            rejectReason = 5;
            return false;
        }
        }

        if (hasAllocNoOrdersType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !AllocNoOrdersType.isValid(allocNoOrdersType()))
        {
            invalidTagId = 857;
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

        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !Side.isValid(side()))
        {
            invalidTagId = 54;
            rejectReason = 5;
            return false;
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

        if (hasDeliveryForm)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !DeliveryForm.isValid(deliveryForm()))
        {
            invalidTagId = 668;
            rejectReason = 5;
            return false;
        }
        }

        if (hasTerminationType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !TerminationType.isValid(terminationType()))
        {
            invalidTagId = 788;
            rejectReason = 5;
            return false;
        }
        }

        if (hasDeliveryType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !DeliveryType.isValid(deliveryType()))
        {
            invalidTagId = 919;
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

        if (hasTradingSessionID)
        {
        tradingSessionIDWrapper.wrap(this.tradingSessionID(), tradingSessionIDLength);
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !TradingSessionID.isValid(tradingSessionIDWrapper))
        {
            invalidTagId = 336;
            rejectReason = 5;
            return false;
        }
        }

        if (hasTradingSessionSubID)
        {
        tradingSessionSubIDWrapper.wrap(this.tradingSessionSubID(), tradingSessionSubIDLength);
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !TradingSessionSubID.isValid(tradingSessionSubIDWrapper))
        {
            invalidTagId = 625;
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


        if (hasAvgPxIndicator)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !AvgPxIndicator.isValid(avgPxIndicator()))
        {
            invalidTagId = 819;
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

        if (hasCustOrderCapacity)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !CustOrderCapacity.isValid(custOrderCapacity()))
        {
            invalidTagId = 582;
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
        if (hasNoOrdersGroupCounter)
        {
            {
                int count = 0;
                final OrdersGroupIterator iterator = ordersGroupIterator.iterator();
                for (final OrdersGroupDecoder group : iterator)
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
                    invalidTagId = 73;
                    rejectReason = 16;
                    return false;
                }
            }
        }

        if (hasNoExecsGroupCounter)
        {
            {
                int count = 0;
                final ExecsGroupIterator iterator = execsGroupIterator.iterator();
                for (final ExecsGroupDecoder group : iterator)
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
                    invalidTagId = 124;
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

        if (hasNoInstrAttribGroupCounter)
        {
            {
                int count = 0;
                final InstrAttribGroupIterator iterator = instrAttribGroupIterator.iterator();
                for (final InstrAttribGroupDecoder group : iterator)
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
                    invalidTagId = 870;
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
        return true;
    }

    public static final long MESSAGE_TYPE = 19778L;

    public static final String MESSAGE_TYPE_AS_STRING = "BM";

    public static final char[] MESSAGE_TYPE_CHARS = MESSAGE_TYPE_AS_STRING.toCharArray();

    public static final byte[] MESSAGE_TYPE_BYTES = MESSAGE_TYPE_AS_STRING.getBytes(US_ASCII);

    public final IntHashSet messageFields = new IntHashSet(950);

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
        messageFields.add(Constants.ALLOC_ID);
        messageFields.add(Constants.ALLOC_TRANS_TYPE);
        messageFields.add(Constants.ALLOC_TYPE);
        messageFields.add(Constants.SECONDARY_ALLOC_ID);
        messageFields.add(Constants.REF_ALLOC_ID);
        messageFields.add(Constants.ALLOC_CANC_REPLACE_REASON);
        messageFields.add(Constants.ALLOC_INTERMED_REQ_TYPE);
        messageFields.add(Constants.ALLOC_LINK_ID);
        messageFields.add(Constants.ALLOC_LINK_TYPE);
        messageFields.add(Constants.BOOKING_REF_ID);
        messageFields.add(Constants.ALLOC_NO_ORDERS_TYPE);
        messageFields.add(Constants.NO_ORDERS_GROUP_COUNTER);
        messageFields.add(Constants.CL_ORD_ID);
        messageFields.add(Constants.ORDER_ID);
        messageFields.add(Constants.SECONDARY_ORDER_ID);
        messageFields.add(Constants.SECONDARY_CL_ORD_ID);
        messageFields.add(Constants.LIST_ID);
        messageFields.add(Constants.NO_NESTED2_PARTY_IDS_GROUP_COUNTER);
        messageFields.add(Constants.NESTED2_PARTY_ID);
        messageFields.add(Constants.NESTED2_PARTY_ID_SOURCE);
        messageFields.add(Constants.NESTED2_PARTY_ROLE);
        messageFields.add(Constants.NO_NESTED2_PARTY_SUB_IDS_GROUP_COUNTER);
        messageFields.add(Constants.NESTED2_PARTY_SUB_ID);
        messageFields.add(Constants.NESTED2_PARTY_SUB_ID_TYPE);
        messageFields.add(Constants.ORDER_QTY);
        messageFields.add(Constants.ORDER_AVG_PX);
        messageFields.add(Constants.ORDER_BOOKING_QTY);
        messageFields.add(Constants.NO_EXECS_GROUP_COUNTER);
        messageFields.add(Constants.LAST_QTY);
        messageFields.add(Constants.EXEC_ID);
        messageFields.add(Constants.SECONDARY_EXEC_ID);
        messageFields.add(Constants.LAST_PX);
        messageFields.add(Constants.LAST_PAR_PX);
        messageFields.add(Constants.LAST_CAPACITY);
        messageFields.add(Constants.TRADE_ID);
        messageFields.add(Constants.FIRM_TRADE_ID);
        messageFields.add(Constants.PREVIOUSLY_REPORTED);
        messageFields.add(Constants.REVERSAL_INDICATOR);
        messageFields.add(Constants.MATCH_TYPE);
        messageFields.add(Constants.SIDE);
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
        messageFields.add(Constants.DELIVERY_FORM);
        messageFields.add(Constants.PCT_AT_RISK);
        messageFields.add(Constants.NO_INSTR_ATTRIB_GROUP_COUNTER);
        messageFields.add(Constants.INSTR_ATTRIB_TYPE);
        messageFields.add(Constants.INSTR_ATTRIB_VALUE);
        messageFields.add(Constants.AGREEMENT_DESC);
        messageFields.add(Constants.AGREEMENT_ID);
        messageFields.add(Constants.AGREEMENT_DATE);
        messageFields.add(Constants.AGREEMENT_CURRENCY);
        messageFields.add(Constants.TERMINATION_TYPE);
        messageFields.add(Constants.START_DATE);
        messageFields.add(Constants.END_DATE);
        messageFields.add(Constants.DELIVERY_TYPE);
        messageFields.add(Constants.MARGIN_RATIO);
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
        messageFields.add(Constants.QUANTITY);
        messageFields.add(Constants.QTY_TYPE);
        messageFields.add(Constants.LAST_MKT);
        messageFields.add(Constants.TRADE_ORIGINATION_DATE);
        messageFields.add(Constants.TRADING_SESSION_ID);
        messageFields.add(Constants.TRADING_SESSION_SUB_ID);
        messageFields.add(Constants.PRICE_TYPE);
        messageFields.add(Constants.AVG_PX);
        messageFields.add(Constants.AVG_PAR_PX);
        messageFields.add(Constants.SPREAD);
        messageFields.add(Constants.BENCHMARK_CURVE_CURRENCY);
        messageFields.add(Constants.BENCHMARK_CURVE_NAME);
        messageFields.add(Constants.BENCHMARK_CURVE_POINT);
        messageFields.add(Constants.BENCHMARK_PRICE);
        messageFields.add(Constants.BENCHMARK_PRICE_TYPE);
        messageFields.add(Constants.BENCHMARK_SECURITY_ID);
        messageFields.add(Constants.BENCHMARK_SECURITY_ID_SOURCE);
        messageFields.add(Constants.CURRENCY);
        messageFields.add(Constants.AVG_PX_PRECISION);
        messageFields.add(Constants.NO_PARTY_IDS_GROUP_COUNTER);
        messageFields.add(Constants.PARTY_ID);
        messageFields.add(Constants.PARTY_ID_SOURCE);
        messageFields.add(Constants.PARTY_ROLE);
        messageFields.add(Constants.NO_PARTY_SUB_IDS_GROUP_COUNTER);
        messageFields.add(Constants.PARTY_SUB_ID);
        messageFields.add(Constants.PARTY_SUB_ID_TYPE);
        messageFields.add(Constants.TRADE_DATE);
        messageFields.add(Constants.TRANSACT_TIME);
        messageFields.add(Constants.SETTL_TYPE);
        messageFields.add(Constants.SETTL_DATE);
        messageFields.add(Constants.BOOKING_TYPE);
        messageFields.add(Constants.GROSS_TRADE_AMT);
        messageFields.add(Constants.CONCESSION);
        messageFields.add(Constants.TOTAL_TAKEDOWN);
        messageFields.add(Constants.NET_MONEY);
        messageFields.add(Constants.POSITION_EFFECT);
        messageFields.add(Constants.AUTO_ACCEPT_INDICATOR);
        messageFields.add(Constants.TEXT);
        messageFields.add(Constants.ENCODED_TEXT_LEN);
        messageFields.add(Constants.ENCODED_TEXT);
        messageFields.add(Constants.NUM_DAYS_INTEREST);
        messageFields.add(Constants.ACCRUED_INTEREST_RATE);
        messageFields.add(Constants.ACCRUED_INTEREST_AMT);
        messageFields.add(Constants.TOTAL_ACCRUED_INTEREST_AMT);
        messageFields.add(Constants.INTEREST_AT_MATURITY);
        messageFields.add(Constants.END_ACCRUED_INTEREST_AMT);
        messageFields.add(Constants.START_CASH);
        messageFields.add(Constants.END_CASH);
        messageFields.add(Constants.LEGAL_CONFIRM);
        messageFields.add(Constants.NO_STIPULATIONS_GROUP_COUNTER);
        messageFields.add(Constants.STIPULATION_TYPE);
        messageFields.add(Constants.STIPULATION_VALUE);
        messageFields.add(Constants.YIELD_TYPE);
        messageFields.add(Constants.YIELD);
        messageFields.add(Constants.YIELD_CALC_DATE);
        messageFields.add(Constants.YIELD_REDEMPTION_DATE);
        messageFields.add(Constants.YIELD_REDEMPTION_PRICE);
        messageFields.add(Constants.YIELD_REDEMPTION_PRICE_TYPE);
        messageFields.add(Constants.NO_POS_AMT_GROUP_COUNTER);
        messageFields.add(Constants.POS_AMT_TYPE);
        messageFields.add(Constants.POS_AMT);
        messageFields.add(Constants.POSITION_CURRENCY);
        messageFields.add(Constants.TOT_NO_ALLOCS);
        messageFields.add(Constants.LAST_FRAGMENT);
        messageFields.add(Constants.NO_ALLOCS_GROUP_COUNTER);
        messageFields.add(Constants.ALLOC_ACCOUNT);
        messageFields.add(Constants.ALLOC_ACCT_ID_SOURCE);
        messageFields.add(Constants.MATCH_STATUS);
        messageFields.add(Constants.ALLOC_PRICE);
        messageFields.add(Constants.ALLOC_QTY);
        messageFields.add(Constants.INDIVIDUAL_ALLOC_ID);
        messageFields.add(Constants.PROCESS_CODE);
        messageFields.add(Constants.SECONDARY_INDIVIDUAL_ALLOC_ID);
        messageFields.add(Constants.ALLOC_METHOD);
        messageFields.add(Constants.ALLOC_CUSTOMER_CAPACITY);
        messageFields.add(Constants.ALLOC_POSITION_EFFECT);
        messageFields.add(Constants.INDIVIDUAL_ALLOC_TYPE);
        messageFields.add(Constants.NO_NESTED_PARTY_IDS_GROUP_COUNTER);
        messageFields.add(Constants.NESTED_PARTY_ID);
        messageFields.add(Constants.NESTED_PARTY_ID_SOURCE);
        messageFields.add(Constants.NESTED_PARTY_ROLE);
        messageFields.add(Constants.NO_NESTED_PARTY_SUB_IDS_GROUP_COUNTER);
        messageFields.add(Constants.NESTED_PARTY_SUB_ID);
        messageFields.add(Constants.NESTED_PARTY_SUB_ID_TYPE);
        messageFields.add(Constants.NOTIFY_BROKER_OF_CREDIT);
        messageFields.add(Constants.ALLOC_HANDL_INST);
        messageFields.add(Constants.ALLOC_TEXT);
        messageFields.add(Constants.ENCODED_ALLOC_TEXT_LEN);
        messageFields.add(Constants.ENCODED_ALLOC_TEXT);
        messageFields.add(Constants.COMMISSION);
        messageFields.add(Constants.COMM_TYPE);
        messageFields.add(Constants.COMM_CURRENCY);
        messageFields.add(Constants.FUND_RENEW_WAIV);
        messageFields.add(Constants.ALLOC_AVG_PX);
        messageFields.add(Constants.ALLOC_NET_MONEY);
        messageFields.add(Constants.SETTL_CURR_AMT);
        messageFields.add(Constants.ALLOC_SETTL_CURR_AMT);
        messageFields.add(Constants.SETTL_CURRENCY);
        messageFields.add(Constants.ALLOC_SETTL_CURRENCY);
        messageFields.add(Constants.SETTL_CURR_FX_RATE);
        messageFields.add(Constants.SETTL_CURR_FX_RATE_CALC);
        messageFields.add(Constants.ALLOC_ACCRUED_INTEREST_AMT);
        messageFields.add(Constants.ALLOC_INTEREST_AT_MATURITY);
        messageFields.add(Constants.NO_MISC_FEES_GROUP_COUNTER);
        messageFields.add(Constants.MISC_FEE_AMT);
        messageFields.add(Constants.MISC_FEE_CURR);
        messageFields.add(Constants.MISC_FEE_TYPE);
        messageFields.add(Constants.MISC_FEE_BASIS);
        messageFields.add(Constants.NO_CLEARING_INSTRUCTIONS_GROUP_COUNTER);
        messageFields.add(Constants.CLEARING_INSTRUCTION);
        messageFields.add(Constants.CLEARING_FEE_INDICATOR);
        messageFields.add(Constants.ALLOC_SETTL_INST_TYPE);
        messageFields.add(Constants.SETTL_DELIVERY_TYPE);
        messageFields.add(Constants.STAND_INST_DB_TYPE);
        messageFields.add(Constants.STAND_INST_DB_NAME);
        messageFields.add(Constants.STAND_INST_DB_ID);
        messageFields.add(Constants.NO_DLVY_INST_GROUP_COUNTER);
        messageFields.add(Constants.SETTL_INST_SOURCE);
        messageFields.add(Constants.DLVY_INST_TYPE);
        messageFields.add(Constants.NO_SETTL_PARTY_IDS_GROUP_COUNTER);
        messageFields.add(Constants.SETTL_PARTY_ID);
        messageFields.add(Constants.SETTL_PARTY_ID_SOURCE);
        messageFields.add(Constants.SETTL_PARTY_ROLE);
        messageFields.add(Constants.NO_SETTL_PARTY_SUB_IDS_GROUP_COUNTER);
        messageFields.add(Constants.SETTL_PARTY_SUB_ID);
        messageFields.add(Constants.SETTL_PARTY_SUB_ID_TYPE);
        messageFields.add(Constants.AVG_PX_INDICATOR);
        messageFields.add(Constants.CLEARING_BUSINESS_DATE);
        messageFields.add(Constants.TRD_TYPE);
        messageFields.add(Constants.TRD_SUB_TYPE);
        messageFields.add(Constants.CUST_ORDER_CAPACITY);
        messageFields.add(Constants.TRADE_INPUT_SOURCE);
        messageFields.add(Constants.MULTI_LEG_REPORTING_TYPE);
        messageFields.add(Constants.MESSAGE_EVENT_SOURCE);
        messageFields.add(Constants.RND_PX);
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

    private char[] allocID = new char[1];

    public char[] allocID()
    {
        return allocID;
    }


    private int allocIDOffset;

    private int allocIDLength;

    public int allocIDLength()
    {
        return allocIDLength;
    }

    public String allocIDAsString()
    {
        return new String(allocID, 0, allocIDLength);
    }

    public void allocID(final AsciiSequenceView view)
    {
        view.wrap(buffer, allocIDOffset, allocIDLength);
    }


    private final CharArrayWrapper allocIDWrapper = new CharArrayWrapper();
    private char allocTransType = MISSING_CHAR;

    public char allocTransType()
    {
        return allocTransType;
    }



    private final CharArrayWrapper allocTransTypeWrapper = new CharArrayWrapper();
    public AllocTransType allocTransTypeAsEnum()
    {
        return AllocTransType.decode(allocTransType);
    }

    private int allocType = MISSING_INT;

    public int allocType()
    {
        return allocType;
    }



    private final CharArrayWrapper allocTypeWrapper = new CharArrayWrapper();
    public AllocType allocTypeAsEnum()
    {
        return AllocType.decode(allocType);
    }

    private char[] secondaryAllocID = new char[1];

    private boolean hasSecondaryAllocID;

    public char[] secondaryAllocID()
    {
        if (!hasSecondaryAllocID)
        {
            throw new IllegalArgumentException("No value for optional field: SecondaryAllocID");
        }

        return secondaryAllocID;
    }

    public boolean hasSecondaryAllocID()
    {
        return hasSecondaryAllocID;
    }


    private int secondaryAllocIDOffset;

    private int secondaryAllocIDLength;

    public int secondaryAllocIDLength()
    {
        if (!hasSecondaryAllocID)
        {
            throw new IllegalArgumentException("No value for optional field: SecondaryAllocID");
        }

        return secondaryAllocIDLength;
    }

    public String secondaryAllocIDAsString()
    {
        return hasSecondaryAllocID ? new String(secondaryAllocID, 0, secondaryAllocIDLength) : null;
    }

    public void secondaryAllocID(final AsciiSequenceView view)
    {
        if (!hasSecondaryAllocID)
        {
            throw new IllegalArgumentException("No value for optional field: SecondaryAllocID");
        }

        view.wrap(buffer, secondaryAllocIDOffset, secondaryAllocIDLength);
    }


    private final CharArrayWrapper secondaryAllocIDWrapper = new CharArrayWrapper();
    private char[] refAllocID = new char[1];

    private boolean hasRefAllocID;

    public char[] refAllocID()
    {
        if (!hasRefAllocID)
        {
            throw new IllegalArgumentException("No value for optional field: RefAllocID");
        }

        return refAllocID;
    }

    public boolean hasRefAllocID()
    {
        return hasRefAllocID;
    }


    private int refAllocIDOffset;

    private int refAllocIDLength;

    public int refAllocIDLength()
    {
        if (!hasRefAllocID)
        {
            throw new IllegalArgumentException("No value for optional field: RefAllocID");
        }

        return refAllocIDLength;
    }

    public String refAllocIDAsString()
    {
        return hasRefAllocID ? new String(refAllocID, 0, refAllocIDLength) : null;
    }

    public void refAllocID(final AsciiSequenceView view)
    {
        if (!hasRefAllocID)
        {
            throw new IllegalArgumentException("No value for optional field: RefAllocID");
        }

        view.wrap(buffer, refAllocIDOffset, refAllocIDLength);
    }


    private final CharArrayWrapper refAllocIDWrapper = new CharArrayWrapper();
    private int allocCancReplaceReason = MISSING_INT;

    private boolean hasAllocCancReplaceReason;

    public int allocCancReplaceReason()
    {
        if (!hasAllocCancReplaceReason)
        {
            throw new IllegalArgumentException("No value for optional field: AllocCancReplaceReason");
        }

        return allocCancReplaceReason;
    }

    public boolean hasAllocCancReplaceReason()
    {
        return hasAllocCancReplaceReason;
    }



    private final CharArrayWrapper allocCancReplaceReasonWrapper = new CharArrayWrapper();
    public AllocCancReplaceReason allocCancReplaceReasonAsEnum()
    {
        if (!hasAllocCancReplaceReason)
 return AllocCancReplaceReason.NULL_VAL;
        return AllocCancReplaceReason.decode(allocCancReplaceReason);
    }

    private int allocIntermedReqType = MISSING_INT;

    private boolean hasAllocIntermedReqType;

    public int allocIntermedReqType()
    {
        if (!hasAllocIntermedReqType)
        {
            throw new IllegalArgumentException("No value for optional field: AllocIntermedReqType");
        }

        return allocIntermedReqType;
    }

    public boolean hasAllocIntermedReqType()
    {
        return hasAllocIntermedReqType;
    }



    private final CharArrayWrapper allocIntermedReqTypeWrapper = new CharArrayWrapper();
    public AllocIntermedReqType allocIntermedReqTypeAsEnum()
    {
        if (!hasAllocIntermedReqType)
 return AllocIntermedReqType.NULL_VAL;
        return AllocIntermedReqType.decode(allocIntermedReqType);
    }

    private char[] allocLinkID = new char[1];

    private boolean hasAllocLinkID;

    public char[] allocLinkID()
    {
        if (!hasAllocLinkID)
        {
            throw new IllegalArgumentException("No value for optional field: AllocLinkID");
        }

        return allocLinkID;
    }

    public boolean hasAllocLinkID()
    {
        return hasAllocLinkID;
    }


    private int allocLinkIDOffset;

    private int allocLinkIDLength;

    public int allocLinkIDLength()
    {
        if (!hasAllocLinkID)
        {
            throw new IllegalArgumentException("No value for optional field: AllocLinkID");
        }

        return allocLinkIDLength;
    }

    public String allocLinkIDAsString()
    {
        return hasAllocLinkID ? new String(allocLinkID, 0, allocLinkIDLength) : null;
    }

    public void allocLinkID(final AsciiSequenceView view)
    {
        if (!hasAllocLinkID)
        {
            throw new IllegalArgumentException("No value for optional field: AllocLinkID");
        }

        view.wrap(buffer, allocLinkIDOffset, allocLinkIDLength);
    }


    private final CharArrayWrapper allocLinkIDWrapper = new CharArrayWrapper();
    private int allocLinkType = MISSING_INT;

    private boolean hasAllocLinkType;

    public int allocLinkType()
    {
        if (!hasAllocLinkType)
        {
            throw new IllegalArgumentException("No value for optional field: AllocLinkType");
        }

        return allocLinkType;
    }

    public boolean hasAllocLinkType()
    {
        return hasAllocLinkType;
    }



    private final CharArrayWrapper allocLinkTypeWrapper = new CharArrayWrapper();
    public AllocLinkType allocLinkTypeAsEnum()
    {
        if (!hasAllocLinkType)
 return AllocLinkType.NULL_VAL;
        return AllocLinkType.decode(allocLinkType);
    }

    private char[] bookingRefID = new char[1];

    private boolean hasBookingRefID;

    public char[] bookingRefID()
    {
        if (!hasBookingRefID)
        {
            throw new IllegalArgumentException("No value for optional field: BookingRefID");
        }

        return bookingRefID;
    }

    public boolean hasBookingRefID()
    {
        return hasBookingRefID;
    }


    private int bookingRefIDOffset;

    private int bookingRefIDLength;

    public int bookingRefIDLength()
    {
        if (!hasBookingRefID)
        {
            throw new IllegalArgumentException("No value for optional field: BookingRefID");
        }

        return bookingRefIDLength;
    }

    public String bookingRefIDAsString()
    {
        return hasBookingRefID ? new String(bookingRefID, 0, bookingRefIDLength) : null;
    }

    public void bookingRefID(final AsciiSequenceView view)
    {
        if (!hasBookingRefID)
        {
            throw new IllegalArgumentException("No value for optional field: BookingRefID");
        }

        view.wrap(buffer, bookingRefIDOffset, bookingRefIDLength);
    }


    private final CharArrayWrapper bookingRefIDWrapper = new CharArrayWrapper();
    private int allocNoOrdersType = MISSING_INT;

    private boolean hasAllocNoOrdersType;

    public int allocNoOrdersType()
    {
        if (!hasAllocNoOrdersType)
        {
            throw new IllegalArgumentException("No value for optional field: AllocNoOrdersType");
        }

        return allocNoOrdersType;
    }

    public boolean hasAllocNoOrdersType()
    {
        return hasAllocNoOrdersType;
    }



    private final CharArrayWrapper allocNoOrdersTypeWrapper = new CharArrayWrapper();
    public AllocNoOrdersType allocNoOrdersTypeAsEnum()
    {
        if (!hasAllocNoOrdersType)
 return AllocNoOrdersType.NULL_VAL;
        return AllocNoOrdersType.decode(allocNoOrdersType);
    }



    private OrdersGroupDecoder ordersGroup = null;
    public OrdersGroupDecoder ordersGroup()
    {
        return ordersGroup;
    }

    private int noOrdersGroupCounter = MISSING_INT;

    private boolean hasNoOrdersGroupCounter;

    public int noOrdersGroupCounter()
    {
        if (!hasNoOrdersGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoOrdersGroupCounter");
        }

        return noOrdersGroupCounter;
    }

    public boolean hasNoOrdersGroupCounter()
    {
        return hasNoOrdersGroupCounter;
    }




    private OrdersGroupIterator ordersGroupIterator = new OrdersGroupIterator(this);
    public OrdersGroupIterator ordersGroupIterator()
    {
        return ordersGroupIterator.iterator();
    }




    private ExecsGroupDecoder execsGroup = null;
    public ExecsGroupDecoder execsGroup()
    {
        return execsGroup;
    }

    private int noExecsGroupCounter = MISSING_INT;

    private boolean hasNoExecsGroupCounter;

    public int noExecsGroupCounter()
    {
        if (!hasNoExecsGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoExecsGroupCounter");
        }

        return noExecsGroupCounter;
    }

    public boolean hasNoExecsGroupCounter()
    {
        return hasNoExecsGroupCounter;
    }




    private ExecsGroupIterator execsGroupIterator = new ExecsGroupIterator(this);
    public ExecsGroupIterator execsGroupIterator()
    {
        return execsGroupIterator.iterator();
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



    private boolean reversalIndicator;

    private boolean hasReversalIndicator;

    public boolean reversalIndicator()
    {
        if (!hasReversalIndicator)
        {
            throw new IllegalArgumentException("No value for optional field: ReversalIndicator");
        }

        return reversalIndicator;
    }

    public boolean hasReversalIndicator()
    {
        return hasReversalIndicator;
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




    private int deliveryForm = MISSING_INT;

    private boolean hasDeliveryForm;

    public int deliveryForm()
    {
        if (!hasDeliveryForm)
        {
            throw new IllegalArgumentException("No value for optional field: DeliveryForm");
        }

        return deliveryForm;
    }

    public boolean hasDeliveryForm()
    {
        return hasDeliveryForm;
    }



    private final CharArrayWrapper deliveryFormWrapper = new CharArrayWrapper();
    public DeliveryForm deliveryFormAsEnum()
    {
        if (!hasDeliveryForm)
 return DeliveryForm.NULL_VAL;
        return DeliveryForm.decode(deliveryForm);
    }

    private DecimalFloat pctAtRisk = DecimalFloat.newNaNValue();

    private boolean hasPctAtRisk;

    public DecimalFloat pctAtRisk()
    {
        if (!hasPctAtRisk)
        {
            throw new IllegalArgumentException("No value for optional field: PctAtRisk");
        }

        return pctAtRisk;
    }

    public boolean hasPctAtRisk()
    {
        return hasPctAtRisk;
    }





    private InstrAttribGroupDecoder instrAttribGroup = null;
    public InstrAttribGroupDecoder instrAttribGroup()
    {
        return instrAttribGroup;
    }

    private int noInstrAttribGroupCounter = MISSING_INT;

    private boolean hasNoInstrAttribGroupCounter;

    public int noInstrAttribGroupCounter()
    {
        if (!hasNoInstrAttribGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoInstrAttribGroupCounter");
        }

        return noInstrAttribGroupCounter;
    }

    public boolean hasNoInstrAttribGroupCounter()
    {
        return hasNoInstrAttribGroupCounter;
    }




    private InstrAttribGroupIterator instrAttribGroupIterator = new InstrAttribGroupIterator(this);
    public InstrAttribGroupIterator instrAttribGroupIterator()
    {
        return instrAttribGroupIterator.iterator();
    }




    private char[] agreementDesc = new char[1];

    private boolean hasAgreementDesc;

    public char[] agreementDesc()
    {
        if (!hasAgreementDesc)
        {
            throw new IllegalArgumentException("No value for optional field: AgreementDesc");
        }

        return agreementDesc;
    }

    public boolean hasAgreementDesc()
    {
        return hasAgreementDesc;
    }


    private int agreementDescOffset;

    private int agreementDescLength;

    public int agreementDescLength()
    {
        if (!hasAgreementDesc)
        {
            throw new IllegalArgumentException("No value for optional field: AgreementDesc");
        }

        return agreementDescLength;
    }

    public String agreementDescAsString()
    {
        return hasAgreementDesc ? new String(agreementDesc, 0, agreementDescLength) : null;
    }

    public void agreementDesc(final AsciiSequenceView view)
    {
        if (!hasAgreementDesc)
        {
            throw new IllegalArgumentException("No value for optional field: AgreementDesc");
        }

        view.wrap(buffer, agreementDescOffset, agreementDescLength);
    }


    private final CharArrayWrapper agreementDescWrapper = new CharArrayWrapper();
    private char[] agreementID = new char[1];

    private boolean hasAgreementID;

    public char[] agreementID()
    {
        if (!hasAgreementID)
        {
            throw new IllegalArgumentException("No value for optional field: AgreementID");
        }

        return agreementID;
    }

    public boolean hasAgreementID()
    {
        return hasAgreementID;
    }


    private int agreementIDOffset;

    private int agreementIDLength;

    public int agreementIDLength()
    {
        if (!hasAgreementID)
        {
            throw new IllegalArgumentException("No value for optional field: AgreementID");
        }

        return agreementIDLength;
    }

    public String agreementIDAsString()
    {
        return hasAgreementID ? new String(agreementID, 0, agreementIDLength) : null;
    }

    public void agreementID(final AsciiSequenceView view)
    {
        if (!hasAgreementID)
        {
            throw new IllegalArgumentException("No value for optional field: AgreementID");
        }

        view.wrap(buffer, agreementIDOffset, agreementIDLength);
    }


    private final CharArrayWrapper agreementIDWrapper = new CharArrayWrapper();
    private byte[] agreementDate = new byte[8];

    private boolean hasAgreementDate;

    public byte[] agreementDate()
    {
        if (!hasAgreementDate)
        {
            throw new IllegalArgumentException("No value for optional field: AgreementDate");
        }

        return agreementDate;
    }

    public boolean hasAgreementDate()
    {
        return hasAgreementDate;
    }


    private int agreementDateOffset;

    private int agreementDateLength;

    public int agreementDateLength()
    {
        if (!hasAgreementDate)
        {
            throw new IllegalArgumentException("No value for optional field: AgreementDate");
        }

        return agreementDateLength;
    }

    public String agreementDateAsString()
    {
        return hasAgreementDate ? new String(agreementDate, 0, agreementDateLength) : null;
    }

    public void agreementDate(final AsciiSequenceView view)
    {
        if (!hasAgreementDate)
        {
            throw new IllegalArgumentException("No value for optional field: AgreementDate");
        }

        view.wrap(buffer, agreementDateOffset, agreementDateLength);
    }


    private char[] agreementCurrency = new char[1];

    private boolean hasAgreementCurrency;

    public char[] agreementCurrency()
    {
        if (!hasAgreementCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: AgreementCurrency");
        }

        return agreementCurrency;
    }

    public boolean hasAgreementCurrency()
    {
        return hasAgreementCurrency;
    }


    private int agreementCurrencyOffset;

    private int agreementCurrencyLength;

    public int agreementCurrencyLength()
    {
        if (!hasAgreementCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: AgreementCurrency");
        }

        return agreementCurrencyLength;
    }

    public String agreementCurrencyAsString()
    {
        return hasAgreementCurrency ? new String(agreementCurrency, 0, agreementCurrencyLength) : null;
    }

    public void agreementCurrency(final AsciiSequenceView view)
    {
        if (!hasAgreementCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: AgreementCurrency");
        }

        view.wrap(buffer, agreementCurrencyOffset, agreementCurrencyLength);
    }


    private int terminationType = MISSING_INT;

    private boolean hasTerminationType;

    public int terminationType()
    {
        if (!hasTerminationType)
        {
            throw new IllegalArgumentException("No value for optional field: TerminationType");
        }

        return terminationType;
    }

    public boolean hasTerminationType()
    {
        return hasTerminationType;
    }



    private final CharArrayWrapper terminationTypeWrapper = new CharArrayWrapper();
    public TerminationType terminationTypeAsEnum()
    {
        if (!hasTerminationType)
 return TerminationType.NULL_VAL;
        return TerminationType.decode(terminationType);
    }

    private byte[] startDate = new byte[8];

    private boolean hasStartDate;

    public byte[] startDate()
    {
        if (!hasStartDate)
        {
            throw new IllegalArgumentException("No value for optional field: StartDate");
        }

        return startDate;
    }

    public boolean hasStartDate()
    {
        return hasStartDate;
    }


    private int startDateOffset;

    private int startDateLength;

    public int startDateLength()
    {
        if (!hasStartDate)
        {
            throw new IllegalArgumentException("No value for optional field: StartDate");
        }

        return startDateLength;
    }

    public String startDateAsString()
    {
        return hasStartDate ? new String(startDate, 0, startDateLength) : null;
    }

    public void startDate(final AsciiSequenceView view)
    {
        if (!hasStartDate)
        {
            throw new IllegalArgumentException("No value for optional field: StartDate");
        }

        view.wrap(buffer, startDateOffset, startDateLength);
    }


    private byte[] endDate = new byte[8];

    private boolean hasEndDate;

    public byte[] endDate()
    {
        if (!hasEndDate)
        {
            throw new IllegalArgumentException("No value for optional field: EndDate");
        }

        return endDate;
    }

    public boolean hasEndDate()
    {
        return hasEndDate;
    }


    private int endDateOffset;

    private int endDateLength;

    public int endDateLength()
    {
        if (!hasEndDate)
        {
            throw new IllegalArgumentException("No value for optional field: EndDate");
        }

        return endDateLength;
    }

    public String endDateAsString()
    {
        return hasEndDate ? new String(endDate, 0, endDateLength) : null;
    }

    public void endDate(final AsciiSequenceView view)
    {
        if (!hasEndDate)
        {
            throw new IllegalArgumentException("No value for optional field: EndDate");
        }

        view.wrap(buffer, endDateOffset, endDateLength);
    }


    private int deliveryType = MISSING_INT;

    private boolean hasDeliveryType;

    public int deliveryType()
    {
        if (!hasDeliveryType)
        {
            throw new IllegalArgumentException("No value for optional field: DeliveryType");
        }

        return deliveryType;
    }

    public boolean hasDeliveryType()
    {
        return hasDeliveryType;
    }



    private final CharArrayWrapper deliveryTypeWrapper = new CharArrayWrapper();
    public DeliveryType deliveryTypeAsEnum()
    {
        if (!hasDeliveryType)
 return DeliveryType.NULL_VAL;
        return DeliveryType.decode(deliveryType);
    }

    private DecimalFloat marginRatio = DecimalFloat.newNaNValue();

    private boolean hasMarginRatio;

    public DecimalFloat marginRatio()
    {
        if (!hasMarginRatio)
        {
            throw new IllegalArgumentException("No value for optional field: MarginRatio");
        }

        return marginRatio;
    }

    public boolean hasMarginRatio()
    {
        return hasMarginRatio;
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


    private DecimalFloat quantity = DecimalFloat.newNaNValue();

    public DecimalFloat quantity()
    {
        return quantity;
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


    private char[] tradingSessionID = new char[1];

    private boolean hasTradingSessionID;

    public char[] tradingSessionID()
    {
        if (!hasTradingSessionID)
        {
            throw new IllegalArgumentException("No value for optional field: TradingSessionID");
        }

        return tradingSessionID;
    }

    public boolean hasTradingSessionID()
    {
        return hasTradingSessionID;
    }


    private int tradingSessionIDOffset;

    private int tradingSessionIDLength;

    public int tradingSessionIDLength()
    {
        if (!hasTradingSessionID)
        {
            throw new IllegalArgumentException("No value for optional field: TradingSessionID");
        }

        return tradingSessionIDLength;
    }

    public String tradingSessionIDAsString()
    {
        return hasTradingSessionID ? new String(tradingSessionID, 0, tradingSessionIDLength) : null;
    }

    public void tradingSessionID(final AsciiSequenceView view)
    {
        if (!hasTradingSessionID)
        {
            throw new IllegalArgumentException("No value for optional field: TradingSessionID");
        }

        view.wrap(buffer, tradingSessionIDOffset, tradingSessionIDLength);
    }


    private final CharArrayWrapper tradingSessionIDWrapper = new CharArrayWrapper();
    public TradingSessionID tradingSessionIDAsEnum()
    {
        if (!hasTradingSessionID)
 return TradingSessionID.NULL_VAL;
        tradingSessionIDWrapper.wrap(this.tradingSessionID(), tradingSessionIDLength);
        return TradingSessionID.decode(tradingSessionIDWrapper);
    }

    private char[] tradingSessionSubID = new char[1];

    private boolean hasTradingSessionSubID;

    public char[] tradingSessionSubID()
    {
        if (!hasTradingSessionSubID)
        {
            throw new IllegalArgumentException("No value for optional field: TradingSessionSubID");
        }

        return tradingSessionSubID;
    }

    public boolean hasTradingSessionSubID()
    {
        return hasTradingSessionSubID;
    }


    private int tradingSessionSubIDOffset;

    private int tradingSessionSubIDLength;

    public int tradingSessionSubIDLength()
    {
        if (!hasTradingSessionSubID)
        {
            throw new IllegalArgumentException("No value for optional field: TradingSessionSubID");
        }

        return tradingSessionSubIDLength;
    }

    public String tradingSessionSubIDAsString()
    {
        return hasTradingSessionSubID ? new String(tradingSessionSubID, 0, tradingSessionSubIDLength) : null;
    }

    public void tradingSessionSubID(final AsciiSequenceView view)
    {
        if (!hasTradingSessionSubID)
        {
            throw new IllegalArgumentException("No value for optional field: TradingSessionSubID");
        }

        view.wrap(buffer, tradingSessionSubIDOffset, tradingSessionSubIDLength);
    }


    private final CharArrayWrapper tradingSessionSubIDWrapper = new CharArrayWrapper();
    public TradingSessionSubID tradingSessionSubIDAsEnum()
    {
        if (!hasTradingSessionSubID)
 return TradingSessionSubID.NULL_VAL;
        tradingSessionSubIDWrapper.wrap(this.tradingSessionSubID(), tradingSessionSubIDLength);
        return TradingSessionSubID.decode(tradingSessionSubIDWrapper);
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



    private DecimalFloat avgParPx = DecimalFloat.newNaNValue();

    private boolean hasAvgParPx;

    public DecimalFloat avgParPx()
    {
        if (!hasAvgParPx)
        {
            throw new IllegalArgumentException("No value for optional field: AvgParPx");
        }

        return avgParPx;
    }

    public boolean hasAvgParPx()
    {
        return hasAvgParPx;
    }




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


    private int avgPxPrecision = MISSING_INT;

    private boolean hasAvgPxPrecision;

    public int avgPxPrecision()
    {
        if (!hasAvgPxPrecision)
        {
            throw new IllegalArgumentException("No value for optional field: AvgPxPrecision");
        }

        return avgPxPrecision;
    }

    public boolean hasAvgPxPrecision()
    {
        return hasAvgPxPrecision;
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


    private byte[] tradeDate = new byte[8];

    public byte[] tradeDate()
    {
        return tradeDate;
    }


    private int tradeDateOffset;

    private int tradeDateLength;

    public int tradeDateLength()
    {
        return tradeDateLength;
    }

    public String tradeDateAsString()
    {
        return new String(tradeDate, 0, tradeDateLength);
    }

    public void tradeDate(final AsciiSequenceView view)
    {
        view.wrap(buffer, tradeDateOffset, tradeDateLength);
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



    private DecimalFloat concession = DecimalFloat.newNaNValue();

    private boolean hasConcession;

    public DecimalFloat concession()
    {
        if (!hasConcession)
        {
            throw new IllegalArgumentException("No value for optional field: Concession");
        }

        return concession;
    }

    public boolean hasConcession()
    {
        return hasConcession;
    }



    private DecimalFloat totalTakedown = DecimalFloat.newNaNValue();

    private boolean hasTotalTakedown;

    public DecimalFloat totalTakedown()
    {
        if (!hasTotalTakedown)
        {
            throw new IllegalArgumentException("No value for optional field: TotalTakedown");
        }

        return totalTakedown;
    }

    public boolean hasTotalTakedown()
    {
        return hasTotalTakedown;
    }



    private DecimalFloat netMoney = DecimalFloat.newNaNValue();

    private boolean hasNetMoney;

    public DecimalFloat netMoney()
    {
        if (!hasNetMoney)
        {
            throw new IllegalArgumentException("No value for optional field: NetMoney");
        }

        return netMoney;
    }

    public boolean hasNetMoney()
    {
        return hasNetMoney;
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

    private boolean autoAcceptIndicator;

    private boolean hasAutoAcceptIndicator;

    public boolean autoAcceptIndicator()
    {
        if (!hasAutoAcceptIndicator)
        {
            throw new IllegalArgumentException("No value for optional field: AutoAcceptIndicator");
        }

        return autoAcceptIndicator;
    }

    public boolean hasAutoAcceptIndicator()
    {
        return hasAutoAcceptIndicator;
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



    private int numDaysInterest = MISSING_INT;

    private boolean hasNumDaysInterest;

    public int numDaysInterest()
    {
        if (!hasNumDaysInterest)
        {
            throw new IllegalArgumentException("No value for optional field: NumDaysInterest");
        }

        return numDaysInterest;
    }

    public boolean hasNumDaysInterest()
    {
        return hasNumDaysInterest;
    }



    private DecimalFloat accruedInterestRate = DecimalFloat.newNaNValue();

    private boolean hasAccruedInterestRate;

    public DecimalFloat accruedInterestRate()
    {
        if (!hasAccruedInterestRate)
        {
            throw new IllegalArgumentException("No value for optional field: AccruedInterestRate");
        }

        return accruedInterestRate;
    }

    public boolean hasAccruedInterestRate()
    {
        return hasAccruedInterestRate;
    }



    private DecimalFloat accruedInterestAmt = DecimalFloat.newNaNValue();

    private boolean hasAccruedInterestAmt;

    public DecimalFloat accruedInterestAmt()
    {
        if (!hasAccruedInterestAmt)
        {
            throw new IllegalArgumentException("No value for optional field: AccruedInterestAmt");
        }

        return accruedInterestAmt;
    }

    public boolean hasAccruedInterestAmt()
    {
        return hasAccruedInterestAmt;
    }



    private DecimalFloat totalAccruedInterestAmt = DecimalFloat.newNaNValue();

    private boolean hasTotalAccruedInterestAmt;

    public DecimalFloat totalAccruedInterestAmt()
    {
        if (!hasTotalAccruedInterestAmt)
        {
            throw new IllegalArgumentException("No value for optional field: TotalAccruedInterestAmt");
        }

        return totalAccruedInterestAmt;
    }

    public boolean hasTotalAccruedInterestAmt()
    {
        return hasTotalAccruedInterestAmt;
    }



    private DecimalFloat interestAtMaturity = DecimalFloat.newNaNValue();

    private boolean hasInterestAtMaturity;

    public DecimalFloat interestAtMaturity()
    {
        if (!hasInterestAtMaturity)
        {
            throw new IllegalArgumentException("No value for optional field: InterestAtMaturity");
        }

        return interestAtMaturity;
    }

    public boolean hasInterestAtMaturity()
    {
        return hasInterestAtMaturity;
    }



    private DecimalFloat endAccruedInterestAmt = DecimalFloat.newNaNValue();

    private boolean hasEndAccruedInterestAmt;

    public DecimalFloat endAccruedInterestAmt()
    {
        if (!hasEndAccruedInterestAmt)
        {
            throw new IllegalArgumentException("No value for optional field: EndAccruedInterestAmt");
        }

        return endAccruedInterestAmt;
    }

    public boolean hasEndAccruedInterestAmt()
    {
        return hasEndAccruedInterestAmt;
    }



    private DecimalFloat startCash = DecimalFloat.newNaNValue();

    private boolean hasStartCash;

    public DecimalFloat startCash()
    {
        if (!hasStartCash)
        {
            throw new IllegalArgumentException("No value for optional field: StartCash");
        }

        return startCash;
    }

    public boolean hasStartCash()
    {
        return hasStartCash;
    }



    private DecimalFloat endCash = DecimalFloat.newNaNValue();

    private boolean hasEndCash;

    public DecimalFloat endCash()
    {
        if (!hasEndCash)
        {
            throw new IllegalArgumentException("No value for optional field: EndCash");
        }

        return endCash;
    }

    public boolean hasEndCash()
    {
        return hasEndCash;
    }



    private boolean legalConfirm;

    private boolean hasLegalConfirm;

    public boolean legalConfirm()
    {
        if (!hasLegalConfirm)
        {
            throw new IllegalArgumentException("No value for optional field: LegalConfirm");
        }

        return legalConfirm;
    }

    public boolean hasLegalConfirm()
    {
        return hasLegalConfirm;
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


    private int totNoAllocs = MISSING_INT;

    private boolean hasTotNoAllocs;

    public int totNoAllocs()
    {
        if (!hasTotNoAllocs)
        {
            throw new IllegalArgumentException("No value for optional field: TotNoAllocs");
        }

        return totNoAllocs;
    }

    public boolean hasTotNoAllocs()
    {
        return hasTotNoAllocs;
    }



    private boolean lastFragment;

    private boolean hasLastFragment;

    public boolean lastFragment()
    {
        if (!hasLastFragment)
        {
            throw new IllegalArgumentException("No value for optional field: LastFragment");
        }

        return lastFragment;
    }

    public boolean hasLastFragment()
    {
        return hasLastFragment;
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

    private char[] tradeInputSource = new char[1];

    private boolean hasTradeInputSource;

    public char[] tradeInputSource()
    {
        if (!hasTradeInputSource)
        {
            throw new IllegalArgumentException("No value for optional field: TradeInputSource");
        }

        return tradeInputSource;
    }

    public boolean hasTradeInputSource()
    {
        return hasTradeInputSource;
    }


    private int tradeInputSourceOffset;

    private int tradeInputSourceLength;

    public int tradeInputSourceLength()
    {
        if (!hasTradeInputSource)
        {
            throw new IllegalArgumentException("No value for optional field: TradeInputSource");
        }

        return tradeInputSourceLength;
    }

    public String tradeInputSourceAsString()
    {
        return hasTradeInputSource ? new String(tradeInputSource, 0, tradeInputSourceLength) : null;
    }

    public void tradeInputSource(final AsciiSequenceView view)
    {
        if (!hasTradeInputSource)
        {
            throw new IllegalArgumentException("No value for optional field: TradeInputSource");
        }

        view.wrap(buffer, tradeInputSourceOffset, tradeInputSourceLength);
    }


    private final CharArrayWrapper tradeInputSourceWrapper = new CharArrayWrapper();
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



    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode AllocationInstructionAlert
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
            case Constants.ALLOC_ID:
                allocID = buffer.getChars(allocID, valueOffset, valueLength);
                allocIDOffset = valueOffset;
                allocIDLength = valueLength;
                break;

            case Constants.ALLOC_TRANS_TYPE:
                allocTransType = buffer.getChar(valueOffset);
                break;

            case Constants.ALLOC_TYPE:
                allocType = getInt(buffer, valueOffset, endOfField, 626, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.SECONDARY_ALLOC_ID:
                hasSecondaryAllocID = true;
                secondaryAllocID = buffer.getChars(secondaryAllocID, valueOffset, valueLength);
                secondaryAllocIDOffset = valueOffset;
                secondaryAllocIDLength = valueLength;
                break;

            case Constants.REF_ALLOC_ID:
                hasRefAllocID = true;
                refAllocID = buffer.getChars(refAllocID, valueOffset, valueLength);
                refAllocIDOffset = valueOffset;
                refAllocIDLength = valueLength;
                break;

            case Constants.ALLOC_CANC_REPLACE_REASON:
                hasAllocCancReplaceReason = true;
                allocCancReplaceReason = getInt(buffer, valueOffset, endOfField, 796, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.ALLOC_INTERMED_REQ_TYPE:
                hasAllocIntermedReqType = true;
                allocIntermedReqType = getInt(buffer, valueOffset, endOfField, 808, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.ALLOC_LINK_ID:
                hasAllocLinkID = true;
                allocLinkID = buffer.getChars(allocLinkID, valueOffset, valueLength);
                allocLinkIDOffset = valueOffset;
                allocLinkIDLength = valueLength;
                break;

            case Constants.ALLOC_LINK_TYPE:
                hasAllocLinkType = true;
                allocLinkType = getInt(buffer, valueOffset, endOfField, 197, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.BOOKING_REF_ID:
                hasBookingRefID = true;
                bookingRefID = buffer.getChars(bookingRefID, valueOffset, valueLength);
                bookingRefIDOffset = valueOffset;
                bookingRefIDLength = valueLength;
                break;

            case Constants.ALLOC_NO_ORDERS_TYPE:
                hasAllocNoOrdersType = true;
                allocNoOrdersType = getInt(buffer, valueOffset, endOfField, 857, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.NO_ORDERS_GROUP_COUNTER:
                hasNoOrdersGroupCounter = true;
                noOrdersGroupCounter = getInt(buffer, valueOffset, endOfField, 73, CODEC_VALIDATION_ENABLED);
                if (ordersGroup == null)
                {
                    ordersGroup = new OrdersGroupDecoder(trailer, messageFields);
                }
                OrdersGroupDecoder ordersGroupCurrent = ordersGroup;
                position = endOfField + 1;
                final int noOrdersGroupCounter = this.noOrdersGroupCounter;
                for (int i = 0; i < noOrdersGroupCounter && position < end; i++)
                {
                    if (ordersGroupCurrent != null)
                    {
                        position += ordersGroupCurrent.decode(buffer, position, end - position);
                        ordersGroupCurrent = ordersGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (ordersGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;


            case Constants.NO_EXECS_GROUP_COUNTER:
                hasNoExecsGroupCounter = true;
                noExecsGroupCounter = getInt(buffer, valueOffset, endOfField, 124, CODEC_VALIDATION_ENABLED);
                if (execsGroup == null)
                {
                    execsGroup = new ExecsGroupDecoder(trailer, messageFields);
                }
                ExecsGroupDecoder execsGroupCurrent = execsGroup;
                position = endOfField + 1;
                final int noExecsGroupCounter = this.noExecsGroupCounter;
                for (int i = 0; i < noExecsGroupCounter && position < end; i++)
                {
                    if (execsGroupCurrent != null)
                    {
                        position += execsGroupCurrent.decode(buffer, position, end - position);
                        execsGroupCurrent = execsGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (execsGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;


            case Constants.PREVIOUSLY_REPORTED:
                hasPreviouslyReported = true;
                previouslyReported = buffer.getBoolean(valueOffset);
                break;

            case Constants.REVERSAL_INDICATOR:
                hasReversalIndicator = true;
                reversalIndicator = buffer.getBoolean(valueOffset);
                break;

            case Constants.MATCH_TYPE:
                hasMatchType = true;
                matchType = buffer.getChars(matchType, valueOffset, valueLength);
                matchTypeOffset = valueOffset;
                matchTypeLength = valueLength;
                break;

            case Constants.SIDE:
                side = buffer.getChar(valueOffset);
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



            case Constants.DELIVERY_FORM:
                hasDeliveryForm = true;
                deliveryForm = getInt(buffer, valueOffset, endOfField, 668, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.PCT_AT_RISK:
                hasPctAtRisk = true;
                pctAtRisk = getFloat(buffer, pctAtRisk, valueOffset, valueLength, 869, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.NO_INSTR_ATTRIB_GROUP_COUNTER:
                hasNoInstrAttribGroupCounter = true;
                noInstrAttribGroupCounter = getInt(buffer, valueOffset, endOfField, 870, CODEC_VALIDATION_ENABLED);
                if (instrAttribGroup == null)
                {
                    instrAttribGroup = new InstrAttribGroupDecoder(trailer, messageFields);
                }
                InstrAttribGroupDecoder instrAttribGroupCurrent = instrAttribGroup;
                position = endOfField + 1;
                final int noInstrAttribGroupCounter = this.noInstrAttribGroupCounter;
                for (int i = 0; i < noInstrAttribGroupCounter && position < end; i++)
                {
                    if (instrAttribGroupCurrent != null)
                    {
                        position += instrAttribGroupCurrent.decode(buffer, position, end - position);
                        instrAttribGroupCurrent = instrAttribGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (instrAttribGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;



            case Constants.AGREEMENT_DESC:
                hasAgreementDesc = true;
                agreementDesc = buffer.getChars(agreementDesc, valueOffset, valueLength);
                agreementDescOffset = valueOffset;
                agreementDescLength = valueLength;
                break;

            case Constants.AGREEMENT_ID:
                hasAgreementID = true;
                agreementID = buffer.getChars(agreementID, valueOffset, valueLength);
                agreementIDOffset = valueOffset;
                agreementIDLength = valueLength;
                break;

            case Constants.AGREEMENT_DATE:
                hasAgreementDate = true;
                agreementDate = buffer.getBytes(agreementDate, valueOffset, valueLength);
                agreementDateOffset = valueOffset;
                agreementDateLength = valueLength;
                break;

            case Constants.AGREEMENT_CURRENCY:
                hasAgreementCurrency = true;
                agreementCurrency = buffer.getChars(agreementCurrency, valueOffset, valueLength);
                agreementCurrencyOffset = valueOffset;
                agreementCurrencyLength = valueLength;
                break;

            case Constants.TERMINATION_TYPE:
                hasTerminationType = true;
                terminationType = getInt(buffer, valueOffset, endOfField, 788, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.START_DATE:
                hasStartDate = true;
                startDate = buffer.getBytes(startDate, valueOffset, valueLength);
                startDateOffset = valueOffset;
                startDateLength = valueLength;
                break;

            case Constants.END_DATE:
                hasEndDate = true;
                endDate = buffer.getBytes(endDate, valueOffset, valueLength);
                endDateOffset = valueOffset;
                endDateLength = valueLength;
                break;

            case Constants.DELIVERY_TYPE:
                hasDeliveryType = true;
                deliveryType = getInt(buffer, valueOffset, endOfField, 919, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.MARGIN_RATIO:
                hasMarginRatio = true;
                marginRatio = getFloat(buffer, marginRatio, valueOffset, valueLength, 898, CODEC_VALIDATION_ENABLED);
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


            case Constants.QUANTITY:
                quantity = getFloat(buffer, quantity, valueOffset, valueLength, 53, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.QTY_TYPE:
                hasQtyType = true;
                qtyType = getInt(buffer, valueOffset, endOfField, 854, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.LAST_MKT:
                hasLastMkt = true;
                lastMkt = buffer.getChars(lastMkt, valueOffset, valueLength);
                lastMktOffset = valueOffset;
                lastMktLength = valueLength;
                break;

            case Constants.TRADE_ORIGINATION_DATE:
                hasTradeOriginationDate = true;
                tradeOriginationDate = buffer.getBytes(tradeOriginationDate, valueOffset, valueLength);
                tradeOriginationDateOffset = valueOffset;
                tradeOriginationDateLength = valueLength;
                break;

            case Constants.TRADING_SESSION_ID:
                hasTradingSessionID = true;
                tradingSessionID = buffer.getChars(tradingSessionID, valueOffset, valueLength);
                tradingSessionIDOffset = valueOffset;
                tradingSessionIDLength = valueLength;
                break;

            case Constants.TRADING_SESSION_SUB_ID:
                hasTradingSessionSubID = true;
                tradingSessionSubID = buffer.getChars(tradingSessionSubID, valueOffset, valueLength);
                tradingSessionSubIDOffset = valueOffset;
                tradingSessionSubIDLength = valueLength;
                break;

            case Constants.PRICE_TYPE:
                hasPriceType = true;
                priceType = getInt(buffer, valueOffset, endOfField, 423, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.AVG_PX:
                hasAvgPx = true;
                avgPx = getFloat(buffer, avgPx, valueOffset, valueLength, 6, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.AVG_PAR_PX:
                hasAvgParPx = true;
                avgParPx = getFloat(buffer, avgParPx, valueOffset, valueLength, 860, CODEC_VALIDATION_ENABLED);
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


            case Constants.CURRENCY:
                hasCurrency = true;
                currency = buffer.getChars(currency, valueOffset, valueLength);
                currencyOffset = valueOffset;
                currencyLength = valueLength;
                break;

            case Constants.AVG_PX_PRECISION:
                hasAvgPxPrecision = true;
                avgPxPrecision = getInt(buffer, valueOffset, endOfField, 74, CODEC_VALIDATION_ENABLED);
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


            case Constants.TRADE_DATE:
                tradeDate = buffer.getBytes(tradeDate, valueOffset, valueLength);
                tradeDateOffset = valueOffset;
                tradeDateLength = valueLength;
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

            case Constants.SETTL_DATE:
                hasSettlDate = true;
                settlDate = buffer.getBytes(settlDate, valueOffset, valueLength);
                settlDateOffset = valueOffset;
                settlDateLength = valueLength;
                break;

            case Constants.BOOKING_TYPE:
                hasBookingType = true;
                bookingType = getInt(buffer, valueOffset, endOfField, 775, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.GROSS_TRADE_AMT:
                hasGrossTradeAmt = true;
                grossTradeAmt = getFloat(buffer, grossTradeAmt, valueOffset, valueLength, 381, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.CONCESSION:
                hasConcession = true;
                concession = getFloat(buffer, concession, valueOffset, valueLength, 238, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.TOTAL_TAKEDOWN:
                hasTotalTakedown = true;
                totalTakedown = getFloat(buffer, totalTakedown, valueOffset, valueLength, 237, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.NET_MONEY:
                hasNetMoney = true;
                netMoney = getFloat(buffer, netMoney, valueOffset, valueLength, 118, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.POSITION_EFFECT:
                hasPositionEffect = true;
                positionEffect = buffer.getChar(valueOffset);
                break;

            case Constants.AUTO_ACCEPT_INDICATOR:
                hasAutoAcceptIndicator = true;
                autoAcceptIndicator = buffer.getBoolean(valueOffset);
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

            case Constants.NUM_DAYS_INTEREST:
                hasNumDaysInterest = true;
                numDaysInterest = getInt(buffer, valueOffset, endOfField, 157, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.ACCRUED_INTEREST_RATE:
                hasAccruedInterestRate = true;
                accruedInterestRate = getFloat(buffer, accruedInterestRate, valueOffset, valueLength, 158, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.ACCRUED_INTEREST_AMT:
                hasAccruedInterestAmt = true;
                accruedInterestAmt = getFloat(buffer, accruedInterestAmt, valueOffset, valueLength, 159, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.TOTAL_ACCRUED_INTEREST_AMT:
                hasTotalAccruedInterestAmt = true;
                totalAccruedInterestAmt = getFloat(buffer, totalAccruedInterestAmt, valueOffset, valueLength, 540, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.INTEREST_AT_MATURITY:
                hasInterestAtMaturity = true;
                interestAtMaturity = getFloat(buffer, interestAtMaturity, valueOffset, valueLength, 738, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.END_ACCRUED_INTEREST_AMT:
                hasEndAccruedInterestAmt = true;
                endAccruedInterestAmt = getFloat(buffer, endAccruedInterestAmt, valueOffset, valueLength, 920, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.START_CASH:
                hasStartCash = true;
                startCash = getFloat(buffer, startCash, valueOffset, valueLength, 921, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.END_CASH:
                hasEndCash = true;
                endCash = getFloat(buffer, endCash, valueOffset, valueLength, 922, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.LEGAL_CONFIRM:
                hasLegalConfirm = true;
                legalConfirm = buffer.getBoolean(valueOffset);
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


            case Constants.TOT_NO_ALLOCS:
                hasTotNoAllocs = true;
                totNoAllocs = getInt(buffer, valueOffset, endOfField, 892, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.LAST_FRAGMENT:
                hasLastFragment = true;
                lastFragment = buffer.getBoolean(valueOffset);
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


            case Constants.AVG_PX_INDICATOR:
                hasAvgPxIndicator = true;
                avgPxIndicator = getInt(buffer, valueOffset, endOfField, 819, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.CLEARING_BUSINESS_DATE:
                hasClearingBusinessDate = true;
                clearingBusinessDate = buffer.getBytes(clearingBusinessDate, valueOffset, valueLength);
                clearingBusinessDateOffset = valueOffset;
                clearingBusinessDateLength = valueLength;
                break;

            case Constants.TRD_TYPE:
                hasTrdType = true;
                trdType = getInt(buffer, valueOffset, endOfField, 828, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.TRD_SUB_TYPE:
                hasTrdSubType = true;
                trdSubType = getInt(buffer, valueOffset, endOfField, 829, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.CUST_ORDER_CAPACITY:
                hasCustOrderCapacity = true;
                custOrderCapacity = getInt(buffer, valueOffset, endOfField, 582, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.TRADE_INPUT_SOURCE:
                hasTradeInputSource = true;
                tradeInputSource = buffer.getChars(tradeInputSource, valueOffset, valueLength);
                tradeInputSourceOffset = valueOffset;
                tradeInputSourceLength = valueLength;
                break;

            case Constants.MULTI_LEG_REPORTING_TYPE:
                hasMultiLegReportingType = true;
                multiLegReportingType = buffer.getChar(valueOffset);
                break;

            case Constants.MESSAGE_EVENT_SOURCE:
                hasMessageEventSource = true;
                messageEventSource = buffer.getChars(messageEventSource, valueOffset, valueLength);
                messageEventSourceOffset = valueOffset;
                messageEventSourceLength = valueLength;
                break;

            case Constants.RND_PX:
                hasRndPx = true;
                rndPx = getFloat(buffer, rndPx, valueOffset, valueLength, 991, CODEC_VALIDATION_ENABLED);
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
        this.resetAllocID();
        this.resetAllocTransType();
        this.resetAllocType();
        this.resetSecondaryAllocID();
        this.resetRefAllocID();
        this.resetAllocCancReplaceReason();
        this.resetAllocIntermedReqType();
        this.resetAllocLinkID();
        this.resetAllocLinkType();
        this.resetBookingRefID();
        this.resetAllocNoOrdersType();
        this.resetPreviouslyReported();
        this.resetReversalIndicator();
        this.resetMatchType();
        this.resetSide();
        this.resetQuantity();
        this.resetQtyType();
        this.resetLastMkt();
        this.resetTradeOriginationDate();
        this.resetTradingSessionID();
        this.resetTradingSessionSubID();
        this.resetPriceType();
        this.resetAvgPx();
        this.resetAvgParPx();
        this.resetCurrency();
        this.resetAvgPxPrecision();
        this.resetTradeDate();
        this.resetTransactTime();
        this.resetSettlType();
        this.resetSettlDate();
        this.resetBookingType();
        this.resetGrossTradeAmt();
        this.resetConcession();
        this.resetTotalTakedown();
        this.resetNetMoney();
        this.resetPositionEffect();
        this.resetAutoAcceptIndicator();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        this.resetNumDaysInterest();
        this.resetAccruedInterestRate();
        this.resetAccruedInterestAmt();
        this.resetTotalAccruedInterestAmt();
        this.resetInterestAtMaturity();
        this.resetEndAccruedInterestAmt();
        this.resetStartCash();
        this.resetEndCash();
        this.resetLegalConfirm();
        this.resetTotNoAllocs();
        this.resetLastFragment();
        this.resetAvgPxIndicator();
        this.resetClearingBusinessDate();
        this.resetTrdType();
        this.resetTrdSubType();
        this.resetCustOrderCapacity();
        this.resetTradeInputSource();
        this.resetMultiLegReportingType();
        this.resetMessageEventSource();
        this.resetRndPx();
        this.resetOrdersGroup();
        this.resetExecsGroup();
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
        this.resetDeliveryForm();
        this.resetPctAtRisk();
        this.resetInstrAttribGroup();
        this.resetAgreementDesc();
        this.resetAgreementID();
        this.resetAgreementDate();
        this.resetAgreementCurrency();
        this.resetTerminationType();
        this.resetStartDate();
        this.resetEndDate();
        this.resetDeliveryType();
        this.resetMarginRatio();
        this.resetUnderlyingsGroup();
        this.resetLegsGroup();
        this.resetSpread();
        this.resetBenchmarkCurveCurrency();
        this.resetBenchmarkCurveName();
        this.resetBenchmarkCurvePoint();
        this.resetBenchmarkPrice();
        this.resetBenchmarkPriceType();
        this.resetBenchmarkSecurityID();
        this.resetBenchmarkSecurityIDSource();
        this.resetPartyIDsGroup();
        this.resetStipulationsGroup();
        this.resetYieldType();
        this.resetYield();
        this.resetYieldCalcDate();
        this.resetYieldRedemptionDate();
        this.resetYieldRedemptionPrice();
        this.resetYieldRedemptionPriceType();
        this.resetPosAmtGroup();
        this.resetAllocsGroup();
    }

    public void resetAllocID()
    {
        allocIDOffset = 0;
        allocIDLength = 0;
    }

    public void resetAllocTransType()
    {
        allocTransType = MISSING_CHAR;
    }

    public void resetAllocType()
    {
        allocType = MISSING_INT;
    }

    public void resetSecondaryAllocID()
    {
        hasSecondaryAllocID = false;
    }

    public void resetRefAllocID()
    {
        hasRefAllocID = false;
    }

    public void resetAllocCancReplaceReason()
    {
        hasAllocCancReplaceReason = false;
    }

    public void resetAllocIntermedReqType()
    {
        hasAllocIntermedReqType = false;
    }

    public void resetAllocLinkID()
    {
        hasAllocLinkID = false;
    }

    public void resetAllocLinkType()
    {
        hasAllocLinkType = false;
    }

    public void resetBookingRefID()
    {
        hasBookingRefID = false;
    }

    public void resetAllocNoOrdersType()
    {
        hasAllocNoOrdersType = false;
    }

    public void resetPreviouslyReported()
    {
        hasPreviouslyReported = false;
    }

    public void resetReversalIndicator()
    {
        hasReversalIndicator = false;
    }

    public void resetMatchType()
    {
        hasMatchType = false;
    }

    public void resetSide()
    {
        side = MISSING_CHAR;
    }

    public void resetQuantity()
    {
        quantity.reset();
    }

    public void resetQtyType()
    {
        hasQtyType = false;
    }

    public void resetLastMkt()
    {
        hasLastMkt = false;
    }

    public void resetTradeOriginationDate()
    {
        hasTradeOriginationDate = false;
    }

    public void resetTradingSessionID()
    {
        hasTradingSessionID = false;
    }

    public void resetTradingSessionSubID()
    {
        hasTradingSessionSubID = false;
    }

    public void resetPriceType()
    {
        hasPriceType = false;
    }

    public void resetAvgPx()
    {
        hasAvgPx = false;
    }

    public void resetAvgParPx()
    {
        hasAvgParPx = false;
    }

    public void resetCurrency()
    {
        hasCurrency = false;
    }

    public void resetAvgPxPrecision()
    {
        hasAvgPxPrecision = false;
    }

    public void resetTradeDate()
    {
    }

    public void resetTransactTime()
    {
        hasTransactTime = false;
    }

    public void resetSettlType()
    {
        hasSettlType = false;
    }

    public void resetSettlDate()
    {
        hasSettlDate = false;
    }

    public void resetBookingType()
    {
        hasBookingType = false;
    }

    public void resetGrossTradeAmt()
    {
        hasGrossTradeAmt = false;
    }

    public void resetConcession()
    {
        hasConcession = false;
    }

    public void resetTotalTakedown()
    {
        hasTotalTakedown = false;
    }

    public void resetNetMoney()
    {
        hasNetMoney = false;
    }

    public void resetPositionEffect()
    {
        hasPositionEffect = false;
    }

    public void resetAutoAcceptIndicator()
    {
        hasAutoAcceptIndicator = false;
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

    public void resetNumDaysInterest()
    {
        hasNumDaysInterest = false;
    }

    public void resetAccruedInterestRate()
    {
        hasAccruedInterestRate = false;
    }

    public void resetAccruedInterestAmt()
    {
        hasAccruedInterestAmt = false;
    }

    public void resetTotalAccruedInterestAmt()
    {
        hasTotalAccruedInterestAmt = false;
    }

    public void resetInterestAtMaturity()
    {
        hasInterestAtMaturity = false;
    }

    public void resetEndAccruedInterestAmt()
    {
        hasEndAccruedInterestAmt = false;
    }

    public void resetStartCash()
    {
        hasStartCash = false;
    }

    public void resetEndCash()
    {
        hasEndCash = false;
    }

    public void resetLegalConfirm()
    {
        hasLegalConfirm = false;
    }

    public void resetTotNoAllocs()
    {
        hasTotNoAllocs = false;
    }

    public void resetLastFragment()
    {
        hasLastFragment = false;
    }

    public void resetAvgPxIndicator()
    {
        hasAvgPxIndicator = false;
    }

    public void resetClearingBusinessDate()
    {
        hasClearingBusinessDate = false;
    }

    public void resetTrdType()
    {
        hasTrdType = false;
    }

    public void resetTrdSubType()
    {
        hasTrdSubType = false;
    }

    public void resetCustOrderCapacity()
    {
        hasCustOrderCapacity = false;
    }

    public void resetTradeInputSource()
    {
        hasTradeInputSource = false;
    }

    public void resetMultiLegReportingType()
    {
        hasMultiLegReportingType = false;
    }

    public void resetMessageEventSource()
    {
        hasMessageEventSource = false;
    }

    public void resetRndPx()
    {
        hasRndPx = false;
    }

    public void resetOrdersGroup()
    {
        for (final OrdersGroupDecoder ordersGroupDecoder : ordersGroupIterator.iterator())
        {
            ordersGroupDecoder.reset();
            if (ordersGroupDecoder.next() == null)
            {
                break;
            }
        }
        noOrdersGroupCounter = MISSING_INT;
        hasNoOrdersGroupCounter = false;
    }

    public void resetExecsGroup()
    {
        for (final ExecsGroupDecoder execsGroupDecoder : execsGroupIterator.iterator())
        {
            execsGroupDecoder.reset();
            if (execsGroupDecoder.next() == null)
            {
                break;
            }
        }
        noExecsGroupCounter = MISSING_INT;
        hasNoExecsGroupCounter = false;
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

    public void resetDeliveryForm()
    {
        hasDeliveryForm = false;
    }

    public void resetPctAtRisk()
    {
        hasPctAtRisk = false;
    }

    public void resetInstrAttribGroup()
    {
        for (final InstrAttribGroupDecoder instrAttribGroupDecoder : instrAttribGroupIterator.iterator())
        {
            instrAttribGroupDecoder.reset();
            if (instrAttribGroupDecoder.next() == null)
            {
                break;
            }
        }
        noInstrAttribGroupCounter = MISSING_INT;
        hasNoInstrAttribGroupCounter = false;
    }

    public void resetAgreementDesc()
    {
        hasAgreementDesc = false;
    }

    public void resetAgreementID()
    {
        hasAgreementID = false;
    }

    public void resetAgreementDate()
    {
        hasAgreementDate = false;
    }

    public void resetAgreementCurrency()
    {
        hasAgreementCurrency = false;
    }

    public void resetTerminationType()
    {
        hasTerminationType = false;
    }

    public void resetStartDate()
    {
        hasStartDate = false;
    }

    public void resetEndDate()
    {
        hasEndDate = false;
    }

    public void resetDeliveryType()
    {
        hasDeliveryType = false;
    }

    public void resetMarginRatio()
    {
        hasMarginRatio = false;
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
        builder.append("\"MessageName\": \"AllocationInstructionAlert\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        indent(builder, level);
        builder.append("\"AllocID\": \"");
        builder.append(this.allocID(), 0, allocIDLength());
        builder.append("\",\n");

        indent(builder, level);
        builder.append("\"AllocTransType\": \"");
        builder.append(allocTransType);
        builder.append("\",\n");

        indent(builder, level);
        builder.append("\"AllocType\": \"");
        builder.append(allocType);
        builder.append("\",\n");

        if (hasSecondaryAllocID())
        {
            indent(builder, level);
            builder.append("\"SecondaryAllocID\": \"");
            builder.append(this.secondaryAllocID(), 0, secondaryAllocIDLength());
            builder.append("\",\n");
        }

        if (hasRefAllocID())
        {
            indent(builder, level);
            builder.append("\"RefAllocID\": \"");
            builder.append(this.refAllocID(), 0, refAllocIDLength());
            builder.append("\",\n");
        }

        if (hasAllocCancReplaceReason())
        {
            indent(builder, level);
            builder.append("\"AllocCancReplaceReason\": \"");
            builder.append(allocCancReplaceReason);
            builder.append("\",\n");
        }

        if (hasAllocIntermedReqType())
        {
            indent(builder, level);
            builder.append("\"AllocIntermedReqType\": \"");
            builder.append(allocIntermedReqType);
            builder.append("\",\n");
        }

        if (hasAllocLinkID())
        {
            indent(builder, level);
            builder.append("\"AllocLinkID\": \"");
            builder.append(this.allocLinkID(), 0, allocLinkIDLength());
            builder.append("\",\n");
        }

        if (hasAllocLinkType())
        {
            indent(builder, level);
            builder.append("\"AllocLinkType\": \"");
            builder.append(allocLinkType);
            builder.append("\",\n");
        }

        if (hasBookingRefID())
        {
            indent(builder, level);
            builder.append("\"BookingRefID\": \"");
            builder.append(this.bookingRefID(), 0, bookingRefIDLength());
            builder.append("\",\n");
        }

        if (hasAllocNoOrdersType())
        {
            indent(builder, level);
            builder.append("\"AllocNoOrdersType\": \"");
            builder.append(allocNoOrdersType);
            builder.append("\",\n");
        }

        if (hasNoOrdersGroupCounter)
        {
            indent(builder, level);
            builder.append("\"OrdersGroup\": [\n");
            OrdersGroupDecoder ordersGroup = this.ordersGroup;
            for (int i = 0, size = this.noOrdersGroupCounter; i < size; i++)
            {
                indent(builder, level);
                ordersGroup.appendTo(builder, level + 1);
                if (ordersGroup.next() != null)
                {
                    builder.append(',');
                }
                builder.append('\n');
                ordersGroup = ordersGroup.next();            }
            indent(builder, level);
            builder.append("],\n");
        }

        if (hasNoExecsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"ExecsGroup\": [\n");
            ExecsGroupDecoder execsGroup = this.execsGroup;
            for (int i = 0, size = this.noExecsGroupCounter; i < size; i++)
            {
                indent(builder, level);
                execsGroup.appendTo(builder, level + 1);
                if (execsGroup.next() != null)
                {
                    builder.append(',');
                }
                builder.append('\n');
                execsGroup = execsGroup.next();            }
            indent(builder, level);
            builder.append("],\n");
        }

        if (hasPreviouslyReported())
        {
            indent(builder, level);
            builder.append("\"PreviouslyReported\": \"");
            builder.append(previouslyReported);
            builder.append("\",\n");
        }

        if (hasReversalIndicator())
        {
            indent(builder, level);
            builder.append("\"ReversalIndicator\": \"");
            builder.append(reversalIndicator);
            builder.append("\",\n");
        }

        if (hasMatchType())
        {
            indent(builder, level);
            builder.append("\"MatchType\": \"");
            builder.append(this.matchType(), 0, matchTypeLength());
            builder.append("\",\n");
        }

        indent(builder, level);
        builder.append("\"Side\": \"");
        builder.append(side);
        builder.append("\",\n");

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

        if (hasDeliveryForm())
        {
            indent(builder, level);
            builder.append("\"DeliveryForm\": \"");
            builder.append(deliveryForm);
            builder.append("\",\n");
        }

        if (hasPctAtRisk())
        {
            indent(builder, level);
            builder.append("\"PctAtRisk\": \"");
            pctAtRisk.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasNoInstrAttribGroupCounter)
        {
            indent(builder, level);
            builder.append("\"InstrAttribGroup\": [\n");
            InstrAttribGroupDecoder instrAttribGroup = this.instrAttribGroup;
            for (int i = 0, size = this.noInstrAttribGroupCounter; i < size; i++)
            {
                indent(builder, level);
                instrAttribGroup.appendTo(builder, level + 1);
                if (instrAttribGroup.next() != null)
                {
                    builder.append(',');
                }
                builder.append('\n');
                instrAttribGroup = instrAttribGroup.next();            }
            indent(builder, level);
            builder.append("],\n");
        }

        if (hasAgreementDesc())
        {
            indent(builder, level);
            builder.append("\"AgreementDesc\": \"");
            builder.append(this.agreementDesc(), 0, agreementDescLength());
            builder.append("\",\n");
        }

        if (hasAgreementID())
        {
            indent(builder, level);
            builder.append("\"AgreementID\": \"");
            builder.append(this.agreementID(), 0, agreementIDLength());
            builder.append("\",\n");
        }

        if (hasAgreementDate())
        {
            indent(builder, level);
            builder.append("\"AgreementDate\": \"");
            appendData(builder, agreementDate, agreementDateLength);
            builder.append("\",\n");
        }

        if (hasAgreementCurrency())
        {
            indent(builder, level);
            builder.append("\"AgreementCurrency\": \"");
            builder.append(this.agreementCurrency(), 0, agreementCurrencyLength());
            builder.append("\",\n");
        }

        if (hasTerminationType())
        {
            indent(builder, level);
            builder.append("\"TerminationType\": \"");
            builder.append(terminationType);
            builder.append("\",\n");
        }

        if (hasStartDate())
        {
            indent(builder, level);
            builder.append("\"StartDate\": \"");
            appendData(builder, startDate, startDateLength);
            builder.append("\",\n");
        }

        if (hasEndDate())
        {
            indent(builder, level);
            builder.append("\"EndDate\": \"");
            appendData(builder, endDate, endDateLength);
            builder.append("\",\n");
        }

        if (hasDeliveryType())
        {
            indent(builder, level);
            builder.append("\"DeliveryType\": \"");
            builder.append(deliveryType);
            builder.append("\",\n");
        }

        if (hasMarginRatio())
        {
            indent(builder, level);
            builder.append("\"MarginRatio\": \"");
            marginRatio.appendTo(builder);
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

        indent(builder, level);
        builder.append("\"Quantity\": \"");
        quantity.appendTo(builder);
        builder.append("\",\n");

        if (hasQtyType())
        {
            indent(builder, level);
            builder.append("\"QtyType\": \"");
            builder.append(qtyType);
            builder.append("\",\n");
        }

        if (hasLastMkt())
        {
            indent(builder, level);
            builder.append("\"LastMkt\": \"");
            builder.append(this.lastMkt(), 0, lastMktLength());
            builder.append("\",\n");
        }

        if (hasTradeOriginationDate())
        {
            indent(builder, level);
            builder.append("\"TradeOriginationDate\": \"");
            appendData(builder, tradeOriginationDate, tradeOriginationDateLength);
            builder.append("\",\n");
        }

        if (hasTradingSessionID())
        {
            indent(builder, level);
            builder.append("\"TradingSessionID\": \"");
            builder.append(this.tradingSessionID(), 0, tradingSessionIDLength());
            builder.append("\",\n");
        }

        if (hasTradingSessionSubID())
        {
            indent(builder, level);
            builder.append("\"TradingSessionSubID\": \"");
            builder.append(this.tradingSessionSubID(), 0, tradingSessionSubIDLength());
            builder.append("\",\n");
        }

        if (hasPriceType())
        {
            indent(builder, level);
            builder.append("\"PriceType\": \"");
            builder.append(priceType);
            builder.append("\",\n");
        }

        if (hasAvgPx())
        {
            indent(builder, level);
            builder.append("\"AvgPx\": \"");
            avgPx.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasAvgParPx())
        {
            indent(builder, level);
            builder.append("\"AvgParPx\": \"");
            avgParPx.appendTo(builder);
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

        if (hasCurrency())
        {
            indent(builder, level);
            builder.append("\"Currency\": \"");
            builder.append(this.currency(), 0, currencyLength());
            builder.append("\",\n");
        }

        if (hasAvgPxPrecision())
        {
            indent(builder, level);
            builder.append("\"AvgPxPrecision\": \"");
            builder.append(avgPxPrecision);
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

        indent(builder, level);
        builder.append("\"TradeDate\": \"");
        appendData(builder, tradeDate, tradeDateLength);
        builder.append("\",\n");

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

        if (hasSettlDate())
        {
            indent(builder, level);
            builder.append("\"SettlDate\": \"");
            appendData(builder, settlDate, settlDateLength);
            builder.append("\",\n");
        }

        if (hasBookingType())
        {
            indent(builder, level);
            builder.append("\"BookingType\": \"");
            builder.append(bookingType);
            builder.append("\",\n");
        }

        if (hasGrossTradeAmt())
        {
            indent(builder, level);
            builder.append("\"GrossTradeAmt\": \"");
            grossTradeAmt.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasConcession())
        {
            indent(builder, level);
            builder.append("\"Concession\": \"");
            concession.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasTotalTakedown())
        {
            indent(builder, level);
            builder.append("\"TotalTakedown\": \"");
            totalTakedown.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasNetMoney())
        {
            indent(builder, level);
            builder.append("\"NetMoney\": \"");
            netMoney.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasPositionEffect())
        {
            indent(builder, level);
            builder.append("\"PositionEffect\": \"");
            builder.append(positionEffect);
            builder.append("\",\n");
        }

        if (hasAutoAcceptIndicator())
        {
            indent(builder, level);
            builder.append("\"AutoAcceptIndicator\": \"");
            builder.append(autoAcceptIndicator);
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

        if (hasNumDaysInterest())
        {
            indent(builder, level);
            builder.append("\"NumDaysInterest\": \"");
            builder.append(numDaysInterest);
            builder.append("\",\n");
        }

        if (hasAccruedInterestRate())
        {
            indent(builder, level);
            builder.append("\"AccruedInterestRate\": \"");
            accruedInterestRate.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasAccruedInterestAmt())
        {
            indent(builder, level);
            builder.append("\"AccruedInterestAmt\": \"");
            accruedInterestAmt.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasTotalAccruedInterestAmt())
        {
            indent(builder, level);
            builder.append("\"TotalAccruedInterestAmt\": \"");
            totalAccruedInterestAmt.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasInterestAtMaturity())
        {
            indent(builder, level);
            builder.append("\"InterestAtMaturity\": \"");
            interestAtMaturity.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasEndAccruedInterestAmt())
        {
            indent(builder, level);
            builder.append("\"EndAccruedInterestAmt\": \"");
            endAccruedInterestAmt.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasStartCash())
        {
            indent(builder, level);
            builder.append("\"StartCash\": \"");
            startCash.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasEndCash())
        {
            indent(builder, level);
            builder.append("\"EndCash\": \"");
            endCash.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasLegalConfirm())
        {
            indent(builder, level);
            builder.append("\"LegalConfirm\": \"");
            builder.append(legalConfirm);
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

        if (hasTotNoAllocs())
        {
            indent(builder, level);
            builder.append("\"TotNoAllocs\": \"");
            builder.append(totNoAllocs);
            builder.append("\",\n");
        }

        if (hasLastFragment())
        {
            indent(builder, level);
            builder.append("\"LastFragment\": \"");
            builder.append(lastFragment);
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

        if (hasAvgPxIndicator())
        {
            indent(builder, level);
            builder.append("\"AvgPxIndicator\": \"");
            builder.append(avgPxIndicator);
            builder.append("\",\n");
        }

        if (hasClearingBusinessDate())
        {
            indent(builder, level);
            builder.append("\"ClearingBusinessDate\": \"");
            appendData(builder, clearingBusinessDate, clearingBusinessDateLength);
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

        if (hasCustOrderCapacity())
        {
            indent(builder, level);
            builder.append("\"CustOrderCapacity\": \"");
            builder.append(custOrderCapacity);
            builder.append("\",\n");
        }

        if (hasTradeInputSource())
        {
            indent(builder, level);
            builder.append("\"TradeInputSource\": \"");
            builder.append(this.tradeInputSource(), 0, tradeInputSourceLength());
            builder.append("\",\n");
        }

        if (hasMultiLegReportingType())
        {
            indent(builder, level);
            builder.append("\"MultiLegReportingType\": \"");
            builder.append(multiLegReportingType);
            builder.append("\",\n");
        }

        if (hasMessageEventSource())
        {
            indent(builder, level);
            builder.append("\"MessageEventSource\": \"");
            builder.append(this.messageEventSource(), 0, messageEventSourceLength());
            builder.append("\",\n");
        }

        if (hasRndPx())
        {
            indent(builder, level);
            builder.append("\"RndPx\": \"");
            rndPx.appendTo(builder);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public AllocationInstructionAlertEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((AllocationInstructionAlertEncoder)encoder);
    }

    public AllocationInstructionAlertEncoder toEncoder(final AllocationInstructionAlertEncoder encoder)
    {
        encoder.reset();
        encoder.allocID(this.allocID(), 0, allocIDLength());
        encoder.allocTransType(this.allocTransType());
        encoder.allocType(this.allocType());
        if (hasSecondaryAllocID())
        {
            encoder.secondaryAllocID(this.secondaryAllocID(), 0, secondaryAllocIDLength());
        }

        if (hasRefAllocID())
        {
            encoder.refAllocID(this.refAllocID(), 0, refAllocIDLength());
        }

        if (hasAllocCancReplaceReason())
        {
            encoder.allocCancReplaceReason(this.allocCancReplaceReason());
        }

        if (hasAllocIntermedReqType())
        {
            encoder.allocIntermedReqType(this.allocIntermedReqType());
        }

        if (hasAllocLinkID())
        {
            encoder.allocLinkID(this.allocLinkID(), 0, allocLinkIDLength());
        }

        if (hasAllocLinkType())
        {
            encoder.allocLinkType(this.allocLinkType());
        }

        if (hasBookingRefID())
        {
            encoder.bookingRefID(this.bookingRefID(), 0, bookingRefIDLength());
        }

        if (hasAllocNoOrdersType())
        {
            encoder.allocNoOrdersType(this.allocNoOrdersType());
        }


        final OrdAllocGrpEncoder ordAllocGrp = encoder.ordAllocGrp();        if (hasNoOrdersGroupCounter)
        {
            final int size = this.noOrdersGroupCounter;
            OrdersGroupDecoder ordersGroup = this.ordersGroup;
            OrdersGroupEncoder ordersGroupEncoder = ordAllocGrp.ordersGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (ordersGroup != null)
                {
                    ordersGroup.toEncoder(ordersGroupEncoder);
                    ordersGroup = ordersGroup.next();
                    ordersGroupEncoder = ordersGroupEncoder.next();
                }
            }
        }



        final ExecAllocGrpEncoder execAllocGrp = encoder.execAllocGrp();        if (hasNoExecsGroupCounter)
        {
            final int size = this.noExecsGroupCounter;
            ExecsGroupDecoder execsGroup = this.execsGroup;
            ExecsGroupEncoder execsGroupEncoder = execAllocGrp.execsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (execsGroup != null)
                {
                    execsGroup.toEncoder(execsGroupEncoder);
                    execsGroup = execsGroup.next();
                    execsGroupEncoder = execsGroupEncoder.next();
                }
            }
        }


        if (hasPreviouslyReported())
        {
            encoder.previouslyReported(this.previouslyReported());
        }

        if (hasReversalIndicator())
        {
            encoder.reversalIndicator(this.reversalIndicator());
        }

        if (hasMatchType())
        {
            encoder.matchType(this.matchType(), 0, matchTypeLength());
        }

        encoder.side(this.side());

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




        final InstrumentExtensionEncoder instrumentExtension = encoder.instrumentExtension();        if (hasDeliveryForm())
        {
            instrumentExtension.deliveryForm(this.deliveryForm());
        }

        if (hasPctAtRisk())
        {
            instrumentExtension.pctAtRisk(this.pctAtRisk());
        }


        final AttrbGrpEncoder attrbGrp = instrumentExtension.attrbGrp();        if (hasNoInstrAttribGroupCounter)
        {
            final int size = this.noInstrAttribGroupCounter;
            InstrAttribGroupDecoder instrAttribGroup = this.instrAttribGroup;
            InstrAttribGroupEncoder instrAttribGroupEncoder = attrbGrp.instrAttribGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (instrAttribGroup != null)
                {
                    instrAttribGroup.toEncoder(instrAttribGroupEncoder);
                    instrAttribGroup = instrAttribGroup.next();
                    instrAttribGroupEncoder = instrAttribGroupEncoder.next();
                }
            }
        }




        final FinancingDetailsEncoder financingDetails = encoder.financingDetails();        if (hasAgreementDesc())
        {
            financingDetails.agreementDesc(this.agreementDesc(), 0, agreementDescLength());
        }

        if (hasAgreementID())
        {
            financingDetails.agreementID(this.agreementID(), 0, agreementIDLength());
        }

        if (hasAgreementDate())
        {
            financingDetails.agreementDateAsCopy(this.agreementDate(), 0, agreementDateLength());
        }

        if (hasAgreementCurrency())
        {
            financingDetails.agreementCurrency(this.agreementCurrency(), 0, agreementCurrencyLength());
        }

        if (hasTerminationType())
        {
            financingDetails.terminationType(this.terminationType());
        }

        if (hasStartDate())
        {
            financingDetails.startDateAsCopy(this.startDate(), 0, startDateLength());
        }

        if (hasEndDate())
        {
            financingDetails.endDateAsCopy(this.endDate(), 0, endDateLength());
        }

        if (hasDeliveryType())
        {
            financingDetails.deliveryType(this.deliveryType());
        }

        if (hasMarginRatio())
        {
            financingDetails.marginRatio(this.marginRatio());
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



        final InstrmtLegGrpEncoder instrmtLegGrp = encoder.instrmtLegGrp();        if (hasNoLegsGroupCounter)
        {
            final int size = this.noLegsGroupCounter;
            LegsGroupDecoder legsGroup = this.legsGroup;
            LegsGroupEncoder legsGroupEncoder = instrmtLegGrp.legsGroup(size);
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


        encoder.quantity(this.quantity());
        if (hasQtyType())
        {
            encoder.qtyType(this.qtyType());
        }

        if (hasLastMkt())
        {
            encoder.lastMkt(this.lastMkt(), 0, lastMktLength());
        }

        if (hasTradeOriginationDate())
        {
            encoder.tradeOriginationDateAsCopy(this.tradeOriginationDate(), 0, tradeOriginationDateLength());
        }

        if (hasTradingSessionID())
        {
            encoder.tradingSessionID(this.tradingSessionID(), 0, tradingSessionIDLength());
        }

        if (hasTradingSessionSubID())
        {
            encoder.tradingSessionSubID(this.tradingSessionSubID(), 0, tradingSessionSubIDLength());
        }

        if (hasPriceType())
        {
            encoder.priceType(this.priceType());
        }

        if (hasAvgPx())
        {
            encoder.avgPx(this.avgPx());
        }

        if (hasAvgParPx())
        {
            encoder.avgParPx(this.avgParPx());
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


        if (hasCurrency())
        {
            encoder.currency(this.currency(), 0, currencyLength());
        }

        if (hasAvgPxPrecision())
        {
            encoder.avgPxPrecision(this.avgPxPrecision());
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


        encoder.tradeDateAsCopy(this.tradeDate(), 0, tradeDateLength());
        if (hasTransactTime())
        {
            encoder.transactTimeAsCopy(this.transactTime(), 0, transactTimeLength());
        }

        if (hasSettlType())
        {
            encoder.settlType(this.settlType(), 0, settlTypeLength());
        }

        if (hasSettlDate())
        {
            encoder.settlDateAsCopy(this.settlDate(), 0, settlDateLength());
        }

        if (hasBookingType())
        {
            encoder.bookingType(this.bookingType());
        }

        if (hasGrossTradeAmt())
        {
            encoder.grossTradeAmt(this.grossTradeAmt());
        }

        if (hasConcession())
        {
            encoder.concession(this.concession());
        }

        if (hasTotalTakedown())
        {
            encoder.totalTakedown(this.totalTakedown());
        }

        if (hasNetMoney())
        {
            encoder.netMoney(this.netMoney());
        }

        if (hasPositionEffect())
        {
            encoder.positionEffect(this.positionEffect());
        }

        if (hasAutoAcceptIndicator())
        {
            encoder.autoAcceptIndicator(this.autoAcceptIndicator());
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

        if (hasNumDaysInterest())
        {
            encoder.numDaysInterest(this.numDaysInterest());
        }

        if (hasAccruedInterestRate())
        {
            encoder.accruedInterestRate(this.accruedInterestRate());
        }

        if (hasAccruedInterestAmt())
        {
            encoder.accruedInterestAmt(this.accruedInterestAmt());
        }

        if (hasTotalAccruedInterestAmt())
        {
            encoder.totalAccruedInterestAmt(this.totalAccruedInterestAmt());
        }

        if (hasInterestAtMaturity())
        {
            encoder.interestAtMaturity(this.interestAtMaturity());
        }

        if (hasEndAccruedInterestAmt())
        {
            encoder.endAccruedInterestAmt(this.endAccruedInterestAmt());
        }

        if (hasStartCash())
        {
            encoder.startCash(this.startCash());
        }

        if (hasEndCash())
        {
            encoder.endCash(this.endCash());
        }

        if (hasLegalConfirm())
        {
            encoder.legalConfirm(this.legalConfirm());
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


        if (hasTotNoAllocs())
        {
            encoder.totNoAllocs(this.totNoAllocs());
        }

        if (hasLastFragment())
        {
            encoder.lastFragment(this.lastFragment());
        }


        final AllocGrpEncoder allocGrp = encoder.allocGrp();        if (hasNoAllocsGroupCounter)
        {
            final int size = this.noAllocsGroupCounter;
            AllocsGroupDecoder allocsGroup = this.allocsGroup;
            AllocsGroupEncoder allocsGroupEncoder = allocGrp.allocsGroup(size);
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


        if (hasAvgPxIndicator())
        {
            encoder.avgPxIndicator(this.avgPxIndicator());
        }

        if (hasClearingBusinessDate())
        {
            encoder.clearingBusinessDateAsCopy(this.clearingBusinessDate(), 0, clearingBusinessDateLength());
        }

        if (hasTrdType())
        {
            encoder.trdType(this.trdType());
        }

        if (hasTrdSubType())
        {
            encoder.trdSubType(this.trdSubType());
        }

        if (hasCustOrderCapacity())
        {
            encoder.custOrderCapacity(this.custOrderCapacity());
        }

        if (hasTradeInputSource())
        {
            encoder.tradeInputSource(this.tradeInputSource(), 0, tradeInputSourceLength());
        }

        if (hasMultiLegReportingType())
        {
            encoder.multiLegReportingType(this.multiLegReportingType());
        }

        if (hasMessageEventSource())
        {
            encoder.messageEventSource(this.messageEventSource(), 0, messageEventSourceLength());
        }

        if (hasRndPx())
        {
            encoder.rndPx(this.rndPx());
        }
        return encoder;
    }

}
