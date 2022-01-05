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
import com.swiftalgo.ms.codecs.fix50sp2.builder.NstdPtys2SubGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.NstdPtys2SubGrpEncoder.Nested2PartySubIDsGroupEncoder;

public interface NstdPtys2SubGrpDecoder 
{



public class Nested2PartySubIDsGroupDecoder extends CommonDecoderImpl
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
            ALL_GROUP_FIELDS.add(Constants.NESTED2_PARTY_SUB_ID);
            ALL_GROUP_FIELDS.add(Constants.NESTED2_PARTY_SUB_ID_TYPE);
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
    public Nested2PartySubIDsGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private Nested2PartySubIDsGroupDecoder next = null;

    public Nested2PartySubIDsGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(4);

    private char[] nested2PartySubID = new char[1];

    private boolean hasNested2PartySubID;

    public char[] nested2PartySubID()
    {
        if (!hasNested2PartySubID)
        {
            throw new IllegalArgumentException("No value for optional field: Nested2PartySubID");
        }

        return nested2PartySubID;
    }

    public boolean hasNested2PartySubID()
    {
        return hasNested2PartySubID;
    }


    private int nested2PartySubIDOffset;

    private int nested2PartySubIDLength;

    public int nested2PartySubIDLength()
    {
        if (!hasNested2PartySubID)
        {
            throw new IllegalArgumentException("No value for optional field: Nested2PartySubID");
        }

        return nested2PartySubIDLength;
    }

    public String nested2PartySubIDAsString()
    {
        return hasNested2PartySubID ? new String(nested2PartySubID, 0, nested2PartySubIDLength) : null;
    }

    public void nested2PartySubID(final AsciiSequenceView view)
    {
        if (!hasNested2PartySubID)
        {
            throw new IllegalArgumentException("No value for optional field: Nested2PartySubID");
        }

        view.wrap(buffer, nested2PartySubIDOffset, nested2PartySubIDLength);
    }


    private int nested2PartySubIDType = MISSING_INT;

    private boolean hasNested2PartySubIDType;

    public int nested2PartySubIDType()
    {
        if (!hasNested2PartySubIDType)
        {
            throw new IllegalArgumentException("No value for optional field: Nested2PartySubIDType");
        }

        return nested2PartySubIDType;
    }

    public boolean hasNested2PartySubIDType()
    {
        return hasNested2PartySubIDType;
    }



    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode Nested2PartySubIDsGroup
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
                    next = new Nested2PartySubIDsGroupDecoder(trailer, messageFields);
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
            case Constants.NESTED2_PARTY_SUB_ID:
                hasNested2PartySubID = true;
                nested2PartySubID = buffer.getChars(nested2PartySubID, valueOffset, valueLength);
                nested2PartySubIDOffset = valueOffset;
                nested2PartySubIDLength = valueLength;
                break;

            case Constants.NESTED2_PARTY_SUB_ID_TYPE:
                hasNested2PartySubIDType = true;
                nested2PartySubIDType = getInt(buffer, valueOffset, endOfField, 807, CODEC_VALIDATION_ENABLED);
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
        this.resetNested2PartySubID();
        this.resetNested2PartySubIDType();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetNested2PartySubID()
    {
        hasNested2PartySubID = false;
    }

    public void resetNested2PartySubIDType()
    {
        hasNested2PartySubIDType = false;
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
        builder.append("\"MessageName\": \"Nested2PartySubIDsGroup\",\n");
        if (hasNested2PartySubID())
        {
            indent(builder, level);
            builder.append("\"Nested2PartySubID\": \"");
            builder.append(this.nested2PartySubID(), 0, nested2PartySubIDLength());
            builder.append("\",\n");
        }

        if (hasNested2PartySubIDType())
        {
            indent(builder, level);
            builder.append("\"Nested2PartySubIDType\": \"");
            builder.append(nested2PartySubIDType);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public Nested2PartySubIDsGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((Nested2PartySubIDsGroupEncoder)encoder);
    }

    public Nested2PartySubIDsGroupEncoder toEncoder(final Nested2PartySubIDsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasNested2PartySubID())
        {
            encoder.nested2PartySubID(this.nested2PartySubID(), 0, nested2PartySubIDLength());
        }

        if (hasNested2PartySubIDType())
        {
            encoder.nested2PartySubIDType(this.nested2PartySubIDType());
        }
        return encoder;
    }

}
    public class Nested2PartySubIDsGroupIterator implements Iterable<Nested2PartySubIDsGroupDecoder>, java.util.Iterator<Nested2PartySubIDsGroupDecoder>
    {
        private final NstdPtys2SubGrpDecoder parent;
        private int remainder;
        private Nested2PartySubIDsGroupDecoder current;

        public Nested2PartySubIDsGroupIterator(final NstdPtys2SubGrpDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }
        public Nested2PartySubIDsGroupDecoder next()
        {
            remainder--;
            final Nested2PartySubIDsGroupDecoder value = current;
            current = current.next();
            return value;
        }
        public int numberFieldValue()
        {
            return parent.hasNoNested2PartySubIDsGroupCounter() ? parent.noNested2PartySubIDsGroupCounter() : 0;
        }
        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.nested2PartySubIDsGroup();
        }
        public Nested2PartySubIDsGroupIterator iterator()
        {
            reset();
            return this;
        }
    }

public Nested2PartySubIDsGroupIterator nested2PartySubIDsGroupIterator();
    public int noNested2PartySubIDsGroupCounter();
    public boolean hasNoNested2PartySubIDsGroupCounter();
    public Nested2PartySubIDsGroupDecoder nested2PartySubIDsGroup();

}
