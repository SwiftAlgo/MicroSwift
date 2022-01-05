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
import com.swiftalgo.ms.codecs.fix50sp2.builder.DerivativeSecurityListRequestEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.UnderlyingInstrumentEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.UndSecAltIDGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.UndSecAltIDGrpEncoder.UnderlyingSecurityAltIDGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.UnderlyingStipulationsEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.UnderlyingStipulationsEncoder.UnderlyingStipsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.UndlyInstrumentPartiesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.UndlyInstrumentPartiesEncoder.UndlyInstrumentPartiesGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.UndlyInstrumentPtysSubGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.UndlyInstrumentPtysSubGrpEncoder.UndlyInstrumentPartySubIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.DerivativeInstrumentEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.DerivativeSecurityAltIDGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.DerivativeSecurityAltIDGrpEncoder.DerivativeSecurityAltIDGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.DerivativeSecurityXMLEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.DerivativeEventsGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.DerivativeEventsGrpEncoder.DerivativeEventsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.DerivativeInstrumentPartiesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.DerivativeInstrumentPartiesEncoder.DerivativeInstrumentPartiesGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.DerivativeInstrumentPartySubIDsGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.DerivativeInstrumentPartySubIDsGrpEncoder.DerivativeInstrumentPartySubIDsGroupEncoder;


public class DerivativeSecurityListRequestDecoder extends CommonDecoderImpl implements UnderlyingInstrumentDecoder, DerivativeInstrumentDecoder, MessageDecoder
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(4);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            REQUIRED_FIELDS.add(Constants.SECURITY_REQ_ID);
            REQUIRED_FIELDS.add(Constants.SECURITY_LIST_REQUEST_TYPE);
        }
    }

    public final IntHashSet GROUP_FIELDS = new IntHashSet(280);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            GROUP_FIELDS.add(Constants.SECURITY_REQ_ID);
            GROUP_FIELDS.add(Constants.SECURITY_LIST_REQUEST_TYPE);
            GROUP_FIELDS.add(Constants.MARKET_ID);
            GROUP_FIELDS.add(Constants.MARKET_SEGMENT_ID);
            GROUP_FIELDS.add(Constants.UNDERLYING_SYMBOL);
            GROUP_FIELDS.add(Constants.UNDERLYING_SYMBOL_SFX);
            GROUP_FIELDS.add(Constants.UNDERLYING_SECURITY_ID);
            GROUP_FIELDS.add(Constants.UNDERLYING_SECURITY_ID_SOURCE);
            GROUP_FIELDS.add(Constants.UNDERLYING_PRODUCT);
            GROUP_FIELDS.add(Constants.UNDERLYING_C_F_I_CODE);
            GROUP_FIELDS.add(Constants.UNDERLYING_SECURITY_TYPE);
            GROUP_FIELDS.add(Constants.UNDERLYING_SECURITY_SUB_TYPE);
            GROUP_FIELDS.add(Constants.UNDERLYING_MATURITY_MONTH_YEAR);
            GROUP_FIELDS.add(Constants.UNDERLYING_MATURITY_DATE);
            GROUP_FIELDS.add(Constants.UNDERLYING_MATURITY_TIME);
            GROUP_FIELDS.add(Constants.UNDERLYING_COUPON_PAYMENT_DATE);
            GROUP_FIELDS.add(Constants.UNDERLYING_RESTRUCTURING_TYPE);
            GROUP_FIELDS.add(Constants.UNDERLYING_SENIORITY);
            GROUP_FIELDS.add(Constants.UNDERLYING_NOTIONAL_PERCENTAGE_OUTSTANDING);
            GROUP_FIELDS.add(Constants.UNDERLYING_ORIGINAL_NOTIONAL_PERCENTAGE_OUTSTANDING);
            GROUP_FIELDS.add(Constants.UNDERLYING_ATTACHMENT_POINT);
            GROUP_FIELDS.add(Constants.UNDERLYING_DETACHMENT_POINT);
            GROUP_FIELDS.add(Constants.UNDERLYING_ISSUE_DATE);
            GROUP_FIELDS.add(Constants.UNDERLYING_REPO_COLLATERAL_SECURITY_TYPE);
            GROUP_FIELDS.add(Constants.UNDERLYING_REPURCHASE_TERM);
            GROUP_FIELDS.add(Constants.UNDERLYING_REPURCHASE_RATE);
            GROUP_FIELDS.add(Constants.UNDERLYING_FACTOR);
            GROUP_FIELDS.add(Constants.UNDERLYING_CREDIT_RATING);
            GROUP_FIELDS.add(Constants.UNDERLYING_INSTR_REGISTRY);
            GROUP_FIELDS.add(Constants.UNDERLYING_COUNTRY_OF_ISSUE);
            GROUP_FIELDS.add(Constants.UNDERLYING_STATE_OR_PROVINCE_OF_ISSUE);
            GROUP_FIELDS.add(Constants.UNDERLYING_LOCALE_OF_ISSUE);
            GROUP_FIELDS.add(Constants.UNDERLYING_REDEMPTION_DATE);
            GROUP_FIELDS.add(Constants.UNDERLYING_STRIKE_PRICE);
            GROUP_FIELDS.add(Constants.UNDERLYING_STRIKE_CURRENCY);
            GROUP_FIELDS.add(Constants.UNDERLYING_OPT_ATTRIBUTE);
            GROUP_FIELDS.add(Constants.UNDERLYING_CONTRACT_MULTIPLIER);
            GROUP_FIELDS.add(Constants.UNDERLYING_CONTRACT_MULTIPLIER_UNIT);
            GROUP_FIELDS.add(Constants.UNDERLYING_FLOW_SCHEDULE_TYPE);
            GROUP_FIELDS.add(Constants.UNDERLYING_UNIT_OF_MEASURE);
            GROUP_FIELDS.add(Constants.UNDERLYING_UNIT_OF_MEASURE_QTY);
            GROUP_FIELDS.add(Constants.UNDERLYING_PRICE_UNIT_OF_MEASURE);
            GROUP_FIELDS.add(Constants.UNDERLYING_PRICE_UNIT_OF_MEASURE_QTY);
            GROUP_FIELDS.add(Constants.UNDERLYING_TIME_UNIT);
            GROUP_FIELDS.add(Constants.UNDERLYING_EXERCISE_STYLE);
            GROUP_FIELDS.add(Constants.UNDERLYING_COUPON_RATE);
            GROUP_FIELDS.add(Constants.UNDERLYING_SECURITY_EXCHANGE);
            GROUP_FIELDS.add(Constants.UNDERLYING_ISSUER);
            GROUP_FIELDS.add(Constants.ENCODED_UNDERLYING_ISSUER_LEN);
            GROUP_FIELDS.add(Constants.ENCODED_UNDERLYING_ISSUER);
            GROUP_FIELDS.add(Constants.UNDERLYING_SECURITY_DESC);
            GROUP_FIELDS.add(Constants.ENCODED_UNDERLYING_SECURITY_DESC_LEN);
            GROUP_FIELDS.add(Constants.ENCODED_UNDERLYING_SECURITY_DESC);
            GROUP_FIELDS.add(Constants.UNDERLYING_C_P_PROGRAM);
            GROUP_FIELDS.add(Constants.UNDERLYING_C_P_REG_TYPE);
            GROUP_FIELDS.add(Constants.UNDERLYING_ALLOCATION_PERCENT);
            GROUP_FIELDS.add(Constants.UNDERLYING_CURRENCY);
            GROUP_FIELDS.add(Constants.UNDERLYING_QTY);
            GROUP_FIELDS.add(Constants.UNDERLYING_SETTLEMENT_TYPE);
            GROUP_FIELDS.add(Constants.UNDERLYING_CASH_AMOUNT);
            GROUP_FIELDS.add(Constants.UNDERLYING_CASH_TYPE);
            GROUP_FIELDS.add(Constants.UNDERLYING_PX);
            GROUP_FIELDS.add(Constants.UNDERLYING_DIRTY_PRICE);
            GROUP_FIELDS.add(Constants.UNDERLYING_END_PRICE);
            GROUP_FIELDS.add(Constants.UNDERLYING_START_VALUE);
            GROUP_FIELDS.add(Constants.UNDERLYING_CURRENT_VALUE);
            GROUP_FIELDS.add(Constants.UNDERLYING_END_VALUE);
            GROUP_FIELDS.add(Constants.UNDERLYING_ADJUSTED_QUANTITY);
            GROUP_FIELDS.add(Constants.UNDERLYING_F_X_RATE);
            GROUP_FIELDS.add(Constants.UNDERLYING_F_X_RATE_CALC);
            GROUP_FIELDS.add(Constants.UNDERLYING_CAP_VALUE);
            GROUP_FIELDS.add(Constants.UNDERLYING_SETTL_METHOD);
            GROUP_FIELDS.add(Constants.UNDERLYING_PUT_OR_CALL);
            GROUP_FIELDS.add(Constants.DERIVATIVE_SYMBOL);
            GROUP_FIELDS.add(Constants.DERIVATIVE_SYMBOL_SFX);
            GROUP_FIELDS.add(Constants.DERIVATIVE_SECURITY_ID);
            GROUP_FIELDS.add(Constants.DERIVATIVE_SECURITY_ID_SOURCE);
            GROUP_FIELDS.add(Constants.DERIVATIVE_PRODUCT);
            GROUP_FIELDS.add(Constants.DERIVATIVE_PRODUCT_COMPLEX);
            GROUP_FIELDS.add(Constants.DERIV_FLEX_PRODUCT_ELIGIBILITY_INDICATOR);
            GROUP_FIELDS.add(Constants.DERIVATIVE_SECURITY_GROUP);
            GROUP_FIELDS.add(Constants.DERIVATIVE_C_F_I_CODE);
            GROUP_FIELDS.add(Constants.DERIVATIVE_SECURITY_TYPE);
            GROUP_FIELDS.add(Constants.DERIVATIVE_SECURITY_SUB_TYPE);
            GROUP_FIELDS.add(Constants.DERIVATIVE_MATURITY_MONTH_YEAR);
            GROUP_FIELDS.add(Constants.DERIVATIVE_MATURITY_DATE);
            GROUP_FIELDS.add(Constants.DERIVATIVE_MATURITY_TIME);
            GROUP_FIELDS.add(Constants.DERIVATIVE_SETTLE_ON_OPEN_FLAG);
            GROUP_FIELDS.add(Constants.DERIVATIVE_INSTRMT_ASSIGNMENT_METHOD);
            GROUP_FIELDS.add(Constants.DERIVATIVE_SECURITY_STATUS);
            GROUP_FIELDS.add(Constants.DERIVATIVE_ISSUE_DATE);
            GROUP_FIELDS.add(Constants.DERIVATIVE_INSTR_REGISTRY);
            GROUP_FIELDS.add(Constants.DERIVATIVE_COUNTRY_OF_ISSUE);
            GROUP_FIELDS.add(Constants.DERIVATIVE_STATE_OR_PROVINCE_OF_ISSUE);
            GROUP_FIELDS.add(Constants.DERIVATIVE_LOCALE_OF_ISSUE);
            GROUP_FIELDS.add(Constants.DERIVATIVE_STRIKE_PRICE);
            GROUP_FIELDS.add(Constants.DERIVATIVE_STRIKE_CURRENCY);
            GROUP_FIELDS.add(Constants.DERIVATIVE_STRIKE_MULTIPLIER);
            GROUP_FIELDS.add(Constants.DERIVATIVE_STRIKE_VALUE);
            GROUP_FIELDS.add(Constants.DERIVATIVE_OPT_ATTRIBUTE);
            GROUP_FIELDS.add(Constants.DERIVATIVE_CONTRACT_MULTIPLIER);
            GROUP_FIELDS.add(Constants.DERIVATIVE_CONTRACT_MULTIPLIER_UNIT);
            GROUP_FIELDS.add(Constants.DERIVATIVE_FLOW_SCHEDULE_TYPE);
            GROUP_FIELDS.add(Constants.DERIVATIVE_MIN_PRICE_INCREMENT);
            GROUP_FIELDS.add(Constants.DERIVATIVE_MIN_PRICE_INCREMENT_AMOUNT);
            GROUP_FIELDS.add(Constants.DERIVATIVE_UNIT_OF_MEASURE);
            GROUP_FIELDS.add(Constants.DERIVATIVE_UNIT_OF_MEASURE_QTY);
            GROUP_FIELDS.add(Constants.DERIVATIVE_PRICE_UNIT_OF_MEASURE);
            GROUP_FIELDS.add(Constants.DERIVATIVE_PRICE_UNIT_OF_MEASURE_QTY);
            GROUP_FIELDS.add(Constants.DERIVATIVE_SETTL_METHOD);
            GROUP_FIELDS.add(Constants.DERIVATIVE_PRICE_QUOTE_METHOD);
            GROUP_FIELDS.add(Constants.DERIVATIVE_VALUATION_METHOD);
            GROUP_FIELDS.add(Constants.DERIVATIVE_LIST_METHOD);
            GROUP_FIELDS.add(Constants.DERIVATIVE_CAP_PRICE);
            GROUP_FIELDS.add(Constants.DERIVATIVE_FLOOR_PRICE);
            GROUP_FIELDS.add(Constants.DERIVATIVE_PUT_OR_CALL);
            GROUP_FIELDS.add(Constants.DERIVATIVE_EXERCISE_STYLE);
            GROUP_FIELDS.add(Constants.DERIVATIVE_OPT_PAY_AMOUNT);
            GROUP_FIELDS.add(Constants.DERIVATIVE_TIME_UNIT);
            GROUP_FIELDS.add(Constants.DERIVATIVE_SECURITY_EXCHANGE);
            GROUP_FIELDS.add(Constants.DERIVATIVE_POSITION_LIMIT);
            GROUP_FIELDS.add(Constants.DERIVATIVE_N_T_POSITION_LIMIT);
            GROUP_FIELDS.add(Constants.DERIVATIVE_ISSUER);
            GROUP_FIELDS.add(Constants.DERIVATIVE_ENCODED_ISSUER_LEN);
            GROUP_FIELDS.add(Constants.DERIVATIVE_ENCODED_ISSUER);
            GROUP_FIELDS.add(Constants.DERIVATIVE_SECURITY_DESC);
            GROUP_FIELDS.add(Constants.DERIVATIVE_ENCODED_SECURITY_DESC_LEN);
            GROUP_FIELDS.add(Constants.DERIVATIVE_ENCODED_SECURITY_DESC);
            GROUP_FIELDS.add(Constants.DERIVATIVE_SECURITY_X_M_L_LEN);
            GROUP_FIELDS.add(Constants.DERIVATIVE_SECURITY_X_M_L);
            GROUP_FIELDS.add(Constants.DERIVATIVE_SECURITY_X_M_L_SCHEMA);
            GROUP_FIELDS.add(Constants.DERIVATIVE_CONTRACT_SETTL_MONTH);
            GROUP_FIELDS.add(Constants.SECURITY_SUB_TYPE);
            GROUP_FIELDS.add(Constants.CURRENCY);
            GROUP_FIELDS.add(Constants.TEXT);
            GROUP_FIELDS.add(Constants.ENCODED_TEXT_LEN);
            GROUP_FIELDS.add(Constants.ENCODED_TEXT);
            GROUP_FIELDS.add(Constants.TRADING_SESSION_ID);
            GROUP_FIELDS.add(Constants.TRADING_SESSION_SUB_ID);
            GROUP_FIELDS.add(Constants.SUBSCRIPTION_REQUEST_TYPE);
        }
    }

    private final IntHashSet alreadyVisitedFields = new IntHashSet(280);

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
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !SecurityListRequestType.isValid(securityListRequestType()))
        {
            invalidTagId = 559;
            rejectReason = 5;
            return false;
        }

        if (hasUnderlyingSettlementType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !UnderlyingSettlementType.isValid(underlyingSettlementType()))
        {
            invalidTagId = 975;
            rejectReason = 5;
            return false;
        }
        }

        if (hasUnderlyingCashType)
        {
        underlyingCashTypeWrapper.wrap(this.underlyingCashType(), underlyingCashTypeLength);
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !UnderlyingCashType.isValid(underlyingCashTypeWrapper))
        {
            invalidTagId = 974;
            rejectReason = 5;
            return false;
        }
        }

        if (hasUnderlyingFXRateCalc)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !UnderlyingFXRateCalc.isValid(underlyingFXRateCalc()))
        {
            invalidTagId = 1046;
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

        if (hasSubscriptionRequestType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !SubscriptionRequestType.isValid(subscriptionRequestType()))
        {
            invalidTagId = 263;
            rejectReason = 5;
            return false;
        }
        }
        if (hasNoUnderlyingSecurityAltIDGroupCounter)
        {
            {
                int count = 0;
                final UnderlyingSecurityAltIDGroupIterator iterator = underlyingSecurityAltIDGroupIterator.iterator();
                for (final UnderlyingSecurityAltIDGroupDecoder group : iterator)
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
                    invalidTagId = 457;
                    rejectReason = 16;
                    return false;
                }
            }
        }

        if (hasNoUnderlyingStipsGroupCounter)
        {
            {
                int count = 0;
                final UnderlyingStipsGroupIterator iterator = underlyingStipsGroupIterator.iterator();
                for (final UnderlyingStipsGroupDecoder group : iterator)
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
                    invalidTagId = 887;
                    rejectReason = 16;
                    return false;
                }
            }
        }

        if (hasNoUndlyInstrumentPartiesGroupCounter)
        {
            {
                int count = 0;
                final UndlyInstrumentPartiesGroupIterator iterator = undlyInstrumentPartiesGroupIterator.iterator();
                for (final UndlyInstrumentPartiesGroupDecoder group : iterator)
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
                    invalidTagId = 1058;
                    rejectReason = 16;
                    return false;
                }
            }
        }

        if (hasNoDerivativeSecurityAltIDGroupCounter)
        {
            {
                int count = 0;
                final DerivativeSecurityAltIDGroupIterator iterator = derivativeSecurityAltIDGroupIterator.iterator();
                for (final DerivativeSecurityAltIDGroupDecoder group : iterator)
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
                    invalidTagId = 1218;
                    rejectReason = 16;
                    return false;
                }
            }
        }

        if (hasNoDerivativeEventsGroupCounter)
        {
            {
                int count = 0;
                final DerivativeEventsGroupIterator iterator = derivativeEventsGroupIterator.iterator();
                for (final DerivativeEventsGroupDecoder group : iterator)
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
                    invalidTagId = 1286;
                    rejectReason = 16;
                    return false;
                }
            }
        }

        if (hasNoDerivativeInstrumentPartiesGroupCounter)
        {
            {
                int count = 0;
                final DerivativeInstrumentPartiesGroupIterator iterator = derivativeInstrumentPartiesGroupIterator.iterator();
                for (final DerivativeInstrumentPartiesGroupDecoder group : iterator)
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
                    invalidTagId = 1292;
                    rejectReason = 16;
                    return false;
                }
            }
        }
        return true;
    }

    public static final long MESSAGE_TYPE = 122L;

    public static final String MESSAGE_TYPE_AS_STRING = "z";

    public static final char[] MESSAGE_TYPE_CHARS = MESSAGE_TYPE_AS_STRING.toCharArray();

    public static final byte[] MESSAGE_TYPE_BYTES = MESSAGE_TYPE_AS_STRING.getBytes(US_ASCII);

    public final IntHashSet messageFields = new IntHashSet(402);

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
        messageFields.add(Constants.SECURITY_REQ_ID);
        messageFields.add(Constants.SECURITY_LIST_REQUEST_TYPE);
        messageFields.add(Constants.MARKET_ID);
        messageFields.add(Constants.MARKET_SEGMENT_ID);
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
        messageFields.add(Constants.DERIVATIVE_SYMBOL);
        messageFields.add(Constants.DERIVATIVE_SYMBOL_SFX);
        messageFields.add(Constants.DERIVATIVE_SECURITY_ID);
        messageFields.add(Constants.DERIVATIVE_SECURITY_ID_SOURCE);
        messageFields.add(Constants.NO_DERIVATIVE_SECURITY_ALT_ID);
        messageFields.add(Constants.DERIVATIVE_SECURITY_ALT_ID);
        messageFields.add(Constants.DERIVATIVE_SECURITY_ALT_ID_SOURCE);
        messageFields.add(Constants.DERIVATIVE_PRODUCT);
        messageFields.add(Constants.DERIVATIVE_PRODUCT_COMPLEX);
        messageFields.add(Constants.DERIV_FLEX_PRODUCT_ELIGIBILITY_INDICATOR);
        messageFields.add(Constants.DERIVATIVE_SECURITY_GROUP);
        messageFields.add(Constants.DERIVATIVE_C_F_I_CODE);
        messageFields.add(Constants.DERIVATIVE_SECURITY_TYPE);
        messageFields.add(Constants.DERIVATIVE_SECURITY_SUB_TYPE);
        messageFields.add(Constants.DERIVATIVE_MATURITY_MONTH_YEAR);
        messageFields.add(Constants.DERIVATIVE_MATURITY_DATE);
        messageFields.add(Constants.DERIVATIVE_MATURITY_TIME);
        messageFields.add(Constants.DERIVATIVE_SETTLE_ON_OPEN_FLAG);
        messageFields.add(Constants.DERIVATIVE_INSTRMT_ASSIGNMENT_METHOD);
        messageFields.add(Constants.DERIVATIVE_SECURITY_STATUS);
        messageFields.add(Constants.DERIVATIVE_ISSUE_DATE);
        messageFields.add(Constants.DERIVATIVE_INSTR_REGISTRY);
        messageFields.add(Constants.DERIVATIVE_COUNTRY_OF_ISSUE);
        messageFields.add(Constants.DERIVATIVE_STATE_OR_PROVINCE_OF_ISSUE);
        messageFields.add(Constants.DERIVATIVE_LOCALE_OF_ISSUE);
        messageFields.add(Constants.DERIVATIVE_STRIKE_PRICE);
        messageFields.add(Constants.DERIVATIVE_STRIKE_CURRENCY);
        messageFields.add(Constants.DERIVATIVE_STRIKE_MULTIPLIER);
        messageFields.add(Constants.DERIVATIVE_STRIKE_VALUE);
        messageFields.add(Constants.DERIVATIVE_OPT_ATTRIBUTE);
        messageFields.add(Constants.DERIVATIVE_CONTRACT_MULTIPLIER);
        messageFields.add(Constants.DERIVATIVE_CONTRACT_MULTIPLIER_UNIT);
        messageFields.add(Constants.DERIVATIVE_FLOW_SCHEDULE_TYPE);
        messageFields.add(Constants.DERIVATIVE_MIN_PRICE_INCREMENT);
        messageFields.add(Constants.DERIVATIVE_MIN_PRICE_INCREMENT_AMOUNT);
        messageFields.add(Constants.DERIVATIVE_UNIT_OF_MEASURE);
        messageFields.add(Constants.DERIVATIVE_UNIT_OF_MEASURE_QTY);
        messageFields.add(Constants.DERIVATIVE_PRICE_UNIT_OF_MEASURE);
        messageFields.add(Constants.DERIVATIVE_PRICE_UNIT_OF_MEASURE_QTY);
        messageFields.add(Constants.DERIVATIVE_SETTL_METHOD);
        messageFields.add(Constants.DERIVATIVE_PRICE_QUOTE_METHOD);
        messageFields.add(Constants.DERIVATIVE_VALUATION_METHOD);
        messageFields.add(Constants.DERIVATIVE_LIST_METHOD);
        messageFields.add(Constants.DERIVATIVE_CAP_PRICE);
        messageFields.add(Constants.DERIVATIVE_FLOOR_PRICE);
        messageFields.add(Constants.DERIVATIVE_PUT_OR_CALL);
        messageFields.add(Constants.DERIVATIVE_EXERCISE_STYLE);
        messageFields.add(Constants.DERIVATIVE_OPT_PAY_AMOUNT);
        messageFields.add(Constants.DERIVATIVE_TIME_UNIT);
        messageFields.add(Constants.DERIVATIVE_SECURITY_EXCHANGE);
        messageFields.add(Constants.DERIVATIVE_POSITION_LIMIT);
        messageFields.add(Constants.DERIVATIVE_N_T_POSITION_LIMIT);
        messageFields.add(Constants.DERIVATIVE_ISSUER);
        messageFields.add(Constants.DERIVATIVE_ENCODED_ISSUER_LEN);
        messageFields.add(Constants.DERIVATIVE_ENCODED_ISSUER);
        messageFields.add(Constants.DERIVATIVE_SECURITY_DESC);
        messageFields.add(Constants.DERIVATIVE_ENCODED_SECURITY_DESC_LEN);
        messageFields.add(Constants.DERIVATIVE_ENCODED_SECURITY_DESC);
        messageFields.add(Constants.DERIVATIVE_SECURITY_X_M_L_LEN);
        messageFields.add(Constants.DERIVATIVE_SECURITY_X_M_L);
        messageFields.add(Constants.DERIVATIVE_SECURITY_X_M_L_SCHEMA);
        messageFields.add(Constants.DERIVATIVE_CONTRACT_SETTL_MONTH);
        messageFields.add(Constants.NO_DERIVATIVE_EVENTS);
        messageFields.add(Constants.DERIVATIVE_EVENT_TYPE);
        messageFields.add(Constants.DERIVATIVE_EVENT_DATE);
        messageFields.add(Constants.DERIVATIVE_EVENT_TIME);
        messageFields.add(Constants.DERIVATIVE_EVENT_PX);
        messageFields.add(Constants.DERIVATIVE_EVENT_TEXT);
        messageFields.add(Constants.NO_DERIVATIVE_INSTRUMENT_PARTIES);
        messageFields.add(Constants.DERIVATIVE_INSTRUMENT_PARTY_ID);
        messageFields.add(Constants.DERIVATIVE_INSTRUMENT_PARTY_ID_SOURCE);
        messageFields.add(Constants.DERIVATIVE_INSTRUMENT_PARTY_ROLE);
        messageFields.add(Constants.NO_DERIVATIVE_INSTRUMENT_PARTY_SUB_IDS);
        messageFields.add(Constants.DERIVATIVE_INSTRUMENT_PARTY_SUB_ID);
        messageFields.add(Constants.DERIVATIVE_INSTRUMENT_PARTY_SUB_ID_TYPE);
        messageFields.add(Constants.SECURITY_SUB_TYPE);
        messageFields.add(Constants.CURRENCY);
        messageFields.add(Constants.TEXT);
        messageFields.add(Constants.ENCODED_TEXT_LEN);
        messageFields.add(Constants.ENCODED_TEXT);
        messageFields.add(Constants.TRADING_SESSION_ID);
        messageFields.add(Constants.TRADING_SESSION_SUB_ID);
        messageFields.add(Constants.SUBSCRIPTION_REQUEST_TYPE);
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

    private char[] securityReqID = new char[1];

    public char[] securityReqID()
    {
        return securityReqID;
    }


    private int securityReqIDOffset;

    private int securityReqIDLength;

    public int securityReqIDLength()
    {
        return securityReqIDLength;
    }

    public String securityReqIDAsString()
    {
        return new String(securityReqID, 0, securityReqIDLength);
    }

    public void securityReqID(final AsciiSequenceView view)
    {
        view.wrap(buffer, securityReqIDOffset, securityReqIDLength);
    }


    private int securityListRequestType = MISSING_INT;

    public int securityListRequestType()
    {
        return securityListRequestType;
    }



    private final CharArrayWrapper securityListRequestTypeWrapper = new CharArrayWrapper();
    public SecurityListRequestType securityListRequestTypeAsEnum()
    {
        return SecurityListRequestType.decode(securityListRequestType);
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



    private char[] underlyingSymbol = new char[1];

    private boolean hasUnderlyingSymbol;

    public char[] underlyingSymbol()
    {
        if (!hasUnderlyingSymbol)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSymbol");
        }

        return underlyingSymbol;
    }

    public boolean hasUnderlyingSymbol()
    {
        return hasUnderlyingSymbol;
    }


    private int underlyingSymbolOffset;

    private int underlyingSymbolLength;

    public int underlyingSymbolLength()
    {
        if (!hasUnderlyingSymbol)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSymbol");
        }

        return underlyingSymbolLength;
    }

    public String underlyingSymbolAsString()
    {
        return hasUnderlyingSymbol ? new String(underlyingSymbol, 0, underlyingSymbolLength) : null;
    }

    public void underlyingSymbol(final AsciiSequenceView view)
    {
        if (!hasUnderlyingSymbol)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSymbol");
        }

        view.wrap(buffer, underlyingSymbolOffset, underlyingSymbolLength);
    }


    private char[] underlyingSymbolSfx = new char[1];

    private boolean hasUnderlyingSymbolSfx;

    public char[] underlyingSymbolSfx()
    {
        if (!hasUnderlyingSymbolSfx)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSymbolSfx");
        }

        return underlyingSymbolSfx;
    }

    public boolean hasUnderlyingSymbolSfx()
    {
        return hasUnderlyingSymbolSfx;
    }


    private int underlyingSymbolSfxOffset;

    private int underlyingSymbolSfxLength;

    public int underlyingSymbolSfxLength()
    {
        if (!hasUnderlyingSymbolSfx)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSymbolSfx");
        }

        return underlyingSymbolSfxLength;
    }

    public String underlyingSymbolSfxAsString()
    {
        return hasUnderlyingSymbolSfx ? new String(underlyingSymbolSfx, 0, underlyingSymbolSfxLength) : null;
    }

    public void underlyingSymbolSfx(final AsciiSequenceView view)
    {
        if (!hasUnderlyingSymbolSfx)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSymbolSfx");
        }

        view.wrap(buffer, underlyingSymbolSfxOffset, underlyingSymbolSfxLength);
    }


    private char[] underlyingSecurityID = new char[1];

    private boolean hasUnderlyingSecurityID;

    public char[] underlyingSecurityID()
    {
        if (!hasUnderlyingSecurityID)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSecurityID");
        }

        return underlyingSecurityID;
    }

    public boolean hasUnderlyingSecurityID()
    {
        return hasUnderlyingSecurityID;
    }


    private int underlyingSecurityIDOffset;

    private int underlyingSecurityIDLength;

    public int underlyingSecurityIDLength()
    {
        if (!hasUnderlyingSecurityID)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSecurityID");
        }

        return underlyingSecurityIDLength;
    }

    public String underlyingSecurityIDAsString()
    {
        return hasUnderlyingSecurityID ? new String(underlyingSecurityID, 0, underlyingSecurityIDLength) : null;
    }

    public void underlyingSecurityID(final AsciiSequenceView view)
    {
        if (!hasUnderlyingSecurityID)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSecurityID");
        }

        view.wrap(buffer, underlyingSecurityIDOffset, underlyingSecurityIDLength);
    }


    private char[] underlyingSecurityIDSource = new char[1];

    private boolean hasUnderlyingSecurityIDSource;

    public char[] underlyingSecurityIDSource()
    {
        if (!hasUnderlyingSecurityIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSecurityIDSource");
        }

        return underlyingSecurityIDSource;
    }

    public boolean hasUnderlyingSecurityIDSource()
    {
        return hasUnderlyingSecurityIDSource;
    }


    private int underlyingSecurityIDSourceOffset;

    private int underlyingSecurityIDSourceLength;

    public int underlyingSecurityIDSourceLength()
    {
        if (!hasUnderlyingSecurityIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSecurityIDSource");
        }

        return underlyingSecurityIDSourceLength;
    }

    public String underlyingSecurityIDSourceAsString()
    {
        return hasUnderlyingSecurityIDSource ? new String(underlyingSecurityIDSource, 0, underlyingSecurityIDSourceLength) : null;
    }

    public void underlyingSecurityIDSource(final AsciiSequenceView view)
    {
        if (!hasUnderlyingSecurityIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSecurityIDSource");
        }

        view.wrap(buffer, underlyingSecurityIDSourceOffset, underlyingSecurityIDSourceLength);
    }




    private UnderlyingSecurityAltIDGroupDecoder underlyingSecurityAltIDGroup = null;
    public UnderlyingSecurityAltIDGroupDecoder underlyingSecurityAltIDGroup()
    {
        return underlyingSecurityAltIDGroup;
    }

    private int noUnderlyingSecurityAltIDGroupCounter = MISSING_INT;

    private boolean hasNoUnderlyingSecurityAltIDGroupCounter;

    public int noUnderlyingSecurityAltIDGroupCounter()
    {
        if (!hasNoUnderlyingSecurityAltIDGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoUnderlyingSecurityAltIDGroupCounter");
        }

        return noUnderlyingSecurityAltIDGroupCounter;
    }

    public boolean hasNoUnderlyingSecurityAltIDGroupCounter()
    {
        return hasNoUnderlyingSecurityAltIDGroupCounter;
    }




    private UnderlyingSecurityAltIDGroupIterator underlyingSecurityAltIDGroupIterator = new UnderlyingSecurityAltIDGroupIterator(this);
    public UnderlyingSecurityAltIDGroupIterator underlyingSecurityAltIDGroupIterator()
    {
        return underlyingSecurityAltIDGroupIterator.iterator();
    }


    private int underlyingProduct = MISSING_INT;

    private boolean hasUnderlyingProduct;

    public int underlyingProduct()
    {
        if (!hasUnderlyingProduct)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingProduct");
        }

        return underlyingProduct;
    }

    public boolean hasUnderlyingProduct()
    {
        return hasUnderlyingProduct;
    }



    private char[] underlyingCFICode = new char[1];

    private boolean hasUnderlyingCFICode;

    public char[] underlyingCFICode()
    {
        if (!hasUnderlyingCFICode)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingCFICode");
        }

        return underlyingCFICode;
    }

    public boolean hasUnderlyingCFICode()
    {
        return hasUnderlyingCFICode;
    }


    private int underlyingCFICodeOffset;

    private int underlyingCFICodeLength;

    public int underlyingCFICodeLength()
    {
        if (!hasUnderlyingCFICode)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingCFICode");
        }

        return underlyingCFICodeLength;
    }

    public String underlyingCFICodeAsString()
    {
        return hasUnderlyingCFICode ? new String(underlyingCFICode, 0, underlyingCFICodeLength) : null;
    }

    public void underlyingCFICode(final AsciiSequenceView view)
    {
        if (!hasUnderlyingCFICode)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingCFICode");
        }

        view.wrap(buffer, underlyingCFICodeOffset, underlyingCFICodeLength);
    }


    private char[] underlyingSecurityType = new char[1];

    private boolean hasUnderlyingSecurityType;

    public char[] underlyingSecurityType()
    {
        if (!hasUnderlyingSecurityType)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSecurityType");
        }

        return underlyingSecurityType;
    }

    public boolean hasUnderlyingSecurityType()
    {
        return hasUnderlyingSecurityType;
    }


    private int underlyingSecurityTypeOffset;

    private int underlyingSecurityTypeLength;

    public int underlyingSecurityTypeLength()
    {
        if (!hasUnderlyingSecurityType)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSecurityType");
        }

        return underlyingSecurityTypeLength;
    }

    public String underlyingSecurityTypeAsString()
    {
        return hasUnderlyingSecurityType ? new String(underlyingSecurityType, 0, underlyingSecurityTypeLength) : null;
    }

    public void underlyingSecurityType(final AsciiSequenceView view)
    {
        if (!hasUnderlyingSecurityType)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSecurityType");
        }

        view.wrap(buffer, underlyingSecurityTypeOffset, underlyingSecurityTypeLength);
    }


    private char[] underlyingSecuritySubType = new char[1];

    private boolean hasUnderlyingSecuritySubType;

    public char[] underlyingSecuritySubType()
    {
        if (!hasUnderlyingSecuritySubType)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSecuritySubType");
        }

        return underlyingSecuritySubType;
    }

    public boolean hasUnderlyingSecuritySubType()
    {
        return hasUnderlyingSecuritySubType;
    }


    private int underlyingSecuritySubTypeOffset;

    private int underlyingSecuritySubTypeLength;

    public int underlyingSecuritySubTypeLength()
    {
        if (!hasUnderlyingSecuritySubType)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSecuritySubType");
        }

        return underlyingSecuritySubTypeLength;
    }

    public String underlyingSecuritySubTypeAsString()
    {
        return hasUnderlyingSecuritySubType ? new String(underlyingSecuritySubType, 0, underlyingSecuritySubTypeLength) : null;
    }

    public void underlyingSecuritySubType(final AsciiSequenceView view)
    {
        if (!hasUnderlyingSecuritySubType)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSecuritySubType");
        }

        view.wrap(buffer, underlyingSecuritySubTypeOffset, underlyingSecuritySubTypeLength);
    }


    private byte[] underlyingMaturityMonthYear = new byte[8];

    private boolean hasUnderlyingMaturityMonthYear;

    public byte[] underlyingMaturityMonthYear()
    {
        if (!hasUnderlyingMaturityMonthYear)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingMaturityMonthYear");
        }

        return underlyingMaturityMonthYear;
    }

    public boolean hasUnderlyingMaturityMonthYear()
    {
        return hasUnderlyingMaturityMonthYear;
    }


    private int underlyingMaturityMonthYearOffset;

    private int underlyingMaturityMonthYearLength;

    public int underlyingMaturityMonthYearLength()
    {
        if (!hasUnderlyingMaturityMonthYear)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingMaturityMonthYear");
        }

        return underlyingMaturityMonthYearLength;
    }

    public String underlyingMaturityMonthYearAsString()
    {
        return hasUnderlyingMaturityMonthYear ? new String(underlyingMaturityMonthYear, 0, underlyingMaturityMonthYearLength) : null;
    }

    public void underlyingMaturityMonthYear(final AsciiSequenceView view)
    {
        if (!hasUnderlyingMaturityMonthYear)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingMaturityMonthYear");
        }

        view.wrap(buffer, underlyingMaturityMonthYearOffset, underlyingMaturityMonthYearLength);
    }


    private byte[] underlyingMaturityDate = new byte[8];

    private boolean hasUnderlyingMaturityDate;

    public byte[] underlyingMaturityDate()
    {
        if (!hasUnderlyingMaturityDate)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingMaturityDate");
        }

        return underlyingMaturityDate;
    }

    public boolean hasUnderlyingMaturityDate()
    {
        return hasUnderlyingMaturityDate;
    }


    private int underlyingMaturityDateOffset;

    private int underlyingMaturityDateLength;

    public int underlyingMaturityDateLength()
    {
        if (!hasUnderlyingMaturityDate)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingMaturityDate");
        }

        return underlyingMaturityDateLength;
    }

    public String underlyingMaturityDateAsString()
    {
        return hasUnderlyingMaturityDate ? new String(underlyingMaturityDate, 0, underlyingMaturityDateLength) : null;
    }

    public void underlyingMaturityDate(final AsciiSequenceView view)
    {
        if (!hasUnderlyingMaturityDate)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingMaturityDate");
        }

        view.wrap(buffer, underlyingMaturityDateOffset, underlyingMaturityDateLength);
    }


    private byte[] underlyingMaturityTime = new byte[19];

    private boolean hasUnderlyingMaturityTime;

    public byte[] underlyingMaturityTime()
    {
        if (!hasUnderlyingMaturityTime)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingMaturityTime");
        }

        return underlyingMaturityTime;
    }

    public boolean hasUnderlyingMaturityTime()
    {
        return hasUnderlyingMaturityTime;
    }


    private int underlyingMaturityTimeOffset;

    private int underlyingMaturityTimeLength;

    public int underlyingMaturityTimeLength()
    {
        if (!hasUnderlyingMaturityTime)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingMaturityTime");
        }

        return underlyingMaturityTimeLength;
    }

    public String underlyingMaturityTimeAsString()
    {
        return hasUnderlyingMaturityTime ? new String(underlyingMaturityTime, 0, underlyingMaturityTimeLength) : null;
    }

    public void underlyingMaturityTime(final AsciiSequenceView view)
    {
        if (!hasUnderlyingMaturityTime)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingMaturityTime");
        }

        view.wrap(buffer, underlyingMaturityTimeOffset, underlyingMaturityTimeLength);
    }


    private byte[] underlyingCouponPaymentDate = new byte[8];

    private boolean hasUnderlyingCouponPaymentDate;

    public byte[] underlyingCouponPaymentDate()
    {
        if (!hasUnderlyingCouponPaymentDate)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingCouponPaymentDate");
        }

        return underlyingCouponPaymentDate;
    }

    public boolean hasUnderlyingCouponPaymentDate()
    {
        return hasUnderlyingCouponPaymentDate;
    }


    private int underlyingCouponPaymentDateOffset;

    private int underlyingCouponPaymentDateLength;

    public int underlyingCouponPaymentDateLength()
    {
        if (!hasUnderlyingCouponPaymentDate)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingCouponPaymentDate");
        }

        return underlyingCouponPaymentDateLength;
    }

    public String underlyingCouponPaymentDateAsString()
    {
        return hasUnderlyingCouponPaymentDate ? new String(underlyingCouponPaymentDate, 0, underlyingCouponPaymentDateLength) : null;
    }

    public void underlyingCouponPaymentDate(final AsciiSequenceView view)
    {
        if (!hasUnderlyingCouponPaymentDate)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingCouponPaymentDate");
        }

        view.wrap(buffer, underlyingCouponPaymentDateOffset, underlyingCouponPaymentDateLength);
    }


    private char[] underlyingRestructuringType = new char[1];

    private boolean hasUnderlyingRestructuringType;

    public char[] underlyingRestructuringType()
    {
        if (!hasUnderlyingRestructuringType)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingRestructuringType");
        }

        return underlyingRestructuringType;
    }

    public boolean hasUnderlyingRestructuringType()
    {
        return hasUnderlyingRestructuringType;
    }


    private int underlyingRestructuringTypeOffset;

    private int underlyingRestructuringTypeLength;

    public int underlyingRestructuringTypeLength()
    {
        if (!hasUnderlyingRestructuringType)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingRestructuringType");
        }

        return underlyingRestructuringTypeLength;
    }

    public String underlyingRestructuringTypeAsString()
    {
        return hasUnderlyingRestructuringType ? new String(underlyingRestructuringType, 0, underlyingRestructuringTypeLength) : null;
    }

    public void underlyingRestructuringType(final AsciiSequenceView view)
    {
        if (!hasUnderlyingRestructuringType)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingRestructuringType");
        }

        view.wrap(buffer, underlyingRestructuringTypeOffset, underlyingRestructuringTypeLength);
    }


    private char[] underlyingSeniority = new char[1];

    private boolean hasUnderlyingSeniority;

    public char[] underlyingSeniority()
    {
        if (!hasUnderlyingSeniority)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSeniority");
        }

        return underlyingSeniority;
    }

    public boolean hasUnderlyingSeniority()
    {
        return hasUnderlyingSeniority;
    }


    private int underlyingSeniorityOffset;

    private int underlyingSeniorityLength;

    public int underlyingSeniorityLength()
    {
        if (!hasUnderlyingSeniority)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSeniority");
        }

        return underlyingSeniorityLength;
    }

    public String underlyingSeniorityAsString()
    {
        return hasUnderlyingSeniority ? new String(underlyingSeniority, 0, underlyingSeniorityLength) : null;
    }

    public void underlyingSeniority(final AsciiSequenceView view)
    {
        if (!hasUnderlyingSeniority)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSeniority");
        }

        view.wrap(buffer, underlyingSeniorityOffset, underlyingSeniorityLength);
    }


    private DecimalFloat underlyingNotionalPercentageOutstanding = DecimalFloat.newNaNValue();

    private boolean hasUnderlyingNotionalPercentageOutstanding;

    public DecimalFloat underlyingNotionalPercentageOutstanding()
    {
        if (!hasUnderlyingNotionalPercentageOutstanding)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingNotionalPercentageOutstanding");
        }

        return underlyingNotionalPercentageOutstanding;
    }

    public boolean hasUnderlyingNotionalPercentageOutstanding()
    {
        return hasUnderlyingNotionalPercentageOutstanding;
    }



    private DecimalFloat underlyingOriginalNotionalPercentageOutstanding = DecimalFloat.newNaNValue();

    private boolean hasUnderlyingOriginalNotionalPercentageOutstanding;

    public DecimalFloat underlyingOriginalNotionalPercentageOutstanding()
    {
        if (!hasUnderlyingOriginalNotionalPercentageOutstanding)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingOriginalNotionalPercentageOutstanding");
        }

        return underlyingOriginalNotionalPercentageOutstanding;
    }

    public boolean hasUnderlyingOriginalNotionalPercentageOutstanding()
    {
        return hasUnderlyingOriginalNotionalPercentageOutstanding;
    }



    private DecimalFloat underlyingAttachmentPoint = DecimalFloat.newNaNValue();

    private boolean hasUnderlyingAttachmentPoint;

    public DecimalFloat underlyingAttachmentPoint()
    {
        if (!hasUnderlyingAttachmentPoint)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingAttachmentPoint");
        }

        return underlyingAttachmentPoint;
    }

    public boolean hasUnderlyingAttachmentPoint()
    {
        return hasUnderlyingAttachmentPoint;
    }



    private DecimalFloat underlyingDetachmentPoint = DecimalFloat.newNaNValue();

    private boolean hasUnderlyingDetachmentPoint;

    public DecimalFloat underlyingDetachmentPoint()
    {
        if (!hasUnderlyingDetachmentPoint)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingDetachmentPoint");
        }

        return underlyingDetachmentPoint;
    }

    public boolean hasUnderlyingDetachmentPoint()
    {
        return hasUnderlyingDetachmentPoint;
    }



    private byte[] underlyingIssueDate = new byte[8];

    private boolean hasUnderlyingIssueDate;

    public byte[] underlyingIssueDate()
    {
        if (!hasUnderlyingIssueDate)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingIssueDate");
        }

        return underlyingIssueDate;
    }

    public boolean hasUnderlyingIssueDate()
    {
        return hasUnderlyingIssueDate;
    }


    private int underlyingIssueDateOffset;

    private int underlyingIssueDateLength;

    public int underlyingIssueDateLength()
    {
        if (!hasUnderlyingIssueDate)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingIssueDate");
        }

        return underlyingIssueDateLength;
    }

    public String underlyingIssueDateAsString()
    {
        return hasUnderlyingIssueDate ? new String(underlyingIssueDate, 0, underlyingIssueDateLength) : null;
    }

    public void underlyingIssueDate(final AsciiSequenceView view)
    {
        if (!hasUnderlyingIssueDate)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingIssueDate");
        }

        view.wrap(buffer, underlyingIssueDateOffset, underlyingIssueDateLength);
    }


    private char[] underlyingRepoCollateralSecurityType = new char[1];

    private boolean hasUnderlyingRepoCollateralSecurityType;

    public char[] underlyingRepoCollateralSecurityType()
    {
        if (!hasUnderlyingRepoCollateralSecurityType)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingRepoCollateralSecurityType");
        }

        return underlyingRepoCollateralSecurityType;
    }

    public boolean hasUnderlyingRepoCollateralSecurityType()
    {
        return hasUnderlyingRepoCollateralSecurityType;
    }


    private int underlyingRepoCollateralSecurityTypeOffset;

    private int underlyingRepoCollateralSecurityTypeLength;

    public int underlyingRepoCollateralSecurityTypeLength()
    {
        if (!hasUnderlyingRepoCollateralSecurityType)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingRepoCollateralSecurityType");
        }

        return underlyingRepoCollateralSecurityTypeLength;
    }

    public String underlyingRepoCollateralSecurityTypeAsString()
    {
        return hasUnderlyingRepoCollateralSecurityType ? new String(underlyingRepoCollateralSecurityType, 0, underlyingRepoCollateralSecurityTypeLength) : null;
    }

    public void underlyingRepoCollateralSecurityType(final AsciiSequenceView view)
    {
        if (!hasUnderlyingRepoCollateralSecurityType)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingRepoCollateralSecurityType");
        }

        view.wrap(buffer, underlyingRepoCollateralSecurityTypeOffset, underlyingRepoCollateralSecurityTypeLength);
    }


    private int underlyingRepurchaseTerm = MISSING_INT;

    private boolean hasUnderlyingRepurchaseTerm;

    public int underlyingRepurchaseTerm()
    {
        if (!hasUnderlyingRepurchaseTerm)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingRepurchaseTerm");
        }

        return underlyingRepurchaseTerm;
    }

    public boolean hasUnderlyingRepurchaseTerm()
    {
        return hasUnderlyingRepurchaseTerm;
    }



    private DecimalFloat underlyingRepurchaseRate = DecimalFloat.newNaNValue();

    private boolean hasUnderlyingRepurchaseRate;

    public DecimalFloat underlyingRepurchaseRate()
    {
        if (!hasUnderlyingRepurchaseRate)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingRepurchaseRate");
        }

        return underlyingRepurchaseRate;
    }

    public boolean hasUnderlyingRepurchaseRate()
    {
        return hasUnderlyingRepurchaseRate;
    }



    private DecimalFloat underlyingFactor = DecimalFloat.newNaNValue();

    private boolean hasUnderlyingFactor;

    public DecimalFloat underlyingFactor()
    {
        if (!hasUnderlyingFactor)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingFactor");
        }

        return underlyingFactor;
    }

    public boolean hasUnderlyingFactor()
    {
        return hasUnderlyingFactor;
    }



    private char[] underlyingCreditRating = new char[1];

    private boolean hasUnderlyingCreditRating;

    public char[] underlyingCreditRating()
    {
        if (!hasUnderlyingCreditRating)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingCreditRating");
        }

        return underlyingCreditRating;
    }

    public boolean hasUnderlyingCreditRating()
    {
        return hasUnderlyingCreditRating;
    }


    private int underlyingCreditRatingOffset;

    private int underlyingCreditRatingLength;

    public int underlyingCreditRatingLength()
    {
        if (!hasUnderlyingCreditRating)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingCreditRating");
        }

        return underlyingCreditRatingLength;
    }

    public String underlyingCreditRatingAsString()
    {
        return hasUnderlyingCreditRating ? new String(underlyingCreditRating, 0, underlyingCreditRatingLength) : null;
    }

    public void underlyingCreditRating(final AsciiSequenceView view)
    {
        if (!hasUnderlyingCreditRating)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingCreditRating");
        }

        view.wrap(buffer, underlyingCreditRatingOffset, underlyingCreditRatingLength);
    }


    private char[] underlyingInstrRegistry = new char[1];

    private boolean hasUnderlyingInstrRegistry;

    public char[] underlyingInstrRegistry()
    {
        if (!hasUnderlyingInstrRegistry)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingInstrRegistry");
        }

        return underlyingInstrRegistry;
    }

    public boolean hasUnderlyingInstrRegistry()
    {
        return hasUnderlyingInstrRegistry;
    }


    private int underlyingInstrRegistryOffset;

    private int underlyingInstrRegistryLength;

    public int underlyingInstrRegistryLength()
    {
        if (!hasUnderlyingInstrRegistry)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingInstrRegistry");
        }

        return underlyingInstrRegistryLength;
    }

    public String underlyingInstrRegistryAsString()
    {
        return hasUnderlyingInstrRegistry ? new String(underlyingInstrRegistry, 0, underlyingInstrRegistryLength) : null;
    }

    public void underlyingInstrRegistry(final AsciiSequenceView view)
    {
        if (!hasUnderlyingInstrRegistry)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingInstrRegistry");
        }

        view.wrap(buffer, underlyingInstrRegistryOffset, underlyingInstrRegistryLength);
    }


    private char[] underlyingCountryOfIssue = new char[1];

    private boolean hasUnderlyingCountryOfIssue;

    public char[] underlyingCountryOfIssue()
    {
        if (!hasUnderlyingCountryOfIssue)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingCountryOfIssue");
        }

        return underlyingCountryOfIssue;
    }

    public boolean hasUnderlyingCountryOfIssue()
    {
        return hasUnderlyingCountryOfIssue;
    }


    private int underlyingCountryOfIssueOffset;

    private int underlyingCountryOfIssueLength;

    public int underlyingCountryOfIssueLength()
    {
        if (!hasUnderlyingCountryOfIssue)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingCountryOfIssue");
        }

        return underlyingCountryOfIssueLength;
    }

    public String underlyingCountryOfIssueAsString()
    {
        return hasUnderlyingCountryOfIssue ? new String(underlyingCountryOfIssue, 0, underlyingCountryOfIssueLength) : null;
    }

    public void underlyingCountryOfIssue(final AsciiSequenceView view)
    {
        if (!hasUnderlyingCountryOfIssue)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingCountryOfIssue");
        }

        view.wrap(buffer, underlyingCountryOfIssueOffset, underlyingCountryOfIssueLength);
    }


    private char[] underlyingStateOrProvinceOfIssue = new char[1];

    private boolean hasUnderlyingStateOrProvinceOfIssue;

    public char[] underlyingStateOrProvinceOfIssue()
    {
        if (!hasUnderlyingStateOrProvinceOfIssue)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingStateOrProvinceOfIssue");
        }

        return underlyingStateOrProvinceOfIssue;
    }

    public boolean hasUnderlyingStateOrProvinceOfIssue()
    {
        return hasUnderlyingStateOrProvinceOfIssue;
    }


    private int underlyingStateOrProvinceOfIssueOffset;

    private int underlyingStateOrProvinceOfIssueLength;

    public int underlyingStateOrProvinceOfIssueLength()
    {
        if (!hasUnderlyingStateOrProvinceOfIssue)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingStateOrProvinceOfIssue");
        }

        return underlyingStateOrProvinceOfIssueLength;
    }

    public String underlyingStateOrProvinceOfIssueAsString()
    {
        return hasUnderlyingStateOrProvinceOfIssue ? new String(underlyingStateOrProvinceOfIssue, 0, underlyingStateOrProvinceOfIssueLength) : null;
    }

    public void underlyingStateOrProvinceOfIssue(final AsciiSequenceView view)
    {
        if (!hasUnderlyingStateOrProvinceOfIssue)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingStateOrProvinceOfIssue");
        }

        view.wrap(buffer, underlyingStateOrProvinceOfIssueOffset, underlyingStateOrProvinceOfIssueLength);
    }


    private char[] underlyingLocaleOfIssue = new char[1];

    private boolean hasUnderlyingLocaleOfIssue;

    public char[] underlyingLocaleOfIssue()
    {
        if (!hasUnderlyingLocaleOfIssue)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingLocaleOfIssue");
        }

        return underlyingLocaleOfIssue;
    }

    public boolean hasUnderlyingLocaleOfIssue()
    {
        return hasUnderlyingLocaleOfIssue;
    }


    private int underlyingLocaleOfIssueOffset;

    private int underlyingLocaleOfIssueLength;

    public int underlyingLocaleOfIssueLength()
    {
        if (!hasUnderlyingLocaleOfIssue)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingLocaleOfIssue");
        }

        return underlyingLocaleOfIssueLength;
    }

    public String underlyingLocaleOfIssueAsString()
    {
        return hasUnderlyingLocaleOfIssue ? new String(underlyingLocaleOfIssue, 0, underlyingLocaleOfIssueLength) : null;
    }

    public void underlyingLocaleOfIssue(final AsciiSequenceView view)
    {
        if (!hasUnderlyingLocaleOfIssue)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingLocaleOfIssue");
        }

        view.wrap(buffer, underlyingLocaleOfIssueOffset, underlyingLocaleOfIssueLength);
    }


    private byte[] underlyingRedemptionDate = new byte[8];

    private boolean hasUnderlyingRedemptionDate;

    public byte[] underlyingRedemptionDate()
    {
        if (!hasUnderlyingRedemptionDate)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingRedemptionDate");
        }

        return underlyingRedemptionDate;
    }

    public boolean hasUnderlyingRedemptionDate()
    {
        return hasUnderlyingRedemptionDate;
    }


    private int underlyingRedemptionDateOffset;

    private int underlyingRedemptionDateLength;

    public int underlyingRedemptionDateLength()
    {
        if (!hasUnderlyingRedemptionDate)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingRedemptionDate");
        }

        return underlyingRedemptionDateLength;
    }

    public String underlyingRedemptionDateAsString()
    {
        return hasUnderlyingRedemptionDate ? new String(underlyingRedemptionDate, 0, underlyingRedemptionDateLength) : null;
    }

    public void underlyingRedemptionDate(final AsciiSequenceView view)
    {
        if (!hasUnderlyingRedemptionDate)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingRedemptionDate");
        }

        view.wrap(buffer, underlyingRedemptionDateOffset, underlyingRedemptionDateLength);
    }


    private DecimalFloat underlyingStrikePrice = DecimalFloat.newNaNValue();

    private boolean hasUnderlyingStrikePrice;

    public DecimalFloat underlyingStrikePrice()
    {
        if (!hasUnderlyingStrikePrice)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingStrikePrice");
        }

        return underlyingStrikePrice;
    }

    public boolean hasUnderlyingStrikePrice()
    {
        return hasUnderlyingStrikePrice;
    }



    private char[] underlyingStrikeCurrency = new char[1];

    private boolean hasUnderlyingStrikeCurrency;

    public char[] underlyingStrikeCurrency()
    {
        if (!hasUnderlyingStrikeCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingStrikeCurrency");
        }

        return underlyingStrikeCurrency;
    }

    public boolean hasUnderlyingStrikeCurrency()
    {
        return hasUnderlyingStrikeCurrency;
    }


    private int underlyingStrikeCurrencyOffset;

    private int underlyingStrikeCurrencyLength;

    public int underlyingStrikeCurrencyLength()
    {
        if (!hasUnderlyingStrikeCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingStrikeCurrency");
        }

        return underlyingStrikeCurrencyLength;
    }

    public String underlyingStrikeCurrencyAsString()
    {
        return hasUnderlyingStrikeCurrency ? new String(underlyingStrikeCurrency, 0, underlyingStrikeCurrencyLength) : null;
    }

    public void underlyingStrikeCurrency(final AsciiSequenceView view)
    {
        if (!hasUnderlyingStrikeCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingStrikeCurrency");
        }

        view.wrap(buffer, underlyingStrikeCurrencyOffset, underlyingStrikeCurrencyLength);
    }


    private char underlyingOptAttribute = MISSING_CHAR;

    private boolean hasUnderlyingOptAttribute;

    public char underlyingOptAttribute()
    {
        if (!hasUnderlyingOptAttribute)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingOptAttribute");
        }

        return underlyingOptAttribute;
    }

    public boolean hasUnderlyingOptAttribute()
    {
        return hasUnderlyingOptAttribute;
    }



    private DecimalFloat underlyingContractMultiplier = DecimalFloat.newNaNValue();

    private boolean hasUnderlyingContractMultiplier;

    public DecimalFloat underlyingContractMultiplier()
    {
        if (!hasUnderlyingContractMultiplier)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingContractMultiplier");
        }

        return underlyingContractMultiplier;
    }

    public boolean hasUnderlyingContractMultiplier()
    {
        return hasUnderlyingContractMultiplier;
    }



    private int underlyingContractMultiplierUnit = MISSING_INT;

    private boolean hasUnderlyingContractMultiplierUnit;

    public int underlyingContractMultiplierUnit()
    {
        if (!hasUnderlyingContractMultiplierUnit)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingContractMultiplierUnit");
        }

        return underlyingContractMultiplierUnit;
    }

    public boolean hasUnderlyingContractMultiplierUnit()
    {
        return hasUnderlyingContractMultiplierUnit;
    }



    private int underlyingFlowScheduleType = MISSING_INT;

    private boolean hasUnderlyingFlowScheduleType;

    public int underlyingFlowScheduleType()
    {
        if (!hasUnderlyingFlowScheduleType)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingFlowScheduleType");
        }

        return underlyingFlowScheduleType;
    }

    public boolean hasUnderlyingFlowScheduleType()
    {
        return hasUnderlyingFlowScheduleType;
    }



    private char[] underlyingUnitOfMeasure = new char[1];

    private boolean hasUnderlyingUnitOfMeasure;

    public char[] underlyingUnitOfMeasure()
    {
        if (!hasUnderlyingUnitOfMeasure)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingUnitOfMeasure");
        }

        return underlyingUnitOfMeasure;
    }

    public boolean hasUnderlyingUnitOfMeasure()
    {
        return hasUnderlyingUnitOfMeasure;
    }


    private int underlyingUnitOfMeasureOffset;

    private int underlyingUnitOfMeasureLength;

    public int underlyingUnitOfMeasureLength()
    {
        if (!hasUnderlyingUnitOfMeasure)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingUnitOfMeasure");
        }

        return underlyingUnitOfMeasureLength;
    }

    public String underlyingUnitOfMeasureAsString()
    {
        return hasUnderlyingUnitOfMeasure ? new String(underlyingUnitOfMeasure, 0, underlyingUnitOfMeasureLength) : null;
    }

    public void underlyingUnitOfMeasure(final AsciiSequenceView view)
    {
        if (!hasUnderlyingUnitOfMeasure)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingUnitOfMeasure");
        }

        view.wrap(buffer, underlyingUnitOfMeasureOffset, underlyingUnitOfMeasureLength);
    }


    private DecimalFloat underlyingUnitOfMeasureQty = DecimalFloat.newNaNValue();

    private boolean hasUnderlyingUnitOfMeasureQty;

    public DecimalFloat underlyingUnitOfMeasureQty()
    {
        if (!hasUnderlyingUnitOfMeasureQty)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingUnitOfMeasureQty");
        }

        return underlyingUnitOfMeasureQty;
    }

    public boolean hasUnderlyingUnitOfMeasureQty()
    {
        return hasUnderlyingUnitOfMeasureQty;
    }



    private char[] underlyingPriceUnitOfMeasure = new char[1];

    private boolean hasUnderlyingPriceUnitOfMeasure;

    public char[] underlyingPriceUnitOfMeasure()
    {
        if (!hasUnderlyingPriceUnitOfMeasure)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingPriceUnitOfMeasure");
        }

        return underlyingPriceUnitOfMeasure;
    }

    public boolean hasUnderlyingPriceUnitOfMeasure()
    {
        return hasUnderlyingPriceUnitOfMeasure;
    }


    private int underlyingPriceUnitOfMeasureOffset;

    private int underlyingPriceUnitOfMeasureLength;

    public int underlyingPriceUnitOfMeasureLength()
    {
        if (!hasUnderlyingPriceUnitOfMeasure)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingPriceUnitOfMeasure");
        }

        return underlyingPriceUnitOfMeasureLength;
    }

    public String underlyingPriceUnitOfMeasureAsString()
    {
        return hasUnderlyingPriceUnitOfMeasure ? new String(underlyingPriceUnitOfMeasure, 0, underlyingPriceUnitOfMeasureLength) : null;
    }

    public void underlyingPriceUnitOfMeasure(final AsciiSequenceView view)
    {
        if (!hasUnderlyingPriceUnitOfMeasure)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingPriceUnitOfMeasure");
        }

        view.wrap(buffer, underlyingPriceUnitOfMeasureOffset, underlyingPriceUnitOfMeasureLength);
    }


    private DecimalFloat underlyingPriceUnitOfMeasureQty = DecimalFloat.newNaNValue();

    private boolean hasUnderlyingPriceUnitOfMeasureQty;

    public DecimalFloat underlyingPriceUnitOfMeasureQty()
    {
        if (!hasUnderlyingPriceUnitOfMeasureQty)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingPriceUnitOfMeasureQty");
        }

        return underlyingPriceUnitOfMeasureQty;
    }

    public boolean hasUnderlyingPriceUnitOfMeasureQty()
    {
        return hasUnderlyingPriceUnitOfMeasureQty;
    }



    private char[] underlyingTimeUnit = new char[1];

    private boolean hasUnderlyingTimeUnit;

    public char[] underlyingTimeUnit()
    {
        if (!hasUnderlyingTimeUnit)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingTimeUnit");
        }

        return underlyingTimeUnit;
    }

    public boolean hasUnderlyingTimeUnit()
    {
        return hasUnderlyingTimeUnit;
    }


    private int underlyingTimeUnitOffset;

    private int underlyingTimeUnitLength;

    public int underlyingTimeUnitLength()
    {
        if (!hasUnderlyingTimeUnit)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingTimeUnit");
        }

        return underlyingTimeUnitLength;
    }

    public String underlyingTimeUnitAsString()
    {
        return hasUnderlyingTimeUnit ? new String(underlyingTimeUnit, 0, underlyingTimeUnitLength) : null;
    }

    public void underlyingTimeUnit(final AsciiSequenceView view)
    {
        if (!hasUnderlyingTimeUnit)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingTimeUnit");
        }

        view.wrap(buffer, underlyingTimeUnitOffset, underlyingTimeUnitLength);
    }


    private int underlyingExerciseStyle = MISSING_INT;

    private boolean hasUnderlyingExerciseStyle;

    public int underlyingExerciseStyle()
    {
        if (!hasUnderlyingExerciseStyle)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingExerciseStyle");
        }

        return underlyingExerciseStyle;
    }

    public boolean hasUnderlyingExerciseStyle()
    {
        return hasUnderlyingExerciseStyle;
    }



    private DecimalFloat underlyingCouponRate = DecimalFloat.newNaNValue();

    private boolean hasUnderlyingCouponRate;

    public DecimalFloat underlyingCouponRate()
    {
        if (!hasUnderlyingCouponRate)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingCouponRate");
        }

        return underlyingCouponRate;
    }

    public boolean hasUnderlyingCouponRate()
    {
        return hasUnderlyingCouponRate;
    }



    private char[] underlyingSecurityExchange = new char[1];

    private boolean hasUnderlyingSecurityExchange;

    public char[] underlyingSecurityExchange()
    {
        if (!hasUnderlyingSecurityExchange)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSecurityExchange");
        }

        return underlyingSecurityExchange;
    }

    public boolean hasUnderlyingSecurityExchange()
    {
        return hasUnderlyingSecurityExchange;
    }


    private int underlyingSecurityExchangeOffset;

    private int underlyingSecurityExchangeLength;

    public int underlyingSecurityExchangeLength()
    {
        if (!hasUnderlyingSecurityExchange)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSecurityExchange");
        }

        return underlyingSecurityExchangeLength;
    }

    public String underlyingSecurityExchangeAsString()
    {
        return hasUnderlyingSecurityExchange ? new String(underlyingSecurityExchange, 0, underlyingSecurityExchangeLength) : null;
    }

    public void underlyingSecurityExchange(final AsciiSequenceView view)
    {
        if (!hasUnderlyingSecurityExchange)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSecurityExchange");
        }

        view.wrap(buffer, underlyingSecurityExchangeOffset, underlyingSecurityExchangeLength);
    }


    private char[] underlyingIssuer = new char[1];

    private boolean hasUnderlyingIssuer;

    public char[] underlyingIssuer()
    {
        if (!hasUnderlyingIssuer)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingIssuer");
        }

        return underlyingIssuer;
    }

    public boolean hasUnderlyingIssuer()
    {
        return hasUnderlyingIssuer;
    }


    private int underlyingIssuerOffset;

    private int underlyingIssuerLength;

    public int underlyingIssuerLength()
    {
        if (!hasUnderlyingIssuer)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingIssuer");
        }

        return underlyingIssuerLength;
    }

    public String underlyingIssuerAsString()
    {
        return hasUnderlyingIssuer ? new String(underlyingIssuer, 0, underlyingIssuerLength) : null;
    }

    public void underlyingIssuer(final AsciiSequenceView view)
    {
        if (!hasUnderlyingIssuer)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingIssuer");
        }

        view.wrap(buffer, underlyingIssuerOffset, underlyingIssuerLength);
    }


    private int encodedUnderlyingIssuerLen = MISSING_INT;

    private boolean hasEncodedUnderlyingIssuerLen;

    public int encodedUnderlyingIssuerLen()
    {
        if (!hasEncodedUnderlyingIssuerLen)
        {
            throw new IllegalArgumentException("No value for optional field: EncodedUnderlyingIssuerLen");
        }

        return encodedUnderlyingIssuerLen;
    }

    public boolean hasEncodedUnderlyingIssuerLen()
    {
        return hasEncodedUnderlyingIssuerLen;
    }



    private byte[] encodedUnderlyingIssuer = new byte[1];

    private boolean hasEncodedUnderlyingIssuer;

    public byte[] encodedUnderlyingIssuer()
    {
        if (!hasEncodedUnderlyingIssuer)
        {
            throw new IllegalArgumentException("No value for optional field: EncodedUnderlyingIssuer");
        }

        return encodedUnderlyingIssuer;
    }

    public boolean hasEncodedUnderlyingIssuer()
    {
        return hasEncodedUnderlyingIssuer;
    }



    private char[] underlyingSecurityDesc = new char[1];

    private boolean hasUnderlyingSecurityDesc;

    public char[] underlyingSecurityDesc()
    {
        if (!hasUnderlyingSecurityDesc)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSecurityDesc");
        }

        return underlyingSecurityDesc;
    }

    public boolean hasUnderlyingSecurityDesc()
    {
        return hasUnderlyingSecurityDesc;
    }


    private int underlyingSecurityDescOffset;

    private int underlyingSecurityDescLength;

    public int underlyingSecurityDescLength()
    {
        if (!hasUnderlyingSecurityDesc)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSecurityDesc");
        }

        return underlyingSecurityDescLength;
    }

    public String underlyingSecurityDescAsString()
    {
        return hasUnderlyingSecurityDesc ? new String(underlyingSecurityDesc, 0, underlyingSecurityDescLength) : null;
    }

    public void underlyingSecurityDesc(final AsciiSequenceView view)
    {
        if (!hasUnderlyingSecurityDesc)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSecurityDesc");
        }

        view.wrap(buffer, underlyingSecurityDescOffset, underlyingSecurityDescLength);
    }


    private int encodedUnderlyingSecurityDescLen = MISSING_INT;

    private boolean hasEncodedUnderlyingSecurityDescLen;

    public int encodedUnderlyingSecurityDescLen()
    {
        if (!hasEncodedUnderlyingSecurityDescLen)
        {
            throw new IllegalArgumentException("No value for optional field: EncodedUnderlyingSecurityDescLen");
        }

        return encodedUnderlyingSecurityDescLen;
    }

    public boolean hasEncodedUnderlyingSecurityDescLen()
    {
        return hasEncodedUnderlyingSecurityDescLen;
    }



    private byte[] encodedUnderlyingSecurityDesc = new byte[1];

    private boolean hasEncodedUnderlyingSecurityDesc;

    public byte[] encodedUnderlyingSecurityDesc()
    {
        if (!hasEncodedUnderlyingSecurityDesc)
        {
            throw new IllegalArgumentException("No value for optional field: EncodedUnderlyingSecurityDesc");
        }

        return encodedUnderlyingSecurityDesc;
    }

    public boolean hasEncodedUnderlyingSecurityDesc()
    {
        return hasEncodedUnderlyingSecurityDesc;
    }



    private char[] underlyingCPProgram = new char[1];

    private boolean hasUnderlyingCPProgram;

    public char[] underlyingCPProgram()
    {
        if (!hasUnderlyingCPProgram)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingCPProgram");
        }

        return underlyingCPProgram;
    }

    public boolean hasUnderlyingCPProgram()
    {
        return hasUnderlyingCPProgram;
    }


    private int underlyingCPProgramOffset;

    private int underlyingCPProgramLength;

    public int underlyingCPProgramLength()
    {
        if (!hasUnderlyingCPProgram)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingCPProgram");
        }

        return underlyingCPProgramLength;
    }

    public String underlyingCPProgramAsString()
    {
        return hasUnderlyingCPProgram ? new String(underlyingCPProgram, 0, underlyingCPProgramLength) : null;
    }

    public void underlyingCPProgram(final AsciiSequenceView view)
    {
        if (!hasUnderlyingCPProgram)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingCPProgram");
        }

        view.wrap(buffer, underlyingCPProgramOffset, underlyingCPProgramLength);
    }


    private char[] underlyingCPRegType = new char[1];

    private boolean hasUnderlyingCPRegType;

    public char[] underlyingCPRegType()
    {
        if (!hasUnderlyingCPRegType)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingCPRegType");
        }

        return underlyingCPRegType;
    }

    public boolean hasUnderlyingCPRegType()
    {
        return hasUnderlyingCPRegType;
    }


    private int underlyingCPRegTypeOffset;

    private int underlyingCPRegTypeLength;

    public int underlyingCPRegTypeLength()
    {
        if (!hasUnderlyingCPRegType)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingCPRegType");
        }

        return underlyingCPRegTypeLength;
    }

    public String underlyingCPRegTypeAsString()
    {
        return hasUnderlyingCPRegType ? new String(underlyingCPRegType, 0, underlyingCPRegTypeLength) : null;
    }

    public void underlyingCPRegType(final AsciiSequenceView view)
    {
        if (!hasUnderlyingCPRegType)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingCPRegType");
        }

        view.wrap(buffer, underlyingCPRegTypeOffset, underlyingCPRegTypeLength);
    }


    private DecimalFloat underlyingAllocationPercent = DecimalFloat.newNaNValue();

    private boolean hasUnderlyingAllocationPercent;

    public DecimalFloat underlyingAllocationPercent()
    {
        if (!hasUnderlyingAllocationPercent)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingAllocationPercent");
        }

        return underlyingAllocationPercent;
    }

    public boolean hasUnderlyingAllocationPercent()
    {
        return hasUnderlyingAllocationPercent;
    }



    private char[] underlyingCurrency = new char[1];

    private boolean hasUnderlyingCurrency;

    public char[] underlyingCurrency()
    {
        if (!hasUnderlyingCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingCurrency");
        }

        return underlyingCurrency;
    }

    public boolean hasUnderlyingCurrency()
    {
        return hasUnderlyingCurrency;
    }


    private int underlyingCurrencyOffset;

    private int underlyingCurrencyLength;

    public int underlyingCurrencyLength()
    {
        if (!hasUnderlyingCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingCurrency");
        }

        return underlyingCurrencyLength;
    }

    public String underlyingCurrencyAsString()
    {
        return hasUnderlyingCurrency ? new String(underlyingCurrency, 0, underlyingCurrencyLength) : null;
    }

    public void underlyingCurrency(final AsciiSequenceView view)
    {
        if (!hasUnderlyingCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingCurrency");
        }

        view.wrap(buffer, underlyingCurrencyOffset, underlyingCurrencyLength);
    }


    private DecimalFloat underlyingQty = DecimalFloat.newNaNValue();

    private boolean hasUnderlyingQty;

    public DecimalFloat underlyingQty()
    {
        if (!hasUnderlyingQty)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingQty");
        }

        return underlyingQty;
    }

    public boolean hasUnderlyingQty()
    {
        return hasUnderlyingQty;
    }



    private int underlyingSettlementType = MISSING_INT;

    private boolean hasUnderlyingSettlementType;

    public int underlyingSettlementType()
    {
        if (!hasUnderlyingSettlementType)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSettlementType");
        }

        return underlyingSettlementType;
    }

    public boolean hasUnderlyingSettlementType()
    {
        return hasUnderlyingSettlementType;
    }



    private final CharArrayWrapper underlyingSettlementTypeWrapper = new CharArrayWrapper();
    public UnderlyingSettlementType underlyingSettlementTypeAsEnum()
    {
        if (!hasUnderlyingSettlementType)
 return UnderlyingSettlementType.NULL_VAL;
        return UnderlyingSettlementType.decode(underlyingSettlementType);
    }

    private DecimalFloat underlyingCashAmount = DecimalFloat.newNaNValue();

    private boolean hasUnderlyingCashAmount;

    public DecimalFloat underlyingCashAmount()
    {
        if (!hasUnderlyingCashAmount)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingCashAmount");
        }

        return underlyingCashAmount;
    }

    public boolean hasUnderlyingCashAmount()
    {
        return hasUnderlyingCashAmount;
    }



    private char[] underlyingCashType = new char[1];

    private boolean hasUnderlyingCashType;

    public char[] underlyingCashType()
    {
        if (!hasUnderlyingCashType)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingCashType");
        }

        return underlyingCashType;
    }

    public boolean hasUnderlyingCashType()
    {
        return hasUnderlyingCashType;
    }


    private int underlyingCashTypeOffset;

    private int underlyingCashTypeLength;

    public int underlyingCashTypeLength()
    {
        if (!hasUnderlyingCashType)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingCashType");
        }

        return underlyingCashTypeLength;
    }

    public String underlyingCashTypeAsString()
    {
        return hasUnderlyingCashType ? new String(underlyingCashType, 0, underlyingCashTypeLength) : null;
    }

    public void underlyingCashType(final AsciiSequenceView view)
    {
        if (!hasUnderlyingCashType)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingCashType");
        }

        view.wrap(buffer, underlyingCashTypeOffset, underlyingCashTypeLength);
    }


    private final CharArrayWrapper underlyingCashTypeWrapper = new CharArrayWrapper();
    public UnderlyingCashType underlyingCashTypeAsEnum()
    {
        if (!hasUnderlyingCashType)
 return UnderlyingCashType.NULL_VAL;
        underlyingCashTypeWrapper.wrap(this.underlyingCashType(), underlyingCashTypeLength);
        return UnderlyingCashType.decode(underlyingCashTypeWrapper);
    }

    private DecimalFloat underlyingPx = DecimalFloat.newNaNValue();

    private boolean hasUnderlyingPx;

    public DecimalFloat underlyingPx()
    {
        if (!hasUnderlyingPx)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingPx");
        }

        return underlyingPx;
    }

    public boolean hasUnderlyingPx()
    {
        return hasUnderlyingPx;
    }



    private DecimalFloat underlyingDirtyPrice = DecimalFloat.newNaNValue();

    private boolean hasUnderlyingDirtyPrice;

    public DecimalFloat underlyingDirtyPrice()
    {
        if (!hasUnderlyingDirtyPrice)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingDirtyPrice");
        }

        return underlyingDirtyPrice;
    }

    public boolean hasUnderlyingDirtyPrice()
    {
        return hasUnderlyingDirtyPrice;
    }



    private DecimalFloat underlyingEndPrice = DecimalFloat.newNaNValue();

    private boolean hasUnderlyingEndPrice;

    public DecimalFloat underlyingEndPrice()
    {
        if (!hasUnderlyingEndPrice)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingEndPrice");
        }

        return underlyingEndPrice;
    }

    public boolean hasUnderlyingEndPrice()
    {
        return hasUnderlyingEndPrice;
    }



    private DecimalFloat underlyingStartValue = DecimalFloat.newNaNValue();

    private boolean hasUnderlyingStartValue;

    public DecimalFloat underlyingStartValue()
    {
        if (!hasUnderlyingStartValue)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingStartValue");
        }

        return underlyingStartValue;
    }

    public boolean hasUnderlyingStartValue()
    {
        return hasUnderlyingStartValue;
    }



    private DecimalFloat underlyingCurrentValue = DecimalFloat.newNaNValue();

    private boolean hasUnderlyingCurrentValue;

    public DecimalFloat underlyingCurrentValue()
    {
        if (!hasUnderlyingCurrentValue)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingCurrentValue");
        }

        return underlyingCurrentValue;
    }

    public boolean hasUnderlyingCurrentValue()
    {
        return hasUnderlyingCurrentValue;
    }



    private DecimalFloat underlyingEndValue = DecimalFloat.newNaNValue();

    private boolean hasUnderlyingEndValue;

    public DecimalFloat underlyingEndValue()
    {
        if (!hasUnderlyingEndValue)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingEndValue");
        }

        return underlyingEndValue;
    }

    public boolean hasUnderlyingEndValue()
    {
        return hasUnderlyingEndValue;
    }





    private UnderlyingStipsGroupDecoder underlyingStipsGroup = null;
    public UnderlyingStipsGroupDecoder underlyingStipsGroup()
    {
        return underlyingStipsGroup;
    }

    private int noUnderlyingStipsGroupCounter = MISSING_INT;

    private boolean hasNoUnderlyingStipsGroupCounter;

    public int noUnderlyingStipsGroupCounter()
    {
        if (!hasNoUnderlyingStipsGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoUnderlyingStipsGroupCounter");
        }

        return noUnderlyingStipsGroupCounter;
    }

    public boolean hasNoUnderlyingStipsGroupCounter()
    {
        return hasNoUnderlyingStipsGroupCounter;
    }




    private UnderlyingStipsGroupIterator underlyingStipsGroupIterator = new UnderlyingStipsGroupIterator(this);
    public UnderlyingStipsGroupIterator underlyingStipsGroupIterator()
    {
        return underlyingStipsGroupIterator.iterator();
    }


    private DecimalFloat underlyingAdjustedQuantity = DecimalFloat.newNaNValue();

    private boolean hasUnderlyingAdjustedQuantity;

    public DecimalFloat underlyingAdjustedQuantity()
    {
        if (!hasUnderlyingAdjustedQuantity)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingAdjustedQuantity");
        }

        return underlyingAdjustedQuantity;
    }

    public boolean hasUnderlyingAdjustedQuantity()
    {
        return hasUnderlyingAdjustedQuantity;
    }



    private DecimalFloat underlyingFXRate = DecimalFloat.newNaNValue();

    private boolean hasUnderlyingFXRate;

    public DecimalFloat underlyingFXRate()
    {
        if (!hasUnderlyingFXRate)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingFXRate");
        }

        return underlyingFXRate;
    }

    public boolean hasUnderlyingFXRate()
    {
        return hasUnderlyingFXRate;
    }



    private char underlyingFXRateCalc = MISSING_CHAR;

    private boolean hasUnderlyingFXRateCalc;

    public char underlyingFXRateCalc()
    {
        if (!hasUnderlyingFXRateCalc)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingFXRateCalc");
        }

        return underlyingFXRateCalc;
    }

    public boolean hasUnderlyingFXRateCalc()
    {
        return hasUnderlyingFXRateCalc;
    }



    private final CharArrayWrapper underlyingFXRateCalcWrapper = new CharArrayWrapper();
    public UnderlyingFXRateCalc underlyingFXRateCalcAsEnum()
    {
        if (!hasUnderlyingFXRateCalc)
 return UnderlyingFXRateCalc.NULL_VAL;
        return UnderlyingFXRateCalc.decode(underlyingFXRateCalc);
    }

    private DecimalFloat underlyingCapValue = DecimalFloat.newNaNValue();

    private boolean hasUnderlyingCapValue;

    public DecimalFloat underlyingCapValue()
    {
        if (!hasUnderlyingCapValue)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingCapValue");
        }

        return underlyingCapValue;
    }

    public boolean hasUnderlyingCapValue()
    {
        return hasUnderlyingCapValue;
    }





    private UndlyInstrumentPartiesGroupDecoder undlyInstrumentPartiesGroup = null;
    public UndlyInstrumentPartiesGroupDecoder undlyInstrumentPartiesGroup()
    {
        return undlyInstrumentPartiesGroup;
    }

    private int noUndlyInstrumentPartiesGroupCounter = MISSING_INT;

    private boolean hasNoUndlyInstrumentPartiesGroupCounter;

    public int noUndlyInstrumentPartiesGroupCounter()
    {
        if (!hasNoUndlyInstrumentPartiesGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoUndlyInstrumentPartiesGroupCounter");
        }

        return noUndlyInstrumentPartiesGroupCounter;
    }

    public boolean hasNoUndlyInstrumentPartiesGroupCounter()
    {
        return hasNoUndlyInstrumentPartiesGroupCounter;
    }




    private UndlyInstrumentPartiesGroupIterator undlyInstrumentPartiesGroupIterator = new UndlyInstrumentPartiesGroupIterator(this);
    public UndlyInstrumentPartiesGroupIterator undlyInstrumentPartiesGroupIterator()
    {
        return undlyInstrumentPartiesGroupIterator.iterator();
    }


    private char[] underlyingSettlMethod = new char[1];

    private boolean hasUnderlyingSettlMethod;

    public char[] underlyingSettlMethod()
    {
        if (!hasUnderlyingSettlMethod)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSettlMethod");
        }

        return underlyingSettlMethod;
    }

    public boolean hasUnderlyingSettlMethod()
    {
        return hasUnderlyingSettlMethod;
    }


    private int underlyingSettlMethodOffset;

    private int underlyingSettlMethodLength;

    public int underlyingSettlMethodLength()
    {
        if (!hasUnderlyingSettlMethod)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSettlMethod");
        }

        return underlyingSettlMethodLength;
    }

    public String underlyingSettlMethodAsString()
    {
        return hasUnderlyingSettlMethod ? new String(underlyingSettlMethod, 0, underlyingSettlMethodLength) : null;
    }

    public void underlyingSettlMethod(final AsciiSequenceView view)
    {
        if (!hasUnderlyingSettlMethod)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSettlMethod");
        }

        view.wrap(buffer, underlyingSettlMethodOffset, underlyingSettlMethodLength);
    }


    private int underlyingPutOrCall = MISSING_INT;

    private boolean hasUnderlyingPutOrCall;

    public int underlyingPutOrCall()
    {
        if (!hasUnderlyingPutOrCall)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingPutOrCall");
        }

        return underlyingPutOrCall;
    }

    public boolean hasUnderlyingPutOrCall()
    {
        return hasUnderlyingPutOrCall;
    }





    private char[] derivativeSymbol = new char[1];

    private boolean hasDerivativeSymbol;

    public char[] derivativeSymbol()
    {
        if (!hasDerivativeSymbol)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeSymbol");
        }

        return derivativeSymbol;
    }

    public boolean hasDerivativeSymbol()
    {
        return hasDerivativeSymbol;
    }


    private int derivativeSymbolOffset;

    private int derivativeSymbolLength;

    public int derivativeSymbolLength()
    {
        if (!hasDerivativeSymbol)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeSymbol");
        }

        return derivativeSymbolLength;
    }

    public String derivativeSymbolAsString()
    {
        return hasDerivativeSymbol ? new String(derivativeSymbol, 0, derivativeSymbolLength) : null;
    }

    public void derivativeSymbol(final AsciiSequenceView view)
    {
        if (!hasDerivativeSymbol)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeSymbol");
        }

        view.wrap(buffer, derivativeSymbolOffset, derivativeSymbolLength);
    }


    private char[] derivativeSymbolSfx = new char[1];

    private boolean hasDerivativeSymbolSfx;

    public char[] derivativeSymbolSfx()
    {
        if (!hasDerivativeSymbolSfx)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeSymbolSfx");
        }

        return derivativeSymbolSfx;
    }

    public boolean hasDerivativeSymbolSfx()
    {
        return hasDerivativeSymbolSfx;
    }


    private int derivativeSymbolSfxOffset;

    private int derivativeSymbolSfxLength;

    public int derivativeSymbolSfxLength()
    {
        if (!hasDerivativeSymbolSfx)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeSymbolSfx");
        }

        return derivativeSymbolSfxLength;
    }

    public String derivativeSymbolSfxAsString()
    {
        return hasDerivativeSymbolSfx ? new String(derivativeSymbolSfx, 0, derivativeSymbolSfxLength) : null;
    }

    public void derivativeSymbolSfx(final AsciiSequenceView view)
    {
        if (!hasDerivativeSymbolSfx)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeSymbolSfx");
        }

        view.wrap(buffer, derivativeSymbolSfxOffset, derivativeSymbolSfxLength);
    }


    private char[] derivativeSecurityID = new char[1];

    private boolean hasDerivativeSecurityID;

    public char[] derivativeSecurityID()
    {
        if (!hasDerivativeSecurityID)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeSecurityID");
        }

        return derivativeSecurityID;
    }

    public boolean hasDerivativeSecurityID()
    {
        return hasDerivativeSecurityID;
    }


    private int derivativeSecurityIDOffset;

    private int derivativeSecurityIDLength;

    public int derivativeSecurityIDLength()
    {
        if (!hasDerivativeSecurityID)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeSecurityID");
        }

        return derivativeSecurityIDLength;
    }

    public String derivativeSecurityIDAsString()
    {
        return hasDerivativeSecurityID ? new String(derivativeSecurityID, 0, derivativeSecurityIDLength) : null;
    }

    public void derivativeSecurityID(final AsciiSequenceView view)
    {
        if (!hasDerivativeSecurityID)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeSecurityID");
        }

        view.wrap(buffer, derivativeSecurityIDOffset, derivativeSecurityIDLength);
    }


    private char[] derivativeSecurityIDSource = new char[1];

    private boolean hasDerivativeSecurityIDSource;

    public char[] derivativeSecurityIDSource()
    {
        if (!hasDerivativeSecurityIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeSecurityIDSource");
        }

        return derivativeSecurityIDSource;
    }

    public boolean hasDerivativeSecurityIDSource()
    {
        return hasDerivativeSecurityIDSource;
    }


    private int derivativeSecurityIDSourceOffset;

    private int derivativeSecurityIDSourceLength;

    public int derivativeSecurityIDSourceLength()
    {
        if (!hasDerivativeSecurityIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeSecurityIDSource");
        }

        return derivativeSecurityIDSourceLength;
    }

    public String derivativeSecurityIDSourceAsString()
    {
        return hasDerivativeSecurityIDSource ? new String(derivativeSecurityIDSource, 0, derivativeSecurityIDSourceLength) : null;
    }

    public void derivativeSecurityIDSource(final AsciiSequenceView view)
    {
        if (!hasDerivativeSecurityIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeSecurityIDSource");
        }

        view.wrap(buffer, derivativeSecurityIDSourceOffset, derivativeSecurityIDSourceLength);
    }




    private DerivativeSecurityAltIDGroupDecoder derivativeSecurityAltIDGroup = null;
    public DerivativeSecurityAltIDGroupDecoder derivativeSecurityAltIDGroup()
    {
        return derivativeSecurityAltIDGroup;
    }

    private int noDerivativeSecurityAltIDGroupCounter = MISSING_INT;

    private boolean hasNoDerivativeSecurityAltIDGroupCounter;

    public int noDerivativeSecurityAltIDGroupCounter()
    {
        if (!hasNoDerivativeSecurityAltIDGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoDerivativeSecurityAltIDGroupCounter");
        }

        return noDerivativeSecurityAltIDGroupCounter;
    }

    public boolean hasNoDerivativeSecurityAltIDGroupCounter()
    {
        return hasNoDerivativeSecurityAltIDGroupCounter;
    }




    private DerivativeSecurityAltIDGroupIterator derivativeSecurityAltIDGroupIterator = new DerivativeSecurityAltIDGroupIterator(this);
    public DerivativeSecurityAltIDGroupIterator derivativeSecurityAltIDGroupIterator()
    {
        return derivativeSecurityAltIDGroupIterator.iterator();
    }


    private int derivativeProduct = MISSING_INT;

    private boolean hasDerivativeProduct;

    public int derivativeProduct()
    {
        if (!hasDerivativeProduct)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeProduct");
        }

        return derivativeProduct;
    }

    public boolean hasDerivativeProduct()
    {
        return hasDerivativeProduct;
    }



    private char[] derivativeProductComplex = new char[1];

    private boolean hasDerivativeProductComplex;

    public char[] derivativeProductComplex()
    {
        if (!hasDerivativeProductComplex)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeProductComplex");
        }

        return derivativeProductComplex;
    }

    public boolean hasDerivativeProductComplex()
    {
        return hasDerivativeProductComplex;
    }


    private int derivativeProductComplexOffset;

    private int derivativeProductComplexLength;

    public int derivativeProductComplexLength()
    {
        if (!hasDerivativeProductComplex)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeProductComplex");
        }

        return derivativeProductComplexLength;
    }

    public String derivativeProductComplexAsString()
    {
        return hasDerivativeProductComplex ? new String(derivativeProductComplex, 0, derivativeProductComplexLength) : null;
    }

    public void derivativeProductComplex(final AsciiSequenceView view)
    {
        if (!hasDerivativeProductComplex)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeProductComplex");
        }

        view.wrap(buffer, derivativeProductComplexOffset, derivativeProductComplexLength);
    }


    private boolean derivFlexProductEligibilityIndicator;

    private boolean hasDerivFlexProductEligibilityIndicator;

    public boolean derivFlexProductEligibilityIndicator()
    {
        if (!hasDerivFlexProductEligibilityIndicator)
        {
            throw new IllegalArgumentException("No value for optional field: DerivFlexProductEligibilityIndicator");
        }

        return derivFlexProductEligibilityIndicator;
    }

    public boolean hasDerivFlexProductEligibilityIndicator()
    {
        return hasDerivFlexProductEligibilityIndicator;
    }



    private char[] derivativeSecurityGroup = new char[1];

    private boolean hasDerivativeSecurityGroup;

    public char[] derivativeSecurityGroup()
    {
        if (!hasDerivativeSecurityGroup)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeSecurityGroup");
        }

        return derivativeSecurityGroup;
    }

    public boolean hasDerivativeSecurityGroup()
    {
        return hasDerivativeSecurityGroup;
    }


    private int derivativeSecurityGroupOffset;

    private int derivativeSecurityGroupLength;

    public int derivativeSecurityGroupLength()
    {
        if (!hasDerivativeSecurityGroup)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeSecurityGroup");
        }

        return derivativeSecurityGroupLength;
    }

    public String derivativeSecurityGroupAsString()
    {
        return hasDerivativeSecurityGroup ? new String(derivativeSecurityGroup, 0, derivativeSecurityGroupLength) : null;
    }

    public void derivativeSecurityGroup(final AsciiSequenceView view)
    {
        if (!hasDerivativeSecurityGroup)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeSecurityGroup");
        }

        view.wrap(buffer, derivativeSecurityGroupOffset, derivativeSecurityGroupLength);
    }


    private char[] derivativeCFICode = new char[1];

    private boolean hasDerivativeCFICode;

    public char[] derivativeCFICode()
    {
        if (!hasDerivativeCFICode)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeCFICode");
        }

        return derivativeCFICode;
    }

    public boolean hasDerivativeCFICode()
    {
        return hasDerivativeCFICode;
    }


    private int derivativeCFICodeOffset;

    private int derivativeCFICodeLength;

    public int derivativeCFICodeLength()
    {
        if (!hasDerivativeCFICode)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeCFICode");
        }

        return derivativeCFICodeLength;
    }

    public String derivativeCFICodeAsString()
    {
        return hasDerivativeCFICode ? new String(derivativeCFICode, 0, derivativeCFICodeLength) : null;
    }

    public void derivativeCFICode(final AsciiSequenceView view)
    {
        if (!hasDerivativeCFICode)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeCFICode");
        }

        view.wrap(buffer, derivativeCFICodeOffset, derivativeCFICodeLength);
    }


    private char[] derivativeSecurityType = new char[1];

    private boolean hasDerivativeSecurityType;

    public char[] derivativeSecurityType()
    {
        if (!hasDerivativeSecurityType)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeSecurityType");
        }

        return derivativeSecurityType;
    }

    public boolean hasDerivativeSecurityType()
    {
        return hasDerivativeSecurityType;
    }


    private int derivativeSecurityTypeOffset;

    private int derivativeSecurityTypeLength;

    public int derivativeSecurityTypeLength()
    {
        if (!hasDerivativeSecurityType)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeSecurityType");
        }

        return derivativeSecurityTypeLength;
    }

    public String derivativeSecurityTypeAsString()
    {
        return hasDerivativeSecurityType ? new String(derivativeSecurityType, 0, derivativeSecurityTypeLength) : null;
    }

    public void derivativeSecurityType(final AsciiSequenceView view)
    {
        if (!hasDerivativeSecurityType)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeSecurityType");
        }

        view.wrap(buffer, derivativeSecurityTypeOffset, derivativeSecurityTypeLength);
    }


    private char[] derivativeSecuritySubType = new char[1];

    private boolean hasDerivativeSecuritySubType;

    public char[] derivativeSecuritySubType()
    {
        if (!hasDerivativeSecuritySubType)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeSecuritySubType");
        }

        return derivativeSecuritySubType;
    }

    public boolean hasDerivativeSecuritySubType()
    {
        return hasDerivativeSecuritySubType;
    }


    private int derivativeSecuritySubTypeOffset;

    private int derivativeSecuritySubTypeLength;

    public int derivativeSecuritySubTypeLength()
    {
        if (!hasDerivativeSecuritySubType)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeSecuritySubType");
        }

        return derivativeSecuritySubTypeLength;
    }

    public String derivativeSecuritySubTypeAsString()
    {
        return hasDerivativeSecuritySubType ? new String(derivativeSecuritySubType, 0, derivativeSecuritySubTypeLength) : null;
    }

    public void derivativeSecuritySubType(final AsciiSequenceView view)
    {
        if (!hasDerivativeSecuritySubType)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeSecuritySubType");
        }

        view.wrap(buffer, derivativeSecuritySubTypeOffset, derivativeSecuritySubTypeLength);
    }


    private byte[] derivativeMaturityMonthYear = new byte[8];

    private boolean hasDerivativeMaturityMonthYear;

    public byte[] derivativeMaturityMonthYear()
    {
        if (!hasDerivativeMaturityMonthYear)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeMaturityMonthYear");
        }

        return derivativeMaturityMonthYear;
    }

    public boolean hasDerivativeMaturityMonthYear()
    {
        return hasDerivativeMaturityMonthYear;
    }


    private int derivativeMaturityMonthYearOffset;

    private int derivativeMaturityMonthYearLength;

    public int derivativeMaturityMonthYearLength()
    {
        if (!hasDerivativeMaturityMonthYear)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeMaturityMonthYear");
        }

        return derivativeMaturityMonthYearLength;
    }

    public String derivativeMaturityMonthYearAsString()
    {
        return hasDerivativeMaturityMonthYear ? new String(derivativeMaturityMonthYear, 0, derivativeMaturityMonthYearLength) : null;
    }

    public void derivativeMaturityMonthYear(final AsciiSequenceView view)
    {
        if (!hasDerivativeMaturityMonthYear)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeMaturityMonthYear");
        }

        view.wrap(buffer, derivativeMaturityMonthYearOffset, derivativeMaturityMonthYearLength);
    }


    private byte[] derivativeMaturityDate = new byte[8];

    private boolean hasDerivativeMaturityDate;

    public byte[] derivativeMaturityDate()
    {
        if (!hasDerivativeMaturityDate)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeMaturityDate");
        }

        return derivativeMaturityDate;
    }

    public boolean hasDerivativeMaturityDate()
    {
        return hasDerivativeMaturityDate;
    }


    private int derivativeMaturityDateOffset;

    private int derivativeMaturityDateLength;

    public int derivativeMaturityDateLength()
    {
        if (!hasDerivativeMaturityDate)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeMaturityDate");
        }

        return derivativeMaturityDateLength;
    }

    public String derivativeMaturityDateAsString()
    {
        return hasDerivativeMaturityDate ? new String(derivativeMaturityDate, 0, derivativeMaturityDateLength) : null;
    }

    public void derivativeMaturityDate(final AsciiSequenceView view)
    {
        if (!hasDerivativeMaturityDate)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeMaturityDate");
        }

        view.wrap(buffer, derivativeMaturityDateOffset, derivativeMaturityDateLength);
    }


    private byte[] derivativeMaturityTime = new byte[19];

    private boolean hasDerivativeMaturityTime;

    public byte[] derivativeMaturityTime()
    {
        if (!hasDerivativeMaturityTime)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeMaturityTime");
        }

        return derivativeMaturityTime;
    }

    public boolean hasDerivativeMaturityTime()
    {
        return hasDerivativeMaturityTime;
    }


    private int derivativeMaturityTimeOffset;

    private int derivativeMaturityTimeLength;

    public int derivativeMaturityTimeLength()
    {
        if (!hasDerivativeMaturityTime)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeMaturityTime");
        }

        return derivativeMaturityTimeLength;
    }

    public String derivativeMaturityTimeAsString()
    {
        return hasDerivativeMaturityTime ? new String(derivativeMaturityTime, 0, derivativeMaturityTimeLength) : null;
    }

    public void derivativeMaturityTime(final AsciiSequenceView view)
    {
        if (!hasDerivativeMaturityTime)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeMaturityTime");
        }

        view.wrap(buffer, derivativeMaturityTimeOffset, derivativeMaturityTimeLength);
    }


    private char[] derivativeSettleOnOpenFlag = new char[1];

    private boolean hasDerivativeSettleOnOpenFlag;

    public char[] derivativeSettleOnOpenFlag()
    {
        if (!hasDerivativeSettleOnOpenFlag)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeSettleOnOpenFlag");
        }

        return derivativeSettleOnOpenFlag;
    }

    public boolean hasDerivativeSettleOnOpenFlag()
    {
        return hasDerivativeSettleOnOpenFlag;
    }


    private int derivativeSettleOnOpenFlagOffset;

    private int derivativeSettleOnOpenFlagLength;

    public int derivativeSettleOnOpenFlagLength()
    {
        if (!hasDerivativeSettleOnOpenFlag)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeSettleOnOpenFlag");
        }

        return derivativeSettleOnOpenFlagLength;
    }

    public String derivativeSettleOnOpenFlagAsString()
    {
        return hasDerivativeSettleOnOpenFlag ? new String(derivativeSettleOnOpenFlag, 0, derivativeSettleOnOpenFlagLength) : null;
    }

    public void derivativeSettleOnOpenFlag(final AsciiSequenceView view)
    {
        if (!hasDerivativeSettleOnOpenFlag)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeSettleOnOpenFlag");
        }

        view.wrap(buffer, derivativeSettleOnOpenFlagOffset, derivativeSettleOnOpenFlagLength);
    }


    private char derivativeInstrmtAssignmentMethod = MISSING_CHAR;

    private boolean hasDerivativeInstrmtAssignmentMethod;

    public char derivativeInstrmtAssignmentMethod()
    {
        if (!hasDerivativeInstrmtAssignmentMethod)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeInstrmtAssignmentMethod");
        }

        return derivativeInstrmtAssignmentMethod;
    }

    public boolean hasDerivativeInstrmtAssignmentMethod()
    {
        return hasDerivativeInstrmtAssignmentMethod;
    }



    private char[] derivativeSecurityStatus = new char[1];

    private boolean hasDerivativeSecurityStatus;

    public char[] derivativeSecurityStatus()
    {
        if (!hasDerivativeSecurityStatus)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeSecurityStatus");
        }

        return derivativeSecurityStatus;
    }

    public boolean hasDerivativeSecurityStatus()
    {
        return hasDerivativeSecurityStatus;
    }


    private int derivativeSecurityStatusOffset;

    private int derivativeSecurityStatusLength;

    public int derivativeSecurityStatusLength()
    {
        if (!hasDerivativeSecurityStatus)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeSecurityStatus");
        }

        return derivativeSecurityStatusLength;
    }

    public String derivativeSecurityStatusAsString()
    {
        return hasDerivativeSecurityStatus ? new String(derivativeSecurityStatus, 0, derivativeSecurityStatusLength) : null;
    }

    public void derivativeSecurityStatus(final AsciiSequenceView view)
    {
        if (!hasDerivativeSecurityStatus)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeSecurityStatus");
        }

        view.wrap(buffer, derivativeSecurityStatusOffset, derivativeSecurityStatusLength);
    }


    private byte[] derivativeIssueDate = new byte[8];

    private boolean hasDerivativeIssueDate;

    public byte[] derivativeIssueDate()
    {
        if (!hasDerivativeIssueDate)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeIssueDate");
        }

        return derivativeIssueDate;
    }

    public boolean hasDerivativeIssueDate()
    {
        return hasDerivativeIssueDate;
    }


    private int derivativeIssueDateOffset;

    private int derivativeIssueDateLength;

    public int derivativeIssueDateLength()
    {
        if (!hasDerivativeIssueDate)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeIssueDate");
        }

        return derivativeIssueDateLength;
    }

    public String derivativeIssueDateAsString()
    {
        return hasDerivativeIssueDate ? new String(derivativeIssueDate, 0, derivativeIssueDateLength) : null;
    }

    public void derivativeIssueDate(final AsciiSequenceView view)
    {
        if (!hasDerivativeIssueDate)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeIssueDate");
        }

        view.wrap(buffer, derivativeIssueDateOffset, derivativeIssueDateLength);
    }


    private char[] derivativeInstrRegistry = new char[1];

    private boolean hasDerivativeInstrRegistry;

    public char[] derivativeInstrRegistry()
    {
        if (!hasDerivativeInstrRegistry)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeInstrRegistry");
        }

        return derivativeInstrRegistry;
    }

    public boolean hasDerivativeInstrRegistry()
    {
        return hasDerivativeInstrRegistry;
    }


    private int derivativeInstrRegistryOffset;

    private int derivativeInstrRegistryLength;

    public int derivativeInstrRegistryLength()
    {
        if (!hasDerivativeInstrRegistry)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeInstrRegistry");
        }

        return derivativeInstrRegistryLength;
    }

    public String derivativeInstrRegistryAsString()
    {
        return hasDerivativeInstrRegistry ? new String(derivativeInstrRegistry, 0, derivativeInstrRegistryLength) : null;
    }

    public void derivativeInstrRegistry(final AsciiSequenceView view)
    {
        if (!hasDerivativeInstrRegistry)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeInstrRegistry");
        }

        view.wrap(buffer, derivativeInstrRegistryOffset, derivativeInstrRegistryLength);
    }


    private char[] derivativeCountryOfIssue = new char[1];

    private boolean hasDerivativeCountryOfIssue;

    public char[] derivativeCountryOfIssue()
    {
        if (!hasDerivativeCountryOfIssue)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeCountryOfIssue");
        }

        return derivativeCountryOfIssue;
    }

    public boolean hasDerivativeCountryOfIssue()
    {
        return hasDerivativeCountryOfIssue;
    }


    private int derivativeCountryOfIssueOffset;

    private int derivativeCountryOfIssueLength;

    public int derivativeCountryOfIssueLength()
    {
        if (!hasDerivativeCountryOfIssue)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeCountryOfIssue");
        }

        return derivativeCountryOfIssueLength;
    }

    public String derivativeCountryOfIssueAsString()
    {
        return hasDerivativeCountryOfIssue ? new String(derivativeCountryOfIssue, 0, derivativeCountryOfIssueLength) : null;
    }

    public void derivativeCountryOfIssue(final AsciiSequenceView view)
    {
        if (!hasDerivativeCountryOfIssue)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeCountryOfIssue");
        }

        view.wrap(buffer, derivativeCountryOfIssueOffset, derivativeCountryOfIssueLength);
    }


    private char[] derivativeStateOrProvinceOfIssue = new char[1];

    private boolean hasDerivativeStateOrProvinceOfIssue;

    public char[] derivativeStateOrProvinceOfIssue()
    {
        if (!hasDerivativeStateOrProvinceOfIssue)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeStateOrProvinceOfIssue");
        }

        return derivativeStateOrProvinceOfIssue;
    }

    public boolean hasDerivativeStateOrProvinceOfIssue()
    {
        return hasDerivativeStateOrProvinceOfIssue;
    }


    private int derivativeStateOrProvinceOfIssueOffset;

    private int derivativeStateOrProvinceOfIssueLength;

    public int derivativeStateOrProvinceOfIssueLength()
    {
        if (!hasDerivativeStateOrProvinceOfIssue)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeStateOrProvinceOfIssue");
        }

        return derivativeStateOrProvinceOfIssueLength;
    }

    public String derivativeStateOrProvinceOfIssueAsString()
    {
        return hasDerivativeStateOrProvinceOfIssue ? new String(derivativeStateOrProvinceOfIssue, 0, derivativeStateOrProvinceOfIssueLength) : null;
    }

    public void derivativeStateOrProvinceOfIssue(final AsciiSequenceView view)
    {
        if (!hasDerivativeStateOrProvinceOfIssue)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeStateOrProvinceOfIssue");
        }

        view.wrap(buffer, derivativeStateOrProvinceOfIssueOffset, derivativeStateOrProvinceOfIssueLength);
    }


    private char[] derivativeLocaleOfIssue = new char[1];

    private boolean hasDerivativeLocaleOfIssue;

    public char[] derivativeLocaleOfIssue()
    {
        if (!hasDerivativeLocaleOfIssue)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeLocaleOfIssue");
        }

        return derivativeLocaleOfIssue;
    }

    public boolean hasDerivativeLocaleOfIssue()
    {
        return hasDerivativeLocaleOfIssue;
    }


    private int derivativeLocaleOfIssueOffset;

    private int derivativeLocaleOfIssueLength;

    public int derivativeLocaleOfIssueLength()
    {
        if (!hasDerivativeLocaleOfIssue)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeLocaleOfIssue");
        }

        return derivativeLocaleOfIssueLength;
    }

    public String derivativeLocaleOfIssueAsString()
    {
        return hasDerivativeLocaleOfIssue ? new String(derivativeLocaleOfIssue, 0, derivativeLocaleOfIssueLength) : null;
    }

    public void derivativeLocaleOfIssue(final AsciiSequenceView view)
    {
        if (!hasDerivativeLocaleOfIssue)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeLocaleOfIssue");
        }

        view.wrap(buffer, derivativeLocaleOfIssueOffset, derivativeLocaleOfIssueLength);
    }


    private DecimalFloat derivativeStrikePrice = DecimalFloat.newNaNValue();

    private boolean hasDerivativeStrikePrice;

    public DecimalFloat derivativeStrikePrice()
    {
        if (!hasDerivativeStrikePrice)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeStrikePrice");
        }

        return derivativeStrikePrice;
    }

    public boolean hasDerivativeStrikePrice()
    {
        return hasDerivativeStrikePrice;
    }



    private char[] derivativeStrikeCurrency = new char[1];

    private boolean hasDerivativeStrikeCurrency;

    public char[] derivativeStrikeCurrency()
    {
        if (!hasDerivativeStrikeCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeStrikeCurrency");
        }

        return derivativeStrikeCurrency;
    }

    public boolean hasDerivativeStrikeCurrency()
    {
        return hasDerivativeStrikeCurrency;
    }


    private int derivativeStrikeCurrencyOffset;

    private int derivativeStrikeCurrencyLength;

    public int derivativeStrikeCurrencyLength()
    {
        if (!hasDerivativeStrikeCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeStrikeCurrency");
        }

        return derivativeStrikeCurrencyLength;
    }

    public String derivativeStrikeCurrencyAsString()
    {
        return hasDerivativeStrikeCurrency ? new String(derivativeStrikeCurrency, 0, derivativeStrikeCurrencyLength) : null;
    }

    public void derivativeStrikeCurrency(final AsciiSequenceView view)
    {
        if (!hasDerivativeStrikeCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeStrikeCurrency");
        }

        view.wrap(buffer, derivativeStrikeCurrencyOffset, derivativeStrikeCurrencyLength);
    }


    private DecimalFloat derivativeStrikeMultiplier = DecimalFloat.newNaNValue();

    private boolean hasDerivativeStrikeMultiplier;

    public DecimalFloat derivativeStrikeMultiplier()
    {
        if (!hasDerivativeStrikeMultiplier)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeStrikeMultiplier");
        }

        return derivativeStrikeMultiplier;
    }

    public boolean hasDerivativeStrikeMultiplier()
    {
        return hasDerivativeStrikeMultiplier;
    }



    private DecimalFloat derivativeStrikeValue = DecimalFloat.newNaNValue();

    private boolean hasDerivativeStrikeValue;

    public DecimalFloat derivativeStrikeValue()
    {
        if (!hasDerivativeStrikeValue)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeStrikeValue");
        }

        return derivativeStrikeValue;
    }

    public boolean hasDerivativeStrikeValue()
    {
        return hasDerivativeStrikeValue;
    }



    private char derivativeOptAttribute = MISSING_CHAR;

    private boolean hasDerivativeOptAttribute;

    public char derivativeOptAttribute()
    {
        if (!hasDerivativeOptAttribute)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeOptAttribute");
        }

        return derivativeOptAttribute;
    }

    public boolean hasDerivativeOptAttribute()
    {
        return hasDerivativeOptAttribute;
    }



    private DecimalFloat derivativeContractMultiplier = DecimalFloat.newNaNValue();

    private boolean hasDerivativeContractMultiplier;

    public DecimalFloat derivativeContractMultiplier()
    {
        if (!hasDerivativeContractMultiplier)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeContractMultiplier");
        }

        return derivativeContractMultiplier;
    }

    public boolean hasDerivativeContractMultiplier()
    {
        return hasDerivativeContractMultiplier;
    }



    private int derivativeContractMultiplierUnit = MISSING_INT;

    private boolean hasDerivativeContractMultiplierUnit;

    public int derivativeContractMultiplierUnit()
    {
        if (!hasDerivativeContractMultiplierUnit)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeContractMultiplierUnit");
        }

        return derivativeContractMultiplierUnit;
    }

    public boolean hasDerivativeContractMultiplierUnit()
    {
        return hasDerivativeContractMultiplierUnit;
    }



    private int derivativeFlowScheduleType = MISSING_INT;

    private boolean hasDerivativeFlowScheduleType;

    public int derivativeFlowScheduleType()
    {
        if (!hasDerivativeFlowScheduleType)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeFlowScheduleType");
        }

        return derivativeFlowScheduleType;
    }

    public boolean hasDerivativeFlowScheduleType()
    {
        return hasDerivativeFlowScheduleType;
    }



    private DecimalFloat derivativeMinPriceIncrement = DecimalFloat.newNaNValue();

    private boolean hasDerivativeMinPriceIncrement;

    public DecimalFloat derivativeMinPriceIncrement()
    {
        if (!hasDerivativeMinPriceIncrement)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeMinPriceIncrement");
        }

        return derivativeMinPriceIncrement;
    }

    public boolean hasDerivativeMinPriceIncrement()
    {
        return hasDerivativeMinPriceIncrement;
    }



    private DecimalFloat derivativeMinPriceIncrementAmount = DecimalFloat.newNaNValue();

    private boolean hasDerivativeMinPriceIncrementAmount;

    public DecimalFloat derivativeMinPriceIncrementAmount()
    {
        if (!hasDerivativeMinPriceIncrementAmount)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeMinPriceIncrementAmount");
        }

        return derivativeMinPriceIncrementAmount;
    }

    public boolean hasDerivativeMinPriceIncrementAmount()
    {
        return hasDerivativeMinPriceIncrementAmount;
    }



    private char[] derivativeUnitOfMeasure = new char[1];

    private boolean hasDerivativeUnitOfMeasure;

    public char[] derivativeUnitOfMeasure()
    {
        if (!hasDerivativeUnitOfMeasure)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeUnitOfMeasure");
        }

        return derivativeUnitOfMeasure;
    }

    public boolean hasDerivativeUnitOfMeasure()
    {
        return hasDerivativeUnitOfMeasure;
    }


    private int derivativeUnitOfMeasureOffset;

    private int derivativeUnitOfMeasureLength;

    public int derivativeUnitOfMeasureLength()
    {
        if (!hasDerivativeUnitOfMeasure)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeUnitOfMeasure");
        }

        return derivativeUnitOfMeasureLength;
    }

    public String derivativeUnitOfMeasureAsString()
    {
        return hasDerivativeUnitOfMeasure ? new String(derivativeUnitOfMeasure, 0, derivativeUnitOfMeasureLength) : null;
    }

    public void derivativeUnitOfMeasure(final AsciiSequenceView view)
    {
        if (!hasDerivativeUnitOfMeasure)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeUnitOfMeasure");
        }

        view.wrap(buffer, derivativeUnitOfMeasureOffset, derivativeUnitOfMeasureLength);
    }


    private DecimalFloat derivativeUnitOfMeasureQty = DecimalFloat.newNaNValue();

    private boolean hasDerivativeUnitOfMeasureQty;

    public DecimalFloat derivativeUnitOfMeasureQty()
    {
        if (!hasDerivativeUnitOfMeasureQty)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeUnitOfMeasureQty");
        }

        return derivativeUnitOfMeasureQty;
    }

    public boolean hasDerivativeUnitOfMeasureQty()
    {
        return hasDerivativeUnitOfMeasureQty;
    }



    private char[] derivativePriceUnitOfMeasure = new char[1];

    private boolean hasDerivativePriceUnitOfMeasure;

    public char[] derivativePriceUnitOfMeasure()
    {
        if (!hasDerivativePriceUnitOfMeasure)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativePriceUnitOfMeasure");
        }

        return derivativePriceUnitOfMeasure;
    }

    public boolean hasDerivativePriceUnitOfMeasure()
    {
        return hasDerivativePriceUnitOfMeasure;
    }


    private int derivativePriceUnitOfMeasureOffset;

    private int derivativePriceUnitOfMeasureLength;

    public int derivativePriceUnitOfMeasureLength()
    {
        if (!hasDerivativePriceUnitOfMeasure)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativePriceUnitOfMeasure");
        }

        return derivativePriceUnitOfMeasureLength;
    }

    public String derivativePriceUnitOfMeasureAsString()
    {
        return hasDerivativePriceUnitOfMeasure ? new String(derivativePriceUnitOfMeasure, 0, derivativePriceUnitOfMeasureLength) : null;
    }

    public void derivativePriceUnitOfMeasure(final AsciiSequenceView view)
    {
        if (!hasDerivativePriceUnitOfMeasure)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativePriceUnitOfMeasure");
        }

        view.wrap(buffer, derivativePriceUnitOfMeasureOffset, derivativePriceUnitOfMeasureLength);
    }


    private DecimalFloat derivativePriceUnitOfMeasureQty = DecimalFloat.newNaNValue();

    private boolean hasDerivativePriceUnitOfMeasureQty;

    public DecimalFloat derivativePriceUnitOfMeasureQty()
    {
        if (!hasDerivativePriceUnitOfMeasureQty)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativePriceUnitOfMeasureQty");
        }

        return derivativePriceUnitOfMeasureQty;
    }

    public boolean hasDerivativePriceUnitOfMeasureQty()
    {
        return hasDerivativePriceUnitOfMeasureQty;
    }



    private char derivativeSettlMethod = MISSING_CHAR;

    private boolean hasDerivativeSettlMethod;

    public char derivativeSettlMethod()
    {
        if (!hasDerivativeSettlMethod)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeSettlMethod");
        }

        return derivativeSettlMethod;
    }

    public boolean hasDerivativeSettlMethod()
    {
        return hasDerivativeSettlMethod;
    }



    private char[] derivativePriceQuoteMethod = new char[1];

    private boolean hasDerivativePriceQuoteMethod;

    public char[] derivativePriceQuoteMethod()
    {
        if (!hasDerivativePriceQuoteMethod)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativePriceQuoteMethod");
        }

        return derivativePriceQuoteMethod;
    }

    public boolean hasDerivativePriceQuoteMethod()
    {
        return hasDerivativePriceQuoteMethod;
    }


    private int derivativePriceQuoteMethodOffset;

    private int derivativePriceQuoteMethodLength;

    public int derivativePriceQuoteMethodLength()
    {
        if (!hasDerivativePriceQuoteMethod)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativePriceQuoteMethod");
        }

        return derivativePriceQuoteMethodLength;
    }

    public String derivativePriceQuoteMethodAsString()
    {
        return hasDerivativePriceQuoteMethod ? new String(derivativePriceQuoteMethod, 0, derivativePriceQuoteMethodLength) : null;
    }

    public void derivativePriceQuoteMethod(final AsciiSequenceView view)
    {
        if (!hasDerivativePriceQuoteMethod)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativePriceQuoteMethod");
        }

        view.wrap(buffer, derivativePriceQuoteMethodOffset, derivativePriceQuoteMethodLength);
    }


    private char[] derivativeValuationMethod = new char[1];

    private boolean hasDerivativeValuationMethod;

    public char[] derivativeValuationMethod()
    {
        if (!hasDerivativeValuationMethod)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeValuationMethod");
        }

        return derivativeValuationMethod;
    }

    public boolean hasDerivativeValuationMethod()
    {
        return hasDerivativeValuationMethod;
    }


    private int derivativeValuationMethodOffset;

    private int derivativeValuationMethodLength;

    public int derivativeValuationMethodLength()
    {
        if (!hasDerivativeValuationMethod)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeValuationMethod");
        }

        return derivativeValuationMethodLength;
    }

    public String derivativeValuationMethodAsString()
    {
        return hasDerivativeValuationMethod ? new String(derivativeValuationMethod, 0, derivativeValuationMethodLength) : null;
    }

    public void derivativeValuationMethod(final AsciiSequenceView view)
    {
        if (!hasDerivativeValuationMethod)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeValuationMethod");
        }

        view.wrap(buffer, derivativeValuationMethodOffset, derivativeValuationMethodLength);
    }


    private int derivativeListMethod = MISSING_INT;

    private boolean hasDerivativeListMethod;

    public int derivativeListMethod()
    {
        if (!hasDerivativeListMethod)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeListMethod");
        }

        return derivativeListMethod;
    }

    public boolean hasDerivativeListMethod()
    {
        return hasDerivativeListMethod;
    }



    private DecimalFloat derivativeCapPrice = DecimalFloat.newNaNValue();

    private boolean hasDerivativeCapPrice;

    public DecimalFloat derivativeCapPrice()
    {
        if (!hasDerivativeCapPrice)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeCapPrice");
        }

        return derivativeCapPrice;
    }

    public boolean hasDerivativeCapPrice()
    {
        return hasDerivativeCapPrice;
    }



    private DecimalFloat derivativeFloorPrice = DecimalFloat.newNaNValue();

    private boolean hasDerivativeFloorPrice;

    public DecimalFloat derivativeFloorPrice()
    {
        if (!hasDerivativeFloorPrice)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeFloorPrice");
        }

        return derivativeFloorPrice;
    }

    public boolean hasDerivativeFloorPrice()
    {
        return hasDerivativeFloorPrice;
    }



    private int derivativePutOrCall = MISSING_INT;

    private boolean hasDerivativePutOrCall;

    public int derivativePutOrCall()
    {
        if (!hasDerivativePutOrCall)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativePutOrCall");
        }

        return derivativePutOrCall;
    }

    public boolean hasDerivativePutOrCall()
    {
        return hasDerivativePutOrCall;
    }



    private char derivativeExerciseStyle = MISSING_CHAR;

    private boolean hasDerivativeExerciseStyle;

    public char derivativeExerciseStyle()
    {
        if (!hasDerivativeExerciseStyle)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeExerciseStyle");
        }

        return derivativeExerciseStyle;
    }

    public boolean hasDerivativeExerciseStyle()
    {
        return hasDerivativeExerciseStyle;
    }



    private DecimalFloat derivativeOptPayAmount = DecimalFloat.newNaNValue();

    private boolean hasDerivativeOptPayAmount;

    public DecimalFloat derivativeOptPayAmount()
    {
        if (!hasDerivativeOptPayAmount)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeOptPayAmount");
        }

        return derivativeOptPayAmount;
    }

    public boolean hasDerivativeOptPayAmount()
    {
        return hasDerivativeOptPayAmount;
    }



    private char[] derivativeTimeUnit = new char[1];

    private boolean hasDerivativeTimeUnit;

    public char[] derivativeTimeUnit()
    {
        if (!hasDerivativeTimeUnit)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeTimeUnit");
        }

        return derivativeTimeUnit;
    }

    public boolean hasDerivativeTimeUnit()
    {
        return hasDerivativeTimeUnit;
    }


    private int derivativeTimeUnitOffset;

    private int derivativeTimeUnitLength;

    public int derivativeTimeUnitLength()
    {
        if (!hasDerivativeTimeUnit)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeTimeUnit");
        }

        return derivativeTimeUnitLength;
    }

    public String derivativeTimeUnitAsString()
    {
        return hasDerivativeTimeUnit ? new String(derivativeTimeUnit, 0, derivativeTimeUnitLength) : null;
    }

    public void derivativeTimeUnit(final AsciiSequenceView view)
    {
        if (!hasDerivativeTimeUnit)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeTimeUnit");
        }

        view.wrap(buffer, derivativeTimeUnitOffset, derivativeTimeUnitLength);
    }


    private char[] derivativeSecurityExchange = new char[1];

    private boolean hasDerivativeSecurityExchange;

    public char[] derivativeSecurityExchange()
    {
        if (!hasDerivativeSecurityExchange)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeSecurityExchange");
        }

        return derivativeSecurityExchange;
    }

    public boolean hasDerivativeSecurityExchange()
    {
        return hasDerivativeSecurityExchange;
    }


    private int derivativeSecurityExchangeOffset;

    private int derivativeSecurityExchangeLength;

    public int derivativeSecurityExchangeLength()
    {
        if (!hasDerivativeSecurityExchange)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeSecurityExchange");
        }

        return derivativeSecurityExchangeLength;
    }

    public String derivativeSecurityExchangeAsString()
    {
        return hasDerivativeSecurityExchange ? new String(derivativeSecurityExchange, 0, derivativeSecurityExchangeLength) : null;
    }

    public void derivativeSecurityExchange(final AsciiSequenceView view)
    {
        if (!hasDerivativeSecurityExchange)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeSecurityExchange");
        }

        view.wrap(buffer, derivativeSecurityExchangeOffset, derivativeSecurityExchangeLength);
    }


    private int derivativePositionLimit = MISSING_INT;

    private boolean hasDerivativePositionLimit;

    public int derivativePositionLimit()
    {
        if (!hasDerivativePositionLimit)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativePositionLimit");
        }

        return derivativePositionLimit;
    }

    public boolean hasDerivativePositionLimit()
    {
        return hasDerivativePositionLimit;
    }



    private int derivativeNTPositionLimit = MISSING_INT;

    private boolean hasDerivativeNTPositionLimit;

    public int derivativeNTPositionLimit()
    {
        if (!hasDerivativeNTPositionLimit)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeNTPositionLimit");
        }

        return derivativeNTPositionLimit;
    }

    public boolean hasDerivativeNTPositionLimit()
    {
        return hasDerivativeNTPositionLimit;
    }



    private char[] derivativeIssuer = new char[1];

    private boolean hasDerivativeIssuer;

    public char[] derivativeIssuer()
    {
        if (!hasDerivativeIssuer)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeIssuer");
        }

        return derivativeIssuer;
    }

    public boolean hasDerivativeIssuer()
    {
        return hasDerivativeIssuer;
    }


    private int derivativeIssuerOffset;

    private int derivativeIssuerLength;

    public int derivativeIssuerLength()
    {
        if (!hasDerivativeIssuer)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeIssuer");
        }

        return derivativeIssuerLength;
    }

    public String derivativeIssuerAsString()
    {
        return hasDerivativeIssuer ? new String(derivativeIssuer, 0, derivativeIssuerLength) : null;
    }

    public void derivativeIssuer(final AsciiSequenceView view)
    {
        if (!hasDerivativeIssuer)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeIssuer");
        }

        view.wrap(buffer, derivativeIssuerOffset, derivativeIssuerLength);
    }


    private int derivativeEncodedIssuerLen = MISSING_INT;

    private boolean hasDerivativeEncodedIssuerLen;

    public int derivativeEncodedIssuerLen()
    {
        if (!hasDerivativeEncodedIssuerLen)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeEncodedIssuerLen");
        }

        return derivativeEncodedIssuerLen;
    }

    public boolean hasDerivativeEncodedIssuerLen()
    {
        return hasDerivativeEncodedIssuerLen;
    }



    private byte[] derivativeEncodedIssuer = new byte[1];

    private boolean hasDerivativeEncodedIssuer;

    public byte[] derivativeEncodedIssuer()
    {
        if (!hasDerivativeEncodedIssuer)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeEncodedIssuer");
        }

        return derivativeEncodedIssuer;
    }

    public boolean hasDerivativeEncodedIssuer()
    {
        return hasDerivativeEncodedIssuer;
    }



    private char[] derivativeSecurityDesc = new char[1];

    private boolean hasDerivativeSecurityDesc;

    public char[] derivativeSecurityDesc()
    {
        if (!hasDerivativeSecurityDesc)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeSecurityDesc");
        }

        return derivativeSecurityDesc;
    }

    public boolean hasDerivativeSecurityDesc()
    {
        return hasDerivativeSecurityDesc;
    }


    private int derivativeSecurityDescOffset;

    private int derivativeSecurityDescLength;

    public int derivativeSecurityDescLength()
    {
        if (!hasDerivativeSecurityDesc)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeSecurityDesc");
        }

        return derivativeSecurityDescLength;
    }

    public String derivativeSecurityDescAsString()
    {
        return hasDerivativeSecurityDesc ? new String(derivativeSecurityDesc, 0, derivativeSecurityDescLength) : null;
    }

    public void derivativeSecurityDesc(final AsciiSequenceView view)
    {
        if (!hasDerivativeSecurityDesc)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeSecurityDesc");
        }

        view.wrap(buffer, derivativeSecurityDescOffset, derivativeSecurityDescLength);
    }


    private int derivativeEncodedSecurityDescLen = MISSING_INT;

    private boolean hasDerivativeEncodedSecurityDescLen;

    public int derivativeEncodedSecurityDescLen()
    {
        if (!hasDerivativeEncodedSecurityDescLen)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeEncodedSecurityDescLen");
        }

        return derivativeEncodedSecurityDescLen;
    }

    public boolean hasDerivativeEncodedSecurityDescLen()
    {
        return hasDerivativeEncodedSecurityDescLen;
    }



    private byte[] derivativeEncodedSecurityDesc = new byte[1];

    private boolean hasDerivativeEncodedSecurityDesc;

    public byte[] derivativeEncodedSecurityDesc()
    {
        if (!hasDerivativeEncodedSecurityDesc)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeEncodedSecurityDesc");
        }

        return derivativeEncodedSecurityDesc;
    }

    public boolean hasDerivativeEncodedSecurityDesc()
    {
        return hasDerivativeEncodedSecurityDesc;
    }




    private int derivativeSecurityXMLLen = MISSING_INT;

    private boolean hasDerivativeSecurityXMLLen;

    public int derivativeSecurityXMLLen()
    {
        if (!hasDerivativeSecurityXMLLen)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeSecurityXMLLen");
        }

        return derivativeSecurityXMLLen;
    }

    public boolean hasDerivativeSecurityXMLLen()
    {
        return hasDerivativeSecurityXMLLen;
    }



    private byte[] derivativeSecurityXML = new byte[1];

    private boolean hasDerivativeSecurityXML;

    public byte[] derivativeSecurityXML()
    {
        if (!hasDerivativeSecurityXML)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeSecurityXML");
        }

        return derivativeSecurityXML;
    }

    public boolean hasDerivativeSecurityXML()
    {
        return hasDerivativeSecurityXML;
    }



    private char[] derivativeSecurityXMLSchema = new char[1];

    private boolean hasDerivativeSecurityXMLSchema;

    public char[] derivativeSecurityXMLSchema()
    {
        if (!hasDerivativeSecurityXMLSchema)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeSecurityXMLSchema");
        }

        return derivativeSecurityXMLSchema;
    }

    public boolean hasDerivativeSecurityXMLSchema()
    {
        return hasDerivativeSecurityXMLSchema;
    }


    private int derivativeSecurityXMLSchemaOffset;

    private int derivativeSecurityXMLSchemaLength;

    public int derivativeSecurityXMLSchemaLength()
    {
        if (!hasDerivativeSecurityXMLSchema)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeSecurityXMLSchema");
        }

        return derivativeSecurityXMLSchemaLength;
    }

    public String derivativeSecurityXMLSchemaAsString()
    {
        return hasDerivativeSecurityXMLSchema ? new String(derivativeSecurityXMLSchema, 0, derivativeSecurityXMLSchemaLength) : null;
    }

    public void derivativeSecurityXMLSchema(final AsciiSequenceView view)
    {
        if (!hasDerivativeSecurityXMLSchema)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeSecurityXMLSchema");
        }

        view.wrap(buffer, derivativeSecurityXMLSchemaOffset, derivativeSecurityXMLSchemaLength);
    }



    private byte[] derivativeContractSettlMonth = new byte[8];

    private boolean hasDerivativeContractSettlMonth;

    public byte[] derivativeContractSettlMonth()
    {
        if (!hasDerivativeContractSettlMonth)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeContractSettlMonth");
        }

        return derivativeContractSettlMonth;
    }

    public boolean hasDerivativeContractSettlMonth()
    {
        return hasDerivativeContractSettlMonth;
    }


    private int derivativeContractSettlMonthOffset;

    private int derivativeContractSettlMonthLength;

    public int derivativeContractSettlMonthLength()
    {
        if (!hasDerivativeContractSettlMonth)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeContractSettlMonth");
        }

        return derivativeContractSettlMonthLength;
    }

    public String derivativeContractSettlMonthAsString()
    {
        return hasDerivativeContractSettlMonth ? new String(derivativeContractSettlMonth, 0, derivativeContractSettlMonthLength) : null;
    }

    public void derivativeContractSettlMonth(final AsciiSequenceView view)
    {
        if (!hasDerivativeContractSettlMonth)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeContractSettlMonth");
        }

        view.wrap(buffer, derivativeContractSettlMonthOffset, derivativeContractSettlMonthLength);
    }




    private DerivativeEventsGroupDecoder derivativeEventsGroup = null;
    public DerivativeEventsGroupDecoder derivativeEventsGroup()
    {
        return derivativeEventsGroup;
    }

    private int noDerivativeEventsGroupCounter = MISSING_INT;

    private boolean hasNoDerivativeEventsGroupCounter;

    public int noDerivativeEventsGroupCounter()
    {
        if (!hasNoDerivativeEventsGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoDerivativeEventsGroupCounter");
        }

        return noDerivativeEventsGroupCounter;
    }

    public boolean hasNoDerivativeEventsGroupCounter()
    {
        return hasNoDerivativeEventsGroupCounter;
    }




    private DerivativeEventsGroupIterator derivativeEventsGroupIterator = new DerivativeEventsGroupIterator(this);
    public DerivativeEventsGroupIterator derivativeEventsGroupIterator()
    {
        return derivativeEventsGroupIterator.iterator();
    }




    private DerivativeInstrumentPartiesGroupDecoder derivativeInstrumentPartiesGroup = null;
    public DerivativeInstrumentPartiesGroupDecoder derivativeInstrumentPartiesGroup()
    {
        return derivativeInstrumentPartiesGroup;
    }

    private int noDerivativeInstrumentPartiesGroupCounter = MISSING_INT;

    private boolean hasNoDerivativeInstrumentPartiesGroupCounter;

    public int noDerivativeInstrumentPartiesGroupCounter()
    {
        if (!hasNoDerivativeInstrumentPartiesGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoDerivativeInstrumentPartiesGroupCounter");
        }

        return noDerivativeInstrumentPartiesGroupCounter;
    }

    public boolean hasNoDerivativeInstrumentPartiesGroupCounter()
    {
        return hasNoDerivativeInstrumentPartiesGroupCounter;
    }




    private DerivativeInstrumentPartiesGroupIterator derivativeInstrumentPartiesGroupIterator = new DerivativeInstrumentPartiesGroupIterator(this);
    public DerivativeInstrumentPartiesGroupIterator derivativeInstrumentPartiesGroupIterator()
    {
        return derivativeInstrumentPartiesGroupIterator.iterator();
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

    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode DerivativeSecurityListRequest
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
            case Constants.SECURITY_REQ_ID:
                securityReqID = buffer.getChars(securityReqID, valueOffset, valueLength);
                securityReqIDOffset = valueOffset;
                securityReqIDLength = valueLength;
                break;

            case Constants.SECURITY_LIST_REQUEST_TYPE:
                securityListRequestType = getInt(buffer, valueOffset, endOfField, 559, CODEC_VALIDATION_ENABLED);
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

            case Constants.UNDERLYING_SYMBOL:
                hasUnderlyingSymbol = true;
                underlyingSymbol = buffer.getChars(underlyingSymbol, valueOffset, valueLength);
                underlyingSymbolOffset = valueOffset;
                underlyingSymbolLength = valueLength;
                break;

            case Constants.UNDERLYING_SYMBOL_SFX:
                hasUnderlyingSymbolSfx = true;
                underlyingSymbolSfx = buffer.getChars(underlyingSymbolSfx, valueOffset, valueLength);
                underlyingSymbolSfxOffset = valueOffset;
                underlyingSymbolSfxLength = valueLength;
                break;

            case Constants.UNDERLYING_SECURITY_ID:
                hasUnderlyingSecurityID = true;
                underlyingSecurityID = buffer.getChars(underlyingSecurityID, valueOffset, valueLength);
                underlyingSecurityIDOffset = valueOffset;
                underlyingSecurityIDLength = valueLength;
                break;

            case Constants.UNDERLYING_SECURITY_ID_SOURCE:
                hasUnderlyingSecurityIDSource = true;
                underlyingSecurityIDSource = buffer.getChars(underlyingSecurityIDSource, valueOffset, valueLength);
                underlyingSecurityIDSourceOffset = valueOffset;
                underlyingSecurityIDSourceLength = valueLength;
                break;

            case Constants.NO_UNDERLYING_SECURITY_ALT_ID:
                hasNoUnderlyingSecurityAltIDGroupCounter = true;
                noUnderlyingSecurityAltIDGroupCounter = getInt(buffer, valueOffset, endOfField, 457, CODEC_VALIDATION_ENABLED);
                if (underlyingSecurityAltIDGroup == null)
                {
                    underlyingSecurityAltIDGroup = new UnderlyingSecurityAltIDGroupDecoder(trailer, messageFields);
                }
                UnderlyingSecurityAltIDGroupDecoder underlyingSecurityAltIDGroupCurrent = underlyingSecurityAltIDGroup;
                position = endOfField + 1;
                final int noUnderlyingSecurityAltIDGroupCounter = this.noUnderlyingSecurityAltIDGroupCounter;
                for (int i = 0; i < noUnderlyingSecurityAltIDGroupCounter && position < end; i++)
                {
                    if (underlyingSecurityAltIDGroupCurrent != null)
                    {
                        position += underlyingSecurityAltIDGroupCurrent.decode(buffer, position, end - position);
                        underlyingSecurityAltIDGroupCurrent = underlyingSecurityAltIDGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (underlyingSecurityAltIDGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;


            case Constants.UNDERLYING_PRODUCT:
                hasUnderlyingProduct = true;
                underlyingProduct = getInt(buffer, valueOffset, endOfField, 462, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.UNDERLYING_C_F_I_CODE:
                hasUnderlyingCFICode = true;
                underlyingCFICode = buffer.getChars(underlyingCFICode, valueOffset, valueLength);
                underlyingCFICodeOffset = valueOffset;
                underlyingCFICodeLength = valueLength;
                break;

            case Constants.UNDERLYING_SECURITY_TYPE:
                hasUnderlyingSecurityType = true;
                underlyingSecurityType = buffer.getChars(underlyingSecurityType, valueOffset, valueLength);
                underlyingSecurityTypeOffset = valueOffset;
                underlyingSecurityTypeLength = valueLength;
                break;

            case Constants.UNDERLYING_SECURITY_SUB_TYPE:
                hasUnderlyingSecuritySubType = true;
                underlyingSecuritySubType = buffer.getChars(underlyingSecuritySubType, valueOffset, valueLength);
                underlyingSecuritySubTypeOffset = valueOffset;
                underlyingSecuritySubTypeLength = valueLength;
                break;

            case Constants.UNDERLYING_MATURITY_MONTH_YEAR:
                hasUnderlyingMaturityMonthYear = true;
                underlyingMaturityMonthYear = buffer.getBytes(underlyingMaturityMonthYear, valueOffset, valueLength);
                underlyingMaturityMonthYearOffset = valueOffset;
                underlyingMaturityMonthYearLength = valueLength;
                break;

            case Constants.UNDERLYING_MATURITY_DATE:
                hasUnderlyingMaturityDate = true;
                underlyingMaturityDate = buffer.getBytes(underlyingMaturityDate, valueOffset, valueLength);
                underlyingMaturityDateOffset = valueOffset;
                underlyingMaturityDateLength = valueLength;
                break;

            case Constants.UNDERLYING_MATURITY_TIME:
                hasUnderlyingMaturityTime = true;
                underlyingMaturityTime = buffer.getBytes(underlyingMaturityTime, valueOffset, valueLength);
                underlyingMaturityTimeOffset = valueOffset;
                underlyingMaturityTimeLength = valueLength;
                break;

            case Constants.UNDERLYING_COUPON_PAYMENT_DATE:
                hasUnderlyingCouponPaymentDate = true;
                underlyingCouponPaymentDate = buffer.getBytes(underlyingCouponPaymentDate, valueOffset, valueLength);
                underlyingCouponPaymentDateOffset = valueOffset;
                underlyingCouponPaymentDateLength = valueLength;
                break;

            case Constants.UNDERLYING_RESTRUCTURING_TYPE:
                hasUnderlyingRestructuringType = true;
                underlyingRestructuringType = buffer.getChars(underlyingRestructuringType, valueOffset, valueLength);
                underlyingRestructuringTypeOffset = valueOffset;
                underlyingRestructuringTypeLength = valueLength;
                break;

            case Constants.UNDERLYING_SENIORITY:
                hasUnderlyingSeniority = true;
                underlyingSeniority = buffer.getChars(underlyingSeniority, valueOffset, valueLength);
                underlyingSeniorityOffset = valueOffset;
                underlyingSeniorityLength = valueLength;
                break;

            case Constants.UNDERLYING_NOTIONAL_PERCENTAGE_OUTSTANDING:
                hasUnderlyingNotionalPercentageOutstanding = true;
                underlyingNotionalPercentageOutstanding = getFloat(buffer, underlyingNotionalPercentageOutstanding, valueOffset, valueLength, 1455, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.UNDERLYING_ORIGINAL_NOTIONAL_PERCENTAGE_OUTSTANDING:
                hasUnderlyingOriginalNotionalPercentageOutstanding = true;
                underlyingOriginalNotionalPercentageOutstanding = getFloat(buffer, underlyingOriginalNotionalPercentageOutstanding, valueOffset, valueLength, 1456, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.UNDERLYING_ATTACHMENT_POINT:
                hasUnderlyingAttachmentPoint = true;
                underlyingAttachmentPoint = getFloat(buffer, underlyingAttachmentPoint, valueOffset, valueLength, 1459, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.UNDERLYING_DETACHMENT_POINT:
                hasUnderlyingDetachmentPoint = true;
                underlyingDetachmentPoint = getFloat(buffer, underlyingDetachmentPoint, valueOffset, valueLength, 1460, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.UNDERLYING_ISSUE_DATE:
                hasUnderlyingIssueDate = true;
                underlyingIssueDate = buffer.getBytes(underlyingIssueDate, valueOffset, valueLength);
                underlyingIssueDateOffset = valueOffset;
                underlyingIssueDateLength = valueLength;
                break;

            case Constants.UNDERLYING_REPO_COLLATERAL_SECURITY_TYPE:
                hasUnderlyingRepoCollateralSecurityType = true;
                underlyingRepoCollateralSecurityType = buffer.getChars(underlyingRepoCollateralSecurityType, valueOffset, valueLength);
                underlyingRepoCollateralSecurityTypeOffset = valueOffset;
                underlyingRepoCollateralSecurityTypeLength = valueLength;
                break;

            case Constants.UNDERLYING_REPURCHASE_TERM:
                hasUnderlyingRepurchaseTerm = true;
                underlyingRepurchaseTerm = getInt(buffer, valueOffset, endOfField, 244, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.UNDERLYING_REPURCHASE_RATE:
                hasUnderlyingRepurchaseRate = true;
                underlyingRepurchaseRate = getFloat(buffer, underlyingRepurchaseRate, valueOffset, valueLength, 245, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.UNDERLYING_FACTOR:
                hasUnderlyingFactor = true;
                underlyingFactor = getFloat(buffer, underlyingFactor, valueOffset, valueLength, 246, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.UNDERLYING_CREDIT_RATING:
                hasUnderlyingCreditRating = true;
                underlyingCreditRating = buffer.getChars(underlyingCreditRating, valueOffset, valueLength);
                underlyingCreditRatingOffset = valueOffset;
                underlyingCreditRatingLength = valueLength;
                break;

            case Constants.UNDERLYING_INSTR_REGISTRY:
                hasUnderlyingInstrRegistry = true;
                underlyingInstrRegistry = buffer.getChars(underlyingInstrRegistry, valueOffset, valueLength);
                underlyingInstrRegistryOffset = valueOffset;
                underlyingInstrRegistryLength = valueLength;
                break;

            case Constants.UNDERLYING_COUNTRY_OF_ISSUE:
                hasUnderlyingCountryOfIssue = true;
                underlyingCountryOfIssue = buffer.getChars(underlyingCountryOfIssue, valueOffset, valueLength);
                underlyingCountryOfIssueOffset = valueOffset;
                underlyingCountryOfIssueLength = valueLength;
                break;

            case Constants.UNDERLYING_STATE_OR_PROVINCE_OF_ISSUE:
                hasUnderlyingStateOrProvinceOfIssue = true;
                underlyingStateOrProvinceOfIssue = buffer.getChars(underlyingStateOrProvinceOfIssue, valueOffset, valueLength);
                underlyingStateOrProvinceOfIssueOffset = valueOffset;
                underlyingStateOrProvinceOfIssueLength = valueLength;
                break;

            case Constants.UNDERLYING_LOCALE_OF_ISSUE:
                hasUnderlyingLocaleOfIssue = true;
                underlyingLocaleOfIssue = buffer.getChars(underlyingLocaleOfIssue, valueOffset, valueLength);
                underlyingLocaleOfIssueOffset = valueOffset;
                underlyingLocaleOfIssueLength = valueLength;
                break;

            case Constants.UNDERLYING_REDEMPTION_DATE:
                hasUnderlyingRedemptionDate = true;
                underlyingRedemptionDate = buffer.getBytes(underlyingRedemptionDate, valueOffset, valueLength);
                underlyingRedemptionDateOffset = valueOffset;
                underlyingRedemptionDateLength = valueLength;
                break;

            case Constants.UNDERLYING_STRIKE_PRICE:
                hasUnderlyingStrikePrice = true;
                underlyingStrikePrice = getFloat(buffer, underlyingStrikePrice, valueOffset, valueLength, 316, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.UNDERLYING_STRIKE_CURRENCY:
                hasUnderlyingStrikeCurrency = true;
                underlyingStrikeCurrency = buffer.getChars(underlyingStrikeCurrency, valueOffset, valueLength);
                underlyingStrikeCurrencyOffset = valueOffset;
                underlyingStrikeCurrencyLength = valueLength;
                break;

            case Constants.UNDERLYING_OPT_ATTRIBUTE:
                hasUnderlyingOptAttribute = true;
                underlyingOptAttribute = buffer.getChar(valueOffset);
                break;

            case Constants.UNDERLYING_CONTRACT_MULTIPLIER:
                hasUnderlyingContractMultiplier = true;
                underlyingContractMultiplier = getFloat(buffer, underlyingContractMultiplier, valueOffset, valueLength, 436, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.UNDERLYING_CONTRACT_MULTIPLIER_UNIT:
                hasUnderlyingContractMultiplierUnit = true;
                underlyingContractMultiplierUnit = getInt(buffer, valueOffset, endOfField, 1437, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.UNDERLYING_FLOW_SCHEDULE_TYPE:
                hasUnderlyingFlowScheduleType = true;
                underlyingFlowScheduleType = getInt(buffer, valueOffset, endOfField, 1441, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.UNDERLYING_UNIT_OF_MEASURE:
                hasUnderlyingUnitOfMeasure = true;
                underlyingUnitOfMeasure = buffer.getChars(underlyingUnitOfMeasure, valueOffset, valueLength);
                underlyingUnitOfMeasureOffset = valueOffset;
                underlyingUnitOfMeasureLength = valueLength;
                break;

            case Constants.UNDERLYING_UNIT_OF_MEASURE_QTY:
                hasUnderlyingUnitOfMeasureQty = true;
                underlyingUnitOfMeasureQty = getFloat(buffer, underlyingUnitOfMeasureQty, valueOffset, valueLength, 1423, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.UNDERLYING_PRICE_UNIT_OF_MEASURE:
                hasUnderlyingPriceUnitOfMeasure = true;
                underlyingPriceUnitOfMeasure = buffer.getChars(underlyingPriceUnitOfMeasure, valueOffset, valueLength);
                underlyingPriceUnitOfMeasureOffset = valueOffset;
                underlyingPriceUnitOfMeasureLength = valueLength;
                break;

            case Constants.UNDERLYING_PRICE_UNIT_OF_MEASURE_QTY:
                hasUnderlyingPriceUnitOfMeasureQty = true;
                underlyingPriceUnitOfMeasureQty = getFloat(buffer, underlyingPriceUnitOfMeasureQty, valueOffset, valueLength, 1425, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.UNDERLYING_TIME_UNIT:
                hasUnderlyingTimeUnit = true;
                underlyingTimeUnit = buffer.getChars(underlyingTimeUnit, valueOffset, valueLength);
                underlyingTimeUnitOffset = valueOffset;
                underlyingTimeUnitLength = valueLength;
                break;

            case Constants.UNDERLYING_EXERCISE_STYLE:
                hasUnderlyingExerciseStyle = true;
                underlyingExerciseStyle = getInt(buffer, valueOffset, endOfField, 1419, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.UNDERLYING_COUPON_RATE:
                hasUnderlyingCouponRate = true;
                underlyingCouponRate = getFloat(buffer, underlyingCouponRate, valueOffset, valueLength, 435, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.UNDERLYING_SECURITY_EXCHANGE:
                hasUnderlyingSecurityExchange = true;
                underlyingSecurityExchange = buffer.getChars(underlyingSecurityExchange, valueOffset, valueLength);
                underlyingSecurityExchangeOffset = valueOffset;
                underlyingSecurityExchangeLength = valueLength;
                break;

            case Constants.UNDERLYING_ISSUER:
                hasUnderlyingIssuer = true;
                underlyingIssuer = buffer.getChars(underlyingIssuer, valueOffset, valueLength);
                underlyingIssuerOffset = valueOffset;
                underlyingIssuerLength = valueLength;
                break;

            case Constants.ENCODED_UNDERLYING_ISSUER_LEN:
                hasEncodedUnderlyingIssuerLen = true;
                encodedUnderlyingIssuerLen = getInt(buffer, valueOffset, endOfField, 362, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.ENCODED_UNDERLYING_ISSUER:
                hasEncodedUnderlyingIssuer = true;
                encodedUnderlyingIssuer = buffer.getBytes(encodedUnderlyingIssuer, valueOffset, encodedUnderlyingIssuerLen);
                endOfField = valueOffset + encodedUnderlyingIssuerLen;
                break;

            case Constants.UNDERLYING_SECURITY_DESC:
                hasUnderlyingSecurityDesc = true;
                underlyingSecurityDesc = buffer.getChars(underlyingSecurityDesc, valueOffset, valueLength);
                underlyingSecurityDescOffset = valueOffset;
                underlyingSecurityDescLength = valueLength;
                break;

            case Constants.ENCODED_UNDERLYING_SECURITY_DESC_LEN:
                hasEncodedUnderlyingSecurityDescLen = true;
                encodedUnderlyingSecurityDescLen = getInt(buffer, valueOffset, endOfField, 364, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.ENCODED_UNDERLYING_SECURITY_DESC:
                hasEncodedUnderlyingSecurityDesc = true;
                encodedUnderlyingSecurityDesc = buffer.getBytes(encodedUnderlyingSecurityDesc, valueOffset, encodedUnderlyingSecurityDescLen);
                endOfField = valueOffset + encodedUnderlyingSecurityDescLen;
                break;

            case Constants.UNDERLYING_C_P_PROGRAM:
                hasUnderlyingCPProgram = true;
                underlyingCPProgram = buffer.getChars(underlyingCPProgram, valueOffset, valueLength);
                underlyingCPProgramOffset = valueOffset;
                underlyingCPProgramLength = valueLength;
                break;

            case Constants.UNDERLYING_C_P_REG_TYPE:
                hasUnderlyingCPRegType = true;
                underlyingCPRegType = buffer.getChars(underlyingCPRegType, valueOffset, valueLength);
                underlyingCPRegTypeOffset = valueOffset;
                underlyingCPRegTypeLength = valueLength;
                break;

            case Constants.UNDERLYING_ALLOCATION_PERCENT:
                hasUnderlyingAllocationPercent = true;
                underlyingAllocationPercent = getFloat(buffer, underlyingAllocationPercent, valueOffset, valueLength, 972, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.UNDERLYING_CURRENCY:
                hasUnderlyingCurrency = true;
                underlyingCurrency = buffer.getChars(underlyingCurrency, valueOffset, valueLength);
                underlyingCurrencyOffset = valueOffset;
                underlyingCurrencyLength = valueLength;
                break;

            case Constants.UNDERLYING_QTY:
                hasUnderlyingQty = true;
                underlyingQty = getFloat(buffer, underlyingQty, valueOffset, valueLength, 879, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.UNDERLYING_SETTLEMENT_TYPE:
                hasUnderlyingSettlementType = true;
                underlyingSettlementType = getInt(buffer, valueOffset, endOfField, 975, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.UNDERLYING_CASH_AMOUNT:
                hasUnderlyingCashAmount = true;
                underlyingCashAmount = getFloat(buffer, underlyingCashAmount, valueOffset, valueLength, 973, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.UNDERLYING_CASH_TYPE:
                hasUnderlyingCashType = true;
                underlyingCashType = buffer.getChars(underlyingCashType, valueOffset, valueLength);
                underlyingCashTypeOffset = valueOffset;
                underlyingCashTypeLength = valueLength;
                break;

            case Constants.UNDERLYING_PX:
                hasUnderlyingPx = true;
                underlyingPx = getFloat(buffer, underlyingPx, valueOffset, valueLength, 810, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.UNDERLYING_DIRTY_PRICE:
                hasUnderlyingDirtyPrice = true;
                underlyingDirtyPrice = getFloat(buffer, underlyingDirtyPrice, valueOffset, valueLength, 882, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.UNDERLYING_END_PRICE:
                hasUnderlyingEndPrice = true;
                underlyingEndPrice = getFloat(buffer, underlyingEndPrice, valueOffset, valueLength, 883, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.UNDERLYING_START_VALUE:
                hasUnderlyingStartValue = true;
                underlyingStartValue = getFloat(buffer, underlyingStartValue, valueOffset, valueLength, 884, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.UNDERLYING_CURRENT_VALUE:
                hasUnderlyingCurrentValue = true;
                underlyingCurrentValue = getFloat(buffer, underlyingCurrentValue, valueOffset, valueLength, 885, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.UNDERLYING_END_VALUE:
                hasUnderlyingEndValue = true;
                underlyingEndValue = getFloat(buffer, underlyingEndValue, valueOffset, valueLength, 886, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.NO_UNDERLYING_STIPS:
                hasNoUnderlyingStipsGroupCounter = true;
                noUnderlyingStipsGroupCounter = getInt(buffer, valueOffset, endOfField, 887, CODEC_VALIDATION_ENABLED);
                if (underlyingStipsGroup == null)
                {
                    underlyingStipsGroup = new UnderlyingStipsGroupDecoder(trailer, messageFields);
                }
                UnderlyingStipsGroupDecoder underlyingStipsGroupCurrent = underlyingStipsGroup;
                position = endOfField + 1;
                final int noUnderlyingStipsGroupCounter = this.noUnderlyingStipsGroupCounter;
                for (int i = 0; i < noUnderlyingStipsGroupCounter && position < end; i++)
                {
                    if (underlyingStipsGroupCurrent != null)
                    {
                        position += underlyingStipsGroupCurrent.decode(buffer, position, end - position);
                        underlyingStipsGroupCurrent = underlyingStipsGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (underlyingStipsGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;


            case Constants.UNDERLYING_ADJUSTED_QUANTITY:
                hasUnderlyingAdjustedQuantity = true;
                underlyingAdjustedQuantity = getFloat(buffer, underlyingAdjustedQuantity, valueOffset, valueLength, 1044, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.UNDERLYING_F_X_RATE:
                hasUnderlyingFXRate = true;
                underlyingFXRate = getFloat(buffer, underlyingFXRate, valueOffset, valueLength, 1045, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.UNDERLYING_F_X_RATE_CALC:
                hasUnderlyingFXRateCalc = true;
                underlyingFXRateCalc = buffer.getChar(valueOffset);
                break;

            case Constants.UNDERLYING_CAP_VALUE:
                hasUnderlyingCapValue = true;
                underlyingCapValue = getFloat(buffer, underlyingCapValue, valueOffset, valueLength, 1038, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.NO_UNDLY_INSTRUMENT_PARTIES:
                hasNoUndlyInstrumentPartiesGroupCounter = true;
                noUndlyInstrumentPartiesGroupCounter = getInt(buffer, valueOffset, endOfField, 1058, CODEC_VALIDATION_ENABLED);
                if (undlyInstrumentPartiesGroup == null)
                {
                    undlyInstrumentPartiesGroup = new UndlyInstrumentPartiesGroupDecoder(trailer, messageFields);
                }
                UndlyInstrumentPartiesGroupDecoder undlyInstrumentPartiesGroupCurrent = undlyInstrumentPartiesGroup;
                position = endOfField + 1;
                final int noUndlyInstrumentPartiesGroupCounter = this.noUndlyInstrumentPartiesGroupCounter;
                for (int i = 0; i < noUndlyInstrumentPartiesGroupCounter && position < end; i++)
                {
                    if (undlyInstrumentPartiesGroupCurrent != null)
                    {
                        position += undlyInstrumentPartiesGroupCurrent.decode(buffer, position, end - position);
                        undlyInstrumentPartiesGroupCurrent = undlyInstrumentPartiesGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (undlyInstrumentPartiesGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;


            case Constants.UNDERLYING_SETTL_METHOD:
                hasUnderlyingSettlMethod = true;
                underlyingSettlMethod = buffer.getChars(underlyingSettlMethod, valueOffset, valueLength);
                underlyingSettlMethodOffset = valueOffset;
                underlyingSettlMethodLength = valueLength;
                break;

            case Constants.UNDERLYING_PUT_OR_CALL:
                hasUnderlyingPutOrCall = true;
                underlyingPutOrCall = getInt(buffer, valueOffset, endOfField, 315, CODEC_VALIDATION_ENABLED);
                break;


            case Constants.DERIVATIVE_SYMBOL:
                hasDerivativeSymbol = true;
                derivativeSymbol = buffer.getChars(derivativeSymbol, valueOffset, valueLength);
                derivativeSymbolOffset = valueOffset;
                derivativeSymbolLength = valueLength;
                break;

            case Constants.DERIVATIVE_SYMBOL_SFX:
                hasDerivativeSymbolSfx = true;
                derivativeSymbolSfx = buffer.getChars(derivativeSymbolSfx, valueOffset, valueLength);
                derivativeSymbolSfxOffset = valueOffset;
                derivativeSymbolSfxLength = valueLength;
                break;

            case Constants.DERIVATIVE_SECURITY_ID:
                hasDerivativeSecurityID = true;
                derivativeSecurityID = buffer.getChars(derivativeSecurityID, valueOffset, valueLength);
                derivativeSecurityIDOffset = valueOffset;
                derivativeSecurityIDLength = valueLength;
                break;

            case Constants.DERIVATIVE_SECURITY_ID_SOURCE:
                hasDerivativeSecurityIDSource = true;
                derivativeSecurityIDSource = buffer.getChars(derivativeSecurityIDSource, valueOffset, valueLength);
                derivativeSecurityIDSourceOffset = valueOffset;
                derivativeSecurityIDSourceLength = valueLength;
                break;

            case Constants.NO_DERIVATIVE_SECURITY_ALT_ID:
                hasNoDerivativeSecurityAltIDGroupCounter = true;
                noDerivativeSecurityAltIDGroupCounter = getInt(buffer, valueOffset, endOfField, 1218, CODEC_VALIDATION_ENABLED);
                if (derivativeSecurityAltIDGroup == null)
                {
                    derivativeSecurityAltIDGroup = new DerivativeSecurityAltIDGroupDecoder(trailer, messageFields);
                }
                DerivativeSecurityAltIDGroupDecoder derivativeSecurityAltIDGroupCurrent = derivativeSecurityAltIDGroup;
                position = endOfField + 1;
                final int noDerivativeSecurityAltIDGroupCounter = this.noDerivativeSecurityAltIDGroupCounter;
                for (int i = 0; i < noDerivativeSecurityAltIDGroupCounter && position < end; i++)
                {
                    if (derivativeSecurityAltIDGroupCurrent != null)
                    {
                        position += derivativeSecurityAltIDGroupCurrent.decode(buffer, position, end - position);
                        derivativeSecurityAltIDGroupCurrent = derivativeSecurityAltIDGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (derivativeSecurityAltIDGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;


            case Constants.DERIVATIVE_PRODUCT:
                hasDerivativeProduct = true;
                derivativeProduct = getInt(buffer, valueOffset, endOfField, 1246, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.DERIVATIVE_PRODUCT_COMPLEX:
                hasDerivativeProductComplex = true;
                derivativeProductComplex = buffer.getChars(derivativeProductComplex, valueOffset, valueLength);
                derivativeProductComplexOffset = valueOffset;
                derivativeProductComplexLength = valueLength;
                break;

            case Constants.DERIV_FLEX_PRODUCT_ELIGIBILITY_INDICATOR:
                hasDerivFlexProductEligibilityIndicator = true;
                derivFlexProductEligibilityIndicator = buffer.getBoolean(valueOffset);
                break;

            case Constants.DERIVATIVE_SECURITY_GROUP:
                hasDerivativeSecurityGroup = true;
                derivativeSecurityGroup = buffer.getChars(derivativeSecurityGroup, valueOffset, valueLength);
                derivativeSecurityGroupOffset = valueOffset;
                derivativeSecurityGroupLength = valueLength;
                break;

            case Constants.DERIVATIVE_C_F_I_CODE:
                hasDerivativeCFICode = true;
                derivativeCFICode = buffer.getChars(derivativeCFICode, valueOffset, valueLength);
                derivativeCFICodeOffset = valueOffset;
                derivativeCFICodeLength = valueLength;
                break;

            case Constants.DERIVATIVE_SECURITY_TYPE:
                hasDerivativeSecurityType = true;
                derivativeSecurityType = buffer.getChars(derivativeSecurityType, valueOffset, valueLength);
                derivativeSecurityTypeOffset = valueOffset;
                derivativeSecurityTypeLength = valueLength;
                break;

            case Constants.DERIVATIVE_SECURITY_SUB_TYPE:
                hasDerivativeSecuritySubType = true;
                derivativeSecuritySubType = buffer.getChars(derivativeSecuritySubType, valueOffset, valueLength);
                derivativeSecuritySubTypeOffset = valueOffset;
                derivativeSecuritySubTypeLength = valueLength;
                break;

            case Constants.DERIVATIVE_MATURITY_MONTH_YEAR:
                hasDerivativeMaturityMonthYear = true;
                derivativeMaturityMonthYear = buffer.getBytes(derivativeMaturityMonthYear, valueOffset, valueLength);
                derivativeMaturityMonthYearOffset = valueOffset;
                derivativeMaturityMonthYearLength = valueLength;
                break;

            case Constants.DERIVATIVE_MATURITY_DATE:
                hasDerivativeMaturityDate = true;
                derivativeMaturityDate = buffer.getBytes(derivativeMaturityDate, valueOffset, valueLength);
                derivativeMaturityDateOffset = valueOffset;
                derivativeMaturityDateLength = valueLength;
                break;

            case Constants.DERIVATIVE_MATURITY_TIME:
                hasDerivativeMaturityTime = true;
                derivativeMaturityTime = buffer.getBytes(derivativeMaturityTime, valueOffset, valueLength);
                derivativeMaturityTimeOffset = valueOffset;
                derivativeMaturityTimeLength = valueLength;
                break;

            case Constants.DERIVATIVE_SETTLE_ON_OPEN_FLAG:
                hasDerivativeSettleOnOpenFlag = true;
                derivativeSettleOnOpenFlag = buffer.getChars(derivativeSettleOnOpenFlag, valueOffset, valueLength);
                derivativeSettleOnOpenFlagOffset = valueOffset;
                derivativeSettleOnOpenFlagLength = valueLength;
                break;

            case Constants.DERIVATIVE_INSTRMT_ASSIGNMENT_METHOD:
                hasDerivativeInstrmtAssignmentMethod = true;
                derivativeInstrmtAssignmentMethod = buffer.getChar(valueOffset);
                break;

            case Constants.DERIVATIVE_SECURITY_STATUS:
                hasDerivativeSecurityStatus = true;
                derivativeSecurityStatus = buffer.getChars(derivativeSecurityStatus, valueOffset, valueLength);
                derivativeSecurityStatusOffset = valueOffset;
                derivativeSecurityStatusLength = valueLength;
                break;

            case Constants.DERIVATIVE_ISSUE_DATE:
                hasDerivativeIssueDate = true;
                derivativeIssueDate = buffer.getBytes(derivativeIssueDate, valueOffset, valueLength);
                derivativeIssueDateOffset = valueOffset;
                derivativeIssueDateLength = valueLength;
                break;

            case Constants.DERIVATIVE_INSTR_REGISTRY:
                hasDerivativeInstrRegistry = true;
                derivativeInstrRegistry = buffer.getChars(derivativeInstrRegistry, valueOffset, valueLength);
                derivativeInstrRegistryOffset = valueOffset;
                derivativeInstrRegistryLength = valueLength;
                break;

            case Constants.DERIVATIVE_COUNTRY_OF_ISSUE:
                hasDerivativeCountryOfIssue = true;
                derivativeCountryOfIssue = buffer.getChars(derivativeCountryOfIssue, valueOffset, valueLength);
                derivativeCountryOfIssueOffset = valueOffset;
                derivativeCountryOfIssueLength = valueLength;
                break;

            case Constants.DERIVATIVE_STATE_OR_PROVINCE_OF_ISSUE:
                hasDerivativeStateOrProvinceOfIssue = true;
                derivativeStateOrProvinceOfIssue = buffer.getChars(derivativeStateOrProvinceOfIssue, valueOffset, valueLength);
                derivativeStateOrProvinceOfIssueOffset = valueOffset;
                derivativeStateOrProvinceOfIssueLength = valueLength;
                break;

            case Constants.DERIVATIVE_LOCALE_OF_ISSUE:
                hasDerivativeLocaleOfIssue = true;
                derivativeLocaleOfIssue = buffer.getChars(derivativeLocaleOfIssue, valueOffset, valueLength);
                derivativeLocaleOfIssueOffset = valueOffset;
                derivativeLocaleOfIssueLength = valueLength;
                break;

            case Constants.DERIVATIVE_STRIKE_PRICE:
                hasDerivativeStrikePrice = true;
                derivativeStrikePrice = getFloat(buffer, derivativeStrikePrice, valueOffset, valueLength, 1261, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.DERIVATIVE_STRIKE_CURRENCY:
                hasDerivativeStrikeCurrency = true;
                derivativeStrikeCurrency = buffer.getChars(derivativeStrikeCurrency, valueOffset, valueLength);
                derivativeStrikeCurrencyOffset = valueOffset;
                derivativeStrikeCurrencyLength = valueLength;
                break;

            case Constants.DERIVATIVE_STRIKE_MULTIPLIER:
                hasDerivativeStrikeMultiplier = true;
                derivativeStrikeMultiplier = getFloat(buffer, derivativeStrikeMultiplier, valueOffset, valueLength, 1263, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.DERIVATIVE_STRIKE_VALUE:
                hasDerivativeStrikeValue = true;
                derivativeStrikeValue = getFloat(buffer, derivativeStrikeValue, valueOffset, valueLength, 1264, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.DERIVATIVE_OPT_ATTRIBUTE:
                hasDerivativeOptAttribute = true;
                derivativeOptAttribute = buffer.getChar(valueOffset);
                break;

            case Constants.DERIVATIVE_CONTRACT_MULTIPLIER:
                hasDerivativeContractMultiplier = true;
                derivativeContractMultiplier = getFloat(buffer, derivativeContractMultiplier, valueOffset, valueLength, 1266, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.DERIVATIVE_CONTRACT_MULTIPLIER_UNIT:
                hasDerivativeContractMultiplierUnit = true;
                derivativeContractMultiplierUnit = getInt(buffer, valueOffset, endOfField, 1438, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.DERIVATIVE_FLOW_SCHEDULE_TYPE:
                hasDerivativeFlowScheduleType = true;
                derivativeFlowScheduleType = getInt(buffer, valueOffset, endOfField, 1442, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.DERIVATIVE_MIN_PRICE_INCREMENT:
                hasDerivativeMinPriceIncrement = true;
                derivativeMinPriceIncrement = getFloat(buffer, derivativeMinPriceIncrement, valueOffset, valueLength, 1267, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.DERIVATIVE_MIN_PRICE_INCREMENT_AMOUNT:
                hasDerivativeMinPriceIncrementAmount = true;
                derivativeMinPriceIncrementAmount = getFloat(buffer, derivativeMinPriceIncrementAmount, valueOffset, valueLength, 1268, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.DERIVATIVE_UNIT_OF_MEASURE:
                hasDerivativeUnitOfMeasure = true;
                derivativeUnitOfMeasure = buffer.getChars(derivativeUnitOfMeasure, valueOffset, valueLength);
                derivativeUnitOfMeasureOffset = valueOffset;
                derivativeUnitOfMeasureLength = valueLength;
                break;

            case Constants.DERIVATIVE_UNIT_OF_MEASURE_QTY:
                hasDerivativeUnitOfMeasureQty = true;
                derivativeUnitOfMeasureQty = getFloat(buffer, derivativeUnitOfMeasureQty, valueOffset, valueLength, 1270, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.DERIVATIVE_PRICE_UNIT_OF_MEASURE:
                hasDerivativePriceUnitOfMeasure = true;
                derivativePriceUnitOfMeasure = buffer.getChars(derivativePriceUnitOfMeasure, valueOffset, valueLength);
                derivativePriceUnitOfMeasureOffset = valueOffset;
                derivativePriceUnitOfMeasureLength = valueLength;
                break;

            case Constants.DERIVATIVE_PRICE_UNIT_OF_MEASURE_QTY:
                hasDerivativePriceUnitOfMeasureQty = true;
                derivativePriceUnitOfMeasureQty = getFloat(buffer, derivativePriceUnitOfMeasureQty, valueOffset, valueLength, 1316, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.DERIVATIVE_SETTL_METHOD:
                hasDerivativeSettlMethod = true;
                derivativeSettlMethod = buffer.getChar(valueOffset);
                break;

            case Constants.DERIVATIVE_PRICE_QUOTE_METHOD:
                hasDerivativePriceQuoteMethod = true;
                derivativePriceQuoteMethod = buffer.getChars(derivativePriceQuoteMethod, valueOffset, valueLength);
                derivativePriceQuoteMethodOffset = valueOffset;
                derivativePriceQuoteMethodLength = valueLength;
                break;

            case Constants.DERIVATIVE_VALUATION_METHOD:
                hasDerivativeValuationMethod = true;
                derivativeValuationMethod = buffer.getChars(derivativeValuationMethod, valueOffset, valueLength);
                derivativeValuationMethodOffset = valueOffset;
                derivativeValuationMethodLength = valueLength;
                break;

            case Constants.DERIVATIVE_LIST_METHOD:
                hasDerivativeListMethod = true;
                derivativeListMethod = getInt(buffer, valueOffset, endOfField, 1320, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.DERIVATIVE_CAP_PRICE:
                hasDerivativeCapPrice = true;
                derivativeCapPrice = getFloat(buffer, derivativeCapPrice, valueOffset, valueLength, 1321, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.DERIVATIVE_FLOOR_PRICE:
                hasDerivativeFloorPrice = true;
                derivativeFloorPrice = getFloat(buffer, derivativeFloorPrice, valueOffset, valueLength, 1322, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.DERIVATIVE_PUT_OR_CALL:
                hasDerivativePutOrCall = true;
                derivativePutOrCall = getInt(buffer, valueOffset, endOfField, 1323, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.DERIVATIVE_EXERCISE_STYLE:
                hasDerivativeExerciseStyle = true;
                derivativeExerciseStyle = buffer.getChar(valueOffset);
                break;

            case Constants.DERIVATIVE_OPT_PAY_AMOUNT:
                hasDerivativeOptPayAmount = true;
                derivativeOptPayAmount = getFloat(buffer, derivativeOptPayAmount, valueOffset, valueLength, 1225, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.DERIVATIVE_TIME_UNIT:
                hasDerivativeTimeUnit = true;
                derivativeTimeUnit = buffer.getChars(derivativeTimeUnit, valueOffset, valueLength);
                derivativeTimeUnitOffset = valueOffset;
                derivativeTimeUnitLength = valueLength;
                break;

            case Constants.DERIVATIVE_SECURITY_EXCHANGE:
                hasDerivativeSecurityExchange = true;
                derivativeSecurityExchange = buffer.getChars(derivativeSecurityExchange, valueOffset, valueLength);
                derivativeSecurityExchangeOffset = valueOffset;
                derivativeSecurityExchangeLength = valueLength;
                break;

            case Constants.DERIVATIVE_POSITION_LIMIT:
                hasDerivativePositionLimit = true;
                derivativePositionLimit = getInt(buffer, valueOffset, endOfField, 1273, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.DERIVATIVE_N_T_POSITION_LIMIT:
                hasDerivativeNTPositionLimit = true;
                derivativeNTPositionLimit = getInt(buffer, valueOffset, endOfField, 1274, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.DERIVATIVE_ISSUER:
                hasDerivativeIssuer = true;
                derivativeIssuer = buffer.getChars(derivativeIssuer, valueOffset, valueLength);
                derivativeIssuerOffset = valueOffset;
                derivativeIssuerLength = valueLength;
                break;

            case Constants.DERIVATIVE_ENCODED_ISSUER_LEN:
                hasDerivativeEncodedIssuerLen = true;
                derivativeEncodedIssuerLen = getInt(buffer, valueOffset, endOfField, 1277, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.DERIVATIVE_ENCODED_ISSUER:
                hasDerivativeEncodedIssuer = true;
                derivativeEncodedIssuer = buffer.getBytes(derivativeEncodedIssuer, valueOffset, derivativeEncodedIssuerLen);
                endOfField = valueOffset + derivativeEncodedIssuerLen;
                break;

            case Constants.DERIVATIVE_SECURITY_DESC:
                hasDerivativeSecurityDesc = true;
                derivativeSecurityDesc = buffer.getChars(derivativeSecurityDesc, valueOffset, valueLength);
                derivativeSecurityDescOffset = valueOffset;
                derivativeSecurityDescLength = valueLength;
                break;

            case Constants.DERIVATIVE_ENCODED_SECURITY_DESC_LEN:
                hasDerivativeEncodedSecurityDescLen = true;
                derivativeEncodedSecurityDescLen = getInt(buffer, valueOffset, endOfField, 1280, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.DERIVATIVE_ENCODED_SECURITY_DESC:
                hasDerivativeEncodedSecurityDesc = true;
                derivativeEncodedSecurityDesc = buffer.getBytes(derivativeEncodedSecurityDesc, valueOffset, derivativeEncodedSecurityDescLen);
                endOfField = valueOffset + derivativeEncodedSecurityDescLen;
                break;

            case Constants.DERIVATIVE_SECURITY_X_M_L_LEN:
                hasDerivativeSecurityXMLLen = true;
                derivativeSecurityXMLLen = getInt(buffer, valueOffset, endOfField, 1282, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.DERIVATIVE_SECURITY_X_M_L:
                hasDerivativeSecurityXML = true;
                derivativeSecurityXML = buffer.getBytes(derivativeSecurityXML, valueOffset, derivativeSecurityXMLLen);
                endOfField = valueOffset + derivativeSecurityXMLLen;
                break;

            case Constants.DERIVATIVE_SECURITY_X_M_L_SCHEMA:
                hasDerivativeSecurityXMLSchema = true;
                derivativeSecurityXMLSchema = buffer.getChars(derivativeSecurityXMLSchema, valueOffset, valueLength);
                derivativeSecurityXMLSchemaOffset = valueOffset;
                derivativeSecurityXMLSchemaLength = valueLength;
                break;


            case Constants.DERIVATIVE_CONTRACT_SETTL_MONTH:
                hasDerivativeContractSettlMonth = true;
                derivativeContractSettlMonth = buffer.getBytes(derivativeContractSettlMonth, valueOffset, valueLength);
                derivativeContractSettlMonthOffset = valueOffset;
                derivativeContractSettlMonthLength = valueLength;
                break;

            case Constants.NO_DERIVATIVE_EVENTS:
                hasNoDerivativeEventsGroupCounter = true;
                noDerivativeEventsGroupCounter = getInt(buffer, valueOffset, endOfField, 1286, CODEC_VALIDATION_ENABLED);
                if (derivativeEventsGroup == null)
                {
                    derivativeEventsGroup = new DerivativeEventsGroupDecoder(trailer, messageFields);
                }
                DerivativeEventsGroupDecoder derivativeEventsGroupCurrent = derivativeEventsGroup;
                position = endOfField + 1;
                final int noDerivativeEventsGroupCounter = this.noDerivativeEventsGroupCounter;
                for (int i = 0; i < noDerivativeEventsGroupCounter && position < end; i++)
                {
                    if (derivativeEventsGroupCurrent != null)
                    {
                        position += derivativeEventsGroupCurrent.decode(buffer, position, end - position);
                        derivativeEventsGroupCurrent = derivativeEventsGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (derivativeEventsGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;


            case Constants.NO_DERIVATIVE_INSTRUMENT_PARTIES:
                hasNoDerivativeInstrumentPartiesGroupCounter = true;
                noDerivativeInstrumentPartiesGroupCounter = getInt(buffer, valueOffset, endOfField, 1292, CODEC_VALIDATION_ENABLED);
                if (derivativeInstrumentPartiesGroup == null)
                {
                    derivativeInstrumentPartiesGroup = new DerivativeInstrumentPartiesGroupDecoder(trailer, messageFields);
                }
                DerivativeInstrumentPartiesGroupDecoder derivativeInstrumentPartiesGroupCurrent = derivativeInstrumentPartiesGroup;
                position = endOfField + 1;
                final int noDerivativeInstrumentPartiesGroupCounter = this.noDerivativeInstrumentPartiesGroupCounter;
                for (int i = 0; i < noDerivativeInstrumentPartiesGroupCounter && position < end; i++)
                {
                    if (derivativeInstrumentPartiesGroupCurrent != null)
                    {
                        position += derivativeInstrumentPartiesGroupCurrent.decode(buffer, position, end - position);
                        derivativeInstrumentPartiesGroupCurrent = derivativeInstrumentPartiesGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (derivativeInstrumentPartiesGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;



            case Constants.SECURITY_SUB_TYPE:
                hasSecuritySubType = true;
                securitySubType = buffer.getChars(securitySubType, valueOffset, valueLength);
                securitySubTypeOffset = valueOffset;
                securitySubTypeLength = valueLength;
                break;

            case Constants.CURRENCY:
                hasCurrency = true;
                currency = buffer.getChars(currency, valueOffset, valueLength);
                currencyOffset = valueOffset;
                currencyLength = valueLength;
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

            case Constants.SUBSCRIPTION_REQUEST_TYPE:
                hasSubscriptionRequestType = true;
                subscriptionRequestType = buffer.getChar(valueOffset);
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
        this.resetSecurityReqID();
        this.resetSecurityListRequestType();
        this.resetMarketID();
        this.resetMarketSegmentID();
        this.resetSecuritySubType();
        this.resetCurrency();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        this.resetTradingSessionID();
        this.resetTradingSessionSubID();
        this.resetSubscriptionRequestType();
        this.resetUnderlyingSymbol();
        this.resetUnderlyingSymbolSfx();
        this.resetUnderlyingSecurityID();
        this.resetUnderlyingSecurityIDSource();
        this.resetUnderlyingProduct();
        this.resetUnderlyingCFICode();
        this.resetUnderlyingSecurityType();
        this.resetUnderlyingSecuritySubType();
        this.resetUnderlyingMaturityMonthYear();
        this.resetUnderlyingMaturityDate();
        this.resetUnderlyingMaturityTime();
        this.resetUnderlyingCouponPaymentDate();
        this.resetUnderlyingRestructuringType();
        this.resetUnderlyingSeniority();
        this.resetUnderlyingNotionalPercentageOutstanding();
        this.resetUnderlyingOriginalNotionalPercentageOutstanding();
        this.resetUnderlyingAttachmentPoint();
        this.resetUnderlyingDetachmentPoint();
        this.resetUnderlyingIssueDate();
        this.resetUnderlyingRepoCollateralSecurityType();
        this.resetUnderlyingRepurchaseTerm();
        this.resetUnderlyingRepurchaseRate();
        this.resetUnderlyingFactor();
        this.resetUnderlyingCreditRating();
        this.resetUnderlyingInstrRegistry();
        this.resetUnderlyingCountryOfIssue();
        this.resetUnderlyingStateOrProvinceOfIssue();
        this.resetUnderlyingLocaleOfIssue();
        this.resetUnderlyingRedemptionDate();
        this.resetUnderlyingStrikePrice();
        this.resetUnderlyingStrikeCurrency();
        this.resetUnderlyingOptAttribute();
        this.resetUnderlyingContractMultiplier();
        this.resetUnderlyingContractMultiplierUnit();
        this.resetUnderlyingFlowScheduleType();
        this.resetUnderlyingUnitOfMeasure();
        this.resetUnderlyingUnitOfMeasureQty();
        this.resetUnderlyingPriceUnitOfMeasure();
        this.resetUnderlyingPriceUnitOfMeasureQty();
        this.resetUnderlyingTimeUnit();
        this.resetUnderlyingExerciseStyle();
        this.resetUnderlyingCouponRate();
        this.resetUnderlyingSecurityExchange();
        this.resetUnderlyingIssuer();
        this.resetEncodedUnderlyingIssuerLen();
        this.resetEncodedUnderlyingIssuer();
        this.resetUnderlyingSecurityDesc();
        this.resetEncodedUnderlyingSecurityDescLen();
        this.resetEncodedUnderlyingSecurityDesc();
        this.resetUnderlyingCPProgram();
        this.resetUnderlyingCPRegType();
        this.resetUnderlyingAllocationPercent();
        this.resetUnderlyingCurrency();
        this.resetUnderlyingQty();
        this.resetUnderlyingSettlementType();
        this.resetUnderlyingCashAmount();
        this.resetUnderlyingCashType();
        this.resetUnderlyingPx();
        this.resetUnderlyingDirtyPrice();
        this.resetUnderlyingEndPrice();
        this.resetUnderlyingStartValue();
        this.resetUnderlyingCurrentValue();
        this.resetUnderlyingEndValue();
        this.resetUnderlyingAdjustedQuantity();
        this.resetUnderlyingFXRate();
        this.resetUnderlyingFXRateCalc();
        this.resetUnderlyingCapValue();
        this.resetUnderlyingSettlMethod();
        this.resetUnderlyingPutOrCall();
        this.resetUnderlyingSecurityAltIDGroup();
        this.resetUnderlyingStipsGroup();
        this.resetUndlyInstrumentPartiesGroup();
        this.resetDerivativeSymbol();
        this.resetDerivativeSymbolSfx();
        this.resetDerivativeSecurityID();
        this.resetDerivativeSecurityIDSource();
        this.resetDerivativeProduct();
        this.resetDerivativeProductComplex();
        this.resetDerivFlexProductEligibilityIndicator();
        this.resetDerivativeSecurityGroup();
        this.resetDerivativeCFICode();
        this.resetDerivativeSecurityType();
        this.resetDerivativeSecuritySubType();
        this.resetDerivativeMaturityMonthYear();
        this.resetDerivativeMaturityDate();
        this.resetDerivativeMaturityTime();
        this.resetDerivativeSettleOnOpenFlag();
        this.resetDerivativeInstrmtAssignmentMethod();
        this.resetDerivativeSecurityStatus();
        this.resetDerivativeIssueDate();
        this.resetDerivativeInstrRegistry();
        this.resetDerivativeCountryOfIssue();
        this.resetDerivativeStateOrProvinceOfIssue();
        this.resetDerivativeLocaleOfIssue();
        this.resetDerivativeStrikePrice();
        this.resetDerivativeStrikeCurrency();
        this.resetDerivativeStrikeMultiplier();
        this.resetDerivativeStrikeValue();
        this.resetDerivativeOptAttribute();
        this.resetDerivativeContractMultiplier();
        this.resetDerivativeContractMultiplierUnit();
        this.resetDerivativeFlowScheduleType();
        this.resetDerivativeMinPriceIncrement();
        this.resetDerivativeMinPriceIncrementAmount();
        this.resetDerivativeUnitOfMeasure();
        this.resetDerivativeUnitOfMeasureQty();
        this.resetDerivativePriceUnitOfMeasure();
        this.resetDerivativePriceUnitOfMeasureQty();
        this.resetDerivativeSettlMethod();
        this.resetDerivativePriceQuoteMethod();
        this.resetDerivativeValuationMethod();
        this.resetDerivativeListMethod();
        this.resetDerivativeCapPrice();
        this.resetDerivativeFloorPrice();
        this.resetDerivativePutOrCall();
        this.resetDerivativeExerciseStyle();
        this.resetDerivativeOptPayAmount();
        this.resetDerivativeTimeUnit();
        this.resetDerivativeSecurityExchange();
        this.resetDerivativePositionLimit();
        this.resetDerivativeNTPositionLimit();
        this.resetDerivativeIssuer();
        this.resetDerivativeEncodedIssuerLen();
        this.resetDerivativeEncodedIssuer();
        this.resetDerivativeSecurityDesc();
        this.resetDerivativeEncodedSecurityDescLen();
        this.resetDerivativeEncodedSecurityDesc();
        this.resetDerivativeContractSettlMonth();
        this.resetDerivativeSecurityAltIDGroup();
        this.resetDerivativeSecurityXMLLen();
        this.resetDerivativeSecurityXML();
        this.resetDerivativeSecurityXMLSchema();
        this.resetDerivativeEventsGroup();
        this.resetDerivativeInstrumentPartiesGroup();
    }

    public void resetSecurityReqID()
    {
        securityReqIDOffset = 0;
        securityReqIDLength = 0;
    }

    public void resetSecurityListRequestType()
    {
        securityListRequestType = MISSING_INT;
    }

    public void resetMarketID()
    {
        hasMarketID = false;
    }

    public void resetMarketSegmentID()
    {
        hasMarketSegmentID = false;
    }

    public void resetSecuritySubType()
    {
        hasSecuritySubType = false;
    }

    public void resetCurrency()
    {
        hasCurrency = false;
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

    public void resetTradingSessionID()
    {
        hasTradingSessionID = false;
    }

    public void resetTradingSessionSubID()
    {
        hasTradingSessionSubID = false;
    }

    public void resetSubscriptionRequestType()
    {
        hasSubscriptionRequestType = false;
    }

    public void resetUnderlyingSymbol()
    {
        hasUnderlyingSymbol = false;
    }

    public void resetUnderlyingSymbolSfx()
    {
        hasUnderlyingSymbolSfx = false;
    }

    public void resetUnderlyingSecurityID()
    {
        hasUnderlyingSecurityID = false;
    }

    public void resetUnderlyingSecurityIDSource()
    {
        hasUnderlyingSecurityIDSource = false;
    }

    public void resetUnderlyingProduct()
    {
        hasUnderlyingProduct = false;
    }

    public void resetUnderlyingCFICode()
    {
        hasUnderlyingCFICode = false;
    }

    public void resetUnderlyingSecurityType()
    {
        hasUnderlyingSecurityType = false;
    }

    public void resetUnderlyingSecuritySubType()
    {
        hasUnderlyingSecuritySubType = false;
    }

    public void resetUnderlyingMaturityMonthYear()
    {
        hasUnderlyingMaturityMonthYear = false;
    }

    public void resetUnderlyingMaturityDate()
    {
        hasUnderlyingMaturityDate = false;
    }

    public void resetUnderlyingMaturityTime()
    {
        hasUnderlyingMaturityTime = false;
    }

    public void resetUnderlyingCouponPaymentDate()
    {
        hasUnderlyingCouponPaymentDate = false;
    }

    public void resetUnderlyingRestructuringType()
    {
        hasUnderlyingRestructuringType = false;
    }

    public void resetUnderlyingSeniority()
    {
        hasUnderlyingSeniority = false;
    }

    public void resetUnderlyingNotionalPercentageOutstanding()
    {
        hasUnderlyingNotionalPercentageOutstanding = false;
    }

    public void resetUnderlyingOriginalNotionalPercentageOutstanding()
    {
        hasUnderlyingOriginalNotionalPercentageOutstanding = false;
    }

    public void resetUnderlyingAttachmentPoint()
    {
        hasUnderlyingAttachmentPoint = false;
    }

    public void resetUnderlyingDetachmentPoint()
    {
        hasUnderlyingDetachmentPoint = false;
    }

    public void resetUnderlyingIssueDate()
    {
        hasUnderlyingIssueDate = false;
    }

    public void resetUnderlyingRepoCollateralSecurityType()
    {
        hasUnderlyingRepoCollateralSecurityType = false;
    }

    public void resetUnderlyingRepurchaseTerm()
    {
        hasUnderlyingRepurchaseTerm = false;
    }

    public void resetUnderlyingRepurchaseRate()
    {
        hasUnderlyingRepurchaseRate = false;
    }

    public void resetUnderlyingFactor()
    {
        hasUnderlyingFactor = false;
    }

    public void resetUnderlyingCreditRating()
    {
        hasUnderlyingCreditRating = false;
    }

    public void resetUnderlyingInstrRegistry()
    {
        hasUnderlyingInstrRegistry = false;
    }

    public void resetUnderlyingCountryOfIssue()
    {
        hasUnderlyingCountryOfIssue = false;
    }

    public void resetUnderlyingStateOrProvinceOfIssue()
    {
        hasUnderlyingStateOrProvinceOfIssue = false;
    }

    public void resetUnderlyingLocaleOfIssue()
    {
        hasUnderlyingLocaleOfIssue = false;
    }

    public void resetUnderlyingRedemptionDate()
    {
        hasUnderlyingRedemptionDate = false;
    }

    public void resetUnderlyingStrikePrice()
    {
        hasUnderlyingStrikePrice = false;
    }

    public void resetUnderlyingStrikeCurrency()
    {
        hasUnderlyingStrikeCurrency = false;
    }

    public void resetUnderlyingOptAttribute()
    {
        hasUnderlyingOptAttribute = false;
    }

    public void resetUnderlyingContractMultiplier()
    {
        hasUnderlyingContractMultiplier = false;
    }

    public void resetUnderlyingContractMultiplierUnit()
    {
        hasUnderlyingContractMultiplierUnit = false;
    }

    public void resetUnderlyingFlowScheduleType()
    {
        hasUnderlyingFlowScheduleType = false;
    }

    public void resetUnderlyingUnitOfMeasure()
    {
        hasUnderlyingUnitOfMeasure = false;
    }

    public void resetUnderlyingUnitOfMeasureQty()
    {
        hasUnderlyingUnitOfMeasureQty = false;
    }

    public void resetUnderlyingPriceUnitOfMeasure()
    {
        hasUnderlyingPriceUnitOfMeasure = false;
    }

    public void resetUnderlyingPriceUnitOfMeasureQty()
    {
        hasUnderlyingPriceUnitOfMeasureQty = false;
    }

    public void resetUnderlyingTimeUnit()
    {
        hasUnderlyingTimeUnit = false;
    }

    public void resetUnderlyingExerciseStyle()
    {
        hasUnderlyingExerciseStyle = false;
    }

    public void resetUnderlyingCouponRate()
    {
        hasUnderlyingCouponRate = false;
    }

    public void resetUnderlyingSecurityExchange()
    {
        hasUnderlyingSecurityExchange = false;
    }

    public void resetUnderlyingIssuer()
    {
        hasUnderlyingIssuer = false;
    }

    public void resetEncodedUnderlyingIssuerLen()
    {
        hasEncodedUnderlyingIssuerLen = false;
    }

    public void resetEncodedUnderlyingIssuer()
    {
        hasEncodedUnderlyingIssuer = false;
    }

    public void resetUnderlyingSecurityDesc()
    {
        hasUnderlyingSecurityDesc = false;
    }

    public void resetEncodedUnderlyingSecurityDescLen()
    {
        hasEncodedUnderlyingSecurityDescLen = false;
    }

    public void resetEncodedUnderlyingSecurityDesc()
    {
        hasEncodedUnderlyingSecurityDesc = false;
    }

    public void resetUnderlyingCPProgram()
    {
        hasUnderlyingCPProgram = false;
    }

    public void resetUnderlyingCPRegType()
    {
        hasUnderlyingCPRegType = false;
    }

    public void resetUnderlyingAllocationPercent()
    {
        hasUnderlyingAllocationPercent = false;
    }

    public void resetUnderlyingCurrency()
    {
        hasUnderlyingCurrency = false;
    }

    public void resetUnderlyingQty()
    {
        hasUnderlyingQty = false;
    }

    public void resetUnderlyingSettlementType()
    {
        hasUnderlyingSettlementType = false;
    }

    public void resetUnderlyingCashAmount()
    {
        hasUnderlyingCashAmount = false;
    }

    public void resetUnderlyingCashType()
    {
        hasUnderlyingCashType = false;
    }

    public void resetUnderlyingPx()
    {
        hasUnderlyingPx = false;
    }

    public void resetUnderlyingDirtyPrice()
    {
        hasUnderlyingDirtyPrice = false;
    }

    public void resetUnderlyingEndPrice()
    {
        hasUnderlyingEndPrice = false;
    }

    public void resetUnderlyingStartValue()
    {
        hasUnderlyingStartValue = false;
    }

    public void resetUnderlyingCurrentValue()
    {
        hasUnderlyingCurrentValue = false;
    }

    public void resetUnderlyingEndValue()
    {
        hasUnderlyingEndValue = false;
    }

    public void resetUnderlyingAdjustedQuantity()
    {
        hasUnderlyingAdjustedQuantity = false;
    }

    public void resetUnderlyingFXRate()
    {
        hasUnderlyingFXRate = false;
    }

    public void resetUnderlyingFXRateCalc()
    {
        hasUnderlyingFXRateCalc = false;
    }

    public void resetUnderlyingCapValue()
    {
        hasUnderlyingCapValue = false;
    }

    public void resetUnderlyingSettlMethod()
    {
        hasUnderlyingSettlMethod = false;
    }

    public void resetUnderlyingPutOrCall()
    {
        hasUnderlyingPutOrCall = false;
    }

    public void resetUnderlyingSecurityAltIDGroup()
    {
        for (final UnderlyingSecurityAltIDGroupDecoder underlyingSecurityAltIDGroupDecoder : underlyingSecurityAltIDGroupIterator.iterator())
        {
            underlyingSecurityAltIDGroupDecoder.reset();
            if (underlyingSecurityAltIDGroupDecoder.next() == null)
            {
                break;
            }
        }
        noUnderlyingSecurityAltIDGroupCounter = MISSING_INT;
        hasNoUnderlyingSecurityAltIDGroupCounter = false;
    }

    public void resetUnderlyingStipsGroup()
    {
        for (final UnderlyingStipsGroupDecoder underlyingStipsGroupDecoder : underlyingStipsGroupIterator.iterator())
        {
            underlyingStipsGroupDecoder.reset();
            if (underlyingStipsGroupDecoder.next() == null)
            {
                break;
            }
        }
        noUnderlyingStipsGroupCounter = MISSING_INT;
        hasNoUnderlyingStipsGroupCounter = false;
    }

    public void resetUndlyInstrumentPartiesGroup()
    {
        for (final UndlyInstrumentPartiesGroupDecoder undlyInstrumentPartiesGroupDecoder : undlyInstrumentPartiesGroupIterator.iterator())
        {
            undlyInstrumentPartiesGroupDecoder.reset();
            if (undlyInstrumentPartiesGroupDecoder.next() == null)
            {
                break;
            }
        }
        noUndlyInstrumentPartiesGroupCounter = MISSING_INT;
        hasNoUndlyInstrumentPartiesGroupCounter = false;
    }

    public void resetDerivativeSymbol()
    {
        hasDerivativeSymbol = false;
    }

    public void resetDerivativeSymbolSfx()
    {
        hasDerivativeSymbolSfx = false;
    }

    public void resetDerivativeSecurityID()
    {
        hasDerivativeSecurityID = false;
    }

    public void resetDerivativeSecurityIDSource()
    {
        hasDerivativeSecurityIDSource = false;
    }

    public void resetDerivativeProduct()
    {
        hasDerivativeProduct = false;
    }

    public void resetDerivativeProductComplex()
    {
        hasDerivativeProductComplex = false;
    }

    public void resetDerivFlexProductEligibilityIndicator()
    {
        hasDerivFlexProductEligibilityIndicator = false;
    }

    public void resetDerivativeSecurityGroup()
    {
        hasDerivativeSecurityGroup = false;
    }

    public void resetDerivativeCFICode()
    {
        hasDerivativeCFICode = false;
    }

    public void resetDerivativeSecurityType()
    {
        hasDerivativeSecurityType = false;
    }

    public void resetDerivativeSecuritySubType()
    {
        hasDerivativeSecuritySubType = false;
    }

    public void resetDerivativeMaturityMonthYear()
    {
        hasDerivativeMaturityMonthYear = false;
    }

    public void resetDerivativeMaturityDate()
    {
        hasDerivativeMaturityDate = false;
    }

    public void resetDerivativeMaturityTime()
    {
        hasDerivativeMaturityTime = false;
    }

    public void resetDerivativeSettleOnOpenFlag()
    {
        hasDerivativeSettleOnOpenFlag = false;
    }

    public void resetDerivativeInstrmtAssignmentMethod()
    {
        hasDerivativeInstrmtAssignmentMethod = false;
    }

    public void resetDerivativeSecurityStatus()
    {
        hasDerivativeSecurityStatus = false;
    }

    public void resetDerivativeIssueDate()
    {
        hasDerivativeIssueDate = false;
    }

    public void resetDerivativeInstrRegistry()
    {
        hasDerivativeInstrRegistry = false;
    }

    public void resetDerivativeCountryOfIssue()
    {
        hasDerivativeCountryOfIssue = false;
    }

    public void resetDerivativeStateOrProvinceOfIssue()
    {
        hasDerivativeStateOrProvinceOfIssue = false;
    }

    public void resetDerivativeLocaleOfIssue()
    {
        hasDerivativeLocaleOfIssue = false;
    }

    public void resetDerivativeStrikePrice()
    {
        hasDerivativeStrikePrice = false;
    }

    public void resetDerivativeStrikeCurrency()
    {
        hasDerivativeStrikeCurrency = false;
    }

    public void resetDerivativeStrikeMultiplier()
    {
        hasDerivativeStrikeMultiplier = false;
    }

    public void resetDerivativeStrikeValue()
    {
        hasDerivativeStrikeValue = false;
    }

    public void resetDerivativeOptAttribute()
    {
        hasDerivativeOptAttribute = false;
    }

    public void resetDerivativeContractMultiplier()
    {
        hasDerivativeContractMultiplier = false;
    }

    public void resetDerivativeContractMultiplierUnit()
    {
        hasDerivativeContractMultiplierUnit = false;
    }

    public void resetDerivativeFlowScheduleType()
    {
        hasDerivativeFlowScheduleType = false;
    }

    public void resetDerivativeMinPriceIncrement()
    {
        hasDerivativeMinPriceIncrement = false;
    }

    public void resetDerivativeMinPriceIncrementAmount()
    {
        hasDerivativeMinPriceIncrementAmount = false;
    }

    public void resetDerivativeUnitOfMeasure()
    {
        hasDerivativeUnitOfMeasure = false;
    }

    public void resetDerivativeUnitOfMeasureQty()
    {
        hasDerivativeUnitOfMeasureQty = false;
    }

    public void resetDerivativePriceUnitOfMeasure()
    {
        hasDerivativePriceUnitOfMeasure = false;
    }

    public void resetDerivativePriceUnitOfMeasureQty()
    {
        hasDerivativePriceUnitOfMeasureQty = false;
    }

    public void resetDerivativeSettlMethod()
    {
        hasDerivativeSettlMethod = false;
    }

    public void resetDerivativePriceQuoteMethod()
    {
        hasDerivativePriceQuoteMethod = false;
    }

    public void resetDerivativeValuationMethod()
    {
        hasDerivativeValuationMethod = false;
    }

    public void resetDerivativeListMethod()
    {
        hasDerivativeListMethod = false;
    }

    public void resetDerivativeCapPrice()
    {
        hasDerivativeCapPrice = false;
    }

    public void resetDerivativeFloorPrice()
    {
        hasDerivativeFloorPrice = false;
    }

    public void resetDerivativePutOrCall()
    {
        hasDerivativePutOrCall = false;
    }

    public void resetDerivativeExerciseStyle()
    {
        hasDerivativeExerciseStyle = false;
    }

    public void resetDerivativeOptPayAmount()
    {
        hasDerivativeOptPayAmount = false;
    }

    public void resetDerivativeTimeUnit()
    {
        hasDerivativeTimeUnit = false;
    }

    public void resetDerivativeSecurityExchange()
    {
        hasDerivativeSecurityExchange = false;
    }

    public void resetDerivativePositionLimit()
    {
        hasDerivativePositionLimit = false;
    }

    public void resetDerivativeNTPositionLimit()
    {
        hasDerivativeNTPositionLimit = false;
    }

    public void resetDerivativeIssuer()
    {
        hasDerivativeIssuer = false;
    }

    public void resetDerivativeEncodedIssuerLen()
    {
        hasDerivativeEncodedIssuerLen = false;
    }

    public void resetDerivativeEncodedIssuer()
    {
        hasDerivativeEncodedIssuer = false;
    }

    public void resetDerivativeSecurityDesc()
    {
        hasDerivativeSecurityDesc = false;
    }

    public void resetDerivativeEncodedSecurityDescLen()
    {
        hasDerivativeEncodedSecurityDescLen = false;
    }

    public void resetDerivativeEncodedSecurityDesc()
    {
        hasDerivativeEncodedSecurityDesc = false;
    }

    public void resetDerivativeContractSettlMonth()
    {
        hasDerivativeContractSettlMonth = false;
    }

    public void resetDerivativeSecurityAltIDGroup()
    {
        for (final DerivativeSecurityAltIDGroupDecoder derivativeSecurityAltIDGroupDecoder : derivativeSecurityAltIDGroupIterator.iterator())
        {
            derivativeSecurityAltIDGroupDecoder.reset();
            if (derivativeSecurityAltIDGroupDecoder.next() == null)
            {
                break;
            }
        }
        noDerivativeSecurityAltIDGroupCounter = MISSING_INT;
        hasNoDerivativeSecurityAltIDGroupCounter = false;
    }

    public void resetDerivativeSecurityXMLLen()
    {
        hasDerivativeSecurityXMLLen = false;
    }

    public void resetDerivativeSecurityXML()
    {
        hasDerivativeSecurityXML = false;
    }

    public void resetDerivativeSecurityXMLSchema()
    {
        hasDerivativeSecurityXMLSchema = false;
    }

    public void resetDerivativeEventsGroup()
    {
        for (final DerivativeEventsGroupDecoder derivativeEventsGroupDecoder : derivativeEventsGroupIterator.iterator())
        {
            derivativeEventsGroupDecoder.reset();
            if (derivativeEventsGroupDecoder.next() == null)
            {
                break;
            }
        }
        noDerivativeEventsGroupCounter = MISSING_INT;
        hasNoDerivativeEventsGroupCounter = false;
    }

    public void resetDerivativeInstrumentPartiesGroup()
    {
        for (final DerivativeInstrumentPartiesGroupDecoder derivativeInstrumentPartiesGroupDecoder : derivativeInstrumentPartiesGroupIterator.iterator())
        {
            derivativeInstrumentPartiesGroupDecoder.reset();
            if (derivativeInstrumentPartiesGroupDecoder.next() == null)
            {
                break;
            }
        }
        noDerivativeInstrumentPartiesGroupCounter = MISSING_INT;
        hasNoDerivativeInstrumentPartiesGroupCounter = false;
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
        builder.append("\"MessageName\": \"DerivativeSecurityListRequest\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        indent(builder, level);
        builder.append("\"SecurityReqID\": \"");
        builder.append(this.securityReqID(), 0, securityReqIDLength());
        builder.append("\",\n");

        indent(builder, level);
        builder.append("\"SecurityListRequestType\": \"");
        builder.append(securityListRequestType);
        builder.append("\",\n");

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

        if (hasUnderlyingSymbol())
        {
            indent(builder, level);
            builder.append("\"UnderlyingSymbol\": \"");
            builder.append(this.underlyingSymbol(), 0, underlyingSymbolLength());
            builder.append("\",\n");
        }

        if (hasUnderlyingSymbolSfx())
        {
            indent(builder, level);
            builder.append("\"UnderlyingSymbolSfx\": \"");
            builder.append(this.underlyingSymbolSfx(), 0, underlyingSymbolSfxLength());
            builder.append("\",\n");
        }

        if (hasUnderlyingSecurityID())
        {
            indent(builder, level);
            builder.append("\"UnderlyingSecurityID\": \"");
            builder.append(this.underlyingSecurityID(), 0, underlyingSecurityIDLength());
            builder.append("\",\n");
        }

        if (hasUnderlyingSecurityIDSource())
        {
            indent(builder, level);
            builder.append("\"UnderlyingSecurityIDSource\": \"");
            builder.append(this.underlyingSecurityIDSource(), 0, underlyingSecurityIDSourceLength());
            builder.append("\",\n");
        }

    if (hasNoUnderlyingSecurityAltIDGroupCounter)
    {
        indent(builder, level);
        builder.append("\"UnderlyingSecurityAltIDGroup\": [\n");
        UnderlyingSecurityAltIDGroupDecoder underlyingSecurityAltIDGroup = this.underlyingSecurityAltIDGroup;
        for (int i = 0, size = this.noUnderlyingSecurityAltIDGroupCounter; i < size; i++)
        {
            indent(builder, level);
            underlyingSecurityAltIDGroup.appendTo(builder, level + 1);            if (underlyingSecurityAltIDGroup.next() != null)
            {
                builder.append(',');
            }
            builder.append('\n');
            underlyingSecurityAltIDGroup = underlyingSecurityAltIDGroup.next();        }
        indent(builder, level);
        builder.append("],\n");
    }

        if (hasUnderlyingProduct())
        {
            indent(builder, level);
            builder.append("\"UnderlyingProduct\": \"");
            builder.append(underlyingProduct);
            builder.append("\",\n");
        }

        if (hasUnderlyingCFICode())
        {
            indent(builder, level);
            builder.append("\"UnderlyingCFICode\": \"");
            builder.append(this.underlyingCFICode(), 0, underlyingCFICodeLength());
            builder.append("\",\n");
        }

        if (hasUnderlyingSecurityType())
        {
            indent(builder, level);
            builder.append("\"UnderlyingSecurityType\": \"");
            builder.append(this.underlyingSecurityType(), 0, underlyingSecurityTypeLength());
            builder.append("\",\n");
        }

        if (hasUnderlyingSecuritySubType())
        {
            indent(builder, level);
            builder.append("\"UnderlyingSecuritySubType\": \"");
            builder.append(this.underlyingSecuritySubType(), 0, underlyingSecuritySubTypeLength());
            builder.append("\",\n");
        }

        if (hasUnderlyingMaturityMonthYear())
        {
            indent(builder, level);
            builder.append("\"UnderlyingMaturityMonthYear\": \"");
            appendData(builder, underlyingMaturityMonthYear, underlyingMaturityMonthYearLength);
            builder.append("\",\n");
        }

        if (hasUnderlyingMaturityDate())
        {
            indent(builder, level);
            builder.append("\"UnderlyingMaturityDate\": \"");
            appendData(builder, underlyingMaturityDate, underlyingMaturityDateLength);
            builder.append("\",\n");
        }

        if (hasUnderlyingMaturityTime())
        {
            indent(builder, level);
            builder.append("\"UnderlyingMaturityTime\": \"");
            appendData(builder, underlyingMaturityTime, underlyingMaturityTimeLength);
            builder.append("\",\n");
        }

        if (hasUnderlyingCouponPaymentDate())
        {
            indent(builder, level);
            builder.append("\"UnderlyingCouponPaymentDate\": \"");
            appendData(builder, underlyingCouponPaymentDate, underlyingCouponPaymentDateLength);
            builder.append("\",\n");
        }

        if (hasUnderlyingRestructuringType())
        {
            indent(builder, level);
            builder.append("\"UnderlyingRestructuringType\": \"");
            builder.append(this.underlyingRestructuringType(), 0, underlyingRestructuringTypeLength());
            builder.append("\",\n");
        }

        if (hasUnderlyingSeniority())
        {
            indent(builder, level);
            builder.append("\"UnderlyingSeniority\": \"");
            builder.append(this.underlyingSeniority(), 0, underlyingSeniorityLength());
            builder.append("\",\n");
        }

        if (hasUnderlyingNotionalPercentageOutstanding())
        {
            indent(builder, level);
            builder.append("\"UnderlyingNotionalPercentageOutstanding\": \"");
            underlyingNotionalPercentageOutstanding.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasUnderlyingOriginalNotionalPercentageOutstanding())
        {
            indent(builder, level);
            builder.append("\"UnderlyingOriginalNotionalPercentageOutstanding\": \"");
            underlyingOriginalNotionalPercentageOutstanding.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasUnderlyingAttachmentPoint())
        {
            indent(builder, level);
            builder.append("\"UnderlyingAttachmentPoint\": \"");
            underlyingAttachmentPoint.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasUnderlyingDetachmentPoint())
        {
            indent(builder, level);
            builder.append("\"UnderlyingDetachmentPoint\": \"");
            underlyingDetachmentPoint.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasUnderlyingIssueDate())
        {
            indent(builder, level);
            builder.append("\"UnderlyingIssueDate\": \"");
            appendData(builder, underlyingIssueDate, underlyingIssueDateLength);
            builder.append("\",\n");
        }

        if (hasUnderlyingRepoCollateralSecurityType())
        {
            indent(builder, level);
            builder.append("\"UnderlyingRepoCollateralSecurityType\": \"");
            builder.append(this.underlyingRepoCollateralSecurityType(), 0, underlyingRepoCollateralSecurityTypeLength());
            builder.append("\",\n");
        }

        if (hasUnderlyingRepurchaseTerm())
        {
            indent(builder, level);
            builder.append("\"UnderlyingRepurchaseTerm\": \"");
            builder.append(underlyingRepurchaseTerm);
            builder.append("\",\n");
        }

        if (hasUnderlyingRepurchaseRate())
        {
            indent(builder, level);
            builder.append("\"UnderlyingRepurchaseRate\": \"");
            underlyingRepurchaseRate.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasUnderlyingFactor())
        {
            indent(builder, level);
            builder.append("\"UnderlyingFactor\": \"");
            underlyingFactor.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasUnderlyingCreditRating())
        {
            indent(builder, level);
            builder.append("\"UnderlyingCreditRating\": \"");
            builder.append(this.underlyingCreditRating(), 0, underlyingCreditRatingLength());
            builder.append("\",\n");
        }

        if (hasUnderlyingInstrRegistry())
        {
            indent(builder, level);
            builder.append("\"UnderlyingInstrRegistry\": \"");
            builder.append(this.underlyingInstrRegistry(), 0, underlyingInstrRegistryLength());
            builder.append("\",\n");
        }

        if (hasUnderlyingCountryOfIssue())
        {
            indent(builder, level);
            builder.append("\"UnderlyingCountryOfIssue\": \"");
            builder.append(this.underlyingCountryOfIssue(), 0, underlyingCountryOfIssueLength());
            builder.append("\",\n");
        }

        if (hasUnderlyingStateOrProvinceOfIssue())
        {
            indent(builder, level);
            builder.append("\"UnderlyingStateOrProvinceOfIssue\": \"");
            builder.append(this.underlyingStateOrProvinceOfIssue(), 0, underlyingStateOrProvinceOfIssueLength());
            builder.append("\",\n");
        }

        if (hasUnderlyingLocaleOfIssue())
        {
            indent(builder, level);
            builder.append("\"UnderlyingLocaleOfIssue\": \"");
            builder.append(this.underlyingLocaleOfIssue(), 0, underlyingLocaleOfIssueLength());
            builder.append("\",\n");
        }

        if (hasUnderlyingRedemptionDate())
        {
            indent(builder, level);
            builder.append("\"UnderlyingRedemptionDate\": \"");
            appendData(builder, underlyingRedemptionDate, underlyingRedemptionDateLength);
            builder.append("\",\n");
        }

        if (hasUnderlyingStrikePrice())
        {
            indent(builder, level);
            builder.append("\"UnderlyingStrikePrice\": \"");
            underlyingStrikePrice.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasUnderlyingStrikeCurrency())
        {
            indent(builder, level);
            builder.append("\"UnderlyingStrikeCurrency\": \"");
            builder.append(this.underlyingStrikeCurrency(), 0, underlyingStrikeCurrencyLength());
            builder.append("\",\n");
        }

        if (hasUnderlyingOptAttribute())
        {
            indent(builder, level);
            builder.append("\"UnderlyingOptAttribute\": \"");
            builder.append(underlyingOptAttribute);
            builder.append("\",\n");
        }

        if (hasUnderlyingContractMultiplier())
        {
            indent(builder, level);
            builder.append("\"UnderlyingContractMultiplier\": \"");
            underlyingContractMultiplier.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasUnderlyingContractMultiplierUnit())
        {
            indent(builder, level);
            builder.append("\"UnderlyingContractMultiplierUnit\": \"");
            builder.append(underlyingContractMultiplierUnit);
            builder.append("\",\n");
        }

        if (hasUnderlyingFlowScheduleType())
        {
            indent(builder, level);
            builder.append("\"UnderlyingFlowScheduleType\": \"");
            builder.append(underlyingFlowScheduleType);
            builder.append("\",\n");
        }

        if (hasUnderlyingUnitOfMeasure())
        {
            indent(builder, level);
            builder.append("\"UnderlyingUnitOfMeasure\": \"");
            builder.append(this.underlyingUnitOfMeasure(), 0, underlyingUnitOfMeasureLength());
            builder.append("\",\n");
        }

        if (hasUnderlyingUnitOfMeasureQty())
        {
            indent(builder, level);
            builder.append("\"UnderlyingUnitOfMeasureQty\": \"");
            underlyingUnitOfMeasureQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasUnderlyingPriceUnitOfMeasure())
        {
            indent(builder, level);
            builder.append("\"UnderlyingPriceUnitOfMeasure\": \"");
            builder.append(this.underlyingPriceUnitOfMeasure(), 0, underlyingPriceUnitOfMeasureLength());
            builder.append("\",\n");
        }

        if (hasUnderlyingPriceUnitOfMeasureQty())
        {
            indent(builder, level);
            builder.append("\"UnderlyingPriceUnitOfMeasureQty\": \"");
            underlyingPriceUnitOfMeasureQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasUnderlyingTimeUnit())
        {
            indent(builder, level);
            builder.append("\"UnderlyingTimeUnit\": \"");
            builder.append(this.underlyingTimeUnit(), 0, underlyingTimeUnitLength());
            builder.append("\",\n");
        }

        if (hasUnderlyingExerciseStyle())
        {
            indent(builder, level);
            builder.append("\"UnderlyingExerciseStyle\": \"");
            builder.append(underlyingExerciseStyle);
            builder.append("\",\n");
        }

        if (hasUnderlyingCouponRate())
        {
            indent(builder, level);
            builder.append("\"UnderlyingCouponRate\": \"");
            underlyingCouponRate.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasUnderlyingSecurityExchange())
        {
            indent(builder, level);
            builder.append("\"UnderlyingSecurityExchange\": \"");
            builder.append(this.underlyingSecurityExchange(), 0, underlyingSecurityExchangeLength());
            builder.append("\",\n");
        }

        if (hasUnderlyingIssuer())
        {
            indent(builder, level);
            builder.append("\"UnderlyingIssuer\": \"");
            builder.append(this.underlyingIssuer(), 0, underlyingIssuerLength());
            builder.append("\",\n");
        }

        if (hasEncodedUnderlyingIssuerLen())
        {
            indent(builder, level);
            builder.append("\"EncodedUnderlyingIssuerLen\": \"");
            builder.append(encodedUnderlyingIssuerLen);
            builder.append("\",\n");
        }

        if (hasEncodedUnderlyingIssuer())
        {
            indent(builder, level);
            builder.append("\"EncodedUnderlyingIssuer\": \"");
            appendData(builder, encodedUnderlyingIssuer, encodedUnderlyingIssuerLen);
            builder.append("\",\n");
        }

        if (hasUnderlyingSecurityDesc())
        {
            indent(builder, level);
            builder.append("\"UnderlyingSecurityDesc\": \"");
            builder.append(this.underlyingSecurityDesc(), 0, underlyingSecurityDescLength());
            builder.append("\",\n");
        }

        if (hasEncodedUnderlyingSecurityDescLen())
        {
            indent(builder, level);
            builder.append("\"EncodedUnderlyingSecurityDescLen\": \"");
            builder.append(encodedUnderlyingSecurityDescLen);
            builder.append("\",\n");
        }

        if (hasEncodedUnderlyingSecurityDesc())
        {
            indent(builder, level);
            builder.append("\"EncodedUnderlyingSecurityDesc\": \"");
            appendData(builder, encodedUnderlyingSecurityDesc, encodedUnderlyingSecurityDescLen);
            builder.append("\",\n");
        }

        if (hasUnderlyingCPProgram())
        {
            indent(builder, level);
            builder.append("\"UnderlyingCPProgram\": \"");
            builder.append(this.underlyingCPProgram(), 0, underlyingCPProgramLength());
            builder.append("\",\n");
        }

        if (hasUnderlyingCPRegType())
        {
            indent(builder, level);
            builder.append("\"UnderlyingCPRegType\": \"");
            builder.append(this.underlyingCPRegType(), 0, underlyingCPRegTypeLength());
            builder.append("\",\n");
        }

        if (hasUnderlyingAllocationPercent())
        {
            indent(builder, level);
            builder.append("\"UnderlyingAllocationPercent\": \"");
            underlyingAllocationPercent.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasUnderlyingCurrency())
        {
            indent(builder, level);
            builder.append("\"UnderlyingCurrency\": \"");
            builder.append(this.underlyingCurrency(), 0, underlyingCurrencyLength());
            builder.append("\",\n");
        }

        if (hasUnderlyingQty())
        {
            indent(builder, level);
            builder.append("\"UnderlyingQty\": \"");
            underlyingQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasUnderlyingSettlementType())
        {
            indent(builder, level);
            builder.append("\"UnderlyingSettlementType\": \"");
            builder.append(underlyingSettlementType);
            builder.append("\",\n");
        }

        if (hasUnderlyingCashAmount())
        {
            indent(builder, level);
            builder.append("\"UnderlyingCashAmount\": \"");
            underlyingCashAmount.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasUnderlyingCashType())
        {
            indent(builder, level);
            builder.append("\"UnderlyingCashType\": \"");
            builder.append(this.underlyingCashType(), 0, underlyingCashTypeLength());
            builder.append("\",\n");
        }

        if (hasUnderlyingPx())
        {
            indent(builder, level);
            builder.append("\"UnderlyingPx\": \"");
            underlyingPx.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasUnderlyingDirtyPrice())
        {
            indent(builder, level);
            builder.append("\"UnderlyingDirtyPrice\": \"");
            underlyingDirtyPrice.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasUnderlyingEndPrice())
        {
            indent(builder, level);
            builder.append("\"UnderlyingEndPrice\": \"");
            underlyingEndPrice.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasUnderlyingStartValue())
        {
            indent(builder, level);
            builder.append("\"UnderlyingStartValue\": \"");
            underlyingStartValue.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasUnderlyingCurrentValue())
        {
            indent(builder, level);
            builder.append("\"UnderlyingCurrentValue\": \"");
            underlyingCurrentValue.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasUnderlyingEndValue())
        {
            indent(builder, level);
            builder.append("\"UnderlyingEndValue\": \"");
            underlyingEndValue.appendTo(builder);
            builder.append("\",\n");
        }

    if (hasNoUnderlyingStipsGroupCounter)
    {
        indent(builder, level);
        builder.append("\"UnderlyingStipsGroup\": [\n");
        UnderlyingStipsGroupDecoder underlyingStipsGroup = this.underlyingStipsGroup;
        for (int i = 0, size = this.noUnderlyingStipsGroupCounter; i < size; i++)
        {
            indent(builder, level);
            underlyingStipsGroup.appendTo(builder, level + 1);            if (underlyingStipsGroup.next() != null)
            {
                builder.append(',');
            }
            builder.append('\n');
            underlyingStipsGroup = underlyingStipsGroup.next();        }
        indent(builder, level);
        builder.append("],\n");
    }

        if (hasUnderlyingAdjustedQuantity())
        {
            indent(builder, level);
            builder.append("\"UnderlyingAdjustedQuantity\": \"");
            underlyingAdjustedQuantity.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasUnderlyingFXRate())
        {
            indent(builder, level);
            builder.append("\"UnderlyingFXRate\": \"");
            underlyingFXRate.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasUnderlyingFXRateCalc())
        {
            indent(builder, level);
            builder.append("\"UnderlyingFXRateCalc\": \"");
            builder.append(underlyingFXRateCalc);
            builder.append("\",\n");
        }

        if (hasUnderlyingCapValue())
        {
            indent(builder, level);
            builder.append("\"UnderlyingCapValue\": \"");
            underlyingCapValue.appendTo(builder);
            builder.append("\",\n");
        }

    if (hasNoUndlyInstrumentPartiesGroupCounter)
    {
        indent(builder, level);
        builder.append("\"UndlyInstrumentPartiesGroup\": [\n");
        UndlyInstrumentPartiesGroupDecoder undlyInstrumentPartiesGroup = this.undlyInstrumentPartiesGroup;
        for (int i = 0, size = this.noUndlyInstrumentPartiesGroupCounter; i < size; i++)
        {
            indent(builder, level);
            undlyInstrumentPartiesGroup.appendTo(builder, level + 1);            if (undlyInstrumentPartiesGroup.next() != null)
            {
                builder.append(',');
            }
            builder.append('\n');
            undlyInstrumentPartiesGroup = undlyInstrumentPartiesGroup.next();        }
        indent(builder, level);
        builder.append("],\n");
    }

        if (hasUnderlyingSettlMethod())
        {
            indent(builder, level);
            builder.append("\"UnderlyingSettlMethod\": \"");
            builder.append(this.underlyingSettlMethod(), 0, underlyingSettlMethodLength());
            builder.append("\",\n");
        }

        if (hasUnderlyingPutOrCall())
        {
            indent(builder, level);
            builder.append("\"UnderlyingPutOrCall\": \"");
            builder.append(underlyingPutOrCall);
            builder.append("\",\n");
        }

        if (hasDerivativeSymbol())
        {
            indent(builder, level);
            builder.append("\"DerivativeSymbol\": \"");
            builder.append(this.derivativeSymbol(), 0, derivativeSymbolLength());
            builder.append("\",\n");
        }

        if (hasDerivativeSymbolSfx())
        {
            indent(builder, level);
            builder.append("\"DerivativeSymbolSfx\": \"");
            builder.append(this.derivativeSymbolSfx(), 0, derivativeSymbolSfxLength());
            builder.append("\",\n");
        }

        if (hasDerivativeSecurityID())
        {
            indent(builder, level);
            builder.append("\"DerivativeSecurityID\": \"");
            builder.append(this.derivativeSecurityID(), 0, derivativeSecurityIDLength());
            builder.append("\",\n");
        }

        if (hasDerivativeSecurityIDSource())
        {
            indent(builder, level);
            builder.append("\"DerivativeSecurityIDSource\": \"");
            builder.append(this.derivativeSecurityIDSource(), 0, derivativeSecurityIDSourceLength());
            builder.append("\",\n");
        }

    if (hasNoDerivativeSecurityAltIDGroupCounter)
    {
        indent(builder, level);
        builder.append("\"DerivativeSecurityAltIDGroup\": [\n");
        DerivativeSecurityAltIDGroupDecoder derivativeSecurityAltIDGroup = this.derivativeSecurityAltIDGroup;
        for (int i = 0, size = this.noDerivativeSecurityAltIDGroupCounter; i < size; i++)
        {
            indent(builder, level);
            derivativeSecurityAltIDGroup.appendTo(builder, level + 1);            if (derivativeSecurityAltIDGroup.next() != null)
            {
                builder.append(',');
            }
            builder.append('\n');
            derivativeSecurityAltIDGroup = derivativeSecurityAltIDGroup.next();        }
        indent(builder, level);
        builder.append("],\n");
    }

        if (hasDerivativeProduct())
        {
            indent(builder, level);
            builder.append("\"DerivativeProduct\": \"");
            builder.append(derivativeProduct);
            builder.append("\",\n");
        }

        if (hasDerivativeProductComplex())
        {
            indent(builder, level);
            builder.append("\"DerivativeProductComplex\": \"");
            builder.append(this.derivativeProductComplex(), 0, derivativeProductComplexLength());
            builder.append("\",\n");
        }

        if (hasDerivFlexProductEligibilityIndicator())
        {
            indent(builder, level);
            builder.append("\"DerivFlexProductEligibilityIndicator\": \"");
            builder.append(derivFlexProductEligibilityIndicator);
            builder.append("\",\n");
        }

        if (hasDerivativeSecurityGroup())
        {
            indent(builder, level);
            builder.append("\"DerivativeSecurityGroup\": \"");
            builder.append(this.derivativeSecurityGroup(), 0, derivativeSecurityGroupLength());
            builder.append("\",\n");
        }

        if (hasDerivativeCFICode())
        {
            indent(builder, level);
            builder.append("\"DerivativeCFICode\": \"");
            builder.append(this.derivativeCFICode(), 0, derivativeCFICodeLength());
            builder.append("\",\n");
        }

        if (hasDerivativeSecurityType())
        {
            indent(builder, level);
            builder.append("\"DerivativeSecurityType\": \"");
            builder.append(this.derivativeSecurityType(), 0, derivativeSecurityTypeLength());
            builder.append("\",\n");
        }

        if (hasDerivativeSecuritySubType())
        {
            indent(builder, level);
            builder.append("\"DerivativeSecuritySubType\": \"");
            builder.append(this.derivativeSecuritySubType(), 0, derivativeSecuritySubTypeLength());
            builder.append("\",\n");
        }

        if (hasDerivativeMaturityMonthYear())
        {
            indent(builder, level);
            builder.append("\"DerivativeMaturityMonthYear\": \"");
            appendData(builder, derivativeMaturityMonthYear, derivativeMaturityMonthYearLength);
            builder.append("\",\n");
        }

        if (hasDerivativeMaturityDate())
        {
            indent(builder, level);
            builder.append("\"DerivativeMaturityDate\": \"");
            appendData(builder, derivativeMaturityDate, derivativeMaturityDateLength);
            builder.append("\",\n");
        }

        if (hasDerivativeMaturityTime())
        {
            indent(builder, level);
            builder.append("\"DerivativeMaturityTime\": \"");
            appendData(builder, derivativeMaturityTime, derivativeMaturityTimeLength);
            builder.append("\",\n");
        }

        if (hasDerivativeSettleOnOpenFlag())
        {
            indent(builder, level);
            builder.append("\"DerivativeSettleOnOpenFlag\": \"");
            builder.append(this.derivativeSettleOnOpenFlag(), 0, derivativeSettleOnOpenFlagLength());
            builder.append("\",\n");
        }

        if (hasDerivativeInstrmtAssignmentMethod())
        {
            indent(builder, level);
            builder.append("\"DerivativeInstrmtAssignmentMethod\": \"");
            builder.append(derivativeInstrmtAssignmentMethod);
            builder.append("\",\n");
        }

        if (hasDerivativeSecurityStatus())
        {
            indent(builder, level);
            builder.append("\"DerivativeSecurityStatus\": \"");
            builder.append(this.derivativeSecurityStatus(), 0, derivativeSecurityStatusLength());
            builder.append("\",\n");
        }

        if (hasDerivativeIssueDate())
        {
            indent(builder, level);
            builder.append("\"DerivativeIssueDate\": \"");
            appendData(builder, derivativeIssueDate, derivativeIssueDateLength);
            builder.append("\",\n");
        }

        if (hasDerivativeInstrRegistry())
        {
            indent(builder, level);
            builder.append("\"DerivativeInstrRegistry\": \"");
            builder.append(this.derivativeInstrRegistry(), 0, derivativeInstrRegistryLength());
            builder.append("\",\n");
        }

        if (hasDerivativeCountryOfIssue())
        {
            indent(builder, level);
            builder.append("\"DerivativeCountryOfIssue\": \"");
            builder.append(this.derivativeCountryOfIssue(), 0, derivativeCountryOfIssueLength());
            builder.append("\",\n");
        }

        if (hasDerivativeStateOrProvinceOfIssue())
        {
            indent(builder, level);
            builder.append("\"DerivativeStateOrProvinceOfIssue\": \"");
            builder.append(this.derivativeStateOrProvinceOfIssue(), 0, derivativeStateOrProvinceOfIssueLength());
            builder.append("\",\n");
        }

        if (hasDerivativeLocaleOfIssue())
        {
            indent(builder, level);
            builder.append("\"DerivativeLocaleOfIssue\": \"");
            builder.append(this.derivativeLocaleOfIssue(), 0, derivativeLocaleOfIssueLength());
            builder.append("\",\n");
        }

        if (hasDerivativeStrikePrice())
        {
            indent(builder, level);
            builder.append("\"DerivativeStrikePrice\": \"");
            derivativeStrikePrice.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasDerivativeStrikeCurrency())
        {
            indent(builder, level);
            builder.append("\"DerivativeStrikeCurrency\": \"");
            builder.append(this.derivativeStrikeCurrency(), 0, derivativeStrikeCurrencyLength());
            builder.append("\",\n");
        }

        if (hasDerivativeStrikeMultiplier())
        {
            indent(builder, level);
            builder.append("\"DerivativeStrikeMultiplier\": \"");
            derivativeStrikeMultiplier.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasDerivativeStrikeValue())
        {
            indent(builder, level);
            builder.append("\"DerivativeStrikeValue\": \"");
            derivativeStrikeValue.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasDerivativeOptAttribute())
        {
            indent(builder, level);
            builder.append("\"DerivativeOptAttribute\": \"");
            builder.append(derivativeOptAttribute);
            builder.append("\",\n");
        }

        if (hasDerivativeContractMultiplier())
        {
            indent(builder, level);
            builder.append("\"DerivativeContractMultiplier\": \"");
            derivativeContractMultiplier.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasDerivativeContractMultiplierUnit())
        {
            indent(builder, level);
            builder.append("\"DerivativeContractMultiplierUnit\": \"");
            builder.append(derivativeContractMultiplierUnit);
            builder.append("\",\n");
        }

        if (hasDerivativeFlowScheduleType())
        {
            indent(builder, level);
            builder.append("\"DerivativeFlowScheduleType\": \"");
            builder.append(derivativeFlowScheduleType);
            builder.append("\",\n");
        }

        if (hasDerivativeMinPriceIncrement())
        {
            indent(builder, level);
            builder.append("\"DerivativeMinPriceIncrement\": \"");
            derivativeMinPriceIncrement.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasDerivativeMinPriceIncrementAmount())
        {
            indent(builder, level);
            builder.append("\"DerivativeMinPriceIncrementAmount\": \"");
            derivativeMinPriceIncrementAmount.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasDerivativeUnitOfMeasure())
        {
            indent(builder, level);
            builder.append("\"DerivativeUnitOfMeasure\": \"");
            builder.append(this.derivativeUnitOfMeasure(), 0, derivativeUnitOfMeasureLength());
            builder.append("\",\n");
        }

        if (hasDerivativeUnitOfMeasureQty())
        {
            indent(builder, level);
            builder.append("\"DerivativeUnitOfMeasureQty\": \"");
            derivativeUnitOfMeasureQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasDerivativePriceUnitOfMeasure())
        {
            indent(builder, level);
            builder.append("\"DerivativePriceUnitOfMeasure\": \"");
            builder.append(this.derivativePriceUnitOfMeasure(), 0, derivativePriceUnitOfMeasureLength());
            builder.append("\",\n");
        }

        if (hasDerivativePriceUnitOfMeasureQty())
        {
            indent(builder, level);
            builder.append("\"DerivativePriceUnitOfMeasureQty\": \"");
            derivativePriceUnitOfMeasureQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasDerivativeSettlMethod())
        {
            indent(builder, level);
            builder.append("\"DerivativeSettlMethod\": \"");
            builder.append(derivativeSettlMethod);
            builder.append("\",\n");
        }

        if (hasDerivativePriceQuoteMethod())
        {
            indent(builder, level);
            builder.append("\"DerivativePriceQuoteMethod\": \"");
            builder.append(this.derivativePriceQuoteMethod(), 0, derivativePriceQuoteMethodLength());
            builder.append("\",\n");
        }

        if (hasDerivativeValuationMethod())
        {
            indent(builder, level);
            builder.append("\"DerivativeValuationMethod\": \"");
            builder.append(this.derivativeValuationMethod(), 0, derivativeValuationMethodLength());
            builder.append("\",\n");
        }

        if (hasDerivativeListMethod())
        {
            indent(builder, level);
            builder.append("\"DerivativeListMethod\": \"");
            builder.append(derivativeListMethod);
            builder.append("\",\n");
        }

        if (hasDerivativeCapPrice())
        {
            indent(builder, level);
            builder.append("\"DerivativeCapPrice\": \"");
            derivativeCapPrice.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasDerivativeFloorPrice())
        {
            indent(builder, level);
            builder.append("\"DerivativeFloorPrice\": \"");
            derivativeFloorPrice.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasDerivativePutOrCall())
        {
            indent(builder, level);
            builder.append("\"DerivativePutOrCall\": \"");
            builder.append(derivativePutOrCall);
            builder.append("\",\n");
        }

        if (hasDerivativeExerciseStyle())
        {
            indent(builder, level);
            builder.append("\"DerivativeExerciseStyle\": \"");
            builder.append(derivativeExerciseStyle);
            builder.append("\",\n");
        }

        if (hasDerivativeOptPayAmount())
        {
            indent(builder, level);
            builder.append("\"DerivativeOptPayAmount\": \"");
            derivativeOptPayAmount.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasDerivativeTimeUnit())
        {
            indent(builder, level);
            builder.append("\"DerivativeTimeUnit\": \"");
            builder.append(this.derivativeTimeUnit(), 0, derivativeTimeUnitLength());
            builder.append("\",\n");
        }

        if (hasDerivativeSecurityExchange())
        {
            indent(builder, level);
            builder.append("\"DerivativeSecurityExchange\": \"");
            builder.append(this.derivativeSecurityExchange(), 0, derivativeSecurityExchangeLength());
            builder.append("\",\n");
        }

        if (hasDerivativePositionLimit())
        {
            indent(builder, level);
            builder.append("\"DerivativePositionLimit\": \"");
            builder.append(derivativePositionLimit);
            builder.append("\",\n");
        }

        if (hasDerivativeNTPositionLimit())
        {
            indent(builder, level);
            builder.append("\"DerivativeNTPositionLimit\": \"");
            builder.append(derivativeNTPositionLimit);
            builder.append("\",\n");
        }

        if (hasDerivativeIssuer())
        {
            indent(builder, level);
            builder.append("\"DerivativeIssuer\": \"");
            builder.append(this.derivativeIssuer(), 0, derivativeIssuerLength());
            builder.append("\",\n");
        }

        if (hasDerivativeEncodedIssuerLen())
        {
            indent(builder, level);
            builder.append("\"DerivativeEncodedIssuerLen\": \"");
            builder.append(derivativeEncodedIssuerLen);
            builder.append("\",\n");
        }

        if (hasDerivativeEncodedIssuer())
        {
            indent(builder, level);
            builder.append("\"DerivativeEncodedIssuer\": \"");
            appendData(builder, derivativeEncodedIssuer, derivativeEncodedIssuerLen);
            builder.append("\",\n");
        }

        if (hasDerivativeSecurityDesc())
        {
            indent(builder, level);
            builder.append("\"DerivativeSecurityDesc\": \"");
            builder.append(this.derivativeSecurityDesc(), 0, derivativeSecurityDescLength());
            builder.append("\",\n");
        }

        if (hasDerivativeEncodedSecurityDescLen())
        {
            indent(builder, level);
            builder.append("\"DerivativeEncodedSecurityDescLen\": \"");
            builder.append(derivativeEncodedSecurityDescLen);
            builder.append("\",\n");
        }

        if (hasDerivativeEncodedSecurityDesc())
        {
            indent(builder, level);
            builder.append("\"DerivativeEncodedSecurityDesc\": \"");
            appendData(builder, derivativeEncodedSecurityDesc, derivativeEncodedSecurityDescLen);
            builder.append("\",\n");
        }

        if (hasDerivativeSecurityXMLLen())
        {
            indent(builder, level);
            builder.append("\"DerivativeSecurityXMLLen\": \"");
            builder.append(derivativeSecurityXMLLen);
            builder.append("\",\n");
        }

        if (hasDerivativeSecurityXML())
        {
            indent(builder, level);
            builder.append("\"DerivativeSecurityXML\": \"");
            appendData(builder, derivativeSecurityXML, derivativeSecurityXMLLen);
            builder.append("\",\n");
        }

        if (hasDerivativeSecurityXMLSchema())
        {
            indent(builder, level);
            builder.append("\"DerivativeSecurityXMLSchema\": \"");
            builder.append(this.derivativeSecurityXMLSchema(), 0, derivativeSecurityXMLSchemaLength());
            builder.append("\",\n");
        }

        if (hasDerivativeContractSettlMonth())
        {
            indent(builder, level);
            builder.append("\"DerivativeContractSettlMonth\": \"");
            appendData(builder, derivativeContractSettlMonth, derivativeContractSettlMonthLength);
            builder.append("\",\n");
        }

    if (hasNoDerivativeEventsGroupCounter)
    {
        indent(builder, level);
        builder.append("\"DerivativeEventsGroup\": [\n");
        DerivativeEventsGroupDecoder derivativeEventsGroup = this.derivativeEventsGroup;
        for (int i = 0, size = this.noDerivativeEventsGroupCounter; i < size; i++)
        {
            indent(builder, level);
            derivativeEventsGroup.appendTo(builder, level + 1);            if (derivativeEventsGroup.next() != null)
            {
                builder.append(',');
            }
            builder.append('\n');
            derivativeEventsGroup = derivativeEventsGroup.next();        }
        indent(builder, level);
        builder.append("],\n");
    }

    if (hasNoDerivativeInstrumentPartiesGroupCounter)
    {
        indent(builder, level);
        builder.append("\"DerivativeInstrumentPartiesGroup\": [\n");
        DerivativeInstrumentPartiesGroupDecoder derivativeInstrumentPartiesGroup = this.derivativeInstrumentPartiesGroup;
        for (int i = 0, size = this.noDerivativeInstrumentPartiesGroupCounter; i < size; i++)
        {
            indent(builder, level);
            derivativeInstrumentPartiesGroup.appendTo(builder, level + 1);            if (derivativeInstrumentPartiesGroup.next() != null)
            {
                builder.append(',');
            }
            builder.append('\n');
            derivativeInstrumentPartiesGroup = derivativeInstrumentPartiesGroup.next();        }
        indent(builder, level);
        builder.append("],\n");
    }

        if (hasSecuritySubType())
        {
            indent(builder, level);
            builder.append("\"SecuritySubType\": \"");
            builder.append(this.securitySubType(), 0, securitySubTypeLength());
            builder.append("\",\n");
        }

        if (hasCurrency())
        {
            indent(builder, level);
            builder.append("\"Currency\": \"");
            builder.append(this.currency(), 0, currencyLength());
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

        if (hasSubscriptionRequestType())
        {
            indent(builder, level);
            builder.append("\"SubscriptionRequestType\": \"");
            builder.append(subscriptionRequestType);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public DerivativeSecurityListRequestEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((DerivativeSecurityListRequestEncoder)encoder);
    }

    public DerivativeSecurityListRequestEncoder toEncoder(final DerivativeSecurityListRequestEncoder encoder)
    {
        encoder.reset();
        encoder.securityReqID(this.securityReqID(), 0, securityReqIDLength());
        encoder.securityListRequestType(this.securityListRequestType());
        if (hasMarketID())
        {
            encoder.marketID(this.marketID(), 0, marketIDLength());
        }

        if (hasMarketSegmentID())
        {
            encoder.marketSegmentID(this.marketSegmentID(), 0, marketSegmentIDLength());
        }


        final UnderlyingInstrumentEncoder underlyingInstrument = encoder.underlyingInstrument();        if (hasUnderlyingSymbol())
        {
            underlyingInstrument.underlyingSymbol(this.underlyingSymbol(), 0, underlyingSymbolLength());
        }

        if (hasUnderlyingSymbolSfx())
        {
            underlyingInstrument.underlyingSymbolSfx(this.underlyingSymbolSfx(), 0, underlyingSymbolSfxLength());
        }

        if (hasUnderlyingSecurityID())
        {
            underlyingInstrument.underlyingSecurityID(this.underlyingSecurityID(), 0, underlyingSecurityIDLength());
        }

        if (hasUnderlyingSecurityIDSource())
        {
            underlyingInstrument.underlyingSecurityIDSource(this.underlyingSecurityIDSource(), 0, underlyingSecurityIDSourceLength());
        }


        final UndSecAltIDGrpEncoder undSecAltIDGrp = underlyingInstrument.undSecAltIDGrp();        if (hasNoUnderlyingSecurityAltIDGroupCounter)
        {
            final int size = this.noUnderlyingSecurityAltIDGroupCounter;
            UnderlyingSecurityAltIDGroupDecoder underlyingSecurityAltIDGroup = this.underlyingSecurityAltIDGroup;
            UnderlyingSecurityAltIDGroupEncoder underlyingSecurityAltIDGroupEncoder = undSecAltIDGrp.underlyingSecurityAltIDGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (underlyingSecurityAltIDGroup != null)
                {
                    underlyingSecurityAltIDGroup.toEncoder(underlyingSecurityAltIDGroupEncoder);
                    underlyingSecurityAltIDGroup = underlyingSecurityAltIDGroup.next();
                    underlyingSecurityAltIDGroupEncoder = underlyingSecurityAltIDGroupEncoder.next();
                }
            }
        }


        if (hasUnderlyingProduct())
        {
            underlyingInstrument.underlyingProduct(this.underlyingProduct());
        }

        if (hasUnderlyingCFICode())
        {
            underlyingInstrument.underlyingCFICode(this.underlyingCFICode(), 0, underlyingCFICodeLength());
        }

        if (hasUnderlyingSecurityType())
        {
            underlyingInstrument.underlyingSecurityType(this.underlyingSecurityType(), 0, underlyingSecurityTypeLength());
        }

        if (hasUnderlyingSecuritySubType())
        {
            underlyingInstrument.underlyingSecuritySubType(this.underlyingSecuritySubType(), 0, underlyingSecuritySubTypeLength());
        }

        if (hasUnderlyingMaturityMonthYear())
        {
            underlyingInstrument.underlyingMaturityMonthYearAsCopy(this.underlyingMaturityMonthYear(), 0, underlyingMaturityMonthYearLength());
        }

        if (hasUnderlyingMaturityDate())
        {
            underlyingInstrument.underlyingMaturityDateAsCopy(this.underlyingMaturityDate(), 0, underlyingMaturityDateLength());
        }

        if (hasUnderlyingMaturityTime())
        {
            underlyingInstrument.underlyingMaturityTimeAsCopy(this.underlyingMaturityTime(), 0, underlyingMaturityTimeLength());
        }

        if (hasUnderlyingCouponPaymentDate())
        {
            underlyingInstrument.underlyingCouponPaymentDateAsCopy(this.underlyingCouponPaymentDate(), 0, underlyingCouponPaymentDateLength());
        }

        if (hasUnderlyingRestructuringType())
        {
            underlyingInstrument.underlyingRestructuringType(this.underlyingRestructuringType(), 0, underlyingRestructuringTypeLength());
        }

        if (hasUnderlyingSeniority())
        {
            underlyingInstrument.underlyingSeniority(this.underlyingSeniority(), 0, underlyingSeniorityLength());
        }

        if (hasUnderlyingNotionalPercentageOutstanding())
        {
            underlyingInstrument.underlyingNotionalPercentageOutstanding(this.underlyingNotionalPercentageOutstanding());
        }

        if (hasUnderlyingOriginalNotionalPercentageOutstanding())
        {
            underlyingInstrument.underlyingOriginalNotionalPercentageOutstanding(this.underlyingOriginalNotionalPercentageOutstanding());
        }

        if (hasUnderlyingAttachmentPoint())
        {
            underlyingInstrument.underlyingAttachmentPoint(this.underlyingAttachmentPoint());
        }

        if (hasUnderlyingDetachmentPoint())
        {
            underlyingInstrument.underlyingDetachmentPoint(this.underlyingDetachmentPoint());
        }

        if (hasUnderlyingIssueDate())
        {
            underlyingInstrument.underlyingIssueDateAsCopy(this.underlyingIssueDate(), 0, underlyingIssueDateLength());
        }

        if (hasUnderlyingRepoCollateralSecurityType())
        {
            underlyingInstrument.underlyingRepoCollateralSecurityType(this.underlyingRepoCollateralSecurityType(), 0, underlyingRepoCollateralSecurityTypeLength());
        }

        if (hasUnderlyingRepurchaseTerm())
        {
            underlyingInstrument.underlyingRepurchaseTerm(this.underlyingRepurchaseTerm());
        }

        if (hasUnderlyingRepurchaseRate())
        {
            underlyingInstrument.underlyingRepurchaseRate(this.underlyingRepurchaseRate());
        }

        if (hasUnderlyingFactor())
        {
            underlyingInstrument.underlyingFactor(this.underlyingFactor());
        }

        if (hasUnderlyingCreditRating())
        {
            underlyingInstrument.underlyingCreditRating(this.underlyingCreditRating(), 0, underlyingCreditRatingLength());
        }

        if (hasUnderlyingInstrRegistry())
        {
            underlyingInstrument.underlyingInstrRegistry(this.underlyingInstrRegistry(), 0, underlyingInstrRegistryLength());
        }

        if (hasUnderlyingCountryOfIssue())
        {
            underlyingInstrument.underlyingCountryOfIssue(this.underlyingCountryOfIssue(), 0, underlyingCountryOfIssueLength());
        }

        if (hasUnderlyingStateOrProvinceOfIssue())
        {
            underlyingInstrument.underlyingStateOrProvinceOfIssue(this.underlyingStateOrProvinceOfIssue(), 0, underlyingStateOrProvinceOfIssueLength());
        }

        if (hasUnderlyingLocaleOfIssue())
        {
            underlyingInstrument.underlyingLocaleOfIssue(this.underlyingLocaleOfIssue(), 0, underlyingLocaleOfIssueLength());
        }

        if (hasUnderlyingRedemptionDate())
        {
            underlyingInstrument.underlyingRedemptionDateAsCopy(this.underlyingRedemptionDate(), 0, underlyingRedemptionDateLength());
        }

        if (hasUnderlyingStrikePrice())
        {
            underlyingInstrument.underlyingStrikePrice(this.underlyingStrikePrice());
        }

        if (hasUnderlyingStrikeCurrency())
        {
            underlyingInstrument.underlyingStrikeCurrency(this.underlyingStrikeCurrency(), 0, underlyingStrikeCurrencyLength());
        }

        if (hasUnderlyingOptAttribute())
        {
            underlyingInstrument.underlyingOptAttribute(this.underlyingOptAttribute());
        }

        if (hasUnderlyingContractMultiplier())
        {
            underlyingInstrument.underlyingContractMultiplier(this.underlyingContractMultiplier());
        }

        if (hasUnderlyingContractMultiplierUnit())
        {
            underlyingInstrument.underlyingContractMultiplierUnit(this.underlyingContractMultiplierUnit());
        }

        if (hasUnderlyingFlowScheduleType())
        {
            underlyingInstrument.underlyingFlowScheduleType(this.underlyingFlowScheduleType());
        }

        if (hasUnderlyingUnitOfMeasure())
        {
            underlyingInstrument.underlyingUnitOfMeasure(this.underlyingUnitOfMeasure(), 0, underlyingUnitOfMeasureLength());
        }

        if (hasUnderlyingUnitOfMeasureQty())
        {
            underlyingInstrument.underlyingUnitOfMeasureQty(this.underlyingUnitOfMeasureQty());
        }

        if (hasUnderlyingPriceUnitOfMeasure())
        {
            underlyingInstrument.underlyingPriceUnitOfMeasure(this.underlyingPriceUnitOfMeasure(), 0, underlyingPriceUnitOfMeasureLength());
        }

        if (hasUnderlyingPriceUnitOfMeasureQty())
        {
            underlyingInstrument.underlyingPriceUnitOfMeasureQty(this.underlyingPriceUnitOfMeasureQty());
        }

        if (hasUnderlyingTimeUnit())
        {
            underlyingInstrument.underlyingTimeUnit(this.underlyingTimeUnit(), 0, underlyingTimeUnitLength());
        }

        if (hasUnderlyingExerciseStyle())
        {
            underlyingInstrument.underlyingExerciseStyle(this.underlyingExerciseStyle());
        }

        if (hasUnderlyingCouponRate())
        {
            underlyingInstrument.underlyingCouponRate(this.underlyingCouponRate());
        }

        if (hasUnderlyingSecurityExchange())
        {
            underlyingInstrument.underlyingSecurityExchange(this.underlyingSecurityExchange(), 0, underlyingSecurityExchangeLength());
        }

        if (hasUnderlyingIssuer())
        {
            underlyingInstrument.underlyingIssuer(this.underlyingIssuer(), 0, underlyingIssuerLength());
        }

        if (hasEncodedUnderlyingIssuerLen())
        {
            underlyingInstrument.encodedUnderlyingIssuerLen(this.encodedUnderlyingIssuerLen());
        }

        if (hasEncodedUnderlyingIssuer())
        {
            underlyingInstrument.encodedUnderlyingIssuerAsCopy(this.encodedUnderlyingIssuer(), 0, encodedUnderlyingIssuerLen());
            underlyingInstrument.encodedUnderlyingIssuerLen(this.encodedUnderlyingIssuerLen());
        }

        if (hasUnderlyingSecurityDesc())
        {
            underlyingInstrument.underlyingSecurityDesc(this.underlyingSecurityDesc(), 0, underlyingSecurityDescLength());
        }

        if (hasEncodedUnderlyingSecurityDescLen())
        {
            underlyingInstrument.encodedUnderlyingSecurityDescLen(this.encodedUnderlyingSecurityDescLen());
        }

        if (hasEncodedUnderlyingSecurityDesc())
        {
            underlyingInstrument.encodedUnderlyingSecurityDescAsCopy(this.encodedUnderlyingSecurityDesc(), 0, encodedUnderlyingSecurityDescLen());
            underlyingInstrument.encodedUnderlyingSecurityDescLen(this.encodedUnderlyingSecurityDescLen());
        }

        if (hasUnderlyingCPProgram())
        {
            underlyingInstrument.underlyingCPProgram(this.underlyingCPProgram(), 0, underlyingCPProgramLength());
        }

        if (hasUnderlyingCPRegType())
        {
            underlyingInstrument.underlyingCPRegType(this.underlyingCPRegType(), 0, underlyingCPRegTypeLength());
        }

        if (hasUnderlyingAllocationPercent())
        {
            underlyingInstrument.underlyingAllocationPercent(this.underlyingAllocationPercent());
        }

        if (hasUnderlyingCurrency())
        {
            underlyingInstrument.underlyingCurrency(this.underlyingCurrency(), 0, underlyingCurrencyLength());
        }

        if (hasUnderlyingQty())
        {
            underlyingInstrument.underlyingQty(this.underlyingQty());
        }

        if (hasUnderlyingSettlementType())
        {
            underlyingInstrument.underlyingSettlementType(this.underlyingSettlementType());
        }

        if (hasUnderlyingCashAmount())
        {
            underlyingInstrument.underlyingCashAmount(this.underlyingCashAmount());
        }

        if (hasUnderlyingCashType())
        {
            underlyingInstrument.underlyingCashType(this.underlyingCashType(), 0, underlyingCashTypeLength());
        }

        if (hasUnderlyingPx())
        {
            underlyingInstrument.underlyingPx(this.underlyingPx());
        }

        if (hasUnderlyingDirtyPrice())
        {
            underlyingInstrument.underlyingDirtyPrice(this.underlyingDirtyPrice());
        }

        if (hasUnderlyingEndPrice())
        {
            underlyingInstrument.underlyingEndPrice(this.underlyingEndPrice());
        }

        if (hasUnderlyingStartValue())
        {
            underlyingInstrument.underlyingStartValue(this.underlyingStartValue());
        }

        if (hasUnderlyingCurrentValue())
        {
            underlyingInstrument.underlyingCurrentValue(this.underlyingCurrentValue());
        }

        if (hasUnderlyingEndValue())
        {
            underlyingInstrument.underlyingEndValue(this.underlyingEndValue());
        }


        final UnderlyingStipulationsEncoder underlyingStipulations = underlyingInstrument.underlyingStipulations();        if (hasNoUnderlyingStipsGroupCounter)
        {
            final int size = this.noUnderlyingStipsGroupCounter;
            UnderlyingStipsGroupDecoder underlyingStipsGroup = this.underlyingStipsGroup;
            UnderlyingStipsGroupEncoder underlyingStipsGroupEncoder = underlyingStipulations.underlyingStipsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (underlyingStipsGroup != null)
                {
                    underlyingStipsGroup.toEncoder(underlyingStipsGroupEncoder);
                    underlyingStipsGroup = underlyingStipsGroup.next();
                    underlyingStipsGroupEncoder = underlyingStipsGroupEncoder.next();
                }
            }
        }


        if (hasUnderlyingAdjustedQuantity())
        {
            underlyingInstrument.underlyingAdjustedQuantity(this.underlyingAdjustedQuantity());
        }

        if (hasUnderlyingFXRate())
        {
            underlyingInstrument.underlyingFXRate(this.underlyingFXRate());
        }

        if (hasUnderlyingFXRateCalc())
        {
            underlyingInstrument.underlyingFXRateCalc(this.underlyingFXRateCalc());
        }

        if (hasUnderlyingCapValue())
        {
            underlyingInstrument.underlyingCapValue(this.underlyingCapValue());
        }


        final UndlyInstrumentPartiesEncoder undlyInstrumentParties = underlyingInstrument.undlyInstrumentParties();        if (hasNoUndlyInstrumentPartiesGroupCounter)
        {
            final int size = this.noUndlyInstrumentPartiesGroupCounter;
            UndlyInstrumentPartiesGroupDecoder undlyInstrumentPartiesGroup = this.undlyInstrumentPartiesGroup;
            UndlyInstrumentPartiesGroupEncoder undlyInstrumentPartiesGroupEncoder = undlyInstrumentParties.undlyInstrumentPartiesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (undlyInstrumentPartiesGroup != null)
                {
                    undlyInstrumentPartiesGroup.toEncoder(undlyInstrumentPartiesGroupEncoder);
                    undlyInstrumentPartiesGroup = undlyInstrumentPartiesGroup.next();
                    undlyInstrumentPartiesGroupEncoder = undlyInstrumentPartiesGroupEncoder.next();
                }
            }
        }


        if (hasUnderlyingSettlMethod())
        {
            underlyingInstrument.underlyingSettlMethod(this.underlyingSettlMethod(), 0, underlyingSettlMethodLength());
        }

        if (hasUnderlyingPutOrCall())
        {
            underlyingInstrument.underlyingPutOrCall(this.underlyingPutOrCall());
        }



        final DerivativeInstrumentEncoder derivativeInstrument = encoder.derivativeInstrument();        if (hasDerivativeSymbol())
        {
            derivativeInstrument.derivativeSymbol(this.derivativeSymbol(), 0, derivativeSymbolLength());
        }

        if (hasDerivativeSymbolSfx())
        {
            derivativeInstrument.derivativeSymbolSfx(this.derivativeSymbolSfx(), 0, derivativeSymbolSfxLength());
        }

        if (hasDerivativeSecurityID())
        {
            derivativeInstrument.derivativeSecurityID(this.derivativeSecurityID(), 0, derivativeSecurityIDLength());
        }

        if (hasDerivativeSecurityIDSource())
        {
            derivativeInstrument.derivativeSecurityIDSource(this.derivativeSecurityIDSource(), 0, derivativeSecurityIDSourceLength());
        }


        final DerivativeSecurityAltIDGrpEncoder derivativeSecurityAltIDGrp = derivativeInstrument.derivativeSecurityAltIDGrp();        if (hasNoDerivativeSecurityAltIDGroupCounter)
        {
            final int size = this.noDerivativeSecurityAltIDGroupCounter;
            DerivativeSecurityAltIDGroupDecoder derivativeSecurityAltIDGroup = this.derivativeSecurityAltIDGroup;
            DerivativeSecurityAltIDGroupEncoder derivativeSecurityAltIDGroupEncoder = derivativeSecurityAltIDGrp.derivativeSecurityAltIDGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (derivativeSecurityAltIDGroup != null)
                {
                    derivativeSecurityAltIDGroup.toEncoder(derivativeSecurityAltIDGroupEncoder);
                    derivativeSecurityAltIDGroup = derivativeSecurityAltIDGroup.next();
                    derivativeSecurityAltIDGroupEncoder = derivativeSecurityAltIDGroupEncoder.next();
                }
            }
        }


        if (hasDerivativeProduct())
        {
            derivativeInstrument.derivativeProduct(this.derivativeProduct());
        }

        if (hasDerivativeProductComplex())
        {
            derivativeInstrument.derivativeProductComplex(this.derivativeProductComplex(), 0, derivativeProductComplexLength());
        }

        if (hasDerivFlexProductEligibilityIndicator())
        {
            derivativeInstrument.derivFlexProductEligibilityIndicator(this.derivFlexProductEligibilityIndicator());
        }

        if (hasDerivativeSecurityGroup())
        {
            derivativeInstrument.derivativeSecurityGroup(this.derivativeSecurityGroup(), 0, derivativeSecurityGroupLength());
        }

        if (hasDerivativeCFICode())
        {
            derivativeInstrument.derivativeCFICode(this.derivativeCFICode(), 0, derivativeCFICodeLength());
        }

        if (hasDerivativeSecurityType())
        {
            derivativeInstrument.derivativeSecurityType(this.derivativeSecurityType(), 0, derivativeSecurityTypeLength());
        }

        if (hasDerivativeSecuritySubType())
        {
            derivativeInstrument.derivativeSecuritySubType(this.derivativeSecuritySubType(), 0, derivativeSecuritySubTypeLength());
        }

        if (hasDerivativeMaturityMonthYear())
        {
            derivativeInstrument.derivativeMaturityMonthYearAsCopy(this.derivativeMaturityMonthYear(), 0, derivativeMaturityMonthYearLength());
        }

        if (hasDerivativeMaturityDate())
        {
            derivativeInstrument.derivativeMaturityDateAsCopy(this.derivativeMaturityDate(), 0, derivativeMaturityDateLength());
        }

        if (hasDerivativeMaturityTime())
        {
            derivativeInstrument.derivativeMaturityTimeAsCopy(this.derivativeMaturityTime(), 0, derivativeMaturityTimeLength());
        }

        if (hasDerivativeSettleOnOpenFlag())
        {
            derivativeInstrument.derivativeSettleOnOpenFlag(this.derivativeSettleOnOpenFlag(), 0, derivativeSettleOnOpenFlagLength());
        }

        if (hasDerivativeInstrmtAssignmentMethod())
        {
            derivativeInstrument.derivativeInstrmtAssignmentMethod(this.derivativeInstrmtAssignmentMethod());
        }

        if (hasDerivativeSecurityStatus())
        {
            derivativeInstrument.derivativeSecurityStatus(this.derivativeSecurityStatus(), 0, derivativeSecurityStatusLength());
        }

        if (hasDerivativeIssueDate())
        {
            derivativeInstrument.derivativeIssueDateAsCopy(this.derivativeIssueDate(), 0, derivativeIssueDateLength());
        }

        if (hasDerivativeInstrRegistry())
        {
            derivativeInstrument.derivativeInstrRegistry(this.derivativeInstrRegistry(), 0, derivativeInstrRegistryLength());
        }

        if (hasDerivativeCountryOfIssue())
        {
            derivativeInstrument.derivativeCountryOfIssue(this.derivativeCountryOfIssue(), 0, derivativeCountryOfIssueLength());
        }

        if (hasDerivativeStateOrProvinceOfIssue())
        {
            derivativeInstrument.derivativeStateOrProvinceOfIssue(this.derivativeStateOrProvinceOfIssue(), 0, derivativeStateOrProvinceOfIssueLength());
        }

        if (hasDerivativeLocaleOfIssue())
        {
            derivativeInstrument.derivativeLocaleOfIssue(this.derivativeLocaleOfIssue(), 0, derivativeLocaleOfIssueLength());
        }

        if (hasDerivativeStrikePrice())
        {
            derivativeInstrument.derivativeStrikePrice(this.derivativeStrikePrice());
        }

        if (hasDerivativeStrikeCurrency())
        {
            derivativeInstrument.derivativeStrikeCurrency(this.derivativeStrikeCurrency(), 0, derivativeStrikeCurrencyLength());
        }

        if (hasDerivativeStrikeMultiplier())
        {
            derivativeInstrument.derivativeStrikeMultiplier(this.derivativeStrikeMultiplier());
        }

        if (hasDerivativeStrikeValue())
        {
            derivativeInstrument.derivativeStrikeValue(this.derivativeStrikeValue());
        }

        if (hasDerivativeOptAttribute())
        {
            derivativeInstrument.derivativeOptAttribute(this.derivativeOptAttribute());
        }

        if (hasDerivativeContractMultiplier())
        {
            derivativeInstrument.derivativeContractMultiplier(this.derivativeContractMultiplier());
        }

        if (hasDerivativeContractMultiplierUnit())
        {
            derivativeInstrument.derivativeContractMultiplierUnit(this.derivativeContractMultiplierUnit());
        }

        if (hasDerivativeFlowScheduleType())
        {
            derivativeInstrument.derivativeFlowScheduleType(this.derivativeFlowScheduleType());
        }

        if (hasDerivativeMinPriceIncrement())
        {
            derivativeInstrument.derivativeMinPriceIncrement(this.derivativeMinPriceIncrement());
        }

        if (hasDerivativeMinPriceIncrementAmount())
        {
            derivativeInstrument.derivativeMinPriceIncrementAmount(this.derivativeMinPriceIncrementAmount());
        }

        if (hasDerivativeUnitOfMeasure())
        {
            derivativeInstrument.derivativeUnitOfMeasure(this.derivativeUnitOfMeasure(), 0, derivativeUnitOfMeasureLength());
        }

        if (hasDerivativeUnitOfMeasureQty())
        {
            derivativeInstrument.derivativeUnitOfMeasureQty(this.derivativeUnitOfMeasureQty());
        }

        if (hasDerivativePriceUnitOfMeasure())
        {
            derivativeInstrument.derivativePriceUnitOfMeasure(this.derivativePriceUnitOfMeasure(), 0, derivativePriceUnitOfMeasureLength());
        }

        if (hasDerivativePriceUnitOfMeasureQty())
        {
            derivativeInstrument.derivativePriceUnitOfMeasureQty(this.derivativePriceUnitOfMeasureQty());
        }

        if (hasDerivativeSettlMethod())
        {
            derivativeInstrument.derivativeSettlMethod(this.derivativeSettlMethod());
        }

        if (hasDerivativePriceQuoteMethod())
        {
            derivativeInstrument.derivativePriceQuoteMethod(this.derivativePriceQuoteMethod(), 0, derivativePriceQuoteMethodLength());
        }

        if (hasDerivativeValuationMethod())
        {
            derivativeInstrument.derivativeValuationMethod(this.derivativeValuationMethod(), 0, derivativeValuationMethodLength());
        }

        if (hasDerivativeListMethod())
        {
            derivativeInstrument.derivativeListMethod(this.derivativeListMethod());
        }

        if (hasDerivativeCapPrice())
        {
            derivativeInstrument.derivativeCapPrice(this.derivativeCapPrice());
        }

        if (hasDerivativeFloorPrice())
        {
            derivativeInstrument.derivativeFloorPrice(this.derivativeFloorPrice());
        }

        if (hasDerivativePutOrCall())
        {
            derivativeInstrument.derivativePutOrCall(this.derivativePutOrCall());
        }

        if (hasDerivativeExerciseStyle())
        {
            derivativeInstrument.derivativeExerciseStyle(this.derivativeExerciseStyle());
        }

        if (hasDerivativeOptPayAmount())
        {
            derivativeInstrument.derivativeOptPayAmount(this.derivativeOptPayAmount());
        }

        if (hasDerivativeTimeUnit())
        {
            derivativeInstrument.derivativeTimeUnit(this.derivativeTimeUnit(), 0, derivativeTimeUnitLength());
        }

        if (hasDerivativeSecurityExchange())
        {
            derivativeInstrument.derivativeSecurityExchange(this.derivativeSecurityExchange(), 0, derivativeSecurityExchangeLength());
        }

        if (hasDerivativePositionLimit())
        {
            derivativeInstrument.derivativePositionLimit(this.derivativePositionLimit());
        }

        if (hasDerivativeNTPositionLimit())
        {
            derivativeInstrument.derivativeNTPositionLimit(this.derivativeNTPositionLimit());
        }

        if (hasDerivativeIssuer())
        {
            derivativeInstrument.derivativeIssuer(this.derivativeIssuer(), 0, derivativeIssuerLength());
        }

        if (hasDerivativeEncodedIssuerLen())
        {
            derivativeInstrument.derivativeEncodedIssuerLen(this.derivativeEncodedIssuerLen());
        }

        if (hasDerivativeEncodedIssuer())
        {
            derivativeInstrument.derivativeEncodedIssuerAsCopy(this.derivativeEncodedIssuer(), 0, derivativeEncodedIssuerLen());
            derivativeInstrument.derivativeEncodedIssuerLen(this.derivativeEncodedIssuerLen());
        }

        if (hasDerivativeSecurityDesc())
        {
            derivativeInstrument.derivativeSecurityDesc(this.derivativeSecurityDesc(), 0, derivativeSecurityDescLength());
        }

        if (hasDerivativeEncodedSecurityDescLen())
        {
            derivativeInstrument.derivativeEncodedSecurityDescLen(this.derivativeEncodedSecurityDescLen());
        }

        if (hasDerivativeEncodedSecurityDesc())
        {
            derivativeInstrument.derivativeEncodedSecurityDescAsCopy(this.derivativeEncodedSecurityDesc(), 0, derivativeEncodedSecurityDescLen());
            derivativeInstrument.derivativeEncodedSecurityDescLen(this.derivativeEncodedSecurityDescLen());
        }


        final DerivativeSecurityXMLEncoder derivativeSecurityXML = derivativeInstrument.derivativeSecurityXML();        if (hasDerivativeSecurityXMLLen())
        {
            derivativeSecurityXML.derivativeSecurityXMLLen(this.derivativeSecurityXMLLen());
        }

        if (hasDerivativeSecurityXML())
        {
            derivativeSecurityXML.derivativeSecurityXMLAsCopy(this.derivativeSecurityXML(), 0, derivativeSecurityXMLLen());
            derivativeSecurityXML.derivativeSecurityXMLLen(this.derivativeSecurityXMLLen());
        }

        if (hasDerivativeSecurityXMLSchema())
        {
            derivativeSecurityXML.derivativeSecurityXMLSchema(this.derivativeSecurityXMLSchema(), 0, derivativeSecurityXMLSchemaLength());
        }


        if (hasDerivativeContractSettlMonth())
        {
            derivativeInstrument.derivativeContractSettlMonthAsCopy(this.derivativeContractSettlMonth(), 0, derivativeContractSettlMonthLength());
        }


        final DerivativeEventsGrpEncoder derivativeEventsGrp = derivativeInstrument.derivativeEventsGrp();        if (hasNoDerivativeEventsGroupCounter)
        {
            final int size = this.noDerivativeEventsGroupCounter;
            DerivativeEventsGroupDecoder derivativeEventsGroup = this.derivativeEventsGroup;
            DerivativeEventsGroupEncoder derivativeEventsGroupEncoder = derivativeEventsGrp.derivativeEventsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (derivativeEventsGroup != null)
                {
                    derivativeEventsGroup.toEncoder(derivativeEventsGroupEncoder);
                    derivativeEventsGroup = derivativeEventsGroup.next();
                    derivativeEventsGroupEncoder = derivativeEventsGroupEncoder.next();
                }
            }
        }



        final DerivativeInstrumentPartiesEncoder derivativeInstrumentParties = derivativeInstrument.derivativeInstrumentParties();        if (hasNoDerivativeInstrumentPartiesGroupCounter)
        {
            final int size = this.noDerivativeInstrumentPartiesGroupCounter;
            DerivativeInstrumentPartiesGroupDecoder derivativeInstrumentPartiesGroup = this.derivativeInstrumentPartiesGroup;
            DerivativeInstrumentPartiesGroupEncoder derivativeInstrumentPartiesGroupEncoder = derivativeInstrumentParties.derivativeInstrumentPartiesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (derivativeInstrumentPartiesGroup != null)
                {
                    derivativeInstrumentPartiesGroup.toEncoder(derivativeInstrumentPartiesGroupEncoder);
                    derivativeInstrumentPartiesGroup = derivativeInstrumentPartiesGroup.next();
                    derivativeInstrumentPartiesGroupEncoder = derivativeInstrumentPartiesGroupEncoder.next();
                }
            }
        }



        if (hasSecuritySubType())
        {
            encoder.securitySubType(this.securitySubType(), 0, securitySubTypeLength());
        }

        if (hasCurrency())
        {
            encoder.currency(this.currency(), 0, currencyLength());
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

        if (hasTradingSessionID())
        {
            encoder.tradingSessionID(this.tradingSessionID(), 0, tradingSessionIDLength());
        }

        if (hasTradingSessionSubID())
        {
            encoder.tradingSessionSubID(this.tradingSessionSubID(), 0, tradingSessionSubIDLength());
        }

        if (hasSubscriptionRequestType())
        {
            encoder.subscriptionRequestType(this.subscriptionRequestType());
        }
        return encoder;
    }

}
