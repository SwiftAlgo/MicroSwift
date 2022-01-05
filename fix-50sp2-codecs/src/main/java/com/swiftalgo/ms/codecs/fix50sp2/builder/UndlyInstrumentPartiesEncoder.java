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


public class UndlyInstrumentPartiesEncoder
{
    private static final int noUndlyInstrumentPartiesGroupCounterHeaderLength = 5;
    private static final byte[] noUndlyInstrumentPartiesGroupCounterHeader = new byte[] {49, 48, 53, 56, (byte) '='};



public static class UndlyInstrumentPartiesGroupEncoder
{
    private UndlyInstrumentPartiesGroupEncoder next = null;

    public UndlyInstrumentPartiesGroupEncoder next()
    {
        if (next == null)
        {
            next = new UndlyInstrumentPartiesGroupEncoder();
        }
        return next;
    }

    private static final int underlyingInstrumentPartyIDHeaderLength = 5;
    private static final byte[] underlyingInstrumentPartyIDHeader = new byte[] {49, 48, 53, 57, (byte) '='};

    private static final int underlyingInstrumentPartyIDSourceHeaderLength = 5;
    private static final byte[] underlyingInstrumentPartyIDSourceHeader = new byte[] {49, 48, 54, 48, (byte) '='};

    private static final int underlyingInstrumentPartyRoleHeaderLength = 5;
    private static final byte[] underlyingInstrumentPartyRoleHeader = new byte[] {49, 48, 54, 49, (byte) '='};

    private final MutableDirectBuffer underlyingInstrumentPartyID = new UnsafeBuffer();

    private int underlyingInstrumentPartyIDOffset = 0;

    private int underlyingInstrumentPartyIDLength = 0;

    public UndlyInstrumentPartiesGroupEncoder underlyingInstrumentPartyID(final DirectBuffer value, final int offset, final int length)
    {
        underlyingInstrumentPartyID.wrap(value);
        underlyingInstrumentPartyIDOffset = offset;
        underlyingInstrumentPartyIDLength = length;
        return this;
    }

    public UndlyInstrumentPartiesGroupEncoder underlyingInstrumentPartyID(final DirectBuffer value, final int length)
    {
        return underlyingInstrumentPartyID(value, 0, length);
    }

    public UndlyInstrumentPartiesGroupEncoder underlyingInstrumentPartyID(final DirectBuffer value)
    {
        return underlyingInstrumentPartyID(value, 0, value.capacity());
    }

    public UndlyInstrumentPartiesGroupEncoder underlyingInstrumentPartyID(final byte[] value, final int offset, final int length)
    {
        underlyingInstrumentPartyID.wrap(value);
        underlyingInstrumentPartyIDOffset = offset;
        underlyingInstrumentPartyIDLength = length;
        return this;
    }

    public UndlyInstrumentPartiesGroupEncoder underlyingInstrumentPartyIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(underlyingInstrumentPartyID, value, offset, length);
        underlyingInstrumentPartyIDOffset = offset;
        underlyingInstrumentPartyIDLength = length;
        return this;
    }

    public UndlyInstrumentPartiesGroupEncoder underlyingInstrumentPartyID(final byte[] value, final int length)
    {
        return underlyingInstrumentPartyID(value, 0, length);
    }

    public UndlyInstrumentPartiesGroupEncoder underlyingInstrumentPartyID(final byte[] value)
    {
        return underlyingInstrumentPartyID(value, 0, value.length);
    }

    public boolean hasUnderlyingInstrumentPartyID()
    {
        return underlyingInstrumentPartyIDLength > 0;
    }

    public MutableDirectBuffer underlyingInstrumentPartyID()
    {
        return underlyingInstrumentPartyID;
    }

    public String underlyingInstrumentPartyIDAsString()
    {
        return underlyingInstrumentPartyID.getStringWithoutLengthAscii(underlyingInstrumentPartyIDOffset, underlyingInstrumentPartyIDLength);
    }

    public UndlyInstrumentPartiesGroupEncoder underlyingInstrumentPartyID(final CharSequence value)
    {
        toBytes(value, underlyingInstrumentPartyID);
        underlyingInstrumentPartyIDOffset = 0;
        underlyingInstrumentPartyIDLength = value.length();
        return this;
    }

    public UndlyInstrumentPartiesGroupEncoder underlyingInstrumentPartyID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            underlyingInstrumentPartyID.wrap(buffer);
            underlyingInstrumentPartyIDOffset = value.offset();
            underlyingInstrumentPartyIDLength = value.length();
        }
        return this;
    }

    public UndlyInstrumentPartiesGroupEncoder underlyingInstrumentPartyID(final char[] value)
    {
        return underlyingInstrumentPartyID(value, 0, value.length);
    }

    public UndlyInstrumentPartiesGroupEncoder underlyingInstrumentPartyID(final char[] value, final int length)
    {
        return underlyingInstrumentPartyID(value, 0, length);
    }

    public UndlyInstrumentPartiesGroupEncoder underlyingInstrumentPartyID(final char[] value, final int offset, final int length)
    {
        toBytes(value, underlyingInstrumentPartyID, offset, length);
        underlyingInstrumentPartyIDOffset = 0;
        underlyingInstrumentPartyIDLength = length;
        return this;
    }

    private char underlyingInstrumentPartyIDSource;

    private boolean hasUnderlyingInstrumentPartyIDSource;

    public boolean hasUnderlyingInstrumentPartyIDSource()
    {
        return hasUnderlyingInstrumentPartyIDSource;
    }

    public UndlyInstrumentPartiesGroupEncoder underlyingInstrumentPartyIDSource(char value)
    {
        underlyingInstrumentPartyIDSource = value;
        hasUnderlyingInstrumentPartyIDSource = true;
        return this;
    }

    public char underlyingInstrumentPartyIDSource()
    {
        return underlyingInstrumentPartyIDSource;
    }

    private int underlyingInstrumentPartyRole;

    private boolean hasUnderlyingInstrumentPartyRole;

    public boolean hasUnderlyingInstrumentPartyRole()
    {
        return hasUnderlyingInstrumentPartyRole;
    }

    public UndlyInstrumentPartiesGroupEncoder underlyingInstrumentPartyRole(int value)
    {
        underlyingInstrumentPartyRole = value;
        hasUnderlyingInstrumentPartyRole = true;
        return this;
    }

    public int underlyingInstrumentPartyRole()
    {
        return underlyingInstrumentPartyRole;
    }

    private final UndlyInstrumentPtysSubGrpEncoder undlyInstrumentPtysSubGrp = new UndlyInstrumentPtysSubGrpEncoder();
    public UndlyInstrumentPtysSubGrpEncoder undlyInstrumentPtysSubGrp()
    {
        return undlyInstrumentPtysSubGrp;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (underlyingInstrumentPartyIDLength > 0)
        {
            buffer.putBytes(position, underlyingInstrumentPartyIDHeader, 0, underlyingInstrumentPartyIDHeaderLength);
            position += underlyingInstrumentPartyIDHeaderLength;
            buffer.putBytes(position, underlyingInstrumentPartyID, underlyingInstrumentPartyIDOffset, underlyingInstrumentPartyIDLength);
            position += underlyingInstrumentPartyIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasUnderlyingInstrumentPartyIDSource)
        {
            buffer.putBytes(position, underlyingInstrumentPartyIDSourceHeader, 0, underlyingInstrumentPartyIDSourceHeaderLength);
            position += underlyingInstrumentPartyIDSourceHeaderLength;
            position += buffer.putCharAscii(position, underlyingInstrumentPartyIDSource);
            buffer.putSeparator(position);
            position++;
        }

        if (hasUnderlyingInstrumentPartyRole)
        {
            buffer.putBytes(position, underlyingInstrumentPartyRoleHeader, 0, underlyingInstrumentPartyRoleHeaderLength);
            position += underlyingInstrumentPartyRoleHeaderLength;
            position += buffer.putIntAscii(position, underlyingInstrumentPartyRole);
            buffer.putSeparator(position);
            position++;
        }

            position += undlyInstrumentPtysSubGrp.encode(buffer, position);
        if (next != null)
        {
            position += next.encode(buffer, position, remainingElements - 1);
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetUnderlyingInstrumentPartyID();
        this.resetUnderlyingInstrumentPartyIDSource();
        this.resetUnderlyingInstrumentPartyRole();
        undlyInstrumentPtysSubGrp.reset();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetUnderlyingInstrumentPartyID()
    {
        underlyingInstrumentPartyIDLength = 0;
    }

    public void resetUnderlyingInstrumentPartyIDSource()
    {
        hasUnderlyingInstrumentPartyIDSource = false;
    }

    public void resetUnderlyingInstrumentPartyRole()
    {
        hasUnderlyingInstrumentPartyRole = false;
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
        builder.append("\"MessageName\": \"UndlyInstrumentPartiesGroup\",\n");
        if (hasUnderlyingInstrumentPartyID())
        {
            indent(builder, level);
            builder.append("\"UnderlyingInstrumentPartyID\": \"");
            appendBuffer(builder, underlyingInstrumentPartyID, underlyingInstrumentPartyIDOffset, underlyingInstrumentPartyIDLength);
            builder.append("\",\n");
        }

        if (hasUnderlyingInstrumentPartyIDSource())
        {
            indent(builder, level);
            builder.append("\"UnderlyingInstrumentPartyIDSource\": \"");
            builder.append(underlyingInstrumentPartyIDSource);
            builder.append("\",\n");
        }

        if (hasUnderlyingInstrumentPartyRole())
        {
            indent(builder, level);
            builder.append("\"UnderlyingInstrumentPartyRole\": \"");
            builder.append(underlyingInstrumentPartyRole);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"UndlyInstrumentPtysSubGrp\": ");
    undlyInstrumentPtysSubGrp.appendTo(builder, level + 1);
    builder.append("\n");
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public UndlyInstrumentPartiesGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((UndlyInstrumentPartiesGroupEncoder)encoder);
    }

    public UndlyInstrumentPartiesGroupEncoder copyTo(final UndlyInstrumentPartiesGroupEncoder encoder)
    {
        encoder.reset();
        if (hasUnderlyingInstrumentPartyID())
        {
            encoder.underlyingInstrumentPartyIDAsCopy(underlyingInstrumentPartyID.byteArray(), 0, underlyingInstrumentPartyIDLength);
        }

        if (hasUnderlyingInstrumentPartyIDSource())
        {
            encoder.underlyingInstrumentPartyIDSource(this.underlyingInstrumentPartyIDSource());
        }

        if (hasUnderlyingInstrumentPartyRole())
        {
            encoder.underlyingInstrumentPartyRole(this.underlyingInstrumentPartyRole());
        }


        undlyInstrumentPtysSubGrp.copyTo(encoder.undlyInstrumentPtysSubGrp());        return encoder;
    }

}
    private int noUndlyInstrumentPartiesGroupCounter;

    private boolean hasNoUndlyInstrumentPartiesGroupCounter;

    public boolean hasNoUndlyInstrumentPartiesGroupCounter()
    {
        return hasNoUndlyInstrumentPartiesGroupCounter;
    }

    public UndlyInstrumentPartiesEncoder noUndlyInstrumentPartiesGroupCounter(int value)
    {
        noUndlyInstrumentPartiesGroupCounter = value;
        hasNoUndlyInstrumentPartiesGroupCounter = true;
        return this;
    }

    public int noUndlyInstrumentPartiesGroupCounter()
    {
        return noUndlyInstrumentPartiesGroupCounter;
    }


    private UndlyInstrumentPartiesGroupEncoder undlyInstrumentPartiesGroup = null;

    public UndlyInstrumentPartiesGroupEncoder undlyInstrumentPartiesGroup(final int numberOfElements)
    {
        hasNoUndlyInstrumentPartiesGroupCounter = true;
        noUndlyInstrumentPartiesGroupCounter = numberOfElements;
        if (undlyInstrumentPartiesGroup == null)
        {
            undlyInstrumentPartiesGroup = new UndlyInstrumentPartiesGroupEncoder();
        }
        return undlyInstrumentPartiesGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoUndlyInstrumentPartiesGroupCounter)
        {
            buffer.putBytes(position, noUndlyInstrumentPartiesGroupCounterHeader, 0, noUndlyInstrumentPartiesGroupCounterHeaderLength);
            position += noUndlyInstrumentPartiesGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noUndlyInstrumentPartiesGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (undlyInstrumentPartiesGroup != null)
        {
            position += undlyInstrumentPartiesGroup.encode(buffer, position, noUndlyInstrumentPartiesGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetUndlyInstrumentPartiesGroup();
    }

    public void resetUndlyInstrumentPartiesGroup()
    {
        if (undlyInstrumentPartiesGroup != null)
        {
            undlyInstrumentPartiesGroup.reset();
        }
        noUndlyInstrumentPartiesGroupCounter = 0;
        hasNoUndlyInstrumentPartiesGroupCounter = false;
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
        builder.append("\"MessageName\": \"UndlyInstrumentParties\",\n");
        if (hasNoUndlyInstrumentPartiesGroupCounter)
        {
            indent(builder, level);
            builder.append("\"UndlyInstrumentPartiesGroup\": [\n");
            final int noUndlyInstrumentPartiesGroupCounter = this.noUndlyInstrumentPartiesGroupCounter;
            UndlyInstrumentPartiesGroupEncoder undlyInstrumentPartiesGroup = this.undlyInstrumentPartiesGroup;
            for (int i = 0; i < noUndlyInstrumentPartiesGroupCounter; i++)
            {
                indent(builder, level);
                undlyInstrumentPartiesGroup.appendTo(builder, level + 1);
                if (i < (noUndlyInstrumentPartiesGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                undlyInstrumentPartiesGroup = undlyInstrumentPartiesGroup.next();
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
    public UndlyInstrumentPartiesEncoder copyTo(final Encoder encoder)
    {
        return copyTo((UndlyInstrumentPartiesEncoder)encoder);
    }

    public UndlyInstrumentPartiesEncoder copyTo(final UndlyInstrumentPartiesEncoder encoder)
    {
        encoder.reset();
        if (hasNoUndlyInstrumentPartiesGroupCounter)
        {
            final int size = this.noUndlyInstrumentPartiesGroupCounter;
            UndlyInstrumentPartiesGroupEncoder undlyInstrumentPartiesGroup = this.undlyInstrumentPartiesGroup;
            UndlyInstrumentPartiesGroupEncoder undlyInstrumentPartiesGroupEncoder = encoder.undlyInstrumentPartiesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (undlyInstrumentPartiesGroup != null)
                {
                    undlyInstrumentPartiesGroup.copyTo(undlyInstrumentPartiesGroupEncoder);
                    undlyInstrumentPartiesGroup = undlyInstrumentPartiesGroup.next();
                    undlyInstrumentPartiesGroupEncoder = undlyInstrumentPartiesGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
