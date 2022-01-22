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
import com.swiftalgo.ms.codecs.fix50sp2.builder.ApplIDReportGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.ApplIDReportGrpEncoder.ApplIDsGroupEncoder;

public interface ApplIDReportGrpDecoder 
{



public class ApplIDsGroupDecoder extends CommonDecoderImpl
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
            ALL_GROUP_FIELDS.add(Constants.REF_APPL_ID);
            ALL_GROUP_FIELDS.add(Constants.APPL_NEW_SEQ_NUM);
            ALL_GROUP_FIELDS.add(Constants.REF_APPL_LAST_SEQ_NUM);
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
    public ApplIDsGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private ApplIDsGroupDecoder next = null;

    public ApplIDsGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(6);

    private char[] refApplID = new char[1];

    private boolean hasRefApplID;

    public char[] refApplID()
    {
        if (!hasRefApplID)
        {
            throw new IllegalArgumentException("No value for optional field: RefApplID");
        }

        return refApplID;
    }

    public boolean hasRefApplID()
    {
        return hasRefApplID;
    }


    private int refApplIDOffset;

    private int refApplIDLength;

    public int refApplIDLength()
    {
        if (!hasRefApplID)
        {
            throw new IllegalArgumentException("No value for optional field: RefApplID");
        }

        return refApplIDLength;
    }

    public String refApplIDAsString()
    {
        return hasRefApplID ? new String(refApplID, 0, refApplIDLength) : null;
    }

    public void refApplID(final AsciiSequenceView view)
    {
        if (!hasRefApplID)
        {
            throw new IllegalArgumentException("No value for optional field: RefApplID");
        }

        view.wrap(buffer, refApplIDOffset, refApplIDLength);
    }


    private final CharArrayWrapper refApplIDWrapper = new CharArrayWrapper();
    private int applNewSeqNum = MISSING_INT;

    private boolean hasApplNewSeqNum;

    public int applNewSeqNum()
    {
        if (!hasApplNewSeqNum)
        {
            throw new IllegalArgumentException("No value for optional field: ApplNewSeqNum");
        }

        return applNewSeqNum;
    }

    public boolean hasApplNewSeqNum()
    {
        return hasApplNewSeqNum;
    }



    private int refApplLastSeqNum = MISSING_INT;

    private boolean hasRefApplLastSeqNum;

    public int refApplLastSeqNum()
    {
        if (!hasRefApplLastSeqNum)
        {
            throw new IllegalArgumentException("No value for optional field: RefApplLastSeqNum");
        }

        return refApplLastSeqNum;
    }

    public boolean hasRefApplLastSeqNum()
    {
        return hasRefApplLastSeqNum;
    }



    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode ApplIDsGroup
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
                    next = new ApplIDsGroupDecoder(trailer, messageFields);
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
            case Constants.REF_APPL_ID:
                hasRefApplID = true;
                refApplID = buffer.getChars(refApplID, valueOffset, valueLength);
                refApplIDOffset = valueOffset;
                refApplIDLength = valueLength;
                break;

            case Constants.APPL_NEW_SEQ_NUM:
                hasApplNewSeqNum = true;
                applNewSeqNum = getInt(buffer, valueOffset, endOfField, 1399, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.REF_APPL_LAST_SEQ_NUM:
                hasRefApplLastSeqNum = true;
                refApplLastSeqNum = getInt(buffer, valueOffset, endOfField, 1357, CODEC_VALIDATION_ENABLED);
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
        this.resetRefApplID();
        this.resetApplNewSeqNum();
        this.resetRefApplLastSeqNum();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetRefApplID()
    {
        hasRefApplID = false;
    }

    public void resetApplNewSeqNum()
    {
        hasApplNewSeqNum = false;
    }

    public void resetRefApplLastSeqNum()
    {
        hasRefApplLastSeqNum = false;
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
        builder.append("\"MessageName\": \"ApplIDsGroup\",\n");
        if (hasRefApplID())
        {
            indent(builder, level);
            builder.append("\"RefApplID\": \"");
            builder.append(this.refApplID(), 0, refApplIDLength());
            builder.append("\",\n");
        }

        if (hasApplNewSeqNum())
        {
            indent(builder, level);
            builder.append("\"ApplNewSeqNum\": \"");
            builder.append(applNewSeqNum);
            builder.append("\",\n");
        }

        if (hasRefApplLastSeqNum())
        {
            indent(builder, level);
            builder.append("\"RefApplLastSeqNum\": \"");
            builder.append(refApplLastSeqNum);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public ApplIDReportGrpEncoder.ApplIDsGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((ApplIDReportGrpEncoder.ApplIDsGroupEncoder)encoder);
    }

    public ApplIDReportGrpEncoder.ApplIDsGroupEncoder toEncoder(final ApplIDReportGrpEncoder.ApplIDsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasRefApplID())
        {
            encoder.refApplID(this.refApplID(), 0, refApplIDLength());
        }

        if (hasApplNewSeqNum())
        {
            encoder.applNewSeqNum(this.applNewSeqNum());
        }

        if (hasRefApplLastSeqNum())
        {
            encoder.refApplLastSeqNum(this.refApplLastSeqNum());
        }
        return encoder;
    }

}
    public class ApplIDsGroupIterator implements Iterable<ApplIDsGroupDecoder>, java.util.Iterator<ApplIDsGroupDecoder>
    {
        private final ApplIDReportGrpDecoder parent;
        private int remainder;
        private ApplIDsGroupDecoder current;

        public ApplIDsGroupIterator(final ApplIDReportGrpDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }

        public ApplIDsGroupDecoder next()
        {
            remainder--;
            final ApplIDsGroupDecoder value = current;
            current = current.next();
            return value;
        }

        public int numberFieldValue()
        {
            return parent.hasNoApplIDsGroupCounter() ? parent.noApplIDsGroupCounter() : 0;
        }

        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.applIDsGroup();
        }

        public ApplIDsGroupIterator iterator()
        {
            reset();
            return this;
        }

    }

    public ApplIDsGroupIterator applIDsGroupIterator();
    public int noApplIDsGroupCounter();
    public boolean hasNoApplIDsGroupCounter();
    public ApplIDsGroupDecoder applIDsGroup();

}
