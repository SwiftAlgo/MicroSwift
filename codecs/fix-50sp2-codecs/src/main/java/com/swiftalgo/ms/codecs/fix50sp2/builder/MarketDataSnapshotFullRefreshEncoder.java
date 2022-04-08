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


public class MarketDataSnapshotFullRefreshEncoder implements Encoder
{
    public long messageType()
    {
        return 87L;
    }

    public MarketDataSnapshotFullRefreshEncoder()
    {
        header.msgType("W");
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

    private static final int totNumReportsHeaderLength = 4;
    private static final byte[] totNumReportsHeader = new byte[] {57, 49, 49, (byte) '='};

    private static final int mDReportIDHeaderLength = 4;
    private static final byte[] mDReportIDHeader = new byte[] {57, 54, 51, (byte) '='};

    private static final int clearingBusinessDateHeaderLength = 4;
    private static final byte[] clearingBusinessDateHeader = new byte[] {55, 49, 53, (byte) '='};

    private static final int mDBookTypeHeaderLength = 5;
    private static final byte[] mDBookTypeHeader = new byte[] {49, 48, 50, 49, (byte) '='};

    private static final int mDSubBookTypeHeaderLength = 5;
    private static final byte[] mDSubBookTypeHeader = new byte[] {49, 49, 55, 51, (byte) '='};

    private static final int marketDepthHeaderLength = 4;
    private static final byte[] marketDepthHeader = new byte[] {50, 54, 52, (byte) '='};

    private static final int mDFeedTypeHeaderLength = 5;
    private static final byte[] mDFeedTypeHeader = new byte[] {49, 48, 50, 50, (byte) '='};

    private static final int refreshIndicatorHeaderLength = 5;
    private static final byte[] refreshIndicatorHeader = new byte[] {49, 49, 56, 55, (byte) '='};

    private static final int tradeDateHeaderLength = 3;
    private static final byte[] tradeDateHeader = new byte[] {55, 53, (byte) '='};

    private static final int mDReqIDHeaderLength = 4;
    private static final byte[] mDReqIDHeader = new byte[] {50, 54, 50, (byte) '='};

    private static final int mDStreamIDHeaderLength = 5;
    private static final byte[] mDStreamIDHeader = new byte[] {49, 53, 48, 48, (byte) '='};

    private static final int financialStatusHeaderLength = 4;
    private static final byte[] financialStatusHeader = new byte[] {50, 57, 49, (byte) '='};

    private static final int corporateActionHeaderLength = 4;
    private static final byte[] corporateActionHeader = new byte[] {50, 57, 50, (byte) '='};

    private static final int netChgPrevDayHeaderLength = 4;
    private static final byte[] netChgPrevDayHeader = new byte[] {52, 53, 49, (byte) '='};

    private static final int applQueueDepthHeaderLength = 4;
    private static final byte[] applQueueDepthHeader = new byte[] {56, 49, 51, (byte) '='};

    private static final int applQueueResolutionHeaderLength = 4;
    private static final byte[] applQueueResolutionHeader = new byte[] {56, 49, 52, (byte) '='};

    private final ApplicationSequenceControlEncoder applicationSequenceControl = new ApplicationSequenceControlEncoder();
    public ApplicationSequenceControlEncoder applicationSequenceControl()
    {
        return applicationSequenceControl;
    }

    private int totNumReports;

    private boolean hasTotNumReports;

    public boolean hasTotNumReports()
    {
        return hasTotNumReports;
    }

    public MarketDataSnapshotFullRefreshEncoder totNumReports(int value)
    {
        totNumReports = value;
        hasTotNumReports = true;
        return this;
    }

    public int totNumReports()
    {
        return totNumReports;
    }

    private int mDReportID;

    private boolean hasMDReportID;

    public boolean hasMDReportID()
    {
        return hasMDReportID;
    }

    public MarketDataSnapshotFullRefreshEncoder mDReportID(int value)
    {
        mDReportID = value;
        hasMDReportID = true;
        return this;
    }

    public int mDReportID()
    {
        return mDReportID;
    }

    private final MutableDirectBuffer clearingBusinessDate = new UnsafeBuffer();

    private int clearingBusinessDateOffset = 0;

    private int clearingBusinessDateLength = 0;

    public MarketDataSnapshotFullRefreshEncoder clearingBusinessDate(final DirectBuffer value, final int offset, final int length)
    {
        clearingBusinessDate.wrap(value);
        clearingBusinessDateOffset = offset;
        clearingBusinessDateLength = length;
        return this;
    }

    public MarketDataSnapshotFullRefreshEncoder clearingBusinessDate(final DirectBuffer value, final int length)
    {
        return clearingBusinessDate(value, 0, length);
    }

    public MarketDataSnapshotFullRefreshEncoder clearingBusinessDate(final DirectBuffer value)
    {
        return clearingBusinessDate(value, 0, value.capacity());
    }

    public MarketDataSnapshotFullRefreshEncoder clearingBusinessDate(final byte[] value, final int offset, final int length)
    {
        clearingBusinessDate.wrap(value);
        clearingBusinessDateOffset = offset;
        clearingBusinessDateLength = length;
        return this;
    }

    public MarketDataSnapshotFullRefreshEncoder clearingBusinessDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(clearingBusinessDate, value, offset, length);
        clearingBusinessDateOffset = offset;
        clearingBusinessDateLength = length;
        return this;
    }

    public MarketDataSnapshotFullRefreshEncoder clearingBusinessDate(final byte[] value, final int length)
    {
        return clearingBusinessDate(value, 0, length);
    }

    public MarketDataSnapshotFullRefreshEncoder clearingBusinessDate(final byte[] value)
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

    private int mDBookType;

    private boolean hasMDBookType;

    public boolean hasMDBookType()
    {
        return hasMDBookType;
    }

    public MarketDataSnapshotFullRefreshEncoder mDBookType(int value)
    {
        mDBookType = value;
        hasMDBookType = true;
        return this;
    }

    public int mDBookType()
    {
        return mDBookType;
    }

    public MarketDataSnapshotFullRefreshEncoder mDBookType(MDBookType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == MDBookType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: mDBookType Value: " + value );
            }
            if (value == MDBookType.NULL_VAL)
            {
                return this;
            }
        }
        return mDBookType(value.representation());
    }

    private int mDSubBookType;

    private boolean hasMDSubBookType;

    public boolean hasMDSubBookType()
    {
        return hasMDSubBookType;
    }

    public MarketDataSnapshotFullRefreshEncoder mDSubBookType(int value)
    {
        mDSubBookType = value;
        hasMDSubBookType = true;
        return this;
    }

    public int mDSubBookType()
    {
        return mDSubBookType;
    }

    private int marketDepth;

    private boolean hasMarketDepth;

    public boolean hasMarketDepth()
    {
        return hasMarketDepth;
    }

    public MarketDataSnapshotFullRefreshEncoder marketDepth(int value)
    {
        marketDepth = value;
        hasMarketDepth = true;
        return this;
    }

    public int marketDepth()
    {
        return marketDepth;
    }

    private final MutableDirectBuffer mDFeedType = new UnsafeBuffer();

    private int mDFeedTypeOffset = 0;

    private int mDFeedTypeLength = 0;

    public MarketDataSnapshotFullRefreshEncoder mDFeedType(final DirectBuffer value, final int offset, final int length)
    {
        mDFeedType.wrap(value);
        mDFeedTypeOffset = offset;
        mDFeedTypeLength = length;
        return this;
    }

    public MarketDataSnapshotFullRefreshEncoder mDFeedType(final DirectBuffer value, final int length)
    {
        return mDFeedType(value, 0, length);
    }

    public MarketDataSnapshotFullRefreshEncoder mDFeedType(final DirectBuffer value)
    {
        return mDFeedType(value, 0, value.capacity());
    }

    public MarketDataSnapshotFullRefreshEncoder mDFeedType(final byte[] value, final int offset, final int length)
    {
        mDFeedType.wrap(value);
        mDFeedTypeOffset = offset;
        mDFeedTypeLength = length;
        return this;
    }

    public MarketDataSnapshotFullRefreshEncoder mDFeedTypeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(mDFeedType, value, offset, length);
        mDFeedTypeOffset = offset;
        mDFeedTypeLength = length;
        return this;
    }

    public MarketDataSnapshotFullRefreshEncoder mDFeedType(final byte[] value, final int length)
    {
        return mDFeedType(value, 0, length);
    }

    public MarketDataSnapshotFullRefreshEncoder mDFeedType(final byte[] value)
    {
        return mDFeedType(value, 0, value.length);
    }

    public boolean hasMDFeedType()
    {
        return mDFeedTypeLength > 0;
    }

    public MutableDirectBuffer mDFeedType()
    {
        return mDFeedType;
    }

    public String mDFeedTypeAsString()
    {
        return mDFeedType.getStringWithoutLengthAscii(mDFeedTypeOffset, mDFeedTypeLength);
    }

    public MarketDataSnapshotFullRefreshEncoder mDFeedType(final CharSequence value)
    {
        toBytes(value, mDFeedType);
        mDFeedTypeOffset = 0;
        mDFeedTypeLength = value.length();
        return this;
    }

    public MarketDataSnapshotFullRefreshEncoder mDFeedType(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            mDFeedType.wrap(buffer);
            mDFeedTypeOffset = value.offset();
            mDFeedTypeLength = value.length();
        }
        return this;
    }

    public MarketDataSnapshotFullRefreshEncoder mDFeedType(final char[] value)
    {
        return mDFeedType(value, 0, value.length);
    }

    public MarketDataSnapshotFullRefreshEncoder mDFeedType(final char[] value, final int length)
    {
        return mDFeedType(value, 0, length);
    }

    public MarketDataSnapshotFullRefreshEncoder mDFeedType(final char[] value, final int offset, final int length)
    {
        toBytes(value, mDFeedType, offset, length);
        mDFeedTypeOffset = 0;
        mDFeedTypeLength = length;
        return this;
    }

    private boolean refreshIndicator;

    private boolean hasRefreshIndicator;

    public boolean hasRefreshIndicator()
    {
        return hasRefreshIndicator;
    }

    public MarketDataSnapshotFullRefreshEncoder refreshIndicator(boolean value)
    {
        refreshIndicator = value;
        hasRefreshIndicator = true;
        return this;
    }

    public boolean refreshIndicator()
    {
        return refreshIndicator;
    }

    private final MutableDirectBuffer tradeDate = new UnsafeBuffer();

    private int tradeDateOffset = 0;

    private int tradeDateLength = 0;

    public MarketDataSnapshotFullRefreshEncoder tradeDate(final DirectBuffer value, final int offset, final int length)
    {
        tradeDate.wrap(value);
        tradeDateOffset = offset;
        tradeDateLength = length;
        return this;
    }

    public MarketDataSnapshotFullRefreshEncoder tradeDate(final DirectBuffer value, final int length)
    {
        return tradeDate(value, 0, length);
    }

    public MarketDataSnapshotFullRefreshEncoder tradeDate(final DirectBuffer value)
    {
        return tradeDate(value, 0, value.capacity());
    }

    public MarketDataSnapshotFullRefreshEncoder tradeDate(final byte[] value, final int offset, final int length)
    {
        tradeDate.wrap(value);
        tradeDateOffset = offset;
        tradeDateLength = length;
        return this;
    }

    public MarketDataSnapshotFullRefreshEncoder tradeDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradeDate, value, offset, length);
        tradeDateOffset = offset;
        tradeDateLength = length;
        return this;
    }

    public MarketDataSnapshotFullRefreshEncoder tradeDate(final byte[] value, final int length)
    {
        return tradeDate(value, 0, length);
    }

    public MarketDataSnapshotFullRefreshEncoder tradeDate(final byte[] value)
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

    private final MutableDirectBuffer mDReqID = new UnsafeBuffer();

    private int mDReqIDOffset = 0;

    private int mDReqIDLength = 0;

    public MarketDataSnapshotFullRefreshEncoder mDReqID(final DirectBuffer value, final int offset, final int length)
    {
        mDReqID.wrap(value);
        mDReqIDOffset = offset;
        mDReqIDLength = length;
        return this;
    }

    public MarketDataSnapshotFullRefreshEncoder mDReqID(final DirectBuffer value, final int length)
    {
        return mDReqID(value, 0, length);
    }

    public MarketDataSnapshotFullRefreshEncoder mDReqID(final DirectBuffer value)
    {
        return mDReqID(value, 0, value.capacity());
    }

    public MarketDataSnapshotFullRefreshEncoder mDReqID(final byte[] value, final int offset, final int length)
    {
        mDReqID.wrap(value);
        mDReqIDOffset = offset;
        mDReqIDLength = length;
        return this;
    }

    public MarketDataSnapshotFullRefreshEncoder mDReqIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(mDReqID, value, offset, length);
        mDReqIDOffset = offset;
        mDReqIDLength = length;
        return this;
    }

    public MarketDataSnapshotFullRefreshEncoder mDReqID(final byte[] value, final int length)
    {
        return mDReqID(value, 0, length);
    }

    public MarketDataSnapshotFullRefreshEncoder mDReqID(final byte[] value)
    {
        return mDReqID(value, 0, value.length);
    }

    public boolean hasMDReqID()
    {
        return mDReqIDLength > 0;
    }

    public MutableDirectBuffer mDReqID()
    {
        return mDReqID;
    }

    public String mDReqIDAsString()
    {
        return mDReqID.getStringWithoutLengthAscii(mDReqIDOffset, mDReqIDLength);
    }

    public MarketDataSnapshotFullRefreshEncoder mDReqID(final CharSequence value)
    {
        toBytes(value, mDReqID);
        mDReqIDOffset = 0;
        mDReqIDLength = value.length();
        return this;
    }

    public MarketDataSnapshotFullRefreshEncoder mDReqID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            mDReqID.wrap(buffer);
            mDReqIDOffset = value.offset();
            mDReqIDLength = value.length();
        }
        return this;
    }

    public MarketDataSnapshotFullRefreshEncoder mDReqID(final char[] value)
    {
        return mDReqID(value, 0, value.length);
    }

    public MarketDataSnapshotFullRefreshEncoder mDReqID(final char[] value, final int length)
    {
        return mDReqID(value, 0, length);
    }

    public MarketDataSnapshotFullRefreshEncoder mDReqID(final char[] value, final int offset, final int length)
    {
        toBytes(value, mDReqID, offset, length);
        mDReqIDOffset = 0;
        mDReqIDLength = length;
        return this;
    }

    private final MutableDirectBuffer mDStreamID = new UnsafeBuffer();

    private int mDStreamIDOffset = 0;

    private int mDStreamIDLength = 0;

    public MarketDataSnapshotFullRefreshEncoder mDStreamID(final DirectBuffer value, final int offset, final int length)
    {
        mDStreamID.wrap(value);
        mDStreamIDOffset = offset;
        mDStreamIDLength = length;
        return this;
    }

    public MarketDataSnapshotFullRefreshEncoder mDStreamID(final DirectBuffer value, final int length)
    {
        return mDStreamID(value, 0, length);
    }

    public MarketDataSnapshotFullRefreshEncoder mDStreamID(final DirectBuffer value)
    {
        return mDStreamID(value, 0, value.capacity());
    }

    public MarketDataSnapshotFullRefreshEncoder mDStreamID(final byte[] value, final int offset, final int length)
    {
        mDStreamID.wrap(value);
        mDStreamIDOffset = offset;
        mDStreamIDLength = length;
        return this;
    }

    public MarketDataSnapshotFullRefreshEncoder mDStreamIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(mDStreamID, value, offset, length);
        mDStreamIDOffset = offset;
        mDStreamIDLength = length;
        return this;
    }

    public MarketDataSnapshotFullRefreshEncoder mDStreamID(final byte[] value, final int length)
    {
        return mDStreamID(value, 0, length);
    }

    public MarketDataSnapshotFullRefreshEncoder mDStreamID(final byte[] value)
    {
        return mDStreamID(value, 0, value.length);
    }

    public boolean hasMDStreamID()
    {
        return mDStreamIDLength > 0;
    }

    public MutableDirectBuffer mDStreamID()
    {
        return mDStreamID;
    }

    public String mDStreamIDAsString()
    {
        return mDStreamID.getStringWithoutLengthAscii(mDStreamIDOffset, mDStreamIDLength);
    }

    public MarketDataSnapshotFullRefreshEncoder mDStreamID(final CharSequence value)
    {
        toBytes(value, mDStreamID);
        mDStreamIDOffset = 0;
        mDStreamIDLength = value.length();
        return this;
    }

    public MarketDataSnapshotFullRefreshEncoder mDStreamID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            mDStreamID.wrap(buffer);
            mDStreamIDOffset = value.offset();
            mDStreamIDLength = value.length();
        }
        return this;
    }

    public MarketDataSnapshotFullRefreshEncoder mDStreamID(final char[] value)
    {
        return mDStreamID(value, 0, value.length);
    }

    public MarketDataSnapshotFullRefreshEncoder mDStreamID(final char[] value, final int length)
    {
        return mDStreamID(value, 0, length);
    }

    public MarketDataSnapshotFullRefreshEncoder mDStreamID(final char[] value, final int offset, final int length)
    {
        toBytes(value, mDStreamID, offset, length);
        mDStreamIDOffset = 0;
        mDStreamIDLength = length;
        return this;
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

    private final MutableDirectBuffer financialStatus = new UnsafeBuffer();

    private int financialStatusOffset = 0;

    private int financialStatusLength = 0;

    public MarketDataSnapshotFullRefreshEncoder financialStatus(final DirectBuffer value, final int offset, final int length)
    {
        financialStatus.wrap(value);
        financialStatusOffset = offset;
        financialStatusLength = length;
        return this;
    }

    public MarketDataSnapshotFullRefreshEncoder financialStatus(final DirectBuffer value, final int length)
    {
        return financialStatus(value, 0, length);
    }

    public MarketDataSnapshotFullRefreshEncoder financialStatus(final DirectBuffer value)
    {
        return financialStatus(value, 0, value.capacity());
    }

    public MarketDataSnapshotFullRefreshEncoder financialStatus(final byte[] value, final int offset, final int length)
    {
        financialStatus.wrap(value);
        financialStatusOffset = offset;
        financialStatusLength = length;
        return this;
    }

    public MarketDataSnapshotFullRefreshEncoder financialStatusAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(financialStatus, value, offset, length);
        financialStatusOffset = offset;
        financialStatusLength = length;
        return this;
    }

    public MarketDataSnapshotFullRefreshEncoder financialStatus(final byte[] value, final int length)
    {
        return financialStatus(value, 0, length);
    }

    public MarketDataSnapshotFullRefreshEncoder financialStatus(final byte[] value)
    {
        return financialStatus(value, 0, value.length);
    }

    public boolean hasFinancialStatus()
    {
        return financialStatusLength > 0;
    }

    public MutableDirectBuffer financialStatus()
    {
        return financialStatus;
    }

    public String financialStatusAsString()
    {
        return financialStatus.getStringWithoutLengthAscii(financialStatusOffset, financialStatusLength);
    }

    public MarketDataSnapshotFullRefreshEncoder financialStatus(final CharSequence value)
    {
        toBytes(value, financialStatus);
        financialStatusOffset = 0;
        financialStatusLength = value.length();
        return this;
    }

    public MarketDataSnapshotFullRefreshEncoder financialStatus(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            financialStatus.wrap(buffer);
            financialStatusOffset = value.offset();
            financialStatusLength = value.length();
        }
        return this;
    }

    public MarketDataSnapshotFullRefreshEncoder financialStatus(final char[] value)
    {
        return financialStatus(value, 0, value.length);
    }

    public MarketDataSnapshotFullRefreshEncoder financialStatus(final char[] value, final int length)
    {
        return financialStatus(value, 0, length);
    }

    public MarketDataSnapshotFullRefreshEncoder financialStatus(final char[] value, final int offset, final int length)
    {
        toBytes(value, financialStatus, offset, length);
        financialStatusOffset = 0;
        financialStatusLength = length;
        return this;
    }

    private final MutableDirectBuffer corporateAction = new UnsafeBuffer();

    private int corporateActionOffset = 0;

    private int corporateActionLength = 0;

    public MarketDataSnapshotFullRefreshEncoder corporateAction(final DirectBuffer value, final int offset, final int length)
    {
        corporateAction.wrap(value);
        corporateActionOffset = offset;
        corporateActionLength = length;
        return this;
    }

    public MarketDataSnapshotFullRefreshEncoder corporateAction(final DirectBuffer value, final int length)
    {
        return corporateAction(value, 0, length);
    }

    public MarketDataSnapshotFullRefreshEncoder corporateAction(final DirectBuffer value)
    {
        return corporateAction(value, 0, value.capacity());
    }

    public MarketDataSnapshotFullRefreshEncoder corporateAction(final byte[] value, final int offset, final int length)
    {
        corporateAction.wrap(value);
        corporateActionOffset = offset;
        corporateActionLength = length;
        return this;
    }

    public MarketDataSnapshotFullRefreshEncoder corporateActionAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(corporateAction, value, offset, length);
        corporateActionOffset = offset;
        corporateActionLength = length;
        return this;
    }

    public MarketDataSnapshotFullRefreshEncoder corporateAction(final byte[] value, final int length)
    {
        return corporateAction(value, 0, length);
    }

    public MarketDataSnapshotFullRefreshEncoder corporateAction(final byte[] value)
    {
        return corporateAction(value, 0, value.length);
    }

    public boolean hasCorporateAction()
    {
        return corporateActionLength > 0;
    }

    public MutableDirectBuffer corporateAction()
    {
        return corporateAction;
    }

    public String corporateActionAsString()
    {
        return corporateAction.getStringWithoutLengthAscii(corporateActionOffset, corporateActionLength);
    }

    public MarketDataSnapshotFullRefreshEncoder corporateAction(final CharSequence value)
    {
        toBytes(value, corporateAction);
        corporateActionOffset = 0;
        corporateActionLength = value.length();
        return this;
    }

    public MarketDataSnapshotFullRefreshEncoder corporateAction(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            corporateAction.wrap(buffer);
            corporateActionOffset = value.offset();
            corporateActionLength = value.length();
        }
        return this;
    }

    public MarketDataSnapshotFullRefreshEncoder corporateAction(final char[] value)
    {
        return corporateAction(value, 0, value.length);
    }

    public MarketDataSnapshotFullRefreshEncoder corporateAction(final char[] value, final int length)
    {
        return corporateAction(value, 0, length);
    }

    public MarketDataSnapshotFullRefreshEncoder corporateAction(final char[] value, final int offset, final int length)
    {
        toBytes(value, corporateAction, offset, length);
        corporateActionOffset = 0;
        corporateActionLength = length;
        return this;
    }

    private final DecimalFloat netChgPrevDay = new DecimalFloat();

    private boolean hasNetChgPrevDay;

    public boolean hasNetChgPrevDay()
    {
        return hasNetChgPrevDay;
    }

    public MarketDataSnapshotFullRefreshEncoder netChgPrevDay(DecimalFloat value)
    {
        netChgPrevDay.set(value);
        hasNetChgPrevDay = true;
        return this;
    }

    public MarketDataSnapshotFullRefreshEncoder netChgPrevDay(long value, int scale)
    {
        netChgPrevDay.set(value, scale);
        hasNetChgPrevDay = true;
        return this;
    }

    public DecimalFloat netChgPrevDay()
    {
        return netChgPrevDay;
    }

    private final MDFullGrpEncoder mDFullGrp = new MDFullGrpEncoder();
    public MDFullGrpEncoder mDFullGrp()
    {
        return mDFullGrp;
    }

    private int applQueueDepth;

    private boolean hasApplQueueDepth;

    public boolean hasApplQueueDepth()
    {
        return hasApplQueueDepth;
    }

    public MarketDataSnapshotFullRefreshEncoder applQueueDepth(int value)
    {
        applQueueDepth = value;
        hasApplQueueDepth = true;
        return this;
    }

    public int applQueueDepth()
    {
        return applQueueDepth;
    }

    private int applQueueResolution;

    private boolean hasApplQueueResolution;

    public boolean hasApplQueueResolution()
    {
        return hasApplQueueResolution;
    }

    public MarketDataSnapshotFullRefreshEncoder applQueueResolution(int value)
    {
        applQueueResolution = value;
        hasApplQueueResolution = true;
        return this;
    }

    public int applQueueResolution()
    {
        return applQueueResolution;
    }

    public MarketDataSnapshotFullRefreshEncoder applQueueResolution(ApplQueueResolution value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == ApplQueueResolution.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: applQueueResolution Value: " + value );
            }
            if (value == ApplQueueResolution.NULL_VAL)
            {
                return this;
            }
        }
        return applQueueResolution(value.representation());
    }

    private final RoutingGrpEncoder routingGrp = new RoutingGrpEncoder();
    public RoutingGrpEncoder routingGrp()
    {
        return routingGrp;
    }

    public long encode(final MutableAsciiBuffer buffer, final int offset)
    {
        final long startMessageResult = header.startMessage(buffer, offset);
        final int bodyStart = Encoder.offset(startMessageResult);
        int position = bodyStart + Encoder.length(startMessageResult);

            position += applicationSequenceControl.encode(buffer, position);

        if (hasTotNumReports)
        {
            buffer.putBytes(position, totNumReportsHeader, 0, totNumReportsHeaderLength);
            position += totNumReportsHeaderLength;
            position += buffer.putIntAscii(position, totNumReports);
            buffer.putSeparator(position);
            position++;
        }

        if (hasMDReportID)
        {
            buffer.putBytes(position, mDReportIDHeader, 0, mDReportIDHeaderLength);
            position += mDReportIDHeaderLength;
            position += buffer.putIntAscii(position, mDReportID);
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

        if (hasMDBookType)
        {
            buffer.putBytes(position, mDBookTypeHeader, 0, mDBookTypeHeaderLength);
            position += mDBookTypeHeaderLength;
            position += buffer.putIntAscii(position, mDBookType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasMDSubBookType)
        {
            buffer.putBytes(position, mDSubBookTypeHeader, 0, mDSubBookTypeHeaderLength);
            position += mDSubBookTypeHeaderLength;
            position += buffer.putIntAscii(position, mDSubBookType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasMarketDepth)
        {
            buffer.putBytes(position, marketDepthHeader, 0, marketDepthHeaderLength);
            position += marketDepthHeaderLength;
            position += buffer.putIntAscii(position, marketDepth);
            buffer.putSeparator(position);
            position++;
        }

        if (mDFeedTypeLength > 0)
        {
            buffer.putBytes(position, mDFeedTypeHeader, 0, mDFeedTypeHeaderLength);
            position += mDFeedTypeHeaderLength;
            buffer.putBytes(position, mDFeedType, mDFeedTypeOffset, mDFeedTypeLength);
            position += mDFeedTypeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasRefreshIndicator)
        {
            buffer.putBytes(position, refreshIndicatorHeader, 0, refreshIndicatorHeaderLength);
            position += refreshIndicatorHeaderLength;
            position += buffer.putBooleanAscii(position, refreshIndicator);
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

        if (mDReqIDLength > 0)
        {
            buffer.putBytes(position, mDReqIDHeader, 0, mDReqIDHeaderLength);
            position += mDReqIDHeaderLength;
            buffer.putBytes(position, mDReqID, mDReqIDOffset, mDReqIDLength);
            position += mDReqIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (mDStreamIDLength > 0)
        {
            buffer.putBytes(position, mDStreamIDHeader, 0, mDStreamIDHeaderLength);
            position += mDStreamIDHeaderLength;
            buffer.putBytes(position, mDStreamID, mDStreamIDOffset, mDStreamIDLength);
            position += mDStreamIDLength;
            buffer.putSeparator(position);
            position++;
        }

            position += instrument.encode(buffer, position);

            position += undInstrmtGrp.encode(buffer, position);

            position += instrmtLegGrp.encode(buffer, position);

        if (financialStatusLength > 0)
        {
            buffer.putBytes(position, financialStatusHeader, 0, financialStatusHeaderLength);
            position += financialStatusHeaderLength;
            buffer.putBytes(position, financialStatus, financialStatusOffset, financialStatusLength);
            position += financialStatusLength;
            buffer.putSeparator(position);
            position++;
        }

        if (corporateActionLength > 0)
        {
            buffer.putBytes(position, corporateActionHeader, 0, corporateActionHeaderLength);
            position += corporateActionHeaderLength;
            buffer.putBytes(position, corporateAction, corporateActionOffset, corporateActionLength);
            position += corporateActionLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasNetChgPrevDay)
        {
            buffer.putBytes(position, netChgPrevDayHeader, 0, netChgPrevDayHeaderLength);
            position += netChgPrevDayHeaderLength;
            position += buffer.putFloatAscii(position, netChgPrevDay);
            buffer.putSeparator(position);
            position++;
        }

            position += mDFullGrp.encode(buffer, position);

        if (hasApplQueueDepth)
        {
            buffer.putBytes(position, applQueueDepthHeader, 0, applQueueDepthHeaderLength);
            position += applQueueDepthHeaderLength;
            position += buffer.putIntAscii(position, applQueueDepth);
            buffer.putSeparator(position);
            position++;
        }

        if (hasApplQueueResolution)
        {
            buffer.putBytes(position, applQueueResolutionHeader, 0, applQueueResolutionHeaderLength);
            position += applQueueResolutionHeaderLength;
            position += buffer.putIntAscii(position, applQueueResolution);
            buffer.putSeparator(position);
            position++;
        }

            position += routingGrp.encode(buffer, position);
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
        this.resetTotNumReports();
        this.resetMDReportID();
        this.resetClearingBusinessDate();
        this.resetMDBookType();
        this.resetMDSubBookType();
        this.resetMarketDepth();
        this.resetMDFeedType();
        this.resetRefreshIndicator();
        this.resetTradeDate();
        this.resetMDReqID();
        this.resetMDStreamID();
        this.resetFinancialStatus();
        this.resetCorporateAction();
        this.resetNetChgPrevDay();
        this.resetApplQueueDepth();
        this.resetApplQueueResolution();
        applicationSequenceControl.reset();
        instrument.reset();
        undInstrmtGrp.reset();
        instrmtLegGrp.reset();
        mDFullGrp.reset();
        routingGrp.reset();
    }

    public void resetTotNumReports()
    {
        hasTotNumReports = false;
    }

    public void resetMDReportID()
    {
        hasMDReportID = false;
    }

    public void resetClearingBusinessDate()
    {
        clearingBusinessDateLength = 0;
    }

    public void resetMDBookType()
    {
        hasMDBookType = false;
    }

    public void resetMDSubBookType()
    {
        hasMDSubBookType = false;
    }

    public void resetMarketDepth()
    {
        hasMarketDepth = false;
    }

    public void resetMDFeedType()
    {
        mDFeedTypeLength = 0;
    }

    public void resetRefreshIndicator()
    {
        hasRefreshIndicator = false;
    }

    public void resetTradeDate()
    {
        tradeDateLength = 0;
    }

    public void resetMDReqID()
    {
        mDReqIDLength = 0;
    }

    public void resetMDStreamID()
    {
        mDStreamIDLength = 0;
    }

    public void resetFinancialStatus()
    {
        financialStatusLength = 0;
    }

    public void resetCorporateAction()
    {
        corporateActionLength = 0;
    }

    public void resetNetChgPrevDay()
    {
        hasNetChgPrevDay = false;
    }

    public void resetApplQueueDepth()
    {
        hasApplQueueDepth = false;
    }

    public void resetApplQueueResolution()
    {
        hasApplQueueResolution = false;
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
        builder.append("\"MessageName\": \"MarketDataSnapshotFullRefresh\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
    indent(builder, level);
    builder.append("\"ApplicationSequenceControl\": ");
    applicationSequenceControl.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasTotNumReports())
        {
            indent(builder, level);
            builder.append("\"TotNumReports\": \"");
            builder.append(totNumReports);
            builder.append("\",\n");
        }

        if (hasMDReportID())
        {
            indent(builder, level);
            builder.append("\"MDReportID\": \"");
            builder.append(mDReportID);
            builder.append("\",\n");
        }

        if (hasClearingBusinessDate())
        {
            indent(builder, level);
            builder.append("\"ClearingBusinessDate\": \"");
            appendBuffer(builder, clearingBusinessDate, clearingBusinessDateOffset, clearingBusinessDateLength);
            builder.append("\",\n");
        }

        if (hasMDBookType())
        {
            indent(builder, level);
            builder.append("\"MDBookType\": \"");
            builder.append(mDBookType);
            builder.append("\",\n");
        }

        if (hasMDSubBookType())
        {
            indent(builder, level);
            builder.append("\"MDSubBookType\": \"");
            builder.append(mDSubBookType);
            builder.append("\",\n");
        }

        if (hasMarketDepth())
        {
            indent(builder, level);
            builder.append("\"MarketDepth\": \"");
            builder.append(marketDepth);
            builder.append("\",\n");
        }

        if (hasMDFeedType())
        {
            indent(builder, level);
            builder.append("\"MDFeedType\": \"");
            appendBuffer(builder, mDFeedType, mDFeedTypeOffset, mDFeedTypeLength);
            builder.append("\",\n");
        }

        if (hasRefreshIndicator())
        {
            indent(builder, level);
            builder.append("\"RefreshIndicator\": \"");
            builder.append(refreshIndicator);
            builder.append("\",\n");
        }

        if (hasTradeDate())
        {
            indent(builder, level);
            builder.append("\"TradeDate\": \"");
            appendBuffer(builder, tradeDate, tradeDateOffset, tradeDateLength);
            builder.append("\",\n");
        }

        if (hasMDReqID())
        {
            indent(builder, level);
            builder.append("\"MDReqID\": \"");
            appendBuffer(builder, mDReqID, mDReqIDOffset, mDReqIDLength);
            builder.append("\",\n");
        }

        if (hasMDStreamID())
        {
            indent(builder, level);
            builder.append("\"MDStreamID\": \"");
            appendBuffer(builder, mDStreamID, mDStreamIDOffset, mDStreamIDLength);
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

        if (hasFinancialStatus())
        {
            indent(builder, level);
            builder.append("\"FinancialStatus\": \"");
            appendBuffer(builder, financialStatus, financialStatusOffset, financialStatusLength);
            builder.append("\",\n");
        }

        if (hasCorporateAction())
        {
            indent(builder, level);
            builder.append("\"CorporateAction\": \"");
            appendBuffer(builder, corporateAction, corporateActionOffset, corporateActionLength);
            builder.append("\",\n");
        }

        if (hasNetChgPrevDay())
        {
            indent(builder, level);
            builder.append("\"NetChgPrevDay\": \"");
            netChgPrevDay.appendTo(builder);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"MDFullGrp\": ");
    mDFullGrp.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasApplQueueDepth())
        {
            indent(builder, level);
            builder.append("\"ApplQueueDepth\": \"");
            builder.append(applQueueDepth);
            builder.append("\",\n");
        }

        if (hasApplQueueResolution())
        {
            indent(builder, level);
            builder.append("\"ApplQueueResolution\": \"");
            builder.append(applQueueResolution);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"RoutingGrp\": ");
    routingGrp.appendTo(builder, level + 1);
    builder.append("\n");
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public MarketDataSnapshotFullRefreshEncoder copyTo(final Encoder encoder)
    {
        return copyTo((MarketDataSnapshotFullRefreshEncoder)encoder);
    }

    public MarketDataSnapshotFullRefreshEncoder copyTo(final MarketDataSnapshotFullRefreshEncoder encoder)
    {
        encoder.reset();

        applicationSequenceControl.copyTo(encoder.applicationSequenceControl());
        if (hasTotNumReports())
        {
            encoder.totNumReports(this.totNumReports());
        }

        if (hasMDReportID())
        {
            encoder.mDReportID(this.mDReportID());
        }

        if (hasClearingBusinessDate())
        {
            encoder.clearingBusinessDateAsCopy(clearingBusinessDate.byteArray(), 0, clearingBusinessDateLength);
        }

        if (hasMDBookType())
        {
            encoder.mDBookType(this.mDBookType());
        }

        if (hasMDSubBookType())
        {
            encoder.mDSubBookType(this.mDSubBookType());
        }

        if (hasMarketDepth())
        {
            encoder.marketDepth(this.marketDepth());
        }

        if (hasMDFeedType())
        {
            encoder.mDFeedTypeAsCopy(mDFeedType.byteArray(), 0, mDFeedTypeLength);
        }

        if (hasRefreshIndicator())
        {
            encoder.refreshIndicator(this.refreshIndicator());
        }

        if (hasTradeDate())
        {
            encoder.tradeDateAsCopy(tradeDate.byteArray(), 0, tradeDateLength);
        }

        if (hasMDReqID())
        {
            encoder.mDReqIDAsCopy(mDReqID.byteArray(), 0, mDReqIDLength);
        }

        if (hasMDStreamID())
        {
            encoder.mDStreamIDAsCopy(mDStreamID.byteArray(), 0, mDStreamIDLength);
        }


        instrument.copyTo(encoder.instrument());

        undInstrmtGrp.copyTo(encoder.undInstrmtGrp());

        instrmtLegGrp.copyTo(encoder.instrmtLegGrp());
        if (hasFinancialStatus())
        {
            encoder.financialStatusAsCopy(financialStatus.byteArray(), 0, financialStatusLength);
        }

        if (hasCorporateAction())
        {
            encoder.corporateActionAsCopy(corporateAction.byteArray(), 0, corporateActionLength);
        }

        if (hasNetChgPrevDay())
        {
            encoder.netChgPrevDay(this.netChgPrevDay());
        }


        mDFullGrp.copyTo(encoder.mDFullGrp());
        if (hasApplQueueDepth())
        {
            encoder.applQueueDepth(this.applQueueDepth());
        }

        if (hasApplQueueResolution())
        {
            encoder.applQueueResolution(this.applQueueResolution());
        }


        routingGrp.copyTo(encoder.routingGrp());        return encoder;
    }

}
