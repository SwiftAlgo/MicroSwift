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


public class NestedPartiesEncoder
{
    private static final int noNestedPartyIDsGroupCounterHeaderLength = 4;
    private static final byte[] noNestedPartyIDsGroupCounterHeader = new byte[] {53, 51, 57, (byte) '='};



public static class NestedPartyIDsGroupEncoder
{
    private NestedPartyIDsGroupEncoder next = null;

    public NestedPartyIDsGroupEncoder next()
    {
        if (next == null)
        {
            next = new NestedPartyIDsGroupEncoder();
        }
        return next;
    }

    private static final int nestedPartyIDHeaderLength = 4;
    private static final byte[] nestedPartyIDHeader = new byte[] {53, 50, 52, (byte) '='};

    private static final int nestedPartyIDSourceHeaderLength = 4;
    private static final byte[] nestedPartyIDSourceHeader = new byte[] {53, 50, 53, (byte) '='};

    private static final int nestedPartyRoleHeaderLength = 4;
    private static final byte[] nestedPartyRoleHeader = new byte[] {53, 51, 56, (byte) '='};

    private static final int noNestedPartySubIDsGroupCounterHeaderLength = 4;
    private static final byte[] noNestedPartySubIDsGroupCounterHeader = new byte[] {56, 48, 52, (byte) '='};

    private final MutableDirectBuffer nestedPartyID = new UnsafeBuffer();

    private int nestedPartyIDOffset = 0;

    private int nestedPartyIDLength = 0;

    public NestedPartyIDsGroupEncoder nestedPartyID(final DirectBuffer value, final int offset, final int length)
    {
        nestedPartyID.wrap(value);
        nestedPartyIDOffset = offset;
        nestedPartyIDLength = length;
        return this;
    }

    public NestedPartyIDsGroupEncoder nestedPartyID(final DirectBuffer value, final int length)
    {
        return nestedPartyID(value, 0, length);
    }

    public NestedPartyIDsGroupEncoder nestedPartyID(final DirectBuffer value)
    {
        return nestedPartyID(value, 0, value.capacity());
    }

    public NestedPartyIDsGroupEncoder nestedPartyID(final byte[] value, final int offset, final int length)
    {
        nestedPartyID.wrap(value);
        nestedPartyIDOffset = offset;
        nestedPartyIDLength = length;
        return this;
    }

    public NestedPartyIDsGroupEncoder nestedPartyIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(nestedPartyID, value, offset, length);
        nestedPartyIDOffset = offset;
        nestedPartyIDLength = length;
        return this;
    }

    public NestedPartyIDsGroupEncoder nestedPartyID(final byte[] value, final int length)
    {
        return nestedPartyID(value, 0, length);
    }

    public NestedPartyIDsGroupEncoder nestedPartyID(final byte[] value)
    {
        return nestedPartyID(value, 0, value.length);
    }

    public boolean hasNestedPartyID()
    {
        return nestedPartyIDLength > 0;
    }

    public MutableDirectBuffer nestedPartyID()
    {
        return nestedPartyID;
    }

    public String nestedPartyIDAsString()
    {
        return nestedPartyID.getStringWithoutLengthAscii(nestedPartyIDOffset, nestedPartyIDLength);
    }

    public NestedPartyIDsGroupEncoder nestedPartyID(final CharSequence value)
    {
        toBytes(value, nestedPartyID);
        nestedPartyIDOffset = 0;
        nestedPartyIDLength = value.length();
        return this;
    }

    public NestedPartyIDsGroupEncoder nestedPartyID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            nestedPartyID.wrap(buffer);
            nestedPartyIDOffset = value.offset();
            nestedPartyIDLength = value.length();
        }
        return this;
    }

    public NestedPartyIDsGroupEncoder nestedPartyID(final char[] value)
    {
        return nestedPartyID(value, 0, value.length);
    }

    public NestedPartyIDsGroupEncoder nestedPartyID(final char[] value, final int length)
    {
        return nestedPartyID(value, 0, length);
    }

    public NestedPartyIDsGroupEncoder nestedPartyID(final char[] value, final int offset, final int length)
    {
        toBytes(value, nestedPartyID, offset, length);
        nestedPartyIDOffset = 0;
        nestedPartyIDLength = length;
        return this;
    }

    private char nestedPartyIDSource;

    private boolean hasNestedPartyIDSource;

    public boolean hasNestedPartyIDSource()
    {
        return hasNestedPartyIDSource;
    }

    public NestedPartyIDsGroupEncoder nestedPartyIDSource(char value)
    {
        nestedPartyIDSource = value;
        hasNestedPartyIDSource = true;
        return this;
    }

    public char nestedPartyIDSource()
    {
        return nestedPartyIDSource;
    }

    private int nestedPartyRole;

    private boolean hasNestedPartyRole;

    public boolean hasNestedPartyRole()
    {
        return hasNestedPartyRole;
    }

    public NestedPartyIDsGroupEncoder nestedPartyRole(int value)
    {
        nestedPartyRole = value;
        hasNestedPartyRole = true;
        return this;
    }

    public int nestedPartyRole()
    {
        return nestedPartyRole;
    }



public static class NestedPartySubIDsGroupEncoder
{
    private NestedPartySubIDsGroupEncoder next = null;

    public NestedPartySubIDsGroupEncoder next()
    {
        if (next == null)
        {
            next = new NestedPartySubIDsGroupEncoder();
        }
        return next;
    }

    private static final int nestedPartySubIDHeaderLength = 4;
    private static final byte[] nestedPartySubIDHeader = new byte[] {53, 52, 53, (byte) '='};

    private static final int nestedPartySubIDTypeHeaderLength = 4;
    private static final byte[] nestedPartySubIDTypeHeader = new byte[] {56, 48, 53, (byte) '='};

    private final MutableDirectBuffer nestedPartySubID = new UnsafeBuffer();

    private int nestedPartySubIDOffset = 0;

    private int nestedPartySubIDLength = 0;

    public NestedPartySubIDsGroupEncoder nestedPartySubID(final DirectBuffer value, final int offset, final int length)
    {
        nestedPartySubID.wrap(value);
        nestedPartySubIDOffset = offset;
        nestedPartySubIDLength = length;
        return this;
    }

    public NestedPartySubIDsGroupEncoder nestedPartySubID(final DirectBuffer value, final int length)
    {
        return nestedPartySubID(value, 0, length);
    }

    public NestedPartySubIDsGroupEncoder nestedPartySubID(final DirectBuffer value)
    {
        return nestedPartySubID(value, 0, value.capacity());
    }

    public NestedPartySubIDsGroupEncoder nestedPartySubID(final byte[] value, final int offset, final int length)
    {
        nestedPartySubID.wrap(value);
        nestedPartySubIDOffset = offset;
        nestedPartySubIDLength = length;
        return this;
    }

    public NestedPartySubIDsGroupEncoder nestedPartySubIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(nestedPartySubID, value, offset, length);
        nestedPartySubIDOffset = offset;
        nestedPartySubIDLength = length;
        return this;
    }

    public NestedPartySubIDsGroupEncoder nestedPartySubID(final byte[] value, final int length)
    {
        return nestedPartySubID(value, 0, length);
    }

    public NestedPartySubIDsGroupEncoder nestedPartySubID(final byte[] value)
    {
        return nestedPartySubID(value, 0, value.length);
    }

    public boolean hasNestedPartySubID()
    {
        return nestedPartySubIDLength > 0;
    }

    public MutableDirectBuffer nestedPartySubID()
    {
        return nestedPartySubID;
    }

    public String nestedPartySubIDAsString()
    {
        return nestedPartySubID.getStringWithoutLengthAscii(nestedPartySubIDOffset, nestedPartySubIDLength);
    }

    public NestedPartySubIDsGroupEncoder nestedPartySubID(final CharSequence value)
    {
        toBytes(value, nestedPartySubID);
        nestedPartySubIDOffset = 0;
        nestedPartySubIDLength = value.length();
        return this;
    }

    public NestedPartySubIDsGroupEncoder nestedPartySubID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            nestedPartySubID.wrap(buffer);
            nestedPartySubIDOffset = value.offset();
            nestedPartySubIDLength = value.length();
        }
        return this;
    }

    public NestedPartySubIDsGroupEncoder nestedPartySubID(final char[] value)
    {
        return nestedPartySubID(value, 0, value.length);
    }

    public NestedPartySubIDsGroupEncoder nestedPartySubID(final char[] value, final int length)
    {
        return nestedPartySubID(value, 0, length);
    }

    public NestedPartySubIDsGroupEncoder nestedPartySubID(final char[] value, final int offset, final int length)
    {
        toBytes(value, nestedPartySubID, offset, length);
        nestedPartySubIDOffset = 0;
        nestedPartySubIDLength = length;
        return this;
    }

    private int nestedPartySubIDType;

    private boolean hasNestedPartySubIDType;

    public boolean hasNestedPartySubIDType()
    {
        return hasNestedPartySubIDType;
    }

    public NestedPartySubIDsGroupEncoder nestedPartySubIDType(int value)
    {
        nestedPartySubIDType = value;
        hasNestedPartySubIDType = true;
        return this;
    }

    public int nestedPartySubIDType()
    {
        return nestedPartySubIDType;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (nestedPartySubIDLength > 0)
        {
            buffer.putBytes(position, nestedPartySubIDHeader, 0, nestedPartySubIDHeaderLength);
            position += nestedPartySubIDHeaderLength;
            buffer.putBytes(position, nestedPartySubID, nestedPartySubIDOffset, nestedPartySubIDLength);
            position += nestedPartySubIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasNestedPartySubIDType)
        {
            buffer.putBytes(position, nestedPartySubIDTypeHeader, 0, nestedPartySubIDTypeHeaderLength);
            position += nestedPartySubIDTypeHeaderLength;
            position += buffer.putIntAscii(position, nestedPartySubIDType);
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
        this.resetNestedPartySubID();
        this.resetNestedPartySubIDType();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetNestedPartySubID()
    {
        nestedPartySubIDLength = 0;
    }

    public void resetNestedPartySubIDType()
    {
        hasNestedPartySubIDType = false;
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
        builder.append("\"MessageName\": \"NestedPartySubIDsGroup\",\n");
        if (hasNestedPartySubID())
        {
            indent(builder, level);
            builder.append("\"NestedPartySubID\": \"");
            appendBuffer(builder, nestedPartySubID, nestedPartySubIDOffset, nestedPartySubIDLength);
            builder.append("\",\n");
        }

        if (hasNestedPartySubIDType())
        {
            indent(builder, level);
            builder.append("\"NestedPartySubIDType\": \"");
            builder.append(nestedPartySubIDType);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public NestedPartySubIDsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((NestedPartySubIDsGroupEncoder)encoder);
    }

    public NestedPartySubIDsGroupEncoder copyTo(final NestedPartySubIDsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasNestedPartySubID())
        {
            encoder.nestedPartySubIDAsCopy(nestedPartySubID.byteArray(), 0, nestedPartySubIDLength);
        }

        if (hasNestedPartySubIDType())
        {
            encoder.nestedPartySubIDType(this.nestedPartySubIDType());
        }
        return encoder;
    }

}
    private int noNestedPartySubIDsGroupCounter;

    private boolean hasNoNestedPartySubIDsGroupCounter;

    public boolean hasNoNestedPartySubIDsGroupCounter()
    {
        return hasNoNestedPartySubIDsGroupCounter;
    }

    public NestedPartyIDsGroupEncoder noNestedPartySubIDsGroupCounter(int value)
    {
        noNestedPartySubIDsGroupCounter = value;
        hasNoNestedPartySubIDsGroupCounter = true;
        return this;
    }

    public int noNestedPartySubIDsGroupCounter()
    {
        return noNestedPartySubIDsGroupCounter;
    }


    private NestedPartySubIDsGroupEncoder nestedPartySubIDsGroup = null;

    public NestedPartySubIDsGroupEncoder nestedPartySubIDsGroup(final int numberOfElements)
    {
        hasNoNestedPartySubIDsGroupCounter = true;
        noNestedPartySubIDsGroupCounter = numberOfElements;
        if (nestedPartySubIDsGroup == null)
        {
            nestedPartySubIDsGroup = new NestedPartySubIDsGroupEncoder();
        }
        return nestedPartySubIDsGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (nestedPartyIDLength > 0)
        {
            buffer.putBytes(position, nestedPartyIDHeader, 0, nestedPartyIDHeaderLength);
            position += nestedPartyIDHeaderLength;
            buffer.putBytes(position, nestedPartyID, nestedPartyIDOffset, nestedPartyIDLength);
            position += nestedPartyIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasNestedPartyIDSource)
        {
            buffer.putBytes(position, nestedPartyIDSourceHeader, 0, nestedPartyIDSourceHeaderLength);
            position += nestedPartyIDSourceHeaderLength;
            position += buffer.putCharAscii(position, nestedPartyIDSource);
            buffer.putSeparator(position);
            position++;
        }

        if (hasNestedPartyRole)
        {
            buffer.putBytes(position, nestedPartyRoleHeader, 0, nestedPartyRoleHeaderLength);
            position += nestedPartyRoleHeaderLength;
            position += buffer.putIntAscii(position, nestedPartyRole);
            buffer.putSeparator(position);
            position++;
        }

        if (hasNoNestedPartySubIDsGroupCounter)
        {
            buffer.putBytes(position, noNestedPartySubIDsGroupCounterHeader, 0, noNestedPartySubIDsGroupCounterHeaderLength);
            position += noNestedPartySubIDsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noNestedPartySubIDsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (nestedPartySubIDsGroup != null)
        {
            position += nestedPartySubIDsGroup.encode(buffer, position, noNestedPartySubIDsGroupCounter);
        }

        if (next != null)
        {
            position += next.encode(buffer, position, remainingElements - 1);
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetNestedPartyID();
        this.resetNestedPartyIDSource();
        this.resetNestedPartyRole();
        this.resetNestedPartySubIDsGroup();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetNestedPartyID()
    {
        nestedPartyIDLength = 0;
    }

    public void resetNestedPartyIDSource()
    {
        hasNestedPartyIDSource = false;
    }

    public void resetNestedPartyRole()
    {
        hasNestedPartyRole = false;
    }

    public void resetNestedPartySubIDsGroup()
    {
        if (nestedPartySubIDsGroup != null)
        {
            nestedPartySubIDsGroup.reset();
        }
        noNestedPartySubIDsGroupCounter = 0;
        hasNoNestedPartySubIDsGroupCounter = false;
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
        builder.append("\"MessageName\": \"NestedPartyIDsGroup\",\n");
        if (hasNestedPartyID())
        {
            indent(builder, level);
            builder.append("\"NestedPartyID\": \"");
            appendBuffer(builder, nestedPartyID, nestedPartyIDOffset, nestedPartyIDLength);
            builder.append("\",\n");
        }

        if (hasNestedPartyIDSource())
        {
            indent(builder, level);
            builder.append("\"NestedPartyIDSource\": \"");
            builder.append(nestedPartyIDSource);
            builder.append("\",\n");
        }

        if (hasNestedPartyRole())
        {
            indent(builder, level);
            builder.append("\"NestedPartyRole\": \"");
            builder.append(nestedPartyRole);
            builder.append("\",\n");
        }

        if (hasNoNestedPartySubIDsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"NestedPartySubIDsGroup\": [\n");
            final int noNestedPartySubIDsGroupCounter = this.noNestedPartySubIDsGroupCounter;
            NestedPartySubIDsGroupEncoder nestedPartySubIDsGroup = this.nestedPartySubIDsGroup;
            for (int i = 0; i < noNestedPartySubIDsGroupCounter; i++)
            {
                indent(builder, level);
                nestedPartySubIDsGroup.appendTo(builder, level + 1);
                if (i < (noNestedPartySubIDsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                nestedPartySubIDsGroup = nestedPartySubIDsGroup.next();
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
    public NestedPartyIDsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((NestedPartyIDsGroupEncoder)encoder);
    }

    public NestedPartyIDsGroupEncoder copyTo(final NestedPartyIDsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasNestedPartyID())
        {
            encoder.nestedPartyIDAsCopy(nestedPartyID.byteArray(), 0, nestedPartyIDLength);
        }

        if (hasNestedPartyIDSource())
        {
            encoder.nestedPartyIDSource(this.nestedPartyIDSource());
        }

        if (hasNestedPartyRole())
        {
            encoder.nestedPartyRole(this.nestedPartyRole());
        }

        if (hasNoNestedPartySubIDsGroupCounter)
        {
            final int size = this.noNestedPartySubIDsGroupCounter;
            NestedPartySubIDsGroupEncoder nestedPartySubIDsGroup = this.nestedPartySubIDsGroup;
            NestedPartySubIDsGroupEncoder nestedPartySubIDsGroupEncoder = encoder.nestedPartySubIDsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (nestedPartySubIDsGroup != null)
                {
                    nestedPartySubIDsGroup.copyTo(nestedPartySubIDsGroupEncoder);
                    nestedPartySubIDsGroup = nestedPartySubIDsGroup.next();
                    nestedPartySubIDsGroupEncoder = nestedPartySubIDsGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
    private int noNestedPartyIDsGroupCounter;

    private boolean hasNoNestedPartyIDsGroupCounter;

    public boolean hasNoNestedPartyIDsGroupCounter()
    {
        return hasNoNestedPartyIDsGroupCounter;
    }

    public NestedPartiesEncoder noNestedPartyIDsGroupCounter(int value)
    {
        noNestedPartyIDsGroupCounter = value;
        hasNoNestedPartyIDsGroupCounter = true;
        return this;
    }

    public int noNestedPartyIDsGroupCounter()
    {
        return noNestedPartyIDsGroupCounter;
    }


    private NestedPartyIDsGroupEncoder nestedPartyIDsGroup = null;

    public NestedPartyIDsGroupEncoder nestedPartyIDsGroup(final int numberOfElements)
    {
        hasNoNestedPartyIDsGroupCounter = true;
        noNestedPartyIDsGroupCounter = numberOfElements;
        if (nestedPartyIDsGroup == null)
        {
            nestedPartyIDsGroup = new NestedPartyIDsGroupEncoder();
        }
        return nestedPartyIDsGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoNestedPartyIDsGroupCounter)
        {
            buffer.putBytes(position, noNestedPartyIDsGroupCounterHeader, 0, noNestedPartyIDsGroupCounterHeaderLength);
            position += noNestedPartyIDsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noNestedPartyIDsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (nestedPartyIDsGroup != null)
        {
            position += nestedPartyIDsGroup.encode(buffer, position, noNestedPartyIDsGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetNestedPartyIDsGroup();
    }

    public void resetNestedPartyIDsGroup()
    {
        if (nestedPartyIDsGroup != null)
        {
            nestedPartyIDsGroup.reset();
        }
        noNestedPartyIDsGroupCounter = 0;
        hasNoNestedPartyIDsGroupCounter = false;
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
        builder.append("\"MessageName\": \"NestedParties\",\n");
        if (hasNoNestedPartyIDsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"NestedPartyIDsGroup\": [\n");
            final int noNestedPartyIDsGroupCounter = this.noNestedPartyIDsGroupCounter;
            NestedPartyIDsGroupEncoder nestedPartyIDsGroup = this.nestedPartyIDsGroup;
            for (int i = 0; i < noNestedPartyIDsGroupCounter; i++)
            {
                indent(builder, level);
                nestedPartyIDsGroup.appendTo(builder, level + 1);
                if (i < (noNestedPartyIDsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                nestedPartyIDsGroup = nestedPartyIDsGroup.next();
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
    public NestedPartiesEncoder copyTo(final Encoder encoder)
    {
        return copyTo((NestedPartiesEncoder)encoder);
    }

    public NestedPartiesEncoder copyTo(final NestedPartiesEncoder encoder)
    {
        encoder.reset();
        if (hasNoNestedPartyIDsGroupCounter)
        {
            final int size = this.noNestedPartyIDsGroupCounter;
            NestedPartyIDsGroupEncoder nestedPartyIDsGroup = this.nestedPartyIDsGroup;
            NestedPartyIDsGroupEncoder nestedPartyIDsGroupEncoder = encoder.nestedPartyIDsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (nestedPartyIDsGroup != null)
                {
                    nestedPartyIDsGroup.copyTo(nestedPartyIDsGroupEncoder);
                    nestedPartyIDsGroup = nestedPartyIDsGroup.next();
                    nestedPartyIDsGroupEncoder = nestedPartyIDsGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
