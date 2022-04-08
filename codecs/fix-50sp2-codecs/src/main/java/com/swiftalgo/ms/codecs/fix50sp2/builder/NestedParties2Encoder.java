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


public class NestedParties2Encoder
{
    private static final int noNested2PartyIDsGroupCounterHeaderLength = 4;
    private static final byte[] noNested2PartyIDsGroupCounterHeader = new byte[] {55, 53, 54, (byte) '='};



public static class Nested2PartyIDsGroupEncoder
{
    private Nested2PartyIDsGroupEncoder next = null;

    public Nested2PartyIDsGroupEncoder next()
    {
        if (next == null)
        {
            next = new Nested2PartyIDsGroupEncoder();
        }
        return next;
    }

    private static final int nested2PartyIDHeaderLength = 4;
    private static final byte[] nested2PartyIDHeader = new byte[] {55, 53, 55, (byte) '='};

    private static final int nested2PartyIDSourceHeaderLength = 4;
    private static final byte[] nested2PartyIDSourceHeader = new byte[] {55, 53, 56, (byte) '='};

    private static final int nested2PartyRoleHeaderLength = 4;
    private static final byte[] nested2PartyRoleHeader = new byte[] {55, 53, 57, (byte) '='};

    private final MutableDirectBuffer nested2PartyID = new UnsafeBuffer();

    private int nested2PartyIDOffset = 0;

    private int nested2PartyIDLength = 0;

    public Nested2PartyIDsGroupEncoder nested2PartyID(final DirectBuffer value, final int offset, final int length)
    {
        nested2PartyID.wrap(value);
        nested2PartyIDOffset = offset;
        nested2PartyIDLength = length;
        return this;
    }

    public Nested2PartyIDsGroupEncoder nested2PartyID(final DirectBuffer value, final int length)
    {
        return nested2PartyID(value, 0, length);
    }

    public Nested2PartyIDsGroupEncoder nested2PartyID(final DirectBuffer value)
    {
        return nested2PartyID(value, 0, value.capacity());
    }

    public Nested2PartyIDsGroupEncoder nested2PartyID(final byte[] value, final int offset, final int length)
    {
        nested2PartyID.wrap(value);
        nested2PartyIDOffset = offset;
        nested2PartyIDLength = length;
        return this;
    }

    public Nested2PartyIDsGroupEncoder nested2PartyIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(nested2PartyID, value, offset, length);
        nested2PartyIDOffset = offset;
        nested2PartyIDLength = length;
        return this;
    }

    public Nested2PartyIDsGroupEncoder nested2PartyID(final byte[] value, final int length)
    {
        return nested2PartyID(value, 0, length);
    }

    public Nested2PartyIDsGroupEncoder nested2PartyID(final byte[] value)
    {
        return nested2PartyID(value, 0, value.length);
    }

    public boolean hasNested2PartyID()
    {
        return nested2PartyIDLength > 0;
    }

    public MutableDirectBuffer nested2PartyID()
    {
        return nested2PartyID;
    }

    public String nested2PartyIDAsString()
    {
        return nested2PartyID.getStringWithoutLengthAscii(nested2PartyIDOffset, nested2PartyIDLength);
    }

    public Nested2PartyIDsGroupEncoder nested2PartyID(final CharSequence value)
    {
        toBytes(value, nested2PartyID);
        nested2PartyIDOffset = 0;
        nested2PartyIDLength = value.length();
        return this;
    }

    public Nested2PartyIDsGroupEncoder nested2PartyID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            nested2PartyID.wrap(buffer);
            nested2PartyIDOffset = value.offset();
            nested2PartyIDLength = value.length();
        }
        return this;
    }

    public Nested2PartyIDsGroupEncoder nested2PartyID(final char[] value)
    {
        return nested2PartyID(value, 0, value.length);
    }

    public Nested2PartyIDsGroupEncoder nested2PartyID(final char[] value, final int length)
    {
        return nested2PartyID(value, 0, length);
    }

    public Nested2PartyIDsGroupEncoder nested2PartyID(final char[] value, final int offset, final int length)
    {
        toBytes(value, nested2PartyID, offset, length);
        nested2PartyIDOffset = 0;
        nested2PartyIDLength = length;
        return this;
    }

    private char nested2PartyIDSource;

    private boolean hasNested2PartyIDSource;

    public boolean hasNested2PartyIDSource()
    {
        return hasNested2PartyIDSource;
    }

    public Nested2PartyIDsGroupEncoder nested2PartyIDSource(char value)
    {
        nested2PartyIDSource = value;
        hasNested2PartyIDSource = true;
        return this;
    }

    public char nested2PartyIDSource()
    {
        return nested2PartyIDSource;
    }

    private int nested2PartyRole;

    private boolean hasNested2PartyRole;

    public boolean hasNested2PartyRole()
    {
        return hasNested2PartyRole;
    }

    public Nested2PartyIDsGroupEncoder nested2PartyRole(int value)
    {
        nested2PartyRole = value;
        hasNested2PartyRole = true;
        return this;
    }

    public int nested2PartyRole()
    {
        return nested2PartyRole;
    }

    private final NstdPtys2SubGrpEncoder nstdPtys2SubGrp = new NstdPtys2SubGrpEncoder();
    public NstdPtys2SubGrpEncoder nstdPtys2SubGrp()
    {
        return nstdPtys2SubGrp;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (nested2PartyIDLength > 0)
        {
            buffer.putBytes(position, nested2PartyIDHeader, 0, nested2PartyIDHeaderLength);
            position += nested2PartyIDHeaderLength;
            buffer.putBytes(position, nested2PartyID, nested2PartyIDOffset, nested2PartyIDLength);
            position += nested2PartyIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasNested2PartyIDSource)
        {
            buffer.putBytes(position, nested2PartyIDSourceHeader, 0, nested2PartyIDSourceHeaderLength);
            position += nested2PartyIDSourceHeaderLength;
            position += buffer.putCharAscii(position, nested2PartyIDSource);
            buffer.putSeparator(position);
            position++;
        }

        if (hasNested2PartyRole)
        {
            buffer.putBytes(position, nested2PartyRoleHeader, 0, nested2PartyRoleHeaderLength);
            position += nested2PartyRoleHeaderLength;
            position += buffer.putIntAscii(position, nested2PartyRole);
            buffer.putSeparator(position);
            position++;
        }

            position += nstdPtys2SubGrp.encode(buffer, position);
        if (next != null)
        {
            position += next.encode(buffer, position, remainingElements - 1);
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetNested2PartyID();
        this.resetNested2PartyIDSource();
        this.resetNested2PartyRole();
        nstdPtys2SubGrp.reset();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetNested2PartyID()
    {
        nested2PartyIDLength = 0;
    }

    public void resetNested2PartyIDSource()
    {
        hasNested2PartyIDSource = false;
    }

    public void resetNested2PartyRole()
    {
        hasNested2PartyRole = false;
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
        builder.append("\"MessageName\": \"Nested2PartyIDsGroup\",\n");
        if (hasNested2PartyID())
        {
            indent(builder, level);
            builder.append("\"Nested2PartyID\": \"");
            appendBuffer(builder, nested2PartyID, nested2PartyIDOffset, nested2PartyIDLength);
            builder.append("\",\n");
        }

        if (hasNested2PartyIDSource())
        {
            indent(builder, level);
            builder.append("\"Nested2PartyIDSource\": \"");
            builder.append(nested2PartyIDSource);
            builder.append("\",\n");
        }

        if (hasNested2PartyRole())
        {
            indent(builder, level);
            builder.append("\"Nested2PartyRole\": \"");
            builder.append(nested2PartyRole);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"NstdPtys2SubGrp\": ");
    nstdPtys2SubGrp.appendTo(builder, level + 1);
    builder.append("\n");
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public Nested2PartyIDsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((Nested2PartyIDsGroupEncoder)encoder);
    }

    public Nested2PartyIDsGroupEncoder copyTo(final Nested2PartyIDsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasNested2PartyID())
        {
            encoder.nested2PartyIDAsCopy(nested2PartyID.byteArray(), 0, nested2PartyIDLength);
        }

        if (hasNested2PartyIDSource())
        {
            encoder.nested2PartyIDSource(this.nested2PartyIDSource());
        }

        if (hasNested2PartyRole())
        {
            encoder.nested2PartyRole(this.nested2PartyRole());
        }


        nstdPtys2SubGrp.copyTo(encoder.nstdPtys2SubGrp());        return encoder;
    }

}
    private int noNested2PartyIDsGroupCounter;

    private boolean hasNoNested2PartyIDsGroupCounter;

    public boolean hasNoNested2PartyIDsGroupCounter()
    {
        return hasNoNested2PartyIDsGroupCounter;
    }

    public NestedParties2Encoder noNested2PartyIDsGroupCounter(int value)
    {
        noNested2PartyIDsGroupCounter = value;
        hasNoNested2PartyIDsGroupCounter = true;
        return this;
    }

    public int noNested2PartyIDsGroupCounter()
    {
        return noNested2PartyIDsGroupCounter;
    }


    private Nested2PartyIDsGroupEncoder nested2PartyIDsGroup = null;

    public Nested2PartyIDsGroupEncoder nested2PartyIDsGroup(final int numberOfElements)
    {
        hasNoNested2PartyIDsGroupCounter = true;
        noNested2PartyIDsGroupCounter = numberOfElements;
        if (nested2PartyIDsGroup == null)
        {
            nested2PartyIDsGroup = new Nested2PartyIDsGroupEncoder();
        }
        return nested2PartyIDsGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoNested2PartyIDsGroupCounter)
        {
            buffer.putBytes(position, noNested2PartyIDsGroupCounterHeader, 0, noNested2PartyIDsGroupCounterHeaderLength);
            position += noNested2PartyIDsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noNested2PartyIDsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (nested2PartyIDsGroup != null)
        {
            position += nested2PartyIDsGroup.encode(buffer, position, noNested2PartyIDsGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetNested2PartyIDsGroup();
    }

    public void resetNested2PartyIDsGroup()
    {
        if (nested2PartyIDsGroup != null)
        {
            nested2PartyIDsGroup.reset();
        }
        noNested2PartyIDsGroupCounter = 0;
        hasNoNested2PartyIDsGroupCounter = false;
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
        builder.append("\"MessageName\": \"NestedParties2\",\n");
        if (hasNoNested2PartyIDsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"Nested2PartyIDsGroup\": [\n");
            final int noNested2PartyIDsGroupCounter = this.noNested2PartyIDsGroupCounter;
            Nested2PartyIDsGroupEncoder nested2PartyIDsGroup = this.nested2PartyIDsGroup;
            for (int i = 0; i < noNested2PartyIDsGroupCounter; i++)
            {
                indent(builder, level);
                nested2PartyIDsGroup.appendTo(builder, level + 1);
                if (i < (noNested2PartyIDsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                nested2PartyIDsGroup = nested2PartyIDsGroup.next();
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
    public NestedParties2Encoder copyTo(final Encoder encoder)
    {
        return copyTo((NestedParties2Encoder)encoder);
    }

    public NestedParties2Encoder copyTo(final NestedParties2Encoder encoder)
    {
        encoder.reset();
        if (hasNoNested2PartyIDsGroupCounter)
        {
            final int size = this.noNested2PartyIDsGroupCounter;
            Nested2PartyIDsGroupEncoder nested2PartyIDsGroup = this.nested2PartyIDsGroup;
            Nested2PartyIDsGroupEncoder nested2PartyIDsGroupEncoder = encoder.nested2PartyIDsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (nested2PartyIDsGroup != null)
                {
                    nested2PartyIDsGroup.copyTo(nested2PartyIDsGroupEncoder);
                    nested2PartyIDsGroup = nested2PartyIDsGroup.next();
                    nested2PartyIDsGroupEncoder = nested2PartyIDsGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
