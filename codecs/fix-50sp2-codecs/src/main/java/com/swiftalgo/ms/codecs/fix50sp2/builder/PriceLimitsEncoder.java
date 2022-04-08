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


public class PriceLimitsEncoder
{
    private static final int priceLimitTypeHeaderLength = 5;
    private static final byte[] priceLimitTypeHeader = new byte[] {49, 51, 48, 54, (byte) '='};

    private static final int lowLimitPriceHeaderLength = 5;
    private static final byte[] lowLimitPriceHeader = new byte[] {49, 49, 52, 56, (byte) '='};

    private static final int highLimitPriceHeaderLength = 5;
    private static final byte[] highLimitPriceHeader = new byte[] {49, 49, 52, 57, (byte) '='};

    private static final int tradingReferencePriceHeaderLength = 5;
    private static final byte[] tradingReferencePriceHeader = new byte[] {49, 49, 53, 48, (byte) '='};

    private int priceLimitType;

    private boolean hasPriceLimitType;

    public boolean hasPriceLimitType()
    {
        return hasPriceLimitType;
    }

    public PriceLimitsEncoder priceLimitType(int value)
    {
        priceLimitType = value;
        hasPriceLimitType = true;
        return this;
    }

    public int priceLimitType()
    {
        return priceLimitType;
    }

    public PriceLimitsEncoder priceLimitType(PriceLimitType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == PriceLimitType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: priceLimitType Value: " + value );
            }
            if (value == PriceLimitType.NULL_VAL)
            {
                return this;
            }
        }
        return priceLimitType(value.representation());
    }

    private final DecimalFloat lowLimitPrice = new DecimalFloat();

    private boolean hasLowLimitPrice;

    public boolean hasLowLimitPrice()
    {
        return hasLowLimitPrice;
    }

    public PriceLimitsEncoder lowLimitPrice(DecimalFloat value)
    {
        lowLimitPrice.set(value);
        hasLowLimitPrice = true;
        return this;
    }

    public PriceLimitsEncoder lowLimitPrice(long value, int scale)
    {
        lowLimitPrice.set(value, scale);
        hasLowLimitPrice = true;
        return this;
    }

    public DecimalFloat lowLimitPrice()
    {
        return lowLimitPrice;
    }

    private final DecimalFloat highLimitPrice = new DecimalFloat();

    private boolean hasHighLimitPrice;

    public boolean hasHighLimitPrice()
    {
        return hasHighLimitPrice;
    }

    public PriceLimitsEncoder highLimitPrice(DecimalFloat value)
    {
        highLimitPrice.set(value);
        hasHighLimitPrice = true;
        return this;
    }

    public PriceLimitsEncoder highLimitPrice(long value, int scale)
    {
        highLimitPrice.set(value, scale);
        hasHighLimitPrice = true;
        return this;
    }

    public DecimalFloat highLimitPrice()
    {
        return highLimitPrice;
    }

    private final DecimalFloat tradingReferencePrice = new DecimalFloat();

    private boolean hasTradingReferencePrice;

    public boolean hasTradingReferencePrice()
    {
        return hasTradingReferencePrice;
    }

    public PriceLimitsEncoder tradingReferencePrice(DecimalFloat value)
    {
        tradingReferencePrice.set(value);
        hasTradingReferencePrice = true;
        return this;
    }

    public PriceLimitsEncoder tradingReferencePrice(long value, int scale)
    {
        tradingReferencePrice.set(value, scale);
        hasTradingReferencePrice = true;
        return this;
    }

    public DecimalFloat tradingReferencePrice()
    {
        return tradingReferencePrice;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasPriceLimitType)
        {
            buffer.putBytes(position, priceLimitTypeHeader, 0, priceLimitTypeHeaderLength);
            position += priceLimitTypeHeaderLength;
            position += buffer.putIntAscii(position, priceLimitType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasLowLimitPrice)
        {
            buffer.putBytes(position, lowLimitPriceHeader, 0, lowLimitPriceHeaderLength);
            position += lowLimitPriceHeaderLength;
            position += buffer.putFloatAscii(position, lowLimitPrice);
            buffer.putSeparator(position);
            position++;
        }

        if (hasHighLimitPrice)
        {
            buffer.putBytes(position, highLimitPriceHeader, 0, highLimitPriceHeaderLength);
            position += highLimitPriceHeaderLength;
            position += buffer.putFloatAscii(position, highLimitPrice);
            buffer.putSeparator(position);
            position++;
        }

        if (hasTradingReferencePrice)
        {
            buffer.putBytes(position, tradingReferencePriceHeader, 0, tradingReferencePriceHeaderLength);
            position += tradingReferencePriceHeaderLength;
            position += buffer.putFloatAscii(position, tradingReferencePrice);
            buffer.putSeparator(position);
            position++;
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetPriceLimitType();
        this.resetLowLimitPrice();
        this.resetHighLimitPrice();
        this.resetTradingReferencePrice();
    }

    public void resetPriceLimitType()
    {
        hasPriceLimitType = false;
    }

    public void resetLowLimitPrice()
    {
        hasLowLimitPrice = false;
    }

    public void resetHighLimitPrice()
    {
        hasHighLimitPrice = false;
    }

    public void resetTradingReferencePrice()
    {
        hasTradingReferencePrice = false;
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
        builder.append("\"MessageName\": \"PriceLimits\",\n");
        if (hasPriceLimitType())
        {
            indent(builder, level);
            builder.append("\"PriceLimitType\": \"");
            builder.append(priceLimitType);
            builder.append("\",\n");
        }

        if (hasLowLimitPrice())
        {
            indent(builder, level);
            builder.append("\"LowLimitPrice\": \"");
            lowLimitPrice.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasHighLimitPrice())
        {
            indent(builder, level);
            builder.append("\"HighLimitPrice\": \"");
            highLimitPrice.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasTradingReferencePrice())
        {
            indent(builder, level);
            builder.append("\"TradingReferencePrice\": \"");
            tradingReferencePrice.appendTo(builder);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public PriceLimitsEncoder copyTo(final Encoder encoder)
    {
        return copyTo((PriceLimitsEncoder)encoder);
    }

    public PriceLimitsEncoder copyTo(final PriceLimitsEncoder encoder)
    {
        encoder.reset();
        if (hasPriceLimitType())
        {
            encoder.priceLimitType(this.priceLimitType());
        }

        if (hasLowLimitPrice())
        {
            encoder.lowLimitPrice(this.lowLimitPrice());
        }

        if (hasHighLimitPrice())
        {
            encoder.highLimitPrice(this.highLimitPrice());
        }

        if (hasTradingReferencePrice())
        {
            encoder.tradingReferencePrice(this.tradingReferencePrice());
        }
        return encoder;
    }

}
