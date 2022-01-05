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


public class InstrmtLegIOIGrpEncoder
{
    private static final int noLegsGroupCounterHeaderLength = 4;
    private static final byte[] noLegsGroupCounterHeader = new byte[] {53, 53, 53, (byte) '='};



public static class LegsGroupEncoder
{
    private LegsGroupEncoder next = null;

    public LegsGroupEncoder next()
    {
        if (next == null)
        {
            next = new LegsGroupEncoder();
        }
        return next;
    }

    private static final int legIOIQtyHeaderLength = 4;
    private static final byte[] legIOIQtyHeader = new byte[] {54, 56, 50, (byte) '='};

    private final InstrumentLegEncoder instrumentLeg = new InstrumentLegEncoder();
    public InstrumentLegEncoder instrumentLeg()
    {
        return instrumentLeg;
    }

    private final MutableDirectBuffer legIOIQty = new UnsafeBuffer();

    private int legIOIQtyOffset = 0;

    private int legIOIQtyLength = 0;

    public LegsGroupEncoder legIOIQty(final DirectBuffer value, final int offset, final int length)
    {
        legIOIQty.wrap(value);
        legIOIQtyOffset = offset;
        legIOIQtyLength = length;
        return this;
    }

    public LegsGroupEncoder legIOIQty(final DirectBuffer value, final int length)
    {
        return legIOIQty(value, 0, length);
    }

    public LegsGroupEncoder legIOIQty(final DirectBuffer value)
    {
        return legIOIQty(value, 0, value.capacity());
    }

    public LegsGroupEncoder legIOIQty(final byte[] value, final int offset, final int length)
    {
        legIOIQty.wrap(value);
        legIOIQtyOffset = offset;
        legIOIQtyLength = length;
        return this;
    }

    public LegsGroupEncoder legIOIQtyAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(legIOIQty, value, offset, length);
        legIOIQtyOffset = offset;
        legIOIQtyLength = length;
        return this;
    }

    public LegsGroupEncoder legIOIQty(final byte[] value, final int length)
    {
        return legIOIQty(value, 0, length);
    }

    public LegsGroupEncoder legIOIQty(final byte[] value)
    {
        return legIOIQty(value, 0, value.length);
    }

    public boolean hasLegIOIQty()
    {
        return legIOIQtyLength > 0;
    }

    public MutableDirectBuffer legIOIQty()
    {
        return legIOIQty;
    }

    public String legIOIQtyAsString()
    {
        return legIOIQty.getStringWithoutLengthAscii(legIOIQtyOffset, legIOIQtyLength);
    }

    public LegsGroupEncoder legIOIQty(final CharSequence value)
    {
        toBytes(value, legIOIQty);
        legIOIQtyOffset = 0;
        legIOIQtyLength = value.length();
        return this;
    }

    public LegsGroupEncoder legIOIQty(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            legIOIQty.wrap(buffer);
            legIOIQtyOffset = value.offset();
            legIOIQtyLength = value.length();
        }
        return this;
    }

    public LegsGroupEncoder legIOIQty(final char[] value)
    {
        return legIOIQty(value, 0, value.length);
    }

    public LegsGroupEncoder legIOIQty(final char[] value, final int length)
    {
        return legIOIQty(value, 0, length);
    }

    public LegsGroupEncoder legIOIQty(final char[] value, final int offset, final int length)
    {
        toBytes(value, legIOIQty, offset, length);
        legIOIQtyOffset = 0;
        legIOIQtyLength = length;
        return this;
    }

    private final LegStipulationsEncoder legStipulations = new LegStipulationsEncoder();
    public LegStipulationsEncoder legStipulations()
    {
        return legStipulations;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

            position += instrumentLeg.encode(buffer, position);

        if (legIOIQtyLength > 0)
        {
            buffer.putBytes(position, legIOIQtyHeader, 0, legIOIQtyHeaderLength);
            position += legIOIQtyHeaderLength;
            buffer.putBytes(position, legIOIQty, legIOIQtyOffset, legIOIQtyLength);
            position += legIOIQtyLength;
            buffer.putSeparator(position);
            position++;
        }

            position += legStipulations.encode(buffer, position);
        if (next != null)
        {
            position += next.encode(buffer, position, remainingElements - 1);
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetLegIOIQty();
        instrumentLeg.reset();
        legStipulations.reset();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetLegIOIQty()
    {
        legIOIQtyLength = 0;
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
        builder.append("\"MessageName\": \"LegsGroup\",\n");
    indent(builder, level);
    builder.append("\"InstrumentLeg\": ");
    instrumentLeg.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasLegIOIQty())
        {
            indent(builder, level);
            builder.append("\"LegIOIQty\": \"");
            appendBuffer(builder, legIOIQty, legIOIQtyOffset, legIOIQtyLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"LegStipulations\": ");
    legStipulations.appendTo(builder, level + 1);
    builder.append("\n");
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public LegsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((LegsGroupEncoder)encoder);
    }

    public LegsGroupEncoder copyTo(final LegsGroupEncoder encoder)
    {
        encoder.reset();

        instrumentLeg.copyTo(encoder.instrumentLeg());
        if (hasLegIOIQty())
        {
            encoder.legIOIQtyAsCopy(legIOIQty.byteArray(), 0, legIOIQtyLength);
        }


        legStipulations.copyTo(encoder.legStipulations());        return encoder;
    }

}
    private int noLegsGroupCounter;

    private boolean hasNoLegsGroupCounter;

    public boolean hasNoLegsGroupCounter()
    {
        return hasNoLegsGroupCounter;
    }

    public InstrmtLegIOIGrpEncoder noLegsGroupCounter(int value)
    {
        noLegsGroupCounter = value;
        hasNoLegsGroupCounter = true;
        return this;
    }

    public int noLegsGroupCounter()
    {
        return noLegsGroupCounter;
    }


    private LegsGroupEncoder legsGroup = null;

    public LegsGroupEncoder legsGroup(final int numberOfElements)
    {
        hasNoLegsGroupCounter = true;
        noLegsGroupCounter = numberOfElements;
        if (legsGroup == null)
        {
            legsGroup = new LegsGroupEncoder();
        }
        return legsGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoLegsGroupCounter)
        {
            buffer.putBytes(position, noLegsGroupCounterHeader, 0, noLegsGroupCounterHeaderLength);
            position += noLegsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noLegsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (legsGroup != null)
        {
            position += legsGroup.encode(buffer, position, noLegsGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetLegsGroup();
    }

    public void resetLegsGroup()
    {
        if (legsGroup != null)
        {
            legsGroup.reset();
        }
        noLegsGroupCounter = 0;
        hasNoLegsGroupCounter = false;
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
        builder.append("\"MessageName\": \"InstrmtLegIOIGrp\",\n");
        if (hasNoLegsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"LegsGroup\": [\n");
            final int noLegsGroupCounter = this.noLegsGroupCounter;
            LegsGroupEncoder legsGroup = this.legsGroup;
            for (int i = 0; i < noLegsGroupCounter; i++)
            {
                indent(builder, level);
                legsGroup.appendTo(builder, level + 1);
                if (i < (noLegsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                legsGroup = legsGroup.next();
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
    public InstrmtLegIOIGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((InstrmtLegIOIGrpEncoder)encoder);
    }

    public InstrmtLegIOIGrpEncoder copyTo(final InstrmtLegIOIGrpEncoder encoder)
    {
        encoder.reset();
        if (hasNoLegsGroupCounter)
        {
            final int size = this.noLegsGroupCounter;
            LegsGroupEncoder legsGroup = this.legsGroup;
            LegsGroupEncoder legsGroupEncoder = encoder.legsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (legsGroup != null)
                {
                    legsGroup.copyTo(legsGroupEncoder);
                    legsGroup = legsGroup.next();
                    legsGroupEncoder = legsGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
