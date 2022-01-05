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


public class RootPartiesEncoder
{
    private static final int noRootPartyIDsGroupCounterHeaderLength = 5;
    private static final byte[] noRootPartyIDsGroupCounterHeader = new byte[] {49, 49, 49, 54, (byte) '='};



public static class RootPartyIDsGroupEncoder
{
    private RootPartyIDsGroupEncoder next = null;

    public RootPartyIDsGroupEncoder next()
    {
        if (next == null)
        {
            next = new RootPartyIDsGroupEncoder();
        }
        return next;
    }

    private static final int rootPartyIDHeaderLength = 5;
    private static final byte[] rootPartyIDHeader = new byte[] {49, 49, 49, 55, (byte) '='};

    private static final int rootPartyIDSourceHeaderLength = 5;
    private static final byte[] rootPartyIDSourceHeader = new byte[] {49, 49, 49, 56, (byte) '='};

    private static final int rootPartyRoleHeaderLength = 5;
    private static final byte[] rootPartyRoleHeader = new byte[] {49, 49, 49, 57, (byte) '='};

    private final MutableDirectBuffer rootPartyID = new UnsafeBuffer();

    private int rootPartyIDOffset = 0;

    private int rootPartyIDLength = 0;

    public RootPartyIDsGroupEncoder rootPartyID(final DirectBuffer value, final int offset, final int length)
    {
        rootPartyID.wrap(value);
        rootPartyIDOffset = offset;
        rootPartyIDLength = length;
        return this;
    }

    public RootPartyIDsGroupEncoder rootPartyID(final DirectBuffer value, final int length)
    {
        return rootPartyID(value, 0, length);
    }

    public RootPartyIDsGroupEncoder rootPartyID(final DirectBuffer value)
    {
        return rootPartyID(value, 0, value.capacity());
    }

    public RootPartyIDsGroupEncoder rootPartyID(final byte[] value, final int offset, final int length)
    {
        rootPartyID.wrap(value);
        rootPartyIDOffset = offset;
        rootPartyIDLength = length;
        return this;
    }

    public RootPartyIDsGroupEncoder rootPartyIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(rootPartyID, value, offset, length);
        rootPartyIDOffset = offset;
        rootPartyIDLength = length;
        return this;
    }

    public RootPartyIDsGroupEncoder rootPartyID(final byte[] value, final int length)
    {
        return rootPartyID(value, 0, length);
    }

    public RootPartyIDsGroupEncoder rootPartyID(final byte[] value)
    {
        return rootPartyID(value, 0, value.length);
    }

    public boolean hasRootPartyID()
    {
        return rootPartyIDLength > 0;
    }

    public MutableDirectBuffer rootPartyID()
    {
        return rootPartyID;
    }

    public String rootPartyIDAsString()
    {
        return rootPartyID.getStringWithoutLengthAscii(rootPartyIDOffset, rootPartyIDLength);
    }

    public RootPartyIDsGroupEncoder rootPartyID(final CharSequence value)
    {
        toBytes(value, rootPartyID);
        rootPartyIDOffset = 0;
        rootPartyIDLength = value.length();
        return this;
    }

    public RootPartyIDsGroupEncoder rootPartyID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            rootPartyID.wrap(buffer);
            rootPartyIDOffset = value.offset();
            rootPartyIDLength = value.length();
        }
        return this;
    }

    public RootPartyIDsGroupEncoder rootPartyID(final char[] value)
    {
        return rootPartyID(value, 0, value.length);
    }

    public RootPartyIDsGroupEncoder rootPartyID(final char[] value, final int length)
    {
        return rootPartyID(value, 0, length);
    }

    public RootPartyIDsGroupEncoder rootPartyID(final char[] value, final int offset, final int length)
    {
        toBytes(value, rootPartyID, offset, length);
        rootPartyIDOffset = 0;
        rootPartyIDLength = length;
        return this;
    }

    private char rootPartyIDSource;

    private boolean hasRootPartyIDSource;

    public boolean hasRootPartyIDSource()
    {
        return hasRootPartyIDSource;
    }

    public RootPartyIDsGroupEncoder rootPartyIDSource(char value)
    {
        rootPartyIDSource = value;
        hasRootPartyIDSource = true;
        return this;
    }

    public char rootPartyIDSource()
    {
        return rootPartyIDSource;
    }

    private int rootPartyRole;

    private boolean hasRootPartyRole;

    public boolean hasRootPartyRole()
    {
        return hasRootPartyRole;
    }

    public RootPartyIDsGroupEncoder rootPartyRole(int value)
    {
        rootPartyRole = value;
        hasRootPartyRole = true;
        return this;
    }

    public int rootPartyRole()
    {
        return rootPartyRole;
    }

    private final RootSubPartiesEncoder rootSubParties = new RootSubPartiesEncoder();
    public RootSubPartiesEncoder rootSubParties()
    {
        return rootSubParties;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (rootPartyIDLength > 0)
        {
            buffer.putBytes(position, rootPartyIDHeader, 0, rootPartyIDHeaderLength);
            position += rootPartyIDHeaderLength;
            buffer.putBytes(position, rootPartyID, rootPartyIDOffset, rootPartyIDLength);
            position += rootPartyIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasRootPartyIDSource)
        {
            buffer.putBytes(position, rootPartyIDSourceHeader, 0, rootPartyIDSourceHeaderLength);
            position += rootPartyIDSourceHeaderLength;
            position += buffer.putCharAscii(position, rootPartyIDSource);
            buffer.putSeparator(position);
            position++;
        }

        if (hasRootPartyRole)
        {
            buffer.putBytes(position, rootPartyRoleHeader, 0, rootPartyRoleHeaderLength);
            position += rootPartyRoleHeaderLength;
            position += buffer.putIntAscii(position, rootPartyRole);
            buffer.putSeparator(position);
            position++;
        }

            position += rootSubParties.encode(buffer, position);
        if (next != null)
        {
            position += next.encode(buffer, position, remainingElements - 1);
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetRootPartyID();
        this.resetRootPartyIDSource();
        this.resetRootPartyRole();
        rootSubParties.reset();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetRootPartyID()
    {
        rootPartyIDLength = 0;
    }

    public void resetRootPartyIDSource()
    {
        hasRootPartyIDSource = false;
    }

    public void resetRootPartyRole()
    {
        hasRootPartyRole = false;
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
        builder.append("\"MessageName\": \"RootPartyIDsGroup\",\n");
        if (hasRootPartyID())
        {
            indent(builder, level);
            builder.append("\"RootPartyID\": \"");
            appendBuffer(builder, rootPartyID, rootPartyIDOffset, rootPartyIDLength);
            builder.append("\",\n");
        }

        if (hasRootPartyIDSource())
        {
            indent(builder, level);
            builder.append("\"RootPartyIDSource\": \"");
            builder.append(rootPartyIDSource);
            builder.append("\",\n");
        }

        if (hasRootPartyRole())
        {
            indent(builder, level);
            builder.append("\"RootPartyRole\": \"");
            builder.append(rootPartyRole);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"RootSubParties\": ");
    rootSubParties.appendTo(builder, level + 1);
    builder.append("\n");
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public RootPartyIDsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((RootPartyIDsGroupEncoder)encoder);
    }

    public RootPartyIDsGroupEncoder copyTo(final RootPartyIDsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasRootPartyID())
        {
            encoder.rootPartyIDAsCopy(rootPartyID.byteArray(), 0, rootPartyIDLength);
        }

        if (hasRootPartyIDSource())
        {
            encoder.rootPartyIDSource(this.rootPartyIDSource());
        }

        if (hasRootPartyRole())
        {
            encoder.rootPartyRole(this.rootPartyRole());
        }


        rootSubParties.copyTo(encoder.rootSubParties());        return encoder;
    }

}
    private int noRootPartyIDsGroupCounter;

    private boolean hasNoRootPartyIDsGroupCounter;

    public boolean hasNoRootPartyIDsGroupCounter()
    {
        return hasNoRootPartyIDsGroupCounter;
    }

    public RootPartiesEncoder noRootPartyIDsGroupCounter(int value)
    {
        noRootPartyIDsGroupCounter = value;
        hasNoRootPartyIDsGroupCounter = true;
        return this;
    }

    public int noRootPartyIDsGroupCounter()
    {
        return noRootPartyIDsGroupCounter;
    }


    private RootPartyIDsGroupEncoder rootPartyIDsGroup = null;

    public RootPartyIDsGroupEncoder rootPartyIDsGroup(final int numberOfElements)
    {
        hasNoRootPartyIDsGroupCounter = true;
        noRootPartyIDsGroupCounter = numberOfElements;
        if (rootPartyIDsGroup == null)
        {
            rootPartyIDsGroup = new RootPartyIDsGroupEncoder();
        }
        return rootPartyIDsGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoRootPartyIDsGroupCounter)
        {
            buffer.putBytes(position, noRootPartyIDsGroupCounterHeader, 0, noRootPartyIDsGroupCounterHeaderLength);
            position += noRootPartyIDsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noRootPartyIDsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (rootPartyIDsGroup != null)
        {
            position += rootPartyIDsGroup.encode(buffer, position, noRootPartyIDsGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetRootPartyIDsGroup();
    }

    public void resetRootPartyIDsGroup()
    {
        if (rootPartyIDsGroup != null)
        {
            rootPartyIDsGroup.reset();
        }
        noRootPartyIDsGroupCounter = 0;
        hasNoRootPartyIDsGroupCounter = false;
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
        builder.append("\"MessageName\": \"RootParties\",\n");
        if (hasNoRootPartyIDsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"RootPartyIDsGroup\": [\n");
            final int noRootPartyIDsGroupCounter = this.noRootPartyIDsGroupCounter;
            RootPartyIDsGroupEncoder rootPartyIDsGroup = this.rootPartyIDsGroup;
            for (int i = 0; i < noRootPartyIDsGroupCounter; i++)
            {
                indent(builder, level);
                rootPartyIDsGroup.appendTo(builder, level + 1);
                if (i < (noRootPartyIDsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                rootPartyIDsGroup = rootPartyIDsGroup.next();
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
    public RootPartiesEncoder copyTo(final Encoder encoder)
    {
        return copyTo((RootPartiesEncoder)encoder);
    }

    public RootPartiesEncoder copyTo(final RootPartiesEncoder encoder)
    {
        encoder.reset();
        if (hasNoRootPartyIDsGroupCounter)
        {
            final int size = this.noRootPartyIDsGroupCounter;
            RootPartyIDsGroupEncoder rootPartyIDsGroup = this.rootPartyIDsGroup;
            RootPartyIDsGroupEncoder rootPartyIDsGroupEncoder = encoder.rootPartyIDsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (rootPartyIDsGroup != null)
                {
                    rootPartyIDsGroup.copyTo(rootPartyIDsGroupEncoder);
                    rootPartyIDsGroup = rootPartyIDsGroup.next();
                    rootPartyIDsGroupEncoder = rootPartyIDsGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
