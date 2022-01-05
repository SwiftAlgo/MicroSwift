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


public class TradeCaptureReportEncoder implements Encoder
{
    public long messageType()
    {
        return 17729L;
    }

    public TradeCaptureReportEncoder()
    {
        header.msgType("AE");
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

    private static final int trdRptStatusHeaderLength = 4;
    private static final byte[] trdRptStatusHeader = new byte[] {57, 51, 57, (byte) '='};

    private static final int tradeRequestIDHeaderLength = 4;
    private static final byte[] tradeRequestIDHeader = new byte[] {53, 54, 56, (byte) '='};

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

    private static final int totNumTradeReportsHeaderLength = 4;
    private static final byte[] totNumTradeReportsHeader = new byte[] {55, 52, 56, (byte) '='};

    private static final int lastRptRequestedHeaderLength = 4;
    private static final byte[] lastRptRequestedHeader = new byte[] {57, 49, 50, (byte) '='};

    private static final int unsolicitedIndicatorHeaderLength = 4;
    private static final byte[] unsolicitedIndicatorHeader = new byte[] {51, 50, 53, (byte) '='};

    private static final int subscriptionRequestTypeHeaderLength = 4;
    private static final byte[] subscriptionRequestTypeHeader = new byte[] {50, 54, 51, (byte) '='};

    private static final int tradeReportRefIDHeaderLength = 4;
    private static final byte[] tradeReportRefIDHeader = new byte[] {53, 55, 50, (byte) '='};

    private static final int secondaryTradeReportRefIDHeaderLength = 4;
    private static final byte[] secondaryTradeReportRefIDHeader = new byte[] {56, 56, 49, (byte) '='};

    private static final int secondaryTradeReportIDHeaderLength = 4;
    private static final byte[] secondaryTradeReportIDHeader = new byte[] {56, 49, 56, (byte) '='};

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

    private static final int asOfIndicatorHeaderLength = 5;
    private static final byte[] asOfIndicatorHeader = new byte[] {49, 48, 49, 53, (byte) '='};

    private static final int settlSessIDHeaderLength = 4;
    private static final byte[] settlSessIDHeader = new byte[] {55, 49, 54, (byte) '='};

    private static final int settlSessSubIDHeaderLength = 4;
    private static final byte[] settlSessSubIDHeader = new byte[] {55, 49, 55, (byte) '='};

    private static final int venueTypeHeaderLength = 5;
    private static final byte[] venueTypeHeader = new byte[] {49, 52, 51, 48, (byte) '='};

    private static final int marketSegmentIDHeaderLength = 5;
    private static final byte[] marketSegmentIDHeader = new byte[] {49, 51, 48, 48, (byte) '='};

    private static final int marketIDHeaderLength = 5;
    private static final byte[] marketIDHeader = new byte[] {49, 51, 48, 49, (byte) '='};

    private static final int qtyTypeHeaderLength = 4;
    private static final byte[] qtyTypeHeader = new byte[] {56, 53, 52, (byte) '='};

    private static final int underlyingTradingSessionIDHeaderLength = 4;
    private static final byte[] underlyingTradingSessionIDHeader = new byte[] {56, 50, 50, (byte) '='};

    private static final int underlyingTradingSessionSubIDHeaderLength = 4;
    private static final byte[] underlyingTradingSessionSubIDHeader = new byte[] {56, 50, 51, (byte) '='};

    private static final int lastQtyHeaderLength = 3;
    private static final byte[] lastQtyHeader = new byte[] {51, 50, (byte) '='};

    private static final int lastPxHeaderLength = 3;
    private static final byte[] lastPxHeader = new byte[] {51, 49, (byte) '='};

    private static final int calculatedCcyLastQtyHeaderLength = 5;
    private static final byte[] calculatedCcyLastQtyHeader = new byte[] {49, 48, 53, 54, (byte) '='};

    private static final int currencyHeaderLength = 3;
    private static final byte[] currencyHeader = new byte[] {49, 53, (byte) '='};

    private static final int settlCurrencyHeaderLength = 4;
    private static final byte[] settlCurrencyHeader = new byte[] {49, 50, 48, (byte) '='};

    private static final int lastParPxHeaderLength = 4;
    private static final byte[] lastParPxHeader = new byte[] {54, 54, 57, (byte) '='};

    private static final int lastSpotRateHeaderLength = 4;
    private static final byte[] lastSpotRateHeader = new byte[] {49, 57, 52, (byte) '='};

    private static final int lastForwardPointsHeaderLength = 4;
    private static final byte[] lastForwardPointsHeader = new byte[] {49, 57, 53, (byte) '='};

    private static final int lastSwapPointsHeaderLength = 5;
    private static final byte[] lastSwapPointsHeader = new byte[] {49, 48, 55, 49, (byte) '='};

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

    private static final int settlDateHeaderLength = 3;
    private static final byte[] settlDateHeader = new byte[] {54, 52, (byte) '='};

    private static final int underlyingSettlementDateHeaderLength = 4;
    private static final byte[] underlyingSettlementDateHeader = new byte[] {57, 56, 55, (byte) '='};

    private static final int matchStatusHeaderLength = 4;
    private static final byte[] matchStatusHeader = new byte[] {53, 55, 51, (byte) '='};

    private static final int matchTypeHeaderLength = 4;
    private static final byte[] matchTypeHeader = new byte[] {53, 55, 52, (byte) '='};

    private static final int volatilityHeaderLength = 5;
    private static final byte[] volatilityHeader = new byte[] {49, 49, 56, 56, (byte) '='};

    private static final int dividendYieldHeaderLength = 5;
    private static final byte[] dividendYieldHeader = new byte[] {49, 51, 56, 48, (byte) '='};

    private static final int riskFreeRateHeaderLength = 5;
    private static final byte[] riskFreeRateHeader = new byte[] {49, 49, 57, 48, (byte) '='};

    private static final int currencyRatioHeaderLength = 5;
    private static final byte[] currencyRatioHeader = new byte[] {49, 51, 56, 50, (byte) '='};

    private static final int copyMsgIndicatorHeaderLength = 4;
    private static final byte[] copyMsgIndicatorHeader = new byte[] {55, 57, 55, (byte) '='};

    private static final int publishTrdIndicatorHeaderLength = 4;
    private static final byte[] publishTrdIndicatorHeader = new byte[] {56, 53, 50, (byte) '='};

    private static final int tradePublishIndicatorHeaderLength = 5;
    private static final byte[] tradePublishIndicatorHeader = new byte[] {49, 51, 57, 48, (byte) '='};

    private static final int shortSaleReasonHeaderLength = 4;
    private static final byte[] shortSaleReasonHeader = new byte[] {56, 53, 51, (byte) '='};

    private static final int tierCodeHeaderLength = 4;
    private static final byte[] tierCodeHeader = new byte[] {57, 57, 52, (byte) '='};

    private static final int messageEventSourceHeaderLength = 5;
    private static final byte[] messageEventSourceHeader = new byte[] {49, 48, 49, 49, (byte) '='};

    private static final int lastUpdateTimeHeaderLength = 4;
    private static final byte[] lastUpdateTimeHeader = new byte[] {55, 55, 57, (byte) '='};

    private static final int rndPxHeaderLength = 4;
    private static final byte[] rndPxHeader = new byte[] {57, 57, 49, (byte) '='};

    private static final int tZTransactTimeHeaderLength = 5;
    private static final byte[] tZTransactTimeHeader = new byte[] {49, 49, 51, 50, (byte) '='};

    private static final int reportedPxDiffHeaderLength = 5;
    private static final byte[] reportedPxDiffHeader = new byte[] {49, 49, 51, 52, (byte) '='};

    private static final int grossTradeAmtHeaderLength = 4;
    private static final byte[] grossTradeAmtHeader = new byte[] {51, 56, 49, (byte) '='};

    private static final int rejectTextHeaderLength = 5;
    private static final byte[] rejectTextHeader = new byte[] {49, 51, 50, 56, (byte) '='};

    private static final int feeMultiplierHeaderLength = 5;
    private static final byte[] feeMultiplierHeader = new byte[] {49, 51, 50, 57, (byte) '='};

    private final ApplicationSequenceControlEncoder applicationSequenceControl = new ApplicationSequenceControlEncoder();
    public ApplicationSequenceControlEncoder applicationSequenceControl()
    {
        return applicationSequenceControl;
    }

    private final MutableDirectBuffer tradeReportID = new UnsafeBuffer();

    private int tradeReportIDOffset = 0;

    private int tradeReportIDLength = 0;

    public TradeCaptureReportEncoder tradeReportID(final DirectBuffer value, final int offset, final int length)
    {
        tradeReportID.wrap(value);
        tradeReportIDOffset = offset;
        tradeReportIDLength = length;
        return this;
    }

    public TradeCaptureReportEncoder tradeReportID(final DirectBuffer value, final int length)
    {
        return tradeReportID(value, 0, length);
    }

    public TradeCaptureReportEncoder tradeReportID(final DirectBuffer value)
    {
        return tradeReportID(value, 0, value.capacity());
    }

    public TradeCaptureReportEncoder tradeReportID(final byte[] value, final int offset, final int length)
    {
        tradeReportID.wrap(value);
        tradeReportIDOffset = offset;
        tradeReportIDLength = length;
        return this;
    }

    public TradeCaptureReportEncoder tradeReportIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradeReportID, value, offset, length);
        tradeReportIDOffset = offset;
        tradeReportIDLength = length;
        return this;
    }

    public TradeCaptureReportEncoder tradeReportID(final byte[] value, final int length)
    {
        return tradeReportID(value, 0, length);
    }

    public TradeCaptureReportEncoder tradeReportID(final byte[] value)
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

    public TradeCaptureReportEncoder tradeReportID(final CharSequence value)
    {
        toBytes(value, tradeReportID);
        tradeReportIDOffset = 0;
        tradeReportIDLength = value.length();
        return this;
    }

    public TradeCaptureReportEncoder tradeReportID(final AsciiSequenceView value)
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

    public TradeCaptureReportEncoder tradeReportID(final char[] value)
    {
        return tradeReportID(value, 0, value.length);
    }

    public TradeCaptureReportEncoder tradeReportID(final char[] value, final int length)
    {
        return tradeReportID(value, 0, length);
    }

    public TradeCaptureReportEncoder tradeReportID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradeReportID, offset, length);
        tradeReportIDOffset = 0;
        tradeReportIDLength = length;
        return this;
    }

    private final MutableDirectBuffer tradeID = new UnsafeBuffer();

    private int tradeIDOffset = 0;

    private int tradeIDLength = 0;

    public TradeCaptureReportEncoder tradeID(final DirectBuffer value, final int offset, final int length)
    {
        tradeID.wrap(value);
        tradeIDOffset = offset;
        tradeIDLength = length;
        return this;
    }

    public TradeCaptureReportEncoder tradeID(final DirectBuffer value, final int length)
    {
        return tradeID(value, 0, length);
    }

    public TradeCaptureReportEncoder tradeID(final DirectBuffer value)
    {
        return tradeID(value, 0, value.capacity());
    }

    public TradeCaptureReportEncoder tradeID(final byte[] value, final int offset, final int length)
    {
        tradeID.wrap(value);
        tradeIDOffset = offset;
        tradeIDLength = length;
        return this;
    }

    public TradeCaptureReportEncoder tradeIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradeID, value, offset, length);
        tradeIDOffset = offset;
        tradeIDLength = length;
        return this;
    }

    public TradeCaptureReportEncoder tradeID(final byte[] value, final int length)
    {
        return tradeID(value, 0, length);
    }

    public TradeCaptureReportEncoder tradeID(final byte[] value)
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

    public TradeCaptureReportEncoder tradeID(final CharSequence value)
    {
        toBytes(value, tradeID);
        tradeIDOffset = 0;
        tradeIDLength = value.length();
        return this;
    }

    public TradeCaptureReportEncoder tradeID(final AsciiSequenceView value)
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

    public TradeCaptureReportEncoder tradeID(final char[] value)
    {
        return tradeID(value, 0, value.length);
    }

    public TradeCaptureReportEncoder tradeID(final char[] value, final int length)
    {
        return tradeID(value, 0, length);
    }

    public TradeCaptureReportEncoder tradeID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradeID, offset, length);
        tradeIDOffset = 0;
        tradeIDLength = length;
        return this;
    }

    private final MutableDirectBuffer secondaryTradeID = new UnsafeBuffer();

    private int secondaryTradeIDOffset = 0;

    private int secondaryTradeIDLength = 0;

    public TradeCaptureReportEncoder secondaryTradeID(final DirectBuffer value, final int offset, final int length)
    {
        secondaryTradeID.wrap(value);
        secondaryTradeIDOffset = offset;
        secondaryTradeIDLength = length;
        return this;
    }

    public TradeCaptureReportEncoder secondaryTradeID(final DirectBuffer value, final int length)
    {
        return secondaryTradeID(value, 0, length);
    }

    public TradeCaptureReportEncoder secondaryTradeID(final DirectBuffer value)
    {
        return secondaryTradeID(value, 0, value.capacity());
    }

    public TradeCaptureReportEncoder secondaryTradeID(final byte[] value, final int offset, final int length)
    {
        secondaryTradeID.wrap(value);
        secondaryTradeIDOffset = offset;
        secondaryTradeIDLength = length;
        return this;
    }

    public TradeCaptureReportEncoder secondaryTradeIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(secondaryTradeID, value, offset, length);
        secondaryTradeIDOffset = offset;
        secondaryTradeIDLength = length;
        return this;
    }

    public TradeCaptureReportEncoder secondaryTradeID(final byte[] value, final int length)
    {
        return secondaryTradeID(value, 0, length);
    }

    public TradeCaptureReportEncoder secondaryTradeID(final byte[] value)
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

    public TradeCaptureReportEncoder secondaryTradeID(final CharSequence value)
    {
        toBytes(value, secondaryTradeID);
        secondaryTradeIDOffset = 0;
        secondaryTradeIDLength = value.length();
        return this;
    }

    public TradeCaptureReportEncoder secondaryTradeID(final AsciiSequenceView value)
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

    public TradeCaptureReportEncoder secondaryTradeID(final char[] value)
    {
        return secondaryTradeID(value, 0, value.length);
    }

    public TradeCaptureReportEncoder secondaryTradeID(final char[] value, final int length)
    {
        return secondaryTradeID(value, 0, length);
    }

    public TradeCaptureReportEncoder secondaryTradeID(final char[] value, final int offset, final int length)
    {
        toBytes(value, secondaryTradeID, offset, length);
        secondaryTradeIDOffset = 0;
        secondaryTradeIDLength = length;
        return this;
    }

    private final MutableDirectBuffer firmTradeID = new UnsafeBuffer();

    private int firmTradeIDOffset = 0;

    private int firmTradeIDLength = 0;

    public TradeCaptureReportEncoder firmTradeID(final DirectBuffer value, final int offset, final int length)
    {
        firmTradeID.wrap(value);
        firmTradeIDOffset = offset;
        firmTradeIDLength = length;
        return this;
    }

    public TradeCaptureReportEncoder firmTradeID(final DirectBuffer value, final int length)
    {
        return firmTradeID(value, 0, length);
    }

    public TradeCaptureReportEncoder firmTradeID(final DirectBuffer value)
    {
        return firmTradeID(value, 0, value.capacity());
    }

    public TradeCaptureReportEncoder firmTradeID(final byte[] value, final int offset, final int length)
    {
        firmTradeID.wrap(value);
        firmTradeIDOffset = offset;
        firmTradeIDLength = length;
        return this;
    }

    public TradeCaptureReportEncoder firmTradeIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(firmTradeID, value, offset, length);
        firmTradeIDOffset = offset;
        firmTradeIDLength = length;
        return this;
    }

    public TradeCaptureReportEncoder firmTradeID(final byte[] value, final int length)
    {
        return firmTradeID(value, 0, length);
    }

    public TradeCaptureReportEncoder firmTradeID(final byte[] value)
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

    public TradeCaptureReportEncoder firmTradeID(final CharSequence value)
    {
        toBytes(value, firmTradeID);
        firmTradeIDOffset = 0;
        firmTradeIDLength = value.length();
        return this;
    }

    public TradeCaptureReportEncoder firmTradeID(final AsciiSequenceView value)
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

    public TradeCaptureReportEncoder firmTradeID(final char[] value)
    {
        return firmTradeID(value, 0, value.length);
    }

    public TradeCaptureReportEncoder firmTradeID(final char[] value, final int length)
    {
        return firmTradeID(value, 0, length);
    }

    public TradeCaptureReportEncoder firmTradeID(final char[] value, final int offset, final int length)
    {
        toBytes(value, firmTradeID, offset, length);
        firmTradeIDOffset = 0;
        firmTradeIDLength = length;
        return this;
    }

    private final MutableDirectBuffer secondaryFirmTradeID = new UnsafeBuffer();

    private int secondaryFirmTradeIDOffset = 0;

    private int secondaryFirmTradeIDLength = 0;

    public TradeCaptureReportEncoder secondaryFirmTradeID(final DirectBuffer value, final int offset, final int length)
    {
        secondaryFirmTradeID.wrap(value);
        secondaryFirmTradeIDOffset = offset;
        secondaryFirmTradeIDLength = length;
        return this;
    }

    public TradeCaptureReportEncoder secondaryFirmTradeID(final DirectBuffer value, final int length)
    {
        return secondaryFirmTradeID(value, 0, length);
    }

    public TradeCaptureReportEncoder secondaryFirmTradeID(final DirectBuffer value)
    {
        return secondaryFirmTradeID(value, 0, value.capacity());
    }

    public TradeCaptureReportEncoder secondaryFirmTradeID(final byte[] value, final int offset, final int length)
    {
        secondaryFirmTradeID.wrap(value);
        secondaryFirmTradeIDOffset = offset;
        secondaryFirmTradeIDLength = length;
        return this;
    }

    public TradeCaptureReportEncoder secondaryFirmTradeIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(secondaryFirmTradeID, value, offset, length);
        secondaryFirmTradeIDOffset = offset;
        secondaryFirmTradeIDLength = length;
        return this;
    }

    public TradeCaptureReportEncoder secondaryFirmTradeID(final byte[] value, final int length)
    {
        return secondaryFirmTradeID(value, 0, length);
    }

    public TradeCaptureReportEncoder secondaryFirmTradeID(final byte[] value)
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

    public TradeCaptureReportEncoder secondaryFirmTradeID(final CharSequence value)
    {
        toBytes(value, secondaryFirmTradeID);
        secondaryFirmTradeIDOffset = 0;
        secondaryFirmTradeIDLength = value.length();
        return this;
    }

    public TradeCaptureReportEncoder secondaryFirmTradeID(final AsciiSequenceView value)
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

    public TradeCaptureReportEncoder secondaryFirmTradeID(final char[] value)
    {
        return secondaryFirmTradeID(value, 0, value.length);
    }

    public TradeCaptureReportEncoder secondaryFirmTradeID(final char[] value, final int length)
    {
        return secondaryFirmTradeID(value, 0, length);
    }

    public TradeCaptureReportEncoder secondaryFirmTradeID(final char[] value, final int offset, final int length)
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

    public TradeCaptureReportEncoder tradeReportTransType(int value)
    {
        tradeReportTransType = value;
        hasTradeReportTransType = true;
        return this;
    }

    public int tradeReportTransType()
    {
        return tradeReportTransType;
    }

    public TradeCaptureReportEncoder tradeReportTransType(TradeReportTransType value)
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

    public TradeCaptureReportEncoder tradeReportType(int value)
    {
        tradeReportType = value;
        hasTradeReportType = true;
        return this;
    }

    public int tradeReportType()
    {
        return tradeReportType;
    }

    public TradeCaptureReportEncoder tradeReportType(TradeReportType value)
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

    private int trdRptStatus;

    private boolean hasTrdRptStatus;

    public boolean hasTrdRptStatus()
    {
        return hasTrdRptStatus;
    }

    public TradeCaptureReportEncoder trdRptStatus(int value)
    {
        trdRptStatus = value;
        hasTrdRptStatus = true;
        return this;
    }

    public int trdRptStatus()
    {
        return trdRptStatus;
    }

    public TradeCaptureReportEncoder trdRptStatus(TrdRptStatus value)
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

    private final MutableDirectBuffer tradeRequestID = new UnsafeBuffer();

    private int tradeRequestIDOffset = 0;

    private int tradeRequestIDLength = 0;

    public TradeCaptureReportEncoder tradeRequestID(final DirectBuffer value, final int offset, final int length)
    {
        tradeRequestID.wrap(value);
        tradeRequestIDOffset = offset;
        tradeRequestIDLength = length;
        return this;
    }

    public TradeCaptureReportEncoder tradeRequestID(final DirectBuffer value, final int length)
    {
        return tradeRequestID(value, 0, length);
    }

    public TradeCaptureReportEncoder tradeRequestID(final DirectBuffer value)
    {
        return tradeRequestID(value, 0, value.capacity());
    }

    public TradeCaptureReportEncoder tradeRequestID(final byte[] value, final int offset, final int length)
    {
        tradeRequestID.wrap(value);
        tradeRequestIDOffset = offset;
        tradeRequestIDLength = length;
        return this;
    }

    public TradeCaptureReportEncoder tradeRequestIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradeRequestID, value, offset, length);
        tradeRequestIDOffset = offset;
        tradeRequestIDLength = length;
        return this;
    }

    public TradeCaptureReportEncoder tradeRequestID(final byte[] value, final int length)
    {
        return tradeRequestID(value, 0, length);
    }

    public TradeCaptureReportEncoder tradeRequestID(final byte[] value)
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

    public TradeCaptureReportEncoder tradeRequestID(final CharSequence value)
    {
        toBytes(value, tradeRequestID);
        tradeRequestIDOffset = 0;
        tradeRequestIDLength = value.length();
        return this;
    }

    public TradeCaptureReportEncoder tradeRequestID(final AsciiSequenceView value)
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

    public TradeCaptureReportEncoder tradeRequestID(final char[] value)
    {
        return tradeRequestID(value, 0, value.length);
    }

    public TradeCaptureReportEncoder tradeRequestID(final char[] value, final int length)
    {
        return tradeRequestID(value, 0, length);
    }

    public TradeCaptureReportEncoder tradeRequestID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradeRequestID, offset, length);
        tradeRequestIDOffset = 0;
        tradeRequestIDLength = length;
        return this;
    }

    private int trdType;

    private boolean hasTrdType;

    public boolean hasTrdType()
    {
        return hasTrdType;
    }

    public TradeCaptureReportEncoder trdType(int value)
    {
        trdType = value;
        hasTrdType = true;
        return this;
    }

    public int trdType()
    {
        return trdType;
    }

    public TradeCaptureReportEncoder trdType(TrdType value)
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

    public TradeCaptureReportEncoder trdSubType(int value)
    {
        trdSubType = value;
        hasTrdSubType = true;
        return this;
    }

    public int trdSubType()
    {
        return trdSubType;
    }

    public TradeCaptureReportEncoder trdSubType(TrdSubType value)
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

    public TradeCaptureReportEncoder secondaryTrdType(int value)
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

    public TradeCaptureReportEncoder tradeHandlingInstr(char value)
    {
        tradeHandlingInstr = value;
        hasTradeHandlingInstr = true;
        return this;
    }

    public char tradeHandlingInstr()
    {
        return tradeHandlingInstr;
    }

    public TradeCaptureReportEncoder tradeHandlingInstr(TradeHandlingInstr value)
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

    public TradeCaptureReportEncoder origTradeHandlingInstr(char value)
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

    public TradeCaptureReportEncoder origTradeDate(final DirectBuffer value, final int offset, final int length)
    {
        origTradeDate.wrap(value);
        origTradeDateOffset = offset;
        origTradeDateLength = length;
        return this;
    }

    public TradeCaptureReportEncoder origTradeDate(final DirectBuffer value, final int length)
    {
        return origTradeDate(value, 0, length);
    }

    public TradeCaptureReportEncoder origTradeDate(final DirectBuffer value)
    {
        return origTradeDate(value, 0, value.capacity());
    }

    public TradeCaptureReportEncoder origTradeDate(final byte[] value, final int offset, final int length)
    {
        origTradeDate.wrap(value);
        origTradeDateOffset = offset;
        origTradeDateLength = length;
        return this;
    }

    public TradeCaptureReportEncoder origTradeDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(origTradeDate, value, offset, length);
        origTradeDateOffset = offset;
        origTradeDateLength = length;
        return this;
    }

    public TradeCaptureReportEncoder origTradeDate(final byte[] value, final int length)
    {
        return origTradeDate(value, 0, length);
    }

    public TradeCaptureReportEncoder origTradeDate(final byte[] value)
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

    public TradeCaptureReportEncoder origTradeID(final DirectBuffer value, final int offset, final int length)
    {
        origTradeID.wrap(value);
        origTradeIDOffset = offset;
        origTradeIDLength = length;
        return this;
    }

    public TradeCaptureReportEncoder origTradeID(final DirectBuffer value, final int length)
    {
        return origTradeID(value, 0, length);
    }

    public TradeCaptureReportEncoder origTradeID(final DirectBuffer value)
    {
        return origTradeID(value, 0, value.capacity());
    }

    public TradeCaptureReportEncoder origTradeID(final byte[] value, final int offset, final int length)
    {
        origTradeID.wrap(value);
        origTradeIDOffset = offset;
        origTradeIDLength = length;
        return this;
    }

    public TradeCaptureReportEncoder origTradeIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(origTradeID, value, offset, length);
        origTradeIDOffset = offset;
        origTradeIDLength = length;
        return this;
    }

    public TradeCaptureReportEncoder origTradeID(final byte[] value, final int length)
    {
        return origTradeID(value, 0, length);
    }

    public TradeCaptureReportEncoder origTradeID(final byte[] value)
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

    public TradeCaptureReportEncoder origTradeID(final CharSequence value)
    {
        toBytes(value, origTradeID);
        origTradeIDOffset = 0;
        origTradeIDLength = value.length();
        return this;
    }

    public TradeCaptureReportEncoder origTradeID(final AsciiSequenceView value)
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

    public TradeCaptureReportEncoder origTradeID(final char[] value)
    {
        return origTradeID(value, 0, value.length);
    }

    public TradeCaptureReportEncoder origTradeID(final char[] value, final int length)
    {
        return origTradeID(value, 0, length);
    }

    public TradeCaptureReportEncoder origTradeID(final char[] value, final int offset, final int length)
    {
        toBytes(value, origTradeID, offset, length);
        origTradeIDOffset = 0;
        origTradeIDLength = length;
        return this;
    }

    private final MutableDirectBuffer origSecondaryTradeID = new UnsafeBuffer();

    private int origSecondaryTradeIDOffset = 0;

    private int origSecondaryTradeIDLength = 0;

    public TradeCaptureReportEncoder origSecondaryTradeID(final DirectBuffer value, final int offset, final int length)
    {
        origSecondaryTradeID.wrap(value);
        origSecondaryTradeIDOffset = offset;
        origSecondaryTradeIDLength = length;
        return this;
    }

    public TradeCaptureReportEncoder origSecondaryTradeID(final DirectBuffer value, final int length)
    {
        return origSecondaryTradeID(value, 0, length);
    }

    public TradeCaptureReportEncoder origSecondaryTradeID(final DirectBuffer value)
    {
        return origSecondaryTradeID(value, 0, value.capacity());
    }

    public TradeCaptureReportEncoder origSecondaryTradeID(final byte[] value, final int offset, final int length)
    {
        origSecondaryTradeID.wrap(value);
        origSecondaryTradeIDOffset = offset;
        origSecondaryTradeIDLength = length;
        return this;
    }

    public TradeCaptureReportEncoder origSecondaryTradeIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(origSecondaryTradeID, value, offset, length);
        origSecondaryTradeIDOffset = offset;
        origSecondaryTradeIDLength = length;
        return this;
    }

    public TradeCaptureReportEncoder origSecondaryTradeID(final byte[] value, final int length)
    {
        return origSecondaryTradeID(value, 0, length);
    }

    public TradeCaptureReportEncoder origSecondaryTradeID(final byte[] value)
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

    public TradeCaptureReportEncoder origSecondaryTradeID(final CharSequence value)
    {
        toBytes(value, origSecondaryTradeID);
        origSecondaryTradeIDOffset = 0;
        origSecondaryTradeIDLength = value.length();
        return this;
    }

    public TradeCaptureReportEncoder origSecondaryTradeID(final AsciiSequenceView value)
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

    public TradeCaptureReportEncoder origSecondaryTradeID(final char[] value)
    {
        return origSecondaryTradeID(value, 0, value.length);
    }

    public TradeCaptureReportEncoder origSecondaryTradeID(final char[] value, final int length)
    {
        return origSecondaryTradeID(value, 0, length);
    }

    public TradeCaptureReportEncoder origSecondaryTradeID(final char[] value, final int offset, final int length)
    {
        toBytes(value, origSecondaryTradeID, offset, length);
        origSecondaryTradeIDOffset = 0;
        origSecondaryTradeIDLength = length;
        return this;
    }

    private final MutableDirectBuffer transferReason = new UnsafeBuffer();

    private int transferReasonOffset = 0;

    private int transferReasonLength = 0;

    public TradeCaptureReportEncoder transferReason(final DirectBuffer value, final int offset, final int length)
    {
        transferReason.wrap(value);
        transferReasonOffset = offset;
        transferReasonLength = length;
        return this;
    }

    public TradeCaptureReportEncoder transferReason(final DirectBuffer value, final int length)
    {
        return transferReason(value, 0, length);
    }

    public TradeCaptureReportEncoder transferReason(final DirectBuffer value)
    {
        return transferReason(value, 0, value.capacity());
    }

    public TradeCaptureReportEncoder transferReason(final byte[] value, final int offset, final int length)
    {
        transferReason.wrap(value);
        transferReasonOffset = offset;
        transferReasonLength = length;
        return this;
    }

    public TradeCaptureReportEncoder transferReasonAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(transferReason, value, offset, length);
        transferReasonOffset = offset;
        transferReasonLength = length;
        return this;
    }

    public TradeCaptureReportEncoder transferReason(final byte[] value, final int length)
    {
        return transferReason(value, 0, length);
    }

    public TradeCaptureReportEncoder transferReason(final byte[] value)
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

    public TradeCaptureReportEncoder transferReason(final CharSequence value)
    {
        toBytes(value, transferReason);
        transferReasonOffset = 0;
        transferReasonLength = value.length();
        return this;
    }

    public TradeCaptureReportEncoder transferReason(final AsciiSequenceView value)
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

    public TradeCaptureReportEncoder transferReason(final char[] value)
    {
        return transferReason(value, 0, value.length);
    }

    public TradeCaptureReportEncoder transferReason(final char[] value, final int length)
    {
        return transferReason(value, 0, length);
    }

    public TradeCaptureReportEncoder transferReason(final char[] value, final int offset, final int length)
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

    public TradeCaptureReportEncoder execType(char value)
    {
        execType = value;
        hasExecType = true;
        return this;
    }

    public char execType()
    {
        return execType;
    }

    public TradeCaptureReportEncoder execType(ExecType value)
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

    private int totNumTradeReports;

    private boolean hasTotNumTradeReports;

    public boolean hasTotNumTradeReports()
    {
        return hasTotNumTradeReports;
    }

    public TradeCaptureReportEncoder totNumTradeReports(int value)
    {
        totNumTradeReports = value;
        hasTotNumTradeReports = true;
        return this;
    }

    public int totNumTradeReports()
    {
        return totNumTradeReports;
    }

    private boolean lastRptRequested;

    private boolean hasLastRptRequested;

    public boolean hasLastRptRequested()
    {
        return hasLastRptRequested;
    }

    public TradeCaptureReportEncoder lastRptRequested(boolean value)
    {
        lastRptRequested = value;
        hasLastRptRequested = true;
        return this;
    }

    public boolean lastRptRequested()
    {
        return lastRptRequested;
    }

    private boolean unsolicitedIndicator;

    private boolean hasUnsolicitedIndicator;

    public boolean hasUnsolicitedIndicator()
    {
        return hasUnsolicitedIndicator;
    }

    public TradeCaptureReportEncoder unsolicitedIndicator(boolean value)
    {
        unsolicitedIndicator = value;
        hasUnsolicitedIndicator = true;
        return this;
    }

    public boolean unsolicitedIndicator()
    {
        return unsolicitedIndicator;
    }

    private char subscriptionRequestType;

    private boolean hasSubscriptionRequestType;

    public boolean hasSubscriptionRequestType()
    {
        return hasSubscriptionRequestType;
    }

    public TradeCaptureReportEncoder subscriptionRequestType(char value)
    {
        subscriptionRequestType = value;
        hasSubscriptionRequestType = true;
        return this;
    }

    public char subscriptionRequestType()
    {
        return subscriptionRequestType;
    }

    public TradeCaptureReportEncoder subscriptionRequestType(SubscriptionRequestType value)
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

    private final MutableDirectBuffer tradeReportRefID = new UnsafeBuffer();

    private int tradeReportRefIDOffset = 0;

    private int tradeReportRefIDLength = 0;

    public TradeCaptureReportEncoder tradeReportRefID(final DirectBuffer value, final int offset, final int length)
    {
        tradeReportRefID.wrap(value);
        tradeReportRefIDOffset = offset;
        tradeReportRefIDLength = length;
        return this;
    }

    public TradeCaptureReportEncoder tradeReportRefID(final DirectBuffer value, final int length)
    {
        return tradeReportRefID(value, 0, length);
    }

    public TradeCaptureReportEncoder tradeReportRefID(final DirectBuffer value)
    {
        return tradeReportRefID(value, 0, value.capacity());
    }

    public TradeCaptureReportEncoder tradeReportRefID(final byte[] value, final int offset, final int length)
    {
        tradeReportRefID.wrap(value);
        tradeReportRefIDOffset = offset;
        tradeReportRefIDLength = length;
        return this;
    }

    public TradeCaptureReportEncoder tradeReportRefIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradeReportRefID, value, offset, length);
        tradeReportRefIDOffset = offset;
        tradeReportRefIDLength = length;
        return this;
    }

    public TradeCaptureReportEncoder tradeReportRefID(final byte[] value, final int length)
    {
        return tradeReportRefID(value, 0, length);
    }

    public TradeCaptureReportEncoder tradeReportRefID(final byte[] value)
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

    public TradeCaptureReportEncoder tradeReportRefID(final CharSequence value)
    {
        toBytes(value, tradeReportRefID);
        tradeReportRefIDOffset = 0;
        tradeReportRefIDLength = value.length();
        return this;
    }

    public TradeCaptureReportEncoder tradeReportRefID(final AsciiSequenceView value)
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

    public TradeCaptureReportEncoder tradeReportRefID(final char[] value)
    {
        return tradeReportRefID(value, 0, value.length);
    }

    public TradeCaptureReportEncoder tradeReportRefID(final char[] value, final int length)
    {
        return tradeReportRefID(value, 0, length);
    }

    public TradeCaptureReportEncoder tradeReportRefID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradeReportRefID, offset, length);
        tradeReportRefIDOffset = 0;
        tradeReportRefIDLength = length;
        return this;
    }

    private final MutableDirectBuffer secondaryTradeReportRefID = new UnsafeBuffer();

    private int secondaryTradeReportRefIDOffset = 0;

    private int secondaryTradeReportRefIDLength = 0;

    public TradeCaptureReportEncoder secondaryTradeReportRefID(final DirectBuffer value, final int offset, final int length)
    {
        secondaryTradeReportRefID.wrap(value);
        secondaryTradeReportRefIDOffset = offset;
        secondaryTradeReportRefIDLength = length;
        return this;
    }

    public TradeCaptureReportEncoder secondaryTradeReportRefID(final DirectBuffer value, final int length)
    {
        return secondaryTradeReportRefID(value, 0, length);
    }

    public TradeCaptureReportEncoder secondaryTradeReportRefID(final DirectBuffer value)
    {
        return secondaryTradeReportRefID(value, 0, value.capacity());
    }

    public TradeCaptureReportEncoder secondaryTradeReportRefID(final byte[] value, final int offset, final int length)
    {
        secondaryTradeReportRefID.wrap(value);
        secondaryTradeReportRefIDOffset = offset;
        secondaryTradeReportRefIDLength = length;
        return this;
    }

    public TradeCaptureReportEncoder secondaryTradeReportRefIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(secondaryTradeReportRefID, value, offset, length);
        secondaryTradeReportRefIDOffset = offset;
        secondaryTradeReportRefIDLength = length;
        return this;
    }

    public TradeCaptureReportEncoder secondaryTradeReportRefID(final byte[] value, final int length)
    {
        return secondaryTradeReportRefID(value, 0, length);
    }

    public TradeCaptureReportEncoder secondaryTradeReportRefID(final byte[] value)
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

    public TradeCaptureReportEncoder secondaryTradeReportRefID(final CharSequence value)
    {
        toBytes(value, secondaryTradeReportRefID);
        secondaryTradeReportRefIDOffset = 0;
        secondaryTradeReportRefIDLength = value.length();
        return this;
    }

    public TradeCaptureReportEncoder secondaryTradeReportRefID(final AsciiSequenceView value)
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

    public TradeCaptureReportEncoder secondaryTradeReportRefID(final char[] value)
    {
        return secondaryTradeReportRefID(value, 0, value.length);
    }

    public TradeCaptureReportEncoder secondaryTradeReportRefID(final char[] value, final int length)
    {
        return secondaryTradeReportRefID(value, 0, length);
    }

    public TradeCaptureReportEncoder secondaryTradeReportRefID(final char[] value, final int offset, final int length)
    {
        toBytes(value, secondaryTradeReportRefID, offset, length);
        secondaryTradeReportRefIDOffset = 0;
        secondaryTradeReportRefIDLength = length;
        return this;
    }

    private final MutableDirectBuffer secondaryTradeReportID = new UnsafeBuffer();

    private int secondaryTradeReportIDOffset = 0;

    private int secondaryTradeReportIDLength = 0;

    public TradeCaptureReportEncoder secondaryTradeReportID(final DirectBuffer value, final int offset, final int length)
    {
        secondaryTradeReportID.wrap(value);
        secondaryTradeReportIDOffset = offset;
        secondaryTradeReportIDLength = length;
        return this;
    }

    public TradeCaptureReportEncoder secondaryTradeReportID(final DirectBuffer value, final int length)
    {
        return secondaryTradeReportID(value, 0, length);
    }

    public TradeCaptureReportEncoder secondaryTradeReportID(final DirectBuffer value)
    {
        return secondaryTradeReportID(value, 0, value.capacity());
    }

    public TradeCaptureReportEncoder secondaryTradeReportID(final byte[] value, final int offset, final int length)
    {
        secondaryTradeReportID.wrap(value);
        secondaryTradeReportIDOffset = offset;
        secondaryTradeReportIDLength = length;
        return this;
    }

    public TradeCaptureReportEncoder secondaryTradeReportIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(secondaryTradeReportID, value, offset, length);
        secondaryTradeReportIDOffset = offset;
        secondaryTradeReportIDLength = length;
        return this;
    }

    public TradeCaptureReportEncoder secondaryTradeReportID(final byte[] value, final int length)
    {
        return secondaryTradeReportID(value, 0, length);
    }

    public TradeCaptureReportEncoder secondaryTradeReportID(final byte[] value)
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

    public TradeCaptureReportEncoder secondaryTradeReportID(final CharSequence value)
    {
        toBytes(value, secondaryTradeReportID);
        secondaryTradeReportIDOffset = 0;
        secondaryTradeReportIDLength = value.length();
        return this;
    }

    public TradeCaptureReportEncoder secondaryTradeReportID(final AsciiSequenceView value)
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

    public TradeCaptureReportEncoder secondaryTradeReportID(final char[] value)
    {
        return secondaryTradeReportID(value, 0, value.length);
    }

    public TradeCaptureReportEncoder secondaryTradeReportID(final char[] value, final int length)
    {
        return secondaryTradeReportID(value, 0, length);
    }

    public TradeCaptureReportEncoder secondaryTradeReportID(final char[] value, final int offset, final int length)
    {
        toBytes(value, secondaryTradeReportID, offset, length);
        secondaryTradeReportIDOffset = 0;
        secondaryTradeReportIDLength = length;
        return this;
    }

    private final MutableDirectBuffer tradeLinkID = new UnsafeBuffer();

    private int tradeLinkIDOffset = 0;

    private int tradeLinkIDLength = 0;

    public TradeCaptureReportEncoder tradeLinkID(final DirectBuffer value, final int offset, final int length)
    {
        tradeLinkID.wrap(value);
        tradeLinkIDOffset = offset;
        tradeLinkIDLength = length;
        return this;
    }

    public TradeCaptureReportEncoder tradeLinkID(final DirectBuffer value, final int length)
    {
        return tradeLinkID(value, 0, length);
    }

    public TradeCaptureReportEncoder tradeLinkID(final DirectBuffer value)
    {
        return tradeLinkID(value, 0, value.capacity());
    }

    public TradeCaptureReportEncoder tradeLinkID(final byte[] value, final int offset, final int length)
    {
        tradeLinkID.wrap(value);
        tradeLinkIDOffset = offset;
        tradeLinkIDLength = length;
        return this;
    }

    public TradeCaptureReportEncoder tradeLinkIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradeLinkID, value, offset, length);
        tradeLinkIDOffset = offset;
        tradeLinkIDLength = length;
        return this;
    }

    public TradeCaptureReportEncoder tradeLinkID(final byte[] value, final int length)
    {
        return tradeLinkID(value, 0, length);
    }

    public TradeCaptureReportEncoder tradeLinkID(final byte[] value)
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

    public TradeCaptureReportEncoder tradeLinkID(final CharSequence value)
    {
        toBytes(value, tradeLinkID);
        tradeLinkIDOffset = 0;
        tradeLinkIDLength = value.length();
        return this;
    }

    public TradeCaptureReportEncoder tradeLinkID(final AsciiSequenceView value)
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

    public TradeCaptureReportEncoder tradeLinkID(final char[] value)
    {
        return tradeLinkID(value, 0, value.length);
    }

    public TradeCaptureReportEncoder tradeLinkID(final char[] value, final int length)
    {
        return tradeLinkID(value, 0, length);
    }

    public TradeCaptureReportEncoder tradeLinkID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradeLinkID, offset, length);
        tradeLinkIDOffset = 0;
        tradeLinkIDLength = length;
        return this;
    }

    private final MutableDirectBuffer trdMatchID = new UnsafeBuffer();

    private int trdMatchIDOffset = 0;

    private int trdMatchIDLength = 0;

    public TradeCaptureReportEncoder trdMatchID(final DirectBuffer value, final int offset, final int length)
    {
        trdMatchID.wrap(value);
        trdMatchIDOffset = offset;
        trdMatchIDLength = length;
        return this;
    }

    public TradeCaptureReportEncoder trdMatchID(final DirectBuffer value, final int length)
    {
        return trdMatchID(value, 0, length);
    }

    public TradeCaptureReportEncoder trdMatchID(final DirectBuffer value)
    {
        return trdMatchID(value, 0, value.capacity());
    }

    public TradeCaptureReportEncoder trdMatchID(final byte[] value, final int offset, final int length)
    {
        trdMatchID.wrap(value);
        trdMatchIDOffset = offset;
        trdMatchIDLength = length;
        return this;
    }

    public TradeCaptureReportEncoder trdMatchIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(trdMatchID, value, offset, length);
        trdMatchIDOffset = offset;
        trdMatchIDLength = length;
        return this;
    }

    public TradeCaptureReportEncoder trdMatchID(final byte[] value, final int length)
    {
        return trdMatchID(value, 0, length);
    }

    public TradeCaptureReportEncoder trdMatchID(final byte[] value)
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

    public TradeCaptureReportEncoder trdMatchID(final CharSequence value)
    {
        toBytes(value, trdMatchID);
        trdMatchIDOffset = 0;
        trdMatchIDLength = value.length();
        return this;
    }

    public TradeCaptureReportEncoder trdMatchID(final AsciiSequenceView value)
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

    public TradeCaptureReportEncoder trdMatchID(final char[] value)
    {
        return trdMatchID(value, 0, value.length);
    }

    public TradeCaptureReportEncoder trdMatchID(final char[] value, final int length)
    {
        return trdMatchID(value, 0, length);
    }

    public TradeCaptureReportEncoder trdMatchID(final char[] value, final int offset, final int length)
    {
        toBytes(value, trdMatchID, offset, length);
        trdMatchIDOffset = 0;
        trdMatchIDLength = length;
        return this;
    }

    private final MutableDirectBuffer execID = new UnsafeBuffer();

    private int execIDOffset = 0;

    private int execIDLength = 0;

    public TradeCaptureReportEncoder execID(final DirectBuffer value, final int offset, final int length)
    {
        execID.wrap(value);
        execIDOffset = offset;
        execIDLength = length;
        return this;
    }

    public TradeCaptureReportEncoder execID(final DirectBuffer value, final int length)
    {
        return execID(value, 0, length);
    }

    public TradeCaptureReportEncoder execID(final DirectBuffer value)
    {
        return execID(value, 0, value.capacity());
    }

    public TradeCaptureReportEncoder execID(final byte[] value, final int offset, final int length)
    {
        execID.wrap(value);
        execIDOffset = offset;
        execIDLength = length;
        return this;
    }

    public TradeCaptureReportEncoder execIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(execID, value, offset, length);
        execIDOffset = offset;
        execIDLength = length;
        return this;
    }

    public TradeCaptureReportEncoder execID(final byte[] value, final int length)
    {
        return execID(value, 0, length);
    }

    public TradeCaptureReportEncoder execID(final byte[] value)
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

    public TradeCaptureReportEncoder execID(final CharSequence value)
    {
        toBytes(value, execID);
        execIDOffset = 0;
        execIDLength = value.length();
        return this;
    }

    public TradeCaptureReportEncoder execID(final AsciiSequenceView value)
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

    public TradeCaptureReportEncoder execID(final char[] value)
    {
        return execID(value, 0, value.length);
    }

    public TradeCaptureReportEncoder execID(final char[] value, final int length)
    {
        return execID(value, 0, length);
    }

    public TradeCaptureReportEncoder execID(final char[] value, final int offset, final int length)
    {
        toBytes(value, execID, offset, length);
        execIDOffset = 0;
        execIDLength = length;
        return this;
    }

    private final MutableDirectBuffer secondaryExecID = new UnsafeBuffer();

    private int secondaryExecIDOffset = 0;

    private int secondaryExecIDLength = 0;

    public TradeCaptureReportEncoder secondaryExecID(final DirectBuffer value, final int offset, final int length)
    {
        secondaryExecID.wrap(value);
        secondaryExecIDOffset = offset;
        secondaryExecIDLength = length;
        return this;
    }

    public TradeCaptureReportEncoder secondaryExecID(final DirectBuffer value, final int length)
    {
        return secondaryExecID(value, 0, length);
    }

    public TradeCaptureReportEncoder secondaryExecID(final DirectBuffer value)
    {
        return secondaryExecID(value, 0, value.capacity());
    }

    public TradeCaptureReportEncoder secondaryExecID(final byte[] value, final int offset, final int length)
    {
        secondaryExecID.wrap(value);
        secondaryExecIDOffset = offset;
        secondaryExecIDLength = length;
        return this;
    }

    public TradeCaptureReportEncoder secondaryExecIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(secondaryExecID, value, offset, length);
        secondaryExecIDOffset = offset;
        secondaryExecIDLength = length;
        return this;
    }

    public TradeCaptureReportEncoder secondaryExecID(final byte[] value, final int length)
    {
        return secondaryExecID(value, 0, length);
    }

    public TradeCaptureReportEncoder secondaryExecID(final byte[] value)
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

    public TradeCaptureReportEncoder secondaryExecID(final CharSequence value)
    {
        toBytes(value, secondaryExecID);
        secondaryExecIDOffset = 0;
        secondaryExecIDLength = value.length();
        return this;
    }

    public TradeCaptureReportEncoder secondaryExecID(final AsciiSequenceView value)
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

    public TradeCaptureReportEncoder secondaryExecID(final char[] value)
    {
        return secondaryExecID(value, 0, value.length);
    }

    public TradeCaptureReportEncoder secondaryExecID(final char[] value, final int length)
    {
        return secondaryExecID(value, 0, length);
    }

    public TradeCaptureReportEncoder secondaryExecID(final char[] value, final int offset, final int length)
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

    public TradeCaptureReportEncoder execRestatementReason(int value)
    {
        execRestatementReason = value;
        hasExecRestatementReason = true;
        return this;
    }

    public int execRestatementReason()
    {
        return execRestatementReason;
    }

    public TradeCaptureReportEncoder execRestatementReason(ExecRestatementReason value)
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

    public TradeCaptureReportEncoder previouslyReported(boolean value)
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

    public TradeCaptureReportEncoder priceType(int value)
    {
        priceType = value;
        hasPriceType = true;
        return this;
    }

    public int priceType()
    {
        return priceType;
    }

    public TradeCaptureReportEncoder priceType(PriceType value)
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

    private final RootPartiesEncoder rootParties = new RootPartiesEncoder();
    public RootPartiesEncoder rootParties()
    {
        return rootParties;
    }

    private char asOfIndicator;

    private boolean hasAsOfIndicator;

    public boolean hasAsOfIndicator()
    {
        return hasAsOfIndicator;
    }

    public TradeCaptureReportEncoder asOfIndicator(char value)
    {
        asOfIndicator = value;
        hasAsOfIndicator = true;
        return this;
    }

    public char asOfIndicator()
    {
        return asOfIndicator;
    }

    public TradeCaptureReportEncoder asOfIndicator(AsOfIndicator value)
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

    private final MutableDirectBuffer settlSessID = new UnsafeBuffer();

    private int settlSessIDOffset = 0;

    private int settlSessIDLength = 0;

    public TradeCaptureReportEncoder settlSessID(final DirectBuffer value, final int offset, final int length)
    {
        settlSessID.wrap(value);
        settlSessIDOffset = offset;
        settlSessIDLength = length;
        return this;
    }

    public TradeCaptureReportEncoder settlSessID(final DirectBuffer value, final int length)
    {
        return settlSessID(value, 0, length);
    }

    public TradeCaptureReportEncoder settlSessID(final DirectBuffer value)
    {
        return settlSessID(value, 0, value.capacity());
    }

    public TradeCaptureReportEncoder settlSessID(final byte[] value, final int offset, final int length)
    {
        settlSessID.wrap(value);
        settlSessIDOffset = offset;
        settlSessIDLength = length;
        return this;
    }

    public TradeCaptureReportEncoder settlSessIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlSessID, value, offset, length);
        settlSessIDOffset = offset;
        settlSessIDLength = length;
        return this;
    }

    public TradeCaptureReportEncoder settlSessID(final byte[] value, final int length)
    {
        return settlSessID(value, 0, length);
    }

    public TradeCaptureReportEncoder settlSessID(final byte[] value)
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

    public TradeCaptureReportEncoder settlSessID(final CharSequence value)
    {
        toBytes(value, settlSessID);
        settlSessIDOffset = 0;
        settlSessIDLength = value.length();
        return this;
    }

    public TradeCaptureReportEncoder settlSessID(final AsciiSequenceView value)
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

    public TradeCaptureReportEncoder settlSessID(final char[] value)
    {
        return settlSessID(value, 0, value.length);
    }

    public TradeCaptureReportEncoder settlSessID(final char[] value, final int length)
    {
        return settlSessID(value, 0, length);
    }

    public TradeCaptureReportEncoder settlSessID(final char[] value, final int offset, final int length)
    {
        toBytes(value, settlSessID, offset, length);
        settlSessIDOffset = 0;
        settlSessIDLength = length;
        return this;
    }

    public TradeCaptureReportEncoder settlSessID(SettlSessID value)
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

    public TradeCaptureReportEncoder settlSessSubID(final DirectBuffer value, final int offset, final int length)
    {
        settlSessSubID.wrap(value);
        settlSessSubIDOffset = offset;
        settlSessSubIDLength = length;
        return this;
    }

    public TradeCaptureReportEncoder settlSessSubID(final DirectBuffer value, final int length)
    {
        return settlSessSubID(value, 0, length);
    }

    public TradeCaptureReportEncoder settlSessSubID(final DirectBuffer value)
    {
        return settlSessSubID(value, 0, value.capacity());
    }

    public TradeCaptureReportEncoder settlSessSubID(final byte[] value, final int offset, final int length)
    {
        settlSessSubID.wrap(value);
        settlSessSubIDOffset = offset;
        settlSessSubIDLength = length;
        return this;
    }

    public TradeCaptureReportEncoder settlSessSubIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlSessSubID, value, offset, length);
        settlSessSubIDOffset = offset;
        settlSessSubIDLength = length;
        return this;
    }

    public TradeCaptureReportEncoder settlSessSubID(final byte[] value, final int length)
    {
        return settlSessSubID(value, 0, length);
    }

    public TradeCaptureReportEncoder settlSessSubID(final byte[] value)
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

    public TradeCaptureReportEncoder settlSessSubID(final CharSequence value)
    {
        toBytes(value, settlSessSubID);
        settlSessSubIDOffset = 0;
        settlSessSubIDLength = value.length();
        return this;
    }

    public TradeCaptureReportEncoder settlSessSubID(final AsciiSequenceView value)
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

    public TradeCaptureReportEncoder settlSessSubID(final char[] value)
    {
        return settlSessSubID(value, 0, value.length);
    }

    public TradeCaptureReportEncoder settlSessSubID(final char[] value, final int length)
    {
        return settlSessSubID(value, 0, length);
    }

    public TradeCaptureReportEncoder settlSessSubID(final char[] value, final int offset, final int length)
    {
        toBytes(value, settlSessSubID, offset, length);
        settlSessSubIDOffset = 0;
        settlSessSubIDLength = length;
        return this;
    }

    private char venueType;

    private boolean hasVenueType;

    public boolean hasVenueType()
    {
        return hasVenueType;
    }

    public TradeCaptureReportEncoder venueType(char value)
    {
        venueType = value;
        hasVenueType = true;
        return this;
    }

    public char venueType()
    {
        return venueType;
    }

    public TradeCaptureReportEncoder venueType(VenueType value)
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

    public TradeCaptureReportEncoder marketSegmentID(final DirectBuffer value, final int offset, final int length)
    {
        marketSegmentID.wrap(value);
        marketSegmentIDOffset = offset;
        marketSegmentIDLength = length;
        return this;
    }

    public TradeCaptureReportEncoder marketSegmentID(final DirectBuffer value, final int length)
    {
        return marketSegmentID(value, 0, length);
    }

    public TradeCaptureReportEncoder marketSegmentID(final DirectBuffer value)
    {
        return marketSegmentID(value, 0, value.capacity());
    }

    public TradeCaptureReportEncoder marketSegmentID(final byte[] value, final int offset, final int length)
    {
        marketSegmentID.wrap(value);
        marketSegmentIDOffset = offset;
        marketSegmentIDLength = length;
        return this;
    }

    public TradeCaptureReportEncoder marketSegmentIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(marketSegmentID, value, offset, length);
        marketSegmentIDOffset = offset;
        marketSegmentIDLength = length;
        return this;
    }

    public TradeCaptureReportEncoder marketSegmentID(final byte[] value, final int length)
    {
        return marketSegmentID(value, 0, length);
    }

    public TradeCaptureReportEncoder marketSegmentID(final byte[] value)
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

    public TradeCaptureReportEncoder marketSegmentID(final CharSequence value)
    {
        toBytes(value, marketSegmentID);
        marketSegmentIDOffset = 0;
        marketSegmentIDLength = value.length();
        return this;
    }

    public TradeCaptureReportEncoder marketSegmentID(final AsciiSequenceView value)
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

    public TradeCaptureReportEncoder marketSegmentID(final char[] value)
    {
        return marketSegmentID(value, 0, value.length);
    }

    public TradeCaptureReportEncoder marketSegmentID(final char[] value, final int length)
    {
        return marketSegmentID(value, 0, length);
    }

    public TradeCaptureReportEncoder marketSegmentID(final char[] value, final int offset, final int length)
    {
        toBytes(value, marketSegmentID, offset, length);
        marketSegmentIDOffset = 0;
        marketSegmentIDLength = length;
        return this;
    }

    private final MutableDirectBuffer marketID = new UnsafeBuffer();

    private int marketIDOffset = 0;

    private int marketIDLength = 0;

    public TradeCaptureReportEncoder marketID(final DirectBuffer value, final int offset, final int length)
    {
        marketID.wrap(value);
        marketIDOffset = offset;
        marketIDLength = length;
        return this;
    }

    public TradeCaptureReportEncoder marketID(final DirectBuffer value, final int length)
    {
        return marketID(value, 0, length);
    }

    public TradeCaptureReportEncoder marketID(final DirectBuffer value)
    {
        return marketID(value, 0, value.capacity());
    }

    public TradeCaptureReportEncoder marketID(final byte[] value, final int offset, final int length)
    {
        marketID.wrap(value);
        marketIDOffset = offset;
        marketIDLength = length;
        return this;
    }

    public TradeCaptureReportEncoder marketIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(marketID, value, offset, length);
        marketIDOffset = offset;
        marketIDLength = length;
        return this;
    }

    public TradeCaptureReportEncoder marketID(final byte[] value, final int length)
    {
        return marketID(value, 0, length);
    }

    public TradeCaptureReportEncoder marketID(final byte[] value)
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

    public TradeCaptureReportEncoder marketID(final CharSequence value)
    {
        toBytes(value, marketID);
        marketIDOffset = 0;
        marketIDLength = value.length();
        return this;
    }

    public TradeCaptureReportEncoder marketID(final AsciiSequenceView value)
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

    public TradeCaptureReportEncoder marketID(final char[] value)
    {
        return marketID(value, 0, value.length);
    }

    public TradeCaptureReportEncoder marketID(final char[] value, final int length)
    {
        return marketID(value, 0, length);
    }

    public TradeCaptureReportEncoder marketID(final char[] value, final int offset, final int length)
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

    private final FinancingDetailsEncoder financingDetails = new FinancingDetailsEncoder();
    public FinancingDetailsEncoder financingDetails()
    {
        return financingDetails;
    }

    private int qtyType;

    private boolean hasQtyType;

    public boolean hasQtyType()
    {
        return hasQtyType;
    }

    public TradeCaptureReportEncoder qtyType(int value)
    {
        qtyType = value;
        hasQtyType = true;
        return this;
    }

    public int qtyType()
    {
        return qtyType;
    }

    public TradeCaptureReportEncoder qtyType(QtyType value)
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

    private final YieldDataEncoder yieldData = new YieldDataEncoder();
    public YieldDataEncoder yieldData()
    {
        return yieldData;
    }

    private final UndInstrmtGrpEncoder undInstrmtGrp = new UndInstrmtGrpEncoder();
    public UndInstrmtGrpEncoder undInstrmtGrp()
    {
        return undInstrmtGrp;
    }

    private final MutableDirectBuffer underlyingTradingSessionID = new UnsafeBuffer();

    private int underlyingTradingSessionIDOffset = 0;

    private int underlyingTradingSessionIDLength = 0;

    public TradeCaptureReportEncoder underlyingTradingSessionID(final DirectBuffer value, final int offset, final int length)
    {
        underlyingTradingSessionID.wrap(value);
        underlyingTradingSessionIDOffset = offset;
        underlyingTradingSessionIDLength = length;
        return this;
    }

    public TradeCaptureReportEncoder underlyingTradingSessionID(final DirectBuffer value, final int length)
    {
        return underlyingTradingSessionID(value, 0, length);
    }

    public TradeCaptureReportEncoder underlyingTradingSessionID(final DirectBuffer value)
    {
        return underlyingTradingSessionID(value, 0, value.capacity());
    }

    public TradeCaptureReportEncoder underlyingTradingSessionID(final byte[] value, final int offset, final int length)
    {
        underlyingTradingSessionID.wrap(value);
        underlyingTradingSessionIDOffset = offset;
        underlyingTradingSessionIDLength = length;
        return this;
    }

    public TradeCaptureReportEncoder underlyingTradingSessionIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(underlyingTradingSessionID, value, offset, length);
        underlyingTradingSessionIDOffset = offset;
        underlyingTradingSessionIDLength = length;
        return this;
    }

    public TradeCaptureReportEncoder underlyingTradingSessionID(final byte[] value, final int length)
    {
        return underlyingTradingSessionID(value, 0, length);
    }

    public TradeCaptureReportEncoder underlyingTradingSessionID(final byte[] value)
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

    public TradeCaptureReportEncoder underlyingTradingSessionID(final CharSequence value)
    {
        toBytes(value, underlyingTradingSessionID);
        underlyingTradingSessionIDOffset = 0;
        underlyingTradingSessionIDLength = value.length();
        return this;
    }

    public TradeCaptureReportEncoder underlyingTradingSessionID(final AsciiSequenceView value)
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

    public TradeCaptureReportEncoder underlyingTradingSessionID(final char[] value)
    {
        return underlyingTradingSessionID(value, 0, value.length);
    }

    public TradeCaptureReportEncoder underlyingTradingSessionID(final char[] value, final int length)
    {
        return underlyingTradingSessionID(value, 0, length);
    }

    public TradeCaptureReportEncoder underlyingTradingSessionID(final char[] value, final int offset, final int length)
    {
        toBytes(value, underlyingTradingSessionID, offset, length);
        underlyingTradingSessionIDOffset = 0;
        underlyingTradingSessionIDLength = length;
        return this;
    }

    private final MutableDirectBuffer underlyingTradingSessionSubID = new UnsafeBuffer();

    private int underlyingTradingSessionSubIDOffset = 0;

    private int underlyingTradingSessionSubIDLength = 0;

    public TradeCaptureReportEncoder underlyingTradingSessionSubID(final DirectBuffer value, final int offset, final int length)
    {
        underlyingTradingSessionSubID.wrap(value);
        underlyingTradingSessionSubIDOffset = offset;
        underlyingTradingSessionSubIDLength = length;
        return this;
    }

    public TradeCaptureReportEncoder underlyingTradingSessionSubID(final DirectBuffer value, final int length)
    {
        return underlyingTradingSessionSubID(value, 0, length);
    }

    public TradeCaptureReportEncoder underlyingTradingSessionSubID(final DirectBuffer value)
    {
        return underlyingTradingSessionSubID(value, 0, value.capacity());
    }

    public TradeCaptureReportEncoder underlyingTradingSessionSubID(final byte[] value, final int offset, final int length)
    {
        underlyingTradingSessionSubID.wrap(value);
        underlyingTradingSessionSubIDOffset = offset;
        underlyingTradingSessionSubIDLength = length;
        return this;
    }

    public TradeCaptureReportEncoder underlyingTradingSessionSubIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(underlyingTradingSessionSubID, value, offset, length);
        underlyingTradingSessionSubIDOffset = offset;
        underlyingTradingSessionSubIDLength = length;
        return this;
    }

    public TradeCaptureReportEncoder underlyingTradingSessionSubID(final byte[] value, final int length)
    {
        return underlyingTradingSessionSubID(value, 0, length);
    }

    public TradeCaptureReportEncoder underlyingTradingSessionSubID(final byte[] value)
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

    public TradeCaptureReportEncoder underlyingTradingSessionSubID(final CharSequence value)
    {
        toBytes(value, underlyingTradingSessionSubID);
        underlyingTradingSessionSubIDOffset = 0;
        underlyingTradingSessionSubIDLength = value.length();
        return this;
    }

    public TradeCaptureReportEncoder underlyingTradingSessionSubID(final AsciiSequenceView value)
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

    public TradeCaptureReportEncoder underlyingTradingSessionSubID(final char[] value)
    {
        return underlyingTradingSessionSubID(value, 0, value.length);
    }

    public TradeCaptureReportEncoder underlyingTradingSessionSubID(final char[] value, final int length)
    {
        return underlyingTradingSessionSubID(value, 0, length);
    }

    public TradeCaptureReportEncoder underlyingTradingSessionSubID(final char[] value, final int offset, final int length)
    {
        toBytes(value, underlyingTradingSessionSubID, offset, length);
        underlyingTradingSessionSubIDOffset = 0;
        underlyingTradingSessionSubIDLength = length;
        return this;
    }

    private final DecimalFloat lastQty = new DecimalFloat();

    private boolean hasLastQty;

    public boolean hasLastQty()
    {
        return hasLastQty;
    }

    public TradeCaptureReportEncoder lastQty(DecimalFloat value)
    {
        lastQty.set(value);
        hasLastQty = true;
        return this;
    }

    public TradeCaptureReportEncoder lastQty(long value, int scale)
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

    public TradeCaptureReportEncoder lastPx(DecimalFloat value)
    {
        lastPx.set(value);
        hasLastPx = true;
        return this;
    }

    public TradeCaptureReportEncoder lastPx(long value, int scale)
    {
        lastPx.set(value, scale);
        hasLastPx = true;
        return this;
    }

    public DecimalFloat lastPx()
    {
        return lastPx;
    }

    private final DecimalFloat calculatedCcyLastQty = new DecimalFloat();

    private boolean hasCalculatedCcyLastQty;

    public boolean hasCalculatedCcyLastQty()
    {
        return hasCalculatedCcyLastQty;
    }

    public TradeCaptureReportEncoder calculatedCcyLastQty(DecimalFloat value)
    {
        calculatedCcyLastQty.set(value);
        hasCalculatedCcyLastQty = true;
        return this;
    }

    public TradeCaptureReportEncoder calculatedCcyLastQty(long value, int scale)
    {
        calculatedCcyLastQty.set(value, scale);
        hasCalculatedCcyLastQty = true;
        return this;
    }

    public DecimalFloat calculatedCcyLastQty()
    {
        return calculatedCcyLastQty;
    }

    private final MutableDirectBuffer currency = new UnsafeBuffer();

    private int currencyOffset = 0;

    private int currencyLength = 0;

    public TradeCaptureReportEncoder currency(final DirectBuffer value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public TradeCaptureReportEncoder currency(final DirectBuffer value, final int length)
    {
        return currency(value, 0, length);
    }

    public TradeCaptureReportEncoder currency(final DirectBuffer value)
    {
        return currency(value, 0, value.capacity());
    }

    public TradeCaptureReportEncoder currency(final byte[] value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public TradeCaptureReportEncoder currencyAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(currency, value, offset, length);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public TradeCaptureReportEncoder currency(final byte[] value, final int length)
    {
        return currency(value, 0, length);
    }

    public TradeCaptureReportEncoder currency(final byte[] value)
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

    public TradeCaptureReportEncoder currency(final CharSequence value)
    {
        toBytes(value, currency);
        currencyOffset = 0;
        currencyLength = value.length();
        return this;
    }

    public TradeCaptureReportEncoder currency(final AsciiSequenceView value)
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

    public TradeCaptureReportEncoder currency(final char[] value)
    {
        return currency(value, 0, value.length);
    }

    public TradeCaptureReportEncoder currency(final char[] value, final int length)
    {
        return currency(value, 0, length);
    }

    public TradeCaptureReportEncoder currency(final char[] value, final int offset, final int length)
    {
        toBytes(value, currency, offset, length);
        currencyOffset = 0;
        currencyLength = length;
        return this;
    }

    private final MutableDirectBuffer settlCurrency = new UnsafeBuffer();

    private int settlCurrencyOffset = 0;

    private int settlCurrencyLength = 0;

    public TradeCaptureReportEncoder settlCurrency(final DirectBuffer value, final int offset, final int length)
    {
        settlCurrency.wrap(value);
        settlCurrencyOffset = offset;
        settlCurrencyLength = length;
        return this;
    }

    public TradeCaptureReportEncoder settlCurrency(final DirectBuffer value, final int length)
    {
        return settlCurrency(value, 0, length);
    }

    public TradeCaptureReportEncoder settlCurrency(final DirectBuffer value)
    {
        return settlCurrency(value, 0, value.capacity());
    }

    public TradeCaptureReportEncoder settlCurrency(final byte[] value, final int offset, final int length)
    {
        settlCurrency.wrap(value);
        settlCurrencyOffset = offset;
        settlCurrencyLength = length;
        return this;
    }

    public TradeCaptureReportEncoder settlCurrencyAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlCurrency, value, offset, length);
        settlCurrencyOffset = offset;
        settlCurrencyLength = length;
        return this;
    }

    public TradeCaptureReportEncoder settlCurrency(final byte[] value, final int length)
    {
        return settlCurrency(value, 0, length);
    }

    public TradeCaptureReportEncoder settlCurrency(final byte[] value)
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

    public TradeCaptureReportEncoder settlCurrency(final CharSequence value)
    {
        toBytes(value, settlCurrency);
        settlCurrencyOffset = 0;
        settlCurrencyLength = value.length();
        return this;
    }

    public TradeCaptureReportEncoder settlCurrency(final AsciiSequenceView value)
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

    public TradeCaptureReportEncoder settlCurrency(final char[] value)
    {
        return settlCurrency(value, 0, value.length);
    }

    public TradeCaptureReportEncoder settlCurrency(final char[] value, final int length)
    {
        return settlCurrency(value, 0, length);
    }

    public TradeCaptureReportEncoder settlCurrency(final char[] value, final int offset, final int length)
    {
        toBytes(value, settlCurrency, offset, length);
        settlCurrencyOffset = 0;
        settlCurrencyLength = length;
        return this;
    }

    private final DecimalFloat lastParPx = new DecimalFloat();

    private boolean hasLastParPx;

    public boolean hasLastParPx()
    {
        return hasLastParPx;
    }

    public TradeCaptureReportEncoder lastParPx(DecimalFloat value)
    {
        lastParPx.set(value);
        hasLastParPx = true;
        return this;
    }

    public TradeCaptureReportEncoder lastParPx(long value, int scale)
    {
        lastParPx.set(value, scale);
        hasLastParPx = true;
        return this;
    }

    public DecimalFloat lastParPx()
    {
        return lastParPx;
    }

    private final DecimalFloat lastSpotRate = new DecimalFloat();

    private boolean hasLastSpotRate;

    public boolean hasLastSpotRate()
    {
        return hasLastSpotRate;
    }

    public TradeCaptureReportEncoder lastSpotRate(DecimalFloat value)
    {
        lastSpotRate.set(value);
        hasLastSpotRate = true;
        return this;
    }

    public TradeCaptureReportEncoder lastSpotRate(long value, int scale)
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

    public TradeCaptureReportEncoder lastForwardPoints(DecimalFloat value)
    {
        lastForwardPoints.set(value);
        hasLastForwardPoints = true;
        return this;
    }

    public TradeCaptureReportEncoder lastForwardPoints(long value, int scale)
    {
        lastForwardPoints.set(value, scale);
        hasLastForwardPoints = true;
        return this;
    }

    public DecimalFloat lastForwardPoints()
    {
        return lastForwardPoints;
    }

    private final DecimalFloat lastSwapPoints = new DecimalFloat();

    private boolean hasLastSwapPoints;

    public boolean hasLastSwapPoints()
    {
        return hasLastSwapPoints;
    }

    public TradeCaptureReportEncoder lastSwapPoints(DecimalFloat value)
    {
        lastSwapPoints.set(value);
        hasLastSwapPoints = true;
        return this;
    }

    public TradeCaptureReportEncoder lastSwapPoints(long value, int scale)
    {
        lastSwapPoints.set(value, scale);
        hasLastSwapPoints = true;
        return this;
    }

    public DecimalFloat lastSwapPoints()
    {
        return lastSwapPoints;
    }

    private final MutableDirectBuffer lastMkt = new UnsafeBuffer();

    private int lastMktOffset = 0;

    private int lastMktLength = 0;

    public TradeCaptureReportEncoder lastMkt(final DirectBuffer value, final int offset, final int length)
    {
        lastMkt.wrap(value);
        lastMktOffset = offset;
        lastMktLength = length;
        return this;
    }

    public TradeCaptureReportEncoder lastMkt(final DirectBuffer value, final int length)
    {
        return lastMkt(value, 0, length);
    }

    public TradeCaptureReportEncoder lastMkt(final DirectBuffer value)
    {
        return lastMkt(value, 0, value.capacity());
    }

    public TradeCaptureReportEncoder lastMkt(final byte[] value, final int offset, final int length)
    {
        lastMkt.wrap(value);
        lastMktOffset = offset;
        lastMktLength = length;
        return this;
    }

    public TradeCaptureReportEncoder lastMktAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(lastMkt, value, offset, length);
        lastMktOffset = offset;
        lastMktLength = length;
        return this;
    }

    public TradeCaptureReportEncoder lastMkt(final byte[] value, final int length)
    {
        return lastMkt(value, 0, length);
    }

    public TradeCaptureReportEncoder lastMkt(final byte[] value)
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

    public TradeCaptureReportEncoder lastMkt(final CharSequence value)
    {
        toBytes(value, lastMkt);
        lastMktOffset = 0;
        lastMktLength = value.length();
        return this;
    }

    public TradeCaptureReportEncoder lastMkt(final AsciiSequenceView value)
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

    public TradeCaptureReportEncoder lastMkt(final char[] value)
    {
        return lastMkt(value, 0, value.length);
    }

    public TradeCaptureReportEncoder lastMkt(final char[] value, final int length)
    {
        return lastMkt(value, 0, length);
    }

    public TradeCaptureReportEncoder lastMkt(final char[] value, final int offset, final int length)
    {
        toBytes(value, lastMkt, offset, length);
        lastMktOffset = 0;
        lastMktLength = length;
        return this;
    }

    private final MutableDirectBuffer tradeDate = new UnsafeBuffer();

    private int tradeDateOffset = 0;

    private int tradeDateLength = 0;

    public TradeCaptureReportEncoder tradeDate(final DirectBuffer value, final int offset, final int length)
    {
        tradeDate.wrap(value);
        tradeDateOffset = offset;
        tradeDateLength = length;
        return this;
    }

    public TradeCaptureReportEncoder tradeDate(final DirectBuffer value, final int length)
    {
        return tradeDate(value, 0, length);
    }

    public TradeCaptureReportEncoder tradeDate(final DirectBuffer value)
    {
        return tradeDate(value, 0, value.capacity());
    }

    public TradeCaptureReportEncoder tradeDate(final byte[] value, final int offset, final int length)
    {
        tradeDate.wrap(value);
        tradeDateOffset = offset;
        tradeDateLength = length;
        return this;
    }

    public TradeCaptureReportEncoder tradeDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradeDate, value, offset, length);
        tradeDateOffset = offset;
        tradeDateLength = length;
        return this;
    }

    public TradeCaptureReportEncoder tradeDate(final byte[] value, final int length)
    {
        return tradeDate(value, 0, length);
    }

    public TradeCaptureReportEncoder tradeDate(final byte[] value)
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

    public TradeCaptureReportEncoder clearingBusinessDate(final DirectBuffer value, final int offset, final int length)
    {
        clearingBusinessDate.wrap(value);
        clearingBusinessDateOffset = offset;
        clearingBusinessDateLength = length;
        return this;
    }

    public TradeCaptureReportEncoder clearingBusinessDate(final DirectBuffer value, final int length)
    {
        return clearingBusinessDate(value, 0, length);
    }

    public TradeCaptureReportEncoder clearingBusinessDate(final DirectBuffer value)
    {
        return clearingBusinessDate(value, 0, value.capacity());
    }

    public TradeCaptureReportEncoder clearingBusinessDate(final byte[] value, final int offset, final int length)
    {
        clearingBusinessDate.wrap(value);
        clearingBusinessDateOffset = offset;
        clearingBusinessDateLength = length;
        return this;
    }

    public TradeCaptureReportEncoder clearingBusinessDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(clearingBusinessDate, value, offset, length);
        clearingBusinessDateOffset = offset;
        clearingBusinessDateLength = length;
        return this;
    }

    public TradeCaptureReportEncoder clearingBusinessDate(final byte[] value, final int length)
    {
        return clearingBusinessDate(value, 0, length);
    }

    public TradeCaptureReportEncoder clearingBusinessDate(final byte[] value)
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

    public TradeCaptureReportEncoder avgPx(DecimalFloat value)
    {
        avgPx.set(value);
        hasAvgPx = true;
        return this;
    }

    public TradeCaptureReportEncoder avgPx(long value, int scale)
    {
        avgPx.set(value, scale);
        hasAvgPx = true;
        return this;
    }

    public DecimalFloat avgPx()
    {
        return avgPx;
    }

    private final SpreadOrBenchmarkCurveDataEncoder spreadOrBenchmarkCurveData = new SpreadOrBenchmarkCurveDataEncoder();
    public SpreadOrBenchmarkCurveDataEncoder spreadOrBenchmarkCurveData()
    {
        return spreadOrBenchmarkCurveData;
    }

    private int avgPxIndicator;

    private boolean hasAvgPxIndicator;

    public boolean hasAvgPxIndicator()
    {
        return hasAvgPxIndicator;
    }

    public TradeCaptureReportEncoder avgPxIndicator(int value)
    {
        avgPxIndicator = value;
        hasAvgPxIndicator = true;
        return this;
    }

    public int avgPxIndicator()
    {
        return avgPxIndicator;
    }

    public TradeCaptureReportEncoder avgPxIndicator(AvgPxIndicator value)
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

    private final PositionAmountDataEncoder positionAmountData = new PositionAmountDataEncoder();
    public PositionAmountDataEncoder positionAmountData()
    {
        return positionAmountData;
    }

    private char multiLegReportingType;

    private boolean hasMultiLegReportingType;

    public boolean hasMultiLegReportingType()
    {
        return hasMultiLegReportingType;
    }

    public TradeCaptureReportEncoder multiLegReportingType(char value)
    {
        multiLegReportingType = value;
        hasMultiLegReportingType = true;
        return this;
    }

    public char multiLegReportingType()
    {
        return multiLegReportingType;
    }

    public TradeCaptureReportEncoder multiLegReportingType(MultiLegReportingType value)
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

    public TradeCaptureReportEncoder tradeLegRefID(final DirectBuffer value, final int offset, final int length)
    {
        tradeLegRefID.wrap(value);
        tradeLegRefIDOffset = offset;
        tradeLegRefIDLength = length;
        return this;
    }

    public TradeCaptureReportEncoder tradeLegRefID(final DirectBuffer value, final int length)
    {
        return tradeLegRefID(value, 0, length);
    }

    public TradeCaptureReportEncoder tradeLegRefID(final DirectBuffer value)
    {
        return tradeLegRefID(value, 0, value.capacity());
    }

    public TradeCaptureReportEncoder tradeLegRefID(final byte[] value, final int offset, final int length)
    {
        tradeLegRefID.wrap(value);
        tradeLegRefIDOffset = offset;
        tradeLegRefIDLength = length;
        return this;
    }

    public TradeCaptureReportEncoder tradeLegRefIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradeLegRefID, value, offset, length);
        tradeLegRefIDOffset = offset;
        tradeLegRefIDLength = length;
        return this;
    }

    public TradeCaptureReportEncoder tradeLegRefID(final byte[] value, final int length)
    {
        return tradeLegRefID(value, 0, length);
    }

    public TradeCaptureReportEncoder tradeLegRefID(final byte[] value)
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

    public TradeCaptureReportEncoder tradeLegRefID(final CharSequence value)
    {
        toBytes(value, tradeLegRefID);
        tradeLegRefIDOffset = 0;
        tradeLegRefIDLength = value.length();
        return this;
    }

    public TradeCaptureReportEncoder tradeLegRefID(final AsciiSequenceView value)
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

    public TradeCaptureReportEncoder tradeLegRefID(final char[] value)
    {
        return tradeLegRefID(value, 0, value.length);
    }

    public TradeCaptureReportEncoder tradeLegRefID(final char[] value, final int length)
    {
        return tradeLegRefID(value, 0, length);
    }

    public TradeCaptureReportEncoder tradeLegRefID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradeLegRefID, offset, length);
        tradeLegRefIDOffset = 0;
        tradeLegRefIDLength = length;
        return this;
    }

    private final TrdInstrmtLegGrpEncoder trdInstrmtLegGrp = new TrdInstrmtLegGrpEncoder();
    public TrdInstrmtLegGrpEncoder trdInstrmtLegGrp()
    {
        return trdInstrmtLegGrp;
    }

    private final MutableDirectBuffer transactTime = new UnsafeBuffer();

    private int transactTimeOffset = 0;

    private int transactTimeLength = 0;

    public TradeCaptureReportEncoder transactTime(final DirectBuffer value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public TradeCaptureReportEncoder transactTime(final DirectBuffer value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public TradeCaptureReportEncoder transactTime(final DirectBuffer value)
    {
        return transactTime(value, 0, value.capacity());
    }

    public TradeCaptureReportEncoder transactTime(final byte[] value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public TradeCaptureReportEncoder transactTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(transactTime, value, offset, length);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public TradeCaptureReportEncoder transactTime(final byte[] value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public TradeCaptureReportEncoder transactTime(final byte[] value)
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

    private final MutableDirectBuffer settlType = new UnsafeBuffer();

    private int settlTypeOffset = 0;

    private int settlTypeLength = 0;

    public TradeCaptureReportEncoder settlType(final DirectBuffer value, final int offset, final int length)
    {
        settlType.wrap(value);
        settlTypeOffset = offset;
        settlTypeLength = length;
        return this;
    }

    public TradeCaptureReportEncoder settlType(final DirectBuffer value, final int length)
    {
        return settlType(value, 0, length);
    }

    public TradeCaptureReportEncoder settlType(final DirectBuffer value)
    {
        return settlType(value, 0, value.capacity());
    }

    public TradeCaptureReportEncoder settlType(final byte[] value, final int offset, final int length)
    {
        settlType.wrap(value);
        settlTypeOffset = offset;
        settlTypeLength = length;
        return this;
    }

    public TradeCaptureReportEncoder settlTypeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlType, value, offset, length);
        settlTypeOffset = offset;
        settlTypeLength = length;
        return this;
    }

    public TradeCaptureReportEncoder settlType(final byte[] value, final int length)
    {
        return settlType(value, 0, length);
    }

    public TradeCaptureReportEncoder settlType(final byte[] value)
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

    public TradeCaptureReportEncoder settlType(final CharSequence value)
    {
        toBytes(value, settlType);
        settlTypeOffset = 0;
        settlTypeLength = value.length();
        return this;
    }

    public TradeCaptureReportEncoder settlType(final AsciiSequenceView value)
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

    public TradeCaptureReportEncoder settlType(final char[] value)
    {
        return settlType(value, 0, value.length);
    }

    public TradeCaptureReportEncoder settlType(final char[] value, final int length)
    {
        return settlType(value, 0, length);
    }

    public TradeCaptureReportEncoder settlType(final char[] value, final int offset, final int length)
    {
        toBytes(value, settlType, offset, length);
        settlTypeOffset = 0;
        settlTypeLength = length;
        return this;
    }

    public TradeCaptureReportEncoder settlType(SettlType value)
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

    private final MutableDirectBuffer settlDate = new UnsafeBuffer();

    private int settlDateOffset = 0;

    private int settlDateLength = 0;

    public TradeCaptureReportEncoder settlDate(final DirectBuffer value, final int offset, final int length)
    {
        settlDate.wrap(value);
        settlDateOffset = offset;
        settlDateLength = length;
        return this;
    }

    public TradeCaptureReportEncoder settlDate(final DirectBuffer value, final int length)
    {
        return settlDate(value, 0, length);
    }

    public TradeCaptureReportEncoder settlDate(final DirectBuffer value)
    {
        return settlDate(value, 0, value.capacity());
    }

    public TradeCaptureReportEncoder settlDate(final byte[] value, final int offset, final int length)
    {
        settlDate.wrap(value);
        settlDateOffset = offset;
        settlDateLength = length;
        return this;
    }

    public TradeCaptureReportEncoder settlDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlDate, value, offset, length);
        settlDateOffset = offset;
        settlDateLength = length;
        return this;
    }

    public TradeCaptureReportEncoder settlDate(final byte[] value, final int length)
    {
        return settlDate(value, 0, length);
    }

    public TradeCaptureReportEncoder settlDate(final byte[] value)
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

    private final MutableDirectBuffer underlyingSettlementDate = new UnsafeBuffer();

    private int underlyingSettlementDateOffset = 0;

    private int underlyingSettlementDateLength = 0;

    public TradeCaptureReportEncoder underlyingSettlementDate(final DirectBuffer value, final int offset, final int length)
    {
        underlyingSettlementDate.wrap(value);
        underlyingSettlementDateOffset = offset;
        underlyingSettlementDateLength = length;
        return this;
    }

    public TradeCaptureReportEncoder underlyingSettlementDate(final DirectBuffer value, final int length)
    {
        return underlyingSettlementDate(value, 0, length);
    }

    public TradeCaptureReportEncoder underlyingSettlementDate(final DirectBuffer value)
    {
        return underlyingSettlementDate(value, 0, value.capacity());
    }

    public TradeCaptureReportEncoder underlyingSettlementDate(final byte[] value, final int offset, final int length)
    {
        underlyingSettlementDate.wrap(value);
        underlyingSettlementDateOffset = offset;
        underlyingSettlementDateLength = length;
        return this;
    }

    public TradeCaptureReportEncoder underlyingSettlementDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(underlyingSettlementDate, value, offset, length);
        underlyingSettlementDateOffset = offset;
        underlyingSettlementDateLength = length;
        return this;
    }

    public TradeCaptureReportEncoder underlyingSettlementDate(final byte[] value, final int length)
    {
        return underlyingSettlementDate(value, 0, length);
    }

    public TradeCaptureReportEncoder underlyingSettlementDate(final byte[] value)
    {
        return underlyingSettlementDate(value, 0, value.length);
    }

    public boolean hasUnderlyingSettlementDate()
    {
        return underlyingSettlementDateLength > 0;
    }

    public MutableDirectBuffer underlyingSettlementDate()
    {
        return underlyingSettlementDate;
    }

    public String underlyingSettlementDateAsString()
    {
        return underlyingSettlementDate.getStringWithoutLengthAscii(underlyingSettlementDateOffset, underlyingSettlementDateLength);
    }

    private char matchStatus;

    private boolean hasMatchStatus;

    public boolean hasMatchStatus()
    {
        return hasMatchStatus;
    }

    public TradeCaptureReportEncoder matchStatus(char value)
    {
        matchStatus = value;
        hasMatchStatus = true;
        return this;
    }

    public char matchStatus()
    {
        return matchStatus;
    }

    public TradeCaptureReportEncoder matchStatus(MatchStatus value)
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

    public TradeCaptureReportEncoder matchType(final DirectBuffer value, final int offset, final int length)
    {
        matchType.wrap(value);
        matchTypeOffset = offset;
        matchTypeLength = length;
        return this;
    }

    public TradeCaptureReportEncoder matchType(final DirectBuffer value, final int length)
    {
        return matchType(value, 0, length);
    }

    public TradeCaptureReportEncoder matchType(final DirectBuffer value)
    {
        return matchType(value, 0, value.capacity());
    }

    public TradeCaptureReportEncoder matchType(final byte[] value, final int offset, final int length)
    {
        matchType.wrap(value);
        matchTypeOffset = offset;
        matchTypeLength = length;
        return this;
    }

    public TradeCaptureReportEncoder matchTypeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(matchType, value, offset, length);
        matchTypeOffset = offset;
        matchTypeLength = length;
        return this;
    }

    public TradeCaptureReportEncoder matchType(final byte[] value, final int length)
    {
        return matchType(value, 0, length);
    }

    public TradeCaptureReportEncoder matchType(final byte[] value)
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

    public TradeCaptureReportEncoder matchType(final CharSequence value)
    {
        toBytes(value, matchType);
        matchTypeOffset = 0;
        matchTypeLength = value.length();
        return this;
    }

    public TradeCaptureReportEncoder matchType(final AsciiSequenceView value)
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

    public TradeCaptureReportEncoder matchType(final char[] value)
    {
        return matchType(value, 0, value.length);
    }

    public TradeCaptureReportEncoder matchType(final char[] value, final int length)
    {
        return matchType(value, 0, length);
    }

    public TradeCaptureReportEncoder matchType(final char[] value, final int offset, final int length)
    {
        toBytes(value, matchType, offset, length);
        matchTypeOffset = 0;
        matchTypeLength = length;
        return this;
    }

    public TradeCaptureReportEncoder matchType(MatchType value)
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

    private final TrdCapRptSideGrpEncoder trdCapRptSideGrp = new TrdCapRptSideGrpEncoder();
    public TrdCapRptSideGrpEncoder trdCapRptSideGrp()
    {
        return trdCapRptSideGrp;
    }

    private final DecimalFloat volatility = new DecimalFloat();

    private boolean hasVolatility;

    public boolean hasVolatility()
    {
        return hasVolatility;
    }

    public TradeCaptureReportEncoder volatility(DecimalFloat value)
    {
        volatility.set(value);
        hasVolatility = true;
        return this;
    }

    public TradeCaptureReportEncoder volatility(long value, int scale)
    {
        volatility.set(value, scale);
        hasVolatility = true;
        return this;
    }

    public DecimalFloat volatility()
    {
        return volatility;
    }

    private final DecimalFloat dividendYield = new DecimalFloat();

    private boolean hasDividendYield;

    public boolean hasDividendYield()
    {
        return hasDividendYield;
    }

    public TradeCaptureReportEncoder dividendYield(DecimalFloat value)
    {
        dividendYield.set(value);
        hasDividendYield = true;
        return this;
    }

    public TradeCaptureReportEncoder dividendYield(long value, int scale)
    {
        dividendYield.set(value, scale);
        hasDividendYield = true;
        return this;
    }

    public DecimalFloat dividendYield()
    {
        return dividendYield;
    }

    private final DecimalFloat riskFreeRate = new DecimalFloat();

    private boolean hasRiskFreeRate;

    public boolean hasRiskFreeRate()
    {
        return hasRiskFreeRate;
    }

    public TradeCaptureReportEncoder riskFreeRate(DecimalFloat value)
    {
        riskFreeRate.set(value);
        hasRiskFreeRate = true;
        return this;
    }

    public TradeCaptureReportEncoder riskFreeRate(long value, int scale)
    {
        riskFreeRate.set(value, scale);
        hasRiskFreeRate = true;
        return this;
    }

    public DecimalFloat riskFreeRate()
    {
        return riskFreeRate;
    }

    private final DecimalFloat currencyRatio = new DecimalFloat();

    private boolean hasCurrencyRatio;

    public boolean hasCurrencyRatio()
    {
        return hasCurrencyRatio;
    }

    public TradeCaptureReportEncoder currencyRatio(DecimalFloat value)
    {
        currencyRatio.set(value);
        hasCurrencyRatio = true;
        return this;
    }

    public TradeCaptureReportEncoder currencyRatio(long value, int scale)
    {
        currencyRatio.set(value, scale);
        hasCurrencyRatio = true;
        return this;
    }

    public DecimalFloat currencyRatio()
    {
        return currencyRatio;
    }

    private boolean copyMsgIndicator;

    private boolean hasCopyMsgIndicator;

    public boolean hasCopyMsgIndicator()
    {
        return hasCopyMsgIndicator;
    }

    public TradeCaptureReportEncoder copyMsgIndicator(boolean value)
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

    public TradeCaptureReportEncoder publishTrdIndicator(boolean value)
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

    public TradeCaptureReportEncoder tradePublishIndicator(int value)
    {
        tradePublishIndicator = value;
        hasTradePublishIndicator = true;
        return this;
    }

    public int tradePublishIndicator()
    {
        return tradePublishIndicator;
    }

    public TradeCaptureReportEncoder tradePublishIndicator(TradePublishIndicator value)
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

    public TradeCaptureReportEncoder shortSaleReason(int value)
    {
        shortSaleReason = value;
        hasShortSaleReason = true;
        return this;
    }

    public int shortSaleReason()
    {
        return shortSaleReason;
    }

    public TradeCaptureReportEncoder shortSaleReason(ShortSaleReason value)
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

    private final MutableDirectBuffer tierCode = new UnsafeBuffer();

    private int tierCodeOffset = 0;

    private int tierCodeLength = 0;

    public TradeCaptureReportEncoder tierCode(final DirectBuffer value, final int offset, final int length)
    {
        tierCode.wrap(value);
        tierCodeOffset = offset;
        tierCodeLength = length;
        return this;
    }

    public TradeCaptureReportEncoder tierCode(final DirectBuffer value, final int length)
    {
        return tierCode(value, 0, length);
    }

    public TradeCaptureReportEncoder tierCode(final DirectBuffer value)
    {
        return tierCode(value, 0, value.capacity());
    }

    public TradeCaptureReportEncoder tierCode(final byte[] value, final int offset, final int length)
    {
        tierCode.wrap(value);
        tierCodeOffset = offset;
        tierCodeLength = length;
        return this;
    }

    public TradeCaptureReportEncoder tierCodeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tierCode, value, offset, length);
        tierCodeOffset = offset;
        tierCodeLength = length;
        return this;
    }

    public TradeCaptureReportEncoder tierCode(final byte[] value, final int length)
    {
        return tierCode(value, 0, length);
    }

    public TradeCaptureReportEncoder tierCode(final byte[] value)
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

    public TradeCaptureReportEncoder tierCode(final CharSequence value)
    {
        toBytes(value, tierCode);
        tierCodeOffset = 0;
        tierCodeLength = value.length();
        return this;
    }

    public TradeCaptureReportEncoder tierCode(final AsciiSequenceView value)
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

    public TradeCaptureReportEncoder tierCode(final char[] value)
    {
        return tierCode(value, 0, value.length);
    }

    public TradeCaptureReportEncoder tierCode(final char[] value, final int length)
    {
        return tierCode(value, 0, length);
    }

    public TradeCaptureReportEncoder tierCode(final char[] value, final int offset, final int length)
    {
        toBytes(value, tierCode, offset, length);
        tierCodeOffset = 0;
        tierCodeLength = length;
        return this;
    }

    private final MutableDirectBuffer messageEventSource = new UnsafeBuffer();

    private int messageEventSourceOffset = 0;

    private int messageEventSourceLength = 0;

    public TradeCaptureReportEncoder messageEventSource(final DirectBuffer value, final int offset, final int length)
    {
        messageEventSource.wrap(value);
        messageEventSourceOffset = offset;
        messageEventSourceLength = length;
        return this;
    }

    public TradeCaptureReportEncoder messageEventSource(final DirectBuffer value, final int length)
    {
        return messageEventSource(value, 0, length);
    }

    public TradeCaptureReportEncoder messageEventSource(final DirectBuffer value)
    {
        return messageEventSource(value, 0, value.capacity());
    }

    public TradeCaptureReportEncoder messageEventSource(final byte[] value, final int offset, final int length)
    {
        messageEventSource.wrap(value);
        messageEventSourceOffset = offset;
        messageEventSourceLength = length;
        return this;
    }

    public TradeCaptureReportEncoder messageEventSourceAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(messageEventSource, value, offset, length);
        messageEventSourceOffset = offset;
        messageEventSourceLength = length;
        return this;
    }

    public TradeCaptureReportEncoder messageEventSource(final byte[] value, final int length)
    {
        return messageEventSource(value, 0, length);
    }

    public TradeCaptureReportEncoder messageEventSource(final byte[] value)
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

    public TradeCaptureReportEncoder messageEventSource(final CharSequence value)
    {
        toBytes(value, messageEventSource);
        messageEventSourceOffset = 0;
        messageEventSourceLength = value.length();
        return this;
    }

    public TradeCaptureReportEncoder messageEventSource(final AsciiSequenceView value)
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

    public TradeCaptureReportEncoder messageEventSource(final char[] value)
    {
        return messageEventSource(value, 0, value.length);
    }

    public TradeCaptureReportEncoder messageEventSource(final char[] value, final int length)
    {
        return messageEventSource(value, 0, length);
    }

    public TradeCaptureReportEncoder messageEventSource(final char[] value, final int offset, final int length)
    {
        toBytes(value, messageEventSource, offset, length);
        messageEventSourceOffset = 0;
        messageEventSourceLength = length;
        return this;
    }

    private final MutableDirectBuffer lastUpdateTime = new UnsafeBuffer();

    private int lastUpdateTimeOffset = 0;

    private int lastUpdateTimeLength = 0;

    public TradeCaptureReportEncoder lastUpdateTime(final DirectBuffer value, final int offset, final int length)
    {
        lastUpdateTime.wrap(value);
        lastUpdateTimeOffset = offset;
        lastUpdateTimeLength = length;
        return this;
    }

    public TradeCaptureReportEncoder lastUpdateTime(final DirectBuffer value, final int length)
    {
        return lastUpdateTime(value, 0, length);
    }

    public TradeCaptureReportEncoder lastUpdateTime(final DirectBuffer value)
    {
        return lastUpdateTime(value, 0, value.capacity());
    }

    public TradeCaptureReportEncoder lastUpdateTime(final byte[] value, final int offset, final int length)
    {
        lastUpdateTime.wrap(value);
        lastUpdateTimeOffset = offset;
        lastUpdateTimeLength = length;
        return this;
    }

    public TradeCaptureReportEncoder lastUpdateTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(lastUpdateTime, value, offset, length);
        lastUpdateTimeOffset = offset;
        lastUpdateTimeLength = length;
        return this;
    }

    public TradeCaptureReportEncoder lastUpdateTime(final byte[] value, final int length)
    {
        return lastUpdateTime(value, 0, length);
    }

    public TradeCaptureReportEncoder lastUpdateTime(final byte[] value)
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

    public TradeCaptureReportEncoder rndPx(DecimalFloat value)
    {
        rndPx.set(value);
        hasRndPx = true;
        return this;
    }

    public TradeCaptureReportEncoder rndPx(long value, int scale)
    {
        rndPx.set(value, scale);
        hasRndPx = true;
        return this;
    }

    public DecimalFloat rndPx()
    {
        return rndPx;
    }

    private final MutableDirectBuffer tZTransactTime = new UnsafeBuffer();

    private int tZTransactTimeOffset = 0;

    private int tZTransactTimeLength = 0;

    public TradeCaptureReportEncoder tZTransactTime(final DirectBuffer value, final int offset, final int length)
    {
        tZTransactTime.wrap(value);
        tZTransactTimeOffset = offset;
        tZTransactTimeLength = length;
        return this;
    }

    public TradeCaptureReportEncoder tZTransactTime(final DirectBuffer value, final int length)
    {
        return tZTransactTime(value, 0, length);
    }

    public TradeCaptureReportEncoder tZTransactTime(final DirectBuffer value)
    {
        return tZTransactTime(value, 0, value.capacity());
    }

    public TradeCaptureReportEncoder tZTransactTime(final byte[] value, final int offset, final int length)
    {
        tZTransactTime.wrap(value);
        tZTransactTimeOffset = offset;
        tZTransactTimeLength = length;
        return this;
    }

    public TradeCaptureReportEncoder tZTransactTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tZTransactTime, value, offset, length);
        tZTransactTimeOffset = offset;
        tZTransactTimeLength = length;
        return this;
    }

    public TradeCaptureReportEncoder tZTransactTime(final byte[] value, final int length)
    {
        return tZTransactTime(value, 0, length);
    }

    public TradeCaptureReportEncoder tZTransactTime(final byte[] value)
    {
        return tZTransactTime(value, 0, value.length);
    }

    public boolean hasTZTransactTime()
    {
        return tZTransactTimeLength > 0;
    }

    public MutableDirectBuffer tZTransactTime()
    {
        return tZTransactTime;
    }

    public String tZTransactTimeAsString()
    {
        return tZTransactTime.getStringWithoutLengthAscii(tZTransactTimeOffset, tZTransactTimeLength);
    }

    private boolean reportedPxDiff;

    private boolean hasReportedPxDiff;

    public boolean hasReportedPxDiff()
    {
        return hasReportedPxDiff;
    }

    public TradeCaptureReportEncoder reportedPxDiff(boolean value)
    {
        reportedPxDiff = value;
        hasReportedPxDiff = true;
        return this;
    }

    public boolean reportedPxDiff()
    {
        return reportedPxDiff;
    }

    private final DecimalFloat grossTradeAmt = new DecimalFloat();

    private boolean hasGrossTradeAmt;

    public boolean hasGrossTradeAmt()
    {
        return hasGrossTradeAmt;
    }

    public TradeCaptureReportEncoder grossTradeAmt(DecimalFloat value)
    {
        grossTradeAmt.set(value);
        hasGrossTradeAmt = true;
        return this;
    }

    public TradeCaptureReportEncoder grossTradeAmt(long value, int scale)
    {
        grossTradeAmt.set(value, scale);
        hasGrossTradeAmt = true;
        return this;
    }

    public DecimalFloat grossTradeAmt()
    {
        return grossTradeAmt;
    }

    private final MutableDirectBuffer rejectText = new UnsafeBuffer();

    private int rejectTextOffset = 0;

    private int rejectTextLength = 0;

    public TradeCaptureReportEncoder rejectText(final DirectBuffer value, final int offset, final int length)
    {
        rejectText.wrap(value);
        rejectTextOffset = offset;
        rejectTextLength = length;
        return this;
    }

    public TradeCaptureReportEncoder rejectText(final DirectBuffer value, final int length)
    {
        return rejectText(value, 0, length);
    }

    public TradeCaptureReportEncoder rejectText(final DirectBuffer value)
    {
        return rejectText(value, 0, value.capacity());
    }

    public TradeCaptureReportEncoder rejectText(final byte[] value, final int offset, final int length)
    {
        rejectText.wrap(value);
        rejectTextOffset = offset;
        rejectTextLength = length;
        return this;
    }

    public TradeCaptureReportEncoder rejectTextAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(rejectText, value, offset, length);
        rejectTextOffset = offset;
        rejectTextLength = length;
        return this;
    }

    public TradeCaptureReportEncoder rejectText(final byte[] value, final int length)
    {
        return rejectText(value, 0, length);
    }

    public TradeCaptureReportEncoder rejectText(final byte[] value)
    {
        return rejectText(value, 0, value.length);
    }

    public boolean hasRejectText()
    {
        return rejectTextLength > 0;
    }

    public MutableDirectBuffer rejectText()
    {
        return rejectText;
    }

    public String rejectTextAsString()
    {
        return rejectText.getStringWithoutLengthAscii(rejectTextOffset, rejectTextLength);
    }

    public TradeCaptureReportEncoder rejectText(final CharSequence value)
    {
        toBytes(value, rejectText);
        rejectTextOffset = 0;
        rejectTextLength = value.length();
        return this;
    }

    public TradeCaptureReportEncoder rejectText(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            rejectText.wrap(buffer);
            rejectTextOffset = value.offset();
            rejectTextLength = value.length();
        }
        return this;
    }

    public TradeCaptureReportEncoder rejectText(final char[] value)
    {
        return rejectText(value, 0, value.length);
    }

    public TradeCaptureReportEncoder rejectText(final char[] value, final int length)
    {
        return rejectText(value, 0, length);
    }

    public TradeCaptureReportEncoder rejectText(final char[] value, final int offset, final int length)
    {
        toBytes(value, rejectText, offset, length);
        rejectTextOffset = 0;
        rejectTextLength = length;
        return this;
    }

    private final DecimalFloat feeMultiplier = new DecimalFloat();

    private boolean hasFeeMultiplier;

    public boolean hasFeeMultiplier()
    {
        return hasFeeMultiplier;
    }

    public TradeCaptureReportEncoder feeMultiplier(DecimalFloat value)
    {
        feeMultiplier.set(value);
        hasFeeMultiplier = true;
        return this;
    }

    public TradeCaptureReportEncoder feeMultiplier(long value, int scale)
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

            position += applicationSequenceControl.encode(buffer, position);

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

        if (hasTrdRptStatus)
        {
            buffer.putBytes(position, trdRptStatusHeader, 0, trdRptStatusHeaderLength);
            position += trdRptStatusHeaderLength;
            position += buffer.putIntAscii(position, trdRptStatus);
            buffer.putSeparator(position);
            position++;
        }

        if (tradeRequestIDLength > 0)
        {
            buffer.putBytes(position, tradeRequestIDHeader, 0, tradeRequestIDHeaderLength);
            position += tradeRequestIDHeaderLength;
            buffer.putBytes(position, tradeRequestID, tradeRequestIDOffset, tradeRequestIDLength);
            position += tradeRequestIDLength;
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

        if (hasExecType)
        {
            buffer.putBytes(position, execTypeHeader, 0, execTypeHeaderLength);
            position += execTypeHeaderLength;
            position += buffer.putCharAscii(position, execType);
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

        if (hasLastRptRequested)
        {
            buffer.putBytes(position, lastRptRequestedHeader, 0, lastRptRequestedHeaderLength);
            position += lastRptRequestedHeaderLength;
            position += buffer.putBooleanAscii(position, lastRptRequested);
            buffer.putSeparator(position);
            position++;
        }

        if (hasUnsolicitedIndicator)
        {
            buffer.putBytes(position, unsolicitedIndicatorHeader, 0, unsolicitedIndicatorHeaderLength);
            position += unsolicitedIndicatorHeaderLength;
            position += buffer.putBooleanAscii(position, unsolicitedIndicator);
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

        if (secondaryTradeReportIDLength > 0)
        {
            buffer.putBytes(position, secondaryTradeReportIDHeader, 0, secondaryTradeReportIDHeaderLength);
            position += secondaryTradeReportIDHeaderLength;
            buffer.putBytes(position, secondaryTradeReportID, secondaryTradeReportIDOffset, secondaryTradeReportIDLength);
            position += secondaryTradeReportIDLength;
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

            position += rootParties.encode(buffer, position);

        if (hasAsOfIndicator)
        {
            buffer.putBytes(position, asOfIndicatorHeader, 0, asOfIndicatorHeaderLength);
            position += asOfIndicatorHeaderLength;
            position += buffer.putCharAscii(position, asOfIndicator);
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

            position += financingDetails.encode(buffer, position);

        if (hasQtyType)
        {
            buffer.putBytes(position, qtyTypeHeader, 0, qtyTypeHeaderLength);
            position += qtyTypeHeaderLength;
            position += buffer.putIntAscii(position, qtyType);
            buffer.putSeparator(position);
            position++;
        }

            position += yieldData.encode(buffer, position);

            position += undInstrmtGrp.encode(buffer, position);

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

        if (hasLastQty)
        {
            buffer.putBytes(position, lastQtyHeader, 0, lastQtyHeaderLength);
            position += lastQtyHeaderLength;
            position += buffer.putFloatAscii(position, lastQty);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: LastQty");
        }

        if (hasLastPx)
        {
            buffer.putBytes(position, lastPxHeader, 0, lastPxHeaderLength);
            position += lastPxHeaderLength;
            position += buffer.putFloatAscii(position, lastPx);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: LastPx");
        }

        if (hasCalculatedCcyLastQty)
        {
            buffer.putBytes(position, calculatedCcyLastQtyHeader, 0, calculatedCcyLastQtyHeaderLength);
            position += calculatedCcyLastQtyHeaderLength;
            position += buffer.putFloatAscii(position, calculatedCcyLastQty);
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

        if (hasLastParPx)
        {
            buffer.putBytes(position, lastParPxHeader, 0, lastParPxHeaderLength);
            position += lastParPxHeaderLength;
            position += buffer.putFloatAscii(position, lastParPx);
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

        if (hasLastSwapPoints)
        {
            buffer.putBytes(position, lastSwapPointsHeader, 0, lastSwapPointsHeaderLength);
            position += lastSwapPointsHeaderLength;
            position += buffer.putFloatAscii(position, lastSwapPoints);
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

            position += spreadOrBenchmarkCurveData.encode(buffer, position);

        if (hasAvgPxIndicator)
        {
            buffer.putBytes(position, avgPxIndicatorHeader, 0, avgPxIndicatorHeaderLength);
            position += avgPxIndicatorHeaderLength;
            position += buffer.putIntAscii(position, avgPxIndicator);
            buffer.putSeparator(position);
            position++;
        }

            position += positionAmountData.encode(buffer, position);

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

            position += trdInstrmtLegGrp.encode(buffer, position);

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

        if (settlTypeLength > 0)
        {
            buffer.putBytes(position, settlTypeHeader, 0, settlTypeHeaderLength);
            position += settlTypeHeaderLength;
            buffer.putBytes(position, settlType, settlTypeOffset, settlTypeLength);
            position += settlTypeLength;
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

        if (underlyingSettlementDateLength > 0)
        {
            buffer.putBytes(position, underlyingSettlementDateHeader, 0, underlyingSettlementDateHeaderLength);
            position += underlyingSettlementDateHeaderLength;
            buffer.putBytes(position, underlyingSettlementDate, underlyingSettlementDateOffset, underlyingSettlementDateLength);
            position += underlyingSettlementDateLength;
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

        if (matchTypeLength > 0)
        {
            buffer.putBytes(position, matchTypeHeader, 0, matchTypeHeaderLength);
            position += matchTypeHeaderLength;
            buffer.putBytes(position, matchType, matchTypeOffset, matchTypeLength);
            position += matchTypeLength;
            buffer.putSeparator(position);
            position++;
        }

            position += trdCapRptSideGrp.encode(buffer, position);

        if (hasVolatility)
        {
            buffer.putBytes(position, volatilityHeader, 0, volatilityHeaderLength);
            position += volatilityHeaderLength;
            position += buffer.putFloatAscii(position, volatility);
            buffer.putSeparator(position);
            position++;
        }

        if (hasDividendYield)
        {
            buffer.putBytes(position, dividendYieldHeader, 0, dividendYieldHeaderLength);
            position += dividendYieldHeaderLength;
            position += buffer.putFloatAscii(position, dividendYield);
            buffer.putSeparator(position);
            position++;
        }

        if (hasRiskFreeRate)
        {
            buffer.putBytes(position, riskFreeRateHeader, 0, riskFreeRateHeaderLength);
            position += riskFreeRateHeaderLength;
            position += buffer.putFloatAscii(position, riskFreeRate);
            buffer.putSeparator(position);
            position++;
        }

        if (hasCurrencyRatio)
        {
            buffer.putBytes(position, currencyRatioHeader, 0, currencyRatioHeaderLength);
            position += currencyRatioHeaderLength;
            position += buffer.putFloatAscii(position, currencyRatio);
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

        if (tZTransactTimeLength > 0)
        {
            buffer.putBytes(position, tZTransactTimeHeader, 0, tZTransactTimeHeaderLength);
            position += tZTransactTimeHeaderLength;
            buffer.putBytes(position, tZTransactTime, tZTransactTimeOffset, tZTransactTimeLength);
            position += tZTransactTimeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasReportedPxDiff)
        {
            buffer.putBytes(position, reportedPxDiffHeader, 0, reportedPxDiffHeaderLength);
            position += reportedPxDiffHeaderLength;
            position += buffer.putBooleanAscii(position, reportedPxDiff);
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

        if (rejectTextLength > 0)
        {
            buffer.putBytes(position, rejectTextHeader, 0, rejectTextHeaderLength);
            position += rejectTextHeaderLength;
            buffer.putBytes(position, rejectText, rejectTextOffset, rejectTextLength);
            position += rejectTextLength;
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
        this.resetTrdRptStatus();
        this.resetTradeRequestID();
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
        this.resetTotNumTradeReports();
        this.resetLastRptRequested();
        this.resetUnsolicitedIndicator();
        this.resetSubscriptionRequestType();
        this.resetTradeReportRefID();
        this.resetSecondaryTradeReportRefID();
        this.resetSecondaryTradeReportID();
        this.resetTradeLinkID();
        this.resetTrdMatchID();
        this.resetExecID();
        this.resetSecondaryExecID();
        this.resetExecRestatementReason();
        this.resetPreviouslyReported();
        this.resetPriceType();
        this.resetAsOfIndicator();
        this.resetSettlSessID();
        this.resetSettlSessSubID();
        this.resetVenueType();
        this.resetMarketSegmentID();
        this.resetMarketID();
        this.resetQtyType();
        this.resetUnderlyingTradingSessionID();
        this.resetUnderlyingTradingSessionSubID();
        this.resetLastQty();
        this.resetLastPx();
        this.resetCalculatedCcyLastQty();
        this.resetCurrency();
        this.resetSettlCurrency();
        this.resetLastParPx();
        this.resetLastSpotRate();
        this.resetLastForwardPoints();
        this.resetLastSwapPoints();
        this.resetLastMkt();
        this.resetTradeDate();
        this.resetClearingBusinessDate();
        this.resetAvgPx();
        this.resetAvgPxIndicator();
        this.resetMultiLegReportingType();
        this.resetTradeLegRefID();
        this.resetTransactTime();
        this.resetSettlType();
        this.resetSettlDate();
        this.resetUnderlyingSettlementDate();
        this.resetMatchStatus();
        this.resetMatchType();
        this.resetVolatility();
        this.resetDividendYield();
        this.resetRiskFreeRate();
        this.resetCurrencyRatio();
        this.resetCopyMsgIndicator();
        this.resetPublishTrdIndicator();
        this.resetTradePublishIndicator();
        this.resetShortSaleReason();
        this.resetTierCode();
        this.resetMessageEventSource();
        this.resetLastUpdateTime();
        this.resetRndPx();
        this.resetTZTransactTime();
        this.resetReportedPxDiff();
        this.resetGrossTradeAmt();
        this.resetRejectText();
        this.resetFeeMultiplier();
        applicationSequenceControl.reset();
        rootParties.reset();
        instrument.reset();
        financingDetails.reset();
        yieldData.reset();
        undInstrmtGrp.reset();
        spreadOrBenchmarkCurveData.reset();
        positionAmountData.reset();
        trdInstrmtLegGrp.reset();
        trdRegTimestamps.reset();
        trdCapRptSideGrp.reset();
        trdRepIndicatorsGrp.reset();
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

    public void resetTrdRptStatus()
    {
        hasTrdRptStatus = false;
    }

    public void resetTradeRequestID()
    {
        tradeRequestIDLength = 0;
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

    public void resetTotNumTradeReports()
    {
        hasTotNumTradeReports = false;
    }

    public void resetLastRptRequested()
    {
        hasLastRptRequested = false;
    }

    public void resetUnsolicitedIndicator()
    {
        hasUnsolicitedIndicator = false;
    }

    public void resetSubscriptionRequestType()
    {
        hasSubscriptionRequestType = false;
    }

    public void resetTradeReportRefID()
    {
        tradeReportRefIDLength = 0;
    }

    public void resetSecondaryTradeReportRefID()
    {
        secondaryTradeReportRefIDLength = 0;
    }

    public void resetSecondaryTradeReportID()
    {
        secondaryTradeReportIDLength = 0;
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

    public void resetAsOfIndicator()
    {
        hasAsOfIndicator = false;
    }

    public void resetSettlSessID()
    {
        settlSessIDLength = 0;
    }

    public void resetSettlSessSubID()
    {
        settlSessSubIDLength = 0;
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

    public void resetQtyType()
    {
        hasQtyType = false;
    }

    public void resetUnderlyingTradingSessionID()
    {
        underlyingTradingSessionIDLength = 0;
    }

    public void resetUnderlyingTradingSessionSubID()
    {
        underlyingTradingSessionSubIDLength = 0;
    }

    public void resetLastQty()
    {
        hasLastQty = false;
    }

    public void resetLastPx()
    {
        hasLastPx = false;
    }

    public void resetCalculatedCcyLastQty()
    {
        hasCalculatedCcyLastQty = false;
    }

    public void resetCurrency()
    {
        currencyLength = 0;
    }

    public void resetSettlCurrency()
    {
        settlCurrencyLength = 0;
    }

    public void resetLastParPx()
    {
        hasLastParPx = false;
    }

    public void resetLastSpotRate()
    {
        hasLastSpotRate = false;
    }

    public void resetLastForwardPoints()
    {
        hasLastForwardPoints = false;
    }

    public void resetLastSwapPoints()
    {
        hasLastSwapPoints = false;
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

    public void resetSettlDate()
    {
        settlDateLength = 0;
    }

    public void resetUnderlyingSettlementDate()
    {
        underlyingSettlementDateLength = 0;
    }

    public void resetMatchStatus()
    {
        hasMatchStatus = false;
    }

    public void resetMatchType()
    {
        matchTypeLength = 0;
    }

    public void resetVolatility()
    {
        hasVolatility = false;
    }

    public void resetDividendYield()
    {
        hasDividendYield = false;
    }

    public void resetRiskFreeRate()
    {
        hasRiskFreeRate = false;
    }

    public void resetCurrencyRatio()
    {
        hasCurrencyRatio = false;
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

    public void resetTZTransactTime()
    {
        tZTransactTimeLength = 0;
    }

    public void resetReportedPxDiff()
    {
        hasReportedPxDiff = false;
    }

    public void resetGrossTradeAmt()
    {
        hasGrossTradeAmt = false;
    }

    public void resetRejectText()
    {
        rejectTextLength = 0;
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
        builder.append("\"MessageName\": \"TradeCaptureReport\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
    indent(builder, level);
    builder.append("\"ApplicationSequenceControl\": ");
    applicationSequenceControl.appendTo(builder, level + 1);
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

        if (hasTrdRptStatus())
        {
            indent(builder, level);
            builder.append("\"TrdRptStatus\": \"");
            builder.append(trdRptStatus);
            builder.append("\",\n");
        }

        if (hasTradeRequestID())
        {
            indent(builder, level);
            builder.append("\"TradeRequestID\": \"");
            appendBuffer(builder, tradeRequestID, tradeRequestIDOffset, tradeRequestIDLength);
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

        if (hasExecType())
        {
            indent(builder, level);
            builder.append("\"ExecType\": \"");
            builder.append(execType);
            builder.append("\",\n");
        }

        if (hasTotNumTradeReports())
        {
            indent(builder, level);
            builder.append("\"TotNumTradeReports\": \"");
            builder.append(totNumTradeReports);
            builder.append("\",\n");
        }

        if (hasLastRptRequested())
        {
            indent(builder, level);
            builder.append("\"LastRptRequested\": \"");
            builder.append(lastRptRequested);
            builder.append("\",\n");
        }

        if (hasUnsolicitedIndicator())
        {
            indent(builder, level);
            builder.append("\"UnsolicitedIndicator\": \"");
            builder.append(unsolicitedIndicator);
            builder.append("\",\n");
        }

        if (hasSubscriptionRequestType())
        {
            indent(builder, level);
            builder.append("\"SubscriptionRequestType\": \"");
            builder.append(subscriptionRequestType);
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

        if (hasSecondaryTradeReportID())
        {
            indent(builder, level);
            builder.append("\"SecondaryTradeReportID\": \"");
            appendBuffer(builder, secondaryTradeReportID, secondaryTradeReportIDOffset, secondaryTradeReportIDLength);
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

    indent(builder, level);
    builder.append("\"RootParties\": ");
    rootParties.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasAsOfIndicator())
        {
            indent(builder, level);
            builder.append("\"AsOfIndicator\": \"");
            builder.append(asOfIndicator);
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

    indent(builder, level);
    builder.append("\"FinancingDetails\": ");
    financingDetails.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasQtyType())
        {
            indent(builder, level);
            builder.append("\"QtyType\": \"");
            builder.append(qtyType);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"YieldData\": ");
    yieldData.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"UndInstrmtGrp\": ");
    undInstrmtGrp.appendTo(builder, level + 1);
    builder.append("\n");

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

        if (hasCalculatedCcyLastQty())
        {
            indent(builder, level);
            builder.append("\"CalculatedCcyLastQty\": \"");
            calculatedCcyLastQty.appendTo(builder);
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

        if (hasLastParPx())
        {
            indent(builder, level);
            builder.append("\"LastParPx\": \"");
            lastParPx.appendTo(builder);
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

        if (hasLastSwapPoints())
        {
            indent(builder, level);
            builder.append("\"LastSwapPoints\": \"");
            lastSwapPoints.appendTo(builder);
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

    indent(builder, level);
    builder.append("\"SpreadOrBenchmarkCurveData\": ");
    spreadOrBenchmarkCurveData.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasAvgPxIndicator())
        {
            indent(builder, level);
            builder.append("\"AvgPxIndicator\": \"");
            builder.append(avgPxIndicator);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"PositionAmountData\": ");
    positionAmountData.appendTo(builder, level + 1);
    builder.append("\n");

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

    indent(builder, level);
    builder.append("\"TrdInstrmtLegGrp\": ");
    trdInstrmtLegGrp.appendTo(builder, level + 1);
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

        if (hasSettlType())
        {
            indent(builder, level);
            builder.append("\"SettlType\": \"");
            appendBuffer(builder, settlType, settlTypeOffset, settlTypeLength);
            builder.append("\",\n");
        }

        if (hasSettlDate())
        {
            indent(builder, level);
            builder.append("\"SettlDate\": \"");
            appendBuffer(builder, settlDate, settlDateOffset, settlDateLength);
            builder.append("\",\n");
        }

        if (hasUnderlyingSettlementDate())
        {
            indent(builder, level);
            builder.append("\"UnderlyingSettlementDate\": \"");
            appendBuffer(builder, underlyingSettlementDate, underlyingSettlementDateOffset, underlyingSettlementDateLength);
            builder.append("\",\n");
        }

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

    indent(builder, level);
    builder.append("\"TrdCapRptSideGrp\": ");
    trdCapRptSideGrp.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasVolatility())
        {
            indent(builder, level);
            builder.append("\"Volatility\": \"");
            volatility.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasDividendYield())
        {
            indent(builder, level);
            builder.append("\"DividendYield\": \"");
            dividendYield.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasRiskFreeRate())
        {
            indent(builder, level);
            builder.append("\"RiskFreeRate\": \"");
            riskFreeRate.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasCurrencyRatio())
        {
            indent(builder, level);
            builder.append("\"CurrencyRatio\": \"");
            currencyRatio.appendTo(builder);
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

        if (hasTZTransactTime())
        {
            indent(builder, level);
            builder.append("\"TZTransactTime\": \"");
            appendBuffer(builder, tZTransactTime, tZTransactTimeOffset, tZTransactTimeLength);
            builder.append("\",\n");
        }

        if (hasReportedPxDiff())
        {
            indent(builder, level);
            builder.append("\"ReportedPxDiff\": \"");
            builder.append(reportedPxDiff);
            builder.append("\",\n");
        }

        if (hasGrossTradeAmt())
        {
            indent(builder, level);
            builder.append("\"GrossTradeAmt\": \"");
            grossTradeAmt.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasRejectText())
        {
            indent(builder, level);
            builder.append("\"RejectText\": \"");
            appendBuffer(builder, rejectText, rejectTextOffset, rejectTextLength);
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
    public TradeCaptureReportEncoder copyTo(final Encoder encoder)
    {
        return copyTo((TradeCaptureReportEncoder)encoder);
    }

    public TradeCaptureReportEncoder copyTo(final TradeCaptureReportEncoder encoder)
    {
        encoder.reset();

        applicationSequenceControl.copyTo(encoder.applicationSequenceControl());
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

        if (hasTrdRptStatus())
        {
            encoder.trdRptStatus(this.trdRptStatus());
        }

        if (hasTradeRequestID())
        {
            encoder.tradeRequestIDAsCopy(tradeRequestID.byteArray(), 0, tradeRequestIDLength);
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

        if (hasExecType())
        {
            encoder.execType(this.execType());
        }

        if (hasTotNumTradeReports())
        {
            encoder.totNumTradeReports(this.totNumTradeReports());
        }

        if (hasLastRptRequested())
        {
            encoder.lastRptRequested(this.lastRptRequested());
        }

        if (hasUnsolicitedIndicator())
        {
            encoder.unsolicitedIndicator(this.unsolicitedIndicator());
        }

        if (hasSubscriptionRequestType())
        {
            encoder.subscriptionRequestType(this.subscriptionRequestType());
        }

        if (hasTradeReportRefID())
        {
            encoder.tradeReportRefIDAsCopy(tradeReportRefID.byteArray(), 0, tradeReportRefIDLength);
        }

        if (hasSecondaryTradeReportRefID())
        {
            encoder.secondaryTradeReportRefIDAsCopy(secondaryTradeReportRefID.byteArray(), 0, secondaryTradeReportRefIDLength);
        }

        if (hasSecondaryTradeReportID())
        {
            encoder.secondaryTradeReportIDAsCopy(secondaryTradeReportID.byteArray(), 0, secondaryTradeReportIDLength);
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


        rootParties.copyTo(encoder.rootParties());
        if (hasAsOfIndicator())
        {
            encoder.asOfIndicator(this.asOfIndicator());
        }

        if (hasSettlSessID())
        {
            encoder.settlSessIDAsCopy(settlSessID.byteArray(), 0, settlSessIDLength);
        }

        if (hasSettlSessSubID())
        {
            encoder.settlSessSubIDAsCopy(settlSessSubID.byteArray(), 0, settlSessSubIDLength);
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

        financingDetails.copyTo(encoder.financingDetails());
        if (hasQtyType())
        {
            encoder.qtyType(this.qtyType());
        }


        yieldData.copyTo(encoder.yieldData());

        undInstrmtGrp.copyTo(encoder.undInstrmtGrp());
        if (hasUnderlyingTradingSessionID())
        {
            encoder.underlyingTradingSessionIDAsCopy(underlyingTradingSessionID.byteArray(), 0, underlyingTradingSessionIDLength);
        }

        if (hasUnderlyingTradingSessionSubID())
        {
            encoder.underlyingTradingSessionSubIDAsCopy(underlyingTradingSessionSubID.byteArray(), 0, underlyingTradingSessionSubIDLength);
        }

        if (hasLastQty())
        {
            encoder.lastQty(this.lastQty());
        }

        if (hasLastPx())
        {
            encoder.lastPx(this.lastPx());
        }

        if (hasCalculatedCcyLastQty())
        {
            encoder.calculatedCcyLastQty(this.calculatedCcyLastQty());
        }

        if (hasCurrency())
        {
            encoder.currencyAsCopy(currency.byteArray(), 0, currencyLength);
        }

        if (hasSettlCurrency())
        {
            encoder.settlCurrencyAsCopy(settlCurrency.byteArray(), 0, settlCurrencyLength);
        }

        if (hasLastParPx())
        {
            encoder.lastParPx(this.lastParPx());
        }

        if (hasLastSpotRate())
        {
            encoder.lastSpotRate(this.lastSpotRate());
        }

        if (hasLastForwardPoints())
        {
            encoder.lastForwardPoints(this.lastForwardPoints());
        }

        if (hasLastSwapPoints())
        {
            encoder.lastSwapPoints(this.lastSwapPoints());
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


        spreadOrBenchmarkCurveData.copyTo(encoder.spreadOrBenchmarkCurveData());
        if (hasAvgPxIndicator())
        {
            encoder.avgPxIndicator(this.avgPxIndicator());
        }


        positionAmountData.copyTo(encoder.positionAmountData());
        if (hasMultiLegReportingType())
        {
            encoder.multiLegReportingType(this.multiLegReportingType());
        }

        if (hasTradeLegRefID())
        {
            encoder.tradeLegRefIDAsCopy(tradeLegRefID.byteArray(), 0, tradeLegRefIDLength);
        }


        trdInstrmtLegGrp.copyTo(encoder.trdInstrmtLegGrp());
        if (hasTransactTime())
        {
            encoder.transactTimeAsCopy(transactTime.byteArray(), 0, transactTimeLength);
        }


        trdRegTimestamps.copyTo(encoder.trdRegTimestamps());
        if (hasSettlType())
        {
            encoder.settlTypeAsCopy(settlType.byteArray(), 0, settlTypeLength);
        }

        if (hasSettlDate())
        {
            encoder.settlDateAsCopy(settlDate.byteArray(), 0, settlDateLength);
        }

        if (hasUnderlyingSettlementDate())
        {
            encoder.underlyingSettlementDateAsCopy(underlyingSettlementDate.byteArray(), 0, underlyingSettlementDateLength);
        }

        if (hasMatchStatus())
        {
            encoder.matchStatus(this.matchStatus());
        }

        if (hasMatchType())
        {
            encoder.matchTypeAsCopy(matchType.byteArray(), 0, matchTypeLength);
        }


        trdCapRptSideGrp.copyTo(encoder.trdCapRptSideGrp());
        if (hasVolatility())
        {
            encoder.volatility(this.volatility());
        }

        if (hasDividendYield())
        {
            encoder.dividendYield(this.dividendYield());
        }

        if (hasRiskFreeRate())
        {
            encoder.riskFreeRate(this.riskFreeRate());
        }

        if (hasCurrencyRatio())
        {
            encoder.currencyRatio(this.currencyRatio());
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

        if (hasTZTransactTime())
        {
            encoder.tZTransactTimeAsCopy(tZTransactTime.byteArray(), 0, tZTransactTimeLength);
        }

        if (hasReportedPxDiff())
        {
            encoder.reportedPxDiff(this.reportedPxDiff());
        }

        if (hasGrossTradeAmt())
        {
            encoder.grossTradeAmt(this.grossTradeAmt());
        }

        if (hasRejectText())
        {
            encoder.rejectTextAsCopy(rejectText.byteArray(), 0, rejectTextLength);
        }

        if (hasFeeMultiplier())
        {
            encoder.feeMultiplier(this.feeMultiplier());
        }
        return encoder;
    }

}
