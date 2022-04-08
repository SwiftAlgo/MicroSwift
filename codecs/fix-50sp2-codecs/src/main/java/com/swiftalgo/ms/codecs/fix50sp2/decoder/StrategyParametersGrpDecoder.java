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
import com.swiftalgo.ms.codecs.fix50sp2.builder.StrategyParametersGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.StrategyParametersGrpEncoder.StrategyParametersGroupEncoder;

public interface StrategyParametersGrpDecoder 
{



public class StrategyParametersGroupDecoder extends CommonDecoderImpl
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(0);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
        }
    }

    public final IntHashSet ALL_GROUP_FIELDS = new IntHashSet(6);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            ALL_GROUP_FIELDS.add(Constants.STRATEGY_PARAMETER_NAME);
            ALL_GROUP_FIELDS.add(Constants.STRATEGY_PARAMETER_TYPE);
            ALL_GROUP_FIELDS.add(Constants.STRATEGY_PARAMETER_VALUE);
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
        if (hasStrategyParameterType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !StrategyParameterType.isValid(strategyParameterType()))
        {
            invalidTagId = 959;
            rejectReason = 5;
            return false;
        }
        }
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public StrategyParametersGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private StrategyParametersGroupDecoder next = null;

    public StrategyParametersGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(6);

    private char[] strategyParameterName = new char[1];

    private boolean hasStrategyParameterName;

    public char[] strategyParameterName()
    {
        if (!hasStrategyParameterName)
        {
            throw new IllegalArgumentException("No value for optional field: StrategyParameterName");
        }

        return strategyParameterName;
    }

    public boolean hasStrategyParameterName()
    {
        return hasStrategyParameterName;
    }


    private int strategyParameterNameOffset;

    private int strategyParameterNameLength;

    public int strategyParameterNameLength()
    {
        if (!hasStrategyParameterName)
        {
            throw new IllegalArgumentException("No value for optional field: StrategyParameterName");
        }

        return strategyParameterNameLength;
    }

    public String strategyParameterNameAsString()
    {
        return hasStrategyParameterName ? new String(strategyParameterName, 0, strategyParameterNameLength) : null;
    }

    public void strategyParameterName(final AsciiSequenceView view)
    {
        if (!hasStrategyParameterName)
        {
            throw new IllegalArgumentException("No value for optional field: StrategyParameterName");
        }

        view.wrap(buffer, strategyParameterNameOffset, strategyParameterNameLength);
    }


    private final CharArrayWrapper strategyParameterNameWrapper = new CharArrayWrapper();
    private int strategyParameterType = MISSING_INT;

    private boolean hasStrategyParameterType;

    public int strategyParameterType()
    {
        if (!hasStrategyParameterType)
        {
            throw new IllegalArgumentException("No value for optional field: StrategyParameterType");
        }

        return strategyParameterType;
    }

    public boolean hasStrategyParameterType()
    {
        return hasStrategyParameterType;
    }



    private final CharArrayWrapper strategyParameterTypeWrapper = new CharArrayWrapper();
    public StrategyParameterType strategyParameterTypeAsEnum()
    {
        if (!hasStrategyParameterType)
 return StrategyParameterType.NULL_VAL;
        return StrategyParameterType.decode(strategyParameterType);
    }

    private char[] strategyParameterValue = new char[1];

    private boolean hasStrategyParameterValue;

    public char[] strategyParameterValue()
    {
        if (!hasStrategyParameterValue)
        {
            throw new IllegalArgumentException("No value for optional field: StrategyParameterValue");
        }

        return strategyParameterValue;
    }

    public boolean hasStrategyParameterValue()
    {
        return hasStrategyParameterValue;
    }


    private int strategyParameterValueOffset;

    private int strategyParameterValueLength;

    public int strategyParameterValueLength()
    {
        if (!hasStrategyParameterValue)
        {
            throw new IllegalArgumentException("No value for optional field: StrategyParameterValue");
        }

        return strategyParameterValueLength;
    }

    public String strategyParameterValueAsString()
    {
        return hasStrategyParameterValue ? new String(strategyParameterValue, 0, strategyParameterValueLength) : null;
    }

    public void strategyParameterValue(final AsciiSequenceView view)
    {
        if (!hasStrategyParameterValue)
        {
            throw new IllegalArgumentException("No value for optional field: StrategyParameterValue");
        }

        view.wrap(buffer, strategyParameterValueOffset, strategyParameterValueLength);
    }


    private final CharArrayWrapper strategyParameterValueWrapper = new CharArrayWrapper();
    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode StrategyParametersGroup
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
                    next = new StrategyParametersGroupDecoder(trailer, messageFields);
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
            case Constants.STRATEGY_PARAMETER_NAME:
                hasStrategyParameterName = true;
                strategyParameterName = buffer.getChars(strategyParameterName, valueOffset, valueLength);
                strategyParameterNameOffset = valueOffset;
                strategyParameterNameLength = valueLength;
                break;

            case Constants.STRATEGY_PARAMETER_TYPE:
                hasStrategyParameterType = true;
                strategyParameterType = getInt(buffer, valueOffset, endOfField, 959, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.STRATEGY_PARAMETER_VALUE:
                hasStrategyParameterValue = true;
                strategyParameterValue = buffer.getChars(strategyParameterValue, valueOffset, valueLength);
                strategyParameterValueOffset = valueOffset;
                strategyParameterValueLength = valueLength;
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
        this.resetStrategyParameterName();
        this.resetStrategyParameterType();
        this.resetStrategyParameterValue();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetStrategyParameterName()
    {
        hasStrategyParameterName = false;
    }

    public void resetStrategyParameterType()
    {
        hasStrategyParameterType = false;
    }

    public void resetStrategyParameterValue()
    {
        hasStrategyParameterValue = false;
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
        builder.append("\"MessageName\": \"StrategyParametersGroup\",\n");
        if (hasStrategyParameterName())
        {
            indent(builder, level);
            builder.append("\"StrategyParameterName\": \"");
            builder.append(this.strategyParameterName(), 0, strategyParameterNameLength());
            builder.append("\",\n");
        }

        if (hasStrategyParameterType())
        {
            indent(builder, level);
            builder.append("\"StrategyParameterType\": \"");
            builder.append(strategyParameterType);
            builder.append("\",\n");
        }

        if (hasStrategyParameterValue())
        {
            indent(builder, level);
            builder.append("\"StrategyParameterValue\": \"");
            builder.append(this.strategyParameterValue(), 0, strategyParameterValueLength());
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public StrategyParametersGrpEncoder.StrategyParametersGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((StrategyParametersGrpEncoder.StrategyParametersGroupEncoder)encoder);
    }

    public StrategyParametersGrpEncoder.StrategyParametersGroupEncoder toEncoder(final StrategyParametersGrpEncoder.StrategyParametersGroupEncoder encoder)
    {
        encoder.reset();
        if (hasStrategyParameterName())
        {
            encoder.strategyParameterName(this.strategyParameterName(), 0, strategyParameterNameLength());
        }

        if (hasStrategyParameterType())
        {
            encoder.strategyParameterType(this.strategyParameterType());
        }

        if (hasStrategyParameterValue())
        {
            encoder.strategyParameterValue(this.strategyParameterValue(), 0, strategyParameterValueLength());
        }
        return encoder;
    }

}
    public class StrategyParametersGroupIterator implements Iterable<StrategyParametersGroupDecoder>, java.util.Iterator<StrategyParametersGroupDecoder>
    {
        private final StrategyParametersGrpDecoder parent;
        private int remainder;
        private StrategyParametersGroupDecoder current;

        public StrategyParametersGroupIterator(final StrategyParametersGrpDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }

        public StrategyParametersGroupDecoder next()
        {
            remainder--;
            final StrategyParametersGroupDecoder value = current;
            current = current.next();
            return value;
        }

        public int numberFieldValue()
        {
            return parent.hasNoStrategyParametersGroupCounter() ? parent.noStrategyParametersGroupCounter() : 0;
        }

        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.strategyParametersGroup();
        }

        public StrategyParametersGroupIterator iterator()
        {
            reset();
            return this;
        }

    }

    public StrategyParametersGroupIterator strategyParametersGroupIterator();
    public int noStrategyParametersGroupCounter();
    public boolean hasNoStrategyParametersGroupCounter();
    public StrategyParametersGroupDecoder strategyParametersGroup();

}
