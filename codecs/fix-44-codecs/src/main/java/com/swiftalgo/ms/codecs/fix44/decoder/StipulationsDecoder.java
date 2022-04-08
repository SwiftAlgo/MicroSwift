/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44.decoder;

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
import com.swiftalgo.ms.codecs.fix44.*;
import com.swiftalgo.ms.codecs.fix44.builder.StipulationsEncoder;
import static com.swiftalgo.ms.codecs.fix44.builder.StipulationsEncoder.StipulationsGroupEncoder;

public interface StipulationsDecoder 
{



public class StipulationsGroupDecoder extends CommonDecoderImpl
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
            ALL_GROUP_FIELDS.add(Constants.STIPULATION_TYPE);
            ALL_GROUP_FIELDS.add(Constants.STIPULATION_VALUE);
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
        if (hasStipulationType)
        {
        stipulationTypeWrapper.wrap(this.stipulationType(), stipulationTypeLength);
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !StipulationType.isValid(stipulationTypeWrapper))
        {
            invalidTagId = 233;
            rejectReason = 5;
            return false;
        }
        }

        if (hasStipulationValue)
        {
        stipulationValueWrapper.wrap(this.stipulationValue(), stipulationValueLength);
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !StipulationValue.isValid(stipulationValueWrapper))
        {
            invalidTagId = 234;
            rejectReason = 5;
            return false;
        }
        }
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public StipulationsGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private StipulationsGroupDecoder next = null;

    public StipulationsGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(4);

    private char[] stipulationType = new char[1];

    private boolean hasStipulationType;

    public char[] stipulationType()
    {
        if (!hasStipulationType)
        {
            throw new IllegalArgumentException("No value for optional field: StipulationType");
        }

        return stipulationType;
    }

    public boolean hasStipulationType()
    {
        return hasStipulationType;
    }


    private int stipulationTypeOffset;

    private int stipulationTypeLength;

    public int stipulationTypeLength()
    {
        if (!hasStipulationType)
        {
            throw new IllegalArgumentException("No value for optional field: StipulationType");
        }

        return stipulationTypeLength;
    }

    public String stipulationTypeAsString()
    {
        return hasStipulationType ? new String(stipulationType, 0, stipulationTypeLength) : null;
    }

    public void stipulationType(final AsciiSequenceView view)
    {
        if (!hasStipulationType)
        {
            throw new IllegalArgumentException("No value for optional field: StipulationType");
        }

        view.wrap(buffer, stipulationTypeOffset, stipulationTypeLength);
    }


    private final CharArrayWrapper stipulationTypeWrapper = new CharArrayWrapper();
    public StipulationType stipulationTypeAsEnum()
    {
        if (!hasStipulationType)
 return StipulationType.NULL_VAL;
        stipulationTypeWrapper.wrap(this.stipulationType(), stipulationTypeLength);
        return StipulationType.decode(stipulationTypeWrapper);
    }

    private char[] stipulationValue = new char[1];

    private boolean hasStipulationValue;

    public char[] stipulationValue()
    {
        if (!hasStipulationValue)
        {
            throw new IllegalArgumentException("No value for optional field: StipulationValue");
        }

        return stipulationValue;
    }

    public boolean hasStipulationValue()
    {
        return hasStipulationValue;
    }


    private int stipulationValueOffset;

    private int stipulationValueLength;

    public int stipulationValueLength()
    {
        if (!hasStipulationValue)
        {
            throw new IllegalArgumentException("No value for optional field: StipulationValue");
        }

        return stipulationValueLength;
    }

    public String stipulationValueAsString()
    {
        return hasStipulationValue ? new String(stipulationValue, 0, stipulationValueLength) : null;
    }

    public void stipulationValue(final AsciiSequenceView view)
    {
        if (!hasStipulationValue)
        {
            throw new IllegalArgumentException("No value for optional field: StipulationValue");
        }

        view.wrap(buffer, stipulationValueOffset, stipulationValueLength);
    }


    private final CharArrayWrapper stipulationValueWrapper = new CharArrayWrapper();
    public StipulationValue stipulationValueAsEnum()
    {
        if (!hasStipulationValue)
 return StipulationValue.NULL_VAL;
        stipulationValueWrapper.wrap(this.stipulationValue(), stipulationValueLength);
        return StipulationValue.decode(stipulationValueWrapper);
    }

    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode StipulationsGroup
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
                    next = new StipulationsGroupDecoder(trailer, messageFields);
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
            case Constants.STIPULATION_TYPE:
                hasStipulationType = true;
                stipulationType = buffer.getChars(stipulationType, valueOffset, valueLength);
                stipulationTypeOffset = valueOffset;
                stipulationTypeLength = valueLength;
                break;

            case Constants.STIPULATION_VALUE:
                hasStipulationValue = true;
                stipulationValue = buffer.getChars(stipulationValue, valueOffset, valueLength);
                stipulationValueOffset = valueOffset;
                stipulationValueLength = valueLength;
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
        this.resetStipulationType();
        this.resetStipulationValue();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetStipulationType()
    {
        hasStipulationType = false;
    }

    public void resetStipulationValue()
    {
        hasStipulationValue = false;
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
        builder.append("\"MessageName\": \"StipulationsGroup\",\n");
        if (hasStipulationType())
        {
            indent(builder, level);
            builder.append("\"StipulationType\": \"");
            builder.append(this.stipulationType(), 0, stipulationTypeLength());
            builder.append("\",\n");
        }

        if (hasStipulationValue())
        {
            indent(builder, level);
            builder.append("\"StipulationValue\": \"");
            builder.append(this.stipulationValue(), 0, stipulationValueLength());
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public StipulationsEncoder.StipulationsGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((StipulationsEncoder.StipulationsGroupEncoder)encoder);
    }

    public StipulationsEncoder.StipulationsGroupEncoder toEncoder(final StipulationsEncoder.StipulationsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasStipulationType())
        {
            encoder.stipulationType(this.stipulationType(), 0, stipulationTypeLength());
        }

        if (hasStipulationValue())
        {
            encoder.stipulationValue(this.stipulationValue(), 0, stipulationValueLength());
        }
        return encoder;
    }

}
    public class StipulationsGroupIterator implements Iterable<StipulationsGroupDecoder>, java.util.Iterator<StipulationsGroupDecoder>
    {
        private final StipulationsDecoder parent;
        private int remainder;
        private StipulationsGroupDecoder current;

        public StipulationsGroupIterator(final StipulationsDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }

        public StipulationsGroupDecoder next()
        {
            remainder--;
            final StipulationsGroupDecoder value = current;
            current = current.next();
            return value;
        }

        public int numberFieldValue()
        {
            return parent.hasNoStipulationsGroupCounter() ? parent.noStipulationsGroupCounter() : 0;
        }

        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.stipulationsGroup();
        }

        public StipulationsGroupIterator iterator()
        {
            reset();
            return this;
        }

    }

    public StipulationsGroupIterator stipulationsGroupIterator();
    public int noStipulationsGroupCounter();
    public boolean hasNoStipulationsGroupCounter();
    public StipulationsGroupDecoder stipulationsGroup();

}
