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


public class TradeCaptureReportRequestAckEncoder implements Encoder
{
    public long messageType()
    {
        return 20801L;
    }

    public TradeCaptureReportRequestAckEncoder()
    {
        header.msgType("AQ");
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

    private static final int tradeRequestIDHeaderLength = 4;
    private static final byte[] tradeRequestIDHeader = new byte[] {53, 54, 56, (byte) '='};

    private static final int tradeIDHeaderLength = 5;
    private static final byte[] tradeIDHeader = new byte[] {49, 48, 48, 51, (byte) '='};

    private static final int secondaryTradeIDHeaderLength = 5;
    private static final byte[] secondaryTradeIDHeader = new byte[] {49, 48, 52, 48, (byte) '='};

    private static final int firmTradeIDHeaderLength = 5;
    private static final byte[] firmTradeIDHeader = new byte[] {49, 48, 52, 49, (byte) '='};

    private static final int secondaryFirmTradeIDHeaderLength = 5;
    private static final byte[] secondaryFirmTradeIDHeader = new byte[] {49, 48, 52, 50, (byte) '='};

    private static final int tradeRequestTypeHeaderLength = 4;
    private static final byte[] tradeRequestTypeHeader = new byte[] {53, 54, 57, (byte) '='};

    private static final int subscriptionRequestTypeHeaderLength = 4;
    private static final byte[] subscriptionRequestTypeHeader = new byte[] {50, 54, 51, (byte) '='};

    private static final int totNumTradeReportsHeaderLength = 4;
    private static final byte[] totNumTradeReportsHeader = new byte[] {55, 52, 56, (byte) '='};

    private static final int tradeRequestResultHeaderLength = 4;
    private static final byte[] tradeRequestResultHeader = new byte[] {55, 52, 57, (byte) '='};

    private static final int tradeRequestStatusHeaderLength = 4;
    private static final byte[] tradeRequestStatusHeader = new byte[] {55, 53, 48, (byte) '='};

    private static final int multiLegReportingTypeHeaderLength = 4;
    private static final byte[] multiLegReportingTypeHeader = new byte[] {52, 52, 50, (byte) '='};

    private static final int responseTransportTypeHeaderLength = 4;
    private static final byte[] responseTransportTypeHeader = new byte[] {55, 50, 53, (byte) '='};

    private static final int responseDestinationHeaderLength = 4;
    private static final byte[] responseDestinationHeader = new byte[] {55, 50, 54, (byte) '='};

    private static final int textHeaderLength = 3;
    private static final byte[] textHeader = new byte[] {53, 56, (byte) '='};

    private static final int encodedTextLenHeaderLength = 4;
    private static final byte[] encodedTextLenHeader = new byte[] {51, 53, 52, (byte) '='};

    private static final int encodedTextHeaderLength = 4;
    private static final byte[] encodedTextHeader = new byte[] {51, 53, 53, (byte) '='};

    private static final int messageEventSourceHeaderLength = 5;
    private static final byte[] messageEventSourceHeader = new byte[] {49, 48, 49, 49, (byte) '='};

    private final MutableDirectBuffer tradeRequestID = new UnsafeBuffer();

    private int tradeRequestIDOffset = 0;

    private int tradeRequestIDLength = 0;

    public TradeCaptureReportRequestAckEncoder tradeRequestID(final DirectBuffer value, final int offset, final int length)
    {
        tradeRequestID.wrap(value);
        tradeRequestIDOffset = offset;
        tradeRequestIDLength = length;
        return this;
    }

    public TradeCaptureReportRequestAckEncoder tradeRequestID(final DirectBuffer value, final int length)
    {
        return tradeRequestID(value, 0, length);
    }

    public TradeCaptureReportRequestAckEncoder tradeRequestID(final DirectBuffer value)
    {
        return tradeRequestID(value, 0, value.capacity());
    }

    public TradeCaptureReportRequestAckEncoder tradeRequestID(final byte[] value, final int offset, final int length)
    {
        tradeRequestID.wrap(value);
        tradeRequestIDOffset = offset;
        tradeRequestIDLength = length;
        return this;
    }

    public TradeCaptureReportRequestAckEncoder tradeRequestIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradeRequestID, value, offset, length);
        tradeRequestIDOffset = offset;
        tradeRequestIDLength = length;
        return this;
    }

    public TradeCaptureReportRequestAckEncoder tradeRequestID(final byte[] value, final int length)
    {
        return tradeRequestID(value, 0, length);
    }

    public TradeCaptureReportRequestAckEncoder tradeRequestID(final byte[] value)
    {
        return tradeRequestID(value, 0, value.length);
    }

    public boolean hasTradeRequestID()
    {
        return tradeRequestIDLength > 0;
    }

    public MutableDirectBuffer tradeRequestID()
    {
        return tradeRequestID;
    }

    public String tradeRequestIDAsString()
    {
        return tradeRequestID.getStringWithoutLengthAscii(tradeRequestIDOffset, tradeRequestIDLength);
    }

    public TradeCaptureReportRequestAckEncoder tradeRequestID(final CharSequence value)
    {
        toBytes(value, tradeRequestID);
        tradeRequestIDOffset = 0;
        tradeRequestIDLength = value.length();
        return this;
    }

    public TradeCaptureReportRequestAckEncoder tradeRequestID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            tradeRequestID.wrap(buffer);
            tradeRequestIDOffset = value.offset();
            tradeRequestIDLength = value.length();
        }
        return this;
    }

    public TradeCaptureReportRequestAckEncoder tradeRequestID(final char[] value)
    {
        return tradeRequestID(value, 0, value.length);
    }

    public TradeCaptureReportRequestAckEncoder tradeRequestID(final char[] value, final int length)
    {
        return tradeRequestID(value, 0, length);
    }

    public TradeCaptureReportRequestAckEncoder tradeRequestID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradeRequestID, offset, length);
        tradeRequestIDOffset = 0;
        tradeRequestIDLength = length;
        return this;
    }

    private final MutableDirectBuffer tradeID = new UnsafeBuffer();

    private int tradeIDOffset = 0;

    private int tradeIDLength = 0;

    public TradeCaptureReportRequestAckEncoder tradeID(final DirectBuffer value, final int offset, final int length)
    {
        tradeID.wrap(value);
        tradeIDOffset = offset;
        tradeIDLength = length;
        return this;
    }

    public TradeCaptureReportRequestAckEncoder tradeID(final DirectBuffer value, final int length)
    {
        return tradeID(value, 0, length);
    }

    public TradeCaptureReportRequestAckEncoder tradeID(final DirectBuffer value)
    {
        return tradeID(value, 0, value.capacity());
    }

    public TradeCaptureReportRequestAckEncoder tradeID(final byte[] value, final int offset, final int length)
    {
        tradeID.wrap(value);
        tradeIDOffset = offset;
        tradeIDLength = length;
        return this;
    }

    public TradeCaptureReportRequestAckEncoder tradeIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradeID, value, offset, length);
        tradeIDOffset = offset;
        tradeIDLength = length;
        return this;
    }

    public TradeCaptureReportRequestAckEncoder tradeID(final byte[] value, final int length)
    {
        return tradeID(value, 0, length);
    }

    public TradeCaptureReportRequestAckEncoder tradeID(final byte[] value)
    {
        return tradeID(value, 0, value.length);
    }

    public boolean hasTradeID()
    {
        return tradeIDLength > 0;
    }

    public MutableDirectBuffer tradeID()
    {
        return tradeID;
    }

    public String tradeIDAsString()
    {
        return tradeID.getStringWithoutLengthAscii(tradeIDOffset, tradeIDLength);
    }

    public TradeCaptureReportRequestAckEncoder tradeID(final CharSequence value)
    {
        toBytes(value, tradeID);
        tradeIDOffset = 0;
        tradeIDLength = value.length();
        return this;
    }

    public TradeCaptureReportRequestAckEncoder tradeID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            tradeID.wrap(buffer);
            tradeIDOffset = value.offset();
            tradeIDLength = value.length();
        }
        return this;
    }

    public TradeCaptureReportRequestAckEncoder tradeID(final char[] value)
    {
        return tradeID(value, 0, value.length);
    }

    public TradeCaptureReportRequestAckEncoder tradeID(final char[] value, final int length)
    {
        return tradeID(value, 0, length);
    }

    public TradeCaptureReportRequestAckEncoder tradeID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradeID, offset, length);
        tradeIDOffset = 0;
        tradeIDLength = length;
        return this;
    }

    private final MutableDirectBuffer secondaryTradeID = new UnsafeBuffer();

    private int secondaryTradeIDOffset = 0;

    private int secondaryTradeIDLength = 0;

    public TradeCaptureReportRequestAckEncoder secondaryTradeID(final DirectBuffer value, final int offset, final int length)
    {
        secondaryTradeID.wrap(value);
        secondaryTradeIDOffset = offset;
        secondaryTradeIDLength = length;
        return this;
    }

    public TradeCaptureReportRequestAckEncoder secondaryTradeID(final DirectBuffer value, final int length)
    {
        return secondaryTradeID(value, 0, length);
    }

    public TradeCaptureReportRequestAckEncoder secondaryTradeID(final DirectBuffer value)
    {
        return secondaryTradeID(value, 0, value.capacity());
    }

    public TradeCaptureReportRequestAckEncoder secondaryTradeID(final byte[] value, final int offset, final int length)
    {
        secondaryTradeID.wrap(value);
        secondaryTradeIDOffset = offset;
        secondaryTradeIDLength = length;
        return this;
    }

    public TradeCaptureReportRequestAckEncoder secondaryTradeIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(secondaryTradeID, value, offset, length);
        secondaryTradeIDOffset = offset;
        secondaryTradeIDLength = length;
        return this;
    }

    public TradeCaptureReportRequestAckEncoder secondaryTradeID(final byte[] value, final int length)
    {
        return secondaryTradeID(value, 0, length);
    }

    public TradeCaptureReportRequestAckEncoder secondaryTradeID(final byte[] value)
    {
        return secondaryTradeID(value, 0, value.length);
    }

    public boolean hasSecondaryTradeID()
    {
        return secondaryTradeIDLength > 0;
    }

    public MutableDirectBuffer secondaryTradeID()
    {
        return secondaryTradeID;
    }

    public String secondaryTradeIDAsString()
    {
        return secondaryTradeID.getStringWithoutLengthAscii(secondaryTradeIDOffset, secondaryTradeIDLength);
    }

    public TradeCaptureReportRequestAckEncoder secondaryTradeID(final CharSequence value)
    {
        toBytes(value, secondaryTradeID);
        secondaryTradeIDOffset = 0;
        secondaryTradeIDLength = value.length();
        return this;
    }

    public TradeCaptureReportRequestAckEncoder secondaryTradeID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            secondaryTradeID.wrap(buffer);
            secondaryTradeIDOffset = value.offset();
            secondaryTradeIDLength = value.length();
        }
        return this;
    }

    public TradeCaptureReportRequestAckEncoder secondaryTradeID(final char[] value)
    {
        return secondaryTradeID(value, 0, value.length);
    }

    public TradeCaptureReportRequestAckEncoder secondaryTradeID(final char[] value, final int length)
    {
        return secondaryTradeID(value, 0, length);
    }

    public TradeCaptureReportRequestAckEncoder secondaryTradeID(final char[] value, final int offset, final int length)
    {
        toBytes(value, secondaryTradeID, offset, length);
        secondaryTradeIDOffset = 0;
        secondaryTradeIDLength = length;
        return this;
    }

    private final MutableDirectBuffer firmTradeID = new UnsafeBuffer();

    private int firmTradeIDOffset = 0;

    private int firmTradeIDLength = 0;

    public TradeCaptureReportRequestAckEncoder firmTradeID(final DirectBuffer value, final int offset, final int length)
    {
        firmTradeID.wrap(value);
        firmTradeIDOffset = offset;
        firmTradeIDLength = length;
        return this;
    }

    public TradeCaptureReportRequestAckEncoder firmTradeID(final DirectBuffer value, final int length)
    {
        return firmTradeID(value, 0, length);
    }

    public TradeCaptureReportRequestAckEncoder firmTradeID(final DirectBuffer value)
    {
        return firmTradeID(value, 0, value.capacity());
    }

    public TradeCaptureReportRequestAckEncoder firmTradeID(final byte[] value, final int offset, final int length)
    {
        firmTradeID.wrap(value);
        firmTradeIDOffset = offset;
        firmTradeIDLength = length;
        return this;
    }

    public TradeCaptureReportRequestAckEncoder firmTradeIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(firmTradeID, value, offset, length);
        firmTradeIDOffset = offset;
        firmTradeIDLength = length;
        return this;
    }

    public TradeCaptureReportRequestAckEncoder firmTradeID(final byte[] value, final int length)
    {
        return firmTradeID(value, 0, length);
    }

    public TradeCaptureReportRequestAckEncoder firmTradeID(final byte[] value)
    {
        return firmTradeID(value, 0, value.length);
    }

    public boolean hasFirmTradeID()
    {
        return firmTradeIDLength > 0;
    }

    public MutableDirectBuffer firmTradeID()
    {
        return firmTradeID;
    }

    public String firmTradeIDAsString()
    {
        return firmTradeID.getStringWithoutLengthAscii(firmTradeIDOffset, firmTradeIDLength);
    }

    public TradeCaptureReportRequestAckEncoder firmTradeID(final CharSequence value)
    {
        toBytes(value, firmTradeID);
        firmTradeIDOffset = 0;
        firmTradeIDLength = value.length();
        return this;
    }

    public TradeCaptureReportRequestAckEncoder firmTradeID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            firmTradeID.wrap(buffer);
            firmTradeIDOffset = value.offset();
            firmTradeIDLength = value.length();
        }
        return this;
    }

    public TradeCaptureReportRequestAckEncoder firmTradeID(final char[] value)
    {
        return firmTradeID(value, 0, value.length);
    }

    public TradeCaptureReportRequestAckEncoder firmTradeID(final char[] value, final int length)
    {
        return firmTradeID(value, 0, length);
    }

    public TradeCaptureReportRequestAckEncoder firmTradeID(final char[] value, final int offset, final int length)
    {
        toBytes(value, firmTradeID, offset, length);
        firmTradeIDOffset = 0;
        firmTradeIDLength = length;
        return this;
    }

    private final MutableDirectBuffer secondaryFirmTradeID = new UnsafeBuffer();

    private int secondaryFirmTradeIDOffset = 0;

    private int secondaryFirmTradeIDLength = 0;

    public TradeCaptureReportRequestAckEncoder secondaryFirmTradeID(final DirectBuffer value, final int offset, final int length)
    {
        secondaryFirmTradeID.wrap(value);
        secondaryFirmTradeIDOffset = offset;
        secondaryFirmTradeIDLength = length;
        return this;
    }

    public TradeCaptureReportRequestAckEncoder secondaryFirmTradeID(final DirectBuffer value, final int length)
    {
        return secondaryFirmTradeID(value, 0, length);
    }

    public TradeCaptureReportRequestAckEncoder secondaryFirmTradeID(final DirectBuffer value)
    {
        return secondaryFirmTradeID(value, 0, value.capacity());
    }

    public TradeCaptureReportRequestAckEncoder secondaryFirmTradeID(final byte[] value, final int offset, final int length)
    {
        secondaryFirmTradeID.wrap(value);
        secondaryFirmTradeIDOffset = offset;
        secondaryFirmTradeIDLength = length;
        return this;
    }

    public TradeCaptureReportRequestAckEncoder secondaryFirmTradeIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(secondaryFirmTradeID, value, offset, length);
        secondaryFirmTradeIDOffset = offset;
        secondaryFirmTradeIDLength = length;
        return this;
    }

    public TradeCaptureReportRequestAckEncoder secondaryFirmTradeID(final byte[] value, final int length)
    {
        return secondaryFirmTradeID(value, 0, length);
    }

    public TradeCaptureReportRequestAckEncoder secondaryFirmTradeID(final byte[] value)
    {
        return secondaryFirmTradeID(value, 0, value.length);
    }

    public boolean hasSecondaryFirmTradeID()
    {
        return secondaryFirmTradeIDLength > 0;
    }

    public MutableDirectBuffer secondaryFirmTradeID()
    {
        return secondaryFirmTradeID;
    }

    public String secondaryFirmTradeIDAsString()
    {
        return secondaryFirmTradeID.getStringWithoutLengthAscii(secondaryFirmTradeIDOffset, secondaryFirmTradeIDLength);
    }

    public TradeCaptureReportRequestAckEncoder secondaryFirmTradeID(final CharSequence value)
    {
        toBytes(value, secondaryFirmTradeID);
        secondaryFirmTradeIDOffset = 0;
        secondaryFirmTradeIDLength = value.length();
        return this;
    }

    public TradeCaptureReportRequestAckEncoder secondaryFirmTradeID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            secondaryFirmTradeID.wrap(buffer);
            secondaryFirmTradeIDOffset = value.offset();
            secondaryFirmTradeIDLength = value.length();
        }
        return this;
    }

    public TradeCaptureReportRequestAckEncoder secondaryFirmTradeID(final char[] value)
    {
        return secondaryFirmTradeID(value, 0, value.length);
    }

    public TradeCaptureReportRequestAckEncoder secondaryFirmTradeID(final char[] value, final int length)
    {
        return secondaryFirmTradeID(value, 0, length);
    }

    public TradeCaptureReportRequestAckEncoder secondaryFirmTradeID(final char[] value, final int offset, final int length)
    {
        toBytes(value, secondaryFirmTradeID, offset, length);
        secondaryFirmTradeIDOffset = 0;
        secondaryFirmTradeIDLength = length;
        return this;
    }

    private int tradeRequestType;

    private boolean hasTradeRequestType;

    public boolean hasTradeRequestType()
    {
        return hasTradeRequestType;
    }

    public TradeCaptureReportRequestAckEncoder tradeRequestType(int value)
    {
        tradeRequestType = value;
        hasTradeRequestType = true;
        return this;
    }

    public int tradeRequestType()
    {
        return tradeRequestType;
    }

    public TradeCaptureReportRequestAckEncoder tradeRequestType(TradeRequestType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == TradeRequestType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: tradeRequestType Value: " + value );
            }
            if (value == TradeRequestType.NULL_VAL)
            {
                return this;
            }
        }
        return tradeRequestType(value.representation());
    }

    private char subscriptionRequestType;

    private boolean hasSubscriptionRequestType;

    public boolean hasSubscriptionRequestType()
    {
        return hasSubscriptionRequestType;
    }

    public TradeCaptureReportRequestAckEncoder subscriptionRequestType(char value)
    {
        subscriptionRequestType = value;
        hasSubscriptionRequestType = true;
        return this;
    }

    public char subscriptionRequestType()
    {
        return subscriptionRequestType;
    }

    public TradeCaptureReportRequestAckEncoder subscriptionRequestType(SubscriptionRequestType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == SubscriptionRequestType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: subscriptionRequestType Value: " + value );
            }
            if (value == SubscriptionRequestType.NULL_VAL)
            {
                return this;
            }
        }
        return subscriptionRequestType(value.representation());
    }

    private int totNumTradeReports;

    private boolean hasTotNumTradeReports;

    public boolean hasTotNumTradeReports()
    {
        return hasTotNumTradeReports;
    }

    public TradeCaptureReportRequestAckEncoder totNumTradeReports(int value)
    {
        totNumTradeReports = value;
        hasTotNumTradeReports = true;
        return this;
    }

    public int totNumTradeReports()
    {
        return totNumTradeReports;
    }

    private int tradeRequestResult;

    private boolean hasTradeRequestResult;

    public boolean hasTradeRequestResult()
    {
        return hasTradeRequestResult;
    }

    public TradeCaptureReportRequestAckEncoder tradeRequestResult(int value)
    {
        tradeRequestResult = value;
        hasTradeRequestResult = true;
        return this;
    }

    public int tradeRequestResult()
    {
        return tradeRequestResult;
    }

    public TradeCaptureReportRequestAckEncoder tradeRequestResult(TradeRequestResult value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == TradeRequestResult.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: tradeRequestResult Value: " + value );
            }
            if (value == TradeRequestResult.NULL_VAL)
            {
                return this;
            }
        }
        return tradeRequestResult(value.representation());
    }

    private int tradeRequestStatus;

    private boolean hasTradeRequestStatus;

    public boolean hasTradeRequestStatus()
    {
        return hasTradeRequestStatus;
    }

    public TradeCaptureReportRequestAckEncoder tradeRequestStatus(int value)
    {
        tradeRequestStatus = value;
        hasTradeRequestStatus = true;
        return this;
    }

    public int tradeRequestStatus()
    {
        return tradeRequestStatus;
    }

    public TradeCaptureReportRequestAckEncoder tradeRequestStatus(TradeRequestStatus value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == TradeRequestStatus.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: tradeRequestStatus Value: " + value );
            }
            if (value == TradeRequestStatus.NULL_VAL)
            {
                return this;
            }
        }
        return tradeRequestStatus(value.representation());
    }

    private final InstrumentEncoder instrument = new InstrumentEncoder();
    public InstrumentEncoder instrument()
    {
        return instrument;
    }

    private final UndInstrmtGrpEncoder undInstrmtGrp = new UndInstrmtGrpEncoder();
    public UndInstrmtGrpEncoder undInstrmtGrp()
    {
        return undInstrmtGrp;
    }

    private final InstrmtLegGrpEncoder instrmtLegGrp = new InstrmtLegGrpEncoder();
    public InstrmtLegGrpEncoder instrmtLegGrp()
    {
        return instrmtLegGrp;
    }

    private char multiLegReportingType;

    private boolean hasMultiLegReportingType;

    public boolean hasMultiLegReportingType()
    {
        return hasMultiLegReportingType;
    }

    public TradeCaptureReportRequestAckEncoder multiLegReportingType(char value)
    {
        multiLegReportingType = value;
        hasMultiLegReportingType = true;
        return this;
    }

    public char multiLegReportingType()
    {
        return multiLegReportingType;
    }

    public TradeCaptureReportRequestAckEncoder multiLegReportingType(MultiLegReportingType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == MultiLegReportingType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: multiLegReportingType Value: " + value );
            }
            if (value == MultiLegReportingType.NULL_VAL)
            {
                return this;
            }
        }
        return multiLegReportingType(value.representation());
    }

    private int responseTransportType;

    private boolean hasResponseTransportType;

    public boolean hasResponseTransportType()
    {
        return hasResponseTransportType;
    }

    public TradeCaptureReportRequestAckEncoder responseTransportType(int value)
    {
        responseTransportType = value;
        hasResponseTransportType = true;
        return this;
    }

    public int responseTransportType()
    {
        return responseTransportType;
    }

    public TradeCaptureReportRequestAckEncoder responseTransportType(ResponseTransportType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == ResponseTransportType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: responseTransportType Value: " + value );
            }
            if (value == ResponseTransportType.NULL_VAL)
            {
                return this;
            }
        }
        return responseTransportType(value.representation());
    }

    private final MutableDirectBuffer responseDestination = new UnsafeBuffer();

    private int responseDestinationOffset = 0;

    private int responseDestinationLength = 0;

    public TradeCaptureReportRequestAckEncoder responseDestination(final DirectBuffer value, final int offset, final int length)
    {
        responseDestination.wrap(value);
        responseDestinationOffset = offset;
        responseDestinationLength = length;
        return this;
    }

    public TradeCaptureReportRequestAckEncoder responseDestination(final DirectBuffer value, final int length)
    {
        return responseDestination(value, 0, length);
    }

    public TradeCaptureReportRequestAckEncoder responseDestination(final DirectBuffer value)
    {
        return responseDestination(value, 0, value.capacity());
    }

    public TradeCaptureReportRequestAckEncoder responseDestination(final byte[] value, final int offset, final int length)
    {
        responseDestination.wrap(value);
        responseDestinationOffset = offset;
        responseDestinationLength = length;
        return this;
    }

    public TradeCaptureReportRequestAckEncoder responseDestinationAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(responseDestination, value, offset, length);
        responseDestinationOffset = offset;
        responseDestinationLength = length;
        return this;
    }

    public TradeCaptureReportRequestAckEncoder responseDestination(final byte[] value, final int length)
    {
        return responseDestination(value, 0, length);
    }

    public TradeCaptureReportRequestAckEncoder responseDestination(final byte[] value)
    {
        return responseDestination(value, 0, value.length);
    }

    public boolean hasResponseDestination()
    {
        return responseDestinationLength > 0;
    }

    public MutableDirectBuffer responseDestination()
    {
        return responseDestination;
    }

    public String responseDestinationAsString()
    {
        return responseDestination.getStringWithoutLengthAscii(responseDestinationOffset, responseDestinationLength);
    }

    public TradeCaptureReportRequestAckEncoder responseDestination(final CharSequence value)
    {
        toBytes(value, responseDestination);
        responseDestinationOffset = 0;
        responseDestinationLength = value.length();
        return this;
    }

    public TradeCaptureReportRequestAckEncoder responseDestination(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            responseDestination.wrap(buffer);
            responseDestinationOffset = value.offset();
            responseDestinationLength = value.length();
        }
        return this;
    }

    public TradeCaptureReportRequestAckEncoder responseDestination(final char[] value)
    {
        return responseDestination(value, 0, value.length);
    }

    public TradeCaptureReportRequestAckEncoder responseDestination(final char[] value, final int length)
    {
        return responseDestination(value, 0, length);
    }

    public TradeCaptureReportRequestAckEncoder responseDestination(final char[] value, final int offset, final int length)
    {
        toBytes(value, responseDestination, offset, length);
        responseDestinationOffset = 0;
        responseDestinationLength = length;
        return this;
    }

    private final MutableDirectBuffer text = new UnsafeBuffer();

    private int textOffset = 0;

    private int textLength = 0;

    public TradeCaptureReportRequestAckEncoder text(final DirectBuffer value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public TradeCaptureReportRequestAckEncoder text(final DirectBuffer value, final int length)
    {
        return text(value, 0, length);
    }

    public TradeCaptureReportRequestAckEncoder text(final DirectBuffer value)
    {
        return text(value, 0, value.capacity());
    }

    public TradeCaptureReportRequestAckEncoder text(final byte[] value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public TradeCaptureReportRequestAckEncoder textAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(text, value, offset, length);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public TradeCaptureReportRequestAckEncoder text(final byte[] value, final int length)
    {
        return text(value, 0, length);
    }

    public TradeCaptureReportRequestAckEncoder text(final byte[] value)
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

    public TradeCaptureReportRequestAckEncoder text(final CharSequence value)
    {
        toBytes(value, text);
        textOffset = 0;
        textLength = value.length();
        return this;
    }

    public TradeCaptureReportRequestAckEncoder text(final AsciiSequenceView value)
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

    public TradeCaptureReportRequestAckEncoder text(final char[] value)
    {
        return text(value, 0, value.length);
    }

    public TradeCaptureReportRequestAckEncoder text(final char[] value, final int length)
    {
        return text(value, 0, length);
    }

    public TradeCaptureReportRequestAckEncoder text(final char[] value, final int offset, final int length)
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

    public TradeCaptureReportRequestAckEncoder encodedTextLen(int value)
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

    public TradeCaptureReportRequestAckEncoder encodedText(byte[] value)
    {
        encodedText = value;
        hasEncodedText = true;
        return this;
    }

    public byte[] encodedText()
    {
        return encodedText;
    }

    public TradeCaptureReportRequestAckEncoder encodedTextAsCopy(final byte[] value, final int offset, final int length)
    {
        encodedText = copyInto(encodedText, value, offset, length);
        hasEncodedText = true;
        return this;
    }

    private final MutableDirectBuffer messageEventSource = new UnsafeBuffer();

    private int messageEventSourceOffset = 0;

    private int messageEventSourceLength = 0;

    public TradeCaptureReportRequestAckEncoder messageEventSource(final DirectBuffer value, final int offset, final int length)
    {
        messageEventSource.wrap(value);
        messageEventSourceOffset = offset;
        messageEventSourceLength = length;
        return this;
    }

    public TradeCaptureReportRequestAckEncoder messageEventSource(final DirectBuffer value, final int length)
    {
        return messageEventSource(value, 0, length);
    }

    public TradeCaptureReportRequestAckEncoder messageEventSource(final DirectBuffer value)
    {
        return messageEventSource(value, 0, value.capacity());
    }

    public TradeCaptureReportRequestAckEncoder messageEventSource(final byte[] value, final int offset, final int length)
    {
        messageEventSource.wrap(value);
        messageEventSourceOffset = offset;
        messageEventSourceLength = length;
        return this;
    }

    public TradeCaptureReportRequestAckEncoder messageEventSourceAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(messageEventSource, value, offset, length);
        messageEventSourceOffset = offset;
        messageEventSourceLength = length;
        return this;
    }

    public TradeCaptureReportRequestAckEncoder messageEventSource(final byte[] value, final int length)
    {
        return messageEventSource(value, 0, length);
    }

    public TradeCaptureReportRequestAckEncoder messageEventSource(final byte[] value)
    {
        return messageEventSource(value, 0, value.length);
    }

    public boolean hasMessageEventSource()
    {
        return messageEventSourceLength > 0;
    }

    public MutableDirectBuffer messageEventSource()
    {
        return messageEventSource;
    }

    public String messageEventSourceAsString()
    {
        return messageEventSource.getStringWithoutLengthAscii(messageEventSourceOffset, messageEventSourceLength);
    }

    public TradeCaptureReportRequestAckEncoder messageEventSource(final CharSequence value)
    {
        toBytes(value, messageEventSource);
        messageEventSourceOffset = 0;
        messageEventSourceLength = value.length();
        return this;
    }

    public TradeCaptureReportRequestAckEncoder messageEventSource(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            messageEventSource.wrap(buffer);
            messageEventSourceOffset = value.offset();
            messageEventSourceLength = value.length();
        }
        return this;
    }

    public TradeCaptureReportRequestAckEncoder messageEventSource(final char[] value)
    {
        return messageEventSource(value, 0, value.length);
    }

    public TradeCaptureReportRequestAckEncoder messageEventSource(final char[] value, final int length)
    {
        return messageEventSource(value, 0, length);
    }

    public TradeCaptureReportRequestAckEncoder messageEventSource(final char[] value, final int offset, final int length)
    {
        toBytes(value, messageEventSource, offset, length);
        messageEventSourceOffset = 0;
        messageEventSourceLength = length;
        return this;
    }

    public long encode(final MutableAsciiBuffer buffer, final int offset)
    {
        final long startMessageResult = header.startMessage(buffer, offset);
        final int bodyStart = Encoder.offset(startMessageResult);
        int position = bodyStart + Encoder.length(startMessageResult);

        if (tradeRequestIDLength > 0)
        {
            buffer.putBytes(position, tradeRequestIDHeader, 0, tradeRequestIDHeaderLength);
            position += tradeRequestIDHeaderLength;
            buffer.putBytes(position, tradeRequestID, tradeRequestIDOffset, tradeRequestIDLength);
            position += tradeRequestIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: TradeRequestID");
        }

        if (tradeIDLength > 0)
        {
            buffer.putBytes(position, tradeIDHeader, 0, tradeIDHeaderLength);
            position += tradeIDHeaderLength;
            buffer.putBytes(position, tradeID, tradeIDOffset, tradeIDLength);
            position += tradeIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (secondaryTradeIDLength > 0)
        {
            buffer.putBytes(position, secondaryTradeIDHeader, 0, secondaryTradeIDHeaderLength);
            position += secondaryTradeIDHeaderLength;
            buffer.putBytes(position, secondaryTradeID, secondaryTradeIDOffset, secondaryTradeIDLength);
            position += secondaryTradeIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (firmTradeIDLength > 0)
        {
            buffer.putBytes(position, firmTradeIDHeader, 0, firmTradeIDHeaderLength);
            position += firmTradeIDHeaderLength;
            buffer.putBytes(position, firmTradeID, firmTradeIDOffset, firmTradeIDLength);
            position += firmTradeIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (secondaryFirmTradeIDLength > 0)
        {
            buffer.putBytes(position, secondaryFirmTradeIDHeader, 0, secondaryFirmTradeIDHeaderLength);
            position += secondaryFirmTradeIDHeaderLength;
            buffer.putBytes(position, secondaryFirmTradeID, secondaryFirmTradeIDOffset, secondaryFirmTradeIDLength);
            position += secondaryFirmTradeIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasTradeRequestType)
        {
            buffer.putBytes(position, tradeRequestTypeHeader, 0, tradeRequestTypeHeaderLength);
            position += tradeRequestTypeHeaderLength;
            position += buffer.putIntAscii(position, tradeRequestType);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: TradeRequestType");
        }

        if (hasSubscriptionRequestType)
        {
            buffer.putBytes(position, subscriptionRequestTypeHeader, 0, subscriptionRequestTypeHeaderLength);
            position += subscriptionRequestTypeHeaderLength;
            position += buffer.putCharAscii(position, subscriptionRequestType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasTotNumTradeReports)
        {
            buffer.putBytes(position, totNumTradeReportsHeader, 0, totNumTradeReportsHeaderLength);
            position += totNumTradeReportsHeaderLength;
            position += buffer.putIntAscii(position, totNumTradeReports);
            buffer.putSeparator(position);
            position++;
        }

        if (hasTradeRequestResult)
        {
            buffer.putBytes(position, tradeRequestResultHeader, 0, tradeRequestResultHeaderLength);
            position += tradeRequestResultHeaderLength;
            position += buffer.putIntAscii(position, tradeRequestResult);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: TradeRequestResult");
        }

        if (hasTradeRequestStatus)
        {
            buffer.putBytes(position, tradeRequestStatusHeader, 0, tradeRequestStatusHeaderLength);
            position += tradeRequestStatusHeaderLength;
            position += buffer.putIntAscii(position, tradeRequestStatus);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: TradeRequestStatus");
        }

            position += instrument.encode(buffer, position);

            position += undInstrmtGrp.encode(buffer, position);

            position += instrmtLegGrp.encode(buffer, position);

        if (hasMultiLegReportingType)
        {
            buffer.putBytes(position, multiLegReportingTypeHeader, 0, multiLegReportingTypeHeaderLength);
            position += multiLegReportingTypeHeaderLength;
            position += buffer.putCharAscii(position, multiLegReportingType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasResponseTransportType)
        {
            buffer.putBytes(position, responseTransportTypeHeader, 0, responseTransportTypeHeaderLength);
            position += responseTransportTypeHeaderLength;
            position += buffer.putIntAscii(position, responseTransportType);
            buffer.putSeparator(position);
            position++;
        }

        if (responseDestinationLength > 0)
        {
            buffer.putBytes(position, responseDestinationHeader, 0, responseDestinationHeaderLength);
            position += responseDestinationHeaderLength;
            buffer.putBytes(position, responseDestination, responseDestinationOffset, responseDestinationLength);
            position += responseDestinationLength;
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

        if (messageEventSourceLength > 0)
        {
            buffer.putBytes(position, messageEventSourceHeader, 0, messageEventSourceHeaderLength);
            position += messageEventSourceHeaderLength;
            buffer.putBytes(position, messageEventSource, messageEventSourceOffset, messageEventSourceLength);
            position += messageEventSourceLength;
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
        this.resetTradeRequestID();
        this.resetTradeID();
        this.resetSecondaryTradeID();
        this.resetFirmTradeID();
        this.resetSecondaryFirmTradeID();
        this.resetTradeRequestType();
        this.resetSubscriptionRequestType();
        this.resetTotNumTradeReports();
        this.resetTradeRequestResult();
        this.resetTradeRequestStatus();
        this.resetMultiLegReportingType();
        this.resetResponseTransportType();
        this.resetResponseDestination();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        this.resetMessageEventSource();
        instrument.reset();
        undInstrmtGrp.reset();
        instrmtLegGrp.reset();
    }

    public void resetTradeRequestID()
    {
        tradeRequestIDLength = 0;
    }

    public void resetTradeID()
    {
        tradeIDLength = 0;
    }

    public void resetSecondaryTradeID()
    {
        secondaryTradeIDLength = 0;
    }

    public void resetFirmTradeID()
    {
        firmTradeIDLength = 0;
    }

    public void resetSecondaryFirmTradeID()
    {
        secondaryFirmTradeIDLength = 0;
    }

    public void resetTradeRequestType()
    {
        hasTradeRequestType = false;
    }

    public void resetSubscriptionRequestType()
    {
        hasSubscriptionRequestType = false;
    }

    public void resetTotNumTradeReports()
    {
        hasTotNumTradeReports = false;
    }

    public void resetTradeRequestResult()
    {
        hasTradeRequestResult = false;
    }

    public void resetTradeRequestStatus()
    {
        hasTradeRequestStatus = false;
    }

    public void resetMultiLegReportingType()
    {
        hasMultiLegReportingType = false;
    }

    public void resetResponseTransportType()
    {
        hasResponseTransportType = false;
    }

    public void resetResponseDestination()
    {
        responseDestinationLength = 0;
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

    public void resetMessageEventSource()
    {
        messageEventSourceLength = 0;
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
        builder.append("\"MessageName\": \"TradeCaptureReportRequestAck\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasTradeRequestID())
        {
            indent(builder, level);
            builder.append("\"TradeRequestID\": \"");
            appendBuffer(builder, tradeRequestID, tradeRequestIDOffset, tradeRequestIDLength);
            builder.append("\",\n");
        }

        if (hasTradeID())
        {
            indent(builder, level);
            builder.append("\"TradeID\": \"");
            appendBuffer(builder, tradeID, tradeIDOffset, tradeIDLength);
            builder.append("\",\n");
        }

        if (hasSecondaryTradeID())
        {
            indent(builder, level);
            builder.append("\"SecondaryTradeID\": \"");
            appendBuffer(builder, secondaryTradeID, secondaryTradeIDOffset, secondaryTradeIDLength);
            builder.append("\",\n");
        }

        if (hasFirmTradeID())
        {
            indent(builder, level);
            builder.append("\"FirmTradeID\": \"");
            appendBuffer(builder, firmTradeID, firmTradeIDOffset, firmTradeIDLength);
            builder.append("\",\n");
        }

        if (hasSecondaryFirmTradeID())
        {
            indent(builder, level);
            builder.append("\"SecondaryFirmTradeID\": \"");
            appendBuffer(builder, secondaryFirmTradeID, secondaryFirmTradeIDOffset, secondaryFirmTradeIDLength);
            builder.append("\",\n");
        }

        if (hasTradeRequestType())
        {
            indent(builder, level);
            builder.append("\"TradeRequestType\": \"");
            builder.append(tradeRequestType);
            builder.append("\",\n");
        }

        if (hasSubscriptionRequestType())
        {
            indent(builder, level);
            builder.append("\"SubscriptionRequestType\": \"");
            builder.append(subscriptionRequestType);
            builder.append("\",\n");
        }

        if (hasTotNumTradeReports())
        {
            indent(builder, level);
            builder.append("\"TotNumTradeReports\": \"");
            builder.append(totNumTradeReports);
            builder.append("\",\n");
        }

        if (hasTradeRequestResult())
        {
            indent(builder, level);
            builder.append("\"TradeRequestResult\": \"");
            builder.append(tradeRequestResult);
            builder.append("\",\n");
        }

        if (hasTradeRequestStatus())
        {
            indent(builder, level);
            builder.append("\"TradeRequestStatus\": \"");
            builder.append(tradeRequestStatus);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"Instrument\": ");
    instrument.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"UndInstrmtGrp\": ");
    undInstrmtGrp.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"InstrmtLegGrp\": ");
    instrmtLegGrp.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasMultiLegReportingType())
        {
            indent(builder, level);
            builder.append("\"MultiLegReportingType\": \"");
            builder.append(multiLegReportingType);
            builder.append("\",\n");
        }

        if (hasResponseTransportType())
        {
            indent(builder, level);
            builder.append("\"ResponseTransportType\": \"");
            builder.append(responseTransportType);
            builder.append("\",\n");
        }

        if (hasResponseDestination())
        {
            indent(builder, level);
            builder.append("\"ResponseDestination\": \"");
            appendBuffer(builder, responseDestination, responseDestinationOffset, responseDestinationLength);
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

        if (hasMessageEventSource())
        {
            indent(builder, level);
            builder.append("\"MessageEventSource\": \"");
            appendBuffer(builder, messageEventSource, messageEventSourceOffset, messageEventSourceLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public TradeCaptureReportRequestAckEncoder copyTo(final Encoder encoder)
    {
        return copyTo((TradeCaptureReportRequestAckEncoder)encoder);
    }

    public TradeCaptureReportRequestAckEncoder copyTo(final TradeCaptureReportRequestAckEncoder encoder)
    {
        encoder.reset();
        if (hasTradeRequestID())
        {
            encoder.tradeRequestIDAsCopy(tradeRequestID.byteArray(), 0, tradeRequestIDLength);
        }

        if (hasTradeID())
        {
            encoder.tradeIDAsCopy(tradeID.byteArray(), 0, tradeIDLength);
        }

        if (hasSecondaryTradeID())
        {
            encoder.secondaryTradeIDAsCopy(secondaryTradeID.byteArray(), 0, secondaryTradeIDLength);
        }

        if (hasFirmTradeID())
        {
            encoder.firmTradeIDAsCopy(firmTradeID.byteArray(), 0, firmTradeIDLength);
        }

        if (hasSecondaryFirmTradeID())
        {
            encoder.secondaryFirmTradeIDAsCopy(secondaryFirmTradeID.byteArray(), 0, secondaryFirmTradeIDLength);
        }

        if (hasTradeRequestType())
        {
            encoder.tradeRequestType(this.tradeRequestType());
        }

        if (hasSubscriptionRequestType())
        {
            encoder.subscriptionRequestType(this.subscriptionRequestType());
        }

        if (hasTotNumTradeReports())
        {
            encoder.totNumTradeReports(this.totNumTradeReports());
        }

        if (hasTradeRequestResult())
        {
            encoder.tradeRequestResult(this.tradeRequestResult());
        }

        if (hasTradeRequestStatus())
        {
            encoder.tradeRequestStatus(this.tradeRequestStatus());
        }


        instrument.copyTo(encoder.instrument());

        undInstrmtGrp.copyTo(encoder.undInstrmtGrp());

        instrmtLegGrp.copyTo(encoder.instrmtLegGrp());
        if (hasMultiLegReportingType())
        {
            encoder.multiLegReportingType(this.multiLegReportingType());
        }

        if (hasResponseTransportType())
        {
            encoder.responseTransportType(this.responseTransportType());
        }

        if (hasResponseDestination())
        {
            encoder.responseDestinationAsCopy(responseDestination.byteArray(), 0, responseDestinationLength);
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

        if (hasMessageEventSource())
        {
            encoder.messageEventSourceAsCopy(messageEventSource.byteArray(), 0, messageEventSourceLength);
        }
        return encoder;
    }

}
