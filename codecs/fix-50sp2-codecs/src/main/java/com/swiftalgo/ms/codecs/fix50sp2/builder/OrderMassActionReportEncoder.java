/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2.builder;

import org.agrona.MutableDirectBuffer;
import org.agrona.AsciiSequenceView;
import static uk.co.real_logic.artio.dictionary.generation.CodecUtil.*;
import static uk.co.real_logic.artio.dictionary.SessionConstants.*;
import uk.co.real_logic.artio.builder.Encoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.HeaderEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.TrailerEncoder;
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


public class OrderMassActionReportEncoder implements Encoder
{
    public long messageType()
    {
        return 23106L;
    }

    public OrderMassActionReportEncoder()
    {
        header.msgType("BZ");
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

    private static final int massActionReportIDHeaderLength = 5;
    private static final byte[] massActionReportIDHeader = new byte[] {49, 51, 54, 57, (byte) '='};

    private static final int massActionTypeHeaderLength = 5;
    private static final byte[] massActionTypeHeader = new byte[] {49, 51, 55, 51, (byte) '='};

    private static final int massActionScopeHeaderLength = 5;
    private static final byte[] massActionScopeHeader = new byte[] {49, 51, 55, 52, (byte) '='};

    private static final int massActionResponseHeaderLength = 5;
    private static final byte[] massActionResponseHeader = new byte[] {49, 51, 55, 53, (byte) '='};

    private static final int massActionRejectReasonHeaderLength = 5;
    private static final byte[] massActionRejectReasonHeader = new byte[] {49, 51, 55, 54, (byte) '='};

    private static final int totalAffectedOrdersHeaderLength = 4;
    private static final byte[] totalAffectedOrdersHeader = new byte[] {53, 51, 51, (byte) '='};

    private static final int marketIDHeaderLength = 5;
    private static final byte[] marketIDHeader = new byte[] {49, 51, 48, 49, (byte) '='};

    private static final int marketSegmentIDHeaderLength = 5;
    private static final byte[] marketSegmentIDHeader = new byte[] {49, 51, 48, 48, (byte) '='};

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

    public OrderMassActionReportEncoder clOrdID(final DirectBuffer value, final int offset, final int length)
    {
        clOrdID.wrap(value);
        clOrdIDOffset = offset;
        clOrdIDLength = length;
        return this;
    }

    public OrderMassActionReportEncoder clOrdID(final DirectBuffer value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    public OrderMassActionReportEncoder clOrdID(final DirectBuffer value)
    {
        return clOrdID(value, 0, value.capacity());
    }

    public OrderMassActionReportEncoder clOrdID(final byte[] value, final int offset, final int length)
    {
        clOrdID.wrap(value);
        clOrdIDOffset = offset;
        clOrdIDLength = length;
        return this;
    }

    public OrderMassActionReportEncoder clOrdIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(clOrdID, value, offset, length);
        clOrdIDOffset = offset;
        clOrdIDLength = length;
        return this;
    }

    public OrderMassActionReportEncoder clOrdID(final byte[] value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    public OrderMassActionReportEncoder clOrdID(final byte[] value)
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

    public OrderMassActionReportEncoder clOrdID(final CharSequence value)
    {
        toBytes(value, clOrdID);
        clOrdIDOffset = 0;
        clOrdIDLength = value.length();
        return this;
    }

    public OrderMassActionReportEncoder clOrdID(final AsciiSequenceView value)
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

    public OrderMassActionReportEncoder clOrdID(final char[] value)
    {
        return clOrdID(value, 0, value.length);
    }

    public OrderMassActionReportEncoder clOrdID(final char[] value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    public OrderMassActionReportEncoder clOrdID(final char[] value, final int offset, final int length)
    {
        toBytes(value, clOrdID, offset, length);
        clOrdIDOffset = 0;
        clOrdIDLength = length;
        return this;
    }

    private final MutableDirectBuffer secondaryClOrdID = new UnsafeBuffer();

    private int secondaryClOrdIDOffset = 0;

    private int secondaryClOrdIDLength = 0;

    public OrderMassActionReportEncoder secondaryClOrdID(final DirectBuffer value, final int offset, final int length)
    {
        secondaryClOrdID.wrap(value);
        secondaryClOrdIDOffset = offset;
        secondaryClOrdIDLength = length;
        return this;
    }

    public OrderMassActionReportEncoder secondaryClOrdID(final DirectBuffer value, final int length)
    {
        return secondaryClOrdID(value, 0, length);
    }

    public OrderMassActionReportEncoder secondaryClOrdID(final DirectBuffer value)
    {
        return secondaryClOrdID(value, 0, value.capacity());
    }

    public OrderMassActionReportEncoder secondaryClOrdID(final byte[] value, final int offset, final int length)
    {
        secondaryClOrdID.wrap(value);
        secondaryClOrdIDOffset = offset;
        secondaryClOrdIDLength = length;
        return this;
    }

    public OrderMassActionReportEncoder secondaryClOrdIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(secondaryClOrdID, value, offset, length);
        secondaryClOrdIDOffset = offset;
        secondaryClOrdIDLength = length;
        return this;
    }

    public OrderMassActionReportEncoder secondaryClOrdID(final byte[] value, final int length)
    {
        return secondaryClOrdID(value, 0, length);
    }

    public OrderMassActionReportEncoder secondaryClOrdID(final byte[] value)
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

    public OrderMassActionReportEncoder secondaryClOrdID(final CharSequence value)
    {
        toBytes(value, secondaryClOrdID);
        secondaryClOrdIDOffset = 0;
        secondaryClOrdIDLength = value.length();
        return this;
    }

    public OrderMassActionReportEncoder secondaryClOrdID(final AsciiSequenceView value)
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

    public OrderMassActionReportEncoder secondaryClOrdID(final char[] value)
    {
        return secondaryClOrdID(value, 0, value.length);
    }

    public OrderMassActionReportEncoder secondaryClOrdID(final char[] value, final int length)
    {
        return secondaryClOrdID(value, 0, length);
    }

    public OrderMassActionReportEncoder secondaryClOrdID(final char[] value, final int offset, final int length)
    {
        toBytes(value, secondaryClOrdID, offset, length);
        secondaryClOrdIDOffset = 0;
        secondaryClOrdIDLength = length;
        return this;
    }

    private final MutableDirectBuffer massActionReportID = new UnsafeBuffer();

    private int massActionReportIDOffset = 0;

    private int massActionReportIDLength = 0;

    public OrderMassActionReportEncoder massActionReportID(final DirectBuffer value, final int offset, final int length)
    {
        massActionReportID.wrap(value);
        massActionReportIDOffset = offset;
        massActionReportIDLength = length;
        return this;
    }

    public OrderMassActionReportEncoder massActionReportID(final DirectBuffer value, final int length)
    {
        return massActionReportID(value, 0, length);
    }

    public OrderMassActionReportEncoder massActionReportID(final DirectBuffer value)
    {
        return massActionReportID(value, 0, value.capacity());
    }

    public OrderMassActionReportEncoder massActionReportID(final byte[] value, final int offset, final int length)
    {
        massActionReportID.wrap(value);
        massActionReportIDOffset = offset;
        massActionReportIDLength = length;
        return this;
    }

    public OrderMassActionReportEncoder massActionReportIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(massActionReportID, value, offset, length);
        massActionReportIDOffset = offset;
        massActionReportIDLength = length;
        return this;
    }

    public OrderMassActionReportEncoder massActionReportID(final byte[] value, final int length)
    {
        return massActionReportID(value, 0, length);
    }

    public OrderMassActionReportEncoder massActionReportID(final byte[] value)
    {
        return massActionReportID(value, 0, value.length);
    }

    public boolean hasMassActionReportID()
    {
        return massActionReportIDLength > 0;
    }

    public MutableDirectBuffer massActionReportID()
    {
        return massActionReportID;
    }

    public String massActionReportIDAsString()
    {
        return massActionReportID.getStringWithoutLengthAscii(massActionReportIDOffset, massActionReportIDLength);
    }

    public OrderMassActionReportEncoder massActionReportID(final CharSequence value)
    {
        toBytes(value, massActionReportID);
        massActionReportIDOffset = 0;
        massActionReportIDLength = value.length();
        return this;
    }

    public OrderMassActionReportEncoder massActionReportID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            massActionReportID.wrap(buffer);
            massActionReportIDOffset = value.offset();
            massActionReportIDLength = value.length();
        }
        return this;
    }

    public OrderMassActionReportEncoder massActionReportID(final char[] value)
    {
        return massActionReportID(value, 0, value.length);
    }

    public OrderMassActionReportEncoder massActionReportID(final char[] value, final int length)
    {
        return massActionReportID(value, 0, length);
    }

    public OrderMassActionReportEncoder massActionReportID(final char[] value, final int offset, final int length)
    {
        toBytes(value, massActionReportID, offset, length);
        massActionReportIDOffset = 0;
        massActionReportIDLength = length;
        return this;
    }

    private int massActionType;

    private boolean hasMassActionType;

    public boolean hasMassActionType()
    {
        return hasMassActionType;
    }

    public OrderMassActionReportEncoder massActionType(int value)
    {
        massActionType = value;
        hasMassActionType = true;
        return this;
    }

    public int massActionType()
    {
        return massActionType;
    }

    public OrderMassActionReportEncoder massActionType(MassActionType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == MassActionType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: massActionType Value: " + value );
            }
            if (value == MassActionType.NULL_VAL)
            {
                return this;
            }
        }
        return massActionType(value.representation());
    }

    private int massActionScope;

    private boolean hasMassActionScope;

    public boolean hasMassActionScope()
    {
        return hasMassActionScope;
    }

    public OrderMassActionReportEncoder massActionScope(int value)
    {
        massActionScope = value;
        hasMassActionScope = true;
        return this;
    }

    public int massActionScope()
    {
        return massActionScope;
    }

    public OrderMassActionReportEncoder massActionScope(MassActionScope value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == MassActionScope.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: massActionScope Value: " + value );
            }
            if (value == MassActionScope.NULL_VAL)
            {
                return this;
            }
        }
        return massActionScope(value.representation());
    }

    private int massActionResponse;

    private boolean hasMassActionResponse;

    public boolean hasMassActionResponse()
    {
        return hasMassActionResponse;
    }

    public OrderMassActionReportEncoder massActionResponse(int value)
    {
        massActionResponse = value;
        hasMassActionResponse = true;
        return this;
    }

    public int massActionResponse()
    {
        return massActionResponse;
    }

    public OrderMassActionReportEncoder massActionResponse(MassActionResponse value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == MassActionResponse.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: massActionResponse Value: " + value );
            }
            if (value == MassActionResponse.NULL_VAL)
            {
                return this;
            }
        }
        return massActionResponse(value.representation());
    }

    private int massActionRejectReason;

    private boolean hasMassActionRejectReason;

    public boolean hasMassActionRejectReason()
    {
        return hasMassActionRejectReason;
    }

    public OrderMassActionReportEncoder massActionRejectReason(int value)
    {
        massActionRejectReason = value;
        hasMassActionRejectReason = true;
        return this;
    }

    public int massActionRejectReason()
    {
        return massActionRejectReason;
    }

    public OrderMassActionReportEncoder massActionRejectReason(MassActionRejectReason value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == MassActionRejectReason.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: massActionRejectReason Value: " + value );
            }
            if (value == MassActionRejectReason.NULL_VAL)
            {
                return this;
            }
        }
        return massActionRejectReason(value.representation());
    }

    private int totalAffectedOrders;

    private boolean hasTotalAffectedOrders;

    public boolean hasTotalAffectedOrders()
    {
        return hasTotalAffectedOrders;
    }

    public OrderMassActionReportEncoder totalAffectedOrders(int value)
    {
        totalAffectedOrders = value;
        hasTotalAffectedOrders = true;
        return this;
    }

    public int totalAffectedOrders()
    {
        return totalAffectedOrders;
    }

    private final AffectedOrdGrpEncoder affectedOrdGrp = new AffectedOrdGrpEncoder();
    public AffectedOrdGrpEncoder affectedOrdGrp()
    {
        return affectedOrdGrp;
    }

    private final NotAffectedOrdersGrpEncoder notAffectedOrdersGrp = new NotAffectedOrdersGrpEncoder();
    public NotAffectedOrdersGrpEncoder notAffectedOrdersGrp()
    {
        return notAffectedOrdersGrp;
    }

    private final MutableDirectBuffer marketID = new UnsafeBuffer();

    private int marketIDOffset = 0;

    private int marketIDLength = 0;

    public OrderMassActionReportEncoder marketID(final DirectBuffer value, final int offset, final int length)
    {
        marketID.wrap(value);
        marketIDOffset = offset;
        marketIDLength = length;
        return this;
    }

    public OrderMassActionReportEncoder marketID(final DirectBuffer value, final int length)
    {
        return marketID(value, 0, length);
    }

    public OrderMassActionReportEncoder marketID(final DirectBuffer value)
    {
        return marketID(value, 0, value.capacity());
    }

    public OrderMassActionReportEncoder marketID(final byte[] value, final int offset, final int length)
    {
        marketID.wrap(value);
        marketIDOffset = offset;
        marketIDLength = length;
        return this;
    }

    public OrderMassActionReportEncoder marketIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(marketID, value, offset, length);
        marketIDOffset = offset;
        marketIDLength = length;
        return this;
    }

    public OrderMassActionReportEncoder marketID(final byte[] value, final int length)
    {
        return marketID(value, 0, length);
    }

    public OrderMassActionReportEncoder marketID(final byte[] value)
    {
        return marketID(value, 0, value.length);
    }

    public boolean hasMarketID()
    {
        return marketIDLength > 0;
    }

    public MutableDirectBuffer marketID()
    {
        return marketID;
    }

    public String marketIDAsString()
    {
        return marketID.getStringWithoutLengthAscii(marketIDOffset, marketIDLength);
    }

    public OrderMassActionReportEncoder marketID(final CharSequence value)
    {
        toBytes(value, marketID);
        marketIDOffset = 0;
        marketIDLength = value.length();
        return this;
    }

    public OrderMassActionReportEncoder marketID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            marketID.wrap(buffer);
            marketIDOffset = value.offset();
            marketIDLength = value.length();
        }
        return this;
    }

    public OrderMassActionReportEncoder marketID(final char[] value)
    {
        return marketID(value, 0, value.length);
    }

    public OrderMassActionReportEncoder marketID(final char[] value, final int length)
    {
        return marketID(value, 0, length);
    }

    public OrderMassActionReportEncoder marketID(final char[] value, final int offset, final int length)
    {
        toBytes(value, marketID, offset, length);
        marketIDOffset = 0;
        marketIDLength = length;
        return this;
    }

    private final MutableDirectBuffer marketSegmentID = new UnsafeBuffer();

    private int marketSegmentIDOffset = 0;

    private int marketSegmentIDLength = 0;

    public OrderMassActionReportEncoder marketSegmentID(final DirectBuffer value, final int offset, final int length)
    {
        marketSegmentID.wrap(value);
        marketSegmentIDOffset = offset;
        marketSegmentIDLength = length;
        return this;
    }

    public OrderMassActionReportEncoder marketSegmentID(final DirectBuffer value, final int length)
    {
        return marketSegmentID(value, 0, length);
    }

    public OrderMassActionReportEncoder marketSegmentID(final DirectBuffer value)
    {
        return marketSegmentID(value, 0, value.capacity());
    }

    public OrderMassActionReportEncoder marketSegmentID(final byte[] value, final int offset, final int length)
    {
        marketSegmentID.wrap(value);
        marketSegmentIDOffset = offset;
        marketSegmentIDLength = length;
        return this;
    }

    public OrderMassActionReportEncoder marketSegmentIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(marketSegmentID, value, offset, length);
        marketSegmentIDOffset = offset;
        marketSegmentIDLength = length;
        return this;
    }

    public OrderMassActionReportEncoder marketSegmentID(final byte[] value, final int length)
    {
        return marketSegmentID(value, 0, length);
    }

    public OrderMassActionReportEncoder marketSegmentID(final byte[] value)
    {
        return marketSegmentID(value, 0, value.length);
    }

    public boolean hasMarketSegmentID()
    {
        return marketSegmentIDLength > 0;
    }

    public MutableDirectBuffer marketSegmentID()
    {
        return marketSegmentID;
    }

    public String marketSegmentIDAsString()
    {
        return marketSegmentID.getStringWithoutLengthAscii(marketSegmentIDOffset, marketSegmentIDLength);
    }

    public OrderMassActionReportEncoder marketSegmentID(final CharSequence value)
    {
        toBytes(value, marketSegmentID);
        marketSegmentIDOffset = 0;
        marketSegmentIDLength = value.length();
        return this;
    }

    public OrderMassActionReportEncoder marketSegmentID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            marketSegmentID.wrap(buffer);
            marketSegmentIDOffset = value.offset();
            marketSegmentIDLength = value.length();
        }
        return this;
    }

    public OrderMassActionReportEncoder marketSegmentID(final char[] value)
    {
        return marketSegmentID(value, 0, value.length);
    }

    public OrderMassActionReportEncoder marketSegmentID(final char[] value, final int length)
    {
        return marketSegmentID(value, 0, length);
    }

    public OrderMassActionReportEncoder marketSegmentID(final char[] value, final int offset, final int length)
    {
        toBytes(value, marketSegmentID, offset, length);
        marketSegmentIDOffset = 0;
        marketSegmentIDLength = length;
        return this;
    }

    private final MutableDirectBuffer tradingSessionID = new UnsafeBuffer();

    private int tradingSessionIDOffset = 0;

    private int tradingSessionIDLength = 0;

    public OrderMassActionReportEncoder tradingSessionID(final DirectBuffer value, final int offset, final int length)
    {
        tradingSessionID.wrap(value);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public OrderMassActionReportEncoder tradingSessionID(final DirectBuffer value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public OrderMassActionReportEncoder tradingSessionID(final DirectBuffer value)
    {
        return tradingSessionID(value, 0, value.capacity());
    }

    public OrderMassActionReportEncoder tradingSessionID(final byte[] value, final int offset, final int length)
    {
        tradingSessionID.wrap(value);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public OrderMassActionReportEncoder tradingSessionIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradingSessionID, value, offset, length);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public OrderMassActionReportEncoder tradingSessionID(final byte[] value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public OrderMassActionReportEncoder tradingSessionID(final byte[] value)
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

    public OrderMassActionReportEncoder tradingSessionID(final CharSequence value)
    {
        toBytes(value, tradingSessionID);
        tradingSessionIDOffset = 0;
        tradingSessionIDLength = value.length();
        return this;
    }

    public OrderMassActionReportEncoder tradingSessionID(final AsciiSequenceView value)
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

    public OrderMassActionReportEncoder tradingSessionID(final char[] value)
    {
        return tradingSessionID(value, 0, value.length);
    }

    public OrderMassActionReportEncoder tradingSessionID(final char[] value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public OrderMassActionReportEncoder tradingSessionID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradingSessionID, offset, length);
        tradingSessionIDOffset = 0;
        tradingSessionIDLength = length;
        return this;
    }

    public OrderMassActionReportEncoder tradingSessionID(TradingSessionID value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == TradingSessionID.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: tradingSessionID Value: " + value );
            }
            if (value == TradingSessionID.NULL_VAL)
            {
                return this;
            }
        }
        return tradingSessionID(value.representation());
    }

    private final MutableDirectBuffer tradingSessionSubID = new UnsafeBuffer();

    private int tradingSessionSubIDOffset = 0;

    private int tradingSessionSubIDLength = 0;

    public OrderMassActionReportEncoder tradingSessionSubID(final DirectBuffer value, final int offset, final int length)
    {
        tradingSessionSubID.wrap(value);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public OrderMassActionReportEncoder tradingSessionSubID(final DirectBuffer value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public OrderMassActionReportEncoder tradingSessionSubID(final DirectBuffer value)
    {
        return tradingSessionSubID(value, 0, value.capacity());
    }

    public OrderMassActionReportEncoder tradingSessionSubID(final byte[] value, final int offset, final int length)
    {
        tradingSessionSubID.wrap(value);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public OrderMassActionReportEncoder tradingSessionSubIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradingSessionSubID, value, offset, length);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public OrderMassActionReportEncoder tradingSessionSubID(final byte[] value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public OrderMassActionReportEncoder tradingSessionSubID(final byte[] value)
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

    public OrderMassActionReportEncoder tradingSessionSubID(final CharSequence value)
    {
        toBytes(value, tradingSessionSubID);
        tradingSessionSubIDOffset = 0;
        tradingSessionSubIDLength = value.length();
        return this;
    }

    public OrderMassActionReportEncoder tradingSessionSubID(final AsciiSequenceView value)
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

    public OrderMassActionReportEncoder tradingSessionSubID(final char[] value)
    {
        return tradingSessionSubID(value, 0, value.length);
    }

    public OrderMassActionReportEncoder tradingSessionSubID(final char[] value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public OrderMassActionReportEncoder tradingSessionSubID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradingSessionSubID, offset, length);
        tradingSessionSubIDOffset = 0;
        tradingSessionSubIDLength = length;
        return this;
    }

    public OrderMassActionReportEncoder tradingSessionSubID(TradingSessionSubID value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == TradingSessionSubID.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: tradingSessionSubID Value: " + value );
            }
            if (value == TradingSessionSubID.NULL_VAL)
            {
                return this;
            }
        }
        return tradingSessionSubID(value.representation());
    }

    private final PartiesEncoder parties = new PartiesEncoder();
    public PartiesEncoder parties()
    {
        return parties;
    }

    private final TargetPartiesEncoder targetParties = new TargetPartiesEncoder();
    public TargetPartiesEncoder targetParties()
    {
        return targetParties;
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

    public OrderMassActionReportEncoder side(char value)
    {
        side = value;
        hasSide = true;
        return this;
    }

    public char side()
    {
        return side;
    }

    public OrderMassActionReportEncoder side(Side value)
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

    public OrderMassActionReportEncoder transactTime(final DirectBuffer value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public OrderMassActionReportEncoder transactTime(final DirectBuffer value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public OrderMassActionReportEncoder transactTime(final DirectBuffer value)
    {
        return transactTime(value, 0, value.capacity());
    }

    public OrderMassActionReportEncoder transactTime(final byte[] value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public OrderMassActionReportEncoder transactTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(transactTime, value, offset, length);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public OrderMassActionReportEncoder transactTime(final byte[] value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public OrderMassActionReportEncoder transactTime(final byte[] value)
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

    public OrderMassActionReportEncoder text(final DirectBuffer value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public OrderMassActionReportEncoder text(final DirectBuffer value, final int length)
    {
        return text(value, 0, length);
    }

    public OrderMassActionReportEncoder text(final DirectBuffer value)
    {
        return text(value, 0, value.capacity());
    }

    public OrderMassActionReportEncoder text(final byte[] value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public OrderMassActionReportEncoder textAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(text, value, offset, length);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public OrderMassActionReportEncoder text(final byte[] value, final int length)
    {
        return text(value, 0, length);
    }

    public OrderMassActionReportEncoder text(final byte[] value)
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

    public OrderMassActionReportEncoder text(final CharSequence value)
    {
        toBytes(value, text);
        textOffset = 0;
        textLength = value.length();
        return this;
    }

    public OrderMassActionReportEncoder text(final AsciiSequenceView value)
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

    public OrderMassActionReportEncoder text(final char[] value)
    {
        return text(value, 0, value.length);
    }

    public OrderMassActionReportEncoder text(final char[] value, final int length)
    {
        return text(value, 0, length);
    }

    public OrderMassActionReportEncoder text(final char[] value, final int offset, final int length)
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

    public OrderMassActionReportEncoder encodedTextLen(int value)
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

    public OrderMassActionReportEncoder encodedText(byte[] value)
    {
        encodedText = value;
        hasEncodedText = true;
        return this;
    }

    public byte[] encodedText()
    {
        return encodedText;
    }

    public OrderMassActionReportEncoder encodedTextAsCopy(final byte[] value, final int offset, final int length)
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

        if (massActionReportIDLength > 0)
        {
            buffer.putBytes(position, massActionReportIDHeader, 0, massActionReportIDHeaderLength);
            position += massActionReportIDHeaderLength;
            buffer.putBytes(position, massActionReportID, massActionReportIDOffset, massActionReportIDLength);
            position += massActionReportIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: MassActionReportID");
        }

        if (hasMassActionType)
        {
            buffer.putBytes(position, massActionTypeHeader, 0, massActionTypeHeaderLength);
            position += massActionTypeHeaderLength;
            position += buffer.putIntAscii(position, massActionType);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: MassActionType");
        }

        if (hasMassActionScope)
        {
            buffer.putBytes(position, massActionScopeHeader, 0, massActionScopeHeaderLength);
            position += massActionScopeHeaderLength;
            position += buffer.putIntAscii(position, massActionScope);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: MassActionScope");
        }

        if (hasMassActionResponse)
        {
            buffer.putBytes(position, massActionResponseHeader, 0, massActionResponseHeaderLength);
            position += massActionResponseHeaderLength;
            position += buffer.putIntAscii(position, massActionResponse);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: MassActionResponse");
        }

        if (hasMassActionRejectReason)
        {
            buffer.putBytes(position, massActionRejectReasonHeader, 0, massActionRejectReasonHeaderLength);
            position += massActionRejectReasonHeaderLength;
            position += buffer.putIntAscii(position, massActionRejectReason);
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

            position += affectedOrdGrp.encode(buffer, position);

            position += notAffectedOrdersGrp.encode(buffer, position);

        if (marketIDLength > 0)
        {
            buffer.putBytes(position, marketIDHeader, 0, marketIDHeaderLength);
            position += marketIDHeaderLength;
            buffer.putBytes(position, marketID, marketIDOffset, marketIDLength);
            position += marketIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (marketSegmentIDLength > 0)
        {
            buffer.putBytes(position, marketSegmentIDHeader, 0, marketSegmentIDHeaderLength);
            position += marketSegmentIDHeaderLength;
            buffer.putBytes(position, marketSegmentID, marketSegmentIDOffset, marketSegmentIDLength);
            position += marketSegmentIDLength;
            buffer.putSeparator(position);
            position++;
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

            position += parties.encode(buffer, position);

            position += targetParties.encode(buffer, position);

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
        this.resetMassActionReportID();
        this.resetMassActionType();
        this.resetMassActionScope();
        this.resetMassActionResponse();
        this.resetMassActionRejectReason();
        this.resetTotalAffectedOrders();
        this.resetMarketID();
        this.resetMarketSegmentID();
        this.resetTradingSessionID();
        this.resetTradingSessionSubID();
        this.resetSide();
        this.resetTransactTime();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        affectedOrdGrp.reset();
        notAffectedOrdersGrp.reset();
        parties.reset();
        targetParties.reset();
        instrument.reset();
        underlyingInstrument.reset();
    }

    public void resetClOrdID()
    {
        clOrdIDLength = 0;
    }

    public void resetSecondaryClOrdID()
    {
        secondaryClOrdIDLength = 0;
    }

    public void resetMassActionReportID()
    {
        massActionReportIDLength = 0;
    }

    public void resetMassActionType()
    {
        hasMassActionType = false;
    }

    public void resetMassActionScope()
    {
        hasMassActionScope = false;
    }

    public void resetMassActionResponse()
    {
        hasMassActionResponse = false;
    }

    public void resetMassActionRejectReason()
    {
        hasMassActionRejectReason = false;
    }

    public void resetTotalAffectedOrders()
    {
        hasTotalAffectedOrders = false;
    }

    public void resetMarketID()
    {
        marketIDLength = 0;
    }

    public void resetMarketSegmentID()
    {
        marketSegmentIDLength = 0;
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
        builder.append("\"MessageName\": \"OrderMassActionReport\",\n");
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

        if (hasMassActionReportID())
        {
            indent(builder, level);
            builder.append("\"MassActionReportID\": \"");
            appendBuffer(builder, massActionReportID, massActionReportIDOffset, massActionReportIDLength);
            builder.append("\",\n");
        }

        if (hasMassActionType())
        {
            indent(builder, level);
            builder.append("\"MassActionType\": \"");
            builder.append(massActionType);
            builder.append("\",\n");
        }

        if (hasMassActionScope())
        {
            indent(builder, level);
            builder.append("\"MassActionScope\": \"");
            builder.append(massActionScope);
            builder.append("\",\n");
        }

        if (hasMassActionResponse())
        {
            indent(builder, level);
            builder.append("\"MassActionResponse\": \"");
            builder.append(massActionResponse);
            builder.append("\",\n");
        }

        if (hasMassActionRejectReason())
        {
            indent(builder, level);
            builder.append("\"MassActionRejectReason\": \"");
            builder.append(massActionRejectReason);
            builder.append("\",\n");
        }

        if (hasTotalAffectedOrders())
        {
            indent(builder, level);
            builder.append("\"TotalAffectedOrders\": \"");
            builder.append(totalAffectedOrders);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"AffectedOrdGrp\": ");
    affectedOrdGrp.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"NotAffectedOrdersGrp\": ");
    notAffectedOrdersGrp.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasMarketID())
        {
            indent(builder, level);
            builder.append("\"MarketID\": \"");
            appendBuffer(builder, marketID, marketIDOffset, marketIDLength);
            builder.append("\",\n");
        }

        if (hasMarketSegmentID())
        {
            indent(builder, level);
            builder.append("\"MarketSegmentID\": \"");
            appendBuffer(builder, marketSegmentID, marketSegmentIDOffset, marketSegmentIDLength);
            builder.append("\",\n");
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
    builder.append("\"Parties\": ");
    parties.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"TargetParties\": ");
    targetParties.appendTo(builder, level + 1);
    builder.append("\n");

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
    public OrderMassActionReportEncoder copyTo(final Encoder encoder)
    {
        return copyTo((OrderMassActionReportEncoder)encoder);
    }

    public OrderMassActionReportEncoder copyTo(final OrderMassActionReportEncoder encoder)
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

        if (hasMassActionReportID())
        {
            encoder.massActionReportIDAsCopy(massActionReportID.byteArray(), 0, massActionReportIDLength);
        }

        if (hasMassActionType())
        {
            encoder.massActionType(this.massActionType());
        }

        if (hasMassActionScope())
        {
            encoder.massActionScope(this.massActionScope());
        }

        if (hasMassActionResponse())
        {
            encoder.massActionResponse(this.massActionResponse());
        }

        if (hasMassActionRejectReason())
        {
            encoder.massActionRejectReason(this.massActionRejectReason());
        }

        if (hasTotalAffectedOrders())
        {
            encoder.totalAffectedOrders(this.totalAffectedOrders());
        }


        affectedOrdGrp.copyTo(encoder.affectedOrdGrp());

        notAffectedOrdersGrp.copyTo(encoder.notAffectedOrdersGrp());
        if (hasMarketID())
        {
            encoder.marketIDAsCopy(marketID.byteArray(), 0, marketIDLength);
        }

        if (hasMarketSegmentID())
        {
            encoder.marketSegmentIDAsCopy(marketSegmentID.byteArray(), 0, marketSegmentIDLength);
        }

        if (hasTradingSessionID())
        {
            encoder.tradingSessionIDAsCopy(tradingSessionID.byteArray(), 0, tradingSessionIDLength);
        }

        if (hasTradingSessionSubID())
        {
            encoder.tradingSessionSubIDAsCopy(tradingSessionSubID.byteArray(), 0, tradingSessionSubIDLength);
        }


        parties.copyTo(encoder.parties());

        targetParties.copyTo(encoder.targetParties());

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
