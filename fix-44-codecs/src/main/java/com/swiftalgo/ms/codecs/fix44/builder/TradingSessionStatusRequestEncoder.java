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


public class TradingSessionStatusRequestEncoder implements Encoder
{
    public long messageType()
    {
        return 103L;
    }

    public TradingSessionStatusRequestEncoder()
    {
        header.msgType("g");
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

    private static final int tradSesReqIDHeaderLength = 4;
    private static final byte[] tradSesReqIDHeader = new byte[] {51, 51, 53, (byte) '='};

    private static final int tradingSessionIDHeaderLength = 4;
    private static final byte[] tradingSessionIDHeader = new byte[] {51, 51, 54, (byte) '='};

    private static final int tradingSessionSubIDHeaderLength = 4;
    private static final byte[] tradingSessionSubIDHeader = new byte[] {54, 50, 53, (byte) '='};

    private static final int tradSesMethodHeaderLength = 4;
    private static final byte[] tradSesMethodHeader = new byte[] {51, 51, 56, (byte) '='};

    private static final int tradSesModeHeaderLength = 4;
    private static final byte[] tradSesModeHeader = new byte[] {51, 51, 57, (byte) '='};

    private static final int subscriptionRequestTypeHeaderLength = 4;
    private static final byte[] subscriptionRequestTypeHeader = new byte[] {50, 54, 51, (byte) '='};

    private final MutableDirectBuffer tradSesReqID = new UnsafeBuffer();

    private int tradSesReqIDOffset = 0;

    private int tradSesReqIDLength = 0;

    public TradingSessionStatusRequestEncoder tradSesReqID(final DirectBuffer value, final int offset, final int length)
    {
        tradSesReqID.wrap(value);
        tradSesReqIDOffset = offset;
        tradSesReqIDLength = length;
        return this;
    }

    public TradingSessionStatusRequestEncoder tradSesReqID(final DirectBuffer value, final int length)
    {
        return tradSesReqID(value, 0, length);
    }

    public TradingSessionStatusRequestEncoder tradSesReqID(final DirectBuffer value)
    {
        return tradSesReqID(value, 0, value.capacity());
    }

    public TradingSessionStatusRequestEncoder tradSesReqID(final byte[] value, final int offset, final int length)
    {
        tradSesReqID.wrap(value);
        tradSesReqIDOffset = offset;
        tradSesReqIDLength = length;
        return this;
    }

    public TradingSessionStatusRequestEncoder tradSesReqIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradSesReqID, value, offset, length);
        tradSesReqIDOffset = offset;
        tradSesReqIDLength = length;
        return this;
    }

    public TradingSessionStatusRequestEncoder tradSesReqID(final byte[] value, final int length)
    {
        return tradSesReqID(value, 0, length);
    }

    public TradingSessionStatusRequestEncoder tradSesReqID(final byte[] value)
    {
        return tradSesReqID(value, 0, value.length);
    }

    public boolean hasTradSesReqID()
    {
        return tradSesReqIDLength > 0;
    }

    public MutableDirectBuffer tradSesReqID()
    {
        return tradSesReqID;
    }

    public String tradSesReqIDAsString()
    {
        return tradSesReqID.getStringWithoutLengthAscii(tradSesReqIDOffset, tradSesReqIDLength);
    }

    public TradingSessionStatusRequestEncoder tradSesReqID(final CharSequence value)
    {
        toBytes(value, tradSesReqID);
        tradSesReqIDOffset = 0;
        tradSesReqIDLength = value.length();
        return this;
    }

    public TradingSessionStatusRequestEncoder tradSesReqID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            tradSesReqID.wrap(buffer);
            tradSesReqIDOffset = value.offset();
            tradSesReqIDLength = value.length();
        }
        return this;
    }

    public TradingSessionStatusRequestEncoder tradSesReqID(final char[] value)
    {
        return tradSesReqID(value, 0, value.length);
    }

    public TradingSessionStatusRequestEncoder tradSesReqID(final char[] value, final int length)
    {
        return tradSesReqID(value, 0, length);
    }

    public TradingSessionStatusRequestEncoder tradSesReqID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradSesReqID, offset, length);
        tradSesReqIDOffset = 0;
        tradSesReqIDLength = length;
        return this;
    }

    private final MutableDirectBuffer tradingSessionID = new UnsafeBuffer();

    private int tradingSessionIDOffset = 0;

    private int tradingSessionIDLength = 0;

    public TradingSessionStatusRequestEncoder tradingSessionID(final DirectBuffer value, final int offset, final int length)
    {
        tradingSessionID.wrap(value);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public TradingSessionStatusRequestEncoder tradingSessionID(final DirectBuffer value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public TradingSessionStatusRequestEncoder tradingSessionID(final DirectBuffer value)
    {
        return tradingSessionID(value, 0, value.capacity());
    }

    public TradingSessionStatusRequestEncoder tradingSessionID(final byte[] value, final int offset, final int length)
    {
        tradingSessionID.wrap(value);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public TradingSessionStatusRequestEncoder tradingSessionIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradingSessionID, value, offset, length);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public TradingSessionStatusRequestEncoder tradingSessionID(final byte[] value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public TradingSessionStatusRequestEncoder tradingSessionID(final byte[] value)
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

    public TradingSessionStatusRequestEncoder tradingSessionID(final CharSequence value)
    {
        toBytes(value, tradingSessionID);
        tradingSessionIDOffset = 0;
        tradingSessionIDLength = value.length();
        return this;
    }

    public TradingSessionStatusRequestEncoder tradingSessionID(final AsciiSequenceView value)
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

    public TradingSessionStatusRequestEncoder tradingSessionID(final char[] value)
    {
        return tradingSessionID(value, 0, value.length);
    }

    public TradingSessionStatusRequestEncoder tradingSessionID(final char[] value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public TradingSessionStatusRequestEncoder tradingSessionID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradingSessionID, offset, length);
        tradingSessionIDOffset = 0;
        tradingSessionIDLength = length;
        return this;
    }

    private final MutableDirectBuffer tradingSessionSubID = new UnsafeBuffer();

    private int tradingSessionSubIDOffset = 0;

    private int tradingSessionSubIDLength = 0;

    public TradingSessionStatusRequestEncoder tradingSessionSubID(final DirectBuffer value, final int offset, final int length)
    {
        tradingSessionSubID.wrap(value);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public TradingSessionStatusRequestEncoder tradingSessionSubID(final DirectBuffer value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public TradingSessionStatusRequestEncoder tradingSessionSubID(final DirectBuffer value)
    {
        return tradingSessionSubID(value, 0, value.capacity());
    }

    public TradingSessionStatusRequestEncoder tradingSessionSubID(final byte[] value, final int offset, final int length)
    {
        tradingSessionSubID.wrap(value);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public TradingSessionStatusRequestEncoder tradingSessionSubIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradingSessionSubID, value, offset, length);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public TradingSessionStatusRequestEncoder tradingSessionSubID(final byte[] value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public TradingSessionStatusRequestEncoder tradingSessionSubID(final byte[] value)
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

    public TradingSessionStatusRequestEncoder tradingSessionSubID(final CharSequence value)
    {
        toBytes(value, tradingSessionSubID);
        tradingSessionSubIDOffset = 0;
        tradingSessionSubIDLength = value.length();
        return this;
    }

    public TradingSessionStatusRequestEncoder tradingSessionSubID(final AsciiSequenceView value)
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

    public TradingSessionStatusRequestEncoder tradingSessionSubID(final char[] value)
    {
        return tradingSessionSubID(value, 0, value.length);
    }

    public TradingSessionStatusRequestEncoder tradingSessionSubID(final char[] value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public TradingSessionStatusRequestEncoder tradingSessionSubID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradingSessionSubID, offset, length);
        tradingSessionSubIDOffset = 0;
        tradingSessionSubIDLength = length;
        return this;
    }

    private int tradSesMethod;

    private boolean hasTradSesMethod;

    public boolean hasTradSesMethod()
    {
        return hasTradSesMethod;
    }

    public TradingSessionStatusRequestEncoder tradSesMethod(int value)
    {
        tradSesMethod = value;
        hasTradSesMethod = true;
        return this;
    }

    public int tradSesMethod()
    {
        return tradSesMethod;
    }

    public TradingSessionStatusRequestEncoder tradSesMethod(TradSesMethod value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == TradSesMethod.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: tradSesMethod Value: " + value );
            }
            if (value == TradSesMethod.NULL_VAL)
            {
                return this;
            }
        }
        return tradSesMethod(value.representation());
    }

    private int tradSesMode;

    private boolean hasTradSesMode;

    public boolean hasTradSesMode()
    {
        return hasTradSesMode;
    }

    public TradingSessionStatusRequestEncoder tradSesMode(int value)
    {
        tradSesMode = value;
        hasTradSesMode = true;
        return this;
    }

    public int tradSesMode()
    {
        return tradSesMode;
    }

    public TradingSessionStatusRequestEncoder tradSesMode(TradSesMode value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == TradSesMode.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: tradSesMode Value: " + value );
            }
            if (value == TradSesMode.NULL_VAL)
            {
                return this;
            }
        }
        return tradSesMode(value.representation());
    }

    private char subscriptionRequestType;

    private boolean hasSubscriptionRequestType;

    public boolean hasSubscriptionRequestType()
    {
        return hasSubscriptionRequestType;
    }

    public TradingSessionStatusRequestEncoder subscriptionRequestType(char value)
    {
        subscriptionRequestType = value;
        hasSubscriptionRequestType = true;
        return this;
    }

    public char subscriptionRequestType()
    {
        return subscriptionRequestType;
    }

    public TradingSessionStatusRequestEncoder subscriptionRequestType(SubscriptionRequestType value)
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

    public long encode(final MutableAsciiBuffer buffer, final int offset)
    {
        final long startMessageResult = header.startMessage(buffer, offset);
        final int bodyStart = Encoder.offset(startMessageResult);
        int position = bodyStart + Encoder.length(startMessageResult);

        if (tradSesReqIDLength > 0)
        {
            buffer.putBytes(position, tradSesReqIDHeader, 0, tradSesReqIDHeaderLength);
            position += tradSesReqIDHeaderLength;
            buffer.putBytes(position, tradSesReqID, tradSesReqIDOffset, tradSesReqIDLength);
            position += tradSesReqIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: TradSesReqID");
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

        if (hasTradSesMethod)
        {
            buffer.putBytes(position, tradSesMethodHeader, 0, tradSesMethodHeaderLength);
            position += tradSesMethodHeaderLength;
            position += buffer.putIntAscii(position, tradSesMethod);
            buffer.putSeparator(position);
            position++;
        }

        if (hasTradSesMode)
        {
            buffer.putBytes(position, tradSesModeHeader, 0, tradSesModeHeaderLength);
            position += tradSesModeHeaderLength;
            position += buffer.putIntAscii(position, tradSesMode);
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
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: SubscriptionRequestType");
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
        this.resetTradSesReqID();
        this.resetTradingSessionID();
        this.resetTradingSessionSubID();
        this.resetTradSesMethod();
        this.resetTradSesMode();
        this.resetSubscriptionRequestType();
    }

    public void resetTradSesReqID()
    {
        tradSesReqIDLength = 0;
    }

    public void resetTradingSessionID()
    {
        tradingSessionIDLength = 0;
    }

    public void resetTradingSessionSubID()
    {
        tradingSessionSubIDLength = 0;
    }

    public void resetTradSesMethod()
    {
        hasTradSesMethod = false;
    }

    public void resetTradSesMode()
    {
        hasTradSesMode = false;
    }

    public void resetSubscriptionRequestType()
    {
        subscriptionRequestType = MISSING_CHAR;
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
        builder.append("\"MessageName\": \"TradingSessionStatusRequest\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasTradSesReqID())
        {
            indent(builder, level);
            builder.append("\"TradSesReqID\": \"");
            appendBuffer(builder, tradSesReqID, tradSesReqIDOffset, tradSesReqIDLength);
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

        if (hasTradSesMethod())
        {
            indent(builder, level);
            builder.append("\"TradSesMethod\": \"");
            builder.append(tradSesMethod);
            builder.append("\",\n");
        }

        if (hasTradSesMode())
        {
            indent(builder, level);
            builder.append("\"TradSesMode\": \"");
            builder.append(tradSesMode);
            builder.append("\",\n");
        }

        if (hasSubscriptionRequestType())
        {
            indent(builder, level);
            builder.append("\"SubscriptionRequestType\": \"");
            builder.append(subscriptionRequestType);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public TradingSessionStatusRequestEncoder copyTo(final Encoder encoder)
    {
        return copyTo((TradingSessionStatusRequestEncoder)encoder);
    }

    public TradingSessionStatusRequestEncoder copyTo(final TradingSessionStatusRequestEncoder encoder)
    {
        encoder.reset();
        if (hasTradSesReqID())
        {
            encoder.tradSesReqIDAsCopy(tradSesReqID.byteArray(), 0, tradSesReqIDLength);
        }

        if (hasTradingSessionID())
        {
            encoder.tradingSessionIDAsCopy(tradingSessionID.byteArray(), 0, tradingSessionIDLength);
        }

        if (hasTradingSessionSubID())
        {
            encoder.tradingSessionSubIDAsCopy(tradingSessionSubID.byteArray(), 0, tradingSessionSubIDLength);
        }

        if (hasTradSesMethod())
        {
            encoder.tradSesMethod(this.tradSesMethod());
        }

        if (hasTradSesMode())
        {
            encoder.tradSesMode(this.tradSesMode());
        }

        if (hasSubscriptionRequestType())
        {
            encoder.subscriptionRequestType(this.subscriptionRequestType());
        }
        return encoder;
    }

}
