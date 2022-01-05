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
import com.swiftalgo.ms.codecs.fix50sp2.builder.DerivativeInstrumentAttributeEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.DerivativeInstrumentAttributeEncoder.DerivativeInstrAttribGroupEncoder;

public interface DerivativeInstrumentAttributeDecoder 
{



public class DerivativeInstrAttribGroupDecoder extends CommonDecoderImpl
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
            ALL_GROUP_FIELDS.add(Constants.DERIVATIVE_INSTR_ATTRIB_TYPE);
            ALL_GROUP_FIELDS.add(Constants.DERIVATIVE_INSTR_ATTRIB_VALUE);
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
    public DerivativeInstrAttribGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private DerivativeInstrAttribGroupDecoder next = null;

    public DerivativeInstrAttribGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(4);

    private int derivativeInstrAttribType = MISSING_INT;

    private boolean hasDerivativeInstrAttribType;

    public int derivativeInstrAttribType()
    {
        if (!hasDerivativeInstrAttribType)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeInstrAttribType");
        }

        return derivativeInstrAttribType;
    }

    public boolean hasDerivativeInstrAttribType()
    {
        return hasDerivativeInstrAttribType;
    }



    private char[] derivativeInstrAttribValue = new char[1];

    private boolean hasDerivativeInstrAttribValue;

    public char[] derivativeInstrAttribValue()
    {
        if (!hasDerivativeInstrAttribValue)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeInstrAttribValue");
        }

        return derivativeInstrAttribValue;
    }

    public boolean hasDerivativeInstrAttribValue()
    {
        return hasDerivativeInstrAttribValue;
    }


    private int derivativeInstrAttribValueOffset;

    private int derivativeInstrAttribValueLength;

    public int derivativeInstrAttribValueLength()
    {
        if (!hasDerivativeInstrAttribValue)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeInstrAttribValue");
        }

        return derivativeInstrAttribValueLength;
    }

    public String derivativeInstrAttribValueAsString()
    {
        return hasDerivativeInstrAttribValue ? new String(derivativeInstrAttribValue, 0, derivativeInstrAttribValueLength) : null;
    }

    public void derivativeInstrAttribValue(final AsciiSequenceView view)
    {
        if (!hasDerivativeInstrAttribValue)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeInstrAttribValue");
        }

        view.wrap(buffer, derivativeInstrAttribValueOffset, derivativeInstrAttribValueLength);
    }


    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode DerivativeInstrAttribGroup
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
                    next = new DerivativeInstrAttribGroupDecoder(trailer, messageFields);
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
            case Constants.DERIVATIVE_INSTR_ATTRIB_TYPE:
                hasDerivativeInstrAttribType = true;
                derivativeInstrAttribType = getInt(buffer, valueOffset, endOfField, 1313, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.DERIVATIVE_INSTR_ATTRIB_VALUE:
                hasDerivativeInstrAttribValue = true;
                derivativeInstrAttribValue = buffer.getChars(derivativeInstrAttribValue, valueOffset, valueLength);
                derivativeInstrAttribValueOffset = valueOffset;
                derivativeInstrAttribValueLength = valueLength;
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
        this.resetDerivativeInstrAttribType();
        this.resetDerivativeInstrAttribValue();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetDerivativeInstrAttribType()
    {
        hasDerivativeInstrAttribType = false;
    }

    public void resetDerivativeInstrAttribValue()
    {
        hasDerivativeInstrAttribValue = false;
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
        builder.append("\"MessageName\": \"DerivativeInstrAttribGroup\",\n");
        if (hasDerivativeInstrAttribType())
        {
            indent(builder, level);
            builder.append("\"DerivativeInstrAttribType\": \"");
            builder.append(derivativeInstrAttribType);
            builder.append("\",\n");
        }

        if (hasDerivativeInstrAttribValue())
        {
            indent(builder, level);
            builder.append("\"DerivativeInstrAttribValue\": \"");
            builder.append(this.derivativeInstrAttribValue(), 0, derivativeInstrAttribValueLength());
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public DerivativeInstrAttribGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((DerivativeInstrAttribGroupEncoder)encoder);
    }

    public DerivativeInstrAttribGroupEncoder toEncoder(final DerivativeInstrAttribGroupEncoder encoder)
    {
        encoder.reset();
        if (hasDerivativeInstrAttribType())
        {
            encoder.derivativeInstrAttribType(this.derivativeInstrAttribType());
        }

        if (hasDerivativeInstrAttribValue())
        {
            encoder.derivativeInstrAttribValue(this.derivativeInstrAttribValue(), 0, derivativeInstrAttribValueLength());
        }
        return encoder;
    }

}
    public class DerivativeInstrAttribGroupIterator implements Iterable<DerivativeInstrAttribGroupDecoder>, java.util.Iterator<DerivativeInstrAttribGroupDecoder>
    {
        private final DerivativeInstrumentAttributeDecoder parent;
        private int remainder;
        private DerivativeInstrAttribGroupDecoder current;

        public DerivativeInstrAttribGroupIterator(final DerivativeInstrumentAttributeDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }
        public DerivativeInstrAttribGroupDecoder next()
        {
            remainder--;
            final DerivativeInstrAttribGroupDecoder value = current;
            current = current.next();
            return value;
        }
        public int numberFieldValue()
        {
            return parent.hasNoDerivativeInstrAttribGroupCounter() ? parent.noDerivativeInstrAttribGroupCounter() : 0;
        }
        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.derivativeInstrAttribGroup();
        }
        public DerivativeInstrAttribGroupIterator iterator()
        {
            reset();
            return this;
        }
    }

public DerivativeInstrAttribGroupIterator derivativeInstrAttribGroupIterator();
    public int noDerivativeInstrAttribGroupCounter();
    public boolean hasNoDerivativeInstrAttribGroupCounter();
    public DerivativeInstrAttribGroupDecoder derivativeInstrAttribGroup();

}
