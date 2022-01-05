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


public class UsernameGrpEncoder
{
    private static final int noUsernamesGroupCounterHeaderLength = 4;
    private static final byte[] noUsernamesGroupCounterHeader = new byte[] {56, 48, 57, (byte) '='};



public static class UsernamesGroupEncoder
{
    private UsernamesGroupEncoder next = null;

    public UsernamesGroupEncoder next()
    {
        if (next == null)
        {
            next = new UsernamesGroupEncoder();
        }
        return next;
    }

    private static final int usernameHeaderLength = 4;
    private static final byte[] usernameHeader = new byte[] {53, 53, 51, (byte) '='};

    private final MutableDirectBuffer username = new UnsafeBuffer();

    private int usernameOffset = 0;

    private int usernameLength = 0;

    public UsernamesGroupEncoder username(final DirectBuffer value, final int offset, final int length)
    {
        username.wrap(value);
        usernameOffset = offset;
        usernameLength = length;
        return this;
    }

    public UsernamesGroupEncoder username(final DirectBuffer value, final int length)
    {
        return username(value, 0, length);
    }

    public UsernamesGroupEncoder username(final DirectBuffer value)
    {
        return username(value, 0, value.capacity());
    }

    public UsernamesGroupEncoder username(final byte[] value, final int offset, final int length)
    {
        username.wrap(value);
        usernameOffset = offset;
        usernameLength = length;
        return this;
    }

    public UsernamesGroupEncoder usernameAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(username, value, offset, length);
        usernameOffset = offset;
        usernameLength = length;
        return this;
    }

    public UsernamesGroupEncoder username(final byte[] value, final int length)
    {
        return username(value, 0, length);
    }

    public UsernamesGroupEncoder username(final byte[] value)
    {
        return username(value, 0, value.length);
    }

    public boolean hasUsername()
    {
        return usernameLength > 0;
    }

    public MutableDirectBuffer username()
    {
        return username;
    }

    public String usernameAsString()
    {
        return username.getStringWithoutLengthAscii(usernameOffset, usernameLength);
    }

    public UsernamesGroupEncoder username(final CharSequence value)
    {
        toBytes(value, username);
        usernameOffset = 0;
        usernameLength = value.length();
        return this;
    }

    public UsernamesGroupEncoder username(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            username.wrap(buffer);
            usernameOffset = value.offset();
            usernameLength = value.length();
        }
        return this;
    }

    public UsernamesGroupEncoder username(final char[] value)
    {
        return username(value, 0, value.length);
    }

    public UsernamesGroupEncoder username(final char[] value, final int length)
    {
        return username(value, 0, length);
    }

    public UsernamesGroupEncoder username(final char[] value, final int offset, final int length)
    {
        toBytes(value, username, offset, length);
        usernameOffset = 0;
        usernameLength = length;
        return this;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (usernameLength > 0)
        {
            buffer.putBytes(position, usernameHeader, 0, usernameHeaderLength);
            position += usernameHeaderLength;
            buffer.putBytes(position, username, usernameOffset, usernameLength);
            position += usernameLength;
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
        this.resetUsername();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetUsername()
    {
        usernameLength = 0;
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
        builder.append("\"MessageName\": \"UsernamesGroup\",\n");
        if (hasUsername())
        {
            indent(builder, level);
            builder.append("\"Username\": \"");
            appendBuffer(builder, username, usernameOffset, usernameLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public UsernamesGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((UsernamesGroupEncoder)encoder);
    }

    public UsernamesGroupEncoder copyTo(final UsernamesGroupEncoder encoder)
    {
        encoder.reset();
        if (hasUsername())
        {
            encoder.usernameAsCopy(username.byteArray(), 0, usernameLength);
        }
        return encoder;
    }

}
    private int noUsernamesGroupCounter;

    private boolean hasNoUsernamesGroupCounter;

    public boolean hasNoUsernamesGroupCounter()
    {
        return hasNoUsernamesGroupCounter;
    }

    public UsernameGrpEncoder noUsernamesGroupCounter(int value)
    {
        noUsernamesGroupCounter = value;
        hasNoUsernamesGroupCounter = true;
        return this;
    }

    public int noUsernamesGroupCounter()
    {
        return noUsernamesGroupCounter;
    }


    private UsernamesGroupEncoder usernamesGroup = null;

    public UsernamesGroupEncoder usernamesGroup(final int numberOfElements)
    {
        hasNoUsernamesGroupCounter = true;
        noUsernamesGroupCounter = numberOfElements;
        if (usernamesGroup == null)
        {
            usernamesGroup = new UsernamesGroupEncoder();
        }
        return usernamesGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoUsernamesGroupCounter)
        {
            buffer.putBytes(position, noUsernamesGroupCounterHeader, 0, noUsernamesGroupCounterHeaderLength);
            position += noUsernamesGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noUsernamesGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (usernamesGroup != null)
        {
            position += usernamesGroup.encode(buffer, position, noUsernamesGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetUsernamesGroup();
    }

    public void resetUsernamesGroup()
    {
        if (usernamesGroup != null)
        {
            usernamesGroup.reset();
        }
        noUsernamesGroupCounter = 0;
        hasNoUsernamesGroupCounter = false;
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
        builder.append("\"MessageName\": \"UsernameGrp\",\n");
        if (hasNoUsernamesGroupCounter)
        {
            indent(builder, level);
            builder.append("\"UsernamesGroup\": [\n");
            final int noUsernamesGroupCounter = this.noUsernamesGroupCounter;
            UsernamesGroupEncoder usernamesGroup = this.usernamesGroup;
            for (int i = 0; i < noUsernamesGroupCounter; i++)
            {
                indent(builder, level);
                usernamesGroup.appendTo(builder, level + 1);
                if (i < (noUsernamesGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                usernamesGroup = usernamesGroup.next();
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
    public UsernameGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((UsernameGrpEncoder)encoder);
    }

    public UsernameGrpEncoder copyTo(final UsernameGrpEncoder encoder)
    {
        encoder.reset();
        if (hasNoUsernamesGroupCounter)
        {
            final int size = this.noUsernamesGroupCounter;
            UsernamesGroupEncoder usernamesGroup = this.usernamesGroup;
            UsernamesGroupEncoder usernamesGroupEncoder = encoder.usernamesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (usernamesGroup != null)
                {
                    usernamesGroup.copyTo(usernamesGroupEncoder);
                    usernamesGroup = usernamesGroup.next();
                    usernamesGroupEncoder = usernamesGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
