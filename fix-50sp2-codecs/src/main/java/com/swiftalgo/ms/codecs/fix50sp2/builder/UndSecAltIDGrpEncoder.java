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


public class UndSecAltIDGrpEncoder
{
    private static final int noUnderlyingSecurityAltIDGroupCounterHeaderLength = 4;
    private static final byte[] noUnderlyingSecurityAltIDGroupCounterHeader = new byte[] {52, 53, 55, (byte) '='};



public static class UnderlyingSecurityAltIDGroupEncoder
{
    private UnderlyingSecurityAltIDGroupEncoder next = null;

    public UnderlyingSecurityAltIDGroupEncoder next()
    {
        if (next == null)
        {
            next = new UnderlyingSecurityAltIDGroupEncoder();
        }
        return next;
    }

    private static final int underlyingSecurityAltIDHeaderLength = 4;
    private static final byte[] underlyingSecurityAltIDHeader = new byte[] {52, 53, 56, (byte) '='};

    private static final int underlyingSecurityAltIDSourceHeaderLength = 4;
    private static final byte[] underlyingSecurityAltIDSourceHeader = new byte[] {52, 53, 57, (byte) '='};

    private final MutableDirectBuffer underlyingSecurityAltID = new UnsafeBuffer();

    private int underlyingSecurityAltIDOffset = 0;

    private int underlyingSecurityAltIDLength = 0;

    public UnderlyingSecurityAltIDGroupEncoder underlyingSecurityAltID(final DirectBuffer value, final int offset, final int length)
    {
        underlyingSecurityAltID.wrap(value);
        underlyingSecurityAltIDOffset = offset;
        underlyingSecurityAltIDLength = length;
        return this;
    }

    public UnderlyingSecurityAltIDGroupEncoder underlyingSecurityAltID(final DirectBuffer value, final int length)
    {
        return underlyingSecurityAltID(value, 0, length);
    }

    public UnderlyingSecurityAltIDGroupEncoder underlyingSecurityAltID(final DirectBuffer value)
    {
        return underlyingSecurityAltID(value, 0, value.capacity());
    }

    public UnderlyingSecurityAltIDGroupEncoder underlyingSecurityAltID(final byte[] value, final int offset, final int length)
    {
        underlyingSecurityAltID.wrap(value);
        underlyingSecurityAltIDOffset = offset;
        underlyingSecurityAltIDLength = length;
        return this;
    }

    public UnderlyingSecurityAltIDGroupEncoder underlyingSecurityAltIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(underlyingSecurityAltID, value, offset, length);
        underlyingSecurityAltIDOffset = offset;
        underlyingSecurityAltIDLength = length;
        return this;
    }

    public UnderlyingSecurityAltIDGroupEncoder underlyingSecurityAltID(final byte[] value, final int length)
    {
        return underlyingSecurityAltID(value, 0, length);
    }

    public UnderlyingSecurityAltIDGroupEncoder underlyingSecurityAltID(final byte[] value)
    {
        return underlyingSecurityAltID(value, 0, value.length);
    }

    public boolean hasUnderlyingSecurityAltID()
    {
        return underlyingSecurityAltIDLength > 0;
    }

    public MutableDirectBuffer underlyingSecurityAltID()
    {
        return underlyingSecurityAltID;
    }

    public String underlyingSecurityAltIDAsString()
    {
        return underlyingSecurityAltID.getStringWithoutLengthAscii(underlyingSecurityAltIDOffset, underlyingSecurityAltIDLength);
    }

    public UnderlyingSecurityAltIDGroupEncoder underlyingSecurityAltID(final CharSequence value)
    {
        toBytes(value, underlyingSecurityAltID);
        underlyingSecurityAltIDOffset = 0;
        underlyingSecurityAltIDLength = value.length();
        return this;
    }

    public UnderlyingSecurityAltIDGroupEncoder underlyingSecurityAltID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            underlyingSecurityAltID.wrap(buffer);
            underlyingSecurityAltIDOffset = value.offset();
            underlyingSecurityAltIDLength = value.length();
        }
        return this;
    }

    public UnderlyingSecurityAltIDGroupEncoder underlyingSecurityAltID(final char[] value)
    {
        return underlyingSecurityAltID(value, 0, value.length);
    }

    public UnderlyingSecurityAltIDGroupEncoder underlyingSecurityAltID(final char[] value, final int length)
    {
        return underlyingSecurityAltID(value, 0, length);
    }

    public UnderlyingSecurityAltIDGroupEncoder underlyingSecurityAltID(final char[] value, final int offset, final int length)
    {
        toBytes(value, underlyingSecurityAltID, offset, length);
        underlyingSecurityAltIDOffset = 0;
        underlyingSecurityAltIDLength = length;
        return this;
    }

    private final MutableDirectBuffer underlyingSecurityAltIDSource = new UnsafeBuffer();

    private int underlyingSecurityAltIDSourceOffset = 0;

    private int underlyingSecurityAltIDSourceLength = 0;

    public UnderlyingSecurityAltIDGroupEncoder underlyingSecurityAltIDSource(final DirectBuffer value, final int offset, final int length)
    {
        underlyingSecurityAltIDSource.wrap(value);
        underlyingSecurityAltIDSourceOffset = offset;
        underlyingSecurityAltIDSourceLength = length;
        return this;
    }

    public UnderlyingSecurityAltIDGroupEncoder underlyingSecurityAltIDSource(final DirectBuffer value, final int length)
    {
        return underlyingSecurityAltIDSource(value, 0, length);
    }

    public UnderlyingSecurityAltIDGroupEncoder underlyingSecurityAltIDSource(final DirectBuffer value)
    {
        return underlyingSecurityAltIDSource(value, 0, value.capacity());
    }

    public UnderlyingSecurityAltIDGroupEncoder underlyingSecurityAltIDSource(final byte[] value, final int offset, final int length)
    {
        underlyingSecurityAltIDSource.wrap(value);
        underlyingSecurityAltIDSourceOffset = offset;
        underlyingSecurityAltIDSourceLength = length;
        return this;
    }

    public UnderlyingSecurityAltIDGroupEncoder underlyingSecurityAltIDSourceAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(underlyingSecurityAltIDSource, value, offset, length);
        underlyingSecurityAltIDSourceOffset = offset;
        underlyingSecurityAltIDSourceLength = length;
        return this;
    }

    public UnderlyingSecurityAltIDGroupEncoder underlyingSecurityAltIDSource(final byte[] value, final int length)
    {
        return underlyingSecurityAltIDSource(value, 0, length);
    }

    public UnderlyingSecurityAltIDGroupEncoder underlyingSecurityAltIDSource(final byte[] value)
    {
        return underlyingSecurityAltIDSource(value, 0, value.length);
    }

    public boolean hasUnderlyingSecurityAltIDSource()
    {
        return underlyingSecurityAltIDSourceLength > 0;
    }

    public MutableDirectBuffer underlyingSecurityAltIDSource()
    {
        return underlyingSecurityAltIDSource;
    }

    public String underlyingSecurityAltIDSourceAsString()
    {
        return underlyingSecurityAltIDSource.getStringWithoutLengthAscii(underlyingSecurityAltIDSourceOffset, underlyingSecurityAltIDSourceLength);
    }

    public UnderlyingSecurityAltIDGroupEncoder underlyingSecurityAltIDSource(final CharSequence value)
    {
        toBytes(value, underlyingSecurityAltIDSource);
        underlyingSecurityAltIDSourceOffset = 0;
        underlyingSecurityAltIDSourceLength = value.length();
        return this;
    }

    public UnderlyingSecurityAltIDGroupEncoder underlyingSecurityAltIDSource(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            underlyingSecurityAltIDSource.wrap(buffer);
            underlyingSecurityAltIDSourceOffset = value.offset();
            underlyingSecurityAltIDSourceLength = value.length();
        }
        return this;
    }

    public UnderlyingSecurityAltIDGroupEncoder underlyingSecurityAltIDSource(final char[] value)
    {
        return underlyingSecurityAltIDSource(value, 0, value.length);
    }

    public UnderlyingSecurityAltIDGroupEncoder underlyingSecurityAltIDSource(final char[] value, final int length)
    {
        return underlyingSecurityAltIDSource(value, 0, length);
    }

    public UnderlyingSecurityAltIDGroupEncoder underlyingSecurityAltIDSource(final char[] value, final int offset, final int length)
    {
        toBytes(value, underlyingSecurityAltIDSource, offset, length);
        underlyingSecurityAltIDSourceOffset = 0;
        underlyingSecurityAltIDSourceLength = length;
        return this;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (underlyingSecurityAltIDLength > 0)
        {
            buffer.putBytes(position, underlyingSecurityAltIDHeader, 0, underlyingSecurityAltIDHeaderLength);
            position += underlyingSecurityAltIDHeaderLength;
            buffer.putBytes(position, underlyingSecurityAltID, underlyingSecurityAltIDOffset, underlyingSecurityAltIDLength);
            position += underlyingSecurityAltIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (underlyingSecurityAltIDSourceLength > 0)
        {
            buffer.putBytes(position, underlyingSecurityAltIDSourceHeader, 0, underlyingSecurityAltIDSourceHeaderLength);
            position += underlyingSecurityAltIDSourceHeaderLength;
            buffer.putBytes(position, underlyingSecurityAltIDSource, underlyingSecurityAltIDSourceOffset, underlyingSecurityAltIDSourceLength);
            position += underlyingSecurityAltIDSourceLength;
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
        this.resetUnderlyingSecurityAltID();
        this.resetUnderlyingSecurityAltIDSource();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetUnderlyingSecurityAltID()
    {
        underlyingSecurityAltIDLength = 0;
    }

    public void resetUnderlyingSecurityAltIDSource()
    {
        underlyingSecurityAltIDSourceLength = 0;
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
        builder.append("\"MessageName\": \"UnderlyingSecurityAltIDGroup\",\n");
        if (hasUnderlyingSecurityAltID())
        {
            indent(builder, level);
            builder.append("\"UnderlyingSecurityAltID\": \"");
            appendBuffer(builder, underlyingSecurityAltID, underlyingSecurityAltIDOffset, underlyingSecurityAltIDLength);
            builder.append("\",\n");
        }

        if (hasUnderlyingSecurityAltIDSource())
        {
            indent(builder, level);
            builder.append("\"UnderlyingSecurityAltIDSource\": \"");
            appendBuffer(builder, underlyingSecurityAltIDSource, underlyingSecurityAltIDSourceOffset, underlyingSecurityAltIDSourceLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public UnderlyingSecurityAltIDGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((UnderlyingSecurityAltIDGroupEncoder)encoder);
    }

    public UnderlyingSecurityAltIDGroupEncoder copyTo(final UnderlyingSecurityAltIDGroupEncoder encoder)
    {
        encoder.reset();
        if (hasUnderlyingSecurityAltID())
        {
            encoder.underlyingSecurityAltIDAsCopy(underlyingSecurityAltID.byteArray(), 0, underlyingSecurityAltIDLength);
        }

        if (hasUnderlyingSecurityAltIDSource())
        {
            encoder.underlyingSecurityAltIDSourceAsCopy(underlyingSecurityAltIDSource.byteArray(), 0, underlyingSecurityAltIDSourceLength);
        }
        return encoder;
    }

}
    private int noUnderlyingSecurityAltIDGroupCounter;

    private boolean hasNoUnderlyingSecurityAltIDGroupCounter;

    public boolean hasNoUnderlyingSecurityAltIDGroupCounter()
    {
        return hasNoUnderlyingSecurityAltIDGroupCounter;
    }

    public UndSecAltIDGrpEncoder noUnderlyingSecurityAltIDGroupCounter(int value)
    {
        noUnderlyingSecurityAltIDGroupCounter = value;
        hasNoUnderlyingSecurityAltIDGroupCounter = true;
        return this;
    }

    public int noUnderlyingSecurityAltIDGroupCounter()
    {
        return noUnderlyingSecurityAltIDGroupCounter;
    }


    private UnderlyingSecurityAltIDGroupEncoder underlyingSecurityAltIDGroup = null;

    public UnderlyingSecurityAltIDGroupEncoder underlyingSecurityAltIDGroup(final int numberOfElements)
    {
        hasNoUnderlyingSecurityAltIDGroupCounter = true;
        noUnderlyingSecurityAltIDGroupCounter = numberOfElements;
        if (underlyingSecurityAltIDGroup == null)
        {
            underlyingSecurityAltIDGroup = new UnderlyingSecurityAltIDGroupEncoder();
        }
        return underlyingSecurityAltIDGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoUnderlyingSecurityAltIDGroupCounter)
        {
            buffer.putBytes(position, noUnderlyingSecurityAltIDGroupCounterHeader, 0, noUnderlyingSecurityAltIDGroupCounterHeaderLength);
            position += noUnderlyingSecurityAltIDGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noUnderlyingSecurityAltIDGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (underlyingSecurityAltIDGroup != null)
        {
            position += underlyingSecurityAltIDGroup.encode(buffer, position, noUnderlyingSecurityAltIDGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetUnderlyingSecurityAltIDGroup();
    }

    public void resetUnderlyingSecurityAltIDGroup()
    {
        if (underlyingSecurityAltIDGroup != null)
        {
            underlyingSecurityAltIDGroup.reset();
        }
        noUnderlyingSecurityAltIDGroupCounter = 0;
        hasNoUnderlyingSecurityAltIDGroupCounter = false;
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
        builder.append("\"MessageName\": \"UndSecAltIDGrp\",\n");
        if (hasNoUnderlyingSecurityAltIDGroupCounter)
        {
            indent(builder, level);
            builder.append("\"UnderlyingSecurityAltIDGroup\": [\n");
            final int noUnderlyingSecurityAltIDGroupCounter = this.noUnderlyingSecurityAltIDGroupCounter;
            UnderlyingSecurityAltIDGroupEncoder underlyingSecurityAltIDGroup = this.underlyingSecurityAltIDGroup;
            for (int i = 0; i < noUnderlyingSecurityAltIDGroupCounter; i++)
            {
                indent(builder, level);
                underlyingSecurityAltIDGroup.appendTo(builder, level + 1);
                if (i < (noUnderlyingSecurityAltIDGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                underlyingSecurityAltIDGroup = underlyingSecurityAltIDGroup.next();
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
    public UndSecAltIDGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((UndSecAltIDGrpEncoder)encoder);
    }

    public UndSecAltIDGrpEncoder copyTo(final UndSecAltIDGrpEncoder encoder)
    {
        encoder.reset();
        if (hasNoUnderlyingSecurityAltIDGroupCounter)
        {
            final int size = this.noUnderlyingSecurityAltIDGroupCounter;
            UnderlyingSecurityAltIDGroupEncoder underlyingSecurityAltIDGroup = this.underlyingSecurityAltIDGroup;
            UnderlyingSecurityAltIDGroupEncoder underlyingSecurityAltIDGroupEncoder = encoder.underlyingSecurityAltIDGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (underlyingSecurityAltIDGroup != null)
                {
                    underlyingSecurityAltIDGroup.copyTo(underlyingSecurityAltIDGroupEncoder);
                    underlyingSecurityAltIDGroup = underlyingSecurityAltIDGroup.next();
                    underlyingSecurityAltIDGroupEncoder = underlyingSecurityAltIDGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
