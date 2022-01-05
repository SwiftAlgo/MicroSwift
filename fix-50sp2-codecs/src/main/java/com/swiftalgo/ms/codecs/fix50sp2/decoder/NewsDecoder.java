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
import com.swiftalgo.ms.codecs.fix50sp2.builder.NewsEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.ApplicationSequenceControlEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.NewsRefGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.NewsRefGrpEncoder.NewsRefIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.RoutingGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.RoutingGrpEncoder.RoutingIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.InstrmtGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.InstrmtGrpEncoder.RelatedSymGroupEncoder;
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
import com.swiftalgo.ms.codecs.fix50sp2.builder.InstrmtLegGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.InstrmtLegGrpEncoder.LegsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.InstrumentLegEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.LegSecAltIDGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.LegSecAltIDGrpEncoder.LegSecurityAltIDGroupEncoder;
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
import com.swiftalgo.ms.codecs.fix50sp2.builder.LinesOfTextGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.LinesOfTextGrpEncoder.LinesOfTextGroupEncoder;


public class NewsDecoder extends CommonDecoderImpl implements ApplicationSequenceControlDecoder, NewsRefGrpDecoder, RoutingGrpDecoder, InstrmtGrpDecoder, InstrmtLegGrpDecoder, UndInstrmtGrpDecoder, LinesOfTextGrpDecoder, MessageDecoder
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(4);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            REQUIRED_FIELDS.add(Constants.HEADLINE);
            REQUIRED_FIELDS.add(Constants.NO_LINES_OF_TEXT);
        }
    }

    public final IntHashSet GROUP_FIELDS = new IntHashSet(34);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            GROUP_FIELDS.add(Constants.APPL_ID);
            GROUP_FIELDS.add(Constants.APPL_SEQ_NUM);
            GROUP_FIELDS.add(Constants.APPL_LAST_SEQ_NUM);
            GROUP_FIELDS.add(Constants.APPL_RESEND_FLAG);
            GROUP_FIELDS.add(Constants.NEWS_ID);
            GROUP_FIELDS.add(Constants.NEWS_CATEGORY);
            GROUP_FIELDS.add(Constants.LANGUAGE_CODE);
            GROUP_FIELDS.add(Constants.ORIG_TIME);
            GROUP_FIELDS.add(Constants.URGENCY);
            GROUP_FIELDS.add(Constants.HEADLINE);
            GROUP_FIELDS.add(Constants.ENCODED_HEADLINE_LEN);
            GROUP_FIELDS.add(Constants.ENCODED_HEADLINE);
            GROUP_FIELDS.add(Constants.MARKET_ID);
            GROUP_FIELDS.add(Constants.MARKET_SEGMENT_ID);
            GROUP_FIELDS.add(Constants.U_R_L_LINK);
            GROUP_FIELDS.add(Constants.RAW_DATA_LENGTH);
            GROUP_FIELDS.add(Constants.RAW_DATA);
        }
    }

    private final IntHashSet alreadyVisitedFields = new IntHashSet(34);

    private final IntHashSet unknownFields = new IntHashSet(10);

    private final IntHashSet missingRequiredFields = new IntHashSet(4);

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
        if (hasNewsCategory)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !NewsCategory.isValid(newsCategory()))
        {
            invalidTagId = 1473;
            rejectReason = 5;
            return false;
        }
        }

        if (hasUrgency)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !Urgency.isValid(urgency()))
        {
            invalidTagId = 61;
            rejectReason = 5;
            return false;
        }
        }
        if (hasNoNewsRefIDsGroupCounter)
        {
            {
                int count = 0;
                final NewsRefIDsGroupIterator iterator = newsRefIDsGroupIterator.iterator();
                for (final NewsRefIDsGroupDecoder group : iterator)
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
                    invalidTagId = 1475;
                    rejectReason = 16;
                    return false;
                }
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

        {
            int count = 0;
            final LinesOfTextGroupIterator iterator = linesOfTextGroupIterator.iterator();
            for (final LinesOfTextGroupDecoder group : iterator)
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
                invalidTagId = 33;
                rejectReason = 16;
                return false;
            }
        }
        return true;
    }

    public static final long MESSAGE_TYPE = 66L;

    public static final String MESSAGE_TYPE_AS_STRING = "B";

    public static final char[] MESSAGE_TYPE_CHARS = MESSAGE_TYPE_AS_STRING.toCharArray();

    public static final byte[] MESSAGE_TYPE_BYTES = MESSAGE_TYPE_AS_STRING.getBytes(US_ASCII);

    public final IntHashSet messageFields = new IntHashSet(628);

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
        messageFields.add(Constants.NEWS_ID);
        messageFields.add(Constants.NO_NEWS_REF_IDS);
        messageFields.add(Constants.NEWS_REF_ID);
        messageFields.add(Constants.NEWS_REF_TYPE);
        messageFields.add(Constants.NEWS_CATEGORY);
        messageFields.add(Constants.LANGUAGE_CODE);
        messageFields.add(Constants.ORIG_TIME);
        messageFields.add(Constants.URGENCY);
        messageFields.add(Constants.HEADLINE);
        messageFields.add(Constants.ENCODED_HEADLINE_LEN);
        messageFields.add(Constants.ENCODED_HEADLINE);
        messageFields.add(Constants.NO_ROUTING_IDS);
        messageFields.add(Constants.ROUTING_TYPE);
        messageFields.add(Constants.ROUTING_ID);
        messageFields.add(Constants.MARKET_ID);
        messageFields.add(Constants.MARKET_SEGMENT_ID);
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
        messageFields.add(Constants.NO_LINES_OF_TEXT);
        messageFields.add(Constants.TEXT);
        messageFields.add(Constants.ENCODED_TEXT_LEN);
        messageFields.add(Constants.ENCODED_TEXT);
        messageFields.add(Constants.U_R_L_LINK);
        messageFields.add(Constants.RAW_DATA_LENGTH);
        messageFields.add(Constants.RAW_DATA);
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




    private char[] newsID = new char[1];

    private boolean hasNewsID;

    public char[] newsID()
    {
        if (!hasNewsID)
        {
            throw new IllegalArgumentException("No value for optional field: NewsID");
        }

        return newsID;
    }

    public boolean hasNewsID()
    {
        return hasNewsID;
    }


    private int newsIDOffset;

    private int newsIDLength;

    public int newsIDLength()
    {
        if (!hasNewsID)
        {
            throw new IllegalArgumentException("No value for optional field: NewsID");
        }

        return newsIDLength;
    }

    public String newsIDAsString()
    {
        return hasNewsID ? new String(newsID, 0, newsIDLength) : null;
    }

    public void newsID(final AsciiSequenceView view)
    {
        if (!hasNewsID)
        {
            throw new IllegalArgumentException("No value for optional field: NewsID");
        }

        view.wrap(buffer, newsIDOffset, newsIDLength);
    }




    private NewsRefIDsGroupDecoder newsRefIDsGroup = null;
    public NewsRefIDsGroupDecoder newsRefIDsGroup()
    {
        return newsRefIDsGroup;
    }

    private int noNewsRefIDsGroupCounter = MISSING_INT;

    private boolean hasNoNewsRefIDsGroupCounter;

    public int noNewsRefIDsGroupCounter()
    {
        if (!hasNoNewsRefIDsGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoNewsRefIDsGroupCounter");
        }

        return noNewsRefIDsGroupCounter;
    }

    public boolean hasNoNewsRefIDsGroupCounter()
    {
        return hasNoNewsRefIDsGroupCounter;
    }




    private NewsRefIDsGroupIterator newsRefIDsGroupIterator = new NewsRefIDsGroupIterator(this);
    public NewsRefIDsGroupIterator newsRefIDsGroupIterator()
    {
        return newsRefIDsGroupIterator.iterator();
    }


    private int newsCategory = MISSING_INT;

    private boolean hasNewsCategory;

    public int newsCategory()
    {
        if (!hasNewsCategory)
        {
            throw new IllegalArgumentException("No value for optional field: NewsCategory");
        }

        return newsCategory;
    }

    public boolean hasNewsCategory()
    {
        return hasNewsCategory;
    }



    private final CharArrayWrapper newsCategoryWrapper = new CharArrayWrapper();
    public NewsCategory newsCategoryAsEnum()
    {
        if (!hasNewsCategory)
 return NewsCategory.NULL_VAL;
        return NewsCategory.decode(newsCategory);
    }

    private char[] languageCode = new char[1];

    private boolean hasLanguageCode;

    public char[] languageCode()
    {
        if (!hasLanguageCode)
        {
            throw new IllegalArgumentException("No value for optional field: LanguageCode");
        }

        return languageCode;
    }

    public boolean hasLanguageCode()
    {
        return hasLanguageCode;
    }


    private int languageCodeOffset;

    private int languageCodeLength;

    public int languageCodeLength()
    {
        if (!hasLanguageCode)
        {
            throw new IllegalArgumentException("No value for optional field: LanguageCode");
        }

        return languageCodeLength;
    }

    public String languageCodeAsString()
    {
        return hasLanguageCode ? new String(languageCode, 0, languageCodeLength) : null;
    }

    public void languageCode(final AsciiSequenceView view)
    {
        if (!hasLanguageCode)
        {
            throw new IllegalArgumentException("No value for optional field: LanguageCode");
        }

        view.wrap(buffer, languageCodeOffset, languageCodeLength);
    }


    private byte[] origTime = new byte[24];

    private boolean hasOrigTime;

    public byte[] origTime()
    {
        if (!hasOrigTime)
        {
            throw new IllegalArgumentException("No value for optional field: OrigTime");
        }

        return origTime;
    }

    public boolean hasOrigTime()
    {
        return hasOrigTime;
    }


    private int origTimeOffset;

    private int origTimeLength;

    public int origTimeLength()
    {
        if (!hasOrigTime)
        {
            throw new IllegalArgumentException("No value for optional field: OrigTime");
        }

        return origTimeLength;
    }

    public String origTimeAsString()
    {
        return hasOrigTime ? new String(origTime, 0, origTimeLength) : null;
    }

    public void origTime(final AsciiSequenceView view)
    {
        if (!hasOrigTime)
        {
            throw new IllegalArgumentException("No value for optional field: OrigTime");
        }

        view.wrap(buffer, origTimeOffset, origTimeLength);
    }


    private char urgency = MISSING_CHAR;

    private boolean hasUrgency;

    public char urgency()
    {
        if (!hasUrgency)
        {
            throw new IllegalArgumentException("No value for optional field: Urgency");
        }

        return urgency;
    }

    public boolean hasUrgency()
    {
        return hasUrgency;
    }



    private final CharArrayWrapper urgencyWrapper = new CharArrayWrapper();
    public Urgency urgencyAsEnum()
    {
        if (!hasUrgency)
 return Urgency.NULL_VAL;
        return Urgency.decode(urgency);
    }

    private char[] headline = new char[1];

    public char[] headline()
    {
        return headline;
    }


    private int headlineOffset;

    private int headlineLength;

    public int headlineLength()
    {
        return headlineLength;
    }

    public String headlineAsString()
    {
        return new String(headline, 0, headlineLength);
    }

    public void headline(final AsciiSequenceView view)
    {
        view.wrap(buffer, headlineOffset, headlineLength);
    }


    private int encodedHeadlineLen = MISSING_INT;

    private boolean hasEncodedHeadlineLen;

    public int encodedHeadlineLen()
    {
        if (!hasEncodedHeadlineLen)
        {
            throw new IllegalArgumentException("No value for optional field: EncodedHeadlineLen");
        }

        return encodedHeadlineLen;
    }

    public boolean hasEncodedHeadlineLen()
    {
        return hasEncodedHeadlineLen;
    }



    private byte[] encodedHeadline = new byte[1];

    private boolean hasEncodedHeadline;

    public byte[] encodedHeadline()
    {
        if (!hasEncodedHeadline)
        {
            throw new IllegalArgumentException("No value for optional field: EncodedHeadline");
        }

        return encodedHeadline;
    }

    public boolean hasEncodedHeadline()
    {
        return hasEncodedHeadline;
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




    private LinesOfTextGroupDecoder linesOfTextGroup = null;
    public LinesOfTextGroupDecoder linesOfTextGroup()
    {
        return linesOfTextGroup;
    }

    private int noLinesOfTextGroupCounter = MISSING_INT;

    private boolean hasNoLinesOfTextGroupCounter;

    public int noLinesOfTextGroupCounter()
    {
        if (!hasNoLinesOfTextGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoLinesOfTextGroupCounter");
        }

        return noLinesOfTextGroupCounter;
    }

    public boolean hasNoLinesOfTextGroupCounter()
    {
        return hasNoLinesOfTextGroupCounter;
    }




    private LinesOfTextGroupIterator linesOfTextGroupIterator = new LinesOfTextGroupIterator(this);
    public LinesOfTextGroupIterator linesOfTextGroupIterator()
    {
        return linesOfTextGroupIterator.iterator();
    }


    private char[] uRLLink = new char[1];

    private boolean hasURLLink;

    public char[] uRLLink()
    {
        if (!hasURLLink)
        {
            throw new IllegalArgumentException("No value for optional field: URLLink");
        }

        return uRLLink;
    }

    public boolean hasURLLink()
    {
        return hasURLLink;
    }


    private int uRLLinkOffset;

    private int uRLLinkLength;

    public int uRLLinkLength()
    {
        if (!hasURLLink)
        {
            throw new IllegalArgumentException("No value for optional field: URLLink");
        }

        return uRLLinkLength;
    }

    public String uRLLinkAsString()
    {
        return hasURLLink ? new String(uRLLink, 0, uRLLinkLength) : null;
    }

    public void uRLLink(final AsciiSequenceView view)
    {
        if (!hasURLLink)
        {
            throw new IllegalArgumentException("No value for optional field: URLLink");
        }

        view.wrap(buffer, uRLLinkOffset, uRLLinkLength);
    }


    private int rawDataLength = MISSING_INT;

    private boolean hasRawDataLength;

    public int rawDataLength()
    {
        if (!hasRawDataLength)
        {
            throw new IllegalArgumentException("No value for optional field: RawDataLength");
        }

        return rawDataLength;
    }

    public boolean hasRawDataLength()
    {
        return hasRawDataLength;
    }



    private byte[] rawData = new byte[1];

    private boolean hasRawData;

    public byte[] rawData()
    {
        if (!hasRawData)
        {
            throw new IllegalArgumentException("No value for optional field: RawData");
        }

        return rawData;
    }

    public boolean hasRawData()
    {
        return hasRawData;
    }



    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode News
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


            case Constants.NEWS_ID:
                hasNewsID = true;
                newsID = buffer.getChars(newsID, valueOffset, valueLength);
                newsIDOffset = valueOffset;
                newsIDLength = valueLength;
                break;

            case Constants.NO_NEWS_REF_IDS:
                hasNoNewsRefIDsGroupCounter = true;
                noNewsRefIDsGroupCounter = getInt(buffer, valueOffset, endOfField, 1475, CODEC_VALIDATION_ENABLED);
                if (newsRefIDsGroup == null)
                {
                    newsRefIDsGroup = new NewsRefIDsGroupDecoder(trailer, messageFields);
                }
                NewsRefIDsGroupDecoder newsRefIDsGroupCurrent = newsRefIDsGroup;
                position = endOfField + 1;
                final int noNewsRefIDsGroupCounter = this.noNewsRefIDsGroupCounter;
                for (int i = 0; i < noNewsRefIDsGroupCounter && position < end; i++)
                {
                    if (newsRefIDsGroupCurrent != null)
                    {
                        position += newsRefIDsGroupCurrent.decode(buffer, position, end - position);
                        newsRefIDsGroupCurrent = newsRefIDsGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (newsRefIDsGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;


            case Constants.NEWS_CATEGORY:
                hasNewsCategory = true;
                newsCategory = getInt(buffer, valueOffset, endOfField, 1473, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.LANGUAGE_CODE:
                hasLanguageCode = true;
                languageCode = buffer.getChars(languageCode, valueOffset, valueLength);
                languageCodeOffset = valueOffset;
                languageCodeLength = valueLength;
                break;

            case Constants.ORIG_TIME:
                hasOrigTime = true;
                origTime = buffer.getBytes(origTime, valueOffset, valueLength);
                origTimeOffset = valueOffset;
                origTimeLength = valueLength;
                break;

            case Constants.URGENCY:
                hasUrgency = true;
                urgency = buffer.getChar(valueOffset);
                break;

            case Constants.HEADLINE:
                headline = buffer.getChars(headline, valueOffset, valueLength);
                headlineOffset = valueOffset;
                headlineLength = valueLength;
                break;

            case Constants.ENCODED_HEADLINE_LEN:
                hasEncodedHeadlineLen = true;
                encodedHeadlineLen = getInt(buffer, valueOffset, endOfField, 358, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.ENCODED_HEADLINE:
                hasEncodedHeadline = true;
                encodedHeadline = buffer.getBytes(encodedHeadline, valueOffset, encodedHeadlineLen);
                endOfField = valueOffset + encodedHeadlineLen;
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


            case Constants.NO_LEGS:
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


            case Constants.NO_UNDERLYINGS:
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


            case Constants.NO_LINES_OF_TEXT:
                hasNoLinesOfTextGroupCounter = true;
                noLinesOfTextGroupCounter = getInt(buffer, valueOffset, endOfField, 33, CODEC_VALIDATION_ENABLED);
                if (linesOfTextGroup == null)
                {
                    linesOfTextGroup = new LinesOfTextGroupDecoder(trailer, messageFields);
                }
                LinesOfTextGroupDecoder linesOfTextGroupCurrent = linesOfTextGroup;
                position = endOfField + 1;
                final int noLinesOfTextGroupCounter = this.noLinesOfTextGroupCounter;
                for (int i = 0; i < noLinesOfTextGroupCounter && position < end; i++)
                {
                    if (linesOfTextGroupCurrent != null)
                    {
                        position += linesOfTextGroupCurrent.decode(buffer, position, end - position);
                        linesOfTextGroupCurrent = linesOfTextGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (linesOfTextGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;


            case Constants.U_R_L_LINK:
                hasURLLink = true;
                uRLLink = buffer.getChars(uRLLink, valueOffset, valueLength);
                uRLLinkOffset = valueOffset;
                uRLLinkLength = valueLength;
                break;

            case Constants.RAW_DATA_LENGTH:
                hasRawDataLength = true;
                rawDataLength = getInt(buffer, valueOffset, endOfField, 95, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.RAW_DATA:
                hasRawData = true;
                rawData = buffer.getBytes(rawData, valueOffset, rawDataLength);
                endOfField = valueOffset + rawDataLength;
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
        this.resetNewsID();
        this.resetNewsCategory();
        this.resetLanguageCode();
        this.resetOrigTime();
        this.resetUrgency();
        this.resetHeadline();
        this.resetEncodedHeadlineLen();
        this.resetEncodedHeadline();
        this.resetMarketID();
        this.resetMarketSegmentID();
        this.resetURLLink();
        this.resetRawDataLength();
        this.resetRawData();
        this.resetApplID();
        this.resetApplSeqNum();
        this.resetApplLastSeqNum();
        this.resetApplResendFlag();
        this.resetNewsRefIDsGroup();
        this.resetRoutingIDsGroup();
        this.resetRelatedSymGroup();
        this.resetLegsGroup();
        this.resetUnderlyingsGroup();
        this.resetLinesOfTextGroup();
    }

    public void resetNewsID()
    {
        hasNewsID = false;
    }

    public void resetNewsCategory()
    {
        hasNewsCategory = false;
    }

    public void resetLanguageCode()
    {
        hasLanguageCode = false;
    }

    public void resetOrigTime()
    {
        hasOrigTime = false;
    }

    public void resetUrgency()
    {
        hasUrgency = false;
    }

    public void resetHeadline()
    {
        headlineOffset = 0;
        headlineLength = 0;
    }

    public void resetEncodedHeadlineLen()
    {
        hasEncodedHeadlineLen = false;
    }

    public void resetEncodedHeadline()
    {
        hasEncodedHeadline = false;
    }

    public void resetMarketID()
    {
        hasMarketID = false;
    }

    public void resetMarketSegmentID()
    {
        hasMarketSegmentID = false;
    }

    public void resetURLLink()
    {
        hasURLLink = false;
    }

    public void resetRawDataLength()
    {
        hasRawDataLength = false;
    }

    public void resetRawData()
    {
        hasRawData = false;
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

    public void resetNewsRefIDsGroup()
    {
        for (final NewsRefIDsGroupDecoder newsRefIDsGroupDecoder : newsRefIDsGroupIterator.iterator())
        {
            newsRefIDsGroupDecoder.reset();
            if (newsRefIDsGroupDecoder.next() == null)
            {
                break;
            }
        }
        noNewsRefIDsGroupCounter = MISSING_INT;
        hasNoNewsRefIDsGroupCounter = false;
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

    public void resetLinesOfTextGroup()
    {
        for (final LinesOfTextGroupDecoder linesOfTextGroupDecoder : linesOfTextGroupIterator.iterator())
        {
            linesOfTextGroupDecoder.reset();
            if (linesOfTextGroupDecoder.next() == null)
            {
                break;
            }
        }
        noLinesOfTextGroupCounter = MISSING_INT;
        hasNoLinesOfTextGroupCounter = false;
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
        builder.append("\"MessageName\": \"News\",\n");
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

        if (hasNewsID())
        {
            indent(builder, level);
            builder.append("\"NewsID\": \"");
            builder.append(this.newsID(), 0, newsIDLength());
            builder.append("\",\n");
        }

    if (hasNoNewsRefIDsGroupCounter)
    {
        indent(builder, level);
        builder.append("\"NewsRefIDsGroup\": [\n");
        NewsRefIDsGroupDecoder newsRefIDsGroup = this.newsRefIDsGroup;
        for (int i = 0, size = this.noNewsRefIDsGroupCounter; i < size; i++)
        {
            indent(builder, level);
            newsRefIDsGroup.appendTo(builder, level + 1);            if (newsRefIDsGroup.next() != null)
            {
                builder.append(',');
            }
            builder.append('\n');
            newsRefIDsGroup = newsRefIDsGroup.next();        }
        indent(builder, level);
        builder.append("],\n");
    }

        if (hasNewsCategory())
        {
            indent(builder, level);
            builder.append("\"NewsCategory\": \"");
            builder.append(newsCategory);
            builder.append("\",\n");
        }

        if (hasLanguageCode())
        {
            indent(builder, level);
            builder.append("\"LanguageCode\": \"");
            builder.append(this.languageCode(), 0, languageCodeLength());
            builder.append("\",\n");
        }

        if (hasOrigTime())
        {
            indent(builder, level);
            builder.append("\"OrigTime\": \"");
            appendData(builder, origTime, origTimeLength);
            builder.append("\",\n");
        }

        if (hasUrgency())
        {
            indent(builder, level);
            builder.append("\"Urgency\": \"");
            builder.append(urgency);
            builder.append("\",\n");
        }

        indent(builder, level);
        builder.append("\"Headline\": \"");
        builder.append(this.headline(), 0, headlineLength());
        builder.append("\",\n");

        if (hasEncodedHeadlineLen())
        {
            indent(builder, level);
            builder.append("\"EncodedHeadlineLen\": \"");
            builder.append(encodedHeadlineLen);
            builder.append("\",\n");
        }

        if (hasEncodedHeadline())
        {
            indent(builder, level);
            builder.append("\"EncodedHeadline\": \"");
            appendData(builder, encodedHeadline, encodedHeadlineLen);
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

    if (hasNoLegsGroupCounter)
    {
        indent(builder, level);
        builder.append("\"LegsGroup\": [\n");
        LegsGroupDecoder legsGroup = this.legsGroup;
        for (int i = 0, size = this.noLegsGroupCounter; i < size; i++)
        {
            indent(builder, level);
            legsGroup.appendTo(builder, level + 1);            if (legsGroup.next() != null)
            {
                builder.append(',');
            }
            builder.append('\n');
            legsGroup = legsGroup.next();        }
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
            underlyingsGroup.appendTo(builder, level + 1);            if (underlyingsGroup.next() != null)
            {
                builder.append(',');
            }
            builder.append('\n');
            underlyingsGroup = underlyingsGroup.next();        }
        indent(builder, level);
        builder.append("],\n");
    }

    if (hasNoLinesOfTextGroupCounter)
    {
        indent(builder, level);
        builder.append("\"LinesOfTextGroup\": [\n");
        LinesOfTextGroupDecoder linesOfTextGroup = this.linesOfTextGroup;
        for (int i = 0, size = this.noLinesOfTextGroupCounter; i < size; i++)
        {
            indent(builder, level);
            linesOfTextGroup.appendTo(builder, level + 1);            if (linesOfTextGroup.next() != null)
            {
                builder.append(',');
            }
            builder.append('\n');
            linesOfTextGroup = linesOfTextGroup.next();        }
        indent(builder, level);
        builder.append("],\n");
    }

        if (hasURLLink())
        {
            indent(builder, level);
            builder.append("\"URLLink\": \"");
            builder.append(this.uRLLink(), 0, uRLLinkLength());
            builder.append("\",\n");
        }

        if (hasRawDataLength())
        {
            indent(builder, level);
            builder.append("\"RawDataLength\": \"");
            builder.append(rawDataLength);
            builder.append("\",\n");
        }

        if (hasRawData())
        {
            indent(builder, level);
            builder.append("\"RawData\": \"");
            appendData(builder, rawData, rawDataLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public NewsEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((NewsEncoder)encoder);
    }

    public NewsEncoder toEncoder(final NewsEncoder encoder)
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


        if (hasNewsID())
        {
            encoder.newsID(this.newsID(), 0, newsIDLength());
        }


        final NewsRefGrpEncoder newsRefGrp = encoder.newsRefGrp();        if (hasNoNewsRefIDsGroupCounter)
        {
            final int size = this.noNewsRefIDsGroupCounter;
            NewsRefIDsGroupDecoder newsRefIDsGroup = this.newsRefIDsGroup;
            NewsRefIDsGroupEncoder newsRefIDsGroupEncoder = newsRefGrp.newsRefIDsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (newsRefIDsGroup != null)
                {
                    newsRefIDsGroup.toEncoder(newsRefIDsGroupEncoder);
                    newsRefIDsGroup = newsRefIDsGroup.next();
                    newsRefIDsGroupEncoder = newsRefIDsGroupEncoder.next();
                }
            }
        }


        if (hasNewsCategory())
        {
            encoder.newsCategory(this.newsCategory());
        }

        if (hasLanguageCode())
        {
            encoder.languageCode(this.languageCode(), 0, languageCodeLength());
        }

        if (hasOrigTime())
        {
            encoder.origTimeAsCopy(this.origTime(), 0, origTimeLength());
        }

        if (hasUrgency())
        {
            encoder.urgency(this.urgency());
        }

        encoder.headline(this.headline(), 0, headlineLength());
        if (hasEncodedHeadlineLen())
        {
            encoder.encodedHeadlineLen(this.encodedHeadlineLen());
        }

        if (hasEncodedHeadline())
        {
            encoder.encodedHeadlineAsCopy(this.encodedHeadline(), 0, encodedHeadlineLen());
            encoder.encodedHeadlineLen(this.encodedHeadlineLen());
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


        if (hasMarketID())
        {
            encoder.marketID(this.marketID(), 0, marketIDLength());
        }

        if (hasMarketSegmentID())
        {
            encoder.marketSegmentID(this.marketSegmentID(), 0, marketSegmentIDLength());
        }


        final InstrmtGrpEncoder instrmtGrp = encoder.instrmtGrp();        if (hasNoRelatedSymGroupCounter)
        {
            final int size = this.noRelatedSymGroupCounter;
            RelatedSymGroupDecoder relatedSymGroup = this.relatedSymGroup;
            RelatedSymGroupEncoder relatedSymGroupEncoder = instrmtGrp.relatedSymGroup(size);
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



        final LinesOfTextGrpEncoder linesOfTextGrp = encoder.linesOfTextGrp();        if (hasNoLinesOfTextGroupCounter)
        {
            final int size = this.noLinesOfTextGroupCounter;
            LinesOfTextGroupDecoder linesOfTextGroup = this.linesOfTextGroup;
            LinesOfTextGroupEncoder linesOfTextGroupEncoder = linesOfTextGrp.linesOfTextGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (linesOfTextGroup != null)
                {
                    linesOfTextGroup.toEncoder(linesOfTextGroupEncoder);
                    linesOfTextGroup = linesOfTextGroup.next();
                    linesOfTextGroupEncoder = linesOfTextGroupEncoder.next();
                }
            }
        }


        if (hasURLLink())
        {
            encoder.uRLLink(this.uRLLink(), 0, uRLLinkLength());
        }

        if (hasRawDataLength())
        {
            encoder.rawDataLength(this.rawDataLength());
        }

        if (hasRawData())
        {
            encoder.rawDataAsCopy(this.rawData(), 0, rawDataLength());
            encoder.rawDataLength(this.rawDataLength());
        }
        return encoder;
    }

}
