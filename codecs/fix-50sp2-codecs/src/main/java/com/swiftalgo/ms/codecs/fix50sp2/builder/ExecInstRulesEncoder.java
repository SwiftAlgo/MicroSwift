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


public class ExecInstRulesEncoder
{
    private static final int noExecInstRulesGroupCounterHeaderLength = 5;
    private static final byte[] noExecInstRulesGroupCounterHeader = new byte[] {49, 50, 51, 50, (byte) '='};



public static class ExecInstRulesGroupEncoder
{
    private ExecInstRulesGroupEncoder next = null;

    public ExecInstRulesGroupEncoder next()
    {
        if (next == null)
        {
            next = new ExecInstRulesGroupEncoder();
        }
        return next;
    }

    private static final int execInstValueHeaderLength = 5;
    private static final byte[] execInstValueHeader = new byte[] {49, 51, 48, 56, (byte) '='};

    private char execInstValue;

    private boolean hasExecInstValue;

    public boolean hasExecInstValue()
    {
        return hasExecInstValue;
    }

    public ExecInstRulesGroupEncoder execInstValue(char value)
    {
        execInstValue = value;
        hasExecInstValue = true;
        return this;
    }

    public char execInstValue()
    {
        return execInstValue;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (hasExecInstValue)
        {
            buffer.putBytes(position, execInstValueHeader, 0, execInstValueHeaderLength);
            position += execInstValueHeaderLength;
            position += buffer.putCharAscii(position, execInstValue);
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
        this.resetExecInstValue();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetExecInstValue()
    {
        hasExecInstValue = false;
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
        builder.append("\"MessageName\": \"ExecInstRulesGroup\",\n");
        if (hasExecInstValue())
        {
            indent(builder, level);
            builder.append("\"ExecInstValue\": \"");
            builder.append(execInstValue);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public ExecInstRulesGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((ExecInstRulesGroupEncoder)encoder);
    }

    public ExecInstRulesGroupEncoder copyTo(final ExecInstRulesGroupEncoder encoder)
    {
        encoder.reset();
        if (hasExecInstValue())
        {
            encoder.execInstValue(this.execInstValue());
        }
        return encoder;
    }

}
    private int noExecInstRulesGroupCounter;

    private boolean hasNoExecInstRulesGroupCounter;

    public boolean hasNoExecInstRulesGroupCounter()
    {
        return hasNoExecInstRulesGroupCounter;
    }

    public ExecInstRulesEncoder noExecInstRulesGroupCounter(int value)
    {
        noExecInstRulesGroupCounter = value;
        hasNoExecInstRulesGroupCounter = true;
        return this;
    }

    public int noExecInstRulesGroupCounter()
    {
        return noExecInstRulesGroupCounter;
    }


    private ExecInstRulesGroupEncoder execInstRulesGroup = null;

    public ExecInstRulesGroupEncoder execInstRulesGroup(final int numberOfElements)
    {
        hasNoExecInstRulesGroupCounter = true;
        noExecInstRulesGroupCounter = numberOfElements;
        if (execInstRulesGroup == null)
        {
            execInstRulesGroup = new ExecInstRulesGroupEncoder();
        }
        return execInstRulesGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoExecInstRulesGroupCounter)
        {
            buffer.putBytes(position, noExecInstRulesGroupCounterHeader, 0, noExecInstRulesGroupCounterHeaderLength);
            position += noExecInstRulesGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noExecInstRulesGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (execInstRulesGroup != null)
        {
            position += execInstRulesGroup.encode(buffer, position, noExecInstRulesGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetExecInstRulesGroup();
    }

    public void resetExecInstRulesGroup()
    {
        if (execInstRulesGroup != null)
        {
            execInstRulesGroup.reset();
        }
        noExecInstRulesGroupCounter = 0;
        hasNoExecInstRulesGroupCounter = false;
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
        builder.append("\"MessageName\": \"ExecInstRules\",\n");
        if (hasNoExecInstRulesGroupCounter)
        {
            indent(builder, level);
            builder.append("\"ExecInstRulesGroup\": [\n");
            final int noExecInstRulesGroupCounter = this.noExecInstRulesGroupCounter;
            ExecInstRulesGroupEncoder execInstRulesGroup = this.execInstRulesGroup;
            for (int i = 0; i < noExecInstRulesGroupCounter; i++)
            {
                indent(builder, level);
                execInstRulesGroup.appendTo(builder, level + 1);
                if (i < (noExecInstRulesGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                execInstRulesGroup = execInstRulesGroup.next();
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
    public ExecInstRulesEncoder copyTo(final Encoder encoder)
    {
        return copyTo((ExecInstRulesEncoder)encoder);
    }

    public ExecInstRulesEncoder copyTo(final ExecInstRulesEncoder encoder)
    {
        encoder.reset();
        if (hasNoExecInstRulesGroupCounter)
        {
            final int size = this.noExecInstRulesGroupCounter;
            ExecInstRulesGroupEncoder execInstRulesGroup = this.execInstRulesGroup;
            ExecInstRulesGroupEncoder execInstRulesGroupEncoder = encoder.execInstRulesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (execInstRulesGroup != null)
                {
                    execInstRulesGroup.copyTo(execInstRulesGroupEncoder);
                    execInstRulesGroup = execInstRulesGroup.next();
                    execInstRulesGroupEncoder = execInstRulesGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
