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


public class ComplexEventTimesEncoder
{
    private static final int noComplexEventTimesGroupCounterHeaderLength = 5;
    private static final byte[] noComplexEventTimesGroupCounterHeader = new byte[] {49, 52, 57, 52, (byte) '='};



public static class ComplexEventTimesGroupEncoder
{
    private ComplexEventTimesGroupEncoder next = null;

    public ComplexEventTimesGroupEncoder next()
    {
        if (next == null)
        {
            next = new ComplexEventTimesGroupEncoder();
        }
        return next;
    }

    private static final int complexEventStartTimeHeaderLength = 5;
    private static final byte[] complexEventStartTimeHeader = new byte[] {49, 52, 57, 53, (byte) '='};

    private static final int complexEventEndTimeHeaderLength = 5;
    private static final byte[] complexEventEndTimeHeader = new byte[] {49, 52, 57, 54, (byte) '='};

    private final MutableDirectBuffer complexEventStartTime = new UnsafeBuffer();

    private int complexEventStartTimeOffset = 0;

    private int complexEventStartTimeLength = 0;

    public ComplexEventTimesGroupEncoder complexEventStartTime(final DirectBuffer value, final int offset, final int length)
    {
        complexEventStartTime.wrap(value);
        complexEventStartTimeOffset = offset;
        complexEventStartTimeLength = length;
        return this;
    }

    public ComplexEventTimesGroupEncoder complexEventStartTime(final DirectBuffer value, final int length)
    {
        return complexEventStartTime(value, 0, length);
    }

    public ComplexEventTimesGroupEncoder complexEventStartTime(final DirectBuffer value)
    {
        return complexEventStartTime(value, 0, value.capacity());
    }

    public ComplexEventTimesGroupEncoder complexEventStartTime(final byte[] value, final int offset, final int length)
    {
        complexEventStartTime.wrap(value);
        complexEventStartTimeOffset = offset;
        complexEventStartTimeLength = length;
        return this;
    }

    public ComplexEventTimesGroupEncoder complexEventStartTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(complexEventStartTime, value, offset, length);
        complexEventStartTimeOffset = offset;
        complexEventStartTimeLength = length;
        return this;
    }

    public ComplexEventTimesGroupEncoder complexEventStartTime(final byte[] value, final int length)
    {
        return complexEventStartTime(value, 0, length);
    }

    public ComplexEventTimesGroupEncoder complexEventStartTime(final byte[] value)
    {
        return complexEventStartTime(value, 0, value.length);
    }

    public boolean hasComplexEventStartTime()
    {
        return complexEventStartTimeLength > 0;
    }

    public MutableDirectBuffer complexEventStartTime()
    {
        return complexEventStartTime;
    }

    public String complexEventStartTimeAsString()
    {
        return complexEventStartTime.getStringWithoutLengthAscii(complexEventStartTimeOffset, complexEventStartTimeLength);
    }

    private final MutableDirectBuffer complexEventEndTime = new UnsafeBuffer();

    private int complexEventEndTimeOffset = 0;

    private int complexEventEndTimeLength = 0;

    public ComplexEventTimesGroupEncoder complexEventEndTime(final DirectBuffer value, final int offset, final int length)
    {
        complexEventEndTime.wrap(value);
        complexEventEndTimeOffset = offset;
        complexEventEndTimeLength = length;
        return this;
    }

    public ComplexEventTimesGroupEncoder complexEventEndTime(final DirectBuffer value, final int length)
    {
        return complexEventEndTime(value, 0, length);
    }

    public ComplexEventTimesGroupEncoder complexEventEndTime(final DirectBuffer value)
    {
        return complexEventEndTime(value, 0, value.capacity());
    }

    public ComplexEventTimesGroupEncoder complexEventEndTime(final byte[] value, final int offset, final int length)
    {
        complexEventEndTime.wrap(value);
        complexEventEndTimeOffset = offset;
        complexEventEndTimeLength = length;
        return this;
    }

    public ComplexEventTimesGroupEncoder complexEventEndTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(complexEventEndTime, value, offset, length);
        complexEventEndTimeOffset = offset;
        complexEventEndTimeLength = length;
        return this;
    }

    public ComplexEventTimesGroupEncoder complexEventEndTime(final byte[] value, final int length)
    {
        return complexEventEndTime(value, 0, length);
    }

    public ComplexEventTimesGroupEncoder complexEventEndTime(final byte[] value)
    {
        return complexEventEndTime(value, 0, value.length);
    }

    public boolean hasComplexEventEndTime()
    {
        return complexEventEndTimeLength > 0;
    }

    public MutableDirectBuffer complexEventEndTime()
    {
        return complexEventEndTime;
    }

    public String complexEventEndTimeAsString()
    {
        return complexEventEndTime.getStringWithoutLengthAscii(complexEventEndTimeOffset, complexEventEndTimeLength);
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (complexEventStartTimeLength > 0)
        {
            buffer.putBytes(position, complexEventStartTimeHeader, 0, complexEventStartTimeHeaderLength);
            position += complexEventStartTimeHeaderLength;
            buffer.putBytes(position, complexEventStartTime, complexEventStartTimeOffset, complexEventStartTimeLength);
            position += complexEventStartTimeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (complexEventEndTimeLength > 0)
        {
            buffer.putBytes(position, complexEventEndTimeHeader, 0, complexEventEndTimeHeaderLength);
            position += complexEventEndTimeHeaderLength;
            buffer.putBytes(position, complexEventEndTime, complexEventEndTimeOffset, complexEventEndTimeLength);
            position += complexEventEndTimeLength;
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
        this.resetComplexEventStartTime();
        this.resetComplexEventEndTime();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetComplexEventStartTime()
    {
        complexEventStartTimeLength = 0;
    }

    public void resetComplexEventEndTime()
    {
        complexEventEndTimeLength = 0;
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
        builder.append("\"MessageName\": \"ComplexEventTimesGroup\",\n");
        if (hasComplexEventStartTime())
        {
            indent(builder, level);
            builder.append("\"ComplexEventStartTime\": \"");
            appendBuffer(builder, complexEventStartTime, complexEventStartTimeOffset, complexEventStartTimeLength);
            builder.append("\",\n");
        }

        if (hasComplexEventEndTime())
        {
            indent(builder, level);
            builder.append("\"ComplexEventEndTime\": \"");
            appendBuffer(builder, complexEventEndTime, complexEventEndTimeOffset, complexEventEndTimeLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public ComplexEventTimesGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((ComplexEventTimesGroupEncoder)encoder);
    }

    public ComplexEventTimesGroupEncoder copyTo(final ComplexEventTimesGroupEncoder encoder)
    {
        encoder.reset();
        if (hasComplexEventStartTime())
        {
            encoder.complexEventStartTimeAsCopy(complexEventStartTime.byteArray(), 0, complexEventStartTimeLength);
        }

        if (hasComplexEventEndTime())
        {
            encoder.complexEventEndTimeAsCopy(complexEventEndTime.byteArray(), 0, complexEventEndTimeLength);
        }
        return encoder;
    }

}
    private int noComplexEventTimesGroupCounter;

    private boolean hasNoComplexEventTimesGroupCounter;

    public boolean hasNoComplexEventTimesGroupCounter()
    {
        return hasNoComplexEventTimesGroupCounter;
    }

    public ComplexEventTimesEncoder noComplexEventTimesGroupCounter(int value)
    {
        noComplexEventTimesGroupCounter = value;
        hasNoComplexEventTimesGroupCounter = true;
        return this;
    }

    public int noComplexEventTimesGroupCounter()
    {
        return noComplexEventTimesGroupCounter;
    }


    private ComplexEventTimesGroupEncoder complexEventTimesGroup = null;

    public ComplexEventTimesGroupEncoder complexEventTimesGroup(final int numberOfElements)
    {
        hasNoComplexEventTimesGroupCounter = true;
        noComplexEventTimesGroupCounter = numberOfElements;
        if (complexEventTimesGroup == null)
        {
            complexEventTimesGroup = new ComplexEventTimesGroupEncoder();
        }
        return complexEventTimesGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoComplexEventTimesGroupCounter)
        {
            buffer.putBytes(position, noComplexEventTimesGroupCounterHeader, 0, noComplexEventTimesGroupCounterHeaderLength);
            position += noComplexEventTimesGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noComplexEventTimesGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (complexEventTimesGroup != null)
        {
            position += complexEventTimesGroup.encode(buffer, position, noComplexEventTimesGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetComplexEventTimesGroup();
    }

    public void resetComplexEventTimesGroup()
    {
        if (complexEventTimesGroup != null)
        {
            complexEventTimesGroup.reset();
        }
        noComplexEventTimesGroupCounter = 0;
        hasNoComplexEventTimesGroupCounter = false;
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
        builder.append("\"MessageName\": \"ComplexEventTimes\",\n");
        if (hasNoComplexEventTimesGroupCounter)
        {
            indent(builder, level);
            builder.append("\"ComplexEventTimesGroup\": [\n");
            final int noComplexEventTimesGroupCounter = this.noComplexEventTimesGroupCounter;
            ComplexEventTimesGroupEncoder complexEventTimesGroup = this.complexEventTimesGroup;
            for (int i = 0; i < noComplexEventTimesGroupCounter; i++)
            {
                indent(builder, level);
                complexEventTimesGroup.appendTo(builder, level + 1);
                if (i < (noComplexEventTimesGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                complexEventTimesGroup = complexEventTimesGroup.next();
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
    public ComplexEventTimesEncoder copyTo(final Encoder encoder)
    {
        return copyTo((ComplexEventTimesEncoder)encoder);
    }

    public ComplexEventTimesEncoder copyTo(final ComplexEventTimesEncoder encoder)
    {
        encoder.reset();
        if (hasNoComplexEventTimesGroupCounter)
        {
            final int size = this.noComplexEventTimesGroupCounter;
            ComplexEventTimesGroupEncoder complexEventTimesGroup = this.complexEventTimesGroup;
            ComplexEventTimesGroupEncoder complexEventTimesGroupEncoder = encoder.complexEventTimesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (complexEventTimesGroup != null)
                {
                    complexEventTimesGroup.copyTo(complexEventTimesGroupEncoder);
                    complexEventTimesGroup = complexEventTimesGroup.next();
                    complexEventTimesGroupEncoder = complexEventTimesGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
