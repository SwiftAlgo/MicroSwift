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
import com.swiftalgo.ms.codecs.fix50sp2.builder.DerivativeEventsGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.DerivativeEventsGrpEncoder.DerivativeEventsGroupEncoder;

public interface DerivativeEventsGrpDecoder 
{



public class DerivativeEventsGroupDecoder extends CommonDecoderImpl
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
            ALL_GROUP_FIELDS.add(Constants.DERIVATIVE_EVENT_TYPE);
            ALL_GROUP_FIELDS.add(Constants.DERIVATIVE_EVENT_DATE);
            ALL_GROUP_FIELDS.add(Constants.DERIVATIVE_EVENT_TIME);
            ALL_GROUP_FIELDS.add(Constants.DERIVATIVE_EVENT_PX);
            ALL_GROUP_FIELDS.add(Constants.DERIVATIVE_EVENT_TEXT);
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
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public DerivativeEventsGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private DerivativeEventsGroupDecoder next = null;

    public DerivativeEventsGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(10);

    private int derivativeEventType = MISSING_INT;

    private boolean hasDerivativeEventType;

    public int derivativeEventType()
    {
        if (!hasDerivativeEventType)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeEventType");
        }

        return derivativeEventType;
    }

    public boolean hasDerivativeEventType()
    {
        return hasDerivativeEventType;
    }



    private byte[] derivativeEventDate = new byte[8];

    private boolean hasDerivativeEventDate;

    public byte[] derivativeEventDate()
    {
        if (!hasDerivativeEventDate)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeEventDate");
        }

        return derivativeEventDate;
    }

    public boolean hasDerivativeEventDate()
    {
        return hasDerivativeEventDate;
    }


    private int derivativeEventDateOffset;

    private int derivativeEventDateLength;

    public int derivativeEventDateLength()
    {
        if (!hasDerivativeEventDate)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeEventDate");
        }

        return derivativeEventDateLength;
    }

    public String derivativeEventDateAsString()
    {
        return hasDerivativeEventDate ? new String(derivativeEventDate, 0, derivativeEventDateLength) : null;
    }

    public void derivativeEventDate(final AsciiSequenceView view)
    {
        if (!hasDerivativeEventDate)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeEventDate");
        }

        view.wrap(buffer, derivativeEventDateOffset, derivativeEventDateLength);
    }


    private byte[] derivativeEventTime = new byte[24];

    private boolean hasDerivativeEventTime;

    public byte[] derivativeEventTime()
    {
        if (!hasDerivativeEventTime)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeEventTime");
        }

        return derivativeEventTime;
    }

    public boolean hasDerivativeEventTime()
    {
        return hasDerivativeEventTime;
    }


    private int derivativeEventTimeOffset;

    private int derivativeEventTimeLength;

    public int derivativeEventTimeLength()
    {
        if (!hasDerivativeEventTime)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeEventTime");
        }

        return derivativeEventTimeLength;
    }

    public String derivativeEventTimeAsString()
    {
        return hasDerivativeEventTime ? new String(derivativeEventTime, 0, derivativeEventTimeLength) : null;
    }

    public void derivativeEventTime(final AsciiSequenceView view)
    {
        if (!hasDerivativeEventTime)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeEventTime");
        }

        view.wrap(buffer, derivativeEventTimeOffset, derivativeEventTimeLength);
    }


    private DecimalFloat derivativeEventPx = DecimalFloat.newNaNValue();

    private boolean hasDerivativeEventPx;

    public DecimalFloat derivativeEventPx()
    {
        if (!hasDerivativeEventPx)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeEventPx");
        }

        return derivativeEventPx;
    }

    public boolean hasDerivativeEventPx()
    {
        return hasDerivativeEventPx;
    }



    private char[] derivativeEventText = new char[1];

    private boolean hasDerivativeEventText;

    public char[] derivativeEventText()
    {
        if (!hasDerivativeEventText)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeEventText");
        }

        return derivativeEventText;
    }

    public boolean hasDerivativeEventText()
    {
        return hasDerivativeEventText;
    }


    private int derivativeEventTextOffset;

    private int derivativeEventTextLength;

    public int derivativeEventTextLength()
    {
        if (!hasDerivativeEventText)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeEventText");
        }

        return derivativeEventTextLength;
    }

    public String derivativeEventTextAsString()
    {
        return hasDerivativeEventText ? new String(derivativeEventText, 0, derivativeEventTextLength) : null;
    }

    public void derivativeEventText(final AsciiSequenceView view)
    {
        if (!hasDerivativeEventText)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeEventText");
        }

        view.wrap(buffer, derivativeEventTextOffset, derivativeEventTextLength);
    }


    private final CharArrayWrapper derivativeEventTextWrapper = new CharArrayWrapper();
    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode DerivativeEventsGroup
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
                    next = new DerivativeEventsGroupDecoder(trailer, messageFields);
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
            case Constants.DERIVATIVE_EVENT_TYPE:
                hasDerivativeEventType = true;
                derivativeEventType = getInt(buffer, valueOffset, endOfField, 1287, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.DERIVATIVE_EVENT_DATE:
                hasDerivativeEventDate = true;
                derivativeEventDate = buffer.getBytes(derivativeEventDate, valueOffset, valueLength);
                derivativeEventDateOffset = valueOffset;
                derivativeEventDateLength = valueLength;
                break;

            case Constants.DERIVATIVE_EVENT_TIME:
                hasDerivativeEventTime = true;
                derivativeEventTime = buffer.getBytes(derivativeEventTime, valueOffset, valueLength);
                derivativeEventTimeOffset = valueOffset;
                derivativeEventTimeLength = valueLength;
                break;

            case Constants.DERIVATIVE_EVENT_PX:
                hasDerivativeEventPx = true;
                derivativeEventPx = getFloat(buffer, derivativeEventPx, valueOffset, valueLength, 1290, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.DERIVATIVE_EVENT_TEXT:
                hasDerivativeEventText = true;
                derivativeEventText = buffer.getChars(derivativeEventText, valueOffset, valueLength);
                derivativeEventTextOffset = valueOffset;
                derivativeEventTextLength = valueLength;
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
        this.resetDerivativeEventType();
        this.resetDerivativeEventDate();
        this.resetDerivativeEventTime();
        this.resetDerivativeEventPx();
        this.resetDerivativeEventText();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetDerivativeEventType()
    {
        hasDerivativeEventType = false;
    }

    public void resetDerivativeEventDate()
    {
        hasDerivativeEventDate = false;
    }

    public void resetDerivativeEventTime()
    {
        hasDerivativeEventTime = false;
    }

    public void resetDerivativeEventPx()
    {
        hasDerivativeEventPx = false;
    }

    public void resetDerivativeEventText()
    {
        hasDerivativeEventText = false;
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
            appendData(builder, derivativeEventDate, derivativeEventDateLength);
            builder.append("\",\n");
        }

        if (hasDerivativeEventTime())
        {
            indent(builder, level);
            builder.append("\"DerivativeEventTime\": \"");
            appendData(builder, derivativeEventTime, derivativeEventTimeLength);
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
            builder.append(this.derivativeEventText(), 0, derivativeEventTextLength());
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public DerivativeEventsGrpEncoder.DerivativeEventsGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((DerivativeEventsGrpEncoder.DerivativeEventsGroupEncoder)encoder);
    }

    public DerivativeEventsGrpEncoder.DerivativeEventsGroupEncoder toEncoder(final DerivativeEventsGrpEncoder.DerivativeEventsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasDerivativeEventType())
        {
            encoder.derivativeEventType(this.derivativeEventType());
        }

        if (hasDerivativeEventDate())
        {
            encoder.derivativeEventDateAsCopy(this.derivativeEventDate(), 0, derivativeEventDateLength());
        }

        if (hasDerivativeEventTime())
        {
            encoder.derivativeEventTimeAsCopy(this.derivativeEventTime(), 0, derivativeEventTimeLength());
        }

        if (hasDerivativeEventPx())
        {
            encoder.derivativeEventPx(this.derivativeEventPx());
        }

        if (hasDerivativeEventText())
        {
            encoder.derivativeEventText(this.derivativeEventText(), 0, derivativeEventTextLength());
        }
        return encoder;
    }

}
    public class DerivativeEventsGroupIterator implements Iterable<DerivativeEventsGroupDecoder>, java.util.Iterator<DerivativeEventsGroupDecoder>
    {
        private final DerivativeEventsGrpDecoder parent;
        private int remainder;
        private DerivativeEventsGroupDecoder current;

        public DerivativeEventsGroupIterator(final DerivativeEventsGrpDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }

        public DerivativeEventsGroupDecoder next()
        {
            remainder--;
            final DerivativeEventsGroupDecoder value = current;
            current = current.next();
            return value;
        }

        public int numberFieldValue()
        {
            return parent.hasNoDerivativeEventsGroupCounter() ? parent.noDerivativeEventsGroupCounter() : 0;
        }

        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.derivativeEventsGroup();
        }

        public DerivativeEventsGroupIterator iterator()
        {
            reset();
            return this;
        }

    }

    public DerivativeEventsGroupIterator derivativeEventsGroupIterator();
    public int noDerivativeEventsGroupCounter();
    public boolean hasNoDerivativeEventsGroupCounter();
    public DerivativeEventsGroupDecoder derivativeEventsGroup();

}
