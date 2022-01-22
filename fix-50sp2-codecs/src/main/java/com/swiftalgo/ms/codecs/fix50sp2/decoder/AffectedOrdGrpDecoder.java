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
import com.swiftalgo.ms.codecs.fix50sp2.builder.AffectedOrdGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.AffectedOrdGrpEncoder.AffectedOrdersGroupEncoder;

public interface AffectedOrdGrpDecoder 
{



public class AffectedOrdersGroupDecoder extends CommonDecoderImpl
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
            ALL_GROUP_FIELDS.add(Constants.ORIG_CL_ORD_ID);
            ALL_GROUP_FIELDS.add(Constants.AFFECTED_ORDER_ID);
            ALL_GROUP_FIELDS.add(Constants.AFFECTED_SECONDARY_ORDER_ID);
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
    public AffectedOrdersGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private AffectedOrdersGroupDecoder next = null;

    public AffectedOrdersGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(6);

    private char[] origClOrdID = new char[1];

    private boolean hasOrigClOrdID;

    public char[] origClOrdID()
    {
        if (!hasOrigClOrdID)
        {
            throw new IllegalArgumentException("No value for optional field: OrigClOrdID");
        }

        return origClOrdID;
    }

    public boolean hasOrigClOrdID()
    {
        return hasOrigClOrdID;
    }


    private int origClOrdIDOffset;

    private int origClOrdIDLength;

    public int origClOrdIDLength()
    {
        if (!hasOrigClOrdID)
        {
            throw new IllegalArgumentException("No value for optional field: OrigClOrdID");
        }

        return origClOrdIDLength;
    }

    public String origClOrdIDAsString()
    {
        return hasOrigClOrdID ? new String(origClOrdID, 0, origClOrdIDLength) : null;
    }

    public void origClOrdID(final AsciiSequenceView view)
    {
        if (!hasOrigClOrdID)
        {
            throw new IllegalArgumentException("No value for optional field: OrigClOrdID");
        }

        view.wrap(buffer, origClOrdIDOffset, origClOrdIDLength);
    }


    private final CharArrayWrapper origClOrdIDWrapper = new CharArrayWrapper();
    private char[] affectedOrderID = new char[1];

    private boolean hasAffectedOrderID;

    public char[] affectedOrderID()
    {
        if (!hasAffectedOrderID)
        {
            throw new IllegalArgumentException("No value for optional field: AffectedOrderID");
        }

        return affectedOrderID;
    }

    public boolean hasAffectedOrderID()
    {
        return hasAffectedOrderID;
    }


    private int affectedOrderIDOffset;

    private int affectedOrderIDLength;

    public int affectedOrderIDLength()
    {
        if (!hasAffectedOrderID)
        {
            throw new IllegalArgumentException("No value for optional field: AffectedOrderID");
        }

        return affectedOrderIDLength;
    }

    public String affectedOrderIDAsString()
    {
        return hasAffectedOrderID ? new String(affectedOrderID, 0, affectedOrderIDLength) : null;
    }

    public void affectedOrderID(final AsciiSequenceView view)
    {
        if (!hasAffectedOrderID)
        {
            throw new IllegalArgumentException("No value for optional field: AffectedOrderID");
        }

        view.wrap(buffer, affectedOrderIDOffset, affectedOrderIDLength);
    }


    private final CharArrayWrapper affectedOrderIDWrapper = new CharArrayWrapper();
    private char[] affectedSecondaryOrderID = new char[1];

    private boolean hasAffectedSecondaryOrderID;

    public char[] affectedSecondaryOrderID()
    {
        if (!hasAffectedSecondaryOrderID)
        {
            throw new IllegalArgumentException("No value for optional field: AffectedSecondaryOrderID");
        }

        return affectedSecondaryOrderID;
    }

    public boolean hasAffectedSecondaryOrderID()
    {
        return hasAffectedSecondaryOrderID;
    }


    private int affectedSecondaryOrderIDOffset;

    private int affectedSecondaryOrderIDLength;

    public int affectedSecondaryOrderIDLength()
    {
        if (!hasAffectedSecondaryOrderID)
        {
            throw new IllegalArgumentException("No value for optional field: AffectedSecondaryOrderID");
        }

        return affectedSecondaryOrderIDLength;
    }

    public String affectedSecondaryOrderIDAsString()
    {
        return hasAffectedSecondaryOrderID ? new String(affectedSecondaryOrderID, 0, affectedSecondaryOrderIDLength) : null;
    }

    public void affectedSecondaryOrderID(final AsciiSequenceView view)
    {
        if (!hasAffectedSecondaryOrderID)
        {
            throw new IllegalArgumentException("No value for optional field: AffectedSecondaryOrderID");
        }

        view.wrap(buffer, affectedSecondaryOrderIDOffset, affectedSecondaryOrderIDLength);
    }


    private final CharArrayWrapper affectedSecondaryOrderIDWrapper = new CharArrayWrapper();
    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode AffectedOrdersGroup
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
                    next = new AffectedOrdersGroupDecoder(trailer, messageFields);
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
            case Constants.ORIG_CL_ORD_ID:
                hasOrigClOrdID = true;
                origClOrdID = buffer.getChars(origClOrdID, valueOffset, valueLength);
                origClOrdIDOffset = valueOffset;
                origClOrdIDLength = valueLength;
                break;

            case Constants.AFFECTED_ORDER_ID:
                hasAffectedOrderID = true;
                affectedOrderID = buffer.getChars(affectedOrderID, valueOffset, valueLength);
                affectedOrderIDOffset = valueOffset;
                affectedOrderIDLength = valueLength;
                break;

            case Constants.AFFECTED_SECONDARY_ORDER_ID:
                hasAffectedSecondaryOrderID = true;
                affectedSecondaryOrderID = buffer.getChars(affectedSecondaryOrderID, valueOffset, valueLength);
                affectedSecondaryOrderIDOffset = valueOffset;
                affectedSecondaryOrderIDLength = valueLength;
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
        this.resetOrigClOrdID();
        this.resetAffectedOrderID();
        this.resetAffectedSecondaryOrderID();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetOrigClOrdID()
    {
        hasOrigClOrdID = false;
    }

    public void resetAffectedOrderID()
    {
        hasAffectedOrderID = false;
    }

    public void resetAffectedSecondaryOrderID()
    {
        hasAffectedSecondaryOrderID = false;
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
        builder.append("\"MessageName\": \"AffectedOrdersGroup\",\n");
        if (hasOrigClOrdID())
        {
            indent(builder, level);
            builder.append("\"OrigClOrdID\": \"");
            builder.append(this.origClOrdID(), 0, origClOrdIDLength());
            builder.append("\",\n");
        }

        if (hasAffectedOrderID())
        {
            indent(builder, level);
            builder.append("\"AffectedOrderID\": \"");
            builder.append(this.affectedOrderID(), 0, affectedOrderIDLength());
            builder.append("\",\n");
        }

        if (hasAffectedSecondaryOrderID())
        {
            indent(builder, level);
            builder.append("\"AffectedSecondaryOrderID\": \"");
            builder.append(this.affectedSecondaryOrderID(), 0, affectedSecondaryOrderIDLength());
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public AffectedOrdGrpEncoder.AffectedOrdersGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((AffectedOrdGrpEncoder.AffectedOrdersGroupEncoder)encoder);
    }

    public AffectedOrdGrpEncoder.AffectedOrdersGroupEncoder toEncoder(final AffectedOrdGrpEncoder.AffectedOrdersGroupEncoder encoder)
    {
        encoder.reset();
        if (hasOrigClOrdID())
        {
            encoder.origClOrdID(this.origClOrdID(), 0, origClOrdIDLength());
        }

        if (hasAffectedOrderID())
        {
            encoder.affectedOrderID(this.affectedOrderID(), 0, affectedOrderIDLength());
        }

        if (hasAffectedSecondaryOrderID())
        {
            encoder.affectedSecondaryOrderID(this.affectedSecondaryOrderID(), 0, affectedSecondaryOrderIDLength());
        }
        return encoder;
    }

}
    public class AffectedOrdersGroupIterator implements Iterable<AffectedOrdersGroupDecoder>, java.util.Iterator<AffectedOrdersGroupDecoder>
    {
        private final AffectedOrdGrpDecoder parent;
        private int remainder;
        private AffectedOrdersGroupDecoder current;

        public AffectedOrdersGroupIterator(final AffectedOrdGrpDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }

        public AffectedOrdersGroupDecoder next()
        {
            remainder--;
            final AffectedOrdersGroupDecoder value = current;
            current = current.next();
            return value;
        }

        public int numberFieldValue()
        {
            return parent.hasNoAffectedOrdersGroupCounter() ? parent.noAffectedOrdersGroupCounter() : 0;
        }

        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.affectedOrdersGroup();
        }

        public AffectedOrdersGroupIterator iterator()
        {
            reset();
            return this;
        }

    }

    public AffectedOrdersGroupIterator affectedOrdersGroupIterator();
    public int noAffectedOrdersGroupCounter();
    public boolean hasNoAffectedOrdersGroupCounter();
    public AffectedOrdersGroupDecoder affectedOrdersGroup();

}
