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
import com.swiftalgo.ms.codecs.fix50sp2.builder.RateSourceEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.RateSourceEncoder.RateSourcesGroupEncoder;

public interface RateSourceDecoder 
{



public class RateSourcesGroupDecoder extends CommonDecoderImpl
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
            ALL_GROUP_FIELDS.add(Constants.RATE_SOURCE);
            ALL_GROUP_FIELDS.add(Constants.RATE_SOURCE_TYPE);
            ALL_GROUP_FIELDS.add(Constants.REFERENCE_PAGE);
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
        if (hasRateSource)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !RateSource.isValid(rateSource()))
        {
            invalidTagId = 1446;
            rejectReason = 5;
            return false;
        }
        }

        if (hasRateSourceType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !RateSourceType.isValid(rateSourceType()))
        {
            invalidTagId = 1447;
            rejectReason = 5;
            return false;
        }
        }
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public RateSourcesGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private RateSourcesGroupDecoder next = null;

    public RateSourcesGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(6);

    private int rateSource = MISSING_INT;

    private boolean hasRateSource;

    public int rateSource()
    {
        if (!hasRateSource)
        {
            throw new IllegalArgumentException("No value for optional field: RateSource");
        }

        return rateSource;
    }

    public boolean hasRateSource()
    {
        return hasRateSource;
    }



    private final CharArrayWrapper rateSourceWrapper = new CharArrayWrapper();
    public RateSource rateSourceAsEnum()
    {
        if (!hasRateSource)
 return RateSource.NULL_VAL;
        return RateSource.decode(rateSource);
    }

    private int rateSourceType = MISSING_INT;

    private boolean hasRateSourceType;

    public int rateSourceType()
    {
        if (!hasRateSourceType)
        {
            throw new IllegalArgumentException("No value for optional field: RateSourceType");
        }

        return rateSourceType;
    }

    public boolean hasRateSourceType()
    {
        return hasRateSourceType;
    }



    private final CharArrayWrapper rateSourceTypeWrapper = new CharArrayWrapper();
    public RateSourceType rateSourceTypeAsEnum()
    {
        if (!hasRateSourceType)
 return RateSourceType.NULL_VAL;
        return RateSourceType.decode(rateSourceType);
    }

    private char[] referencePage = new char[1];

    private boolean hasReferencePage;

    public char[] referencePage()
    {
        if (!hasReferencePage)
        {
            throw new IllegalArgumentException("No value for optional field: ReferencePage");
        }

        return referencePage;
    }

    public boolean hasReferencePage()
    {
        return hasReferencePage;
    }


    private int referencePageOffset;

    private int referencePageLength;

    public int referencePageLength()
    {
        if (!hasReferencePage)
        {
            throw new IllegalArgumentException("No value for optional field: ReferencePage");
        }

        return referencePageLength;
    }

    public String referencePageAsString()
    {
        return hasReferencePage ? new String(referencePage, 0, referencePageLength) : null;
    }

    public void referencePage(final AsciiSequenceView view)
    {
        if (!hasReferencePage)
        {
            throw new IllegalArgumentException("No value for optional field: ReferencePage");
        }

        view.wrap(buffer, referencePageOffset, referencePageLength);
    }


    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode RateSourcesGroup
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
                    next = new RateSourcesGroupDecoder(trailer, messageFields);
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
            case Constants.RATE_SOURCE:
                hasRateSource = true;
                rateSource = getInt(buffer, valueOffset, endOfField, 1446, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.RATE_SOURCE_TYPE:
                hasRateSourceType = true;
                rateSourceType = getInt(buffer, valueOffset, endOfField, 1447, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.REFERENCE_PAGE:
                hasReferencePage = true;
                referencePage = buffer.getChars(referencePage, valueOffset, valueLength);
                referencePageOffset = valueOffset;
                referencePageLength = valueLength;
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
        this.resetRateSource();
        this.resetRateSourceType();
        this.resetReferencePage();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetRateSource()
    {
        hasRateSource = false;
    }

    public void resetRateSourceType()
    {
        hasRateSourceType = false;
    }

    public void resetReferencePage()
    {
        hasReferencePage = false;
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
        builder.append("\"MessageName\": \"RateSourcesGroup\",\n");
        if (hasRateSource())
        {
            indent(builder, level);
            builder.append("\"RateSource\": \"");
            builder.append(rateSource);
            builder.append("\",\n");
        }

        if (hasRateSourceType())
        {
            indent(builder, level);
            builder.append("\"RateSourceType\": \"");
            builder.append(rateSourceType);
            builder.append("\",\n");
        }

        if (hasReferencePage())
        {
            indent(builder, level);
            builder.append("\"ReferencePage\": \"");
            builder.append(this.referencePage(), 0, referencePageLength());
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public RateSourcesGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((RateSourcesGroupEncoder)encoder);
    }

    public RateSourcesGroupEncoder toEncoder(final RateSourcesGroupEncoder encoder)
    {
        encoder.reset();
        if (hasRateSource())
        {
            encoder.rateSource(this.rateSource());
        }

        if (hasRateSourceType())
        {
            encoder.rateSourceType(this.rateSourceType());
        }

        if (hasReferencePage())
        {
            encoder.referencePage(this.referencePage(), 0, referencePageLength());
        }
        return encoder;
    }

}
    public class RateSourcesGroupIterator implements Iterable<RateSourcesGroupDecoder>, java.util.Iterator<RateSourcesGroupDecoder>
    {
        private final RateSourceDecoder parent;
        private int remainder;
        private RateSourcesGroupDecoder current;

        public RateSourcesGroupIterator(final RateSourceDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }
        public RateSourcesGroupDecoder next()
        {
            remainder--;
            final RateSourcesGroupDecoder value = current;
            current = current.next();
            return value;
        }
        public int numberFieldValue()
        {
            return parent.hasNoRateSourcesGroupCounter() ? parent.noRateSourcesGroupCounter() : 0;
        }
        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.rateSourcesGroup();
        }
        public RateSourcesGroupIterator iterator()
        {
            reset();
            return this;
        }
    }

public RateSourcesGroupIterator rateSourcesGroupIterator();
    public int noRateSourcesGroupCounter();
    public boolean hasNoRateSourcesGroupCounter();
    public RateSourcesGroupDecoder rateSourcesGroup();

}
