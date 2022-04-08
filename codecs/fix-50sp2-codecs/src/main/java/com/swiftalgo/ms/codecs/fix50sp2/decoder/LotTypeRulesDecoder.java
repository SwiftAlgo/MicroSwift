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
import com.swiftalgo.ms.codecs.fix50sp2.builder.LotTypeRulesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.LotTypeRulesEncoder.LotTypeRulesGroupEncoder;

public interface LotTypeRulesDecoder 
{



public class LotTypeRulesGroupDecoder extends CommonDecoderImpl
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
            ALL_GROUP_FIELDS.add(Constants.LOT_TYPE);
            ALL_GROUP_FIELDS.add(Constants.MIN_LOT_SIZE);
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
        if (hasLotType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !LotType.isValid(lotType()))
        {
            invalidTagId = 1093;
            rejectReason = 5;
            return false;
        }
        }
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public LotTypeRulesGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private LotTypeRulesGroupDecoder next = null;

    public LotTypeRulesGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(4);

    private char lotType = MISSING_CHAR;

    private boolean hasLotType;

    public char lotType()
    {
        if (!hasLotType)
        {
            throw new IllegalArgumentException("No value for optional field: LotType");
        }

        return lotType;
    }

    public boolean hasLotType()
    {
        return hasLotType;
    }



    private final CharArrayWrapper lotTypeWrapper = new CharArrayWrapper();
    public LotType lotTypeAsEnum()
    {
        if (!hasLotType)
 return LotType.NULL_VAL;
        return LotType.decode(lotType);
    }

    private DecimalFloat minLotSize = DecimalFloat.newNaNValue();

    private boolean hasMinLotSize;

    public DecimalFloat minLotSize()
    {
        if (!hasMinLotSize)
        {
            throw new IllegalArgumentException("No value for optional field: MinLotSize");
        }

        return minLotSize;
    }

    public boolean hasMinLotSize()
    {
        return hasMinLotSize;
    }



    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode LotTypeRulesGroup
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
                    next = new LotTypeRulesGroupDecoder(trailer, messageFields);
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
            case Constants.LOT_TYPE:
                hasLotType = true;
                lotType = buffer.getChar(valueOffset);
                break;

            case Constants.MIN_LOT_SIZE:
                hasMinLotSize = true;
                minLotSize = getFloat(buffer, minLotSize, valueOffset, valueLength, 1231, CODEC_VALIDATION_ENABLED);
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
        this.resetLotType();
        this.resetMinLotSize();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetLotType()
    {
        hasLotType = false;
    }

    public void resetMinLotSize()
    {
        hasMinLotSize = false;
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
        builder.append("\"MessageName\": \"LotTypeRulesGroup\",\n");
        if (hasLotType())
        {
            indent(builder, level);
            builder.append("\"LotType\": \"");
            builder.append(lotType);
            builder.append("\",\n");
        }

        if (hasMinLotSize())
        {
            indent(builder, level);
            builder.append("\"MinLotSize\": \"");
            minLotSize.appendTo(builder);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public LotTypeRulesEncoder.LotTypeRulesGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((LotTypeRulesEncoder.LotTypeRulesGroupEncoder)encoder);
    }

    public LotTypeRulesEncoder.LotTypeRulesGroupEncoder toEncoder(final LotTypeRulesEncoder.LotTypeRulesGroupEncoder encoder)
    {
        encoder.reset();
        if (hasLotType())
        {
            encoder.lotType(this.lotType());
        }

        if (hasMinLotSize())
        {
            encoder.minLotSize(this.minLotSize());
        }
        return encoder;
    }

}
    public class LotTypeRulesGroupIterator implements Iterable<LotTypeRulesGroupDecoder>, java.util.Iterator<LotTypeRulesGroupDecoder>
    {
        private final LotTypeRulesDecoder parent;
        private int remainder;
        private LotTypeRulesGroupDecoder current;

        public LotTypeRulesGroupIterator(final LotTypeRulesDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }

        public LotTypeRulesGroupDecoder next()
        {
            remainder--;
            final LotTypeRulesGroupDecoder value = current;
            current = current.next();
            return value;
        }

        public int numberFieldValue()
        {
            return parent.hasNoLotTypeRulesGroupCounter() ? parent.noLotTypeRulesGroupCounter() : 0;
        }

        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.lotTypeRulesGroup();
        }

        public LotTypeRulesGroupIterator iterator()
        {
            reset();
            return this;
        }

    }

    public LotTypeRulesGroupIterator lotTypeRulesGroupIterator();
    public int noLotTypeRulesGroupCounter();
    public boolean hasNoLotTypeRulesGroupCounter();
    public LotTypeRulesGroupDecoder lotTypeRulesGroup();

}
