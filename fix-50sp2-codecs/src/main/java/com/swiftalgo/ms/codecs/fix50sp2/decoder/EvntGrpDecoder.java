/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2.decoder;

import org.agrona.AsciiNumberFormatException;
import org.agrona.MutableDirectBuffer;
import org.agrona.AsciiSequenceView;
import static uk.co.real_logic.artio.dictionary.generation.CodecUtil.*;
import static uk.co.real_logic.artio.dictionary.SessionConstants.*;
import uk.co.real_logic.artio.builder.Decoder;
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
import uk.co.real_logic.artio.builder.Encoder;
import uk.co.real_logic.artio.builder.CommonDecoderImpl;
import static java.nio.charset.StandardCharsets.US_ASCII;
import static uk.co.real_logic.artio.builder.Validation.CODEC_VALIDATION_ENABLED;
import static uk.co.real_logic.artio.builder.RejectUnknownField.CODEC_REJECT_UNKNOWN_FIELD_ENABLED;
import static uk.co.real_logic.artio.builder.RejectUnknownEnumValue.CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED;
import com.swiftalgo.ms.codecs.fix50sp2.*;
import com.swiftalgo.ms.codecs.fix50sp2.builder.EvntGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.EvntGrpEncoder.EventsGroupEncoder;

public interface EvntGrpDecoder 
{



public class EventsGroupDecoder extends CommonDecoderImpl
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(0);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
        }
    }

    public final IntHashSet ALL_GROUP_FIELDS = new IntHashSet(10);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            ALL_GROUP_FIELDS.add(Constants.EVENT_TYPE);
            ALL_GROUP_FIELDS.add(Constants.EVENT_DATE);
            ALL_GROUP_FIELDS.add(Constants.EVENT_TIME);
            ALL_GROUP_FIELDS.add(Constants.EVENT_PX);
            ALL_GROUP_FIELDS.add(Constants.EVENT_TEXT);
        }
    }

    private final IntHashSet missingRequiredFields = new IntHashSet(0);

    public boolean validate()
    {
        if (rejectReason != Decoder.NO_ERROR)
        {
            return false;
        }
        final IntIterator missingFieldsIterator = missingRequiredFields.iterator();
        if (missingFieldsIterator.hasNext())
        {
            invalidTagId = missingFieldsIterator.nextValue();
            rejectReason = 1;
            return false;
        }
        if (hasEventType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !EventType.isValid(eventType()))
        {
            invalidTagId = 865;
            rejectReason = 5;
            return false;
        }
        }
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public EventsGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private EventsGroupDecoder next = null;

    public EventsGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(10);

    private int eventType = MISSING_INT;

    private boolean hasEventType;

    public int eventType()
    {
        if (!hasEventType)
        {
            throw new IllegalArgumentException("No value for optional field: EventType");
        }

        return eventType;
    }

    public boolean hasEventType()
    {
        return hasEventType;
    }



    private final CharArrayWrapper eventTypeWrapper = new CharArrayWrapper();
    public EventType eventTypeAsEnum()
    {
        if (!hasEventType)
 return EventType.NULL_VAL;
        return EventType.decode(eventType);
    }

    private byte[] eventDate = new byte[8];

    private boolean hasEventDate;

    public byte[] eventDate()
    {
        if (!hasEventDate)
        {
            throw new IllegalArgumentException("No value for optional field: EventDate");
        }

        return eventDate;
    }

    public boolean hasEventDate()
    {
        return hasEventDate;
    }


    private int eventDateOffset;

    private int eventDateLength;

    public int eventDateLength()
    {
        if (!hasEventDate)
        {
            throw new IllegalArgumentException("No value for optional field: EventDate");
        }

        return eventDateLength;
    }

    public String eventDateAsString()
    {
        return hasEventDate ? new String(eventDate, 0, eventDateLength) : null;
    }

    public void eventDate(final AsciiSequenceView view)
    {
        if (!hasEventDate)
        {
            throw new IllegalArgumentException("No value for optional field: EventDate");
        }

        view.wrap(buffer, eventDateOffset, eventDateLength);
    }


    private byte[] eventTime = new byte[24];

    private boolean hasEventTime;

    public byte[] eventTime()
    {
        if (!hasEventTime)
        {
            throw new IllegalArgumentException("No value for optional field: EventTime");
        }

        return eventTime;
    }

    public boolean hasEventTime()
    {
        return hasEventTime;
    }


    private int eventTimeOffset;

    private int eventTimeLength;

    public int eventTimeLength()
    {
        if (!hasEventTime)
        {
            throw new IllegalArgumentException("No value for optional field: EventTime");
        }

        return eventTimeLength;
    }

    public String eventTimeAsString()
    {
        return hasEventTime ? new String(eventTime, 0, eventTimeLength) : null;
    }

    public void eventTime(final AsciiSequenceView view)
    {
        if (!hasEventTime)
        {
            throw new IllegalArgumentException("No value for optional field: EventTime");
        }

        view.wrap(buffer, eventTimeOffset, eventTimeLength);
    }


    private DecimalFloat eventPx = DecimalFloat.newNaNValue();

    private boolean hasEventPx;

    public DecimalFloat eventPx()
    {
        if (!hasEventPx)
        {
            throw new IllegalArgumentException("No value for optional field: EventPx");
        }

        return eventPx;
    }

    public boolean hasEventPx()
    {
        return hasEventPx;
    }



    private char[] eventText = new char[1];

    private boolean hasEventText;

    public char[] eventText()
    {
        if (!hasEventText)
        {
            throw new IllegalArgumentException("No value for optional field: EventText");
        }

        return eventText;
    }

    public boolean hasEventText()
    {
        return hasEventText;
    }


    private int eventTextOffset;

    private int eventTextLength;

    public int eventTextLength()
    {
        if (!hasEventText)
        {
            throw new IllegalArgumentException("No value for optional field: EventText");
        }

        return eventTextLength;
    }

    public String eventTextAsString()
    {
        return hasEventText ? new String(eventText, 0, eventTextLength) : null;
    }

    public void eventText(final AsciiSequenceView view)
    {
        if (!hasEventText)
        {
            throw new IllegalArgumentException("No value for optional field: EventText");
        }

        view.wrap(buffer, eventTextOffset, eventTextLength);
    }


    private final CharArrayWrapper eventTextWrapper = new CharArrayWrapper();
    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode EventsGroup
        int seenFieldCount = 0;
        if (CODEC_VALIDATION_ENABLED)
        {
            missingRequiredFields.copy(REQUIRED_FIELDS);
        }
        this.buffer = buffer;
        final int end = offset + length;
        int position = offset;
        seenFields.clear();
        int tag;

        while (position < end)
        {
            final int equalsPosition = buffer.scan(position, end, '=');
            if (equalsPosition == AsciiBuffer.UNKNOWN_INDEX)
            {
               return position;
            }
            tag = buffer.getInt(position, equalsPosition);
            if (!seenFields.add(tag))
            {
                if (next == null)
                {
                    next = new EventsGroupDecoder(trailer, messageFields);
                }
                return position - offset;
            }
            final int valueOffset = equalsPosition + 1;
            int endOfField = buffer.scan(valueOffset, end, START_OF_HEADER);
            if (endOfField == AsciiBuffer.UNKNOWN_INDEX || equalsPosition == AsciiBuffer.UNKNOWN_INDEX)
            {
                rejectReason = 5;
                break;
            }
            final int valueLength = endOfField - valueOffset;
            if (CODEC_VALIDATION_ENABLED)
            {
                if (tag <= 0)
                {
                    invalidTagId = tag;
                    rejectReason = 0;
                }
                else if (valueLength == 0)
                {
                    invalidTagId = tag;
                    rejectReason = 4;
                }
                missingRequiredFields.remove(tag);
                seenFieldCount++;
            }

            switch (tag)
            {
            case Constants.EVENT_TYPE:
                hasEventType = true;
                eventType = getInt(buffer, valueOffset, endOfField, 865, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.EVENT_DATE:
                hasEventDate = true;
                eventDate = buffer.getBytes(eventDate, valueOffset, valueLength);
                eventDateOffset = valueOffset;
                eventDateLength = valueLength;
                break;

            case Constants.EVENT_TIME:
                hasEventTime = true;
                eventTime = buffer.getBytes(eventTime, valueOffset, valueLength);
                eventTimeOffset = valueOffset;
                eventTimeLength = valueLength;
                break;

            case Constants.EVENT_PX:
                hasEventPx = true;
                eventPx = getFloat(buffer, eventPx, valueOffset, valueLength, 867, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.EVENT_TEXT:
                hasEventText = true;
                eventText = buffer.getChars(eventText, valueOffset, valueLength);
                eventTextOffset = valueOffset;
                eventTextLength = valueLength;
                break;

            default:
                if (!CODEC_REJECT_UNKNOWN_FIELD_ENABLED)
                {
                    seenFields.remove(tag);
                }
                if (CODEC_REJECT_UNKNOWN_FIELD_ENABLED || (trailer.REQUIRED_FIELDS.contains(tag) || messageFields.contains(tag)))
                {
                    return position - offset;
                }

            }

            if (position < (endOfField + 1))
            {
                position = endOfField + 1;
            }
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
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetEventType()
    {
        hasEventType = false;
    }

    public void resetEventDate()
    {
        hasEventDate = false;
    }

    public void resetEventTime()
    {
        hasEventTime = false;
    }

    public void resetEventPx()
    {
        hasEventPx = false;
    }

    public void resetEventText()
    {
        hasEventText = false;
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
            appendData(builder, eventDate, eventDateLength);
            builder.append("\",\n");
        }

        if (hasEventTime())
        {
            indent(builder, level);
            builder.append("\"EventTime\": \"");
            appendData(builder, eventTime, eventTimeLength);
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
            builder.append(this.eventText(), 0, eventTextLength());
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public EvntGrpEncoder.EventsGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((EvntGrpEncoder.EventsGroupEncoder)encoder);
    }

    public EvntGrpEncoder.EventsGroupEncoder toEncoder(final EvntGrpEncoder.EventsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasEventType())
        {
            encoder.eventType(this.eventType());
        }

        if (hasEventDate())
        {
            encoder.eventDateAsCopy(this.eventDate(), 0, eventDateLength());
        }

        if (hasEventTime())
        {
            encoder.eventTimeAsCopy(this.eventTime(), 0, eventTimeLength());
        }

        if (hasEventPx())
        {
            encoder.eventPx(this.eventPx());
        }

        if (hasEventText())
        {
            encoder.eventText(this.eventText(), 0, eventTextLength());
        }
        return encoder;
    }

}
    public class EventsGroupIterator implements Iterable<EventsGroupDecoder>, java.util.Iterator<EventsGroupDecoder>
    {
        private final EvntGrpDecoder parent;
        private int remainder;
        private EventsGroupDecoder current;

        public EventsGroupIterator(final EvntGrpDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }

        public EventsGroupDecoder next()
        {
            remainder--;
            final EventsGroupDecoder value = current;
            current = current.next();
            return value;
        }

        public int numberFieldValue()
        {
            return parent.hasNoEventsGroupCounter() ? parent.noEventsGroupCounter() : 0;
        }

        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.eventsGroup();
        }

        public EventsGroupIterator iterator()
        {
            reset();
            return this;
        }

    }

    public EventsGroupIterator eventsGroupIterator();
    public int noEventsGroupCounter();
    public boolean hasNoEventsGroupCounter();
    public EventsGroupDecoder eventsGroup();

}
