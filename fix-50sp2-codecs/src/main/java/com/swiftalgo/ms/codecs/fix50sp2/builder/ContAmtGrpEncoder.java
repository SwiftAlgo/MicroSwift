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


public class ContAmtGrpEncoder
{
    private static final int noContAmtsGroupCounterHeaderLength = 4;
    private static final byte[] noContAmtsGroupCounterHeader = new byte[] {53, 49, 56, (byte) '='};



public static class ContAmtsGroupEncoder
{
    private ContAmtsGroupEncoder next = null;

    public ContAmtsGroupEncoder next()
    {
        if (next == null)
        {
            next = new ContAmtsGroupEncoder();
        }
        return next;
    }

    private static final int contAmtTypeHeaderLength = 4;
    private static final byte[] contAmtTypeHeader = new byte[] {53, 49, 57, (byte) '='};

    private static final int contAmtValueHeaderLength = 4;
    private static final byte[] contAmtValueHeader = new byte[] {53, 50, 48, (byte) '='};

    private static final int contAmtCurrHeaderLength = 4;
    private static final byte[] contAmtCurrHeader = new byte[] {53, 50, 49, (byte) '='};

    private int contAmtType;

    private boolean hasContAmtType;

    public boolean hasContAmtType()
    {
        return hasContAmtType;
    }

    public ContAmtsGroupEncoder contAmtType(int value)
    {
        contAmtType = value;
        hasContAmtType = true;
        return this;
    }

    public int contAmtType()
    {
        return contAmtType;
    }

    public ContAmtsGroupEncoder contAmtType(ContAmtType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == ContAmtType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: contAmtType Value: " + value );
            }
            if (value == ContAmtType.NULL_VAL)
            {
                return this;
            }
        }
        return contAmtType(value.representation());
    }

    private final DecimalFloat contAmtValue = new DecimalFloat();

    private boolean hasContAmtValue;

    public boolean hasContAmtValue()
    {
        return hasContAmtValue;
    }

    public ContAmtsGroupEncoder contAmtValue(DecimalFloat value)
    {
        contAmtValue.set(value);
        hasContAmtValue = true;
        return this;
    }

    public ContAmtsGroupEncoder contAmtValue(long value, int scale)
    {
        contAmtValue.set(value, scale);
        hasContAmtValue = true;
        return this;
    }

    public DecimalFloat contAmtValue()
    {
        return contAmtValue;
    }

    private final MutableDirectBuffer contAmtCurr = new UnsafeBuffer();

    private int contAmtCurrOffset = 0;

    private int contAmtCurrLength = 0;

    public ContAmtsGroupEncoder contAmtCurr(final DirectBuffer value, final int offset, final int length)
    {
        contAmtCurr.wrap(value);
        contAmtCurrOffset = offset;
        contAmtCurrLength = length;
        return this;
    }

    public ContAmtsGroupEncoder contAmtCurr(final DirectBuffer value, final int length)
    {
        return contAmtCurr(value, 0, length);
    }

    public ContAmtsGroupEncoder contAmtCurr(final DirectBuffer value)
    {
        return contAmtCurr(value, 0, value.capacity());
    }

    public ContAmtsGroupEncoder contAmtCurr(final byte[] value, final int offset, final int length)
    {
        contAmtCurr.wrap(value);
        contAmtCurrOffset = offset;
        contAmtCurrLength = length;
        return this;
    }

    public ContAmtsGroupEncoder contAmtCurrAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(contAmtCurr, value, offset, length);
        contAmtCurrOffset = offset;
        contAmtCurrLength = length;
        return this;
    }

    public ContAmtsGroupEncoder contAmtCurr(final byte[] value, final int length)
    {
        return contAmtCurr(value, 0, length);
    }

    public ContAmtsGroupEncoder contAmtCurr(final byte[] value)
    {
        return contAmtCurr(value, 0, value.length);
    }

    public boolean hasContAmtCurr()
    {
        return contAmtCurrLength > 0;
    }

    public MutableDirectBuffer contAmtCurr()
    {
        return contAmtCurr;
    }

    public String contAmtCurrAsString()
    {
        return contAmtCurr.getStringWithoutLengthAscii(contAmtCurrOffset, contAmtCurrLength);
    }

    public ContAmtsGroupEncoder contAmtCurr(final CharSequence value)
    {
        toBytes(value, contAmtCurr);
        contAmtCurrOffset = 0;
        contAmtCurrLength = value.length();
        return this;
    }

    public ContAmtsGroupEncoder contAmtCurr(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            contAmtCurr.wrap(buffer);
            contAmtCurrOffset = value.offset();
            contAmtCurrLength = value.length();
        }
        return this;
    }

    public ContAmtsGroupEncoder contAmtCurr(final char[] value)
    {
        return contAmtCurr(value, 0, value.length);
    }

    public ContAmtsGroupEncoder contAmtCurr(final char[] value, final int length)
    {
        return contAmtCurr(value, 0, length);
    }

    public ContAmtsGroupEncoder contAmtCurr(final char[] value, final int offset, final int length)
    {
        toBytes(value, contAmtCurr, offset, length);
        contAmtCurrOffset = 0;
        contAmtCurrLength = length;
        return this;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (hasContAmtType)
        {
            buffer.putBytes(position, contAmtTypeHeader, 0, contAmtTypeHeaderLength);
            position += contAmtTypeHeaderLength;
            position += buffer.putIntAscii(position, contAmtType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasContAmtValue)
        {
            buffer.putBytes(position, contAmtValueHeader, 0, contAmtValueHeaderLength);
            position += contAmtValueHeaderLength;
            position += buffer.putFloatAscii(position, contAmtValue);
            buffer.putSeparator(position);
            position++;
        }

        if (contAmtCurrLength > 0)
        {
            buffer.putBytes(position, contAmtCurrHeader, 0, contAmtCurrHeaderLength);
            position += contAmtCurrHeaderLength;
            buffer.putBytes(position, contAmtCurr, contAmtCurrOffset, contAmtCurrLength);
            position += contAmtCurrLength;
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
        this.resetContAmtType();
        this.resetContAmtValue();
        this.resetContAmtCurr();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetContAmtType()
    {
        hasContAmtType = false;
    }

    public void resetContAmtValue()
    {
        hasContAmtValue = false;
    }

    public void resetContAmtCurr()
    {
        contAmtCurrLength = 0;
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
        builder.append("\"MessageName\": \"ContAmtsGroup\",\n");
        if (hasContAmtType())
        {
            indent(builder, level);
            builder.append("\"ContAmtType\": \"");
            builder.append(contAmtType);
            builder.append("\",\n");
        }

        if (hasContAmtValue())
        {
            indent(builder, level);
            builder.append("\"ContAmtValue\": \"");
            contAmtValue.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasContAmtCurr())
        {
            indent(builder, level);
            builder.append("\"ContAmtCurr\": \"");
            appendBuffer(builder, contAmtCurr, contAmtCurrOffset, contAmtCurrLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public ContAmtsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((ContAmtsGroupEncoder)encoder);
    }

    public ContAmtsGroupEncoder copyTo(final ContAmtsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasContAmtType())
        {
            encoder.contAmtType(this.contAmtType());
        }

        if (hasContAmtValue())
        {
            encoder.contAmtValue(this.contAmtValue());
        }

        if (hasContAmtCurr())
        {
            encoder.contAmtCurrAsCopy(contAmtCurr.byteArray(), 0, contAmtCurrLength);
        }
        return encoder;
    }

}
    private int noContAmtsGroupCounter;

    private boolean hasNoContAmtsGroupCounter;

    public boolean hasNoContAmtsGroupCounter()
    {
        return hasNoContAmtsGroupCounter;
    }

    public ContAmtGrpEncoder noContAmtsGroupCounter(int value)
    {
        noContAmtsGroupCounter = value;
        hasNoContAmtsGroupCounter = true;
        return this;
    }

    public int noContAmtsGroupCounter()
    {
        return noContAmtsGroupCounter;
    }


    private ContAmtsGroupEncoder contAmtsGroup = null;

    public ContAmtsGroupEncoder contAmtsGroup(final int numberOfElements)
    {
        hasNoContAmtsGroupCounter = true;
        noContAmtsGroupCounter = numberOfElements;
        if (contAmtsGroup == null)
        {
            contAmtsGroup = new ContAmtsGroupEncoder();
        }
        return contAmtsGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoContAmtsGroupCounter)
        {
            buffer.putBytes(position, noContAmtsGroupCounterHeader, 0, noContAmtsGroupCounterHeaderLength);
            position += noContAmtsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noContAmtsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (contAmtsGroup != null)
        {
            position += contAmtsGroup.encode(buffer, position, noContAmtsGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetContAmtsGroup();
    }

    public void resetContAmtsGroup()
    {
        if (contAmtsGroup != null)
        {
            contAmtsGroup.reset();
        }
        noContAmtsGroupCounter = 0;
        hasNoContAmtsGroupCounter = false;
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
        builder.append("\"MessageName\": \"ContAmtGrp\",\n");
        if (hasNoContAmtsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"ContAmtsGroup\": [\n");
            final int noContAmtsGroupCounter = this.noContAmtsGroupCounter;
            ContAmtsGroupEncoder contAmtsGroup = this.contAmtsGroup;
            for (int i = 0; i < noContAmtsGroupCounter; i++)
            {
                indent(builder, level);
                contAmtsGroup.appendTo(builder, level + 1);
                if (i < (noContAmtsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                contAmtsGroup = contAmtsGroup.next();
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
    public ContAmtGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((ContAmtGrpEncoder)encoder);
    }

    public ContAmtGrpEncoder copyTo(final ContAmtGrpEncoder encoder)
    {
        encoder.reset();
        if (hasNoContAmtsGroupCounter)
        {
            final int size = this.noContAmtsGroupCounter;
            ContAmtsGroupEncoder contAmtsGroup = this.contAmtsGroup;
            ContAmtsGroupEncoder contAmtsGroupEncoder = encoder.contAmtsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (contAmtsGroup != null)
                {
                    contAmtsGroup.copyTo(contAmtsGroupEncoder);
                    contAmtsGroup = contAmtsGroup.next();
                    contAmtsGroupEncoder = contAmtsGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
