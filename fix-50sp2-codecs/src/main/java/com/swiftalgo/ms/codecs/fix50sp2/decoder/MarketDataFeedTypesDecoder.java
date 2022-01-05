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
import com.swiftalgo.ms.codecs.fix50sp2.builder.MarketDataFeedTypesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.MarketDataFeedTypesEncoder.MDFeedTypesGroupEncoder;

public interface MarketDataFeedTypesDecoder 
{



public class MDFeedTypesGroupDecoder extends CommonDecoderImpl
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
            ALL_GROUP_FIELDS.add(Constants.M_D_FEED_TYPE);
            ALL_GROUP_FIELDS.add(Constants.MARKET_DEPTH);
            ALL_GROUP_FIELDS.add(Constants.M_D_BOOK_TYPE);
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
        if (hasMDBookType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !MDBookType.isValid(mDBookType()))
        {
            invalidTagId = 1021;
            rejectReason = 5;
            return false;
        }
        }
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public MDFeedTypesGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private MDFeedTypesGroupDecoder next = null;

    public MDFeedTypesGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(6);

    private char[] mDFeedType = new char[1];

    private boolean hasMDFeedType;

    public char[] mDFeedType()
    {
        if (!hasMDFeedType)
        {
            throw new IllegalArgumentException("No value for optional field: MDFeedType");
        }

        return mDFeedType;
    }

    public boolean hasMDFeedType()
    {
        return hasMDFeedType;
    }


    private int mDFeedTypeOffset;

    private int mDFeedTypeLength;

    public int mDFeedTypeLength()
    {
        if (!hasMDFeedType)
        {
            throw new IllegalArgumentException("No value for optional field: MDFeedType");
        }

        return mDFeedTypeLength;
    }

    public String mDFeedTypeAsString()
    {
        return hasMDFeedType ? new String(mDFeedType, 0, mDFeedTypeLength) : null;
    }

    public void mDFeedType(final AsciiSequenceView view)
    {
        if (!hasMDFeedType)
        {
            throw new IllegalArgumentException("No value for optional field: MDFeedType");
        }

        view.wrap(buffer, mDFeedTypeOffset, mDFeedTypeLength);
    }


    private int marketDepth = MISSING_INT;

    private boolean hasMarketDepth;

    public int marketDepth()
    {
        if (!hasMarketDepth)
        {
            throw new IllegalArgumentException("No value for optional field: MarketDepth");
        }

        return marketDepth;
    }

    public boolean hasMarketDepth()
    {
        return hasMarketDepth;
    }



    private int mDBookType = MISSING_INT;

    private boolean hasMDBookType;

    public int mDBookType()
    {
        if (!hasMDBookType)
        {
            throw new IllegalArgumentException("No value for optional field: MDBookType");
        }

        return mDBookType;
    }

    public boolean hasMDBookType()
    {
        return hasMDBookType;
    }



    private final CharArrayWrapper mDBookTypeWrapper = new CharArrayWrapper();
    public MDBookType mDBookTypeAsEnum()
    {
        if (!hasMDBookType)
 return MDBookType.NULL_VAL;
        return MDBookType.decode(mDBookType);
    }

    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode MDFeedTypesGroup
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
                    next = new MDFeedTypesGroupDecoder(trailer, messageFields);
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
            case Constants.M_D_FEED_TYPE:
                hasMDFeedType = true;
                mDFeedType = buffer.getChars(mDFeedType, valueOffset, valueLength);
                mDFeedTypeOffset = valueOffset;
                mDFeedTypeLength = valueLength;
                break;

            case Constants.MARKET_DEPTH:
                hasMarketDepth = true;
                marketDepth = getInt(buffer, valueOffset, endOfField, 264, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.M_D_BOOK_TYPE:
                hasMDBookType = true;
                mDBookType = getInt(buffer, valueOffset, endOfField, 1021, CODEC_VALIDATION_ENABLED);
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
        this.resetMDFeedType();
        this.resetMarketDepth();
        this.resetMDBookType();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetMDFeedType()
    {
        hasMDFeedType = false;
    }

    public void resetMarketDepth()
    {
        hasMarketDepth = false;
    }

    public void resetMDBookType()
    {
        hasMDBookType = false;
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
        builder.append("\"MessageName\": \"MDFeedTypesGroup\",\n");
        if (hasMDFeedType())
        {
            indent(builder, level);
            builder.append("\"MDFeedType\": \"");
            builder.append(this.mDFeedType(), 0, mDFeedTypeLength());
            builder.append("\",\n");
        }

        if (hasMarketDepth())
        {
            indent(builder, level);
            builder.append("\"MarketDepth\": \"");
            builder.append(marketDepth);
            builder.append("\",\n");
        }

        if (hasMDBookType())
        {
            indent(builder, level);
            builder.append("\"MDBookType\": \"");
            builder.append(mDBookType);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public MDFeedTypesGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((MDFeedTypesGroupEncoder)encoder);
    }

    public MDFeedTypesGroupEncoder toEncoder(final MDFeedTypesGroupEncoder encoder)
    {
        encoder.reset();
        if (hasMDFeedType())
        {
            encoder.mDFeedType(this.mDFeedType(), 0, mDFeedTypeLength());
        }

        if (hasMarketDepth())
        {
            encoder.marketDepth(this.marketDepth());
        }

        if (hasMDBookType())
        {
            encoder.mDBookType(this.mDBookType());
        }
        return encoder;
    }

}
    public class MDFeedTypesGroupIterator implements Iterable<MDFeedTypesGroupDecoder>, java.util.Iterator<MDFeedTypesGroupDecoder>
    {
        private final MarketDataFeedTypesDecoder parent;
        private int remainder;
        private MDFeedTypesGroupDecoder current;

        public MDFeedTypesGroupIterator(final MarketDataFeedTypesDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }
        public MDFeedTypesGroupDecoder next()
        {
            remainder--;
            final MDFeedTypesGroupDecoder value = current;
            current = current.next();
            return value;
        }
        public int numberFieldValue()
        {
            return parent.hasNoMDFeedTypesGroupCounter() ? parent.noMDFeedTypesGroupCounter() : 0;
        }
        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.mDFeedTypesGroup();
        }
        public MDFeedTypesGroupIterator iterator()
        {
            reset();
            return this;
        }
    }

public MDFeedTypesGroupIterator mDFeedTypesGroupIterator();
    public int noMDFeedTypesGroupCounter();
    public boolean hasNoMDFeedTypesGroupCounter();
    public MDFeedTypesGroupDecoder mDFeedTypesGroup();

}
