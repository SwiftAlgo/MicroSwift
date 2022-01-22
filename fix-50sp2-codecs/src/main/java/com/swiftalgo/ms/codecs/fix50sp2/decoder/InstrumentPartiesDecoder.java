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
import com.swiftalgo.ms.codecs.fix50sp2.builder.InstrumentPartiesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.InstrumentPartiesEncoder.InstrumentPartiesGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.InstrumentPtysSubGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.InstrumentPtysSubGrpEncoder.InstrumentPartySubIDsGroupEncoder;

public interface InstrumentPartiesDecoder 
{



public class InstrumentPartiesGroupDecoder extends CommonDecoderImpl implements InstrumentPtysSubGrpDecoder
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
            GROUP_FIELDS.add(Constants.INSTRUMENT_PARTY_ID);
            GROUP_FIELDS.add(Constants.INSTRUMENT_PARTY_ID_SOURCE);
            GROUP_FIELDS.add(Constants.INSTRUMENT_PARTY_ROLE);
        }
    }

    public final IntHashSet ALL_GROUP_FIELDS = new IntHashSet(6);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            ALL_GROUP_FIELDS.add(Constants.INSTRUMENT_PARTY_ID);
            ALL_GROUP_FIELDS.add(Constants.INSTRUMENT_PARTY_ID_SOURCE);
            ALL_GROUP_FIELDS.add(Constants.INSTRUMENT_PARTY_ROLE);
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
        if (hasNoInstrumentPartySubIDsGroupCounter)
        {
            {
                int count = 0;
                final InstrumentPartySubIDsGroupIterator iterator = instrumentPartySubIDsGroupIterator.iterator();
                for (final InstrumentPartySubIDsGroupDecoder group : iterator)
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
                    invalidTagId = 1052;
                    rejectReason = 16;
                    return false;
                }
            }
        }
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public InstrumentPartiesGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private InstrumentPartiesGroupDecoder next = null;

    public InstrumentPartiesGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(8);

    private char[] instrumentPartyID = new char[1];

    private boolean hasInstrumentPartyID;

    public char[] instrumentPartyID()
    {
        if (!hasInstrumentPartyID)
        {
            throw new IllegalArgumentException("No value for optional field: InstrumentPartyID");
        }

        return instrumentPartyID;
    }

    public boolean hasInstrumentPartyID()
    {
        return hasInstrumentPartyID;
    }


    private int instrumentPartyIDOffset;

    private int instrumentPartyIDLength;

    public int instrumentPartyIDLength()
    {
        if (!hasInstrumentPartyID)
        {
            throw new IllegalArgumentException("No value for optional field: InstrumentPartyID");
        }

        return instrumentPartyIDLength;
    }

    public String instrumentPartyIDAsString()
    {
        return hasInstrumentPartyID ? new String(instrumentPartyID, 0, instrumentPartyIDLength) : null;
    }

    public void instrumentPartyID(final AsciiSequenceView view)
    {
        if (!hasInstrumentPartyID)
        {
            throw new IllegalArgumentException("No value for optional field: InstrumentPartyID");
        }

        view.wrap(buffer, instrumentPartyIDOffset, instrumentPartyIDLength);
    }


    private final CharArrayWrapper instrumentPartyIDWrapper = new CharArrayWrapper();
    private char instrumentPartyIDSource = MISSING_CHAR;

    private boolean hasInstrumentPartyIDSource;

    public char instrumentPartyIDSource()
    {
        if (!hasInstrumentPartyIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: InstrumentPartyIDSource");
        }

        return instrumentPartyIDSource;
    }

    public boolean hasInstrumentPartyIDSource()
    {
        return hasInstrumentPartyIDSource;
    }



    private int instrumentPartyRole = MISSING_INT;

    private boolean hasInstrumentPartyRole;

    public int instrumentPartyRole()
    {
        if (!hasInstrumentPartyRole)
        {
            throw new IllegalArgumentException("No value for optional field: InstrumentPartyRole");
        }

        return instrumentPartyRole;
    }

    public boolean hasInstrumentPartyRole()
    {
        return hasInstrumentPartyRole;
    }





    private InstrumentPartySubIDsGroupDecoder instrumentPartySubIDsGroup = null;
    public InstrumentPartySubIDsGroupDecoder instrumentPartySubIDsGroup()
    {
        return instrumentPartySubIDsGroup;
    }

    private int noInstrumentPartySubIDsGroupCounter = MISSING_INT;

    private boolean hasNoInstrumentPartySubIDsGroupCounter;

    public int noInstrumentPartySubIDsGroupCounter()
    {
        if (!hasNoInstrumentPartySubIDsGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoInstrumentPartySubIDsGroupCounter");
        }

        return noInstrumentPartySubIDsGroupCounter;
    }

    public boolean hasNoInstrumentPartySubIDsGroupCounter()
    {
        return hasNoInstrumentPartySubIDsGroupCounter;
    }




    private InstrumentPartySubIDsGroupIterator instrumentPartySubIDsGroupIterator = new InstrumentPartySubIDsGroupIterator(this);
    public InstrumentPartySubIDsGroupIterator instrumentPartySubIDsGroupIterator()
    {
        return instrumentPartySubIDsGroupIterator.iterator();
    }


    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode InstrumentPartiesGroup
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
                    next = new InstrumentPartiesGroupDecoder(trailer, messageFields);
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
            case Constants.INSTRUMENT_PARTY_ID:
                hasInstrumentPartyID = true;
                instrumentPartyID = buffer.getChars(instrumentPartyID, valueOffset, valueLength);
                instrumentPartyIDOffset = valueOffset;
                instrumentPartyIDLength = valueLength;
                break;

            case Constants.INSTRUMENT_PARTY_ID_SOURCE:
                hasInstrumentPartyIDSource = true;
                instrumentPartyIDSource = buffer.getChar(valueOffset);
                break;

            case Constants.INSTRUMENT_PARTY_ROLE:
                hasInstrumentPartyRole = true;
                instrumentPartyRole = getInt(buffer, valueOffset, endOfField, 1051, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.NO_INSTRUMENT_PARTY_SUB_IDS_GROUP_COUNTER:
                hasNoInstrumentPartySubIDsGroupCounter = true;
                noInstrumentPartySubIDsGroupCounter = getInt(buffer, valueOffset, endOfField, 1052, CODEC_VALIDATION_ENABLED);
                if (instrumentPartySubIDsGroup == null)
                {
                    instrumentPartySubIDsGroup = new InstrumentPartySubIDsGroupDecoder(trailer, messageFields);
                }
                InstrumentPartySubIDsGroupDecoder instrumentPartySubIDsGroupCurrent = instrumentPartySubIDsGroup;
                position = endOfField + 1;
                final int noInstrumentPartySubIDsGroupCounter = this.noInstrumentPartySubIDsGroupCounter;
                for (int i = 0; i < noInstrumentPartySubIDsGroupCounter && position < end; i++)
                {
                    if (instrumentPartySubIDsGroupCurrent != null)
                    {
                        position += instrumentPartySubIDsGroupCurrent.decode(buffer, position, end - position);
                        instrumentPartySubIDsGroupCurrent = instrumentPartySubIDsGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (instrumentPartySubIDsGroup.ALL_GROUP_FIELDS.contains(checkTag))
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
        this.resetInstrumentPartyID();
        this.resetInstrumentPartyIDSource();
        this.resetInstrumentPartyRole();
        this.resetInstrumentPartySubIDsGroup();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetInstrumentPartyID()
    {
        hasInstrumentPartyID = false;
    }

    public void resetInstrumentPartyIDSource()
    {
        hasInstrumentPartyIDSource = false;
    }

    public void resetInstrumentPartyRole()
    {
        hasInstrumentPartyRole = false;
    }

    public void resetInstrumentPartySubIDsGroup()
    {
        for (final InstrumentPartySubIDsGroupDecoder instrumentPartySubIDsGroupDecoder : instrumentPartySubIDsGroupIterator.iterator())
        {
            instrumentPartySubIDsGroupDecoder.reset();
            if (instrumentPartySubIDsGroupDecoder.next() == null)
            {
                break;
            }
        }
        noInstrumentPartySubIDsGroupCounter = MISSING_INT;
        hasNoInstrumentPartySubIDsGroupCounter = false;
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
        builder.append("\"MessageName\": \"InstrumentPartiesGroup\",\n");
        if (hasInstrumentPartyID())
        {
            indent(builder, level);
            builder.append("\"InstrumentPartyID\": \"");
            builder.append(this.instrumentPartyID(), 0, instrumentPartyIDLength());
            builder.append("\",\n");
        }

        if (hasInstrumentPartyIDSource())
        {
            indent(builder, level);
            builder.append("\"InstrumentPartyIDSource\": \"");
            builder.append(instrumentPartyIDSource);
            builder.append("\",\n");
        }

        if (hasInstrumentPartyRole())
        {
            indent(builder, level);
            builder.append("\"InstrumentPartyRole\": \"");
            builder.append(instrumentPartyRole);
            builder.append("\",\n");
        }

        if (hasNoInstrumentPartySubIDsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"InstrumentPartySubIDsGroup\": [\n");
            InstrumentPartySubIDsGroupDecoder instrumentPartySubIDsGroup = this.instrumentPartySubIDsGroup;
            for (int i = 0, size = this.noInstrumentPartySubIDsGroupCounter; i < size; i++)
            {
                indent(builder, level);
                instrumentPartySubIDsGroup.appendTo(builder, level + 1);
                if (instrumentPartySubIDsGroup.next() != null)
                {
                    builder.append(',');
                }
                builder.append('\n');
                instrumentPartySubIDsGroup = instrumentPartySubIDsGroup.next();            }
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
    public InstrumentPartiesEncoder.InstrumentPartiesGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((InstrumentPartiesEncoder.InstrumentPartiesGroupEncoder)encoder);
    }

    public InstrumentPartiesEncoder.InstrumentPartiesGroupEncoder toEncoder(final InstrumentPartiesEncoder.InstrumentPartiesGroupEncoder encoder)
    {
        encoder.reset();
        if (hasInstrumentPartyID())
        {
            encoder.instrumentPartyID(this.instrumentPartyID(), 0, instrumentPartyIDLength());
        }

        if (hasInstrumentPartyIDSource())
        {
            encoder.instrumentPartyIDSource(this.instrumentPartyIDSource());
        }

        if (hasInstrumentPartyRole())
        {
            encoder.instrumentPartyRole(this.instrumentPartyRole());
        }


        final InstrumentPtysSubGrpEncoder instrumentPtysSubGrp = encoder.instrumentPtysSubGrp();        if (hasNoInstrumentPartySubIDsGroupCounter)
        {
            final int size = this.noInstrumentPartySubIDsGroupCounter;
            InstrumentPartySubIDsGroupDecoder instrumentPartySubIDsGroup = this.instrumentPartySubIDsGroup;
            InstrumentPartySubIDsGroupEncoder instrumentPartySubIDsGroupEncoder = instrumentPtysSubGrp.instrumentPartySubIDsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (instrumentPartySubIDsGroup != null)
                {
                    instrumentPartySubIDsGroup.toEncoder(instrumentPartySubIDsGroupEncoder);
                    instrumentPartySubIDsGroup = instrumentPartySubIDsGroup.next();
                    instrumentPartySubIDsGroupEncoder = instrumentPartySubIDsGroupEncoder.next();
                }
            }
        }

        return encoder;
    }

}
    public class InstrumentPartiesGroupIterator implements Iterable<InstrumentPartiesGroupDecoder>, java.util.Iterator<InstrumentPartiesGroupDecoder>
    {
        private final InstrumentPartiesDecoder parent;
        private int remainder;
        private InstrumentPartiesGroupDecoder current;

        public InstrumentPartiesGroupIterator(final InstrumentPartiesDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }

        public InstrumentPartiesGroupDecoder next()
        {
            remainder--;
            final InstrumentPartiesGroupDecoder value = current;
            current = current.next();
            return value;
        }

        public int numberFieldValue()
        {
            return parent.hasNoInstrumentPartiesGroupCounter() ? parent.noInstrumentPartiesGroupCounter() : 0;
        }

        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.instrumentPartiesGroup();
        }

        public InstrumentPartiesGroupIterator iterator()
        {
            reset();
            return this;
        }

    }

    public InstrumentPartiesGroupIterator instrumentPartiesGroupIterator();
    public int noInstrumentPartiesGroupCounter();
    public boolean hasNoInstrumentPartiesGroupCounter();
    public InstrumentPartiesGroupDecoder instrumentPartiesGroup();

}
