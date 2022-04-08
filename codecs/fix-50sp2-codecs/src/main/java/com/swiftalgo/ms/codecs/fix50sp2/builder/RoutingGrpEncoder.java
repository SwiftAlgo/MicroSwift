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


public class RoutingGrpEncoder
{
    private static final int noRoutingIDsGroupCounterHeaderLength = 4;
    private static final byte[] noRoutingIDsGroupCounterHeader = new byte[] {50, 49, 53, (byte) '='};



public static class RoutingIDsGroupEncoder
{
    private RoutingIDsGroupEncoder next = null;

    public RoutingIDsGroupEncoder next()
    {
        if (next == null)
        {
            next = new RoutingIDsGroupEncoder();
        }
        return next;
    }

    private static final int routingTypeHeaderLength = 4;
    private static final byte[] routingTypeHeader = new byte[] {50, 49, 54, (byte) '='};

    private static final int routingIDHeaderLength = 4;
    private static final byte[] routingIDHeader = new byte[] {50, 49, 55, (byte) '='};

    private int routingType;

    private boolean hasRoutingType;

    public boolean hasRoutingType()
    {
        return hasRoutingType;
    }

    public RoutingIDsGroupEncoder routingType(int value)
    {
        routingType = value;
        hasRoutingType = true;
        return this;
    }

    public int routingType()
    {
        return routingType;
    }

    public RoutingIDsGroupEncoder routingType(RoutingType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == RoutingType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: routingType Value: " + value );
            }
            if (value == RoutingType.NULL_VAL)
            {
                return this;
            }
        }
        return routingType(value.representation());
    }

    private final MutableDirectBuffer routingID = new UnsafeBuffer();

    private int routingIDOffset = 0;

    private int routingIDLength = 0;

    public RoutingIDsGroupEncoder routingID(final DirectBuffer value, final int offset, final int length)
    {
        routingID.wrap(value);
        routingIDOffset = offset;
        routingIDLength = length;
        return this;
    }

    public RoutingIDsGroupEncoder routingID(final DirectBuffer value, final int length)
    {
        return routingID(value, 0, length);
    }

    public RoutingIDsGroupEncoder routingID(final DirectBuffer value)
    {
        return routingID(value, 0, value.capacity());
    }

    public RoutingIDsGroupEncoder routingID(final byte[] value, final int offset, final int length)
    {
        routingID.wrap(value);
        routingIDOffset = offset;
        routingIDLength = length;
        return this;
    }

    public RoutingIDsGroupEncoder routingIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(routingID, value, offset, length);
        routingIDOffset = offset;
        routingIDLength = length;
        return this;
    }

    public RoutingIDsGroupEncoder routingID(final byte[] value, final int length)
    {
        return routingID(value, 0, length);
    }

    public RoutingIDsGroupEncoder routingID(final byte[] value)
    {
        return routingID(value, 0, value.length);
    }

    public boolean hasRoutingID()
    {
        return routingIDLength > 0;
    }

    public MutableDirectBuffer routingID()
    {
        return routingID;
    }

    public String routingIDAsString()
    {
        return routingID.getStringWithoutLengthAscii(routingIDOffset, routingIDLength);
    }

    public RoutingIDsGroupEncoder routingID(final CharSequence value)
    {
        toBytes(value, routingID);
        routingIDOffset = 0;
        routingIDLength = value.length();
        return this;
    }

    public RoutingIDsGroupEncoder routingID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            routingID.wrap(buffer);
            routingIDOffset = value.offset();
            routingIDLength = value.length();
        }
        return this;
    }

    public RoutingIDsGroupEncoder routingID(final char[] value)
    {
        return routingID(value, 0, value.length);
    }

    public RoutingIDsGroupEncoder routingID(final char[] value, final int length)
    {
        return routingID(value, 0, length);
    }

    public RoutingIDsGroupEncoder routingID(final char[] value, final int offset, final int length)
    {
        toBytes(value, routingID, offset, length);
        routingIDOffset = 0;
        routingIDLength = length;
        return this;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (hasRoutingType)
        {
            buffer.putBytes(position, routingTypeHeader, 0, routingTypeHeaderLength);
            position += routingTypeHeaderLength;
            position += buffer.putIntAscii(position, routingType);
            buffer.putSeparator(position);
            position++;
        }

        if (routingIDLength > 0)
        {
            buffer.putBytes(position, routingIDHeader, 0, routingIDHeaderLength);
            position += routingIDHeaderLength;
            buffer.putBytes(position, routingID, routingIDOffset, routingIDLength);
            position += routingIDLength;
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
        this.resetRoutingType();
        this.resetRoutingID();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetRoutingType()
    {
        hasRoutingType = false;
    }

    public void resetRoutingID()
    {
        routingIDLength = 0;
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
        builder.append("\"MessageName\": \"RoutingIDsGroup\",\n");
        if (hasRoutingType())
        {
            indent(builder, level);
            builder.append("\"RoutingType\": \"");
            builder.append(routingType);
            builder.append("\",\n");
        }

        if (hasRoutingID())
        {
            indent(builder, level);
            builder.append("\"RoutingID\": \"");
            appendBuffer(builder, routingID, routingIDOffset, routingIDLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public RoutingIDsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((RoutingIDsGroupEncoder)encoder);
    }

    public RoutingIDsGroupEncoder copyTo(final RoutingIDsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasRoutingType())
        {
            encoder.routingType(this.routingType());
        }

        if (hasRoutingID())
        {
            encoder.routingIDAsCopy(routingID.byteArray(), 0, routingIDLength);
        }
        return encoder;
    }

}
    private int noRoutingIDsGroupCounter;

    private boolean hasNoRoutingIDsGroupCounter;

    public boolean hasNoRoutingIDsGroupCounter()
    {
        return hasNoRoutingIDsGroupCounter;
    }

    public RoutingGrpEncoder noRoutingIDsGroupCounter(int value)
    {
        noRoutingIDsGroupCounter = value;
        hasNoRoutingIDsGroupCounter = true;
        return this;
    }

    public int noRoutingIDsGroupCounter()
    {
        return noRoutingIDsGroupCounter;
    }


    private RoutingIDsGroupEncoder routingIDsGroup = null;

    public RoutingIDsGroupEncoder routingIDsGroup(final int numberOfElements)
    {
        hasNoRoutingIDsGroupCounter = true;
        noRoutingIDsGroupCounter = numberOfElements;
        if (routingIDsGroup == null)
        {
            routingIDsGroup = new RoutingIDsGroupEncoder();
        }
        return routingIDsGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoRoutingIDsGroupCounter)
        {
            buffer.putBytes(position, noRoutingIDsGroupCounterHeader, 0, noRoutingIDsGroupCounterHeaderLength);
            position += noRoutingIDsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noRoutingIDsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (routingIDsGroup != null)
        {
            position += routingIDsGroup.encode(buffer, position, noRoutingIDsGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetRoutingIDsGroup();
    }

    public void resetRoutingIDsGroup()
    {
        if (routingIDsGroup != null)
        {
            routingIDsGroup.reset();
        }
        noRoutingIDsGroupCounter = 0;
        hasNoRoutingIDsGroupCounter = false;
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
        builder.append("\"MessageName\": \"RoutingGrp\",\n");
        if (hasNoRoutingIDsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"RoutingIDsGroup\": [\n");
            final int noRoutingIDsGroupCounter = this.noRoutingIDsGroupCounter;
            RoutingIDsGroupEncoder routingIDsGroup = this.routingIDsGroup;
            for (int i = 0; i < noRoutingIDsGroupCounter; i++)
            {
                indent(builder, level);
                routingIDsGroup.appendTo(builder, level + 1);
                if (i < (noRoutingIDsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                routingIDsGroup = routingIDsGroup.next();
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
    public RoutingGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((RoutingGrpEncoder)encoder);
    }

    public RoutingGrpEncoder copyTo(final RoutingGrpEncoder encoder)
    {
        encoder.reset();
        if (hasNoRoutingIDsGroupCounter)
        {
            final int size = this.noRoutingIDsGroupCounter;
            RoutingIDsGroupEncoder routingIDsGroup = this.routingIDsGroup;
            RoutingIDsGroupEncoder routingIDsGroupEncoder = encoder.routingIDsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (routingIDsGroup != null)
                {
                    routingIDsGroup.copyTo(routingIDsGroupEncoder);
                    routingIDsGroup = routingIDsGroup.next();
                    routingIDsGroupEncoder = routingIDsGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
