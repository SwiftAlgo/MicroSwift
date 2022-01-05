/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44.builder;

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
import com.swiftalgo.ms.codecs.fix44.*;


public class NestedParties3Encoder
{
    private static final int noNested3PartyIDsGroupCounterHeaderLength = 4;
    private static final byte[] noNested3PartyIDsGroupCounterHeader = new byte[] {57, 52, 56, (byte) '='};



public static class Nested3PartyIDsGroupEncoder
{
    private Nested3PartyIDsGroupEncoder next = null;

    public Nested3PartyIDsGroupEncoder next()
    {
        if (next == null)
        {
            next = new Nested3PartyIDsGroupEncoder();
        }
        return next;
    }

    private static final int nested3PartyIDHeaderLength = 4;
    private static final byte[] nested3PartyIDHeader = new byte[] {57, 52, 57, (byte) '='};

    private static final int nested3PartyIDSourceHeaderLength = 4;
    private static final byte[] nested3PartyIDSourceHeader = new byte[] {57, 53, 48, (byte) '='};

    private static final int nested3PartyRoleHeaderLength = 4;
    private static final byte[] nested3PartyRoleHeader = new byte[] {57, 53, 49, (byte) '='};

    private static final int noNested3PartySubIDsGroupCounterHeaderLength = 4;
    private static final byte[] noNested3PartySubIDsGroupCounterHeader = new byte[] {57, 53, 50, (byte) '='};

    private final MutableDirectBuffer nested3PartyID = new UnsafeBuffer();

    private int nested3PartyIDOffset = 0;

    private int nested3PartyIDLength = 0;

    public Nested3PartyIDsGroupEncoder nested3PartyID(final DirectBuffer value, final int offset, final int length)
    {
        nested3PartyID.wrap(value);
        nested3PartyIDOffset = offset;
        nested3PartyIDLength = length;
        return this;
    }

    public Nested3PartyIDsGroupEncoder nested3PartyID(final DirectBuffer value, final int length)
    {
        return nested3PartyID(value, 0, length);
    }

    public Nested3PartyIDsGroupEncoder nested3PartyID(final DirectBuffer value)
    {
        return nested3PartyID(value, 0, value.capacity());
    }

    public Nested3PartyIDsGroupEncoder nested3PartyID(final byte[] value, final int offset, final int length)
    {
        nested3PartyID.wrap(value);
        nested3PartyIDOffset = offset;
        nested3PartyIDLength = length;
        return this;
    }

    public Nested3PartyIDsGroupEncoder nested3PartyIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(nested3PartyID, value, offset, length);
        nested3PartyIDOffset = offset;
        nested3PartyIDLength = length;
        return this;
    }

    public Nested3PartyIDsGroupEncoder nested3PartyID(final byte[] value, final int length)
    {
        return nested3PartyID(value, 0, length);
    }

    public Nested3PartyIDsGroupEncoder nested3PartyID(final byte[] value)
    {
        return nested3PartyID(value, 0, value.length);
    }

    public boolean hasNested3PartyID()
    {
        return nested3PartyIDLength > 0;
    }

    public MutableDirectBuffer nested3PartyID()
    {
        return nested3PartyID;
    }

    public String nested3PartyIDAsString()
    {
        return nested3PartyID.getStringWithoutLengthAscii(nested3PartyIDOffset, nested3PartyIDLength);
    }

    public Nested3PartyIDsGroupEncoder nested3PartyID(final CharSequence value)
    {
        toBytes(value, nested3PartyID);
        nested3PartyIDOffset = 0;
        nested3PartyIDLength = value.length();
        return this;
    }

    public Nested3PartyIDsGroupEncoder nested3PartyID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            nested3PartyID.wrap(buffer);
            nested3PartyIDOffset = value.offset();
            nested3PartyIDLength = value.length();
        }
        return this;
    }

    public Nested3PartyIDsGroupEncoder nested3PartyID(final char[] value)
    {
        return nested3PartyID(value, 0, value.length);
    }

    public Nested3PartyIDsGroupEncoder nested3PartyID(final char[] value, final int length)
    {
        return nested3PartyID(value, 0, length);
    }

    public Nested3PartyIDsGroupEncoder nested3PartyID(final char[] value, final int offset, final int length)
    {
        toBytes(value, nested3PartyID, offset, length);
        nested3PartyIDOffset = 0;
        nested3PartyIDLength = length;
        return this;
    }

    private char nested3PartyIDSource;

    private boolean hasNested3PartyIDSource;

    public boolean hasNested3PartyIDSource()
    {
        return hasNested3PartyIDSource;
    }

    public Nested3PartyIDsGroupEncoder nested3PartyIDSource(char value)
    {
        nested3PartyIDSource = value;
        hasNested3PartyIDSource = true;
        return this;
    }

    public char nested3PartyIDSource()
    {
        return nested3PartyIDSource;
    }

    private int nested3PartyRole;

    private boolean hasNested3PartyRole;

    public boolean hasNested3PartyRole()
    {
        return hasNested3PartyRole;
    }

    public Nested3PartyIDsGroupEncoder nested3PartyRole(int value)
    {
        nested3PartyRole = value;
        hasNested3PartyRole = true;
        return this;
    }

    public int nested3PartyRole()
    {
        return nested3PartyRole;
    }



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

    public Nested3PartyIDsGroupEncoder noNested3PartySubIDsGroupCounter(int value)
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

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (nested3PartyIDLength > 0)
        {
            buffer.putBytes(position, nested3PartyIDHeader, 0, nested3PartyIDHeaderLength);
            position += nested3PartyIDHeaderLength;
            buffer.putBytes(position, nested3PartyID, nested3PartyIDOffset, nested3PartyIDLength);
            position += nested3PartyIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasNested3PartyIDSource)
        {
            buffer.putBytes(position, nested3PartyIDSourceHeader, 0, nested3PartyIDSourceHeaderLength);
            position += nested3PartyIDSourceHeaderLength;
            position += buffer.putCharAscii(position, nested3PartyIDSource);
            buffer.putSeparator(position);
            position++;
        }

        if (hasNested3PartyRole)
        {
            buffer.putBytes(position, nested3PartyRoleHeader, 0, nested3PartyRoleHeaderLength);
            position += nested3PartyRoleHeaderLength;
            position += buffer.putIntAscii(position, nested3PartyRole);
            buffer.putSeparator(position);
            position++;
        }

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

        if (next != null)
        {
            position += next.encode(buffer, position, remainingElements - 1);
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetNested3PartyID();
        this.resetNested3PartyIDSource();
        this.resetNested3PartyRole();
        this.resetNested3PartySubIDsGroup();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetNested3PartyID()
    {
        nested3PartyIDLength = 0;
    }

    public void resetNested3PartyIDSource()
    {
        hasNested3PartyIDSource = false;
    }

    public void resetNested3PartyRole()
    {
        hasNested3PartyRole = false;
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
        builder.append("\"MessageName\": \"Nested3PartyIDsGroup\",\n");
        if (hasNested3PartyID())
        {
            indent(builder, level);
            builder.append("\"Nested3PartyID\": \"");
            appendBuffer(builder, nested3PartyID, nested3PartyIDOffset, nested3PartyIDLength);
            builder.append("\",\n");
        }

        if (hasNested3PartyIDSource())
        {
            indent(builder, level);
            builder.append("\"Nested3PartyIDSource\": \"");
            builder.append(nested3PartyIDSource);
            builder.append("\",\n");
        }

        if (hasNested3PartyRole())
        {
            indent(builder, level);
            builder.append("\"Nested3PartyRole\": \"");
            builder.append(nested3PartyRole);
            builder.append("\",\n");
        }

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
    public Nested3PartyIDsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((Nested3PartyIDsGroupEncoder)encoder);
    }

    public Nested3PartyIDsGroupEncoder copyTo(final Nested3PartyIDsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasNested3PartyID())
        {
            encoder.nested3PartyIDAsCopy(nested3PartyID.byteArray(), 0, nested3PartyIDLength);
        }

        if (hasNested3PartyIDSource())
        {
            encoder.nested3PartyIDSource(this.nested3PartyIDSource());
        }

        if (hasNested3PartyRole())
        {
            encoder.nested3PartyRole(this.nested3PartyRole());
        }

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
    private int noNested3PartyIDsGroupCounter;

    private boolean hasNoNested3PartyIDsGroupCounter;

    public boolean hasNoNested3PartyIDsGroupCounter()
    {
        return hasNoNested3PartyIDsGroupCounter;
    }

    public NestedParties3Encoder noNested3PartyIDsGroupCounter(int value)
    {
        noNested3PartyIDsGroupCounter = value;
        hasNoNested3PartyIDsGroupCounter = true;
        return this;
    }

    public int noNested3PartyIDsGroupCounter()
    {
        return noNested3PartyIDsGroupCounter;
    }


    private Nested3PartyIDsGroupEncoder nested3PartyIDsGroup = null;

    public Nested3PartyIDsGroupEncoder nested3PartyIDsGroup(final int numberOfElements)
    {
        hasNoNested3PartyIDsGroupCounter = true;
        noNested3PartyIDsGroupCounter = numberOfElements;
        if (nested3PartyIDsGroup == null)
        {
            nested3PartyIDsGroup = new Nested3PartyIDsGroupEncoder();
        }
        return nested3PartyIDsGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoNested3PartyIDsGroupCounter)
        {
            buffer.putBytes(position, noNested3PartyIDsGroupCounterHeader, 0, noNested3PartyIDsGroupCounterHeaderLength);
            position += noNested3PartyIDsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noNested3PartyIDsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (nested3PartyIDsGroup != null)
        {
            position += nested3PartyIDsGroup.encode(buffer, position, noNested3PartyIDsGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetNested3PartyIDsGroup();
    }

    public void resetNested3PartyIDsGroup()
    {
        if (nested3PartyIDsGroup != null)
        {
            nested3PartyIDsGroup.reset();
        }
        noNested3PartyIDsGroupCounter = 0;
        hasNoNested3PartyIDsGroupCounter = false;
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
        builder.append("\"MessageName\": \"NestedParties3\",\n");
        if (hasNoNested3PartyIDsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"Nested3PartyIDsGroup\": [\n");
            final int noNested3PartyIDsGroupCounter = this.noNested3PartyIDsGroupCounter;
            Nested3PartyIDsGroupEncoder nested3PartyIDsGroup = this.nested3PartyIDsGroup;
            for (int i = 0; i < noNested3PartyIDsGroupCounter; i++)
            {
                indent(builder, level);
                nested3PartyIDsGroup.appendTo(builder, level + 1);
                if (i < (noNested3PartyIDsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                nested3PartyIDsGroup = nested3PartyIDsGroup.next();
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
    public NestedParties3Encoder copyTo(final Encoder encoder)
    {
        return copyTo((NestedParties3Encoder)encoder);
    }

    public NestedParties3Encoder copyTo(final NestedParties3Encoder encoder)
    {
        encoder.reset();
        if (hasNoNested3PartyIDsGroupCounter)
        {
            final int size = this.noNested3PartyIDsGroupCounter;
            Nested3PartyIDsGroupEncoder nested3PartyIDsGroup = this.nested3PartyIDsGroup;
            Nested3PartyIDsGroupEncoder nested3PartyIDsGroupEncoder = encoder.nested3PartyIDsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (nested3PartyIDsGroup != null)
                {
                    nested3PartyIDsGroup.copyTo(nested3PartyIDsGroupEncoder);
                    nested3PartyIDsGroup = nested3PartyIDsGroup.next();
                    nested3PartyIDsGroupEncoder = nested3PartyIDsGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
