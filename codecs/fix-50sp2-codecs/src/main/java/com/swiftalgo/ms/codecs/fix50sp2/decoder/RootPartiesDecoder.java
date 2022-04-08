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
import com.swiftalgo.ms.codecs.fix50sp2.builder.RootPartiesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.RootPartiesEncoder.RootPartyIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.RootSubPartiesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.RootSubPartiesEncoder.RootPartySubIDsGroupEncoder;

public interface RootPartiesDecoder 
{



public class RootPartyIDsGroupDecoder extends CommonDecoderImpl implements RootSubPartiesDecoder
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
            GROUP_FIELDS.add(Constants.ROOT_PARTY_ID);
            GROUP_FIELDS.add(Constants.ROOT_PARTY_ID_SOURCE);
            GROUP_FIELDS.add(Constants.ROOT_PARTY_ROLE);
        }
    }

    public final IntHashSet ALL_GROUP_FIELDS = new IntHashSet(6);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            ALL_GROUP_FIELDS.add(Constants.ROOT_PARTY_ID);
            ALL_GROUP_FIELDS.add(Constants.ROOT_PARTY_ID_SOURCE);
            ALL_GROUP_FIELDS.add(Constants.ROOT_PARTY_ROLE);
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
        if (hasNoRootPartySubIDsGroupCounter)
        {
            {
                int count = 0;
                final RootPartySubIDsGroupIterator iterator = rootPartySubIDsGroupIterator.iterator();
                for (final RootPartySubIDsGroupDecoder group : iterator)
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
                    invalidTagId = 1120;
                    rejectReason = 16;
                    return false;
                }
            }
        }
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public RootPartyIDsGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private RootPartyIDsGroupDecoder next = null;

    public RootPartyIDsGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(8);

    private char[] rootPartyID = new char[1];

    private boolean hasRootPartyID;

    public char[] rootPartyID()
    {
        if (!hasRootPartyID)
        {
            throw new IllegalArgumentException("No value for optional field: RootPartyID");
        }

        return rootPartyID;
    }

    public boolean hasRootPartyID()
    {
        return hasRootPartyID;
    }


    private int rootPartyIDOffset;

    private int rootPartyIDLength;

    public int rootPartyIDLength()
    {
        if (!hasRootPartyID)
        {
            throw new IllegalArgumentException("No value for optional field: RootPartyID");
        }

        return rootPartyIDLength;
    }

    public String rootPartyIDAsString()
    {
        return hasRootPartyID ? new String(rootPartyID, 0, rootPartyIDLength) : null;
    }

    public void rootPartyID(final AsciiSequenceView view)
    {
        if (!hasRootPartyID)
        {
            throw new IllegalArgumentException("No value for optional field: RootPartyID");
        }

        view.wrap(buffer, rootPartyIDOffset, rootPartyIDLength);
    }


    private final CharArrayWrapper rootPartyIDWrapper = new CharArrayWrapper();
    private char rootPartyIDSource = MISSING_CHAR;

    private boolean hasRootPartyIDSource;

    public char rootPartyIDSource()
    {
        if (!hasRootPartyIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: RootPartyIDSource");
        }

        return rootPartyIDSource;
    }

    public boolean hasRootPartyIDSource()
    {
        return hasRootPartyIDSource;
    }



    private int rootPartyRole = MISSING_INT;

    private boolean hasRootPartyRole;

    public int rootPartyRole()
    {
        if (!hasRootPartyRole)
        {
            throw new IllegalArgumentException("No value for optional field: RootPartyRole");
        }

        return rootPartyRole;
    }

    public boolean hasRootPartyRole()
    {
        return hasRootPartyRole;
    }





    private RootPartySubIDsGroupDecoder rootPartySubIDsGroup = null;
    public RootPartySubIDsGroupDecoder rootPartySubIDsGroup()
    {
        return rootPartySubIDsGroup;
    }

    private int noRootPartySubIDsGroupCounter = MISSING_INT;

    private boolean hasNoRootPartySubIDsGroupCounter;

    public int noRootPartySubIDsGroupCounter()
    {
        if (!hasNoRootPartySubIDsGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoRootPartySubIDsGroupCounter");
        }

        return noRootPartySubIDsGroupCounter;
    }

    public boolean hasNoRootPartySubIDsGroupCounter()
    {
        return hasNoRootPartySubIDsGroupCounter;
    }




    private RootPartySubIDsGroupIterator rootPartySubIDsGroupIterator = new RootPartySubIDsGroupIterator(this);
    public RootPartySubIDsGroupIterator rootPartySubIDsGroupIterator()
    {
        return rootPartySubIDsGroupIterator.iterator();
    }


    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode RootPartyIDsGroup
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
                    next = new RootPartyIDsGroupDecoder(trailer, messageFields);
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
            case Constants.ROOT_PARTY_ID:
                hasRootPartyID = true;
                rootPartyID = buffer.getChars(rootPartyID, valueOffset, valueLength);
                rootPartyIDOffset = valueOffset;
                rootPartyIDLength = valueLength;
                break;

            case Constants.ROOT_PARTY_ID_SOURCE:
                hasRootPartyIDSource = true;
                rootPartyIDSource = buffer.getChar(valueOffset);
                break;

            case Constants.ROOT_PARTY_ROLE:
                hasRootPartyRole = true;
                rootPartyRole = getInt(buffer, valueOffset, endOfField, 1119, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.NO_ROOT_PARTY_SUB_IDS_GROUP_COUNTER:
                hasNoRootPartySubIDsGroupCounter = true;
                noRootPartySubIDsGroupCounter = getInt(buffer, valueOffset, endOfField, 1120, CODEC_VALIDATION_ENABLED);
                if (rootPartySubIDsGroup == null)
                {
                    rootPartySubIDsGroup = new RootPartySubIDsGroupDecoder(trailer, messageFields);
                }
                RootPartySubIDsGroupDecoder rootPartySubIDsGroupCurrent = rootPartySubIDsGroup;
                position = endOfField + 1;
                final int noRootPartySubIDsGroupCounter = this.noRootPartySubIDsGroupCounter;
                for (int i = 0; i < noRootPartySubIDsGroupCounter && position < end; i++)
                {
                    if (rootPartySubIDsGroupCurrent != null)
                    {
                        position += rootPartySubIDsGroupCurrent.decode(buffer, position, end - position);
                        rootPartySubIDsGroupCurrent = rootPartySubIDsGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (rootPartySubIDsGroup.ALL_GROUP_FIELDS.contains(checkTag))
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
        this.resetRootPartyID();
        this.resetRootPartyIDSource();
        this.resetRootPartyRole();
        this.resetRootPartySubIDsGroup();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetRootPartyID()
    {
        hasRootPartyID = false;
    }

    public void resetRootPartyIDSource()
    {
        hasRootPartyIDSource = false;
    }

    public void resetRootPartyRole()
    {
        hasRootPartyRole = false;
    }

    public void resetRootPartySubIDsGroup()
    {
        for (final RootPartySubIDsGroupDecoder rootPartySubIDsGroupDecoder : rootPartySubIDsGroupIterator.iterator())
        {
            rootPartySubIDsGroupDecoder.reset();
            if (rootPartySubIDsGroupDecoder.next() == null)
            {
                break;
            }
        }
        noRootPartySubIDsGroupCounter = MISSING_INT;
        hasNoRootPartySubIDsGroupCounter = false;
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
        builder.append("\"MessageName\": \"RootPartyIDsGroup\",\n");
        if (hasRootPartyID())
        {
            indent(builder, level);
            builder.append("\"RootPartyID\": \"");
            builder.append(this.rootPartyID(), 0, rootPartyIDLength());
            builder.append("\",\n");
        }

        if (hasRootPartyIDSource())
        {
            indent(builder, level);
            builder.append("\"RootPartyIDSource\": \"");
            builder.append(rootPartyIDSource);
            builder.append("\",\n");
        }

        if (hasRootPartyRole())
        {
            indent(builder, level);
            builder.append("\"RootPartyRole\": \"");
            builder.append(rootPartyRole);
            builder.append("\",\n");
        }

        if (hasNoRootPartySubIDsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"RootPartySubIDsGroup\": [\n");
            RootPartySubIDsGroupDecoder rootPartySubIDsGroup = this.rootPartySubIDsGroup;
            for (int i = 0, size = this.noRootPartySubIDsGroupCounter; i < size; i++)
            {
                indent(builder, level);
                rootPartySubIDsGroup.appendTo(builder, level + 1);
                if (rootPartySubIDsGroup.next() != null)
                {
                    builder.append(',');
                }
                builder.append('\n');
                rootPartySubIDsGroup = rootPartySubIDsGroup.next();            }
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
    public RootPartiesEncoder.RootPartyIDsGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((RootPartiesEncoder.RootPartyIDsGroupEncoder)encoder);
    }

    public RootPartiesEncoder.RootPartyIDsGroupEncoder toEncoder(final RootPartiesEncoder.RootPartyIDsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasRootPartyID())
        {
            encoder.rootPartyID(this.rootPartyID(), 0, rootPartyIDLength());
        }

        if (hasRootPartyIDSource())
        {
            encoder.rootPartyIDSource(this.rootPartyIDSource());
        }

        if (hasRootPartyRole())
        {
            encoder.rootPartyRole(this.rootPartyRole());
        }


        final RootSubPartiesEncoder rootSubParties = encoder.rootSubParties();        if (hasNoRootPartySubIDsGroupCounter)
        {
            final int size = this.noRootPartySubIDsGroupCounter;
            RootPartySubIDsGroupDecoder rootPartySubIDsGroup = this.rootPartySubIDsGroup;
            RootPartySubIDsGroupEncoder rootPartySubIDsGroupEncoder = rootSubParties.rootPartySubIDsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (rootPartySubIDsGroup != null)
                {
                    rootPartySubIDsGroup.toEncoder(rootPartySubIDsGroupEncoder);
                    rootPartySubIDsGroup = rootPartySubIDsGroup.next();
                    rootPartySubIDsGroupEncoder = rootPartySubIDsGroupEncoder.next();
                }
            }
        }

        return encoder;
    }

}
    public class RootPartyIDsGroupIterator implements Iterable<RootPartyIDsGroupDecoder>, java.util.Iterator<RootPartyIDsGroupDecoder>
    {
        private final RootPartiesDecoder parent;
        private int remainder;
        private RootPartyIDsGroupDecoder current;

        public RootPartyIDsGroupIterator(final RootPartiesDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }

        public RootPartyIDsGroupDecoder next()
        {
            remainder--;
            final RootPartyIDsGroupDecoder value = current;
            current = current.next();
            return value;
        }

        public int numberFieldValue()
        {
            return parent.hasNoRootPartyIDsGroupCounter() ? parent.noRootPartyIDsGroupCounter() : 0;
        }

        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.rootPartyIDsGroup();
        }

        public RootPartyIDsGroupIterator iterator()
        {
            reset();
            return this;
        }

    }

    public RootPartyIDsGroupIterator rootPartyIDsGroupIterator();
    public int noRootPartyIDsGroupCounter();
    public boolean hasNoRootPartyIDsGroupCounter();
    public RootPartyIDsGroupDecoder rootPartyIDsGroup();

}
