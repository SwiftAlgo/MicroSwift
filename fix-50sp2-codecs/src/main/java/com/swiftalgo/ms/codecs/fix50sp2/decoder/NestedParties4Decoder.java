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
import com.swiftalgo.ms.codecs.fix50sp2.builder.NestedParties4Encoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.NestedParties4Encoder.Nested4PartyIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.NstdPtys4SubGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.NstdPtys4SubGrpEncoder.Nested4PartySubIDsGroupEncoder;

public interface NestedParties4Decoder 
{



public class Nested4PartyIDsGroupDecoder extends CommonDecoderImpl implements NstdPtys4SubGrpDecoder
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
            GROUP_FIELDS.add(Constants.NESTED4_PARTY_ID);
            GROUP_FIELDS.add(Constants.NESTED4_PARTY_ID_SOURCE);
            GROUP_FIELDS.add(Constants.NESTED4_PARTY_ROLE);
        }
    }

    public final IntHashSet ALL_GROUP_FIELDS = new IntHashSet(6);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            ALL_GROUP_FIELDS.add(Constants.NESTED4_PARTY_ID);
            ALL_GROUP_FIELDS.add(Constants.NESTED4_PARTY_ID_SOURCE);
            ALL_GROUP_FIELDS.add(Constants.NESTED4_PARTY_ROLE);
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
        if (hasNoNested4PartySubIDsGroupCounter)
        {
            {
                int count = 0;
                final Nested4PartySubIDsGroupIterator iterator = nested4PartySubIDsGroupIterator.iterator();
                for (final Nested4PartySubIDsGroupDecoder group : iterator)
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
                    invalidTagId = 1413;
                    rejectReason = 16;
                    return false;
                }
            }
        }
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public Nested4PartyIDsGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private Nested4PartyIDsGroupDecoder next = null;

    public Nested4PartyIDsGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(8);

    private char[] nested4PartyID = new char[1];

    private boolean hasNested4PartyID;

    public char[] nested4PartyID()
    {
        if (!hasNested4PartyID)
        {
            throw new IllegalArgumentException("No value for optional field: Nested4PartyID");
        }

        return nested4PartyID;
    }

    public boolean hasNested4PartyID()
    {
        return hasNested4PartyID;
    }


    private int nested4PartyIDOffset;

    private int nested4PartyIDLength;

    public int nested4PartyIDLength()
    {
        if (!hasNested4PartyID)
        {
            throw new IllegalArgumentException("No value for optional field: Nested4PartyID");
        }

        return nested4PartyIDLength;
    }

    public String nested4PartyIDAsString()
    {
        return hasNested4PartyID ? new String(nested4PartyID, 0, nested4PartyIDLength) : null;
    }

    public void nested4PartyID(final AsciiSequenceView view)
    {
        if (!hasNested4PartyID)
        {
            throw new IllegalArgumentException("No value for optional field: Nested4PartyID");
        }

        view.wrap(buffer, nested4PartyIDOffset, nested4PartyIDLength);
    }


    private final CharArrayWrapper nested4PartyIDWrapper = new CharArrayWrapper();
    private char nested4PartyIDSource = MISSING_CHAR;

    private boolean hasNested4PartyIDSource;

    public char nested4PartyIDSource()
    {
        if (!hasNested4PartyIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: Nested4PartyIDSource");
        }

        return nested4PartyIDSource;
    }

    public boolean hasNested4PartyIDSource()
    {
        return hasNested4PartyIDSource;
    }



    private int nested4PartyRole = MISSING_INT;

    private boolean hasNested4PartyRole;

    public int nested4PartyRole()
    {
        if (!hasNested4PartyRole)
        {
            throw new IllegalArgumentException("No value for optional field: Nested4PartyRole");
        }

        return nested4PartyRole;
    }

    public boolean hasNested4PartyRole()
    {
        return hasNested4PartyRole;
    }





    private Nested4PartySubIDsGroupDecoder nested4PartySubIDsGroup = null;
    public Nested4PartySubIDsGroupDecoder nested4PartySubIDsGroup()
    {
        return nested4PartySubIDsGroup;
    }

    private int noNested4PartySubIDsGroupCounter = MISSING_INT;

    private boolean hasNoNested4PartySubIDsGroupCounter;

    public int noNested4PartySubIDsGroupCounter()
    {
        if (!hasNoNested4PartySubIDsGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoNested4PartySubIDsGroupCounter");
        }

        return noNested4PartySubIDsGroupCounter;
    }

    public boolean hasNoNested4PartySubIDsGroupCounter()
    {
        return hasNoNested4PartySubIDsGroupCounter;
    }




    private Nested4PartySubIDsGroupIterator nested4PartySubIDsGroupIterator = new Nested4PartySubIDsGroupIterator(this);
    public Nested4PartySubIDsGroupIterator nested4PartySubIDsGroupIterator()
    {
        return nested4PartySubIDsGroupIterator.iterator();
    }


    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode Nested4PartyIDsGroup
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
                    next = new Nested4PartyIDsGroupDecoder(trailer, messageFields);
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
            case Constants.NESTED4_PARTY_ID:
                hasNested4PartyID = true;
                nested4PartyID = buffer.getChars(nested4PartyID, valueOffset, valueLength);
                nested4PartyIDOffset = valueOffset;
                nested4PartyIDLength = valueLength;
                break;

            case Constants.NESTED4_PARTY_ID_SOURCE:
                hasNested4PartyIDSource = true;
                nested4PartyIDSource = buffer.getChar(valueOffset);
                break;

            case Constants.NESTED4_PARTY_ROLE:
                hasNested4PartyRole = true;
                nested4PartyRole = getInt(buffer, valueOffset, endOfField, 1417, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.NO_NESTED4_PARTY_SUB_IDS_GROUP_COUNTER:
                hasNoNested4PartySubIDsGroupCounter = true;
                noNested4PartySubIDsGroupCounter = getInt(buffer, valueOffset, endOfField, 1413, CODEC_VALIDATION_ENABLED);
                if (nested4PartySubIDsGroup == null)
                {
                    nested4PartySubIDsGroup = new Nested4PartySubIDsGroupDecoder(trailer, messageFields);
                }
                Nested4PartySubIDsGroupDecoder nested4PartySubIDsGroupCurrent = nested4PartySubIDsGroup;
                position = endOfField + 1;
                final int noNested4PartySubIDsGroupCounter = this.noNested4PartySubIDsGroupCounter;
                for (int i = 0; i < noNested4PartySubIDsGroupCounter && position < end; i++)
                {
                    if (nested4PartySubIDsGroupCurrent != null)
                    {
                        position += nested4PartySubIDsGroupCurrent.decode(buffer, position, end - position);
                        nested4PartySubIDsGroupCurrent = nested4PartySubIDsGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (nested4PartySubIDsGroup.ALL_GROUP_FIELDS.contains(checkTag))
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
        this.resetNested4PartyID();
        this.resetNested4PartyIDSource();
        this.resetNested4PartyRole();
        this.resetNested4PartySubIDsGroup();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetNested4PartyID()
    {
        hasNested4PartyID = false;
    }

    public void resetNested4PartyIDSource()
    {
        hasNested4PartyIDSource = false;
    }

    public void resetNested4PartyRole()
    {
        hasNested4PartyRole = false;
    }

    public void resetNested4PartySubIDsGroup()
    {
        for (final Nested4PartySubIDsGroupDecoder nested4PartySubIDsGroupDecoder : nested4PartySubIDsGroupIterator.iterator())
        {
            nested4PartySubIDsGroupDecoder.reset();
            if (nested4PartySubIDsGroupDecoder.next() == null)
            {
                break;
            }
        }
        noNested4PartySubIDsGroupCounter = MISSING_INT;
        hasNoNested4PartySubIDsGroupCounter = false;
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
        builder.append("\"MessageName\": \"Nested4PartyIDsGroup\",\n");
        if (hasNested4PartyID())
        {
            indent(builder, level);
            builder.append("\"Nested4PartyID\": \"");
            builder.append(this.nested4PartyID(), 0, nested4PartyIDLength());
            builder.append("\",\n");
        }

        if (hasNested4PartyIDSource())
        {
            indent(builder, level);
            builder.append("\"Nested4PartyIDSource\": \"");
            builder.append(nested4PartyIDSource);
            builder.append("\",\n");
        }

        if (hasNested4PartyRole())
        {
            indent(builder, level);
            builder.append("\"Nested4PartyRole\": \"");
            builder.append(nested4PartyRole);
            builder.append("\",\n");
        }

        if (hasNoNested4PartySubIDsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"Nested4PartySubIDsGroup\": [\n");
            Nested4PartySubIDsGroupDecoder nested4PartySubIDsGroup = this.nested4PartySubIDsGroup;
            for (int i = 0, size = this.noNested4PartySubIDsGroupCounter; i < size; i++)
            {
                indent(builder, level);
                nested4PartySubIDsGroup.appendTo(builder, level + 1);
                if (nested4PartySubIDsGroup.next() != null)
                {
                    builder.append(',');
                }
                builder.append('\n');
                nested4PartySubIDsGroup = nested4PartySubIDsGroup.next();            }
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
    public NestedParties4Encoder.Nested4PartyIDsGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((NestedParties4Encoder.Nested4PartyIDsGroupEncoder)encoder);
    }

    public NestedParties4Encoder.Nested4PartyIDsGroupEncoder toEncoder(final NestedParties4Encoder.Nested4PartyIDsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasNested4PartyID())
        {
            encoder.nested4PartyID(this.nested4PartyID(), 0, nested4PartyIDLength());
        }

        if (hasNested4PartyIDSource())
        {
            encoder.nested4PartyIDSource(this.nested4PartyIDSource());
        }

        if (hasNested4PartyRole())
        {
            encoder.nested4PartyRole(this.nested4PartyRole());
        }


        final NstdPtys4SubGrpEncoder nstdPtys4SubGrp = encoder.nstdPtys4SubGrp();        if (hasNoNested4PartySubIDsGroupCounter)
        {
            final int size = this.noNested4PartySubIDsGroupCounter;
            Nested4PartySubIDsGroupDecoder nested4PartySubIDsGroup = this.nested4PartySubIDsGroup;
            Nested4PartySubIDsGroupEncoder nested4PartySubIDsGroupEncoder = nstdPtys4SubGrp.nested4PartySubIDsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (nested4PartySubIDsGroup != null)
                {
                    nested4PartySubIDsGroup.toEncoder(nested4PartySubIDsGroupEncoder);
                    nested4PartySubIDsGroup = nested4PartySubIDsGroup.next();
                    nested4PartySubIDsGroupEncoder = nested4PartySubIDsGroupEncoder.next();
                }
            }
        }

        return encoder;
    }

}
    public class Nested4PartyIDsGroupIterator implements Iterable<Nested4PartyIDsGroupDecoder>, java.util.Iterator<Nested4PartyIDsGroupDecoder>
    {
        private final NestedParties4Decoder parent;
        private int remainder;
        private Nested4PartyIDsGroupDecoder current;

        public Nested4PartyIDsGroupIterator(final NestedParties4Decoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }

        public Nested4PartyIDsGroupDecoder next()
        {
            remainder--;
            final Nested4PartyIDsGroupDecoder value = current;
            current = current.next();
            return value;
        }

        public int numberFieldValue()
        {
            return parent.hasNoNested4PartyIDsGroupCounter() ? parent.noNested4PartyIDsGroupCounter() : 0;
        }

        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.nested4PartyIDsGroup();
        }

        public Nested4PartyIDsGroupIterator iterator()
        {
            reset();
            return this;
        }

    }

    public Nested4PartyIDsGroupIterator nested4PartyIDsGroupIterator();
    public int noNested4PartyIDsGroupCounter();
    public boolean hasNoNested4PartyIDsGroupCounter();
    public Nested4PartyIDsGroupDecoder nested4PartyIDsGroup();

}
