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
import com.swiftalgo.ms.codecs.fix50sp2.builder.NstdPtysSubGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.NstdPtysSubGrpEncoder.NestedPartySubIDsGroupEncoder;

public interface NstdPtysSubGrpDecoder 
{



public class NestedPartySubIDsGroupDecoder extends CommonDecoderImpl
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
            ALL_GROUP_FIELDS.add(Constants.NESTED_PARTY_SUB_ID);
            ALL_GROUP_FIELDS.add(Constants.NESTED_PARTY_SUB_ID_TYPE);
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
    public NestedPartySubIDsGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private NestedPartySubIDsGroupDecoder next = null;

    public NestedPartySubIDsGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(4);

    private char[] nestedPartySubID = new char[1];

    private boolean hasNestedPartySubID;

    public char[] nestedPartySubID()
    {
        if (!hasNestedPartySubID)
        {
            throw new IllegalArgumentException("No value for optional field: NestedPartySubID");
        }

        return nestedPartySubID;
    }

    public boolean hasNestedPartySubID()
    {
        return hasNestedPartySubID;
    }


    private int nestedPartySubIDOffset;

    private int nestedPartySubIDLength;

    public int nestedPartySubIDLength()
    {
        if (!hasNestedPartySubID)
        {
            throw new IllegalArgumentException("No value for optional field: NestedPartySubID");
        }

        return nestedPartySubIDLength;
    }

    public String nestedPartySubIDAsString()
    {
        return hasNestedPartySubID ? new String(nestedPartySubID, 0, nestedPartySubIDLength) : null;
    }

    public void nestedPartySubID(final AsciiSequenceView view)
    {
        if (!hasNestedPartySubID)
        {
            throw new IllegalArgumentException("No value for optional field: NestedPartySubID");
        }

        view.wrap(buffer, nestedPartySubIDOffset, nestedPartySubIDLength);
    }


    private int nestedPartySubIDType = MISSING_INT;

    private boolean hasNestedPartySubIDType;

    public int nestedPartySubIDType()
    {
        if (!hasNestedPartySubIDType)
        {
            throw new IllegalArgumentException("No value for optional field: NestedPartySubIDType");
        }

        return nestedPartySubIDType;
    }

    public boolean hasNestedPartySubIDType()
    {
        return hasNestedPartySubIDType;
    }



    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode NestedPartySubIDsGroup
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
                    next = new NestedPartySubIDsGroupDecoder(trailer, messageFields);
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
            case Constants.NESTED_PARTY_SUB_ID:
                hasNestedPartySubID = true;
                nestedPartySubID = buffer.getChars(nestedPartySubID, valueOffset, valueLength);
                nestedPartySubIDOffset = valueOffset;
                nestedPartySubIDLength = valueLength;
                break;

            case Constants.NESTED_PARTY_SUB_ID_TYPE:
                hasNestedPartySubIDType = true;
                nestedPartySubIDType = getInt(buffer, valueOffset, endOfField, 805, CODEC_VALIDATION_ENABLED);
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
        this.resetNestedPartySubID();
        this.resetNestedPartySubIDType();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetNestedPartySubID()
    {
        hasNestedPartySubID = false;
    }

    public void resetNestedPartySubIDType()
    {
        hasNestedPartySubIDType = false;
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
        builder.append("\"MessageName\": \"NestedPartySubIDsGroup\",\n");
        if (hasNestedPartySubID())
        {
            indent(builder, level);
            builder.append("\"NestedPartySubID\": \"");
            builder.append(this.nestedPartySubID(), 0, nestedPartySubIDLength());
            builder.append("\",\n");
        }

        if (hasNestedPartySubIDType())
        {
            indent(builder, level);
            builder.append("\"NestedPartySubIDType\": \"");
            builder.append(nestedPartySubIDType);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public NestedPartySubIDsGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((NestedPartySubIDsGroupEncoder)encoder);
    }

    public NestedPartySubIDsGroupEncoder toEncoder(final NestedPartySubIDsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasNestedPartySubID())
        {
            encoder.nestedPartySubID(this.nestedPartySubID(), 0, nestedPartySubIDLength());
        }

        if (hasNestedPartySubIDType())
        {
            encoder.nestedPartySubIDType(this.nestedPartySubIDType());
        }
        return encoder;
    }

}
    public class NestedPartySubIDsGroupIterator implements Iterable<NestedPartySubIDsGroupDecoder>, java.util.Iterator<NestedPartySubIDsGroupDecoder>
    {
        private final NstdPtysSubGrpDecoder parent;
        private int remainder;
        private NestedPartySubIDsGroupDecoder current;

        public NestedPartySubIDsGroupIterator(final NstdPtysSubGrpDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }
        public NestedPartySubIDsGroupDecoder next()
        {
            remainder--;
            final NestedPartySubIDsGroupDecoder value = current;
            current = current.next();
            return value;
        }
        public int numberFieldValue()
        {
            return parent.hasNoNestedPartySubIDsGroupCounter() ? parent.noNestedPartySubIDsGroupCounter() : 0;
        }
        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.nestedPartySubIDsGroup();
        }
        public NestedPartySubIDsGroupIterator iterator()
        {
            reset();
            return this;
        }
    }

public NestedPartySubIDsGroupIterator nestedPartySubIDsGroupIterator();
    public int noNestedPartySubIDsGroupCounter();
    public boolean hasNoNestedPartySubIDsGroupCounter();
    public NestedPartySubIDsGroupDecoder nestedPartySubIDsGroup();

}
