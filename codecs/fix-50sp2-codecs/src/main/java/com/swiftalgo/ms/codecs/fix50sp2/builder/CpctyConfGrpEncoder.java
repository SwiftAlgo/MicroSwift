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


public class CpctyConfGrpEncoder
{
    private static final int noCapacitiesGroupCounterHeaderLength = 4;
    private static final byte[] noCapacitiesGroupCounterHeader = new byte[] {56, 54, 50, (byte) '='};



public static class CapacitiesGroupEncoder
{
    private CapacitiesGroupEncoder next = null;

    public CapacitiesGroupEncoder next()
    {
        if (next == null)
        {
            next = new CapacitiesGroupEncoder();
        }
        return next;
    }

    private static final int orderCapacityHeaderLength = 4;
    private static final byte[] orderCapacityHeader = new byte[] {53, 50, 56, (byte) '='};

    private static final int orderRestrictionsHeaderLength = 4;
    private static final byte[] orderRestrictionsHeader = new byte[] {53, 50, 57, (byte) '='};

    private static final int orderCapacityQtyHeaderLength = 4;
    private static final byte[] orderCapacityQtyHeader = new byte[] {56, 54, 51, (byte) '='};

    private char orderCapacity;

    private boolean hasOrderCapacity;

    public boolean hasOrderCapacity()
    {
        return hasOrderCapacity;
    }

    public CapacitiesGroupEncoder orderCapacity(char value)
    {
        orderCapacity = value;
        hasOrderCapacity = true;
        return this;
    }

    public char orderCapacity()
    {
        return orderCapacity;
    }

    public CapacitiesGroupEncoder orderCapacity(OrderCapacity value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == OrderCapacity.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: orderCapacity Value: " + value );
            }
            if (value == OrderCapacity.NULL_VAL)
            {
                return this;
            }
        }
        return orderCapacity(value.representation());
    }

    private final MutableDirectBuffer orderRestrictions = new UnsafeBuffer();

    private int orderRestrictionsOffset = 0;

    private int orderRestrictionsLength = 0;

    public CapacitiesGroupEncoder orderRestrictions(final DirectBuffer value, final int offset, final int length)
    {
        orderRestrictions.wrap(value);
        orderRestrictionsOffset = offset;
        orderRestrictionsLength = length;
        return this;
    }

    public CapacitiesGroupEncoder orderRestrictions(final DirectBuffer value, final int length)
    {
        return orderRestrictions(value, 0, length);
    }

    public CapacitiesGroupEncoder orderRestrictions(final DirectBuffer value)
    {
        return orderRestrictions(value, 0, value.capacity());
    }

    public CapacitiesGroupEncoder orderRestrictions(final byte[] value, final int offset, final int length)
    {
        orderRestrictions.wrap(value);
        orderRestrictionsOffset = offset;
        orderRestrictionsLength = length;
        return this;
    }

    public CapacitiesGroupEncoder orderRestrictionsAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(orderRestrictions, value, offset, length);
        orderRestrictionsOffset = offset;
        orderRestrictionsLength = length;
        return this;
    }

    public CapacitiesGroupEncoder orderRestrictions(final byte[] value, final int length)
    {
        return orderRestrictions(value, 0, length);
    }

    public CapacitiesGroupEncoder orderRestrictions(final byte[] value)
    {
        return orderRestrictions(value, 0, value.length);
    }

    public boolean hasOrderRestrictions()
    {
        return orderRestrictionsLength > 0;
    }

    public MutableDirectBuffer orderRestrictions()
    {
        return orderRestrictions;
    }

    public String orderRestrictionsAsString()
    {
        return orderRestrictions.getStringWithoutLengthAscii(orderRestrictionsOffset, orderRestrictionsLength);
    }

    public CapacitiesGroupEncoder orderRestrictions(final CharSequence value)
    {
        toBytes(value, orderRestrictions);
        orderRestrictionsOffset = 0;
        orderRestrictionsLength = value.length();
        return this;
    }

    public CapacitiesGroupEncoder orderRestrictions(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            orderRestrictions.wrap(buffer);
            orderRestrictionsOffset = value.offset();
            orderRestrictionsLength = value.length();
        }
        return this;
    }

    public CapacitiesGroupEncoder orderRestrictions(final char[] value)
    {
        return orderRestrictions(value, 0, value.length);
    }

    public CapacitiesGroupEncoder orderRestrictions(final char[] value, final int length)
    {
        return orderRestrictions(value, 0, length);
    }

    public CapacitiesGroupEncoder orderRestrictions(final char[] value, final int offset, final int length)
    {
        toBytes(value, orderRestrictions, offset, length);
        orderRestrictionsOffset = 0;
        orderRestrictionsLength = length;
        return this;
    }

    private final DecimalFloat orderCapacityQty = new DecimalFloat();

    private boolean hasOrderCapacityQty;

    public boolean hasOrderCapacityQty()
    {
        return hasOrderCapacityQty;
    }

    public CapacitiesGroupEncoder orderCapacityQty(DecimalFloat value)
    {
        orderCapacityQty.set(value);
        hasOrderCapacityQty = true;
        return this;
    }

    public CapacitiesGroupEncoder orderCapacityQty(long value, int scale)
    {
        orderCapacityQty.set(value, scale);
        hasOrderCapacityQty = true;
        return this;
    }

    public DecimalFloat orderCapacityQty()
    {
        return orderCapacityQty;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (hasOrderCapacity)
        {
            buffer.putBytes(position, orderCapacityHeader, 0, orderCapacityHeaderLength);
            position += orderCapacityHeaderLength;
            position += buffer.putCharAscii(position, orderCapacity);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: OrderCapacity");
        }

        if (orderRestrictionsLength > 0)
        {
            buffer.putBytes(position, orderRestrictionsHeader, 0, orderRestrictionsHeaderLength);
            position += orderRestrictionsHeaderLength;
            buffer.putBytes(position, orderRestrictions, orderRestrictionsOffset, orderRestrictionsLength);
            position += orderRestrictionsLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasOrderCapacityQty)
        {
            buffer.putBytes(position, orderCapacityQtyHeader, 0, orderCapacityQtyHeaderLength);
            position += orderCapacityQtyHeaderLength;
            position += buffer.putFloatAscii(position, orderCapacityQty);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: OrderCapacityQty");
        }
        if (next != null)
        {
            position += next.encode(buffer, position, remainingElements - 1);
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetOrderCapacity();
        this.resetOrderRestrictions();
        this.resetOrderCapacityQty();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetOrderCapacity()
    {
        orderCapacity = MISSING_CHAR;
    }

    public void resetOrderRestrictions()
    {
        orderRestrictionsLength = 0;
    }

    public void resetOrderCapacityQty()
    {
        hasOrderCapacityQty = false;
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
        builder.append("\"MessageName\": \"CapacitiesGroup\",\n");
        if (hasOrderCapacity())
        {
            indent(builder, level);
            builder.append("\"OrderCapacity\": \"");
            builder.append(orderCapacity);
            builder.append("\",\n");
        }

        if (hasOrderRestrictions())
        {
            indent(builder, level);
            builder.append("\"OrderRestrictions\": \"");
            appendBuffer(builder, orderRestrictions, orderRestrictionsOffset, orderRestrictionsLength);
            builder.append("\",\n");
        }

        if (hasOrderCapacityQty())
        {
            indent(builder, level);
            builder.append("\"OrderCapacityQty\": \"");
            orderCapacityQty.appendTo(builder);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public CapacitiesGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((CapacitiesGroupEncoder)encoder);
    }

    public CapacitiesGroupEncoder copyTo(final CapacitiesGroupEncoder encoder)
    {
        encoder.reset();
        if (hasOrderCapacity())
        {
            encoder.orderCapacity(this.orderCapacity());
        }

        if (hasOrderRestrictions())
        {
            encoder.orderRestrictionsAsCopy(orderRestrictions.byteArray(), 0, orderRestrictionsLength);
        }

        if (hasOrderCapacityQty())
        {
            encoder.orderCapacityQty(this.orderCapacityQty());
        }
        return encoder;
    }

}
    private int noCapacitiesGroupCounter;

    private boolean hasNoCapacitiesGroupCounter;

    public boolean hasNoCapacitiesGroupCounter()
    {
        return hasNoCapacitiesGroupCounter;
    }

    public CpctyConfGrpEncoder noCapacitiesGroupCounter(int value)
    {
        noCapacitiesGroupCounter = value;
        hasNoCapacitiesGroupCounter = true;
        return this;
    }

    public int noCapacitiesGroupCounter()
    {
        return noCapacitiesGroupCounter;
    }


    private CapacitiesGroupEncoder capacitiesGroup = null;

    public CapacitiesGroupEncoder capacitiesGroup(final int numberOfElements)
    {
        hasNoCapacitiesGroupCounter = true;
        noCapacitiesGroupCounter = numberOfElements;
        if (capacitiesGroup == null)
        {
            capacitiesGroup = new CapacitiesGroupEncoder();
        }
        return capacitiesGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoCapacitiesGroupCounter)
        {
            buffer.putBytes(position, noCapacitiesGroupCounterHeader, 0, noCapacitiesGroupCounterHeaderLength);
            position += noCapacitiesGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noCapacitiesGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (capacitiesGroup != null)
        {
            position += capacitiesGroup.encode(buffer, position, noCapacitiesGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetCapacitiesGroup();
    }

    public void resetCapacitiesGroup()
    {
        if (capacitiesGroup != null)
        {
            capacitiesGroup.reset();
        }
        noCapacitiesGroupCounter = 0;
        hasNoCapacitiesGroupCounter = false;
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
        builder.append("\"MessageName\": \"CpctyConfGrp\",\n");
        if (hasNoCapacitiesGroupCounter)
        {
            indent(builder, level);
            builder.append("\"CapacitiesGroup\": [\n");
            final int noCapacitiesGroupCounter = this.noCapacitiesGroupCounter;
            CapacitiesGroupEncoder capacitiesGroup = this.capacitiesGroup;
            for (int i = 0; i < noCapacitiesGroupCounter; i++)
            {
                indent(builder, level);
                capacitiesGroup.appendTo(builder, level + 1);
                if (i < (noCapacitiesGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                capacitiesGroup = capacitiesGroup.next();
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
    public CpctyConfGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((CpctyConfGrpEncoder)encoder);
    }

    public CpctyConfGrpEncoder copyTo(final CpctyConfGrpEncoder encoder)
    {
        encoder.reset();
        if (hasNoCapacitiesGroupCounter)
        {
            final int size = this.noCapacitiesGroupCounter;
            CapacitiesGroupEncoder capacitiesGroup = this.capacitiesGroup;
            CapacitiesGroupEncoder capacitiesGroupEncoder = encoder.capacitiesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (capacitiesGroup != null)
                {
                    capacitiesGroup.copyTo(capacitiesGroupEncoder);
                    capacitiesGroup = capacitiesGroup.next();
                    capacitiesGroupEncoder = capacitiesGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
