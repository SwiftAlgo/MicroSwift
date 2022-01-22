/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44.decoder;

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
import com.swiftalgo.ms.codecs.fix44.*;
import com.swiftalgo.ms.codecs.fix44.builder.PartiesEncoder;
import static com.swiftalgo.ms.codecs.fix44.builder.PartiesEncoder.PartyIDsGroupEncoder;
import static com.swiftalgo.ms.codecs.fix44.builder.PartiesEncoder.PartyIDsGroupEncoder.PartySubIDsGroupEncoder;

public interface PartiesDecoder 
{



public class PartyIDsGroupDecoder extends CommonDecoderImpl
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
            GROUP_FIELDS.add(Constants.PARTY_ID);
            GROUP_FIELDS.add(Constants.PARTY_ID_SOURCE);
            GROUP_FIELDS.add(Constants.PARTY_ROLE);
        }
    }

    public final IntHashSet ALL_GROUP_FIELDS = new IntHashSet(6);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            ALL_GROUP_FIELDS.add(Constants.PARTY_ID);
            ALL_GROUP_FIELDS.add(Constants.PARTY_ID_SOURCE);
            ALL_GROUP_FIELDS.add(Constants.PARTY_ROLE);
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
        if (hasPartyIDSource)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !PartyIDSource.isValid(partyIDSource()))
        {
            invalidTagId = 447;
            rejectReason = 5;
            return false;
        }
        }

        if (hasPartyRole)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !PartyRole.isValid(partyRole()))
        {
            invalidTagId = 452;
            rejectReason = 5;
            return false;
        }
        }
        if (hasNoPartySubIDsGroupCounter)
        {
            {
                int count = 0;
                final PartySubIDsGroupIterator iterator = partySubIDsGroupIterator.iterator();
                for (final PartySubIDsGroupDecoder group : iterator)
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
                    invalidTagId = 802;
                    rejectReason = 16;
                    return false;
                }
            }
        }
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public PartyIDsGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private PartyIDsGroupDecoder next = null;

    public PartyIDsGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(8);

    private char[] partyID = new char[1];

    private boolean hasPartyID;

    public char[] partyID()
    {
        if (!hasPartyID)
        {
            throw new IllegalArgumentException("No value for optional field: PartyID");
        }

        return partyID;
    }

    public boolean hasPartyID()
    {
        return hasPartyID;
    }


    private int partyIDOffset;

    private int partyIDLength;

    public int partyIDLength()
    {
        if (!hasPartyID)
        {
            throw new IllegalArgumentException("No value for optional field: PartyID");
        }

        return partyIDLength;
    }

    public String partyIDAsString()
    {
        return hasPartyID ? new String(partyID, 0, partyIDLength) : null;
    }

    public void partyID(final AsciiSequenceView view)
    {
        if (!hasPartyID)
        {
            throw new IllegalArgumentException("No value for optional field: PartyID");
        }

        view.wrap(buffer, partyIDOffset, partyIDLength);
    }


    private final CharArrayWrapper partyIDWrapper = new CharArrayWrapper();
    private char partyIDSource = MISSING_CHAR;

    private boolean hasPartyIDSource;

    public char partyIDSource()
    {
        if (!hasPartyIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: PartyIDSource");
        }

        return partyIDSource;
    }

    public boolean hasPartyIDSource()
    {
        return hasPartyIDSource;
    }



    private final CharArrayWrapper partyIDSourceWrapper = new CharArrayWrapper();
    public PartyIDSource partyIDSourceAsEnum()
    {
        if (!hasPartyIDSource)
 return PartyIDSource.NULL_VAL;
        return PartyIDSource.decode(partyIDSource);
    }

    private int partyRole = MISSING_INT;

    private boolean hasPartyRole;

    public int partyRole()
    {
        if (!hasPartyRole)
        {
            throw new IllegalArgumentException("No value for optional field: PartyRole");
        }

        return partyRole;
    }

    public boolean hasPartyRole()
    {
        return hasPartyRole;
    }



    private final CharArrayWrapper partyRoleWrapper = new CharArrayWrapper();
    public PartyRole partyRoleAsEnum()
    {
        if (!hasPartyRole)
 return PartyRole.NULL_VAL;
        return PartyRole.decode(partyRole);
    }



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
    public PartyIDsGroupEncoder.PartySubIDsGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((PartyIDsGroupEncoder.PartySubIDsGroupEncoder)encoder);
    }

    public PartyIDsGroupEncoder.PartySubIDsGroupEncoder toEncoder(final PartyIDsGroupEncoder.PartySubIDsGroupEncoder encoder)
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
        private final PartyIDsGroupDecoder parent;
        private int remainder;
        private PartySubIDsGroupDecoder current;

        public PartySubIDsGroupIterator(final PartyIDsGroupDecoder parent)
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


    private PartySubIDsGroupDecoder partySubIDsGroup = null;
    public PartySubIDsGroupDecoder partySubIDsGroup()
    {
        return partySubIDsGroup;
    }

    private int noPartySubIDsGroupCounter = MISSING_INT;

    private boolean hasNoPartySubIDsGroupCounter;

    public int noPartySubIDsGroupCounter()
    {
        if (!hasNoPartySubIDsGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoPartySubIDsGroupCounter");
        }

        return noPartySubIDsGroupCounter;
    }

    public boolean hasNoPartySubIDsGroupCounter()
    {
        return hasNoPartySubIDsGroupCounter;
    }




    private PartySubIDsGroupIterator partySubIDsGroupIterator = new PartySubIDsGroupIterator(this);
    public PartySubIDsGroupIterator partySubIDsGroupIterator()
    {
        return partySubIDsGroupIterator.iterator();
    }

    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode PartyIDsGroup
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
                    next = new PartyIDsGroupDecoder(trailer, messageFields);
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
            case Constants.PARTY_ID:
                hasPartyID = true;
                partyID = buffer.getChars(partyID, valueOffset, valueLength);
                partyIDOffset = valueOffset;
                partyIDLength = valueLength;
                break;

            case Constants.PARTY_ID_SOURCE:
                hasPartyIDSource = true;
                partyIDSource = buffer.getChar(valueOffset);
                break;

            case Constants.PARTY_ROLE:
                hasPartyRole = true;
                partyRole = getInt(buffer, valueOffset, endOfField, 452, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.NO_PARTY_SUB_IDS_GROUP_COUNTER:
                hasNoPartySubIDsGroupCounter = true;
                noPartySubIDsGroupCounter = getInt(buffer, valueOffset, endOfField, 802, CODEC_VALIDATION_ENABLED);
                if (partySubIDsGroup == null)
                {
                    partySubIDsGroup = new PartySubIDsGroupDecoder(trailer, messageFields);
                }
                PartySubIDsGroupDecoder partySubIDsGroupCurrent = partySubIDsGroup;
                position = endOfField + 1;
                final int noPartySubIDsGroupCounter = this.noPartySubIDsGroupCounter;
                for (int i = 0; i < noPartySubIDsGroupCounter && position < end; i++)
                {
                    if (partySubIDsGroupCurrent != null)
                    {
                        position += partySubIDsGroupCurrent.decode(buffer, position, end - position);
                        partySubIDsGroupCurrent = partySubIDsGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (partySubIDsGroup.ALL_GROUP_FIELDS.contains(checkTag))
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
        this.resetPartyID();
        this.resetPartyIDSource();
        this.resetPartyRole();
        this.resetPartySubIDsGroup();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetPartyID()
    {
        hasPartyID = false;
    }

    public void resetPartyIDSource()
    {
        hasPartyIDSource = false;
    }

    public void resetPartyRole()
    {
        hasPartyRole = false;
    }

    public void resetPartySubIDsGroup()
    {
        for (final PartySubIDsGroupDecoder partySubIDsGroupDecoder : partySubIDsGroupIterator.iterator())
        {
            partySubIDsGroupDecoder.reset();
            if (partySubIDsGroupDecoder.next() == null)
            {
                break;
            }
        }
        noPartySubIDsGroupCounter = MISSING_INT;
        hasNoPartySubIDsGroupCounter = false;
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
        builder.append("\"MessageName\": \"PartyIDsGroup\",\n");
        if (hasPartyID())
        {
            indent(builder, level);
            builder.append("\"PartyID\": \"");
            builder.append(this.partyID(), 0, partyIDLength());
            builder.append("\",\n");
        }

        if (hasPartyIDSource())
        {
            indent(builder, level);
            builder.append("\"PartyIDSource\": \"");
            builder.append(partyIDSource);
            builder.append("\",\n");
        }

        if (hasPartyRole())
        {
            indent(builder, level);
            builder.append("\"PartyRole\": \"");
            builder.append(partyRole);
            builder.append("\",\n");
        }

        if (hasNoPartySubIDsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"PartySubIDsGroup\": [\n");
            PartySubIDsGroupDecoder partySubIDsGroup = this.partySubIDsGroup;
            for (int i = 0, size = this.noPartySubIDsGroupCounter; i < size; i++)
            {
                indent(builder, level);
                partySubIDsGroup.appendTo(builder, level + 1);
                if (partySubIDsGroup.next() != null)
                {
                    builder.append(',');
                }
                builder.append('\n');
                partySubIDsGroup = partySubIDsGroup.next();            }
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
    public PartiesEncoder.PartyIDsGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((PartiesEncoder.PartyIDsGroupEncoder)encoder);
    }

    public PartiesEncoder.PartyIDsGroupEncoder toEncoder(final PartiesEncoder.PartyIDsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasPartyID())
        {
            encoder.partyID(this.partyID(), 0, partyIDLength());
        }

        if (hasPartyIDSource())
        {
            encoder.partyIDSource(this.partyIDSource());
        }

        if (hasPartyRole())
        {
            encoder.partyRole(this.partyRole());
        }

        if (hasNoPartySubIDsGroupCounter)
        {
            final int size = this.noPartySubIDsGroupCounter;
            PartySubIDsGroupDecoder partySubIDsGroup = this.partySubIDsGroup;
            PartySubIDsGroupEncoder partySubIDsGroupEncoder = encoder.partySubIDsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (partySubIDsGroup != null)
                {
                    partySubIDsGroup.toEncoder(partySubIDsGroupEncoder);
                    partySubIDsGroup = partySubIDsGroup.next();
                    partySubIDsGroupEncoder = partySubIDsGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
    public class PartyIDsGroupIterator implements Iterable<PartyIDsGroupDecoder>, java.util.Iterator<PartyIDsGroupDecoder>
    {
        private final PartiesDecoder parent;
        private int remainder;
        private PartyIDsGroupDecoder current;

        public PartyIDsGroupIterator(final PartiesDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }

        public PartyIDsGroupDecoder next()
        {
            remainder--;
            final PartyIDsGroupDecoder value = current;
            current = current.next();
            return value;
        }

        public int numberFieldValue()
        {
            return parent.hasNoPartyIDsGroupCounter() ? parent.noPartyIDsGroupCounter() : 0;
        }

        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.partyIDsGroup();
        }

        public PartyIDsGroupIterator iterator()
        {
            reset();
            return this;
        }

    }

    public PartyIDsGroupIterator partyIDsGroupIterator();
    public int noPartyIDsGroupCounter();
    public boolean hasNoPartyIDsGroupCounter();
    public PartyIDsGroupDecoder partyIDsGroup();

}
