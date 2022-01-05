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


public class DerivativeInstrumentPartySubIDsGrpEncoder
{
    private static final int noDerivativeInstrumentPartySubIDsGroupCounterHeaderLength = 5;
    private static final byte[] noDerivativeInstrumentPartySubIDsGroupCounterHeader = new byte[] {49, 50, 57, 54, (byte) '='};



public static class DerivativeInstrumentPartySubIDsGroupEncoder
{
    private DerivativeInstrumentPartySubIDsGroupEncoder next = null;

    public DerivativeInstrumentPartySubIDsGroupEncoder next()
    {
        if (next == null)
        {
            next = new DerivativeInstrumentPartySubIDsGroupEncoder();
        }
        return next;
    }

    private static final int derivativeInstrumentPartySubIDHeaderLength = 5;
    private static final byte[] derivativeInstrumentPartySubIDHeader = new byte[] {49, 50, 57, 55, (byte) '='};

    private static final int derivativeInstrumentPartySubIDTypeHeaderLength = 5;
    private static final byte[] derivativeInstrumentPartySubIDTypeHeader = new byte[] {49, 50, 57, 56, (byte) '='};

    private final MutableDirectBuffer derivativeInstrumentPartySubID = new UnsafeBuffer();

    private int derivativeInstrumentPartySubIDOffset = 0;

    private int derivativeInstrumentPartySubIDLength = 0;

    public DerivativeInstrumentPartySubIDsGroupEncoder derivativeInstrumentPartySubID(final DirectBuffer value, final int offset, final int length)
    {
        derivativeInstrumentPartySubID.wrap(value);
        derivativeInstrumentPartySubIDOffset = offset;
        derivativeInstrumentPartySubIDLength = length;
        return this;
    }

    public DerivativeInstrumentPartySubIDsGroupEncoder derivativeInstrumentPartySubID(final DirectBuffer value, final int length)
    {
        return derivativeInstrumentPartySubID(value, 0, length);
    }

    public DerivativeInstrumentPartySubIDsGroupEncoder derivativeInstrumentPartySubID(final DirectBuffer value)
    {
        return derivativeInstrumentPartySubID(value, 0, value.capacity());
    }

    public DerivativeInstrumentPartySubIDsGroupEncoder derivativeInstrumentPartySubID(final byte[] value, final int offset, final int length)
    {
        derivativeInstrumentPartySubID.wrap(value);
        derivativeInstrumentPartySubIDOffset = offset;
        derivativeInstrumentPartySubIDLength = length;
        return this;
    }

    public DerivativeInstrumentPartySubIDsGroupEncoder derivativeInstrumentPartySubIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(derivativeInstrumentPartySubID, value, offset, length);
        derivativeInstrumentPartySubIDOffset = offset;
        derivativeInstrumentPartySubIDLength = length;
        return this;
    }

    public DerivativeInstrumentPartySubIDsGroupEncoder derivativeInstrumentPartySubID(final byte[] value, final int length)
    {
        return derivativeInstrumentPartySubID(value, 0, length);
    }

    public DerivativeInstrumentPartySubIDsGroupEncoder derivativeInstrumentPartySubID(final byte[] value)
    {
        return derivativeInstrumentPartySubID(value, 0, value.length);
    }

    public boolean hasDerivativeInstrumentPartySubID()
    {
        return derivativeInstrumentPartySubIDLength > 0;
    }

    public MutableDirectBuffer derivativeInstrumentPartySubID()
    {
        return derivativeInstrumentPartySubID;
    }

    public String derivativeInstrumentPartySubIDAsString()
    {
        return derivativeInstrumentPartySubID.getStringWithoutLengthAscii(derivativeInstrumentPartySubIDOffset, derivativeInstrumentPartySubIDLength);
    }

    public DerivativeInstrumentPartySubIDsGroupEncoder derivativeInstrumentPartySubID(final CharSequence value)
    {
        toBytes(value, derivativeInstrumentPartySubID);
        derivativeInstrumentPartySubIDOffset = 0;
        derivativeInstrumentPartySubIDLength = value.length();
        return this;
    }

    public DerivativeInstrumentPartySubIDsGroupEncoder derivativeInstrumentPartySubID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            derivativeInstrumentPartySubID.wrap(buffer);
            derivativeInstrumentPartySubIDOffset = value.offset();
            derivativeInstrumentPartySubIDLength = value.length();
        }
        return this;
    }

    public DerivativeInstrumentPartySubIDsGroupEncoder derivativeInstrumentPartySubID(final char[] value)
    {
        return derivativeInstrumentPartySubID(value, 0, value.length);
    }

    public DerivativeInstrumentPartySubIDsGroupEncoder derivativeInstrumentPartySubID(final char[] value, final int length)
    {
        return derivativeInstrumentPartySubID(value, 0, length);
    }

    public DerivativeInstrumentPartySubIDsGroupEncoder derivativeInstrumentPartySubID(final char[] value, final int offset, final int length)
    {
        toBytes(value, derivativeInstrumentPartySubID, offset, length);
        derivativeInstrumentPartySubIDOffset = 0;
        derivativeInstrumentPartySubIDLength = length;
        return this;
    }

    private int derivativeInstrumentPartySubIDType;

    private boolean hasDerivativeInstrumentPartySubIDType;

    public boolean hasDerivativeInstrumentPartySubIDType()
    {
        return hasDerivativeInstrumentPartySubIDType;
    }

    public DerivativeInstrumentPartySubIDsGroupEncoder derivativeInstrumentPartySubIDType(int value)
    {
        derivativeInstrumentPartySubIDType = value;
        hasDerivativeInstrumentPartySubIDType = true;
        return this;
    }

    public int derivativeInstrumentPartySubIDType()
    {
        return derivativeInstrumentPartySubIDType;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (derivativeInstrumentPartySubIDLength > 0)
        {
            buffer.putBytes(position, derivativeInstrumentPartySubIDHeader, 0, derivativeInstrumentPartySubIDHeaderLength);
            position += derivativeInstrumentPartySubIDHeaderLength;
            buffer.putBytes(position, derivativeInstrumentPartySubID, derivativeInstrumentPartySubIDOffset, derivativeInstrumentPartySubIDLength);
            position += derivativeInstrumentPartySubIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasDerivativeInstrumentPartySubIDType)
        {
            buffer.putBytes(position, derivativeInstrumentPartySubIDTypeHeader, 0, derivativeInstrumentPartySubIDTypeHeaderLength);
            position += derivativeInstrumentPartySubIDTypeHeaderLength;
            position += buffer.putIntAscii(position, derivativeInstrumentPartySubIDType);
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
        this.resetDerivativeInstrumentPartySubID();
        this.resetDerivativeInstrumentPartySubIDType();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetDerivativeInstrumentPartySubID()
    {
        derivativeInstrumentPartySubIDLength = 0;
    }

    public void resetDerivativeInstrumentPartySubIDType()
    {
        hasDerivativeInstrumentPartySubIDType = false;
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
        builder.append("\"MessageName\": \"DerivativeInstrumentPartySubIDsGroup\",\n");
        if (hasDerivativeInstrumentPartySubID())
        {
            indent(builder, level);
            builder.append("\"DerivativeInstrumentPartySubID\": \"");
            appendBuffer(builder, derivativeInstrumentPartySubID, derivativeInstrumentPartySubIDOffset, derivativeInstrumentPartySubIDLength);
            builder.append("\",\n");
        }

        if (hasDerivativeInstrumentPartySubIDType())
        {
            indent(builder, level);
            builder.append("\"DerivativeInstrumentPartySubIDType\": \"");
            builder.append(derivativeInstrumentPartySubIDType);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public DerivativeInstrumentPartySubIDsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((DerivativeInstrumentPartySubIDsGroupEncoder)encoder);
    }

    public DerivativeInstrumentPartySubIDsGroupEncoder copyTo(final DerivativeInstrumentPartySubIDsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasDerivativeInstrumentPartySubID())
        {
            encoder.derivativeInstrumentPartySubIDAsCopy(derivativeInstrumentPartySubID.byteArray(), 0, derivativeInstrumentPartySubIDLength);
        }

        if (hasDerivativeInstrumentPartySubIDType())
        {
            encoder.derivativeInstrumentPartySubIDType(this.derivativeInstrumentPartySubIDType());
        }
        return encoder;
    }

}
    private int noDerivativeInstrumentPartySubIDsGroupCounter;

    private boolean hasNoDerivativeInstrumentPartySubIDsGroupCounter;

    public boolean hasNoDerivativeInstrumentPartySubIDsGroupCounter()
    {
        return hasNoDerivativeInstrumentPartySubIDsGroupCounter;
    }

    public DerivativeInstrumentPartySubIDsGrpEncoder noDerivativeInstrumentPartySubIDsGroupCounter(int value)
    {
        noDerivativeInstrumentPartySubIDsGroupCounter = value;
        hasNoDerivativeInstrumentPartySubIDsGroupCounter = true;
        return this;
    }

    public int noDerivativeInstrumentPartySubIDsGroupCounter()
    {
        return noDerivativeInstrumentPartySubIDsGroupCounter;
    }


    private DerivativeInstrumentPartySubIDsGroupEncoder derivativeInstrumentPartySubIDsGroup = null;

    public DerivativeInstrumentPartySubIDsGroupEncoder derivativeInstrumentPartySubIDsGroup(final int numberOfElements)
    {
        hasNoDerivativeInstrumentPartySubIDsGroupCounter = true;
        noDerivativeInstrumentPartySubIDsGroupCounter = numberOfElements;
        if (derivativeInstrumentPartySubIDsGroup == null)
        {
            derivativeInstrumentPartySubIDsGroup = new DerivativeInstrumentPartySubIDsGroupEncoder();
        }
        return derivativeInstrumentPartySubIDsGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoDerivativeInstrumentPartySubIDsGroupCounter)
        {
            buffer.putBytes(position, noDerivativeInstrumentPartySubIDsGroupCounterHeader, 0, noDerivativeInstrumentPartySubIDsGroupCounterHeaderLength);
            position += noDerivativeInstrumentPartySubIDsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noDerivativeInstrumentPartySubIDsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (derivativeInstrumentPartySubIDsGroup != null)
        {
            position += derivativeInstrumentPartySubIDsGroup.encode(buffer, position, noDerivativeInstrumentPartySubIDsGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetDerivativeInstrumentPartySubIDsGroup();
    }

    public void resetDerivativeInstrumentPartySubIDsGroup()
    {
        if (derivativeInstrumentPartySubIDsGroup != null)
        {
            derivativeInstrumentPartySubIDsGroup.reset();
        }
        noDerivativeInstrumentPartySubIDsGroupCounter = 0;
        hasNoDerivativeInstrumentPartySubIDsGroupCounter = false;
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
        builder.append("\"MessageName\": \"DerivativeInstrumentPartySubIDsGrp\",\n");
        if (hasNoDerivativeInstrumentPartySubIDsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"DerivativeInstrumentPartySubIDsGroup\": [\n");
            final int noDerivativeInstrumentPartySubIDsGroupCounter = this.noDerivativeInstrumentPartySubIDsGroupCounter;
            DerivativeInstrumentPartySubIDsGroupEncoder derivativeInstrumentPartySubIDsGroup = this.derivativeInstrumentPartySubIDsGroup;
            for (int i = 0; i < noDerivativeInstrumentPartySubIDsGroupCounter; i++)
            {
                indent(builder, level);
                derivativeInstrumentPartySubIDsGroup.appendTo(builder, level + 1);
                if (i < (noDerivativeInstrumentPartySubIDsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                derivativeInstrumentPartySubIDsGroup = derivativeInstrumentPartySubIDsGroup.next();
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
    public DerivativeInstrumentPartySubIDsGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((DerivativeInstrumentPartySubIDsGrpEncoder)encoder);
    }

    public DerivativeInstrumentPartySubIDsGrpEncoder copyTo(final DerivativeInstrumentPartySubIDsGrpEncoder encoder)
    {
        encoder.reset();
        if (hasNoDerivativeInstrumentPartySubIDsGroupCounter)
        {
            final int size = this.noDerivativeInstrumentPartySubIDsGroupCounter;
            DerivativeInstrumentPartySubIDsGroupEncoder derivativeInstrumentPartySubIDsGroup = this.derivativeInstrumentPartySubIDsGroup;
            DerivativeInstrumentPartySubIDsGroupEncoder derivativeInstrumentPartySubIDsGroupEncoder = encoder.derivativeInstrumentPartySubIDsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (derivativeInstrumentPartySubIDsGroup != null)
                {
                    derivativeInstrumentPartySubIDsGroup.copyTo(derivativeInstrumentPartySubIDsGroupEncoder);
                    derivativeInstrumentPartySubIDsGroup = derivativeInstrumentPartySubIDsGroup.next();
                    derivativeInstrumentPartySubIDsGroupEncoder = derivativeInstrumentPartySubIDsGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
