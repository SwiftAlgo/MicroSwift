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


public class PtysSubGrpEncoder
{
    private static final int noPartySubIDsGroupCounterHeaderLength = 4;
    private static final byte[] noPartySubIDsGroupCounterHeader = new byte[] {56, 48, 50, (byte) '='};



public static class PartySubIDsGroupEncoder
{
    private PartySubIDsGroupEncoder next = null;

    public PartySubIDsGroupEncoder next()
    {
        if (next == null)
        {
            next = new PartySubIDsGroupEncoder();
        }
        return next;
    }

    private static final int partySubIDHeaderLength = 4;
    private static final byte[] partySubIDHeader = new byte[] {53, 50, 51, (byte) '='};

    private static final int partySubIDTypeHeaderLength = 4;
    private static final byte[] partySubIDTypeHeader = new byte[] {56, 48, 51, (byte) '='};

    private final MutableDirectBuffer partySubID = new UnsafeBuffer();

    private int partySubIDOffset = 0;

    private int partySubIDLength = 0;

    public PartySubIDsGroupEncoder partySubID(final DirectBuffer value, final int offset, final int length)
    {
        partySubID.wrap(value);
        partySubIDOffset = offset;
        partySubIDLength = length;
        return this;
    }

    public PartySubIDsGroupEncoder partySubID(final DirectBuffer value, final int length)
    {
        return partySubID(value, 0, length);
    }

    public PartySubIDsGroupEncoder partySubID(final DirectBuffer value)
    {
        return partySubID(value, 0, value.capacity());
    }

    public PartySubIDsGroupEncoder partySubID(final byte[] value, final int offset, final int length)
    {
        partySubID.wrap(value);
        partySubIDOffset = offset;
        partySubIDLength = length;
        return this;
    }

    public PartySubIDsGroupEncoder partySubIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(partySubID, value, offset, length);
        partySubIDOffset = offset;
        partySubIDLength = length;
        return this;
    }

    public PartySubIDsGroupEncoder partySubID(final byte[] value, final int length)
    {
        return partySubID(value, 0, length);
    }

    public PartySubIDsGroupEncoder partySubID(final byte[] value)
    {
        return partySubID(value, 0, value.length);
    }

    public boolean hasPartySubID()
    {
        return partySubIDLength > 0;
    }

    public MutableDirectBuffer partySubID()
    {
        return partySubID;
    }

    public String partySubIDAsString()
    {
        return partySubID.getStringWithoutLengthAscii(partySubIDOffset, partySubIDLength);
    }

    public PartySubIDsGroupEncoder partySubID(final CharSequence value)
    {
        toBytes(value, partySubID);
        partySubIDOffset = 0;
        partySubIDLength = value.length();
        return this;
    }

    public PartySubIDsGroupEncoder partySubID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            partySubID.wrap(buffer);
            partySubIDOffset = value.offset();
            partySubIDLength = value.length();
        }
        return this;
    }

    public PartySubIDsGroupEncoder partySubID(final char[] value)
    {
        return partySubID(value, 0, value.length);
    }

    public PartySubIDsGroupEncoder partySubID(final char[] value, final int length)
    {
        return partySubID(value, 0, length);
    }

    public PartySubIDsGroupEncoder partySubID(final char[] value, final int offset, final int length)
    {
        toBytes(value, partySubID, offset, length);
        partySubIDOffset = 0;
        partySubIDLength = length;
        return this;
    }

    private int partySubIDType;

    private boolean hasPartySubIDType;

    public boolean hasPartySubIDType()
    {
        return hasPartySubIDType;
    }

    public PartySubIDsGroupEncoder partySubIDType(int value)
    {
        partySubIDType = value;
        hasPartySubIDType = true;
        return this;
    }

    public int partySubIDType()
    {
        return partySubIDType;
    }

    public PartySubIDsGroupEncoder partySubIDType(PartySubIDType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == PartySubIDType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: partySubIDType Value: " + value );
            }
            if (value == PartySubIDType.NULL_VAL)
            {
                return this;
            }
        }
        return partySubIDType(value.representation());
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (partySubIDLength > 0)
        {
            buffer.putBytes(position, partySubIDHeader, 0, partySubIDHeaderLength);
            position += partySubIDHeaderLength;
            buffer.putBytes(position, partySubID, partySubIDOffset, partySubIDLength);
            position += partySubIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasPartySubIDType)
        {
            buffer.putBytes(position, partySubIDTypeHeader, 0, partySubIDTypeHeaderLength);
            position += partySubIDTypeHeaderLength;
            position += buffer.putIntAscii(position, partySubIDType);
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
        this.resetPartySubID();
        this.resetPartySubIDType();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetPartySubID()
    {
        partySubIDLength = 0;
    }

    public void resetPartySubIDType()
    {
        hasPartySubIDType = false;
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
        builder.append("\"MessageName\": \"PartySubIDsGroup\",\n");
        if (hasPartySubID())
        {
            indent(builder, level);
            builder.append("\"PartySubID\": \"");
            appendBuffer(builder, partySubID, partySubIDOffset, partySubIDLength);
            builder.append("\",\n");
        }

        if (hasPartySubIDType())
        {
            indent(builder, level);
            builder.append("\"PartySubIDType\": \"");
            builder.append(partySubIDType);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public PartySubIDsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((PartySubIDsGroupEncoder)encoder);
    }

    public PartySubIDsGroupEncoder copyTo(final PartySubIDsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasPartySubID())
        {
            encoder.partySubIDAsCopy(partySubID.byteArray(), 0, partySubIDLength);
        }

        if (hasPartySubIDType())
        {
            encoder.partySubIDType(this.partySubIDType());
        }
        return encoder;
    }

}
    private int noPartySubIDsGroupCounter;

    private boolean hasNoPartySubIDsGroupCounter;

    public boolean hasNoPartySubIDsGroupCounter()
    {
        return hasNoPartySubIDsGroupCounter;
    }

    public PtysSubGrpEncoder noPartySubIDsGroupCounter(int value)
    {
        noPartySubIDsGroupCounter = value;
        hasNoPartySubIDsGroupCounter = true;
        return this;
    }

    public int noPartySubIDsGroupCounter()
    {
        return noPartySubIDsGroupCounter;
    }


    private PartySubIDsGroupEncoder partySubIDsGroup = null;

    public PartySubIDsGroupEncoder partySubIDsGroup(final int numberOfElements)
    {
        hasNoPartySubIDsGroupCounter = true;
        noPartySubIDsGroupCounter = numberOfElements;
        if (partySubIDsGroup == null)
        {
            partySubIDsGroup = new PartySubIDsGroupEncoder();
        }
        return partySubIDsGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoPartySubIDsGroupCounter)
        {
            buffer.putBytes(position, noPartySubIDsGroupCounterHeader, 0, noPartySubIDsGroupCounterHeaderLength);
            position += noPartySubIDsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noPartySubIDsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (partySubIDsGroup != null)
        {
            position += partySubIDsGroup.encode(buffer, position, noPartySubIDsGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetPartySubIDsGroup();
    }

    public void resetPartySubIDsGroup()
    {
        if (partySubIDsGroup != null)
        {
            partySubIDsGroup.reset();
        }
        noPartySubIDsGroupCounter = 0;
        hasNoPartySubIDsGroupCounter = false;
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
        builder.append("\"MessageName\": \"PtysSubGrp\",\n");
        if (hasNoPartySubIDsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"PartySubIDsGroup\": [\n");
            final int noPartySubIDsGroupCounter = this.noPartySubIDsGroupCounter;
            PartySubIDsGroupEncoder partySubIDsGroup = this.partySubIDsGroup;
            for (int i = 0; i < noPartySubIDsGroupCounter; i++)
            {
                indent(builder, level);
                partySubIDsGroup.appendTo(builder, level + 1);
                if (i < (noPartySubIDsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                partySubIDsGroup = partySubIDsGroup.next();
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
    public PtysSubGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((PtysSubGrpEncoder)encoder);
    }

    public PtysSubGrpEncoder copyTo(final PtysSubGrpEncoder encoder)
    {
        encoder.reset();
        if (hasNoPartySubIDsGroupCounter)
        {
            final int size = this.noPartySubIDsGroupCounter;
            PartySubIDsGroupEncoder partySubIDsGroup = this.partySubIDsGroup;
            PartySubIDsGroupEncoder partySubIDsGroupEncoder = encoder.partySubIDsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (partySubIDsGroup != null)
                {
                    partySubIDsGroup.copyTo(partySubIDsGroupEncoder);
                    partySubIDsGroup = partySubIDsGroup.next();
                    partySubIDsGroupEncoder = partySubIDsGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
