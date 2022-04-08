/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44.decoder;

import org.agrona.AsciiNumberFormatException;
import org.agrona.MutableDirectBuffer;
import org.agrona.AsciiSequenceView;
import static uk.co.real_logic.artio.dictionary.generation.CodecUtil.*;
import static uk.co.real_logic.artio.dictionary.SessionConstants.*;
import uk.co.real_logic.artio.builder.Decoder;
import com.swiftalgo.ms.codecs.fix44.decoder.HeaderDecoder;
import com.swiftalgo.ms.codecs.fix44.decoder.TrailerDecoder;
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
import com.swiftalgo.ms.codecs.fix44.*;
import com.swiftalgo.ms.codecs.fix44.builder.TradeCaptureReportRequestEncoder;
import com.swiftalgo.ms.codecs.fix44.builder.PartiesEncoder;
import static com.swiftalgo.ms.codecs.fix44.builder.PartiesEncoder.PartyIDsGroupEncoder;
import static com.swiftalgo.ms.codecs.fix44.builder.PartiesEncoder.PartyIDsGroupEncoder.PartySubIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix44.builder.InstrumentEncoder;
import static com.swiftalgo.ms.codecs.fix44.builder.InstrumentEncoder.SecurityAltIDGroupEncoder;
import static com.swiftalgo.ms.codecs.fix44.builder.InstrumentEncoder.EventsGroupEncoder;
import com.swiftalgo.ms.codecs.fix44.builder.InstrumentExtensionEncoder;
import static com.swiftalgo.ms.codecs.fix44.builder.InstrumentExtensionEncoder.InstrAttribGroupEncoder;
import com.swiftalgo.ms.codecs.fix44.builder.FinancingDetailsEncoder;
import static com.swiftalgo.ms.codecs.fix44.builder.TradeCaptureReportRequestEncoder.UnderlyingsGroupEncoder;
import com.swiftalgo.ms.codecs.fix44.builder.UnderlyingInstrumentEncoder;
import static com.swiftalgo.ms.codecs.fix44.builder.UnderlyingInstrumentEncoder.UnderlyingSecurityAltIDGroupEncoder;
import com.swiftalgo.ms.codecs.fix44.builder.UnderlyingStipulationsEncoder;
import static com.swiftalgo.ms.codecs.fix44.builder.UnderlyingStipulationsEncoder.UnderlyingStipsGroupEncoder;
import static com.swiftalgo.ms.codecs.fix44.builder.TradeCaptureReportRequestEncoder.LegsGroupEncoder;
import com.swiftalgo.ms.codecs.fix44.builder.InstrumentLegEncoder;
import static com.swiftalgo.ms.codecs.fix44.builder.InstrumentLegEncoder.LegSecurityAltIDGroupEncoder;
import static com.swiftalgo.ms.codecs.fix44.builder.TradeCaptureReportRequestEncoder.DatesGroupEncoder;


public class TradeCaptureReportRequestDecoder extends CommonDecoderImpl implements PartiesDecoder, InstrumentDecoder, InstrumentExtensionDecoder, FinancingDetailsDecoder, MessageDecoder
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(4);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            REQUIRED_FIELDS.add(Constants.TRADE_REQUEST_ID);
            REQUIRED_FIELDS.add(Constants.TRADE_REQUEST_TYPE);
        }
    }

    public final IntHashSet GROUP_FIELDS = new IntHashSet(162);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            GROUP_FIELDS.add(Constants.TRADE_REQUEST_ID);
            GROUP_FIELDS.add(Constants.TRADE_REQUEST_TYPE);
            GROUP_FIELDS.add(Constants.SUBSCRIPTION_REQUEST_TYPE);
            GROUP_FIELDS.add(Constants.TRADE_REPORT_ID);
            GROUP_FIELDS.add(Constants.SECONDARY_TRADE_REPORT_ID);
            GROUP_FIELDS.add(Constants.EXEC_ID);
            GROUP_FIELDS.add(Constants.EXEC_TYPE);
            GROUP_FIELDS.add(Constants.ORDER_ID);
            GROUP_FIELDS.add(Constants.CL_ORD_ID);
            GROUP_FIELDS.add(Constants.MATCH_STATUS);
            GROUP_FIELDS.add(Constants.TRD_TYPE);
            GROUP_FIELDS.add(Constants.TRD_SUB_TYPE);
            GROUP_FIELDS.add(Constants.TRANSFER_REASON);
            GROUP_FIELDS.add(Constants.SECONDARY_TRD_TYPE);
            GROUP_FIELDS.add(Constants.TRADE_LINK_ID);
            GROUP_FIELDS.add(Constants.TRD_MATCH_ID);
            GROUP_FIELDS.add(Constants.SYMBOL);
            GROUP_FIELDS.add(Constants.SYMBOL_SFX);
            GROUP_FIELDS.add(Constants.SECURITY_ID);
            GROUP_FIELDS.add(Constants.SECURITY_ID_SOURCE);
            GROUP_FIELDS.add(Constants.PRODUCT);
            GROUP_FIELDS.add(Constants.C_F_I_CODE);
            GROUP_FIELDS.add(Constants.SECURITY_TYPE);
            GROUP_FIELDS.add(Constants.SECURITY_SUB_TYPE);
            GROUP_FIELDS.add(Constants.MATURITY_MONTH_YEAR);
            GROUP_FIELDS.add(Constants.MATURITY_DATE);
            GROUP_FIELDS.add(Constants.PUT_OR_CALL);
            GROUP_FIELDS.add(Constants.COUPON_PAYMENT_DATE);
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
            GROUP_FIELDS.add(Constants.OPT_ATTRIBUTE);
            GROUP_FIELDS.add(Constants.CONTRACT_MULTIPLIER);
            GROUP_FIELDS.add(Constants.COUPON_RATE);
            GROUP_FIELDS.add(Constants.SECURITY_EXCHANGE);
            GROUP_FIELDS.add(Constants.ISSUER);
            GROUP_FIELDS.add(Constants.ENCODED_ISSUER_LEN);
            GROUP_FIELDS.add(Constants.ENCODED_ISSUER);
            GROUP_FIELDS.add(Constants.SECURITY_DESC);
            GROUP_FIELDS.add(Constants.ENCODED_SECURITY_DESC_LEN);
            GROUP_FIELDS.add(Constants.ENCODED_SECURITY_DESC);
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
            GROUP_FIELDS.add(Constants.CLEARING_BUSINESS_DATE);
            GROUP_FIELDS.add(Constants.TRADING_SESSION_ID);
            GROUP_FIELDS.add(Constants.TRADING_SESSION_SUB_ID);
            GROUP_FIELDS.add(Constants.TIME_BRACKET);
            GROUP_FIELDS.add(Constants.SIDE);
            GROUP_FIELDS.add(Constants.MULTI_LEG_REPORTING_TYPE);
            GROUP_FIELDS.add(Constants.TRADE_INPUT_SOURCE);
            GROUP_FIELDS.add(Constants.TRADE_INPUT_DEVICE);
            GROUP_FIELDS.add(Constants.RESPONSE_TRANSPORT_TYPE);
            GROUP_FIELDS.add(Constants.RESPONSE_DESTINATION);
            GROUP_FIELDS.add(Constants.TEXT);
            GROUP_FIELDS.add(Constants.ENCODED_TEXT_LEN);
            GROUP_FIELDS.add(Constants.ENCODED_TEXT);
        }
    }

    private final IntHashSet alreadyVisitedFields = new IntHashSet(162);

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
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !TradeRequestType.isValid(tradeRequestType()))
        {
            invalidTagId = 569;
            rejectReason = 5;
            return false;
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

        if (hasExecType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !ExecType.isValid(execType()))
        {
            invalidTagId = 150;
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

        if (hasTrdType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !TrdType.isValid(trdType()))
        {
            invalidTagId = 828;
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

        if (hasPutOrCall)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !PutOrCall.isValid(putOrCall()))
        {
            invalidTagId = 201;
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

        if (hasSide)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !Side.isValid(side()))
        {
            invalidTagId = 54;
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

        if (hasResponseTransportType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !ResponseTransportType.isValid(responseTransportType()))
        {
            invalidTagId = 725;
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

        if (hasNoDatesGroupCounter)
        {
            {
                int count = 0;
                final DatesGroupIterator iterator = datesGroupIterator.iterator();
                for (final DatesGroupDecoder group : iterator)
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
                    invalidTagId = 580;
                    rejectReason = 16;
                    return false;
                }
            }
        }
        return true;
    }

    public static final long MESSAGE_TYPE = 17473L;

    public static final String MESSAGE_TYPE_AS_STRING = "AD";

    public static final char[] MESSAGE_TYPE_CHARS = MESSAGE_TYPE_AS_STRING.toCharArray();

    public static final byte[] MESSAGE_TYPE_BYTES = MESSAGE_TYPE_AS_STRING.getBytes(US_ASCII);

    public final IntHashSet messageFields = new IntHashSet(456);

    {
        messageFields.add(Constants.BEGIN_STRING);
        messageFields.add(Constants.BODY_LENGTH);
        messageFields.add(Constants.MSG_TYPE);
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
        messageFields.add(Constants.TRADE_REQUEST_ID);
        messageFields.add(Constants.TRADE_REQUEST_TYPE);
        messageFields.add(Constants.SUBSCRIPTION_REQUEST_TYPE);
        messageFields.add(Constants.TRADE_REPORT_ID);
        messageFields.add(Constants.SECONDARY_TRADE_REPORT_ID);
        messageFields.add(Constants.EXEC_ID);
        messageFields.add(Constants.EXEC_TYPE);
        messageFields.add(Constants.ORDER_ID);
        messageFields.add(Constants.CL_ORD_ID);
        messageFields.add(Constants.MATCH_STATUS);
        messageFields.add(Constants.TRD_TYPE);
        messageFields.add(Constants.TRD_SUB_TYPE);
        messageFields.add(Constants.TRANSFER_REASON);
        messageFields.add(Constants.SECONDARY_TRD_TYPE);
        messageFields.add(Constants.TRADE_LINK_ID);
        messageFields.add(Constants.TRD_MATCH_ID);
        messageFields.add(Constants.NO_PARTY_IDS_GROUP_COUNTER);
        messageFields.add(Constants.PARTY_ID);
        messageFields.add(Constants.PARTY_ID_SOURCE);
        messageFields.add(Constants.PARTY_ROLE);
        messageFields.add(Constants.NO_PARTY_SUB_IDS_GROUP_COUNTER);
        messageFields.add(Constants.PARTY_SUB_ID);
        messageFields.add(Constants.PARTY_SUB_ID_TYPE);
        messageFields.add(Constants.SYMBOL);
        messageFields.add(Constants.SYMBOL_SFX);
        messageFields.add(Constants.SECURITY_ID);
        messageFields.add(Constants.SECURITY_ID_SOURCE);
        messageFields.add(Constants.NO_SECURITY_ALT_ID_GROUP_COUNTER);
        messageFields.add(Constants.SECURITY_ALT_ID);
        messageFields.add(Constants.SECURITY_ALT_ID_SOURCE);
        messageFields.add(Constants.PRODUCT);
        messageFields.add(Constants.C_F_I_CODE);
        messageFields.add(Constants.SECURITY_TYPE);
        messageFields.add(Constants.SECURITY_SUB_TYPE);
        messageFields.add(Constants.MATURITY_MONTH_YEAR);
        messageFields.add(Constants.MATURITY_DATE);
        messageFields.add(Constants.PUT_OR_CALL);
        messageFields.add(Constants.COUPON_PAYMENT_DATE);
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
        messageFields.add(Constants.OPT_ATTRIBUTE);
        messageFields.add(Constants.CONTRACT_MULTIPLIER);
        messageFields.add(Constants.COUPON_RATE);
        messageFields.add(Constants.SECURITY_EXCHANGE);
        messageFields.add(Constants.ISSUER);
        messageFields.add(Constants.ENCODED_ISSUER_LEN);
        messageFields.add(Constants.ENCODED_ISSUER);
        messageFields.add(Constants.SECURITY_DESC);
        messageFields.add(Constants.ENCODED_SECURITY_DESC_LEN);
        messageFields.add(Constants.ENCODED_SECURITY_DESC);
        messageFields.add(Constants.POOL);
        messageFields.add(Constants.CONTRACT_SETTL_MONTH);
        messageFields.add(Constants.C_P_PROGRAM);
        messageFields.add(Constants.C_P_REG_TYPE);
        messageFields.add(Constants.NO_EVENTS_GROUP_COUNTER);
        messageFields.add(Constants.EVENT_TYPE);
        messageFields.add(Constants.EVENT_DATE);
        messageFields.add(Constants.EVENT_PX);
        messageFields.add(Constants.EVENT_TEXT);
        messageFields.add(Constants.DATED_DATE);
        messageFields.add(Constants.INTEREST_ACCRUAL_DATE);
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
        messageFields.add(Constants.UNDERLYING_PUT_OR_CALL);
        messageFields.add(Constants.UNDERLYING_COUPON_PAYMENT_DATE);
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
        messageFields.add(Constants.UNDERLYING_CURRENCY);
        messageFields.add(Constants.UNDERLYING_QTY);
        messageFields.add(Constants.UNDERLYING_PX);
        messageFields.add(Constants.UNDERLYING_DIRTY_PRICE);
        messageFields.add(Constants.UNDERLYING_END_PRICE);
        messageFields.add(Constants.UNDERLYING_START_VALUE);
        messageFields.add(Constants.UNDERLYING_CURRENT_VALUE);
        messageFields.add(Constants.UNDERLYING_END_VALUE);
        messageFields.add(Constants.NO_UNDERLYING_STIPS_GROUP_COUNTER);
        messageFields.add(Constants.UNDERLYING_STIP_TYPE);
        messageFields.add(Constants.UNDERLYING_STIP_VALUE);
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
        messageFields.add(Constants.NO_DATES_GROUP_COUNTER);
        messageFields.add(Constants.TRADE_DATE);
        messageFields.add(Constants.TRANSACT_TIME);
        messageFields.add(Constants.CLEARING_BUSINESS_DATE);
        messageFields.add(Constants.TRADING_SESSION_ID);
        messageFields.add(Constants.TRADING_SESSION_SUB_ID);
        messageFields.add(Constants.TIME_BRACKET);
        messageFields.add(Constants.SIDE);
        messageFields.add(Constants.MULTI_LEG_REPORTING_TYPE);
        messageFields.add(Constants.TRADE_INPUT_SOURCE);
        messageFields.add(Constants.TRADE_INPUT_DEVICE);
        messageFields.add(Constants.RESPONSE_TRANSPORT_TYPE);
        messageFields.add(Constants.RESPONSE_DESTINATION);
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

    private char[] tradeRequestID = new char[1];

    public char[] tradeRequestID()
    {
        return tradeRequestID;
    }


    private int tradeRequestIDOffset;

    private int tradeRequestIDLength;

    public int tradeRequestIDLength()
    {
        return tradeRequestIDLength;
    }

    public String tradeRequestIDAsString()
    {
        return new String(tradeRequestID, 0, tradeRequestIDLength);
    }

    public void tradeRequestID(final AsciiSequenceView view)
    {
        view.wrap(buffer, tradeRequestIDOffset, tradeRequestIDLength);
    }


    private final CharArrayWrapper tradeRequestIDWrapper = new CharArrayWrapper();
    private int tradeRequestType = MISSING_INT;

    public int tradeRequestType()
    {
        return tradeRequestType;
    }



    private final CharArrayWrapper tradeRequestTypeWrapper = new CharArrayWrapper();
    public TradeRequestType tradeRequestTypeAsEnum()
    {
        return TradeRequestType.decode(tradeRequestType);
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

    private char[] orderID = new char[1];

    private boolean hasOrderID;

    public char[] orderID()
    {
        if (!hasOrderID)
        {
            throw new IllegalArgumentException("No value for optional field: OrderID");
        }

        return orderID;
    }

    public boolean hasOrderID()
    {
        return hasOrderID;
    }


    private int orderIDOffset;

    private int orderIDLength;

    public int orderIDLength()
    {
        if (!hasOrderID)
        {
            throw new IllegalArgumentException("No value for optional field: OrderID");
        }

        return orderIDLength;
    }

    public String orderIDAsString()
    {
        return hasOrderID ? new String(orderID, 0, orderIDLength) : null;
    }

    public void orderID(final AsciiSequenceView view)
    {
        if (!hasOrderID)
        {
            throw new IllegalArgumentException("No value for optional field: OrderID");
        }

        view.wrap(buffer, orderIDOffset, orderIDLength);
    }


    private final CharArrayWrapper orderIDWrapper = new CharArrayWrapper();
    private char[] clOrdID = new char[1];

    private boolean hasClOrdID;

    public char[] clOrdID()
    {
        if (!hasClOrdID)
        {
            throw new IllegalArgumentException("No value for optional field: ClOrdID");
        }

        return clOrdID;
    }

    public boolean hasClOrdID()
    {
        return hasClOrdID;
    }


    private int clOrdIDOffset;

    private int clOrdIDLength;

    public int clOrdIDLength()
    {
        if (!hasClOrdID)
        {
            throw new IllegalArgumentException("No value for optional field: ClOrdID");
        }

        return clOrdIDLength;
    }

    public String clOrdIDAsString()
    {
        return hasClOrdID ? new String(clOrdID, 0, clOrdIDLength) : null;
    }

    public void clOrdID(final AsciiSequenceView view)
    {
        if (!hasClOrdID)
        {
            throw new IllegalArgumentException("No value for optional field: ClOrdID");
        }

        view.wrap(buffer, clOrdIDOffset, clOrdIDLength);
    }


    private final CharArrayWrapper clOrdIDWrapper = new CharArrayWrapper();
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



    private char[] symbol = new char[1];

    public char[] symbol()
    {
        return symbol;
    }


    private int symbolOffset;

    private int symbolLength;

    public int symbolLength()
    {
        return symbolLength;
    }

    public String symbolAsString()
    {
        return new String(symbol, 0, symbolLength);
    }

    public void symbol(final AsciiSequenceView view)
    {
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






public class UnderlyingsGroupDecoder extends CommonDecoderImpl implements UnderlyingInstrumentDecoder
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(0);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
        }
    }

    public final IntHashSet GROUP_FIELDS = new IntHashSet(90);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
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
            GROUP_FIELDS.add(Constants.UNDERLYING_PUT_OR_CALL);
            GROUP_FIELDS.add(Constants.UNDERLYING_COUPON_PAYMENT_DATE);
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
            GROUP_FIELDS.add(Constants.UNDERLYING_CURRENCY);
            GROUP_FIELDS.add(Constants.UNDERLYING_QTY);
            GROUP_FIELDS.add(Constants.UNDERLYING_PX);
            GROUP_FIELDS.add(Constants.UNDERLYING_DIRTY_PRICE);
            GROUP_FIELDS.add(Constants.UNDERLYING_END_PRICE);
            GROUP_FIELDS.add(Constants.UNDERLYING_START_VALUE);
            GROUP_FIELDS.add(Constants.UNDERLYING_CURRENT_VALUE);
            GROUP_FIELDS.add(Constants.UNDERLYING_END_VALUE);
        }
    }

    public final IntHashSet ALL_GROUP_FIELDS = new IntHashSet(0);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
        }
    }

    private final IntHashSet missingRequiredFields = new IntHashSet(0);

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
        if (hasUnderlyingPutOrCall)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !UnderlyingPutOrCall.isValid(underlyingPutOrCall()))
        {
            invalidTagId = 315;
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
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public UnderlyingsGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private UnderlyingsGroupDecoder next = null;

    public UnderlyingsGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(2);


    private char[] underlyingSymbol = new char[1];

    public char[] underlyingSymbol()
    {
        return underlyingSymbol;
    }


    private int underlyingSymbolOffset;

    private int underlyingSymbolLength;

    public int underlyingSymbolLength()
    {
        return underlyingSymbolLength;
    }

    public String underlyingSymbolAsString()
    {
        return new String(underlyingSymbol, 0, underlyingSymbolLength);
    }

    public void underlyingSymbol(final AsciiSequenceView view)
    {
        view.wrap(buffer, underlyingSymbolOffset, underlyingSymbolLength);
    }


    private final CharArrayWrapper underlyingSymbolWrapper = new CharArrayWrapper();
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


    private final CharArrayWrapper underlyingSymbolSfxWrapper = new CharArrayWrapper();
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


    private final CharArrayWrapper underlyingSecurityIDWrapper = new CharArrayWrapper();
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


    private final CharArrayWrapper underlyingSecurityIDSourceWrapper = new CharArrayWrapper();

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


    private final CharArrayWrapper underlyingCFICodeWrapper = new CharArrayWrapper();
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


    private final CharArrayWrapper underlyingSecurityTypeWrapper = new CharArrayWrapper();
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


    private final CharArrayWrapper underlyingSecuritySubTypeWrapper = new CharArrayWrapper();
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



    private final CharArrayWrapper underlyingPutOrCallWrapper = new CharArrayWrapper();
    public UnderlyingPutOrCall underlyingPutOrCallAsEnum()
    {
        if (!hasUnderlyingPutOrCall)
 return UnderlyingPutOrCall.NULL_VAL;
        return UnderlyingPutOrCall.decode(underlyingPutOrCall);
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


    private final CharArrayWrapper underlyingRepoCollateralSecurityTypeWrapper = new CharArrayWrapper();
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


    private final CharArrayWrapper underlyingCreditRatingWrapper = new CharArrayWrapper();
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


    private final CharArrayWrapper underlyingInstrRegistryWrapper = new CharArrayWrapper();
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


    private final CharArrayWrapper underlyingStateOrProvinceOfIssueWrapper = new CharArrayWrapper();
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


    private final CharArrayWrapper underlyingLocaleOfIssueWrapper = new CharArrayWrapper();
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


    private final CharArrayWrapper underlyingIssuerWrapper = new CharArrayWrapper();
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


    private final CharArrayWrapper underlyingSecurityDescWrapper = new CharArrayWrapper();
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


    private final CharArrayWrapper underlyingCPProgramWrapper = new CharArrayWrapper();
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


    private final CharArrayWrapper underlyingCPRegTypeWrapper = new CharArrayWrapper();
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



    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode UnderlyingsGroup
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
                    next = new UnderlyingsGroupDecoder(trailer, messageFields);
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
            case Constants.UNDERLYING_SYMBOL:
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

            case Constants.NO_UNDERLYING_SECURITY_ALT_ID_GROUP_COUNTER:
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

            case Constants.UNDERLYING_PUT_OR_CALL:
                hasUnderlyingPutOrCall = true;
                underlyingPutOrCall = getInt(buffer, valueOffset, endOfField, 315, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.UNDERLYING_COUPON_PAYMENT_DATE:
                hasUnderlyingCouponPaymentDate = true;
                underlyingCouponPaymentDate = buffer.getBytes(underlyingCouponPaymentDate, valueOffset, valueLength);
                underlyingCouponPaymentDateOffset = valueOffset;
                underlyingCouponPaymentDateLength = valueLength;
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

            case Constants.NO_UNDERLYING_STIPS_GROUP_COUNTER:
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
        this.resetUnderlyingPutOrCall();
        this.resetUnderlyingCouponPaymentDate();
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
        this.resetUnderlyingCurrency();
        this.resetUnderlyingQty();
        this.resetUnderlyingPx();
        this.resetUnderlyingDirtyPrice();
        this.resetUnderlyingEndPrice();
        this.resetUnderlyingStartValue();
        this.resetUnderlyingCurrentValue();
        this.resetUnderlyingEndValue();
        this.resetUnderlyingStipsGroup();
        this.resetUnderlyingSecurityAltIDGroup();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetUnderlyingSymbol()
    {
        underlyingSymbolOffset = 0;
        underlyingSymbolLength = 0;
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

    public void resetUnderlyingPutOrCall()
    {
        hasUnderlyingPutOrCall = false;
    }

    public void resetUnderlyingCouponPaymentDate()
    {
        hasUnderlyingCouponPaymentDate = false;
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

    public void resetUnderlyingCurrency()
    {
        hasUnderlyingCurrency = false;
    }

    public void resetUnderlyingQty()
    {
        hasUnderlyingQty = false;
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
        builder.append("\"MessageName\": \"UnderlyingsGroup\",\n");
        indent(builder, level);
        builder.append("\"UnderlyingSymbol\": \"");
        builder.append(this.underlyingSymbol(), 0, underlyingSymbolLength());
        builder.append("\",\n");

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
                underlyingSecurityAltIDGroup.appendTo(builder, level + 1);
                if (underlyingSecurityAltIDGroup.next() != null)
                {
                    builder.append(',');
                }
                builder.append('\n');
                underlyingSecurityAltIDGroup = underlyingSecurityAltIDGroup.next();            }
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

        if (hasUnderlyingPutOrCall())
        {
            indent(builder, level);
            builder.append("\"UnderlyingPutOrCall\": \"");
            builder.append(underlyingPutOrCall);
            builder.append("\",\n");
        }

        if (hasUnderlyingCouponPaymentDate())
        {
            indent(builder, level);
            builder.append("\"UnderlyingCouponPaymentDate\": \"");
            appendData(builder, underlyingCouponPaymentDate, underlyingCouponPaymentDateLength);
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
                underlyingStipsGroup.appendTo(builder, level + 1);
                if (underlyingStipsGroup.next() != null)
                {
                    builder.append(',');
                }
                builder.append('\n');
                underlyingStipsGroup = underlyingStipsGroup.next();            }
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
    public TradeCaptureReportRequestEncoder.UnderlyingsGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((TradeCaptureReportRequestEncoder.UnderlyingsGroupEncoder)encoder);
    }

    public TradeCaptureReportRequestEncoder.UnderlyingsGroupEncoder toEncoder(final TradeCaptureReportRequestEncoder.UnderlyingsGroupEncoder encoder)
    {
        encoder.reset();

        final UnderlyingInstrumentEncoder underlyingInstrument = encoder.underlyingInstrument();        underlyingInstrument.underlyingSymbol(this.underlyingSymbol(), 0, underlyingSymbolLength());
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

        if (hasNoUnderlyingSecurityAltIDGroupCounter)
        {
            final int size = this.noUnderlyingSecurityAltIDGroupCounter;
            UnderlyingSecurityAltIDGroupDecoder underlyingSecurityAltIDGroup = this.underlyingSecurityAltIDGroup;
            UnderlyingSecurityAltIDGroupEncoder underlyingSecurityAltIDGroupEncoder = underlyingInstrument.underlyingSecurityAltIDGroup(size);
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

        if (hasUnderlyingPutOrCall())
        {
            underlyingInstrument.underlyingPutOrCall(this.underlyingPutOrCall());
        }

        if (hasUnderlyingCouponPaymentDate())
        {
            underlyingInstrument.underlyingCouponPaymentDateAsCopy(this.underlyingCouponPaymentDate(), 0, underlyingCouponPaymentDateLength());
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

        if (hasUnderlyingCurrency())
        {
            underlyingInstrument.underlyingCurrency(this.underlyingCurrency(), 0, underlyingCurrencyLength());
        }

        if (hasUnderlyingQty())
        {
            underlyingInstrument.underlyingQty(this.underlyingQty());
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


        return encoder;
    }

}
    public class UnderlyingsGroupIterator implements Iterable<UnderlyingsGroupDecoder>, java.util.Iterator<UnderlyingsGroupDecoder>
    {
        private final TradeCaptureReportRequestDecoder parent;
        private int remainder;
        private UnderlyingsGroupDecoder current;

        public UnderlyingsGroupIterator(final TradeCaptureReportRequestDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }

        public UnderlyingsGroupDecoder next()
        {
            remainder--;
            final UnderlyingsGroupDecoder value = current;
            current = current.next();
            return value;
        }

        public int numberFieldValue()
        {
            return parent.hasNoUnderlyingsGroupCounter() ? parent.noUnderlyingsGroupCounter() : 0;
        }

        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.underlyingsGroup();
        }

        public UnderlyingsGroupIterator iterator()
        {
            reset();
            return this;
        }

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



public class LegsGroupDecoder extends CommonDecoderImpl implements InstrumentLegDecoder
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(0);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
        }
    }

    public final IntHashSet GROUP_FIELDS = new IntHashSet(82);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            GROUP_FIELDS.add(Constants.LEG_SYMBOL);
            GROUP_FIELDS.add(Constants.LEG_SYMBOL_SFX);
            GROUP_FIELDS.add(Constants.LEG_SECURITY_ID);
            GROUP_FIELDS.add(Constants.LEG_SECURITY_ID_SOURCE);
            GROUP_FIELDS.add(Constants.LEG_PRODUCT);
            GROUP_FIELDS.add(Constants.LEG_C_F_I_CODE);
            GROUP_FIELDS.add(Constants.LEG_SECURITY_TYPE);
            GROUP_FIELDS.add(Constants.LEG_SECURITY_SUB_TYPE);
            GROUP_FIELDS.add(Constants.LEG_MATURITY_MONTH_YEAR);
            GROUP_FIELDS.add(Constants.LEG_MATURITY_DATE);
            GROUP_FIELDS.add(Constants.LEG_COUPON_PAYMENT_DATE);
            GROUP_FIELDS.add(Constants.LEG_ISSUE_DATE);
            GROUP_FIELDS.add(Constants.LEG_REPO_COLLATERAL_SECURITY_TYPE);
            GROUP_FIELDS.add(Constants.LEG_REPURCHASE_TERM);
            GROUP_FIELDS.add(Constants.LEG_REPURCHASE_RATE);
            GROUP_FIELDS.add(Constants.LEG_FACTOR);
            GROUP_FIELDS.add(Constants.LEG_CREDIT_RATING);
            GROUP_FIELDS.add(Constants.LEG_INSTR_REGISTRY);
            GROUP_FIELDS.add(Constants.LEG_COUNTRY_OF_ISSUE);
            GROUP_FIELDS.add(Constants.LEG_STATE_OR_PROVINCE_OF_ISSUE);
            GROUP_FIELDS.add(Constants.LEG_LOCALE_OF_ISSUE);
            GROUP_FIELDS.add(Constants.LEG_REDEMPTION_DATE);
            GROUP_FIELDS.add(Constants.LEG_STRIKE_PRICE);
            GROUP_FIELDS.add(Constants.LEG_STRIKE_CURRENCY);
            GROUP_FIELDS.add(Constants.LEG_OPT_ATTRIBUTE);
            GROUP_FIELDS.add(Constants.LEG_CONTRACT_MULTIPLIER);
            GROUP_FIELDS.add(Constants.LEG_COUPON_RATE);
            GROUP_FIELDS.add(Constants.LEG_SECURITY_EXCHANGE);
            GROUP_FIELDS.add(Constants.LEG_ISSUER);
            GROUP_FIELDS.add(Constants.ENCODED_LEG_ISSUER_LEN);
            GROUP_FIELDS.add(Constants.ENCODED_LEG_ISSUER);
            GROUP_FIELDS.add(Constants.LEG_SECURITY_DESC);
            GROUP_FIELDS.add(Constants.ENCODED_LEG_SECURITY_DESC_LEN);
            GROUP_FIELDS.add(Constants.ENCODED_LEG_SECURITY_DESC);
            GROUP_FIELDS.add(Constants.LEG_RATIO_QTY);
            GROUP_FIELDS.add(Constants.LEG_SIDE);
            GROUP_FIELDS.add(Constants.LEG_CURRENCY);
            GROUP_FIELDS.add(Constants.LEG_POOL);
            GROUP_FIELDS.add(Constants.LEG_DATED_DATE);
            GROUP_FIELDS.add(Constants.LEG_CONTRACT_SETTL_MONTH);
            GROUP_FIELDS.add(Constants.LEG_INTEREST_ACCRUAL_DATE);
        }
    }

    public final IntHashSet ALL_GROUP_FIELDS = new IntHashSet(0);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
        }
    }

    private final IntHashSet missingRequiredFields = new IntHashSet(0);

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
        if (hasNoLegSecurityAltIDGroupCounter)
        {
            {
                int count = 0;
                final LegSecurityAltIDGroupIterator iterator = legSecurityAltIDGroupIterator.iterator();
                for (final LegSecurityAltIDGroupDecoder group : iterator)
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
                    invalidTagId = 604;
                    rejectReason = 16;
                    return false;
                }
            }
        }
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public LegsGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private LegsGroupDecoder next = null;

    public LegsGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(2);


    private char[] legSymbol = new char[1];

    private boolean hasLegSymbol;

    public char[] legSymbol()
    {
        if (!hasLegSymbol)
        {
            throw new IllegalArgumentException("No value for optional field: LegSymbol");
        }

        return legSymbol;
    }

    public boolean hasLegSymbol()
    {
        return hasLegSymbol;
    }


    private int legSymbolOffset;

    private int legSymbolLength;

    public int legSymbolLength()
    {
        if (!hasLegSymbol)
        {
            throw new IllegalArgumentException("No value for optional field: LegSymbol");
        }

        return legSymbolLength;
    }

    public String legSymbolAsString()
    {
        return hasLegSymbol ? new String(legSymbol, 0, legSymbolLength) : null;
    }

    public void legSymbol(final AsciiSequenceView view)
    {
        if (!hasLegSymbol)
        {
            throw new IllegalArgumentException("No value for optional field: LegSymbol");
        }

        view.wrap(buffer, legSymbolOffset, legSymbolLength);
    }


    private final CharArrayWrapper legSymbolWrapper = new CharArrayWrapper();
    private char[] legSymbolSfx = new char[1];

    private boolean hasLegSymbolSfx;

    public char[] legSymbolSfx()
    {
        if (!hasLegSymbolSfx)
        {
            throw new IllegalArgumentException("No value for optional field: LegSymbolSfx");
        }

        return legSymbolSfx;
    }

    public boolean hasLegSymbolSfx()
    {
        return hasLegSymbolSfx;
    }


    private int legSymbolSfxOffset;

    private int legSymbolSfxLength;

    public int legSymbolSfxLength()
    {
        if (!hasLegSymbolSfx)
        {
            throw new IllegalArgumentException("No value for optional field: LegSymbolSfx");
        }

        return legSymbolSfxLength;
    }

    public String legSymbolSfxAsString()
    {
        return hasLegSymbolSfx ? new String(legSymbolSfx, 0, legSymbolSfxLength) : null;
    }

    public void legSymbolSfx(final AsciiSequenceView view)
    {
        if (!hasLegSymbolSfx)
        {
            throw new IllegalArgumentException("No value for optional field: LegSymbolSfx");
        }

        view.wrap(buffer, legSymbolSfxOffset, legSymbolSfxLength);
    }


    private final CharArrayWrapper legSymbolSfxWrapper = new CharArrayWrapper();
    private char[] legSecurityID = new char[1];

    private boolean hasLegSecurityID;

    public char[] legSecurityID()
    {
        if (!hasLegSecurityID)
        {
            throw new IllegalArgumentException("No value for optional field: LegSecurityID");
        }

        return legSecurityID;
    }

    public boolean hasLegSecurityID()
    {
        return hasLegSecurityID;
    }


    private int legSecurityIDOffset;

    private int legSecurityIDLength;

    public int legSecurityIDLength()
    {
        if (!hasLegSecurityID)
        {
            throw new IllegalArgumentException("No value for optional field: LegSecurityID");
        }

        return legSecurityIDLength;
    }

    public String legSecurityIDAsString()
    {
        return hasLegSecurityID ? new String(legSecurityID, 0, legSecurityIDLength) : null;
    }

    public void legSecurityID(final AsciiSequenceView view)
    {
        if (!hasLegSecurityID)
        {
            throw new IllegalArgumentException("No value for optional field: LegSecurityID");
        }

        view.wrap(buffer, legSecurityIDOffset, legSecurityIDLength);
    }


    private final CharArrayWrapper legSecurityIDWrapper = new CharArrayWrapper();
    private char[] legSecurityIDSource = new char[1];

    private boolean hasLegSecurityIDSource;

    public char[] legSecurityIDSource()
    {
        if (!hasLegSecurityIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: LegSecurityIDSource");
        }

        return legSecurityIDSource;
    }

    public boolean hasLegSecurityIDSource()
    {
        return hasLegSecurityIDSource;
    }


    private int legSecurityIDSourceOffset;

    private int legSecurityIDSourceLength;

    public int legSecurityIDSourceLength()
    {
        if (!hasLegSecurityIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: LegSecurityIDSource");
        }

        return legSecurityIDSourceLength;
    }

    public String legSecurityIDSourceAsString()
    {
        return hasLegSecurityIDSource ? new String(legSecurityIDSource, 0, legSecurityIDSourceLength) : null;
    }

    public void legSecurityIDSource(final AsciiSequenceView view)
    {
        if (!hasLegSecurityIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: LegSecurityIDSource");
        }

        view.wrap(buffer, legSecurityIDSourceOffset, legSecurityIDSourceLength);
    }


    private final CharArrayWrapper legSecurityIDSourceWrapper = new CharArrayWrapper();

    private LegSecurityAltIDGroupDecoder legSecurityAltIDGroup = null;
    public LegSecurityAltIDGroupDecoder legSecurityAltIDGroup()
    {
        return legSecurityAltIDGroup;
    }

    private int noLegSecurityAltIDGroupCounter = MISSING_INT;

    private boolean hasNoLegSecurityAltIDGroupCounter;

    public int noLegSecurityAltIDGroupCounter()
    {
        if (!hasNoLegSecurityAltIDGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoLegSecurityAltIDGroupCounter");
        }

        return noLegSecurityAltIDGroupCounter;
    }

    public boolean hasNoLegSecurityAltIDGroupCounter()
    {
        return hasNoLegSecurityAltIDGroupCounter;
    }




    private LegSecurityAltIDGroupIterator legSecurityAltIDGroupIterator = new LegSecurityAltIDGroupIterator(this);
    public LegSecurityAltIDGroupIterator legSecurityAltIDGroupIterator()
    {
        return legSecurityAltIDGroupIterator.iterator();
    }

    private int legProduct = MISSING_INT;

    private boolean hasLegProduct;

    public int legProduct()
    {
        if (!hasLegProduct)
        {
            throw new IllegalArgumentException("No value for optional field: LegProduct");
        }

        return legProduct;
    }

    public boolean hasLegProduct()
    {
        return hasLegProduct;
    }



    private char[] legCFICode = new char[1];

    private boolean hasLegCFICode;

    public char[] legCFICode()
    {
        if (!hasLegCFICode)
        {
            throw new IllegalArgumentException("No value for optional field: LegCFICode");
        }

        return legCFICode;
    }

    public boolean hasLegCFICode()
    {
        return hasLegCFICode;
    }


    private int legCFICodeOffset;

    private int legCFICodeLength;

    public int legCFICodeLength()
    {
        if (!hasLegCFICode)
        {
            throw new IllegalArgumentException("No value for optional field: LegCFICode");
        }

        return legCFICodeLength;
    }

    public String legCFICodeAsString()
    {
        return hasLegCFICode ? new String(legCFICode, 0, legCFICodeLength) : null;
    }

    public void legCFICode(final AsciiSequenceView view)
    {
        if (!hasLegCFICode)
        {
            throw new IllegalArgumentException("No value for optional field: LegCFICode");
        }

        view.wrap(buffer, legCFICodeOffset, legCFICodeLength);
    }


    private final CharArrayWrapper legCFICodeWrapper = new CharArrayWrapper();
    private char[] legSecurityType = new char[1];

    private boolean hasLegSecurityType;

    public char[] legSecurityType()
    {
        if (!hasLegSecurityType)
        {
            throw new IllegalArgumentException("No value for optional field: LegSecurityType");
        }

        return legSecurityType;
    }

    public boolean hasLegSecurityType()
    {
        return hasLegSecurityType;
    }


    private int legSecurityTypeOffset;

    private int legSecurityTypeLength;

    public int legSecurityTypeLength()
    {
        if (!hasLegSecurityType)
        {
            throw new IllegalArgumentException("No value for optional field: LegSecurityType");
        }

        return legSecurityTypeLength;
    }

    public String legSecurityTypeAsString()
    {
        return hasLegSecurityType ? new String(legSecurityType, 0, legSecurityTypeLength) : null;
    }

    public void legSecurityType(final AsciiSequenceView view)
    {
        if (!hasLegSecurityType)
        {
            throw new IllegalArgumentException("No value for optional field: LegSecurityType");
        }

        view.wrap(buffer, legSecurityTypeOffset, legSecurityTypeLength);
    }


    private final CharArrayWrapper legSecurityTypeWrapper = new CharArrayWrapper();
    private char[] legSecuritySubType = new char[1];

    private boolean hasLegSecuritySubType;

    public char[] legSecuritySubType()
    {
        if (!hasLegSecuritySubType)
        {
            throw new IllegalArgumentException("No value for optional field: LegSecuritySubType");
        }

        return legSecuritySubType;
    }

    public boolean hasLegSecuritySubType()
    {
        return hasLegSecuritySubType;
    }


    private int legSecuritySubTypeOffset;

    private int legSecuritySubTypeLength;

    public int legSecuritySubTypeLength()
    {
        if (!hasLegSecuritySubType)
        {
            throw new IllegalArgumentException("No value for optional field: LegSecuritySubType");
        }

        return legSecuritySubTypeLength;
    }

    public String legSecuritySubTypeAsString()
    {
        return hasLegSecuritySubType ? new String(legSecuritySubType, 0, legSecuritySubTypeLength) : null;
    }

    public void legSecuritySubType(final AsciiSequenceView view)
    {
        if (!hasLegSecuritySubType)
        {
            throw new IllegalArgumentException("No value for optional field: LegSecuritySubType");
        }

        view.wrap(buffer, legSecuritySubTypeOffset, legSecuritySubTypeLength);
    }


    private final CharArrayWrapper legSecuritySubTypeWrapper = new CharArrayWrapper();
    private byte[] legMaturityMonthYear = new byte[8];

    private boolean hasLegMaturityMonthYear;

    public byte[] legMaturityMonthYear()
    {
        if (!hasLegMaturityMonthYear)
        {
            throw new IllegalArgumentException("No value for optional field: LegMaturityMonthYear");
        }

        return legMaturityMonthYear;
    }

    public boolean hasLegMaturityMonthYear()
    {
        return hasLegMaturityMonthYear;
    }


    private int legMaturityMonthYearOffset;

    private int legMaturityMonthYearLength;

    public int legMaturityMonthYearLength()
    {
        if (!hasLegMaturityMonthYear)
        {
            throw new IllegalArgumentException("No value for optional field: LegMaturityMonthYear");
        }

        return legMaturityMonthYearLength;
    }

    public String legMaturityMonthYearAsString()
    {
        return hasLegMaturityMonthYear ? new String(legMaturityMonthYear, 0, legMaturityMonthYearLength) : null;
    }

    public void legMaturityMonthYear(final AsciiSequenceView view)
    {
        if (!hasLegMaturityMonthYear)
        {
            throw new IllegalArgumentException("No value for optional field: LegMaturityMonthYear");
        }

        view.wrap(buffer, legMaturityMonthYearOffset, legMaturityMonthYearLength);
    }


    private byte[] legMaturityDate = new byte[8];

    private boolean hasLegMaturityDate;

    public byte[] legMaturityDate()
    {
        if (!hasLegMaturityDate)
        {
            throw new IllegalArgumentException("No value for optional field: LegMaturityDate");
        }

        return legMaturityDate;
    }

    public boolean hasLegMaturityDate()
    {
        return hasLegMaturityDate;
    }


    private int legMaturityDateOffset;

    private int legMaturityDateLength;

    public int legMaturityDateLength()
    {
        if (!hasLegMaturityDate)
        {
            throw new IllegalArgumentException("No value for optional field: LegMaturityDate");
        }

        return legMaturityDateLength;
    }

    public String legMaturityDateAsString()
    {
        return hasLegMaturityDate ? new String(legMaturityDate, 0, legMaturityDateLength) : null;
    }

    public void legMaturityDate(final AsciiSequenceView view)
    {
        if (!hasLegMaturityDate)
        {
            throw new IllegalArgumentException("No value for optional field: LegMaturityDate");
        }

        view.wrap(buffer, legMaturityDateOffset, legMaturityDateLength);
    }


    private byte[] legCouponPaymentDate = new byte[8];

    private boolean hasLegCouponPaymentDate;

    public byte[] legCouponPaymentDate()
    {
        if (!hasLegCouponPaymentDate)
        {
            throw new IllegalArgumentException("No value for optional field: LegCouponPaymentDate");
        }

        return legCouponPaymentDate;
    }

    public boolean hasLegCouponPaymentDate()
    {
        return hasLegCouponPaymentDate;
    }


    private int legCouponPaymentDateOffset;

    private int legCouponPaymentDateLength;

    public int legCouponPaymentDateLength()
    {
        if (!hasLegCouponPaymentDate)
        {
            throw new IllegalArgumentException("No value for optional field: LegCouponPaymentDate");
        }

        return legCouponPaymentDateLength;
    }

    public String legCouponPaymentDateAsString()
    {
        return hasLegCouponPaymentDate ? new String(legCouponPaymentDate, 0, legCouponPaymentDateLength) : null;
    }

    public void legCouponPaymentDate(final AsciiSequenceView view)
    {
        if (!hasLegCouponPaymentDate)
        {
            throw new IllegalArgumentException("No value for optional field: LegCouponPaymentDate");
        }

        view.wrap(buffer, legCouponPaymentDateOffset, legCouponPaymentDateLength);
    }


    private byte[] legIssueDate = new byte[8];

    private boolean hasLegIssueDate;

    public byte[] legIssueDate()
    {
        if (!hasLegIssueDate)
        {
            throw new IllegalArgumentException("No value for optional field: LegIssueDate");
        }

        return legIssueDate;
    }

    public boolean hasLegIssueDate()
    {
        return hasLegIssueDate;
    }


    private int legIssueDateOffset;

    private int legIssueDateLength;

    public int legIssueDateLength()
    {
        if (!hasLegIssueDate)
        {
            throw new IllegalArgumentException("No value for optional field: LegIssueDate");
        }

        return legIssueDateLength;
    }

    public String legIssueDateAsString()
    {
        return hasLegIssueDate ? new String(legIssueDate, 0, legIssueDateLength) : null;
    }

    public void legIssueDate(final AsciiSequenceView view)
    {
        if (!hasLegIssueDate)
        {
            throw new IllegalArgumentException("No value for optional field: LegIssueDate");
        }

        view.wrap(buffer, legIssueDateOffset, legIssueDateLength);
    }


    private char[] legRepoCollateralSecurityType = new char[1];

    private boolean hasLegRepoCollateralSecurityType;

    public char[] legRepoCollateralSecurityType()
    {
        if (!hasLegRepoCollateralSecurityType)
        {
            throw new IllegalArgumentException("No value for optional field: LegRepoCollateralSecurityType");
        }

        return legRepoCollateralSecurityType;
    }

    public boolean hasLegRepoCollateralSecurityType()
    {
        return hasLegRepoCollateralSecurityType;
    }


    private int legRepoCollateralSecurityTypeOffset;

    private int legRepoCollateralSecurityTypeLength;

    public int legRepoCollateralSecurityTypeLength()
    {
        if (!hasLegRepoCollateralSecurityType)
        {
            throw new IllegalArgumentException("No value for optional field: LegRepoCollateralSecurityType");
        }

        return legRepoCollateralSecurityTypeLength;
    }

    public String legRepoCollateralSecurityTypeAsString()
    {
        return hasLegRepoCollateralSecurityType ? new String(legRepoCollateralSecurityType, 0, legRepoCollateralSecurityTypeLength) : null;
    }

    public void legRepoCollateralSecurityType(final AsciiSequenceView view)
    {
        if (!hasLegRepoCollateralSecurityType)
        {
            throw new IllegalArgumentException("No value for optional field: LegRepoCollateralSecurityType");
        }

        view.wrap(buffer, legRepoCollateralSecurityTypeOffset, legRepoCollateralSecurityTypeLength);
    }


    private final CharArrayWrapper legRepoCollateralSecurityTypeWrapper = new CharArrayWrapper();
    private int legRepurchaseTerm = MISSING_INT;

    private boolean hasLegRepurchaseTerm;

    public int legRepurchaseTerm()
    {
        if (!hasLegRepurchaseTerm)
        {
            throw new IllegalArgumentException("No value for optional field: LegRepurchaseTerm");
        }

        return legRepurchaseTerm;
    }

    public boolean hasLegRepurchaseTerm()
    {
        return hasLegRepurchaseTerm;
    }



    private DecimalFloat legRepurchaseRate = DecimalFloat.newNaNValue();

    private boolean hasLegRepurchaseRate;

    public DecimalFloat legRepurchaseRate()
    {
        if (!hasLegRepurchaseRate)
        {
            throw new IllegalArgumentException("No value for optional field: LegRepurchaseRate");
        }

        return legRepurchaseRate;
    }

    public boolean hasLegRepurchaseRate()
    {
        return hasLegRepurchaseRate;
    }



    private DecimalFloat legFactor = DecimalFloat.newNaNValue();

    private boolean hasLegFactor;

    public DecimalFloat legFactor()
    {
        if (!hasLegFactor)
        {
            throw new IllegalArgumentException("No value for optional field: LegFactor");
        }

        return legFactor;
    }

    public boolean hasLegFactor()
    {
        return hasLegFactor;
    }



    private char[] legCreditRating = new char[1];

    private boolean hasLegCreditRating;

    public char[] legCreditRating()
    {
        if (!hasLegCreditRating)
        {
            throw new IllegalArgumentException("No value for optional field: LegCreditRating");
        }

        return legCreditRating;
    }

    public boolean hasLegCreditRating()
    {
        return hasLegCreditRating;
    }


    private int legCreditRatingOffset;

    private int legCreditRatingLength;

    public int legCreditRatingLength()
    {
        if (!hasLegCreditRating)
        {
            throw new IllegalArgumentException("No value for optional field: LegCreditRating");
        }

        return legCreditRatingLength;
    }

    public String legCreditRatingAsString()
    {
        return hasLegCreditRating ? new String(legCreditRating, 0, legCreditRatingLength) : null;
    }

    public void legCreditRating(final AsciiSequenceView view)
    {
        if (!hasLegCreditRating)
        {
            throw new IllegalArgumentException("No value for optional field: LegCreditRating");
        }

        view.wrap(buffer, legCreditRatingOffset, legCreditRatingLength);
    }


    private final CharArrayWrapper legCreditRatingWrapper = new CharArrayWrapper();
    private char[] legInstrRegistry = new char[1];

    private boolean hasLegInstrRegistry;

    public char[] legInstrRegistry()
    {
        if (!hasLegInstrRegistry)
        {
            throw new IllegalArgumentException("No value for optional field: LegInstrRegistry");
        }

        return legInstrRegistry;
    }

    public boolean hasLegInstrRegistry()
    {
        return hasLegInstrRegistry;
    }


    private int legInstrRegistryOffset;

    private int legInstrRegistryLength;

    public int legInstrRegistryLength()
    {
        if (!hasLegInstrRegistry)
        {
            throw new IllegalArgumentException("No value for optional field: LegInstrRegistry");
        }

        return legInstrRegistryLength;
    }

    public String legInstrRegistryAsString()
    {
        return hasLegInstrRegistry ? new String(legInstrRegistry, 0, legInstrRegistryLength) : null;
    }

    public void legInstrRegistry(final AsciiSequenceView view)
    {
        if (!hasLegInstrRegistry)
        {
            throw new IllegalArgumentException("No value for optional field: LegInstrRegistry");
        }

        view.wrap(buffer, legInstrRegistryOffset, legInstrRegistryLength);
    }


    private final CharArrayWrapper legInstrRegistryWrapper = new CharArrayWrapper();
    private char[] legCountryOfIssue = new char[1];

    private boolean hasLegCountryOfIssue;

    public char[] legCountryOfIssue()
    {
        if (!hasLegCountryOfIssue)
        {
            throw new IllegalArgumentException("No value for optional field: LegCountryOfIssue");
        }

        return legCountryOfIssue;
    }

    public boolean hasLegCountryOfIssue()
    {
        return hasLegCountryOfIssue;
    }


    private int legCountryOfIssueOffset;

    private int legCountryOfIssueLength;

    public int legCountryOfIssueLength()
    {
        if (!hasLegCountryOfIssue)
        {
            throw new IllegalArgumentException("No value for optional field: LegCountryOfIssue");
        }

        return legCountryOfIssueLength;
    }

    public String legCountryOfIssueAsString()
    {
        return hasLegCountryOfIssue ? new String(legCountryOfIssue, 0, legCountryOfIssueLength) : null;
    }

    public void legCountryOfIssue(final AsciiSequenceView view)
    {
        if (!hasLegCountryOfIssue)
        {
            throw new IllegalArgumentException("No value for optional field: LegCountryOfIssue");
        }

        view.wrap(buffer, legCountryOfIssueOffset, legCountryOfIssueLength);
    }


    private char[] legStateOrProvinceOfIssue = new char[1];

    private boolean hasLegStateOrProvinceOfIssue;

    public char[] legStateOrProvinceOfIssue()
    {
        if (!hasLegStateOrProvinceOfIssue)
        {
            throw new IllegalArgumentException("No value for optional field: LegStateOrProvinceOfIssue");
        }

        return legStateOrProvinceOfIssue;
    }

    public boolean hasLegStateOrProvinceOfIssue()
    {
        return hasLegStateOrProvinceOfIssue;
    }


    private int legStateOrProvinceOfIssueOffset;

    private int legStateOrProvinceOfIssueLength;

    public int legStateOrProvinceOfIssueLength()
    {
        if (!hasLegStateOrProvinceOfIssue)
        {
            throw new IllegalArgumentException("No value for optional field: LegStateOrProvinceOfIssue");
        }

        return legStateOrProvinceOfIssueLength;
    }

    public String legStateOrProvinceOfIssueAsString()
    {
        return hasLegStateOrProvinceOfIssue ? new String(legStateOrProvinceOfIssue, 0, legStateOrProvinceOfIssueLength) : null;
    }

    public void legStateOrProvinceOfIssue(final AsciiSequenceView view)
    {
        if (!hasLegStateOrProvinceOfIssue)
        {
            throw new IllegalArgumentException("No value for optional field: LegStateOrProvinceOfIssue");
        }

        view.wrap(buffer, legStateOrProvinceOfIssueOffset, legStateOrProvinceOfIssueLength);
    }


    private final CharArrayWrapper legStateOrProvinceOfIssueWrapper = new CharArrayWrapper();
    private char[] legLocaleOfIssue = new char[1];

    private boolean hasLegLocaleOfIssue;

    public char[] legLocaleOfIssue()
    {
        if (!hasLegLocaleOfIssue)
        {
            throw new IllegalArgumentException("No value for optional field: LegLocaleOfIssue");
        }

        return legLocaleOfIssue;
    }

    public boolean hasLegLocaleOfIssue()
    {
        return hasLegLocaleOfIssue;
    }


    private int legLocaleOfIssueOffset;

    private int legLocaleOfIssueLength;

    public int legLocaleOfIssueLength()
    {
        if (!hasLegLocaleOfIssue)
        {
            throw new IllegalArgumentException("No value for optional field: LegLocaleOfIssue");
        }

        return legLocaleOfIssueLength;
    }

    public String legLocaleOfIssueAsString()
    {
        return hasLegLocaleOfIssue ? new String(legLocaleOfIssue, 0, legLocaleOfIssueLength) : null;
    }

    public void legLocaleOfIssue(final AsciiSequenceView view)
    {
        if (!hasLegLocaleOfIssue)
        {
            throw new IllegalArgumentException("No value for optional field: LegLocaleOfIssue");
        }

        view.wrap(buffer, legLocaleOfIssueOffset, legLocaleOfIssueLength);
    }


    private final CharArrayWrapper legLocaleOfIssueWrapper = new CharArrayWrapper();
    private byte[] legRedemptionDate = new byte[8];

    private boolean hasLegRedemptionDate;

    public byte[] legRedemptionDate()
    {
        if (!hasLegRedemptionDate)
        {
            throw new IllegalArgumentException("No value for optional field: LegRedemptionDate");
        }

        return legRedemptionDate;
    }

    public boolean hasLegRedemptionDate()
    {
        return hasLegRedemptionDate;
    }


    private int legRedemptionDateOffset;

    private int legRedemptionDateLength;

    public int legRedemptionDateLength()
    {
        if (!hasLegRedemptionDate)
        {
            throw new IllegalArgumentException("No value for optional field: LegRedemptionDate");
        }

        return legRedemptionDateLength;
    }

    public String legRedemptionDateAsString()
    {
        return hasLegRedemptionDate ? new String(legRedemptionDate, 0, legRedemptionDateLength) : null;
    }

    public void legRedemptionDate(final AsciiSequenceView view)
    {
        if (!hasLegRedemptionDate)
        {
            throw new IllegalArgumentException("No value for optional field: LegRedemptionDate");
        }

        view.wrap(buffer, legRedemptionDateOffset, legRedemptionDateLength);
    }


    private DecimalFloat legStrikePrice = DecimalFloat.newNaNValue();

    private boolean hasLegStrikePrice;

    public DecimalFloat legStrikePrice()
    {
        if (!hasLegStrikePrice)
        {
            throw new IllegalArgumentException("No value for optional field: LegStrikePrice");
        }

        return legStrikePrice;
    }

    public boolean hasLegStrikePrice()
    {
        return hasLegStrikePrice;
    }



    private char[] legStrikeCurrency = new char[1];

    private boolean hasLegStrikeCurrency;

    public char[] legStrikeCurrency()
    {
        if (!hasLegStrikeCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: LegStrikeCurrency");
        }

        return legStrikeCurrency;
    }

    public boolean hasLegStrikeCurrency()
    {
        return hasLegStrikeCurrency;
    }


    private int legStrikeCurrencyOffset;

    private int legStrikeCurrencyLength;

    public int legStrikeCurrencyLength()
    {
        if (!hasLegStrikeCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: LegStrikeCurrency");
        }

        return legStrikeCurrencyLength;
    }

    public String legStrikeCurrencyAsString()
    {
        return hasLegStrikeCurrency ? new String(legStrikeCurrency, 0, legStrikeCurrencyLength) : null;
    }

    public void legStrikeCurrency(final AsciiSequenceView view)
    {
        if (!hasLegStrikeCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: LegStrikeCurrency");
        }

        view.wrap(buffer, legStrikeCurrencyOffset, legStrikeCurrencyLength);
    }


    private char legOptAttribute = MISSING_CHAR;

    private boolean hasLegOptAttribute;

    public char legOptAttribute()
    {
        if (!hasLegOptAttribute)
        {
            throw new IllegalArgumentException("No value for optional field: LegOptAttribute");
        }

        return legOptAttribute;
    }

    public boolean hasLegOptAttribute()
    {
        return hasLegOptAttribute;
    }



    private DecimalFloat legContractMultiplier = DecimalFloat.newNaNValue();

    private boolean hasLegContractMultiplier;

    public DecimalFloat legContractMultiplier()
    {
        if (!hasLegContractMultiplier)
        {
            throw new IllegalArgumentException("No value for optional field: LegContractMultiplier");
        }

        return legContractMultiplier;
    }

    public boolean hasLegContractMultiplier()
    {
        return hasLegContractMultiplier;
    }



    private DecimalFloat legCouponRate = DecimalFloat.newNaNValue();

    private boolean hasLegCouponRate;

    public DecimalFloat legCouponRate()
    {
        if (!hasLegCouponRate)
        {
            throw new IllegalArgumentException("No value for optional field: LegCouponRate");
        }

        return legCouponRate;
    }

    public boolean hasLegCouponRate()
    {
        return hasLegCouponRate;
    }



    private char[] legSecurityExchange = new char[1];

    private boolean hasLegSecurityExchange;

    public char[] legSecurityExchange()
    {
        if (!hasLegSecurityExchange)
        {
            throw new IllegalArgumentException("No value for optional field: LegSecurityExchange");
        }

        return legSecurityExchange;
    }

    public boolean hasLegSecurityExchange()
    {
        return hasLegSecurityExchange;
    }


    private int legSecurityExchangeOffset;

    private int legSecurityExchangeLength;

    public int legSecurityExchangeLength()
    {
        if (!hasLegSecurityExchange)
        {
            throw new IllegalArgumentException("No value for optional field: LegSecurityExchange");
        }

        return legSecurityExchangeLength;
    }

    public String legSecurityExchangeAsString()
    {
        return hasLegSecurityExchange ? new String(legSecurityExchange, 0, legSecurityExchangeLength) : null;
    }

    public void legSecurityExchange(final AsciiSequenceView view)
    {
        if (!hasLegSecurityExchange)
        {
            throw new IllegalArgumentException("No value for optional field: LegSecurityExchange");
        }

        view.wrap(buffer, legSecurityExchangeOffset, legSecurityExchangeLength);
    }


    private char[] legIssuer = new char[1];

    private boolean hasLegIssuer;

    public char[] legIssuer()
    {
        if (!hasLegIssuer)
        {
            throw new IllegalArgumentException("No value for optional field: LegIssuer");
        }

        return legIssuer;
    }

    public boolean hasLegIssuer()
    {
        return hasLegIssuer;
    }


    private int legIssuerOffset;

    private int legIssuerLength;

    public int legIssuerLength()
    {
        if (!hasLegIssuer)
        {
            throw new IllegalArgumentException("No value for optional field: LegIssuer");
        }

        return legIssuerLength;
    }

    public String legIssuerAsString()
    {
        return hasLegIssuer ? new String(legIssuer, 0, legIssuerLength) : null;
    }

    public void legIssuer(final AsciiSequenceView view)
    {
        if (!hasLegIssuer)
        {
            throw new IllegalArgumentException("No value for optional field: LegIssuer");
        }

        view.wrap(buffer, legIssuerOffset, legIssuerLength);
    }


    private final CharArrayWrapper legIssuerWrapper = new CharArrayWrapper();
    private int encodedLegIssuerLen = MISSING_INT;

    private boolean hasEncodedLegIssuerLen;

    public int encodedLegIssuerLen()
    {
        if (!hasEncodedLegIssuerLen)
        {
            throw new IllegalArgumentException("No value for optional field: EncodedLegIssuerLen");
        }

        return encodedLegIssuerLen;
    }

    public boolean hasEncodedLegIssuerLen()
    {
        return hasEncodedLegIssuerLen;
    }



    private byte[] encodedLegIssuer = new byte[1];

    private boolean hasEncodedLegIssuer;

    public byte[] encodedLegIssuer()
    {
        if (!hasEncodedLegIssuer)
        {
            throw new IllegalArgumentException("No value for optional field: EncodedLegIssuer");
        }

        return encodedLegIssuer;
    }

    public boolean hasEncodedLegIssuer()
    {
        return hasEncodedLegIssuer;
    }



    private char[] legSecurityDesc = new char[1];

    private boolean hasLegSecurityDesc;

    public char[] legSecurityDesc()
    {
        if (!hasLegSecurityDesc)
        {
            throw new IllegalArgumentException("No value for optional field: LegSecurityDesc");
        }

        return legSecurityDesc;
    }

    public boolean hasLegSecurityDesc()
    {
        return hasLegSecurityDesc;
    }


    private int legSecurityDescOffset;

    private int legSecurityDescLength;

    public int legSecurityDescLength()
    {
        if (!hasLegSecurityDesc)
        {
            throw new IllegalArgumentException("No value for optional field: LegSecurityDesc");
        }

        return legSecurityDescLength;
    }

    public String legSecurityDescAsString()
    {
        return hasLegSecurityDesc ? new String(legSecurityDesc, 0, legSecurityDescLength) : null;
    }

    public void legSecurityDesc(final AsciiSequenceView view)
    {
        if (!hasLegSecurityDesc)
        {
            throw new IllegalArgumentException("No value for optional field: LegSecurityDesc");
        }

        view.wrap(buffer, legSecurityDescOffset, legSecurityDescLength);
    }


    private final CharArrayWrapper legSecurityDescWrapper = new CharArrayWrapper();
    private int encodedLegSecurityDescLen = MISSING_INT;

    private boolean hasEncodedLegSecurityDescLen;

    public int encodedLegSecurityDescLen()
    {
        if (!hasEncodedLegSecurityDescLen)
        {
            throw new IllegalArgumentException("No value for optional field: EncodedLegSecurityDescLen");
        }

        return encodedLegSecurityDescLen;
    }

    public boolean hasEncodedLegSecurityDescLen()
    {
        return hasEncodedLegSecurityDescLen;
    }



    private byte[] encodedLegSecurityDesc = new byte[1];

    private boolean hasEncodedLegSecurityDesc;

    public byte[] encodedLegSecurityDesc()
    {
        if (!hasEncodedLegSecurityDesc)
        {
            throw new IllegalArgumentException("No value for optional field: EncodedLegSecurityDesc");
        }

        return encodedLegSecurityDesc;
    }

    public boolean hasEncodedLegSecurityDesc()
    {
        return hasEncodedLegSecurityDesc;
    }



    private DecimalFloat legRatioQty = DecimalFloat.newNaNValue();

    private boolean hasLegRatioQty;

    public DecimalFloat legRatioQty()
    {
        if (!hasLegRatioQty)
        {
            throw new IllegalArgumentException("No value for optional field: LegRatioQty");
        }

        return legRatioQty;
    }

    public boolean hasLegRatioQty()
    {
        return hasLegRatioQty;
    }



    private char legSide = MISSING_CHAR;

    private boolean hasLegSide;

    public char legSide()
    {
        if (!hasLegSide)
        {
            throw new IllegalArgumentException("No value for optional field: LegSide");
        }

        return legSide;
    }

    public boolean hasLegSide()
    {
        return hasLegSide;
    }



    private char[] legCurrency = new char[1];

    private boolean hasLegCurrency;

    public char[] legCurrency()
    {
        if (!hasLegCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: LegCurrency");
        }

        return legCurrency;
    }

    public boolean hasLegCurrency()
    {
        return hasLegCurrency;
    }


    private int legCurrencyOffset;

    private int legCurrencyLength;

    public int legCurrencyLength()
    {
        if (!hasLegCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: LegCurrency");
        }

        return legCurrencyLength;
    }

    public String legCurrencyAsString()
    {
        return hasLegCurrency ? new String(legCurrency, 0, legCurrencyLength) : null;
    }

    public void legCurrency(final AsciiSequenceView view)
    {
        if (!hasLegCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: LegCurrency");
        }

        view.wrap(buffer, legCurrencyOffset, legCurrencyLength);
    }


    private char[] legPool = new char[1];

    private boolean hasLegPool;

    public char[] legPool()
    {
        if (!hasLegPool)
        {
            throw new IllegalArgumentException("No value for optional field: LegPool");
        }

        return legPool;
    }

    public boolean hasLegPool()
    {
        return hasLegPool;
    }


    private int legPoolOffset;

    private int legPoolLength;

    public int legPoolLength()
    {
        if (!hasLegPool)
        {
            throw new IllegalArgumentException("No value for optional field: LegPool");
        }

        return legPoolLength;
    }

    public String legPoolAsString()
    {
        return hasLegPool ? new String(legPool, 0, legPoolLength) : null;
    }

    public void legPool(final AsciiSequenceView view)
    {
        if (!hasLegPool)
        {
            throw new IllegalArgumentException("No value for optional field: LegPool");
        }

        view.wrap(buffer, legPoolOffset, legPoolLength);
    }


    private final CharArrayWrapper legPoolWrapper = new CharArrayWrapper();
    private byte[] legDatedDate = new byte[8];

    private boolean hasLegDatedDate;

    public byte[] legDatedDate()
    {
        if (!hasLegDatedDate)
        {
            throw new IllegalArgumentException("No value for optional field: LegDatedDate");
        }

        return legDatedDate;
    }

    public boolean hasLegDatedDate()
    {
        return hasLegDatedDate;
    }


    private int legDatedDateOffset;

    private int legDatedDateLength;

    public int legDatedDateLength()
    {
        if (!hasLegDatedDate)
        {
            throw new IllegalArgumentException("No value for optional field: LegDatedDate");
        }

        return legDatedDateLength;
    }

    public String legDatedDateAsString()
    {
        return hasLegDatedDate ? new String(legDatedDate, 0, legDatedDateLength) : null;
    }

    public void legDatedDate(final AsciiSequenceView view)
    {
        if (!hasLegDatedDate)
        {
            throw new IllegalArgumentException("No value for optional field: LegDatedDate");
        }

        view.wrap(buffer, legDatedDateOffset, legDatedDateLength);
    }


    private byte[] legContractSettlMonth = new byte[8];

    private boolean hasLegContractSettlMonth;

    public byte[] legContractSettlMonth()
    {
        if (!hasLegContractSettlMonth)
        {
            throw new IllegalArgumentException("No value for optional field: LegContractSettlMonth");
        }

        return legContractSettlMonth;
    }

    public boolean hasLegContractSettlMonth()
    {
        return hasLegContractSettlMonth;
    }


    private int legContractSettlMonthOffset;

    private int legContractSettlMonthLength;

    public int legContractSettlMonthLength()
    {
        if (!hasLegContractSettlMonth)
        {
            throw new IllegalArgumentException("No value for optional field: LegContractSettlMonth");
        }

        return legContractSettlMonthLength;
    }

    public String legContractSettlMonthAsString()
    {
        return hasLegContractSettlMonth ? new String(legContractSettlMonth, 0, legContractSettlMonthLength) : null;
    }

    public void legContractSettlMonth(final AsciiSequenceView view)
    {
        if (!hasLegContractSettlMonth)
        {
            throw new IllegalArgumentException("No value for optional field: LegContractSettlMonth");
        }

        view.wrap(buffer, legContractSettlMonthOffset, legContractSettlMonthLength);
    }


    private byte[] legInterestAccrualDate = new byte[8];

    private boolean hasLegInterestAccrualDate;

    public byte[] legInterestAccrualDate()
    {
        if (!hasLegInterestAccrualDate)
        {
            throw new IllegalArgumentException("No value for optional field: LegInterestAccrualDate");
        }

        return legInterestAccrualDate;
    }

    public boolean hasLegInterestAccrualDate()
    {
        return hasLegInterestAccrualDate;
    }


    private int legInterestAccrualDateOffset;

    private int legInterestAccrualDateLength;

    public int legInterestAccrualDateLength()
    {
        if (!hasLegInterestAccrualDate)
        {
            throw new IllegalArgumentException("No value for optional field: LegInterestAccrualDate");
        }

        return legInterestAccrualDateLength;
    }

    public String legInterestAccrualDateAsString()
    {
        return hasLegInterestAccrualDate ? new String(legInterestAccrualDate, 0, legInterestAccrualDateLength) : null;
    }

    public void legInterestAccrualDate(final AsciiSequenceView view)
    {
        if (!hasLegInterestAccrualDate)
        {
            throw new IllegalArgumentException("No value for optional field: LegInterestAccrualDate");
        }

        view.wrap(buffer, legInterestAccrualDateOffset, legInterestAccrualDateLength);
    }



    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode LegsGroup
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
                    next = new LegsGroupDecoder(trailer, messageFields);
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
            case Constants.LEG_SYMBOL:
                hasLegSymbol = true;
                legSymbol = buffer.getChars(legSymbol, valueOffset, valueLength);
                legSymbolOffset = valueOffset;
                legSymbolLength = valueLength;
                break;

            case Constants.LEG_SYMBOL_SFX:
                hasLegSymbolSfx = true;
                legSymbolSfx = buffer.getChars(legSymbolSfx, valueOffset, valueLength);
                legSymbolSfxOffset = valueOffset;
                legSymbolSfxLength = valueLength;
                break;

            case Constants.LEG_SECURITY_ID:
                hasLegSecurityID = true;
                legSecurityID = buffer.getChars(legSecurityID, valueOffset, valueLength);
                legSecurityIDOffset = valueOffset;
                legSecurityIDLength = valueLength;
                break;

            case Constants.LEG_SECURITY_ID_SOURCE:
                hasLegSecurityIDSource = true;
                legSecurityIDSource = buffer.getChars(legSecurityIDSource, valueOffset, valueLength);
                legSecurityIDSourceOffset = valueOffset;
                legSecurityIDSourceLength = valueLength;
                break;

            case Constants.NO_LEG_SECURITY_ALT_ID_GROUP_COUNTER:
                hasNoLegSecurityAltIDGroupCounter = true;
                noLegSecurityAltIDGroupCounter = getInt(buffer, valueOffset, endOfField, 604, CODEC_VALIDATION_ENABLED);
                if (legSecurityAltIDGroup == null)
                {
                    legSecurityAltIDGroup = new LegSecurityAltIDGroupDecoder(trailer, messageFields);
                }
                LegSecurityAltIDGroupDecoder legSecurityAltIDGroupCurrent = legSecurityAltIDGroup;
                position = endOfField + 1;
                final int noLegSecurityAltIDGroupCounter = this.noLegSecurityAltIDGroupCounter;
                for (int i = 0; i < noLegSecurityAltIDGroupCounter && position < end; i++)
                {
                    if (legSecurityAltIDGroupCurrent != null)
                    {
                        position += legSecurityAltIDGroupCurrent.decode(buffer, position, end - position);
                        legSecurityAltIDGroupCurrent = legSecurityAltIDGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (legSecurityAltIDGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;

            case Constants.LEG_PRODUCT:
                hasLegProduct = true;
                legProduct = getInt(buffer, valueOffset, endOfField, 607, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.LEG_C_F_I_CODE:
                hasLegCFICode = true;
                legCFICode = buffer.getChars(legCFICode, valueOffset, valueLength);
                legCFICodeOffset = valueOffset;
                legCFICodeLength = valueLength;
                break;

            case Constants.LEG_SECURITY_TYPE:
                hasLegSecurityType = true;
                legSecurityType = buffer.getChars(legSecurityType, valueOffset, valueLength);
                legSecurityTypeOffset = valueOffset;
                legSecurityTypeLength = valueLength;
                break;

            case Constants.LEG_SECURITY_SUB_TYPE:
                hasLegSecuritySubType = true;
                legSecuritySubType = buffer.getChars(legSecuritySubType, valueOffset, valueLength);
                legSecuritySubTypeOffset = valueOffset;
                legSecuritySubTypeLength = valueLength;
                break;

            case Constants.LEG_MATURITY_MONTH_YEAR:
                hasLegMaturityMonthYear = true;
                legMaturityMonthYear = buffer.getBytes(legMaturityMonthYear, valueOffset, valueLength);
                legMaturityMonthYearOffset = valueOffset;
                legMaturityMonthYearLength = valueLength;
                break;

            case Constants.LEG_MATURITY_DATE:
                hasLegMaturityDate = true;
                legMaturityDate = buffer.getBytes(legMaturityDate, valueOffset, valueLength);
                legMaturityDateOffset = valueOffset;
                legMaturityDateLength = valueLength;
                break;

            case Constants.LEG_COUPON_PAYMENT_DATE:
                hasLegCouponPaymentDate = true;
                legCouponPaymentDate = buffer.getBytes(legCouponPaymentDate, valueOffset, valueLength);
                legCouponPaymentDateOffset = valueOffset;
                legCouponPaymentDateLength = valueLength;
                break;

            case Constants.LEG_ISSUE_DATE:
                hasLegIssueDate = true;
                legIssueDate = buffer.getBytes(legIssueDate, valueOffset, valueLength);
                legIssueDateOffset = valueOffset;
                legIssueDateLength = valueLength;
                break;

            case Constants.LEG_REPO_COLLATERAL_SECURITY_TYPE:
                hasLegRepoCollateralSecurityType = true;
                legRepoCollateralSecurityType = buffer.getChars(legRepoCollateralSecurityType, valueOffset, valueLength);
                legRepoCollateralSecurityTypeOffset = valueOffset;
                legRepoCollateralSecurityTypeLength = valueLength;
                break;

            case Constants.LEG_REPURCHASE_TERM:
                hasLegRepurchaseTerm = true;
                legRepurchaseTerm = getInt(buffer, valueOffset, endOfField, 251, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.LEG_REPURCHASE_RATE:
                hasLegRepurchaseRate = true;
                legRepurchaseRate = getFloat(buffer, legRepurchaseRate, valueOffset, valueLength, 252, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.LEG_FACTOR:
                hasLegFactor = true;
                legFactor = getFloat(buffer, legFactor, valueOffset, valueLength, 253, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.LEG_CREDIT_RATING:
                hasLegCreditRating = true;
                legCreditRating = buffer.getChars(legCreditRating, valueOffset, valueLength);
                legCreditRatingOffset = valueOffset;
                legCreditRatingLength = valueLength;
                break;

            case Constants.LEG_INSTR_REGISTRY:
                hasLegInstrRegistry = true;
                legInstrRegistry = buffer.getChars(legInstrRegistry, valueOffset, valueLength);
                legInstrRegistryOffset = valueOffset;
                legInstrRegistryLength = valueLength;
                break;

            case Constants.LEG_COUNTRY_OF_ISSUE:
                hasLegCountryOfIssue = true;
                legCountryOfIssue = buffer.getChars(legCountryOfIssue, valueOffset, valueLength);
                legCountryOfIssueOffset = valueOffset;
                legCountryOfIssueLength = valueLength;
                break;

            case Constants.LEG_STATE_OR_PROVINCE_OF_ISSUE:
                hasLegStateOrProvinceOfIssue = true;
                legStateOrProvinceOfIssue = buffer.getChars(legStateOrProvinceOfIssue, valueOffset, valueLength);
                legStateOrProvinceOfIssueOffset = valueOffset;
                legStateOrProvinceOfIssueLength = valueLength;
                break;

            case Constants.LEG_LOCALE_OF_ISSUE:
                hasLegLocaleOfIssue = true;
                legLocaleOfIssue = buffer.getChars(legLocaleOfIssue, valueOffset, valueLength);
                legLocaleOfIssueOffset = valueOffset;
                legLocaleOfIssueLength = valueLength;
                break;

            case Constants.LEG_REDEMPTION_DATE:
                hasLegRedemptionDate = true;
                legRedemptionDate = buffer.getBytes(legRedemptionDate, valueOffset, valueLength);
                legRedemptionDateOffset = valueOffset;
                legRedemptionDateLength = valueLength;
                break;

            case Constants.LEG_STRIKE_PRICE:
                hasLegStrikePrice = true;
                legStrikePrice = getFloat(buffer, legStrikePrice, valueOffset, valueLength, 612, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.LEG_STRIKE_CURRENCY:
                hasLegStrikeCurrency = true;
                legStrikeCurrency = buffer.getChars(legStrikeCurrency, valueOffset, valueLength);
                legStrikeCurrencyOffset = valueOffset;
                legStrikeCurrencyLength = valueLength;
                break;

            case Constants.LEG_OPT_ATTRIBUTE:
                hasLegOptAttribute = true;
                legOptAttribute = buffer.getChar(valueOffset);
                break;

            case Constants.LEG_CONTRACT_MULTIPLIER:
                hasLegContractMultiplier = true;
                legContractMultiplier = getFloat(buffer, legContractMultiplier, valueOffset, valueLength, 614, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.LEG_COUPON_RATE:
                hasLegCouponRate = true;
                legCouponRate = getFloat(buffer, legCouponRate, valueOffset, valueLength, 615, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.LEG_SECURITY_EXCHANGE:
                hasLegSecurityExchange = true;
                legSecurityExchange = buffer.getChars(legSecurityExchange, valueOffset, valueLength);
                legSecurityExchangeOffset = valueOffset;
                legSecurityExchangeLength = valueLength;
                break;

            case Constants.LEG_ISSUER:
                hasLegIssuer = true;
                legIssuer = buffer.getChars(legIssuer, valueOffset, valueLength);
                legIssuerOffset = valueOffset;
                legIssuerLength = valueLength;
                break;

            case Constants.ENCODED_LEG_ISSUER_LEN:
                hasEncodedLegIssuerLen = true;
                encodedLegIssuerLen = getInt(buffer, valueOffset, endOfField, 618, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.ENCODED_LEG_ISSUER:
                hasEncodedLegIssuer = true;
                encodedLegIssuer = buffer.getBytes(encodedLegIssuer, valueOffset, encodedLegIssuerLen);
                endOfField = valueOffset + encodedLegIssuerLen;
                break;

            case Constants.LEG_SECURITY_DESC:
                hasLegSecurityDesc = true;
                legSecurityDesc = buffer.getChars(legSecurityDesc, valueOffset, valueLength);
                legSecurityDescOffset = valueOffset;
                legSecurityDescLength = valueLength;
                break;

            case Constants.ENCODED_LEG_SECURITY_DESC_LEN:
                hasEncodedLegSecurityDescLen = true;
                encodedLegSecurityDescLen = getInt(buffer, valueOffset, endOfField, 621, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.ENCODED_LEG_SECURITY_DESC:
                hasEncodedLegSecurityDesc = true;
                encodedLegSecurityDesc = buffer.getBytes(encodedLegSecurityDesc, valueOffset, encodedLegSecurityDescLen);
                endOfField = valueOffset + encodedLegSecurityDescLen;
                break;

            case Constants.LEG_RATIO_QTY:
                hasLegRatioQty = true;
                legRatioQty = getFloat(buffer, legRatioQty, valueOffset, valueLength, 623, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.LEG_SIDE:
                hasLegSide = true;
                legSide = buffer.getChar(valueOffset);
                break;

            case Constants.LEG_CURRENCY:
                hasLegCurrency = true;
                legCurrency = buffer.getChars(legCurrency, valueOffset, valueLength);
                legCurrencyOffset = valueOffset;
                legCurrencyLength = valueLength;
                break;

            case Constants.LEG_POOL:
                hasLegPool = true;
                legPool = buffer.getChars(legPool, valueOffset, valueLength);
                legPoolOffset = valueOffset;
                legPoolLength = valueLength;
                break;

            case Constants.LEG_DATED_DATE:
                hasLegDatedDate = true;
                legDatedDate = buffer.getBytes(legDatedDate, valueOffset, valueLength);
                legDatedDateOffset = valueOffset;
                legDatedDateLength = valueLength;
                break;

            case Constants.LEG_CONTRACT_SETTL_MONTH:
                hasLegContractSettlMonth = true;
                legContractSettlMonth = buffer.getBytes(legContractSettlMonth, valueOffset, valueLength);
                legContractSettlMonthOffset = valueOffset;
                legContractSettlMonthLength = valueLength;
                break;

            case Constants.LEG_INTEREST_ACCRUAL_DATE:
                hasLegInterestAccrualDate = true;
                legInterestAccrualDate = buffer.getBytes(legInterestAccrualDate, valueOffset, valueLength);
                legInterestAccrualDateOffset = valueOffset;
                legInterestAccrualDateLength = valueLength;
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
        this.resetLegSymbol();
        this.resetLegSymbolSfx();
        this.resetLegSecurityID();
        this.resetLegSecurityIDSource();
        this.resetLegProduct();
        this.resetLegCFICode();
        this.resetLegSecurityType();
        this.resetLegSecuritySubType();
        this.resetLegMaturityMonthYear();
        this.resetLegMaturityDate();
        this.resetLegCouponPaymentDate();
        this.resetLegIssueDate();
        this.resetLegRepoCollateralSecurityType();
        this.resetLegRepurchaseTerm();
        this.resetLegRepurchaseRate();
        this.resetLegFactor();
        this.resetLegCreditRating();
        this.resetLegInstrRegistry();
        this.resetLegCountryOfIssue();
        this.resetLegStateOrProvinceOfIssue();
        this.resetLegLocaleOfIssue();
        this.resetLegRedemptionDate();
        this.resetLegStrikePrice();
        this.resetLegStrikeCurrency();
        this.resetLegOptAttribute();
        this.resetLegContractMultiplier();
        this.resetLegCouponRate();
        this.resetLegSecurityExchange();
        this.resetLegIssuer();
        this.resetEncodedLegIssuerLen();
        this.resetEncodedLegIssuer();
        this.resetLegSecurityDesc();
        this.resetEncodedLegSecurityDescLen();
        this.resetEncodedLegSecurityDesc();
        this.resetLegRatioQty();
        this.resetLegSide();
        this.resetLegCurrency();
        this.resetLegPool();
        this.resetLegDatedDate();
        this.resetLegContractSettlMonth();
        this.resetLegInterestAccrualDate();
        this.resetLegSecurityAltIDGroup();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetLegSymbol()
    {
        hasLegSymbol = false;
    }

    public void resetLegSymbolSfx()
    {
        hasLegSymbolSfx = false;
    }

    public void resetLegSecurityID()
    {
        hasLegSecurityID = false;
    }

    public void resetLegSecurityIDSource()
    {
        hasLegSecurityIDSource = false;
    }

    public void resetLegProduct()
    {
        hasLegProduct = false;
    }

    public void resetLegCFICode()
    {
        hasLegCFICode = false;
    }

    public void resetLegSecurityType()
    {
        hasLegSecurityType = false;
    }

    public void resetLegSecuritySubType()
    {
        hasLegSecuritySubType = false;
    }

    public void resetLegMaturityMonthYear()
    {
        hasLegMaturityMonthYear = false;
    }

    public void resetLegMaturityDate()
    {
        hasLegMaturityDate = false;
    }

    public void resetLegCouponPaymentDate()
    {
        hasLegCouponPaymentDate = false;
    }

    public void resetLegIssueDate()
    {
        hasLegIssueDate = false;
    }

    public void resetLegRepoCollateralSecurityType()
    {
        hasLegRepoCollateralSecurityType = false;
    }

    public void resetLegRepurchaseTerm()
    {
        hasLegRepurchaseTerm = false;
    }

    public void resetLegRepurchaseRate()
    {
        hasLegRepurchaseRate = false;
    }

    public void resetLegFactor()
    {
        hasLegFactor = false;
    }

    public void resetLegCreditRating()
    {
        hasLegCreditRating = false;
    }

    public void resetLegInstrRegistry()
    {
        hasLegInstrRegistry = false;
    }

    public void resetLegCountryOfIssue()
    {
        hasLegCountryOfIssue = false;
    }

    public void resetLegStateOrProvinceOfIssue()
    {
        hasLegStateOrProvinceOfIssue = false;
    }

    public void resetLegLocaleOfIssue()
    {
        hasLegLocaleOfIssue = false;
    }

    public void resetLegRedemptionDate()
    {
        hasLegRedemptionDate = false;
    }

    public void resetLegStrikePrice()
    {
        hasLegStrikePrice = false;
    }

    public void resetLegStrikeCurrency()
    {
        hasLegStrikeCurrency = false;
    }

    public void resetLegOptAttribute()
    {
        hasLegOptAttribute = false;
    }

    public void resetLegContractMultiplier()
    {
        hasLegContractMultiplier = false;
    }

    public void resetLegCouponRate()
    {
        hasLegCouponRate = false;
    }

    public void resetLegSecurityExchange()
    {
        hasLegSecurityExchange = false;
    }

    public void resetLegIssuer()
    {
        hasLegIssuer = false;
    }

    public void resetEncodedLegIssuerLen()
    {
        hasEncodedLegIssuerLen = false;
    }

    public void resetEncodedLegIssuer()
    {
        hasEncodedLegIssuer = false;
    }

    public void resetLegSecurityDesc()
    {
        hasLegSecurityDesc = false;
    }

    public void resetEncodedLegSecurityDescLen()
    {
        hasEncodedLegSecurityDescLen = false;
    }

    public void resetEncodedLegSecurityDesc()
    {
        hasEncodedLegSecurityDesc = false;
    }

    public void resetLegRatioQty()
    {
        hasLegRatioQty = false;
    }

    public void resetLegSide()
    {
        hasLegSide = false;
    }

    public void resetLegCurrency()
    {
        hasLegCurrency = false;
    }

    public void resetLegPool()
    {
        hasLegPool = false;
    }

    public void resetLegDatedDate()
    {
        hasLegDatedDate = false;
    }

    public void resetLegContractSettlMonth()
    {
        hasLegContractSettlMonth = false;
    }

    public void resetLegInterestAccrualDate()
    {
        hasLegInterestAccrualDate = false;
    }

    public void resetLegSecurityAltIDGroup()
    {
        for (final LegSecurityAltIDGroupDecoder legSecurityAltIDGroupDecoder : legSecurityAltIDGroupIterator.iterator())
        {
            legSecurityAltIDGroupDecoder.reset();
            if (legSecurityAltIDGroupDecoder.next() == null)
            {
                break;
            }
        }
        noLegSecurityAltIDGroupCounter = MISSING_INT;
        hasNoLegSecurityAltIDGroupCounter = false;
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
        builder.append("\"MessageName\": \"LegsGroup\",\n");
        if (hasLegSymbol())
        {
            indent(builder, level);
            builder.append("\"LegSymbol\": \"");
            builder.append(this.legSymbol(), 0, legSymbolLength());
            builder.append("\",\n");
        }

        if (hasLegSymbolSfx())
        {
            indent(builder, level);
            builder.append("\"LegSymbolSfx\": \"");
            builder.append(this.legSymbolSfx(), 0, legSymbolSfxLength());
            builder.append("\",\n");
        }

        if (hasLegSecurityID())
        {
            indent(builder, level);
            builder.append("\"LegSecurityID\": \"");
            builder.append(this.legSecurityID(), 0, legSecurityIDLength());
            builder.append("\",\n");
        }

        if (hasLegSecurityIDSource())
        {
            indent(builder, level);
            builder.append("\"LegSecurityIDSource\": \"");
            builder.append(this.legSecurityIDSource(), 0, legSecurityIDSourceLength());
            builder.append("\",\n");
        }

        if (hasNoLegSecurityAltIDGroupCounter)
        {
            indent(builder, level);
            builder.append("\"LegSecurityAltIDGroup\": [\n");
            LegSecurityAltIDGroupDecoder legSecurityAltIDGroup = this.legSecurityAltIDGroup;
            for (int i = 0, size = this.noLegSecurityAltIDGroupCounter; i < size; i++)
            {
                indent(builder, level);
                legSecurityAltIDGroup.appendTo(builder, level + 1);
                if (legSecurityAltIDGroup.next() != null)
                {
                    builder.append(',');
                }
                builder.append('\n');
                legSecurityAltIDGroup = legSecurityAltIDGroup.next();            }
            indent(builder, level);
            builder.append("],\n");
        }

        if (hasLegProduct())
        {
            indent(builder, level);
            builder.append("\"LegProduct\": \"");
            builder.append(legProduct);
            builder.append("\",\n");
        }

        if (hasLegCFICode())
        {
            indent(builder, level);
            builder.append("\"LegCFICode\": \"");
            builder.append(this.legCFICode(), 0, legCFICodeLength());
            builder.append("\",\n");
        }

        if (hasLegSecurityType())
        {
            indent(builder, level);
            builder.append("\"LegSecurityType\": \"");
            builder.append(this.legSecurityType(), 0, legSecurityTypeLength());
            builder.append("\",\n");
        }

        if (hasLegSecuritySubType())
        {
            indent(builder, level);
            builder.append("\"LegSecuritySubType\": \"");
            builder.append(this.legSecuritySubType(), 0, legSecuritySubTypeLength());
            builder.append("\",\n");
        }

        if (hasLegMaturityMonthYear())
        {
            indent(builder, level);
            builder.append("\"LegMaturityMonthYear\": \"");
            appendData(builder, legMaturityMonthYear, legMaturityMonthYearLength);
            builder.append("\",\n");
        }

        if (hasLegMaturityDate())
        {
            indent(builder, level);
            builder.append("\"LegMaturityDate\": \"");
            appendData(builder, legMaturityDate, legMaturityDateLength);
            builder.append("\",\n");
        }

        if (hasLegCouponPaymentDate())
        {
            indent(builder, level);
            builder.append("\"LegCouponPaymentDate\": \"");
            appendData(builder, legCouponPaymentDate, legCouponPaymentDateLength);
            builder.append("\",\n");
        }

        if (hasLegIssueDate())
        {
            indent(builder, level);
            builder.append("\"LegIssueDate\": \"");
            appendData(builder, legIssueDate, legIssueDateLength);
            builder.append("\",\n");
        }

        if (hasLegRepoCollateralSecurityType())
        {
            indent(builder, level);
            builder.append("\"LegRepoCollateralSecurityType\": \"");
            builder.append(this.legRepoCollateralSecurityType(), 0, legRepoCollateralSecurityTypeLength());
            builder.append("\",\n");
        }

        if (hasLegRepurchaseTerm())
        {
            indent(builder, level);
            builder.append("\"LegRepurchaseTerm\": \"");
            builder.append(legRepurchaseTerm);
            builder.append("\",\n");
        }

        if (hasLegRepurchaseRate())
        {
            indent(builder, level);
            builder.append("\"LegRepurchaseRate\": \"");
            legRepurchaseRate.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasLegFactor())
        {
            indent(builder, level);
            builder.append("\"LegFactor\": \"");
            legFactor.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasLegCreditRating())
        {
            indent(builder, level);
            builder.append("\"LegCreditRating\": \"");
            builder.append(this.legCreditRating(), 0, legCreditRatingLength());
            builder.append("\",\n");
        }

        if (hasLegInstrRegistry())
        {
            indent(builder, level);
            builder.append("\"LegInstrRegistry\": \"");
            builder.append(this.legInstrRegistry(), 0, legInstrRegistryLength());
            builder.append("\",\n");
        }

        if (hasLegCountryOfIssue())
        {
            indent(builder, level);
            builder.append("\"LegCountryOfIssue\": \"");
            builder.append(this.legCountryOfIssue(), 0, legCountryOfIssueLength());
            builder.append("\",\n");
        }

        if (hasLegStateOrProvinceOfIssue())
        {
            indent(builder, level);
            builder.append("\"LegStateOrProvinceOfIssue\": \"");
            builder.append(this.legStateOrProvinceOfIssue(), 0, legStateOrProvinceOfIssueLength());
            builder.append("\",\n");
        }

        if (hasLegLocaleOfIssue())
        {
            indent(builder, level);
            builder.append("\"LegLocaleOfIssue\": \"");
            builder.append(this.legLocaleOfIssue(), 0, legLocaleOfIssueLength());
            builder.append("\",\n");
        }

        if (hasLegRedemptionDate())
        {
            indent(builder, level);
            builder.append("\"LegRedemptionDate\": \"");
            appendData(builder, legRedemptionDate, legRedemptionDateLength);
            builder.append("\",\n");
        }

        if (hasLegStrikePrice())
        {
            indent(builder, level);
            builder.append("\"LegStrikePrice\": \"");
            legStrikePrice.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasLegStrikeCurrency())
        {
            indent(builder, level);
            builder.append("\"LegStrikeCurrency\": \"");
            builder.append(this.legStrikeCurrency(), 0, legStrikeCurrencyLength());
            builder.append("\",\n");
        }

        if (hasLegOptAttribute())
        {
            indent(builder, level);
            builder.append("\"LegOptAttribute\": \"");
            builder.append(legOptAttribute);
            builder.append("\",\n");
        }

        if (hasLegContractMultiplier())
        {
            indent(builder, level);
            builder.append("\"LegContractMultiplier\": \"");
            legContractMultiplier.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasLegCouponRate())
        {
            indent(builder, level);
            builder.append("\"LegCouponRate\": \"");
            legCouponRate.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasLegSecurityExchange())
        {
            indent(builder, level);
            builder.append("\"LegSecurityExchange\": \"");
            builder.append(this.legSecurityExchange(), 0, legSecurityExchangeLength());
            builder.append("\",\n");
        }

        if (hasLegIssuer())
        {
            indent(builder, level);
            builder.append("\"LegIssuer\": \"");
            builder.append(this.legIssuer(), 0, legIssuerLength());
            builder.append("\",\n");
        }

        if (hasEncodedLegIssuerLen())
        {
            indent(builder, level);
            builder.append("\"EncodedLegIssuerLen\": \"");
            builder.append(encodedLegIssuerLen);
            builder.append("\",\n");
        }

        if (hasEncodedLegIssuer())
        {
            indent(builder, level);
            builder.append("\"EncodedLegIssuer\": \"");
            appendData(builder, encodedLegIssuer, encodedLegIssuerLen);
            builder.append("\",\n");
        }

        if (hasLegSecurityDesc())
        {
            indent(builder, level);
            builder.append("\"LegSecurityDesc\": \"");
            builder.append(this.legSecurityDesc(), 0, legSecurityDescLength());
            builder.append("\",\n");
        }

        if (hasEncodedLegSecurityDescLen())
        {
            indent(builder, level);
            builder.append("\"EncodedLegSecurityDescLen\": \"");
            builder.append(encodedLegSecurityDescLen);
            builder.append("\",\n");
        }

        if (hasEncodedLegSecurityDesc())
        {
            indent(builder, level);
            builder.append("\"EncodedLegSecurityDesc\": \"");
            appendData(builder, encodedLegSecurityDesc, encodedLegSecurityDescLen);
            builder.append("\",\n");
        }

        if (hasLegRatioQty())
        {
            indent(builder, level);
            builder.append("\"LegRatioQty\": \"");
            legRatioQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasLegSide())
        {
            indent(builder, level);
            builder.append("\"LegSide\": \"");
            builder.append(legSide);
            builder.append("\",\n");
        }

        if (hasLegCurrency())
        {
            indent(builder, level);
            builder.append("\"LegCurrency\": \"");
            builder.append(this.legCurrency(), 0, legCurrencyLength());
            builder.append("\",\n");
        }

        if (hasLegPool())
        {
            indent(builder, level);
            builder.append("\"LegPool\": \"");
            builder.append(this.legPool(), 0, legPoolLength());
            builder.append("\",\n");
        }

        if (hasLegDatedDate())
        {
            indent(builder, level);
            builder.append("\"LegDatedDate\": \"");
            appendData(builder, legDatedDate, legDatedDateLength);
            builder.append("\",\n");
        }

        if (hasLegContractSettlMonth())
        {
            indent(builder, level);
            builder.append("\"LegContractSettlMonth\": \"");
            appendData(builder, legContractSettlMonth, legContractSettlMonthLength);
            builder.append("\",\n");
        }

        if (hasLegInterestAccrualDate())
        {
            indent(builder, level);
            builder.append("\"LegInterestAccrualDate\": \"");
            appendData(builder, legInterestAccrualDate, legInterestAccrualDateLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public TradeCaptureReportRequestEncoder.LegsGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((TradeCaptureReportRequestEncoder.LegsGroupEncoder)encoder);
    }

    public TradeCaptureReportRequestEncoder.LegsGroupEncoder toEncoder(final TradeCaptureReportRequestEncoder.LegsGroupEncoder encoder)
    {
        encoder.reset();

        final InstrumentLegEncoder instrumentLeg = encoder.instrumentLeg();        if (hasLegSymbol())
        {
            instrumentLeg.legSymbol(this.legSymbol(), 0, legSymbolLength());
        }

        if (hasLegSymbolSfx())
        {
            instrumentLeg.legSymbolSfx(this.legSymbolSfx(), 0, legSymbolSfxLength());
        }

        if (hasLegSecurityID())
        {
            instrumentLeg.legSecurityID(this.legSecurityID(), 0, legSecurityIDLength());
        }

        if (hasLegSecurityIDSource())
        {
            instrumentLeg.legSecurityIDSource(this.legSecurityIDSource(), 0, legSecurityIDSourceLength());
        }

        if (hasNoLegSecurityAltIDGroupCounter)
        {
            final int size = this.noLegSecurityAltIDGroupCounter;
            LegSecurityAltIDGroupDecoder legSecurityAltIDGroup = this.legSecurityAltIDGroup;
            LegSecurityAltIDGroupEncoder legSecurityAltIDGroupEncoder = instrumentLeg.legSecurityAltIDGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (legSecurityAltIDGroup != null)
                {
                    legSecurityAltIDGroup.toEncoder(legSecurityAltIDGroupEncoder);
                    legSecurityAltIDGroup = legSecurityAltIDGroup.next();
                    legSecurityAltIDGroupEncoder = legSecurityAltIDGroupEncoder.next();
                }
            }
        }

        if (hasLegProduct())
        {
            instrumentLeg.legProduct(this.legProduct());
        }

        if (hasLegCFICode())
        {
            instrumentLeg.legCFICode(this.legCFICode(), 0, legCFICodeLength());
        }

        if (hasLegSecurityType())
        {
            instrumentLeg.legSecurityType(this.legSecurityType(), 0, legSecurityTypeLength());
        }

        if (hasLegSecuritySubType())
        {
            instrumentLeg.legSecuritySubType(this.legSecuritySubType(), 0, legSecuritySubTypeLength());
        }

        if (hasLegMaturityMonthYear())
        {
            instrumentLeg.legMaturityMonthYearAsCopy(this.legMaturityMonthYear(), 0, legMaturityMonthYearLength());
        }

        if (hasLegMaturityDate())
        {
            instrumentLeg.legMaturityDateAsCopy(this.legMaturityDate(), 0, legMaturityDateLength());
        }

        if (hasLegCouponPaymentDate())
        {
            instrumentLeg.legCouponPaymentDateAsCopy(this.legCouponPaymentDate(), 0, legCouponPaymentDateLength());
        }

        if (hasLegIssueDate())
        {
            instrumentLeg.legIssueDateAsCopy(this.legIssueDate(), 0, legIssueDateLength());
        }

        if (hasLegRepoCollateralSecurityType())
        {
            instrumentLeg.legRepoCollateralSecurityType(this.legRepoCollateralSecurityType(), 0, legRepoCollateralSecurityTypeLength());
        }

        if (hasLegRepurchaseTerm())
        {
            instrumentLeg.legRepurchaseTerm(this.legRepurchaseTerm());
        }

        if (hasLegRepurchaseRate())
        {
            instrumentLeg.legRepurchaseRate(this.legRepurchaseRate());
        }

        if (hasLegFactor())
        {
            instrumentLeg.legFactor(this.legFactor());
        }

        if (hasLegCreditRating())
        {
            instrumentLeg.legCreditRating(this.legCreditRating(), 0, legCreditRatingLength());
        }

        if (hasLegInstrRegistry())
        {
            instrumentLeg.legInstrRegistry(this.legInstrRegistry(), 0, legInstrRegistryLength());
        }

        if (hasLegCountryOfIssue())
        {
            instrumentLeg.legCountryOfIssue(this.legCountryOfIssue(), 0, legCountryOfIssueLength());
        }

        if (hasLegStateOrProvinceOfIssue())
        {
            instrumentLeg.legStateOrProvinceOfIssue(this.legStateOrProvinceOfIssue(), 0, legStateOrProvinceOfIssueLength());
        }

        if (hasLegLocaleOfIssue())
        {
            instrumentLeg.legLocaleOfIssue(this.legLocaleOfIssue(), 0, legLocaleOfIssueLength());
        }

        if (hasLegRedemptionDate())
        {
            instrumentLeg.legRedemptionDateAsCopy(this.legRedemptionDate(), 0, legRedemptionDateLength());
        }

        if (hasLegStrikePrice())
        {
            instrumentLeg.legStrikePrice(this.legStrikePrice());
        }

        if (hasLegStrikeCurrency())
        {
            instrumentLeg.legStrikeCurrency(this.legStrikeCurrency(), 0, legStrikeCurrencyLength());
        }

        if (hasLegOptAttribute())
        {
            instrumentLeg.legOptAttribute(this.legOptAttribute());
        }

        if (hasLegContractMultiplier())
        {
            instrumentLeg.legContractMultiplier(this.legContractMultiplier());
        }

        if (hasLegCouponRate())
        {
            instrumentLeg.legCouponRate(this.legCouponRate());
        }

        if (hasLegSecurityExchange())
        {
            instrumentLeg.legSecurityExchange(this.legSecurityExchange(), 0, legSecurityExchangeLength());
        }

        if (hasLegIssuer())
        {
            instrumentLeg.legIssuer(this.legIssuer(), 0, legIssuerLength());
        }

        if (hasEncodedLegIssuerLen())
        {
            instrumentLeg.encodedLegIssuerLen(this.encodedLegIssuerLen());
        }

        if (hasEncodedLegIssuer())
        {
            instrumentLeg.encodedLegIssuerAsCopy(this.encodedLegIssuer(), 0, encodedLegIssuerLen());
            instrumentLeg.encodedLegIssuerLen(this.encodedLegIssuerLen());
        }

        if (hasLegSecurityDesc())
        {
            instrumentLeg.legSecurityDesc(this.legSecurityDesc(), 0, legSecurityDescLength());
        }

        if (hasEncodedLegSecurityDescLen())
        {
            instrumentLeg.encodedLegSecurityDescLen(this.encodedLegSecurityDescLen());
        }

        if (hasEncodedLegSecurityDesc())
        {
            instrumentLeg.encodedLegSecurityDescAsCopy(this.encodedLegSecurityDesc(), 0, encodedLegSecurityDescLen());
            instrumentLeg.encodedLegSecurityDescLen(this.encodedLegSecurityDescLen());
        }

        if (hasLegRatioQty())
        {
            instrumentLeg.legRatioQty(this.legRatioQty());
        }

        if (hasLegSide())
        {
            instrumentLeg.legSide(this.legSide());
        }

        if (hasLegCurrency())
        {
            instrumentLeg.legCurrency(this.legCurrency(), 0, legCurrencyLength());
        }

        if (hasLegPool())
        {
            instrumentLeg.legPool(this.legPool(), 0, legPoolLength());
        }

        if (hasLegDatedDate())
        {
            instrumentLeg.legDatedDateAsCopy(this.legDatedDate(), 0, legDatedDateLength());
        }

        if (hasLegContractSettlMonth())
        {
            instrumentLeg.legContractSettlMonthAsCopy(this.legContractSettlMonth(), 0, legContractSettlMonthLength());
        }

        if (hasLegInterestAccrualDate())
        {
            instrumentLeg.legInterestAccrualDateAsCopy(this.legInterestAccrualDate(), 0, legInterestAccrualDateLength());
        }

        return encoder;
    }

}
    public class LegsGroupIterator implements Iterable<LegsGroupDecoder>, java.util.Iterator<LegsGroupDecoder>
    {
        private final TradeCaptureReportRequestDecoder parent;
        private int remainder;
        private LegsGroupDecoder current;

        public LegsGroupIterator(final TradeCaptureReportRequestDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }

        public LegsGroupDecoder next()
        {
            remainder--;
            final LegsGroupDecoder value = current;
            current = current.next();
            return value;
        }

        public int numberFieldValue()
        {
            return parent.hasNoLegsGroupCounter() ? parent.noLegsGroupCounter() : 0;
        }

        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.legsGroup();
        }

        public LegsGroupIterator iterator()
        {
            reset();
            return this;
        }

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



public class DatesGroupDecoder extends CommonDecoderImpl
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(0);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
        }
    }

    public final IntHashSet ALL_GROUP_FIELDS = new IntHashSet(4);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            ALL_GROUP_FIELDS.add(Constants.TRADE_DATE);
            ALL_GROUP_FIELDS.add(Constants.TRANSACT_TIME);
        }
    }

    private final IntHashSet missingRequiredFields = new IntHashSet(0);

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
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public DatesGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private DatesGroupDecoder next = null;

    public DatesGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(4);

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


    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode DatesGroup
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
                    next = new DatesGroupDecoder(trailer, messageFields);
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
            case Constants.TRADE_DATE:
                hasTradeDate = true;
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
        this.resetTradeDate();
        this.resetTransactTime();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetTradeDate()
    {
        hasTradeDate = false;
    }

    public void resetTransactTime()
    {
        hasTransactTime = false;
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
        builder.append("\"MessageName\": \"DatesGroup\",\n");
        if (hasTradeDate())
        {
            indent(builder, level);
            builder.append("\"TradeDate\": \"");
            appendData(builder, tradeDate, tradeDateLength);
            builder.append("\",\n");
        }

        if (hasTransactTime())
        {
            indent(builder, level);
            builder.append("\"TransactTime\": \"");
            appendData(builder, transactTime, transactTimeLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public TradeCaptureReportRequestEncoder.DatesGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((TradeCaptureReportRequestEncoder.DatesGroupEncoder)encoder);
    }

    public TradeCaptureReportRequestEncoder.DatesGroupEncoder toEncoder(final TradeCaptureReportRequestEncoder.DatesGroupEncoder encoder)
    {
        encoder.reset();
        if (hasTradeDate())
        {
            encoder.tradeDateAsCopy(this.tradeDate(), 0, tradeDateLength());
        }

        if (hasTransactTime())
        {
            encoder.transactTimeAsCopy(this.transactTime(), 0, transactTimeLength());
        }
        return encoder;
    }

}
    public class DatesGroupIterator implements Iterable<DatesGroupDecoder>, java.util.Iterator<DatesGroupDecoder>
    {
        private final TradeCaptureReportRequestDecoder parent;
        private int remainder;
        private DatesGroupDecoder current;

        public DatesGroupIterator(final TradeCaptureReportRequestDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }

        public DatesGroupDecoder next()
        {
            remainder--;
            final DatesGroupDecoder value = current;
            current = current.next();
            return value;
        }

        public int numberFieldValue()
        {
            return parent.hasNoDatesGroupCounter() ? parent.noDatesGroupCounter() : 0;
        }

        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.datesGroup();
        }

        public DatesGroupIterator iterator()
        {
            reset();
            return this;
        }

    }


    private DatesGroupDecoder datesGroup = null;
    public DatesGroupDecoder datesGroup()
    {
        return datesGroup;
    }

    private int noDatesGroupCounter = MISSING_INT;

    private boolean hasNoDatesGroupCounter;

    public int noDatesGroupCounter()
    {
        if (!hasNoDatesGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoDatesGroupCounter");
        }

        return noDatesGroupCounter;
    }

    public boolean hasNoDatesGroupCounter()
    {
        return hasNoDatesGroupCounter;
    }




    private DatesGroupIterator datesGroupIterator = new DatesGroupIterator(this);
    public DatesGroupIterator datesGroupIterator()
    {
        return datesGroupIterator.iterator();
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
    private char[] timeBracket = new char[1];

    private boolean hasTimeBracket;

    public char[] timeBracket()
    {
        if (!hasTimeBracket)
        {
            throw new IllegalArgumentException("No value for optional field: TimeBracket");
        }

        return timeBracket;
    }

    public boolean hasTimeBracket()
    {
        return hasTimeBracket;
    }


    private int timeBracketOffset;

    private int timeBracketLength;

    public int timeBracketLength()
    {
        if (!hasTimeBracket)
        {
            throw new IllegalArgumentException("No value for optional field: TimeBracket");
        }

        return timeBracketLength;
    }

    public String timeBracketAsString()
    {
        return hasTimeBracket ? new String(timeBracket, 0, timeBracketLength) : null;
    }

    public void timeBracket(final AsciiSequenceView view)
    {
        if (!hasTimeBracket)
        {
            throw new IllegalArgumentException("No value for optional field: TimeBracket");
        }

        view.wrap(buffer, timeBracketOffset, timeBracketLength);
    }


    private final CharArrayWrapper timeBracketWrapper = new CharArrayWrapper();
    private char side = MISSING_CHAR;

    private boolean hasSide;

    public char side()
    {
        if (!hasSide)
        {
            throw new IllegalArgumentException("No value for optional field: Side");
        }

        return side;
    }

    public boolean hasSide()
    {
        return hasSide;
    }



    private final CharArrayWrapper sideWrapper = new CharArrayWrapper();
    public Side sideAsEnum()
    {
        if (!hasSide)
 return Side.NULL_VAL;
        return Side.decode(side);
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
    private char[] tradeInputDevice = new char[1];

    private boolean hasTradeInputDevice;

    public char[] tradeInputDevice()
    {
        if (!hasTradeInputDevice)
        {
            throw new IllegalArgumentException("No value for optional field: TradeInputDevice");
        }

        return tradeInputDevice;
    }

    public boolean hasTradeInputDevice()
    {
        return hasTradeInputDevice;
    }


    private int tradeInputDeviceOffset;

    private int tradeInputDeviceLength;

    public int tradeInputDeviceLength()
    {
        if (!hasTradeInputDevice)
        {
            throw new IllegalArgumentException("No value for optional field: TradeInputDevice");
        }

        return tradeInputDeviceLength;
    }

    public String tradeInputDeviceAsString()
    {
        return hasTradeInputDevice ? new String(tradeInputDevice, 0, tradeInputDeviceLength) : null;
    }

    public void tradeInputDevice(final AsciiSequenceView view)
    {
        if (!hasTradeInputDevice)
        {
            throw new IllegalArgumentException("No value for optional field: TradeInputDevice");
        }

        view.wrap(buffer, tradeInputDeviceOffset, tradeInputDeviceLength);
    }


    private final CharArrayWrapper tradeInputDeviceWrapper = new CharArrayWrapper();
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



    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode TradeCaptureReportRequest
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
            case Constants.TRADE_REQUEST_ID:
                tradeRequestID = buffer.getChars(tradeRequestID, valueOffset, valueLength);
                tradeRequestIDOffset = valueOffset;
                tradeRequestIDLength = valueLength;
                break;

            case Constants.TRADE_REQUEST_TYPE:
                tradeRequestType = getInt(buffer, valueOffset, endOfField, 569, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.SUBSCRIPTION_REQUEST_TYPE:
                hasSubscriptionRequestType = true;
                subscriptionRequestType = buffer.getChar(valueOffset);
                break;

            case Constants.TRADE_REPORT_ID:
                hasTradeReportID = true;
                tradeReportID = buffer.getChars(tradeReportID, valueOffset, valueLength);
                tradeReportIDOffset = valueOffset;
                tradeReportIDLength = valueLength;
                break;

            case Constants.SECONDARY_TRADE_REPORT_ID:
                hasSecondaryTradeReportID = true;
                secondaryTradeReportID = buffer.getChars(secondaryTradeReportID, valueOffset, valueLength);
                secondaryTradeReportIDOffset = valueOffset;
                secondaryTradeReportIDLength = valueLength;
                break;

            case Constants.EXEC_ID:
                hasExecID = true;
                execID = buffer.getChars(execID, valueOffset, valueLength);
                execIDOffset = valueOffset;
                execIDLength = valueLength;
                break;

            case Constants.EXEC_TYPE:
                hasExecType = true;
                execType = buffer.getChar(valueOffset);
                break;

            case Constants.ORDER_ID:
                hasOrderID = true;
                orderID = buffer.getChars(orderID, valueOffset, valueLength);
                orderIDOffset = valueOffset;
                orderIDLength = valueLength;
                break;

            case Constants.CL_ORD_ID:
                hasClOrdID = true;
                clOrdID = buffer.getChars(clOrdID, valueOffset, valueLength);
                clOrdIDOffset = valueOffset;
                clOrdIDLength = valueLength;
                break;

            case Constants.MATCH_STATUS:
                hasMatchStatus = true;
                matchStatus = buffer.getChar(valueOffset);
                break;

            case Constants.TRD_TYPE:
                hasTrdType = true;
                trdType = getInt(buffer, valueOffset, endOfField, 828, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.TRD_SUB_TYPE:
                hasTrdSubType = true;
                trdSubType = getInt(buffer, valueOffset, endOfField, 829, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.TRANSFER_REASON:
                hasTransferReason = true;
                transferReason = buffer.getChars(transferReason, valueOffset, valueLength);
                transferReasonOffset = valueOffset;
                transferReasonLength = valueLength;
                break;

            case Constants.SECONDARY_TRD_TYPE:
                hasSecondaryTrdType = true;
                secondaryTrdType = getInt(buffer, valueOffset, endOfField, 855, CODEC_VALIDATION_ENABLED);
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


            case Constants.SYMBOL:
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

            case Constants.PUT_OR_CALL:
                hasPutOrCall = true;
                putOrCall = getInt(buffer, valueOffset, endOfField, 201, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.COUPON_PAYMENT_DATE:
                hasCouponPaymentDate = true;
                couponPaymentDate = buffer.getBytes(couponPaymentDate, valueOffset, valueLength);
                couponPaymentDateOffset = valueOffset;
                couponPaymentDateLength = valueLength;
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

            case Constants.OPT_ATTRIBUTE:
                hasOptAttribute = true;
                optAttribute = buffer.getChar(valueOffset);
                break;

            case Constants.CONTRACT_MULTIPLIER:
                hasContractMultiplier = true;
                contractMultiplier = getFloat(buffer, contractMultiplier, valueOffset, valueLength, 231, CODEC_VALIDATION_ENABLED);
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

            case Constants.NO_DATES_GROUP_COUNTER:
                hasNoDatesGroupCounter = true;
                noDatesGroupCounter = getInt(buffer, valueOffset, endOfField, 580, CODEC_VALIDATION_ENABLED);
                if (datesGroup == null)
                {
                    datesGroup = new DatesGroupDecoder(trailer, messageFields);
                }
                DatesGroupDecoder datesGroupCurrent = datesGroup;
                position = endOfField + 1;
                final int noDatesGroupCounter = this.noDatesGroupCounter;
                for (int i = 0; i < noDatesGroupCounter && position < end; i++)
                {
                    if (datesGroupCurrent != null)
                    {
                        position += datesGroupCurrent.decode(buffer, position, end - position);
                        datesGroupCurrent = datesGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (datesGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;

            case Constants.CLEARING_BUSINESS_DATE:
                hasClearingBusinessDate = true;
                clearingBusinessDate = buffer.getBytes(clearingBusinessDate, valueOffset, valueLength);
                clearingBusinessDateOffset = valueOffset;
                clearingBusinessDateLength = valueLength;
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

            case Constants.TIME_BRACKET:
                hasTimeBracket = true;
                timeBracket = buffer.getChars(timeBracket, valueOffset, valueLength);
                timeBracketOffset = valueOffset;
                timeBracketLength = valueLength;
                break;

            case Constants.SIDE:
                hasSide = true;
                side = buffer.getChar(valueOffset);
                break;

            case Constants.MULTI_LEG_REPORTING_TYPE:
                hasMultiLegReportingType = true;
                multiLegReportingType = buffer.getChar(valueOffset);
                break;

            case Constants.TRADE_INPUT_SOURCE:
                hasTradeInputSource = true;
                tradeInputSource = buffer.getChars(tradeInputSource, valueOffset, valueLength);
                tradeInputSourceOffset = valueOffset;
                tradeInputSourceLength = valueLength;
                break;

            case Constants.TRADE_INPUT_DEVICE:
                hasTradeInputDevice = true;
                tradeInputDevice = buffer.getChars(tradeInputDevice, valueOffset, valueLength);
                tradeInputDeviceOffset = valueOffset;
                tradeInputDeviceLength = valueLength;
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
        this.resetTradeRequestID();
        this.resetTradeRequestType();
        this.resetSubscriptionRequestType();
        this.resetTradeReportID();
        this.resetSecondaryTradeReportID();
        this.resetExecID();
        this.resetExecType();
        this.resetOrderID();
        this.resetClOrdID();
        this.resetMatchStatus();
        this.resetTrdType();
        this.resetTrdSubType();
        this.resetTransferReason();
        this.resetSecondaryTrdType();
        this.resetTradeLinkID();
        this.resetTrdMatchID();
        this.resetClearingBusinessDate();
        this.resetTradingSessionID();
        this.resetTradingSessionSubID();
        this.resetTimeBracket();
        this.resetSide();
        this.resetMultiLegReportingType();
        this.resetTradeInputSource();
        this.resetTradeInputDevice();
        this.resetResponseTransportType();
        this.resetResponseDestination();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        this.resetPartyIDsGroup();
        this.resetSymbol();
        this.resetSymbolSfx();
        this.resetSecurityID();
        this.resetSecurityIDSource();
        this.resetProduct();
        this.resetCFICode();
        this.resetSecurityType();
        this.resetSecuritySubType();
        this.resetMaturityMonthYear();
        this.resetMaturityDate();
        this.resetPutOrCall();
        this.resetCouponPaymentDate();
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
        this.resetOptAttribute();
        this.resetContractMultiplier();
        this.resetCouponRate();
        this.resetSecurityExchange();
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
        this.resetEventsGroup();
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
        this.resetDatesGroup();
    }

    public void resetTradeRequestID()
    {
        tradeRequestIDOffset = 0;
        tradeRequestIDLength = 0;
    }

    public void resetTradeRequestType()
    {
        tradeRequestType = MISSING_INT;
    }

    public void resetSubscriptionRequestType()
    {
        hasSubscriptionRequestType = false;
    }

    public void resetTradeReportID()
    {
        hasTradeReportID = false;
    }

    public void resetSecondaryTradeReportID()
    {
        hasSecondaryTradeReportID = false;
    }

    public void resetExecID()
    {
        hasExecID = false;
    }

    public void resetExecType()
    {
        hasExecType = false;
    }

    public void resetOrderID()
    {
        hasOrderID = false;
    }

    public void resetClOrdID()
    {
        hasClOrdID = false;
    }

    public void resetMatchStatus()
    {
        hasMatchStatus = false;
    }

    public void resetTrdType()
    {
        hasTrdType = false;
    }

    public void resetTrdSubType()
    {
        hasTrdSubType = false;
    }

    public void resetTransferReason()
    {
        hasTransferReason = false;
    }

    public void resetSecondaryTrdType()
    {
        hasSecondaryTrdType = false;
    }

    public void resetTradeLinkID()
    {
        hasTradeLinkID = false;
    }

    public void resetTrdMatchID()
    {
        hasTrdMatchID = false;
    }

    public void resetClearingBusinessDate()
    {
        hasClearingBusinessDate = false;
    }

    public void resetTradingSessionID()
    {
        hasTradingSessionID = false;
    }

    public void resetTradingSessionSubID()
    {
        hasTradingSessionSubID = false;
    }

    public void resetTimeBracket()
    {
        hasTimeBracket = false;
    }

    public void resetSide()
    {
        hasSide = false;
    }

    public void resetMultiLegReportingType()
    {
        hasMultiLegReportingType = false;
    }

    public void resetTradeInputSource()
    {
        hasTradeInputSource = false;
    }

    public void resetTradeInputDevice()
    {
        hasTradeInputDevice = false;
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

    public void resetSymbol()
    {
        symbolOffset = 0;
        symbolLength = 0;
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

    public void resetPutOrCall()
    {
        hasPutOrCall = false;
    }

    public void resetCouponPaymentDate()
    {
        hasCouponPaymentDate = false;
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

    public void resetOptAttribute()
    {
        hasOptAttribute = false;
    }

    public void resetContractMultiplier()
    {
        hasContractMultiplier = false;
    }

    public void resetCouponRate()
    {
        hasCouponRate = false;
    }

    public void resetSecurityExchange()
    {
        hasSecurityExchange = false;
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

    public void resetDatesGroup()
    {
        for (final DatesGroupDecoder datesGroupDecoder : datesGroupIterator.iterator())
        {
            datesGroupDecoder.reset();
            if (datesGroupDecoder.next() == null)
            {
                break;
            }
        }
        noDatesGroupCounter = MISSING_INT;
        hasNoDatesGroupCounter = false;
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
        builder.append("\"MessageName\": \"TradeCaptureReportRequest\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        indent(builder, level);
        builder.append("\"TradeRequestID\": \"");
        builder.append(this.tradeRequestID(), 0, tradeRequestIDLength());
        builder.append("\",\n");

        indent(builder, level);
        builder.append("\"TradeRequestType\": \"");
        builder.append(tradeRequestType);
        builder.append("\",\n");

        if (hasSubscriptionRequestType())
        {
            indent(builder, level);
            builder.append("\"SubscriptionRequestType\": \"");
            builder.append(subscriptionRequestType);
            builder.append("\",\n");
        }

        if (hasTradeReportID())
        {
            indent(builder, level);
            builder.append("\"TradeReportID\": \"");
            builder.append(this.tradeReportID(), 0, tradeReportIDLength());
            builder.append("\",\n");
        }

        if (hasSecondaryTradeReportID())
        {
            indent(builder, level);
            builder.append("\"SecondaryTradeReportID\": \"");
            builder.append(this.secondaryTradeReportID(), 0, secondaryTradeReportIDLength());
            builder.append("\",\n");
        }

        if (hasExecID())
        {
            indent(builder, level);
            builder.append("\"ExecID\": \"");
            builder.append(this.execID(), 0, execIDLength());
            builder.append("\",\n");
        }

        if (hasExecType())
        {
            indent(builder, level);
            builder.append("\"ExecType\": \"");
            builder.append(execType);
            builder.append("\",\n");
        }

        if (hasOrderID())
        {
            indent(builder, level);
            builder.append("\"OrderID\": \"");
            builder.append(this.orderID(), 0, orderIDLength());
            builder.append("\",\n");
        }

        if (hasClOrdID())
        {
            indent(builder, level);
            builder.append("\"ClOrdID\": \"");
            builder.append(this.clOrdID(), 0, clOrdIDLength());
            builder.append("\",\n");
        }

        if (hasMatchStatus())
        {
            indent(builder, level);
            builder.append("\"MatchStatus\": \"");
            builder.append(matchStatus);
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

        if (hasTransferReason())
        {
            indent(builder, level);
            builder.append("\"TransferReason\": \"");
            builder.append(this.transferReason(), 0, transferReasonLength());
            builder.append("\",\n");
        }

        if (hasSecondaryTrdType())
        {
            indent(builder, level);
            builder.append("\"SecondaryTrdType\": \"");
            builder.append(secondaryTrdType);
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
        builder.append("\"Symbol\": \"");
        builder.append(this.symbol(), 0, symbolLength());
        builder.append("\",\n");

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

        if (hasPutOrCall())
        {
            indent(builder, level);
            builder.append("\"PutOrCall\": \"");
            builder.append(putOrCall);
            builder.append("\",\n");
        }

        if (hasCouponPaymentDate())
        {
            indent(builder, level);
            builder.append("\"CouponPaymentDate\": \"");
            appendData(builder, couponPaymentDate, couponPaymentDateLength);
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

        if (hasNoDatesGroupCounter)
        {
            indent(builder, level);
            builder.append("\"DatesGroup\": [\n");
            DatesGroupDecoder datesGroup = this.datesGroup;
            for (int i = 0, size = this.noDatesGroupCounter; i < size; i++)
            {
                indent(builder, level);
                datesGroup.appendTo(builder, level + 1);
                if (datesGroup.next() != null)
                {
                    builder.append(',');
                }
                builder.append('\n');
                datesGroup = datesGroup.next();            }
            indent(builder, level);
            builder.append("],\n");
        }

        if (hasClearingBusinessDate())
        {
            indent(builder, level);
            builder.append("\"ClearingBusinessDate\": \"");
            appendData(builder, clearingBusinessDate, clearingBusinessDateLength);
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

        if (hasTimeBracket())
        {
            indent(builder, level);
            builder.append("\"TimeBracket\": \"");
            builder.append(this.timeBracket(), 0, timeBracketLength());
            builder.append("\",\n");
        }

        if (hasSide())
        {
            indent(builder, level);
            builder.append("\"Side\": \"");
            builder.append(side);
            builder.append("\",\n");
        }

        if (hasMultiLegReportingType())
        {
            indent(builder, level);
            builder.append("\"MultiLegReportingType\": \"");
            builder.append(multiLegReportingType);
            builder.append("\",\n");
        }

        if (hasTradeInputSource())
        {
            indent(builder, level);
            builder.append("\"TradeInputSource\": \"");
            builder.append(this.tradeInputSource(), 0, tradeInputSourceLength());
            builder.append("\",\n");
        }

        if (hasTradeInputDevice())
        {
            indent(builder, level);
            builder.append("\"TradeInputDevice\": \"");
            builder.append(this.tradeInputDevice(), 0, tradeInputDeviceLength());
            builder.append("\",\n");
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
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public TradeCaptureReportRequestEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((TradeCaptureReportRequestEncoder)encoder);
    }

    public TradeCaptureReportRequestEncoder toEncoder(final TradeCaptureReportRequestEncoder encoder)
    {
        encoder.reset();
        encoder.tradeRequestID(this.tradeRequestID(), 0, tradeRequestIDLength());
        encoder.tradeRequestType(this.tradeRequestType());
        if (hasSubscriptionRequestType())
        {
            encoder.subscriptionRequestType(this.subscriptionRequestType());
        }

        if (hasTradeReportID())
        {
            encoder.tradeReportID(this.tradeReportID(), 0, tradeReportIDLength());
        }

        if (hasSecondaryTradeReportID())
        {
            encoder.secondaryTradeReportID(this.secondaryTradeReportID(), 0, secondaryTradeReportIDLength());
        }

        if (hasExecID())
        {
            encoder.execID(this.execID(), 0, execIDLength());
        }

        if (hasExecType())
        {
            encoder.execType(this.execType());
        }

        if (hasOrderID())
        {
            encoder.orderID(this.orderID(), 0, orderIDLength());
        }

        if (hasClOrdID())
        {
            encoder.clOrdID(this.clOrdID(), 0, clOrdIDLength());
        }

        if (hasMatchStatus())
        {
            encoder.matchStatus(this.matchStatus());
        }

        if (hasTrdType())
        {
            encoder.trdType(this.trdType());
        }

        if (hasTrdSubType())
        {
            encoder.trdSubType(this.trdSubType());
        }

        if (hasTransferReason())
        {
            encoder.transferReason(this.transferReason(), 0, transferReasonLength());
        }

        if (hasSecondaryTrdType())
        {
            encoder.secondaryTrdType(this.secondaryTrdType());
        }

        if (hasTradeLinkID())
        {
            encoder.tradeLinkID(this.tradeLinkID(), 0, tradeLinkIDLength());
        }

        if (hasTrdMatchID())
        {
            encoder.trdMatchID(this.trdMatchID(), 0, trdMatchIDLength());
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



        final InstrumentEncoder instrument = encoder.instrument();        instrument.symbol(this.symbol(), 0, symbolLength());
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

        if (hasNoSecurityAltIDGroupCounter)
        {
            final int size = this.noSecurityAltIDGroupCounter;
            SecurityAltIDGroupDecoder securityAltIDGroup = this.securityAltIDGroup;
            SecurityAltIDGroupEncoder securityAltIDGroupEncoder = instrument.securityAltIDGroup(size);
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

        if (hasPutOrCall())
        {
            instrument.putOrCall(this.putOrCall());
        }

        if (hasCouponPaymentDate())
        {
            instrument.couponPaymentDateAsCopy(this.couponPaymentDate(), 0, couponPaymentDateLength());
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

        if (hasOptAttribute())
        {
            instrument.optAttribute(this.optAttribute());
        }

        if (hasContractMultiplier())
        {
            instrument.contractMultiplier(this.contractMultiplier());
        }

        if (hasCouponRate())
        {
            instrument.couponRate(this.couponRate());
        }

        if (hasSecurityExchange())
        {
            instrument.securityExchange(this.securityExchange(), 0, securityExchangeLength());
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

        if (hasNoEventsGroupCounter)
        {
            final int size = this.noEventsGroupCounter;
            EventsGroupDecoder eventsGroup = this.eventsGroup;
            EventsGroupEncoder eventsGroupEncoder = instrument.eventsGroup(size);
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



        final InstrumentExtensionEncoder instrumentExtension = encoder.instrumentExtension();        if (hasDeliveryForm())
        {
            instrumentExtension.deliveryForm(this.deliveryForm());
        }

        if (hasPctAtRisk())
        {
            instrumentExtension.pctAtRisk(this.pctAtRisk());
        }

        if (hasNoInstrAttribGroupCounter)
        {
            final int size = this.noInstrAttribGroupCounter;
            InstrAttribGroupDecoder instrAttribGroup = this.instrAttribGroup;
            InstrAttribGroupEncoder instrAttribGroupEncoder = instrumentExtension.instrAttribGroup(size);
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


        if (hasNoUnderlyingsGroupCounter)
        {
            final int size = this.noUnderlyingsGroupCounter;
            UnderlyingsGroupDecoder underlyingsGroup = this.underlyingsGroup;
            UnderlyingsGroupEncoder underlyingsGroupEncoder = encoder.underlyingsGroup(size);
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

        if (hasNoLegsGroupCounter)
        {
            final int size = this.noLegsGroupCounter;
            LegsGroupDecoder legsGroup = this.legsGroup;
            LegsGroupEncoder legsGroupEncoder = encoder.legsGroup(size);
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

        if (hasNoDatesGroupCounter)
        {
            final int size = this.noDatesGroupCounter;
            DatesGroupDecoder datesGroup = this.datesGroup;
            DatesGroupEncoder datesGroupEncoder = encoder.datesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (datesGroup != null)
                {
                    datesGroup.toEncoder(datesGroupEncoder);
                    datesGroup = datesGroup.next();
                    datesGroupEncoder = datesGroupEncoder.next();
                }
            }
        }

        if (hasClearingBusinessDate())
        {
            encoder.clearingBusinessDateAsCopy(this.clearingBusinessDate(), 0, clearingBusinessDateLength());
        }

        if (hasTradingSessionID())
        {
            encoder.tradingSessionID(this.tradingSessionID(), 0, tradingSessionIDLength());
        }

        if (hasTradingSessionSubID())
        {
            encoder.tradingSessionSubID(this.tradingSessionSubID(), 0, tradingSessionSubIDLength());
        }

        if (hasTimeBracket())
        {
            encoder.timeBracket(this.timeBracket(), 0, timeBracketLength());
        }

        if (hasSide())
        {
            encoder.side(this.side());
        }

        if (hasMultiLegReportingType())
        {
            encoder.multiLegReportingType(this.multiLegReportingType());
        }

        if (hasTradeInputSource())
        {
            encoder.tradeInputSource(this.tradeInputSource(), 0, tradeInputSourceLength());
        }

        if (hasTradeInputDevice())
        {
            encoder.tradeInputDevice(this.tradeInputDevice(), 0, tradeInputDeviceLength());
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
        return encoder;
    }

}
