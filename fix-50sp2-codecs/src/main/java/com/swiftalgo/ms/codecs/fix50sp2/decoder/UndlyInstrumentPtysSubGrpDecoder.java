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
import com.swiftalgo.ms.codecs.fix50sp2.builder.UndlyInstrumentPtysSubGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.UndlyInstrumentPtysSubGrpEncoder.UndlyInstrumentPartySubIDsGroupEncoder;

public interface UndlyInstrumentPtysSubGrpDecoder 
{



public class UndlyInstrumentPartySubIDsGroupDecoder extends CommonDecoderImpl
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
            ALL_GROUP_FIELDS.add(Constants.UNDERLYING_INSTRUMENT_PARTY_SUB_ID);
            ALL_GROUP_FIELDS.add(Constants.UNDERLYING_INSTRUMENT_PARTY_SUB_ID_TYPE);
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
    public UndlyInstrumentPartySubIDsGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private UndlyInstrumentPartySubIDsGroupDecoder next = null;

    public UndlyInstrumentPartySubIDsGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(4);

    private char[] underlyingInstrumentPartySubID = new char[1];

    private boolean hasUnderlyingInstrumentPartySubID;

    public char[] underlyingInstrumentPartySubID()
    {
        if (!hasUnderlyingInstrumentPartySubID)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingInstrumentPartySubID");
        }

        return underlyingInstrumentPartySubID;
    }

    public boolean hasUnderlyingInstrumentPartySubID()
    {
        return hasUnderlyingInstrumentPartySubID;
    }


    private int underlyingInstrumentPartySubIDOffset;

    private int underlyingInstrumentPartySubIDLength;

    public int underlyingInstrumentPartySubIDLength()
    {
        if (!hasUnderlyingInstrumentPartySubID)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingInstrumentPartySubID");
        }

        return underlyingInstrumentPartySubIDLength;
    }

    public String underlyingInstrumentPartySubIDAsString()
    {
        return hasUnderlyingInstrumentPartySubID ? new String(underlyingInstrumentPartySubID, 0, underlyingInstrumentPartySubIDLength) : null;
    }

    public void underlyingInstrumentPartySubID(final AsciiSequenceView view)
    {
        if (!hasUnderlyingInstrumentPartySubID)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingInstrumentPartySubID");
        }

        view.wrap(buffer, underlyingInstrumentPartySubIDOffset, underlyingInstrumentPartySubIDLength);
    }


    private final CharArrayWrapper underlyingInstrumentPartySubIDWrapper = new CharArrayWrapper();
    private int underlyingInstrumentPartySubIDType = MISSING_INT;

    private boolean hasUnderlyingInstrumentPartySubIDType;

    public int underlyingInstrumentPartySubIDType()
    {
        if (!hasUnderlyingInstrumentPartySubIDType)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingInstrumentPartySubIDType");
        }

        return underlyingInstrumentPartySubIDType;
    }

    public boolean hasUnderlyingInstrumentPartySubIDType()
    {
        return hasUnderlyingInstrumentPartySubIDType;
    }



    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode UndlyInstrumentPartySubIDsGroup
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
                    next = new UndlyInstrumentPartySubIDsGroupDecoder(trailer, messageFields);
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
            case Constants.UNDERLYING_INSTRUMENT_PARTY_SUB_ID:
                hasUnderlyingInstrumentPartySubID = true;
                underlyingInstrumentPartySubID = buffer.getChars(underlyingInstrumentPartySubID, valueOffset, valueLength);
                underlyingInstrumentPartySubIDOffset = valueOffset;
                underlyingInstrumentPartySubIDLength = valueLength;
                break;

            case Constants.UNDERLYING_INSTRUMENT_PARTY_SUB_ID_TYPE:
                hasUnderlyingInstrumentPartySubIDType = true;
                underlyingInstrumentPartySubIDType = getInt(buffer, valueOffset, endOfField, 1064, CODEC_VALIDATION_ENABLED);
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
        this.resetUnderlyingInstrumentPartySubID();
        this.resetUnderlyingInstrumentPartySubIDType();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetUnderlyingInstrumentPartySubID()
    {
        hasUnderlyingInstrumentPartySubID = false;
    }

    public void resetUnderlyingInstrumentPartySubIDType()
    {
        hasUnderlyingInstrumentPartySubIDType = false;
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
        builder.append("\"MessageName\": \"UndlyInstrumentPartySubIDsGroup\",\n");
        if (hasUnderlyingInstrumentPartySubID())
        {
            indent(builder, level);
            builder.append("\"UnderlyingInstrumentPartySubID\": \"");
            builder.append(this.underlyingInstrumentPartySubID(), 0, underlyingInstrumentPartySubIDLength());
            builder.append("\",\n");
        }

        if (hasUnderlyingInstrumentPartySubIDType())
        {
            indent(builder, level);
            builder.append("\"UnderlyingInstrumentPartySubIDType\": \"");
            builder.append(underlyingInstrumentPartySubIDType);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public UndlyInstrumentPtysSubGrpEncoder.UndlyInstrumentPartySubIDsGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((UndlyInstrumentPtysSubGrpEncoder.UndlyInstrumentPartySubIDsGroupEncoder)encoder);
    }

    public UndlyInstrumentPtysSubGrpEncoder.UndlyInstrumentPartySubIDsGroupEncoder toEncoder(final UndlyInstrumentPtysSubGrpEncoder.UndlyInstrumentPartySubIDsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasUnderlyingInstrumentPartySubID())
        {
            encoder.underlyingInstrumentPartySubID(this.underlyingInstrumentPartySubID(), 0, underlyingInstrumentPartySubIDLength());
        }

        if (hasUnderlyingInstrumentPartySubIDType())
        {
            encoder.underlyingInstrumentPartySubIDType(this.underlyingInstrumentPartySubIDType());
        }
        return encoder;
    }

}
    public class UndlyInstrumentPartySubIDsGroupIterator implements Iterable<UndlyInstrumentPartySubIDsGroupDecoder>, java.util.Iterator<UndlyInstrumentPartySubIDsGroupDecoder>
    {
        private final UndlyInstrumentPtysSubGrpDecoder parent;
        private int remainder;
        private UndlyInstrumentPartySubIDsGroupDecoder current;

        public UndlyInstrumentPartySubIDsGroupIterator(final UndlyInstrumentPtysSubGrpDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }

        public UndlyInstrumentPartySubIDsGroupDecoder next()
        {
            remainder--;
            final UndlyInstrumentPartySubIDsGroupDecoder value = current;
            current = current.next();
            return value;
        }

        public int numberFieldValue()
        {
            return parent.hasNoUndlyInstrumentPartySubIDsGroupCounter() ? parent.noUndlyInstrumentPartySubIDsGroupCounter() : 0;
        }

        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.undlyInstrumentPartySubIDsGroup();
        }

        public UndlyInstrumentPartySubIDsGroupIterator iterator()
        {
            reset();
            return this;
        }

    }

    public UndlyInstrumentPartySubIDsGroupIterator undlyInstrumentPartySubIDsGroupIterator();
    public int noUndlyInstrumentPartySubIDsGroupCounter();
    public boolean hasNoUndlyInstrumentPartySubIDsGroupCounter();
    public UndlyInstrumentPartySubIDsGroupDecoder undlyInstrumentPartySubIDsGroup();

}
