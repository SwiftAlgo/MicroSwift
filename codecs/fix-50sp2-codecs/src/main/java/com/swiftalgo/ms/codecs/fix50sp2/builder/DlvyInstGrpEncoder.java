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


public class DlvyInstGrpEncoder
{
    private static final int noDlvyInstGroupCounterHeaderLength = 3;
    private static final byte[] noDlvyInstGroupCounterHeader = new byte[] {56, 53, (byte) '='};



public static class DlvyInstGroupEncoder
{
    private DlvyInstGroupEncoder next = null;

    public DlvyInstGroupEncoder next()
    {
        if (next == null)
        {
            next = new DlvyInstGroupEncoder();
        }
        return next;
    }

    private static final int settlInstSourceHeaderLength = 4;
    private static final byte[] settlInstSourceHeader = new byte[] {49, 54, 53, (byte) '='};

    private static final int dlvyInstTypeHeaderLength = 4;
    private static final byte[] dlvyInstTypeHeader = new byte[] {55, 56, 55, (byte) '='};

    private char settlInstSource;

    private boolean hasSettlInstSource;

    public boolean hasSettlInstSource()
    {
        return hasSettlInstSource;
    }

    public DlvyInstGroupEncoder settlInstSource(char value)
    {
        settlInstSource = value;
        hasSettlInstSource = true;
        return this;
    }

    public char settlInstSource()
    {
        return settlInstSource;
    }

    public DlvyInstGroupEncoder settlInstSource(SettlInstSource value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == SettlInstSource.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: settlInstSource Value: " + value );
            }
            if (value == SettlInstSource.NULL_VAL)
            {
                return this;
            }
        }
        return settlInstSource(value.representation());
    }

    private char dlvyInstType;

    private boolean hasDlvyInstType;

    public boolean hasDlvyInstType()
    {
        return hasDlvyInstType;
    }

    public DlvyInstGroupEncoder dlvyInstType(char value)
    {
        dlvyInstType = value;
        hasDlvyInstType = true;
        return this;
    }

    public char dlvyInstType()
    {
        return dlvyInstType;
    }

    public DlvyInstGroupEncoder dlvyInstType(DlvyInstType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == DlvyInstType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: dlvyInstType Value: " + value );
            }
            if (value == DlvyInstType.NULL_VAL)
            {
                return this;
            }
        }
        return dlvyInstType(value.representation());
    }

    private final SettlPartiesEncoder settlParties = new SettlPartiesEncoder();
    public SettlPartiesEncoder settlParties()
    {
        return settlParties;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (hasSettlInstSource)
        {
            buffer.putBytes(position, settlInstSourceHeader, 0, settlInstSourceHeaderLength);
            position += settlInstSourceHeaderLength;
            position += buffer.putCharAscii(position, settlInstSource);
            buffer.putSeparator(position);
            position++;
        }

        if (hasDlvyInstType)
        {
            buffer.putBytes(position, dlvyInstTypeHeader, 0, dlvyInstTypeHeaderLength);
            position += dlvyInstTypeHeaderLength;
            position += buffer.putCharAscii(position, dlvyInstType);
            buffer.putSeparator(position);
            position++;
        }

            position += settlParties.encode(buffer, position);
        if (next != null)
        {
            position += next.encode(buffer, position, remainingElements - 1);
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetSettlInstSource();
        this.resetDlvyInstType();
        settlParties.reset();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetSettlInstSource()
    {
        hasSettlInstSource = false;
    }

    public void resetDlvyInstType()
    {
        hasDlvyInstType = false;
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
        builder.append("\"MessageName\": \"DlvyInstGroup\",\n");
        if (hasSettlInstSource())
        {
            indent(builder, level);
            builder.append("\"SettlInstSource\": \"");
            builder.append(settlInstSource);
            builder.append("\",\n");
        }

        if (hasDlvyInstType())
        {
            indent(builder, level);
            builder.append("\"DlvyInstType\": \"");
            builder.append(dlvyInstType);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"SettlParties\": ");
    settlParties.appendTo(builder, level + 1);
    builder.append("\n");
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public DlvyInstGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((DlvyInstGroupEncoder)encoder);
    }

    public DlvyInstGroupEncoder copyTo(final DlvyInstGroupEncoder encoder)
    {
        encoder.reset();
        if (hasSettlInstSource())
        {
            encoder.settlInstSource(this.settlInstSource());
        }

        if (hasDlvyInstType())
        {
            encoder.dlvyInstType(this.dlvyInstType());
        }


        settlParties.copyTo(encoder.settlParties());        return encoder;
    }

}
    private int noDlvyInstGroupCounter;

    private boolean hasNoDlvyInstGroupCounter;

    public boolean hasNoDlvyInstGroupCounter()
    {
        return hasNoDlvyInstGroupCounter;
    }

    public DlvyInstGrpEncoder noDlvyInstGroupCounter(int value)
    {
        noDlvyInstGroupCounter = value;
        hasNoDlvyInstGroupCounter = true;
        return this;
    }

    public int noDlvyInstGroupCounter()
    {
        return noDlvyInstGroupCounter;
    }


    private DlvyInstGroupEncoder dlvyInstGroup = null;

    public DlvyInstGroupEncoder dlvyInstGroup(final int numberOfElements)
    {
        hasNoDlvyInstGroupCounter = true;
        noDlvyInstGroupCounter = numberOfElements;
        if (dlvyInstGroup == null)
        {
            dlvyInstGroup = new DlvyInstGroupEncoder();
        }
        return dlvyInstGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoDlvyInstGroupCounter)
        {
            buffer.putBytes(position, noDlvyInstGroupCounterHeader, 0, noDlvyInstGroupCounterHeaderLength);
            position += noDlvyInstGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noDlvyInstGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (dlvyInstGroup != null)
        {
            position += dlvyInstGroup.encode(buffer, position, noDlvyInstGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetDlvyInstGroup();
    }

    public void resetDlvyInstGroup()
    {
        if (dlvyInstGroup != null)
        {
            dlvyInstGroup.reset();
        }
        noDlvyInstGroupCounter = 0;
        hasNoDlvyInstGroupCounter = false;
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
        builder.append("\"MessageName\": \"DlvyInstGrp\",\n");
        if (hasNoDlvyInstGroupCounter)
        {
            indent(builder, level);
            builder.append("\"DlvyInstGroup\": [\n");
            final int noDlvyInstGroupCounter = this.noDlvyInstGroupCounter;
            DlvyInstGroupEncoder dlvyInstGroup = this.dlvyInstGroup;
            for (int i = 0; i < noDlvyInstGroupCounter; i++)
            {
                indent(builder, level);
                dlvyInstGroup.appendTo(builder, level + 1);
                if (i < (noDlvyInstGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                dlvyInstGroup = dlvyInstGroup.next();
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
    public DlvyInstGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((DlvyInstGrpEncoder)encoder);
    }

    public DlvyInstGrpEncoder copyTo(final DlvyInstGrpEncoder encoder)
    {
        encoder.reset();
        if (hasNoDlvyInstGroupCounter)
        {
            final int size = this.noDlvyInstGroupCounter;
            DlvyInstGroupEncoder dlvyInstGroup = this.dlvyInstGroup;
            DlvyInstGroupEncoder dlvyInstGroupEncoder = encoder.dlvyInstGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (dlvyInstGroup != null)
                {
                    dlvyInstGroup.copyTo(dlvyInstGroupEncoder);
                    dlvyInstGroup = dlvyInstGroup.next();
                    dlvyInstGroupEncoder = dlvyInstGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
