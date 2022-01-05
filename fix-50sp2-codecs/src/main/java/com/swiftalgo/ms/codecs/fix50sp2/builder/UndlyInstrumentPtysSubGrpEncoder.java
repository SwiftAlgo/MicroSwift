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


public class UndlyInstrumentPtysSubGrpEncoder
{
    private static final int noUndlyInstrumentPartySubIDsGroupCounterHeaderLength = 5;
    private static final byte[] noUndlyInstrumentPartySubIDsGroupCounterHeader = new byte[] {49, 48, 54, 50, (byte) '='};



public static class UndlyInstrumentPartySubIDsGroupEncoder
{
    private UndlyInstrumentPartySubIDsGroupEncoder next = null;

    public UndlyInstrumentPartySubIDsGroupEncoder next()
    {
        if (next == null)
        {
            next = new UndlyInstrumentPartySubIDsGroupEncoder();
        }
        return next;
    }

    private static final int underlyingInstrumentPartySubIDHeaderLength = 5;
    private static final byte[] underlyingInstrumentPartySubIDHeader = new byte[] {49, 48, 54, 51, (byte) '='};

    private static final int underlyingInstrumentPartySubIDTypeHeaderLength = 5;
    private static final byte[] underlyingInstrumentPartySubIDTypeHeader = new byte[] {49, 48, 54, 52, (byte) '='};

    private final MutableDirectBuffer underlyingInstrumentPartySubID = new UnsafeBuffer();

    private int underlyingInstrumentPartySubIDOffset = 0;

    private int underlyingInstrumentPartySubIDLength = 0;

    public UndlyInstrumentPartySubIDsGroupEncoder underlyingInstrumentPartySubID(final DirectBuffer value, final int offset, final int length)
    {
        underlyingInstrumentPartySubID.wrap(value);
        underlyingInstrumentPartySubIDOffset = offset;
        underlyingInstrumentPartySubIDLength = length;
        return this;
    }

    public UndlyInstrumentPartySubIDsGroupEncoder underlyingInstrumentPartySubID(final DirectBuffer value, final int length)
    {
        return underlyingInstrumentPartySubID(value, 0, length);
    }

    public UndlyInstrumentPartySubIDsGroupEncoder underlyingInstrumentPartySubID(final DirectBuffer value)
    {
        return underlyingInstrumentPartySubID(value, 0, value.capacity());
    }

    public UndlyInstrumentPartySubIDsGroupEncoder underlyingInstrumentPartySubID(final byte[] value, final int offset, final int length)
    {
        underlyingInstrumentPartySubID.wrap(value);
        underlyingInstrumentPartySubIDOffset = offset;
        underlyingInstrumentPartySubIDLength = length;
        return this;
    }

    public UndlyInstrumentPartySubIDsGroupEncoder underlyingInstrumentPartySubIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(underlyingInstrumentPartySubID, value, offset, length);
        underlyingInstrumentPartySubIDOffset = offset;
        underlyingInstrumentPartySubIDLength = length;
        return this;
    }

    public UndlyInstrumentPartySubIDsGroupEncoder underlyingInstrumentPartySubID(final byte[] value, final int length)
    {
        return underlyingInstrumentPartySubID(value, 0, length);
    }

    public UndlyInstrumentPartySubIDsGroupEncoder underlyingInstrumentPartySubID(final byte[] value)
    {
        return underlyingInstrumentPartySubID(value, 0, value.length);
    }

    public boolean hasUnderlyingInstrumentPartySubID()
    {
        return underlyingInstrumentPartySubIDLength > 0;
    }

    public MutableDirectBuffer underlyingInstrumentPartySubID()
    {
        return underlyingInstrumentPartySubID;
    }

    public String underlyingInstrumentPartySubIDAsString()
    {
        return underlyingInstrumentPartySubID.getStringWithoutLengthAscii(underlyingInstrumentPartySubIDOffset, underlyingInstrumentPartySubIDLength);
    }

    public UndlyInstrumentPartySubIDsGroupEncoder underlyingInstrumentPartySubID(final CharSequence value)
    {
        toBytes(value, underlyingInstrumentPartySubID);
        underlyingInstrumentPartySubIDOffset = 0;
        underlyingInstrumentPartySubIDLength = value.length();
        return this;
    }

    public UndlyInstrumentPartySubIDsGroupEncoder underlyingInstrumentPartySubID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            underlyingInstrumentPartySubID.wrap(buffer);
            underlyingInstrumentPartySubIDOffset = value.offset();
            underlyingInstrumentPartySubIDLength = value.length();
        }
        return this;
    }

    public UndlyInstrumentPartySubIDsGroupEncoder underlyingInstrumentPartySubID(final char[] value)
    {
        return underlyingInstrumentPartySubID(value, 0, value.length);
    }

    public UndlyInstrumentPartySubIDsGroupEncoder underlyingInstrumentPartySubID(final char[] value, final int length)
    {
        return underlyingInstrumentPartySubID(value, 0, length);
    }

    public UndlyInstrumentPartySubIDsGroupEncoder underlyingInstrumentPartySubID(final char[] value, final int offset, final int length)
    {
        toBytes(value, underlyingInstrumentPartySubID, offset, length);
        underlyingInstrumentPartySubIDOffset = 0;
        underlyingInstrumentPartySubIDLength = length;
        return this;
    }

    private int underlyingInstrumentPartySubIDType;

    private boolean hasUnderlyingInstrumentPartySubIDType;

    public boolean hasUnderlyingInstrumentPartySubIDType()
    {
        return hasUnderlyingInstrumentPartySubIDType;
    }

    public UndlyInstrumentPartySubIDsGroupEncoder underlyingInstrumentPartySubIDType(int value)
    {
        underlyingInstrumentPartySubIDType = value;
        hasUnderlyingInstrumentPartySubIDType = true;
        return this;
    }

    public int underlyingInstrumentPartySubIDType()
    {
        return underlyingInstrumentPartySubIDType;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (underlyingInstrumentPartySubIDLength > 0)
        {
            buffer.putBytes(position, underlyingInstrumentPartySubIDHeader, 0, underlyingInstrumentPartySubIDHeaderLength);
            position += underlyingInstrumentPartySubIDHeaderLength;
            buffer.putBytes(position, underlyingInstrumentPartySubID, underlyingInstrumentPartySubIDOffset, underlyingInstrumentPartySubIDLength);
            position += underlyingInstrumentPartySubIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasUnderlyingInstrumentPartySubIDType)
        {
            buffer.putBytes(position, underlyingInstrumentPartySubIDTypeHeader, 0, underlyingInstrumentPartySubIDTypeHeaderLength);
            position += underlyingInstrumentPartySubIDTypeHeaderLength;
            position += buffer.putIntAscii(position, underlyingInstrumentPartySubIDType);
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
        this.resetUnderlyingInstrumentPartySubID();
        this.resetUnderlyingInstrumentPartySubIDType();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetUnderlyingInstrumentPartySubID()
    {
        underlyingInstrumentPartySubIDLength = 0;
    }

    public void resetUnderlyingInstrumentPartySubIDType()
    {
        hasUnderlyingInstrumentPartySubIDType = false;
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
        builder.append("\"MessageName\": \"UndlyInstrumentPartySubIDsGroup\",\n");
        if (hasUnderlyingInstrumentPartySubID())
        {
            indent(builder, level);
            builder.append("\"UnderlyingInstrumentPartySubID\": \"");
            appendBuffer(builder, underlyingInstrumentPartySubID, underlyingInstrumentPartySubIDOffset, underlyingInstrumentPartySubIDLength);
            builder.append("\",\n");
        }

        if (hasUnderlyingInstrumentPartySubIDType())
        {
            indent(builder, level);
            builder.append("\"UnderlyingInstrumentPartySubIDType\": \"");
            builder.append(underlyingInstrumentPartySubIDType);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public UndlyInstrumentPartySubIDsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((UndlyInstrumentPartySubIDsGroupEncoder)encoder);
    }

    public UndlyInstrumentPartySubIDsGroupEncoder copyTo(final UndlyInstrumentPartySubIDsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasUnderlyingInstrumentPartySubID())
        {
            encoder.underlyingInstrumentPartySubIDAsCopy(underlyingInstrumentPartySubID.byteArray(), 0, underlyingInstrumentPartySubIDLength);
        }

        if (hasUnderlyingInstrumentPartySubIDType())
        {
            encoder.underlyingInstrumentPartySubIDType(this.underlyingInstrumentPartySubIDType());
        }
        return encoder;
    }

}
    private int noUndlyInstrumentPartySubIDsGroupCounter;

    private boolean hasNoUndlyInstrumentPartySubIDsGroupCounter;

    public boolean hasNoUndlyInstrumentPartySubIDsGroupCounter()
    {
        return hasNoUndlyInstrumentPartySubIDsGroupCounter;
    }

    public UndlyInstrumentPtysSubGrpEncoder noUndlyInstrumentPartySubIDsGroupCounter(int value)
    {
        noUndlyInstrumentPartySubIDsGroupCounter = value;
        hasNoUndlyInstrumentPartySubIDsGroupCounter = true;
        return this;
    }

    public int noUndlyInstrumentPartySubIDsGroupCounter()
    {
        return noUndlyInstrumentPartySubIDsGroupCounter;
    }


    private UndlyInstrumentPartySubIDsGroupEncoder undlyInstrumentPartySubIDsGroup = null;

    public UndlyInstrumentPartySubIDsGroupEncoder undlyInstrumentPartySubIDsGroup(final int numberOfElements)
    {
        hasNoUndlyInstrumentPartySubIDsGroupCounter = true;
        noUndlyInstrumentPartySubIDsGroupCounter = numberOfElements;
        if (undlyInstrumentPartySubIDsGroup == null)
        {
            undlyInstrumentPartySubIDsGroup = new UndlyInstrumentPartySubIDsGroupEncoder();
        }
        return undlyInstrumentPartySubIDsGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoUndlyInstrumentPartySubIDsGroupCounter)
        {
            buffer.putBytes(position, noUndlyInstrumentPartySubIDsGroupCounterHeader, 0, noUndlyInstrumentPartySubIDsGroupCounterHeaderLength);
            position += noUndlyInstrumentPartySubIDsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noUndlyInstrumentPartySubIDsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (undlyInstrumentPartySubIDsGroup != null)
        {
            position += undlyInstrumentPartySubIDsGroup.encode(buffer, position, noUndlyInstrumentPartySubIDsGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetUndlyInstrumentPartySubIDsGroup();
    }

    public void resetUndlyInstrumentPartySubIDsGroup()
    {
        if (undlyInstrumentPartySubIDsGroup != null)
        {
            undlyInstrumentPartySubIDsGroup.reset();
        }
        noUndlyInstrumentPartySubIDsGroupCounter = 0;
        hasNoUndlyInstrumentPartySubIDsGroupCounter = false;
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
        builder.append("\"MessageName\": \"UndlyInstrumentPtysSubGrp\",\n");
        if (hasNoUndlyInstrumentPartySubIDsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"UndlyInstrumentPartySubIDsGroup\": [\n");
            final int noUndlyInstrumentPartySubIDsGroupCounter = this.noUndlyInstrumentPartySubIDsGroupCounter;
            UndlyInstrumentPartySubIDsGroupEncoder undlyInstrumentPartySubIDsGroup = this.undlyInstrumentPartySubIDsGroup;
            for (int i = 0; i < noUndlyInstrumentPartySubIDsGroupCounter; i++)
            {
                indent(builder, level);
                undlyInstrumentPartySubIDsGroup.appendTo(builder, level + 1);
                if (i < (noUndlyInstrumentPartySubIDsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                undlyInstrumentPartySubIDsGroup = undlyInstrumentPartySubIDsGroup.next();
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
    public UndlyInstrumentPtysSubGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((UndlyInstrumentPtysSubGrpEncoder)encoder);
    }

    public UndlyInstrumentPtysSubGrpEncoder copyTo(final UndlyInstrumentPtysSubGrpEncoder encoder)
    {
        encoder.reset();
        if (hasNoUndlyInstrumentPartySubIDsGroupCounter)
        {
            final int size = this.noUndlyInstrumentPartySubIDsGroupCounter;
            UndlyInstrumentPartySubIDsGroupEncoder undlyInstrumentPartySubIDsGroup = this.undlyInstrumentPartySubIDsGroup;
            UndlyInstrumentPartySubIDsGroupEncoder undlyInstrumentPartySubIDsGroupEncoder = encoder.undlyInstrumentPartySubIDsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (undlyInstrumentPartySubIDsGroup != null)
                {
                    undlyInstrumentPartySubIDsGroup.copyTo(undlyInstrumentPartySubIDsGroupEncoder);
                    undlyInstrumentPartySubIDsGroup = undlyInstrumentPartySubIDsGroup.next();
                    undlyInstrumentPartySubIDsGroupEncoder = undlyInstrumentPartySubIDsGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
