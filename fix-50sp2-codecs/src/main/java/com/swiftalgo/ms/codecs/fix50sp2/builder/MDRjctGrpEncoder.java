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


public class MDRjctGrpEncoder
{
    private static final int noAltMDSourceGroupCounterHeaderLength = 4;
    private static final byte[] noAltMDSourceGroupCounterHeader = new byte[] {56, 49, 54, (byte) '='};



public static class AltMDSourceGroupEncoder
{
    private AltMDSourceGroupEncoder next = null;

    public AltMDSourceGroupEncoder next()
    {
        if (next == null)
        {
            next = new AltMDSourceGroupEncoder();
        }
        return next;
    }

    private static final int altMDSourceIDHeaderLength = 4;
    private static final byte[] altMDSourceIDHeader = new byte[] {56, 49, 55, (byte) '='};

    private final MutableDirectBuffer altMDSourceID = new UnsafeBuffer();

    private int altMDSourceIDOffset = 0;

    private int altMDSourceIDLength = 0;

    public AltMDSourceGroupEncoder altMDSourceID(final DirectBuffer value, final int offset, final int length)
    {
        altMDSourceID.wrap(value);
        altMDSourceIDOffset = offset;
        altMDSourceIDLength = length;
        return this;
    }

    public AltMDSourceGroupEncoder altMDSourceID(final DirectBuffer value, final int length)
    {
        return altMDSourceID(value, 0, length);
    }

    public AltMDSourceGroupEncoder altMDSourceID(final DirectBuffer value)
    {
        return altMDSourceID(value, 0, value.capacity());
    }

    public AltMDSourceGroupEncoder altMDSourceID(final byte[] value, final int offset, final int length)
    {
        altMDSourceID.wrap(value);
        altMDSourceIDOffset = offset;
        altMDSourceIDLength = length;
        return this;
    }

    public AltMDSourceGroupEncoder altMDSourceIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(altMDSourceID, value, offset, length);
        altMDSourceIDOffset = offset;
        altMDSourceIDLength = length;
        return this;
    }

    public AltMDSourceGroupEncoder altMDSourceID(final byte[] value, final int length)
    {
        return altMDSourceID(value, 0, length);
    }

    public AltMDSourceGroupEncoder altMDSourceID(final byte[] value)
    {
        return altMDSourceID(value, 0, value.length);
    }

    public boolean hasAltMDSourceID()
    {
        return altMDSourceIDLength > 0;
    }

    public MutableDirectBuffer altMDSourceID()
    {
        return altMDSourceID;
    }

    public String altMDSourceIDAsString()
    {
        return altMDSourceID.getStringWithoutLengthAscii(altMDSourceIDOffset, altMDSourceIDLength);
    }

    public AltMDSourceGroupEncoder altMDSourceID(final CharSequence value)
    {
        toBytes(value, altMDSourceID);
        altMDSourceIDOffset = 0;
        altMDSourceIDLength = value.length();
        return this;
    }

    public AltMDSourceGroupEncoder altMDSourceID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            altMDSourceID.wrap(buffer);
            altMDSourceIDOffset = value.offset();
            altMDSourceIDLength = value.length();
        }
        return this;
    }

    public AltMDSourceGroupEncoder altMDSourceID(final char[] value)
    {
        return altMDSourceID(value, 0, value.length);
    }

    public AltMDSourceGroupEncoder altMDSourceID(final char[] value, final int length)
    {
        return altMDSourceID(value, 0, length);
    }

    public AltMDSourceGroupEncoder altMDSourceID(final char[] value, final int offset, final int length)
    {
        toBytes(value, altMDSourceID, offset, length);
        altMDSourceIDOffset = 0;
        altMDSourceIDLength = length;
        return this;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (altMDSourceIDLength > 0)
        {
            buffer.putBytes(position, altMDSourceIDHeader, 0, altMDSourceIDHeaderLength);
            position += altMDSourceIDHeaderLength;
            buffer.putBytes(position, altMDSourceID, altMDSourceIDOffset, altMDSourceIDLength);
            position += altMDSourceIDLength;
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
        this.resetAltMDSourceID();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetAltMDSourceID()
    {
        altMDSourceIDLength = 0;
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
        builder.append("\"MessageName\": \"AltMDSourceGroup\",\n");
        if (hasAltMDSourceID())
        {
            indent(builder, level);
            builder.append("\"AltMDSourceID\": \"");
            appendBuffer(builder, altMDSourceID, altMDSourceIDOffset, altMDSourceIDLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public AltMDSourceGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((AltMDSourceGroupEncoder)encoder);
    }

    public AltMDSourceGroupEncoder copyTo(final AltMDSourceGroupEncoder encoder)
    {
        encoder.reset();
        if (hasAltMDSourceID())
        {
            encoder.altMDSourceIDAsCopy(altMDSourceID.byteArray(), 0, altMDSourceIDLength);
        }
        return encoder;
    }

}
    private int noAltMDSourceGroupCounter;

    private boolean hasNoAltMDSourceGroupCounter;

    public boolean hasNoAltMDSourceGroupCounter()
    {
        return hasNoAltMDSourceGroupCounter;
    }

    public MDRjctGrpEncoder noAltMDSourceGroupCounter(int value)
    {
        noAltMDSourceGroupCounter = value;
        hasNoAltMDSourceGroupCounter = true;
        return this;
    }

    public int noAltMDSourceGroupCounter()
    {
        return noAltMDSourceGroupCounter;
    }


    private AltMDSourceGroupEncoder altMDSourceGroup = null;

    public AltMDSourceGroupEncoder altMDSourceGroup(final int numberOfElements)
    {
        hasNoAltMDSourceGroupCounter = true;
        noAltMDSourceGroupCounter = numberOfElements;
        if (altMDSourceGroup == null)
        {
            altMDSourceGroup = new AltMDSourceGroupEncoder();
        }
        return altMDSourceGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoAltMDSourceGroupCounter)
        {
            buffer.putBytes(position, noAltMDSourceGroupCounterHeader, 0, noAltMDSourceGroupCounterHeaderLength);
            position += noAltMDSourceGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noAltMDSourceGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (altMDSourceGroup != null)
        {
            position += altMDSourceGroup.encode(buffer, position, noAltMDSourceGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetAltMDSourceGroup();
    }

    public void resetAltMDSourceGroup()
    {
        if (altMDSourceGroup != null)
        {
            altMDSourceGroup.reset();
        }
        noAltMDSourceGroupCounter = 0;
        hasNoAltMDSourceGroupCounter = false;
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
        builder.append("\"MessageName\": \"MDRjctGrp\",\n");
        if (hasNoAltMDSourceGroupCounter)
        {
            indent(builder, level);
            builder.append("\"AltMDSourceGroup\": [\n");
            final int noAltMDSourceGroupCounter = this.noAltMDSourceGroupCounter;
            AltMDSourceGroupEncoder altMDSourceGroup = this.altMDSourceGroup;
            for (int i = 0; i < noAltMDSourceGroupCounter; i++)
            {
                indent(builder, level);
                altMDSourceGroup.appendTo(builder, level + 1);
                if (i < (noAltMDSourceGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                altMDSourceGroup = altMDSourceGroup.next();
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
    public MDRjctGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((MDRjctGrpEncoder)encoder);
    }

    public MDRjctGrpEncoder copyTo(final MDRjctGrpEncoder encoder)
    {
        encoder.reset();
        if (hasNoAltMDSourceGroupCounter)
        {
            final int size = this.noAltMDSourceGroupCounter;
            AltMDSourceGroupEncoder altMDSourceGroup = this.altMDSourceGroup;
            AltMDSourceGroupEncoder altMDSourceGroupEncoder = encoder.altMDSourceGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (altMDSourceGroup != null)
                {
                    altMDSourceGroup.copyTo(altMDSourceGroupEncoder);
                    altMDSourceGroup = altMDSourceGroup.next();
                    altMDSourceGroupEncoder = altMDSourceGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
