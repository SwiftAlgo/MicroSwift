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


public class NestedParties4Encoder
{
    private static final int noNested4PartyIDsGroupCounterHeaderLength = 5;
    private static final byte[] noNested4PartyIDsGroupCounterHeader = new byte[] {49, 52, 49, 52, (byte) '='};



public static class Nested4PartyIDsGroupEncoder
{
    private Nested4PartyIDsGroupEncoder next = null;

    public Nested4PartyIDsGroupEncoder next()
    {
        if (next == null)
        {
            next = new Nested4PartyIDsGroupEncoder();
        }
        return next;
    }

    private static final int nested4PartyIDHeaderLength = 5;
    private static final byte[] nested4PartyIDHeader = new byte[] {49, 52, 49, 53, (byte) '='};

    private static final int nested4PartyIDSourceHeaderLength = 5;
    private static final byte[] nested4PartyIDSourceHeader = new byte[] {49, 52, 49, 54, (byte) '='};

    private static final int nested4PartyRoleHeaderLength = 5;
    private static final byte[] nested4PartyRoleHeader = new byte[] {49, 52, 49, 55, (byte) '='};

    private final MutableDirectBuffer nested4PartyID = new UnsafeBuffer();

    private int nested4PartyIDOffset = 0;

    private int nested4PartyIDLength = 0;

    public Nested4PartyIDsGroupEncoder nested4PartyID(final DirectBuffer value, final int offset, final int length)
    {
        nested4PartyID.wrap(value);
        nested4PartyIDOffset = offset;
        nested4PartyIDLength = length;
        return this;
    }

    public Nested4PartyIDsGroupEncoder nested4PartyID(final DirectBuffer value, final int length)
    {
        return nested4PartyID(value, 0, length);
    }

    public Nested4PartyIDsGroupEncoder nested4PartyID(final DirectBuffer value)
    {
        return nested4PartyID(value, 0, value.capacity());
    }

    public Nested4PartyIDsGroupEncoder nested4PartyID(final byte[] value, final int offset, final int length)
    {
        nested4PartyID.wrap(value);
        nested4PartyIDOffset = offset;
        nested4PartyIDLength = length;
        return this;
    }

    public Nested4PartyIDsGroupEncoder nested4PartyIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(nested4PartyID, value, offset, length);
        nested4PartyIDOffset = offset;
        nested4PartyIDLength = length;
        return this;
    }

    public Nested4PartyIDsGroupEncoder nested4PartyID(final byte[] value, final int length)
    {
        return nested4PartyID(value, 0, length);
    }

    public Nested4PartyIDsGroupEncoder nested4PartyID(final byte[] value)
    {
        return nested4PartyID(value, 0, value.length);
    }

    public boolean hasNested4PartyID()
    {
        return nested4PartyIDLength > 0;
    }

    public MutableDirectBuffer nested4PartyID()
    {
        return nested4PartyID;
    }

    public String nested4PartyIDAsString()
    {
        return nested4PartyID.getStringWithoutLengthAscii(nested4PartyIDOffset, nested4PartyIDLength);
    }

    public Nested4PartyIDsGroupEncoder nested4PartyID(final CharSequence value)
    {
        toBytes(value, nested4PartyID);
        nested4PartyIDOffset = 0;
        nested4PartyIDLength = value.length();
        return this;
    }

    public Nested4PartyIDsGroupEncoder nested4PartyID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            nested4PartyID.wrap(buffer);
            nested4PartyIDOffset = value.offset();
            nested4PartyIDLength = value.length();
        }
        return this;
    }

    public Nested4PartyIDsGroupEncoder nested4PartyID(final char[] value)
    {
        return nested4PartyID(value, 0, value.length);
    }

    public Nested4PartyIDsGroupEncoder nested4PartyID(final char[] value, final int length)
    {
        return nested4PartyID(value, 0, length);
    }

    public Nested4PartyIDsGroupEncoder nested4PartyID(final char[] value, final int offset, final int length)
    {
        toBytes(value, nested4PartyID, offset, length);
        nested4PartyIDOffset = 0;
        nested4PartyIDLength = length;
        return this;
    }

    private char nested4PartyIDSource;

    private boolean hasNested4PartyIDSource;

    public boolean hasNested4PartyIDSource()
    {
        return hasNested4PartyIDSource;
    }

    public Nested4PartyIDsGroupEncoder nested4PartyIDSource(char value)
    {
        nested4PartyIDSource = value;
        hasNested4PartyIDSource = true;
        return this;
    }

    public char nested4PartyIDSource()
    {
        return nested4PartyIDSource;
    }

    private int nested4PartyRole;

    private boolean hasNested4PartyRole;

    public boolean hasNested4PartyRole()
    {
        return hasNested4PartyRole;
    }

    public Nested4PartyIDsGroupEncoder nested4PartyRole(int value)
    {
        nested4PartyRole = value;
        hasNested4PartyRole = true;
        return this;
    }

    public int nested4PartyRole()
    {
        return nested4PartyRole;
    }

    private final NstdPtys4SubGrpEncoder nstdPtys4SubGrp = new NstdPtys4SubGrpEncoder();
    public NstdPtys4SubGrpEncoder nstdPtys4SubGrp()
    {
        return nstdPtys4SubGrp;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (nested4PartyIDLength > 0)
        {
            buffer.putBytes(position, nested4PartyIDHeader, 0, nested4PartyIDHeaderLength);
            position += nested4PartyIDHeaderLength;
            buffer.putBytes(position, nested4PartyID, nested4PartyIDOffset, nested4PartyIDLength);
            position += nested4PartyIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasNested4PartyIDSource)
        {
            buffer.putBytes(position, nested4PartyIDSourceHeader, 0, nested4PartyIDSourceHeaderLength);
            position += nested4PartyIDSourceHeaderLength;
            position += buffer.putCharAscii(position, nested4PartyIDSource);
            buffer.putSeparator(position);
            position++;
        }

        if (hasNested4PartyRole)
        {
            buffer.putBytes(position, nested4PartyRoleHeader, 0, nested4PartyRoleHeaderLength);
            position += nested4PartyRoleHeaderLength;
            position += buffer.putIntAscii(position, nested4PartyRole);
            buffer.putSeparator(position);
            position++;
        }

            position += nstdPtys4SubGrp.encode(buffer, position);
        if (next != null)
        {
            position += next.encode(buffer, position, remainingElements - 1);
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetNested4PartyID();
        this.resetNested4PartyIDSource();
        this.resetNested4PartyRole();
        nstdPtys4SubGrp.reset();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetNested4PartyID()
    {
        nested4PartyIDLength = 0;
    }

    public void resetNested4PartyIDSource()
    {
        hasNested4PartyIDSource = false;
    }

    public void resetNested4PartyRole()
    {
        hasNested4PartyRole = false;
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
        builder.append("\"MessageName\": \"Nested4PartyIDsGroup\",\n");
        if (hasNested4PartyID())
        {
            indent(builder, level);
            builder.append("\"Nested4PartyID\": \"");
            appendBuffer(builder, nested4PartyID, nested4PartyIDOffset, nested4PartyIDLength);
            builder.append("\",\n");
        }

        if (hasNested4PartyIDSource())
        {
            indent(builder, level);
            builder.append("\"Nested4PartyIDSource\": \"");
            builder.append(nested4PartyIDSource);
            builder.append("\",\n");
        }

        if (hasNested4PartyRole())
        {
            indent(builder, level);
            builder.append("\"Nested4PartyRole\": \"");
            builder.append(nested4PartyRole);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"NstdPtys4SubGrp\": ");
    nstdPtys4SubGrp.appendTo(builder, level + 1);
    builder.append("\n");
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public Nested4PartyIDsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((Nested4PartyIDsGroupEncoder)encoder);
    }

    public Nested4PartyIDsGroupEncoder copyTo(final Nested4PartyIDsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasNested4PartyID())
        {
            encoder.nested4PartyIDAsCopy(nested4PartyID.byteArray(), 0, nested4PartyIDLength);
        }

        if (hasNested4PartyIDSource())
        {
            encoder.nested4PartyIDSource(this.nested4PartyIDSource());
        }

        if (hasNested4PartyRole())
        {
            encoder.nested4PartyRole(this.nested4PartyRole());
        }


        nstdPtys4SubGrp.copyTo(encoder.nstdPtys4SubGrp());        return encoder;
    }

}
    private int noNested4PartyIDsGroupCounter;

    private boolean hasNoNested4PartyIDsGroupCounter;

    public boolean hasNoNested4PartyIDsGroupCounter()
    {
        return hasNoNested4PartyIDsGroupCounter;
    }

    public NestedParties4Encoder noNested4PartyIDsGroupCounter(int value)
    {
        noNested4PartyIDsGroupCounter = value;
        hasNoNested4PartyIDsGroupCounter = true;
        return this;
    }

    public int noNested4PartyIDsGroupCounter()
    {
        return noNested4PartyIDsGroupCounter;
    }


    private Nested4PartyIDsGroupEncoder nested4PartyIDsGroup = null;

    public Nested4PartyIDsGroupEncoder nested4PartyIDsGroup(final int numberOfElements)
    {
        hasNoNested4PartyIDsGroupCounter = true;
        noNested4PartyIDsGroupCounter = numberOfElements;
        if (nested4PartyIDsGroup == null)
        {
            nested4PartyIDsGroup = new Nested4PartyIDsGroupEncoder();
        }
        return nested4PartyIDsGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoNested4PartyIDsGroupCounter)
        {
            buffer.putBytes(position, noNested4PartyIDsGroupCounterHeader, 0, noNested4PartyIDsGroupCounterHeaderLength);
            position += noNested4PartyIDsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noNested4PartyIDsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (nested4PartyIDsGroup != null)
        {
            position += nested4PartyIDsGroup.encode(buffer, position, noNested4PartyIDsGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetNested4PartyIDsGroup();
    }

    public void resetNested4PartyIDsGroup()
    {
        if (nested4PartyIDsGroup != null)
        {
            nested4PartyIDsGroup.reset();
        }
        noNested4PartyIDsGroupCounter = 0;
        hasNoNested4PartyIDsGroupCounter = false;
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
        builder.append("\"MessageName\": \"NestedParties4\",\n");
        if (hasNoNested4PartyIDsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"Nested4PartyIDsGroup\": [\n");
            final int noNested4PartyIDsGroupCounter = this.noNested4PartyIDsGroupCounter;
            Nested4PartyIDsGroupEncoder nested4PartyIDsGroup = this.nested4PartyIDsGroup;
            for (int i = 0; i < noNested4PartyIDsGroupCounter; i++)
            {
                indent(builder, level);
                nested4PartyIDsGroup.appendTo(builder, level + 1);
                if (i < (noNested4PartyIDsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                nested4PartyIDsGroup = nested4PartyIDsGroup.next();
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
    public NestedParties4Encoder copyTo(final Encoder encoder)
    {
        return copyTo((NestedParties4Encoder)encoder);
    }

    public NestedParties4Encoder copyTo(final NestedParties4Encoder encoder)
    {
        encoder.reset();
        if (hasNoNested4PartyIDsGroupCounter)
        {
            final int size = this.noNested4PartyIDsGroupCounter;
            Nested4PartyIDsGroupEncoder nested4PartyIDsGroup = this.nested4PartyIDsGroup;
            Nested4PartyIDsGroupEncoder nested4PartyIDsGroupEncoder = encoder.nested4PartyIDsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (nested4PartyIDsGroup != null)
                {
                    nested4PartyIDsGroup.copyTo(nested4PartyIDsGroupEncoder);
                    nested4PartyIDsGroup = nested4PartyIDsGroup.next();
                    nested4PartyIDsGroupEncoder = nested4PartyIDsGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
