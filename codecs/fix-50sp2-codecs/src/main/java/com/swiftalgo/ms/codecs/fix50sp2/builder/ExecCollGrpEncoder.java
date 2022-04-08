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


public class ExecCollGrpEncoder
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

    private static final int execIDHeaderLength = 3;
    private static final byte[] execIDHeader = new byte[] {49, 55, (byte) '='};

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

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (execIDLength > 0)
        {
            buffer.putBytes(position, execIDHeader, 0, execIDHeaderLength);
            position += execIDHeaderLength;
            buffer.putBytes(position, execID, execIDOffset, execIDLength);
            position += execIDLength;
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
        this.resetExecID();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetExecID()
    {
        execIDLength = 0;
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
        if (hasExecID())
        {
            indent(builder, level);
            builder.append("\"ExecID\": \"");
            appendBuffer(builder, execID, execIDOffset, execIDLength);
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
        if (hasExecID())
        {
            encoder.execIDAsCopy(execID.byteArray(), 0, execIDLength);
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

    public ExecCollGrpEncoder noExecsGroupCounter(int value)
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
        builder.append("\"MessageName\": \"ExecCollGrp\",\n");
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
    public ExecCollGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((ExecCollGrpEncoder)encoder);
    }

    public ExecCollGrpEncoder copyTo(final ExecCollGrpEncoder encoder)
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
