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
import com.swiftalgo.ms.codecs.fix50sp2.builder.MarketDataIncrementalRefreshEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.ApplicationSequenceControlEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.MDIncGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.MDIncGrpEncoder.MDEntriesGroupEncoder;
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
import com.swiftalgo.ms.codecs.fix50sp2.builder.InstrmtLegGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.InstrmtLegGrpEncoder.LegsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.InstrumentLegEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.LegSecAltIDGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.LegSecAltIDGrpEncoder.LegSecurityAltIDGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.YieldDataEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.SpreadOrBenchmarkCurveDataEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.RateSourceEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.RateSourceEncoder.RateSourcesGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.SecSizesGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.SecSizesGrpEncoder.OfSecSizesGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.StatsIndGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.StatsIndGrpEncoder.StatsIndicatorsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.PartiesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.PartiesEncoder.PartyIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.PtysSubGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.PtysSubGrpEncoder.PartySubIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.RoutingGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.RoutingGrpEncoder.RoutingIDsGroupEncoder;


public class MarketDataIncrementalRefreshDecoder extends CommonDecoderImpl implements ApplicationSequenceControlDecoder, MDIncGrpDecoder, RoutingGrpDecoder, MessageDecoder
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(2);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            REQUIRED_FIELDS.add(Constants.NO_M_D_ENTRIES);
        }
    }

    public final IntHashSet GROUP_FIELDS = new IntHashSet(20);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            GROUP_FIELDS.add(Constants.APPL_ID);
            GROUP_FIELDS.add(Constants.APPL_SEQ_NUM);
            GROUP_FIELDS.add(Constants.APPL_LAST_SEQ_NUM);
            GROUP_FIELDS.add(Constants.APPL_RESEND_FLAG);
            GROUP_FIELDS.add(Constants.M_D_BOOK_TYPE);
            GROUP_FIELDS.add(Constants.M_D_FEED_TYPE);
            GROUP_FIELDS.add(Constants.TRADE_DATE);
            GROUP_FIELDS.add(Constants.M_D_REQ_ID);
            GROUP_FIELDS.add(Constants.APPL_QUEUE_DEPTH);
            GROUP_FIELDS.add(Constants.APPL_QUEUE_RESOLUTION);
        }
    }

    private final IntHashSet alreadyVisitedFields = new IntHashSet(20);

    private final IntHashSet unknownFields = new IntHashSet(10);

    private final IntHashSet missingRequiredFields = new IntHashSet(2);

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
        if (hasMDBookType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !MDBookType.isValid(mDBookType()))
        {
            invalidTagId = 1021;
            rejectReason = 5;
            return false;
        }
        }

        if (hasApplQueueResolution)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !ApplQueueResolution.isValid(applQueueResolution()))
        {
            invalidTagId = 814;
            rejectReason = 5;
            return false;
        }
        }
        {
            int count = 0;
            final MDEntriesGroupIterator iterator = mDEntriesGroupIterator.iterator();
            for (final MDEntriesGroupDecoder group : iterator)
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
                invalidTagId = 268;
                rejectReason = 16;
                return false;
            }
        }

        if (hasNoRoutingIDsGroupCounter)
        {
            {
                int count = 0;
                final RoutingIDsGroupIterator iterator = routingIDsGroupIterator.iterator();
                for (final RoutingIDsGroupDecoder group : iterator)
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
                    invalidTagId = 215;
                    rejectReason = 16;
                    return false;
                }
            }
        }
        return true;
    }

    public static final long MESSAGE_TYPE = 88L;

    public static final String MESSAGE_TYPE_AS_STRING = "X";

    public static final char[] MESSAGE_TYPE_CHARS = MESSAGE_TYPE_AS_STRING.toCharArray();

    public static final byte[] MESSAGE_TYPE_BYTES = MESSAGE_TYPE_AS_STRING.getBytes(US_ASCII);

    public final IntHashSet messageFields = new IntHashSet(800);

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
        messageFields.add(Constants.APPL_ID);
        messageFields.add(Constants.APPL_SEQ_NUM);
        messageFields.add(Constants.APPL_LAST_SEQ_NUM);
        messageFields.add(Constants.APPL_RESEND_FLAG);
        messageFields.add(Constants.M_D_BOOK_TYPE);
        messageFields.add(Constants.M_D_FEED_TYPE);
        messageFields.add(Constants.TRADE_DATE);
        messageFields.add(Constants.M_D_REQ_ID);
        messageFields.add(Constants.NO_M_D_ENTRIES);
        messageFields.add(Constants.M_D_UPDATE_ACTION);
        messageFields.add(Constants.DELETE_REASON);
        messageFields.add(Constants.M_D_SUB_BOOK_TYPE);
        messageFields.add(Constants.MARKET_DEPTH);
        messageFields.add(Constants.M_D_ENTRY_TYPE);
        messageFields.add(Constants.M_D_ENTRY_ID);
        messageFields.add(Constants.M_D_ENTRY_REF_ID);
        messageFields.add(Constants.M_D_STREAM_ID);
        messageFields.add(Constants.SYMBOL);
        messageFields.add(Constants.SYMBOL_SFX);
        messageFields.add(Constants.SECURITY_ID);
        messageFields.add(Constants.SECURITY_ID_SOURCE);
        messageFields.add(Constants.NO_SECURITY_ALT_ID);
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
        messageFields.add(Constants.NO_EVENTS);
        messageFields.add(Constants.EVENT_TYPE);
        messageFields.add(Constants.EVENT_DATE);
        messageFields.add(Constants.EVENT_TIME);
        messageFields.add(Constants.EVENT_PX);
        messageFields.add(Constants.EVENT_TEXT);
        messageFields.add(Constants.DATED_DATE);
        messageFields.add(Constants.INTEREST_ACCRUAL_DATE);
        messageFields.add(Constants.NO_INSTRUMENT_PARTIES);
        messageFields.add(Constants.INSTRUMENT_PARTY_ID);
        messageFields.add(Constants.INSTRUMENT_PARTY_ID_SOURCE);
        messageFields.add(Constants.INSTRUMENT_PARTY_ROLE);
        messageFields.add(Constants.NO_INSTRUMENT_PARTY_SUB_IDS);
        messageFields.add(Constants.INSTRUMENT_PARTY_SUB_ID);
        messageFields.add(Constants.INSTRUMENT_PARTY_SUB_ID_TYPE);
        messageFields.add(Constants.NO_COMPLEX_EVENTS);
        messageFields.add(Constants.COMPLEX_EVENT_TYPE);
        messageFields.add(Constants.COMPLEX_OPT_PAYOUT_AMOUNT);
        messageFields.add(Constants.COMPLEX_EVENT_PRICE);
        messageFields.add(Constants.COMPLEX_EVENT_PRICE_BOUNDARY_METHOD);
        messageFields.add(Constants.COMPLEX_EVENT_PRICE_BOUNDARY_PRECISION);
        messageFields.add(Constants.COMPLEX_EVENT_PRICE_TIME_TYPE);
        messageFields.add(Constants.COMPLEX_EVENT_CONDITION);
        messageFields.add(Constants.NO_COMPLEX_EVENT_DATES);
        messageFields.add(Constants.COMPLEX_EVENT_START_DATE);
        messageFields.add(Constants.COMPLEX_EVENT_END_DATE);
        messageFields.add(Constants.NO_COMPLEX_EVENT_TIMES);
        messageFields.add(Constants.COMPLEX_EVENT_START_TIME);
        messageFields.add(Constants.COMPLEX_EVENT_END_TIME);
        messageFields.add(Constants.NO_UNDERLYINGS);
        messageFields.add(Constants.UNDERLYING_SYMBOL);
        messageFields.add(Constants.UNDERLYING_SYMBOL_SFX);
        messageFields.add(Constants.UNDERLYING_SECURITY_ID);
        messageFields.add(Constants.UNDERLYING_SECURITY_ID_SOURCE);
        messageFields.add(Constants.NO_UNDERLYING_SECURITY_ALT_ID);
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
        messageFields.add(Constants.NO_UNDERLYING_STIPS);
        messageFields.add(Constants.UNDERLYING_STIP_TYPE);
        messageFields.add(Constants.UNDERLYING_STIP_VALUE);
        messageFields.add(Constants.UNDERLYING_ADJUSTED_QUANTITY);
        messageFields.add(Constants.UNDERLYING_F_X_RATE);
        messageFields.add(Constants.UNDERLYING_F_X_RATE_CALC);
        messageFields.add(Constants.UNDERLYING_CAP_VALUE);
        messageFields.add(Constants.NO_UNDLY_INSTRUMENT_PARTIES);
        messageFields.add(Constants.UNDERLYING_INSTRUMENT_PARTY_ID);
        messageFields.add(Constants.UNDERLYING_INSTRUMENT_PARTY_ID_SOURCE);
        messageFields.add(Constants.UNDERLYING_INSTRUMENT_PARTY_ROLE);
        messageFields.add(Constants.NO_UNDLY_INSTRUMENT_PARTY_SUB_IDS);
        messageFields.add(Constants.UNDERLYING_INSTRUMENT_PARTY_SUB_ID);
        messageFields.add(Constants.UNDERLYING_INSTRUMENT_PARTY_SUB_ID_TYPE);
        messageFields.add(Constants.UNDERLYING_SETTL_METHOD);
        messageFields.add(Constants.UNDERLYING_PUT_OR_CALL);
        messageFields.add(Constants.NO_LEGS);
        messageFields.add(Constants.LEG_SYMBOL);
        messageFields.add(Constants.LEG_SYMBOL_SFX);
        messageFields.add(Constants.LEG_SECURITY_ID);
        messageFields.add(Constants.LEG_SECURITY_ID_SOURCE);
        messageFields.add(Constants.NO_LEG_SECURITY_ALT_ID);
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
        messageFields.add(Constants.FINANCIAL_STATUS);
        messageFields.add(Constants.CORPORATE_ACTION);
        messageFields.add(Constants.M_D_ENTRY_PX);
        messageFields.add(Constants.PRICE_TYPE);
        messageFields.add(Constants.YIELD_TYPE);
        messageFields.add(Constants.YIELD);
        messageFields.add(Constants.YIELD_CALC_DATE);
        messageFields.add(Constants.YIELD_REDEMPTION_DATE);
        messageFields.add(Constants.YIELD_REDEMPTION_PRICE);
        messageFields.add(Constants.YIELD_REDEMPTION_PRICE_TYPE);
        messageFields.add(Constants.SPREAD);
        messageFields.add(Constants.BENCHMARK_CURVE_CURRENCY);
        messageFields.add(Constants.BENCHMARK_CURVE_NAME);
        messageFields.add(Constants.BENCHMARK_CURVE_POINT);
        messageFields.add(Constants.BENCHMARK_PRICE);
        messageFields.add(Constants.BENCHMARK_PRICE_TYPE);
        messageFields.add(Constants.BENCHMARK_SECURITY_ID);
        messageFields.add(Constants.BENCHMARK_SECURITY_ID_SOURCE);
        messageFields.add(Constants.ORD_TYPE);
        messageFields.add(Constants.CURRENCY);
        messageFields.add(Constants.SETTL_CURRENCY);
        messageFields.add(Constants.NO_RATE_SOURCES);
        messageFields.add(Constants.RATE_SOURCE);
        messageFields.add(Constants.RATE_SOURCE_TYPE);
        messageFields.add(Constants.REFERENCE_PAGE);
        messageFields.add(Constants.M_D_ENTRY_SIZE);
        messageFields.add(Constants.NO_OF_SEC_SIZES);
        messageFields.add(Constants.M_D_SEC_SIZE_TYPE);
        messageFields.add(Constants.M_D_SEC_SIZE);
        messageFields.add(Constants.LOT_TYPE);
        messageFields.add(Constants.M_D_ENTRY_DATE);
        messageFields.add(Constants.M_D_ENTRY_TIME);
        messageFields.add(Constants.TICK_DIRECTION);
        messageFields.add(Constants.M_D_MKT);
        messageFields.add(Constants.TRADING_SESSION_ID);
        messageFields.add(Constants.TRADING_SESSION_SUB_ID);
        messageFields.add(Constants.SECURITY_TRADING_STATUS);
        messageFields.add(Constants.HALT_REASON);
        messageFields.add(Constants.QUOTE_CONDITION);
        messageFields.add(Constants.TRADE_CONDITION);
        messageFields.add(Constants.TRD_TYPE);
        messageFields.add(Constants.MATCH_TYPE);
        messageFields.add(Constants.M_D_ENTRY_ORIGINATOR);
        messageFields.add(Constants.LOCATION_ID);
        messageFields.add(Constants.DESK_ID);
        messageFields.add(Constants.OPEN_CLOSE_SETTL_FLAG);
        messageFields.add(Constants.TIME_IN_FORCE);
        messageFields.add(Constants.EXPIRE_DATE);
        messageFields.add(Constants.EXPIRE_TIME);
        messageFields.add(Constants.MIN_QTY);
        messageFields.add(Constants.EXEC_INST);
        messageFields.add(Constants.SELLER_DAYS);
        messageFields.add(Constants.ORDER_ID);
        messageFields.add(Constants.SECONDARY_ORDER_ID);
        messageFields.add(Constants.QUOTE_ENTRY_ID);
        messageFields.add(Constants.TRADE_ID);
        messageFields.add(Constants.M_D_ENTRY_BUYER);
        messageFields.add(Constants.M_D_ENTRY_SELLER);
        messageFields.add(Constants.NUMBER_OF_ORDERS);
        messageFields.add(Constants.M_D_ENTRY_POSITION_NO);
        messageFields.add(Constants.SCOPE);
        messageFields.add(Constants.PRICE_DELTA);
        messageFields.add(Constants.NET_CHG_PREV_DAY);
        messageFields.add(Constants.TEXT);
        messageFields.add(Constants.ENCODED_TEXT_LEN);
        messageFields.add(Constants.ENCODED_TEXT);
        messageFields.add(Constants.M_D_PRICE_LEVEL);
        messageFields.add(Constants.ORDER_CAPACITY);
        messageFields.add(Constants.M_D_ORIGIN_TYPE);
        messageFields.add(Constants.HIGH_PX);
        messageFields.add(Constants.LOW_PX);
        messageFields.add(Constants.FIRST_PX);
        messageFields.add(Constants.LAST_PX);
        messageFields.add(Constants.TRADE_VOLUME);
        messageFields.add(Constants.SETTL_TYPE);
        messageFields.add(Constants.SETTL_DATE);
        messageFields.add(Constants.TRANS_BKD_TIME);
        messageFields.add(Constants.TRANSACT_TIME);
        messageFields.add(Constants.M_D_QUOTE_TYPE);
        messageFields.add(Constants.RPT_SEQ);
        messageFields.add(Constants.DEALING_CAPACITY);
        messageFields.add(Constants.M_D_ENTRY_SPOT_RATE);
        messageFields.add(Constants.M_D_ENTRY_FORWARD_POINTS);
        messageFields.add(Constants.NO_STATS_INDICATORS);
        messageFields.add(Constants.STATS_TYPE);
        messageFields.add(Constants.NO_PARTY_IDS);
        messageFields.add(Constants.PARTY_ID);
        messageFields.add(Constants.PARTY_ID_SOURCE);
        messageFields.add(Constants.PARTY_ROLE);
        messageFields.add(Constants.NO_PARTY_SUB_IDS);
        messageFields.add(Constants.PARTY_SUB_ID);
        messageFields.add(Constants.PARTY_SUB_ID_TYPE);
        messageFields.add(Constants.APPL_QUEUE_DEPTH);
        messageFields.add(Constants.APPL_QUEUE_RESOLUTION);
        messageFields.add(Constants.NO_ROUTING_IDS);
        messageFields.add(Constants.ROUTING_TYPE);
        messageFields.add(Constants.ROUTING_ID);
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


    private char[] applID = new char[1];

    private boolean hasApplID;

    public char[] applID()
    {
        if (!hasApplID)
        {
            throw new IllegalArgumentException("No value for optional field: ApplID");
        }

        return applID;
    }

    public boolean hasApplID()
    {
        return hasApplID;
    }


    private int applIDOffset;

    private int applIDLength;

    public int applIDLength()
    {
        if (!hasApplID)
        {
            throw new IllegalArgumentException("No value for optional field: ApplID");
        }

        return applIDLength;
    }

    public String applIDAsString()
    {
        return hasApplID ? new String(applID, 0, applIDLength) : null;
    }

    public void applID(final AsciiSequenceView view)
    {
        if (!hasApplID)
        {
            throw new IllegalArgumentException("No value for optional field: ApplID");
        }

        view.wrap(buffer, applIDOffset, applIDLength);
    }


    private int applSeqNum = MISSING_INT;

    private boolean hasApplSeqNum;

    public int applSeqNum()
    {
        if (!hasApplSeqNum)
        {
            throw new IllegalArgumentException("No value for optional field: ApplSeqNum");
        }

        return applSeqNum;
    }

    public boolean hasApplSeqNum()
    {
        return hasApplSeqNum;
    }



    private int applLastSeqNum = MISSING_INT;

    private boolean hasApplLastSeqNum;

    public int applLastSeqNum()
    {
        if (!hasApplLastSeqNum)
        {
            throw new IllegalArgumentException("No value for optional field: ApplLastSeqNum");
        }

        return applLastSeqNum;
    }

    public boolean hasApplLastSeqNum()
    {
        return hasApplLastSeqNum;
    }



    private boolean applResendFlag;

    private boolean hasApplResendFlag;

    public boolean applResendFlag()
    {
        if (!hasApplResendFlag)
        {
            throw new IllegalArgumentException("No value for optional field: ApplResendFlag");
        }

        return applResendFlag;
    }

    public boolean hasApplResendFlag()
    {
        return hasApplResendFlag;
    }




    private int mDBookType = MISSING_INT;

    private boolean hasMDBookType;

    public int mDBookType()
    {
        if (!hasMDBookType)
        {
            throw new IllegalArgumentException("No value for optional field: MDBookType");
        }

        return mDBookType;
    }

    public boolean hasMDBookType()
    {
        return hasMDBookType;
    }



    private final CharArrayWrapper mDBookTypeWrapper = new CharArrayWrapper();
    public MDBookType mDBookTypeAsEnum()
    {
        if (!hasMDBookType)
 return MDBookType.NULL_VAL;
        return MDBookType.decode(mDBookType);
    }

    private char[] mDFeedType = new char[1];

    private boolean hasMDFeedType;

    public char[] mDFeedType()
    {
        if (!hasMDFeedType)
        {
            throw new IllegalArgumentException("No value for optional field: MDFeedType");
        }

        return mDFeedType;
    }

    public boolean hasMDFeedType()
    {
        return hasMDFeedType;
    }


    private int mDFeedTypeOffset;

    private int mDFeedTypeLength;

    public int mDFeedTypeLength()
    {
        if (!hasMDFeedType)
        {
            throw new IllegalArgumentException("No value for optional field: MDFeedType");
        }

        return mDFeedTypeLength;
    }

    public String mDFeedTypeAsString()
    {
        return hasMDFeedType ? new String(mDFeedType, 0, mDFeedTypeLength) : null;
    }

    public void mDFeedType(final AsciiSequenceView view)
    {
        if (!hasMDFeedType)
        {
            throw new IllegalArgumentException("No value for optional field: MDFeedType");
        }

        view.wrap(buffer, mDFeedTypeOffset, mDFeedTypeLength);
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


    private char[] mDReqID = new char[1];

    private boolean hasMDReqID;

    public char[] mDReqID()
    {
        if (!hasMDReqID)
        {
            throw new IllegalArgumentException("No value for optional field: MDReqID");
        }

        return mDReqID;
    }

    public boolean hasMDReqID()
    {
        return hasMDReqID;
    }


    private int mDReqIDOffset;

    private int mDReqIDLength;

    public int mDReqIDLength()
    {
        if (!hasMDReqID)
        {
            throw new IllegalArgumentException("No value for optional field: MDReqID");
        }

        return mDReqIDLength;
    }

    public String mDReqIDAsString()
    {
        return hasMDReqID ? new String(mDReqID, 0, mDReqIDLength) : null;
    }

    public void mDReqID(final AsciiSequenceView view)
    {
        if (!hasMDReqID)
        {
            throw new IllegalArgumentException("No value for optional field: MDReqID");
        }

        view.wrap(buffer, mDReqIDOffset, mDReqIDLength);
    }




    private MDEntriesGroupDecoder mDEntriesGroup = null;
    public MDEntriesGroupDecoder mDEntriesGroup()
    {
        return mDEntriesGroup;
    }

    private int noMDEntriesGroupCounter = MISSING_INT;

    private boolean hasNoMDEntriesGroupCounter;

    public int noMDEntriesGroupCounter()
    {
        if (!hasNoMDEntriesGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoMDEntriesGroupCounter");
        }

        return noMDEntriesGroupCounter;
    }

    public boolean hasNoMDEntriesGroupCounter()
    {
        return hasNoMDEntriesGroupCounter;
    }




    private MDEntriesGroupIterator mDEntriesGroupIterator = new MDEntriesGroupIterator(this);
    public MDEntriesGroupIterator mDEntriesGroupIterator()
    {
        return mDEntriesGroupIterator.iterator();
    }


    private int applQueueDepth = MISSING_INT;

    private boolean hasApplQueueDepth;

    public int applQueueDepth()
    {
        if (!hasApplQueueDepth)
        {
            throw new IllegalArgumentException("No value for optional field: ApplQueueDepth");
        }

        return applQueueDepth;
    }

    public boolean hasApplQueueDepth()
    {
        return hasApplQueueDepth;
    }



    private int applQueueResolution = MISSING_INT;

    private boolean hasApplQueueResolution;

    public int applQueueResolution()
    {
        if (!hasApplQueueResolution)
        {
            throw new IllegalArgumentException("No value for optional field: ApplQueueResolution");
        }

        return applQueueResolution;
    }

    public boolean hasApplQueueResolution()
    {
        return hasApplQueueResolution;
    }



    private final CharArrayWrapper applQueueResolutionWrapper = new CharArrayWrapper();
    public ApplQueueResolution applQueueResolutionAsEnum()
    {
        if (!hasApplQueueResolution)
 return ApplQueueResolution.NULL_VAL;
        return ApplQueueResolution.decode(applQueueResolution);
    }



    private RoutingIDsGroupDecoder routingIDsGroup = null;
    public RoutingIDsGroupDecoder routingIDsGroup()
    {
        return routingIDsGroup;
    }

    private int noRoutingIDsGroupCounter = MISSING_INT;

    private boolean hasNoRoutingIDsGroupCounter;

    public int noRoutingIDsGroupCounter()
    {
        if (!hasNoRoutingIDsGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoRoutingIDsGroupCounter");
        }

        return noRoutingIDsGroupCounter;
    }

    public boolean hasNoRoutingIDsGroupCounter()
    {
        return hasNoRoutingIDsGroupCounter;
    }




    private RoutingIDsGroupIterator routingIDsGroupIterator = new RoutingIDsGroupIterator(this);
    public RoutingIDsGroupIterator routingIDsGroupIterator()
    {
        return routingIDsGroupIterator.iterator();
    }


    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode MarketDataIncrementalRefresh
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
            case Constants.APPL_ID:
                hasApplID = true;
                applID = buffer.getChars(applID, valueOffset, valueLength);
                applIDOffset = valueOffset;
                applIDLength = valueLength;
                break;

            case Constants.APPL_SEQ_NUM:
                hasApplSeqNum = true;
                applSeqNum = getInt(buffer, valueOffset, endOfField, 1181, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.APPL_LAST_SEQ_NUM:
                hasApplLastSeqNum = true;
                applLastSeqNum = getInt(buffer, valueOffset, endOfField, 1350, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.APPL_RESEND_FLAG:
                hasApplResendFlag = true;
                applResendFlag = buffer.getBoolean(valueOffset);
                break;


            case Constants.M_D_BOOK_TYPE:
                hasMDBookType = true;
                mDBookType = getInt(buffer, valueOffset, endOfField, 1021, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.M_D_FEED_TYPE:
                hasMDFeedType = true;
                mDFeedType = buffer.getChars(mDFeedType, valueOffset, valueLength);
                mDFeedTypeOffset = valueOffset;
                mDFeedTypeLength = valueLength;
                break;

            case Constants.TRADE_DATE:
                hasTradeDate = true;
                tradeDate = buffer.getBytes(tradeDate, valueOffset, valueLength);
                tradeDateOffset = valueOffset;
                tradeDateLength = valueLength;
                break;

            case Constants.M_D_REQ_ID:
                hasMDReqID = true;
                mDReqID = buffer.getChars(mDReqID, valueOffset, valueLength);
                mDReqIDOffset = valueOffset;
                mDReqIDLength = valueLength;
                break;

            case Constants.NO_M_D_ENTRIES:
                hasNoMDEntriesGroupCounter = true;
                noMDEntriesGroupCounter = getInt(buffer, valueOffset, endOfField, 268, CODEC_VALIDATION_ENABLED);
                if (mDEntriesGroup == null)
                {
                    mDEntriesGroup = new MDEntriesGroupDecoder(trailer, messageFields);
                }
                MDEntriesGroupDecoder mDEntriesGroupCurrent = mDEntriesGroup;
                position = endOfField + 1;
                final int noMDEntriesGroupCounter = this.noMDEntriesGroupCounter;
                for (int i = 0; i < noMDEntriesGroupCounter && position < end; i++)
                {
                    if (mDEntriesGroupCurrent != null)
                    {
                        position += mDEntriesGroupCurrent.decode(buffer, position, end - position);
                        mDEntriesGroupCurrent = mDEntriesGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (mDEntriesGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;


            case Constants.APPL_QUEUE_DEPTH:
                hasApplQueueDepth = true;
                applQueueDepth = getInt(buffer, valueOffset, endOfField, 813, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.APPL_QUEUE_RESOLUTION:
                hasApplQueueResolution = true;
                applQueueResolution = getInt(buffer, valueOffset, endOfField, 814, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.NO_ROUTING_IDS:
                hasNoRoutingIDsGroupCounter = true;
                noRoutingIDsGroupCounter = getInt(buffer, valueOffset, endOfField, 215, CODEC_VALIDATION_ENABLED);
                if (routingIDsGroup == null)
                {
                    routingIDsGroup = new RoutingIDsGroupDecoder(trailer, messageFields);
                }
                RoutingIDsGroupDecoder routingIDsGroupCurrent = routingIDsGroup;
                position = endOfField + 1;
                final int noRoutingIDsGroupCounter = this.noRoutingIDsGroupCounter;
                for (int i = 0; i < noRoutingIDsGroupCounter && position < end; i++)
                {
                    if (routingIDsGroupCurrent != null)
                    {
                        position += routingIDsGroupCurrent.decode(buffer, position, end - position);
                        routingIDsGroupCurrent = routingIDsGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (routingIDsGroup.ALL_GROUP_FIELDS.contains(checkTag))
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
        this.resetMDBookType();
        this.resetMDFeedType();
        this.resetTradeDate();
        this.resetMDReqID();
        this.resetApplQueueDepth();
        this.resetApplQueueResolution();
        this.resetApplID();
        this.resetApplSeqNum();
        this.resetApplLastSeqNum();
        this.resetApplResendFlag();
        this.resetMDEntriesGroup();
        this.resetRoutingIDsGroup();
    }

    public void resetMDBookType()
    {
        hasMDBookType = false;
    }

    public void resetMDFeedType()
    {
        hasMDFeedType = false;
    }

    public void resetTradeDate()
    {
        hasTradeDate = false;
    }

    public void resetMDReqID()
    {
        hasMDReqID = false;
    }

    public void resetApplQueueDepth()
    {
        hasApplQueueDepth = false;
    }

    public void resetApplQueueResolution()
    {
        hasApplQueueResolution = false;
    }

    public void resetApplID()
    {
        hasApplID = false;
    }

    public void resetApplSeqNum()
    {
        hasApplSeqNum = false;
    }

    public void resetApplLastSeqNum()
    {
        hasApplLastSeqNum = false;
    }

    public void resetApplResendFlag()
    {
        hasApplResendFlag = false;
    }

    public void resetMDEntriesGroup()
    {
        for (final MDEntriesGroupDecoder mDEntriesGroupDecoder : mDEntriesGroupIterator.iterator())
        {
            mDEntriesGroupDecoder.reset();
            if (mDEntriesGroupDecoder.next() == null)
            {
                break;
            }
        }
        noMDEntriesGroupCounter = MISSING_INT;
        hasNoMDEntriesGroupCounter = false;
    }

    public void resetRoutingIDsGroup()
    {
        for (final RoutingIDsGroupDecoder routingIDsGroupDecoder : routingIDsGroupIterator.iterator())
        {
            routingIDsGroupDecoder.reset();
            if (routingIDsGroupDecoder.next() == null)
            {
                break;
            }
        }
        noRoutingIDsGroupCounter = MISSING_INT;
        hasNoRoutingIDsGroupCounter = false;
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
        builder.append("\"MessageName\": \"MarketDataIncrementalRefresh\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasApplID())
        {
            indent(builder, level);
            builder.append("\"ApplID\": \"");
            builder.append(this.applID(), 0, applIDLength());
            builder.append("\",\n");
        }

        if (hasApplSeqNum())
        {
            indent(builder, level);
            builder.append("\"ApplSeqNum\": \"");
            builder.append(applSeqNum);
            builder.append("\",\n");
        }

        if (hasApplLastSeqNum())
        {
            indent(builder, level);
            builder.append("\"ApplLastSeqNum\": \"");
            builder.append(applLastSeqNum);
            builder.append("\",\n");
        }

        if (hasApplResendFlag())
        {
            indent(builder, level);
            builder.append("\"ApplResendFlag\": \"");
            builder.append(applResendFlag);
            builder.append("\",\n");
        }

        if (hasMDBookType())
        {
            indent(builder, level);
            builder.append("\"MDBookType\": \"");
            builder.append(mDBookType);
            builder.append("\",\n");
        }

        if (hasMDFeedType())
        {
            indent(builder, level);
            builder.append("\"MDFeedType\": \"");
            builder.append(this.mDFeedType(), 0, mDFeedTypeLength());
            builder.append("\",\n");
        }

        if (hasTradeDate())
        {
            indent(builder, level);
            builder.append("\"TradeDate\": \"");
            appendData(builder, tradeDate, tradeDateLength);
            builder.append("\",\n");
        }

        if (hasMDReqID())
        {
            indent(builder, level);
            builder.append("\"MDReqID\": \"");
            builder.append(this.mDReqID(), 0, mDReqIDLength());
            builder.append("\",\n");
        }

    if (hasNoMDEntriesGroupCounter)
    {
        indent(builder, level);
        builder.append("\"MDEntriesGroup\": [\n");
        MDEntriesGroupDecoder mDEntriesGroup = this.mDEntriesGroup;
        for (int i = 0, size = this.noMDEntriesGroupCounter; i < size; i++)
        {
            indent(builder, level);
            mDEntriesGroup.appendTo(builder, level + 1);            if (mDEntriesGroup.next() != null)
            {
                builder.append(',');
            }
            builder.append('\n');
            mDEntriesGroup = mDEntriesGroup.next();        }
        indent(builder, level);
        builder.append("],\n");
    }

        if (hasApplQueueDepth())
        {
            indent(builder, level);
            builder.append("\"ApplQueueDepth\": \"");
            builder.append(applQueueDepth);
            builder.append("\",\n");
        }

        if (hasApplQueueResolution())
        {
            indent(builder, level);
            builder.append("\"ApplQueueResolution\": \"");
            builder.append(applQueueResolution);
            builder.append("\",\n");
        }

    if (hasNoRoutingIDsGroupCounter)
    {
        indent(builder, level);
        builder.append("\"RoutingIDsGroup\": [\n");
        RoutingIDsGroupDecoder routingIDsGroup = this.routingIDsGroup;
        for (int i = 0, size = this.noRoutingIDsGroupCounter; i < size; i++)
        {
            indent(builder, level);
            routingIDsGroup.appendTo(builder, level + 1);            if (routingIDsGroup.next() != null)
            {
                builder.append(',');
            }
            builder.append('\n');
            routingIDsGroup = routingIDsGroup.next();        }
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
    public MarketDataIncrementalRefreshEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((MarketDataIncrementalRefreshEncoder)encoder);
    }

    public MarketDataIncrementalRefreshEncoder toEncoder(final MarketDataIncrementalRefreshEncoder encoder)
    {
        encoder.reset();

        final ApplicationSequenceControlEncoder applicationSequenceControl = encoder.applicationSequenceControl();        if (hasApplID())
        {
            applicationSequenceControl.applID(this.applID(), 0, applIDLength());
        }

        if (hasApplSeqNum())
        {
            applicationSequenceControl.applSeqNum(this.applSeqNum());
        }

        if (hasApplLastSeqNum())
        {
            applicationSequenceControl.applLastSeqNum(this.applLastSeqNum());
        }

        if (hasApplResendFlag())
        {
            applicationSequenceControl.applResendFlag(this.applResendFlag());
        }


        if (hasMDBookType())
        {
            encoder.mDBookType(this.mDBookType());
        }

        if (hasMDFeedType())
        {
            encoder.mDFeedType(this.mDFeedType(), 0, mDFeedTypeLength());
        }

        if (hasTradeDate())
        {
            encoder.tradeDateAsCopy(this.tradeDate(), 0, tradeDateLength());
        }

        if (hasMDReqID())
        {
            encoder.mDReqID(this.mDReqID(), 0, mDReqIDLength());
        }


        final MDIncGrpEncoder mDIncGrp = encoder.mDIncGrp();        if (hasNoMDEntriesGroupCounter)
        {
            final int size = this.noMDEntriesGroupCounter;
            MDEntriesGroupDecoder mDEntriesGroup = this.mDEntriesGroup;
            MDEntriesGroupEncoder mDEntriesGroupEncoder = mDIncGrp.mDEntriesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (mDEntriesGroup != null)
                {
                    mDEntriesGroup.toEncoder(mDEntriesGroupEncoder);
                    mDEntriesGroup = mDEntriesGroup.next();
                    mDEntriesGroupEncoder = mDEntriesGroupEncoder.next();
                }
            }
        }


        if (hasApplQueueDepth())
        {
            encoder.applQueueDepth(this.applQueueDepth());
        }

        if (hasApplQueueResolution())
        {
            encoder.applQueueResolution(this.applQueueResolution());
        }


        final RoutingGrpEncoder routingGrp = encoder.routingGrp();        if (hasNoRoutingIDsGroupCounter)
        {
            final int size = this.noRoutingIDsGroupCounter;
            RoutingIDsGroupDecoder routingIDsGroup = this.routingIDsGroup;
            RoutingIDsGroupEncoder routingIDsGroupEncoder = routingGrp.routingIDsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (routingIDsGroup != null)
                {
                    routingIDsGroup.toEncoder(routingIDsGroupEncoder);
                    routingIDsGroup = routingIDsGroup.next();
                    routingIDsGroupEncoder = routingIDsGroupEncoder.next();
                }
            }
        }

        return encoder;
    }

}
