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
import com.swiftalgo.ms.codecs.fix50sp2.builder.DerivativeInstrumentPartiesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.DerivativeInstrumentPartiesEncoder.DerivativeInstrumentPartiesGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.DerivativeInstrumentPartySubIDsGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.DerivativeInstrumentPartySubIDsGrpEncoder.DerivativeInstrumentPartySubIDsGroupEncoder;

public interface DerivativeInstrumentPartiesDecoder 
{



public class DerivativeInstrumentPartiesGroupDecoder extends CommonDecoderImpl implements DerivativeInstrumentPartySubIDsGrpDecoder
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(0);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
        }
    }

    public final IntHashSet GROUP_FIELDS = new IntHashSet(6);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            GROUP_FIELDS.add(Constants.DERIVATIVE_INSTRUMENT_PARTY_ID);
            GROUP_FIELDS.add(Constants.DERIVATIVE_INSTRUMENT_PARTY_ID_SOURCE);
            GROUP_FIELDS.add(Constants.DERIVATIVE_INSTRUMENT_PARTY_ROLE);
        }
    }

    public final IntHashSet ALL_GROUP_FIELDS = new IntHashSet(6);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            ALL_GROUP_FIELDS.add(Constants.DERIVATIVE_INSTRUMENT_PARTY_ID);
            ALL_GROUP_FIELDS.add(Constants.DERIVATIVE_INSTRUMENT_PARTY_ID_SOURCE);
            ALL_GROUP_FIELDS.add(Constants.DERIVATIVE_INSTRUMENT_PARTY_ROLE);
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
        if (hasNoDerivativeInstrumentPartySubIDsGroupCounter)
        {
            {
                int count = 0;
                final DerivativeInstrumentPartySubIDsGroupIterator iterator = derivativeInstrumentPartySubIDsGroupIterator.iterator();
                for (final DerivativeInstrumentPartySubIDsGroupDecoder group : iterator)
                {
                    count++;                    if (!group.validate())
                    {
                        invalidTagId = group.invalidTagId();
                        rejectReason = group.rejectReason();
                        return false;
                    }
                }
                if (count != iterator.numberFieldValue())
                {
                    invalidTagId = 1296;
                    rejectReason = 16;
                    return false;
                }
            }
        }
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public DerivativeInstrumentPartiesGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private DerivativeInstrumentPartiesGroupDecoder next = null;

    public DerivativeInstrumentPartiesGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(8);

    private char[] derivativeInstrumentPartyID = new char[1];

    private boolean hasDerivativeInstrumentPartyID;

    public char[] derivativeInstrumentPartyID()
    {
        if (!hasDerivativeInstrumentPartyID)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeInstrumentPartyID");
        }

        return derivativeInstrumentPartyID;
    }

    public boolean hasDerivativeInstrumentPartyID()
    {
        return hasDerivativeInstrumentPartyID;
    }


    private int derivativeInstrumentPartyIDOffset;

    private int derivativeInstrumentPartyIDLength;

    public int derivativeInstrumentPartyIDLength()
    {
        if (!hasDerivativeInstrumentPartyID)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeInstrumentPartyID");
        }

        return derivativeInstrumentPartyIDLength;
    }

    public String derivativeInstrumentPartyIDAsString()
    {
        return hasDerivativeInstrumentPartyID ? new String(derivativeInstrumentPartyID, 0, derivativeInstrumentPartyIDLength) : null;
    }

    public void derivativeInstrumentPartyID(final AsciiSequenceView view)
    {
        if (!hasDerivativeInstrumentPartyID)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeInstrumentPartyID");
        }

        view.wrap(buffer, derivativeInstrumentPartyIDOffset, derivativeInstrumentPartyIDLength);
    }


    private char[] derivativeInstrumentPartyIDSource = new char[1];

    private boolean hasDerivativeInstrumentPartyIDSource;

    public char[] derivativeInstrumentPartyIDSource()
    {
        if (!hasDerivativeInstrumentPartyIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeInstrumentPartyIDSource");
        }

        return derivativeInstrumentPartyIDSource;
    }

    public boolean hasDerivativeInstrumentPartyIDSource()
    {
        return hasDerivativeInstrumentPartyIDSource;
    }


    private int derivativeInstrumentPartyIDSourceOffset;

    private int derivativeInstrumentPartyIDSourceLength;

    public int derivativeInstrumentPartyIDSourceLength()
    {
        if (!hasDerivativeInstrumentPartyIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeInstrumentPartyIDSource");
        }

        return derivativeInstrumentPartyIDSourceLength;
    }

    public String derivativeInstrumentPartyIDSourceAsString()
    {
        return hasDerivativeInstrumentPartyIDSource ? new String(derivativeInstrumentPartyIDSource, 0, derivativeInstrumentPartyIDSourceLength) : null;
    }

    public void derivativeInstrumentPartyIDSource(final AsciiSequenceView view)
    {
        if (!hasDerivativeInstrumentPartyIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeInstrumentPartyIDSource");
        }

        view.wrap(buffer, derivativeInstrumentPartyIDSourceOffset, derivativeInstrumentPartyIDSourceLength);
    }


    private int derivativeInstrumentPartyRole = MISSING_INT;

    private boolean hasDerivativeInstrumentPartyRole;

    public int derivativeInstrumentPartyRole()
    {
        if (!hasDerivativeInstrumentPartyRole)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeInstrumentPartyRole");
        }

        return derivativeInstrumentPartyRole;
    }

    public boolean hasDerivativeInstrumentPartyRole()
    {
        return hasDerivativeInstrumentPartyRole;
    }





    private DerivativeInstrumentPartySubIDsGroupDecoder derivativeInstrumentPartySubIDsGroup = null;
    public DerivativeInstrumentPartySubIDsGroupDecoder derivativeInstrumentPartySubIDsGroup()
    {
        return derivativeInstrumentPartySubIDsGroup;
    }

    private int noDerivativeInstrumentPartySubIDsGroupCounter = MISSING_INT;

    private boolean hasNoDerivativeInstrumentPartySubIDsGroupCounter;

    public int noDerivativeInstrumentPartySubIDsGroupCounter()
    {
        if (!hasNoDerivativeInstrumentPartySubIDsGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoDerivativeInstrumentPartySubIDsGroupCounter");
        }

        return noDerivativeInstrumentPartySubIDsGroupCounter;
    }

    public boolean hasNoDerivativeInstrumentPartySubIDsGroupCounter()
    {
        return hasNoDerivativeInstrumentPartySubIDsGroupCounter;
    }




    private DerivativeInstrumentPartySubIDsGroupIterator derivativeInstrumentPartySubIDsGroupIterator = new DerivativeInstrumentPartySubIDsGroupIterator(this);
    public DerivativeInstrumentPartySubIDsGroupIterator derivativeInstrumentPartySubIDsGroupIterator()
    {
        return derivativeInstrumentPartySubIDsGroupIterator.iterator();
    }


    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode DerivativeInstrumentPartiesGroup
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
                    next = new DerivativeInstrumentPartiesGroupDecoder(trailer, messageFields);
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
            case Constants.DERIVATIVE_INSTRUMENT_PARTY_ID:
                hasDerivativeInstrumentPartyID = true;
                derivativeInstrumentPartyID = buffer.getChars(derivativeInstrumentPartyID, valueOffset, valueLength);
                derivativeInstrumentPartyIDOffset = valueOffset;
                derivativeInstrumentPartyIDLength = valueLength;
                break;

            case Constants.DERIVATIVE_INSTRUMENT_PARTY_ID_SOURCE:
                hasDerivativeInstrumentPartyIDSource = true;
                derivativeInstrumentPartyIDSource = buffer.getChars(derivativeInstrumentPartyIDSource, valueOffset, valueLength);
                derivativeInstrumentPartyIDSourceOffset = valueOffset;
                derivativeInstrumentPartyIDSourceLength = valueLength;
                break;

            case Constants.DERIVATIVE_INSTRUMENT_PARTY_ROLE:
                hasDerivativeInstrumentPartyRole = true;
                derivativeInstrumentPartyRole = getInt(buffer, valueOffset, endOfField, 1295, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.NO_DERIVATIVE_INSTRUMENT_PARTY_SUB_IDS:
                hasNoDerivativeInstrumentPartySubIDsGroupCounter = true;
                noDerivativeInstrumentPartySubIDsGroupCounter = getInt(buffer, valueOffset, endOfField, 1296, CODEC_VALIDATION_ENABLED);
                if (derivativeInstrumentPartySubIDsGroup == null)
                {
                    derivativeInstrumentPartySubIDsGroup = new DerivativeInstrumentPartySubIDsGroupDecoder(trailer, messageFields);
                }
                DerivativeInstrumentPartySubIDsGroupDecoder derivativeInstrumentPartySubIDsGroupCurrent = derivativeInstrumentPartySubIDsGroup;
                position = endOfField + 1;
                final int noDerivativeInstrumentPartySubIDsGroupCounter = this.noDerivativeInstrumentPartySubIDsGroupCounter;
                for (int i = 0; i < noDerivativeInstrumentPartySubIDsGroupCounter && position < end; i++)
                {
                    if (derivativeInstrumentPartySubIDsGroupCurrent != null)
                    {
                        position += derivativeInstrumentPartySubIDsGroupCurrent.decode(buffer, position, end - position);
                        derivativeInstrumentPartySubIDsGroupCurrent = derivativeInstrumentPartySubIDsGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (derivativeInstrumentPartySubIDsGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
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
        this.resetDerivativeInstrumentPartyID();
        this.resetDerivativeInstrumentPartyIDSource();
        this.resetDerivativeInstrumentPartyRole();
        this.resetDerivativeInstrumentPartySubIDsGroup();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetDerivativeInstrumentPartyID()
    {
        hasDerivativeInstrumentPartyID = false;
    }

    public void resetDerivativeInstrumentPartyIDSource()
    {
        hasDerivativeInstrumentPartyIDSource = false;
    }

    public void resetDerivativeInstrumentPartyRole()
    {
        hasDerivativeInstrumentPartyRole = false;
    }

    public void resetDerivativeInstrumentPartySubIDsGroup()
    {
        for (final DerivativeInstrumentPartySubIDsGroupDecoder derivativeInstrumentPartySubIDsGroupDecoder : derivativeInstrumentPartySubIDsGroupIterator.iterator())
        {
            derivativeInstrumentPartySubIDsGroupDecoder.reset();
            if (derivativeInstrumentPartySubIDsGroupDecoder.next() == null)
            {
                break;
            }
        }
        noDerivativeInstrumentPartySubIDsGroupCounter = MISSING_INT;
        hasNoDerivativeInstrumentPartySubIDsGroupCounter = false;
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
        builder.append("\"MessageName\": \"DerivativeInstrumentPartiesGroup\",\n");
        if (hasDerivativeInstrumentPartyID())
        {
            indent(builder, level);
            builder.append("\"DerivativeInstrumentPartyID\": \"");
            builder.append(this.derivativeInstrumentPartyID(), 0, derivativeInstrumentPartyIDLength());
            builder.append("\",\n");
        }

        if (hasDerivativeInstrumentPartyIDSource())
        {
            indent(builder, level);
            builder.append("\"DerivativeInstrumentPartyIDSource\": \"");
            builder.append(this.derivativeInstrumentPartyIDSource(), 0, derivativeInstrumentPartyIDSourceLength());
            builder.append("\",\n");
        }

        if (hasDerivativeInstrumentPartyRole())
        {
            indent(builder, level);
            builder.append("\"DerivativeInstrumentPartyRole\": \"");
            builder.append(derivativeInstrumentPartyRole);
            builder.append("\",\n");
        }

    if (hasNoDerivativeInstrumentPartySubIDsGroupCounter)
    {
        indent(builder, level);
        builder.append("\"DerivativeInstrumentPartySubIDsGroup\": [\n");
        DerivativeInstrumentPartySubIDsGroupDecoder derivativeInstrumentPartySubIDsGroup = this.derivativeInstrumentPartySubIDsGroup;
        for (int i = 0, size = this.noDerivativeInstrumentPartySubIDsGroupCounter; i < size; i++)
        {
            indent(builder, level);
            derivativeInstrumentPartySubIDsGroup.appendTo(builder, level + 1);            if (derivativeInstrumentPartySubIDsGroup.next() != null)
            {
                builder.append(',');
            }
            builder.append('\n');
            derivativeInstrumentPartySubIDsGroup = derivativeInstrumentPartySubIDsGroup.next();        }
        indent(builder, level);
        builder.append("],\n");
    }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public DerivativeInstrumentPartiesGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((DerivativeInstrumentPartiesGroupEncoder)encoder);
    }

    public DerivativeInstrumentPartiesGroupEncoder toEncoder(final DerivativeInstrumentPartiesGroupEncoder encoder)
    {
        encoder.reset();
        if (hasDerivativeInstrumentPartyID())
        {
            encoder.derivativeInstrumentPartyID(this.derivativeInstrumentPartyID(), 0, derivativeInstrumentPartyIDLength());
        }

        if (hasDerivativeInstrumentPartyIDSource())
        {
            encoder.derivativeInstrumentPartyIDSource(this.derivativeInstrumentPartyIDSource(), 0, derivativeInstrumentPartyIDSourceLength());
        }

        if (hasDerivativeInstrumentPartyRole())
        {
            encoder.derivativeInstrumentPartyRole(this.derivativeInstrumentPartyRole());
        }


        final DerivativeInstrumentPartySubIDsGrpEncoder derivativeInstrumentPartySubIDsGrp = encoder.derivativeInstrumentPartySubIDsGrp();        if (hasNoDerivativeInstrumentPartySubIDsGroupCounter)
        {
            final int size = this.noDerivativeInstrumentPartySubIDsGroupCounter;
            DerivativeInstrumentPartySubIDsGroupDecoder derivativeInstrumentPartySubIDsGroup = this.derivativeInstrumentPartySubIDsGroup;
            DerivativeInstrumentPartySubIDsGroupEncoder derivativeInstrumentPartySubIDsGroupEncoder = derivativeInstrumentPartySubIDsGrp.derivativeInstrumentPartySubIDsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (derivativeInstrumentPartySubIDsGroup != null)
                {
                    derivativeInstrumentPartySubIDsGroup.toEncoder(derivativeInstrumentPartySubIDsGroupEncoder);
                    derivativeInstrumentPartySubIDsGroup = derivativeInstrumentPartySubIDsGroup.next();
                    derivativeInstrumentPartySubIDsGroupEncoder = derivativeInstrumentPartySubIDsGroupEncoder.next();
                }
            }
        }

        return encoder;
    }

}
    public class DerivativeInstrumentPartiesGroupIterator implements Iterable<DerivativeInstrumentPartiesGroupDecoder>, java.util.Iterator<DerivativeInstrumentPartiesGroupDecoder>
    {
        private final DerivativeInstrumentPartiesDecoder parent;
        private int remainder;
        private DerivativeInstrumentPartiesGroupDecoder current;

        public DerivativeInstrumentPartiesGroupIterator(final DerivativeInstrumentPartiesDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }
        public DerivativeInstrumentPartiesGroupDecoder next()
        {
            remainder--;
            final DerivativeInstrumentPartiesGroupDecoder value = current;
            current = current.next();
            return value;
        }
        public int numberFieldValue()
        {
            return parent.hasNoDerivativeInstrumentPartiesGroupCounter() ? parent.noDerivativeInstrumentPartiesGroupCounter() : 0;
        }
        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.derivativeInstrumentPartiesGroup();
        }
        public DerivativeInstrumentPartiesGroupIterator iterator()
        {
            reset();
            return this;
        }
    }

public DerivativeInstrumentPartiesGroupIterator derivativeInstrumentPartiesGroupIterator();
    public int noDerivativeInstrumentPartiesGroupCounter();
    public boolean hasNoDerivativeInstrumentPartiesGroupCounter();
    public DerivativeInstrumentPartiesGroupDecoder derivativeInstrumentPartiesGroup();

}
