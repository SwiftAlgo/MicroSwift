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


public class MarketDefinitionRequestEncoder implements Encoder
{
    public long messageType()
    {
        return 21570L;
    }

    public MarketDefinitionRequestEncoder()
    {
        header.msgType("BT");
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

    private static final int marketReqIDHeaderLength = 5;
    private static final byte[] marketReqIDHeader = new byte[] {49, 51, 57, 51, (byte) '='};

    private static final int subscriptionRequestTypeHeaderLength = 4;
    private static final byte[] subscriptionRequestTypeHeader = new byte[] {50, 54, 51, (byte) '='};

    private static final int marketIDHeaderLength = 5;
    private static final byte[] marketIDHeader = new byte[] {49, 51, 48, 49, (byte) '='};

    private static final int marketSegmentIDHeaderLength = 5;
    private static final byte[] marketSegmentIDHeader = new byte[] {49, 51, 48, 48, (byte) '='};

    private static final int parentMktSegmIDHeaderLength = 5;
    private static final byte[] parentMktSegmIDHeader = new byte[] {49, 51, 50, 53, (byte) '='};

    private final MutableDirectBuffer marketReqID = new UnsafeBuffer();

    private int marketReqIDOffset = 0;

    private int marketReqIDLength = 0;

    public MarketDefinitionRequestEncoder marketReqID(final DirectBuffer value, final int offset, final int length)
    {
        marketReqID.wrap(value);
        marketReqIDOffset = offset;
        marketReqIDLength = length;
        return this;
    }

    public MarketDefinitionRequestEncoder marketReqID(final DirectBuffer value, final int length)
    {
        return marketReqID(value, 0, length);
    }

    public MarketDefinitionRequestEncoder marketReqID(final DirectBuffer value)
    {
        return marketReqID(value, 0, value.capacity());
    }

    public MarketDefinitionRequestEncoder marketReqID(final byte[] value, final int offset, final int length)
    {
        marketReqID.wrap(value);
        marketReqIDOffset = offset;
        marketReqIDLength = length;
        return this;
    }

    public MarketDefinitionRequestEncoder marketReqIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(marketReqID, value, offset, length);
        marketReqIDOffset = offset;
        marketReqIDLength = length;
        return this;
    }

    public MarketDefinitionRequestEncoder marketReqID(final byte[] value, final int length)
    {
        return marketReqID(value, 0, length);
    }

    public MarketDefinitionRequestEncoder marketReqID(final byte[] value)
    {
        return marketReqID(value, 0, value.length);
    }

    public boolean hasMarketReqID()
    {
        return marketReqIDLength > 0;
    }

    public MutableDirectBuffer marketReqID()
    {
        return marketReqID;
    }

    public String marketReqIDAsString()
    {
        return marketReqID.getStringWithoutLengthAscii(marketReqIDOffset, marketReqIDLength);
    }

    public MarketDefinitionRequestEncoder marketReqID(final CharSequence value)
    {
        toBytes(value, marketReqID);
        marketReqIDOffset = 0;
        marketReqIDLength = value.length();
        return this;
    }

    public MarketDefinitionRequestEncoder marketReqID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            marketReqID.wrap(buffer);
            marketReqIDOffset = value.offset();
            marketReqIDLength = value.length();
        }
        return this;
    }

    public MarketDefinitionRequestEncoder marketReqID(final char[] value)
    {
        return marketReqID(value, 0, value.length);
    }

    public MarketDefinitionRequestEncoder marketReqID(final char[] value, final int length)
    {
        return marketReqID(value, 0, length);
    }

    public MarketDefinitionRequestEncoder marketReqID(final char[] value, final int offset, final int length)
    {
        toBytes(value, marketReqID, offset, length);
        marketReqIDOffset = 0;
        marketReqIDLength = length;
        return this;
    }

    private char subscriptionRequestType;

    private boolean hasSubscriptionRequestType;

    public boolean hasSubscriptionRequestType()
    {
        return hasSubscriptionRequestType;
    }

    public MarketDefinitionRequestEncoder subscriptionRequestType(char value)
    {
        subscriptionRequestType = value;
        hasSubscriptionRequestType = true;
        return this;
    }

    public char subscriptionRequestType()
    {
        return subscriptionRequestType;
    }

    public MarketDefinitionRequestEncoder subscriptionRequestType(SubscriptionRequestType value)
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

    private final MutableDirectBuffer marketID = new UnsafeBuffer();

    private int marketIDOffset = 0;

    private int marketIDLength = 0;

    public MarketDefinitionRequestEncoder marketID(final DirectBuffer value, final int offset, final int length)
    {
        marketID.wrap(value);
        marketIDOffset = offset;
        marketIDLength = length;
        return this;
    }

    public MarketDefinitionRequestEncoder marketID(final DirectBuffer value, final int length)
    {
        return marketID(value, 0, length);
    }

    public MarketDefinitionRequestEncoder marketID(final DirectBuffer value)
    {
        return marketID(value, 0, value.capacity());
    }

    public MarketDefinitionRequestEncoder marketID(final byte[] value, final int offset, final int length)
    {
        marketID.wrap(value);
        marketIDOffset = offset;
        marketIDLength = length;
        return this;
    }

    public MarketDefinitionRequestEncoder marketIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(marketID, value, offset, length);
        marketIDOffset = offset;
        marketIDLength = length;
        return this;
    }

    public MarketDefinitionRequestEncoder marketID(final byte[] value, final int length)
    {
        return marketID(value, 0, length);
    }

    public MarketDefinitionRequestEncoder marketID(final byte[] value)
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

    public MarketDefinitionRequestEncoder marketID(final CharSequence value)
    {
        toBytes(value, marketID);
        marketIDOffset = 0;
        marketIDLength = value.length();
        return this;
    }

    public MarketDefinitionRequestEncoder marketID(final AsciiSequenceView value)
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

    public MarketDefinitionRequestEncoder marketID(final char[] value)
    {
        return marketID(value, 0, value.length);
    }

    public MarketDefinitionRequestEncoder marketID(final char[] value, final int length)
    {
        return marketID(value, 0, length);
    }

    public MarketDefinitionRequestEncoder marketID(final char[] value, final int offset, final int length)
    {
        toBytes(value, marketID, offset, length);
        marketIDOffset = 0;
        marketIDLength = length;
        return this;
    }

    private final MutableDirectBuffer marketSegmentID = new UnsafeBuffer();

    private int marketSegmentIDOffset = 0;

    private int marketSegmentIDLength = 0;

    public MarketDefinitionRequestEncoder marketSegmentID(final DirectBuffer value, final int offset, final int length)
    {
        marketSegmentID.wrap(value);
        marketSegmentIDOffset = offset;
        marketSegmentIDLength = length;
        return this;
    }

    public MarketDefinitionRequestEncoder marketSegmentID(final DirectBuffer value, final int length)
    {
        return marketSegmentID(value, 0, length);
    }

    public MarketDefinitionRequestEncoder marketSegmentID(final DirectBuffer value)
    {
        return marketSegmentID(value, 0, value.capacity());
    }

    public MarketDefinitionRequestEncoder marketSegmentID(final byte[] value, final int offset, final int length)
    {
        marketSegmentID.wrap(value);
        marketSegmentIDOffset = offset;
        marketSegmentIDLength = length;
        return this;
    }

    public MarketDefinitionRequestEncoder marketSegmentIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(marketSegmentID, value, offset, length);
        marketSegmentIDOffset = offset;
        marketSegmentIDLength = length;
        return this;
    }

    public MarketDefinitionRequestEncoder marketSegmentID(final byte[] value, final int length)
    {
        return marketSegmentID(value, 0, length);
    }

    public MarketDefinitionRequestEncoder marketSegmentID(final byte[] value)
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

    public MarketDefinitionRequestEncoder marketSegmentID(final CharSequence value)
    {
        toBytes(value, marketSegmentID);
        marketSegmentIDOffset = 0;
        marketSegmentIDLength = value.length();
        return this;
    }

    public MarketDefinitionRequestEncoder marketSegmentID(final AsciiSequenceView value)
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

    public MarketDefinitionRequestEncoder marketSegmentID(final char[] value)
    {
        return marketSegmentID(value, 0, value.length);
    }

    public MarketDefinitionRequestEncoder marketSegmentID(final char[] value, final int length)
    {
        return marketSegmentID(value, 0, length);
    }

    public MarketDefinitionRequestEncoder marketSegmentID(final char[] value, final int offset, final int length)
    {
        toBytes(value, marketSegmentID, offset, length);
        marketSegmentIDOffset = 0;
        marketSegmentIDLength = length;
        return this;
    }

    private final MutableDirectBuffer parentMktSegmID = new UnsafeBuffer();

    private int parentMktSegmIDOffset = 0;

    private int parentMktSegmIDLength = 0;

    public MarketDefinitionRequestEncoder parentMktSegmID(final DirectBuffer value, final int offset, final int length)
    {
        parentMktSegmID.wrap(value);
        parentMktSegmIDOffset = offset;
        parentMktSegmIDLength = length;
        return this;
    }

    public MarketDefinitionRequestEncoder parentMktSegmID(final DirectBuffer value, final int length)
    {
        return parentMktSegmID(value, 0, length);
    }

    public MarketDefinitionRequestEncoder parentMktSegmID(final DirectBuffer value)
    {
        return parentMktSegmID(value, 0, value.capacity());
    }

    public MarketDefinitionRequestEncoder parentMktSegmID(final byte[] value, final int offset, final int length)
    {
        parentMktSegmID.wrap(value);
        parentMktSegmIDOffset = offset;
        parentMktSegmIDLength = length;
        return this;
    }

    public MarketDefinitionRequestEncoder parentMktSegmIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(parentMktSegmID, value, offset, length);
        parentMktSegmIDOffset = offset;
        parentMktSegmIDLength = length;
        return this;
    }

    public MarketDefinitionRequestEncoder parentMktSegmID(final byte[] value, final int length)
    {
        return parentMktSegmID(value, 0, length);
    }

    public MarketDefinitionRequestEncoder parentMktSegmID(final byte[] value)
    {
        return parentMktSegmID(value, 0, value.length);
    }

    public boolean hasParentMktSegmID()
    {
        return parentMktSegmIDLength > 0;
    }

    public MutableDirectBuffer parentMktSegmID()
    {
        return parentMktSegmID;
    }

    public String parentMktSegmIDAsString()
    {
        return parentMktSegmID.getStringWithoutLengthAscii(parentMktSegmIDOffset, parentMktSegmIDLength);
    }

    public MarketDefinitionRequestEncoder parentMktSegmID(final CharSequence value)
    {
        toBytes(value, parentMktSegmID);
        parentMktSegmIDOffset = 0;
        parentMktSegmIDLength = value.length();
        return this;
    }

    public MarketDefinitionRequestEncoder parentMktSegmID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            parentMktSegmID.wrap(buffer);
            parentMktSegmIDOffset = value.offset();
            parentMktSegmIDLength = value.length();
        }
        return this;
    }

    public MarketDefinitionRequestEncoder parentMktSegmID(final char[] value)
    {
        return parentMktSegmID(value, 0, value.length);
    }

    public MarketDefinitionRequestEncoder parentMktSegmID(final char[] value, final int length)
    {
        return parentMktSegmID(value, 0, length);
    }

    public MarketDefinitionRequestEncoder parentMktSegmID(final char[] value, final int offset, final int length)
    {
        toBytes(value, parentMktSegmID, offset, length);
        parentMktSegmIDOffset = 0;
        parentMktSegmIDLength = length;
        return this;
    }

    public long encode(final MutableAsciiBuffer buffer, final int offset)
    {
        final long startMessageResult = header.startMessage(buffer, offset);
        final int bodyStart = Encoder.offset(startMessageResult);
        int position = bodyStart + Encoder.length(startMessageResult);

        if (marketReqIDLength > 0)
        {
            buffer.putBytes(position, marketReqIDHeader, 0, marketReqIDHeaderLength);
            position += marketReqIDHeaderLength;
            buffer.putBytes(position, marketReqID, marketReqIDOffset, marketReqIDLength);
            position += marketReqIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: MarketReqID");
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

        if (marketIDLength > 0)
        {
            buffer.putBytes(position, marketIDHeader, 0, marketIDHeaderLength);
            position += marketIDHeaderLength;
            buffer.putBytes(position, marketID, marketIDOffset, marketIDLength);
            position += marketIDLength;
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

        if (parentMktSegmIDLength > 0)
        {
            buffer.putBytes(position, parentMktSegmIDHeader, 0, parentMktSegmIDHeaderLength);
            position += parentMktSegmIDHeaderLength;
            buffer.putBytes(position, parentMktSegmID, parentMktSegmIDOffset, parentMktSegmIDLength);
            position += parentMktSegmIDLength;
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
        this.resetMarketReqID();
        this.resetSubscriptionRequestType();
        this.resetMarketID();
        this.resetMarketSegmentID();
        this.resetParentMktSegmID();
    }

    public void resetMarketReqID()
    {
        marketReqIDLength = 0;
    }

    public void resetSubscriptionRequestType()
    {
        subscriptionRequestType = MISSING_CHAR;
    }

    public void resetMarketID()
    {
        marketIDLength = 0;
    }

    public void resetMarketSegmentID()
    {
        marketSegmentIDLength = 0;
    }

    public void resetParentMktSegmID()
    {
        parentMktSegmIDLength = 0;
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
        builder.append("\"MessageName\": \"MarketDefinitionRequest\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasMarketReqID())
        {
            indent(builder, level);
            builder.append("\"MarketReqID\": \"");
            appendBuffer(builder, marketReqID, marketReqIDOffset, marketReqIDLength);
            builder.append("\",\n");
        }

        if (hasSubscriptionRequestType())
        {
            indent(builder, level);
            builder.append("\"SubscriptionRequestType\": \"");
            builder.append(subscriptionRequestType);
            builder.append("\",\n");
        }

        if (hasMarketID())
        {
            indent(builder, level);
            builder.append("\"MarketID\": \"");
            appendBuffer(builder, marketID, marketIDOffset, marketIDLength);
            builder.append("\",\n");
        }

        if (hasMarketSegmentID())
        {
            indent(builder, level);
            builder.append("\"MarketSegmentID\": \"");
            appendBuffer(builder, marketSegmentID, marketSegmentIDOffset, marketSegmentIDLength);
            builder.append("\",\n");
        }

        if (hasParentMktSegmID())
        {
            indent(builder, level);
            builder.append("\"ParentMktSegmID\": \"");
            appendBuffer(builder, parentMktSegmID, parentMktSegmIDOffset, parentMktSegmIDLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public MarketDefinitionRequestEncoder copyTo(final Encoder encoder)
    {
        return copyTo((MarketDefinitionRequestEncoder)encoder);
    }

    public MarketDefinitionRequestEncoder copyTo(final MarketDefinitionRequestEncoder encoder)
    {
        encoder.reset();
        if (hasMarketReqID())
        {
            encoder.marketReqIDAsCopy(marketReqID.byteArray(), 0, marketReqIDLength);
        }

        if (hasSubscriptionRequestType())
        {
            encoder.subscriptionRequestType(this.subscriptionRequestType());
        }

        if (hasMarketID())
        {
            encoder.marketIDAsCopy(marketID.byteArray(), 0, marketIDLength);
        }

        if (hasMarketSegmentID())
        {
            encoder.marketSegmentIDAsCopy(marketSegmentID.byteArray(), 0, marketSegmentIDLength);
        }

        if (hasParentMktSegmID())
        {
            encoder.parentMktSegmIDAsCopy(parentMktSegmID.byteArray(), 0, parentMktSegmIDLength);
        }
        return encoder;
    }

}
