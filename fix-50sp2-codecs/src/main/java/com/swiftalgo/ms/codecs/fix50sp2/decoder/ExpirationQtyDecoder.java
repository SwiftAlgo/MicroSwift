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
import com.swiftalgo.ms.codecs.fix50sp2.builder.ExpirationQtyEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.ExpirationQtyEncoder.ExpirationGroupEncoder;

public interface ExpirationQtyDecoder 
{



public class ExpirationGroupDecoder extends CommonDecoderImpl
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
            ALL_GROUP_FIELDS.add(Constants.EXPIRATION_QTY_TYPE);
            ALL_GROUP_FIELDS.add(Constants.EXP_QTY);
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
        if (hasExpirationQtyType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !ExpirationQtyType.isValid(expirationQtyType()))
        {
            invalidTagId = 982;
            rejectReason = 5;
            return false;
        }
        }
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public ExpirationGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private ExpirationGroupDecoder next = null;

    public ExpirationGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(4);

    private int expirationQtyType = MISSING_INT;

    private boolean hasExpirationQtyType;

    public int expirationQtyType()
    {
        if (!hasExpirationQtyType)
        {
            throw new IllegalArgumentException("No value for optional field: ExpirationQtyType");
        }

        return expirationQtyType;
    }

    public boolean hasExpirationQtyType()
    {
        return hasExpirationQtyType;
    }



    private final CharArrayWrapper expirationQtyTypeWrapper = new CharArrayWrapper();
    public ExpirationQtyType expirationQtyTypeAsEnum()
    {
        if (!hasExpirationQtyType)
 return ExpirationQtyType.NULL_VAL;
        return ExpirationQtyType.decode(expirationQtyType);
    }

    private DecimalFloat expQty = DecimalFloat.newNaNValue();

    private boolean hasExpQty;

    public DecimalFloat expQty()
    {
        if (!hasExpQty)
        {
            throw new IllegalArgumentException("No value for optional field: ExpQty");
        }

        return expQty;
    }

    public boolean hasExpQty()
    {
        return hasExpQty;
    }



    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode ExpirationGroup
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
                    next = new ExpirationGroupDecoder(trailer, messageFields);
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
            case Constants.EXPIRATION_QTY_TYPE:
                hasExpirationQtyType = true;
                expirationQtyType = getInt(buffer, valueOffset, endOfField, 982, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.EXP_QTY:
                hasExpQty = true;
                expQty = getFloat(buffer, expQty, valueOffset, valueLength, 983, CODEC_VALIDATION_ENABLED);
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
        this.resetExpirationQtyType();
        this.resetExpQty();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetExpirationQtyType()
    {
        hasExpirationQtyType = false;
    }

    public void resetExpQty()
    {
        hasExpQty = false;
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
        builder.append("\"MessageName\": \"ExpirationGroup\",\n");
        if (hasExpirationQtyType())
        {
            indent(builder, level);
            builder.append("\"ExpirationQtyType\": \"");
            builder.append(expirationQtyType);
            builder.append("\",\n");
        }

        if (hasExpQty())
        {
            indent(builder, level);
            builder.append("\"ExpQty\": \"");
            expQty.appendTo(builder);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public ExpirationGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((ExpirationGroupEncoder)encoder);
    }

    public ExpirationGroupEncoder toEncoder(final ExpirationGroupEncoder encoder)
    {
        encoder.reset();
        if (hasExpirationQtyType())
        {
            encoder.expirationQtyType(this.expirationQtyType());
        }

        if (hasExpQty())
        {
            encoder.expQty(this.expQty());
        }
        return encoder;
    }

}
    public class ExpirationGroupIterator implements Iterable<ExpirationGroupDecoder>, java.util.Iterator<ExpirationGroupDecoder>
    {
        private final ExpirationQtyDecoder parent;
        private int remainder;
        private ExpirationGroupDecoder current;

        public ExpirationGroupIterator(final ExpirationQtyDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }
        public ExpirationGroupDecoder next()
        {
            remainder--;
            final ExpirationGroupDecoder value = current;
            current = current.next();
            return value;
        }
        public int numberFieldValue()
        {
            return parent.hasNoExpirationGroupCounter() ? parent.noExpirationGroupCounter() : 0;
        }
        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.expirationGroup();
        }
        public ExpirationGroupIterator iterator()
        {
            reset();
            return this;
        }
    }

public ExpirationGroupIterator expirationGroupIterator();
    public int noExpirationGroupCounter();
    public boolean hasNoExpirationGroupCounter();
    public ExpirationGroupDecoder expirationGroup();

}
