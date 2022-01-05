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


public class NestedInstrumentAttributeEncoder
{
    private static final int noNestedInstrAttribGroupCounterHeaderLength = 5;
    private static final byte[] noNestedInstrAttribGroupCounterHeader = new byte[] {49, 51, 49, 50, (byte) '='};



public static class NestedInstrAttribGroupEncoder
{
    private NestedInstrAttribGroupEncoder next = null;

    public NestedInstrAttribGroupEncoder next()
    {
        if (next == null)
        {
            next = new NestedInstrAttribGroupEncoder();
        }
        return next;
    }

    private static final int nestedInstrAttribTypeHeaderLength = 5;
    private static final byte[] nestedInstrAttribTypeHeader = new byte[] {49, 50, 49, 48, (byte) '='};

    private static final int nestedInstrAttribValueHeaderLength = 5;
    private static final byte[] nestedInstrAttribValueHeader = new byte[] {49, 50, 49, 49, (byte) '='};

    private int nestedInstrAttribType;

    private boolean hasNestedInstrAttribType;

    public boolean hasNestedInstrAttribType()
    {
        return hasNestedInstrAttribType;
    }

    public NestedInstrAttribGroupEncoder nestedInstrAttribType(int value)
    {
        nestedInstrAttribType = value;
        hasNestedInstrAttribType = true;
        return this;
    }

    public int nestedInstrAttribType()
    {
        return nestedInstrAttribType;
    }

    private final MutableDirectBuffer nestedInstrAttribValue = new UnsafeBuffer();

    private int nestedInstrAttribValueOffset = 0;

    private int nestedInstrAttribValueLength = 0;

    public NestedInstrAttribGroupEncoder nestedInstrAttribValue(final DirectBuffer value, final int offset, final int length)
    {
        nestedInstrAttribValue.wrap(value);
        nestedInstrAttribValueOffset = offset;
        nestedInstrAttribValueLength = length;
        return this;
    }

    public NestedInstrAttribGroupEncoder nestedInstrAttribValue(final DirectBuffer value, final int length)
    {
        return nestedInstrAttribValue(value, 0, length);
    }

    public NestedInstrAttribGroupEncoder nestedInstrAttribValue(final DirectBuffer value)
    {
        return nestedInstrAttribValue(value, 0, value.capacity());
    }

    public NestedInstrAttribGroupEncoder nestedInstrAttribValue(final byte[] value, final int offset, final int length)
    {
        nestedInstrAttribValue.wrap(value);
        nestedInstrAttribValueOffset = offset;
        nestedInstrAttribValueLength = length;
        return this;
    }

    public NestedInstrAttribGroupEncoder nestedInstrAttribValueAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(nestedInstrAttribValue, value, offset, length);
        nestedInstrAttribValueOffset = offset;
        nestedInstrAttribValueLength = length;
        return this;
    }

    public NestedInstrAttribGroupEncoder nestedInstrAttribValue(final byte[] value, final int length)
    {
        return nestedInstrAttribValue(value, 0, length);
    }

    public NestedInstrAttribGroupEncoder nestedInstrAttribValue(final byte[] value)
    {
        return nestedInstrAttribValue(value, 0, value.length);
    }

    public boolean hasNestedInstrAttribValue()
    {
        return nestedInstrAttribValueLength > 0;
    }

    public MutableDirectBuffer nestedInstrAttribValue()
    {
        return nestedInstrAttribValue;
    }

    public String nestedInstrAttribValueAsString()
    {
        return nestedInstrAttribValue.getStringWithoutLengthAscii(nestedInstrAttribValueOffset, nestedInstrAttribValueLength);
    }

    public NestedInstrAttribGroupEncoder nestedInstrAttribValue(final CharSequence value)
    {
        toBytes(value, nestedInstrAttribValue);
        nestedInstrAttribValueOffset = 0;
        nestedInstrAttribValueLength = value.length();
        return this;
    }

    public NestedInstrAttribGroupEncoder nestedInstrAttribValue(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            nestedInstrAttribValue.wrap(buffer);
            nestedInstrAttribValueOffset = value.offset();
            nestedInstrAttribValueLength = value.length();
        }
        return this;
    }

    public NestedInstrAttribGroupEncoder nestedInstrAttribValue(final char[] value)
    {
        return nestedInstrAttribValue(value, 0, value.length);
    }

    public NestedInstrAttribGroupEncoder nestedInstrAttribValue(final char[] value, final int length)
    {
        return nestedInstrAttribValue(value, 0, length);
    }

    public NestedInstrAttribGroupEncoder nestedInstrAttribValue(final char[] value, final int offset, final int length)
    {
        toBytes(value, nestedInstrAttribValue, offset, length);
        nestedInstrAttribValueOffset = 0;
        nestedInstrAttribValueLength = length;
        return this;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (hasNestedInstrAttribType)
        {
            buffer.putBytes(position, nestedInstrAttribTypeHeader, 0, nestedInstrAttribTypeHeaderLength);
            position += nestedInstrAttribTypeHeaderLength;
            position += buffer.putIntAscii(position, nestedInstrAttribType);
            buffer.putSeparator(position);
            position++;
        }

        if (nestedInstrAttribValueLength > 0)
        {
            buffer.putBytes(position, nestedInstrAttribValueHeader, 0, nestedInstrAttribValueHeaderLength);
            position += nestedInstrAttribValueHeaderLength;
            buffer.putBytes(position, nestedInstrAttribValue, nestedInstrAttribValueOffset, nestedInstrAttribValueLength);
            position += nestedInstrAttribValueLength;
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
        this.resetNestedInstrAttribType();
        this.resetNestedInstrAttribValue();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetNestedInstrAttribType()
    {
        hasNestedInstrAttribType = false;
    }

    public void resetNestedInstrAttribValue()
    {
        nestedInstrAttribValueLength = 0;
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
        builder.append("\"MessageName\": \"NestedInstrAttribGroup\",\n");
        if (hasNestedInstrAttribType())
        {
            indent(builder, level);
            builder.append("\"NestedInstrAttribType\": \"");
            builder.append(nestedInstrAttribType);
            builder.append("\",\n");
        }

        if (hasNestedInstrAttribValue())
        {
            indent(builder, level);
            builder.append("\"NestedInstrAttribValue\": \"");
            appendBuffer(builder, nestedInstrAttribValue, nestedInstrAttribValueOffset, nestedInstrAttribValueLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public NestedInstrAttribGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((NestedInstrAttribGroupEncoder)encoder);
    }

    public NestedInstrAttribGroupEncoder copyTo(final NestedInstrAttribGroupEncoder encoder)
    {
        encoder.reset();
        if (hasNestedInstrAttribType())
        {
            encoder.nestedInstrAttribType(this.nestedInstrAttribType());
        }

        if (hasNestedInstrAttribValue())
        {
            encoder.nestedInstrAttribValueAsCopy(nestedInstrAttribValue.byteArray(), 0, nestedInstrAttribValueLength);
        }
        return encoder;
    }

}
    private int noNestedInstrAttribGroupCounter;

    private boolean hasNoNestedInstrAttribGroupCounter;

    public boolean hasNoNestedInstrAttribGroupCounter()
    {
        return hasNoNestedInstrAttribGroupCounter;
    }

    public NestedInstrumentAttributeEncoder noNestedInstrAttribGroupCounter(int value)
    {
        noNestedInstrAttribGroupCounter = value;
        hasNoNestedInstrAttribGroupCounter = true;
        return this;
    }

    public int noNestedInstrAttribGroupCounter()
    {
        return noNestedInstrAttribGroupCounter;
    }


    private NestedInstrAttribGroupEncoder nestedInstrAttribGroup = null;

    public NestedInstrAttribGroupEncoder nestedInstrAttribGroup(final int numberOfElements)
    {
        hasNoNestedInstrAttribGroupCounter = true;
        noNestedInstrAttribGroupCounter = numberOfElements;
        if (nestedInstrAttribGroup == null)
        {
            nestedInstrAttribGroup = new NestedInstrAttribGroupEncoder();
        }
        return nestedInstrAttribGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoNestedInstrAttribGroupCounter)
        {
            buffer.putBytes(position, noNestedInstrAttribGroupCounterHeader, 0, noNestedInstrAttribGroupCounterHeaderLength);
            position += noNestedInstrAttribGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noNestedInstrAttribGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (nestedInstrAttribGroup != null)
        {
            position += nestedInstrAttribGroup.encode(buffer, position, noNestedInstrAttribGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetNestedInstrAttribGroup();
    }

    public void resetNestedInstrAttribGroup()
    {
        if (nestedInstrAttribGroup != null)
        {
            nestedInstrAttribGroup.reset();
        }
        noNestedInstrAttribGroupCounter = 0;
        hasNoNestedInstrAttribGroupCounter = false;
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
        builder.append("\"MessageName\": \"NestedInstrumentAttribute\",\n");
        if (hasNoNestedInstrAttribGroupCounter)
        {
            indent(builder, level);
            builder.append("\"NestedInstrAttribGroup\": [\n");
            final int noNestedInstrAttribGroupCounter = this.noNestedInstrAttribGroupCounter;
            NestedInstrAttribGroupEncoder nestedInstrAttribGroup = this.nestedInstrAttribGroup;
            for (int i = 0; i < noNestedInstrAttribGroupCounter; i++)
            {
                indent(builder, level);
                nestedInstrAttribGroup.appendTo(builder, level + 1);
                if (i < (noNestedInstrAttribGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                nestedInstrAttribGroup = nestedInstrAttribGroup.next();
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
    public NestedInstrumentAttributeEncoder copyTo(final Encoder encoder)
    {
        return copyTo((NestedInstrumentAttributeEncoder)encoder);
    }

    public NestedInstrumentAttributeEncoder copyTo(final NestedInstrumentAttributeEncoder encoder)
    {
        encoder.reset();
        if (hasNoNestedInstrAttribGroupCounter)
        {
            final int size = this.noNestedInstrAttribGroupCounter;
            NestedInstrAttribGroupEncoder nestedInstrAttribGroup = this.nestedInstrAttribGroup;
            NestedInstrAttribGroupEncoder nestedInstrAttribGroupEncoder = encoder.nestedInstrAttribGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (nestedInstrAttribGroup != null)
                {
                    nestedInstrAttribGroup.copyTo(nestedInstrAttribGroupEncoder);
                    nestedInstrAttribGroup = nestedInstrAttribGroup.next();
                    nestedInstrAttribGroupEncoder = nestedInstrAttribGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
