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


public class FillsGrpEncoder
{
    private static final int noFillsGroupCounterHeaderLength = 5;
    private static final byte[] noFillsGroupCounterHeader = new byte[] {49, 51, 54, 50, (byte) '='};



public static class FillsGroupEncoder
{
    private FillsGroupEncoder next = null;

    public FillsGroupEncoder next()
    {
        if (next == null)
        {
            next = new FillsGroupEncoder();
        }
        return next;
    }

    private static final int fillExecIDHeaderLength = 5;
    private static final byte[] fillExecIDHeader = new byte[] {49, 51, 54, 51, (byte) '='};

    private static final int fillPxHeaderLength = 5;
    private static final byte[] fillPxHeader = new byte[] {49, 51, 54, 52, (byte) '='};

    private static final int fillQtyHeaderLength = 5;
    private static final byte[] fillQtyHeader = new byte[] {49, 51, 54, 53, (byte) '='};

    private static final int fillLiquidityIndHeaderLength = 5;
    private static final byte[] fillLiquidityIndHeader = new byte[] {49, 52, 52, 51, (byte) '='};

    private final MutableDirectBuffer fillExecID = new UnsafeBuffer();

    private int fillExecIDOffset = 0;

    private int fillExecIDLength = 0;

    public FillsGroupEncoder fillExecID(final DirectBuffer value, final int offset, final int length)
    {
        fillExecID.wrap(value);
        fillExecIDOffset = offset;
        fillExecIDLength = length;
        return this;
    }

    public FillsGroupEncoder fillExecID(final DirectBuffer value, final int length)
    {
        return fillExecID(value, 0, length);
    }

    public FillsGroupEncoder fillExecID(final DirectBuffer value)
    {
        return fillExecID(value, 0, value.capacity());
    }

    public FillsGroupEncoder fillExecID(final byte[] value, final int offset, final int length)
    {
        fillExecID.wrap(value);
        fillExecIDOffset = offset;
        fillExecIDLength = length;
        return this;
    }

    public FillsGroupEncoder fillExecIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(fillExecID, value, offset, length);
        fillExecIDOffset = offset;
        fillExecIDLength = length;
        return this;
    }

    public FillsGroupEncoder fillExecID(final byte[] value, final int length)
    {
        return fillExecID(value, 0, length);
    }

    public FillsGroupEncoder fillExecID(final byte[] value)
    {
        return fillExecID(value, 0, value.length);
    }

    public boolean hasFillExecID()
    {
        return fillExecIDLength > 0;
    }

    public MutableDirectBuffer fillExecID()
    {
        return fillExecID;
    }

    public String fillExecIDAsString()
    {
        return fillExecID.getStringWithoutLengthAscii(fillExecIDOffset, fillExecIDLength);
    }

    public FillsGroupEncoder fillExecID(final CharSequence value)
    {
        toBytes(value, fillExecID);
        fillExecIDOffset = 0;
        fillExecIDLength = value.length();
        return this;
    }

    public FillsGroupEncoder fillExecID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            fillExecID.wrap(buffer);
            fillExecIDOffset = value.offset();
            fillExecIDLength = value.length();
        }
        return this;
    }

    public FillsGroupEncoder fillExecID(final char[] value)
    {
        return fillExecID(value, 0, value.length);
    }

    public FillsGroupEncoder fillExecID(final char[] value, final int length)
    {
        return fillExecID(value, 0, length);
    }

    public FillsGroupEncoder fillExecID(final char[] value, final int offset, final int length)
    {
        toBytes(value, fillExecID, offset, length);
        fillExecIDOffset = 0;
        fillExecIDLength = length;
        return this;
    }

    private final DecimalFloat fillPx = new DecimalFloat();

    private boolean hasFillPx;

    public boolean hasFillPx()
    {
        return hasFillPx;
    }

    public FillsGroupEncoder fillPx(DecimalFloat value)
    {
        fillPx.set(value);
        hasFillPx = true;
        return this;
    }

    public FillsGroupEncoder fillPx(long value, int scale)
    {
        fillPx.set(value, scale);
        hasFillPx = true;
        return this;
    }

    public DecimalFloat fillPx()
    {
        return fillPx;
    }

    private final DecimalFloat fillQty = new DecimalFloat();

    private boolean hasFillQty;

    public boolean hasFillQty()
    {
        return hasFillQty;
    }

    public FillsGroupEncoder fillQty(DecimalFloat value)
    {
        fillQty.set(value);
        hasFillQty = true;
        return this;
    }

    public FillsGroupEncoder fillQty(long value, int scale)
    {
        fillQty.set(value, scale);
        hasFillQty = true;
        return this;
    }

    public DecimalFloat fillQty()
    {
        return fillQty;
    }

    private int fillLiquidityInd;

    private boolean hasFillLiquidityInd;

    public boolean hasFillLiquidityInd()
    {
        return hasFillLiquidityInd;
    }

    public FillsGroupEncoder fillLiquidityInd(int value)
    {
        fillLiquidityInd = value;
        hasFillLiquidityInd = true;
        return this;
    }

    public int fillLiquidityInd()
    {
        return fillLiquidityInd;
    }

    private final NestedParties4Encoder nestedParties4 = new NestedParties4Encoder();
    public NestedParties4Encoder nestedParties4()
    {
        return nestedParties4;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (fillExecIDLength > 0)
        {
            buffer.putBytes(position, fillExecIDHeader, 0, fillExecIDHeaderLength);
            position += fillExecIDHeaderLength;
            buffer.putBytes(position, fillExecID, fillExecIDOffset, fillExecIDLength);
            position += fillExecIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasFillPx)
        {
            buffer.putBytes(position, fillPxHeader, 0, fillPxHeaderLength);
            position += fillPxHeaderLength;
            position += buffer.putFloatAscii(position, fillPx);
            buffer.putSeparator(position);
            position++;
        }

        if (hasFillQty)
        {
            buffer.putBytes(position, fillQtyHeader, 0, fillQtyHeaderLength);
            position += fillQtyHeaderLength;
            position += buffer.putFloatAscii(position, fillQty);
            buffer.putSeparator(position);
            position++;
        }

        if (hasFillLiquidityInd)
        {
            buffer.putBytes(position, fillLiquidityIndHeader, 0, fillLiquidityIndHeaderLength);
            position += fillLiquidityIndHeaderLength;
            position += buffer.putIntAscii(position, fillLiquidityInd);
            buffer.putSeparator(position);
            position++;
        }

            position += nestedParties4.encode(buffer, position);
        if (next != null)
        {
            position += next.encode(buffer, position, remainingElements - 1);
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetFillExecID();
        this.resetFillPx();
        this.resetFillQty();
        this.resetFillLiquidityInd();
        nestedParties4.reset();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetFillExecID()
    {
        fillExecIDLength = 0;
    }

    public void resetFillPx()
    {
        hasFillPx = false;
    }

    public void resetFillQty()
    {
        hasFillQty = false;
    }

    public void resetFillLiquidityInd()
    {
        hasFillLiquidityInd = false;
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
        builder.append("\"MessageName\": \"FillsGroup\",\n");
        if (hasFillExecID())
        {
            indent(builder, level);
            builder.append("\"FillExecID\": \"");
            appendBuffer(builder, fillExecID, fillExecIDOffset, fillExecIDLength);
            builder.append("\",\n");
        }

        if (hasFillPx())
        {
            indent(builder, level);
            builder.append("\"FillPx\": \"");
            fillPx.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasFillQty())
        {
            indent(builder, level);
            builder.append("\"FillQty\": \"");
            fillQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasFillLiquidityInd())
        {
            indent(builder, level);
            builder.append("\"FillLiquidityInd\": \"");
            builder.append(fillLiquidityInd);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"NestedParties4\": ");
    nestedParties4.appendTo(builder, level + 1);
    builder.append("\n");
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public FillsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((FillsGroupEncoder)encoder);
    }

    public FillsGroupEncoder copyTo(final FillsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasFillExecID())
        {
            encoder.fillExecIDAsCopy(fillExecID.byteArray(), 0, fillExecIDLength);
        }

        if (hasFillPx())
        {
            encoder.fillPx(this.fillPx());
        }

        if (hasFillQty())
        {
            encoder.fillQty(this.fillQty());
        }

        if (hasFillLiquidityInd())
        {
            encoder.fillLiquidityInd(this.fillLiquidityInd());
        }


        nestedParties4.copyTo(encoder.nestedParties4());        return encoder;
    }

}
    private int noFillsGroupCounter;

    private boolean hasNoFillsGroupCounter;

    public boolean hasNoFillsGroupCounter()
    {
        return hasNoFillsGroupCounter;
    }

    public FillsGrpEncoder noFillsGroupCounter(int value)
    {
        noFillsGroupCounter = value;
        hasNoFillsGroupCounter = true;
        return this;
    }

    public int noFillsGroupCounter()
    {
        return noFillsGroupCounter;
    }


    private FillsGroupEncoder fillsGroup = null;

    public FillsGroupEncoder fillsGroup(final int numberOfElements)
    {
        hasNoFillsGroupCounter = true;
        noFillsGroupCounter = numberOfElements;
        if (fillsGroup == null)
        {
            fillsGroup = new FillsGroupEncoder();
        }
        return fillsGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoFillsGroupCounter)
        {
            buffer.putBytes(position, noFillsGroupCounterHeader, 0, noFillsGroupCounterHeaderLength);
            position += noFillsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noFillsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (fillsGroup != null)
        {
            position += fillsGroup.encode(buffer, position, noFillsGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetFillsGroup();
    }

    public void resetFillsGroup()
    {
        if (fillsGroup != null)
        {
            fillsGroup.reset();
        }
        noFillsGroupCounter = 0;
        hasNoFillsGroupCounter = false;
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
        builder.append("\"MessageName\": \"FillsGrp\",\n");
        if (hasNoFillsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"FillsGroup\": [\n");
            final int noFillsGroupCounter = this.noFillsGroupCounter;
            FillsGroupEncoder fillsGroup = this.fillsGroup;
            for (int i = 0; i < noFillsGroupCounter; i++)
            {
                indent(builder, level);
                fillsGroup.appendTo(builder, level + 1);
                if (i < (noFillsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                fillsGroup = fillsGroup.next();
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
    public FillsGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((FillsGrpEncoder)encoder);
    }

    public FillsGrpEncoder copyTo(final FillsGrpEncoder encoder)
    {
        encoder.reset();
        if (hasNoFillsGroupCounter)
        {
            final int size = this.noFillsGroupCounter;
            FillsGroupEncoder fillsGroup = this.fillsGroup;
            FillsGroupEncoder fillsGroupEncoder = encoder.fillsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (fillsGroup != null)
                {
                    fillsGroup.copyTo(fillsGroupEncoder);
                    fillsGroup = fillsGroup.next();
                    fillsGroupEncoder = fillsGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
