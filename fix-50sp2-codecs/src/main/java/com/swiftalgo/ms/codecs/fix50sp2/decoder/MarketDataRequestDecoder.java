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
import com.swiftalgo.ms.codecs.fix50sp2.builder.MarketDataRequestEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.PartiesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.PartiesEncoder.PartyIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.PtysSubGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.PtysSubGrpEncoder.PartySubIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.MDReqGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.MDReqGrpEncoder.MDEntryTypesGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.InstrmtMDReqGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.InstrmtMDReqGrpEncoder.RelatedSymGroupEncoder;
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
import com.swiftalgo.ms.codecs.fix50sp2.builder.TrdgSesGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.TrdgSesGrpEncoder.TradingSessionsGroupEncoder;


public class MarketDataRequestDecoder extends CommonDecoderImpl implements PartiesDecoder, MDReqGrpDecoder, InstrmtMDReqGrpDecoder, TrdgSesGrpDecoder, MessageDecoder
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(10);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            REQUIRED_FIELDS.add(Constants.M_D_REQ_ID);
            REQUIRED_FIELDS.add(Constants.SUBSCRIPTION_REQUEST_TYPE);
            REQUIRED_FIELDS.add(Constants.MARKET_DEPTH);
            REQUIRED_FIELDS.add(Constants.NO_M_D_ENTRY_TYPES);
            REQUIRED_FIELDS.add(Constants.NO_RELATED_SYM);
        }
    }

    public final IntHashSet GROUP_FIELDS = new IntHashSet(22);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            GROUP_FIELDS.add(Constants.M_D_REQ_ID);
            GROUP_FIELDS.add(Constants.SUBSCRIPTION_REQUEST_TYPE);
            GROUP_FIELDS.add(Constants.MARKET_DEPTH);
            GROUP_FIELDS.add(Constants.M_D_UPDATE_TYPE);
            GROUP_FIELDS.add(Constants.AGGREGATED_BOOK);
            GROUP_FIELDS.add(Constants.OPEN_CLOSE_SETTL_FLAG);
            GROUP_FIELDS.add(Constants.SCOPE);
            GROUP_FIELDS.add(Constants.M_D_IMPLICIT_DELETE);
            GROUP_FIELDS.add(Constants.APPL_QUEUE_ACTION);
            GROUP_FIELDS.add(Constants.APPL_QUEUE_MAX);
            GROUP_FIELDS.add(Constants.M_D_QUOTE_TYPE);
        }
    }

    private final IntHashSet alreadyVisitedFields = new IntHashSet(22);

    private final IntHashSet unknownFields = new IntHashSet(10);

    private final IntHashSet missingRequiredFields = new IntHashSet(10);

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
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !SubscriptionRequestType.isValid(subscriptionRequestType()))
        {
            invalidTagId = 263;
            rejectReason = 5;
            return false;
        }

        if (hasMDUpdateType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !MDUpdateType.isValid(mDUpdateType()))
        {
            invalidTagId = 265;
            rejectReason = 5;
            return false;
        }
        }


        if (hasOpenCloseSettlFlag)
        {
          int openCloseSettlFlagOffset = 0;
          for (int i = 0; i < openCloseSettlFlagLength; i++)
          {
              if (this.openCloseSettlFlag()[i] == ' ')
              {
                  openCloseSettlFlagWrapper.wrap(this.openCloseSettlFlag(), openCloseSettlFlagOffset, i - openCloseSettlFlagOffset);
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !OpenCloseSettlFlag.isValid(openCloseSettlFlagWrapper))
        {
            invalidTagId = 286;
            rejectReason = 5;
            return false;
        }
                  openCloseSettlFlagOffset = i + 1;
              }
          }
          openCloseSettlFlagWrapper.wrap(this.openCloseSettlFlag(), openCloseSettlFlagOffset, openCloseSettlFlagLength - openCloseSettlFlagOffset);
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !OpenCloseSettlFlag.isValid(openCloseSettlFlagWrapper))
        {
            invalidTagId = 286;
            rejectReason = 5;
            return false;
        }
        }

        if (hasScope)
        {
          int scopeOffset = 0;
          for (int i = 0; i < scopeLength; i++)
          {
              if (this.scope()[i] == ' ')
              {
                  scopeWrapper.wrap(this.scope(), scopeOffset, i - scopeOffset);
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !Scope.isValid(scopeWrapper))
        {
            invalidTagId = 546;
            rejectReason = 5;
            return false;
        }
                  scopeOffset = i + 1;
              }
          }
          scopeWrapper.wrap(this.scope(), scopeOffset, scopeLength - scopeOffset);
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !Scope.isValid(scopeWrapper))
        {
            invalidTagId = 546;
            rejectReason = 5;
            return false;
        }
        }


        if (hasApplQueueAction)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !ApplQueueAction.isValid(applQueueAction()))
        {
            invalidTagId = 815;
            rejectReason = 5;
            return false;
        }
        }

        if (hasMDQuoteType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !MDQuoteType.isValid(mDQuoteType()))
        {
            invalidTagId = 1070;
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

        {
            int count = 0;
            final MDEntryTypesGroupIterator iterator = mDEntryTypesGroupIterator.iterator();
            for (final MDEntryTypesGroupDecoder group : iterator)
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
                invalidTagId = 267;
                rejectReason = 16;
                return false;
            }
        }

        {
            int count = 0;
            final RelatedSymGroupIterator iterator = relatedSymGroupIterator.iterator();
            for (final RelatedSymGroupDecoder group : iterator)
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
                invalidTagId = 146;
                rejectReason = 16;
                return false;
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
        return true;
    }

    public static final long MESSAGE_TYPE = 86L;

    public static final String MESSAGE_TYPE_AS_STRING = "V";

    public static final char[] MESSAGE_TYPE_CHARS = MESSAGE_TYPE_AS_STRING.toCharArray();

    public static final byte[] MESSAGE_TYPE_BYTES = MESSAGE_TYPE_AS_STRING.getBytes(US_ASCII);

    public final IntHashSet messageFields = new IntHashSet(632);

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
        messageFields.add(Constants.M_D_REQ_ID);
        messageFields.add(Constants.SUBSCRIPTION_REQUEST_TYPE);
        messageFields.add(Constants.NO_PARTY_IDS);
        messageFields.add(Constants.PARTY_ID);
        messageFields.add(Constants.PARTY_ID_SOURCE);
        messageFields.add(Constants.PARTY_ROLE);
        messageFields.add(Constants.NO_PARTY_SUB_IDS);
        messageFields.add(Constants.PARTY_SUB_ID);
        messageFields.add(Constants.PARTY_SUB_ID_TYPE);
        messageFields.add(Constants.MARKET_DEPTH);
        messageFields.add(Constants.M_D_UPDATE_TYPE);
        messageFields.add(Constants.AGGREGATED_BOOK);
        messageFields.add(Constants.OPEN_CLOSE_SETTL_FLAG);
        messageFields.add(Constants.SCOPE);
        messageFields.add(Constants.M_D_IMPLICIT_DELETE);
        messageFields.add(Constants.NO_M_D_ENTRY_TYPES);
        messageFields.add(Constants.M_D_ENTRY_TYPE);
        messageFields.add(Constants.NO_RELATED_SYM);
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
        messageFields.add(Constants.CURRENCY);
        messageFields.add(Constants.QUOTE_TYPE);
        messageFields.add(Constants.SETTL_TYPE);
        messageFields.add(Constants.SETTL_DATE);
        messageFields.add(Constants.M_D_ENTRY_SIZE);
        messageFields.add(Constants.M_D_STREAM_ID);
        messageFields.add(Constants.NO_TRADING_SESSIONS);
        messageFields.add(Constants.TRADING_SESSION_ID);
        messageFields.add(Constants.TRADING_SESSION_SUB_ID);
        messageFields.add(Constants.APPL_QUEUE_ACTION);
        messageFields.add(Constants.APPL_QUEUE_MAX);
        messageFields.add(Constants.M_D_QUOTE_TYPE);
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

    private char[] mDReqID = new char[1];

    public char[] mDReqID()
    {
        return mDReqID;
    }


    private int mDReqIDOffset;

    private int mDReqIDLength;

    public int mDReqIDLength()
    {
        return mDReqIDLength;
    }

    public String mDReqIDAsString()
    {
        return new String(mDReqID, 0, mDReqIDLength);
    }

    public void mDReqID(final AsciiSequenceView view)
    {
        view.wrap(buffer, mDReqIDOffset, mDReqIDLength);
    }


    private char subscriptionRequestType = MISSING_CHAR;

    public char subscriptionRequestType()
    {
        return subscriptionRequestType;
    }



    private final CharArrayWrapper subscriptionRequestTypeWrapper = new CharArrayWrapper();
    public SubscriptionRequestType subscriptionRequestTypeAsEnum()
    {
        return SubscriptionRequestType.decode(subscriptionRequestType);
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


    private int marketDepth = MISSING_INT;

    public int marketDepth()
    {
        return marketDepth;
    }



    private int mDUpdateType = MISSING_INT;

    private boolean hasMDUpdateType;

    public int mDUpdateType()
    {
        if (!hasMDUpdateType)
        {
            throw new IllegalArgumentException("No value for optional field: MDUpdateType");
        }

        return mDUpdateType;
    }

    public boolean hasMDUpdateType()
    {
        return hasMDUpdateType;
    }



    private final CharArrayWrapper mDUpdateTypeWrapper = new CharArrayWrapper();
    public MDUpdateType mDUpdateTypeAsEnum()
    {
        if (!hasMDUpdateType)
 return MDUpdateType.NULL_VAL;
        return MDUpdateType.decode(mDUpdateType);
    }

    private boolean aggregatedBook;

    private boolean hasAggregatedBook;

    public boolean aggregatedBook()
    {
        if (!hasAggregatedBook)
        {
            throw new IllegalArgumentException("No value for optional field: AggregatedBook");
        }

        return aggregatedBook;
    }

    public boolean hasAggregatedBook()
    {
        return hasAggregatedBook;
    }



    private char[] openCloseSettlFlag = new char[1];

    private boolean hasOpenCloseSettlFlag;

    public char[] openCloseSettlFlag()
    {
        if (!hasOpenCloseSettlFlag)
        {
            throw new IllegalArgumentException("No value for optional field: OpenCloseSettlFlag");
        }

        return openCloseSettlFlag;
    }

    public boolean hasOpenCloseSettlFlag()
    {
        return hasOpenCloseSettlFlag;
    }


    private int openCloseSettlFlagOffset;

    private int openCloseSettlFlagLength;

    public int openCloseSettlFlagLength()
    {
        if (!hasOpenCloseSettlFlag)
        {
            throw new IllegalArgumentException("No value for optional field: OpenCloseSettlFlag");
        }

        return openCloseSettlFlagLength;
    }

    public String openCloseSettlFlagAsString()
    {
        return hasOpenCloseSettlFlag ? new String(openCloseSettlFlag, 0, openCloseSettlFlagLength) : null;
    }

    public void openCloseSettlFlag(final AsciiSequenceView view)
    {
        if (!hasOpenCloseSettlFlag)
        {
            throw new IllegalArgumentException("No value for optional field: OpenCloseSettlFlag");
        }

        view.wrap(buffer, openCloseSettlFlagOffset, openCloseSettlFlagLength);
    }


    private final CharArrayWrapper openCloseSettlFlagWrapper = new CharArrayWrapper();
    private char[] scope = new char[1];

    private boolean hasScope;

    public char[] scope()
    {
        if (!hasScope)
        {
            throw new IllegalArgumentException("No value for optional field: Scope");
        }

        return scope;
    }

    public boolean hasScope()
    {
        return hasScope;
    }


    private int scopeOffset;

    private int scopeLength;

    public int scopeLength()
    {
        if (!hasScope)
        {
            throw new IllegalArgumentException("No value for optional field: Scope");
        }

        return scopeLength;
    }

    public String scopeAsString()
    {
        return hasScope ? new String(scope, 0, scopeLength) : null;
    }

    public void scope(final AsciiSequenceView view)
    {
        if (!hasScope)
        {
            throw new IllegalArgumentException("No value for optional field: Scope");
        }

        view.wrap(buffer, scopeOffset, scopeLength);
    }


    private final CharArrayWrapper scopeWrapper = new CharArrayWrapper();
    private boolean mDImplicitDelete;

    private boolean hasMDImplicitDelete;

    public boolean mDImplicitDelete()
    {
        if (!hasMDImplicitDelete)
        {
            throw new IllegalArgumentException("No value for optional field: MDImplicitDelete");
        }

        return mDImplicitDelete;
    }

    public boolean hasMDImplicitDelete()
    {
        return hasMDImplicitDelete;
    }





    private MDEntryTypesGroupDecoder mDEntryTypesGroup = null;
    public MDEntryTypesGroupDecoder mDEntryTypesGroup()
    {
        return mDEntryTypesGroup;
    }

    private int noMDEntryTypesGroupCounter = MISSING_INT;

    private boolean hasNoMDEntryTypesGroupCounter;

    public int noMDEntryTypesGroupCounter()
    {
        if (!hasNoMDEntryTypesGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoMDEntryTypesGroupCounter");
        }

        return noMDEntryTypesGroupCounter;
    }

    public boolean hasNoMDEntryTypesGroupCounter()
    {
        return hasNoMDEntryTypesGroupCounter;
    }




    private MDEntryTypesGroupIterator mDEntryTypesGroupIterator = new MDEntryTypesGroupIterator(this);
    public MDEntryTypesGroupIterator mDEntryTypesGroupIterator()
    {
        return mDEntryTypesGroupIterator.iterator();
    }




    private RelatedSymGroupDecoder relatedSymGroup = null;
    public RelatedSymGroupDecoder relatedSymGroup()
    {
        return relatedSymGroup;
    }

    private int noRelatedSymGroupCounter = MISSING_INT;

    private boolean hasNoRelatedSymGroupCounter;

    public int noRelatedSymGroupCounter()
    {
        if (!hasNoRelatedSymGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoRelatedSymGroupCounter");
        }

        return noRelatedSymGroupCounter;
    }

    public boolean hasNoRelatedSymGroupCounter()
    {
        return hasNoRelatedSymGroupCounter;
    }




    private RelatedSymGroupIterator relatedSymGroupIterator = new RelatedSymGroupIterator(this);
    public RelatedSymGroupIterator relatedSymGroupIterator()
    {
        return relatedSymGroupIterator.iterator();
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


    private int applQueueAction = MISSING_INT;

    private boolean hasApplQueueAction;

    public int applQueueAction()
    {
        if (!hasApplQueueAction)
        {
            throw new IllegalArgumentException("No value for optional field: ApplQueueAction");
        }

        return applQueueAction;
    }

    public boolean hasApplQueueAction()
    {
        return hasApplQueueAction;
    }



    private final CharArrayWrapper applQueueActionWrapper = new CharArrayWrapper();
    public ApplQueueAction applQueueActionAsEnum()
    {
        if (!hasApplQueueAction)
 return ApplQueueAction.NULL_VAL;
        return ApplQueueAction.decode(applQueueAction);
    }

    private int applQueueMax = MISSING_INT;

    private boolean hasApplQueueMax;

    public int applQueueMax()
    {
        if (!hasApplQueueMax)
        {
            throw new IllegalArgumentException("No value for optional field: ApplQueueMax");
        }

        return applQueueMax;
    }

    public boolean hasApplQueueMax()
    {
        return hasApplQueueMax;
    }



    private int mDQuoteType = MISSING_INT;

    private boolean hasMDQuoteType;

    public int mDQuoteType()
    {
        if (!hasMDQuoteType)
        {
            throw new IllegalArgumentException("No value for optional field: MDQuoteType");
        }

        return mDQuoteType;
    }

    public boolean hasMDQuoteType()
    {
        return hasMDQuoteType;
    }



    private final CharArrayWrapper mDQuoteTypeWrapper = new CharArrayWrapper();
    public MDQuoteType mDQuoteTypeAsEnum()
    {
        if (!hasMDQuoteType)
 return MDQuoteType.NULL_VAL;
        return MDQuoteType.decode(mDQuoteType);
    }

    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode MarketDataRequest
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
            case Constants.M_D_REQ_ID:
                mDReqID = buffer.getChars(mDReqID, valueOffset, valueLength);
                mDReqIDOffset = valueOffset;
                mDReqIDLength = valueLength;
                break;

            case Constants.SUBSCRIPTION_REQUEST_TYPE:
                subscriptionRequestType = buffer.getChar(valueOffset);
                break;

            case Constants.NO_PARTY_IDS:
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


            case Constants.MARKET_DEPTH:
                marketDepth = getInt(buffer, valueOffset, endOfField, 264, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.M_D_UPDATE_TYPE:
                hasMDUpdateType = true;
                mDUpdateType = getInt(buffer, valueOffset, endOfField, 265, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.AGGREGATED_BOOK:
                hasAggregatedBook = true;
                aggregatedBook = buffer.getBoolean(valueOffset);
                break;

            case Constants.OPEN_CLOSE_SETTL_FLAG:
                hasOpenCloseSettlFlag = true;
                openCloseSettlFlag = buffer.getChars(openCloseSettlFlag, valueOffset, valueLength);
                openCloseSettlFlagOffset = valueOffset;
                openCloseSettlFlagLength = valueLength;
                break;

            case Constants.SCOPE:
                hasScope = true;
                scope = buffer.getChars(scope, valueOffset, valueLength);
                scopeOffset = valueOffset;
                scopeLength = valueLength;
                break;

            case Constants.M_D_IMPLICIT_DELETE:
                hasMDImplicitDelete = true;
                mDImplicitDelete = buffer.getBoolean(valueOffset);
                break;

            case Constants.NO_M_D_ENTRY_TYPES:
                hasNoMDEntryTypesGroupCounter = true;
                noMDEntryTypesGroupCounter = getInt(buffer, valueOffset, endOfField, 267, CODEC_VALIDATION_ENABLED);
                if (mDEntryTypesGroup == null)
                {
                    mDEntryTypesGroup = new MDEntryTypesGroupDecoder(trailer, messageFields);
                }
                MDEntryTypesGroupDecoder mDEntryTypesGroupCurrent = mDEntryTypesGroup;
                position = endOfField + 1;
                final int noMDEntryTypesGroupCounter = this.noMDEntryTypesGroupCounter;
                for (int i = 0; i < noMDEntryTypesGroupCounter && position < end; i++)
                {
                    if (mDEntryTypesGroupCurrent != null)
                    {
                        position += mDEntryTypesGroupCurrent.decode(buffer, position, end - position);
                        mDEntryTypesGroupCurrent = mDEntryTypesGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (mDEntryTypesGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;


            case Constants.NO_RELATED_SYM:
                hasNoRelatedSymGroupCounter = true;
                noRelatedSymGroupCounter = getInt(buffer, valueOffset, endOfField, 146, CODEC_VALIDATION_ENABLED);
                if (relatedSymGroup == null)
                {
                    relatedSymGroup = new RelatedSymGroupDecoder(trailer, messageFields);
                }
                RelatedSymGroupDecoder relatedSymGroupCurrent = relatedSymGroup;
                position = endOfField + 1;
                final int noRelatedSymGroupCounter = this.noRelatedSymGroupCounter;
                for (int i = 0; i < noRelatedSymGroupCounter && position < end; i++)
                {
                    if (relatedSymGroupCurrent != null)
                    {
                        position += relatedSymGroupCurrent.decode(buffer, position, end - position);
                        relatedSymGroupCurrent = relatedSymGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (relatedSymGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;


            case Constants.NO_TRADING_SESSIONS:
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


            case Constants.APPL_QUEUE_ACTION:
                hasApplQueueAction = true;
                applQueueAction = getInt(buffer, valueOffset, endOfField, 815, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.APPL_QUEUE_MAX:
                hasApplQueueMax = true;
                applQueueMax = getInt(buffer, valueOffset, endOfField, 812, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.M_D_QUOTE_TYPE:
                hasMDQuoteType = true;
                mDQuoteType = getInt(buffer, valueOffset, endOfField, 1070, CODEC_VALIDATION_ENABLED);
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
        this.resetMDReqID();
        this.resetSubscriptionRequestType();
        this.resetMarketDepth();
        this.resetMDUpdateType();
        this.resetAggregatedBook();
        this.resetOpenCloseSettlFlag();
        this.resetScope();
        this.resetMDImplicitDelete();
        this.resetApplQueueAction();
        this.resetApplQueueMax();
        this.resetMDQuoteType();
        this.resetPartyIDsGroup();
        this.resetMDEntryTypesGroup();
        this.resetRelatedSymGroup();
        this.resetTradingSessionsGroup();
    }

    public void resetMDReqID()
    {
        mDReqIDOffset = 0;
        mDReqIDLength = 0;
    }

    public void resetSubscriptionRequestType()
    {
        subscriptionRequestType = MISSING_CHAR;
    }

    public void resetMarketDepth()
    {
        marketDepth = MISSING_INT;
    }

    public void resetMDUpdateType()
    {
        hasMDUpdateType = false;
    }

    public void resetAggregatedBook()
    {
        hasAggregatedBook = false;
    }

    public void resetOpenCloseSettlFlag()
    {
        hasOpenCloseSettlFlag = false;
    }

    public void resetScope()
    {
        hasScope = false;
    }

    public void resetMDImplicitDelete()
    {
        hasMDImplicitDelete = false;
    }

    public void resetApplQueueAction()
    {
        hasApplQueueAction = false;
    }

    public void resetApplQueueMax()
    {
        hasApplQueueMax = false;
    }

    public void resetMDQuoteType()
    {
        hasMDQuoteType = false;
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

    public void resetMDEntryTypesGroup()
    {
        for (final MDEntryTypesGroupDecoder mDEntryTypesGroupDecoder : mDEntryTypesGroupIterator.iterator())
        {
            mDEntryTypesGroupDecoder.reset();
            if (mDEntryTypesGroupDecoder.next() == null)
            {
                break;
            }
        }
        noMDEntryTypesGroupCounter = MISSING_INT;
        hasNoMDEntryTypesGroupCounter = false;
    }

    public void resetRelatedSymGroup()
    {
        for (final RelatedSymGroupDecoder relatedSymGroupDecoder : relatedSymGroupIterator.iterator())
        {
            relatedSymGroupDecoder.reset();
            if (relatedSymGroupDecoder.next() == null)
            {
                break;
            }
        }
        noRelatedSymGroupCounter = MISSING_INT;
        hasNoRelatedSymGroupCounter = false;
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
        builder.append("\"MessageName\": \"MarketDataRequest\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        indent(builder, level);
        builder.append("\"MDReqID\": \"");
        builder.append(this.mDReqID(), 0, mDReqIDLength());
        builder.append("\",\n");

        indent(builder, level);
        builder.append("\"SubscriptionRequestType\": \"");
        builder.append(subscriptionRequestType);
        builder.append("\",\n");

    if (hasNoPartyIDsGroupCounter)
    {
        indent(builder, level);
        builder.append("\"PartyIDsGroup\": [\n");
        PartyIDsGroupDecoder partyIDsGroup = this.partyIDsGroup;
        for (int i = 0, size = this.noPartyIDsGroupCounter; i < size; i++)
        {
            indent(builder, level);
            partyIDsGroup.appendTo(builder, level + 1);            if (partyIDsGroup.next() != null)
            {
                builder.append(',');
            }
            builder.append('\n');
            partyIDsGroup = partyIDsGroup.next();        }
        indent(builder, level);
        builder.append("],\n");
    }

        indent(builder, level);
        builder.append("\"MarketDepth\": \"");
        builder.append(marketDepth);
        builder.append("\",\n");

        if (hasMDUpdateType())
        {
            indent(builder, level);
            builder.append("\"MDUpdateType\": \"");
            builder.append(mDUpdateType);
            builder.append("\",\n");
        }

        if (hasAggregatedBook())
        {
            indent(builder, level);
            builder.append("\"AggregatedBook\": \"");
            builder.append(aggregatedBook);
            builder.append("\",\n");
        }

        if (hasOpenCloseSettlFlag())
        {
            indent(builder, level);
            builder.append("\"OpenCloseSettlFlag\": \"");
            builder.append(this.openCloseSettlFlag(), 0, openCloseSettlFlagLength());
            builder.append("\",\n");
        }

        if (hasScope())
        {
            indent(builder, level);
            builder.append("\"Scope\": \"");
            builder.append(this.scope(), 0, scopeLength());
            builder.append("\",\n");
        }

        if (hasMDImplicitDelete())
        {
            indent(builder, level);
            builder.append("\"MDImplicitDelete\": \"");
            builder.append(mDImplicitDelete);
            builder.append("\",\n");
        }

    if (hasNoMDEntryTypesGroupCounter)
    {
        indent(builder, level);
        builder.append("\"MDEntryTypesGroup\": [\n");
        MDEntryTypesGroupDecoder mDEntryTypesGroup = this.mDEntryTypesGroup;
        for (int i = 0, size = this.noMDEntryTypesGroupCounter; i < size; i++)
        {
            indent(builder, level);
            mDEntryTypesGroup.appendTo(builder, level + 1);            if (mDEntryTypesGroup.next() != null)
            {
                builder.append(',');
            }
            builder.append('\n');
            mDEntryTypesGroup = mDEntryTypesGroup.next();        }
        indent(builder, level);
        builder.append("],\n");
    }

    if (hasNoRelatedSymGroupCounter)
    {
        indent(builder, level);
        builder.append("\"RelatedSymGroup\": [\n");
        RelatedSymGroupDecoder relatedSymGroup = this.relatedSymGroup;
        for (int i = 0, size = this.noRelatedSymGroupCounter; i < size; i++)
        {
            indent(builder, level);
            relatedSymGroup.appendTo(builder, level + 1);            if (relatedSymGroup.next() != null)
            {
                builder.append(',');
            }
            builder.append('\n');
            relatedSymGroup = relatedSymGroup.next();        }
        indent(builder, level);
        builder.append("],\n");
    }

    if (hasNoTradingSessionsGroupCounter)
    {
        indent(builder, level);
        builder.append("\"TradingSessionsGroup\": [\n");
        TradingSessionsGroupDecoder tradingSessionsGroup = this.tradingSessionsGroup;
        for (int i = 0, size = this.noTradingSessionsGroupCounter; i < size; i++)
        {
            indent(builder, level);
            tradingSessionsGroup.appendTo(builder, level + 1);            if (tradingSessionsGroup.next() != null)
            {
                builder.append(',');
            }
            builder.append('\n');
            tradingSessionsGroup = tradingSessionsGroup.next();        }
        indent(builder, level);
        builder.append("],\n");
    }

        if (hasApplQueueAction())
        {
            indent(builder, level);
            builder.append("\"ApplQueueAction\": \"");
            builder.append(applQueueAction);
            builder.append("\",\n");
        }

        if (hasApplQueueMax())
        {
            indent(builder, level);
            builder.append("\"ApplQueueMax\": \"");
            builder.append(applQueueMax);
            builder.append("\",\n");
        }

        if (hasMDQuoteType())
        {
            indent(builder, level);
            builder.append("\"MDQuoteType\": \"");
            builder.append(mDQuoteType);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public MarketDataRequestEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((MarketDataRequestEncoder)encoder);
    }

    public MarketDataRequestEncoder toEncoder(final MarketDataRequestEncoder encoder)
    {
        encoder.reset();
        encoder.mDReqID(this.mDReqID(), 0, mDReqIDLength());
        encoder.subscriptionRequestType(this.subscriptionRequestType());

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


        encoder.marketDepth(this.marketDepth());
        if (hasMDUpdateType())
        {
            encoder.mDUpdateType(this.mDUpdateType());
        }

        if (hasAggregatedBook())
        {
            encoder.aggregatedBook(this.aggregatedBook());
        }

        if (hasOpenCloseSettlFlag())
        {
            encoder.openCloseSettlFlag(this.openCloseSettlFlag(), 0, openCloseSettlFlagLength());
        }

        if (hasScope())
        {
            encoder.scope(this.scope(), 0, scopeLength());
        }

        if (hasMDImplicitDelete())
        {
            encoder.mDImplicitDelete(this.mDImplicitDelete());
        }


        final MDReqGrpEncoder mDReqGrp = encoder.mDReqGrp();        if (hasNoMDEntryTypesGroupCounter)
        {
            final int size = this.noMDEntryTypesGroupCounter;
            MDEntryTypesGroupDecoder mDEntryTypesGroup = this.mDEntryTypesGroup;
            MDEntryTypesGroupEncoder mDEntryTypesGroupEncoder = mDReqGrp.mDEntryTypesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (mDEntryTypesGroup != null)
                {
                    mDEntryTypesGroup.toEncoder(mDEntryTypesGroupEncoder);
                    mDEntryTypesGroup = mDEntryTypesGroup.next();
                    mDEntryTypesGroupEncoder = mDEntryTypesGroupEncoder.next();
                }
            }
        }



        final InstrmtMDReqGrpEncoder instrmtMDReqGrp = encoder.instrmtMDReqGrp();        if (hasNoRelatedSymGroupCounter)
        {
            final int size = this.noRelatedSymGroupCounter;
            RelatedSymGroupDecoder relatedSymGroup = this.relatedSymGroup;
            RelatedSymGroupEncoder relatedSymGroupEncoder = instrmtMDReqGrp.relatedSymGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (relatedSymGroup != null)
                {
                    relatedSymGroup.toEncoder(relatedSymGroupEncoder);
                    relatedSymGroup = relatedSymGroup.next();
                    relatedSymGroupEncoder = relatedSymGroupEncoder.next();
                }
            }
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


        if (hasApplQueueAction())
        {
            encoder.applQueueAction(this.applQueueAction());
        }

        if (hasApplQueueMax())
        {
            encoder.applQueueMax(this.applQueueMax());
        }

        if (hasMDQuoteType())
        {
            encoder.mDQuoteType(this.mDQuoteType());
        }
        return encoder;
    }

}
