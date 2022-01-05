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


public class StreamAssignmentRequestEncoder implements Encoder
{
    public long messageType()
    {
        return 17219L;
    }

    public StreamAssignmentRequestEncoder()
    {
        header.msgType("CC");
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

    private static final int streamAsgnReqIDHeaderLength = 5;
    private static final byte[] streamAsgnReqIDHeader = new byte[] {49, 52, 57, 55, (byte) '='};

    private static final int streamAsgnReqTypeHeaderLength = 5;
    private static final byte[] streamAsgnReqTypeHeader = new byte[] {49, 52, 57, 56, (byte) '='};

    private final MutableDirectBuffer streamAsgnReqID = new UnsafeBuffer();

    private int streamAsgnReqIDOffset = 0;

    private int streamAsgnReqIDLength = 0;

    public StreamAssignmentRequestEncoder streamAsgnReqID(final DirectBuffer value, final int offset, final int length)
    {
        streamAsgnReqID.wrap(value);
        streamAsgnReqIDOffset = offset;
        streamAsgnReqIDLength = length;
        return this;
    }

    public StreamAssignmentRequestEncoder streamAsgnReqID(final DirectBuffer value, final int length)
    {
        return streamAsgnReqID(value, 0, length);
    }

    public StreamAssignmentRequestEncoder streamAsgnReqID(final DirectBuffer value)
    {
        return streamAsgnReqID(value, 0, value.capacity());
    }

    public StreamAssignmentRequestEncoder streamAsgnReqID(final byte[] value, final int offset, final int length)
    {
        streamAsgnReqID.wrap(value);
        streamAsgnReqIDOffset = offset;
        streamAsgnReqIDLength = length;
        return this;
    }

    public StreamAssignmentRequestEncoder streamAsgnReqIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(streamAsgnReqID, value, offset, length);
        streamAsgnReqIDOffset = offset;
        streamAsgnReqIDLength = length;
        return this;
    }

    public StreamAssignmentRequestEncoder streamAsgnReqID(final byte[] value, final int length)
    {
        return streamAsgnReqID(value, 0, length);
    }

    public StreamAssignmentRequestEncoder streamAsgnReqID(final byte[] value)
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

    public StreamAssignmentRequestEncoder streamAsgnReqID(final CharSequence value)
    {
        toBytes(value, streamAsgnReqID);
        streamAsgnReqIDOffset = 0;
        streamAsgnReqIDLength = value.length();
        return this;
    }

    public StreamAssignmentRequestEncoder streamAsgnReqID(final AsciiSequenceView value)
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

    public StreamAssignmentRequestEncoder streamAsgnReqID(final char[] value)
    {
        return streamAsgnReqID(value, 0, value.length);
    }

    public StreamAssignmentRequestEncoder streamAsgnReqID(final char[] value, final int length)
    {
        return streamAsgnReqID(value, 0, length);
    }

    public StreamAssignmentRequestEncoder streamAsgnReqID(final char[] value, final int offset, final int length)
    {
        toBytes(value, streamAsgnReqID, offset, length);
        streamAsgnReqIDOffset = 0;
        streamAsgnReqIDLength = length;
        return this;
    }

    private int streamAsgnReqType;

    private boolean hasStreamAsgnReqType;

    public boolean hasStreamAsgnReqType()
    {
        return hasStreamAsgnReqType;
    }

    public StreamAssignmentRequestEncoder streamAsgnReqType(int value)
    {
        streamAsgnReqType = value;
        hasStreamAsgnReqType = true;
        return this;
    }

    public int streamAsgnReqType()
    {
        return streamAsgnReqType;
    }

    public StreamAssignmentRequestEncoder streamAsgnReqType(StreamAsgnReqType value)
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

    private final StrmAsgnReqGrpEncoder strmAsgnReqGrp = new StrmAsgnReqGrpEncoder();
    public StrmAsgnReqGrpEncoder strmAsgnReqGrp()
    {
        return strmAsgnReqGrp;
    }

    public long encode(final MutableAsciiBuffer buffer, final int offset)
    {
        final long startMessageResult = header.startMessage(buffer, offset);
        final int bodyStart = Encoder.offset(startMessageResult);
        int position = bodyStart + Encoder.length(startMessageResult);

        if (streamAsgnReqIDLength > 0)
        {
            buffer.putBytes(position, streamAsgnReqIDHeader, 0, streamAsgnReqIDHeaderLength);
            position += streamAsgnReqIDHeaderLength;
            buffer.putBytes(position, streamAsgnReqID, streamAsgnReqIDOffset, streamAsgnReqIDLength);
            position += streamAsgnReqIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: StreamAsgnReqID");
        }

        if (hasStreamAsgnReqType)
        {
            buffer.putBytes(position, streamAsgnReqTypeHeader, 0, streamAsgnReqTypeHeaderLength);
            position += streamAsgnReqTypeHeaderLength;
            position += buffer.putIntAscii(position, streamAsgnReqType);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: StreamAsgnReqType");
        }

            position += strmAsgnReqGrp.encode(buffer, position);
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
        this.resetStreamAsgnReqID();
        this.resetStreamAsgnReqType();
        strmAsgnReqGrp.reset();
    }

    public void resetStreamAsgnReqID()
    {
        streamAsgnReqIDLength = 0;
    }

    public void resetStreamAsgnReqType()
    {
        hasStreamAsgnReqType = false;
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
        builder.append("\"MessageName\": \"StreamAssignmentRequest\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasStreamAsgnReqID())
        {
            indent(builder, level);
            builder.append("\"StreamAsgnReqID\": \"");
            appendBuffer(builder, streamAsgnReqID, streamAsgnReqIDOffset, streamAsgnReqIDLength);
            builder.append("\",\n");
        }

        if (hasStreamAsgnReqType())
        {
            indent(builder, level);
            builder.append("\"StreamAsgnReqType\": \"");
            builder.append(streamAsgnReqType);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"StrmAsgnReqGrp\": ");
    strmAsgnReqGrp.appendTo(builder, level + 1);
    builder.append("\n");
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public StreamAssignmentRequestEncoder copyTo(final Encoder encoder)
    {
        return copyTo((StreamAssignmentRequestEncoder)encoder);
    }

    public StreamAssignmentRequestEncoder copyTo(final StreamAssignmentRequestEncoder encoder)
    {
        encoder.reset();
        if (hasStreamAsgnReqID())
        {
            encoder.streamAsgnReqIDAsCopy(streamAsgnReqID.byteArray(), 0, streamAsgnReqIDLength);
        }

        if (hasStreamAsgnReqType())
        {
            encoder.streamAsgnReqType(this.streamAsgnReqType());
        }


        strmAsgnReqGrp.copyTo(encoder.strmAsgnReqGrp());        return encoder;
    }

}
