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
import com.swiftalgo.ms.codecs.fix50sp2.builder.UnderlyingStipulationsEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.UnderlyingStipulationsEncoder.UnderlyingStipsGroupEncoder;

public interface UnderlyingStipulationsDecoder 
{



public class UnderlyingStipsGroupDecoder extends CommonDecoderImpl
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
            ALL_GROUP_FIELDS.add(Constants.UNDERLYING_STIP_TYPE);
            ALL_GROUP_FIELDS.add(Constants.UNDERLYING_STIP_VALUE);
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
    public UnderlyingStipsGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private UnderlyingStipsGroupDecoder next = null;

    public UnderlyingStipsGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(4);

    private char[] underlyingStipType = new char[1];

    private boolean hasUnderlyingStipType;

    public char[] underlyingStipType()
    {
        if (!hasUnderlyingStipType)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingStipType");
        }

        return underlyingStipType;
    }

    public boolean hasUnderlyingStipType()
    {
        return hasUnderlyingStipType;
    }


    private int underlyingStipTypeOffset;

    private int underlyingStipTypeLength;

    public int underlyingStipTypeLength()
    {
        if (!hasUnderlyingStipType)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingStipType");
        }

        return underlyingStipTypeLength;
    }

    public String underlyingStipTypeAsString()
    {
        return hasUnderlyingStipType ? new String(underlyingStipType, 0, underlyingStipTypeLength) : null;
    }

    public void underlyingStipType(final AsciiSequenceView view)
    {
        if (!hasUnderlyingStipType)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingStipType");
        }

        view.wrap(buffer, underlyingStipTypeOffset, underlyingStipTypeLength);
    }


    private final CharArrayWrapper underlyingStipTypeWrapper = new CharArrayWrapper();
    private char[] underlyingStipValue = new char[1];

    private boolean hasUnderlyingStipValue;

    public char[] underlyingStipValue()
    {
        if (!hasUnderlyingStipValue)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingStipValue");
        }

        return underlyingStipValue;
    }

    public boolean hasUnderlyingStipValue()
    {
        return hasUnderlyingStipValue;
    }


    private int underlyingStipValueOffset;

    private int underlyingStipValueLength;

    public int underlyingStipValueLength()
    {
        if (!hasUnderlyingStipValue)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingStipValue");
        }

        return underlyingStipValueLength;
    }

    public String underlyingStipValueAsString()
    {
        return hasUnderlyingStipValue ? new String(underlyingStipValue, 0, underlyingStipValueLength) : null;
    }

    public void underlyingStipValue(final AsciiSequenceView view)
    {
        if (!hasUnderlyingStipValue)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingStipValue");
        }

        view.wrap(buffer, underlyingStipValueOffset, underlyingStipValueLength);
    }


    private final CharArrayWrapper underlyingStipValueWrapper = new CharArrayWrapper();
    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode UnderlyingStipsGroup
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
                    next = new UnderlyingStipsGroupDecoder(trailer, messageFields);
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
            case Constants.UNDERLYING_STIP_TYPE:
                hasUnderlyingStipType = true;
                underlyingStipType = buffer.getChars(underlyingStipType, valueOffset, valueLength);
                underlyingStipTypeOffset = valueOffset;
                underlyingStipTypeLength = valueLength;
                break;

            case Constants.UNDERLYING_STIP_VALUE:
                hasUnderlyingStipValue = true;
                underlyingStipValue = buffer.getChars(underlyingStipValue, valueOffset, valueLength);
                underlyingStipValueOffset = valueOffset;
                underlyingStipValueLength = valueLength;
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
        this.resetUnderlyingStipType();
        this.resetUnderlyingStipValue();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetUnderlyingStipType()
    {
        hasUnderlyingStipType = false;
    }

    public void resetUnderlyingStipValue()
    {
        hasUnderlyingStipValue = false;
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
        builder.append("\"MessageName\": \"UnderlyingStipsGroup\",\n");
        if (hasUnderlyingStipType())
        {
            indent(builder, level);
            builder.append("\"UnderlyingStipType\": \"");
            builder.append(this.underlyingStipType(), 0, underlyingStipTypeLength());
            builder.append("\",\n");
        }

        if (hasUnderlyingStipValue())
        {
            indent(builder, level);
            builder.append("\"UnderlyingStipValue\": \"");
            builder.append(this.underlyingStipValue(), 0, underlyingStipValueLength());
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public UnderlyingStipulationsEncoder.UnderlyingStipsGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((UnderlyingStipulationsEncoder.UnderlyingStipsGroupEncoder)encoder);
    }

    public UnderlyingStipulationsEncoder.UnderlyingStipsGroupEncoder toEncoder(final UnderlyingStipulationsEncoder.UnderlyingStipsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasUnderlyingStipType())
        {
            encoder.underlyingStipType(this.underlyingStipType(), 0, underlyingStipTypeLength());
        }

        if (hasUnderlyingStipValue())
        {
            encoder.underlyingStipValue(this.underlyingStipValue(), 0, underlyingStipValueLength());
        }
        return encoder;
    }

}
    public class UnderlyingStipsGroupIterator implements Iterable<UnderlyingStipsGroupDecoder>, java.util.Iterator<UnderlyingStipsGroupDecoder>
    {
        private final UnderlyingStipulationsDecoder parent;
        private int remainder;
        private UnderlyingStipsGroupDecoder current;

        public UnderlyingStipsGroupIterator(final UnderlyingStipulationsDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }

        public UnderlyingStipsGroupDecoder next()
        {
            remainder--;
            final UnderlyingStipsGroupDecoder value = current;
            current = current.next();
            return value;
        }

        public int numberFieldValue()
        {
            return parent.hasNoUnderlyingStipsGroupCounter() ? parent.noUnderlyingStipsGroupCounter() : 0;
        }

        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.underlyingStipsGroup();
        }

        public UnderlyingStipsGroupIterator iterator()
        {
            reset();
            return this;
        }

    }

    public UnderlyingStipsGroupIterator underlyingStipsGroupIterator();
    public int noUnderlyingStipsGroupCounter();
    public boolean hasNoUnderlyingStipsGroupCounter();
    public UnderlyingStipsGroupDecoder underlyingStipsGroup();

}
