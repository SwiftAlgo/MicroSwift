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


public class UnderlyingStipulationsEncoder
{
    private static final int noUnderlyingStipsGroupCounterHeaderLength = 4;
    private static final byte[] noUnderlyingStipsGroupCounterHeader = new byte[] {56, 56, 55, (byte) '='};



public static class UnderlyingStipsGroupEncoder
{
    private UnderlyingStipsGroupEncoder next = null;

    public UnderlyingStipsGroupEncoder next()
    {
        if (next == null)
        {
            next = new UnderlyingStipsGroupEncoder();
        }
        return next;
    }

    private static final int underlyingStipTypeHeaderLength = 4;
    private static final byte[] underlyingStipTypeHeader = new byte[] {56, 56, 56, (byte) '='};

    private static final int underlyingStipValueHeaderLength = 4;
    private static final byte[] underlyingStipValueHeader = new byte[] {56, 56, 57, (byte) '='};

    private final MutableDirectBuffer underlyingStipType = new UnsafeBuffer();

    private int underlyingStipTypeOffset = 0;

    private int underlyingStipTypeLength = 0;

    public UnderlyingStipsGroupEncoder underlyingStipType(final DirectBuffer value, final int offset, final int length)
    {
        underlyingStipType.wrap(value);
        underlyingStipTypeOffset = offset;
        underlyingStipTypeLength = length;
        return this;
    }

    public UnderlyingStipsGroupEncoder underlyingStipType(final DirectBuffer value, final int length)
    {
        return underlyingStipType(value, 0, length);
    }

    public UnderlyingStipsGroupEncoder underlyingStipType(final DirectBuffer value)
    {
        return underlyingStipType(value, 0, value.capacity());
    }

    public UnderlyingStipsGroupEncoder underlyingStipType(final byte[] value, final int offset, final int length)
    {
        underlyingStipType.wrap(value);
        underlyingStipTypeOffset = offset;
        underlyingStipTypeLength = length;
        return this;
    }

    public UnderlyingStipsGroupEncoder underlyingStipTypeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(underlyingStipType, value, offset, length);
        underlyingStipTypeOffset = offset;
        underlyingStipTypeLength = length;
        return this;
    }

    public UnderlyingStipsGroupEncoder underlyingStipType(final byte[] value, final int length)
    {
        return underlyingStipType(value, 0, length);
    }

    public UnderlyingStipsGroupEncoder underlyingStipType(final byte[] value)
    {
        return underlyingStipType(value, 0, value.length);
    }

    public boolean hasUnderlyingStipType()
    {
        return underlyingStipTypeLength > 0;
    }

    public MutableDirectBuffer underlyingStipType()
    {
        return underlyingStipType;
    }

    public String underlyingStipTypeAsString()
    {
        return underlyingStipType.getStringWithoutLengthAscii(underlyingStipTypeOffset, underlyingStipTypeLength);
    }

    public UnderlyingStipsGroupEncoder underlyingStipType(final CharSequence value)
    {
        toBytes(value, underlyingStipType);
        underlyingStipTypeOffset = 0;
        underlyingStipTypeLength = value.length();
        return this;
    }

    public UnderlyingStipsGroupEncoder underlyingStipType(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            underlyingStipType.wrap(buffer);
            underlyingStipTypeOffset = value.offset();
            underlyingStipTypeLength = value.length();
        }
        return this;
    }

    public UnderlyingStipsGroupEncoder underlyingStipType(final char[] value)
    {
        return underlyingStipType(value, 0, value.length);
    }

    public UnderlyingStipsGroupEncoder underlyingStipType(final char[] value, final int length)
    {
        return underlyingStipType(value, 0, length);
    }

    public UnderlyingStipsGroupEncoder underlyingStipType(final char[] value, final int offset, final int length)
    {
        toBytes(value, underlyingStipType, offset, length);
        underlyingStipTypeOffset = 0;
        underlyingStipTypeLength = length;
        return this;
    }

    private final MutableDirectBuffer underlyingStipValue = new UnsafeBuffer();

    private int underlyingStipValueOffset = 0;

    private int underlyingStipValueLength = 0;

    public UnderlyingStipsGroupEncoder underlyingStipValue(final DirectBuffer value, final int offset, final int length)
    {
        underlyingStipValue.wrap(value);
        underlyingStipValueOffset = offset;
        underlyingStipValueLength = length;
        return this;
    }

    public UnderlyingStipsGroupEncoder underlyingStipValue(final DirectBuffer value, final int length)
    {
        return underlyingStipValue(value, 0, length);
    }

    public UnderlyingStipsGroupEncoder underlyingStipValue(final DirectBuffer value)
    {
        return underlyingStipValue(value, 0, value.capacity());
    }

    public UnderlyingStipsGroupEncoder underlyingStipValue(final byte[] value, final int offset, final int length)
    {
        underlyingStipValue.wrap(value);
        underlyingStipValueOffset = offset;
        underlyingStipValueLength = length;
        return this;
    }

    public UnderlyingStipsGroupEncoder underlyingStipValueAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(underlyingStipValue, value, offset, length);
        underlyingStipValueOffset = offset;
        underlyingStipValueLength = length;
        return this;
    }

    public UnderlyingStipsGroupEncoder underlyingStipValue(final byte[] value, final int length)
    {
        return underlyingStipValue(value, 0, length);
    }

    public UnderlyingStipsGroupEncoder underlyingStipValue(final byte[] value)
    {
        return underlyingStipValue(value, 0, value.length);
    }

    public boolean hasUnderlyingStipValue()
    {
        return underlyingStipValueLength > 0;
    }

    public MutableDirectBuffer underlyingStipValue()
    {
        return underlyingStipValue;
    }

    public String underlyingStipValueAsString()
    {
        return underlyingStipValue.getStringWithoutLengthAscii(underlyingStipValueOffset, underlyingStipValueLength);
    }

    public UnderlyingStipsGroupEncoder underlyingStipValue(final CharSequence value)
    {
        toBytes(value, underlyingStipValue);
        underlyingStipValueOffset = 0;
        underlyingStipValueLength = value.length();
        return this;
    }

    public UnderlyingStipsGroupEncoder underlyingStipValue(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            underlyingStipValue.wrap(buffer);
            underlyingStipValueOffset = value.offset();
            underlyingStipValueLength = value.length();
        }
        return this;
    }

    public UnderlyingStipsGroupEncoder underlyingStipValue(final char[] value)
    {
        return underlyingStipValue(value, 0, value.length);
    }

    public UnderlyingStipsGroupEncoder underlyingStipValue(final char[] value, final int length)
    {
        return underlyingStipValue(value, 0, length);
    }

    public UnderlyingStipsGroupEncoder underlyingStipValue(final char[] value, final int offset, final int length)
    {
        toBytes(value, underlyingStipValue, offset, length);
        underlyingStipValueOffset = 0;
        underlyingStipValueLength = length;
        return this;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (underlyingStipTypeLength > 0)
        {
            buffer.putBytes(position, underlyingStipTypeHeader, 0, underlyingStipTypeHeaderLength);
            position += underlyingStipTypeHeaderLength;
            buffer.putBytes(position, underlyingStipType, underlyingStipTypeOffset, underlyingStipTypeLength);
            position += underlyingStipTypeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (underlyingStipValueLength > 0)
        {
            buffer.putBytes(position, underlyingStipValueHeader, 0, underlyingStipValueHeaderLength);
            position += underlyingStipValueHeaderLength;
            buffer.putBytes(position, underlyingStipValue, underlyingStipValueOffset, underlyingStipValueLength);
            position += underlyingStipValueLength;
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
        this.resetUnderlyingStipType();
        this.resetUnderlyingStipValue();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetUnderlyingStipType()
    {
        underlyingStipTypeLength = 0;
    }

    public void resetUnderlyingStipValue()
    {
        underlyingStipValueLength = 0;
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
        builder.append("\"MessageName\": \"UnderlyingStipsGroup\",\n");
        if (hasUnderlyingStipType())
        {
            indent(builder, level);
            builder.append("\"UnderlyingStipType\": \"");
            appendBuffer(builder, underlyingStipType, underlyingStipTypeOffset, underlyingStipTypeLength);
            builder.append("\",\n");
        }

        if (hasUnderlyingStipValue())
        {
            indent(builder, level);
            builder.append("\"UnderlyingStipValue\": \"");
            appendBuffer(builder, underlyingStipValue, underlyingStipValueOffset, underlyingStipValueLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public UnderlyingStipsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((UnderlyingStipsGroupEncoder)encoder);
    }

    public UnderlyingStipsGroupEncoder copyTo(final UnderlyingStipsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasUnderlyingStipType())
        {
            encoder.underlyingStipTypeAsCopy(underlyingStipType.byteArray(), 0, underlyingStipTypeLength);
        }

        if (hasUnderlyingStipValue())
        {
            encoder.underlyingStipValueAsCopy(underlyingStipValue.byteArray(), 0, underlyingStipValueLength);
        }
        return encoder;
    }

}
    private int noUnderlyingStipsGroupCounter;

    private boolean hasNoUnderlyingStipsGroupCounter;

    public boolean hasNoUnderlyingStipsGroupCounter()
    {
        return hasNoUnderlyingStipsGroupCounter;
    }

    public UnderlyingStipulationsEncoder noUnderlyingStipsGroupCounter(int value)
    {
        noUnderlyingStipsGroupCounter = value;
        hasNoUnderlyingStipsGroupCounter = true;
        return this;
    }

    public int noUnderlyingStipsGroupCounter()
    {
        return noUnderlyingStipsGroupCounter;
    }


    private UnderlyingStipsGroupEncoder underlyingStipsGroup = null;

    public UnderlyingStipsGroupEncoder underlyingStipsGroup(final int numberOfElements)
    {
        hasNoUnderlyingStipsGroupCounter = true;
        noUnderlyingStipsGroupCounter = numberOfElements;
        if (underlyingStipsGroup == null)
        {
            underlyingStipsGroup = new UnderlyingStipsGroupEncoder();
        }
        return underlyingStipsGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoUnderlyingStipsGroupCounter)
        {
            buffer.putBytes(position, noUnderlyingStipsGroupCounterHeader, 0, noUnderlyingStipsGroupCounterHeaderLength);
            position += noUnderlyingStipsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noUnderlyingStipsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (underlyingStipsGroup != null)
        {
            position += underlyingStipsGroup.encode(buffer, position, noUnderlyingStipsGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetUnderlyingStipsGroup();
    }

    public void resetUnderlyingStipsGroup()
    {
        if (underlyingStipsGroup != null)
        {
            underlyingStipsGroup.reset();
        }
        noUnderlyingStipsGroupCounter = 0;
        hasNoUnderlyingStipsGroupCounter = false;
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
        builder.append("\"MessageName\": \"UnderlyingStipulations\",\n");
        if (hasNoUnderlyingStipsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"UnderlyingStipsGroup\": [\n");
            final int noUnderlyingStipsGroupCounter = this.noUnderlyingStipsGroupCounter;
            UnderlyingStipsGroupEncoder underlyingStipsGroup = this.underlyingStipsGroup;
            for (int i = 0; i < noUnderlyingStipsGroupCounter; i++)
            {
                indent(builder, level);
                underlyingStipsGroup.appendTo(builder, level + 1);
                if (i < (noUnderlyingStipsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                underlyingStipsGroup = underlyingStipsGroup.next();
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
    public UnderlyingStipulationsEncoder copyTo(final Encoder encoder)
    {
        return copyTo((UnderlyingStipulationsEncoder)encoder);
    }

    public UnderlyingStipulationsEncoder copyTo(final UnderlyingStipulationsEncoder encoder)
    {
        encoder.reset();
        if (hasNoUnderlyingStipsGroupCounter)
        {
            final int size = this.noUnderlyingStipsGroupCounter;
            UnderlyingStipsGroupEncoder underlyingStipsGroup = this.underlyingStipsGroup;
            UnderlyingStipsGroupEncoder underlyingStipsGroupEncoder = encoder.underlyingStipsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (underlyingStipsGroup != null)
                {
                    underlyingStipsGroup.copyTo(underlyingStipsGroupEncoder);
                    underlyingStipsGroup = underlyingStipsGroup.next();
                    underlyingStipsGroupEncoder = underlyingStipsGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
