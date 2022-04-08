/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44.builder;

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
import com.swiftalgo.ms.codecs.fix44.*;


public class PositionQtyEncoder
{
    private static final int noPositionsGroupCounterHeaderLength = 4;
    private static final byte[] noPositionsGroupCounterHeader = new byte[] {55, 48, 50, (byte) '='};



public static class PositionsGroupEncoder
{
    private PositionsGroupEncoder next = null;

    public PositionsGroupEncoder next()
    {
        if (next == null)
        {
            next = new PositionsGroupEncoder();
        }
        return next;
    }

    private static final int posTypeHeaderLength = 4;
    private static final byte[] posTypeHeader = new byte[] {55, 48, 51, (byte) '='};

    private static final int longQtyHeaderLength = 4;
    private static final byte[] longQtyHeader = new byte[] {55, 48, 52, (byte) '='};

    private static final int shortQtyHeaderLength = 4;
    private static final byte[] shortQtyHeader = new byte[] {55, 48, 53, (byte) '='};

    private static final int posQtyStatusHeaderLength = 4;
    private static final byte[] posQtyStatusHeader = new byte[] {55, 48, 54, (byte) '='};

    private final MutableDirectBuffer posType = new UnsafeBuffer();

    private int posTypeOffset = 0;

    private int posTypeLength = 0;

    public PositionsGroupEncoder posType(final DirectBuffer value, final int offset, final int length)
    {
        posType.wrap(value);
        posTypeOffset = offset;
        posTypeLength = length;
        return this;
    }

    public PositionsGroupEncoder posType(final DirectBuffer value, final int length)
    {
        return posType(value, 0, length);
    }

    public PositionsGroupEncoder posType(final DirectBuffer value)
    {
        return posType(value, 0, value.capacity());
    }

    public PositionsGroupEncoder posType(final byte[] value, final int offset, final int length)
    {
        posType.wrap(value);
        posTypeOffset = offset;
        posTypeLength = length;
        return this;
    }

    public PositionsGroupEncoder posTypeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(posType, value, offset, length);
        posTypeOffset = offset;
        posTypeLength = length;
        return this;
    }

    public PositionsGroupEncoder posType(final byte[] value, final int length)
    {
        return posType(value, 0, length);
    }

    public PositionsGroupEncoder posType(final byte[] value)
    {
        return posType(value, 0, value.length);
    }

    public boolean hasPosType()
    {
        return posTypeLength > 0;
    }

    public MutableDirectBuffer posType()
    {
        return posType;
    }

    public String posTypeAsString()
    {
        return posType.getStringWithoutLengthAscii(posTypeOffset, posTypeLength);
    }

    public PositionsGroupEncoder posType(final CharSequence value)
    {
        toBytes(value, posType);
        posTypeOffset = 0;
        posTypeLength = value.length();
        return this;
    }

    public PositionsGroupEncoder posType(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            posType.wrap(buffer);
            posTypeOffset = value.offset();
            posTypeLength = value.length();
        }
        return this;
    }

    public PositionsGroupEncoder posType(final char[] value)
    {
        return posType(value, 0, value.length);
    }

    public PositionsGroupEncoder posType(final char[] value, final int length)
    {
        return posType(value, 0, length);
    }

    public PositionsGroupEncoder posType(final char[] value, final int offset, final int length)
    {
        toBytes(value, posType, offset, length);
        posTypeOffset = 0;
        posTypeLength = length;
        return this;
    }

    public PositionsGroupEncoder posType(PosType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == PosType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: posType Value: " + value );
            }
            if (value == PosType.NULL_VAL)
            {
                return this;
            }
        }
        return posType(value.representation());
    }

    private final DecimalFloat longQty = new DecimalFloat();

    private boolean hasLongQty;

    public boolean hasLongQty()
    {
        return hasLongQty;
    }

    public PositionsGroupEncoder longQty(DecimalFloat value)
    {
        longQty.set(value);
        hasLongQty = true;
        return this;
    }

    public PositionsGroupEncoder longQty(long value, int scale)
    {
        longQty.set(value, scale);
        hasLongQty = true;
        return this;
    }

    public DecimalFloat longQty()
    {
        return longQty;
    }

    private final DecimalFloat shortQty = new DecimalFloat();

    private boolean hasShortQty;

    public boolean hasShortQty()
    {
        return hasShortQty;
    }

    public PositionsGroupEncoder shortQty(DecimalFloat value)
    {
        shortQty.set(value);
        hasShortQty = true;
        return this;
    }

    public PositionsGroupEncoder shortQty(long value, int scale)
    {
        shortQty.set(value, scale);
        hasShortQty = true;
        return this;
    }

    public DecimalFloat shortQty()
    {
        return shortQty;
    }

    private int posQtyStatus;

    private boolean hasPosQtyStatus;

    public boolean hasPosQtyStatus()
    {
        return hasPosQtyStatus;
    }

    public PositionsGroupEncoder posQtyStatus(int value)
    {
        posQtyStatus = value;
        hasPosQtyStatus = true;
        return this;
    }

    public int posQtyStatus()
    {
        return posQtyStatus;
    }

    public PositionsGroupEncoder posQtyStatus(PosQtyStatus value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == PosQtyStatus.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: posQtyStatus Value: " + value );
            }
            if (value == PosQtyStatus.NULL_VAL)
            {
                return this;
            }
        }
        return posQtyStatus(value.representation());
    }

    private final NestedPartiesEncoder nestedParties = new NestedPartiesEncoder();
    public NestedPartiesEncoder nestedParties()
    {
        return nestedParties;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (posTypeLength > 0)
        {
            buffer.putBytes(position, posTypeHeader, 0, posTypeHeaderLength);
            position += posTypeHeaderLength;
            buffer.putBytes(position, posType, posTypeOffset, posTypeLength);
            position += posTypeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasLongQty)
        {
            buffer.putBytes(position, longQtyHeader, 0, longQtyHeaderLength);
            position += longQtyHeaderLength;
            position += buffer.putFloatAscii(position, longQty);
            buffer.putSeparator(position);
            position++;
        }

        if (hasShortQty)
        {
            buffer.putBytes(position, shortQtyHeader, 0, shortQtyHeaderLength);
            position += shortQtyHeaderLength;
            position += buffer.putFloatAscii(position, shortQty);
            buffer.putSeparator(position);
            position++;
        }

        if (hasPosQtyStatus)
        {
            buffer.putBytes(position, posQtyStatusHeader, 0, posQtyStatusHeaderLength);
            position += posQtyStatusHeaderLength;
            position += buffer.putIntAscii(position, posQtyStatus);
            buffer.putSeparator(position);
            position++;
        }

            position += nestedParties.encode(buffer, position);
        if (next != null)
        {
            position += next.encode(buffer, position, remainingElements - 1);
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetPosType();
        this.resetLongQty();
        this.resetShortQty();
        this.resetPosQtyStatus();
        nestedParties.reset();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetPosType()
    {
        posTypeLength = 0;
    }

    public void resetLongQty()
    {
        hasLongQty = false;
    }

    public void resetShortQty()
    {
        hasShortQty = false;
    }

    public void resetPosQtyStatus()
    {
        hasPosQtyStatus = false;
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
        builder.append("\"MessageName\": \"PositionsGroup\",\n");
        if (hasPosType())
        {
            indent(builder, level);
            builder.append("\"PosType\": \"");
            appendBuffer(builder, posType, posTypeOffset, posTypeLength);
            builder.append("\",\n");
        }

        if (hasLongQty())
        {
            indent(builder, level);
            builder.append("\"LongQty\": \"");
            longQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasShortQty())
        {
            indent(builder, level);
            builder.append("\"ShortQty\": \"");
            shortQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasPosQtyStatus())
        {
            indent(builder, level);
            builder.append("\"PosQtyStatus\": \"");
            builder.append(posQtyStatus);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"NestedParties\": ");
    nestedParties.appendTo(builder, level + 1);
    builder.append("\n");
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public PositionsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((PositionsGroupEncoder)encoder);
    }

    public PositionsGroupEncoder copyTo(final PositionsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasPosType())
        {
            encoder.posTypeAsCopy(posType.byteArray(), 0, posTypeLength);
        }

        if (hasLongQty())
        {
            encoder.longQty(this.longQty());
        }

        if (hasShortQty())
        {
            encoder.shortQty(this.shortQty());
        }

        if (hasPosQtyStatus())
        {
            encoder.posQtyStatus(this.posQtyStatus());
        }


        nestedParties.copyTo(encoder.nestedParties());        return encoder;
    }

}
    private int noPositionsGroupCounter;

    private boolean hasNoPositionsGroupCounter;

    public boolean hasNoPositionsGroupCounter()
    {
        return hasNoPositionsGroupCounter;
    }

    public PositionQtyEncoder noPositionsGroupCounter(int value)
    {
        noPositionsGroupCounter = value;
        hasNoPositionsGroupCounter = true;
        return this;
    }

    public int noPositionsGroupCounter()
    {
        return noPositionsGroupCounter;
    }


    private PositionsGroupEncoder positionsGroup = null;

    public PositionsGroupEncoder positionsGroup(final int numberOfElements)
    {
        hasNoPositionsGroupCounter = true;
        noPositionsGroupCounter = numberOfElements;
        if (positionsGroup == null)
        {
            positionsGroup = new PositionsGroupEncoder();
        }
        return positionsGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoPositionsGroupCounter)
        {
            buffer.putBytes(position, noPositionsGroupCounterHeader, 0, noPositionsGroupCounterHeaderLength);
            position += noPositionsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noPositionsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (positionsGroup != null)
        {
            position += positionsGroup.encode(buffer, position, noPositionsGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetPositionsGroup();
    }

    public void resetPositionsGroup()
    {
        if (positionsGroup != null)
        {
            positionsGroup.reset();
        }
        noPositionsGroupCounter = 0;
        hasNoPositionsGroupCounter = false;
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
        builder.append("\"MessageName\": \"PositionQty\",\n");
        if (hasNoPositionsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"PositionsGroup\": [\n");
            final int noPositionsGroupCounter = this.noPositionsGroupCounter;
            PositionsGroupEncoder positionsGroup = this.positionsGroup;
            for (int i = 0; i < noPositionsGroupCounter; i++)
            {
                indent(builder, level);
                positionsGroup.appendTo(builder, level + 1);
                if (i < (noPositionsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                positionsGroup = positionsGroup.next();
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
    public PositionQtyEncoder copyTo(final Encoder encoder)
    {
        return copyTo((PositionQtyEncoder)encoder);
    }

    public PositionQtyEncoder copyTo(final PositionQtyEncoder encoder)
    {
        encoder.reset();
        if (hasNoPositionsGroupCounter)
        {
            final int size = this.noPositionsGroupCounter;
            PositionsGroupEncoder positionsGroup = this.positionsGroup;
            PositionsGroupEncoder positionsGroupEncoder = encoder.positionsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (positionsGroup != null)
                {
                    positionsGroup.copyTo(positionsGroupEncoder);
                    positionsGroup = positionsGroup.next();
                    positionsGroupEncoder = positionsGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
