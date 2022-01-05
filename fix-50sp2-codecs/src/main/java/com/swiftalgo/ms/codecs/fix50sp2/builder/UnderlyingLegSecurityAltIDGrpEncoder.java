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


public class UnderlyingLegSecurityAltIDGrpEncoder
{
    private static final int noUnderlyingLegSecurityAltIDGroupCounterHeaderLength = 5;
    private static final byte[] noUnderlyingLegSecurityAltIDGroupCounterHeader = new byte[] {49, 51, 51, 52, (byte) '='};



public static class UnderlyingLegSecurityAltIDGroupEncoder
{
    private UnderlyingLegSecurityAltIDGroupEncoder next = null;

    public UnderlyingLegSecurityAltIDGroupEncoder next()
    {
        if (next == null)
        {
            next = new UnderlyingLegSecurityAltIDGroupEncoder();
        }
        return next;
    }

    private static final int underlyingLegSecurityAltIDHeaderLength = 5;
    private static final byte[] underlyingLegSecurityAltIDHeader = new byte[] {49, 51, 51, 53, (byte) '='};

    private static final int underlyingLegSecurityAltIDSourceHeaderLength = 5;
    private static final byte[] underlyingLegSecurityAltIDSourceHeader = new byte[] {49, 51, 51, 54, (byte) '='};

    private final MutableDirectBuffer underlyingLegSecurityAltID = new UnsafeBuffer();

    private int underlyingLegSecurityAltIDOffset = 0;

    private int underlyingLegSecurityAltIDLength = 0;

    public UnderlyingLegSecurityAltIDGroupEncoder underlyingLegSecurityAltID(final DirectBuffer value, final int offset, final int length)
    {
        underlyingLegSecurityAltID.wrap(value);
        underlyingLegSecurityAltIDOffset = offset;
        underlyingLegSecurityAltIDLength = length;
        return this;
    }

    public UnderlyingLegSecurityAltIDGroupEncoder underlyingLegSecurityAltID(final DirectBuffer value, final int length)
    {
        return underlyingLegSecurityAltID(value, 0, length);
    }

    public UnderlyingLegSecurityAltIDGroupEncoder underlyingLegSecurityAltID(final DirectBuffer value)
    {
        return underlyingLegSecurityAltID(value, 0, value.capacity());
    }

    public UnderlyingLegSecurityAltIDGroupEncoder underlyingLegSecurityAltID(final byte[] value, final int offset, final int length)
    {
        underlyingLegSecurityAltID.wrap(value);
        underlyingLegSecurityAltIDOffset = offset;
        underlyingLegSecurityAltIDLength = length;
        return this;
    }

    public UnderlyingLegSecurityAltIDGroupEncoder underlyingLegSecurityAltIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(underlyingLegSecurityAltID, value, offset, length);
        underlyingLegSecurityAltIDOffset = offset;
        underlyingLegSecurityAltIDLength = length;
        return this;
    }

    public UnderlyingLegSecurityAltIDGroupEncoder underlyingLegSecurityAltID(final byte[] value, final int length)
    {
        return underlyingLegSecurityAltID(value, 0, length);
    }

    public UnderlyingLegSecurityAltIDGroupEncoder underlyingLegSecurityAltID(final byte[] value)
    {
        return underlyingLegSecurityAltID(value, 0, value.length);
    }

    public boolean hasUnderlyingLegSecurityAltID()
    {
        return underlyingLegSecurityAltIDLength > 0;
    }

    public MutableDirectBuffer underlyingLegSecurityAltID()
    {
        return underlyingLegSecurityAltID;
    }

    public String underlyingLegSecurityAltIDAsString()
    {
        return underlyingLegSecurityAltID.getStringWithoutLengthAscii(underlyingLegSecurityAltIDOffset, underlyingLegSecurityAltIDLength);
    }

    public UnderlyingLegSecurityAltIDGroupEncoder underlyingLegSecurityAltID(final CharSequence value)
    {
        toBytes(value, underlyingLegSecurityAltID);
        underlyingLegSecurityAltIDOffset = 0;
        underlyingLegSecurityAltIDLength = value.length();
        return this;
    }

    public UnderlyingLegSecurityAltIDGroupEncoder underlyingLegSecurityAltID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            underlyingLegSecurityAltID.wrap(buffer);
            underlyingLegSecurityAltIDOffset = value.offset();
            underlyingLegSecurityAltIDLength = value.length();
        }
        return this;
    }

    public UnderlyingLegSecurityAltIDGroupEncoder underlyingLegSecurityAltID(final char[] value)
    {
        return underlyingLegSecurityAltID(value, 0, value.length);
    }

    public UnderlyingLegSecurityAltIDGroupEncoder underlyingLegSecurityAltID(final char[] value, final int length)
    {
        return underlyingLegSecurityAltID(value, 0, length);
    }

    public UnderlyingLegSecurityAltIDGroupEncoder underlyingLegSecurityAltID(final char[] value, final int offset, final int length)
    {
        toBytes(value, underlyingLegSecurityAltID, offset, length);
        underlyingLegSecurityAltIDOffset = 0;
        underlyingLegSecurityAltIDLength = length;
        return this;
    }

    private final MutableDirectBuffer underlyingLegSecurityAltIDSource = new UnsafeBuffer();

    private int underlyingLegSecurityAltIDSourceOffset = 0;

    private int underlyingLegSecurityAltIDSourceLength = 0;

    public UnderlyingLegSecurityAltIDGroupEncoder underlyingLegSecurityAltIDSource(final DirectBuffer value, final int offset, final int length)
    {
        underlyingLegSecurityAltIDSource.wrap(value);
        underlyingLegSecurityAltIDSourceOffset = offset;
        underlyingLegSecurityAltIDSourceLength = length;
        return this;
    }

    public UnderlyingLegSecurityAltIDGroupEncoder underlyingLegSecurityAltIDSource(final DirectBuffer value, final int length)
    {
        return underlyingLegSecurityAltIDSource(value, 0, length);
    }

    public UnderlyingLegSecurityAltIDGroupEncoder underlyingLegSecurityAltIDSource(final DirectBuffer value)
    {
        return underlyingLegSecurityAltIDSource(value, 0, value.capacity());
    }

    public UnderlyingLegSecurityAltIDGroupEncoder underlyingLegSecurityAltIDSource(final byte[] value, final int offset, final int length)
    {
        underlyingLegSecurityAltIDSource.wrap(value);
        underlyingLegSecurityAltIDSourceOffset = offset;
        underlyingLegSecurityAltIDSourceLength = length;
        return this;
    }

    public UnderlyingLegSecurityAltIDGroupEncoder underlyingLegSecurityAltIDSourceAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(underlyingLegSecurityAltIDSource, value, offset, length);
        underlyingLegSecurityAltIDSourceOffset = offset;
        underlyingLegSecurityAltIDSourceLength = length;
        return this;
    }

    public UnderlyingLegSecurityAltIDGroupEncoder underlyingLegSecurityAltIDSource(final byte[] value, final int length)
    {
        return underlyingLegSecurityAltIDSource(value, 0, length);
    }

    public UnderlyingLegSecurityAltIDGroupEncoder underlyingLegSecurityAltIDSource(final byte[] value)
    {
        return underlyingLegSecurityAltIDSource(value, 0, value.length);
    }

    public boolean hasUnderlyingLegSecurityAltIDSource()
    {
        return underlyingLegSecurityAltIDSourceLength > 0;
    }

    public MutableDirectBuffer underlyingLegSecurityAltIDSource()
    {
        return underlyingLegSecurityAltIDSource;
    }

    public String underlyingLegSecurityAltIDSourceAsString()
    {
        return underlyingLegSecurityAltIDSource.getStringWithoutLengthAscii(underlyingLegSecurityAltIDSourceOffset, underlyingLegSecurityAltIDSourceLength);
    }

    public UnderlyingLegSecurityAltIDGroupEncoder underlyingLegSecurityAltIDSource(final CharSequence value)
    {
        toBytes(value, underlyingLegSecurityAltIDSource);
        underlyingLegSecurityAltIDSourceOffset = 0;
        underlyingLegSecurityAltIDSourceLength = value.length();
        return this;
    }

    public UnderlyingLegSecurityAltIDGroupEncoder underlyingLegSecurityAltIDSource(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            underlyingLegSecurityAltIDSource.wrap(buffer);
            underlyingLegSecurityAltIDSourceOffset = value.offset();
            underlyingLegSecurityAltIDSourceLength = value.length();
        }
        return this;
    }

    public UnderlyingLegSecurityAltIDGroupEncoder underlyingLegSecurityAltIDSource(final char[] value)
    {
        return underlyingLegSecurityAltIDSource(value, 0, value.length);
    }

    public UnderlyingLegSecurityAltIDGroupEncoder underlyingLegSecurityAltIDSource(final char[] value, final int length)
    {
        return underlyingLegSecurityAltIDSource(value, 0, length);
    }

    public UnderlyingLegSecurityAltIDGroupEncoder underlyingLegSecurityAltIDSource(final char[] value, final int offset, final int length)
    {
        toBytes(value, underlyingLegSecurityAltIDSource, offset, length);
        underlyingLegSecurityAltIDSourceOffset = 0;
        underlyingLegSecurityAltIDSourceLength = length;
        return this;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (underlyingLegSecurityAltIDLength > 0)
        {
            buffer.putBytes(position, underlyingLegSecurityAltIDHeader, 0, underlyingLegSecurityAltIDHeaderLength);
            position += underlyingLegSecurityAltIDHeaderLength;
            buffer.putBytes(position, underlyingLegSecurityAltID, underlyingLegSecurityAltIDOffset, underlyingLegSecurityAltIDLength);
            position += underlyingLegSecurityAltIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (underlyingLegSecurityAltIDSourceLength > 0)
        {
            buffer.putBytes(position, underlyingLegSecurityAltIDSourceHeader, 0, underlyingLegSecurityAltIDSourceHeaderLength);
            position += underlyingLegSecurityAltIDSourceHeaderLength;
            buffer.putBytes(position, underlyingLegSecurityAltIDSource, underlyingLegSecurityAltIDSourceOffset, underlyingLegSecurityAltIDSourceLength);
            position += underlyingLegSecurityAltIDSourceLength;
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
        this.resetUnderlyingLegSecurityAltID();
        this.resetUnderlyingLegSecurityAltIDSource();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetUnderlyingLegSecurityAltID()
    {
        underlyingLegSecurityAltIDLength = 0;
    }

    public void resetUnderlyingLegSecurityAltIDSource()
    {
        underlyingLegSecurityAltIDSourceLength = 0;
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
        builder.append("\"MessageName\": \"UnderlyingLegSecurityAltIDGroup\",\n");
        if (hasUnderlyingLegSecurityAltID())
        {
            indent(builder, level);
            builder.append("\"UnderlyingLegSecurityAltID\": \"");
            appendBuffer(builder, underlyingLegSecurityAltID, underlyingLegSecurityAltIDOffset, underlyingLegSecurityAltIDLength);
            builder.append("\",\n");
        }

        if (hasUnderlyingLegSecurityAltIDSource())
        {
            indent(builder, level);
            builder.append("\"UnderlyingLegSecurityAltIDSource\": \"");
            appendBuffer(builder, underlyingLegSecurityAltIDSource, underlyingLegSecurityAltIDSourceOffset, underlyingLegSecurityAltIDSourceLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public UnderlyingLegSecurityAltIDGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((UnderlyingLegSecurityAltIDGroupEncoder)encoder);
    }

    public UnderlyingLegSecurityAltIDGroupEncoder copyTo(final UnderlyingLegSecurityAltIDGroupEncoder encoder)
    {
        encoder.reset();
        if (hasUnderlyingLegSecurityAltID())
        {
            encoder.underlyingLegSecurityAltIDAsCopy(underlyingLegSecurityAltID.byteArray(), 0, underlyingLegSecurityAltIDLength);
        }

        if (hasUnderlyingLegSecurityAltIDSource())
        {
            encoder.underlyingLegSecurityAltIDSourceAsCopy(underlyingLegSecurityAltIDSource.byteArray(), 0, underlyingLegSecurityAltIDSourceLength);
        }
        return encoder;
    }

}
    private int noUnderlyingLegSecurityAltIDGroupCounter;

    private boolean hasNoUnderlyingLegSecurityAltIDGroupCounter;

    public boolean hasNoUnderlyingLegSecurityAltIDGroupCounter()
    {
        return hasNoUnderlyingLegSecurityAltIDGroupCounter;
    }

    public UnderlyingLegSecurityAltIDGrpEncoder noUnderlyingLegSecurityAltIDGroupCounter(int value)
    {
        noUnderlyingLegSecurityAltIDGroupCounter = value;
        hasNoUnderlyingLegSecurityAltIDGroupCounter = true;
        return this;
    }

    public int noUnderlyingLegSecurityAltIDGroupCounter()
    {
        return noUnderlyingLegSecurityAltIDGroupCounter;
    }


    private UnderlyingLegSecurityAltIDGroupEncoder underlyingLegSecurityAltIDGroup = null;

    public UnderlyingLegSecurityAltIDGroupEncoder underlyingLegSecurityAltIDGroup(final int numberOfElements)
    {
        hasNoUnderlyingLegSecurityAltIDGroupCounter = true;
        noUnderlyingLegSecurityAltIDGroupCounter = numberOfElements;
        if (underlyingLegSecurityAltIDGroup == null)
        {
            underlyingLegSecurityAltIDGroup = new UnderlyingLegSecurityAltIDGroupEncoder();
        }
        return underlyingLegSecurityAltIDGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoUnderlyingLegSecurityAltIDGroupCounter)
        {
            buffer.putBytes(position, noUnderlyingLegSecurityAltIDGroupCounterHeader, 0, noUnderlyingLegSecurityAltIDGroupCounterHeaderLength);
            position += noUnderlyingLegSecurityAltIDGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noUnderlyingLegSecurityAltIDGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (underlyingLegSecurityAltIDGroup != null)
        {
            position += underlyingLegSecurityAltIDGroup.encode(buffer, position, noUnderlyingLegSecurityAltIDGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetUnderlyingLegSecurityAltIDGroup();
    }

    public void resetUnderlyingLegSecurityAltIDGroup()
    {
        if (underlyingLegSecurityAltIDGroup != null)
        {
            underlyingLegSecurityAltIDGroup.reset();
        }
        noUnderlyingLegSecurityAltIDGroupCounter = 0;
        hasNoUnderlyingLegSecurityAltIDGroupCounter = false;
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
        builder.append("\"MessageName\": \"UnderlyingLegSecurityAltIDGrp\",\n");
        if (hasNoUnderlyingLegSecurityAltIDGroupCounter)
        {
            indent(builder, level);
            builder.append("\"UnderlyingLegSecurityAltIDGroup\": [\n");
            final int noUnderlyingLegSecurityAltIDGroupCounter = this.noUnderlyingLegSecurityAltIDGroupCounter;
            UnderlyingLegSecurityAltIDGroupEncoder underlyingLegSecurityAltIDGroup = this.underlyingLegSecurityAltIDGroup;
            for (int i = 0; i < noUnderlyingLegSecurityAltIDGroupCounter; i++)
            {
                indent(builder, level);
                underlyingLegSecurityAltIDGroup.appendTo(builder, level + 1);
                if (i < (noUnderlyingLegSecurityAltIDGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                underlyingLegSecurityAltIDGroup = underlyingLegSecurityAltIDGroup.next();
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
    public UnderlyingLegSecurityAltIDGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((UnderlyingLegSecurityAltIDGrpEncoder)encoder);
    }

    public UnderlyingLegSecurityAltIDGrpEncoder copyTo(final UnderlyingLegSecurityAltIDGrpEncoder encoder)
    {
        encoder.reset();
        if (hasNoUnderlyingLegSecurityAltIDGroupCounter)
        {
            final int size = this.noUnderlyingLegSecurityAltIDGroupCounter;
            UnderlyingLegSecurityAltIDGroupEncoder underlyingLegSecurityAltIDGroup = this.underlyingLegSecurityAltIDGroup;
            UnderlyingLegSecurityAltIDGroupEncoder underlyingLegSecurityAltIDGroupEncoder = encoder.underlyingLegSecurityAltIDGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (underlyingLegSecurityAltIDGroup != null)
                {
                    underlyingLegSecurityAltIDGroup.copyTo(underlyingLegSecurityAltIDGroupEncoder);
                    underlyingLegSecurityAltIDGroup = underlyingLegSecurityAltIDGroup.next();
                    underlyingLegSecurityAltIDGroupEncoder = underlyingLegSecurityAltIDGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
