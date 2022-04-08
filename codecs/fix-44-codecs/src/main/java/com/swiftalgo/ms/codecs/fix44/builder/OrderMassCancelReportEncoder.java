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


public class OrderMassCancelReportEncoder implements Encoder
{
    public long messageType()
    {
        return 114L;
    }

    public OrderMassCancelReportEncoder()
    {
        header.msgType("r");
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

    private static final int clOrdIDHeaderLength = 3;
    private static final byte[] clOrdIDHeader = new byte[] {49, 49, (byte) '='};

    private static final int secondaryClOrdIDHeaderLength = 4;
    private static final byte[] secondaryClOrdIDHeader = new byte[] {53, 50, 54, (byte) '='};

    private static final int orderIDHeaderLength = 3;
    private static final byte[] orderIDHeader = new byte[] {51, 55, (byte) '='};

    private static final int secondaryOrderIDHeaderLength = 4;
    private static final byte[] secondaryOrderIDHeader = new byte[] {49, 57, 56, (byte) '='};

    private static final int massCancelRequestTypeHeaderLength = 4;
    private static final byte[] massCancelRequestTypeHeader = new byte[] {53, 51, 48, (byte) '='};

    private static final int massCancelResponseHeaderLength = 4;
    private static final byte[] massCancelResponseHeader = new byte[] {53, 51, 49, (byte) '='};

    private static final int massCancelRejectReasonHeaderLength = 4;
    private static final byte[] massCancelRejectReasonHeader = new byte[] {53, 51, 50, (byte) '='};

    private static final int totalAffectedOrdersHeaderLength = 4;
    private static final byte[] totalAffectedOrdersHeader = new byte[] {53, 51, 51, (byte) '='};

    private static final int noAffectedOrdersGroupCounterHeaderLength = 4;
    private static final byte[] noAffectedOrdersGroupCounterHeader = new byte[] {53, 51, 52, (byte) '='};

    private static final int tradingSessionIDHeaderLength = 4;
    private static final byte[] tradingSessionIDHeader = new byte[] {51, 51, 54, (byte) '='};

    private static final int tradingSessionSubIDHeaderLength = 4;
    private static final byte[] tradingSessionSubIDHeader = new byte[] {54, 50, 53, (byte) '='};

    private static final int sideHeaderLength = 3;
    private static final byte[] sideHeader = new byte[] {53, 52, (byte) '='};

    private static final int transactTimeHeaderLength = 3;
    private static final byte[] transactTimeHeader = new byte[] {54, 48, (byte) '='};

    private static final int textHeaderLength = 3;
    private static final byte[] textHeader = new byte[] {53, 56, (byte) '='};

    private static final int encodedTextLenHeaderLength = 4;
    private static final byte[] encodedTextLenHeader = new byte[] {51, 53, 52, (byte) '='};

    private static final int encodedTextHeaderLength = 4;
    private static final byte[] encodedTextHeader = new byte[] {51, 53, 53, (byte) '='};

    private final MutableDirectBuffer clOrdID = new UnsafeBuffer();

    private int clOrdIDOffset = 0;

    private int clOrdIDLength = 0;

    public OrderMassCancelReportEncoder clOrdID(final DirectBuffer value, final int offset, final int length)
    {
        clOrdID.wrap(value);
        clOrdIDOffset = offset;
        clOrdIDLength = length;
        return this;
    }

    public OrderMassCancelReportEncoder clOrdID(final DirectBuffer value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    public OrderMassCancelReportEncoder clOrdID(final DirectBuffer value)
    {
        return clOrdID(value, 0, value.capacity());
    }

    public OrderMassCancelReportEncoder clOrdID(final byte[] value, final int offset, final int length)
    {
        clOrdID.wrap(value);
        clOrdIDOffset = offset;
        clOrdIDLength = length;
        return this;
    }

    public OrderMassCancelReportEncoder clOrdIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(clOrdID, value, offset, length);
        clOrdIDOffset = offset;
        clOrdIDLength = length;
        return this;
    }

    public OrderMassCancelReportEncoder clOrdID(final byte[] value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    public OrderMassCancelReportEncoder clOrdID(final byte[] value)
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

    public OrderMassCancelReportEncoder clOrdID(final CharSequence value)
    {
        toBytes(value, clOrdID);
        clOrdIDOffset = 0;
        clOrdIDLength = value.length();
        return this;
    }

    public OrderMassCancelReportEncoder clOrdID(final AsciiSequenceView value)
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

    public OrderMassCancelReportEncoder clOrdID(final char[] value)
    {
        return clOrdID(value, 0, value.length);
    }

    public OrderMassCancelReportEncoder clOrdID(final char[] value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    public OrderMassCancelReportEncoder clOrdID(final char[] value, final int offset, final int length)
    {
        toBytes(value, clOrdID, offset, length);
        clOrdIDOffset = 0;
        clOrdIDLength = length;
        return this;
    }

    private final MutableDirectBuffer secondaryClOrdID = new UnsafeBuffer();

    private int secondaryClOrdIDOffset = 0;

    private int secondaryClOrdIDLength = 0;

    public OrderMassCancelReportEncoder secondaryClOrdID(final DirectBuffer value, final int offset, final int length)
    {
        secondaryClOrdID.wrap(value);
        secondaryClOrdIDOffset = offset;
        secondaryClOrdIDLength = length;
        return this;
    }

    public OrderMassCancelReportEncoder secondaryClOrdID(final DirectBuffer value, final int length)
    {
        return secondaryClOrdID(value, 0, length);
    }

    public OrderMassCancelReportEncoder secondaryClOrdID(final DirectBuffer value)
    {
        return secondaryClOrdID(value, 0, value.capacity());
    }

    public OrderMassCancelReportEncoder secondaryClOrdID(final byte[] value, final int offset, final int length)
    {
        secondaryClOrdID.wrap(value);
        secondaryClOrdIDOffset = offset;
        secondaryClOrdIDLength = length;
        return this;
    }

    public OrderMassCancelReportEncoder secondaryClOrdIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(secondaryClOrdID, value, offset, length);
        secondaryClOrdIDOffset = offset;
        secondaryClOrdIDLength = length;
        return this;
    }

    public OrderMassCancelReportEncoder secondaryClOrdID(final byte[] value, final int length)
    {
        return secondaryClOrdID(value, 0, length);
    }

    public OrderMassCancelReportEncoder secondaryClOrdID(final byte[] value)
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

    public OrderMassCancelReportEncoder secondaryClOrdID(final CharSequence value)
    {
        toBytes(value, secondaryClOrdID);
        secondaryClOrdIDOffset = 0;
        secondaryClOrdIDLength = value.length();
        return this;
    }

    public OrderMassCancelReportEncoder secondaryClOrdID(final AsciiSequenceView value)
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

    public OrderMassCancelReportEncoder secondaryClOrdID(final char[] value)
    {
        return secondaryClOrdID(value, 0, value.length);
    }

    public OrderMassCancelReportEncoder secondaryClOrdID(final char[] value, final int length)
    {
        return secondaryClOrdID(value, 0, length);
    }

    public OrderMassCancelReportEncoder secondaryClOrdID(final char[] value, final int offset, final int length)
    {
        toBytes(value, secondaryClOrdID, offset, length);
        secondaryClOrdIDOffset = 0;
        secondaryClOrdIDLength = length;
        return this;
    }

    private final MutableDirectBuffer orderID = new UnsafeBuffer();

    private int orderIDOffset = 0;

    private int orderIDLength = 0;

    public OrderMassCancelReportEncoder orderID(final DirectBuffer value, final int offset, final int length)
    {
        orderID.wrap(value);
        orderIDOffset = offset;
        orderIDLength = length;
        return this;
    }

    public OrderMassCancelReportEncoder orderID(final DirectBuffer value, final int length)
    {
        return orderID(value, 0, length);
    }

    public OrderMassCancelReportEncoder orderID(final DirectBuffer value)
    {
        return orderID(value, 0, value.capacity());
    }

    public OrderMassCancelReportEncoder orderID(final byte[] value, final int offset, final int length)
    {
        orderID.wrap(value);
        orderIDOffset = offset;
        orderIDLength = length;
        return this;
    }

    public OrderMassCancelReportEncoder orderIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(orderID, value, offset, length);
        orderIDOffset = offset;
        orderIDLength = length;
        return this;
    }

    public OrderMassCancelReportEncoder orderID(final byte[] value, final int length)
    {
        return orderID(value, 0, length);
    }

    public OrderMassCancelReportEncoder orderID(final byte[] value)
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

    public OrderMassCancelReportEncoder orderID(final CharSequence value)
    {
        toBytes(value, orderID);
        orderIDOffset = 0;
        orderIDLength = value.length();
        return this;
    }

    public OrderMassCancelReportEncoder orderID(final AsciiSequenceView value)
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

    public OrderMassCancelReportEncoder orderID(final char[] value)
    {
        return orderID(value, 0, value.length);
    }

    public OrderMassCancelReportEncoder orderID(final char[] value, final int length)
    {
        return orderID(value, 0, length);
    }

    public OrderMassCancelReportEncoder orderID(final char[] value, final int offset, final int length)
    {
        toBytes(value, orderID, offset, length);
        orderIDOffset = 0;
        orderIDLength = length;
        return this;
    }

    private final MutableDirectBuffer secondaryOrderID = new UnsafeBuffer();

    private int secondaryOrderIDOffset = 0;

    private int secondaryOrderIDLength = 0;

    public OrderMassCancelReportEncoder secondaryOrderID(final DirectBuffer value, final int offset, final int length)
    {
        secondaryOrderID.wrap(value);
        secondaryOrderIDOffset = offset;
        secondaryOrderIDLength = length;
        return this;
    }

    public OrderMassCancelReportEncoder secondaryOrderID(final DirectBuffer value, final int length)
    {
        return secondaryOrderID(value, 0, length);
    }

    public OrderMassCancelReportEncoder secondaryOrderID(final DirectBuffer value)
    {
        return secondaryOrderID(value, 0, value.capacity());
    }

    public OrderMassCancelReportEncoder secondaryOrderID(final byte[] value, final int offset, final int length)
    {
        secondaryOrderID.wrap(value);
        secondaryOrderIDOffset = offset;
        secondaryOrderIDLength = length;
        return this;
    }

    public OrderMassCancelReportEncoder secondaryOrderIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(secondaryOrderID, value, offset, length);
        secondaryOrderIDOffset = offset;
        secondaryOrderIDLength = length;
        return this;
    }

    public OrderMassCancelReportEncoder secondaryOrderID(final byte[] value, final int length)
    {
        return secondaryOrderID(value, 0, length);
    }

    public OrderMassCancelReportEncoder secondaryOrderID(final byte[] value)
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

    public OrderMassCancelReportEncoder secondaryOrderID(final CharSequence value)
    {
        toBytes(value, secondaryOrderID);
        secondaryOrderIDOffset = 0;
        secondaryOrderIDLength = value.length();
        return this;
    }

    public OrderMassCancelReportEncoder secondaryOrderID(final AsciiSequenceView value)
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

    public OrderMassCancelReportEncoder secondaryOrderID(final char[] value)
    {
        return secondaryOrderID(value, 0, value.length);
    }

    public OrderMassCancelReportEncoder secondaryOrderID(final char[] value, final int length)
    {
        return secondaryOrderID(value, 0, length);
    }

    public OrderMassCancelReportEncoder secondaryOrderID(final char[] value, final int offset, final int length)
    {
        toBytes(value, secondaryOrderID, offset, length);
        secondaryOrderIDOffset = 0;
        secondaryOrderIDLength = length;
        return this;
    }

    private char massCancelRequestType;

    private boolean hasMassCancelRequestType;

    public boolean hasMassCancelRequestType()
    {
        return hasMassCancelRequestType;
    }

    public OrderMassCancelReportEncoder massCancelRequestType(char value)
    {
        massCancelRequestType = value;
        hasMassCancelRequestType = true;
        return this;
    }

    public char massCancelRequestType()
    {
        return massCancelRequestType;
    }

    public OrderMassCancelReportEncoder massCancelRequestType(MassCancelRequestType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == MassCancelRequestType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: massCancelRequestType Value: " + value );
            }
            if (value == MassCancelRequestType.NULL_VAL)
            {
                return this;
            }
        }
        return massCancelRequestType(value.representation());
    }

    private char massCancelResponse;

    private boolean hasMassCancelResponse;

    public boolean hasMassCancelResponse()
    {
        return hasMassCancelResponse;
    }

    public OrderMassCancelReportEncoder massCancelResponse(char value)
    {
        massCancelResponse = value;
        hasMassCancelResponse = true;
        return this;
    }

    public char massCancelResponse()
    {
        return massCancelResponse;
    }

    public OrderMassCancelReportEncoder massCancelResponse(MassCancelResponse value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == MassCancelResponse.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: massCancelResponse Value: " + value );
            }
            if (value == MassCancelResponse.NULL_VAL)
            {
                return this;
            }
        }
        return massCancelResponse(value.representation());
    }

    private final MutableDirectBuffer massCancelRejectReason = new UnsafeBuffer();

    private int massCancelRejectReasonOffset = 0;

    private int massCancelRejectReasonLength = 0;

    public OrderMassCancelReportEncoder massCancelRejectReason(final DirectBuffer value, final int offset, final int length)
    {
        massCancelRejectReason.wrap(value);
        massCancelRejectReasonOffset = offset;
        massCancelRejectReasonLength = length;
        return this;
    }

    public OrderMassCancelReportEncoder massCancelRejectReason(final DirectBuffer value, final int length)
    {
        return massCancelRejectReason(value, 0, length);
    }

    public OrderMassCancelReportEncoder massCancelRejectReason(final DirectBuffer value)
    {
        return massCancelRejectReason(value, 0, value.capacity());
    }

    public OrderMassCancelReportEncoder massCancelRejectReason(final byte[] value, final int offset, final int length)
    {
        massCancelRejectReason.wrap(value);
        massCancelRejectReasonOffset = offset;
        massCancelRejectReasonLength = length;
        return this;
    }

    public OrderMassCancelReportEncoder massCancelRejectReasonAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(massCancelRejectReason, value, offset, length);
        massCancelRejectReasonOffset = offset;
        massCancelRejectReasonLength = length;
        return this;
    }

    public OrderMassCancelReportEncoder massCancelRejectReason(final byte[] value, final int length)
    {
        return massCancelRejectReason(value, 0, length);
    }

    public OrderMassCancelReportEncoder massCancelRejectReason(final byte[] value)
    {
        return massCancelRejectReason(value, 0, value.length);
    }

    public boolean hasMassCancelRejectReason()
    {
        return massCancelRejectReasonLength > 0;
    }

    public MutableDirectBuffer massCancelRejectReason()
    {
        return massCancelRejectReason;
    }

    public String massCancelRejectReasonAsString()
    {
        return massCancelRejectReason.getStringWithoutLengthAscii(massCancelRejectReasonOffset, massCancelRejectReasonLength);
    }

    public OrderMassCancelReportEncoder massCancelRejectReason(final CharSequence value)
    {
        toBytes(value, massCancelRejectReason);
        massCancelRejectReasonOffset = 0;
        massCancelRejectReasonLength = value.length();
        return this;
    }

    public OrderMassCancelReportEncoder massCancelRejectReason(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            massCancelRejectReason.wrap(buffer);
            massCancelRejectReasonOffset = value.offset();
            massCancelRejectReasonLength = value.length();
        }
        return this;
    }

    public OrderMassCancelReportEncoder massCancelRejectReason(final char[] value)
    {
        return massCancelRejectReason(value, 0, value.length);
    }

    public OrderMassCancelReportEncoder massCancelRejectReason(final char[] value, final int length)
    {
        return massCancelRejectReason(value, 0, length);
    }

    public OrderMassCancelReportEncoder massCancelRejectReason(final char[] value, final int offset, final int length)
    {
        toBytes(value, massCancelRejectReason, offset, length);
        massCancelRejectReasonOffset = 0;
        massCancelRejectReasonLength = length;
        return this;
    }

    public OrderMassCancelReportEncoder massCancelRejectReason(MassCancelRejectReason value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == MassCancelRejectReason.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: massCancelRejectReason Value: " + value );
            }
            if (value == MassCancelRejectReason.NULL_VAL)
            {
                return this;
            }
        }
        return massCancelRejectReason(value.representation());
    }

    private int totalAffectedOrders;

    private boolean hasTotalAffectedOrders;

    public boolean hasTotalAffectedOrders()
    {
        return hasTotalAffectedOrders;
    }

    public OrderMassCancelReportEncoder totalAffectedOrders(int value)
    {
        totalAffectedOrders = value;
        hasTotalAffectedOrders = true;
        return this;
    }

    public int totalAffectedOrders()
    {
        return totalAffectedOrders;
    }



public static class AffectedOrdersGroupEncoder
{
    private AffectedOrdersGroupEncoder next = null;

    public AffectedOrdersGroupEncoder next()
    {
        if (next == null)
        {
            next = new AffectedOrdersGroupEncoder();
        }
        return next;
    }

    private static final int origClOrdIDHeaderLength = 3;
    private static final byte[] origClOrdIDHeader = new byte[] {52, 49, (byte) '='};

    private static final int affectedOrderIDHeaderLength = 4;
    private static final byte[] affectedOrderIDHeader = new byte[] {53, 51, 53, (byte) '='};

    private static final int affectedSecondaryOrderIDHeaderLength = 4;
    private static final byte[] affectedSecondaryOrderIDHeader = new byte[] {53, 51, 54, (byte) '='};

    private final MutableDirectBuffer origClOrdID = new UnsafeBuffer();

    private int origClOrdIDOffset = 0;

    private int origClOrdIDLength = 0;

    public AffectedOrdersGroupEncoder origClOrdID(final DirectBuffer value, final int offset, final int length)
    {
        origClOrdID.wrap(value);
        origClOrdIDOffset = offset;
        origClOrdIDLength = length;
        return this;
    }

    public AffectedOrdersGroupEncoder origClOrdID(final DirectBuffer value, final int length)
    {
        return origClOrdID(value, 0, length);
    }

    public AffectedOrdersGroupEncoder origClOrdID(final DirectBuffer value)
    {
        return origClOrdID(value, 0, value.capacity());
    }

    public AffectedOrdersGroupEncoder origClOrdID(final byte[] value, final int offset, final int length)
    {
        origClOrdID.wrap(value);
        origClOrdIDOffset = offset;
        origClOrdIDLength = length;
        return this;
    }

    public AffectedOrdersGroupEncoder origClOrdIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(origClOrdID, value, offset, length);
        origClOrdIDOffset = offset;
        origClOrdIDLength = length;
        return this;
    }

    public AffectedOrdersGroupEncoder origClOrdID(final byte[] value, final int length)
    {
        return origClOrdID(value, 0, length);
    }

    public AffectedOrdersGroupEncoder origClOrdID(final byte[] value)
    {
        return origClOrdID(value, 0, value.length);
    }

    public boolean hasOrigClOrdID()
    {
        return origClOrdIDLength > 0;
    }

    public MutableDirectBuffer origClOrdID()
    {
        return origClOrdID;
    }

    public String origClOrdIDAsString()
    {
        return origClOrdID.getStringWithoutLengthAscii(origClOrdIDOffset, origClOrdIDLength);
    }

    public AffectedOrdersGroupEncoder origClOrdID(final CharSequence value)
    {
        toBytes(value, origClOrdID);
        origClOrdIDOffset = 0;
        origClOrdIDLength = value.length();
        return this;
    }

    public AffectedOrdersGroupEncoder origClOrdID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            origClOrdID.wrap(buffer);
            origClOrdIDOffset = value.offset();
            origClOrdIDLength = value.length();
        }
        return this;
    }

    public AffectedOrdersGroupEncoder origClOrdID(final char[] value)
    {
        return origClOrdID(value, 0, value.length);
    }

    public AffectedOrdersGroupEncoder origClOrdID(final char[] value, final int length)
    {
        return origClOrdID(value, 0, length);
    }

    public AffectedOrdersGroupEncoder origClOrdID(final char[] value, final int offset, final int length)
    {
        toBytes(value, origClOrdID, offset, length);
        origClOrdIDOffset = 0;
        origClOrdIDLength = length;
        return this;
    }

    private final MutableDirectBuffer affectedOrderID = new UnsafeBuffer();

    private int affectedOrderIDOffset = 0;

    private int affectedOrderIDLength = 0;

    public AffectedOrdersGroupEncoder affectedOrderID(final DirectBuffer value, final int offset, final int length)
    {
        affectedOrderID.wrap(value);
        affectedOrderIDOffset = offset;
        affectedOrderIDLength = length;
        return this;
    }

    public AffectedOrdersGroupEncoder affectedOrderID(final DirectBuffer value, final int length)
    {
        return affectedOrderID(value, 0, length);
    }

    public AffectedOrdersGroupEncoder affectedOrderID(final DirectBuffer value)
    {
        return affectedOrderID(value, 0, value.capacity());
    }

    public AffectedOrdersGroupEncoder affectedOrderID(final byte[] value, final int offset, final int length)
    {
        affectedOrderID.wrap(value);
        affectedOrderIDOffset = offset;
        affectedOrderIDLength = length;
        return this;
    }

    public AffectedOrdersGroupEncoder affectedOrderIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(affectedOrderID, value, offset, length);
        affectedOrderIDOffset = offset;
        affectedOrderIDLength = length;
        return this;
    }

    public AffectedOrdersGroupEncoder affectedOrderID(final byte[] value, final int length)
    {
        return affectedOrderID(value, 0, length);
    }

    public AffectedOrdersGroupEncoder affectedOrderID(final byte[] value)
    {
        return affectedOrderID(value, 0, value.length);
    }

    public boolean hasAffectedOrderID()
    {
        return affectedOrderIDLength > 0;
    }

    public MutableDirectBuffer affectedOrderID()
    {
        return affectedOrderID;
    }

    public String affectedOrderIDAsString()
    {
        return affectedOrderID.getStringWithoutLengthAscii(affectedOrderIDOffset, affectedOrderIDLength);
    }

    public AffectedOrdersGroupEncoder affectedOrderID(final CharSequence value)
    {
        toBytes(value, affectedOrderID);
        affectedOrderIDOffset = 0;
        affectedOrderIDLength = value.length();
        return this;
    }

    public AffectedOrdersGroupEncoder affectedOrderID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            affectedOrderID.wrap(buffer);
            affectedOrderIDOffset = value.offset();
            affectedOrderIDLength = value.length();
        }
        return this;
    }

    public AffectedOrdersGroupEncoder affectedOrderID(final char[] value)
    {
        return affectedOrderID(value, 0, value.length);
    }

    public AffectedOrdersGroupEncoder affectedOrderID(final char[] value, final int length)
    {
        return affectedOrderID(value, 0, length);
    }

    public AffectedOrdersGroupEncoder affectedOrderID(final char[] value, final int offset, final int length)
    {
        toBytes(value, affectedOrderID, offset, length);
        affectedOrderIDOffset = 0;
        affectedOrderIDLength = length;
        return this;
    }

    private final MutableDirectBuffer affectedSecondaryOrderID = new UnsafeBuffer();

    private int affectedSecondaryOrderIDOffset = 0;

    private int affectedSecondaryOrderIDLength = 0;

    public AffectedOrdersGroupEncoder affectedSecondaryOrderID(final DirectBuffer value, final int offset, final int length)
    {
        affectedSecondaryOrderID.wrap(value);
        affectedSecondaryOrderIDOffset = offset;
        affectedSecondaryOrderIDLength = length;
        return this;
    }

    public AffectedOrdersGroupEncoder affectedSecondaryOrderID(final DirectBuffer value, final int length)
    {
        return affectedSecondaryOrderID(value, 0, length);
    }

    public AffectedOrdersGroupEncoder affectedSecondaryOrderID(final DirectBuffer value)
    {
        return affectedSecondaryOrderID(value, 0, value.capacity());
    }

    public AffectedOrdersGroupEncoder affectedSecondaryOrderID(final byte[] value, final int offset, final int length)
    {
        affectedSecondaryOrderID.wrap(value);
        affectedSecondaryOrderIDOffset = offset;
        affectedSecondaryOrderIDLength = length;
        return this;
    }

    public AffectedOrdersGroupEncoder affectedSecondaryOrderIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(affectedSecondaryOrderID, value, offset, length);
        affectedSecondaryOrderIDOffset = offset;
        affectedSecondaryOrderIDLength = length;
        return this;
    }

    public AffectedOrdersGroupEncoder affectedSecondaryOrderID(final byte[] value, final int length)
    {
        return affectedSecondaryOrderID(value, 0, length);
    }

    public AffectedOrdersGroupEncoder affectedSecondaryOrderID(final byte[] value)
    {
        return affectedSecondaryOrderID(value, 0, value.length);
    }

    public boolean hasAffectedSecondaryOrderID()
    {
        return affectedSecondaryOrderIDLength > 0;
    }

    public MutableDirectBuffer affectedSecondaryOrderID()
    {
        return affectedSecondaryOrderID;
    }

    public String affectedSecondaryOrderIDAsString()
    {
        return affectedSecondaryOrderID.getStringWithoutLengthAscii(affectedSecondaryOrderIDOffset, affectedSecondaryOrderIDLength);
    }

    public AffectedOrdersGroupEncoder affectedSecondaryOrderID(final CharSequence value)
    {
        toBytes(value, affectedSecondaryOrderID);
        affectedSecondaryOrderIDOffset = 0;
        affectedSecondaryOrderIDLength = value.length();
        return this;
    }

    public AffectedOrdersGroupEncoder affectedSecondaryOrderID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            affectedSecondaryOrderID.wrap(buffer);
            affectedSecondaryOrderIDOffset = value.offset();
            affectedSecondaryOrderIDLength = value.length();
        }
        return this;
    }

    public AffectedOrdersGroupEncoder affectedSecondaryOrderID(final char[] value)
    {
        return affectedSecondaryOrderID(value, 0, value.length);
    }

    public AffectedOrdersGroupEncoder affectedSecondaryOrderID(final char[] value, final int length)
    {
        return affectedSecondaryOrderID(value, 0, length);
    }

    public AffectedOrdersGroupEncoder affectedSecondaryOrderID(final char[] value, final int offset, final int length)
    {
        toBytes(value, affectedSecondaryOrderID, offset, length);
        affectedSecondaryOrderIDOffset = 0;
        affectedSecondaryOrderIDLength = length;
        return this;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (origClOrdIDLength > 0)
        {
            buffer.putBytes(position, origClOrdIDHeader, 0, origClOrdIDHeaderLength);
            position += origClOrdIDHeaderLength;
            buffer.putBytes(position, origClOrdID, origClOrdIDOffset, origClOrdIDLength);
            position += origClOrdIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (affectedOrderIDLength > 0)
        {
            buffer.putBytes(position, affectedOrderIDHeader, 0, affectedOrderIDHeaderLength);
            position += affectedOrderIDHeaderLength;
            buffer.putBytes(position, affectedOrderID, affectedOrderIDOffset, affectedOrderIDLength);
            position += affectedOrderIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (affectedSecondaryOrderIDLength > 0)
        {
            buffer.putBytes(position, affectedSecondaryOrderIDHeader, 0, affectedSecondaryOrderIDHeaderLength);
            position += affectedSecondaryOrderIDHeaderLength;
            buffer.putBytes(position, affectedSecondaryOrderID, affectedSecondaryOrderIDOffset, affectedSecondaryOrderIDLength);
            position += affectedSecondaryOrderIDLength;
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
        this.resetOrigClOrdID();
        this.resetAffectedOrderID();
        this.resetAffectedSecondaryOrderID();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetOrigClOrdID()
    {
        origClOrdIDLength = 0;
    }

    public void resetAffectedOrderID()
    {
        affectedOrderIDLength = 0;
    }

    public void resetAffectedSecondaryOrderID()
    {
        affectedSecondaryOrderIDLength = 0;
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
            appendBuffer(builder, origClOrdID, origClOrdIDOffset, origClOrdIDLength);
            builder.append("\",\n");
        }

        if (hasAffectedOrderID())
        {
            indent(builder, level);
            builder.append("\"AffectedOrderID\": \"");
            appendBuffer(builder, affectedOrderID, affectedOrderIDOffset, affectedOrderIDLength);
            builder.append("\",\n");
        }

        if (hasAffectedSecondaryOrderID())
        {
            indent(builder, level);
            builder.append("\"AffectedSecondaryOrderID\": \"");
            appendBuffer(builder, affectedSecondaryOrderID, affectedSecondaryOrderIDOffset, affectedSecondaryOrderIDLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public AffectedOrdersGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((AffectedOrdersGroupEncoder)encoder);
    }

    public AffectedOrdersGroupEncoder copyTo(final AffectedOrdersGroupEncoder encoder)
    {
        encoder.reset();
        if (hasOrigClOrdID())
        {
            encoder.origClOrdIDAsCopy(origClOrdID.byteArray(), 0, origClOrdIDLength);
        }

        if (hasAffectedOrderID())
        {
            encoder.affectedOrderIDAsCopy(affectedOrderID.byteArray(), 0, affectedOrderIDLength);
        }

        if (hasAffectedSecondaryOrderID())
        {
            encoder.affectedSecondaryOrderIDAsCopy(affectedSecondaryOrderID.byteArray(), 0, affectedSecondaryOrderIDLength);
        }
        return encoder;
    }

}
    private int noAffectedOrdersGroupCounter;

    private boolean hasNoAffectedOrdersGroupCounter;

    public boolean hasNoAffectedOrdersGroupCounter()
    {
        return hasNoAffectedOrdersGroupCounter;
    }

    public OrderMassCancelReportEncoder noAffectedOrdersGroupCounter(int value)
    {
        noAffectedOrdersGroupCounter = value;
        hasNoAffectedOrdersGroupCounter = true;
        return this;
    }

    public int noAffectedOrdersGroupCounter()
    {
        return noAffectedOrdersGroupCounter;
    }


    private AffectedOrdersGroupEncoder affectedOrdersGroup = null;

    public AffectedOrdersGroupEncoder affectedOrdersGroup(final int numberOfElements)
    {
        hasNoAffectedOrdersGroupCounter = true;
        noAffectedOrdersGroupCounter = numberOfElements;
        if (affectedOrdersGroup == null)
        {
            affectedOrdersGroup = new AffectedOrdersGroupEncoder();
        }
        return affectedOrdersGroup;
    }

    private final MutableDirectBuffer tradingSessionID = new UnsafeBuffer();

    private int tradingSessionIDOffset = 0;

    private int tradingSessionIDLength = 0;

    public OrderMassCancelReportEncoder tradingSessionID(final DirectBuffer value, final int offset, final int length)
    {
        tradingSessionID.wrap(value);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public OrderMassCancelReportEncoder tradingSessionID(final DirectBuffer value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public OrderMassCancelReportEncoder tradingSessionID(final DirectBuffer value)
    {
        return tradingSessionID(value, 0, value.capacity());
    }

    public OrderMassCancelReportEncoder tradingSessionID(final byte[] value, final int offset, final int length)
    {
        tradingSessionID.wrap(value);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public OrderMassCancelReportEncoder tradingSessionIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradingSessionID, value, offset, length);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public OrderMassCancelReportEncoder tradingSessionID(final byte[] value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public OrderMassCancelReportEncoder tradingSessionID(final byte[] value)
    {
        return tradingSessionID(value, 0, value.length);
    }

    public boolean hasTradingSessionID()
    {
        return tradingSessionIDLength > 0;
    }

    public MutableDirectBuffer tradingSessionID()
    {
        return tradingSessionID;
    }

    public String tradingSessionIDAsString()
    {
        return tradingSessionID.getStringWithoutLengthAscii(tradingSessionIDOffset, tradingSessionIDLength);
    }

    public OrderMassCancelReportEncoder tradingSessionID(final CharSequence value)
    {
        toBytes(value, tradingSessionID);
        tradingSessionIDOffset = 0;
        tradingSessionIDLength = value.length();
        return this;
    }

    public OrderMassCancelReportEncoder tradingSessionID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            tradingSessionID.wrap(buffer);
            tradingSessionIDOffset = value.offset();
            tradingSessionIDLength = value.length();
        }
        return this;
    }

    public OrderMassCancelReportEncoder tradingSessionID(final char[] value)
    {
        return tradingSessionID(value, 0, value.length);
    }

    public OrderMassCancelReportEncoder tradingSessionID(final char[] value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public OrderMassCancelReportEncoder tradingSessionID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradingSessionID, offset, length);
        tradingSessionIDOffset = 0;
        tradingSessionIDLength = length;
        return this;
    }

    private final MutableDirectBuffer tradingSessionSubID = new UnsafeBuffer();

    private int tradingSessionSubIDOffset = 0;

    private int tradingSessionSubIDLength = 0;

    public OrderMassCancelReportEncoder tradingSessionSubID(final DirectBuffer value, final int offset, final int length)
    {
        tradingSessionSubID.wrap(value);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public OrderMassCancelReportEncoder tradingSessionSubID(final DirectBuffer value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public OrderMassCancelReportEncoder tradingSessionSubID(final DirectBuffer value)
    {
        return tradingSessionSubID(value, 0, value.capacity());
    }

    public OrderMassCancelReportEncoder tradingSessionSubID(final byte[] value, final int offset, final int length)
    {
        tradingSessionSubID.wrap(value);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public OrderMassCancelReportEncoder tradingSessionSubIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradingSessionSubID, value, offset, length);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public OrderMassCancelReportEncoder tradingSessionSubID(final byte[] value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public OrderMassCancelReportEncoder tradingSessionSubID(final byte[] value)
    {
        return tradingSessionSubID(value, 0, value.length);
    }

    public boolean hasTradingSessionSubID()
    {
        return tradingSessionSubIDLength > 0;
    }

    public MutableDirectBuffer tradingSessionSubID()
    {
        return tradingSessionSubID;
    }

    public String tradingSessionSubIDAsString()
    {
        return tradingSessionSubID.getStringWithoutLengthAscii(tradingSessionSubIDOffset, tradingSessionSubIDLength);
    }

    public OrderMassCancelReportEncoder tradingSessionSubID(final CharSequence value)
    {
        toBytes(value, tradingSessionSubID);
        tradingSessionSubIDOffset = 0;
        tradingSessionSubIDLength = value.length();
        return this;
    }

    public OrderMassCancelReportEncoder tradingSessionSubID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            tradingSessionSubID.wrap(buffer);
            tradingSessionSubIDOffset = value.offset();
            tradingSessionSubIDLength = value.length();
        }
        return this;
    }

    public OrderMassCancelReportEncoder tradingSessionSubID(final char[] value)
    {
        return tradingSessionSubID(value, 0, value.length);
    }

    public OrderMassCancelReportEncoder tradingSessionSubID(final char[] value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public OrderMassCancelReportEncoder tradingSessionSubID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradingSessionSubID, offset, length);
        tradingSessionSubIDOffset = 0;
        tradingSessionSubIDLength = length;
        return this;
    }

    private final InstrumentEncoder instrument = new InstrumentEncoder();
    public InstrumentEncoder instrument()
    {
        return instrument;
    }

    private final UnderlyingInstrumentEncoder underlyingInstrument = new UnderlyingInstrumentEncoder();
    public UnderlyingInstrumentEncoder underlyingInstrument()
    {
        return underlyingInstrument;
    }

    private char side;

    private boolean hasSide;

    public boolean hasSide()
    {
        return hasSide;
    }

    public OrderMassCancelReportEncoder side(char value)
    {
        side = value;
        hasSide = true;
        return this;
    }

    public char side()
    {
        return side;
    }

    public OrderMassCancelReportEncoder side(Side value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == Side.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: side Value: " + value );
            }
            if (value == Side.NULL_VAL)
            {
                return this;
            }
        }
        return side(value.representation());
    }

    private final MutableDirectBuffer transactTime = new UnsafeBuffer();

    private int transactTimeOffset = 0;

    private int transactTimeLength = 0;

    public OrderMassCancelReportEncoder transactTime(final DirectBuffer value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public OrderMassCancelReportEncoder transactTime(final DirectBuffer value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public OrderMassCancelReportEncoder transactTime(final DirectBuffer value)
    {
        return transactTime(value, 0, value.capacity());
    }

    public OrderMassCancelReportEncoder transactTime(final byte[] value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public OrderMassCancelReportEncoder transactTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(transactTime, value, offset, length);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public OrderMassCancelReportEncoder transactTime(final byte[] value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public OrderMassCancelReportEncoder transactTime(final byte[] value)
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

    private final MutableDirectBuffer text = new UnsafeBuffer();

    private int textOffset = 0;

    private int textLength = 0;

    public OrderMassCancelReportEncoder text(final DirectBuffer value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public OrderMassCancelReportEncoder text(final DirectBuffer value, final int length)
    {
        return text(value, 0, length);
    }

    public OrderMassCancelReportEncoder text(final DirectBuffer value)
    {
        return text(value, 0, value.capacity());
    }

    public OrderMassCancelReportEncoder text(final byte[] value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public OrderMassCancelReportEncoder textAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(text, value, offset, length);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public OrderMassCancelReportEncoder text(final byte[] value, final int length)
    {
        return text(value, 0, length);
    }

    public OrderMassCancelReportEncoder text(final byte[] value)
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

    public OrderMassCancelReportEncoder text(final CharSequence value)
    {
        toBytes(value, text);
        textOffset = 0;
        textLength = value.length();
        return this;
    }

    public OrderMassCancelReportEncoder text(final AsciiSequenceView value)
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

    public OrderMassCancelReportEncoder text(final char[] value)
    {
        return text(value, 0, value.length);
    }

    public OrderMassCancelReportEncoder text(final char[] value, final int length)
    {
        return text(value, 0, length);
    }

    public OrderMassCancelReportEncoder text(final char[] value, final int offset, final int length)
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

    public OrderMassCancelReportEncoder encodedTextLen(int value)
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

    public OrderMassCancelReportEncoder encodedText(byte[] value)
    {
        encodedText = value;
        hasEncodedText = true;
        return this;
    }

    public byte[] encodedText()
    {
        return encodedText;
    }

    public OrderMassCancelReportEncoder encodedTextAsCopy(final byte[] value, final int offset, final int length)
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

        if (orderIDLength > 0)
        {
            buffer.putBytes(position, orderIDHeader, 0, orderIDHeaderLength);
            position += orderIDHeaderLength;
            buffer.putBytes(position, orderID, orderIDOffset, orderIDLength);
            position += orderIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: OrderID");
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

        if (hasMassCancelRequestType)
        {
            buffer.putBytes(position, massCancelRequestTypeHeader, 0, massCancelRequestTypeHeaderLength);
            position += massCancelRequestTypeHeaderLength;
            position += buffer.putCharAscii(position, massCancelRequestType);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: MassCancelRequestType");
        }

        if (hasMassCancelResponse)
        {
            buffer.putBytes(position, massCancelResponseHeader, 0, massCancelResponseHeaderLength);
            position += massCancelResponseHeaderLength;
            position += buffer.putCharAscii(position, massCancelResponse);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: MassCancelResponse");
        }

        if (massCancelRejectReasonLength > 0)
        {
            buffer.putBytes(position, massCancelRejectReasonHeader, 0, massCancelRejectReasonHeaderLength);
            position += massCancelRejectReasonHeaderLength;
            buffer.putBytes(position, massCancelRejectReason, massCancelRejectReasonOffset, massCancelRejectReasonLength);
            position += massCancelRejectReasonLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasTotalAffectedOrders)
        {
            buffer.putBytes(position, totalAffectedOrdersHeader, 0, totalAffectedOrdersHeaderLength);
            position += totalAffectedOrdersHeaderLength;
            position += buffer.putIntAscii(position, totalAffectedOrders);
            buffer.putSeparator(position);
            position++;
        }

        if (hasNoAffectedOrdersGroupCounter)
        {
            buffer.putBytes(position, noAffectedOrdersGroupCounterHeader, 0, noAffectedOrdersGroupCounterHeaderLength);
            position += noAffectedOrdersGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noAffectedOrdersGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (affectedOrdersGroup != null)
        {
            position += affectedOrdersGroup.encode(buffer, position, noAffectedOrdersGroupCounter);
        }


        if (tradingSessionIDLength > 0)
        {
            buffer.putBytes(position, tradingSessionIDHeader, 0, tradingSessionIDHeaderLength);
            position += tradingSessionIDHeaderLength;
            buffer.putBytes(position, tradingSessionID, tradingSessionIDOffset, tradingSessionIDLength);
            position += tradingSessionIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (tradingSessionSubIDLength > 0)
        {
            buffer.putBytes(position, tradingSessionSubIDHeader, 0, tradingSessionSubIDHeaderLength);
            position += tradingSessionSubIDHeaderLength;
            buffer.putBytes(position, tradingSessionSubID, tradingSessionSubIDOffset, tradingSessionSubIDLength);
            position += tradingSessionSubIDLength;
            buffer.putSeparator(position);
            position++;
        }

            position += instrument.encode(buffer, position);

            position += underlyingInstrument.encode(buffer, position);

        if (hasSide)
        {
            buffer.putBytes(position, sideHeader, 0, sideHeaderLength);
            position += sideHeaderLength;
            position += buffer.putCharAscii(position, side);
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
        this.resetClOrdID();
        this.resetSecondaryClOrdID();
        this.resetOrderID();
        this.resetSecondaryOrderID();
        this.resetMassCancelRequestType();
        this.resetMassCancelResponse();
        this.resetMassCancelRejectReason();
        this.resetTotalAffectedOrders();
        this.resetTradingSessionID();
        this.resetTradingSessionSubID();
        this.resetSide();
        this.resetTransactTime();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        instrument.reset();
        underlyingInstrument.reset();
        this.resetAffectedOrdersGroup();
    }

    public void resetClOrdID()
    {
        clOrdIDLength = 0;
    }

    public void resetSecondaryClOrdID()
    {
        secondaryClOrdIDLength = 0;
    }

    public void resetOrderID()
    {
        orderIDLength = 0;
    }

    public void resetSecondaryOrderID()
    {
        secondaryOrderIDLength = 0;
    }

    public void resetMassCancelRequestType()
    {
        massCancelRequestType = MISSING_CHAR;
    }

    public void resetMassCancelResponse()
    {
        massCancelResponse = MISSING_CHAR;
    }

    public void resetMassCancelRejectReason()
    {
        massCancelRejectReasonLength = 0;
    }

    public void resetTotalAffectedOrders()
    {
        hasTotalAffectedOrders = false;
    }

    public void resetTradingSessionID()
    {
        tradingSessionIDLength = 0;
    }

    public void resetTradingSessionSubID()
    {
        tradingSessionSubIDLength = 0;
    }

    public void resetSide()
    {
        hasSide = false;
    }

    public void resetTransactTime()
    {
        transactTimeLength = 0;
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

    public void resetAffectedOrdersGroup()
    {
        if (affectedOrdersGroup != null)
        {
            affectedOrdersGroup.reset();
        }
        noAffectedOrdersGroupCounter = 0;
        hasNoAffectedOrdersGroupCounter = false;
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
        builder.append("\"MessageName\": \"OrderMassCancelReport\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
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

        if (hasMassCancelRequestType())
        {
            indent(builder, level);
            builder.append("\"MassCancelRequestType\": \"");
            builder.append(massCancelRequestType);
            builder.append("\",\n");
        }

        if (hasMassCancelResponse())
        {
            indent(builder, level);
            builder.append("\"MassCancelResponse\": \"");
            builder.append(massCancelResponse);
            builder.append("\",\n");
        }

        if (hasMassCancelRejectReason())
        {
            indent(builder, level);
            builder.append("\"MassCancelRejectReason\": \"");
            appendBuffer(builder, massCancelRejectReason, massCancelRejectReasonOffset, massCancelRejectReasonLength);
            builder.append("\",\n");
        }

        if (hasTotalAffectedOrders())
        {
            indent(builder, level);
            builder.append("\"TotalAffectedOrders\": \"");
            builder.append(totalAffectedOrders);
            builder.append("\",\n");
        }

        if (hasNoAffectedOrdersGroupCounter)
        {
            indent(builder, level);
            builder.append("\"AffectedOrdersGroup\": [\n");
            final int noAffectedOrdersGroupCounter = this.noAffectedOrdersGroupCounter;
            AffectedOrdersGroupEncoder affectedOrdersGroup = this.affectedOrdersGroup;
            for (int i = 0; i < noAffectedOrdersGroupCounter; i++)
            {
                indent(builder, level);
                affectedOrdersGroup.appendTo(builder, level + 1);
                if (i < (noAffectedOrdersGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                affectedOrdersGroup = affectedOrdersGroup.next();
            }
            indent(builder, level);
            builder.append("],\n");
        }

        if (hasTradingSessionID())
        {
            indent(builder, level);
            builder.append("\"TradingSessionID\": \"");
            appendBuffer(builder, tradingSessionID, tradingSessionIDOffset, tradingSessionIDLength);
            builder.append("\",\n");
        }

        if (hasTradingSessionSubID())
        {
            indent(builder, level);
            builder.append("\"TradingSessionSubID\": \"");
            appendBuffer(builder, tradingSessionSubID, tradingSessionSubIDOffset, tradingSessionSubIDLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"Instrument\": ");
    instrument.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"UnderlyingInstrument\": ");
    underlyingInstrument.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasSide())
        {
            indent(builder, level);
            builder.append("\"Side\": \"");
            builder.append(side);
            builder.append("\",\n");
        }

        if (hasTransactTime())
        {
            indent(builder, level);
            builder.append("\"TransactTime\": \"");
            appendBuffer(builder, transactTime, transactTimeOffset, transactTimeLength);
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
    public OrderMassCancelReportEncoder copyTo(final Encoder encoder)
    {
        return copyTo((OrderMassCancelReportEncoder)encoder);
    }

    public OrderMassCancelReportEncoder copyTo(final OrderMassCancelReportEncoder encoder)
    {
        encoder.reset();
        if (hasClOrdID())
        {
            encoder.clOrdIDAsCopy(clOrdID.byteArray(), 0, clOrdIDLength);
        }

        if (hasSecondaryClOrdID())
        {
            encoder.secondaryClOrdIDAsCopy(secondaryClOrdID.byteArray(), 0, secondaryClOrdIDLength);
        }

        if (hasOrderID())
        {
            encoder.orderIDAsCopy(orderID.byteArray(), 0, orderIDLength);
        }

        if (hasSecondaryOrderID())
        {
            encoder.secondaryOrderIDAsCopy(secondaryOrderID.byteArray(), 0, secondaryOrderIDLength);
        }

        if (hasMassCancelRequestType())
        {
            encoder.massCancelRequestType(this.massCancelRequestType());
        }

        if (hasMassCancelResponse())
        {
            encoder.massCancelResponse(this.massCancelResponse());
        }

        if (hasMassCancelRejectReason())
        {
            encoder.massCancelRejectReasonAsCopy(massCancelRejectReason.byteArray(), 0, massCancelRejectReasonLength);
        }

        if (hasTotalAffectedOrders())
        {
            encoder.totalAffectedOrders(this.totalAffectedOrders());
        }

        if (hasNoAffectedOrdersGroupCounter)
        {
            final int size = this.noAffectedOrdersGroupCounter;
            AffectedOrdersGroupEncoder affectedOrdersGroup = this.affectedOrdersGroup;
            AffectedOrdersGroupEncoder affectedOrdersGroupEncoder = encoder.affectedOrdersGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (affectedOrdersGroup != null)
                {
                    affectedOrdersGroup.copyTo(affectedOrdersGroupEncoder);
                    affectedOrdersGroup = affectedOrdersGroup.next();
                    affectedOrdersGroupEncoder = affectedOrdersGroupEncoder.next();
                }
            }
        }

        if (hasTradingSessionID())
        {
            encoder.tradingSessionIDAsCopy(tradingSessionID.byteArray(), 0, tradingSessionIDLength);
        }

        if (hasTradingSessionSubID())
        {
            encoder.tradingSessionSubIDAsCopy(tradingSessionSubID.byteArray(), 0, tradingSessionSubIDLength);
        }


        instrument.copyTo(encoder.instrument());

        underlyingInstrument.copyTo(encoder.underlyingInstrument());
        if (hasSide())
        {
            encoder.side(this.side());
        }

        if (hasTransactTime())
        {
            encoder.transactTimeAsCopy(transactTime.byteArray(), 0, transactTimeLength);
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
