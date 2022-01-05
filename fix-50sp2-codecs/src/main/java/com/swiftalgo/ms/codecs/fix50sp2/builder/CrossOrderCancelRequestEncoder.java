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


public class CrossOrderCancelRequestEncoder implements Encoder
{
    public long messageType()
    {
        return 117L;
    }

    public CrossOrderCancelRequestEncoder()
    {
        header.msgType("u");
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

    private static final int orderIDHeaderLength = 3;
    private static final byte[] orderIDHeader = new byte[] {51, 55, (byte) '='};

    private static final int crossIDHeaderLength = 4;
    private static final byte[] crossIDHeader = new byte[] {53, 52, 56, (byte) '='};

    private static final int origCrossIDHeaderLength = 4;
    private static final byte[] origCrossIDHeader = new byte[] {53, 53, 49, (byte) '='};

    private static final int hostCrossIDHeaderLength = 4;
    private static final byte[] hostCrossIDHeader = new byte[] {57, 54, 49, (byte) '='};

    private static final int crossTypeHeaderLength = 4;
    private static final byte[] crossTypeHeader = new byte[] {53, 52, 57, (byte) '='};

    private static final int crossPrioritizationHeaderLength = 4;
    private static final byte[] crossPrioritizationHeader = new byte[] {53, 53, 48, (byte) '='};

    private static final int transactTimeHeaderLength = 3;
    private static final byte[] transactTimeHeader = new byte[] {54, 48, (byte) '='};

    private final MutableDirectBuffer orderID = new UnsafeBuffer();

    private int orderIDOffset = 0;

    private int orderIDLength = 0;

    public CrossOrderCancelRequestEncoder orderID(final DirectBuffer value, final int offset, final int length)
    {
        orderID.wrap(value);
        orderIDOffset = offset;
        orderIDLength = length;
        return this;
    }

    public CrossOrderCancelRequestEncoder orderID(final DirectBuffer value, final int length)
    {
        return orderID(value, 0, length);
    }

    public CrossOrderCancelRequestEncoder orderID(final DirectBuffer value)
    {
        return orderID(value, 0, value.capacity());
    }

    public CrossOrderCancelRequestEncoder orderID(final byte[] value, final int offset, final int length)
    {
        orderID.wrap(value);
        orderIDOffset = offset;
        orderIDLength = length;
        return this;
    }

    public CrossOrderCancelRequestEncoder orderIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(orderID, value, offset, length);
        orderIDOffset = offset;
        orderIDLength = length;
        return this;
    }

    public CrossOrderCancelRequestEncoder orderID(final byte[] value, final int length)
    {
        return orderID(value, 0, length);
    }

    public CrossOrderCancelRequestEncoder orderID(final byte[] value)
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

    public CrossOrderCancelRequestEncoder orderID(final CharSequence value)
    {
        toBytes(value, orderID);
        orderIDOffset = 0;
        orderIDLength = value.length();
        return this;
    }

    public CrossOrderCancelRequestEncoder orderID(final AsciiSequenceView value)
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

    public CrossOrderCancelRequestEncoder orderID(final char[] value)
    {
        return orderID(value, 0, value.length);
    }

    public CrossOrderCancelRequestEncoder orderID(final char[] value, final int length)
    {
        return orderID(value, 0, length);
    }

    public CrossOrderCancelRequestEncoder orderID(final char[] value, final int offset, final int length)
    {
        toBytes(value, orderID, offset, length);
        orderIDOffset = 0;
        orderIDLength = length;
        return this;
    }

    private final MutableDirectBuffer crossID = new UnsafeBuffer();

    private int crossIDOffset = 0;

    private int crossIDLength = 0;

    public CrossOrderCancelRequestEncoder crossID(final DirectBuffer value, final int offset, final int length)
    {
        crossID.wrap(value);
        crossIDOffset = offset;
        crossIDLength = length;
        return this;
    }

    public CrossOrderCancelRequestEncoder crossID(final DirectBuffer value, final int length)
    {
        return crossID(value, 0, length);
    }

    public CrossOrderCancelRequestEncoder crossID(final DirectBuffer value)
    {
        return crossID(value, 0, value.capacity());
    }

    public CrossOrderCancelRequestEncoder crossID(final byte[] value, final int offset, final int length)
    {
        crossID.wrap(value);
        crossIDOffset = offset;
        crossIDLength = length;
        return this;
    }

    public CrossOrderCancelRequestEncoder crossIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(crossID, value, offset, length);
        crossIDOffset = offset;
        crossIDLength = length;
        return this;
    }

    public CrossOrderCancelRequestEncoder crossID(final byte[] value, final int length)
    {
        return crossID(value, 0, length);
    }

    public CrossOrderCancelRequestEncoder crossID(final byte[] value)
    {
        return crossID(value, 0, value.length);
    }

    public boolean hasCrossID()
    {
        return crossIDLength > 0;
    }

    public MutableDirectBuffer crossID()
    {
        return crossID;
    }

    public String crossIDAsString()
    {
        return crossID.getStringWithoutLengthAscii(crossIDOffset, crossIDLength);
    }

    public CrossOrderCancelRequestEncoder crossID(final CharSequence value)
    {
        toBytes(value, crossID);
        crossIDOffset = 0;
        crossIDLength = value.length();
        return this;
    }

    public CrossOrderCancelRequestEncoder crossID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            crossID.wrap(buffer);
            crossIDOffset = value.offset();
            crossIDLength = value.length();
        }
        return this;
    }

    public CrossOrderCancelRequestEncoder crossID(final char[] value)
    {
        return crossID(value, 0, value.length);
    }

    public CrossOrderCancelRequestEncoder crossID(final char[] value, final int length)
    {
        return crossID(value, 0, length);
    }

    public CrossOrderCancelRequestEncoder crossID(final char[] value, final int offset, final int length)
    {
        toBytes(value, crossID, offset, length);
        crossIDOffset = 0;
        crossIDLength = length;
        return this;
    }

    private final MutableDirectBuffer origCrossID = new UnsafeBuffer();

    private int origCrossIDOffset = 0;

    private int origCrossIDLength = 0;

    public CrossOrderCancelRequestEncoder origCrossID(final DirectBuffer value, final int offset, final int length)
    {
        origCrossID.wrap(value);
        origCrossIDOffset = offset;
        origCrossIDLength = length;
        return this;
    }

    public CrossOrderCancelRequestEncoder origCrossID(final DirectBuffer value, final int length)
    {
        return origCrossID(value, 0, length);
    }

    public CrossOrderCancelRequestEncoder origCrossID(final DirectBuffer value)
    {
        return origCrossID(value, 0, value.capacity());
    }

    public CrossOrderCancelRequestEncoder origCrossID(final byte[] value, final int offset, final int length)
    {
        origCrossID.wrap(value);
        origCrossIDOffset = offset;
        origCrossIDLength = length;
        return this;
    }

    public CrossOrderCancelRequestEncoder origCrossIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(origCrossID, value, offset, length);
        origCrossIDOffset = offset;
        origCrossIDLength = length;
        return this;
    }

    public CrossOrderCancelRequestEncoder origCrossID(final byte[] value, final int length)
    {
        return origCrossID(value, 0, length);
    }

    public CrossOrderCancelRequestEncoder origCrossID(final byte[] value)
    {
        return origCrossID(value, 0, value.length);
    }

    public boolean hasOrigCrossID()
    {
        return origCrossIDLength > 0;
    }

    public MutableDirectBuffer origCrossID()
    {
        return origCrossID;
    }

    public String origCrossIDAsString()
    {
        return origCrossID.getStringWithoutLengthAscii(origCrossIDOffset, origCrossIDLength);
    }

    public CrossOrderCancelRequestEncoder origCrossID(final CharSequence value)
    {
        toBytes(value, origCrossID);
        origCrossIDOffset = 0;
        origCrossIDLength = value.length();
        return this;
    }

    public CrossOrderCancelRequestEncoder origCrossID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            origCrossID.wrap(buffer);
            origCrossIDOffset = value.offset();
            origCrossIDLength = value.length();
        }
        return this;
    }

    public CrossOrderCancelRequestEncoder origCrossID(final char[] value)
    {
        return origCrossID(value, 0, value.length);
    }

    public CrossOrderCancelRequestEncoder origCrossID(final char[] value, final int length)
    {
        return origCrossID(value, 0, length);
    }

    public CrossOrderCancelRequestEncoder origCrossID(final char[] value, final int offset, final int length)
    {
        toBytes(value, origCrossID, offset, length);
        origCrossIDOffset = 0;
        origCrossIDLength = length;
        return this;
    }

    private final MutableDirectBuffer hostCrossID = new UnsafeBuffer();

    private int hostCrossIDOffset = 0;

    private int hostCrossIDLength = 0;

    public CrossOrderCancelRequestEncoder hostCrossID(final DirectBuffer value, final int offset, final int length)
    {
        hostCrossID.wrap(value);
        hostCrossIDOffset = offset;
        hostCrossIDLength = length;
        return this;
    }

    public CrossOrderCancelRequestEncoder hostCrossID(final DirectBuffer value, final int length)
    {
        return hostCrossID(value, 0, length);
    }

    public CrossOrderCancelRequestEncoder hostCrossID(final DirectBuffer value)
    {
        return hostCrossID(value, 0, value.capacity());
    }

    public CrossOrderCancelRequestEncoder hostCrossID(final byte[] value, final int offset, final int length)
    {
        hostCrossID.wrap(value);
        hostCrossIDOffset = offset;
        hostCrossIDLength = length;
        return this;
    }

    public CrossOrderCancelRequestEncoder hostCrossIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(hostCrossID, value, offset, length);
        hostCrossIDOffset = offset;
        hostCrossIDLength = length;
        return this;
    }

    public CrossOrderCancelRequestEncoder hostCrossID(final byte[] value, final int length)
    {
        return hostCrossID(value, 0, length);
    }

    public CrossOrderCancelRequestEncoder hostCrossID(final byte[] value)
    {
        return hostCrossID(value, 0, value.length);
    }

    public boolean hasHostCrossID()
    {
        return hostCrossIDLength > 0;
    }

    public MutableDirectBuffer hostCrossID()
    {
        return hostCrossID;
    }

    public String hostCrossIDAsString()
    {
        return hostCrossID.getStringWithoutLengthAscii(hostCrossIDOffset, hostCrossIDLength);
    }

    public CrossOrderCancelRequestEncoder hostCrossID(final CharSequence value)
    {
        toBytes(value, hostCrossID);
        hostCrossIDOffset = 0;
        hostCrossIDLength = value.length();
        return this;
    }

    public CrossOrderCancelRequestEncoder hostCrossID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            hostCrossID.wrap(buffer);
            hostCrossIDOffset = value.offset();
            hostCrossIDLength = value.length();
        }
        return this;
    }

    public CrossOrderCancelRequestEncoder hostCrossID(final char[] value)
    {
        return hostCrossID(value, 0, value.length);
    }

    public CrossOrderCancelRequestEncoder hostCrossID(final char[] value, final int length)
    {
        return hostCrossID(value, 0, length);
    }

    public CrossOrderCancelRequestEncoder hostCrossID(final char[] value, final int offset, final int length)
    {
        toBytes(value, hostCrossID, offset, length);
        hostCrossIDOffset = 0;
        hostCrossIDLength = length;
        return this;
    }

    private int crossType;

    private boolean hasCrossType;

    public boolean hasCrossType()
    {
        return hasCrossType;
    }

    public CrossOrderCancelRequestEncoder crossType(int value)
    {
        crossType = value;
        hasCrossType = true;
        return this;
    }

    public int crossType()
    {
        return crossType;
    }

    public CrossOrderCancelRequestEncoder crossType(CrossType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == CrossType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: crossType Value: " + value );
            }
            if (value == CrossType.NULL_VAL)
            {
                return this;
            }
        }
        return crossType(value.representation());
    }

    private int crossPrioritization;

    private boolean hasCrossPrioritization;

    public boolean hasCrossPrioritization()
    {
        return hasCrossPrioritization;
    }

    public CrossOrderCancelRequestEncoder crossPrioritization(int value)
    {
        crossPrioritization = value;
        hasCrossPrioritization = true;
        return this;
    }

    public int crossPrioritization()
    {
        return crossPrioritization;
    }

    public CrossOrderCancelRequestEncoder crossPrioritization(CrossPrioritization value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == CrossPrioritization.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: crossPrioritization Value: " + value );
            }
            if (value == CrossPrioritization.NULL_VAL)
            {
                return this;
            }
        }
        return crossPrioritization(value.representation());
    }

    private final RootPartiesEncoder rootParties = new RootPartiesEncoder();
    public RootPartiesEncoder rootParties()
    {
        return rootParties;
    }

    private final SideCrossOrdCxlGrpEncoder sideCrossOrdCxlGrp = new SideCrossOrdCxlGrpEncoder();
    public SideCrossOrdCxlGrpEncoder sideCrossOrdCxlGrp()
    {
        return sideCrossOrdCxlGrp;
    }

    private final InstrumentEncoder instrument = new InstrumentEncoder();
    public InstrumentEncoder instrument()
    {
        return instrument;
    }

    private final UndInstrmtGrpEncoder undInstrmtGrp = new UndInstrmtGrpEncoder();
    public UndInstrmtGrpEncoder undInstrmtGrp()
    {
        return undInstrmtGrp;
    }

    private final InstrmtLegGrpEncoder instrmtLegGrp = new InstrmtLegGrpEncoder();
    public InstrmtLegGrpEncoder instrmtLegGrp()
    {
        return instrmtLegGrp;
    }

    private final MutableDirectBuffer transactTime = new UnsafeBuffer();

    private int transactTimeOffset = 0;

    private int transactTimeLength = 0;

    public CrossOrderCancelRequestEncoder transactTime(final DirectBuffer value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public CrossOrderCancelRequestEncoder transactTime(final DirectBuffer value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public CrossOrderCancelRequestEncoder transactTime(final DirectBuffer value)
    {
        return transactTime(value, 0, value.capacity());
    }

    public CrossOrderCancelRequestEncoder transactTime(final byte[] value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public CrossOrderCancelRequestEncoder transactTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(transactTime, value, offset, length);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public CrossOrderCancelRequestEncoder transactTime(final byte[] value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public CrossOrderCancelRequestEncoder transactTime(final byte[] value)
    {
        return transactTime(value, 0, value.length);
    }

    public boolean hasTransactTime()
    {
        return transactTimeLength > 0;
    }

    public MutableDirectBuffer transactTime()
    {
        return transactTime;
    }

    public String transactTimeAsString()
    {
        return transactTime.getStringWithoutLengthAscii(transactTimeOffset, transactTimeLength);
    }

    public long encode(final MutableAsciiBuffer buffer, final int offset)
    {
        final long startMessageResult = header.startMessage(buffer, offset);
        final int bodyStart = Encoder.offset(startMessageResult);
        int position = bodyStart + Encoder.length(startMessageResult);

        if (orderIDLength > 0)
        {
            buffer.putBytes(position, orderIDHeader, 0, orderIDHeaderLength);
            position += orderIDHeaderLength;
            buffer.putBytes(position, orderID, orderIDOffset, orderIDLength);
            position += orderIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (crossIDLength > 0)
        {
            buffer.putBytes(position, crossIDHeader, 0, crossIDHeaderLength);
            position += crossIDHeaderLength;
            buffer.putBytes(position, crossID, crossIDOffset, crossIDLength);
            position += crossIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: CrossID");
        }

        if (origCrossIDLength > 0)
        {
            buffer.putBytes(position, origCrossIDHeader, 0, origCrossIDHeaderLength);
            position += origCrossIDHeaderLength;
            buffer.putBytes(position, origCrossID, origCrossIDOffset, origCrossIDLength);
            position += origCrossIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: OrigCrossID");
        }

        if (hostCrossIDLength > 0)
        {
            buffer.putBytes(position, hostCrossIDHeader, 0, hostCrossIDHeaderLength);
            position += hostCrossIDHeaderLength;
            buffer.putBytes(position, hostCrossID, hostCrossIDOffset, hostCrossIDLength);
            position += hostCrossIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasCrossType)
        {
            buffer.putBytes(position, crossTypeHeader, 0, crossTypeHeaderLength);
            position += crossTypeHeaderLength;
            position += buffer.putIntAscii(position, crossType);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: CrossType");
        }

        if (hasCrossPrioritization)
        {
            buffer.putBytes(position, crossPrioritizationHeader, 0, crossPrioritizationHeaderLength);
            position += crossPrioritizationHeaderLength;
            position += buffer.putIntAscii(position, crossPrioritization);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: CrossPrioritization");
        }

            position += rootParties.encode(buffer, position);

            position += sideCrossOrdCxlGrp.encode(buffer, position);

            position += instrument.encode(buffer, position);

            position += undInstrmtGrp.encode(buffer, position);

            position += instrmtLegGrp.encode(buffer, position);

        if (transactTimeLength > 0)
        {
            buffer.putBytes(position, transactTimeHeader, 0, transactTimeHeaderLength);
            position += transactTimeHeaderLength;
            buffer.putBytes(position, transactTime, transactTimeOffset, transactTimeLength);
            position += transactTimeLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: TransactTime");
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
        this.resetOrderID();
        this.resetCrossID();
        this.resetOrigCrossID();
        this.resetHostCrossID();
        this.resetCrossType();
        this.resetCrossPrioritization();
        this.resetTransactTime();
        rootParties.reset();
        sideCrossOrdCxlGrp.reset();
        instrument.reset();
        undInstrmtGrp.reset();
        instrmtLegGrp.reset();
    }

    public void resetOrderID()
    {
        orderIDLength = 0;
    }

    public void resetCrossID()
    {
        crossIDLength = 0;
    }

    public void resetOrigCrossID()
    {
        origCrossIDLength = 0;
    }

    public void resetHostCrossID()
    {
        hostCrossIDLength = 0;
    }

    public void resetCrossType()
    {
        hasCrossType = false;
    }

    public void resetCrossPrioritization()
    {
        hasCrossPrioritization = false;
    }

    public void resetTransactTime()
    {
        transactTimeLength = 0;
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
        builder.append("\"MessageName\": \"CrossOrderCancelRequest\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasOrderID())
        {
            indent(builder, level);
            builder.append("\"OrderID\": \"");
            appendBuffer(builder, orderID, orderIDOffset, orderIDLength);
            builder.append("\",\n");
        }

        if (hasCrossID())
        {
            indent(builder, level);
            builder.append("\"CrossID\": \"");
            appendBuffer(builder, crossID, crossIDOffset, crossIDLength);
            builder.append("\",\n");
        }

        if (hasOrigCrossID())
        {
            indent(builder, level);
            builder.append("\"OrigCrossID\": \"");
            appendBuffer(builder, origCrossID, origCrossIDOffset, origCrossIDLength);
            builder.append("\",\n");
        }

        if (hasHostCrossID())
        {
            indent(builder, level);
            builder.append("\"HostCrossID\": \"");
            appendBuffer(builder, hostCrossID, hostCrossIDOffset, hostCrossIDLength);
            builder.append("\",\n");
        }

        if (hasCrossType())
        {
            indent(builder, level);
            builder.append("\"CrossType\": \"");
            builder.append(crossType);
            builder.append("\",\n");
        }

        if (hasCrossPrioritization())
        {
            indent(builder, level);
            builder.append("\"CrossPrioritization\": \"");
            builder.append(crossPrioritization);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"RootParties\": ");
    rootParties.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"SideCrossOrdCxlGrp\": ");
    sideCrossOrdCxlGrp.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"Instrument\": ");
    instrument.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"UndInstrmtGrp\": ");
    undInstrmtGrp.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"InstrmtLegGrp\": ");
    instrmtLegGrp.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasTransactTime())
        {
            indent(builder, level);
            builder.append("\"TransactTime\": \"");
            appendBuffer(builder, transactTime, transactTimeOffset, transactTimeLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public CrossOrderCancelRequestEncoder copyTo(final Encoder encoder)
    {
        return copyTo((CrossOrderCancelRequestEncoder)encoder);
    }

    public CrossOrderCancelRequestEncoder copyTo(final CrossOrderCancelRequestEncoder encoder)
    {
        encoder.reset();
        if (hasOrderID())
        {
            encoder.orderIDAsCopy(orderID.byteArray(), 0, orderIDLength);
        }

        if (hasCrossID())
        {
            encoder.crossIDAsCopy(crossID.byteArray(), 0, crossIDLength);
        }

        if (hasOrigCrossID())
        {
            encoder.origCrossIDAsCopy(origCrossID.byteArray(), 0, origCrossIDLength);
        }

        if (hasHostCrossID())
        {
            encoder.hostCrossIDAsCopy(hostCrossID.byteArray(), 0, hostCrossIDLength);
        }

        if (hasCrossType())
        {
            encoder.crossType(this.crossType());
        }

        if (hasCrossPrioritization())
        {
            encoder.crossPrioritization(this.crossPrioritization());
        }


        rootParties.copyTo(encoder.rootParties());

        sideCrossOrdCxlGrp.copyTo(encoder.sideCrossOrdCxlGrp());

        instrument.copyTo(encoder.instrument());

        undInstrmtGrp.copyTo(encoder.undInstrmtGrp());

        instrmtLegGrp.copyTo(encoder.instrmtLegGrp());
        if (hasTransactTime())
        {
            encoder.transactTimeAsCopy(transactTime.byteArray(), 0, transactTimeLength);
        }
        return encoder;
    }

}
