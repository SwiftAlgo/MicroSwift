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


public class ExecAllocGrpEncoder
{
    private static final int noExecsGroupCounterHeaderLength = 4;
    private static final byte[] noExecsGroupCounterHeader = new byte[] {49, 50, 52, (byte) '='};



public static class ExecsGroupEncoder
{
    private ExecsGroupEncoder next = null;

    public ExecsGroupEncoder next()
    {
        if (next == null)
        {
            next = new ExecsGroupEncoder();
        }
        return next;
    }

    private static final int lastQtyHeaderLength = 3;
    private static final byte[] lastQtyHeader = new byte[] {51, 50, (byte) '='};

    private static final int execIDHeaderLength = 3;
    private static final byte[] execIDHeader = new byte[] {49, 55, (byte) '='};

    private static final int secondaryExecIDHeaderLength = 4;
    private static final byte[] secondaryExecIDHeader = new byte[] {53, 50, 55, (byte) '='};

    private static final int lastPxHeaderLength = 3;
    private static final byte[] lastPxHeader = new byte[] {51, 49, (byte) '='};

    private static final int lastParPxHeaderLength = 4;
    private static final byte[] lastParPxHeader = new byte[] {54, 54, 57, (byte) '='};

    private static final int lastCapacityHeaderLength = 3;
    private static final byte[] lastCapacityHeader = new byte[] {50, 57, (byte) '='};

    private static final int tradeIDHeaderLength = 5;
    private static final byte[] tradeIDHeader = new byte[] {49, 48, 48, 51, (byte) '='};

    private static final int firmTradeIDHeaderLength = 5;
    private static final byte[] firmTradeIDHeader = new byte[] {49, 48, 52, 49, (byte) '='};

    private final DecimalFloat lastQty = new DecimalFloat();

    private boolean hasLastQty;

    public boolean hasLastQty()
    {
        return hasLastQty;
    }

    public ExecsGroupEncoder lastQty(DecimalFloat value)
    {
        lastQty.set(value);
        hasLastQty = true;
        return this;
    }

    public ExecsGroupEncoder lastQty(long value, int scale)
    {
        lastQty.set(value, scale);
        hasLastQty = true;
        return this;
    }

    public DecimalFloat lastQty()
    {
        return lastQty;
    }

    private final MutableDirectBuffer execID = new UnsafeBuffer();

    private int execIDOffset = 0;

    private int execIDLength = 0;

    public ExecsGroupEncoder execID(final DirectBuffer value, final int offset, final int length)
    {
        execID.wrap(value);
        execIDOffset = offset;
        execIDLength = length;
        return this;
    }

    public ExecsGroupEncoder execID(final DirectBuffer value, final int length)
    {
        return execID(value, 0, length);
    }

    public ExecsGroupEncoder execID(final DirectBuffer value)
    {
        return execID(value, 0, value.capacity());
    }

    public ExecsGroupEncoder execID(final byte[] value, final int offset, final int length)
    {
        execID.wrap(value);
        execIDOffset = offset;
        execIDLength = length;
        return this;
    }

    public ExecsGroupEncoder execIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(execID, value, offset, length);
        execIDOffset = offset;
        execIDLength = length;
        return this;
    }

    public ExecsGroupEncoder execID(final byte[] value, final int length)
    {
        return execID(value, 0, length);
    }

    public ExecsGroupEncoder execID(final byte[] value)
    {
        return execID(value, 0, value.length);
    }

    public boolean hasExecID()
    {
        return execIDLength > 0;
    }

    public MutableDirectBuffer execID()
    {
        return execID;
    }

    public String execIDAsString()
    {
        return execID.getStringWithoutLengthAscii(execIDOffset, execIDLength);
    }

    public ExecsGroupEncoder execID(final CharSequence value)
    {
        toBytes(value, execID);
        execIDOffset = 0;
        execIDLength = value.length();
        return this;
    }

    public ExecsGroupEncoder execID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            execID.wrap(buffer);
            execIDOffset = value.offset();
            execIDLength = value.length();
        }
        return this;
    }

    public ExecsGroupEncoder execID(final char[] value)
    {
        return execID(value, 0, value.length);
    }

    public ExecsGroupEncoder execID(final char[] value, final int length)
    {
        return execID(value, 0, length);
    }

    public ExecsGroupEncoder execID(final char[] value, final int offset, final int length)
    {
        toBytes(value, execID, offset, length);
        execIDOffset = 0;
        execIDLength = length;
        return this;
    }

    private final MutableDirectBuffer secondaryExecID = new UnsafeBuffer();

    private int secondaryExecIDOffset = 0;

    private int secondaryExecIDLength = 0;

    public ExecsGroupEncoder secondaryExecID(final DirectBuffer value, final int offset, final int length)
    {
        secondaryExecID.wrap(value);
        secondaryExecIDOffset = offset;
        secondaryExecIDLength = length;
        return this;
    }

    public ExecsGroupEncoder secondaryExecID(final DirectBuffer value, final int length)
    {
        return secondaryExecID(value, 0, length);
    }

    public ExecsGroupEncoder secondaryExecID(final DirectBuffer value)
    {
        return secondaryExecID(value, 0, value.capacity());
    }

    public ExecsGroupEncoder secondaryExecID(final byte[] value, final int offset, final int length)
    {
        secondaryExecID.wrap(value);
        secondaryExecIDOffset = offset;
        secondaryExecIDLength = length;
        return this;
    }

    public ExecsGroupEncoder secondaryExecIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(secondaryExecID, value, offset, length);
        secondaryExecIDOffset = offset;
        secondaryExecIDLength = length;
        return this;
    }

    public ExecsGroupEncoder secondaryExecID(final byte[] value, final int length)
    {
        return secondaryExecID(value, 0, length);
    }

    public ExecsGroupEncoder secondaryExecID(final byte[] value)
    {
        return secondaryExecID(value, 0, value.length);
    }

    public boolean hasSecondaryExecID()
    {
        return secondaryExecIDLength > 0;
    }

    public MutableDirectBuffer secondaryExecID()
    {
        return secondaryExecID;
    }

    public String secondaryExecIDAsString()
    {
        return secondaryExecID.getStringWithoutLengthAscii(secondaryExecIDOffset, secondaryExecIDLength);
    }

    public ExecsGroupEncoder secondaryExecID(final CharSequence value)
    {
        toBytes(value, secondaryExecID);
        secondaryExecIDOffset = 0;
        secondaryExecIDLength = value.length();
        return this;
    }

    public ExecsGroupEncoder secondaryExecID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            secondaryExecID.wrap(buffer);
            secondaryExecIDOffset = value.offset();
            secondaryExecIDLength = value.length();
        }
        return this;
    }

    public ExecsGroupEncoder secondaryExecID(final char[] value)
    {
        return secondaryExecID(value, 0, value.length);
    }

    public ExecsGroupEncoder secondaryExecID(final char[] value, final int length)
    {
        return secondaryExecID(value, 0, length);
    }

    public ExecsGroupEncoder secondaryExecID(final char[] value, final int offset, final int length)
    {
        toBytes(value, secondaryExecID, offset, length);
        secondaryExecIDOffset = 0;
        secondaryExecIDLength = length;
        return this;
    }

    private final DecimalFloat lastPx = new DecimalFloat();

    private boolean hasLastPx;

    public boolean hasLastPx()
    {
        return hasLastPx;
    }

    public ExecsGroupEncoder lastPx(DecimalFloat value)
    {
        lastPx.set(value);
        hasLastPx = true;
        return this;
    }

    public ExecsGroupEncoder lastPx(long value, int scale)
    {
        lastPx.set(value, scale);
        hasLastPx = true;
        return this;
    }

    public DecimalFloat lastPx()
    {
        return lastPx;
    }

    private final DecimalFloat lastParPx = new DecimalFloat();

    private boolean hasLastParPx;

    public boolean hasLastParPx()
    {
        return hasLastParPx;
    }

    public ExecsGroupEncoder lastParPx(DecimalFloat value)
    {
        lastParPx.set(value);
        hasLastParPx = true;
        return this;
    }

    public ExecsGroupEncoder lastParPx(long value, int scale)
    {
        lastParPx.set(value, scale);
        hasLastParPx = true;
        return this;
    }

    public DecimalFloat lastParPx()
    {
        return lastParPx;
    }

    private char lastCapacity;

    private boolean hasLastCapacity;

    public boolean hasLastCapacity()
    {
        return hasLastCapacity;
    }

    public ExecsGroupEncoder lastCapacity(char value)
    {
        lastCapacity = value;
        hasLastCapacity = true;
        return this;
    }

    public char lastCapacity()
    {
        return lastCapacity;
    }

    public ExecsGroupEncoder lastCapacity(LastCapacity value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == LastCapacity.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: lastCapacity Value: " + value );
            }
            if (value == LastCapacity.NULL_VAL)
            {
                return this;
            }
        }
        return lastCapacity(value.representation());
    }

    private final MutableDirectBuffer tradeID = new UnsafeBuffer();

    private int tradeIDOffset = 0;

    private int tradeIDLength = 0;

    public ExecsGroupEncoder tradeID(final DirectBuffer value, final int offset, final int length)
    {
        tradeID.wrap(value);
        tradeIDOffset = offset;
        tradeIDLength = length;
        return this;
    }

    public ExecsGroupEncoder tradeID(final DirectBuffer value, final int length)
    {
        return tradeID(value, 0, length);
    }

    public ExecsGroupEncoder tradeID(final DirectBuffer value)
    {
        return tradeID(value, 0, value.capacity());
    }

    public ExecsGroupEncoder tradeID(final byte[] value, final int offset, final int length)
    {
        tradeID.wrap(value);
        tradeIDOffset = offset;
        tradeIDLength = length;
        return this;
    }

    public ExecsGroupEncoder tradeIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradeID, value, offset, length);
        tradeIDOffset = offset;
        tradeIDLength = length;
        return this;
    }

    public ExecsGroupEncoder tradeID(final byte[] value, final int length)
    {
        return tradeID(value, 0, length);
    }

    public ExecsGroupEncoder tradeID(final byte[] value)
    {
        return tradeID(value, 0, value.length);
    }

    public boolean hasTradeID()
    {
        return tradeIDLength > 0;
    }

    public MutableDirectBuffer tradeID()
    {
        return tradeID;
    }

    public String tradeIDAsString()
    {
        return tradeID.getStringWithoutLengthAscii(tradeIDOffset, tradeIDLength);
    }

    public ExecsGroupEncoder tradeID(final CharSequence value)
    {
        toBytes(value, tradeID);
        tradeIDOffset = 0;
        tradeIDLength = value.length();
        return this;
    }

    public ExecsGroupEncoder tradeID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            tradeID.wrap(buffer);
            tradeIDOffset = value.offset();
            tradeIDLength = value.length();
        }
        return this;
    }

    public ExecsGroupEncoder tradeID(final char[] value)
    {
        return tradeID(value, 0, value.length);
    }

    public ExecsGroupEncoder tradeID(final char[] value, final int length)
    {
        return tradeID(value, 0, length);
    }

    public ExecsGroupEncoder tradeID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradeID, offset, length);
        tradeIDOffset = 0;
        tradeIDLength = length;
        return this;
    }

    private final MutableDirectBuffer firmTradeID = new UnsafeBuffer();

    private int firmTradeIDOffset = 0;

    private int firmTradeIDLength = 0;

    public ExecsGroupEncoder firmTradeID(final DirectBuffer value, final int offset, final int length)
    {
        firmTradeID.wrap(value);
        firmTradeIDOffset = offset;
        firmTradeIDLength = length;
        return this;
    }

    public ExecsGroupEncoder firmTradeID(final DirectBuffer value, final int length)
    {
        return firmTradeID(value, 0, length);
    }

    public ExecsGroupEncoder firmTradeID(final DirectBuffer value)
    {
        return firmTradeID(value, 0, value.capacity());
    }

    public ExecsGroupEncoder firmTradeID(final byte[] value, final int offset, final int length)
    {
        firmTradeID.wrap(value);
        firmTradeIDOffset = offset;
        firmTradeIDLength = length;
        return this;
    }

    public ExecsGroupEncoder firmTradeIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(firmTradeID, value, offset, length);
        firmTradeIDOffset = offset;
        firmTradeIDLength = length;
        return this;
    }

    public ExecsGroupEncoder firmTradeID(final byte[] value, final int length)
    {
        return firmTradeID(value, 0, length);
    }

    public ExecsGroupEncoder firmTradeID(final byte[] value)
    {
        return firmTradeID(value, 0, value.length);
    }

    public boolean hasFirmTradeID()
    {
        return firmTradeIDLength > 0;
    }

    public MutableDirectBuffer firmTradeID()
    {
        return firmTradeID;
    }

    public String firmTradeIDAsString()
    {
        return firmTradeID.getStringWithoutLengthAscii(firmTradeIDOffset, firmTradeIDLength);
    }

    public ExecsGroupEncoder firmTradeID(final CharSequence value)
    {
        toBytes(value, firmTradeID);
        firmTradeIDOffset = 0;
        firmTradeIDLength = value.length();
        return this;
    }

    public ExecsGroupEncoder firmTradeID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            firmTradeID.wrap(buffer);
            firmTradeIDOffset = value.offset();
            firmTradeIDLength = value.length();
        }
        return this;
    }

    public ExecsGroupEncoder firmTradeID(final char[] value)
    {
        return firmTradeID(value, 0, value.length);
    }

    public ExecsGroupEncoder firmTradeID(final char[] value, final int length)
    {
        return firmTradeID(value, 0, length);
    }

    public ExecsGroupEncoder firmTradeID(final char[] value, final int offset, final int length)
    {
        toBytes(value, firmTradeID, offset, length);
        firmTradeIDOffset = 0;
        firmTradeIDLength = length;
        return this;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (hasLastQty)
        {
            buffer.putBytes(position, lastQtyHeader, 0, lastQtyHeaderLength);
            position += lastQtyHeaderLength;
            position += buffer.putFloatAscii(position, lastQty);
            buffer.putSeparator(position);
            position++;
        }

        if (execIDLength > 0)
        {
            buffer.putBytes(position, execIDHeader, 0, execIDHeaderLength);
            position += execIDHeaderLength;
            buffer.putBytes(position, execID, execIDOffset, execIDLength);
            position += execIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (secondaryExecIDLength > 0)
        {
            buffer.putBytes(position, secondaryExecIDHeader, 0, secondaryExecIDHeaderLength);
            position += secondaryExecIDHeaderLength;
            buffer.putBytes(position, secondaryExecID, secondaryExecIDOffset, secondaryExecIDLength);
            position += secondaryExecIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasLastPx)
        {
            buffer.putBytes(position, lastPxHeader, 0, lastPxHeaderLength);
            position += lastPxHeaderLength;
            position += buffer.putFloatAscii(position, lastPx);
            buffer.putSeparator(position);
            position++;
        }

        if (hasLastParPx)
        {
            buffer.putBytes(position, lastParPxHeader, 0, lastParPxHeaderLength);
            position += lastParPxHeaderLength;
            position += buffer.putFloatAscii(position, lastParPx);
            buffer.putSeparator(position);
            position++;
        }

        if (hasLastCapacity)
        {
            buffer.putBytes(position, lastCapacityHeader, 0, lastCapacityHeaderLength);
            position += lastCapacityHeaderLength;
            position += buffer.putCharAscii(position, lastCapacity);
            buffer.putSeparator(position);
            position++;
        }

        if (tradeIDLength > 0)
        {
            buffer.putBytes(position, tradeIDHeader, 0, tradeIDHeaderLength);
            position += tradeIDHeaderLength;
            buffer.putBytes(position, tradeID, tradeIDOffset, tradeIDLength);
            position += tradeIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (firmTradeIDLength > 0)
        {
            buffer.putBytes(position, firmTradeIDHeader, 0, firmTradeIDHeaderLength);
            position += firmTradeIDHeaderLength;
            buffer.putBytes(position, firmTradeID, firmTradeIDOffset, firmTradeIDLength);
            position += firmTradeIDLength;
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
        this.resetLastQty();
        this.resetExecID();
        this.resetSecondaryExecID();
        this.resetLastPx();
        this.resetLastParPx();
        this.resetLastCapacity();
        this.resetTradeID();
        this.resetFirmTradeID();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetLastQty()
    {
        hasLastQty = false;
    }

    public void resetExecID()
    {
        execIDLength = 0;
    }

    public void resetSecondaryExecID()
    {
        secondaryExecIDLength = 0;
    }

    public void resetLastPx()
    {
        hasLastPx = false;
    }

    public void resetLastParPx()
    {
        hasLastParPx = false;
    }

    public void resetLastCapacity()
    {
        hasLastCapacity = false;
    }

    public void resetTradeID()
    {
        tradeIDLength = 0;
    }

    public void resetFirmTradeID()
    {
        firmTradeIDLength = 0;
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
        builder.append("\"MessageName\": \"ExecsGroup\",\n");
        if (hasLastQty())
        {
            indent(builder, level);
            builder.append("\"LastQty\": \"");
            lastQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasExecID())
        {
            indent(builder, level);
            builder.append("\"ExecID\": \"");
            appendBuffer(builder, execID, execIDOffset, execIDLength);
            builder.append("\",\n");
        }

        if (hasSecondaryExecID())
        {
            indent(builder, level);
            builder.append("\"SecondaryExecID\": \"");
            appendBuffer(builder, secondaryExecID, secondaryExecIDOffset, secondaryExecIDLength);
            builder.append("\",\n");
        }

        if (hasLastPx())
        {
            indent(builder, level);
            builder.append("\"LastPx\": \"");
            lastPx.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasLastParPx())
        {
            indent(builder, level);
            builder.append("\"LastParPx\": \"");
            lastParPx.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasLastCapacity())
        {
            indent(builder, level);
            builder.append("\"LastCapacity\": \"");
            builder.append(lastCapacity);
            builder.append("\",\n");
        }

        if (hasTradeID())
        {
            indent(builder, level);
            builder.append("\"TradeID\": \"");
            appendBuffer(builder, tradeID, tradeIDOffset, tradeIDLength);
            builder.append("\",\n");
        }

        if (hasFirmTradeID())
        {
            indent(builder, level);
            builder.append("\"FirmTradeID\": \"");
            appendBuffer(builder, firmTradeID, firmTradeIDOffset, firmTradeIDLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public ExecsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((ExecsGroupEncoder)encoder);
    }

    public ExecsGroupEncoder copyTo(final ExecsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasLastQty())
        {
            encoder.lastQty(this.lastQty());
        }

        if (hasExecID())
        {
            encoder.execIDAsCopy(execID.byteArray(), 0, execIDLength);
        }

        if (hasSecondaryExecID())
        {
            encoder.secondaryExecIDAsCopy(secondaryExecID.byteArray(), 0, secondaryExecIDLength);
        }

        if (hasLastPx())
        {
            encoder.lastPx(this.lastPx());
        }

        if (hasLastParPx())
        {
            encoder.lastParPx(this.lastParPx());
        }

        if (hasLastCapacity())
        {
            encoder.lastCapacity(this.lastCapacity());
        }

        if (hasTradeID())
        {
            encoder.tradeIDAsCopy(tradeID.byteArray(), 0, tradeIDLength);
        }

        if (hasFirmTradeID())
        {
            encoder.firmTradeIDAsCopy(firmTradeID.byteArray(), 0, firmTradeIDLength);
        }
        return encoder;
    }

}
    private int noExecsGroupCounter;

    private boolean hasNoExecsGroupCounter;

    public boolean hasNoExecsGroupCounter()
    {
        return hasNoExecsGroupCounter;
    }

    public ExecAllocGrpEncoder noExecsGroupCounter(int value)
    {
        noExecsGroupCounter = value;
        hasNoExecsGroupCounter = true;
        return this;
    }

    public int noExecsGroupCounter()
    {
        return noExecsGroupCounter;
    }


    private ExecsGroupEncoder execsGroup = null;

    public ExecsGroupEncoder execsGroup(final int numberOfElements)
    {
        hasNoExecsGroupCounter = true;
        noExecsGroupCounter = numberOfElements;
        if (execsGroup == null)
        {
            execsGroup = new ExecsGroupEncoder();
        }
        return execsGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoExecsGroupCounter)
        {
            buffer.putBytes(position, noExecsGroupCounterHeader, 0, noExecsGroupCounterHeaderLength);
            position += noExecsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noExecsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (execsGroup != null)
        {
            position += execsGroup.encode(buffer, position, noExecsGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetExecsGroup();
    }

    public void resetExecsGroup()
    {
        if (execsGroup != null)
        {
            execsGroup.reset();
        }
        noExecsGroupCounter = 0;
        hasNoExecsGroupCounter = false;
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
        builder.append("\"MessageName\": \"ExecAllocGrp\",\n");
        if (hasNoExecsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"ExecsGroup\": [\n");
            final int noExecsGroupCounter = this.noExecsGroupCounter;
            ExecsGroupEncoder execsGroup = this.execsGroup;
            for (int i = 0; i < noExecsGroupCounter; i++)
            {
                indent(builder, level);
                execsGroup.appendTo(builder, level + 1);
                if (i < (noExecsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                execsGroup = execsGroup.next();
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
    public ExecAllocGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((ExecAllocGrpEncoder)encoder);
    }

    public ExecAllocGrpEncoder copyTo(final ExecAllocGrpEncoder encoder)
    {
        encoder.reset();
        if (hasNoExecsGroupCounter)
        {
            final int size = this.noExecsGroupCounter;
            ExecsGroupEncoder execsGroup = this.execsGroup;
            ExecsGroupEncoder execsGroupEncoder = encoder.execsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (execsGroup != null)
                {
                    execsGroup.copyTo(execsGroupEncoder);
                    execsGroup = execsGroup.next();
                    execsGroupEncoder = execsGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
