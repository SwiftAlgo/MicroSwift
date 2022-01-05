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


public class StrategyParametersGrpEncoder
{
    private static final int noStrategyParametersGroupCounterHeaderLength = 4;
    private static final byte[] noStrategyParametersGroupCounterHeader = new byte[] {57, 53, 55, (byte) '='};



public static class StrategyParametersGroupEncoder
{
    private StrategyParametersGroupEncoder next = null;

    public StrategyParametersGroupEncoder next()
    {
        if (next == null)
        {
            next = new StrategyParametersGroupEncoder();
        }
        return next;
    }

    private static final int strategyParameterNameHeaderLength = 4;
    private static final byte[] strategyParameterNameHeader = new byte[] {57, 53, 56, (byte) '='};

    private static final int strategyParameterTypeHeaderLength = 4;
    private static final byte[] strategyParameterTypeHeader = new byte[] {57, 53, 57, (byte) '='};

    private static final int strategyParameterValueHeaderLength = 4;
    private static final byte[] strategyParameterValueHeader = new byte[] {57, 54, 48, (byte) '='};

    private final MutableDirectBuffer strategyParameterName = new UnsafeBuffer();

    private int strategyParameterNameOffset = 0;

    private int strategyParameterNameLength = 0;

    public StrategyParametersGroupEncoder strategyParameterName(final DirectBuffer value, final int offset, final int length)
    {
        strategyParameterName.wrap(value);
        strategyParameterNameOffset = offset;
        strategyParameterNameLength = length;
        return this;
    }

    public StrategyParametersGroupEncoder strategyParameterName(final DirectBuffer value, final int length)
    {
        return strategyParameterName(value, 0, length);
    }

    public StrategyParametersGroupEncoder strategyParameterName(final DirectBuffer value)
    {
        return strategyParameterName(value, 0, value.capacity());
    }

    public StrategyParametersGroupEncoder strategyParameterName(final byte[] value, final int offset, final int length)
    {
        strategyParameterName.wrap(value);
        strategyParameterNameOffset = offset;
        strategyParameterNameLength = length;
        return this;
    }

    public StrategyParametersGroupEncoder strategyParameterNameAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(strategyParameterName, value, offset, length);
        strategyParameterNameOffset = offset;
        strategyParameterNameLength = length;
        return this;
    }

    public StrategyParametersGroupEncoder strategyParameterName(final byte[] value, final int length)
    {
        return strategyParameterName(value, 0, length);
    }

    public StrategyParametersGroupEncoder strategyParameterName(final byte[] value)
    {
        return strategyParameterName(value, 0, value.length);
    }

    public boolean hasStrategyParameterName()
    {
        return strategyParameterNameLength > 0;
    }

    public MutableDirectBuffer strategyParameterName()
    {
        return strategyParameterName;
    }

    public String strategyParameterNameAsString()
    {
        return strategyParameterName.getStringWithoutLengthAscii(strategyParameterNameOffset, strategyParameterNameLength);
    }

    public StrategyParametersGroupEncoder strategyParameterName(final CharSequence value)
    {
        toBytes(value, strategyParameterName);
        strategyParameterNameOffset = 0;
        strategyParameterNameLength = value.length();
        return this;
    }

    public StrategyParametersGroupEncoder strategyParameterName(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            strategyParameterName.wrap(buffer);
            strategyParameterNameOffset = value.offset();
            strategyParameterNameLength = value.length();
        }
        return this;
    }

    public StrategyParametersGroupEncoder strategyParameterName(final char[] value)
    {
        return strategyParameterName(value, 0, value.length);
    }

    public StrategyParametersGroupEncoder strategyParameterName(final char[] value, final int length)
    {
        return strategyParameterName(value, 0, length);
    }

    public StrategyParametersGroupEncoder strategyParameterName(final char[] value, final int offset, final int length)
    {
        toBytes(value, strategyParameterName, offset, length);
        strategyParameterNameOffset = 0;
        strategyParameterNameLength = length;
        return this;
    }

    private int strategyParameterType;

    private boolean hasStrategyParameterType;

    public boolean hasStrategyParameterType()
    {
        return hasStrategyParameterType;
    }

    public StrategyParametersGroupEncoder strategyParameterType(int value)
    {
        strategyParameterType = value;
        hasStrategyParameterType = true;
        return this;
    }

    public int strategyParameterType()
    {
        return strategyParameterType;
    }

    public StrategyParametersGroupEncoder strategyParameterType(StrategyParameterType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == StrategyParameterType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: strategyParameterType Value: " + value );
            }
            if (value == StrategyParameterType.NULL_VAL)
            {
                return this;
            }
        }
        return strategyParameterType(value.representation());
    }

    private final MutableDirectBuffer strategyParameterValue = new UnsafeBuffer();

    private int strategyParameterValueOffset = 0;

    private int strategyParameterValueLength = 0;

    public StrategyParametersGroupEncoder strategyParameterValue(final DirectBuffer value, final int offset, final int length)
    {
        strategyParameterValue.wrap(value);
        strategyParameterValueOffset = offset;
        strategyParameterValueLength = length;
        return this;
    }

    public StrategyParametersGroupEncoder strategyParameterValue(final DirectBuffer value, final int length)
    {
        return strategyParameterValue(value, 0, length);
    }

    public StrategyParametersGroupEncoder strategyParameterValue(final DirectBuffer value)
    {
        return strategyParameterValue(value, 0, value.capacity());
    }

    public StrategyParametersGroupEncoder strategyParameterValue(final byte[] value, final int offset, final int length)
    {
        strategyParameterValue.wrap(value);
        strategyParameterValueOffset = offset;
        strategyParameterValueLength = length;
        return this;
    }

    public StrategyParametersGroupEncoder strategyParameterValueAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(strategyParameterValue, value, offset, length);
        strategyParameterValueOffset = offset;
        strategyParameterValueLength = length;
        return this;
    }

    public StrategyParametersGroupEncoder strategyParameterValue(final byte[] value, final int length)
    {
        return strategyParameterValue(value, 0, length);
    }

    public StrategyParametersGroupEncoder strategyParameterValue(final byte[] value)
    {
        return strategyParameterValue(value, 0, value.length);
    }

    public boolean hasStrategyParameterValue()
    {
        return strategyParameterValueLength > 0;
    }

    public MutableDirectBuffer strategyParameterValue()
    {
        return strategyParameterValue;
    }

    public String strategyParameterValueAsString()
    {
        return strategyParameterValue.getStringWithoutLengthAscii(strategyParameterValueOffset, strategyParameterValueLength);
    }

    public StrategyParametersGroupEncoder strategyParameterValue(final CharSequence value)
    {
        toBytes(value, strategyParameterValue);
        strategyParameterValueOffset = 0;
        strategyParameterValueLength = value.length();
        return this;
    }

    public StrategyParametersGroupEncoder strategyParameterValue(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            strategyParameterValue.wrap(buffer);
            strategyParameterValueOffset = value.offset();
            strategyParameterValueLength = value.length();
        }
        return this;
    }

    public StrategyParametersGroupEncoder strategyParameterValue(final char[] value)
    {
        return strategyParameterValue(value, 0, value.length);
    }

    public StrategyParametersGroupEncoder strategyParameterValue(final char[] value, final int length)
    {
        return strategyParameterValue(value, 0, length);
    }

    public StrategyParametersGroupEncoder strategyParameterValue(final char[] value, final int offset, final int length)
    {
        toBytes(value, strategyParameterValue, offset, length);
        strategyParameterValueOffset = 0;
        strategyParameterValueLength = length;
        return this;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (strategyParameterNameLength > 0)
        {
            buffer.putBytes(position, strategyParameterNameHeader, 0, strategyParameterNameHeaderLength);
            position += strategyParameterNameHeaderLength;
            buffer.putBytes(position, strategyParameterName, strategyParameterNameOffset, strategyParameterNameLength);
            position += strategyParameterNameLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasStrategyParameterType)
        {
            buffer.putBytes(position, strategyParameterTypeHeader, 0, strategyParameterTypeHeaderLength);
            position += strategyParameterTypeHeaderLength;
            position += buffer.putIntAscii(position, strategyParameterType);
            buffer.putSeparator(position);
            position++;
        }

        if (strategyParameterValueLength > 0)
        {
            buffer.putBytes(position, strategyParameterValueHeader, 0, strategyParameterValueHeaderLength);
            position += strategyParameterValueHeaderLength;
            buffer.putBytes(position, strategyParameterValue, strategyParameterValueOffset, strategyParameterValueLength);
            position += strategyParameterValueLength;
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
        this.resetStrategyParameterName();
        this.resetStrategyParameterType();
        this.resetStrategyParameterValue();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetStrategyParameterName()
    {
        strategyParameterNameLength = 0;
    }

    public void resetStrategyParameterType()
    {
        hasStrategyParameterType = false;
    }

    public void resetStrategyParameterValue()
    {
        strategyParameterValueLength = 0;
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
        builder.append("\"MessageName\": \"StrategyParametersGroup\",\n");
        if (hasStrategyParameterName())
        {
            indent(builder, level);
            builder.append("\"StrategyParameterName\": \"");
            appendBuffer(builder, strategyParameterName, strategyParameterNameOffset, strategyParameterNameLength);
            builder.append("\",\n");
        }

        if (hasStrategyParameterType())
        {
            indent(builder, level);
            builder.append("\"StrategyParameterType\": \"");
            builder.append(strategyParameterType);
            builder.append("\",\n");
        }

        if (hasStrategyParameterValue())
        {
            indent(builder, level);
            builder.append("\"StrategyParameterValue\": \"");
            appendBuffer(builder, strategyParameterValue, strategyParameterValueOffset, strategyParameterValueLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public StrategyParametersGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((StrategyParametersGroupEncoder)encoder);
    }

    public StrategyParametersGroupEncoder copyTo(final StrategyParametersGroupEncoder encoder)
    {
        encoder.reset();
        if (hasStrategyParameterName())
        {
            encoder.strategyParameterNameAsCopy(strategyParameterName.byteArray(), 0, strategyParameterNameLength);
        }

        if (hasStrategyParameterType())
        {
            encoder.strategyParameterType(this.strategyParameterType());
        }

        if (hasStrategyParameterValue())
        {
            encoder.strategyParameterValueAsCopy(strategyParameterValue.byteArray(), 0, strategyParameterValueLength);
        }
        return encoder;
    }

}
    private int noStrategyParametersGroupCounter;

    private boolean hasNoStrategyParametersGroupCounter;

    public boolean hasNoStrategyParametersGroupCounter()
    {
        return hasNoStrategyParametersGroupCounter;
    }

    public StrategyParametersGrpEncoder noStrategyParametersGroupCounter(int value)
    {
        noStrategyParametersGroupCounter = value;
        hasNoStrategyParametersGroupCounter = true;
        return this;
    }

    public int noStrategyParametersGroupCounter()
    {
        return noStrategyParametersGroupCounter;
    }


    private StrategyParametersGroupEncoder strategyParametersGroup = null;

    public StrategyParametersGroupEncoder strategyParametersGroup(final int numberOfElements)
    {
        hasNoStrategyParametersGroupCounter = true;
        noStrategyParametersGroupCounter = numberOfElements;
        if (strategyParametersGroup == null)
        {
            strategyParametersGroup = new StrategyParametersGroupEncoder();
        }
        return strategyParametersGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoStrategyParametersGroupCounter)
        {
            buffer.putBytes(position, noStrategyParametersGroupCounterHeader, 0, noStrategyParametersGroupCounterHeaderLength);
            position += noStrategyParametersGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noStrategyParametersGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (strategyParametersGroup != null)
        {
            position += strategyParametersGroup.encode(buffer, position, noStrategyParametersGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetStrategyParametersGroup();
    }

    public void resetStrategyParametersGroup()
    {
        if (strategyParametersGroup != null)
        {
            strategyParametersGroup.reset();
        }
        noStrategyParametersGroupCounter = 0;
        hasNoStrategyParametersGroupCounter = false;
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
        builder.append("\"MessageName\": \"StrategyParametersGrp\",\n");
        if (hasNoStrategyParametersGroupCounter)
        {
            indent(builder, level);
            builder.append("\"StrategyParametersGroup\": [\n");
            final int noStrategyParametersGroupCounter = this.noStrategyParametersGroupCounter;
            StrategyParametersGroupEncoder strategyParametersGroup = this.strategyParametersGroup;
            for (int i = 0; i < noStrategyParametersGroupCounter; i++)
            {
                indent(builder, level);
                strategyParametersGroup.appendTo(builder, level + 1);
                if (i < (noStrategyParametersGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                strategyParametersGroup = strategyParametersGroup.next();
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
    public StrategyParametersGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((StrategyParametersGrpEncoder)encoder);
    }

    public StrategyParametersGrpEncoder copyTo(final StrategyParametersGrpEncoder encoder)
    {
        encoder.reset();
        if (hasNoStrategyParametersGroupCounter)
        {
            final int size = this.noStrategyParametersGroupCounter;
            StrategyParametersGroupEncoder strategyParametersGroup = this.strategyParametersGroup;
            StrategyParametersGroupEncoder strategyParametersGroupEncoder = encoder.strategyParametersGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (strategyParametersGroup != null)
                {
                    strategyParametersGroup.copyTo(strategyParametersGroupEncoder);
                    strategyParametersGroup = strategyParametersGroup.next();
                    strategyParametersGroupEncoder = strategyParametersGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
