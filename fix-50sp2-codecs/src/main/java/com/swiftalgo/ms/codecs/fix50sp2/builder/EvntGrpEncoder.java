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


public class EvntGrpEncoder
{
    private static final int noEventsGroupCounterHeaderLength = 4;
    private static final byte[] noEventsGroupCounterHeader = new byte[] {56, 54, 52, (byte) '='};



public static class EventsGroupEncoder
{
    private EventsGroupEncoder next = null;

    public EventsGroupEncoder next()
    {
        if (next == null)
        {
            next = new EventsGroupEncoder();
        }
        return next;
    }

    private static final int eventTypeHeaderLength = 4;
    private static final byte[] eventTypeHeader = new byte[] {56, 54, 53, (byte) '='};

    private static final int eventDateHeaderLength = 4;
    private static final byte[] eventDateHeader = new byte[] {56, 54, 54, (byte) '='};

    private static final int eventTimeHeaderLength = 5;
    private static final byte[] eventTimeHeader = new byte[] {49, 49, 52, 53, (byte) '='};

    private static final int eventPxHeaderLength = 4;
    private static final byte[] eventPxHeader = new byte[] {56, 54, 55, (byte) '='};

    private static final int eventTextHeaderLength = 4;
    private static final byte[] eventTextHeader = new byte[] {56, 54, 56, (byte) '='};

    private int eventType;

    private boolean hasEventType;

    public boolean hasEventType()
    {
        return hasEventType;
    }

    public EventsGroupEncoder eventType(int value)
    {
        eventType = value;
        hasEventType = true;
        return this;
    }

    public int eventType()
    {
        return eventType;
    }

    public EventsGroupEncoder eventType(EventType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == EventType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: eventType Value: " + value );
            }
            if (value == EventType.NULL_VAL)
            {
                return this;
            }
        }
        return eventType(value.representation());
    }

    private final MutableDirectBuffer eventDate = new UnsafeBuffer();

    private int eventDateOffset = 0;

    private int eventDateLength = 0;

    public EventsGroupEncoder eventDate(final DirectBuffer value, final int offset, final int length)
    {
        eventDate.wrap(value);
        eventDateOffset = offset;
        eventDateLength = length;
        return this;
    }

    public EventsGroupEncoder eventDate(final DirectBuffer value, final int length)
    {
        return eventDate(value, 0, length);
    }

    public EventsGroupEncoder eventDate(final DirectBuffer value)
    {
        return eventDate(value, 0, value.capacity());
    }

    public EventsGroupEncoder eventDate(final byte[] value, final int offset, final int length)
    {
        eventDate.wrap(value);
        eventDateOffset = offset;
        eventDateLength = length;
        return this;
    }

    public EventsGroupEncoder eventDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(eventDate, value, offset, length);
        eventDateOffset = offset;
        eventDateLength = length;
        return this;
    }

    public EventsGroupEncoder eventDate(final byte[] value, final int length)
    {
        return eventDate(value, 0, length);
    }

    public EventsGroupEncoder eventDate(final byte[] value)
    {
        return eventDate(value, 0, value.length);
    }

    public boolean hasEventDate()
    {
        return eventDateLength > 0;
    }

    public MutableDirectBuffer eventDate()
    {
        return eventDate;
    }

    public String eventDateAsString()
    {
        return eventDate.getStringWithoutLengthAscii(eventDateOffset, eventDateLength);
    }

    private final MutableDirectBuffer eventTime = new UnsafeBuffer();

    private int eventTimeOffset = 0;

    private int eventTimeLength = 0;

    public EventsGroupEncoder eventTime(final DirectBuffer value, final int offset, final int length)
    {
        eventTime.wrap(value);
        eventTimeOffset = offset;
        eventTimeLength = length;
        return this;
    }

    public EventsGroupEncoder eventTime(final DirectBuffer value, final int length)
    {
        return eventTime(value, 0, length);
    }

    public EventsGroupEncoder eventTime(final DirectBuffer value)
    {
        return eventTime(value, 0, value.capacity());
    }

    public EventsGroupEncoder eventTime(final byte[] value, final int offset, final int length)
    {
        eventTime.wrap(value);
        eventTimeOffset = offset;
        eventTimeLength = length;
        return this;
    }

    public EventsGroupEncoder eventTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(eventTime, value, offset, length);
        eventTimeOffset = offset;
        eventTimeLength = length;
        return this;
    }

    public EventsGroupEncoder eventTime(final byte[] value, final int length)
    {
        return eventTime(value, 0, length);
    }

    public EventsGroupEncoder eventTime(final byte[] value)
    {
        return eventTime(value, 0, value.length);
    }

    public boolean hasEventTime()
    {
        return eventTimeLength > 0;
    }

    public MutableDirectBuffer eventTime()
    {
        return eventTime;
    }

    public String eventTimeAsString()
    {
        return eventTime.getStringWithoutLengthAscii(eventTimeOffset, eventTimeLength);
    }

    private final DecimalFloat eventPx = new DecimalFloat();

    private boolean hasEventPx;

    public boolean hasEventPx()
    {
        return hasEventPx;
    }

    public EventsGroupEncoder eventPx(DecimalFloat value)
    {
        eventPx.set(value);
        hasEventPx = true;
        return this;
    }

    public EventsGroupEncoder eventPx(long value, int scale)
    {
        eventPx.set(value, scale);
        hasEventPx = true;
        return this;
    }

    public DecimalFloat eventPx()
    {
        return eventPx;
    }

    private final MutableDirectBuffer eventText = new UnsafeBuffer();

    private int eventTextOffset = 0;

    private int eventTextLength = 0;

    public EventsGroupEncoder eventText(final DirectBuffer value, final int offset, final int length)
    {
        eventText.wrap(value);
        eventTextOffset = offset;
        eventTextLength = length;
        return this;
    }

    public EventsGroupEncoder eventText(final DirectBuffer value, final int length)
    {
        return eventText(value, 0, length);
    }

    public EventsGroupEncoder eventText(final DirectBuffer value)
    {
        return eventText(value, 0, value.capacity());
    }

    public EventsGroupEncoder eventText(final byte[] value, final int offset, final int length)
    {
        eventText.wrap(value);
        eventTextOffset = offset;
        eventTextLength = length;
        return this;
    }

    public EventsGroupEncoder eventTextAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(eventText, value, offset, length);
        eventTextOffset = offset;
        eventTextLength = length;
        return this;
    }

    public EventsGroupEncoder eventText(final byte[] value, final int length)
    {
        return eventText(value, 0, length);
    }

    public EventsGroupEncoder eventText(final byte[] value)
    {
        return eventText(value, 0, value.length);
    }

    public boolean hasEventText()
    {
        return eventTextLength > 0;
    }

    public MutableDirectBuffer eventText()
    {
        return eventText;
    }

    public String eventTextAsString()
    {
        return eventText.getStringWithoutLengthAscii(eventTextOffset, eventTextLength);
    }

    public EventsGroupEncoder eventText(final CharSequence value)
    {
        toBytes(value, eventText);
        eventTextOffset = 0;
        eventTextLength = value.length();
        return this;
    }

    public EventsGroupEncoder eventText(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            eventText.wrap(buffer);
            eventTextOffset = value.offset();
            eventTextLength = value.length();
        }
        return this;
    }

    public EventsGroupEncoder eventText(final char[] value)
    {
        return eventText(value, 0, value.length);
    }

    public EventsGroupEncoder eventText(final char[] value, final int length)
    {
        return eventText(value, 0, length);
    }

    public EventsGroupEncoder eventText(final char[] value, final int offset, final int length)
    {
        toBytes(value, eventText, offset, length);
        eventTextOffset = 0;
        eventTextLength = length;
        return this;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (hasEventType)
        {
            buffer.putBytes(position, eventTypeHeader, 0, eventTypeHeaderLength);
            position += eventTypeHeaderLength;
            position += buffer.putIntAscii(position, eventType);
            buffer.putSeparator(position);
            position++;
        }

        if (eventDateLength > 0)
        {
            buffer.putBytes(position, eventDateHeader, 0, eventDateHeaderLength);
            position += eventDateHeaderLength;
            buffer.putBytes(position, eventDate, eventDateOffset, eventDateLength);
            position += eventDateLength;
            buffer.putSeparator(position);
            position++;
        }

        if (eventTimeLength > 0)
        {
            buffer.putBytes(position, eventTimeHeader, 0, eventTimeHeaderLength);
            position += eventTimeHeaderLength;
            buffer.putBytes(position, eventTime, eventTimeOffset, eventTimeLength);
            position += eventTimeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasEventPx)
        {
            buffer.putBytes(position, eventPxHeader, 0, eventPxHeaderLength);
            position += eventPxHeaderLength;
            position += buffer.putFloatAscii(position, eventPx);
            buffer.putSeparator(position);
            position++;
        }

        if (eventTextLength > 0)
        {
            buffer.putBytes(position, eventTextHeader, 0, eventTextHeaderLength);
            position += eventTextHeaderLength;
            buffer.putBytes(position, eventText, eventTextOffset, eventTextLength);
            position += eventTextLength;
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
        this.resetEventType();
        this.resetEventDate();
        this.resetEventTime();
        this.resetEventPx();
        this.resetEventText();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetEventType()
    {
        hasEventType = false;
    }

    public void resetEventDate()
    {
        eventDateLength = 0;
    }

    public void resetEventTime()
    {
        eventTimeLength = 0;
    }

    public void resetEventPx()
    {
        hasEventPx = false;
    }

    public void resetEventText()
    {
        eventTextLength = 0;
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
        builder.append("\"MessageName\": \"EventsGroup\",\n");
        if (hasEventType())
        {
            indent(builder, level);
            builder.append("\"EventType\": \"");
            builder.append(eventType);
            builder.append("\",\n");
        }

        if (hasEventDate())
        {
            indent(builder, level);
            builder.append("\"EventDate\": \"");
            appendBuffer(builder, eventDate, eventDateOffset, eventDateLength);
            builder.append("\",\n");
        }

        if (hasEventTime())
        {
            indent(builder, level);
            builder.append("\"EventTime\": \"");
            appendBuffer(builder, eventTime, eventTimeOffset, eventTimeLength);
            builder.append("\",\n");
        }

        if (hasEventPx())
        {
            indent(builder, level);
            builder.append("\"EventPx\": \"");
            eventPx.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasEventText())
        {
            indent(builder, level);
            builder.append("\"EventText\": \"");
            appendBuffer(builder, eventText, eventTextOffset, eventTextLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public EventsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((EventsGroupEncoder)encoder);
    }

    public EventsGroupEncoder copyTo(final EventsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasEventType())
        {
            encoder.eventType(this.eventType());
        }

        if (hasEventDate())
        {
            encoder.eventDateAsCopy(eventDate.byteArray(), 0, eventDateLength);
        }

        if (hasEventTime())
        {
            encoder.eventTimeAsCopy(eventTime.byteArray(), 0, eventTimeLength);
        }

        if (hasEventPx())
        {
            encoder.eventPx(this.eventPx());
        }

        if (hasEventText())
        {
            encoder.eventTextAsCopy(eventText.byteArray(), 0, eventTextLength);
        }
        return encoder;
    }

}
    private int noEventsGroupCounter;

    private boolean hasNoEventsGroupCounter;

    public boolean hasNoEventsGroupCounter()
    {
        return hasNoEventsGroupCounter;
    }

    public EvntGrpEncoder noEventsGroupCounter(int value)
    {
        noEventsGroupCounter = value;
        hasNoEventsGroupCounter = true;
        return this;
    }

    public int noEventsGroupCounter()
    {
        return noEventsGroupCounter;
    }


    private EventsGroupEncoder eventsGroup = null;

    public EventsGroupEncoder eventsGroup(final int numberOfElements)
    {
        hasNoEventsGroupCounter = true;
        noEventsGroupCounter = numberOfElements;
        if (eventsGroup == null)
        {
            eventsGroup = new EventsGroupEncoder();
        }
        return eventsGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoEventsGroupCounter)
        {
            buffer.putBytes(position, noEventsGroupCounterHeader, 0, noEventsGroupCounterHeaderLength);
            position += noEventsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noEventsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (eventsGroup != null)
        {
            position += eventsGroup.encode(buffer, position, noEventsGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetEventsGroup();
    }

    public void resetEventsGroup()
    {
        if (eventsGroup != null)
        {
            eventsGroup.reset();
        }
        noEventsGroupCounter = 0;
        hasNoEventsGroupCounter = false;
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
        builder.append("\"MessageName\": \"EvntGrp\",\n");
        if (hasNoEventsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"EventsGroup\": [\n");
            final int noEventsGroupCounter = this.noEventsGroupCounter;
            EventsGroupEncoder eventsGroup = this.eventsGroup;
            for (int i = 0; i < noEventsGroupCounter; i++)
            {
                indent(builder, level);
                eventsGroup.appendTo(builder, level + 1);
                if (i < (noEventsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                eventsGroup = eventsGroup.next();
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
    public EvntGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((EvntGrpEncoder)encoder);
    }

    public EvntGrpEncoder copyTo(final EvntGrpEncoder encoder)
    {
        encoder.reset();
        if (hasNoEventsGroupCounter)
        {
            final int size = this.noEventsGroupCounter;
            EventsGroupEncoder eventsGroup = this.eventsGroup;
            EventsGroupEncoder eventsGroupEncoder = encoder.eventsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (eventsGroup != null)
                {
                    eventsGroup.copyTo(eventsGroupEncoder);
                    eventsGroup = eventsGroup.next();
                    eventsGroupEncoder = eventsGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
