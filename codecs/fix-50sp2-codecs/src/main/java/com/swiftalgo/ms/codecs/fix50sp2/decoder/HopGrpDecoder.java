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
import com.swiftalgo.ms.codecs.fix50sp2.builder.HopGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.HopGrpEncoder.HopsGroupEncoder;

public interface HopGrpDecoder 
{



public class HopsGroupDecoder extends CommonDecoderImpl
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
            ALL_GROUP_FIELDS.add(Constants.HOP_COMP_ID);
            ALL_GROUP_FIELDS.add(Constants.HOP_SENDING_TIME);
            ALL_GROUP_FIELDS.add(Constants.HOP_REF_ID);
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
    public HopsGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private HopsGroupDecoder next = null;

    public HopsGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(6);

    private char[] hopCompID = new char[1];

    private boolean hasHopCompID;

    public char[] hopCompID()
    {
        if (!hasHopCompID)
        {
            throw new IllegalArgumentException("No value for optional field: HopCompID");
        }

        return hopCompID;
    }

    public boolean hasHopCompID()
    {
        return hasHopCompID;
    }


    private int hopCompIDOffset;

    private int hopCompIDLength;

    public int hopCompIDLength()
    {
        if (!hasHopCompID)
        {
            throw new IllegalArgumentException("No value for optional field: HopCompID");
        }

        return hopCompIDLength;
    }

    public String hopCompIDAsString()
    {
        return hasHopCompID ? new String(hopCompID, 0, hopCompIDLength) : null;
    }

    public void hopCompID(final AsciiSequenceView view)
    {
        if (!hasHopCompID)
        {
            throw new IllegalArgumentException("No value for optional field: HopCompID");
        }

        view.wrap(buffer, hopCompIDOffset, hopCompIDLength);
    }


    private final CharArrayWrapper hopCompIDWrapper = new CharArrayWrapper();
    private byte[] hopSendingTime = new byte[24];

    private boolean hasHopSendingTime;

    public byte[] hopSendingTime()
    {
        if (!hasHopSendingTime)
        {
            throw new IllegalArgumentException("No value for optional field: HopSendingTime");
        }

        return hopSendingTime;
    }

    public boolean hasHopSendingTime()
    {
        return hasHopSendingTime;
    }


    private int hopSendingTimeOffset;

    private int hopSendingTimeLength;

    public int hopSendingTimeLength()
    {
        if (!hasHopSendingTime)
        {
            throw new IllegalArgumentException("No value for optional field: HopSendingTime");
        }

        return hopSendingTimeLength;
    }

    public String hopSendingTimeAsString()
    {
        return hasHopSendingTime ? new String(hopSendingTime, 0, hopSendingTimeLength) : null;
    }

    public void hopSendingTime(final AsciiSequenceView view)
    {
        if (!hasHopSendingTime)
        {
            throw new IllegalArgumentException("No value for optional field: HopSendingTime");
        }

        view.wrap(buffer, hopSendingTimeOffset, hopSendingTimeLength);
    }


    private int hopRefID = MISSING_INT;

    private boolean hasHopRefID;

    public int hopRefID()
    {
        if (!hasHopRefID)
        {
            throw new IllegalArgumentException("No value for optional field: HopRefID");
        }

        return hopRefID;
    }

    public boolean hasHopRefID()
    {
        return hasHopRefID;
    }



    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode HopsGroup
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
                    next = new HopsGroupDecoder(trailer, messageFields);
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
            case Constants.HOP_COMP_ID:
                hasHopCompID = true;
                hopCompID = buffer.getChars(hopCompID, valueOffset, valueLength);
                hopCompIDOffset = valueOffset;
                hopCompIDLength = valueLength;
                break;

            case Constants.HOP_SENDING_TIME:
                hasHopSendingTime = true;
                hopSendingTime = buffer.getBytes(hopSendingTime, valueOffset, valueLength);
                hopSendingTimeOffset = valueOffset;
                hopSendingTimeLength = valueLength;
                break;

            case Constants.HOP_REF_ID:
                hasHopRefID = true;
                hopRefID = getInt(buffer, valueOffset, endOfField, 630, CODEC_VALIDATION_ENABLED);
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
        this.resetHopCompID();
        this.resetHopSendingTime();
        this.resetHopRefID();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetHopCompID()
    {
        hasHopCompID = false;
    }

    public void resetHopSendingTime()
    {
        hasHopSendingTime = false;
    }

    public void resetHopRefID()
    {
        hasHopRefID = false;
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
        builder.append("\"MessageName\": \"HopsGroup\",\n");
        if (hasHopCompID())
        {
            indent(builder, level);
            builder.append("\"HopCompID\": \"");
            builder.append(this.hopCompID(), 0, hopCompIDLength());
            builder.append("\",\n");
        }

        if (hasHopSendingTime())
        {
            indent(builder, level);
            builder.append("\"HopSendingTime\": \"");
            appendData(builder, hopSendingTime, hopSendingTimeLength);
            builder.append("\",\n");
        }

        if (hasHopRefID())
        {
            indent(builder, level);
            builder.append("\"HopRefID\": \"");
            builder.append(hopRefID);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public HopGrpEncoder.HopsGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((HopGrpEncoder.HopsGroupEncoder)encoder);
    }

    public HopGrpEncoder.HopsGroupEncoder toEncoder(final HopGrpEncoder.HopsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasHopCompID())
        {
            encoder.hopCompID(this.hopCompID(), 0, hopCompIDLength());
        }

        if (hasHopSendingTime())
        {
            encoder.hopSendingTimeAsCopy(this.hopSendingTime(), 0, hopSendingTimeLength());
        }

        if (hasHopRefID())
        {
            encoder.hopRefID(this.hopRefID());
        }
        return encoder;
    }

}
    public class HopsGroupIterator implements Iterable<HopsGroupDecoder>, java.util.Iterator<HopsGroupDecoder>
    {
        private final HopGrpDecoder parent;
        private int remainder;
        private HopsGroupDecoder current;

        public HopsGroupIterator(final HopGrpDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }

        public HopsGroupDecoder next()
        {
            remainder--;
            final HopsGroupDecoder value = current;
            current = current.next();
            return value;
        }

        public int numberFieldValue()
        {
            return parent.hasNoHopsGroupCounter() ? parent.noHopsGroupCounter() : 0;
        }

        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.hopsGroup();
        }

        public HopsGroupIterator iterator()
        {
            reset();
            return this;
        }

    }

    public HopsGroupIterator hopsGroupIterator();
    public int noHopsGroupCounter();
    public boolean hasNoHopsGroupCounter();
    public HopsGroupDecoder hopsGroup();

}
