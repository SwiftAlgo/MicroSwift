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
import com.swiftalgo.ms.codecs.fix44.builder.MarketDataRequestRejectEncoder;
import static com.swiftalgo.ms.codecs.fix44.builder.MarketDataRequestRejectEncoder.AltMDSourceGroupEncoder;


public class MarketDataRequestRejectDecoder extends CommonDecoderImpl implements MessageDecoder
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(2);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            REQUIRED_FIELDS.add(Constants.M_D_REQ_ID);
        }
    }

    public final IntHashSet GROUP_FIELDS = new IntHashSet(10);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            GROUP_FIELDS.add(Constants.M_D_REQ_ID);
            GROUP_FIELDS.add(Constants.M_D_REQ_REJ_REASON);
            GROUP_FIELDS.add(Constants.TEXT);
            GROUP_FIELDS.add(Constants.ENCODED_TEXT_LEN);
            GROUP_FIELDS.add(Constants.ENCODED_TEXT);
        }
    }

    private final IntHashSet alreadyVisitedFields = new IntHashSet(10);

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
        if (hasMDReqRejReason)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !MDReqRejReason.isValid(mDReqRejReason()))
        {
            invalidTagId = 281;
            rejectReason = 5;
            return false;
        }
        }
        if (hasNoAltMDSourceGroupCounter)
        {
            {
                int count = 0;
                final AltMDSourceGroupIterator iterator = altMDSourceGroupIterator.iterator();
                for (final AltMDSourceGroupDecoder group : iterator)
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
                    invalidTagId = 816;
                    rejectReason = 16;
                    return false;
                }
            }
        }
        return true;
    }

    public static final long MESSAGE_TYPE = 89L;

    public static final String MESSAGE_TYPE_AS_STRING = "Y";

    public static final char[] MESSAGE_TYPE_CHARS = MESSAGE_TYPE_AS_STRING.toCharArray();

    public static final byte[] MESSAGE_TYPE_BYTES = MESSAGE_TYPE_AS_STRING.getBytes(US_ASCII);

    public final IntHashSet messageFields = new IntHashSet(72);

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
        messageFields.add(Constants.M_D_REQ_ID);
        messageFields.add(Constants.M_D_REQ_REJ_REASON);
        messageFields.add(Constants.NO_ALT_M_D_SOURCE_GROUP_COUNTER);
        messageFields.add(Constants.ALT_M_D_SOURCE_ID);
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


    private final CharArrayWrapper mDReqIDWrapper = new CharArrayWrapper();
    private char mDReqRejReason = MISSING_CHAR;

    private boolean hasMDReqRejReason;

    public char mDReqRejReason()
    {
        if (!hasMDReqRejReason)
        {
            throw new IllegalArgumentException("No value for optional field: MDReqRejReason");
        }

        return mDReqRejReason;
    }

    public boolean hasMDReqRejReason()
    {
        return hasMDReqRejReason;
    }



    private final CharArrayWrapper mDReqRejReasonWrapper = new CharArrayWrapper();
    public MDReqRejReason mDReqRejReasonAsEnum()
    {
        if (!hasMDReqRejReason)
 return MDReqRejReason.NULL_VAL;
        return MDReqRejReason.decode(mDReqRejReason);
    }



public class AltMDSourceGroupDecoder extends CommonDecoderImpl
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(0);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
        }
    }

    public final IntHashSet ALL_GROUP_FIELDS = new IntHashSet(2);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            ALL_GROUP_FIELDS.add(Constants.ALT_M_D_SOURCE_ID);
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
    public AltMDSourceGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private AltMDSourceGroupDecoder next = null;

    public AltMDSourceGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(2);

    private char[] altMDSourceID = new char[1];

    private boolean hasAltMDSourceID;

    public char[] altMDSourceID()
    {
        if (!hasAltMDSourceID)
        {
            throw new IllegalArgumentException("No value for optional field: AltMDSourceID");
        }

        return altMDSourceID;
    }

    public boolean hasAltMDSourceID()
    {
        return hasAltMDSourceID;
    }


    private int altMDSourceIDOffset;

    private int altMDSourceIDLength;

    public int altMDSourceIDLength()
    {
        if (!hasAltMDSourceID)
        {
            throw new IllegalArgumentException("No value for optional field: AltMDSourceID");
        }

        return altMDSourceIDLength;
    }

    public String altMDSourceIDAsString()
    {
        return hasAltMDSourceID ? new String(altMDSourceID, 0, altMDSourceIDLength) : null;
    }

    public void altMDSourceID(final AsciiSequenceView view)
    {
        if (!hasAltMDSourceID)
        {
            throw new IllegalArgumentException("No value for optional field: AltMDSourceID");
        }

        view.wrap(buffer, altMDSourceIDOffset, altMDSourceIDLength);
    }


    private final CharArrayWrapper altMDSourceIDWrapper = new CharArrayWrapper();
    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode AltMDSourceGroup
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
                    next = new AltMDSourceGroupDecoder(trailer, messageFields);
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
            case Constants.ALT_M_D_SOURCE_ID:
                hasAltMDSourceID = true;
                altMDSourceID = buffer.getChars(altMDSourceID, valueOffset, valueLength);
                altMDSourceIDOffset = valueOffset;
                altMDSourceIDLength = valueLength;
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
        this.resetAltMDSourceID();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetAltMDSourceID()
    {
        hasAltMDSourceID = false;
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
        builder.append("\"MessageName\": \"AltMDSourceGroup\",\n");
        if (hasAltMDSourceID())
        {
            indent(builder, level);
            builder.append("\"AltMDSourceID\": \"");
            builder.append(this.altMDSourceID(), 0, altMDSourceIDLength());
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public MarketDataRequestRejectEncoder.AltMDSourceGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((MarketDataRequestRejectEncoder.AltMDSourceGroupEncoder)encoder);
    }

    public MarketDataRequestRejectEncoder.AltMDSourceGroupEncoder toEncoder(final MarketDataRequestRejectEncoder.AltMDSourceGroupEncoder encoder)
    {
        encoder.reset();
        if (hasAltMDSourceID())
        {
            encoder.altMDSourceID(this.altMDSourceID(), 0, altMDSourceIDLength());
        }
        return encoder;
    }

}
    public class AltMDSourceGroupIterator implements Iterable<AltMDSourceGroupDecoder>, java.util.Iterator<AltMDSourceGroupDecoder>
    {
        private final MarketDataRequestRejectDecoder parent;
        private int remainder;
        private AltMDSourceGroupDecoder current;

        public AltMDSourceGroupIterator(final MarketDataRequestRejectDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }

        public AltMDSourceGroupDecoder next()
        {
            remainder--;
            final AltMDSourceGroupDecoder value = current;
            current = current.next();
            return value;
        }

        public int numberFieldValue()
        {
            return parent.hasNoAltMDSourceGroupCounter() ? parent.noAltMDSourceGroupCounter() : 0;
        }

        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.altMDSourceGroup();
        }

        public AltMDSourceGroupIterator iterator()
        {
            reset();
            return this;
        }

    }


    private AltMDSourceGroupDecoder altMDSourceGroup = null;
    public AltMDSourceGroupDecoder altMDSourceGroup()
    {
        return altMDSourceGroup;
    }

    private int noAltMDSourceGroupCounter = MISSING_INT;

    private boolean hasNoAltMDSourceGroupCounter;

    public int noAltMDSourceGroupCounter()
    {
        if (!hasNoAltMDSourceGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoAltMDSourceGroupCounter");
        }

        return noAltMDSourceGroupCounter;
    }

    public boolean hasNoAltMDSourceGroupCounter()
    {
        return hasNoAltMDSourceGroupCounter;
    }




    private AltMDSourceGroupIterator altMDSourceGroupIterator = new AltMDSourceGroupIterator(this);
    public AltMDSourceGroupIterator altMDSourceGroupIterator()
    {
        return altMDSourceGroupIterator.iterator();
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
        // Decode MarketDataRequestReject
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

            case Constants.M_D_REQ_REJ_REASON:
                hasMDReqRejReason = true;
                mDReqRejReason = buffer.getChar(valueOffset);
                break;

            case Constants.NO_ALT_M_D_SOURCE_GROUP_COUNTER:
                hasNoAltMDSourceGroupCounter = true;
                noAltMDSourceGroupCounter = getInt(buffer, valueOffset, endOfField, 816, CODEC_VALIDATION_ENABLED);
                if (altMDSourceGroup == null)
                {
                    altMDSourceGroup = new AltMDSourceGroupDecoder(trailer, messageFields);
                }
                AltMDSourceGroupDecoder altMDSourceGroupCurrent = altMDSourceGroup;
                position = endOfField + 1;
                final int noAltMDSourceGroupCounter = this.noAltMDSourceGroupCounter;
                for (int i = 0; i < noAltMDSourceGroupCounter && position < end; i++)
                {
                    if (altMDSourceGroupCurrent != null)
                    {
                        position += altMDSourceGroupCurrent.decode(buffer, position, end - position);
                        altMDSourceGroupCurrent = altMDSourceGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (altMDSourceGroup.ALL_GROUP_FIELDS.contains(checkTag))
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
        this.resetMDReqID();
        this.resetMDReqRejReason();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        this.resetAltMDSourceGroup();
    }

    public void resetMDReqID()
    {
        mDReqIDOffset = 0;
        mDReqIDLength = 0;
    }

    public void resetMDReqRejReason()
    {
        hasMDReqRejReason = false;
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

    public void resetAltMDSourceGroup()
    {
        for (final AltMDSourceGroupDecoder altMDSourceGroupDecoder : altMDSourceGroupIterator.iterator())
        {
            altMDSourceGroupDecoder.reset();
            if (altMDSourceGroupDecoder.next() == null)
            {
                break;
            }
        }
        noAltMDSourceGroupCounter = MISSING_INT;
        hasNoAltMDSourceGroupCounter = false;
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
        builder.append("\"MessageName\": \"MarketDataRequestReject\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        indent(builder, level);
        builder.append("\"MDReqID\": \"");
        builder.append(this.mDReqID(), 0, mDReqIDLength());
        builder.append("\",\n");

        if (hasMDReqRejReason())
        {
            indent(builder, level);
            builder.append("\"MDReqRejReason\": \"");
            builder.append(mDReqRejReason);
            builder.append("\",\n");
        }

        if (hasNoAltMDSourceGroupCounter)
        {
            indent(builder, level);
            builder.append("\"AltMDSourceGroup\": [\n");
            AltMDSourceGroupDecoder altMDSourceGroup = this.altMDSourceGroup;
            for (int i = 0, size = this.noAltMDSourceGroupCounter; i < size; i++)
            {
                indent(builder, level);
                altMDSourceGroup.appendTo(builder, level + 1);
                if (altMDSourceGroup.next() != null)
                {
                    builder.append(',');
                }
                builder.append('\n');
                altMDSourceGroup = altMDSourceGroup.next();            }
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
    public MarketDataRequestRejectEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((MarketDataRequestRejectEncoder)encoder);
    }

    public MarketDataRequestRejectEncoder toEncoder(final MarketDataRequestRejectEncoder encoder)
    {
        encoder.reset();
        encoder.mDReqID(this.mDReqID(), 0, mDReqIDLength());
        if (hasMDReqRejReason())
        {
            encoder.mDReqRejReason(this.mDReqRejReason());
        }

        if (hasNoAltMDSourceGroupCounter)
        {
            final int size = this.noAltMDSourceGroupCounter;
            AltMDSourceGroupDecoder altMDSourceGroup = this.altMDSourceGroup;
            AltMDSourceGroupEncoder altMDSourceGroupEncoder = encoder.altMDSourceGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (altMDSourceGroup != null)
                {
                    altMDSourceGroup.toEncoder(altMDSourceGroupEncoder);
                    altMDSourceGroup = altMDSourceGroup.next();
                    altMDSourceGroupEncoder = altMDSourceGroupEncoder.next();
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
