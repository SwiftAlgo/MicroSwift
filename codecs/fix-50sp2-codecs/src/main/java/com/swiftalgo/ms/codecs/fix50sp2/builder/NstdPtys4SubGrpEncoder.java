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


public class NstdPtys4SubGrpEncoder
{
    private static final int noNested4PartySubIDsGroupCounterHeaderLength = 5;
    private static final byte[] noNested4PartySubIDsGroupCounterHeader = new byte[] {49, 52, 49, 51, (byte) '='};



public static class Nested4PartySubIDsGroupEncoder
{
    private Nested4PartySubIDsGroupEncoder next = null;

    public Nested4PartySubIDsGroupEncoder next()
    {
        if (next == null)
        {
            next = new Nested4PartySubIDsGroupEncoder();
        }
        return next;
    }

    private static final int nested4PartySubIDHeaderLength = 5;
    private static final byte[] nested4PartySubIDHeader = new byte[] {49, 52, 49, 50, (byte) '='};

    private static final int nested4PartySubIDTypeHeaderLength = 5;
    private static final byte[] nested4PartySubIDTypeHeader = new byte[] {49, 52, 49, 49, (byte) '='};

    private final MutableDirectBuffer nested4PartySubID = new UnsafeBuffer();

    private int nested4PartySubIDOffset = 0;

    private int nested4PartySubIDLength = 0;

    public Nested4PartySubIDsGroupEncoder nested4PartySubID(final DirectBuffer value, final int offset, final int length)
    {
        nested4PartySubID.wrap(value);
        nested4PartySubIDOffset = offset;
        nested4PartySubIDLength = length;
        return this;
    }

    public Nested4PartySubIDsGroupEncoder nested4PartySubID(final DirectBuffer value, final int length)
    {
        return nested4PartySubID(value, 0, length);
    }

    public Nested4PartySubIDsGroupEncoder nested4PartySubID(final DirectBuffer value)
    {
        return nested4PartySubID(value, 0, value.capacity());
    }

    public Nested4PartySubIDsGroupEncoder nested4PartySubID(final byte[] value, final int offset, final int length)
    {
        nested4PartySubID.wrap(value);
        nested4PartySubIDOffset = offset;
        nested4PartySubIDLength = length;
        return this;
    }

    public Nested4PartySubIDsGroupEncoder nested4PartySubIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(nested4PartySubID, value, offset, length);
        nested4PartySubIDOffset = offset;
        nested4PartySubIDLength = length;
        return this;
    }

    public Nested4PartySubIDsGroupEncoder nested4PartySubID(final byte[] value, final int length)
    {
        return nested4PartySubID(value, 0, length);
    }

    public Nested4PartySubIDsGroupEncoder nested4PartySubID(final byte[] value)
    {
        return nested4PartySubID(value, 0, value.length);
    }

    public boolean hasNested4PartySubID()
    {
        return nested4PartySubIDLength > 0;
    }

    public MutableDirectBuffer nested4PartySubID()
    {
        return nested4PartySubID;
    }

    public String nested4PartySubIDAsString()
    {
        return nested4PartySubID.getStringWithoutLengthAscii(nested4PartySubIDOffset, nested4PartySubIDLength);
    }

    public Nested4PartySubIDsGroupEncoder nested4PartySubID(final CharSequence value)
    {
        toBytes(value, nested4PartySubID);
        nested4PartySubIDOffset = 0;
        nested4PartySubIDLength = value.length();
        return this;
    }

    public Nested4PartySubIDsGroupEncoder nested4PartySubID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            nested4PartySubID.wrap(buffer);
            nested4PartySubIDOffset = value.offset();
            nested4PartySubIDLength = value.length();
        }
        return this;
    }

    public Nested4PartySubIDsGroupEncoder nested4PartySubID(final char[] value)
    {
        return nested4PartySubID(value, 0, value.length);
    }

    public Nested4PartySubIDsGroupEncoder nested4PartySubID(final char[] value, final int length)
    {
        return nested4PartySubID(value, 0, length);
    }

    public Nested4PartySubIDsGroupEncoder nested4PartySubID(final char[] value, final int offset, final int length)
    {
        toBytes(value, nested4PartySubID, offset, length);
        nested4PartySubIDOffset = 0;
        nested4PartySubIDLength = length;
        return this;
    }

    private int nested4PartySubIDType;

    private boolean hasNested4PartySubIDType;

    public boolean hasNested4PartySubIDType()
    {
        return hasNested4PartySubIDType;
    }

    public Nested4PartySubIDsGroupEncoder nested4PartySubIDType(int value)
    {
        nested4PartySubIDType = value;
        hasNested4PartySubIDType = true;
        return this;
    }

    public int nested4PartySubIDType()
    {
        return nested4PartySubIDType;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (nested4PartySubIDLength > 0)
        {
            buffer.putBytes(position, nested4PartySubIDHeader, 0, nested4PartySubIDHeaderLength);
            position += nested4PartySubIDHeaderLength;
            buffer.putBytes(position, nested4PartySubID, nested4PartySubIDOffset, nested4PartySubIDLength);
            position += nested4PartySubIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasNested4PartySubIDType)
        {
            buffer.putBytes(position, nested4PartySubIDTypeHeader, 0, nested4PartySubIDTypeHeaderLength);
            position += nested4PartySubIDTypeHeaderLength;
            position += buffer.putIntAscii(position, nested4PartySubIDType);
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
        this.resetNested4PartySubID();
        this.resetNested4PartySubIDType();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetNested4PartySubID()
    {
        nested4PartySubIDLength = 0;
    }

    public void resetNested4PartySubIDType()
    {
        hasNested4PartySubIDType = false;
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
        builder.append("\"MessageName\": \"Nested4PartySubIDsGroup\",\n");
        if (hasNested4PartySubID())
        {
            indent(builder, level);
            builder.append("\"Nested4PartySubID\": \"");
            appendBuffer(builder, nested4PartySubID, nested4PartySubIDOffset, nested4PartySubIDLength);
            builder.append("\",\n");
        }

        if (hasNested4PartySubIDType())
        {
            indent(builder, level);
            builder.append("\"Nested4PartySubIDType\": \"");
            builder.append(nested4PartySubIDType);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public Nested4PartySubIDsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((Nested4PartySubIDsGroupEncoder)encoder);
    }

    public Nested4PartySubIDsGroupEncoder copyTo(final Nested4PartySubIDsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasNested4PartySubID())
        {
            encoder.nested4PartySubIDAsCopy(nested4PartySubID.byteArray(), 0, nested4PartySubIDLength);
        }

        if (hasNested4PartySubIDType())
        {
            encoder.nested4PartySubIDType(this.nested4PartySubIDType());
        }
        return encoder;
    }

}
    private int noNested4PartySubIDsGroupCounter;

    private boolean hasNoNested4PartySubIDsGroupCounter;

    public boolean hasNoNested4PartySubIDsGroupCounter()
    {
        return hasNoNested4PartySubIDsGroupCounter;
    }

    public NstdPtys4SubGrpEncoder noNested4PartySubIDsGroupCounter(int value)
    {
        noNested4PartySubIDsGroupCounter = value;
        hasNoNested4PartySubIDsGroupCounter = true;
        return this;
    }

    public int noNested4PartySubIDsGroupCounter()
    {
        return noNested4PartySubIDsGroupCounter;
    }


    private Nested4PartySubIDsGroupEncoder nested4PartySubIDsGroup = null;

    public Nested4PartySubIDsGroupEncoder nested4PartySubIDsGroup(final int numberOfElements)
    {
        hasNoNested4PartySubIDsGroupCounter = true;
        noNested4PartySubIDsGroupCounter = numberOfElements;
        if (nested4PartySubIDsGroup == null)
        {
            nested4PartySubIDsGroup = new Nested4PartySubIDsGroupEncoder();
        }
        return nested4PartySubIDsGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoNested4PartySubIDsGroupCounter)
        {
            buffer.putBytes(position, noNested4PartySubIDsGroupCounterHeader, 0, noNested4PartySubIDsGroupCounterHeaderLength);
            position += noNested4PartySubIDsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noNested4PartySubIDsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (nested4PartySubIDsGroup != null)
        {
            position += nested4PartySubIDsGroup.encode(buffer, position, noNested4PartySubIDsGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetNested4PartySubIDsGroup();
    }

    public void resetNested4PartySubIDsGroup()
    {
        if (nested4PartySubIDsGroup != null)
        {
            nested4PartySubIDsGroup.reset();
        }
        noNested4PartySubIDsGroupCounter = 0;
        hasNoNested4PartySubIDsGroupCounter = false;
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
        builder.append("\"MessageName\": \"NstdPtys4SubGrp\",\n");
        if (hasNoNested4PartySubIDsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"Nested4PartySubIDsGroup\": [\n");
            final int noNested4PartySubIDsGroupCounter = this.noNested4PartySubIDsGroupCounter;
            Nested4PartySubIDsGroupEncoder nested4PartySubIDsGroup = this.nested4PartySubIDsGroup;
            for (int i = 0; i < noNested4PartySubIDsGroupCounter; i++)
            {
                indent(builder, level);
                nested4PartySubIDsGroup.appendTo(builder, level + 1);
                if (i < (noNested4PartySubIDsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                nested4PartySubIDsGroup = nested4PartySubIDsGroup.next();
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
    public NstdPtys4SubGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((NstdPtys4SubGrpEncoder)encoder);
    }

    public NstdPtys4SubGrpEncoder copyTo(final NstdPtys4SubGrpEncoder encoder)
    {
        encoder.reset();
        if (hasNoNested4PartySubIDsGroupCounter)
        {
            final int size = this.noNested4PartySubIDsGroupCounter;
            Nested4PartySubIDsGroupEncoder nested4PartySubIDsGroup = this.nested4PartySubIDsGroup;
            Nested4PartySubIDsGroupEncoder nested4PartySubIDsGroupEncoder = encoder.nested4PartySubIDsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (nested4PartySubIDsGroup != null)
                {
                    nested4PartySubIDsGroup.copyTo(nested4PartySubIDsGroupEncoder);
                    nested4PartySubIDsGroup = nested4PartySubIDsGroup.next();
                    nested4PartySubIDsGroupEncoder = nested4PartySubIDsGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
