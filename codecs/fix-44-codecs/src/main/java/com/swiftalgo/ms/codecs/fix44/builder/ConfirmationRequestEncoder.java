/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44.builder;

import org.agrona.MutableDirectBuffer;
import org.agrona.AsciiSequenceView;
import static uk.co.real_logic.artio.dictionary.generation.CodecUtil.*;
import static uk.co.real_logic.artio.dictionary.SessionConstants.*;
import uk.co.real_logic.artio.builder.Encoder;
import com.swiftalgo.ms.codecs.fix44.builder.HeaderEncoder;
import com.swiftalgo.ms.codecs.fix44.builder.TrailerEncoder;
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
import org.agrona.DirectBuffer;
import org.agrona.MutableDirectBuffer;
import org.agrona.concurrent.UnsafeBuffer;
import org.agrona.AsciiSequenceView;
import static java.nio.charset.StandardCharsets.US_ASCII;
import static uk.co.real_logic.artio.builder.Validation.CODEC_VALIDATION_ENABLED;
import static uk.co.real_logic.artio.builder.RejectUnknownField.CODEC_REJECT_UNKNOWN_FIELD_ENABLED;
import static uk.co.real_logic.artio.builder.RejectUnknownEnumValue.CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED;
import com.swiftalgo.ms.codecs.fix44.*;


public class ConfirmationRequestEncoder implements Encoder
{
    public long messageType()
    {
        return 18498L;
    }

    public ConfirmationRequestEncoder()
    {
        header.msgType("BH");
    }

    private final TrailerEncoder trailer = new TrailerEncoder();

    public TrailerEncoder trailer()
    {
        return trailer;
    }

    private final HeaderEncoder header = new HeaderEncoder();

    public HeaderEncoder header()
    {
        return header;
    }

    private static final int confirmReqIDHeaderLength = 4;
    private static final byte[] confirmReqIDHeader = new byte[] {56, 53, 57, (byte) '='};

    private static final int confirmTypeHeaderLength = 4;
    private static final byte[] confirmTypeHeader = new byte[] {55, 55, 51, (byte) '='};

    private static final int noOrdersGroupCounterHeaderLength = 3;
    private static final byte[] noOrdersGroupCounterHeader = new byte[] {55, 51, (byte) '='};

    private static final int allocIDHeaderLength = 3;
    private static final byte[] allocIDHeader = new byte[] {55, 48, (byte) '='};

    private static final int secondaryAllocIDHeaderLength = 4;
    private static final byte[] secondaryAllocIDHeader = new byte[] {55, 57, 51, (byte) '='};

    private static final int individualAllocIDHeaderLength = 4;
    private static final byte[] individualAllocIDHeader = new byte[] {52, 54, 55, (byte) '='};

    private static final int transactTimeHeaderLength = 3;
    private static final byte[] transactTimeHeader = new byte[] {54, 48, (byte) '='};

    private static final int allocAccountHeaderLength = 3;
    private static final byte[] allocAccountHeader = new byte[] {55, 57, (byte) '='};

    private static final int allocAcctIDSourceHeaderLength = 4;
    private static final byte[] allocAcctIDSourceHeader = new byte[] {54, 54, 49, (byte) '='};

    private static final int allocAccountTypeHeaderLength = 4;
    private static final byte[] allocAccountTypeHeader = new byte[] {55, 57, 56, (byte) '='};

    private static final int textHeaderLength = 3;
    private static final byte[] textHeader = new byte[] {53, 56, (byte) '='};

    private static final int encodedTextLenHeaderLength = 4;
    private static final byte[] encodedTextLenHeader = new byte[] {51, 53, 52, (byte) '='};

    private static final int encodedTextHeaderLength = 4;
    private static final byte[] encodedTextHeader = new byte[] {51, 53, 53, (byte) '='};

    private final MutableDirectBuffer confirmReqID = new UnsafeBuffer();

    private int confirmReqIDOffset = 0;

    private int confirmReqIDLength = 0;

    public ConfirmationRequestEncoder confirmReqID(final DirectBuffer value, final int offset, final int length)
    {
        confirmReqID.wrap(value);
        confirmReqIDOffset = offset;
        confirmReqIDLength = length;
        return this;
    }

    public ConfirmationRequestEncoder confirmReqID(final DirectBuffer value, final int length)
    {
        return confirmReqID(value, 0, length);
    }

    public ConfirmationRequestEncoder confirmReqID(final DirectBuffer value)
    {
        return confirmReqID(value, 0, value.capacity());
    }

    public ConfirmationRequestEncoder confirmReqID(final byte[] value, final int offset, final int length)
    {
        confirmReqID.wrap(value);
        confirmReqIDOffset = offset;
        confirmReqIDLength = length;
        return this;
    }

    public ConfirmationRequestEncoder confirmReqIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(confirmReqID, value, offset, length);
        confirmReqIDOffset = offset;
        confirmReqIDLength = length;
        return this;
    }

    public ConfirmationRequestEncoder confirmReqID(final byte[] value, final int length)
    {
        return confirmReqID(value, 0, length);
    }

    public ConfirmationRequestEncoder confirmReqID(final byte[] value)
    {
        return confirmReqID(value, 0, value.length);
    }

    public boolean hasConfirmReqID()
    {
        return confirmReqIDLength > 0;
    }

    public MutableDirectBuffer confirmReqID()
    {
        return confirmReqID;
    }

    public String confirmReqIDAsString()
    {
        return confirmReqID.getStringWithoutLengthAscii(confirmReqIDOffset, confirmReqIDLength);
    }

    public ConfirmationRequestEncoder confirmReqID(final CharSequence value)
    {
        toBytes(value, confirmReqID);
        confirmReqIDOffset = 0;
        confirmReqIDLength = value.length();
        return this;
    }

    public ConfirmationRequestEncoder confirmReqID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            confirmReqID.wrap(buffer);
            confirmReqIDOffset = value.offset();
            confirmReqIDLength = value.length();
        }
        return this;
    }

    public ConfirmationRequestEncoder confirmReqID(final char[] value)
    {
        return confirmReqID(value, 0, value.length);
    }

    public ConfirmationRequestEncoder confirmReqID(final char[] value, final int length)
    {
        return confirmReqID(value, 0, length);
    }

    public ConfirmationRequestEncoder confirmReqID(final char[] value, final int offset, final int length)
    {
        toBytes(value, confirmReqID, offset, length);
        confirmReqIDOffset = 0;
        confirmReqIDLength = length;
        return this;
    }

    private int confirmType;

    private boolean hasConfirmType;

    public boolean hasConfirmType()
    {
        return hasConfirmType;
    }

    public ConfirmationRequestEncoder confirmType(int value)
    {
        confirmType = value;
        hasConfirmType = true;
        return this;
    }

    public int confirmType()
    {
        return confirmType;
    }

    public ConfirmationRequestEncoder confirmType(ConfirmType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == ConfirmType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: confirmType Value: " + value );
            }
            if (value == ConfirmType.NULL_VAL)
            {
                return this;
            }
        }
        return confirmType(value.representation());
    }



public static class OrdersGroupEncoder
{
    private OrdersGroupEncoder next = null;

    public OrdersGroupEncoder next()
    {
        if (next == null)
        {
            next = new OrdersGroupEncoder();
        }
        return next;
    }

    private static final int clOrdIDHeaderLength = 3;
    private static final byte[] clOrdIDHeader = new byte[] {49, 49, (byte) '='};

    private static final int orderIDHeaderLength = 3;
    private static final byte[] orderIDHeader = new byte[] {51, 55, (byte) '='};

    private static final int secondaryOrderIDHeaderLength = 4;
    private static final byte[] secondaryOrderIDHeader = new byte[] {49, 57, 56, (byte) '='};

    private static final int secondaryClOrdIDHeaderLength = 4;
    private static final byte[] secondaryClOrdIDHeader = new byte[] {53, 50, 54, (byte) '='};

    private static final int listIDHeaderLength = 3;
    private static final byte[] listIDHeader = new byte[] {54, 54, (byte) '='};

    private static final int orderQtyHeaderLength = 3;
    private static final byte[] orderQtyHeader = new byte[] {51, 56, (byte) '='};

    private static final int orderAvgPxHeaderLength = 4;
    private static final byte[] orderAvgPxHeader = new byte[] {55, 57, 57, (byte) '='};

    private static final int orderBookingQtyHeaderLength = 4;
    private static final byte[] orderBookingQtyHeader = new byte[] {56, 48, 48, (byte) '='};

    private final MutableDirectBuffer clOrdID = new UnsafeBuffer();

    private int clOrdIDOffset = 0;

    private int clOrdIDLength = 0;

    public OrdersGroupEncoder clOrdID(final DirectBuffer value, final int offset, final int length)
    {
        clOrdID.wrap(value);
        clOrdIDOffset = offset;
        clOrdIDLength = length;
        return this;
    }

    public OrdersGroupEncoder clOrdID(final DirectBuffer value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    public OrdersGroupEncoder clOrdID(final DirectBuffer value)
    {
        return clOrdID(value, 0, value.capacity());
    }

    public OrdersGroupEncoder clOrdID(final byte[] value, final int offset, final int length)
    {
        clOrdID.wrap(value);
        clOrdIDOffset = offset;
        clOrdIDLength = length;
        return this;
    }

    public OrdersGroupEncoder clOrdIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(clOrdID, value, offset, length);
        clOrdIDOffset = offset;
        clOrdIDLength = length;
        return this;
    }

    public OrdersGroupEncoder clOrdID(final byte[] value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    public OrdersGroupEncoder clOrdID(final byte[] value)
    {
        return clOrdID(value, 0, value.length);
    }

    public boolean hasClOrdID()
    {
        return clOrdIDLength > 0;
    }

    public MutableDirectBuffer clOrdID()
    {
        return clOrdID;
    }

    public String clOrdIDAsString()
    {
        return clOrdID.getStringWithoutLengthAscii(clOrdIDOffset, clOrdIDLength);
    }

    public OrdersGroupEncoder clOrdID(final CharSequence value)
    {
        toBytes(value, clOrdID);
        clOrdIDOffset = 0;
        clOrdIDLength = value.length();
        return this;
    }

    public OrdersGroupEncoder clOrdID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            clOrdID.wrap(buffer);
            clOrdIDOffset = value.offset();
            clOrdIDLength = value.length();
        }
        return this;
    }

    public OrdersGroupEncoder clOrdID(final char[] value)
    {
        return clOrdID(value, 0, value.length);
    }

    public OrdersGroupEncoder clOrdID(final char[] value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    public OrdersGroupEncoder clOrdID(final char[] value, final int offset, final int length)
    {
        toBytes(value, clOrdID, offset, length);
        clOrdIDOffset = 0;
        clOrdIDLength = length;
        return this;
    }

    private final MutableDirectBuffer orderID = new UnsafeBuffer();

    private int orderIDOffset = 0;

    private int orderIDLength = 0;

    public OrdersGroupEncoder orderID(final DirectBuffer value, final int offset, final int length)
    {
        orderID.wrap(value);
        orderIDOffset = offset;
        orderIDLength = length;
        return this;
    }

    public OrdersGroupEncoder orderID(final DirectBuffer value, final int length)
    {
        return orderID(value, 0, length);
    }

    public OrdersGroupEncoder orderID(final DirectBuffer value)
    {
        return orderID(value, 0, value.capacity());
    }

    public OrdersGroupEncoder orderID(final byte[] value, final int offset, final int length)
    {
        orderID.wrap(value);
        orderIDOffset = offset;
        orderIDLength = length;
        return this;
    }

    public OrdersGroupEncoder orderIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(orderID, value, offset, length);
        orderIDOffset = offset;
        orderIDLength = length;
        return this;
    }

    public OrdersGroupEncoder orderID(final byte[] value, final int length)
    {
        return orderID(value, 0, length);
    }

    public OrdersGroupEncoder orderID(final byte[] value)
    {
        return orderID(value, 0, value.length);
    }

    public boolean hasOrderID()
    {
        return orderIDLength > 0;
    }

    public MutableDirectBuffer orderID()
    {
        return orderID;
    }

    public String orderIDAsString()
    {
        return orderID.getStringWithoutLengthAscii(orderIDOffset, orderIDLength);
    }

    public OrdersGroupEncoder orderID(final CharSequence value)
    {
        toBytes(value, orderID);
        orderIDOffset = 0;
        orderIDLength = value.length();
        return this;
    }

    public OrdersGroupEncoder orderID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            orderID.wrap(buffer);
            orderIDOffset = value.offset();
            orderIDLength = value.length();
        }
        return this;
    }

    public OrdersGroupEncoder orderID(final char[] value)
    {
        return orderID(value, 0, value.length);
    }

    public OrdersGroupEncoder orderID(final char[] value, final int length)
    {
        return orderID(value, 0, length);
    }

    public OrdersGroupEncoder orderID(final char[] value, final int offset, final int length)
    {
        toBytes(value, orderID, offset, length);
        orderIDOffset = 0;
        orderIDLength = length;
        return this;
    }

    private final MutableDirectBuffer secondaryOrderID = new UnsafeBuffer();

    private int secondaryOrderIDOffset = 0;

    private int secondaryOrderIDLength = 0;

    public OrdersGroupEncoder secondaryOrderID(final DirectBuffer value, final int offset, final int length)
    {
        secondaryOrderID.wrap(value);
        secondaryOrderIDOffset = offset;
        secondaryOrderIDLength = length;
        return this;
    }

    public OrdersGroupEncoder secondaryOrderID(final DirectBuffer value, final int length)
    {
        return secondaryOrderID(value, 0, length);
    }

    public OrdersGroupEncoder secondaryOrderID(final DirectBuffer value)
    {
        return secondaryOrderID(value, 0, value.capacity());
    }

    public OrdersGroupEncoder secondaryOrderID(final byte[] value, final int offset, final int length)
    {
        secondaryOrderID.wrap(value);
        secondaryOrderIDOffset = offset;
        secondaryOrderIDLength = length;
        return this;
    }

    public OrdersGroupEncoder secondaryOrderIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(secondaryOrderID, value, offset, length);
        secondaryOrderIDOffset = offset;
        secondaryOrderIDLength = length;
        return this;
    }

    public OrdersGroupEncoder secondaryOrderID(final byte[] value, final int length)
    {
        return secondaryOrderID(value, 0, length);
    }

    public OrdersGroupEncoder secondaryOrderID(final byte[] value)
    {
        return secondaryOrderID(value, 0, value.length);
    }

    public boolean hasSecondaryOrderID()
    {
        return secondaryOrderIDLength > 0;
    }

    public MutableDirectBuffer secondaryOrderID()
    {
        return secondaryOrderID;
    }

    public String secondaryOrderIDAsString()
    {
        return secondaryOrderID.getStringWithoutLengthAscii(secondaryOrderIDOffset, secondaryOrderIDLength);
    }

    public OrdersGroupEncoder secondaryOrderID(final CharSequence value)
    {
        toBytes(value, secondaryOrderID);
        secondaryOrderIDOffset = 0;
        secondaryOrderIDLength = value.length();
        return this;
    }

    public OrdersGroupEncoder secondaryOrderID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            secondaryOrderID.wrap(buffer);
            secondaryOrderIDOffset = value.offset();
            secondaryOrderIDLength = value.length();
        }
        return this;
    }

    public OrdersGroupEncoder secondaryOrderID(final char[] value)
    {
        return secondaryOrderID(value, 0, value.length);
    }

    public OrdersGroupEncoder secondaryOrderID(final char[] value, final int length)
    {
        return secondaryOrderID(value, 0, length);
    }

    public OrdersGroupEncoder secondaryOrderID(final char[] value, final int offset, final int length)
    {
        toBytes(value, secondaryOrderID, offset, length);
        secondaryOrderIDOffset = 0;
        secondaryOrderIDLength = length;
        return this;
    }

    private final MutableDirectBuffer secondaryClOrdID = new UnsafeBuffer();

    private int secondaryClOrdIDOffset = 0;

    private int secondaryClOrdIDLength = 0;

    public OrdersGroupEncoder secondaryClOrdID(final DirectBuffer value, final int offset, final int length)
    {
        secondaryClOrdID.wrap(value);
        secondaryClOrdIDOffset = offset;
        secondaryClOrdIDLength = length;
        return this;
    }

    public OrdersGroupEncoder secondaryClOrdID(final DirectBuffer value, final int length)
    {
        return secondaryClOrdID(value, 0, length);
    }

    public OrdersGroupEncoder secondaryClOrdID(final DirectBuffer value)
    {
        return secondaryClOrdID(value, 0, value.capacity());
    }

    public OrdersGroupEncoder secondaryClOrdID(final byte[] value, final int offset, final int length)
    {
        secondaryClOrdID.wrap(value);
        secondaryClOrdIDOffset = offset;
        secondaryClOrdIDLength = length;
        return this;
    }

    public OrdersGroupEncoder secondaryClOrdIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(secondaryClOrdID, value, offset, length);
        secondaryClOrdIDOffset = offset;
        secondaryClOrdIDLength = length;
        return this;
    }

    public OrdersGroupEncoder secondaryClOrdID(final byte[] value, final int length)
    {
        return secondaryClOrdID(value, 0, length);
    }

    public OrdersGroupEncoder secondaryClOrdID(final byte[] value)
    {
        return secondaryClOrdID(value, 0, value.length);
    }

    public boolean hasSecondaryClOrdID()
    {
        return secondaryClOrdIDLength > 0;
    }

    public MutableDirectBuffer secondaryClOrdID()
    {
        return secondaryClOrdID;
    }

    public String secondaryClOrdIDAsString()
    {
        return secondaryClOrdID.getStringWithoutLengthAscii(secondaryClOrdIDOffset, secondaryClOrdIDLength);
    }

    public OrdersGroupEncoder secondaryClOrdID(final CharSequence value)
    {
        toBytes(value, secondaryClOrdID);
        secondaryClOrdIDOffset = 0;
        secondaryClOrdIDLength = value.length();
        return this;
    }

    public OrdersGroupEncoder secondaryClOrdID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            secondaryClOrdID.wrap(buffer);
            secondaryClOrdIDOffset = value.offset();
            secondaryClOrdIDLength = value.length();
        }
        return this;
    }

    public OrdersGroupEncoder secondaryClOrdID(final char[] value)
    {
        return secondaryClOrdID(value, 0, value.length);
    }

    public OrdersGroupEncoder secondaryClOrdID(final char[] value, final int length)
    {
        return secondaryClOrdID(value, 0, length);
    }

    public OrdersGroupEncoder secondaryClOrdID(final char[] value, final int offset, final int length)
    {
        toBytes(value, secondaryClOrdID, offset, length);
        secondaryClOrdIDOffset = 0;
        secondaryClOrdIDLength = length;
        return this;
    }

    private final MutableDirectBuffer listID = new UnsafeBuffer();

    private int listIDOffset = 0;

    private int listIDLength = 0;

    public OrdersGroupEncoder listID(final DirectBuffer value, final int offset, final int length)
    {
        listID.wrap(value);
        listIDOffset = offset;
        listIDLength = length;
        return this;
    }

    public OrdersGroupEncoder listID(final DirectBuffer value, final int length)
    {
        return listID(value, 0, length);
    }

    public OrdersGroupEncoder listID(final DirectBuffer value)
    {
        return listID(value, 0, value.capacity());
    }

    public OrdersGroupEncoder listID(final byte[] value, final int offset, final int length)
    {
        listID.wrap(value);
        listIDOffset = offset;
        listIDLength = length;
        return this;
    }

    public OrdersGroupEncoder listIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(listID, value, offset, length);
        listIDOffset = offset;
        listIDLength = length;
        return this;
    }

    public OrdersGroupEncoder listID(final byte[] value, final int length)
    {
        return listID(value, 0, length);
    }

    public OrdersGroupEncoder listID(final byte[] value)
    {
        return listID(value, 0, value.length);
    }

    public boolean hasListID()
    {
        return listIDLength > 0;
    }

    public MutableDirectBuffer listID()
    {
        return listID;
    }

    public String listIDAsString()
    {
        return listID.getStringWithoutLengthAscii(listIDOffset, listIDLength);
    }

    public OrdersGroupEncoder listID(final CharSequence value)
    {
        toBytes(value, listID);
        listIDOffset = 0;
        listIDLength = value.length();
        return this;
    }

    public OrdersGroupEncoder listID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            listID.wrap(buffer);
            listIDOffset = value.offset();
            listIDLength = value.length();
        }
        return this;
    }

    public OrdersGroupEncoder listID(final char[] value)
    {
        return listID(value, 0, value.length);
    }

    public OrdersGroupEncoder listID(final char[] value, final int length)
    {
        return listID(value, 0, length);
    }

    public OrdersGroupEncoder listID(final char[] value, final int offset, final int length)
    {
        toBytes(value, listID, offset, length);
        listIDOffset = 0;
        listIDLength = length;
        return this;
    }

    private final NestedParties2Encoder nestedParties2 = new NestedParties2Encoder();
    public NestedParties2Encoder nestedParties2()
    {
        return nestedParties2;
    }

    private final DecimalFloat orderQty = new DecimalFloat();

    private boolean hasOrderQty;

    public boolean hasOrderQty()
    {
        return hasOrderQty;
    }

    public OrdersGroupEncoder orderQty(DecimalFloat value)
    {
        orderQty.set(value);
        hasOrderQty = true;
        return this;
    }

    public OrdersGroupEncoder orderQty(long value, int scale)
    {
        orderQty.set(value, scale);
        hasOrderQty = true;
        return this;
    }

    public DecimalFloat orderQty()
    {
        return orderQty;
    }

    private final DecimalFloat orderAvgPx = new DecimalFloat();

    private boolean hasOrderAvgPx;

    public boolean hasOrderAvgPx()
    {
        return hasOrderAvgPx;
    }

    public OrdersGroupEncoder orderAvgPx(DecimalFloat value)
    {
        orderAvgPx.set(value);
        hasOrderAvgPx = true;
        return this;
    }

    public OrdersGroupEncoder orderAvgPx(long value, int scale)
    {
        orderAvgPx.set(value, scale);
        hasOrderAvgPx = true;
        return this;
    }

    public DecimalFloat orderAvgPx()
    {
        return orderAvgPx;
    }

    private final DecimalFloat orderBookingQty = new DecimalFloat();

    private boolean hasOrderBookingQty;

    public boolean hasOrderBookingQty()
    {
        return hasOrderBookingQty;
    }

    public OrdersGroupEncoder orderBookingQty(DecimalFloat value)
    {
        orderBookingQty.set(value);
        hasOrderBookingQty = true;
        return this;
    }

    public OrdersGroupEncoder orderBookingQty(long value, int scale)
    {
        orderBookingQty.set(value, scale);
        hasOrderBookingQty = true;
        return this;
    }

    public DecimalFloat orderBookingQty()
    {
        return orderBookingQty;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (clOrdIDLength > 0)
        {
            buffer.putBytes(position, clOrdIDHeader, 0, clOrdIDHeaderLength);
            position += clOrdIDHeaderLength;
            buffer.putBytes(position, clOrdID, clOrdIDOffset, clOrdIDLength);
            position += clOrdIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (orderIDLength > 0)
        {
            buffer.putBytes(position, orderIDHeader, 0, orderIDHeaderLength);
            position += orderIDHeaderLength;
            buffer.putBytes(position, orderID, orderIDOffset, orderIDLength);
            position += orderIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (secondaryOrderIDLength > 0)
        {
            buffer.putBytes(position, secondaryOrderIDHeader, 0, secondaryOrderIDHeaderLength);
            position += secondaryOrderIDHeaderLength;
            buffer.putBytes(position, secondaryOrderID, secondaryOrderIDOffset, secondaryOrderIDLength);
            position += secondaryOrderIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (secondaryClOrdIDLength > 0)
        {
            buffer.putBytes(position, secondaryClOrdIDHeader, 0, secondaryClOrdIDHeaderLength);
            position += secondaryClOrdIDHeaderLength;
            buffer.putBytes(position, secondaryClOrdID, secondaryClOrdIDOffset, secondaryClOrdIDLength);
            position += secondaryClOrdIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (listIDLength > 0)
        {
            buffer.putBytes(position, listIDHeader, 0, listIDHeaderLength);
            position += listIDHeaderLength;
            buffer.putBytes(position, listID, listIDOffset, listIDLength);
            position += listIDLength;
            buffer.putSeparator(position);
            position++;
        }

            position += nestedParties2.encode(buffer, position);

        if (hasOrderQty)
        {
            buffer.putBytes(position, orderQtyHeader, 0, orderQtyHeaderLength);
            position += orderQtyHeaderLength;
            position += buffer.putFloatAscii(position, orderQty);
            buffer.putSeparator(position);
            position++;
        }

        if (hasOrderAvgPx)
        {
            buffer.putBytes(position, orderAvgPxHeader, 0, orderAvgPxHeaderLength);
            position += orderAvgPxHeaderLength;
            position += buffer.putFloatAscii(position, orderAvgPx);
            buffer.putSeparator(position);
            position++;
        }

        if (hasOrderBookingQty)
        {
            buffer.putBytes(position, orderBookingQtyHeader, 0, orderBookingQtyHeaderLength);
            position += orderBookingQtyHeaderLength;
            position += buffer.putFloatAscii(position, orderBookingQty);
            buffer.putSeparator(position);
            position++;
        }
        if (next != null)
        {
            position += next.encode(buffer, position, remainingElements - 1);
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
        nestedParties2.reset();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetClOrdID()
    {
        clOrdIDLength = 0;
    }

    public void resetOrderID()
    {
        orderIDLength = 0;
    }

    public void resetSecondaryOrderID()
    {
        secondaryOrderIDLength = 0;
    }

    public void resetSecondaryClOrdID()
    {
        secondaryClOrdIDLength = 0;
    }

    public void resetListID()
    {
        listIDLength = 0;
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
            appendBuffer(builder, clOrdID, clOrdIDOffset, clOrdIDLength);
            builder.append("\",\n");
        }

        if (hasOrderID())
        {
            indent(builder, level);
            builder.append("\"OrderID\": \"");
            appendBuffer(builder, orderID, orderIDOffset, orderIDLength);
            builder.append("\",\n");
        }

        if (hasSecondaryOrderID())
        {
            indent(builder, level);
            builder.append("\"SecondaryOrderID\": \"");
            appendBuffer(builder, secondaryOrderID, secondaryOrderIDOffset, secondaryOrderIDLength);
            builder.append("\",\n");
        }

        if (hasSecondaryClOrdID())
        {
            indent(builder, level);
            builder.append("\"SecondaryClOrdID\": \"");
            appendBuffer(builder, secondaryClOrdID, secondaryClOrdIDOffset, secondaryClOrdIDLength);
            builder.append("\",\n");
        }

        if (hasListID())
        {
            indent(builder, level);
            builder.append("\"ListID\": \"");
            appendBuffer(builder, listID, listIDOffset, listIDLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"NestedParties2\": ");
    nestedParties2.appendTo(builder, level + 1);
    builder.append("\n");

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
    public OrdersGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((OrdersGroupEncoder)encoder);
    }

    public OrdersGroupEncoder copyTo(final OrdersGroupEncoder encoder)
    {
        encoder.reset();
        if (hasClOrdID())
        {
            encoder.clOrdIDAsCopy(clOrdID.byteArray(), 0, clOrdIDLength);
        }

        if (hasOrderID())
        {
            encoder.orderIDAsCopy(orderID.byteArray(), 0, orderIDLength);
        }

        if (hasSecondaryOrderID())
        {
            encoder.secondaryOrderIDAsCopy(secondaryOrderID.byteArray(), 0, secondaryOrderIDLength);
        }

        if (hasSecondaryClOrdID())
        {
            encoder.secondaryClOrdIDAsCopy(secondaryClOrdID.byteArray(), 0, secondaryClOrdIDLength);
        }

        if (hasListID())
        {
            encoder.listIDAsCopy(listID.byteArray(), 0, listIDLength);
        }


        nestedParties2.copyTo(encoder.nestedParties2());
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
    private int noOrdersGroupCounter;

    private boolean hasNoOrdersGroupCounter;

    public boolean hasNoOrdersGroupCounter()
    {
        return hasNoOrdersGroupCounter;
    }

    public ConfirmationRequestEncoder noOrdersGroupCounter(int value)
    {
        noOrdersGroupCounter = value;
        hasNoOrdersGroupCounter = true;
        return this;
    }

    public int noOrdersGroupCounter()
    {
        return noOrdersGroupCounter;
    }


    private OrdersGroupEncoder ordersGroup = null;

    public OrdersGroupEncoder ordersGroup(final int numberOfElements)
    {
        hasNoOrdersGroupCounter = true;
        noOrdersGroupCounter = numberOfElements;
        if (ordersGroup == null)
        {
            ordersGroup = new OrdersGroupEncoder();
        }
        return ordersGroup;
    }

    private final MutableDirectBuffer allocID = new UnsafeBuffer();

    private int allocIDOffset = 0;

    private int allocIDLength = 0;

    public ConfirmationRequestEncoder allocID(final DirectBuffer value, final int offset, final int length)
    {
        allocID.wrap(value);
        allocIDOffset = offset;
        allocIDLength = length;
        return this;
    }

    public ConfirmationRequestEncoder allocID(final DirectBuffer value, final int length)
    {
        return allocID(value, 0, length);
    }

    public ConfirmationRequestEncoder allocID(final DirectBuffer value)
    {
        return allocID(value, 0, value.capacity());
    }

    public ConfirmationRequestEncoder allocID(final byte[] value, final int offset, final int length)
    {
        allocID.wrap(value);
        allocIDOffset = offset;
        allocIDLength = length;
        return this;
    }

    public ConfirmationRequestEncoder allocIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(allocID, value, offset, length);
        allocIDOffset = offset;
        allocIDLength = length;
        return this;
    }

    public ConfirmationRequestEncoder allocID(final byte[] value, final int length)
    {
        return allocID(value, 0, length);
    }

    public ConfirmationRequestEncoder allocID(final byte[] value)
    {
        return allocID(value, 0, value.length);
    }

    public boolean hasAllocID()
    {
        return allocIDLength > 0;
    }

    public MutableDirectBuffer allocID()
    {
        return allocID;
    }

    public String allocIDAsString()
    {
        return allocID.getStringWithoutLengthAscii(allocIDOffset, allocIDLength);
    }

    public ConfirmationRequestEncoder allocID(final CharSequence value)
    {
        toBytes(value, allocID);
        allocIDOffset = 0;
        allocIDLength = value.length();
        return this;
    }

    public ConfirmationRequestEncoder allocID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            allocID.wrap(buffer);
            allocIDOffset = value.offset();
            allocIDLength = value.length();
        }
        return this;
    }

    public ConfirmationRequestEncoder allocID(final char[] value)
    {
        return allocID(value, 0, value.length);
    }

    public ConfirmationRequestEncoder allocID(final char[] value, final int length)
    {
        return allocID(value, 0, length);
    }

    public ConfirmationRequestEncoder allocID(final char[] value, final int offset, final int length)
    {
        toBytes(value, allocID, offset, length);
        allocIDOffset = 0;
        allocIDLength = length;
        return this;
    }

    private final MutableDirectBuffer secondaryAllocID = new UnsafeBuffer();

    private int secondaryAllocIDOffset = 0;

    private int secondaryAllocIDLength = 0;

    public ConfirmationRequestEncoder secondaryAllocID(final DirectBuffer value, final int offset, final int length)
    {
        secondaryAllocID.wrap(value);
        secondaryAllocIDOffset = offset;
        secondaryAllocIDLength = length;
        return this;
    }

    public ConfirmationRequestEncoder secondaryAllocID(final DirectBuffer value, final int length)
    {
        return secondaryAllocID(value, 0, length);
    }

    public ConfirmationRequestEncoder secondaryAllocID(final DirectBuffer value)
    {
        return secondaryAllocID(value, 0, value.capacity());
    }

    public ConfirmationRequestEncoder secondaryAllocID(final byte[] value, final int offset, final int length)
    {
        secondaryAllocID.wrap(value);
        secondaryAllocIDOffset = offset;
        secondaryAllocIDLength = length;
        return this;
    }

    public ConfirmationRequestEncoder secondaryAllocIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(secondaryAllocID, value, offset, length);
        secondaryAllocIDOffset = offset;
        secondaryAllocIDLength = length;
        return this;
    }

    public ConfirmationRequestEncoder secondaryAllocID(final byte[] value, final int length)
    {
        return secondaryAllocID(value, 0, length);
    }

    public ConfirmationRequestEncoder secondaryAllocID(final byte[] value)
    {
        return secondaryAllocID(value, 0, value.length);
    }

    public boolean hasSecondaryAllocID()
    {
        return secondaryAllocIDLength > 0;
    }

    public MutableDirectBuffer secondaryAllocID()
    {
        return secondaryAllocID;
    }

    public String secondaryAllocIDAsString()
    {
        return secondaryAllocID.getStringWithoutLengthAscii(secondaryAllocIDOffset, secondaryAllocIDLength);
    }

    public ConfirmationRequestEncoder secondaryAllocID(final CharSequence value)
    {
        toBytes(value, secondaryAllocID);
        secondaryAllocIDOffset = 0;
        secondaryAllocIDLength = value.length();
        return this;
    }

    public ConfirmationRequestEncoder secondaryAllocID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            secondaryAllocID.wrap(buffer);
            secondaryAllocIDOffset = value.offset();
            secondaryAllocIDLength = value.length();
        }
        return this;
    }

    public ConfirmationRequestEncoder secondaryAllocID(final char[] value)
    {
        return secondaryAllocID(value, 0, value.length);
    }

    public ConfirmationRequestEncoder secondaryAllocID(final char[] value, final int length)
    {
        return secondaryAllocID(value, 0, length);
    }

    public ConfirmationRequestEncoder secondaryAllocID(final char[] value, final int offset, final int length)
    {
        toBytes(value, secondaryAllocID, offset, length);
        secondaryAllocIDOffset = 0;
        secondaryAllocIDLength = length;
        return this;
    }

    private final MutableDirectBuffer individualAllocID = new UnsafeBuffer();

    private int individualAllocIDOffset = 0;

    private int individualAllocIDLength = 0;

    public ConfirmationRequestEncoder individualAllocID(final DirectBuffer value, final int offset, final int length)
    {
        individualAllocID.wrap(value);
        individualAllocIDOffset = offset;
        individualAllocIDLength = length;
        return this;
    }

    public ConfirmationRequestEncoder individualAllocID(final DirectBuffer value, final int length)
    {
        return individualAllocID(value, 0, length);
    }

    public ConfirmationRequestEncoder individualAllocID(final DirectBuffer value)
    {
        return individualAllocID(value, 0, value.capacity());
    }

    public ConfirmationRequestEncoder individualAllocID(final byte[] value, final int offset, final int length)
    {
        individualAllocID.wrap(value);
        individualAllocIDOffset = offset;
        individualAllocIDLength = length;
        return this;
    }

    public ConfirmationRequestEncoder individualAllocIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(individualAllocID, value, offset, length);
        individualAllocIDOffset = offset;
        individualAllocIDLength = length;
        return this;
    }

    public ConfirmationRequestEncoder individualAllocID(final byte[] value, final int length)
    {
        return individualAllocID(value, 0, length);
    }

    public ConfirmationRequestEncoder individualAllocID(final byte[] value)
    {
        return individualAllocID(value, 0, value.length);
    }

    public boolean hasIndividualAllocID()
    {
        return individualAllocIDLength > 0;
    }

    public MutableDirectBuffer individualAllocID()
    {
        return individualAllocID;
    }

    public String individualAllocIDAsString()
    {
        return individualAllocID.getStringWithoutLengthAscii(individualAllocIDOffset, individualAllocIDLength);
    }

    public ConfirmationRequestEncoder individualAllocID(final CharSequence value)
    {
        toBytes(value, individualAllocID);
        individualAllocIDOffset = 0;
        individualAllocIDLength = value.length();
        return this;
    }

    public ConfirmationRequestEncoder individualAllocID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            individualAllocID.wrap(buffer);
            individualAllocIDOffset = value.offset();
            individualAllocIDLength = value.length();
        }
        return this;
    }

    public ConfirmationRequestEncoder individualAllocID(final char[] value)
    {
        return individualAllocID(value, 0, value.length);
    }

    public ConfirmationRequestEncoder individualAllocID(final char[] value, final int length)
    {
        return individualAllocID(value, 0, length);
    }

    public ConfirmationRequestEncoder individualAllocID(final char[] value, final int offset, final int length)
    {
        toBytes(value, individualAllocID, offset, length);
        individualAllocIDOffset = 0;
        individualAllocIDLength = length;
        return this;
    }

    private final MutableDirectBuffer transactTime = new UnsafeBuffer();

    private int transactTimeOffset = 0;

    private int transactTimeLength = 0;

    public ConfirmationRequestEncoder transactTime(final DirectBuffer value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public ConfirmationRequestEncoder transactTime(final DirectBuffer value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public ConfirmationRequestEncoder transactTime(final DirectBuffer value)
    {
        return transactTime(value, 0, value.capacity());
    }

    public ConfirmationRequestEncoder transactTime(final byte[] value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public ConfirmationRequestEncoder transactTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(transactTime, value, offset, length);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public ConfirmationRequestEncoder transactTime(final byte[] value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public ConfirmationRequestEncoder transactTime(final byte[] value)
    {
        return transactTime(value, 0, value.length);
    }

    public boolean hasTransactTime()
    {
        return transactTimeLength > 0;
    }

    public MutableDirectBuffer transactTime()
    {
        return transactTime;
    }

    public String transactTimeAsString()
    {
        return transactTime.getStringWithoutLengthAscii(transactTimeOffset, transactTimeLength);
    }

    private final MutableDirectBuffer allocAccount = new UnsafeBuffer();

    private int allocAccountOffset = 0;

    private int allocAccountLength = 0;

    public ConfirmationRequestEncoder allocAccount(final DirectBuffer value, final int offset, final int length)
    {
        allocAccount.wrap(value);
        allocAccountOffset = offset;
        allocAccountLength = length;
        return this;
    }

    public ConfirmationRequestEncoder allocAccount(final DirectBuffer value, final int length)
    {
        return allocAccount(value, 0, length);
    }

    public ConfirmationRequestEncoder allocAccount(final DirectBuffer value)
    {
        return allocAccount(value, 0, value.capacity());
    }

    public ConfirmationRequestEncoder allocAccount(final byte[] value, final int offset, final int length)
    {
        allocAccount.wrap(value);
        allocAccountOffset = offset;
        allocAccountLength = length;
        return this;
    }

    public ConfirmationRequestEncoder allocAccountAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(allocAccount, value, offset, length);
        allocAccountOffset = offset;
        allocAccountLength = length;
        return this;
    }

    public ConfirmationRequestEncoder allocAccount(final byte[] value, final int length)
    {
        return allocAccount(value, 0, length);
    }

    public ConfirmationRequestEncoder allocAccount(final byte[] value)
    {
        return allocAccount(value, 0, value.length);
    }

    public boolean hasAllocAccount()
    {
        return allocAccountLength > 0;
    }

    public MutableDirectBuffer allocAccount()
    {
        return allocAccount;
    }

    public String allocAccountAsString()
    {
        return allocAccount.getStringWithoutLengthAscii(allocAccountOffset, allocAccountLength);
    }

    public ConfirmationRequestEncoder allocAccount(final CharSequence value)
    {
        toBytes(value, allocAccount);
        allocAccountOffset = 0;
        allocAccountLength = value.length();
        return this;
    }

    public ConfirmationRequestEncoder allocAccount(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            allocAccount.wrap(buffer);
            allocAccountOffset = value.offset();
            allocAccountLength = value.length();
        }
        return this;
    }

    public ConfirmationRequestEncoder allocAccount(final char[] value)
    {
        return allocAccount(value, 0, value.length);
    }

    public ConfirmationRequestEncoder allocAccount(final char[] value, final int length)
    {
        return allocAccount(value, 0, length);
    }

    public ConfirmationRequestEncoder allocAccount(final char[] value, final int offset, final int length)
    {
        toBytes(value, allocAccount, offset, length);
        allocAccountOffset = 0;
        allocAccountLength = length;
        return this;
    }

    private int allocAcctIDSource;

    private boolean hasAllocAcctIDSource;

    public boolean hasAllocAcctIDSource()
    {
        return hasAllocAcctIDSource;
    }

    public ConfirmationRequestEncoder allocAcctIDSource(int value)
    {
        allocAcctIDSource = value;
        hasAllocAcctIDSource = true;
        return this;
    }

    public int allocAcctIDSource()
    {
        return allocAcctIDSource;
    }

    private int allocAccountType;

    private boolean hasAllocAccountType;

    public boolean hasAllocAccountType()
    {
        return hasAllocAccountType;
    }

    public ConfirmationRequestEncoder allocAccountType(int value)
    {
        allocAccountType = value;
        hasAllocAccountType = true;
        return this;
    }

    public int allocAccountType()
    {
        return allocAccountType;
    }

    public ConfirmationRequestEncoder allocAccountType(AllocAccountType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == AllocAccountType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: allocAccountType Value: " + value );
            }
            if (value == AllocAccountType.NULL_VAL)
            {
                return this;
            }
        }
        return allocAccountType(value.representation());
    }

    private final MutableDirectBuffer text = new UnsafeBuffer();

    private int textOffset = 0;

    private int textLength = 0;

    public ConfirmationRequestEncoder text(final DirectBuffer value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public ConfirmationRequestEncoder text(final DirectBuffer value, final int length)
    {
        return text(value, 0, length);
    }

    public ConfirmationRequestEncoder text(final DirectBuffer value)
    {
        return text(value, 0, value.capacity());
    }

    public ConfirmationRequestEncoder text(final byte[] value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public ConfirmationRequestEncoder textAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(text, value, offset, length);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public ConfirmationRequestEncoder text(final byte[] value, final int length)
    {
        return text(value, 0, length);
    }

    public ConfirmationRequestEncoder text(final byte[] value)
    {
        return text(value, 0, value.length);
    }

    public boolean hasText()
    {
        return textLength > 0;
    }

    public MutableDirectBuffer text()
    {
        return text;
    }

    public String textAsString()
    {
        return text.getStringWithoutLengthAscii(textOffset, textLength);
    }

    public ConfirmationRequestEncoder text(final CharSequence value)
    {
        toBytes(value, text);
        textOffset = 0;
        textLength = value.length();
        return this;
    }

    public ConfirmationRequestEncoder text(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            text.wrap(buffer);
            textOffset = value.offset();
            textLength = value.length();
        }
        return this;
    }

    public ConfirmationRequestEncoder text(final char[] value)
    {
        return text(value, 0, value.length);
    }

    public ConfirmationRequestEncoder text(final char[] value, final int length)
    {
        return text(value, 0, length);
    }

    public ConfirmationRequestEncoder text(final char[] value, final int offset, final int length)
    {
        toBytes(value, text, offset, length);
        textOffset = 0;
        textLength = length;
        return this;
    }

    private int encodedTextLen;

    private boolean hasEncodedTextLen;

    public boolean hasEncodedTextLen()
    {
        return hasEncodedTextLen;
    }

    public ConfirmationRequestEncoder encodedTextLen(int value)
    {
        encodedTextLen = value;
        hasEncodedTextLen = true;
        return this;
    }

    public int encodedTextLen()
    {
        return encodedTextLen;
    }

    private byte[] encodedText;

    private boolean hasEncodedText;

    public boolean hasEncodedText()
    {
        return hasEncodedText;
    }

    public ConfirmationRequestEncoder encodedText(byte[] value)
    {
        encodedText = value;
        hasEncodedText = true;
        return this;
    }

    public byte[] encodedText()
    {
        return encodedText;
    }

    public ConfirmationRequestEncoder encodedTextAsCopy(final byte[] value, final int offset, final int length)
    {
        encodedText = copyInto(encodedText, value, offset, length);
        hasEncodedText = true;
        return this;
    }

    public long encode(final MutableAsciiBuffer buffer, final int offset)
    {
        final long startMessageResult = header.startMessage(buffer, offset);
        final int bodyStart = Encoder.offset(startMessageResult);
        int position = bodyStart + Encoder.length(startMessageResult);

        if (confirmReqIDLength > 0)
        {
            buffer.putBytes(position, confirmReqIDHeader, 0, confirmReqIDHeaderLength);
            position += confirmReqIDHeaderLength;
            buffer.putBytes(position, confirmReqID, confirmReqIDOffset, confirmReqIDLength);
            position += confirmReqIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: ConfirmReqID");
        }

        if (hasConfirmType)
        {
            buffer.putBytes(position, confirmTypeHeader, 0, confirmTypeHeaderLength);
            position += confirmTypeHeaderLength;
            position += buffer.putIntAscii(position, confirmType);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: ConfirmType");
        }

        if (hasNoOrdersGroupCounter)
        {
            buffer.putBytes(position, noOrdersGroupCounterHeader, 0, noOrdersGroupCounterHeaderLength);
            position += noOrdersGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noOrdersGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (ordersGroup != null)
        {
            position += ordersGroup.encode(buffer, position, noOrdersGroupCounter);
        }


        if (allocIDLength > 0)
        {
            buffer.putBytes(position, allocIDHeader, 0, allocIDHeaderLength);
            position += allocIDHeaderLength;
            buffer.putBytes(position, allocID, allocIDOffset, allocIDLength);
            position += allocIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (secondaryAllocIDLength > 0)
        {
            buffer.putBytes(position, secondaryAllocIDHeader, 0, secondaryAllocIDHeaderLength);
            position += secondaryAllocIDHeaderLength;
            buffer.putBytes(position, secondaryAllocID, secondaryAllocIDOffset, secondaryAllocIDLength);
            position += secondaryAllocIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (individualAllocIDLength > 0)
        {
            buffer.putBytes(position, individualAllocIDHeader, 0, individualAllocIDHeaderLength);
            position += individualAllocIDHeaderLength;
            buffer.putBytes(position, individualAllocID, individualAllocIDOffset, individualAllocIDLength);
            position += individualAllocIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (transactTimeLength > 0)
        {
            buffer.putBytes(position, transactTimeHeader, 0, transactTimeHeaderLength);
            position += transactTimeHeaderLength;
            buffer.putBytes(position, transactTime, transactTimeOffset, transactTimeLength);
            position += transactTimeLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: TransactTime");
        }

        if (allocAccountLength > 0)
        {
            buffer.putBytes(position, allocAccountHeader, 0, allocAccountHeaderLength);
            position += allocAccountHeaderLength;
            buffer.putBytes(position, allocAccount, allocAccountOffset, allocAccountLength);
            position += allocAccountLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasAllocAcctIDSource)
        {
            buffer.putBytes(position, allocAcctIDSourceHeader, 0, allocAcctIDSourceHeaderLength);
            position += allocAcctIDSourceHeaderLength;
            position += buffer.putIntAscii(position, allocAcctIDSource);
            buffer.putSeparator(position);
            position++;
        }

        if (hasAllocAccountType)
        {
            buffer.putBytes(position, allocAccountTypeHeader, 0, allocAccountTypeHeaderLength);
            position += allocAccountTypeHeaderLength;
            position += buffer.putIntAscii(position, allocAccountType);
            buffer.putSeparator(position);
            position++;
        }

        if (textLength > 0)
        {
            buffer.putBytes(position, textHeader, 0, textHeaderLength);
            position += textHeaderLength;
            buffer.putBytes(position, text, textOffset, textLength);
            position += textLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasEncodedTextLen)
        {
            buffer.putBytes(position, encodedTextLenHeader, 0, encodedTextLenHeaderLength);
            position += encodedTextLenHeaderLength;
            position += buffer.putIntAscii(position, encodedTextLen);
            buffer.putSeparator(position);
            position++;
        }

        if (hasEncodedText)
        {
            buffer.putBytes(position, encodedTextHeader, 0, encodedTextHeaderLength);
            position += encodedTextHeaderLength;
            buffer.putBytes(position, encodedText);
            position += encodedText.length;
            buffer.putSeparator(position);
            position++;
        }
        position += trailer.startTrailer(buffer, position);

        final int messageStart = header.finishHeader(buffer, bodyStart, position - bodyStart);
        return trailer.finishMessage(buffer, messageStart, position);
    }

    public void reset()
    {
        header.reset();
        trailer.reset();
        resetMessage();
    }

    public void resetMessage()
    {
        this.resetConfirmReqID();
        this.resetConfirmType();
        this.resetAllocID();
        this.resetSecondaryAllocID();
        this.resetIndividualAllocID();
        this.resetTransactTime();
        this.resetAllocAccount();
        this.resetAllocAcctIDSource();
        this.resetAllocAccountType();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        this.resetOrdersGroup();
    }

    public void resetConfirmReqID()
    {
        confirmReqIDLength = 0;
    }

    public void resetConfirmType()
    {
        hasConfirmType = false;
    }

    public void resetAllocID()
    {
        allocIDLength = 0;
    }

    public void resetSecondaryAllocID()
    {
        secondaryAllocIDLength = 0;
    }

    public void resetIndividualAllocID()
    {
        individualAllocIDLength = 0;
    }

    public void resetTransactTime()
    {
        transactTimeLength = 0;
    }

    public void resetAllocAccount()
    {
        allocAccountLength = 0;
    }

    public void resetAllocAcctIDSource()
    {
        hasAllocAcctIDSource = false;
    }

    public void resetAllocAccountType()
    {
        hasAllocAccountType = false;
    }

    public void resetText()
    {
        textLength = 0;
    }

    public void resetEncodedTextLen()
    {
        hasEncodedTextLen = false;
    }

    public void resetEncodedText()
    {
        hasEncodedText = false;
    }

    public void resetOrdersGroup()
    {
        if (ordersGroup != null)
        {
            ordersGroup.reset();
        }
        noOrdersGroupCounter = 0;
        hasNoOrdersGroupCounter = false;
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
        builder.append("\"MessageName\": \"ConfirmationRequest\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasConfirmReqID())
        {
            indent(builder, level);
            builder.append("\"ConfirmReqID\": \"");
            appendBuffer(builder, confirmReqID, confirmReqIDOffset, confirmReqIDLength);
            builder.append("\",\n");
        }

        if (hasConfirmType())
        {
            indent(builder, level);
            builder.append("\"ConfirmType\": \"");
            builder.append(confirmType);
            builder.append("\",\n");
        }

        if (hasNoOrdersGroupCounter)
        {
            indent(builder, level);
            builder.append("\"OrdersGroup\": [\n");
            final int noOrdersGroupCounter = this.noOrdersGroupCounter;
            OrdersGroupEncoder ordersGroup = this.ordersGroup;
            for (int i = 0; i < noOrdersGroupCounter; i++)
            {
                indent(builder, level);
                ordersGroup.appendTo(builder, level + 1);
                if (i < (noOrdersGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                ordersGroup = ordersGroup.next();
            }
            indent(builder, level);
            builder.append("],\n");
        }

        if (hasAllocID())
        {
            indent(builder, level);
            builder.append("\"AllocID\": \"");
            appendBuffer(builder, allocID, allocIDOffset, allocIDLength);
            builder.append("\",\n");
        }

        if (hasSecondaryAllocID())
        {
            indent(builder, level);
            builder.append("\"SecondaryAllocID\": \"");
            appendBuffer(builder, secondaryAllocID, secondaryAllocIDOffset, secondaryAllocIDLength);
            builder.append("\",\n");
        }

        if (hasIndividualAllocID())
        {
            indent(builder, level);
            builder.append("\"IndividualAllocID\": \"");
            appendBuffer(builder, individualAllocID, individualAllocIDOffset, individualAllocIDLength);
            builder.append("\",\n");
        }

        if (hasTransactTime())
        {
            indent(builder, level);
            builder.append("\"TransactTime\": \"");
            appendBuffer(builder, transactTime, transactTimeOffset, transactTimeLength);
            builder.append("\",\n");
        }

        if (hasAllocAccount())
        {
            indent(builder, level);
            builder.append("\"AllocAccount\": \"");
            appendBuffer(builder, allocAccount, allocAccountOffset, allocAccountLength);
            builder.append("\",\n");
        }

        if (hasAllocAcctIDSource())
        {
            indent(builder, level);
            builder.append("\"AllocAcctIDSource\": \"");
            builder.append(allocAcctIDSource);
            builder.append("\",\n");
        }

        if (hasAllocAccountType())
        {
            indent(builder, level);
            builder.append("\"AllocAccountType\": \"");
            builder.append(allocAccountType);
            builder.append("\",\n");
        }

        if (hasText())
        {
            indent(builder, level);
            builder.append("\"Text\": \"");
            appendBuffer(builder, text, textOffset, textLength);
            builder.append("\",\n");
        }

        if (hasEncodedTextLen())
        {
            indent(builder, level);
            builder.append("\"EncodedTextLen\": \"");
            builder.append(encodedTextLen);
            builder.append("\",\n");
        }

        if (hasEncodedText())
        {
            indent(builder, level);
            builder.append("\"EncodedText\": \"");
            appendData(builder, encodedText, encodedTextLen);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public ConfirmationRequestEncoder copyTo(final Encoder encoder)
    {
        return copyTo((ConfirmationRequestEncoder)encoder);
    }

    public ConfirmationRequestEncoder copyTo(final ConfirmationRequestEncoder encoder)
    {
        encoder.reset();
        if (hasConfirmReqID())
        {
            encoder.confirmReqIDAsCopy(confirmReqID.byteArray(), 0, confirmReqIDLength);
        }

        if (hasConfirmType())
        {
            encoder.confirmType(this.confirmType());
        }

        if (hasNoOrdersGroupCounter)
        {
            final int size = this.noOrdersGroupCounter;
            OrdersGroupEncoder ordersGroup = this.ordersGroup;
            OrdersGroupEncoder ordersGroupEncoder = encoder.ordersGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (ordersGroup != null)
                {
                    ordersGroup.copyTo(ordersGroupEncoder);
                    ordersGroup = ordersGroup.next();
                    ordersGroupEncoder = ordersGroupEncoder.next();
                }
            }
        }

        if (hasAllocID())
        {
            encoder.allocIDAsCopy(allocID.byteArray(), 0, allocIDLength);
        }

        if (hasSecondaryAllocID())
        {
            encoder.secondaryAllocIDAsCopy(secondaryAllocID.byteArray(), 0, secondaryAllocIDLength);
        }

        if (hasIndividualAllocID())
        {
            encoder.individualAllocIDAsCopy(individualAllocID.byteArray(), 0, individualAllocIDLength);
        }

        if (hasTransactTime())
        {
            encoder.transactTimeAsCopy(transactTime.byteArray(), 0, transactTimeLength);
        }

        if (hasAllocAccount())
        {
            encoder.allocAccountAsCopy(allocAccount.byteArray(), 0, allocAccountLength);
        }

        if (hasAllocAcctIDSource())
        {
            encoder.allocAcctIDSource(this.allocAcctIDSource());
        }

        if (hasAllocAccountType())
        {
            encoder.allocAccountType(this.allocAccountType());
        }

        if (hasText())
        {
            encoder.textAsCopy(text.byteArray(), 0, textLength);
        }

        if (hasEncodedTextLen())
        {
            encoder.encodedTextLen(this.encodedTextLen());
        }

        if (hasEncodedText())
        {
            encoder.encodedTextAsCopy(this.encodedText(), 0, encodedTextLen());
            encoder.encodedTextLen(encodedTextLen());
        }
        return encoder;
    }

}
