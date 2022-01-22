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
import com.swiftalgo.ms.codecs.fix50sp2.builder.NotAffectedOrdersGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.NotAffectedOrdersGrpEncoder.NotAffectedOrdersGroupEncoder;

public interface NotAffectedOrdersGrpDecoder 
{



public class NotAffectedOrdersGroupDecoder extends CommonDecoderImpl
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
            ALL_GROUP_FIELDS.add(Constants.NOT_AFF_ORIG_CL_ORD_ID);
            ALL_GROUP_FIELDS.add(Constants.NOT_AFFECTED_ORDER_ID);
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
    public NotAffectedOrdersGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private NotAffectedOrdersGroupDecoder next = null;

    public NotAffectedOrdersGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(4);

    private char[] notAffOrigClOrdID = new char[1];

    private boolean hasNotAffOrigClOrdID;

    public char[] notAffOrigClOrdID()
    {
        if (!hasNotAffOrigClOrdID)
        {
            throw new IllegalArgumentException("No value for optional field: NotAffOrigClOrdID");
        }

        return notAffOrigClOrdID;
    }

    public boolean hasNotAffOrigClOrdID()
    {
        return hasNotAffOrigClOrdID;
    }


    private int notAffOrigClOrdIDOffset;

    private int notAffOrigClOrdIDLength;

    public int notAffOrigClOrdIDLength()
    {
        if (!hasNotAffOrigClOrdID)
        {
            throw new IllegalArgumentException("No value for optional field: NotAffOrigClOrdID");
        }

        return notAffOrigClOrdIDLength;
    }

    public String notAffOrigClOrdIDAsString()
    {
        return hasNotAffOrigClOrdID ? new String(notAffOrigClOrdID, 0, notAffOrigClOrdIDLength) : null;
    }

    public void notAffOrigClOrdID(final AsciiSequenceView view)
    {
        if (!hasNotAffOrigClOrdID)
        {
            throw new IllegalArgumentException("No value for optional field: NotAffOrigClOrdID");
        }

        view.wrap(buffer, notAffOrigClOrdIDOffset, notAffOrigClOrdIDLength);
    }


    private final CharArrayWrapper notAffOrigClOrdIDWrapper = new CharArrayWrapper();
    private char[] notAffectedOrderID = new char[1];

    private boolean hasNotAffectedOrderID;

    public char[] notAffectedOrderID()
    {
        if (!hasNotAffectedOrderID)
        {
            throw new IllegalArgumentException("No value for optional field: NotAffectedOrderID");
        }

        return notAffectedOrderID;
    }

    public boolean hasNotAffectedOrderID()
    {
        return hasNotAffectedOrderID;
    }


    private int notAffectedOrderIDOffset;

    private int notAffectedOrderIDLength;

    public int notAffectedOrderIDLength()
    {
        if (!hasNotAffectedOrderID)
        {
            throw new IllegalArgumentException("No value for optional field: NotAffectedOrderID");
        }

        return notAffectedOrderIDLength;
    }

    public String notAffectedOrderIDAsString()
    {
        return hasNotAffectedOrderID ? new String(notAffectedOrderID, 0, notAffectedOrderIDLength) : null;
    }

    public void notAffectedOrderID(final AsciiSequenceView view)
    {
        if (!hasNotAffectedOrderID)
        {
            throw new IllegalArgumentException("No value for optional field: NotAffectedOrderID");
        }

        view.wrap(buffer, notAffectedOrderIDOffset, notAffectedOrderIDLength);
    }


    private final CharArrayWrapper notAffectedOrderIDWrapper = new CharArrayWrapper();
    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode NotAffectedOrdersGroup
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
                    next = new NotAffectedOrdersGroupDecoder(trailer, messageFields);
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
            case Constants.NOT_AFF_ORIG_CL_ORD_ID:
                hasNotAffOrigClOrdID = true;
                notAffOrigClOrdID = buffer.getChars(notAffOrigClOrdID, valueOffset, valueLength);
                notAffOrigClOrdIDOffset = valueOffset;
                notAffOrigClOrdIDLength = valueLength;
                break;

            case Constants.NOT_AFFECTED_ORDER_ID:
                hasNotAffectedOrderID = true;
                notAffectedOrderID = buffer.getChars(notAffectedOrderID, valueOffset, valueLength);
                notAffectedOrderIDOffset = valueOffset;
                notAffectedOrderIDLength = valueLength;
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
        this.resetNotAffOrigClOrdID();
        this.resetNotAffectedOrderID();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetNotAffOrigClOrdID()
    {
        hasNotAffOrigClOrdID = false;
    }

    public void resetNotAffectedOrderID()
    {
        hasNotAffectedOrderID = false;
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
        builder.append("\"MessageName\": \"NotAffectedOrdersGroup\",\n");
        if (hasNotAffOrigClOrdID())
        {
            indent(builder, level);
            builder.append("\"NotAffOrigClOrdID\": \"");
            builder.append(this.notAffOrigClOrdID(), 0, notAffOrigClOrdIDLength());
            builder.append("\",\n");
        }

        if (hasNotAffectedOrderID())
        {
            indent(builder, level);
            builder.append("\"NotAffectedOrderID\": \"");
            builder.append(this.notAffectedOrderID(), 0, notAffectedOrderIDLength());
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public NotAffectedOrdersGrpEncoder.NotAffectedOrdersGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((NotAffectedOrdersGrpEncoder.NotAffectedOrdersGroupEncoder)encoder);
    }

    public NotAffectedOrdersGrpEncoder.NotAffectedOrdersGroupEncoder toEncoder(final NotAffectedOrdersGrpEncoder.NotAffectedOrdersGroupEncoder encoder)
    {
        encoder.reset();
        if (hasNotAffOrigClOrdID())
        {
            encoder.notAffOrigClOrdID(this.notAffOrigClOrdID(), 0, notAffOrigClOrdIDLength());
        }

        if (hasNotAffectedOrderID())
        {
            encoder.notAffectedOrderID(this.notAffectedOrderID(), 0, notAffectedOrderIDLength());
        }
        return encoder;
    }

}
    public class NotAffectedOrdersGroupIterator implements Iterable<NotAffectedOrdersGroupDecoder>, java.util.Iterator<NotAffectedOrdersGroupDecoder>
    {
        private final NotAffectedOrdersGrpDecoder parent;
        private int remainder;
        private NotAffectedOrdersGroupDecoder current;

        public NotAffectedOrdersGroupIterator(final NotAffectedOrdersGrpDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }

        public NotAffectedOrdersGroupDecoder next()
        {
            remainder--;
            final NotAffectedOrdersGroupDecoder value = current;
            current = current.next();
            return value;
        }

        public int numberFieldValue()
        {
            return parent.hasNoNotAffectedOrdersGroupCounter() ? parent.noNotAffectedOrdersGroupCounter() : 0;
        }

        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.notAffectedOrdersGroup();
        }

        public NotAffectedOrdersGroupIterator iterator()
        {
            reset();
            return this;
        }

    }

    public NotAffectedOrdersGroupIterator notAffectedOrdersGroupIterator();
    public int noNotAffectedOrdersGroupCounter();
    public boolean hasNoNotAffectedOrdersGroupCounter();
    public NotAffectedOrdersGroupDecoder notAffectedOrdersGroup();

}
