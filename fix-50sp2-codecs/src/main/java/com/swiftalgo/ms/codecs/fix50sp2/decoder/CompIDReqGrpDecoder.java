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
import com.swiftalgo.ms.codecs.fix50sp2.builder.CompIDReqGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.CompIDReqGrpEncoder.CompIDsGroupEncoder;

public interface CompIDReqGrpDecoder 
{



public class CompIDsGroupDecoder extends CommonDecoderImpl
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(0);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
        }
    }

    public final IntHashSet ALL_GROUP_FIELDS = new IntHashSet(8);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            ALL_GROUP_FIELDS.add(Constants.REF_COMP_ID);
            ALL_GROUP_FIELDS.add(Constants.REF_SUB_ID);
            ALL_GROUP_FIELDS.add(Constants.LOCATION_ID);
            ALL_GROUP_FIELDS.add(Constants.DESK_ID);
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
    public CompIDsGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private CompIDsGroupDecoder next = null;

    public CompIDsGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(8);

    private char[] refCompID = new char[1];

    private boolean hasRefCompID;

    public char[] refCompID()
    {
        if (!hasRefCompID)
        {
            throw new IllegalArgumentException("No value for optional field: RefCompID");
        }

        return refCompID;
    }

    public boolean hasRefCompID()
    {
        return hasRefCompID;
    }


    private int refCompIDOffset;

    private int refCompIDLength;

    public int refCompIDLength()
    {
        if (!hasRefCompID)
        {
            throw new IllegalArgumentException("No value for optional field: RefCompID");
        }

        return refCompIDLength;
    }

    public String refCompIDAsString()
    {
        return hasRefCompID ? new String(refCompID, 0, refCompIDLength) : null;
    }

    public void refCompID(final AsciiSequenceView view)
    {
        if (!hasRefCompID)
        {
            throw new IllegalArgumentException("No value for optional field: RefCompID");
        }

        view.wrap(buffer, refCompIDOffset, refCompIDLength);
    }


    private char[] refSubID = new char[1];

    private boolean hasRefSubID;

    public char[] refSubID()
    {
        if (!hasRefSubID)
        {
            throw new IllegalArgumentException("No value for optional field: RefSubID");
        }

        return refSubID;
    }

    public boolean hasRefSubID()
    {
        return hasRefSubID;
    }


    private int refSubIDOffset;

    private int refSubIDLength;

    public int refSubIDLength()
    {
        if (!hasRefSubID)
        {
            throw new IllegalArgumentException("No value for optional field: RefSubID");
        }

        return refSubIDLength;
    }

    public String refSubIDAsString()
    {
        return hasRefSubID ? new String(refSubID, 0, refSubIDLength) : null;
    }

    public void refSubID(final AsciiSequenceView view)
    {
        if (!hasRefSubID)
        {
            throw new IllegalArgumentException("No value for optional field: RefSubID");
        }

        view.wrap(buffer, refSubIDOffset, refSubIDLength);
    }


    private char[] locationID = new char[1];

    private boolean hasLocationID;

    public char[] locationID()
    {
        if (!hasLocationID)
        {
            throw new IllegalArgumentException("No value for optional field: LocationID");
        }

        return locationID;
    }

    public boolean hasLocationID()
    {
        return hasLocationID;
    }


    private int locationIDOffset;

    private int locationIDLength;

    public int locationIDLength()
    {
        if (!hasLocationID)
        {
            throw new IllegalArgumentException("No value for optional field: LocationID");
        }

        return locationIDLength;
    }

    public String locationIDAsString()
    {
        return hasLocationID ? new String(locationID, 0, locationIDLength) : null;
    }

    public void locationID(final AsciiSequenceView view)
    {
        if (!hasLocationID)
        {
            throw new IllegalArgumentException("No value for optional field: LocationID");
        }

        view.wrap(buffer, locationIDOffset, locationIDLength);
    }


    private char[] deskID = new char[1];

    private boolean hasDeskID;

    public char[] deskID()
    {
        if (!hasDeskID)
        {
            throw new IllegalArgumentException("No value for optional field: DeskID");
        }

        return deskID;
    }

    public boolean hasDeskID()
    {
        return hasDeskID;
    }


    private int deskIDOffset;

    private int deskIDLength;

    public int deskIDLength()
    {
        if (!hasDeskID)
        {
            throw new IllegalArgumentException("No value for optional field: DeskID");
        }

        return deskIDLength;
    }

    public String deskIDAsString()
    {
        return hasDeskID ? new String(deskID, 0, deskIDLength) : null;
    }

    public void deskID(final AsciiSequenceView view)
    {
        if (!hasDeskID)
        {
            throw new IllegalArgumentException("No value for optional field: DeskID");
        }

        view.wrap(buffer, deskIDOffset, deskIDLength);
    }


    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode CompIDsGroup
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
                    next = new CompIDsGroupDecoder(trailer, messageFields);
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
            case Constants.REF_COMP_ID:
                hasRefCompID = true;
                refCompID = buffer.getChars(refCompID, valueOffset, valueLength);
                refCompIDOffset = valueOffset;
                refCompIDLength = valueLength;
                break;

            case Constants.REF_SUB_ID:
                hasRefSubID = true;
                refSubID = buffer.getChars(refSubID, valueOffset, valueLength);
                refSubIDOffset = valueOffset;
                refSubIDLength = valueLength;
                break;

            case Constants.LOCATION_ID:
                hasLocationID = true;
                locationID = buffer.getChars(locationID, valueOffset, valueLength);
                locationIDOffset = valueOffset;
                locationIDLength = valueLength;
                break;

            case Constants.DESK_ID:
                hasDeskID = true;
                deskID = buffer.getChars(deskID, valueOffset, valueLength);
                deskIDOffset = valueOffset;
                deskIDLength = valueLength;
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
        this.resetRefCompID();
        this.resetRefSubID();
        this.resetLocationID();
        this.resetDeskID();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetRefCompID()
    {
        hasRefCompID = false;
    }

    public void resetRefSubID()
    {
        hasRefSubID = false;
    }

    public void resetLocationID()
    {
        hasLocationID = false;
    }

    public void resetDeskID()
    {
        hasDeskID = false;
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
        builder.append("\"MessageName\": \"CompIDsGroup\",\n");
        if (hasRefCompID())
        {
            indent(builder, level);
            builder.append("\"RefCompID\": \"");
            builder.append(this.refCompID(), 0, refCompIDLength());
            builder.append("\",\n");
        }

        if (hasRefSubID())
        {
            indent(builder, level);
            builder.append("\"RefSubID\": \"");
            builder.append(this.refSubID(), 0, refSubIDLength());
            builder.append("\",\n");
        }

        if (hasLocationID())
        {
            indent(builder, level);
            builder.append("\"LocationID\": \"");
            builder.append(this.locationID(), 0, locationIDLength());
            builder.append("\",\n");
        }

        if (hasDeskID())
        {
            indent(builder, level);
            builder.append("\"DeskID\": \"");
            builder.append(this.deskID(), 0, deskIDLength());
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public CompIDsGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((CompIDsGroupEncoder)encoder);
    }

    public CompIDsGroupEncoder toEncoder(final CompIDsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasRefCompID())
        {
            encoder.refCompID(this.refCompID(), 0, refCompIDLength());
        }

        if (hasRefSubID())
        {
            encoder.refSubID(this.refSubID(), 0, refSubIDLength());
        }

        if (hasLocationID())
        {
            encoder.locationID(this.locationID(), 0, locationIDLength());
        }

        if (hasDeskID())
        {
            encoder.deskID(this.deskID(), 0, deskIDLength());
        }
        return encoder;
    }

}
    public class CompIDsGroupIterator implements Iterable<CompIDsGroupDecoder>, java.util.Iterator<CompIDsGroupDecoder>
    {
        private final CompIDReqGrpDecoder parent;
        private int remainder;
        private CompIDsGroupDecoder current;

        public CompIDsGroupIterator(final CompIDReqGrpDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }
        public CompIDsGroupDecoder next()
        {
            remainder--;
            final CompIDsGroupDecoder value = current;
            current = current.next();
            return value;
        }
        public int numberFieldValue()
        {
            return parent.hasNoCompIDsGroupCounter() ? parent.noCompIDsGroupCounter() : 0;
        }
        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.compIDsGroup();
        }
        public CompIDsGroupIterator iterator()
        {
            reset();
            return this;
        }
    }

public CompIDsGroupIterator compIDsGroupIterator();
    public int noCompIDsGroupCounter();
    public boolean hasNoCompIDsGroupCounter();
    public CompIDsGroupDecoder compIDsGroup();

}
