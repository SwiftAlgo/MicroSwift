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


public class TargetPartiesEncoder
{
    private static final int noTargetPartyIDsGroupCounterHeaderLength = 5;
    private static final byte[] noTargetPartyIDsGroupCounterHeader = new byte[] {49, 52, 54, 49, (byte) '='};



public static class TargetPartyIDsGroupEncoder
{
    private TargetPartyIDsGroupEncoder next = null;

    public TargetPartyIDsGroupEncoder next()
    {
        if (next == null)
        {
            next = new TargetPartyIDsGroupEncoder();
        }
        return next;
    }

    private static final int targetPartyIDHeaderLength = 5;
    private static final byte[] targetPartyIDHeader = new byte[] {49, 52, 54, 50, (byte) '='};

    private static final int targetPartyIDSourceHeaderLength = 5;
    private static final byte[] targetPartyIDSourceHeader = new byte[] {49, 52, 54, 51, (byte) '='};

    private static final int targetPartyRoleHeaderLength = 5;
    private static final byte[] targetPartyRoleHeader = new byte[] {49, 52, 54, 52, (byte) '='};

    private final MutableDirectBuffer targetPartyID = new UnsafeBuffer();

    private int targetPartyIDOffset = 0;

    private int targetPartyIDLength = 0;

    public TargetPartyIDsGroupEncoder targetPartyID(final DirectBuffer value, final int offset, final int length)
    {
        targetPartyID.wrap(value);
        targetPartyIDOffset = offset;
        targetPartyIDLength = length;
        return this;
    }

    public TargetPartyIDsGroupEncoder targetPartyID(final DirectBuffer value, final int length)
    {
        return targetPartyID(value, 0, length);
    }

    public TargetPartyIDsGroupEncoder targetPartyID(final DirectBuffer value)
    {
        return targetPartyID(value, 0, value.capacity());
    }

    public TargetPartyIDsGroupEncoder targetPartyID(final byte[] value, final int offset, final int length)
    {
        targetPartyID.wrap(value);
        targetPartyIDOffset = offset;
        targetPartyIDLength = length;
        return this;
    }

    public TargetPartyIDsGroupEncoder targetPartyIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(targetPartyID, value, offset, length);
        targetPartyIDOffset = offset;
        targetPartyIDLength = length;
        return this;
    }

    public TargetPartyIDsGroupEncoder targetPartyID(final byte[] value, final int length)
    {
        return targetPartyID(value, 0, length);
    }

    public TargetPartyIDsGroupEncoder targetPartyID(final byte[] value)
    {
        return targetPartyID(value, 0, value.length);
    }

    public boolean hasTargetPartyID()
    {
        return targetPartyIDLength > 0;
    }

    public MutableDirectBuffer targetPartyID()
    {
        return targetPartyID;
    }

    public String targetPartyIDAsString()
    {
        return targetPartyID.getStringWithoutLengthAscii(targetPartyIDOffset, targetPartyIDLength);
    }

    public TargetPartyIDsGroupEncoder targetPartyID(final CharSequence value)
    {
        toBytes(value, targetPartyID);
        targetPartyIDOffset = 0;
        targetPartyIDLength = value.length();
        return this;
    }

    public TargetPartyIDsGroupEncoder targetPartyID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            targetPartyID.wrap(buffer);
            targetPartyIDOffset = value.offset();
            targetPartyIDLength = value.length();
        }
        return this;
    }

    public TargetPartyIDsGroupEncoder targetPartyID(final char[] value)
    {
        return targetPartyID(value, 0, value.length);
    }

    public TargetPartyIDsGroupEncoder targetPartyID(final char[] value, final int length)
    {
        return targetPartyID(value, 0, length);
    }

    public TargetPartyIDsGroupEncoder targetPartyID(final char[] value, final int offset, final int length)
    {
        toBytes(value, targetPartyID, offset, length);
        targetPartyIDOffset = 0;
        targetPartyIDLength = length;
        return this;
    }

    private char targetPartyIDSource;

    private boolean hasTargetPartyIDSource;

    public boolean hasTargetPartyIDSource()
    {
        return hasTargetPartyIDSource;
    }

    public TargetPartyIDsGroupEncoder targetPartyIDSource(char value)
    {
        targetPartyIDSource = value;
        hasTargetPartyIDSource = true;
        return this;
    }

    public char targetPartyIDSource()
    {
        return targetPartyIDSource;
    }

    private int targetPartyRole;

    private boolean hasTargetPartyRole;

    public boolean hasTargetPartyRole()
    {
        return hasTargetPartyRole;
    }

    public TargetPartyIDsGroupEncoder targetPartyRole(int value)
    {
        targetPartyRole = value;
        hasTargetPartyRole = true;
        return this;
    }

    public int targetPartyRole()
    {
        return targetPartyRole;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (targetPartyIDLength > 0)
        {
            buffer.putBytes(position, targetPartyIDHeader, 0, targetPartyIDHeaderLength);
            position += targetPartyIDHeaderLength;
            buffer.putBytes(position, targetPartyID, targetPartyIDOffset, targetPartyIDLength);
            position += targetPartyIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasTargetPartyIDSource)
        {
            buffer.putBytes(position, targetPartyIDSourceHeader, 0, targetPartyIDSourceHeaderLength);
            position += targetPartyIDSourceHeaderLength;
            position += buffer.putCharAscii(position, targetPartyIDSource);
            buffer.putSeparator(position);
            position++;
        }

        if (hasTargetPartyRole)
        {
            buffer.putBytes(position, targetPartyRoleHeader, 0, targetPartyRoleHeaderLength);
            position += targetPartyRoleHeaderLength;
            position += buffer.putIntAscii(position, targetPartyRole);
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
        this.resetTargetPartyID();
        this.resetTargetPartyIDSource();
        this.resetTargetPartyRole();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetTargetPartyID()
    {
        targetPartyIDLength = 0;
    }

    public void resetTargetPartyIDSource()
    {
        hasTargetPartyIDSource = false;
    }

    public void resetTargetPartyRole()
    {
        hasTargetPartyRole = false;
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
        builder.append("\"MessageName\": \"TargetPartyIDsGroup\",\n");
        if (hasTargetPartyID())
        {
            indent(builder, level);
            builder.append("\"TargetPartyID\": \"");
            appendBuffer(builder, targetPartyID, targetPartyIDOffset, targetPartyIDLength);
            builder.append("\",\n");
        }

        if (hasTargetPartyIDSource())
        {
            indent(builder, level);
            builder.append("\"TargetPartyIDSource\": \"");
            builder.append(targetPartyIDSource);
            builder.append("\",\n");
        }

        if (hasTargetPartyRole())
        {
            indent(builder, level);
            builder.append("\"TargetPartyRole\": \"");
            builder.append(targetPartyRole);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public TargetPartyIDsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((TargetPartyIDsGroupEncoder)encoder);
    }

    public TargetPartyIDsGroupEncoder copyTo(final TargetPartyIDsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasTargetPartyID())
        {
            encoder.targetPartyIDAsCopy(targetPartyID.byteArray(), 0, targetPartyIDLength);
        }

        if (hasTargetPartyIDSource())
        {
            encoder.targetPartyIDSource(this.targetPartyIDSource());
        }

        if (hasTargetPartyRole())
        {
            encoder.targetPartyRole(this.targetPartyRole());
        }
        return encoder;
    }

}
    private int noTargetPartyIDsGroupCounter;

    private boolean hasNoTargetPartyIDsGroupCounter;

    public boolean hasNoTargetPartyIDsGroupCounter()
    {
        return hasNoTargetPartyIDsGroupCounter;
    }

    public TargetPartiesEncoder noTargetPartyIDsGroupCounter(int value)
    {
        noTargetPartyIDsGroupCounter = value;
        hasNoTargetPartyIDsGroupCounter = true;
        return this;
    }

    public int noTargetPartyIDsGroupCounter()
    {
        return noTargetPartyIDsGroupCounter;
    }


    private TargetPartyIDsGroupEncoder targetPartyIDsGroup = null;

    public TargetPartyIDsGroupEncoder targetPartyIDsGroup(final int numberOfElements)
    {
        hasNoTargetPartyIDsGroupCounter = true;
        noTargetPartyIDsGroupCounter = numberOfElements;
        if (targetPartyIDsGroup == null)
        {
            targetPartyIDsGroup = new TargetPartyIDsGroupEncoder();
        }
        return targetPartyIDsGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoTargetPartyIDsGroupCounter)
        {
            buffer.putBytes(position, noTargetPartyIDsGroupCounterHeader, 0, noTargetPartyIDsGroupCounterHeaderLength);
            position += noTargetPartyIDsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noTargetPartyIDsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (targetPartyIDsGroup != null)
        {
            position += targetPartyIDsGroup.encode(buffer, position, noTargetPartyIDsGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetTargetPartyIDsGroup();
    }

    public void resetTargetPartyIDsGroup()
    {
        if (targetPartyIDsGroup != null)
        {
            targetPartyIDsGroup.reset();
        }
        noTargetPartyIDsGroupCounter = 0;
        hasNoTargetPartyIDsGroupCounter = false;
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
        builder.append("\"MessageName\": \"TargetParties\",\n");
        if (hasNoTargetPartyIDsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"TargetPartyIDsGroup\": [\n");
            final int noTargetPartyIDsGroupCounter = this.noTargetPartyIDsGroupCounter;
            TargetPartyIDsGroupEncoder targetPartyIDsGroup = this.targetPartyIDsGroup;
            for (int i = 0; i < noTargetPartyIDsGroupCounter; i++)
            {
                indent(builder, level);
                targetPartyIDsGroup.appendTo(builder, level + 1);
                if (i < (noTargetPartyIDsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                targetPartyIDsGroup = targetPartyIDsGroup.next();
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
    public TargetPartiesEncoder copyTo(final Encoder encoder)
    {
        return copyTo((TargetPartiesEncoder)encoder);
    }

    public TargetPartiesEncoder copyTo(final TargetPartiesEncoder encoder)
    {
        encoder.reset();
        if (hasNoTargetPartyIDsGroupCounter)
        {
            final int size = this.noTargetPartyIDsGroupCounter;
            TargetPartyIDsGroupEncoder targetPartyIDsGroup = this.targetPartyIDsGroup;
            TargetPartyIDsGroupEncoder targetPartyIDsGroupEncoder = encoder.targetPartyIDsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (targetPartyIDsGroup != null)
                {
                    targetPartyIDsGroup.copyTo(targetPartyIDsGroupEncoder);
                    targetPartyIDsGroup = targetPartyIDsGroup.next();
                    targetPartyIDsGroupEncoder = targetPartyIDsGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
