/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44.builder;

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
import com.swiftalgo.ms.codecs.fix44.*;


public class PositionAmountDataEncoder
{
    private static final int noPosAmtGroupCounterHeaderLength = 4;
    private static final byte[] noPosAmtGroupCounterHeader = new byte[] {55, 53, 51, (byte) '='};



public static class PosAmtGroupEncoder
{
    private PosAmtGroupEncoder next = null;

    public PosAmtGroupEncoder next()
    {
        if (next == null)
        {
            next = new PosAmtGroupEncoder();
        }
        return next;
    }

    private static final int posAmtTypeHeaderLength = 4;
    private static final byte[] posAmtTypeHeader = new byte[] {55, 48, 55, (byte) '='};

    private static final int posAmtHeaderLength = 4;
    private static final byte[] posAmtHeader = new byte[] {55, 48, 56, (byte) '='};

    private final MutableDirectBuffer posAmtType = new UnsafeBuffer();

    private int posAmtTypeOffset = 0;

    private int posAmtTypeLength = 0;

    public PosAmtGroupEncoder posAmtType(final DirectBuffer value, final int offset, final int length)
    {
        posAmtType.wrap(value);
        posAmtTypeOffset = offset;
        posAmtTypeLength = length;
        return this;
    }

    public PosAmtGroupEncoder posAmtType(final DirectBuffer value, final int length)
    {
        return posAmtType(value, 0, length);
    }

    public PosAmtGroupEncoder posAmtType(final DirectBuffer value)
    {
        return posAmtType(value, 0, value.capacity());
    }

    public PosAmtGroupEncoder posAmtType(final byte[] value, final int offset, final int length)
    {
        posAmtType.wrap(value);
        posAmtTypeOffset = offset;
        posAmtTypeLength = length;
        return this;
    }

    public PosAmtGroupEncoder posAmtTypeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(posAmtType, value, offset, length);
        posAmtTypeOffset = offset;
        posAmtTypeLength = length;
        return this;
    }

    public PosAmtGroupEncoder posAmtType(final byte[] value, final int length)
    {
        return posAmtType(value, 0, length);
    }

    public PosAmtGroupEncoder posAmtType(final byte[] value)
    {
        return posAmtType(value, 0, value.length);
    }

    public boolean hasPosAmtType()
    {
        return posAmtTypeLength > 0;
    }

    public MutableDirectBuffer posAmtType()
    {
        return posAmtType;
    }

    public String posAmtTypeAsString()
    {
        return posAmtType.getStringWithoutLengthAscii(posAmtTypeOffset, posAmtTypeLength);
    }

    public PosAmtGroupEncoder posAmtType(final CharSequence value)
    {
        toBytes(value, posAmtType);
        posAmtTypeOffset = 0;
        posAmtTypeLength = value.length();
        return this;
    }

    public PosAmtGroupEncoder posAmtType(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            posAmtType.wrap(buffer);
            posAmtTypeOffset = value.offset();
            posAmtTypeLength = value.length();
        }
        return this;
    }

    public PosAmtGroupEncoder posAmtType(final char[] value)
    {
        return posAmtType(value, 0, value.length);
    }

    public PosAmtGroupEncoder posAmtType(final char[] value, final int length)
    {
        return posAmtType(value, 0, length);
    }

    public PosAmtGroupEncoder posAmtType(final char[] value, final int offset, final int length)
    {
        toBytes(value, posAmtType, offset, length);
        posAmtTypeOffset = 0;
        posAmtTypeLength = length;
        return this;
    }

    public PosAmtGroupEncoder posAmtType(PosAmtType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == PosAmtType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: posAmtType Value: " + value );
            }
            if (value == PosAmtType.NULL_VAL)
            {
                return this;
            }
        }
        return posAmtType(value.representation());
    }

    private final DecimalFloat posAmt = new DecimalFloat();

    private boolean hasPosAmt;

    public boolean hasPosAmt()
    {
        return hasPosAmt;
    }

    public PosAmtGroupEncoder posAmt(DecimalFloat value)
    {
        posAmt.set(value);
        hasPosAmt = true;
        return this;
    }

    public PosAmtGroupEncoder posAmt(long value, int scale)
    {
        posAmt.set(value, scale);
        hasPosAmt = true;
        return this;
    }

    public DecimalFloat posAmt()
    {
        return posAmt;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (posAmtTypeLength > 0)
        {
            buffer.putBytes(position, posAmtTypeHeader, 0, posAmtTypeHeaderLength);
            position += posAmtTypeHeaderLength;
            buffer.putBytes(position, posAmtType, posAmtTypeOffset, posAmtTypeLength);
            position += posAmtTypeLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: PosAmtType");
        }

        if (hasPosAmt)
        {
            buffer.putBytes(position, posAmtHeader, 0, posAmtHeaderLength);
            position += posAmtHeaderLength;
            position += buffer.putFloatAscii(position, posAmt);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: PosAmt");
        }
        if (next != null)
        {
            position += next.encode(buffer, position, remainingElements - 1);
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetPosAmtType();
        this.resetPosAmt();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetPosAmtType()
    {
        posAmtTypeLength = 0;
    }

    public void resetPosAmt()
    {
        hasPosAmt = false;
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
        builder.append("\"MessageName\": \"PosAmtGroup\",\n");
        if (hasPosAmtType())
        {
            indent(builder, level);
            builder.append("\"PosAmtType\": \"");
            appendBuffer(builder, posAmtType, posAmtTypeOffset, posAmtTypeLength);
            builder.append("\",\n");
        }

        if (hasPosAmt())
        {
            indent(builder, level);
            builder.append("\"PosAmt\": \"");
            posAmt.appendTo(builder);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public PosAmtGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((PosAmtGroupEncoder)encoder);
    }

    public PosAmtGroupEncoder copyTo(final PosAmtGroupEncoder encoder)
    {
        encoder.reset();
        if (hasPosAmtType())
        {
            encoder.posAmtTypeAsCopy(posAmtType.byteArray(), 0, posAmtTypeLength);
        }

        if (hasPosAmt())
        {
            encoder.posAmt(this.posAmt());
        }
        return encoder;
    }

}
    private int noPosAmtGroupCounter;

    private boolean hasNoPosAmtGroupCounter;

    public boolean hasNoPosAmtGroupCounter()
    {
        return hasNoPosAmtGroupCounter;
    }

    public PositionAmountDataEncoder noPosAmtGroupCounter(int value)
    {
        noPosAmtGroupCounter = value;
        hasNoPosAmtGroupCounter = true;
        return this;
    }

    public int noPosAmtGroupCounter()
    {
        return noPosAmtGroupCounter;
    }


    private PosAmtGroupEncoder posAmtGroup = null;

    public PosAmtGroupEncoder posAmtGroup(final int numberOfElements)
    {
        hasNoPosAmtGroupCounter = true;
        noPosAmtGroupCounter = numberOfElements;
        if (posAmtGroup == null)
        {
            posAmtGroup = new PosAmtGroupEncoder();
        }
        return posAmtGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoPosAmtGroupCounter)
        {
            buffer.putBytes(position, noPosAmtGroupCounterHeader, 0, noPosAmtGroupCounterHeaderLength);
            position += noPosAmtGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noPosAmtGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (posAmtGroup != null)
        {
            position += posAmtGroup.encode(buffer, position, noPosAmtGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetPosAmtGroup();
    }

    public void resetPosAmtGroup()
    {
        if (posAmtGroup != null)
        {
            posAmtGroup.reset();
        }
        noPosAmtGroupCounter = 0;
        hasNoPosAmtGroupCounter = false;
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
        builder.append("\"MessageName\": \"PositionAmountData\",\n");
        if (hasNoPosAmtGroupCounter)
        {
            indent(builder, level);
            builder.append("\"PosAmtGroup\": [\n");
            final int noPosAmtGroupCounter = this.noPosAmtGroupCounter;
            PosAmtGroupEncoder posAmtGroup = this.posAmtGroup;
            for (int i = 0; i < noPosAmtGroupCounter; i++)
            {
                indent(builder, level);
                posAmtGroup.appendTo(builder, level + 1);
                if (i < (noPosAmtGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                posAmtGroup = posAmtGroup.next();
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
    public PositionAmountDataEncoder copyTo(final Encoder encoder)
    {
        return copyTo((PositionAmountDataEncoder)encoder);
    }

    public PositionAmountDataEncoder copyTo(final PositionAmountDataEncoder encoder)
    {
        encoder.reset();
        if (hasNoPosAmtGroupCounter)
        {
            final int size = this.noPosAmtGroupCounter;
            PosAmtGroupEncoder posAmtGroup = this.posAmtGroup;
            PosAmtGroupEncoder posAmtGroupEncoder = encoder.posAmtGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (posAmtGroup != null)
                {
                    posAmtGroup.copyTo(posAmtGroupEncoder);
                    posAmtGroup = posAmtGroup.next();
                    posAmtGroupEncoder = posAmtGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
