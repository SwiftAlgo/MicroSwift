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

    private static final int mDBookTypeHeaderLength = 5;
    private static final byte[] mDBookTypeHeader = new byte[] {49, 48, 50, 49, (byte) '='};

    private static final int mDFeedTypeHeaderLength = 5;
    private static final byte[] mDFeedTypeHeader = new byte[] {49, 48, 50, 50, (byte) '='};

    private static final int tradeDateHeaderLength = 3;
    private static final byte[] tradeDateHeader = new byte[] {55, 53, (byte) '='};

    private static final int mDReqIDHeaderLength = 4;
    private static final byte[] mDReqIDHeader = new byte[] {50, 54, 50, (byte) '='};

    private static final int applQueueDepthHeaderLength = 4;
    private static final byte[] applQueueDepthHeader = new byte[] {56, 49, 51, (byte) '='};

    private static final int applQueueResolutionHeaderLength = 4;
    private static final byte[] applQueueResolutionHeader = new byte[] {56, 49, 52, (byte) '='};

    private final ApplicationSequenceControlEncoder applicationSequenceControl = new ApplicationSequenceControlEncoder();
    public ApplicationSequenceControlEncoder applicationSequenceControl()
    {
        return applicationSequenceControl;
    }

    private int mDBookType;

    private boolean hasMDBookType;

    public boolean hasMDBookType()
    {
        return hasMDBookType;
    }

    public MarketDataIncrementalRefreshEncoder mDBookType(int value)
    {
        mDBookType = value;
        hasMDBookType = true;
        return this;
    }

    public int mDBookType()
    {
        return mDBookType;
    }

    public MarketDataIncrementalRefreshEncoder mDBookType(MDBookType value)
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

    private final MutableDirectBuffer mDFeedType = new UnsafeBuffer();

    private int mDFeedTypeOffset = 0;

    private int mDFeedTypeLength = 0;

    public MarketDataIncrementalRefreshEncoder mDFeedType(final DirectBuffer value, final int offset, final int length)
    {
        mDFeedType.wrap(value);
        mDFeedTypeOffset = offset;
        mDFeedTypeLength = length;
        return this;
    }

    public MarketDataIncrementalRefreshEncoder mDFeedType(final DirectBuffer value, final int length)
    {
        return mDFeedType(value, 0, length);
    }

    public MarketDataIncrementalRefreshEncoder mDFeedType(final DirectBuffer value)
    {
        return mDFeedType(value, 0, value.capacity());
    }

    public MarketDataIncrementalRefreshEncoder mDFeedType(final byte[] value, final int offset, final int length)
    {
        mDFeedType.wrap(value);
        mDFeedTypeOffset = offset;
        mDFeedTypeLength = length;
        return this;
    }

    public MarketDataIncrementalRefreshEncoder mDFeedTypeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(mDFeedType, value, offset, length);
        mDFeedTypeOffset = offset;
        mDFeedTypeLength = length;
        return this;
    }

    public MarketDataIncrementalRefreshEncoder mDFeedType(final byte[] value, final int length)
    {
        return mDFeedType(value, 0, length);
    }

    public MarketDataIncrementalRefreshEncoder mDFeedType(final byte[] value)
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

    public MarketDataIncrementalRefreshEncoder mDFeedType(final CharSequence value)
    {
        toBytes(value, mDFeedType);
        mDFeedTypeOffset = 0;
        mDFeedTypeLength = value.length();
        return this;
    }

    public MarketDataIncrementalRefreshEncoder mDFeedType(final AsciiSequenceView value)
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

    public MarketDataIncrementalRefreshEncoder mDFeedType(final char[] value)
    {
        return mDFeedType(value, 0, value.length);
    }

    public MarketDataIncrementalRefreshEncoder mDFeedType(final char[] value, final int length)
    {
        return mDFeedType(value, 0, length);
    }

    public MarketDataIncrementalRefreshEncoder mDFeedType(final char[] value, final int offset, final int length)
    {
        toBytes(value, mDFeedType, offset, length);
        mDFeedTypeOffset = 0;
        mDFeedTypeLength = length;
        return this;
    }

    private final MutableDirectBuffer tradeDate = new UnsafeBuffer();

    private int tradeDateOffset = 0;

    private int tradeDateLength = 0;

    public MarketDataIncrementalRefreshEncoder tradeDate(final DirectBuffer value, final int offset, final int length)
    {
        tradeDate.wrap(value);
        tradeDateOffset = offset;
        tradeDateLength = length;
        return this;
    }

    public MarketDataIncrementalRefreshEncoder tradeDate(final DirectBuffer value, final int length)
    {
        return tradeDate(value, 0, length);
    }

    public MarketDataIncrementalRefreshEncoder tradeDate(final DirectBuffer value)
    {
        return tradeDate(value, 0, value.capacity());
    }

    public MarketDataIncrementalRefreshEncoder tradeDate(final byte[] value, final int offset, final int length)
    {
        tradeDate.wrap(value);
        tradeDateOffset = offset;
        tradeDateLength = length;
        return this;
    }

    public MarketDataIncrementalRefreshEncoder tradeDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradeDate, value, offset, length);
        tradeDateOffset = offset;
        tradeDateLength = length;
        return this;
    }

    public MarketDataIncrementalRefreshEncoder tradeDate(final byte[] value, final int length)
    {
        return tradeDate(value, 0, length);
    }

    public MarketDataIncrementalRefreshEncoder tradeDate(final byte[] value)
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

    private final MDIncGrpEncoder mDIncGrp = new MDIncGrpEncoder();
    public MDIncGrpEncoder mDIncGrp()
    {
        return mDIncGrp;
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

        if (hasMDBookType)
        {
            buffer.putBytes(position, mDBookTypeHeader, 0, mDBookTypeHeaderLength);
            position += mDBookTypeHeaderLength;
            position += buffer.putIntAscii(position, mDBookType);
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

            position += mDIncGrp.encode(buffer, position);

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
        this.resetMDBookType();
        this.resetMDFeedType();
        this.resetTradeDate();
        this.resetMDReqID();
        this.resetApplQueueDepth();
        this.resetApplQueueResolution();
        applicationSequenceControl.reset();
        mDIncGrp.reset();
        routingGrp.reset();
    }

    public void resetMDBookType()
    {
        hasMDBookType = false;
    }

    public void resetMDFeedType()
    {
        mDFeedTypeLength = 0;
    }

    public void resetTradeDate()
    {
        tradeDateLength = 0;
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
    indent(builder, level);
    builder.append("\"ApplicationSequenceControl\": ");
    applicationSequenceControl.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasMDBookType())
        {
            indent(builder, level);
            builder.append("\"MDBookType\": \"");
            builder.append(mDBookType);
            builder.append("\",\n");
        }

        if (hasMDFeedType())
        {
            indent(builder, level);
            builder.append("\"MDFeedType\": \"");
            appendBuffer(builder, mDFeedType, mDFeedTypeOffset, mDFeedTypeLength);
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

    indent(builder, level);
    builder.append("\"MDIncGrp\": ");
    mDIncGrp.appendTo(builder, level + 1);
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
    public MarketDataIncrementalRefreshEncoder copyTo(final Encoder encoder)
    {
        return copyTo((MarketDataIncrementalRefreshEncoder)encoder);
    }

    public MarketDataIncrementalRefreshEncoder copyTo(final MarketDataIncrementalRefreshEncoder encoder)
    {
        encoder.reset();

        applicationSequenceControl.copyTo(encoder.applicationSequenceControl());
        if (hasMDBookType())
        {
            encoder.mDBookType(this.mDBookType());
        }

        if (hasMDFeedType())
        {
            encoder.mDFeedTypeAsCopy(mDFeedType.byteArray(), 0, mDFeedTypeLength);
        }

        if (hasTradeDate())
        {
            encoder.tradeDateAsCopy(tradeDate.byteArray(), 0, tradeDateLength);
        }

        if (hasMDReqID())
        {
            encoder.mDReqIDAsCopy(mDReqID.byteArray(), 0, mDReqIDLength);
        }


        mDIncGrp.copyTo(encoder.mDIncGrp());
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
