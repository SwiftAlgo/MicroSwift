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


public class QuotEntryGrpEncoder
{
    private static final int noQuoteEntriesGroupCounterHeaderLength = 4;
    private static final byte[] noQuoteEntriesGroupCounterHeader = new byte[] {50, 57, 53, (byte) '='};



public static class QuoteEntriesGroupEncoder
{
    private QuoteEntriesGroupEncoder next = null;

    public QuoteEntriesGroupEncoder next()
    {
        if (next == null)
        {
            next = new QuoteEntriesGroupEncoder();
        }
        return next;
    }

    private static final int quoteEntryIDHeaderLength = 4;
    private static final byte[] quoteEntryIDHeader = new byte[] {50, 57, 57, (byte) '='};

    private static final int bidPxHeaderLength = 4;
    private static final byte[] bidPxHeader = new byte[] {49, 51, 50, (byte) '='};

    private static final int offerPxHeaderLength = 4;
    private static final byte[] offerPxHeader = new byte[] {49, 51, 51, (byte) '='};

    private static final int bidSizeHeaderLength = 4;
    private static final byte[] bidSizeHeader = new byte[] {49, 51, 52, (byte) '='};

    private static final int offerSizeHeaderLength = 4;
    private static final byte[] offerSizeHeader = new byte[] {49, 51, 53, (byte) '='};

    private static final int validUntilTimeHeaderLength = 3;
    private static final byte[] validUntilTimeHeader = new byte[] {54, 50, (byte) '='};

    private static final int bidSpotRateHeaderLength = 4;
    private static final byte[] bidSpotRateHeader = new byte[] {49, 56, 56, (byte) '='};

    private static final int offerSpotRateHeaderLength = 4;
    private static final byte[] offerSpotRateHeader = new byte[] {49, 57, 48, (byte) '='};

    private static final int bidForwardPointsHeaderLength = 4;
    private static final byte[] bidForwardPointsHeader = new byte[] {49, 56, 57, (byte) '='};

    private static final int offerForwardPointsHeaderLength = 4;
    private static final byte[] offerForwardPointsHeader = new byte[] {49, 57, 49, (byte) '='};

    private static final int midPxHeaderLength = 4;
    private static final byte[] midPxHeader = new byte[] {54, 51, 49, (byte) '='};

    private static final int bidYieldHeaderLength = 4;
    private static final byte[] bidYieldHeader = new byte[] {54, 51, 50, (byte) '='};

    private static final int midYieldHeaderLength = 4;
    private static final byte[] midYieldHeader = new byte[] {54, 51, 51, (byte) '='};

    private static final int offerYieldHeaderLength = 4;
    private static final byte[] offerYieldHeader = new byte[] {54, 51, 52, (byte) '='};

    private static final int transactTimeHeaderLength = 3;
    private static final byte[] transactTimeHeader = new byte[] {54, 48, (byte) '='};

    private static final int tradingSessionIDHeaderLength = 4;
    private static final byte[] tradingSessionIDHeader = new byte[] {51, 51, 54, (byte) '='};

    private static final int tradingSessionSubIDHeaderLength = 4;
    private static final byte[] tradingSessionSubIDHeader = new byte[] {54, 50, 53, (byte) '='};

    private static final int settlDateHeaderLength = 3;
    private static final byte[] settlDateHeader = new byte[] {54, 52, (byte) '='};

    private static final int ordTypeHeaderLength = 3;
    private static final byte[] ordTypeHeader = new byte[] {52, 48, (byte) '='};

    private static final int settlDate2HeaderLength = 4;
    private static final byte[] settlDate2Header = new byte[] {49, 57, 51, (byte) '='};

    private static final int orderQty2HeaderLength = 4;
    private static final byte[] orderQty2Header = new byte[] {49, 57, 50, (byte) '='};

    private static final int bidForwardPoints2HeaderLength = 4;
    private static final byte[] bidForwardPoints2Header = new byte[] {54, 52, 50, (byte) '='};

    private static final int offerForwardPoints2HeaderLength = 4;
    private static final byte[] offerForwardPoints2Header = new byte[] {54, 52, 51, (byte) '='};

    private static final int currencyHeaderLength = 3;
    private static final byte[] currencyHeader = new byte[] {49, 53, (byte) '='};

    private static final int bookingTypeHeaderLength = 4;
    private static final byte[] bookingTypeHeader = new byte[] {55, 55, 53, (byte) '='};

    private static final int orderCapacityHeaderLength = 4;
    private static final byte[] orderCapacityHeader = new byte[] {53, 50, 56, (byte) '='};

    private static final int orderRestrictionsHeaderLength = 4;
    private static final byte[] orderRestrictionsHeader = new byte[] {53, 50, 57, (byte) '='};

    private final MutableDirectBuffer quoteEntryID = new UnsafeBuffer();

    private int quoteEntryIDOffset = 0;

    private int quoteEntryIDLength = 0;

    public QuoteEntriesGroupEncoder quoteEntryID(final DirectBuffer value, final int offset, final int length)
    {
        quoteEntryID.wrap(value);
        quoteEntryIDOffset = offset;
        quoteEntryIDLength = length;
        return this;
    }

    public QuoteEntriesGroupEncoder quoteEntryID(final DirectBuffer value, final int length)
    {
        return quoteEntryID(value, 0, length);
    }

    public QuoteEntriesGroupEncoder quoteEntryID(final DirectBuffer value)
    {
        return quoteEntryID(value, 0, value.capacity());
    }

    public QuoteEntriesGroupEncoder quoteEntryID(final byte[] value, final int offset, final int length)
    {
        quoteEntryID.wrap(value);
        quoteEntryIDOffset = offset;
        quoteEntryIDLength = length;
        return this;
    }

    public QuoteEntriesGroupEncoder quoteEntryIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(quoteEntryID, value, offset, length);
        quoteEntryIDOffset = offset;
        quoteEntryIDLength = length;
        return this;
    }

    public QuoteEntriesGroupEncoder quoteEntryID(final byte[] value, final int length)
    {
        return quoteEntryID(value, 0, length);
    }

    public QuoteEntriesGroupEncoder quoteEntryID(final byte[] value)
    {
        return quoteEntryID(value, 0, value.length);
    }

    public boolean hasQuoteEntryID()
    {
        return quoteEntryIDLength > 0;
    }

    public MutableDirectBuffer quoteEntryID()
    {
        return quoteEntryID;
    }

    public String quoteEntryIDAsString()
    {
        return quoteEntryID.getStringWithoutLengthAscii(quoteEntryIDOffset, quoteEntryIDLength);
    }

    public QuoteEntriesGroupEncoder quoteEntryID(final CharSequence value)
    {
        toBytes(value, quoteEntryID);
        quoteEntryIDOffset = 0;
        quoteEntryIDLength = value.length();
        return this;
    }

    public QuoteEntriesGroupEncoder quoteEntryID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            quoteEntryID.wrap(buffer);
            quoteEntryIDOffset = value.offset();
            quoteEntryIDLength = value.length();
        }
        return this;
    }

    public QuoteEntriesGroupEncoder quoteEntryID(final char[] value)
    {
        return quoteEntryID(value, 0, value.length);
    }

    public QuoteEntriesGroupEncoder quoteEntryID(final char[] value, final int length)
    {
        return quoteEntryID(value, 0, length);
    }

    public QuoteEntriesGroupEncoder quoteEntryID(final char[] value, final int offset, final int length)
    {
        toBytes(value, quoteEntryID, offset, length);
        quoteEntryIDOffset = 0;
        quoteEntryIDLength = length;
        return this;
    }

    private final InstrumentEncoder instrument = new InstrumentEncoder();
    public InstrumentEncoder instrument()
    {
        return instrument;
    }

    private final InstrmtLegGrpEncoder instrmtLegGrp = new InstrmtLegGrpEncoder();
    public InstrmtLegGrpEncoder instrmtLegGrp()
    {
        return instrmtLegGrp;
    }

    private final DecimalFloat bidPx = new DecimalFloat();

    private boolean hasBidPx;

    public boolean hasBidPx()
    {
        return hasBidPx;
    }

    public QuoteEntriesGroupEncoder bidPx(DecimalFloat value)
    {
        bidPx.set(value);
        hasBidPx = true;
        return this;
    }

    public QuoteEntriesGroupEncoder bidPx(long value, int scale)
    {
        bidPx.set(value, scale);
        hasBidPx = true;
        return this;
    }

    public DecimalFloat bidPx()
    {
        return bidPx;
    }

    private final DecimalFloat offerPx = new DecimalFloat();

    private boolean hasOfferPx;

    public boolean hasOfferPx()
    {
        return hasOfferPx;
    }

    public QuoteEntriesGroupEncoder offerPx(DecimalFloat value)
    {
        offerPx.set(value);
        hasOfferPx = true;
        return this;
    }

    public QuoteEntriesGroupEncoder offerPx(long value, int scale)
    {
        offerPx.set(value, scale);
        hasOfferPx = true;
        return this;
    }

    public DecimalFloat offerPx()
    {
        return offerPx;
    }

    private final DecimalFloat bidSize = new DecimalFloat();

    private boolean hasBidSize;

    public boolean hasBidSize()
    {
        return hasBidSize;
    }

    public QuoteEntriesGroupEncoder bidSize(DecimalFloat value)
    {
        bidSize.set(value);
        hasBidSize = true;
        return this;
    }

    public QuoteEntriesGroupEncoder bidSize(long value, int scale)
    {
        bidSize.set(value, scale);
        hasBidSize = true;
        return this;
    }

    public DecimalFloat bidSize()
    {
        return bidSize;
    }

    private final DecimalFloat offerSize = new DecimalFloat();

    private boolean hasOfferSize;

    public boolean hasOfferSize()
    {
        return hasOfferSize;
    }

    public QuoteEntriesGroupEncoder offerSize(DecimalFloat value)
    {
        offerSize.set(value);
        hasOfferSize = true;
        return this;
    }

    public QuoteEntriesGroupEncoder offerSize(long value, int scale)
    {
        offerSize.set(value, scale);
        hasOfferSize = true;
        return this;
    }

    public DecimalFloat offerSize()
    {
        return offerSize;
    }

    private final MutableDirectBuffer validUntilTime = new UnsafeBuffer();

    private int validUntilTimeOffset = 0;

    private int validUntilTimeLength = 0;

    public QuoteEntriesGroupEncoder validUntilTime(final DirectBuffer value, final int offset, final int length)
    {
        validUntilTime.wrap(value);
        validUntilTimeOffset = offset;
        validUntilTimeLength = length;
        return this;
    }

    public QuoteEntriesGroupEncoder validUntilTime(final DirectBuffer value, final int length)
    {
        return validUntilTime(value, 0, length);
    }

    public QuoteEntriesGroupEncoder validUntilTime(final DirectBuffer value)
    {
        return validUntilTime(value, 0, value.capacity());
    }

    public QuoteEntriesGroupEncoder validUntilTime(final byte[] value, final int offset, final int length)
    {
        validUntilTime.wrap(value);
        validUntilTimeOffset = offset;
        validUntilTimeLength = length;
        return this;
    }

    public QuoteEntriesGroupEncoder validUntilTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(validUntilTime, value, offset, length);
        validUntilTimeOffset = offset;
        validUntilTimeLength = length;
        return this;
    }

    public QuoteEntriesGroupEncoder validUntilTime(final byte[] value, final int length)
    {
        return validUntilTime(value, 0, length);
    }

    public QuoteEntriesGroupEncoder validUntilTime(final byte[] value)
    {
        return validUntilTime(value, 0, value.length);
    }

    public boolean hasValidUntilTime()
    {
        return validUntilTimeLength > 0;
    }

    public MutableDirectBuffer validUntilTime()
    {
        return validUntilTime;
    }

    public String validUntilTimeAsString()
    {
        return validUntilTime.getStringWithoutLengthAscii(validUntilTimeOffset, validUntilTimeLength);
    }

    private final DecimalFloat bidSpotRate = new DecimalFloat();

    private boolean hasBidSpotRate;

    public boolean hasBidSpotRate()
    {
        return hasBidSpotRate;
    }

    public QuoteEntriesGroupEncoder bidSpotRate(DecimalFloat value)
    {
        bidSpotRate.set(value);
        hasBidSpotRate = true;
        return this;
    }

    public QuoteEntriesGroupEncoder bidSpotRate(long value, int scale)
    {
        bidSpotRate.set(value, scale);
        hasBidSpotRate = true;
        return this;
    }

    public DecimalFloat bidSpotRate()
    {
        return bidSpotRate;
    }

    private final DecimalFloat offerSpotRate = new DecimalFloat();

    private boolean hasOfferSpotRate;

    public boolean hasOfferSpotRate()
    {
        return hasOfferSpotRate;
    }

    public QuoteEntriesGroupEncoder offerSpotRate(DecimalFloat value)
    {
        offerSpotRate.set(value);
        hasOfferSpotRate = true;
        return this;
    }

    public QuoteEntriesGroupEncoder offerSpotRate(long value, int scale)
    {
        offerSpotRate.set(value, scale);
        hasOfferSpotRate = true;
        return this;
    }

    public DecimalFloat offerSpotRate()
    {
        return offerSpotRate;
    }

    private final DecimalFloat bidForwardPoints = new DecimalFloat();

    private boolean hasBidForwardPoints;

    public boolean hasBidForwardPoints()
    {
        return hasBidForwardPoints;
    }

    public QuoteEntriesGroupEncoder bidForwardPoints(DecimalFloat value)
    {
        bidForwardPoints.set(value);
        hasBidForwardPoints = true;
        return this;
    }

    public QuoteEntriesGroupEncoder bidForwardPoints(long value, int scale)
    {
        bidForwardPoints.set(value, scale);
        hasBidForwardPoints = true;
        return this;
    }

    public DecimalFloat bidForwardPoints()
    {
        return bidForwardPoints;
    }

    private final DecimalFloat offerForwardPoints = new DecimalFloat();

    private boolean hasOfferForwardPoints;

    public boolean hasOfferForwardPoints()
    {
        return hasOfferForwardPoints;
    }

    public QuoteEntriesGroupEncoder offerForwardPoints(DecimalFloat value)
    {
        offerForwardPoints.set(value);
        hasOfferForwardPoints = true;
        return this;
    }

    public QuoteEntriesGroupEncoder offerForwardPoints(long value, int scale)
    {
        offerForwardPoints.set(value, scale);
        hasOfferForwardPoints = true;
        return this;
    }

    public DecimalFloat offerForwardPoints()
    {
        return offerForwardPoints;
    }

    private final DecimalFloat midPx = new DecimalFloat();

    private boolean hasMidPx;

    public boolean hasMidPx()
    {
        return hasMidPx;
    }

    public QuoteEntriesGroupEncoder midPx(DecimalFloat value)
    {
        midPx.set(value);
        hasMidPx = true;
        return this;
    }

    public QuoteEntriesGroupEncoder midPx(long value, int scale)
    {
        midPx.set(value, scale);
        hasMidPx = true;
        return this;
    }

    public DecimalFloat midPx()
    {
        return midPx;
    }

    private final DecimalFloat bidYield = new DecimalFloat();

    private boolean hasBidYield;

    public boolean hasBidYield()
    {
        return hasBidYield;
    }

    public QuoteEntriesGroupEncoder bidYield(DecimalFloat value)
    {
        bidYield.set(value);
        hasBidYield = true;
        return this;
    }

    public QuoteEntriesGroupEncoder bidYield(long value, int scale)
    {
        bidYield.set(value, scale);
        hasBidYield = true;
        return this;
    }

    public DecimalFloat bidYield()
    {
        return bidYield;
    }

    private final DecimalFloat midYield = new DecimalFloat();

    private boolean hasMidYield;

    public boolean hasMidYield()
    {
        return hasMidYield;
    }

    public QuoteEntriesGroupEncoder midYield(DecimalFloat value)
    {
        midYield.set(value);
        hasMidYield = true;
        return this;
    }

    public QuoteEntriesGroupEncoder midYield(long value, int scale)
    {
        midYield.set(value, scale);
        hasMidYield = true;
        return this;
    }

    public DecimalFloat midYield()
    {
        return midYield;
    }

    private final DecimalFloat offerYield = new DecimalFloat();

    private boolean hasOfferYield;

    public boolean hasOfferYield()
    {
        return hasOfferYield;
    }

    public QuoteEntriesGroupEncoder offerYield(DecimalFloat value)
    {
        offerYield.set(value);
        hasOfferYield = true;
        return this;
    }

    public QuoteEntriesGroupEncoder offerYield(long value, int scale)
    {
        offerYield.set(value, scale);
        hasOfferYield = true;
        return this;
    }

    public DecimalFloat offerYield()
    {
        return offerYield;
    }

    private final MutableDirectBuffer transactTime = new UnsafeBuffer();

    private int transactTimeOffset = 0;

    private int transactTimeLength = 0;

    public QuoteEntriesGroupEncoder transactTime(final DirectBuffer value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public QuoteEntriesGroupEncoder transactTime(final DirectBuffer value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public QuoteEntriesGroupEncoder transactTime(final DirectBuffer value)
    {
        return transactTime(value, 0, value.capacity());
    }

    public QuoteEntriesGroupEncoder transactTime(final byte[] value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public QuoteEntriesGroupEncoder transactTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(transactTime, value, offset, length);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public QuoteEntriesGroupEncoder transactTime(final byte[] value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public QuoteEntriesGroupEncoder transactTime(final byte[] value)
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

    private final MutableDirectBuffer tradingSessionID = new UnsafeBuffer();

    private int tradingSessionIDOffset = 0;

    private int tradingSessionIDLength = 0;

    public QuoteEntriesGroupEncoder tradingSessionID(final DirectBuffer value, final int offset, final int length)
    {
        tradingSessionID.wrap(value);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public QuoteEntriesGroupEncoder tradingSessionID(final DirectBuffer value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public QuoteEntriesGroupEncoder tradingSessionID(final DirectBuffer value)
    {
        return tradingSessionID(value, 0, value.capacity());
    }

    public QuoteEntriesGroupEncoder tradingSessionID(final byte[] value, final int offset, final int length)
    {
        tradingSessionID.wrap(value);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public QuoteEntriesGroupEncoder tradingSessionIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradingSessionID, value, offset, length);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public QuoteEntriesGroupEncoder tradingSessionID(final byte[] value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public QuoteEntriesGroupEncoder tradingSessionID(final byte[] value)
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

    public QuoteEntriesGroupEncoder tradingSessionID(final CharSequence value)
    {
        toBytes(value, tradingSessionID);
        tradingSessionIDOffset = 0;
        tradingSessionIDLength = value.length();
        return this;
    }

    public QuoteEntriesGroupEncoder tradingSessionID(final AsciiSequenceView value)
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

    public QuoteEntriesGroupEncoder tradingSessionID(final char[] value)
    {
        return tradingSessionID(value, 0, value.length);
    }

    public QuoteEntriesGroupEncoder tradingSessionID(final char[] value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public QuoteEntriesGroupEncoder tradingSessionID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradingSessionID, offset, length);
        tradingSessionIDOffset = 0;
        tradingSessionIDLength = length;
        return this;
    }

    public QuoteEntriesGroupEncoder tradingSessionID(TradingSessionID value)
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

    public QuoteEntriesGroupEncoder tradingSessionSubID(final DirectBuffer value, final int offset, final int length)
    {
        tradingSessionSubID.wrap(value);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public QuoteEntriesGroupEncoder tradingSessionSubID(final DirectBuffer value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public QuoteEntriesGroupEncoder tradingSessionSubID(final DirectBuffer value)
    {
        return tradingSessionSubID(value, 0, value.capacity());
    }

    public QuoteEntriesGroupEncoder tradingSessionSubID(final byte[] value, final int offset, final int length)
    {
        tradingSessionSubID.wrap(value);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public QuoteEntriesGroupEncoder tradingSessionSubIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradingSessionSubID, value, offset, length);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public QuoteEntriesGroupEncoder tradingSessionSubID(final byte[] value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public QuoteEntriesGroupEncoder tradingSessionSubID(final byte[] value)
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

    public QuoteEntriesGroupEncoder tradingSessionSubID(final CharSequence value)
    {
        toBytes(value, tradingSessionSubID);
        tradingSessionSubIDOffset = 0;
        tradingSessionSubIDLength = value.length();
        return this;
    }

    public QuoteEntriesGroupEncoder tradingSessionSubID(final AsciiSequenceView value)
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

    public QuoteEntriesGroupEncoder tradingSessionSubID(final char[] value)
    {
        return tradingSessionSubID(value, 0, value.length);
    }

    public QuoteEntriesGroupEncoder tradingSessionSubID(final char[] value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public QuoteEntriesGroupEncoder tradingSessionSubID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradingSessionSubID, offset, length);
        tradingSessionSubIDOffset = 0;
        tradingSessionSubIDLength = length;
        return this;
    }

    public QuoteEntriesGroupEncoder tradingSessionSubID(TradingSessionSubID value)
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

    private final MutableDirectBuffer settlDate = new UnsafeBuffer();

    private int settlDateOffset = 0;

    private int settlDateLength = 0;

    public QuoteEntriesGroupEncoder settlDate(final DirectBuffer value, final int offset, final int length)
    {
        settlDate.wrap(value);
        settlDateOffset = offset;
        settlDateLength = length;
        return this;
    }

    public QuoteEntriesGroupEncoder settlDate(final DirectBuffer value, final int length)
    {
        return settlDate(value, 0, length);
    }

    public QuoteEntriesGroupEncoder settlDate(final DirectBuffer value)
    {
        return settlDate(value, 0, value.capacity());
    }

    public QuoteEntriesGroupEncoder settlDate(final byte[] value, final int offset, final int length)
    {
        settlDate.wrap(value);
        settlDateOffset = offset;
        settlDateLength = length;
        return this;
    }

    public QuoteEntriesGroupEncoder settlDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlDate, value, offset, length);
        settlDateOffset = offset;
        settlDateLength = length;
        return this;
    }

    public QuoteEntriesGroupEncoder settlDate(final byte[] value, final int length)
    {
        return settlDate(value, 0, length);
    }

    public QuoteEntriesGroupEncoder settlDate(final byte[] value)
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

    private char ordType;

    private boolean hasOrdType;

    public boolean hasOrdType()
    {
        return hasOrdType;
    }

    public QuoteEntriesGroupEncoder ordType(char value)
    {
        ordType = value;
        hasOrdType = true;
        return this;
    }

    public char ordType()
    {
        return ordType;
    }

    public QuoteEntriesGroupEncoder ordType(OrdType value)
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

    private final MutableDirectBuffer settlDate2 = new UnsafeBuffer();

    private int settlDate2Offset = 0;

    private int settlDate2Length = 0;

    public QuoteEntriesGroupEncoder settlDate2(final DirectBuffer value, final int offset, final int length)
    {
        settlDate2.wrap(value);
        settlDate2Offset = offset;
        settlDate2Length = length;
        return this;
    }

    public QuoteEntriesGroupEncoder settlDate2(final DirectBuffer value, final int length)
    {
        return settlDate2(value, 0, length);
    }

    public QuoteEntriesGroupEncoder settlDate2(final DirectBuffer value)
    {
        return settlDate2(value, 0, value.capacity());
    }

    public QuoteEntriesGroupEncoder settlDate2(final byte[] value, final int offset, final int length)
    {
        settlDate2.wrap(value);
        settlDate2Offset = offset;
        settlDate2Length = length;
        return this;
    }

    public QuoteEntriesGroupEncoder settlDate2AsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlDate2, value, offset, length);
        settlDate2Offset = offset;
        settlDate2Length = length;
        return this;
    }

    public QuoteEntriesGroupEncoder settlDate2(final byte[] value, final int length)
    {
        return settlDate2(value, 0, length);
    }

    public QuoteEntriesGroupEncoder settlDate2(final byte[] value)
    {
        return settlDate2(value, 0, value.length);
    }

    public boolean hasSettlDate2()
    {
        return settlDate2Length > 0;
    }

    public MutableDirectBuffer settlDate2()
    {
        return settlDate2;
    }

    public String settlDate2AsString()
    {
        return settlDate2.getStringWithoutLengthAscii(settlDate2Offset, settlDate2Length);
    }

    private final DecimalFloat orderQty2 = new DecimalFloat();

    private boolean hasOrderQty2;

    public boolean hasOrderQty2()
    {
        return hasOrderQty2;
    }

    public QuoteEntriesGroupEncoder orderQty2(DecimalFloat value)
    {
        orderQty2.set(value);
        hasOrderQty2 = true;
        return this;
    }

    public QuoteEntriesGroupEncoder orderQty2(long value, int scale)
    {
        orderQty2.set(value, scale);
        hasOrderQty2 = true;
        return this;
    }

    public DecimalFloat orderQty2()
    {
        return orderQty2;
    }

    private final DecimalFloat bidForwardPoints2 = new DecimalFloat();

    private boolean hasBidForwardPoints2;

    public boolean hasBidForwardPoints2()
    {
        return hasBidForwardPoints2;
    }

    public QuoteEntriesGroupEncoder bidForwardPoints2(DecimalFloat value)
    {
        bidForwardPoints2.set(value);
        hasBidForwardPoints2 = true;
        return this;
    }

    public QuoteEntriesGroupEncoder bidForwardPoints2(long value, int scale)
    {
        bidForwardPoints2.set(value, scale);
        hasBidForwardPoints2 = true;
        return this;
    }

    public DecimalFloat bidForwardPoints2()
    {
        return bidForwardPoints2;
    }

    private final DecimalFloat offerForwardPoints2 = new DecimalFloat();

    private boolean hasOfferForwardPoints2;

    public boolean hasOfferForwardPoints2()
    {
        return hasOfferForwardPoints2;
    }

    public QuoteEntriesGroupEncoder offerForwardPoints2(DecimalFloat value)
    {
        offerForwardPoints2.set(value);
        hasOfferForwardPoints2 = true;
        return this;
    }

    public QuoteEntriesGroupEncoder offerForwardPoints2(long value, int scale)
    {
        offerForwardPoints2.set(value, scale);
        hasOfferForwardPoints2 = true;
        return this;
    }

    public DecimalFloat offerForwardPoints2()
    {
        return offerForwardPoints2;
    }

    private final MutableDirectBuffer currency = new UnsafeBuffer();

    private int currencyOffset = 0;

    private int currencyLength = 0;

    public QuoteEntriesGroupEncoder currency(final DirectBuffer value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public QuoteEntriesGroupEncoder currency(final DirectBuffer value, final int length)
    {
        return currency(value, 0, length);
    }

    public QuoteEntriesGroupEncoder currency(final DirectBuffer value)
    {
        return currency(value, 0, value.capacity());
    }

    public QuoteEntriesGroupEncoder currency(final byte[] value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public QuoteEntriesGroupEncoder currencyAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(currency, value, offset, length);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public QuoteEntriesGroupEncoder currency(final byte[] value, final int length)
    {
        return currency(value, 0, length);
    }

    public QuoteEntriesGroupEncoder currency(final byte[] value)
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

    public QuoteEntriesGroupEncoder currency(final CharSequence value)
    {
        toBytes(value, currency);
        currencyOffset = 0;
        currencyLength = value.length();
        return this;
    }

    public QuoteEntriesGroupEncoder currency(final AsciiSequenceView value)
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

    public QuoteEntriesGroupEncoder currency(final char[] value)
    {
        return currency(value, 0, value.length);
    }

    public QuoteEntriesGroupEncoder currency(final char[] value, final int length)
    {
        return currency(value, 0, length);
    }

    public QuoteEntriesGroupEncoder currency(final char[] value, final int offset, final int length)
    {
        toBytes(value, currency, offset, length);
        currencyOffset = 0;
        currencyLength = length;
        return this;
    }

    private int bookingType;

    private boolean hasBookingType;

    public boolean hasBookingType()
    {
        return hasBookingType;
    }

    public QuoteEntriesGroupEncoder bookingType(int value)
    {
        bookingType = value;
        hasBookingType = true;
        return this;
    }

    public int bookingType()
    {
        return bookingType;
    }

    public QuoteEntriesGroupEncoder bookingType(BookingType value)
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

    private char orderCapacity;

    private boolean hasOrderCapacity;

    public boolean hasOrderCapacity()
    {
        return hasOrderCapacity;
    }

    public QuoteEntriesGroupEncoder orderCapacity(char value)
    {
        orderCapacity = value;
        hasOrderCapacity = true;
        return this;
    }

    public char orderCapacity()
    {
        return orderCapacity;
    }

    public QuoteEntriesGroupEncoder orderCapacity(OrderCapacity value)
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

    public QuoteEntriesGroupEncoder orderRestrictions(final DirectBuffer value, final int offset, final int length)
    {
        orderRestrictions.wrap(value);
        orderRestrictionsOffset = offset;
        orderRestrictionsLength = length;
        return this;
    }

    public QuoteEntriesGroupEncoder orderRestrictions(final DirectBuffer value, final int length)
    {
        return orderRestrictions(value, 0, length);
    }

    public QuoteEntriesGroupEncoder orderRestrictions(final DirectBuffer value)
    {
        return orderRestrictions(value, 0, value.capacity());
    }

    public QuoteEntriesGroupEncoder orderRestrictions(final byte[] value, final int offset, final int length)
    {
        orderRestrictions.wrap(value);
        orderRestrictionsOffset = offset;
        orderRestrictionsLength = length;
        return this;
    }

    public QuoteEntriesGroupEncoder orderRestrictionsAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(orderRestrictions, value, offset, length);
        orderRestrictionsOffset = offset;
        orderRestrictionsLength = length;
        return this;
    }

    public QuoteEntriesGroupEncoder orderRestrictions(final byte[] value, final int length)
    {
        return orderRestrictions(value, 0, length);
    }

    public QuoteEntriesGroupEncoder orderRestrictions(final byte[] value)
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

    public QuoteEntriesGroupEncoder orderRestrictions(final CharSequence value)
    {
        toBytes(value, orderRestrictions);
        orderRestrictionsOffset = 0;
        orderRestrictionsLength = value.length();
        return this;
    }

    public QuoteEntriesGroupEncoder orderRestrictions(final AsciiSequenceView value)
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

    public QuoteEntriesGroupEncoder orderRestrictions(final char[] value)
    {
        return orderRestrictions(value, 0, value.length);
    }

    public QuoteEntriesGroupEncoder orderRestrictions(final char[] value, final int length)
    {
        return orderRestrictions(value, 0, length);
    }

    public QuoteEntriesGroupEncoder orderRestrictions(final char[] value, final int offset, final int length)
    {
        toBytes(value, orderRestrictions, offset, length);
        orderRestrictionsOffset = 0;
        orderRestrictionsLength = length;
        return this;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (quoteEntryIDLength > 0)
        {
            buffer.putBytes(position, quoteEntryIDHeader, 0, quoteEntryIDHeaderLength);
            position += quoteEntryIDHeaderLength;
            buffer.putBytes(position, quoteEntryID, quoteEntryIDOffset, quoteEntryIDLength);
            position += quoteEntryIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: QuoteEntryID");
        }

            position += instrument.encode(buffer, position);

            position += instrmtLegGrp.encode(buffer, position);

        if (hasBidPx)
        {
            buffer.putBytes(position, bidPxHeader, 0, bidPxHeaderLength);
            position += bidPxHeaderLength;
            position += buffer.putFloatAscii(position, bidPx);
            buffer.putSeparator(position);
            position++;
        }

        if (hasOfferPx)
        {
            buffer.putBytes(position, offerPxHeader, 0, offerPxHeaderLength);
            position += offerPxHeaderLength;
            position += buffer.putFloatAscii(position, offerPx);
            buffer.putSeparator(position);
            position++;
        }

        if (hasBidSize)
        {
            buffer.putBytes(position, bidSizeHeader, 0, bidSizeHeaderLength);
            position += bidSizeHeaderLength;
            position += buffer.putFloatAscii(position, bidSize);
            buffer.putSeparator(position);
            position++;
        }

        if (hasOfferSize)
        {
            buffer.putBytes(position, offerSizeHeader, 0, offerSizeHeaderLength);
            position += offerSizeHeaderLength;
            position += buffer.putFloatAscii(position, offerSize);
            buffer.putSeparator(position);
            position++;
        }

        if (validUntilTimeLength > 0)
        {
            buffer.putBytes(position, validUntilTimeHeader, 0, validUntilTimeHeaderLength);
            position += validUntilTimeHeaderLength;
            buffer.putBytes(position, validUntilTime, validUntilTimeOffset, validUntilTimeLength);
            position += validUntilTimeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasBidSpotRate)
        {
            buffer.putBytes(position, bidSpotRateHeader, 0, bidSpotRateHeaderLength);
            position += bidSpotRateHeaderLength;
            position += buffer.putFloatAscii(position, bidSpotRate);
            buffer.putSeparator(position);
            position++;
        }

        if (hasOfferSpotRate)
        {
            buffer.putBytes(position, offerSpotRateHeader, 0, offerSpotRateHeaderLength);
            position += offerSpotRateHeaderLength;
            position += buffer.putFloatAscii(position, offerSpotRate);
            buffer.putSeparator(position);
            position++;
        }

        if (hasBidForwardPoints)
        {
            buffer.putBytes(position, bidForwardPointsHeader, 0, bidForwardPointsHeaderLength);
            position += bidForwardPointsHeaderLength;
            position += buffer.putFloatAscii(position, bidForwardPoints);
            buffer.putSeparator(position);
            position++;
        }

        if (hasOfferForwardPoints)
        {
            buffer.putBytes(position, offerForwardPointsHeader, 0, offerForwardPointsHeaderLength);
            position += offerForwardPointsHeaderLength;
            position += buffer.putFloatAscii(position, offerForwardPoints);
            buffer.putSeparator(position);
            position++;
        }

        if (hasMidPx)
        {
            buffer.putBytes(position, midPxHeader, 0, midPxHeaderLength);
            position += midPxHeaderLength;
            position += buffer.putFloatAscii(position, midPx);
            buffer.putSeparator(position);
            position++;
        }

        if (hasBidYield)
        {
            buffer.putBytes(position, bidYieldHeader, 0, bidYieldHeaderLength);
            position += bidYieldHeaderLength;
            position += buffer.putFloatAscii(position, bidYield);
            buffer.putSeparator(position);
            position++;
        }

        if (hasMidYield)
        {
            buffer.putBytes(position, midYieldHeader, 0, midYieldHeaderLength);
            position += midYieldHeaderLength;
            position += buffer.putFloatAscii(position, midYield);
            buffer.putSeparator(position);
            position++;
        }

        if (hasOfferYield)
        {
            buffer.putBytes(position, offerYieldHeader, 0, offerYieldHeaderLength);
            position += offerYieldHeaderLength;
            position += buffer.putFloatAscii(position, offerYield);
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

        if (settlDateLength > 0)
        {
            buffer.putBytes(position, settlDateHeader, 0, settlDateHeaderLength);
            position += settlDateHeaderLength;
            buffer.putBytes(position, settlDate, settlDateOffset, settlDateLength);
            position += settlDateLength;
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

        if (settlDate2Length > 0)
        {
            buffer.putBytes(position, settlDate2Header, 0, settlDate2HeaderLength);
            position += settlDate2HeaderLength;
            buffer.putBytes(position, settlDate2, settlDate2Offset, settlDate2Length);
            position += settlDate2Length;
            buffer.putSeparator(position);
            position++;
        }

        if (hasOrderQty2)
        {
            buffer.putBytes(position, orderQty2Header, 0, orderQty2HeaderLength);
            position += orderQty2HeaderLength;
            position += buffer.putFloatAscii(position, orderQty2);
            buffer.putSeparator(position);
            position++;
        }

        if (hasBidForwardPoints2)
        {
            buffer.putBytes(position, bidForwardPoints2Header, 0, bidForwardPoints2HeaderLength);
            position += bidForwardPoints2HeaderLength;
            position += buffer.putFloatAscii(position, bidForwardPoints2);
            buffer.putSeparator(position);
            position++;
        }

        if (hasOfferForwardPoints2)
        {
            buffer.putBytes(position, offerForwardPoints2Header, 0, offerForwardPoints2HeaderLength);
            position += offerForwardPoints2HeaderLength;
            position += buffer.putFloatAscii(position, offerForwardPoints2);
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

        if (hasBookingType)
        {
            buffer.putBytes(position, bookingTypeHeader, 0, bookingTypeHeaderLength);
            position += bookingTypeHeaderLength;
            position += buffer.putIntAscii(position, bookingType);
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
        if (next != null)
        {
            position += next.encode(buffer, position, remainingElements - 1);
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetQuoteEntryID();
        this.resetBidPx();
        this.resetOfferPx();
        this.resetBidSize();
        this.resetOfferSize();
        this.resetValidUntilTime();
        this.resetBidSpotRate();
        this.resetOfferSpotRate();
        this.resetBidForwardPoints();
        this.resetOfferForwardPoints();
        this.resetMidPx();
        this.resetBidYield();
        this.resetMidYield();
        this.resetOfferYield();
        this.resetTransactTime();
        this.resetTradingSessionID();
        this.resetTradingSessionSubID();
        this.resetSettlDate();
        this.resetOrdType();
        this.resetSettlDate2();
        this.resetOrderQty2();
        this.resetBidForwardPoints2();
        this.resetOfferForwardPoints2();
        this.resetCurrency();
        this.resetBookingType();
        this.resetOrderCapacity();
        this.resetOrderRestrictions();
        instrument.reset();
        instrmtLegGrp.reset();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetQuoteEntryID()
    {
        quoteEntryIDLength = 0;
    }

    public void resetBidPx()
    {
        hasBidPx = false;
    }

    public void resetOfferPx()
    {
        hasOfferPx = false;
    }

    public void resetBidSize()
    {
        hasBidSize = false;
    }

    public void resetOfferSize()
    {
        hasOfferSize = false;
    }

    public void resetValidUntilTime()
    {
        validUntilTimeLength = 0;
    }

    public void resetBidSpotRate()
    {
        hasBidSpotRate = false;
    }

    public void resetOfferSpotRate()
    {
        hasOfferSpotRate = false;
    }

    public void resetBidForwardPoints()
    {
        hasBidForwardPoints = false;
    }

    public void resetOfferForwardPoints()
    {
        hasOfferForwardPoints = false;
    }

    public void resetMidPx()
    {
        hasMidPx = false;
    }

    public void resetBidYield()
    {
        hasBidYield = false;
    }

    public void resetMidYield()
    {
        hasMidYield = false;
    }

    public void resetOfferYield()
    {
        hasOfferYield = false;
    }

    public void resetTransactTime()
    {
        transactTimeLength = 0;
    }

    public void resetTradingSessionID()
    {
        tradingSessionIDLength = 0;
    }

    public void resetTradingSessionSubID()
    {
        tradingSessionSubIDLength = 0;
    }

    public void resetSettlDate()
    {
        settlDateLength = 0;
    }

    public void resetOrdType()
    {
        hasOrdType = false;
    }

    public void resetSettlDate2()
    {
        settlDate2Length = 0;
    }

    public void resetOrderQty2()
    {
        hasOrderQty2 = false;
    }

    public void resetBidForwardPoints2()
    {
        hasBidForwardPoints2 = false;
    }

    public void resetOfferForwardPoints2()
    {
        hasOfferForwardPoints2 = false;
    }

    public void resetCurrency()
    {
        currencyLength = 0;
    }

    public void resetBookingType()
    {
        hasBookingType = false;
    }

    public void resetOrderCapacity()
    {
        hasOrderCapacity = false;
    }

    public void resetOrderRestrictions()
    {
        orderRestrictionsLength = 0;
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
        builder.append("\"MessageName\": \"QuoteEntriesGroup\",\n");
        if (hasQuoteEntryID())
        {
            indent(builder, level);
            builder.append("\"QuoteEntryID\": \"");
            appendBuffer(builder, quoteEntryID, quoteEntryIDOffset, quoteEntryIDLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"Instrument\": ");
    instrument.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"InstrmtLegGrp\": ");
    instrmtLegGrp.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasBidPx())
        {
            indent(builder, level);
            builder.append("\"BidPx\": \"");
            bidPx.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasOfferPx())
        {
            indent(builder, level);
            builder.append("\"OfferPx\": \"");
            offerPx.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasBidSize())
        {
            indent(builder, level);
            builder.append("\"BidSize\": \"");
            bidSize.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasOfferSize())
        {
            indent(builder, level);
            builder.append("\"OfferSize\": \"");
            offerSize.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasValidUntilTime())
        {
            indent(builder, level);
            builder.append("\"ValidUntilTime\": \"");
            appendBuffer(builder, validUntilTime, validUntilTimeOffset, validUntilTimeLength);
            builder.append("\",\n");
        }

        if (hasBidSpotRate())
        {
            indent(builder, level);
            builder.append("\"BidSpotRate\": \"");
            bidSpotRate.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasOfferSpotRate())
        {
            indent(builder, level);
            builder.append("\"OfferSpotRate\": \"");
            offerSpotRate.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasBidForwardPoints())
        {
            indent(builder, level);
            builder.append("\"BidForwardPoints\": \"");
            bidForwardPoints.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasOfferForwardPoints())
        {
            indent(builder, level);
            builder.append("\"OfferForwardPoints\": \"");
            offerForwardPoints.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasMidPx())
        {
            indent(builder, level);
            builder.append("\"MidPx\": \"");
            midPx.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasBidYield())
        {
            indent(builder, level);
            builder.append("\"BidYield\": \"");
            bidYield.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasMidYield())
        {
            indent(builder, level);
            builder.append("\"MidYield\": \"");
            midYield.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasOfferYield())
        {
            indent(builder, level);
            builder.append("\"OfferYield\": \"");
            offerYield.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasTransactTime())
        {
            indent(builder, level);
            builder.append("\"TransactTime\": \"");
            appendBuffer(builder, transactTime, transactTimeOffset, transactTimeLength);
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

        if (hasSettlDate())
        {
            indent(builder, level);
            builder.append("\"SettlDate\": \"");
            appendBuffer(builder, settlDate, settlDateOffset, settlDateLength);
            builder.append("\",\n");
        }

        if (hasOrdType())
        {
            indent(builder, level);
            builder.append("\"OrdType\": \"");
            builder.append(ordType);
            builder.append("\",\n");
        }

        if (hasSettlDate2())
        {
            indent(builder, level);
            builder.append("\"SettlDate2\": \"");
            appendBuffer(builder, settlDate2, settlDate2Offset, settlDate2Length);
            builder.append("\",\n");
        }

        if (hasOrderQty2())
        {
            indent(builder, level);
            builder.append("\"OrderQty2\": \"");
            orderQty2.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasBidForwardPoints2())
        {
            indent(builder, level);
            builder.append("\"BidForwardPoints2\": \"");
            bidForwardPoints2.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasOfferForwardPoints2())
        {
            indent(builder, level);
            builder.append("\"OfferForwardPoints2\": \"");
            offerForwardPoints2.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasCurrency())
        {
            indent(builder, level);
            builder.append("\"Currency\": \"");
            appendBuffer(builder, currency, currencyOffset, currencyLength);
            builder.append("\",\n");
        }

        if (hasBookingType())
        {
            indent(builder, level);
            builder.append("\"BookingType\": \"");
            builder.append(bookingType);
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
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public QuoteEntriesGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((QuoteEntriesGroupEncoder)encoder);
    }

    public QuoteEntriesGroupEncoder copyTo(final QuoteEntriesGroupEncoder encoder)
    {
        encoder.reset();
        if (hasQuoteEntryID())
        {
            encoder.quoteEntryIDAsCopy(quoteEntryID.byteArray(), 0, quoteEntryIDLength);
        }


        instrument.copyTo(encoder.instrument());

        instrmtLegGrp.copyTo(encoder.instrmtLegGrp());
        if (hasBidPx())
        {
            encoder.bidPx(this.bidPx());
        }

        if (hasOfferPx())
        {
            encoder.offerPx(this.offerPx());
        }

        if (hasBidSize())
        {
            encoder.bidSize(this.bidSize());
        }

        if (hasOfferSize())
        {
            encoder.offerSize(this.offerSize());
        }

        if (hasValidUntilTime())
        {
            encoder.validUntilTimeAsCopy(validUntilTime.byteArray(), 0, validUntilTimeLength);
        }

        if (hasBidSpotRate())
        {
            encoder.bidSpotRate(this.bidSpotRate());
        }

        if (hasOfferSpotRate())
        {
            encoder.offerSpotRate(this.offerSpotRate());
        }

        if (hasBidForwardPoints())
        {
            encoder.bidForwardPoints(this.bidForwardPoints());
        }

        if (hasOfferForwardPoints())
        {
            encoder.offerForwardPoints(this.offerForwardPoints());
        }

        if (hasMidPx())
        {
            encoder.midPx(this.midPx());
        }

        if (hasBidYield())
        {
            encoder.bidYield(this.bidYield());
        }

        if (hasMidYield())
        {
            encoder.midYield(this.midYield());
        }

        if (hasOfferYield())
        {
            encoder.offerYield(this.offerYield());
        }

        if (hasTransactTime())
        {
            encoder.transactTimeAsCopy(transactTime.byteArray(), 0, transactTimeLength);
        }

        if (hasTradingSessionID())
        {
            encoder.tradingSessionIDAsCopy(tradingSessionID.byteArray(), 0, tradingSessionIDLength);
        }

        if (hasTradingSessionSubID())
        {
            encoder.tradingSessionSubIDAsCopy(tradingSessionSubID.byteArray(), 0, tradingSessionSubIDLength);
        }

        if (hasSettlDate())
        {
            encoder.settlDateAsCopy(settlDate.byteArray(), 0, settlDateLength);
        }

        if (hasOrdType())
        {
            encoder.ordType(this.ordType());
        }

        if (hasSettlDate2())
        {
            encoder.settlDate2AsCopy(settlDate2.byteArray(), 0, settlDate2Length);
        }

        if (hasOrderQty2())
        {
            encoder.orderQty2(this.orderQty2());
        }

        if (hasBidForwardPoints2())
        {
            encoder.bidForwardPoints2(this.bidForwardPoints2());
        }

        if (hasOfferForwardPoints2())
        {
            encoder.offerForwardPoints2(this.offerForwardPoints2());
        }

        if (hasCurrency())
        {
            encoder.currencyAsCopy(currency.byteArray(), 0, currencyLength);
        }

        if (hasBookingType())
        {
            encoder.bookingType(this.bookingType());
        }

        if (hasOrderCapacity())
        {
            encoder.orderCapacity(this.orderCapacity());
        }

        if (hasOrderRestrictions())
        {
            encoder.orderRestrictionsAsCopy(orderRestrictions.byteArray(), 0, orderRestrictionsLength);
        }
        return encoder;
    }

}
    private int noQuoteEntriesGroupCounter;

    private boolean hasNoQuoteEntriesGroupCounter;

    public boolean hasNoQuoteEntriesGroupCounter()
    {
        return hasNoQuoteEntriesGroupCounter;
    }

    public QuotEntryGrpEncoder noQuoteEntriesGroupCounter(int value)
    {
        noQuoteEntriesGroupCounter = value;
        hasNoQuoteEntriesGroupCounter = true;
        return this;
    }

    public int noQuoteEntriesGroupCounter()
    {
        return noQuoteEntriesGroupCounter;
    }


    private QuoteEntriesGroupEncoder quoteEntriesGroup = null;

    public QuoteEntriesGroupEncoder quoteEntriesGroup(final int numberOfElements)
    {
        hasNoQuoteEntriesGroupCounter = true;
        noQuoteEntriesGroupCounter = numberOfElements;
        if (quoteEntriesGroup == null)
        {
            quoteEntriesGroup = new QuoteEntriesGroupEncoder();
        }
        return quoteEntriesGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoQuoteEntriesGroupCounter)
        {
            buffer.putBytes(position, noQuoteEntriesGroupCounterHeader, 0, noQuoteEntriesGroupCounterHeaderLength);
            position += noQuoteEntriesGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noQuoteEntriesGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (quoteEntriesGroup != null)
        {
            position += quoteEntriesGroup.encode(buffer, position, noQuoteEntriesGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetQuoteEntriesGroup();
    }

    public void resetQuoteEntriesGroup()
    {
        if (quoteEntriesGroup != null)
        {
            quoteEntriesGroup.reset();
        }
        noQuoteEntriesGroupCounter = 0;
        hasNoQuoteEntriesGroupCounter = false;
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
        builder.append("\"MessageName\": \"QuotEntryGrp\",\n");
        if (hasNoQuoteEntriesGroupCounter)
        {
            indent(builder, level);
            builder.append("\"QuoteEntriesGroup\": [\n");
            final int noQuoteEntriesGroupCounter = this.noQuoteEntriesGroupCounter;
            QuoteEntriesGroupEncoder quoteEntriesGroup = this.quoteEntriesGroup;
            for (int i = 0; i < noQuoteEntriesGroupCounter; i++)
            {
                indent(builder, level);
                quoteEntriesGroup.appendTo(builder, level + 1);
                if (i < (noQuoteEntriesGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                quoteEntriesGroup = quoteEntriesGroup.next();
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
    public QuotEntryGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((QuotEntryGrpEncoder)encoder);
    }

    public QuotEntryGrpEncoder copyTo(final QuotEntryGrpEncoder encoder)
    {
        encoder.reset();
        if (hasNoQuoteEntriesGroupCounter)
        {
            final int size = this.noQuoteEntriesGroupCounter;
            QuoteEntriesGroupEncoder quoteEntriesGroup = this.quoteEntriesGroup;
            QuoteEntriesGroupEncoder quoteEntriesGroupEncoder = encoder.quoteEntriesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (quoteEntriesGroup != null)
                {
                    quoteEntriesGroup.copyTo(quoteEntriesGroupEncoder);
                    quoteEntriesGroup = quoteEntriesGroup.next();
                    quoteEntriesGroupEncoder = quoteEntriesGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
