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


public class NotAffectedOrdersGrpEncoder
{
    private static final int noNotAffectedOrdersGroupCounterHeaderLength = 5;
    private static final byte[] noNotAffectedOrdersGroupCounterHeader = new byte[] {49, 51, 55, 48, (byte) '='};



public static class NotAffectedOrdersGroupEncoder
{
    private NotAffectedOrdersGroupEncoder next = null;

    public NotAffectedOrdersGroupEncoder next()
    {
        if (next == null)
        {
            next = new NotAffectedOrdersGroupEncoder();
        }
        return next;
    }

    private static final int notAffOrigClOrdIDHeaderLength = 5;
    private static final byte[] notAffOrigClOrdIDHeader = new byte[] {49, 51, 55, 50, (byte) '='};

    private static final int notAffectedOrderIDHeaderLength = 5;
    private static final byte[] notAffectedOrderIDHeader = new byte[] {49, 51, 55, 49, (byte) '='};

    private final MutableDirectBuffer notAffOrigClOrdID = new UnsafeBuffer();

    private int notAffOrigClOrdIDOffset = 0;

    private int notAffOrigClOrdIDLength = 0;

    public NotAffectedOrdersGroupEncoder notAffOrigClOrdID(final DirectBuffer value, final int offset, final int length)
    {
        notAffOrigClOrdID.wrap(value);
        notAffOrigClOrdIDOffset = offset;
        notAffOrigClOrdIDLength = length;
        return this;
    }

    public NotAffectedOrdersGroupEncoder notAffOrigClOrdID(final DirectBuffer value, final int length)
    {
        return notAffOrigClOrdID(value, 0, length);
    }

    public NotAffectedOrdersGroupEncoder notAffOrigClOrdID(final DirectBuffer value)
    {
        return notAffOrigClOrdID(value, 0, value.capacity());
    }

    public NotAffectedOrdersGroupEncoder notAffOrigClOrdID(final byte[] value, final int offset, final int length)
    {
        notAffOrigClOrdID.wrap(value);
        notAffOrigClOrdIDOffset = offset;
        notAffOrigClOrdIDLength = length;
        return this;
    }

    public NotAffectedOrdersGroupEncoder notAffOrigClOrdIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(notAffOrigClOrdID, value, offset, length);
        notAffOrigClOrdIDOffset = offset;
        notAffOrigClOrdIDLength = length;
        return this;
    }

    public NotAffectedOrdersGroupEncoder notAffOrigClOrdID(final byte[] value, final int length)
    {
        return notAffOrigClOrdID(value, 0, length);
    }

    public NotAffectedOrdersGroupEncoder notAffOrigClOrdID(final byte[] value)
    {
        return notAffOrigClOrdID(value, 0, value.length);
    }

    public boolean hasNotAffOrigClOrdID()
    {
        return notAffOrigClOrdIDLength > 0;
    }

    public MutableDirectBuffer notAffOrigClOrdID()
    {
        return notAffOrigClOrdID;
    }

    public String notAffOrigClOrdIDAsString()
    {
        return notAffOrigClOrdID.getStringWithoutLengthAscii(notAffOrigClOrdIDOffset, notAffOrigClOrdIDLength);
    }

    public NotAffectedOrdersGroupEncoder notAffOrigClOrdID(final CharSequence value)
    {
        toBytes(value, notAffOrigClOrdID);
        notAffOrigClOrdIDOffset = 0;
        notAffOrigClOrdIDLength = value.length();
        return this;
    }

    public NotAffectedOrdersGroupEncoder notAffOrigClOrdID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            notAffOrigClOrdID.wrap(buffer);
            notAffOrigClOrdIDOffset = value.offset();
            notAffOrigClOrdIDLength = value.length();
        }
        return this;
    }

    public NotAffectedOrdersGroupEncoder notAffOrigClOrdID(final char[] value)
    {
        return notAffOrigClOrdID(value, 0, value.length);
    }

    public NotAffectedOrdersGroupEncoder notAffOrigClOrdID(final char[] value, final int length)
    {
        return notAffOrigClOrdID(value, 0, length);
    }

    public NotAffectedOrdersGroupEncoder notAffOrigClOrdID(final char[] value, final int offset, final int length)
    {
        toBytes(value, notAffOrigClOrdID, offset, length);
        notAffOrigClOrdIDOffset = 0;
        notAffOrigClOrdIDLength = length;
        return this;
    }

    private final MutableDirectBuffer notAffectedOrderID = new UnsafeBuffer();

    private int notAffectedOrderIDOffset = 0;

    private int notAffectedOrderIDLength = 0;

    public NotAffectedOrdersGroupEncoder notAffectedOrderID(final DirectBuffer value, final int offset, final int length)
    {
        notAffectedOrderID.wrap(value);
        notAffectedOrderIDOffset = offset;
        notAffectedOrderIDLength = length;
        return this;
    }

    public NotAffectedOrdersGroupEncoder notAffectedOrderID(final DirectBuffer value, final int length)
    {
        return notAffectedOrderID(value, 0, length);
    }

    public NotAffectedOrdersGroupEncoder notAffectedOrderID(final DirectBuffer value)
    {
        return notAffectedOrderID(value, 0, value.capacity());
    }

    public NotAffectedOrdersGroupEncoder notAffectedOrderID(final byte[] value, final int offset, final int length)
    {
        notAffectedOrderID.wrap(value);
        notAffectedOrderIDOffset = offset;
        notAffectedOrderIDLength = length;
        return this;
    }

    public NotAffectedOrdersGroupEncoder notAffectedOrderIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(notAffectedOrderID, value, offset, length);
        notAffectedOrderIDOffset = offset;
        notAffectedOrderIDLength = length;
        return this;
    }

    public NotAffectedOrdersGroupEncoder notAffectedOrderID(final byte[] value, final int length)
    {
        return notAffectedOrderID(value, 0, length);
    }

    public NotAffectedOrdersGroupEncoder notAffectedOrderID(final byte[] value)
    {
        return notAffectedOrderID(value, 0, value.length);
    }

    public boolean hasNotAffectedOrderID()
    {
        return notAffectedOrderIDLength > 0;
    }

    public MutableDirectBuffer notAffectedOrderID()
    {
        return notAffectedOrderID;
    }

    public String notAffectedOrderIDAsString()
    {
        return notAffectedOrderID.getStringWithoutLengthAscii(notAffectedOrderIDOffset, notAffectedOrderIDLength);
    }

    public NotAffectedOrdersGroupEncoder notAffectedOrderID(final CharSequence value)
    {
        toBytes(value, notAffectedOrderID);
        notAffectedOrderIDOffset = 0;
        notAffectedOrderIDLength = value.length();
        return this;
    }

    public NotAffectedOrdersGroupEncoder notAffectedOrderID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            notAffectedOrderID.wrap(buffer);
            notAffectedOrderIDOffset = value.offset();
            notAffectedOrderIDLength = value.length();
        }
        return this;
    }

    public NotAffectedOrdersGroupEncoder notAffectedOrderID(final char[] value)
    {
        return notAffectedOrderID(value, 0, value.length);
    }

    public NotAffectedOrdersGroupEncoder notAffectedOrderID(final char[] value, final int length)
    {
        return notAffectedOrderID(value, 0, length);
    }

    public NotAffectedOrdersGroupEncoder notAffectedOrderID(final char[] value, final int offset, final int length)
    {
        toBytes(value, notAffectedOrderID, offset, length);
        notAffectedOrderIDOffset = 0;
        notAffectedOrderIDLength = length;
        return this;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (notAffOrigClOrdIDLength > 0)
        {
            buffer.putBytes(position, notAffOrigClOrdIDHeader, 0, notAffOrigClOrdIDHeaderLength);
            position += notAffOrigClOrdIDHeaderLength;
            buffer.putBytes(position, notAffOrigClOrdID, notAffOrigClOrdIDOffset, notAffOrigClOrdIDLength);
            position += notAffOrigClOrdIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (notAffectedOrderIDLength > 0)
        {
            buffer.putBytes(position, notAffectedOrderIDHeader, 0, notAffectedOrderIDHeaderLength);
            position += notAffectedOrderIDHeaderLength;
            buffer.putBytes(position, notAffectedOrderID, notAffectedOrderIDOffset, notAffectedOrderIDLength);
            position += notAffectedOrderIDLength;
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
        this.resetNotAffOrigClOrdID();
        this.resetNotAffectedOrderID();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetNotAffOrigClOrdID()
    {
        notAffOrigClOrdIDLength = 0;
    }

    public void resetNotAffectedOrderID()
    {
        notAffectedOrderIDLength = 0;
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
        builder.append("\"MessageName\": \"NotAffectedOrdersGroup\",\n");
        if (hasNotAffOrigClOrdID())
        {
            indent(builder, level);
            builder.append("\"NotAffOrigClOrdID\": \"");
            appendBuffer(builder, notAffOrigClOrdID, notAffOrigClOrdIDOffset, notAffOrigClOrdIDLength);
            builder.append("\",\n");
        }

        if (hasNotAffectedOrderID())
        {
            indent(builder, level);
            builder.append("\"NotAffectedOrderID\": \"");
            appendBuffer(builder, notAffectedOrderID, notAffectedOrderIDOffset, notAffectedOrderIDLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public NotAffectedOrdersGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((NotAffectedOrdersGroupEncoder)encoder);
    }

    public NotAffectedOrdersGroupEncoder copyTo(final NotAffectedOrdersGroupEncoder encoder)
    {
        encoder.reset();
        if (hasNotAffOrigClOrdID())
        {
            encoder.notAffOrigClOrdIDAsCopy(notAffOrigClOrdID.byteArray(), 0, notAffOrigClOrdIDLength);
        }

        if (hasNotAffectedOrderID())
        {
            encoder.notAffectedOrderIDAsCopy(notAffectedOrderID.byteArray(), 0, notAffectedOrderIDLength);
        }
        return encoder;
    }

}
    private int noNotAffectedOrdersGroupCounter;

    private boolean hasNoNotAffectedOrdersGroupCounter;

    public boolean hasNoNotAffectedOrdersGroupCounter()
    {
        return hasNoNotAffectedOrdersGroupCounter;
    }

    public NotAffectedOrdersGrpEncoder noNotAffectedOrdersGroupCounter(int value)
    {
        noNotAffectedOrdersGroupCounter = value;
        hasNoNotAffectedOrdersGroupCounter = true;
        return this;
    }

    public int noNotAffectedOrdersGroupCounter()
    {
        return noNotAffectedOrdersGroupCounter;
    }


    private NotAffectedOrdersGroupEncoder notAffectedOrdersGroup = null;

    public NotAffectedOrdersGroupEncoder notAffectedOrdersGroup(final int numberOfElements)
    {
        hasNoNotAffectedOrdersGroupCounter = true;
        noNotAffectedOrdersGroupCounter = numberOfElements;
        if (notAffectedOrdersGroup == null)
        {
            notAffectedOrdersGroup = new NotAffectedOrdersGroupEncoder();
        }
        return notAffectedOrdersGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoNotAffectedOrdersGroupCounter)
        {
            buffer.putBytes(position, noNotAffectedOrdersGroupCounterHeader, 0, noNotAffectedOrdersGroupCounterHeaderLength);
            position += noNotAffectedOrdersGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noNotAffectedOrdersGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (notAffectedOrdersGroup != null)
        {
            position += notAffectedOrdersGroup.encode(buffer, position, noNotAffectedOrdersGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetNotAffectedOrdersGroup();
    }

    public void resetNotAffectedOrdersGroup()
    {
        if (notAffectedOrdersGroup != null)
        {
            notAffectedOrdersGroup.reset();
        }
        noNotAffectedOrdersGroupCounter = 0;
        hasNoNotAffectedOrdersGroupCounter = false;
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
        builder.append("\"MessageName\": \"NotAffectedOrdersGrp\",\n");
        if (hasNoNotAffectedOrdersGroupCounter)
        {
            indent(builder, level);
            builder.append("\"NotAffectedOrdersGroup\": [\n");
            final int noNotAffectedOrdersGroupCounter = this.noNotAffectedOrdersGroupCounter;
            NotAffectedOrdersGroupEncoder notAffectedOrdersGroup = this.notAffectedOrdersGroup;
            for (int i = 0; i < noNotAffectedOrdersGroupCounter; i++)
            {
                indent(builder, level);
                notAffectedOrdersGroup.appendTo(builder, level + 1);
                if (i < (noNotAffectedOrdersGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                notAffectedOrdersGroup = notAffectedOrdersGroup.next();
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
    public NotAffectedOrdersGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((NotAffectedOrdersGrpEncoder)encoder);
    }

    public NotAffectedOrdersGrpEncoder copyTo(final NotAffectedOrdersGrpEncoder encoder)
    {
        encoder.reset();
        if (hasNoNotAffectedOrdersGroupCounter)
        {
            final int size = this.noNotAffectedOrdersGroupCounter;
            NotAffectedOrdersGroupEncoder notAffectedOrdersGroup = this.notAffectedOrdersGroup;
            NotAffectedOrdersGroupEncoder notAffectedOrdersGroupEncoder = encoder.notAffectedOrdersGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (notAffectedOrdersGroup != null)
                {
                    notAffectedOrdersGroup.copyTo(notAffectedOrdersGroupEncoder);
                    notAffectedOrdersGroup = notAffectedOrdersGroup.next();
                    notAffectedOrdersGroupEncoder = notAffectedOrdersGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
