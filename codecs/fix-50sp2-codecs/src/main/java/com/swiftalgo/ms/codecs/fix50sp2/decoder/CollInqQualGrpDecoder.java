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
import com.swiftalgo.ms.codecs.fix50sp2.builder.CollInqQualGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.CollInqQualGrpEncoder.CollInquiryQualifierGroupEncoder;

public interface CollInqQualGrpDecoder 
{



public class CollInquiryQualifierGroupDecoder extends CommonDecoderImpl
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(0);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
        }
    }

    public final IntHashSet ALL_GROUP_FIELDS = new IntHashSet(2);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            ALL_GROUP_FIELDS.add(Constants.COLL_INQUIRY_QUALIFIER);
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
        if (hasCollInquiryQualifier)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !CollInquiryQualifier.isValid(collInquiryQualifier()))
        {
            invalidTagId = 896;
            rejectReason = 5;
            return false;
        }
        }
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public CollInquiryQualifierGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private CollInquiryQualifierGroupDecoder next = null;

    public CollInquiryQualifierGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(2);

    private int collInquiryQualifier = MISSING_INT;

    private boolean hasCollInquiryQualifier;

    public int collInquiryQualifier()
    {
        if (!hasCollInquiryQualifier)
        {
            throw new IllegalArgumentException("No value for optional field: CollInquiryQualifier");
        }

        return collInquiryQualifier;
    }

    public boolean hasCollInquiryQualifier()
    {
        return hasCollInquiryQualifier;
    }



    private final CharArrayWrapper collInquiryQualifierWrapper = new CharArrayWrapper();
    public CollInquiryQualifier collInquiryQualifierAsEnum()
    {
        if (!hasCollInquiryQualifier)
 return CollInquiryQualifier.NULL_VAL;
        return CollInquiryQualifier.decode(collInquiryQualifier);
    }

    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode CollInquiryQualifierGroup
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
                    next = new CollInquiryQualifierGroupDecoder(trailer, messageFields);
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
            case Constants.COLL_INQUIRY_QUALIFIER:
                hasCollInquiryQualifier = true;
                collInquiryQualifier = getInt(buffer, valueOffset, endOfField, 896, CODEC_VALIDATION_ENABLED);
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
        this.resetCollInquiryQualifier();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetCollInquiryQualifier()
    {
        hasCollInquiryQualifier = false;
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
        builder.append("\"MessageName\": \"CollInquiryQualifierGroup\",\n");
        if (hasCollInquiryQualifier())
        {
            indent(builder, level);
            builder.append("\"CollInquiryQualifier\": \"");
            builder.append(collInquiryQualifier);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public CollInqQualGrpEncoder.CollInquiryQualifierGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((CollInqQualGrpEncoder.CollInquiryQualifierGroupEncoder)encoder);
    }

    public CollInqQualGrpEncoder.CollInquiryQualifierGroupEncoder toEncoder(final CollInqQualGrpEncoder.CollInquiryQualifierGroupEncoder encoder)
    {
        encoder.reset();
        if (hasCollInquiryQualifier())
        {
            encoder.collInquiryQualifier(this.collInquiryQualifier());
        }
        return encoder;
    }

}
    public class CollInquiryQualifierGroupIterator implements Iterable<CollInquiryQualifierGroupDecoder>, java.util.Iterator<CollInquiryQualifierGroupDecoder>
    {
        private final CollInqQualGrpDecoder parent;
        private int remainder;
        private CollInquiryQualifierGroupDecoder current;

        public CollInquiryQualifierGroupIterator(final CollInqQualGrpDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }

        public CollInquiryQualifierGroupDecoder next()
        {
            remainder--;
            final CollInquiryQualifierGroupDecoder value = current;
            current = current.next();
            return value;
        }

        public int numberFieldValue()
        {
            return parent.hasNoCollInquiryQualifierGroupCounter() ? parent.noCollInquiryQualifierGroupCounter() : 0;
        }

        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.collInquiryQualifierGroup();
        }

        public CollInquiryQualifierGroupIterator iterator()
        {
            reset();
            return this;
        }

    }

    public CollInquiryQualifierGroupIterator collInquiryQualifierGroupIterator();
    public int noCollInquiryQualifierGroupCounter();
    public boolean hasNoCollInquiryQualifierGroupCounter();
    public CollInquiryQualifierGroupDecoder collInquiryQualifierGroup();

}
