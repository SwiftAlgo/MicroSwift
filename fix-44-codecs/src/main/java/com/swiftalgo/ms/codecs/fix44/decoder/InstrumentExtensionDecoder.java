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
import com.swiftalgo.ms.codecs.fix44.builder.InstrumentExtensionEncoder;
import static com.swiftalgo.ms.codecs.fix44.builder.InstrumentExtensionEncoder.InstrAttribGroupEncoder;

public interface InstrumentExtensionDecoder 
{

    public int deliveryForm();
    public boolean hasDeliveryForm();
    public DeliveryForm deliveryFormAsEnum();
    public DecimalFloat pctAtRisk();
    public boolean hasPctAtRisk();


public class InstrAttribGroupDecoder extends CommonDecoderImpl
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
            ALL_GROUP_FIELDS.add(Constants.INSTR_ATTRIB_TYPE);
            ALL_GROUP_FIELDS.add(Constants.INSTR_ATTRIB_VALUE);
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
        if (hasInstrAttribType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !InstrAttribType.isValid(instrAttribType()))
        {
            invalidTagId = 871;
            rejectReason = 5;
            return false;
        }
        }
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public InstrAttribGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private InstrAttribGroupDecoder next = null;

    public InstrAttribGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(4);

    private int instrAttribType = MISSING_INT;

    private boolean hasInstrAttribType;

    public int instrAttribType()
    {
        if (!hasInstrAttribType)
        {
            throw new IllegalArgumentException("No value for optional field: InstrAttribType");
        }

        return instrAttribType;
    }

    public boolean hasInstrAttribType()
    {
        return hasInstrAttribType;
    }



    private final CharArrayWrapper instrAttribTypeWrapper = new CharArrayWrapper();
    public InstrAttribType instrAttribTypeAsEnum()
    {
        if (!hasInstrAttribType)
 return InstrAttribType.NULL_VAL;
        return InstrAttribType.decode(instrAttribType);
    }

    private char[] instrAttribValue = new char[1];

    private boolean hasInstrAttribValue;

    public char[] instrAttribValue()
    {
        if (!hasInstrAttribValue)
        {
            throw new IllegalArgumentException("No value for optional field: InstrAttribValue");
        }

        return instrAttribValue;
    }

    public boolean hasInstrAttribValue()
    {
        return hasInstrAttribValue;
    }


    private int instrAttribValueOffset;

    private int instrAttribValueLength;

    public int instrAttribValueLength()
    {
        if (!hasInstrAttribValue)
        {
            throw new IllegalArgumentException("No value for optional field: InstrAttribValue");
        }

        return instrAttribValueLength;
    }

    public String instrAttribValueAsString()
    {
        return hasInstrAttribValue ? new String(instrAttribValue, 0, instrAttribValueLength) : null;
    }

    public void instrAttribValue(final AsciiSequenceView view)
    {
        if (!hasInstrAttribValue)
        {
            throw new IllegalArgumentException("No value for optional field: InstrAttribValue");
        }

        view.wrap(buffer, instrAttribValueOffset, instrAttribValueLength);
    }


    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode InstrAttribGroup
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
                    next = new InstrAttribGroupDecoder(trailer, messageFields);
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
            case Constants.INSTR_ATTRIB_TYPE:
                hasInstrAttribType = true;
                instrAttribType = getInt(buffer, valueOffset, endOfField, 871, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.INSTR_ATTRIB_VALUE:
                hasInstrAttribValue = true;
                instrAttribValue = buffer.getChars(instrAttribValue, valueOffset, valueLength);
                instrAttribValueOffset = valueOffset;
                instrAttribValueLength = valueLength;
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
        this.resetInstrAttribType();
        this.resetInstrAttribValue();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetInstrAttribType()
    {
        hasInstrAttribType = false;
    }

    public void resetInstrAttribValue()
    {
        hasInstrAttribValue = false;
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
        builder.append("\"MessageName\": \"InstrAttribGroup\",\n");
        if (hasInstrAttribType())
        {
            indent(builder, level);
            builder.append("\"InstrAttribType\": \"");
            builder.append(instrAttribType);
            builder.append("\",\n");
        }

        if (hasInstrAttribValue())
        {
            indent(builder, level);
            builder.append("\"InstrAttribValue\": \"");
            builder.append(this.instrAttribValue(), 0, instrAttribValueLength());
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public InstrAttribGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((InstrAttribGroupEncoder)encoder);
    }

    public InstrAttribGroupEncoder toEncoder(final InstrAttribGroupEncoder encoder)
    {
        encoder.reset();
        if (hasInstrAttribType())
        {
            encoder.instrAttribType(this.instrAttribType());
        }

        if (hasInstrAttribValue())
        {
            encoder.instrAttribValue(this.instrAttribValue(), 0, instrAttribValueLength());
        }
        return encoder;
    }

}
    public class InstrAttribGroupIterator implements Iterable<InstrAttribGroupDecoder>, java.util.Iterator<InstrAttribGroupDecoder>
    {
        private final InstrumentExtensionDecoder parent;
        private int remainder;
        private InstrAttribGroupDecoder current;

        public InstrAttribGroupIterator(final InstrumentExtensionDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }
        public InstrAttribGroupDecoder next()
        {
            remainder--;
            final InstrAttribGroupDecoder value = current;
            current = current.next();
            return value;
        }
        public int numberFieldValue()
        {
            return parent.hasNoInstrAttribGroupCounter() ? parent.noInstrAttribGroupCounter() : 0;
        }
        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.instrAttribGroup();
        }
        public InstrAttribGroupIterator iterator()
        {
            reset();
            return this;
        }
    }

public InstrAttribGroupIterator instrAttribGroupIterator();
    public int noInstrAttribGroupCounter();
    public boolean hasNoInstrAttribGroupCounter();
    public InstrAttribGroupDecoder instrAttribGroup();

}
