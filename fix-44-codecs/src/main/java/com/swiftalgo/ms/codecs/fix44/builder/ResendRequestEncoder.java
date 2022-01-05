/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44.builder;

import uk.co.real_logic.artio.builder.AbstractResendRequestEncoder;
import org.agrona.MutableDirectBuffer;
import org.agrona.AsciiSequenceView;
import static uk.co.real_logic.artio.dictionary.generation.CodecUtil.*;
import static uk.co.real_logic.artio.dictionary.SessionConstants.*;
import uk.co.real_logic.artio.builder.Encoder;
import com.swiftalgo.ms.codecs.fix44.builder.HeaderEncoder;
import com.swiftalgo.ms.codecs.fix44.builder.TrailerEncoder;
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
import com.swiftalgo.ms.codecs.fix44.*;


public class ResendRequestEncoder implements AbstractResendRequestEncoder
{
    public long messageType()
    {
        return 50L;
    }

    public ResendRequestEncoder()
    {
        header.msgType("2");
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

    private static final int beginSeqNoHeaderLength = 2;
    private static final byte[] beginSeqNoHeader = new byte[] {55, (byte) '='};

    private static final int endSeqNoHeaderLength = 3;
    private static final byte[] endSeqNoHeader = new byte[] {49, 54, (byte) '='};

    private int beginSeqNo;

    private boolean hasBeginSeqNo;

    public boolean hasBeginSeqNo()
    {
        return hasBeginSeqNo;
    }

    public ResendRequestEncoder beginSeqNo(int value)
    {
        beginSeqNo = value;
        hasBeginSeqNo = true;
        return this;
    }

    public int beginSeqNo()
    {
        return beginSeqNo;
    }

    private int endSeqNo;

    private boolean hasEndSeqNo;

    public boolean hasEndSeqNo()
    {
        return hasEndSeqNo;
    }

    public ResendRequestEncoder endSeqNo(int value)
    {
        endSeqNo = value;
        hasEndSeqNo = true;
        return this;
    }

    public int endSeqNo()
    {
        return endSeqNo;
    }

    public long encode(final MutableAsciiBuffer buffer, final int offset)
    {
        final long startMessageResult = header.startMessage(buffer, offset);
        final int bodyStart = Encoder.offset(startMessageResult);
        int position = bodyStart + Encoder.length(startMessageResult);

        if (hasBeginSeqNo)
        {
            buffer.putBytes(position, beginSeqNoHeader, 0, beginSeqNoHeaderLength);
            position += beginSeqNoHeaderLength;
            position += buffer.putIntAscii(position, beginSeqNo);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: BeginSeqNo");
        }

        if (hasEndSeqNo)
        {
            buffer.putBytes(position, endSeqNoHeader, 0, endSeqNoHeaderLength);
            position += endSeqNoHeaderLength;
            position += buffer.putIntAscii(position, endSeqNo);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: EndSeqNo");
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
        this.resetBeginSeqNo();
        this.resetEndSeqNo();
    }

    public void resetBeginSeqNo()
    {
        hasBeginSeqNo = false;
    }

    public void resetEndSeqNo()
    {
        hasEndSeqNo = false;
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
        builder.append("\"MessageName\": \"ResendRequest\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasBeginSeqNo())
        {
            indent(builder, level);
            builder.append("\"BeginSeqNo\": \"");
            builder.append(beginSeqNo);
            builder.append("\",\n");
        }

        if (hasEndSeqNo())
        {
            indent(builder, level);
            builder.append("\"EndSeqNo\": \"");
            builder.append(endSeqNo);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public ResendRequestEncoder copyTo(final Encoder encoder)
    {
        return copyTo((ResendRequestEncoder)encoder);
    }

    public ResendRequestEncoder copyTo(final ResendRequestEncoder encoder)
    {
        encoder.reset();
        if (hasBeginSeqNo())
        {
            encoder.beginSeqNo(this.beginSeqNo());
        }

        if (hasEndSeqNo())
        {
            encoder.endSeqNo(this.endSeqNo());
        }
        return encoder;
    }

}
