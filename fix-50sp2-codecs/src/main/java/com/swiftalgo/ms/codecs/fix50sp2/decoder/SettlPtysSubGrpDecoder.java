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
import com.swiftalgo.ms.codecs.fix50sp2.builder.SettlPtysSubGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.SettlPtysSubGrpEncoder.SettlPartySubIDsGroupEncoder;

public interface SettlPtysSubGrpDecoder 
{



public class SettlPartySubIDsGroupDecoder extends CommonDecoderImpl
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
            ALL_GROUP_FIELDS.add(Constants.SETTL_PARTY_SUB_ID);
            ALL_GROUP_FIELDS.add(Constants.SETTL_PARTY_SUB_ID_TYPE);
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
    public SettlPartySubIDsGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private SettlPartySubIDsGroupDecoder next = null;

    public SettlPartySubIDsGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(4);

    private char[] settlPartySubID = new char[1];

    private boolean hasSettlPartySubID;

    public char[] settlPartySubID()
    {
        if (!hasSettlPartySubID)
        {
            throw new IllegalArgumentException("No value for optional field: SettlPartySubID");
        }

        return settlPartySubID;
    }

    public boolean hasSettlPartySubID()
    {
        return hasSettlPartySubID;
    }


    private int settlPartySubIDOffset;

    private int settlPartySubIDLength;

    public int settlPartySubIDLength()
    {
        if (!hasSettlPartySubID)
        {
            throw new IllegalArgumentException("No value for optional field: SettlPartySubID");
        }

        return settlPartySubIDLength;
    }

    public String settlPartySubIDAsString()
    {
        return hasSettlPartySubID ? new String(settlPartySubID, 0, settlPartySubIDLength) : null;
    }

    public void settlPartySubID(final AsciiSequenceView view)
    {
        if (!hasSettlPartySubID)
        {
            throw new IllegalArgumentException("No value for optional field: SettlPartySubID");
        }

        view.wrap(buffer, settlPartySubIDOffset, settlPartySubIDLength);
    }


    private int settlPartySubIDType = MISSING_INT;

    private boolean hasSettlPartySubIDType;

    public int settlPartySubIDType()
    {
        if (!hasSettlPartySubIDType)
        {
            throw new IllegalArgumentException("No value for optional field: SettlPartySubIDType");
        }

        return settlPartySubIDType;
    }

    public boolean hasSettlPartySubIDType()
    {
        return hasSettlPartySubIDType;
    }



    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode SettlPartySubIDsGroup
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
                    next = new SettlPartySubIDsGroupDecoder(trailer, messageFields);
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
            case Constants.SETTL_PARTY_SUB_ID:
                hasSettlPartySubID = true;
                settlPartySubID = buffer.getChars(settlPartySubID, valueOffset, valueLength);
                settlPartySubIDOffset = valueOffset;
                settlPartySubIDLength = valueLength;
                break;

            case Constants.SETTL_PARTY_SUB_ID_TYPE:
                hasSettlPartySubIDType = true;
                settlPartySubIDType = getInt(buffer, valueOffset, endOfField, 786, CODEC_VALIDATION_ENABLED);
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
        this.resetSettlPartySubID();
        this.resetSettlPartySubIDType();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetSettlPartySubID()
    {
        hasSettlPartySubID = false;
    }

    public void resetSettlPartySubIDType()
    {
        hasSettlPartySubIDType = false;
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
        builder.append("\"MessageName\": \"SettlPartySubIDsGroup\",\n");
        if (hasSettlPartySubID())
        {
            indent(builder, level);
            builder.append("\"SettlPartySubID\": \"");
            builder.append(this.settlPartySubID(), 0, settlPartySubIDLength());
            builder.append("\",\n");
        }

        if (hasSettlPartySubIDType())
        {
            indent(builder, level);
            builder.append("\"SettlPartySubIDType\": \"");
            builder.append(settlPartySubIDType);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public SettlPartySubIDsGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((SettlPartySubIDsGroupEncoder)encoder);
    }

    public SettlPartySubIDsGroupEncoder toEncoder(final SettlPartySubIDsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasSettlPartySubID())
        {
            encoder.settlPartySubID(this.settlPartySubID(), 0, settlPartySubIDLength());
        }

        if (hasSettlPartySubIDType())
        {
            encoder.settlPartySubIDType(this.settlPartySubIDType());
        }
        return encoder;
    }

}
    public class SettlPartySubIDsGroupIterator implements Iterable<SettlPartySubIDsGroupDecoder>, java.util.Iterator<SettlPartySubIDsGroupDecoder>
    {
        private final SettlPtysSubGrpDecoder parent;
        private int remainder;
        private SettlPartySubIDsGroupDecoder current;

        public SettlPartySubIDsGroupIterator(final SettlPtysSubGrpDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }
        public SettlPartySubIDsGroupDecoder next()
        {
            remainder--;
            final SettlPartySubIDsGroupDecoder value = current;
            current = current.next();
            return value;
        }
        public int numberFieldValue()
        {
            return parent.hasNoSettlPartySubIDsGroupCounter() ? parent.noSettlPartySubIDsGroupCounter() : 0;
        }
        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.settlPartySubIDsGroup();
        }
        public SettlPartySubIDsGroupIterator iterator()
        {
            reset();
            return this;
        }
    }

public SettlPartySubIDsGroupIterator settlPartySubIDsGroupIterator();
    public int noSettlPartySubIDsGroupCounter();
    public boolean hasNoSettlPartySubIDsGroupCounter();
    public SettlPartySubIDsGroupDecoder settlPartySubIDsGroup();

}
