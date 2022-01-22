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
import com.swiftalgo.ms.codecs.fix50sp2.builder.SecSizesGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.SecSizesGrpEncoder.OfSecSizesGroupEncoder;

public interface SecSizesGrpDecoder 
{



public class OfSecSizesGroupDecoder extends CommonDecoderImpl
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
            ALL_GROUP_FIELDS.add(Constants.M_D_SEC_SIZE_TYPE);
            ALL_GROUP_FIELDS.add(Constants.M_D_SEC_SIZE);
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
        if (hasMDSecSizeType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !MDSecSizeType.isValid(mDSecSizeType()))
        {
            invalidTagId = 1178;
            rejectReason = 5;
            return false;
        }
        }
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public OfSecSizesGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private OfSecSizesGroupDecoder next = null;

    public OfSecSizesGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(4);

    private int mDSecSizeType = MISSING_INT;

    private boolean hasMDSecSizeType;

    public int mDSecSizeType()
    {
        if (!hasMDSecSizeType)
        {
            throw new IllegalArgumentException("No value for optional field: MDSecSizeType");
        }

        return mDSecSizeType;
    }

    public boolean hasMDSecSizeType()
    {
        return hasMDSecSizeType;
    }



    private final CharArrayWrapper mDSecSizeTypeWrapper = new CharArrayWrapper();
    public MDSecSizeType mDSecSizeTypeAsEnum()
    {
        if (!hasMDSecSizeType)
 return MDSecSizeType.NULL_VAL;
        return MDSecSizeType.decode(mDSecSizeType);
    }

    private DecimalFloat mDSecSize = DecimalFloat.newNaNValue();

    private boolean hasMDSecSize;

    public DecimalFloat mDSecSize()
    {
        if (!hasMDSecSize)
        {
            throw new IllegalArgumentException("No value for optional field: MDSecSize");
        }

        return mDSecSize;
    }

    public boolean hasMDSecSize()
    {
        return hasMDSecSize;
    }



    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode OfSecSizesGroup
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
                    next = new OfSecSizesGroupDecoder(trailer, messageFields);
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
            case Constants.M_D_SEC_SIZE_TYPE:
                hasMDSecSizeType = true;
                mDSecSizeType = getInt(buffer, valueOffset, endOfField, 1178, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.M_D_SEC_SIZE:
                hasMDSecSize = true;
                mDSecSize = getFloat(buffer, mDSecSize, valueOffset, valueLength, 1179, CODEC_VALIDATION_ENABLED);
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
        this.resetMDSecSizeType();
        this.resetMDSecSize();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetMDSecSizeType()
    {
        hasMDSecSizeType = false;
    }

    public void resetMDSecSize()
    {
        hasMDSecSize = false;
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
        builder.append("\"MessageName\": \"OfSecSizesGroup\",\n");
        if (hasMDSecSizeType())
        {
            indent(builder, level);
            builder.append("\"MDSecSizeType\": \"");
            builder.append(mDSecSizeType);
            builder.append("\",\n");
        }

        if (hasMDSecSize())
        {
            indent(builder, level);
            builder.append("\"MDSecSize\": \"");
            mDSecSize.appendTo(builder);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public SecSizesGrpEncoder.OfSecSizesGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((SecSizesGrpEncoder.OfSecSizesGroupEncoder)encoder);
    }

    public SecSizesGrpEncoder.OfSecSizesGroupEncoder toEncoder(final SecSizesGrpEncoder.OfSecSizesGroupEncoder encoder)
    {
        encoder.reset();
        if (hasMDSecSizeType())
        {
            encoder.mDSecSizeType(this.mDSecSizeType());
        }

        if (hasMDSecSize())
        {
            encoder.mDSecSize(this.mDSecSize());
        }
        return encoder;
    }

}
    public class OfSecSizesGroupIterator implements Iterable<OfSecSizesGroupDecoder>, java.util.Iterator<OfSecSizesGroupDecoder>
    {
        private final SecSizesGrpDecoder parent;
        private int remainder;
        private OfSecSizesGroupDecoder current;

        public OfSecSizesGroupIterator(final SecSizesGrpDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }

        public OfSecSizesGroupDecoder next()
        {
            remainder--;
            final OfSecSizesGroupDecoder value = current;
            current = current.next();
            return value;
        }

        public int numberFieldValue()
        {
            return parent.hasNoOfSecSizesGroupCounter() ? parent.noOfSecSizesGroupCounter() : 0;
        }

        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.ofSecSizesGroup();
        }

        public OfSecSizesGroupIterator iterator()
        {
            reset();
            return this;
        }

    }

    public OfSecSizesGroupIterator ofSecSizesGroupIterator();
    public int noOfSecSizesGroupCounter();
    public boolean hasNoOfSecSizesGroupCounter();
    public OfSecSizesGroupDecoder ofSecSizesGroup();

}
