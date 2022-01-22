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
import com.swiftalgo.ms.codecs.fix50sp2.builder.RootSubPartiesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.RootSubPartiesEncoder.RootPartySubIDsGroupEncoder;

public interface RootSubPartiesDecoder 
{



public class RootPartySubIDsGroupDecoder extends CommonDecoderImpl
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
            ALL_GROUP_FIELDS.add(Constants.ROOT_PARTY_SUB_ID);
            ALL_GROUP_FIELDS.add(Constants.ROOT_PARTY_SUB_ID_TYPE);
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
    public RootPartySubIDsGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private RootPartySubIDsGroupDecoder next = null;

    public RootPartySubIDsGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(4);

    private char[] rootPartySubID = new char[1];

    private boolean hasRootPartySubID;

    public char[] rootPartySubID()
    {
        if (!hasRootPartySubID)
        {
            throw new IllegalArgumentException("No value for optional field: RootPartySubID");
        }

        return rootPartySubID;
    }

    public boolean hasRootPartySubID()
    {
        return hasRootPartySubID;
    }


    private int rootPartySubIDOffset;

    private int rootPartySubIDLength;

    public int rootPartySubIDLength()
    {
        if (!hasRootPartySubID)
        {
            throw new IllegalArgumentException("No value for optional field: RootPartySubID");
        }

        return rootPartySubIDLength;
    }

    public String rootPartySubIDAsString()
    {
        return hasRootPartySubID ? new String(rootPartySubID, 0, rootPartySubIDLength) : null;
    }

    public void rootPartySubID(final AsciiSequenceView view)
    {
        if (!hasRootPartySubID)
        {
            throw new IllegalArgumentException("No value for optional field: RootPartySubID");
        }

        view.wrap(buffer, rootPartySubIDOffset, rootPartySubIDLength);
    }


    private final CharArrayWrapper rootPartySubIDWrapper = new CharArrayWrapper();
    private int rootPartySubIDType = MISSING_INT;

    private boolean hasRootPartySubIDType;

    public int rootPartySubIDType()
    {
        if (!hasRootPartySubIDType)
        {
            throw new IllegalArgumentException("No value for optional field: RootPartySubIDType");
        }

        return rootPartySubIDType;
    }

    public boolean hasRootPartySubIDType()
    {
        return hasRootPartySubIDType;
    }



    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode RootPartySubIDsGroup
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
                    next = new RootPartySubIDsGroupDecoder(trailer, messageFields);
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
            case Constants.ROOT_PARTY_SUB_ID:
                hasRootPartySubID = true;
                rootPartySubID = buffer.getChars(rootPartySubID, valueOffset, valueLength);
                rootPartySubIDOffset = valueOffset;
                rootPartySubIDLength = valueLength;
                break;

            case Constants.ROOT_PARTY_SUB_ID_TYPE:
                hasRootPartySubIDType = true;
                rootPartySubIDType = getInt(buffer, valueOffset, endOfField, 1122, CODEC_VALIDATION_ENABLED);
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
        this.resetRootPartySubID();
        this.resetRootPartySubIDType();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetRootPartySubID()
    {
        hasRootPartySubID = false;
    }

    public void resetRootPartySubIDType()
    {
        hasRootPartySubIDType = false;
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
        builder.append("\"MessageName\": \"RootPartySubIDsGroup\",\n");
        if (hasRootPartySubID())
        {
            indent(builder, level);
            builder.append("\"RootPartySubID\": \"");
            builder.append(this.rootPartySubID(), 0, rootPartySubIDLength());
            builder.append("\",\n");
        }

        if (hasRootPartySubIDType())
        {
            indent(builder, level);
            builder.append("\"RootPartySubIDType\": \"");
            builder.append(rootPartySubIDType);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public RootSubPartiesEncoder.RootPartySubIDsGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((RootSubPartiesEncoder.RootPartySubIDsGroupEncoder)encoder);
    }

    public RootSubPartiesEncoder.RootPartySubIDsGroupEncoder toEncoder(final RootSubPartiesEncoder.RootPartySubIDsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasRootPartySubID())
        {
            encoder.rootPartySubID(this.rootPartySubID(), 0, rootPartySubIDLength());
        }

        if (hasRootPartySubIDType())
        {
            encoder.rootPartySubIDType(this.rootPartySubIDType());
        }
        return encoder;
    }

}
    public class RootPartySubIDsGroupIterator implements Iterable<RootPartySubIDsGroupDecoder>, java.util.Iterator<RootPartySubIDsGroupDecoder>
    {
        private final RootSubPartiesDecoder parent;
        private int remainder;
        private RootPartySubIDsGroupDecoder current;

        public RootPartySubIDsGroupIterator(final RootSubPartiesDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }

        public RootPartySubIDsGroupDecoder next()
        {
            remainder--;
            final RootPartySubIDsGroupDecoder value = current;
            current = current.next();
            return value;
        }

        public int numberFieldValue()
        {
            return parent.hasNoRootPartySubIDsGroupCounter() ? parent.noRootPartySubIDsGroupCounter() : 0;
        }

        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.rootPartySubIDsGroup();
        }

        public RootPartySubIDsGroupIterator iterator()
        {
            reset();
            return this;
        }

    }

    public RootPartySubIDsGroupIterator rootPartySubIDsGroupIterator();
    public int noRootPartySubIDsGroupCounter();
    public boolean hasNoRootPartySubIDsGroupCounter();
    public RootPartySubIDsGroupDecoder rootPartySubIDsGroup();

}
