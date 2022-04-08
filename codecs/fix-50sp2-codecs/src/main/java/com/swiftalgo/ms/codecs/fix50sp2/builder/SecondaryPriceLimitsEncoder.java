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


public class SecondaryPriceLimitsEncoder
{
    private static final int secondaryPriceLimitTypeHeaderLength = 5;
    private static final byte[] secondaryPriceLimitTypeHeader = new byte[] {49, 51, 48, 53, (byte) '='};

    private static final int secondaryLowLimitPriceHeaderLength = 5;
    private static final byte[] secondaryLowLimitPriceHeader = new byte[] {49, 50, 50, 49, (byte) '='};

    private static final int secondaryHighLimitPriceHeaderLength = 5;
    private static final byte[] secondaryHighLimitPriceHeader = new byte[] {49, 50, 51, 48, (byte) '='};

    private static final int secondaryTradingReferencePriceHeaderLength = 5;
    private static final byte[] secondaryTradingReferencePriceHeader = new byte[] {49, 50, 52, 48, (byte) '='};

    private int secondaryPriceLimitType;

    private boolean hasSecondaryPriceLimitType;

    public boolean hasSecondaryPriceLimitType()
    {
        return hasSecondaryPriceLimitType;
    }

    public SecondaryPriceLimitsEncoder secondaryPriceLimitType(int value)
    {
        secondaryPriceLimitType = value;
        hasSecondaryPriceLimitType = true;
        return this;
    }

    public int secondaryPriceLimitType()
    {
        return secondaryPriceLimitType;
    }

    private final DecimalFloat secondaryLowLimitPrice = new DecimalFloat();

    private boolean hasSecondaryLowLimitPrice;

    public boolean hasSecondaryLowLimitPrice()
    {
        return hasSecondaryLowLimitPrice;
    }

    public SecondaryPriceLimitsEncoder secondaryLowLimitPrice(DecimalFloat value)
    {
        secondaryLowLimitPrice.set(value);
        hasSecondaryLowLimitPrice = true;
        return this;
    }

    public SecondaryPriceLimitsEncoder secondaryLowLimitPrice(long value, int scale)
    {
        secondaryLowLimitPrice.set(value, scale);
        hasSecondaryLowLimitPrice = true;
        return this;
    }

    public DecimalFloat secondaryLowLimitPrice()
    {
        return secondaryLowLimitPrice;
    }

    private final DecimalFloat secondaryHighLimitPrice = new DecimalFloat();

    private boolean hasSecondaryHighLimitPrice;

    public boolean hasSecondaryHighLimitPrice()
    {
        return hasSecondaryHighLimitPrice;
    }

    public SecondaryPriceLimitsEncoder secondaryHighLimitPrice(DecimalFloat value)
    {
        secondaryHighLimitPrice.set(value);
        hasSecondaryHighLimitPrice = true;
        return this;
    }

    public SecondaryPriceLimitsEncoder secondaryHighLimitPrice(long value, int scale)
    {
        secondaryHighLimitPrice.set(value, scale);
        hasSecondaryHighLimitPrice = true;
        return this;
    }

    public DecimalFloat secondaryHighLimitPrice()
    {
        return secondaryHighLimitPrice;
    }

    private final DecimalFloat secondaryTradingReferencePrice = new DecimalFloat();

    private boolean hasSecondaryTradingReferencePrice;

    public boolean hasSecondaryTradingReferencePrice()
    {
        return hasSecondaryTradingReferencePrice;
    }

    public SecondaryPriceLimitsEncoder secondaryTradingReferencePrice(DecimalFloat value)
    {
        secondaryTradingReferencePrice.set(value);
        hasSecondaryTradingReferencePrice = true;
        return this;
    }

    public SecondaryPriceLimitsEncoder secondaryTradingReferencePrice(long value, int scale)
    {
        secondaryTradingReferencePrice.set(value, scale);
        hasSecondaryTradingReferencePrice = true;
        return this;
    }

    public DecimalFloat secondaryTradingReferencePrice()
    {
        return secondaryTradingReferencePrice;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasSecondaryPriceLimitType)
        {
            buffer.putBytes(position, secondaryPriceLimitTypeHeader, 0, secondaryPriceLimitTypeHeaderLength);
            position += secondaryPriceLimitTypeHeaderLength;
            position += buffer.putIntAscii(position, secondaryPriceLimitType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasSecondaryLowLimitPrice)
        {
            buffer.putBytes(position, secondaryLowLimitPriceHeader, 0, secondaryLowLimitPriceHeaderLength);
            position += secondaryLowLimitPriceHeaderLength;
            position += buffer.putFloatAscii(position, secondaryLowLimitPrice);
            buffer.putSeparator(position);
            position++;
        }

        if (hasSecondaryHighLimitPrice)
        {
            buffer.putBytes(position, secondaryHighLimitPriceHeader, 0, secondaryHighLimitPriceHeaderLength);
            position += secondaryHighLimitPriceHeaderLength;
            position += buffer.putFloatAscii(position, secondaryHighLimitPrice);
            buffer.putSeparator(position);
            position++;
        }

        if (hasSecondaryTradingReferencePrice)
        {
            buffer.putBytes(position, secondaryTradingReferencePriceHeader, 0, secondaryTradingReferencePriceHeaderLength);
            position += secondaryTradingReferencePriceHeaderLength;
            position += buffer.putFloatAscii(position, secondaryTradingReferencePrice);
            buffer.putSeparator(position);
            position++;
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetSecondaryPriceLimitType();
        this.resetSecondaryLowLimitPrice();
        this.resetSecondaryHighLimitPrice();
        this.resetSecondaryTradingReferencePrice();
    }

    public void resetSecondaryPriceLimitType()
    {
        hasSecondaryPriceLimitType = false;
    }

    public void resetSecondaryLowLimitPrice()
    {
        hasSecondaryLowLimitPrice = false;
    }

    public void resetSecondaryHighLimitPrice()
    {
        hasSecondaryHighLimitPrice = false;
    }

    public void resetSecondaryTradingReferencePrice()
    {
        hasSecondaryTradingReferencePrice = false;
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
        builder.append("\"MessageName\": \"SecondaryPriceLimits\",\n");
        if (hasSecondaryPriceLimitType())
        {
            indent(builder, level);
            builder.append("\"SecondaryPriceLimitType\": \"");
            builder.append(secondaryPriceLimitType);
            builder.append("\",\n");
        }

        if (hasSecondaryLowLimitPrice())
        {
            indent(builder, level);
            builder.append("\"SecondaryLowLimitPrice\": \"");
            secondaryLowLimitPrice.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasSecondaryHighLimitPrice())
        {
            indent(builder, level);
            builder.append("\"SecondaryHighLimitPrice\": \"");
            secondaryHighLimitPrice.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasSecondaryTradingReferencePrice())
        {
            indent(builder, level);
            builder.append("\"SecondaryTradingReferencePrice\": \"");
            secondaryTradingReferencePrice.appendTo(builder);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public SecondaryPriceLimitsEncoder copyTo(final Encoder encoder)
    {
        return copyTo((SecondaryPriceLimitsEncoder)encoder);
    }

    public SecondaryPriceLimitsEncoder copyTo(final SecondaryPriceLimitsEncoder encoder)
    {
        encoder.reset();
        if (hasSecondaryPriceLimitType())
        {
            encoder.secondaryPriceLimitType(this.secondaryPriceLimitType());
        }

        if (hasSecondaryLowLimitPrice())
        {
            encoder.secondaryLowLimitPrice(this.secondaryLowLimitPrice());
        }

        if (hasSecondaryHighLimitPrice())
        {
            encoder.secondaryHighLimitPrice(this.secondaryHighLimitPrice());
        }

        if (hasSecondaryTradingReferencePrice())
        {
            encoder.secondaryTradingReferencePrice(this.secondaryTradingReferencePrice());
        }
        return encoder;
    }

}
