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


public class DerivativeInstrumentPartiesEncoder
{
    private static final int noDerivativeInstrumentPartiesGroupCounterHeaderLength = 5;
    private static final byte[] noDerivativeInstrumentPartiesGroupCounterHeader = new byte[] {49, 50, 57, 50, (byte) '='};



public static class DerivativeInstrumentPartiesGroupEncoder
{
    private DerivativeInstrumentPartiesGroupEncoder next = null;

    public DerivativeInstrumentPartiesGroupEncoder next()
    {
        if (next == null)
        {
            next = new DerivativeInstrumentPartiesGroupEncoder();
        }
        return next;
    }

    private static final int derivativeInstrumentPartyIDHeaderLength = 5;
    private static final byte[] derivativeInstrumentPartyIDHeader = new byte[] {49, 50, 57, 51, (byte) '='};

    private static final int derivativeInstrumentPartyIDSourceHeaderLength = 5;
    private static final byte[] derivativeInstrumentPartyIDSourceHeader = new byte[] {49, 50, 57, 52, (byte) '='};

    private static final int derivativeInstrumentPartyRoleHeaderLength = 5;
    private static final byte[] derivativeInstrumentPartyRoleHeader = new byte[] {49, 50, 57, 53, (byte) '='};

    private final MutableDirectBuffer derivativeInstrumentPartyID = new UnsafeBuffer();

    private int derivativeInstrumentPartyIDOffset = 0;

    private int derivativeInstrumentPartyIDLength = 0;

    public DerivativeInstrumentPartiesGroupEncoder derivativeInstrumentPartyID(final DirectBuffer value, final int offset, final int length)
    {
        derivativeInstrumentPartyID.wrap(value);
        derivativeInstrumentPartyIDOffset = offset;
        derivativeInstrumentPartyIDLength = length;
        return this;
    }

    public DerivativeInstrumentPartiesGroupEncoder derivativeInstrumentPartyID(final DirectBuffer value, final int length)
    {
        return derivativeInstrumentPartyID(value, 0, length);
    }

    public DerivativeInstrumentPartiesGroupEncoder derivativeInstrumentPartyID(final DirectBuffer value)
    {
        return derivativeInstrumentPartyID(value, 0, value.capacity());
    }

    public DerivativeInstrumentPartiesGroupEncoder derivativeInstrumentPartyID(final byte[] value, final int offset, final int length)
    {
        derivativeInstrumentPartyID.wrap(value);
        derivativeInstrumentPartyIDOffset = offset;
        derivativeInstrumentPartyIDLength = length;
        return this;
    }

    public DerivativeInstrumentPartiesGroupEncoder derivativeInstrumentPartyIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(derivativeInstrumentPartyID, value, offset, length);
        derivativeInstrumentPartyIDOffset = offset;
        derivativeInstrumentPartyIDLength = length;
        return this;
    }

    public DerivativeInstrumentPartiesGroupEncoder derivativeInstrumentPartyID(final byte[] value, final int length)
    {
        return derivativeInstrumentPartyID(value, 0, length);
    }

    public DerivativeInstrumentPartiesGroupEncoder derivativeInstrumentPartyID(final byte[] value)
    {
        return derivativeInstrumentPartyID(value, 0, value.length);
    }

    public boolean hasDerivativeInstrumentPartyID()
    {
        return derivativeInstrumentPartyIDLength > 0;
    }

    public MutableDirectBuffer derivativeInstrumentPartyID()
    {
        return derivativeInstrumentPartyID;
    }

    public String derivativeInstrumentPartyIDAsString()
    {
        return derivativeInstrumentPartyID.getStringWithoutLengthAscii(derivativeInstrumentPartyIDOffset, derivativeInstrumentPartyIDLength);
    }

    public DerivativeInstrumentPartiesGroupEncoder derivativeInstrumentPartyID(final CharSequence value)
    {
        toBytes(value, derivativeInstrumentPartyID);
        derivativeInstrumentPartyIDOffset = 0;
        derivativeInstrumentPartyIDLength = value.length();
        return this;
    }

    public DerivativeInstrumentPartiesGroupEncoder derivativeInstrumentPartyID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            derivativeInstrumentPartyID.wrap(buffer);
            derivativeInstrumentPartyIDOffset = value.offset();
            derivativeInstrumentPartyIDLength = value.length();
        }
        return this;
    }

    public DerivativeInstrumentPartiesGroupEncoder derivativeInstrumentPartyID(final char[] value)
    {
        return derivativeInstrumentPartyID(value, 0, value.length);
    }

    public DerivativeInstrumentPartiesGroupEncoder derivativeInstrumentPartyID(final char[] value, final int length)
    {
        return derivativeInstrumentPartyID(value, 0, length);
    }

    public DerivativeInstrumentPartiesGroupEncoder derivativeInstrumentPartyID(final char[] value, final int offset, final int length)
    {
        toBytes(value, derivativeInstrumentPartyID, offset, length);
        derivativeInstrumentPartyIDOffset = 0;
        derivativeInstrumentPartyIDLength = length;
        return this;
    }

    private final MutableDirectBuffer derivativeInstrumentPartyIDSource = new UnsafeBuffer();

    private int derivativeInstrumentPartyIDSourceOffset = 0;

    private int derivativeInstrumentPartyIDSourceLength = 0;

    public DerivativeInstrumentPartiesGroupEncoder derivativeInstrumentPartyIDSource(final DirectBuffer value, final int offset, final int length)
    {
        derivativeInstrumentPartyIDSource.wrap(value);
        derivativeInstrumentPartyIDSourceOffset = offset;
        derivativeInstrumentPartyIDSourceLength = length;
        return this;
    }

    public DerivativeInstrumentPartiesGroupEncoder derivativeInstrumentPartyIDSource(final DirectBuffer value, final int length)
    {
        return derivativeInstrumentPartyIDSource(value, 0, length);
    }

    public DerivativeInstrumentPartiesGroupEncoder derivativeInstrumentPartyIDSource(final DirectBuffer value)
    {
        return derivativeInstrumentPartyIDSource(value, 0, value.capacity());
    }

    public DerivativeInstrumentPartiesGroupEncoder derivativeInstrumentPartyIDSource(final byte[] value, final int offset, final int length)
    {
        derivativeInstrumentPartyIDSource.wrap(value);
        derivativeInstrumentPartyIDSourceOffset = offset;
        derivativeInstrumentPartyIDSourceLength = length;
        return this;
    }

    public DerivativeInstrumentPartiesGroupEncoder derivativeInstrumentPartyIDSourceAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(derivativeInstrumentPartyIDSource, value, offset, length);
        derivativeInstrumentPartyIDSourceOffset = offset;
        derivativeInstrumentPartyIDSourceLength = length;
        return this;
    }

    public DerivativeInstrumentPartiesGroupEncoder derivativeInstrumentPartyIDSource(final byte[] value, final int length)
    {
        return derivativeInstrumentPartyIDSource(value, 0, length);
    }

    public DerivativeInstrumentPartiesGroupEncoder derivativeInstrumentPartyIDSource(final byte[] value)
    {
        return derivativeInstrumentPartyIDSource(value, 0, value.length);
    }

    public boolean hasDerivativeInstrumentPartyIDSource()
    {
        return derivativeInstrumentPartyIDSourceLength > 0;
    }

    public MutableDirectBuffer derivativeInstrumentPartyIDSource()
    {
        return derivativeInstrumentPartyIDSource;
    }

    public String derivativeInstrumentPartyIDSourceAsString()
    {
        return derivativeInstrumentPartyIDSource.getStringWithoutLengthAscii(derivativeInstrumentPartyIDSourceOffset, derivativeInstrumentPartyIDSourceLength);
    }

    public DerivativeInstrumentPartiesGroupEncoder derivativeInstrumentPartyIDSource(final CharSequence value)
    {
        toBytes(value, derivativeInstrumentPartyIDSource);
        derivativeInstrumentPartyIDSourceOffset = 0;
        derivativeInstrumentPartyIDSourceLength = value.length();
        return this;
    }

    public DerivativeInstrumentPartiesGroupEncoder derivativeInstrumentPartyIDSource(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            derivativeInstrumentPartyIDSource.wrap(buffer);
            derivativeInstrumentPartyIDSourceOffset = value.offset();
            derivativeInstrumentPartyIDSourceLength = value.length();
        }
        return this;
    }

    public DerivativeInstrumentPartiesGroupEncoder derivativeInstrumentPartyIDSource(final char[] value)
    {
        return derivativeInstrumentPartyIDSource(value, 0, value.length);
    }

    public DerivativeInstrumentPartiesGroupEncoder derivativeInstrumentPartyIDSource(final char[] value, final int length)
    {
        return derivativeInstrumentPartyIDSource(value, 0, length);
    }

    public DerivativeInstrumentPartiesGroupEncoder derivativeInstrumentPartyIDSource(final char[] value, final int offset, final int length)
    {
        toBytes(value, derivativeInstrumentPartyIDSource, offset, length);
        derivativeInstrumentPartyIDSourceOffset = 0;
        derivativeInstrumentPartyIDSourceLength = length;
        return this;
    }

    private int derivativeInstrumentPartyRole;

    private boolean hasDerivativeInstrumentPartyRole;

    public boolean hasDerivativeInstrumentPartyRole()
    {
        return hasDerivativeInstrumentPartyRole;
    }

    public DerivativeInstrumentPartiesGroupEncoder derivativeInstrumentPartyRole(int value)
    {
        derivativeInstrumentPartyRole = value;
        hasDerivativeInstrumentPartyRole = true;
        return this;
    }

    public int derivativeInstrumentPartyRole()
    {
        return derivativeInstrumentPartyRole;
    }

    private final DerivativeInstrumentPartySubIDsGrpEncoder derivativeInstrumentPartySubIDsGrp = new DerivativeInstrumentPartySubIDsGrpEncoder();
    public DerivativeInstrumentPartySubIDsGrpEncoder derivativeInstrumentPartySubIDsGrp()
    {
        return derivativeInstrumentPartySubIDsGrp;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (derivativeInstrumentPartyIDLength > 0)
        {
            buffer.putBytes(position, derivativeInstrumentPartyIDHeader, 0, derivativeInstrumentPartyIDHeaderLength);
            position += derivativeInstrumentPartyIDHeaderLength;
            buffer.putBytes(position, derivativeInstrumentPartyID, derivativeInstrumentPartyIDOffset, derivativeInstrumentPartyIDLength);
            position += derivativeInstrumentPartyIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (derivativeInstrumentPartyIDSourceLength > 0)
        {
            buffer.putBytes(position, derivativeInstrumentPartyIDSourceHeader, 0, derivativeInstrumentPartyIDSourceHeaderLength);
            position += derivativeInstrumentPartyIDSourceHeaderLength;
            buffer.putBytes(position, derivativeInstrumentPartyIDSource, derivativeInstrumentPartyIDSourceOffset, derivativeInstrumentPartyIDSourceLength);
            position += derivativeInstrumentPartyIDSourceLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasDerivativeInstrumentPartyRole)
        {
            buffer.putBytes(position, derivativeInstrumentPartyRoleHeader, 0, derivativeInstrumentPartyRoleHeaderLength);
            position += derivativeInstrumentPartyRoleHeaderLength;
            position += buffer.putIntAscii(position, derivativeInstrumentPartyRole);
            buffer.putSeparator(position);
            position++;
        }

            position += derivativeInstrumentPartySubIDsGrp.encode(buffer, position);
        if (next != null)
        {
            position += next.encode(buffer, position, remainingElements - 1);
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetDerivativeInstrumentPartyID();
        this.resetDerivativeInstrumentPartyIDSource();
        this.resetDerivativeInstrumentPartyRole();
        derivativeInstrumentPartySubIDsGrp.reset();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetDerivativeInstrumentPartyID()
    {
        derivativeInstrumentPartyIDLength = 0;
    }

    public void resetDerivativeInstrumentPartyIDSource()
    {
        derivativeInstrumentPartyIDSourceLength = 0;
    }

    public void resetDerivativeInstrumentPartyRole()
    {
        hasDerivativeInstrumentPartyRole = false;
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
        builder.append("\"MessageName\": \"DerivativeInstrumentPartiesGroup\",\n");
        if (hasDerivativeInstrumentPartyID())
        {
            indent(builder, level);
            builder.append("\"DerivativeInstrumentPartyID\": \"");
            appendBuffer(builder, derivativeInstrumentPartyID, derivativeInstrumentPartyIDOffset, derivativeInstrumentPartyIDLength);
            builder.append("\",\n");
        }

        if (hasDerivativeInstrumentPartyIDSource())
        {
            indent(builder, level);
            builder.append("\"DerivativeInstrumentPartyIDSource\": \"");
            appendBuffer(builder, derivativeInstrumentPartyIDSource, derivativeInstrumentPartyIDSourceOffset, derivativeInstrumentPartyIDSourceLength);
            builder.append("\",\n");
        }

        if (hasDerivativeInstrumentPartyRole())
        {
            indent(builder, level);
            builder.append("\"DerivativeInstrumentPartyRole\": \"");
            builder.append(derivativeInstrumentPartyRole);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"DerivativeInstrumentPartySubIDsGrp\": ");
    derivativeInstrumentPartySubIDsGrp.appendTo(builder, level + 1);
    builder.append("\n");
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public DerivativeInstrumentPartiesGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((DerivativeInstrumentPartiesGroupEncoder)encoder);
    }

    public DerivativeInstrumentPartiesGroupEncoder copyTo(final DerivativeInstrumentPartiesGroupEncoder encoder)
    {
        encoder.reset();
        if (hasDerivativeInstrumentPartyID())
        {
            encoder.derivativeInstrumentPartyIDAsCopy(derivativeInstrumentPartyID.byteArray(), 0, derivativeInstrumentPartyIDLength);
        }

        if (hasDerivativeInstrumentPartyIDSource())
        {
            encoder.derivativeInstrumentPartyIDSourceAsCopy(derivativeInstrumentPartyIDSource.byteArray(), 0, derivativeInstrumentPartyIDSourceLength);
        }

        if (hasDerivativeInstrumentPartyRole())
        {
            encoder.derivativeInstrumentPartyRole(this.derivativeInstrumentPartyRole());
        }


        derivativeInstrumentPartySubIDsGrp.copyTo(encoder.derivativeInstrumentPartySubIDsGrp());        return encoder;
    }

}
    private int noDerivativeInstrumentPartiesGroupCounter;

    private boolean hasNoDerivativeInstrumentPartiesGroupCounter;

    public boolean hasNoDerivativeInstrumentPartiesGroupCounter()
    {
        return hasNoDerivativeInstrumentPartiesGroupCounter;
    }

    public DerivativeInstrumentPartiesEncoder noDerivativeInstrumentPartiesGroupCounter(int value)
    {
        noDerivativeInstrumentPartiesGroupCounter = value;
        hasNoDerivativeInstrumentPartiesGroupCounter = true;
        return this;
    }

    public int noDerivativeInstrumentPartiesGroupCounter()
    {
        return noDerivativeInstrumentPartiesGroupCounter;
    }


    private DerivativeInstrumentPartiesGroupEncoder derivativeInstrumentPartiesGroup = null;

    public DerivativeInstrumentPartiesGroupEncoder derivativeInstrumentPartiesGroup(final int numberOfElements)
    {
        hasNoDerivativeInstrumentPartiesGroupCounter = true;
        noDerivativeInstrumentPartiesGroupCounter = numberOfElements;
        if (derivativeInstrumentPartiesGroup == null)
        {
            derivativeInstrumentPartiesGroup = new DerivativeInstrumentPartiesGroupEncoder();
        }
        return derivativeInstrumentPartiesGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoDerivativeInstrumentPartiesGroupCounter)
        {
            buffer.putBytes(position, noDerivativeInstrumentPartiesGroupCounterHeader, 0, noDerivativeInstrumentPartiesGroupCounterHeaderLength);
            position += noDerivativeInstrumentPartiesGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noDerivativeInstrumentPartiesGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (derivativeInstrumentPartiesGroup != null)
        {
            position += derivativeInstrumentPartiesGroup.encode(buffer, position, noDerivativeInstrumentPartiesGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetDerivativeInstrumentPartiesGroup();
    }

    public void resetDerivativeInstrumentPartiesGroup()
    {
        if (derivativeInstrumentPartiesGroup != null)
        {
            derivativeInstrumentPartiesGroup.reset();
        }
        noDerivativeInstrumentPartiesGroupCounter = 0;
        hasNoDerivativeInstrumentPartiesGroupCounter = false;
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
        builder.append("\"MessageName\": \"DerivativeInstrumentParties\",\n");
        if (hasNoDerivativeInstrumentPartiesGroupCounter)
        {
            indent(builder, level);
            builder.append("\"DerivativeInstrumentPartiesGroup\": [\n");
            final int noDerivativeInstrumentPartiesGroupCounter = this.noDerivativeInstrumentPartiesGroupCounter;
            DerivativeInstrumentPartiesGroupEncoder derivativeInstrumentPartiesGroup = this.derivativeInstrumentPartiesGroup;
            for (int i = 0; i < noDerivativeInstrumentPartiesGroupCounter; i++)
            {
                indent(builder, level);
                derivativeInstrumentPartiesGroup.appendTo(builder, level + 1);
                if (i < (noDerivativeInstrumentPartiesGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                derivativeInstrumentPartiesGroup = derivativeInstrumentPartiesGroup.next();
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
    public DerivativeInstrumentPartiesEncoder copyTo(final Encoder encoder)
    {
        return copyTo((DerivativeInstrumentPartiesEncoder)encoder);
    }

    public DerivativeInstrumentPartiesEncoder copyTo(final DerivativeInstrumentPartiesEncoder encoder)
    {
        encoder.reset();
        if (hasNoDerivativeInstrumentPartiesGroupCounter)
        {
            final int size = this.noDerivativeInstrumentPartiesGroupCounter;
            DerivativeInstrumentPartiesGroupEncoder derivativeInstrumentPartiesGroup = this.derivativeInstrumentPartiesGroup;
            DerivativeInstrumentPartiesGroupEncoder derivativeInstrumentPartiesGroupEncoder = encoder.derivativeInstrumentPartiesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (derivativeInstrumentPartiesGroup != null)
                {
                    derivativeInstrumentPartiesGroup.copyTo(derivativeInstrumentPartiesGroupEncoder);
                    derivativeInstrumentPartiesGroup = derivativeInstrumentPartiesGroup.next();
                    derivativeInstrumentPartiesGroupEncoder = derivativeInstrumentPartiesGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
