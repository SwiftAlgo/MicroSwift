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
import com.swiftalgo.ms.codecs.fix50sp2.builder.CpctyConfGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.CpctyConfGrpEncoder.CapacitiesGroupEncoder;

public interface CpctyConfGrpDecoder 
{



public class CapacitiesGroupDecoder extends CommonDecoderImpl
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(4);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            REQUIRED_FIELDS.add(Constants.ORDER_CAPACITY);
            REQUIRED_FIELDS.add(Constants.ORDER_CAPACITY_QTY);
        }
    }

    public final IntHashSet ALL_GROUP_FIELDS = new IntHashSet(6);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            ALL_GROUP_FIELDS.add(Constants.ORDER_CAPACITY);
            ALL_GROUP_FIELDS.add(Constants.ORDER_RESTRICTIONS);
            ALL_GROUP_FIELDS.add(Constants.ORDER_CAPACITY_QTY);
        }
    }

    private final IntHashSet missingRequiredFields = new IntHashSet(4);

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
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !OrderCapacity.isValid(orderCapacity()))
        {
            invalidTagId = 528;
            rejectReason = 5;
            return false;
        }

        if (hasOrderRestrictions)
        {
          int orderRestrictionsOffset = 0;
          for (int i = 0; i < orderRestrictionsLength; i++)
          {
              if (this.orderRestrictions()[i] == ' ')
              {
                  orderRestrictionsWrapper.wrap(this.orderRestrictions(), orderRestrictionsOffset, i - orderRestrictionsOffset);
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !OrderRestrictions.isValid(orderRestrictionsWrapper))
        {
            invalidTagId = 529;
            rejectReason = 5;
            return false;
        }
                  orderRestrictionsOffset = i + 1;
              }
          }
          orderRestrictionsWrapper.wrap(this.orderRestrictions(), orderRestrictionsOffset, orderRestrictionsLength - orderRestrictionsOffset);
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !OrderRestrictions.isValid(orderRestrictionsWrapper))
        {
            invalidTagId = 529;
            rejectReason = 5;
            return false;
        }
        }
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public CapacitiesGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private CapacitiesGroupDecoder next = null;

    public CapacitiesGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(6);

    private char orderCapacity = MISSING_CHAR;

    public char orderCapacity()
    {
        return orderCapacity;
    }



    private final CharArrayWrapper orderCapacityWrapper = new CharArrayWrapper();
    public OrderCapacity orderCapacityAsEnum()
    {
        return OrderCapacity.decode(orderCapacity);
    }

    private char[] orderRestrictions = new char[1];

    private boolean hasOrderRestrictions;

    public char[] orderRestrictions()
    {
        if (!hasOrderRestrictions)
        {
            throw new IllegalArgumentException("No value for optional field: OrderRestrictions");
        }

        return orderRestrictions;
    }

    public boolean hasOrderRestrictions()
    {
        return hasOrderRestrictions;
    }


    private int orderRestrictionsOffset;

    private int orderRestrictionsLength;

    public int orderRestrictionsLength()
    {
        if (!hasOrderRestrictions)
        {
            throw new IllegalArgumentException("No value for optional field: OrderRestrictions");
        }

        return orderRestrictionsLength;
    }

    public String orderRestrictionsAsString()
    {
        return hasOrderRestrictions ? new String(orderRestrictions, 0, orderRestrictionsLength) : null;
    }

    public void orderRestrictions(final AsciiSequenceView view)
    {
        if (!hasOrderRestrictions)
        {
            throw new IllegalArgumentException("No value for optional field: OrderRestrictions");
        }

        view.wrap(buffer, orderRestrictionsOffset, orderRestrictionsLength);
    }


    private final CharArrayWrapper orderRestrictionsWrapper = new CharArrayWrapper();
    private DecimalFloat orderCapacityQty = DecimalFloat.newNaNValue();

    public DecimalFloat orderCapacityQty()
    {
        return orderCapacityQty;
    }



    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode CapacitiesGroup
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
                    next = new CapacitiesGroupDecoder(trailer, messageFields);
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
            case Constants.ORDER_CAPACITY:
                orderCapacity = buffer.getChar(valueOffset);
                break;

            case Constants.ORDER_RESTRICTIONS:
                hasOrderRestrictions = true;
                orderRestrictions = buffer.getChars(orderRestrictions, valueOffset, valueLength);
                orderRestrictionsOffset = valueOffset;
                orderRestrictionsLength = valueLength;
                break;

            case Constants.ORDER_CAPACITY_QTY:
                orderCapacityQty = getFloat(buffer, orderCapacityQty, valueOffset, valueLength, 863, CODEC_VALIDATION_ENABLED);
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
        this.resetOrderCapacity();
        this.resetOrderRestrictions();
        this.resetOrderCapacityQty();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetOrderCapacity()
    {
        orderCapacity = MISSING_CHAR;
    }

    public void resetOrderRestrictions()
    {
        hasOrderRestrictions = false;
    }

    public void resetOrderCapacityQty()
    {
        orderCapacityQty.reset();
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
        builder.append("\"MessageName\": \"CapacitiesGroup\",\n");
        indent(builder, level);
        builder.append("\"OrderCapacity\": \"");
        builder.append(orderCapacity);
        builder.append("\",\n");

        if (hasOrderRestrictions())
        {
            indent(builder, level);
            builder.append("\"OrderRestrictions\": \"");
            builder.append(this.orderRestrictions(), 0, orderRestrictionsLength());
            builder.append("\",\n");
        }

        indent(builder, level);
        builder.append("\"OrderCapacityQty\": \"");
        orderCapacityQty.appendTo(builder);
        builder.append("\",\n");
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public CpctyConfGrpEncoder.CapacitiesGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((CpctyConfGrpEncoder.CapacitiesGroupEncoder)encoder);
    }

    public CpctyConfGrpEncoder.CapacitiesGroupEncoder toEncoder(final CpctyConfGrpEncoder.CapacitiesGroupEncoder encoder)
    {
        encoder.reset();
        encoder.orderCapacity(this.orderCapacity());
        if (hasOrderRestrictions())
        {
            encoder.orderRestrictions(this.orderRestrictions(), 0, orderRestrictionsLength());
        }

        encoder.orderCapacityQty(this.orderCapacityQty());        return encoder;
    }

}
    public class CapacitiesGroupIterator implements Iterable<CapacitiesGroupDecoder>, java.util.Iterator<CapacitiesGroupDecoder>
    {
        private final CpctyConfGrpDecoder parent;
        private int remainder;
        private CapacitiesGroupDecoder current;

        public CapacitiesGroupIterator(final CpctyConfGrpDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }

        public CapacitiesGroupDecoder next()
        {
            remainder--;
            final CapacitiesGroupDecoder value = current;
            current = current.next();
            return value;
        }

        public int numberFieldValue()
        {
            return parent.hasNoCapacitiesGroupCounter() ? parent.noCapacitiesGroupCounter() : 0;
        }

        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.capacitiesGroup();
        }

        public CapacitiesGroupIterator iterator()
        {
            reset();
            return this;
        }

    }

    public CapacitiesGroupIterator capacitiesGroupIterator();
    public int noCapacitiesGroupCounter();
    public boolean hasNoCapacitiesGroupCounter();
    public CapacitiesGroupDecoder capacitiesGroup();

}
