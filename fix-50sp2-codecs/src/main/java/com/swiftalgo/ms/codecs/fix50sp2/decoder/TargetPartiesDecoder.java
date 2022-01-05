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
import com.swiftalgo.ms.codecs.fix50sp2.builder.TargetPartiesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.TargetPartiesEncoder.TargetPartyIDsGroupEncoder;

public interface TargetPartiesDecoder 
{



public class TargetPartyIDsGroupDecoder extends CommonDecoderImpl
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(0);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
        }
    }

    public final IntHashSet ALL_GROUP_FIELDS = new IntHashSet(6);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            ALL_GROUP_FIELDS.add(Constants.TARGET_PARTY_ID);
            ALL_GROUP_FIELDS.add(Constants.TARGET_PARTY_ID_SOURCE);
            ALL_GROUP_FIELDS.add(Constants.TARGET_PARTY_ROLE);
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
    public TargetPartyIDsGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private TargetPartyIDsGroupDecoder next = null;

    public TargetPartyIDsGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(6);

    private char[] targetPartyID = new char[1];

    private boolean hasTargetPartyID;

    public char[] targetPartyID()
    {
        if (!hasTargetPartyID)
        {
            throw new IllegalArgumentException("No value for optional field: TargetPartyID");
        }

        return targetPartyID;
    }

    public boolean hasTargetPartyID()
    {
        return hasTargetPartyID;
    }


    private int targetPartyIDOffset;

    private int targetPartyIDLength;

    public int targetPartyIDLength()
    {
        if (!hasTargetPartyID)
        {
            throw new IllegalArgumentException("No value for optional field: TargetPartyID");
        }

        return targetPartyIDLength;
    }

    public String targetPartyIDAsString()
    {
        return hasTargetPartyID ? new String(targetPartyID, 0, targetPartyIDLength) : null;
    }

    public void targetPartyID(final AsciiSequenceView view)
    {
        if (!hasTargetPartyID)
        {
            throw new IllegalArgumentException("No value for optional field: TargetPartyID");
        }

        view.wrap(buffer, targetPartyIDOffset, targetPartyIDLength);
    }


    private char targetPartyIDSource = MISSING_CHAR;

    private boolean hasTargetPartyIDSource;

    public char targetPartyIDSource()
    {
        if (!hasTargetPartyIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: TargetPartyIDSource");
        }

        return targetPartyIDSource;
    }

    public boolean hasTargetPartyIDSource()
    {
        return hasTargetPartyIDSource;
    }



    private int targetPartyRole = MISSING_INT;

    private boolean hasTargetPartyRole;

    public int targetPartyRole()
    {
        if (!hasTargetPartyRole)
        {
            throw new IllegalArgumentException("No value for optional field: TargetPartyRole");
        }

        return targetPartyRole;
    }

    public boolean hasTargetPartyRole()
    {
        return hasTargetPartyRole;
    }



    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode TargetPartyIDsGroup
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
                    next = new TargetPartyIDsGroupDecoder(trailer, messageFields);
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
            case Constants.TARGET_PARTY_ID:
                hasTargetPartyID = true;
                targetPartyID = buffer.getChars(targetPartyID, valueOffset, valueLength);
                targetPartyIDOffset = valueOffset;
                targetPartyIDLength = valueLength;
                break;

            case Constants.TARGET_PARTY_ID_SOURCE:
                hasTargetPartyIDSource = true;
                targetPartyIDSource = buffer.getChar(valueOffset);
                break;

            case Constants.TARGET_PARTY_ROLE:
                hasTargetPartyRole = true;
                targetPartyRole = getInt(buffer, valueOffset, endOfField, 1464, CODEC_VALIDATION_ENABLED);
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
        this.resetTargetPartyID();
        this.resetTargetPartyIDSource();
        this.resetTargetPartyRole();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetTargetPartyID()
    {
        hasTargetPartyID = false;
    }

    public void resetTargetPartyIDSource()
    {
        hasTargetPartyIDSource = false;
    }

    public void resetTargetPartyRole()
    {
        hasTargetPartyRole = false;
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
        builder.append("\"MessageName\": \"TargetPartyIDsGroup\",\n");
        if (hasTargetPartyID())
        {
            indent(builder, level);
            builder.append("\"TargetPartyID\": \"");
            builder.append(this.targetPartyID(), 0, targetPartyIDLength());
            builder.append("\",\n");
        }

        if (hasTargetPartyIDSource())
        {
            indent(builder, level);
            builder.append("\"TargetPartyIDSource\": \"");
            builder.append(targetPartyIDSource);
            builder.append("\",\n");
        }

        if (hasTargetPartyRole())
        {
            indent(builder, level);
            builder.append("\"TargetPartyRole\": \"");
            builder.append(targetPartyRole);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public TargetPartyIDsGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((TargetPartyIDsGroupEncoder)encoder);
    }

    public TargetPartyIDsGroupEncoder toEncoder(final TargetPartyIDsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasTargetPartyID())
        {
            encoder.targetPartyID(this.targetPartyID(), 0, targetPartyIDLength());
        }

        if (hasTargetPartyIDSource())
        {
            encoder.targetPartyIDSource(this.targetPartyIDSource());
        }

        if (hasTargetPartyRole())
        {
            encoder.targetPartyRole(this.targetPartyRole());
        }
        return encoder;
    }

}
    public class TargetPartyIDsGroupIterator implements Iterable<TargetPartyIDsGroupDecoder>, java.util.Iterator<TargetPartyIDsGroupDecoder>
    {
        private final TargetPartiesDecoder parent;
        private int remainder;
        private TargetPartyIDsGroupDecoder current;

        public TargetPartyIDsGroupIterator(final TargetPartiesDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }
        public TargetPartyIDsGroupDecoder next()
        {
            remainder--;
            final TargetPartyIDsGroupDecoder value = current;
            current = current.next();
            return value;
        }
        public int numberFieldValue()
        {
            return parent.hasNoTargetPartyIDsGroupCounter() ? parent.noTargetPartyIDsGroupCounter() : 0;
        }
        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.targetPartyIDsGroup();
        }
        public TargetPartyIDsGroupIterator iterator()
        {
            reset();
            return this;
        }
    }

public TargetPartyIDsGroupIterator targetPartyIDsGroupIterator();
    public int noTargetPartyIDsGroupCounter();
    public boolean hasNoTargetPartyIDsGroupCounter();
    public TargetPartyIDsGroupDecoder targetPartyIDsGroup();

}
