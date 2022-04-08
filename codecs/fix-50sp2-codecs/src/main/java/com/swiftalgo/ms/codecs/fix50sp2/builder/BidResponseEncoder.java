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


public class BidResponseEncoder implements Encoder
{
    public long messageType()
    {
        return 108L;
    }

    public BidResponseEncoder()
    {
        header.msgType("l");
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

    private static final int bidIDHeaderLength = 4;
    private static final byte[] bidIDHeader = new byte[] {51, 57, 48, (byte) '='};

    private static final int clientBidIDHeaderLength = 4;
    private static final byte[] clientBidIDHeader = new byte[] {51, 57, 49, (byte) '='};

    private final MutableDirectBuffer bidID = new UnsafeBuffer();

    private int bidIDOffset = 0;

    private int bidIDLength = 0;

    public BidResponseEncoder bidID(final DirectBuffer value, final int offset, final int length)
    {
        bidID.wrap(value);
        bidIDOffset = offset;
        bidIDLength = length;
        return this;
    }

    public BidResponseEncoder bidID(final DirectBuffer value, final int length)
    {
        return bidID(value, 0, length);
    }

    public BidResponseEncoder bidID(final DirectBuffer value)
    {
        return bidID(value, 0, value.capacity());
    }

    public BidResponseEncoder bidID(final byte[] value, final int offset, final int length)
    {
        bidID.wrap(value);
        bidIDOffset = offset;
        bidIDLength = length;
        return this;
    }

    public BidResponseEncoder bidIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(bidID, value, offset, length);
        bidIDOffset = offset;
        bidIDLength = length;
        return this;
    }

    public BidResponseEncoder bidID(final byte[] value, final int length)
    {
        return bidID(value, 0, length);
    }

    public BidResponseEncoder bidID(final byte[] value)
    {
        return bidID(value, 0, value.length);
    }

    public boolean hasBidID()
    {
        return bidIDLength > 0;
    }

    public MutableDirectBuffer bidID()
    {
        return bidID;
    }

    public String bidIDAsString()
    {
        return bidID.getStringWithoutLengthAscii(bidIDOffset, bidIDLength);
    }

    public BidResponseEncoder bidID(final CharSequence value)
    {
        toBytes(value, bidID);
        bidIDOffset = 0;
        bidIDLength = value.length();
        return this;
    }

    public BidResponseEncoder bidID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            bidID.wrap(buffer);
            bidIDOffset = value.offset();
            bidIDLength = value.length();
        }
        return this;
    }

    public BidResponseEncoder bidID(final char[] value)
    {
        return bidID(value, 0, value.length);
    }

    public BidResponseEncoder bidID(final char[] value, final int length)
    {
        return bidID(value, 0, length);
    }

    public BidResponseEncoder bidID(final char[] value, final int offset, final int length)
    {
        toBytes(value, bidID, offset, length);
        bidIDOffset = 0;
        bidIDLength = length;
        return this;
    }

    private final MutableDirectBuffer clientBidID = new UnsafeBuffer();

    private int clientBidIDOffset = 0;

    private int clientBidIDLength = 0;

    public BidResponseEncoder clientBidID(final DirectBuffer value, final int offset, final int length)
    {
        clientBidID.wrap(value);
        clientBidIDOffset = offset;
        clientBidIDLength = length;
        return this;
    }

    public BidResponseEncoder clientBidID(final DirectBuffer value, final int length)
    {
        return clientBidID(value, 0, length);
    }

    public BidResponseEncoder clientBidID(final DirectBuffer value)
    {
        return clientBidID(value, 0, value.capacity());
    }

    public BidResponseEncoder clientBidID(final byte[] value, final int offset, final int length)
    {
        clientBidID.wrap(value);
        clientBidIDOffset = offset;
        clientBidIDLength = length;
        return this;
    }

    public BidResponseEncoder clientBidIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(clientBidID, value, offset, length);
        clientBidIDOffset = offset;
        clientBidIDLength = length;
        return this;
    }

    public BidResponseEncoder clientBidID(final byte[] value, final int length)
    {
        return clientBidID(value, 0, length);
    }

    public BidResponseEncoder clientBidID(final byte[] value)
    {
        return clientBidID(value, 0, value.length);
    }

    public boolean hasClientBidID()
    {
        return clientBidIDLength > 0;
    }

    public MutableDirectBuffer clientBidID()
    {
        return clientBidID;
    }

    public String clientBidIDAsString()
    {
        return clientBidID.getStringWithoutLengthAscii(clientBidIDOffset, clientBidIDLength);
    }

    public BidResponseEncoder clientBidID(final CharSequence value)
    {
        toBytes(value, clientBidID);
        clientBidIDOffset = 0;
        clientBidIDLength = value.length();
        return this;
    }

    public BidResponseEncoder clientBidID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            clientBidID.wrap(buffer);
            clientBidIDOffset = value.offset();
            clientBidIDLength = value.length();
        }
        return this;
    }

    public BidResponseEncoder clientBidID(final char[] value)
    {
        return clientBidID(value, 0, value.length);
    }

    public BidResponseEncoder clientBidID(final char[] value, final int length)
    {
        return clientBidID(value, 0, length);
    }

    public BidResponseEncoder clientBidID(final char[] value, final int offset, final int length)
    {
        toBytes(value, clientBidID, offset, length);
        clientBidIDOffset = 0;
        clientBidIDLength = length;
        return this;
    }

    private final BidCompRspGrpEncoder bidCompRspGrp = new BidCompRspGrpEncoder();
    public BidCompRspGrpEncoder bidCompRspGrp()
    {
        return bidCompRspGrp;
    }

    public long encode(final MutableAsciiBuffer buffer, final int offset)
    {
        final long startMessageResult = header.startMessage(buffer, offset);
        final int bodyStart = Encoder.offset(startMessageResult);
        int position = bodyStart + Encoder.length(startMessageResult);

        if (bidIDLength > 0)
        {
            buffer.putBytes(position, bidIDHeader, 0, bidIDHeaderLength);
            position += bidIDHeaderLength;
            buffer.putBytes(position, bidID, bidIDOffset, bidIDLength);
            position += bidIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (clientBidIDLength > 0)
        {
            buffer.putBytes(position, clientBidIDHeader, 0, clientBidIDHeaderLength);
            position += clientBidIDHeaderLength;
            buffer.putBytes(position, clientBidID, clientBidIDOffset, clientBidIDLength);
            position += clientBidIDLength;
            buffer.putSeparator(position);
            position++;
        }

            position += bidCompRspGrp.encode(buffer, position);
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
        this.resetBidID();
        this.resetClientBidID();
        bidCompRspGrp.reset();
    }

    public void resetBidID()
    {
        bidIDLength = 0;
    }

    public void resetClientBidID()
    {
        clientBidIDLength = 0;
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
        builder.append("\"MessageName\": \"BidResponse\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasBidID())
        {
            indent(builder, level);
            builder.append("\"BidID\": \"");
            appendBuffer(builder, bidID, bidIDOffset, bidIDLength);
            builder.append("\",\n");
        }

        if (hasClientBidID())
        {
            indent(builder, level);
            builder.append("\"ClientBidID\": \"");
            appendBuffer(builder, clientBidID, clientBidIDOffset, clientBidIDLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"BidCompRspGrp\": ");
    bidCompRspGrp.appendTo(builder, level + 1);
    builder.append("\n");
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public BidResponseEncoder copyTo(final Encoder encoder)
    {
        return copyTo((BidResponseEncoder)encoder);
    }

    public BidResponseEncoder copyTo(final BidResponseEncoder encoder)
    {
        encoder.reset();
        if (hasBidID())
        {
            encoder.bidIDAsCopy(bidID.byteArray(), 0, bidIDLength);
        }

        if (hasClientBidID())
        {
            encoder.clientBidIDAsCopy(clientBidID.byteArray(), 0, clientBidIDLength);
        }


        bidCompRspGrp.copyTo(encoder.bidCompRspGrp());        return encoder;
    }

}
