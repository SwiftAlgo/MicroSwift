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


public class DerivativeEventsGrpEncoder
{
    private static final int noDerivativeEventsGroupCounterHeaderLength = 5;
    private static final byte[] noDerivativeEventsGroupCounterHeader = new byte[] {49, 50, 56, 54, (byte) '='};



public static class DerivativeEventsGroupEncoder
{
    private DerivativeEventsGroupEncoder next = null;

    public DerivativeEventsGroupEncoder next()
    {
        if (next == null)
        {
            next = new DerivativeEventsGroupEncoder();
        }
        return next;
    }

    private static final int derivativeEventTypeHeaderLength = 5;
    private static final byte[] derivativeEventTypeHeader = new byte[] {49, 50, 56, 55, (byte) '='};

    private static final int derivativeEventDateHeaderLength = 5;
    private static final byte[] derivativeEventDateHeader = new byte[] {49, 50, 56, 56, (byte) '='};

    private static final int derivativeEventTimeHeaderLength = 5;
    private static final byte[] derivativeEventTimeHeader = new byte[] {49, 50, 56, 57, (byte) '='};

    private static final int derivativeEventPxHeaderLength = 5;
    private static final byte[] derivativeEventPxHeader = new byte[] {49, 50, 57, 48, (byte) '='};

    private static final int derivativeEventTextHeaderLength = 5;
    private static final byte[] derivativeEventTextHeader = new byte[] {49, 50, 57, 49, (byte) '='};

    private int derivativeEventType;

    private boolean hasDerivativeEventType;

    public boolean hasDerivativeEventType()
    {
        return hasDerivativeEventType;
    }

    public DerivativeEventsGroupEncoder derivativeEventType(int value)
    {
        derivativeEventType = value;
        hasDerivativeEventType = true;
        return this;
    }

    public int derivativeEventType()
    {
        return derivativeEventType;
    }

    private final MutableDirectBuffer derivativeEventDate = new UnsafeBuffer();

    private int derivativeEventDateOffset = 0;

    private int derivativeEventDateLength = 0;

    public DerivativeEventsGroupEncoder derivativeEventDate(final DirectBuffer value, final int offset, final int length)
    {
        derivativeEventDate.wrap(value);
        derivativeEventDateOffset = offset;
        derivativeEventDateLength = length;
        return this;
    }

    public DerivativeEventsGroupEncoder derivativeEventDate(final DirectBuffer value, final int length)
    {
        return derivativeEventDate(value, 0, length);
    }

    public DerivativeEventsGroupEncoder derivativeEventDate(final DirectBuffer value)
    {
        return derivativeEventDate(value, 0, value.capacity());
    }

    public DerivativeEventsGroupEncoder derivativeEventDate(final byte[] value, final int offset, final int length)
    {
        derivativeEventDate.wrap(value);
        derivativeEventDateOffset = offset;
        derivativeEventDateLength = length;
        return this;
    }

    public DerivativeEventsGroupEncoder derivativeEventDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(derivativeEventDate, value, offset, length);
        derivativeEventDateOffset = offset;
        derivativeEventDateLength = length;
        return this;
    }

    public DerivativeEventsGroupEncoder derivativeEventDate(final byte[] value, final int length)
    {
        return derivativeEventDate(value, 0, length);
    }

    public DerivativeEventsGroupEncoder derivativeEventDate(final byte[] value)
    {
        return derivativeEventDate(value, 0, value.length);
    }

    public boolean hasDerivativeEventDate()
    {
        return derivativeEventDateLength > 0;
    }

    public MutableDirectBuffer derivativeEventDate()
    {
        return derivativeEventDate;
    }

    public String derivativeEventDateAsString()
    {
        return derivativeEventDate.getStringWithoutLengthAscii(derivativeEventDateOffset, derivativeEventDateLength);
    }

    private final MutableDirectBuffer derivativeEventTime = new UnsafeBuffer();

    private int derivativeEventTimeOffset = 0;

    private int derivativeEventTimeLength = 0;

    public DerivativeEventsGroupEncoder derivativeEventTime(final DirectBuffer value, final int offset, final int length)
    {
        derivativeEventTime.wrap(value);
        derivativeEventTimeOffset = offset;
        derivativeEventTimeLength = length;
        return this;
    }

    public DerivativeEventsGroupEncoder derivativeEventTime(final DirectBuffer value, final int length)
    {
        return derivativeEventTime(value, 0, length);
    }

    public DerivativeEventsGroupEncoder derivativeEventTime(final DirectBuffer value)
    {
        return derivativeEventTime(value, 0, value.capacity());
    }

    public DerivativeEventsGroupEncoder derivativeEventTime(final byte[] value, final int offset, final int length)
    {
        derivativeEventTime.wrap(value);
        derivativeEventTimeOffset = offset;
        derivativeEventTimeLength = length;
        return this;
    }

    public DerivativeEventsGroupEncoder derivativeEventTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(derivativeEventTime, value, offset, length);
        derivativeEventTimeOffset = offset;
        derivativeEventTimeLength = length;
        return this;
    }

    public DerivativeEventsGroupEncoder derivativeEventTime(final byte[] value, final int length)
    {
        return derivativeEventTime(value, 0, length);
    }

    public DerivativeEventsGroupEncoder derivativeEventTime(final byte[] value)
    {
        return derivativeEventTime(value, 0, value.length);
    }

    public boolean hasDerivativeEventTime()
    {
        return derivativeEventTimeLength > 0;
    }

    public MutableDirectBuffer derivativeEventTime()
    {
        return derivativeEventTime;
    }

    public String derivativeEventTimeAsString()
    {
        return derivativeEventTime.getStringWithoutLengthAscii(derivativeEventTimeOffset, derivativeEventTimeLength);
    }

    private final DecimalFloat derivativeEventPx = new DecimalFloat();

    private boolean hasDerivativeEventPx;

    public boolean hasDerivativeEventPx()
    {
        return hasDerivativeEventPx;
    }

    public DerivativeEventsGroupEncoder derivativeEventPx(DecimalFloat value)
    {
        derivativeEventPx.set(value);
        hasDerivativeEventPx = true;
        return this;
    }

    public DerivativeEventsGroupEncoder derivativeEventPx(long value, int scale)
    {
        derivativeEventPx.set(value, scale);
        hasDerivativeEventPx = true;
        return this;
    }

    public DecimalFloat derivativeEventPx()
    {
        return derivativeEventPx;
    }

    private final MutableDirectBuffer derivativeEventText = new UnsafeBuffer();

    private int derivativeEventTextOffset = 0;

    private int derivativeEventTextLength = 0;

    public DerivativeEventsGroupEncoder derivativeEventText(final DirectBuffer value, final int offset, final int length)
    {
        derivativeEventText.wrap(value);
        derivativeEventTextOffset = offset;
        derivativeEventTextLength = length;
        return this;
    }

    public DerivativeEventsGroupEncoder derivativeEventText(final DirectBuffer value, final int length)
    {
        return derivativeEventText(value, 0, length);
    }

    public DerivativeEventsGroupEncoder derivativeEventText(final DirectBuffer value)
    {
        return derivativeEventText(value, 0, value.capacity());
    }

    public DerivativeEventsGroupEncoder derivativeEventText(final byte[] value, final int offset, final int length)
    {
        derivativeEventText.wrap(value);
        derivativeEventTextOffset = offset;
        derivativeEventTextLength = length;
        return this;
    }

    public DerivativeEventsGroupEncoder derivativeEventTextAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(derivativeEventText, value, offset, length);
        derivativeEventTextOffset = offset;
        derivativeEventTextLength = length;
        return this;
    }

    public DerivativeEventsGroupEncoder derivativeEventText(final byte[] value, final int length)
    {
        return derivativeEventText(value, 0, length);
    }

    public DerivativeEventsGroupEncoder derivativeEventText(final byte[] value)
    {
        return derivativeEventText(value, 0, value.length);
    }

    public boolean hasDerivativeEventText()
    {
        return derivativeEventTextLength > 0;
    }

    public MutableDirectBuffer derivativeEventText()
    {
        return derivativeEventText;
    }

    public String derivativeEventTextAsString()
    {
        return derivativeEventText.getStringWithoutLengthAscii(derivativeEventTextOffset, derivativeEventTextLength);
    }

    public DerivativeEventsGroupEncoder derivativeEventText(final CharSequence value)
    {
        toBytes(value, derivativeEventText);
        derivativeEventTextOffset = 0;
        derivativeEventTextLength = value.length();
        return this;
    }

    public DerivativeEventsGroupEncoder derivativeEventText(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            derivativeEventText.wrap(buffer);
            derivativeEventTextOffset = value.offset();
            derivativeEventTextLength = value.length();
        }
        return this;
    }

    public DerivativeEventsGroupEncoder derivativeEventText(final char[] value)
    {
        return derivativeEventText(value, 0, value.length);
    }

    public DerivativeEventsGroupEncoder derivativeEventText(final char[] value, final int length)
    {
        return derivativeEventText(value, 0, length);
    }

    public DerivativeEventsGroupEncoder derivativeEventText(final char[] value, final int offset, final int length)
    {
        toBytes(value, derivativeEventText, offset, length);
        derivativeEventTextOffset = 0;
        derivativeEventTextLength = length;
        return this;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (hasDerivativeEventType)
        {
            buffer.putBytes(position, derivativeEventTypeHeader, 0, derivativeEventTypeHeaderLength);
            position += derivativeEventTypeHeaderLength;
            position += buffer.putIntAscii(position, derivativeEventType);
            buffer.putSeparator(position);
            position++;
        }

        if (derivativeEventDateLength > 0)
        {
            buffer.putBytes(position, derivativeEventDateHeader, 0, derivativeEventDateHeaderLength);
            position += derivativeEventDateHeaderLength;
            buffer.putBytes(position, derivativeEventDate, derivativeEventDateOffset, derivativeEventDateLength);
            position += derivativeEventDateLength;
            buffer.putSeparator(position);
            position++;
        }

        if (derivativeEventTimeLength > 0)
        {
            buffer.putBytes(position, derivativeEventTimeHeader, 0, derivativeEventTimeHeaderLength);
            position += derivativeEventTimeHeaderLength;
            buffer.putBytes(position, derivativeEventTime, derivativeEventTimeOffset, derivativeEventTimeLength);
            position += derivativeEventTimeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasDerivativeEventPx)
        {
            buffer.putBytes(position, derivativeEventPxHeader, 0, derivativeEventPxHeaderLength);
            position += derivativeEventPxHeaderLength;
            position += buffer.putFloatAscii(position, derivativeEventPx);
            buffer.putSeparator(position);
            position++;
        }

        if (derivativeEventTextLength > 0)
        {
            buffer.putBytes(position, derivativeEventTextHeader, 0, derivativeEventTextHeaderLength);
            position += derivativeEventTextHeaderLength;
            buffer.putBytes(position, derivativeEventText, derivativeEventTextOffset, derivativeEventTextLength);
            position += derivativeEventTextLength;
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
        this.resetDerivativeEventType();
        this.resetDerivativeEventDate();
        this.resetDerivativeEventTime();
        this.resetDerivativeEventPx();
        this.resetDerivativeEventText();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetDerivativeEventType()
    {
        hasDerivativeEventType = false;
    }

    public void resetDerivativeEventDate()
    {
        derivativeEventDateLength = 0;
    }

    public void resetDerivativeEventTime()
    {
        derivativeEventTimeLength = 0;
    }

    public void resetDerivativeEventPx()
    {
        hasDerivativeEventPx = false;
    }

    public void resetDerivativeEventText()
    {
        derivativeEventTextLength = 0;
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
        builder.append("\"MessageName\": \"DerivativeEventsGroup\",\n");
        if (hasDerivativeEventType())
        {
            indent(builder, level);
            builder.append("\"DerivativeEventType\": \"");
            builder.append(derivativeEventType);
            builder.append("\",\n");
        }

        if (hasDerivativeEventDate())
        {
            indent(builder, level);
            builder.append("\"DerivativeEventDate\": \"");
            appendBuffer(builder, derivativeEventDate, derivativeEventDateOffset, derivativeEventDateLength);
            builder.append("\",\n");
        }

        if (hasDerivativeEventTime())
        {
            indent(builder, level);
            builder.append("\"DerivativeEventTime\": \"");
            appendBuffer(builder, derivativeEventTime, derivativeEventTimeOffset, derivativeEventTimeLength);
            builder.append("\",\n");
        }

        if (hasDerivativeEventPx())
        {
            indent(builder, level);
            builder.append("\"DerivativeEventPx\": \"");
            derivativeEventPx.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasDerivativeEventText())
        {
            indent(builder, level);
            builder.append("\"DerivativeEventText\": \"");
            appendBuffer(builder, derivativeEventText, derivativeEventTextOffset, derivativeEventTextLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public DerivativeEventsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((DerivativeEventsGroupEncoder)encoder);
    }

    public DerivativeEventsGroupEncoder copyTo(final DerivativeEventsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasDerivativeEventType())
        {
            encoder.derivativeEventType(this.derivativeEventType());
        }

        if (hasDerivativeEventDate())
        {
            encoder.derivativeEventDateAsCopy(derivativeEventDate.byteArray(), 0, derivativeEventDateLength);
        }

        if (hasDerivativeEventTime())
        {
            encoder.derivativeEventTimeAsCopy(derivativeEventTime.byteArray(), 0, derivativeEventTimeLength);
        }

        if (hasDerivativeEventPx())
        {
            encoder.derivativeEventPx(this.derivativeEventPx());
        }

        if (hasDerivativeEventText())
        {
            encoder.derivativeEventTextAsCopy(derivativeEventText.byteArray(), 0, derivativeEventTextLength);
        }
        return encoder;
    }

}
    private int noDerivativeEventsGroupCounter;

    private boolean hasNoDerivativeEventsGroupCounter;

    public boolean hasNoDerivativeEventsGroupCounter()
    {
        return hasNoDerivativeEventsGroupCounter;
    }

    public DerivativeEventsGrpEncoder noDerivativeEventsGroupCounter(int value)
    {
        noDerivativeEventsGroupCounter = value;
        hasNoDerivativeEventsGroupCounter = true;
        return this;
    }

    public int noDerivativeEventsGroupCounter()
    {
        return noDerivativeEventsGroupCounter;
    }


    private DerivativeEventsGroupEncoder derivativeEventsGroup = null;

    public DerivativeEventsGroupEncoder derivativeEventsGroup(final int numberOfElements)
    {
        hasNoDerivativeEventsGroupCounter = true;
        noDerivativeEventsGroupCounter = numberOfElements;
        if (derivativeEventsGroup == null)
        {
            derivativeEventsGroup = new DerivativeEventsGroupEncoder();
        }
        return derivativeEventsGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoDerivativeEventsGroupCounter)
        {
            buffer.putBytes(position, noDerivativeEventsGroupCounterHeader, 0, noDerivativeEventsGroupCounterHeaderLength);
            position += noDerivativeEventsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noDerivativeEventsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (derivativeEventsGroup != null)
        {
            position += derivativeEventsGroup.encode(buffer, position, noDerivativeEventsGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetDerivativeEventsGroup();
    }

    public void resetDerivativeEventsGroup()
    {
        if (derivativeEventsGroup != null)
        {
            derivativeEventsGroup.reset();
        }
        noDerivativeEventsGroupCounter = 0;
        hasNoDerivativeEventsGroupCounter = false;
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
        builder.append("\"MessageName\": \"DerivativeEventsGrp\",\n");
        if (hasNoDerivativeEventsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"DerivativeEventsGroup\": [\n");
            final int noDerivativeEventsGroupCounter = this.noDerivativeEventsGroupCounter;
            DerivativeEventsGroupEncoder derivativeEventsGroup = this.derivativeEventsGroup;
            for (int i = 0; i < noDerivativeEventsGroupCounter; i++)
            {
                indent(builder, level);
                derivativeEventsGroup.appendTo(builder, level + 1);
                if (i < (noDerivativeEventsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                derivativeEventsGroup = derivativeEventsGroup.next();
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
    public DerivativeEventsGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((DerivativeEventsGrpEncoder)encoder);
    }

    public DerivativeEventsGrpEncoder copyTo(final DerivativeEventsGrpEncoder encoder)
    {
        encoder.reset();
        if (hasNoDerivativeEventsGroupCounter)
        {
            final int size = this.noDerivativeEventsGroupCounter;
            DerivativeEventsGroupEncoder derivativeEventsGroup = this.derivativeEventsGroup;
            DerivativeEventsGroupEncoder derivativeEventsGroupEncoder = encoder.derivativeEventsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (derivativeEventsGroup != null)
                {
                    derivativeEventsGroup.copyTo(derivativeEventsGroupEncoder);
                    derivativeEventsGroup = derivativeEventsGroup.next();
                    derivativeEventsGroupEncoder = derivativeEventsGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
