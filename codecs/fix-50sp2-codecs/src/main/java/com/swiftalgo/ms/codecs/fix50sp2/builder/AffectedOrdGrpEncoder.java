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


public class AffectedOrdGrpEncoder
{
    private static final int noAffectedOrdersGroupCounterHeaderLength = 4;
    private static final byte[] noAffectedOrdersGroupCounterHeader = new byte[] {53, 51, 52, (byte) '='};



public static class AffectedOrdersGroupEncoder
{
    private AffectedOrdersGroupEncoder next = null;

    public AffectedOrdersGroupEncoder next()
    {
        if (next == null)
        {
            next = new AffectedOrdersGroupEncoder();
        }
        return next;
    }

    private static final int origClOrdIDHeaderLength = 3;
    private static final byte[] origClOrdIDHeader = new byte[] {52, 49, (byte) '='};

    private static final int affectedOrderIDHeaderLength = 4;
    private static final byte[] affectedOrderIDHeader = new byte[] {53, 51, 53, (byte) '='};

    private static final int affectedSecondaryOrderIDHeaderLength = 4;
    private static final byte[] affectedSecondaryOrderIDHeader = new byte[] {53, 51, 54, (byte) '='};

    private final MutableDirectBuffer origClOrdID = new UnsafeBuffer();

    private int origClOrdIDOffset = 0;

    private int origClOrdIDLength = 0;

    public AffectedOrdersGroupEncoder origClOrdID(final DirectBuffer value, final int offset, final int length)
    {
        origClOrdID.wrap(value);
        origClOrdIDOffset = offset;
        origClOrdIDLength = length;
        return this;
    }

    public AffectedOrdersGroupEncoder origClOrdID(final DirectBuffer value, final int length)
    {
        return origClOrdID(value, 0, length);
    }

    public AffectedOrdersGroupEncoder origClOrdID(final DirectBuffer value)
    {
        return origClOrdID(value, 0, value.capacity());
    }

    public AffectedOrdersGroupEncoder origClOrdID(final byte[] value, final int offset, final int length)
    {
        origClOrdID.wrap(value);
        origClOrdIDOffset = offset;
        origClOrdIDLength = length;
        return this;
    }

    public AffectedOrdersGroupEncoder origClOrdIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(origClOrdID, value, offset, length);
        origClOrdIDOffset = offset;
        origClOrdIDLength = length;
        return this;
    }

    public AffectedOrdersGroupEncoder origClOrdID(final byte[] value, final int length)
    {
        return origClOrdID(value, 0, length);
    }

    public AffectedOrdersGroupEncoder origClOrdID(final byte[] value)
    {
        return origClOrdID(value, 0, value.length);
    }

    public boolean hasOrigClOrdID()
    {
        return origClOrdIDLength > 0;
    }

    public MutableDirectBuffer origClOrdID()
    {
        return origClOrdID;
    }

    public String origClOrdIDAsString()
    {
        return origClOrdID.getStringWithoutLengthAscii(origClOrdIDOffset, origClOrdIDLength);
    }

    public AffectedOrdersGroupEncoder origClOrdID(final CharSequence value)
    {
        toBytes(value, origClOrdID);
        origClOrdIDOffset = 0;
        origClOrdIDLength = value.length();
        return this;
    }

    public AffectedOrdersGroupEncoder origClOrdID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            origClOrdID.wrap(buffer);
            origClOrdIDOffset = value.offset();
            origClOrdIDLength = value.length();
        }
        return this;
    }

    public AffectedOrdersGroupEncoder origClOrdID(final char[] value)
    {
        return origClOrdID(value, 0, value.length);
    }

    public AffectedOrdersGroupEncoder origClOrdID(final char[] value, final int length)
    {
        return origClOrdID(value, 0, length);
    }

    public AffectedOrdersGroupEncoder origClOrdID(final char[] value, final int offset, final int length)
    {
        toBytes(value, origClOrdID, offset, length);
        origClOrdIDOffset = 0;
        origClOrdIDLength = length;
        return this;
    }

    private final MutableDirectBuffer affectedOrderID = new UnsafeBuffer();

    private int affectedOrderIDOffset = 0;

    private int affectedOrderIDLength = 0;

    public AffectedOrdersGroupEncoder affectedOrderID(final DirectBuffer value, final int offset, final int length)
    {
        affectedOrderID.wrap(value);
        affectedOrderIDOffset = offset;
        affectedOrderIDLength = length;
        return this;
    }

    public AffectedOrdersGroupEncoder affectedOrderID(final DirectBuffer value, final int length)
    {
        return affectedOrderID(value, 0, length);
    }

    public AffectedOrdersGroupEncoder affectedOrderID(final DirectBuffer value)
    {
        return affectedOrderID(value, 0, value.capacity());
    }

    public AffectedOrdersGroupEncoder affectedOrderID(final byte[] value, final int offset, final int length)
    {
        affectedOrderID.wrap(value);
        affectedOrderIDOffset = offset;
        affectedOrderIDLength = length;
        return this;
    }

    public AffectedOrdersGroupEncoder affectedOrderIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(affectedOrderID, value, offset, length);
        affectedOrderIDOffset = offset;
        affectedOrderIDLength = length;
        return this;
    }

    public AffectedOrdersGroupEncoder affectedOrderID(final byte[] value, final int length)
    {
        return affectedOrderID(value, 0, length);
    }

    public AffectedOrdersGroupEncoder affectedOrderID(final byte[] value)
    {
        return affectedOrderID(value, 0, value.length);
    }

    public boolean hasAffectedOrderID()
    {
        return affectedOrderIDLength > 0;
    }

    public MutableDirectBuffer affectedOrderID()
    {
        return affectedOrderID;
    }

    public String affectedOrderIDAsString()
    {
        return affectedOrderID.getStringWithoutLengthAscii(affectedOrderIDOffset, affectedOrderIDLength);
    }

    public AffectedOrdersGroupEncoder affectedOrderID(final CharSequence value)
    {
        toBytes(value, affectedOrderID);
        affectedOrderIDOffset = 0;
        affectedOrderIDLength = value.length();
        return this;
    }

    public AffectedOrdersGroupEncoder affectedOrderID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            affectedOrderID.wrap(buffer);
            affectedOrderIDOffset = value.offset();
            affectedOrderIDLength = value.length();
        }
        return this;
    }

    public AffectedOrdersGroupEncoder affectedOrderID(final char[] value)
    {
        return affectedOrderID(value, 0, value.length);
    }

    public AffectedOrdersGroupEncoder affectedOrderID(final char[] value, final int length)
    {
        return affectedOrderID(value, 0, length);
    }

    public AffectedOrdersGroupEncoder affectedOrderID(final char[] value, final int offset, final int length)
    {
        toBytes(value, affectedOrderID, offset, length);
        affectedOrderIDOffset = 0;
        affectedOrderIDLength = length;
        return this;
    }

    private final MutableDirectBuffer affectedSecondaryOrderID = new UnsafeBuffer();

    private int affectedSecondaryOrderIDOffset = 0;

    private int affectedSecondaryOrderIDLength = 0;

    public AffectedOrdersGroupEncoder affectedSecondaryOrderID(final DirectBuffer value, final int offset, final int length)
    {
        affectedSecondaryOrderID.wrap(value);
        affectedSecondaryOrderIDOffset = offset;
        affectedSecondaryOrderIDLength = length;
        return this;
    }

    public AffectedOrdersGroupEncoder affectedSecondaryOrderID(final DirectBuffer value, final int length)
    {
        return affectedSecondaryOrderID(value, 0, length);
    }

    public AffectedOrdersGroupEncoder affectedSecondaryOrderID(final DirectBuffer value)
    {
        return affectedSecondaryOrderID(value, 0, value.capacity());
    }

    public AffectedOrdersGroupEncoder affectedSecondaryOrderID(final byte[] value, final int offset, final int length)
    {
        affectedSecondaryOrderID.wrap(value);
        affectedSecondaryOrderIDOffset = offset;
        affectedSecondaryOrderIDLength = length;
        return this;
    }

    public AffectedOrdersGroupEncoder affectedSecondaryOrderIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(affectedSecondaryOrderID, value, offset, length);
        affectedSecondaryOrderIDOffset = offset;
        affectedSecondaryOrderIDLength = length;
        return this;
    }

    public AffectedOrdersGroupEncoder affectedSecondaryOrderID(final byte[] value, final int length)
    {
        return affectedSecondaryOrderID(value, 0, length);
    }

    public AffectedOrdersGroupEncoder affectedSecondaryOrderID(final byte[] value)
    {
        return affectedSecondaryOrderID(value, 0, value.length);
    }

    public boolean hasAffectedSecondaryOrderID()
    {
        return affectedSecondaryOrderIDLength > 0;
    }

    public MutableDirectBuffer affectedSecondaryOrderID()
    {
        return affectedSecondaryOrderID;
    }

    public String affectedSecondaryOrderIDAsString()
    {
        return affectedSecondaryOrderID.getStringWithoutLengthAscii(affectedSecondaryOrderIDOffset, affectedSecondaryOrderIDLength);
    }

    public AffectedOrdersGroupEncoder affectedSecondaryOrderID(final CharSequence value)
    {
        toBytes(value, affectedSecondaryOrderID);
        affectedSecondaryOrderIDOffset = 0;
        affectedSecondaryOrderIDLength = value.length();
        return this;
    }

    public AffectedOrdersGroupEncoder affectedSecondaryOrderID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            affectedSecondaryOrderID.wrap(buffer);
            affectedSecondaryOrderIDOffset = value.offset();
            affectedSecondaryOrderIDLength = value.length();
        }
        return this;
    }

    public AffectedOrdersGroupEncoder affectedSecondaryOrderID(final char[] value)
    {
        return affectedSecondaryOrderID(value, 0, value.length);
    }

    public AffectedOrdersGroupEncoder affectedSecondaryOrderID(final char[] value, final int length)
    {
        return affectedSecondaryOrderID(value, 0, length);
    }

    public AffectedOrdersGroupEncoder affectedSecondaryOrderID(final char[] value, final int offset, final int length)
    {
        toBytes(value, affectedSecondaryOrderID, offset, length);
        affectedSecondaryOrderIDOffset = 0;
        affectedSecondaryOrderIDLength = length;
        return this;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (origClOrdIDLength > 0)
        {
            buffer.putBytes(position, origClOrdIDHeader, 0, origClOrdIDHeaderLength);
            position += origClOrdIDHeaderLength;
            buffer.putBytes(position, origClOrdID, origClOrdIDOffset, origClOrdIDLength);
            position += origClOrdIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (affectedOrderIDLength > 0)
        {
            buffer.putBytes(position, affectedOrderIDHeader, 0, affectedOrderIDHeaderLength);
            position += affectedOrderIDHeaderLength;
            buffer.putBytes(position, affectedOrderID, affectedOrderIDOffset, affectedOrderIDLength);
            position += affectedOrderIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (affectedSecondaryOrderIDLength > 0)
        {
            buffer.putBytes(position, affectedSecondaryOrderIDHeader, 0, affectedSecondaryOrderIDHeaderLength);
            position += affectedSecondaryOrderIDHeaderLength;
            buffer.putBytes(position, affectedSecondaryOrderID, affectedSecondaryOrderIDOffset, affectedSecondaryOrderIDLength);
            position += affectedSecondaryOrderIDLength;
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
        this.resetOrigClOrdID();
        this.resetAffectedOrderID();
        this.resetAffectedSecondaryOrderID();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetOrigClOrdID()
    {
        origClOrdIDLength = 0;
    }

    public void resetAffectedOrderID()
    {
        affectedOrderIDLength = 0;
    }

    public void resetAffectedSecondaryOrderID()
    {
        affectedSecondaryOrderIDLength = 0;
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
        builder.append("\"MessageName\": \"AffectedOrdersGroup\",\n");
        if (hasOrigClOrdID())
        {
            indent(builder, level);
            builder.append("\"OrigClOrdID\": \"");
            appendBuffer(builder, origClOrdID, origClOrdIDOffset, origClOrdIDLength);
            builder.append("\",\n");
        }

        if (hasAffectedOrderID())
        {
            indent(builder, level);
            builder.append("\"AffectedOrderID\": \"");
            appendBuffer(builder, affectedOrderID, affectedOrderIDOffset, affectedOrderIDLength);
            builder.append("\",\n");
        }

        if (hasAffectedSecondaryOrderID())
        {
            indent(builder, level);
            builder.append("\"AffectedSecondaryOrderID\": \"");
            appendBuffer(builder, affectedSecondaryOrderID, affectedSecondaryOrderIDOffset, affectedSecondaryOrderIDLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public AffectedOrdersGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((AffectedOrdersGroupEncoder)encoder);
    }

    public AffectedOrdersGroupEncoder copyTo(final AffectedOrdersGroupEncoder encoder)
    {
        encoder.reset();
        if (hasOrigClOrdID())
        {
            encoder.origClOrdIDAsCopy(origClOrdID.byteArray(), 0, origClOrdIDLength);
        }

        if (hasAffectedOrderID())
        {
            encoder.affectedOrderIDAsCopy(affectedOrderID.byteArray(), 0, affectedOrderIDLength);
        }

        if (hasAffectedSecondaryOrderID())
        {
            encoder.affectedSecondaryOrderIDAsCopy(affectedSecondaryOrderID.byteArray(), 0, affectedSecondaryOrderIDLength);
        }
        return encoder;
    }

}
    private int noAffectedOrdersGroupCounter;

    private boolean hasNoAffectedOrdersGroupCounter;

    public boolean hasNoAffectedOrdersGroupCounter()
    {
        return hasNoAffectedOrdersGroupCounter;
    }

    public AffectedOrdGrpEncoder noAffectedOrdersGroupCounter(int value)
    {
        noAffectedOrdersGroupCounter = value;
        hasNoAffectedOrdersGroupCounter = true;
        return this;
    }

    public int noAffectedOrdersGroupCounter()
    {
        return noAffectedOrdersGroupCounter;
    }


    private AffectedOrdersGroupEncoder affectedOrdersGroup = null;

    public AffectedOrdersGroupEncoder affectedOrdersGroup(final int numberOfElements)
    {
        hasNoAffectedOrdersGroupCounter = true;
        noAffectedOrdersGroupCounter = numberOfElements;
        if (affectedOrdersGroup == null)
        {
            affectedOrdersGroup = new AffectedOrdersGroupEncoder();
        }
        return affectedOrdersGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoAffectedOrdersGroupCounter)
        {
            buffer.putBytes(position, noAffectedOrdersGroupCounterHeader, 0, noAffectedOrdersGroupCounterHeaderLength);
            position += noAffectedOrdersGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noAffectedOrdersGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (affectedOrdersGroup != null)
        {
            position += affectedOrdersGroup.encode(buffer, position, noAffectedOrdersGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetAffectedOrdersGroup();
    }

    public void resetAffectedOrdersGroup()
    {
        if (affectedOrdersGroup != null)
        {
            affectedOrdersGroup.reset();
        }
        noAffectedOrdersGroupCounter = 0;
        hasNoAffectedOrdersGroupCounter = false;
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
        builder.append("\"MessageName\": \"AffectedOrdGrp\",\n");
        if (hasNoAffectedOrdersGroupCounter)
        {
            indent(builder, level);
            builder.append("\"AffectedOrdersGroup\": [\n");
            final int noAffectedOrdersGroupCounter = this.noAffectedOrdersGroupCounter;
            AffectedOrdersGroupEncoder affectedOrdersGroup = this.affectedOrdersGroup;
            for (int i = 0; i < noAffectedOrdersGroupCounter; i++)
            {
                indent(builder, level);
                affectedOrdersGroup.appendTo(builder, level + 1);
                if (i < (noAffectedOrdersGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                affectedOrdersGroup = affectedOrdersGroup.next();
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
    public AffectedOrdGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((AffectedOrdGrpEncoder)encoder);
    }

    public AffectedOrdGrpEncoder copyTo(final AffectedOrdGrpEncoder encoder)
    {
        encoder.reset();
        if (hasNoAffectedOrdersGroupCounter)
        {
            final int size = this.noAffectedOrdersGroupCounter;
            AffectedOrdersGroupEncoder affectedOrdersGroup = this.affectedOrdersGroup;
            AffectedOrdersGroupEncoder affectedOrdersGroupEncoder = encoder.affectedOrdersGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (affectedOrdersGroup != null)
                {
                    affectedOrdersGroup.copyTo(affectedOrdersGroupEncoder);
                    affectedOrdersGroup = affectedOrdersGroup.next();
                    affectedOrdersGroupEncoder = affectedOrdersGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
