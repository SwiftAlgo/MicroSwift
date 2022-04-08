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


public class StreamAssignmentReportEncoder implements Encoder
{
    public long messageType()
    {
        return 17475L;
    }

    public StreamAssignmentReportEncoder()
    {
        header.msgType("CD");
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

    private static final int streamAsgnRptIDHeaderLength = 5;
    private static final byte[] streamAsgnRptIDHeader = new byte[] {49, 53, 48, 49, (byte) '='};

    private static final int streamAsgnReqTypeHeaderLength = 5;
    private static final byte[] streamAsgnReqTypeHeader = new byte[] {49, 52, 57, 56, (byte) '='};

    private static final int streamAsgnReqIDHeaderLength = 5;
    private static final byte[] streamAsgnReqIDHeader = new byte[] {49, 52, 57, 55, (byte) '='};

    private final MutableDirectBuffer streamAsgnRptID = new UnsafeBuffer();

    private int streamAsgnRptIDOffset = 0;

    private int streamAsgnRptIDLength = 0;

    public StreamAssignmentReportEncoder streamAsgnRptID(final DirectBuffer value, final int offset, final int length)
    {
        streamAsgnRptID.wrap(value);
        streamAsgnRptIDOffset = offset;
        streamAsgnRptIDLength = length;
        return this;
    }

    public StreamAssignmentReportEncoder streamAsgnRptID(final DirectBuffer value, final int length)
    {
        return streamAsgnRptID(value, 0, length);
    }

    public StreamAssignmentReportEncoder streamAsgnRptID(final DirectBuffer value)
    {
        return streamAsgnRptID(value, 0, value.capacity());
    }

    public StreamAssignmentReportEncoder streamAsgnRptID(final byte[] value, final int offset, final int length)
    {
        streamAsgnRptID.wrap(value);
        streamAsgnRptIDOffset = offset;
        streamAsgnRptIDLength = length;
        return this;
    }

    public StreamAssignmentReportEncoder streamAsgnRptIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(streamAsgnRptID, value, offset, length);
        streamAsgnRptIDOffset = offset;
        streamAsgnRptIDLength = length;
        return this;
    }

    public StreamAssignmentReportEncoder streamAsgnRptID(final byte[] value, final int length)
    {
        return streamAsgnRptID(value, 0, length);
    }

    public StreamAssignmentReportEncoder streamAsgnRptID(final byte[] value)
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

    public StreamAssignmentReportEncoder streamAsgnRptID(final CharSequence value)
    {
        toBytes(value, streamAsgnRptID);
        streamAsgnRptIDOffset = 0;
        streamAsgnRptIDLength = value.length();
        return this;
    }

    public StreamAssignmentReportEncoder streamAsgnRptID(final AsciiSequenceView value)
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

    public StreamAssignmentReportEncoder streamAsgnRptID(final char[] value)
    {
        return streamAsgnRptID(value, 0, value.length);
    }

    public StreamAssignmentReportEncoder streamAsgnRptID(final char[] value, final int length)
    {
        return streamAsgnRptID(value, 0, length);
    }

    public StreamAssignmentReportEncoder streamAsgnRptID(final char[] value, final int offset, final int length)
    {
        toBytes(value, streamAsgnRptID, offset, length);
        streamAsgnRptIDOffset = 0;
        streamAsgnRptIDLength = length;
        return this;
    }

    private int streamAsgnReqType;

    private boolean hasStreamAsgnReqType;

    public boolean hasStreamAsgnReqType()
    {
        return hasStreamAsgnReqType;
    }

    public StreamAssignmentReportEncoder streamAsgnReqType(int value)
    {
        streamAsgnReqType = value;
        hasStreamAsgnReqType = true;
        return this;
    }

    public int streamAsgnReqType()
    {
        return streamAsgnReqType;
    }

    public StreamAssignmentReportEncoder streamAsgnReqType(StreamAsgnReqType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == StreamAsgnReqType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: streamAsgnReqType Value: " + value );
            }
            if (value == StreamAsgnReqType.NULL_VAL)
            {
                return this;
            }
        }
        return streamAsgnReqType(value.representation());
    }

    private final MutableDirectBuffer streamAsgnReqID = new UnsafeBuffer();

    private int streamAsgnReqIDOffset = 0;

    private int streamAsgnReqIDLength = 0;

    public StreamAssignmentReportEncoder streamAsgnReqID(final DirectBuffer value, final int offset, final int length)
    {
        streamAsgnReqID.wrap(value);
        streamAsgnReqIDOffset = offset;
        streamAsgnReqIDLength = length;
        return this;
    }

    public StreamAssignmentReportEncoder streamAsgnReqID(final DirectBuffer value, final int length)
    {
        return streamAsgnReqID(value, 0, length);
    }

    public StreamAssignmentReportEncoder streamAsgnReqID(final DirectBuffer value)
    {
        return streamAsgnReqID(value, 0, value.capacity());
    }

    public StreamAssignmentReportEncoder streamAsgnReqID(final byte[] value, final int offset, final int length)
    {
        streamAsgnReqID.wrap(value);
        streamAsgnReqIDOffset = offset;
        streamAsgnReqIDLength = length;
        return this;
    }

    public StreamAssignmentReportEncoder streamAsgnReqIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(streamAsgnReqID, value, offset, length);
        streamAsgnReqIDOffset = offset;
        streamAsgnReqIDLength = length;
        return this;
    }

    public StreamAssignmentReportEncoder streamAsgnReqID(final byte[] value, final int length)
    {
        return streamAsgnReqID(value, 0, length);
    }

    public StreamAssignmentReportEncoder streamAsgnReqID(final byte[] value)
    {
        return streamAsgnReqID(value, 0, value.length);
    }

    public boolean hasStreamAsgnReqID()
    {
        return streamAsgnReqIDLength > 0;
    }

    public MutableDirectBuffer streamAsgnReqID()
    {
        return streamAsgnReqID;
    }

    public String streamAsgnReqIDAsString()
    {
        return streamAsgnReqID.getStringWithoutLengthAscii(streamAsgnReqIDOffset, streamAsgnReqIDLength);
    }

    public StreamAssignmentReportEncoder streamAsgnReqID(final CharSequence value)
    {
        toBytes(value, streamAsgnReqID);
        streamAsgnReqIDOffset = 0;
        streamAsgnReqIDLength = value.length();
        return this;
    }

    public StreamAssignmentReportEncoder streamAsgnReqID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            streamAsgnReqID.wrap(buffer);
            streamAsgnReqIDOffset = value.offset();
            streamAsgnReqIDLength = value.length();
        }
        return this;
    }

    public StreamAssignmentReportEncoder streamAsgnReqID(final char[] value)
    {
        return streamAsgnReqID(value, 0, value.length);
    }

    public StreamAssignmentReportEncoder streamAsgnReqID(final char[] value, final int length)
    {
        return streamAsgnReqID(value, 0, length);
    }

    public StreamAssignmentReportEncoder streamAsgnReqID(final char[] value, final int offset, final int length)
    {
        toBytes(value, streamAsgnReqID, offset, length);
        streamAsgnReqIDOffset = 0;
        streamAsgnReqIDLength = length;
        return this;
    }

    private final StrmAsgnRptGrpEncoder strmAsgnRptGrp = new StrmAsgnRptGrpEncoder();
    public StrmAsgnRptGrpEncoder strmAsgnRptGrp()
    {
        return strmAsgnRptGrp;
    }

    public long encode(final MutableAsciiBuffer buffer, final int offset)
    {
        final long startMessageResult = header.startMessage(buffer, offset);
        final int bodyStart = Encoder.offset(startMessageResult);
        int position = bodyStart + Encoder.length(startMessageResult);

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

        if (hasStreamAsgnReqType)
        {
            buffer.putBytes(position, streamAsgnReqTypeHeader, 0, streamAsgnReqTypeHeaderLength);
            position += streamAsgnReqTypeHeaderLength;
            position += buffer.putIntAscii(position, streamAsgnReqType);
            buffer.putSeparator(position);
            position++;
        }

        if (streamAsgnReqIDLength > 0)
        {
            buffer.putBytes(position, streamAsgnReqIDHeader, 0, streamAsgnReqIDHeaderLength);
            position += streamAsgnReqIDHeaderLength;
            buffer.putBytes(position, streamAsgnReqID, streamAsgnReqIDOffset, streamAsgnReqIDLength);
            position += streamAsgnReqIDLength;
            buffer.putSeparator(position);
            position++;
        }

            position += strmAsgnRptGrp.encode(buffer, position);
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
        this.resetStreamAsgnRptID();
        this.resetStreamAsgnReqType();
        this.resetStreamAsgnReqID();
        strmAsgnRptGrp.reset();
    }

    public void resetStreamAsgnRptID()
    {
        streamAsgnRptIDLength = 0;
    }

    public void resetStreamAsgnReqType()
    {
        hasStreamAsgnReqType = false;
    }

    public void resetStreamAsgnReqID()
    {
        streamAsgnReqIDLength = 0;
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
        if (hasStreamAsgnRptID())
        {
            indent(builder, level);
            builder.append("\"StreamAsgnRptID\": \"");
            appendBuffer(builder, streamAsgnRptID, streamAsgnRptIDOffset, streamAsgnRptIDLength);
            builder.append("\",\n");
        }

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
            appendBuffer(builder, streamAsgnReqID, streamAsgnReqIDOffset, streamAsgnReqIDLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"StrmAsgnRptGrp\": ");
    strmAsgnRptGrp.appendTo(builder, level + 1);
    builder.append("\n");
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public StreamAssignmentReportEncoder copyTo(final Encoder encoder)
    {
        return copyTo((StreamAssignmentReportEncoder)encoder);
    }

    public StreamAssignmentReportEncoder copyTo(final StreamAssignmentReportEncoder encoder)
    {
        encoder.reset();
        if (hasStreamAsgnRptID())
        {
            encoder.streamAsgnRptIDAsCopy(streamAsgnRptID.byteArray(), 0, streamAsgnRptIDLength);
        }

        if (hasStreamAsgnReqType())
        {
            encoder.streamAsgnReqType(this.streamAsgnReqType());
        }

        if (hasStreamAsgnReqID())
        {
            encoder.streamAsgnReqIDAsCopy(streamAsgnReqID.byteArray(), 0, streamAsgnReqIDLength);
        }


        strmAsgnRptGrp.copyTo(encoder.strmAsgnRptGrp());        return encoder;
    }

}
