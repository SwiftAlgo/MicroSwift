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


public class ClrInstGrpEncoder
{
    private static final int noClearingInstructionsGroupCounterHeaderLength = 4;
    private static final byte[] noClearingInstructionsGroupCounterHeader = new byte[] {53, 55, 54, (byte) '='};



public static class ClearingInstructionsGroupEncoder
{
    private ClearingInstructionsGroupEncoder next = null;

    public ClearingInstructionsGroupEncoder next()
    {
        if (next == null)
        {
            next = new ClearingInstructionsGroupEncoder();
        }
        return next;
    }

    private static final int clearingInstructionHeaderLength = 4;
    private static final byte[] clearingInstructionHeader = new byte[] {53, 55, 55, (byte) '='};

    private int clearingInstruction;

    private boolean hasClearingInstruction;

    public boolean hasClearingInstruction()
    {
        return hasClearingInstruction;
    }

    public ClearingInstructionsGroupEncoder clearingInstruction(int value)
    {
        clearingInstruction = value;
        hasClearingInstruction = true;
        return this;
    }

    public int clearingInstruction()
    {
        return clearingInstruction;
    }

    public ClearingInstructionsGroupEncoder clearingInstruction(ClearingInstruction value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == ClearingInstruction.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: clearingInstruction Value: " + value );
            }
            if (value == ClearingInstruction.NULL_VAL)
            {
                return this;
            }
        }
        return clearingInstruction(value.representation());
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (hasClearingInstruction)
        {
            buffer.putBytes(position, clearingInstructionHeader, 0, clearingInstructionHeaderLength);
            position += clearingInstructionHeaderLength;
            position += buffer.putIntAscii(position, clearingInstruction);
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
        this.resetClearingInstruction();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetClearingInstruction()
    {
        hasClearingInstruction = false;
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
        builder.append("\"MessageName\": \"ClearingInstructionsGroup\",\n");
        if (hasClearingInstruction())
        {
            indent(builder, level);
            builder.append("\"ClearingInstruction\": \"");
            builder.append(clearingInstruction);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public ClearingInstructionsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((ClearingInstructionsGroupEncoder)encoder);
    }

    public ClearingInstructionsGroupEncoder copyTo(final ClearingInstructionsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasClearingInstruction())
        {
            encoder.clearingInstruction(this.clearingInstruction());
        }
        return encoder;
    }

}
    private int noClearingInstructionsGroupCounter;

    private boolean hasNoClearingInstructionsGroupCounter;

    public boolean hasNoClearingInstructionsGroupCounter()
    {
        return hasNoClearingInstructionsGroupCounter;
    }

    public ClrInstGrpEncoder noClearingInstructionsGroupCounter(int value)
    {
        noClearingInstructionsGroupCounter = value;
        hasNoClearingInstructionsGroupCounter = true;
        return this;
    }

    public int noClearingInstructionsGroupCounter()
    {
        return noClearingInstructionsGroupCounter;
    }


    private ClearingInstructionsGroupEncoder clearingInstructionsGroup = null;

    public ClearingInstructionsGroupEncoder clearingInstructionsGroup(final int numberOfElements)
    {
        hasNoClearingInstructionsGroupCounter = true;
        noClearingInstructionsGroupCounter = numberOfElements;
        if (clearingInstructionsGroup == null)
        {
            clearingInstructionsGroup = new ClearingInstructionsGroupEncoder();
        }
        return clearingInstructionsGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoClearingInstructionsGroupCounter)
        {
            buffer.putBytes(position, noClearingInstructionsGroupCounterHeader, 0, noClearingInstructionsGroupCounterHeaderLength);
            position += noClearingInstructionsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noClearingInstructionsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (clearingInstructionsGroup != null)
        {
            position += clearingInstructionsGroup.encode(buffer, position, noClearingInstructionsGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetClearingInstructionsGroup();
    }

    public void resetClearingInstructionsGroup()
    {
        if (clearingInstructionsGroup != null)
        {
            clearingInstructionsGroup.reset();
        }
        noClearingInstructionsGroupCounter = 0;
        hasNoClearingInstructionsGroupCounter = false;
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
        builder.append("\"MessageName\": \"ClrInstGrp\",\n");
        if (hasNoClearingInstructionsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"ClearingInstructionsGroup\": [\n");
            final int noClearingInstructionsGroupCounter = this.noClearingInstructionsGroupCounter;
            ClearingInstructionsGroupEncoder clearingInstructionsGroup = this.clearingInstructionsGroup;
            for (int i = 0; i < noClearingInstructionsGroupCounter; i++)
            {
                indent(builder, level);
                clearingInstructionsGroup.appendTo(builder, level + 1);
                if (i < (noClearingInstructionsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                clearingInstructionsGroup = clearingInstructionsGroup.next();
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
    public ClrInstGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((ClrInstGrpEncoder)encoder);
    }

    public ClrInstGrpEncoder copyTo(final ClrInstGrpEncoder encoder)
    {
        encoder.reset();
        if (hasNoClearingInstructionsGroupCounter)
        {
            final int size = this.noClearingInstructionsGroupCounter;
            ClearingInstructionsGroupEncoder clearingInstructionsGroup = this.clearingInstructionsGroup;
            ClearingInstructionsGroupEncoder clearingInstructionsGroupEncoder = encoder.clearingInstructionsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (clearingInstructionsGroup != null)
                {
                    clearingInstructionsGroup.copyTo(clearingInstructionsGroupEncoder);
                    clearingInstructionsGroup = clearingInstructionsGroup.next();
                    clearingInstructionsGroupEncoder = clearingInstructionsGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
