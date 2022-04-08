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


public class LegSecAltIDGrpEncoder
{
    private static final int noLegSecurityAltIDGroupCounterHeaderLength = 4;
    private static final byte[] noLegSecurityAltIDGroupCounterHeader = new byte[] {54, 48, 52, (byte) '='};



public static class LegSecurityAltIDGroupEncoder
{
    private LegSecurityAltIDGroupEncoder next = null;

    public LegSecurityAltIDGroupEncoder next()
    {
        if (next == null)
        {
            next = new LegSecurityAltIDGroupEncoder();
        }
        return next;
    }

    private static final int legSecurityAltIDHeaderLength = 4;
    private static final byte[] legSecurityAltIDHeader = new byte[] {54, 48, 53, (byte) '='};

    private static final int legSecurityAltIDSourceHeaderLength = 4;
    private static final byte[] legSecurityAltIDSourceHeader = new byte[] {54, 48, 54, (byte) '='};

    private final MutableDirectBuffer legSecurityAltID = new UnsafeBuffer();

    private int legSecurityAltIDOffset = 0;

    private int legSecurityAltIDLength = 0;

    public LegSecurityAltIDGroupEncoder legSecurityAltID(final DirectBuffer value, final int offset, final int length)
    {
        legSecurityAltID.wrap(value);
        legSecurityAltIDOffset = offset;
        legSecurityAltIDLength = length;
        return this;
    }

    public LegSecurityAltIDGroupEncoder legSecurityAltID(final DirectBuffer value, final int length)
    {
        return legSecurityAltID(value, 0, length);
    }

    public LegSecurityAltIDGroupEncoder legSecurityAltID(final DirectBuffer value)
    {
        return legSecurityAltID(value, 0, value.capacity());
    }

    public LegSecurityAltIDGroupEncoder legSecurityAltID(final byte[] value, final int offset, final int length)
    {
        legSecurityAltID.wrap(value);
        legSecurityAltIDOffset = offset;
        legSecurityAltIDLength = length;
        return this;
    }

    public LegSecurityAltIDGroupEncoder legSecurityAltIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(legSecurityAltID, value, offset, length);
        legSecurityAltIDOffset = offset;
        legSecurityAltIDLength = length;
        return this;
    }

    public LegSecurityAltIDGroupEncoder legSecurityAltID(final byte[] value, final int length)
    {
        return legSecurityAltID(value, 0, length);
    }

    public LegSecurityAltIDGroupEncoder legSecurityAltID(final byte[] value)
    {
        return legSecurityAltID(value, 0, value.length);
    }

    public boolean hasLegSecurityAltID()
    {
        return legSecurityAltIDLength > 0;
    }

    public MutableDirectBuffer legSecurityAltID()
    {
        return legSecurityAltID;
    }

    public String legSecurityAltIDAsString()
    {
        return legSecurityAltID.getStringWithoutLengthAscii(legSecurityAltIDOffset, legSecurityAltIDLength);
    }

    public LegSecurityAltIDGroupEncoder legSecurityAltID(final CharSequence value)
    {
        toBytes(value, legSecurityAltID);
        legSecurityAltIDOffset = 0;
        legSecurityAltIDLength = value.length();
        return this;
    }

    public LegSecurityAltIDGroupEncoder legSecurityAltID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            legSecurityAltID.wrap(buffer);
            legSecurityAltIDOffset = value.offset();
            legSecurityAltIDLength = value.length();
        }
        return this;
    }

    public LegSecurityAltIDGroupEncoder legSecurityAltID(final char[] value)
    {
        return legSecurityAltID(value, 0, value.length);
    }

    public LegSecurityAltIDGroupEncoder legSecurityAltID(final char[] value, final int length)
    {
        return legSecurityAltID(value, 0, length);
    }

    public LegSecurityAltIDGroupEncoder legSecurityAltID(final char[] value, final int offset, final int length)
    {
        toBytes(value, legSecurityAltID, offset, length);
        legSecurityAltIDOffset = 0;
        legSecurityAltIDLength = length;
        return this;
    }

    private final MutableDirectBuffer legSecurityAltIDSource = new UnsafeBuffer();

    private int legSecurityAltIDSourceOffset = 0;

    private int legSecurityAltIDSourceLength = 0;

    public LegSecurityAltIDGroupEncoder legSecurityAltIDSource(final DirectBuffer value, final int offset, final int length)
    {
        legSecurityAltIDSource.wrap(value);
        legSecurityAltIDSourceOffset = offset;
        legSecurityAltIDSourceLength = length;
        return this;
    }

    public LegSecurityAltIDGroupEncoder legSecurityAltIDSource(final DirectBuffer value, final int length)
    {
        return legSecurityAltIDSource(value, 0, length);
    }

    public LegSecurityAltIDGroupEncoder legSecurityAltIDSource(final DirectBuffer value)
    {
        return legSecurityAltIDSource(value, 0, value.capacity());
    }

    public LegSecurityAltIDGroupEncoder legSecurityAltIDSource(final byte[] value, final int offset, final int length)
    {
        legSecurityAltIDSource.wrap(value);
        legSecurityAltIDSourceOffset = offset;
        legSecurityAltIDSourceLength = length;
        return this;
    }

    public LegSecurityAltIDGroupEncoder legSecurityAltIDSourceAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(legSecurityAltIDSource, value, offset, length);
        legSecurityAltIDSourceOffset = offset;
        legSecurityAltIDSourceLength = length;
        return this;
    }

    public LegSecurityAltIDGroupEncoder legSecurityAltIDSource(final byte[] value, final int length)
    {
        return legSecurityAltIDSource(value, 0, length);
    }

    public LegSecurityAltIDGroupEncoder legSecurityAltIDSource(final byte[] value)
    {
        return legSecurityAltIDSource(value, 0, value.length);
    }

    public boolean hasLegSecurityAltIDSource()
    {
        return legSecurityAltIDSourceLength > 0;
    }

    public MutableDirectBuffer legSecurityAltIDSource()
    {
        return legSecurityAltIDSource;
    }

    public String legSecurityAltIDSourceAsString()
    {
        return legSecurityAltIDSource.getStringWithoutLengthAscii(legSecurityAltIDSourceOffset, legSecurityAltIDSourceLength);
    }

    public LegSecurityAltIDGroupEncoder legSecurityAltIDSource(final CharSequence value)
    {
        toBytes(value, legSecurityAltIDSource);
        legSecurityAltIDSourceOffset = 0;
        legSecurityAltIDSourceLength = value.length();
        return this;
    }

    public LegSecurityAltIDGroupEncoder legSecurityAltIDSource(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            legSecurityAltIDSource.wrap(buffer);
            legSecurityAltIDSourceOffset = value.offset();
            legSecurityAltIDSourceLength = value.length();
        }
        return this;
    }

    public LegSecurityAltIDGroupEncoder legSecurityAltIDSource(final char[] value)
    {
        return legSecurityAltIDSource(value, 0, value.length);
    }

    public LegSecurityAltIDGroupEncoder legSecurityAltIDSource(final char[] value, final int length)
    {
        return legSecurityAltIDSource(value, 0, length);
    }

    public LegSecurityAltIDGroupEncoder legSecurityAltIDSource(final char[] value, final int offset, final int length)
    {
        toBytes(value, legSecurityAltIDSource, offset, length);
        legSecurityAltIDSourceOffset = 0;
        legSecurityAltIDSourceLength = length;
        return this;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (legSecurityAltIDLength > 0)
        {
            buffer.putBytes(position, legSecurityAltIDHeader, 0, legSecurityAltIDHeaderLength);
            position += legSecurityAltIDHeaderLength;
            buffer.putBytes(position, legSecurityAltID, legSecurityAltIDOffset, legSecurityAltIDLength);
            position += legSecurityAltIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (legSecurityAltIDSourceLength > 0)
        {
            buffer.putBytes(position, legSecurityAltIDSourceHeader, 0, legSecurityAltIDSourceHeaderLength);
            position += legSecurityAltIDSourceHeaderLength;
            buffer.putBytes(position, legSecurityAltIDSource, legSecurityAltIDSourceOffset, legSecurityAltIDSourceLength);
            position += legSecurityAltIDSourceLength;
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
        this.resetLegSecurityAltID();
        this.resetLegSecurityAltIDSource();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetLegSecurityAltID()
    {
        legSecurityAltIDLength = 0;
    }

    public void resetLegSecurityAltIDSource()
    {
        legSecurityAltIDSourceLength = 0;
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
        builder.append("\"MessageName\": \"LegSecurityAltIDGroup\",\n");
        if (hasLegSecurityAltID())
        {
            indent(builder, level);
            builder.append("\"LegSecurityAltID\": \"");
            appendBuffer(builder, legSecurityAltID, legSecurityAltIDOffset, legSecurityAltIDLength);
            builder.append("\",\n");
        }

        if (hasLegSecurityAltIDSource())
        {
            indent(builder, level);
            builder.append("\"LegSecurityAltIDSource\": \"");
            appendBuffer(builder, legSecurityAltIDSource, legSecurityAltIDSourceOffset, legSecurityAltIDSourceLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public LegSecurityAltIDGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((LegSecurityAltIDGroupEncoder)encoder);
    }

    public LegSecurityAltIDGroupEncoder copyTo(final LegSecurityAltIDGroupEncoder encoder)
    {
        encoder.reset();
        if (hasLegSecurityAltID())
        {
            encoder.legSecurityAltIDAsCopy(legSecurityAltID.byteArray(), 0, legSecurityAltIDLength);
        }

        if (hasLegSecurityAltIDSource())
        {
            encoder.legSecurityAltIDSourceAsCopy(legSecurityAltIDSource.byteArray(), 0, legSecurityAltIDSourceLength);
        }
        return encoder;
    }

}
    private int noLegSecurityAltIDGroupCounter;

    private boolean hasNoLegSecurityAltIDGroupCounter;

    public boolean hasNoLegSecurityAltIDGroupCounter()
    {
        return hasNoLegSecurityAltIDGroupCounter;
    }

    public LegSecAltIDGrpEncoder noLegSecurityAltIDGroupCounter(int value)
    {
        noLegSecurityAltIDGroupCounter = value;
        hasNoLegSecurityAltIDGroupCounter = true;
        return this;
    }

    public int noLegSecurityAltIDGroupCounter()
    {
        return noLegSecurityAltIDGroupCounter;
    }


    private LegSecurityAltIDGroupEncoder legSecurityAltIDGroup = null;

    public LegSecurityAltIDGroupEncoder legSecurityAltIDGroup(final int numberOfElements)
    {
        hasNoLegSecurityAltIDGroupCounter = true;
        noLegSecurityAltIDGroupCounter = numberOfElements;
        if (legSecurityAltIDGroup == null)
        {
            legSecurityAltIDGroup = new LegSecurityAltIDGroupEncoder();
        }
        return legSecurityAltIDGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoLegSecurityAltIDGroupCounter)
        {
            buffer.putBytes(position, noLegSecurityAltIDGroupCounterHeader, 0, noLegSecurityAltIDGroupCounterHeaderLength);
            position += noLegSecurityAltIDGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noLegSecurityAltIDGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (legSecurityAltIDGroup != null)
        {
            position += legSecurityAltIDGroup.encode(buffer, position, noLegSecurityAltIDGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetLegSecurityAltIDGroup();
    }

    public void resetLegSecurityAltIDGroup()
    {
        if (legSecurityAltIDGroup != null)
        {
            legSecurityAltIDGroup.reset();
        }
        noLegSecurityAltIDGroupCounter = 0;
        hasNoLegSecurityAltIDGroupCounter = false;
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
        builder.append("\"MessageName\": \"LegSecAltIDGrp\",\n");
        if (hasNoLegSecurityAltIDGroupCounter)
        {
            indent(builder, level);
            builder.append("\"LegSecurityAltIDGroup\": [\n");
            final int noLegSecurityAltIDGroupCounter = this.noLegSecurityAltIDGroupCounter;
            LegSecurityAltIDGroupEncoder legSecurityAltIDGroup = this.legSecurityAltIDGroup;
            for (int i = 0; i < noLegSecurityAltIDGroupCounter; i++)
            {
                indent(builder, level);
                legSecurityAltIDGroup.appendTo(builder, level + 1);
                if (i < (noLegSecurityAltIDGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                legSecurityAltIDGroup = legSecurityAltIDGroup.next();
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
    public LegSecAltIDGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((LegSecAltIDGrpEncoder)encoder);
    }

    public LegSecAltIDGrpEncoder copyTo(final LegSecAltIDGrpEncoder encoder)
    {
        encoder.reset();
        if (hasNoLegSecurityAltIDGroupCounter)
        {
            final int size = this.noLegSecurityAltIDGroupCounter;
            LegSecurityAltIDGroupEncoder legSecurityAltIDGroup = this.legSecurityAltIDGroup;
            LegSecurityAltIDGroupEncoder legSecurityAltIDGroupEncoder = encoder.legSecurityAltIDGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (legSecurityAltIDGroup != null)
                {
                    legSecurityAltIDGroup.copyTo(legSecurityAltIDGroupEncoder);
                    legSecurityAltIDGroup = legSecurityAltIDGroup.next();
                    legSecurityAltIDGroupEncoder = legSecurityAltIDGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
