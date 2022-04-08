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


public class NetworkCounterpartySystemStatusRequestEncoder implements Encoder
{
    public long messageType()
    {
        return 17218L;
    }

    public NetworkCounterpartySystemStatusRequestEncoder()
    {
        header.msgType("BC");
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

    private static final int networkRequestTypeHeaderLength = 4;
    private static final byte[] networkRequestTypeHeader = new byte[] {57, 51, 53, (byte) '='};

    private static final int networkRequestIDHeaderLength = 4;
    private static final byte[] networkRequestIDHeader = new byte[] {57, 51, 51, (byte) '='};

    private int networkRequestType;

    private boolean hasNetworkRequestType;

    public boolean hasNetworkRequestType()
    {
        return hasNetworkRequestType;
    }

    public NetworkCounterpartySystemStatusRequestEncoder networkRequestType(int value)
    {
        networkRequestType = value;
        hasNetworkRequestType = true;
        return this;
    }

    public int networkRequestType()
    {
        return networkRequestType;
    }

    public NetworkCounterpartySystemStatusRequestEncoder networkRequestType(NetworkRequestType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == NetworkRequestType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: networkRequestType Value: " + value );
            }
            if (value == NetworkRequestType.NULL_VAL)
            {
                return this;
            }
        }
        return networkRequestType(value.representation());
    }

    private final MutableDirectBuffer networkRequestID = new UnsafeBuffer();

    private int networkRequestIDOffset = 0;

    private int networkRequestIDLength = 0;

    public NetworkCounterpartySystemStatusRequestEncoder networkRequestID(final DirectBuffer value, final int offset, final int length)
    {
        networkRequestID.wrap(value);
        networkRequestIDOffset = offset;
        networkRequestIDLength = length;
        return this;
    }

    public NetworkCounterpartySystemStatusRequestEncoder networkRequestID(final DirectBuffer value, final int length)
    {
        return networkRequestID(value, 0, length);
    }

    public NetworkCounterpartySystemStatusRequestEncoder networkRequestID(final DirectBuffer value)
    {
        return networkRequestID(value, 0, value.capacity());
    }

    public NetworkCounterpartySystemStatusRequestEncoder networkRequestID(final byte[] value, final int offset, final int length)
    {
        networkRequestID.wrap(value);
        networkRequestIDOffset = offset;
        networkRequestIDLength = length;
        return this;
    }

    public NetworkCounterpartySystemStatusRequestEncoder networkRequestIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(networkRequestID, value, offset, length);
        networkRequestIDOffset = offset;
        networkRequestIDLength = length;
        return this;
    }

    public NetworkCounterpartySystemStatusRequestEncoder networkRequestID(final byte[] value, final int length)
    {
        return networkRequestID(value, 0, length);
    }

    public NetworkCounterpartySystemStatusRequestEncoder networkRequestID(final byte[] value)
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

    public NetworkCounterpartySystemStatusRequestEncoder networkRequestID(final CharSequence value)
    {
        toBytes(value, networkRequestID);
        networkRequestIDOffset = 0;
        networkRequestIDLength = value.length();
        return this;
    }

    public NetworkCounterpartySystemStatusRequestEncoder networkRequestID(final AsciiSequenceView value)
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

    public NetworkCounterpartySystemStatusRequestEncoder networkRequestID(final char[] value)
    {
        return networkRequestID(value, 0, value.length);
    }

    public NetworkCounterpartySystemStatusRequestEncoder networkRequestID(final char[] value, final int length)
    {
        return networkRequestID(value, 0, length);
    }

    public NetworkCounterpartySystemStatusRequestEncoder networkRequestID(final char[] value, final int offset, final int length)
    {
        toBytes(value, networkRequestID, offset, length);
        networkRequestIDOffset = 0;
        networkRequestIDLength = length;
        return this;
    }

    private final CompIDReqGrpEncoder compIDReqGrp = new CompIDReqGrpEncoder();
    public CompIDReqGrpEncoder compIDReqGrp()
    {
        return compIDReqGrp;
    }

    public long encode(final MutableAsciiBuffer buffer, final int offset)
    {
        final long startMessageResult = header.startMessage(buffer, offset);
        final int bodyStart = Encoder.offset(startMessageResult);
        int position = bodyStart + Encoder.length(startMessageResult);

        if (hasNetworkRequestType)
        {
            buffer.putBytes(position, networkRequestTypeHeader, 0, networkRequestTypeHeaderLength);
            position += networkRequestTypeHeaderLength;
            position += buffer.putIntAscii(position, networkRequestType);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: NetworkRequestType");
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
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: NetworkRequestID");
        }

            position += compIDReqGrp.encode(buffer, position);
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
        this.resetNetworkRequestType();
        this.resetNetworkRequestID();
        compIDReqGrp.reset();
    }

    public void resetNetworkRequestType()
    {
        hasNetworkRequestType = false;
    }

    public void resetNetworkRequestID()
    {
        networkRequestIDLength = 0;
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
        builder.append("\"MessageName\": \"NetworkCounterpartySystemStatusRequest\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasNetworkRequestType())
        {
            indent(builder, level);
            builder.append("\"NetworkRequestType\": \"");
            builder.append(networkRequestType);
            builder.append("\",\n");
        }

        if (hasNetworkRequestID())
        {
            indent(builder, level);
            builder.append("\"NetworkRequestID\": \"");
            appendBuffer(builder, networkRequestID, networkRequestIDOffset, networkRequestIDLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"CompIDReqGrp\": ");
    compIDReqGrp.appendTo(builder, level + 1);
    builder.append("\n");
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public NetworkCounterpartySystemStatusRequestEncoder copyTo(final Encoder encoder)
    {
        return copyTo((NetworkCounterpartySystemStatusRequestEncoder)encoder);
    }

    public NetworkCounterpartySystemStatusRequestEncoder copyTo(final NetworkCounterpartySystemStatusRequestEncoder encoder)
    {
        encoder.reset();
        if (hasNetworkRequestType())
        {
            encoder.networkRequestType(this.networkRequestType());
        }

        if (hasNetworkRequestID())
        {
            encoder.networkRequestIDAsCopy(networkRequestID.byteArray(), 0, networkRequestIDLength);
        }


        compIDReqGrp.copyTo(encoder.compIDReqGrp());        return encoder;
    }

}
