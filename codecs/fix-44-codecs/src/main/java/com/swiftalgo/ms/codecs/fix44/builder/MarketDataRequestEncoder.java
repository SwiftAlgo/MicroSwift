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


public class MarketDataRequestEncoder implements Encoder
{
    public long messageType()
    {
        return 86L;
    }

    public MarketDataRequestEncoder()
    {
        header.msgType("V");
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

    private static final int subscriptionRequestTypeHeaderLength = 4;
    private static final byte[] subscriptionRequestTypeHeader = new byte[] {50, 54, 51, (byte) '='};

    private static final int marketDepthHeaderLength = 4;
    private static final byte[] marketDepthHeader = new byte[] {50, 54, 52, (byte) '='};

    private static final int mDUpdateTypeHeaderLength = 4;
    private static final byte[] mDUpdateTypeHeader = new byte[] {50, 54, 53, (byte) '='};

    private static final int aggregatedBookHeaderLength = 4;
    private static final byte[] aggregatedBookHeader = new byte[] {50, 54, 54, (byte) '='};

    private static final int openCloseSettlFlagHeaderLength = 4;
    private static final byte[] openCloseSettlFlagHeader = new byte[] {50, 56, 54, (byte) '='};

    private static final int scopeHeaderLength = 4;
    private static final byte[] scopeHeader = new byte[] {53, 52, 54, (byte) '='};

    private static final int mDImplicitDeleteHeaderLength = 4;
    private static final byte[] mDImplicitDeleteHeader = new byte[] {53, 52, 55, (byte) '='};

    private static final int noMDEntryTypesGroupCounterHeaderLength = 4;
    private static final byte[] noMDEntryTypesGroupCounterHeader = new byte[] {50, 54, 55, (byte) '='};

    private static final int noRelatedSymGroupCounterHeaderLength = 4;
    private static final byte[] noRelatedSymGroupCounterHeader = new byte[] {49, 52, 54, (byte) '='};

    private static final int noTradingSessionsGroupCounterHeaderLength = 4;
    private static final byte[] noTradingSessionsGroupCounterHeader = new byte[] {51, 56, 54, (byte) '='};

    private static final int applQueueActionHeaderLength = 4;
    private static final byte[] applQueueActionHeader = new byte[] {56, 49, 53, (byte) '='};

    private static final int applQueueMaxHeaderLength = 4;
    private static final byte[] applQueueMaxHeader = new byte[] {56, 49, 50, (byte) '='};

    private final MutableDirectBuffer mDReqID = new UnsafeBuffer();

    private int mDReqIDOffset = 0;

    private int mDReqIDLength = 0;

    public MarketDataRequestEncoder mDReqID(final DirectBuffer value, final int offset, final int length)
    {
        mDReqID.wrap(value);
        mDReqIDOffset = offset;
        mDReqIDLength = length;
        return this;
    }

    public MarketDataRequestEncoder mDReqID(final DirectBuffer value, final int length)
    {
        return mDReqID(value, 0, length);
    }

    public MarketDataRequestEncoder mDReqID(final DirectBuffer value)
    {
        return mDReqID(value, 0, value.capacity());
    }

    public MarketDataRequestEncoder mDReqID(final byte[] value, final int offset, final int length)
    {
        mDReqID.wrap(value);
        mDReqIDOffset = offset;
        mDReqIDLength = length;
        return this;
    }

    public MarketDataRequestEncoder mDReqIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(mDReqID, value, offset, length);
        mDReqIDOffset = offset;
        mDReqIDLength = length;
        return this;
    }

    public MarketDataRequestEncoder mDReqID(final byte[] value, final int length)
    {
        return mDReqID(value, 0, length);
    }

    public MarketDataRequestEncoder mDReqID(final byte[] value)
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

    public MarketDataRequestEncoder mDReqID(final CharSequence value)
    {
        toBytes(value, mDReqID);
        mDReqIDOffset = 0;
        mDReqIDLength = value.length();
        return this;
    }

    public MarketDataRequestEncoder mDReqID(final AsciiSequenceView value)
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

    public MarketDataRequestEncoder mDReqID(final char[] value)
    {
        return mDReqID(value, 0, value.length);
    }

    public MarketDataRequestEncoder mDReqID(final char[] value, final int length)
    {
        return mDReqID(value, 0, length);
    }

    public MarketDataRequestEncoder mDReqID(final char[] value, final int offset, final int length)
    {
        toBytes(value, mDReqID, offset, length);
        mDReqIDOffset = 0;
        mDReqIDLength = length;
        return this;
    }

    private char subscriptionRequestType;

    private boolean hasSubscriptionRequestType;

    public boolean hasSubscriptionRequestType()
    {
        return hasSubscriptionRequestType;
    }

    public MarketDataRequestEncoder subscriptionRequestType(char value)
    {
        subscriptionRequestType = value;
        hasSubscriptionRequestType = true;
        return this;
    }

    public char subscriptionRequestType()
    {
        return subscriptionRequestType;
    }

    public MarketDataRequestEncoder subscriptionRequestType(SubscriptionRequestType value)
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

    private int marketDepth;

    private boolean hasMarketDepth;

    public boolean hasMarketDepth()
    {
        return hasMarketDepth;
    }

    public MarketDataRequestEncoder marketDepth(int value)
    {
        marketDepth = value;
        hasMarketDepth = true;
        return this;
    }

    public int marketDepth()
    {
        return marketDepth;
    }

    private int mDUpdateType;

    private boolean hasMDUpdateType;

    public boolean hasMDUpdateType()
    {
        return hasMDUpdateType;
    }

    public MarketDataRequestEncoder mDUpdateType(int value)
    {
        mDUpdateType = value;
        hasMDUpdateType = true;
        return this;
    }

    public int mDUpdateType()
    {
        return mDUpdateType;
    }

    public MarketDataRequestEncoder mDUpdateType(MDUpdateType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == MDUpdateType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: mDUpdateType Value: " + value );
            }
            if (value == MDUpdateType.NULL_VAL)
            {
                return this;
            }
        }
        return mDUpdateType(value.representation());
    }

    private boolean aggregatedBook;

    private boolean hasAggregatedBook;

    public boolean hasAggregatedBook()
    {
        return hasAggregatedBook;
    }

    public MarketDataRequestEncoder aggregatedBook(boolean value)
    {
        aggregatedBook = value;
        hasAggregatedBook = true;
        return this;
    }

    public boolean aggregatedBook()
    {
        return aggregatedBook;
    }

    private final MutableDirectBuffer openCloseSettlFlag = new UnsafeBuffer();

    private int openCloseSettlFlagOffset = 0;

    private int openCloseSettlFlagLength = 0;

    public MarketDataRequestEncoder openCloseSettlFlag(final DirectBuffer value, final int offset, final int length)
    {
        openCloseSettlFlag.wrap(value);
        openCloseSettlFlagOffset = offset;
        openCloseSettlFlagLength = length;
        return this;
    }

    public MarketDataRequestEncoder openCloseSettlFlag(final DirectBuffer value, final int length)
    {
        return openCloseSettlFlag(value, 0, length);
    }

    public MarketDataRequestEncoder openCloseSettlFlag(final DirectBuffer value)
    {
        return openCloseSettlFlag(value, 0, value.capacity());
    }

    public MarketDataRequestEncoder openCloseSettlFlag(final byte[] value, final int offset, final int length)
    {
        openCloseSettlFlag.wrap(value);
        openCloseSettlFlagOffset = offset;
        openCloseSettlFlagLength = length;
        return this;
    }

    public MarketDataRequestEncoder openCloseSettlFlagAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(openCloseSettlFlag, value, offset, length);
        openCloseSettlFlagOffset = offset;
        openCloseSettlFlagLength = length;
        return this;
    }

    public MarketDataRequestEncoder openCloseSettlFlag(final byte[] value, final int length)
    {
        return openCloseSettlFlag(value, 0, length);
    }

    public MarketDataRequestEncoder openCloseSettlFlag(final byte[] value)
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

    public MarketDataRequestEncoder openCloseSettlFlag(final CharSequence value)
    {
        toBytes(value, openCloseSettlFlag);
        openCloseSettlFlagOffset = 0;
        openCloseSettlFlagLength = value.length();
        return this;
    }

    public MarketDataRequestEncoder openCloseSettlFlag(final AsciiSequenceView value)
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

    public MarketDataRequestEncoder openCloseSettlFlag(final char[] value)
    {
        return openCloseSettlFlag(value, 0, value.length);
    }

    public MarketDataRequestEncoder openCloseSettlFlag(final char[] value, final int length)
    {
        return openCloseSettlFlag(value, 0, length);
    }

    public MarketDataRequestEncoder openCloseSettlFlag(final char[] value, final int offset, final int length)
    {
        toBytes(value, openCloseSettlFlag, offset, length);
        openCloseSettlFlagOffset = 0;
        openCloseSettlFlagLength = length;
        return this;
    }

    private final MutableDirectBuffer scope = new UnsafeBuffer();

    private int scopeOffset = 0;

    private int scopeLength = 0;

    public MarketDataRequestEncoder scope(final DirectBuffer value, final int offset, final int length)
    {
        scope.wrap(value);
        scopeOffset = offset;
        scopeLength = length;
        return this;
    }

    public MarketDataRequestEncoder scope(final DirectBuffer value, final int length)
    {
        return scope(value, 0, length);
    }

    public MarketDataRequestEncoder scope(final DirectBuffer value)
    {
        return scope(value, 0, value.capacity());
    }

    public MarketDataRequestEncoder scope(final byte[] value, final int offset, final int length)
    {
        scope.wrap(value);
        scopeOffset = offset;
        scopeLength = length;
        return this;
    }

    public MarketDataRequestEncoder scopeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(scope, value, offset, length);
        scopeOffset = offset;
        scopeLength = length;
        return this;
    }

    public MarketDataRequestEncoder scope(final byte[] value, final int length)
    {
        return scope(value, 0, length);
    }

    public MarketDataRequestEncoder scope(final byte[] value)
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

    public MarketDataRequestEncoder scope(final CharSequence value)
    {
        toBytes(value, scope);
        scopeOffset = 0;
        scopeLength = value.length();
        return this;
    }

    public MarketDataRequestEncoder scope(final AsciiSequenceView value)
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

    public MarketDataRequestEncoder scope(final char[] value)
    {
        return scope(value, 0, value.length);
    }

    public MarketDataRequestEncoder scope(final char[] value, final int length)
    {
        return scope(value, 0, length);
    }

    public MarketDataRequestEncoder scope(final char[] value, final int offset, final int length)
    {
        toBytes(value, scope, offset, length);
        scopeOffset = 0;
        scopeLength = length;
        return this;
    }

    private boolean mDImplicitDelete;

    private boolean hasMDImplicitDelete;

    public boolean hasMDImplicitDelete()
    {
        return hasMDImplicitDelete;
    }

    public MarketDataRequestEncoder mDImplicitDelete(boolean value)
    {
        mDImplicitDelete = value;
        hasMDImplicitDelete = true;
        return this;
    }

    public boolean mDImplicitDelete()
    {
        return mDImplicitDelete;
    }



public static class MDEntryTypesGroupEncoder
{
    private MDEntryTypesGroupEncoder next = null;

    public MDEntryTypesGroupEncoder next()
    {
        if (next == null)
        {
            next = new MDEntryTypesGroupEncoder();
        }
        return next;
    }

    private static final int mDEntryTypeHeaderLength = 4;
    private static final byte[] mDEntryTypeHeader = new byte[] {50, 54, 57, (byte) '='};

    private char mDEntryType;

    private boolean hasMDEntryType;

    public boolean hasMDEntryType()
    {
        return hasMDEntryType;
    }

    public MDEntryTypesGroupEncoder mDEntryType(char value)
    {
        mDEntryType = value;
        hasMDEntryType = true;
        return this;
    }

    public char mDEntryType()
    {
        return mDEntryType;
    }

    public MDEntryTypesGroupEncoder mDEntryType(MDEntryType value)
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

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (hasMDEntryType)
        {
            buffer.putBytes(position, mDEntryTypeHeader, 0, mDEntryTypeHeaderLength);
            position += mDEntryTypeHeaderLength;
            position += buffer.putCharAscii(position, mDEntryType);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: MDEntryType");
        }
        if (next != null)
        {
            position += next.encode(buffer, position, remainingElements - 1);
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetMDEntryType();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetMDEntryType()
    {
        mDEntryType = MISSING_CHAR;
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
        builder.append("\"MessageName\": \"MDEntryTypesGroup\",\n");
        if (hasMDEntryType())
        {
            indent(builder, level);
            builder.append("\"MDEntryType\": \"");
            builder.append(mDEntryType);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public MDEntryTypesGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((MDEntryTypesGroupEncoder)encoder);
    }

    public MDEntryTypesGroupEncoder copyTo(final MDEntryTypesGroupEncoder encoder)
    {
        encoder.reset();
        if (hasMDEntryType())
        {
            encoder.mDEntryType(this.mDEntryType());
        }
        return encoder;
    }

}
    private int noMDEntryTypesGroupCounter;

    private boolean hasNoMDEntryTypesGroupCounter;

    public boolean hasNoMDEntryTypesGroupCounter()
    {
        return hasNoMDEntryTypesGroupCounter;
    }

    public MarketDataRequestEncoder noMDEntryTypesGroupCounter(int value)
    {
        noMDEntryTypesGroupCounter = value;
        hasNoMDEntryTypesGroupCounter = true;
        return this;
    }

    public int noMDEntryTypesGroupCounter()
    {
        return noMDEntryTypesGroupCounter;
    }


    private MDEntryTypesGroupEncoder mDEntryTypesGroup = null;

    public MDEntryTypesGroupEncoder mDEntryTypesGroup(final int numberOfElements)
    {
        hasNoMDEntryTypesGroupCounter = true;
        noMDEntryTypesGroupCounter = numberOfElements;
        if (mDEntryTypesGroup == null)
        {
            mDEntryTypesGroup = new MDEntryTypesGroupEncoder();
        }
        return mDEntryTypesGroup;
    }



public static class RelatedSymGroupEncoder
{
    private RelatedSymGroupEncoder next = null;

    public RelatedSymGroupEncoder next()
    {
        if (next == null)
        {
            next = new RelatedSymGroupEncoder();
        }
        return next;
    }

    private static final int noUnderlyingsGroupCounterHeaderLength = 4;
    private static final byte[] noUnderlyingsGroupCounterHeader = new byte[] {55, 49, 49, (byte) '='};

    private static final int noLegsGroupCounterHeaderLength = 4;
    private static final byte[] noLegsGroupCounterHeader = new byte[] {53, 53, 53, (byte) '='};

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

    public RelatedSymGroupEncoder noUnderlyingsGroupCounter(int value)
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

    public RelatedSymGroupEncoder noLegsGroupCounter(int value)
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

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

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

        if (next != null)
        {
            position += next.encode(buffer, position, remainingElements - 1);
        }
        return position - offset;
    }

    public void reset()
    {
        instrument.reset();
        this.resetUnderlyingsGroup();
        this.resetLegsGroup();
        if (next != null)        {
            next.reset();
        }
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
        builder.append("\"MessageName\": \"RelatedSymGroup\",\n");
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
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public RelatedSymGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((RelatedSymGroupEncoder)encoder);
    }

    public RelatedSymGroupEncoder copyTo(final RelatedSymGroupEncoder encoder)
    {
        encoder.reset();

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
        return encoder;
    }

}
    private int noRelatedSymGroupCounter;

    private boolean hasNoRelatedSymGroupCounter;

    public boolean hasNoRelatedSymGroupCounter()
    {
        return hasNoRelatedSymGroupCounter;
    }

    public MarketDataRequestEncoder noRelatedSymGroupCounter(int value)
    {
        noRelatedSymGroupCounter = value;
        hasNoRelatedSymGroupCounter = true;
        return this;
    }

    public int noRelatedSymGroupCounter()
    {
        return noRelatedSymGroupCounter;
    }


    private RelatedSymGroupEncoder relatedSymGroup = null;

    public RelatedSymGroupEncoder relatedSymGroup(final int numberOfElements)
    {
        hasNoRelatedSymGroupCounter = true;
        noRelatedSymGroupCounter = numberOfElements;
        if (relatedSymGroup == null)
        {
            relatedSymGroup = new RelatedSymGroupEncoder();
        }
        return relatedSymGroup;
    }



public static class TradingSessionsGroupEncoder
{
    private TradingSessionsGroupEncoder next = null;

    public TradingSessionsGroupEncoder next()
    {
        if (next == null)
        {
            next = new TradingSessionsGroupEncoder();
        }
        return next;
    }

    private static final int tradingSessionIDHeaderLength = 4;
    private static final byte[] tradingSessionIDHeader = new byte[] {51, 51, 54, (byte) '='};

    private static final int tradingSessionSubIDHeaderLength = 4;
    private static final byte[] tradingSessionSubIDHeader = new byte[] {54, 50, 53, (byte) '='};

    private final MutableDirectBuffer tradingSessionID = new UnsafeBuffer();

    private int tradingSessionIDOffset = 0;

    private int tradingSessionIDLength = 0;

    public TradingSessionsGroupEncoder tradingSessionID(final DirectBuffer value, final int offset, final int length)
    {
        tradingSessionID.wrap(value);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public TradingSessionsGroupEncoder tradingSessionID(final DirectBuffer value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public TradingSessionsGroupEncoder tradingSessionID(final DirectBuffer value)
    {
        return tradingSessionID(value, 0, value.capacity());
    }

    public TradingSessionsGroupEncoder tradingSessionID(final byte[] value, final int offset, final int length)
    {
        tradingSessionID.wrap(value);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public TradingSessionsGroupEncoder tradingSessionIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradingSessionID, value, offset, length);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public TradingSessionsGroupEncoder tradingSessionID(final byte[] value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public TradingSessionsGroupEncoder tradingSessionID(final byte[] value)
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

    public TradingSessionsGroupEncoder tradingSessionID(final CharSequence value)
    {
        toBytes(value, tradingSessionID);
        tradingSessionIDOffset = 0;
        tradingSessionIDLength = value.length();
        return this;
    }

    public TradingSessionsGroupEncoder tradingSessionID(final AsciiSequenceView value)
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

    public TradingSessionsGroupEncoder tradingSessionID(final char[] value)
    {
        return tradingSessionID(value, 0, value.length);
    }

    public TradingSessionsGroupEncoder tradingSessionID(final char[] value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public TradingSessionsGroupEncoder tradingSessionID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradingSessionID, offset, length);
        tradingSessionIDOffset = 0;
        tradingSessionIDLength = length;
        return this;
    }

    private final MutableDirectBuffer tradingSessionSubID = new UnsafeBuffer();

    private int tradingSessionSubIDOffset = 0;

    private int tradingSessionSubIDLength = 0;

    public TradingSessionsGroupEncoder tradingSessionSubID(final DirectBuffer value, final int offset, final int length)
    {
        tradingSessionSubID.wrap(value);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public TradingSessionsGroupEncoder tradingSessionSubID(final DirectBuffer value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public TradingSessionsGroupEncoder tradingSessionSubID(final DirectBuffer value)
    {
        return tradingSessionSubID(value, 0, value.capacity());
    }

    public TradingSessionsGroupEncoder tradingSessionSubID(final byte[] value, final int offset, final int length)
    {
        tradingSessionSubID.wrap(value);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public TradingSessionsGroupEncoder tradingSessionSubIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradingSessionSubID, value, offset, length);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public TradingSessionsGroupEncoder tradingSessionSubID(final byte[] value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public TradingSessionsGroupEncoder tradingSessionSubID(final byte[] value)
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

    public TradingSessionsGroupEncoder tradingSessionSubID(final CharSequence value)
    {
        toBytes(value, tradingSessionSubID);
        tradingSessionSubIDOffset = 0;
        tradingSessionSubIDLength = value.length();
        return this;
    }

    public TradingSessionsGroupEncoder tradingSessionSubID(final AsciiSequenceView value)
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

    public TradingSessionsGroupEncoder tradingSessionSubID(final char[] value)
    {
        return tradingSessionSubID(value, 0, value.length);
    }

    public TradingSessionsGroupEncoder tradingSessionSubID(final char[] value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public TradingSessionsGroupEncoder tradingSessionSubID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradingSessionSubID, offset, length);
        tradingSessionSubIDOffset = 0;
        tradingSessionSubIDLength = length;
        return this;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

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
        if (next != null)
        {
            position += next.encode(buffer, position, remainingElements - 1);
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetTradingSessionID();
        this.resetTradingSessionSubID();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetTradingSessionID()
    {
        tradingSessionIDLength = 0;
    }

    public void resetTradingSessionSubID()
    {
        tradingSessionSubIDLength = 0;
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
        builder.append("\"MessageName\": \"TradingSessionsGroup\",\n");
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
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public TradingSessionsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((TradingSessionsGroupEncoder)encoder);
    }

    public TradingSessionsGroupEncoder copyTo(final TradingSessionsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasTradingSessionID())
        {
            encoder.tradingSessionIDAsCopy(tradingSessionID.byteArray(), 0, tradingSessionIDLength);
        }

        if (hasTradingSessionSubID())
        {
            encoder.tradingSessionSubIDAsCopy(tradingSessionSubID.byteArray(), 0, tradingSessionSubIDLength);
        }
        return encoder;
    }

}
    private int noTradingSessionsGroupCounter;

    private boolean hasNoTradingSessionsGroupCounter;

    public boolean hasNoTradingSessionsGroupCounter()
    {
        return hasNoTradingSessionsGroupCounter;
    }

    public MarketDataRequestEncoder noTradingSessionsGroupCounter(int value)
    {
        noTradingSessionsGroupCounter = value;
        hasNoTradingSessionsGroupCounter = true;
        return this;
    }

    public int noTradingSessionsGroupCounter()
    {
        return noTradingSessionsGroupCounter;
    }


    private TradingSessionsGroupEncoder tradingSessionsGroup = null;

    public TradingSessionsGroupEncoder tradingSessionsGroup(final int numberOfElements)
    {
        hasNoTradingSessionsGroupCounter = true;
        noTradingSessionsGroupCounter = numberOfElements;
        if (tradingSessionsGroup == null)
        {
            tradingSessionsGroup = new TradingSessionsGroupEncoder();
        }
        return tradingSessionsGroup;
    }

    private int applQueueAction;

    private boolean hasApplQueueAction;

    public boolean hasApplQueueAction()
    {
        return hasApplQueueAction;
    }

    public MarketDataRequestEncoder applQueueAction(int value)
    {
        applQueueAction = value;
        hasApplQueueAction = true;
        return this;
    }

    public int applQueueAction()
    {
        return applQueueAction;
    }

    public MarketDataRequestEncoder applQueueAction(ApplQueueAction value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == ApplQueueAction.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: applQueueAction Value: " + value );
            }
            if (value == ApplQueueAction.NULL_VAL)
            {
                return this;
            }
        }
        return applQueueAction(value.representation());
    }

    private int applQueueMax;

    private boolean hasApplQueueMax;

    public boolean hasApplQueueMax()
    {
        return hasApplQueueMax;
    }

    public MarketDataRequestEncoder applQueueMax(int value)
    {
        applQueueMax = value;
        hasApplQueueMax = true;
        return this;
    }

    public int applQueueMax()
    {
        return applQueueMax;
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
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: MDReqID");
        }

        if (hasSubscriptionRequestType)
        {
            buffer.putBytes(position, subscriptionRequestTypeHeader, 0, subscriptionRequestTypeHeaderLength);
            position += subscriptionRequestTypeHeaderLength;
            position += buffer.putCharAscii(position, subscriptionRequestType);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: SubscriptionRequestType");
        }

        if (hasMarketDepth)
        {
            buffer.putBytes(position, marketDepthHeader, 0, marketDepthHeaderLength);
            position += marketDepthHeaderLength;
            position += buffer.putIntAscii(position, marketDepth);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: MarketDepth");
        }

        if (hasMDUpdateType)
        {
            buffer.putBytes(position, mDUpdateTypeHeader, 0, mDUpdateTypeHeaderLength);
            position += mDUpdateTypeHeaderLength;
            position += buffer.putIntAscii(position, mDUpdateType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasAggregatedBook)
        {
            buffer.putBytes(position, aggregatedBookHeader, 0, aggregatedBookHeaderLength);
            position += aggregatedBookHeaderLength;
            position += buffer.putBooleanAscii(position, aggregatedBook);
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

        if (scopeLength > 0)
        {
            buffer.putBytes(position, scopeHeader, 0, scopeHeaderLength);
            position += scopeHeaderLength;
            buffer.putBytes(position, scope, scopeOffset, scopeLength);
            position += scopeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasMDImplicitDelete)
        {
            buffer.putBytes(position, mDImplicitDeleteHeader, 0, mDImplicitDeleteHeaderLength);
            position += mDImplicitDeleteHeaderLength;
            position += buffer.putBooleanAscii(position, mDImplicitDelete);
            buffer.putSeparator(position);
            position++;
        }

        if (hasNoMDEntryTypesGroupCounter)
        {
            buffer.putBytes(position, noMDEntryTypesGroupCounterHeader, 0, noMDEntryTypesGroupCounterHeaderLength);
            position += noMDEntryTypesGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noMDEntryTypesGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (mDEntryTypesGroup != null)
        {
            position += mDEntryTypesGroup.encode(buffer, position, noMDEntryTypesGroupCounter);
        }


        if (hasNoRelatedSymGroupCounter)
        {
            buffer.putBytes(position, noRelatedSymGroupCounterHeader, 0, noRelatedSymGroupCounterHeaderLength);
            position += noRelatedSymGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noRelatedSymGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (relatedSymGroup != null)
        {
            position += relatedSymGroup.encode(buffer, position, noRelatedSymGroupCounter);
        }


        if (hasNoTradingSessionsGroupCounter)
        {
            buffer.putBytes(position, noTradingSessionsGroupCounterHeader, 0, noTradingSessionsGroupCounterHeaderLength);
            position += noTradingSessionsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noTradingSessionsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (tradingSessionsGroup != null)
        {
            position += tradingSessionsGroup.encode(buffer, position, noTradingSessionsGroupCounter);
        }


        if (hasApplQueueAction)
        {
            buffer.putBytes(position, applQueueActionHeader, 0, applQueueActionHeaderLength);
            position += applQueueActionHeaderLength;
            position += buffer.putIntAscii(position, applQueueAction);
            buffer.putSeparator(position);
            position++;
        }

        if (hasApplQueueMax)
        {
            buffer.putBytes(position, applQueueMaxHeader, 0, applQueueMaxHeaderLength);
            position += applQueueMaxHeaderLength;
            position += buffer.putIntAscii(position, applQueueMax);
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
        this.resetSubscriptionRequestType();
        this.resetMarketDepth();
        this.resetMDUpdateType();
        this.resetAggregatedBook();
        this.resetOpenCloseSettlFlag();
        this.resetScope();
        this.resetMDImplicitDelete();
        this.resetApplQueueAction();
        this.resetApplQueueMax();
        this.resetMDEntryTypesGroup();
        this.resetRelatedSymGroup();
        this.resetTradingSessionsGroup();
    }

    public void resetMDReqID()
    {
        mDReqIDLength = 0;
    }

    public void resetSubscriptionRequestType()
    {
        subscriptionRequestType = MISSING_CHAR;
    }

    public void resetMarketDepth()
    {
        hasMarketDepth = false;
    }

    public void resetMDUpdateType()
    {
        hasMDUpdateType = false;
    }

    public void resetAggregatedBook()
    {
        hasAggregatedBook = false;
    }

    public void resetOpenCloseSettlFlag()
    {
        openCloseSettlFlagLength = 0;
    }

    public void resetScope()
    {
        scopeLength = 0;
    }

    public void resetMDImplicitDelete()
    {
        hasMDImplicitDelete = false;
    }

    public void resetApplQueueAction()
    {
        hasApplQueueAction = false;
    }

    public void resetApplQueueMax()
    {
        hasApplQueueMax = false;
    }

    public void resetMDEntryTypesGroup()
    {
        if (mDEntryTypesGroup != null)
        {
            mDEntryTypesGroup.reset();
        }
        noMDEntryTypesGroupCounter = 0;
        hasNoMDEntryTypesGroupCounter = false;
    }

    public void resetRelatedSymGroup()
    {
        if (relatedSymGroup != null)
        {
            relatedSymGroup.reset();
        }
        noRelatedSymGroupCounter = 0;
        hasNoRelatedSymGroupCounter = false;
    }

    public void resetTradingSessionsGroup()
    {
        if (tradingSessionsGroup != null)
        {
            tradingSessionsGroup.reset();
        }
        noTradingSessionsGroupCounter = 0;
        hasNoTradingSessionsGroupCounter = false;
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
        builder.append("\"MessageName\": \"MarketDataRequest\",\n");
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

        if (hasSubscriptionRequestType())
        {
            indent(builder, level);
            builder.append("\"SubscriptionRequestType\": \"");
            builder.append(subscriptionRequestType);
            builder.append("\",\n");
        }

        if (hasMarketDepth())
        {
            indent(builder, level);
            builder.append("\"MarketDepth\": \"");
            builder.append(marketDepth);
            builder.append("\",\n");
        }

        if (hasMDUpdateType())
        {
            indent(builder, level);
            builder.append("\"MDUpdateType\": \"");
            builder.append(mDUpdateType);
            builder.append("\",\n");
        }

        if (hasAggregatedBook())
        {
            indent(builder, level);
            builder.append("\"AggregatedBook\": \"");
            builder.append(aggregatedBook);
            builder.append("\",\n");
        }

        if (hasOpenCloseSettlFlag())
        {
            indent(builder, level);
            builder.append("\"OpenCloseSettlFlag\": \"");
            appendBuffer(builder, openCloseSettlFlag, openCloseSettlFlagOffset, openCloseSettlFlagLength);
            builder.append("\",\n");
        }

        if (hasScope())
        {
            indent(builder, level);
            builder.append("\"Scope\": \"");
            appendBuffer(builder, scope, scopeOffset, scopeLength);
            builder.append("\",\n");
        }

        if (hasMDImplicitDelete())
        {
            indent(builder, level);
            builder.append("\"MDImplicitDelete\": \"");
            builder.append(mDImplicitDelete);
            builder.append("\",\n");
        }

        if (hasNoMDEntryTypesGroupCounter)
        {
            indent(builder, level);
            builder.append("\"MDEntryTypesGroup\": [\n");
            final int noMDEntryTypesGroupCounter = this.noMDEntryTypesGroupCounter;
            MDEntryTypesGroupEncoder mDEntryTypesGroup = this.mDEntryTypesGroup;
            for (int i = 0; i < noMDEntryTypesGroupCounter; i++)
            {
                indent(builder, level);
                mDEntryTypesGroup.appendTo(builder, level + 1);
                if (i < (noMDEntryTypesGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                mDEntryTypesGroup = mDEntryTypesGroup.next();
            }
            indent(builder, level);
            builder.append("],\n");
        }

        if (hasNoRelatedSymGroupCounter)
        {
            indent(builder, level);
            builder.append("\"RelatedSymGroup\": [\n");
            final int noRelatedSymGroupCounter = this.noRelatedSymGroupCounter;
            RelatedSymGroupEncoder relatedSymGroup = this.relatedSymGroup;
            for (int i = 0; i < noRelatedSymGroupCounter; i++)
            {
                indent(builder, level);
                relatedSymGroup.appendTo(builder, level + 1);
                if (i < (noRelatedSymGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                relatedSymGroup = relatedSymGroup.next();
            }
            indent(builder, level);
            builder.append("],\n");
        }

        if (hasNoTradingSessionsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"TradingSessionsGroup\": [\n");
            final int noTradingSessionsGroupCounter = this.noTradingSessionsGroupCounter;
            TradingSessionsGroupEncoder tradingSessionsGroup = this.tradingSessionsGroup;
            for (int i = 0; i < noTradingSessionsGroupCounter; i++)
            {
                indent(builder, level);
                tradingSessionsGroup.appendTo(builder, level + 1);
                if (i < (noTradingSessionsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                tradingSessionsGroup = tradingSessionsGroup.next();
            }
            indent(builder, level);
            builder.append("],\n");
        }

        if (hasApplQueueAction())
        {
            indent(builder, level);
            builder.append("\"ApplQueueAction\": \"");
            builder.append(applQueueAction);
            builder.append("\",\n");
        }

        if (hasApplQueueMax())
        {
            indent(builder, level);
            builder.append("\"ApplQueueMax\": \"");
            builder.append(applQueueMax);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public MarketDataRequestEncoder copyTo(final Encoder encoder)
    {
        return copyTo((MarketDataRequestEncoder)encoder);
    }

    public MarketDataRequestEncoder copyTo(final MarketDataRequestEncoder encoder)
    {
        encoder.reset();
        if (hasMDReqID())
        {
            encoder.mDReqIDAsCopy(mDReqID.byteArray(), 0, mDReqIDLength);
        }

        if (hasSubscriptionRequestType())
        {
            encoder.subscriptionRequestType(this.subscriptionRequestType());
        }

        if (hasMarketDepth())
        {
            encoder.marketDepth(this.marketDepth());
        }

        if (hasMDUpdateType())
        {
            encoder.mDUpdateType(this.mDUpdateType());
        }

        if (hasAggregatedBook())
        {
            encoder.aggregatedBook(this.aggregatedBook());
        }

        if (hasOpenCloseSettlFlag())
        {
            encoder.openCloseSettlFlagAsCopy(openCloseSettlFlag.byteArray(), 0, openCloseSettlFlagLength);
        }

        if (hasScope())
        {
            encoder.scopeAsCopy(scope.byteArray(), 0, scopeLength);
        }

        if (hasMDImplicitDelete())
        {
            encoder.mDImplicitDelete(this.mDImplicitDelete());
        }

        if (hasNoMDEntryTypesGroupCounter)
        {
            final int size = this.noMDEntryTypesGroupCounter;
            MDEntryTypesGroupEncoder mDEntryTypesGroup = this.mDEntryTypesGroup;
            MDEntryTypesGroupEncoder mDEntryTypesGroupEncoder = encoder.mDEntryTypesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (mDEntryTypesGroup != null)
                {
                    mDEntryTypesGroup.copyTo(mDEntryTypesGroupEncoder);
                    mDEntryTypesGroup = mDEntryTypesGroup.next();
                    mDEntryTypesGroupEncoder = mDEntryTypesGroupEncoder.next();
                }
            }
        }

        if (hasNoRelatedSymGroupCounter)
        {
            final int size = this.noRelatedSymGroupCounter;
            RelatedSymGroupEncoder relatedSymGroup = this.relatedSymGroup;
            RelatedSymGroupEncoder relatedSymGroupEncoder = encoder.relatedSymGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (relatedSymGroup != null)
                {
                    relatedSymGroup.copyTo(relatedSymGroupEncoder);
                    relatedSymGroup = relatedSymGroup.next();
                    relatedSymGroupEncoder = relatedSymGroupEncoder.next();
                }
            }
        }

        if (hasNoTradingSessionsGroupCounter)
        {
            final int size = this.noTradingSessionsGroupCounter;
            TradingSessionsGroupEncoder tradingSessionsGroup = this.tradingSessionsGroup;
            TradingSessionsGroupEncoder tradingSessionsGroupEncoder = encoder.tradingSessionsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (tradingSessionsGroup != null)
                {
                    tradingSessionsGroup.copyTo(tradingSessionsGroupEncoder);
                    tradingSessionsGroup = tradingSessionsGroup.next();
                    tradingSessionsGroupEncoder = tradingSessionsGroupEncoder.next();
                }
            }
        }

        if (hasApplQueueAction())
        {
            encoder.applQueueAction(this.applQueueAction());
        }

        if (hasApplQueueMax())
        {
            encoder.applQueueMax(this.applQueueMax());
        }
        return encoder;
    }

}
