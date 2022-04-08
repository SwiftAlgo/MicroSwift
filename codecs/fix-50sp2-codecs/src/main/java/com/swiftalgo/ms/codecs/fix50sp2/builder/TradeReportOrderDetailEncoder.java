/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2.builder;

import org.agrona.MutableDirectBuffer;
import org.agrona.AsciiSequenceView;
import static uk.co.real_logic.artio.dictionary.generation.CodecUtil.*;
import static uk.co.real_logic.artio.dictionary.SessionConstants.*;
import uk.co.real_logic.artio.builder.Encoder;
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
import com.swiftalgo.ms.codecs.fix50sp2.*;


public class TradeReportOrderDetailEncoder
{
    private static final int orderIDHeaderLength = 3;
    private static final byte[] orderIDHeader = new byte[] {51, 55, (byte) '='};

    private static final int secondaryOrderIDHeaderLength = 4;
    private static final byte[] secondaryOrderIDHeader = new byte[] {49, 57, 56, (byte) '='};

    private static final int clOrdIDHeaderLength = 3;
    private static final byte[] clOrdIDHeader = new byte[] {49, 49, (byte) '='};

    private static final int secondaryClOrdIDHeaderLength = 4;
    private static final byte[] secondaryClOrdIDHeader = new byte[] {53, 50, 54, (byte) '='};

    private static final int listIDHeaderLength = 3;
    private static final byte[] listIDHeader = new byte[] {54, 54, (byte) '='};

    private static final int refOrderIDHeaderLength = 5;
    private static final byte[] refOrderIDHeader = new byte[] {49, 48, 56, 48, (byte) '='};

    private static final int refOrderIDSourceHeaderLength = 5;
    private static final byte[] refOrderIDSourceHeader = new byte[] {49, 48, 56, 49, (byte) '='};

    private static final int refOrdIDReasonHeaderLength = 5;
    private static final byte[] refOrdIDReasonHeader = new byte[] {49, 52, 51, 49, (byte) '='};

    private static final int ordTypeHeaderLength = 3;
    private static final byte[] ordTypeHeader = new byte[] {52, 48, (byte) '='};

    private static final int priceHeaderLength = 3;
    private static final byte[] priceHeader = new byte[] {52, 52, (byte) '='};

    private static final int stopPxHeaderLength = 3;
    private static final byte[] stopPxHeader = new byte[] {57, 57, (byte) '='};

    private static final int execInstHeaderLength = 3;
    private static final byte[] execInstHeader = new byte[] {49, 56, (byte) '='};

    private static final int ordStatusHeaderLength = 3;
    private static final byte[] ordStatusHeader = new byte[] {51, 57, (byte) '='};

    private static final int leavesQtyHeaderLength = 4;
    private static final byte[] leavesQtyHeader = new byte[] {49, 53, 49, (byte) '='};

    private static final int cumQtyHeaderLength = 3;
    private static final byte[] cumQtyHeader = new byte[] {49, 52, (byte) '='};

    private static final int timeInForceHeaderLength = 3;
    private static final byte[] timeInForceHeader = new byte[] {53, 57, (byte) '='};

    private static final int expireTimeHeaderLength = 4;
    private static final byte[] expireTimeHeader = new byte[] {49, 50, 54, (byte) '='};

    private static final int orderCapacityHeaderLength = 4;
    private static final byte[] orderCapacityHeader = new byte[] {53, 50, 56, (byte) '='};

    private static final int orderRestrictionsHeaderLength = 4;
    private static final byte[] orderRestrictionsHeader = new byte[] {53, 50, 57, (byte) '='};

    private static final int bookingTypeHeaderLength = 4;
    private static final byte[] bookingTypeHeader = new byte[] {55, 55, 53, (byte) '='};

    private static final int origCustOrderCapacityHeaderLength = 5;
    private static final byte[] origCustOrderCapacityHeader = new byte[] {49, 52, 51, 50, (byte) '='};

    private static final int orderInputDeviceHeaderLength = 4;
    private static final byte[] orderInputDeviceHeader = new byte[] {56, 50, 49, (byte) '='};

    private static final int lotTypeHeaderLength = 5;
    private static final byte[] lotTypeHeader = new byte[] {49, 48, 57, 51, (byte) '='};

    private static final int transBkdTimeHeaderLength = 4;
    private static final byte[] transBkdTimeHeader = new byte[] {52, 56, 51, (byte) '='};

    private static final int origOrdModTimeHeaderLength = 4;
    private static final byte[] origOrdModTimeHeader = new byte[] {53, 56, 54, (byte) '='};

    private final MutableDirectBuffer orderID = new UnsafeBuffer();

    private int orderIDOffset = 0;

    private int orderIDLength = 0;

    public TradeReportOrderDetailEncoder orderID(final DirectBuffer value, final int offset, final int length)
    {
        orderID.wrap(value);
        orderIDOffset = offset;
        orderIDLength = length;
        return this;
    }

    public TradeReportOrderDetailEncoder orderID(final DirectBuffer value, final int length)
    {
        return orderID(value, 0, length);
    }

    public TradeReportOrderDetailEncoder orderID(final DirectBuffer value)
    {
        return orderID(value, 0, value.capacity());
    }

    public TradeReportOrderDetailEncoder orderID(final byte[] value, final int offset, final int length)
    {
        orderID.wrap(value);
        orderIDOffset = offset;
        orderIDLength = length;
        return this;
    }

    public TradeReportOrderDetailEncoder orderIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(orderID, value, offset, length);
        orderIDOffset = offset;
        orderIDLength = length;
        return this;
    }

    public TradeReportOrderDetailEncoder orderID(final byte[] value, final int length)
    {
        return orderID(value, 0, length);
    }

    public TradeReportOrderDetailEncoder orderID(final byte[] value)
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

    public TradeReportOrderDetailEncoder orderID(final CharSequence value)
    {
        toBytes(value, orderID);
        orderIDOffset = 0;
        orderIDLength = value.length();
        return this;
    }

    public TradeReportOrderDetailEncoder orderID(final AsciiSequenceView value)
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

    public TradeReportOrderDetailEncoder orderID(final char[] value)
    {
        return orderID(value, 0, value.length);
    }

    public TradeReportOrderDetailEncoder orderID(final char[] value, final int length)
    {
        return orderID(value, 0, length);
    }

    public TradeReportOrderDetailEncoder orderID(final char[] value, final int offset, final int length)
    {
        toBytes(value, orderID, offset, length);
        orderIDOffset = 0;
        orderIDLength = length;
        return this;
    }

    private final MutableDirectBuffer secondaryOrderID = new UnsafeBuffer();

    private int secondaryOrderIDOffset = 0;

    private int secondaryOrderIDLength = 0;

    public TradeReportOrderDetailEncoder secondaryOrderID(final DirectBuffer value, final int offset, final int length)
    {
        secondaryOrderID.wrap(value);
        secondaryOrderIDOffset = offset;
        secondaryOrderIDLength = length;
        return this;
    }

    public TradeReportOrderDetailEncoder secondaryOrderID(final DirectBuffer value, final int length)
    {
        return secondaryOrderID(value, 0, length);
    }

    public TradeReportOrderDetailEncoder secondaryOrderID(final DirectBuffer value)
    {
        return secondaryOrderID(value, 0, value.capacity());
    }

    public TradeReportOrderDetailEncoder secondaryOrderID(final byte[] value, final int offset, final int length)
    {
        secondaryOrderID.wrap(value);
        secondaryOrderIDOffset = offset;
        secondaryOrderIDLength = length;
        return this;
    }

    public TradeReportOrderDetailEncoder secondaryOrderIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(secondaryOrderID, value, offset, length);
        secondaryOrderIDOffset = offset;
        secondaryOrderIDLength = length;
        return this;
    }

    public TradeReportOrderDetailEncoder secondaryOrderID(final byte[] value, final int length)
    {
        return secondaryOrderID(value, 0, length);
    }

    public TradeReportOrderDetailEncoder secondaryOrderID(final byte[] value)
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

    public TradeReportOrderDetailEncoder secondaryOrderID(final CharSequence value)
    {
        toBytes(value, secondaryOrderID);
        secondaryOrderIDOffset = 0;
        secondaryOrderIDLength = value.length();
        return this;
    }

    public TradeReportOrderDetailEncoder secondaryOrderID(final AsciiSequenceView value)
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

    public TradeReportOrderDetailEncoder secondaryOrderID(final char[] value)
    {
        return secondaryOrderID(value, 0, value.length);
    }

    public TradeReportOrderDetailEncoder secondaryOrderID(final char[] value, final int length)
    {
        return secondaryOrderID(value, 0, length);
    }

    public TradeReportOrderDetailEncoder secondaryOrderID(final char[] value, final int offset, final int length)
    {
        toBytes(value, secondaryOrderID, offset, length);
        secondaryOrderIDOffset = 0;
        secondaryOrderIDLength = length;
        return this;
    }

    private final MutableDirectBuffer clOrdID = new UnsafeBuffer();

    private int clOrdIDOffset = 0;

    private int clOrdIDLength = 0;

    public TradeReportOrderDetailEncoder clOrdID(final DirectBuffer value, final int offset, final int length)
    {
        clOrdID.wrap(value);
        clOrdIDOffset = offset;
        clOrdIDLength = length;
        return this;
    }

    public TradeReportOrderDetailEncoder clOrdID(final DirectBuffer value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    public TradeReportOrderDetailEncoder clOrdID(final DirectBuffer value)
    {
        return clOrdID(value, 0, value.capacity());
    }

    public TradeReportOrderDetailEncoder clOrdID(final byte[] value, final int offset, final int length)
    {
        clOrdID.wrap(value);
        clOrdIDOffset = offset;
        clOrdIDLength = length;
        return this;
    }

    public TradeReportOrderDetailEncoder clOrdIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(clOrdID, value, offset, length);
        clOrdIDOffset = offset;
        clOrdIDLength = length;
        return this;
    }

    public TradeReportOrderDetailEncoder clOrdID(final byte[] value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    public TradeReportOrderDetailEncoder clOrdID(final byte[] value)
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

    public TradeReportOrderDetailEncoder clOrdID(final CharSequence value)
    {
        toBytes(value, clOrdID);
        clOrdIDOffset = 0;
        clOrdIDLength = value.length();
        return this;
    }

    public TradeReportOrderDetailEncoder clOrdID(final AsciiSequenceView value)
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

    public TradeReportOrderDetailEncoder clOrdID(final char[] value)
    {
        return clOrdID(value, 0, value.length);
    }

    public TradeReportOrderDetailEncoder clOrdID(final char[] value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    public TradeReportOrderDetailEncoder clOrdID(final char[] value, final int offset, final int length)
    {
        toBytes(value, clOrdID, offset, length);
        clOrdIDOffset = 0;
        clOrdIDLength = length;
        return this;
    }

    private final MutableDirectBuffer secondaryClOrdID = new UnsafeBuffer();

    private int secondaryClOrdIDOffset = 0;

    private int secondaryClOrdIDLength = 0;

    public TradeReportOrderDetailEncoder secondaryClOrdID(final DirectBuffer value, final int offset, final int length)
    {
        secondaryClOrdID.wrap(value);
        secondaryClOrdIDOffset = offset;
        secondaryClOrdIDLength = length;
        return this;
    }

    public TradeReportOrderDetailEncoder secondaryClOrdID(final DirectBuffer value, final int length)
    {
        return secondaryClOrdID(value, 0, length);
    }

    public TradeReportOrderDetailEncoder secondaryClOrdID(final DirectBuffer value)
    {
        return secondaryClOrdID(value, 0, value.capacity());
    }

    public TradeReportOrderDetailEncoder secondaryClOrdID(final byte[] value, final int offset, final int length)
    {
        secondaryClOrdID.wrap(value);
        secondaryClOrdIDOffset = offset;
        secondaryClOrdIDLength = length;
        return this;
    }

    public TradeReportOrderDetailEncoder secondaryClOrdIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(secondaryClOrdID, value, offset, length);
        secondaryClOrdIDOffset = offset;
        secondaryClOrdIDLength = length;
        return this;
    }

    public TradeReportOrderDetailEncoder secondaryClOrdID(final byte[] value, final int length)
    {
        return secondaryClOrdID(value, 0, length);
    }

    public TradeReportOrderDetailEncoder secondaryClOrdID(final byte[] value)
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

    public TradeReportOrderDetailEncoder secondaryClOrdID(final CharSequence value)
    {
        toBytes(value, secondaryClOrdID);
        secondaryClOrdIDOffset = 0;
        secondaryClOrdIDLength = value.length();
        return this;
    }

    public TradeReportOrderDetailEncoder secondaryClOrdID(final AsciiSequenceView value)
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

    public TradeReportOrderDetailEncoder secondaryClOrdID(final char[] value)
    {
        return secondaryClOrdID(value, 0, value.length);
    }

    public TradeReportOrderDetailEncoder secondaryClOrdID(final char[] value, final int length)
    {
        return secondaryClOrdID(value, 0, length);
    }

    public TradeReportOrderDetailEncoder secondaryClOrdID(final char[] value, final int offset, final int length)
    {
        toBytes(value, secondaryClOrdID, offset, length);
        secondaryClOrdIDOffset = 0;
        secondaryClOrdIDLength = length;
        return this;
    }

    private final MutableDirectBuffer listID = new UnsafeBuffer();

    private int listIDOffset = 0;

    private int listIDLength = 0;

    public TradeReportOrderDetailEncoder listID(final DirectBuffer value, final int offset, final int length)
    {
        listID.wrap(value);
        listIDOffset = offset;
        listIDLength = length;
        return this;
    }

    public TradeReportOrderDetailEncoder listID(final DirectBuffer value, final int length)
    {
        return listID(value, 0, length);
    }

    public TradeReportOrderDetailEncoder listID(final DirectBuffer value)
    {
        return listID(value, 0, value.capacity());
    }

    public TradeReportOrderDetailEncoder listID(final byte[] value, final int offset, final int length)
    {
        listID.wrap(value);
        listIDOffset = offset;
        listIDLength = length;
        return this;
    }

    public TradeReportOrderDetailEncoder listIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(listID, value, offset, length);
        listIDOffset = offset;
        listIDLength = length;
        return this;
    }

    public TradeReportOrderDetailEncoder listID(final byte[] value, final int length)
    {
        return listID(value, 0, length);
    }

    public TradeReportOrderDetailEncoder listID(final byte[] value)
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

    public TradeReportOrderDetailEncoder listID(final CharSequence value)
    {
        toBytes(value, listID);
        listIDOffset = 0;
        listIDLength = value.length();
        return this;
    }

    public TradeReportOrderDetailEncoder listID(final AsciiSequenceView value)
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

    public TradeReportOrderDetailEncoder listID(final char[] value)
    {
        return listID(value, 0, value.length);
    }

    public TradeReportOrderDetailEncoder listID(final char[] value, final int length)
    {
        return listID(value, 0, length);
    }

    public TradeReportOrderDetailEncoder listID(final char[] value, final int offset, final int length)
    {
        toBytes(value, listID, offset, length);
        listIDOffset = 0;
        listIDLength = length;
        return this;
    }

    private final MutableDirectBuffer refOrderID = new UnsafeBuffer();

    private int refOrderIDOffset = 0;

    private int refOrderIDLength = 0;

    public TradeReportOrderDetailEncoder refOrderID(final DirectBuffer value, final int offset, final int length)
    {
        refOrderID.wrap(value);
        refOrderIDOffset = offset;
        refOrderIDLength = length;
        return this;
    }

    public TradeReportOrderDetailEncoder refOrderID(final DirectBuffer value, final int length)
    {
        return refOrderID(value, 0, length);
    }

    public TradeReportOrderDetailEncoder refOrderID(final DirectBuffer value)
    {
        return refOrderID(value, 0, value.capacity());
    }

    public TradeReportOrderDetailEncoder refOrderID(final byte[] value, final int offset, final int length)
    {
        refOrderID.wrap(value);
        refOrderIDOffset = offset;
        refOrderIDLength = length;
        return this;
    }

    public TradeReportOrderDetailEncoder refOrderIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(refOrderID, value, offset, length);
        refOrderIDOffset = offset;
        refOrderIDLength = length;
        return this;
    }

    public TradeReportOrderDetailEncoder refOrderID(final byte[] value, final int length)
    {
        return refOrderID(value, 0, length);
    }

    public TradeReportOrderDetailEncoder refOrderID(final byte[] value)
    {
        return refOrderID(value, 0, value.length);
    }

    public boolean hasRefOrderID()
    {
        return refOrderIDLength > 0;
    }

    public MutableDirectBuffer refOrderID()
    {
        return refOrderID;
    }

    public String refOrderIDAsString()
    {
        return refOrderID.getStringWithoutLengthAscii(refOrderIDOffset, refOrderIDLength);
    }

    public TradeReportOrderDetailEncoder refOrderID(final CharSequence value)
    {
        toBytes(value, refOrderID);
        refOrderIDOffset = 0;
        refOrderIDLength = value.length();
        return this;
    }

    public TradeReportOrderDetailEncoder refOrderID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            refOrderID.wrap(buffer);
            refOrderIDOffset = value.offset();
            refOrderIDLength = value.length();
        }
        return this;
    }

    public TradeReportOrderDetailEncoder refOrderID(final char[] value)
    {
        return refOrderID(value, 0, value.length);
    }

    public TradeReportOrderDetailEncoder refOrderID(final char[] value, final int length)
    {
        return refOrderID(value, 0, length);
    }

    public TradeReportOrderDetailEncoder refOrderID(final char[] value, final int offset, final int length)
    {
        toBytes(value, refOrderID, offset, length);
        refOrderIDOffset = 0;
        refOrderIDLength = length;
        return this;
    }

    private char refOrderIDSource;

    private boolean hasRefOrderIDSource;

    public boolean hasRefOrderIDSource()
    {
        return hasRefOrderIDSource;
    }

    public TradeReportOrderDetailEncoder refOrderIDSource(char value)
    {
        refOrderIDSource = value;
        hasRefOrderIDSource = true;
        return this;
    }

    public char refOrderIDSource()
    {
        return refOrderIDSource;
    }

    public TradeReportOrderDetailEncoder refOrderIDSource(RefOrderIDSource value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == RefOrderIDSource.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: refOrderIDSource Value: " + value );
            }
            if (value == RefOrderIDSource.NULL_VAL)
            {
                return this;
            }
        }
        return refOrderIDSource(value.representation());
    }

    private int refOrdIDReason;

    private boolean hasRefOrdIDReason;

    public boolean hasRefOrdIDReason()
    {
        return hasRefOrdIDReason;
    }

    public TradeReportOrderDetailEncoder refOrdIDReason(int value)
    {
        refOrdIDReason = value;
        hasRefOrdIDReason = true;
        return this;
    }

    public int refOrdIDReason()
    {
        return refOrdIDReason;
    }

    public TradeReportOrderDetailEncoder refOrdIDReason(RefOrdIDReason value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == RefOrdIDReason.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: refOrdIDReason Value: " + value );
            }
            if (value == RefOrdIDReason.NULL_VAL)
            {
                return this;
            }
        }
        return refOrdIDReason(value.representation());
    }

    private char ordType;

    private boolean hasOrdType;

    public boolean hasOrdType()
    {
        return hasOrdType;
    }

    public TradeReportOrderDetailEncoder ordType(char value)
    {
        ordType = value;
        hasOrdType = true;
        return this;
    }

    public char ordType()
    {
        return ordType;
    }

    public TradeReportOrderDetailEncoder ordType(OrdType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == OrdType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: ordType Value: " + value );
            }
            if (value == OrdType.NULL_VAL)
            {
                return this;
            }
        }
        return ordType(value.representation());
    }

    private final DecimalFloat price = new DecimalFloat();

    private boolean hasPrice;

    public boolean hasPrice()
    {
        return hasPrice;
    }

    public TradeReportOrderDetailEncoder price(DecimalFloat value)
    {
        price.set(value);
        hasPrice = true;
        return this;
    }

    public TradeReportOrderDetailEncoder price(long value, int scale)
    {
        price.set(value, scale);
        hasPrice = true;
        return this;
    }

    public DecimalFloat price()
    {
        return price;
    }

    private final DecimalFloat stopPx = new DecimalFloat();

    private boolean hasStopPx;

    public boolean hasStopPx()
    {
        return hasStopPx;
    }

    public TradeReportOrderDetailEncoder stopPx(DecimalFloat value)
    {
        stopPx.set(value);
        hasStopPx = true;
        return this;
    }

    public TradeReportOrderDetailEncoder stopPx(long value, int scale)
    {
        stopPx.set(value, scale);
        hasStopPx = true;
        return this;
    }

    public DecimalFloat stopPx()
    {
        return stopPx;
    }

    private final MutableDirectBuffer execInst = new UnsafeBuffer();

    private int execInstOffset = 0;

    private int execInstLength = 0;

    public TradeReportOrderDetailEncoder execInst(final DirectBuffer value, final int offset, final int length)
    {
        execInst.wrap(value);
        execInstOffset = offset;
        execInstLength = length;
        return this;
    }

    public TradeReportOrderDetailEncoder execInst(final DirectBuffer value, final int length)
    {
        return execInst(value, 0, length);
    }

    public TradeReportOrderDetailEncoder execInst(final DirectBuffer value)
    {
        return execInst(value, 0, value.capacity());
    }

    public TradeReportOrderDetailEncoder execInst(final byte[] value, final int offset, final int length)
    {
        execInst.wrap(value);
        execInstOffset = offset;
        execInstLength = length;
        return this;
    }

    public TradeReportOrderDetailEncoder execInstAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(execInst, value, offset, length);
        execInstOffset = offset;
        execInstLength = length;
        return this;
    }

    public TradeReportOrderDetailEncoder execInst(final byte[] value, final int length)
    {
        return execInst(value, 0, length);
    }

    public TradeReportOrderDetailEncoder execInst(final byte[] value)
    {
        return execInst(value, 0, value.length);
    }

    public boolean hasExecInst()
    {
        return execInstLength > 0;
    }

    public MutableDirectBuffer execInst()
    {
        return execInst;
    }

    public String execInstAsString()
    {
        return execInst.getStringWithoutLengthAscii(execInstOffset, execInstLength);
    }

    public TradeReportOrderDetailEncoder execInst(final CharSequence value)
    {
        toBytes(value, execInst);
        execInstOffset = 0;
        execInstLength = value.length();
        return this;
    }

    public TradeReportOrderDetailEncoder execInst(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            execInst.wrap(buffer);
            execInstOffset = value.offset();
            execInstLength = value.length();
        }
        return this;
    }

    public TradeReportOrderDetailEncoder execInst(final char[] value)
    {
        return execInst(value, 0, value.length);
    }

    public TradeReportOrderDetailEncoder execInst(final char[] value, final int length)
    {
        return execInst(value, 0, length);
    }

    public TradeReportOrderDetailEncoder execInst(final char[] value, final int offset, final int length)
    {
        toBytes(value, execInst, offset, length);
        execInstOffset = 0;
        execInstLength = length;
        return this;
    }

    private char ordStatus;

    private boolean hasOrdStatus;

    public boolean hasOrdStatus()
    {
        return hasOrdStatus;
    }

    public TradeReportOrderDetailEncoder ordStatus(char value)
    {
        ordStatus = value;
        hasOrdStatus = true;
        return this;
    }

    public char ordStatus()
    {
        return ordStatus;
    }

    public TradeReportOrderDetailEncoder ordStatus(OrdStatus value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == OrdStatus.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: ordStatus Value: " + value );
            }
            if (value == OrdStatus.NULL_VAL)
            {
                return this;
            }
        }
        return ordStatus(value.representation());
    }

    private final OrderQtyDataEncoder orderQtyData = new OrderQtyDataEncoder();
    public OrderQtyDataEncoder orderQtyData()
    {
        return orderQtyData;
    }

    private final DecimalFloat leavesQty = new DecimalFloat();

    private boolean hasLeavesQty;

    public boolean hasLeavesQty()
    {
        return hasLeavesQty;
    }

    public TradeReportOrderDetailEncoder leavesQty(DecimalFloat value)
    {
        leavesQty.set(value);
        hasLeavesQty = true;
        return this;
    }

    public TradeReportOrderDetailEncoder leavesQty(long value, int scale)
    {
        leavesQty.set(value, scale);
        hasLeavesQty = true;
        return this;
    }

    public DecimalFloat leavesQty()
    {
        return leavesQty;
    }

    private final DecimalFloat cumQty = new DecimalFloat();

    private boolean hasCumQty;

    public boolean hasCumQty()
    {
        return hasCumQty;
    }

    public TradeReportOrderDetailEncoder cumQty(DecimalFloat value)
    {
        cumQty.set(value);
        hasCumQty = true;
        return this;
    }

    public TradeReportOrderDetailEncoder cumQty(long value, int scale)
    {
        cumQty.set(value, scale);
        hasCumQty = true;
        return this;
    }

    public DecimalFloat cumQty()
    {
        return cumQty;
    }

    private char timeInForce;

    private boolean hasTimeInForce;

    public boolean hasTimeInForce()
    {
        return hasTimeInForce;
    }

    public TradeReportOrderDetailEncoder timeInForce(char value)
    {
        timeInForce = value;
        hasTimeInForce = true;
        return this;
    }

    public char timeInForce()
    {
        return timeInForce;
    }

    public TradeReportOrderDetailEncoder timeInForce(TimeInForce value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == TimeInForce.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: timeInForce Value: " + value );
            }
            if (value == TimeInForce.NULL_VAL)
            {
                return this;
            }
        }
        return timeInForce(value.representation());
    }

    private final MutableDirectBuffer expireTime = new UnsafeBuffer();

    private int expireTimeOffset = 0;

    private int expireTimeLength = 0;

    public TradeReportOrderDetailEncoder expireTime(final DirectBuffer value, final int offset, final int length)
    {
        expireTime.wrap(value);
        expireTimeOffset = offset;
        expireTimeLength = length;
        return this;
    }

    public TradeReportOrderDetailEncoder expireTime(final DirectBuffer value, final int length)
    {
        return expireTime(value, 0, length);
    }

    public TradeReportOrderDetailEncoder expireTime(final DirectBuffer value)
    {
        return expireTime(value, 0, value.capacity());
    }

    public TradeReportOrderDetailEncoder expireTime(final byte[] value, final int offset, final int length)
    {
        expireTime.wrap(value);
        expireTimeOffset = offset;
        expireTimeLength = length;
        return this;
    }

    public TradeReportOrderDetailEncoder expireTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(expireTime, value, offset, length);
        expireTimeOffset = offset;
        expireTimeLength = length;
        return this;
    }

    public TradeReportOrderDetailEncoder expireTime(final byte[] value, final int length)
    {
        return expireTime(value, 0, length);
    }

    public TradeReportOrderDetailEncoder expireTime(final byte[] value)
    {
        return expireTime(value, 0, value.length);
    }

    public boolean hasExpireTime()
    {
        return expireTimeLength > 0;
    }

    public MutableDirectBuffer expireTime()
    {
        return expireTime;
    }

    public String expireTimeAsString()
    {
        return expireTime.getStringWithoutLengthAscii(expireTimeOffset, expireTimeLength);
    }

    private final DisplayInstructionEncoder displayInstruction = new DisplayInstructionEncoder();
    public DisplayInstructionEncoder displayInstruction()
    {
        return displayInstruction;
    }

    private char orderCapacity;

    private boolean hasOrderCapacity;

    public boolean hasOrderCapacity()
    {
        return hasOrderCapacity;
    }

    public TradeReportOrderDetailEncoder orderCapacity(char value)
    {
        orderCapacity = value;
        hasOrderCapacity = true;
        return this;
    }

    public char orderCapacity()
    {
        return orderCapacity;
    }

    public TradeReportOrderDetailEncoder orderCapacity(OrderCapacity value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == OrderCapacity.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: orderCapacity Value: " + value );
            }
            if (value == OrderCapacity.NULL_VAL)
            {
                return this;
            }
        }
        return orderCapacity(value.representation());
    }

    private final MutableDirectBuffer orderRestrictions = new UnsafeBuffer();

    private int orderRestrictionsOffset = 0;

    private int orderRestrictionsLength = 0;

    public TradeReportOrderDetailEncoder orderRestrictions(final DirectBuffer value, final int offset, final int length)
    {
        orderRestrictions.wrap(value);
        orderRestrictionsOffset = offset;
        orderRestrictionsLength = length;
        return this;
    }

    public TradeReportOrderDetailEncoder orderRestrictions(final DirectBuffer value, final int length)
    {
        return orderRestrictions(value, 0, length);
    }

    public TradeReportOrderDetailEncoder orderRestrictions(final DirectBuffer value)
    {
        return orderRestrictions(value, 0, value.capacity());
    }

    public TradeReportOrderDetailEncoder orderRestrictions(final byte[] value, final int offset, final int length)
    {
        orderRestrictions.wrap(value);
        orderRestrictionsOffset = offset;
        orderRestrictionsLength = length;
        return this;
    }

    public TradeReportOrderDetailEncoder orderRestrictionsAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(orderRestrictions, value, offset, length);
        orderRestrictionsOffset = offset;
        orderRestrictionsLength = length;
        return this;
    }

    public TradeReportOrderDetailEncoder orderRestrictions(final byte[] value, final int length)
    {
        return orderRestrictions(value, 0, length);
    }

    public TradeReportOrderDetailEncoder orderRestrictions(final byte[] value)
    {
        return orderRestrictions(value, 0, value.length);
    }

    public boolean hasOrderRestrictions()
    {
        return orderRestrictionsLength > 0;
    }

    public MutableDirectBuffer orderRestrictions()
    {
        return orderRestrictions;
    }

    public String orderRestrictionsAsString()
    {
        return orderRestrictions.getStringWithoutLengthAscii(orderRestrictionsOffset, orderRestrictionsLength);
    }

    public TradeReportOrderDetailEncoder orderRestrictions(final CharSequence value)
    {
        toBytes(value, orderRestrictions);
        orderRestrictionsOffset = 0;
        orderRestrictionsLength = value.length();
        return this;
    }

    public TradeReportOrderDetailEncoder orderRestrictions(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            orderRestrictions.wrap(buffer);
            orderRestrictionsOffset = value.offset();
            orderRestrictionsLength = value.length();
        }
        return this;
    }

    public TradeReportOrderDetailEncoder orderRestrictions(final char[] value)
    {
        return orderRestrictions(value, 0, value.length);
    }

    public TradeReportOrderDetailEncoder orderRestrictions(final char[] value, final int length)
    {
        return orderRestrictions(value, 0, length);
    }

    public TradeReportOrderDetailEncoder orderRestrictions(final char[] value, final int offset, final int length)
    {
        toBytes(value, orderRestrictions, offset, length);
        orderRestrictionsOffset = 0;
        orderRestrictionsLength = length;
        return this;
    }

    private int bookingType;

    private boolean hasBookingType;

    public boolean hasBookingType()
    {
        return hasBookingType;
    }

    public TradeReportOrderDetailEncoder bookingType(int value)
    {
        bookingType = value;
        hasBookingType = true;
        return this;
    }

    public int bookingType()
    {
        return bookingType;
    }

    public TradeReportOrderDetailEncoder bookingType(BookingType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == BookingType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: bookingType Value: " + value );
            }
            if (value == BookingType.NULL_VAL)
            {
                return this;
            }
        }
        return bookingType(value.representation());
    }

    private int origCustOrderCapacity;

    private boolean hasOrigCustOrderCapacity;

    public boolean hasOrigCustOrderCapacity()
    {
        return hasOrigCustOrderCapacity;
    }

    public TradeReportOrderDetailEncoder origCustOrderCapacity(int value)
    {
        origCustOrderCapacity = value;
        hasOrigCustOrderCapacity = true;
        return this;
    }

    public int origCustOrderCapacity()
    {
        return origCustOrderCapacity;
    }

    public TradeReportOrderDetailEncoder origCustOrderCapacity(OrigCustOrderCapacity value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == OrigCustOrderCapacity.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: origCustOrderCapacity Value: " + value );
            }
            if (value == OrigCustOrderCapacity.NULL_VAL)
            {
                return this;
            }
        }
        return origCustOrderCapacity(value.representation());
    }

    private final MutableDirectBuffer orderInputDevice = new UnsafeBuffer();

    private int orderInputDeviceOffset = 0;

    private int orderInputDeviceLength = 0;

    public TradeReportOrderDetailEncoder orderInputDevice(final DirectBuffer value, final int offset, final int length)
    {
        orderInputDevice.wrap(value);
        orderInputDeviceOffset = offset;
        orderInputDeviceLength = length;
        return this;
    }

    public TradeReportOrderDetailEncoder orderInputDevice(final DirectBuffer value, final int length)
    {
        return orderInputDevice(value, 0, length);
    }

    public TradeReportOrderDetailEncoder orderInputDevice(final DirectBuffer value)
    {
        return orderInputDevice(value, 0, value.capacity());
    }

    public TradeReportOrderDetailEncoder orderInputDevice(final byte[] value, final int offset, final int length)
    {
        orderInputDevice.wrap(value);
        orderInputDeviceOffset = offset;
        orderInputDeviceLength = length;
        return this;
    }

    public TradeReportOrderDetailEncoder orderInputDeviceAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(orderInputDevice, value, offset, length);
        orderInputDeviceOffset = offset;
        orderInputDeviceLength = length;
        return this;
    }

    public TradeReportOrderDetailEncoder orderInputDevice(final byte[] value, final int length)
    {
        return orderInputDevice(value, 0, length);
    }

    public TradeReportOrderDetailEncoder orderInputDevice(final byte[] value)
    {
        return orderInputDevice(value, 0, value.length);
    }

    public boolean hasOrderInputDevice()
    {
        return orderInputDeviceLength > 0;
    }

    public MutableDirectBuffer orderInputDevice()
    {
        return orderInputDevice;
    }

    public String orderInputDeviceAsString()
    {
        return orderInputDevice.getStringWithoutLengthAscii(orderInputDeviceOffset, orderInputDeviceLength);
    }

    public TradeReportOrderDetailEncoder orderInputDevice(final CharSequence value)
    {
        toBytes(value, orderInputDevice);
        orderInputDeviceOffset = 0;
        orderInputDeviceLength = value.length();
        return this;
    }

    public TradeReportOrderDetailEncoder orderInputDevice(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            orderInputDevice.wrap(buffer);
            orderInputDeviceOffset = value.offset();
            orderInputDeviceLength = value.length();
        }
        return this;
    }

    public TradeReportOrderDetailEncoder orderInputDevice(final char[] value)
    {
        return orderInputDevice(value, 0, value.length);
    }

    public TradeReportOrderDetailEncoder orderInputDevice(final char[] value, final int length)
    {
        return orderInputDevice(value, 0, length);
    }

    public TradeReportOrderDetailEncoder orderInputDevice(final char[] value, final int offset, final int length)
    {
        toBytes(value, orderInputDevice, offset, length);
        orderInputDeviceOffset = 0;
        orderInputDeviceLength = length;
        return this;
    }

    private char lotType;

    private boolean hasLotType;

    public boolean hasLotType()
    {
        return hasLotType;
    }

    public TradeReportOrderDetailEncoder lotType(char value)
    {
        lotType = value;
        hasLotType = true;
        return this;
    }

    public char lotType()
    {
        return lotType;
    }

    public TradeReportOrderDetailEncoder lotType(LotType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == LotType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: lotType Value: " + value );
            }
            if (value == LotType.NULL_VAL)
            {
                return this;
            }
        }
        return lotType(value.representation());
    }

    private final MutableDirectBuffer transBkdTime = new UnsafeBuffer();

    private int transBkdTimeOffset = 0;

    private int transBkdTimeLength = 0;

    public TradeReportOrderDetailEncoder transBkdTime(final DirectBuffer value, final int offset, final int length)
    {
        transBkdTime.wrap(value);
        transBkdTimeOffset = offset;
        transBkdTimeLength = length;
        return this;
    }

    public TradeReportOrderDetailEncoder transBkdTime(final DirectBuffer value, final int length)
    {
        return transBkdTime(value, 0, length);
    }

    public TradeReportOrderDetailEncoder transBkdTime(final DirectBuffer value)
    {
        return transBkdTime(value, 0, value.capacity());
    }

    public TradeReportOrderDetailEncoder transBkdTime(final byte[] value, final int offset, final int length)
    {
        transBkdTime.wrap(value);
        transBkdTimeOffset = offset;
        transBkdTimeLength = length;
        return this;
    }

    public TradeReportOrderDetailEncoder transBkdTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(transBkdTime, value, offset, length);
        transBkdTimeOffset = offset;
        transBkdTimeLength = length;
        return this;
    }

    public TradeReportOrderDetailEncoder transBkdTime(final byte[] value, final int length)
    {
        return transBkdTime(value, 0, length);
    }

    public TradeReportOrderDetailEncoder transBkdTime(final byte[] value)
    {
        return transBkdTime(value, 0, value.length);
    }

    public boolean hasTransBkdTime()
    {
        return transBkdTimeLength > 0;
    }

    public MutableDirectBuffer transBkdTime()
    {
        return transBkdTime;
    }

    public String transBkdTimeAsString()
    {
        return transBkdTime.getStringWithoutLengthAscii(transBkdTimeOffset, transBkdTimeLength);
    }

    private final MutableDirectBuffer origOrdModTime = new UnsafeBuffer();

    private int origOrdModTimeOffset = 0;

    private int origOrdModTimeLength = 0;

    public TradeReportOrderDetailEncoder origOrdModTime(final DirectBuffer value, final int offset, final int length)
    {
        origOrdModTime.wrap(value);
        origOrdModTimeOffset = offset;
        origOrdModTimeLength = length;
        return this;
    }

    public TradeReportOrderDetailEncoder origOrdModTime(final DirectBuffer value, final int length)
    {
        return origOrdModTime(value, 0, length);
    }

    public TradeReportOrderDetailEncoder origOrdModTime(final DirectBuffer value)
    {
        return origOrdModTime(value, 0, value.capacity());
    }

    public TradeReportOrderDetailEncoder origOrdModTime(final byte[] value, final int offset, final int length)
    {
        origOrdModTime.wrap(value);
        origOrdModTimeOffset = offset;
        origOrdModTimeLength = length;
        return this;
    }

    public TradeReportOrderDetailEncoder origOrdModTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(origOrdModTime, value, offset, length);
        origOrdModTimeOffset = offset;
        origOrdModTimeLength = length;
        return this;
    }

    public TradeReportOrderDetailEncoder origOrdModTime(final byte[] value, final int length)
    {
        return origOrdModTime(value, 0, length);
    }

    public TradeReportOrderDetailEncoder origOrdModTime(final byte[] value)
    {
        return origOrdModTime(value, 0, value.length);
    }

    public boolean hasOrigOrdModTime()
    {
        return origOrdModTimeLength > 0;
    }

    public MutableDirectBuffer origOrdModTime()
    {
        return origOrdModTime;
    }

    public String origOrdModTimeAsString()
    {
        return origOrdModTime.getStringWithoutLengthAscii(origOrdModTimeOffset, origOrdModTimeLength);
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

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

        if (clOrdIDLength > 0)
        {
            buffer.putBytes(position, clOrdIDHeader, 0, clOrdIDHeaderLength);
            position += clOrdIDHeaderLength;
            buffer.putBytes(position, clOrdID, clOrdIDOffset, clOrdIDLength);
            position += clOrdIDLength;
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

        if (refOrderIDLength > 0)
        {
            buffer.putBytes(position, refOrderIDHeader, 0, refOrderIDHeaderLength);
            position += refOrderIDHeaderLength;
            buffer.putBytes(position, refOrderID, refOrderIDOffset, refOrderIDLength);
            position += refOrderIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasRefOrderIDSource)
        {
            buffer.putBytes(position, refOrderIDSourceHeader, 0, refOrderIDSourceHeaderLength);
            position += refOrderIDSourceHeaderLength;
            position += buffer.putCharAscii(position, refOrderIDSource);
            buffer.putSeparator(position);
            position++;
        }

        if (hasRefOrdIDReason)
        {
            buffer.putBytes(position, refOrdIDReasonHeader, 0, refOrdIDReasonHeaderLength);
            position += refOrdIDReasonHeaderLength;
            position += buffer.putIntAscii(position, refOrdIDReason);
            buffer.putSeparator(position);
            position++;
        }

        if (hasOrdType)
        {
            buffer.putBytes(position, ordTypeHeader, 0, ordTypeHeaderLength);
            position += ordTypeHeaderLength;
            position += buffer.putCharAscii(position, ordType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasPrice)
        {
            buffer.putBytes(position, priceHeader, 0, priceHeaderLength);
            position += priceHeaderLength;
            position += buffer.putFloatAscii(position, price);
            buffer.putSeparator(position);
            position++;
        }

        if (hasStopPx)
        {
            buffer.putBytes(position, stopPxHeader, 0, stopPxHeaderLength);
            position += stopPxHeaderLength;
            position += buffer.putFloatAscii(position, stopPx);
            buffer.putSeparator(position);
            position++;
        }

        if (execInstLength > 0)
        {
            buffer.putBytes(position, execInstHeader, 0, execInstHeaderLength);
            position += execInstHeaderLength;
            buffer.putBytes(position, execInst, execInstOffset, execInstLength);
            position += execInstLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasOrdStatus)
        {
            buffer.putBytes(position, ordStatusHeader, 0, ordStatusHeaderLength);
            position += ordStatusHeaderLength;
            position += buffer.putCharAscii(position, ordStatus);
            buffer.putSeparator(position);
            position++;
        }

            position += orderQtyData.encode(buffer, position);

        if (hasLeavesQty)
        {
            buffer.putBytes(position, leavesQtyHeader, 0, leavesQtyHeaderLength);
            position += leavesQtyHeaderLength;
            position += buffer.putFloatAscii(position, leavesQty);
            buffer.putSeparator(position);
            position++;
        }

        if (hasCumQty)
        {
            buffer.putBytes(position, cumQtyHeader, 0, cumQtyHeaderLength);
            position += cumQtyHeaderLength;
            position += buffer.putFloatAscii(position, cumQty);
            buffer.putSeparator(position);
            position++;
        }

        if (hasTimeInForce)
        {
            buffer.putBytes(position, timeInForceHeader, 0, timeInForceHeaderLength);
            position += timeInForceHeaderLength;
            position += buffer.putCharAscii(position, timeInForce);
            buffer.putSeparator(position);
            position++;
        }

        if (expireTimeLength > 0)
        {
            buffer.putBytes(position, expireTimeHeader, 0, expireTimeHeaderLength);
            position += expireTimeHeaderLength;
            buffer.putBytes(position, expireTime, expireTimeOffset, expireTimeLength);
            position += expireTimeLength;
            buffer.putSeparator(position);
            position++;
        }

            position += displayInstruction.encode(buffer, position);

        if (hasOrderCapacity)
        {
            buffer.putBytes(position, orderCapacityHeader, 0, orderCapacityHeaderLength);
            position += orderCapacityHeaderLength;
            position += buffer.putCharAscii(position, orderCapacity);
            buffer.putSeparator(position);
            position++;
        }

        if (orderRestrictionsLength > 0)
        {
            buffer.putBytes(position, orderRestrictionsHeader, 0, orderRestrictionsHeaderLength);
            position += orderRestrictionsHeaderLength;
            buffer.putBytes(position, orderRestrictions, orderRestrictionsOffset, orderRestrictionsLength);
            position += orderRestrictionsLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasBookingType)
        {
            buffer.putBytes(position, bookingTypeHeader, 0, bookingTypeHeaderLength);
            position += bookingTypeHeaderLength;
            position += buffer.putIntAscii(position, bookingType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasOrigCustOrderCapacity)
        {
            buffer.putBytes(position, origCustOrderCapacityHeader, 0, origCustOrderCapacityHeaderLength);
            position += origCustOrderCapacityHeaderLength;
            position += buffer.putIntAscii(position, origCustOrderCapacity);
            buffer.putSeparator(position);
            position++;
        }

        if (orderInputDeviceLength > 0)
        {
            buffer.putBytes(position, orderInputDeviceHeader, 0, orderInputDeviceHeaderLength);
            position += orderInputDeviceHeaderLength;
            buffer.putBytes(position, orderInputDevice, orderInputDeviceOffset, orderInputDeviceLength);
            position += orderInputDeviceLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasLotType)
        {
            buffer.putBytes(position, lotTypeHeader, 0, lotTypeHeaderLength);
            position += lotTypeHeaderLength;
            position += buffer.putCharAscii(position, lotType);
            buffer.putSeparator(position);
            position++;
        }

        if (transBkdTimeLength > 0)
        {
            buffer.putBytes(position, transBkdTimeHeader, 0, transBkdTimeHeaderLength);
            position += transBkdTimeHeaderLength;
            buffer.putBytes(position, transBkdTime, transBkdTimeOffset, transBkdTimeLength);
            position += transBkdTimeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (origOrdModTimeLength > 0)
        {
            buffer.putBytes(position, origOrdModTimeHeader, 0, origOrdModTimeHeaderLength);
            position += origOrdModTimeHeaderLength;
            buffer.putBytes(position, origOrdModTime, origOrdModTimeOffset, origOrdModTimeLength);
            position += origOrdModTimeLength;
            buffer.putSeparator(position);
            position++;
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetOrderID();
        this.resetSecondaryOrderID();
        this.resetClOrdID();
        this.resetSecondaryClOrdID();
        this.resetListID();
        this.resetRefOrderID();
        this.resetRefOrderIDSource();
        this.resetRefOrdIDReason();
        this.resetOrdType();
        this.resetPrice();
        this.resetStopPx();
        this.resetExecInst();
        this.resetOrdStatus();
        this.resetLeavesQty();
        this.resetCumQty();
        this.resetTimeInForce();
        this.resetExpireTime();
        this.resetOrderCapacity();
        this.resetOrderRestrictions();
        this.resetBookingType();
        this.resetOrigCustOrderCapacity();
        this.resetOrderInputDevice();
        this.resetLotType();
        this.resetTransBkdTime();
        this.resetOrigOrdModTime();
        orderQtyData.reset();
        displayInstruction.reset();
    }

    public void resetOrderID()
    {
        orderIDLength = 0;
    }

    public void resetSecondaryOrderID()
    {
        secondaryOrderIDLength = 0;
    }

    public void resetClOrdID()
    {
        clOrdIDLength = 0;
    }

    public void resetSecondaryClOrdID()
    {
        secondaryClOrdIDLength = 0;
    }

    public void resetListID()
    {
        listIDLength = 0;
    }

    public void resetRefOrderID()
    {
        refOrderIDLength = 0;
    }

    public void resetRefOrderIDSource()
    {
        hasRefOrderIDSource = false;
    }

    public void resetRefOrdIDReason()
    {
        hasRefOrdIDReason = false;
    }

    public void resetOrdType()
    {
        hasOrdType = false;
    }

    public void resetPrice()
    {
        hasPrice = false;
    }

    public void resetStopPx()
    {
        hasStopPx = false;
    }

    public void resetExecInst()
    {
        execInstLength = 0;
    }

    public void resetOrdStatus()
    {
        hasOrdStatus = false;
    }

    public void resetLeavesQty()
    {
        hasLeavesQty = false;
    }

    public void resetCumQty()
    {
        hasCumQty = false;
    }

    public void resetTimeInForce()
    {
        hasTimeInForce = false;
    }

    public void resetExpireTime()
    {
        expireTimeLength = 0;
    }

    public void resetOrderCapacity()
    {
        hasOrderCapacity = false;
    }

    public void resetOrderRestrictions()
    {
        orderRestrictionsLength = 0;
    }

    public void resetBookingType()
    {
        hasBookingType = false;
    }

    public void resetOrigCustOrderCapacity()
    {
        hasOrigCustOrderCapacity = false;
    }

    public void resetOrderInputDevice()
    {
        orderInputDeviceLength = 0;
    }

    public void resetLotType()
    {
        hasLotType = false;
    }

    public void resetTransBkdTime()
    {
        transBkdTimeLength = 0;
    }

    public void resetOrigOrdModTime()
    {
        origOrdModTimeLength = 0;
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
        builder.append("\"MessageName\": \"TradeReportOrderDetail\",\n");
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

        if (hasClOrdID())
        {
            indent(builder, level);
            builder.append("\"ClOrdID\": \"");
            appendBuffer(builder, clOrdID, clOrdIDOffset, clOrdIDLength);
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

        if (hasRefOrderID())
        {
            indent(builder, level);
            builder.append("\"RefOrderID\": \"");
            appendBuffer(builder, refOrderID, refOrderIDOffset, refOrderIDLength);
            builder.append("\",\n");
        }

        if (hasRefOrderIDSource())
        {
            indent(builder, level);
            builder.append("\"RefOrderIDSource\": \"");
            builder.append(refOrderIDSource);
            builder.append("\",\n");
        }

        if (hasRefOrdIDReason())
        {
            indent(builder, level);
            builder.append("\"RefOrdIDReason\": \"");
            builder.append(refOrdIDReason);
            builder.append("\",\n");
        }

        if (hasOrdType())
        {
            indent(builder, level);
            builder.append("\"OrdType\": \"");
            builder.append(ordType);
            builder.append("\",\n");
        }

        if (hasPrice())
        {
            indent(builder, level);
            builder.append("\"Price\": \"");
            price.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasStopPx())
        {
            indent(builder, level);
            builder.append("\"StopPx\": \"");
            stopPx.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasExecInst())
        {
            indent(builder, level);
            builder.append("\"ExecInst\": \"");
            appendBuffer(builder, execInst, execInstOffset, execInstLength);
            builder.append("\",\n");
        }

        if (hasOrdStatus())
        {
            indent(builder, level);
            builder.append("\"OrdStatus\": \"");
            builder.append(ordStatus);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"OrderQtyData\": ");
    orderQtyData.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasLeavesQty())
        {
            indent(builder, level);
            builder.append("\"LeavesQty\": \"");
            leavesQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasCumQty())
        {
            indent(builder, level);
            builder.append("\"CumQty\": \"");
            cumQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasTimeInForce())
        {
            indent(builder, level);
            builder.append("\"TimeInForce\": \"");
            builder.append(timeInForce);
            builder.append("\",\n");
        }

        if (hasExpireTime())
        {
            indent(builder, level);
            builder.append("\"ExpireTime\": \"");
            appendBuffer(builder, expireTime, expireTimeOffset, expireTimeLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"DisplayInstruction\": ");
    displayInstruction.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasOrderCapacity())
        {
            indent(builder, level);
            builder.append("\"OrderCapacity\": \"");
            builder.append(orderCapacity);
            builder.append("\",\n");
        }

        if (hasOrderRestrictions())
        {
            indent(builder, level);
            builder.append("\"OrderRestrictions\": \"");
            appendBuffer(builder, orderRestrictions, orderRestrictionsOffset, orderRestrictionsLength);
            builder.append("\",\n");
        }

        if (hasBookingType())
        {
            indent(builder, level);
            builder.append("\"BookingType\": \"");
            builder.append(bookingType);
            builder.append("\",\n");
        }

        if (hasOrigCustOrderCapacity())
        {
            indent(builder, level);
            builder.append("\"OrigCustOrderCapacity\": \"");
            builder.append(origCustOrderCapacity);
            builder.append("\",\n");
        }

        if (hasOrderInputDevice())
        {
            indent(builder, level);
            builder.append("\"OrderInputDevice\": \"");
            appendBuffer(builder, orderInputDevice, orderInputDeviceOffset, orderInputDeviceLength);
            builder.append("\",\n");
        }

        if (hasLotType())
        {
            indent(builder, level);
            builder.append("\"LotType\": \"");
            builder.append(lotType);
            builder.append("\",\n");
        }

        if (hasTransBkdTime())
        {
            indent(builder, level);
            builder.append("\"TransBkdTime\": \"");
            appendBuffer(builder, transBkdTime, transBkdTimeOffset, transBkdTimeLength);
            builder.append("\",\n");
        }

        if (hasOrigOrdModTime())
        {
            indent(builder, level);
            builder.append("\"OrigOrdModTime\": \"");
            appendBuffer(builder, origOrdModTime, origOrdModTimeOffset, origOrdModTimeLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public TradeReportOrderDetailEncoder copyTo(final Encoder encoder)
    {
        return copyTo((TradeReportOrderDetailEncoder)encoder);
    }

    public TradeReportOrderDetailEncoder copyTo(final TradeReportOrderDetailEncoder encoder)
    {
        encoder.reset();
        if (hasOrderID())
        {
            encoder.orderIDAsCopy(orderID.byteArray(), 0, orderIDLength);
        }

        if (hasSecondaryOrderID())
        {
            encoder.secondaryOrderIDAsCopy(secondaryOrderID.byteArray(), 0, secondaryOrderIDLength);
        }

        if (hasClOrdID())
        {
            encoder.clOrdIDAsCopy(clOrdID.byteArray(), 0, clOrdIDLength);
        }

        if (hasSecondaryClOrdID())
        {
            encoder.secondaryClOrdIDAsCopy(secondaryClOrdID.byteArray(), 0, secondaryClOrdIDLength);
        }

        if (hasListID())
        {
            encoder.listIDAsCopy(listID.byteArray(), 0, listIDLength);
        }

        if (hasRefOrderID())
        {
            encoder.refOrderIDAsCopy(refOrderID.byteArray(), 0, refOrderIDLength);
        }

        if (hasRefOrderIDSource())
        {
            encoder.refOrderIDSource(this.refOrderIDSource());
        }

        if (hasRefOrdIDReason())
        {
            encoder.refOrdIDReason(this.refOrdIDReason());
        }

        if (hasOrdType())
        {
            encoder.ordType(this.ordType());
        }

        if (hasPrice())
        {
            encoder.price(this.price());
        }

        if (hasStopPx())
        {
            encoder.stopPx(this.stopPx());
        }

        if (hasExecInst())
        {
            encoder.execInstAsCopy(execInst.byteArray(), 0, execInstLength);
        }

        if (hasOrdStatus())
        {
            encoder.ordStatus(this.ordStatus());
        }


        orderQtyData.copyTo(encoder.orderQtyData());
        if (hasLeavesQty())
        {
            encoder.leavesQty(this.leavesQty());
        }

        if (hasCumQty())
        {
            encoder.cumQty(this.cumQty());
        }

        if (hasTimeInForce())
        {
            encoder.timeInForce(this.timeInForce());
        }

        if (hasExpireTime())
        {
            encoder.expireTimeAsCopy(expireTime.byteArray(), 0, expireTimeLength);
        }


        displayInstruction.copyTo(encoder.displayInstruction());
        if (hasOrderCapacity())
        {
            encoder.orderCapacity(this.orderCapacity());
        }

        if (hasOrderRestrictions())
        {
            encoder.orderRestrictionsAsCopy(orderRestrictions.byteArray(), 0, orderRestrictionsLength);
        }

        if (hasBookingType())
        {
            encoder.bookingType(this.bookingType());
        }

        if (hasOrigCustOrderCapacity())
        {
            encoder.origCustOrderCapacity(this.origCustOrderCapacity());
        }

        if (hasOrderInputDevice())
        {
            encoder.orderInputDeviceAsCopy(orderInputDevice.byteArray(), 0, orderInputDeviceLength);
        }

        if (hasLotType())
        {
            encoder.lotType(this.lotType());
        }

        if (hasTransBkdTime())
        {
            encoder.transBkdTimeAsCopy(transBkdTime.byteArray(), 0, transBkdTimeLength);
        }

        if (hasOrigOrdModTime())
        {
            encoder.origOrdModTimeAsCopy(origOrdModTime.byteArray(), 0, origOrdModTimeLength);
        }
        return encoder;
    }

}
