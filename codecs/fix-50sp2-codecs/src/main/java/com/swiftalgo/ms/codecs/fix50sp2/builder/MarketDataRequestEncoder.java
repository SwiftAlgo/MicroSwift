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

    private static final int applQueueActionHeaderLength = 4;
    private static final byte[] applQueueActionHeader = new byte[] {56, 49, 53, (byte) '='};

    private static final int applQueueMaxHeaderLength = 4;
    private static final byte[] applQueueMaxHeader = new byte[] {56, 49, 50, (byte) '='};

    private static final int mDQuoteTypeHeaderLength = 5;
    private static final byte[] mDQuoteTypeHeader = new byte[] {49, 48, 55, 48, (byte) '='};

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

    private final PartiesEncoder parties = new PartiesEncoder();
    public PartiesEncoder parties()
    {
        return parties;
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

    private final MDReqGrpEncoder mDReqGrp = new MDReqGrpEncoder();
    public MDReqGrpEncoder mDReqGrp()
    {
        return mDReqGrp;
    }

    private final InstrmtMDReqGrpEncoder instrmtMDReqGrp = new InstrmtMDReqGrpEncoder();
    public InstrmtMDReqGrpEncoder instrmtMDReqGrp()
    {
        return instrmtMDReqGrp;
    }

    private final TrdgSesGrpEncoder trdgSesGrp = new TrdgSesGrpEncoder();
    public TrdgSesGrpEncoder trdgSesGrp()
    {
        return trdgSesGrp;
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

    private int mDQuoteType;

    private boolean hasMDQuoteType;

    public boolean hasMDQuoteType()
    {
        return hasMDQuoteType;
    }

    public MarketDataRequestEncoder mDQuoteType(int value)
    {
        mDQuoteType = value;
        hasMDQuoteType = true;
        return this;
    }

    public int mDQuoteType()
    {
        return mDQuoteType;
    }

    public MarketDataRequestEncoder mDQuoteType(MDQuoteType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == MDQuoteType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: mDQuoteType Value: " + value );
            }
            if (value == MDQuoteType.NULL_VAL)
            {
                return this;
            }
        }
        return mDQuoteType(value.representation());
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

            position += parties.encode(buffer, position);

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

            position += mDReqGrp.encode(buffer, position);

            position += instrmtMDReqGrp.encode(buffer, position);

            position += trdgSesGrp.encode(buffer, position);

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

        if (hasMDQuoteType)
        {
            buffer.putBytes(position, mDQuoteTypeHeader, 0, mDQuoteTypeHeaderLength);
            position += mDQuoteTypeHeaderLength;
            position += buffer.putIntAscii(position, mDQuoteType);
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
        this.resetMDQuoteType();
        parties.reset();
        mDReqGrp.reset();
        instrmtMDReqGrp.reset();
        trdgSesGrp.reset();
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

    public void resetMDQuoteType()
    {
        hasMDQuoteType = false;
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

    indent(builder, level);
    builder.append("\"Parties\": ");
    parties.appendTo(builder, level + 1);
    builder.append("\n");

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

    indent(builder, level);
    builder.append("\"MDReqGrp\": ");
    mDReqGrp.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"InstrmtMDReqGrp\": ");
    instrmtMDReqGrp.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"TrdgSesGrp\": ");
    trdgSesGrp.appendTo(builder, level + 1);
    builder.append("\n");

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

        if (hasMDQuoteType())
        {
            indent(builder, level);
            builder.append("\"MDQuoteType\": \"");
            builder.append(mDQuoteType);
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


        parties.copyTo(encoder.parties());
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


        mDReqGrp.copyTo(encoder.mDReqGrp());

        instrmtMDReqGrp.copyTo(encoder.instrmtMDReqGrp());

        trdgSesGrp.copyTo(encoder.trdgSesGrp());
        if (hasApplQueueAction())
        {
            encoder.applQueueAction(this.applQueueAction());
        }

        if (hasApplQueueMax())
        {
            encoder.applQueueMax(this.applQueueMax());
        }

        if (hasMDQuoteType())
        {
            encoder.mDQuoteType(this.mDQuoteType());
        }
        return encoder;
    }

}
