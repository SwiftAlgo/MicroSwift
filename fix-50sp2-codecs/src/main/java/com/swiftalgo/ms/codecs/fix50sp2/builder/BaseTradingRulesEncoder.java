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


public class BaseTradingRulesEncoder
{
    private static final int expirationCycleHeaderLength = 4;
    private static final byte[] expirationCycleHeader = new byte[] {56, 50, 55, (byte) '='};

    private static final int minTradeVolHeaderLength = 4;
    private static final byte[] minTradeVolHeader = new byte[] {53, 54, 50, (byte) '='};

    private static final int maxTradeVolHeaderLength = 5;
    private static final byte[] maxTradeVolHeader = new byte[] {49, 49, 52, 48, (byte) '='};

    private static final int maxPriceVariationHeaderLength = 5;
    private static final byte[] maxPriceVariationHeader = new byte[] {49, 49, 52, 51, (byte) '='};

    private static final int impliedMarketIndicatorHeaderLength = 5;
    private static final byte[] impliedMarketIndicatorHeader = new byte[] {49, 49, 52, 52, (byte) '='};

    private static final int tradingCurrencyHeaderLength = 5;
    private static final byte[] tradingCurrencyHeader = new byte[] {49, 50, 52, 53, (byte) '='};

    private static final int roundLotHeaderLength = 4;
    private static final byte[] roundLotHeader = new byte[] {53, 54, 49, (byte) '='};

    private static final int multilegModelHeaderLength = 5;
    private static final byte[] multilegModelHeader = new byte[] {49, 51, 55, 55, (byte) '='};

    private static final int multilegPriceMethodHeaderLength = 5;
    private static final byte[] multilegPriceMethodHeader = new byte[] {49, 51, 55, 56, (byte) '='};

    private static final int priceTypeHeaderLength = 4;
    private static final byte[] priceTypeHeader = new byte[] {52, 50, 51, (byte) '='};

    private final TickRulesEncoder tickRules = new TickRulesEncoder();
    public TickRulesEncoder tickRules()
    {
        return tickRules;
    }

    private final LotTypeRulesEncoder lotTypeRules = new LotTypeRulesEncoder();
    public LotTypeRulesEncoder lotTypeRules()
    {
        return lotTypeRules;
    }

    private final PriceLimitsEncoder priceLimits = new PriceLimitsEncoder();
    public PriceLimitsEncoder priceLimits()
    {
        return priceLimits;
    }

    private int expirationCycle;

    private boolean hasExpirationCycle;

    public boolean hasExpirationCycle()
    {
        return hasExpirationCycle;
    }

    public BaseTradingRulesEncoder expirationCycle(int value)
    {
        expirationCycle = value;
        hasExpirationCycle = true;
        return this;
    }

    public int expirationCycle()
    {
        return expirationCycle;
    }

    public BaseTradingRulesEncoder expirationCycle(ExpirationCycle value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == ExpirationCycle.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: expirationCycle Value: " + value );
            }
            if (value == ExpirationCycle.NULL_VAL)
            {
                return this;
            }
        }
        return expirationCycle(value.representation());
    }

    private final DecimalFloat minTradeVol = new DecimalFloat();

    private boolean hasMinTradeVol;

    public boolean hasMinTradeVol()
    {
        return hasMinTradeVol;
    }

    public BaseTradingRulesEncoder minTradeVol(DecimalFloat value)
    {
        minTradeVol.set(value);
        hasMinTradeVol = true;
        return this;
    }

    public BaseTradingRulesEncoder minTradeVol(long value, int scale)
    {
        minTradeVol.set(value, scale);
        hasMinTradeVol = true;
        return this;
    }

    public DecimalFloat minTradeVol()
    {
        return minTradeVol;
    }

    private final DecimalFloat maxTradeVol = new DecimalFloat();

    private boolean hasMaxTradeVol;

    public boolean hasMaxTradeVol()
    {
        return hasMaxTradeVol;
    }

    public BaseTradingRulesEncoder maxTradeVol(DecimalFloat value)
    {
        maxTradeVol.set(value);
        hasMaxTradeVol = true;
        return this;
    }

    public BaseTradingRulesEncoder maxTradeVol(long value, int scale)
    {
        maxTradeVol.set(value, scale);
        hasMaxTradeVol = true;
        return this;
    }

    public DecimalFloat maxTradeVol()
    {
        return maxTradeVol;
    }

    private final DecimalFloat maxPriceVariation = new DecimalFloat();

    private boolean hasMaxPriceVariation;

    public boolean hasMaxPriceVariation()
    {
        return hasMaxPriceVariation;
    }

    public BaseTradingRulesEncoder maxPriceVariation(DecimalFloat value)
    {
        maxPriceVariation.set(value);
        hasMaxPriceVariation = true;
        return this;
    }

    public BaseTradingRulesEncoder maxPriceVariation(long value, int scale)
    {
        maxPriceVariation.set(value, scale);
        hasMaxPriceVariation = true;
        return this;
    }

    public DecimalFloat maxPriceVariation()
    {
        return maxPriceVariation;
    }

    private int impliedMarketIndicator;

    private boolean hasImpliedMarketIndicator;

    public boolean hasImpliedMarketIndicator()
    {
        return hasImpliedMarketIndicator;
    }

    public BaseTradingRulesEncoder impliedMarketIndicator(int value)
    {
        impliedMarketIndicator = value;
        hasImpliedMarketIndicator = true;
        return this;
    }

    public int impliedMarketIndicator()
    {
        return impliedMarketIndicator;
    }

    public BaseTradingRulesEncoder impliedMarketIndicator(ImpliedMarketIndicator value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == ImpliedMarketIndicator.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: impliedMarketIndicator Value: " + value );
            }
            if (value == ImpliedMarketIndicator.NULL_VAL)
            {
                return this;
            }
        }
        return impliedMarketIndicator(value.representation());
    }

    private final MutableDirectBuffer tradingCurrency = new UnsafeBuffer();

    private int tradingCurrencyOffset = 0;

    private int tradingCurrencyLength = 0;

    public BaseTradingRulesEncoder tradingCurrency(final DirectBuffer value, final int offset, final int length)
    {
        tradingCurrency.wrap(value);
        tradingCurrencyOffset = offset;
        tradingCurrencyLength = length;
        return this;
    }

    public BaseTradingRulesEncoder tradingCurrency(final DirectBuffer value, final int length)
    {
        return tradingCurrency(value, 0, length);
    }

    public BaseTradingRulesEncoder tradingCurrency(final DirectBuffer value)
    {
        return tradingCurrency(value, 0, value.capacity());
    }

    public BaseTradingRulesEncoder tradingCurrency(final byte[] value, final int offset, final int length)
    {
        tradingCurrency.wrap(value);
        tradingCurrencyOffset = offset;
        tradingCurrencyLength = length;
        return this;
    }

    public BaseTradingRulesEncoder tradingCurrencyAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradingCurrency, value, offset, length);
        tradingCurrencyOffset = offset;
        tradingCurrencyLength = length;
        return this;
    }

    public BaseTradingRulesEncoder tradingCurrency(final byte[] value, final int length)
    {
        return tradingCurrency(value, 0, length);
    }

    public BaseTradingRulesEncoder tradingCurrency(final byte[] value)
    {
        return tradingCurrency(value, 0, value.length);
    }

    public boolean hasTradingCurrency()
    {
        return tradingCurrencyLength > 0;
    }

    public MutableDirectBuffer tradingCurrency()
    {
        return tradingCurrency;
    }

    public String tradingCurrencyAsString()
    {
        return tradingCurrency.getStringWithoutLengthAscii(tradingCurrencyOffset, tradingCurrencyLength);
    }

    public BaseTradingRulesEncoder tradingCurrency(final CharSequence value)
    {
        toBytes(value, tradingCurrency);
        tradingCurrencyOffset = 0;
        tradingCurrencyLength = value.length();
        return this;
    }

    public BaseTradingRulesEncoder tradingCurrency(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            tradingCurrency.wrap(buffer);
            tradingCurrencyOffset = value.offset();
            tradingCurrencyLength = value.length();
        }
        return this;
    }

    public BaseTradingRulesEncoder tradingCurrency(final char[] value)
    {
        return tradingCurrency(value, 0, value.length);
    }

    public BaseTradingRulesEncoder tradingCurrency(final char[] value, final int length)
    {
        return tradingCurrency(value, 0, length);
    }

    public BaseTradingRulesEncoder tradingCurrency(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradingCurrency, offset, length);
        tradingCurrencyOffset = 0;
        tradingCurrencyLength = length;
        return this;
    }

    private final DecimalFloat roundLot = new DecimalFloat();

    private boolean hasRoundLot;

    public boolean hasRoundLot()
    {
        return hasRoundLot;
    }

    public BaseTradingRulesEncoder roundLot(DecimalFloat value)
    {
        roundLot.set(value);
        hasRoundLot = true;
        return this;
    }

    public BaseTradingRulesEncoder roundLot(long value, int scale)
    {
        roundLot.set(value, scale);
        hasRoundLot = true;
        return this;
    }

    public DecimalFloat roundLot()
    {
        return roundLot;
    }

    private int multilegModel;

    private boolean hasMultilegModel;

    public boolean hasMultilegModel()
    {
        return hasMultilegModel;
    }

    public BaseTradingRulesEncoder multilegModel(int value)
    {
        multilegModel = value;
        hasMultilegModel = true;
        return this;
    }

    public int multilegModel()
    {
        return multilegModel;
    }

    public BaseTradingRulesEncoder multilegModel(MultilegModel value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == MultilegModel.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: multilegModel Value: " + value );
            }
            if (value == MultilegModel.NULL_VAL)
            {
                return this;
            }
        }
        return multilegModel(value.representation());
    }

    private int multilegPriceMethod;

    private boolean hasMultilegPriceMethod;

    public boolean hasMultilegPriceMethod()
    {
        return hasMultilegPriceMethod;
    }

    public BaseTradingRulesEncoder multilegPriceMethod(int value)
    {
        multilegPriceMethod = value;
        hasMultilegPriceMethod = true;
        return this;
    }

    public int multilegPriceMethod()
    {
        return multilegPriceMethod;
    }

    public BaseTradingRulesEncoder multilegPriceMethod(MultilegPriceMethod value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == MultilegPriceMethod.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: multilegPriceMethod Value: " + value );
            }
            if (value == MultilegPriceMethod.NULL_VAL)
            {
                return this;
            }
        }
        return multilegPriceMethod(value.representation());
    }

    private int priceType;

    private boolean hasPriceType;

    public boolean hasPriceType()
    {
        return hasPriceType;
    }

    public BaseTradingRulesEncoder priceType(int value)
    {
        priceType = value;
        hasPriceType = true;
        return this;
    }

    public int priceType()
    {
        return priceType;
    }

    public BaseTradingRulesEncoder priceType(PriceType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == PriceType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: priceType Value: " + value );
            }
            if (value == PriceType.NULL_VAL)
            {
                return this;
            }
        }
        return priceType(value.representation());
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

            position += tickRules.encode(buffer, position);

            position += lotTypeRules.encode(buffer, position);

            position += priceLimits.encode(buffer, position);

        if (hasExpirationCycle)
        {
            buffer.putBytes(position, expirationCycleHeader, 0, expirationCycleHeaderLength);
            position += expirationCycleHeaderLength;
            position += buffer.putIntAscii(position, expirationCycle);
            buffer.putSeparator(position);
            position++;
        }

        if (hasMinTradeVol)
        {
            buffer.putBytes(position, minTradeVolHeader, 0, minTradeVolHeaderLength);
            position += minTradeVolHeaderLength;
            position += buffer.putFloatAscii(position, minTradeVol);
            buffer.putSeparator(position);
            position++;
        }

        if (hasMaxTradeVol)
        {
            buffer.putBytes(position, maxTradeVolHeader, 0, maxTradeVolHeaderLength);
            position += maxTradeVolHeaderLength;
            position += buffer.putFloatAscii(position, maxTradeVol);
            buffer.putSeparator(position);
            position++;
        }

        if (hasMaxPriceVariation)
        {
            buffer.putBytes(position, maxPriceVariationHeader, 0, maxPriceVariationHeaderLength);
            position += maxPriceVariationHeaderLength;
            position += buffer.putFloatAscii(position, maxPriceVariation);
            buffer.putSeparator(position);
            position++;
        }

        if (hasImpliedMarketIndicator)
        {
            buffer.putBytes(position, impliedMarketIndicatorHeader, 0, impliedMarketIndicatorHeaderLength);
            position += impliedMarketIndicatorHeaderLength;
            position += buffer.putIntAscii(position, impliedMarketIndicator);
            buffer.putSeparator(position);
            position++;
        }

        if (tradingCurrencyLength > 0)
        {
            buffer.putBytes(position, tradingCurrencyHeader, 0, tradingCurrencyHeaderLength);
            position += tradingCurrencyHeaderLength;
            buffer.putBytes(position, tradingCurrency, tradingCurrencyOffset, tradingCurrencyLength);
            position += tradingCurrencyLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasRoundLot)
        {
            buffer.putBytes(position, roundLotHeader, 0, roundLotHeaderLength);
            position += roundLotHeaderLength;
            position += buffer.putFloatAscii(position, roundLot);
            buffer.putSeparator(position);
            position++;
        }

        if (hasMultilegModel)
        {
            buffer.putBytes(position, multilegModelHeader, 0, multilegModelHeaderLength);
            position += multilegModelHeaderLength;
            position += buffer.putIntAscii(position, multilegModel);
            buffer.putSeparator(position);
            position++;
        }

        if (hasMultilegPriceMethod)
        {
            buffer.putBytes(position, multilegPriceMethodHeader, 0, multilegPriceMethodHeaderLength);
            position += multilegPriceMethodHeaderLength;
            position += buffer.putIntAscii(position, multilegPriceMethod);
            buffer.putSeparator(position);
            position++;
        }

        if (hasPriceType)
        {
            buffer.putBytes(position, priceTypeHeader, 0, priceTypeHeaderLength);
            position += priceTypeHeaderLength;
            position += buffer.putIntAscii(position, priceType);
            buffer.putSeparator(position);
            position++;
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetExpirationCycle();
        this.resetMinTradeVol();
        this.resetMaxTradeVol();
        this.resetMaxPriceVariation();
        this.resetImpliedMarketIndicator();
        this.resetTradingCurrency();
        this.resetRoundLot();
        this.resetMultilegModel();
        this.resetMultilegPriceMethod();
        this.resetPriceType();
        tickRules.reset();
        lotTypeRules.reset();
        priceLimits.reset();
    }

    public void resetExpirationCycle()
    {
        hasExpirationCycle = false;
    }

    public void resetMinTradeVol()
    {
        hasMinTradeVol = false;
    }

    public void resetMaxTradeVol()
    {
        hasMaxTradeVol = false;
    }

    public void resetMaxPriceVariation()
    {
        hasMaxPriceVariation = false;
    }

    public void resetImpliedMarketIndicator()
    {
        hasImpliedMarketIndicator = false;
    }

    public void resetTradingCurrency()
    {
        tradingCurrencyLength = 0;
    }

    public void resetRoundLot()
    {
        hasRoundLot = false;
    }

    public void resetMultilegModel()
    {
        hasMultilegModel = false;
    }

    public void resetMultilegPriceMethod()
    {
        hasMultilegPriceMethod = false;
    }

    public void resetPriceType()
    {
        hasPriceType = false;
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
        builder.append("\"MessageName\": \"BaseTradingRules\",\n");
    indent(builder, level);
    builder.append("\"TickRules\": ");
    tickRules.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"LotTypeRules\": ");
    lotTypeRules.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"PriceLimits\": ");
    priceLimits.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasExpirationCycle())
        {
            indent(builder, level);
            builder.append("\"ExpirationCycle\": \"");
            builder.append(expirationCycle);
            builder.append("\",\n");
        }

        if (hasMinTradeVol())
        {
            indent(builder, level);
            builder.append("\"MinTradeVol\": \"");
            minTradeVol.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasMaxTradeVol())
        {
            indent(builder, level);
            builder.append("\"MaxTradeVol\": \"");
            maxTradeVol.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasMaxPriceVariation())
        {
            indent(builder, level);
            builder.append("\"MaxPriceVariation\": \"");
            maxPriceVariation.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasImpliedMarketIndicator())
        {
            indent(builder, level);
            builder.append("\"ImpliedMarketIndicator\": \"");
            builder.append(impliedMarketIndicator);
            builder.append("\",\n");
        }

        if (hasTradingCurrency())
        {
            indent(builder, level);
            builder.append("\"TradingCurrency\": \"");
            appendBuffer(builder, tradingCurrency, tradingCurrencyOffset, tradingCurrencyLength);
            builder.append("\",\n");
        }

        if (hasRoundLot())
        {
            indent(builder, level);
            builder.append("\"RoundLot\": \"");
            roundLot.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasMultilegModel())
        {
            indent(builder, level);
            builder.append("\"MultilegModel\": \"");
            builder.append(multilegModel);
            builder.append("\",\n");
        }

        if (hasMultilegPriceMethod())
        {
            indent(builder, level);
            builder.append("\"MultilegPriceMethod\": \"");
            builder.append(multilegPriceMethod);
            builder.append("\",\n");
        }

        if (hasPriceType())
        {
            indent(builder, level);
            builder.append("\"PriceType\": \"");
            builder.append(priceType);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public BaseTradingRulesEncoder copyTo(final Encoder encoder)
    {
        return copyTo((BaseTradingRulesEncoder)encoder);
    }

    public BaseTradingRulesEncoder copyTo(final BaseTradingRulesEncoder encoder)
    {
        encoder.reset();

        tickRules.copyTo(encoder.tickRules());

        lotTypeRules.copyTo(encoder.lotTypeRules());

        priceLimits.copyTo(encoder.priceLimits());
        if (hasExpirationCycle())
        {
            encoder.expirationCycle(this.expirationCycle());
        }

        if (hasMinTradeVol())
        {
            encoder.minTradeVol(this.minTradeVol());
        }

        if (hasMaxTradeVol())
        {
            encoder.maxTradeVol(this.maxTradeVol());
        }

        if (hasMaxPriceVariation())
        {
            encoder.maxPriceVariation(this.maxPriceVariation());
        }

        if (hasImpliedMarketIndicator())
        {
            encoder.impliedMarketIndicator(this.impliedMarketIndicator());
        }

        if (hasTradingCurrency())
        {
            encoder.tradingCurrencyAsCopy(tradingCurrency.byteArray(), 0, tradingCurrencyLength);
        }

        if (hasRoundLot())
        {
            encoder.roundLot(this.roundLot());
        }

        if (hasMultilegModel())
        {
            encoder.multilegModel(this.multilegModel());
        }

        if (hasMultilegPriceMethod())
        {
            encoder.multilegPriceMethod(this.multilegPriceMethod());
        }

        if (hasPriceType())
        {
            encoder.priceType(this.priceType());
        }
        return encoder;
    }

}
