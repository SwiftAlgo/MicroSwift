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
import com.swiftalgo.ms.codecs.fix50sp2.builder.ApplicationMessageReportEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.ApplIDReportGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.ApplIDReportGrpEncoder.ApplIDsGroupEncoder;


public class ApplicationMessageReportDecoder extends CommonDecoderImpl implements ApplIDReportGrpDecoder, MessageDecoder
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(4);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            REQUIRED_FIELDS.add(Constants.APPL_REPORT_ID);
            REQUIRED_FIELDS.add(Constants.APPL_REPORT_TYPE);
        }
    }

    public final IntHashSet GROUP_FIELDS = new IntHashSet(12);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            GROUP_FIELDS.add(Constants.APPL_REPORT_ID);
            GROUP_FIELDS.add(Constants.APPL_REQ_ID);
            GROUP_FIELDS.add(Constants.APPL_REPORT_TYPE);
            GROUP_FIELDS.add(Constants.TEXT);
            GROUP_FIELDS.add(Constants.ENCODED_TEXT_LEN);
            GROUP_FIELDS.add(Constants.ENCODED_TEXT);
        }
    }

    private final IntHashSet alreadyVisitedFields = new IntHashSet(12);

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
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !ApplReportType.isValid(applReportType()))
        {
            invalidTagId = 1426;
            rejectReason = 5;
            return false;
        }
        if (hasNoApplIDsGroupCounter)
        {
            {
                int count = 0;
                final ApplIDsGroupIterator iterator = applIDsGroupIterator.iterator();
                for (final ApplIDsGroupDecoder group : iterator)
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
                    invalidTagId = 1351;
                    rejectReason = 16;
                    return false;
                }
            }
        }
        return true;
    }

    public static final long MESSAGE_TYPE = 22850L;

    public static final String MESSAGE_TYPE_AS_STRING = "BY";

    public static final char[] MESSAGE_TYPE_CHARS = MESSAGE_TYPE_AS_STRING.toCharArray();

    public static final byte[] MESSAGE_TYPE_BYTES = MESSAGE_TYPE_AS_STRING.getBytes(US_ASCII);

    public final IntHashSet messageFields = new IntHashSet(84);

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
        messageFields.add(Constants.APPL_REPORT_ID);
        messageFields.add(Constants.APPL_REQ_ID);
        messageFields.add(Constants.APPL_REPORT_TYPE);
        messageFields.add(Constants.NO_APPL_IDS);
        messageFields.add(Constants.REF_APPL_ID);
        messageFields.add(Constants.APPL_NEW_SEQ_NUM);
        messageFields.add(Constants.REF_APPL_LAST_SEQ_NUM);
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

    private char[] applReportID = new char[1];

    public char[] applReportID()
    {
        return applReportID;
    }


    private int applReportIDOffset;

    private int applReportIDLength;

    public int applReportIDLength()
    {
        return applReportIDLength;
    }

    public String applReportIDAsString()
    {
        return new String(applReportID, 0, applReportIDLength);
    }

    public void applReportID(final AsciiSequenceView view)
    {
        view.wrap(buffer, applReportIDOffset, applReportIDLength);
    }


    private char[] applReqID = new char[1];

    private boolean hasApplReqID;

    public char[] applReqID()
    {
        if (!hasApplReqID)
        {
            throw new IllegalArgumentException("No value for optional field: ApplReqID");
        }

        return applReqID;
    }

    public boolean hasApplReqID()
    {
        return hasApplReqID;
    }


    private int applReqIDOffset;

    private int applReqIDLength;

    public int applReqIDLength()
    {
        if (!hasApplReqID)
        {
            throw new IllegalArgumentException("No value for optional field: ApplReqID");
        }

        return applReqIDLength;
    }

    public String applReqIDAsString()
    {
        return hasApplReqID ? new String(applReqID, 0, applReqIDLength) : null;
    }

    public void applReqID(final AsciiSequenceView view)
    {
        if (!hasApplReqID)
        {
            throw new IllegalArgumentException("No value for optional field: ApplReqID");
        }

        view.wrap(buffer, applReqIDOffset, applReqIDLength);
    }


    private int applReportType = MISSING_INT;

    public int applReportType()
    {
        return applReportType;
    }



    private final CharArrayWrapper applReportTypeWrapper = new CharArrayWrapper();
    public ApplReportType applReportTypeAsEnum()
    {
        return ApplReportType.decode(applReportType);
    }



    private ApplIDsGroupDecoder applIDsGroup = null;
    public ApplIDsGroupDecoder applIDsGroup()
    {
        return applIDsGroup;
    }

    private int noApplIDsGroupCounter = MISSING_INT;

    private boolean hasNoApplIDsGroupCounter;

    public int noApplIDsGroupCounter()
    {
        if (!hasNoApplIDsGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoApplIDsGroupCounter");
        }

        return noApplIDsGroupCounter;
    }

    public boolean hasNoApplIDsGroupCounter()
    {
        return hasNoApplIDsGroupCounter;
    }




    private ApplIDsGroupIterator applIDsGroupIterator = new ApplIDsGroupIterator(this);
    public ApplIDsGroupIterator applIDsGroupIterator()
    {
        return applIDsGroupIterator.iterator();
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



    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode ApplicationMessageReport
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
            case Constants.APPL_REPORT_ID:
                applReportID = buffer.getChars(applReportID, valueOffset, valueLength);
                applReportIDOffset = valueOffset;
                applReportIDLength = valueLength;
                break;

            case Constants.APPL_REQ_ID:
                hasApplReqID = true;
                applReqID = buffer.getChars(applReqID, valueOffset, valueLength);
                applReqIDOffset = valueOffset;
                applReqIDLength = valueLength;
                break;

            case Constants.APPL_REPORT_TYPE:
                applReportType = getInt(buffer, valueOffset, endOfField, 1426, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.NO_APPL_IDS:
                hasNoApplIDsGroupCounter = true;
                noApplIDsGroupCounter = getInt(buffer, valueOffset, endOfField, 1351, CODEC_VALIDATION_ENABLED);
                if (applIDsGroup == null)
                {
                    applIDsGroup = new ApplIDsGroupDecoder(trailer, messageFields);
                }
                ApplIDsGroupDecoder applIDsGroupCurrent = applIDsGroup;
                position = endOfField + 1;
                final int noApplIDsGroupCounter = this.noApplIDsGroupCounter;
                for (int i = 0; i < noApplIDsGroupCounter && position < end; i++)
                {
                    if (applIDsGroupCurrent != null)
                    {
                        position += applIDsGroupCurrent.decode(buffer, position, end - position);
                        applIDsGroupCurrent = applIDsGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (applIDsGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
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
        this.resetApplReportID();
        this.resetApplReqID();
        this.resetApplReportType();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        this.resetApplIDsGroup();
    }

    public void resetApplReportID()
    {
        applReportIDOffset = 0;
        applReportIDLength = 0;
    }

    public void resetApplReqID()
    {
        hasApplReqID = false;
    }

    public void resetApplReportType()
    {
        applReportType = MISSING_INT;
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

    public void resetApplIDsGroup()
    {
        for (final ApplIDsGroupDecoder applIDsGroupDecoder : applIDsGroupIterator.iterator())
        {
            applIDsGroupDecoder.reset();
            if (applIDsGroupDecoder.next() == null)
            {
                break;
            }
        }
        noApplIDsGroupCounter = MISSING_INT;
        hasNoApplIDsGroupCounter = false;
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
        builder.append("\"MessageName\": \"ApplicationMessageReport\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        indent(builder, level);
        builder.append("\"ApplReportID\": \"");
        builder.append(this.applReportID(), 0, applReportIDLength());
        builder.append("\",\n");

        if (hasApplReqID())
        {
            indent(builder, level);
            builder.append("\"ApplReqID\": \"");
            builder.append(this.applReqID(), 0, applReqIDLength());
            builder.append("\",\n");
        }

        indent(builder, level);
        builder.append("\"ApplReportType\": \"");
        builder.append(applReportType);
        builder.append("\",\n");

    if (hasNoApplIDsGroupCounter)
    {
        indent(builder, level);
        builder.append("\"ApplIDsGroup\": [\n");
        ApplIDsGroupDecoder applIDsGroup = this.applIDsGroup;
        for (int i = 0, size = this.noApplIDsGroupCounter; i < size; i++)
        {
            indent(builder, level);
            applIDsGroup.appendTo(builder, level + 1);            if (applIDsGroup.next() != null)
            {
                builder.append(',');
            }
            builder.append('\n');
            applIDsGroup = applIDsGroup.next();        }
        indent(builder, level);
        builder.append("],\n");
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
    public ApplicationMessageReportEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((ApplicationMessageReportEncoder)encoder);
    }

    public ApplicationMessageReportEncoder toEncoder(final ApplicationMessageReportEncoder encoder)
    {
        encoder.reset();
        encoder.applReportID(this.applReportID(), 0, applReportIDLength());
        if (hasApplReqID())
        {
            encoder.applReqID(this.applReqID(), 0, applReqIDLength());
        }

        encoder.applReportType(this.applReportType());

        final ApplIDReportGrpEncoder applIDReportGrp = encoder.applIDReportGrp();        if (hasNoApplIDsGroupCounter)
        {
            final int size = this.noApplIDsGroupCounter;
            ApplIDsGroupDecoder applIDsGroup = this.applIDsGroup;
            ApplIDsGroupEncoder applIDsGroupEncoder = applIDReportGrp.applIDsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (applIDsGroup != null)
                {
                    applIDsGroup.toEncoder(applIDsGroupEncoder);
                    applIDsGroup = applIDsGroup.next();
                    applIDsGroupEncoder = applIDsGroupEncoder.next();
                }
            }
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
