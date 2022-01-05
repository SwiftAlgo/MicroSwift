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


public class DerivativeInstrumentAttributeEncoder
{
    private static final int noDerivativeInstrAttribGroupCounterHeaderLength = 5;
    private static final byte[] noDerivativeInstrAttribGroupCounterHeader = new byte[] {49, 51, 49, 49, (byte) '='};



public static class DerivativeInstrAttribGroupEncoder
{
    private DerivativeInstrAttribGroupEncoder next = null;

    public DerivativeInstrAttribGroupEncoder next()
    {
        if (next == null)
        {
            next = new DerivativeInstrAttribGroupEncoder();
        }
        return next;
    }

    private static final int derivativeInstrAttribTypeHeaderLength = 5;
    private static final byte[] derivativeInstrAttribTypeHeader = new byte[] {49, 51, 49, 51, (byte) '='};

    private static final int derivativeInstrAttribValueHeaderLength = 5;
    private static final byte[] derivativeInstrAttribValueHeader = new byte[] {49, 51, 49, 52, (byte) '='};

    private int derivativeInstrAttribType;

    private boolean hasDerivativeInstrAttribType;

    public boolean hasDerivativeInstrAttribType()
    {
        return hasDerivativeInstrAttribType;
    }

    public DerivativeInstrAttribGroupEncoder derivativeInstrAttribType(int value)
    {
        derivativeInstrAttribType = value;
        hasDerivativeInstrAttribType = true;
        return this;
    }

    public int derivativeInstrAttribType()
    {
        return derivativeInstrAttribType;
    }

    private final MutableDirectBuffer derivativeInstrAttribValue = new UnsafeBuffer();

    private int derivativeInstrAttribValueOffset = 0;

    private int derivativeInstrAttribValueLength = 0;

    public DerivativeInstrAttribGroupEncoder derivativeInstrAttribValue(final DirectBuffer value, final int offset, final int length)
    {
        derivativeInstrAttribValue.wrap(value);
        derivativeInstrAttribValueOffset = offset;
        derivativeInstrAttribValueLength = length;
        return this;
    }

    public DerivativeInstrAttribGroupEncoder derivativeInstrAttribValue(final DirectBuffer value, final int length)
    {
        return derivativeInstrAttribValue(value, 0, length);
    }

    public DerivativeInstrAttribGroupEncoder derivativeInstrAttribValue(final DirectBuffer value)
    {
        return derivativeInstrAttribValue(value, 0, value.capacity());
    }

    public DerivativeInstrAttribGroupEncoder derivativeInstrAttribValue(final byte[] value, final int offset, final int length)
    {
        derivativeInstrAttribValue.wrap(value);
        derivativeInstrAttribValueOffset = offset;
        derivativeInstrAttribValueLength = length;
        return this;
    }

    public DerivativeInstrAttribGroupEncoder derivativeInstrAttribValueAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(derivativeInstrAttribValue, value, offset, length);
        derivativeInstrAttribValueOffset = offset;
        derivativeInstrAttribValueLength = length;
        return this;
    }

    public DerivativeInstrAttribGroupEncoder derivativeInstrAttribValue(final byte[] value, final int length)
    {
        return derivativeInstrAttribValue(value, 0, length);
    }

    public DerivativeInstrAttribGroupEncoder derivativeInstrAttribValue(final byte[] value)
    {
        return derivativeInstrAttribValue(value, 0, value.length);
    }

    public boolean hasDerivativeInstrAttribValue()
    {
        return derivativeInstrAttribValueLength > 0;
    }

    public MutableDirectBuffer derivativeInstrAttribValue()
    {
        return derivativeInstrAttribValue;
    }

    public String derivativeInstrAttribValueAsString()
    {
        return derivativeInstrAttribValue.getStringWithoutLengthAscii(derivativeInstrAttribValueOffset, derivativeInstrAttribValueLength);
    }

    public DerivativeInstrAttribGroupEncoder derivativeInstrAttribValue(final CharSequence value)
    {
        toBytes(value, derivativeInstrAttribValue);
        derivativeInstrAttribValueOffset = 0;
        derivativeInstrAttribValueLength = value.length();
        return this;
    }

    public DerivativeInstrAttribGroupEncoder derivativeInstrAttribValue(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            derivativeInstrAttribValue.wrap(buffer);
            derivativeInstrAttribValueOffset = value.offset();
            derivativeInstrAttribValueLength = value.length();
        }
        return this;
    }

    public DerivativeInstrAttribGroupEncoder derivativeInstrAttribValue(final char[] value)
    {
        return derivativeInstrAttribValue(value, 0, value.length);
    }

    public DerivativeInstrAttribGroupEncoder derivativeInstrAttribValue(final char[] value, final int length)
    {
        return derivativeInstrAttribValue(value, 0, length);
    }

    public DerivativeInstrAttribGroupEncoder derivativeInstrAttribValue(final char[] value, final int offset, final int length)
    {
        toBytes(value, derivativeInstrAttribValue, offset, length);
        derivativeInstrAttribValueOffset = 0;
        derivativeInstrAttribValueLength = length;
        return this;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (hasDerivativeInstrAttribType)
        {
            buffer.putBytes(position, derivativeInstrAttribTypeHeader, 0, derivativeInstrAttribTypeHeaderLength);
            position += derivativeInstrAttribTypeHeaderLength;
            position += buffer.putIntAscii(position, derivativeInstrAttribType);
            buffer.putSeparator(position);
            position++;
        }

        if (derivativeInstrAttribValueLength > 0)
        {
            buffer.putBytes(position, derivativeInstrAttribValueHeader, 0, derivativeInstrAttribValueHeaderLength);
            position += derivativeInstrAttribValueHeaderLength;
            buffer.putBytes(position, derivativeInstrAttribValue, derivativeInstrAttribValueOffset, derivativeInstrAttribValueLength);
            position += derivativeInstrAttribValueLength;
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
        this.resetDerivativeInstrAttribType();
        this.resetDerivativeInstrAttribValue();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetDerivativeInstrAttribType()
    {
        hasDerivativeInstrAttribType = false;
    }

    public void resetDerivativeInstrAttribValue()
    {
        derivativeInstrAttribValueLength = 0;
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
        builder.append("\"MessageName\": \"DerivativeInstrAttribGroup\",\n");
        if (hasDerivativeInstrAttribType())
        {
            indent(builder, level);
            builder.append("\"DerivativeInstrAttribType\": \"");
            builder.append(derivativeInstrAttribType);
            builder.append("\",\n");
        }

        if (hasDerivativeInstrAttribValue())
        {
            indent(builder, level);
            builder.append("\"DerivativeInstrAttribValue\": \"");
            appendBuffer(builder, derivativeInstrAttribValue, derivativeInstrAttribValueOffset, derivativeInstrAttribValueLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public DerivativeInstrAttribGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((DerivativeInstrAttribGroupEncoder)encoder);
    }

    public DerivativeInstrAttribGroupEncoder copyTo(final DerivativeInstrAttribGroupEncoder encoder)
    {
        encoder.reset();
        if (hasDerivativeInstrAttribType())
        {
            encoder.derivativeInstrAttribType(this.derivativeInstrAttribType());
        }

        if (hasDerivativeInstrAttribValue())
        {
            encoder.derivativeInstrAttribValueAsCopy(derivativeInstrAttribValue.byteArray(), 0, derivativeInstrAttribValueLength);
        }
        return encoder;
    }

}
    private int noDerivativeInstrAttribGroupCounter;

    private boolean hasNoDerivativeInstrAttribGroupCounter;

    public boolean hasNoDerivativeInstrAttribGroupCounter()
    {
        return hasNoDerivativeInstrAttribGroupCounter;
    }

    public DerivativeInstrumentAttributeEncoder noDerivativeInstrAttribGroupCounter(int value)
    {
        noDerivativeInstrAttribGroupCounter = value;
        hasNoDerivativeInstrAttribGroupCounter = true;
        return this;
    }

    public int noDerivativeInstrAttribGroupCounter()
    {
        return noDerivativeInstrAttribGroupCounter;
    }


    private DerivativeInstrAttribGroupEncoder derivativeInstrAttribGroup = null;

    public DerivativeInstrAttribGroupEncoder derivativeInstrAttribGroup(final int numberOfElements)
    {
        hasNoDerivativeInstrAttribGroupCounter = true;
        noDerivativeInstrAttribGroupCounter = numberOfElements;
        if (derivativeInstrAttribGroup == null)
        {
            derivativeInstrAttribGroup = new DerivativeInstrAttribGroupEncoder();
        }
        return derivativeInstrAttribGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoDerivativeInstrAttribGroupCounter)
        {
            buffer.putBytes(position, noDerivativeInstrAttribGroupCounterHeader, 0, noDerivativeInstrAttribGroupCounterHeaderLength);
            position += noDerivativeInstrAttribGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noDerivativeInstrAttribGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (derivativeInstrAttribGroup != null)
        {
            position += derivativeInstrAttribGroup.encode(buffer, position, noDerivativeInstrAttribGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetDerivativeInstrAttribGroup();
    }

    public void resetDerivativeInstrAttribGroup()
    {
        if (derivativeInstrAttribGroup != null)
        {
            derivativeInstrAttribGroup.reset();
        }
        noDerivativeInstrAttribGroupCounter = 0;
        hasNoDerivativeInstrAttribGroupCounter = false;
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
        builder.append("\"MessageName\": \"DerivativeInstrumentAttribute\",\n");
        if (hasNoDerivativeInstrAttribGroupCounter)
        {
            indent(builder, level);
            builder.append("\"DerivativeInstrAttribGroup\": [\n");
            final int noDerivativeInstrAttribGroupCounter = this.noDerivativeInstrAttribGroupCounter;
            DerivativeInstrAttribGroupEncoder derivativeInstrAttribGroup = this.derivativeInstrAttribGroup;
            for (int i = 0; i < noDerivativeInstrAttribGroupCounter; i++)
            {
                indent(builder, level);
                derivativeInstrAttribGroup.appendTo(builder, level + 1);
                if (i < (noDerivativeInstrAttribGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                derivativeInstrAttribGroup = derivativeInstrAttribGroup.next();
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
    public DerivativeInstrumentAttributeEncoder copyTo(final Encoder encoder)
    {
        return copyTo((DerivativeInstrumentAttributeEncoder)encoder);
    }

    public DerivativeInstrumentAttributeEncoder copyTo(final DerivativeInstrumentAttributeEncoder encoder)
    {
        encoder.reset();
        if (hasNoDerivativeInstrAttribGroupCounter)
        {
            final int size = this.noDerivativeInstrAttribGroupCounter;
            DerivativeInstrAttribGroupEncoder derivativeInstrAttribGroup = this.derivativeInstrAttribGroup;
            DerivativeInstrAttribGroupEncoder derivativeInstrAttribGroupEncoder = encoder.derivativeInstrAttribGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (derivativeInstrAttribGroup != null)
                {
                    derivativeInstrAttribGroup.copyTo(derivativeInstrAttribGroupEncoder);
                    derivativeInstrAttribGroup = derivativeInstrAttribGroup.next();
                    derivativeInstrAttribGroupEncoder = derivativeInstrAttribGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
