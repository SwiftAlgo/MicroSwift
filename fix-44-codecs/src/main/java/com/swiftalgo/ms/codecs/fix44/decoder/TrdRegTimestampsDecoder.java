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
import com.swiftalgo.ms.codecs.fix44.builder.TrdRegTimestampsEncoder;
import static com.swiftalgo.ms.codecs.fix44.builder.TrdRegTimestampsEncoder.TrdRegTimestampsGroupEncoder;

public interface TrdRegTimestampsDecoder 
{



public class TrdRegTimestampsGroupDecoder extends CommonDecoderImpl
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
            ALL_GROUP_FIELDS.add(Constants.TRD_REG_TIMESTAMP);
            ALL_GROUP_FIELDS.add(Constants.TRD_REG_TIMESTAMP_TYPE);
            ALL_GROUP_FIELDS.add(Constants.TRD_REG_TIMESTAMP_ORIGIN);
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
        if (hasTrdRegTimestampType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !TrdRegTimestampType.isValid(trdRegTimestampType()))
        {
            invalidTagId = 770;
            rejectReason = 5;
            return false;
        }
        }
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public TrdRegTimestampsGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private TrdRegTimestampsGroupDecoder next = null;

    public TrdRegTimestampsGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(6);

    private byte[] trdRegTimestamp = new byte[24];

    private boolean hasTrdRegTimestamp;

    public byte[] trdRegTimestamp()
    {
        if (!hasTrdRegTimestamp)
        {
            throw new IllegalArgumentException("No value for optional field: TrdRegTimestamp");
        }

        return trdRegTimestamp;
    }

    public boolean hasTrdRegTimestamp()
    {
        return hasTrdRegTimestamp;
    }


    private int trdRegTimestampOffset;

    private int trdRegTimestampLength;

    public int trdRegTimestampLength()
    {
        if (!hasTrdRegTimestamp)
        {
            throw new IllegalArgumentException("No value for optional field: TrdRegTimestamp");
        }

        return trdRegTimestampLength;
    }

    public String trdRegTimestampAsString()
    {
        return hasTrdRegTimestamp ? new String(trdRegTimestamp, 0, trdRegTimestampLength) : null;
    }

    public void trdRegTimestamp(final AsciiSequenceView view)
    {
        if (!hasTrdRegTimestamp)
        {
            throw new IllegalArgumentException("No value for optional field: TrdRegTimestamp");
        }

        view.wrap(buffer, trdRegTimestampOffset, trdRegTimestampLength);
    }


    private int trdRegTimestampType = MISSING_INT;

    private boolean hasTrdRegTimestampType;

    public int trdRegTimestampType()
    {
        if (!hasTrdRegTimestampType)
        {
            throw new IllegalArgumentException("No value for optional field: TrdRegTimestampType");
        }

        return trdRegTimestampType;
    }

    public boolean hasTrdRegTimestampType()
    {
        return hasTrdRegTimestampType;
    }



    private final CharArrayWrapper trdRegTimestampTypeWrapper = new CharArrayWrapper();
    public TrdRegTimestampType trdRegTimestampTypeAsEnum()
    {
        if (!hasTrdRegTimestampType)
 return TrdRegTimestampType.NULL_VAL;
        return TrdRegTimestampType.decode(trdRegTimestampType);
    }

    private char[] trdRegTimestampOrigin = new char[1];

    private boolean hasTrdRegTimestampOrigin;

    public char[] trdRegTimestampOrigin()
    {
        if (!hasTrdRegTimestampOrigin)
        {
            throw new IllegalArgumentException("No value for optional field: TrdRegTimestampOrigin");
        }

        return trdRegTimestampOrigin;
    }

    public boolean hasTrdRegTimestampOrigin()
    {
        return hasTrdRegTimestampOrigin;
    }


    private int trdRegTimestampOriginOffset;

    private int trdRegTimestampOriginLength;

    public int trdRegTimestampOriginLength()
    {
        if (!hasTrdRegTimestampOrigin)
        {
            throw new IllegalArgumentException("No value for optional field: TrdRegTimestampOrigin");
        }

        return trdRegTimestampOriginLength;
    }

    public String trdRegTimestampOriginAsString()
    {
        return hasTrdRegTimestampOrigin ? new String(trdRegTimestampOrigin, 0, trdRegTimestampOriginLength) : null;
    }

    public void trdRegTimestampOrigin(final AsciiSequenceView view)
    {
        if (!hasTrdRegTimestampOrigin)
        {
            throw new IllegalArgumentException("No value for optional field: TrdRegTimestampOrigin");
        }

        view.wrap(buffer, trdRegTimestampOriginOffset, trdRegTimestampOriginLength);
    }


    private final CharArrayWrapper trdRegTimestampOriginWrapper = new CharArrayWrapper();
    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode TrdRegTimestampsGroup
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
                    next = new TrdRegTimestampsGroupDecoder(trailer, messageFields);
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
            case Constants.TRD_REG_TIMESTAMP:
                hasTrdRegTimestamp = true;
                trdRegTimestamp = buffer.getBytes(trdRegTimestamp, valueOffset, valueLength);
                trdRegTimestampOffset = valueOffset;
                trdRegTimestampLength = valueLength;
                break;

            case Constants.TRD_REG_TIMESTAMP_TYPE:
                hasTrdRegTimestampType = true;
                trdRegTimestampType = getInt(buffer, valueOffset, endOfField, 770, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.TRD_REG_TIMESTAMP_ORIGIN:
                hasTrdRegTimestampOrigin = true;
                trdRegTimestampOrigin = buffer.getChars(trdRegTimestampOrigin, valueOffset, valueLength);
                trdRegTimestampOriginOffset = valueOffset;
                trdRegTimestampOriginLength = valueLength;
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
        this.resetTrdRegTimestamp();
        this.resetTrdRegTimestampType();
        this.resetTrdRegTimestampOrigin();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetTrdRegTimestamp()
    {
        hasTrdRegTimestamp = false;
    }

    public void resetTrdRegTimestampType()
    {
        hasTrdRegTimestampType = false;
    }

    public void resetTrdRegTimestampOrigin()
    {
        hasTrdRegTimestampOrigin = false;
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
        builder.append("\"MessageName\": \"TrdRegTimestampsGroup\",\n");
        if (hasTrdRegTimestamp())
        {
            indent(builder, level);
            builder.append("\"TrdRegTimestamp\": \"");
            appendData(builder, trdRegTimestamp, trdRegTimestampLength);
            builder.append("\",\n");
        }

        if (hasTrdRegTimestampType())
        {
            indent(builder, level);
            builder.append("\"TrdRegTimestampType\": \"");
            builder.append(trdRegTimestampType);
            builder.append("\",\n");
        }

        if (hasTrdRegTimestampOrigin())
        {
            indent(builder, level);
            builder.append("\"TrdRegTimestampOrigin\": \"");
            builder.append(this.trdRegTimestampOrigin(), 0, trdRegTimestampOriginLength());
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public TrdRegTimestampsEncoder.TrdRegTimestampsGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((TrdRegTimestampsEncoder.TrdRegTimestampsGroupEncoder)encoder);
    }

    public TrdRegTimestampsEncoder.TrdRegTimestampsGroupEncoder toEncoder(final TrdRegTimestampsEncoder.TrdRegTimestampsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasTrdRegTimestamp())
        {
            encoder.trdRegTimestampAsCopy(this.trdRegTimestamp(), 0, trdRegTimestampLength());
        }

        if (hasTrdRegTimestampType())
        {
            encoder.trdRegTimestampType(this.trdRegTimestampType());
        }

        if (hasTrdRegTimestampOrigin())
        {
            encoder.trdRegTimestampOrigin(this.trdRegTimestampOrigin(), 0, trdRegTimestampOriginLength());
        }
        return encoder;
    }

}
    public class TrdRegTimestampsGroupIterator implements Iterable<TrdRegTimestampsGroupDecoder>, java.util.Iterator<TrdRegTimestampsGroupDecoder>
    {
        private final TrdRegTimestampsDecoder parent;
        private int remainder;
        private TrdRegTimestampsGroupDecoder current;

        public TrdRegTimestampsGroupIterator(final TrdRegTimestampsDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }

        public TrdRegTimestampsGroupDecoder next()
        {
            remainder--;
            final TrdRegTimestampsGroupDecoder value = current;
            current = current.next();
            return value;
        }

        public int numberFieldValue()
        {
            return parent.hasNoTrdRegTimestampsGroupCounter() ? parent.noTrdRegTimestampsGroupCounter() : 0;
        }

        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.trdRegTimestampsGroup();
        }

        public TrdRegTimestampsGroupIterator iterator()
        {
            reset();
            return this;
        }

    }

    public TrdRegTimestampsGroupIterator trdRegTimestampsGroupIterator();
    public int noTrdRegTimestampsGroupCounter();
    public boolean hasNoTrdRegTimestampsGroupCounter();
    public TrdRegTimestampsGroupDecoder trdRegTimestampsGroup();

}
