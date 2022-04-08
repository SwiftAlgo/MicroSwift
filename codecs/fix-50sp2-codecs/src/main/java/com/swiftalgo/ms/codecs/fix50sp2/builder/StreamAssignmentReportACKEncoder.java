/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2.builder;

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


public class StreamAssignmentReportACKEncoder implements Encoder
{
    public long messageType()
    {
        return 17731L;
    }

    public StreamAssignmentReportACKEncoder()
    {
        header.msgType("CE");
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

    private static final int streamAsgnAckTypeHeaderLength = 5;
    private static final byte[] streamAsgnAckTypeHeader = new byte[] {49, 53, 48, 51, (byte) '='};

    private static final int streamAsgnRptIDHeaderLength = 5;
    private static final byte[] streamAsgnRptIDHeader = new byte[] {49, 53, 48, 49, (byte) '='};

    private static final int streamAsgnRejReasonHeaderLength = 5;
    private static final byte[] streamAsgnRejReasonHeader = new byte[] {49, 53, 48, 50, (byte) '='};

    private static final int textHeaderLength = 3;
    private static final byte[] textHeader = new byte[] {53, 56, (byte) '='};

    private static final int encodedTextLenHeaderLength = 4;
    private static final byte[] encodedTextLenHeader = new byte[] {51, 53, 52, (byte) '='};

    private static final int encodedTextHeaderLength = 4;
    private static final byte[] encodedTextHeader = new byte[] {51, 53, 53, (byte) '='};

    private int streamAsgnAckType;

    private boolean hasStreamAsgnAckType;

    public boolean hasStreamAsgnAckType()
    {
        return hasStreamAsgnAckType;
    }

    public StreamAssignmentReportACKEncoder streamAsgnAckType(int value)
    {
        streamAsgnAckType = value;
        hasStreamAsgnAckType = true;
        return this;
    }

    public int streamAsgnAckType()
    {
        return streamAsgnAckType;
    }

    public StreamAssignmentReportACKEncoder streamAsgnAckType(StreamAsgnAckType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == StreamAsgnAckType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: streamAsgnAckType Value: " + value );
            }
            if (value == StreamAsgnAckType.NULL_VAL)
            {
                return this;
            }
        }
        return streamAsgnAckType(value.representation());
    }

    private final MutableDirectBuffer streamAsgnRptID = new UnsafeBuffer();

    private int streamAsgnRptIDOffset = 0;

    private int streamAsgnRptIDLength = 0;

    public StreamAssignmentReportACKEncoder streamAsgnRptID(final DirectBuffer value, final int offset, final int length)
    {
        streamAsgnRptID.wrap(value);
        streamAsgnRptIDOffset = offset;
        streamAsgnRptIDLength = length;
        return this;
    }

    public StreamAssignmentReportACKEncoder streamAsgnRptID(final DirectBuffer value, final int length)
    {
        return streamAsgnRptID(value, 0, length);
    }

    public StreamAssignmentReportACKEncoder streamAsgnRptID(final DirectBuffer value)
    {
        return streamAsgnRptID(value, 0, value.capacity());
    }

    public StreamAssignmentReportACKEncoder streamAsgnRptID(final byte[] value, final int offset, final int length)
    {
        streamAsgnRptID.wrap(value);
        streamAsgnRptIDOffset = offset;
        streamAsgnRptIDLength = length;
        return this;
    }

    public StreamAssignmentReportACKEncoder streamAsgnRptIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(streamAsgnRptID, value, offset, length);
        streamAsgnRptIDOffset = offset;
        streamAsgnRptIDLength = length;
        return this;
    }

    public StreamAssignmentReportACKEncoder streamAsgnRptID(final byte[] value, final int length)
    {
        return streamAsgnRptID(value, 0, length);
    }

    public StreamAssignmentReportACKEncoder streamAsgnRptID(final byte[] value)
    {
        return streamAsgnRptID(value, 0, value.length);
    }

    public boolean hasStreamAsgnRptID()
    {
        return streamAsgnRptIDLength > 0;
    }

    public MutableDirectBuffer streamAsgnRptID()
    {
        return streamAsgnRptID;
    }

    public String streamAsgnRptIDAsString()
    {
        return streamAsgnRptID.getStringWithoutLengthAscii(streamAsgnRptIDOffset, streamAsgnRptIDLength);
    }

    public StreamAssignmentReportACKEncoder streamAsgnRptID(final CharSequence value)
    {
        toBytes(value, streamAsgnRptID);
        streamAsgnRptIDOffset = 0;
        streamAsgnRptIDLength = value.length();
        return this;
    }

    public StreamAssignmentReportACKEncoder streamAsgnRptID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            streamAsgnRptID.wrap(buffer);
            streamAsgnRptIDOffset = value.offset();
            streamAsgnRptIDLength = value.length();
        }
        return this;
    }

    public StreamAssignmentReportACKEncoder streamAsgnRptID(final char[] value)
    {
        return streamAsgnRptID(value, 0, value.length);
    }

    public StreamAssignmentReportACKEncoder streamAsgnRptID(final char[] value, final int length)
    {
        return streamAsgnRptID(value, 0, length);
    }

    public StreamAssignmentReportACKEncoder streamAsgnRptID(final char[] value, final int offset, final int length)
    {
        toBytes(value, streamAsgnRptID, offset, length);
        streamAsgnRptIDOffset = 0;
        streamAsgnRptIDLength = length;
        return this;
    }

    private int streamAsgnRejReason;

    private boolean hasStreamAsgnRejReason;

    public boolean hasStreamAsgnRejReason()
    {
        return hasStreamAsgnRejReason;
    }

    public StreamAssignmentReportACKEncoder streamAsgnRejReason(int value)
    {
        streamAsgnRejReason = value;
        hasStreamAsgnRejReason = true;
        return this;
    }

    public int streamAsgnRejReason()
    {
        return streamAsgnRejReason;
    }

    public StreamAssignmentReportACKEncoder streamAsgnRejReason(StreamAsgnRejReason value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == StreamAsgnRejReason.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: streamAsgnRejReason Value: " + value );
            }
            if (value == StreamAsgnRejReason.NULL_VAL)
            {
                return this;
            }
        }
        return streamAsgnRejReason(value.representation());
    }

    private final MutableDirectBuffer text = new UnsafeBuffer();

    private int textOffset = 0;

    private int textLength = 0;

    public StreamAssignmentReportACKEncoder text(final DirectBuffer value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public StreamAssignmentReportACKEncoder text(final DirectBuffer value, final int length)
    {
        return text(value, 0, length);
    }

    public StreamAssignmentReportACKEncoder text(final DirectBuffer value)
    {
        return text(value, 0, value.capacity());
    }

    public StreamAssignmentReportACKEncoder text(final byte[] value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public StreamAssignmentReportACKEncoder textAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(text, value, offset, length);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public StreamAssignmentReportACKEncoder text(final byte[] value, final int length)
    {
        return text(value, 0, length);
    }

    public StreamAssignmentReportACKEncoder text(final byte[] value)
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

    public StreamAssignmentReportACKEncoder text(final CharSequence value)
    {
        toBytes(value, text);
        textOffset = 0;
        textLength = value.length();
        return this;
    }

    public StreamAssignmentReportACKEncoder text(final AsciiSequenceView value)
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

    public StreamAssignmentReportACKEncoder text(final char[] value)
    {
        return text(value, 0, value.length);
    }

    public StreamAssignmentReportACKEncoder text(final char[] value, final int length)
    {
        return text(value, 0, length);
    }

    public StreamAssignmentReportACKEncoder text(final char[] value, final int offset, final int length)
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

    public StreamAssignmentReportACKEncoder encodedTextLen(int value)
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

    public StreamAssignmentReportACKEncoder encodedText(byte[] value)
    {
        encodedText = value;
        hasEncodedText = true;
        return this;
    }

    public byte[] encodedText()
    {
        return encodedText;
    }

    public StreamAssignmentReportACKEncoder encodedTextAsCopy(final byte[] value, final int offset, final int length)
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

        if (hasStreamAsgnAckType)
        {
            buffer.putBytes(position, streamAsgnAckTypeHeader, 0, streamAsgnAckTypeHeaderLength);
            position += streamAsgnAckTypeHeaderLength;
            position += buffer.putIntAscii(position, streamAsgnAckType);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: StreamAsgnAckType");
        }

        if (streamAsgnRptIDLength > 0)
        {
            buffer.putBytes(position, streamAsgnRptIDHeader, 0, streamAsgnRptIDHeaderLength);
            position += streamAsgnRptIDHeaderLength;
            buffer.putBytes(position, streamAsgnRptID, streamAsgnRptIDOffset, streamAsgnRptIDLength);
            position += streamAsgnRptIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: StreamAsgnRptID");
        }

        if (hasStreamAsgnRejReason)
        {
            buffer.putBytes(position, streamAsgnRejReasonHeader, 0, streamAsgnRejReasonHeaderLength);
            position += streamAsgnRejReasonHeaderLength;
            position += buffer.putIntAscii(position, streamAsgnRejReason);
            buffer.putSeparator(position);
            position++;
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
        this.resetStreamAsgnAckType();
        this.resetStreamAsgnRptID();
        this.resetStreamAsgnRejReason();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
    }

    public void resetStreamAsgnAckType()
    {
        hasStreamAsgnAckType = false;
    }

    public void resetStreamAsgnRptID()
    {
        streamAsgnRptIDLength = 0;
    }

    public void resetStreamAsgnRejReason()
    {
        hasStreamAsgnRejReason = false;
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
        builder.append("\"MessageName\": \"StreamAssignmentReportACK\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasStreamAsgnAckType())
        {
            indent(builder, level);
            builder.append("\"StreamAsgnAckType\": \"");
            builder.append(streamAsgnAckType);
            builder.append("\",\n");
        }

        if (hasStreamAsgnRptID())
        {
            indent(builder, level);
            builder.append("\"StreamAsgnRptID\": \"");
            appendBuffer(builder, streamAsgnRptID, streamAsgnRptIDOffset, streamAsgnRptIDLength);
            builder.append("\",\n");
        }

        if (hasStreamAsgnRejReason())
        {
            indent(builder, level);
            builder.append("\"StreamAsgnRejReason\": \"");
            builder.append(streamAsgnRejReason);
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
    public StreamAssignmentReportACKEncoder copyTo(final Encoder encoder)
    {
        return copyTo((StreamAssignmentReportACKEncoder)encoder);
    }

    public StreamAssignmentReportACKEncoder copyTo(final StreamAssignmentReportACKEncoder encoder)
    {
        encoder.reset();
        if (hasStreamAsgnAckType())
        {
            encoder.streamAsgnAckType(this.streamAsgnAckType());
        }

        if (hasStreamAsgnRptID())
        {
            encoder.streamAsgnRptIDAsCopy(streamAsgnRptID.byteArray(), 0, streamAsgnRptIDLength);
        }

        if (hasStreamAsgnRejReason())
        {
            encoder.streamAsgnRejReason(this.streamAsgnRejReason());
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
