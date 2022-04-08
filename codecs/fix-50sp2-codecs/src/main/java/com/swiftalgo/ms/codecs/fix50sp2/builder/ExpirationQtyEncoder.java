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


public class ExpirationQtyEncoder
{
    private static final int noExpirationGroupCounterHeaderLength = 4;
    private static final byte[] noExpirationGroupCounterHeader = new byte[] {57, 56, 49, (byte) '='};



public static class ExpirationGroupEncoder
{
    private ExpirationGroupEncoder next = null;

    public ExpirationGroupEncoder next()
    {
        if (next == null)
        {
            next = new ExpirationGroupEncoder();
        }
        return next;
    }

    private static final int expirationQtyTypeHeaderLength = 4;
    private static final byte[] expirationQtyTypeHeader = new byte[] {57, 56, 50, (byte) '='};

    private static final int expQtyHeaderLength = 4;
    private static final byte[] expQtyHeader = new byte[] {57, 56, 51, (byte) '='};

    private int expirationQtyType;

    private boolean hasExpirationQtyType;

    public boolean hasExpirationQtyType()
    {
        return hasExpirationQtyType;
    }

    public ExpirationGroupEncoder expirationQtyType(int value)
    {
        expirationQtyType = value;
        hasExpirationQtyType = true;
        return this;
    }

    public int expirationQtyType()
    {
        return expirationQtyType;
    }

    public ExpirationGroupEncoder expirationQtyType(ExpirationQtyType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == ExpirationQtyType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: expirationQtyType Value: " + value );
            }
            if (value == ExpirationQtyType.NULL_VAL)
            {
                return this;
            }
        }
        return expirationQtyType(value.representation());
    }

    private final DecimalFloat expQty = new DecimalFloat();

    private boolean hasExpQty;

    public boolean hasExpQty()
    {
        return hasExpQty;
    }

    public ExpirationGroupEncoder expQty(DecimalFloat value)
    {
        expQty.set(value);
        hasExpQty = true;
        return this;
    }

    public ExpirationGroupEncoder expQty(long value, int scale)
    {
        expQty.set(value, scale);
        hasExpQty = true;
        return this;
    }

    public DecimalFloat expQty()
    {
        return expQty;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (hasExpirationQtyType)
        {
            buffer.putBytes(position, expirationQtyTypeHeader, 0, expirationQtyTypeHeaderLength);
            position += expirationQtyTypeHeaderLength;
            position += buffer.putIntAscii(position, expirationQtyType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasExpQty)
        {
            buffer.putBytes(position, expQtyHeader, 0, expQtyHeaderLength);
            position += expQtyHeaderLength;
            position += buffer.putFloatAscii(position, expQty);
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
        this.resetExpirationQtyType();
        this.resetExpQty();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetExpirationQtyType()
    {
        hasExpirationQtyType = false;
    }

    public void resetExpQty()
    {
        hasExpQty = false;
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
        builder.append("\"MessageName\": \"ExpirationGroup\",\n");
        if (hasExpirationQtyType())
        {
            indent(builder, level);
            builder.append("\"ExpirationQtyType\": \"");
            builder.append(expirationQtyType);
            builder.append("\",\n");
        }

        if (hasExpQty())
        {
            indent(builder, level);
            builder.append("\"ExpQty\": \"");
            expQty.appendTo(builder);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public ExpirationGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((ExpirationGroupEncoder)encoder);
    }

    public ExpirationGroupEncoder copyTo(final ExpirationGroupEncoder encoder)
    {
        encoder.reset();
        if (hasExpirationQtyType())
        {
            encoder.expirationQtyType(this.expirationQtyType());
        }

        if (hasExpQty())
        {
            encoder.expQty(this.expQty());
        }
        return encoder;
    }

}
    private int noExpirationGroupCounter;

    private boolean hasNoExpirationGroupCounter;

    public boolean hasNoExpirationGroupCounter()
    {
        return hasNoExpirationGroupCounter;
    }

    public ExpirationQtyEncoder noExpirationGroupCounter(int value)
    {
        noExpirationGroupCounter = value;
        hasNoExpirationGroupCounter = true;
        return this;
    }

    public int noExpirationGroupCounter()
    {
        return noExpirationGroupCounter;
    }


    private ExpirationGroupEncoder expirationGroup = null;

    public ExpirationGroupEncoder expirationGroup(final int numberOfElements)
    {
        hasNoExpirationGroupCounter = true;
        noExpirationGroupCounter = numberOfElements;
        if (expirationGroup == null)
        {
            expirationGroup = new ExpirationGroupEncoder();
        }
        return expirationGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoExpirationGroupCounter)
        {
            buffer.putBytes(position, noExpirationGroupCounterHeader, 0, noExpirationGroupCounterHeaderLength);
            position += noExpirationGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noExpirationGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (expirationGroup != null)
        {
            position += expirationGroup.encode(buffer, position, noExpirationGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetExpirationGroup();
    }

    public void resetExpirationGroup()
    {
        if (expirationGroup != null)
        {
            expirationGroup.reset();
        }
        noExpirationGroupCounter = 0;
        hasNoExpirationGroupCounter = false;
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
        builder.append("\"MessageName\": \"ExpirationQty\",\n");
        if (hasNoExpirationGroupCounter)
        {
            indent(builder, level);
            builder.append("\"ExpirationGroup\": [\n");
            final int noExpirationGroupCounter = this.noExpirationGroupCounter;
            ExpirationGroupEncoder expirationGroup = this.expirationGroup;
            for (int i = 0; i < noExpirationGroupCounter; i++)
            {
                indent(builder, level);
                expirationGroup.appendTo(builder, level + 1);
                if (i < (noExpirationGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                expirationGroup = expirationGroup.next();
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
    public ExpirationQtyEncoder copyTo(final Encoder encoder)
    {
        return copyTo((ExpirationQtyEncoder)encoder);
    }

    public ExpirationQtyEncoder copyTo(final ExpirationQtyEncoder encoder)
    {
        encoder.reset();
        if (hasNoExpirationGroupCounter)
        {
            final int size = this.noExpirationGroupCounter;
            ExpirationGroupEncoder expirationGroup = this.expirationGroup;
            ExpirationGroupEncoder expirationGroupEncoder = encoder.expirationGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (expirationGroup != null)
                {
                    expirationGroup.copyTo(expirationGroupEncoder);
                    expirationGroup = expirationGroup.next();
                    expirationGroupEncoder = expirationGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
