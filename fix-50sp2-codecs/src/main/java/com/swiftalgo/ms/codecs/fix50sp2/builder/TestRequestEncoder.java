/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2.builder;

import uk.co.real_logic.artio.builder.AbstractTestRequestEncoder;
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


public class TestRequestEncoder implements AbstractTestRequestEncoder
{
    public long messageType()
    {
        return 49L;
    }

    public TestRequestEncoder()
    {
        header.msgType("1");
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

    private static final int testReqIDHeaderLength = 4;
    private static final byte[] testReqIDHeader = new byte[] {49, 49, 50, (byte) '='};

    private final MutableDirectBuffer testReqID = new UnsafeBuffer();

    private int testReqIDOffset = 0;

    private int testReqIDLength = 0;

    public TestRequestEncoder testReqID(final DirectBuffer value, final int offset, final int length)
    {
        testReqID.wrap(value);
        testReqIDOffset = offset;
        testReqIDLength = length;
        return this;
    }

    public TestRequestEncoder testReqID(final DirectBuffer value, final int length)
    {
        return testReqID(value, 0, length);
    }

    public TestRequestEncoder testReqID(final DirectBuffer value)
    {
        return testReqID(value, 0, value.capacity());
    }

    public TestRequestEncoder testReqID(final byte[] value, final int offset, final int length)
    {
        testReqID.wrap(value);
        testReqIDOffset = offset;
        testReqIDLength = length;
        return this;
    }

    public TestRequestEncoder testReqIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(testReqID, value, offset, length);
        testReqIDOffset = offset;
        testReqIDLength = length;
        return this;
    }

    public TestRequestEncoder testReqID(final byte[] value, final int length)
    {
        return testReqID(value, 0, length);
    }

    public TestRequestEncoder testReqID(final byte[] value)
    {
        return testReqID(value, 0, value.length);
    }

    public boolean hasTestReqID()
    {
        return testReqIDLength > 0;
    }

    public MutableDirectBuffer testReqID()
    {
        return testReqID;
    }

    public String testReqIDAsString()
    {
        return testReqID.getStringWithoutLengthAscii(testReqIDOffset, testReqIDLength);
    }

    public TestRequestEncoder testReqID(final CharSequence value)
    {
        toBytes(value, testReqID);
        testReqIDOffset = 0;
        testReqIDLength = value.length();
        return this;
    }

    public TestRequestEncoder testReqID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            testReqID.wrap(buffer);
            testReqIDOffset = value.offset();
            testReqIDLength = value.length();
        }
        return this;
    }

    public TestRequestEncoder testReqID(final char[] value)
    {
        return testReqID(value, 0, value.length);
    }

    public TestRequestEncoder testReqID(final char[] value, final int length)
    {
        return testReqID(value, 0, length);
    }

    public TestRequestEncoder testReqID(final char[] value, final int offset, final int length)
    {
        toBytes(value, testReqID, offset, length);
        testReqIDOffset = 0;
        testReqIDLength = length;
        return this;
    }

    public long encode(final MutableAsciiBuffer buffer, final int offset)
    {
        final long startMessageResult = header.startMessage(buffer, offset);
        final int bodyStart = Encoder.offset(startMessageResult);
        int position = bodyStart + Encoder.length(startMessageResult);

        if (testReqIDLength > 0)
        {
            buffer.putBytes(position, testReqIDHeader, 0, testReqIDHeaderLength);
            position += testReqIDHeaderLength;
            buffer.putBytes(position, testReqID, testReqIDOffset, testReqIDLength);
            position += testReqIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: TestReqID");
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
        this.resetTestReqID();
    }

    public void resetTestReqID()
    {
        testReqIDLength = 0;
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
        builder.append("\"MessageName\": \"TestRequest\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasTestReqID())
        {
            indent(builder, level);
            builder.append("\"TestReqID\": \"");
            appendBuffer(builder, testReqID, testReqIDOffset, testReqIDLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public TestRequestEncoder copyTo(final Encoder encoder)
    {
        return copyTo((TestRequestEncoder)encoder);
    }

    public TestRequestEncoder copyTo(final TestRequestEncoder encoder)
    {
        encoder.reset();
        if (hasTestReqID())
        {
            encoder.testReqIDAsCopy(testReqID.byteArray(), 0, testReqIDLength);
        }
        return encoder;
    }

}
