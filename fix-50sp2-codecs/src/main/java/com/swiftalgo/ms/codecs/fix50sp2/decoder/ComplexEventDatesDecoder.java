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
import com.swiftalgo.ms.codecs.fix50sp2.builder.ComplexEventDatesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.ComplexEventDatesEncoder.ComplexEventDatesGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.ComplexEventTimesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.ComplexEventTimesEncoder.ComplexEventTimesGroupEncoder;

public interface ComplexEventDatesDecoder 
{



public class ComplexEventDatesGroupDecoder extends CommonDecoderImpl implements ComplexEventTimesDecoder
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(0);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
        }
    }

    public final IntHashSet GROUP_FIELDS = new IntHashSet(4);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            GROUP_FIELDS.add(Constants.COMPLEX_EVENT_START_DATE);
            GROUP_FIELDS.add(Constants.COMPLEX_EVENT_END_DATE);
        }
    }

    public final IntHashSet ALL_GROUP_FIELDS = new IntHashSet(4);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            ALL_GROUP_FIELDS.add(Constants.COMPLEX_EVENT_START_DATE);
            ALL_GROUP_FIELDS.add(Constants.COMPLEX_EVENT_END_DATE);
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
        if (hasNoComplexEventTimesGroupCounter)
        {
            {
                int count = 0;
                final ComplexEventTimesGroupIterator iterator = complexEventTimesGroupIterator.iterator();
                for (final ComplexEventTimesGroupDecoder group : iterator)
                {
                    count++;                    if (!group.validate())
                    {
                        invalidTagId = group.invalidTagId();
                        rejectReason = group.rejectReason();
                        return false;
                    }
                }
                if (count != iterator.numberFieldValue())
                {
                    invalidTagId = 1494;
                    rejectReason = 16;
                    return false;
                }
            }
        }
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public ComplexEventDatesGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private ComplexEventDatesGroupDecoder next = null;

    public ComplexEventDatesGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(6);

    private byte[] complexEventStartDate = new byte[24];

    private boolean hasComplexEventStartDate;

    public byte[] complexEventStartDate()
    {
        if (!hasComplexEventStartDate)
        {
            throw new IllegalArgumentException("No value for optional field: ComplexEventStartDate");
        }

        return complexEventStartDate;
    }

    public boolean hasComplexEventStartDate()
    {
        return hasComplexEventStartDate;
    }


    private int complexEventStartDateOffset;

    private int complexEventStartDateLength;

    public int complexEventStartDateLength()
    {
        if (!hasComplexEventStartDate)
        {
            throw new IllegalArgumentException("No value for optional field: ComplexEventStartDate");
        }

        return complexEventStartDateLength;
    }

    public String complexEventStartDateAsString()
    {
        return hasComplexEventStartDate ? new String(complexEventStartDate, 0, complexEventStartDateLength) : null;
    }

    public void complexEventStartDate(final AsciiSequenceView view)
    {
        if (!hasComplexEventStartDate)
        {
            throw new IllegalArgumentException("No value for optional field: ComplexEventStartDate");
        }

        view.wrap(buffer, complexEventStartDateOffset, complexEventStartDateLength);
    }


    private byte[] complexEventEndDate = new byte[24];

    private boolean hasComplexEventEndDate;

    public byte[] complexEventEndDate()
    {
        if (!hasComplexEventEndDate)
        {
            throw new IllegalArgumentException("No value for optional field: ComplexEventEndDate");
        }

        return complexEventEndDate;
    }

    public boolean hasComplexEventEndDate()
    {
        return hasComplexEventEndDate;
    }


    private int complexEventEndDateOffset;

    private int complexEventEndDateLength;

    public int complexEventEndDateLength()
    {
        if (!hasComplexEventEndDate)
        {
            throw new IllegalArgumentException("No value for optional field: ComplexEventEndDate");
        }

        return complexEventEndDateLength;
    }

    public String complexEventEndDateAsString()
    {
        return hasComplexEventEndDate ? new String(complexEventEndDate, 0, complexEventEndDateLength) : null;
    }

    public void complexEventEndDate(final AsciiSequenceView view)
    {
        if (!hasComplexEventEndDate)
        {
            throw new IllegalArgumentException("No value for optional field: ComplexEventEndDate");
        }

        view.wrap(buffer, complexEventEndDateOffset, complexEventEndDateLength);
    }




    private ComplexEventTimesGroupDecoder complexEventTimesGroup = null;
    public ComplexEventTimesGroupDecoder complexEventTimesGroup()
    {
        return complexEventTimesGroup;
    }

    private int noComplexEventTimesGroupCounter = MISSING_INT;

    private boolean hasNoComplexEventTimesGroupCounter;

    public int noComplexEventTimesGroupCounter()
    {
        if (!hasNoComplexEventTimesGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoComplexEventTimesGroupCounter");
        }

        return noComplexEventTimesGroupCounter;
    }

    public boolean hasNoComplexEventTimesGroupCounter()
    {
        return hasNoComplexEventTimesGroupCounter;
    }




    private ComplexEventTimesGroupIterator complexEventTimesGroupIterator = new ComplexEventTimesGroupIterator(this);
    public ComplexEventTimesGroupIterator complexEventTimesGroupIterator()
    {
        return complexEventTimesGroupIterator.iterator();
    }


    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode ComplexEventDatesGroup
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
                    next = new ComplexEventDatesGroupDecoder(trailer, messageFields);
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
            case Constants.COMPLEX_EVENT_START_DATE:
                hasComplexEventStartDate = true;
                complexEventStartDate = buffer.getBytes(complexEventStartDate, valueOffset, valueLength);
                complexEventStartDateOffset = valueOffset;
                complexEventStartDateLength = valueLength;
                break;

            case Constants.COMPLEX_EVENT_END_DATE:
                hasComplexEventEndDate = true;
                complexEventEndDate = buffer.getBytes(complexEventEndDate, valueOffset, valueLength);
                complexEventEndDateOffset = valueOffset;
                complexEventEndDateLength = valueLength;
                break;

            case Constants.NO_COMPLEX_EVENT_TIMES:
                hasNoComplexEventTimesGroupCounter = true;
                noComplexEventTimesGroupCounter = getInt(buffer, valueOffset, endOfField, 1494, CODEC_VALIDATION_ENABLED);
                if (complexEventTimesGroup == null)
                {
                    complexEventTimesGroup = new ComplexEventTimesGroupDecoder(trailer, messageFields);
                }
                ComplexEventTimesGroupDecoder complexEventTimesGroupCurrent = complexEventTimesGroup;
                position = endOfField + 1;
                final int noComplexEventTimesGroupCounter = this.noComplexEventTimesGroupCounter;
                for (int i = 0; i < noComplexEventTimesGroupCounter && position < end; i++)
                {
                    if (complexEventTimesGroupCurrent != null)
                    {
                        position += complexEventTimesGroupCurrent.decode(buffer, position, end - position);
                        complexEventTimesGroupCurrent = complexEventTimesGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (complexEventTimesGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
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
        this.resetComplexEventStartDate();
        this.resetComplexEventEndDate();
        this.resetComplexEventTimesGroup();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetComplexEventStartDate()
    {
        hasComplexEventStartDate = false;
    }

    public void resetComplexEventEndDate()
    {
        hasComplexEventEndDate = false;
    }

    public void resetComplexEventTimesGroup()
    {
        for (final ComplexEventTimesGroupDecoder complexEventTimesGroupDecoder : complexEventTimesGroupIterator.iterator())
        {
            complexEventTimesGroupDecoder.reset();
            if (complexEventTimesGroupDecoder.next() == null)
            {
                break;
            }
        }
        noComplexEventTimesGroupCounter = MISSING_INT;
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
        builder.append("\"MessageName\": \"ComplexEventDatesGroup\",\n");
        if (hasComplexEventStartDate())
        {
            indent(builder, level);
            builder.append("\"ComplexEventStartDate\": \"");
            appendData(builder, complexEventStartDate, complexEventStartDateLength);
            builder.append("\",\n");
        }

        if (hasComplexEventEndDate())
        {
            indent(builder, level);
            builder.append("\"ComplexEventEndDate\": \"");
            appendData(builder, complexEventEndDate, complexEventEndDateLength);
            builder.append("\",\n");
        }

    if (hasNoComplexEventTimesGroupCounter)
    {
        indent(builder, level);
        builder.append("\"ComplexEventTimesGroup\": [\n");
        ComplexEventTimesGroupDecoder complexEventTimesGroup = this.complexEventTimesGroup;
        for (int i = 0, size = this.noComplexEventTimesGroupCounter; i < size; i++)
        {
            indent(builder, level);
            complexEventTimesGroup.appendTo(builder, level + 1);            if (complexEventTimesGroup.next() != null)
            {
                builder.append(',');
            }
            builder.append('\n');
            complexEventTimesGroup = complexEventTimesGroup.next();        }
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
    public ComplexEventDatesGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((ComplexEventDatesGroupEncoder)encoder);
    }

    public ComplexEventDatesGroupEncoder toEncoder(final ComplexEventDatesGroupEncoder encoder)
    {
        encoder.reset();
        if (hasComplexEventStartDate())
        {
            encoder.complexEventStartDateAsCopy(this.complexEventStartDate(), 0, complexEventStartDateLength());
        }

        if (hasComplexEventEndDate())
        {
            encoder.complexEventEndDateAsCopy(this.complexEventEndDate(), 0, complexEventEndDateLength());
        }


        final ComplexEventTimesEncoder complexEventTimes = encoder.complexEventTimes();        if (hasNoComplexEventTimesGroupCounter)
        {
            final int size = this.noComplexEventTimesGroupCounter;
            ComplexEventTimesGroupDecoder complexEventTimesGroup = this.complexEventTimesGroup;
            ComplexEventTimesGroupEncoder complexEventTimesGroupEncoder = complexEventTimes.complexEventTimesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (complexEventTimesGroup != null)
                {
                    complexEventTimesGroup.toEncoder(complexEventTimesGroupEncoder);
                    complexEventTimesGroup = complexEventTimesGroup.next();
                    complexEventTimesGroupEncoder = complexEventTimesGroupEncoder.next();
                }
            }
        }

        return encoder;
    }

}
    public class ComplexEventDatesGroupIterator implements Iterable<ComplexEventDatesGroupDecoder>, java.util.Iterator<ComplexEventDatesGroupDecoder>
    {
        private final ComplexEventDatesDecoder parent;
        private int remainder;
        private ComplexEventDatesGroupDecoder current;

        public ComplexEventDatesGroupIterator(final ComplexEventDatesDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }
        public ComplexEventDatesGroupDecoder next()
        {
            remainder--;
            final ComplexEventDatesGroupDecoder value = current;
            current = current.next();
            return value;
        }
        public int numberFieldValue()
        {
            return parent.hasNoComplexEventDatesGroupCounter() ? parent.noComplexEventDatesGroupCounter() : 0;
        }
        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.complexEventDatesGroup();
        }
        public ComplexEventDatesGroupIterator iterator()
        {
            reset();
            return this;
        }
    }

public ComplexEventDatesGroupIterator complexEventDatesGroupIterator();
    public int noComplexEventDatesGroupCounter();
    public boolean hasNoComplexEventDatesGroupCounter();
    public ComplexEventDatesGroupDecoder complexEventDatesGroup();

}
