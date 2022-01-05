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
import com.swiftalgo.ms.codecs.fix50sp2.builder.InstrumentPtysSubGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.InstrumentPtysSubGrpEncoder.InstrumentPartySubIDsGroupEncoder;

public interface InstrumentPtysSubGrpDecoder 
{



public class InstrumentPartySubIDsGroupDecoder extends CommonDecoderImpl
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
            ALL_GROUP_FIELDS.add(Constants.INSTRUMENT_PARTY_SUB_ID);
            ALL_GROUP_FIELDS.add(Constants.INSTRUMENT_PARTY_SUB_ID_TYPE);
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
    public InstrumentPartySubIDsGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private InstrumentPartySubIDsGroupDecoder next = null;

    public InstrumentPartySubIDsGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(4);

    private char[] instrumentPartySubID = new char[1];

    private boolean hasInstrumentPartySubID;

    public char[] instrumentPartySubID()
    {
        if (!hasInstrumentPartySubID)
        {
            throw new IllegalArgumentException("No value for optional field: InstrumentPartySubID");
        }

        return instrumentPartySubID;
    }

    public boolean hasInstrumentPartySubID()
    {
        return hasInstrumentPartySubID;
    }


    private int instrumentPartySubIDOffset;

    private int instrumentPartySubIDLength;

    public int instrumentPartySubIDLength()
    {
        if (!hasInstrumentPartySubID)
        {
            throw new IllegalArgumentException("No value for optional field: InstrumentPartySubID");
        }

        return instrumentPartySubIDLength;
    }

    public String instrumentPartySubIDAsString()
    {
        return hasInstrumentPartySubID ? new String(instrumentPartySubID, 0, instrumentPartySubIDLength) : null;
    }

    public void instrumentPartySubID(final AsciiSequenceView view)
    {
        if (!hasInstrumentPartySubID)
        {
            throw new IllegalArgumentException("No value for optional field: InstrumentPartySubID");
        }

        view.wrap(buffer, instrumentPartySubIDOffset, instrumentPartySubIDLength);
    }


    private int instrumentPartySubIDType = MISSING_INT;

    private boolean hasInstrumentPartySubIDType;

    public int instrumentPartySubIDType()
    {
        if (!hasInstrumentPartySubIDType)
        {
            throw new IllegalArgumentException("No value for optional field: InstrumentPartySubIDType");
        }

        return instrumentPartySubIDType;
    }

    public boolean hasInstrumentPartySubIDType()
    {
        return hasInstrumentPartySubIDType;
    }



    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode InstrumentPartySubIDsGroup
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
                    next = new InstrumentPartySubIDsGroupDecoder(trailer, messageFields);
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
            case Constants.INSTRUMENT_PARTY_SUB_ID:
                hasInstrumentPartySubID = true;
                instrumentPartySubID = buffer.getChars(instrumentPartySubID, valueOffset, valueLength);
                instrumentPartySubIDOffset = valueOffset;
                instrumentPartySubIDLength = valueLength;
                break;

            case Constants.INSTRUMENT_PARTY_SUB_ID_TYPE:
                hasInstrumentPartySubIDType = true;
                instrumentPartySubIDType = getInt(buffer, valueOffset, endOfField, 1054, CODEC_VALIDATION_ENABLED);
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
        this.resetInstrumentPartySubID();
        this.resetInstrumentPartySubIDType();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetInstrumentPartySubID()
    {
        hasInstrumentPartySubID = false;
    }

    public void resetInstrumentPartySubIDType()
    {
        hasInstrumentPartySubIDType = false;
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
        builder.append("\"MessageName\": \"InstrumentPartySubIDsGroup\",\n");
        if (hasInstrumentPartySubID())
        {
            indent(builder, level);
            builder.append("\"InstrumentPartySubID\": \"");
            builder.append(this.instrumentPartySubID(), 0, instrumentPartySubIDLength());
            builder.append("\",\n");
        }

        if (hasInstrumentPartySubIDType())
        {
            indent(builder, level);
            builder.append("\"InstrumentPartySubIDType\": \"");
            builder.append(instrumentPartySubIDType);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public InstrumentPartySubIDsGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((InstrumentPartySubIDsGroupEncoder)encoder);
    }

    public InstrumentPartySubIDsGroupEncoder toEncoder(final InstrumentPartySubIDsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasInstrumentPartySubID())
        {
            encoder.instrumentPartySubID(this.instrumentPartySubID(), 0, instrumentPartySubIDLength());
        }

        if (hasInstrumentPartySubIDType())
        {
            encoder.instrumentPartySubIDType(this.instrumentPartySubIDType());
        }
        return encoder;
    }

}
    public class InstrumentPartySubIDsGroupIterator implements Iterable<InstrumentPartySubIDsGroupDecoder>, java.util.Iterator<InstrumentPartySubIDsGroupDecoder>
    {
        private final InstrumentPtysSubGrpDecoder parent;
        private int remainder;
        private InstrumentPartySubIDsGroupDecoder current;

        public InstrumentPartySubIDsGroupIterator(final InstrumentPtysSubGrpDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }
        public InstrumentPartySubIDsGroupDecoder next()
        {
            remainder--;
            final InstrumentPartySubIDsGroupDecoder value = current;
            current = current.next();
            return value;
        }
        public int numberFieldValue()
        {
            return parent.hasNoInstrumentPartySubIDsGroupCounter() ? parent.noInstrumentPartySubIDsGroupCounter() : 0;
        }
        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.instrumentPartySubIDsGroup();
        }
        public InstrumentPartySubIDsGroupIterator iterator()
        {
            reset();
            return this;
        }
    }

public InstrumentPartySubIDsGroupIterator instrumentPartySubIDsGroupIterator();
    public int noInstrumentPartySubIDsGroupCounter();
    public boolean hasNoInstrumentPartySubIDsGroupCounter();
    public InstrumentPartySubIDsGroupDecoder instrumentPartySubIDsGroup();

}
