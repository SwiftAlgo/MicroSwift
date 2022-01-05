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


public class RootSubPartiesEncoder
{
    private static final int noRootPartySubIDsGroupCounterHeaderLength = 5;
    private static final byte[] noRootPartySubIDsGroupCounterHeader = new byte[] {49, 49, 50, 48, (byte) '='};



public static class RootPartySubIDsGroupEncoder
{
    private RootPartySubIDsGroupEncoder next = null;

    public RootPartySubIDsGroupEncoder next()
    {
        if (next == null)
        {
            next = new RootPartySubIDsGroupEncoder();
        }
        return next;
    }

    private static final int rootPartySubIDHeaderLength = 5;
    private static final byte[] rootPartySubIDHeader = new byte[] {49, 49, 50, 49, (byte) '='};

    private static final int rootPartySubIDTypeHeaderLength = 5;
    private static final byte[] rootPartySubIDTypeHeader = new byte[] {49, 49, 50, 50, (byte) '='};

    private final MutableDirectBuffer rootPartySubID = new UnsafeBuffer();

    private int rootPartySubIDOffset = 0;

    private int rootPartySubIDLength = 0;

    public RootPartySubIDsGroupEncoder rootPartySubID(final DirectBuffer value, final int offset, final int length)
    {
        rootPartySubID.wrap(value);
        rootPartySubIDOffset = offset;
        rootPartySubIDLength = length;
        return this;
    }

    public RootPartySubIDsGroupEncoder rootPartySubID(final DirectBuffer value, final int length)
    {
        return rootPartySubID(value, 0, length);
    }

    public RootPartySubIDsGroupEncoder rootPartySubID(final DirectBuffer value)
    {
        return rootPartySubID(value, 0, value.capacity());
    }

    public RootPartySubIDsGroupEncoder rootPartySubID(final byte[] value, final int offset, final int length)
    {
        rootPartySubID.wrap(value);
        rootPartySubIDOffset = offset;
        rootPartySubIDLength = length;
        return this;
    }

    public RootPartySubIDsGroupEncoder rootPartySubIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(rootPartySubID, value, offset, length);
        rootPartySubIDOffset = offset;
        rootPartySubIDLength = length;
        return this;
    }

    public RootPartySubIDsGroupEncoder rootPartySubID(final byte[] value, final int length)
    {
        return rootPartySubID(value, 0, length);
    }

    public RootPartySubIDsGroupEncoder rootPartySubID(final byte[] value)
    {
        return rootPartySubID(value, 0, value.length);
    }

    public boolean hasRootPartySubID()
    {
        return rootPartySubIDLength > 0;
    }

    public MutableDirectBuffer rootPartySubID()
    {
        return rootPartySubID;
    }

    public String rootPartySubIDAsString()
    {
        return rootPartySubID.getStringWithoutLengthAscii(rootPartySubIDOffset, rootPartySubIDLength);
    }

    public RootPartySubIDsGroupEncoder rootPartySubID(final CharSequence value)
    {
        toBytes(value, rootPartySubID);
        rootPartySubIDOffset = 0;
        rootPartySubIDLength = value.length();
        return this;
    }

    public RootPartySubIDsGroupEncoder rootPartySubID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            rootPartySubID.wrap(buffer);
            rootPartySubIDOffset = value.offset();
            rootPartySubIDLength = value.length();
        }
        return this;
    }

    public RootPartySubIDsGroupEncoder rootPartySubID(final char[] value)
    {
        return rootPartySubID(value, 0, value.length);
    }

    public RootPartySubIDsGroupEncoder rootPartySubID(final char[] value, final int length)
    {
        return rootPartySubID(value, 0, length);
    }

    public RootPartySubIDsGroupEncoder rootPartySubID(final char[] value, final int offset, final int length)
    {
        toBytes(value, rootPartySubID, offset, length);
        rootPartySubIDOffset = 0;
        rootPartySubIDLength = length;
        return this;
    }

    private int rootPartySubIDType;

    private boolean hasRootPartySubIDType;

    public boolean hasRootPartySubIDType()
    {
        return hasRootPartySubIDType;
    }

    public RootPartySubIDsGroupEncoder rootPartySubIDType(int value)
    {
        rootPartySubIDType = value;
        hasRootPartySubIDType = true;
        return this;
    }

    public int rootPartySubIDType()
    {
        return rootPartySubIDType;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (rootPartySubIDLength > 0)
        {
            buffer.putBytes(position, rootPartySubIDHeader, 0, rootPartySubIDHeaderLength);
            position += rootPartySubIDHeaderLength;
            buffer.putBytes(position, rootPartySubID, rootPartySubIDOffset, rootPartySubIDLength);
            position += rootPartySubIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasRootPartySubIDType)
        {
            buffer.putBytes(position, rootPartySubIDTypeHeader, 0, rootPartySubIDTypeHeaderLength);
            position += rootPartySubIDTypeHeaderLength;
            position += buffer.putIntAscii(position, rootPartySubIDType);
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
        this.resetRootPartySubID();
        this.resetRootPartySubIDType();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetRootPartySubID()
    {
        rootPartySubIDLength = 0;
    }

    public void resetRootPartySubIDType()
    {
        hasRootPartySubIDType = false;
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
        builder.append("\"MessageName\": \"RootPartySubIDsGroup\",\n");
        if (hasRootPartySubID())
        {
            indent(builder, level);
            builder.append("\"RootPartySubID\": \"");
            appendBuffer(builder, rootPartySubID, rootPartySubIDOffset, rootPartySubIDLength);
            builder.append("\",\n");
        }

        if (hasRootPartySubIDType())
        {
            indent(builder, level);
            builder.append("\"RootPartySubIDType\": \"");
            builder.append(rootPartySubIDType);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public RootPartySubIDsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((RootPartySubIDsGroupEncoder)encoder);
    }

    public RootPartySubIDsGroupEncoder copyTo(final RootPartySubIDsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasRootPartySubID())
        {
            encoder.rootPartySubIDAsCopy(rootPartySubID.byteArray(), 0, rootPartySubIDLength);
        }

        if (hasRootPartySubIDType())
        {
            encoder.rootPartySubIDType(this.rootPartySubIDType());
        }
        return encoder;
    }

}
    private int noRootPartySubIDsGroupCounter;

    private boolean hasNoRootPartySubIDsGroupCounter;

    public boolean hasNoRootPartySubIDsGroupCounter()
    {
        return hasNoRootPartySubIDsGroupCounter;
    }

    public RootSubPartiesEncoder noRootPartySubIDsGroupCounter(int value)
    {
        noRootPartySubIDsGroupCounter = value;
        hasNoRootPartySubIDsGroupCounter = true;
        return this;
    }

    public int noRootPartySubIDsGroupCounter()
    {
        return noRootPartySubIDsGroupCounter;
    }


    private RootPartySubIDsGroupEncoder rootPartySubIDsGroup = null;

    public RootPartySubIDsGroupEncoder rootPartySubIDsGroup(final int numberOfElements)
    {
        hasNoRootPartySubIDsGroupCounter = true;
        noRootPartySubIDsGroupCounter = numberOfElements;
        if (rootPartySubIDsGroup == null)
        {
            rootPartySubIDsGroup = new RootPartySubIDsGroupEncoder();
        }
        return rootPartySubIDsGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoRootPartySubIDsGroupCounter)
        {
            buffer.putBytes(position, noRootPartySubIDsGroupCounterHeader, 0, noRootPartySubIDsGroupCounterHeaderLength);
            position += noRootPartySubIDsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noRootPartySubIDsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (rootPartySubIDsGroup != null)
        {
            position += rootPartySubIDsGroup.encode(buffer, position, noRootPartySubIDsGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetRootPartySubIDsGroup();
    }

    public void resetRootPartySubIDsGroup()
    {
        if (rootPartySubIDsGroup != null)
        {
            rootPartySubIDsGroup.reset();
        }
        noRootPartySubIDsGroupCounter = 0;
        hasNoRootPartySubIDsGroupCounter = false;
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
        builder.append("\"MessageName\": \"RootSubParties\",\n");
        if (hasNoRootPartySubIDsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"RootPartySubIDsGroup\": [\n");
            final int noRootPartySubIDsGroupCounter = this.noRootPartySubIDsGroupCounter;
            RootPartySubIDsGroupEncoder rootPartySubIDsGroup = this.rootPartySubIDsGroup;
            for (int i = 0; i < noRootPartySubIDsGroupCounter; i++)
            {
                indent(builder, level);
                rootPartySubIDsGroup.appendTo(builder, level + 1);
                if (i < (noRootPartySubIDsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                rootPartySubIDsGroup = rootPartySubIDsGroup.next();
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
    public RootSubPartiesEncoder copyTo(final Encoder encoder)
    {
        return copyTo((RootSubPartiesEncoder)encoder);
    }

    public RootSubPartiesEncoder copyTo(final RootSubPartiesEncoder encoder)
    {
        encoder.reset();
        if (hasNoRootPartySubIDsGroupCounter)
        {
            final int size = this.noRootPartySubIDsGroupCounter;
            RootPartySubIDsGroupEncoder rootPartySubIDsGroup = this.rootPartySubIDsGroup;
            RootPartySubIDsGroupEncoder rootPartySubIDsGroupEncoder = encoder.rootPartySubIDsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (rootPartySubIDsGroup != null)
                {
                    rootPartySubIDsGroup.copyTo(rootPartySubIDsGroupEncoder);
                    rootPartySubIDsGroup = rootPartySubIDsGroup.next();
                    rootPartySubIDsGroupEncoder = rootPartySubIDsGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
