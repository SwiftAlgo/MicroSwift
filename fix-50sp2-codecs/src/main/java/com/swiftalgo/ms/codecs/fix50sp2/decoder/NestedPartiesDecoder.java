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
import com.swiftalgo.ms.codecs.fix50sp2.builder.NestedPartiesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.NestedPartiesEncoder.NestedPartyIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.NstdPtysSubGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.NstdPtysSubGrpEncoder.NestedPartySubIDsGroupEncoder;

public interface NestedPartiesDecoder 
{



public class NestedPartyIDsGroupDecoder extends CommonDecoderImpl implements NstdPtysSubGrpDecoder
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
            GROUP_FIELDS.add(Constants.NESTED_PARTY_ID);
            GROUP_FIELDS.add(Constants.NESTED_PARTY_ID_SOURCE);
            GROUP_FIELDS.add(Constants.NESTED_PARTY_ROLE);
        }
    }

    public final IntHashSet ALL_GROUP_FIELDS = new IntHashSet(6);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            ALL_GROUP_FIELDS.add(Constants.NESTED_PARTY_ID);
            ALL_GROUP_FIELDS.add(Constants.NESTED_PARTY_ID_SOURCE);
            ALL_GROUP_FIELDS.add(Constants.NESTED_PARTY_ROLE);
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
        if (hasNoNestedPartySubIDsGroupCounter)
        {
            {
                int count = 0;
                final NestedPartySubIDsGroupIterator iterator = nestedPartySubIDsGroupIterator.iterator();
                for (final NestedPartySubIDsGroupDecoder group : iterator)
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
                    invalidTagId = 804;
                    rejectReason = 16;
                    return false;
                }
            }
        }
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public NestedPartyIDsGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private NestedPartyIDsGroupDecoder next = null;

    public NestedPartyIDsGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(8);

    private char[] nestedPartyID = new char[1];

    private boolean hasNestedPartyID;

    public char[] nestedPartyID()
    {
        if (!hasNestedPartyID)
        {
            throw new IllegalArgumentException("No value for optional field: NestedPartyID");
        }

        return nestedPartyID;
    }

    public boolean hasNestedPartyID()
    {
        return hasNestedPartyID;
    }


    private int nestedPartyIDOffset;

    private int nestedPartyIDLength;

    public int nestedPartyIDLength()
    {
        if (!hasNestedPartyID)
        {
            throw new IllegalArgumentException("No value for optional field: NestedPartyID");
        }

        return nestedPartyIDLength;
    }

    public String nestedPartyIDAsString()
    {
        return hasNestedPartyID ? new String(nestedPartyID, 0, nestedPartyIDLength) : null;
    }

    public void nestedPartyID(final AsciiSequenceView view)
    {
        if (!hasNestedPartyID)
        {
            throw new IllegalArgumentException("No value for optional field: NestedPartyID");
        }

        view.wrap(buffer, nestedPartyIDOffset, nestedPartyIDLength);
    }


    private char nestedPartyIDSource = MISSING_CHAR;

    private boolean hasNestedPartyIDSource;

    public char nestedPartyIDSource()
    {
        if (!hasNestedPartyIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: NestedPartyIDSource");
        }

        return nestedPartyIDSource;
    }

    public boolean hasNestedPartyIDSource()
    {
        return hasNestedPartyIDSource;
    }



    private int nestedPartyRole = MISSING_INT;

    private boolean hasNestedPartyRole;

    public int nestedPartyRole()
    {
        if (!hasNestedPartyRole)
        {
            throw new IllegalArgumentException("No value for optional field: NestedPartyRole");
        }

        return nestedPartyRole;
    }

    public boolean hasNestedPartyRole()
    {
        return hasNestedPartyRole;
    }





    private NestedPartySubIDsGroupDecoder nestedPartySubIDsGroup = null;
    public NestedPartySubIDsGroupDecoder nestedPartySubIDsGroup()
    {
        return nestedPartySubIDsGroup;
    }

    private int noNestedPartySubIDsGroupCounter = MISSING_INT;

    private boolean hasNoNestedPartySubIDsGroupCounter;

    public int noNestedPartySubIDsGroupCounter()
    {
        if (!hasNoNestedPartySubIDsGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoNestedPartySubIDsGroupCounter");
        }

        return noNestedPartySubIDsGroupCounter;
    }

    public boolean hasNoNestedPartySubIDsGroupCounter()
    {
        return hasNoNestedPartySubIDsGroupCounter;
    }




    private NestedPartySubIDsGroupIterator nestedPartySubIDsGroupIterator = new NestedPartySubIDsGroupIterator(this);
    public NestedPartySubIDsGroupIterator nestedPartySubIDsGroupIterator()
    {
        return nestedPartySubIDsGroupIterator.iterator();
    }


    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode NestedPartyIDsGroup
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
                    next = new NestedPartyIDsGroupDecoder(trailer, messageFields);
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
            case Constants.NESTED_PARTY_ID:
                hasNestedPartyID = true;
                nestedPartyID = buffer.getChars(nestedPartyID, valueOffset, valueLength);
                nestedPartyIDOffset = valueOffset;
                nestedPartyIDLength = valueLength;
                break;

            case Constants.NESTED_PARTY_ID_SOURCE:
                hasNestedPartyIDSource = true;
                nestedPartyIDSource = buffer.getChar(valueOffset);
                break;

            case Constants.NESTED_PARTY_ROLE:
                hasNestedPartyRole = true;
                nestedPartyRole = getInt(buffer, valueOffset, endOfField, 538, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.NO_NESTED_PARTY_SUB_IDS:
                hasNoNestedPartySubIDsGroupCounter = true;
                noNestedPartySubIDsGroupCounter = getInt(buffer, valueOffset, endOfField, 804, CODEC_VALIDATION_ENABLED);
                if (nestedPartySubIDsGroup == null)
                {
                    nestedPartySubIDsGroup = new NestedPartySubIDsGroupDecoder(trailer, messageFields);
                }
                NestedPartySubIDsGroupDecoder nestedPartySubIDsGroupCurrent = nestedPartySubIDsGroup;
                position = endOfField + 1;
                final int noNestedPartySubIDsGroupCounter = this.noNestedPartySubIDsGroupCounter;
                for (int i = 0; i < noNestedPartySubIDsGroupCounter && position < end; i++)
                {
                    if (nestedPartySubIDsGroupCurrent != null)
                    {
                        position += nestedPartySubIDsGroupCurrent.decode(buffer, position, end - position);
                        nestedPartySubIDsGroupCurrent = nestedPartySubIDsGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (nestedPartySubIDsGroup.ALL_GROUP_FIELDS.contains(checkTag))
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
        this.resetNestedPartyID();
        this.resetNestedPartyIDSource();
        this.resetNestedPartyRole();
        this.resetNestedPartySubIDsGroup();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetNestedPartyID()
    {
        hasNestedPartyID = false;
    }

    public void resetNestedPartyIDSource()
    {
        hasNestedPartyIDSource = false;
    }

    public void resetNestedPartyRole()
    {
        hasNestedPartyRole = false;
    }

    public void resetNestedPartySubIDsGroup()
    {
        for (final NestedPartySubIDsGroupDecoder nestedPartySubIDsGroupDecoder : nestedPartySubIDsGroupIterator.iterator())
        {
            nestedPartySubIDsGroupDecoder.reset();
            if (nestedPartySubIDsGroupDecoder.next() == null)
            {
                break;
            }
        }
        noNestedPartySubIDsGroupCounter = MISSING_INT;
        hasNoNestedPartySubIDsGroupCounter = false;
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
        builder.append("\"MessageName\": \"NestedPartyIDsGroup\",\n");
        if (hasNestedPartyID())
        {
            indent(builder, level);
            builder.append("\"NestedPartyID\": \"");
            builder.append(this.nestedPartyID(), 0, nestedPartyIDLength());
            builder.append("\",\n");
        }

        if (hasNestedPartyIDSource())
        {
            indent(builder, level);
            builder.append("\"NestedPartyIDSource\": \"");
            builder.append(nestedPartyIDSource);
            builder.append("\",\n");
        }

        if (hasNestedPartyRole())
        {
            indent(builder, level);
            builder.append("\"NestedPartyRole\": \"");
            builder.append(nestedPartyRole);
            builder.append("\",\n");
        }

    if (hasNoNestedPartySubIDsGroupCounter)
    {
        indent(builder, level);
        builder.append("\"NestedPartySubIDsGroup\": [\n");
        NestedPartySubIDsGroupDecoder nestedPartySubIDsGroup = this.nestedPartySubIDsGroup;
        for (int i = 0, size = this.noNestedPartySubIDsGroupCounter; i < size; i++)
        {
            indent(builder, level);
            nestedPartySubIDsGroup.appendTo(builder, level + 1);            if (nestedPartySubIDsGroup.next() != null)
            {
                builder.append(',');
            }
            builder.append('\n');
            nestedPartySubIDsGroup = nestedPartySubIDsGroup.next();        }
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
    public NestedPartyIDsGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((NestedPartyIDsGroupEncoder)encoder);
    }

    public NestedPartyIDsGroupEncoder toEncoder(final NestedPartyIDsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasNestedPartyID())
        {
            encoder.nestedPartyID(this.nestedPartyID(), 0, nestedPartyIDLength());
        }

        if (hasNestedPartyIDSource())
        {
            encoder.nestedPartyIDSource(this.nestedPartyIDSource());
        }

        if (hasNestedPartyRole())
        {
            encoder.nestedPartyRole(this.nestedPartyRole());
        }


        final NstdPtysSubGrpEncoder nstdPtysSubGrp = encoder.nstdPtysSubGrp();        if (hasNoNestedPartySubIDsGroupCounter)
        {
            final int size = this.noNestedPartySubIDsGroupCounter;
            NestedPartySubIDsGroupDecoder nestedPartySubIDsGroup = this.nestedPartySubIDsGroup;
            NestedPartySubIDsGroupEncoder nestedPartySubIDsGroupEncoder = nstdPtysSubGrp.nestedPartySubIDsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (nestedPartySubIDsGroup != null)
                {
                    nestedPartySubIDsGroup.toEncoder(nestedPartySubIDsGroupEncoder);
                    nestedPartySubIDsGroup = nestedPartySubIDsGroup.next();
                    nestedPartySubIDsGroupEncoder = nestedPartySubIDsGroupEncoder.next();
                }
            }
        }

        return encoder;
    }

}
    public class NestedPartyIDsGroupIterator implements Iterable<NestedPartyIDsGroupDecoder>, java.util.Iterator<NestedPartyIDsGroupDecoder>
    {
        private final NestedPartiesDecoder parent;
        private int remainder;
        private NestedPartyIDsGroupDecoder current;

        public NestedPartyIDsGroupIterator(final NestedPartiesDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }
        public NestedPartyIDsGroupDecoder next()
        {
            remainder--;
            final NestedPartyIDsGroupDecoder value = current;
            current = current.next();
            return value;
        }
        public int numberFieldValue()
        {
            return parent.hasNoNestedPartyIDsGroupCounter() ? parent.noNestedPartyIDsGroupCounter() : 0;
        }
        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.nestedPartyIDsGroup();
        }
        public NestedPartyIDsGroupIterator iterator()
        {
            reset();
            return this;
        }
    }

public NestedPartyIDsGroupIterator nestedPartyIDsGroupIterator();
    public int noNestedPartyIDsGroupCounter();
    public boolean hasNoNestedPartyIDsGroupCounter();
    public NestedPartyIDsGroupDecoder nestedPartyIDsGroup();

}
