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


public class InstrumentPartiesEncoder
{
    private static final int noInstrumentPartiesGroupCounterHeaderLength = 5;
    private static final byte[] noInstrumentPartiesGroupCounterHeader = new byte[] {49, 48, 49, 56, (byte) '='};



public static class InstrumentPartiesGroupEncoder
{
    private InstrumentPartiesGroupEncoder next = null;

    public InstrumentPartiesGroupEncoder next()
    {
        if (next == null)
        {
            next = new InstrumentPartiesGroupEncoder();
        }
        return next;
    }

    private static final int instrumentPartyIDHeaderLength = 5;
    private static final byte[] instrumentPartyIDHeader = new byte[] {49, 48, 49, 57, (byte) '='};

    private static final int instrumentPartyIDSourceHeaderLength = 5;
    private static final byte[] instrumentPartyIDSourceHeader = new byte[] {49, 48, 53, 48, (byte) '='};

    private static final int instrumentPartyRoleHeaderLength = 5;
    private static final byte[] instrumentPartyRoleHeader = new byte[] {49, 48, 53, 49, (byte) '='};

    private final MutableDirectBuffer instrumentPartyID = new UnsafeBuffer();

    private int instrumentPartyIDOffset = 0;

    private int instrumentPartyIDLength = 0;

    public InstrumentPartiesGroupEncoder instrumentPartyID(final DirectBuffer value, final int offset, final int length)
    {
        instrumentPartyID.wrap(value);
        instrumentPartyIDOffset = offset;
        instrumentPartyIDLength = length;
        return this;
    }

    public InstrumentPartiesGroupEncoder instrumentPartyID(final DirectBuffer value, final int length)
    {
        return instrumentPartyID(value, 0, length);
    }

    public InstrumentPartiesGroupEncoder instrumentPartyID(final DirectBuffer value)
    {
        return instrumentPartyID(value, 0, value.capacity());
    }

    public InstrumentPartiesGroupEncoder instrumentPartyID(final byte[] value, final int offset, final int length)
    {
        instrumentPartyID.wrap(value);
        instrumentPartyIDOffset = offset;
        instrumentPartyIDLength = length;
        return this;
    }

    public InstrumentPartiesGroupEncoder instrumentPartyIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(instrumentPartyID, value, offset, length);
        instrumentPartyIDOffset = offset;
        instrumentPartyIDLength = length;
        return this;
    }

    public InstrumentPartiesGroupEncoder instrumentPartyID(final byte[] value, final int length)
    {
        return instrumentPartyID(value, 0, length);
    }

    public InstrumentPartiesGroupEncoder instrumentPartyID(final byte[] value)
    {
        return instrumentPartyID(value, 0, value.length);
    }

    public boolean hasInstrumentPartyID()
    {
        return instrumentPartyIDLength > 0;
    }

    public MutableDirectBuffer instrumentPartyID()
    {
        return instrumentPartyID;
    }

    public String instrumentPartyIDAsString()
    {
        return instrumentPartyID.getStringWithoutLengthAscii(instrumentPartyIDOffset, instrumentPartyIDLength);
    }

    public InstrumentPartiesGroupEncoder instrumentPartyID(final CharSequence value)
    {
        toBytes(value, instrumentPartyID);
        instrumentPartyIDOffset = 0;
        instrumentPartyIDLength = value.length();
        return this;
    }

    public InstrumentPartiesGroupEncoder instrumentPartyID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            instrumentPartyID.wrap(buffer);
            instrumentPartyIDOffset = value.offset();
            instrumentPartyIDLength = value.length();
        }
        return this;
    }

    public InstrumentPartiesGroupEncoder instrumentPartyID(final char[] value)
    {
        return instrumentPartyID(value, 0, value.length);
    }

    public InstrumentPartiesGroupEncoder instrumentPartyID(final char[] value, final int length)
    {
        return instrumentPartyID(value, 0, length);
    }

    public InstrumentPartiesGroupEncoder instrumentPartyID(final char[] value, final int offset, final int length)
    {
        toBytes(value, instrumentPartyID, offset, length);
        instrumentPartyIDOffset = 0;
        instrumentPartyIDLength = length;
        return this;
    }

    private char instrumentPartyIDSource;

    private boolean hasInstrumentPartyIDSource;

    public boolean hasInstrumentPartyIDSource()
    {
        return hasInstrumentPartyIDSource;
    }

    public InstrumentPartiesGroupEncoder instrumentPartyIDSource(char value)
    {
        instrumentPartyIDSource = value;
        hasInstrumentPartyIDSource = true;
        return this;
    }

    public char instrumentPartyIDSource()
    {
        return instrumentPartyIDSource;
    }

    private int instrumentPartyRole;

    private boolean hasInstrumentPartyRole;

    public boolean hasInstrumentPartyRole()
    {
        return hasInstrumentPartyRole;
    }

    public InstrumentPartiesGroupEncoder instrumentPartyRole(int value)
    {
        instrumentPartyRole = value;
        hasInstrumentPartyRole = true;
        return this;
    }

    public int instrumentPartyRole()
    {
        return instrumentPartyRole;
    }

    private final InstrumentPtysSubGrpEncoder instrumentPtysSubGrp = new InstrumentPtysSubGrpEncoder();
    public InstrumentPtysSubGrpEncoder instrumentPtysSubGrp()
    {
        return instrumentPtysSubGrp;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (instrumentPartyIDLength > 0)
        {
            buffer.putBytes(position, instrumentPartyIDHeader, 0, instrumentPartyIDHeaderLength);
            position += instrumentPartyIDHeaderLength;
            buffer.putBytes(position, instrumentPartyID, instrumentPartyIDOffset, instrumentPartyIDLength);
            position += instrumentPartyIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasInstrumentPartyIDSource)
        {
            buffer.putBytes(position, instrumentPartyIDSourceHeader, 0, instrumentPartyIDSourceHeaderLength);
            position += instrumentPartyIDSourceHeaderLength;
            position += buffer.putCharAscii(position, instrumentPartyIDSource);
            buffer.putSeparator(position);
            position++;
        }

        if (hasInstrumentPartyRole)
        {
            buffer.putBytes(position, instrumentPartyRoleHeader, 0, instrumentPartyRoleHeaderLength);
            position += instrumentPartyRoleHeaderLength;
            position += buffer.putIntAscii(position, instrumentPartyRole);
            buffer.putSeparator(position);
            position++;
        }

            position += instrumentPtysSubGrp.encode(buffer, position);
        if (next != null)
        {
            position += next.encode(buffer, position, remainingElements - 1);
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetInstrumentPartyID();
        this.resetInstrumentPartyIDSource();
        this.resetInstrumentPartyRole();
        instrumentPtysSubGrp.reset();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetInstrumentPartyID()
    {
        instrumentPartyIDLength = 0;
    }

    public void resetInstrumentPartyIDSource()
    {
        hasInstrumentPartyIDSource = false;
    }

    public void resetInstrumentPartyRole()
    {
        hasInstrumentPartyRole = false;
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
        builder.append("\"MessageName\": \"InstrumentPartiesGroup\",\n");
        if (hasInstrumentPartyID())
        {
            indent(builder, level);
            builder.append("\"InstrumentPartyID\": \"");
            appendBuffer(builder, instrumentPartyID, instrumentPartyIDOffset, instrumentPartyIDLength);
            builder.append("\",\n");
        }

        if (hasInstrumentPartyIDSource())
        {
            indent(builder, level);
            builder.append("\"InstrumentPartyIDSource\": \"");
            builder.append(instrumentPartyIDSource);
            builder.append("\",\n");
        }

        if (hasInstrumentPartyRole())
        {
            indent(builder, level);
            builder.append("\"InstrumentPartyRole\": \"");
            builder.append(instrumentPartyRole);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"InstrumentPtysSubGrp\": ");
    instrumentPtysSubGrp.appendTo(builder, level + 1);
    builder.append("\n");
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public InstrumentPartiesGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((InstrumentPartiesGroupEncoder)encoder);
    }

    public InstrumentPartiesGroupEncoder copyTo(final InstrumentPartiesGroupEncoder encoder)
    {
        encoder.reset();
        if (hasInstrumentPartyID())
        {
            encoder.instrumentPartyIDAsCopy(instrumentPartyID.byteArray(), 0, instrumentPartyIDLength);
        }

        if (hasInstrumentPartyIDSource())
        {
            encoder.instrumentPartyIDSource(this.instrumentPartyIDSource());
        }

        if (hasInstrumentPartyRole())
        {
            encoder.instrumentPartyRole(this.instrumentPartyRole());
        }


        instrumentPtysSubGrp.copyTo(encoder.instrumentPtysSubGrp());        return encoder;
    }

}
    private int noInstrumentPartiesGroupCounter;

    private boolean hasNoInstrumentPartiesGroupCounter;

    public boolean hasNoInstrumentPartiesGroupCounter()
    {
        return hasNoInstrumentPartiesGroupCounter;
    }

    public InstrumentPartiesEncoder noInstrumentPartiesGroupCounter(int value)
    {
        noInstrumentPartiesGroupCounter = value;
        hasNoInstrumentPartiesGroupCounter = true;
        return this;
    }

    public int noInstrumentPartiesGroupCounter()
    {
        return noInstrumentPartiesGroupCounter;
    }


    private InstrumentPartiesGroupEncoder instrumentPartiesGroup = null;

    public InstrumentPartiesGroupEncoder instrumentPartiesGroup(final int numberOfElements)
    {
        hasNoInstrumentPartiesGroupCounter = true;
        noInstrumentPartiesGroupCounter = numberOfElements;
        if (instrumentPartiesGroup == null)
        {
            instrumentPartiesGroup = new InstrumentPartiesGroupEncoder();
        }
        return instrumentPartiesGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoInstrumentPartiesGroupCounter)
        {
            buffer.putBytes(position, noInstrumentPartiesGroupCounterHeader, 0, noInstrumentPartiesGroupCounterHeaderLength);
            position += noInstrumentPartiesGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noInstrumentPartiesGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (instrumentPartiesGroup != null)
        {
            position += instrumentPartiesGroup.encode(buffer, position, noInstrumentPartiesGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetInstrumentPartiesGroup();
    }

    public void resetInstrumentPartiesGroup()
    {
        if (instrumentPartiesGroup != null)
        {
            instrumentPartiesGroup.reset();
        }
        noInstrumentPartiesGroupCounter = 0;
        hasNoInstrumentPartiesGroupCounter = false;
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
        builder.append("\"MessageName\": \"InstrumentParties\",\n");
        if (hasNoInstrumentPartiesGroupCounter)
        {
            indent(builder, level);
            builder.append("\"InstrumentPartiesGroup\": [\n");
            final int noInstrumentPartiesGroupCounter = this.noInstrumentPartiesGroupCounter;
            InstrumentPartiesGroupEncoder instrumentPartiesGroup = this.instrumentPartiesGroup;
            for (int i = 0; i < noInstrumentPartiesGroupCounter; i++)
            {
                indent(builder, level);
                instrumentPartiesGroup.appendTo(builder, level + 1);
                if (i < (noInstrumentPartiesGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                instrumentPartiesGroup = instrumentPartiesGroup.next();
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
    public InstrumentPartiesEncoder copyTo(final Encoder encoder)
    {
        return copyTo((InstrumentPartiesEncoder)encoder);
    }

    public InstrumentPartiesEncoder copyTo(final InstrumentPartiesEncoder encoder)
    {
        encoder.reset();
        if (hasNoInstrumentPartiesGroupCounter)
        {
            final int size = this.noInstrumentPartiesGroupCounter;
            InstrumentPartiesGroupEncoder instrumentPartiesGroup = this.instrumentPartiesGroup;
            InstrumentPartiesGroupEncoder instrumentPartiesGroupEncoder = encoder.instrumentPartiesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (instrumentPartiesGroup != null)
                {
                    instrumentPartiesGroup.copyTo(instrumentPartiesGroupEncoder);
                    instrumentPartiesGroup = instrumentPartiesGroup.next();
                    instrumentPartiesGroupEncoder = instrumentPartiesGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
