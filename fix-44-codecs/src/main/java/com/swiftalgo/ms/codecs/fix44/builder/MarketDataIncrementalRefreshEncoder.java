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


public class MarketDataIncrementalRefreshEncoder implements Encoder
{
    public long messageType()
    {
        return 88L;
    }

    public MarketDataIncrementalRefreshEncoder()
    {
        header.msgType("X");
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

    private static final int mDReqIDHeaderLength = 4;
    private static final byte[] mDReqIDHeader = new byte[] {50, 54, 50, (byte) '='};

    private static final int noMDEntriesGroupCounterHeaderLength = 4;
    private static final byte[] noMDEntriesGroupCounterHeader = new byte[] {50, 54, 56, (byte) '='};

    private static final int applQueueDepthHeaderLength = 4;
    private static final byte[] applQueueDepthHeader = new byte[] {56, 49, 51, (byte) '='};

    private static final int applQueueResolutionHeaderLength = 4;
    private static final byte[] applQueueResolutionHeader = new byte[] {56, 49, 52, (byte) '='};

    private final MutableDirectBuffer mDReqID = new UnsafeBuffer();

    private int mDReqIDOffset = 0;

    private int mDReqIDLength = 0;

    public MarketDataIncrementalRefreshEncoder mDReqID(final DirectBuffer value, final int offset, final int length)
    {
        mDReqID.wrap(value);
        mDReqIDOffset = offset;
        mDReqIDLength = length;
        return this;
    }

    public MarketDataIncrementalRefreshEncoder mDReqID(final DirectBuffer value, final int length)
    {
        return mDReqID(value, 0, length);
    }

    public MarketDataIncrementalRefreshEncoder mDReqID(final DirectBuffer value)
    {
        return mDReqID(value, 0, value.capacity());
    }

    public MarketDataIncrementalRefreshEncoder mDReqID(final byte[] value, final int offset, final int length)
    {
        mDReqID.wrap(value);
        mDReqIDOffset = offset;
        mDReqIDLength = length;
        return this;
    }

    public MarketDataIncrementalRefreshEncoder mDReqIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(mDReqID, value, offset, length);
        mDReqIDOffset = offset;
        mDReqIDLength = length;
        return this;
    }

    public MarketDataIncrementalRefreshEncoder mDReqID(final byte[] value, final int length)
    {
        return mDReqID(value, 0, length);
    }

    public MarketDataIncrementalRefreshEncoder mDReqID(final byte[] value)
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

    public MarketDataIncrementalRefreshEncoder mDReqID(final CharSequence value)
    {
        toBytes(value, mDReqID);
        mDReqIDOffset = 0;
        mDReqIDLength = value.length();
        return this;
    }

    public MarketDataIncrementalRefreshEncoder mDReqID(final AsciiSequenceView value)
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

    public MarketDataIncrementalRefreshEncoder mDReqID(final char[] value)
    {
        return mDReqID(value, 0, value.length);
    }

    public MarketDataIncrementalRefreshEncoder mDReqID(final char[] value, final int length)
    {
        return mDReqID(value, 0, length);
    }

    public MarketDataIncrementalRefreshEncoder mDReqID(final char[] value, final int offset, final int length)
    {
        toBytes(value, mDReqID, offset, length);
        mDReqIDOffset = 0;
        mDReqIDLength = length;
        return this;
    }



public static class MDEntriesGroupEncoder
{
    private MDEntriesGroupEncoder next = null;

    public MDEntriesGroupEncoder next()
    {
        if (next == null)
        {
            next = new MDEntriesGroupEncoder();
        }
        return next;
    }

    private static final int mDUpdateActionHeaderLength = 4;
    private static final byte[] mDUpdateActionHeader = new byte[] {50, 55, 57, (byte) '='};

    private static final int deleteReasonHeaderLength = 4;
    private static final byte[] deleteReasonHeader = new byte[] {50, 56, 53, (byte) '='};

    private static final int mDEntryTypeHeaderLength = 4;
    private static final byte[] mDEntryTypeHeader = new byte[] {50, 54, 57, (byte) '='};

    private static final int mDEntryIDHeaderLength = 4;
    private static final byte[] mDEntryIDHeader = new byte[] {50, 55, 56, (byte) '='};

    private static final int mDEntryRefIDHeaderLength = 4;
    private static final byte[] mDEntryRefIDHeader = new byte[] {50, 56, 48, (byte) '='};

    private static final int noUnderlyingsGroupCounterHeaderLength = 4;
    private static final byte[] noUnderlyingsGroupCounterHeader = new byte[] {55, 49, 49, (byte) '='};

    private static final int noLegsGroupCounterHeaderLength = 4;
    private static final byte[] noLegsGroupCounterHeader = new byte[] {53, 53, 53, (byte) '='};

    private static final int financialStatusHeaderLength = 4;
    private static final byte[] financialStatusHeader = new byte[] {50, 57, 49, (byte) '='};

    private static final int corporateActionHeaderLength = 4;
    private static final byte[] corporateActionHeader = new byte[] {50, 57, 50, (byte) '='};

    private static final int mDEntryPxHeaderLength = 4;
    private static final byte[] mDEntryPxHeader = new byte[] {50, 55, 48, (byte) '='};

    private static final int currencyHeaderLength = 3;
    private static final byte[] currencyHeader = new byte[] {49, 53, (byte) '='};

    private static final int mDEntrySizeHeaderLength = 4;
    private static final byte[] mDEntrySizeHeader = new byte[] {50, 55, 49, (byte) '='};

    private static final int mDEntryDateHeaderLength = 4;
    private static final byte[] mDEntryDateHeader = new byte[] {50, 55, 50, (byte) '='};

    private static final int mDEntryTimeHeaderLength = 4;
    private static final byte[] mDEntryTimeHeader = new byte[] {50, 55, 51, (byte) '='};

    private static final int tickDirectionHeaderLength = 4;
    private static final byte[] tickDirectionHeader = new byte[] {50, 55, 52, (byte) '='};

    private static final int mDMktHeaderLength = 4;
    private static final byte[] mDMktHeader = new byte[] {50, 55, 53, (byte) '='};

    private static final int tradingSessionIDHeaderLength = 4;
    private static final byte[] tradingSessionIDHeader = new byte[] {51, 51, 54, (byte) '='};

    private static final int tradingSessionSubIDHeaderLength = 4;
    private static final byte[] tradingSessionSubIDHeader = new byte[] {54, 50, 53, (byte) '='};

    private static final int quoteConditionHeaderLength = 4;
    private static final byte[] quoteConditionHeader = new byte[] {50, 55, 54, (byte) '='};

    private static final int tradeConditionHeaderLength = 4;
    private static final byte[] tradeConditionHeader = new byte[] {50, 55, 55, (byte) '='};

    private static final int mDEntryOriginatorHeaderLength = 4;
    private static final byte[] mDEntryOriginatorHeader = new byte[] {50, 56, 50, (byte) '='};

    private static final int locationIDHeaderLength = 4;
    private static final byte[] locationIDHeader = new byte[] {50, 56, 51, (byte) '='};

    private static final int deskIDHeaderLength = 4;
    private static final byte[] deskIDHeader = new byte[] {50, 56, 52, (byte) '='};

    private static final int openCloseSettlFlagHeaderLength = 4;
    private static final byte[] openCloseSettlFlagHeader = new byte[] {50, 56, 54, (byte) '='};

    private static final int timeInForceHeaderLength = 3;
    private static final byte[] timeInForceHeader = new byte[] {53, 57, (byte) '='};

    private static final int expireDateHeaderLength = 4;
    private static final byte[] expireDateHeader = new byte[] {52, 51, 50, (byte) '='};

    private static final int expireTimeHeaderLength = 4;
    private static final byte[] expireTimeHeader = new byte[] {49, 50, 54, (byte) '='};

    private static final int minQtyHeaderLength = 4;
    private static final byte[] minQtyHeader = new byte[] {49, 49, 48, (byte) '='};

    private static final int execInstHeaderLength = 3;
    private static final byte[] execInstHeader = new byte[] {49, 56, (byte) '='};

    private static final int sellerDaysHeaderLength = 4;
    private static final byte[] sellerDaysHeader = new byte[] {50, 56, 55, (byte) '='};

    private static final int orderIDHeaderLength = 3;
    private static final byte[] orderIDHeader = new byte[] {51, 55, (byte) '='};

    private static final int quoteEntryIDHeaderLength = 4;
    private static final byte[] quoteEntryIDHeader = new byte[] {50, 57, 57, (byte) '='};

    private static final int mDEntryBuyerHeaderLength = 4;
    private static final byte[] mDEntryBuyerHeader = new byte[] {50, 56, 56, (byte) '='};

    private static final int mDEntrySellerHeaderLength = 4;
    private static final byte[] mDEntrySellerHeader = new byte[] {50, 56, 57, (byte) '='};

    private static final int numberOfOrdersHeaderLength = 4;
    private static final byte[] numberOfOrdersHeader = new byte[] {51, 52, 54, (byte) '='};

    private static final int mDEntryPositionNoHeaderLength = 4;
    private static final byte[] mDEntryPositionNoHeader = new byte[] {50, 57, 48, (byte) '='};

    private static final int scopeHeaderLength = 4;
    private static final byte[] scopeHeader = new byte[] {53, 52, 54, (byte) '='};

    private static final int priceDeltaHeaderLength = 4;
    private static final byte[] priceDeltaHeader = new byte[] {56, 49, 49, (byte) '='};

    private static final int netChgPrevDayHeaderLength = 4;
    private static final byte[] netChgPrevDayHeader = new byte[] {52, 53, 49, (byte) '='};

    private static final int textHeaderLength = 3;
    private static final byte[] textHeader = new byte[] {53, 56, (byte) '='};

    private static final int encodedTextLenHeaderLength = 4;
    private static final byte[] encodedTextLenHeader = new byte[] {51, 53, 52, (byte) '='};

    private static final int encodedTextHeaderLength = 4;
    private static final byte[] encodedTextHeader = new byte[] {51, 53, 53, (byte) '='};

    private char mDUpdateAction;

    private boolean hasMDUpdateAction;

    public boolean hasMDUpdateAction()
    {
        return hasMDUpdateAction;
    }

    public MDEntriesGroupEncoder mDUpdateAction(char value)
    {
        mDUpdateAction = value;
        hasMDUpdateAction = true;
        return this;
    }

    public char mDUpdateAction()
    {
        return mDUpdateAction;
    }

    public MDEntriesGroupEncoder mDUpdateAction(MDUpdateAction value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == MDUpdateAction.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: mDUpdateAction Value: " + value );
            }
            if (value == MDUpdateAction.NULL_VAL)
            {
                return this;
            }
        }
        return mDUpdateAction(value.representation());
    }

    private char deleteReason;

    private boolean hasDeleteReason;

    public boolean hasDeleteReason()
    {
        return hasDeleteReason;
    }

    public MDEntriesGroupEncoder deleteReason(char value)
    {
        deleteReason = value;
        hasDeleteReason = true;
        return this;
    }

    public char deleteReason()
    {
        return deleteReason;
    }

    public MDEntriesGroupEncoder deleteReason(DeleteReason value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == DeleteReason.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: deleteReason Value: " + value );
            }
            if (value == DeleteReason.NULL_VAL)
            {
                return this;
            }
        }
        return deleteReason(value.representation());
    }

    private char mDEntryType;

    private boolean hasMDEntryType;

    public boolean hasMDEntryType()
    {
        return hasMDEntryType;
    }

    public MDEntriesGroupEncoder mDEntryType(char value)
    {
        mDEntryType = value;
        hasMDEntryType = true;
        return this;
    }

    public char mDEntryType()
    {
        return mDEntryType;
    }

    public MDEntriesGroupEncoder mDEntryType(MDEntryType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == MDEntryType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: mDEntryType Value: " + value );
            }
            if (value == MDEntryType.NULL_VAL)
            {
                return this;
            }
        }
        return mDEntryType(value.representation());
    }

    private final MutableDirectBuffer mDEntryID = new UnsafeBuffer();

    private int mDEntryIDOffset = 0;

    private int mDEntryIDLength = 0;

    public MDEntriesGroupEncoder mDEntryID(final DirectBuffer value, final int offset, final int length)
    {
        mDEntryID.wrap(value);
        mDEntryIDOffset = offset;
        mDEntryIDLength = length;
        return this;
    }

    public MDEntriesGroupEncoder mDEntryID(final DirectBuffer value, final int length)
    {
        return mDEntryID(value, 0, length);
    }

    public MDEntriesGroupEncoder mDEntryID(final DirectBuffer value)
    {
        return mDEntryID(value, 0, value.capacity());
    }

    public MDEntriesGroupEncoder mDEntryID(final byte[] value, final int offset, final int length)
    {
        mDEntryID.wrap(value);
        mDEntryIDOffset = offset;
        mDEntryIDLength = length;
        return this;
    }

    public MDEntriesGroupEncoder mDEntryIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(mDEntryID, value, offset, length);
        mDEntryIDOffset = offset;
        mDEntryIDLength = length;
        return this;
    }

    public MDEntriesGroupEncoder mDEntryID(final byte[] value, final int length)
    {
        return mDEntryID(value, 0, length);
    }

    public MDEntriesGroupEncoder mDEntryID(final byte[] value)
    {
        return mDEntryID(value, 0, value.length);
    }

    public boolean hasMDEntryID()
    {
        return mDEntryIDLength > 0;
    }

    public MutableDirectBuffer mDEntryID()
    {
        return mDEntryID;
    }

    public String mDEntryIDAsString()
    {
        return mDEntryID.getStringWithoutLengthAscii(mDEntryIDOffset, mDEntryIDLength);
    }

    public MDEntriesGroupEncoder mDEntryID(final CharSequence value)
    {
        toBytes(value, mDEntryID);
        mDEntryIDOffset = 0;
        mDEntryIDLength = value.length();
        return this;
    }

    public MDEntriesGroupEncoder mDEntryID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            mDEntryID.wrap(buffer);
            mDEntryIDOffset = value.offset();
            mDEntryIDLength = value.length();
        }
        return this;
    }

    public MDEntriesGroupEncoder mDEntryID(final char[] value)
    {
        return mDEntryID(value, 0, value.length);
    }

    public MDEntriesGroupEncoder mDEntryID(final char[] value, final int length)
    {
        return mDEntryID(value, 0, length);
    }

    public MDEntriesGroupEncoder mDEntryID(final char[] value, final int offset, final int length)
    {
        toBytes(value, mDEntryID, offset, length);
        mDEntryIDOffset = 0;
        mDEntryIDLength = length;
        return this;
    }

    private final MutableDirectBuffer mDEntryRefID = new UnsafeBuffer();

    private int mDEntryRefIDOffset = 0;

    private int mDEntryRefIDLength = 0;

    public MDEntriesGroupEncoder mDEntryRefID(final DirectBuffer value, final int offset, final int length)
    {
        mDEntryRefID.wrap(value);
        mDEntryRefIDOffset = offset;
        mDEntryRefIDLength = length;
        return this;
    }

    public MDEntriesGroupEncoder mDEntryRefID(final DirectBuffer value, final int length)
    {
        return mDEntryRefID(value, 0, length);
    }

    public MDEntriesGroupEncoder mDEntryRefID(final DirectBuffer value)
    {
        return mDEntryRefID(value, 0, value.capacity());
    }

    public MDEntriesGroupEncoder mDEntryRefID(final byte[] value, final int offset, final int length)
    {
        mDEntryRefID.wrap(value);
        mDEntryRefIDOffset = offset;
        mDEntryRefIDLength = length;
        return this;
    }

    public MDEntriesGroupEncoder mDEntryRefIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(mDEntryRefID, value, offset, length);
        mDEntryRefIDOffset = offset;
        mDEntryRefIDLength = length;
        return this;
    }

    public MDEntriesGroupEncoder mDEntryRefID(final byte[] value, final int length)
    {
        return mDEntryRefID(value, 0, length);
    }

    public MDEntriesGroupEncoder mDEntryRefID(final byte[] value)
    {
        return mDEntryRefID(value, 0, value.length);
    }

    public boolean hasMDEntryRefID()
    {
        return mDEntryRefIDLength > 0;
    }

    public MutableDirectBuffer mDEntryRefID()
    {
        return mDEntryRefID;
    }

    public String mDEntryRefIDAsString()
    {
        return mDEntryRefID.getStringWithoutLengthAscii(mDEntryRefIDOffset, mDEntryRefIDLength);
    }

    public MDEntriesGroupEncoder mDEntryRefID(final CharSequence value)
    {
        toBytes(value, mDEntryRefID);
        mDEntryRefIDOffset = 0;
        mDEntryRefIDLength = value.length();
        return this;
    }

    public MDEntriesGroupEncoder mDEntryRefID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            mDEntryRefID.wrap(buffer);
            mDEntryRefIDOffset = value.offset();
            mDEntryRefIDLength = value.length();
        }
        return this;
    }

    public MDEntriesGroupEncoder mDEntryRefID(final char[] value)
    {
        return mDEntryRefID(value, 0, value.length);
    }

    public MDEntriesGroupEncoder mDEntryRefID(final char[] value, final int length)
    {
        return mDEntryRefID(value, 0, length);
    }

    public MDEntriesGroupEncoder mDEntryRefID(final char[] value, final int offset, final int length)
    {
        toBytes(value, mDEntryRefID, offset, length);
        mDEntryRefIDOffset = 0;
        mDEntryRefIDLength = length;
        return this;
    }

    private final InstrumentEncoder instrument = new InstrumentEncoder();
    public InstrumentEncoder instrument()
    {
        return instrument;
    }



public static class UnderlyingsGroupEncoder
{
    private UnderlyingsGroupEncoder next = null;

    public UnderlyingsGroupEncoder next()
    {
        if (next == null)
        {
            next = new UnderlyingsGroupEncoder();
        }
        return next;
    }

    private final UnderlyingInstrumentEncoder underlyingInstrument = new UnderlyingInstrumentEncoder();
    public UnderlyingInstrumentEncoder underlyingInstrument()
    {
        return underlyingInstrument;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

            position += underlyingInstrument.encode(buffer, position);
        if (next != null)
        {
            position += next.encode(buffer, position, remainingElements - 1);
        }
        return position - offset;
    }

    public void reset()
    {
        underlyingInstrument.reset();
        if (next != null)        {
            next.reset();
        }
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
        builder.append("\"MessageName\": \"UnderlyingsGroup\",\n");
    indent(builder, level);
    builder.append("\"UnderlyingInstrument\": ");
    underlyingInstrument.appendTo(builder, level + 1);
    builder.append("\n");
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public UnderlyingsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((UnderlyingsGroupEncoder)encoder);
    }

    public UnderlyingsGroupEncoder copyTo(final UnderlyingsGroupEncoder encoder)
    {
        encoder.reset();

        underlyingInstrument.copyTo(encoder.underlyingInstrument());        return encoder;
    }

}
    private int noUnderlyingsGroupCounter;

    private boolean hasNoUnderlyingsGroupCounter;

    public boolean hasNoUnderlyingsGroupCounter()
    {
        return hasNoUnderlyingsGroupCounter;
    }

    public MDEntriesGroupEncoder noUnderlyingsGroupCounter(int value)
    {
        noUnderlyingsGroupCounter = value;
        hasNoUnderlyingsGroupCounter = true;
        return this;
    }

    public int noUnderlyingsGroupCounter()
    {
        return noUnderlyingsGroupCounter;
    }


    private UnderlyingsGroupEncoder underlyingsGroup = null;

    public UnderlyingsGroupEncoder underlyingsGroup(final int numberOfElements)
    {
        hasNoUnderlyingsGroupCounter = true;
        noUnderlyingsGroupCounter = numberOfElements;
        if (underlyingsGroup == null)
        {
            underlyingsGroup = new UnderlyingsGroupEncoder();
        }
        return underlyingsGroup;
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

    private final InstrumentLegEncoder instrumentLeg = new InstrumentLegEncoder();
    public InstrumentLegEncoder instrumentLeg()
    {
        return instrumentLeg;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

            position += instrumentLeg.encode(buffer, position);
        if (next != null)
        {
            position += next.encode(buffer, position, remainingElements - 1);
        }
        return position - offset;
    }

    public void reset()
    {
        instrumentLeg.reset();
        if (next != null)        {
            next.reset();
        }
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

        instrumentLeg.copyTo(encoder.instrumentLeg());        return encoder;
    }

}
    private int noLegsGroupCounter;

    private boolean hasNoLegsGroupCounter;

    public boolean hasNoLegsGroupCounter()
    {
        return hasNoLegsGroupCounter;
    }

    public MDEntriesGroupEncoder noLegsGroupCounter(int value)
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

    private final MutableDirectBuffer financialStatus = new UnsafeBuffer();

    private int financialStatusOffset = 0;

    private int financialStatusLength = 0;

    public MDEntriesGroupEncoder financialStatus(final DirectBuffer value, final int offset, final int length)
    {
        financialStatus.wrap(value);
        financialStatusOffset = offset;
        financialStatusLength = length;
        return this;
    }

    public MDEntriesGroupEncoder financialStatus(final DirectBuffer value, final int length)
    {
        return financialStatus(value, 0, length);
    }

    public MDEntriesGroupEncoder financialStatus(final DirectBuffer value)
    {
        return financialStatus(value, 0, value.capacity());
    }

    public MDEntriesGroupEncoder financialStatus(final byte[] value, final int offset, final int length)
    {
        financialStatus.wrap(value);
        financialStatusOffset = offset;
        financialStatusLength = length;
        return this;
    }

    public MDEntriesGroupEncoder financialStatusAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(financialStatus, value, offset, length);
        financialStatusOffset = offset;
        financialStatusLength = length;
        return this;
    }

    public MDEntriesGroupEncoder financialStatus(final byte[] value, final int length)
    {
        return financialStatus(value, 0, length);
    }

    public MDEntriesGroupEncoder financialStatus(final byte[] value)
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

    public MDEntriesGroupEncoder financialStatus(final CharSequence value)
    {
        toBytes(value, financialStatus);
        financialStatusOffset = 0;
        financialStatusLength = value.length();
        return this;
    }

    public MDEntriesGroupEncoder financialStatus(final AsciiSequenceView value)
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

    public MDEntriesGroupEncoder financialStatus(final char[] value)
    {
        return financialStatus(value, 0, value.length);
    }

    public MDEntriesGroupEncoder financialStatus(final char[] value, final int length)
    {
        return financialStatus(value, 0, length);
    }

    public MDEntriesGroupEncoder financialStatus(final char[] value, final int offset, final int length)
    {
        toBytes(value, financialStatus, offset, length);
        financialStatusOffset = 0;
        financialStatusLength = length;
        return this;
    }

    private final MutableDirectBuffer corporateAction = new UnsafeBuffer();

    private int corporateActionOffset = 0;

    private int corporateActionLength = 0;

    public MDEntriesGroupEncoder corporateAction(final DirectBuffer value, final int offset, final int length)
    {
        corporateAction.wrap(value);
        corporateActionOffset = offset;
        corporateActionLength = length;
        return this;
    }

    public MDEntriesGroupEncoder corporateAction(final DirectBuffer value, final int length)
    {
        return corporateAction(value, 0, length);
    }

    public MDEntriesGroupEncoder corporateAction(final DirectBuffer value)
    {
        return corporateAction(value, 0, value.capacity());
    }

    public MDEntriesGroupEncoder corporateAction(final byte[] value, final int offset, final int length)
    {
        corporateAction.wrap(value);
        corporateActionOffset = offset;
        corporateActionLength = length;
        return this;
    }

    public MDEntriesGroupEncoder corporateActionAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(corporateAction, value, offset, length);
        corporateActionOffset = offset;
        corporateActionLength = length;
        return this;
    }

    public MDEntriesGroupEncoder corporateAction(final byte[] value, final int length)
    {
        return corporateAction(value, 0, length);
    }

    public MDEntriesGroupEncoder corporateAction(final byte[] value)
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

    public MDEntriesGroupEncoder corporateAction(final CharSequence value)
    {
        toBytes(value, corporateAction);
        corporateActionOffset = 0;
        corporateActionLength = value.length();
        return this;
    }

    public MDEntriesGroupEncoder corporateAction(final AsciiSequenceView value)
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

    public MDEntriesGroupEncoder corporateAction(final char[] value)
    {
        return corporateAction(value, 0, value.length);
    }

    public MDEntriesGroupEncoder corporateAction(final char[] value, final int length)
    {
        return corporateAction(value, 0, length);
    }

    public MDEntriesGroupEncoder corporateAction(final char[] value, final int offset, final int length)
    {
        toBytes(value, corporateAction, offset, length);
        corporateActionOffset = 0;
        corporateActionLength = length;
        return this;
    }

    private final DecimalFloat mDEntryPx = new DecimalFloat();

    private boolean hasMDEntryPx;

    public boolean hasMDEntryPx()
    {
        return hasMDEntryPx;
    }

    public MDEntriesGroupEncoder mDEntryPx(DecimalFloat value)
    {
        mDEntryPx.set(value);
        hasMDEntryPx = true;
        return this;
    }

    public MDEntriesGroupEncoder mDEntryPx(long value, int scale)
    {
        mDEntryPx.set(value, scale);
        hasMDEntryPx = true;
        return this;
    }

    public DecimalFloat mDEntryPx()
    {
        return mDEntryPx;
    }

    private final MutableDirectBuffer currency = new UnsafeBuffer();

    private int currencyOffset = 0;

    private int currencyLength = 0;

    public MDEntriesGroupEncoder currency(final DirectBuffer value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public MDEntriesGroupEncoder currency(final DirectBuffer value, final int length)
    {
        return currency(value, 0, length);
    }

    public MDEntriesGroupEncoder currency(final DirectBuffer value)
    {
        return currency(value, 0, value.capacity());
    }

    public MDEntriesGroupEncoder currency(final byte[] value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public MDEntriesGroupEncoder currencyAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(currency, value, offset, length);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public MDEntriesGroupEncoder currency(final byte[] value, final int length)
    {
        return currency(value, 0, length);
    }

    public MDEntriesGroupEncoder currency(final byte[] value)
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

    public MDEntriesGroupEncoder currency(final CharSequence value)
    {
        toBytes(value, currency);
        currencyOffset = 0;
        currencyLength = value.length();
        return this;
    }

    public MDEntriesGroupEncoder currency(final AsciiSequenceView value)
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

    public MDEntriesGroupEncoder currency(final char[] value)
    {
        return currency(value, 0, value.length);
    }

    public MDEntriesGroupEncoder currency(final char[] value, final int length)
    {
        return currency(value, 0, length);
    }

    public MDEntriesGroupEncoder currency(final char[] value, final int offset, final int length)
    {
        toBytes(value, currency, offset, length);
        currencyOffset = 0;
        currencyLength = length;
        return this;
    }

    private final DecimalFloat mDEntrySize = new DecimalFloat();

    private boolean hasMDEntrySize;

    public boolean hasMDEntrySize()
    {
        return hasMDEntrySize;
    }

    public MDEntriesGroupEncoder mDEntrySize(DecimalFloat value)
    {
        mDEntrySize.set(value);
        hasMDEntrySize = true;
        return this;
    }

    public MDEntriesGroupEncoder mDEntrySize(long value, int scale)
    {
        mDEntrySize.set(value, scale);
        hasMDEntrySize = true;
        return this;
    }

    public DecimalFloat mDEntrySize()
    {
        return mDEntrySize;
    }

    private final MutableDirectBuffer mDEntryDate = new UnsafeBuffer();

    private int mDEntryDateOffset = 0;

    private int mDEntryDateLength = 0;

    public MDEntriesGroupEncoder mDEntryDate(final DirectBuffer value, final int offset, final int length)
    {
        mDEntryDate.wrap(value);
        mDEntryDateOffset = offset;
        mDEntryDateLength = length;
        return this;
    }

    public MDEntriesGroupEncoder mDEntryDate(final DirectBuffer value, final int length)
    {
        return mDEntryDate(value, 0, length);
    }

    public MDEntriesGroupEncoder mDEntryDate(final DirectBuffer value)
    {
        return mDEntryDate(value, 0, value.capacity());
    }

    public MDEntriesGroupEncoder mDEntryDate(final byte[] value, final int offset, final int length)
    {
        mDEntryDate.wrap(value);
        mDEntryDateOffset = offset;
        mDEntryDateLength = length;
        return this;
    }

    public MDEntriesGroupEncoder mDEntryDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(mDEntryDate, value, offset, length);
        mDEntryDateOffset = offset;
        mDEntryDateLength = length;
        return this;
    }

    public MDEntriesGroupEncoder mDEntryDate(final byte[] value, final int length)
    {
        return mDEntryDate(value, 0, length);
    }

    public MDEntriesGroupEncoder mDEntryDate(final byte[] value)
    {
        return mDEntryDate(value, 0, value.length);
    }

    public boolean hasMDEntryDate()
    {
        return mDEntryDateLength > 0;
    }

    public MutableDirectBuffer mDEntryDate()
    {
        return mDEntryDate;
    }

    public String mDEntryDateAsString()
    {
        return mDEntryDate.getStringWithoutLengthAscii(mDEntryDateOffset, mDEntryDateLength);
    }

    private final MutableDirectBuffer mDEntryTime = new UnsafeBuffer();

    private int mDEntryTimeOffset = 0;

    private int mDEntryTimeLength = 0;

    public MDEntriesGroupEncoder mDEntryTime(final DirectBuffer value, final int offset, final int length)
    {
        mDEntryTime.wrap(value);
        mDEntryTimeOffset = offset;
        mDEntryTimeLength = length;
        return this;
    }

    public MDEntriesGroupEncoder mDEntryTime(final DirectBuffer value, final int length)
    {
        return mDEntryTime(value, 0, length);
    }

    public MDEntriesGroupEncoder mDEntryTime(final DirectBuffer value)
    {
        return mDEntryTime(value, 0, value.capacity());
    }

    public MDEntriesGroupEncoder mDEntryTime(final byte[] value, final int offset, final int length)
    {
        mDEntryTime.wrap(value);
        mDEntryTimeOffset = offset;
        mDEntryTimeLength = length;
        return this;
    }

    public MDEntriesGroupEncoder mDEntryTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(mDEntryTime, value, offset, length);
        mDEntryTimeOffset = offset;
        mDEntryTimeLength = length;
        return this;
    }

    public MDEntriesGroupEncoder mDEntryTime(final byte[] value, final int length)
    {
        return mDEntryTime(value, 0, length);
    }

    public MDEntriesGroupEncoder mDEntryTime(final byte[] value)
    {
        return mDEntryTime(value, 0, value.length);
    }

    public boolean hasMDEntryTime()
    {
        return mDEntryTimeLength > 0;
    }

    public MutableDirectBuffer mDEntryTime()
    {
        return mDEntryTime;
    }

    public String mDEntryTimeAsString()
    {
        return mDEntryTime.getStringWithoutLengthAscii(mDEntryTimeOffset, mDEntryTimeLength);
    }

    private char tickDirection;

    private boolean hasTickDirection;

    public boolean hasTickDirection()
    {
        return hasTickDirection;
    }

    public MDEntriesGroupEncoder tickDirection(char value)
    {
        tickDirection = value;
        hasTickDirection = true;
        return this;
    }

    public char tickDirection()
    {
        return tickDirection;
    }

    public MDEntriesGroupEncoder tickDirection(TickDirection value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == TickDirection.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: tickDirection Value: " + value );
            }
            if (value == TickDirection.NULL_VAL)
            {
                return this;
            }
        }
        return tickDirection(value.representation());
    }

    private final MutableDirectBuffer mDMkt = new UnsafeBuffer();

    private int mDMktOffset = 0;

    private int mDMktLength = 0;

    public MDEntriesGroupEncoder mDMkt(final DirectBuffer value, final int offset, final int length)
    {
        mDMkt.wrap(value);
        mDMktOffset = offset;
        mDMktLength = length;
        return this;
    }

    public MDEntriesGroupEncoder mDMkt(final DirectBuffer value, final int length)
    {
        return mDMkt(value, 0, length);
    }

    public MDEntriesGroupEncoder mDMkt(final DirectBuffer value)
    {
        return mDMkt(value, 0, value.capacity());
    }

    public MDEntriesGroupEncoder mDMkt(final byte[] value, final int offset, final int length)
    {
        mDMkt.wrap(value);
        mDMktOffset = offset;
        mDMktLength = length;
        return this;
    }

    public MDEntriesGroupEncoder mDMktAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(mDMkt, value, offset, length);
        mDMktOffset = offset;
        mDMktLength = length;
        return this;
    }

    public MDEntriesGroupEncoder mDMkt(final byte[] value, final int length)
    {
        return mDMkt(value, 0, length);
    }

    public MDEntriesGroupEncoder mDMkt(final byte[] value)
    {
        return mDMkt(value, 0, value.length);
    }

    public boolean hasMDMkt()
    {
        return mDMktLength > 0;
    }

    public MutableDirectBuffer mDMkt()
    {
        return mDMkt;
    }

    public String mDMktAsString()
    {
        return mDMkt.getStringWithoutLengthAscii(mDMktOffset, mDMktLength);
    }

    public MDEntriesGroupEncoder mDMkt(final CharSequence value)
    {
        toBytes(value, mDMkt);
        mDMktOffset = 0;
        mDMktLength = value.length();
        return this;
    }

    public MDEntriesGroupEncoder mDMkt(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            mDMkt.wrap(buffer);
            mDMktOffset = value.offset();
            mDMktLength = value.length();
        }
        return this;
    }

    public MDEntriesGroupEncoder mDMkt(final char[] value)
    {
        return mDMkt(value, 0, value.length);
    }

    public MDEntriesGroupEncoder mDMkt(final char[] value, final int length)
    {
        return mDMkt(value, 0, length);
    }

    public MDEntriesGroupEncoder mDMkt(final char[] value, final int offset, final int length)
    {
        toBytes(value, mDMkt, offset, length);
        mDMktOffset = 0;
        mDMktLength = length;
        return this;
    }

    private final MutableDirectBuffer tradingSessionID = new UnsafeBuffer();

    private int tradingSessionIDOffset = 0;

    private int tradingSessionIDLength = 0;

    public MDEntriesGroupEncoder tradingSessionID(final DirectBuffer value, final int offset, final int length)
    {
        tradingSessionID.wrap(value);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public MDEntriesGroupEncoder tradingSessionID(final DirectBuffer value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public MDEntriesGroupEncoder tradingSessionID(final DirectBuffer value)
    {
        return tradingSessionID(value, 0, value.capacity());
    }

    public MDEntriesGroupEncoder tradingSessionID(final byte[] value, final int offset, final int length)
    {
        tradingSessionID.wrap(value);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public MDEntriesGroupEncoder tradingSessionIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradingSessionID, value, offset, length);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public MDEntriesGroupEncoder tradingSessionID(final byte[] value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public MDEntriesGroupEncoder tradingSessionID(final byte[] value)
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

    public MDEntriesGroupEncoder tradingSessionID(final CharSequence value)
    {
        toBytes(value, tradingSessionID);
        tradingSessionIDOffset = 0;
        tradingSessionIDLength = value.length();
        return this;
    }

    public MDEntriesGroupEncoder tradingSessionID(final AsciiSequenceView value)
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

    public MDEntriesGroupEncoder tradingSessionID(final char[] value)
    {
        return tradingSessionID(value, 0, value.length);
    }

    public MDEntriesGroupEncoder tradingSessionID(final char[] value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public MDEntriesGroupEncoder tradingSessionID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradingSessionID, offset, length);
        tradingSessionIDOffset = 0;
        tradingSessionIDLength = length;
        return this;
    }

    private final MutableDirectBuffer tradingSessionSubID = new UnsafeBuffer();

    private int tradingSessionSubIDOffset = 0;

    private int tradingSessionSubIDLength = 0;

    public MDEntriesGroupEncoder tradingSessionSubID(final DirectBuffer value, final int offset, final int length)
    {
        tradingSessionSubID.wrap(value);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public MDEntriesGroupEncoder tradingSessionSubID(final DirectBuffer value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public MDEntriesGroupEncoder tradingSessionSubID(final DirectBuffer value)
    {
        return tradingSessionSubID(value, 0, value.capacity());
    }

    public MDEntriesGroupEncoder tradingSessionSubID(final byte[] value, final int offset, final int length)
    {
        tradingSessionSubID.wrap(value);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public MDEntriesGroupEncoder tradingSessionSubIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradingSessionSubID, value, offset, length);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public MDEntriesGroupEncoder tradingSessionSubID(final byte[] value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public MDEntriesGroupEncoder tradingSessionSubID(final byte[] value)
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

    public MDEntriesGroupEncoder tradingSessionSubID(final CharSequence value)
    {
        toBytes(value, tradingSessionSubID);
        tradingSessionSubIDOffset = 0;
        tradingSessionSubIDLength = value.length();
        return this;
    }

    public MDEntriesGroupEncoder tradingSessionSubID(final AsciiSequenceView value)
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

    public MDEntriesGroupEncoder tradingSessionSubID(final char[] value)
    {
        return tradingSessionSubID(value, 0, value.length);
    }

    public MDEntriesGroupEncoder tradingSessionSubID(final char[] value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public MDEntriesGroupEncoder tradingSessionSubID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradingSessionSubID, offset, length);
        tradingSessionSubIDOffset = 0;
        tradingSessionSubIDLength = length;
        return this;
    }

    private final MutableDirectBuffer quoteCondition = new UnsafeBuffer();

    private int quoteConditionOffset = 0;

    private int quoteConditionLength = 0;

    public MDEntriesGroupEncoder quoteCondition(final DirectBuffer value, final int offset, final int length)
    {
        quoteCondition.wrap(value);
        quoteConditionOffset = offset;
        quoteConditionLength = length;
        return this;
    }

    public MDEntriesGroupEncoder quoteCondition(final DirectBuffer value, final int length)
    {
        return quoteCondition(value, 0, length);
    }

    public MDEntriesGroupEncoder quoteCondition(final DirectBuffer value)
    {
        return quoteCondition(value, 0, value.capacity());
    }

    public MDEntriesGroupEncoder quoteCondition(final byte[] value, final int offset, final int length)
    {
        quoteCondition.wrap(value);
        quoteConditionOffset = offset;
        quoteConditionLength = length;
        return this;
    }

    public MDEntriesGroupEncoder quoteConditionAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(quoteCondition, value, offset, length);
        quoteConditionOffset = offset;
        quoteConditionLength = length;
        return this;
    }

    public MDEntriesGroupEncoder quoteCondition(final byte[] value, final int length)
    {
        return quoteCondition(value, 0, length);
    }

    public MDEntriesGroupEncoder quoteCondition(final byte[] value)
    {
        return quoteCondition(value, 0, value.length);
    }

    public boolean hasQuoteCondition()
    {
        return quoteConditionLength > 0;
    }

    public MutableDirectBuffer quoteCondition()
    {
        return quoteCondition;
    }

    public String quoteConditionAsString()
    {
        return quoteCondition.getStringWithoutLengthAscii(quoteConditionOffset, quoteConditionLength);
    }

    public MDEntriesGroupEncoder quoteCondition(final CharSequence value)
    {
        toBytes(value, quoteCondition);
        quoteConditionOffset = 0;
        quoteConditionLength = value.length();
        return this;
    }

    public MDEntriesGroupEncoder quoteCondition(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            quoteCondition.wrap(buffer);
            quoteConditionOffset = value.offset();
            quoteConditionLength = value.length();
        }
        return this;
    }

    public MDEntriesGroupEncoder quoteCondition(final char[] value)
    {
        return quoteCondition(value, 0, value.length);
    }

    public MDEntriesGroupEncoder quoteCondition(final char[] value, final int length)
    {
        return quoteCondition(value, 0, length);
    }

    public MDEntriesGroupEncoder quoteCondition(final char[] value, final int offset, final int length)
    {
        toBytes(value, quoteCondition, offset, length);
        quoteConditionOffset = 0;
        quoteConditionLength = length;
        return this;
    }

    private final MutableDirectBuffer tradeCondition = new UnsafeBuffer();

    private int tradeConditionOffset = 0;

    private int tradeConditionLength = 0;

    public MDEntriesGroupEncoder tradeCondition(final DirectBuffer value, final int offset, final int length)
    {
        tradeCondition.wrap(value);
        tradeConditionOffset = offset;
        tradeConditionLength = length;
        return this;
    }

    public MDEntriesGroupEncoder tradeCondition(final DirectBuffer value, final int length)
    {
        return tradeCondition(value, 0, length);
    }

    public MDEntriesGroupEncoder tradeCondition(final DirectBuffer value)
    {
        return tradeCondition(value, 0, value.capacity());
    }

    public MDEntriesGroupEncoder tradeCondition(final byte[] value, final int offset, final int length)
    {
        tradeCondition.wrap(value);
        tradeConditionOffset = offset;
        tradeConditionLength = length;
        return this;
    }

    public MDEntriesGroupEncoder tradeConditionAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradeCondition, value, offset, length);
        tradeConditionOffset = offset;
        tradeConditionLength = length;
        return this;
    }

    public MDEntriesGroupEncoder tradeCondition(final byte[] value, final int length)
    {
        return tradeCondition(value, 0, length);
    }

    public MDEntriesGroupEncoder tradeCondition(final byte[] value)
    {
        return tradeCondition(value, 0, value.length);
    }

    public boolean hasTradeCondition()
    {
        return tradeConditionLength > 0;
    }

    public MutableDirectBuffer tradeCondition()
    {
        return tradeCondition;
    }

    public String tradeConditionAsString()
    {
        return tradeCondition.getStringWithoutLengthAscii(tradeConditionOffset, tradeConditionLength);
    }

    public MDEntriesGroupEncoder tradeCondition(final CharSequence value)
    {
        toBytes(value, tradeCondition);
        tradeConditionOffset = 0;
        tradeConditionLength = value.length();
        return this;
    }

    public MDEntriesGroupEncoder tradeCondition(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            tradeCondition.wrap(buffer);
            tradeConditionOffset = value.offset();
            tradeConditionLength = value.length();
        }
        return this;
    }

    public MDEntriesGroupEncoder tradeCondition(final char[] value)
    {
        return tradeCondition(value, 0, value.length);
    }

    public MDEntriesGroupEncoder tradeCondition(final char[] value, final int length)
    {
        return tradeCondition(value, 0, length);
    }

    public MDEntriesGroupEncoder tradeCondition(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradeCondition, offset, length);
        tradeConditionOffset = 0;
        tradeConditionLength = length;
        return this;
    }

    private final MutableDirectBuffer mDEntryOriginator = new UnsafeBuffer();

    private int mDEntryOriginatorOffset = 0;

    private int mDEntryOriginatorLength = 0;

    public MDEntriesGroupEncoder mDEntryOriginator(final DirectBuffer value, final int offset, final int length)
    {
        mDEntryOriginator.wrap(value);
        mDEntryOriginatorOffset = offset;
        mDEntryOriginatorLength = length;
        return this;
    }

    public MDEntriesGroupEncoder mDEntryOriginator(final DirectBuffer value, final int length)
    {
        return mDEntryOriginator(value, 0, length);
    }

    public MDEntriesGroupEncoder mDEntryOriginator(final DirectBuffer value)
    {
        return mDEntryOriginator(value, 0, value.capacity());
    }

    public MDEntriesGroupEncoder mDEntryOriginator(final byte[] value, final int offset, final int length)
    {
        mDEntryOriginator.wrap(value);
        mDEntryOriginatorOffset = offset;
        mDEntryOriginatorLength = length;
        return this;
    }

    public MDEntriesGroupEncoder mDEntryOriginatorAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(mDEntryOriginator, value, offset, length);
        mDEntryOriginatorOffset = offset;
        mDEntryOriginatorLength = length;
        return this;
    }

    public MDEntriesGroupEncoder mDEntryOriginator(final byte[] value, final int length)
    {
        return mDEntryOriginator(value, 0, length);
    }

    public MDEntriesGroupEncoder mDEntryOriginator(final byte[] value)
    {
        return mDEntryOriginator(value, 0, value.length);
    }

    public boolean hasMDEntryOriginator()
    {
        return mDEntryOriginatorLength > 0;
    }

    public MutableDirectBuffer mDEntryOriginator()
    {
        return mDEntryOriginator;
    }

    public String mDEntryOriginatorAsString()
    {
        return mDEntryOriginator.getStringWithoutLengthAscii(mDEntryOriginatorOffset, mDEntryOriginatorLength);
    }

    public MDEntriesGroupEncoder mDEntryOriginator(final CharSequence value)
    {
        toBytes(value, mDEntryOriginator);
        mDEntryOriginatorOffset = 0;
        mDEntryOriginatorLength = value.length();
        return this;
    }

    public MDEntriesGroupEncoder mDEntryOriginator(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            mDEntryOriginator.wrap(buffer);
            mDEntryOriginatorOffset = value.offset();
            mDEntryOriginatorLength = value.length();
        }
        return this;
    }

    public MDEntriesGroupEncoder mDEntryOriginator(final char[] value)
    {
        return mDEntryOriginator(value, 0, value.length);
    }

    public MDEntriesGroupEncoder mDEntryOriginator(final char[] value, final int length)
    {
        return mDEntryOriginator(value, 0, length);
    }

    public MDEntriesGroupEncoder mDEntryOriginator(final char[] value, final int offset, final int length)
    {
        toBytes(value, mDEntryOriginator, offset, length);
        mDEntryOriginatorOffset = 0;
        mDEntryOriginatorLength = length;
        return this;
    }

    private final MutableDirectBuffer locationID = new UnsafeBuffer();

    private int locationIDOffset = 0;

    private int locationIDLength = 0;

    public MDEntriesGroupEncoder locationID(final DirectBuffer value, final int offset, final int length)
    {
        locationID.wrap(value);
        locationIDOffset = offset;
        locationIDLength = length;
        return this;
    }

    public MDEntriesGroupEncoder locationID(final DirectBuffer value, final int length)
    {
        return locationID(value, 0, length);
    }

    public MDEntriesGroupEncoder locationID(final DirectBuffer value)
    {
        return locationID(value, 0, value.capacity());
    }

    public MDEntriesGroupEncoder locationID(final byte[] value, final int offset, final int length)
    {
        locationID.wrap(value);
        locationIDOffset = offset;
        locationIDLength = length;
        return this;
    }

    public MDEntriesGroupEncoder locationIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(locationID, value, offset, length);
        locationIDOffset = offset;
        locationIDLength = length;
        return this;
    }

    public MDEntriesGroupEncoder locationID(final byte[] value, final int length)
    {
        return locationID(value, 0, length);
    }

    public MDEntriesGroupEncoder locationID(final byte[] value)
    {
        return locationID(value, 0, value.length);
    }

    public boolean hasLocationID()
    {
        return locationIDLength > 0;
    }

    public MutableDirectBuffer locationID()
    {
        return locationID;
    }

    public String locationIDAsString()
    {
        return locationID.getStringWithoutLengthAscii(locationIDOffset, locationIDLength);
    }

    public MDEntriesGroupEncoder locationID(final CharSequence value)
    {
        toBytes(value, locationID);
        locationIDOffset = 0;
        locationIDLength = value.length();
        return this;
    }

    public MDEntriesGroupEncoder locationID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            locationID.wrap(buffer);
            locationIDOffset = value.offset();
            locationIDLength = value.length();
        }
        return this;
    }

    public MDEntriesGroupEncoder locationID(final char[] value)
    {
        return locationID(value, 0, value.length);
    }

    public MDEntriesGroupEncoder locationID(final char[] value, final int length)
    {
        return locationID(value, 0, length);
    }

    public MDEntriesGroupEncoder locationID(final char[] value, final int offset, final int length)
    {
        toBytes(value, locationID, offset, length);
        locationIDOffset = 0;
        locationIDLength = length;
        return this;
    }

    private final MutableDirectBuffer deskID = new UnsafeBuffer();

    private int deskIDOffset = 0;

    private int deskIDLength = 0;

    public MDEntriesGroupEncoder deskID(final DirectBuffer value, final int offset, final int length)
    {
        deskID.wrap(value);
        deskIDOffset = offset;
        deskIDLength = length;
        return this;
    }

    public MDEntriesGroupEncoder deskID(final DirectBuffer value, final int length)
    {
        return deskID(value, 0, length);
    }

    public MDEntriesGroupEncoder deskID(final DirectBuffer value)
    {
        return deskID(value, 0, value.capacity());
    }

    public MDEntriesGroupEncoder deskID(final byte[] value, final int offset, final int length)
    {
        deskID.wrap(value);
        deskIDOffset = offset;
        deskIDLength = length;
        return this;
    }

    public MDEntriesGroupEncoder deskIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(deskID, value, offset, length);
        deskIDOffset = offset;
        deskIDLength = length;
        return this;
    }

    public MDEntriesGroupEncoder deskID(final byte[] value, final int length)
    {
        return deskID(value, 0, length);
    }

    public MDEntriesGroupEncoder deskID(final byte[] value)
    {
        return deskID(value, 0, value.length);
    }

    public boolean hasDeskID()
    {
        return deskIDLength > 0;
    }

    public MutableDirectBuffer deskID()
    {
        return deskID;
    }

    public String deskIDAsString()
    {
        return deskID.getStringWithoutLengthAscii(deskIDOffset, deskIDLength);
    }

    public MDEntriesGroupEncoder deskID(final CharSequence value)
    {
        toBytes(value, deskID);
        deskIDOffset = 0;
        deskIDLength = value.length();
        return this;
    }

    public MDEntriesGroupEncoder deskID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            deskID.wrap(buffer);
            deskIDOffset = value.offset();
            deskIDLength = value.length();
        }
        return this;
    }

    public MDEntriesGroupEncoder deskID(final char[] value)
    {
        return deskID(value, 0, value.length);
    }

    public MDEntriesGroupEncoder deskID(final char[] value, final int length)
    {
        return deskID(value, 0, length);
    }

    public MDEntriesGroupEncoder deskID(final char[] value, final int offset, final int length)
    {
        toBytes(value, deskID, offset, length);
        deskIDOffset = 0;
        deskIDLength = length;
        return this;
    }

    private final MutableDirectBuffer openCloseSettlFlag = new UnsafeBuffer();

    private int openCloseSettlFlagOffset = 0;

    private int openCloseSettlFlagLength = 0;

    public MDEntriesGroupEncoder openCloseSettlFlag(final DirectBuffer value, final int offset, final int length)
    {
        openCloseSettlFlag.wrap(value);
        openCloseSettlFlagOffset = offset;
        openCloseSettlFlagLength = length;
        return this;
    }

    public MDEntriesGroupEncoder openCloseSettlFlag(final DirectBuffer value, final int length)
    {
        return openCloseSettlFlag(value, 0, length);
    }

    public MDEntriesGroupEncoder openCloseSettlFlag(final DirectBuffer value)
    {
        return openCloseSettlFlag(value, 0, value.capacity());
    }

    public MDEntriesGroupEncoder openCloseSettlFlag(final byte[] value, final int offset, final int length)
    {
        openCloseSettlFlag.wrap(value);
        openCloseSettlFlagOffset = offset;
        openCloseSettlFlagLength = length;
        return this;
    }

    public MDEntriesGroupEncoder openCloseSettlFlagAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(openCloseSettlFlag, value, offset, length);
        openCloseSettlFlagOffset = offset;
        openCloseSettlFlagLength = length;
        return this;
    }

    public MDEntriesGroupEncoder openCloseSettlFlag(final byte[] value, final int length)
    {
        return openCloseSettlFlag(value, 0, length);
    }

    public MDEntriesGroupEncoder openCloseSettlFlag(final byte[] value)
    {
        return openCloseSettlFlag(value, 0, value.length);
    }

    public boolean hasOpenCloseSettlFlag()
    {
        return openCloseSettlFlagLength > 0;
    }

    public MutableDirectBuffer openCloseSettlFlag()
    {
        return openCloseSettlFlag;
    }

    public String openCloseSettlFlagAsString()
    {
        return openCloseSettlFlag.getStringWithoutLengthAscii(openCloseSettlFlagOffset, openCloseSettlFlagLength);
    }

    public MDEntriesGroupEncoder openCloseSettlFlag(final CharSequence value)
    {
        toBytes(value, openCloseSettlFlag);
        openCloseSettlFlagOffset = 0;
        openCloseSettlFlagLength = value.length();
        return this;
    }

    public MDEntriesGroupEncoder openCloseSettlFlag(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            openCloseSettlFlag.wrap(buffer);
            openCloseSettlFlagOffset = value.offset();
            openCloseSettlFlagLength = value.length();
        }
        return this;
    }

    public MDEntriesGroupEncoder openCloseSettlFlag(final char[] value)
    {
        return openCloseSettlFlag(value, 0, value.length);
    }

    public MDEntriesGroupEncoder openCloseSettlFlag(final char[] value, final int length)
    {
        return openCloseSettlFlag(value, 0, length);
    }

    public MDEntriesGroupEncoder openCloseSettlFlag(final char[] value, final int offset, final int length)
    {
        toBytes(value, openCloseSettlFlag, offset, length);
        openCloseSettlFlagOffset = 0;
        openCloseSettlFlagLength = length;
        return this;
    }

    private char timeInForce;

    private boolean hasTimeInForce;

    public boolean hasTimeInForce()
    {
        return hasTimeInForce;
    }

    public MDEntriesGroupEncoder timeInForce(char value)
    {
        timeInForce = value;
        hasTimeInForce = true;
        return this;
    }

    public char timeInForce()
    {
        return timeInForce;
    }

    public MDEntriesGroupEncoder timeInForce(TimeInForce value)
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

    private final MutableDirectBuffer expireDate = new UnsafeBuffer();

    private int expireDateOffset = 0;

    private int expireDateLength = 0;

    public MDEntriesGroupEncoder expireDate(final DirectBuffer value, final int offset, final int length)
    {
        expireDate.wrap(value);
        expireDateOffset = offset;
        expireDateLength = length;
        return this;
    }

    public MDEntriesGroupEncoder expireDate(final DirectBuffer value, final int length)
    {
        return expireDate(value, 0, length);
    }

    public MDEntriesGroupEncoder expireDate(final DirectBuffer value)
    {
        return expireDate(value, 0, value.capacity());
    }

    public MDEntriesGroupEncoder expireDate(final byte[] value, final int offset, final int length)
    {
        expireDate.wrap(value);
        expireDateOffset = offset;
        expireDateLength = length;
        return this;
    }

    public MDEntriesGroupEncoder expireDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(expireDate, value, offset, length);
        expireDateOffset = offset;
        expireDateLength = length;
        return this;
    }

    public MDEntriesGroupEncoder expireDate(final byte[] value, final int length)
    {
        return expireDate(value, 0, length);
    }

    public MDEntriesGroupEncoder expireDate(final byte[] value)
    {
        return expireDate(value, 0, value.length);
    }

    public boolean hasExpireDate()
    {
        return expireDateLength > 0;
    }

    public MutableDirectBuffer expireDate()
    {
        return expireDate;
    }

    public String expireDateAsString()
    {
        return expireDate.getStringWithoutLengthAscii(expireDateOffset, expireDateLength);
    }

    private final MutableDirectBuffer expireTime = new UnsafeBuffer();

    private int expireTimeOffset = 0;

    private int expireTimeLength = 0;

    public MDEntriesGroupEncoder expireTime(final DirectBuffer value, final int offset, final int length)
    {
        expireTime.wrap(value);
        expireTimeOffset = offset;
        expireTimeLength = length;
        return this;
    }

    public MDEntriesGroupEncoder expireTime(final DirectBuffer value, final int length)
    {
        return expireTime(value, 0, length);
    }

    public MDEntriesGroupEncoder expireTime(final DirectBuffer value)
    {
        return expireTime(value, 0, value.capacity());
    }

    public MDEntriesGroupEncoder expireTime(final byte[] value, final int offset, final int length)
    {
        expireTime.wrap(value);
        expireTimeOffset = offset;
        expireTimeLength = length;
        return this;
    }

    public MDEntriesGroupEncoder expireTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(expireTime, value, offset, length);
        expireTimeOffset = offset;
        expireTimeLength = length;
        return this;
    }

    public MDEntriesGroupEncoder expireTime(final byte[] value, final int length)
    {
        return expireTime(value, 0, length);
    }

    public MDEntriesGroupEncoder expireTime(final byte[] value)
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

    private final DecimalFloat minQty = new DecimalFloat();

    private boolean hasMinQty;

    public boolean hasMinQty()
    {
        return hasMinQty;
    }

    public MDEntriesGroupEncoder minQty(DecimalFloat value)
    {
        minQty.set(value);
        hasMinQty = true;
        return this;
    }

    public MDEntriesGroupEncoder minQty(long value, int scale)
    {
        minQty.set(value, scale);
        hasMinQty = true;
        return this;
    }

    public DecimalFloat minQty()
    {
        return minQty;
    }

    private final MutableDirectBuffer execInst = new UnsafeBuffer();

    private int execInstOffset = 0;

    private int execInstLength = 0;

    public MDEntriesGroupEncoder execInst(final DirectBuffer value, final int offset, final int length)
    {
        execInst.wrap(value);
        execInstOffset = offset;
        execInstLength = length;
        return this;
    }

    public MDEntriesGroupEncoder execInst(final DirectBuffer value, final int length)
    {
        return execInst(value, 0, length);
    }

    public MDEntriesGroupEncoder execInst(final DirectBuffer value)
    {
        return execInst(value, 0, value.capacity());
    }

    public MDEntriesGroupEncoder execInst(final byte[] value, final int offset, final int length)
    {
        execInst.wrap(value);
        execInstOffset = offset;
        execInstLength = length;
        return this;
    }

    public MDEntriesGroupEncoder execInstAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(execInst, value, offset, length);
        execInstOffset = offset;
        execInstLength = length;
        return this;
    }

    public MDEntriesGroupEncoder execInst(final byte[] value, final int length)
    {
        return execInst(value, 0, length);
    }

    public MDEntriesGroupEncoder execInst(final byte[] value)
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

    public MDEntriesGroupEncoder execInst(final CharSequence value)
    {
        toBytes(value, execInst);
        execInstOffset = 0;
        execInstLength = value.length();
        return this;
    }

    public MDEntriesGroupEncoder execInst(final AsciiSequenceView value)
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

    public MDEntriesGroupEncoder execInst(final char[] value)
    {
        return execInst(value, 0, value.length);
    }

    public MDEntriesGroupEncoder execInst(final char[] value, final int length)
    {
        return execInst(value, 0, length);
    }

    public MDEntriesGroupEncoder execInst(final char[] value, final int offset, final int length)
    {
        toBytes(value, execInst, offset, length);
        execInstOffset = 0;
        execInstLength = length;
        return this;
    }

    private int sellerDays;

    private boolean hasSellerDays;

    public boolean hasSellerDays()
    {
        return hasSellerDays;
    }

    public MDEntriesGroupEncoder sellerDays(int value)
    {
        sellerDays = value;
        hasSellerDays = true;
        return this;
    }

    public int sellerDays()
    {
        return sellerDays;
    }

    private final MutableDirectBuffer orderID = new UnsafeBuffer();

    private int orderIDOffset = 0;

    private int orderIDLength = 0;

    public MDEntriesGroupEncoder orderID(final DirectBuffer value, final int offset, final int length)
    {
        orderID.wrap(value);
        orderIDOffset = offset;
        orderIDLength = length;
        return this;
    }

    public MDEntriesGroupEncoder orderID(final DirectBuffer value, final int length)
    {
        return orderID(value, 0, length);
    }

    public MDEntriesGroupEncoder orderID(final DirectBuffer value)
    {
        return orderID(value, 0, value.capacity());
    }

    public MDEntriesGroupEncoder orderID(final byte[] value, final int offset, final int length)
    {
        orderID.wrap(value);
        orderIDOffset = offset;
        orderIDLength = length;
        return this;
    }

    public MDEntriesGroupEncoder orderIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(orderID, value, offset, length);
        orderIDOffset = offset;
        orderIDLength = length;
        return this;
    }

    public MDEntriesGroupEncoder orderID(final byte[] value, final int length)
    {
        return orderID(value, 0, length);
    }

    public MDEntriesGroupEncoder orderID(final byte[] value)
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

    public MDEntriesGroupEncoder orderID(final CharSequence value)
    {
        toBytes(value, orderID);
        orderIDOffset = 0;
        orderIDLength = value.length();
        return this;
    }

    public MDEntriesGroupEncoder orderID(final AsciiSequenceView value)
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

    public MDEntriesGroupEncoder orderID(final char[] value)
    {
        return orderID(value, 0, value.length);
    }

    public MDEntriesGroupEncoder orderID(final char[] value, final int length)
    {
        return orderID(value, 0, length);
    }

    public MDEntriesGroupEncoder orderID(final char[] value, final int offset, final int length)
    {
        toBytes(value, orderID, offset, length);
        orderIDOffset = 0;
        orderIDLength = length;
        return this;
    }

    private final MutableDirectBuffer quoteEntryID = new UnsafeBuffer();

    private int quoteEntryIDOffset = 0;

    private int quoteEntryIDLength = 0;

    public MDEntriesGroupEncoder quoteEntryID(final DirectBuffer value, final int offset, final int length)
    {
        quoteEntryID.wrap(value);
        quoteEntryIDOffset = offset;
        quoteEntryIDLength = length;
        return this;
    }

    public MDEntriesGroupEncoder quoteEntryID(final DirectBuffer value, final int length)
    {
        return quoteEntryID(value, 0, length);
    }

    public MDEntriesGroupEncoder quoteEntryID(final DirectBuffer value)
    {
        return quoteEntryID(value, 0, value.capacity());
    }

    public MDEntriesGroupEncoder quoteEntryID(final byte[] value, final int offset, final int length)
    {
        quoteEntryID.wrap(value);
        quoteEntryIDOffset = offset;
        quoteEntryIDLength = length;
        return this;
    }

    public MDEntriesGroupEncoder quoteEntryIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(quoteEntryID, value, offset, length);
        quoteEntryIDOffset = offset;
        quoteEntryIDLength = length;
        return this;
    }

    public MDEntriesGroupEncoder quoteEntryID(final byte[] value, final int length)
    {
        return quoteEntryID(value, 0, length);
    }

    public MDEntriesGroupEncoder quoteEntryID(final byte[] value)
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

    public MDEntriesGroupEncoder quoteEntryID(final CharSequence value)
    {
        toBytes(value, quoteEntryID);
        quoteEntryIDOffset = 0;
        quoteEntryIDLength = value.length();
        return this;
    }

    public MDEntriesGroupEncoder quoteEntryID(final AsciiSequenceView value)
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

    public MDEntriesGroupEncoder quoteEntryID(final char[] value)
    {
        return quoteEntryID(value, 0, value.length);
    }

    public MDEntriesGroupEncoder quoteEntryID(final char[] value, final int length)
    {
        return quoteEntryID(value, 0, length);
    }

    public MDEntriesGroupEncoder quoteEntryID(final char[] value, final int offset, final int length)
    {
        toBytes(value, quoteEntryID, offset, length);
        quoteEntryIDOffset = 0;
        quoteEntryIDLength = length;
        return this;
    }

    private final MutableDirectBuffer mDEntryBuyer = new UnsafeBuffer();

    private int mDEntryBuyerOffset = 0;

    private int mDEntryBuyerLength = 0;

    public MDEntriesGroupEncoder mDEntryBuyer(final DirectBuffer value, final int offset, final int length)
    {
        mDEntryBuyer.wrap(value);
        mDEntryBuyerOffset = offset;
        mDEntryBuyerLength = length;
        return this;
    }

    public MDEntriesGroupEncoder mDEntryBuyer(final DirectBuffer value, final int length)
    {
        return mDEntryBuyer(value, 0, length);
    }

    public MDEntriesGroupEncoder mDEntryBuyer(final DirectBuffer value)
    {
        return mDEntryBuyer(value, 0, value.capacity());
    }

    public MDEntriesGroupEncoder mDEntryBuyer(final byte[] value, final int offset, final int length)
    {
        mDEntryBuyer.wrap(value);
        mDEntryBuyerOffset = offset;
        mDEntryBuyerLength = length;
        return this;
    }

    public MDEntriesGroupEncoder mDEntryBuyerAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(mDEntryBuyer, value, offset, length);
        mDEntryBuyerOffset = offset;
        mDEntryBuyerLength = length;
        return this;
    }

    public MDEntriesGroupEncoder mDEntryBuyer(final byte[] value, final int length)
    {
        return mDEntryBuyer(value, 0, length);
    }

    public MDEntriesGroupEncoder mDEntryBuyer(final byte[] value)
    {
        return mDEntryBuyer(value, 0, value.length);
    }

    public boolean hasMDEntryBuyer()
    {
        return mDEntryBuyerLength > 0;
    }

    public MutableDirectBuffer mDEntryBuyer()
    {
        return mDEntryBuyer;
    }

    public String mDEntryBuyerAsString()
    {
        return mDEntryBuyer.getStringWithoutLengthAscii(mDEntryBuyerOffset, mDEntryBuyerLength);
    }

    public MDEntriesGroupEncoder mDEntryBuyer(final CharSequence value)
    {
        toBytes(value, mDEntryBuyer);
        mDEntryBuyerOffset = 0;
        mDEntryBuyerLength = value.length();
        return this;
    }

    public MDEntriesGroupEncoder mDEntryBuyer(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            mDEntryBuyer.wrap(buffer);
            mDEntryBuyerOffset = value.offset();
            mDEntryBuyerLength = value.length();
        }
        return this;
    }

    public MDEntriesGroupEncoder mDEntryBuyer(final char[] value)
    {
        return mDEntryBuyer(value, 0, value.length);
    }

    public MDEntriesGroupEncoder mDEntryBuyer(final char[] value, final int length)
    {
        return mDEntryBuyer(value, 0, length);
    }

    public MDEntriesGroupEncoder mDEntryBuyer(final char[] value, final int offset, final int length)
    {
        toBytes(value, mDEntryBuyer, offset, length);
        mDEntryBuyerOffset = 0;
        mDEntryBuyerLength = length;
        return this;
    }

    private final MutableDirectBuffer mDEntrySeller = new UnsafeBuffer();

    private int mDEntrySellerOffset = 0;

    private int mDEntrySellerLength = 0;

    public MDEntriesGroupEncoder mDEntrySeller(final DirectBuffer value, final int offset, final int length)
    {
        mDEntrySeller.wrap(value);
        mDEntrySellerOffset = offset;
        mDEntrySellerLength = length;
        return this;
    }

    public MDEntriesGroupEncoder mDEntrySeller(final DirectBuffer value, final int length)
    {
        return mDEntrySeller(value, 0, length);
    }

    public MDEntriesGroupEncoder mDEntrySeller(final DirectBuffer value)
    {
        return mDEntrySeller(value, 0, value.capacity());
    }

    public MDEntriesGroupEncoder mDEntrySeller(final byte[] value, final int offset, final int length)
    {
        mDEntrySeller.wrap(value);
        mDEntrySellerOffset = offset;
        mDEntrySellerLength = length;
        return this;
    }

    public MDEntriesGroupEncoder mDEntrySellerAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(mDEntrySeller, value, offset, length);
        mDEntrySellerOffset = offset;
        mDEntrySellerLength = length;
        return this;
    }

    public MDEntriesGroupEncoder mDEntrySeller(final byte[] value, final int length)
    {
        return mDEntrySeller(value, 0, length);
    }

    public MDEntriesGroupEncoder mDEntrySeller(final byte[] value)
    {
        return mDEntrySeller(value, 0, value.length);
    }

    public boolean hasMDEntrySeller()
    {
        return mDEntrySellerLength > 0;
    }

    public MutableDirectBuffer mDEntrySeller()
    {
        return mDEntrySeller;
    }

    public String mDEntrySellerAsString()
    {
        return mDEntrySeller.getStringWithoutLengthAscii(mDEntrySellerOffset, mDEntrySellerLength);
    }

    public MDEntriesGroupEncoder mDEntrySeller(final CharSequence value)
    {
        toBytes(value, mDEntrySeller);
        mDEntrySellerOffset = 0;
        mDEntrySellerLength = value.length();
        return this;
    }

    public MDEntriesGroupEncoder mDEntrySeller(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            mDEntrySeller.wrap(buffer);
            mDEntrySellerOffset = value.offset();
            mDEntrySellerLength = value.length();
        }
        return this;
    }

    public MDEntriesGroupEncoder mDEntrySeller(final char[] value)
    {
        return mDEntrySeller(value, 0, value.length);
    }

    public MDEntriesGroupEncoder mDEntrySeller(final char[] value, final int length)
    {
        return mDEntrySeller(value, 0, length);
    }

    public MDEntriesGroupEncoder mDEntrySeller(final char[] value, final int offset, final int length)
    {
        toBytes(value, mDEntrySeller, offset, length);
        mDEntrySellerOffset = 0;
        mDEntrySellerLength = length;
        return this;
    }

    private int numberOfOrders;

    private boolean hasNumberOfOrders;

    public boolean hasNumberOfOrders()
    {
        return hasNumberOfOrders;
    }

    public MDEntriesGroupEncoder numberOfOrders(int value)
    {
        numberOfOrders = value;
        hasNumberOfOrders = true;
        return this;
    }

    public int numberOfOrders()
    {
        return numberOfOrders;
    }

    private int mDEntryPositionNo;

    private boolean hasMDEntryPositionNo;

    public boolean hasMDEntryPositionNo()
    {
        return hasMDEntryPositionNo;
    }

    public MDEntriesGroupEncoder mDEntryPositionNo(int value)
    {
        mDEntryPositionNo = value;
        hasMDEntryPositionNo = true;
        return this;
    }

    public int mDEntryPositionNo()
    {
        return mDEntryPositionNo;
    }

    private final MutableDirectBuffer scope = new UnsafeBuffer();

    private int scopeOffset = 0;

    private int scopeLength = 0;

    public MDEntriesGroupEncoder scope(final DirectBuffer value, final int offset, final int length)
    {
        scope.wrap(value);
        scopeOffset = offset;
        scopeLength = length;
        return this;
    }

    public MDEntriesGroupEncoder scope(final DirectBuffer value, final int length)
    {
        return scope(value, 0, length);
    }

    public MDEntriesGroupEncoder scope(final DirectBuffer value)
    {
        return scope(value, 0, value.capacity());
    }

    public MDEntriesGroupEncoder scope(final byte[] value, final int offset, final int length)
    {
        scope.wrap(value);
        scopeOffset = offset;
        scopeLength = length;
        return this;
    }

    public MDEntriesGroupEncoder scopeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(scope, value, offset, length);
        scopeOffset = offset;
        scopeLength = length;
        return this;
    }

    public MDEntriesGroupEncoder scope(final byte[] value, final int length)
    {
        return scope(value, 0, length);
    }

    public MDEntriesGroupEncoder scope(final byte[] value)
    {
        return scope(value, 0, value.length);
    }

    public boolean hasScope()
    {
        return scopeLength > 0;
    }

    public MutableDirectBuffer scope()
    {
        return scope;
    }

    public String scopeAsString()
    {
        return scope.getStringWithoutLengthAscii(scopeOffset, scopeLength);
    }

    public MDEntriesGroupEncoder scope(final CharSequence value)
    {
        toBytes(value, scope);
        scopeOffset = 0;
        scopeLength = value.length();
        return this;
    }

    public MDEntriesGroupEncoder scope(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            scope.wrap(buffer);
            scopeOffset = value.offset();
            scopeLength = value.length();
        }
        return this;
    }

    public MDEntriesGroupEncoder scope(final char[] value)
    {
        return scope(value, 0, value.length);
    }

    public MDEntriesGroupEncoder scope(final char[] value, final int length)
    {
        return scope(value, 0, length);
    }

    public MDEntriesGroupEncoder scope(final char[] value, final int offset, final int length)
    {
        toBytes(value, scope, offset, length);
        scopeOffset = 0;
        scopeLength = length;
        return this;
    }

    private final DecimalFloat priceDelta = new DecimalFloat();

    private boolean hasPriceDelta;

    public boolean hasPriceDelta()
    {
        return hasPriceDelta;
    }

    public MDEntriesGroupEncoder priceDelta(DecimalFloat value)
    {
        priceDelta.set(value);
        hasPriceDelta = true;
        return this;
    }

    public MDEntriesGroupEncoder priceDelta(long value, int scale)
    {
        priceDelta.set(value, scale);
        hasPriceDelta = true;
        return this;
    }

    public DecimalFloat priceDelta()
    {
        return priceDelta;
    }

    private final DecimalFloat netChgPrevDay = new DecimalFloat();

    private boolean hasNetChgPrevDay;

    public boolean hasNetChgPrevDay()
    {
        return hasNetChgPrevDay;
    }

    public MDEntriesGroupEncoder netChgPrevDay(DecimalFloat value)
    {
        netChgPrevDay.set(value);
        hasNetChgPrevDay = true;
        return this;
    }

    public MDEntriesGroupEncoder netChgPrevDay(long value, int scale)
    {
        netChgPrevDay.set(value, scale);
        hasNetChgPrevDay = true;
        return this;
    }

    public DecimalFloat netChgPrevDay()
    {
        return netChgPrevDay;
    }

    private final MutableDirectBuffer text = new UnsafeBuffer();

    private int textOffset = 0;

    private int textLength = 0;

    public MDEntriesGroupEncoder text(final DirectBuffer value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public MDEntriesGroupEncoder text(final DirectBuffer value, final int length)
    {
        return text(value, 0, length);
    }

    public MDEntriesGroupEncoder text(final DirectBuffer value)
    {
        return text(value, 0, value.capacity());
    }

    public MDEntriesGroupEncoder text(final byte[] value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public MDEntriesGroupEncoder textAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(text, value, offset, length);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public MDEntriesGroupEncoder text(final byte[] value, final int length)
    {
        return text(value, 0, length);
    }

    public MDEntriesGroupEncoder text(final byte[] value)
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

    public MDEntriesGroupEncoder text(final CharSequence value)
    {
        toBytes(value, text);
        textOffset = 0;
        textLength = value.length();
        return this;
    }

    public MDEntriesGroupEncoder text(final AsciiSequenceView value)
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

    public MDEntriesGroupEncoder text(final char[] value)
    {
        return text(value, 0, value.length);
    }

    public MDEntriesGroupEncoder text(final char[] value, final int length)
    {
        return text(value, 0, length);
    }

    public MDEntriesGroupEncoder text(final char[] value, final int offset, final int length)
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

    public MDEntriesGroupEncoder encodedTextLen(int value)
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

    public MDEntriesGroupEncoder encodedText(byte[] value)
    {
        encodedText = value;
        hasEncodedText = true;
        return this;
    }

    public byte[] encodedText()
    {
        return encodedText;
    }

    public MDEntriesGroupEncoder encodedTextAsCopy(final byte[] value, final int offset, final int length)
    {
        encodedText = copyInto(encodedText, value, offset, length);
        hasEncodedText = true;
        return this;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (hasMDUpdateAction)
        {
            buffer.putBytes(position, mDUpdateActionHeader, 0, mDUpdateActionHeaderLength);
            position += mDUpdateActionHeaderLength;
            position += buffer.putCharAscii(position, mDUpdateAction);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: MDUpdateAction");
        }

        if (hasDeleteReason)
        {
            buffer.putBytes(position, deleteReasonHeader, 0, deleteReasonHeaderLength);
            position += deleteReasonHeaderLength;
            position += buffer.putCharAscii(position, deleteReason);
            buffer.putSeparator(position);
            position++;
        }

        if (hasMDEntryType)
        {
            buffer.putBytes(position, mDEntryTypeHeader, 0, mDEntryTypeHeaderLength);
            position += mDEntryTypeHeaderLength;
            position += buffer.putCharAscii(position, mDEntryType);
            buffer.putSeparator(position);
            position++;
        }

        if (mDEntryIDLength > 0)
        {
            buffer.putBytes(position, mDEntryIDHeader, 0, mDEntryIDHeaderLength);
            position += mDEntryIDHeaderLength;
            buffer.putBytes(position, mDEntryID, mDEntryIDOffset, mDEntryIDLength);
            position += mDEntryIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (mDEntryRefIDLength > 0)
        {
            buffer.putBytes(position, mDEntryRefIDHeader, 0, mDEntryRefIDHeaderLength);
            position += mDEntryRefIDHeaderLength;
            buffer.putBytes(position, mDEntryRefID, mDEntryRefIDOffset, mDEntryRefIDLength);
            position += mDEntryRefIDLength;
            buffer.putSeparator(position);
            position++;
        }

            position += instrument.encode(buffer, position);

        if (hasNoUnderlyingsGroupCounter)
        {
            buffer.putBytes(position, noUnderlyingsGroupCounterHeader, 0, noUnderlyingsGroupCounterHeaderLength);
            position += noUnderlyingsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noUnderlyingsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (underlyingsGroup != null)
        {
            position += underlyingsGroup.encode(buffer, position, noUnderlyingsGroupCounter);
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

        if (hasMDEntryPx)
        {
            buffer.putBytes(position, mDEntryPxHeader, 0, mDEntryPxHeaderLength);
            position += mDEntryPxHeaderLength;
            position += buffer.putFloatAscii(position, mDEntryPx);
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

        if (hasMDEntrySize)
        {
            buffer.putBytes(position, mDEntrySizeHeader, 0, mDEntrySizeHeaderLength);
            position += mDEntrySizeHeaderLength;
            position += buffer.putFloatAscii(position, mDEntrySize);
            buffer.putSeparator(position);
            position++;
        }

        if (mDEntryDateLength > 0)
        {
            buffer.putBytes(position, mDEntryDateHeader, 0, mDEntryDateHeaderLength);
            position += mDEntryDateHeaderLength;
            buffer.putBytes(position, mDEntryDate, mDEntryDateOffset, mDEntryDateLength);
            position += mDEntryDateLength;
            buffer.putSeparator(position);
            position++;
        }

        if (mDEntryTimeLength > 0)
        {
            buffer.putBytes(position, mDEntryTimeHeader, 0, mDEntryTimeHeaderLength);
            position += mDEntryTimeHeaderLength;
            buffer.putBytes(position, mDEntryTime, mDEntryTimeOffset, mDEntryTimeLength);
            position += mDEntryTimeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasTickDirection)
        {
            buffer.putBytes(position, tickDirectionHeader, 0, tickDirectionHeaderLength);
            position += tickDirectionHeaderLength;
            position += buffer.putCharAscii(position, tickDirection);
            buffer.putSeparator(position);
            position++;
        }

        if (mDMktLength > 0)
        {
            buffer.putBytes(position, mDMktHeader, 0, mDMktHeaderLength);
            position += mDMktHeaderLength;
            buffer.putBytes(position, mDMkt, mDMktOffset, mDMktLength);
            position += mDMktLength;
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

        if (quoteConditionLength > 0)
        {
            buffer.putBytes(position, quoteConditionHeader, 0, quoteConditionHeaderLength);
            position += quoteConditionHeaderLength;
            buffer.putBytes(position, quoteCondition, quoteConditionOffset, quoteConditionLength);
            position += quoteConditionLength;
            buffer.putSeparator(position);
            position++;
        }

        if (tradeConditionLength > 0)
        {
            buffer.putBytes(position, tradeConditionHeader, 0, tradeConditionHeaderLength);
            position += tradeConditionHeaderLength;
            buffer.putBytes(position, tradeCondition, tradeConditionOffset, tradeConditionLength);
            position += tradeConditionLength;
            buffer.putSeparator(position);
            position++;
        }

        if (mDEntryOriginatorLength > 0)
        {
            buffer.putBytes(position, mDEntryOriginatorHeader, 0, mDEntryOriginatorHeaderLength);
            position += mDEntryOriginatorHeaderLength;
            buffer.putBytes(position, mDEntryOriginator, mDEntryOriginatorOffset, mDEntryOriginatorLength);
            position += mDEntryOriginatorLength;
            buffer.putSeparator(position);
            position++;
        }

        if (locationIDLength > 0)
        {
            buffer.putBytes(position, locationIDHeader, 0, locationIDHeaderLength);
            position += locationIDHeaderLength;
            buffer.putBytes(position, locationID, locationIDOffset, locationIDLength);
            position += locationIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (deskIDLength > 0)
        {
            buffer.putBytes(position, deskIDHeader, 0, deskIDHeaderLength);
            position += deskIDHeaderLength;
            buffer.putBytes(position, deskID, deskIDOffset, deskIDLength);
            position += deskIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (openCloseSettlFlagLength > 0)
        {
            buffer.putBytes(position, openCloseSettlFlagHeader, 0, openCloseSettlFlagHeaderLength);
            position += openCloseSettlFlagHeaderLength;
            buffer.putBytes(position, openCloseSettlFlag, openCloseSettlFlagOffset, openCloseSettlFlagLength);
            position += openCloseSettlFlagLength;
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

        if (expireDateLength > 0)
        {
            buffer.putBytes(position, expireDateHeader, 0, expireDateHeaderLength);
            position += expireDateHeaderLength;
            buffer.putBytes(position, expireDate, expireDateOffset, expireDateLength);
            position += expireDateLength;
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

        if (hasMinQty)
        {
            buffer.putBytes(position, minQtyHeader, 0, minQtyHeaderLength);
            position += minQtyHeaderLength;
            position += buffer.putFloatAscii(position, minQty);
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

        if (hasSellerDays)
        {
            buffer.putBytes(position, sellerDaysHeader, 0, sellerDaysHeaderLength);
            position += sellerDaysHeaderLength;
            position += buffer.putIntAscii(position, sellerDays);
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

        if (quoteEntryIDLength > 0)
        {
            buffer.putBytes(position, quoteEntryIDHeader, 0, quoteEntryIDHeaderLength);
            position += quoteEntryIDHeaderLength;
            buffer.putBytes(position, quoteEntryID, quoteEntryIDOffset, quoteEntryIDLength);
            position += quoteEntryIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (mDEntryBuyerLength > 0)
        {
            buffer.putBytes(position, mDEntryBuyerHeader, 0, mDEntryBuyerHeaderLength);
            position += mDEntryBuyerHeaderLength;
            buffer.putBytes(position, mDEntryBuyer, mDEntryBuyerOffset, mDEntryBuyerLength);
            position += mDEntryBuyerLength;
            buffer.putSeparator(position);
            position++;
        }

        if (mDEntrySellerLength > 0)
        {
            buffer.putBytes(position, mDEntrySellerHeader, 0, mDEntrySellerHeaderLength);
            position += mDEntrySellerHeaderLength;
            buffer.putBytes(position, mDEntrySeller, mDEntrySellerOffset, mDEntrySellerLength);
            position += mDEntrySellerLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasNumberOfOrders)
        {
            buffer.putBytes(position, numberOfOrdersHeader, 0, numberOfOrdersHeaderLength);
            position += numberOfOrdersHeaderLength;
            position += buffer.putIntAscii(position, numberOfOrders);
            buffer.putSeparator(position);
            position++;
        }

        if (hasMDEntryPositionNo)
        {
            buffer.putBytes(position, mDEntryPositionNoHeader, 0, mDEntryPositionNoHeaderLength);
            position += mDEntryPositionNoHeaderLength;
            position += buffer.putIntAscii(position, mDEntryPositionNo);
            buffer.putSeparator(position);
            position++;
        }

        if (scopeLength > 0)
        {
            buffer.putBytes(position, scopeHeader, 0, scopeHeaderLength);
            position += scopeHeaderLength;
            buffer.putBytes(position, scope, scopeOffset, scopeLength);
            position += scopeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasPriceDelta)
        {
            buffer.putBytes(position, priceDeltaHeader, 0, priceDeltaHeaderLength);
            position += priceDeltaHeaderLength;
            position += buffer.putFloatAscii(position, priceDelta);
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
        if (next != null)
        {
            position += next.encode(buffer, position, remainingElements - 1);
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetMDUpdateAction();
        this.resetDeleteReason();
        this.resetMDEntryType();
        this.resetMDEntryID();
        this.resetMDEntryRefID();
        this.resetFinancialStatus();
        this.resetCorporateAction();
        this.resetMDEntryPx();
        this.resetCurrency();
        this.resetMDEntrySize();
        this.resetMDEntryDate();
        this.resetMDEntryTime();
        this.resetTickDirection();
        this.resetMDMkt();
        this.resetTradingSessionID();
        this.resetTradingSessionSubID();
        this.resetQuoteCondition();
        this.resetTradeCondition();
        this.resetMDEntryOriginator();
        this.resetLocationID();
        this.resetDeskID();
        this.resetOpenCloseSettlFlag();
        this.resetTimeInForce();
        this.resetExpireDate();
        this.resetExpireTime();
        this.resetMinQty();
        this.resetExecInst();
        this.resetSellerDays();
        this.resetOrderID();
        this.resetQuoteEntryID();
        this.resetMDEntryBuyer();
        this.resetMDEntrySeller();
        this.resetNumberOfOrders();
        this.resetMDEntryPositionNo();
        this.resetScope();
        this.resetPriceDelta();
        this.resetNetChgPrevDay();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        instrument.reset();
        this.resetUnderlyingsGroup();
        this.resetLegsGroup();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetMDUpdateAction()
    {
        mDUpdateAction = MISSING_CHAR;
    }

    public void resetDeleteReason()
    {
        hasDeleteReason = false;
    }

    public void resetMDEntryType()
    {
        hasMDEntryType = false;
    }

    public void resetMDEntryID()
    {
        mDEntryIDLength = 0;
    }

    public void resetMDEntryRefID()
    {
        mDEntryRefIDLength = 0;
    }

    public void resetFinancialStatus()
    {
        financialStatusLength = 0;
    }

    public void resetCorporateAction()
    {
        corporateActionLength = 0;
    }

    public void resetMDEntryPx()
    {
        hasMDEntryPx = false;
    }

    public void resetCurrency()
    {
        currencyLength = 0;
    }

    public void resetMDEntrySize()
    {
        hasMDEntrySize = false;
    }

    public void resetMDEntryDate()
    {
        mDEntryDateLength = 0;
    }

    public void resetMDEntryTime()
    {
        mDEntryTimeLength = 0;
    }

    public void resetTickDirection()
    {
        hasTickDirection = false;
    }

    public void resetMDMkt()
    {
        mDMktLength = 0;
    }

    public void resetTradingSessionID()
    {
        tradingSessionIDLength = 0;
    }

    public void resetTradingSessionSubID()
    {
        tradingSessionSubIDLength = 0;
    }

    public void resetQuoteCondition()
    {
        quoteConditionLength = 0;
    }

    public void resetTradeCondition()
    {
        tradeConditionLength = 0;
    }

    public void resetMDEntryOriginator()
    {
        mDEntryOriginatorLength = 0;
    }

    public void resetLocationID()
    {
        locationIDLength = 0;
    }

    public void resetDeskID()
    {
        deskIDLength = 0;
    }

    public void resetOpenCloseSettlFlag()
    {
        openCloseSettlFlagLength = 0;
    }

    public void resetTimeInForce()
    {
        hasTimeInForce = false;
    }

    public void resetExpireDate()
    {
        expireDateLength = 0;
    }

    public void resetExpireTime()
    {
        expireTimeLength = 0;
    }

    public void resetMinQty()
    {
        hasMinQty = false;
    }

    public void resetExecInst()
    {
        execInstLength = 0;
    }

    public void resetSellerDays()
    {
        hasSellerDays = false;
    }

    public void resetOrderID()
    {
        orderIDLength = 0;
    }

    public void resetQuoteEntryID()
    {
        quoteEntryIDLength = 0;
    }

    public void resetMDEntryBuyer()
    {
        mDEntryBuyerLength = 0;
    }

    public void resetMDEntrySeller()
    {
        mDEntrySellerLength = 0;
    }

    public void resetNumberOfOrders()
    {
        hasNumberOfOrders = false;
    }

    public void resetMDEntryPositionNo()
    {
        hasMDEntryPositionNo = false;
    }

    public void resetScope()
    {
        scopeLength = 0;
    }

    public void resetPriceDelta()
    {
        hasPriceDelta = false;
    }

    public void resetNetChgPrevDay()
    {
        hasNetChgPrevDay = false;
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

    public void resetUnderlyingsGroup()
    {
        if (underlyingsGroup != null)
        {
            underlyingsGroup.reset();
        }
        noUnderlyingsGroupCounter = 0;
        hasNoUnderlyingsGroupCounter = false;
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
        builder.append("\"MessageName\": \"MDEntriesGroup\",\n");
        if (hasMDUpdateAction())
        {
            indent(builder, level);
            builder.append("\"MDUpdateAction\": \"");
            builder.append(mDUpdateAction);
            builder.append("\",\n");
        }

        if (hasDeleteReason())
        {
            indent(builder, level);
            builder.append("\"DeleteReason\": \"");
            builder.append(deleteReason);
            builder.append("\",\n");
        }

        if (hasMDEntryType())
        {
            indent(builder, level);
            builder.append("\"MDEntryType\": \"");
            builder.append(mDEntryType);
            builder.append("\",\n");
        }

        if (hasMDEntryID())
        {
            indent(builder, level);
            builder.append("\"MDEntryID\": \"");
            appendBuffer(builder, mDEntryID, mDEntryIDOffset, mDEntryIDLength);
            builder.append("\",\n");
        }

        if (hasMDEntryRefID())
        {
            indent(builder, level);
            builder.append("\"MDEntryRefID\": \"");
            appendBuffer(builder, mDEntryRefID, mDEntryRefIDOffset, mDEntryRefIDLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"Instrument\": ");
    instrument.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasNoUnderlyingsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"UnderlyingsGroup\": [\n");
            final int noUnderlyingsGroupCounter = this.noUnderlyingsGroupCounter;
            UnderlyingsGroupEncoder underlyingsGroup = this.underlyingsGroup;
            for (int i = 0; i < noUnderlyingsGroupCounter; i++)
            {
                indent(builder, level);
                underlyingsGroup.appendTo(builder, level + 1);
                if (i < (noUnderlyingsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                underlyingsGroup = underlyingsGroup.next();
            }
            indent(builder, level);
            builder.append("],\n");
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

        if (hasMDEntryPx())
        {
            indent(builder, level);
            builder.append("\"MDEntryPx\": \"");
            mDEntryPx.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasCurrency())
        {
            indent(builder, level);
            builder.append("\"Currency\": \"");
            appendBuffer(builder, currency, currencyOffset, currencyLength);
            builder.append("\",\n");
        }

        if (hasMDEntrySize())
        {
            indent(builder, level);
            builder.append("\"MDEntrySize\": \"");
            mDEntrySize.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasMDEntryDate())
        {
            indent(builder, level);
            builder.append("\"MDEntryDate\": \"");
            appendBuffer(builder, mDEntryDate, mDEntryDateOffset, mDEntryDateLength);
            builder.append("\",\n");
        }

        if (hasMDEntryTime())
        {
            indent(builder, level);
            builder.append("\"MDEntryTime\": \"");
            appendBuffer(builder, mDEntryTime, mDEntryTimeOffset, mDEntryTimeLength);
            builder.append("\",\n");
        }

        if (hasTickDirection())
        {
            indent(builder, level);
            builder.append("\"TickDirection\": \"");
            builder.append(tickDirection);
            builder.append("\",\n");
        }

        if (hasMDMkt())
        {
            indent(builder, level);
            builder.append("\"MDMkt\": \"");
            appendBuffer(builder, mDMkt, mDMktOffset, mDMktLength);
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

        if (hasQuoteCondition())
        {
            indent(builder, level);
            builder.append("\"QuoteCondition\": \"");
            appendBuffer(builder, quoteCondition, quoteConditionOffset, quoteConditionLength);
            builder.append("\",\n");
        }

        if (hasTradeCondition())
        {
            indent(builder, level);
            builder.append("\"TradeCondition\": \"");
            appendBuffer(builder, tradeCondition, tradeConditionOffset, tradeConditionLength);
            builder.append("\",\n");
        }

        if (hasMDEntryOriginator())
        {
            indent(builder, level);
            builder.append("\"MDEntryOriginator\": \"");
            appendBuffer(builder, mDEntryOriginator, mDEntryOriginatorOffset, mDEntryOriginatorLength);
            builder.append("\",\n");
        }

        if (hasLocationID())
        {
            indent(builder, level);
            builder.append("\"LocationID\": \"");
            appendBuffer(builder, locationID, locationIDOffset, locationIDLength);
            builder.append("\",\n");
        }

        if (hasDeskID())
        {
            indent(builder, level);
            builder.append("\"DeskID\": \"");
            appendBuffer(builder, deskID, deskIDOffset, deskIDLength);
            builder.append("\",\n");
        }

        if (hasOpenCloseSettlFlag())
        {
            indent(builder, level);
            builder.append("\"OpenCloseSettlFlag\": \"");
            appendBuffer(builder, openCloseSettlFlag, openCloseSettlFlagOffset, openCloseSettlFlagLength);
            builder.append("\",\n");
        }

        if (hasTimeInForce())
        {
            indent(builder, level);
            builder.append("\"TimeInForce\": \"");
            builder.append(timeInForce);
            builder.append("\",\n");
        }

        if (hasExpireDate())
        {
            indent(builder, level);
            builder.append("\"ExpireDate\": \"");
            appendBuffer(builder, expireDate, expireDateOffset, expireDateLength);
            builder.append("\",\n");
        }

        if (hasExpireTime())
        {
            indent(builder, level);
            builder.append("\"ExpireTime\": \"");
            appendBuffer(builder, expireTime, expireTimeOffset, expireTimeLength);
            builder.append("\",\n");
        }

        if (hasMinQty())
        {
            indent(builder, level);
            builder.append("\"MinQty\": \"");
            minQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasExecInst())
        {
            indent(builder, level);
            builder.append("\"ExecInst\": \"");
            appendBuffer(builder, execInst, execInstOffset, execInstLength);
            builder.append("\",\n");
        }

        if (hasSellerDays())
        {
            indent(builder, level);
            builder.append("\"SellerDays\": \"");
            builder.append(sellerDays);
            builder.append("\",\n");
        }

        if (hasOrderID())
        {
            indent(builder, level);
            builder.append("\"OrderID\": \"");
            appendBuffer(builder, orderID, orderIDOffset, orderIDLength);
            builder.append("\",\n");
        }

        if (hasQuoteEntryID())
        {
            indent(builder, level);
            builder.append("\"QuoteEntryID\": \"");
            appendBuffer(builder, quoteEntryID, quoteEntryIDOffset, quoteEntryIDLength);
            builder.append("\",\n");
        }

        if (hasMDEntryBuyer())
        {
            indent(builder, level);
            builder.append("\"MDEntryBuyer\": \"");
            appendBuffer(builder, mDEntryBuyer, mDEntryBuyerOffset, mDEntryBuyerLength);
            builder.append("\",\n");
        }

        if (hasMDEntrySeller())
        {
            indent(builder, level);
            builder.append("\"MDEntrySeller\": \"");
            appendBuffer(builder, mDEntrySeller, mDEntrySellerOffset, mDEntrySellerLength);
            builder.append("\",\n");
        }

        if (hasNumberOfOrders())
        {
            indent(builder, level);
            builder.append("\"NumberOfOrders\": \"");
            builder.append(numberOfOrders);
            builder.append("\",\n");
        }

        if (hasMDEntryPositionNo())
        {
            indent(builder, level);
            builder.append("\"MDEntryPositionNo\": \"");
            builder.append(mDEntryPositionNo);
            builder.append("\",\n");
        }

        if (hasScope())
        {
            indent(builder, level);
            builder.append("\"Scope\": \"");
            appendBuffer(builder, scope, scopeOffset, scopeLength);
            builder.append("\",\n");
        }

        if (hasPriceDelta())
        {
            indent(builder, level);
            builder.append("\"PriceDelta\": \"");
            priceDelta.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasNetChgPrevDay())
        {
            indent(builder, level);
            builder.append("\"NetChgPrevDay\": \"");
            netChgPrevDay.appendTo(builder);
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
    public MDEntriesGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((MDEntriesGroupEncoder)encoder);
    }

    public MDEntriesGroupEncoder copyTo(final MDEntriesGroupEncoder encoder)
    {
        encoder.reset();
        if (hasMDUpdateAction())
        {
            encoder.mDUpdateAction(this.mDUpdateAction());
        }

        if (hasDeleteReason())
        {
            encoder.deleteReason(this.deleteReason());
        }

        if (hasMDEntryType())
        {
            encoder.mDEntryType(this.mDEntryType());
        }

        if (hasMDEntryID())
        {
            encoder.mDEntryIDAsCopy(mDEntryID.byteArray(), 0, mDEntryIDLength);
        }

        if (hasMDEntryRefID())
        {
            encoder.mDEntryRefIDAsCopy(mDEntryRefID.byteArray(), 0, mDEntryRefIDLength);
        }


        instrument.copyTo(encoder.instrument());
        if (hasNoUnderlyingsGroupCounter)
        {
            final int size = this.noUnderlyingsGroupCounter;
            UnderlyingsGroupEncoder underlyingsGroup = this.underlyingsGroup;
            UnderlyingsGroupEncoder underlyingsGroupEncoder = encoder.underlyingsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (underlyingsGroup != null)
                {
                    underlyingsGroup.copyTo(underlyingsGroupEncoder);
                    underlyingsGroup = underlyingsGroup.next();
                    underlyingsGroupEncoder = underlyingsGroupEncoder.next();
                }
            }
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

        if (hasFinancialStatus())
        {
            encoder.financialStatusAsCopy(financialStatus.byteArray(), 0, financialStatusLength);
        }

        if (hasCorporateAction())
        {
            encoder.corporateActionAsCopy(corporateAction.byteArray(), 0, corporateActionLength);
        }

        if (hasMDEntryPx())
        {
            encoder.mDEntryPx(this.mDEntryPx());
        }

        if (hasCurrency())
        {
            encoder.currencyAsCopy(currency.byteArray(), 0, currencyLength);
        }

        if (hasMDEntrySize())
        {
            encoder.mDEntrySize(this.mDEntrySize());
        }

        if (hasMDEntryDate())
        {
            encoder.mDEntryDateAsCopy(mDEntryDate.byteArray(), 0, mDEntryDateLength);
        }

        if (hasMDEntryTime())
        {
            encoder.mDEntryTimeAsCopy(mDEntryTime.byteArray(), 0, mDEntryTimeLength);
        }

        if (hasTickDirection())
        {
            encoder.tickDirection(this.tickDirection());
        }

        if (hasMDMkt())
        {
            encoder.mDMktAsCopy(mDMkt.byteArray(), 0, mDMktLength);
        }

        if (hasTradingSessionID())
        {
            encoder.tradingSessionIDAsCopy(tradingSessionID.byteArray(), 0, tradingSessionIDLength);
        }

        if (hasTradingSessionSubID())
        {
            encoder.tradingSessionSubIDAsCopy(tradingSessionSubID.byteArray(), 0, tradingSessionSubIDLength);
        }

        if (hasQuoteCondition())
        {
            encoder.quoteConditionAsCopy(quoteCondition.byteArray(), 0, quoteConditionLength);
        }

        if (hasTradeCondition())
        {
            encoder.tradeConditionAsCopy(tradeCondition.byteArray(), 0, tradeConditionLength);
        }

        if (hasMDEntryOriginator())
        {
            encoder.mDEntryOriginatorAsCopy(mDEntryOriginator.byteArray(), 0, mDEntryOriginatorLength);
        }

        if (hasLocationID())
        {
            encoder.locationIDAsCopy(locationID.byteArray(), 0, locationIDLength);
        }

        if (hasDeskID())
        {
            encoder.deskIDAsCopy(deskID.byteArray(), 0, deskIDLength);
        }

        if (hasOpenCloseSettlFlag())
        {
            encoder.openCloseSettlFlagAsCopy(openCloseSettlFlag.byteArray(), 0, openCloseSettlFlagLength);
        }

        if (hasTimeInForce())
        {
            encoder.timeInForce(this.timeInForce());
        }

        if (hasExpireDate())
        {
            encoder.expireDateAsCopy(expireDate.byteArray(), 0, expireDateLength);
        }

        if (hasExpireTime())
        {
            encoder.expireTimeAsCopy(expireTime.byteArray(), 0, expireTimeLength);
        }

        if (hasMinQty())
        {
            encoder.minQty(this.minQty());
        }

        if (hasExecInst())
        {
            encoder.execInstAsCopy(execInst.byteArray(), 0, execInstLength);
        }

        if (hasSellerDays())
        {
            encoder.sellerDays(this.sellerDays());
        }

        if (hasOrderID())
        {
            encoder.orderIDAsCopy(orderID.byteArray(), 0, orderIDLength);
        }

        if (hasQuoteEntryID())
        {
            encoder.quoteEntryIDAsCopy(quoteEntryID.byteArray(), 0, quoteEntryIDLength);
        }

        if (hasMDEntryBuyer())
        {
            encoder.mDEntryBuyerAsCopy(mDEntryBuyer.byteArray(), 0, mDEntryBuyerLength);
        }

        if (hasMDEntrySeller())
        {
            encoder.mDEntrySellerAsCopy(mDEntrySeller.byteArray(), 0, mDEntrySellerLength);
        }

        if (hasNumberOfOrders())
        {
            encoder.numberOfOrders(this.numberOfOrders());
        }

        if (hasMDEntryPositionNo())
        {
            encoder.mDEntryPositionNo(this.mDEntryPositionNo());
        }

        if (hasScope())
        {
            encoder.scopeAsCopy(scope.byteArray(), 0, scopeLength);
        }

        if (hasPriceDelta())
        {
            encoder.priceDelta(this.priceDelta());
        }

        if (hasNetChgPrevDay())
        {
            encoder.netChgPrevDay(this.netChgPrevDay());
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
    private int noMDEntriesGroupCounter;

    private boolean hasNoMDEntriesGroupCounter;

    public boolean hasNoMDEntriesGroupCounter()
    {
        return hasNoMDEntriesGroupCounter;
    }

    public MarketDataIncrementalRefreshEncoder noMDEntriesGroupCounter(int value)
    {
        noMDEntriesGroupCounter = value;
        hasNoMDEntriesGroupCounter = true;
        return this;
    }

    public int noMDEntriesGroupCounter()
    {
        return noMDEntriesGroupCounter;
    }


    private MDEntriesGroupEncoder mDEntriesGroup = null;

    public MDEntriesGroupEncoder mDEntriesGroup(final int numberOfElements)
    {
        hasNoMDEntriesGroupCounter = true;
        noMDEntriesGroupCounter = numberOfElements;
        if (mDEntriesGroup == null)
        {
            mDEntriesGroup = new MDEntriesGroupEncoder();
        }
        return mDEntriesGroup;
    }

    private int applQueueDepth;

    private boolean hasApplQueueDepth;

    public boolean hasApplQueueDepth()
    {
        return hasApplQueueDepth;
    }

    public MarketDataIncrementalRefreshEncoder applQueueDepth(int value)
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

    public MarketDataIncrementalRefreshEncoder applQueueResolution(int value)
    {
        applQueueResolution = value;
        hasApplQueueResolution = true;
        return this;
    }

    public int applQueueResolution()
    {
        return applQueueResolution;
    }

    public MarketDataIncrementalRefreshEncoder applQueueResolution(ApplQueueResolution value)
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

    public long encode(final MutableAsciiBuffer buffer, final int offset)
    {
        final long startMessageResult = header.startMessage(buffer, offset);
        final int bodyStart = Encoder.offset(startMessageResult);
        int position = bodyStart + Encoder.length(startMessageResult);

        if (mDReqIDLength > 0)
        {
            buffer.putBytes(position, mDReqIDHeader, 0, mDReqIDHeaderLength);
            position += mDReqIDHeaderLength;
            buffer.putBytes(position, mDReqID, mDReqIDOffset, mDReqIDLength);
            position += mDReqIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasNoMDEntriesGroupCounter)
        {
            buffer.putBytes(position, noMDEntriesGroupCounterHeader, 0, noMDEntriesGroupCounterHeaderLength);
            position += noMDEntriesGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noMDEntriesGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (mDEntriesGroup != null)
        {
            position += mDEntriesGroup.encode(buffer, position, noMDEntriesGroupCounter);
        }


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
        this.resetMDReqID();
        this.resetApplQueueDepth();
        this.resetApplQueueResolution();
        this.resetMDEntriesGroup();
    }

    public void resetMDReqID()
    {
        mDReqIDLength = 0;
    }

    public void resetApplQueueDepth()
    {
        hasApplQueueDepth = false;
    }

    public void resetApplQueueResolution()
    {
        hasApplQueueResolution = false;
    }

    public void resetMDEntriesGroup()
    {
        if (mDEntriesGroup != null)
        {
            mDEntriesGroup.reset();
        }
        noMDEntriesGroupCounter = 0;
        hasNoMDEntriesGroupCounter = false;
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
        builder.append("\"MessageName\": \"MarketDataIncrementalRefresh\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasMDReqID())
        {
            indent(builder, level);
            builder.append("\"MDReqID\": \"");
            appendBuffer(builder, mDReqID, mDReqIDOffset, mDReqIDLength);
            builder.append("\",\n");
        }

        if (hasNoMDEntriesGroupCounter)
        {
            indent(builder, level);
            builder.append("\"MDEntriesGroup\": [\n");
            final int noMDEntriesGroupCounter = this.noMDEntriesGroupCounter;
            MDEntriesGroupEncoder mDEntriesGroup = this.mDEntriesGroup;
            for (int i = 0; i < noMDEntriesGroupCounter; i++)
            {
                indent(builder, level);
                mDEntriesGroup.appendTo(builder, level + 1);
                if (i < (noMDEntriesGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                mDEntriesGroup = mDEntriesGroup.next();
            }
            indent(builder, level);
            builder.append("],\n");
        }

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
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public MarketDataIncrementalRefreshEncoder copyTo(final Encoder encoder)
    {
        return copyTo((MarketDataIncrementalRefreshEncoder)encoder);
    }

    public MarketDataIncrementalRefreshEncoder copyTo(final MarketDataIncrementalRefreshEncoder encoder)
    {
        encoder.reset();
        if (hasMDReqID())
        {
            encoder.mDReqIDAsCopy(mDReqID.byteArray(), 0, mDReqIDLength);
        }

        if (hasNoMDEntriesGroupCounter)
        {
            final int size = this.noMDEntriesGroupCounter;
            MDEntriesGroupEncoder mDEntriesGroup = this.mDEntriesGroup;
            MDEntriesGroupEncoder mDEntriesGroupEncoder = encoder.mDEntriesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (mDEntriesGroup != null)
                {
                    mDEntriesGroup.copyTo(mDEntriesGroupEncoder);
                    mDEntriesGroup = mDEntriesGroup.next();
                    mDEntriesGroupEncoder = mDEntriesGroupEncoder.next();
                }
            }
        }

        if (hasApplQueueDepth())
        {
            encoder.applQueueDepth(this.applQueueDepth());
        }

        if (hasApplQueueResolution())
        {
            encoder.applQueueResolution(this.applQueueResolution());
        }
        return encoder;
    }

}
