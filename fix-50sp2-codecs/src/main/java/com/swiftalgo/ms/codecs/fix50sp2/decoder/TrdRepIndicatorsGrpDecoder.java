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
import com.swiftalgo.ms.codecs.fix50sp2.builder.TrdRepIndicatorsGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.TrdRepIndicatorsGrpEncoder.TrdRepIndicatorsGroupEncoder;

public interface TrdRepIndicatorsGrpDecoder 
{



public class TrdRepIndicatorsGroupDecoder extends CommonDecoderImpl
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
            ALL_GROUP_FIELDS.add(Constants.TRD_REP_PARTY_ROLE);
            ALL_GROUP_FIELDS.add(Constants.TRD_REP_INDICATOR);
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
    public TrdRepIndicatorsGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private TrdRepIndicatorsGroupDecoder next = null;

    public TrdRepIndicatorsGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(4);

    private int trdRepPartyRole = MISSING_INT;

    private boolean hasTrdRepPartyRole;

    public int trdRepPartyRole()
    {
        if (!hasTrdRepPartyRole)
        {
            throw new IllegalArgumentException("No value for optional field: TrdRepPartyRole");
        }

        return trdRepPartyRole;
    }

    public boolean hasTrdRepPartyRole()
    {
        return hasTrdRepPartyRole;
    }



    private boolean trdRepIndicator;

    private boolean hasTrdRepIndicator;

    public boolean trdRepIndicator()
    {
        if (!hasTrdRepIndicator)
        {
            throw new IllegalArgumentException("No value for optional field: TrdRepIndicator");
        }

        return trdRepIndicator;
    }

    public boolean hasTrdRepIndicator()
    {
        return hasTrdRepIndicator;
    }



    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode TrdRepIndicatorsGroup
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
                    next = new TrdRepIndicatorsGroupDecoder(trailer, messageFields);
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
            case Constants.TRD_REP_PARTY_ROLE:
                hasTrdRepPartyRole = true;
                trdRepPartyRole = getInt(buffer, valueOffset, endOfField, 1388, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.TRD_REP_INDICATOR:
                hasTrdRepIndicator = true;
                trdRepIndicator = buffer.getBoolean(valueOffset);
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
        this.resetTrdRepPartyRole();
        this.resetTrdRepIndicator();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetTrdRepPartyRole()
    {
        hasTrdRepPartyRole = false;
    }

    public void resetTrdRepIndicator()
    {
        hasTrdRepIndicator = false;
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
        builder.append("\"MessageName\": \"TrdRepIndicatorsGroup\",\n");
        if (hasTrdRepPartyRole())
        {
            indent(builder, level);
            builder.append("\"TrdRepPartyRole\": \"");
            builder.append(trdRepPartyRole);
            builder.append("\",\n");
        }

        if (hasTrdRepIndicator())
        {
            indent(builder, level);
            builder.append("\"TrdRepIndicator\": \"");
            builder.append(trdRepIndicator);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public TrdRepIndicatorsGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((TrdRepIndicatorsGroupEncoder)encoder);
    }

    public TrdRepIndicatorsGroupEncoder toEncoder(final TrdRepIndicatorsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasTrdRepPartyRole())
        {
            encoder.trdRepPartyRole(this.trdRepPartyRole());
        }

        if (hasTrdRepIndicator())
        {
            encoder.trdRepIndicator(this.trdRepIndicator());
        }
        return encoder;
    }

}
    public class TrdRepIndicatorsGroupIterator implements Iterable<TrdRepIndicatorsGroupDecoder>, java.util.Iterator<TrdRepIndicatorsGroupDecoder>
    {
        private final TrdRepIndicatorsGrpDecoder parent;
        private int remainder;
        private TrdRepIndicatorsGroupDecoder current;

        public TrdRepIndicatorsGroupIterator(final TrdRepIndicatorsGrpDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }
        public TrdRepIndicatorsGroupDecoder next()
        {
            remainder--;
            final TrdRepIndicatorsGroupDecoder value = current;
            current = current.next();
            return value;
        }
        public int numberFieldValue()
        {
            return parent.hasNoTrdRepIndicatorsGroupCounter() ? parent.noTrdRepIndicatorsGroupCounter() : 0;
        }
        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.trdRepIndicatorsGroup();
        }
        public TrdRepIndicatorsGroupIterator iterator()
        {
            reset();
            return this;
        }
    }

public TrdRepIndicatorsGroupIterator trdRepIndicatorsGroupIterator();
    public int noTrdRepIndicatorsGroupCounter();
    public boolean hasNoTrdRepIndicatorsGroupCounter();
    public TrdRepIndicatorsGroupDecoder trdRepIndicatorsGroup();

}
