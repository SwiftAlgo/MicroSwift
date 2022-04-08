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

    private static final int tradeIDHeaderLength = 5;
    private static final byte[] tradeIDHeader = new byte[] {49, 48, 48, 51, (byte) '='};

    private static final int secondaryTradeIDHeaderLength = 5;
    private static final byte[] secondaryTradeIDHeader = new byte[] {49, 48, 52, 48, (byte) '='};

    private static final int firmTradeIDHeaderLength = 5;
    private static final byte[] firmTradeIDHeader = new byte[] {49, 48, 52, 49, (byte) '='};

    private static final int secondaryFirmTradeIDHeaderLength = 5;
    private static final byte[] secondaryFirmTradeIDHeader = new byte[] {49, 48, 52, 50, (byte) '='};

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

    private static final int tradeHandlingInstrHeaderLength = 5;
    private static final byte[] tradeHandlingInstrHeader = new byte[] {49, 49, 50, 51, (byte) '='};

    private static final int origTradeHandlingInstrHeaderLength = 5;
    private static final byte[] origTradeHandlingInstrHeader = new byte[] {49, 49, 50, 52, (byte) '='};

    private static final int origTradeDateHeaderLength = 5;
    private static final byte[] origTradeDateHeader = new byte[] {49, 49, 50, 53, (byte) '='};

    private static final int origTradeIDHeaderLength = 5;
    private static final byte[] origTradeIDHeader = new byte[] {49, 49, 50, 54, (byte) '='};

    private static final int origSecondaryTradeIDHeaderLength = 5;
    private static final byte[] origSecondaryTradeIDHeader = new byte[] {49, 49, 50, 55, (byte) '='};

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

    private static final int execRestatementReasonHeaderLength = 4;
    private static final byte[] execRestatementReasonHeader = new byte[] {51, 55, 56, (byte) '='};

    private static final int previouslyReportedHeaderLength = 4;
    private static final byte[] previouslyReportedHeader = new byte[] {53, 55, 48, (byte) '='};

    private static final int priceTypeHeaderLength = 4;
    private static final byte[] priceTypeHeader = new byte[] {52, 50, 51, (byte) '='};

    private static final int underlyingTradingSessionIDHeaderLength = 4;
    private static final byte[] underlyingTradingSessionIDHeader = new byte[] {56, 50, 50, (byte) '='};

    private static final int underlyingTradingSessionSubIDHeaderLength = 4;
    private static final byte[] underlyingTradingSessionSubIDHeader = new byte[] {56, 50, 51, (byte) '='};

    private static final int settlSessIDHeaderLength = 4;
    private static final byte[] settlSessIDHeader = new byte[] {55, 49, 54, (byte) '='};

    private static final int settlSessSubIDHeaderLength = 4;
    private static final byte[] settlSessSubIDHeader = new byte[] {55, 49, 55, (byte) '='};

    private static final int qtyTypeHeaderLength = 4;
    private static final byte[] qtyTypeHeader = new byte[] {56, 53, 52, (byte) '='};

    private static final int lastQtyHeaderLength = 3;
    private static final byte[] lastQtyHeader = new byte[] {51, 50, (byte) '='};

    private static final int lastPxHeaderLength = 3;
    private static final byte[] lastPxHeader = new byte[] {51, 49, (byte) '='};

    private static final int venueTypeHeaderLength = 5;
    private static final byte[] venueTypeHeader = new byte[] {49, 52, 51, 48, (byte) '='};

    private static final int marketSegmentIDHeaderLength = 5;
    private static final byte[] marketSegmentIDHeader = new byte[] {49, 51, 48, 48, (byte) '='};

    private static final int marketIDHeaderLength = 5;
    private static final byte[] marketIDHeader = new byte[] {49, 51, 48, 49, (byte) '='};

    private static final int lastParPxHeaderLength = 4;
    private static final byte[] lastParPxHeader = new byte[] {54, 54, 57, (byte) '='};

    private static final int calculatedCcyLastQtyHeaderLength = 5;
    private static final byte[] calculatedCcyLastQtyHeader = new byte[] {49, 48, 53, 54, (byte) '='};

    private static final int lastSwapPointsHeaderLength = 5;
    private static final byte[] lastSwapPointsHeader = new byte[] {49, 48, 55, 49, (byte) '='};

    private static final int currencyHeaderLength = 3;
    private static final byte[] currencyHeader = new byte[] {49, 53, (byte) '='};

    private static final int settlCurrencyHeaderLength = 4;
    private static final byte[] settlCurrencyHeader = new byte[] {49, 50, 48, (byte) '='};

    private static final int lastSpotRateHeaderLength = 4;
    private static final byte[] lastSpotRateHeader = new byte[] {49, 57, 52, (byte) '='};

    private static final int lastForwardPointsHeaderLength = 4;
    private static final byte[] lastForwardPointsHeader = new byte[] {49, 57, 53, (byte) '='};

    private static final int lastMktHeaderLength = 3;
    private static final byte[] lastMktHeader = new byte[] {51, 48, (byte) '='};

    private static final int tradeDateHeaderLength = 3;
    private static final byte[] tradeDateHeader = new byte[] {55, 53, (byte) '='};

    private static final int clearingBusinessDateHeaderLength = 4;
    private static final byte[] clearingBusinessDateHeader = new byte[] {55, 49, 53, (byte) '='};

    private static final int avgPxHeaderLength = 2;
    private static final byte[] avgPxHeader = new byte[] {54, (byte) '='};

    private static final int avgPxIndicatorHeaderLength = 4;
    private static final byte[] avgPxIndicatorHeader = new byte[] {56, 49, 57, (byte) '='};

    private static final int multiLegReportingTypeHeaderLength = 4;
    private static final byte[] multiLegReportingTypeHeader = new byte[] {52, 52, 50, (byte) '='};

    private static final int tradeLegRefIDHeaderLength = 4;
    private static final byte[] tradeLegRefIDHeader = new byte[] {56, 50, 52, (byte) '='};

    private static final int transactTimeHeaderLength = 3;
    private static final byte[] transactTimeHeader = new byte[] {54, 48, (byte) '='};

    private static final int settlTypeHeaderLength = 3;
    private static final byte[] settlTypeHeader = new byte[] {54, 51, (byte) '='};

    private static final int matchStatusHeaderLength = 4;
    private static final byte[] matchStatusHeader = new byte[] {53, 55, 51, (byte) '='};

    private static final int matchTypeHeaderLength = 4;
    private static final byte[] matchTypeHeader = new byte[] {53, 55, 52, (byte) '='};

    private static final int copyMsgIndicatorHeaderLength = 4;
    private static final byte[] copyMsgIndicatorHeader = new byte[] {55, 57, 55, (byte) '='};

    private static final int publishTrdIndicatorHeaderLength = 4;
    private static final byte[] publishTrdIndicatorHeader = new byte[] {56, 53, 50, (byte) '='};

    private static final int tradePublishIndicatorHeaderLength = 5;
    private static final byte[] tradePublishIndicatorHeader = new byte[] {49, 51, 57, 48, (byte) '='};

    private static final int shortSaleReasonHeaderLength = 4;
    private static final byte[] shortSaleReasonHeader = new byte[] {56, 53, 51, (byte) '='};

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

    private static final int asOfIndicatorHeaderLength = 5;
    private static final byte[] asOfIndicatorHeader = new byte[] {49, 48, 49, 53, (byte) '='};

    private static final int clearingFeeIndicatorHeaderLength = 4;
    private static final byte[] clearingFeeIndicatorHeader = new byte[] {54, 51, 53, (byte) '='};

    private static final int tierCodeHeaderLength = 4;
    private static final byte[] tierCodeHeader = new byte[] {57, 57, 52, (byte) '='};

    private static final int messageEventSourceHeaderLength = 5;
    private static final byte[] messageEventSourceHeader = new byte[] {49, 48, 49, 49, (byte) '='};

    private static final int lastUpdateTimeHeaderLength = 4;
    private static final byte[] lastUpdateTimeHeader = new byte[] {55, 55, 57, (byte) '='};

    private static final int rndPxHeaderLength = 4;
    private static final byte[] rndPxHeader = new byte[] {57, 57, 49, (byte) '='};

    private static final int rptSysHeaderLength = 5;
    private static final byte[] rptSysHeader = new byte[] {49, 49, 51, 53, (byte) '='};

    private static final int grossTradeAmtHeaderLength = 4;
    private static final byte[] grossTradeAmtHeader = new byte[] {51, 56, 49, (byte) '='};

    private static final int settlDateHeaderLength = 3;
    private static final byte[] settlDateHeader = new byte[] {54, 52, (byte) '='};

    private static final int feeMultiplierHeaderLength = 5;
    private static final byte[] feeMultiplierHeader = new byte[] {49, 51, 50, 57, (byte) '='};

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

    private final MutableDirectBuffer tradeID = new UnsafeBuffer();

    private int tradeIDOffset = 0;

    private int tradeIDLength = 0;

    public TradeCaptureReportAckEncoder tradeID(final DirectBuffer value, final int offset, final int length)
    {
        tradeID.wrap(value);
        tradeIDOffset = offset;
        tradeIDLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder tradeID(final DirectBuffer value, final int length)
    {
        return tradeID(value, 0, length);
    }

    public TradeCaptureReportAckEncoder tradeID(final DirectBuffer value)
    {
        return tradeID(value, 0, value.capacity());
    }

    public TradeCaptureReportAckEncoder tradeID(final byte[] value, final int offset, final int length)
    {
        tradeID.wrap(value);
        tradeIDOffset = offset;
        tradeIDLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder tradeIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradeID, value, offset, length);
        tradeIDOffset = offset;
        tradeIDLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder tradeID(final byte[] value, final int length)
    {
        return tradeID(value, 0, length);
    }

    public TradeCaptureReportAckEncoder tradeID(final byte[] value)
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

    public TradeCaptureReportAckEncoder tradeID(final CharSequence value)
    {
        toBytes(value, tradeID);
        tradeIDOffset = 0;
        tradeIDLength = value.length();
        return this;
    }

    public TradeCaptureReportAckEncoder tradeID(final AsciiSequenceView value)
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

    public TradeCaptureReportAckEncoder tradeID(final char[] value)
    {
        return tradeID(value, 0, value.length);
    }

    public TradeCaptureReportAckEncoder tradeID(final char[] value, final int length)
    {
        return tradeID(value, 0, length);
    }

    public TradeCaptureReportAckEncoder tradeID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradeID, offset, length);
        tradeIDOffset = 0;
        tradeIDLength = length;
        return this;
    }

    private final MutableDirectBuffer secondaryTradeID = new UnsafeBuffer();

    private int secondaryTradeIDOffset = 0;

    private int secondaryTradeIDLength = 0;

    public TradeCaptureReportAckEncoder secondaryTradeID(final DirectBuffer value, final int offset, final int length)
    {
        secondaryTradeID.wrap(value);
        secondaryTradeIDOffset = offset;
        secondaryTradeIDLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder secondaryTradeID(final DirectBuffer value, final int length)
    {
        return secondaryTradeID(value, 0, length);
    }

    public TradeCaptureReportAckEncoder secondaryTradeID(final DirectBuffer value)
    {
        return secondaryTradeID(value, 0, value.capacity());
    }

    public TradeCaptureReportAckEncoder secondaryTradeID(final byte[] value, final int offset, final int length)
    {
        secondaryTradeID.wrap(value);
        secondaryTradeIDOffset = offset;
        secondaryTradeIDLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder secondaryTradeIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(secondaryTradeID, value, offset, length);
        secondaryTradeIDOffset = offset;
        secondaryTradeIDLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder secondaryTradeID(final byte[] value, final int length)
    {
        return secondaryTradeID(value, 0, length);
    }

    public TradeCaptureReportAckEncoder secondaryTradeID(final byte[] value)
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

    public TradeCaptureReportAckEncoder secondaryTradeID(final CharSequence value)
    {
        toBytes(value, secondaryTradeID);
        secondaryTradeIDOffset = 0;
        secondaryTradeIDLength = value.length();
        return this;
    }

    public TradeCaptureReportAckEncoder secondaryTradeID(final AsciiSequenceView value)
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

    public TradeCaptureReportAckEncoder secondaryTradeID(final char[] value)
    {
        return secondaryTradeID(value, 0, value.length);
    }

    public TradeCaptureReportAckEncoder secondaryTradeID(final char[] value, final int length)
    {
        return secondaryTradeID(value, 0, length);
    }

    public TradeCaptureReportAckEncoder secondaryTradeID(final char[] value, final int offset, final int length)
    {
        toBytes(value, secondaryTradeID, offset, length);
        secondaryTradeIDOffset = 0;
        secondaryTradeIDLength = length;
        return this;
    }

    private final MutableDirectBuffer firmTradeID = new UnsafeBuffer();

    private int firmTradeIDOffset = 0;

    private int firmTradeIDLength = 0;

    public TradeCaptureReportAckEncoder firmTradeID(final DirectBuffer value, final int offset, final int length)
    {
        firmTradeID.wrap(value);
        firmTradeIDOffset = offset;
        firmTradeIDLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder firmTradeID(final DirectBuffer value, final int length)
    {
        return firmTradeID(value, 0, length);
    }

    public TradeCaptureReportAckEncoder firmTradeID(final DirectBuffer value)
    {
        return firmTradeID(value, 0, value.capacity());
    }

    public TradeCaptureReportAckEncoder firmTradeID(final byte[] value, final int offset, final int length)
    {
        firmTradeID.wrap(value);
        firmTradeIDOffset = offset;
        firmTradeIDLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder firmTradeIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(firmTradeID, value, offset, length);
        firmTradeIDOffset = offset;
        firmTradeIDLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder firmTradeID(final byte[] value, final int length)
    {
        return firmTradeID(value, 0, length);
    }

    public TradeCaptureReportAckEncoder firmTradeID(final byte[] value)
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

    public TradeCaptureReportAckEncoder firmTradeID(final CharSequence value)
    {
        toBytes(value, firmTradeID);
        firmTradeIDOffset = 0;
        firmTradeIDLength = value.length();
        return this;
    }

    public TradeCaptureReportAckEncoder firmTradeID(final AsciiSequenceView value)
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

    public TradeCaptureReportAckEncoder firmTradeID(final char[] value)
    {
        return firmTradeID(value, 0, value.length);
    }

    public TradeCaptureReportAckEncoder firmTradeID(final char[] value, final int length)
    {
        return firmTradeID(value, 0, length);
    }

    public TradeCaptureReportAckEncoder firmTradeID(final char[] value, final int offset, final int length)
    {
        toBytes(value, firmTradeID, offset, length);
        firmTradeIDOffset = 0;
        firmTradeIDLength = length;
        return this;
    }

    private final MutableDirectBuffer secondaryFirmTradeID = new UnsafeBuffer();

    private int secondaryFirmTradeIDOffset = 0;

    private int secondaryFirmTradeIDLength = 0;

    public TradeCaptureReportAckEncoder secondaryFirmTradeID(final DirectBuffer value, final int offset, final int length)
    {
        secondaryFirmTradeID.wrap(value);
        secondaryFirmTradeIDOffset = offset;
        secondaryFirmTradeIDLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder secondaryFirmTradeID(final DirectBuffer value, final int length)
    {
        return secondaryFirmTradeID(value, 0, length);
    }

    public TradeCaptureReportAckEncoder secondaryFirmTradeID(final DirectBuffer value)
    {
        return secondaryFirmTradeID(value, 0, value.capacity());
    }

    public TradeCaptureReportAckEncoder secondaryFirmTradeID(final byte[] value, final int offset, final int length)
    {
        secondaryFirmTradeID.wrap(value);
        secondaryFirmTradeIDOffset = offset;
        secondaryFirmTradeIDLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder secondaryFirmTradeIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(secondaryFirmTradeID, value, offset, length);
        secondaryFirmTradeIDOffset = offset;
        secondaryFirmTradeIDLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder secondaryFirmTradeID(final byte[] value, final int length)
    {
        return secondaryFirmTradeID(value, 0, length);
    }

    public TradeCaptureReportAckEncoder secondaryFirmTradeID(final byte[] value)
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

    public TradeCaptureReportAckEncoder secondaryFirmTradeID(final CharSequence value)
    {
        toBytes(value, secondaryFirmTradeID);
        secondaryFirmTradeIDOffset = 0;
        secondaryFirmTradeIDLength = value.length();
        return this;
    }

    public TradeCaptureReportAckEncoder secondaryFirmTradeID(final AsciiSequenceView value)
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

    public TradeCaptureReportAckEncoder secondaryFirmTradeID(final char[] value)
    {
        return secondaryFirmTradeID(value, 0, value.length);
    }

    public TradeCaptureReportAckEncoder secondaryFirmTradeID(final char[] value, final int length)
    {
        return secondaryFirmTradeID(value, 0, length);
    }

    public TradeCaptureReportAckEncoder secondaryFirmTradeID(final char[] value, final int offset, final int length)
    {
        toBytes(value, secondaryFirmTradeID, offset, length);
        secondaryFirmTradeIDOffset = 0;
        secondaryFirmTradeIDLength = length;
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

    public TradeCaptureReportAckEncoder trdSubType(TrdSubType value)
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

    private char tradeHandlingInstr;

    private boolean hasTradeHandlingInstr;

    public boolean hasTradeHandlingInstr()
    {
        return hasTradeHandlingInstr;
    }

    public TradeCaptureReportAckEncoder tradeHandlingInstr(char value)
    {
        tradeHandlingInstr = value;
        hasTradeHandlingInstr = true;
        return this;
    }

    public char tradeHandlingInstr()
    {
        return tradeHandlingInstr;
    }

    public TradeCaptureReportAckEncoder tradeHandlingInstr(TradeHandlingInstr value)
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

    private char origTradeHandlingInstr;

    private boolean hasOrigTradeHandlingInstr;

    public boolean hasOrigTradeHandlingInstr()
    {
        return hasOrigTradeHandlingInstr;
    }

    public TradeCaptureReportAckEncoder origTradeHandlingInstr(char value)
    {
        origTradeHandlingInstr = value;
        hasOrigTradeHandlingInstr = true;
        return this;
    }

    public char origTradeHandlingInstr()
    {
        return origTradeHandlingInstr;
    }

    private final MutableDirectBuffer origTradeDate = new UnsafeBuffer();

    private int origTradeDateOffset = 0;

    private int origTradeDateLength = 0;

    public TradeCaptureReportAckEncoder origTradeDate(final DirectBuffer value, final int offset, final int length)
    {
        origTradeDate.wrap(value);
        origTradeDateOffset = offset;
        origTradeDateLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder origTradeDate(final DirectBuffer value, final int length)
    {
        return origTradeDate(value, 0, length);
    }

    public TradeCaptureReportAckEncoder origTradeDate(final DirectBuffer value)
    {
        return origTradeDate(value, 0, value.capacity());
    }

    public TradeCaptureReportAckEncoder origTradeDate(final byte[] value, final int offset, final int length)
    {
        origTradeDate.wrap(value);
        origTradeDateOffset = offset;
        origTradeDateLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder origTradeDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(origTradeDate, value, offset, length);
        origTradeDateOffset = offset;
        origTradeDateLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder origTradeDate(final byte[] value, final int length)
    {
        return origTradeDate(value, 0, length);
    }

    public TradeCaptureReportAckEncoder origTradeDate(final byte[] value)
    {
        return origTradeDate(value, 0, value.length);
    }

    public boolean hasOrigTradeDate()
    {
        return origTradeDateLength > 0;
    }

    public MutableDirectBuffer origTradeDate()
    {
        return origTradeDate;
    }

    public String origTradeDateAsString()
    {
        return origTradeDate.getStringWithoutLengthAscii(origTradeDateOffset, origTradeDateLength);
    }

    private final MutableDirectBuffer origTradeID = new UnsafeBuffer();

    private int origTradeIDOffset = 0;

    private int origTradeIDLength = 0;

    public TradeCaptureReportAckEncoder origTradeID(final DirectBuffer value, final int offset, final int length)
    {
        origTradeID.wrap(value);
        origTradeIDOffset = offset;
        origTradeIDLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder origTradeID(final DirectBuffer value, final int length)
    {
        return origTradeID(value, 0, length);
    }

    public TradeCaptureReportAckEncoder origTradeID(final DirectBuffer value)
    {
        return origTradeID(value, 0, value.capacity());
    }

    public TradeCaptureReportAckEncoder origTradeID(final byte[] value, final int offset, final int length)
    {
        origTradeID.wrap(value);
        origTradeIDOffset = offset;
        origTradeIDLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder origTradeIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(origTradeID, value, offset, length);
        origTradeIDOffset = offset;
        origTradeIDLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder origTradeID(final byte[] value, final int length)
    {
        return origTradeID(value, 0, length);
    }

    public TradeCaptureReportAckEncoder origTradeID(final byte[] value)
    {
        return origTradeID(value, 0, value.length);
    }

    public boolean hasOrigTradeID()
    {
        return origTradeIDLength > 0;
    }

    public MutableDirectBuffer origTradeID()
    {
        return origTradeID;
    }

    public String origTradeIDAsString()
    {
        return origTradeID.getStringWithoutLengthAscii(origTradeIDOffset, origTradeIDLength);
    }

    public TradeCaptureReportAckEncoder origTradeID(final CharSequence value)
    {
        toBytes(value, origTradeID);
        origTradeIDOffset = 0;
        origTradeIDLength = value.length();
        return this;
    }

    public TradeCaptureReportAckEncoder origTradeID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            origTradeID.wrap(buffer);
            origTradeIDOffset = value.offset();
            origTradeIDLength = value.length();
        }
        return this;
    }

    public TradeCaptureReportAckEncoder origTradeID(final char[] value)
    {
        return origTradeID(value, 0, value.length);
    }

    public TradeCaptureReportAckEncoder origTradeID(final char[] value, final int length)
    {
        return origTradeID(value, 0, length);
    }

    public TradeCaptureReportAckEncoder origTradeID(final char[] value, final int offset, final int length)
    {
        toBytes(value, origTradeID, offset, length);
        origTradeIDOffset = 0;
        origTradeIDLength = length;
        return this;
    }

    private final MutableDirectBuffer origSecondaryTradeID = new UnsafeBuffer();

    private int origSecondaryTradeIDOffset = 0;

    private int origSecondaryTradeIDLength = 0;

    public TradeCaptureReportAckEncoder origSecondaryTradeID(final DirectBuffer value, final int offset, final int length)
    {
        origSecondaryTradeID.wrap(value);
        origSecondaryTradeIDOffset = offset;
        origSecondaryTradeIDLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder origSecondaryTradeID(final DirectBuffer value, final int length)
    {
        return origSecondaryTradeID(value, 0, length);
    }

    public TradeCaptureReportAckEncoder origSecondaryTradeID(final DirectBuffer value)
    {
        return origSecondaryTradeID(value, 0, value.capacity());
    }

    public TradeCaptureReportAckEncoder origSecondaryTradeID(final byte[] value, final int offset, final int length)
    {
        origSecondaryTradeID.wrap(value);
        origSecondaryTradeIDOffset = offset;
        origSecondaryTradeIDLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder origSecondaryTradeIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(origSecondaryTradeID, value, offset, length);
        origSecondaryTradeIDOffset = offset;
        origSecondaryTradeIDLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder origSecondaryTradeID(final byte[] value, final int length)
    {
        return origSecondaryTradeID(value, 0, length);
    }

    public TradeCaptureReportAckEncoder origSecondaryTradeID(final byte[] value)
    {
        return origSecondaryTradeID(value, 0, value.length);
    }

    public boolean hasOrigSecondaryTradeID()
    {
        return origSecondaryTradeIDLength > 0;
    }

    public MutableDirectBuffer origSecondaryTradeID()
    {
        return origSecondaryTradeID;
    }

    public String origSecondaryTradeIDAsString()
    {
        return origSecondaryTradeID.getStringWithoutLengthAscii(origSecondaryTradeIDOffset, origSecondaryTradeIDLength);
    }

    public TradeCaptureReportAckEncoder origSecondaryTradeID(final CharSequence value)
    {
        toBytes(value, origSecondaryTradeID);
        origSecondaryTradeIDOffset = 0;
        origSecondaryTradeIDLength = value.length();
        return this;
    }

    public TradeCaptureReportAckEncoder origSecondaryTradeID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            origSecondaryTradeID.wrap(buffer);
            origSecondaryTradeIDOffset = value.offset();
            origSecondaryTradeIDLength = value.length();
        }
        return this;
    }

    public TradeCaptureReportAckEncoder origSecondaryTradeID(final char[] value)
    {
        return origSecondaryTradeID(value, 0, value.length);
    }

    public TradeCaptureReportAckEncoder origSecondaryTradeID(final char[] value, final int length)
    {
        return origSecondaryTradeID(value, 0, length);
    }

    public TradeCaptureReportAckEncoder origSecondaryTradeID(final char[] value, final int offset, final int length)
    {
        toBytes(value, origSecondaryTradeID, offset, length);
        origSecondaryTradeIDOffset = 0;
        origSecondaryTradeIDLength = length;
        return this;
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

    private final RootPartiesEncoder rootParties = new RootPartiesEncoder();
    public RootPartiesEncoder rootParties()
    {
        return rootParties;
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

    private int execRestatementReason;

    private boolean hasExecRestatementReason;

    public boolean hasExecRestatementReason()
    {
        return hasExecRestatementReason;
    }

    public TradeCaptureReportAckEncoder execRestatementReason(int value)
    {
        execRestatementReason = value;
        hasExecRestatementReason = true;
        return this;
    }

    public int execRestatementReason()
    {
        return execRestatementReason;
    }

    public TradeCaptureReportAckEncoder execRestatementReason(ExecRestatementReason value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == ExecRestatementReason.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: execRestatementReason Value: " + value );
            }
            if (value == ExecRestatementReason.NULL_VAL)
            {
                return this;
            }
        }
        return execRestatementReason(value.representation());
    }

    private boolean previouslyReported;

    private boolean hasPreviouslyReported;

    public boolean hasPreviouslyReported()
    {
        return hasPreviouslyReported;
    }

    public TradeCaptureReportAckEncoder previouslyReported(boolean value)
    {
        previouslyReported = value;
        hasPreviouslyReported = true;
        return this;
    }

    public boolean previouslyReported()
    {
        return previouslyReported;
    }

    private int priceType;

    private boolean hasPriceType;

    public boolean hasPriceType()
    {
        return hasPriceType;
    }

    public TradeCaptureReportAckEncoder priceType(int value)
    {
        priceType = value;
        hasPriceType = true;
        return this;
    }

    public int priceType()
    {
        return priceType;
    }

    public TradeCaptureReportAckEncoder priceType(PriceType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == PriceType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: priceType Value: " + value );
            }
            if (value == PriceType.NULL_VAL)
            {
                return this;
            }
        }
        return priceType(value.representation());
    }

    private final MutableDirectBuffer underlyingTradingSessionID = new UnsafeBuffer();

    private int underlyingTradingSessionIDOffset = 0;

    private int underlyingTradingSessionIDLength = 0;

    public TradeCaptureReportAckEncoder underlyingTradingSessionID(final DirectBuffer value, final int offset, final int length)
    {
        underlyingTradingSessionID.wrap(value);
        underlyingTradingSessionIDOffset = offset;
        underlyingTradingSessionIDLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder underlyingTradingSessionID(final DirectBuffer value, final int length)
    {
        return underlyingTradingSessionID(value, 0, length);
    }

    public TradeCaptureReportAckEncoder underlyingTradingSessionID(final DirectBuffer value)
    {
        return underlyingTradingSessionID(value, 0, value.capacity());
    }

    public TradeCaptureReportAckEncoder underlyingTradingSessionID(final byte[] value, final int offset, final int length)
    {
        underlyingTradingSessionID.wrap(value);
        underlyingTradingSessionIDOffset = offset;
        underlyingTradingSessionIDLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder underlyingTradingSessionIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(underlyingTradingSessionID, value, offset, length);
        underlyingTradingSessionIDOffset = offset;
        underlyingTradingSessionIDLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder underlyingTradingSessionID(final byte[] value, final int length)
    {
        return underlyingTradingSessionID(value, 0, length);
    }

    public TradeCaptureReportAckEncoder underlyingTradingSessionID(final byte[] value)
    {
        return underlyingTradingSessionID(value, 0, value.length);
    }

    public boolean hasUnderlyingTradingSessionID()
    {
        return underlyingTradingSessionIDLength > 0;
    }

    public MutableDirectBuffer underlyingTradingSessionID()
    {
        return underlyingTradingSessionID;
    }

    public String underlyingTradingSessionIDAsString()
    {
        return underlyingTradingSessionID.getStringWithoutLengthAscii(underlyingTradingSessionIDOffset, underlyingTradingSessionIDLength);
    }

    public TradeCaptureReportAckEncoder underlyingTradingSessionID(final CharSequence value)
    {
        toBytes(value, underlyingTradingSessionID);
        underlyingTradingSessionIDOffset = 0;
        underlyingTradingSessionIDLength = value.length();
        return this;
    }

    public TradeCaptureReportAckEncoder underlyingTradingSessionID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            underlyingTradingSessionID.wrap(buffer);
            underlyingTradingSessionIDOffset = value.offset();
            underlyingTradingSessionIDLength = value.length();
        }
        return this;
    }

    public TradeCaptureReportAckEncoder underlyingTradingSessionID(final char[] value)
    {
        return underlyingTradingSessionID(value, 0, value.length);
    }

    public TradeCaptureReportAckEncoder underlyingTradingSessionID(final char[] value, final int length)
    {
        return underlyingTradingSessionID(value, 0, length);
    }

    public TradeCaptureReportAckEncoder underlyingTradingSessionID(final char[] value, final int offset, final int length)
    {
        toBytes(value, underlyingTradingSessionID, offset, length);
        underlyingTradingSessionIDOffset = 0;
        underlyingTradingSessionIDLength = length;
        return this;
    }

    private final MutableDirectBuffer underlyingTradingSessionSubID = new UnsafeBuffer();

    private int underlyingTradingSessionSubIDOffset = 0;

    private int underlyingTradingSessionSubIDLength = 0;

    public TradeCaptureReportAckEncoder underlyingTradingSessionSubID(final DirectBuffer value, final int offset, final int length)
    {
        underlyingTradingSessionSubID.wrap(value);
        underlyingTradingSessionSubIDOffset = offset;
        underlyingTradingSessionSubIDLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder underlyingTradingSessionSubID(final DirectBuffer value, final int length)
    {
        return underlyingTradingSessionSubID(value, 0, length);
    }

    public TradeCaptureReportAckEncoder underlyingTradingSessionSubID(final DirectBuffer value)
    {
        return underlyingTradingSessionSubID(value, 0, value.capacity());
    }

    public TradeCaptureReportAckEncoder underlyingTradingSessionSubID(final byte[] value, final int offset, final int length)
    {
        underlyingTradingSessionSubID.wrap(value);
        underlyingTradingSessionSubIDOffset = offset;
        underlyingTradingSessionSubIDLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder underlyingTradingSessionSubIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(underlyingTradingSessionSubID, value, offset, length);
        underlyingTradingSessionSubIDOffset = offset;
        underlyingTradingSessionSubIDLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder underlyingTradingSessionSubID(final byte[] value, final int length)
    {
        return underlyingTradingSessionSubID(value, 0, length);
    }

    public TradeCaptureReportAckEncoder underlyingTradingSessionSubID(final byte[] value)
    {
        return underlyingTradingSessionSubID(value, 0, value.length);
    }

    public boolean hasUnderlyingTradingSessionSubID()
    {
        return underlyingTradingSessionSubIDLength > 0;
    }

    public MutableDirectBuffer underlyingTradingSessionSubID()
    {
        return underlyingTradingSessionSubID;
    }

    public String underlyingTradingSessionSubIDAsString()
    {
        return underlyingTradingSessionSubID.getStringWithoutLengthAscii(underlyingTradingSessionSubIDOffset, underlyingTradingSessionSubIDLength);
    }

    public TradeCaptureReportAckEncoder underlyingTradingSessionSubID(final CharSequence value)
    {
        toBytes(value, underlyingTradingSessionSubID);
        underlyingTradingSessionSubIDOffset = 0;
        underlyingTradingSessionSubIDLength = value.length();
        return this;
    }

    public TradeCaptureReportAckEncoder underlyingTradingSessionSubID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            underlyingTradingSessionSubID.wrap(buffer);
            underlyingTradingSessionSubIDOffset = value.offset();
            underlyingTradingSessionSubIDLength = value.length();
        }
        return this;
    }

    public TradeCaptureReportAckEncoder underlyingTradingSessionSubID(final char[] value)
    {
        return underlyingTradingSessionSubID(value, 0, value.length);
    }

    public TradeCaptureReportAckEncoder underlyingTradingSessionSubID(final char[] value, final int length)
    {
        return underlyingTradingSessionSubID(value, 0, length);
    }

    public TradeCaptureReportAckEncoder underlyingTradingSessionSubID(final char[] value, final int offset, final int length)
    {
        toBytes(value, underlyingTradingSessionSubID, offset, length);
        underlyingTradingSessionSubIDOffset = 0;
        underlyingTradingSessionSubIDLength = length;
        return this;
    }

    private final MutableDirectBuffer settlSessID = new UnsafeBuffer();

    private int settlSessIDOffset = 0;

    private int settlSessIDLength = 0;

    public TradeCaptureReportAckEncoder settlSessID(final DirectBuffer value, final int offset, final int length)
    {
        settlSessID.wrap(value);
        settlSessIDOffset = offset;
        settlSessIDLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder settlSessID(final DirectBuffer value, final int length)
    {
        return settlSessID(value, 0, length);
    }

    public TradeCaptureReportAckEncoder settlSessID(final DirectBuffer value)
    {
        return settlSessID(value, 0, value.capacity());
    }

    public TradeCaptureReportAckEncoder settlSessID(final byte[] value, final int offset, final int length)
    {
        settlSessID.wrap(value);
        settlSessIDOffset = offset;
        settlSessIDLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder settlSessIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlSessID, value, offset, length);
        settlSessIDOffset = offset;
        settlSessIDLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder settlSessID(final byte[] value, final int length)
    {
        return settlSessID(value, 0, length);
    }

    public TradeCaptureReportAckEncoder settlSessID(final byte[] value)
    {
        return settlSessID(value, 0, value.length);
    }

    public boolean hasSettlSessID()
    {
        return settlSessIDLength > 0;
    }

    public MutableDirectBuffer settlSessID()
    {
        return settlSessID;
    }

    public String settlSessIDAsString()
    {
        return settlSessID.getStringWithoutLengthAscii(settlSessIDOffset, settlSessIDLength);
    }

    public TradeCaptureReportAckEncoder settlSessID(final CharSequence value)
    {
        toBytes(value, settlSessID);
        settlSessIDOffset = 0;
        settlSessIDLength = value.length();
        return this;
    }

    public TradeCaptureReportAckEncoder settlSessID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            settlSessID.wrap(buffer);
            settlSessIDOffset = value.offset();
            settlSessIDLength = value.length();
        }
        return this;
    }

    public TradeCaptureReportAckEncoder settlSessID(final char[] value)
    {
        return settlSessID(value, 0, value.length);
    }

    public TradeCaptureReportAckEncoder settlSessID(final char[] value, final int length)
    {
        return settlSessID(value, 0, length);
    }

    public TradeCaptureReportAckEncoder settlSessID(final char[] value, final int offset, final int length)
    {
        toBytes(value, settlSessID, offset, length);
        settlSessIDOffset = 0;
        settlSessIDLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder settlSessID(SettlSessID value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == SettlSessID.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: settlSessID Value: " + value );
            }
            if (value == SettlSessID.NULL_VAL)
            {
                return this;
            }
        }
        return settlSessID(value.representation());
    }

    private final MutableDirectBuffer settlSessSubID = new UnsafeBuffer();

    private int settlSessSubIDOffset = 0;

    private int settlSessSubIDLength = 0;

    public TradeCaptureReportAckEncoder settlSessSubID(final DirectBuffer value, final int offset, final int length)
    {
        settlSessSubID.wrap(value);
        settlSessSubIDOffset = offset;
        settlSessSubIDLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder settlSessSubID(final DirectBuffer value, final int length)
    {
        return settlSessSubID(value, 0, length);
    }

    public TradeCaptureReportAckEncoder settlSessSubID(final DirectBuffer value)
    {
        return settlSessSubID(value, 0, value.capacity());
    }

    public TradeCaptureReportAckEncoder settlSessSubID(final byte[] value, final int offset, final int length)
    {
        settlSessSubID.wrap(value);
        settlSessSubIDOffset = offset;
        settlSessSubIDLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder settlSessSubIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlSessSubID, value, offset, length);
        settlSessSubIDOffset = offset;
        settlSessSubIDLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder settlSessSubID(final byte[] value, final int length)
    {
        return settlSessSubID(value, 0, length);
    }

    public TradeCaptureReportAckEncoder settlSessSubID(final byte[] value)
    {
        return settlSessSubID(value, 0, value.length);
    }

    public boolean hasSettlSessSubID()
    {
        return settlSessSubIDLength > 0;
    }

    public MutableDirectBuffer settlSessSubID()
    {
        return settlSessSubID;
    }

    public String settlSessSubIDAsString()
    {
        return settlSessSubID.getStringWithoutLengthAscii(settlSessSubIDOffset, settlSessSubIDLength);
    }

    public TradeCaptureReportAckEncoder settlSessSubID(final CharSequence value)
    {
        toBytes(value, settlSessSubID);
        settlSessSubIDOffset = 0;
        settlSessSubIDLength = value.length();
        return this;
    }

    public TradeCaptureReportAckEncoder settlSessSubID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            settlSessSubID.wrap(buffer);
            settlSessSubIDOffset = value.offset();
            settlSessSubIDLength = value.length();
        }
        return this;
    }

    public TradeCaptureReportAckEncoder settlSessSubID(final char[] value)
    {
        return settlSessSubID(value, 0, value.length);
    }

    public TradeCaptureReportAckEncoder settlSessSubID(final char[] value, final int length)
    {
        return settlSessSubID(value, 0, length);
    }

    public TradeCaptureReportAckEncoder settlSessSubID(final char[] value, final int offset, final int length)
    {
        toBytes(value, settlSessSubID, offset, length);
        settlSessSubIDOffset = 0;
        settlSessSubIDLength = length;
        return this;
    }

    private int qtyType;

    private boolean hasQtyType;

    public boolean hasQtyType()
    {
        return hasQtyType;
    }

    public TradeCaptureReportAckEncoder qtyType(int value)
    {
        qtyType = value;
        hasQtyType = true;
        return this;
    }

    public int qtyType()
    {
        return qtyType;
    }

    public TradeCaptureReportAckEncoder qtyType(QtyType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == QtyType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: qtyType Value: " + value );
            }
            if (value == QtyType.NULL_VAL)
            {
                return this;
            }
        }
        return qtyType(value.representation());
    }

    private final DecimalFloat lastQty = new DecimalFloat();

    private boolean hasLastQty;

    public boolean hasLastQty()
    {
        return hasLastQty;
    }

    public TradeCaptureReportAckEncoder lastQty(DecimalFloat value)
    {
        lastQty.set(value);
        hasLastQty = true;
        return this;
    }

    public TradeCaptureReportAckEncoder lastQty(long value, int scale)
    {
        lastQty.set(value, scale);
        hasLastQty = true;
        return this;
    }

    public DecimalFloat lastQty()
    {
        return lastQty;
    }

    private final DecimalFloat lastPx = new DecimalFloat();

    private boolean hasLastPx;

    public boolean hasLastPx()
    {
        return hasLastPx;
    }

    public TradeCaptureReportAckEncoder lastPx(DecimalFloat value)
    {
        lastPx.set(value);
        hasLastPx = true;
        return this;
    }

    public TradeCaptureReportAckEncoder lastPx(long value, int scale)
    {
        lastPx.set(value, scale);
        hasLastPx = true;
        return this;
    }

    public DecimalFloat lastPx()
    {
        return lastPx;
    }

    private char venueType;

    private boolean hasVenueType;

    public boolean hasVenueType()
    {
        return hasVenueType;
    }

    public TradeCaptureReportAckEncoder venueType(char value)
    {
        venueType = value;
        hasVenueType = true;
        return this;
    }

    public char venueType()
    {
        return venueType;
    }

    public TradeCaptureReportAckEncoder venueType(VenueType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == VenueType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: venueType Value: " + value );
            }
            if (value == VenueType.NULL_VAL)
            {
                return this;
            }
        }
        return venueType(value.representation());
    }

    private final MutableDirectBuffer marketSegmentID = new UnsafeBuffer();

    private int marketSegmentIDOffset = 0;

    private int marketSegmentIDLength = 0;

    public TradeCaptureReportAckEncoder marketSegmentID(final DirectBuffer value, final int offset, final int length)
    {
        marketSegmentID.wrap(value);
        marketSegmentIDOffset = offset;
        marketSegmentIDLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder marketSegmentID(final DirectBuffer value, final int length)
    {
        return marketSegmentID(value, 0, length);
    }

    public TradeCaptureReportAckEncoder marketSegmentID(final DirectBuffer value)
    {
        return marketSegmentID(value, 0, value.capacity());
    }

    public TradeCaptureReportAckEncoder marketSegmentID(final byte[] value, final int offset, final int length)
    {
        marketSegmentID.wrap(value);
        marketSegmentIDOffset = offset;
        marketSegmentIDLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder marketSegmentIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(marketSegmentID, value, offset, length);
        marketSegmentIDOffset = offset;
        marketSegmentIDLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder marketSegmentID(final byte[] value, final int length)
    {
        return marketSegmentID(value, 0, length);
    }

    public TradeCaptureReportAckEncoder marketSegmentID(final byte[] value)
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

    public TradeCaptureReportAckEncoder marketSegmentID(final CharSequence value)
    {
        toBytes(value, marketSegmentID);
        marketSegmentIDOffset = 0;
        marketSegmentIDLength = value.length();
        return this;
    }

    public TradeCaptureReportAckEncoder marketSegmentID(final AsciiSequenceView value)
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

    public TradeCaptureReportAckEncoder marketSegmentID(final char[] value)
    {
        return marketSegmentID(value, 0, value.length);
    }

    public TradeCaptureReportAckEncoder marketSegmentID(final char[] value, final int length)
    {
        return marketSegmentID(value, 0, length);
    }

    public TradeCaptureReportAckEncoder marketSegmentID(final char[] value, final int offset, final int length)
    {
        toBytes(value, marketSegmentID, offset, length);
        marketSegmentIDOffset = 0;
        marketSegmentIDLength = length;
        return this;
    }

    private final MutableDirectBuffer marketID = new UnsafeBuffer();

    private int marketIDOffset = 0;

    private int marketIDLength = 0;

    public TradeCaptureReportAckEncoder marketID(final DirectBuffer value, final int offset, final int length)
    {
        marketID.wrap(value);
        marketIDOffset = offset;
        marketIDLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder marketID(final DirectBuffer value, final int length)
    {
        return marketID(value, 0, length);
    }

    public TradeCaptureReportAckEncoder marketID(final DirectBuffer value)
    {
        return marketID(value, 0, value.capacity());
    }

    public TradeCaptureReportAckEncoder marketID(final byte[] value, final int offset, final int length)
    {
        marketID.wrap(value);
        marketIDOffset = offset;
        marketIDLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder marketIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(marketID, value, offset, length);
        marketIDOffset = offset;
        marketIDLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder marketID(final byte[] value, final int length)
    {
        return marketID(value, 0, length);
    }

    public TradeCaptureReportAckEncoder marketID(final byte[] value)
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

    public TradeCaptureReportAckEncoder marketID(final CharSequence value)
    {
        toBytes(value, marketID);
        marketIDOffset = 0;
        marketIDLength = value.length();
        return this;
    }

    public TradeCaptureReportAckEncoder marketID(final AsciiSequenceView value)
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

    public TradeCaptureReportAckEncoder marketID(final char[] value)
    {
        return marketID(value, 0, value.length);
    }

    public TradeCaptureReportAckEncoder marketID(final char[] value, final int length)
    {
        return marketID(value, 0, length);
    }

    public TradeCaptureReportAckEncoder marketID(final char[] value, final int offset, final int length)
    {
        toBytes(value, marketID, offset, length);
        marketIDOffset = 0;
        marketIDLength = length;
        return this;
    }

    private final InstrumentEncoder instrument = new InstrumentEncoder();
    public InstrumentEncoder instrument()
    {
        return instrument;
    }

    private final DecimalFloat lastParPx = new DecimalFloat();

    private boolean hasLastParPx;

    public boolean hasLastParPx()
    {
        return hasLastParPx;
    }

    public TradeCaptureReportAckEncoder lastParPx(DecimalFloat value)
    {
        lastParPx.set(value);
        hasLastParPx = true;
        return this;
    }

    public TradeCaptureReportAckEncoder lastParPx(long value, int scale)
    {
        lastParPx.set(value, scale);
        hasLastParPx = true;
        return this;
    }

    public DecimalFloat lastParPx()
    {
        return lastParPx;
    }

    private final DecimalFloat calculatedCcyLastQty = new DecimalFloat();

    private boolean hasCalculatedCcyLastQty;

    public boolean hasCalculatedCcyLastQty()
    {
        return hasCalculatedCcyLastQty;
    }

    public TradeCaptureReportAckEncoder calculatedCcyLastQty(DecimalFloat value)
    {
        calculatedCcyLastQty.set(value);
        hasCalculatedCcyLastQty = true;
        return this;
    }

    public TradeCaptureReportAckEncoder calculatedCcyLastQty(long value, int scale)
    {
        calculatedCcyLastQty.set(value, scale);
        hasCalculatedCcyLastQty = true;
        return this;
    }

    public DecimalFloat calculatedCcyLastQty()
    {
        return calculatedCcyLastQty;
    }

    private final DecimalFloat lastSwapPoints = new DecimalFloat();

    private boolean hasLastSwapPoints;

    public boolean hasLastSwapPoints()
    {
        return hasLastSwapPoints;
    }

    public TradeCaptureReportAckEncoder lastSwapPoints(DecimalFloat value)
    {
        lastSwapPoints.set(value);
        hasLastSwapPoints = true;
        return this;
    }

    public TradeCaptureReportAckEncoder lastSwapPoints(long value, int scale)
    {
        lastSwapPoints.set(value, scale);
        hasLastSwapPoints = true;
        return this;
    }

    public DecimalFloat lastSwapPoints()
    {
        return lastSwapPoints;
    }

    private final MutableDirectBuffer currency = new UnsafeBuffer();

    private int currencyOffset = 0;

    private int currencyLength = 0;

    public TradeCaptureReportAckEncoder currency(final DirectBuffer value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder currency(final DirectBuffer value, final int length)
    {
        return currency(value, 0, length);
    }

    public TradeCaptureReportAckEncoder currency(final DirectBuffer value)
    {
        return currency(value, 0, value.capacity());
    }

    public TradeCaptureReportAckEncoder currency(final byte[] value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder currencyAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(currency, value, offset, length);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder currency(final byte[] value, final int length)
    {
        return currency(value, 0, length);
    }

    public TradeCaptureReportAckEncoder currency(final byte[] value)
    {
        return currency(value, 0, value.length);
    }

    public boolean hasCurrency()
    {
        return currencyLength > 0;
    }

    public MutableDirectBuffer currency()
    {
        return currency;
    }

    public String currencyAsString()
    {
        return currency.getStringWithoutLengthAscii(currencyOffset, currencyLength);
    }

    public TradeCaptureReportAckEncoder currency(final CharSequence value)
    {
        toBytes(value, currency);
        currencyOffset = 0;
        currencyLength = value.length();
        return this;
    }

    public TradeCaptureReportAckEncoder currency(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            currency.wrap(buffer);
            currencyOffset = value.offset();
            currencyLength = value.length();
        }
        return this;
    }

    public TradeCaptureReportAckEncoder currency(final char[] value)
    {
        return currency(value, 0, value.length);
    }

    public TradeCaptureReportAckEncoder currency(final char[] value, final int length)
    {
        return currency(value, 0, length);
    }

    public TradeCaptureReportAckEncoder currency(final char[] value, final int offset, final int length)
    {
        toBytes(value, currency, offset, length);
        currencyOffset = 0;
        currencyLength = length;
        return this;
    }

    private final MutableDirectBuffer settlCurrency = new UnsafeBuffer();

    private int settlCurrencyOffset = 0;

    private int settlCurrencyLength = 0;

    public TradeCaptureReportAckEncoder settlCurrency(final DirectBuffer value, final int offset, final int length)
    {
        settlCurrency.wrap(value);
        settlCurrencyOffset = offset;
        settlCurrencyLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder settlCurrency(final DirectBuffer value, final int length)
    {
        return settlCurrency(value, 0, length);
    }

    public TradeCaptureReportAckEncoder settlCurrency(final DirectBuffer value)
    {
        return settlCurrency(value, 0, value.capacity());
    }

    public TradeCaptureReportAckEncoder settlCurrency(final byte[] value, final int offset, final int length)
    {
        settlCurrency.wrap(value);
        settlCurrencyOffset = offset;
        settlCurrencyLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder settlCurrencyAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlCurrency, value, offset, length);
        settlCurrencyOffset = offset;
        settlCurrencyLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder settlCurrency(final byte[] value, final int length)
    {
        return settlCurrency(value, 0, length);
    }

    public TradeCaptureReportAckEncoder settlCurrency(final byte[] value)
    {
        return settlCurrency(value, 0, value.length);
    }

    public boolean hasSettlCurrency()
    {
        return settlCurrencyLength > 0;
    }

    public MutableDirectBuffer settlCurrency()
    {
        return settlCurrency;
    }

    public String settlCurrencyAsString()
    {
        return settlCurrency.getStringWithoutLengthAscii(settlCurrencyOffset, settlCurrencyLength);
    }

    public TradeCaptureReportAckEncoder settlCurrency(final CharSequence value)
    {
        toBytes(value, settlCurrency);
        settlCurrencyOffset = 0;
        settlCurrencyLength = value.length();
        return this;
    }

    public TradeCaptureReportAckEncoder settlCurrency(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            settlCurrency.wrap(buffer);
            settlCurrencyOffset = value.offset();
            settlCurrencyLength = value.length();
        }
        return this;
    }

    public TradeCaptureReportAckEncoder settlCurrency(final char[] value)
    {
        return settlCurrency(value, 0, value.length);
    }

    public TradeCaptureReportAckEncoder settlCurrency(final char[] value, final int length)
    {
        return settlCurrency(value, 0, length);
    }

    public TradeCaptureReportAckEncoder settlCurrency(final char[] value, final int offset, final int length)
    {
        toBytes(value, settlCurrency, offset, length);
        settlCurrencyOffset = 0;
        settlCurrencyLength = length;
        return this;
    }

    private final DecimalFloat lastSpotRate = new DecimalFloat();

    private boolean hasLastSpotRate;

    public boolean hasLastSpotRate()
    {
        return hasLastSpotRate;
    }

    public TradeCaptureReportAckEncoder lastSpotRate(DecimalFloat value)
    {
        lastSpotRate.set(value);
        hasLastSpotRate = true;
        return this;
    }

    public TradeCaptureReportAckEncoder lastSpotRate(long value, int scale)
    {
        lastSpotRate.set(value, scale);
        hasLastSpotRate = true;
        return this;
    }

    public DecimalFloat lastSpotRate()
    {
        return lastSpotRate;
    }

    private final DecimalFloat lastForwardPoints = new DecimalFloat();

    private boolean hasLastForwardPoints;

    public boolean hasLastForwardPoints()
    {
        return hasLastForwardPoints;
    }

    public TradeCaptureReportAckEncoder lastForwardPoints(DecimalFloat value)
    {
        lastForwardPoints.set(value);
        hasLastForwardPoints = true;
        return this;
    }

    public TradeCaptureReportAckEncoder lastForwardPoints(long value, int scale)
    {
        lastForwardPoints.set(value, scale);
        hasLastForwardPoints = true;
        return this;
    }

    public DecimalFloat lastForwardPoints()
    {
        return lastForwardPoints;
    }

    private final MutableDirectBuffer lastMkt = new UnsafeBuffer();

    private int lastMktOffset = 0;

    private int lastMktLength = 0;

    public TradeCaptureReportAckEncoder lastMkt(final DirectBuffer value, final int offset, final int length)
    {
        lastMkt.wrap(value);
        lastMktOffset = offset;
        lastMktLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder lastMkt(final DirectBuffer value, final int length)
    {
        return lastMkt(value, 0, length);
    }

    public TradeCaptureReportAckEncoder lastMkt(final DirectBuffer value)
    {
        return lastMkt(value, 0, value.capacity());
    }

    public TradeCaptureReportAckEncoder lastMkt(final byte[] value, final int offset, final int length)
    {
        lastMkt.wrap(value);
        lastMktOffset = offset;
        lastMktLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder lastMktAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(lastMkt, value, offset, length);
        lastMktOffset = offset;
        lastMktLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder lastMkt(final byte[] value, final int length)
    {
        return lastMkt(value, 0, length);
    }

    public TradeCaptureReportAckEncoder lastMkt(final byte[] value)
    {
        return lastMkt(value, 0, value.length);
    }

    public boolean hasLastMkt()
    {
        return lastMktLength > 0;
    }

    public MutableDirectBuffer lastMkt()
    {
        return lastMkt;
    }

    public String lastMktAsString()
    {
        return lastMkt.getStringWithoutLengthAscii(lastMktOffset, lastMktLength);
    }

    public TradeCaptureReportAckEncoder lastMkt(final CharSequence value)
    {
        toBytes(value, lastMkt);
        lastMktOffset = 0;
        lastMktLength = value.length();
        return this;
    }

    public TradeCaptureReportAckEncoder lastMkt(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            lastMkt.wrap(buffer);
            lastMktOffset = value.offset();
            lastMktLength = value.length();
        }
        return this;
    }

    public TradeCaptureReportAckEncoder lastMkt(final char[] value)
    {
        return lastMkt(value, 0, value.length);
    }

    public TradeCaptureReportAckEncoder lastMkt(final char[] value, final int length)
    {
        return lastMkt(value, 0, length);
    }

    public TradeCaptureReportAckEncoder lastMkt(final char[] value, final int offset, final int length)
    {
        toBytes(value, lastMkt, offset, length);
        lastMktOffset = 0;
        lastMktLength = length;
        return this;
    }

    private final MutableDirectBuffer tradeDate = new UnsafeBuffer();

    private int tradeDateOffset = 0;

    private int tradeDateLength = 0;

    public TradeCaptureReportAckEncoder tradeDate(final DirectBuffer value, final int offset, final int length)
    {
        tradeDate.wrap(value);
        tradeDateOffset = offset;
        tradeDateLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder tradeDate(final DirectBuffer value, final int length)
    {
        return tradeDate(value, 0, length);
    }

    public TradeCaptureReportAckEncoder tradeDate(final DirectBuffer value)
    {
        return tradeDate(value, 0, value.capacity());
    }

    public TradeCaptureReportAckEncoder tradeDate(final byte[] value, final int offset, final int length)
    {
        tradeDate.wrap(value);
        tradeDateOffset = offset;
        tradeDateLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder tradeDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradeDate, value, offset, length);
        tradeDateOffset = offset;
        tradeDateLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder tradeDate(final byte[] value, final int length)
    {
        return tradeDate(value, 0, length);
    }

    public TradeCaptureReportAckEncoder tradeDate(final byte[] value)
    {
        return tradeDate(value, 0, value.length);
    }

    public boolean hasTradeDate()
    {
        return tradeDateLength > 0;
    }

    public MutableDirectBuffer tradeDate()
    {
        return tradeDate;
    }

    public String tradeDateAsString()
    {
        return tradeDate.getStringWithoutLengthAscii(tradeDateOffset, tradeDateLength);
    }

    private final MutableDirectBuffer clearingBusinessDate = new UnsafeBuffer();

    private int clearingBusinessDateOffset = 0;

    private int clearingBusinessDateLength = 0;

    public TradeCaptureReportAckEncoder clearingBusinessDate(final DirectBuffer value, final int offset, final int length)
    {
        clearingBusinessDate.wrap(value);
        clearingBusinessDateOffset = offset;
        clearingBusinessDateLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder clearingBusinessDate(final DirectBuffer value, final int length)
    {
        return clearingBusinessDate(value, 0, length);
    }

    public TradeCaptureReportAckEncoder clearingBusinessDate(final DirectBuffer value)
    {
        return clearingBusinessDate(value, 0, value.capacity());
    }

    public TradeCaptureReportAckEncoder clearingBusinessDate(final byte[] value, final int offset, final int length)
    {
        clearingBusinessDate.wrap(value);
        clearingBusinessDateOffset = offset;
        clearingBusinessDateLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder clearingBusinessDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(clearingBusinessDate, value, offset, length);
        clearingBusinessDateOffset = offset;
        clearingBusinessDateLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder clearingBusinessDate(final byte[] value, final int length)
    {
        return clearingBusinessDate(value, 0, length);
    }

    public TradeCaptureReportAckEncoder clearingBusinessDate(final byte[] value)
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

    private final DecimalFloat avgPx = new DecimalFloat();

    private boolean hasAvgPx;

    public boolean hasAvgPx()
    {
        return hasAvgPx;
    }

    public TradeCaptureReportAckEncoder avgPx(DecimalFloat value)
    {
        avgPx.set(value);
        hasAvgPx = true;
        return this;
    }

    public TradeCaptureReportAckEncoder avgPx(long value, int scale)
    {
        avgPx.set(value, scale);
        hasAvgPx = true;
        return this;
    }

    public DecimalFloat avgPx()
    {
        return avgPx;
    }

    private int avgPxIndicator;

    private boolean hasAvgPxIndicator;

    public boolean hasAvgPxIndicator()
    {
        return hasAvgPxIndicator;
    }

    public TradeCaptureReportAckEncoder avgPxIndicator(int value)
    {
        avgPxIndicator = value;
        hasAvgPxIndicator = true;
        return this;
    }

    public int avgPxIndicator()
    {
        return avgPxIndicator;
    }

    public TradeCaptureReportAckEncoder avgPxIndicator(AvgPxIndicator value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == AvgPxIndicator.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: avgPxIndicator Value: " + value );
            }
            if (value == AvgPxIndicator.NULL_VAL)
            {
                return this;
            }
        }
        return avgPxIndicator(value.representation());
    }

    private char multiLegReportingType;

    private boolean hasMultiLegReportingType;

    public boolean hasMultiLegReportingType()
    {
        return hasMultiLegReportingType;
    }

    public TradeCaptureReportAckEncoder multiLegReportingType(char value)
    {
        multiLegReportingType = value;
        hasMultiLegReportingType = true;
        return this;
    }

    public char multiLegReportingType()
    {
        return multiLegReportingType;
    }

    public TradeCaptureReportAckEncoder multiLegReportingType(MultiLegReportingType value)
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

    private final MutableDirectBuffer tradeLegRefID = new UnsafeBuffer();

    private int tradeLegRefIDOffset = 0;

    private int tradeLegRefIDLength = 0;

    public TradeCaptureReportAckEncoder tradeLegRefID(final DirectBuffer value, final int offset, final int length)
    {
        tradeLegRefID.wrap(value);
        tradeLegRefIDOffset = offset;
        tradeLegRefIDLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder tradeLegRefID(final DirectBuffer value, final int length)
    {
        return tradeLegRefID(value, 0, length);
    }

    public TradeCaptureReportAckEncoder tradeLegRefID(final DirectBuffer value)
    {
        return tradeLegRefID(value, 0, value.capacity());
    }

    public TradeCaptureReportAckEncoder tradeLegRefID(final byte[] value, final int offset, final int length)
    {
        tradeLegRefID.wrap(value);
        tradeLegRefIDOffset = offset;
        tradeLegRefIDLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder tradeLegRefIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradeLegRefID, value, offset, length);
        tradeLegRefIDOffset = offset;
        tradeLegRefIDLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder tradeLegRefID(final byte[] value, final int length)
    {
        return tradeLegRefID(value, 0, length);
    }

    public TradeCaptureReportAckEncoder tradeLegRefID(final byte[] value)
    {
        return tradeLegRefID(value, 0, value.length);
    }

    public boolean hasTradeLegRefID()
    {
        return tradeLegRefIDLength > 0;
    }

    public MutableDirectBuffer tradeLegRefID()
    {
        return tradeLegRefID;
    }

    public String tradeLegRefIDAsString()
    {
        return tradeLegRefID.getStringWithoutLengthAscii(tradeLegRefIDOffset, tradeLegRefIDLength);
    }

    public TradeCaptureReportAckEncoder tradeLegRefID(final CharSequence value)
    {
        toBytes(value, tradeLegRefID);
        tradeLegRefIDOffset = 0;
        tradeLegRefIDLength = value.length();
        return this;
    }

    public TradeCaptureReportAckEncoder tradeLegRefID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            tradeLegRefID.wrap(buffer);
            tradeLegRefIDOffset = value.offset();
            tradeLegRefIDLength = value.length();
        }
        return this;
    }

    public TradeCaptureReportAckEncoder tradeLegRefID(final char[] value)
    {
        return tradeLegRefID(value, 0, value.length);
    }

    public TradeCaptureReportAckEncoder tradeLegRefID(final char[] value, final int length)
    {
        return tradeLegRefID(value, 0, length);
    }

    public TradeCaptureReportAckEncoder tradeLegRefID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradeLegRefID, offset, length);
        tradeLegRefIDOffset = 0;
        tradeLegRefIDLength = length;
        return this;
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

    private final MutableDirectBuffer settlType = new UnsafeBuffer();

    private int settlTypeOffset = 0;

    private int settlTypeLength = 0;

    public TradeCaptureReportAckEncoder settlType(final DirectBuffer value, final int offset, final int length)
    {
        settlType.wrap(value);
        settlTypeOffset = offset;
        settlTypeLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder settlType(final DirectBuffer value, final int length)
    {
        return settlType(value, 0, length);
    }

    public TradeCaptureReportAckEncoder settlType(final DirectBuffer value)
    {
        return settlType(value, 0, value.capacity());
    }

    public TradeCaptureReportAckEncoder settlType(final byte[] value, final int offset, final int length)
    {
        settlType.wrap(value);
        settlTypeOffset = offset;
        settlTypeLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder settlTypeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlType, value, offset, length);
        settlTypeOffset = offset;
        settlTypeLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder settlType(final byte[] value, final int length)
    {
        return settlType(value, 0, length);
    }

    public TradeCaptureReportAckEncoder settlType(final byte[] value)
    {
        return settlType(value, 0, value.length);
    }

    public boolean hasSettlType()
    {
        return settlTypeLength > 0;
    }

    public MutableDirectBuffer settlType()
    {
        return settlType;
    }

    public String settlTypeAsString()
    {
        return settlType.getStringWithoutLengthAscii(settlTypeOffset, settlTypeLength);
    }

    public TradeCaptureReportAckEncoder settlType(final CharSequence value)
    {
        toBytes(value, settlType);
        settlTypeOffset = 0;
        settlTypeLength = value.length();
        return this;
    }

    public TradeCaptureReportAckEncoder settlType(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            settlType.wrap(buffer);
            settlTypeOffset = value.offset();
            settlTypeLength = value.length();
        }
        return this;
    }

    public TradeCaptureReportAckEncoder settlType(final char[] value)
    {
        return settlType(value, 0, value.length);
    }

    public TradeCaptureReportAckEncoder settlType(final char[] value, final int length)
    {
        return settlType(value, 0, length);
    }

    public TradeCaptureReportAckEncoder settlType(final char[] value, final int offset, final int length)
    {
        toBytes(value, settlType, offset, length);
        settlTypeOffset = 0;
        settlTypeLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder settlType(SettlType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == SettlType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: settlType Value: " + value );
            }
            if (value == SettlType.NULL_VAL)
            {
                return this;
            }
        }
        return settlType(value.representation());
    }

    private final UndInstrmtGrpEncoder undInstrmtGrp = new UndInstrmtGrpEncoder();
    public UndInstrmtGrpEncoder undInstrmtGrp()
    {
        return undInstrmtGrp;
    }

    private char matchStatus;

    private boolean hasMatchStatus;

    public boolean hasMatchStatus()
    {
        return hasMatchStatus;
    }

    public TradeCaptureReportAckEncoder matchStatus(char value)
    {
        matchStatus = value;
        hasMatchStatus = true;
        return this;
    }

    public char matchStatus()
    {
        return matchStatus;
    }

    public TradeCaptureReportAckEncoder matchStatus(MatchStatus value)
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

    private final MutableDirectBuffer matchType = new UnsafeBuffer();

    private int matchTypeOffset = 0;

    private int matchTypeLength = 0;

    public TradeCaptureReportAckEncoder matchType(final DirectBuffer value, final int offset, final int length)
    {
        matchType.wrap(value);
        matchTypeOffset = offset;
        matchTypeLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder matchType(final DirectBuffer value, final int length)
    {
        return matchType(value, 0, length);
    }

    public TradeCaptureReportAckEncoder matchType(final DirectBuffer value)
    {
        return matchType(value, 0, value.capacity());
    }

    public TradeCaptureReportAckEncoder matchType(final byte[] value, final int offset, final int length)
    {
        matchType.wrap(value);
        matchTypeOffset = offset;
        matchTypeLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder matchTypeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(matchType, value, offset, length);
        matchTypeOffset = offset;
        matchTypeLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder matchType(final byte[] value, final int length)
    {
        return matchType(value, 0, length);
    }

    public TradeCaptureReportAckEncoder matchType(final byte[] value)
    {
        return matchType(value, 0, value.length);
    }

    public boolean hasMatchType()
    {
        return matchTypeLength > 0;
    }

    public MutableDirectBuffer matchType()
    {
        return matchType;
    }

    public String matchTypeAsString()
    {
        return matchType.getStringWithoutLengthAscii(matchTypeOffset, matchTypeLength);
    }

    public TradeCaptureReportAckEncoder matchType(final CharSequence value)
    {
        toBytes(value, matchType);
        matchTypeOffset = 0;
        matchTypeLength = value.length();
        return this;
    }

    public TradeCaptureReportAckEncoder matchType(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            matchType.wrap(buffer);
            matchTypeOffset = value.offset();
            matchTypeLength = value.length();
        }
        return this;
    }

    public TradeCaptureReportAckEncoder matchType(final char[] value)
    {
        return matchType(value, 0, value.length);
    }

    public TradeCaptureReportAckEncoder matchType(final char[] value, final int length)
    {
        return matchType(value, 0, length);
    }

    public TradeCaptureReportAckEncoder matchType(final char[] value, final int offset, final int length)
    {
        toBytes(value, matchType, offset, length);
        matchTypeOffset = 0;
        matchTypeLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder matchType(MatchType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == MatchType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: matchType Value: " + value );
            }
            if (value == MatchType.NULL_VAL)
            {
                return this;
            }
        }
        return matchType(value.representation());
    }

    private boolean copyMsgIndicator;

    private boolean hasCopyMsgIndicator;

    public boolean hasCopyMsgIndicator()
    {
        return hasCopyMsgIndicator;
    }

    public TradeCaptureReportAckEncoder copyMsgIndicator(boolean value)
    {
        copyMsgIndicator = value;
        hasCopyMsgIndicator = true;
        return this;
    }

    public boolean copyMsgIndicator()
    {
        return copyMsgIndicator;
    }

    private final TrdRepIndicatorsGrpEncoder trdRepIndicatorsGrp = new TrdRepIndicatorsGrpEncoder();
    public TrdRepIndicatorsGrpEncoder trdRepIndicatorsGrp()
    {
        return trdRepIndicatorsGrp;
    }

    private boolean publishTrdIndicator;

    private boolean hasPublishTrdIndicator;

    public boolean hasPublishTrdIndicator()
    {
        return hasPublishTrdIndicator;
    }

    public TradeCaptureReportAckEncoder publishTrdIndicator(boolean value)
    {
        publishTrdIndicator = value;
        hasPublishTrdIndicator = true;
        return this;
    }

    public boolean publishTrdIndicator()
    {
        return publishTrdIndicator;
    }

    private int tradePublishIndicator;

    private boolean hasTradePublishIndicator;

    public boolean hasTradePublishIndicator()
    {
        return hasTradePublishIndicator;
    }

    public TradeCaptureReportAckEncoder tradePublishIndicator(int value)
    {
        tradePublishIndicator = value;
        hasTradePublishIndicator = true;
        return this;
    }

    public int tradePublishIndicator()
    {
        return tradePublishIndicator;
    }

    public TradeCaptureReportAckEncoder tradePublishIndicator(TradePublishIndicator value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == TradePublishIndicator.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: tradePublishIndicator Value: " + value );
            }
            if (value == TradePublishIndicator.NULL_VAL)
            {
                return this;
            }
        }
        return tradePublishIndicator(value.representation());
    }

    private int shortSaleReason;

    private boolean hasShortSaleReason;

    public boolean hasShortSaleReason()
    {
        return hasShortSaleReason;
    }

    public TradeCaptureReportAckEncoder shortSaleReason(int value)
    {
        shortSaleReason = value;
        hasShortSaleReason = true;
        return this;
    }

    public int shortSaleReason()
    {
        return shortSaleReason;
    }

    public TradeCaptureReportAckEncoder shortSaleReason(ShortSaleReason value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == ShortSaleReason.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: shortSaleReason Value: " + value );
            }
            if (value == ShortSaleReason.NULL_VAL)
            {
                return this;
            }
        }
        return shortSaleReason(value.representation());
    }

    private final TrdInstrmtLegGrpEncoder trdInstrmtLegGrp = new TrdInstrmtLegGrpEncoder();
    public TrdInstrmtLegGrpEncoder trdInstrmtLegGrp()
    {
        return trdInstrmtLegGrp;
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

    private char asOfIndicator;

    private boolean hasAsOfIndicator;

    public boolean hasAsOfIndicator()
    {
        return hasAsOfIndicator;
    }

    public TradeCaptureReportAckEncoder asOfIndicator(char value)
    {
        asOfIndicator = value;
        hasAsOfIndicator = true;
        return this;
    }

    public char asOfIndicator()
    {
        return asOfIndicator;
    }

    public TradeCaptureReportAckEncoder asOfIndicator(AsOfIndicator value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == AsOfIndicator.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: asOfIndicator Value: " + value );
            }
            if (value == AsOfIndicator.NULL_VAL)
            {
                return this;
            }
        }
        return asOfIndicator(value.representation());
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

    private final PositionAmountDataEncoder positionAmountData = new PositionAmountDataEncoder();
    public PositionAmountDataEncoder positionAmountData()
    {
        return positionAmountData;
    }

    private final MutableDirectBuffer tierCode = new UnsafeBuffer();

    private int tierCodeOffset = 0;

    private int tierCodeLength = 0;

    public TradeCaptureReportAckEncoder tierCode(final DirectBuffer value, final int offset, final int length)
    {
        tierCode.wrap(value);
        tierCodeOffset = offset;
        tierCodeLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder tierCode(final DirectBuffer value, final int length)
    {
        return tierCode(value, 0, length);
    }

    public TradeCaptureReportAckEncoder tierCode(final DirectBuffer value)
    {
        return tierCode(value, 0, value.capacity());
    }

    public TradeCaptureReportAckEncoder tierCode(final byte[] value, final int offset, final int length)
    {
        tierCode.wrap(value);
        tierCodeOffset = offset;
        tierCodeLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder tierCodeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tierCode, value, offset, length);
        tierCodeOffset = offset;
        tierCodeLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder tierCode(final byte[] value, final int length)
    {
        return tierCode(value, 0, length);
    }

    public TradeCaptureReportAckEncoder tierCode(final byte[] value)
    {
        return tierCode(value, 0, value.length);
    }

    public boolean hasTierCode()
    {
        return tierCodeLength > 0;
    }

    public MutableDirectBuffer tierCode()
    {
        return tierCode;
    }

    public String tierCodeAsString()
    {
        return tierCode.getStringWithoutLengthAscii(tierCodeOffset, tierCodeLength);
    }

    public TradeCaptureReportAckEncoder tierCode(final CharSequence value)
    {
        toBytes(value, tierCode);
        tierCodeOffset = 0;
        tierCodeLength = value.length();
        return this;
    }

    public TradeCaptureReportAckEncoder tierCode(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            tierCode.wrap(buffer);
            tierCodeOffset = value.offset();
            tierCodeLength = value.length();
        }
        return this;
    }

    public TradeCaptureReportAckEncoder tierCode(final char[] value)
    {
        return tierCode(value, 0, value.length);
    }

    public TradeCaptureReportAckEncoder tierCode(final char[] value, final int length)
    {
        return tierCode(value, 0, length);
    }

    public TradeCaptureReportAckEncoder tierCode(final char[] value, final int offset, final int length)
    {
        toBytes(value, tierCode, offset, length);
        tierCodeOffset = 0;
        tierCodeLength = length;
        return this;
    }

    private final MutableDirectBuffer messageEventSource = new UnsafeBuffer();

    private int messageEventSourceOffset = 0;

    private int messageEventSourceLength = 0;

    public TradeCaptureReportAckEncoder messageEventSource(final DirectBuffer value, final int offset, final int length)
    {
        messageEventSource.wrap(value);
        messageEventSourceOffset = offset;
        messageEventSourceLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder messageEventSource(final DirectBuffer value, final int length)
    {
        return messageEventSource(value, 0, length);
    }

    public TradeCaptureReportAckEncoder messageEventSource(final DirectBuffer value)
    {
        return messageEventSource(value, 0, value.capacity());
    }

    public TradeCaptureReportAckEncoder messageEventSource(final byte[] value, final int offset, final int length)
    {
        messageEventSource.wrap(value);
        messageEventSourceOffset = offset;
        messageEventSourceLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder messageEventSourceAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(messageEventSource, value, offset, length);
        messageEventSourceOffset = offset;
        messageEventSourceLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder messageEventSource(final byte[] value, final int length)
    {
        return messageEventSource(value, 0, length);
    }

    public TradeCaptureReportAckEncoder messageEventSource(final byte[] value)
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

    public TradeCaptureReportAckEncoder messageEventSource(final CharSequence value)
    {
        toBytes(value, messageEventSource);
        messageEventSourceOffset = 0;
        messageEventSourceLength = value.length();
        return this;
    }

    public TradeCaptureReportAckEncoder messageEventSource(final AsciiSequenceView value)
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

    public TradeCaptureReportAckEncoder messageEventSource(final char[] value)
    {
        return messageEventSource(value, 0, value.length);
    }

    public TradeCaptureReportAckEncoder messageEventSource(final char[] value, final int length)
    {
        return messageEventSource(value, 0, length);
    }

    public TradeCaptureReportAckEncoder messageEventSource(final char[] value, final int offset, final int length)
    {
        toBytes(value, messageEventSource, offset, length);
        messageEventSourceOffset = 0;
        messageEventSourceLength = length;
        return this;
    }

    private final MutableDirectBuffer lastUpdateTime = new UnsafeBuffer();

    private int lastUpdateTimeOffset = 0;

    private int lastUpdateTimeLength = 0;

    public TradeCaptureReportAckEncoder lastUpdateTime(final DirectBuffer value, final int offset, final int length)
    {
        lastUpdateTime.wrap(value);
        lastUpdateTimeOffset = offset;
        lastUpdateTimeLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder lastUpdateTime(final DirectBuffer value, final int length)
    {
        return lastUpdateTime(value, 0, length);
    }

    public TradeCaptureReportAckEncoder lastUpdateTime(final DirectBuffer value)
    {
        return lastUpdateTime(value, 0, value.capacity());
    }

    public TradeCaptureReportAckEncoder lastUpdateTime(final byte[] value, final int offset, final int length)
    {
        lastUpdateTime.wrap(value);
        lastUpdateTimeOffset = offset;
        lastUpdateTimeLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder lastUpdateTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(lastUpdateTime, value, offset, length);
        lastUpdateTimeOffset = offset;
        lastUpdateTimeLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder lastUpdateTime(final byte[] value, final int length)
    {
        return lastUpdateTime(value, 0, length);
    }

    public TradeCaptureReportAckEncoder lastUpdateTime(final byte[] value)
    {
        return lastUpdateTime(value, 0, value.length);
    }

    public boolean hasLastUpdateTime()
    {
        return lastUpdateTimeLength > 0;
    }

    public MutableDirectBuffer lastUpdateTime()
    {
        return lastUpdateTime;
    }

    public String lastUpdateTimeAsString()
    {
        return lastUpdateTime.getStringWithoutLengthAscii(lastUpdateTimeOffset, lastUpdateTimeLength);
    }

    private final DecimalFloat rndPx = new DecimalFloat();

    private boolean hasRndPx;

    public boolean hasRndPx()
    {
        return hasRndPx;
    }

    public TradeCaptureReportAckEncoder rndPx(DecimalFloat value)
    {
        rndPx.set(value);
        hasRndPx = true;
        return this;
    }

    public TradeCaptureReportAckEncoder rndPx(long value, int scale)
    {
        rndPx.set(value, scale);
        hasRndPx = true;
        return this;
    }

    public DecimalFloat rndPx()
    {
        return rndPx;
    }

    private final TrdCapRptAckSideGrpEncoder trdCapRptAckSideGrp = new TrdCapRptAckSideGrpEncoder();
    public TrdCapRptAckSideGrpEncoder trdCapRptAckSideGrp()
    {
        return trdCapRptAckSideGrp;
    }

    private final MutableDirectBuffer rptSys = new UnsafeBuffer();

    private int rptSysOffset = 0;

    private int rptSysLength = 0;

    public TradeCaptureReportAckEncoder rptSys(final DirectBuffer value, final int offset, final int length)
    {
        rptSys.wrap(value);
        rptSysOffset = offset;
        rptSysLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder rptSys(final DirectBuffer value, final int length)
    {
        return rptSys(value, 0, length);
    }

    public TradeCaptureReportAckEncoder rptSys(final DirectBuffer value)
    {
        return rptSys(value, 0, value.capacity());
    }

    public TradeCaptureReportAckEncoder rptSys(final byte[] value, final int offset, final int length)
    {
        rptSys.wrap(value);
        rptSysOffset = offset;
        rptSysLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder rptSysAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(rptSys, value, offset, length);
        rptSysOffset = offset;
        rptSysLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder rptSys(final byte[] value, final int length)
    {
        return rptSys(value, 0, length);
    }

    public TradeCaptureReportAckEncoder rptSys(final byte[] value)
    {
        return rptSys(value, 0, value.length);
    }

    public boolean hasRptSys()
    {
        return rptSysLength > 0;
    }

    public MutableDirectBuffer rptSys()
    {
        return rptSys;
    }

    public String rptSysAsString()
    {
        return rptSys.getStringWithoutLengthAscii(rptSysOffset, rptSysLength);
    }

    public TradeCaptureReportAckEncoder rptSys(final CharSequence value)
    {
        toBytes(value, rptSys);
        rptSysOffset = 0;
        rptSysLength = value.length();
        return this;
    }

    public TradeCaptureReportAckEncoder rptSys(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            rptSys.wrap(buffer);
            rptSysOffset = value.offset();
            rptSysLength = value.length();
        }
        return this;
    }

    public TradeCaptureReportAckEncoder rptSys(final char[] value)
    {
        return rptSys(value, 0, value.length);
    }

    public TradeCaptureReportAckEncoder rptSys(final char[] value, final int length)
    {
        return rptSys(value, 0, length);
    }

    public TradeCaptureReportAckEncoder rptSys(final char[] value, final int offset, final int length)
    {
        toBytes(value, rptSys, offset, length);
        rptSysOffset = 0;
        rptSysLength = length;
        return this;
    }

    private final DecimalFloat grossTradeAmt = new DecimalFloat();

    private boolean hasGrossTradeAmt;

    public boolean hasGrossTradeAmt()
    {
        return hasGrossTradeAmt;
    }

    public TradeCaptureReportAckEncoder grossTradeAmt(DecimalFloat value)
    {
        grossTradeAmt.set(value);
        hasGrossTradeAmt = true;
        return this;
    }

    public TradeCaptureReportAckEncoder grossTradeAmt(long value, int scale)
    {
        grossTradeAmt.set(value, scale);
        hasGrossTradeAmt = true;
        return this;
    }

    public DecimalFloat grossTradeAmt()
    {
        return grossTradeAmt;
    }

    private final MutableDirectBuffer settlDate = new UnsafeBuffer();

    private int settlDateOffset = 0;

    private int settlDateLength = 0;

    public TradeCaptureReportAckEncoder settlDate(final DirectBuffer value, final int offset, final int length)
    {
        settlDate.wrap(value);
        settlDateOffset = offset;
        settlDateLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder settlDate(final DirectBuffer value, final int length)
    {
        return settlDate(value, 0, length);
    }

    public TradeCaptureReportAckEncoder settlDate(final DirectBuffer value)
    {
        return settlDate(value, 0, value.capacity());
    }

    public TradeCaptureReportAckEncoder settlDate(final byte[] value, final int offset, final int length)
    {
        settlDate.wrap(value);
        settlDateOffset = offset;
        settlDateLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder settlDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlDate, value, offset, length);
        settlDateOffset = offset;
        settlDateLength = length;
        return this;
    }

    public TradeCaptureReportAckEncoder settlDate(final byte[] value, final int length)
    {
        return settlDate(value, 0, length);
    }

    public TradeCaptureReportAckEncoder settlDate(final byte[] value)
    {
        return settlDate(value, 0, value.length);
    }

    public boolean hasSettlDate()
    {
        return settlDateLength > 0;
    }

    public MutableDirectBuffer settlDate()
    {
        return settlDate;
    }

    public String settlDateAsString()
    {
        return settlDate.getStringWithoutLengthAscii(settlDateOffset, settlDateLength);
    }

    private final DecimalFloat feeMultiplier = new DecimalFloat();

    private boolean hasFeeMultiplier;

    public boolean hasFeeMultiplier()
    {
        return hasFeeMultiplier;
    }

    public TradeCaptureReportAckEncoder feeMultiplier(DecimalFloat value)
    {
        feeMultiplier.set(value);
        hasFeeMultiplier = true;
        return this;
    }

    public TradeCaptureReportAckEncoder feeMultiplier(long value, int scale)
    {
        feeMultiplier.set(value, scale);
        hasFeeMultiplier = true;
        return this;
    }

    public DecimalFloat feeMultiplier()
    {
        return feeMultiplier;
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

        if (hasTradeHandlingInstr)
        {
            buffer.putBytes(position, tradeHandlingInstrHeader, 0, tradeHandlingInstrHeaderLength);
            position += tradeHandlingInstrHeaderLength;
            position += buffer.putCharAscii(position, tradeHandlingInstr);
            buffer.putSeparator(position);
            position++;
        }

        if (hasOrigTradeHandlingInstr)
        {
            buffer.putBytes(position, origTradeHandlingInstrHeader, 0, origTradeHandlingInstrHeaderLength);
            position += origTradeHandlingInstrHeaderLength;
            position += buffer.putCharAscii(position, origTradeHandlingInstr);
            buffer.putSeparator(position);
            position++;
        }

        if (origTradeDateLength > 0)
        {
            buffer.putBytes(position, origTradeDateHeader, 0, origTradeDateHeaderLength);
            position += origTradeDateHeaderLength;
            buffer.putBytes(position, origTradeDate, origTradeDateOffset, origTradeDateLength);
            position += origTradeDateLength;
            buffer.putSeparator(position);
            position++;
        }

        if (origTradeIDLength > 0)
        {
            buffer.putBytes(position, origTradeIDHeader, 0, origTradeIDHeaderLength);
            position += origTradeIDHeaderLength;
            buffer.putBytes(position, origTradeID, origTradeIDOffset, origTradeIDLength);
            position += origTradeIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (origSecondaryTradeIDLength > 0)
        {
            buffer.putBytes(position, origSecondaryTradeIDHeader, 0, origSecondaryTradeIDHeaderLength);
            position += origSecondaryTradeIDHeaderLength;
            buffer.putBytes(position, origSecondaryTradeID, origSecondaryTradeIDOffset, origSecondaryTradeIDLength);
            position += origSecondaryTradeIDLength;
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

            position += rootParties.encode(buffer, position);

        if (hasExecType)
        {
            buffer.putBytes(position, execTypeHeader, 0, execTypeHeaderLength);
            position += execTypeHeaderLength;
            position += buffer.putCharAscii(position, execType);
            buffer.putSeparator(position);
            position++;
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

        if (hasExecRestatementReason)
        {
            buffer.putBytes(position, execRestatementReasonHeader, 0, execRestatementReasonHeaderLength);
            position += execRestatementReasonHeaderLength;
            position += buffer.putIntAscii(position, execRestatementReason);
            buffer.putSeparator(position);
            position++;
        }

        if (hasPreviouslyReported)
        {
            buffer.putBytes(position, previouslyReportedHeader, 0, previouslyReportedHeaderLength);
            position += previouslyReportedHeaderLength;
            position += buffer.putBooleanAscii(position, previouslyReported);
            buffer.putSeparator(position);
            position++;
        }

        if (hasPriceType)
        {
            buffer.putBytes(position, priceTypeHeader, 0, priceTypeHeaderLength);
            position += priceTypeHeaderLength;
            position += buffer.putIntAscii(position, priceType);
            buffer.putSeparator(position);
            position++;
        }

        if (underlyingTradingSessionIDLength > 0)
        {
            buffer.putBytes(position, underlyingTradingSessionIDHeader, 0, underlyingTradingSessionIDHeaderLength);
            position += underlyingTradingSessionIDHeaderLength;
            buffer.putBytes(position, underlyingTradingSessionID, underlyingTradingSessionIDOffset, underlyingTradingSessionIDLength);
            position += underlyingTradingSessionIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (underlyingTradingSessionSubIDLength > 0)
        {
            buffer.putBytes(position, underlyingTradingSessionSubIDHeader, 0, underlyingTradingSessionSubIDHeaderLength);
            position += underlyingTradingSessionSubIDHeaderLength;
            buffer.putBytes(position, underlyingTradingSessionSubID, underlyingTradingSessionSubIDOffset, underlyingTradingSessionSubIDLength);
            position += underlyingTradingSessionSubIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (settlSessIDLength > 0)
        {
            buffer.putBytes(position, settlSessIDHeader, 0, settlSessIDHeaderLength);
            position += settlSessIDHeaderLength;
            buffer.putBytes(position, settlSessID, settlSessIDOffset, settlSessIDLength);
            position += settlSessIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (settlSessSubIDLength > 0)
        {
            buffer.putBytes(position, settlSessSubIDHeader, 0, settlSessSubIDHeaderLength);
            position += settlSessSubIDHeaderLength;
            buffer.putBytes(position, settlSessSubID, settlSessSubIDOffset, settlSessSubIDLength);
            position += settlSessSubIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasQtyType)
        {
            buffer.putBytes(position, qtyTypeHeader, 0, qtyTypeHeaderLength);
            position += qtyTypeHeaderLength;
            position += buffer.putIntAscii(position, qtyType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasLastQty)
        {
            buffer.putBytes(position, lastQtyHeader, 0, lastQtyHeaderLength);
            position += lastQtyHeaderLength;
            position += buffer.putFloatAscii(position, lastQty);
            buffer.putSeparator(position);
            position++;
        }

        if (hasLastPx)
        {
            buffer.putBytes(position, lastPxHeader, 0, lastPxHeaderLength);
            position += lastPxHeaderLength;
            position += buffer.putFloatAscii(position, lastPx);
            buffer.putSeparator(position);
            position++;
        }

        if (hasVenueType)
        {
            buffer.putBytes(position, venueTypeHeader, 0, venueTypeHeaderLength);
            position += venueTypeHeaderLength;
            position += buffer.putCharAscii(position, venueType);
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

        if (marketIDLength > 0)
        {
            buffer.putBytes(position, marketIDHeader, 0, marketIDHeaderLength);
            position += marketIDHeaderLength;
            buffer.putBytes(position, marketID, marketIDOffset, marketIDLength);
            position += marketIDLength;
            buffer.putSeparator(position);
            position++;
        }

            position += instrument.encode(buffer, position);

        if (hasLastParPx)
        {
            buffer.putBytes(position, lastParPxHeader, 0, lastParPxHeaderLength);
            position += lastParPxHeaderLength;
            position += buffer.putFloatAscii(position, lastParPx);
            buffer.putSeparator(position);
            position++;
        }

        if (hasCalculatedCcyLastQty)
        {
            buffer.putBytes(position, calculatedCcyLastQtyHeader, 0, calculatedCcyLastQtyHeaderLength);
            position += calculatedCcyLastQtyHeaderLength;
            position += buffer.putFloatAscii(position, calculatedCcyLastQty);
            buffer.putSeparator(position);
            position++;
        }

        if (hasLastSwapPoints)
        {
            buffer.putBytes(position, lastSwapPointsHeader, 0, lastSwapPointsHeaderLength);
            position += lastSwapPointsHeaderLength;
            position += buffer.putFloatAscii(position, lastSwapPoints);
            buffer.putSeparator(position);
            position++;
        }

        if (currencyLength > 0)
        {
            buffer.putBytes(position, currencyHeader, 0, currencyHeaderLength);
            position += currencyHeaderLength;
            buffer.putBytes(position, currency, currencyOffset, currencyLength);
            position += currencyLength;
            buffer.putSeparator(position);
            position++;
        }

        if (settlCurrencyLength > 0)
        {
            buffer.putBytes(position, settlCurrencyHeader, 0, settlCurrencyHeaderLength);
            position += settlCurrencyHeaderLength;
            buffer.putBytes(position, settlCurrency, settlCurrencyOffset, settlCurrencyLength);
            position += settlCurrencyLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasLastSpotRate)
        {
            buffer.putBytes(position, lastSpotRateHeader, 0, lastSpotRateHeaderLength);
            position += lastSpotRateHeaderLength;
            position += buffer.putFloatAscii(position, lastSpotRate);
            buffer.putSeparator(position);
            position++;
        }

        if (hasLastForwardPoints)
        {
            buffer.putBytes(position, lastForwardPointsHeader, 0, lastForwardPointsHeaderLength);
            position += lastForwardPointsHeaderLength;
            position += buffer.putFloatAscii(position, lastForwardPoints);
            buffer.putSeparator(position);
            position++;
        }

        if (lastMktLength > 0)
        {
            buffer.putBytes(position, lastMktHeader, 0, lastMktHeaderLength);
            position += lastMktHeaderLength;
            buffer.putBytes(position, lastMkt, lastMktOffset, lastMktLength);
            position += lastMktLength;
            buffer.putSeparator(position);
            position++;
        }

        if (tradeDateLength > 0)
        {
            buffer.putBytes(position, tradeDateHeader, 0, tradeDateHeaderLength);
            position += tradeDateHeaderLength;
            buffer.putBytes(position, tradeDate, tradeDateOffset, tradeDateLength);
            position += tradeDateLength;
            buffer.putSeparator(position);
            position++;
        }

        if (clearingBusinessDateLength > 0)
        {
            buffer.putBytes(position, clearingBusinessDateHeader, 0, clearingBusinessDateHeaderLength);
            position += clearingBusinessDateHeaderLength;
            buffer.putBytes(position, clearingBusinessDate, clearingBusinessDateOffset, clearingBusinessDateLength);
            position += clearingBusinessDateLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasAvgPx)
        {
            buffer.putBytes(position, avgPxHeader, 0, avgPxHeaderLength);
            position += avgPxHeaderLength;
            position += buffer.putFloatAscii(position, avgPx);
            buffer.putSeparator(position);
            position++;
        }

        if (hasAvgPxIndicator)
        {
            buffer.putBytes(position, avgPxIndicatorHeader, 0, avgPxIndicatorHeaderLength);
            position += avgPxIndicatorHeaderLength;
            position += buffer.putIntAscii(position, avgPxIndicator);
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

        if (tradeLegRefIDLength > 0)
        {
            buffer.putBytes(position, tradeLegRefIDHeader, 0, tradeLegRefIDHeaderLength);
            position += tradeLegRefIDHeaderLength;
            buffer.putBytes(position, tradeLegRefID, tradeLegRefIDOffset, tradeLegRefIDLength);
            position += tradeLegRefIDLength;
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

        if (settlTypeLength > 0)
        {
            buffer.putBytes(position, settlTypeHeader, 0, settlTypeHeaderLength);
            position += settlTypeHeaderLength;
            buffer.putBytes(position, settlType, settlTypeOffset, settlTypeLength);
            position += settlTypeLength;
            buffer.putSeparator(position);
            position++;
        }

            position += undInstrmtGrp.encode(buffer, position);

        if (hasMatchStatus)
        {
            buffer.putBytes(position, matchStatusHeader, 0, matchStatusHeaderLength);
            position += matchStatusHeaderLength;
            position += buffer.putCharAscii(position, matchStatus);
            buffer.putSeparator(position);
            position++;
        }

        if (matchTypeLength > 0)
        {
            buffer.putBytes(position, matchTypeHeader, 0, matchTypeHeaderLength);
            position += matchTypeHeaderLength;
            buffer.putBytes(position, matchType, matchTypeOffset, matchTypeLength);
            position += matchTypeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasCopyMsgIndicator)
        {
            buffer.putBytes(position, copyMsgIndicatorHeader, 0, copyMsgIndicatorHeaderLength);
            position += copyMsgIndicatorHeaderLength;
            position += buffer.putBooleanAscii(position, copyMsgIndicator);
            buffer.putSeparator(position);
            position++;
        }

            position += trdRepIndicatorsGrp.encode(buffer, position);

        if (hasPublishTrdIndicator)
        {
            buffer.putBytes(position, publishTrdIndicatorHeader, 0, publishTrdIndicatorHeaderLength);
            position += publishTrdIndicatorHeaderLength;
            position += buffer.putBooleanAscii(position, publishTrdIndicator);
            buffer.putSeparator(position);
            position++;
        }

        if (hasTradePublishIndicator)
        {
            buffer.putBytes(position, tradePublishIndicatorHeader, 0, tradePublishIndicatorHeaderLength);
            position += tradePublishIndicatorHeaderLength;
            position += buffer.putIntAscii(position, tradePublishIndicator);
            buffer.putSeparator(position);
            position++;
        }

        if (hasShortSaleReason)
        {
            buffer.putBytes(position, shortSaleReasonHeader, 0, shortSaleReasonHeaderLength);
            position += shortSaleReasonHeaderLength;
            position += buffer.putIntAscii(position, shortSaleReason);
            buffer.putSeparator(position);
            position++;
        }

            position += trdInstrmtLegGrp.encode(buffer, position);

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

        if (hasAsOfIndicator)
        {
            buffer.putBytes(position, asOfIndicatorHeader, 0, asOfIndicatorHeaderLength);
            position += asOfIndicatorHeaderLength;
            position += buffer.putCharAscii(position, asOfIndicator);
            buffer.putSeparator(position);
            position++;
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

            position += positionAmountData.encode(buffer, position);

        if (tierCodeLength > 0)
        {
            buffer.putBytes(position, tierCodeHeader, 0, tierCodeHeaderLength);
            position += tierCodeHeaderLength;
            buffer.putBytes(position, tierCode, tierCodeOffset, tierCodeLength);
            position += tierCodeLength;
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

        if (lastUpdateTimeLength > 0)
        {
            buffer.putBytes(position, lastUpdateTimeHeader, 0, lastUpdateTimeHeaderLength);
            position += lastUpdateTimeHeaderLength;
            buffer.putBytes(position, lastUpdateTime, lastUpdateTimeOffset, lastUpdateTimeLength);
            position += lastUpdateTimeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasRndPx)
        {
            buffer.putBytes(position, rndPxHeader, 0, rndPxHeaderLength);
            position += rndPxHeaderLength;
            position += buffer.putFloatAscii(position, rndPx);
            buffer.putSeparator(position);
            position++;
        }

            position += trdCapRptAckSideGrp.encode(buffer, position);

        if (rptSysLength > 0)
        {
            buffer.putBytes(position, rptSysHeader, 0, rptSysHeaderLength);
            position += rptSysHeaderLength;
            buffer.putBytes(position, rptSys, rptSysOffset, rptSysLength);
            position += rptSysLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasGrossTradeAmt)
        {
            buffer.putBytes(position, grossTradeAmtHeader, 0, grossTradeAmtHeaderLength);
            position += grossTradeAmtHeaderLength;
            position += buffer.putFloatAscii(position, grossTradeAmt);
            buffer.putSeparator(position);
            position++;
        }

        if (settlDateLength > 0)
        {
            buffer.putBytes(position, settlDateHeader, 0, settlDateHeaderLength);
            position += settlDateHeaderLength;
            buffer.putBytes(position, settlDate, settlDateOffset, settlDateLength);
            position += settlDateLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasFeeMultiplier)
        {
            buffer.putBytes(position, feeMultiplierHeader, 0, feeMultiplierHeaderLength);
            position += feeMultiplierHeaderLength;
            position += buffer.putFloatAscii(position, feeMultiplier);
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
        this.resetTradeReportID();
        this.resetTradeID();
        this.resetSecondaryTradeID();
        this.resetFirmTradeID();
        this.resetSecondaryFirmTradeID();
        this.resetTradeReportTransType();
        this.resetTradeReportType();
        this.resetTrdType();
        this.resetTrdSubType();
        this.resetSecondaryTrdType();
        this.resetTradeHandlingInstr();
        this.resetOrigTradeHandlingInstr();
        this.resetOrigTradeDate();
        this.resetOrigTradeID();
        this.resetOrigSecondaryTradeID();
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
        this.resetExecRestatementReason();
        this.resetPreviouslyReported();
        this.resetPriceType();
        this.resetUnderlyingTradingSessionID();
        this.resetUnderlyingTradingSessionSubID();
        this.resetSettlSessID();
        this.resetSettlSessSubID();
        this.resetQtyType();
        this.resetLastQty();
        this.resetLastPx();
        this.resetVenueType();
        this.resetMarketSegmentID();
        this.resetMarketID();
        this.resetLastParPx();
        this.resetCalculatedCcyLastQty();
        this.resetLastSwapPoints();
        this.resetCurrency();
        this.resetSettlCurrency();
        this.resetLastSpotRate();
        this.resetLastForwardPoints();
        this.resetLastMkt();
        this.resetTradeDate();
        this.resetClearingBusinessDate();
        this.resetAvgPx();
        this.resetAvgPxIndicator();
        this.resetMultiLegReportingType();
        this.resetTradeLegRefID();
        this.resetTransactTime();
        this.resetSettlType();
        this.resetMatchStatus();
        this.resetMatchType();
        this.resetCopyMsgIndicator();
        this.resetPublishTrdIndicator();
        this.resetTradePublishIndicator();
        this.resetShortSaleReason();
        this.resetResponseTransportType();
        this.resetResponseDestination();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        this.resetAsOfIndicator();
        this.resetClearingFeeIndicator();
        this.resetTierCode();
        this.resetMessageEventSource();
        this.resetLastUpdateTime();
        this.resetRndPx();
        this.resetRptSys();
        this.resetGrossTradeAmt();
        this.resetSettlDate();
        this.resetFeeMultiplier();
        rootParties.reset();
        instrument.reset();
        undInstrmtGrp.reset();
        trdRepIndicatorsGrp.reset();
        trdInstrmtLegGrp.reset();
        trdRegTimestamps.reset();
        positionAmountData.reset();
        trdCapRptAckSideGrp.reset();
    }

    public void resetTradeReportID()
    {
        tradeReportIDLength = 0;
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

    public void resetTradeHandlingInstr()
    {
        hasTradeHandlingInstr = false;
    }

    public void resetOrigTradeHandlingInstr()
    {
        hasOrigTradeHandlingInstr = false;
    }

    public void resetOrigTradeDate()
    {
        origTradeDateLength = 0;
    }

    public void resetOrigTradeID()
    {
        origTradeIDLength = 0;
    }

    public void resetOrigSecondaryTradeID()
    {
        origSecondaryTradeIDLength = 0;
    }

    public void resetTransferReason()
    {
        transferReasonLength = 0;
    }

    public void resetExecType()
    {
        hasExecType = false;
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

    public void resetExecRestatementReason()
    {
        hasExecRestatementReason = false;
    }

    public void resetPreviouslyReported()
    {
        hasPreviouslyReported = false;
    }

    public void resetPriceType()
    {
        hasPriceType = false;
    }

    public void resetUnderlyingTradingSessionID()
    {
        underlyingTradingSessionIDLength = 0;
    }

    public void resetUnderlyingTradingSessionSubID()
    {
        underlyingTradingSessionSubIDLength = 0;
    }

    public void resetSettlSessID()
    {
        settlSessIDLength = 0;
    }

    public void resetSettlSessSubID()
    {
        settlSessSubIDLength = 0;
    }

    public void resetQtyType()
    {
        hasQtyType = false;
    }

    public void resetLastQty()
    {
        hasLastQty = false;
    }

    public void resetLastPx()
    {
        hasLastPx = false;
    }

    public void resetVenueType()
    {
        hasVenueType = false;
    }

    public void resetMarketSegmentID()
    {
        marketSegmentIDLength = 0;
    }

    public void resetMarketID()
    {
        marketIDLength = 0;
    }

    public void resetLastParPx()
    {
        hasLastParPx = false;
    }

    public void resetCalculatedCcyLastQty()
    {
        hasCalculatedCcyLastQty = false;
    }

    public void resetLastSwapPoints()
    {
        hasLastSwapPoints = false;
    }

    public void resetCurrency()
    {
        currencyLength = 0;
    }

    public void resetSettlCurrency()
    {
        settlCurrencyLength = 0;
    }

    public void resetLastSpotRate()
    {
        hasLastSpotRate = false;
    }

    public void resetLastForwardPoints()
    {
        hasLastForwardPoints = false;
    }

    public void resetLastMkt()
    {
        lastMktLength = 0;
    }

    public void resetTradeDate()
    {
        tradeDateLength = 0;
    }

    public void resetClearingBusinessDate()
    {
        clearingBusinessDateLength = 0;
    }

    public void resetAvgPx()
    {
        hasAvgPx = false;
    }

    public void resetAvgPxIndicator()
    {
        hasAvgPxIndicator = false;
    }

    public void resetMultiLegReportingType()
    {
        hasMultiLegReportingType = false;
    }

    public void resetTradeLegRefID()
    {
        tradeLegRefIDLength = 0;
    }

    public void resetTransactTime()
    {
        transactTimeLength = 0;
    }

    public void resetSettlType()
    {
        settlTypeLength = 0;
    }

    public void resetMatchStatus()
    {
        hasMatchStatus = false;
    }

    public void resetMatchType()
    {
        matchTypeLength = 0;
    }

    public void resetCopyMsgIndicator()
    {
        hasCopyMsgIndicator = false;
    }

    public void resetPublishTrdIndicator()
    {
        hasPublishTrdIndicator = false;
    }

    public void resetTradePublishIndicator()
    {
        hasTradePublishIndicator = false;
    }

    public void resetShortSaleReason()
    {
        hasShortSaleReason = false;
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

    public void resetAsOfIndicator()
    {
        hasAsOfIndicator = false;
    }

    public void resetClearingFeeIndicator()
    {
        clearingFeeIndicatorLength = 0;
    }

    public void resetTierCode()
    {
        tierCodeLength = 0;
    }

    public void resetMessageEventSource()
    {
        messageEventSourceLength = 0;
    }

    public void resetLastUpdateTime()
    {
        lastUpdateTimeLength = 0;
    }

    public void resetRndPx()
    {
        hasRndPx = false;
    }

    public void resetRptSys()
    {
        rptSysLength = 0;
    }

    public void resetGrossTradeAmt()
    {
        hasGrossTradeAmt = false;
    }

    public void resetSettlDate()
    {
        settlDateLength = 0;
    }

    public void resetFeeMultiplier()
    {
        hasFeeMultiplier = false;
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

        if (hasTradeHandlingInstr())
        {
            indent(builder, level);
            builder.append("\"TradeHandlingInstr\": \"");
            builder.append(tradeHandlingInstr);
            builder.append("\",\n");
        }

        if (hasOrigTradeHandlingInstr())
        {
            indent(builder, level);
            builder.append("\"OrigTradeHandlingInstr\": \"");
            builder.append(origTradeHandlingInstr);
            builder.append("\",\n");
        }

        if (hasOrigTradeDate())
        {
            indent(builder, level);
            builder.append("\"OrigTradeDate\": \"");
            appendBuffer(builder, origTradeDate, origTradeDateOffset, origTradeDateLength);
            builder.append("\",\n");
        }

        if (hasOrigTradeID())
        {
            indent(builder, level);
            builder.append("\"OrigTradeID\": \"");
            appendBuffer(builder, origTradeID, origTradeIDOffset, origTradeIDLength);
            builder.append("\",\n");
        }

        if (hasOrigSecondaryTradeID())
        {
            indent(builder, level);
            builder.append("\"OrigSecondaryTradeID\": \"");
            appendBuffer(builder, origSecondaryTradeID, origSecondaryTradeIDOffset, origSecondaryTradeIDLength);
            builder.append("\",\n");
        }

        if (hasTransferReason())
        {
            indent(builder, level);
            builder.append("\"TransferReason\": \"");
            appendBuffer(builder, transferReason, transferReasonOffset, transferReasonLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"RootParties\": ");
    rootParties.appendTo(builder, level + 1);
    builder.append("\n");

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

        if (hasExecRestatementReason())
        {
            indent(builder, level);
            builder.append("\"ExecRestatementReason\": \"");
            builder.append(execRestatementReason);
            builder.append("\",\n");
        }

        if (hasPreviouslyReported())
        {
            indent(builder, level);
            builder.append("\"PreviouslyReported\": \"");
            builder.append(previouslyReported);
            builder.append("\",\n");
        }

        if (hasPriceType())
        {
            indent(builder, level);
            builder.append("\"PriceType\": \"");
            builder.append(priceType);
            builder.append("\",\n");
        }

        if (hasUnderlyingTradingSessionID())
        {
            indent(builder, level);
            builder.append("\"UnderlyingTradingSessionID\": \"");
            appendBuffer(builder, underlyingTradingSessionID, underlyingTradingSessionIDOffset, underlyingTradingSessionIDLength);
            builder.append("\",\n");
        }

        if (hasUnderlyingTradingSessionSubID())
        {
            indent(builder, level);
            builder.append("\"UnderlyingTradingSessionSubID\": \"");
            appendBuffer(builder, underlyingTradingSessionSubID, underlyingTradingSessionSubIDOffset, underlyingTradingSessionSubIDLength);
            builder.append("\",\n");
        }

        if (hasSettlSessID())
        {
            indent(builder, level);
            builder.append("\"SettlSessID\": \"");
            appendBuffer(builder, settlSessID, settlSessIDOffset, settlSessIDLength);
            builder.append("\",\n");
        }

        if (hasSettlSessSubID())
        {
            indent(builder, level);
            builder.append("\"SettlSessSubID\": \"");
            appendBuffer(builder, settlSessSubID, settlSessSubIDOffset, settlSessSubIDLength);
            builder.append("\",\n");
        }

        if (hasQtyType())
        {
            indent(builder, level);
            builder.append("\"QtyType\": \"");
            builder.append(qtyType);
            builder.append("\",\n");
        }

        if (hasLastQty())
        {
            indent(builder, level);
            builder.append("\"LastQty\": \"");
            lastQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasLastPx())
        {
            indent(builder, level);
            builder.append("\"LastPx\": \"");
            lastPx.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasVenueType())
        {
            indent(builder, level);
            builder.append("\"VenueType\": \"");
            builder.append(venueType);
            builder.append("\",\n");
        }

        if (hasMarketSegmentID())
        {
            indent(builder, level);
            builder.append("\"MarketSegmentID\": \"");
            appendBuffer(builder, marketSegmentID, marketSegmentIDOffset, marketSegmentIDLength);
            builder.append("\",\n");
        }

        if (hasMarketID())
        {
            indent(builder, level);
            builder.append("\"MarketID\": \"");
            appendBuffer(builder, marketID, marketIDOffset, marketIDLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"Instrument\": ");
    instrument.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasLastParPx())
        {
            indent(builder, level);
            builder.append("\"LastParPx\": \"");
            lastParPx.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasCalculatedCcyLastQty())
        {
            indent(builder, level);
            builder.append("\"CalculatedCcyLastQty\": \"");
            calculatedCcyLastQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasLastSwapPoints())
        {
            indent(builder, level);
            builder.append("\"LastSwapPoints\": \"");
            lastSwapPoints.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasCurrency())
        {
            indent(builder, level);
            builder.append("\"Currency\": \"");
            appendBuffer(builder, currency, currencyOffset, currencyLength);
            builder.append("\",\n");
        }

        if (hasSettlCurrency())
        {
            indent(builder, level);
            builder.append("\"SettlCurrency\": \"");
            appendBuffer(builder, settlCurrency, settlCurrencyOffset, settlCurrencyLength);
            builder.append("\",\n");
        }

        if (hasLastSpotRate())
        {
            indent(builder, level);
            builder.append("\"LastSpotRate\": \"");
            lastSpotRate.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasLastForwardPoints())
        {
            indent(builder, level);
            builder.append("\"LastForwardPoints\": \"");
            lastForwardPoints.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasLastMkt())
        {
            indent(builder, level);
            builder.append("\"LastMkt\": \"");
            appendBuffer(builder, lastMkt, lastMktOffset, lastMktLength);
            builder.append("\",\n");
        }

        if (hasTradeDate())
        {
            indent(builder, level);
            builder.append("\"TradeDate\": \"");
            appendBuffer(builder, tradeDate, tradeDateOffset, tradeDateLength);
            builder.append("\",\n");
        }

        if (hasClearingBusinessDate())
        {
            indent(builder, level);
            builder.append("\"ClearingBusinessDate\": \"");
            appendBuffer(builder, clearingBusinessDate, clearingBusinessDateOffset, clearingBusinessDateLength);
            builder.append("\",\n");
        }

        if (hasAvgPx())
        {
            indent(builder, level);
            builder.append("\"AvgPx\": \"");
            avgPx.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasAvgPxIndicator())
        {
            indent(builder, level);
            builder.append("\"AvgPxIndicator\": \"");
            builder.append(avgPxIndicator);
            builder.append("\",\n");
        }

        if (hasMultiLegReportingType())
        {
            indent(builder, level);
            builder.append("\"MultiLegReportingType\": \"");
            builder.append(multiLegReportingType);
            builder.append("\",\n");
        }

        if (hasTradeLegRefID())
        {
            indent(builder, level);
            builder.append("\"TradeLegRefID\": \"");
            appendBuffer(builder, tradeLegRefID, tradeLegRefIDOffset, tradeLegRefIDLength);
            builder.append("\",\n");
        }

        if (hasTransactTime())
        {
            indent(builder, level);
            builder.append("\"TransactTime\": \"");
            appendBuffer(builder, transactTime, transactTimeOffset, transactTimeLength);
            builder.append("\",\n");
        }

        if (hasSettlType())
        {
            indent(builder, level);
            builder.append("\"SettlType\": \"");
            appendBuffer(builder, settlType, settlTypeOffset, settlTypeLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"UndInstrmtGrp\": ");
    undInstrmtGrp.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasMatchStatus())
        {
            indent(builder, level);
            builder.append("\"MatchStatus\": \"");
            builder.append(matchStatus);
            builder.append("\",\n");
        }

        if (hasMatchType())
        {
            indent(builder, level);
            builder.append("\"MatchType\": \"");
            appendBuffer(builder, matchType, matchTypeOffset, matchTypeLength);
            builder.append("\",\n");
        }

        if (hasCopyMsgIndicator())
        {
            indent(builder, level);
            builder.append("\"CopyMsgIndicator\": \"");
            builder.append(copyMsgIndicator);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"TrdRepIndicatorsGrp\": ");
    trdRepIndicatorsGrp.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasPublishTrdIndicator())
        {
            indent(builder, level);
            builder.append("\"PublishTrdIndicator\": \"");
            builder.append(publishTrdIndicator);
            builder.append("\",\n");
        }

        if (hasTradePublishIndicator())
        {
            indent(builder, level);
            builder.append("\"TradePublishIndicator\": \"");
            builder.append(tradePublishIndicator);
            builder.append("\",\n");
        }

        if (hasShortSaleReason())
        {
            indent(builder, level);
            builder.append("\"ShortSaleReason\": \"");
            builder.append(shortSaleReason);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"TrdInstrmtLegGrp\": ");
    trdInstrmtLegGrp.appendTo(builder, level + 1);
    builder.append("\n");

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

        if (hasAsOfIndicator())
        {
            indent(builder, level);
            builder.append("\"AsOfIndicator\": \"");
            builder.append(asOfIndicator);
            builder.append("\",\n");
        }

        if (hasClearingFeeIndicator())
        {
            indent(builder, level);
            builder.append("\"ClearingFeeIndicator\": \"");
            appendBuffer(builder, clearingFeeIndicator, clearingFeeIndicatorOffset, clearingFeeIndicatorLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"PositionAmountData\": ");
    positionAmountData.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasTierCode())
        {
            indent(builder, level);
            builder.append("\"TierCode\": \"");
            appendBuffer(builder, tierCode, tierCodeOffset, tierCodeLength);
            builder.append("\",\n");
        }

        if (hasMessageEventSource())
        {
            indent(builder, level);
            builder.append("\"MessageEventSource\": \"");
            appendBuffer(builder, messageEventSource, messageEventSourceOffset, messageEventSourceLength);
            builder.append("\",\n");
        }

        if (hasLastUpdateTime())
        {
            indent(builder, level);
            builder.append("\"LastUpdateTime\": \"");
            appendBuffer(builder, lastUpdateTime, lastUpdateTimeOffset, lastUpdateTimeLength);
            builder.append("\",\n");
        }

        if (hasRndPx())
        {
            indent(builder, level);
            builder.append("\"RndPx\": \"");
            rndPx.appendTo(builder);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"TrdCapRptAckSideGrp\": ");
    trdCapRptAckSideGrp.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasRptSys())
        {
            indent(builder, level);
            builder.append("\"RptSys\": \"");
            appendBuffer(builder, rptSys, rptSysOffset, rptSysLength);
            builder.append("\",\n");
        }

        if (hasGrossTradeAmt())
        {
            indent(builder, level);
            builder.append("\"GrossTradeAmt\": \"");
            grossTradeAmt.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasSettlDate())
        {
            indent(builder, level);
            builder.append("\"SettlDate\": \"");
            appendBuffer(builder, settlDate, settlDateOffset, settlDateLength);
            builder.append("\",\n");
        }

        if (hasFeeMultiplier())
        {
            indent(builder, level);
            builder.append("\"FeeMultiplier\": \"");
            feeMultiplier.appendTo(builder);
            builder.append("\",\n");
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

        if (hasTradeHandlingInstr())
        {
            encoder.tradeHandlingInstr(this.tradeHandlingInstr());
        }

        if (hasOrigTradeHandlingInstr())
        {
            encoder.origTradeHandlingInstr(this.origTradeHandlingInstr());
        }

        if (hasOrigTradeDate())
        {
            encoder.origTradeDateAsCopy(origTradeDate.byteArray(), 0, origTradeDateLength);
        }

        if (hasOrigTradeID())
        {
            encoder.origTradeIDAsCopy(origTradeID.byteArray(), 0, origTradeIDLength);
        }

        if (hasOrigSecondaryTradeID())
        {
            encoder.origSecondaryTradeIDAsCopy(origSecondaryTradeID.byteArray(), 0, origSecondaryTradeIDLength);
        }

        if (hasTransferReason())
        {
            encoder.transferReasonAsCopy(transferReason.byteArray(), 0, transferReasonLength);
        }


        rootParties.copyTo(encoder.rootParties());
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

        if (hasExecRestatementReason())
        {
            encoder.execRestatementReason(this.execRestatementReason());
        }

        if (hasPreviouslyReported())
        {
            encoder.previouslyReported(this.previouslyReported());
        }

        if (hasPriceType())
        {
            encoder.priceType(this.priceType());
        }

        if (hasUnderlyingTradingSessionID())
        {
            encoder.underlyingTradingSessionIDAsCopy(underlyingTradingSessionID.byteArray(), 0, underlyingTradingSessionIDLength);
        }

        if (hasUnderlyingTradingSessionSubID())
        {
            encoder.underlyingTradingSessionSubIDAsCopy(underlyingTradingSessionSubID.byteArray(), 0, underlyingTradingSessionSubIDLength);
        }

        if (hasSettlSessID())
        {
            encoder.settlSessIDAsCopy(settlSessID.byteArray(), 0, settlSessIDLength);
        }

        if (hasSettlSessSubID())
        {
            encoder.settlSessSubIDAsCopy(settlSessSubID.byteArray(), 0, settlSessSubIDLength);
        }

        if (hasQtyType())
        {
            encoder.qtyType(this.qtyType());
        }

        if (hasLastQty())
        {
            encoder.lastQty(this.lastQty());
        }

        if (hasLastPx())
        {
            encoder.lastPx(this.lastPx());
        }

        if (hasVenueType())
        {
            encoder.venueType(this.venueType());
        }

        if (hasMarketSegmentID())
        {
            encoder.marketSegmentIDAsCopy(marketSegmentID.byteArray(), 0, marketSegmentIDLength);
        }

        if (hasMarketID())
        {
            encoder.marketIDAsCopy(marketID.byteArray(), 0, marketIDLength);
        }


        instrument.copyTo(encoder.instrument());
        if (hasLastParPx())
        {
            encoder.lastParPx(this.lastParPx());
        }

        if (hasCalculatedCcyLastQty())
        {
            encoder.calculatedCcyLastQty(this.calculatedCcyLastQty());
        }

        if (hasLastSwapPoints())
        {
            encoder.lastSwapPoints(this.lastSwapPoints());
        }

        if (hasCurrency())
        {
            encoder.currencyAsCopy(currency.byteArray(), 0, currencyLength);
        }

        if (hasSettlCurrency())
        {
            encoder.settlCurrencyAsCopy(settlCurrency.byteArray(), 0, settlCurrencyLength);
        }

        if (hasLastSpotRate())
        {
            encoder.lastSpotRate(this.lastSpotRate());
        }

        if (hasLastForwardPoints())
        {
            encoder.lastForwardPoints(this.lastForwardPoints());
        }

        if (hasLastMkt())
        {
            encoder.lastMktAsCopy(lastMkt.byteArray(), 0, lastMktLength);
        }

        if (hasTradeDate())
        {
            encoder.tradeDateAsCopy(tradeDate.byteArray(), 0, tradeDateLength);
        }

        if (hasClearingBusinessDate())
        {
            encoder.clearingBusinessDateAsCopy(clearingBusinessDate.byteArray(), 0, clearingBusinessDateLength);
        }

        if (hasAvgPx())
        {
            encoder.avgPx(this.avgPx());
        }

        if (hasAvgPxIndicator())
        {
            encoder.avgPxIndicator(this.avgPxIndicator());
        }

        if (hasMultiLegReportingType())
        {
            encoder.multiLegReportingType(this.multiLegReportingType());
        }

        if (hasTradeLegRefID())
        {
            encoder.tradeLegRefIDAsCopy(tradeLegRefID.byteArray(), 0, tradeLegRefIDLength);
        }

        if (hasTransactTime())
        {
            encoder.transactTimeAsCopy(transactTime.byteArray(), 0, transactTimeLength);
        }

        if (hasSettlType())
        {
            encoder.settlTypeAsCopy(settlType.byteArray(), 0, settlTypeLength);
        }


        undInstrmtGrp.copyTo(encoder.undInstrmtGrp());
        if (hasMatchStatus())
        {
            encoder.matchStatus(this.matchStatus());
        }

        if (hasMatchType())
        {
            encoder.matchTypeAsCopy(matchType.byteArray(), 0, matchTypeLength);
        }

        if (hasCopyMsgIndicator())
        {
            encoder.copyMsgIndicator(this.copyMsgIndicator());
        }


        trdRepIndicatorsGrp.copyTo(encoder.trdRepIndicatorsGrp());
        if (hasPublishTrdIndicator())
        {
            encoder.publishTrdIndicator(this.publishTrdIndicator());
        }

        if (hasTradePublishIndicator())
        {
            encoder.tradePublishIndicator(this.tradePublishIndicator());
        }

        if (hasShortSaleReason())
        {
            encoder.shortSaleReason(this.shortSaleReason());
        }


        trdInstrmtLegGrp.copyTo(encoder.trdInstrmtLegGrp());

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

        if (hasAsOfIndicator())
        {
            encoder.asOfIndicator(this.asOfIndicator());
        }

        if (hasClearingFeeIndicator())
        {
            encoder.clearingFeeIndicatorAsCopy(clearingFeeIndicator.byteArray(), 0, clearingFeeIndicatorLength);
        }


        positionAmountData.copyTo(encoder.positionAmountData());
        if (hasTierCode())
        {
            encoder.tierCodeAsCopy(tierCode.byteArray(), 0, tierCodeLength);
        }

        if (hasMessageEventSource())
        {
            encoder.messageEventSourceAsCopy(messageEventSource.byteArray(), 0, messageEventSourceLength);
        }

        if (hasLastUpdateTime())
        {
            encoder.lastUpdateTimeAsCopy(lastUpdateTime.byteArray(), 0, lastUpdateTimeLength);
        }

        if (hasRndPx())
        {
            encoder.rndPx(this.rndPx());
        }


        trdCapRptAckSideGrp.copyTo(encoder.trdCapRptAckSideGrp());
        if (hasRptSys())
        {
            encoder.rptSysAsCopy(rptSys.byteArray(), 0, rptSysLength);
        }

        if (hasGrossTradeAmt())
        {
            encoder.grossTradeAmt(this.grossTradeAmt());
        }

        if (hasSettlDate())
        {
            encoder.settlDateAsCopy(settlDate.byteArray(), 0, settlDateLength);
        }

        if (hasFeeMultiplier())
        {
            encoder.feeMultiplier(this.feeMultiplier());
        }
        return encoder;
    }

}
