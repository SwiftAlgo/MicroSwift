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
import com.swiftalgo.ms.codecs.fix50sp2.builder.SettlPartiesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.SettlPartiesEncoder.SettlPartyIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.SettlPtysSubGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.SettlPtysSubGrpEncoder.SettlPartySubIDsGroupEncoder;

public interface SettlPartiesDecoder 
{



public class SettlPartyIDsGroupDecoder extends CommonDecoderImpl implements SettlPtysSubGrpDecoder
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
            GROUP_FIELDS.add(Constants.SETTL_PARTY_ID);
            GROUP_FIELDS.add(Constants.SETTL_PARTY_ID_SOURCE);
            GROUP_FIELDS.add(Constants.SETTL_PARTY_ROLE);
        }
    }

    public final IntHashSet ALL_GROUP_FIELDS = new IntHashSet(6);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            ALL_GROUP_FIELDS.add(Constants.SETTL_PARTY_ID);
            ALL_GROUP_FIELDS.add(Constants.SETTL_PARTY_ID_SOURCE);
            ALL_GROUP_FIELDS.add(Constants.SETTL_PARTY_ROLE);
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
        if (hasNoSettlPartySubIDsGroupCounter)
        {
            {
                int count = 0;
                final SettlPartySubIDsGroupIterator iterator = settlPartySubIDsGroupIterator.iterator();
                for (final SettlPartySubIDsGroupDecoder group : iterator)
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
                    invalidTagId = 801;
                    rejectReason = 16;
                    return false;
                }
            }
        }
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public SettlPartyIDsGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private SettlPartyIDsGroupDecoder next = null;

    public SettlPartyIDsGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(8);

    private char[] settlPartyID = new char[1];

    private boolean hasSettlPartyID;

    public char[] settlPartyID()
    {
        if (!hasSettlPartyID)
        {
            throw new IllegalArgumentException("No value for optional field: SettlPartyID");
        }

        return settlPartyID;
    }

    public boolean hasSettlPartyID()
    {
        return hasSettlPartyID;
    }


    private int settlPartyIDOffset;

    private int settlPartyIDLength;

    public int settlPartyIDLength()
    {
        if (!hasSettlPartyID)
        {
            throw new IllegalArgumentException("No value for optional field: SettlPartyID");
        }

        return settlPartyIDLength;
    }

    public String settlPartyIDAsString()
    {
        return hasSettlPartyID ? new String(settlPartyID, 0, settlPartyIDLength) : null;
    }

    public void settlPartyID(final AsciiSequenceView view)
    {
        if (!hasSettlPartyID)
        {
            throw new IllegalArgumentException("No value for optional field: SettlPartyID");
        }

        view.wrap(buffer, settlPartyIDOffset, settlPartyIDLength);
    }


    private char settlPartyIDSource = MISSING_CHAR;

    private boolean hasSettlPartyIDSource;

    public char settlPartyIDSource()
    {
        if (!hasSettlPartyIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: SettlPartyIDSource");
        }

        return settlPartyIDSource;
    }

    public boolean hasSettlPartyIDSource()
    {
        return hasSettlPartyIDSource;
    }



    private int settlPartyRole = MISSING_INT;

    private boolean hasSettlPartyRole;

    public int settlPartyRole()
    {
        if (!hasSettlPartyRole)
        {
            throw new IllegalArgumentException("No value for optional field: SettlPartyRole");
        }

        return settlPartyRole;
    }

    public boolean hasSettlPartyRole()
    {
        return hasSettlPartyRole;
    }





    private SettlPartySubIDsGroupDecoder settlPartySubIDsGroup = null;
    public SettlPartySubIDsGroupDecoder settlPartySubIDsGroup()
    {
        return settlPartySubIDsGroup;
    }

    private int noSettlPartySubIDsGroupCounter = MISSING_INT;

    private boolean hasNoSettlPartySubIDsGroupCounter;

    public int noSettlPartySubIDsGroupCounter()
    {
        if (!hasNoSettlPartySubIDsGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoSettlPartySubIDsGroupCounter");
        }

        return noSettlPartySubIDsGroupCounter;
    }

    public boolean hasNoSettlPartySubIDsGroupCounter()
    {
        return hasNoSettlPartySubIDsGroupCounter;
    }




    private SettlPartySubIDsGroupIterator settlPartySubIDsGroupIterator = new SettlPartySubIDsGroupIterator(this);
    public SettlPartySubIDsGroupIterator settlPartySubIDsGroupIterator()
    {
        return settlPartySubIDsGroupIterator.iterator();
    }


    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode SettlPartyIDsGroup
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
                    next = new SettlPartyIDsGroupDecoder(trailer, messageFields);
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
            case Constants.SETTL_PARTY_ID:
                hasSettlPartyID = true;
                settlPartyID = buffer.getChars(settlPartyID, valueOffset, valueLength);
                settlPartyIDOffset = valueOffset;
                settlPartyIDLength = valueLength;
                break;

            case Constants.SETTL_PARTY_ID_SOURCE:
                hasSettlPartyIDSource = true;
                settlPartyIDSource = buffer.getChar(valueOffset);
                break;

            case Constants.SETTL_PARTY_ROLE:
                hasSettlPartyRole = true;
                settlPartyRole = getInt(buffer, valueOffset, endOfField, 784, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.NO_SETTL_PARTY_SUB_IDS:
                hasNoSettlPartySubIDsGroupCounter = true;
                noSettlPartySubIDsGroupCounter = getInt(buffer, valueOffset, endOfField, 801, CODEC_VALIDATION_ENABLED);
                if (settlPartySubIDsGroup == null)
                {
                    settlPartySubIDsGroup = new SettlPartySubIDsGroupDecoder(trailer, messageFields);
                }
                SettlPartySubIDsGroupDecoder settlPartySubIDsGroupCurrent = settlPartySubIDsGroup;
                position = endOfField + 1;
                final int noSettlPartySubIDsGroupCounter = this.noSettlPartySubIDsGroupCounter;
                for (int i = 0; i < noSettlPartySubIDsGroupCounter && position < end; i++)
                {
                    if (settlPartySubIDsGroupCurrent != null)
                    {
                        position += settlPartySubIDsGroupCurrent.decode(buffer, position, end - position);
                        settlPartySubIDsGroupCurrent = settlPartySubIDsGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (settlPartySubIDsGroup.ALL_GROUP_FIELDS.contains(checkTag))
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
        this.resetSettlPartyID();
        this.resetSettlPartyIDSource();
        this.resetSettlPartyRole();
        this.resetSettlPartySubIDsGroup();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetSettlPartyID()
    {
        hasSettlPartyID = false;
    }

    public void resetSettlPartyIDSource()
    {
        hasSettlPartyIDSource = false;
    }

    public void resetSettlPartyRole()
    {
        hasSettlPartyRole = false;
    }

    public void resetSettlPartySubIDsGroup()
    {
        for (final SettlPartySubIDsGroupDecoder settlPartySubIDsGroupDecoder : settlPartySubIDsGroupIterator.iterator())
        {
            settlPartySubIDsGroupDecoder.reset();
            if (settlPartySubIDsGroupDecoder.next() == null)
            {
                break;
            }
        }
        noSettlPartySubIDsGroupCounter = MISSING_INT;
        hasNoSettlPartySubIDsGroupCounter = false;
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
        builder.append("\"MessageName\": \"SettlPartyIDsGroup\",\n");
        if (hasSettlPartyID())
        {
            indent(builder, level);
            builder.append("\"SettlPartyID\": \"");
            builder.append(this.settlPartyID(), 0, settlPartyIDLength());
            builder.append("\",\n");
        }

        if (hasSettlPartyIDSource())
        {
            indent(builder, level);
            builder.append("\"SettlPartyIDSource\": \"");
            builder.append(settlPartyIDSource);
            builder.append("\",\n");
        }

        if (hasSettlPartyRole())
        {
            indent(builder, level);
            builder.append("\"SettlPartyRole\": \"");
            builder.append(settlPartyRole);
            builder.append("\",\n");
        }

    if (hasNoSettlPartySubIDsGroupCounter)
    {
        indent(builder, level);
        builder.append("\"SettlPartySubIDsGroup\": [\n");
        SettlPartySubIDsGroupDecoder settlPartySubIDsGroup = this.settlPartySubIDsGroup;
        for (int i = 0, size = this.noSettlPartySubIDsGroupCounter; i < size; i++)
        {
            indent(builder, level);
            settlPartySubIDsGroup.appendTo(builder, level + 1);            if (settlPartySubIDsGroup.next() != null)
            {
                builder.append(',');
            }
            builder.append('\n');
            settlPartySubIDsGroup = settlPartySubIDsGroup.next();        }
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
    public SettlPartyIDsGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((SettlPartyIDsGroupEncoder)encoder);
    }

    public SettlPartyIDsGroupEncoder toEncoder(final SettlPartyIDsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasSettlPartyID())
        {
            encoder.settlPartyID(this.settlPartyID(), 0, settlPartyIDLength());
        }

        if (hasSettlPartyIDSource())
        {
            encoder.settlPartyIDSource(this.settlPartyIDSource());
        }

        if (hasSettlPartyRole())
        {
            encoder.settlPartyRole(this.settlPartyRole());
        }


        final SettlPtysSubGrpEncoder settlPtysSubGrp = encoder.settlPtysSubGrp();        if (hasNoSettlPartySubIDsGroupCounter)
        {
            final int size = this.noSettlPartySubIDsGroupCounter;
            SettlPartySubIDsGroupDecoder settlPartySubIDsGroup = this.settlPartySubIDsGroup;
            SettlPartySubIDsGroupEncoder settlPartySubIDsGroupEncoder = settlPtysSubGrp.settlPartySubIDsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (settlPartySubIDsGroup != null)
                {
                    settlPartySubIDsGroup.toEncoder(settlPartySubIDsGroupEncoder);
                    settlPartySubIDsGroup = settlPartySubIDsGroup.next();
                    settlPartySubIDsGroupEncoder = settlPartySubIDsGroupEncoder.next();
                }
            }
        }

        return encoder;
    }

}
    public class SettlPartyIDsGroupIterator implements Iterable<SettlPartyIDsGroupDecoder>, java.util.Iterator<SettlPartyIDsGroupDecoder>
    {
        private final SettlPartiesDecoder parent;
        private int remainder;
        private SettlPartyIDsGroupDecoder current;

        public SettlPartyIDsGroupIterator(final SettlPartiesDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }
        public SettlPartyIDsGroupDecoder next()
        {
            remainder--;
            final SettlPartyIDsGroupDecoder value = current;
            current = current.next();
            return value;
        }
        public int numberFieldValue()
        {
            return parent.hasNoSettlPartyIDsGroupCounter() ? parent.noSettlPartyIDsGroupCounter() : 0;
        }
        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.settlPartyIDsGroup();
        }
        public SettlPartyIDsGroupIterator iterator()
        {
            reset();
            return this;
        }
    }

public SettlPartyIDsGroupIterator settlPartyIDsGroupIterator();
    public int noSettlPartyIDsGroupCounter();
    public boolean hasNoSettlPartyIDsGroupCounter();
    public SettlPartyIDsGroupDecoder settlPartyIDsGroup();

}
