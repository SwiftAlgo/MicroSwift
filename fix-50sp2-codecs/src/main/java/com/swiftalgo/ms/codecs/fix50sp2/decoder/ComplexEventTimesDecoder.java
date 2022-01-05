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
import com.swiftalgo.ms.codecs.fix50sp2.builder.ComplexEventTimesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.ComplexEventTimesEncoder.ComplexEventTimesGroupEncoder;

public interface ComplexEventTimesDecoder 
{



public class ComplexEventTimesGroupDecoder extends CommonDecoderImpl
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(0);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
        }
    }

    public final IntHashSet ALL_GROUP_FIELDS = new IntHashSet(4);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            ALL_GROUP_FIELDS.add(Constants.COMPLEX_EVENT_START_TIME);
            ALL_GROUP_FIELDS.add(Constants.COMPLEX_EVENT_END_TIME);
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
    public ComplexEventTimesGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private ComplexEventTimesGroupDecoder next = null;

    public ComplexEventTimesGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(4);

    private byte[] complexEventStartTime = new byte[12];

    private boolean hasComplexEventStartTime;

    public byte[] complexEventStartTime()
    {
        if (!hasComplexEventStartTime)
        {
            throw new IllegalArgumentException("No value for optional field: ComplexEventStartTime");
        }

        return complexEventStartTime;
    }

    public boolean hasComplexEventStartTime()
    {
        return hasComplexEventStartTime;
    }


    private int complexEventStartTimeOffset;

    private int complexEventStartTimeLength;

    public int complexEventStartTimeLength()
    {
        if (!hasComplexEventStartTime)
        {
            throw new IllegalArgumentException("No value for optional field: ComplexEventStartTime");
        }

        return complexEventStartTimeLength;
    }

    public String complexEventStartTimeAsString()
    {
        return hasComplexEventStartTime ? new String(complexEventStartTime, 0, complexEventStartTimeLength) : null;
    }

    public void complexEventStartTime(final AsciiSequenceView view)
    {
        if (!hasComplexEventStartTime)
        {
            throw new IllegalArgumentException("No value for optional field: ComplexEventStartTime");
        }

        view.wrap(buffer, complexEventStartTimeOffset, complexEventStartTimeLength);
    }


    private byte[] complexEventEndTime = new byte[12];

    private boolean hasComplexEventEndTime;

    public byte[] complexEventEndTime()
    {
        if (!hasComplexEventEndTime)
        {
            throw new IllegalArgumentException("No value for optional field: ComplexEventEndTime");
        }

        return complexEventEndTime;
    }

    public boolean hasComplexEventEndTime()
    {
        return hasComplexEventEndTime;
    }


    private int complexEventEndTimeOffset;

    private int complexEventEndTimeLength;

    public int complexEventEndTimeLength()
    {
        if (!hasComplexEventEndTime)
        {
            throw new IllegalArgumentException("No value for optional field: ComplexEventEndTime");
        }

        return complexEventEndTimeLength;
    }

    public String complexEventEndTimeAsString()
    {
        return hasComplexEventEndTime ? new String(complexEventEndTime, 0, complexEventEndTimeLength) : null;
    }

    public void complexEventEndTime(final AsciiSequenceView view)
    {
        if (!hasComplexEventEndTime)
        {
            throw new IllegalArgumentException("No value for optional field: ComplexEventEndTime");
        }

        view.wrap(buffer, complexEventEndTimeOffset, complexEventEndTimeLength);
    }


    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode ComplexEventTimesGroup
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
                    next = new ComplexEventTimesGroupDecoder(trailer, messageFields);
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
            case Constants.COMPLEX_EVENT_START_TIME:
                hasComplexEventStartTime = true;
                complexEventStartTime = buffer.getBytes(complexEventStartTime, valueOffset, valueLength);
                complexEventStartTimeOffset = valueOffset;
                complexEventStartTimeLength = valueLength;
                break;

            case Constants.COMPLEX_EVENT_END_TIME:
                hasComplexEventEndTime = true;
                complexEventEndTime = buffer.getBytes(complexEventEndTime, valueOffset, valueLength);
                complexEventEndTimeOffset = valueOffset;
                complexEventEndTimeLength = valueLength;
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
        this.resetComplexEventStartTime();
        this.resetComplexEventEndTime();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetComplexEventStartTime()
    {
        hasComplexEventStartTime = false;
    }

    public void resetComplexEventEndTime()
    {
        hasComplexEventEndTime = false;
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
            appendData(builder, complexEventStartTime, complexEventStartTimeLength);
            builder.append("\",\n");
        }

        if (hasComplexEventEndTime())
        {
            indent(builder, level);
            builder.append("\"ComplexEventEndTime\": \"");
            appendData(builder, complexEventEndTime, complexEventEndTimeLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public ComplexEventTimesGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((ComplexEventTimesGroupEncoder)encoder);
    }

    public ComplexEventTimesGroupEncoder toEncoder(final ComplexEventTimesGroupEncoder encoder)
    {
        encoder.reset();
        if (hasComplexEventStartTime())
        {
            encoder.complexEventStartTimeAsCopy(this.complexEventStartTime(), 0, complexEventStartTimeLength());
        }

        if (hasComplexEventEndTime())
        {
            encoder.complexEventEndTimeAsCopy(this.complexEventEndTime(), 0, complexEventEndTimeLength());
        }
        return encoder;
    }

}
    public class ComplexEventTimesGroupIterator implements Iterable<ComplexEventTimesGroupDecoder>, java.util.Iterator<ComplexEventTimesGroupDecoder>
    {
        private final ComplexEventTimesDecoder parent;
        private int remainder;
        private ComplexEventTimesGroupDecoder current;

        public ComplexEventTimesGroupIterator(final ComplexEventTimesDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }
        public ComplexEventTimesGroupDecoder next()
        {
            remainder--;
            final ComplexEventTimesGroupDecoder value = current;
            current = current.next();
            return value;
        }
        public int numberFieldValue()
        {
            return parent.hasNoComplexEventTimesGroupCounter() ? parent.noComplexEventTimesGroupCounter() : 0;
        }
        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.complexEventTimesGroup();
        }
        public ComplexEventTimesGroupIterator iterator()
        {
            reset();
            return this;
        }
    }

public ComplexEventTimesGroupIterator complexEventTimesGroupIterator();
    public int noComplexEventTimesGroupCounter();
    public boolean hasNoComplexEventTimesGroupCounter();
    public ComplexEventTimesGroupDecoder complexEventTimesGroup();

}
