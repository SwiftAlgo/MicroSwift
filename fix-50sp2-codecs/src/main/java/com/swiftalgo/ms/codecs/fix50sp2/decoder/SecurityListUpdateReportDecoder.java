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
import com.swiftalgo.ms.codecs.fix50sp2.builder.SecurityListUpdateReportEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.ApplicationSequenceControlEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.SecLstUpdRelSymGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.SecLstUpdRelSymGrpEncoder.RelatedSymGroupEncoder;
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
import com.swiftalgo.ms.codecs.fix50sp2.builder.SecurityTradingRulesEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.BaseTradingRulesEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.TickRulesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.TickRulesEncoder.TickRulesGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.LotTypeRulesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.LotTypeRulesEncoder.LotTypeRulesGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.PriceLimitsEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.TradingSessionRulesGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.TradingSessionRulesGrpEncoder.TradingSessionRulesGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.TradingSessionRulesEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.OrdTypeRulesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.OrdTypeRulesEncoder.OrdTypeRulesGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.TimeInForceRulesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.TimeInForceRulesEncoder.TimeInForceRulesGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.ExecInstRulesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.ExecInstRulesEncoder.ExecInstRulesGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.MatchRulesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.MatchRulesEncoder.MatchRulesGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.MarketDataFeedTypesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.MarketDataFeedTypesEncoder.MDFeedTypesGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.NestedInstrumentAttributeEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.NestedInstrumentAttributeEncoder.NestedInstrAttribGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.StrikeRulesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.StrikeRulesEncoder.StrikeRulesGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.MaturityRulesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.MaturityRulesEncoder.MaturityRulesGroupEncoder;
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
import com.swiftalgo.ms.codecs.fix50sp2.builder.SecLstUpdRelSymsLegGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.SecLstUpdRelSymsLegGrpEncoder.LegsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.InstrumentLegEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.LegSecAltIDGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.LegSecAltIDGrpEncoder.LegSecurityAltIDGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.LegStipulationsEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.LegStipulationsEncoder.LegStipulationsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.LegBenchmarkCurveDataEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.SpreadOrBenchmarkCurveDataEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.YieldDataEncoder;


public class SecurityListUpdateReportDecoder extends CommonDecoderImpl implements ApplicationSequenceControlDecoder, SecLstUpdRelSymGrpDecoder, MessageDecoder
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(0);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
        }
    }

    public final IntHashSet GROUP_FIELDS = new IntHashSet(46);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            GROUP_FIELDS.add(Constants.APPL_ID);
            GROUP_FIELDS.add(Constants.APPL_SEQ_NUM);
            GROUP_FIELDS.add(Constants.APPL_LAST_SEQ_NUM);
            GROUP_FIELDS.add(Constants.APPL_RESEND_FLAG);
            GROUP_FIELDS.add(Constants.SECURITY_REPORT_ID);
            GROUP_FIELDS.add(Constants.SECURITY_LIST_ID);
            GROUP_FIELDS.add(Constants.SECURITY_LIST_REF_ID);
            GROUP_FIELDS.add(Constants.SECURITY_LIST_DESC);
            GROUP_FIELDS.add(Constants.ENCODED_SECURITY_LIST_DESC_LEN);
            GROUP_FIELDS.add(Constants.ENCODED_SECURITY_LIST_DESC);
            GROUP_FIELDS.add(Constants.SECURITY_LIST_TYPE);
            GROUP_FIELDS.add(Constants.SECURITY_LIST_TYPE_SOURCE);
            GROUP_FIELDS.add(Constants.SECURITY_REQ_ID);
            GROUP_FIELDS.add(Constants.SECURITY_RESPONSE_ID);
            GROUP_FIELDS.add(Constants.SECURITY_REQUEST_RESULT);
            GROUP_FIELDS.add(Constants.TOT_NO_RELATED_SYM);
            GROUP_FIELDS.add(Constants.CLEARING_BUSINESS_DATE);
            GROUP_FIELDS.add(Constants.SECURITY_UPDATE_ACTION);
            GROUP_FIELDS.add(Constants.CORPORATE_ACTION);
            GROUP_FIELDS.add(Constants.MARKET_ID);
            GROUP_FIELDS.add(Constants.MARKET_SEGMENT_ID);
            GROUP_FIELDS.add(Constants.TRANSACT_TIME);
            GROUP_FIELDS.add(Constants.LAST_FRAGMENT);
        }
    }

    private final IntHashSet alreadyVisitedFields = new IntHashSet(46);

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
        if (hasSecurityListType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !SecurityListType.isValid(securityListType()))
        {
            invalidTagId = 1470;
            rejectReason = 5;
            return false;
        }
        }

        if (hasSecurityListTypeSource)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !SecurityListTypeSource.isValid(securityListTypeSource()))
        {
            invalidTagId = 1471;
            rejectReason = 5;
            return false;
        }
        }

        if (hasSecurityRequestResult)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !SecurityRequestResult.isValid(securityRequestResult()))
        {
            invalidTagId = 560;
            rejectReason = 5;
            return false;
        }
        }

        if (hasSecurityUpdateAction)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !SecurityUpdateAction.isValid(securityUpdateAction()))
        {
            invalidTagId = 980;
            rejectReason = 5;
            return false;
        }
        }

        if (hasCorporateAction)
        {
          int corporateActionOffset = 0;
          for (int i = 0; i < corporateActionLength; i++)
          {
              if (this.corporateAction()[i] == ' ')
              {
                  corporateActionWrapper.wrap(this.corporateAction(), corporateActionOffset, i - corporateActionOffset);
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !CorporateAction.isValid(corporateActionWrapper))
        {
            invalidTagId = 292;
            rejectReason = 5;
            return false;
        }
                  corporateActionOffset = i + 1;
              }
          }
          corporateActionWrapper.wrap(this.corporateAction(), corporateActionOffset, corporateActionLength - corporateActionOffset);
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !CorporateAction.isValid(corporateActionWrapper))
        {
            invalidTagId = 292;
            rejectReason = 5;
            return false;
        }
        }

        if (hasNoRelatedSymGroupCounter)
        {
            {
                int count = 0;
                final RelatedSymGroupIterator iterator = relatedSymGroupIterator.iterator();
                for (final RelatedSymGroupDecoder group : iterator)
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
                    invalidTagId = 146;
                    rejectReason = 16;
                    return false;
                }
            }
        }
        return true;
    }

    public static final long MESSAGE_TYPE = 19266L;

    public static final String MESSAGE_TYPE_AS_STRING = "BK";

    public static final char[] MESSAGE_TYPE_CHARS = MESSAGE_TYPE_AS_STRING.toCharArray();

    public static final byte[] MESSAGE_TYPE_BYTES = MESSAGE_TYPE_AS_STRING.getBytes(US_ASCII);

    public final IntHashSet messageFields = new IntHashSet(822);

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
        messageFields.add(Constants.SECURITY_REPORT_ID);
        messageFields.add(Constants.SECURITY_LIST_ID);
        messageFields.add(Constants.SECURITY_LIST_REF_ID);
        messageFields.add(Constants.SECURITY_LIST_DESC);
        messageFields.add(Constants.ENCODED_SECURITY_LIST_DESC_LEN);
        messageFields.add(Constants.ENCODED_SECURITY_LIST_DESC);
        messageFields.add(Constants.SECURITY_LIST_TYPE);
        messageFields.add(Constants.SECURITY_LIST_TYPE_SOURCE);
        messageFields.add(Constants.SECURITY_REQ_ID);
        messageFields.add(Constants.SECURITY_RESPONSE_ID);
        messageFields.add(Constants.SECURITY_REQUEST_RESULT);
        messageFields.add(Constants.TOT_NO_RELATED_SYM);
        messageFields.add(Constants.CLEARING_BUSINESS_DATE);
        messageFields.add(Constants.SECURITY_UPDATE_ACTION);
        messageFields.add(Constants.CORPORATE_ACTION);
        messageFields.add(Constants.MARKET_ID);
        messageFields.add(Constants.MARKET_SEGMENT_ID);
        messageFields.add(Constants.TRANSACT_TIME);
        messageFields.add(Constants.LAST_FRAGMENT);
        messageFields.add(Constants.NO_RELATED_SYM);
        messageFields.add(Constants.LIST_UPDATE_ACTION);
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
        messageFields.add(Constants.DELIVERY_FORM);
        messageFields.add(Constants.PCT_AT_RISK);
        messageFields.add(Constants.NO_INSTR_ATTRIB);
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
        messageFields.add(Constants.NO_TICK_RULES);
        messageFields.add(Constants.START_TICK_PRICE_RANGE);
        messageFields.add(Constants.END_TICK_PRICE_RANGE);
        messageFields.add(Constants.TICK_INCREMENT);
        messageFields.add(Constants.TICK_RULE_TYPE);
        messageFields.add(Constants.NO_LOT_TYPE_RULES);
        messageFields.add(Constants.LOT_TYPE);
        messageFields.add(Constants.MIN_LOT_SIZE);
        messageFields.add(Constants.PRICE_LIMIT_TYPE);
        messageFields.add(Constants.LOW_LIMIT_PRICE);
        messageFields.add(Constants.HIGH_LIMIT_PRICE);
        messageFields.add(Constants.TRADING_REFERENCE_PRICE);
        messageFields.add(Constants.EXPIRATION_CYCLE);
        messageFields.add(Constants.MIN_TRADE_VOL);
        messageFields.add(Constants.MAX_TRADE_VOL);
        messageFields.add(Constants.MAX_PRICE_VARIATION);
        messageFields.add(Constants.IMPLIED_MARKET_INDICATOR);
        messageFields.add(Constants.TRADING_CURRENCY);
        messageFields.add(Constants.ROUND_LOT);
        messageFields.add(Constants.MULTILEG_MODEL);
        messageFields.add(Constants.MULTILEG_PRICE_METHOD);
        messageFields.add(Constants.PRICE_TYPE);
        messageFields.add(Constants.NO_TRADING_SESSION_RULES);
        messageFields.add(Constants.TRADING_SESSION_ID);
        messageFields.add(Constants.TRADING_SESSION_SUB_ID);
        messageFields.add(Constants.NO_ORD_TYPE_RULES);
        messageFields.add(Constants.ORD_TYPE);
        messageFields.add(Constants.NO_TIME_IN_FORCE_RULES);
        messageFields.add(Constants.TIME_IN_FORCE);
        messageFields.add(Constants.NO_EXEC_INST_RULES);
        messageFields.add(Constants.EXEC_INST_VALUE);
        messageFields.add(Constants.NO_MATCH_RULES);
        messageFields.add(Constants.MATCH_ALGORITHM);
        messageFields.add(Constants.MATCH_TYPE);
        messageFields.add(Constants.NO_M_D_FEED_TYPES);
        messageFields.add(Constants.M_D_FEED_TYPE);
        messageFields.add(Constants.MARKET_DEPTH);
        messageFields.add(Constants.M_D_BOOK_TYPE);
        messageFields.add(Constants.NO_NESTED_INSTR_ATTRIB);
        messageFields.add(Constants.NESTED_INSTR_ATTRIB_TYPE);
        messageFields.add(Constants.NESTED_INSTR_ATTRIB_VALUE);
        messageFields.add(Constants.NO_STRIKE_RULES);
        messageFields.add(Constants.STRIKE_RULE_ID);
        messageFields.add(Constants.START_STRIKE_PX_RANGE);
        messageFields.add(Constants.END_STRIKE_PX_RANGE);
        messageFields.add(Constants.STRIKE_INCREMENT);
        messageFields.add(Constants.STRIKE_EXERCISE_STYLE);
        messageFields.add(Constants.NO_MATURITY_RULES);
        messageFields.add(Constants.MATURITY_RULE_ID);
        messageFields.add(Constants.MATURITY_MONTH_YEAR_FORMAT);
        messageFields.add(Constants.MATURITY_MONTH_YEAR_INCREMENT_UNITS);
        messageFields.add(Constants.START_MATURITY_MONTH_YEAR);
        messageFields.add(Constants.END_MATURITY_MONTH_YEAR);
        messageFields.add(Constants.MATURITY_MONTH_YEAR_INCREMENT);
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
        messageFields.add(Constants.CURRENCY);
        messageFields.add(Constants.NO_STIPULATIONS);
        messageFields.add(Constants.STIPULATION_TYPE);
        messageFields.add(Constants.STIPULATION_VALUE);
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
        messageFields.add(Constants.LEG_SWAP_TYPE);
        messageFields.add(Constants.LEG_SETTL_TYPE);
        messageFields.add(Constants.NO_LEG_STIPULATIONS);
        messageFields.add(Constants.LEG_STIPULATION_TYPE);
        messageFields.add(Constants.LEG_STIPULATION_VALUE);
        messageFields.add(Constants.LEG_BENCHMARK_CURVE_CURRENCY);
        messageFields.add(Constants.LEG_BENCHMARK_CURVE_NAME);
        messageFields.add(Constants.LEG_BENCHMARK_CURVE_POINT);
        messageFields.add(Constants.LEG_BENCHMARK_PRICE);
        messageFields.add(Constants.LEG_BENCHMARK_PRICE_TYPE);
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
        messageFields.add(Constants.REL_SYM_TRANSACT_TIME);
        messageFields.add(Constants.TEXT);
        messageFields.add(Constants.ENCODED_TEXT_LEN);
        messageFields.add(Constants.ENCODED_TEXT);
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




    private int securityReportID = MISSING_INT;

    private boolean hasSecurityReportID;

    public int securityReportID()
    {
        if (!hasSecurityReportID)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityReportID");
        }

        return securityReportID;
    }

    public boolean hasSecurityReportID()
    {
        return hasSecurityReportID;
    }



    private char[] securityListID = new char[1];

    private boolean hasSecurityListID;

    public char[] securityListID()
    {
        if (!hasSecurityListID)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityListID");
        }

        return securityListID;
    }

    public boolean hasSecurityListID()
    {
        return hasSecurityListID;
    }


    private int securityListIDOffset;

    private int securityListIDLength;

    public int securityListIDLength()
    {
        if (!hasSecurityListID)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityListID");
        }

        return securityListIDLength;
    }

    public String securityListIDAsString()
    {
        return hasSecurityListID ? new String(securityListID, 0, securityListIDLength) : null;
    }

    public void securityListID(final AsciiSequenceView view)
    {
        if (!hasSecurityListID)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityListID");
        }

        view.wrap(buffer, securityListIDOffset, securityListIDLength);
    }


    private char[] securityListRefID = new char[1];

    private boolean hasSecurityListRefID;

    public char[] securityListRefID()
    {
        if (!hasSecurityListRefID)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityListRefID");
        }

        return securityListRefID;
    }

    public boolean hasSecurityListRefID()
    {
        return hasSecurityListRefID;
    }


    private int securityListRefIDOffset;

    private int securityListRefIDLength;

    public int securityListRefIDLength()
    {
        if (!hasSecurityListRefID)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityListRefID");
        }

        return securityListRefIDLength;
    }

    public String securityListRefIDAsString()
    {
        return hasSecurityListRefID ? new String(securityListRefID, 0, securityListRefIDLength) : null;
    }

    public void securityListRefID(final AsciiSequenceView view)
    {
        if (!hasSecurityListRefID)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityListRefID");
        }

        view.wrap(buffer, securityListRefIDOffset, securityListRefIDLength);
    }


    private char[] securityListDesc = new char[1];

    private boolean hasSecurityListDesc;

    public char[] securityListDesc()
    {
        if (!hasSecurityListDesc)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityListDesc");
        }

        return securityListDesc;
    }

    public boolean hasSecurityListDesc()
    {
        return hasSecurityListDesc;
    }


    private int securityListDescOffset;

    private int securityListDescLength;

    public int securityListDescLength()
    {
        if (!hasSecurityListDesc)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityListDesc");
        }

        return securityListDescLength;
    }

    public String securityListDescAsString()
    {
        return hasSecurityListDesc ? new String(securityListDesc, 0, securityListDescLength) : null;
    }

    public void securityListDesc(final AsciiSequenceView view)
    {
        if (!hasSecurityListDesc)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityListDesc");
        }

        view.wrap(buffer, securityListDescOffset, securityListDescLength);
    }


    private int encodedSecurityListDescLen = MISSING_INT;

    private boolean hasEncodedSecurityListDescLen;

    public int encodedSecurityListDescLen()
    {
        if (!hasEncodedSecurityListDescLen)
        {
            throw new IllegalArgumentException("No value for optional field: EncodedSecurityListDescLen");
        }

        return encodedSecurityListDescLen;
    }

    public boolean hasEncodedSecurityListDescLen()
    {
        return hasEncodedSecurityListDescLen;
    }



    private byte[] encodedSecurityListDesc = new byte[1];

    private boolean hasEncodedSecurityListDesc;

    public byte[] encodedSecurityListDesc()
    {
        if (!hasEncodedSecurityListDesc)
        {
            throw new IllegalArgumentException("No value for optional field: EncodedSecurityListDesc");
        }

        return encodedSecurityListDesc;
    }

    public boolean hasEncodedSecurityListDesc()
    {
        return hasEncodedSecurityListDesc;
    }



    private int securityListType = MISSING_INT;

    private boolean hasSecurityListType;

    public int securityListType()
    {
        if (!hasSecurityListType)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityListType");
        }

        return securityListType;
    }

    public boolean hasSecurityListType()
    {
        return hasSecurityListType;
    }



    private final CharArrayWrapper securityListTypeWrapper = new CharArrayWrapper();
    public SecurityListType securityListTypeAsEnum()
    {
        if (!hasSecurityListType)
 return SecurityListType.NULL_VAL;
        return SecurityListType.decode(securityListType);
    }

    private int securityListTypeSource = MISSING_INT;

    private boolean hasSecurityListTypeSource;

    public int securityListTypeSource()
    {
        if (!hasSecurityListTypeSource)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityListTypeSource");
        }

        return securityListTypeSource;
    }

    public boolean hasSecurityListTypeSource()
    {
        return hasSecurityListTypeSource;
    }



    private final CharArrayWrapper securityListTypeSourceWrapper = new CharArrayWrapper();
    public SecurityListTypeSource securityListTypeSourceAsEnum()
    {
        if (!hasSecurityListTypeSource)
 return SecurityListTypeSource.NULL_VAL;
        return SecurityListTypeSource.decode(securityListTypeSource);
    }

    private char[] securityReqID = new char[1];

    private boolean hasSecurityReqID;

    public char[] securityReqID()
    {
        if (!hasSecurityReqID)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityReqID");
        }

        return securityReqID;
    }

    public boolean hasSecurityReqID()
    {
        return hasSecurityReqID;
    }


    private int securityReqIDOffset;

    private int securityReqIDLength;

    public int securityReqIDLength()
    {
        if (!hasSecurityReqID)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityReqID");
        }

        return securityReqIDLength;
    }

    public String securityReqIDAsString()
    {
        return hasSecurityReqID ? new String(securityReqID, 0, securityReqIDLength) : null;
    }

    public void securityReqID(final AsciiSequenceView view)
    {
        if (!hasSecurityReqID)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityReqID");
        }

        view.wrap(buffer, securityReqIDOffset, securityReqIDLength);
    }


    private char[] securityResponseID = new char[1];

    private boolean hasSecurityResponseID;

    public char[] securityResponseID()
    {
        if (!hasSecurityResponseID)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityResponseID");
        }

        return securityResponseID;
    }

    public boolean hasSecurityResponseID()
    {
        return hasSecurityResponseID;
    }


    private int securityResponseIDOffset;

    private int securityResponseIDLength;

    public int securityResponseIDLength()
    {
        if (!hasSecurityResponseID)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityResponseID");
        }

        return securityResponseIDLength;
    }

    public String securityResponseIDAsString()
    {
        return hasSecurityResponseID ? new String(securityResponseID, 0, securityResponseIDLength) : null;
    }

    public void securityResponseID(final AsciiSequenceView view)
    {
        if (!hasSecurityResponseID)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityResponseID");
        }

        view.wrap(buffer, securityResponseIDOffset, securityResponseIDLength);
    }


    private int securityRequestResult = MISSING_INT;

    private boolean hasSecurityRequestResult;

    public int securityRequestResult()
    {
        if (!hasSecurityRequestResult)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityRequestResult");
        }

        return securityRequestResult;
    }

    public boolean hasSecurityRequestResult()
    {
        return hasSecurityRequestResult;
    }



    private final CharArrayWrapper securityRequestResultWrapper = new CharArrayWrapper();
    public SecurityRequestResult securityRequestResultAsEnum()
    {
        if (!hasSecurityRequestResult)
 return SecurityRequestResult.NULL_VAL;
        return SecurityRequestResult.decode(securityRequestResult);
    }

    private int totNoRelatedSym = MISSING_INT;

    private boolean hasTotNoRelatedSym;

    public int totNoRelatedSym()
    {
        if (!hasTotNoRelatedSym)
        {
            throw new IllegalArgumentException("No value for optional field: TotNoRelatedSym");
        }

        return totNoRelatedSym;
    }

    public boolean hasTotNoRelatedSym()
    {
        return hasTotNoRelatedSym;
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


    private char securityUpdateAction = MISSING_CHAR;

    private boolean hasSecurityUpdateAction;

    public char securityUpdateAction()
    {
        if (!hasSecurityUpdateAction)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityUpdateAction");
        }

        return securityUpdateAction;
    }

    public boolean hasSecurityUpdateAction()
    {
        return hasSecurityUpdateAction;
    }



    private final CharArrayWrapper securityUpdateActionWrapper = new CharArrayWrapper();
    public SecurityUpdateAction securityUpdateActionAsEnum()
    {
        if (!hasSecurityUpdateAction)
 return SecurityUpdateAction.NULL_VAL;
        return SecurityUpdateAction.decode(securityUpdateAction);
    }

    private char[] corporateAction = new char[1];

    private boolean hasCorporateAction;

    public char[] corporateAction()
    {
        if (!hasCorporateAction)
        {
            throw new IllegalArgumentException("No value for optional field: CorporateAction");
        }

        return corporateAction;
    }

    public boolean hasCorporateAction()
    {
        return hasCorporateAction;
    }


    private int corporateActionOffset;

    private int corporateActionLength;

    public int corporateActionLength()
    {
        if (!hasCorporateAction)
        {
            throw new IllegalArgumentException("No value for optional field: CorporateAction");
        }

        return corporateActionLength;
    }

    public String corporateActionAsString()
    {
        return hasCorporateAction ? new String(corporateAction, 0, corporateActionLength) : null;
    }

    public void corporateAction(final AsciiSequenceView view)
    {
        if (!hasCorporateAction)
        {
            throw new IllegalArgumentException("No value for optional field: CorporateAction");
        }

        view.wrap(buffer, corporateActionOffset, corporateActionLength);
    }


    private final CharArrayWrapper corporateActionWrapper = new CharArrayWrapper();
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


    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode SecurityListUpdateReport
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


            case Constants.SECURITY_REPORT_ID:
                hasSecurityReportID = true;
                securityReportID = getInt(buffer, valueOffset, endOfField, 964, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.SECURITY_LIST_ID:
                hasSecurityListID = true;
                securityListID = buffer.getChars(securityListID, valueOffset, valueLength);
                securityListIDOffset = valueOffset;
                securityListIDLength = valueLength;
                break;

            case Constants.SECURITY_LIST_REF_ID:
                hasSecurityListRefID = true;
                securityListRefID = buffer.getChars(securityListRefID, valueOffset, valueLength);
                securityListRefIDOffset = valueOffset;
                securityListRefIDLength = valueLength;
                break;

            case Constants.SECURITY_LIST_DESC:
                hasSecurityListDesc = true;
                securityListDesc = buffer.getChars(securityListDesc, valueOffset, valueLength);
                securityListDescOffset = valueOffset;
                securityListDescLength = valueLength;
                break;

            case Constants.ENCODED_SECURITY_LIST_DESC_LEN:
                hasEncodedSecurityListDescLen = true;
                encodedSecurityListDescLen = getInt(buffer, valueOffset, endOfField, 1468, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.ENCODED_SECURITY_LIST_DESC:
                hasEncodedSecurityListDesc = true;
                encodedSecurityListDesc = buffer.getBytes(encodedSecurityListDesc, valueOffset, encodedSecurityListDescLen);
                endOfField = valueOffset + encodedSecurityListDescLen;
                break;

            case Constants.SECURITY_LIST_TYPE:
                hasSecurityListType = true;
                securityListType = getInt(buffer, valueOffset, endOfField, 1470, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.SECURITY_LIST_TYPE_SOURCE:
                hasSecurityListTypeSource = true;
                securityListTypeSource = getInt(buffer, valueOffset, endOfField, 1471, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.SECURITY_REQ_ID:
                hasSecurityReqID = true;
                securityReqID = buffer.getChars(securityReqID, valueOffset, valueLength);
                securityReqIDOffset = valueOffset;
                securityReqIDLength = valueLength;
                break;

            case Constants.SECURITY_RESPONSE_ID:
                hasSecurityResponseID = true;
                securityResponseID = buffer.getChars(securityResponseID, valueOffset, valueLength);
                securityResponseIDOffset = valueOffset;
                securityResponseIDLength = valueLength;
                break;

            case Constants.SECURITY_REQUEST_RESULT:
                hasSecurityRequestResult = true;
                securityRequestResult = getInt(buffer, valueOffset, endOfField, 560, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.TOT_NO_RELATED_SYM:
                hasTotNoRelatedSym = true;
                totNoRelatedSym = getInt(buffer, valueOffset, endOfField, 393, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.CLEARING_BUSINESS_DATE:
                hasClearingBusinessDate = true;
                clearingBusinessDate = buffer.getBytes(clearingBusinessDate, valueOffset, valueLength);
                clearingBusinessDateOffset = valueOffset;
                clearingBusinessDateLength = valueLength;
                break;

            case Constants.SECURITY_UPDATE_ACTION:
                hasSecurityUpdateAction = true;
                securityUpdateAction = buffer.getChar(valueOffset);
                break;

            case Constants.CORPORATE_ACTION:
                hasCorporateAction = true;
                corporateAction = buffer.getChars(corporateAction, valueOffset, valueLength);
                corporateActionOffset = valueOffset;
                corporateActionLength = valueLength;
                break;

            case Constants.MARKET_ID:
                hasMarketID = true;
                marketID = buffer.getChars(marketID, valueOffset, valueLength);
                marketIDOffset = valueOffset;
                marketIDLength = valueLength;
                break;

            case Constants.MARKET_SEGMENT_ID:
                hasMarketSegmentID = true;
                marketSegmentID = buffer.getChars(marketSegmentID, valueOffset, valueLength);
                marketSegmentIDOffset = valueOffset;
                marketSegmentIDLength = valueLength;
                break;

            case Constants.TRANSACT_TIME:
                hasTransactTime = true;
                transactTime = buffer.getBytes(transactTime, valueOffset, valueLength);
                transactTimeOffset = valueOffset;
                transactTimeLength = valueLength;
                break;

            case Constants.LAST_FRAGMENT:
                hasLastFragment = true;
                lastFragment = buffer.getBoolean(valueOffset);
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
        this.resetSecurityReportID();
        this.resetSecurityListID();
        this.resetSecurityListRefID();
        this.resetSecurityListDesc();
        this.resetEncodedSecurityListDescLen();
        this.resetEncodedSecurityListDesc();
        this.resetSecurityListType();
        this.resetSecurityListTypeSource();
        this.resetSecurityReqID();
        this.resetSecurityResponseID();
        this.resetSecurityRequestResult();
        this.resetTotNoRelatedSym();
        this.resetClearingBusinessDate();
        this.resetSecurityUpdateAction();
        this.resetCorporateAction();
        this.resetMarketID();
        this.resetMarketSegmentID();
        this.resetTransactTime();
        this.resetLastFragment();
        this.resetApplID();
        this.resetApplSeqNum();
        this.resetApplLastSeqNum();
        this.resetApplResendFlag();
        this.resetRelatedSymGroup();
    }

    public void resetSecurityReportID()
    {
        hasSecurityReportID = false;
    }

    public void resetSecurityListID()
    {
        hasSecurityListID = false;
    }

    public void resetSecurityListRefID()
    {
        hasSecurityListRefID = false;
    }

    public void resetSecurityListDesc()
    {
        hasSecurityListDesc = false;
    }

    public void resetEncodedSecurityListDescLen()
    {
        hasEncodedSecurityListDescLen = false;
    }

    public void resetEncodedSecurityListDesc()
    {
        hasEncodedSecurityListDesc = false;
    }

    public void resetSecurityListType()
    {
        hasSecurityListType = false;
    }

    public void resetSecurityListTypeSource()
    {
        hasSecurityListTypeSource = false;
    }

    public void resetSecurityReqID()
    {
        hasSecurityReqID = false;
    }

    public void resetSecurityResponseID()
    {
        hasSecurityResponseID = false;
    }

    public void resetSecurityRequestResult()
    {
        hasSecurityRequestResult = false;
    }

    public void resetTotNoRelatedSym()
    {
        hasTotNoRelatedSym = false;
    }

    public void resetClearingBusinessDate()
    {
        hasClearingBusinessDate = false;
    }

    public void resetSecurityUpdateAction()
    {
        hasSecurityUpdateAction = false;
    }

    public void resetCorporateAction()
    {
        hasCorporateAction = false;
    }

    public void resetMarketID()
    {
        hasMarketID = false;
    }

    public void resetMarketSegmentID()
    {
        hasMarketSegmentID = false;
    }

    public void resetTransactTime()
    {
        hasTransactTime = false;
    }

    public void resetLastFragment()
    {
        hasLastFragment = false;
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
        builder.append("\"MessageName\": \"SecurityListUpdateReport\",\n");
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

        if (hasSecurityReportID())
        {
            indent(builder, level);
            builder.append("\"SecurityReportID\": \"");
            builder.append(securityReportID);
            builder.append("\",\n");
        }

        if (hasSecurityListID())
        {
            indent(builder, level);
            builder.append("\"SecurityListID\": \"");
            builder.append(this.securityListID(), 0, securityListIDLength());
            builder.append("\",\n");
        }

        if (hasSecurityListRefID())
        {
            indent(builder, level);
            builder.append("\"SecurityListRefID\": \"");
            builder.append(this.securityListRefID(), 0, securityListRefIDLength());
            builder.append("\",\n");
        }

        if (hasSecurityListDesc())
        {
            indent(builder, level);
            builder.append("\"SecurityListDesc\": \"");
            builder.append(this.securityListDesc(), 0, securityListDescLength());
            builder.append("\",\n");
        }

        if (hasEncodedSecurityListDescLen())
        {
            indent(builder, level);
            builder.append("\"EncodedSecurityListDescLen\": \"");
            builder.append(encodedSecurityListDescLen);
            builder.append("\",\n");
        }

        if (hasEncodedSecurityListDesc())
        {
            indent(builder, level);
            builder.append("\"EncodedSecurityListDesc\": \"");
            appendData(builder, encodedSecurityListDesc, encodedSecurityListDescLen);
            builder.append("\",\n");
        }

        if (hasSecurityListType())
        {
            indent(builder, level);
            builder.append("\"SecurityListType\": \"");
            builder.append(securityListType);
            builder.append("\",\n");
        }

        if (hasSecurityListTypeSource())
        {
            indent(builder, level);
            builder.append("\"SecurityListTypeSource\": \"");
            builder.append(securityListTypeSource);
            builder.append("\",\n");
        }

        if (hasSecurityReqID())
        {
            indent(builder, level);
            builder.append("\"SecurityReqID\": \"");
            builder.append(this.securityReqID(), 0, securityReqIDLength());
            builder.append("\",\n");
        }

        if (hasSecurityResponseID())
        {
            indent(builder, level);
            builder.append("\"SecurityResponseID\": \"");
            builder.append(this.securityResponseID(), 0, securityResponseIDLength());
            builder.append("\",\n");
        }

        if (hasSecurityRequestResult())
        {
            indent(builder, level);
            builder.append("\"SecurityRequestResult\": \"");
            builder.append(securityRequestResult);
            builder.append("\",\n");
        }

        if (hasTotNoRelatedSym())
        {
            indent(builder, level);
            builder.append("\"TotNoRelatedSym\": \"");
            builder.append(totNoRelatedSym);
            builder.append("\",\n");
        }

        if (hasClearingBusinessDate())
        {
            indent(builder, level);
            builder.append("\"ClearingBusinessDate\": \"");
            appendData(builder, clearingBusinessDate, clearingBusinessDateLength);
            builder.append("\",\n");
        }

        if (hasSecurityUpdateAction())
        {
            indent(builder, level);
            builder.append("\"SecurityUpdateAction\": \"");
            builder.append(securityUpdateAction);
            builder.append("\",\n");
        }

        if (hasCorporateAction())
        {
            indent(builder, level);
            builder.append("\"CorporateAction\": \"");
            builder.append(this.corporateAction(), 0, corporateActionLength());
            builder.append("\",\n");
        }

        if (hasMarketID())
        {
            indent(builder, level);
            builder.append("\"MarketID\": \"");
            builder.append(this.marketID(), 0, marketIDLength());
            builder.append("\",\n");
        }

        if (hasMarketSegmentID())
        {
            indent(builder, level);
            builder.append("\"MarketSegmentID\": \"");
            builder.append(this.marketSegmentID(), 0, marketSegmentIDLength());
            builder.append("\",\n");
        }

        if (hasTransactTime())
        {
            indent(builder, level);
            builder.append("\"TransactTime\": \"");
            appendData(builder, transactTime, transactTimeLength);
            builder.append("\",\n");
        }

        if (hasLastFragment())
        {
            indent(builder, level);
            builder.append("\"LastFragment\": \"");
            builder.append(lastFragment);
            builder.append("\",\n");
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
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public SecurityListUpdateReportEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((SecurityListUpdateReportEncoder)encoder);
    }

    public SecurityListUpdateReportEncoder toEncoder(final SecurityListUpdateReportEncoder encoder)
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


        if (hasSecurityReportID())
        {
            encoder.securityReportID(this.securityReportID());
        }

        if (hasSecurityListID())
        {
            encoder.securityListID(this.securityListID(), 0, securityListIDLength());
        }

        if (hasSecurityListRefID())
        {
            encoder.securityListRefID(this.securityListRefID(), 0, securityListRefIDLength());
        }

        if (hasSecurityListDesc())
        {
            encoder.securityListDesc(this.securityListDesc(), 0, securityListDescLength());
        }

        if (hasEncodedSecurityListDescLen())
        {
            encoder.encodedSecurityListDescLen(this.encodedSecurityListDescLen());
        }

        if (hasEncodedSecurityListDesc())
        {
            encoder.encodedSecurityListDescAsCopy(this.encodedSecurityListDesc(), 0, encodedSecurityListDescLen());
            encoder.encodedSecurityListDescLen(this.encodedSecurityListDescLen());
        }

        if (hasSecurityListType())
        {
            encoder.securityListType(this.securityListType());
        }

        if (hasSecurityListTypeSource())
        {
            encoder.securityListTypeSource(this.securityListTypeSource());
        }

        if (hasSecurityReqID())
        {
            encoder.securityReqID(this.securityReqID(), 0, securityReqIDLength());
        }

        if (hasSecurityResponseID())
        {
            encoder.securityResponseID(this.securityResponseID(), 0, securityResponseIDLength());
        }

        if (hasSecurityRequestResult())
        {
            encoder.securityRequestResult(this.securityRequestResult());
        }

        if (hasTotNoRelatedSym())
        {
            encoder.totNoRelatedSym(this.totNoRelatedSym());
        }

        if (hasClearingBusinessDate())
        {
            encoder.clearingBusinessDateAsCopy(this.clearingBusinessDate(), 0, clearingBusinessDateLength());
        }

        if (hasSecurityUpdateAction())
        {
            encoder.securityUpdateAction(this.securityUpdateAction());
        }

        if (hasCorporateAction())
        {
            encoder.corporateAction(this.corporateAction(), 0, corporateActionLength());
        }

        if (hasMarketID())
        {
            encoder.marketID(this.marketID(), 0, marketIDLength());
        }

        if (hasMarketSegmentID())
        {
            encoder.marketSegmentID(this.marketSegmentID(), 0, marketSegmentIDLength());
        }

        if (hasTransactTime())
        {
            encoder.transactTimeAsCopy(this.transactTime(), 0, transactTimeLength());
        }

        if (hasLastFragment())
        {
            encoder.lastFragment(this.lastFragment());
        }


        final SecLstUpdRelSymGrpEncoder secLstUpdRelSymGrp = encoder.secLstUpdRelSymGrp();        if (hasNoRelatedSymGroupCounter)
        {
            final int size = this.noRelatedSymGroupCounter;
            RelatedSymGroupDecoder relatedSymGroup = this.relatedSymGroup;
            RelatedSymGroupEncoder relatedSymGroupEncoder = secLstUpdRelSymGrp.relatedSymGroup(size);
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

        return encoder;
    }

}
