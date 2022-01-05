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
import com.swiftalgo.ms.codecs.fix50sp2.builder.DerivativeInstrumentPartySubIDsGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.DerivativeInstrumentPartySubIDsGrpEncoder.DerivativeInstrumentPartySubIDsGroupEncoder;

public interface DerivativeInstrumentPartySubIDsGrpDecoder 
{



public class DerivativeInstrumentPartySubIDsGroupDecoder extends CommonDecoderImpl
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
            ALL_GROUP_FIELDS.add(Constants.DERIVATIVE_INSTRUMENT_PARTY_SUB_ID);
            ALL_GROUP_FIELDS.add(Constants.DERIVATIVE_INSTRUMENT_PARTY_SUB_ID_TYPE);
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
    public DerivativeInstrumentPartySubIDsGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private DerivativeInstrumentPartySubIDsGroupDecoder next = null;

    public DerivativeInstrumentPartySubIDsGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(4);

    private char[] derivativeInstrumentPartySubID = new char[1];

    private boolean hasDerivativeInstrumentPartySubID;

    public char[] derivativeInstrumentPartySubID()
    {
        if (!hasDerivativeInstrumentPartySubID)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeInstrumentPartySubID");
        }

        return derivativeInstrumentPartySubID;
    }

    public boolean hasDerivativeInstrumentPartySubID()
    {
        return hasDerivativeInstrumentPartySubID;
    }


    private int derivativeInstrumentPartySubIDOffset;

    private int derivativeInstrumentPartySubIDLength;

    public int derivativeInstrumentPartySubIDLength()
    {
        if (!hasDerivativeInstrumentPartySubID)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeInstrumentPartySubID");
        }

        return derivativeInstrumentPartySubIDLength;
    }

    public String derivativeInstrumentPartySubIDAsString()
    {
        return hasDerivativeInstrumentPartySubID ? new String(derivativeInstrumentPartySubID, 0, derivativeInstrumentPartySubIDLength) : null;
    }

    public void derivativeInstrumentPartySubID(final AsciiSequenceView view)
    {
        if (!hasDerivativeInstrumentPartySubID)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeInstrumentPartySubID");
        }

        view.wrap(buffer, derivativeInstrumentPartySubIDOffset, derivativeInstrumentPartySubIDLength);
    }


    private int derivativeInstrumentPartySubIDType = MISSING_INT;

    private boolean hasDerivativeInstrumentPartySubIDType;

    public int derivativeInstrumentPartySubIDType()
    {
        if (!hasDerivativeInstrumentPartySubIDType)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeInstrumentPartySubIDType");
        }

        return derivativeInstrumentPartySubIDType;
    }

    public boolean hasDerivativeInstrumentPartySubIDType()
    {
        return hasDerivativeInstrumentPartySubIDType;
    }



    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode DerivativeInstrumentPartySubIDsGroup
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
                    next = new DerivativeInstrumentPartySubIDsGroupDecoder(trailer, messageFields);
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
            case Constants.DERIVATIVE_INSTRUMENT_PARTY_SUB_ID:
                hasDerivativeInstrumentPartySubID = true;
                derivativeInstrumentPartySubID = buffer.getChars(derivativeInstrumentPartySubID, valueOffset, valueLength);
                derivativeInstrumentPartySubIDOffset = valueOffset;
                derivativeInstrumentPartySubIDLength = valueLength;
                break;

            case Constants.DERIVATIVE_INSTRUMENT_PARTY_SUB_ID_TYPE:
                hasDerivativeInstrumentPartySubIDType = true;
                derivativeInstrumentPartySubIDType = getInt(buffer, valueOffset, endOfField, 1298, CODEC_VALIDATION_ENABLED);
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
        this.resetDerivativeInstrumentPartySubID();
        this.resetDerivativeInstrumentPartySubIDType();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetDerivativeInstrumentPartySubID()
    {
        hasDerivativeInstrumentPartySubID = false;
    }

    public void resetDerivativeInstrumentPartySubIDType()
    {
        hasDerivativeInstrumentPartySubIDType = false;
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
        builder.append("\"MessageName\": \"DerivativeInstrumentPartySubIDsGroup\",\n");
        if (hasDerivativeInstrumentPartySubID())
        {
            indent(builder, level);
            builder.append("\"DerivativeInstrumentPartySubID\": \"");
            builder.append(this.derivativeInstrumentPartySubID(), 0, derivativeInstrumentPartySubIDLength());
            builder.append("\",\n");
        }

        if (hasDerivativeInstrumentPartySubIDType())
        {
            indent(builder, level);
            builder.append("\"DerivativeInstrumentPartySubIDType\": \"");
            builder.append(derivativeInstrumentPartySubIDType);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public DerivativeInstrumentPartySubIDsGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((DerivativeInstrumentPartySubIDsGroupEncoder)encoder);
    }

    public DerivativeInstrumentPartySubIDsGroupEncoder toEncoder(final DerivativeInstrumentPartySubIDsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasDerivativeInstrumentPartySubID())
        {
            encoder.derivativeInstrumentPartySubID(this.derivativeInstrumentPartySubID(), 0, derivativeInstrumentPartySubIDLength());
        }

        if (hasDerivativeInstrumentPartySubIDType())
        {
            encoder.derivativeInstrumentPartySubIDType(this.derivativeInstrumentPartySubIDType());
        }
        return encoder;
    }

}
    public class DerivativeInstrumentPartySubIDsGroupIterator implements Iterable<DerivativeInstrumentPartySubIDsGroupDecoder>, java.util.Iterator<DerivativeInstrumentPartySubIDsGroupDecoder>
    {
        private final DerivativeInstrumentPartySubIDsGrpDecoder parent;
        private int remainder;
        private DerivativeInstrumentPartySubIDsGroupDecoder current;

        public DerivativeInstrumentPartySubIDsGroupIterator(final DerivativeInstrumentPartySubIDsGrpDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }
        public DerivativeInstrumentPartySubIDsGroupDecoder next()
        {
            remainder--;
            final DerivativeInstrumentPartySubIDsGroupDecoder value = current;
            current = current.next();
            return value;
        }
        public int numberFieldValue()
        {
            return parent.hasNoDerivativeInstrumentPartySubIDsGroupCounter() ? parent.noDerivativeInstrumentPartySubIDsGroupCounter() : 0;
        }
        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.derivativeInstrumentPartySubIDsGroup();
        }
        public DerivativeInstrumentPartySubIDsGroupIterator iterator()
        {
            reset();
            return this;
        }
    }

public DerivativeInstrumentPartySubIDsGroupIterator derivativeInstrumentPartySubIDsGroupIterator();
    public int noDerivativeInstrumentPartySubIDsGroupCounter();
    public boolean hasNoDerivativeInstrumentPartySubIDsGroupCounter();
    public DerivativeInstrumentPartySubIDsGroupDecoder derivativeInstrumentPartySubIDsGroup();

}
