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
import com.swiftalgo.ms.codecs.fix50sp2.builder.NestedParties2Encoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.NestedParties2Encoder.Nested2PartyIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.NstdPtys2SubGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.NstdPtys2SubGrpEncoder.Nested2PartySubIDsGroupEncoder;

public interface NestedParties2Decoder 
{



public class Nested2PartyIDsGroupDecoder extends CommonDecoderImpl implements NstdPtys2SubGrpDecoder
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
            GROUP_FIELDS.add(Constants.NESTED2_PARTY_ID);
            GROUP_FIELDS.add(Constants.NESTED2_PARTY_ID_SOURCE);
            GROUP_FIELDS.add(Constants.NESTED2_PARTY_ROLE);
        }
    }

    public final IntHashSet ALL_GROUP_FIELDS = new IntHashSet(6);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            ALL_GROUP_FIELDS.add(Constants.NESTED2_PARTY_ID);
            ALL_GROUP_FIELDS.add(Constants.NESTED2_PARTY_ID_SOURCE);
            ALL_GROUP_FIELDS.add(Constants.NESTED2_PARTY_ROLE);
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
        if (hasNoNested2PartySubIDsGroupCounter)
        {
            {
                int count = 0;
                final Nested2PartySubIDsGroupIterator iterator = nested2PartySubIDsGroupIterator.iterator();
                for (final Nested2PartySubIDsGroupDecoder group : iterator)
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
                    invalidTagId = 806;
                    rejectReason = 16;
                    return false;
                }
            }
        }
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public Nested2PartyIDsGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private Nested2PartyIDsGroupDecoder next = null;

    public Nested2PartyIDsGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(8);

    private char[] nested2PartyID = new char[1];

    private boolean hasNested2PartyID;

    public char[] nested2PartyID()
    {
        if (!hasNested2PartyID)
        {
            throw new IllegalArgumentException("No value for optional field: Nested2PartyID");
        }

        return nested2PartyID;
    }

    public boolean hasNested2PartyID()
    {
        return hasNested2PartyID;
    }


    private int nested2PartyIDOffset;

    private int nested2PartyIDLength;

    public int nested2PartyIDLength()
    {
        if (!hasNested2PartyID)
        {
            throw new IllegalArgumentException("No value for optional field: Nested2PartyID");
        }

        return nested2PartyIDLength;
    }

    public String nested2PartyIDAsString()
    {
        return hasNested2PartyID ? new String(nested2PartyID, 0, nested2PartyIDLength) : null;
    }

    public void nested2PartyID(final AsciiSequenceView view)
    {
        if (!hasNested2PartyID)
        {
            throw new IllegalArgumentException("No value for optional field: Nested2PartyID");
        }

        view.wrap(buffer, nested2PartyIDOffset, nested2PartyIDLength);
    }


    private char nested2PartyIDSource = MISSING_CHAR;

    private boolean hasNested2PartyIDSource;

    public char nested2PartyIDSource()
    {
        if (!hasNested2PartyIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: Nested2PartyIDSource");
        }

        return nested2PartyIDSource;
    }

    public boolean hasNested2PartyIDSource()
    {
        return hasNested2PartyIDSource;
    }



    private int nested2PartyRole = MISSING_INT;

    private boolean hasNested2PartyRole;

    public int nested2PartyRole()
    {
        if (!hasNested2PartyRole)
        {
            throw new IllegalArgumentException("No value for optional field: Nested2PartyRole");
        }

        return nested2PartyRole;
    }

    public boolean hasNested2PartyRole()
    {
        return hasNested2PartyRole;
    }





    private Nested2PartySubIDsGroupDecoder nested2PartySubIDsGroup = null;
    public Nested2PartySubIDsGroupDecoder nested2PartySubIDsGroup()
    {
        return nested2PartySubIDsGroup;
    }

    private int noNested2PartySubIDsGroupCounter = MISSING_INT;

    private boolean hasNoNested2PartySubIDsGroupCounter;

    public int noNested2PartySubIDsGroupCounter()
    {
        if (!hasNoNested2PartySubIDsGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoNested2PartySubIDsGroupCounter");
        }

        return noNested2PartySubIDsGroupCounter;
    }

    public boolean hasNoNested2PartySubIDsGroupCounter()
    {
        return hasNoNested2PartySubIDsGroupCounter;
    }




    private Nested2PartySubIDsGroupIterator nested2PartySubIDsGroupIterator = new Nested2PartySubIDsGroupIterator(this);
    public Nested2PartySubIDsGroupIterator nested2PartySubIDsGroupIterator()
    {
        return nested2PartySubIDsGroupIterator.iterator();
    }


    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode Nested2PartyIDsGroup
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
                    next = new Nested2PartyIDsGroupDecoder(trailer, messageFields);
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
            case Constants.NESTED2_PARTY_ID:
                hasNested2PartyID = true;
                nested2PartyID = buffer.getChars(nested2PartyID, valueOffset, valueLength);
                nested2PartyIDOffset = valueOffset;
                nested2PartyIDLength = valueLength;
                break;

            case Constants.NESTED2_PARTY_ID_SOURCE:
                hasNested2PartyIDSource = true;
                nested2PartyIDSource = buffer.getChar(valueOffset);
                break;

            case Constants.NESTED2_PARTY_ROLE:
                hasNested2PartyRole = true;
                nested2PartyRole = getInt(buffer, valueOffset, endOfField, 759, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.NO_NESTED2_PARTY_SUB_IDS:
                hasNoNested2PartySubIDsGroupCounter = true;
                noNested2PartySubIDsGroupCounter = getInt(buffer, valueOffset, endOfField, 806, CODEC_VALIDATION_ENABLED);
                if (nested2PartySubIDsGroup == null)
                {
                    nested2PartySubIDsGroup = new Nested2PartySubIDsGroupDecoder(trailer, messageFields);
                }
                Nested2PartySubIDsGroupDecoder nested2PartySubIDsGroupCurrent = nested2PartySubIDsGroup;
                position = endOfField + 1;
                final int noNested2PartySubIDsGroupCounter = this.noNested2PartySubIDsGroupCounter;
                for (int i = 0; i < noNested2PartySubIDsGroupCounter && position < end; i++)
                {
                    if (nested2PartySubIDsGroupCurrent != null)
                    {
                        position += nested2PartySubIDsGroupCurrent.decode(buffer, position, end - position);
                        nested2PartySubIDsGroupCurrent = nested2PartySubIDsGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (nested2PartySubIDsGroup.ALL_GROUP_FIELDS.contains(checkTag))
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
        this.resetNested2PartyID();
        this.resetNested2PartyIDSource();
        this.resetNested2PartyRole();
        this.resetNested2PartySubIDsGroup();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetNested2PartyID()
    {
        hasNested2PartyID = false;
    }

    public void resetNested2PartyIDSource()
    {
        hasNested2PartyIDSource = false;
    }

    public void resetNested2PartyRole()
    {
        hasNested2PartyRole = false;
    }

    public void resetNested2PartySubIDsGroup()
    {
        for (final Nested2PartySubIDsGroupDecoder nested2PartySubIDsGroupDecoder : nested2PartySubIDsGroupIterator.iterator())
        {
            nested2PartySubIDsGroupDecoder.reset();
            if (nested2PartySubIDsGroupDecoder.next() == null)
            {
                break;
            }
        }
        noNested2PartySubIDsGroupCounter = MISSING_INT;
        hasNoNested2PartySubIDsGroupCounter = false;
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
        builder.append("\"MessageName\": \"Nested2PartyIDsGroup\",\n");
        if (hasNested2PartyID())
        {
            indent(builder, level);
            builder.append("\"Nested2PartyID\": \"");
            builder.append(this.nested2PartyID(), 0, nested2PartyIDLength());
            builder.append("\",\n");
        }

        if (hasNested2PartyIDSource())
        {
            indent(builder, level);
            builder.append("\"Nested2PartyIDSource\": \"");
            builder.append(nested2PartyIDSource);
            builder.append("\",\n");
        }

        if (hasNested2PartyRole())
        {
            indent(builder, level);
            builder.append("\"Nested2PartyRole\": \"");
            builder.append(nested2PartyRole);
            builder.append("\",\n");
        }

    if (hasNoNested2PartySubIDsGroupCounter)
    {
        indent(builder, level);
        builder.append("\"Nested2PartySubIDsGroup\": [\n");
        Nested2PartySubIDsGroupDecoder nested2PartySubIDsGroup = this.nested2PartySubIDsGroup;
        for (int i = 0, size = this.noNested2PartySubIDsGroupCounter; i < size; i++)
        {
            indent(builder, level);
            nested2PartySubIDsGroup.appendTo(builder, level + 1);            if (nested2PartySubIDsGroup.next() != null)
            {
                builder.append(',');
            }
            builder.append('\n');
            nested2PartySubIDsGroup = nested2PartySubIDsGroup.next();        }
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
    public Nested2PartyIDsGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((Nested2PartyIDsGroupEncoder)encoder);
    }

    public Nested2PartyIDsGroupEncoder toEncoder(final Nested2PartyIDsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasNested2PartyID())
        {
            encoder.nested2PartyID(this.nested2PartyID(), 0, nested2PartyIDLength());
        }

        if (hasNested2PartyIDSource())
        {
            encoder.nested2PartyIDSource(this.nested2PartyIDSource());
        }

        if (hasNested2PartyRole())
        {
            encoder.nested2PartyRole(this.nested2PartyRole());
        }


        final NstdPtys2SubGrpEncoder nstdPtys2SubGrp = encoder.nstdPtys2SubGrp();        if (hasNoNested2PartySubIDsGroupCounter)
        {
            final int size = this.noNested2PartySubIDsGroupCounter;
            Nested2PartySubIDsGroupDecoder nested2PartySubIDsGroup = this.nested2PartySubIDsGroup;
            Nested2PartySubIDsGroupEncoder nested2PartySubIDsGroupEncoder = nstdPtys2SubGrp.nested2PartySubIDsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (nested2PartySubIDsGroup != null)
                {
                    nested2PartySubIDsGroup.toEncoder(nested2PartySubIDsGroupEncoder);
                    nested2PartySubIDsGroup = nested2PartySubIDsGroup.next();
                    nested2PartySubIDsGroupEncoder = nested2PartySubIDsGroupEncoder.next();
                }
            }
        }

        return encoder;
    }

}
    public class Nested2PartyIDsGroupIterator implements Iterable<Nested2PartyIDsGroupDecoder>, java.util.Iterator<Nested2PartyIDsGroupDecoder>
    {
        private final NestedParties2Decoder parent;
        private int remainder;
        private Nested2PartyIDsGroupDecoder current;

        public Nested2PartyIDsGroupIterator(final NestedParties2Decoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }
        public Nested2PartyIDsGroupDecoder next()
        {
            remainder--;
            final Nested2PartyIDsGroupDecoder value = current;
            current = current.next();
            return value;
        }
        public int numberFieldValue()
        {
            return parent.hasNoNested2PartyIDsGroupCounter() ? parent.noNested2PartyIDsGroupCounter() : 0;
        }
        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.nested2PartyIDsGroup();
        }
        public Nested2PartyIDsGroupIterator iterator()
        {
            reset();
            return this;
        }
    }

public Nested2PartyIDsGroupIterator nested2PartyIDsGroupIterator();
    public int noNested2PartyIDsGroupCounter();
    public boolean hasNoNested2PartyIDsGroupCounter();
    public Nested2PartyIDsGroupDecoder nested2PartyIDsGroup();

}
