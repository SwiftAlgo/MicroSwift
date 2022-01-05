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
import com.swiftalgo.ms.codecs.fix50sp2.builder.MassQuoteAcknowledgementEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.PartiesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.PartiesEncoder.PartyIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.PtysSubGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.PtysSubGrpEncoder.PartySubIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.TargetPartiesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.TargetPartiesEncoder.TargetPartyIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.QuotSetAckGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.QuotSetAckGrpEncoder.QuoteSetsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.UnderlyingInstrumentEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.UndSecAltIDGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.UndSecAltIDGrpEncoder.UnderlyingSecurityAltIDGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.UnderlyingStipulationsEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.UnderlyingStipulationsEncoder.UnderlyingStipsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.UndlyInstrumentPartiesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.UndlyInstrumentPartiesEncoder.UndlyInstrumentPartiesGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.UndlyInstrumentPtysSubGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.UndlyInstrumentPtysSubGrpEncoder.UndlyInstrumentPartySubIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.QuotEntryAckGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.QuotEntryAckGrpEncoder.QuoteEntriesGroupEncoder;
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


public class MassQuoteAcknowledgementDecoder extends CommonDecoderImpl implements PartiesDecoder, TargetPartiesDecoder, QuotSetAckGrpDecoder, MessageDecoder
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(2);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            REQUIRED_FIELDS.add(Constants.QUOTE_STATUS);
        }
    }

    public final IntHashSet GROUP_FIELDS = new IntHashSet(26);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            GROUP_FIELDS.add(Constants.QUOTE_REQ_ID);
            GROUP_FIELDS.add(Constants.QUOTE_ID);
            GROUP_FIELDS.add(Constants.QUOTE_STATUS);
            GROUP_FIELDS.add(Constants.QUOTE_REJECT_REASON);
            GROUP_FIELDS.add(Constants.QUOTE_RESPONSE_LEVEL);
            GROUP_FIELDS.add(Constants.QUOTE_TYPE);
            GROUP_FIELDS.add(Constants.QUOTE_CANCEL_TYPE);
            GROUP_FIELDS.add(Constants.ACCOUNT);
            GROUP_FIELDS.add(Constants.ACCT_ID_SOURCE);
            GROUP_FIELDS.add(Constants.ACCOUNT_TYPE);
            GROUP_FIELDS.add(Constants.TEXT);
            GROUP_FIELDS.add(Constants.ENCODED_TEXT_LEN);
            GROUP_FIELDS.add(Constants.ENCODED_TEXT);
        }
    }

    private final IntHashSet alreadyVisitedFields = new IntHashSet(26);

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
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !QuoteStatus.isValid(quoteStatus()))
        {
            invalidTagId = 297;
            rejectReason = 5;
            return false;
        }

        if (hasQuoteRejectReason)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !QuoteRejectReason.isValid(quoteRejectReason()))
        {
            invalidTagId = 300;
            rejectReason = 5;
            return false;
        }
        }

        if (hasQuoteResponseLevel)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !QuoteResponseLevel.isValid(quoteResponseLevel()))
        {
            invalidTagId = 301;
            rejectReason = 5;
            return false;
        }
        }

        if (hasQuoteType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !QuoteType.isValid(quoteType()))
        {
            invalidTagId = 537;
            rejectReason = 5;
            return false;
        }
        }

        if (hasQuoteCancelType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !QuoteCancelType.isValid(quoteCancelType()))
        {
            invalidTagId = 298;
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

        if (hasNoTargetPartyIDsGroupCounter)
        {
            {
                int count = 0;
                final TargetPartyIDsGroupIterator iterator = targetPartyIDsGroupIterator.iterator();
                for (final TargetPartyIDsGroupDecoder group : iterator)
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
                    invalidTagId = 1461;
                    rejectReason = 16;
                    return false;
                }
            }
        }

        if (hasNoQuoteSetsGroupCounter)
        {
            {
                int count = 0;
                final QuoteSetsGroupIterator iterator = quoteSetsGroupIterator.iterator();
                for (final QuoteSetsGroupDecoder group : iterator)
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
                    invalidTagId = 296;
                    rejectReason = 16;
                    return false;
                }
            }
        }
        return true;
    }

    public static final long MESSAGE_TYPE = 98L;

    public static final String MESSAGE_TYPE_AS_STRING = "b";

    public static final char[] MESSAGE_TYPE_CHARS = MESSAGE_TYPE_AS_STRING.toCharArray();

    public static final byte[] MESSAGE_TYPE_BYTES = MESSAGE_TYPE_AS_STRING.getBytes(US_ASCII);

    public final IntHashSet messageFields = new IntHashSet(694);

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
        messageFields.add(Constants.QUOTE_REQ_ID);
        messageFields.add(Constants.QUOTE_ID);
        messageFields.add(Constants.QUOTE_STATUS);
        messageFields.add(Constants.QUOTE_REJECT_REASON);
        messageFields.add(Constants.QUOTE_RESPONSE_LEVEL);
        messageFields.add(Constants.QUOTE_TYPE);
        messageFields.add(Constants.QUOTE_CANCEL_TYPE);
        messageFields.add(Constants.NO_PARTY_IDS);
        messageFields.add(Constants.PARTY_ID);
        messageFields.add(Constants.PARTY_ID_SOURCE);
        messageFields.add(Constants.PARTY_ROLE);
        messageFields.add(Constants.NO_PARTY_SUB_IDS);
        messageFields.add(Constants.PARTY_SUB_ID);
        messageFields.add(Constants.PARTY_SUB_ID_TYPE);
        messageFields.add(Constants.NO_TARGET_PARTY_IDS);
        messageFields.add(Constants.TARGET_PARTY_ID);
        messageFields.add(Constants.TARGET_PARTY_ID_SOURCE);
        messageFields.add(Constants.TARGET_PARTY_ROLE);
        messageFields.add(Constants.ACCOUNT);
        messageFields.add(Constants.ACCT_ID_SOURCE);
        messageFields.add(Constants.ACCOUNT_TYPE);
        messageFields.add(Constants.TEXT);
        messageFields.add(Constants.ENCODED_TEXT_LEN);
        messageFields.add(Constants.ENCODED_TEXT);
        messageFields.add(Constants.NO_QUOTE_SETS);
        messageFields.add(Constants.QUOTE_SET_ID);
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
        messageFields.add(Constants.QUOTE_SET_VALID_UNTIL_TIME);
        messageFields.add(Constants.TOT_NO_QUOTE_ENTRIES);
        messageFields.add(Constants.TOT_NO_CXLD_QUOTES);
        messageFields.add(Constants.TOT_NO_ACC_QUOTES);
        messageFields.add(Constants.TOT_NO_REJ_QUOTES);
        messageFields.add(Constants.LAST_FRAGMENT);
        messageFields.add(Constants.NO_QUOTE_ENTRIES);
        messageFields.add(Constants.QUOTE_ENTRY_ID);
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
        messageFields.add(Constants.BID_PX);
        messageFields.add(Constants.OFFER_PX);
        messageFields.add(Constants.BID_SIZE);
        messageFields.add(Constants.OFFER_SIZE);
        messageFields.add(Constants.VALID_UNTIL_TIME);
        messageFields.add(Constants.BID_SPOT_RATE);
        messageFields.add(Constants.OFFER_SPOT_RATE);
        messageFields.add(Constants.BID_FORWARD_POINTS);
        messageFields.add(Constants.OFFER_FORWARD_POINTS);
        messageFields.add(Constants.MID_PX);
        messageFields.add(Constants.BID_YIELD);
        messageFields.add(Constants.MID_YIELD);
        messageFields.add(Constants.OFFER_YIELD);
        messageFields.add(Constants.TRANSACT_TIME);
        messageFields.add(Constants.TRADING_SESSION_ID);
        messageFields.add(Constants.TRADING_SESSION_SUB_ID);
        messageFields.add(Constants.SETTL_DATE);
        messageFields.add(Constants.ORD_TYPE);
        messageFields.add(Constants.SETTL_DATE2);
        messageFields.add(Constants.ORDER_QTY2);
        messageFields.add(Constants.BID_FORWARD_POINTS2);
        messageFields.add(Constants.OFFER_FORWARD_POINTS2);
        messageFields.add(Constants.CURRENCY);
        messageFields.add(Constants.BOOKING_TYPE);
        messageFields.add(Constants.ORDER_CAPACITY);
        messageFields.add(Constants.ORDER_RESTRICTIONS);
        messageFields.add(Constants.QUOTE_ENTRY_STATUS);
        messageFields.add(Constants.QUOTE_ENTRY_REJECT_REASON);
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

    private char[] quoteReqID = new char[1];

    private boolean hasQuoteReqID;

    public char[] quoteReqID()
    {
        if (!hasQuoteReqID)
        {
            throw new IllegalArgumentException("No value for optional field: QuoteReqID");
        }

        return quoteReqID;
    }

    public boolean hasQuoteReqID()
    {
        return hasQuoteReqID;
    }


    private int quoteReqIDOffset;

    private int quoteReqIDLength;

    public int quoteReqIDLength()
    {
        if (!hasQuoteReqID)
        {
            throw new IllegalArgumentException("No value for optional field: QuoteReqID");
        }

        return quoteReqIDLength;
    }

    public String quoteReqIDAsString()
    {
        return hasQuoteReqID ? new String(quoteReqID, 0, quoteReqIDLength) : null;
    }

    public void quoteReqID(final AsciiSequenceView view)
    {
        if (!hasQuoteReqID)
        {
            throw new IllegalArgumentException("No value for optional field: QuoteReqID");
        }

        view.wrap(buffer, quoteReqIDOffset, quoteReqIDLength);
    }


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


    private int quoteStatus = MISSING_INT;

    public int quoteStatus()
    {
        return quoteStatus;
    }



    private final CharArrayWrapper quoteStatusWrapper = new CharArrayWrapper();
    public QuoteStatus quoteStatusAsEnum()
    {
        return QuoteStatus.decode(quoteStatus);
    }

    private int quoteRejectReason = MISSING_INT;

    private boolean hasQuoteRejectReason;

    public int quoteRejectReason()
    {
        if (!hasQuoteRejectReason)
        {
            throw new IllegalArgumentException("No value for optional field: QuoteRejectReason");
        }

        return quoteRejectReason;
    }

    public boolean hasQuoteRejectReason()
    {
        return hasQuoteRejectReason;
    }



    private final CharArrayWrapper quoteRejectReasonWrapper = new CharArrayWrapper();
    public QuoteRejectReason quoteRejectReasonAsEnum()
    {
        if (!hasQuoteRejectReason)
 return QuoteRejectReason.NULL_VAL;
        return QuoteRejectReason.decode(quoteRejectReason);
    }

    private int quoteResponseLevel = MISSING_INT;

    private boolean hasQuoteResponseLevel;

    public int quoteResponseLevel()
    {
        if (!hasQuoteResponseLevel)
        {
            throw new IllegalArgumentException("No value for optional field: QuoteResponseLevel");
        }

        return quoteResponseLevel;
    }

    public boolean hasQuoteResponseLevel()
    {
        return hasQuoteResponseLevel;
    }



    private final CharArrayWrapper quoteResponseLevelWrapper = new CharArrayWrapper();
    public QuoteResponseLevel quoteResponseLevelAsEnum()
    {
        if (!hasQuoteResponseLevel)
 return QuoteResponseLevel.NULL_VAL;
        return QuoteResponseLevel.decode(quoteResponseLevel);
    }

    private int quoteType = MISSING_INT;

    private boolean hasQuoteType;

    public int quoteType()
    {
        if (!hasQuoteType)
        {
            throw new IllegalArgumentException("No value for optional field: QuoteType");
        }

        return quoteType;
    }

    public boolean hasQuoteType()
    {
        return hasQuoteType;
    }



    private final CharArrayWrapper quoteTypeWrapper = new CharArrayWrapper();
    public QuoteType quoteTypeAsEnum()
    {
        if (!hasQuoteType)
 return QuoteType.NULL_VAL;
        return QuoteType.decode(quoteType);
    }

    private int quoteCancelType = MISSING_INT;

    private boolean hasQuoteCancelType;

    public int quoteCancelType()
    {
        if (!hasQuoteCancelType)
        {
            throw new IllegalArgumentException("No value for optional field: QuoteCancelType");
        }

        return quoteCancelType;
    }

    public boolean hasQuoteCancelType()
    {
        return hasQuoteCancelType;
    }



    private final CharArrayWrapper quoteCancelTypeWrapper = new CharArrayWrapper();
    public QuoteCancelType quoteCancelTypeAsEnum()
    {
        if (!hasQuoteCancelType)
 return QuoteCancelType.NULL_VAL;
        return QuoteCancelType.decode(quoteCancelType);
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




    private TargetPartyIDsGroupDecoder targetPartyIDsGroup = null;
    public TargetPartyIDsGroupDecoder targetPartyIDsGroup()
    {
        return targetPartyIDsGroup;
    }

    private int noTargetPartyIDsGroupCounter = MISSING_INT;

    private boolean hasNoTargetPartyIDsGroupCounter;

    public int noTargetPartyIDsGroupCounter()
    {
        if (!hasNoTargetPartyIDsGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoTargetPartyIDsGroupCounter");
        }

        return noTargetPartyIDsGroupCounter;
    }

    public boolean hasNoTargetPartyIDsGroupCounter()
    {
        return hasNoTargetPartyIDsGroupCounter;
    }




    private TargetPartyIDsGroupIterator targetPartyIDsGroupIterator = new TargetPartyIDsGroupIterator(this);
    public TargetPartyIDsGroupIterator targetPartyIDsGroupIterator()
    {
        return targetPartyIDsGroupIterator.iterator();
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





    private QuoteSetsGroupDecoder quoteSetsGroup = null;
    public QuoteSetsGroupDecoder quoteSetsGroup()
    {
        return quoteSetsGroup;
    }

    private int noQuoteSetsGroupCounter = MISSING_INT;

    private boolean hasNoQuoteSetsGroupCounter;

    public int noQuoteSetsGroupCounter()
    {
        if (!hasNoQuoteSetsGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoQuoteSetsGroupCounter");
        }

        return noQuoteSetsGroupCounter;
    }

    public boolean hasNoQuoteSetsGroupCounter()
    {
        return hasNoQuoteSetsGroupCounter;
    }




    private QuoteSetsGroupIterator quoteSetsGroupIterator = new QuoteSetsGroupIterator(this);
    public QuoteSetsGroupIterator quoteSetsGroupIterator()
    {
        return quoteSetsGroupIterator.iterator();
    }


    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode MassQuoteAcknowledgement
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
            case Constants.QUOTE_REQ_ID:
                hasQuoteReqID = true;
                quoteReqID = buffer.getChars(quoteReqID, valueOffset, valueLength);
                quoteReqIDOffset = valueOffset;
                quoteReqIDLength = valueLength;
                break;

            case Constants.QUOTE_ID:
                hasQuoteID = true;
                quoteID = buffer.getChars(quoteID, valueOffset, valueLength);
                quoteIDOffset = valueOffset;
                quoteIDLength = valueLength;
                break;

            case Constants.QUOTE_STATUS:
                quoteStatus = getInt(buffer, valueOffset, endOfField, 297, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.QUOTE_REJECT_REASON:
                hasQuoteRejectReason = true;
                quoteRejectReason = getInt(buffer, valueOffset, endOfField, 300, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.QUOTE_RESPONSE_LEVEL:
                hasQuoteResponseLevel = true;
                quoteResponseLevel = getInt(buffer, valueOffset, endOfField, 301, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.QUOTE_TYPE:
                hasQuoteType = true;
                quoteType = getInt(buffer, valueOffset, endOfField, 537, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.QUOTE_CANCEL_TYPE:
                hasQuoteCancelType = true;
                quoteCancelType = getInt(buffer, valueOffset, endOfField, 298, CODEC_VALIDATION_ENABLED);
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


            case Constants.NO_TARGET_PARTY_IDS:
                hasNoTargetPartyIDsGroupCounter = true;
                noTargetPartyIDsGroupCounter = getInt(buffer, valueOffset, endOfField, 1461, CODEC_VALIDATION_ENABLED);
                if (targetPartyIDsGroup == null)
                {
                    targetPartyIDsGroup = new TargetPartyIDsGroupDecoder(trailer, messageFields);
                }
                TargetPartyIDsGroupDecoder targetPartyIDsGroupCurrent = targetPartyIDsGroup;
                position = endOfField + 1;
                final int noTargetPartyIDsGroupCounter = this.noTargetPartyIDsGroupCounter;
                for (int i = 0; i < noTargetPartyIDsGroupCounter && position < end; i++)
                {
                    if (targetPartyIDsGroupCurrent != null)
                    {
                        position += targetPartyIDsGroupCurrent.decode(buffer, position, end - position);
                        targetPartyIDsGroupCurrent = targetPartyIDsGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (targetPartyIDsGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
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

            case Constants.NO_QUOTE_SETS:
                hasNoQuoteSetsGroupCounter = true;
                noQuoteSetsGroupCounter = getInt(buffer, valueOffset, endOfField, 296, CODEC_VALIDATION_ENABLED);
                if (quoteSetsGroup == null)
                {
                    quoteSetsGroup = new QuoteSetsGroupDecoder(trailer, messageFields);
                }
                QuoteSetsGroupDecoder quoteSetsGroupCurrent = quoteSetsGroup;
                position = endOfField + 1;
                final int noQuoteSetsGroupCounter = this.noQuoteSetsGroupCounter;
                for (int i = 0; i < noQuoteSetsGroupCounter && position < end; i++)
                {
                    if (quoteSetsGroupCurrent != null)
                    {
                        position += quoteSetsGroupCurrent.decode(buffer, position, end - position);
                        quoteSetsGroupCurrent = quoteSetsGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (quoteSetsGroup.ALL_GROUP_FIELDS.contains(checkTag))
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
        this.resetQuoteReqID();
        this.resetQuoteID();
        this.resetQuoteStatus();
        this.resetQuoteRejectReason();
        this.resetQuoteResponseLevel();
        this.resetQuoteType();
        this.resetQuoteCancelType();
        this.resetAccount();
        this.resetAcctIDSource();
        this.resetAccountType();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        this.resetPartyIDsGroup();
        this.resetTargetPartyIDsGroup();
        this.resetQuoteSetsGroup();
    }

    public void resetQuoteReqID()
    {
        hasQuoteReqID = false;
    }

    public void resetQuoteID()
    {
        hasQuoteID = false;
    }

    public void resetQuoteStatus()
    {
        quoteStatus = MISSING_INT;
    }

    public void resetQuoteRejectReason()
    {
        hasQuoteRejectReason = false;
    }

    public void resetQuoteResponseLevel()
    {
        hasQuoteResponseLevel = false;
    }

    public void resetQuoteType()
    {
        hasQuoteType = false;
    }

    public void resetQuoteCancelType()
    {
        hasQuoteCancelType = false;
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

    public void resetTargetPartyIDsGroup()
    {
        for (final TargetPartyIDsGroupDecoder targetPartyIDsGroupDecoder : targetPartyIDsGroupIterator.iterator())
        {
            targetPartyIDsGroupDecoder.reset();
            if (targetPartyIDsGroupDecoder.next() == null)
            {
                break;
            }
        }
        noTargetPartyIDsGroupCounter = MISSING_INT;
        hasNoTargetPartyIDsGroupCounter = false;
    }

    public void resetQuoteSetsGroup()
    {
        for (final QuoteSetsGroupDecoder quoteSetsGroupDecoder : quoteSetsGroupIterator.iterator())
        {
            quoteSetsGroupDecoder.reset();
            if (quoteSetsGroupDecoder.next() == null)
            {
                break;
            }
        }
        noQuoteSetsGroupCounter = MISSING_INT;
        hasNoQuoteSetsGroupCounter = false;
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
        builder.append("\"MessageName\": \"MassQuoteAcknowledgement\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasQuoteReqID())
        {
            indent(builder, level);
            builder.append("\"QuoteReqID\": \"");
            builder.append(this.quoteReqID(), 0, quoteReqIDLength());
            builder.append("\",\n");
        }

        if (hasQuoteID())
        {
            indent(builder, level);
            builder.append("\"QuoteID\": \"");
            builder.append(this.quoteID(), 0, quoteIDLength());
            builder.append("\",\n");
        }

        indent(builder, level);
        builder.append("\"QuoteStatus\": \"");
        builder.append(quoteStatus);
        builder.append("\",\n");

        if (hasQuoteRejectReason())
        {
            indent(builder, level);
            builder.append("\"QuoteRejectReason\": \"");
            builder.append(quoteRejectReason);
            builder.append("\",\n");
        }

        if (hasQuoteResponseLevel())
        {
            indent(builder, level);
            builder.append("\"QuoteResponseLevel\": \"");
            builder.append(quoteResponseLevel);
            builder.append("\",\n");
        }

        if (hasQuoteType())
        {
            indent(builder, level);
            builder.append("\"QuoteType\": \"");
            builder.append(quoteType);
            builder.append("\",\n");
        }

        if (hasQuoteCancelType())
        {
            indent(builder, level);
            builder.append("\"QuoteCancelType\": \"");
            builder.append(quoteCancelType);
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
            partyIDsGroup.appendTo(builder, level + 1);            if (partyIDsGroup.next() != null)
            {
                builder.append(',');
            }
            builder.append('\n');
            partyIDsGroup = partyIDsGroup.next();        }
        indent(builder, level);
        builder.append("],\n");
    }

    if (hasNoTargetPartyIDsGroupCounter)
    {
        indent(builder, level);
        builder.append("\"TargetPartyIDsGroup\": [\n");
        TargetPartyIDsGroupDecoder targetPartyIDsGroup = this.targetPartyIDsGroup;
        for (int i = 0, size = this.noTargetPartyIDsGroupCounter; i < size; i++)
        {
            indent(builder, level);
            targetPartyIDsGroup.appendTo(builder, level + 1);            if (targetPartyIDsGroup.next() != null)
            {
                builder.append(',');
            }
            builder.append('\n');
            targetPartyIDsGroup = targetPartyIDsGroup.next();        }
        indent(builder, level);
        builder.append("],\n");
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

    if (hasNoQuoteSetsGroupCounter)
    {
        indent(builder, level);
        builder.append("\"QuoteSetsGroup\": [\n");
        QuoteSetsGroupDecoder quoteSetsGroup = this.quoteSetsGroup;
        for (int i = 0, size = this.noQuoteSetsGroupCounter; i < size; i++)
        {
            indent(builder, level);
            quoteSetsGroup.appendTo(builder, level + 1);            if (quoteSetsGroup.next() != null)
            {
                builder.append(',');
            }
            builder.append('\n');
            quoteSetsGroup = quoteSetsGroup.next();        }
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
    public MassQuoteAcknowledgementEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((MassQuoteAcknowledgementEncoder)encoder);
    }

    public MassQuoteAcknowledgementEncoder toEncoder(final MassQuoteAcknowledgementEncoder encoder)
    {
        encoder.reset();
        if (hasQuoteReqID())
        {
            encoder.quoteReqID(this.quoteReqID(), 0, quoteReqIDLength());
        }

        if (hasQuoteID())
        {
            encoder.quoteID(this.quoteID(), 0, quoteIDLength());
        }

        encoder.quoteStatus(this.quoteStatus());
        if (hasQuoteRejectReason())
        {
            encoder.quoteRejectReason(this.quoteRejectReason());
        }

        if (hasQuoteResponseLevel())
        {
            encoder.quoteResponseLevel(this.quoteResponseLevel());
        }

        if (hasQuoteType())
        {
            encoder.quoteType(this.quoteType());
        }

        if (hasQuoteCancelType())
        {
            encoder.quoteCancelType(this.quoteCancelType());
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



        final TargetPartiesEncoder targetParties = encoder.targetParties();        if (hasNoTargetPartyIDsGroupCounter)
        {
            final int size = this.noTargetPartyIDsGroupCounter;
            TargetPartyIDsGroupDecoder targetPartyIDsGroup = this.targetPartyIDsGroup;
            TargetPartyIDsGroupEncoder targetPartyIDsGroupEncoder = targetParties.targetPartyIDsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (targetPartyIDsGroup != null)
                {
                    targetPartyIDsGroup.toEncoder(targetPartyIDsGroupEncoder);
                    targetPartyIDsGroup = targetPartyIDsGroup.next();
                    targetPartyIDsGroupEncoder = targetPartyIDsGroupEncoder.next();
                }
            }
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


        final QuotSetAckGrpEncoder quotSetAckGrp = encoder.quotSetAckGrp();        if (hasNoQuoteSetsGroupCounter)
        {
            final int size = this.noQuoteSetsGroupCounter;
            QuoteSetsGroupDecoder quoteSetsGroup = this.quoteSetsGroup;
            QuoteSetsGroupEncoder quoteSetsGroupEncoder = quotSetAckGrp.quoteSetsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (quoteSetsGroup != null)
                {
                    quoteSetsGroup.toEncoder(quoteSetsGroupEncoder);
                    quoteSetsGroup = quoteSetsGroup.next();
                    quoteSetsGroupEncoder = quoteSetsGroupEncoder.next();
                }
            }
        }

        return encoder;
    }

}
