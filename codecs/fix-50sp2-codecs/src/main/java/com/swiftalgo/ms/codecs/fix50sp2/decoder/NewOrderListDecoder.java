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
import com.swiftalgo.ms.codecs.fix50sp2.builder.NewOrderListEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.RootPartiesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.RootPartiesEncoder.RootPartyIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.RootSubPartiesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.RootSubPartiesEncoder.RootPartySubIDsGroupEncoder;
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


public class NewOrderListDecoder extends CommonDecoderImpl implements RootPartiesDecoder, ListOrdGrpDecoder, MessageDecoder
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(8);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            REQUIRED_FIELDS.add(Constants.LIST_ID);
            REQUIRED_FIELDS.add(Constants.BID_TYPE);
            REQUIRED_FIELDS.add(Constants.TOT_NO_ORDERS);
            REQUIRED_FIELDS.add(Constants.NO_ORDERS_GROUP_COUNTER);
        }
    }

    public final IntHashSet GROUP_FIELDS = new IntHashSet(38);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            GROUP_FIELDS.add(Constants.LIST_ID);
            GROUP_FIELDS.add(Constants.BID_ID);
            GROUP_FIELDS.add(Constants.CLIENT_BID_ID);
            GROUP_FIELDS.add(Constants.PROG_RPT_REQS);
            GROUP_FIELDS.add(Constants.BID_TYPE);
            GROUP_FIELDS.add(Constants.PROG_PERIOD_INTERVAL);
            GROUP_FIELDS.add(Constants.CANCELLATION_RIGHTS);
            GROUP_FIELDS.add(Constants.MONEY_LAUNDERING_STATUS);
            GROUP_FIELDS.add(Constants.REGIST_ID);
            GROUP_FIELDS.add(Constants.LIST_EXEC_INST_TYPE);
            GROUP_FIELDS.add(Constants.LIST_EXEC_INST);
            GROUP_FIELDS.add(Constants.CONTINGENCY_TYPE);
            GROUP_FIELDS.add(Constants.ENCODED_LIST_EXEC_INST_LEN);
            GROUP_FIELDS.add(Constants.ENCODED_LIST_EXEC_INST);
            GROUP_FIELDS.add(Constants.ALLOWABLE_ONE_SIDEDNESS_PCT);
            GROUP_FIELDS.add(Constants.ALLOWABLE_ONE_SIDEDNESS_VALUE);
            GROUP_FIELDS.add(Constants.ALLOWABLE_ONE_SIDEDNESS_CURR);
            GROUP_FIELDS.add(Constants.TOT_NO_ORDERS);
            GROUP_FIELDS.add(Constants.LAST_FRAGMENT);
        }
    }

    private final IntHashSet alreadyVisitedFields = new IntHashSet(38);

    private final IntHashSet unknownFields = new IntHashSet(10);

    private final IntHashSet missingRequiredFields = new IntHashSet(8);

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
        if (hasProgRptReqs)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !ProgRptReqs.isValid(progRptReqs()))
        {
            invalidTagId = 414;
            rejectReason = 5;
            return false;
        }
        }

        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !BidType.isValid(bidType()))
        {
            invalidTagId = 394;
            rejectReason = 5;
            return false;
        }

        if (hasCancellationRights)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !CancellationRights.isValid(cancellationRights()))
        {
            invalidTagId = 480;
            rejectReason = 5;
            return false;
        }
        }

        if (hasMoneyLaunderingStatus)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !MoneyLaunderingStatus.isValid(moneyLaunderingStatus()))
        {
            invalidTagId = 481;
            rejectReason = 5;
            return false;
        }
        }

        if (hasListExecInstType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !ListExecInstType.isValid(listExecInstType()))
        {
            invalidTagId = 433;
            rejectReason = 5;
            return false;
        }
        }

        if (hasContingencyType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !ContingencyType.isValid(contingencyType()))
        {
            invalidTagId = 1385;
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

        {
            int count = 0;
            final OrdersGroupIterator iterator = ordersGroupIterator.iterator();
            for (final OrdersGroupDecoder group : iterator)
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
                invalidTagId = 73;
                rejectReason = 16;
                return false;
            }
        }
        return true;
    }

    public static final long MESSAGE_TYPE = 69L;

    public static final String MESSAGE_TYPE_AS_STRING = "E";

    public static final char[] MESSAGE_TYPE_CHARS = MESSAGE_TYPE_AS_STRING.toCharArray();

    public static final byte[] MESSAGE_TYPE_BYTES = MESSAGE_TYPE_AS_STRING.getBytes(US_ASCII);

    public final IntHashSet messageFields = new IntHashSet(840);

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
        messageFields.add(Constants.LIST_ID);
        messageFields.add(Constants.BID_ID);
        messageFields.add(Constants.CLIENT_BID_ID);
        messageFields.add(Constants.PROG_RPT_REQS);
        messageFields.add(Constants.BID_TYPE);
        messageFields.add(Constants.PROG_PERIOD_INTERVAL);
        messageFields.add(Constants.CANCELLATION_RIGHTS);
        messageFields.add(Constants.MONEY_LAUNDERING_STATUS);
        messageFields.add(Constants.REGIST_ID);
        messageFields.add(Constants.LIST_EXEC_INST_TYPE);
        messageFields.add(Constants.LIST_EXEC_INST);
        messageFields.add(Constants.CONTINGENCY_TYPE);
        messageFields.add(Constants.ENCODED_LIST_EXEC_INST_LEN);
        messageFields.add(Constants.ENCODED_LIST_EXEC_INST);
        messageFields.add(Constants.ALLOWABLE_ONE_SIDEDNESS_PCT);
        messageFields.add(Constants.ALLOWABLE_ONE_SIDEDNESS_VALUE);
        messageFields.add(Constants.ALLOWABLE_ONE_SIDEDNESS_CURR);
        messageFields.add(Constants.TOT_NO_ORDERS);
        messageFields.add(Constants.LAST_FRAGMENT);
        messageFields.add(Constants.NO_ROOT_PARTY_IDS_GROUP_COUNTER);
        messageFields.add(Constants.ROOT_PARTY_ID);
        messageFields.add(Constants.ROOT_PARTY_ID_SOURCE);
        messageFields.add(Constants.ROOT_PARTY_ROLE);
        messageFields.add(Constants.NO_ROOT_PARTY_SUB_IDS_GROUP_COUNTER);
        messageFields.add(Constants.ROOT_PARTY_SUB_ID);
        messageFields.add(Constants.ROOT_PARTY_SUB_ID_TYPE);
        messageFields.add(Constants.NO_ORDERS_GROUP_COUNTER);
        messageFields.add(Constants.CL_ORD_ID);
        messageFields.add(Constants.SECONDARY_CL_ORD_ID);
        messageFields.add(Constants.LIST_SEQ_NO);
        messageFields.add(Constants.CL_ORD_LINK_ID);
        messageFields.add(Constants.SETTL_INST_MODE);
        messageFields.add(Constants.NO_PARTY_IDS_GROUP_COUNTER);
        messageFields.add(Constants.PARTY_ID);
        messageFields.add(Constants.PARTY_ID_SOURCE);
        messageFields.add(Constants.PARTY_ROLE);
        messageFields.add(Constants.NO_PARTY_SUB_IDS_GROUP_COUNTER);
        messageFields.add(Constants.PARTY_SUB_ID);
        messageFields.add(Constants.PARTY_SUB_ID_TYPE);
        messageFields.add(Constants.TRADE_ORIGINATION_DATE);
        messageFields.add(Constants.TRADE_DATE);
        messageFields.add(Constants.ACCOUNT);
        messageFields.add(Constants.ACCT_ID_SOURCE);
        messageFields.add(Constants.ACCOUNT_TYPE);
        messageFields.add(Constants.DAY_BOOKING_INST);
        messageFields.add(Constants.BOOKING_UNIT);
        messageFields.add(Constants.ALLOC_ID);
        messageFields.add(Constants.PREALLOC_METHOD);
        messageFields.add(Constants.NO_ALLOCS_GROUP_COUNTER);
        messageFields.add(Constants.ALLOC_ACCOUNT);
        messageFields.add(Constants.ALLOC_ACCT_ID_SOURCE);
        messageFields.add(Constants.ALLOC_SETTL_CURRENCY);
        messageFields.add(Constants.INDIVIDUAL_ALLOC_ID);
        messageFields.add(Constants.NO_NESTED_PARTY_IDS_GROUP_COUNTER);
        messageFields.add(Constants.NESTED_PARTY_ID);
        messageFields.add(Constants.NESTED_PARTY_ID_SOURCE);
        messageFields.add(Constants.NESTED_PARTY_ROLE);
        messageFields.add(Constants.NO_NESTED_PARTY_SUB_IDS_GROUP_COUNTER);
        messageFields.add(Constants.NESTED_PARTY_SUB_ID);
        messageFields.add(Constants.NESTED_PARTY_SUB_ID_TYPE);
        messageFields.add(Constants.ALLOC_QTY);
        messageFields.add(Constants.SETTL_TYPE);
        messageFields.add(Constants.SETTL_DATE);
        messageFields.add(Constants.CASH_MARGIN);
        messageFields.add(Constants.CLEARING_FEE_INDICATOR);
        messageFields.add(Constants.HANDL_INST);
        messageFields.add(Constants.EXEC_INST);
        messageFields.add(Constants.MIN_QTY);
        messageFields.add(Constants.MATCH_INCREMENT);
        messageFields.add(Constants.MAX_PRICE_LEVELS);
        messageFields.add(Constants.DISPLAY_QTY);
        messageFields.add(Constants.SECONDARY_DISPLAY_QTY);
        messageFields.add(Constants.DISPLAY_WHEN);
        messageFields.add(Constants.DISPLAY_METHOD);
        messageFields.add(Constants.DISPLAY_LOW_QTY);
        messageFields.add(Constants.DISPLAY_HIGH_QTY);
        messageFields.add(Constants.DISPLAY_MIN_INCR);
        messageFields.add(Constants.REFRESH_QTY);
        messageFields.add(Constants.MAX_FLOOR);
        messageFields.add(Constants.EX_DESTINATION);
        messageFields.add(Constants.EX_DESTINATION_ID_SOURCE);
        messageFields.add(Constants.NO_TRADING_SESSIONS_GROUP_COUNTER);
        messageFields.add(Constants.TRADING_SESSION_ID);
        messageFields.add(Constants.TRADING_SESSION_SUB_ID);
        messageFields.add(Constants.PROCESS_CODE);
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
        messageFields.add(Constants.PREV_CLOSE_PX);
        messageFields.add(Constants.SIDE);
        messageFields.add(Constants.SIDE_VALUE_IND);
        messageFields.add(Constants.LOCATE_REQD);
        messageFields.add(Constants.TRANSACT_TIME);
        messageFields.add(Constants.NO_STIPULATIONS_GROUP_COUNTER);
        messageFields.add(Constants.STIPULATION_TYPE);
        messageFields.add(Constants.STIPULATION_VALUE);
        messageFields.add(Constants.QTY_TYPE);
        messageFields.add(Constants.ORDER_QTY);
        messageFields.add(Constants.CASH_ORDER_QTY);
        messageFields.add(Constants.ORDER_PERCENT);
        messageFields.add(Constants.ROUNDING_DIRECTION);
        messageFields.add(Constants.ROUNDING_MODULUS);
        messageFields.add(Constants.ORD_TYPE);
        messageFields.add(Constants.PRICE_TYPE);
        messageFields.add(Constants.PRICE);
        messageFields.add(Constants.PRICE_PROTECTION_SCOPE);
        messageFields.add(Constants.STOP_PX);
        messageFields.add(Constants.TRIGGER_TYPE);
        messageFields.add(Constants.TRIGGER_ACTION);
        messageFields.add(Constants.TRIGGER_PRICE);
        messageFields.add(Constants.TRIGGER_SYMBOL);
        messageFields.add(Constants.TRIGGER_SECURITY_ID);
        messageFields.add(Constants.TRIGGER_SECURITY_ID_SOURCE);
        messageFields.add(Constants.TRIGGER_SECURITY_DESC);
        messageFields.add(Constants.TRIGGER_PRICE_TYPE);
        messageFields.add(Constants.TRIGGER_PRICE_TYPE_SCOPE);
        messageFields.add(Constants.TRIGGER_PRICE_DIRECTION);
        messageFields.add(Constants.TRIGGER_NEW_PRICE);
        messageFields.add(Constants.TRIGGER_ORDER_TYPE);
        messageFields.add(Constants.TRIGGER_NEW_QTY);
        messageFields.add(Constants.TRIGGER_TRADING_SESSION_ID);
        messageFields.add(Constants.TRIGGER_TRADING_SESSION_SUB_ID);
        messageFields.add(Constants.SPREAD);
        messageFields.add(Constants.BENCHMARK_CURVE_CURRENCY);
        messageFields.add(Constants.BENCHMARK_CURVE_NAME);
        messageFields.add(Constants.BENCHMARK_CURVE_POINT);
        messageFields.add(Constants.BENCHMARK_PRICE);
        messageFields.add(Constants.BENCHMARK_PRICE_TYPE);
        messageFields.add(Constants.BENCHMARK_SECURITY_ID);
        messageFields.add(Constants.BENCHMARK_SECURITY_ID_SOURCE);
        messageFields.add(Constants.YIELD_TYPE);
        messageFields.add(Constants.YIELD);
        messageFields.add(Constants.YIELD_CALC_DATE);
        messageFields.add(Constants.YIELD_REDEMPTION_DATE);
        messageFields.add(Constants.YIELD_REDEMPTION_PRICE);
        messageFields.add(Constants.YIELD_REDEMPTION_PRICE_TYPE);
        messageFields.add(Constants.CURRENCY);
        messageFields.add(Constants.COMPLIANCE_ID);
        messageFields.add(Constants.SOLICITED_FLAG);
        messageFields.add(Constants.I_O_I_ID);
        messageFields.add(Constants.QUOTE_ID);
        messageFields.add(Constants.REF_ORDER_ID);
        messageFields.add(Constants.REF_ORDER_ID_SOURCE);
        messageFields.add(Constants.TIME_IN_FORCE);
        messageFields.add(Constants.EFFECTIVE_TIME);
        messageFields.add(Constants.EXPIRE_DATE);
        messageFields.add(Constants.EXPIRE_TIME);
        messageFields.add(Constants.G_T_BOOKING_INST);
        messageFields.add(Constants.COMMISSION);
        messageFields.add(Constants.COMM_TYPE);
        messageFields.add(Constants.COMM_CURRENCY);
        messageFields.add(Constants.FUND_RENEW_WAIV);
        messageFields.add(Constants.ORDER_CAPACITY);
        messageFields.add(Constants.ORDER_RESTRICTIONS);
        messageFields.add(Constants.PRE_TRADE_ANONYMITY);
        messageFields.add(Constants.CUST_ORDER_CAPACITY);
        messageFields.add(Constants.FOREX_REQ);
        messageFields.add(Constants.SETTL_CURRENCY);
        messageFields.add(Constants.BOOKING_TYPE);
        messageFields.add(Constants.TEXT);
        messageFields.add(Constants.ENCODED_TEXT_LEN);
        messageFields.add(Constants.ENCODED_TEXT);
        messageFields.add(Constants.SETTL_DATE2);
        messageFields.add(Constants.ORDER_QTY2);
        messageFields.add(Constants.PRICE2);
        messageFields.add(Constants.POSITION_EFFECT);
        messageFields.add(Constants.COVERED_OR_UNCOVERED);
        messageFields.add(Constants.MAX_SHOW);
        messageFields.add(Constants.PEG_OFFSET_VALUE);
        messageFields.add(Constants.PEG_PRICE_TYPE);
        messageFields.add(Constants.PEG_MOVE_TYPE);
        messageFields.add(Constants.PEG_OFFSET_TYPE);
        messageFields.add(Constants.PEG_LIMIT_TYPE);
        messageFields.add(Constants.PEG_ROUND_DIRECTION);
        messageFields.add(Constants.PEG_SCOPE);
        messageFields.add(Constants.PEG_SECURITY_ID_SOURCE);
        messageFields.add(Constants.PEG_SECURITY_ID);
        messageFields.add(Constants.PEG_SYMBOL);
        messageFields.add(Constants.PEG_SECURITY_DESC);
        messageFields.add(Constants.DISCRETION_INST);
        messageFields.add(Constants.DISCRETION_OFFSET_VALUE);
        messageFields.add(Constants.DISCRETION_MOVE_TYPE);
        messageFields.add(Constants.DISCRETION_OFFSET_TYPE);
        messageFields.add(Constants.DISCRETION_LIMIT_TYPE);
        messageFields.add(Constants.DISCRETION_ROUND_DIRECTION);
        messageFields.add(Constants.DISCRETION_SCOPE);
        messageFields.add(Constants.TARGET_STRATEGY);
        messageFields.add(Constants.NO_STRATEGY_PARAMETERS_GROUP_COUNTER);
        messageFields.add(Constants.STRATEGY_PARAMETER_NAME);
        messageFields.add(Constants.STRATEGY_PARAMETER_TYPE);
        messageFields.add(Constants.STRATEGY_PARAMETER_VALUE);
        messageFields.add(Constants.TARGET_STRATEGY_PARAMETERS);
        messageFields.add(Constants.PARTICIPATION_RATE);
        messageFields.add(Constants.DESIGNATION);
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

    private char[] listID = new char[1];

    public char[] listID()
    {
        return listID;
    }


    private int listIDOffset;

    private int listIDLength;

    public int listIDLength()
    {
        return listIDLength;
    }

    public String listIDAsString()
    {
        return new String(listID, 0, listIDLength);
    }

    public void listID(final AsciiSequenceView view)
    {
        view.wrap(buffer, listIDOffset, listIDLength);
    }


    private final CharArrayWrapper listIDWrapper = new CharArrayWrapper();
    private char[] bidID = new char[1];

    private boolean hasBidID;

    public char[] bidID()
    {
        if (!hasBidID)
        {
            throw new IllegalArgumentException("No value for optional field: BidID");
        }

        return bidID;
    }

    public boolean hasBidID()
    {
        return hasBidID;
    }


    private int bidIDOffset;

    private int bidIDLength;

    public int bidIDLength()
    {
        if (!hasBidID)
        {
            throw new IllegalArgumentException("No value for optional field: BidID");
        }

        return bidIDLength;
    }

    public String bidIDAsString()
    {
        return hasBidID ? new String(bidID, 0, bidIDLength) : null;
    }

    public void bidID(final AsciiSequenceView view)
    {
        if (!hasBidID)
        {
            throw new IllegalArgumentException("No value for optional field: BidID");
        }

        view.wrap(buffer, bidIDOffset, bidIDLength);
    }


    private final CharArrayWrapper bidIDWrapper = new CharArrayWrapper();
    private char[] clientBidID = new char[1];

    private boolean hasClientBidID;

    public char[] clientBidID()
    {
        if (!hasClientBidID)
        {
            throw new IllegalArgumentException("No value for optional field: ClientBidID");
        }

        return clientBidID;
    }

    public boolean hasClientBidID()
    {
        return hasClientBidID;
    }


    private int clientBidIDOffset;

    private int clientBidIDLength;

    public int clientBidIDLength()
    {
        if (!hasClientBidID)
        {
            throw new IllegalArgumentException("No value for optional field: ClientBidID");
        }

        return clientBidIDLength;
    }

    public String clientBidIDAsString()
    {
        return hasClientBidID ? new String(clientBidID, 0, clientBidIDLength) : null;
    }

    public void clientBidID(final AsciiSequenceView view)
    {
        if (!hasClientBidID)
        {
            throw new IllegalArgumentException("No value for optional field: ClientBidID");
        }

        view.wrap(buffer, clientBidIDOffset, clientBidIDLength);
    }


    private final CharArrayWrapper clientBidIDWrapper = new CharArrayWrapper();
    private int progRptReqs = MISSING_INT;

    private boolean hasProgRptReqs;

    public int progRptReqs()
    {
        if (!hasProgRptReqs)
        {
            throw new IllegalArgumentException("No value for optional field: ProgRptReqs");
        }

        return progRptReqs;
    }

    public boolean hasProgRptReqs()
    {
        return hasProgRptReqs;
    }



    private final CharArrayWrapper progRptReqsWrapper = new CharArrayWrapper();
    public ProgRptReqs progRptReqsAsEnum()
    {
        if (!hasProgRptReqs)
 return ProgRptReqs.NULL_VAL;
        return ProgRptReqs.decode(progRptReqs);
    }

    private int bidType = MISSING_INT;

    public int bidType()
    {
        return bidType;
    }



    private final CharArrayWrapper bidTypeWrapper = new CharArrayWrapper();
    public BidType bidTypeAsEnum()
    {
        return BidType.decode(bidType);
    }

    private int progPeriodInterval = MISSING_INT;

    private boolean hasProgPeriodInterval;

    public int progPeriodInterval()
    {
        if (!hasProgPeriodInterval)
        {
            throw new IllegalArgumentException("No value for optional field: ProgPeriodInterval");
        }

        return progPeriodInterval;
    }

    public boolean hasProgPeriodInterval()
    {
        return hasProgPeriodInterval;
    }



    private char cancellationRights = MISSING_CHAR;

    private boolean hasCancellationRights;

    public char cancellationRights()
    {
        if (!hasCancellationRights)
        {
            throw new IllegalArgumentException("No value for optional field: CancellationRights");
        }

        return cancellationRights;
    }

    public boolean hasCancellationRights()
    {
        return hasCancellationRights;
    }



    private final CharArrayWrapper cancellationRightsWrapper = new CharArrayWrapper();
    public CancellationRights cancellationRightsAsEnum()
    {
        if (!hasCancellationRights)
 return CancellationRights.NULL_VAL;
        return CancellationRights.decode(cancellationRights);
    }

    private char moneyLaunderingStatus = MISSING_CHAR;

    private boolean hasMoneyLaunderingStatus;

    public char moneyLaunderingStatus()
    {
        if (!hasMoneyLaunderingStatus)
        {
            throw new IllegalArgumentException("No value for optional field: MoneyLaunderingStatus");
        }

        return moneyLaunderingStatus;
    }

    public boolean hasMoneyLaunderingStatus()
    {
        return hasMoneyLaunderingStatus;
    }



    private final CharArrayWrapper moneyLaunderingStatusWrapper = new CharArrayWrapper();
    public MoneyLaunderingStatus moneyLaunderingStatusAsEnum()
    {
        if (!hasMoneyLaunderingStatus)
 return MoneyLaunderingStatus.NULL_VAL;
        return MoneyLaunderingStatus.decode(moneyLaunderingStatus);
    }

    private char[] registID = new char[1];

    private boolean hasRegistID;

    public char[] registID()
    {
        if (!hasRegistID)
        {
            throw new IllegalArgumentException("No value for optional field: RegistID");
        }

        return registID;
    }

    public boolean hasRegistID()
    {
        return hasRegistID;
    }


    private int registIDOffset;

    private int registIDLength;

    public int registIDLength()
    {
        if (!hasRegistID)
        {
            throw new IllegalArgumentException("No value for optional field: RegistID");
        }

        return registIDLength;
    }

    public String registIDAsString()
    {
        return hasRegistID ? new String(registID, 0, registIDLength) : null;
    }

    public void registID(final AsciiSequenceView view)
    {
        if (!hasRegistID)
        {
            throw new IllegalArgumentException("No value for optional field: RegistID");
        }

        view.wrap(buffer, registIDOffset, registIDLength);
    }


    private final CharArrayWrapper registIDWrapper = new CharArrayWrapper();
    private char listExecInstType = MISSING_CHAR;

    private boolean hasListExecInstType;

    public char listExecInstType()
    {
        if (!hasListExecInstType)
        {
            throw new IllegalArgumentException("No value for optional field: ListExecInstType");
        }

        return listExecInstType;
    }

    public boolean hasListExecInstType()
    {
        return hasListExecInstType;
    }



    private final CharArrayWrapper listExecInstTypeWrapper = new CharArrayWrapper();
    public ListExecInstType listExecInstTypeAsEnum()
    {
        if (!hasListExecInstType)
 return ListExecInstType.NULL_VAL;
        return ListExecInstType.decode(listExecInstType);
    }

    private char[] listExecInst = new char[1];

    private boolean hasListExecInst;

    public char[] listExecInst()
    {
        if (!hasListExecInst)
        {
            throw new IllegalArgumentException("No value for optional field: ListExecInst");
        }

        return listExecInst;
    }

    public boolean hasListExecInst()
    {
        return hasListExecInst;
    }


    private int listExecInstOffset;

    private int listExecInstLength;

    public int listExecInstLength()
    {
        if (!hasListExecInst)
        {
            throw new IllegalArgumentException("No value for optional field: ListExecInst");
        }

        return listExecInstLength;
    }

    public String listExecInstAsString()
    {
        return hasListExecInst ? new String(listExecInst, 0, listExecInstLength) : null;
    }

    public void listExecInst(final AsciiSequenceView view)
    {
        if (!hasListExecInst)
        {
            throw new IllegalArgumentException("No value for optional field: ListExecInst");
        }

        view.wrap(buffer, listExecInstOffset, listExecInstLength);
    }


    private final CharArrayWrapper listExecInstWrapper = new CharArrayWrapper();
    private int contingencyType = MISSING_INT;

    private boolean hasContingencyType;

    public int contingencyType()
    {
        if (!hasContingencyType)
        {
            throw new IllegalArgumentException("No value for optional field: ContingencyType");
        }

        return contingencyType;
    }

    public boolean hasContingencyType()
    {
        return hasContingencyType;
    }



    private final CharArrayWrapper contingencyTypeWrapper = new CharArrayWrapper();
    public ContingencyType contingencyTypeAsEnum()
    {
        if (!hasContingencyType)
 return ContingencyType.NULL_VAL;
        return ContingencyType.decode(contingencyType);
    }

    private int encodedListExecInstLen = MISSING_INT;

    private boolean hasEncodedListExecInstLen;

    public int encodedListExecInstLen()
    {
        if (!hasEncodedListExecInstLen)
        {
            throw new IllegalArgumentException("No value for optional field: EncodedListExecInstLen");
        }

        return encodedListExecInstLen;
    }

    public boolean hasEncodedListExecInstLen()
    {
        return hasEncodedListExecInstLen;
    }



    private byte[] encodedListExecInst = new byte[1];

    private boolean hasEncodedListExecInst;

    public byte[] encodedListExecInst()
    {
        if (!hasEncodedListExecInst)
        {
            throw new IllegalArgumentException("No value for optional field: EncodedListExecInst");
        }

        return encodedListExecInst;
    }

    public boolean hasEncodedListExecInst()
    {
        return hasEncodedListExecInst;
    }



    private DecimalFloat allowableOneSidednessPct = DecimalFloat.newNaNValue();

    private boolean hasAllowableOneSidednessPct;

    public DecimalFloat allowableOneSidednessPct()
    {
        if (!hasAllowableOneSidednessPct)
        {
            throw new IllegalArgumentException("No value for optional field: AllowableOneSidednessPct");
        }

        return allowableOneSidednessPct;
    }

    public boolean hasAllowableOneSidednessPct()
    {
        return hasAllowableOneSidednessPct;
    }



    private DecimalFloat allowableOneSidednessValue = DecimalFloat.newNaNValue();

    private boolean hasAllowableOneSidednessValue;

    public DecimalFloat allowableOneSidednessValue()
    {
        if (!hasAllowableOneSidednessValue)
        {
            throw new IllegalArgumentException("No value for optional field: AllowableOneSidednessValue");
        }

        return allowableOneSidednessValue;
    }

    public boolean hasAllowableOneSidednessValue()
    {
        return hasAllowableOneSidednessValue;
    }



    private char[] allowableOneSidednessCurr = new char[1];

    private boolean hasAllowableOneSidednessCurr;

    public char[] allowableOneSidednessCurr()
    {
        if (!hasAllowableOneSidednessCurr)
        {
            throw new IllegalArgumentException("No value for optional field: AllowableOneSidednessCurr");
        }

        return allowableOneSidednessCurr;
    }

    public boolean hasAllowableOneSidednessCurr()
    {
        return hasAllowableOneSidednessCurr;
    }


    private int allowableOneSidednessCurrOffset;

    private int allowableOneSidednessCurrLength;

    public int allowableOneSidednessCurrLength()
    {
        if (!hasAllowableOneSidednessCurr)
        {
            throw new IllegalArgumentException("No value for optional field: AllowableOneSidednessCurr");
        }

        return allowableOneSidednessCurrLength;
    }

    public String allowableOneSidednessCurrAsString()
    {
        return hasAllowableOneSidednessCurr ? new String(allowableOneSidednessCurr, 0, allowableOneSidednessCurrLength) : null;
    }

    public void allowableOneSidednessCurr(final AsciiSequenceView view)
    {
        if (!hasAllowableOneSidednessCurr)
        {
            throw new IllegalArgumentException("No value for optional field: AllowableOneSidednessCurr");
        }

        view.wrap(buffer, allowableOneSidednessCurrOffset, allowableOneSidednessCurrLength);
    }


    private int totNoOrders = MISSING_INT;

    public int totNoOrders()
    {
        return totNoOrders;
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


    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode NewOrderList
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
            case Constants.LIST_ID:
                listID = buffer.getChars(listID, valueOffset, valueLength);
                listIDOffset = valueOffset;
                listIDLength = valueLength;
                break;

            case Constants.BID_ID:
                hasBidID = true;
                bidID = buffer.getChars(bidID, valueOffset, valueLength);
                bidIDOffset = valueOffset;
                bidIDLength = valueLength;
                break;

            case Constants.CLIENT_BID_ID:
                hasClientBidID = true;
                clientBidID = buffer.getChars(clientBidID, valueOffset, valueLength);
                clientBidIDOffset = valueOffset;
                clientBidIDLength = valueLength;
                break;

            case Constants.PROG_RPT_REQS:
                hasProgRptReqs = true;
                progRptReqs = getInt(buffer, valueOffset, endOfField, 414, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.BID_TYPE:
                bidType = getInt(buffer, valueOffset, endOfField, 394, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.PROG_PERIOD_INTERVAL:
                hasProgPeriodInterval = true;
                progPeriodInterval = getInt(buffer, valueOffset, endOfField, 415, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.CANCELLATION_RIGHTS:
                hasCancellationRights = true;
                cancellationRights = buffer.getChar(valueOffset);
                break;

            case Constants.MONEY_LAUNDERING_STATUS:
                hasMoneyLaunderingStatus = true;
                moneyLaunderingStatus = buffer.getChar(valueOffset);
                break;

            case Constants.REGIST_ID:
                hasRegistID = true;
                registID = buffer.getChars(registID, valueOffset, valueLength);
                registIDOffset = valueOffset;
                registIDLength = valueLength;
                break;

            case Constants.LIST_EXEC_INST_TYPE:
                hasListExecInstType = true;
                listExecInstType = buffer.getChar(valueOffset);
                break;

            case Constants.LIST_EXEC_INST:
                hasListExecInst = true;
                listExecInst = buffer.getChars(listExecInst, valueOffset, valueLength);
                listExecInstOffset = valueOffset;
                listExecInstLength = valueLength;
                break;

            case Constants.CONTINGENCY_TYPE:
                hasContingencyType = true;
                contingencyType = getInt(buffer, valueOffset, endOfField, 1385, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.ENCODED_LIST_EXEC_INST_LEN:
                hasEncodedListExecInstLen = true;
                encodedListExecInstLen = getInt(buffer, valueOffset, endOfField, 352, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.ENCODED_LIST_EXEC_INST:
                hasEncodedListExecInst = true;
                encodedListExecInst = buffer.getBytes(encodedListExecInst, valueOffset, encodedListExecInstLen);
                endOfField = valueOffset + encodedListExecInstLen;
                break;

            case Constants.ALLOWABLE_ONE_SIDEDNESS_PCT:
                hasAllowableOneSidednessPct = true;
                allowableOneSidednessPct = getFloat(buffer, allowableOneSidednessPct, valueOffset, valueLength, 765, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.ALLOWABLE_ONE_SIDEDNESS_VALUE:
                hasAllowableOneSidednessValue = true;
                allowableOneSidednessValue = getFloat(buffer, allowableOneSidednessValue, valueOffset, valueLength, 766, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.ALLOWABLE_ONE_SIDEDNESS_CURR:
                hasAllowableOneSidednessCurr = true;
                allowableOneSidednessCurr = buffer.getChars(allowableOneSidednessCurr, valueOffset, valueLength);
                allowableOneSidednessCurrOffset = valueOffset;
                allowableOneSidednessCurrLength = valueLength;
                break;

            case Constants.TOT_NO_ORDERS:
                totNoOrders = getInt(buffer, valueOffset, endOfField, 68, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.LAST_FRAGMENT:
                hasLastFragment = true;
                lastFragment = buffer.getBoolean(valueOffset);
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
        this.resetListID();
        this.resetBidID();
        this.resetClientBidID();
        this.resetProgRptReqs();
        this.resetBidType();
        this.resetProgPeriodInterval();
        this.resetCancellationRights();
        this.resetMoneyLaunderingStatus();
        this.resetRegistID();
        this.resetListExecInstType();
        this.resetListExecInst();
        this.resetContingencyType();
        this.resetEncodedListExecInstLen();
        this.resetEncodedListExecInst();
        this.resetAllowableOneSidednessPct();
        this.resetAllowableOneSidednessValue();
        this.resetAllowableOneSidednessCurr();
        this.resetTotNoOrders();
        this.resetLastFragment();
        this.resetRootPartyIDsGroup();
        this.resetOrdersGroup();
    }

    public void resetListID()
    {
        listIDOffset = 0;
        listIDLength = 0;
    }

    public void resetBidID()
    {
        hasBidID = false;
    }

    public void resetClientBidID()
    {
        hasClientBidID = false;
    }

    public void resetProgRptReqs()
    {
        hasProgRptReqs = false;
    }

    public void resetBidType()
    {
        bidType = MISSING_INT;
    }

    public void resetProgPeriodInterval()
    {
        hasProgPeriodInterval = false;
    }

    public void resetCancellationRights()
    {
        hasCancellationRights = false;
    }

    public void resetMoneyLaunderingStatus()
    {
        hasMoneyLaunderingStatus = false;
    }

    public void resetRegistID()
    {
        hasRegistID = false;
    }

    public void resetListExecInstType()
    {
        hasListExecInstType = false;
    }

    public void resetListExecInst()
    {
        hasListExecInst = false;
    }

    public void resetContingencyType()
    {
        hasContingencyType = false;
    }

    public void resetEncodedListExecInstLen()
    {
        hasEncodedListExecInstLen = false;
    }

    public void resetEncodedListExecInst()
    {
        hasEncodedListExecInst = false;
    }

    public void resetAllowableOneSidednessPct()
    {
        hasAllowableOneSidednessPct = false;
    }

    public void resetAllowableOneSidednessValue()
    {
        hasAllowableOneSidednessValue = false;
    }

    public void resetAllowableOneSidednessCurr()
    {
        hasAllowableOneSidednessCurr = false;
    }

    public void resetTotNoOrders()
    {
        totNoOrders = MISSING_INT;
    }

    public void resetLastFragment()
    {
        hasLastFragment = false;
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
        builder.append("\"MessageName\": \"NewOrderList\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        indent(builder, level);
        builder.append("\"ListID\": \"");
        builder.append(this.listID(), 0, listIDLength());
        builder.append("\",\n");

        if (hasBidID())
        {
            indent(builder, level);
            builder.append("\"BidID\": \"");
            builder.append(this.bidID(), 0, bidIDLength());
            builder.append("\",\n");
        }

        if (hasClientBidID())
        {
            indent(builder, level);
            builder.append("\"ClientBidID\": \"");
            builder.append(this.clientBidID(), 0, clientBidIDLength());
            builder.append("\",\n");
        }

        if (hasProgRptReqs())
        {
            indent(builder, level);
            builder.append("\"ProgRptReqs\": \"");
            builder.append(progRptReqs);
            builder.append("\",\n");
        }

        indent(builder, level);
        builder.append("\"BidType\": \"");
        builder.append(bidType);
        builder.append("\",\n");

        if (hasProgPeriodInterval())
        {
            indent(builder, level);
            builder.append("\"ProgPeriodInterval\": \"");
            builder.append(progPeriodInterval);
            builder.append("\",\n");
        }

        if (hasCancellationRights())
        {
            indent(builder, level);
            builder.append("\"CancellationRights\": \"");
            builder.append(cancellationRights);
            builder.append("\",\n");
        }

        if (hasMoneyLaunderingStatus())
        {
            indent(builder, level);
            builder.append("\"MoneyLaunderingStatus\": \"");
            builder.append(moneyLaunderingStatus);
            builder.append("\",\n");
        }

        if (hasRegistID())
        {
            indent(builder, level);
            builder.append("\"RegistID\": \"");
            builder.append(this.registID(), 0, registIDLength());
            builder.append("\",\n");
        }

        if (hasListExecInstType())
        {
            indent(builder, level);
            builder.append("\"ListExecInstType\": \"");
            builder.append(listExecInstType);
            builder.append("\",\n");
        }

        if (hasListExecInst())
        {
            indent(builder, level);
            builder.append("\"ListExecInst\": \"");
            builder.append(this.listExecInst(), 0, listExecInstLength());
            builder.append("\",\n");
        }

        if (hasContingencyType())
        {
            indent(builder, level);
            builder.append("\"ContingencyType\": \"");
            builder.append(contingencyType);
            builder.append("\",\n");
        }

        if (hasEncodedListExecInstLen())
        {
            indent(builder, level);
            builder.append("\"EncodedListExecInstLen\": \"");
            builder.append(encodedListExecInstLen);
            builder.append("\",\n");
        }

        if (hasEncodedListExecInst())
        {
            indent(builder, level);
            builder.append("\"EncodedListExecInst\": \"");
            appendData(builder, encodedListExecInst, encodedListExecInstLen);
            builder.append("\",\n");
        }

        if (hasAllowableOneSidednessPct())
        {
            indent(builder, level);
            builder.append("\"AllowableOneSidednessPct\": \"");
            allowableOneSidednessPct.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasAllowableOneSidednessValue())
        {
            indent(builder, level);
            builder.append("\"AllowableOneSidednessValue\": \"");
            allowableOneSidednessValue.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasAllowableOneSidednessCurr())
        {
            indent(builder, level);
            builder.append("\"AllowableOneSidednessCurr\": \"");
            builder.append(this.allowableOneSidednessCurr(), 0, allowableOneSidednessCurrLength());
            builder.append("\",\n");
        }

        indent(builder, level);
        builder.append("\"TotNoOrders\": \"");
        builder.append(totNoOrders);
        builder.append("\",\n");

        if (hasLastFragment())
        {
            indent(builder, level);
            builder.append("\"LastFragment\": \"");
            builder.append(lastFragment);
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
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public NewOrderListEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((NewOrderListEncoder)encoder);
    }

    public NewOrderListEncoder toEncoder(final NewOrderListEncoder encoder)
    {
        encoder.reset();
        encoder.listID(this.listID(), 0, listIDLength());
        if (hasBidID())
        {
            encoder.bidID(this.bidID(), 0, bidIDLength());
        }

        if (hasClientBidID())
        {
            encoder.clientBidID(this.clientBidID(), 0, clientBidIDLength());
        }

        if (hasProgRptReqs())
        {
            encoder.progRptReqs(this.progRptReqs());
        }

        encoder.bidType(this.bidType());
        if (hasProgPeriodInterval())
        {
            encoder.progPeriodInterval(this.progPeriodInterval());
        }

        if (hasCancellationRights())
        {
            encoder.cancellationRights(this.cancellationRights());
        }

        if (hasMoneyLaunderingStatus())
        {
            encoder.moneyLaunderingStatus(this.moneyLaunderingStatus());
        }

        if (hasRegistID())
        {
            encoder.registID(this.registID(), 0, registIDLength());
        }

        if (hasListExecInstType())
        {
            encoder.listExecInstType(this.listExecInstType());
        }

        if (hasListExecInst())
        {
            encoder.listExecInst(this.listExecInst(), 0, listExecInstLength());
        }

        if (hasContingencyType())
        {
            encoder.contingencyType(this.contingencyType());
        }

        if (hasEncodedListExecInstLen())
        {
            encoder.encodedListExecInstLen(this.encodedListExecInstLen());
        }

        if (hasEncodedListExecInst())
        {
            encoder.encodedListExecInstAsCopy(this.encodedListExecInst(), 0, encodedListExecInstLen());
            encoder.encodedListExecInstLen(this.encodedListExecInstLen());
        }

        if (hasAllowableOneSidednessPct())
        {
            encoder.allowableOneSidednessPct(this.allowableOneSidednessPct());
        }

        if (hasAllowableOneSidednessValue())
        {
            encoder.allowableOneSidednessValue(this.allowableOneSidednessValue());
        }

        if (hasAllowableOneSidednessCurr())
        {
            encoder.allowableOneSidednessCurr(this.allowableOneSidednessCurr(), 0, allowableOneSidednessCurrLength());
        }

        encoder.totNoOrders(this.totNoOrders());
        if (hasLastFragment())
        {
            encoder.lastFragment(this.lastFragment());
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



        final ListOrdGrpEncoder listOrdGrp = encoder.listOrdGrp();        if (hasNoOrdersGroupCounter)
        {
            final int size = this.noOrdersGroupCounter;
            OrdersGroupDecoder ordersGroup = this.ordersGroup;
            OrdersGroupEncoder ordersGroupEncoder = listOrdGrp.ordersGroup(size);
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

        return encoder;
    }

}
