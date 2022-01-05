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


public class InstrumentPtysSubGrpEncoder
{
    private static final int noInstrumentPartySubIDsGroupCounterHeaderLength = 5;
    private static final byte[] noInstrumentPartySubIDsGroupCounterHeader = new byte[] {49, 48, 53, 50, (byte) '='};



public static class InstrumentPartySubIDsGroupEncoder
{
    private InstrumentPartySubIDsGroupEncoder next = null;

    public InstrumentPartySubIDsGroupEncoder next()
    {
        if (next == null)
        {
            next = new InstrumentPartySubIDsGroupEncoder();
        }
        return next;
    }

    private static final int instrumentPartySubIDHeaderLength = 5;
    private static final byte[] instrumentPartySubIDHeader = new byte[] {49, 48, 53, 51, (byte) '='};

    private static final int instrumentPartySubIDTypeHeaderLength = 5;
    private static final byte[] instrumentPartySubIDTypeHeader = new byte[] {49, 48, 53, 52, (byte) '='};

    private final MutableDirectBuffer instrumentPartySubID = new UnsafeBuffer();

    private int instrumentPartySubIDOffset = 0;

    private int instrumentPartySubIDLength = 0;

    public InstrumentPartySubIDsGroupEncoder instrumentPartySubID(final DirectBuffer value, final int offset, final int length)
    {
        instrumentPartySubID.wrap(value);
        instrumentPartySubIDOffset = offset;
        instrumentPartySubIDLength = length;
        return this;
    }

    public InstrumentPartySubIDsGroupEncoder instrumentPartySubID(final DirectBuffer value, final int length)
    {
        return instrumentPartySubID(value, 0, length);
    }

    public InstrumentPartySubIDsGroupEncoder instrumentPartySubID(final DirectBuffer value)
    {
        return instrumentPartySubID(value, 0, value.capacity());
    }

    public InstrumentPartySubIDsGroupEncoder instrumentPartySubID(final byte[] value, final int offset, final int length)
    {
        instrumentPartySubID.wrap(value);
        instrumentPartySubIDOffset = offset;
        instrumentPartySubIDLength = length;
        return this;
    }

    public InstrumentPartySubIDsGroupEncoder instrumentPartySubIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(instrumentPartySubID, value, offset, length);
        instrumentPartySubIDOffset = offset;
        instrumentPartySubIDLength = length;
        return this;
    }

    public InstrumentPartySubIDsGroupEncoder instrumentPartySubID(final byte[] value, final int length)
    {
        return instrumentPartySubID(value, 0, length);
    }

    public InstrumentPartySubIDsGroupEncoder instrumentPartySubID(final byte[] value)
    {
        return instrumentPartySubID(value, 0, value.length);
    }

    public boolean hasInstrumentPartySubID()
    {
        return instrumentPartySubIDLength > 0;
    }

    public MutableDirectBuffer instrumentPartySubID()
    {
        return instrumentPartySubID;
    }

    public String instrumentPartySubIDAsString()
    {
        return instrumentPartySubID.getStringWithoutLengthAscii(instrumentPartySubIDOffset, instrumentPartySubIDLength);
    }

    public InstrumentPartySubIDsGroupEncoder instrumentPartySubID(final CharSequence value)
    {
        toBytes(value, instrumentPartySubID);
        instrumentPartySubIDOffset = 0;
        instrumentPartySubIDLength = value.length();
        return this;
    }

    public InstrumentPartySubIDsGroupEncoder instrumentPartySubID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            instrumentPartySubID.wrap(buffer);
            instrumentPartySubIDOffset = value.offset();
            instrumentPartySubIDLength = value.length();
        }
        return this;
    }

    public InstrumentPartySubIDsGroupEncoder instrumentPartySubID(final char[] value)
    {
        return instrumentPartySubID(value, 0, value.length);
    }

    public InstrumentPartySubIDsGroupEncoder instrumentPartySubID(final char[] value, final int length)
    {
        return instrumentPartySubID(value, 0, length);
    }

    public InstrumentPartySubIDsGroupEncoder instrumentPartySubID(final char[] value, final int offset, final int length)
    {
        toBytes(value, instrumentPartySubID, offset, length);
        instrumentPartySubIDOffset = 0;
        instrumentPartySubIDLength = length;
        return this;
    }

    private int instrumentPartySubIDType;

    private boolean hasInstrumentPartySubIDType;

    public boolean hasInstrumentPartySubIDType()
    {
        return hasInstrumentPartySubIDType;
    }

    public InstrumentPartySubIDsGroupEncoder instrumentPartySubIDType(int value)
    {
        instrumentPartySubIDType = value;
        hasInstrumentPartySubIDType = true;
        return this;
    }

    public int instrumentPartySubIDType()
    {
        return instrumentPartySubIDType;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (instrumentPartySubIDLength > 0)
        {
            buffer.putBytes(position, instrumentPartySubIDHeader, 0, instrumentPartySubIDHeaderLength);
            position += instrumentPartySubIDHeaderLength;
            buffer.putBytes(position, instrumentPartySubID, instrumentPartySubIDOffset, instrumentPartySubIDLength);
            position += instrumentPartySubIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasInstrumentPartySubIDType)
        {
            buffer.putBytes(position, instrumentPartySubIDTypeHeader, 0, instrumentPartySubIDTypeHeaderLength);
            position += instrumentPartySubIDTypeHeaderLength;
            position += buffer.putIntAscii(position, instrumentPartySubIDType);
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
        this.resetInstrumentPartySubID();
        this.resetInstrumentPartySubIDType();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetInstrumentPartySubID()
    {
        instrumentPartySubIDLength = 0;
    }

    public void resetInstrumentPartySubIDType()
    {
        hasInstrumentPartySubIDType = false;
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
        builder.append("\"MessageName\": \"InstrumentPartySubIDsGroup\",\n");
        if (hasInstrumentPartySubID())
        {
            indent(builder, level);
            builder.append("\"InstrumentPartySubID\": \"");
            appendBuffer(builder, instrumentPartySubID, instrumentPartySubIDOffset, instrumentPartySubIDLength);
            builder.append("\",\n");
        }

        if (hasInstrumentPartySubIDType())
        {
            indent(builder, level);
            builder.append("\"InstrumentPartySubIDType\": \"");
            builder.append(instrumentPartySubIDType);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public InstrumentPartySubIDsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((InstrumentPartySubIDsGroupEncoder)encoder);
    }

    public InstrumentPartySubIDsGroupEncoder copyTo(final InstrumentPartySubIDsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasInstrumentPartySubID())
        {
            encoder.instrumentPartySubIDAsCopy(instrumentPartySubID.byteArray(), 0, instrumentPartySubIDLength);
        }

        if (hasInstrumentPartySubIDType())
        {
            encoder.instrumentPartySubIDType(this.instrumentPartySubIDType());
        }
        return encoder;
    }

}
    private int noInstrumentPartySubIDsGroupCounter;

    private boolean hasNoInstrumentPartySubIDsGroupCounter;

    public boolean hasNoInstrumentPartySubIDsGroupCounter()
    {
        return hasNoInstrumentPartySubIDsGroupCounter;
    }

    public InstrumentPtysSubGrpEncoder noInstrumentPartySubIDsGroupCounter(int value)
    {
        noInstrumentPartySubIDsGroupCounter = value;
        hasNoInstrumentPartySubIDsGroupCounter = true;
        return this;
    }

    public int noInstrumentPartySubIDsGroupCounter()
    {
        return noInstrumentPartySubIDsGroupCounter;
    }


    private InstrumentPartySubIDsGroupEncoder instrumentPartySubIDsGroup = null;

    public InstrumentPartySubIDsGroupEncoder instrumentPartySubIDsGroup(final int numberOfElements)
    {
        hasNoInstrumentPartySubIDsGroupCounter = true;
        noInstrumentPartySubIDsGroupCounter = numberOfElements;
        if (instrumentPartySubIDsGroup == null)
        {
            instrumentPartySubIDsGroup = new InstrumentPartySubIDsGroupEncoder();
        }
        return instrumentPartySubIDsGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoInstrumentPartySubIDsGroupCounter)
        {
            buffer.putBytes(position, noInstrumentPartySubIDsGroupCounterHeader, 0, noInstrumentPartySubIDsGroupCounterHeaderLength);
            position += noInstrumentPartySubIDsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noInstrumentPartySubIDsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (instrumentPartySubIDsGroup != null)
        {
            position += instrumentPartySubIDsGroup.encode(buffer, position, noInstrumentPartySubIDsGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetInstrumentPartySubIDsGroup();
    }

    public void resetInstrumentPartySubIDsGroup()
    {
        if (instrumentPartySubIDsGroup != null)
        {
            instrumentPartySubIDsGroup.reset();
        }
        noInstrumentPartySubIDsGroupCounter = 0;
        hasNoInstrumentPartySubIDsGroupCounter = false;
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
        builder.append("\"MessageName\": \"InstrumentPtysSubGrp\",\n");
        if (hasNoInstrumentPartySubIDsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"InstrumentPartySubIDsGroup\": [\n");
            final int noInstrumentPartySubIDsGroupCounter = this.noInstrumentPartySubIDsGroupCounter;
            InstrumentPartySubIDsGroupEncoder instrumentPartySubIDsGroup = this.instrumentPartySubIDsGroup;
            for (int i = 0; i < noInstrumentPartySubIDsGroupCounter; i++)
            {
                indent(builder, level);
                instrumentPartySubIDsGroup.appendTo(builder, level + 1);
                if (i < (noInstrumentPartySubIDsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                instrumentPartySubIDsGroup = instrumentPartySubIDsGroup.next();
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
    public InstrumentPtysSubGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((InstrumentPtysSubGrpEncoder)encoder);
    }

    public InstrumentPtysSubGrpEncoder copyTo(final InstrumentPtysSubGrpEncoder encoder)
    {
        encoder.reset();
        if (hasNoInstrumentPartySubIDsGroupCounter)
        {
            final int size = this.noInstrumentPartySubIDsGroupCounter;
            InstrumentPartySubIDsGroupEncoder instrumentPartySubIDsGroup = this.instrumentPartySubIDsGroup;
            InstrumentPartySubIDsGroupEncoder instrumentPartySubIDsGroupEncoder = encoder.instrumentPartySubIDsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (instrumentPartySubIDsGroup != null)
                {
                    instrumentPartySubIDsGroup.copyTo(instrumentPartySubIDsGroupEncoder);
                    instrumentPartySubIDsGroup = instrumentPartySubIDsGroup.next();
                    instrumentPartySubIDsGroupEncoder = instrumentPartySubIDsGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
