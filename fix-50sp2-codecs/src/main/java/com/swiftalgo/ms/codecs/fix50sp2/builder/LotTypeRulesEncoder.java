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


public class LotTypeRulesEncoder
{
    private static final int noLotTypeRulesGroupCounterHeaderLength = 5;
    private static final byte[] noLotTypeRulesGroupCounterHeader = new byte[] {49, 50, 51, 52, (byte) '='};



public static class LotTypeRulesGroupEncoder
{
    private LotTypeRulesGroupEncoder next = null;

    public LotTypeRulesGroupEncoder next()
    {
        if (next == null)
        {
            next = new LotTypeRulesGroupEncoder();
        }
        return next;
    }

    private static final int lotTypeHeaderLength = 5;
    private static final byte[] lotTypeHeader = new byte[] {49, 48, 57, 51, (byte) '='};

    private static final int minLotSizeHeaderLength = 5;
    private static final byte[] minLotSizeHeader = new byte[] {49, 50, 51, 49, (byte) '='};

    private char lotType;

    private boolean hasLotType;

    public boolean hasLotType()
    {
        return hasLotType;
    }

    public LotTypeRulesGroupEncoder lotType(char value)
    {
        lotType = value;
        hasLotType = true;
        return this;
    }

    public char lotType()
    {
        return lotType;
    }

    public LotTypeRulesGroupEncoder lotType(LotType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == LotType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: lotType Value: " + value );
            }
            if (value == LotType.NULL_VAL)
            {
                return this;
            }
        }
        return lotType(value.representation());
    }

    private final DecimalFloat minLotSize = new DecimalFloat();

    private boolean hasMinLotSize;

    public boolean hasMinLotSize()
    {
        return hasMinLotSize;
    }

    public LotTypeRulesGroupEncoder minLotSize(DecimalFloat value)
    {
        minLotSize.set(value);
        hasMinLotSize = true;
        return this;
    }

    public LotTypeRulesGroupEncoder minLotSize(long value, int scale)
    {
        minLotSize.set(value, scale);
        hasMinLotSize = true;
        return this;
    }

    public DecimalFloat minLotSize()
    {
        return minLotSize;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (hasLotType)
        {
            buffer.putBytes(position, lotTypeHeader, 0, lotTypeHeaderLength);
            position += lotTypeHeaderLength;
            position += buffer.putCharAscii(position, lotType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasMinLotSize)
        {
            buffer.putBytes(position, minLotSizeHeader, 0, minLotSizeHeaderLength);
            position += minLotSizeHeaderLength;
            position += buffer.putFloatAscii(position, minLotSize);
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
        this.resetLotType();
        this.resetMinLotSize();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetLotType()
    {
        hasLotType = false;
    }

    public void resetMinLotSize()
    {
        hasMinLotSize = false;
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
        builder.append("\"MessageName\": \"LotTypeRulesGroup\",\n");
        if (hasLotType())
        {
            indent(builder, level);
            builder.append("\"LotType\": \"");
            builder.append(lotType);
            builder.append("\",\n");
        }

        if (hasMinLotSize())
        {
            indent(builder, level);
            builder.append("\"MinLotSize\": \"");
            minLotSize.appendTo(builder);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public LotTypeRulesGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((LotTypeRulesGroupEncoder)encoder);
    }

    public LotTypeRulesGroupEncoder copyTo(final LotTypeRulesGroupEncoder encoder)
    {
        encoder.reset();
        if (hasLotType())
        {
            encoder.lotType(this.lotType());
        }

        if (hasMinLotSize())
        {
            encoder.minLotSize(this.minLotSize());
        }
        return encoder;
    }

}
    private int noLotTypeRulesGroupCounter;

    private boolean hasNoLotTypeRulesGroupCounter;

    public boolean hasNoLotTypeRulesGroupCounter()
    {
        return hasNoLotTypeRulesGroupCounter;
    }

    public LotTypeRulesEncoder noLotTypeRulesGroupCounter(int value)
    {
        noLotTypeRulesGroupCounter = value;
        hasNoLotTypeRulesGroupCounter = true;
        return this;
    }

    public int noLotTypeRulesGroupCounter()
    {
        return noLotTypeRulesGroupCounter;
    }


    private LotTypeRulesGroupEncoder lotTypeRulesGroup = null;

    public LotTypeRulesGroupEncoder lotTypeRulesGroup(final int numberOfElements)
    {
        hasNoLotTypeRulesGroupCounter = true;
        noLotTypeRulesGroupCounter = numberOfElements;
        if (lotTypeRulesGroup == null)
        {
            lotTypeRulesGroup = new LotTypeRulesGroupEncoder();
        }
        return lotTypeRulesGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoLotTypeRulesGroupCounter)
        {
            buffer.putBytes(position, noLotTypeRulesGroupCounterHeader, 0, noLotTypeRulesGroupCounterHeaderLength);
            position += noLotTypeRulesGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noLotTypeRulesGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (lotTypeRulesGroup != null)
        {
            position += lotTypeRulesGroup.encode(buffer, position, noLotTypeRulesGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetLotTypeRulesGroup();
    }

    public void resetLotTypeRulesGroup()
    {
        if (lotTypeRulesGroup != null)
        {
            lotTypeRulesGroup.reset();
        }
        noLotTypeRulesGroupCounter = 0;
        hasNoLotTypeRulesGroupCounter = false;
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
        builder.append("\"MessageName\": \"LotTypeRules\",\n");
        if (hasNoLotTypeRulesGroupCounter)
        {
            indent(builder, level);
            builder.append("\"LotTypeRulesGroup\": [\n");
            final int noLotTypeRulesGroupCounter = this.noLotTypeRulesGroupCounter;
            LotTypeRulesGroupEncoder lotTypeRulesGroup = this.lotTypeRulesGroup;
            for (int i = 0; i < noLotTypeRulesGroupCounter; i++)
            {
                indent(builder, level);
                lotTypeRulesGroup.appendTo(builder, level + 1);
                if (i < (noLotTypeRulesGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                lotTypeRulesGroup = lotTypeRulesGroup.next();
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
    public LotTypeRulesEncoder copyTo(final Encoder encoder)
    {
        return copyTo((LotTypeRulesEncoder)encoder);
    }

    public LotTypeRulesEncoder copyTo(final LotTypeRulesEncoder encoder)
    {
        encoder.reset();
        if (hasNoLotTypeRulesGroupCounter)
        {
            final int size = this.noLotTypeRulesGroupCounter;
            LotTypeRulesGroupEncoder lotTypeRulesGroup = this.lotTypeRulesGroup;
            LotTypeRulesGroupEncoder lotTypeRulesGroupEncoder = encoder.lotTypeRulesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (lotTypeRulesGroup != null)
                {
                    lotTypeRulesGroup.copyTo(lotTypeRulesGroupEncoder);
                    lotTypeRulesGroup = lotTypeRulesGroup.next();
                    lotTypeRulesGroupEncoder = lotTypeRulesGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
