/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2.builder;

import uk.co.real_logic.artio.builder.AbstractBusinessMessageRejectEncoder;
import org.agrona.MutableDirectBuffer;
import org.agrona.AsciiSequenceView;
import static uk.co.real_logic.artio.dictionary.generation.CodecUtil.*;
import static uk.co.real_logic.artio.dictionary.SessionConstants.*;
import uk.co.real_logic.artio.builder.Encoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.HeaderEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.TrailerEncoder;
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
import org.agrona.DirectBuffer;
import org.agrona.MutableDirectBuffer;
import org.agrona.concurrent.UnsafeBuffer;
import org.agrona.AsciiSequenceView;
import static java.nio.charset.StandardCharsets.US_ASCII;
import static uk.co.real_logic.artio.builder.Validation.CODEC_VALIDATION_ENABLED;
import static uk.co.real_logic.artio.builder.RejectUnknownField.CODEC_REJECT_UNKNOWN_FIELD_ENABLED;
import static uk.co.real_logic.artio.builder.RejectUnknownEnumValue.CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED;
import com.swiftalgo.ms.codecs.fix50sp2.*;


public class BusinessMessageRejectEncoder implements AbstractBusinessMessageRejectEncoder
{
    public long messageType()
    {
        return 106L;
    }

    public BusinessMessageRejectEncoder()
    {
        header.msgType("j");
    }

    private final TrailerEncoder trailer = new TrailerEncoder();

    public TrailerEncoder trailer()
    {
        return trailer;
    }

    private final HeaderEncoder header = new HeaderEncoder();

    public HeaderEncoder header()
    {
        return header;
    }

    private static final int refSeqNumHeaderLength = 3;
    private static final byte[] refSeqNumHeader = new byte[] {52, 53, (byte) '='};

    private static final int refMsgTypeHeaderLength = 4;
    private static final byte[] refMsgTypeHeader = new byte[] {51, 55, 50, (byte) '='};

    private static final int refApplVerIDHeaderLength = 5;
    private static final byte[] refApplVerIDHeader = new byte[] {49, 49, 51, 48, (byte) '='};

    private static final int refApplExtIDHeaderLength = 5;
    private static final byte[] refApplExtIDHeader = new byte[] {49, 52, 48, 54, (byte) '='};

    private static final int refCstmApplVerIDHeaderLength = 5;
    private static final byte[] refCstmApplVerIDHeader = new byte[] {49, 49, 51, 49, (byte) '='};

    private static final int businessRejectRefIDHeaderLength = 4;
    private static final byte[] businessRejectRefIDHeader = new byte[] {51, 55, 57, (byte) '='};

    private static final int businessRejectReasonHeaderLength = 4;
    private static final byte[] businessRejectReasonHeader = new byte[] {51, 56, 48, (byte) '='};

    private static final int textHeaderLength = 3;
    private static final byte[] textHeader = new byte[] {53, 56, (byte) '='};

    private static final int encodedTextLenHeaderLength = 4;
    private static final byte[] encodedTextLenHeader = new byte[] {51, 53, 52, (byte) '='};

    private static final int encodedTextHeaderLength = 4;
    private static final byte[] encodedTextHeader = new byte[] {51, 53, 53, (byte) '='};

    private int refSeqNum;

    private boolean hasRefSeqNum;

    public boolean hasRefSeqNum()
    {
        return hasRefSeqNum;
    }

    public BusinessMessageRejectEncoder refSeqNum(int value)
    {
        refSeqNum = value;
        hasRefSeqNum = true;
        return this;
    }

    public int refSeqNum()
    {
        return refSeqNum;
    }

    private final MutableDirectBuffer refMsgType = new UnsafeBuffer();

    private int refMsgTypeOffset = 0;

    private int refMsgTypeLength = 0;

    public BusinessMessageRejectEncoder refMsgType(final DirectBuffer value, final int offset, final int length)
    {
        refMsgType.wrap(value);
        refMsgTypeOffset = offset;
        refMsgTypeLength = length;
        return this;
    }

    public BusinessMessageRejectEncoder refMsgType(final DirectBuffer value, final int length)
    {
        return refMsgType(value, 0, length);
    }

    public BusinessMessageRejectEncoder refMsgType(final DirectBuffer value)
    {
        return refMsgType(value, 0, value.capacity());
    }

    public BusinessMessageRejectEncoder refMsgType(final byte[] value, final int offset, final int length)
    {
        refMsgType.wrap(value);
        refMsgTypeOffset = offset;
        refMsgTypeLength = length;
        return this;
    }

    public BusinessMessageRejectEncoder refMsgTypeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(refMsgType, value, offset, length);
        refMsgTypeOffset = offset;
        refMsgTypeLength = length;
        return this;
    }

    public BusinessMessageRejectEncoder refMsgType(final byte[] value, final int length)
    {
        return refMsgType(value, 0, length);
    }

    public BusinessMessageRejectEncoder refMsgType(final byte[] value)
    {
        return refMsgType(value, 0, value.length);
    }

    public boolean hasRefMsgType()
    {
        return refMsgTypeLength > 0;
    }

    public MutableDirectBuffer refMsgType()
    {
        return refMsgType;
    }

    public String refMsgTypeAsString()
    {
        return refMsgType.getStringWithoutLengthAscii(refMsgTypeOffset, refMsgTypeLength);
    }

    public BusinessMessageRejectEncoder refMsgType(final CharSequence value)
    {
        toBytes(value, refMsgType);
        refMsgTypeOffset = 0;
        refMsgTypeLength = value.length();
        return this;
    }

    public BusinessMessageRejectEncoder refMsgType(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            refMsgType.wrap(buffer);
            refMsgTypeOffset = value.offset();
            refMsgTypeLength = value.length();
        }
        return this;
    }

    public BusinessMessageRejectEncoder refMsgType(final char[] value)
    {
        return refMsgType(value, 0, value.length);
    }

    public BusinessMessageRejectEncoder refMsgType(final char[] value, final int length)
    {
        return refMsgType(value, 0, length);
    }

    public BusinessMessageRejectEncoder refMsgType(final char[] value, final int offset, final int length)
    {
        toBytes(value, refMsgType, offset, length);
        refMsgTypeOffset = 0;
        refMsgTypeLength = length;
        return this;
    }

    private final MutableDirectBuffer refApplVerID = new UnsafeBuffer();

    private int refApplVerIDOffset = 0;

    private int refApplVerIDLength = 0;

    public BusinessMessageRejectEncoder refApplVerID(final DirectBuffer value, final int offset, final int length)
    {
        refApplVerID.wrap(value);
        refApplVerIDOffset = offset;
        refApplVerIDLength = length;
        return this;
    }

    public BusinessMessageRejectEncoder refApplVerID(final DirectBuffer value, final int length)
    {
        return refApplVerID(value, 0, length);
    }

    public BusinessMessageRejectEncoder refApplVerID(final DirectBuffer value)
    {
        return refApplVerID(value, 0, value.capacity());
    }

    public BusinessMessageRejectEncoder refApplVerID(final byte[] value, final int offset, final int length)
    {
        refApplVerID.wrap(value);
        refApplVerIDOffset = offset;
        refApplVerIDLength = length;
        return this;
    }

    public BusinessMessageRejectEncoder refApplVerIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(refApplVerID, value, offset, length);
        refApplVerIDOffset = offset;
        refApplVerIDLength = length;
        return this;
    }

    public BusinessMessageRejectEncoder refApplVerID(final byte[] value, final int length)
    {
        return refApplVerID(value, 0, length);
    }

    public BusinessMessageRejectEncoder refApplVerID(final byte[] value)
    {
        return refApplVerID(value, 0, value.length);
    }

    public boolean hasRefApplVerID()
    {
        return refApplVerIDLength > 0;
    }

    public MutableDirectBuffer refApplVerID()
    {
        return refApplVerID;
    }

    public String refApplVerIDAsString()
    {
        return refApplVerID.getStringWithoutLengthAscii(refApplVerIDOffset, refApplVerIDLength);
    }

    public BusinessMessageRejectEncoder refApplVerID(final CharSequence value)
    {
        toBytes(value, refApplVerID);
        refApplVerIDOffset = 0;
        refApplVerIDLength = value.length();
        return this;
    }

    public BusinessMessageRejectEncoder refApplVerID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            refApplVerID.wrap(buffer);
            refApplVerIDOffset = value.offset();
            refApplVerIDLength = value.length();
        }
        return this;
    }

    public BusinessMessageRejectEncoder refApplVerID(final char[] value)
    {
        return refApplVerID(value, 0, value.length);
    }

    public BusinessMessageRejectEncoder refApplVerID(final char[] value, final int length)
    {
        return refApplVerID(value, 0, length);
    }

    public BusinessMessageRejectEncoder refApplVerID(final char[] value, final int offset, final int length)
    {
        toBytes(value, refApplVerID, offset, length);
        refApplVerIDOffset = 0;
        refApplVerIDLength = length;
        return this;
    }

    private int refApplExtID;

    private boolean hasRefApplExtID;

    public boolean hasRefApplExtID()
    {
        return hasRefApplExtID;
    }

    public BusinessMessageRejectEncoder refApplExtID(int value)
    {
        refApplExtID = value;
        hasRefApplExtID = true;
        return this;
    }

    public int refApplExtID()
    {
        return refApplExtID;
    }

    private final MutableDirectBuffer refCstmApplVerID = new UnsafeBuffer();

    private int refCstmApplVerIDOffset = 0;

    private int refCstmApplVerIDLength = 0;

    public BusinessMessageRejectEncoder refCstmApplVerID(final DirectBuffer value, final int offset, final int length)
    {
        refCstmApplVerID.wrap(value);
        refCstmApplVerIDOffset = offset;
        refCstmApplVerIDLength = length;
        return this;
    }

    public BusinessMessageRejectEncoder refCstmApplVerID(final DirectBuffer value, final int length)
    {
        return refCstmApplVerID(value, 0, length);
    }

    public BusinessMessageRejectEncoder refCstmApplVerID(final DirectBuffer value)
    {
        return refCstmApplVerID(value, 0, value.capacity());
    }

    public BusinessMessageRejectEncoder refCstmApplVerID(final byte[] value, final int offset, final int length)
    {
        refCstmApplVerID.wrap(value);
        refCstmApplVerIDOffset = offset;
        refCstmApplVerIDLength = length;
        return this;
    }

    public BusinessMessageRejectEncoder refCstmApplVerIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(refCstmApplVerID, value, offset, length);
        refCstmApplVerIDOffset = offset;
        refCstmApplVerIDLength = length;
        return this;
    }

    public BusinessMessageRejectEncoder refCstmApplVerID(final byte[] value, final int length)
    {
        return refCstmApplVerID(value, 0, length);
    }

    public BusinessMessageRejectEncoder refCstmApplVerID(final byte[] value)
    {
        return refCstmApplVerID(value, 0, value.length);
    }

    public boolean hasRefCstmApplVerID()
    {
        return refCstmApplVerIDLength > 0;
    }

    public MutableDirectBuffer refCstmApplVerID()
    {
        return refCstmApplVerID;
    }

    public String refCstmApplVerIDAsString()
    {
        return refCstmApplVerID.getStringWithoutLengthAscii(refCstmApplVerIDOffset, refCstmApplVerIDLength);
    }

    public BusinessMessageRejectEncoder refCstmApplVerID(final CharSequence value)
    {
        toBytes(value, refCstmApplVerID);
        refCstmApplVerIDOffset = 0;
        refCstmApplVerIDLength = value.length();
        return this;
    }

    public BusinessMessageRejectEncoder refCstmApplVerID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            refCstmApplVerID.wrap(buffer);
            refCstmApplVerIDOffset = value.offset();
            refCstmApplVerIDLength = value.length();
        }
        return this;
    }

    public BusinessMessageRejectEncoder refCstmApplVerID(final char[] value)
    {
        return refCstmApplVerID(value, 0, value.length);
    }

    public BusinessMessageRejectEncoder refCstmApplVerID(final char[] value, final int length)
    {
        return refCstmApplVerID(value, 0, length);
    }

    public BusinessMessageRejectEncoder refCstmApplVerID(final char[] value, final int offset, final int length)
    {
        toBytes(value, refCstmApplVerID, offset, length);
        refCstmApplVerIDOffset = 0;
        refCstmApplVerIDLength = length;
        return this;
    }

    private final MutableDirectBuffer businessRejectRefID = new UnsafeBuffer();

    private int businessRejectRefIDOffset = 0;

    private int businessRejectRefIDLength = 0;

    public BusinessMessageRejectEncoder businessRejectRefID(final DirectBuffer value, final int offset, final int length)
    {
        businessRejectRefID.wrap(value);
        businessRejectRefIDOffset = offset;
        businessRejectRefIDLength = length;
        return this;
    }

    public BusinessMessageRejectEncoder businessRejectRefID(final DirectBuffer value, final int length)
    {
        return businessRejectRefID(value, 0, length);
    }

    public BusinessMessageRejectEncoder businessRejectRefID(final DirectBuffer value)
    {
        return businessRejectRefID(value, 0, value.capacity());
    }

    public BusinessMessageRejectEncoder businessRejectRefID(final byte[] value, final int offset, final int length)
    {
        businessRejectRefID.wrap(value);
        businessRejectRefIDOffset = offset;
        businessRejectRefIDLength = length;
        return this;
    }

    public BusinessMessageRejectEncoder businessRejectRefIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(businessRejectRefID, value, offset, length);
        businessRejectRefIDOffset = offset;
        businessRejectRefIDLength = length;
        return this;
    }

    public BusinessMessageRejectEncoder businessRejectRefID(final byte[] value, final int length)
    {
        return businessRejectRefID(value, 0, length);
    }

    public BusinessMessageRejectEncoder businessRejectRefID(final byte[] value)
    {
        return businessRejectRefID(value, 0, value.length);
    }

    public boolean hasBusinessRejectRefID()
    {
        return businessRejectRefIDLength > 0;
    }

    public MutableDirectBuffer businessRejectRefID()
    {
        return businessRejectRefID;
    }

    public String businessRejectRefIDAsString()
    {
        return businessRejectRefID.getStringWithoutLengthAscii(businessRejectRefIDOffset, businessRejectRefIDLength);
    }

    public BusinessMessageRejectEncoder businessRejectRefID(final CharSequence value)
    {
        toBytes(value, businessRejectRefID);
        businessRejectRefIDOffset = 0;
        businessRejectRefIDLength = value.length();
        return this;
    }

    public BusinessMessageRejectEncoder businessRejectRefID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            businessRejectRefID.wrap(buffer);
            businessRejectRefIDOffset = value.offset();
            businessRejectRefIDLength = value.length();
        }
        return this;
    }

    public BusinessMessageRejectEncoder businessRejectRefID(final char[] value)
    {
        return businessRejectRefID(value, 0, value.length);
    }

    public BusinessMessageRejectEncoder businessRejectRefID(final char[] value, final int length)
    {
        return businessRejectRefID(value, 0, length);
    }

    public BusinessMessageRejectEncoder businessRejectRefID(final char[] value, final int offset, final int length)
    {
        toBytes(value, businessRejectRefID, offset, length);
        businessRejectRefIDOffset = 0;
        businessRejectRefIDLength = length;
        return this;
    }

    private int businessRejectReason;

    private boolean hasBusinessRejectReason;

    public boolean hasBusinessRejectReason()
    {
        return hasBusinessRejectReason;
    }

    public BusinessMessageRejectEncoder businessRejectReason(int value)
    {
        businessRejectReason = value;
        hasBusinessRejectReason = true;
        return this;
    }

    public int businessRejectReason()
    {
        return businessRejectReason;
    }

    public BusinessMessageRejectEncoder businessRejectReason(BusinessRejectReason value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == BusinessRejectReason.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: businessRejectReason Value: " + value );
            }
            if (value == BusinessRejectReason.NULL_VAL)
            {
                return this;
            }
        }
        return businessRejectReason(value.representation());
    }

    private final MutableDirectBuffer text = new UnsafeBuffer();

    private int textOffset = 0;

    private int textLength = 0;

    public BusinessMessageRejectEncoder text(final DirectBuffer value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public BusinessMessageRejectEncoder text(final DirectBuffer value, final int length)
    {
        return text(value, 0, length);
    }

    public BusinessMessageRejectEncoder text(final DirectBuffer value)
    {
        return text(value, 0, value.capacity());
    }

    public BusinessMessageRejectEncoder text(final byte[] value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public BusinessMessageRejectEncoder textAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(text, value, offset, length);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public BusinessMessageRejectEncoder text(final byte[] value, final int length)
    {
        return text(value, 0, length);
    }

    public BusinessMessageRejectEncoder text(final byte[] value)
    {
        return text(value, 0, value.length);
    }

    public boolean hasText()
    {
        return textLength > 0;
    }

    public MutableDirectBuffer text()
    {
        return text;
    }

    public String textAsString()
    {
        return text.getStringWithoutLengthAscii(textOffset, textLength);
    }

    public BusinessMessageRejectEncoder text(final CharSequence value)
    {
        toBytes(value, text);
        textOffset = 0;
        textLength = value.length();
        return this;
    }

    public BusinessMessageRejectEncoder text(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            text.wrap(buffer);
            textOffset = value.offset();
            textLength = value.length();
        }
        return this;
    }

    public BusinessMessageRejectEncoder text(final char[] value)
    {
        return text(value, 0, value.length);
    }

    public BusinessMessageRejectEncoder text(final char[] value, final int length)
    {
        return text(value, 0, length);
    }

    public BusinessMessageRejectEncoder text(final char[] value, final int offset, final int length)
    {
        toBytes(value, text, offset, length);
        textOffset = 0;
        textLength = length;
        return this;
    }

    private int encodedTextLen;

    private boolean hasEncodedTextLen;

    public boolean hasEncodedTextLen()
    {
        return hasEncodedTextLen;
    }

    public BusinessMessageRejectEncoder encodedTextLen(int value)
    {
        encodedTextLen = value;
        hasEncodedTextLen = true;
        return this;
    }

    public int encodedTextLen()
    {
        return encodedTextLen;
    }

    private byte[] encodedText;

    private boolean hasEncodedText;

    public boolean hasEncodedText()
    {
        return hasEncodedText;
    }

    public BusinessMessageRejectEncoder encodedText(byte[] value)
    {
        encodedText = value;
        hasEncodedText = true;
        return this;
    }

    public byte[] encodedText()
    {
        return encodedText;
    }

    public BusinessMessageRejectEncoder encodedTextAsCopy(final byte[] value, final int offset, final int length)
    {
        encodedText = copyInto(encodedText, value, offset, length);
        hasEncodedText = true;
        return this;
    }

    public long encode(final MutableAsciiBuffer buffer, final int offset)
    {
        final long startMessageResult = header.startMessage(buffer, offset);
        final int bodyStart = Encoder.offset(startMessageResult);
        int position = bodyStart + Encoder.length(startMessageResult);

        if (hasRefSeqNum)
        {
            buffer.putBytes(position, refSeqNumHeader, 0, refSeqNumHeaderLength);
            position += refSeqNumHeaderLength;
            position += buffer.putIntAscii(position, refSeqNum);
            buffer.putSeparator(position);
            position++;
        }

        if (refMsgTypeLength > 0)
        {
            buffer.putBytes(position, refMsgTypeHeader, 0, refMsgTypeHeaderLength);
            position += refMsgTypeHeaderLength;
            buffer.putBytes(position, refMsgType, refMsgTypeOffset, refMsgTypeLength);
            position += refMsgTypeLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: RefMsgType");
        }

        if (refApplVerIDLength > 0)
        {
            buffer.putBytes(position, refApplVerIDHeader, 0, refApplVerIDHeaderLength);
            position += refApplVerIDHeaderLength;
            buffer.putBytes(position, refApplVerID, refApplVerIDOffset, refApplVerIDLength);
            position += refApplVerIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasRefApplExtID)
        {
            buffer.putBytes(position, refApplExtIDHeader, 0, refApplExtIDHeaderLength);
            position += refApplExtIDHeaderLength;
            position += buffer.putIntAscii(position, refApplExtID);
            buffer.putSeparator(position);
            position++;
        }

        if (refCstmApplVerIDLength > 0)
        {
            buffer.putBytes(position, refCstmApplVerIDHeader, 0, refCstmApplVerIDHeaderLength);
            position += refCstmApplVerIDHeaderLength;
            buffer.putBytes(position, refCstmApplVerID, refCstmApplVerIDOffset, refCstmApplVerIDLength);
            position += refCstmApplVerIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (businessRejectRefIDLength > 0)
        {
            buffer.putBytes(position, businessRejectRefIDHeader, 0, businessRejectRefIDHeaderLength);
            position += businessRejectRefIDHeaderLength;
            buffer.putBytes(position, businessRejectRefID, businessRejectRefIDOffset, businessRejectRefIDLength);
            position += businessRejectRefIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasBusinessRejectReason)
        {
            buffer.putBytes(position, businessRejectReasonHeader, 0, businessRejectReasonHeaderLength);
            position += businessRejectReasonHeaderLength;
            position += buffer.putIntAscii(position, businessRejectReason);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: BusinessRejectReason");
        }

        if (textLength > 0)
        {
            buffer.putBytes(position, textHeader, 0, textHeaderLength);
            position += textHeaderLength;
            buffer.putBytes(position, text, textOffset, textLength);
            position += textLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasEncodedTextLen)
        {
            buffer.putBytes(position, encodedTextLenHeader, 0, encodedTextLenHeaderLength);
            position += encodedTextLenHeaderLength;
            position += buffer.putIntAscii(position, encodedTextLen);
            buffer.putSeparator(position);
            position++;
        }

        if (hasEncodedText)
        {
            buffer.putBytes(position, encodedTextHeader, 0, encodedTextHeaderLength);
            position += encodedTextHeaderLength;
            buffer.putBytes(position, encodedText);
            position += encodedText.length;
            buffer.putSeparator(position);
            position++;
        }
        position += trailer.startTrailer(buffer, position);

        final int messageStart = header.finishHeader(buffer, bodyStart, position - bodyStart);
        return trailer.finishMessage(buffer, messageStart, position);
    }

    public void reset()
    {
        header.reset();
        trailer.reset();
        resetMessage();
    }

    public void resetMessage()
    {
        this.resetRefSeqNum();
        this.resetRefMsgType();
        this.resetRefApplVerID();
        this.resetRefApplExtID();
        this.resetRefCstmApplVerID();
        this.resetBusinessRejectRefID();
        this.resetBusinessRejectReason();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
    }

    public void resetRefSeqNum()
    {
        hasRefSeqNum = false;
    }

    public void resetRefMsgType()
    {
        refMsgTypeLength = 0;
    }

    public void resetRefApplVerID()
    {
        refApplVerIDLength = 0;
    }

    public void resetRefApplExtID()
    {
        hasRefApplExtID = false;
    }

    public void resetRefCstmApplVerID()
    {
        refCstmApplVerIDLength = 0;
    }

    public void resetBusinessRejectRefID()
    {
        businessRejectRefIDLength = 0;
    }

    public void resetBusinessRejectReason()
    {
        hasBusinessRejectReason = false;
    }

    public void resetText()
    {
        textLength = 0;
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
        builder.append("\"MessageName\": \"BusinessMessageReject\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasRefSeqNum())
        {
            indent(builder, level);
            builder.append("\"RefSeqNum\": \"");
            builder.append(refSeqNum);
            builder.append("\",\n");
        }

        if (hasRefMsgType())
        {
            indent(builder, level);
            builder.append("\"RefMsgType\": \"");
            appendBuffer(builder, refMsgType, refMsgTypeOffset, refMsgTypeLength);
            builder.append("\",\n");
        }

        if (hasRefApplVerID())
        {
            indent(builder, level);
            builder.append("\"RefApplVerID\": \"");
            appendBuffer(builder, refApplVerID, refApplVerIDOffset, refApplVerIDLength);
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
            appendBuffer(builder, refCstmApplVerID, refCstmApplVerIDOffset, refCstmApplVerIDLength);
            builder.append("\",\n");
        }

        if (hasBusinessRejectRefID())
        {
            indent(builder, level);
            builder.append("\"BusinessRejectRefID\": \"");
            appendBuffer(builder, businessRejectRefID, businessRejectRefIDOffset, businessRejectRefIDLength);
            builder.append("\",\n");
        }

        if (hasBusinessRejectReason())
        {
            indent(builder, level);
            builder.append("\"BusinessRejectReason\": \"");
            builder.append(businessRejectReason);
            builder.append("\",\n");
        }

        if (hasText())
        {
            indent(builder, level);
            builder.append("\"Text\": \"");
            appendBuffer(builder, text, textOffset, textLength);
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
    public BusinessMessageRejectEncoder copyTo(final Encoder encoder)
    {
        return copyTo((BusinessMessageRejectEncoder)encoder);
    }

    public BusinessMessageRejectEncoder copyTo(final BusinessMessageRejectEncoder encoder)
    {
        encoder.reset();
        if (hasRefSeqNum())
        {
            encoder.refSeqNum(this.refSeqNum());
        }

        if (hasRefMsgType())
        {
            encoder.refMsgTypeAsCopy(refMsgType.byteArray(), 0, refMsgTypeLength);
        }

        if (hasRefApplVerID())
        {
            encoder.refApplVerIDAsCopy(refApplVerID.byteArray(), 0, refApplVerIDLength);
        }

        if (hasRefApplExtID())
        {
            encoder.refApplExtID(this.refApplExtID());
        }

        if (hasRefCstmApplVerID())
        {
            encoder.refCstmApplVerIDAsCopy(refCstmApplVerID.byteArray(), 0, refCstmApplVerIDLength);
        }

        if (hasBusinessRejectRefID())
        {
            encoder.businessRejectRefIDAsCopy(businessRejectRefID.byteArray(), 0, businessRejectRefIDLength);
        }

        if (hasBusinessRejectReason())
        {
            encoder.businessRejectReason(this.businessRejectReason());
        }

        if (hasText())
        {
            encoder.textAsCopy(text.byteArray(), 0, textLength);
        }

        if (hasEncodedTextLen())
        {
            encoder.encodedTextLen(this.encodedTextLen());
        }

        if (hasEncodedText())
        {
            encoder.encodedTextAsCopy(this.encodedText(), 0, encodedTextLen());
            encoder.encodedTextLen(encodedTextLen());
        }
        return encoder;
    }

}
