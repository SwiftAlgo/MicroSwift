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
import com.swiftalgo.ms.codecs.fix50sp2.builder.OrdAllocGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.OrdAllocGrpEncoder.OrdersGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.NestedParties2Encoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.NestedParties2Encoder.Nested2PartyIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.NstdPtys2SubGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.NstdPtys2SubGrpEncoder.Nested2PartySubIDsGroupEncoder;

public interface OrdAllocGrpDecoder 
{



public class OrdersGroupDecoder extends CommonDecoderImpl implements NestedParties2Decoder
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(0);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
        }
    }

    public final IntHashSet GROUP_FIELDS = new IntHashSet(16);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            GROUP_FIELDS.add(Constants.CL_ORD_ID);
            GROUP_FIELDS.add(Constants.ORDER_ID);
            GROUP_FIELDS.add(Constants.SECONDARY_ORDER_ID);
            GROUP_FIELDS.add(Constants.SECONDARY_CL_ORD_ID);
            GROUP_FIELDS.add(Constants.LIST_ID);
            GROUP_FIELDS.add(Constants.ORDER_QTY);
            GROUP_FIELDS.add(Constants.ORDER_AVG_PX);
            GROUP_FIELDS.add(Constants.ORDER_BOOKING_QTY);
        }
    }

    public final IntHashSet ALL_GROUP_FIELDS = new IntHashSet(16);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            ALL_GROUP_FIELDS.add(Constants.CL_ORD_ID);
            ALL_GROUP_FIELDS.add(Constants.ORDER_ID);
            ALL_GROUP_FIELDS.add(Constants.SECONDARY_ORDER_ID);
            ALL_GROUP_FIELDS.add(Constants.SECONDARY_CL_ORD_ID);
            ALL_GROUP_FIELDS.add(Constants.LIST_ID);
            ALL_GROUP_FIELDS.add(Constants.ORDER_QTY);
            ALL_GROUP_FIELDS.add(Constants.ORDER_AVG_PX);
            ALL_GROUP_FIELDS.add(Constants.ORDER_BOOKING_QTY);
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
        if (hasNoNested2PartyIDsGroupCounter)
        {
            {
                int count = 0;
                final Nested2PartyIDsGroupIterator iterator = nested2PartyIDsGroupIterator.iterator();
                for (final Nested2PartyIDsGroupDecoder group : iterator)
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
                    invalidTagId = 756;
                    rejectReason = 16;
                    return false;
                }
            }
        }
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public OrdersGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private OrdersGroupDecoder next = null;

    public OrdersGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(18);

    private char[] clOrdID = new char[1];

    private boolean hasClOrdID;

    public char[] clOrdID()
    {
        if (!hasClOrdID)
        {
            throw new IllegalArgumentException("No value for optional field: ClOrdID");
        }

        return clOrdID;
    }

    public boolean hasClOrdID()
    {
        return hasClOrdID;
    }


    private int clOrdIDOffset;

    private int clOrdIDLength;

    public int clOrdIDLength()
    {
        if (!hasClOrdID)
        {
            throw new IllegalArgumentException("No value for optional field: ClOrdID");
        }

        return clOrdIDLength;
    }

    public String clOrdIDAsString()
    {
        return hasClOrdID ? new String(clOrdID, 0, clOrdIDLength) : null;
    }

    public void clOrdID(final AsciiSequenceView view)
    {
        if (!hasClOrdID)
        {
            throw new IllegalArgumentException("No value for optional field: ClOrdID");
        }

        view.wrap(buffer, clOrdIDOffset, clOrdIDLength);
    }


    private char[] orderID = new char[1];

    private boolean hasOrderID;

    public char[] orderID()
    {
        if (!hasOrderID)
        {
            throw new IllegalArgumentException("No value for optional field: OrderID");
        }

        return orderID;
    }

    public boolean hasOrderID()
    {
        return hasOrderID;
    }


    private int orderIDOffset;

    private int orderIDLength;

    public int orderIDLength()
    {
        if (!hasOrderID)
        {
            throw new IllegalArgumentException("No value for optional field: OrderID");
        }

        return orderIDLength;
    }

    public String orderIDAsString()
    {
        return hasOrderID ? new String(orderID, 0, orderIDLength) : null;
    }

    public void orderID(final AsciiSequenceView view)
    {
        if (!hasOrderID)
        {
            throw new IllegalArgumentException("No value for optional field: OrderID");
        }

        view.wrap(buffer, orderIDOffset, orderIDLength);
    }


    private char[] secondaryOrderID = new char[1];

    private boolean hasSecondaryOrderID;

    public char[] secondaryOrderID()
    {
        if (!hasSecondaryOrderID)
        {
            throw new IllegalArgumentException("No value for optional field: SecondaryOrderID");
        }

        return secondaryOrderID;
    }

    public boolean hasSecondaryOrderID()
    {
        return hasSecondaryOrderID;
    }


    private int secondaryOrderIDOffset;

    private int secondaryOrderIDLength;

    public int secondaryOrderIDLength()
    {
        if (!hasSecondaryOrderID)
        {
            throw new IllegalArgumentException("No value for optional field: SecondaryOrderID");
        }

        return secondaryOrderIDLength;
    }

    public String secondaryOrderIDAsString()
    {
        return hasSecondaryOrderID ? new String(secondaryOrderID, 0, secondaryOrderIDLength) : null;
    }

    public void secondaryOrderID(final AsciiSequenceView view)
    {
        if (!hasSecondaryOrderID)
        {
            throw new IllegalArgumentException("No value for optional field: SecondaryOrderID");
        }

        view.wrap(buffer, secondaryOrderIDOffset, secondaryOrderIDLength);
    }


    private char[] secondaryClOrdID = new char[1];

    private boolean hasSecondaryClOrdID;

    public char[] secondaryClOrdID()
    {
        if (!hasSecondaryClOrdID)
        {
            throw new IllegalArgumentException("No value for optional field: SecondaryClOrdID");
        }

        return secondaryClOrdID;
    }

    public boolean hasSecondaryClOrdID()
    {
        return hasSecondaryClOrdID;
    }


    private int secondaryClOrdIDOffset;

    private int secondaryClOrdIDLength;

    public int secondaryClOrdIDLength()
    {
        if (!hasSecondaryClOrdID)
        {
            throw new IllegalArgumentException("No value for optional field: SecondaryClOrdID");
        }

        return secondaryClOrdIDLength;
    }

    public String secondaryClOrdIDAsString()
    {
        return hasSecondaryClOrdID ? new String(secondaryClOrdID, 0, secondaryClOrdIDLength) : null;
    }

    public void secondaryClOrdID(final AsciiSequenceView view)
    {
        if (!hasSecondaryClOrdID)
        {
            throw new IllegalArgumentException("No value for optional field: SecondaryClOrdID");
        }

        view.wrap(buffer, secondaryClOrdIDOffset, secondaryClOrdIDLength);
    }


    private char[] listID = new char[1];

    private boolean hasListID;

    public char[] listID()
    {
        if (!hasListID)
        {
            throw new IllegalArgumentException("No value for optional field: ListID");
        }

        return listID;
    }

    public boolean hasListID()
    {
        return hasListID;
    }


    private int listIDOffset;

    private int listIDLength;

    public int listIDLength()
    {
        if (!hasListID)
        {
            throw new IllegalArgumentException("No value for optional field: ListID");
        }

        return listIDLength;
    }

    public String listIDAsString()
    {
        return hasListID ? new String(listID, 0, listIDLength) : null;
    }

    public void listID(final AsciiSequenceView view)
    {
        if (!hasListID)
        {
            throw new IllegalArgumentException("No value for optional field: ListID");
        }

        view.wrap(buffer, listIDOffset, listIDLength);
    }




    private Nested2PartyIDsGroupDecoder nested2PartyIDsGroup = null;
    public Nested2PartyIDsGroupDecoder nested2PartyIDsGroup()
    {
        return nested2PartyIDsGroup;
    }

    private int noNested2PartyIDsGroupCounter = MISSING_INT;

    private boolean hasNoNested2PartyIDsGroupCounter;

    public int noNested2PartyIDsGroupCounter()
    {
        if (!hasNoNested2PartyIDsGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoNested2PartyIDsGroupCounter");
        }

        return noNested2PartyIDsGroupCounter;
    }

    public boolean hasNoNested2PartyIDsGroupCounter()
    {
        return hasNoNested2PartyIDsGroupCounter;
    }




    private Nested2PartyIDsGroupIterator nested2PartyIDsGroupIterator = new Nested2PartyIDsGroupIterator(this);
    public Nested2PartyIDsGroupIterator nested2PartyIDsGroupIterator()
    {
        return nested2PartyIDsGroupIterator.iterator();
    }


    private DecimalFloat orderQty = DecimalFloat.newNaNValue();

    private boolean hasOrderQty;

    public DecimalFloat orderQty()
    {
        if (!hasOrderQty)
        {
            throw new IllegalArgumentException("No value for optional field: OrderQty");
        }

        return orderQty;
    }

    public boolean hasOrderQty()
    {
        return hasOrderQty;
    }



    private DecimalFloat orderAvgPx = DecimalFloat.newNaNValue();

    private boolean hasOrderAvgPx;

    public DecimalFloat orderAvgPx()
    {
        if (!hasOrderAvgPx)
        {
            throw new IllegalArgumentException("No value for optional field: OrderAvgPx");
        }

        return orderAvgPx;
    }

    public boolean hasOrderAvgPx()
    {
        return hasOrderAvgPx;
    }



    private DecimalFloat orderBookingQty = DecimalFloat.newNaNValue();

    private boolean hasOrderBookingQty;

    public DecimalFloat orderBookingQty()
    {
        if (!hasOrderBookingQty)
        {
            throw new IllegalArgumentException("No value for optional field: OrderBookingQty");
        }

        return orderBookingQty;
    }

    public boolean hasOrderBookingQty()
    {
        return hasOrderBookingQty;
    }



    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode OrdersGroup
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
                    next = new OrdersGroupDecoder(trailer, messageFields);
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
            case Constants.CL_ORD_ID:
                hasClOrdID = true;
                clOrdID = buffer.getChars(clOrdID, valueOffset, valueLength);
                clOrdIDOffset = valueOffset;
                clOrdIDLength = valueLength;
                break;

            case Constants.ORDER_ID:
                hasOrderID = true;
                orderID = buffer.getChars(orderID, valueOffset, valueLength);
                orderIDOffset = valueOffset;
                orderIDLength = valueLength;
                break;

            case Constants.SECONDARY_ORDER_ID:
                hasSecondaryOrderID = true;
                secondaryOrderID = buffer.getChars(secondaryOrderID, valueOffset, valueLength);
                secondaryOrderIDOffset = valueOffset;
                secondaryOrderIDLength = valueLength;
                break;

            case Constants.SECONDARY_CL_ORD_ID:
                hasSecondaryClOrdID = true;
                secondaryClOrdID = buffer.getChars(secondaryClOrdID, valueOffset, valueLength);
                secondaryClOrdIDOffset = valueOffset;
                secondaryClOrdIDLength = valueLength;
                break;

            case Constants.LIST_ID:
                hasListID = true;
                listID = buffer.getChars(listID, valueOffset, valueLength);
                listIDOffset = valueOffset;
                listIDLength = valueLength;
                break;

            case Constants.NO_NESTED2_PARTY_IDS:
                hasNoNested2PartyIDsGroupCounter = true;
                noNested2PartyIDsGroupCounter = getInt(buffer, valueOffset, endOfField, 756, CODEC_VALIDATION_ENABLED);
                if (nested2PartyIDsGroup == null)
                {
                    nested2PartyIDsGroup = new Nested2PartyIDsGroupDecoder(trailer, messageFields);
                }
                Nested2PartyIDsGroupDecoder nested2PartyIDsGroupCurrent = nested2PartyIDsGroup;
                position = endOfField + 1;
                final int noNested2PartyIDsGroupCounter = this.noNested2PartyIDsGroupCounter;
                for (int i = 0; i < noNested2PartyIDsGroupCounter && position < end; i++)
                {
                    if (nested2PartyIDsGroupCurrent != null)
                    {
                        position += nested2PartyIDsGroupCurrent.decode(buffer, position, end - position);
                        nested2PartyIDsGroupCurrent = nested2PartyIDsGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (nested2PartyIDsGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;


            case Constants.ORDER_QTY:
                hasOrderQty = true;
                orderQty = getFloat(buffer, orderQty, valueOffset, valueLength, 38, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.ORDER_AVG_PX:
                hasOrderAvgPx = true;
                orderAvgPx = getFloat(buffer, orderAvgPx, valueOffset, valueLength, 799, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.ORDER_BOOKING_QTY:
                hasOrderBookingQty = true;
                orderBookingQty = getFloat(buffer, orderBookingQty, valueOffset, valueLength, 800, CODEC_VALIDATION_ENABLED);
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
        this.resetClOrdID();
        this.resetOrderID();
        this.resetSecondaryOrderID();
        this.resetSecondaryClOrdID();
        this.resetListID();
        this.resetOrderQty();
        this.resetOrderAvgPx();
        this.resetOrderBookingQty();
        this.resetNested2PartyIDsGroup();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetClOrdID()
    {
        hasClOrdID = false;
    }

    public void resetOrderID()
    {
        hasOrderID = false;
    }

    public void resetSecondaryOrderID()
    {
        hasSecondaryOrderID = false;
    }

    public void resetSecondaryClOrdID()
    {
        hasSecondaryClOrdID = false;
    }

    public void resetListID()
    {
        hasListID = false;
    }

    public void resetOrderQty()
    {
        hasOrderQty = false;
    }

    public void resetOrderAvgPx()
    {
        hasOrderAvgPx = false;
    }

    public void resetOrderBookingQty()
    {
        hasOrderBookingQty = false;
    }

    public void resetNested2PartyIDsGroup()
    {
        for (final Nested2PartyIDsGroupDecoder nested2PartyIDsGroupDecoder : nested2PartyIDsGroupIterator.iterator())
        {
            nested2PartyIDsGroupDecoder.reset();
            if (nested2PartyIDsGroupDecoder.next() == null)
            {
                break;
            }
        }
        noNested2PartyIDsGroupCounter = MISSING_INT;
        hasNoNested2PartyIDsGroupCounter = false;
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
        builder.append("\"MessageName\": \"OrdersGroup\",\n");
        if (hasClOrdID())
        {
            indent(builder, level);
            builder.append("\"ClOrdID\": \"");
            builder.append(this.clOrdID(), 0, clOrdIDLength());
            builder.append("\",\n");
        }

        if (hasOrderID())
        {
            indent(builder, level);
            builder.append("\"OrderID\": \"");
            builder.append(this.orderID(), 0, orderIDLength());
            builder.append("\",\n");
        }

        if (hasSecondaryOrderID())
        {
            indent(builder, level);
            builder.append("\"SecondaryOrderID\": \"");
            builder.append(this.secondaryOrderID(), 0, secondaryOrderIDLength());
            builder.append("\",\n");
        }

        if (hasSecondaryClOrdID())
        {
            indent(builder, level);
            builder.append("\"SecondaryClOrdID\": \"");
            builder.append(this.secondaryClOrdID(), 0, secondaryClOrdIDLength());
            builder.append("\",\n");
        }

        if (hasListID())
        {
            indent(builder, level);
            builder.append("\"ListID\": \"");
            builder.append(this.listID(), 0, listIDLength());
            builder.append("\",\n");
        }

    if (hasNoNested2PartyIDsGroupCounter)
    {
        indent(builder, level);
        builder.append("\"Nested2PartyIDsGroup\": [\n");
        Nested2PartyIDsGroupDecoder nested2PartyIDsGroup = this.nested2PartyIDsGroup;
        for (int i = 0, size = this.noNested2PartyIDsGroupCounter; i < size; i++)
        {
            indent(builder, level);
            nested2PartyIDsGroup.appendTo(builder, level + 1);            if (nested2PartyIDsGroup.next() != null)
            {
                builder.append(',');
            }
            builder.append('\n');
            nested2PartyIDsGroup = nested2PartyIDsGroup.next();        }
        indent(builder, level);
        builder.append("],\n");
    }

        if (hasOrderQty())
        {
            indent(builder, level);
            builder.append("\"OrderQty\": \"");
            orderQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasOrderAvgPx())
        {
            indent(builder, level);
            builder.append("\"OrderAvgPx\": \"");
            orderAvgPx.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasOrderBookingQty())
        {
            indent(builder, level);
            builder.append("\"OrderBookingQty\": \"");
            orderBookingQty.appendTo(builder);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public OrdersGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((OrdersGroupEncoder)encoder);
    }

    public OrdersGroupEncoder toEncoder(final OrdersGroupEncoder encoder)
    {
        encoder.reset();
        if (hasClOrdID())
        {
            encoder.clOrdID(this.clOrdID(), 0, clOrdIDLength());
        }

        if (hasOrderID())
        {
            encoder.orderID(this.orderID(), 0, orderIDLength());
        }

        if (hasSecondaryOrderID())
        {
            encoder.secondaryOrderID(this.secondaryOrderID(), 0, secondaryOrderIDLength());
        }

        if (hasSecondaryClOrdID())
        {
            encoder.secondaryClOrdID(this.secondaryClOrdID(), 0, secondaryClOrdIDLength());
        }

        if (hasListID())
        {
            encoder.listID(this.listID(), 0, listIDLength());
        }


        final NestedParties2Encoder nestedParties2 = encoder.nestedParties2();        if (hasNoNested2PartyIDsGroupCounter)
        {
            final int size = this.noNested2PartyIDsGroupCounter;
            Nested2PartyIDsGroupDecoder nested2PartyIDsGroup = this.nested2PartyIDsGroup;
            Nested2PartyIDsGroupEncoder nested2PartyIDsGroupEncoder = nestedParties2.nested2PartyIDsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (nested2PartyIDsGroup != null)
                {
                    nested2PartyIDsGroup.toEncoder(nested2PartyIDsGroupEncoder);
                    nested2PartyIDsGroup = nested2PartyIDsGroup.next();
                    nested2PartyIDsGroupEncoder = nested2PartyIDsGroupEncoder.next();
                }
            }
        }


        if (hasOrderQty())
        {
            encoder.orderQty(this.orderQty());
        }

        if (hasOrderAvgPx())
        {
            encoder.orderAvgPx(this.orderAvgPx());
        }

        if (hasOrderBookingQty())
        {
            encoder.orderBookingQty(this.orderBookingQty());
        }
        return encoder;
    }

}
    public class OrdersGroupIterator implements Iterable<OrdersGroupDecoder>, java.util.Iterator<OrdersGroupDecoder>
    {
        private final OrdAllocGrpDecoder parent;
        private int remainder;
        private OrdersGroupDecoder current;

        public OrdersGroupIterator(final OrdAllocGrpDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }
        public OrdersGroupDecoder next()
        {
            remainder--;
            final OrdersGroupDecoder value = current;
            current = current.next();
            return value;
        }
        public int numberFieldValue()
        {
            return parent.hasNoOrdersGroupCounter() ? parent.noOrdersGroupCounter() : 0;
        }
        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.ordersGroup();
        }
        public OrdersGroupIterator iterator()
        {
            reset();
            return this;
        }
    }

public OrdersGroupIterator ordersGroupIterator();
    public int noOrdersGroupCounter();
    public boolean hasNoOrdersGroupCounter();
    public OrdersGroupDecoder ordersGroup();

}
