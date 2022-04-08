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


public class SettlPtysSubGrpEncoder
{
    private static final int noSettlPartySubIDsGroupCounterHeaderLength = 4;
    private static final byte[] noSettlPartySubIDsGroupCounterHeader = new byte[] {56, 48, 49, (byte) '='};



public static class SettlPartySubIDsGroupEncoder
{
    private SettlPartySubIDsGroupEncoder next = null;

    public SettlPartySubIDsGroupEncoder next()
    {
        if (next == null)
        {
            next = new SettlPartySubIDsGroupEncoder();
        }
        return next;
    }

    private static final int settlPartySubIDHeaderLength = 4;
    private static final byte[] settlPartySubIDHeader = new byte[] {55, 56, 53, (byte) '='};

    private static final int settlPartySubIDTypeHeaderLength = 4;
    private static final byte[] settlPartySubIDTypeHeader = new byte[] {55, 56, 54, (byte) '='};

    private final MutableDirectBuffer settlPartySubID = new UnsafeBuffer();

    private int settlPartySubIDOffset = 0;

    private int settlPartySubIDLength = 0;

    public SettlPartySubIDsGroupEncoder settlPartySubID(final DirectBuffer value, final int offset, final int length)
    {
        settlPartySubID.wrap(value);
        settlPartySubIDOffset = offset;
        settlPartySubIDLength = length;
        return this;
    }

    public SettlPartySubIDsGroupEncoder settlPartySubID(final DirectBuffer value, final int length)
    {
        return settlPartySubID(value, 0, length);
    }

    public SettlPartySubIDsGroupEncoder settlPartySubID(final DirectBuffer value)
    {
        return settlPartySubID(value, 0, value.capacity());
    }

    public SettlPartySubIDsGroupEncoder settlPartySubID(final byte[] value, final int offset, final int length)
    {
        settlPartySubID.wrap(value);
        settlPartySubIDOffset = offset;
        settlPartySubIDLength = length;
        return this;
    }

    public SettlPartySubIDsGroupEncoder settlPartySubIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlPartySubID, value, offset, length);
        settlPartySubIDOffset = offset;
        settlPartySubIDLength = length;
        return this;
    }

    public SettlPartySubIDsGroupEncoder settlPartySubID(final byte[] value, final int length)
    {
        return settlPartySubID(value, 0, length);
    }

    public SettlPartySubIDsGroupEncoder settlPartySubID(final byte[] value)
    {
        return settlPartySubID(value, 0, value.length);
    }

    public boolean hasSettlPartySubID()
    {
        return settlPartySubIDLength > 0;
    }

    public MutableDirectBuffer settlPartySubID()
    {
        return settlPartySubID;
    }

    public String settlPartySubIDAsString()
    {
        return settlPartySubID.getStringWithoutLengthAscii(settlPartySubIDOffset, settlPartySubIDLength);
    }

    public SettlPartySubIDsGroupEncoder settlPartySubID(final CharSequence value)
    {
        toBytes(value, settlPartySubID);
        settlPartySubIDOffset = 0;
        settlPartySubIDLength = value.length();
        return this;
    }

    public SettlPartySubIDsGroupEncoder settlPartySubID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            settlPartySubID.wrap(buffer);
            settlPartySubIDOffset = value.offset();
            settlPartySubIDLength = value.length();
        }
        return this;
    }

    public SettlPartySubIDsGroupEncoder settlPartySubID(final char[] value)
    {
        return settlPartySubID(value, 0, value.length);
    }

    public SettlPartySubIDsGroupEncoder settlPartySubID(final char[] value, final int length)
    {
        return settlPartySubID(value, 0, length);
    }

    public SettlPartySubIDsGroupEncoder settlPartySubID(final char[] value, final int offset, final int length)
    {
        toBytes(value, settlPartySubID, offset, length);
        settlPartySubIDOffset = 0;
        settlPartySubIDLength = length;
        return this;
    }

    private int settlPartySubIDType;

    private boolean hasSettlPartySubIDType;

    public boolean hasSettlPartySubIDType()
    {
        return hasSettlPartySubIDType;
    }

    public SettlPartySubIDsGroupEncoder settlPartySubIDType(int value)
    {
        settlPartySubIDType = value;
        hasSettlPartySubIDType = true;
        return this;
    }

    public int settlPartySubIDType()
    {
        return settlPartySubIDType;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (settlPartySubIDLength > 0)
        {
            buffer.putBytes(position, settlPartySubIDHeader, 0, settlPartySubIDHeaderLength);
            position += settlPartySubIDHeaderLength;
            buffer.putBytes(position, settlPartySubID, settlPartySubIDOffset, settlPartySubIDLength);
            position += settlPartySubIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasSettlPartySubIDType)
        {
            buffer.putBytes(position, settlPartySubIDTypeHeader, 0, settlPartySubIDTypeHeaderLength);
            position += settlPartySubIDTypeHeaderLength;
            position += buffer.putIntAscii(position, settlPartySubIDType);
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
        this.resetSettlPartySubID();
        this.resetSettlPartySubIDType();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetSettlPartySubID()
    {
        settlPartySubIDLength = 0;
    }

    public void resetSettlPartySubIDType()
    {
        hasSettlPartySubIDType = false;
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
        builder.append("\"MessageName\": \"SettlPartySubIDsGroup\",\n");
        if (hasSettlPartySubID())
        {
            indent(builder, level);
            builder.append("\"SettlPartySubID\": \"");
            appendBuffer(builder, settlPartySubID, settlPartySubIDOffset, settlPartySubIDLength);
            builder.append("\",\n");
        }

        if (hasSettlPartySubIDType())
        {
            indent(builder, level);
            builder.append("\"SettlPartySubIDType\": \"");
            builder.append(settlPartySubIDType);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public SettlPartySubIDsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((SettlPartySubIDsGroupEncoder)encoder);
    }

    public SettlPartySubIDsGroupEncoder copyTo(final SettlPartySubIDsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasSettlPartySubID())
        {
            encoder.settlPartySubIDAsCopy(settlPartySubID.byteArray(), 0, settlPartySubIDLength);
        }

        if (hasSettlPartySubIDType())
        {
            encoder.settlPartySubIDType(this.settlPartySubIDType());
        }
        return encoder;
    }

}
    private int noSettlPartySubIDsGroupCounter;

    private boolean hasNoSettlPartySubIDsGroupCounter;

    public boolean hasNoSettlPartySubIDsGroupCounter()
    {
        return hasNoSettlPartySubIDsGroupCounter;
    }

    public SettlPtysSubGrpEncoder noSettlPartySubIDsGroupCounter(int value)
    {
        noSettlPartySubIDsGroupCounter = value;
        hasNoSettlPartySubIDsGroupCounter = true;
        return this;
    }

    public int noSettlPartySubIDsGroupCounter()
    {
        return noSettlPartySubIDsGroupCounter;
    }


    private SettlPartySubIDsGroupEncoder settlPartySubIDsGroup = null;

    public SettlPartySubIDsGroupEncoder settlPartySubIDsGroup(final int numberOfElements)
    {
        hasNoSettlPartySubIDsGroupCounter = true;
        noSettlPartySubIDsGroupCounter = numberOfElements;
        if (settlPartySubIDsGroup == null)
        {
            settlPartySubIDsGroup = new SettlPartySubIDsGroupEncoder();
        }
        return settlPartySubIDsGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoSettlPartySubIDsGroupCounter)
        {
            buffer.putBytes(position, noSettlPartySubIDsGroupCounterHeader, 0, noSettlPartySubIDsGroupCounterHeaderLength);
            position += noSettlPartySubIDsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noSettlPartySubIDsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (settlPartySubIDsGroup != null)
        {
            position += settlPartySubIDsGroup.encode(buffer, position, noSettlPartySubIDsGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetSettlPartySubIDsGroup();
    }

    public void resetSettlPartySubIDsGroup()
    {
        if (settlPartySubIDsGroup != null)
        {
            settlPartySubIDsGroup.reset();
        }
        noSettlPartySubIDsGroupCounter = 0;
        hasNoSettlPartySubIDsGroupCounter = false;
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
        builder.append("\"MessageName\": \"SettlPtysSubGrp\",\n");
        if (hasNoSettlPartySubIDsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"SettlPartySubIDsGroup\": [\n");
            final int noSettlPartySubIDsGroupCounter = this.noSettlPartySubIDsGroupCounter;
            SettlPartySubIDsGroupEncoder settlPartySubIDsGroup = this.settlPartySubIDsGroup;
            for (int i = 0; i < noSettlPartySubIDsGroupCounter; i++)
            {
                indent(builder, level);
                settlPartySubIDsGroup.appendTo(builder, level + 1);
                if (i < (noSettlPartySubIDsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                settlPartySubIDsGroup = settlPartySubIDsGroup.next();
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
    public SettlPtysSubGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((SettlPtysSubGrpEncoder)encoder);
    }

    public SettlPtysSubGrpEncoder copyTo(final SettlPtysSubGrpEncoder encoder)
    {
        encoder.reset();
        if (hasNoSettlPartySubIDsGroupCounter)
        {
            final int size = this.noSettlPartySubIDsGroupCounter;
            SettlPartySubIDsGroupEncoder settlPartySubIDsGroup = this.settlPartySubIDsGroup;
            SettlPartySubIDsGroupEncoder settlPartySubIDsGroupEncoder = encoder.settlPartySubIDsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (settlPartySubIDsGroup != null)
                {
                    settlPartySubIDsGroup.copyTo(settlPartySubIDsGroupEncoder);
                    settlPartySubIDsGroup = settlPartySubIDsGroup.next();
                    settlPartySubIDsGroupEncoder = settlPartySubIDsGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
