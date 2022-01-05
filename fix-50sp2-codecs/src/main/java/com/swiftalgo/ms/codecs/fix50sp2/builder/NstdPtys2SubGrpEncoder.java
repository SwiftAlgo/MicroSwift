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


public class NstdPtys2SubGrpEncoder
{
    private static final int noNested2PartySubIDsGroupCounterHeaderLength = 4;
    private static final byte[] noNested2PartySubIDsGroupCounterHeader = new byte[] {56, 48, 54, (byte) '='};



public static class Nested2PartySubIDsGroupEncoder
{
    private Nested2PartySubIDsGroupEncoder next = null;

    public Nested2PartySubIDsGroupEncoder next()
    {
        if (next == null)
        {
            next = new Nested2PartySubIDsGroupEncoder();
        }
        return next;
    }

    private static final int nested2PartySubIDHeaderLength = 4;
    private static final byte[] nested2PartySubIDHeader = new byte[] {55, 54, 48, (byte) '='};

    private static final int nested2PartySubIDTypeHeaderLength = 4;
    private static final byte[] nested2PartySubIDTypeHeader = new byte[] {56, 48, 55, (byte) '='};

    private final MutableDirectBuffer nested2PartySubID = new UnsafeBuffer();

    private int nested2PartySubIDOffset = 0;

    private int nested2PartySubIDLength = 0;

    public Nested2PartySubIDsGroupEncoder nested2PartySubID(final DirectBuffer value, final int offset, final int length)
    {
        nested2PartySubID.wrap(value);
        nested2PartySubIDOffset = offset;
        nested2PartySubIDLength = length;
        return this;
    }

    public Nested2PartySubIDsGroupEncoder nested2PartySubID(final DirectBuffer value, final int length)
    {
        return nested2PartySubID(value, 0, length);
    }

    public Nested2PartySubIDsGroupEncoder nested2PartySubID(final DirectBuffer value)
    {
        return nested2PartySubID(value, 0, value.capacity());
    }

    public Nested2PartySubIDsGroupEncoder nested2PartySubID(final byte[] value, final int offset, final int length)
    {
        nested2PartySubID.wrap(value);
        nested2PartySubIDOffset = offset;
        nested2PartySubIDLength = length;
        return this;
    }

    public Nested2PartySubIDsGroupEncoder nested2PartySubIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(nested2PartySubID, value, offset, length);
        nested2PartySubIDOffset = offset;
        nested2PartySubIDLength = length;
        return this;
    }

    public Nested2PartySubIDsGroupEncoder nested2PartySubID(final byte[] value, final int length)
    {
        return nested2PartySubID(value, 0, length);
    }

    public Nested2PartySubIDsGroupEncoder nested2PartySubID(final byte[] value)
    {
        return nested2PartySubID(value, 0, value.length);
    }

    public boolean hasNested2PartySubID()
    {
        return nested2PartySubIDLength > 0;
    }

    public MutableDirectBuffer nested2PartySubID()
    {
        return nested2PartySubID;
    }

    public String nested2PartySubIDAsString()
    {
        return nested2PartySubID.getStringWithoutLengthAscii(nested2PartySubIDOffset, nested2PartySubIDLength);
    }

    public Nested2PartySubIDsGroupEncoder nested2PartySubID(final CharSequence value)
    {
        toBytes(value, nested2PartySubID);
        nested2PartySubIDOffset = 0;
        nested2PartySubIDLength = value.length();
        return this;
    }

    public Nested2PartySubIDsGroupEncoder nested2PartySubID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            nested2PartySubID.wrap(buffer);
            nested2PartySubIDOffset = value.offset();
            nested2PartySubIDLength = value.length();
        }
        return this;
    }

    public Nested2PartySubIDsGroupEncoder nested2PartySubID(final char[] value)
    {
        return nested2PartySubID(value, 0, value.length);
    }

    public Nested2PartySubIDsGroupEncoder nested2PartySubID(final char[] value, final int length)
    {
        return nested2PartySubID(value, 0, length);
    }

    public Nested2PartySubIDsGroupEncoder nested2PartySubID(final char[] value, final int offset, final int length)
    {
        toBytes(value, nested2PartySubID, offset, length);
        nested2PartySubIDOffset = 0;
        nested2PartySubIDLength = length;
        return this;
    }

    private int nested2PartySubIDType;

    private boolean hasNested2PartySubIDType;

    public boolean hasNested2PartySubIDType()
    {
        return hasNested2PartySubIDType;
    }

    public Nested2PartySubIDsGroupEncoder nested2PartySubIDType(int value)
    {
        nested2PartySubIDType = value;
        hasNested2PartySubIDType = true;
        return this;
    }

    public int nested2PartySubIDType()
    {
        return nested2PartySubIDType;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (nested2PartySubIDLength > 0)
        {
            buffer.putBytes(position, nested2PartySubIDHeader, 0, nested2PartySubIDHeaderLength);
            position += nested2PartySubIDHeaderLength;
            buffer.putBytes(position, nested2PartySubID, nested2PartySubIDOffset, nested2PartySubIDLength);
            position += nested2PartySubIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasNested2PartySubIDType)
        {
            buffer.putBytes(position, nested2PartySubIDTypeHeader, 0, nested2PartySubIDTypeHeaderLength);
            position += nested2PartySubIDTypeHeaderLength;
            position += buffer.putIntAscii(position, nested2PartySubIDType);
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
        this.resetNested2PartySubID();
        this.resetNested2PartySubIDType();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetNested2PartySubID()
    {
        nested2PartySubIDLength = 0;
    }

    public void resetNested2PartySubIDType()
    {
        hasNested2PartySubIDType = false;
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
        builder.append("\"MessageName\": \"Nested2PartySubIDsGroup\",\n");
        if (hasNested2PartySubID())
        {
            indent(builder, level);
            builder.append("\"Nested2PartySubID\": \"");
            appendBuffer(builder, nested2PartySubID, nested2PartySubIDOffset, nested2PartySubIDLength);
            builder.append("\",\n");
        }

        if (hasNested2PartySubIDType())
        {
            indent(builder, level);
            builder.append("\"Nested2PartySubIDType\": \"");
            builder.append(nested2PartySubIDType);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public Nested2PartySubIDsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((Nested2PartySubIDsGroupEncoder)encoder);
    }

    public Nested2PartySubIDsGroupEncoder copyTo(final Nested2PartySubIDsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasNested2PartySubID())
        {
            encoder.nested2PartySubIDAsCopy(nested2PartySubID.byteArray(), 0, nested2PartySubIDLength);
        }

        if (hasNested2PartySubIDType())
        {
            encoder.nested2PartySubIDType(this.nested2PartySubIDType());
        }
        return encoder;
    }

}
    private int noNested2PartySubIDsGroupCounter;

    private boolean hasNoNested2PartySubIDsGroupCounter;

    public boolean hasNoNested2PartySubIDsGroupCounter()
    {
        return hasNoNested2PartySubIDsGroupCounter;
    }

    public NstdPtys2SubGrpEncoder noNested2PartySubIDsGroupCounter(int value)
    {
        noNested2PartySubIDsGroupCounter = value;
        hasNoNested2PartySubIDsGroupCounter = true;
        return this;
    }

    public int noNested2PartySubIDsGroupCounter()
    {
        return noNested2PartySubIDsGroupCounter;
    }


    private Nested2PartySubIDsGroupEncoder nested2PartySubIDsGroup = null;

    public Nested2PartySubIDsGroupEncoder nested2PartySubIDsGroup(final int numberOfElements)
    {
        hasNoNested2PartySubIDsGroupCounter = true;
        noNested2PartySubIDsGroupCounter = numberOfElements;
        if (nested2PartySubIDsGroup == null)
        {
            nested2PartySubIDsGroup = new Nested2PartySubIDsGroupEncoder();
        }
        return nested2PartySubIDsGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoNested2PartySubIDsGroupCounter)
        {
            buffer.putBytes(position, noNested2PartySubIDsGroupCounterHeader, 0, noNested2PartySubIDsGroupCounterHeaderLength);
            position += noNested2PartySubIDsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noNested2PartySubIDsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (nested2PartySubIDsGroup != null)
        {
            position += nested2PartySubIDsGroup.encode(buffer, position, noNested2PartySubIDsGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetNested2PartySubIDsGroup();
    }

    public void resetNested2PartySubIDsGroup()
    {
        if (nested2PartySubIDsGroup != null)
        {
            nested2PartySubIDsGroup.reset();
        }
        noNested2PartySubIDsGroupCounter = 0;
        hasNoNested2PartySubIDsGroupCounter = false;
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
        builder.append("\"MessageName\": \"NstdPtys2SubGrp\",\n");
        if (hasNoNested2PartySubIDsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"Nested2PartySubIDsGroup\": [\n");
            final int noNested2PartySubIDsGroupCounter = this.noNested2PartySubIDsGroupCounter;
            Nested2PartySubIDsGroupEncoder nested2PartySubIDsGroup = this.nested2PartySubIDsGroup;
            for (int i = 0; i < noNested2PartySubIDsGroupCounter; i++)
            {
                indent(builder, level);
                nested2PartySubIDsGroup.appendTo(builder, level + 1);
                if (i < (noNested2PartySubIDsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                nested2PartySubIDsGroup = nested2PartySubIDsGroup.next();
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
    public NstdPtys2SubGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((NstdPtys2SubGrpEncoder)encoder);
    }

    public NstdPtys2SubGrpEncoder copyTo(final NstdPtys2SubGrpEncoder encoder)
    {
        encoder.reset();
        if (hasNoNested2PartySubIDsGroupCounter)
        {
            final int size = this.noNested2PartySubIDsGroupCounter;
            Nested2PartySubIDsGroupEncoder nested2PartySubIDsGroup = this.nested2PartySubIDsGroup;
            Nested2PartySubIDsGroupEncoder nested2PartySubIDsGroupEncoder = encoder.nested2PartySubIDsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (nested2PartySubIDsGroup != null)
                {
                    nested2PartySubIDsGroup.copyTo(nested2PartySubIDsGroupEncoder);
                    nested2PartySubIDsGroup = nested2PartySubIDsGroup.next();
                    nested2PartySubIDsGroupEncoder = nested2PartySubIDsGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
