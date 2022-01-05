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
import com.swiftalgo.ms.codecs.fix50sp2.builder.NstdPtys4SubGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.NstdPtys4SubGrpEncoder.Nested4PartySubIDsGroupEncoder;

public interface NstdPtys4SubGrpDecoder 
{



public class Nested4PartySubIDsGroupDecoder extends CommonDecoderImpl
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
            ALL_GROUP_FIELDS.add(Constants.NESTED4_PARTY_SUB_ID);
            ALL_GROUP_FIELDS.add(Constants.NESTED4_PARTY_SUB_ID_TYPE);
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
    public Nested4PartySubIDsGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private Nested4PartySubIDsGroupDecoder next = null;

    public Nested4PartySubIDsGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(4);

    private char[] nested4PartySubID = new char[1];

    private boolean hasNested4PartySubID;

    public char[] nested4PartySubID()
    {
        if (!hasNested4PartySubID)
        {
            throw new IllegalArgumentException("No value for optional field: Nested4PartySubID");
        }

        return nested4PartySubID;
    }

    public boolean hasNested4PartySubID()
    {
        return hasNested4PartySubID;
    }


    private int nested4PartySubIDOffset;

    private int nested4PartySubIDLength;

    public int nested4PartySubIDLength()
    {
        if (!hasNested4PartySubID)
        {
            throw new IllegalArgumentException("No value for optional field: Nested4PartySubID");
        }

        return nested4PartySubIDLength;
    }

    public String nested4PartySubIDAsString()
    {
        return hasNested4PartySubID ? new String(nested4PartySubID, 0, nested4PartySubIDLength) : null;
    }

    public void nested4PartySubID(final AsciiSequenceView view)
    {
        if (!hasNested4PartySubID)
        {
            throw new IllegalArgumentException("No value for optional field: Nested4PartySubID");
        }

        view.wrap(buffer, nested4PartySubIDOffset, nested4PartySubIDLength);
    }


    private int nested4PartySubIDType = MISSING_INT;

    private boolean hasNested4PartySubIDType;

    public int nested4PartySubIDType()
    {
        if (!hasNested4PartySubIDType)
        {
            throw new IllegalArgumentException("No value for optional field: Nested4PartySubIDType");
        }

        return nested4PartySubIDType;
    }

    public boolean hasNested4PartySubIDType()
    {
        return hasNested4PartySubIDType;
    }



    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode Nested4PartySubIDsGroup
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
                    next = new Nested4PartySubIDsGroupDecoder(trailer, messageFields);
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
            case Constants.NESTED4_PARTY_SUB_ID:
                hasNested4PartySubID = true;
                nested4PartySubID = buffer.getChars(nested4PartySubID, valueOffset, valueLength);
                nested4PartySubIDOffset = valueOffset;
                nested4PartySubIDLength = valueLength;
                break;

            case Constants.NESTED4_PARTY_SUB_ID_TYPE:
                hasNested4PartySubIDType = true;
                nested4PartySubIDType = getInt(buffer, valueOffset, endOfField, 1411, CODEC_VALIDATION_ENABLED);
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
        this.resetNested4PartySubID();
        this.resetNested4PartySubIDType();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetNested4PartySubID()
    {
        hasNested4PartySubID = false;
    }

    public void resetNested4PartySubIDType()
    {
        hasNested4PartySubIDType = false;
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
        builder.append("\"MessageName\": \"Nested4PartySubIDsGroup\",\n");
        if (hasNested4PartySubID())
        {
            indent(builder, level);
            builder.append("\"Nested4PartySubID\": \"");
            builder.append(this.nested4PartySubID(), 0, nested4PartySubIDLength());
            builder.append("\",\n");
        }

        if (hasNested4PartySubIDType())
        {
            indent(builder, level);
            builder.append("\"Nested4PartySubIDType\": \"");
            builder.append(nested4PartySubIDType);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public Nested4PartySubIDsGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((Nested4PartySubIDsGroupEncoder)encoder);
    }

    public Nested4PartySubIDsGroupEncoder toEncoder(final Nested4PartySubIDsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasNested4PartySubID())
        {
            encoder.nested4PartySubID(this.nested4PartySubID(), 0, nested4PartySubIDLength());
        }

        if (hasNested4PartySubIDType())
        {
            encoder.nested4PartySubIDType(this.nested4PartySubIDType());
        }
        return encoder;
    }

}
    public class Nested4PartySubIDsGroupIterator implements Iterable<Nested4PartySubIDsGroupDecoder>, java.util.Iterator<Nested4PartySubIDsGroupDecoder>
    {
        private final NstdPtys4SubGrpDecoder parent;
        private int remainder;
        private Nested4PartySubIDsGroupDecoder current;

        public Nested4PartySubIDsGroupIterator(final NstdPtys4SubGrpDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }
        public Nested4PartySubIDsGroupDecoder next()
        {
            remainder--;
            final Nested4PartySubIDsGroupDecoder value = current;
            current = current.next();
            return value;
        }
        public int numberFieldValue()
        {
            return parent.hasNoNested4PartySubIDsGroupCounter() ? parent.noNested4PartySubIDsGroupCounter() : 0;
        }
        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.nested4PartySubIDsGroup();
        }
        public Nested4PartySubIDsGroupIterator iterator()
        {
            reset();
            return this;
        }
    }

public Nested4PartySubIDsGroupIterator nested4PartySubIDsGroupIterator();
    public int noNested4PartySubIDsGroupCounter();
    public boolean hasNoNested4PartySubIDsGroupCounter();
    public Nested4PartySubIDsGroupDecoder nested4PartySubIDsGroup();

}
