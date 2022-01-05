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
import com.swiftalgo.ms.codecs.fix50sp2.builder.StreamAssignmentReportEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.StrmAsgnRptGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.StrmAsgnRptGrpEncoder.AsgnReqsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.PartiesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.PartiesEncoder.PartyIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.PtysSubGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.PtysSubGrpEncoder.PartySubIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.StrmAsgnRptInstrmtGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.StrmAsgnRptInstrmtGrpEncoder.RelatedSymGroupEncoder;
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


public class StreamAssignmentReportDecoder extends CommonDecoderImpl implements StrmAsgnRptGrpDecoder, MessageDecoder
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(2);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            REQUIRED_FIELDS.add(Constants.STREAM_ASGN_RPT_ID);
        }
    }

    public final IntHashSet GROUP_FIELDS = new IntHashSet(6);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            GROUP_FIELDS.add(Constants.STREAM_ASGN_RPT_ID);
            GROUP_FIELDS.add(Constants.STREAM_ASGN_REQ_TYPE);
            GROUP_FIELDS.add(Constants.STREAM_ASGN_REQ_ID);
        }
    }

    private final IntHashSet alreadyVisitedFields = new IntHashSet(6);

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
        if (hasStreamAsgnReqType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !StreamAsgnReqType.isValid(streamAsgnReqType()))
        {
            invalidTagId = 1498;
            rejectReason = 5;
            return false;
        }
        }
        if (hasNoAsgnReqsGroupCounter)
        {
            {
                int count = 0;
                final AsgnReqsGroupIterator iterator = asgnReqsGroupIterator.iterator();
                for (final AsgnReqsGroupDecoder group : iterator)
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
                    invalidTagId = 1499;
                    rejectReason = 16;
                    return false;
                }
            }
        }
        return true;
    }

    public static final long MESSAGE_TYPE = 17475L;

    public static final String MESSAGE_TYPE_AS_STRING = "CD";

    public static final char[] MESSAGE_TYPE_CHARS = MESSAGE_TYPE_AS_STRING.toCharArray();

    public static final byte[] MESSAGE_TYPE_BYTES = MESSAGE_TYPE_AS_STRING.getBytes(US_ASCII);

    public final IntHashSet messageFields = new IntHashSet(330);

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
        messageFields.add(Constants.STREAM_ASGN_RPT_ID);
        messageFields.add(Constants.STREAM_ASGN_REQ_TYPE);
        messageFields.add(Constants.STREAM_ASGN_REQ_ID);
        messageFields.add(Constants.NO_ASGN_REQS);
        messageFields.add(Constants.NO_PARTY_IDS);
        messageFields.add(Constants.PARTY_ID);
        messageFields.add(Constants.PARTY_ID_SOURCE);
        messageFields.add(Constants.PARTY_ROLE);
        messageFields.add(Constants.NO_PARTY_SUB_IDS);
        messageFields.add(Constants.PARTY_SUB_ID);
        messageFields.add(Constants.PARTY_SUB_ID_TYPE);
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
        messageFields.add(Constants.SETTL_TYPE);
        messageFields.add(Constants.STREAM_ASGN_TYPE);
        messageFields.add(Constants.M_D_STREAM_ID);
        messageFields.add(Constants.STREAM_ASGN_REJ_REASON);
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

    private char[] streamAsgnRptID = new char[1];

    public char[] streamAsgnRptID()
    {
        return streamAsgnRptID;
    }


    private int streamAsgnRptIDOffset;

    private int streamAsgnRptIDLength;

    public int streamAsgnRptIDLength()
    {
        return streamAsgnRptIDLength;
    }

    public String streamAsgnRptIDAsString()
    {
        return new String(streamAsgnRptID, 0, streamAsgnRptIDLength);
    }

    public void streamAsgnRptID(final AsciiSequenceView view)
    {
        view.wrap(buffer, streamAsgnRptIDOffset, streamAsgnRptIDLength);
    }


    private int streamAsgnReqType = MISSING_INT;

    private boolean hasStreamAsgnReqType;

    public int streamAsgnReqType()
    {
        if (!hasStreamAsgnReqType)
        {
            throw new IllegalArgumentException("No value for optional field: StreamAsgnReqType");
        }

        return streamAsgnReqType;
    }

    public boolean hasStreamAsgnReqType()
    {
        return hasStreamAsgnReqType;
    }



    private final CharArrayWrapper streamAsgnReqTypeWrapper = new CharArrayWrapper();
    public StreamAsgnReqType streamAsgnReqTypeAsEnum()
    {
        if (!hasStreamAsgnReqType)
 return StreamAsgnReqType.NULL_VAL;
        return StreamAsgnReqType.decode(streamAsgnReqType);
    }

    private char[] streamAsgnReqID = new char[1];

    private boolean hasStreamAsgnReqID;

    public char[] streamAsgnReqID()
    {
        if (!hasStreamAsgnReqID)
        {
            throw new IllegalArgumentException("No value for optional field: StreamAsgnReqID");
        }

        return streamAsgnReqID;
    }

    public boolean hasStreamAsgnReqID()
    {
        return hasStreamAsgnReqID;
    }


    private int streamAsgnReqIDOffset;

    private int streamAsgnReqIDLength;

    public int streamAsgnReqIDLength()
    {
        if (!hasStreamAsgnReqID)
        {
            throw new IllegalArgumentException("No value for optional field: StreamAsgnReqID");
        }

        return streamAsgnReqIDLength;
    }

    public String streamAsgnReqIDAsString()
    {
        return hasStreamAsgnReqID ? new String(streamAsgnReqID, 0, streamAsgnReqIDLength) : null;
    }

    public void streamAsgnReqID(final AsciiSequenceView view)
    {
        if (!hasStreamAsgnReqID)
        {
            throw new IllegalArgumentException("No value for optional field: StreamAsgnReqID");
        }

        view.wrap(buffer, streamAsgnReqIDOffset, streamAsgnReqIDLength);
    }




    private AsgnReqsGroupDecoder asgnReqsGroup = null;
    public AsgnReqsGroupDecoder asgnReqsGroup()
    {
        return asgnReqsGroup;
    }

    private int noAsgnReqsGroupCounter = MISSING_INT;

    private boolean hasNoAsgnReqsGroupCounter;

    public int noAsgnReqsGroupCounter()
    {
        if (!hasNoAsgnReqsGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoAsgnReqsGroupCounter");
        }

        return noAsgnReqsGroupCounter;
    }

    public boolean hasNoAsgnReqsGroupCounter()
    {
        return hasNoAsgnReqsGroupCounter;
    }




    private AsgnReqsGroupIterator asgnReqsGroupIterator = new AsgnReqsGroupIterator(this);
    public AsgnReqsGroupIterator asgnReqsGroupIterator()
    {
        return asgnReqsGroupIterator.iterator();
    }


    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode StreamAssignmentReport
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
            case Constants.STREAM_ASGN_RPT_ID:
                streamAsgnRptID = buffer.getChars(streamAsgnRptID, valueOffset, valueLength);
                streamAsgnRptIDOffset = valueOffset;
                streamAsgnRptIDLength = valueLength;
                break;

            case Constants.STREAM_ASGN_REQ_TYPE:
                hasStreamAsgnReqType = true;
                streamAsgnReqType = getInt(buffer, valueOffset, endOfField, 1498, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.STREAM_ASGN_REQ_ID:
                hasStreamAsgnReqID = true;
                streamAsgnReqID = buffer.getChars(streamAsgnReqID, valueOffset, valueLength);
                streamAsgnReqIDOffset = valueOffset;
                streamAsgnReqIDLength = valueLength;
                break;

            case Constants.NO_ASGN_REQS:
                hasNoAsgnReqsGroupCounter = true;
                noAsgnReqsGroupCounter = getInt(buffer, valueOffset, endOfField, 1499, CODEC_VALIDATION_ENABLED);
                if (asgnReqsGroup == null)
                {
                    asgnReqsGroup = new AsgnReqsGroupDecoder(trailer, messageFields);
                }
                AsgnReqsGroupDecoder asgnReqsGroupCurrent = asgnReqsGroup;
                position = endOfField + 1;
                final int noAsgnReqsGroupCounter = this.noAsgnReqsGroupCounter;
                for (int i = 0; i < noAsgnReqsGroupCounter && position < end; i++)
                {
                    if (asgnReqsGroupCurrent != null)
                    {
                        position += asgnReqsGroupCurrent.decode(buffer, position, end - position);
                        asgnReqsGroupCurrent = asgnReqsGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (asgnReqsGroup.ALL_GROUP_FIELDS.contains(checkTag))
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
        this.resetStreamAsgnRptID();
        this.resetStreamAsgnReqType();
        this.resetStreamAsgnReqID();
        this.resetAsgnReqsGroup();
    }

    public void resetStreamAsgnRptID()
    {
        streamAsgnRptIDOffset = 0;
        streamAsgnRptIDLength = 0;
    }

    public void resetStreamAsgnReqType()
    {
        hasStreamAsgnReqType = false;
    }

    public void resetStreamAsgnReqID()
    {
        hasStreamAsgnReqID = false;
    }

    public void resetAsgnReqsGroup()
    {
        for (final AsgnReqsGroupDecoder asgnReqsGroupDecoder : asgnReqsGroupIterator.iterator())
        {
            asgnReqsGroupDecoder.reset();
            if (asgnReqsGroupDecoder.next() == null)
            {
                break;
            }
        }
        noAsgnReqsGroupCounter = MISSING_INT;
        hasNoAsgnReqsGroupCounter = false;
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
        builder.append("\"MessageName\": \"StreamAssignmentReport\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        indent(builder, level);
        builder.append("\"StreamAsgnRptID\": \"");
        builder.append(this.streamAsgnRptID(), 0, streamAsgnRptIDLength());
        builder.append("\",\n");

        if (hasStreamAsgnReqType())
        {
            indent(builder, level);
            builder.append("\"StreamAsgnReqType\": \"");
            builder.append(streamAsgnReqType);
            builder.append("\",\n");
        }

        if (hasStreamAsgnReqID())
        {
            indent(builder, level);
            builder.append("\"StreamAsgnReqID\": \"");
            builder.append(this.streamAsgnReqID(), 0, streamAsgnReqIDLength());
            builder.append("\",\n");
        }

    if (hasNoAsgnReqsGroupCounter)
    {
        indent(builder, level);
        builder.append("\"AsgnReqsGroup\": [\n");
        AsgnReqsGroupDecoder asgnReqsGroup = this.asgnReqsGroup;
        for (int i = 0, size = this.noAsgnReqsGroupCounter; i < size; i++)
        {
            indent(builder, level);
            asgnReqsGroup.appendTo(builder, level + 1);            if (asgnReqsGroup.next() != null)
            {
                builder.append(',');
            }
            builder.append('\n');
            asgnReqsGroup = asgnReqsGroup.next();        }
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
    public StreamAssignmentReportEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((StreamAssignmentReportEncoder)encoder);
    }

    public StreamAssignmentReportEncoder toEncoder(final StreamAssignmentReportEncoder encoder)
    {
        encoder.reset();
        encoder.streamAsgnRptID(this.streamAsgnRptID(), 0, streamAsgnRptIDLength());
        if (hasStreamAsgnReqType())
        {
            encoder.streamAsgnReqType(this.streamAsgnReqType());
        }

        if (hasStreamAsgnReqID())
        {
            encoder.streamAsgnReqID(this.streamAsgnReqID(), 0, streamAsgnReqIDLength());
        }


        final StrmAsgnRptGrpEncoder strmAsgnRptGrp = encoder.strmAsgnRptGrp();        if (hasNoAsgnReqsGroupCounter)
        {
            final int size = this.noAsgnReqsGroupCounter;
            AsgnReqsGroupDecoder asgnReqsGroup = this.asgnReqsGroup;
            AsgnReqsGroupEncoder asgnReqsGroupEncoder = strmAsgnRptGrp.asgnReqsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (asgnReqsGroup != null)
                {
                    asgnReqsGroup.toEncoder(asgnReqsGroupEncoder);
                    asgnReqsGroup = asgnReqsGroup.next();
                    asgnReqsGroupEncoder = asgnReqsGroupEncoder.next();
                }
            }
        }

        return encoder;
    }

}
