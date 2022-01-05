/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2.decoder;

import uk.co.real_logic.artio.decoder.AbstractRejectDecoder;
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
import com.swiftalgo.ms.codecs.fix50sp2.builder.RejectEncoder;


public class RejectDecoder extends CommonDecoderImpl implements MessageDecoder, AbstractRejectDecoder
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(2);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            REQUIRED_FIELDS.add(Constants.REF_SEQ_NUM);
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
        if (hasSessionRejectReason)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !SessionRejectReason.isValid(sessionRejectReason()))
        {
            invalidTagId = 373;
            rejectReason = 5;
            return false;
        }
        }
        return true;
    }

    public static final long MESSAGE_TYPE = 51L;

    public static final String MESSAGE_TYPE_AS_STRING = "3";

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
        messageFields.add(Constants.REF_SEQ_NUM);
        messageFields.add(Constants.REF_TAG_ID);
        messageFields.add(Constants.REF_MSG_TYPE);
        messageFields.add(Constants.REF_APPL_VER_ID);
        messageFields.add(Constants.REF_APPL_EXT_ID);
        messageFields.add(Constants.REF_CSTM_APPL_VER_ID);
        messageFields.add(Constants.SESSION_REJECT_REASON);
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

    private int refSeqNum = MISSING_INT;

    public int refSeqNum()
    {
        return refSeqNum;
    }



    private int refTagID = MISSING_INT;

    private boolean hasRefTagID;

    public int refTagID()
    {
        if (!hasRefTagID)
        {
            throw new IllegalArgumentException("No value for optional field: RefTagID");
        }

        return refTagID;
    }

    public boolean hasRefTagID()
    {
        return hasRefTagID;
    }



    private char[] refMsgType = new char[1];

    private boolean hasRefMsgType;

    public char[] refMsgType()
    {
        if (!hasRefMsgType)
        {
            throw new IllegalArgumentException("No value for optional field: RefMsgType");
        }

        return refMsgType;
    }

    public boolean hasRefMsgType()
    {
        return hasRefMsgType;
    }


    private int refMsgTypeOffset;

    private int refMsgTypeLength;

    public int refMsgTypeLength()
    {
        if (!hasRefMsgType)
        {
            throw new IllegalArgumentException("No value for optional field: RefMsgType");
        }

        return refMsgTypeLength;
    }

    public String refMsgTypeAsString()
    {
        return hasRefMsgType ? new String(refMsgType, 0, refMsgTypeLength) : null;
    }

    public void refMsgType(final AsciiSequenceView view)
    {
        if (!hasRefMsgType)
        {
            throw new IllegalArgumentException("No value for optional field: RefMsgType");
        }

        view.wrap(buffer, refMsgTypeOffset, refMsgTypeLength);
    }


    private char[] refApplVerID = new char[1];

    private boolean hasRefApplVerID;

    public char[] refApplVerID()
    {
        if (!hasRefApplVerID)
        {
            throw new IllegalArgumentException("No value for optional field: RefApplVerID");
        }

        return refApplVerID;
    }

    public boolean hasRefApplVerID()
    {
        return hasRefApplVerID;
    }


    private int refApplVerIDOffset;

    private int refApplVerIDLength;

    public int refApplVerIDLength()
    {
        if (!hasRefApplVerID)
        {
            throw new IllegalArgumentException("No value for optional field: RefApplVerID");
        }

        return refApplVerIDLength;
    }

    public String refApplVerIDAsString()
    {
        return hasRefApplVerID ? new String(refApplVerID, 0, refApplVerIDLength) : null;
    }

    public void refApplVerID(final AsciiSequenceView view)
    {
        if (!hasRefApplVerID)
        {
            throw new IllegalArgumentException("No value for optional field: RefApplVerID");
        }

        view.wrap(buffer, refApplVerIDOffset, refApplVerIDLength);
    }


    private int refApplExtID = MISSING_INT;

    private boolean hasRefApplExtID;

    public int refApplExtID()
    {
        if (!hasRefApplExtID)
        {
            throw new IllegalArgumentException("No value for optional field: RefApplExtID");
        }

        return refApplExtID;
    }

    public boolean hasRefApplExtID()
    {
        return hasRefApplExtID;
    }



    private char[] refCstmApplVerID = new char[1];

    private boolean hasRefCstmApplVerID;

    public char[] refCstmApplVerID()
    {
        if (!hasRefCstmApplVerID)
        {
            throw new IllegalArgumentException("No value for optional field: RefCstmApplVerID");
        }

        return refCstmApplVerID;
    }

    public boolean hasRefCstmApplVerID()
    {
        return hasRefCstmApplVerID;
    }


    private int refCstmApplVerIDOffset;

    private int refCstmApplVerIDLength;

    public int refCstmApplVerIDLength()
    {
        if (!hasRefCstmApplVerID)
        {
            throw new IllegalArgumentException("No value for optional field: RefCstmApplVerID");
        }

        return refCstmApplVerIDLength;
    }

    public String refCstmApplVerIDAsString()
    {
        return hasRefCstmApplVerID ? new String(refCstmApplVerID, 0, refCstmApplVerIDLength) : null;
    }

    public void refCstmApplVerID(final AsciiSequenceView view)
    {
        if (!hasRefCstmApplVerID)
        {
            throw new IllegalArgumentException("No value for optional field: RefCstmApplVerID");
        }

        view.wrap(buffer, refCstmApplVerIDOffset, refCstmApplVerIDLength);
    }


    private int sessionRejectReason = MISSING_INT;

    private boolean hasSessionRejectReason;

    public int sessionRejectReason()
    {
        if (!hasSessionRejectReason)
        {
            throw new IllegalArgumentException("No value for optional field: SessionRejectReason");
        }

        return sessionRejectReason;
    }

    public boolean hasSessionRejectReason()
    {
        return hasSessionRejectReason;
    }



    private final CharArrayWrapper sessionRejectReasonWrapper = new CharArrayWrapper();
    public SessionRejectReason sessionRejectReasonAsEnum()
    {
        if (!hasSessionRejectReason)
 return SessionRejectReason.NULL_VAL;
        return SessionRejectReason.decode(sessionRejectReason);
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
        // Decode Reject
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
            case Constants.REF_SEQ_NUM:
                refSeqNum = getInt(buffer, valueOffset, endOfField, 45, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.REF_TAG_ID:
                hasRefTagID = true;
                refTagID = getInt(buffer, valueOffset, endOfField, 371, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.REF_MSG_TYPE:
                hasRefMsgType = true;
                refMsgType = buffer.getChars(refMsgType, valueOffset, valueLength);
                refMsgTypeOffset = valueOffset;
                refMsgTypeLength = valueLength;
                break;

            case Constants.REF_APPL_VER_ID:
                hasRefApplVerID = true;
                refApplVerID = buffer.getChars(refApplVerID, valueOffset, valueLength);
                refApplVerIDOffset = valueOffset;
                refApplVerIDLength = valueLength;
                break;

            case Constants.REF_APPL_EXT_ID:
                hasRefApplExtID = true;
                refApplExtID = getInt(buffer, valueOffset, endOfField, 1406, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.REF_CSTM_APPL_VER_ID:
                hasRefCstmApplVerID = true;
                refCstmApplVerID = buffer.getChars(refCstmApplVerID, valueOffset, valueLength);
                refCstmApplVerIDOffset = valueOffset;
                refCstmApplVerIDLength = valueLength;
                break;

            case Constants.SESSION_REJECT_REASON:
                hasSessionRejectReason = true;
                sessionRejectReason = getInt(buffer, valueOffset, endOfField, 373, CODEC_VALIDATION_ENABLED);
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
        this.resetRefSeqNum();
        this.resetRefTagID();
        this.resetRefMsgType();
        this.resetRefApplVerID();
        this.resetRefApplExtID();
        this.resetRefCstmApplVerID();
        this.resetSessionRejectReason();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
    }

    public void resetRefSeqNum()
    {
        refSeqNum = MISSING_INT;
    }

    public void resetRefTagID()
    {
        hasRefTagID = false;
    }

    public void resetRefMsgType()
    {
        hasRefMsgType = false;
    }

    public void resetRefApplVerID()
    {
        hasRefApplVerID = false;
    }

    public void resetRefApplExtID()
    {
        hasRefApplExtID = false;
    }

    public void resetRefCstmApplVerID()
    {
        hasRefCstmApplVerID = false;
    }

    public void resetSessionRejectReason()
    {
        hasSessionRejectReason = false;
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
        builder.append("\"MessageName\": \"Reject\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        indent(builder, level);
        builder.append("\"RefSeqNum\": \"");
        builder.append(refSeqNum);
        builder.append("\",\n");

        if (hasRefTagID())
        {
            indent(builder, level);
            builder.append("\"RefTagID\": \"");
            builder.append(refTagID);
            builder.append("\",\n");
        }

        if (hasRefMsgType())
        {
            indent(builder, level);
            builder.append("\"RefMsgType\": \"");
            builder.append(this.refMsgType(), 0, refMsgTypeLength());
            builder.append("\",\n");
        }

        if (hasRefApplVerID())
        {
            indent(builder, level);
            builder.append("\"RefApplVerID\": \"");
            builder.append(this.refApplVerID(), 0, refApplVerIDLength());
            builder.append("\",\n");
        }

        if (hasRefApplExtID())
        {
            indent(builder, level);
            builder.append("\"RefApplExtID\": \"");
            builder.append(refApplExtID);
            builder.append("\",\n");
        }

        if (hasRefCstmApplVerID())
        {
            indent(builder, level);
            builder.append("\"RefCstmApplVerID\": \"");
            builder.append(this.refCstmApplVerID(), 0, refCstmApplVerIDLength());
            builder.append("\",\n");
        }

        if (hasSessionRejectReason())
        {
            indent(builder, level);
            builder.append("\"SessionRejectReason\": \"");
            builder.append(sessionRejectReason);
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
    public RejectEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((RejectEncoder)encoder);
    }

    public RejectEncoder toEncoder(final RejectEncoder encoder)
    {
        encoder.reset();
        encoder.refSeqNum(this.refSeqNum());
        if (hasRefTagID())
        {
            encoder.refTagID(this.refTagID());
        }

        if (hasRefMsgType())
        {
            encoder.refMsgType(this.refMsgType(), 0, refMsgTypeLength());
        }

        if (hasRefApplVerID())
        {
            encoder.refApplVerID(this.refApplVerID(), 0, refApplVerIDLength());
        }

        if (hasRefApplExtID())
        {
            encoder.refApplExtID(this.refApplExtID());
        }

        if (hasRefCstmApplVerID())
        {
            encoder.refCstmApplVerID(this.refCstmApplVerID(), 0, refCstmApplVerIDLength());
        }

        if (hasSessionRejectReason())
        {
            encoder.sessionRejectReason(this.sessionRejectReason());
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
