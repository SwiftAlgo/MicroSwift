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


public class DerivativeSecurityAltIDGrpEncoder
{
    private static final int noDerivativeSecurityAltIDGroupCounterHeaderLength = 5;
    private static final byte[] noDerivativeSecurityAltIDGroupCounterHeader = new byte[] {49, 50, 49, 56, (byte) '='};



public static class DerivativeSecurityAltIDGroupEncoder
{
    private DerivativeSecurityAltIDGroupEncoder next = null;

    public DerivativeSecurityAltIDGroupEncoder next()
    {
        if (next == null)
        {
            next = new DerivativeSecurityAltIDGroupEncoder();
        }
        return next;
    }

    private static final int derivativeSecurityAltIDHeaderLength = 5;
    private static final byte[] derivativeSecurityAltIDHeader = new byte[] {49, 50, 49, 57, (byte) '='};

    private static final int derivativeSecurityAltIDSourceHeaderLength = 5;
    private static final byte[] derivativeSecurityAltIDSourceHeader = new byte[] {49, 50, 50, 48, (byte) '='};

    private final MutableDirectBuffer derivativeSecurityAltID = new UnsafeBuffer();

    private int derivativeSecurityAltIDOffset = 0;

    private int derivativeSecurityAltIDLength = 0;

    public DerivativeSecurityAltIDGroupEncoder derivativeSecurityAltID(final DirectBuffer value, final int offset, final int length)
    {
        derivativeSecurityAltID.wrap(value);
        derivativeSecurityAltIDOffset = offset;
        derivativeSecurityAltIDLength = length;
        return this;
    }

    public DerivativeSecurityAltIDGroupEncoder derivativeSecurityAltID(final DirectBuffer value, final int length)
    {
        return derivativeSecurityAltID(value, 0, length);
    }

    public DerivativeSecurityAltIDGroupEncoder derivativeSecurityAltID(final DirectBuffer value)
    {
        return derivativeSecurityAltID(value, 0, value.capacity());
    }

    public DerivativeSecurityAltIDGroupEncoder derivativeSecurityAltID(final byte[] value, final int offset, final int length)
    {
        derivativeSecurityAltID.wrap(value);
        derivativeSecurityAltIDOffset = offset;
        derivativeSecurityAltIDLength = length;
        return this;
    }

    public DerivativeSecurityAltIDGroupEncoder derivativeSecurityAltIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(derivativeSecurityAltID, value, offset, length);
        derivativeSecurityAltIDOffset = offset;
        derivativeSecurityAltIDLength = length;
        return this;
    }

    public DerivativeSecurityAltIDGroupEncoder derivativeSecurityAltID(final byte[] value, final int length)
    {
        return derivativeSecurityAltID(value, 0, length);
    }

    public DerivativeSecurityAltIDGroupEncoder derivativeSecurityAltID(final byte[] value)
    {
        return derivativeSecurityAltID(value, 0, value.length);
    }

    public boolean hasDerivativeSecurityAltID()
    {
        return derivativeSecurityAltIDLength > 0;
    }

    public MutableDirectBuffer derivativeSecurityAltID()
    {
        return derivativeSecurityAltID;
    }

    public String derivativeSecurityAltIDAsString()
    {
        return derivativeSecurityAltID.getStringWithoutLengthAscii(derivativeSecurityAltIDOffset, derivativeSecurityAltIDLength);
    }

    public DerivativeSecurityAltIDGroupEncoder derivativeSecurityAltID(final CharSequence value)
    {
        toBytes(value, derivativeSecurityAltID);
        derivativeSecurityAltIDOffset = 0;
        derivativeSecurityAltIDLength = value.length();
        return this;
    }

    public DerivativeSecurityAltIDGroupEncoder derivativeSecurityAltID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            derivativeSecurityAltID.wrap(buffer);
            derivativeSecurityAltIDOffset = value.offset();
            derivativeSecurityAltIDLength = value.length();
        }
        return this;
    }

    public DerivativeSecurityAltIDGroupEncoder derivativeSecurityAltID(final char[] value)
    {
        return derivativeSecurityAltID(value, 0, value.length);
    }

    public DerivativeSecurityAltIDGroupEncoder derivativeSecurityAltID(final char[] value, final int length)
    {
        return derivativeSecurityAltID(value, 0, length);
    }

    public DerivativeSecurityAltIDGroupEncoder derivativeSecurityAltID(final char[] value, final int offset, final int length)
    {
        toBytes(value, derivativeSecurityAltID, offset, length);
        derivativeSecurityAltIDOffset = 0;
        derivativeSecurityAltIDLength = length;
        return this;
    }

    private final MutableDirectBuffer derivativeSecurityAltIDSource = new UnsafeBuffer();

    private int derivativeSecurityAltIDSourceOffset = 0;

    private int derivativeSecurityAltIDSourceLength = 0;

    public DerivativeSecurityAltIDGroupEncoder derivativeSecurityAltIDSource(final DirectBuffer value, final int offset, final int length)
    {
        derivativeSecurityAltIDSource.wrap(value);
        derivativeSecurityAltIDSourceOffset = offset;
        derivativeSecurityAltIDSourceLength = length;
        return this;
    }

    public DerivativeSecurityAltIDGroupEncoder derivativeSecurityAltIDSource(final DirectBuffer value, final int length)
    {
        return derivativeSecurityAltIDSource(value, 0, length);
    }

    public DerivativeSecurityAltIDGroupEncoder derivativeSecurityAltIDSource(final DirectBuffer value)
    {
        return derivativeSecurityAltIDSource(value, 0, value.capacity());
    }

    public DerivativeSecurityAltIDGroupEncoder derivativeSecurityAltIDSource(final byte[] value, final int offset, final int length)
    {
        derivativeSecurityAltIDSource.wrap(value);
        derivativeSecurityAltIDSourceOffset = offset;
        derivativeSecurityAltIDSourceLength = length;
        return this;
    }

    public DerivativeSecurityAltIDGroupEncoder derivativeSecurityAltIDSourceAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(derivativeSecurityAltIDSource, value, offset, length);
        derivativeSecurityAltIDSourceOffset = offset;
        derivativeSecurityAltIDSourceLength = length;
        return this;
    }

    public DerivativeSecurityAltIDGroupEncoder derivativeSecurityAltIDSource(final byte[] value, final int length)
    {
        return derivativeSecurityAltIDSource(value, 0, length);
    }

    public DerivativeSecurityAltIDGroupEncoder derivativeSecurityAltIDSource(final byte[] value)
    {
        return derivativeSecurityAltIDSource(value, 0, value.length);
    }

    public boolean hasDerivativeSecurityAltIDSource()
    {
        return derivativeSecurityAltIDSourceLength > 0;
    }

    public MutableDirectBuffer derivativeSecurityAltIDSource()
    {
        return derivativeSecurityAltIDSource;
    }

    public String derivativeSecurityAltIDSourceAsString()
    {
        return derivativeSecurityAltIDSource.getStringWithoutLengthAscii(derivativeSecurityAltIDSourceOffset, derivativeSecurityAltIDSourceLength);
    }

    public DerivativeSecurityAltIDGroupEncoder derivativeSecurityAltIDSource(final CharSequence value)
    {
        toBytes(value, derivativeSecurityAltIDSource);
        derivativeSecurityAltIDSourceOffset = 0;
        derivativeSecurityAltIDSourceLength = value.length();
        return this;
    }

    public DerivativeSecurityAltIDGroupEncoder derivativeSecurityAltIDSource(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            derivativeSecurityAltIDSource.wrap(buffer);
            derivativeSecurityAltIDSourceOffset = value.offset();
            derivativeSecurityAltIDSourceLength = value.length();
        }
        return this;
    }

    public DerivativeSecurityAltIDGroupEncoder derivativeSecurityAltIDSource(final char[] value)
    {
        return derivativeSecurityAltIDSource(value, 0, value.length);
    }

    public DerivativeSecurityAltIDGroupEncoder derivativeSecurityAltIDSource(final char[] value, final int length)
    {
        return derivativeSecurityAltIDSource(value, 0, length);
    }

    public DerivativeSecurityAltIDGroupEncoder derivativeSecurityAltIDSource(final char[] value, final int offset, final int length)
    {
        toBytes(value, derivativeSecurityAltIDSource, offset, length);
        derivativeSecurityAltIDSourceOffset = 0;
        derivativeSecurityAltIDSourceLength = length;
        return this;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (derivativeSecurityAltIDLength > 0)
        {
            buffer.putBytes(position, derivativeSecurityAltIDHeader, 0, derivativeSecurityAltIDHeaderLength);
            position += derivativeSecurityAltIDHeaderLength;
            buffer.putBytes(position, derivativeSecurityAltID, derivativeSecurityAltIDOffset, derivativeSecurityAltIDLength);
            position += derivativeSecurityAltIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (derivativeSecurityAltIDSourceLength > 0)
        {
            buffer.putBytes(position, derivativeSecurityAltIDSourceHeader, 0, derivativeSecurityAltIDSourceHeaderLength);
            position += derivativeSecurityAltIDSourceHeaderLength;
            buffer.putBytes(position, derivativeSecurityAltIDSource, derivativeSecurityAltIDSourceOffset, derivativeSecurityAltIDSourceLength);
            position += derivativeSecurityAltIDSourceLength;
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
        this.resetDerivativeSecurityAltID();
        this.resetDerivativeSecurityAltIDSource();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetDerivativeSecurityAltID()
    {
        derivativeSecurityAltIDLength = 0;
    }

    public void resetDerivativeSecurityAltIDSource()
    {
        derivativeSecurityAltIDSourceLength = 0;
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
        builder.append("\"MessageName\": \"DerivativeSecurityAltIDGroup\",\n");
        if (hasDerivativeSecurityAltID())
        {
            indent(builder, level);
            builder.append("\"DerivativeSecurityAltID\": \"");
            appendBuffer(builder, derivativeSecurityAltID, derivativeSecurityAltIDOffset, derivativeSecurityAltIDLength);
            builder.append("\",\n");
        }

        if (hasDerivativeSecurityAltIDSource())
        {
            indent(builder, level);
            builder.append("\"DerivativeSecurityAltIDSource\": \"");
            appendBuffer(builder, derivativeSecurityAltIDSource, derivativeSecurityAltIDSourceOffset, derivativeSecurityAltIDSourceLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public DerivativeSecurityAltIDGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((DerivativeSecurityAltIDGroupEncoder)encoder);
    }

    public DerivativeSecurityAltIDGroupEncoder copyTo(final DerivativeSecurityAltIDGroupEncoder encoder)
    {
        encoder.reset();
        if (hasDerivativeSecurityAltID())
        {
            encoder.derivativeSecurityAltIDAsCopy(derivativeSecurityAltID.byteArray(), 0, derivativeSecurityAltIDLength);
        }

        if (hasDerivativeSecurityAltIDSource())
        {
            encoder.derivativeSecurityAltIDSourceAsCopy(derivativeSecurityAltIDSource.byteArray(), 0, derivativeSecurityAltIDSourceLength);
        }
        return encoder;
    }

}
    private int noDerivativeSecurityAltIDGroupCounter;

    private boolean hasNoDerivativeSecurityAltIDGroupCounter;

    public boolean hasNoDerivativeSecurityAltIDGroupCounter()
    {
        return hasNoDerivativeSecurityAltIDGroupCounter;
    }

    public DerivativeSecurityAltIDGrpEncoder noDerivativeSecurityAltIDGroupCounter(int value)
    {
        noDerivativeSecurityAltIDGroupCounter = value;
        hasNoDerivativeSecurityAltIDGroupCounter = true;
        return this;
    }

    public int noDerivativeSecurityAltIDGroupCounter()
    {
        return noDerivativeSecurityAltIDGroupCounter;
    }


    private DerivativeSecurityAltIDGroupEncoder derivativeSecurityAltIDGroup = null;

    public DerivativeSecurityAltIDGroupEncoder derivativeSecurityAltIDGroup(final int numberOfElements)
    {
        hasNoDerivativeSecurityAltIDGroupCounter = true;
        noDerivativeSecurityAltIDGroupCounter = numberOfElements;
        if (derivativeSecurityAltIDGroup == null)
        {
            derivativeSecurityAltIDGroup = new DerivativeSecurityAltIDGroupEncoder();
        }
        return derivativeSecurityAltIDGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoDerivativeSecurityAltIDGroupCounter)
        {
            buffer.putBytes(position, noDerivativeSecurityAltIDGroupCounterHeader, 0, noDerivativeSecurityAltIDGroupCounterHeaderLength);
            position += noDerivativeSecurityAltIDGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noDerivativeSecurityAltIDGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (derivativeSecurityAltIDGroup != null)
        {
            position += derivativeSecurityAltIDGroup.encode(buffer, position, noDerivativeSecurityAltIDGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetDerivativeSecurityAltIDGroup();
    }

    public void resetDerivativeSecurityAltIDGroup()
    {
        if (derivativeSecurityAltIDGroup != null)
        {
            derivativeSecurityAltIDGroup.reset();
        }
        noDerivativeSecurityAltIDGroupCounter = 0;
        hasNoDerivativeSecurityAltIDGroupCounter = false;
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
        builder.append("\"MessageName\": \"DerivativeSecurityAltIDGrp\",\n");
        if (hasNoDerivativeSecurityAltIDGroupCounter)
        {
            indent(builder, level);
            builder.append("\"DerivativeSecurityAltIDGroup\": [\n");
            final int noDerivativeSecurityAltIDGroupCounter = this.noDerivativeSecurityAltIDGroupCounter;
            DerivativeSecurityAltIDGroupEncoder derivativeSecurityAltIDGroup = this.derivativeSecurityAltIDGroup;
            for (int i = 0; i < noDerivativeSecurityAltIDGroupCounter; i++)
            {
                indent(builder, level);
                derivativeSecurityAltIDGroup.appendTo(builder, level + 1);
                if (i < (noDerivativeSecurityAltIDGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                derivativeSecurityAltIDGroup = derivativeSecurityAltIDGroup.next();
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
    public DerivativeSecurityAltIDGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((DerivativeSecurityAltIDGrpEncoder)encoder);
    }

    public DerivativeSecurityAltIDGrpEncoder copyTo(final DerivativeSecurityAltIDGrpEncoder encoder)
    {
        encoder.reset();
        if (hasNoDerivativeSecurityAltIDGroupCounter)
        {
            final int size = this.noDerivativeSecurityAltIDGroupCounter;
            DerivativeSecurityAltIDGroupEncoder derivativeSecurityAltIDGroup = this.derivativeSecurityAltIDGroup;
            DerivativeSecurityAltIDGroupEncoder derivativeSecurityAltIDGroupEncoder = encoder.derivativeSecurityAltIDGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (derivativeSecurityAltIDGroup != null)
                {
                    derivativeSecurityAltIDGroup.copyTo(derivativeSecurityAltIDGroupEncoder);
                    derivativeSecurityAltIDGroup = derivativeSecurityAltIDGroup.next();
                    derivativeSecurityAltIDGroupEncoder = derivativeSecurityAltIDGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
