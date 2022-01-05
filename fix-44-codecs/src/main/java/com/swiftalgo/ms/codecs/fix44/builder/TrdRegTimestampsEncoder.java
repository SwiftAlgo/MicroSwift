/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44.builder;

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
import com.swiftalgo.ms.codecs.fix44.*;


public class TrdRegTimestampsEncoder
{
    private static final int noTrdRegTimestampsGroupCounterHeaderLength = 4;
    private static final byte[] noTrdRegTimestampsGroupCounterHeader = new byte[] {55, 54, 56, (byte) '='};



public static class TrdRegTimestampsGroupEncoder
{
    private TrdRegTimestampsGroupEncoder next = null;

    public TrdRegTimestampsGroupEncoder next()
    {
        if (next == null)
        {
            next = new TrdRegTimestampsGroupEncoder();
        }
        return next;
    }

    private static final int trdRegTimestampHeaderLength = 4;
    private static final byte[] trdRegTimestampHeader = new byte[] {55, 54, 57, (byte) '='};

    private static final int trdRegTimestampTypeHeaderLength = 4;
    private static final byte[] trdRegTimestampTypeHeader = new byte[] {55, 55, 48, (byte) '='};

    private static final int trdRegTimestampOriginHeaderLength = 4;
    private static final byte[] trdRegTimestampOriginHeader = new byte[] {55, 55, 49, (byte) '='};

    private final MutableDirectBuffer trdRegTimestamp = new UnsafeBuffer();

    private int trdRegTimestampOffset = 0;

    private int trdRegTimestampLength = 0;

    public TrdRegTimestampsGroupEncoder trdRegTimestamp(final DirectBuffer value, final int offset, final int length)
    {
        trdRegTimestamp.wrap(value);
        trdRegTimestampOffset = offset;
        trdRegTimestampLength = length;
        return this;
    }

    public TrdRegTimestampsGroupEncoder trdRegTimestamp(final DirectBuffer value, final int length)
    {
        return trdRegTimestamp(value, 0, length);
    }

    public TrdRegTimestampsGroupEncoder trdRegTimestamp(final DirectBuffer value)
    {
        return trdRegTimestamp(value, 0, value.capacity());
    }

    public TrdRegTimestampsGroupEncoder trdRegTimestamp(final byte[] value, final int offset, final int length)
    {
        trdRegTimestamp.wrap(value);
        trdRegTimestampOffset = offset;
        trdRegTimestampLength = length;
        return this;
    }

    public TrdRegTimestampsGroupEncoder trdRegTimestampAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(trdRegTimestamp, value, offset, length);
        trdRegTimestampOffset = offset;
        trdRegTimestampLength = length;
        return this;
    }

    public TrdRegTimestampsGroupEncoder trdRegTimestamp(final byte[] value, final int length)
    {
        return trdRegTimestamp(value, 0, length);
    }

    public TrdRegTimestampsGroupEncoder trdRegTimestamp(final byte[] value)
    {
        return trdRegTimestamp(value, 0, value.length);
    }

    public boolean hasTrdRegTimestamp()
    {
        return trdRegTimestampLength > 0;
    }

    public MutableDirectBuffer trdRegTimestamp()
    {
        return trdRegTimestamp;
    }

    public String trdRegTimestampAsString()
    {
        return trdRegTimestamp.getStringWithoutLengthAscii(trdRegTimestampOffset, trdRegTimestampLength);
    }

    private int trdRegTimestampType;

    private boolean hasTrdRegTimestampType;

    public boolean hasTrdRegTimestampType()
    {
        return hasTrdRegTimestampType;
    }

    public TrdRegTimestampsGroupEncoder trdRegTimestampType(int value)
    {
        trdRegTimestampType = value;
        hasTrdRegTimestampType = true;
        return this;
    }

    public int trdRegTimestampType()
    {
        return trdRegTimestampType;
    }

    public TrdRegTimestampsGroupEncoder trdRegTimestampType(TrdRegTimestampType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == TrdRegTimestampType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: trdRegTimestampType Value: " + value );
            }
            if (value == TrdRegTimestampType.NULL_VAL)
            {
                return this;
            }
        }
        return trdRegTimestampType(value.representation());
    }

    private final MutableDirectBuffer trdRegTimestampOrigin = new UnsafeBuffer();

    private int trdRegTimestampOriginOffset = 0;

    private int trdRegTimestampOriginLength = 0;

    public TrdRegTimestampsGroupEncoder trdRegTimestampOrigin(final DirectBuffer value, final int offset, final int length)
    {
        trdRegTimestampOrigin.wrap(value);
        trdRegTimestampOriginOffset = offset;
        trdRegTimestampOriginLength = length;
        return this;
    }

    public TrdRegTimestampsGroupEncoder trdRegTimestampOrigin(final DirectBuffer value, final int length)
    {
        return trdRegTimestampOrigin(value, 0, length);
    }

    public TrdRegTimestampsGroupEncoder trdRegTimestampOrigin(final DirectBuffer value)
    {
        return trdRegTimestampOrigin(value, 0, value.capacity());
    }

    public TrdRegTimestampsGroupEncoder trdRegTimestampOrigin(final byte[] value, final int offset, final int length)
    {
        trdRegTimestampOrigin.wrap(value);
        trdRegTimestampOriginOffset = offset;
        trdRegTimestampOriginLength = length;
        return this;
    }

    public TrdRegTimestampsGroupEncoder trdRegTimestampOriginAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(trdRegTimestampOrigin, value, offset, length);
        trdRegTimestampOriginOffset = offset;
        trdRegTimestampOriginLength = length;
        return this;
    }

    public TrdRegTimestampsGroupEncoder trdRegTimestampOrigin(final byte[] value, final int length)
    {
        return trdRegTimestampOrigin(value, 0, length);
    }

    public TrdRegTimestampsGroupEncoder trdRegTimestampOrigin(final byte[] value)
    {
        return trdRegTimestampOrigin(value, 0, value.length);
    }

    public boolean hasTrdRegTimestampOrigin()
    {
        return trdRegTimestampOriginLength > 0;
    }

    public MutableDirectBuffer trdRegTimestampOrigin()
    {
        return trdRegTimestampOrigin;
    }

    public String trdRegTimestampOriginAsString()
    {
        return trdRegTimestampOrigin.getStringWithoutLengthAscii(trdRegTimestampOriginOffset, trdRegTimestampOriginLength);
    }

    public TrdRegTimestampsGroupEncoder trdRegTimestampOrigin(final CharSequence value)
    {
        toBytes(value, trdRegTimestampOrigin);
        trdRegTimestampOriginOffset = 0;
        trdRegTimestampOriginLength = value.length();
        return this;
    }

    public TrdRegTimestampsGroupEncoder trdRegTimestampOrigin(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            trdRegTimestampOrigin.wrap(buffer);
            trdRegTimestampOriginOffset = value.offset();
            trdRegTimestampOriginLength = value.length();
        }
        return this;
    }

    public TrdRegTimestampsGroupEncoder trdRegTimestampOrigin(final char[] value)
    {
        return trdRegTimestampOrigin(value, 0, value.length);
    }

    public TrdRegTimestampsGroupEncoder trdRegTimestampOrigin(final char[] value, final int length)
    {
        return trdRegTimestampOrigin(value, 0, length);
    }

    public TrdRegTimestampsGroupEncoder trdRegTimestampOrigin(final char[] value, final int offset, final int length)
    {
        toBytes(value, trdRegTimestampOrigin, offset, length);
        trdRegTimestampOriginOffset = 0;
        trdRegTimestampOriginLength = length;
        return this;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (trdRegTimestampLength > 0)
        {
            buffer.putBytes(position, trdRegTimestampHeader, 0, trdRegTimestampHeaderLength);
            position += trdRegTimestampHeaderLength;
            buffer.putBytes(position, trdRegTimestamp, trdRegTimestampOffset, trdRegTimestampLength);
            position += trdRegTimestampLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasTrdRegTimestampType)
        {
            buffer.putBytes(position, trdRegTimestampTypeHeader, 0, trdRegTimestampTypeHeaderLength);
            position += trdRegTimestampTypeHeaderLength;
            position += buffer.putIntAscii(position, trdRegTimestampType);
            buffer.putSeparator(position);
            position++;
        }

        if (trdRegTimestampOriginLength > 0)
        {
            buffer.putBytes(position, trdRegTimestampOriginHeader, 0, trdRegTimestampOriginHeaderLength);
            position += trdRegTimestampOriginHeaderLength;
            buffer.putBytes(position, trdRegTimestampOrigin, trdRegTimestampOriginOffset, trdRegTimestampOriginLength);
            position += trdRegTimestampOriginLength;
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
        this.resetTrdRegTimestamp();
        this.resetTrdRegTimestampType();
        this.resetTrdRegTimestampOrigin();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetTrdRegTimestamp()
    {
        trdRegTimestampLength = 0;
    }

    public void resetTrdRegTimestampType()
    {
        hasTrdRegTimestampType = false;
    }

    public void resetTrdRegTimestampOrigin()
    {
        trdRegTimestampOriginLength = 0;
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
        builder.append("\"MessageName\": \"TrdRegTimestampsGroup\",\n");
        if (hasTrdRegTimestamp())
        {
            indent(builder, level);
            builder.append("\"TrdRegTimestamp\": \"");
            appendBuffer(builder, trdRegTimestamp, trdRegTimestampOffset, trdRegTimestampLength);
            builder.append("\",\n");
        }

        if (hasTrdRegTimestampType())
        {
            indent(builder, level);
            builder.append("\"TrdRegTimestampType\": \"");
            builder.append(trdRegTimestampType);
            builder.append("\",\n");
        }

        if (hasTrdRegTimestampOrigin())
        {
            indent(builder, level);
            builder.append("\"TrdRegTimestampOrigin\": \"");
            appendBuffer(builder, trdRegTimestampOrigin, trdRegTimestampOriginOffset, trdRegTimestampOriginLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public TrdRegTimestampsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((TrdRegTimestampsGroupEncoder)encoder);
    }

    public TrdRegTimestampsGroupEncoder copyTo(final TrdRegTimestampsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasTrdRegTimestamp())
        {
            encoder.trdRegTimestampAsCopy(trdRegTimestamp.byteArray(), 0, trdRegTimestampLength);
        }

        if (hasTrdRegTimestampType())
        {
            encoder.trdRegTimestampType(this.trdRegTimestampType());
        }

        if (hasTrdRegTimestampOrigin())
        {
            encoder.trdRegTimestampOriginAsCopy(trdRegTimestampOrigin.byteArray(), 0, trdRegTimestampOriginLength);
        }
        return encoder;
    }

}
    private int noTrdRegTimestampsGroupCounter;

    private boolean hasNoTrdRegTimestampsGroupCounter;

    public boolean hasNoTrdRegTimestampsGroupCounter()
    {
        return hasNoTrdRegTimestampsGroupCounter;
    }

    public TrdRegTimestampsEncoder noTrdRegTimestampsGroupCounter(int value)
    {
        noTrdRegTimestampsGroupCounter = value;
        hasNoTrdRegTimestampsGroupCounter = true;
        return this;
    }

    public int noTrdRegTimestampsGroupCounter()
    {
        return noTrdRegTimestampsGroupCounter;
    }


    private TrdRegTimestampsGroupEncoder trdRegTimestampsGroup = null;

    public TrdRegTimestampsGroupEncoder trdRegTimestampsGroup(final int numberOfElements)
    {
        hasNoTrdRegTimestampsGroupCounter = true;
        noTrdRegTimestampsGroupCounter = numberOfElements;
        if (trdRegTimestampsGroup == null)
        {
            trdRegTimestampsGroup = new TrdRegTimestampsGroupEncoder();
        }
        return trdRegTimestampsGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoTrdRegTimestampsGroupCounter)
        {
            buffer.putBytes(position, noTrdRegTimestampsGroupCounterHeader, 0, noTrdRegTimestampsGroupCounterHeaderLength);
            position += noTrdRegTimestampsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noTrdRegTimestampsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (trdRegTimestampsGroup != null)
        {
            position += trdRegTimestampsGroup.encode(buffer, position, noTrdRegTimestampsGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetTrdRegTimestampsGroup();
    }

    public void resetTrdRegTimestampsGroup()
    {
        if (trdRegTimestampsGroup != null)
        {
            trdRegTimestampsGroup.reset();
        }
        noTrdRegTimestampsGroupCounter = 0;
        hasNoTrdRegTimestampsGroupCounter = false;
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
        builder.append("\"MessageName\": \"TrdRegTimestamps\",\n");
        if (hasNoTrdRegTimestampsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"TrdRegTimestampsGroup\": [\n");
            final int noTrdRegTimestampsGroupCounter = this.noTrdRegTimestampsGroupCounter;
            TrdRegTimestampsGroupEncoder trdRegTimestampsGroup = this.trdRegTimestampsGroup;
            for (int i = 0; i < noTrdRegTimestampsGroupCounter; i++)
            {
                indent(builder, level);
                trdRegTimestampsGroup.appendTo(builder, level + 1);
                if (i < (noTrdRegTimestampsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                trdRegTimestampsGroup = trdRegTimestampsGroup.next();
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
    public TrdRegTimestampsEncoder copyTo(final Encoder encoder)
    {
        return copyTo((TrdRegTimestampsEncoder)encoder);
    }

    public TrdRegTimestampsEncoder copyTo(final TrdRegTimestampsEncoder encoder)
    {
        encoder.reset();
        if (hasNoTrdRegTimestampsGroupCounter)
        {
            final int size = this.noTrdRegTimestampsGroupCounter;
            TrdRegTimestampsGroupEncoder trdRegTimestampsGroup = this.trdRegTimestampsGroup;
            TrdRegTimestampsGroupEncoder trdRegTimestampsGroupEncoder = encoder.trdRegTimestampsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (trdRegTimestampsGroup != null)
                {
                    trdRegTimestampsGroup.copyTo(trdRegTimestampsGroupEncoder);
                    trdRegTimestampsGroup = trdRegTimestampsGroup.next();
                    trdRegTimestampsGroupEncoder = trdRegTimestampsGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
