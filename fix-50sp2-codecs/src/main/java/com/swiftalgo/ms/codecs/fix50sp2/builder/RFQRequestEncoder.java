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


public class RFQRequestEncoder implements Encoder
{
    public long messageType()
    {
        return 18497L;
    }

    public RFQRequestEncoder()
    {
        header.msgType("AH");
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

    private static final int rFQReqIDHeaderLength = 4;
    private static final byte[] rFQReqIDHeader = new byte[] {54, 52, 52, (byte) '='};

    private static final int subscriptionRequestTypeHeaderLength = 4;
    private static final byte[] subscriptionRequestTypeHeader = new byte[] {50, 54, 51, (byte) '='};

    private static final int privateQuoteHeaderLength = 5;
    private static final byte[] privateQuoteHeader = new byte[] {49, 49, 55, 49, (byte) '='};

    private final MutableDirectBuffer rFQReqID = new UnsafeBuffer();

    private int rFQReqIDOffset = 0;

    private int rFQReqIDLength = 0;

    public RFQRequestEncoder rFQReqID(final DirectBuffer value, final int offset, final int length)
    {
        rFQReqID.wrap(value);
        rFQReqIDOffset = offset;
        rFQReqIDLength = length;
        return this;
    }

    public RFQRequestEncoder rFQReqID(final DirectBuffer value, final int length)
    {
        return rFQReqID(value, 0, length);
    }

    public RFQRequestEncoder rFQReqID(final DirectBuffer value)
    {
        return rFQReqID(value, 0, value.capacity());
    }

    public RFQRequestEncoder rFQReqID(final byte[] value, final int offset, final int length)
    {
        rFQReqID.wrap(value);
        rFQReqIDOffset = offset;
        rFQReqIDLength = length;
        return this;
    }

    public RFQRequestEncoder rFQReqIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(rFQReqID, value, offset, length);
        rFQReqIDOffset = offset;
        rFQReqIDLength = length;
        return this;
    }

    public RFQRequestEncoder rFQReqID(final byte[] value, final int length)
    {
        return rFQReqID(value, 0, length);
    }

    public RFQRequestEncoder rFQReqID(final byte[] value)
    {
        return rFQReqID(value, 0, value.length);
    }

    public boolean hasRFQReqID()
    {
        return rFQReqIDLength > 0;
    }

    public MutableDirectBuffer rFQReqID()
    {
        return rFQReqID;
    }

    public String rFQReqIDAsString()
    {
        return rFQReqID.getStringWithoutLengthAscii(rFQReqIDOffset, rFQReqIDLength);
    }

    public RFQRequestEncoder rFQReqID(final CharSequence value)
    {
        toBytes(value, rFQReqID);
        rFQReqIDOffset = 0;
        rFQReqIDLength = value.length();
        return this;
    }

    public RFQRequestEncoder rFQReqID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            rFQReqID.wrap(buffer);
            rFQReqIDOffset = value.offset();
            rFQReqIDLength = value.length();
        }
        return this;
    }

    public RFQRequestEncoder rFQReqID(final char[] value)
    {
        return rFQReqID(value, 0, value.length);
    }

    public RFQRequestEncoder rFQReqID(final char[] value, final int length)
    {
        return rFQReqID(value, 0, length);
    }

    public RFQRequestEncoder rFQReqID(final char[] value, final int offset, final int length)
    {
        toBytes(value, rFQReqID, offset, length);
        rFQReqIDOffset = 0;
        rFQReqIDLength = length;
        return this;
    }

    private final PartiesEncoder parties = new PartiesEncoder();
    public PartiesEncoder parties()
    {
        return parties;
    }

    private final RFQReqGrpEncoder rFQReqGrp = new RFQReqGrpEncoder();
    public RFQReqGrpEncoder rFQReqGrp()
    {
        return rFQReqGrp;
    }

    private char subscriptionRequestType;

    private boolean hasSubscriptionRequestType;

    public boolean hasSubscriptionRequestType()
    {
        return hasSubscriptionRequestType;
    }

    public RFQRequestEncoder subscriptionRequestType(char value)
    {
        subscriptionRequestType = value;
        hasSubscriptionRequestType = true;
        return this;
    }

    public char subscriptionRequestType()
    {
        return subscriptionRequestType;
    }

    public RFQRequestEncoder subscriptionRequestType(SubscriptionRequestType value)
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

    private boolean privateQuote;

    private boolean hasPrivateQuote;

    public boolean hasPrivateQuote()
    {
        return hasPrivateQuote;
    }

    public RFQRequestEncoder privateQuote(boolean value)
    {
        privateQuote = value;
        hasPrivateQuote = true;
        return this;
    }

    public boolean privateQuote()
    {
        return privateQuote;
    }

    public long encode(final MutableAsciiBuffer buffer, final int offset)
    {
        final long startMessageResult = header.startMessage(buffer, offset);
        final int bodyStart = Encoder.offset(startMessageResult);
        int position = bodyStart + Encoder.length(startMessageResult);

        if (rFQReqIDLength > 0)
        {
            buffer.putBytes(position, rFQReqIDHeader, 0, rFQReqIDHeaderLength);
            position += rFQReqIDHeaderLength;
            buffer.putBytes(position, rFQReqID, rFQReqIDOffset, rFQReqIDLength);
            position += rFQReqIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: RFQReqID");
        }

            position += parties.encode(buffer, position);

            position += rFQReqGrp.encode(buffer, position);

        if (hasSubscriptionRequestType)
        {
            buffer.putBytes(position, subscriptionRequestTypeHeader, 0, subscriptionRequestTypeHeaderLength);
            position += subscriptionRequestTypeHeaderLength;
            position += buffer.putCharAscii(position, subscriptionRequestType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasPrivateQuote)
        {
            buffer.putBytes(position, privateQuoteHeader, 0, privateQuoteHeaderLength);
            position += privateQuoteHeaderLength;
            position += buffer.putBooleanAscii(position, privateQuote);
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
        this.resetRFQReqID();
        this.resetSubscriptionRequestType();
        this.resetPrivateQuote();
        parties.reset();
        rFQReqGrp.reset();
    }

    public void resetRFQReqID()
    {
        rFQReqIDLength = 0;
    }

    public void resetSubscriptionRequestType()
    {
        hasSubscriptionRequestType = false;
    }

    public void resetPrivateQuote()
    {
        hasPrivateQuote = false;
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
        builder.append("\"MessageName\": \"RFQRequest\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasRFQReqID())
        {
            indent(builder, level);
            builder.append("\"RFQReqID\": \"");
            appendBuffer(builder, rFQReqID, rFQReqIDOffset, rFQReqIDLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"Parties\": ");
    parties.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"RFQReqGrp\": ");
    rFQReqGrp.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasSubscriptionRequestType())
        {
            indent(builder, level);
            builder.append("\"SubscriptionRequestType\": \"");
            builder.append(subscriptionRequestType);
            builder.append("\",\n");
        }

        if (hasPrivateQuote())
        {
            indent(builder, level);
            builder.append("\"PrivateQuote\": \"");
            builder.append(privateQuote);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public RFQRequestEncoder copyTo(final Encoder encoder)
    {
        return copyTo((RFQRequestEncoder)encoder);
    }

    public RFQRequestEncoder copyTo(final RFQRequestEncoder encoder)
    {
        encoder.reset();
        if (hasRFQReqID())
        {
            encoder.rFQReqIDAsCopy(rFQReqID.byteArray(), 0, rFQReqIDLength);
        }


        parties.copyTo(encoder.parties());

        rFQReqGrp.copyTo(encoder.rFQReqGrp());
        if (hasSubscriptionRequestType())
        {
            encoder.subscriptionRequestType(this.subscriptionRequestType());
        }

        if (hasPrivateQuote())
        {
            encoder.privateQuote(this.privateQuote());
        }
        return encoder;
    }

}
