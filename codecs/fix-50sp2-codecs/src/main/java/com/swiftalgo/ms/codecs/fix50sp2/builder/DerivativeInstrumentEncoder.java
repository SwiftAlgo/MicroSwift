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


public class DerivativeInstrumentEncoder
{
    private static final int derivativeSymbolHeaderLength = 5;
    private static final byte[] derivativeSymbolHeader = new byte[] {49, 50, 49, 52, (byte) '='};

    private static final int derivativeSymbolSfxHeaderLength = 5;
    private static final byte[] derivativeSymbolSfxHeader = new byte[] {49, 50, 49, 53, (byte) '='};

    private static final int derivativeSecurityIDHeaderLength = 5;
    private static final byte[] derivativeSecurityIDHeader = new byte[] {49, 50, 49, 54, (byte) '='};

    private static final int derivativeSecurityIDSourceHeaderLength = 5;
    private static final byte[] derivativeSecurityIDSourceHeader = new byte[] {49, 50, 49, 55, (byte) '='};

    private static final int derivativeProductHeaderLength = 5;
    private static final byte[] derivativeProductHeader = new byte[] {49, 50, 52, 54, (byte) '='};

    private static final int derivativeProductComplexHeaderLength = 5;
    private static final byte[] derivativeProductComplexHeader = new byte[] {49, 50, 50, 56, (byte) '='};

    private static final int derivFlexProductEligibilityIndicatorHeaderLength = 5;
    private static final byte[] derivFlexProductEligibilityIndicatorHeader = new byte[] {49, 50, 52, 51, (byte) '='};

    private static final int derivativeSecurityGroupHeaderLength = 5;
    private static final byte[] derivativeSecurityGroupHeader = new byte[] {49, 50, 52, 55, (byte) '='};

    private static final int derivativeCFICodeHeaderLength = 5;
    private static final byte[] derivativeCFICodeHeader = new byte[] {49, 50, 52, 56, (byte) '='};

    private static final int derivativeSecurityTypeHeaderLength = 5;
    private static final byte[] derivativeSecurityTypeHeader = new byte[] {49, 50, 52, 57, (byte) '='};

    private static final int derivativeSecuritySubTypeHeaderLength = 5;
    private static final byte[] derivativeSecuritySubTypeHeader = new byte[] {49, 50, 53, 48, (byte) '='};

    private static final int derivativeMaturityMonthYearHeaderLength = 5;
    private static final byte[] derivativeMaturityMonthYearHeader = new byte[] {49, 50, 53, 49, (byte) '='};

    private static final int derivativeMaturityDateHeaderLength = 5;
    private static final byte[] derivativeMaturityDateHeader = new byte[] {49, 50, 53, 50, (byte) '='};

    private static final int derivativeMaturityTimeHeaderLength = 5;
    private static final byte[] derivativeMaturityTimeHeader = new byte[] {49, 50, 53, 51, (byte) '='};

    private static final int derivativeSettleOnOpenFlagHeaderLength = 5;
    private static final byte[] derivativeSettleOnOpenFlagHeader = new byte[] {49, 50, 53, 52, (byte) '='};

    private static final int derivativeInstrmtAssignmentMethodHeaderLength = 5;
    private static final byte[] derivativeInstrmtAssignmentMethodHeader = new byte[] {49, 50, 53, 53, (byte) '='};

    private static final int derivativeSecurityStatusHeaderLength = 5;
    private static final byte[] derivativeSecurityStatusHeader = new byte[] {49, 50, 53, 54, (byte) '='};

    private static final int derivativeIssueDateHeaderLength = 5;
    private static final byte[] derivativeIssueDateHeader = new byte[] {49, 50, 55, 54, (byte) '='};

    private static final int derivativeInstrRegistryHeaderLength = 5;
    private static final byte[] derivativeInstrRegistryHeader = new byte[] {49, 50, 53, 55, (byte) '='};

    private static final int derivativeCountryOfIssueHeaderLength = 5;
    private static final byte[] derivativeCountryOfIssueHeader = new byte[] {49, 50, 53, 56, (byte) '='};

    private static final int derivativeStateOrProvinceOfIssueHeaderLength = 5;
    private static final byte[] derivativeStateOrProvinceOfIssueHeader = new byte[] {49, 50, 53, 57, (byte) '='};

    private static final int derivativeLocaleOfIssueHeaderLength = 5;
    private static final byte[] derivativeLocaleOfIssueHeader = new byte[] {49, 50, 54, 48, (byte) '='};

    private static final int derivativeStrikePriceHeaderLength = 5;
    private static final byte[] derivativeStrikePriceHeader = new byte[] {49, 50, 54, 49, (byte) '='};

    private static final int derivativeStrikeCurrencyHeaderLength = 5;
    private static final byte[] derivativeStrikeCurrencyHeader = new byte[] {49, 50, 54, 50, (byte) '='};

    private static final int derivativeStrikeMultiplierHeaderLength = 5;
    private static final byte[] derivativeStrikeMultiplierHeader = new byte[] {49, 50, 54, 51, (byte) '='};

    private static final int derivativeStrikeValueHeaderLength = 5;
    private static final byte[] derivativeStrikeValueHeader = new byte[] {49, 50, 54, 52, (byte) '='};

    private static final int derivativeOptAttributeHeaderLength = 5;
    private static final byte[] derivativeOptAttributeHeader = new byte[] {49, 50, 54, 53, (byte) '='};

    private static final int derivativeContractMultiplierHeaderLength = 5;
    private static final byte[] derivativeContractMultiplierHeader = new byte[] {49, 50, 54, 54, (byte) '='};

    private static final int derivativeContractMultiplierUnitHeaderLength = 5;
    private static final byte[] derivativeContractMultiplierUnitHeader = new byte[] {49, 52, 51, 56, (byte) '='};

    private static final int derivativeFlowScheduleTypeHeaderLength = 5;
    private static final byte[] derivativeFlowScheduleTypeHeader = new byte[] {49, 52, 52, 50, (byte) '='};

    private static final int derivativeMinPriceIncrementHeaderLength = 5;
    private static final byte[] derivativeMinPriceIncrementHeader = new byte[] {49, 50, 54, 55, (byte) '='};

    private static final int derivativeMinPriceIncrementAmountHeaderLength = 5;
    private static final byte[] derivativeMinPriceIncrementAmountHeader = new byte[] {49, 50, 54, 56, (byte) '='};

    private static final int derivativeUnitOfMeasureHeaderLength = 5;
    private static final byte[] derivativeUnitOfMeasureHeader = new byte[] {49, 50, 54, 57, (byte) '='};

    private static final int derivativeUnitOfMeasureQtyHeaderLength = 5;
    private static final byte[] derivativeUnitOfMeasureQtyHeader = new byte[] {49, 50, 55, 48, (byte) '='};

    private static final int derivativePriceUnitOfMeasureHeaderLength = 5;
    private static final byte[] derivativePriceUnitOfMeasureHeader = new byte[] {49, 51, 49, 53, (byte) '='};

    private static final int derivativePriceUnitOfMeasureQtyHeaderLength = 5;
    private static final byte[] derivativePriceUnitOfMeasureQtyHeader = new byte[] {49, 51, 49, 54, (byte) '='};

    private static final int derivativeSettlMethodHeaderLength = 5;
    private static final byte[] derivativeSettlMethodHeader = new byte[] {49, 51, 49, 55, (byte) '='};

    private static final int derivativePriceQuoteMethodHeaderLength = 5;
    private static final byte[] derivativePriceQuoteMethodHeader = new byte[] {49, 51, 49, 56, (byte) '='};

    private static final int derivativeValuationMethodHeaderLength = 5;
    private static final byte[] derivativeValuationMethodHeader = new byte[] {49, 51, 49, 57, (byte) '='};

    private static final int derivativeListMethodHeaderLength = 5;
    private static final byte[] derivativeListMethodHeader = new byte[] {49, 51, 50, 48, (byte) '='};

    private static final int derivativeCapPriceHeaderLength = 5;
    private static final byte[] derivativeCapPriceHeader = new byte[] {49, 51, 50, 49, (byte) '='};

    private static final int derivativeFloorPriceHeaderLength = 5;
    private static final byte[] derivativeFloorPriceHeader = new byte[] {49, 51, 50, 50, (byte) '='};

    private static final int derivativePutOrCallHeaderLength = 5;
    private static final byte[] derivativePutOrCallHeader = new byte[] {49, 51, 50, 51, (byte) '='};

    private static final int derivativeExerciseStyleHeaderLength = 5;
    private static final byte[] derivativeExerciseStyleHeader = new byte[] {49, 50, 57, 57, (byte) '='};

    private static final int derivativeOptPayAmountHeaderLength = 5;
    private static final byte[] derivativeOptPayAmountHeader = new byte[] {49, 50, 50, 53, (byte) '='};

    private static final int derivativeTimeUnitHeaderLength = 5;
    private static final byte[] derivativeTimeUnitHeader = new byte[] {49, 50, 55, 49, (byte) '='};

    private static final int derivativeSecurityExchangeHeaderLength = 5;
    private static final byte[] derivativeSecurityExchangeHeader = new byte[] {49, 50, 55, 50, (byte) '='};

    private static final int derivativePositionLimitHeaderLength = 5;
    private static final byte[] derivativePositionLimitHeader = new byte[] {49, 50, 55, 51, (byte) '='};

    private static final int derivativeNTPositionLimitHeaderLength = 5;
    private static final byte[] derivativeNTPositionLimitHeader = new byte[] {49, 50, 55, 52, (byte) '='};

    private static final int derivativeIssuerHeaderLength = 5;
    private static final byte[] derivativeIssuerHeader = new byte[] {49, 50, 55, 53, (byte) '='};

    private static final int derivativeEncodedIssuerLenHeaderLength = 5;
    private static final byte[] derivativeEncodedIssuerLenHeader = new byte[] {49, 50, 55, 55, (byte) '='};

    private static final int derivativeEncodedIssuerHeaderLength = 5;
    private static final byte[] derivativeEncodedIssuerHeader = new byte[] {49, 50, 55, 56, (byte) '='};

    private static final int derivativeSecurityDescHeaderLength = 5;
    private static final byte[] derivativeSecurityDescHeader = new byte[] {49, 50, 55, 57, (byte) '='};

    private static final int derivativeEncodedSecurityDescLenHeaderLength = 5;
    private static final byte[] derivativeEncodedSecurityDescLenHeader = new byte[] {49, 50, 56, 48, (byte) '='};

    private static final int derivativeEncodedSecurityDescHeaderLength = 5;
    private static final byte[] derivativeEncodedSecurityDescHeader = new byte[] {49, 50, 56, 49, (byte) '='};

    private static final int derivativeContractSettlMonthHeaderLength = 5;
    private static final byte[] derivativeContractSettlMonthHeader = new byte[] {49, 50, 56, 53, (byte) '='};

    private final MutableDirectBuffer derivativeSymbol = new UnsafeBuffer();

    private int derivativeSymbolOffset = 0;

    private int derivativeSymbolLength = 0;

    public DerivativeInstrumentEncoder derivativeSymbol(final DirectBuffer value, final int offset, final int length)
    {
        derivativeSymbol.wrap(value);
        derivativeSymbolOffset = offset;
        derivativeSymbolLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeSymbol(final DirectBuffer value, final int length)
    {
        return derivativeSymbol(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeSymbol(final DirectBuffer value)
    {
        return derivativeSymbol(value, 0, value.capacity());
    }

    public DerivativeInstrumentEncoder derivativeSymbol(final byte[] value, final int offset, final int length)
    {
        derivativeSymbol.wrap(value);
        derivativeSymbolOffset = offset;
        derivativeSymbolLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeSymbolAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(derivativeSymbol, value, offset, length);
        derivativeSymbolOffset = offset;
        derivativeSymbolLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeSymbol(final byte[] value, final int length)
    {
        return derivativeSymbol(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeSymbol(final byte[] value)
    {
        return derivativeSymbol(value, 0, value.length);
    }

    public boolean hasDerivativeSymbol()
    {
        return derivativeSymbolLength > 0;
    }

    public MutableDirectBuffer derivativeSymbol()
    {
        return derivativeSymbol;
    }

    public String derivativeSymbolAsString()
    {
        return derivativeSymbol.getStringWithoutLengthAscii(derivativeSymbolOffset, derivativeSymbolLength);
    }

    public DerivativeInstrumentEncoder derivativeSymbol(final CharSequence value)
    {
        toBytes(value, derivativeSymbol);
        derivativeSymbolOffset = 0;
        derivativeSymbolLength = value.length();
        return this;
    }

    public DerivativeInstrumentEncoder derivativeSymbol(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            derivativeSymbol.wrap(buffer);
            derivativeSymbolOffset = value.offset();
            derivativeSymbolLength = value.length();
        }
        return this;
    }

    public DerivativeInstrumentEncoder derivativeSymbol(final char[] value)
    {
        return derivativeSymbol(value, 0, value.length);
    }

    public DerivativeInstrumentEncoder derivativeSymbol(final char[] value, final int length)
    {
        return derivativeSymbol(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeSymbol(final char[] value, final int offset, final int length)
    {
        toBytes(value, derivativeSymbol, offset, length);
        derivativeSymbolOffset = 0;
        derivativeSymbolLength = length;
        return this;
    }

    private final MutableDirectBuffer derivativeSymbolSfx = new UnsafeBuffer();

    private int derivativeSymbolSfxOffset = 0;

    private int derivativeSymbolSfxLength = 0;

    public DerivativeInstrumentEncoder derivativeSymbolSfx(final DirectBuffer value, final int offset, final int length)
    {
        derivativeSymbolSfx.wrap(value);
        derivativeSymbolSfxOffset = offset;
        derivativeSymbolSfxLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeSymbolSfx(final DirectBuffer value, final int length)
    {
        return derivativeSymbolSfx(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeSymbolSfx(final DirectBuffer value)
    {
        return derivativeSymbolSfx(value, 0, value.capacity());
    }

    public DerivativeInstrumentEncoder derivativeSymbolSfx(final byte[] value, final int offset, final int length)
    {
        derivativeSymbolSfx.wrap(value);
        derivativeSymbolSfxOffset = offset;
        derivativeSymbolSfxLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeSymbolSfxAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(derivativeSymbolSfx, value, offset, length);
        derivativeSymbolSfxOffset = offset;
        derivativeSymbolSfxLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeSymbolSfx(final byte[] value, final int length)
    {
        return derivativeSymbolSfx(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeSymbolSfx(final byte[] value)
    {
        return derivativeSymbolSfx(value, 0, value.length);
    }

    public boolean hasDerivativeSymbolSfx()
    {
        return derivativeSymbolSfxLength > 0;
    }

    public MutableDirectBuffer derivativeSymbolSfx()
    {
        return derivativeSymbolSfx;
    }

    public String derivativeSymbolSfxAsString()
    {
        return derivativeSymbolSfx.getStringWithoutLengthAscii(derivativeSymbolSfxOffset, derivativeSymbolSfxLength);
    }

    public DerivativeInstrumentEncoder derivativeSymbolSfx(final CharSequence value)
    {
        toBytes(value, derivativeSymbolSfx);
        derivativeSymbolSfxOffset = 0;
        derivativeSymbolSfxLength = value.length();
        return this;
    }

    public DerivativeInstrumentEncoder derivativeSymbolSfx(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            derivativeSymbolSfx.wrap(buffer);
            derivativeSymbolSfxOffset = value.offset();
            derivativeSymbolSfxLength = value.length();
        }
        return this;
    }

    public DerivativeInstrumentEncoder derivativeSymbolSfx(final char[] value)
    {
        return derivativeSymbolSfx(value, 0, value.length);
    }

    public DerivativeInstrumentEncoder derivativeSymbolSfx(final char[] value, final int length)
    {
        return derivativeSymbolSfx(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeSymbolSfx(final char[] value, final int offset, final int length)
    {
        toBytes(value, derivativeSymbolSfx, offset, length);
        derivativeSymbolSfxOffset = 0;
        derivativeSymbolSfxLength = length;
        return this;
    }

    private final MutableDirectBuffer derivativeSecurityID = new UnsafeBuffer();

    private int derivativeSecurityIDOffset = 0;

    private int derivativeSecurityIDLength = 0;

    public DerivativeInstrumentEncoder derivativeSecurityID(final DirectBuffer value, final int offset, final int length)
    {
        derivativeSecurityID.wrap(value);
        derivativeSecurityIDOffset = offset;
        derivativeSecurityIDLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeSecurityID(final DirectBuffer value, final int length)
    {
        return derivativeSecurityID(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeSecurityID(final DirectBuffer value)
    {
        return derivativeSecurityID(value, 0, value.capacity());
    }

    public DerivativeInstrumentEncoder derivativeSecurityID(final byte[] value, final int offset, final int length)
    {
        derivativeSecurityID.wrap(value);
        derivativeSecurityIDOffset = offset;
        derivativeSecurityIDLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeSecurityIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(derivativeSecurityID, value, offset, length);
        derivativeSecurityIDOffset = offset;
        derivativeSecurityIDLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeSecurityID(final byte[] value, final int length)
    {
        return derivativeSecurityID(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeSecurityID(final byte[] value)
    {
        return derivativeSecurityID(value, 0, value.length);
    }

    public boolean hasDerivativeSecurityID()
    {
        return derivativeSecurityIDLength > 0;
    }

    public MutableDirectBuffer derivativeSecurityID()
    {
        return derivativeSecurityID;
    }

    public String derivativeSecurityIDAsString()
    {
        return derivativeSecurityID.getStringWithoutLengthAscii(derivativeSecurityIDOffset, derivativeSecurityIDLength);
    }

    public DerivativeInstrumentEncoder derivativeSecurityID(final CharSequence value)
    {
        toBytes(value, derivativeSecurityID);
        derivativeSecurityIDOffset = 0;
        derivativeSecurityIDLength = value.length();
        return this;
    }

    public DerivativeInstrumentEncoder derivativeSecurityID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            derivativeSecurityID.wrap(buffer);
            derivativeSecurityIDOffset = value.offset();
            derivativeSecurityIDLength = value.length();
        }
        return this;
    }

    public DerivativeInstrumentEncoder derivativeSecurityID(final char[] value)
    {
        return derivativeSecurityID(value, 0, value.length);
    }

    public DerivativeInstrumentEncoder derivativeSecurityID(final char[] value, final int length)
    {
        return derivativeSecurityID(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeSecurityID(final char[] value, final int offset, final int length)
    {
        toBytes(value, derivativeSecurityID, offset, length);
        derivativeSecurityIDOffset = 0;
        derivativeSecurityIDLength = length;
        return this;
    }

    private final MutableDirectBuffer derivativeSecurityIDSource = new UnsafeBuffer();

    private int derivativeSecurityIDSourceOffset = 0;

    private int derivativeSecurityIDSourceLength = 0;

    public DerivativeInstrumentEncoder derivativeSecurityIDSource(final DirectBuffer value, final int offset, final int length)
    {
        derivativeSecurityIDSource.wrap(value);
        derivativeSecurityIDSourceOffset = offset;
        derivativeSecurityIDSourceLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeSecurityIDSource(final DirectBuffer value, final int length)
    {
        return derivativeSecurityIDSource(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeSecurityIDSource(final DirectBuffer value)
    {
        return derivativeSecurityIDSource(value, 0, value.capacity());
    }

    public DerivativeInstrumentEncoder derivativeSecurityIDSource(final byte[] value, final int offset, final int length)
    {
        derivativeSecurityIDSource.wrap(value);
        derivativeSecurityIDSourceOffset = offset;
        derivativeSecurityIDSourceLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeSecurityIDSourceAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(derivativeSecurityIDSource, value, offset, length);
        derivativeSecurityIDSourceOffset = offset;
        derivativeSecurityIDSourceLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeSecurityIDSource(final byte[] value, final int length)
    {
        return derivativeSecurityIDSource(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeSecurityIDSource(final byte[] value)
    {
        return derivativeSecurityIDSource(value, 0, value.length);
    }

    public boolean hasDerivativeSecurityIDSource()
    {
        return derivativeSecurityIDSourceLength > 0;
    }

    public MutableDirectBuffer derivativeSecurityIDSource()
    {
        return derivativeSecurityIDSource;
    }

    public String derivativeSecurityIDSourceAsString()
    {
        return derivativeSecurityIDSource.getStringWithoutLengthAscii(derivativeSecurityIDSourceOffset, derivativeSecurityIDSourceLength);
    }

    public DerivativeInstrumentEncoder derivativeSecurityIDSource(final CharSequence value)
    {
        toBytes(value, derivativeSecurityIDSource);
        derivativeSecurityIDSourceOffset = 0;
        derivativeSecurityIDSourceLength = value.length();
        return this;
    }

    public DerivativeInstrumentEncoder derivativeSecurityIDSource(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            derivativeSecurityIDSource.wrap(buffer);
            derivativeSecurityIDSourceOffset = value.offset();
            derivativeSecurityIDSourceLength = value.length();
        }
        return this;
    }

    public DerivativeInstrumentEncoder derivativeSecurityIDSource(final char[] value)
    {
        return derivativeSecurityIDSource(value, 0, value.length);
    }

    public DerivativeInstrumentEncoder derivativeSecurityIDSource(final char[] value, final int length)
    {
        return derivativeSecurityIDSource(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeSecurityIDSource(final char[] value, final int offset, final int length)
    {
        toBytes(value, derivativeSecurityIDSource, offset, length);
        derivativeSecurityIDSourceOffset = 0;
        derivativeSecurityIDSourceLength = length;
        return this;
    }

    private final DerivativeSecurityAltIDGrpEncoder derivativeSecurityAltIDGrp = new DerivativeSecurityAltIDGrpEncoder();
    public DerivativeSecurityAltIDGrpEncoder derivativeSecurityAltIDGrp()
    {
        return derivativeSecurityAltIDGrp;
    }

    private int derivativeProduct;

    private boolean hasDerivativeProduct;

    public boolean hasDerivativeProduct()
    {
        return hasDerivativeProduct;
    }

    public DerivativeInstrumentEncoder derivativeProduct(int value)
    {
        derivativeProduct = value;
        hasDerivativeProduct = true;
        return this;
    }

    public int derivativeProduct()
    {
        return derivativeProduct;
    }

    private final MutableDirectBuffer derivativeProductComplex = new UnsafeBuffer();

    private int derivativeProductComplexOffset = 0;

    private int derivativeProductComplexLength = 0;

    public DerivativeInstrumentEncoder derivativeProductComplex(final DirectBuffer value, final int offset, final int length)
    {
        derivativeProductComplex.wrap(value);
        derivativeProductComplexOffset = offset;
        derivativeProductComplexLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeProductComplex(final DirectBuffer value, final int length)
    {
        return derivativeProductComplex(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeProductComplex(final DirectBuffer value)
    {
        return derivativeProductComplex(value, 0, value.capacity());
    }

    public DerivativeInstrumentEncoder derivativeProductComplex(final byte[] value, final int offset, final int length)
    {
        derivativeProductComplex.wrap(value);
        derivativeProductComplexOffset = offset;
        derivativeProductComplexLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeProductComplexAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(derivativeProductComplex, value, offset, length);
        derivativeProductComplexOffset = offset;
        derivativeProductComplexLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeProductComplex(final byte[] value, final int length)
    {
        return derivativeProductComplex(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeProductComplex(final byte[] value)
    {
        return derivativeProductComplex(value, 0, value.length);
    }

    public boolean hasDerivativeProductComplex()
    {
        return derivativeProductComplexLength > 0;
    }

    public MutableDirectBuffer derivativeProductComplex()
    {
        return derivativeProductComplex;
    }

    public String derivativeProductComplexAsString()
    {
        return derivativeProductComplex.getStringWithoutLengthAscii(derivativeProductComplexOffset, derivativeProductComplexLength);
    }

    public DerivativeInstrumentEncoder derivativeProductComplex(final CharSequence value)
    {
        toBytes(value, derivativeProductComplex);
        derivativeProductComplexOffset = 0;
        derivativeProductComplexLength = value.length();
        return this;
    }

    public DerivativeInstrumentEncoder derivativeProductComplex(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            derivativeProductComplex.wrap(buffer);
            derivativeProductComplexOffset = value.offset();
            derivativeProductComplexLength = value.length();
        }
        return this;
    }

    public DerivativeInstrumentEncoder derivativeProductComplex(final char[] value)
    {
        return derivativeProductComplex(value, 0, value.length);
    }

    public DerivativeInstrumentEncoder derivativeProductComplex(final char[] value, final int length)
    {
        return derivativeProductComplex(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeProductComplex(final char[] value, final int offset, final int length)
    {
        toBytes(value, derivativeProductComplex, offset, length);
        derivativeProductComplexOffset = 0;
        derivativeProductComplexLength = length;
        return this;
    }

    private boolean derivFlexProductEligibilityIndicator;

    private boolean hasDerivFlexProductEligibilityIndicator;

    public boolean hasDerivFlexProductEligibilityIndicator()
    {
        return hasDerivFlexProductEligibilityIndicator;
    }

    public DerivativeInstrumentEncoder derivFlexProductEligibilityIndicator(boolean value)
    {
        derivFlexProductEligibilityIndicator = value;
        hasDerivFlexProductEligibilityIndicator = true;
        return this;
    }

    public boolean derivFlexProductEligibilityIndicator()
    {
        return derivFlexProductEligibilityIndicator;
    }

    private final MutableDirectBuffer derivativeSecurityGroup = new UnsafeBuffer();

    private int derivativeSecurityGroupOffset = 0;

    private int derivativeSecurityGroupLength = 0;

    public DerivativeInstrumentEncoder derivativeSecurityGroup(final DirectBuffer value, final int offset, final int length)
    {
        derivativeSecurityGroup.wrap(value);
        derivativeSecurityGroupOffset = offset;
        derivativeSecurityGroupLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeSecurityGroup(final DirectBuffer value, final int length)
    {
        return derivativeSecurityGroup(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeSecurityGroup(final DirectBuffer value)
    {
        return derivativeSecurityGroup(value, 0, value.capacity());
    }

    public DerivativeInstrumentEncoder derivativeSecurityGroup(final byte[] value, final int offset, final int length)
    {
        derivativeSecurityGroup.wrap(value);
        derivativeSecurityGroupOffset = offset;
        derivativeSecurityGroupLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeSecurityGroupAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(derivativeSecurityGroup, value, offset, length);
        derivativeSecurityGroupOffset = offset;
        derivativeSecurityGroupLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeSecurityGroup(final byte[] value, final int length)
    {
        return derivativeSecurityGroup(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeSecurityGroup(final byte[] value)
    {
        return derivativeSecurityGroup(value, 0, value.length);
    }

    public boolean hasDerivativeSecurityGroup()
    {
        return derivativeSecurityGroupLength > 0;
    }

    public MutableDirectBuffer derivativeSecurityGroup()
    {
        return derivativeSecurityGroup;
    }

    public String derivativeSecurityGroupAsString()
    {
        return derivativeSecurityGroup.getStringWithoutLengthAscii(derivativeSecurityGroupOffset, derivativeSecurityGroupLength);
    }

    public DerivativeInstrumentEncoder derivativeSecurityGroup(final CharSequence value)
    {
        toBytes(value, derivativeSecurityGroup);
        derivativeSecurityGroupOffset = 0;
        derivativeSecurityGroupLength = value.length();
        return this;
    }

    public DerivativeInstrumentEncoder derivativeSecurityGroup(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            derivativeSecurityGroup.wrap(buffer);
            derivativeSecurityGroupOffset = value.offset();
            derivativeSecurityGroupLength = value.length();
        }
        return this;
    }

    public DerivativeInstrumentEncoder derivativeSecurityGroup(final char[] value)
    {
        return derivativeSecurityGroup(value, 0, value.length);
    }

    public DerivativeInstrumentEncoder derivativeSecurityGroup(final char[] value, final int length)
    {
        return derivativeSecurityGroup(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeSecurityGroup(final char[] value, final int offset, final int length)
    {
        toBytes(value, derivativeSecurityGroup, offset, length);
        derivativeSecurityGroupOffset = 0;
        derivativeSecurityGroupLength = length;
        return this;
    }

    private final MutableDirectBuffer derivativeCFICode = new UnsafeBuffer();

    private int derivativeCFICodeOffset = 0;

    private int derivativeCFICodeLength = 0;

    public DerivativeInstrumentEncoder derivativeCFICode(final DirectBuffer value, final int offset, final int length)
    {
        derivativeCFICode.wrap(value);
        derivativeCFICodeOffset = offset;
        derivativeCFICodeLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeCFICode(final DirectBuffer value, final int length)
    {
        return derivativeCFICode(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeCFICode(final DirectBuffer value)
    {
        return derivativeCFICode(value, 0, value.capacity());
    }

    public DerivativeInstrumentEncoder derivativeCFICode(final byte[] value, final int offset, final int length)
    {
        derivativeCFICode.wrap(value);
        derivativeCFICodeOffset = offset;
        derivativeCFICodeLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeCFICodeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(derivativeCFICode, value, offset, length);
        derivativeCFICodeOffset = offset;
        derivativeCFICodeLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeCFICode(final byte[] value, final int length)
    {
        return derivativeCFICode(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeCFICode(final byte[] value)
    {
        return derivativeCFICode(value, 0, value.length);
    }

    public boolean hasDerivativeCFICode()
    {
        return derivativeCFICodeLength > 0;
    }

    public MutableDirectBuffer derivativeCFICode()
    {
        return derivativeCFICode;
    }

    public String derivativeCFICodeAsString()
    {
        return derivativeCFICode.getStringWithoutLengthAscii(derivativeCFICodeOffset, derivativeCFICodeLength);
    }

    public DerivativeInstrumentEncoder derivativeCFICode(final CharSequence value)
    {
        toBytes(value, derivativeCFICode);
        derivativeCFICodeOffset = 0;
        derivativeCFICodeLength = value.length();
        return this;
    }

    public DerivativeInstrumentEncoder derivativeCFICode(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            derivativeCFICode.wrap(buffer);
            derivativeCFICodeOffset = value.offset();
            derivativeCFICodeLength = value.length();
        }
        return this;
    }

    public DerivativeInstrumentEncoder derivativeCFICode(final char[] value)
    {
        return derivativeCFICode(value, 0, value.length);
    }

    public DerivativeInstrumentEncoder derivativeCFICode(final char[] value, final int length)
    {
        return derivativeCFICode(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeCFICode(final char[] value, final int offset, final int length)
    {
        toBytes(value, derivativeCFICode, offset, length);
        derivativeCFICodeOffset = 0;
        derivativeCFICodeLength = length;
        return this;
    }

    private final MutableDirectBuffer derivativeSecurityType = new UnsafeBuffer();

    private int derivativeSecurityTypeOffset = 0;

    private int derivativeSecurityTypeLength = 0;

    public DerivativeInstrumentEncoder derivativeSecurityType(final DirectBuffer value, final int offset, final int length)
    {
        derivativeSecurityType.wrap(value);
        derivativeSecurityTypeOffset = offset;
        derivativeSecurityTypeLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeSecurityType(final DirectBuffer value, final int length)
    {
        return derivativeSecurityType(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeSecurityType(final DirectBuffer value)
    {
        return derivativeSecurityType(value, 0, value.capacity());
    }

    public DerivativeInstrumentEncoder derivativeSecurityType(final byte[] value, final int offset, final int length)
    {
        derivativeSecurityType.wrap(value);
        derivativeSecurityTypeOffset = offset;
        derivativeSecurityTypeLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeSecurityTypeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(derivativeSecurityType, value, offset, length);
        derivativeSecurityTypeOffset = offset;
        derivativeSecurityTypeLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeSecurityType(final byte[] value, final int length)
    {
        return derivativeSecurityType(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeSecurityType(final byte[] value)
    {
        return derivativeSecurityType(value, 0, value.length);
    }

    public boolean hasDerivativeSecurityType()
    {
        return derivativeSecurityTypeLength > 0;
    }

    public MutableDirectBuffer derivativeSecurityType()
    {
        return derivativeSecurityType;
    }

    public String derivativeSecurityTypeAsString()
    {
        return derivativeSecurityType.getStringWithoutLengthAscii(derivativeSecurityTypeOffset, derivativeSecurityTypeLength);
    }

    public DerivativeInstrumentEncoder derivativeSecurityType(final CharSequence value)
    {
        toBytes(value, derivativeSecurityType);
        derivativeSecurityTypeOffset = 0;
        derivativeSecurityTypeLength = value.length();
        return this;
    }

    public DerivativeInstrumentEncoder derivativeSecurityType(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            derivativeSecurityType.wrap(buffer);
            derivativeSecurityTypeOffset = value.offset();
            derivativeSecurityTypeLength = value.length();
        }
        return this;
    }

    public DerivativeInstrumentEncoder derivativeSecurityType(final char[] value)
    {
        return derivativeSecurityType(value, 0, value.length);
    }

    public DerivativeInstrumentEncoder derivativeSecurityType(final char[] value, final int length)
    {
        return derivativeSecurityType(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeSecurityType(final char[] value, final int offset, final int length)
    {
        toBytes(value, derivativeSecurityType, offset, length);
        derivativeSecurityTypeOffset = 0;
        derivativeSecurityTypeLength = length;
        return this;
    }

    private final MutableDirectBuffer derivativeSecuritySubType = new UnsafeBuffer();

    private int derivativeSecuritySubTypeOffset = 0;

    private int derivativeSecuritySubTypeLength = 0;

    public DerivativeInstrumentEncoder derivativeSecuritySubType(final DirectBuffer value, final int offset, final int length)
    {
        derivativeSecuritySubType.wrap(value);
        derivativeSecuritySubTypeOffset = offset;
        derivativeSecuritySubTypeLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeSecuritySubType(final DirectBuffer value, final int length)
    {
        return derivativeSecuritySubType(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeSecuritySubType(final DirectBuffer value)
    {
        return derivativeSecuritySubType(value, 0, value.capacity());
    }

    public DerivativeInstrumentEncoder derivativeSecuritySubType(final byte[] value, final int offset, final int length)
    {
        derivativeSecuritySubType.wrap(value);
        derivativeSecuritySubTypeOffset = offset;
        derivativeSecuritySubTypeLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeSecuritySubTypeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(derivativeSecuritySubType, value, offset, length);
        derivativeSecuritySubTypeOffset = offset;
        derivativeSecuritySubTypeLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeSecuritySubType(final byte[] value, final int length)
    {
        return derivativeSecuritySubType(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeSecuritySubType(final byte[] value)
    {
        return derivativeSecuritySubType(value, 0, value.length);
    }

    public boolean hasDerivativeSecuritySubType()
    {
        return derivativeSecuritySubTypeLength > 0;
    }

    public MutableDirectBuffer derivativeSecuritySubType()
    {
        return derivativeSecuritySubType;
    }

    public String derivativeSecuritySubTypeAsString()
    {
        return derivativeSecuritySubType.getStringWithoutLengthAscii(derivativeSecuritySubTypeOffset, derivativeSecuritySubTypeLength);
    }

    public DerivativeInstrumentEncoder derivativeSecuritySubType(final CharSequence value)
    {
        toBytes(value, derivativeSecuritySubType);
        derivativeSecuritySubTypeOffset = 0;
        derivativeSecuritySubTypeLength = value.length();
        return this;
    }

    public DerivativeInstrumentEncoder derivativeSecuritySubType(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            derivativeSecuritySubType.wrap(buffer);
            derivativeSecuritySubTypeOffset = value.offset();
            derivativeSecuritySubTypeLength = value.length();
        }
        return this;
    }

    public DerivativeInstrumentEncoder derivativeSecuritySubType(final char[] value)
    {
        return derivativeSecuritySubType(value, 0, value.length);
    }

    public DerivativeInstrumentEncoder derivativeSecuritySubType(final char[] value, final int length)
    {
        return derivativeSecuritySubType(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeSecuritySubType(final char[] value, final int offset, final int length)
    {
        toBytes(value, derivativeSecuritySubType, offset, length);
        derivativeSecuritySubTypeOffset = 0;
        derivativeSecuritySubTypeLength = length;
        return this;
    }

    private final MutableDirectBuffer derivativeMaturityMonthYear = new UnsafeBuffer();

    private int derivativeMaturityMonthYearOffset = 0;

    private int derivativeMaturityMonthYearLength = 0;

    public DerivativeInstrumentEncoder derivativeMaturityMonthYear(final DirectBuffer value, final int offset, final int length)
    {
        derivativeMaturityMonthYear.wrap(value);
        derivativeMaturityMonthYearOffset = offset;
        derivativeMaturityMonthYearLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeMaturityMonthYear(final DirectBuffer value, final int length)
    {
        return derivativeMaturityMonthYear(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeMaturityMonthYear(final DirectBuffer value)
    {
        return derivativeMaturityMonthYear(value, 0, value.capacity());
    }

    public DerivativeInstrumentEncoder derivativeMaturityMonthYear(final byte[] value, final int offset, final int length)
    {
        derivativeMaturityMonthYear.wrap(value);
        derivativeMaturityMonthYearOffset = offset;
        derivativeMaturityMonthYearLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeMaturityMonthYearAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(derivativeMaturityMonthYear, value, offset, length);
        derivativeMaturityMonthYearOffset = offset;
        derivativeMaturityMonthYearLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeMaturityMonthYear(final byte[] value, final int length)
    {
        return derivativeMaturityMonthYear(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeMaturityMonthYear(final byte[] value)
    {
        return derivativeMaturityMonthYear(value, 0, value.length);
    }

    public boolean hasDerivativeMaturityMonthYear()
    {
        return derivativeMaturityMonthYearLength > 0;
    }

    public MutableDirectBuffer derivativeMaturityMonthYear()
    {
        return derivativeMaturityMonthYear;
    }

    public String derivativeMaturityMonthYearAsString()
    {
        return derivativeMaturityMonthYear.getStringWithoutLengthAscii(derivativeMaturityMonthYearOffset, derivativeMaturityMonthYearLength);
    }

    private final MutableDirectBuffer derivativeMaturityDate = new UnsafeBuffer();

    private int derivativeMaturityDateOffset = 0;

    private int derivativeMaturityDateLength = 0;

    public DerivativeInstrumentEncoder derivativeMaturityDate(final DirectBuffer value, final int offset, final int length)
    {
        derivativeMaturityDate.wrap(value);
        derivativeMaturityDateOffset = offset;
        derivativeMaturityDateLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeMaturityDate(final DirectBuffer value, final int length)
    {
        return derivativeMaturityDate(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeMaturityDate(final DirectBuffer value)
    {
        return derivativeMaturityDate(value, 0, value.capacity());
    }

    public DerivativeInstrumentEncoder derivativeMaturityDate(final byte[] value, final int offset, final int length)
    {
        derivativeMaturityDate.wrap(value);
        derivativeMaturityDateOffset = offset;
        derivativeMaturityDateLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeMaturityDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(derivativeMaturityDate, value, offset, length);
        derivativeMaturityDateOffset = offset;
        derivativeMaturityDateLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeMaturityDate(final byte[] value, final int length)
    {
        return derivativeMaturityDate(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeMaturityDate(final byte[] value)
    {
        return derivativeMaturityDate(value, 0, value.length);
    }

    public boolean hasDerivativeMaturityDate()
    {
        return derivativeMaturityDateLength > 0;
    }

    public MutableDirectBuffer derivativeMaturityDate()
    {
        return derivativeMaturityDate;
    }

    public String derivativeMaturityDateAsString()
    {
        return derivativeMaturityDate.getStringWithoutLengthAscii(derivativeMaturityDateOffset, derivativeMaturityDateLength);
    }

    private final MutableDirectBuffer derivativeMaturityTime = new UnsafeBuffer();

    private int derivativeMaturityTimeOffset = 0;

    private int derivativeMaturityTimeLength = 0;

    public DerivativeInstrumentEncoder derivativeMaturityTime(final DirectBuffer value, final int offset, final int length)
    {
        derivativeMaturityTime.wrap(value);
        derivativeMaturityTimeOffset = offset;
        derivativeMaturityTimeLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeMaturityTime(final DirectBuffer value, final int length)
    {
        return derivativeMaturityTime(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeMaturityTime(final DirectBuffer value)
    {
        return derivativeMaturityTime(value, 0, value.capacity());
    }

    public DerivativeInstrumentEncoder derivativeMaturityTime(final byte[] value, final int offset, final int length)
    {
        derivativeMaturityTime.wrap(value);
        derivativeMaturityTimeOffset = offset;
        derivativeMaturityTimeLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeMaturityTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(derivativeMaturityTime, value, offset, length);
        derivativeMaturityTimeOffset = offset;
        derivativeMaturityTimeLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeMaturityTime(final byte[] value, final int length)
    {
        return derivativeMaturityTime(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeMaturityTime(final byte[] value)
    {
        return derivativeMaturityTime(value, 0, value.length);
    }

    public boolean hasDerivativeMaturityTime()
    {
        return derivativeMaturityTimeLength > 0;
    }

    public MutableDirectBuffer derivativeMaturityTime()
    {
        return derivativeMaturityTime;
    }

    public String derivativeMaturityTimeAsString()
    {
        return derivativeMaturityTime.getStringWithoutLengthAscii(derivativeMaturityTimeOffset, derivativeMaturityTimeLength);
    }

    private final MutableDirectBuffer derivativeSettleOnOpenFlag = new UnsafeBuffer();

    private int derivativeSettleOnOpenFlagOffset = 0;

    private int derivativeSettleOnOpenFlagLength = 0;

    public DerivativeInstrumentEncoder derivativeSettleOnOpenFlag(final DirectBuffer value, final int offset, final int length)
    {
        derivativeSettleOnOpenFlag.wrap(value);
        derivativeSettleOnOpenFlagOffset = offset;
        derivativeSettleOnOpenFlagLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeSettleOnOpenFlag(final DirectBuffer value, final int length)
    {
        return derivativeSettleOnOpenFlag(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeSettleOnOpenFlag(final DirectBuffer value)
    {
        return derivativeSettleOnOpenFlag(value, 0, value.capacity());
    }

    public DerivativeInstrumentEncoder derivativeSettleOnOpenFlag(final byte[] value, final int offset, final int length)
    {
        derivativeSettleOnOpenFlag.wrap(value);
        derivativeSettleOnOpenFlagOffset = offset;
        derivativeSettleOnOpenFlagLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeSettleOnOpenFlagAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(derivativeSettleOnOpenFlag, value, offset, length);
        derivativeSettleOnOpenFlagOffset = offset;
        derivativeSettleOnOpenFlagLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeSettleOnOpenFlag(final byte[] value, final int length)
    {
        return derivativeSettleOnOpenFlag(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeSettleOnOpenFlag(final byte[] value)
    {
        return derivativeSettleOnOpenFlag(value, 0, value.length);
    }

    public boolean hasDerivativeSettleOnOpenFlag()
    {
        return derivativeSettleOnOpenFlagLength > 0;
    }

    public MutableDirectBuffer derivativeSettleOnOpenFlag()
    {
        return derivativeSettleOnOpenFlag;
    }

    public String derivativeSettleOnOpenFlagAsString()
    {
        return derivativeSettleOnOpenFlag.getStringWithoutLengthAscii(derivativeSettleOnOpenFlagOffset, derivativeSettleOnOpenFlagLength);
    }

    public DerivativeInstrumentEncoder derivativeSettleOnOpenFlag(final CharSequence value)
    {
        toBytes(value, derivativeSettleOnOpenFlag);
        derivativeSettleOnOpenFlagOffset = 0;
        derivativeSettleOnOpenFlagLength = value.length();
        return this;
    }

    public DerivativeInstrumentEncoder derivativeSettleOnOpenFlag(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            derivativeSettleOnOpenFlag.wrap(buffer);
            derivativeSettleOnOpenFlagOffset = value.offset();
            derivativeSettleOnOpenFlagLength = value.length();
        }
        return this;
    }

    public DerivativeInstrumentEncoder derivativeSettleOnOpenFlag(final char[] value)
    {
        return derivativeSettleOnOpenFlag(value, 0, value.length);
    }

    public DerivativeInstrumentEncoder derivativeSettleOnOpenFlag(final char[] value, final int length)
    {
        return derivativeSettleOnOpenFlag(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeSettleOnOpenFlag(final char[] value, final int offset, final int length)
    {
        toBytes(value, derivativeSettleOnOpenFlag, offset, length);
        derivativeSettleOnOpenFlagOffset = 0;
        derivativeSettleOnOpenFlagLength = length;
        return this;
    }

    private char derivativeInstrmtAssignmentMethod;

    private boolean hasDerivativeInstrmtAssignmentMethod;

    public boolean hasDerivativeInstrmtAssignmentMethod()
    {
        return hasDerivativeInstrmtAssignmentMethod;
    }

    public DerivativeInstrumentEncoder derivativeInstrmtAssignmentMethod(char value)
    {
        derivativeInstrmtAssignmentMethod = value;
        hasDerivativeInstrmtAssignmentMethod = true;
        return this;
    }

    public char derivativeInstrmtAssignmentMethod()
    {
        return derivativeInstrmtAssignmentMethod;
    }

    private final MutableDirectBuffer derivativeSecurityStatus = new UnsafeBuffer();

    private int derivativeSecurityStatusOffset = 0;

    private int derivativeSecurityStatusLength = 0;

    public DerivativeInstrumentEncoder derivativeSecurityStatus(final DirectBuffer value, final int offset, final int length)
    {
        derivativeSecurityStatus.wrap(value);
        derivativeSecurityStatusOffset = offset;
        derivativeSecurityStatusLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeSecurityStatus(final DirectBuffer value, final int length)
    {
        return derivativeSecurityStatus(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeSecurityStatus(final DirectBuffer value)
    {
        return derivativeSecurityStatus(value, 0, value.capacity());
    }

    public DerivativeInstrumentEncoder derivativeSecurityStatus(final byte[] value, final int offset, final int length)
    {
        derivativeSecurityStatus.wrap(value);
        derivativeSecurityStatusOffset = offset;
        derivativeSecurityStatusLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeSecurityStatusAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(derivativeSecurityStatus, value, offset, length);
        derivativeSecurityStatusOffset = offset;
        derivativeSecurityStatusLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeSecurityStatus(final byte[] value, final int length)
    {
        return derivativeSecurityStatus(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeSecurityStatus(final byte[] value)
    {
        return derivativeSecurityStatus(value, 0, value.length);
    }

    public boolean hasDerivativeSecurityStatus()
    {
        return derivativeSecurityStatusLength > 0;
    }

    public MutableDirectBuffer derivativeSecurityStatus()
    {
        return derivativeSecurityStatus;
    }

    public String derivativeSecurityStatusAsString()
    {
        return derivativeSecurityStatus.getStringWithoutLengthAscii(derivativeSecurityStatusOffset, derivativeSecurityStatusLength);
    }

    public DerivativeInstrumentEncoder derivativeSecurityStatus(final CharSequence value)
    {
        toBytes(value, derivativeSecurityStatus);
        derivativeSecurityStatusOffset = 0;
        derivativeSecurityStatusLength = value.length();
        return this;
    }

    public DerivativeInstrumentEncoder derivativeSecurityStatus(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            derivativeSecurityStatus.wrap(buffer);
            derivativeSecurityStatusOffset = value.offset();
            derivativeSecurityStatusLength = value.length();
        }
        return this;
    }

    public DerivativeInstrumentEncoder derivativeSecurityStatus(final char[] value)
    {
        return derivativeSecurityStatus(value, 0, value.length);
    }

    public DerivativeInstrumentEncoder derivativeSecurityStatus(final char[] value, final int length)
    {
        return derivativeSecurityStatus(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeSecurityStatus(final char[] value, final int offset, final int length)
    {
        toBytes(value, derivativeSecurityStatus, offset, length);
        derivativeSecurityStatusOffset = 0;
        derivativeSecurityStatusLength = length;
        return this;
    }

    private final MutableDirectBuffer derivativeIssueDate = new UnsafeBuffer();

    private int derivativeIssueDateOffset = 0;

    private int derivativeIssueDateLength = 0;

    public DerivativeInstrumentEncoder derivativeIssueDate(final DirectBuffer value, final int offset, final int length)
    {
        derivativeIssueDate.wrap(value);
        derivativeIssueDateOffset = offset;
        derivativeIssueDateLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeIssueDate(final DirectBuffer value, final int length)
    {
        return derivativeIssueDate(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeIssueDate(final DirectBuffer value)
    {
        return derivativeIssueDate(value, 0, value.capacity());
    }

    public DerivativeInstrumentEncoder derivativeIssueDate(final byte[] value, final int offset, final int length)
    {
        derivativeIssueDate.wrap(value);
        derivativeIssueDateOffset = offset;
        derivativeIssueDateLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeIssueDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(derivativeIssueDate, value, offset, length);
        derivativeIssueDateOffset = offset;
        derivativeIssueDateLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeIssueDate(final byte[] value, final int length)
    {
        return derivativeIssueDate(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeIssueDate(final byte[] value)
    {
        return derivativeIssueDate(value, 0, value.length);
    }

    public boolean hasDerivativeIssueDate()
    {
        return derivativeIssueDateLength > 0;
    }

    public MutableDirectBuffer derivativeIssueDate()
    {
        return derivativeIssueDate;
    }

    public String derivativeIssueDateAsString()
    {
        return derivativeIssueDate.getStringWithoutLengthAscii(derivativeIssueDateOffset, derivativeIssueDateLength);
    }

    private final MutableDirectBuffer derivativeInstrRegistry = new UnsafeBuffer();

    private int derivativeInstrRegistryOffset = 0;

    private int derivativeInstrRegistryLength = 0;

    public DerivativeInstrumentEncoder derivativeInstrRegistry(final DirectBuffer value, final int offset, final int length)
    {
        derivativeInstrRegistry.wrap(value);
        derivativeInstrRegistryOffset = offset;
        derivativeInstrRegistryLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeInstrRegistry(final DirectBuffer value, final int length)
    {
        return derivativeInstrRegistry(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeInstrRegistry(final DirectBuffer value)
    {
        return derivativeInstrRegistry(value, 0, value.capacity());
    }

    public DerivativeInstrumentEncoder derivativeInstrRegistry(final byte[] value, final int offset, final int length)
    {
        derivativeInstrRegistry.wrap(value);
        derivativeInstrRegistryOffset = offset;
        derivativeInstrRegistryLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeInstrRegistryAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(derivativeInstrRegistry, value, offset, length);
        derivativeInstrRegistryOffset = offset;
        derivativeInstrRegistryLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeInstrRegistry(final byte[] value, final int length)
    {
        return derivativeInstrRegistry(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeInstrRegistry(final byte[] value)
    {
        return derivativeInstrRegistry(value, 0, value.length);
    }

    public boolean hasDerivativeInstrRegistry()
    {
        return derivativeInstrRegistryLength > 0;
    }

    public MutableDirectBuffer derivativeInstrRegistry()
    {
        return derivativeInstrRegistry;
    }

    public String derivativeInstrRegistryAsString()
    {
        return derivativeInstrRegistry.getStringWithoutLengthAscii(derivativeInstrRegistryOffset, derivativeInstrRegistryLength);
    }

    public DerivativeInstrumentEncoder derivativeInstrRegistry(final CharSequence value)
    {
        toBytes(value, derivativeInstrRegistry);
        derivativeInstrRegistryOffset = 0;
        derivativeInstrRegistryLength = value.length();
        return this;
    }

    public DerivativeInstrumentEncoder derivativeInstrRegistry(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            derivativeInstrRegistry.wrap(buffer);
            derivativeInstrRegistryOffset = value.offset();
            derivativeInstrRegistryLength = value.length();
        }
        return this;
    }

    public DerivativeInstrumentEncoder derivativeInstrRegistry(final char[] value)
    {
        return derivativeInstrRegistry(value, 0, value.length);
    }

    public DerivativeInstrumentEncoder derivativeInstrRegistry(final char[] value, final int length)
    {
        return derivativeInstrRegistry(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeInstrRegistry(final char[] value, final int offset, final int length)
    {
        toBytes(value, derivativeInstrRegistry, offset, length);
        derivativeInstrRegistryOffset = 0;
        derivativeInstrRegistryLength = length;
        return this;
    }

    private final MutableDirectBuffer derivativeCountryOfIssue = new UnsafeBuffer();

    private int derivativeCountryOfIssueOffset = 0;

    private int derivativeCountryOfIssueLength = 0;

    public DerivativeInstrumentEncoder derivativeCountryOfIssue(final DirectBuffer value, final int offset, final int length)
    {
        derivativeCountryOfIssue.wrap(value);
        derivativeCountryOfIssueOffset = offset;
        derivativeCountryOfIssueLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeCountryOfIssue(final DirectBuffer value, final int length)
    {
        return derivativeCountryOfIssue(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeCountryOfIssue(final DirectBuffer value)
    {
        return derivativeCountryOfIssue(value, 0, value.capacity());
    }

    public DerivativeInstrumentEncoder derivativeCountryOfIssue(final byte[] value, final int offset, final int length)
    {
        derivativeCountryOfIssue.wrap(value);
        derivativeCountryOfIssueOffset = offset;
        derivativeCountryOfIssueLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeCountryOfIssueAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(derivativeCountryOfIssue, value, offset, length);
        derivativeCountryOfIssueOffset = offset;
        derivativeCountryOfIssueLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeCountryOfIssue(final byte[] value, final int length)
    {
        return derivativeCountryOfIssue(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeCountryOfIssue(final byte[] value)
    {
        return derivativeCountryOfIssue(value, 0, value.length);
    }

    public boolean hasDerivativeCountryOfIssue()
    {
        return derivativeCountryOfIssueLength > 0;
    }

    public MutableDirectBuffer derivativeCountryOfIssue()
    {
        return derivativeCountryOfIssue;
    }

    public String derivativeCountryOfIssueAsString()
    {
        return derivativeCountryOfIssue.getStringWithoutLengthAscii(derivativeCountryOfIssueOffset, derivativeCountryOfIssueLength);
    }

    public DerivativeInstrumentEncoder derivativeCountryOfIssue(final CharSequence value)
    {
        toBytes(value, derivativeCountryOfIssue);
        derivativeCountryOfIssueOffset = 0;
        derivativeCountryOfIssueLength = value.length();
        return this;
    }

    public DerivativeInstrumentEncoder derivativeCountryOfIssue(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            derivativeCountryOfIssue.wrap(buffer);
            derivativeCountryOfIssueOffset = value.offset();
            derivativeCountryOfIssueLength = value.length();
        }
        return this;
    }

    public DerivativeInstrumentEncoder derivativeCountryOfIssue(final char[] value)
    {
        return derivativeCountryOfIssue(value, 0, value.length);
    }

    public DerivativeInstrumentEncoder derivativeCountryOfIssue(final char[] value, final int length)
    {
        return derivativeCountryOfIssue(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeCountryOfIssue(final char[] value, final int offset, final int length)
    {
        toBytes(value, derivativeCountryOfIssue, offset, length);
        derivativeCountryOfIssueOffset = 0;
        derivativeCountryOfIssueLength = length;
        return this;
    }

    private final MutableDirectBuffer derivativeStateOrProvinceOfIssue = new UnsafeBuffer();

    private int derivativeStateOrProvinceOfIssueOffset = 0;

    private int derivativeStateOrProvinceOfIssueLength = 0;

    public DerivativeInstrumentEncoder derivativeStateOrProvinceOfIssue(final DirectBuffer value, final int offset, final int length)
    {
        derivativeStateOrProvinceOfIssue.wrap(value);
        derivativeStateOrProvinceOfIssueOffset = offset;
        derivativeStateOrProvinceOfIssueLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeStateOrProvinceOfIssue(final DirectBuffer value, final int length)
    {
        return derivativeStateOrProvinceOfIssue(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeStateOrProvinceOfIssue(final DirectBuffer value)
    {
        return derivativeStateOrProvinceOfIssue(value, 0, value.capacity());
    }

    public DerivativeInstrumentEncoder derivativeStateOrProvinceOfIssue(final byte[] value, final int offset, final int length)
    {
        derivativeStateOrProvinceOfIssue.wrap(value);
        derivativeStateOrProvinceOfIssueOffset = offset;
        derivativeStateOrProvinceOfIssueLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeStateOrProvinceOfIssueAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(derivativeStateOrProvinceOfIssue, value, offset, length);
        derivativeStateOrProvinceOfIssueOffset = offset;
        derivativeStateOrProvinceOfIssueLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeStateOrProvinceOfIssue(final byte[] value, final int length)
    {
        return derivativeStateOrProvinceOfIssue(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeStateOrProvinceOfIssue(final byte[] value)
    {
        return derivativeStateOrProvinceOfIssue(value, 0, value.length);
    }

    public boolean hasDerivativeStateOrProvinceOfIssue()
    {
        return derivativeStateOrProvinceOfIssueLength > 0;
    }

    public MutableDirectBuffer derivativeStateOrProvinceOfIssue()
    {
        return derivativeStateOrProvinceOfIssue;
    }

    public String derivativeStateOrProvinceOfIssueAsString()
    {
        return derivativeStateOrProvinceOfIssue.getStringWithoutLengthAscii(derivativeStateOrProvinceOfIssueOffset, derivativeStateOrProvinceOfIssueLength);
    }

    public DerivativeInstrumentEncoder derivativeStateOrProvinceOfIssue(final CharSequence value)
    {
        toBytes(value, derivativeStateOrProvinceOfIssue);
        derivativeStateOrProvinceOfIssueOffset = 0;
        derivativeStateOrProvinceOfIssueLength = value.length();
        return this;
    }

    public DerivativeInstrumentEncoder derivativeStateOrProvinceOfIssue(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            derivativeStateOrProvinceOfIssue.wrap(buffer);
            derivativeStateOrProvinceOfIssueOffset = value.offset();
            derivativeStateOrProvinceOfIssueLength = value.length();
        }
        return this;
    }

    public DerivativeInstrumentEncoder derivativeStateOrProvinceOfIssue(final char[] value)
    {
        return derivativeStateOrProvinceOfIssue(value, 0, value.length);
    }

    public DerivativeInstrumentEncoder derivativeStateOrProvinceOfIssue(final char[] value, final int length)
    {
        return derivativeStateOrProvinceOfIssue(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeStateOrProvinceOfIssue(final char[] value, final int offset, final int length)
    {
        toBytes(value, derivativeStateOrProvinceOfIssue, offset, length);
        derivativeStateOrProvinceOfIssueOffset = 0;
        derivativeStateOrProvinceOfIssueLength = length;
        return this;
    }

    private final MutableDirectBuffer derivativeLocaleOfIssue = new UnsafeBuffer();

    private int derivativeLocaleOfIssueOffset = 0;

    private int derivativeLocaleOfIssueLength = 0;

    public DerivativeInstrumentEncoder derivativeLocaleOfIssue(final DirectBuffer value, final int offset, final int length)
    {
        derivativeLocaleOfIssue.wrap(value);
        derivativeLocaleOfIssueOffset = offset;
        derivativeLocaleOfIssueLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeLocaleOfIssue(final DirectBuffer value, final int length)
    {
        return derivativeLocaleOfIssue(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeLocaleOfIssue(final DirectBuffer value)
    {
        return derivativeLocaleOfIssue(value, 0, value.capacity());
    }

    public DerivativeInstrumentEncoder derivativeLocaleOfIssue(final byte[] value, final int offset, final int length)
    {
        derivativeLocaleOfIssue.wrap(value);
        derivativeLocaleOfIssueOffset = offset;
        derivativeLocaleOfIssueLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeLocaleOfIssueAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(derivativeLocaleOfIssue, value, offset, length);
        derivativeLocaleOfIssueOffset = offset;
        derivativeLocaleOfIssueLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeLocaleOfIssue(final byte[] value, final int length)
    {
        return derivativeLocaleOfIssue(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeLocaleOfIssue(final byte[] value)
    {
        return derivativeLocaleOfIssue(value, 0, value.length);
    }

    public boolean hasDerivativeLocaleOfIssue()
    {
        return derivativeLocaleOfIssueLength > 0;
    }

    public MutableDirectBuffer derivativeLocaleOfIssue()
    {
        return derivativeLocaleOfIssue;
    }

    public String derivativeLocaleOfIssueAsString()
    {
        return derivativeLocaleOfIssue.getStringWithoutLengthAscii(derivativeLocaleOfIssueOffset, derivativeLocaleOfIssueLength);
    }

    public DerivativeInstrumentEncoder derivativeLocaleOfIssue(final CharSequence value)
    {
        toBytes(value, derivativeLocaleOfIssue);
        derivativeLocaleOfIssueOffset = 0;
        derivativeLocaleOfIssueLength = value.length();
        return this;
    }

    public DerivativeInstrumentEncoder derivativeLocaleOfIssue(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            derivativeLocaleOfIssue.wrap(buffer);
            derivativeLocaleOfIssueOffset = value.offset();
            derivativeLocaleOfIssueLength = value.length();
        }
        return this;
    }

    public DerivativeInstrumentEncoder derivativeLocaleOfIssue(final char[] value)
    {
        return derivativeLocaleOfIssue(value, 0, value.length);
    }

    public DerivativeInstrumentEncoder derivativeLocaleOfIssue(final char[] value, final int length)
    {
        return derivativeLocaleOfIssue(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeLocaleOfIssue(final char[] value, final int offset, final int length)
    {
        toBytes(value, derivativeLocaleOfIssue, offset, length);
        derivativeLocaleOfIssueOffset = 0;
        derivativeLocaleOfIssueLength = length;
        return this;
    }

    private final DecimalFloat derivativeStrikePrice = new DecimalFloat();

    private boolean hasDerivativeStrikePrice;

    public boolean hasDerivativeStrikePrice()
    {
        return hasDerivativeStrikePrice;
    }

    public DerivativeInstrumentEncoder derivativeStrikePrice(DecimalFloat value)
    {
        derivativeStrikePrice.set(value);
        hasDerivativeStrikePrice = true;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeStrikePrice(long value, int scale)
    {
        derivativeStrikePrice.set(value, scale);
        hasDerivativeStrikePrice = true;
        return this;
    }

    public DecimalFloat derivativeStrikePrice()
    {
        return derivativeStrikePrice;
    }

    private final MutableDirectBuffer derivativeStrikeCurrency = new UnsafeBuffer();

    private int derivativeStrikeCurrencyOffset = 0;

    private int derivativeStrikeCurrencyLength = 0;

    public DerivativeInstrumentEncoder derivativeStrikeCurrency(final DirectBuffer value, final int offset, final int length)
    {
        derivativeStrikeCurrency.wrap(value);
        derivativeStrikeCurrencyOffset = offset;
        derivativeStrikeCurrencyLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeStrikeCurrency(final DirectBuffer value, final int length)
    {
        return derivativeStrikeCurrency(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeStrikeCurrency(final DirectBuffer value)
    {
        return derivativeStrikeCurrency(value, 0, value.capacity());
    }

    public DerivativeInstrumentEncoder derivativeStrikeCurrency(final byte[] value, final int offset, final int length)
    {
        derivativeStrikeCurrency.wrap(value);
        derivativeStrikeCurrencyOffset = offset;
        derivativeStrikeCurrencyLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeStrikeCurrencyAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(derivativeStrikeCurrency, value, offset, length);
        derivativeStrikeCurrencyOffset = offset;
        derivativeStrikeCurrencyLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeStrikeCurrency(final byte[] value, final int length)
    {
        return derivativeStrikeCurrency(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeStrikeCurrency(final byte[] value)
    {
        return derivativeStrikeCurrency(value, 0, value.length);
    }

    public boolean hasDerivativeStrikeCurrency()
    {
        return derivativeStrikeCurrencyLength > 0;
    }

    public MutableDirectBuffer derivativeStrikeCurrency()
    {
        return derivativeStrikeCurrency;
    }

    public String derivativeStrikeCurrencyAsString()
    {
        return derivativeStrikeCurrency.getStringWithoutLengthAscii(derivativeStrikeCurrencyOffset, derivativeStrikeCurrencyLength);
    }

    public DerivativeInstrumentEncoder derivativeStrikeCurrency(final CharSequence value)
    {
        toBytes(value, derivativeStrikeCurrency);
        derivativeStrikeCurrencyOffset = 0;
        derivativeStrikeCurrencyLength = value.length();
        return this;
    }

    public DerivativeInstrumentEncoder derivativeStrikeCurrency(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            derivativeStrikeCurrency.wrap(buffer);
            derivativeStrikeCurrencyOffset = value.offset();
            derivativeStrikeCurrencyLength = value.length();
        }
        return this;
    }

    public DerivativeInstrumentEncoder derivativeStrikeCurrency(final char[] value)
    {
        return derivativeStrikeCurrency(value, 0, value.length);
    }

    public DerivativeInstrumentEncoder derivativeStrikeCurrency(final char[] value, final int length)
    {
        return derivativeStrikeCurrency(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeStrikeCurrency(final char[] value, final int offset, final int length)
    {
        toBytes(value, derivativeStrikeCurrency, offset, length);
        derivativeStrikeCurrencyOffset = 0;
        derivativeStrikeCurrencyLength = length;
        return this;
    }

    private final DecimalFloat derivativeStrikeMultiplier = new DecimalFloat();

    private boolean hasDerivativeStrikeMultiplier;

    public boolean hasDerivativeStrikeMultiplier()
    {
        return hasDerivativeStrikeMultiplier;
    }

    public DerivativeInstrumentEncoder derivativeStrikeMultiplier(DecimalFloat value)
    {
        derivativeStrikeMultiplier.set(value);
        hasDerivativeStrikeMultiplier = true;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeStrikeMultiplier(long value, int scale)
    {
        derivativeStrikeMultiplier.set(value, scale);
        hasDerivativeStrikeMultiplier = true;
        return this;
    }

    public DecimalFloat derivativeStrikeMultiplier()
    {
        return derivativeStrikeMultiplier;
    }

    private final DecimalFloat derivativeStrikeValue = new DecimalFloat();

    private boolean hasDerivativeStrikeValue;

    public boolean hasDerivativeStrikeValue()
    {
        return hasDerivativeStrikeValue;
    }

    public DerivativeInstrumentEncoder derivativeStrikeValue(DecimalFloat value)
    {
        derivativeStrikeValue.set(value);
        hasDerivativeStrikeValue = true;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeStrikeValue(long value, int scale)
    {
        derivativeStrikeValue.set(value, scale);
        hasDerivativeStrikeValue = true;
        return this;
    }

    public DecimalFloat derivativeStrikeValue()
    {
        return derivativeStrikeValue;
    }

    private char derivativeOptAttribute;

    private boolean hasDerivativeOptAttribute;

    public boolean hasDerivativeOptAttribute()
    {
        return hasDerivativeOptAttribute;
    }

    public DerivativeInstrumentEncoder derivativeOptAttribute(char value)
    {
        derivativeOptAttribute = value;
        hasDerivativeOptAttribute = true;
        return this;
    }

    public char derivativeOptAttribute()
    {
        return derivativeOptAttribute;
    }

    private final DecimalFloat derivativeContractMultiplier = new DecimalFloat();

    private boolean hasDerivativeContractMultiplier;

    public boolean hasDerivativeContractMultiplier()
    {
        return hasDerivativeContractMultiplier;
    }

    public DerivativeInstrumentEncoder derivativeContractMultiplier(DecimalFloat value)
    {
        derivativeContractMultiplier.set(value);
        hasDerivativeContractMultiplier = true;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeContractMultiplier(long value, int scale)
    {
        derivativeContractMultiplier.set(value, scale);
        hasDerivativeContractMultiplier = true;
        return this;
    }

    public DecimalFloat derivativeContractMultiplier()
    {
        return derivativeContractMultiplier;
    }

    private int derivativeContractMultiplierUnit;

    private boolean hasDerivativeContractMultiplierUnit;

    public boolean hasDerivativeContractMultiplierUnit()
    {
        return hasDerivativeContractMultiplierUnit;
    }

    public DerivativeInstrumentEncoder derivativeContractMultiplierUnit(int value)
    {
        derivativeContractMultiplierUnit = value;
        hasDerivativeContractMultiplierUnit = true;
        return this;
    }

    public int derivativeContractMultiplierUnit()
    {
        return derivativeContractMultiplierUnit;
    }

    private int derivativeFlowScheduleType;

    private boolean hasDerivativeFlowScheduleType;

    public boolean hasDerivativeFlowScheduleType()
    {
        return hasDerivativeFlowScheduleType;
    }

    public DerivativeInstrumentEncoder derivativeFlowScheduleType(int value)
    {
        derivativeFlowScheduleType = value;
        hasDerivativeFlowScheduleType = true;
        return this;
    }

    public int derivativeFlowScheduleType()
    {
        return derivativeFlowScheduleType;
    }

    private final DecimalFloat derivativeMinPriceIncrement = new DecimalFloat();

    private boolean hasDerivativeMinPriceIncrement;

    public boolean hasDerivativeMinPriceIncrement()
    {
        return hasDerivativeMinPriceIncrement;
    }

    public DerivativeInstrumentEncoder derivativeMinPriceIncrement(DecimalFloat value)
    {
        derivativeMinPriceIncrement.set(value);
        hasDerivativeMinPriceIncrement = true;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeMinPriceIncrement(long value, int scale)
    {
        derivativeMinPriceIncrement.set(value, scale);
        hasDerivativeMinPriceIncrement = true;
        return this;
    }

    public DecimalFloat derivativeMinPriceIncrement()
    {
        return derivativeMinPriceIncrement;
    }

    private final DecimalFloat derivativeMinPriceIncrementAmount = new DecimalFloat();

    private boolean hasDerivativeMinPriceIncrementAmount;

    public boolean hasDerivativeMinPriceIncrementAmount()
    {
        return hasDerivativeMinPriceIncrementAmount;
    }

    public DerivativeInstrumentEncoder derivativeMinPriceIncrementAmount(DecimalFloat value)
    {
        derivativeMinPriceIncrementAmount.set(value);
        hasDerivativeMinPriceIncrementAmount = true;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeMinPriceIncrementAmount(long value, int scale)
    {
        derivativeMinPriceIncrementAmount.set(value, scale);
        hasDerivativeMinPriceIncrementAmount = true;
        return this;
    }

    public DecimalFloat derivativeMinPriceIncrementAmount()
    {
        return derivativeMinPriceIncrementAmount;
    }

    private final MutableDirectBuffer derivativeUnitOfMeasure = new UnsafeBuffer();

    private int derivativeUnitOfMeasureOffset = 0;

    private int derivativeUnitOfMeasureLength = 0;

    public DerivativeInstrumentEncoder derivativeUnitOfMeasure(final DirectBuffer value, final int offset, final int length)
    {
        derivativeUnitOfMeasure.wrap(value);
        derivativeUnitOfMeasureOffset = offset;
        derivativeUnitOfMeasureLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeUnitOfMeasure(final DirectBuffer value, final int length)
    {
        return derivativeUnitOfMeasure(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeUnitOfMeasure(final DirectBuffer value)
    {
        return derivativeUnitOfMeasure(value, 0, value.capacity());
    }

    public DerivativeInstrumentEncoder derivativeUnitOfMeasure(final byte[] value, final int offset, final int length)
    {
        derivativeUnitOfMeasure.wrap(value);
        derivativeUnitOfMeasureOffset = offset;
        derivativeUnitOfMeasureLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeUnitOfMeasureAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(derivativeUnitOfMeasure, value, offset, length);
        derivativeUnitOfMeasureOffset = offset;
        derivativeUnitOfMeasureLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeUnitOfMeasure(final byte[] value, final int length)
    {
        return derivativeUnitOfMeasure(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeUnitOfMeasure(final byte[] value)
    {
        return derivativeUnitOfMeasure(value, 0, value.length);
    }

    public boolean hasDerivativeUnitOfMeasure()
    {
        return derivativeUnitOfMeasureLength > 0;
    }

    public MutableDirectBuffer derivativeUnitOfMeasure()
    {
        return derivativeUnitOfMeasure;
    }

    public String derivativeUnitOfMeasureAsString()
    {
        return derivativeUnitOfMeasure.getStringWithoutLengthAscii(derivativeUnitOfMeasureOffset, derivativeUnitOfMeasureLength);
    }

    public DerivativeInstrumentEncoder derivativeUnitOfMeasure(final CharSequence value)
    {
        toBytes(value, derivativeUnitOfMeasure);
        derivativeUnitOfMeasureOffset = 0;
        derivativeUnitOfMeasureLength = value.length();
        return this;
    }

    public DerivativeInstrumentEncoder derivativeUnitOfMeasure(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            derivativeUnitOfMeasure.wrap(buffer);
            derivativeUnitOfMeasureOffset = value.offset();
            derivativeUnitOfMeasureLength = value.length();
        }
        return this;
    }

    public DerivativeInstrumentEncoder derivativeUnitOfMeasure(final char[] value)
    {
        return derivativeUnitOfMeasure(value, 0, value.length);
    }

    public DerivativeInstrumentEncoder derivativeUnitOfMeasure(final char[] value, final int length)
    {
        return derivativeUnitOfMeasure(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeUnitOfMeasure(final char[] value, final int offset, final int length)
    {
        toBytes(value, derivativeUnitOfMeasure, offset, length);
        derivativeUnitOfMeasureOffset = 0;
        derivativeUnitOfMeasureLength = length;
        return this;
    }

    private final DecimalFloat derivativeUnitOfMeasureQty = new DecimalFloat();

    private boolean hasDerivativeUnitOfMeasureQty;

    public boolean hasDerivativeUnitOfMeasureQty()
    {
        return hasDerivativeUnitOfMeasureQty;
    }

    public DerivativeInstrumentEncoder derivativeUnitOfMeasureQty(DecimalFloat value)
    {
        derivativeUnitOfMeasureQty.set(value);
        hasDerivativeUnitOfMeasureQty = true;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeUnitOfMeasureQty(long value, int scale)
    {
        derivativeUnitOfMeasureQty.set(value, scale);
        hasDerivativeUnitOfMeasureQty = true;
        return this;
    }

    public DecimalFloat derivativeUnitOfMeasureQty()
    {
        return derivativeUnitOfMeasureQty;
    }

    private final MutableDirectBuffer derivativePriceUnitOfMeasure = new UnsafeBuffer();

    private int derivativePriceUnitOfMeasureOffset = 0;

    private int derivativePriceUnitOfMeasureLength = 0;

    public DerivativeInstrumentEncoder derivativePriceUnitOfMeasure(final DirectBuffer value, final int offset, final int length)
    {
        derivativePriceUnitOfMeasure.wrap(value);
        derivativePriceUnitOfMeasureOffset = offset;
        derivativePriceUnitOfMeasureLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativePriceUnitOfMeasure(final DirectBuffer value, final int length)
    {
        return derivativePriceUnitOfMeasure(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativePriceUnitOfMeasure(final DirectBuffer value)
    {
        return derivativePriceUnitOfMeasure(value, 0, value.capacity());
    }

    public DerivativeInstrumentEncoder derivativePriceUnitOfMeasure(final byte[] value, final int offset, final int length)
    {
        derivativePriceUnitOfMeasure.wrap(value);
        derivativePriceUnitOfMeasureOffset = offset;
        derivativePriceUnitOfMeasureLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativePriceUnitOfMeasureAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(derivativePriceUnitOfMeasure, value, offset, length);
        derivativePriceUnitOfMeasureOffset = offset;
        derivativePriceUnitOfMeasureLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativePriceUnitOfMeasure(final byte[] value, final int length)
    {
        return derivativePriceUnitOfMeasure(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativePriceUnitOfMeasure(final byte[] value)
    {
        return derivativePriceUnitOfMeasure(value, 0, value.length);
    }

    public boolean hasDerivativePriceUnitOfMeasure()
    {
        return derivativePriceUnitOfMeasureLength > 0;
    }

    public MutableDirectBuffer derivativePriceUnitOfMeasure()
    {
        return derivativePriceUnitOfMeasure;
    }

    public String derivativePriceUnitOfMeasureAsString()
    {
        return derivativePriceUnitOfMeasure.getStringWithoutLengthAscii(derivativePriceUnitOfMeasureOffset, derivativePriceUnitOfMeasureLength);
    }

    public DerivativeInstrumentEncoder derivativePriceUnitOfMeasure(final CharSequence value)
    {
        toBytes(value, derivativePriceUnitOfMeasure);
        derivativePriceUnitOfMeasureOffset = 0;
        derivativePriceUnitOfMeasureLength = value.length();
        return this;
    }

    public DerivativeInstrumentEncoder derivativePriceUnitOfMeasure(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            derivativePriceUnitOfMeasure.wrap(buffer);
            derivativePriceUnitOfMeasureOffset = value.offset();
            derivativePriceUnitOfMeasureLength = value.length();
        }
        return this;
    }

    public DerivativeInstrumentEncoder derivativePriceUnitOfMeasure(final char[] value)
    {
        return derivativePriceUnitOfMeasure(value, 0, value.length);
    }

    public DerivativeInstrumentEncoder derivativePriceUnitOfMeasure(final char[] value, final int length)
    {
        return derivativePriceUnitOfMeasure(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativePriceUnitOfMeasure(final char[] value, final int offset, final int length)
    {
        toBytes(value, derivativePriceUnitOfMeasure, offset, length);
        derivativePriceUnitOfMeasureOffset = 0;
        derivativePriceUnitOfMeasureLength = length;
        return this;
    }

    private final DecimalFloat derivativePriceUnitOfMeasureQty = new DecimalFloat();

    private boolean hasDerivativePriceUnitOfMeasureQty;

    public boolean hasDerivativePriceUnitOfMeasureQty()
    {
        return hasDerivativePriceUnitOfMeasureQty;
    }

    public DerivativeInstrumentEncoder derivativePriceUnitOfMeasureQty(DecimalFloat value)
    {
        derivativePriceUnitOfMeasureQty.set(value);
        hasDerivativePriceUnitOfMeasureQty = true;
        return this;
    }

    public DerivativeInstrumentEncoder derivativePriceUnitOfMeasureQty(long value, int scale)
    {
        derivativePriceUnitOfMeasureQty.set(value, scale);
        hasDerivativePriceUnitOfMeasureQty = true;
        return this;
    }

    public DecimalFloat derivativePriceUnitOfMeasureQty()
    {
        return derivativePriceUnitOfMeasureQty;
    }

    private char derivativeSettlMethod;

    private boolean hasDerivativeSettlMethod;

    public boolean hasDerivativeSettlMethod()
    {
        return hasDerivativeSettlMethod;
    }

    public DerivativeInstrumentEncoder derivativeSettlMethod(char value)
    {
        derivativeSettlMethod = value;
        hasDerivativeSettlMethod = true;
        return this;
    }

    public char derivativeSettlMethod()
    {
        return derivativeSettlMethod;
    }

    private final MutableDirectBuffer derivativePriceQuoteMethod = new UnsafeBuffer();

    private int derivativePriceQuoteMethodOffset = 0;

    private int derivativePriceQuoteMethodLength = 0;

    public DerivativeInstrumentEncoder derivativePriceQuoteMethod(final DirectBuffer value, final int offset, final int length)
    {
        derivativePriceQuoteMethod.wrap(value);
        derivativePriceQuoteMethodOffset = offset;
        derivativePriceQuoteMethodLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativePriceQuoteMethod(final DirectBuffer value, final int length)
    {
        return derivativePriceQuoteMethod(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativePriceQuoteMethod(final DirectBuffer value)
    {
        return derivativePriceQuoteMethod(value, 0, value.capacity());
    }

    public DerivativeInstrumentEncoder derivativePriceQuoteMethod(final byte[] value, final int offset, final int length)
    {
        derivativePriceQuoteMethod.wrap(value);
        derivativePriceQuoteMethodOffset = offset;
        derivativePriceQuoteMethodLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativePriceQuoteMethodAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(derivativePriceQuoteMethod, value, offset, length);
        derivativePriceQuoteMethodOffset = offset;
        derivativePriceQuoteMethodLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativePriceQuoteMethod(final byte[] value, final int length)
    {
        return derivativePriceQuoteMethod(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativePriceQuoteMethod(final byte[] value)
    {
        return derivativePriceQuoteMethod(value, 0, value.length);
    }

    public boolean hasDerivativePriceQuoteMethod()
    {
        return derivativePriceQuoteMethodLength > 0;
    }

    public MutableDirectBuffer derivativePriceQuoteMethod()
    {
        return derivativePriceQuoteMethod;
    }

    public String derivativePriceQuoteMethodAsString()
    {
        return derivativePriceQuoteMethod.getStringWithoutLengthAscii(derivativePriceQuoteMethodOffset, derivativePriceQuoteMethodLength);
    }

    public DerivativeInstrumentEncoder derivativePriceQuoteMethod(final CharSequence value)
    {
        toBytes(value, derivativePriceQuoteMethod);
        derivativePriceQuoteMethodOffset = 0;
        derivativePriceQuoteMethodLength = value.length();
        return this;
    }

    public DerivativeInstrumentEncoder derivativePriceQuoteMethod(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            derivativePriceQuoteMethod.wrap(buffer);
            derivativePriceQuoteMethodOffset = value.offset();
            derivativePriceQuoteMethodLength = value.length();
        }
        return this;
    }

    public DerivativeInstrumentEncoder derivativePriceQuoteMethod(final char[] value)
    {
        return derivativePriceQuoteMethod(value, 0, value.length);
    }

    public DerivativeInstrumentEncoder derivativePriceQuoteMethod(final char[] value, final int length)
    {
        return derivativePriceQuoteMethod(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativePriceQuoteMethod(final char[] value, final int offset, final int length)
    {
        toBytes(value, derivativePriceQuoteMethod, offset, length);
        derivativePriceQuoteMethodOffset = 0;
        derivativePriceQuoteMethodLength = length;
        return this;
    }

    private final MutableDirectBuffer derivativeValuationMethod = new UnsafeBuffer();

    private int derivativeValuationMethodOffset = 0;

    private int derivativeValuationMethodLength = 0;

    public DerivativeInstrumentEncoder derivativeValuationMethod(final DirectBuffer value, final int offset, final int length)
    {
        derivativeValuationMethod.wrap(value);
        derivativeValuationMethodOffset = offset;
        derivativeValuationMethodLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeValuationMethod(final DirectBuffer value, final int length)
    {
        return derivativeValuationMethod(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeValuationMethod(final DirectBuffer value)
    {
        return derivativeValuationMethod(value, 0, value.capacity());
    }

    public DerivativeInstrumentEncoder derivativeValuationMethod(final byte[] value, final int offset, final int length)
    {
        derivativeValuationMethod.wrap(value);
        derivativeValuationMethodOffset = offset;
        derivativeValuationMethodLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeValuationMethodAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(derivativeValuationMethod, value, offset, length);
        derivativeValuationMethodOffset = offset;
        derivativeValuationMethodLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeValuationMethod(final byte[] value, final int length)
    {
        return derivativeValuationMethod(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeValuationMethod(final byte[] value)
    {
        return derivativeValuationMethod(value, 0, value.length);
    }

    public boolean hasDerivativeValuationMethod()
    {
        return derivativeValuationMethodLength > 0;
    }

    public MutableDirectBuffer derivativeValuationMethod()
    {
        return derivativeValuationMethod;
    }

    public String derivativeValuationMethodAsString()
    {
        return derivativeValuationMethod.getStringWithoutLengthAscii(derivativeValuationMethodOffset, derivativeValuationMethodLength);
    }

    public DerivativeInstrumentEncoder derivativeValuationMethod(final CharSequence value)
    {
        toBytes(value, derivativeValuationMethod);
        derivativeValuationMethodOffset = 0;
        derivativeValuationMethodLength = value.length();
        return this;
    }

    public DerivativeInstrumentEncoder derivativeValuationMethod(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            derivativeValuationMethod.wrap(buffer);
            derivativeValuationMethodOffset = value.offset();
            derivativeValuationMethodLength = value.length();
        }
        return this;
    }

    public DerivativeInstrumentEncoder derivativeValuationMethod(final char[] value)
    {
        return derivativeValuationMethod(value, 0, value.length);
    }

    public DerivativeInstrumentEncoder derivativeValuationMethod(final char[] value, final int length)
    {
        return derivativeValuationMethod(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeValuationMethod(final char[] value, final int offset, final int length)
    {
        toBytes(value, derivativeValuationMethod, offset, length);
        derivativeValuationMethodOffset = 0;
        derivativeValuationMethodLength = length;
        return this;
    }

    private int derivativeListMethod;

    private boolean hasDerivativeListMethod;

    public boolean hasDerivativeListMethod()
    {
        return hasDerivativeListMethod;
    }

    public DerivativeInstrumentEncoder derivativeListMethod(int value)
    {
        derivativeListMethod = value;
        hasDerivativeListMethod = true;
        return this;
    }

    public int derivativeListMethod()
    {
        return derivativeListMethod;
    }

    private final DecimalFloat derivativeCapPrice = new DecimalFloat();

    private boolean hasDerivativeCapPrice;

    public boolean hasDerivativeCapPrice()
    {
        return hasDerivativeCapPrice;
    }

    public DerivativeInstrumentEncoder derivativeCapPrice(DecimalFloat value)
    {
        derivativeCapPrice.set(value);
        hasDerivativeCapPrice = true;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeCapPrice(long value, int scale)
    {
        derivativeCapPrice.set(value, scale);
        hasDerivativeCapPrice = true;
        return this;
    }

    public DecimalFloat derivativeCapPrice()
    {
        return derivativeCapPrice;
    }

    private final DecimalFloat derivativeFloorPrice = new DecimalFloat();

    private boolean hasDerivativeFloorPrice;

    public boolean hasDerivativeFloorPrice()
    {
        return hasDerivativeFloorPrice;
    }

    public DerivativeInstrumentEncoder derivativeFloorPrice(DecimalFloat value)
    {
        derivativeFloorPrice.set(value);
        hasDerivativeFloorPrice = true;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeFloorPrice(long value, int scale)
    {
        derivativeFloorPrice.set(value, scale);
        hasDerivativeFloorPrice = true;
        return this;
    }

    public DecimalFloat derivativeFloorPrice()
    {
        return derivativeFloorPrice;
    }

    private int derivativePutOrCall;

    private boolean hasDerivativePutOrCall;

    public boolean hasDerivativePutOrCall()
    {
        return hasDerivativePutOrCall;
    }

    public DerivativeInstrumentEncoder derivativePutOrCall(int value)
    {
        derivativePutOrCall = value;
        hasDerivativePutOrCall = true;
        return this;
    }

    public int derivativePutOrCall()
    {
        return derivativePutOrCall;
    }

    private char derivativeExerciseStyle;

    private boolean hasDerivativeExerciseStyle;

    public boolean hasDerivativeExerciseStyle()
    {
        return hasDerivativeExerciseStyle;
    }

    public DerivativeInstrumentEncoder derivativeExerciseStyle(char value)
    {
        derivativeExerciseStyle = value;
        hasDerivativeExerciseStyle = true;
        return this;
    }

    public char derivativeExerciseStyle()
    {
        return derivativeExerciseStyle;
    }

    private final DecimalFloat derivativeOptPayAmount = new DecimalFloat();

    private boolean hasDerivativeOptPayAmount;

    public boolean hasDerivativeOptPayAmount()
    {
        return hasDerivativeOptPayAmount;
    }

    public DerivativeInstrumentEncoder derivativeOptPayAmount(DecimalFloat value)
    {
        derivativeOptPayAmount.set(value);
        hasDerivativeOptPayAmount = true;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeOptPayAmount(long value, int scale)
    {
        derivativeOptPayAmount.set(value, scale);
        hasDerivativeOptPayAmount = true;
        return this;
    }

    public DecimalFloat derivativeOptPayAmount()
    {
        return derivativeOptPayAmount;
    }

    private final MutableDirectBuffer derivativeTimeUnit = new UnsafeBuffer();

    private int derivativeTimeUnitOffset = 0;

    private int derivativeTimeUnitLength = 0;

    public DerivativeInstrumentEncoder derivativeTimeUnit(final DirectBuffer value, final int offset, final int length)
    {
        derivativeTimeUnit.wrap(value);
        derivativeTimeUnitOffset = offset;
        derivativeTimeUnitLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeTimeUnit(final DirectBuffer value, final int length)
    {
        return derivativeTimeUnit(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeTimeUnit(final DirectBuffer value)
    {
        return derivativeTimeUnit(value, 0, value.capacity());
    }

    public DerivativeInstrumentEncoder derivativeTimeUnit(final byte[] value, final int offset, final int length)
    {
        derivativeTimeUnit.wrap(value);
        derivativeTimeUnitOffset = offset;
        derivativeTimeUnitLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeTimeUnitAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(derivativeTimeUnit, value, offset, length);
        derivativeTimeUnitOffset = offset;
        derivativeTimeUnitLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeTimeUnit(final byte[] value, final int length)
    {
        return derivativeTimeUnit(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeTimeUnit(final byte[] value)
    {
        return derivativeTimeUnit(value, 0, value.length);
    }

    public boolean hasDerivativeTimeUnit()
    {
        return derivativeTimeUnitLength > 0;
    }

    public MutableDirectBuffer derivativeTimeUnit()
    {
        return derivativeTimeUnit;
    }

    public String derivativeTimeUnitAsString()
    {
        return derivativeTimeUnit.getStringWithoutLengthAscii(derivativeTimeUnitOffset, derivativeTimeUnitLength);
    }

    public DerivativeInstrumentEncoder derivativeTimeUnit(final CharSequence value)
    {
        toBytes(value, derivativeTimeUnit);
        derivativeTimeUnitOffset = 0;
        derivativeTimeUnitLength = value.length();
        return this;
    }

    public DerivativeInstrumentEncoder derivativeTimeUnit(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            derivativeTimeUnit.wrap(buffer);
            derivativeTimeUnitOffset = value.offset();
            derivativeTimeUnitLength = value.length();
        }
        return this;
    }

    public DerivativeInstrumentEncoder derivativeTimeUnit(final char[] value)
    {
        return derivativeTimeUnit(value, 0, value.length);
    }

    public DerivativeInstrumentEncoder derivativeTimeUnit(final char[] value, final int length)
    {
        return derivativeTimeUnit(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeTimeUnit(final char[] value, final int offset, final int length)
    {
        toBytes(value, derivativeTimeUnit, offset, length);
        derivativeTimeUnitOffset = 0;
        derivativeTimeUnitLength = length;
        return this;
    }

    private final MutableDirectBuffer derivativeSecurityExchange = new UnsafeBuffer();

    private int derivativeSecurityExchangeOffset = 0;

    private int derivativeSecurityExchangeLength = 0;

    public DerivativeInstrumentEncoder derivativeSecurityExchange(final DirectBuffer value, final int offset, final int length)
    {
        derivativeSecurityExchange.wrap(value);
        derivativeSecurityExchangeOffset = offset;
        derivativeSecurityExchangeLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeSecurityExchange(final DirectBuffer value, final int length)
    {
        return derivativeSecurityExchange(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeSecurityExchange(final DirectBuffer value)
    {
        return derivativeSecurityExchange(value, 0, value.capacity());
    }

    public DerivativeInstrumentEncoder derivativeSecurityExchange(final byte[] value, final int offset, final int length)
    {
        derivativeSecurityExchange.wrap(value);
        derivativeSecurityExchangeOffset = offset;
        derivativeSecurityExchangeLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeSecurityExchangeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(derivativeSecurityExchange, value, offset, length);
        derivativeSecurityExchangeOffset = offset;
        derivativeSecurityExchangeLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeSecurityExchange(final byte[] value, final int length)
    {
        return derivativeSecurityExchange(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeSecurityExchange(final byte[] value)
    {
        return derivativeSecurityExchange(value, 0, value.length);
    }

    public boolean hasDerivativeSecurityExchange()
    {
        return derivativeSecurityExchangeLength > 0;
    }

    public MutableDirectBuffer derivativeSecurityExchange()
    {
        return derivativeSecurityExchange;
    }

    public String derivativeSecurityExchangeAsString()
    {
        return derivativeSecurityExchange.getStringWithoutLengthAscii(derivativeSecurityExchangeOffset, derivativeSecurityExchangeLength);
    }

    public DerivativeInstrumentEncoder derivativeSecurityExchange(final CharSequence value)
    {
        toBytes(value, derivativeSecurityExchange);
        derivativeSecurityExchangeOffset = 0;
        derivativeSecurityExchangeLength = value.length();
        return this;
    }

    public DerivativeInstrumentEncoder derivativeSecurityExchange(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            derivativeSecurityExchange.wrap(buffer);
            derivativeSecurityExchangeOffset = value.offset();
            derivativeSecurityExchangeLength = value.length();
        }
        return this;
    }

    public DerivativeInstrumentEncoder derivativeSecurityExchange(final char[] value)
    {
        return derivativeSecurityExchange(value, 0, value.length);
    }

    public DerivativeInstrumentEncoder derivativeSecurityExchange(final char[] value, final int length)
    {
        return derivativeSecurityExchange(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeSecurityExchange(final char[] value, final int offset, final int length)
    {
        toBytes(value, derivativeSecurityExchange, offset, length);
        derivativeSecurityExchangeOffset = 0;
        derivativeSecurityExchangeLength = length;
        return this;
    }

    private int derivativePositionLimit;

    private boolean hasDerivativePositionLimit;

    public boolean hasDerivativePositionLimit()
    {
        return hasDerivativePositionLimit;
    }

    public DerivativeInstrumentEncoder derivativePositionLimit(int value)
    {
        derivativePositionLimit = value;
        hasDerivativePositionLimit = true;
        return this;
    }

    public int derivativePositionLimit()
    {
        return derivativePositionLimit;
    }

    private int derivativeNTPositionLimit;

    private boolean hasDerivativeNTPositionLimit;

    public boolean hasDerivativeNTPositionLimit()
    {
        return hasDerivativeNTPositionLimit;
    }

    public DerivativeInstrumentEncoder derivativeNTPositionLimit(int value)
    {
        derivativeNTPositionLimit = value;
        hasDerivativeNTPositionLimit = true;
        return this;
    }

    public int derivativeNTPositionLimit()
    {
        return derivativeNTPositionLimit;
    }

    private final MutableDirectBuffer derivativeIssuer = new UnsafeBuffer();

    private int derivativeIssuerOffset = 0;

    private int derivativeIssuerLength = 0;

    public DerivativeInstrumentEncoder derivativeIssuer(final DirectBuffer value, final int offset, final int length)
    {
        derivativeIssuer.wrap(value);
        derivativeIssuerOffset = offset;
        derivativeIssuerLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeIssuer(final DirectBuffer value, final int length)
    {
        return derivativeIssuer(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeIssuer(final DirectBuffer value)
    {
        return derivativeIssuer(value, 0, value.capacity());
    }

    public DerivativeInstrumentEncoder derivativeIssuer(final byte[] value, final int offset, final int length)
    {
        derivativeIssuer.wrap(value);
        derivativeIssuerOffset = offset;
        derivativeIssuerLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeIssuerAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(derivativeIssuer, value, offset, length);
        derivativeIssuerOffset = offset;
        derivativeIssuerLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeIssuer(final byte[] value, final int length)
    {
        return derivativeIssuer(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeIssuer(final byte[] value)
    {
        return derivativeIssuer(value, 0, value.length);
    }

    public boolean hasDerivativeIssuer()
    {
        return derivativeIssuerLength > 0;
    }

    public MutableDirectBuffer derivativeIssuer()
    {
        return derivativeIssuer;
    }

    public String derivativeIssuerAsString()
    {
        return derivativeIssuer.getStringWithoutLengthAscii(derivativeIssuerOffset, derivativeIssuerLength);
    }

    public DerivativeInstrumentEncoder derivativeIssuer(final CharSequence value)
    {
        toBytes(value, derivativeIssuer);
        derivativeIssuerOffset = 0;
        derivativeIssuerLength = value.length();
        return this;
    }

    public DerivativeInstrumentEncoder derivativeIssuer(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            derivativeIssuer.wrap(buffer);
            derivativeIssuerOffset = value.offset();
            derivativeIssuerLength = value.length();
        }
        return this;
    }

    public DerivativeInstrumentEncoder derivativeIssuer(final char[] value)
    {
        return derivativeIssuer(value, 0, value.length);
    }

    public DerivativeInstrumentEncoder derivativeIssuer(final char[] value, final int length)
    {
        return derivativeIssuer(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeIssuer(final char[] value, final int offset, final int length)
    {
        toBytes(value, derivativeIssuer, offset, length);
        derivativeIssuerOffset = 0;
        derivativeIssuerLength = length;
        return this;
    }

    private int derivativeEncodedIssuerLen;

    private boolean hasDerivativeEncodedIssuerLen;

    public boolean hasDerivativeEncodedIssuerLen()
    {
        return hasDerivativeEncodedIssuerLen;
    }

    public DerivativeInstrumentEncoder derivativeEncodedIssuerLen(int value)
    {
        derivativeEncodedIssuerLen = value;
        hasDerivativeEncodedIssuerLen = true;
        return this;
    }

    public int derivativeEncodedIssuerLen()
    {
        return derivativeEncodedIssuerLen;
    }

    private byte[] derivativeEncodedIssuer;

    private boolean hasDerivativeEncodedIssuer;

    public boolean hasDerivativeEncodedIssuer()
    {
        return hasDerivativeEncodedIssuer;
    }

    public DerivativeInstrumentEncoder derivativeEncodedIssuer(byte[] value)
    {
        derivativeEncodedIssuer = value;
        hasDerivativeEncodedIssuer = true;
        return this;
    }

    public byte[] derivativeEncodedIssuer()
    {
        return derivativeEncodedIssuer;
    }

    public DerivativeInstrumentEncoder derivativeEncodedIssuerAsCopy(final byte[] value, final int offset, final int length)
    {
        derivativeEncodedIssuer = copyInto(derivativeEncodedIssuer, value, offset, length);
        hasDerivativeEncodedIssuer = true;
        return this;
    }

    private final MutableDirectBuffer derivativeSecurityDesc = new UnsafeBuffer();

    private int derivativeSecurityDescOffset = 0;

    private int derivativeSecurityDescLength = 0;

    public DerivativeInstrumentEncoder derivativeSecurityDesc(final DirectBuffer value, final int offset, final int length)
    {
        derivativeSecurityDesc.wrap(value);
        derivativeSecurityDescOffset = offset;
        derivativeSecurityDescLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeSecurityDesc(final DirectBuffer value, final int length)
    {
        return derivativeSecurityDesc(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeSecurityDesc(final DirectBuffer value)
    {
        return derivativeSecurityDesc(value, 0, value.capacity());
    }

    public DerivativeInstrumentEncoder derivativeSecurityDesc(final byte[] value, final int offset, final int length)
    {
        derivativeSecurityDesc.wrap(value);
        derivativeSecurityDescOffset = offset;
        derivativeSecurityDescLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeSecurityDescAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(derivativeSecurityDesc, value, offset, length);
        derivativeSecurityDescOffset = offset;
        derivativeSecurityDescLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeSecurityDesc(final byte[] value, final int length)
    {
        return derivativeSecurityDesc(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeSecurityDesc(final byte[] value)
    {
        return derivativeSecurityDesc(value, 0, value.length);
    }

    public boolean hasDerivativeSecurityDesc()
    {
        return derivativeSecurityDescLength > 0;
    }

    public MutableDirectBuffer derivativeSecurityDesc()
    {
        return derivativeSecurityDesc;
    }

    public String derivativeSecurityDescAsString()
    {
        return derivativeSecurityDesc.getStringWithoutLengthAscii(derivativeSecurityDescOffset, derivativeSecurityDescLength);
    }

    public DerivativeInstrumentEncoder derivativeSecurityDesc(final CharSequence value)
    {
        toBytes(value, derivativeSecurityDesc);
        derivativeSecurityDescOffset = 0;
        derivativeSecurityDescLength = value.length();
        return this;
    }

    public DerivativeInstrumentEncoder derivativeSecurityDesc(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            derivativeSecurityDesc.wrap(buffer);
            derivativeSecurityDescOffset = value.offset();
            derivativeSecurityDescLength = value.length();
        }
        return this;
    }

    public DerivativeInstrumentEncoder derivativeSecurityDesc(final char[] value)
    {
        return derivativeSecurityDesc(value, 0, value.length);
    }

    public DerivativeInstrumentEncoder derivativeSecurityDesc(final char[] value, final int length)
    {
        return derivativeSecurityDesc(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeSecurityDesc(final char[] value, final int offset, final int length)
    {
        toBytes(value, derivativeSecurityDesc, offset, length);
        derivativeSecurityDescOffset = 0;
        derivativeSecurityDescLength = length;
        return this;
    }

    private int derivativeEncodedSecurityDescLen;

    private boolean hasDerivativeEncodedSecurityDescLen;

    public boolean hasDerivativeEncodedSecurityDescLen()
    {
        return hasDerivativeEncodedSecurityDescLen;
    }

    public DerivativeInstrumentEncoder derivativeEncodedSecurityDescLen(int value)
    {
        derivativeEncodedSecurityDescLen = value;
        hasDerivativeEncodedSecurityDescLen = true;
        return this;
    }

    public int derivativeEncodedSecurityDescLen()
    {
        return derivativeEncodedSecurityDescLen;
    }

    private byte[] derivativeEncodedSecurityDesc;

    private boolean hasDerivativeEncodedSecurityDesc;

    public boolean hasDerivativeEncodedSecurityDesc()
    {
        return hasDerivativeEncodedSecurityDesc;
    }

    public DerivativeInstrumentEncoder derivativeEncodedSecurityDesc(byte[] value)
    {
        derivativeEncodedSecurityDesc = value;
        hasDerivativeEncodedSecurityDesc = true;
        return this;
    }

    public byte[] derivativeEncodedSecurityDesc()
    {
        return derivativeEncodedSecurityDesc;
    }

    public DerivativeInstrumentEncoder derivativeEncodedSecurityDescAsCopy(final byte[] value, final int offset, final int length)
    {
        derivativeEncodedSecurityDesc = copyInto(derivativeEncodedSecurityDesc, value, offset, length);
        hasDerivativeEncodedSecurityDesc = true;
        return this;
    }

    private final DerivativeSecurityXMLEncoder derivativeSecurityXML = new DerivativeSecurityXMLEncoder();
    public DerivativeSecurityXMLEncoder derivativeSecurityXML()
    {
        return derivativeSecurityXML;
    }

    private final MutableDirectBuffer derivativeContractSettlMonth = new UnsafeBuffer();

    private int derivativeContractSettlMonthOffset = 0;

    private int derivativeContractSettlMonthLength = 0;

    public DerivativeInstrumentEncoder derivativeContractSettlMonth(final DirectBuffer value, final int offset, final int length)
    {
        derivativeContractSettlMonth.wrap(value);
        derivativeContractSettlMonthOffset = offset;
        derivativeContractSettlMonthLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeContractSettlMonth(final DirectBuffer value, final int length)
    {
        return derivativeContractSettlMonth(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeContractSettlMonth(final DirectBuffer value)
    {
        return derivativeContractSettlMonth(value, 0, value.capacity());
    }

    public DerivativeInstrumentEncoder derivativeContractSettlMonth(final byte[] value, final int offset, final int length)
    {
        derivativeContractSettlMonth.wrap(value);
        derivativeContractSettlMonthOffset = offset;
        derivativeContractSettlMonthLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeContractSettlMonthAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(derivativeContractSettlMonth, value, offset, length);
        derivativeContractSettlMonthOffset = offset;
        derivativeContractSettlMonthLength = length;
        return this;
    }

    public DerivativeInstrumentEncoder derivativeContractSettlMonth(final byte[] value, final int length)
    {
        return derivativeContractSettlMonth(value, 0, length);
    }

    public DerivativeInstrumentEncoder derivativeContractSettlMonth(final byte[] value)
    {
        return derivativeContractSettlMonth(value, 0, value.length);
    }

    public boolean hasDerivativeContractSettlMonth()
    {
        return derivativeContractSettlMonthLength > 0;
    }

    public MutableDirectBuffer derivativeContractSettlMonth()
    {
        return derivativeContractSettlMonth;
    }

    public String derivativeContractSettlMonthAsString()
    {
        return derivativeContractSettlMonth.getStringWithoutLengthAscii(derivativeContractSettlMonthOffset, derivativeContractSettlMonthLength);
    }

    private final DerivativeEventsGrpEncoder derivativeEventsGrp = new DerivativeEventsGrpEncoder();
    public DerivativeEventsGrpEncoder derivativeEventsGrp()
    {
        return derivativeEventsGrp;
    }

    private final DerivativeInstrumentPartiesEncoder derivativeInstrumentParties = new DerivativeInstrumentPartiesEncoder();
    public DerivativeInstrumentPartiesEncoder derivativeInstrumentParties()
    {
        return derivativeInstrumentParties;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (derivativeSymbolLength > 0)
        {
            buffer.putBytes(position, derivativeSymbolHeader, 0, derivativeSymbolHeaderLength);
            position += derivativeSymbolHeaderLength;
            buffer.putBytes(position, derivativeSymbol, derivativeSymbolOffset, derivativeSymbolLength);
            position += derivativeSymbolLength;
            buffer.putSeparator(position);
            position++;
        }

        if (derivativeSymbolSfxLength > 0)
        {
            buffer.putBytes(position, derivativeSymbolSfxHeader, 0, derivativeSymbolSfxHeaderLength);
            position += derivativeSymbolSfxHeaderLength;
            buffer.putBytes(position, derivativeSymbolSfx, derivativeSymbolSfxOffset, derivativeSymbolSfxLength);
            position += derivativeSymbolSfxLength;
            buffer.putSeparator(position);
            position++;
        }

        if (derivativeSecurityIDLength > 0)
        {
            buffer.putBytes(position, derivativeSecurityIDHeader, 0, derivativeSecurityIDHeaderLength);
            position += derivativeSecurityIDHeaderLength;
            buffer.putBytes(position, derivativeSecurityID, derivativeSecurityIDOffset, derivativeSecurityIDLength);
            position += derivativeSecurityIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (derivativeSecurityIDSourceLength > 0)
        {
            buffer.putBytes(position, derivativeSecurityIDSourceHeader, 0, derivativeSecurityIDSourceHeaderLength);
            position += derivativeSecurityIDSourceHeaderLength;
            buffer.putBytes(position, derivativeSecurityIDSource, derivativeSecurityIDSourceOffset, derivativeSecurityIDSourceLength);
            position += derivativeSecurityIDSourceLength;
            buffer.putSeparator(position);
            position++;
        }

            position += derivativeSecurityAltIDGrp.encode(buffer, position);

        if (hasDerivativeProduct)
        {
            buffer.putBytes(position, derivativeProductHeader, 0, derivativeProductHeaderLength);
            position += derivativeProductHeaderLength;
            position += buffer.putIntAscii(position, derivativeProduct);
            buffer.putSeparator(position);
            position++;
        }

        if (derivativeProductComplexLength > 0)
        {
            buffer.putBytes(position, derivativeProductComplexHeader, 0, derivativeProductComplexHeaderLength);
            position += derivativeProductComplexHeaderLength;
            buffer.putBytes(position, derivativeProductComplex, derivativeProductComplexOffset, derivativeProductComplexLength);
            position += derivativeProductComplexLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasDerivFlexProductEligibilityIndicator)
        {
            buffer.putBytes(position, derivFlexProductEligibilityIndicatorHeader, 0, derivFlexProductEligibilityIndicatorHeaderLength);
            position += derivFlexProductEligibilityIndicatorHeaderLength;
            position += buffer.putBooleanAscii(position, derivFlexProductEligibilityIndicator);
            buffer.putSeparator(position);
            position++;
        }

        if (derivativeSecurityGroupLength > 0)
        {
            buffer.putBytes(position, derivativeSecurityGroupHeader, 0, derivativeSecurityGroupHeaderLength);
            position += derivativeSecurityGroupHeaderLength;
            buffer.putBytes(position, derivativeSecurityGroup, derivativeSecurityGroupOffset, derivativeSecurityGroupLength);
            position += derivativeSecurityGroupLength;
            buffer.putSeparator(position);
            position++;
        }

        if (derivativeCFICodeLength > 0)
        {
            buffer.putBytes(position, derivativeCFICodeHeader, 0, derivativeCFICodeHeaderLength);
            position += derivativeCFICodeHeaderLength;
            buffer.putBytes(position, derivativeCFICode, derivativeCFICodeOffset, derivativeCFICodeLength);
            position += derivativeCFICodeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (derivativeSecurityTypeLength > 0)
        {
            buffer.putBytes(position, derivativeSecurityTypeHeader, 0, derivativeSecurityTypeHeaderLength);
            position += derivativeSecurityTypeHeaderLength;
            buffer.putBytes(position, derivativeSecurityType, derivativeSecurityTypeOffset, derivativeSecurityTypeLength);
            position += derivativeSecurityTypeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (derivativeSecuritySubTypeLength > 0)
        {
            buffer.putBytes(position, derivativeSecuritySubTypeHeader, 0, derivativeSecuritySubTypeHeaderLength);
            position += derivativeSecuritySubTypeHeaderLength;
            buffer.putBytes(position, derivativeSecuritySubType, derivativeSecuritySubTypeOffset, derivativeSecuritySubTypeLength);
            position += derivativeSecuritySubTypeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (derivativeMaturityMonthYearLength > 0)
        {
            buffer.putBytes(position, derivativeMaturityMonthYearHeader, 0, derivativeMaturityMonthYearHeaderLength);
            position += derivativeMaturityMonthYearHeaderLength;
            buffer.putBytes(position, derivativeMaturityMonthYear, derivativeMaturityMonthYearOffset, derivativeMaturityMonthYearLength);
            position += derivativeMaturityMonthYearLength;
            buffer.putSeparator(position);
            position++;
        }

        if (derivativeMaturityDateLength > 0)
        {
            buffer.putBytes(position, derivativeMaturityDateHeader, 0, derivativeMaturityDateHeaderLength);
            position += derivativeMaturityDateHeaderLength;
            buffer.putBytes(position, derivativeMaturityDate, derivativeMaturityDateOffset, derivativeMaturityDateLength);
            position += derivativeMaturityDateLength;
            buffer.putSeparator(position);
            position++;
        }

        if (derivativeMaturityTimeLength > 0)
        {
            buffer.putBytes(position, derivativeMaturityTimeHeader, 0, derivativeMaturityTimeHeaderLength);
            position += derivativeMaturityTimeHeaderLength;
            buffer.putBytes(position, derivativeMaturityTime, derivativeMaturityTimeOffset, derivativeMaturityTimeLength);
            position += derivativeMaturityTimeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (derivativeSettleOnOpenFlagLength > 0)
        {
            buffer.putBytes(position, derivativeSettleOnOpenFlagHeader, 0, derivativeSettleOnOpenFlagHeaderLength);
            position += derivativeSettleOnOpenFlagHeaderLength;
            buffer.putBytes(position, derivativeSettleOnOpenFlag, derivativeSettleOnOpenFlagOffset, derivativeSettleOnOpenFlagLength);
            position += derivativeSettleOnOpenFlagLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasDerivativeInstrmtAssignmentMethod)
        {
            buffer.putBytes(position, derivativeInstrmtAssignmentMethodHeader, 0, derivativeInstrmtAssignmentMethodHeaderLength);
            position += derivativeInstrmtAssignmentMethodHeaderLength;
            position += buffer.putCharAscii(position, derivativeInstrmtAssignmentMethod);
            buffer.putSeparator(position);
            position++;
        }

        if (derivativeSecurityStatusLength > 0)
        {
            buffer.putBytes(position, derivativeSecurityStatusHeader, 0, derivativeSecurityStatusHeaderLength);
            position += derivativeSecurityStatusHeaderLength;
            buffer.putBytes(position, derivativeSecurityStatus, derivativeSecurityStatusOffset, derivativeSecurityStatusLength);
            position += derivativeSecurityStatusLength;
            buffer.putSeparator(position);
            position++;
        }

        if (derivativeIssueDateLength > 0)
        {
            buffer.putBytes(position, derivativeIssueDateHeader, 0, derivativeIssueDateHeaderLength);
            position += derivativeIssueDateHeaderLength;
            buffer.putBytes(position, derivativeIssueDate, derivativeIssueDateOffset, derivativeIssueDateLength);
            position += derivativeIssueDateLength;
            buffer.putSeparator(position);
            position++;
        }

        if (derivativeInstrRegistryLength > 0)
        {
            buffer.putBytes(position, derivativeInstrRegistryHeader, 0, derivativeInstrRegistryHeaderLength);
            position += derivativeInstrRegistryHeaderLength;
            buffer.putBytes(position, derivativeInstrRegistry, derivativeInstrRegistryOffset, derivativeInstrRegistryLength);
            position += derivativeInstrRegistryLength;
            buffer.putSeparator(position);
            position++;
        }

        if (derivativeCountryOfIssueLength > 0)
        {
            buffer.putBytes(position, derivativeCountryOfIssueHeader, 0, derivativeCountryOfIssueHeaderLength);
            position += derivativeCountryOfIssueHeaderLength;
            buffer.putBytes(position, derivativeCountryOfIssue, derivativeCountryOfIssueOffset, derivativeCountryOfIssueLength);
            position += derivativeCountryOfIssueLength;
            buffer.putSeparator(position);
            position++;
        }

        if (derivativeStateOrProvinceOfIssueLength > 0)
        {
            buffer.putBytes(position, derivativeStateOrProvinceOfIssueHeader, 0, derivativeStateOrProvinceOfIssueHeaderLength);
            position += derivativeStateOrProvinceOfIssueHeaderLength;
            buffer.putBytes(position, derivativeStateOrProvinceOfIssue, derivativeStateOrProvinceOfIssueOffset, derivativeStateOrProvinceOfIssueLength);
            position += derivativeStateOrProvinceOfIssueLength;
            buffer.putSeparator(position);
            position++;
        }

        if (derivativeLocaleOfIssueLength > 0)
        {
            buffer.putBytes(position, derivativeLocaleOfIssueHeader, 0, derivativeLocaleOfIssueHeaderLength);
            position += derivativeLocaleOfIssueHeaderLength;
            buffer.putBytes(position, derivativeLocaleOfIssue, derivativeLocaleOfIssueOffset, derivativeLocaleOfIssueLength);
            position += derivativeLocaleOfIssueLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasDerivativeStrikePrice)
        {
            buffer.putBytes(position, derivativeStrikePriceHeader, 0, derivativeStrikePriceHeaderLength);
            position += derivativeStrikePriceHeaderLength;
            position += buffer.putFloatAscii(position, derivativeStrikePrice);
            buffer.putSeparator(position);
            position++;
        }

        if (derivativeStrikeCurrencyLength > 0)
        {
            buffer.putBytes(position, derivativeStrikeCurrencyHeader, 0, derivativeStrikeCurrencyHeaderLength);
            position += derivativeStrikeCurrencyHeaderLength;
            buffer.putBytes(position, derivativeStrikeCurrency, derivativeStrikeCurrencyOffset, derivativeStrikeCurrencyLength);
            position += derivativeStrikeCurrencyLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasDerivativeStrikeMultiplier)
        {
            buffer.putBytes(position, derivativeStrikeMultiplierHeader, 0, derivativeStrikeMultiplierHeaderLength);
            position += derivativeStrikeMultiplierHeaderLength;
            position += buffer.putFloatAscii(position, derivativeStrikeMultiplier);
            buffer.putSeparator(position);
            position++;
        }

        if (hasDerivativeStrikeValue)
        {
            buffer.putBytes(position, derivativeStrikeValueHeader, 0, derivativeStrikeValueHeaderLength);
            position += derivativeStrikeValueHeaderLength;
            position += buffer.putFloatAscii(position, derivativeStrikeValue);
            buffer.putSeparator(position);
            position++;
        }

        if (hasDerivativeOptAttribute)
        {
            buffer.putBytes(position, derivativeOptAttributeHeader, 0, derivativeOptAttributeHeaderLength);
            position += derivativeOptAttributeHeaderLength;
            position += buffer.putCharAscii(position, derivativeOptAttribute);
            buffer.putSeparator(position);
            position++;
        }

        if (hasDerivativeContractMultiplier)
        {
            buffer.putBytes(position, derivativeContractMultiplierHeader, 0, derivativeContractMultiplierHeaderLength);
            position += derivativeContractMultiplierHeaderLength;
            position += buffer.putFloatAscii(position, derivativeContractMultiplier);
            buffer.putSeparator(position);
            position++;
        }

        if (hasDerivativeContractMultiplierUnit)
        {
            buffer.putBytes(position, derivativeContractMultiplierUnitHeader, 0, derivativeContractMultiplierUnitHeaderLength);
            position += derivativeContractMultiplierUnitHeaderLength;
            position += buffer.putIntAscii(position, derivativeContractMultiplierUnit);
            buffer.putSeparator(position);
            position++;
        }

        if (hasDerivativeFlowScheduleType)
        {
            buffer.putBytes(position, derivativeFlowScheduleTypeHeader, 0, derivativeFlowScheduleTypeHeaderLength);
            position += derivativeFlowScheduleTypeHeaderLength;
            position += buffer.putIntAscii(position, derivativeFlowScheduleType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasDerivativeMinPriceIncrement)
        {
            buffer.putBytes(position, derivativeMinPriceIncrementHeader, 0, derivativeMinPriceIncrementHeaderLength);
            position += derivativeMinPriceIncrementHeaderLength;
            position += buffer.putFloatAscii(position, derivativeMinPriceIncrement);
            buffer.putSeparator(position);
            position++;
        }

        if (hasDerivativeMinPriceIncrementAmount)
        {
            buffer.putBytes(position, derivativeMinPriceIncrementAmountHeader, 0, derivativeMinPriceIncrementAmountHeaderLength);
            position += derivativeMinPriceIncrementAmountHeaderLength;
            position += buffer.putFloatAscii(position, derivativeMinPriceIncrementAmount);
            buffer.putSeparator(position);
            position++;
        }

        if (derivativeUnitOfMeasureLength > 0)
        {
            buffer.putBytes(position, derivativeUnitOfMeasureHeader, 0, derivativeUnitOfMeasureHeaderLength);
            position += derivativeUnitOfMeasureHeaderLength;
            buffer.putBytes(position, derivativeUnitOfMeasure, derivativeUnitOfMeasureOffset, derivativeUnitOfMeasureLength);
            position += derivativeUnitOfMeasureLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasDerivativeUnitOfMeasureQty)
        {
            buffer.putBytes(position, derivativeUnitOfMeasureQtyHeader, 0, derivativeUnitOfMeasureQtyHeaderLength);
            position += derivativeUnitOfMeasureQtyHeaderLength;
            position += buffer.putFloatAscii(position, derivativeUnitOfMeasureQty);
            buffer.putSeparator(position);
            position++;
        }

        if (derivativePriceUnitOfMeasureLength > 0)
        {
            buffer.putBytes(position, derivativePriceUnitOfMeasureHeader, 0, derivativePriceUnitOfMeasureHeaderLength);
            position += derivativePriceUnitOfMeasureHeaderLength;
            buffer.putBytes(position, derivativePriceUnitOfMeasure, derivativePriceUnitOfMeasureOffset, derivativePriceUnitOfMeasureLength);
            position += derivativePriceUnitOfMeasureLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasDerivativePriceUnitOfMeasureQty)
        {
            buffer.putBytes(position, derivativePriceUnitOfMeasureQtyHeader, 0, derivativePriceUnitOfMeasureQtyHeaderLength);
            position += derivativePriceUnitOfMeasureQtyHeaderLength;
            position += buffer.putFloatAscii(position, derivativePriceUnitOfMeasureQty);
            buffer.putSeparator(position);
            position++;
        }

        if (hasDerivativeSettlMethod)
        {
            buffer.putBytes(position, derivativeSettlMethodHeader, 0, derivativeSettlMethodHeaderLength);
            position += derivativeSettlMethodHeaderLength;
            position += buffer.putCharAscii(position, derivativeSettlMethod);
            buffer.putSeparator(position);
            position++;
        }

        if (derivativePriceQuoteMethodLength > 0)
        {
            buffer.putBytes(position, derivativePriceQuoteMethodHeader, 0, derivativePriceQuoteMethodHeaderLength);
            position += derivativePriceQuoteMethodHeaderLength;
            buffer.putBytes(position, derivativePriceQuoteMethod, derivativePriceQuoteMethodOffset, derivativePriceQuoteMethodLength);
            position += derivativePriceQuoteMethodLength;
            buffer.putSeparator(position);
            position++;
        }

        if (derivativeValuationMethodLength > 0)
        {
            buffer.putBytes(position, derivativeValuationMethodHeader, 0, derivativeValuationMethodHeaderLength);
            position += derivativeValuationMethodHeaderLength;
            buffer.putBytes(position, derivativeValuationMethod, derivativeValuationMethodOffset, derivativeValuationMethodLength);
            position += derivativeValuationMethodLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasDerivativeListMethod)
        {
            buffer.putBytes(position, derivativeListMethodHeader, 0, derivativeListMethodHeaderLength);
            position += derivativeListMethodHeaderLength;
            position += buffer.putIntAscii(position, derivativeListMethod);
            buffer.putSeparator(position);
            position++;
        }

        if (hasDerivativeCapPrice)
        {
            buffer.putBytes(position, derivativeCapPriceHeader, 0, derivativeCapPriceHeaderLength);
            position += derivativeCapPriceHeaderLength;
            position += buffer.putFloatAscii(position, derivativeCapPrice);
            buffer.putSeparator(position);
            position++;
        }

        if (hasDerivativeFloorPrice)
        {
            buffer.putBytes(position, derivativeFloorPriceHeader, 0, derivativeFloorPriceHeaderLength);
            position += derivativeFloorPriceHeaderLength;
            position += buffer.putFloatAscii(position, derivativeFloorPrice);
            buffer.putSeparator(position);
            position++;
        }

        if (hasDerivativePutOrCall)
        {
            buffer.putBytes(position, derivativePutOrCallHeader, 0, derivativePutOrCallHeaderLength);
            position += derivativePutOrCallHeaderLength;
            position += buffer.putIntAscii(position, derivativePutOrCall);
            buffer.putSeparator(position);
            position++;
        }

        if (hasDerivativeExerciseStyle)
        {
            buffer.putBytes(position, derivativeExerciseStyleHeader, 0, derivativeExerciseStyleHeaderLength);
            position += derivativeExerciseStyleHeaderLength;
            position += buffer.putCharAscii(position, derivativeExerciseStyle);
            buffer.putSeparator(position);
            position++;
        }

        if (hasDerivativeOptPayAmount)
        {
            buffer.putBytes(position, derivativeOptPayAmountHeader, 0, derivativeOptPayAmountHeaderLength);
            position += derivativeOptPayAmountHeaderLength;
            position += buffer.putFloatAscii(position, derivativeOptPayAmount);
            buffer.putSeparator(position);
            position++;
        }

        if (derivativeTimeUnitLength > 0)
        {
            buffer.putBytes(position, derivativeTimeUnitHeader, 0, derivativeTimeUnitHeaderLength);
            position += derivativeTimeUnitHeaderLength;
            buffer.putBytes(position, derivativeTimeUnit, derivativeTimeUnitOffset, derivativeTimeUnitLength);
            position += derivativeTimeUnitLength;
            buffer.putSeparator(position);
            position++;
        }

        if (derivativeSecurityExchangeLength > 0)
        {
            buffer.putBytes(position, derivativeSecurityExchangeHeader, 0, derivativeSecurityExchangeHeaderLength);
            position += derivativeSecurityExchangeHeaderLength;
            buffer.putBytes(position, derivativeSecurityExchange, derivativeSecurityExchangeOffset, derivativeSecurityExchangeLength);
            position += derivativeSecurityExchangeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasDerivativePositionLimit)
        {
            buffer.putBytes(position, derivativePositionLimitHeader, 0, derivativePositionLimitHeaderLength);
            position += derivativePositionLimitHeaderLength;
            position += buffer.putIntAscii(position, derivativePositionLimit);
            buffer.putSeparator(position);
            position++;
        }

        if (hasDerivativeNTPositionLimit)
        {
            buffer.putBytes(position, derivativeNTPositionLimitHeader, 0, derivativeNTPositionLimitHeaderLength);
            position += derivativeNTPositionLimitHeaderLength;
            position += buffer.putIntAscii(position, derivativeNTPositionLimit);
            buffer.putSeparator(position);
            position++;
        }

        if (derivativeIssuerLength > 0)
        {
            buffer.putBytes(position, derivativeIssuerHeader, 0, derivativeIssuerHeaderLength);
            position += derivativeIssuerHeaderLength;
            buffer.putBytes(position, derivativeIssuer, derivativeIssuerOffset, derivativeIssuerLength);
            position += derivativeIssuerLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasDerivativeEncodedIssuerLen)
        {
            buffer.putBytes(position, derivativeEncodedIssuerLenHeader, 0, derivativeEncodedIssuerLenHeaderLength);
            position += derivativeEncodedIssuerLenHeaderLength;
            position += buffer.putIntAscii(position, derivativeEncodedIssuerLen);
            buffer.putSeparator(position);
            position++;
        }

        if (hasDerivativeEncodedIssuer)
        {
            buffer.putBytes(position, derivativeEncodedIssuerHeader, 0, derivativeEncodedIssuerHeaderLength);
            position += derivativeEncodedIssuerHeaderLength;
            buffer.putBytes(position, derivativeEncodedIssuer);
            position += derivativeEncodedIssuer.length;
            buffer.putSeparator(position);
            position++;
        }

        if (derivativeSecurityDescLength > 0)
        {
            buffer.putBytes(position, derivativeSecurityDescHeader, 0, derivativeSecurityDescHeaderLength);
            position += derivativeSecurityDescHeaderLength;
            buffer.putBytes(position, derivativeSecurityDesc, derivativeSecurityDescOffset, derivativeSecurityDescLength);
            position += derivativeSecurityDescLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasDerivativeEncodedSecurityDescLen)
        {
            buffer.putBytes(position, derivativeEncodedSecurityDescLenHeader, 0, derivativeEncodedSecurityDescLenHeaderLength);
            position += derivativeEncodedSecurityDescLenHeaderLength;
            position += buffer.putIntAscii(position, derivativeEncodedSecurityDescLen);
            buffer.putSeparator(position);
            position++;
        }

        if (hasDerivativeEncodedSecurityDesc)
        {
            buffer.putBytes(position, derivativeEncodedSecurityDescHeader, 0, derivativeEncodedSecurityDescHeaderLength);
            position += derivativeEncodedSecurityDescHeaderLength;
            buffer.putBytes(position, derivativeEncodedSecurityDesc);
            position += derivativeEncodedSecurityDesc.length;
            buffer.putSeparator(position);
            position++;
        }

            position += derivativeSecurityXML.encode(buffer, position);

        if (derivativeContractSettlMonthLength > 0)
        {
            buffer.putBytes(position, derivativeContractSettlMonthHeader, 0, derivativeContractSettlMonthHeaderLength);
            position += derivativeContractSettlMonthHeaderLength;
            buffer.putBytes(position, derivativeContractSettlMonth, derivativeContractSettlMonthOffset, derivativeContractSettlMonthLength);
            position += derivativeContractSettlMonthLength;
            buffer.putSeparator(position);
            position++;
        }

            position += derivativeEventsGrp.encode(buffer, position);

            position += derivativeInstrumentParties.encode(buffer, position);
        return position - offset;
    }

    public void reset()
    {
        this.resetDerivativeSymbol();
        this.resetDerivativeSymbolSfx();
        this.resetDerivativeSecurityID();
        this.resetDerivativeSecurityIDSource();
        this.resetDerivativeProduct();
        this.resetDerivativeProductComplex();
        this.resetDerivFlexProductEligibilityIndicator();
        this.resetDerivativeSecurityGroup();
        this.resetDerivativeCFICode();
        this.resetDerivativeSecurityType();
        this.resetDerivativeSecuritySubType();
        this.resetDerivativeMaturityMonthYear();
        this.resetDerivativeMaturityDate();
        this.resetDerivativeMaturityTime();
        this.resetDerivativeSettleOnOpenFlag();
        this.resetDerivativeInstrmtAssignmentMethod();
        this.resetDerivativeSecurityStatus();
        this.resetDerivativeIssueDate();
        this.resetDerivativeInstrRegistry();
        this.resetDerivativeCountryOfIssue();
        this.resetDerivativeStateOrProvinceOfIssue();
        this.resetDerivativeLocaleOfIssue();
        this.resetDerivativeStrikePrice();
        this.resetDerivativeStrikeCurrency();
        this.resetDerivativeStrikeMultiplier();
        this.resetDerivativeStrikeValue();
        this.resetDerivativeOptAttribute();
        this.resetDerivativeContractMultiplier();
        this.resetDerivativeContractMultiplierUnit();
        this.resetDerivativeFlowScheduleType();
        this.resetDerivativeMinPriceIncrement();
        this.resetDerivativeMinPriceIncrementAmount();
        this.resetDerivativeUnitOfMeasure();
        this.resetDerivativeUnitOfMeasureQty();
        this.resetDerivativePriceUnitOfMeasure();
        this.resetDerivativePriceUnitOfMeasureQty();
        this.resetDerivativeSettlMethod();
        this.resetDerivativePriceQuoteMethod();
        this.resetDerivativeValuationMethod();
        this.resetDerivativeListMethod();
        this.resetDerivativeCapPrice();
        this.resetDerivativeFloorPrice();
        this.resetDerivativePutOrCall();
        this.resetDerivativeExerciseStyle();
        this.resetDerivativeOptPayAmount();
        this.resetDerivativeTimeUnit();
        this.resetDerivativeSecurityExchange();
        this.resetDerivativePositionLimit();
        this.resetDerivativeNTPositionLimit();
        this.resetDerivativeIssuer();
        this.resetDerivativeEncodedIssuerLen();
        this.resetDerivativeEncodedIssuer();
        this.resetDerivativeSecurityDesc();
        this.resetDerivativeEncodedSecurityDescLen();
        this.resetDerivativeEncodedSecurityDesc();
        this.resetDerivativeContractSettlMonth();
        derivativeSecurityAltIDGrp.reset();
        derivativeSecurityXML.reset();
        derivativeEventsGrp.reset();
        derivativeInstrumentParties.reset();
    }

    public void resetDerivativeSymbol()
    {
        derivativeSymbolLength = 0;
    }

    public void resetDerivativeSymbolSfx()
    {
        derivativeSymbolSfxLength = 0;
    }

    public void resetDerivativeSecurityID()
    {
        derivativeSecurityIDLength = 0;
    }

    public void resetDerivativeSecurityIDSource()
    {
        derivativeSecurityIDSourceLength = 0;
    }

    public void resetDerivativeProduct()
    {
        hasDerivativeProduct = false;
    }

    public void resetDerivativeProductComplex()
    {
        derivativeProductComplexLength = 0;
    }

    public void resetDerivFlexProductEligibilityIndicator()
    {
        hasDerivFlexProductEligibilityIndicator = false;
    }

    public void resetDerivativeSecurityGroup()
    {
        derivativeSecurityGroupLength = 0;
    }

    public void resetDerivativeCFICode()
    {
        derivativeCFICodeLength = 0;
    }

    public void resetDerivativeSecurityType()
    {
        derivativeSecurityTypeLength = 0;
    }

    public void resetDerivativeSecuritySubType()
    {
        derivativeSecuritySubTypeLength = 0;
    }

    public void resetDerivativeMaturityMonthYear()
    {
        derivativeMaturityMonthYearLength = 0;
    }

    public void resetDerivativeMaturityDate()
    {
        derivativeMaturityDateLength = 0;
    }

    public void resetDerivativeMaturityTime()
    {
        derivativeMaturityTimeLength = 0;
    }

    public void resetDerivativeSettleOnOpenFlag()
    {
        derivativeSettleOnOpenFlagLength = 0;
    }

    public void resetDerivativeInstrmtAssignmentMethod()
    {
        hasDerivativeInstrmtAssignmentMethod = false;
    }

    public void resetDerivativeSecurityStatus()
    {
        derivativeSecurityStatusLength = 0;
    }

    public void resetDerivativeIssueDate()
    {
        derivativeIssueDateLength = 0;
    }

    public void resetDerivativeInstrRegistry()
    {
        derivativeInstrRegistryLength = 0;
    }

    public void resetDerivativeCountryOfIssue()
    {
        derivativeCountryOfIssueLength = 0;
    }

    public void resetDerivativeStateOrProvinceOfIssue()
    {
        derivativeStateOrProvinceOfIssueLength = 0;
    }

    public void resetDerivativeLocaleOfIssue()
    {
        derivativeLocaleOfIssueLength = 0;
    }

    public void resetDerivativeStrikePrice()
    {
        hasDerivativeStrikePrice = false;
    }

    public void resetDerivativeStrikeCurrency()
    {
        derivativeStrikeCurrencyLength = 0;
    }

    public void resetDerivativeStrikeMultiplier()
    {
        hasDerivativeStrikeMultiplier = false;
    }

    public void resetDerivativeStrikeValue()
    {
        hasDerivativeStrikeValue = false;
    }

    public void resetDerivativeOptAttribute()
    {
        hasDerivativeOptAttribute = false;
    }

    public void resetDerivativeContractMultiplier()
    {
        hasDerivativeContractMultiplier = false;
    }

    public void resetDerivativeContractMultiplierUnit()
    {
        hasDerivativeContractMultiplierUnit = false;
    }

    public void resetDerivativeFlowScheduleType()
    {
        hasDerivativeFlowScheduleType = false;
    }

    public void resetDerivativeMinPriceIncrement()
    {
        hasDerivativeMinPriceIncrement = false;
    }

    public void resetDerivativeMinPriceIncrementAmount()
    {
        hasDerivativeMinPriceIncrementAmount = false;
    }

    public void resetDerivativeUnitOfMeasure()
    {
        derivativeUnitOfMeasureLength = 0;
    }

    public void resetDerivativeUnitOfMeasureQty()
    {
        hasDerivativeUnitOfMeasureQty = false;
    }

    public void resetDerivativePriceUnitOfMeasure()
    {
        derivativePriceUnitOfMeasureLength = 0;
    }

    public void resetDerivativePriceUnitOfMeasureQty()
    {
        hasDerivativePriceUnitOfMeasureQty = false;
    }

    public void resetDerivativeSettlMethod()
    {
        hasDerivativeSettlMethod = false;
    }

    public void resetDerivativePriceQuoteMethod()
    {
        derivativePriceQuoteMethodLength = 0;
    }

    public void resetDerivativeValuationMethod()
    {
        derivativeValuationMethodLength = 0;
    }

    public void resetDerivativeListMethod()
    {
        hasDerivativeListMethod = false;
    }

    public void resetDerivativeCapPrice()
    {
        hasDerivativeCapPrice = false;
    }

    public void resetDerivativeFloorPrice()
    {
        hasDerivativeFloorPrice = false;
    }

    public void resetDerivativePutOrCall()
    {
        hasDerivativePutOrCall = false;
    }

    public void resetDerivativeExerciseStyle()
    {
        hasDerivativeExerciseStyle = false;
    }

    public void resetDerivativeOptPayAmount()
    {
        hasDerivativeOptPayAmount = false;
    }

    public void resetDerivativeTimeUnit()
    {
        derivativeTimeUnitLength = 0;
    }

    public void resetDerivativeSecurityExchange()
    {
        derivativeSecurityExchangeLength = 0;
    }

    public void resetDerivativePositionLimit()
    {
        hasDerivativePositionLimit = false;
    }

    public void resetDerivativeNTPositionLimit()
    {
        hasDerivativeNTPositionLimit = false;
    }

    public void resetDerivativeIssuer()
    {
        derivativeIssuerLength = 0;
    }

    public void resetDerivativeEncodedIssuerLen()
    {
        hasDerivativeEncodedIssuerLen = false;
    }

    public void resetDerivativeEncodedIssuer()
    {
        hasDerivativeEncodedIssuer = false;
    }

    public void resetDerivativeSecurityDesc()
    {
        derivativeSecurityDescLength = 0;
    }

    public void resetDerivativeEncodedSecurityDescLen()
    {
        hasDerivativeEncodedSecurityDescLen = false;
    }

    public void resetDerivativeEncodedSecurityDesc()
    {
        hasDerivativeEncodedSecurityDesc = false;
    }

    public void resetDerivativeContractSettlMonth()
    {
        derivativeContractSettlMonthLength = 0;
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
        builder.append("\"MessageName\": \"DerivativeInstrument\",\n");
        if (hasDerivativeSymbol())
        {
            indent(builder, level);
            builder.append("\"DerivativeSymbol\": \"");
            appendBuffer(builder, derivativeSymbol, derivativeSymbolOffset, derivativeSymbolLength);
            builder.append("\",\n");
        }

        if (hasDerivativeSymbolSfx())
        {
            indent(builder, level);
            builder.append("\"DerivativeSymbolSfx\": \"");
            appendBuffer(builder, derivativeSymbolSfx, derivativeSymbolSfxOffset, derivativeSymbolSfxLength);
            builder.append("\",\n");
        }

        if (hasDerivativeSecurityID())
        {
            indent(builder, level);
            builder.append("\"DerivativeSecurityID\": \"");
            appendBuffer(builder, derivativeSecurityID, derivativeSecurityIDOffset, derivativeSecurityIDLength);
            builder.append("\",\n");
        }

        if (hasDerivativeSecurityIDSource())
        {
            indent(builder, level);
            builder.append("\"DerivativeSecurityIDSource\": \"");
            appendBuffer(builder, derivativeSecurityIDSource, derivativeSecurityIDSourceOffset, derivativeSecurityIDSourceLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"DerivativeSecurityAltIDGrp\": ");
    derivativeSecurityAltIDGrp.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasDerivativeProduct())
        {
            indent(builder, level);
            builder.append("\"DerivativeProduct\": \"");
            builder.append(derivativeProduct);
            builder.append("\",\n");
        }

        if (hasDerivativeProductComplex())
        {
            indent(builder, level);
            builder.append("\"DerivativeProductComplex\": \"");
            appendBuffer(builder, derivativeProductComplex, derivativeProductComplexOffset, derivativeProductComplexLength);
            builder.append("\",\n");
        }

        if (hasDerivFlexProductEligibilityIndicator())
        {
            indent(builder, level);
            builder.append("\"DerivFlexProductEligibilityIndicator\": \"");
            builder.append(derivFlexProductEligibilityIndicator);
            builder.append("\",\n");
        }

        if (hasDerivativeSecurityGroup())
        {
            indent(builder, level);
            builder.append("\"DerivativeSecurityGroup\": \"");
            appendBuffer(builder, derivativeSecurityGroup, derivativeSecurityGroupOffset, derivativeSecurityGroupLength);
            builder.append("\",\n");
        }

        if (hasDerivativeCFICode())
        {
            indent(builder, level);
            builder.append("\"DerivativeCFICode\": \"");
            appendBuffer(builder, derivativeCFICode, derivativeCFICodeOffset, derivativeCFICodeLength);
            builder.append("\",\n");
        }

        if (hasDerivativeSecurityType())
        {
            indent(builder, level);
            builder.append("\"DerivativeSecurityType\": \"");
            appendBuffer(builder, derivativeSecurityType, derivativeSecurityTypeOffset, derivativeSecurityTypeLength);
            builder.append("\",\n");
        }

        if (hasDerivativeSecuritySubType())
        {
            indent(builder, level);
            builder.append("\"DerivativeSecuritySubType\": \"");
            appendBuffer(builder, derivativeSecuritySubType, derivativeSecuritySubTypeOffset, derivativeSecuritySubTypeLength);
            builder.append("\",\n");
        }

        if (hasDerivativeMaturityMonthYear())
        {
            indent(builder, level);
            builder.append("\"DerivativeMaturityMonthYear\": \"");
            appendBuffer(builder, derivativeMaturityMonthYear, derivativeMaturityMonthYearOffset, derivativeMaturityMonthYearLength);
            builder.append("\",\n");
        }

        if (hasDerivativeMaturityDate())
        {
            indent(builder, level);
            builder.append("\"DerivativeMaturityDate\": \"");
            appendBuffer(builder, derivativeMaturityDate, derivativeMaturityDateOffset, derivativeMaturityDateLength);
            builder.append("\",\n");
        }

        if (hasDerivativeMaturityTime())
        {
            indent(builder, level);
            builder.append("\"DerivativeMaturityTime\": \"");
            appendBuffer(builder, derivativeMaturityTime, derivativeMaturityTimeOffset, derivativeMaturityTimeLength);
            builder.append("\",\n");
        }

        if (hasDerivativeSettleOnOpenFlag())
        {
            indent(builder, level);
            builder.append("\"DerivativeSettleOnOpenFlag\": \"");
            appendBuffer(builder, derivativeSettleOnOpenFlag, derivativeSettleOnOpenFlagOffset, derivativeSettleOnOpenFlagLength);
            builder.append("\",\n");
        }

        if (hasDerivativeInstrmtAssignmentMethod())
        {
            indent(builder, level);
            builder.append("\"DerivativeInstrmtAssignmentMethod\": \"");
            builder.append(derivativeInstrmtAssignmentMethod);
            builder.append("\",\n");
        }

        if (hasDerivativeSecurityStatus())
        {
            indent(builder, level);
            builder.append("\"DerivativeSecurityStatus\": \"");
            appendBuffer(builder, derivativeSecurityStatus, derivativeSecurityStatusOffset, derivativeSecurityStatusLength);
            builder.append("\",\n");
        }

        if (hasDerivativeIssueDate())
        {
            indent(builder, level);
            builder.append("\"DerivativeIssueDate\": \"");
            appendBuffer(builder, derivativeIssueDate, derivativeIssueDateOffset, derivativeIssueDateLength);
            builder.append("\",\n");
        }

        if (hasDerivativeInstrRegistry())
        {
            indent(builder, level);
            builder.append("\"DerivativeInstrRegistry\": \"");
            appendBuffer(builder, derivativeInstrRegistry, derivativeInstrRegistryOffset, derivativeInstrRegistryLength);
            builder.append("\",\n");
        }

        if (hasDerivativeCountryOfIssue())
        {
            indent(builder, level);
            builder.append("\"DerivativeCountryOfIssue\": \"");
            appendBuffer(builder, derivativeCountryOfIssue, derivativeCountryOfIssueOffset, derivativeCountryOfIssueLength);
            builder.append("\",\n");
        }

        if (hasDerivativeStateOrProvinceOfIssue())
        {
            indent(builder, level);
            builder.append("\"DerivativeStateOrProvinceOfIssue\": \"");
            appendBuffer(builder, derivativeStateOrProvinceOfIssue, derivativeStateOrProvinceOfIssueOffset, derivativeStateOrProvinceOfIssueLength);
            builder.append("\",\n");
        }

        if (hasDerivativeLocaleOfIssue())
        {
            indent(builder, level);
            builder.append("\"DerivativeLocaleOfIssue\": \"");
            appendBuffer(builder, derivativeLocaleOfIssue, derivativeLocaleOfIssueOffset, derivativeLocaleOfIssueLength);
            builder.append("\",\n");
        }

        if (hasDerivativeStrikePrice())
        {
            indent(builder, level);
            builder.append("\"DerivativeStrikePrice\": \"");
            derivativeStrikePrice.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasDerivativeStrikeCurrency())
        {
            indent(builder, level);
            builder.append("\"DerivativeStrikeCurrency\": \"");
            appendBuffer(builder, derivativeStrikeCurrency, derivativeStrikeCurrencyOffset, derivativeStrikeCurrencyLength);
            builder.append("\",\n");
        }

        if (hasDerivativeStrikeMultiplier())
        {
            indent(builder, level);
            builder.append("\"DerivativeStrikeMultiplier\": \"");
            derivativeStrikeMultiplier.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasDerivativeStrikeValue())
        {
            indent(builder, level);
            builder.append("\"DerivativeStrikeValue\": \"");
            derivativeStrikeValue.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasDerivativeOptAttribute())
        {
            indent(builder, level);
            builder.append("\"DerivativeOptAttribute\": \"");
            builder.append(derivativeOptAttribute);
            builder.append("\",\n");
        }

        if (hasDerivativeContractMultiplier())
        {
            indent(builder, level);
            builder.append("\"DerivativeContractMultiplier\": \"");
            derivativeContractMultiplier.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasDerivativeContractMultiplierUnit())
        {
            indent(builder, level);
            builder.append("\"DerivativeContractMultiplierUnit\": \"");
            builder.append(derivativeContractMultiplierUnit);
            builder.append("\",\n");
        }

        if (hasDerivativeFlowScheduleType())
        {
            indent(builder, level);
            builder.append("\"DerivativeFlowScheduleType\": \"");
            builder.append(derivativeFlowScheduleType);
            builder.append("\",\n");
        }

        if (hasDerivativeMinPriceIncrement())
        {
            indent(builder, level);
            builder.append("\"DerivativeMinPriceIncrement\": \"");
            derivativeMinPriceIncrement.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasDerivativeMinPriceIncrementAmount())
        {
            indent(builder, level);
            builder.append("\"DerivativeMinPriceIncrementAmount\": \"");
            derivativeMinPriceIncrementAmount.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasDerivativeUnitOfMeasure())
        {
            indent(builder, level);
            builder.append("\"DerivativeUnitOfMeasure\": \"");
            appendBuffer(builder, derivativeUnitOfMeasure, derivativeUnitOfMeasureOffset, derivativeUnitOfMeasureLength);
            builder.append("\",\n");
        }

        if (hasDerivativeUnitOfMeasureQty())
        {
            indent(builder, level);
            builder.append("\"DerivativeUnitOfMeasureQty\": \"");
            derivativeUnitOfMeasureQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasDerivativePriceUnitOfMeasure())
        {
            indent(builder, level);
            builder.append("\"DerivativePriceUnitOfMeasure\": \"");
            appendBuffer(builder, derivativePriceUnitOfMeasure, derivativePriceUnitOfMeasureOffset, derivativePriceUnitOfMeasureLength);
            builder.append("\",\n");
        }

        if (hasDerivativePriceUnitOfMeasureQty())
        {
            indent(builder, level);
            builder.append("\"DerivativePriceUnitOfMeasureQty\": \"");
            derivativePriceUnitOfMeasureQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasDerivativeSettlMethod())
        {
            indent(builder, level);
            builder.append("\"DerivativeSettlMethod\": \"");
            builder.append(derivativeSettlMethod);
            builder.append("\",\n");
        }

        if (hasDerivativePriceQuoteMethod())
        {
            indent(builder, level);
            builder.append("\"DerivativePriceQuoteMethod\": \"");
            appendBuffer(builder, derivativePriceQuoteMethod, derivativePriceQuoteMethodOffset, derivativePriceQuoteMethodLength);
            builder.append("\",\n");
        }

        if (hasDerivativeValuationMethod())
        {
            indent(builder, level);
            builder.append("\"DerivativeValuationMethod\": \"");
            appendBuffer(builder, derivativeValuationMethod, derivativeValuationMethodOffset, derivativeValuationMethodLength);
            builder.append("\",\n");
        }

        if (hasDerivativeListMethod())
        {
            indent(builder, level);
            builder.append("\"DerivativeListMethod\": \"");
            builder.append(derivativeListMethod);
            builder.append("\",\n");
        }

        if (hasDerivativeCapPrice())
        {
            indent(builder, level);
            builder.append("\"DerivativeCapPrice\": \"");
            derivativeCapPrice.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasDerivativeFloorPrice())
        {
            indent(builder, level);
            builder.append("\"DerivativeFloorPrice\": \"");
            derivativeFloorPrice.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasDerivativePutOrCall())
        {
            indent(builder, level);
            builder.append("\"DerivativePutOrCall\": \"");
            builder.append(derivativePutOrCall);
            builder.append("\",\n");
        }

        if (hasDerivativeExerciseStyle())
        {
            indent(builder, level);
            builder.append("\"DerivativeExerciseStyle\": \"");
            builder.append(derivativeExerciseStyle);
            builder.append("\",\n");
        }

        if (hasDerivativeOptPayAmount())
        {
            indent(builder, level);
            builder.append("\"DerivativeOptPayAmount\": \"");
            derivativeOptPayAmount.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasDerivativeTimeUnit())
        {
            indent(builder, level);
            builder.append("\"DerivativeTimeUnit\": \"");
            appendBuffer(builder, derivativeTimeUnit, derivativeTimeUnitOffset, derivativeTimeUnitLength);
            builder.append("\",\n");
        }

        if (hasDerivativeSecurityExchange())
        {
            indent(builder, level);
            builder.append("\"DerivativeSecurityExchange\": \"");
            appendBuffer(builder, derivativeSecurityExchange, derivativeSecurityExchangeOffset, derivativeSecurityExchangeLength);
            builder.append("\",\n");
        }

        if (hasDerivativePositionLimit())
        {
            indent(builder, level);
            builder.append("\"DerivativePositionLimit\": \"");
            builder.append(derivativePositionLimit);
            builder.append("\",\n");
        }

        if (hasDerivativeNTPositionLimit())
        {
            indent(builder, level);
            builder.append("\"DerivativeNTPositionLimit\": \"");
            builder.append(derivativeNTPositionLimit);
            builder.append("\",\n");
        }

        if (hasDerivativeIssuer())
        {
            indent(builder, level);
            builder.append("\"DerivativeIssuer\": \"");
            appendBuffer(builder, derivativeIssuer, derivativeIssuerOffset, derivativeIssuerLength);
            builder.append("\",\n");
        }

        if (hasDerivativeEncodedIssuerLen())
        {
            indent(builder, level);
            builder.append("\"DerivativeEncodedIssuerLen\": \"");
            builder.append(derivativeEncodedIssuerLen);
            builder.append("\",\n");
        }

        if (hasDerivativeEncodedIssuer())
        {
            indent(builder, level);
            builder.append("\"DerivativeEncodedIssuer\": \"");
            appendData(builder, derivativeEncodedIssuer, derivativeEncodedIssuerLen);
            builder.append("\",\n");
        }

        if (hasDerivativeSecurityDesc())
        {
            indent(builder, level);
            builder.append("\"DerivativeSecurityDesc\": \"");
            appendBuffer(builder, derivativeSecurityDesc, derivativeSecurityDescOffset, derivativeSecurityDescLength);
            builder.append("\",\n");
        }

        if (hasDerivativeEncodedSecurityDescLen())
        {
            indent(builder, level);
            builder.append("\"DerivativeEncodedSecurityDescLen\": \"");
            builder.append(derivativeEncodedSecurityDescLen);
            builder.append("\",\n");
        }

        if (hasDerivativeEncodedSecurityDesc())
        {
            indent(builder, level);
            builder.append("\"DerivativeEncodedSecurityDesc\": \"");
            appendData(builder, derivativeEncodedSecurityDesc, derivativeEncodedSecurityDescLen);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"DerivativeSecurityXML\": ");
    derivativeSecurityXML.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasDerivativeContractSettlMonth())
        {
            indent(builder, level);
            builder.append("\"DerivativeContractSettlMonth\": \"");
            appendBuffer(builder, derivativeContractSettlMonth, derivativeContractSettlMonthOffset, derivativeContractSettlMonthLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"DerivativeEventsGrp\": ");
    derivativeEventsGrp.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"DerivativeInstrumentParties\": ");
    derivativeInstrumentParties.appendTo(builder, level + 1);
    builder.append("\n");
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public DerivativeInstrumentEncoder copyTo(final Encoder encoder)
    {
        return copyTo((DerivativeInstrumentEncoder)encoder);
    }

    public DerivativeInstrumentEncoder copyTo(final DerivativeInstrumentEncoder encoder)
    {
        encoder.reset();
        if (hasDerivativeSymbol())
        {
            encoder.derivativeSymbolAsCopy(derivativeSymbol.byteArray(), 0, derivativeSymbolLength);
        }

        if (hasDerivativeSymbolSfx())
        {
            encoder.derivativeSymbolSfxAsCopy(derivativeSymbolSfx.byteArray(), 0, derivativeSymbolSfxLength);
        }

        if (hasDerivativeSecurityID())
        {
            encoder.derivativeSecurityIDAsCopy(derivativeSecurityID.byteArray(), 0, derivativeSecurityIDLength);
        }

        if (hasDerivativeSecurityIDSource())
        {
            encoder.derivativeSecurityIDSourceAsCopy(derivativeSecurityIDSource.byteArray(), 0, derivativeSecurityIDSourceLength);
        }


        derivativeSecurityAltIDGrp.copyTo(encoder.derivativeSecurityAltIDGrp());
        if (hasDerivativeProduct())
        {
            encoder.derivativeProduct(this.derivativeProduct());
        }

        if (hasDerivativeProductComplex())
        {
            encoder.derivativeProductComplexAsCopy(derivativeProductComplex.byteArray(), 0, derivativeProductComplexLength);
        }

        if (hasDerivFlexProductEligibilityIndicator())
        {
            encoder.derivFlexProductEligibilityIndicator(this.derivFlexProductEligibilityIndicator());
        }

        if (hasDerivativeSecurityGroup())
        {
            encoder.derivativeSecurityGroupAsCopy(derivativeSecurityGroup.byteArray(), 0, derivativeSecurityGroupLength);
        }

        if (hasDerivativeCFICode())
        {
            encoder.derivativeCFICodeAsCopy(derivativeCFICode.byteArray(), 0, derivativeCFICodeLength);
        }

        if (hasDerivativeSecurityType())
        {
            encoder.derivativeSecurityTypeAsCopy(derivativeSecurityType.byteArray(), 0, derivativeSecurityTypeLength);
        }

        if (hasDerivativeSecuritySubType())
        {
            encoder.derivativeSecuritySubTypeAsCopy(derivativeSecuritySubType.byteArray(), 0, derivativeSecuritySubTypeLength);
        }

        if (hasDerivativeMaturityMonthYear())
        {
            encoder.derivativeMaturityMonthYearAsCopy(derivativeMaturityMonthYear.byteArray(), 0, derivativeMaturityMonthYearLength);
        }

        if (hasDerivativeMaturityDate())
        {
            encoder.derivativeMaturityDateAsCopy(derivativeMaturityDate.byteArray(), 0, derivativeMaturityDateLength);
        }

        if (hasDerivativeMaturityTime())
        {
            encoder.derivativeMaturityTimeAsCopy(derivativeMaturityTime.byteArray(), 0, derivativeMaturityTimeLength);
        }

        if (hasDerivativeSettleOnOpenFlag())
        {
            encoder.derivativeSettleOnOpenFlagAsCopy(derivativeSettleOnOpenFlag.byteArray(), 0, derivativeSettleOnOpenFlagLength);
        }

        if (hasDerivativeInstrmtAssignmentMethod())
        {
            encoder.derivativeInstrmtAssignmentMethod(this.derivativeInstrmtAssignmentMethod());
        }

        if (hasDerivativeSecurityStatus())
        {
            encoder.derivativeSecurityStatusAsCopy(derivativeSecurityStatus.byteArray(), 0, derivativeSecurityStatusLength);
        }

        if (hasDerivativeIssueDate())
        {
            encoder.derivativeIssueDateAsCopy(derivativeIssueDate.byteArray(), 0, derivativeIssueDateLength);
        }

        if (hasDerivativeInstrRegistry())
        {
            encoder.derivativeInstrRegistryAsCopy(derivativeInstrRegistry.byteArray(), 0, derivativeInstrRegistryLength);
        }

        if (hasDerivativeCountryOfIssue())
        {
            encoder.derivativeCountryOfIssueAsCopy(derivativeCountryOfIssue.byteArray(), 0, derivativeCountryOfIssueLength);
        }

        if (hasDerivativeStateOrProvinceOfIssue())
        {
            encoder.derivativeStateOrProvinceOfIssueAsCopy(derivativeStateOrProvinceOfIssue.byteArray(), 0, derivativeStateOrProvinceOfIssueLength);
        }

        if (hasDerivativeLocaleOfIssue())
        {
            encoder.derivativeLocaleOfIssueAsCopy(derivativeLocaleOfIssue.byteArray(), 0, derivativeLocaleOfIssueLength);
        }

        if (hasDerivativeStrikePrice())
        {
            encoder.derivativeStrikePrice(this.derivativeStrikePrice());
        }

        if (hasDerivativeStrikeCurrency())
        {
            encoder.derivativeStrikeCurrencyAsCopy(derivativeStrikeCurrency.byteArray(), 0, derivativeStrikeCurrencyLength);
        }

        if (hasDerivativeStrikeMultiplier())
        {
            encoder.derivativeStrikeMultiplier(this.derivativeStrikeMultiplier());
        }

        if (hasDerivativeStrikeValue())
        {
            encoder.derivativeStrikeValue(this.derivativeStrikeValue());
        }

        if (hasDerivativeOptAttribute())
        {
            encoder.derivativeOptAttribute(this.derivativeOptAttribute());
        }

        if (hasDerivativeContractMultiplier())
        {
            encoder.derivativeContractMultiplier(this.derivativeContractMultiplier());
        }

        if (hasDerivativeContractMultiplierUnit())
        {
            encoder.derivativeContractMultiplierUnit(this.derivativeContractMultiplierUnit());
        }

        if (hasDerivativeFlowScheduleType())
        {
            encoder.derivativeFlowScheduleType(this.derivativeFlowScheduleType());
        }

        if (hasDerivativeMinPriceIncrement())
        {
            encoder.derivativeMinPriceIncrement(this.derivativeMinPriceIncrement());
        }

        if (hasDerivativeMinPriceIncrementAmount())
        {
            encoder.derivativeMinPriceIncrementAmount(this.derivativeMinPriceIncrementAmount());
        }

        if (hasDerivativeUnitOfMeasure())
        {
            encoder.derivativeUnitOfMeasureAsCopy(derivativeUnitOfMeasure.byteArray(), 0, derivativeUnitOfMeasureLength);
        }

        if (hasDerivativeUnitOfMeasureQty())
        {
            encoder.derivativeUnitOfMeasureQty(this.derivativeUnitOfMeasureQty());
        }

        if (hasDerivativePriceUnitOfMeasure())
        {
            encoder.derivativePriceUnitOfMeasureAsCopy(derivativePriceUnitOfMeasure.byteArray(), 0, derivativePriceUnitOfMeasureLength);
        }

        if (hasDerivativePriceUnitOfMeasureQty())
        {
            encoder.derivativePriceUnitOfMeasureQty(this.derivativePriceUnitOfMeasureQty());
        }

        if (hasDerivativeSettlMethod())
        {
            encoder.derivativeSettlMethod(this.derivativeSettlMethod());
        }

        if (hasDerivativePriceQuoteMethod())
        {
            encoder.derivativePriceQuoteMethodAsCopy(derivativePriceQuoteMethod.byteArray(), 0, derivativePriceQuoteMethodLength);
        }

        if (hasDerivativeValuationMethod())
        {
            encoder.derivativeValuationMethodAsCopy(derivativeValuationMethod.byteArray(), 0, derivativeValuationMethodLength);
        }

        if (hasDerivativeListMethod())
        {
            encoder.derivativeListMethod(this.derivativeListMethod());
        }

        if (hasDerivativeCapPrice())
        {
            encoder.derivativeCapPrice(this.derivativeCapPrice());
        }

        if (hasDerivativeFloorPrice())
        {
            encoder.derivativeFloorPrice(this.derivativeFloorPrice());
        }

        if (hasDerivativePutOrCall())
        {
            encoder.derivativePutOrCall(this.derivativePutOrCall());
        }

        if (hasDerivativeExerciseStyle())
        {
            encoder.derivativeExerciseStyle(this.derivativeExerciseStyle());
        }

        if (hasDerivativeOptPayAmount())
        {
            encoder.derivativeOptPayAmount(this.derivativeOptPayAmount());
        }

        if (hasDerivativeTimeUnit())
        {
            encoder.derivativeTimeUnitAsCopy(derivativeTimeUnit.byteArray(), 0, derivativeTimeUnitLength);
        }

        if (hasDerivativeSecurityExchange())
        {
            encoder.derivativeSecurityExchangeAsCopy(derivativeSecurityExchange.byteArray(), 0, derivativeSecurityExchangeLength);
        }

        if (hasDerivativePositionLimit())
        {
            encoder.derivativePositionLimit(this.derivativePositionLimit());
        }

        if (hasDerivativeNTPositionLimit())
        {
            encoder.derivativeNTPositionLimit(this.derivativeNTPositionLimit());
        }

        if (hasDerivativeIssuer())
        {
            encoder.derivativeIssuerAsCopy(derivativeIssuer.byteArray(), 0, derivativeIssuerLength);
        }

        if (hasDerivativeEncodedIssuerLen())
        {
            encoder.derivativeEncodedIssuerLen(this.derivativeEncodedIssuerLen());
        }

        if (hasDerivativeEncodedIssuer())
        {
            encoder.derivativeEncodedIssuerAsCopy(this.derivativeEncodedIssuer(), 0, derivativeEncodedIssuerLen());
            encoder.derivativeEncodedIssuerLen(derivativeEncodedIssuerLen());
        }

        if (hasDerivativeSecurityDesc())
        {
            encoder.derivativeSecurityDescAsCopy(derivativeSecurityDesc.byteArray(), 0, derivativeSecurityDescLength);
        }

        if (hasDerivativeEncodedSecurityDescLen())
        {
            encoder.derivativeEncodedSecurityDescLen(this.derivativeEncodedSecurityDescLen());
        }

        if (hasDerivativeEncodedSecurityDesc())
        {
            encoder.derivativeEncodedSecurityDescAsCopy(this.derivativeEncodedSecurityDesc(), 0, derivativeEncodedSecurityDescLen());
            encoder.derivativeEncodedSecurityDescLen(derivativeEncodedSecurityDescLen());
        }


        derivativeSecurityXML.copyTo(encoder.derivativeSecurityXML());
        if (hasDerivativeContractSettlMonth())
        {
            encoder.derivativeContractSettlMonthAsCopy(derivativeContractSettlMonth.byteArray(), 0, derivativeContractSettlMonthLength);
        }


        derivativeEventsGrp.copyTo(encoder.derivativeEventsGrp());

        derivativeInstrumentParties.copyTo(encoder.derivativeInstrumentParties());        return encoder;
    }

}
