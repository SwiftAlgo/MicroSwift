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


public class TradeCaptureReportRequestEncoder implements Encoder
{
    public long messageType()
    {
        return 17473L;
    }

    public TradeCaptureReportRequestEncoder()
    {
        header.msgType("AD");
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

    private static final int tradeReportIDHeaderLength = 4;
    private static final byte[] tradeReportIDHeader = new byte[] {53, 55, 49, (byte) '='};

    private static final int secondaryTradeReportIDHeaderLength = 4;
    private static final byte[] secondaryTradeReportIDHeader = new byte[] {56, 49, 56, (byte) '='};

    private static final int execIDHeaderLength = 3;
    private static final byte[] execIDHeader = new byte[] {49, 55, (byte) '='};

    private static final int execTypeHeaderLength = 4;
    private static final byte[] execTypeHeader = new byte[] {49, 53, 48, (byte) '='};

    private static final int orderIDHeaderLength = 3;
    private static final byte[] orderIDHeader = new byte[] {51, 55, (byte) '='};

    private static final int clOrdIDHeaderLength = 3;
    private static final byte[] clOrdIDHeader = new byte[] {49, 49, (byte) '='};

    private static final int matchStatusHeaderLength = 4;
    private static final byte[] matchStatusHeader = new byte[] {53, 55, 51, (byte) '='};

    private static final int trdTypeHeaderLength = 4;
    private static final byte[] trdTypeHeader = new byte[] {56, 50, 56, (byte) '='};

    private static final int trdSubTypeHeaderLength = 4;
    private static final byte[] trdSubTypeHeader = new byte[] {56, 50, 57, (byte) '='};

    private static final int tradeHandlingInstrHeaderLength = 5;
    private static final byte[] tradeHandlingInstrHeader = new byte[] {49, 49, 50, 51, (byte) '='};

    private static final int transferReasonHeaderLength = 4;
    private static final byte[] transferReasonHeader = new byte[] {56, 51, 48, (byte) '='};

    private static final int secondaryTrdTypeHeaderLength = 4;
    private static final byte[] secondaryTrdTypeHeader = new byte[] {56, 53, 53, (byte) '='};

    private static final int tradeLinkIDHeaderLength = 4;
    private static final byte[] tradeLinkIDHeader = new byte[] {56, 50, 48, (byte) '='};

    private static final int trdMatchIDHeaderLength = 4;
    private static final byte[] trdMatchIDHeader = new byte[] {56, 56, 48, (byte) '='};

    private static final int clearingBusinessDateHeaderLength = 4;
    private static final byte[] clearingBusinessDateHeader = new byte[] {55, 49, 53, (byte) '='};

    private static final int tradingSessionIDHeaderLength = 4;
    private static final byte[] tradingSessionIDHeader = new byte[] {51, 51, 54, (byte) '='};

    private static final int tradingSessionSubIDHeaderLength = 4;
    private static final byte[] tradingSessionSubIDHeader = new byte[] {54, 50, 53, (byte) '='};

    private static final int timeBracketHeaderLength = 4;
    private static final byte[] timeBracketHeader = new byte[] {57, 52, 51, (byte) '='};

    private static final int sideHeaderLength = 3;
    private static final byte[] sideHeader = new byte[] {53, 52, (byte) '='};

    private static final int multiLegReportingTypeHeaderLength = 4;
    private static final byte[] multiLegReportingTypeHeader = new byte[] {52, 52, 50, (byte) '='};

    private static final int tradeInputSourceHeaderLength = 4;
    private static final byte[] tradeInputSourceHeader = new byte[] {53, 55, 56, (byte) '='};

    private static final int tradeInputDeviceHeaderLength = 4;
    private static final byte[] tradeInputDeviceHeader = new byte[] {53, 55, 57, (byte) '='};

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

    public TradeCaptureReportRequestEncoder tradeRequestID(final DirectBuffer value, final int offset, final int length)
    {
        tradeRequestID.wrap(value);
        tradeRequestIDOffset = offset;
        tradeRequestIDLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder tradeRequestID(final DirectBuffer value, final int length)
    {
        return tradeRequestID(value, 0, length);
    }

    public TradeCaptureReportRequestEncoder tradeRequestID(final DirectBuffer value)
    {
        return tradeRequestID(value, 0, value.capacity());
    }

    public TradeCaptureReportRequestEncoder tradeRequestID(final byte[] value, final int offset, final int length)
    {
        tradeRequestID.wrap(value);
        tradeRequestIDOffset = offset;
        tradeRequestIDLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder tradeRequestIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradeRequestID, value, offset, length);
        tradeRequestIDOffset = offset;
        tradeRequestIDLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder tradeRequestID(final byte[] value, final int length)
    {
        return tradeRequestID(value, 0, length);
    }

    public TradeCaptureReportRequestEncoder tradeRequestID(final byte[] value)
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

    public TradeCaptureReportRequestEncoder tradeRequestID(final CharSequence value)
    {
        toBytes(value, tradeRequestID);
        tradeRequestIDOffset = 0;
        tradeRequestIDLength = value.length();
        return this;
    }

    public TradeCaptureReportRequestEncoder tradeRequestID(final AsciiSequenceView value)
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

    public TradeCaptureReportRequestEncoder tradeRequestID(final char[] value)
    {
        return tradeRequestID(value, 0, value.length);
    }

    public TradeCaptureReportRequestEncoder tradeRequestID(final char[] value, final int length)
    {
        return tradeRequestID(value, 0, length);
    }

    public TradeCaptureReportRequestEncoder tradeRequestID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradeRequestID, offset, length);
        tradeRequestIDOffset = 0;
        tradeRequestIDLength = length;
        return this;
    }

    private final MutableDirectBuffer tradeID = new UnsafeBuffer();

    private int tradeIDOffset = 0;

    private int tradeIDLength = 0;

    public TradeCaptureReportRequestEncoder tradeID(final DirectBuffer value, final int offset, final int length)
    {
        tradeID.wrap(value);
        tradeIDOffset = offset;
        tradeIDLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder tradeID(final DirectBuffer value, final int length)
    {
        return tradeID(value, 0, length);
    }

    public TradeCaptureReportRequestEncoder tradeID(final DirectBuffer value)
    {
        return tradeID(value, 0, value.capacity());
    }

    public TradeCaptureReportRequestEncoder tradeID(final byte[] value, final int offset, final int length)
    {
        tradeID.wrap(value);
        tradeIDOffset = offset;
        tradeIDLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder tradeIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradeID, value, offset, length);
        tradeIDOffset = offset;
        tradeIDLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder tradeID(final byte[] value, final int length)
    {
        return tradeID(value, 0, length);
    }

    public TradeCaptureReportRequestEncoder tradeID(final byte[] value)
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

    public TradeCaptureReportRequestEncoder tradeID(final CharSequence value)
    {
        toBytes(value, tradeID);
        tradeIDOffset = 0;
        tradeIDLength = value.length();
        return this;
    }

    public TradeCaptureReportRequestEncoder tradeID(final AsciiSequenceView value)
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

    public TradeCaptureReportRequestEncoder tradeID(final char[] value)
    {
        return tradeID(value, 0, value.length);
    }

    public TradeCaptureReportRequestEncoder tradeID(final char[] value, final int length)
    {
        return tradeID(value, 0, length);
    }

    public TradeCaptureReportRequestEncoder tradeID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradeID, offset, length);
        tradeIDOffset = 0;
        tradeIDLength = length;
        return this;
    }

    private final MutableDirectBuffer secondaryTradeID = new UnsafeBuffer();

    private int secondaryTradeIDOffset = 0;

    private int secondaryTradeIDLength = 0;

    public TradeCaptureReportRequestEncoder secondaryTradeID(final DirectBuffer value, final int offset, final int length)
    {
        secondaryTradeID.wrap(value);
        secondaryTradeIDOffset = offset;
        secondaryTradeIDLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder secondaryTradeID(final DirectBuffer value, final int length)
    {
        return secondaryTradeID(value, 0, length);
    }

    public TradeCaptureReportRequestEncoder secondaryTradeID(final DirectBuffer value)
    {
        return secondaryTradeID(value, 0, value.capacity());
    }

    public TradeCaptureReportRequestEncoder secondaryTradeID(final byte[] value, final int offset, final int length)
    {
        secondaryTradeID.wrap(value);
        secondaryTradeIDOffset = offset;
        secondaryTradeIDLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder secondaryTradeIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(secondaryTradeID, value, offset, length);
        secondaryTradeIDOffset = offset;
        secondaryTradeIDLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder secondaryTradeID(final byte[] value, final int length)
    {
        return secondaryTradeID(value, 0, length);
    }

    public TradeCaptureReportRequestEncoder secondaryTradeID(final byte[] value)
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

    public TradeCaptureReportRequestEncoder secondaryTradeID(final CharSequence value)
    {
        toBytes(value, secondaryTradeID);
        secondaryTradeIDOffset = 0;
        secondaryTradeIDLength = value.length();
        return this;
    }

    public TradeCaptureReportRequestEncoder secondaryTradeID(final AsciiSequenceView value)
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

    public TradeCaptureReportRequestEncoder secondaryTradeID(final char[] value)
    {
        return secondaryTradeID(value, 0, value.length);
    }

    public TradeCaptureReportRequestEncoder secondaryTradeID(final char[] value, final int length)
    {
        return secondaryTradeID(value, 0, length);
    }

    public TradeCaptureReportRequestEncoder secondaryTradeID(final char[] value, final int offset, final int length)
    {
        toBytes(value, secondaryTradeID, offset, length);
        secondaryTradeIDOffset = 0;
        secondaryTradeIDLength = length;
        return this;
    }

    private final MutableDirectBuffer firmTradeID = new UnsafeBuffer();

    private int firmTradeIDOffset = 0;

    private int firmTradeIDLength = 0;

    public TradeCaptureReportRequestEncoder firmTradeID(final DirectBuffer value, final int offset, final int length)
    {
        firmTradeID.wrap(value);
        firmTradeIDOffset = offset;
        firmTradeIDLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder firmTradeID(final DirectBuffer value, final int length)
    {
        return firmTradeID(value, 0, length);
    }

    public TradeCaptureReportRequestEncoder firmTradeID(final DirectBuffer value)
    {
        return firmTradeID(value, 0, value.capacity());
    }

    public TradeCaptureReportRequestEncoder firmTradeID(final byte[] value, final int offset, final int length)
    {
        firmTradeID.wrap(value);
        firmTradeIDOffset = offset;
        firmTradeIDLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder firmTradeIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(firmTradeID, value, offset, length);
        firmTradeIDOffset = offset;
        firmTradeIDLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder firmTradeID(final byte[] value, final int length)
    {
        return firmTradeID(value, 0, length);
    }

    public TradeCaptureReportRequestEncoder firmTradeID(final byte[] value)
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

    public TradeCaptureReportRequestEncoder firmTradeID(final CharSequence value)
    {
        toBytes(value, firmTradeID);
        firmTradeIDOffset = 0;
        firmTradeIDLength = value.length();
        return this;
    }

    public TradeCaptureReportRequestEncoder firmTradeID(final AsciiSequenceView value)
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

    public TradeCaptureReportRequestEncoder firmTradeID(final char[] value)
    {
        return firmTradeID(value, 0, value.length);
    }

    public TradeCaptureReportRequestEncoder firmTradeID(final char[] value, final int length)
    {
        return firmTradeID(value, 0, length);
    }

    public TradeCaptureReportRequestEncoder firmTradeID(final char[] value, final int offset, final int length)
    {
        toBytes(value, firmTradeID, offset, length);
        firmTradeIDOffset = 0;
        firmTradeIDLength = length;
        return this;
    }

    private final MutableDirectBuffer secondaryFirmTradeID = new UnsafeBuffer();

    private int secondaryFirmTradeIDOffset = 0;

    private int secondaryFirmTradeIDLength = 0;

    public TradeCaptureReportRequestEncoder secondaryFirmTradeID(final DirectBuffer value, final int offset, final int length)
    {
        secondaryFirmTradeID.wrap(value);
        secondaryFirmTradeIDOffset = offset;
        secondaryFirmTradeIDLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder secondaryFirmTradeID(final DirectBuffer value, final int length)
    {
        return secondaryFirmTradeID(value, 0, length);
    }

    public TradeCaptureReportRequestEncoder secondaryFirmTradeID(final DirectBuffer value)
    {
        return secondaryFirmTradeID(value, 0, value.capacity());
    }

    public TradeCaptureReportRequestEncoder secondaryFirmTradeID(final byte[] value, final int offset, final int length)
    {
        secondaryFirmTradeID.wrap(value);
        secondaryFirmTradeIDOffset = offset;
        secondaryFirmTradeIDLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder secondaryFirmTradeIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(secondaryFirmTradeID, value, offset, length);
        secondaryFirmTradeIDOffset = offset;
        secondaryFirmTradeIDLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder secondaryFirmTradeID(final byte[] value, final int length)
    {
        return secondaryFirmTradeID(value, 0, length);
    }

    public TradeCaptureReportRequestEncoder secondaryFirmTradeID(final byte[] value)
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

    public TradeCaptureReportRequestEncoder secondaryFirmTradeID(final CharSequence value)
    {
        toBytes(value, secondaryFirmTradeID);
        secondaryFirmTradeIDOffset = 0;
        secondaryFirmTradeIDLength = value.length();
        return this;
    }

    public TradeCaptureReportRequestEncoder secondaryFirmTradeID(final AsciiSequenceView value)
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

    public TradeCaptureReportRequestEncoder secondaryFirmTradeID(final char[] value)
    {
        return secondaryFirmTradeID(value, 0, value.length);
    }

    public TradeCaptureReportRequestEncoder secondaryFirmTradeID(final char[] value, final int length)
    {
        return secondaryFirmTradeID(value, 0, length);
    }

    public TradeCaptureReportRequestEncoder secondaryFirmTradeID(final char[] value, final int offset, final int length)
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

    public TradeCaptureReportRequestEncoder tradeRequestType(int value)
    {
        tradeRequestType = value;
        hasTradeRequestType = true;
        return this;
    }

    public int tradeRequestType()
    {
        return tradeRequestType;
    }

    public TradeCaptureReportRequestEncoder tradeRequestType(TradeRequestType value)
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

    public TradeCaptureReportRequestEncoder subscriptionRequestType(char value)
    {
        subscriptionRequestType = value;
        hasSubscriptionRequestType = true;
        return this;
    }

    public char subscriptionRequestType()
    {
        return subscriptionRequestType;
    }

    public TradeCaptureReportRequestEncoder subscriptionRequestType(SubscriptionRequestType value)
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

    private final MutableDirectBuffer tradeReportID = new UnsafeBuffer();

    private int tradeReportIDOffset = 0;

    private int tradeReportIDLength = 0;

    public TradeCaptureReportRequestEncoder tradeReportID(final DirectBuffer value, final int offset, final int length)
    {
        tradeReportID.wrap(value);
        tradeReportIDOffset = offset;
        tradeReportIDLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder tradeReportID(final DirectBuffer value, final int length)
    {
        return tradeReportID(value, 0, length);
    }

    public TradeCaptureReportRequestEncoder tradeReportID(final DirectBuffer value)
    {
        return tradeReportID(value, 0, value.capacity());
    }

    public TradeCaptureReportRequestEncoder tradeReportID(final byte[] value, final int offset, final int length)
    {
        tradeReportID.wrap(value);
        tradeReportIDOffset = offset;
        tradeReportIDLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder tradeReportIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradeReportID, value, offset, length);
        tradeReportIDOffset = offset;
        tradeReportIDLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder tradeReportID(final byte[] value, final int length)
    {
        return tradeReportID(value, 0, length);
    }

    public TradeCaptureReportRequestEncoder tradeReportID(final byte[] value)
    {
        return tradeReportID(value, 0, value.length);
    }

    public boolean hasTradeReportID()
    {
        return tradeReportIDLength > 0;
    }

    public MutableDirectBuffer tradeReportID()
    {
        return tradeReportID;
    }

    public String tradeReportIDAsString()
    {
        return tradeReportID.getStringWithoutLengthAscii(tradeReportIDOffset, tradeReportIDLength);
    }

    public TradeCaptureReportRequestEncoder tradeReportID(final CharSequence value)
    {
        toBytes(value, tradeReportID);
        tradeReportIDOffset = 0;
        tradeReportIDLength = value.length();
        return this;
    }

    public TradeCaptureReportRequestEncoder tradeReportID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            tradeReportID.wrap(buffer);
            tradeReportIDOffset = value.offset();
            tradeReportIDLength = value.length();
        }
        return this;
    }

    public TradeCaptureReportRequestEncoder tradeReportID(final char[] value)
    {
        return tradeReportID(value, 0, value.length);
    }

    public TradeCaptureReportRequestEncoder tradeReportID(final char[] value, final int length)
    {
        return tradeReportID(value, 0, length);
    }

    public TradeCaptureReportRequestEncoder tradeReportID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradeReportID, offset, length);
        tradeReportIDOffset = 0;
        tradeReportIDLength = length;
        return this;
    }

    private final MutableDirectBuffer secondaryTradeReportID = new UnsafeBuffer();

    private int secondaryTradeReportIDOffset = 0;

    private int secondaryTradeReportIDLength = 0;

    public TradeCaptureReportRequestEncoder secondaryTradeReportID(final DirectBuffer value, final int offset, final int length)
    {
        secondaryTradeReportID.wrap(value);
        secondaryTradeReportIDOffset = offset;
        secondaryTradeReportIDLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder secondaryTradeReportID(final DirectBuffer value, final int length)
    {
        return secondaryTradeReportID(value, 0, length);
    }

    public TradeCaptureReportRequestEncoder secondaryTradeReportID(final DirectBuffer value)
    {
        return secondaryTradeReportID(value, 0, value.capacity());
    }

    public TradeCaptureReportRequestEncoder secondaryTradeReportID(final byte[] value, final int offset, final int length)
    {
        secondaryTradeReportID.wrap(value);
        secondaryTradeReportIDOffset = offset;
        secondaryTradeReportIDLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder secondaryTradeReportIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(secondaryTradeReportID, value, offset, length);
        secondaryTradeReportIDOffset = offset;
        secondaryTradeReportIDLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder secondaryTradeReportID(final byte[] value, final int length)
    {
        return secondaryTradeReportID(value, 0, length);
    }

    public TradeCaptureReportRequestEncoder secondaryTradeReportID(final byte[] value)
    {
        return secondaryTradeReportID(value, 0, value.length);
    }

    public boolean hasSecondaryTradeReportID()
    {
        return secondaryTradeReportIDLength > 0;
    }

    public MutableDirectBuffer secondaryTradeReportID()
    {
        return secondaryTradeReportID;
    }

    public String secondaryTradeReportIDAsString()
    {
        return secondaryTradeReportID.getStringWithoutLengthAscii(secondaryTradeReportIDOffset, secondaryTradeReportIDLength);
    }

    public TradeCaptureReportRequestEncoder secondaryTradeReportID(final CharSequence value)
    {
        toBytes(value, secondaryTradeReportID);
        secondaryTradeReportIDOffset = 0;
        secondaryTradeReportIDLength = value.length();
        return this;
    }

    public TradeCaptureReportRequestEncoder secondaryTradeReportID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            secondaryTradeReportID.wrap(buffer);
            secondaryTradeReportIDOffset = value.offset();
            secondaryTradeReportIDLength = value.length();
        }
        return this;
    }

    public TradeCaptureReportRequestEncoder secondaryTradeReportID(final char[] value)
    {
        return secondaryTradeReportID(value, 0, value.length);
    }

    public TradeCaptureReportRequestEncoder secondaryTradeReportID(final char[] value, final int length)
    {
        return secondaryTradeReportID(value, 0, length);
    }

    public TradeCaptureReportRequestEncoder secondaryTradeReportID(final char[] value, final int offset, final int length)
    {
        toBytes(value, secondaryTradeReportID, offset, length);
        secondaryTradeReportIDOffset = 0;
        secondaryTradeReportIDLength = length;
        return this;
    }

    private final MutableDirectBuffer execID = new UnsafeBuffer();

    private int execIDOffset = 0;

    private int execIDLength = 0;

    public TradeCaptureReportRequestEncoder execID(final DirectBuffer value, final int offset, final int length)
    {
        execID.wrap(value);
        execIDOffset = offset;
        execIDLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder execID(final DirectBuffer value, final int length)
    {
        return execID(value, 0, length);
    }

    public TradeCaptureReportRequestEncoder execID(final DirectBuffer value)
    {
        return execID(value, 0, value.capacity());
    }

    public TradeCaptureReportRequestEncoder execID(final byte[] value, final int offset, final int length)
    {
        execID.wrap(value);
        execIDOffset = offset;
        execIDLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder execIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(execID, value, offset, length);
        execIDOffset = offset;
        execIDLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder execID(final byte[] value, final int length)
    {
        return execID(value, 0, length);
    }

    public TradeCaptureReportRequestEncoder execID(final byte[] value)
    {
        return execID(value, 0, value.length);
    }

    public boolean hasExecID()
    {
        return execIDLength > 0;
    }

    public MutableDirectBuffer execID()
    {
        return execID;
    }

    public String execIDAsString()
    {
        return execID.getStringWithoutLengthAscii(execIDOffset, execIDLength);
    }

    public TradeCaptureReportRequestEncoder execID(final CharSequence value)
    {
        toBytes(value, execID);
        execIDOffset = 0;
        execIDLength = value.length();
        return this;
    }

    public TradeCaptureReportRequestEncoder execID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            execID.wrap(buffer);
            execIDOffset = value.offset();
            execIDLength = value.length();
        }
        return this;
    }

    public TradeCaptureReportRequestEncoder execID(final char[] value)
    {
        return execID(value, 0, value.length);
    }

    public TradeCaptureReportRequestEncoder execID(final char[] value, final int length)
    {
        return execID(value, 0, length);
    }

    public TradeCaptureReportRequestEncoder execID(final char[] value, final int offset, final int length)
    {
        toBytes(value, execID, offset, length);
        execIDOffset = 0;
        execIDLength = length;
        return this;
    }

    private char execType;

    private boolean hasExecType;

    public boolean hasExecType()
    {
        return hasExecType;
    }

    public TradeCaptureReportRequestEncoder execType(char value)
    {
        execType = value;
        hasExecType = true;
        return this;
    }

    public char execType()
    {
        return execType;
    }

    public TradeCaptureReportRequestEncoder execType(ExecType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == ExecType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: execType Value: " + value );
            }
            if (value == ExecType.NULL_VAL)
            {
                return this;
            }
        }
        return execType(value.representation());
    }

    private final MutableDirectBuffer orderID = new UnsafeBuffer();

    private int orderIDOffset = 0;

    private int orderIDLength = 0;

    public TradeCaptureReportRequestEncoder orderID(final DirectBuffer value, final int offset, final int length)
    {
        orderID.wrap(value);
        orderIDOffset = offset;
        orderIDLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder orderID(final DirectBuffer value, final int length)
    {
        return orderID(value, 0, length);
    }

    public TradeCaptureReportRequestEncoder orderID(final DirectBuffer value)
    {
        return orderID(value, 0, value.capacity());
    }

    public TradeCaptureReportRequestEncoder orderID(final byte[] value, final int offset, final int length)
    {
        orderID.wrap(value);
        orderIDOffset = offset;
        orderIDLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder orderIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(orderID, value, offset, length);
        orderIDOffset = offset;
        orderIDLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder orderID(final byte[] value, final int length)
    {
        return orderID(value, 0, length);
    }

    public TradeCaptureReportRequestEncoder orderID(final byte[] value)
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

    public TradeCaptureReportRequestEncoder orderID(final CharSequence value)
    {
        toBytes(value, orderID);
        orderIDOffset = 0;
        orderIDLength = value.length();
        return this;
    }

    public TradeCaptureReportRequestEncoder orderID(final AsciiSequenceView value)
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

    public TradeCaptureReportRequestEncoder orderID(final char[] value)
    {
        return orderID(value, 0, value.length);
    }

    public TradeCaptureReportRequestEncoder orderID(final char[] value, final int length)
    {
        return orderID(value, 0, length);
    }

    public TradeCaptureReportRequestEncoder orderID(final char[] value, final int offset, final int length)
    {
        toBytes(value, orderID, offset, length);
        orderIDOffset = 0;
        orderIDLength = length;
        return this;
    }

    private final MutableDirectBuffer clOrdID = new UnsafeBuffer();

    private int clOrdIDOffset = 0;

    private int clOrdIDLength = 0;

    public TradeCaptureReportRequestEncoder clOrdID(final DirectBuffer value, final int offset, final int length)
    {
        clOrdID.wrap(value);
        clOrdIDOffset = offset;
        clOrdIDLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder clOrdID(final DirectBuffer value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    public TradeCaptureReportRequestEncoder clOrdID(final DirectBuffer value)
    {
        return clOrdID(value, 0, value.capacity());
    }

    public TradeCaptureReportRequestEncoder clOrdID(final byte[] value, final int offset, final int length)
    {
        clOrdID.wrap(value);
        clOrdIDOffset = offset;
        clOrdIDLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder clOrdIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(clOrdID, value, offset, length);
        clOrdIDOffset = offset;
        clOrdIDLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder clOrdID(final byte[] value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    public TradeCaptureReportRequestEncoder clOrdID(final byte[] value)
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

    public TradeCaptureReportRequestEncoder clOrdID(final CharSequence value)
    {
        toBytes(value, clOrdID);
        clOrdIDOffset = 0;
        clOrdIDLength = value.length();
        return this;
    }

    public TradeCaptureReportRequestEncoder clOrdID(final AsciiSequenceView value)
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

    public TradeCaptureReportRequestEncoder clOrdID(final char[] value)
    {
        return clOrdID(value, 0, value.length);
    }

    public TradeCaptureReportRequestEncoder clOrdID(final char[] value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    public TradeCaptureReportRequestEncoder clOrdID(final char[] value, final int offset, final int length)
    {
        toBytes(value, clOrdID, offset, length);
        clOrdIDOffset = 0;
        clOrdIDLength = length;
        return this;
    }

    private char matchStatus;

    private boolean hasMatchStatus;

    public boolean hasMatchStatus()
    {
        return hasMatchStatus;
    }

    public TradeCaptureReportRequestEncoder matchStatus(char value)
    {
        matchStatus = value;
        hasMatchStatus = true;
        return this;
    }

    public char matchStatus()
    {
        return matchStatus;
    }

    public TradeCaptureReportRequestEncoder matchStatus(MatchStatus value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == MatchStatus.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: matchStatus Value: " + value );
            }
            if (value == MatchStatus.NULL_VAL)
            {
                return this;
            }
        }
        return matchStatus(value.representation());
    }

    private int trdType;

    private boolean hasTrdType;

    public boolean hasTrdType()
    {
        return hasTrdType;
    }

    public TradeCaptureReportRequestEncoder trdType(int value)
    {
        trdType = value;
        hasTrdType = true;
        return this;
    }

    public int trdType()
    {
        return trdType;
    }

    public TradeCaptureReportRequestEncoder trdType(TrdType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == TrdType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: trdType Value: " + value );
            }
            if (value == TrdType.NULL_VAL)
            {
                return this;
            }
        }
        return trdType(value.representation());
    }

    private int trdSubType;

    private boolean hasTrdSubType;

    public boolean hasTrdSubType()
    {
        return hasTrdSubType;
    }

    public TradeCaptureReportRequestEncoder trdSubType(int value)
    {
        trdSubType = value;
        hasTrdSubType = true;
        return this;
    }

    public int trdSubType()
    {
        return trdSubType;
    }

    public TradeCaptureReportRequestEncoder trdSubType(TrdSubType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == TrdSubType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: trdSubType Value: " + value );
            }
            if (value == TrdSubType.NULL_VAL)
            {
                return this;
            }
        }
        return trdSubType(value.representation());
    }

    private char tradeHandlingInstr;

    private boolean hasTradeHandlingInstr;

    public boolean hasTradeHandlingInstr()
    {
        return hasTradeHandlingInstr;
    }

    public TradeCaptureReportRequestEncoder tradeHandlingInstr(char value)
    {
        tradeHandlingInstr = value;
        hasTradeHandlingInstr = true;
        return this;
    }

    public char tradeHandlingInstr()
    {
        return tradeHandlingInstr;
    }

    public TradeCaptureReportRequestEncoder tradeHandlingInstr(TradeHandlingInstr value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == TradeHandlingInstr.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: tradeHandlingInstr Value: " + value );
            }
            if (value == TradeHandlingInstr.NULL_VAL)
            {
                return this;
            }
        }
        return tradeHandlingInstr(value.representation());
    }

    private final MutableDirectBuffer transferReason = new UnsafeBuffer();

    private int transferReasonOffset = 0;

    private int transferReasonLength = 0;

    public TradeCaptureReportRequestEncoder transferReason(final DirectBuffer value, final int offset, final int length)
    {
        transferReason.wrap(value);
        transferReasonOffset = offset;
        transferReasonLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder transferReason(final DirectBuffer value, final int length)
    {
        return transferReason(value, 0, length);
    }

    public TradeCaptureReportRequestEncoder transferReason(final DirectBuffer value)
    {
        return transferReason(value, 0, value.capacity());
    }

    public TradeCaptureReportRequestEncoder transferReason(final byte[] value, final int offset, final int length)
    {
        transferReason.wrap(value);
        transferReasonOffset = offset;
        transferReasonLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder transferReasonAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(transferReason, value, offset, length);
        transferReasonOffset = offset;
        transferReasonLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder transferReason(final byte[] value, final int length)
    {
        return transferReason(value, 0, length);
    }

    public TradeCaptureReportRequestEncoder transferReason(final byte[] value)
    {
        return transferReason(value, 0, value.length);
    }

    public boolean hasTransferReason()
    {
        return transferReasonLength > 0;
    }

    public MutableDirectBuffer transferReason()
    {
        return transferReason;
    }

    public String transferReasonAsString()
    {
        return transferReason.getStringWithoutLengthAscii(transferReasonOffset, transferReasonLength);
    }

    public TradeCaptureReportRequestEncoder transferReason(final CharSequence value)
    {
        toBytes(value, transferReason);
        transferReasonOffset = 0;
        transferReasonLength = value.length();
        return this;
    }

    public TradeCaptureReportRequestEncoder transferReason(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            transferReason.wrap(buffer);
            transferReasonOffset = value.offset();
            transferReasonLength = value.length();
        }
        return this;
    }

    public TradeCaptureReportRequestEncoder transferReason(final char[] value)
    {
        return transferReason(value, 0, value.length);
    }

    public TradeCaptureReportRequestEncoder transferReason(final char[] value, final int length)
    {
        return transferReason(value, 0, length);
    }

    public TradeCaptureReportRequestEncoder transferReason(final char[] value, final int offset, final int length)
    {
        toBytes(value, transferReason, offset, length);
        transferReasonOffset = 0;
        transferReasonLength = length;
        return this;
    }

    private int secondaryTrdType;

    private boolean hasSecondaryTrdType;

    public boolean hasSecondaryTrdType()
    {
        return hasSecondaryTrdType;
    }

    public TradeCaptureReportRequestEncoder secondaryTrdType(int value)
    {
        secondaryTrdType = value;
        hasSecondaryTrdType = true;
        return this;
    }

    public int secondaryTrdType()
    {
        return secondaryTrdType;
    }

    private final MutableDirectBuffer tradeLinkID = new UnsafeBuffer();

    private int tradeLinkIDOffset = 0;

    private int tradeLinkIDLength = 0;

    public TradeCaptureReportRequestEncoder tradeLinkID(final DirectBuffer value, final int offset, final int length)
    {
        tradeLinkID.wrap(value);
        tradeLinkIDOffset = offset;
        tradeLinkIDLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder tradeLinkID(final DirectBuffer value, final int length)
    {
        return tradeLinkID(value, 0, length);
    }

    public TradeCaptureReportRequestEncoder tradeLinkID(final DirectBuffer value)
    {
        return tradeLinkID(value, 0, value.capacity());
    }

    public TradeCaptureReportRequestEncoder tradeLinkID(final byte[] value, final int offset, final int length)
    {
        tradeLinkID.wrap(value);
        tradeLinkIDOffset = offset;
        tradeLinkIDLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder tradeLinkIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradeLinkID, value, offset, length);
        tradeLinkIDOffset = offset;
        tradeLinkIDLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder tradeLinkID(final byte[] value, final int length)
    {
        return tradeLinkID(value, 0, length);
    }

    public TradeCaptureReportRequestEncoder tradeLinkID(final byte[] value)
    {
        return tradeLinkID(value, 0, value.length);
    }

    public boolean hasTradeLinkID()
    {
        return tradeLinkIDLength > 0;
    }

    public MutableDirectBuffer tradeLinkID()
    {
        return tradeLinkID;
    }

    public String tradeLinkIDAsString()
    {
        return tradeLinkID.getStringWithoutLengthAscii(tradeLinkIDOffset, tradeLinkIDLength);
    }

    public TradeCaptureReportRequestEncoder tradeLinkID(final CharSequence value)
    {
        toBytes(value, tradeLinkID);
        tradeLinkIDOffset = 0;
        tradeLinkIDLength = value.length();
        return this;
    }

    public TradeCaptureReportRequestEncoder tradeLinkID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            tradeLinkID.wrap(buffer);
            tradeLinkIDOffset = value.offset();
            tradeLinkIDLength = value.length();
        }
        return this;
    }

    public TradeCaptureReportRequestEncoder tradeLinkID(final char[] value)
    {
        return tradeLinkID(value, 0, value.length);
    }

    public TradeCaptureReportRequestEncoder tradeLinkID(final char[] value, final int length)
    {
        return tradeLinkID(value, 0, length);
    }

    public TradeCaptureReportRequestEncoder tradeLinkID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradeLinkID, offset, length);
        tradeLinkIDOffset = 0;
        tradeLinkIDLength = length;
        return this;
    }

    private final MutableDirectBuffer trdMatchID = new UnsafeBuffer();

    private int trdMatchIDOffset = 0;

    private int trdMatchIDLength = 0;

    public TradeCaptureReportRequestEncoder trdMatchID(final DirectBuffer value, final int offset, final int length)
    {
        trdMatchID.wrap(value);
        trdMatchIDOffset = offset;
        trdMatchIDLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder trdMatchID(final DirectBuffer value, final int length)
    {
        return trdMatchID(value, 0, length);
    }

    public TradeCaptureReportRequestEncoder trdMatchID(final DirectBuffer value)
    {
        return trdMatchID(value, 0, value.capacity());
    }

    public TradeCaptureReportRequestEncoder trdMatchID(final byte[] value, final int offset, final int length)
    {
        trdMatchID.wrap(value);
        trdMatchIDOffset = offset;
        trdMatchIDLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder trdMatchIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(trdMatchID, value, offset, length);
        trdMatchIDOffset = offset;
        trdMatchIDLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder trdMatchID(final byte[] value, final int length)
    {
        return trdMatchID(value, 0, length);
    }

    public TradeCaptureReportRequestEncoder trdMatchID(final byte[] value)
    {
        return trdMatchID(value, 0, value.length);
    }

    public boolean hasTrdMatchID()
    {
        return trdMatchIDLength > 0;
    }

    public MutableDirectBuffer trdMatchID()
    {
        return trdMatchID;
    }

    public String trdMatchIDAsString()
    {
        return trdMatchID.getStringWithoutLengthAscii(trdMatchIDOffset, trdMatchIDLength);
    }

    public TradeCaptureReportRequestEncoder trdMatchID(final CharSequence value)
    {
        toBytes(value, trdMatchID);
        trdMatchIDOffset = 0;
        trdMatchIDLength = value.length();
        return this;
    }

    public TradeCaptureReportRequestEncoder trdMatchID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            trdMatchID.wrap(buffer);
            trdMatchIDOffset = value.offset();
            trdMatchIDLength = value.length();
        }
        return this;
    }

    public TradeCaptureReportRequestEncoder trdMatchID(final char[] value)
    {
        return trdMatchID(value, 0, value.length);
    }

    public TradeCaptureReportRequestEncoder trdMatchID(final char[] value, final int length)
    {
        return trdMatchID(value, 0, length);
    }

    public TradeCaptureReportRequestEncoder trdMatchID(final char[] value, final int offset, final int length)
    {
        toBytes(value, trdMatchID, offset, length);
        trdMatchIDOffset = 0;
        trdMatchIDLength = length;
        return this;
    }

    private final PartiesEncoder parties = new PartiesEncoder();
    public PartiesEncoder parties()
    {
        return parties;
    }

    private final InstrumentEncoder instrument = new InstrumentEncoder();
    public InstrumentEncoder instrument()
    {
        return instrument;
    }

    private final InstrumentExtensionEncoder instrumentExtension = new InstrumentExtensionEncoder();
    public InstrumentExtensionEncoder instrumentExtension()
    {
        return instrumentExtension;
    }

    private final FinancingDetailsEncoder financingDetails = new FinancingDetailsEncoder();
    public FinancingDetailsEncoder financingDetails()
    {
        return financingDetails;
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

    private final TrdCapDtGrpEncoder trdCapDtGrp = new TrdCapDtGrpEncoder();
    public TrdCapDtGrpEncoder trdCapDtGrp()
    {
        return trdCapDtGrp;
    }

    private final MutableDirectBuffer clearingBusinessDate = new UnsafeBuffer();

    private int clearingBusinessDateOffset = 0;

    private int clearingBusinessDateLength = 0;

    public TradeCaptureReportRequestEncoder clearingBusinessDate(final DirectBuffer value, final int offset, final int length)
    {
        clearingBusinessDate.wrap(value);
        clearingBusinessDateOffset = offset;
        clearingBusinessDateLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder clearingBusinessDate(final DirectBuffer value, final int length)
    {
        return clearingBusinessDate(value, 0, length);
    }

    public TradeCaptureReportRequestEncoder clearingBusinessDate(final DirectBuffer value)
    {
        return clearingBusinessDate(value, 0, value.capacity());
    }

    public TradeCaptureReportRequestEncoder clearingBusinessDate(final byte[] value, final int offset, final int length)
    {
        clearingBusinessDate.wrap(value);
        clearingBusinessDateOffset = offset;
        clearingBusinessDateLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder clearingBusinessDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(clearingBusinessDate, value, offset, length);
        clearingBusinessDateOffset = offset;
        clearingBusinessDateLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder clearingBusinessDate(final byte[] value, final int length)
    {
        return clearingBusinessDate(value, 0, length);
    }

    public TradeCaptureReportRequestEncoder clearingBusinessDate(final byte[] value)
    {
        return clearingBusinessDate(value, 0, value.length);
    }

    public boolean hasClearingBusinessDate()
    {
        return clearingBusinessDateLength > 0;
    }

    public MutableDirectBuffer clearingBusinessDate()
    {
        return clearingBusinessDate;
    }

    public String clearingBusinessDateAsString()
    {
        return clearingBusinessDate.getStringWithoutLengthAscii(clearingBusinessDateOffset, clearingBusinessDateLength);
    }

    private final MutableDirectBuffer tradingSessionID = new UnsafeBuffer();

    private int tradingSessionIDOffset = 0;

    private int tradingSessionIDLength = 0;

    public TradeCaptureReportRequestEncoder tradingSessionID(final DirectBuffer value, final int offset, final int length)
    {
        tradingSessionID.wrap(value);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder tradingSessionID(final DirectBuffer value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public TradeCaptureReportRequestEncoder tradingSessionID(final DirectBuffer value)
    {
        return tradingSessionID(value, 0, value.capacity());
    }

    public TradeCaptureReportRequestEncoder tradingSessionID(final byte[] value, final int offset, final int length)
    {
        tradingSessionID.wrap(value);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder tradingSessionIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradingSessionID, value, offset, length);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder tradingSessionID(final byte[] value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public TradeCaptureReportRequestEncoder tradingSessionID(final byte[] value)
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

    public TradeCaptureReportRequestEncoder tradingSessionID(final CharSequence value)
    {
        toBytes(value, tradingSessionID);
        tradingSessionIDOffset = 0;
        tradingSessionIDLength = value.length();
        return this;
    }

    public TradeCaptureReportRequestEncoder tradingSessionID(final AsciiSequenceView value)
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

    public TradeCaptureReportRequestEncoder tradingSessionID(final char[] value)
    {
        return tradingSessionID(value, 0, value.length);
    }

    public TradeCaptureReportRequestEncoder tradingSessionID(final char[] value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public TradeCaptureReportRequestEncoder tradingSessionID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradingSessionID, offset, length);
        tradingSessionIDOffset = 0;
        tradingSessionIDLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder tradingSessionID(TradingSessionID value)
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

    public TradeCaptureReportRequestEncoder tradingSessionSubID(final DirectBuffer value, final int offset, final int length)
    {
        tradingSessionSubID.wrap(value);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder tradingSessionSubID(final DirectBuffer value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public TradeCaptureReportRequestEncoder tradingSessionSubID(final DirectBuffer value)
    {
        return tradingSessionSubID(value, 0, value.capacity());
    }

    public TradeCaptureReportRequestEncoder tradingSessionSubID(final byte[] value, final int offset, final int length)
    {
        tradingSessionSubID.wrap(value);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder tradingSessionSubIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradingSessionSubID, value, offset, length);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder tradingSessionSubID(final byte[] value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public TradeCaptureReportRequestEncoder tradingSessionSubID(final byte[] value)
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

    public TradeCaptureReportRequestEncoder tradingSessionSubID(final CharSequence value)
    {
        toBytes(value, tradingSessionSubID);
        tradingSessionSubIDOffset = 0;
        tradingSessionSubIDLength = value.length();
        return this;
    }

    public TradeCaptureReportRequestEncoder tradingSessionSubID(final AsciiSequenceView value)
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

    public TradeCaptureReportRequestEncoder tradingSessionSubID(final char[] value)
    {
        return tradingSessionSubID(value, 0, value.length);
    }

    public TradeCaptureReportRequestEncoder tradingSessionSubID(final char[] value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public TradeCaptureReportRequestEncoder tradingSessionSubID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradingSessionSubID, offset, length);
        tradingSessionSubIDOffset = 0;
        tradingSessionSubIDLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder tradingSessionSubID(TradingSessionSubID value)
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

    private final MutableDirectBuffer timeBracket = new UnsafeBuffer();

    private int timeBracketOffset = 0;

    private int timeBracketLength = 0;

    public TradeCaptureReportRequestEncoder timeBracket(final DirectBuffer value, final int offset, final int length)
    {
        timeBracket.wrap(value);
        timeBracketOffset = offset;
        timeBracketLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder timeBracket(final DirectBuffer value, final int length)
    {
        return timeBracket(value, 0, length);
    }

    public TradeCaptureReportRequestEncoder timeBracket(final DirectBuffer value)
    {
        return timeBracket(value, 0, value.capacity());
    }

    public TradeCaptureReportRequestEncoder timeBracket(final byte[] value, final int offset, final int length)
    {
        timeBracket.wrap(value);
        timeBracketOffset = offset;
        timeBracketLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder timeBracketAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(timeBracket, value, offset, length);
        timeBracketOffset = offset;
        timeBracketLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder timeBracket(final byte[] value, final int length)
    {
        return timeBracket(value, 0, length);
    }

    public TradeCaptureReportRequestEncoder timeBracket(final byte[] value)
    {
        return timeBracket(value, 0, value.length);
    }

    public boolean hasTimeBracket()
    {
        return timeBracketLength > 0;
    }

    public MutableDirectBuffer timeBracket()
    {
        return timeBracket;
    }

    public String timeBracketAsString()
    {
        return timeBracket.getStringWithoutLengthAscii(timeBracketOffset, timeBracketLength);
    }

    public TradeCaptureReportRequestEncoder timeBracket(final CharSequence value)
    {
        toBytes(value, timeBracket);
        timeBracketOffset = 0;
        timeBracketLength = value.length();
        return this;
    }

    public TradeCaptureReportRequestEncoder timeBracket(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            timeBracket.wrap(buffer);
            timeBracketOffset = value.offset();
            timeBracketLength = value.length();
        }
        return this;
    }

    public TradeCaptureReportRequestEncoder timeBracket(final char[] value)
    {
        return timeBracket(value, 0, value.length);
    }

    public TradeCaptureReportRequestEncoder timeBracket(final char[] value, final int length)
    {
        return timeBracket(value, 0, length);
    }

    public TradeCaptureReportRequestEncoder timeBracket(final char[] value, final int offset, final int length)
    {
        toBytes(value, timeBracket, offset, length);
        timeBracketOffset = 0;
        timeBracketLength = length;
        return this;
    }

    private char side;

    private boolean hasSide;

    public boolean hasSide()
    {
        return hasSide;
    }

    public TradeCaptureReportRequestEncoder side(char value)
    {
        side = value;
        hasSide = true;
        return this;
    }

    public char side()
    {
        return side;
    }

    public TradeCaptureReportRequestEncoder side(Side value)
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

    private char multiLegReportingType;

    private boolean hasMultiLegReportingType;

    public boolean hasMultiLegReportingType()
    {
        return hasMultiLegReportingType;
    }

    public TradeCaptureReportRequestEncoder multiLegReportingType(char value)
    {
        multiLegReportingType = value;
        hasMultiLegReportingType = true;
        return this;
    }

    public char multiLegReportingType()
    {
        return multiLegReportingType;
    }

    public TradeCaptureReportRequestEncoder multiLegReportingType(MultiLegReportingType value)
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

    private final MutableDirectBuffer tradeInputSource = new UnsafeBuffer();

    private int tradeInputSourceOffset = 0;

    private int tradeInputSourceLength = 0;

    public TradeCaptureReportRequestEncoder tradeInputSource(final DirectBuffer value, final int offset, final int length)
    {
        tradeInputSource.wrap(value);
        tradeInputSourceOffset = offset;
        tradeInputSourceLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder tradeInputSource(final DirectBuffer value, final int length)
    {
        return tradeInputSource(value, 0, length);
    }

    public TradeCaptureReportRequestEncoder tradeInputSource(final DirectBuffer value)
    {
        return tradeInputSource(value, 0, value.capacity());
    }

    public TradeCaptureReportRequestEncoder tradeInputSource(final byte[] value, final int offset, final int length)
    {
        tradeInputSource.wrap(value);
        tradeInputSourceOffset = offset;
        tradeInputSourceLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder tradeInputSourceAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradeInputSource, value, offset, length);
        tradeInputSourceOffset = offset;
        tradeInputSourceLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder tradeInputSource(final byte[] value, final int length)
    {
        return tradeInputSource(value, 0, length);
    }

    public TradeCaptureReportRequestEncoder tradeInputSource(final byte[] value)
    {
        return tradeInputSource(value, 0, value.length);
    }

    public boolean hasTradeInputSource()
    {
        return tradeInputSourceLength > 0;
    }

    public MutableDirectBuffer tradeInputSource()
    {
        return tradeInputSource;
    }

    public String tradeInputSourceAsString()
    {
        return tradeInputSource.getStringWithoutLengthAscii(tradeInputSourceOffset, tradeInputSourceLength);
    }

    public TradeCaptureReportRequestEncoder tradeInputSource(final CharSequence value)
    {
        toBytes(value, tradeInputSource);
        tradeInputSourceOffset = 0;
        tradeInputSourceLength = value.length();
        return this;
    }

    public TradeCaptureReportRequestEncoder tradeInputSource(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            tradeInputSource.wrap(buffer);
            tradeInputSourceOffset = value.offset();
            tradeInputSourceLength = value.length();
        }
        return this;
    }

    public TradeCaptureReportRequestEncoder tradeInputSource(final char[] value)
    {
        return tradeInputSource(value, 0, value.length);
    }

    public TradeCaptureReportRequestEncoder tradeInputSource(final char[] value, final int length)
    {
        return tradeInputSource(value, 0, length);
    }

    public TradeCaptureReportRequestEncoder tradeInputSource(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradeInputSource, offset, length);
        tradeInputSourceOffset = 0;
        tradeInputSourceLength = length;
        return this;
    }

    private final MutableDirectBuffer tradeInputDevice = new UnsafeBuffer();

    private int tradeInputDeviceOffset = 0;

    private int tradeInputDeviceLength = 0;

    public TradeCaptureReportRequestEncoder tradeInputDevice(final DirectBuffer value, final int offset, final int length)
    {
        tradeInputDevice.wrap(value);
        tradeInputDeviceOffset = offset;
        tradeInputDeviceLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder tradeInputDevice(final DirectBuffer value, final int length)
    {
        return tradeInputDevice(value, 0, length);
    }

    public TradeCaptureReportRequestEncoder tradeInputDevice(final DirectBuffer value)
    {
        return tradeInputDevice(value, 0, value.capacity());
    }

    public TradeCaptureReportRequestEncoder tradeInputDevice(final byte[] value, final int offset, final int length)
    {
        tradeInputDevice.wrap(value);
        tradeInputDeviceOffset = offset;
        tradeInputDeviceLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder tradeInputDeviceAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradeInputDevice, value, offset, length);
        tradeInputDeviceOffset = offset;
        tradeInputDeviceLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder tradeInputDevice(final byte[] value, final int length)
    {
        return tradeInputDevice(value, 0, length);
    }

    public TradeCaptureReportRequestEncoder tradeInputDevice(final byte[] value)
    {
        return tradeInputDevice(value, 0, value.length);
    }

    public boolean hasTradeInputDevice()
    {
        return tradeInputDeviceLength > 0;
    }

    public MutableDirectBuffer tradeInputDevice()
    {
        return tradeInputDevice;
    }

    public String tradeInputDeviceAsString()
    {
        return tradeInputDevice.getStringWithoutLengthAscii(tradeInputDeviceOffset, tradeInputDeviceLength);
    }

    public TradeCaptureReportRequestEncoder tradeInputDevice(final CharSequence value)
    {
        toBytes(value, tradeInputDevice);
        tradeInputDeviceOffset = 0;
        tradeInputDeviceLength = value.length();
        return this;
    }

    public TradeCaptureReportRequestEncoder tradeInputDevice(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            tradeInputDevice.wrap(buffer);
            tradeInputDeviceOffset = value.offset();
            tradeInputDeviceLength = value.length();
        }
        return this;
    }

    public TradeCaptureReportRequestEncoder tradeInputDevice(final char[] value)
    {
        return tradeInputDevice(value, 0, value.length);
    }

    public TradeCaptureReportRequestEncoder tradeInputDevice(final char[] value, final int length)
    {
        return tradeInputDevice(value, 0, length);
    }

    public TradeCaptureReportRequestEncoder tradeInputDevice(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradeInputDevice, offset, length);
        tradeInputDeviceOffset = 0;
        tradeInputDeviceLength = length;
        return this;
    }

    private int responseTransportType;

    private boolean hasResponseTransportType;

    public boolean hasResponseTransportType()
    {
        return hasResponseTransportType;
    }

    public TradeCaptureReportRequestEncoder responseTransportType(int value)
    {
        responseTransportType = value;
        hasResponseTransportType = true;
        return this;
    }

    public int responseTransportType()
    {
        return responseTransportType;
    }

    public TradeCaptureReportRequestEncoder responseTransportType(ResponseTransportType value)
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

    public TradeCaptureReportRequestEncoder responseDestination(final DirectBuffer value, final int offset, final int length)
    {
        responseDestination.wrap(value);
        responseDestinationOffset = offset;
        responseDestinationLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder responseDestination(final DirectBuffer value, final int length)
    {
        return responseDestination(value, 0, length);
    }

    public TradeCaptureReportRequestEncoder responseDestination(final DirectBuffer value)
    {
        return responseDestination(value, 0, value.capacity());
    }

    public TradeCaptureReportRequestEncoder responseDestination(final byte[] value, final int offset, final int length)
    {
        responseDestination.wrap(value);
        responseDestinationOffset = offset;
        responseDestinationLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder responseDestinationAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(responseDestination, value, offset, length);
        responseDestinationOffset = offset;
        responseDestinationLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder responseDestination(final byte[] value, final int length)
    {
        return responseDestination(value, 0, length);
    }

    public TradeCaptureReportRequestEncoder responseDestination(final byte[] value)
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

    public TradeCaptureReportRequestEncoder responseDestination(final CharSequence value)
    {
        toBytes(value, responseDestination);
        responseDestinationOffset = 0;
        responseDestinationLength = value.length();
        return this;
    }

    public TradeCaptureReportRequestEncoder responseDestination(final AsciiSequenceView value)
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

    public TradeCaptureReportRequestEncoder responseDestination(final char[] value)
    {
        return responseDestination(value, 0, value.length);
    }

    public TradeCaptureReportRequestEncoder responseDestination(final char[] value, final int length)
    {
        return responseDestination(value, 0, length);
    }

    public TradeCaptureReportRequestEncoder responseDestination(final char[] value, final int offset, final int length)
    {
        toBytes(value, responseDestination, offset, length);
        responseDestinationOffset = 0;
        responseDestinationLength = length;
        return this;
    }

    private final MutableDirectBuffer text = new UnsafeBuffer();

    private int textOffset = 0;

    private int textLength = 0;

    public TradeCaptureReportRequestEncoder text(final DirectBuffer value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder text(final DirectBuffer value, final int length)
    {
        return text(value, 0, length);
    }

    public TradeCaptureReportRequestEncoder text(final DirectBuffer value)
    {
        return text(value, 0, value.capacity());
    }

    public TradeCaptureReportRequestEncoder text(final byte[] value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder textAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(text, value, offset, length);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder text(final byte[] value, final int length)
    {
        return text(value, 0, length);
    }

    public TradeCaptureReportRequestEncoder text(final byte[] value)
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

    public TradeCaptureReportRequestEncoder text(final CharSequence value)
    {
        toBytes(value, text);
        textOffset = 0;
        textLength = value.length();
        return this;
    }

    public TradeCaptureReportRequestEncoder text(final AsciiSequenceView value)
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

    public TradeCaptureReportRequestEncoder text(final char[] value)
    {
        return text(value, 0, value.length);
    }

    public TradeCaptureReportRequestEncoder text(final char[] value, final int length)
    {
        return text(value, 0, length);
    }

    public TradeCaptureReportRequestEncoder text(final char[] value, final int offset, final int length)
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

    public TradeCaptureReportRequestEncoder encodedTextLen(int value)
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

    public TradeCaptureReportRequestEncoder encodedText(byte[] value)
    {
        encodedText = value;
        hasEncodedText = true;
        return this;
    }

    public byte[] encodedText()
    {
        return encodedText;
    }

    public TradeCaptureReportRequestEncoder encodedTextAsCopy(final byte[] value, final int offset, final int length)
    {
        encodedText = copyInto(encodedText, value, offset, length);
        hasEncodedText = true;
        return this;
    }

    private final MutableDirectBuffer messageEventSource = new UnsafeBuffer();

    private int messageEventSourceOffset = 0;

    private int messageEventSourceLength = 0;

    public TradeCaptureReportRequestEncoder messageEventSource(final DirectBuffer value, final int offset, final int length)
    {
        messageEventSource.wrap(value);
        messageEventSourceOffset = offset;
        messageEventSourceLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder messageEventSource(final DirectBuffer value, final int length)
    {
        return messageEventSource(value, 0, length);
    }

    public TradeCaptureReportRequestEncoder messageEventSource(final DirectBuffer value)
    {
        return messageEventSource(value, 0, value.capacity());
    }

    public TradeCaptureReportRequestEncoder messageEventSource(final byte[] value, final int offset, final int length)
    {
        messageEventSource.wrap(value);
        messageEventSourceOffset = offset;
        messageEventSourceLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder messageEventSourceAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(messageEventSource, value, offset, length);
        messageEventSourceOffset = offset;
        messageEventSourceLength = length;
        return this;
    }

    public TradeCaptureReportRequestEncoder messageEventSource(final byte[] value, final int length)
    {
        return messageEventSource(value, 0, length);
    }

    public TradeCaptureReportRequestEncoder messageEventSource(final byte[] value)
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

    public TradeCaptureReportRequestEncoder messageEventSource(final CharSequence value)
    {
        toBytes(value, messageEventSource);
        messageEventSourceOffset = 0;
        messageEventSourceLength = value.length();
        return this;
    }

    public TradeCaptureReportRequestEncoder messageEventSource(final AsciiSequenceView value)
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

    public TradeCaptureReportRequestEncoder messageEventSource(final char[] value)
    {
        return messageEventSource(value, 0, value.length);
    }

    public TradeCaptureReportRequestEncoder messageEventSource(final char[] value, final int length)
    {
        return messageEventSource(value, 0, length);
    }

    public TradeCaptureReportRequestEncoder messageEventSource(final char[] value, final int offset, final int length)
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

        if (tradeReportIDLength > 0)
        {
            buffer.putBytes(position, tradeReportIDHeader, 0, tradeReportIDHeaderLength);
            position += tradeReportIDHeaderLength;
            buffer.putBytes(position, tradeReportID, tradeReportIDOffset, tradeReportIDLength);
            position += tradeReportIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (secondaryTradeReportIDLength > 0)
        {
            buffer.putBytes(position, secondaryTradeReportIDHeader, 0, secondaryTradeReportIDHeaderLength);
            position += secondaryTradeReportIDHeaderLength;
            buffer.putBytes(position, secondaryTradeReportID, secondaryTradeReportIDOffset, secondaryTradeReportIDLength);
            position += secondaryTradeReportIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (execIDLength > 0)
        {
            buffer.putBytes(position, execIDHeader, 0, execIDHeaderLength);
            position += execIDHeaderLength;
            buffer.putBytes(position, execID, execIDOffset, execIDLength);
            position += execIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasExecType)
        {
            buffer.putBytes(position, execTypeHeader, 0, execTypeHeaderLength);
            position += execTypeHeaderLength;
            position += buffer.putCharAscii(position, execType);
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

        if (clOrdIDLength > 0)
        {
            buffer.putBytes(position, clOrdIDHeader, 0, clOrdIDHeaderLength);
            position += clOrdIDHeaderLength;
            buffer.putBytes(position, clOrdID, clOrdIDOffset, clOrdIDLength);
            position += clOrdIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasMatchStatus)
        {
            buffer.putBytes(position, matchStatusHeader, 0, matchStatusHeaderLength);
            position += matchStatusHeaderLength;
            position += buffer.putCharAscii(position, matchStatus);
            buffer.putSeparator(position);
            position++;
        }

        if (hasTrdType)
        {
            buffer.putBytes(position, trdTypeHeader, 0, trdTypeHeaderLength);
            position += trdTypeHeaderLength;
            position += buffer.putIntAscii(position, trdType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasTrdSubType)
        {
            buffer.putBytes(position, trdSubTypeHeader, 0, trdSubTypeHeaderLength);
            position += trdSubTypeHeaderLength;
            position += buffer.putIntAscii(position, trdSubType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasTradeHandlingInstr)
        {
            buffer.putBytes(position, tradeHandlingInstrHeader, 0, tradeHandlingInstrHeaderLength);
            position += tradeHandlingInstrHeaderLength;
            position += buffer.putCharAscii(position, tradeHandlingInstr);
            buffer.putSeparator(position);
            position++;
        }

        if (transferReasonLength > 0)
        {
            buffer.putBytes(position, transferReasonHeader, 0, transferReasonHeaderLength);
            position += transferReasonHeaderLength;
            buffer.putBytes(position, transferReason, transferReasonOffset, transferReasonLength);
            position += transferReasonLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasSecondaryTrdType)
        {
            buffer.putBytes(position, secondaryTrdTypeHeader, 0, secondaryTrdTypeHeaderLength);
            position += secondaryTrdTypeHeaderLength;
            position += buffer.putIntAscii(position, secondaryTrdType);
            buffer.putSeparator(position);
            position++;
        }

        if (tradeLinkIDLength > 0)
        {
            buffer.putBytes(position, tradeLinkIDHeader, 0, tradeLinkIDHeaderLength);
            position += tradeLinkIDHeaderLength;
            buffer.putBytes(position, tradeLinkID, tradeLinkIDOffset, tradeLinkIDLength);
            position += tradeLinkIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (trdMatchIDLength > 0)
        {
            buffer.putBytes(position, trdMatchIDHeader, 0, trdMatchIDHeaderLength);
            position += trdMatchIDHeaderLength;
            buffer.putBytes(position, trdMatchID, trdMatchIDOffset, trdMatchIDLength);
            position += trdMatchIDLength;
            buffer.putSeparator(position);
            position++;
        }

            position += parties.encode(buffer, position);

            position += instrument.encode(buffer, position);

            position += instrumentExtension.encode(buffer, position);

            position += financingDetails.encode(buffer, position);

            position += undInstrmtGrp.encode(buffer, position);

            position += instrmtLegGrp.encode(buffer, position);

            position += trdCapDtGrp.encode(buffer, position);

        if (clearingBusinessDateLength > 0)
        {
            buffer.putBytes(position, clearingBusinessDateHeader, 0, clearingBusinessDateHeaderLength);
            position += clearingBusinessDateHeaderLength;
            buffer.putBytes(position, clearingBusinessDate, clearingBusinessDateOffset, clearingBusinessDateLength);
            position += clearingBusinessDateLength;
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

        if (timeBracketLength > 0)
        {
            buffer.putBytes(position, timeBracketHeader, 0, timeBracketHeaderLength);
            position += timeBracketHeaderLength;
            buffer.putBytes(position, timeBracket, timeBracketOffset, timeBracketLength);
            position += timeBracketLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasSide)
        {
            buffer.putBytes(position, sideHeader, 0, sideHeaderLength);
            position += sideHeaderLength;
            position += buffer.putCharAscii(position, side);
            buffer.putSeparator(position);
            position++;
        }

        if (hasMultiLegReportingType)
        {
            buffer.putBytes(position, multiLegReportingTypeHeader, 0, multiLegReportingTypeHeaderLength);
            position += multiLegReportingTypeHeaderLength;
            position += buffer.putCharAscii(position, multiLegReportingType);
            buffer.putSeparator(position);
            position++;
        }

        if (tradeInputSourceLength > 0)
        {
            buffer.putBytes(position, tradeInputSourceHeader, 0, tradeInputSourceHeaderLength);
            position += tradeInputSourceHeaderLength;
            buffer.putBytes(position, tradeInputSource, tradeInputSourceOffset, tradeInputSourceLength);
            position += tradeInputSourceLength;
            buffer.putSeparator(position);
            position++;
        }

        if (tradeInputDeviceLength > 0)
        {
            buffer.putBytes(position, tradeInputDeviceHeader, 0, tradeInputDeviceHeaderLength);
            position += tradeInputDeviceHeaderLength;
            buffer.putBytes(position, tradeInputDevice, tradeInputDeviceOffset, tradeInputDeviceLength);
            position += tradeInputDeviceLength;
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
        this.resetTradeReportID();
        this.resetSecondaryTradeReportID();
        this.resetExecID();
        this.resetExecType();
        this.resetOrderID();
        this.resetClOrdID();
        this.resetMatchStatus();
        this.resetTrdType();
        this.resetTrdSubType();
        this.resetTradeHandlingInstr();
        this.resetTransferReason();
        this.resetSecondaryTrdType();
        this.resetTradeLinkID();
        this.resetTrdMatchID();
        this.resetClearingBusinessDate();
        this.resetTradingSessionID();
        this.resetTradingSessionSubID();
        this.resetTimeBracket();
        this.resetSide();
        this.resetMultiLegReportingType();
        this.resetTradeInputSource();
        this.resetTradeInputDevice();
        this.resetResponseTransportType();
        this.resetResponseDestination();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        this.resetMessageEventSource();
        parties.reset();
        instrument.reset();
        instrumentExtension.reset();
        financingDetails.reset();
        undInstrmtGrp.reset();
        instrmtLegGrp.reset();
        trdCapDtGrp.reset();
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

    public void resetTradeReportID()
    {
        tradeReportIDLength = 0;
    }

    public void resetSecondaryTradeReportID()
    {
        secondaryTradeReportIDLength = 0;
    }

    public void resetExecID()
    {
        execIDLength = 0;
    }

    public void resetExecType()
    {
        hasExecType = false;
    }

    public void resetOrderID()
    {
        orderIDLength = 0;
    }

    public void resetClOrdID()
    {
        clOrdIDLength = 0;
    }

    public void resetMatchStatus()
    {
        hasMatchStatus = false;
    }

    public void resetTrdType()
    {
        hasTrdType = false;
    }

    public void resetTrdSubType()
    {
        hasTrdSubType = false;
    }

    public void resetTradeHandlingInstr()
    {
        hasTradeHandlingInstr = false;
    }

    public void resetTransferReason()
    {
        transferReasonLength = 0;
    }

    public void resetSecondaryTrdType()
    {
        hasSecondaryTrdType = false;
    }

    public void resetTradeLinkID()
    {
        tradeLinkIDLength = 0;
    }

    public void resetTrdMatchID()
    {
        trdMatchIDLength = 0;
    }

    public void resetClearingBusinessDate()
    {
        clearingBusinessDateLength = 0;
    }

    public void resetTradingSessionID()
    {
        tradingSessionIDLength = 0;
    }

    public void resetTradingSessionSubID()
    {
        tradingSessionSubIDLength = 0;
    }

    public void resetTimeBracket()
    {
        timeBracketLength = 0;
    }

    public void resetSide()
    {
        hasSide = false;
    }

    public void resetMultiLegReportingType()
    {
        hasMultiLegReportingType = false;
    }

    public void resetTradeInputSource()
    {
        tradeInputSourceLength = 0;
    }

    public void resetTradeInputDevice()
    {
        tradeInputDeviceLength = 0;
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
        builder.append("\"MessageName\": \"TradeCaptureReportRequest\",\n");
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

        if (hasTradeReportID())
        {
            indent(builder, level);
            builder.append("\"TradeReportID\": \"");
            appendBuffer(builder, tradeReportID, tradeReportIDOffset, tradeReportIDLength);
            builder.append("\",\n");
        }

        if (hasSecondaryTradeReportID())
        {
            indent(builder, level);
            builder.append("\"SecondaryTradeReportID\": \"");
            appendBuffer(builder, secondaryTradeReportID, secondaryTradeReportIDOffset, secondaryTradeReportIDLength);
            builder.append("\",\n");
        }

        if (hasExecID())
        {
            indent(builder, level);
            builder.append("\"ExecID\": \"");
            appendBuffer(builder, execID, execIDOffset, execIDLength);
            builder.append("\",\n");
        }

        if (hasExecType())
        {
            indent(builder, level);
            builder.append("\"ExecType\": \"");
            builder.append(execType);
            builder.append("\",\n");
        }

        if (hasOrderID())
        {
            indent(builder, level);
            builder.append("\"OrderID\": \"");
            appendBuffer(builder, orderID, orderIDOffset, orderIDLength);
            builder.append("\",\n");
        }

        if (hasClOrdID())
        {
            indent(builder, level);
            builder.append("\"ClOrdID\": \"");
            appendBuffer(builder, clOrdID, clOrdIDOffset, clOrdIDLength);
            builder.append("\",\n");
        }

        if (hasMatchStatus())
        {
            indent(builder, level);
            builder.append("\"MatchStatus\": \"");
            builder.append(matchStatus);
            builder.append("\",\n");
        }

        if (hasTrdType())
        {
            indent(builder, level);
            builder.append("\"TrdType\": \"");
            builder.append(trdType);
            builder.append("\",\n");
        }

        if (hasTrdSubType())
        {
            indent(builder, level);
            builder.append("\"TrdSubType\": \"");
            builder.append(trdSubType);
            builder.append("\",\n");
        }

        if (hasTradeHandlingInstr())
        {
            indent(builder, level);
            builder.append("\"TradeHandlingInstr\": \"");
            builder.append(tradeHandlingInstr);
            builder.append("\",\n");
        }

        if (hasTransferReason())
        {
            indent(builder, level);
            builder.append("\"TransferReason\": \"");
            appendBuffer(builder, transferReason, transferReasonOffset, transferReasonLength);
            builder.append("\",\n");
        }

        if (hasSecondaryTrdType())
        {
            indent(builder, level);
            builder.append("\"SecondaryTrdType\": \"");
            builder.append(secondaryTrdType);
            builder.append("\",\n");
        }

        if (hasTradeLinkID())
        {
            indent(builder, level);
            builder.append("\"TradeLinkID\": \"");
            appendBuffer(builder, tradeLinkID, tradeLinkIDOffset, tradeLinkIDLength);
            builder.append("\",\n");
        }

        if (hasTrdMatchID())
        {
            indent(builder, level);
            builder.append("\"TrdMatchID\": \"");
            appendBuffer(builder, trdMatchID, trdMatchIDOffset, trdMatchIDLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"Parties\": ");
    parties.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"Instrument\": ");
    instrument.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"InstrumentExtension\": ");
    instrumentExtension.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"FinancingDetails\": ");
    financingDetails.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"UndInstrmtGrp\": ");
    undInstrmtGrp.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"InstrmtLegGrp\": ");
    instrmtLegGrp.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"TrdCapDtGrp\": ");
    trdCapDtGrp.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasClearingBusinessDate())
        {
            indent(builder, level);
            builder.append("\"ClearingBusinessDate\": \"");
            appendBuffer(builder, clearingBusinessDate, clearingBusinessDateOffset, clearingBusinessDateLength);
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

        if (hasTimeBracket())
        {
            indent(builder, level);
            builder.append("\"TimeBracket\": \"");
            appendBuffer(builder, timeBracket, timeBracketOffset, timeBracketLength);
            builder.append("\",\n");
        }

        if (hasSide())
        {
            indent(builder, level);
            builder.append("\"Side\": \"");
            builder.append(side);
            builder.append("\",\n");
        }

        if (hasMultiLegReportingType())
        {
            indent(builder, level);
            builder.append("\"MultiLegReportingType\": \"");
            builder.append(multiLegReportingType);
            builder.append("\",\n");
        }

        if (hasTradeInputSource())
        {
            indent(builder, level);
            builder.append("\"TradeInputSource\": \"");
            appendBuffer(builder, tradeInputSource, tradeInputSourceOffset, tradeInputSourceLength);
            builder.append("\",\n");
        }

        if (hasTradeInputDevice())
        {
            indent(builder, level);
            builder.append("\"TradeInputDevice\": \"");
            appendBuffer(builder, tradeInputDevice, tradeInputDeviceOffset, tradeInputDeviceLength);
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
    public TradeCaptureReportRequestEncoder copyTo(final Encoder encoder)
    {
        return copyTo((TradeCaptureReportRequestEncoder)encoder);
    }

    public TradeCaptureReportRequestEncoder copyTo(final TradeCaptureReportRequestEncoder encoder)
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

        if (hasTradeReportID())
        {
            encoder.tradeReportIDAsCopy(tradeReportID.byteArray(), 0, tradeReportIDLength);
        }

        if (hasSecondaryTradeReportID())
        {
            encoder.secondaryTradeReportIDAsCopy(secondaryTradeReportID.byteArray(), 0, secondaryTradeReportIDLength);
        }

        if (hasExecID())
        {
            encoder.execIDAsCopy(execID.byteArray(), 0, execIDLength);
        }

        if (hasExecType())
        {
            encoder.execType(this.execType());
        }

        if (hasOrderID())
        {
            encoder.orderIDAsCopy(orderID.byteArray(), 0, orderIDLength);
        }

        if (hasClOrdID())
        {
            encoder.clOrdIDAsCopy(clOrdID.byteArray(), 0, clOrdIDLength);
        }

        if (hasMatchStatus())
        {
            encoder.matchStatus(this.matchStatus());
        }

        if (hasTrdType())
        {
            encoder.trdType(this.trdType());
        }

        if (hasTrdSubType())
        {
            encoder.trdSubType(this.trdSubType());
        }

        if (hasTradeHandlingInstr())
        {
            encoder.tradeHandlingInstr(this.tradeHandlingInstr());
        }

        if (hasTransferReason())
        {
            encoder.transferReasonAsCopy(transferReason.byteArray(), 0, transferReasonLength);
        }

        if (hasSecondaryTrdType())
        {
            encoder.secondaryTrdType(this.secondaryTrdType());
        }

        if (hasTradeLinkID())
        {
            encoder.tradeLinkIDAsCopy(tradeLinkID.byteArray(), 0, tradeLinkIDLength);
        }

        if (hasTrdMatchID())
        {
            encoder.trdMatchIDAsCopy(trdMatchID.byteArray(), 0, trdMatchIDLength);
        }


        parties.copyTo(encoder.parties());

        instrument.copyTo(encoder.instrument());

        instrumentExtension.copyTo(encoder.instrumentExtension());

        financingDetails.copyTo(encoder.financingDetails());

        undInstrmtGrp.copyTo(encoder.undInstrmtGrp());

        instrmtLegGrp.copyTo(encoder.instrmtLegGrp());

        trdCapDtGrp.copyTo(encoder.trdCapDtGrp());
        if (hasClearingBusinessDate())
        {
            encoder.clearingBusinessDateAsCopy(clearingBusinessDate.byteArray(), 0, clearingBusinessDateLength);
        }

        if (hasTradingSessionID())
        {
            encoder.tradingSessionIDAsCopy(tradingSessionID.byteArray(), 0, tradingSessionIDLength);
        }

        if (hasTradingSessionSubID())
        {
            encoder.tradingSessionSubIDAsCopy(tradingSessionSubID.byteArray(), 0, tradingSessionSubIDLength);
        }

        if (hasTimeBracket())
        {
            encoder.timeBracketAsCopy(timeBracket.byteArray(), 0, timeBracketLength);
        }

        if (hasSide())
        {
            encoder.side(this.side());
        }

        if (hasMultiLegReportingType())
        {
            encoder.multiLegReportingType(this.multiLegReportingType());
        }

        if (hasTradeInputSource())
        {
            encoder.tradeInputSourceAsCopy(tradeInputSource.byteArray(), 0, tradeInputSourceLength);
        }

        if (hasTradeInputDevice())
        {
            encoder.tradeInputDeviceAsCopy(tradeInputDevice.byteArray(), 0, tradeInputDeviceLength);
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
