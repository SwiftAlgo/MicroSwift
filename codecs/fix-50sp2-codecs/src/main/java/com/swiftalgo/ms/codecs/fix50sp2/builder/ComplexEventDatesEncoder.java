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


public class ComplexEventDatesEncoder
{
    private static final int noComplexEventDatesGroupCounterHeaderLength = 5;
    private static final byte[] noComplexEventDatesGroupCounterHeader = new byte[] {49, 52, 57, 49, (byte) '='};



public static class ComplexEventDatesGroupEncoder
{
    private ComplexEventDatesGroupEncoder next = null;

    public ComplexEventDatesGroupEncoder next()
    {
        if (next == null)
        {
            next = new ComplexEventDatesGroupEncoder();
        }
        return next;
    }

    private static final int complexEventStartDateHeaderLength = 5;
    private static final byte[] complexEventStartDateHeader = new byte[] {49, 52, 57, 50, (byte) '='};

    private static final int complexEventEndDateHeaderLength = 5;
    private static final byte[] complexEventEndDateHeader = new byte[] {49, 52, 57, 51, (byte) '='};

    private final MutableDirectBuffer complexEventStartDate = new UnsafeBuffer();

    private int complexEventStartDateOffset = 0;

    private int complexEventStartDateLength = 0;

    public ComplexEventDatesGroupEncoder complexEventStartDate(final DirectBuffer value, final int offset, final int length)
    {
        complexEventStartDate.wrap(value);
        complexEventStartDateOffset = offset;
        complexEventStartDateLength = length;
        return this;
    }

    public ComplexEventDatesGroupEncoder complexEventStartDate(final DirectBuffer value, final int length)
    {
        return complexEventStartDate(value, 0, length);
    }

    public ComplexEventDatesGroupEncoder complexEventStartDate(final DirectBuffer value)
    {
        return complexEventStartDate(value, 0, value.capacity());
    }

    public ComplexEventDatesGroupEncoder complexEventStartDate(final byte[] value, final int offset, final int length)
    {
        complexEventStartDate.wrap(value);
        complexEventStartDateOffset = offset;
        complexEventStartDateLength = length;
        return this;
    }

    public ComplexEventDatesGroupEncoder complexEventStartDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(complexEventStartDate, value, offset, length);
        complexEventStartDateOffset = offset;
        complexEventStartDateLength = length;
        return this;
    }

    public ComplexEventDatesGroupEncoder complexEventStartDate(final byte[] value, final int length)
    {
        return complexEventStartDate(value, 0, length);
    }

    public ComplexEventDatesGroupEncoder complexEventStartDate(final byte[] value)
    {
        return complexEventStartDate(value, 0, value.length);
    }

    public boolean hasComplexEventStartDate()
    {
        return complexEventStartDateLength > 0;
    }

    public MutableDirectBuffer complexEventStartDate()
    {
        return complexEventStartDate;
    }

    public String complexEventStartDateAsString()
    {
        return complexEventStartDate.getStringWithoutLengthAscii(complexEventStartDateOffset, complexEventStartDateLength);
    }

    private final MutableDirectBuffer complexEventEndDate = new UnsafeBuffer();

    private int complexEventEndDateOffset = 0;

    private int complexEventEndDateLength = 0;

    public ComplexEventDatesGroupEncoder complexEventEndDate(final DirectBuffer value, final int offset, final int length)
    {
        complexEventEndDate.wrap(value);
        complexEventEndDateOffset = offset;
        complexEventEndDateLength = length;
        return this;
    }

    public ComplexEventDatesGroupEncoder complexEventEndDate(final DirectBuffer value, final int length)
    {
        return complexEventEndDate(value, 0, length);
    }

    public ComplexEventDatesGroupEncoder complexEventEndDate(final DirectBuffer value)
    {
        return complexEventEndDate(value, 0, value.capacity());
    }

    public ComplexEventDatesGroupEncoder complexEventEndDate(final byte[] value, final int offset, final int length)
    {
        complexEventEndDate.wrap(value);
        complexEventEndDateOffset = offset;
        complexEventEndDateLength = length;
        return this;
    }

    public ComplexEventDatesGroupEncoder complexEventEndDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(complexEventEndDate, value, offset, length);
        complexEventEndDateOffset = offset;
        complexEventEndDateLength = length;
        return this;
    }

    public ComplexEventDatesGroupEncoder complexEventEndDate(final byte[] value, final int length)
    {
        return complexEventEndDate(value, 0, length);
    }

    public ComplexEventDatesGroupEncoder complexEventEndDate(final byte[] value)
    {
        return complexEventEndDate(value, 0, value.length);
    }

    public boolean hasComplexEventEndDate()
    {
        return complexEventEndDateLength > 0;
    }

    public MutableDirectBuffer complexEventEndDate()
    {
        return complexEventEndDate;
    }

    public String complexEventEndDateAsString()
    {
        return complexEventEndDate.getStringWithoutLengthAscii(complexEventEndDateOffset, complexEventEndDateLength);
    }

    private final ComplexEventTimesEncoder complexEventTimes = new ComplexEventTimesEncoder();
    public ComplexEventTimesEncoder complexEventTimes()
    {
        return complexEventTimes;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (complexEventStartDateLength > 0)
        {
            buffer.putBytes(position, complexEventStartDateHeader, 0, complexEventStartDateHeaderLength);
            position += complexEventStartDateHeaderLength;
            buffer.putBytes(position, complexEventStartDate, complexEventStartDateOffset, complexEventStartDateLength);
            position += complexEventStartDateLength;
            buffer.putSeparator(position);
            position++;
        }

        if (complexEventEndDateLength > 0)
        {
            buffer.putBytes(position, complexEventEndDateHeader, 0, complexEventEndDateHeaderLength);
            position += complexEventEndDateHeaderLength;
            buffer.putBytes(position, complexEventEndDate, complexEventEndDateOffset, complexEventEndDateLength);
            position += complexEventEndDateLength;
            buffer.putSeparator(position);
            position++;
        }

            position += complexEventTimes.encode(buffer, position);
        if (next != null)
        {
            position += next.encode(buffer, position, remainingElements - 1);
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetComplexEventStartDate();
        this.resetComplexEventEndDate();
        complexEventTimes.reset();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetComplexEventStartDate()
    {
        complexEventStartDateLength = 0;
    }

    public void resetComplexEventEndDate()
    {
        complexEventEndDateLength = 0;
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
        builder.append("\"MessageName\": \"ComplexEventDatesGroup\",\n");
        if (hasComplexEventStartDate())
        {
            indent(builder, level);
            builder.append("\"ComplexEventStartDate\": \"");
            appendBuffer(builder, complexEventStartDate, complexEventStartDateOffset, complexEventStartDateLength);
            builder.append("\",\n");
        }

        if (hasComplexEventEndDate())
        {
            indent(builder, level);
            builder.append("\"ComplexEventEndDate\": \"");
            appendBuffer(builder, complexEventEndDate, complexEventEndDateOffset, complexEventEndDateLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"ComplexEventTimes\": ");
    complexEventTimes.appendTo(builder, level + 1);
    builder.append("\n");
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public ComplexEventDatesGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((ComplexEventDatesGroupEncoder)encoder);
    }

    public ComplexEventDatesGroupEncoder copyTo(final ComplexEventDatesGroupEncoder encoder)
    {
        encoder.reset();
        if (hasComplexEventStartDate())
        {
            encoder.complexEventStartDateAsCopy(complexEventStartDate.byteArray(), 0, complexEventStartDateLength);
        }

        if (hasComplexEventEndDate())
        {
            encoder.complexEventEndDateAsCopy(complexEventEndDate.byteArray(), 0, complexEventEndDateLength);
        }


        complexEventTimes.copyTo(encoder.complexEventTimes());        return encoder;
    }

}
    private int noComplexEventDatesGroupCounter;

    private boolean hasNoComplexEventDatesGroupCounter;

    public boolean hasNoComplexEventDatesGroupCounter()
    {
        return hasNoComplexEventDatesGroupCounter;
    }

    public ComplexEventDatesEncoder noComplexEventDatesGroupCounter(int value)
    {
        noComplexEventDatesGroupCounter = value;
        hasNoComplexEventDatesGroupCounter = true;
        return this;
    }

    public int noComplexEventDatesGroupCounter()
    {
        return noComplexEventDatesGroupCounter;
    }


    private ComplexEventDatesGroupEncoder complexEventDatesGroup = null;

    public ComplexEventDatesGroupEncoder complexEventDatesGroup(final int numberOfElements)
    {
        hasNoComplexEventDatesGroupCounter = true;
        noComplexEventDatesGroupCounter = numberOfElements;
        if (complexEventDatesGroup == null)
        {
            complexEventDatesGroup = new ComplexEventDatesGroupEncoder();
        }
        return complexEventDatesGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoComplexEventDatesGroupCounter)
        {
            buffer.putBytes(position, noComplexEventDatesGroupCounterHeader, 0, noComplexEventDatesGroupCounterHeaderLength);
            position += noComplexEventDatesGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noComplexEventDatesGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (complexEventDatesGroup != null)
        {
            position += complexEventDatesGroup.encode(buffer, position, noComplexEventDatesGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetComplexEventDatesGroup();
    }

    public void resetComplexEventDatesGroup()
    {
        if (complexEventDatesGroup != null)
        {
            complexEventDatesGroup.reset();
        }
        noComplexEventDatesGroupCounter = 0;
        hasNoComplexEventDatesGroupCounter = false;
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
        builder.append("\"MessageName\": \"ComplexEventDates\",\n");
        if (hasNoComplexEventDatesGroupCounter)
        {
            indent(builder, level);
            builder.append("\"ComplexEventDatesGroup\": [\n");
            final int noComplexEventDatesGroupCounter = this.noComplexEventDatesGroupCounter;
            ComplexEventDatesGroupEncoder complexEventDatesGroup = this.complexEventDatesGroup;
            for (int i = 0; i < noComplexEventDatesGroupCounter; i++)
            {
                indent(builder, level);
                complexEventDatesGroup.appendTo(builder, level + 1);
                if (i < (noComplexEventDatesGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                complexEventDatesGroup = complexEventDatesGroup.next();
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
    public ComplexEventDatesEncoder copyTo(final Encoder encoder)
    {
        return copyTo((ComplexEventDatesEncoder)encoder);
    }

    public ComplexEventDatesEncoder copyTo(final ComplexEventDatesEncoder encoder)
    {
        encoder.reset();
        if (hasNoComplexEventDatesGroupCounter)
        {
            final int size = this.noComplexEventDatesGroupCounter;
            ComplexEventDatesGroupEncoder complexEventDatesGroup = this.complexEventDatesGroup;
            ComplexEventDatesGroupEncoder complexEventDatesGroupEncoder = encoder.complexEventDatesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (complexEventDatesGroup != null)
                {
                    complexEventDatesGroup.copyTo(complexEventDatesGroupEncoder);
                    complexEventDatesGroup = complexEventDatesGroup.next();
                    complexEventDatesGroupEncoder = complexEventDatesGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
