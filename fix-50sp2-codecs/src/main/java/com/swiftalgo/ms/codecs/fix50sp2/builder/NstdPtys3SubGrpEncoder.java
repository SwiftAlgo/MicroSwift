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


public class NstdPtys3SubGrpEncoder
{
    private static final int noNested3PartySubIDsGroupCounterHeaderLength = 4;
    private static final byte[] noNested3PartySubIDsGroupCounterHeader = new byte[] {57, 53, 50, (byte) '='};



public static class Nested3PartySubIDsGroupEncoder
{
    private Nested3PartySubIDsGroupEncoder next = null;

    public Nested3PartySubIDsGroupEncoder next()
    {
        if (next == null)
        {
            next = new Nested3PartySubIDsGroupEncoder();
        }
        return next;
    }

    private static final int nested3PartySubIDHeaderLength = 4;
    private static final byte[] nested3PartySubIDHeader = new byte[] {57, 53, 51, (byte) '='};

    private static final int nested3PartySubIDTypeHeaderLength = 4;
    private static final byte[] nested3PartySubIDTypeHeader = new byte[] {57, 53, 52, (byte) '='};

    private final MutableDirectBuffer nested3PartySubID = new UnsafeBuffer();

    private int nested3PartySubIDOffset = 0;

    private int nested3PartySubIDLength = 0;

    public Nested3PartySubIDsGroupEncoder nested3PartySubID(final DirectBuffer value, final int offset, final int length)
    {
        nested3PartySubID.wrap(value);
        nested3PartySubIDOffset = offset;
        nested3PartySubIDLength = length;
        return this;
    }

    public Nested3PartySubIDsGroupEncoder nested3PartySubID(final DirectBuffer value, final int length)
    {
        return nested3PartySubID(value, 0, length);
    }

    public Nested3PartySubIDsGroupEncoder nested3PartySubID(final DirectBuffer value)
    {
        return nested3PartySubID(value, 0, value.capacity());
    }

    public Nested3PartySubIDsGroupEncoder nested3PartySubID(final byte[] value, final int offset, final int length)
    {
        nested3PartySubID.wrap(value);
        nested3PartySubIDOffset = offset;
        nested3PartySubIDLength = length;
        return this;
    }

    public Nested3PartySubIDsGroupEncoder nested3PartySubIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(nested3PartySubID, value, offset, length);
        nested3PartySubIDOffset = offset;
        nested3PartySubIDLength = length;
        return this;
    }

    public Nested3PartySubIDsGroupEncoder nested3PartySubID(final byte[] value, final int length)
    {
        return nested3PartySubID(value, 0, length);
    }

    public Nested3PartySubIDsGroupEncoder nested3PartySubID(final byte[] value)
    {
        return nested3PartySubID(value, 0, value.length);
    }

    public boolean hasNested3PartySubID()
    {
        return nested3PartySubIDLength > 0;
    }

    public MutableDirectBuffer nested3PartySubID()
    {
        return nested3PartySubID;
    }

    public String nested3PartySubIDAsString()
    {
        return nested3PartySubID.getStringWithoutLengthAscii(nested3PartySubIDOffset, nested3PartySubIDLength);
    }

    public Nested3PartySubIDsGroupEncoder nested3PartySubID(final CharSequence value)
    {
        toBytes(value, nested3PartySubID);
        nested3PartySubIDOffset = 0;
        nested3PartySubIDLength = value.length();
        return this;
    }

    public Nested3PartySubIDsGroupEncoder nested3PartySubID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            nested3PartySubID.wrap(buffer);
            nested3PartySubIDOffset = value.offset();
            nested3PartySubIDLength = value.length();
        }
        return this;
    }

    public Nested3PartySubIDsGroupEncoder nested3PartySubID(final char[] value)
    {
        return nested3PartySubID(value, 0, value.length);
    }

    public Nested3PartySubIDsGroupEncoder nested3PartySubID(final char[] value, final int length)
    {
        return nested3PartySubID(value, 0, length);
    }

    public Nested3PartySubIDsGroupEncoder nested3PartySubID(final char[] value, final int offset, final int length)
    {
        toBytes(value, nested3PartySubID, offset, length);
        nested3PartySubIDOffset = 0;
        nested3PartySubIDLength = length;
        return this;
    }

    private int nested3PartySubIDType;

    private boolean hasNested3PartySubIDType;

    public boolean hasNested3PartySubIDType()
    {
        return hasNested3PartySubIDType;
    }

    public Nested3PartySubIDsGroupEncoder nested3PartySubIDType(int value)
    {
        nested3PartySubIDType = value;
        hasNested3PartySubIDType = true;
        return this;
    }

    public int nested3PartySubIDType()
    {
        return nested3PartySubIDType;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (nested3PartySubIDLength > 0)
        {
            buffer.putBytes(position, nested3PartySubIDHeader, 0, nested3PartySubIDHeaderLength);
            position += nested3PartySubIDHeaderLength;
            buffer.putBytes(position, nested3PartySubID, nested3PartySubIDOffset, nested3PartySubIDLength);
            position += nested3PartySubIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasNested3PartySubIDType)
        {
            buffer.putBytes(position, nested3PartySubIDTypeHeader, 0, nested3PartySubIDTypeHeaderLength);
            position += nested3PartySubIDTypeHeaderLength;
            position += buffer.putIntAscii(position, nested3PartySubIDType);
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
        this.resetNested3PartySubID();
        this.resetNested3PartySubIDType();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetNested3PartySubID()
    {
        nested3PartySubIDLength = 0;
    }

    public void resetNested3PartySubIDType()
    {
        hasNested3PartySubIDType = false;
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
        builder.append("\"MessageName\": \"Nested3PartySubIDsGroup\",\n");
        if (hasNested3PartySubID())
        {
            indent(builder, level);
            builder.append("\"Nested3PartySubID\": \"");
            appendBuffer(builder, nested3PartySubID, nested3PartySubIDOffset, nested3PartySubIDLength);
            builder.append("\",\n");
        }

        if (hasNested3PartySubIDType())
        {
            indent(builder, level);
            builder.append("\"Nested3PartySubIDType\": \"");
            builder.append(nested3PartySubIDType);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public Nested3PartySubIDsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((Nested3PartySubIDsGroupEncoder)encoder);
    }

    public Nested3PartySubIDsGroupEncoder copyTo(final Nested3PartySubIDsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasNested3PartySubID())
        {
            encoder.nested3PartySubIDAsCopy(nested3PartySubID.byteArray(), 0, nested3PartySubIDLength);
        }

        if (hasNested3PartySubIDType())
        {
            encoder.nested3PartySubIDType(this.nested3PartySubIDType());
        }
        return encoder;
    }

}
    private int noNested3PartySubIDsGroupCounter;

    private boolean hasNoNested3PartySubIDsGroupCounter;

    public boolean hasNoNested3PartySubIDsGroupCounter()
    {
        return hasNoNested3PartySubIDsGroupCounter;
    }

    public NstdPtys3SubGrpEncoder noNested3PartySubIDsGroupCounter(int value)
    {
        noNested3PartySubIDsGroupCounter = value;
        hasNoNested3PartySubIDsGroupCounter = true;
        return this;
    }

    public int noNested3PartySubIDsGroupCounter()
    {
        return noNested3PartySubIDsGroupCounter;
    }


    private Nested3PartySubIDsGroupEncoder nested3PartySubIDsGroup = null;

    public Nested3PartySubIDsGroupEncoder nested3PartySubIDsGroup(final int numberOfElements)
    {
        hasNoNested3PartySubIDsGroupCounter = true;
        noNested3PartySubIDsGroupCounter = numberOfElements;
        if (nested3PartySubIDsGroup == null)
        {
            nested3PartySubIDsGroup = new Nested3PartySubIDsGroupEncoder();
        }
        return nested3PartySubIDsGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoNested3PartySubIDsGroupCounter)
        {
            buffer.putBytes(position, noNested3PartySubIDsGroupCounterHeader, 0, noNested3PartySubIDsGroupCounterHeaderLength);
            position += noNested3PartySubIDsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noNested3PartySubIDsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (nested3PartySubIDsGroup != null)
        {
            position += nested3PartySubIDsGroup.encode(buffer, position, noNested3PartySubIDsGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetNested3PartySubIDsGroup();
    }

    public void resetNested3PartySubIDsGroup()
    {
        if (nested3PartySubIDsGroup != null)
        {
            nested3PartySubIDsGroup.reset();
        }
        noNested3PartySubIDsGroupCounter = 0;
        hasNoNested3PartySubIDsGroupCounter = false;
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
        builder.append("\"MessageName\": \"NstdPtys3SubGrp\",\n");
        if (hasNoNested3PartySubIDsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"Nested3PartySubIDsGroup\": [\n");
            final int noNested3PartySubIDsGroupCounter = this.noNested3PartySubIDsGroupCounter;
            Nested3PartySubIDsGroupEncoder nested3PartySubIDsGroup = this.nested3PartySubIDsGroup;
            for (int i = 0; i < noNested3PartySubIDsGroupCounter; i++)
            {
                indent(builder, level);
                nested3PartySubIDsGroup.appendTo(builder, level + 1);
                if (i < (noNested3PartySubIDsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                nested3PartySubIDsGroup = nested3PartySubIDsGroup.next();
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
    public NstdPtys3SubGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((NstdPtys3SubGrpEncoder)encoder);
    }

    public NstdPtys3SubGrpEncoder copyTo(final NstdPtys3SubGrpEncoder encoder)
    {
        encoder.reset();
        if (hasNoNested3PartySubIDsGroupCounter)
        {
            final int size = this.noNested3PartySubIDsGroupCounter;
            Nested3PartySubIDsGroupEncoder nested3PartySubIDsGroup = this.nested3PartySubIDsGroup;
            Nested3PartySubIDsGroupEncoder nested3PartySubIDsGroupEncoder = encoder.nested3PartySubIDsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (nested3PartySubIDsGroup != null)
                {
                    nested3PartySubIDsGroup.copyTo(nested3PartySubIDsGroupEncoder);
                    nested3PartySubIDsGroup = nested3PartySubIDsGroup.next();
                    nested3PartySubIDsGroupEncoder = nested3PartySubIDsGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
