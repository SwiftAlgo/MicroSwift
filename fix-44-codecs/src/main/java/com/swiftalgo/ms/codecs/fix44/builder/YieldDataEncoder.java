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


public class YieldDataEncoder
{
    private static final int yieldTypeHeaderLength = 4;
    private static final byte[] yieldTypeHeader = new byte[] {50, 51, 53, (byte) '='};

    private static final int yieldHeaderLength = 4;
    private static final byte[] yieldHeader = new byte[] {50, 51, 54, (byte) '='};

    private static final int yieldCalcDateHeaderLength = 4;
    private static final byte[] yieldCalcDateHeader = new byte[] {55, 48, 49, (byte) '='};

    private static final int yieldRedemptionDateHeaderLength = 4;
    private static final byte[] yieldRedemptionDateHeader = new byte[] {54, 57, 54, (byte) '='};

    private static final int yieldRedemptionPriceHeaderLength = 4;
    private static final byte[] yieldRedemptionPriceHeader = new byte[] {54, 57, 55, (byte) '='};

    private static final int yieldRedemptionPriceTypeHeaderLength = 4;
    private static final byte[] yieldRedemptionPriceTypeHeader = new byte[] {54, 57, 56, (byte) '='};

    private final MutableDirectBuffer yieldType = new UnsafeBuffer();

    private int yieldTypeOffset = 0;

    private int yieldTypeLength = 0;

    public YieldDataEncoder yieldType(final DirectBuffer value, final int offset, final int length)
    {
        yieldType.wrap(value);
        yieldTypeOffset = offset;
        yieldTypeLength = length;
        return this;
    }

    public YieldDataEncoder yieldType(final DirectBuffer value, final int length)
    {
        return yieldType(value, 0, length);
    }

    public YieldDataEncoder yieldType(final DirectBuffer value)
    {
        return yieldType(value, 0, value.capacity());
    }

    public YieldDataEncoder yieldType(final byte[] value, final int offset, final int length)
    {
        yieldType.wrap(value);
        yieldTypeOffset = offset;
        yieldTypeLength = length;
        return this;
    }

    public YieldDataEncoder yieldTypeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(yieldType, value, offset, length);
        yieldTypeOffset = offset;
        yieldTypeLength = length;
        return this;
    }

    public YieldDataEncoder yieldType(final byte[] value, final int length)
    {
        return yieldType(value, 0, length);
    }

    public YieldDataEncoder yieldType(final byte[] value)
    {
        return yieldType(value, 0, value.length);
    }

    public boolean hasYieldType()
    {
        return yieldTypeLength > 0;
    }

    public MutableDirectBuffer yieldType()
    {
        return yieldType;
    }

    public String yieldTypeAsString()
    {
        return yieldType.getStringWithoutLengthAscii(yieldTypeOffset, yieldTypeLength);
    }

    public YieldDataEncoder yieldType(final CharSequence value)
    {
        toBytes(value, yieldType);
        yieldTypeOffset = 0;
        yieldTypeLength = value.length();
        return this;
    }

    public YieldDataEncoder yieldType(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            yieldType.wrap(buffer);
            yieldTypeOffset = value.offset();
            yieldTypeLength = value.length();
        }
        return this;
    }

    public YieldDataEncoder yieldType(final char[] value)
    {
        return yieldType(value, 0, value.length);
    }

    public YieldDataEncoder yieldType(final char[] value, final int length)
    {
        return yieldType(value, 0, length);
    }

    public YieldDataEncoder yieldType(final char[] value, final int offset, final int length)
    {
        toBytes(value, yieldType, offset, length);
        yieldTypeOffset = 0;
        yieldTypeLength = length;
        return this;
    }

    public YieldDataEncoder yieldType(YieldType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == YieldType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: yieldType Value: " + value );
            }
            if (value == YieldType.NULL_VAL)
            {
                return this;
            }
        }
        return yieldType(value.representation());
    }

    private final DecimalFloat yield = new DecimalFloat();

    private boolean hasYield;

    public boolean hasYield()
    {
        return hasYield;
    }

    public YieldDataEncoder yield(DecimalFloat value)
    {
        yield.set(value);
        hasYield = true;
        return this;
    }

    public YieldDataEncoder yield(long value, int scale)
    {
        yield.set(value, scale);
        hasYield = true;
        return this;
    }

    public DecimalFloat yield()
    {
        return yield;
    }

    private final MutableDirectBuffer yieldCalcDate = new UnsafeBuffer();

    private int yieldCalcDateOffset = 0;

    private int yieldCalcDateLength = 0;

    public YieldDataEncoder yieldCalcDate(final DirectBuffer value, final int offset, final int length)
    {
        yieldCalcDate.wrap(value);
        yieldCalcDateOffset = offset;
        yieldCalcDateLength = length;
        return this;
    }

    public YieldDataEncoder yieldCalcDate(final DirectBuffer value, final int length)
    {
        return yieldCalcDate(value, 0, length);
    }

    public YieldDataEncoder yieldCalcDate(final DirectBuffer value)
    {
        return yieldCalcDate(value, 0, value.capacity());
    }

    public YieldDataEncoder yieldCalcDate(final byte[] value, final int offset, final int length)
    {
        yieldCalcDate.wrap(value);
        yieldCalcDateOffset = offset;
        yieldCalcDateLength = length;
        return this;
    }

    public YieldDataEncoder yieldCalcDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(yieldCalcDate, value, offset, length);
        yieldCalcDateOffset = offset;
        yieldCalcDateLength = length;
        return this;
    }

    public YieldDataEncoder yieldCalcDate(final byte[] value, final int length)
    {
        return yieldCalcDate(value, 0, length);
    }

    public YieldDataEncoder yieldCalcDate(final byte[] value)
    {
        return yieldCalcDate(value, 0, value.length);
    }

    public boolean hasYieldCalcDate()
    {
        return yieldCalcDateLength > 0;
    }

    public MutableDirectBuffer yieldCalcDate()
    {
        return yieldCalcDate;
    }

    public String yieldCalcDateAsString()
    {
        return yieldCalcDate.getStringWithoutLengthAscii(yieldCalcDateOffset, yieldCalcDateLength);
    }

    private final MutableDirectBuffer yieldRedemptionDate = new UnsafeBuffer();

    private int yieldRedemptionDateOffset = 0;

    private int yieldRedemptionDateLength = 0;

    public YieldDataEncoder yieldRedemptionDate(final DirectBuffer value, final int offset, final int length)
    {
        yieldRedemptionDate.wrap(value);
        yieldRedemptionDateOffset = offset;
        yieldRedemptionDateLength = length;
        return this;
    }

    public YieldDataEncoder yieldRedemptionDate(final DirectBuffer value, final int length)
    {
        return yieldRedemptionDate(value, 0, length);
    }

    public YieldDataEncoder yieldRedemptionDate(final DirectBuffer value)
    {
        return yieldRedemptionDate(value, 0, value.capacity());
    }

    public YieldDataEncoder yieldRedemptionDate(final byte[] value, final int offset, final int length)
    {
        yieldRedemptionDate.wrap(value);
        yieldRedemptionDateOffset = offset;
        yieldRedemptionDateLength = length;
        return this;
    }

    public YieldDataEncoder yieldRedemptionDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(yieldRedemptionDate, value, offset, length);
        yieldRedemptionDateOffset = offset;
        yieldRedemptionDateLength = length;
        return this;
    }

    public YieldDataEncoder yieldRedemptionDate(final byte[] value, final int length)
    {
        return yieldRedemptionDate(value, 0, length);
    }

    public YieldDataEncoder yieldRedemptionDate(final byte[] value)
    {
        return yieldRedemptionDate(value, 0, value.length);
    }

    public boolean hasYieldRedemptionDate()
    {
        return yieldRedemptionDateLength > 0;
    }

    public MutableDirectBuffer yieldRedemptionDate()
    {
        return yieldRedemptionDate;
    }

    public String yieldRedemptionDateAsString()
    {
        return yieldRedemptionDate.getStringWithoutLengthAscii(yieldRedemptionDateOffset, yieldRedemptionDateLength);
    }

    private final DecimalFloat yieldRedemptionPrice = new DecimalFloat();

    private boolean hasYieldRedemptionPrice;

    public boolean hasYieldRedemptionPrice()
    {
        return hasYieldRedemptionPrice;
    }

    public YieldDataEncoder yieldRedemptionPrice(DecimalFloat value)
    {
        yieldRedemptionPrice.set(value);
        hasYieldRedemptionPrice = true;
        return this;
    }

    public YieldDataEncoder yieldRedemptionPrice(long value, int scale)
    {
        yieldRedemptionPrice.set(value, scale);
        hasYieldRedemptionPrice = true;
        return this;
    }

    public DecimalFloat yieldRedemptionPrice()
    {
        return yieldRedemptionPrice;
    }

    private int yieldRedemptionPriceType;

    private boolean hasYieldRedemptionPriceType;

    public boolean hasYieldRedemptionPriceType()
    {
        return hasYieldRedemptionPriceType;
    }

    public YieldDataEncoder yieldRedemptionPriceType(int value)
    {
        yieldRedemptionPriceType = value;
        hasYieldRedemptionPriceType = true;
        return this;
    }

    public int yieldRedemptionPriceType()
    {
        return yieldRedemptionPriceType;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (yieldTypeLength > 0)
        {
            buffer.putBytes(position, yieldTypeHeader, 0, yieldTypeHeaderLength);
            position += yieldTypeHeaderLength;
            buffer.putBytes(position, yieldType, yieldTypeOffset, yieldTypeLength);
            position += yieldTypeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasYield)
        {
            buffer.putBytes(position, yieldHeader, 0, yieldHeaderLength);
            position += yieldHeaderLength;
            position += buffer.putFloatAscii(position, yield);
            buffer.putSeparator(position);
            position++;
        }

        if (yieldCalcDateLength > 0)
        {
            buffer.putBytes(position, yieldCalcDateHeader, 0, yieldCalcDateHeaderLength);
            position += yieldCalcDateHeaderLength;
            buffer.putBytes(position, yieldCalcDate, yieldCalcDateOffset, yieldCalcDateLength);
            position += yieldCalcDateLength;
            buffer.putSeparator(position);
            position++;
        }

        if (yieldRedemptionDateLength > 0)
        {
            buffer.putBytes(position, yieldRedemptionDateHeader, 0, yieldRedemptionDateHeaderLength);
            position += yieldRedemptionDateHeaderLength;
            buffer.putBytes(position, yieldRedemptionDate, yieldRedemptionDateOffset, yieldRedemptionDateLength);
            position += yieldRedemptionDateLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasYieldRedemptionPrice)
        {
            buffer.putBytes(position, yieldRedemptionPriceHeader, 0, yieldRedemptionPriceHeaderLength);
            position += yieldRedemptionPriceHeaderLength;
            position += buffer.putFloatAscii(position, yieldRedemptionPrice);
            buffer.putSeparator(position);
            position++;
        }

        if (hasYieldRedemptionPriceType)
        {
            buffer.putBytes(position, yieldRedemptionPriceTypeHeader, 0, yieldRedemptionPriceTypeHeaderLength);
            position += yieldRedemptionPriceTypeHeaderLength;
            position += buffer.putIntAscii(position, yieldRedemptionPriceType);
            buffer.putSeparator(position);
            position++;
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetYieldType();
        this.resetYield();
        this.resetYieldCalcDate();
        this.resetYieldRedemptionDate();
        this.resetYieldRedemptionPrice();
        this.resetYieldRedemptionPriceType();
    }

    public void resetYieldType()
    {
        yieldTypeLength = 0;
    }

    public void resetYield()
    {
        hasYield = false;
    }

    public void resetYieldCalcDate()
    {
        yieldCalcDateLength = 0;
    }

    public void resetYieldRedemptionDate()
    {
        yieldRedemptionDateLength = 0;
    }

    public void resetYieldRedemptionPrice()
    {
        hasYieldRedemptionPrice = false;
    }

    public void resetYieldRedemptionPriceType()
    {
        hasYieldRedemptionPriceType = false;
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
        builder.append("\"MessageName\": \"YieldData\",\n");
        if (hasYieldType())
        {
            indent(builder, level);
            builder.append("\"YieldType\": \"");
            appendBuffer(builder, yieldType, yieldTypeOffset, yieldTypeLength);
            builder.append("\",\n");
        }

        if (hasYield())
        {
            indent(builder, level);
            builder.append("\"Yield\": \"");
            yield.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasYieldCalcDate())
        {
            indent(builder, level);
            builder.append("\"YieldCalcDate\": \"");
            appendBuffer(builder, yieldCalcDate, yieldCalcDateOffset, yieldCalcDateLength);
            builder.append("\",\n");
        }

        if (hasYieldRedemptionDate())
        {
            indent(builder, level);
            builder.append("\"YieldRedemptionDate\": \"");
            appendBuffer(builder, yieldRedemptionDate, yieldRedemptionDateOffset, yieldRedemptionDateLength);
            builder.append("\",\n");
        }

        if (hasYieldRedemptionPrice())
        {
            indent(builder, level);
            builder.append("\"YieldRedemptionPrice\": \"");
            yieldRedemptionPrice.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasYieldRedemptionPriceType())
        {
            indent(builder, level);
            builder.append("\"YieldRedemptionPriceType\": \"");
            builder.append(yieldRedemptionPriceType);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public YieldDataEncoder copyTo(final Encoder encoder)
    {
        return copyTo((YieldDataEncoder)encoder);
    }

    public YieldDataEncoder copyTo(final YieldDataEncoder encoder)
    {
        encoder.reset();
        if (hasYieldType())
        {
            encoder.yieldTypeAsCopy(yieldType.byteArray(), 0, yieldTypeLength);
        }

        if (hasYield())
        {
            encoder.yield(this.yield());
        }

        if (hasYieldCalcDate())
        {
            encoder.yieldCalcDateAsCopy(yieldCalcDate.byteArray(), 0, yieldCalcDateLength);
        }

        if (hasYieldRedemptionDate())
        {
            encoder.yieldRedemptionDateAsCopy(yieldRedemptionDate.byteArray(), 0, yieldRedemptionDateLength);
        }

        if (hasYieldRedemptionPrice())
        {
            encoder.yieldRedemptionPrice(this.yieldRedemptionPrice());
        }

        if (hasYieldRedemptionPriceType())
        {
            encoder.yieldRedemptionPriceType(this.yieldRedemptionPriceType());
        }
        return encoder;
    }

}
