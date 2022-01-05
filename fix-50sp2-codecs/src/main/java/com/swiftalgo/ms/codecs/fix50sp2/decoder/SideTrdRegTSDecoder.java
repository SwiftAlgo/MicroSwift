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
import com.swiftalgo.ms.codecs.fix50sp2.builder.SideTrdRegTSEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.SideTrdRegTSEncoder.SideTrdRegTSGroupEncoder;

public interface SideTrdRegTSDecoder 
{



public class SideTrdRegTSGroupDecoder extends CommonDecoderImpl
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
            ALL_GROUP_FIELDS.add(Constants.SIDE_TRD_REG_TIMESTAMP);
            ALL_GROUP_FIELDS.add(Constants.SIDE_TRD_REG_TIMESTAMP_TYPE);
            ALL_GROUP_FIELDS.add(Constants.SIDE_TRD_REG_TIMESTAMP_SRC);
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
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public SideTrdRegTSGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private SideTrdRegTSGroupDecoder next = null;

    public SideTrdRegTSGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(6);

    private byte[] sideTrdRegTimestamp = new byte[24];

    private boolean hasSideTrdRegTimestamp;

    public byte[] sideTrdRegTimestamp()
    {
        if (!hasSideTrdRegTimestamp)
        {
            throw new IllegalArgumentException("No value for optional field: SideTrdRegTimestamp");
        }

        return sideTrdRegTimestamp;
    }

    public boolean hasSideTrdRegTimestamp()
    {
        return hasSideTrdRegTimestamp;
    }


    private int sideTrdRegTimestampOffset;

    private int sideTrdRegTimestampLength;

    public int sideTrdRegTimestampLength()
    {
        if (!hasSideTrdRegTimestamp)
        {
            throw new IllegalArgumentException("No value for optional field: SideTrdRegTimestamp");
        }

        return sideTrdRegTimestampLength;
    }

    public String sideTrdRegTimestampAsString()
    {
        return hasSideTrdRegTimestamp ? new String(sideTrdRegTimestamp, 0, sideTrdRegTimestampLength) : null;
    }

    public void sideTrdRegTimestamp(final AsciiSequenceView view)
    {
        if (!hasSideTrdRegTimestamp)
        {
            throw new IllegalArgumentException("No value for optional field: SideTrdRegTimestamp");
        }

        view.wrap(buffer, sideTrdRegTimestampOffset, sideTrdRegTimestampLength);
    }


    private int sideTrdRegTimestampType = MISSING_INT;

    private boolean hasSideTrdRegTimestampType;

    public int sideTrdRegTimestampType()
    {
        if (!hasSideTrdRegTimestampType)
        {
            throw new IllegalArgumentException("No value for optional field: SideTrdRegTimestampType");
        }

        return sideTrdRegTimestampType;
    }

    public boolean hasSideTrdRegTimestampType()
    {
        return hasSideTrdRegTimestampType;
    }



    private char[] sideTrdRegTimestampSrc = new char[1];

    private boolean hasSideTrdRegTimestampSrc;

    public char[] sideTrdRegTimestampSrc()
    {
        if (!hasSideTrdRegTimestampSrc)
        {
            throw new IllegalArgumentException("No value for optional field: SideTrdRegTimestampSrc");
        }

        return sideTrdRegTimestampSrc;
    }

    public boolean hasSideTrdRegTimestampSrc()
    {
        return hasSideTrdRegTimestampSrc;
    }


    private int sideTrdRegTimestampSrcOffset;

    private int sideTrdRegTimestampSrcLength;

    public int sideTrdRegTimestampSrcLength()
    {
        if (!hasSideTrdRegTimestampSrc)
        {
            throw new IllegalArgumentException("No value for optional field: SideTrdRegTimestampSrc");
        }

        return sideTrdRegTimestampSrcLength;
    }

    public String sideTrdRegTimestampSrcAsString()
    {
        return hasSideTrdRegTimestampSrc ? new String(sideTrdRegTimestampSrc, 0, sideTrdRegTimestampSrcLength) : null;
    }

    public void sideTrdRegTimestampSrc(final AsciiSequenceView view)
    {
        if (!hasSideTrdRegTimestampSrc)
        {
            throw new IllegalArgumentException("No value for optional field: SideTrdRegTimestampSrc");
        }

        view.wrap(buffer, sideTrdRegTimestampSrcOffset, sideTrdRegTimestampSrcLength);
    }


    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode SideTrdRegTSGroup
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
                    next = new SideTrdRegTSGroupDecoder(trailer, messageFields);
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
            case Constants.SIDE_TRD_REG_TIMESTAMP:
                hasSideTrdRegTimestamp = true;
                sideTrdRegTimestamp = buffer.getBytes(sideTrdRegTimestamp, valueOffset, valueLength);
                sideTrdRegTimestampOffset = valueOffset;
                sideTrdRegTimestampLength = valueLength;
                break;

            case Constants.SIDE_TRD_REG_TIMESTAMP_TYPE:
                hasSideTrdRegTimestampType = true;
                sideTrdRegTimestampType = getInt(buffer, valueOffset, endOfField, 1013, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.SIDE_TRD_REG_TIMESTAMP_SRC:
                hasSideTrdRegTimestampSrc = true;
                sideTrdRegTimestampSrc = buffer.getChars(sideTrdRegTimestampSrc, valueOffset, valueLength);
                sideTrdRegTimestampSrcOffset = valueOffset;
                sideTrdRegTimestampSrcLength = valueLength;
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
        this.resetSideTrdRegTimestamp();
        this.resetSideTrdRegTimestampType();
        this.resetSideTrdRegTimestampSrc();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetSideTrdRegTimestamp()
    {
        hasSideTrdRegTimestamp = false;
    }

    public void resetSideTrdRegTimestampType()
    {
        hasSideTrdRegTimestampType = false;
    }

    public void resetSideTrdRegTimestampSrc()
    {
        hasSideTrdRegTimestampSrc = false;
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
        builder.append("\"MessageName\": \"SideTrdRegTSGroup\",\n");
        if (hasSideTrdRegTimestamp())
        {
            indent(builder, level);
            builder.append("\"SideTrdRegTimestamp\": \"");
            appendData(builder, sideTrdRegTimestamp, sideTrdRegTimestampLength);
            builder.append("\",\n");
        }

        if (hasSideTrdRegTimestampType())
        {
            indent(builder, level);
            builder.append("\"SideTrdRegTimestampType\": \"");
            builder.append(sideTrdRegTimestampType);
            builder.append("\",\n");
        }

        if (hasSideTrdRegTimestampSrc())
        {
            indent(builder, level);
            builder.append("\"SideTrdRegTimestampSrc\": \"");
            builder.append(this.sideTrdRegTimestampSrc(), 0, sideTrdRegTimestampSrcLength());
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public SideTrdRegTSGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((SideTrdRegTSGroupEncoder)encoder);
    }

    public SideTrdRegTSGroupEncoder toEncoder(final SideTrdRegTSGroupEncoder encoder)
    {
        encoder.reset();
        if (hasSideTrdRegTimestamp())
        {
            encoder.sideTrdRegTimestampAsCopy(this.sideTrdRegTimestamp(), 0, sideTrdRegTimestampLength());
        }

        if (hasSideTrdRegTimestampType())
        {
            encoder.sideTrdRegTimestampType(this.sideTrdRegTimestampType());
        }

        if (hasSideTrdRegTimestampSrc())
        {
            encoder.sideTrdRegTimestampSrc(this.sideTrdRegTimestampSrc(), 0, sideTrdRegTimestampSrcLength());
        }
        return encoder;
    }

}
    public class SideTrdRegTSGroupIterator implements Iterable<SideTrdRegTSGroupDecoder>, java.util.Iterator<SideTrdRegTSGroupDecoder>
    {
        private final SideTrdRegTSDecoder parent;
        private int remainder;
        private SideTrdRegTSGroupDecoder current;

        public SideTrdRegTSGroupIterator(final SideTrdRegTSDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }
        public SideTrdRegTSGroupDecoder next()
        {
            remainder--;
            final SideTrdRegTSGroupDecoder value = current;
            current = current.next();
            return value;
        }
        public int numberFieldValue()
        {
            return parent.hasNoSideTrdRegTSGroupCounter() ? parent.noSideTrdRegTSGroupCounter() : 0;
        }
        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.sideTrdRegTSGroup();
        }
        public SideTrdRegTSGroupIterator iterator()
        {
            reset();
            return this;
        }
    }

public SideTrdRegTSGroupIterator sideTrdRegTSGroupIterator();
    public int noSideTrdRegTSGroupCounter();
    public boolean hasNoSideTrdRegTSGroupCounter();
    public SideTrdRegTSGroupDecoder sideTrdRegTSGroup();

}
