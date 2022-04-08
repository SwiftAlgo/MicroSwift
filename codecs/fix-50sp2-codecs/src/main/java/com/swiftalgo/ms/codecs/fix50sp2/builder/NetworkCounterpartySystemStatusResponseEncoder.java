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


public class NetworkCounterpartySystemStatusResponseEncoder implements Encoder
{
    public long messageType()
    {
        return 17474L;
    }

    public NetworkCounterpartySystemStatusResponseEncoder()
    {
        header.msgType("BD");
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

    private static final int networkStatusResponseTypeHeaderLength = 4;
    private static final byte[] networkStatusResponseTypeHeader = new byte[] {57, 51, 55, (byte) '='};

    private static final int networkRequestIDHeaderLength = 4;
    private static final byte[] networkRequestIDHeader = new byte[] {57, 51, 51, (byte) '='};

    private static final int networkResponseIDHeaderLength = 4;
    private static final byte[] networkResponseIDHeader = new byte[] {57, 51, 50, (byte) '='};

    private static final int lastNetworkResponseIDHeaderLength = 4;
    private static final byte[] lastNetworkResponseIDHeader = new byte[] {57, 51, 52, (byte) '='};

    private int networkStatusResponseType;

    private boolean hasNetworkStatusResponseType;

    public boolean hasNetworkStatusResponseType()
    {
        return hasNetworkStatusResponseType;
    }

    public NetworkCounterpartySystemStatusResponseEncoder networkStatusResponseType(int value)
    {
        networkStatusResponseType = value;
        hasNetworkStatusResponseType = true;
        return this;
    }

    public int networkStatusResponseType()
    {
        return networkStatusResponseType;
    }

    public NetworkCounterpartySystemStatusResponseEncoder networkStatusResponseType(NetworkStatusResponseType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == NetworkStatusResponseType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: networkStatusResponseType Value: " + value );
            }
            if (value == NetworkStatusResponseType.NULL_VAL)
            {
                return this;
            }
        }
        return networkStatusResponseType(value.representation());
    }

    private final MutableDirectBuffer networkRequestID = new UnsafeBuffer();

    private int networkRequestIDOffset = 0;

    private int networkRequestIDLength = 0;

    public NetworkCounterpartySystemStatusResponseEncoder networkRequestID(final DirectBuffer value, final int offset, final int length)
    {
        networkRequestID.wrap(value);
        networkRequestIDOffset = offset;
        networkRequestIDLength = length;
        return this;
    }

    public NetworkCounterpartySystemStatusResponseEncoder networkRequestID(final DirectBuffer value, final int length)
    {
        return networkRequestID(value, 0, length);
    }

    public NetworkCounterpartySystemStatusResponseEncoder networkRequestID(final DirectBuffer value)
    {
        return networkRequestID(value, 0, value.capacity());
    }

    public NetworkCounterpartySystemStatusResponseEncoder networkRequestID(final byte[] value, final int offset, final int length)
    {
        networkRequestID.wrap(value);
        networkRequestIDOffset = offset;
        networkRequestIDLength = length;
        return this;
    }

    public NetworkCounterpartySystemStatusResponseEncoder networkRequestIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(networkRequestID, value, offset, length);
        networkRequestIDOffset = offset;
        networkRequestIDLength = length;
        return this;
    }

    public NetworkCounterpartySystemStatusResponseEncoder networkRequestID(final byte[] value, final int length)
    {
        return networkRequestID(value, 0, length);
    }

    public NetworkCounterpartySystemStatusResponseEncoder networkRequestID(final byte[] value)
    {
        return networkRequestID(value, 0, value.length);
    }

    public boolean hasNetworkRequestID()
    {
        return networkRequestIDLength > 0;
    }

    public MutableDirectBuffer networkRequestID()
    {
        return networkRequestID;
    }

    public String networkRequestIDAsString()
    {
        return networkRequestID.getStringWithoutLengthAscii(networkRequestIDOffset, networkRequestIDLength);
    }

    public NetworkCounterpartySystemStatusResponseEncoder networkRequestID(final CharSequence value)
    {
        toBytes(value, networkRequestID);
        networkRequestIDOffset = 0;
        networkRequestIDLength = value.length();
        return this;
    }

    public NetworkCounterpartySystemStatusResponseEncoder networkRequestID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            networkRequestID.wrap(buffer);
            networkRequestIDOffset = value.offset();
            networkRequestIDLength = value.length();
        }
        return this;
    }

    public NetworkCounterpartySystemStatusResponseEncoder networkRequestID(final char[] value)
    {
        return networkRequestID(value, 0, value.length);
    }

    public NetworkCounterpartySystemStatusResponseEncoder networkRequestID(final char[] value, final int length)
    {
        return networkRequestID(value, 0, length);
    }

    public NetworkCounterpartySystemStatusResponseEncoder networkRequestID(final char[] value, final int offset, final int length)
    {
        toBytes(value, networkRequestID, offset, length);
        networkRequestIDOffset = 0;
        networkRequestIDLength = length;
        return this;
    }

    private final MutableDirectBuffer networkResponseID = new UnsafeBuffer();

    private int networkResponseIDOffset = 0;

    private int networkResponseIDLength = 0;

    public NetworkCounterpartySystemStatusResponseEncoder networkResponseID(final DirectBuffer value, final int offset, final int length)
    {
        networkResponseID.wrap(value);
        networkResponseIDOffset = offset;
        networkResponseIDLength = length;
        return this;
    }

    public NetworkCounterpartySystemStatusResponseEncoder networkResponseID(final DirectBuffer value, final int length)
    {
        return networkResponseID(value, 0, length);
    }

    public NetworkCounterpartySystemStatusResponseEncoder networkResponseID(final DirectBuffer value)
    {
        return networkResponseID(value, 0, value.capacity());
    }

    public NetworkCounterpartySystemStatusResponseEncoder networkResponseID(final byte[] value, final int offset, final int length)
    {
        networkResponseID.wrap(value);
        networkResponseIDOffset = offset;
        networkResponseIDLength = length;
        return this;
    }

    public NetworkCounterpartySystemStatusResponseEncoder networkResponseIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(networkResponseID, value, offset, length);
        networkResponseIDOffset = offset;
        networkResponseIDLength = length;
        return this;
    }

    public NetworkCounterpartySystemStatusResponseEncoder networkResponseID(final byte[] value, final int length)
    {
        return networkResponseID(value, 0, length);
    }

    public NetworkCounterpartySystemStatusResponseEncoder networkResponseID(final byte[] value)
    {
        return networkResponseID(value, 0, value.length);
    }

    public boolean hasNetworkResponseID()
    {
        return networkResponseIDLength > 0;
    }

    public MutableDirectBuffer networkResponseID()
    {
        return networkResponseID;
    }

    public String networkResponseIDAsString()
    {
        return networkResponseID.getStringWithoutLengthAscii(networkResponseIDOffset, networkResponseIDLength);
    }

    public NetworkCounterpartySystemStatusResponseEncoder networkResponseID(final CharSequence value)
    {
        toBytes(value, networkResponseID);
        networkResponseIDOffset = 0;
        networkResponseIDLength = value.length();
        return this;
    }

    public NetworkCounterpartySystemStatusResponseEncoder networkResponseID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            networkResponseID.wrap(buffer);
            networkResponseIDOffset = value.offset();
            networkResponseIDLength = value.length();
        }
        return this;
    }

    public NetworkCounterpartySystemStatusResponseEncoder networkResponseID(final char[] value)
    {
        return networkResponseID(value, 0, value.length);
    }

    public NetworkCounterpartySystemStatusResponseEncoder networkResponseID(final char[] value, final int length)
    {
        return networkResponseID(value, 0, length);
    }

    public NetworkCounterpartySystemStatusResponseEncoder networkResponseID(final char[] value, final int offset, final int length)
    {
        toBytes(value, networkResponseID, offset, length);
        networkResponseIDOffset = 0;
        networkResponseIDLength = length;
        return this;
    }

    private final MutableDirectBuffer lastNetworkResponseID = new UnsafeBuffer();

    private int lastNetworkResponseIDOffset = 0;

    private int lastNetworkResponseIDLength = 0;

    public NetworkCounterpartySystemStatusResponseEncoder lastNetworkResponseID(final DirectBuffer value, final int offset, final int length)
    {
        lastNetworkResponseID.wrap(value);
        lastNetworkResponseIDOffset = offset;
        lastNetworkResponseIDLength = length;
        return this;
    }

    public NetworkCounterpartySystemStatusResponseEncoder lastNetworkResponseID(final DirectBuffer value, final int length)
    {
        return lastNetworkResponseID(value, 0, length);
    }

    public NetworkCounterpartySystemStatusResponseEncoder lastNetworkResponseID(final DirectBuffer value)
    {
        return lastNetworkResponseID(value, 0, value.capacity());
    }

    public NetworkCounterpartySystemStatusResponseEncoder lastNetworkResponseID(final byte[] value, final int offset, final int length)
    {
        lastNetworkResponseID.wrap(value);
        lastNetworkResponseIDOffset = offset;
        lastNetworkResponseIDLength = length;
        return this;
    }

    public NetworkCounterpartySystemStatusResponseEncoder lastNetworkResponseIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(lastNetworkResponseID, value, offset, length);
        lastNetworkResponseIDOffset = offset;
        lastNetworkResponseIDLength = length;
        return this;
    }

    public NetworkCounterpartySystemStatusResponseEncoder lastNetworkResponseID(final byte[] value, final int length)
    {
        return lastNetworkResponseID(value, 0, length);
    }

    public NetworkCounterpartySystemStatusResponseEncoder lastNetworkResponseID(final byte[] value)
    {
        return lastNetworkResponseID(value, 0, value.length);
    }

    public boolean hasLastNetworkResponseID()
    {
        return lastNetworkResponseIDLength > 0;
    }

    public MutableDirectBuffer lastNetworkResponseID()
    {
        return lastNetworkResponseID;
    }

    public String lastNetworkResponseIDAsString()
    {
        return lastNetworkResponseID.getStringWithoutLengthAscii(lastNetworkResponseIDOffset, lastNetworkResponseIDLength);
    }

    public NetworkCounterpartySystemStatusResponseEncoder lastNetworkResponseID(final CharSequence value)
    {
        toBytes(value, lastNetworkResponseID);
        lastNetworkResponseIDOffset = 0;
        lastNetworkResponseIDLength = value.length();
        return this;
    }

    public NetworkCounterpartySystemStatusResponseEncoder lastNetworkResponseID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            lastNetworkResponseID.wrap(buffer);
            lastNetworkResponseIDOffset = value.offset();
            lastNetworkResponseIDLength = value.length();
        }
        return this;
    }

    public NetworkCounterpartySystemStatusResponseEncoder lastNetworkResponseID(final char[] value)
    {
        return lastNetworkResponseID(value, 0, value.length);
    }

    public NetworkCounterpartySystemStatusResponseEncoder lastNetworkResponseID(final char[] value, final int length)
    {
        return lastNetworkResponseID(value, 0, length);
    }

    public NetworkCounterpartySystemStatusResponseEncoder lastNetworkResponseID(final char[] value, final int offset, final int length)
    {
        toBytes(value, lastNetworkResponseID, offset, length);
        lastNetworkResponseIDOffset = 0;
        lastNetworkResponseIDLength = length;
        return this;
    }

    private final CompIDStatGrpEncoder compIDStatGrp = new CompIDStatGrpEncoder();
    public CompIDStatGrpEncoder compIDStatGrp()
    {
        return compIDStatGrp;
    }

    public long encode(final MutableAsciiBuffer buffer, final int offset)
    {
        final long startMessageResult = header.startMessage(buffer, offset);
        final int bodyStart = Encoder.offset(startMessageResult);
        int position = bodyStart + Encoder.length(startMessageResult);

        if (hasNetworkStatusResponseType)
        {
            buffer.putBytes(position, networkStatusResponseTypeHeader, 0, networkStatusResponseTypeHeaderLength);
            position += networkStatusResponseTypeHeaderLength;
            position += buffer.putIntAscii(position, networkStatusResponseType);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: NetworkStatusResponseType");
        }

        if (networkRequestIDLength > 0)
        {
            buffer.putBytes(position, networkRequestIDHeader, 0, networkRequestIDHeaderLength);
            position += networkRequestIDHeaderLength;
            buffer.putBytes(position, networkRequestID, networkRequestIDOffset, networkRequestIDLength);
            position += networkRequestIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (networkResponseIDLength > 0)
        {
            buffer.putBytes(position, networkResponseIDHeader, 0, networkResponseIDHeaderLength);
            position += networkResponseIDHeaderLength;
            buffer.putBytes(position, networkResponseID, networkResponseIDOffset, networkResponseIDLength);
            position += networkResponseIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: NetworkResponseID");
        }

        if (lastNetworkResponseIDLength > 0)
        {
            buffer.putBytes(position, lastNetworkResponseIDHeader, 0, lastNetworkResponseIDHeaderLength);
            position += lastNetworkResponseIDHeaderLength;
            buffer.putBytes(position, lastNetworkResponseID, lastNetworkResponseIDOffset, lastNetworkResponseIDLength);
            position += lastNetworkResponseIDLength;
            buffer.putSeparator(position);
            position++;
        }

            position += compIDStatGrp.encode(buffer, position);
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
        this.resetNetworkStatusResponseType();
        this.resetNetworkRequestID();
        this.resetNetworkResponseID();
        this.resetLastNetworkResponseID();
        compIDStatGrp.reset();
    }

    public void resetNetworkStatusResponseType()
    {
        hasNetworkStatusResponseType = false;
    }

    public void resetNetworkRequestID()
    {
        networkRequestIDLength = 0;
    }

    public void resetNetworkResponseID()
    {
        networkResponseIDLength = 0;
    }

    public void resetLastNetworkResponseID()
    {
        lastNetworkResponseIDLength = 0;
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
        builder.append("\"MessageName\": \"NetworkCounterpartySystemStatusResponse\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasNetworkStatusResponseType())
        {
            indent(builder, level);
            builder.append("\"NetworkStatusResponseType\": \"");
            builder.append(networkStatusResponseType);
            builder.append("\",\n");
        }

        if (hasNetworkRequestID())
        {
            indent(builder, level);
            builder.append("\"NetworkRequestID\": \"");
            appendBuffer(builder, networkRequestID, networkRequestIDOffset, networkRequestIDLength);
            builder.append("\",\n");
        }

        if (hasNetworkResponseID())
        {
            indent(builder, level);
            builder.append("\"NetworkResponseID\": \"");
            appendBuffer(builder, networkResponseID, networkResponseIDOffset, networkResponseIDLength);
            builder.append("\",\n");
        }

        if (hasLastNetworkResponseID())
        {
            indent(builder, level);
            builder.append("\"LastNetworkResponseID\": \"");
            appendBuffer(builder, lastNetworkResponseID, lastNetworkResponseIDOffset, lastNetworkResponseIDLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"CompIDStatGrp\": ");
    compIDStatGrp.appendTo(builder, level + 1);
    builder.append("\n");
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public NetworkCounterpartySystemStatusResponseEncoder copyTo(final Encoder encoder)
    {
        return copyTo((NetworkCounterpartySystemStatusResponseEncoder)encoder);
    }

    public NetworkCounterpartySystemStatusResponseEncoder copyTo(final NetworkCounterpartySystemStatusResponseEncoder encoder)
    {
        encoder.reset();
        if (hasNetworkStatusResponseType())
        {
            encoder.networkStatusResponseType(this.networkStatusResponseType());
        }

        if (hasNetworkRequestID())
        {
            encoder.networkRequestIDAsCopy(networkRequestID.byteArray(), 0, networkRequestIDLength);
        }

        if (hasNetworkResponseID())
        {
            encoder.networkResponseIDAsCopy(networkResponseID.byteArray(), 0, networkResponseIDLength);
        }

        if (hasLastNetworkResponseID())
        {
            encoder.lastNetworkResponseIDAsCopy(lastNetworkResponseID.byteArray(), 0, lastNetworkResponseIDLength);
        }


        compIDStatGrp.copyTo(encoder.compIDStatGrp());        return encoder;
    }

}
