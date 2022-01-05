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
import com.swiftalgo.ms.codecs.fix50sp2.builder.LegStipulationsEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.LegStipulationsEncoder.LegStipulationsGroupEncoder;

public interface LegStipulationsDecoder 
{



public class LegStipulationsGroupDecoder extends CommonDecoderImpl
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
            ALL_GROUP_FIELDS.add(Constants.LEG_STIPULATION_TYPE);
            ALL_GROUP_FIELDS.add(Constants.LEG_STIPULATION_VALUE);
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
    public LegStipulationsGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private LegStipulationsGroupDecoder next = null;

    public LegStipulationsGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(4);

    private char[] legStipulationType = new char[1];

    private boolean hasLegStipulationType;

    public char[] legStipulationType()
    {
        if (!hasLegStipulationType)
        {
            throw new IllegalArgumentException("No value for optional field: LegStipulationType");
        }

        return legStipulationType;
    }

    public boolean hasLegStipulationType()
    {
        return hasLegStipulationType;
    }


    private int legStipulationTypeOffset;

    private int legStipulationTypeLength;

    public int legStipulationTypeLength()
    {
        if (!hasLegStipulationType)
        {
            throw new IllegalArgumentException("No value for optional field: LegStipulationType");
        }

        return legStipulationTypeLength;
    }

    public String legStipulationTypeAsString()
    {
        return hasLegStipulationType ? new String(legStipulationType, 0, legStipulationTypeLength) : null;
    }

    public void legStipulationType(final AsciiSequenceView view)
    {
        if (!hasLegStipulationType)
        {
            throw new IllegalArgumentException("No value for optional field: LegStipulationType");
        }

        view.wrap(buffer, legStipulationTypeOffset, legStipulationTypeLength);
    }


    private char[] legStipulationValue = new char[1];

    private boolean hasLegStipulationValue;

    public char[] legStipulationValue()
    {
        if (!hasLegStipulationValue)
        {
            throw new IllegalArgumentException("No value for optional field: LegStipulationValue");
        }

        return legStipulationValue;
    }

    public boolean hasLegStipulationValue()
    {
        return hasLegStipulationValue;
    }


    private int legStipulationValueOffset;

    private int legStipulationValueLength;

    public int legStipulationValueLength()
    {
        if (!hasLegStipulationValue)
        {
            throw new IllegalArgumentException("No value for optional field: LegStipulationValue");
        }

        return legStipulationValueLength;
    }

    public String legStipulationValueAsString()
    {
        return hasLegStipulationValue ? new String(legStipulationValue, 0, legStipulationValueLength) : null;
    }

    public void legStipulationValue(final AsciiSequenceView view)
    {
        if (!hasLegStipulationValue)
        {
            throw new IllegalArgumentException("No value for optional field: LegStipulationValue");
        }

        view.wrap(buffer, legStipulationValueOffset, legStipulationValueLength);
    }


    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode LegStipulationsGroup
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
                    next = new LegStipulationsGroupDecoder(trailer, messageFields);
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
            case Constants.LEG_STIPULATION_TYPE:
                hasLegStipulationType = true;
                legStipulationType = buffer.getChars(legStipulationType, valueOffset, valueLength);
                legStipulationTypeOffset = valueOffset;
                legStipulationTypeLength = valueLength;
                break;

            case Constants.LEG_STIPULATION_VALUE:
                hasLegStipulationValue = true;
                legStipulationValue = buffer.getChars(legStipulationValue, valueOffset, valueLength);
                legStipulationValueOffset = valueOffset;
                legStipulationValueLength = valueLength;
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
        this.resetLegStipulationType();
        this.resetLegStipulationValue();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetLegStipulationType()
    {
        hasLegStipulationType = false;
    }

    public void resetLegStipulationValue()
    {
        hasLegStipulationValue = false;
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
            builder.append(this.legStipulationType(), 0, legStipulationTypeLength());
            builder.append("\",\n");
        }

        if (hasLegStipulationValue())
        {
            indent(builder, level);
            builder.append("\"LegStipulationValue\": \"");
            builder.append(this.legStipulationValue(), 0, legStipulationValueLength());
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public LegStipulationsGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((LegStipulationsGroupEncoder)encoder);
    }

    public LegStipulationsGroupEncoder toEncoder(final LegStipulationsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasLegStipulationType())
        {
            encoder.legStipulationType(this.legStipulationType(), 0, legStipulationTypeLength());
        }

        if (hasLegStipulationValue())
        {
            encoder.legStipulationValue(this.legStipulationValue(), 0, legStipulationValueLength());
        }
        return encoder;
    }

}
    public class LegStipulationsGroupIterator implements Iterable<LegStipulationsGroupDecoder>, java.util.Iterator<LegStipulationsGroupDecoder>
    {
        private final LegStipulationsDecoder parent;
        private int remainder;
        private LegStipulationsGroupDecoder current;

        public LegStipulationsGroupIterator(final LegStipulationsDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }
        public LegStipulationsGroupDecoder next()
        {
            remainder--;
            final LegStipulationsGroupDecoder value = current;
            current = current.next();
            return value;
        }
        public int numberFieldValue()
        {
            return parent.hasNoLegStipulationsGroupCounter() ? parent.noLegStipulationsGroupCounter() : 0;
        }
        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.legStipulationsGroup();
        }
        public LegStipulationsGroupIterator iterator()
        {
            reset();
            return this;
        }
    }

public LegStipulationsGroupIterator legStipulationsGroupIterator();
    public int noLegStipulationsGroupCounter();
    public boolean hasNoLegStipulationsGroupCounter();
    public LegStipulationsGroupDecoder legStipulationsGroup();

}
