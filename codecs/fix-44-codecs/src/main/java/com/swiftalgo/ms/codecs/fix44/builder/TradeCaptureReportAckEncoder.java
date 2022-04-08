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


public class TradeCaptureReportAckEncoder implements Encoder
{
    public long messageType()
    {
        return 21057L;
    }

    public TradeCaptureReportAckEncoder()
    {
        header.msgType("AR");
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

    private static final int tradeReportIDHeaderLength = 4;
    private static final byte[] tradeReportIDHeader = new byte[] {53, 55, 49, (byte) '='};

    private static final int tradeReportTransTypeHeaderLength = 4;
    private static final byte[] tradeReportTransTypeHeader = new byte[] {52, 56, 55, (byte) '='};

    private static final int tradeReportTypeHeaderLength = 4;
    private static final byte[] tradeReportTypeHeader = new byte[] {56, 53, 54, (byte) '='};

    private static final int trdTypeHeaderLength = 4;
    private static final byte[] trdTypeHeader = new byte[] {56, 50, 56, (byte) '='};

    private static final int trdSubTypeHeaderLength = 4;
    private static final byte[] trdSubTypeHeader = new byte[] {56, 50, 57, (byte) '='};

    private static final int secondaryTrdTypeHeaderLength = 4;
    private static final byte[] secondaryTrdTypeHeader = new byte[] {56, 53, 53, (byte) '='};

    private static final int transferReasonHeaderLength = 4;
    private static final byte[] transferReasonHeader = new byte[] {56, 51, 48, (byte) '='};

    private static final int execTypeHeaderLength = 4;
    private static final byte[] execTypeHeader = new byte[] {49, 53, 48, (byte) '='};

    private static final int tradeReportRefIDHeaderLength = 4;
    private static final byte[] tradeReportRefIDHeader = new byte[] {53, 55, 50, (byte) '='};

    private static final int secondaryTradeReportRefIDHeaderLength = 4;
    private static final byte[] secondaryTradeReportRefIDHeader = new byte[] {56, 56, 49, (byte) '='};

    private static final int trdRptStatusHeaderLength = 4;
    private static final byte[] trdRptStatusHeader = new byte[] {57, 51, 57, (byte) '='};

    private static final int tradeReportRejectReasonHeaderLength = 4;
    private static final byte[] tradeReportRejectReasonHeader = new byte[] {55, 53, 49, (byte) '='};

    private static final int secondaryTradeReportIDHeaderLength = 4;
    private static final byte[] secondaryTradeReportIDHeader = new byte[] {56, 49, 56, (byte) '='};

    private static final int subscriptionRequestTypeHeaderLength = 4;
    private static final byte[] subscriptionRequestTypeHeader = new byte[] {50, 54, 51, (byte) '='};

    private static final int tradeLinkIDHeaderLength = 4;
    private static final byte[] tradeLinkIDHeader = new byte[] {56, 50, 48, (byte) '='};

    private static final int trdMatchIDHeaderLength = 4;
    private static final byte[] trdMatchIDHeader = new byte[] {56, 56, 48, (byte) '='};

    private static final int execIDHeaderLength = 3;
    private static final byte[] execIDHeader = new byte[] {49, 55, (byte) '='};

    private static final int secondaryExecIDHeaderLength = 4;
    private static final byte[] secondaryExecIDHeader = new byte[] {53, 50, 55, (byte) '='};

    private static final int transactTimeHeaderLength = 3;
    private static final byte[] transactTimeHeader = new byte[] {54, 48, (byte) '='};

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

    private static final int noLegsGroupCounterHeaderLength = 4;
    private static final byte[] noLegsGroupCounterHeader = new byte[] {53, 53, 53, (byte) '='};

    private static final int clearingFeeIndicatorHeaderLength = 4;
    private static final byte[] clearingFeeIndicatorHeader = new byte[] {54, 51, 53, (byte) '='};

    private static final int orderCapacityHeaderLength = 4;
    private static final byte[] orderCapacityHeader = new byte[] {53, 50, 56, (byte) '='};

    private static final int orderRestrictionsHeaderLength = 4;
    private static final byte[] orderRestrictionsHeader = new byte[] {53, 50, 57, (byte) '='};

    private static final int custOrderCapacityHeaderLength = 4;
    private static final byte[] custOrderCapacityHeader = new byte[] {53, 56, 50, (byte) '='};

    private static final int accountHeaderLength = 2;
    private static final byte[] accountHeader = new byte[] {49, (byte) '='};

    private static final int acctIDSourceHeaderLength = 4;
    private static final byte[] acctIDSourceHeader = new byte[] {54, 54, 48, (byte) '='};

    private static final int accountTypeHeaderLength = 4;
    private static final byte[] accountTypeHeader = new byte[] {53, 56, 49, (byte) '='};

    private static final int positionEffectHeaderLength = 3;
    private static final byte[] positionEffectHeader = new byte[] {55, 55, (byte) '='};

    private static final int preallocMethodHeaderLength = 4;
    private static final byte[] preallocMethodHeader = new byte[] {53, 57, 49, (byte) '='};

    private static final int noAllocsGroupCounterHeaderLength = 3;
    private static final byte[] noAllocsGroupCounterHeader = new byte[] {55, 56, (byte) '='};

    private final MutableDirectBuffer tradeReportID = new UnsafeBuffer();

    private int tradeReportIDOffset = 0;

    private int tradeReportIDLength = 0;

    public TradeCaptureReportAckEncoder tradeReportID(final DirectBuffer value, final int offset, final int length)
    {
        tradeReportID.wrap(value);
        tradeReportIDOffset = offset;
        tradeReportIDLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder tradeReportID(final DirectBuffer value, final int length)
    {
        return tradeReportID(value, 0, length);
    }

    public TradeCaptureReportAckEncoder tradeReportID(final DirectBuffer value)
    {
        return tradeReportID(value, 0, value.capacity());
    }

    public TradeCaptureReportAckEncoder tradeReportID(final byte[] value, final int offset, final int length)
    {
        tradeReportID.wrap(value);
        tradeReportIDOffset = offset;
        tradeReportIDLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder tradeReportIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradeReportID, value, offset, length);
        tradeReportIDOffset = offset;
        tradeReportIDLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder tradeReportID(final byte[] value, final int length)
    {
        return tradeReportID(value, 0, length);
    }

    public TradeCaptureReportAckEncoder tradeReportID(final byte[] value)
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

    public TradeCaptureReportAckEncoder tradeReportID(final CharSequence value)
    {
        toBytes(value, tradeReportID);
        tradeReportIDOffset = 0;
        tradeReportIDLength = value.length();
        return this;
    }

    public TradeCaptureReportAckEncoder tradeReportID(final AsciiSequenceView value)
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

    public TradeCaptureReportAckEncoder tradeReportID(final char[] value)
    {
        return tradeReportID(value, 0, value.length);
    }

    public TradeCaptureReportAckEncoder tradeReportID(final char[] value, final int length)
    {
        return tradeReportID(value, 0, length);
    }

    public TradeCaptureReportAckEncoder tradeReportID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradeReportID, offset, length);
        tradeReportIDOffset = 0;
        tradeReportIDLength = length;
        return this;
    }

    private int tradeReportTransType;

    private boolean hasTradeReportTransType;

    public boolean hasTradeReportTransType()
    {
        return hasTradeReportTransType;
    }

    public TradeCaptureReportAckEncoder tradeReportTransType(int value)
    {
        tradeReportTransType = value;
        hasTradeReportTransType = true;
        return this;
    }

    public int tradeReportTransType()
    {
        return tradeReportTransType;
    }

    public TradeCaptureReportAckEncoder tradeReportTransType(TradeReportTransType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == TradeReportTransType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: tradeReportTransType Value: " + value );
            }
            if (value == TradeReportTransType.NULL_VAL)
            {
                return this;
            }
        }
        return tradeReportTransType(value.representation());
    }

    private int tradeReportType;

    private boolean hasTradeReportType;

    public boolean hasTradeReportType()
    {
        return hasTradeReportType;
    }

    public TradeCaptureReportAckEncoder tradeReportType(int value)
    {
        tradeReportType = value;
        hasTradeReportType = true;
        return this;
    }

    public int tradeReportType()
    {
        return tradeReportType;
    }

    public TradeCaptureReportAckEncoder tradeReportType(TradeReportType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == TradeReportType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: tradeReportType Value: " + value );
            }
            if (value == TradeReportType.NULL_VAL)
            {
                return this;
            }
        }
        return tradeReportType(value.representation());
    }

    private int trdType;

    private boolean hasTrdType;

    public boolean hasTrdType()
    {
        return hasTrdType;
    }

    public TradeCaptureReportAckEncoder trdType(int value)
    {
        trdType = value;
        hasTrdType = true;
        return this;
    }

    public int trdType()
    {
        return trdType;
    }

    public TradeCaptureReportAckEncoder trdType(TrdType value)
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

    public TradeCaptureReportAckEncoder trdSubType(int value)
    {
        trdSubType = value;
        hasTrdSubType = true;
        return this;
    }

    public int trdSubType()
    {
        return trdSubType;
    }

    private int secondaryTrdType;

    private boolean hasSecondaryTrdType;

    public boolean hasSecondaryTrdType()
    {
        return hasSecondaryTrdType;
    }

    public TradeCaptureReportAckEncoder secondaryTrdType(int value)
    {
        secondaryTrdType = value;
        hasSecondaryTrdType = true;
        return this;
    }

    public int secondaryTrdType()
    {
        return secondaryTrdType;
    }

    private final MutableDirectBuffer transferReason = new UnsafeBuffer();

    private int transferReasonOffset = 0;

    private int transferReasonLength = 0;

    public TradeCaptureReportAckEncoder transferReason(final DirectBuffer value, final int offset, final int length)
    {
        transferReason.wrap(value);
        transferReasonOffset = offset;
        transferReasonLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder transferReason(final DirectBuffer value, final int length)
    {
        return transferReason(value, 0, length);
    }

    public TradeCaptureReportAckEncoder transferReason(final DirectBuffer value)
    {
        return transferReason(value, 0, value.capacity());
    }

    public TradeCaptureReportAckEncoder transferReason(final byte[] value, final int offset, final int length)
    {
        transferReason.wrap(value);
        transferReasonOffset = offset;
        transferReasonLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder transferReasonAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(transferReason, value, offset, length);
        transferReasonOffset = offset;
        transferReasonLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder transferReason(final byte[] value, final int length)
    {
        return transferReason(value, 0, length);
    }

    public TradeCaptureReportAckEncoder transferReason(final byte[] value)
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

    public TradeCaptureReportAckEncoder transferReason(final CharSequence value)
    {
        toBytes(value, transferReason);
        transferReasonOffset = 0;
        transferReasonLength = value.length();
        return this;
    }

    public TradeCaptureReportAckEncoder transferReason(final AsciiSequenceView value)
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

    public TradeCaptureReportAckEncoder transferReason(final char[] value)
    {
        return transferReason(value, 0, value.length);
    }

    public TradeCaptureReportAckEncoder transferReason(final char[] value, final int length)
    {
        return transferReason(value, 0, length);
    }

    public TradeCaptureReportAckEncoder transferReason(final char[] value, final int offset, final int length)
    {
        toBytes(value, transferReason, offset, length);
        transferReasonOffset = 0;
        transferReasonLength = length;
        return this;
    }

    private char execType;

    private boolean hasExecType;

    public boolean hasExecType()
    {
        return hasExecType;
    }

    public TradeCaptureReportAckEncoder execType(char value)
    {
        execType = value;
        hasExecType = true;
        return this;
    }

    public char execType()
    {
        return execType;
    }

    public TradeCaptureReportAckEncoder execType(ExecType value)
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

    private final MutableDirectBuffer tradeReportRefID = new UnsafeBuffer();

    private int tradeReportRefIDOffset = 0;

    private int tradeReportRefIDLength = 0;

    public TradeCaptureReportAckEncoder tradeReportRefID(final DirectBuffer value, final int offset, final int length)
    {
        tradeReportRefID.wrap(value);
        tradeReportRefIDOffset = offset;
        tradeReportRefIDLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder tradeReportRefID(final DirectBuffer value, final int length)
    {
        return tradeReportRefID(value, 0, length);
    }

    public TradeCaptureReportAckEncoder tradeReportRefID(final DirectBuffer value)
    {
        return tradeReportRefID(value, 0, value.capacity());
    }

    public TradeCaptureReportAckEncoder tradeReportRefID(final byte[] value, final int offset, final int length)
    {
        tradeReportRefID.wrap(value);
        tradeReportRefIDOffset = offset;
        tradeReportRefIDLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder tradeReportRefIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradeReportRefID, value, offset, length);
        tradeReportRefIDOffset = offset;
        tradeReportRefIDLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder tradeReportRefID(final byte[] value, final int length)
    {
        return tradeReportRefID(value, 0, length);
    }

    public TradeCaptureReportAckEncoder tradeReportRefID(final byte[] value)
    {
        return tradeReportRefID(value, 0, value.length);
    }

    public boolean hasTradeReportRefID()
    {
        return tradeReportRefIDLength > 0;
    }

    public MutableDirectBuffer tradeReportRefID()
    {
        return tradeReportRefID;
    }

    public String tradeReportRefIDAsString()
    {
        return tradeReportRefID.getStringWithoutLengthAscii(tradeReportRefIDOffset, tradeReportRefIDLength);
    }

    public TradeCaptureReportAckEncoder tradeReportRefID(final CharSequence value)
    {
        toBytes(value, tradeReportRefID);
        tradeReportRefIDOffset = 0;
        tradeReportRefIDLength = value.length();
        return this;
    }

    public TradeCaptureReportAckEncoder tradeReportRefID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            tradeReportRefID.wrap(buffer);
            tradeReportRefIDOffset = value.offset();
            tradeReportRefIDLength = value.length();
        }
        return this;
    }

    public TradeCaptureReportAckEncoder tradeReportRefID(final char[] value)
    {
        return tradeReportRefID(value, 0, value.length);
    }

    public TradeCaptureReportAckEncoder tradeReportRefID(final char[] value, final int length)
    {
        return tradeReportRefID(value, 0, length);
    }

    public TradeCaptureReportAckEncoder tradeReportRefID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradeReportRefID, offset, length);
        tradeReportRefIDOffset = 0;
        tradeReportRefIDLength = length;
        return this;
    }

    private final MutableDirectBuffer secondaryTradeReportRefID = new UnsafeBuffer();

    private int secondaryTradeReportRefIDOffset = 0;

    private int secondaryTradeReportRefIDLength = 0;

    public TradeCaptureReportAckEncoder secondaryTradeReportRefID(final DirectBuffer value, final int offset, final int length)
    {
        secondaryTradeReportRefID.wrap(value);
        secondaryTradeReportRefIDOffset = offset;
        secondaryTradeReportRefIDLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder secondaryTradeReportRefID(final DirectBuffer value, final int length)
    {
        return secondaryTradeReportRefID(value, 0, length);
    }

    public TradeCaptureReportAckEncoder secondaryTradeReportRefID(final DirectBuffer value)
    {
        return secondaryTradeReportRefID(value, 0, value.capacity());
    }

    public TradeCaptureReportAckEncoder secondaryTradeReportRefID(final byte[] value, final int offset, final int length)
    {
        secondaryTradeReportRefID.wrap(value);
        secondaryTradeReportRefIDOffset = offset;
        secondaryTradeReportRefIDLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder secondaryTradeReportRefIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(secondaryTradeReportRefID, value, offset, length);
        secondaryTradeReportRefIDOffset = offset;
        secondaryTradeReportRefIDLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder secondaryTradeReportRefID(final byte[] value, final int length)
    {
        return secondaryTradeReportRefID(value, 0, length);
    }

    public TradeCaptureReportAckEncoder secondaryTradeReportRefID(final byte[] value)
    {
        return secondaryTradeReportRefID(value, 0, value.length);
    }

    public boolean hasSecondaryTradeReportRefID()
    {
        return secondaryTradeReportRefIDLength > 0;
    }

    public MutableDirectBuffer secondaryTradeReportRefID()
    {
        return secondaryTradeReportRefID;
    }

    public String secondaryTradeReportRefIDAsString()
    {
        return secondaryTradeReportRefID.getStringWithoutLengthAscii(secondaryTradeReportRefIDOffset, secondaryTradeReportRefIDLength);
    }

    public TradeCaptureReportAckEncoder secondaryTradeReportRefID(final CharSequence value)
    {
        toBytes(value, secondaryTradeReportRefID);
        secondaryTradeReportRefIDOffset = 0;
        secondaryTradeReportRefIDLength = value.length();
        return this;
    }

    public TradeCaptureReportAckEncoder secondaryTradeReportRefID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            secondaryTradeReportRefID.wrap(buffer);
            secondaryTradeReportRefIDOffset = value.offset();
            secondaryTradeReportRefIDLength = value.length();
        }
        return this;
    }

    public TradeCaptureReportAckEncoder secondaryTradeReportRefID(final char[] value)
    {
        return secondaryTradeReportRefID(value, 0, value.length);
    }

    public TradeCaptureReportAckEncoder secondaryTradeReportRefID(final char[] value, final int length)
    {
        return secondaryTradeReportRefID(value, 0, length);
    }

    public TradeCaptureReportAckEncoder secondaryTradeReportRefID(final char[] value, final int offset, final int length)
    {
        toBytes(value, secondaryTradeReportRefID, offset, length);
        secondaryTradeReportRefIDOffset = 0;
        secondaryTradeReportRefIDLength = length;
        return this;
    }

    private int trdRptStatus;

    private boolean hasTrdRptStatus;

    public boolean hasTrdRptStatus()
    {
        return hasTrdRptStatus;
    }

    public TradeCaptureReportAckEncoder trdRptStatus(int value)
    {
        trdRptStatus = value;
        hasTrdRptStatus = true;
        return this;
    }

    public int trdRptStatus()
    {
        return trdRptStatus;
    }

    public TradeCaptureReportAckEncoder trdRptStatus(TrdRptStatus value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == TrdRptStatus.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: trdRptStatus Value: " + value );
            }
            if (value == TrdRptStatus.NULL_VAL)
            {
                return this;
            }
        }
        return trdRptStatus(value.representation());
    }

    private int tradeReportRejectReason;

    private boolean hasTradeReportRejectReason;

    public boolean hasTradeReportRejectReason()
    {
        return hasTradeReportRejectReason;
    }

    public TradeCaptureReportAckEncoder tradeReportRejectReason(int value)
    {
        tradeReportRejectReason = value;
        hasTradeReportRejectReason = true;
        return this;
    }

    public int tradeReportRejectReason()
    {
        return tradeReportRejectReason;
    }

    public TradeCaptureReportAckEncoder tradeReportRejectReason(TradeReportRejectReason value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == TradeReportRejectReason.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: tradeReportRejectReason Value: " + value );
            }
            if (value == TradeReportRejectReason.NULL_VAL)
            {
                return this;
            }
        }
        return tradeReportRejectReason(value.representation());
    }

    private final MutableDirectBuffer secondaryTradeReportID = new UnsafeBuffer();

    private int secondaryTradeReportIDOffset = 0;

    private int secondaryTradeReportIDLength = 0;

    public TradeCaptureReportAckEncoder secondaryTradeReportID(final DirectBuffer value, final int offset, final int length)
    {
        secondaryTradeReportID.wrap(value);
        secondaryTradeReportIDOffset = offset;
        secondaryTradeReportIDLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder secondaryTradeReportID(final DirectBuffer value, final int length)
    {
        return secondaryTradeReportID(value, 0, length);
    }

    public TradeCaptureReportAckEncoder secondaryTradeReportID(final DirectBuffer value)
    {
        return secondaryTradeReportID(value, 0, value.capacity());
    }

    public TradeCaptureReportAckEncoder secondaryTradeReportID(final byte[] value, final int offset, final int length)
    {
        secondaryTradeReportID.wrap(value);
        secondaryTradeReportIDOffset = offset;
        secondaryTradeReportIDLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder secondaryTradeReportIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(secondaryTradeReportID, value, offset, length);
        secondaryTradeReportIDOffset = offset;
        secondaryTradeReportIDLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder secondaryTradeReportID(final byte[] value, final int length)
    {
        return secondaryTradeReportID(value, 0, length);
    }

    public TradeCaptureReportAckEncoder secondaryTradeReportID(final byte[] value)
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

    public TradeCaptureReportAckEncoder secondaryTradeReportID(final CharSequence value)
    {
        toBytes(value, secondaryTradeReportID);
        secondaryTradeReportIDOffset = 0;
        secondaryTradeReportIDLength = value.length();
        return this;
    }

    public TradeCaptureReportAckEncoder secondaryTradeReportID(final AsciiSequenceView value)
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

    public TradeCaptureReportAckEncoder secondaryTradeReportID(final char[] value)
    {
        return secondaryTradeReportID(value, 0, value.length);
    }

    public TradeCaptureReportAckEncoder secondaryTradeReportID(final char[] value, final int length)
    {
        return secondaryTradeReportID(value, 0, length);
    }

    public TradeCaptureReportAckEncoder secondaryTradeReportID(final char[] value, final int offset, final int length)
    {
        toBytes(value, secondaryTradeReportID, offset, length);
        secondaryTradeReportIDOffset = 0;
        secondaryTradeReportIDLength = length;
        return this;
    }

    private char subscriptionRequestType;

    private boolean hasSubscriptionRequestType;

    public boolean hasSubscriptionRequestType()
    {
        return hasSubscriptionRequestType;
    }

    public TradeCaptureReportAckEncoder subscriptionRequestType(char value)
    {
        subscriptionRequestType = value;
        hasSubscriptionRequestType = true;
        return this;
    }

    public char subscriptionRequestType()
    {
        return subscriptionRequestType;
    }

    public TradeCaptureReportAckEncoder subscriptionRequestType(SubscriptionRequestType value)
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

    private final MutableDirectBuffer tradeLinkID = new UnsafeBuffer();

    private int tradeLinkIDOffset = 0;

    private int tradeLinkIDLength = 0;

    public TradeCaptureReportAckEncoder tradeLinkID(final DirectBuffer value, final int offset, final int length)
    {
        tradeLinkID.wrap(value);
        tradeLinkIDOffset = offset;
        tradeLinkIDLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder tradeLinkID(final DirectBuffer value, final int length)
    {
        return tradeLinkID(value, 0, length);
    }

    public TradeCaptureReportAckEncoder tradeLinkID(final DirectBuffer value)
    {
        return tradeLinkID(value, 0, value.capacity());
    }

    public TradeCaptureReportAckEncoder tradeLinkID(final byte[] value, final int offset, final int length)
    {
        tradeLinkID.wrap(value);
        tradeLinkIDOffset = offset;
        tradeLinkIDLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder tradeLinkIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradeLinkID, value, offset, length);
        tradeLinkIDOffset = offset;
        tradeLinkIDLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder tradeLinkID(final byte[] value, final int length)
    {
        return tradeLinkID(value, 0, length);
    }

    public TradeCaptureReportAckEncoder tradeLinkID(final byte[] value)
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

    public TradeCaptureReportAckEncoder tradeLinkID(final CharSequence value)
    {
        toBytes(value, tradeLinkID);
        tradeLinkIDOffset = 0;
        tradeLinkIDLength = value.length();
        return this;
    }

    public TradeCaptureReportAckEncoder tradeLinkID(final AsciiSequenceView value)
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

    public TradeCaptureReportAckEncoder tradeLinkID(final char[] value)
    {
        return tradeLinkID(value, 0, value.length);
    }

    public TradeCaptureReportAckEncoder tradeLinkID(final char[] value, final int length)
    {
        return tradeLinkID(value, 0, length);
    }

    public TradeCaptureReportAckEncoder tradeLinkID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradeLinkID, offset, length);
        tradeLinkIDOffset = 0;
        tradeLinkIDLength = length;
        return this;
    }

    private final MutableDirectBuffer trdMatchID = new UnsafeBuffer();

    private int trdMatchIDOffset = 0;

    private int trdMatchIDLength = 0;

    public TradeCaptureReportAckEncoder trdMatchID(final DirectBuffer value, final int offset, final int length)
    {
        trdMatchID.wrap(value);
        trdMatchIDOffset = offset;
        trdMatchIDLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder trdMatchID(final DirectBuffer value, final int length)
    {
        return trdMatchID(value, 0, length);
    }

    public TradeCaptureReportAckEncoder trdMatchID(final DirectBuffer value)
    {
        return trdMatchID(value, 0, value.capacity());
    }

    public TradeCaptureReportAckEncoder trdMatchID(final byte[] value, final int offset, final int length)
    {
        trdMatchID.wrap(value);
        trdMatchIDOffset = offset;
        trdMatchIDLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder trdMatchIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(trdMatchID, value, offset, length);
        trdMatchIDOffset = offset;
        trdMatchIDLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder trdMatchID(final byte[] value, final int length)
    {
        return trdMatchID(value, 0, length);
    }

    public TradeCaptureReportAckEncoder trdMatchID(final byte[] value)
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

    public TradeCaptureReportAckEncoder trdMatchID(final CharSequence value)
    {
        toBytes(value, trdMatchID);
        trdMatchIDOffset = 0;
        trdMatchIDLength = value.length();
        return this;
    }

    public TradeCaptureReportAckEncoder trdMatchID(final AsciiSequenceView value)
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

    public TradeCaptureReportAckEncoder trdMatchID(final char[] value)
    {
        return trdMatchID(value, 0, value.length);
    }

    public TradeCaptureReportAckEncoder trdMatchID(final char[] value, final int length)
    {
        return trdMatchID(value, 0, length);
    }

    public TradeCaptureReportAckEncoder trdMatchID(final char[] value, final int offset, final int length)
    {
        toBytes(value, trdMatchID, offset, length);
        trdMatchIDOffset = 0;
        trdMatchIDLength = length;
        return this;
    }

    private final MutableDirectBuffer execID = new UnsafeBuffer();

    private int execIDOffset = 0;

    private int execIDLength = 0;

    public TradeCaptureReportAckEncoder execID(final DirectBuffer value, final int offset, final int length)
    {
        execID.wrap(value);
        execIDOffset = offset;
        execIDLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder execID(final DirectBuffer value, final int length)
    {
        return execID(value, 0, length);
    }

    public TradeCaptureReportAckEncoder execID(final DirectBuffer value)
    {
        return execID(value, 0, value.capacity());
    }

    public TradeCaptureReportAckEncoder execID(final byte[] value, final int offset, final int length)
    {
        execID.wrap(value);
        execIDOffset = offset;
        execIDLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder execIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(execID, value, offset, length);
        execIDOffset = offset;
        execIDLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder execID(final byte[] value, final int length)
    {
        return execID(value, 0, length);
    }

    public TradeCaptureReportAckEncoder execID(final byte[] value)
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

    public TradeCaptureReportAckEncoder execID(final CharSequence value)
    {
        toBytes(value, execID);
        execIDOffset = 0;
        execIDLength = value.length();
        return this;
    }

    public TradeCaptureReportAckEncoder execID(final AsciiSequenceView value)
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

    public TradeCaptureReportAckEncoder execID(final char[] value)
    {
        return execID(value, 0, value.length);
    }

    public TradeCaptureReportAckEncoder execID(final char[] value, final int length)
    {
        return execID(value, 0, length);
    }

    public TradeCaptureReportAckEncoder execID(final char[] value, final int offset, final int length)
    {
        toBytes(value, execID, offset, length);
        execIDOffset = 0;
        execIDLength = length;
        return this;
    }

    private final MutableDirectBuffer secondaryExecID = new UnsafeBuffer();

    private int secondaryExecIDOffset = 0;

    private int secondaryExecIDLength = 0;

    public TradeCaptureReportAckEncoder secondaryExecID(final DirectBuffer value, final int offset, final int length)
    {
        secondaryExecID.wrap(value);
        secondaryExecIDOffset = offset;
        secondaryExecIDLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder secondaryExecID(final DirectBuffer value, final int length)
    {
        return secondaryExecID(value, 0, length);
    }

    public TradeCaptureReportAckEncoder secondaryExecID(final DirectBuffer value)
    {
        return secondaryExecID(value, 0, value.capacity());
    }

    public TradeCaptureReportAckEncoder secondaryExecID(final byte[] value, final int offset, final int length)
    {
        secondaryExecID.wrap(value);
        secondaryExecIDOffset = offset;
        secondaryExecIDLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder secondaryExecIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(secondaryExecID, value, offset, length);
        secondaryExecIDOffset = offset;
        secondaryExecIDLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder secondaryExecID(final byte[] value, final int length)
    {
        return secondaryExecID(value, 0, length);
    }

    public TradeCaptureReportAckEncoder secondaryExecID(final byte[] value)
    {
        return secondaryExecID(value, 0, value.length);
    }

    public boolean hasSecondaryExecID()
    {
        return secondaryExecIDLength > 0;
    }

    public MutableDirectBuffer secondaryExecID()
    {
        return secondaryExecID;
    }

    public String secondaryExecIDAsString()
    {
        return secondaryExecID.getStringWithoutLengthAscii(secondaryExecIDOffset, secondaryExecIDLength);
    }

    public TradeCaptureReportAckEncoder secondaryExecID(final CharSequence value)
    {
        toBytes(value, secondaryExecID);
        secondaryExecIDOffset = 0;
        secondaryExecIDLength = value.length();
        return this;
    }

    public TradeCaptureReportAckEncoder secondaryExecID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            secondaryExecID.wrap(buffer);
            secondaryExecIDOffset = value.offset();
            secondaryExecIDLength = value.length();
        }
        return this;
    }

    public TradeCaptureReportAckEncoder secondaryExecID(final char[] value)
    {
        return secondaryExecID(value, 0, value.length);
    }

    public TradeCaptureReportAckEncoder secondaryExecID(final char[] value, final int length)
    {
        return secondaryExecID(value, 0, length);
    }

    public TradeCaptureReportAckEncoder secondaryExecID(final char[] value, final int offset, final int length)
    {
        toBytes(value, secondaryExecID, offset, length);
        secondaryExecIDOffset = 0;
        secondaryExecIDLength = length;
        return this;
    }

    private final InstrumentEncoder instrument = new InstrumentEncoder();
    public InstrumentEncoder instrument()
    {
        return instrument;
    }

    private final MutableDirectBuffer transactTime = new UnsafeBuffer();

    private int transactTimeOffset = 0;

    private int transactTimeLength = 0;

    public TradeCaptureReportAckEncoder transactTime(final DirectBuffer value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder transactTime(final DirectBuffer value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public TradeCaptureReportAckEncoder transactTime(final DirectBuffer value)
    {
        return transactTime(value, 0, value.capacity());
    }

    public TradeCaptureReportAckEncoder transactTime(final byte[] value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder transactTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(transactTime, value, offset, length);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder transactTime(final byte[] value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public TradeCaptureReportAckEncoder transactTime(final byte[] value)
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

    private final TrdRegTimestampsEncoder trdRegTimestamps = new TrdRegTimestampsEncoder();
    public TrdRegTimestampsEncoder trdRegTimestamps()
    {
        return trdRegTimestamps;
    }

    private int responseTransportType;

    private boolean hasResponseTransportType;

    public boolean hasResponseTransportType()
    {
        return hasResponseTransportType;
    }

    public TradeCaptureReportAckEncoder responseTransportType(int value)
    {
        responseTransportType = value;
        hasResponseTransportType = true;
        return this;
    }

    public int responseTransportType()
    {
        return responseTransportType;
    }

    public TradeCaptureReportAckEncoder responseTransportType(ResponseTransportType value)
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

    public TradeCaptureReportAckEncoder responseDestination(final DirectBuffer value, final int offset, final int length)
    {
        responseDestination.wrap(value);
        responseDestinationOffset = offset;
        responseDestinationLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder responseDestination(final DirectBuffer value, final int length)
    {
        return responseDestination(value, 0, length);
    }

    public TradeCaptureReportAckEncoder responseDestination(final DirectBuffer value)
    {
        return responseDestination(value, 0, value.capacity());
    }

    public TradeCaptureReportAckEncoder responseDestination(final byte[] value, final int offset, final int length)
    {
        responseDestination.wrap(value);
        responseDestinationOffset = offset;
        responseDestinationLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder responseDestinationAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(responseDestination, value, offset, length);
        responseDestinationOffset = offset;
        responseDestinationLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder responseDestination(final byte[] value, final int length)
    {
        return responseDestination(value, 0, length);
    }

    public TradeCaptureReportAckEncoder responseDestination(final byte[] value)
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

    public TradeCaptureReportAckEncoder responseDestination(final CharSequence value)
    {
        toBytes(value, responseDestination);
        responseDestinationOffset = 0;
        responseDestinationLength = value.length();
        return this;
    }

    public TradeCaptureReportAckEncoder responseDestination(final AsciiSequenceView value)
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

    public TradeCaptureReportAckEncoder responseDestination(final char[] value)
    {
        return responseDestination(value, 0, value.length);
    }

    public TradeCaptureReportAckEncoder responseDestination(final char[] value, final int length)
    {
        return responseDestination(value, 0, length);
    }

    public TradeCaptureReportAckEncoder responseDestination(final char[] value, final int offset, final int length)
    {
        toBytes(value, responseDestination, offset, length);
        responseDestinationOffset = 0;
        responseDestinationLength = length;
        return this;
    }

    private final MutableDirectBuffer text = new UnsafeBuffer();

    private int textOffset = 0;

    private int textLength = 0;

    public TradeCaptureReportAckEncoder text(final DirectBuffer value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder text(final DirectBuffer value, final int length)
    {
        return text(value, 0, length);
    }

    public TradeCaptureReportAckEncoder text(final DirectBuffer value)
    {
        return text(value, 0, value.capacity());
    }

    public TradeCaptureReportAckEncoder text(final byte[] value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder textAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(text, value, offset, length);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder text(final byte[] value, final int length)
    {
        return text(value, 0, length);
    }

    public TradeCaptureReportAckEncoder text(final byte[] value)
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

    public TradeCaptureReportAckEncoder text(final CharSequence value)
    {
        toBytes(value, text);
        textOffset = 0;
        textLength = value.length();
        return this;
    }

    public TradeCaptureReportAckEncoder text(final AsciiSequenceView value)
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

    public TradeCaptureReportAckEncoder text(final char[] value)
    {
        return text(value, 0, value.length);
    }

    public TradeCaptureReportAckEncoder text(final char[] value, final int length)
    {
        return text(value, 0, length);
    }

    public TradeCaptureReportAckEncoder text(final char[] value, final int offset, final int length)
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

    public TradeCaptureReportAckEncoder encodedTextLen(int value)
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

    public TradeCaptureReportAckEncoder encodedText(byte[] value)
    {
        encodedText = value;
        hasEncodedText = true;
        return this;
    }

    public byte[] encodedText()
    {
        return encodedText;
    }

    public TradeCaptureReportAckEncoder encodedTextAsCopy(final byte[] value, final int offset, final int length)
    {
        encodedText = copyInto(encodedText, value, offset, length);
        hasEncodedText = true;
        return this;
    }



public static class LegsGroupEncoder
{
    private LegsGroupEncoder next = null;

    public LegsGroupEncoder next()
    {
        if (next == null)
        {
            next = new LegsGroupEncoder();
        }
        return next;
    }

    private static final int legQtyHeaderLength = 4;
    private static final byte[] legQtyHeader = new byte[] {54, 56, 55, (byte) '='};

    private static final int legSwapTypeHeaderLength = 4;
    private static final byte[] legSwapTypeHeader = new byte[] {54, 57, 48, (byte) '='};

    private static final int legPositionEffectHeaderLength = 4;
    private static final byte[] legPositionEffectHeader = new byte[] {53, 54, 52, (byte) '='};

    private static final int legCoveredOrUncoveredHeaderLength = 4;
    private static final byte[] legCoveredOrUncoveredHeader = new byte[] {53, 54, 53, (byte) '='};

    private static final int legRefIDHeaderLength = 4;
    private static final byte[] legRefIDHeader = new byte[] {54, 53, 52, (byte) '='};

    private static final int legPriceHeaderLength = 4;
    private static final byte[] legPriceHeader = new byte[] {53, 54, 54, (byte) '='};

    private static final int legSettlTypeHeaderLength = 4;
    private static final byte[] legSettlTypeHeader = new byte[] {53, 56, 55, (byte) '='};

    private static final int legSettlDateHeaderLength = 4;
    private static final byte[] legSettlDateHeader = new byte[] {53, 56, 56, (byte) '='};

    private static final int legLastPxHeaderLength = 4;
    private static final byte[] legLastPxHeader = new byte[] {54, 51, 55, (byte) '='};

    private final InstrumentLegEncoder instrumentLeg = new InstrumentLegEncoder();
    public InstrumentLegEncoder instrumentLeg()
    {
        return instrumentLeg;
    }

    private final DecimalFloat legQty = new DecimalFloat();

    private boolean hasLegQty;

    public boolean hasLegQty()
    {
        return hasLegQty;
    }

    public LegsGroupEncoder legQty(DecimalFloat value)
    {
        legQty.set(value);
        hasLegQty = true;
        return this;
    }

    public LegsGroupEncoder legQty(long value, int scale)
    {
        legQty.set(value, scale);
        hasLegQty = true;
        return this;
    }

    public DecimalFloat legQty()
    {
        return legQty;
    }

    private int legSwapType;

    private boolean hasLegSwapType;

    public boolean hasLegSwapType()
    {
        return hasLegSwapType;
    }

    public LegsGroupEncoder legSwapType(int value)
    {
        legSwapType = value;
        hasLegSwapType = true;
        return this;
    }

    public int legSwapType()
    {
        return legSwapType;
    }

    public LegsGroupEncoder legSwapType(LegSwapType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == LegSwapType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: legSwapType Value: " + value );
            }
            if (value == LegSwapType.NULL_VAL)
            {
                return this;
            }
        }
        return legSwapType(value.representation());
    }

    private final LegStipulationsEncoder legStipulations = new LegStipulationsEncoder();
    public LegStipulationsEncoder legStipulations()
    {
        return legStipulations;
    }

    private char legPositionEffect;

    private boolean hasLegPositionEffect;

    public boolean hasLegPositionEffect()
    {
        return hasLegPositionEffect;
    }

    public LegsGroupEncoder legPositionEffect(char value)
    {
        legPositionEffect = value;
        hasLegPositionEffect = true;
        return this;
    }

    public char legPositionEffect()
    {
        return legPositionEffect;
    }

    private int legCoveredOrUncovered;

    private boolean hasLegCoveredOrUncovered;

    public boolean hasLegCoveredOrUncovered()
    {
        return hasLegCoveredOrUncovered;
    }

    public LegsGroupEncoder legCoveredOrUncovered(int value)
    {
        legCoveredOrUncovered = value;
        hasLegCoveredOrUncovered = true;
        return this;
    }

    public int legCoveredOrUncovered()
    {
        return legCoveredOrUncovered;
    }

    private final NestedPartiesEncoder nestedParties = new NestedPartiesEncoder();
    public NestedPartiesEncoder nestedParties()
    {
        return nestedParties;
    }

    private final MutableDirectBuffer legRefID = new UnsafeBuffer();

    private int legRefIDOffset = 0;

    private int legRefIDLength = 0;

    public LegsGroupEncoder legRefID(final DirectBuffer value, final int offset, final int length)
    {
        legRefID.wrap(value);
        legRefIDOffset = offset;
        legRefIDLength = length;
        return this;
    }

    public LegsGroupEncoder legRefID(final DirectBuffer value, final int length)
    {
        return legRefID(value, 0, length);
    }

    public LegsGroupEncoder legRefID(final DirectBuffer value)
    {
        return legRefID(value, 0, value.capacity());
    }

    public LegsGroupEncoder legRefID(final byte[] value, final int offset, final int length)
    {
        legRefID.wrap(value);
        legRefIDOffset = offset;
        legRefIDLength = length;
        return this;
    }

    public LegsGroupEncoder legRefIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(legRefID, value, offset, length);
        legRefIDOffset = offset;
        legRefIDLength = length;
        return this;
    }

    public LegsGroupEncoder legRefID(final byte[] value, final int length)
    {
        return legRefID(value, 0, length);
    }

    public LegsGroupEncoder legRefID(final byte[] value)
    {
        return legRefID(value, 0, value.length);
    }

    public boolean hasLegRefID()
    {
        return legRefIDLength > 0;
    }

    public MutableDirectBuffer legRefID()
    {
        return legRefID;
    }

    public String legRefIDAsString()
    {
        return legRefID.getStringWithoutLengthAscii(legRefIDOffset, legRefIDLength);
    }

    public LegsGroupEncoder legRefID(final CharSequence value)
    {
        toBytes(value, legRefID);
        legRefIDOffset = 0;
        legRefIDLength = value.length();
        return this;
    }

    public LegsGroupEncoder legRefID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            legRefID.wrap(buffer);
            legRefIDOffset = value.offset();
            legRefIDLength = value.length();
        }
        return this;
    }

    public LegsGroupEncoder legRefID(final char[] value)
    {
        return legRefID(value, 0, value.length);
    }

    public LegsGroupEncoder legRefID(final char[] value, final int length)
    {
        return legRefID(value, 0, length);
    }

    public LegsGroupEncoder legRefID(final char[] value, final int offset, final int length)
    {
        toBytes(value, legRefID, offset, length);
        legRefIDOffset = 0;
        legRefIDLength = length;
        return this;
    }

    private final DecimalFloat legPrice = new DecimalFloat();

    private boolean hasLegPrice;

    public boolean hasLegPrice()
    {
        return hasLegPrice;
    }

    public LegsGroupEncoder legPrice(DecimalFloat value)
    {
        legPrice.set(value);
        hasLegPrice = true;
        return this;
    }

    public LegsGroupEncoder legPrice(long value, int scale)
    {
        legPrice.set(value, scale);
        hasLegPrice = true;
        return this;
    }

    public DecimalFloat legPrice()
    {
        return legPrice;
    }

    private char legSettlType;

    private boolean hasLegSettlType;

    public boolean hasLegSettlType()
    {
        return hasLegSettlType;
    }

    public LegsGroupEncoder legSettlType(char value)
    {
        legSettlType = value;
        hasLegSettlType = true;
        return this;
    }

    public char legSettlType()
    {
        return legSettlType;
    }

    private final MutableDirectBuffer legSettlDate = new UnsafeBuffer();

    private int legSettlDateOffset = 0;

    private int legSettlDateLength = 0;

    public LegsGroupEncoder legSettlDate(final DirectBuffer value, final int offset, final int length)
    {
        legSettlDate.wrap(value);
        legSettlDateOffset = offset;
        legSettlDateLength = length;
        return this;
    }

    public LegsGroupEncoder legSettlDate(final DirectBuffer value, final int length)
    {
        return legSettlDate(value, 0, length);
    }

    public LegsGroupEncoder legSettlDate(final DirectBuffer value)
    {
        return legSettlDate(value, 0, value.capacity());
    }

    public LegsGroupEncoder legSettlDate(final byte[] value, final int offset, final int length)
    {
        legSettlDate.wrap(value);
        legSettlDateOffset = offset;
        legSettlDateLength = length;
        return this;
    }

    public LegsGroupEncoder legSettlDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(legSettlDate, value, offset, length);
        legSettlDateOffset = offset;
        legSettlDateLength = length;
        return this;
    }

    public LegsGroupEncoder legSettlDate(final byte[] value, final int length)
    {
        return legSettlDate(value, 0, length);
    }

    public LegsGroupEncoder legSettlDate(final byte[] value)
    {
        return legSettlDate(value, 0, value.length);
    }

    public boolean hasLegSettlDate()
    {
        return legSettlDateLength > 0;
    }

    public MutableDirectBuffer legSettlDate()
    {
        return legSettlDate;
    }

    public String legSettlDateAsString()
    {
        return legSettlDate.getStringWithoutLengthAscii(legSettlDateOffset, legSettlDateLength);
    }

    private final DecimalFloat legLastPx = new DecimalFloat();

    private boolean hasLegLastPx;

    public boolean hasLegLastPx()
    {
        return hasLegLastPx;
    }

    public LegsGroupEncoder legLastPx(DecimalFloat value)
    {
        legLastPx.set(value);
        hasLegLastPx = true;
        return this;
    }

    public LegsGroupEncoder legLastPx(long value, int scale)
    {
        legLastPx.set(value, scale);
        hasLegLastPx = true;
        return this;
    }

    public DecimalFloat legLastPx()
    {
        return legLastPx;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

            position += instrumentLeg.encode(buffer, position);

        if (hasLegQty)
        {
            buffer.putBytes(position, legQtyHeader, 0, legQtyHeaderLength);
            position += legQtyHeaderLength;
            position += buffer.putFloatAscii(position, legQty);
            buffer.putSeparator(position);
            position++;
        }

        if (hasLegSwapType)
        {
            buffer.putBytes(position, legSwapTypeHeader, 0, legSwapTypeHeaderLength);
            position += legSwapTypeHeaderLength;
            position += buffer.putIntAscii(position, legSwapType);
            buffer.putSeparator(position);
            position++;
        }

            position += legStipulations.encode(buffer, position);

        if (hasLegPositionEffect)
        {
            buffer.putBytes(position, legPositionEffectHeader, 0, legPositionEffectHeaderLength);
            position += legPositionEffectHeaderLength;
            position += buffer.putCharAscii(position, legPositionEffect);
            buffer.putSeparator(position);
            position++;
        }

        if (hasLegCoveredOrUncovered)
        {
            buffer.putBytes(position, legCoveredOrUncoveredHeader, 0, legCoveredOrUncoveredHeaderLength);
            position += legCoveredOrUncoveredHeaderLength;
            position += buffer.putIntAscii(position, legCoveredOrUncovered);
            buffer.putSeparator(position);
            position++;
        }

            position += nestedParties.encode(buffer, position);

        if (legRefIDLength > 0)
        {
            buffer.putBytes(position, legRefIDHeader, 0, legRefIDHeaderLength);
            position += legRefIDHeaderLength;
            buffer.putBytes(position, legRefID, legRefIDOffset, legRefIDLength);
            position += legRefIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasLegPrice)
        {
            buffer.putBytes(position, legPriceHeader, 0, legPriceHeaderLength);
            position += legPriceHeaderLength;
            position += buffer.putFloatAscii(position, legPrice);
            buffer.putSeparator(position);
            position++;
        }

        if (hasLegSettlType)
        {
            buffer.putBytes(position, legSettlTypeHeader, 0, legSettlTypeHeaderLength);
            position += legSettlTypeHeaderLength;
            position += buffer.putCharAscii(position, legSettlType);
            buffer.putSeparator(position);
            position++;
        }

        if (legSettlDateLength > 0)
        {
            buffer.putBytes(position, legSettlDateHeader, 0, legSettlDateHeaderLength);
            position += legSettlDateHeaderLength;
            buffer.putBytes(position, legSettlDate, legSettlDateOffset, legSettlDateLength);
            position += legSettlDateLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasLegLastPx)
        {
            buffer.putBytes(position, legLastPxHeader, 0, legLastPxHeaderLength);
            position += legLastPxHeaderLength;
            position += buffer.putFloatAscii(position, legLastPx);
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
        this.resetLegQty();
        this.resetLegSwapType();
        this.resetLegPositionEffect();
        this.resetLegCoveredOrUncovered();
        this.resetLegRefID();
        this.resetLegPrice();
        this.resetLegSettlType();
        this.resetLegSettlDate();
        this.resetLegLastPx();
        instrumentLeg.reset();
        legStipulations.reset();
        nestedParties.reset();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetLegQty()
    {
        hasLegQty = false;
    }

    public void resetLegSwapType()
    {
        hasLegSwapType = false;
    }

    public void resetLegPositionEffect()
    {
        hasLegPositionEffect = false;
    }

    public void resetLegCoveredOrUncovered()
    {
        hasLegCoveredOrUncovered = false;
    }

    public void resetLegRefID()
    {
        legRefIDLength = 0;
    }

    public void resetLegPrice()
    {
        hasLegPrice = false;
    }

    public void resetLegSettlType()
    {
        hasLegSettlType = false;
    }

    public void resetLegSettlDate()
    {
        legSettlDateLength = 0;
    }

    public void resetLegLastPx()
    {
        hasLegLastPx = false;
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
        builder.append("\"MessageName\": \"LegsGroup\",\n");
    indent(builder, level);
    builder.append("\"InstrumentLeg\": ");
    instrumentLeg.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasLegQty())
        {
            indent(builder, level);
            builder.append("\"LegQty\": \"");
            legQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasLegSwapType())
        {
            indent(builder, level);
            builder.append("\"LegSwapType\": \"");
            builder.append(legSwapType);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"LegStipulations\": ");
    legStipulations.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasLegPositionEffect())
        {
            indent(builder, level);
            builder.append("\"LegPositionEffect\": \"");
            builder.append(legPositionEffect);
            builder.append("\",\n");
        }

        if (hasLegCoveredOrUncovered())
        {
            indent(builder, level);
            builder.append("\"LegCoveredOrUncovered\": \"");
            builder.append(legCoveredOrUncovered);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"NestedParties\": ");
    nestedParties.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasLegRefID())
        {
            indent(builder, level);
            builder.append("\"LegRefID\": \"");
            appendBuffer(builder, legRefID, legRefIDOffset, legRefIDLength);
            builder.append("\",\n");
        }

        if (hasLegPrice())
        {
            indent(builder, level);
            builder.append("\"LegPrice\": \"");
            legPrice.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasLegSettlType())
        {
            indent(builder, level);
            builder.append("\"LegSettlType\": \"");
            builder.append(legSettlType);
            builder.append("\",\n");
        }

        if (hasLegSettlDate())
        {
            indent(builder, level);
            builder.append("\"LegSettlDate\": \"");
            appendBuffer(builder, legSettlDate, legSettlDateOffset, legSettlDateLength);
            builder.append("\",\n");
        }

        if (hasLegLastPx())
        {
            indent(builder, level);
            builder.append("\"LegLastPx\": \"");
            legLastPx.appendTo(builder);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public LegsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((LegsGroupEncoder)encoder);
    }

    public LegsGroupEncoder copyTo(final LegsGroupEncoder encoder)
    {
        encoder.reset();

        instrumentLeg.copyTo(encoder.instrumentLeg());
        if (hasLegQty())
        {
            encoder.legQty(this.legQty());
        }

        if (hasLegSwapType())
        {
            encoder.legSwapType(this.legSwapType());
        }


        legStipulations.copyTo(encoder.legStipulations());
        if (hasLegPositionEffect())
        {
            encoder.legPositionEffect(this.legPositionEffect());
        }

        if (hasLegCoveredOrUncovered())
        {
            encoder.legCoveredOrUncovered(this.legCoveredOrUncovered());
        }


        nestedParties.copyTo(encoder.nestedParties());
        if (hasLegRefID())
        {
            encoder.legRefIDAsCopy(legRefID.byteArray(), 0, legRefIDLength);
        }

        if (hasLegPrice())
        {
            encoder.legPrice(this.legPrice());
        }

        if (hasLegSettlType())
        {
            encoder.legSettlType(this.legSettlType());
        }

        if (hasLegSettlDate())
        {
            encoder.legSettlDateAsCopy(legSettlDate.byteArray(), 0, legSettlDateLength);
        }

        if (hasLegLastPx())
        {
            encoder.legLastPx(this.legLastPx());
        }
        return encoder;
    }

}
    private int noLegsGroupCounter;

    private boolean hasNoLegsGroupCounter;

    public boolean hasNoLegsGroupCounter()
    {
        return hasNoLegsGroupCounter;
    }

    public TradeCaptureReportAckEncoder noLegsGroupCounter(int value)
    {
        noLegsGroupCounter = value;
        hasNoLegsGroupCounter = true;
        return this;
    }

    public int noLegsGroupCounter()
    {
        return noLegsGroupCounter;
    }


    private LegsGroupEncoder legsGroup = null;

    public LegsGroupEncoder legsGroup(final int numberOfElements)
    {
        hasNoLegsGroupCounter = true;
        noLegsGroupCounter = numberOfElements;
        if (legsGroup == null)
        {
            legsGroup = new LegsGroupEncoder();
        }
        return legsGroup;
    }

    private final MutableDirectBuffer clearingFeeIndicator = new UnsafeBuffer();

    private int clearingFeeIndicatorOffset = 0;

    private int clearingFeeIndicatorLength = 0;

    public TradeCaptureReportAckEncoder clearingFeeIndicator(final DirectBuffer value, final int offset, final int length)
    {
        clearingFeeIndicator.wrap(value);
        clearingFeeIndicatorOffset = offset;
        clearingFeeIndicatorLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder clearingFeeIndicator(final DirectBuffer value, final int length)
    {
        return clearingFeeIndicator(value, 0, length);
    }

    public TradeCaptureReportAckEncoder clearingFeeIndicator(final DirectBuffer value)
    {
        return clearingFeeIndicator(value, 0, value.capacity());
    }

    public TradeCaptureReportAckEncoder clearingFeeIndicator(final byte[] value, final int offset, final int length)
    {
        clearingFeeIndicator.wrap(value);
        clearingFeeIndicatorOffset = offset;
        clearingFeeIndicatorLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder clearingFeeIndicatorAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(clearingFeeIndicator, value, offset, length);
        clearingFeeIndicatorOffset = offset;
        clearingFeeIndicatorLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder clearingFeeIndicator(final byte[] value, final int length)
    {
        return clearingFeeIndicator(value, 0, length);
    }

    public TradeCaptureReportAckEncoder clearingFeeIndicator(final byte[] value)
    {
        return clearingFeeIndicator(value, 0, value.length);
    }

    public boolean hasClearingFeeIndicator()
    {
        return clearingFeeIndicatorLength > 0;
    }

    public MutableDirectBuffer clearingFeeIndicator()
    {
        return clearingFeeIndicator;
    }

    public String clearingFeeIndicatorAsString()
    {
        return clearingFeeIndicator.getStringWithoutLengthAscii(clearingFeeIndicatorOffset, clearingFeeIndicatorLength);
    }

    public TradeCaptureReportAckEncoder clearingFeeIndicator(final CharSequence value)
    {
        toBytes(value, clearingFeeIndicator);
        clearingFeeIndicatorOffset = 0;
        clearingFeeIndicatorLength = value.length();
        return this;
    }

    public TradeCaptureReportAckEncoder clearingFeeIndicator(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            clearingFeeIndicator.wrap(buffer);
            clearingFeeIndicatorOffset = value.offset();
            clearingFeeIndicatorLength = value.length();
        }
        return this;
    }

    public TradeCaptureReportAckEncoder clearingFeeIndicator(final char[] value)
    {
        return clearingFeeIndicator(value, 0, value.length);
    }

    public TradeCaptureReportAckEncoder clearingFeeIndicator(final char[] value, final int length)
    {
        return clearingFeeIndicator(value, 0, length);
    }

    public TradeCaptureReportAckEncoder clearingFeeIndicator(final char[] value, final int offset, final int length)
    {
        toBytes(value, clearingFeeIndicator, offset, length);
        clearingFeeIndicatorOffset = 0;
        clearingFeeIndicatorLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder clearingFeeIndicator(ClearingFeeIndicator value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == ClearingFeeIndicator.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: clearingFeeIndicator Value: " + value );
            }
            if (value == ClearingFeeIndicator.NULL_VAL)
            {
                return this;
            }
        }
        return clearingFeeIndicator(value.representation());
    }

    private char orderCapacity;

    private boolean hasOrderCapacity;

    public boolean hasOrderCapacity()
    {
        return hasOrderCapacity;
    }

    public TradeCaptureReportAckEncoder orderCapacity(char value)
    {
        orderCapacity = value;
        hasOrderCapacity = true;
        return this;
    }

    public char orderCapacity()
    {
        return orderCapacity;
    }

    public TradeCaptureReportAckEncoder orderCapacity(OrderCapacity value)
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

    public TradeCaptureReportAckEncoder orderRestrictions(final DirectBuffer value, final int offset, final int length)
    {
        orderRestrictions.wrap(value);
        orderRestrictionsOffset = offset;
        orderRestrictionsLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder orderRestrictions(final DirectBuffer value, final int length)
    {
        return orderRestrictions(value, 0, length);
    }

    public TradeCaptureReportAckEncoder orderRestrictions(final DirectBuffer value)
    {
        return orderRestrictions(value, 0, value.capacity());
    }

    public TradeCaptureReportAckEncoder orderRestrictions(final byte[] value, final int offset, final int length)
    {
        orderRestrictions.wrap(value);
        orderRestrictionsOffset = offset;
        orderRestrictionsLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder orderRestrictionsAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(orderRestrictions, value, offset, length);
        orderRestrictionsOffset = offset;
        orderRestrictionsLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder orderRestrictions(final byte[] value, final int length)
    {
        return orderRestrictions(value, 0, length);
    }

    public TradeCaptureReportAckEncoder orderRestrictions(final byte[] value)
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

    public TradeCaptureReportAckEncoder orderRestrictions(final CharSequence value)
    {
        toBytes(value, orderRestrictions);
        orderRestrictionsOffset = 0;
        orderRestrictionsLength = value.length();
        return this;
    }

    public TradeCaptureReportAckEncoder orderRestrictions(final AsciiSequenceView value)
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

    public TradeCaptureReportAckEncoder orderRestrictions(final char[] value)
    {
        return orderRestrictions(value, 0, value.length);
    }

    public TradeCaptureReportAckEncoder orderRestrictions(final char[] value, final int length)
    {
        return orderRestrictions(value, 0, length);
    }

    public TradeCaptureReportAckEncoder orderRestrictions(final char[] value, final int offset, final int length)
    {
        toBytes(value, orderRestrictions, offset, length);
        orderRestrictionsOffset = 0;
        orderRestrictionsLength = length;
        return this;
    }

    private int custOrderCapacity;

    private boolean hasCustOrderCapacity;

    public boolean hasCustOrderCapacity()
    {
        return hasCustOrderCapacity;
    }

    public TradeCaptureReportAckEncoder custOrderCapacity(int value)
    {
        custOrderCapacity = value;
        hasCustOrderCapacity = true;
        return this;
    }

    public int custOrderCapacity()
    {
        return custOrderCapacity;
    }

    public TradeCaptureReportAckEncoder custOrderCapacity(CustOrderCapacity value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == CustOrderCapacity.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: custOrderCapacity Value: " + value );
            }
            if (value == CustOrderCapacity.NULL_VAL)
            {
                return this;
            }
        }
        return custOrderCapacity(value.representation());
    }

    private final MutableDirectBuffer account = new UnsafeBuffer();

    private int accountOffset = 0;

    private int accountLength = 0;

    public TradeCaptureReportAckEncoder account(final DirectBuffer value, final int offset, final int length)
    {
        account.wrap(value);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder account(final DirectBuffer value, final int length)
    {
        return account(value, 0, length);
    }

    public TradeCaptureReportAckEncoder account(final DirectBuffer value)
    {
        return account(value, 0, value.capacity());
    }

    public TradeCaptureReportAckEncoder account(final byte[] value, final int offset, final int length)
    {
        account.wrap(value);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder accountAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(account, value, offset, length);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder account(final byte[] value, final int length)
    {
        return account(value, 0, length);
    }

    public TradeCaptureReportAckEncoder account(final byte[] value)
    {
        return account(value, 0, value.length);
    }

    public boolean hasAccount()
    {
        return accountLength > 0;
    }

    public MutableDirectBuffer account()
    {
        return account;
    }

    public String accountAsString()
    {
        return account.getStringWithoutLengthAscii(accountOffset, accountLength);
    }

    public TradeCaptureReportAckEncoder account(final CharSequence value)
    {
        toBytes(value, account);
        accountOffset = 0;
        accountLength = value.length();
        return this;
    }

    public TradeCaptureReportAckEncoder account(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            account.wrap(buffer);
            accountOffset = value.offset();
            accountLength = value.length();
        }
        return this;
    }

    public TradeCaptureReportAckEncoder account(final char[] value)
    {
        return account(value, 0, value.length);
    }

    public TradeCaptureReportAckEncoder account(final char[] value, final int length)
    {
        return account(value, 0, length);
    }

    public TradeCaptureReportAckEncoder account(final char[] value, final int offset, final int length)
    {
        toBytes(value, account, offset, length);
        accountOffset = 0;
        accountLength = length;
        return this;
    }

    private int acctIDSource;

    private boolean hasAcctIDSource;

    public boolean hasAcctIDSource()
    {
        return hasAcctIDSource;
    }

    public TradeCaptureReportAckEncoder acctIDSource(int value)
    {
        acctIDSource = value;
        hasAcctIDSource = true;
        return this;
    }

    public int acctIDSource()
    {
        return acctIDSource;
    }

    public TradeCaptureReportAckEncoder acctIDSource(AcctIDSource value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == AcctIDSource.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: acctIDSource Value: " + value );
            }
            if (value == AcctIDSource.NULL_VAL)
            {
                return this;
            }
        }
        return acctIDSource(value.representation());
    }

    private int accountType;

    private boolean hasAccountType;

    public boolean hasAccountType()
    {
        return hasAccountType;
    }

    public TradeCaptureReportAckEncoder accountType(int value)
    {
        accountType = value;
        hasAccountType = true;
        return this;
    }

    public int accountType()
    {
        return accountType;
    }

    public TradeCaptureReportAckEncoder accountType(AccountType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == AccountType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: accountType Value: " + value );
            }
            if (value == AccountType.NULL_VAL)
            {
                return this;
            }
        }
        return accountType(value.representation());
    }

    private char positionEffect;

    private boolean hasPositionEffect;

    public boolean hasPositionEffect()
    {
        return hasPositionEffect;
    }

    public TradeCaptureReportAckEncoder positionEffect(char value)
    {
        positionEffect = value;
        hasPositionEffect = true;
        return this;
    }

    public char positionEffect()
    {
        return positionEffect;
    }

    public TradeCaptureReportAckEncoder positionEffect(PositionEffect value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == PositionEffect.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: positionEffect Value: " + value );
            }
            if (value == PositionEffect.NULL_VAL)
            {
                return this;
            }
        }
        return positionEffect(value.representation());
    }

    private char preallocMethod;

    private boolean hasPreallocMethod;

    public boolean hasPreallocMethod()
    {
        return hasPreallocMethod;
    }

    public TradeCaptureReportAckEncoder preallocMethod(char value)
    {
        preallocMethod = value;
        hasPreallocMethod = true;
        return this;
    }

    public char preallocMethod()
    {
        return preallocMethod;
    }

    public TradeCaptureReportAckEncoder preallocMethod(PreallocMethod value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == PreallocMethod.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: preallocMethod Value: " + value );
            }
            if (value == PreallocMethod.NULL_VAL)
            {
                return this;
            }
        }
        return preallocMethod(value.representation());
    }



public static class AllocsGroupEncoder
{
    private AllocsGroupEncoder next = null;

    public AllocsGroupEncoder next()
    {
        if (next == null)
        {
            next = new AllocsGroupEncoder();
        }
        return next;
    }

    private static final int allocAccountHeaderLength = 3;
    private static final byte[] allocAccountHeader = new byte[] {55, 57, (byte) '='};

    private static final int allocAcctIDSourceHeaderLength = 4;
    private static final byte[] allocAcctIDSourceHeader = new byte[] {54, 54, 49, (byte) '='};

    private static final int allocSettlCurrencyHeaderLength = 4;
    private static final byte[] allocSettlCurrencyHeader = new byte[] {55, 51, 54, (byte) '='};

    private static final int individualAllocIDHeaderLength = 4;
    private static final byte[] individualAllocIDHeader = new byte[] {52, 54, 55, (byte) '='};

    private static final int allocQtyHeaderLength = 3;
    private static final byte[] allocQtyHeader = new byte[] {56, 48, (byte) '='};

    private final MutableDirectBuffer allocAccount = new UnsafeBuffer();

    private int allocAccountOffset = 0;

    private int allocAccountLength = 0;

    public AllocsGroupEncoder allocAccount(final DirectBuffer value, final int offset, final int length)
    {
        allocAccount.wrap(value);
        allocAccountOffset = offset;
        allocAccountLength = length;
        return this;
    }

    public AllocsGroupEncoder allocAccount(final DirectBuffer value, final int length)
    {
        return allocAccount(value, 0, length);
    }

    public AllocsGroupEncoder allocAccount(final DirectBuffer value)
    {
        return allocAccount(value, 0, value.capacity());
    }

    public AllocsGroupEncoder allocAccount(final byte[] value, final int offset, final int length)
    {
        allocAccount.wrap(value);
        allocAccountOffset = offset;
        allocAccountLength = length;
        return this;
    }

    public AllocsGroupEncoder allocAccountAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(allocAccount, value, offset, length);
        allocAccountOffset = offset;
        allocAccountLength = length;
        return this;
    }

    public AllocsGroupEncoder allocAccount(final byte[] value, final int length)
    {
        return allocAccount(value, 0, length);
    }

    public AllocsGroupEncoder allocAccount(final byte[] value)
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

    public AllocsGroupEncoder allocAccount(final CharSequence value)
    {
        toBytes(value, allocAccount);
        allocAccountOffset = 0;
        allocAccountLength = value.length();
        return this;
    }

    public AllocsGroupEncoder allocAccount(final AsciiSequenceView value)
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

    public AllocsGroupEncoder allocAccount(final char[] value)
    {
        return allocAccount(value, 0, value.length);
    }

    public AllocsGroupEncoder allocAccount(final char[] value, final int length)
    {
        return allocAccount(value, 0, length);
    }

    public AllocsGroupEncoder allocAccount(final char[] value, final int offset, final int length)
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

    public AllocsGroupEncoder allocAcctIDSource(int value)
    {
        allocAcctIDSource = value;
        hasAllocAcctIDSource = true;
        return this;
    }

    public int allocAcctIDSource()
    {
        return allocAcctIDSource;
    }

    private final MutableDirectBuffer allocSettlCurrency = new UnsafeBuffer();

    private int allocSettlCurrencyOffset = 0;

    private int allocSettlCurrencyLength = 0;

    public AllocsGroupEncoder allocSettlCurrency(final DirectBuffer value, final int offset, final int length)
    {
        allocSettlCurrency.wrap(value);
        allocSettlCurrencyOffset = offset;
        allocSettlCurrencyLength = length;
        return this;
    }

    public AllocsGroupEncoder allocSettlCurrency(final DirectBuffer value, final int length)
    {
        return allocSettlCurrency(value, 0, length);
    }

    public AllocsGroupEncoder allocSettlCurrency(final DirectBuffer value)
    {
        return allocSettlCurrency(value, 0, value.capacity());
    }

    public AllocsGroupEncoder allocSettlCurrency(final byte[] value, final int offset, final int length)
    {
        allocSettlCurrency.wrap(value);
        allocSettlCurrencyOffset = offset;
        allocSettlCurrencyLength = length;
        return this;
    }

    public AllocsGroupEncoder allocSettlCurrencyAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(allocSettlCurrency, value, offset, length);
        allocSettlCurrencyOffset = offset;
        allocSettlCurrencyLength = length;
        return this;
    }

    public AllocsGroupEncoder allocSettlCurrency(final byte[] value, final int length)
    {
        return allocSettlCurrency(value, 0, length);
    }

    public AllocsGroupEncoder allocSettlCurrency(final byte[] value)
    {
        return allocSettlCurrency(value, 0, value.length);
    }

    public boolean hasAllocSettlCurrency()
    {
        return allocSettlCurrencyLength > 0;
    }

    public MutableDirectBuffer allocSettlCurrency()
    {
        return allocSettlCurrency;
    }

    public String allocSettlCurrencyAsString()
    {
        return allocSettlCurrency.getStringWithoutLengthAscii(allocSettlCurrencyOffset, allocSettlCurrencyLength);
    }

    public AllocsGroupEncoder allocSettlCurrency(final CharSequence value)
    {
        toBytes(value, allocSettlCurrency);
        allocSettlCurrencyOffset = 0;
        allocSettlCurrencyLength = value.length();
        return this;
    }

    public AllocsGroupEncoder allocSettlCurrency(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            allocSettlCurrency.wrap(buffer);
            allocSettlCurrencyOffset = value.offset();
            allocSettlCurrencyLength = value.length();
        }
        return this;
    }

    public AllocsGroupEncoder allocSettlCurrency(final char[] value)
    {
        return allocSettlCurrency(value, 0, value.length);
    }

    public AllocsGroupEncoder allocSettlCurrency(final char[] value, final int length)
    {
        return allocSettlCurrency(value, 0, length);
    }

    public AllocsGroupEncoder allocSettlCurrency(final char[] value, final int offset, final int length)
    {
        toBytes(value, allocSettlCurrency, offset, length);
        allocSettlCurrencyOffset = 0;
        allocSettlCurrencyLength = length;
        return this;
    }

    private final MutableDirectBuffer individualAllocID = new UnsafeBuffer();

    private int individualAllocIDOffset = 0;

    private int individualAllocIDLength = 0;

    public AllocsGroupEncoder individualAllocID(final DirectBuffer value, final int offset, final int length)
    {
        individualAllocID.wrap(value);
        individualAllocIDOffset = offset;
        individualAllocIDLength = length;
        return this;
    }

    public AllocsGroupEncoder individualAllocID(final DirectBuffer value, final int length)
    {
        return individualAllocID(value, 0, length);
    }

    public AllocsGroupEncoder individualAllocID(final DirectBuffer value)
    {
        return individualAllocID(value, 0, value.capacity());
    }

    public AllocsGroupEncoder individualAllocID(final byte[] value, final int offset, final int length)
    {
        individualAllocID.wrap(value);
        individualAllocIDOffset = offset;
        individualAllocIDLength = length;
        return this;
    }

    public AllocsGroupEncoder individualAllocIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(individualAllocID, value, offset, length);
        individualAllocIDOffset = offset;
        individualAllocIDLength = length;
        return this;
    }

    public AllocsGroupEncoder individualAllocID(final byte[] value, final int length)
    {
        return individualAllocID(value, 0, length);
    }

    public AllocsGroupEncoder individualAllocID(final byte[] value)
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

    public AllocsGroupEncoder individualAllocID(final CharSequence value)
    {
        toBytes(value, individualAllocID);
        individualAllocIDOffset = 0;
        individualAllocIDLength = value.length();
        return this;
    }

    public AllocsGroupEncoder individualAllocID(final AsciiSequenceView value)
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

    public AllocsGroupEncoder individualAllocID(final char[] value)
    {
        return individualAllocID(value, 0, value.length);
    }

    public AllocsGroupEncoder individualAllocID(final char[] value, final int length)
    {
        return individualAllocID(value, 0, length);
    }

    public AllocsGroupEncoder individualAllocID(final char[] value, final int offset, final int length)
    {
        toBytes(value, individualAllocID, offset, length);
        individualAllocIDOffset = 0;
        individualAllocIDLength = length;
        return this;
    }

    private final NestedParties2Encoder nestedParties2 = new NestedParties2Encoder();
    public NestedParties2Encoder nestedParties2()
    {
        return nestedParties2;
    }

    private final DecimalFloat allocQty = new DecimalFloat();

    private boolean hasAllocQty;

    public boolean hasAllocQty()
    {
        return hasAllocQty;
    }

    public AllocsGroupEncoder allocQty(DecimalFloat value)
    {
        allocQty.set(value);
        hasAllocQty = true;
        return this;
    }

    public AllocsGroupEncoder allocQty(long value, int scale)
    {
        allocQty.set(value, scale);
        hasAllocQty = true;
        return this;
    }

    public DecimalFloat allocQty()
    {
        return allocQty;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

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

        if (allocSettlCurrencyLength > 0)
        {
            buffer.putBytes(position, allocSettlCurrencyHeader, 0, allocSettlCurrencyHeaderLength);
            position += allocSettlCurrencyHeaderLength;
            buffer.putBytes(position, allocSettlCurrency, allocSettlCurrencyOffset, allocSettlCurrencyLength);
            position += allocSettlCurrencyLength;
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

            position += nestedParties2.encode(buffer, position);

        if (hasAllocQty)
        {
            buffer.putBytes(position, allocQtyHeader, 0, allocQtyHeaderLength);
            position += allocQtyHeaderLength;
            position += buffer.putFloatAscii(position, allocQty);
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
        this.resetAllocAccount();
        this.resetAllocAcctIDSource();
        this.resetAllocSettlCurrency();
        this.resetIndividualAllocID();
        this.resetAllocQty();
        nestedParties2.reset();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetAllocAccount()
    {
        allocAccountLength = 0;
    }

    public void resetAllocAcctIDSource()
    {
        hasAllocAcctIDSource = false;
    }

    public void resetAllocSettlCurrency()
    {
        allocSettlCurrencyLength = 0;
    }

    public void resetIndividualAllocID()
    {
        individualAllocIDLength = 0;
    }

    public void resetAllocQty()
    {
        hasAllocQty = false;
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
        builder.append("\"MessageName\": \"AllocsGroup\",\n");
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

        if (hasAllocSettlCurrency())
        {
            indent(builder, level);
            builder.append("\"AllocSettlCurrency\": \"");
            appendBuffer(builder, allocSettlCurrency, allocSettlCurrencyOffset, allocSettlCurrencyLength);
            builder.append("\",\n");
        }

        if (hasIndividualAllocID())
        {
            indent(builder, level);
            builder.append("\"IndividualAllocID\": \"");
            appendBuffer(builder, individualAllocID, individualAllocIDOffset, individualAllocIDLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"NestedParties2\": ");
    nestedParties2.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasAllocQty())
        {
            indent(builder, level);
            builder.append("\"AllocQty\": \"");
            allocQty.appendTo(builder);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public AllocsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((AllocsGroupEncoder)encoder);
    }

    public AllocsGroupEncoder copyTo(final AllocsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasAllocAccount())
        {
            encoder.allocAccountAsCopy(allocAccount.byteArray(), 0, allocAccountLength);
        }

        if (hasAllocAcctIDSource())
        {
            encoder.allocAcctIDSource(this.allocAcctIDSource());
        }

        if (hasAllocSettlCurrency())
        {
            encoder.allocSettlCurrencyAsCopy(allocSettlCurrency.byteArray(), 0, allocSettlCurrencyLength);
        }

        if (hasIndividualAllocID())
        {
            encoder.individualAllocIDAsCopy(individualAllocID.byteArray(), 0, individualAllocIDLength);
        }


        nestedParties2.copyTo(encoder.nestedParties2());
        if (hasAllocQty())
        {
            encoder.allocQty(this.allocQty());
        }
        return encoder;
    }

}
    private int noAllocsGroupCounter;

    private boolean hasNoAllocsGroupCounter;

    public boolean hasNoAllocsGroupCounter()
    {
        return hasNoAllocsGroupCounter;
    }

    public TradeCaptureReportAckEncoder noAllocsGroupCounter(int value)
    {
        noAllocsGroupCounter = value;
        hasNoAllocsGroupCounter = true;
        return this;
    }

    public int noAllocsGroupCounter()
    {
        return noAllocsGroupCounter;
    }


    private AllocsGroupEncoder allocsGroup = null;

    public AllocsGroupEncoder allocsGroup(final int numberOfElements)
    {
        hasNoAllocsGroupCounter = true;
        noAllocsGroupCounter = numberOfElements;
        if (allocsGroup == null)
        {
            allocsGroup = new AllocsGroupEncoder();
        }
        return allocsGroup;
    }

    public long encode(final MutableAsciiBuffer buffer, final int offset)
    {
        final long startMessageResult = header.startMessage(buffer, offset);
        final int bodyStart = Encoder.offset(startMessageResult);
        int position = bodyStart + Encoder.length(startMessageResult);

        if (tradeReportIDLength > 0)
        {
            buffer.putBytes(position, tradeReportIDHeader, 0, tradeReportIDHeaderLength);
            position += tradeReportIDHeaderLength;
            buffer.putBytes(position, tradeReportID, tradeReportIDOffset, tradeReportIDLength);
            position += tradeReportIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: TradeReportID");
        }

        if (hasTradeReportTransType)
        {
            buffer.putBytes(position, tradeReportTransTypeHeader, 0, tradeReportTransTypeHeaderLength);
            position += tradeReportTransTypeHeaderLength;
            position += buffer.putIntAscii(position, tradeReportTransType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasTradeReportType)
        {
            buffer.putBytes(position, tradeReportTypeHeader, 0, tradeReportTypeHeaderLength);
            position += tradeReportTypeHeaderLength;
            position += buffer.putIntAscii(position, tradeReportType);
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

        if (hasSecondaryTrdType)
        {
            buffer.putBytes(position, secondaryTrdTypeHeader, 0, secondaryTrdTypeHeaderLength);
            position += secondaryTrdTypeHeaderLength;
            position += buffer.putIntAscii(position, secondaryTrdType);
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

        if (hasExecType)
        {
            buffer.putBytes(position, execTypeHeader, 0, execTypeHeaderLength);
            position += execTypeHeaderLength;
            position += buffer.putCharAscii(position, execType);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: ExecType");
        }

        if (tradeReportRefIDLength > 0)
        {
            buffer.putBytes(position, tradeReportRefIDHeader, 0, tradeReportRefIDHeaderLength);
            position += tradeReportRefIDHeaderLength;
            buffer.putBytes(position, tradeReportRefID, tradeReportRefIDOffset, tradeReportRefIDLength);
            position += tradeReportRefIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (secondaryTradeReportRefIDLength > 0)
        {
            buffer.putBytes(position, secondaryTradeReportRefIDHeader, 0, secondaryTradeReportRefIDHeaderLength);
            position += secondaryTradeReportRefIDHeaderLength;
            buffer.putBytes(position, secondaryTradeReportRefID, secondaryTradeReportRefIDOffset, secondaryTradeReportRefIDLength);
            position += secondaryTradeReportRefIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasTrdRptStatus)
        {
            buffer.putBytes(position, trdRptStatusHeader, 0, trdRptStatusHeaderLength);
            position += trdRptStatusHeaderLength;
            position += buffer.putIntAscii(position, trdRptStatus);
            buffer.putSeparator(position);
            position++;
        }

        if (hasTradeReportRejectReason)
        {
            buffer.putBytes(position, tradeReportRejectReasonHeader, 0, tradeReportRejectReasonHeaderLength);
            position += tradeReportRejectReasonHeaderLength;
            position += buffer.putIntAscii(position, tradeReportRejectReason);
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

        if (hasSubscriptionRequestType)
        {
            buffer.putBytes(position, subscriptionRequestTypeHeader, 0, subscriptionRequestTypeHeaderLength);
            position += subscriptionRequestTypeHeaderLength;
            position += buffer.putCharAscii(position, subscriptionRequestType);
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

        if (execIDLength > 0)
        {
            buffer.putBytes(position, execIDHeader, 0, execIDHeaderLength);
            position += execIDHeaderLength;
            buffer.putBytes(position, execID, execIDOffset, execIDLength);
            position += execIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (secondaryExecIDLength > 0)
        {
            buffer.putBytes(position, secondaryExecIDHeader, 0, secondaryExecIDHeaderLength);
            position += secondaryExecIDHeaderLength;
            buffer.putBytes(position, secondaryExecID, secondaryExecIDOffset, secondaryExecIDLength);
            position += secondaryExecIDLength;
            buffer.putSeparator(position);
            position++;
        }

            position += instrument.encode(buffer, position);

        if (transactTimeLength > 0)
        {
            buffer.putBytes(position, transactTimeHeader, 0, transactTimeHeaderLength);
            position += transactTimeHeaderLength;
            buffer.putBytes(position, transactTime, transactTimeOffset, transactTimeLength);
            position += transactTimeLength;
            buffer.putSeparator(position);
            position++;
        }

            position += trdRegTimestamps.encode(buffer, position);

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

        if (hasNoLegsGroupCounter)
        {
            buffer.putBytes(position, noLegsGroupCounterHeader, 0, noLegsGroupCounterHeaderLength);
            position += noLegsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noLegsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (legsGroup != null)
        {
            position += legsGroup.encode(buffer, position, noLegsGroupCounter);
        }


        if (clearingFeeIndicatorLength > 0)
        {
            buffer.putBytes(position, clearingFeeIndicatorHeader, 0, clearingFeeIndicatorHeaderLength);
            position += clearingFeeIndicatorHeaderLength;
            buffer.putBytes(position, clearingFeeIndicator, clearingFeeIndicatorOffset, clearingFeeIndicatorLength);
            position += clearingFeeIndicatorLength;
            buffer.putSeparator(position);
            position++;
        }

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

        if (hasCustOrderCapacity)
        {
            buffer.putBytes(position, custOrderCapacityHeader, 0, custOrderCapacityHeaderLength);
            position += custOrderCapacityHeaderLength;
            position += buffer.putIntAscii(position, custOrderCapacity);
            buffer.putSeparator(position);
            position++;
        }

        if (accountLength > 0)
        {
            buffer.putBytes(position, accountHeader, 0, accountHeaderLength);
            position += accountHeaderLength;
            buffer.putBytes(position, account, accountOffset, accountLength);
            position += accountLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasAcctIDSource)
        {
            buffer.putBytes(position, acctIDSourceHeader, 0, acctIDSourceHeaderLength);
            position += acctIDSourceHeaderLength;
            position += buffer.putIntAscii(position, acctIDSource);
            buffer.putSeparator(position);
            position++;
        }

        if (hasAccountType)
        {
            buffer.putBytes(position, accountTypeHeader, 0, accountTypeHeaderLength);
            position += accountTypeHeaderLength;
            position += buffer.putIntAscii(position, accountType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasPositionEffect)
        {
            buffer.putBytes(position, positionEffectHeader, 0, positionEffectHeaderLength);
            position += positionEffectHeaderLength;
            position += buffer.putCharAscii(position, positionEffect);
            buffer.putSeparator(position);
            position++;
        }

        if (hasPreallocMethod)
        {
            buffer.putBytes(position, preallocMethodHeader, 0, preallocMethodHeaderLength);
            position += preallocMethodHeaderLength;
            position += buffer.putCharAscii(position, preallocMethod);
            buffer.putSeparator(position);
            position++;
        }

        if (hasNoAllocsGroupCounter)
        {
            buffer.putBytes(position, noAllocsGroupCounterHeader, 0, noAllocsGroupCounterHeaderLength);
            position += noAllocsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noAllocsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (allocsGroup != null)
        {
            position += allocsGroup.encode(buffer, position, noAllocsGroupCounter);
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
        this.resetTradeReportID();
        this.resetTradeReportTransType();
        this.resetTradeReportType();
        this.resetTrdType();
        this.resetTrdSubType();
        this.resetSecondaryTrdType();
        this.resetTransferReason();
        this.resetExecType();
        this.resetTradeReportRefID();
        this.resetSecondaryTradeReportRefID();
        this.resetTrdRptStatus();
        this.resetTradeReportRejectReason();
        this.resetSecondaryTradeReportID();
        this.resetSubscriptionRequestType();
        this.resetTradeLinkID();
        this.resetTrdMatchID();
        this.resetExecID();
        this.resetSecondaryExecID();
        this.resetTransactTime();
        this.resetResponseTransportType();
        this.resetResponseDestination();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        this.resetClearingFeeIndicator();
        this.resetOrderCapacity();
        this.resetOrderRestrictions();
        this.resetCustOrderCapacity();
        this.resetAccount();
        this.resetAcctIDSource();
        this.resetAccountType();
        this.resetPositionEffect();
        this.resetPreallocMethod();
        instrument.reset();
        trdRegTimestamps.reset();
        this.resetLegsGroup();
        this.resetAllocsGroup();
    }

    public void resetTradeReportID()
    {
        tradeReportIDLength = 0;
    }

    public void resetTradeReportTransType()
    {
        hasTradeReportTransType = false;
    }

    public void resetTradeReportType()
    {
        hasTradeReportType = false;
    }

    public void resetTrdType()
    {
        hasTrdType = false;
    }

    public void resetTrdSubType()
    {
        hasTrdSubType = false;
    }

    public void resetSecondaryTrdType()
    {
        hasSecondaryTrdType = false;
    }

    public void resetTransferReason()
    {
        transferReasonLength = 0;
    }

    public void resetExecType()
    {
        execType = MISSING_CHAR;
    }

    public void resetTradeReportRefID()
    {
        tradeReportRefIDLength = 0;
    }

    public void resetSecondaryTradeReportRefID()
    {
        secondaryTradeReportRefIDLength = 0;
    }

    public void resetTrdRptStatus()
    {
        hasTrdRptStatus = false;
    }

    public void resetTradeReportRejectReason()
    {
        hasTradeReportRejectReason = false;
    }

    public void resetSecondaryTradeReportID()
    {
        secondaryTradeReportIDLength = 0;
    }

    public void resetSubscriptionRequestType()
    {
        hasSubscriptionRequestType = false;
    }

    public void resetTradeLinkID()
    {
        tradeLinkIDLength = 0;
    }

    public void resetTrdMatchID()
    {
        trdMatchIDLength = 0;
    }

    public void resetExecID()
    {
        execIDLength = 0;
    }

    public void resetSecondaryExecID()
    {
        secondaryExecIDLength = 0;
    }

    public void resetTransactTime()
    {
        transactTimeLength = 0;
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

    public void resetClearingFeeIndicator()
    {
        clearingFeeIndicatorLength = 0;
    }

    public void resetOrderCapacity()
    {
        hasOrderCapacity = false;
    }

    public void resetOrderRestrictions()
    {
        orderRestrictionsLength = 0;
    }

    public void resetCustOrderCapacity()
    {
        hasCustOrderCapacity = false;
    }

    public void resetAccount()
    {
        accountLength = 0;
    }

    public void resetAcctIDSource()
    {
        hasAcctIDSource = false;
    }

    public void resetAccountType()
    {
        hasAccountType = false;
    }

    public void resetPositionEffect()
    {
        hasPositionEffect = false;
    }

    public void resetPreallocMethod()
    {
        hasPreallocMethod = false;
    }

    public void resetLegsGroup()
    {
        if (legsGroup != null)
        {
            legsGroup.reset();
        }
        noLegsGroupCounter = 0;
        hasNoLegsGroupCounter = false;
    }

    public void resetAllocsGroup()
    {
        if (allocsGroup != null)
        {
            allocsGroup.reset();
        }
        noAllocsGroupCounter = 0;
        hasNoAllocsGroupCounter = false;
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
        builder.append("\"MessageName\": \"TradeCaptureReportAck\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasTradeReportID())
        {
            indent(builder, level);
            builder.append("\"TradeReportID\": \"");
            appendBuffer(builder, tradeReportID, tradeReportIDOffset, tradeReportIDLength);
            builder.append("\",\n");
        }

        if (hasTradeReportTransType())
        {
            indent(builder, level);
            builder.append("\"TradeReportTransType\": \"");
            builder.append(tradeReportTransType);
            builder.append("\",\n");
        }

        if (hasTradeReportType())
        {
            indent(builder, level);
            builder.append("\"TradeReportType\": \"");
            builder.append(tradeReportType);
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

        if (hasSecondaryTrdType())
        {
            indent(builder, level);
            builder.append("\"SecondaryTrdType\": \"");
            builder.append(secondaryTrdType);
            builder.append("\",\n");
        }

        if (hasTransferReason())
        {
            indent(builder, level);
            builder.append("\"TransferReason\": \"");
            appendBuffer(builder, transferReason, transferReasonOffset, transferReasonLength);
            builder.append("\",\n");
        }

        if (hasExecType())
        {
            indent(builder, level);
            builder.append("\"ExecType\": \"");
            builder.append(execType);
            builder.append("\",\n");
        }

        if (hasTradeReportRefID())
        {
            indent(builder, level);
            builder.append("\"TradeReportRefID\": \"");
            appendBuffer(builder, tradeReportRefID, tradeReportRefIDOffset, tradeReportRefIDLength);
            builder.append("\",\n");
        }

        if (hasSecondaryTradeReportRefID())
        {
            indent(builder, level);
            builder.append("\"SecondaryTradeReportRefID\": \"");
            appendBuffer(builder, secondaryTradeReportRefID, secondaryTradeReportRefIDOffset, secondaryTradeReportRefIDLength);
            builder.append("\",\n");
        }

        if (hasTrdRptStatus())
        {
            indent(builder, level);
            builder.append("\"TrdRptStatus\": \"");
            builder.append(trdRptStatus);
            builder.append("\",\n");
        }

        if (hasTradeReportRejectReason())
        {
            indent(builder, level);
            builder.append("\"TradeReportRejectReason\": \"");
            builder.append(tradeReportRejectReason);
            builder.append("\",\n");
        }

        if (hasSecondaryTradeReportID())
        {
            indent(builder, level);
            builder.append("\"SecondaryTradeReportID\": \"");
            appendBuffer(builder, secondaryTradeReportID, secondaryTradeReportIDOffset, secondaryTradeReportIDLength);
            builder.append("\",\n");
        }

        if (hasSubscriptionRequestType())
        {
            indent(builder, level);
            builder.append("\"SubscriptionRequestType\": \"");
            builder.append(subscriptionRequestType);
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

        if (hasExecID())
        {
            indent(builder, level);
            builder.append("\"ExecID\": \"");
            appendBuffer(builder, execID, execIDOffset, execIDLength);
            builder.append("\",\n");
        }

        if (hasSecondaryExecID())
        {
            indent(builder, level);
            builder.append("\"SecondaryExecID\": \"");
            appendBuffer(builder, secondaryExecID, secondaryExecIDOffset, secondaryExecIDLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"Instrument\": ");
    instrument.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasTransactTime())
        {
            indent(builder, level);
            builder.append("\"TransactTime\": \"");
            appendBuffer(builder, transactTime, transactTimeOffset, transactTimeLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"TrdRegTimestamps\": ");
    trdRegTimestamps.appendTo(builder, level + 1);
    builder.append("\n");

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

        if (hasNoLegsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"LegsGroup\": [\n");
            final int noLegsGroupCounter = this.noLegsGroupCounter;
            LegsGroupEncoder legsGroup = this.legsGroup;
            for (int i = 0; i < noLegsGroupCounter; i++)
            {
                indent(builder, level);
                legsGroup.appendTo(builder, level + 1);
                if (i < (noLegsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                legsGroup = legsGroup.next();
            }
            indent(builder, level);
            builder.append("],\n");
        }

        if (hasClearingFeeIndicator())
        {
            indent(builder, level);
            builder.append("\"ClearingFeeIndicator\": \"");
            appendBuffer(builder, clearingFeeIndicator, clearingFeeIndicatorOffset, clearingFeeIndicatorLength);
            builder.append("\",\n");
        }

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

        if (hasCustOrderCapacity())
        {
            indent(builder, level);
            builder.append("\"CustOrderCapacity\": \"");
            builder.append(custOrderCapacity);
            builder.append("\",\n");
        }

        if (hasAccount())
        {
            indent(builder, level);
            builder.append("\"Account\": \"");
            appendBuffer(builder, account, accountOffset, accountLength);
            builder.append("\",\n");
        }

        if (hasAcctIDSource())
        {
            indent(builder, level);
            builder.append("\"AcctIDSource\": \"");
            builder.append(acctIDSource);
            builder.append("\",\n");
        }

        if (hasAccountType())
        {
            indent(builder, level);
            builder.append("\"AccountType\": \"");
            builder.append(accountType);
            builder.append("\",\n");
        }

        if (hasPositionEffect())
        {
            indent(builder, level);
            builder.append("\"PositionEffect\": \"");
            builder.append(positionEffect);
            builder.append("\",\n");
        }

        if (hasPreallocMethod())
        {
            indent(builder, level);
            builder.append("\"PreallocMethod\": \"");
            builder.append(preallocMethod);
            builder.append("\",\n");
        }

        if (hasNoAllocsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"AllocsGroup\": [\n");
            final int noAllocsGroupCounter = this.noAllocsGroupCounter;
            AllocsGroupEncoder allocsGroup = this.allocsGroup;
            for (int i = 0; i < noAllocsGroupCounter; i++)
            {
                indent(builder, level);
                allocsGroup.appendTo(builder, level + 1);
                if (i < (noAllocsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                allocsGroup = allocsGroup.next();
            }
            indent(builder, level);
            builder.append("],\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public TradeCaptureReportAckEncoder copyTo(final Encoder encoder)
    {
        return copyTo((TradeCaptureReportAckEncoder)encoder);
    }

    public TradeCaptureReportAckEncoder copyTo(final TradeCaptureReportAckEncoder encoder)
    {
        encoder.reset();
        if (hasTradeReportID())
        {
            encoder.tradeReportIDAsCopy(tradeReportID.byteArray(), 0, tradeReportIDLength);
        }

        if (hasTradeReportTransType())
        {
            encoder.tradeReportTransType(this.tradeReportTransType());
        }

        if (hasTradeReportType())
        {
            encoder.tradeReportType(this.tradeReportType());
        }

        if (hasTrdType())
        {
            encoder.trdType(this.trdType());
        }

        if (hasTrdSubType())
        {
            encoder.trdSubType(this.trdSubType());
        }

        if (hasSecondaryTrdType())
        {
            encoder.secondaryTrdType(this.secondaryTrdType());
        }

        if (hasTransferReason())
        {
            encoder.transferReasonAsCopy(transferReason.byteArray(), 0, transferReasonLength);
        }

        if (hasExecType())
        {
            encoder.execType(this.execType());
        }

        if (hasTradeReportRefID())
        {
            encoder.tradeReportRefIDAsCopy(tradeReportRefID.byteArray(), 0, tradeReportRefIDLength);
        }

        if (hasSecondaryTradeReportRefID())
        {
            encoder.secondaryTradeReportRefIDAsCopy(secondaryTradeReportRefID.byteArray(), 0, secondaryTradeReportRefIDLength);
        }

        if (hasTrdRptStatus())
        {
            encoder.trdRptStatus(this.trdRptStatus());
        }

        if (hasTradeReportRejectReason())
        {
            encoder.tradeReportRejectReason(this.tradeReportRejectReason());
        }

        if (hasSecondaryTradeReportID())
        {
            encoder.secondaryTradeReportIDAsCopy(secondaryTradeReportID.byteArray(), 0, secondaryTradeReportIDLength);
        }

        if (hasSubscriptionRequestType())
        {
            encoder.subscriptionRequestType(this.subscriptionRequestType());
        }

        if (hasTradeLinkID())
        {
            encoder.tradeLinkIDAsCopy(tradeLinkID.byteArray(), 0, tradeLinkIDLength);
        }

        if (hasTrdMatchID())
        {
            encoder.trdMatchIDAsCopy(trdMatchID.byteArray(), 0, trdMatchIDLength);
        }

        if (hasExecID())
        {
            encoder.execIDAsCopy(execID.byteArray(), 0, execIDLength);
        }

        if (hasSecondaryExecID())
        {
            encoder.secondaryExecIDAsCopy(secondaryExecID.byteArray(), 0, secondaryExecIDLength);
        }


        instrument.copyTo(encoder.instrument());
        if (hasTransactTime())
        {
            encoder.transactTimeAsCopy(transactTime.byteArray(), 0, transactTimeLength);
        }


        trdRegTimestamps.copyTo(encoder.trdRegTimestamps());
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

        if (hasNoLegsGroupCounter)
        {
            final int size = this.noLegsGroupCounter;
            LegsGroupEncoder legsGroup = this.legsGroup;
            LegsGroupEncoder legsGroupEncoder = encoder.legsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (legsGroup != null)
                {
                    legsGroup.copyTo(legsGroupEncoder);
                    legsGroup = legsGroup.next();
                    legsGroupEncoder = legsGroupEncoder.next();
                }
            }
        }

        if (hasClearingFeeIndicator())
        {
            encoder.clearingFeeIndicatorAsCopy(clearingFeeIndicator.byteArray(), 0, clearingFeeIndicatorLength);
        }

        if (hasOrderCapacity())
        {
            encoder.orderCapacity(this.orderCapacity());
        }

        if (hasOrderRestrictions())
        {
            encoder.orderRestrictionsAsCopy(orderRestrictions.byteArray(), 0, orderRestrictionsLength);
        }

        if (hasCustOrderCapacity())
        {
            encoder.custOrderCapacity(this.custOrderCapacity());
        }

        if (hasAccount())
        {
            encoder.accountAsCopy(account.byteArray(), 0, accountLength);
        }

        if (hasAcctIDSource())
        {
            encoder.acctIDSource(this.acctIDSource());
        }

        if (hasAccountType())
        {
            encoder.accountType(this.accountType());
        }

        if (hasPositionEffect())
        {
            encoder.positionEffect(this.positionEffect());
        }

        if (hasPreallocMethod())
        {
            encoder.preallocMethod(this.preallocMethod());
        }

        if (hasNoAllocsGroupCounter)
        {
            final int size = this.noAllocsGroupCounter;
            AllocsGroupEncoder allocsGroup = this.allocsGroup;
            AllocsGroupEncoder allocsGroupEncoder = encoder.allocsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (allocsGroup != null)
                {
                    allocsGroup.copyTo(allocsGroupEncoder);
                    allocsGroup = allocsGroup.next();
                    allocsGroupEncoder = allocsGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
