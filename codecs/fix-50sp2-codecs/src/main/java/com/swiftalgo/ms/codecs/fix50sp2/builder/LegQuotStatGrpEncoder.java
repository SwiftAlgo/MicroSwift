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


public class LegQuotStatGrpEncoder
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

    private static final int legQtyHeaderLength = 4;
    private static final byte[] legQtyHeader = new byte[] {54, 56, 55, (byte) '='};

    private static final int legOrderQtyHeaderLength = 4;
    private static final byte[] legOrderQtyHeader = new byte[] {54, 56, 53, (byte) '='};

    private static final int legSwapTypeHeaderLength = 4;
    private static final byte[] legSwapTypeHeader = new byte[] {54, 57, 48, (byte) '='};

    private static final int legSettlTypeHeaderLength = 4;
    private static final byte[] legSettlTypeHeader = new byte[] {53, 56, 55, (byte) '='};

    private static final int legSettlDateHeaderLength = 4;
    private static final byte[] legSettlDateHeader = new byte[] {53, 56, 56, (byte) '='};

    private final InstrumentLegEncoder instrumentLeg = new InstrumentLegEncoder();
    public InstrumentLegEncoder instrumentLeg()
    {
        return instrumentLeg;
    }

    private final DecimalFloat legQty = new DecimalFloat();

    private boolean hasLegQty;

    public boolean hasLegQty()
    {
        return hasLegQty;
    }

    public LegsGroupEncoder legQty(DecimalFloat value)
    {
        legQty.set(value);
        hasLegQty = true;
        return this;
    }

    public LegsGroupEncoder legQty(long value, int scale)
    {
        legQty.set(value, scale);
        hasLegQty = true;
        return this;
    }

    public DecimalFloat legQty()
    {
        return legQty;
    }

    private final DecimalFloat legOrderQty = new DecimalFloat();

    private boolean hasLegOrderQty;

    public boolean hasLegOrderQty()
    {
        return hasLegOrderQty;
    }

    public LegsGroupEncoder legOrderQty(DecimalFloat value)
    {
        legOrderQty.set(value);
        hasLegOrderQty = true;
        return this;
    }

    public LegsGroupEncoder legOrderQty(long value, int scale)
    {
        legOrderQty.set(value, scale);
        hasLegOrderQty = true;
        return this;
    }

    public DecimalFloat legOrderQty()
    {
        return legOrderQty;
    }

    private int legSwapType;

    private boolean hasLegSwapType;

    public boolean hasLegSwapType()
    {
        return hasLegSwapType;
    }

    public LegsGroupEncoder legSwapType(int value)
    {
        legSwapType = value;
        hasLegSwapType = true;
        return this;
    }

    public int legSwapType()
    {
        return legSwapType;
    }

    public LegsGroupEncoder legSwapType(LegSwapType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == LegSwapType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: legSwapType Value: " + value );
            }
            if (value == LegSwapType.NULL_VAL)
            {
                return this;
            }
        }
        return legSwapType(value.representation());
    }

    private char legSettlType;

    private boolean hasLegSettlType;

    public boolean hasLegSettlType()
    {
        return hasLegSettlType;
    }

    public LegsGroupEncoder legSettlType(char value)
    {
        legSettlType = value;
        hasLegSettlType = true;
        return this;
    }

    public char legSettlType()
    {
        return legSettlType;
    }

    private final MutableDirectBuffer legSettlDate = new UnsafeBuffer();

    private int legSettlDateOffset = 0;

    private int legSettlDateLength = 0;

    public LegsGroupEncoder legSettlDate(final DirectBuffer value, final int offset, final int length)
    {
        legSettlDate.wrap(value);
        legSettlDateOffset = offset;
        legSettlDateLength = length;
        return this;
    }

    public LegsGroupEncoder legSettlDate(final DirectBuffer value, final int length)
    {
        return legSettlDate(value, 0, length);
    }

    public LegsGroupEncoder legSettlDate(final DirectBuffer value)
    {
        return legSettlDate(value, 0, value.capacity());
    }

    public LegsGroupEncoder legSettlDate(final byte[] value, final int offset, final int length)
    {
        legSettlDate.wrap(value);
        legSettlDateOffset = offset;
        legSettlDateLength = length;
        return this;
    }

    public LegsGroupEncoder legSettlDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(legSettlDate, value, offset, length);
        legSettlDateOffset = offset;
        legSettlDateLength = length;
        return this;
    }

    public LegsGroupEncoder legSettlDate(final byte[] value, final int length)
    {
        return legSettlDate(value, 0, length);
    }

    public LegsGroupEncoder legSettlDate(final byte[] value)
    {
        return legSettlDate(value, 0, value.length);
    }

    public boolean hasLegSettlDate()
    {
        return legSettlDateLength > 0;
    }

    public MutableDirectBuffer legSettlDate()
    {
        return legSettlDate;
    }

    public String legSettlDateAsString()
    {
        return legSettlDate.getStringWithoutLengthAscii(legSettlDateOffset, legSettlDateLength);
    }

    private final LegStipulationsEncoder legStipulations = new LegStipulationsEncoder();
    public LegStipulationsEncoder legStipulations()
    {
        return legStipulations;
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

            position += instrumentLeg.encode(buffer, position);

        if (hasLegQty)
        {
            buffer.putBytes(position, legQtyHeader, 0, legQtyHeaderLength);
            position += legQtyHeaderLength;
            position += buffer.putFloatAscii(position, legQty);
            buffer.putSeparator(position);
            position++;
        }

        if (hasLegOrderQty)
        {
            buffer.putBytes(position, legOrderQtyHeader, 0, legOrderQtyHeaderLength);
            position += legOrderQtyHeaderLength;
            position += buffer.putFloatAscii(position, legOrderQty);
            buffer.putSeparator(position);
            position++;
        }

        if (hasLegSwapType)
        {
            buffer.putBytes(position, legSwapTypeHeader, 0, legSwapTypeHeaderLength);
            position += legSwapTypeHeaderLength;
            position += buffer.putIntAscii(position, legSwapType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasLegSettlType)
        {
            buffer.putBytes(position, legSettlTypeHeader, 0, legSettlTypeHeaderLength);
            position += legSettlTypeHeaderLength;
            position += buffer.putCharAscii(position, legSettlType);
            buffer.putSeparator(position);
            position++;
        }

        if (legSettlDateLength > 0)
        {
            buffer.putBytes(position, legSettlDateHeader, 0, legSettlDateHeaderLength);
            position += legSettlDateHeaderLength;
            buffer.putBytes(position, legSettlDate, legSettlDateOffset, legSettlDateLength);
            position += legSettlDateLength;
            buffer.putSeparator(position);
            position++;
        }

            position += legStipulations.encode(buffer, position);

            position += nestedParties.encode(buffer, position);
        if (next != null)
        {
            position += next.encode(buffer, position, remainingElements - 1);
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetLegQty();
        this.resetLegOrderQty();
        this.resetLegSwapType();
        this.resetLegSettlType();
        this.resetLegSettlDate();
        instrumentLeg.reset();
        legStipulations.reset();
        nestedParties.reset();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetLegQty()
    {
        hasLegQty = false;
    }

    public void resetLegOrderQty()
    {
        hasLegOrderQty = false;
    }

    public void resetLegSwapType()
    {
        hasLegSwapType = false;
    }

    public void resetLegSettlType()
    {
        hasLegSettlType = false;
    }

    public void resetLegSettlDate()
    {
        legSettlDateLength = 0;
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

        if (hasLegQty())
        {
            indent(builder, level);
            builder.append("\"LegQty\": \"");
            legQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasLegOrderQty())
        {
            indent(builder, level);
            builder.append("\"LegOrderQty\": \"");
            legOrderQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasLegSwapType())
        {
            indent(builder, level);
            builder.append("\"LegSwapType\": \"");
            builder.append(legSwapType);
            builder.append("\",\n");
        }

        if (hasLegSettlType())
        {
            indent(builder, level);
            builder.append("\"LegSettlType\": \"");
            builder.append(legSettlType);
            builder.append("\",\n");
        }

        if (hasLegSettlDate())
        {
            indent(builder, level);
            builder.append("\"LegSettlDate\": \"");
            appendBuffer(builder, legSettlDate, legSettlDateOffset, legSettlDateLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"LegStipulations\": ");
    legStipulations.appendTo(builder, level + 1);
    builder.append("\n");

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
    public LegsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((LegsGroupEncoder)encoder);
    }

    public LegsGroupEncoder copyTo(final LegsGroupEncoder encoder)
    {
        encoder.reset();

        instrumentLeg.copyTo(encoder.instrumentLeg());
        if (hasLegQty())
        {
            encoder.legQty(this.legQty());
        }

        if (hasLegOrderQty())
        {
            encoder.legOrderQty(this.legOrderQty());
        }

        if (hasLegSwapType())
        {
            encoder.legSwapType(this.legSwapType());
        }

        if (hasLegSettlType())
        {
            encoder.legSettlType(this.legSettlType());
        }

        if (hasLegSettlDate())
        {
            encoder.legSettlDateAsCopy(legSettlDate.byteArray(), 0, legSettlDateLength);
        }


        legStipulations.copyTo(encoder.legStipulations());

        nestedParties.copyTo(encoder.nestedParties());        return encoder;
    }

}
    private int noLegsGroupCounter;

    private boolean hasNoLegsGroupCounter;

    public boolean hasNoLegsGroupCounter()
    {
        return hasNoLegsGroupCounter;
    }

    public LegQuotStatGrpEncoder noLegsGroupCounter(int value)
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
        builder.append("\"MessageName\": \"LegQuotStatGrp\",\n");
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
    public LegQuotStatGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((LegQuotStatGrpEncoder)encoder);
    }

    public LegQuotStatGrpEncoder copyTo(final LegQuotStatGrpEncoder encoder)
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
