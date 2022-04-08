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
import com.swiftalgo.ms.codecs.fix50sp2.builder.PtysSubGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.PtysSubGrpEncoder.PartySubIDsGroupEncoder;

public interface PtysSubGrpDecoder 
{



public class PartySubIDsGroupDecoder extends CommonDecoderImpl
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
            ALL_GROUP_FIELDS.add(Constants.PARTY_SUB_ID);
            ALL_GROUP_FIELDS.add(Constants.PARTY_SUB_ID_TYPE);
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
        if (hasPartySubIDType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !PartySubIDType.isValid(partySubIDType()))
        {
            invalidTagId = 803;
            rejectReason = 5;
            return false;
        }
        }
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public PartySubIDsGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private PartySubIDsGroupDecoder next = null;

    public PartySubIDsGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(4);

    private char[] partySubID = new char[1];

    private boolean hasPartySubID;

    public char[] partySubID()
    {
        if (!hasPartySubID)
        {
            throw new IllegalArgumentException("No value for optional field: PartySubID");
        }

        return partySubID;
    }

    public boolean hasPartySubID()
    {
        return hasPartySubID;
    }


    private int partySubIDOffset;

    private int partySubIDLength;

    public int partySubIDLength()
    {
        if (!hasPartySubID)
        {
            throw new IllegalArgumentException("No value for optional field: PartySubID");
        }

        return partySubIDLength;
    }

    public String partySubIDAsString()
    {
        return hasPartySubID ? new String(partySubID, 0, partySubIDLength) : null;
    }

    public void partySubID(final AsciiSequenceView view)
    {
        if (!hasPartySubID)
        {
            throw new IllegalArgumentException("No value for optional field: PartySubID");
        }

        view.wrap(buffer, partySubIDOffset, partySubIDLength);
    }


    private final CharArrayWrapper partySubIDWrapper = new CharArrayWrapper();
    private int partySubIDType = MISSING_INT;

    private boolean hasPartySubIDType;

    public int partySubIDType()
    {
        if (!hasPartySubIDType)
        {
            throw new IllegalArgumentException("No value for optional field: PartySubIDType");
        }

        return partySubIDType;
    }

    public boolean hasPartySubIDType()
    {
        return hasPartySubIDType;
    }



    private final CharArrayWrapper partySubIDTypeWrapper = new CharArrayWrapper();
    public PartySubIDType partySubIDTypeAsEnum()
    {
        if (!hasPartySubIDType)
 return PartySubIDType.NULL_VAL;
        return PartySubIDType.decode(partySubIDType);
    }

    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode PartySubIDsGroup
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
                    next = new PartySubIDsGroupDecoder(trailer, messageFields);
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
            case Constants.PARTY_SUB_ID:
                hasPartySubID = true;
                partySubID = buffer.getChars(partySubID, valueOffset, valueLength);
                partySubIDOffset = valueOffset;
                partySubIDLength = valueLength;
                break;

            case Constants.PARTY_SUB_ID_TYPE:
                hasPartySubIDType = true;
                partySubIDType = getInt(buffer, valueOffset, endOfField, 803, CODEC_VALIDATION_ENABLED);
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
        this.resetPartySubID();
        this.resetPartySubIDType();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetPartySubID()
    {
        hasPartySubID = false;
    }

    public void resetPartySubIDType()
    {
        hasPartySubIDType = false;
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
        builder.append("\"MessageName\": \"PartySubIDsGroup\",\n");
        if (hasPartySubID())
        {
            indent(builder, level);
            builder.append("\"PartySubID\": \"");
            builder.append(this.partySubID(), 0, partySubIDLength());
            builder.append("\",\n");
        }

        if (hasPartySubIDType())
        {
            indent(builder, level);
            builder.append("\"PartySubIDType\": \"");
            builder.append(partySubIDType);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public PtysSubGrpEncoder.PartySubIDsGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((PtysSubGrpEncoder.PartySubIDsGroupEncoder)encoder);
    }

    public PtysSubGrpEncoder.PartySubIDsGroupEncoder toEncoder(final PtysSubGrpEncoder.PartySubIDsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasPartySubID())
        {
            encoder.partySubID(this.partySubID(), 0, partySubIDLength());
        }

        if (hasPartySubIDType())
        {
            encoder.partySubIDType(this.partySubIDType());
        }
        return encoder;
    }

}
    public class PartySubIDsGroupIterator implements Iterable<PartySubIDsGroupDecoder>, java.util.Iterator<PartySubIDsGroupDecoder>
    {
        private final PtysSubGrpDecoder parent;
        private int remainder;
        private PartySubIDsGroupDecoder current;

        public PartySubIDsGroupIterator(final PtysSubGrpDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }

        public PartySubIDsGroupDecoder next()
        {
            remainder--;
            final PartySubIDsGroupDecoder value = current;
            current = current.next();
            return value;
        }

        public int numberFieldValue()
        {
            return parent.hasNoPartySubIDsGroupCounter() ? parent.noPartySubIDsGroupCounter() : 0;
        }

        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.partySubIDsGroup();
        }

        public PartySubIDsGroupIterator iterator()
        {
            reset();
            return this;
        }

    }

    public PartySubIDsGroupIterator partySubIDsGroupIterator();
    public int noPartySubIDsGroupCounter();
    public boolean hasNoPartySubIDsGroupCounter();
    public PartySubIDsGroupDecoder partySubIDsGroup();

}
