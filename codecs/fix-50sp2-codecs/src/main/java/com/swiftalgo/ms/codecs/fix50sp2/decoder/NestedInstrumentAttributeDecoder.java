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
import com.swiftalgo.ms.codecs.fix50sp2.builder.NestedInstrumentAttributeEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.NestedInstrumentAttributeEncoder.NestedInstrAttribGroupEncoder;

public interface NestedInstrumentAttributeDecoder 
{



public class NestedInstrAttribGroupDecoder extends CommonDecoderImpl
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
            ALL_GROUP_FIELDS.add(Constants.NESTED_INSTR_ATTRIB_TYPE);
            ALL_GROUP_FIELDS.add(Constants.NESTED_INSTR_ATTRIB_VALUE);
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
    public NestedInstrAttribGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private NestedInstrAttribGroupDecoder next = null;

    public NestedInstrAttribGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(4);

    private int nestedInstrAttribType = MISSING_INT;

    private boolean hasNestedInstrAttribType;

    public int nestedInstrAttribType()
    {
        if (!hasNestedInstrAttribType)
        {
            throw new IllegalArgumentException("No value for optional field: NestedInstrAttribType");
        }

        return nestedInstrAttribType;
    }

    public boolean hasNestedInstrAttribType()
    {
        return hasNestedInstrAttribType;
    }



    private char[] nestedInstrAttribValue = new char[1];

    private boolean hasNestedInstrAttribValue;

    public char[] nestedInstrAttribValue()
    {
        if (!hasNestedInstrAttribValue)
        {
            throw new IllegalArgumentException("No value for optional field: NestedInstrAttribValue");
        }

        return nestedInstrAttribValue;
    }

    public boolean hasNestedInstrAttribValue()
    {
        return hasNestedInstrAttribValue;
    }


    private int nestedInstrAttribValueOffset;

    private int nestedInstrAttribValueLength;

    public int nestedInstrAttribValueLength()
    {
        if (!hasNestedInstrAttribValue)
        {
            throw new IllegalArgumentException("No value for optional field: NestedInstrAttribValue");
        }

        return nestedInstrAttribValueLength;
    }

    public String nestedInstrAttribValueAsString()
    {
        return hasNestedInstrAttribValue ? new String(nestedInstrAttribValue, 0, nestedInstrAttribValueLength) : null;
    }

    public void nestedInstrAttribValue(final AsciiSequenceView view)
    {
        if (!hasNestedInstrAttribValue)
        {
            throw new IllegalArgumentException("No value for optional field: NestedInstrAttribValue");
        }

        view.wrap(buffer, nestedInstrAttribValueOffset, nestedInstrAttribValueLength);
    }


    private final CharArrayWrapper nestedInstrAttribValueWrapper = new CharArrayWrapper();
    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode NestedInstrAttribGroup
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
                    next = new NestedInstrAttribGroupDecoder(trailer, messageFields);
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
            case Constants.NESTED_INSTR_ATTRIB_TYPE:
                hasNestedInstrAttribType = true;
                nestedInstrAttribType = getInt(buffer, valueOffset, endOfField, 1210, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.NESTED_INSTR_ATTRIB_VALUE:
                hasNestedInstrAttribValue = true;
                nestedInstrAttribValue = buffer.getChars(nestedInstrAttribValue, valueOffset, valueLength);
                nestedInstrAttribValueOffset = valueOffset;
                nestedInstrAttribValueLength = valueLength;
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
        this.resetNestedInstrAttribType();
        this.resetNestedInstrAttribValue();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetNestedInstrAttribType()
    {
        hasNestedInstrAttribType = false;
    }

    public void resetNestedInstrAttribValue()
    {
        hasNestedInstrAttribValue = false;
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
        builder.append("\"MessageName\": \"NestedInstrAttribGroup\",\n");
        if (hasNestedInstrAttribType())
        {
            indent(builder, level);
            builder.append("\"NestedInstrAttribType\": \"");
            builder.append(nestedInstrAttribType);
            builder.append("\",\n");
        }

        if (hasNestedInstrAttribValue())
        {
            indent(builder, level);
            builder.append("\"NestedInstrAttribValue\": \"");
            builder.append(this.nestedInstrAttribValue(), 0, nestedInstrAttribValueLength());
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public NestedInstrumentAttributeEncoder.NestedInstrAttribGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((NestedInstrumentAttributeEncoder.NestedInstrAttribGroupEncoder)encoder);
    }

    public NestedInstrumentAttributeEncoder.NestedInstrAttribGroupEncoder toEncoder(final NestedInstrumentAttributeEncoder.NestedInstrAttribGroupEncoder encoder)
    {
        encoder.reset();
        if (hasNestedInstrAttribType())
        {
            encoder.nestedInstrAttribType(this.nestedInstrAttribType());
        }

        if (hasNestedInstrAttribValue())
        {
            encoder.nestedInstrAttribValue(this.nestedInstrAttribValue(), 0, nestedInstrAttribValueLength());
        }
        return encoder;
    }

}
    public class NestedInstrAttribGroupIterator implements Iterable<NestedInstrAttribGroupDecoder>, java.util.Iterator<NestedInstrAttribGroupDecoder>
    {
        private final NestedInstrumentAttributeDecoder parent;
        private int remainder;
        private NestedInstrAttribGroupDecoder current;

        public NestedInstrAttribGroupIterator(final NestedInstrumentAttributeDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }

        public NestedInstrAttribGroupDecoder next()
        {
            remainder--;
            final NestedInstrAttribGroupDecoder value = current;
            current = current.next();
            return value;
        }

        public int numberFieldValue()
        {
            return parent.hasNoNestedInstrAttribGroupCounter() ? parent.noNestedInstrAttribGroupCounter() : 0;
        }

        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.nestedInstrAttribGroup();
        }

        public NestedInstrAttribGroupIterator iterator()
        {
            reset();
            return this;
        }

    }

    public NestedInstrAttribGroupIterator nestedInstrAttribGroupIterator();
    public int noNestedInstrAttribGroupCounter();
    public boolean hasNoNestedInstrAttribGroupCounter();
    public NestedInstrAttribGroupDecoder nestedInstrAttribGroup();

}
