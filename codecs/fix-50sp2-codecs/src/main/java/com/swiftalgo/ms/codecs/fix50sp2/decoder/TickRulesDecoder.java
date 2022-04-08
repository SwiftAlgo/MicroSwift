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
import com.swiftalgo.ms.codecs.fix50sp2.builder.TickRulesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.TickRulesEncoder.TickRulesGroupEncoder;

public interface TickRulesDecoder 
{



public class TickRulesGroupDecoder extends CommonDecoderImpl
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(0);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
        }
    }

    public final IntHashSet ALL_GROUP_FIELDS = new IntHashSet(8);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            ALL_GROUP_FIELDS.add(Constants.START_TICK_PRICE_RANGE);
            ALL_GROUP_FIELDS.add(Constants.END_TICK_PRICE_RANGE);
            ALL_GROUP_FIELDS.add(Constants.TICK_INCREMENT);
            ALL_GROUP_FIELDS.add(Constants.TICK_RULE_TYPE);
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
        if (hasTickRuleType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !TickRuleType.isValid(tickRuleType()))
        {
            invalidTagId = 1209;
            rejectReason = 5;
            return false;
        }
        }
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public TickRulesGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private TickRulesGroupDecoder next = null;

    public TickRulesGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(8);

    private DecimalFloat startTickPriceRange = DecimalFloat.newNaNValue();

    private boolean hasStartTickPriceRange;

    public DecimalFloat startTickPriceRange()
    {
        if (!hasStartTickPriceRange)
        {
            throw new IllegalArgumentException("No value for optional field: StartTickPriceRange");
        }

        return startTickPriceRange;
    }

    public boolean hasStartTickPriceRange()
    {
        return hasStartTickPriceRange;
    }



    private DecimalFloat endTickPriceRange = DecimalFloat.newNaNValue();

    private boolean hasEndTickPriceRange;

    public DecimalFloat endTickPriceRange()
    {
        if (!hasEndTickPriceRange)
        {
            throw new IllegalArgumentException("No value for optional field: EndTickPriceRange");
        }

        return endTickPriceRange;
    }

    public boolean hasEndTickPriceRange()
    {
        return hasEndTickPriceRange;
    }



    private DecimalFloat tickIncrement = DecimalFloat.newNaNValue();

    private boolean hasTickIncrement;

    public DecimalFloat tickIncrement()
    {
        if (!hasTickIncrement)
        {
            throw new IllegalArgumentException("No value for optional field: TickIncrement");
        }

        return tickIncrement;
    }

    public boolean hasTickIncrement()
    {
        return hasTickIncrement;
    }



    private int tickRuleType = MISSING_INT;

    private boolean hasTickRuleType;

    public int tickRuleType()
    {
        if (!hasTickRuleType)
        {
            throw new IllegalArgumentException("No value for optional field: TickRuleType");
        }

        return tickRuleType;
    }

    public boolean hasTickRuleType()
    {
        return hasTickRuleType;
    }



    private final CharArrayWrapper tickRuleTypeWrapper = new CharArrayWrapper();
    public TickRuleType tickRuleTypeAsEnum()
    {
        if (!hasTickRuleType)
 return TickRuleType.NULL_VAL;
        return TickRuleType.decode(tickRuleType);
    }

    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode TickRulesGroup
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
                    next = new TickRulesGroupDecoder(trailer, messageFields);
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
            case Constants.START_TICK_PRICE_RANGE:
                hasStartTickPriceRange = true;
                startTickPriceRange = getFloat(buffer, startTickPriceRange, valueOffset, valueLength, 1206, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.END_TICK_PRICE_RANGE:
                hasEndTickPriceRange = true;
                endTickPriceRange = getFloat(buffer, endTickPriceRange, valueOffset, valueLength, 1207, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.TICK_INCREMENT:
                hasTickIncrement = true;
                tickIncrement = getFloat(buffer, tickIncrement, valueOffset, valueLength, 1208, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.TICK_RULE_TYPE:
                hasTickRuleType = true;
                tickRuleType = getInt(buffer, valueOffset, endOfField, 1209, CODEC_VALIDATION_ENABLED);
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
        this.resetStartTickPriceRange();
        this.resetEndTickPriceRange();
        this.resetTickIncrement();
        this.resetTickRuleType();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetStartTickPriceRange()
    {
        hasStartTickPriceRange = false;
    }

    public void resetEndTickPriceRange()
    {
        hasEndTickPriceRange = false;
    }

    public void resetTickIncrement()
    {
        hasTickIncrement = false;
    }

    public void resetTickRuleType()
    {
        hasTickRuleType = false;
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
        builder.append("\"MessageName\": \"TickRulesGroup\",\n");
        if (hasStartTickPriceRange())
        {
            indent(builder, level);
            builder.append("\"StartTickPriceRange\": \"");
            startTickPriceRange.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasEndTickPriceRange())
        {
            indent(builder, level);
            builder.append("\"EndTickPriceRange\": \"");
            endTickPriceRange.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasTickIncrement())
        {
            indent(builder, level);
            builder.append("\"TickIncrement\": \"");
            tickIncrement.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasTickRuleType())
        {
            indent(builder, level);
            builder.append("\"TickRuleType\": \"");
            builder.append(tickRuleType);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public TickRulesEncoder.TickRulesGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((TickRulesEncoder.TickRulesGroupEncoder)encoder);
    }

    public TickRulesEncoder.TickRulesGroupEncoder toEncoder(final TickRulesEncoder.TickRulesGroupEncoder encoder)
    {
        encoder.reset();
        if (hasStartTickPriceRange())
        {
            encoder.startTickPriceRange(this.startTickPriceRange());
        }

        if (hasEndTickPriceRange())
        {
            encoder.endTickPriceRange(this.endTickPriceRange());
        }

        if (hasTickIncrement())
        {
            encoder.tickIncrement(this.tickIncrement());
        }

        if (hasTickRuleType())
        {
            encoder.tickRuleType(this.tickRuleType());
        }
        return encoder;
    }

}
    public class TickRulesGroupIterator implements Iterable<TickRulesGroupDecoder>, java.util.Iterator<TickRulesGroupDecoder>
    {
        private final TickRulesDecoder parent;
        private int remainder;
        private TickRulesGroupDecoder current;

        public TickRulesGroupIterator(final TickRulesDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }

        public TickRulesGroupDecoder next()
        {
            remainder--;
            final TickRulesGroupDecoder value = current;
            current = current.next();
            return value;
        }

        public int numberFieldValue()
        {
            return parent.hasNoTickRulesGroupCounter() ? parent.noTickRulesGroupCounter() : 0;
        }

        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.tickRulesGroup();
        }

        public TickRulesGroupIterator iterator()
        {
            reset();
            return this;
        }

    }

    public TickRulesGroupIterator tickRulesGroupIterator();
    public int noTickRulesGroupCounter();
    public boolean hasNoTickRulesGroupCounter();
    public TickRulesGroupDecoder tickRulesGroup();

}
