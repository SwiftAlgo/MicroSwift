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


public class PartiesEncoder
{
    private static final int noPartyIDsGroupCounterHeaderLength = 4;
    private static final byte[] noPartyIDsGroupCounterHeader = new byte[] {52, 53, 51, (byte) '='};



public static class PartyIDsGroupEncoder
{
    private PartyIDsGroupEncoder next = null;

    public PartyIDsGroupEncoder next()
    {
        if (next == null)
        {
            next = new PartyIDsGroupEncoder();
        }
        return next;
    }

    private static final int partyIDHeaderLength = 4;
    private static final byte[] partyIDHeader = new byte[] {52, 52, 56, (byte) '='};

    private static final int partyIDSourceHeaderLength = 4;
    private static final byte[] partyIDSourceHeader = new byte[] {52, 52, 55, (byte) '='};

    private static final int partyRoleHeaderLength = 4;
    private static final byte[] partyRoleHeader = new byte[] {52, 53, 50, (byte) '='};

    private final MutableDirectBuffer partyID = new UnsafeBuffer();

    private int partyIDOffset = 0;

    private int partyIDLength = 0;

    public PartyIDsGroupEncoder partyID(final DirectBuffer value, final int offset, final int length)
    {
        partyID.wrap(value);
        partyIDOffset = offset;
        partyIDLength = length;
        return this;
    }

    public PartyIDsGroupEncoder partyID(final DirectBuffer value, final int length)
    {
        return partyID(value, 0, length);
    }

    public PartyIDsGroupEncoder partyID(final DirectBuffer value)
    {
        return partyID(value, 0, value.capacity());
    }

    public PartyIDsGroupEncoder partyID(final byte[] value, final int offset, final int length)
    {
        partyID.wrap(value);
        partyIDOffset = offset;
        partyIDLength = length;
        return this;
    }

    public PartyIDsGroupEncoder partyIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(partyID, value, offset, length);
        partyIDOffset = offset;
        partyIDLength = length;
        return this;
    }

    public PartyIDsGroupEncoder partyID(final byte[] value, final int length)
    {
        return partyID(value, 0, length);
    }

    public PartyIDsGroupEncoder partyID(final byte[] value)
    {
        return partyID(value, 0, value.length);
    }

    public boolean hasPartyID()
    {
        return partyIDLength > 0;
    }

    public MutableDirectBuffer partyID()
    {
        return partyID;
    }

    public String partyIDAsString()
    {
        return partyID.getStringWithoutLengthAscii(partyIDOffset, partyIDLength);
    }

    public PartyIDsGroupEncoder partyID(final CharSequence value)
    {
        toBytes(value, partyID);
        partyIDOffset = 0;
        partyIDLength = value.length();
        return this;
    }

    public PartyIDsGroupEncoder partyID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            partyID.wrap(buffer);
            partyIDOffset = value.offset();
            partyIDLength = value.length();
        }
        return this;
    }

    public PartyIDsGroupEncoder partyID(final char[] value)
    {
        return partyID(value, 0, value.length);
    }

    public PartyIDsGroupEncoder partyID(final char[] value, final int length)
    {
        return partyID(value, 0, length);
    }

    public PartyIDsGroupEncoder partyID(final char[] value, final int offset, final int length)
    {
        toBytes(value, partyID, offset, length);
        partyIDOffset = 0;
        partyIDLength = length;
        return this;
    }

    private char partyIDSource;

    private boolean hasPartyIDSource;

    public boolean hasPartyIDSource()
    {
        return hasPartyIDSource;
    }

    public PartyIDsGroupEncoder partyIDSource(char value)
    {
        partyIDSource = value;
        hasPartyIDSource = true;
        return this;
    }

    public char partyIDSource()
    {
        return partyIDSource;
    }

    public PartyIDsGroupEncoder partyIDSource(PartyIDSource value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == PartyIDSource.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: partyIDSource Value: " + value );
            }
            if (value == PartyIDSource.NULL_VAL)
            {
                return this;
            }
        }
        return partyIDSource(value.representation());
    }

    private int partyRole;

    private boolean hasPartyRole;

    public boolean hasPartyRole()
    {
        return hasPartyRole;
    }

    public PartyIDsGroupEncoder partyRole(int value)
    {
        partyRole = value;
        hasPartyRole = true;
        return this;
    }

    public int partyRole()
    {
        return partyRole;
    }

    public PartyIDsGroupEncoder partyRole(PartyRole value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == PartyRole.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: partyRole Value: " + value );
            }
            if (value == PartyRole.NULL_VAL)
            {
                return this;
            }
        }
        return partyRole(value.representation());
    }

    private final PtysSubGrpEncoder ptysSubGrp = new PtysSubGrpEncoder();
    public PtysSubGrpEncoder ptysSubGrp()
    {
        return ptysSubGrp;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (partyIDLength > 0)
        {
            buffer.putBytes(position, partyIDHeader, 0, partyIDHeaderLength);
            position += partyIDHeaderLength;
            buffer.putBytes(position, partyID, partyIDOffset, partyIDLength);
            position += partyIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasPartyIDSource)
        {
            buffer.putBytes(position, partyIDSourceHeader, 0, partyIDSourceHeaderLength);
            position += partyIDSourceHeaderLength;
            position += buffer.putCharAscii(position, partyIDSource);
            buffer.putSeparator(position);
            position++;
        }

        if (hasPartyRole)
        {
            buffer.putBytes(position, partyRoleHeader, 0, partyRoleHeaderLength);
            position += partyRoleHeaderLength;
            position += buffer.putIntAscii(position, partyRole);
            buffer.putSeparator(position);
            position++;
        }

            position += ptysSubGrp.encode(buffer, position);
        if (next != null)
        {
            position += next.encode(buffer, position, remainingElements - 1);
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetPartyID();
        this.resetPartyIDSource();
        this.resetPartyRole();
        ptysSubGrp.reset();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetPartyID()
    {
        partyIDLength = 0;
    }

    public void resetPartyIDSource()
    {
        hasPartyIDSource = false;
    }

    public void resetPartyRole()
    {
        hasPartyRole = false;
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
        builder.append("\"MessageName\": \"PartyIDsGroup\",\n");
        if (hasPartyID())
        {
            indent(builder, level);
            builder.append("\"PartyID\": \"");
            appendBuffer(builder, partyID, partyIDOffset, partyIDLength);
            builder.append("\",\n");
        }

        if (hasPartyIDSource())
        {
            indent(builder, level);
            builder.append("\"PartyIDSource\": \"");
            builder.append(partyIDSource);
            builder.append("\",\n");
        }

        if (hasPartyRole())
        {
            indent(builder, level);
            builder.append("\"PartyRole\": \"");
            builder.append(partyRole);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"PtysSubGrp\": ");
    ptysSubGrp.appendTo(builder, level + 1);
    builder.append("\n");
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public PartyIDsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((PartyIDsGroupEncoder)encoder);
    }

    public PartyIDsGroupEncoder copyTo(final PartyIDsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasPartyID())
        {
            encoder.partyIDAsCopy(partyID.byteArray(), 0, partyIDLength);
        }

        if (hasPartyIDSource())
        {
            encoder.partyIDSource(this.partyIDSource());
        }

        if (hasPartyRole())
        {
            encoder.partyRole(this.partyRole());
        }


        ptysSubGrp.copyTo(encoder.ptysSubGrp());        return encoder;
    }

}
    private int noPartyIDsGroupCounter;

    private boolean hasNoPartyIDsGroupCounter;

    public boolean hasNoPartyIDsGroupCounter()
    {
        return hasNoPartyIDsGroupCounter;
    }

    public PartiesEncoder noPartyIDsGroupCounter(int value)
    {
        noPartyIDsGroupCounter = value;
        hasNoPartyIDsGroupCounter = true;
        return this;
    }

    public int noPartyIDsGroupCounter()
    {
        return noPartyIDsGroupCounter;
    }


    private PartyIDsGroupEncoder partyIDsGroup = null;

    public PartyIDsGroupEncoder partyIDsGroup(final int numberOfElements)
    {
        hasNoPartyIDsGroupCounter = true;
        noPartyIDsGroupCounter = numberOfElements;
        if (partyIDsGroup == null)
        {
            partyIDsGroup = new PartyIDsGroupEncoder();
        }
        return partyIDsGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoPartyIDsGroupCounter)
        {
            buffer.putBytes(position, noPartyIDsGroupCounterHeader, 0, noPartyIDsGroupCounterHeaderLength);
            position += noPartyIDsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noPartyIDsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (partyIDsGroup != null)
        {
            position += partyIDsGroup.encode(buffer, position, noPartyIDsGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetPartyIDsGroup();
    }

    public void resetPartyIDsGroup()
    {
        if (partyIDsGroup != null)
        {
            partyIDsGroup.reset();
        }
        noPartyIDsGroupCounter = 0;
        hasNoPartyIDsGroupCounter = false;
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
        builder.append("\"MessageName\": \"Parties\",\n");
        if (hasNoPartyIDsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"PartyIDsGroup\": [\n");
            final int noPartyIDsGroupCounter = this.noPartyIDsGroupCounter;
            PartyIDsGroupEncoder partyIDsGroup = this.partyIDsGroup;
            for (int i = 0; i < noPartyIDsGroupCounter; i++)
            {
                indent(builder, level);
                partyIDsGroup.appendTo(builder, level + 1);
                if (i < (noPartyIDsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                partyIDsGroup = partyIDsGroup.next();
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
    public PartiesEncoder copyTo(final Encoder encoder)
    {
        return copyTo((PartiesEncoder)encoder);
    }

    public PartiesEncoder copyTo(final PartiesEncoder encoder)
    {
        encoder.reset();
        if (hasNoPartyIDsGroupCounter)
        {
            final int size = this.noPartyIDsGroupCounter;
            PartyIDsGroupEncoder partyIDsGroup = this.partyIDsGroup;
            PartyIDsGroupEncoder partyIDsGroupEncoder = encoder.partyIDsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (partyIDsGroup != null)
                {
                    partyIDsGroup.copyTo(partyIDsGroupEncoder);
                    partyIDsGroup = partyIDsGroup.next();
                    partyIDsGroupEncoder = partyIDsGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
