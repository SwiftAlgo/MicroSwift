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
import com.swiftalgo.ms.codecs.fix44.builder.NestedParties3Encoder;
import static com.swiftalgo.ms.codecs.fix44.builder.NestedParties3Encoder.Nested3PartyIDsGroupEncoder;
import static com.swiftalgo.ms.codecs.fix44.builder.NestedParties3Encoder.Nested3PartyIDsGroupEncoder.Nested3PartySubIDsGroupEncoder;

public interface NestedParties3Decoder 
{



public class Nested3PartyIDsGroupDecoder extends CommonDecoderImpl
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
            GROUP_FIELDS.add(Constants.NESTED3_PARTY_ID);
            GROUP_FIELDS.add(Constants.NESTED3_PARTY_ID_SOURCE);
            GROUP_FIELDS.add(Constants.NESTED3_PARTY_ROLE);
        }
    }

    public final IntHashSet ALL_GROUP_FIELDS = new IntHashSet(6);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            ALL_GROUP_FIELDS.add(Constants.NESTED3_PARTY_ID);
            ALL_GROUP_FIELDS.add(Constants.NESTED3_PARTY_ID_SOURCE);
            ALL_GROUP_FIELDS.add(Constants.NESTED3_PARTY_ROLE);
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
        if (hasNoNested3PartySubIDsGroupCounter)
        {
            {
                int count = 0;
                final Nested3PartySubIDsGroupIterator iterator = nested3PartySubIDsGroupIterator.iterator();
                for (final Nested3PartySubIDsGroupDecoder group : iterator)
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
                    invalidTagId = 952;
                    rejectReason = 16;
                    return false;
                }
            }
        }
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public Nested3PartyIDsGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private Nested3PartyIDsGroupDecoder next = null;

    public Nested3PartyIDsGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(8);

    private char[] nested3PartyID = new char[1];

    private boolean hasNested3PartyID;

    public char[] nested3PartyID()
    {
        if (!hasNested3PartyID)
        {
            throw new IllegalArgumentException("No value for optional field: Nested3PartyID");
        }

        return nested3PartyID;
    }

    public boolean hasNested3PartyID()
    {
        return hasNested3PartyID;
    }


    private int nested3PartyIDOffset;

    private int nested3PartyIDLength;

    public int nested3PartyIDLength()
    {
        if (!hasNested3PartyID)
        {
            throw new IllegalArgumentException("No value for optional field: Nested3PartyID");
        }

        return nested3PartyIDLength;
    }

    public String nested3PartyIDAsString()
    {
        return hasNested3PartyID ? new String(nested3PartyID, 0, nested3PartyIDLength) : null;
    }

    public void nested3PartyID(final AsciiSequenceView view)
    {
        if (!hasNested3PartyID)
        {
            throw new IllegalArgumentException("No value for optional field: Nested3PartyID");
        }

        view.wrap(buffer, nested3PartyIDOffset, nested3PartyIDLength);
    }


    private char nested3PartyIDSource = MISSING_CHAR;

    private boolean hasNested3PartyIDSource;

    public char nested3PartyIDSource()
    {
        if (!hasNested3PartyIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: Nested3PartyIDSource");
        }

        return nested3PartyIDSource;
    }

    public boolean hasNested3PartyIDSource()
    {
        return hasNested3PartyIDSource;
    }



    private int nested3PartyRole = MISSING_INT;

    private boolean hasNested3PartyRole;

    public int nested3PartyRole()
    {
        if (!hasNested3PartyRole)
        {
            throw new IllegalArgumentException("No value for optional field: Nested3PartyRole");
        }

        return nested3PartyRole;
    }

    public boolean hasNested3PartyRole()
    {
        return hasNested3PartyRole;
    }





public class Nested3PartySubIDsGroupDecoder extends CommonDecoderImpl
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
            ALL_GROUP_FIELDS.add(Constants.NESTED3_PARTY_SUB_ID);
            ALL_GROUP_FIELDS.add(Constants.NESTED3_PARTY_SUB_ID_TYPE);
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
    public Nested3PartySubIDsGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private Nested3PartySubIDsGroupDecoder next = null;

    public Nested3PartySubIDsGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(4);

    private char[] nested3PartySubID = new char[1];

    private boolean hasNested3PartySubID;

    public char[] nested3PartySubID()
    {
        if (!hasNested3PartySubID)
        {
            throw new IllegalArgumentException("No value for optional field: Nested3PartySubID");
        }

        return nested3PartySubID;
    }

    public boolean hasNested3PartySubID()
    {
        return hasNested3PartySubID;
    }


    private int nested3PartySubIDOffset;

    private int nested3PartySubIDLength;

    public int nested3PartySubIDLength()
    {
        if (!hasNested3PartySubID)
        {
            throw new IllegalArgumentException("No value for optional field: Nested3PartySubID");
        }

        return nested3PartySubIDLength;
    }

    public String nested3PartySubIDAsString()
    {
        return hasNested3PartySubID ? new String(nested3PartySubID, 0, nested3PartySubIDLength) : null;
    }

    public void nested3PartySubID(final AsciiSequenceView view)
    {
        if (!hasNested3PartySubID)
        {
            throw new IllegalArgumentException("No value for optional field: Nested3PartySubID");
        }

        view.wrap(buffer, nested3PartySubIDOffset, nested3PartySubIDLength);
    }


    private int nested3PartySubIDType = MISSING_INT;

    private boolean hasNested3PartySubIDType;

    public int nested3PartySubIDType()
    {
        if (!hasNested3PartySubIDType)
        {
            throw new IllegalArgumentException("No value for optional field: Nested3PartySubIDType");
        }

        return nested3PartySubIDType;
    }

    public boolean hasNested3PartySubIDType()
    {
        return hasNested3PartySubIDType;
    }



    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode Nested3PartySubIDsGroup
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
                    next = new Nested3PartySubIDsGroupDecoder(trailer, messageFields);
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
            case Constants.NESTED3_PARTY_SUB_ID:
                hasNested3PartySubID = true;
                nested3PartySubID = buffer.getChars(nested3PartySubID, valueOffset, valueLength);
                nested3PartySubIDOffset = valueOffset;
                nested3PartySubIDLength = valueLength;
                break;

            case Constants.NESTED3_PARTY_SUB_ID_TYPE:
                hasNested3PartySubIDType = true;
                nested3PartySubIDType = getInt(buffer, valueOffset, endOfField, 954, CODEC_VALIDATION_ENABLED);
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
        this.resetNested3PartySubID();
        this.resetNested3PartySubIDType();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetNested3PartySubID()
    {
        hasNested3PartySubID = false;
    }

    public void resetNested3PartySubIDType()
    {
        hasNested3PartySubIDType = false;
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
        builder.append("\"MessageName\": \"Nested3PartySubIDsGroup\",\n");
        if (hasNested3PartySubID())
        {
            indent(builder, level);
            builder.append("\"Nested3PartySubID\": \"");
            builder.append(this.nested3PartySubID(), 0, nested3PartySubIDLength());
            builder.append("\",\n");
        }

        if (hasNested3PartySubIDType())
        {
            indent(builder, level);
            builder.append("\"Nested3PartySubIDType\": \"");
            builder.append(nested3PartySubIDType);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public Nested3PartySubIDsGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((Nested3PartySubIDsGroupEncoder)encoder);
    }

    public Nested3PartySubIDsGroupEncoder toEncoder(final Nested3PartySubIDsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasNested3PartySubID())
        {
            encoder.nested3PartySubID(this.nested3PartySubID(), 0, nested3PartySubIDLength());
        }

        if (hasNested3PartySubIDType())
        {
            encoder.nested3PartySubIDType(this.nested3PartySubIDType());
        }
        return encoder;
    }

}
    public class Nested3PartySubIDsGroupIterator implements Iterable<Nested3PartySubIDsGroupDecoder>, java.util.Iterator<Nested3PartySubIDsGroupDecoder>
    {
        private final Nested3PartyIDsGroupDecoder parent;
        private int remainder;
        private Nested3PartySubIDsGroupDecoder current;

        public Nested3PartySubIDsGroupIterator(final Nested3PartyIDsGroupDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }
        public Nested3PartySubIDsGroupDecoder next()
        {
            remainder--;
            final Nested3PartySubIDsGroupDecoder value = current;
            current = current.next();
            return value;
        }
        public int numberFieldValue()
        {
            return parent.hasNoNested3PartySubIDsGroupCounter() ? parent.noNested3PartySubIDsGroupCounter() : 0;
        }
        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.nested3PartySubIDsGroup();
        }
        public Nested3PartySubIDsGroupIterator iterator()
        {
            reset();
            return this;
        }
    }


    private Nested3PartySubIDsGroupDecoder nested3PartySubIDsGroup = null;
    public Nested3PartySubIDsGroupDecoder nested3PartySubIDsGroup()
    {
        return nested3PartySubIDsGroup;
    }

    private int noNested3PartySubIDsGroupCounter = MISSING_INT;

    private boolean hasNoNested3PartySubIDsGroupCounter;

    public int noNested3PartySubIDsGroupCounter()
    {
        if (!hasNoNested3PartySubIDsGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoNested3PartySubIDsGroupCounter");
        }

        return noNested3PartySubIDsGroupCounter;
    }

    public boolean hasNoNested3PartySubIDsGroupCounter()
    {
        return hasNoNested3PartySubIDsGroupCounter;
    }




    private Nested3PartySubIDsGroupIterator nested3PartySubIDsGroupIterator = new Nested3PartySubIDsGroupIterator(this);
    public Nested3PartySubIDsGroupIterator nested3PartySubIDsGroupIterator()
    {
        return nested3PartySubIDsGroupIterator.iterator();
    }

    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode Nested3PartyIDsGroup
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
                    next = new Nested3PartyIDsGroupDecoder(trailer, messageFields);
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
            case Constants.NESTED3_PARTY_ID:
                hasNested3PartyID = true;
                nested3PartyID = buffer.getChars(nested3PartyID, valueOffset, valueLength);
                nested3PartyIDOffset = valueOffset;
                nested3PartyIDLength = valueLength;
                break;

            case Constants.NESTED3_PARTY_ID_SOURCE:
                hasNested3PartyIDSource = true;
                nested3PartyIDSource = buffer.getChar(valueOffset);
                break;

            case Constants.NESTED3_PARTY_ROLE:
                hasNested3PartyRole = true;
                nested3PartyRole = getInt(buffer, valueOffset, endOfField, 951, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.NO_NESTED3_PARTY_SUB_IDS:
                hasNoNested3PartySubIDsGroupCounter = true;
                noNested3PartySubIDsGroupCounter = getInt(buffer, valueOffset, endOfField, 952, CODEC_VALIDATION_ENABLED);
                if (nested3PartySubIDsGroup == null)
                {
                    nested3PartySubIDsGroup = new Nested3PartySubIDsGroupDecoder(trailer, messageFields);
                }
                Nested3PartySubIDsGroupDecoder nested3PartySubIDsGroupCurrent = nested3PartySubIDsGroup;
                position = endOfField + 1;
                final int noNested3PartySubIDsGroupCounter = this.noNested3PartySubIDsGroupCounter;
                for (int i = 0; i < noNested3PartySubIDsGroupCounter && position < end; i++)
                {
                    if (nested3PartySubIDsGroupCurrent != null)
                    {
                        position += nested3PartySubIDsGroupCurrent.decode(buffer, position, end - position);
                        nested3PartySubIDsGroupCurrent = nested3PartySubIDsGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (nested3PartySubIDsGroup.ALL_GROUP_FIELDS.contains(checkTag))
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
        this.resetNested3PartyID();
        this.resetNested3PartyIDSource();
        this.resetNested3PartyRole();
        this.resetNested3PartySubIDsGroup();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetNested3PartyID()
    {
        hasNested3PartyID = false;
    }

    public void resetNested3PartyIDSource()
    {
        hasNested3PartyIDSource = false;
    }

    public void resetNested3PartyRole()
    {
        hasNested3PartyRole = false;
    }

    public void resetNested3PartySubIDsGroup()
    {
        for (final Nested3PartySubIDsGroupDecoder nested3PartySubIDsGroupDecoder : nested3PartySubIDsGroupIterator.iterator())
        {
            nested3PartySubIDsGroupDecoder.reset();
            if (nested3PartySubIDsGroupDecoder.next() == null)
            {
                break;
            }
        }
        noNested3PartySubIDsGroupCounter = MISSING_INT;
        hasNoNested3PartySubIDsGroupCounter = false;
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
        builder.append("\"MessageName\": \"Nested3PartyIDsGroup\",\n");
        if (hasNested3PartyID())
        {
            indent(builder, level);
            builder.append("\"Nested3PartyID\": \"");
            builder.append(this.nested3PartyID(), 0, nested3PartyIDLength());
            builder.append("\",\n");
        }

        if (hasNested3PartyIDSource())
        {
            indent(builder, level);
            builder.append("\"Nested3PartyIDSource\": \"");
            builder.append(nested3PartyIDSource);
            builder.append("\",\n");
        }

        if (hasNested3PartyRole())
        {
            indent(builder, level);
            builder.append("\"Nested3PartyRole\": \"");
            builder.append(nested3PartyRole);
            builder.append("\",\n");
        }

    if (hasNoNested3PartySubIDsGroupCounter)
    {
        indent(builder, level);
        builder.append("\"Nested3PartySubIDsGroup\": [\n");
        Nested3PartySubIDsGroupDecoder nested3PartySubIDsGroup = this.nested3PartySubIDsGroup;
        for (int i = 0, size = this.noNested3PartySubIDsGroupCounter; i < size; i++)
        {
            indent(builder, level);
            nested3PartySubIDsGroup.appendTo(builder, level + 1);            if (nested3PartySubIDsGroup.next() != null)
            {
                builder.append(',');
            }
            builder.append('\n');
            nested3PartySubIDsGroup = nested3PartySubIDsGroup.next();        }
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
    public Nested3PartyIDsGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((Nested3PartyIDsGroupEncoder)encoder);
    }

    public Nested3PartyIDsGroupEncoder toEncoder(final Nested3PartyIDsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasNested3PartyID())
        {
            encoder.nested3PartyID(this.nested3PartyID(), 0, nested3PartyIDLength());
        }

        if (hasNested3PartyIDSource())
        {
            encoder.nested3PartyIDSource(this.nested3PartyIDSource());
        }

        if (hasNested3PartyRole())
        {
            encoder.nested3PartyRole(this.nested3PartyRole());
        }

        if (hasNoNested3PartySubIDsGroupCounter)
        {
            final int size = this.noNested3PartySubIDsGroupCounter;
            Nested3PartySubIDsGroupDecoder nested3PartySubIDsGroup = this.nested3PartySubIDsGroup;
            Nested3PartySubIDsGroupEncoder nested3PartySubIDsGroupEncoder = encoder.nested3PartySubIDsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (nested3PartySubIDsGroup != null)
                {
                    nested3PartySubIDsGroup.toEncoder(nested3PartySubIDsGroupEncoder);
                    nested3PartySubIDsGroup = nested3PartySubIDsGroup.next();
                    nested3PartySubIDsGroupEncoder = nested3PartySubIDsGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
    public class Nested3PartyIDsGroupIterator implements Iterable<Nested3PartyIDsGroupDecoder>, java.util.Iterator<Nested3PartyIDsGroupDecoder>
    {
        private final NestedParties3Decoder parent;
        private int remainder;
        private Nested3PartyIDsGroupDecoder current;

        public Nested3PartyIDsGroupIterator(final NestedParties3Decoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }
        public Nested3PartyIDsGroupDecoder next()
        {
            remainder--;
            final Nested3PartyIDsGroupDecoder value = current;
            current = current.next();
            return value;
        }
        public int numberFieldValue()
        {
            return parent.hasNoNested3PartyIDsGroupCounter() ? parent.noNested3PartyIDsGroupCounter() : 0;
        }
        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.nested3PartyIDsGroup();
        }
        public Nested3PartyIDsGroupIterator iterator()
        {
            reset();
            return this;
        }
    }

public Nested3PartyIDsGroupIterator nested3PartyIDsGroupIterator();
    public int noNested3PartyIDsGroupCounter();
    public boolean hasNoNested3PartyIDsGroupCounter();
    public Nested3PartyIDsGroupDecoder nested3PartyIDsGroup();

}
