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
import com.swiftalgo.ms.codecs.fix50sp2.builder.NstdPtys3SubGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.NstdPtys3SubGrpEncoder.Nested3PartySubIDsGroupEncoder;

public interface NstdPtys3SubGrpDecoder 
{



public class Nested3PartySubIDsGroupDecoder extends CommonDecoderImpl
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
            ALL_GROUP_FIELDS.add(Constants.NESTED3_PARTY_SUB_ID);
            ALL_GROUP_FIELDS.add(Constants.NESTED3_PARTY_SUB_ID_TYPE);
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
    public Nested3PartySubIDsGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private Nested3PartySubIDsGroupDecoder next = null;

    public Nested3PartySubIDsGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(4);

    private char[] nested3PartySubID = new char[1];

    private boolean hasNested3PartySubID;

    public char[] nested3PartySubID()
    {
        if (!hasNested3PartySubID)
        {
            throw new IllegalArgumentException("No value for optional field: Nested3PartySubID");
        }

        return nested3PartySubID;
    }

    public boolean hasNested3PartySubID()
    {
        return hasNested3PartySubID;
    }


    private int nested3PartySubIDOffset;

    private int nested3PartySubIDLength;

    public int nested3PartySubIDLength()
    {
        if (!hasNested3PartySubID)
        {
            throw new IllegalArgumentException("No value for optional field: Nested3PartySubID");
        }

        return nested3PartySubIDLength;
    }

    public String nested3PartySubIDAsString()
    {
        return hasNested3PartySubID ? new String(nested3PartySubID, 0, nested3PartySubIDLength) : null;
    }

    public void nested3PartySubID(final AsciiSequenceView view)
    {
        if (!hasNested3PartySubID)
        {
            throw new IllegalArgumentException("No value for optional field: Nested3PartySubID");
        }

        view.wrap(buffer, nested3PartySubIDOffset, nested3PartySubIDLength);
    }


    private int nested3PartySubIDType = MISSING_INT;

    private boolean hasNested3PartySubIDType;

    public int nested3PartySubIDType()
    {
        if (!hasNested3PartySubIDType)
        {
            throw new IllegalArgumentException("No value for optional field: Nested3PartySubIDType");
        }

        return nested3PartySubIDType;
    }

    public boolean hasNested3PartySubIDType()
    {
        return hasNested3PartySubIDType;
    }



    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode Nested3PartySubIDsGroup
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
                    next = new Nested3PartySubIDsGroupDecoder(trailer, messageFields);
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
            case Constants.NESTED3_PARTY_SUB_ID:
                hasNested3PartySubID = true;
                nested3PartySubID = buffer.getChars(nested3PartySubID, valueOffset, valueLength);
                nested3PartySubIDOffset = valueOffset;
                nested3PartySubIDLength = valueLength;
                break;

            case Constants.NESTED3_PARTY_SUB_ID_TYPE:
                hasNested3PartySubIDType = true;
                nested3PartySubIDType = getInt(buffer, valueOffset, endOfField, 954, CODEC_VALIDATION_ENABLED);
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
        this.resetNested3PartySubID();
        this.resetNested3PartySubIDType();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetNested3PartySubID()
    {
        hasNested3PartySubID = false;
    }

    public void resetNested3PartySubIDType()
    {
        hasNested3PartySubIDType = false;
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
        builder.append("\"MessageName\": \"Nested3PartySubIDsGroup\",\n");
        if (hasNested3PartySubID())
        {
            indent(builder, level);
            builder.append("\"Nested3PartySubID\": \"");
            builder.append(this.nested3PartySubID(), 0, nested3PartySubIDLength());
            builder.append("\",\n");
        }

        if (hasNested3PartySubIDType())
        {
            indent(builder, level);
            builder.append("\"Nested3PartySubIDType\": \"");
            builder.append(nested3PartySubIDType);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public Nested3PartySubIDsGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((Nested3PartySubIDsGroupEncoder)encoder);
    }

    public Nested3PartySubIDsGroupEncoder toEncoder(final Nested3PartySubIDsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasNested3PartySubID())
        {
            encoder.nested3PartySubID(this.nested3PartySubID(), 0, nested3PartySubIDLength());
        }

        if (hasNested3PartySubIDType())
        {
            encoder.nested3PartySubIDType(this.nested3PartySubIDType());
        }
        return encoder;
    }

}
    public class Nested3PartySubIDsGroupIterator implements Iterable<Nested3PartySubIDsGroupDecoder>, java.util.Iterator<Nested3PartySubIDsGroupDecoder>
    {
        private final NstdPtys3SubGrpDecoder parent;
        private int remainder;
        private Nested3PartySubIDsGroupDecoder current;

        public Nested3PartySubIDsGroupIterator(final NstdPtys3SubGrpDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }
        public Nested3PartySubIDsGroupDecoder next()
        {
            remainder--;
            final Nested3PartySubIDsGroupDecoder value = current;
            current = current.next();
            return value;
        }
        public int numberFieldValue()
        {
            return parent.hasNoNested3PartySubIDsGroupCounter() ? parent.noNested3PartySubIDsGroupCounter() : 0;
        }
        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.nested3PartySubIDsGroup();
        }
        public Nested3PartySubIDsGroupIterator iterator()
        {
            reset();
            return this;
        }
    }

public Nested3PartySubIDsGroupIterator nested3PartySubIDsGroupIterator();
    public int noNested3PartySubIDsGroupCounter();
    public boolean hasNoNested3PartySubIDsGroupCounter();
    public Nested3PartySubIDsGroupDecoder nested3PartySubIDsGroup();

}
