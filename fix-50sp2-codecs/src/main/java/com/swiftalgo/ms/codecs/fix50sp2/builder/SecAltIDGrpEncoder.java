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


public class SecAltIDGrpEncoder
{
    private static final int noSecurityAltIDGroupCounterHeaderLength = 4;
    private static final byte[] noSecurityAltIDGroupCounterHeader = new byte[] {52, 53, 52, (byte) '='};



public static class SecurityAltIDGroupEncoder
{
    private SecurityAltIDGroupEncoder next = null;

    public SecurityAltIDGroupEncoder next()
    {
        if (next == null)
        {
            next = new SecurityAltIDGroupEncoder();
        }
        return next;
    }

    private static final int securityAltIDHeaderLength = 4;
    private static final byte[] securityAltIDHeader = new byte[] {52, 53, 53, (byte) '='};

    private static final int securityAltIDSourceHeaderLength = 4;
    private static final byte[] securityAltIDSourceHeader = new byte[] {52, 53, 54, (byte) '='};

    private final MutableDirectBuffer securityAltID = new UnsafeBuffer();

    private int securityAltIDOffset = 0;

    private int securityAltIDLength = 0;

    public SecurityAltIDGroupEncoder securityAltID(final DirectBuffer value, final int offset, final int length)
    {
        securityAltID.wrap(value);
        securityAltIDOffset = offset;
        securityAltIDLength = length;
        return this;
    }

    public SecurityAltIDGroupEncoder securityAltID(final DirectBuffer value, final int length)
    {
        return securityAltID(value, 0, length);
    }

    public SecurityAltIDGroupEncoder securityAltID(final DirectBuffer value)
    {
        return securityAltID(value, 0, value.capacity());
    }

    public SecurityAltIDGroupEncoder securityAltID(final byte[] value, final int offset, final int length)
    {
        securityAltID.wrap(value);
        securityAltIDOffset = offset;
        securityAltIDLength = length;
        return this;
    }

    public SecurityAltIDGroupEncoder securityAltIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(securityAltID, value, offset, length);
        securityAltIDOffset = offset;
        securityAltIDLength = length;
        return this;
    }

    public SecurityAltIDGroupEncoder securityAltID(final byte[] value, final int length)
    {
        return securityAltID(value, 0, length);
    }

    public SecurityAltIDGroupEncoder securityAltID(final byte[] value)
    {
        return securityAltID(value, 0, value.length);
    }

    public boolean hasSecurityAltID()
    {
        return securityAltIDLength > 0;
    }

    public MutableDirectBuffer securityAltID()
    {
        return securityAltID;
    }

    public String securityAltIDAsString()
    {
        return securityAltID.getStringWithoutLengthAscii(securityAltIDOffset, securityAltIDLength);
    }

    public SecurityAltIDGroupEncoder securityAltID(final CharSequence value)
    {
        toBytes(value, securityAltID);
        securityAltIDOffset = 0;
        securityAltIDLength = value.length();
        return this;
    }

    public SecurityAltIDGroupEncoder securityAltID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            securityAltID.wrap(buffer);
            securityAltIDOffset = value.offset();
            securityAltIDLength = value.length();
        }
        return this;
    }

    public SecurityAltIDGroupEncoder securityAltID(final char[] value)
    {
        return securityAltID(value, 0, value.length);
    }

    public SecurityAltIDGroupEncoder securityAltID(final char[] value, final int length)
    {
        return securityAltID(value, 0, length);
    }

    public SecurityAltIDGroupEncoder securityAltID(final char[] value, final int offset, final int length)
    {
        toBytes(value, securityAltID, offset, length);
        securityAltIDOffset = 0;
        securityAltIDLength = length;
        return this;
    }

    private final MutableDirectBuffer securityAltIDSource = new UnsafeBuffer();

    private int securityAltIDSourceOffset = 0;

    private int securityAltIDSourceLength = 0;

    public SecurityAltIDGroupEncoder securityAltIDSource(final DirectBuffer value, final int offset, final int length)
    {
        securityAltIDSource.wrap(value);
        securityAltIDSourceOffset = offset;
        securityAltIDSourceLength = length;
        return this;
    }

    public SecurityAltIDGroupEncoder securityAltIDSource(final DirectBuffer value, final int length)
    {
        return securityAltIDSource(value, 0, length);
    }

    public SecurityAltIDGroupEncoder securityAltIDSource(final DirectBuffer value)
    {
        return securityAltIDSource(value, 0, value.capacity());
    }

    public SecurityAltIDGroupEncoder securityAltIDSource(final byte[] value, final int offset, final int length)
    {
        securityAltIDSource.wrap(value);
        securityAltIDSourceOffset = offset;
        securityAltIDSourceLength = length;
        return this;
    }

    public SecurityAltIDGroupEncoder securityAltIDSourceAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(securityAltIDSource, value, offset, length);
        securityAltIDSourceOffset = offset;
        securityAltIDSourceLength = length;
        return this;
    }

    public SecurityAltIDGroupEncoder securityAltIDSource(final byte[] value, final int length)
    {
        return securityAltIDSource(value, 0, length);
    }

    public SecurityAltIDGroupEncoder securityAltIDSource(final byte[] value)
    {
        return securityAltIDSource(value, 0, value.length);
    }

    public boolean hasSecurityAltIDSource()
    {
        return securityAltIDSourceLength > 0;
    }

    public MutableDirectBuffer securityAltIDSource()
    {
        return securityAltIDSource;
    }

    public String securityAltIDSourceAsString()
    {
        return securityAltIDSource.getStringWithoutLengthAscii(securityAltIDSourceOffset, securityAltIDSourceLength);
    }

    public SecurityAltIDGroupEncoder securityAltIDSource(final CharSequence value)
    {
        toBytes(value, securityAltIDSource);
        securityAltIDSourceOffset = 0;
        securityAltIDSourceLength = value.length();
        return this;
    }

    public SecurityAltIDGroupEncoder securityAltIDSource(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            securityAltIDSource.wrap(buffer);
            securityAltIDSourceOffset = value.offset();
            securityAltIDSourceLength = value.length();
        }
        return this;
    }

    public SecurityAltIDGroupEncoder securityAltIDSource(final char[] value)
    {
        return securityAltIDSource(value, 0, value.length);
    }

    public SecurityAltIDGroupEncoder securityAltIDSource(final char[] value, final int length)
    {
        return securityAltIDSource(value, 0, length);
    }

    public SecurityAltIDGroupEncoder securityAltIDSource(final char[] value, final int offset, final int length)
    {
        toBytes(value, securityAltIDSource, offset, length);
        securityAltIDSourceOffset = 0;
        securityAltIDSourceLength = length;
        return this;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (securityAltIDLength > 0)
        {
            buffer.putBytes(position, securityAltIDHeader, 0, securityAltIDHeaderLength);
            position += securityAltIDHeaderLength;
            buffer.putBytes(position, securityAltID, securityAltIDOffset, securityAltIDLength);
            position += securityAltIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (securityAltIDSourceLength > 0)
        {
            buffer.putBytes(position, securityAltIDSourceHeader, 0, securityAltIDSourceHeaderLength);
            position += securityAltIDSourceHeaderLength;
            buffer.putBytes(position, securityAltIDSource, securityAltIDSourceOffset, securityAltIDSourceLength);
            position += securityAltIDSourceLength;
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
        this.resetSecurityAltID();
        this.resetSecurityAltIDSource();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetSecurityAltID()
    {
        securityAltIDLength = 0;
    }

    public void resetSecurityAltIDSource()
    {
        securityAltIDSourceLength = 0;
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
        builder.append("\"MessageName\": \"SecurityAltIDGroup\",\n");
        if (hasSecurityAltID())
        {
            indent(builder, level);
            builder.append("\"SecurityAltID\": \"");
            appendBuffer(builder, securityAltID, securityAltIDOffset, securityAltIDLength);
            builder.append("\",\n");
        }

        if (hasSecurityAltIDSource())
        {
            indent(builder, level);
            builder.append("\"SecurityAltIDSource\": \"");
            appendBuffer(builder, securityAltIDSource, securityAltIDSourceOffset, securityAltIDSourceLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public SecurityAltIDGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((SecurityAltIDGroupEncoder)encoder);
    }

    public SecurityAltIDGroupEncoder copyTo(final SecurityAltIDGroupEncoder encoder)
    {
        encoder.reset();
        if (hasSecurityAltID())
        {
            encoder.securityAltIDAsCopy(securityAltID.byteArray(), 0, securityAltIDLength);
        }

        if (hasSecurityAltIDSource())
        {
            encoder.securityAltIDSourceAsCopy(securityAltIDSource.byteArray(), 0, securityAltIDSourceLength);
        }
        return encoder;
    }

}
    private int noSecurityAltIDGroupCounter;

    private boolean hasNoSecurityAltIDGroupCounter;

    public boolean hasNoSecurityAltIDGroupCounter()
    {
        return hasNoSecurityAltIDGroupCounter;
    }

    public SecAltIDGrpEncoder noSecurityAltIDGroupCounter(int value)
    {
        noSecurityAltIDGroupCounter = value;
        hasNoSecurityAltIDGroupCounter = true;
        return this;
    }

    public int noSecurityAltIDGroupCounter()
    {
        return noSecurityAltIDGroupCounter;
    }


    private SecurityAltIDGroupEncoder securityAltIDGroup = null;

    public SecurityAltIDGroupEncoder securityAltIDGroup(final int numberOfElements)
    {
        hasNoSecurityAltIDGroupCounter = true;
        noSecurityAltIDGroupCounter = numberOfElements;
        if (securityAltIDGroup == null)
        {
            securityAltIDGroup = new SecurityAltIDGroupEncoder();
        }
        return securityAltIDGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoSecurityAltIDGroupCounter)
        {
            buffer.putBytes(position, noSecurityAltIDGroupCounterHeader, 0, noSecurityAltIDGroupCounterHeaderLength);
            position += noSecurityAltIDGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noSecurityAltIDGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (securityAltIDGroup != null)
        {
            position += securityAltIDGroup.encode(buffer, position, noSecurityAltIDGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetSecurityAltIDGroup();
    }

    public void resetSecurityAltIDGroup()
    {
        if (securityAltIDGroup != null)
        {
            securityAltIDGroup.reset();
        }
        noSecurityAltIDGroupCounter = 0;
        hasNoSecurityAltIDGroupCounter = false;
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
        builder.append("\"MessageName\": \"SecAltIDGrp\",\n");
        if (hasNoSecurityAltIDGroupCounter)
        {
            indent(builder, level);
            builder.append("\"SecurityAltIDGroup\": [\n");
            final int noSecurityAltIDGroupCounter = this.noSecurityAltIDGroupCounter;
            SecurityAltIDGroupEncoder securityAltIDGroup = this.securityAltIDGroup;
            for (int i = 0; i < noSecurityAltIDGroupCounter; i++)
            {
                indent(builder, level);
                securityAltIDGroup.appendTo(builder, level + 1);
                if (i < (noSecurityAltIDGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                securityAltIDGroup = securityAltIDGroup.next();
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
    public SecAltIDGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((SecAltIDGrpEncoder)encoder);
    }

    public SecAltIDGrpEncoder copyTo(final SecAltIDGrpEncoder encoder)
    {
        encoder.reset();
        if (hasNoSecurityAltIDGroupCounter)
        {
            final int size = this.noSecurityAltIDGroupCounter;
            SecurityAltIDGroupEncoder securityAltIDGroup = this.securityAltIDGroup;
            SecurityAltIDGroupEncoder securityAltIDGroupEncoder = encoder.securityAltIDGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (securityAltIDGroup != null)
                {
                    securityAltIDGroup.copyTo(securityAltIDGroupEncoder);
                    securityAltIDGroup = securityAltIDGroup.next();
                    securityAltIDGroupEncoder = securityAltIDGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
