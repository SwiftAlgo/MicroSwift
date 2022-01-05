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
import com.swiftalgo.ms.codecs.fix50sp2.builder.UndlyInstrumentPartiesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.UndlyInstrumentPartiesEncoder.UndlyInstrumentPartiesGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.UndlyInstrumentPtysSubGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.UndlyInstrumentPtysSubGrpEncoder.UndlyInstrumentPartySubIDsGroupEncoder;

public interface UndlyInstrumentPartiesDecoder 
{



public class UndlyInstrumentPartiesGroupDecoder extends CommonDecoderImpl implements UndlyInstrumentPtysSubGrpDecoder
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
            GROUP_FIELDS.add(Constants.UNDERLYING_INSTRUMENT_PARTY_ID);
            GROUP_FIELDS.add(Constants.UNDERLYING_INSTRUMENT_PARTY_ID_SOURCE);
            GROUP_FIELDS.add(Constants.UNDERLYING_INSTRUMENT_PARTY_ROLE);
        }
    }

    public final IntHashSet ALL_GROUP_FIELDS = new IntHashSet(6);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            ALL_GROUP_FIELDS.add(Constants.UNDERLYING_INSTRUMENT_PARTY_ID);
            ALL_GROUP_FIELDS.add(Constants.UNDERLYING_INSTRUMENT_PARTY_ID_SOURCE);
            ALL_GROUP_FIELDS.add(Constants.UNDERLYING_INSTRUMENT_PARTY_ROLE);
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
        if (hasNoUndlyInstrumentPartySubIDsGroupCounter)
        {
            {
                int count = 0;
                final UndlyInstrumentPartySubIDsGroupIterator iterator = undlyInstrumentPartySubIDsGroupIterator.iterator();
                for (final UndlyInstrumentPartySubIDsGroupDecoder group : iterator)
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
                    invalidTagId = 1062;
                    rejectReason = 16;
                    return false;
                }
            }
        }
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public UndlyInstrumentPartiesGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private UndlyInstrumentPartiesGroupDecoder next = null;

    public UndlyInstrumentPartiesGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(8);

    private char[] underlyingInstrumentPartyID = new char[1];

    private boolean hasUnderlyingInstrumentPartyID;

    public char[] underlyingInstrumentPartyID()
    {
        if (!hasUnderlyingInstrumentPartyID)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingInstrumentPartyID");
        }

        return underlyingInstrumentPartyID;
    }

    public boolean hasUnderlyingInstrumentPartyID()
    {
        return hasUnderlyingInstrumentPartyID;
    }


    private int underlyingInstrumentPartyIDOffset;

    private int underlyingInstrumentPartyIDLength;

    public int underlyingInstrumentPartyIDLength()
    {
        if (!hasUnderlyingInstrumentPartyID)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingInstrumentPartyID");
        }

        return underlyingInstrumentPartyIDLength;
    }

    public String underlyingInstrumentPartyIDAsString()
    {
        return hasUnderlyingInstrumentPartyID ? new String(underlyingInstrumentPartyID, 0, underlyingInstrumentPartyIDLength) : null;
    }

    public void underlyingInstrumentPartyID(final AsciiSequenceView view)
    {
        if (!hasUnderlyingInstrumentPartyID)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingInstrumentPartyID");
        }

        view.wrap(buffer, underlyingInstrumentPartyIDOffset, underlyingInstrumentPartyIDLength);
    }


    private char underlyingInstrumentPartyIDSource = MISSING_CHAR;

    private boolean hasUnderlyingInstrumentPartyIDSource;

    public char underlyingInstrumentPartyIDSource()
    {
        if (!hasUnderlyingInstrumentPartyIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingInstrumentPartyIDSource");
        }

        return underlyingInstrumentPartyIDSource;
    }

    public boolean hasUnderlyingInstrumentPartyIDSource()
    {
        return hasUnderlyingInstrumentPartyIDSource;
    }



    private int underlyingInstrumentPartyRole = MISSING_INT;

    private boolean hasUnderlyingInstrumentPartyRole;

    public int underlyingInstrumentPartyRole()
    {
        if (!hasUnderlyingInstrumentPartyRole)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingInstrumentPartyRole");
        }

        return underlyingInstrumentPartyRole;
    }

    public boolean hasUnderlyingInstrumentPartyRole()
    {
        return hasUnderlyingInstrumentPartyRole;
    }





    private UndlyInstrumentPartySubIDsGroupDecoder undlyInstrumentPartySubIDsGroup = null;
    public UndlyInstrumentPartySubIDsGroupDecoder undlyInstrumentPartySubIDsGroup()
    {
        return undlyInstrumentPartySubIDsGroup;
    }

    private int noUndlyInstrumentPartySubIDsGroupCounter = MISSING_INT;

    private boolean hasNoUndlyInstrumentPartySubIDsGroupCounter;

    public int noUndlyInstrumentPartySubIDsGroupCounter()
    {
        if (!hasNoUndlyInstrumentPartySubIDsGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoUndlyInstrumentPartySubIDsGroupCounter");
        }

        return noUndlyInstrumentPartySubIDsGroupCounter;
    }

    public boolean hasNoUndlyInstrumentPartySubIDsGroupCounter()
    {
        return hasNoUndlyInstrumentPartySubIDsGroupCounter;
    }




    private UndlyInstrumentPartySubIDsGroupIterator undlyInstrumentPartySubIDsGroupIterator = new UndlyInstrumentPartySubIDsGroupIterator(this);
    public UndlyInstrumentPartySubIDsGroupIterator undlyInstrumentPartySubIDsGroupIterator()
    {
        return undlyInstrumentPartySubIDsGroupIterator.iterator();
    }


    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode UndlyInstrumentPartiesGroup
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
                    next = new UndlyInstrumentPartiesGroupDecoder(trailer, messageFields);
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
            case Constants.UNDERLYING_INSTRUMENT_PARTY_ID:
                hasUnderlyingInstrumentPartyID = true;
                underlyingInstrumentPartyID = buffer.getChars(underlyingInstrumentPartyID, valueOffset, valueLength);
                underlyingInstrumentPartyIDOffset = valueOffset;
                underlyingInstrumentPartyIDLength = valueLength;
                break;

            case Constants.UNDERLYING_INSTRUMENT_PARTY_ID_SOURCE:
                hasUnderlyingInstrumentPartyIDSource = true;
                underlyingInstrumentPartyIDSource = buffer.getChar(valueOffset);
                break;

            case Constants.UNDERLYING_INSTRUMENT_PARTY_ROLE:
                hasUnderlyingInstrumentPartyRole = true;
                underlyingInstrumentPartyRole = getInt(buffer, valueOffset, endOfField, 1061, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.NO_UNDLY_INSTRUMENT_PARTY_SUB_IDS:
                hasNoUndlyInstrumentPartySubIDsGroupCounter = true;
                noUndlyInstrumentPartySubIDsGroupCounter = getInt(buffer, valueOffset, endOfField, 1062, CODEC_VALIDATION_ENABLED);
                if (undlyInstrumentPartySubIDsGroup == null)
                {
                    undlyInstrumentPartySubIDsGroup = new UndlyInstrumentPartySubIDsGroupDecoder(trailer, messageFields);
                }
                UndlyInstrumentPartySubIDsGroupDecoder undlyInstrumentPartySubIDsGroupCurrent = undlyInstrumentPartySubIDsGroup;
                position = endOfField + 1;
                final int noUndlyInstrumentPartySubIDsGroupCounter = this.noUndlyInstrumentPartySubIDsGroupCounter;
                for (int i = 0; i < noUndlyInstrumentPartySubIDsGroupCounter && position < end; i++)
                {
                    if (undlyInstrumentPartySubIDsGroupCurrent != null)
                    {
                        position += undlyInstrumentPartySubIDsGroupCurrent.decode(buffer, position, end - position);
                        undlyInstrumentPartySubIDsGroupCurrent = undlyInstrumentPartySubIDsGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (undlyInstrumentPartySubIDsGroup.ALL_GROUP_FIELDS.contains(checkTag))
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
        this.resetUnderlyingInstrumentPartyID();
        this.resetUnderlyingInstrumentPartyIDSource();
        this.resetUnderlyingInstrumentPartyRole();
        this.resetUndlyInstrumentPartySubIDsGroup();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetUnderlyingInstrumentPartyID()
    {
        hasUnderlyingInstrumentPartyID = false;
    }

    public void resetUnderlyingInstrumentPartyIDSource()
    {
        hasUnderlyingInstrumentPartyIDSource = false;
    }

    public void resetUnderlyingInstrumentPartyRole()
    {
        hasUnderlyingInstrumentPartyRole = false;
    }

    public void resetUndlyInstrumentPartySubIDsGroup()
    {
        for (final UndlyInstrumentPartySubIDsGroupDecoder undlyInstrumentPartySubIDsGroupDecoder : undlyInstrumentPartySubIDsGroupIterator.iterator())
        {
            undlyInstrumentPartySubIDsGroupDecoder.reset();
            if (undlyInstrumentPartySubIDsGroupDecoder.next() == null)
            {
                break;
            }
        }
        noUndlyInstrumentPartySubIDsGroupCounter = MISSING_INT;
        hasNoUndlyInstrumentPartySubIDsGroupCounter = false;
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
        builder.append("\"MessageName\": \"UndlyInstrumentPartiesGroup\",\n");
        if (hasUnderlyingInstrumentPartyID())
        {
            indent(builder, level);
            builder.append("\"UnderlyingInstrumentPartyID\": \"");
            builder.append(this.underlyingInstrumentPartyID(), 0, underlyingInstrumentPartyIDLength());
            builder.append("\",\n");
        }

        if (hasUnderlyingInstrumentPartyIDSource())
        {
            indent(builder, level);
            builder.append("\"UnderlyingInstrumentPartyIDSource\": \"");
            builder.append(underlyingInstrumentPartyIDSource);
            builder.append("\",\n");
        }

        if (hasUnderlyingInstrumentPartyRole())
        {
            indent(builder, level);
            builder.append("\"UnderlyingInstrumentPartyRole\": \"");
            builder.append(underlyingInstrumentPartyRole);
            builder.append("\",\n");
        }

    if (hasNoUndlyInstrumentPartySubIDsGroupCounter)
    {
        indent(builder, level);
        builder.append("\"UndlyInstrumentPartySubIDsGroup\": [\n");
        UndlyInstrumentPartySubIDsGroupDecoder undlyInstrumentPartySubIDsGroup = this.undlyInstrumentPartySubIDsGroup;
        for (int i = 0, size = this.noUndlyInstrumentPartySubIDsGroupCounter; i < size; i++)
        {
            indent(builder, level);
            undlyInstrumentPartySubIDsGroup.appendTo(builder, level + 1);            if (undlyInstrumentPartySubIDsGroup.next() != null)
            {
                builder.append(',');
            }
            builder.append('\n');
            undlyInstrumentPartySubIDsGroup = undlyInstrumentPartySubIDsGroup.next();        }
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
    public UndlyInstrumentPartiesGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((UndlyInstrumentPartiesGroupEncoder)encoder);
    }

    public UndlyInstrumentPartiesGroupEncoder toEncoder(final UndlyInstrumentPartiesGroupEncoder encoder)
    {
        encoder.reset();
        if (hasUnderlyingInstrumentPartyID())
        {
            encoder.underlyingInstrumentPartyID(this.underlyingInstrumentPartyID(), 0, underlyingInstrumentPartyIDLength());
        }

        if (hasUnderlyingInstrumentPartyIDSource())
        {
            encoder.underlyingInstrumentPartyIDSource(this.underlyingInstrumentPartyIDSource());
        }

        if (hasUnderlyingInstrumentPartyRole())
        {
            encoder.underlyingInstrumentPartyRole(this.underlyingInstrumentPartyRole());
        }


        final UndlyInstrumentPtysSubGrpEncoder undlyInstrumentPtysSubGrp = encoder.undlyInstrumentPtysSubGrp();        if (hasNoUndlyInstrumentPartySubIDsGroupCounter)
        {
            final int size = this.noUndlyInstrumentPartySubIDsGroupCounter;
            UndlyInstrumentPartySubIDsGroupDecoder undlyInstrumentPartySubIDsGroup = this.undlyInstrumentPartySubIDsGroup;
            UndlyInstrumentPartySubIDsGroupEncoder undlyInstrumentPartySubIDsGroupEncoder = undlyInstrumentPtysSubGrp.undlyInstrumentPartySubIDsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (undlyInstrumentPartySubIDsGroup != null)
                {
                    undlyInstrumentPartySubIDsGroup.toEncoder(undlyInstrumentPartySubIDsGroupEncoder);
                    undlyInstrumentPartySubIDsGroup = undlyInstrumentPartySubIDsGroup.next();
                    undlyInstrumentPartySubIDsGroupEncoder = undlyInstrumentPartySubIDsGroupEncoder.next();
                }
            }
        }

        return encoder;
    }

}
    public class UndlyInstrumentPartiesGroupIterator implements Iterable<UndlyInstrumentPartiesGroupDecoder>, java.util.Iterator<UndlyInstrumentPartiesGroupDecoder>
    {
        private final UndlyInstrumentPartiesDecoder parent;
        private int remainder;
        private UndlyInstrumentPartiesGroupDecoder current;

        public UndlyInstrumentPartiesGroupIterator(final UndlyInstrumentPartiesDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }
        public UndlyInstrumentPartiesGroupDecoder next()
        {
            remainder--;
            final UndlyInstrumentPartiesGroupDecoder value = current;
            current = current.next();
            return value;
        }
        public int numberFieldValue()
        {
            return parent.hasNoUndlyInstrumentPartiesGroupCounter() ? parent.noUndlyInstrumentPartiesGroupCounter() : 0;
        }
        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.undlyInstrumentPartiesGroup();
        }
        public UndlyInstrumentPartiesGroupIterator iterator()
        {
            reset();
            return this;
        }
    }

public UndlyInstrumentPartiesGroupIterator undlyInstrumentPartiesGroupIterator();
    public int noUndlyInstrumentPartiesGroupCounter();
    public boolean hasNoUndlyInstrumentPartiesGroupCounter();
    public UndlyInstrumentPartiesGroupDecoder undlyInstrumentPartiesGroup();

}
