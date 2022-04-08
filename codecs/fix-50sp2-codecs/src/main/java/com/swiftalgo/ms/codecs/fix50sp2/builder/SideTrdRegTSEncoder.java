/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2.builder;

import org.agrona.MutableDirectBuffer;
import org.agrona.AsciiSequenceView;
import static uk.co.real_logic.artio.dictionary.generation.CodecUtil.*;
import static uk.co.real_logic.artio.dictionary.SessionConstants.*;
import uk.co.real_logic.artio.builder.Encoder;
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


public class SideTrdRegTSEncoder
{
    private static final int noSideTrdRegTSGroupCounterHeaderLength = 5;
    private static final byte[] noSideTrdRegTSGroupCounterHeader = new byte[] {49, 48, 49, 54, (byte) '='};



public static class SideTrdRegTSGroupEncoder
{
    private SideTrdRegTSGroupEncoder next = null;

    public SideTrdRegTSGroupEncoder next()
    {
        if (next == null)
        {
            next = new SideTrdRegTSGroupEncoder();
        }
        return next;
    }

    private static final int sideTrdRegTimestampHeaderLength = 5;
    private static final byte[] sideTrdRegTimestampHeader = new byte[] {49, 48, 49, 50, (byte) '='};

    private static final int sideTrdRegTimestampTypeHeaderLength = 5;
    private static final byte[] sideTrdRegTimestampTypeHeader = new byte[] {49, 48, 49, 51, (byte) '='};

    private static final int sideTrdRegTimestampSrcHeaderLength = 5;
    private static final byte[] sideTrdRegTimestampSrcHeader = new byte[] {49, 48, 49, 52, (byte) '='};

    private final MutableDirectBuffer sideTrdRegTimestamp = new UnsafeBuffer();

    private int sideTrdRegTimestampOffset = 0;

    private int sideTrdRegTimestampLength = 0;

    public SideTrdRegTSGroupEncoder sideTrdRegTimestamp(final DirectBuffer value, final int offset, final int length)
    {
        sideTrdRegTimestamp.wrap(value);
        sideTrdRegTimestampOffset = offset;
        sideTrdRegTimestampLength = length;
        return this;
    }

    public SideTrdRegTSGroupEncoder sideTrdRegTimestamp(final DirectBuffer value, final int length)
    {
        return sideTrdRegTimestamp(value, 0, length);
    }

    public SideTrdRegTSGroupEncoder sideTrdRegTimestamp(final DirectBuffer value)
    {
        return sideTrdRegTimestamp(value, 0, value.capacity());
    }

    public SideTrdRegTSGroupEncoder sideTrdRegTimestamp(final byte[] value, final int offset, final int length)
    {
        sideTrdRegTimestamp.wrap(value);
        sideTrdRegTimestampOffset = offset;
        sideTrdRegTimestampLength = length;
        return this;
    }

    public SideTrdRegTSGroupEncoder sideTrdRegTimestampAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(sideTrdRegTimestamp, value, offset, length);
        sideTrdRegTimestampOffset = offset;
        sideTrdRegTimestampLength = length;
        return this;
    }

    public SideTrdRegTSGroupEncoder sideTrdRegTimestamp(final byte[] value, final int length)
    {
        return sideTrdRegTimestamp(value, 0, length);
    }

    public SideTrdRegTSGroupEncoder sideTrdRegTimestamp(final byte[] value)
    {
        return sideTrdRegTimestamp(value, 0, value.length);
    }

    public boolean hasSideTrdRegTimestamp()
    {
        return sideTrdRegTimestampLength > 0;
    }

    public MutableDirectBuffer sideTrdRegTimestamp()
    {
        return sideTrdRegTimestamp;
    }

    public String sideTrdRegTimestampAsString()
    {
        return sideTrdRegTimestamp.getStringWithoutLengthAscii(sideTrdRegTimestampOffset, sideTrdRegTimestampLength);
    }

    private int sideTrdRegTimestampType;

    private boolean hasSideTrdRegTimestampType;

    public boolean hasSideTrdRegTimestampType()
    {
        return hasSideTrdRegTimestampType;
    }

    public SideTrdRegTSGroupEncoder sideTrdRegTimestampType(int value)
    {
        sideTrdRegTimestampType = value;
        hasSideTrdRegTimestampType = true;
        return this;
    }

    public int sideTrdRegTimestampType()
    {
        return sideTrdRegTimestampType;
    }

    private final MutableDirectBuffer sideTrdRegTimestampSrc = new UnsafeBuffer();

    private int sideTrdRegTimestampSrcOffset = 0;

    private int sideTrdRegTimestampSrcLength = 0;

    public SideTrdRegTSGroupEncoder sideTrdRegTimestampSrc(final DirectBuffer value, final int offset, final int length)
    {
        sideTrdRegTimestampSrc.wrap(value);
        sideTrdRegTimestampSrcOffset = offset;
        sideTrdRegTimestampSrcLength = length;
        return this;
    }

    public SideTrdRegTSGroupEncoder sideTrdRegTimestampSrc(final DirectBuffer value, final int length)
    {
        return sideTrdRegTimestampSrc(value, 0, length);
    }

    public SideTrdRegTSGroupEncoder sideTrdRegTimestampSrc(final DirectBuffer value)
    {
        return sideTrdRegTimestampSrc(value, 0, value.capacity());
    }

    public SideTrdRegTSGroupEncoder sideTrdRegTimestampSrc(final byte[] value, final int offset, final int length)
    {
        sideTrdRegTimestampSrc.wrap(value);
        sideTrdRegTimestampSrcOffset = offset;
        sideTrdRegTimestampSrcLength = length;
        return this;
    }

    public SideTrdRegTSGroupEncoder sideTrdRegTimestampSrcAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(sideTrdRegTimestampSrc, value, offset, length);
        sideTrdRegTimestampSrcOffset = offset;
        sideTrdRegTimestampSrcLength = length;
        return this;
    }

    public SideTrdRegTSGroupEncoder sideTrdRegTimestampSrc(final byte[] value, final int length)
    {
        return sideTrdRegTimestampSrc(value, 0, length);
    }

    public SideTrdRegTSGroupEncoder sideTrdRegTimestampSrc(final byte[] value)
    {
        return sideTrdRegTimestampSrc(value, 0, value.length);
    }

    public boolean hasSideTrdRegTimestampSrc()
    {
        return sideTrdRegTimestampSrcLength > 0;
    }

    public MutableDirectBuffer sideTrdRegTimestampSrc()
    {
        return sideTrdRegTimestampSrc;
    }

    public String sideTrdRegTimestampSrcAsString()
    {
        return sideTrdRegTimestampSrc.getStringWithoutLengthAscii(sideTrdRegTimestampSrcOffset, sideTrdRegTimestampSrcLength);
    }

    public SideTrdRegTSGroupEncoder sideTrdRegTimestampSrc(final CharSequence value)
    {
        toBytes(value, sideTrdRegTimestampSrc);
        sideTrdRegTimestampSrcOffset = 0;
        sideTrdRegTimestampSrcLength = value.length();
        return this;
    }

    public SideTrdRegTSGroupEncoder sideTrdRegTimestampSrc(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            sideTrdRegTimestampSrc.wrap(buffer);
            sideTrdRegTimestampSrcOffset = value.offset();
            sideTrdRegTimestampSrcLength = value.length();
        }
        return this;
    }

    public SideTrdRegTSGroupEncoder sideTrdRegTimestampSrc(final char[] value)
    {
        return sideTrdRegTimestampSrc(value, 0, value.length);
    }

    public SideTrdRegTSGroupEncoder sideTrdRegTimestampSrc(final char[] value, final int length)
    {
        return sideTrdRegTimestampSrc(value, 0, length);
    }

    public SideTrdRegTSGroupEncoder sideTrdRegTimestampSrc(final char[] value, final int offset, final int length)
    {
        toBytes(value, sideTrdRegTimestampSrc, offset, length);
        sideTrdRegTimestampSrcOffset = 0;
        sideTrdRegTimestampSrcLength = length;
        return this;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (sideTrdRegTimestampLength > 0)
        {
            buffer.putBytes(position, sideTrdRegTimestampHeader, 0, sideTrdRegTimestampHeaderLength);
            position += sideTrdRegTimestampHeaderLength;
            buffer.putBytes(position, sideTrdRegTimestamp, sideTrdRegTimestampOffset, sideTrdRegTimestampLength);
            position += sideTrdRegTimestampLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasSideTrdRegTimestampType)
        {
            buffer.putBytes(position, sideTrdRegTimestampTypeHeader, 0, sideTrdRegTimestampTypeHeaderLength);
            position += sideTrdRegTimestampTypeHeaderLength;
            position += buffer.putIntAscii(position, sideTrdRegTimestampType);
            buffer.putSeparator(position);
            position++;
        }

        if (sideTrdRegTimestampSrcLength > 0)
        {
            buffer.putBytes(position, sideTrdRegTimestampSrcHeader, 0, sideTrdRegTimestampSrcHeaderLength);
            position += sideTrdRegTimestampSrcHeaderLength;
            buffer.putBytes(position, sideTrdRegTimestampSrc, sideTrdRegTimestampSrcOffset, sideTrdRegTimestampSrcLength);
            position += sideTrdRegTimestampSrcLength;
            buffer.putSeparator(position);
            position++;
        }
        if (next != null)
        {
            position += next.encode(buffer, position, remainingElements - 1);
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetSideTrdRegTimestamp();
        this.resetSideTrdRegTimestampType();
        this.resetSideTrdRegTimestampSrc();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetSideTrdRegTimestamp()
    {
        sideTrdRegTimestampLength = 0;
    }

    public void resetSideTrdRegTimestampType()
    {
        hasSideTrdRegTimestampType = false;
    }

    public void resetSideTrdRegTimestampSrc()
    {
        sideTrdRegTimestampSrcLength = 0;
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
        builder.append("\"MessageName\": \"SideTrdRegTSGroup\",\n");
        if (hasSideTrdRegTimestamp())
        {
            indent(builder, level);
            builder.append("\"SideTrdRegTimestamp\": \"");
            appendBuffer(builder, sideTrdRegTimestamp, sideTrdRegTimestampOffset, sideTrdRegTimestampLength);
            builder.append("\",\n");
        }

        if (hasSideTrdRegTimestampType())
        {
            indent(builder, level);
            builder.append("\"SideTrdRegTimestampType\": \"");
            builder.append(sideTrdRegTimestampType);
            builder.append("\",\n");
        }

        if (hasSideTrdRegTimestampSrc())
        {
            indent(builder, level);
            builder.append("\"SideTrdRegTimestampSrc\": \"");
            appendBuffer(builder, sideTrdRegTimestampSrc, sideTrdRegTimestampSrcOffset, sideTrdRegTimestampSrcLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public SideTrdRegTSGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((SideTrdRegTSGroupEncoder)encoder);
    }

    public SideTrdRegTSGroupEncoder copyTo(final SideTrdRegTSGroupEncoder encoder)
    {
        encoder.reset();
        if (hasSideTrdRegTimestamp())
        {
            encoder.sideTrdRegTimestampAsCopy(sideTrdRegTimestamp.byteArray(), 0, sideTrdRegTimestampLength);
        }

        if (hasSideTrdRegTimestampType())
        {
            encoder.sideTrdRegTimestampType(this.sideTrdRegTimestampType());
        }

        if (hasSideTrdRegTimestampSrc())
        {
            encoder.sideTrdRegTimestampSrcAsCopy(sideTrdRegTimestampSrc.byteArray(), 0, sideTrdRegTimestampSrcLength);
        }
        return encoder;
    }

}
    private int noSideTrdRegTSGroupCounter;

    private boolean hasNoSideTrdRegTSGroupCounter;

    public boolean hasNoSideTrdRegTSGroupCounter()
    {
        return hasNoSideTrdRegTSGroupCounter;
    }

    public SideTrdRegTSEncoder noSideTrdRegTSGroupCounter(int value)
    {
        noSideTrdRegTSGroupCounter = value;
        hasNoSideTrdRegTSGroupCounter = true;
        return this;
    }

    public int noSideTrdRegTSGroupCounter()
    {
        return noSideTrdRegTSGroupCounter;
    }


    private SideTrdRegTSGroupEncoder sideTrdRegTSGroup = null;

    public SideTrdRegTSGroupEncoder sideTrdRegTSGroup(final int numberOfElements)
    {
        hasNoSideTrdRegTSGroupCounter = true;
        noSideTrdRegTSGroupCounter = numberOfElements;
        if (sideTrdRegTSGroup == null)
        {
            sideTrdRegTSGroup = new SideTrdRegTSGroupEncoder();
        }
        return sideTrdRegTSGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoSideTrdRegTSGroupCounter)
        {
            buffer.putBytes(position, noSideTrdRegTSGroupCounterHeader, 0, noSideTrdRegTSGroupCounterHeaderLength);
            position += noSideTrdRegTSGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noSideTrdRegTSGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (sideTrdRegTSGroup != null)
        {
            position += sideTrdRegTSGroup.encode(buffer, position, noSideTrdRegTSGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetSideTrdRegTSGroup();
    }

    public void resetSideTrdRegTSGroup()
    {
        if (sideTrdRegTSGroup != null)
        {
            sideTrdRegTSGroup.reset();
        }
        noSideTrdRegTSGroupCounter = 0;
        hasNoSideTrdRegTSGroupCounter = false;
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
        builder.append("\"MessageName\": \"SideTrdRegTS\",\n");
        if (hasNoSideTrdRegTSGroupCounter)
        {
            indent(builder, level);
            builder.append("\"SideTrdRegTSGroup\": [\n");
            final int noSideTrdRegTSGroupCounter = this.noSideTrdRegTSGroupCounter;
            SideTrdRegTSGroupEncoder sideTrdRegTSGroup = this.sideTrdRegTSGroup;
            for (int i = 0; i < noSideTrdRegTSGroupCounter; i++)
            {
                indent(builder, level);
                sideTrdRegTSGroup.appendTo(builder, level + 1);
                if (i < (noSideTrdRegTSGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                sideTrdRegTSGroup = sideTrdRegTSGroup.next();
            }
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
    public SideTrdRegTSEncoder copyTo(final Encoder encoder)
    {
        return copyTo((SideTrdRegTSEncoder)encoder);
    }

    public SideTrdRegTSEncoder copyTo(final SideTrdRegTSEncoder encoder)
    {
        encoder.reset();
        if (hasNoSideTrdRegTSGroupCounter)
        {
            final int size = this.noSideTrdRegTSGroupCounter;
            SideTrdRegTSGroupEncoder sideTrdRegTSGroup = this.sideTrdRegTSGroup;
            SideTrdRegTSGroupEncoder sideTrdRegTSGroupEncoder = encoder.sideTrdRegTSGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (sideTrdRegTSGroup != null)
                {
                    sideTrdRegTSGroup.copyTo(sideTrdRegTSGroupEncoder);
                    sideTrdRegTSGroup = sideTrdRegTSGroup.next();
                    sideTrdRegTSGroupEncoder = sideTrdRegTSGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
