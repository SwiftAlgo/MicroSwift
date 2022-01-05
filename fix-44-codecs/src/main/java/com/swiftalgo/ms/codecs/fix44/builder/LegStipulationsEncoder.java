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


public class LegStipulationsEncoder
{
    private static final int noLegStipulationsGroupCounterHeaderLength = 4;
    private static final byte[] noLegStipulationsGroupCounterHeader = new byte[] {54, 56, 51, (byte) '='};



public static class LegStipulationsGroupEncoder
{
    private LegStipulationsGroupEncoder next = null;

    public LegStipulationsGroupEncoder next()
    {
        if (next == null)
        {
            next = new LegStipulationsGroupEncoder();
        }
        return next;
    }

    private static final int legStipulationTypeHeaderLength = 4;
    private static final byte[] legStipulationTypeHeader = new byte[] {54, 56, 56, (byte) '='};

    private static final int legStipulationValueHeaderLength = 4;
    private static final byte[] legStipulationValueHeader = new byte[] {54, 56, 57, (byte) '='};

    private final MutableDirectBuffer legStipulationType = new UnsafeBuffer();

    private int legStipulationTypeOffset = 0;

    private int legStipulationTypeLength = 0;

    public LegStipulationsGroupEncoder legStipulationType(final DirectBuffer value, final int offset, final int length)
    {
        legStipulationType.wrap(value);
        legStipulationTypeOffset = offset;
        legStipulationTypeLength = length;
        return this;
    }

    public LegStipulationsGroupEncoder legStipulationType(final DirectBuffer value, final int length)
    {
        return legStipulationType(value, 0, length);
    }

    public LegStipulationsGroupEncoder legStipulationType(final DirectBuffer value)
    {
        return legStipulationType(value, 0, value.capacity());
    }

    public LegStipulationsGroupEncoder legStipulationType(final byte[] value, final int offset, final int length)
    {
        legStipulationType.wrap(value);
        legStipulationTypeOffset = offset;
        legStipulationTypeLength = length;
        return this;
    }

    public LegStipulationsGroupEncoder legStipulationTypeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(legStipulationType, value, offset, length);
        legStipulationTypeOffset = offset;
        legStipulationTypeLength = length;
        return this;
    }

    public LegStipulationsGroupEncoder legStipulationType(final byte[] value, final int length)
    {
        return legStipulationType(value, 0, length);
    }

    public LegStipulationsGroupEncoder legStipulationType(final byte[] value)
    {
        return legStipulationType(value, 0, value.length);
    }

    public boolean hasLegStipulationType()
    {
        return legStipulationTypeLength > 0;
    }

    public MutableDirectBuffer legStipulationType()
    {
        return legStipulationType;
    }

    public String legStipulationTypeAsString()
    {
        return legStipulationType.getStringWithoutLengthAscii(legStipulationTypeOffset, legStipulationTypeLength);
    }

    public LegStipulationsGroupEncoder legStipulationType(final CharSequence value)
    {
        toBytes(value, legStipulationType);
        legStipulationTypeOffset = 0;
        legStipulationTypeLength = value.length();
        return this;
    }

    public LegStipulationsGroupEncoder legStipulationType(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            legStipulationType.wrap(buffer);
            legStipulationTypeOffset = value.offset();
            legStipulationTypeLength = value.length();
        }
        return this;
    }

    public LegStipulationsGroupEncoder legStipulationType(final char[] value)
    {
        return legStipulationType(value, 0, value.length);
    }

    public LegStipulationsGroupEncoder legStipulationType(final char[] value, final int length)
    {
        return legStipulationType(value, 0, length);
    }

    public LegStipulationsGroupEncoder legStipulationType(final char[] value, final int offset, final int length)
    {
        toBytes(value, legStipulationType, offset, length);
        legStipulationTypeOffset = 0;
        legStipulationTypeLength = length;
        return this;
    }

    private final MutableDirectBuffer legStipulationValue = new UnsafeBuffer();

    private int legStipulationValueOffset = 0;

    private int legStipulationValueLength = 0;

    public LegStipulationsGroupEncoder legStipulationValue(final DirectBuffer value, final int offset, final int length)
    {
        legStipulationValue.wrap(value);
        legStipulationValueOffset = offset;
        legStipulationValueLength = length;
        return this;
    }

    public LegStipulationsGroupEncoder legStipulationValue(final DirectBuffer value, final int length)
    {
        return legStipulationValue(value, 0, length);
    }

    public LegStipulationsGroupEncoder legStipulationValue(final DirectBuffer value)
    {
        return legStipulationValue(value, 0, value.capacity());
    }

    public LegStipulationsGroupEncoder legStipulationValue(final byte[] value, final int offset, final int length)
    {
        legStipulationValue.wrap(value);
        legStipulationValueOffset = offset;
        legStipulationValueLength = length;
        return this;
    }

    public LegStipulationsGroupEncoder legStipulationValueAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(legStipulationValue, value, offset, length);
        legStipulationValueOffset = offset;
        legStipulationValueLength = length;
        return this;
    }

    public LegStipulationsGroupEncoder legStipulationValue(final byte[] value, final int length)
    {
        return legStipulationValue(value, 0, length);
    }

    public LegStipulationsGroupEncoder legStipulationValue(final byte[] value)
    {
        return legStipulationValue(value, 0, value.length);
    }

    public boolean hasLegStipulationValue()
    {
        return legStipulationValueLength > 0;
    }

    public MutableDirectBuffer legStipulationValue()
    {
        return legStipulationValue;
    }

    public String legStipulationValueAsString()
    {
        return legStipulationValue.getStringWithoutLengthAscii(legStipulationValueOffset, legStipulationValueLength);
    }

    public LegStipulationsGroupEncoder legStipulationValue(final CharSequence value)
    {
        toBytes(value, legStipulationValue);
        legStipulationValueOffset = 0;
        legStipulationValueLength = value.length();
        return this;
    }

    public LegStipulationsGroupEncoder legStipulationValue(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            legStipulationValue.wrap(buffer);
            legStipulationValueOffset = value.offset();
            legStipulationValueLength = value.length();
        }
        return this;
    }

    public LegStipulationsGroupEncoder legStipulationValue(final char[] value)
    {
        return legStipulationValue(value, 0, value.length);
    }

    public LegStipulationsGroupEncoder legStipulationValue(final char[] value, final int length)
    {
        return legStipulationValue(value, 0, length);
    }

    public LegStipulationsGroupEncoder legStipulationValue(final char[] value, final int offset, final int length)
    {
        toBytes(value, legStipulationValue, offset, length);
        legStipulationValueOffset = 0;
        legStipulationValueLength = length;
        return this;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (legStipulationTypeLength > 0)
        {
            buffer.putBytes(position, legStipulationTypeHeader, 0, legStipulationTypeHeaderLength);
            position += legStipulationTypeHeaderLength;
            buffer.putBytes(position, legStipulationType, legStipulationTypeOffset, legStipulationTypeLength);
            position += legStipulationTypeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (legStipulationValueLength > 0)
        {
            buffer.putBytes(position, legStipulationValueHeader, 0, legStipulationValueHeaderLength);
            position += legStipulationValueHeaderLength;
            buffer.putBytes(position, legStipulationValue, legStipulationValueOffset, legStipulationValueLength);
            position += legStipulationValueLength;
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
        this.resetLegStipulationType();
        this.resetLegStipulationValue();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetLegStipulationType()
    {
        legStipulationTypeLength = 0;
    }

    public void resetLegStipulationValue()
    {
        legStipulationValueLength = 0;
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
        builder.append("\"MessageName\": \"LegStipulationsGroup\",\n");
        if (hasLegStipulationType())
        {
            indent(builder, level);
            builder.append("\"LegStipulationType\": \"");
            appendBuffer(builder, legStipulationType, legStipulationTypeOffset, legStipulationTypeLength);
            builder.append("\",\n");
        }

        if (hasLegStipulationValue())
        {
            indent(builder, level);
            builder.append("\"LegStipulationValue\": \"");
            appendBuffer(builder, legStipulationValue, legStipulationValueOffset, legStipulationValueLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public LegStipulationsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((LegStipulationsGroupEncoder)encoder);
    }

    public LegStipulationsGroupEncoder copyTo(final LegStipulationsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasLegStipulationType())
        {
            encoder.legStipulationTypeAsCopy(legStipulationType.byteArray(), 0, legStipulationTypeLength);
        }

        if (hasLegStipulationValue())
        {
            encoder.legStipulationValueAsCopy(legStipulationValue.byteArray(), 0, legStipulationValueLength);
        }
        return encoder;
    }

}
    private int noLegStipulationsGroupCounter;

    private boolean hasNoLegStipulationsGroupCounter;

    public boolean hasNoLegStipulationsGroupCounter()
    {
        return hasNoLegStipulationsGroupCounter;
    }

    public LegStipulationsEncoder noLegStipulationsGroupCounter(int value)
    {
        noLegStipulationsGroupCounter = value;
        hasNoLegStipulationsGroupCounter = true;
        return this;
    }

    public int noLegStipulationsGroupCounter()
    {
        return noLegStipulationsGroupCounter;
    }


    private LegStipulationsGroupEncoder legStipulationsGroup = null;

    public LegStipulationsGroupEncoder legStipulationsGroup(final int numberOfElements)
    {
        hasNoLegStipulationsGroupCounter = true;
        noLegStipulationsGroupCounter = numberOfElements;
        if (legStipulationsGroup == null)
        {
            legStipulationsGroup = new LegStipulationsGroupEncoder();
        }
        return legStipulationsGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoLegStipulationsGroupCounter)
        {
            buffer.putBytes(position, noLegStipulationsGroupCounterHeader, 0, noLegStipulationsGroupCounterHeaderLength);
            position += noLegStipulationsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noLegStipulationsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (legStipulationsGroup != null)
        {
            position += legStipulationsGroup.encode(buffer, position, noLegStipulationsGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetLegStipulationsGroup();
    }

    public void resetLegStipulationsGroup()
    {
        if (legStipulationsGroup != null)
        {
            legStipulationsGroup.reset();
        }
        noLegStipulationsGroupCounter = 0;
        hasNoLegStipulationsGroupCounter = false;
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
        builder.append("\"MessageName\": \"LegStipulations\",\n");
        if (hasNoLegStipulationsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"LegStipulationsGroup\": [\n");
            final int noLegStipulationsGroupCounter = this.noLegStipulationsGroupCounter;
            LegStipulationsGroupEncoder legStipulationsGroup = this.legStipulationsGroup;
            for (int i = 0; i < noLegStipulationsGroupCounter; i++)
            {
                indent(builder, level);
                legStipulationsGroup.appendTo(builder, level + 1);
                if (i < (noLegStipulationsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                legStipulationsGroup = legStipulationsGroup.next();
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
    public LegStipulationsEncoder copyTo(final Encoder encoder)
    {
        return copyTo((LegStipulationsEncoder)encoder);
    }

    public LegStipulationsEncoder copyTo(final LegStipulationsEncoder encoder)
    {
        encoder.reset();
        if (hasNoLegStipulationsGroupCounter)
        {
            final int size = this.noLegStipulationsGroupCounter;
            LegStipulationsGroupEncoder legStipulationsGroup = this.legStipulationsGroup;
            LegStipulationsGroupEncoder legStipulationsGroupEncoder = encoder.legStipulationsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (legStipulationsGroup != null)
                {
                    legStipulationsGroup.copyTo(legStipulationsGroupEncoder);
                    legStipulationsGroup = legStipulationsGroup.next();
                    legStipulationsGroupEncoder = legStipulationsGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
