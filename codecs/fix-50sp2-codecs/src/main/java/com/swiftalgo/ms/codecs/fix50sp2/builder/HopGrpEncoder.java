/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2.builder;

import org.agrona.MutableDirectBuffer;
import org.agrona.AsciiSequenceView;
import static uk.co.real_logic.artio.dictionary.generation.CodecUtil.*;
import static uk.co.real_logic.artio.dictionary.SessionConstants.*;
import uk.co.real_logic.artio.builder.Encoder;
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


public class HopGrpEncoder
{
    private static final int noHopsGroupCounterHeaderLength = 4;
    private static final byte[] noHopsGroupCounterHeader = new byte[] {54, 50, 55, (byte) '='};



public static class HopsGroupEncoder
{
    private HopsGroupEncoder next = null;

    public HopsGroupEncoder next()
    {
        if (next == null)
        {
            next = new HopsGroupEncoder();
        }
        return next;
    }

    private static final int hopCompIDHeaderLength = 4;
    private static final byte[] hopCompIDHeader = new byte[] {54, 50, 56, (byte) '='};

    private static final int hopSendingTimeHeaderLength = 4;
    private static final byte[] hopSendingTimeHeader = new byte[] {54, 50, 57, (byte) '='};

    private static final int hopRefIDHeaderLength = 4;
    private static final byte[] hopRefIDHeader = new byte[] {54, 51, 48, (byte) '='};

    private final MutableDirectBuffer hopCompID = new UnsafeBuffer();

    private int hopCompIDOffset = 0;

    private int hopCompIDLength = 0;

    public HopsGroupEncoder hopCompID(final DirectBuffer value, final int offset, final int length)
    {
        hopCompID.wrap(value);
        hopCompIDOffset = offset;
        hopCompIDLength = length;
        return this;
    }

    public HopsGroupEncoder hopCompID(final DirectBuffer value, final int length)
    {
        return hopCompID(value, 0, length);
    }

    public HopsGroupEncoder hopCompID(final DirectBuffer value)
    {
        return hopCompID(value, 0, value.capacity());
    }

    public HopsGroupEncoder hopCompID(final byte[] value, final int offset, final int length)
    {
        hopCompID.wrap(value);
        hopCompIDOffset = offset;
        hopCompIDLength = length;
        return this;
    }

    public HopsGroupEncoder hopCompIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(hopCompID, value, offset, length);
        hopCompIDOffset = offset;
        hopCompIDLength = length;
        return this;
    }

    public HopsGroupEncoder hopCompID(final byte[] value, final int length)
    {
        return hopCompID(value, 0, length);
    }

    public HopsGroupEncoder hopCompID(final byte[] value)
    {
        return hopCompID(value, 0, value.length);
    }

    public boolean hasHopCompID()
    {
        return hopCompIDLength > 0;
    }

    public MutableDirectBuffer hopCompID()
    {
        return hopCompID;
    }

    public String hopCompIDAsString()
    {
        return hopCompID.getStringWithoutLengthAscii(hopCompIDOffset, hopCompIDLength);
    }

    public HopsGroupEncoder hopCompID(final CharSequence value)
    {
        toBytes(value, hopCompID);
        hopCompIDOffset = 0;
        hopCompIDLength = value.length();
        return this;
    }

    public HopsGroupEncoder hopCompID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            hopCompID.wrap(buffer);
            hopCompIDOffset = value.offset();
            hopCompIDLength = value.length();
        }
        return this;
    }

    public HopsGroupEncoder hopCompID(final char[] value)
    {
        return hopCompID(value, 0, value.length);
    }

    public HopsGroupEncoder hopCompID(final char[] value, final int length)
    {
        return hopCompID(value, 0, length);
    }

    public HopsGroupEncoder hopCompID(final char[] value, final int offset, final int length)
    {
        toBytes(value, hopCompID, offset, length);
        hopCompIDOffset = 0;
        hopCompIDLength = length;
        return this;
    }

    private final MutableDirectBuffer hopSendingTime = new UnsafeBuffer();

    private int hopSendingTimeOffset = 0;

    private int hopSendingTimeLength = 0;

    public HopsGroupEncoder hopSendingTime(final DirectBuffer value, final int offset, final int length)
    {
        hopSendingTime.wrap(value);
        hopSendingTimeOffset = offset;
        hopSendingTimeLength = length;
        return this;
    }

    public HopsGroupEncoder hopSendingTime(final DirectBuffer value, final int length)
    {
        return hopSendingTime(value, 0, length);
    }

    public HopsGroupEncoder hopSendingTime(final DirectBuffer value)
    {
        return hopSendingTime(value, 0, value.capacity());
    }

    public HopsGroupEncoder hopSendingTime(final byte[] value, final int offset, final int length)
    {
        hopSendingTime.wrap(value);
        hopSendingTimeOffset = offset;
        hopSendingTimeLength = length;
        return this;
    }

    public HopsGroupEncoder hopSendingTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(hopSendingTime, value, offset, length);
        hopSendingTimeOffset = offset;
        hopSendingTimeLength = length;
        return this;
    }

    public HopsGroupEncoder hopSendingTime(final byte[] value, final int length)
    {
        return hopSendingTime(value, 0, length);
    }

    public HopsGroupEncoder hopSendingTime(final byte[] value)
    {
        return hopSendingTime(value, 0, value.length);
    }

    public boolean hasHopSendingTime()
    {
        return hopSendingTimeLength > 0;
    }

    public MutableDirectBuffer hopSendingTime()
    {
        return hopSendingTime;
    }

    public String hopSendingTimeAsString()
    {
        return hopSendingTime.getStringWithoutLengthAscii(hopSendingTimeOffset, hopSendingTimeLength);
    }

    private int hopRefID;

    private boolean hasHopRefID;

    public boolean hasHopRefID()
    {
        return hasHopRefID;
    }

    public HopsGroupEncoder hopRefID(int value)
    {
        hopRefID = value;
        hasHopRefID = true;
        return this;
    }

    public int hopRefID()
    {
        return hopRefID;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (hopCompIDLength > 0)
        {
            buffer.putBytes(position, hopCompIDHeader, 0, hopCompIDHeaderLength);
            position += hopCompIDHeaderLength;
            buffer.putBytes(position, hopCompID, hopCompIDOffset, hopCompIDLength);
            position += hopCompIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hopSendingTimeLength > 0)
        {
            buffer.putBytes(position, hopSendingTimeHeader, 0, hopSendingTimeHeaderLength);
            position += hopSendingTimeHeaderLength;
            buffer.putBytes(position, hopSendingTime, hopSendingTimeOffset, hopSendingTimeLength);
            position += hopSendingTimeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasHopRefID)
        {
            buffer.putBytes(position, hopRefIDHeader, 0, hopRefIDHeaderLength);
            position += hopRefIDHeaderLength;
            position += buffer.putIntAscii(position, hopRefID);
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
        this.resetHopCompID();
        this.resetHopSendingTime();
        this.resetHopRefID();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetHopCompID()
    {
        hopCompIDLength = 0;
    }

    public void resetHopSendingTime()
    {
        hopSendingTimeLength = 0;
    }

    public void resetHopRefID()
    {
        hasHopRefID = false;
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
        builder.append("\"MessageName\": \"HopsGroup\",\n");
        if (hasHopCompID())
        {
            indent(builder, level);
            builder.append("\"HopCompID\": \"");
            appendBuffer(builder, hopCompID, hopCompIDOffset, hopCompIDLength);
            builder.append("\",\n");
        }

        if (hasHopSendingTime())
        {
            indent(builder, level);
            builder.append("\"HopSendingTime\": \"");
            appendBuffer(builder, hopSendingTime, hopSendingTimeOffset, hopSendingTimeLength);
            builder.append("\",\n");
        }

        if (hasHopRefID())
        {
            indent(builder, level);
            builder.append("\"HopRefID\": \"");
            builder.append(hopRefID);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public HopsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((HopsGroupEncoder)encoder);
    }

    public HopsGroupEncoder copyTo(final HopsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasHopCompID())
        {
            encoder.hopCompIDAsCopy(hopCompID.byteArray(), 0, hopCompIDLength);
        }

        if (hasHopSendingTime())
        {
            encoder.hopSendingTimeAsCopy(hopSendingTime.byteArray(), 0, hopSendingTimeLength);
        }

        if (hasHopRefID())
        {
            encoder.hopRefID(this.hopRefID());
        }
        return encoder;
    }

}
    private int noHopsGroupCounter;

    private boolean hasNoHopsGroupCounter;

    public boolean hasNoHopsGroupCounter()
    {
        return hasNoHopsGroupCounter;
    }

    public HopGrpEncoder noHopsGroupCounter(int value)
    {
        noHopsGroupCounter = value;
        hasNoHopsGroupCounter = true;
        return this;
    }

    public int noHopsGroupCounter()
    {
        return noHopsGroupCounter;
    }


    private HopsGroupEncoder hopsGroup = null;

    public HopsGroupEncoder hopsGroup(final int numberOfElements)
    {
        hasNoHopsGroupCounter = true;
        noHopsGroupCounter = numberOfElements;
        if (hopsGroup == null)
        {
            hopsGroup = new HopsGroupEncoder();
        }
        return hopsGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoHopsGroupCounter)
        {
            buffer.putBytes(position, noHopsGroupCounterHeader, 0, noHopsGroupCounterHeaderLength);
            position += noHopsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noHopsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (hopsGroup != null)
        {
            position += hopsGroup.encode(buffer, position, noHopsGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetHopsGroup();
    }

    public void resetHopsGroup()
    {
        if (hopsGroup != null)
        {
            hopsGroup.reset();
        }
        noHopsGroupCounter = 0;
        hasNoHopsGroupCounter = false;
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
        builder.append("\"MessageName\": \"HopGrp\",\n");
        if (hasNoHopsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"HopsGroup\": [\n");
            final int noHopsGroupCounter = this.noHopsGroupCounter;
            HopsGroupEncoder hopsGroup = this.hopsGroup;
            for (int i = 0; i < noHopsGroupCounter; i++)
            {
                indent(builder, level);
                hopsGroup.appendTo(builder, level + 1);
                if (i < (noHopsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                hopsGroup = hopsGroup.next();
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
    public HopGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((HopGrpEncoder)encoder);
    }

    public HopGrpEncoder copyTo(final HopGrpEncoder encoder)
    {
        encoder.reset();
        if (hasNoHopsGroupCounter)
        {
            final int size = this.noHopsGroupCounter;
            HopsGroupEncoder hopsGroup = this.hopsGroup;
            HopsGroupEncoder hopsGroupEncoder = encoder.hopsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (hopsGroup != null)
                {
                    hopsGroup.copyTo(hopsGroupEncoder);
                    hopsGroup = hopsGroup.next();
                    hopsGroupEncoder = hopsGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
