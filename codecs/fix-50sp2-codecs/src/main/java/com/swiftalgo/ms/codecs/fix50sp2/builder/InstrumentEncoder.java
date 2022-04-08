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


public class InstrumentEncoder
{
    private static final int symbolHeaderLength = 3;
    private static final byte[] symbolHeader = new byte[] {53, 53, (byte) '='};

    private static final int symbolSfxHeaderLength = 3;
    private static final byte[] symbolSfxHeader = new byte[] {54, 53, (byte) '='};

    private static final int securityIDHeaderLength = 3;
    private static final byte[] securityIDHeader = new byte[] {52, 56, (byte) '='};

    private static final int securityIDSourceHeaderLength = 3;
    private static final byte[] securityIDSourceHeader = new byte[] {50, 50, (byte) '='};

    private static final int productHeaderLength = 4;
    private static final byte[] productHeader = new byte[] {52, 54, 48, (byte) '='};

    private static final int productComplexHeaderLength = 5;
    private static final byte[] productComplexHeader = new byte[] {49, 50, 50, 55, (byte) '='};

    private static final int securityGroupHeaderLength = 5;
    private static final byte[] securityGroupHeader = new byte[] {49, 49, 53, 49, (byte) '='};

    private static final int cFICodeHeaderLength = 4;
    private static final byte[] cFICodeHeader = new byte[] {52, 54, 49, (byte) '='};

    private static final int securityTypeHeaderLength = 4;
    private static final byte[] securityTypeHeader = new byte[] {49, 54, 55, (byte) '='};

    private static final int securitySubTypeHeaderLength = 4;
    private static final byte[] securitySubTypeHeader = new byte[] {55, 54, 50, (byte) '='};

    private static final int maturityMonthYearHeaderLength = 4;
    private static final byte[] maturityMonthYearHeader = new byte[] {50, 48, 48, (byte) '='};

    private static final int maturityDateHeaderLength = 4;
    private static final byte[] maturityDateHeader = new byte[] {53, 52, 49, (byte) '='};

    private static final int maturityTimeHeaderLength = 5;
    private static final byte[] maturityTimeHeader = new byte[] {49, 48, 55, 57, (byte) '='};

    private static final int settleOnOpenFlagHeaderLength = 4;
    private static final byte[] settleOnOpenFlagHeader = new byte[] {57, 54, 54, (byte) '='};

    private static final int instrmtAssignmentMethodHeaderLength = 5;
    private static final byte[] instrmtAssignmentMethodHeader = new byte[] {49, 48, 52, 57, (byte) '='};

    private static final int securityStatusHeaderLength = 4;
    private static final byte[] securityStatusHeader = new byte[] {57, 54, 53, (byte) '='};

    private static final int couponPaymentDateHeaderLength = 4;
    private static final byte[] couponPaymentDateHeader = new byte[] {50, 50, 52, (byte) '='};

    private static final int restructuringTypeHeaderLength = 5;
    private static final byte[] restructuringTypeHeader = new byte[] {49, 52, 52, 57, (byte) '='};

    private static final int seniorityHeaderLength = 5;
    private static final byte[] seniorityHeader = new byte[] {49, 52, 53, 48, (byte) '='};

    private static final int notionalPercentageOutstandingHeaderLength = 5;
    private static final byte[] notionalPercentageOutstandingHeader = new byte[] {49, 52, 53, 49, (byte) '='};

    private static final int originalNotionalPercentageOutstandingHeaderLength = 5;
    private static final byte[] originalNotionalPercentageOutstandingHeader = new byte[] {49, 52, 53, 50, (byte) '='};

    private static final int attachmentPointHeaderLength = 5;
    private static final byte[] attachmentPointHeader = new byte[] {49, 52, 53, 55, (byte) '='};

    private static final int detachmentPointHeaderLength = 5;
    private static final byte[] detachmentPointHeader = new byte[] {49, 52, 53, 56, (byte) '='};

    private static final int issueDateHeaderLength = 4;
    private static final byte[] issueDateHeader = new byte[] {50, 50, 53, (byte) '='};

    private static final int repoCollateralSecurityTypeHeaderLength = 4;
    private static final byte[] repoCollateralSecurityTypeHeader = new byte[] {50, 51, 57, (byte) '='};

    private static final int repurchaseTermHeaderLength = 4;
    private static final byte[] repurchaseTermHeader = new byte[] {50, 50, 54, (byte) '='};

    private static final int repurchaseRateHeaderLength = 4;
    private static final byte[] repurchaseRateHeader = new byte[] {50, 50, 55, (byte) '='};

    private static final int factorHeaderLength = 4;
    private static final byte[] factorHeader = new byte[] {50, 50, 56, (byte) '='};

    private static final int creditRatingHeaderLength = 4;
    private static final byte[] creditRatingHeader = new byte[] {50, 53, 53, (byte) '='};

    private static final int instrRegistryHeaderLength = 4;
    private static final byte[] instrRegistryHeader = new byte[] {53, 52, 51, (byte) '='};

    private static final int countryOfIssueHeaderLength = 4;
    private static final byte[] countryOfIssueHeader = new byte[] {52, 55, 48, (byte) '='};

    private static final int stateOrProvinceOfIssueHeaderLength = 4;
    private static final byte[] stateOrProvinceOfIssueHeader = new byte[] {52, 55, 49, (byte) '='};

    private static final int localeOfIssueHeaderLength = 4;
    private static final byte[] localeOfIssueHeader = new byte[] {52, 55, 50, (byte) '='};

    private static final int redemptionDateHeaderLength = 4;
    private static final byte[] redemptionDateHeader = new byte[] {50, 52, 48, (byte) '='};

    private static final int strikePriceHeaderLength = 4;
    private static final byte[] strikePriceHeader = new byte[] {50, 48, 50, (byte) '='};

    private static final int strikeCurrencyHeaderLength = 4;
    private static final byte[] strikeCurrencyHeader = new byte[] {57, 52, 55, (byte) '='};

    private static final int strikeMultiplierHeaderLength = 4;
    private static final byte[] strikeMultiplierHeader = new byte[] {57, 54, 55, (byte) '='};

    private static final int strikeValueHeaderLength = 4;
    private static final byte[] strikeValueHeader = new byte[] {57, 54, 56, (byte) '='};

    private static final int strikePriceDeterminationMethodHeaderLength = 5;
    private static final byte[] strikePriceDeterminationMethodHeader = new byte[] {49, 52, 55, 56, (byte) '='};

    private static final int strikePriceBoundaryMethodHeaderLength = 5;
    private static final byte[] strikePriceBoundaryMethodHeader = new byte[] {49, 52, 55, 57, (byte) '='};

    private static final int strikePriceBoundaryPrecisionHeaderLength = 5;
    private static final byte[] strikePriceBoundaryPrecisionHeader = new byte[] {49, 52, 56, 48, (byte) '='};

    private static final int underlyingPriceDeterminationMethodHeaderLength = 5;
    private static final byte[] underlyingPriceDeterminationMethodHeader = new byte[] {49, 52, 56, 49, (byte) '='};

    private static final int optAttributeHeaderLength = 4;
    private static final byte[] optAttributeHeader = new byte[] {50, 48, 54, (byte) '='};

    private static final int contractMultiplierHeaderLength = 4;
    private static final byte[] contractMultiplierHeader = new byte[] {50, 51, 49, (byte) '='};

    private static final int contractMultiplierUnitHeaderLength = 5;
    private static final byte[] contractMultiplierUnitHeader = new byte[] {49, 52, 51, 53, (byte) '='};

    private static final int flowScheduleTypeHeaderLength = 5;
    private static final byte[] flowScheduleTypeHeader = new byte[] {49, 52, 51, 57, (byte) '='};

    private static final int minPriceIncrementHeaderLength = 4;
    private static final byte[] minPriceIncrementHeader = new byte[] {57, 54, 57, (byte) '='};

    private static final int minPriceIncrementAmountHeaderLength = 5;
    private static final byte[] minPriceIncrementAmountHeader = new byte[] {49, 49, 52, 54, (byte) '='};

    private static final int unitOfMeasureHeaderLength = 4;
    private static final byte[] unitOfMeasureHeader = new byte[] {57, 57, 54, (byte) '='};

    private static final int unitOfMeasureQtyHeaderLength = 5;
    private static final byte[] unitOfMeasureQtyHeader = new byte[] {49, 49, 52, 55, (byte) '='};

    private static final int priceUnitOfMeasureHeaderLength = 5;
    private static final byte[] priceUnitOfMeasureHeader = new byte[] {49, 49, 57, 49, (byte) '='};

    private static final int priceUnitOfMeasureQtyHeaderLength = 5;
    private static final byte[] priceUnitOfMeasureQtyHeader = new byte[] {49, 49, 57, 50, (byte) '='};

    private static final int settlMethodHeaderLength = 5;
    private static final byte[] settlMethodHeader = new byte[] {49, 49, 57, 51, (byte) '='};

    private static final int exerciseStyleHeaderLength = 5;
    private static final byte[] exerciseStyleHeader = new byte[] {49, 49, 57, 52, (byte) '='};

    private static final int optPayoutTypeHeaderLength = 5;
    private static final byte[] optPayoutTypeHeader = new byte[] {49, 52, 56, 50, (byte) '='};

    private static final int optPayoutAmountHeaderLength = 5;
    private static final byte[] optPayoutAmountHeader = new byte[] {49, 49, 57, 53, (byte) '='};

    private static final int priceQuoteMethodHeaderLength = 5;
    private static final byte[] priceQuoteMethodHeader = new byte[] {49, 49, 57, 54, (byte) '='};

    private static final int valuationMethodHeaderLength = 5;
    private static final byte[] valuationMethodHeader = new byte[] {49, 49, 57, 55, (byte) '='};

    private static final int listMethodHeaderLength = 5;
    private static final byte[] listMethodHeader = new byte[] {49, 49, 57, 56, (byte) '='};

    private static final int capPriceHeaderLength = 5;
    private static final byte[] capPriceHeader = new byte[] {49, 49, 57, 57, (byte) '='};

    private static final int floorPriceHeaderLength = 5;
    private static final byte[] floorPriceHeader = new byte[] {49, 50, 48, 48, (byte) '='};

    private static final int putOrCallHeaderLength = 4;
    private static final byte[] putOrCallHeader = new byte[] {50, 48, 49, (byte) '='};

    private static final int flexibleIndicatorHeaderLength = 5;
    private static final byte[] flexibleIndicatorHeader = new byte[] {49, 50, 52, 52, (byte) '='};

    private static final int flexProductEligibilityIndicatorHeaderLength = 5;
    private static final byte[] flexProductEligibilityIndicatorHeader = new byte[] {49, 50, 52, 50, (byte) '='};

    private static final int timeUnitHeaderLength = 4;
    private static final byte[] timeUnitHeader = new byte[] {57, 57, 55, (byte) '='};

    private static final int couponRateHeaderLength = 4;
    private static final byte[] couponRateHeader = new byte[] {50, 50, 51, (byte) '='};

    private static final int securityExchangeHeaderLength = 4;
    private static final byte[] securityExchangeHeader = new byte[] {50, 48, 55, (byte) '='};

    private static final int positionLimitHeaderLength = 4;
    private static final byte[] positionLimitHeader = new byte[] {57, 55, 48, (byte) '='};

    private static final int nTPositionLimitHeaderLength = 4;
    private static final byte[] nTPositionLimitHeader = new byte[] {57, 55, 49, (byte) '='};

    private static final int issuerHeaderLength = 4;
    private static final byte[] issuerHeader = new byte[] {49, 48, 54, (byte) '='};

    private static final int encodedIssuerLenHeaderLength = 4;
    private static final byte[] encodedIssuerLenHeader = new byte[] {51, 52, 56, (byte) '='};

    private static final int encodedIssuerHeaderLength = 4;
    private static final byte[] encodedIssuerHeader = new byte[] {51, 52, 57, (byte) '='};

    private static final int securityDescHeaderLength = 4;
    private static final byte[] securityDescHeader = new byte[] {49, 48, 55, (byte) '='};

    private static final int encodedSecurityDescLenHeaderLength = 4;
    private static final byte[] encodedSecurityDescLenHeader = new byte[] {51, 53, 48, (byte) '='};

    private static final int encodedSecurityDescHeaderLength = 4;
    private static final byte[] encodedSecurityDescHeader = new byte[] {51, 53, 49, (byte) '='};

    private static final int poolHeaderLength = 4;
    private static final byte[] poolHeader = new byte[] {54, 57, 49, (byte) '='};

    private static final int contractSettlMonthHeaderLength = 4;
    private static final byte[] contractSettlMonthHeader = new byte[] {54, 54, 55, (byte) '='};

    private static final int cPProgramHeaderLength = 4;
    private static final byte[] cPProgramHeader = new byte[] {56, 55, 53, (byte) '='};

    private static final int cPRegTypeHeaderLength = 4;
    private static final byte[] cPRegTypeHeader = new byte[] {56, 55, 54, (byte) '='};

    private static final int datedDateHeaderLength = 4;
    private static final byte[] datedDateHeader = new byte[] {56, 55, 51, (byte) '='};

    private static final int interestAccrualDateHeaderLength = 4;
    private static final byte[] interestAccrualDateHeader = new byte[] {56, 55, 52, (byte) '='};

    private final MutableDirectBuffer symbol = new UnsafeBuffer();

    private int symbolOffset = 0;

    private int symbolLength = 0;

    public InstrumentEncoder symbol(final DirectBuffer value, final int offset, final int length)
    {
        symbol.wrap(value);
        symbolOffset = offset;
        symbolLength = length;
        return this;
    }

    public InstrumentEncoder symbol(final DirectBuffer value, final int length)
    {
        return symbol(value, 0, length);
    }

    public InstrumentEncoder symbol(final DirectBuffer value)
    {
        return symbol(value, 0, value.capacity());
    }

    public InstrumentEncoder symbol(final byte[] value, final int offset, final int length)
    {
        symbol.wrap(value);
        symbolOffset = offset;
        symbolLength = length;
        return this;
    }

    public InstrumentEncoder symbolAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(symbol, value, offset, length);
        symbolOffset = offset;
        symbolLength = length;
        return this;
    }

    public InstrumentEncoder symbol(final byte[] value, final int length)
    {
        return symbol(value, 0, length);
    }

    public InstrumentEncoder symbol(final byte[] value)
    {
        return symbol(value, 0, value.length);
    }

    public boolean hasSymbol()
    {
        return symbolLength > 0;
    }

    public MutableDirectBuffer symbol()
    {
        return symbol;
    }

    public String symbolAsString()
    {
        return symbol.getStringWithoutLengthAscii(symbolOffset, symbolLength);
    }

    public InstrumentEncoder symbol(final CharSequence value)
    {
        toBytes(value, symbol);
        symbolOffset = 0;
        symbolLength = value.length();
        return this;
    }

    public InstrumentEncoder symbol(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            symbol.wrap(buffer);
            symbolOffset = value.offset();
            symbolLength = value.length();
        }
        return this;
    }

    public InstrumentEncoder symbol(final char[] value)
    {
        return symbol(value, 0, value.length);
    }

    public InstrumentEncoder symbol(final char[] value, final int length)
    {
        return symbol(value, 0, length);
    }

    public InstrumentEncoder symbol(final char[] value, final int offset, final int length)
    {
        toBytes(value, symbol, offset, length);
        symbolOffset = 0;
        symbolLength = length;
        return this;
    }

    private final MutableDirectBuffer symbolSfx = new UnsafeBuffer();

    private int symbolSfxOffset = 0;

    private int symbolSfxLength = 0;

    public InstrumentEncoder symbolSfx(final DirectBuffer value, final int offset, final int length)
    {
        symbolSfx.wrap(value);
        symbolSfxOffset = offset;
        symbolSfxLength = length;
        return this;
    }

    public InstrumentEncoder symbolSfx(final DirectBuffer value, final int length)
    {
        return symbolSfx(value, 0, length);
    }

    public InstrumentEncoder symbolSfx(final DirectBuffer value)
    {
        return symbolSfx(value, 0, value.capacity());
    }

    public InstrumentEncoder symbolSfx(final byte[] value, final int offset, final int length)
    {
        symbolSfx.wrap(value);
        symbolSfxOffset = offset;
        symbolSfxLength = length;
        return this;
    }

    public InstrumentEncoder symbolSfxAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(symbolSfx, value, offset, length);
        symbolSfxOffset = offset;
        symbolSfxLength = length;
        return this;
    }

    public InstrumentEncoder symbolSfx(final byte[] value, final int length)
    {
        return symbolSfx(value, 0, length);
    }

    public InstrumentEncoder symbolSfx(final byte[] value)
    {
        return symbolSfx(value, 0, value.length);
    }

    public boolean hasSymbolSfx()
    {
        return symbolSfxLength > 0;
    }

    public MutableDirectBuffer symbolSfx()
    {
        return symbolSfx;
    }

    public String symbolSfxAsString()
    {
        return symbolSfx.getStringWithoutLengthAscii(symbolSfxOffset, symbolSfxLength);
    }

    public InstrumentEncoder symbolSfx(final CharSequence value)
    {
        toBytes(value, symbolSfx);
        symbolSfxOffset = 0;
        symbolSfxLength = value.length();
        return this;
    }

    public InstrumentEncoder symbolSfx(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            symbolSfx.wrap(buffer);
            symbolSfxOffset = value.offset();
            symbolSfxLength = value.length();
        }
        return this;
    }

    public InstrumentEncoder symbolSfx(final char[] value)
    {
        return symbolSfx(value, 0, value.length);
    }

    public InstrumentEncoder symbolSfx(final char[] value, final int length)
    {
        return symbolSfx(value, 0, length);
    }

    public InstrumentEncoder symbolSfx(final char[] value, final int offset, final int length)
    {
        toBytes(value, symbolSfx, offset, length);
        symbolSfxOffset = 0;
        symbolSfxLength = length;
        return this;
    }

    public InstrumentEncoder symbolSfx(SymbolSfx value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == SymbolSfx.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: symbolSfx Value: " + value );
            }
            if (value == SymbolSfx.NULL_VAL)
            {
                return this;
            }
        }
        return symbolSfx(value.representation());
    }

    private final MutableDirectBuffer securityID = new UnsafeBuffer();

    private int securityIDOffset = 0;

    private int securityIDLength = 0;

    public InstrumentEncoder securityID(final DirectBuffer value, final int offset, final int length)
    {
        securityID.wrap(value);
        securityIDOffset = offset;
        securityIDLength = length;
        return this;
    }

    public InstrumentEncoder securityID(final DirectBuffer value, final int length)
    {
        return securityID(value, 0, length);
    }

    public InstrumentEncoder securityID(final DirectBuffer value)
    {
        return securityID(value, 0, value.capacity());
    }

    public InstrumentEncoder securityID(final byte[] value, final int offset, final int length)
    {
        securityID.wrap(value);
        securityIDOffset = offset;
        securityIDLength = length;
        return this;
    }

    public InstrumentEncoder securityIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(securityID, value, offset, length);
        securityIDOffset = offset;
        securityIDLength = length;
        return this;
    }

    public InstrumentEncoder securityID(final byte[] value, final int length)
    {
        return securityID(value, 0, length);
    }

    public InstrumentEncoder securityID(final byte[] value)
    {
        return securityID(value, 0, value.length);
    }

    public boolean hasSecurityID()
    {
        return securityIDLength > 0;
    }

    public MutableDirectBuffer securityID()
    {
        return securityID;
    }

    public String securityIDAsString()
    {
        return securityID.getStringWithoutLengthAscii(securityIDOffset, securityIDLength);
    }

    public InstrumentEncoder securityID(final CharSequence value)
    {
        toBytes(value, securityID);
        securityIDOffset = 0;
        securityIDLength = value.length();
        return this;
    }

    public InstrumentEncoder securityID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            securityID.wrap(buffer);
            securityIDOffset = value.offset();
            securityIDLength = value.length();
        }
        return this;
    }

    public InstrumentEncoder securityID(final char[] value)
    {
        return securityID(value, 0, value.length);
    }

    public InstrumentEncoder securityID(final char[] value, final int length)
    {
        return securityID(value, 0, length);
    }

    public InstrumentEncoder securityID(final char[] value, final int offset, final int length)
    {
        toBytes(value, securityID, offset, length);
        securityIDOffset = 0;
        securityIDLength = length;
        return this;
    }

    private final MutableDirectBuffer securityIDSource = new UnsafeBuffer();

    private int securityIDSourceOffset = 0;

    private int securityIDSourceLength = 0;

    public InstrumentEncoder securityIDSource(final DirectBuffer value, final int offset, final int length)
    {
        securityIDSource.wrap(value);
        securityIDSourceOffset = offset;
        securityIDSourceLength = length;
        return this;
    }

    public InstrumentEncoder securityIDSource(final DirectBuffer value, final int length)
    {
        return securityIDSource(value, 0, length);
    }

    public InstrumentEncoder securityIDSource(final DirectBuffer value)
    {
        return securityIDSource(value, 0, value.capacity());
    }

    public InstrumentEncoder securityIDSource(final byte[] value, final int offset, final int length)
    {
        securityIDSource.wrap(value);
        securityIDSourceOffset = offset;
        securityIDSourceLength = length;
        return this;
    }

    public InstrumentEncoder securityIDSourceAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(securityIDSource, value, offset, length);
        securityIDSourceOffset = offset;
        securityIDSourceLength = length;
        return this;
    }

    public InstrumentEncoder securityIDSource(final byte[] value, final int length)
    {
        return securityIDSource(value, 0, length);
    }

    public InstrumentEncoder securityIDSource(final byte[] value)
    {
        return securityIDSource(value, 0, value.length);
    }

    public boolean hasSecurityIDSource()
    {
        return securityIDSourceLength > 0;
    }

    public MutableDirectBuffer securityIDSource()
    {
        return securityIDSource;
    }

    public String securityIDSourceAsString()
    {
        return securityIDSource.getStringWithoutLengthAscii(securityIDSourceOffset, securityIDSourceLength);
    }

    public InstrumentEncoder securityIDSource(final CharSequence value)
    {
        toBytes(value, securityIDSource);
        securityIDSourceOffset = 0;
        securityIDSourceLength = value.length();
        return this;
    }

    public InstrumentEncoder securityIDSource(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            securityIDSource.wrap(buffer);
            securityIDSourceOffset = value.offset();
            securityIDSourceLength = value.length();
        }
        return this;
    }

    public InstrumentEncoder securityIDSource(final char[] value)
    {
        return securityIDSource(value, 0, value.length);
    }

    public InstrumentEncoder securityIDSource(final char[] value, final int length)
    {
        return securityIDSource(value, 0, length);
    }

    public InstrumentEncoder securityIDSource(final char[] value, final int offset, final int length)
    {
        toBytes(value, securityIDSource, offset, length);
        securityIDSourceOffset = 0;
        securityIDSourceLength = length;
        return this;
    }

    public InstrumentEncoder securityIDSource(SecurityIDSource value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == SecurityIDSource.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: securityIDSource Value: " + value );
            }
            if (value == SecurityIDSource.NULL_VAL)
            {
                return this;
            }
        }
        return securityIDSource(value.representation());
    }

    private final SecAltIDGrpEncoder secAltIDGrp = new SecAltIDGrpEncoder();
    public SecAltIDGrpEncoder secAltIDGrp()
    {
        return secAltIDGrp;
    }

    private int product;

    private boolean hasProduct;

    public boolean hasProduct()
    {
        return hasProduct;
    }

    public InstrumentEncoder product(int value)
    {
        product = value;
        hasProduct = true;
        return this;
    }

    public int product()
    {
        return product;
    }

    public InstrumentEncoder product(Product value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == Product.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: product Value: " + value );
            }
            if (value == Product.NULL_VAL)
            {
                return this;
            }
        }
        return product(value.representation());
    }

    private final MutableDirectBuffer productComplex = new UnsafeBuffer();

    private int productComplexOffset = 0;

    private int productComplexLength = 0;

    public InstrumentEncoder productComplex(final DirectBuffer value, final int offset, final int length)
    {
        productComplex.wrap(value);
        productComplexOffset = offset;
        productComplexLength = length;
        return this;
    }

    public InstrumentEncoder productComplex(final DirectBuffer value, final int length)
    {
        return productComplex(value, 0, length);
    }

    public InstrumentEncoder productComplex(final DirectBuffer value)
    {
        return productComplex(value, 0, value.capacity());
    }

    public InstrumentEncoder productComplex(final byte[] value, final int offset, final int length)
    {
        productComplex.wrap(value);
        productComplexOffset = offset;
        productComplexLength = length;
        return this;
    }

    public InstrumentEncoder productComplexAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(productComplex, value, offset, length);
        productComplexOffset = offset;
        productComplexLength = length;
        return this;
    }

    public InstrumentEncoder productComplex(final byte[] value, final int length)
    {
        return productComplex(value, 0, length);
    }

    public InstrumentEncoder productComplex(final byte[] value)
    {
        return productComplex(value, 0, value.length);
    }

    public boolean hasProductComplex()
    {
        return productComplexLength > 0;
    }

    public MutableDirectBuffer productComplex()
    {
        return productComplex;
    }

    public String productComplexAsString()
    {
        return productComplex.getStringWithoutLengthAscii(productComplexOffset, productComplexLength);
    }

    public InstrumentEncoder productComplex(final CharSequence value)
    {
        toBytes(value, productComplex);
        productComplexOffset = 0;
        productComplexLength = value.length();
        return this;
    }

    public InstrumentEncoder productComplex(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            productComplex.wrap(buffer);
            productComplexOffset = value.offset();
            productComplexLength = value.length();
        }
        return this;
    }

    public InstrumentEncoder productComplex(final char[] value)
    {
        return productComplex(value, 0, value.length);
    }

    public InstrumentEncoder productComplex(final char[] value, final int length)
    {
        return productComplex(value, 0, length);
    }

    public InstrumentEncoder productComplex(final char[] value, final int offset, final int length)
    {
        toBytes(value, productComplex, offset, length);
        productComplexOffset = 0;
        productComplexLength = length;
        return this;
    }

    private final MutableDirectBuffer securityGroup = new UnsafeBuffer();

    private int securityGroupOffset = 0;

    private int securityGroupLength = 0;

    public InstrumentEncoder securityGroup(final DirectBuffer value, final int offset, final int length)
    {
        securityGroup.wrap(value);
        securityGroupOffset = offset;
        securityGroupLength = length;
        return this;
    }

    public InstrumentEncoder securityGroup(final DirectBuffer value, final int length)
    {
        return securityGroup(value, 0, length);
    }

    public InstrumentEncoder securityGroup(final DirectBuffer value)
    {
        return securityGroup(value, 0, value.capacity());
    }

    public InstrumentEncoder securityGroup(final byte[] value, final int offset, final int length)
    {
        securityGroup.wrap(value);
        securityGroupOffset = offset;
        securityGroupLength = length;
        return this;
    }

    public InstrumentEncoder securityGroupAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(securityGroup, value, offset, length);
        securityGroupOffset = offset;
        securityGroupLength = length;
        return this;
    }

    public InstrumentEncoder securityGroup(final byte[] value, final int length)
    {
        return securityGroup(value, 0, length);
    }

    public InstrumentEncoder securityGroup(final byte[] value)
    {
        return securityGroup(value, 0, value.length);
    }

    public boolean hasSecurityGroup()
    {
        return securityGroupLength > 0;
    }

    public MutableDirectBuffer securityGroup()
    {
        return securityGroup;
    }

    public String securityGroupAsString()
    {
        return securityGroup.getStringWithoutLengthAscii(securityGroupOffset, securityGroupLength);
    }

    public InstrumentEncoder securityGroup(final CharSequence value)
    {
        toBytes(value, securityGroup);
        securityGroupOffset = 0;
        securityGroupLength = value.length();
        return this;
    }

    public InstrumentEncoder securityGroup(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            securityGroup.wrap(buffer);
            securityGroupOffset = value.offset();
            securityGroupLength = value.length();
        }
        return this;
    }

    public InstrumentEncoder securityGroup(final char[] value)
    {
        return securityGroup(value, 0, value.length);
    }

    public InstrumentEncoder securityGroup(final char[] value, final int length)
    {
        return securityGroup(value, 0, length);
    }

    public InstrumentEncoder securityGroup(final char[] value, final int offset, final int length)
    {
        toBytes(value, securityGroup, offset, length);
        securityGroupOffset = 0;
        securityGroupLength = length;
        return this;
    }

    private final MutableDirectBuffer cFICode = new UnsafeBuffer();

    private int cFICodeOffset = 0;

    private int cFICodeLength = 0;

    public InstrumentEncoder cFICode(final DirectBuffer value, final int offset, final int length)
    {
        cFICode.wrap(value);
        cFICodeOffset = offset;
        cFICodeLength = length;
        return this;
    }

    public InstrumentEncoder cFICode(final DirectBuffer value, final int length)
    {
        return cFICode(value, 0, length);
    }

    public InstrumentEncoder cFICode(final DirectBuffer value)
    {
        return cFICode(value, 0, value.capacity());
    }

    public InstrumentEncoder cFICode(final byte[] value, final int offset, final int length)
    {
        cFICode.wrap(value);
        cFICodeOffset = offset;
        cFICodeLength = length;
        return this;
    }

    public InstrumentEncoder cFICodeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(cFICode, value, offset, length);
        cFICodeOffset = offset;
        cFICodeLength = length;
        return this;
    }

    public InstrumentEncoder cFICode(final byte[] value, final int length)
    {
        return cFICode(value, 0, length);
    }

    public InstrumentEncoder cFICode(final byte[] value)
    {
        return cFICode(value, 0, value.length);
    }

    public boolean hasCFICode()
    {
        return cFICodeLength > 0;
    }

    public MutableDirectBuffer cFICode()
    {
        return cFICode;
    }

    public String cFICodeAsString()
    {
        return cFICode.getStringWithoutLengthAscii(cFICodeOffset, cFICodeLength);
    }

    public InstrumentEncoder cFICode(final CharSequence value)
    {
        toBytes(value, cFICode);
        cFICodeOffset = 0;
        cFICodeLength = value.length();
        return this;
    }

    public InstrumentEncoder cFICode(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            cFICode.wrap(buffer);
            cFICodeOffset = value.offset();
            cFICodeLength = value.length();
        }
        return this;
    }

    public InstrumentEncoder cFICode(final char[] value)
    {
        return cFICode(value, 0, value.length);
    }

    public InstrumentEncoder cFICode(final char[] value, final int length)
    {
        return cFICode(value, 0, length);
    }

    public InstrumentEncoder cFICode(final char[] value, final int offset, final int length)
    {
        toBytes(value, cFICode, offset, length);
        cFICodeOffset = 0;
        cFICodeLength = length;
        return this;
    }

    private final MutableDirectBuffer securityType = new UnsafeBuffer();

    private int securityTypeOffset = 0;

    private int securityTypeLength = 0;

    public InstrumentEncoder securityType(final DirectBuffer value, final int offset, final int length)
    {
        securityType.wrap(value);
        securityTypeOffset = offset;
        securityTypeLength = length;
        return this;
    }

    public InstrumentEncoder securityType(final DirectBuffer value, final int length)
    {
        return securityType(value, 0, length);
    }

    public InstrumentEncoder securityType(final DirectBuffer value)
    {
        return securityType(value, 0, value.capacity());
    }

    public InstrumentEncoder securityType(final byte[] value, final int offset, final int length)
    {
        securityType.wrap(value);
        securityTypeOffset = offset;
        securityTypeLength = length;
        return this;
    }

    public InstrumentEncoder securityTypeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(securityType, value, offset, length);
        securityTypeOffset = offset;
        securityTypeLength = length;
        return this;
    }

    public InstrumentEncoder securityType(final byte[] value, final int length)
    {
        return securityType(value, 0, length);
    }

    public InstrumentEncoder securityType(final byte[] value)
    {
        return securityType(value, 0, value.length);
    }

    public boolean hasSecurityType()
    {
        return securityTypeLength > 0;
    }

    public MutableDirectBuffer securityType()
    {
        return securityType;
    }

    public String securityTypeAsString()
    {
        return securityType.getStringWithoutLengthAscii(securityTypeOffset, securityTypeLength);
    }

    public InstrumentEncoder securityType(final CharSequence value)
    {
        toBytes(value, securityType);
        securityTypeOffset = 0;
        securityTypeLength = value.length();
        return this;
    }

    public InstrumentEncoder securityType(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            securityType.wrap(buffer);
            securityTypeOffset = value.offset();
            securityTypeLength = value.length();
        }
        return this;
    }

    public InstrumentEncoder securityType(final char[] value)
    {
        return securityType(value, 0, value.length);
    }

    public InstrumentEncoder securityType(final char[] value, final int length)
    {
        return securityType(value, 0, length);
    }

    public InstrumentEncoder securityType(final char[] value, final int offset, final int length)
    {
        toBytes(value, securityType, offset, length);
        securityTypeOffset = 0;
        securityTypeLength = length;
        return this;
    }

    public InstrumentEncoder securityType(SecurityType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == SecurityType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: securityType Value: " + value );
            }
            if (value == SecurityType.NULL_VAL)
            {
                return this;
            }
        }
        return securityType(value.representation());
    }

    private final MutableDirectBuffer securitySubType = new UnsafeBuffer();

    private int securitySubTypeOffset = 0;

    private int securitySubTypeLength = 0;

    public InstrumentEncoder securitySubType(final DirectBuffer value, final int offset, final int length)
    {
        securitySubType.wrap(value);
        securitySubTypeOffset = offset;
        securitySubTypeLength = length;
        return this;
    }

    public InstrumentEncoder securitySubType(final DirectBuffer value, final int length)
    {
        return securitySubType(value, 0, length);
    }

    public InstrumentEncoder securitySubType(final DirectBuffer value)
    {
        return securitySubType(value, 0, value.capacity());
    }

    public InstrumentEncoder securitySubType(final byte[] value, final int offset, final int length)
    {
        securitySubType.wrap(value);
        securitySubTypeOffset = offset;
        securitySubTypeLength = length;
        return this;
    }

    public InstrumentEncoder securitySubTypeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(securitySubType, value, offset, length);
        securitySubTypeOffset = offset;
        securitySubTypeLength = length;
        return this;
    }

    public InstrumentEncoder securitySubType(final byte[] value, final int length)
    {
        return securitySubType(value, 0, length);
    }

    public InstrumentEncoder securitySubType(final byte[] value)
    {
        return securitySubType(value, 0, value.length);
    }

    public boolean hasSecuritySubType()
    {
        return securitySubTypeLength > 0;
    }

    public MutableDirectBuffer securitySubType()
    {
        return securitySubType;
    }

    public String securitySubTypeAsString()
    {
        return securitySubType.getStringWithoutLengthAscii(securitySubTypeOffset, securitySubTypeLength);
    }

    public InstrumentEncoder securitySubType(final CharSequence value)
    {
        toBytes(value, securitySubType);
        securitySubTypeOffset = 0;
        securitySubTypeLength = value.length();
        return this;
    }

    public InstrumentEncoder securitySubType(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            securitySubType.wrap(buffer);
            securitySubTypeOffset = value.offset();
            securitySubTypeLength = value.length();
        }
        return this;
    }

    public InstrumentEncoder securitySubType(final char[] value)
    {
        return securitySubType(value, 0, value.length);
    }

    public InstrumentEncoder securitySubType(final char[] value, final int length)
    {
        return securitySubType(value, 0, length);
    }

    public InstrumentEncoder securitySubType(final char[] value, final int offset, final int length)
    {
        toBytes(value, securitySubType, offset, length);
        securitySubTypeOffset = 0;
        securitySubTypeLength = length;
        return this;
    }

    private final MutableDirectBuffer maturityMonthYear = new UnsafeBuffer();

    private int maturityMonthYearOffset = 0;

    private int maturityMonthYearLength = 0;

    public InstrumentEncoder maturityMonthYear(final DirectBuffer value, final int offset, final int length)
    {
        maturityMonthYear.wrap(value);
        maturityMonthYearOffset = offset;
        maturityMonthYearLength = length;
        return this;
    }

    public InstrumentEncoder maturityMonthYear(final DirectBuffer value, final int length)
    {
        return maturityMonthYear(value, 0, length);
    }

    public InstrumentEncoder maturityMonthYear(final DirectBuffer value)
    {
        return maturityMonthYear(value, 0, value.capacity());
    }

    public InstrumentEncoder maturityMonthYear(final byte[] value, final int offset, final int length)
    {
        maturityMonthYear.wrap(value);
        maturityMonthYearOffset = offset;
        maturityMonthYearLength = length;
        return this;
    }

    public InstrumentEncoder maturityMonthYearAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(maturityMonthYear, value, offset, length);
        maturityMonthYearOffset = offset;
        maturityMonthYearLength = length;
        return this;
    }

    public InstrumentEncoder maturityMonthYear(final byte[] value, final int length)
    {
        return maturityMonthYear(value, 0, length);
    }

    public InstrumentEncoder maturityMonthYear(final byte[] value)
    {
        return maturityMonthYear(value, 0, value.length);
    }

    public boolean hasMaturityMonthYear()
    {
        return maturityMonthYearLength > 0;
    }

    public MutableDirectBuffer maturityMonthYear()
    {
        return maturityMonthYear;
    }

    public String maturityMonthYearAsString()
    {
        return maturityMonthYear.getStringWithoutLengthAscii(maturityMonthYearOffset, maturityMonthYearLength);
    }

    private final MutableDirectBuffer maturityDate = new UnsafeBuffer();

    private int maturityDateOffset = 0;

    private int maturityDateLength = 0;

    public InstrumentEncoder maturityDate(final DirectBuffer value, final int offset, final int length)
    {
        maturityDate.wrap(value);
        maturityDateOffset = offset;
        maturityDateLength = length;
        return this;
    }

    public InstrumentEncoder maturityDate(final DirectBuffer value, final int length)
    {
        return maturityDate(value, 0, length);
    }

    public InstrumentEncoder maturityDate(final DirectBuffer value)
    {
        return maturityDate(value, 0, value.capacity());
    }

    public InstrumentEncoder maturityDate(final byte[] value, final int offset, final int length)
    {
        maturityDate.wrap(value);
        maturityDateOffset = offset;
        maturityDateLength = length;
        return this;
    }

    public InstrumentEncoder maturityDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(maturityDate, value, offset, length);
        maturityDateOffset = offset;
        maturityDateLength = length;
        return this;
    }

    public InstrumentEncoder maturityDate(final byte[] value, final int length)
    {
        return maturityDate(value, 0, length);
    }

    public InstrumentEncoder maturityDate(final byte[] value)
    {
        return maturityDate(value, 0, value.length);
    }

    public boolean hasMaturityDate()
    {
        return maturityDateLength > 0;
    }

    public MutableDirectBuffer maturityDate()
    {
        return maturityDate;
    }

    public String maturityDateAsString()
    {
        return maturityDate.getStringWithoutLengthAscii(maturityDateOffset, maturityDateLength);
    }

    private final MutableDirectBuffer maturityTime = new UnsafeBuffer();

    private int maturityTimeOffset = 0;

    private int maturityTimeLength = 0;

    public InstrumentEncoder maturityTime(final DirectBuffer value, final int offset, final int length)
    {
        maturityTime.wrap(value);
        maturityTimeOffset = offset;
        maturityTimeLength = length;
        return this;
    }

    public InstrumentEncoder maturityTime(final DirectBuffer value, final int length)
    {
        return maturityTime(value, 0, length);
    }

    public InstrumentEncoder maturityTime(final DirectBuffer value)
    {
        return maturityTime(value, 0, value.capacity());
    }

    public InstrumentEncoder maturityTime(final byte[] value, final int offset, final int length)
    {
        maturityTime.wrap(value);
        maturityTimeOffset = offset;
        maturityTimeLength = length;
        return this;
    }

    public InstrumentEncoder maturityTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(maturityTime, value, offset, length);
        maturityTimeOffset = offset;
        maturityTimeLength = length;
        return this;
    }

    public InstrumentEncoder maturityTime(final byte[] value, final int length)
    {
        return maturityTime(value, 0, length);
    }

    public InstrumentEncoder maturityTime(final byte[] value)
    {
        return maturityTime(value, 0, value.length);
    }

    public boolean hasMaturityTime()
    {
        return maturityTimeLength > 0;
    }

    public MutableDirectBuffer maturityTime()
    {
        return maturityTime;
    }

    public String maturityTimeAsString()
    {
        return maturityTime.getStringWithoutLengthAscii(maturityTimeOffset, maturityTimeLength);
    }

    private final MutableDirectBuffer settleOnOpenFlag = new UnsafeBuffer();

    private int settleOnOpenFlagOffset = 0;

    private int settleOnOpenFlagLength = 0;

    public InstrumentEncoder settleOnOpenFlag(final DirectBuffer value, final int offset, final int length)
    {
        settleOnOpenFlag.wrap(value);
        settleOnOpenFlagOffset = offset;
        settleOnOpenFlagLength = length;
        return this;
    }

    public InstrumentEncoder settleOnOpenFlag(final DirectBuffer value, final int length)
    {
        return settleOnOpenFlag(value, 0, length);
    }

    public InstrumentEncoder settleOnOpenFlag(final DirectBuffer value)
    {
        return settleOnOpenFlag(value, 0, value.capacity());
    }

    public InstrumentEncoder settleOnOpenFlag(final byte[] value, final int offset, final int length)
    {
        settleOnOpenFlag.wrap(value);
        settleOnOpenFlagOffset = offset;
        settleOnOpenFlagLength = length;
        return this;
    }

    public InstrumentEncoder settleOnOpenFlagAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settleOnOpenFlag, value, offset, length);
        settleOnOpenFlagOffset = offset;
        settleOnOpenFlagLength = length;
        return this;
    }

    public InstrumentEncoder settleOnOpenFlag(final byte[] value, final int length)
    {
        return settleOnOpenFlag(value, 0, length);
    }

    public InstrumentEncoder settleOnOpenFlag(final byte[] value)
    {
        return settleOnOpenFlag(value, 0, value.length);
    }

    public boolean hasSettleOnOpenFlag()
    {
        return settleOnOpenFlagLength > 0;
    }

    public MutableDirectBuffer settleOnOpenFlag()
    {
        return settleOnOpenFlag;
    }

    public String settleOnOpenFlagAsString()
    {
        return settleOnOpenFlag.getStringWithoutLengthAscii(settleOnOpenFlagOffset, settleOnOpenFlagLength);
    }

    public InstrumentEncoder settleOnOpenFlag(final CharSequence value)
    {
        toBytes(value, settleOnOpenFlag);
        settleOnOpenFlagOffset = 0;
        settleOnOpenFlagLength = value.length();
        return this;
    }

    public InstrumentEncoder settleOnOpenFlag(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            settleOnOpenFlag.wrap(buffer);
            settleOnOpenFlagOffset = value.offset();
            settleOnOpenFlagLength = value.length();
        }
        return this;
    }

    public InstrumentEncoder settleOnOpenFlag(final char[] value)
    {
        return settleOnOpenFlag(value, 0, value.length);
    }

    public InstrumentEncoder settleOnOpenFlag(final char[] value, final int length)
    {
        return settleOnOpenFlag(value, 0, length);
    }

    public InstrumentEncoder settleOnOpenFlag(final char[] value, final int offset, final int length)
    {
        toBytes(value, settleOnOpenFlag, offset, length);
        settleOnOpenFlagOffset = 0;
        settleOnOpenFlagLength = length;
        return this;
    }

    private char instrmtAssignmentMethod;

    private boolean hasInstrmtAssignmentMethod;

    public boolean hasInstrmtAssignmentMethod()
    {
        return hasInstrmtAssignmentMethod;
    }

    public InstrumentEncoder instrmtAssignmentMethod(char value)
    {
        instrmtAssignmentMethod = value;
        hasInstrmtAssignmentMethod = true;
        return this;
    }

    public char instrmtAssignmentMethod()
    {
        return instrmtAssignmentMethod;
    }

    private final MutableDirectBuffer securityStatus = new UnsafeBuffer();

    private int securityStatusOffset = 0;

    private int securityStatusLength = 0;

    public InstrumentEncoder securityStatus(final DirectBuffer value, final int offset, final int length)
    {
        securityStatus.wrap(value);
        securityStatusOffset = offset;
        securityStatusLength = length;
        return this;
    }

    public InstrumentEncoder securityStatus(final DirectBuffer value, final int length)
    {
        return securityStatus(value, 0, length);
    }

    public InstrumentEncoder securityStatus(final DirectBuffer value)
    {
        return securityStatus(value, 0, value.capacity());
    }

    public InstrumentEncoder securityStatus(final byte[] value, final int offset, final int length)
    {
        securityStatus.wrap(value);
        securityStatusOffset = offset;
        securityStatusLength = length;
        return this;
    }

    public InstrumentEncoder securityStatusAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(securityStatus, value, offset, length);
        securityStatusOffset = offset;
        securityStatusLength = length;
        return this;
    }

    public InstrumentEncoder securityStatus(final byte[] value, final int length)
    {
        return securityStatus(value, 0, length);
    }

    public InstrumentEncoder securityStatus(final byte[] value)
    {
        return securityStatus(value, 0, value.length);
    }

    public boolean hasSecurityStatus()
    {
        return securityStatusLength > 0;
    }

    public MutableDirectBuffer securityStatus()
    {
        return securityStatus;
    }

    public String securityStatusAsString()
    {
        return securityStatus.getStringWithoutLengthAscii(securityStatusOffset, securityStatusLength);
    }

    public InstrumentEncoder securityStatus(final CharSequence value)
    {
        toBytes(value, securityStatus);
        securityStatusOffset = 0;
        securityStatusLength = value.length();
        return this;
    }

    public InstrumentEncoder securityStatus(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            securityStatus.wrap(buffer);
            securityStatusOffset = value.offset();
            securityStatusLength = value.length();
        }
        return this;
    }

    public InstrumentEncoder securityStatus(final char[] value)
    {
        return securityStatus(value, 0, value.length);
    }

    public InstrumentEncoder securityStatus(final char[] value, final int length)
    {
        return securityStatus(value, 0, length);
    }

    public InstrumentEncoder securityStatus(final char[] value, final int offset, final int length)
    {
        toBytes(value, securityStatus, offset, length);
        securityStatusOffset = 0;
        securityStatusLength = length;
        return this;
    }

    public InstrumentEncoder securityStatus(SecurityStatus value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == SecurityStatus.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: securityStatus Value: " + value );
            }
            if (value == SecurityStatus.NULL_VAL)
            {
                return this;
            }
        }
        return securityStatus(value.representation());
    }

    private final MutableDirectBuffer couponPaymentDate = new UnsafeBuffer();

    private int couponPaymentDateOffset = 0;

    private int couponPaymentDateLength = 0;

    public InstrumentEncoder couponPaymentDate(final DirectBuffer value, final int offset, final int length)
    {
        couponPaymentDate.wrap(value);
        couponPaymentDateOffset = offset;
        couponPaymentDateLength = length;
        return this;
    }

    public InstrumentEncoder couponPaymentDate(final DirectBuffer value, final int length)
    {
        return couponPaymentDate(value, 0, length);
    }

    public InstrumentEncoder couponPaymentDate(final DirectBuffer value)
    {
        return couponPaymentDate(value, 0, value.capacity());
    }

    public InstrumentEncoder couponPaymentDate(final byte[] value, final int offset, final int length)
    {
        couponPaymentDate.wrap(value);
        couponPaymentDateOffset = offset;
        couponPaymentDateLength = length;
        return this;
    }

    public InstrumentEncoder couponPaymentDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(couponPaymentDate, value, offset, length);
        couponPaymentDateOffset = offset;
        couponPaymentDateLength = length;
        return this;
    }

    public InstrumentEncoder couponPaymentDate(final byte[] value, final int length)
    {
        return couponPaymentDate(value, 0, length);
    }

    public InstrumentEncoder couponPaymentDate(final byte[] value)
    {
        return couponPaymentDate(value, 0, value.length);
    }

    public boolean hasCouponPaymentDate()
    {
        return couponPaymentDateLength > 0;
    }

    public MutableDirectBuffer couponPaymentDate()
    {
        return couponPaymentDate;
    }

    public String couponPaymentDateAsString()
    {
        return couponPaymentDate.getStringWithoutLengthAscii(couponPaymentDateOffset, couponPaymentDateLength);
    }

    private final MutableDirectBuffer restructuringType = new UnsafeBuffer();

    private int restructuringTypeOffset = 0;

    private int restructuringTypeLength = 0;

    public InstrumentEncoder restructuringType(final DirectBuffer value, final int offset, final int length)
    {
        restructuringType.wrap(value);
        restructuringTypeOffset = offset;
        restructuringTypeLength = length;
        return this;
    }

    public InstrumentEncoder restructuringType(final DirectBuffer value, final int length)
    {
        return restructuringType(value, 0, length);
    }

    public InstrumentEncoder restructuringType(final DirectBuffer value)
    {
        return restructuringType(value, 0, value.capacity());
    }

    public InstrumentEncoder restructuringType(final byte[] value, final int offset, final int length)
    {
        restructuringType.wrap(value);
        restructuringTypeOffset = offset;
        restructuringTypeLength = length;
        return this;
    }

    public InstrumentEncoder restructuringTypeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(restructuringType, value, offset, length);
        restructuringTypeOffset = offset;
        restructuringTypeLength = length;
        return this;
    }

    public InstrumentEncoder restructuringType(final byte[] value, final int length)
    {
        return restructuringType(value, 0, length);
    }

    public InstrumentEncoder restructuringType(final byte[] value)
    {
        return restructuringType(value, 0, value.length);
    }

    public boolean hasRestructuringType()
    {
        return restructuringTypeLength > 0;
    }

    public MutableDirectBuffer restructuringType()
    {
        return restructuringType;
    }

    public String restructuringTypeAsString()
    {
        return restructuringType.getStringWithoutLengthAscii(restructuringTypeOffset, restructuringTypeLength);
    }

    public InstrumentEncoder restructuringType(final CharSequence value)
    {
        toBytes(value, restructuringType);
        restructuringTypeOffset = 0;
        restructuringTypeLength = value.length();
        return this;
    }

    public InstrumentEncoder restructuringType(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            restructuringType.wrap(buffer);
            restructuringTypeOffset = value.offset();
            restructuringTypeLength = value.length();
        }
        return this;
    }

    public InstrumentEncoder restructuringType(final char[] value)
    {
        return restructuringType(value, 0, value.length);
    }

    public InstrumentEncoder restructuringType(final char[] value, final int length)
    {
        return restructuringType(value, 0, length);
    }

    public InstrumentEncoder restructuringType(final char[] value, final int offset, final int length)
    {
        toBytes(value, restructuringType, offset, length);
        restructuringTypeOffset = 0;
        restructuringTypeLength = length;
        return this;
    }

    public InstrumentEncoder restructuringType(RestructuringType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == RestructuringType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: restructuringType Value: " + value );
            }
            if (value == RestructuringType.NULL_VAL)
            {
                return this;
            }
        }
        return restructuringType(value.representation());
    }

    private final MutableDirectBuffer seniority = new UnsafeBuffer();

    private int seniorityOffset = 0;

    private int seniorityLength = 0;

    public InstrumentEncoder seniority(final DirectBuffer value, final int offset, final int length)
    {
        seniority.wrap(value);
        seniorityOffset = offset;
        seniorityLength = length;
        return this;
    }

    public InstrumentEncoder seniority(final DirectBuffer value, final int length)
    {
        return seniority(value, 0, length);
    }

    public InstrumentEncoder seniority(final DirectBuffer value)
    {
        return seniority(value, 0, value.capacity());
    }

    public InstrumentEncoder seniority(final byte[] value, final int offset, final int length)
    {
        seniority.wrap(value);
        seniorityOffset = offset;
        seniorityLength = length;
        return this;
    }

    public InstrumentEncoder seniorityAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(seniority, value, offset, length);
        seniorityOffset = offset;
        seniorityLength = length;
        return this;
    }

    public InstrumentEncoder seniority(final byte[] value, final int length)
    {
        return seniority(value, 0, length);
    }

    public InstrumentEncoder seniority(final byte[] value)
    {
        return seniority(value, 0, value.length);
    }

    public boolean hasSeniority()
    {
        return seniorityLength > 0;
    }

    public MutableDirectBuffer seniority()
    {
        return seniority;
    }

    public String seniorityAsString()
    {
        return seniority.getStringWithoutLengthAscii(seniorityOffset, seniorityLength);
    }

    public InstrumentEncoder seniority(final CharSequence value)
    {
        toBytes(value, seniority);
        seniorityOffset = 0;
        seniorityLength = value.length();
        return this;
    }

    public InstrumentEncoder seniority(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            seniority.wrap(buffer);
            seniorityOffset = value.offset();
            seniorityLength = value.length();
        }
        return this;
    }

    public InstrumentEncoder seniority(final char[] value)
    {
        return seniority(value, 0, value.length);
    }

    public InstrumentEncoder seniority(final char[] value, final int length)
    {
        return seniority(value, 0, length);
    }

    public InstrumentEncoder seniority(final char[] value, final int offset, final int length)
    {
        toBytes(value, seniority, offset, length);
        seniorityOffset = 0;
        seniorityLength = length;
        return this;
    }

    public InstrumentEncoder seniority(Seniority value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == Seniority.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: seniority Value: " + value );
            }
            if (value == Seniority.NULL_VAL)
            {
                return this;
            }
        }
        return seniority(value.representation());
    }

    private final DecimalFloat notionalPercentageOutstanding = new DecimalFloat();

    private boolean hasNotionalPercentageOutstanding;

    public boolean hasNotionalPercentageOutstanding()
    {
        return hasNotionalPercentageOutstanding;
    }

    public InstrumentEncoder notionalPercentageOutstanding(DecimalFloat value)
    {
        notionalPercentageOutstanding.set(value);
        hasNotionalPercentageOutstanding = true;
        return this;
    }

    public InstrumentEncoder notionalPercentageOutstanding(long value, int scale)
    {
        notionalPercentageOutstanding.set(value, scale);
        hasNotionalPercentageOutstanding = true;
        return this;
    }

    public DecimalFloat notionalPercentageOutstanding()
    {
        return notionalPercentageOutstanding;
    }

    private final DecimalFloat originalNotionalPercentageOutstanding = new DecimalFloat();

    private boolean hasOriginalNotionalPercentageOutstanding;

    public boolean hasOriginalNotionalPercentageOutstanding()
    {
        return hasOriginalNotionalPercentageOutstanding;
    }

    public InstrumentEncoder originalNotionalPercentageOutstanding(DecimalFloat value)
    {
        originalNotionalPercentageOutstanding.set(value);
        hasOriginalNotionalPercentageOutstanding = true;
        return this;
    }

    public InstrumentEncoder originalNotionalPercentageOutstanding(long value, int scale)
    {
        originalNotionalPercentageOutstanding.set(value, scale);
        hasOriginalNotionalPercentageOutstanding = true;
        return this;
    }

    public DecimalFloat originalNotionalPercentageOutstanding()
    {
        return originalNotionalPercentageOutstanding;
    }

    private final DecimalFloat attachmentPoint = new DecimalFloat();

    private boolean hasAttachmentPoint;

    public boolean hasAttachmentPoint()
    {
        return hasAttachmentPoint;
    }

    public InstrumentEncoder attachmentPoint(DecimalFloat value)
    {
        attachmentPoint.set(value);
        hasAttachmentPoint = true;
        return this;
    }

    public InstrumentEncoder attachmentPoint(long value, int scale)
    {
        attachmentPoint.set(value, scale);
        hasAttachmentPoint = true;
        return this;
    }

    public DecimalFloat attachmentPoint()
    {
        return attachmentPoint;
    }

    private final DecimalFloat detachmentPoint = new DecimalFloat();

    private boolean hasDetachmentPoint;

    public boolean hasDetachmentPoint()
    {
        return hasDetachmentPoint;
    }

    public InstrumentEncoder detachmentPoint(DecimalFloat value)
    {
        detachmentPoint.set(value);
        hasDetachmentPoint = true;
        return this;
    }

    public InstrumentEncoder detachmentPoint(long value, int scale)
    {
        detachmentPoint.set(value, scale);
        hasDetachmentPoint = true;
        return this;
    }

    public DecimalFloat detachmentPoint()
    {
        return detachmentPoint;
    }

    private final MutableDirectBuffer issueDate = new UnsafeBuffer();

    private int issueDateOffset = 0;

    private int issueDateLength = 0;

    public InstrumentEncoder issueDate(final DirectBuffer value, final int offset, final int length)
    {
        issueDate.wrap(value);
        issueDateOffset = offset;
        issueDateLength = length;
        return this;
    }

    public InstrumentEncoder issueDate(final DirectBuffer value, final int length)
    {
        return issueDate(value, 0, length);
    }

    public InstrumentEncoder issueDate(final DirectBuffer value)
    {
        return issueDate(value, 0, value.capacity());
    }

    public InstrumentEncoder issueDate(final byte[] value, final int offset, final int length)
    {
        issueDate.wrap(value);
        issueDateOffset = offset;
        issueDateLength = length;
        return this;
    }

    public InstrumentEncoder issueDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(issueDate, value, offset, length);
        issueDateOffset = offset;
        issueDateLength = length;
        return this;
    }

    public InstrumentEncoder issueDate(final byte[] value, final int length)
    {
        return issueDate(value, 0, length);
    }

    public InstrumentEncoder issueDate(final byte[] value)
    {
        return issueDate(value, 0, value.length);
    }

    public boolean hasIssueDate()
    {
        return issueDateLength > 0;
    }

    public MutableDirectBuffer issueDate()
    {
        return issueDate;
    }

    public String issueDateAsString()
    {
        return issueDate.getStringWithoutLengthAscii(issueDateOffset, issueDateLength);
    }

    private final MutableDirectBuffer repoCollateralSecurityType = new UnsafeBuffer();

    private int repoCollateralSecurityTypeOffset = 0;

    private int repoCollateralSecurityTypeLength = 0;

    public InstrumentEncoder repoCollateralSecurityType(final DirectBuffer value, final int offset, final int length)
    {
        repoCollateralSecurityType.wrap(value);
        repoCollateralSecurityTypeOffset = offset;
        repoCollateralSecurityTypeLength = length;
        return this;
    }

    public InstrumentEncoder repoCollateralSecurityType(final DirectBuffer value, final int length)
    {
        return repoCollateralSecurityType(value, 0, length);
    }

    public InstrumentEncoder repoCollateralSecurityType(final DirectBuffer value)
    {
        return repoCollateralSecurityType(value, 0, value.capacity());
    }

    public InstrumentEncoder repoCollateralSecurityType(final byte[] value, final int offset, final int length)
    {
        repoCollateralSecurityType.wrap(value);
        repoCollateralSecurityTypeOffset = offset;
        repoCollateralSecurityTypeLength = length;
        return this;
    }

    public InstrumentEncoder repoCollateralSecurityTypeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(repoCollateralSecurityType, value, offset, length);
        repoCollateralSecurityTypeOffset = offset;
        repoCollateralSecurityTypeLength = length;
        return this;
    }

    public InstrumentEncoder repoCollateralSecurityType(final byte[] value, final int length)
    {
        return repoCollateralSecurityType(value, 0, length);
    }

    public InstrumentEncoder repoCollateralSecurityType(final byte[] value)
    {
        return repoCollateralSecurityType(value, 0, value.length);
    }

    public boolean hasRepoCollateralSecurityType()
    {
        return repoCollateralSecurityTypeLength > 0;
    }

    public MutableDirectBuffer repoCollateralSecurityType()
    {
        return repoCollateralSecurityType;
    }

    public String repoCollateralSecurityTypeAsString()
    {
        return repoCollateralSecurityType.getStringWithoutLengthAscii(repoCollateralSecurityTypeOffset, repoCollateralSecurityTypeLength);
    }

    public InstrumentEncoder repoCollateralSecurityType(final CharSequence value)
    {
        toBytes(value, repoCollateralSecurityType);
        repoCollateralSecurityTypeOffset = 0;
        repoCollateralSecurityTypeLength = value.length();
        return this;
    }

    public InstrumentEncoder repoCollateralSecurityType(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            repoCollateralSecurityType.wrap(buffer);
            repoCollateralSecurityTypeOffset = value.offset();
            repoCollateralSecurityTypeLength = value.length();
        }
        return this;
    }

    public InstrumentEncoder repoCollateralSecurityType(final char[] value)
    {
        return repoCollateralSecurityType(value, 0, value.length);
    }

    public InstrumentEncoder repoCollateralSecurityType(final char[] value, final int length)
    {
        return repoCollateralSecurityType(value, 0, length);
    }

    public InstrumentEncoder repoCollateralSecurityType(final char[] value, final int offset, final int length)
    {
        toBytes(value, repoCollateralSecurityType, offset, length);
        repoCollateralSecurityTypeOffset = 0;
        repoCollateralSecurityTypeLength = length;
        return this;
    }

    private int repurchaseTerm;

    private boolean hasRepurchaseTerm;

    public boolean hasRepurchaseTerm()
    {
        return hasRepurchaseTerm;
    }

    public InstrumentEncoder repurchaseTerm(int value)
    {
        repurchaseTerm = value;
        hasRepurchaseTerm = true;
        return this;
    }

    public int repurchaseTerm()
    {
        return repurchaseTerm;
    }

    private final DecimalFloat repurchaseRate = new DecimalFloat();

    private boolean hasRepurchaseRate;

    public boolean hasRepurchaseRate()
    {
        return hasRepurchaseRate;
    }

    public InstrumentEncoder repurchaseRate(DecimalFloat value)
    {
        repurchaseRate.set(value);
        hasRepurchaseRate = true;
        return this;
    }

    public InstrumentEncoder repurchaseRate(long value, int scale)
    {
        repurchaseRate.set(value, scale);
        hasRepurchaseRate = true;
        return this;
    }

    public DecimalFloat repurchaseRate()
    {
        return repurchaseRate;
    }

    private final DecimalFloat factor = new DecimalFloat();

    private boolean hasFactor;

    public boolean hasFactor()
    {
        return hasFactor;
    }

    public InstrumentEncoder factor(DecimalFloat value)
    {
        factor.set(value);
        hasFactor = true;
        return this;
    }

    public InstrumentEncoder factor(long value, int scale)
    {
        factor.set(value, scale);
        hasFactor = true;
        return this;
    }

    public DecimalFloat factor()
    {
        return factor;
    }

    private final MutableDirectBuffer creditRating = new UnsafeBuffer();

    private int creditRatingOffset = 0;

    private int creditRatingLength = 0;

    public InstrumentEncoder creditRating(final DirectBuffer value, final int offset, final int length)
    {
        creditRating.wrap(value);
        creditRatingOffset = offset;
        creditRatingLength = length;
        return this;
    }

    public InstrumentEncoder creditRating(final DirectBuffer value, final int length)
    {
        return creditRating(value, 0, length);
    }

    public InstrumentEncoder creditRating(final DirectBuffer value)
    {
        return creditRating(value, 0, value.capacity());
    }

    public InstrumentEncoder creditRating(final byte[] value, final int offset, final int length)
    {
        creditRating.wrap(value);
        creditRatingOffset = offset;
        creditRatingLength = length;
        return this;
    }

    public InstrumentEncoder creditRatingAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(creditRating, value, offset, length);
        creditRatingOffset = offset;
        creditRatingLength = length;
        return this;
    }

    public InstrumentEncoder creditRating(final byte[] value, final int length)
    {
        return creditRating(value, 0, length);
    }

    public InstrumentEncoder creditRating(final byte[] value)
    {
        return creditRating(value, 0, value.length);
    }

    public boolean hasCreditRating()
    {
        return creditRatingLength > 0;
    }

    public MutableDirectBuffer creditRating()
    {
        return creditRating;
    }

    public String creditRatingAsString()
    {
        return creditRating.getStringWithoutLengthAscii(creditRatingOffset, creditRatingLength);
    }

    public InstrumentEncoder creditRating(final CharSequence value)
    {
        toBytes(value, creditRating);
        creditRatingOffset = 0;
        creditRatingLength = value.length();
        return this;
    }

    public InstrumentEncoder creditRating(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            creditRating.wrap(buffer);
            creditRatingOffset = value.offset();
            creditRatingLength = value.length();
        }
        return this;
    }

    public InstrumentEncoder creditRating(final char[] value)
    {
        return creditRating(value, 0, value.length);
    }

    public InstrumentEncoder creditRating(final char[] value, final int length)
    {
        return creditRating(value, 0, length);
    }

    public InstrumentEncoder creditRating(final char[] value, final int offset, final int length)
    {
        toBytes(value, creditRating, offset, length);
        creditRatingOffset = 0;
        creditRatingLength = length;
        return this;
    }

    private final MutableDirectBuffer instrRegistry = new UnsafeBuffer();

    private int instrRegistryOffset = 0;

    private int instrRegistryLength = 0;

    public InstrumentEncoder instrRegistry(final DirectBuffer value, final int offset, final int length)
    {
        instrRegistry.wrap(value);
        instrRegistryOffset = offset;
        instrRegistryLength = length;
        return this;
    }

    public InstrumentEncoder instrRegistry(final DirectBuffer value, final int length)
    {
        return instrRegistry(value, 0, length);
    }

    public InstrumentEncoder instrRegistry(final DirectBuffer value)
    {
        return instrRegistry(value, 0, value.capacity());
    }

    public InstrumentEncoder instrRegistry(final byte[] value, final int offset, final int length)
    {
        instrRegistry.wrap(value);
        instrRegistryOffset = offset;
        instrRegistryLength = length;
        return this;
    }

    public InstrumentEncoder instrRegistryAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(instrRegistry, value, offset, length);
        instrRegistryOffset = offset;
        instrRegistryLength = length;
        return this;
    }

    public InstrumentEncoder instrRegistry(final byte[] value, final int length)
    {
        return instrRegistry(value, 0, length);
    }

    public InstrumentEncoder instrRegistry(final byte[] value)
    {
        return instrRegistry(value, 0, value.length);
    }

    public boolean hasInstrRegistry()
    {
        return instrRegistryLength > 0;
    }

    public MutableDirectBuffer instrRegistry()
    {
        return instrRegistry;
    }

    public String instrRegistryAsString()
    {
        return instrRegistry.getStringWithoutLengthAscii(instrRegistryOffset, instrRegistryLength);
    }

    public InstrumentEncoder instrRegistry(final CharSequence value)
    {
        toBytes(value, instrRegistry);
        instrRegistryOffset = 0;
        instrRegistryLength = value.length();
        return this;
    }

    public InstrumentEncoder instrRegistry(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            instrRegistry.wrap(buffer);
            instrRegistryOffset = value.offset();
            instrRegistryLength = value.length();
        }
        return this;
    }

    public InstrumentEncoder instrRegistry(final char[] value)
    {
        return instrRegistry(value, 0, value.length);
    }

    public InstrumentEncoder instrRegistry(final char[] value, final int length)
    {
        return instrRegistry(value, 0, length);
    }

    public InstrumentEncoder instrRegistry(final char[] value, final int offset, final int length)
    {
        toBytes(value, instrRegistry, offset, length);
        instrRegistryOffset = 0;
        instrRegistryLength = length;
        return this;
    }

    private final MutableDirectBuffer countryOfIssue = new UnsafeBuffer();

    private int countryOfIssueOffset = 0;

    private int countryOfIssueLength = 0;

    public InstrumentEncoder countryOfIssue(final DirectBuffer value, final int offset, final int length)
    {
        countryOfIssue.wrap(value);
        countryOfIssueOffset = offset;
        countryOfIssueLength = length;
        return this;
    }

    public InstrumentEncoder countryOfIssue(final DirectBuffer value, final int length)
    {
        return countryOfIssue(value, 0, length);
    }

    public InstrumentEncoder countryOfIssue(final DirectBuffer value)
    {
        return countryOfIssue(value, 0, value.capacity());
    }

    public InstrumentEncoder countryOfIssue(final byte[] value, final int offset, final int length)
    {
        countryOfIssue.wrap(value);
        countryOfIssueOffset = offset;
        countryOfIssueLength = length;
        return this;
    }

    public InstrumentEncoder countryOfIssueAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(countryOfIssue, value, offset, length);
        countryOfIssueOffset = offset;
        countryOfIssueLength = length;
        return this;
    }

    public InstrumentEncoder countryOfIssue(final byte[] value, final int length)
    {
        return countryOfIssue(value, 0, length);
    }

    public InstrumentEncoder countryOfIssue(final byte[] value)
    {
        return countryOfIssue(value, 0, value.length);
    }

    public boolean hasCountryOfIssue()
    {
        return countryOfIssueLength > 0;
    }

    public MutableDirectBuffer countryOfIssue()
    {
        return countryOfIssue;
    }

    public String countryOfIssueAsString()
    {
        return countryOfIssue.getStringWithoutLengthAscii(countryOfIssueOffset, countryOfIssueLength);
    }

    public InstrumentEncoder countryOfIssue(final CharSequence value)
    {
        toBytes(value, countryOfIssue);
        countryOfIssueOffset = 0;
        countryOfIssueLength = value.length();
        return this;
    }

    public InstrumentEncoder countryOfIssue(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            countryOfIssue.wrap(buffer);
            countryOfIssueOffset = value.offset();
            countryOfIssueLength = value.length();
        }
        return this;
    }

    public InstrumentEncoder countryOfIssue(final char[] value)
    {
        return countryOfIssue(value, 0, value.length);
    }

    public InstrumentEncoder countryOfIssue(final char[] value, final int length)
    {
        return countryOfIssue(value, 0, length);
    }

    public InstrumentEncoder countryOfIssue(final char[] value, final int offset, final int length)
    {
        toBytes(value, countryOfIssue, offset, length);
        countryOfIssueOffset = 0;
        countryOfIssueLength = length;
        return this;
    }

    private final MutableDirectBuffer stateOrProvinceOfIssue = new UnsafeBuffer();

    private int stateOrProvinceOfIssueOffset = 0;

    private int stateOrProvinceOfIssueLength = 0;

    public InstrumentEncoder stateOrProvinceOfIssue(final DirectBuffer value, final int offset, final int length)
    {
        stateOrProvinceOfIssue.wrap(value);
        stateOrProvinceOfIssueOffset = offset;
        stateOrProvinceOfIssueLength = length;
        return this;
    }

    public InstrumentEncoder stateOrProvinceOfIssue(final DirectBuffer value, final int length)
    {
        return stateOrProvinceOfIssue(value, 0, length);
    }

    public InstrumentEncoder stateOrProvinceOfIssue(final DirectBuffer value)
    {
        return stateOrProvinceOfIssue(value, 0, value.capacity());
    }

    public InstrumentEncoder stateOrProvinceOfIssue(final byte[] value, final int offset, final int length)
    {
        stateOrProvinceOfIssue.wrap(value);
        stateOrProvinceOfIssueOffset = offset;
        stateOrProvinceOfIssueLength = length;
        return this;
    }

    public InstrumentEncoder stateOrProvinceOfIssueAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(stateOrProvinceOfIssue, value, offset, length);
        stateOrProvinceOfIssueOffset = offset;
        stateOrProvinceOfIssueLength = length;
        return this;
    }

    public InstrumentEncoder stateOrProvinceOfIssue(final byte[] value, final int length)
    {
        return stateOrProvinceOfIssue(value, 0, length);
    }

    public InstrumentEncoder stateOrProvinceOfIssue(final byte[] value)
    {
        return stateOrProvinceOfIssue(value, 0, value.length);
    }

    public boolean hasStateOrProvinceOfIssue()
    {
        return stateOrProvinceOfIssueLength > 0;
    }

    public MutableDirectBuffer stateOrProvinceOfIssue()
    {
        return stateOrProvinceOfIssue;
    }

    public String stateOrProvinceOfIssueAsString()
    {
        return stateOrProvinceOfIssue.getStringWithoutLengthAscii(stateOrProvinceOfIssueOffset, stateOrProvinceOfIssueLength);
    }

    public InstrumentEncoder stateOrProvinceOfIssue(final CharSequence value)
    {
        toBytes(value, stateOrProvinceOfIssue);
        stateOrProvinceOfIssueOffset = 0;
        stateOrProvinceOfIssueLength = value.length();
        return this;
    }

    public InstrumentEncoder stateOrProvinceOfIssue(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            stateOrProvinceOfIssue.wrap(buffer);
            stateOrProvinceOfIssueOffset = value.offset();
            stateOrProvinceOfIssueLength = value.length();
        }
        return this;
    }

    public InstrumentEncoder stateOrProvinceOfIssue(final char[] value)
    {
        return stateOrProvinceOfIssue(value, 0, value.length);
    }

    public InstrumentEncoder stateOrProvinceOfIssue(final char[] value, final int length)
    {
        return stateOrProvinceOfIssue(value, 0, length);
    }

    public InstrumentEncoder stateOrProvinceOfIssue(final char[] value, final int offset, final int length)
    {
        toBytes(value, stateOrProvinceOfIssue, offset, length);
        stateOrProvinceOfIssueOffset = 0;
        stateOrProvinceOfIssueLength = length;
        return this;
    }

    private final MutableDirectBuffer localeOfIssue = new UnsafeBuffer();

    private int localeOfIssueOffset = 0;

    private int localeOfIssueLength = 0;

    public InstrumentEncoder localeOfIssue(final DirectBuffer value, final int offset, final int length)
    {
        localeOfIssue.wrap(value);
        localeOfIssueOffset = offset;
        localeOfIssueLength = length;
        return this;
    }

    public InstrumentEncoder localeOfIssue(final DirectBuffer value, final int length)
    {
        return localeOfIssue(value, 0, length);
    }

    public InstrumentEncoder localeOfIssue(final DirectBuffer value)
    {
        return localeOfIssue(value, 0, value.capacity());
    }

    public InstrumentEncoder localeOfIssue(final byte[] value, final int offset, final int length)
    {
        localeOfIssue.wrap(value);
        localeOfIssueOffset = offset;
        localeOfIssueLength = length;
        return this;
    }

    public InstrumentEncoder localeOfIssueAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(localeOfIssue, value, offset, length);
        localeOfIssueOffset = offset;
        localeOfIssueLength = length;
        return this;
    }

    public InstrumentEncoder localeOfIssue(final byte[] value, final int length)
    {
        return localeOfIssue(value, 0, length);
    }

    public InstrumentEncoder localeOfIssue(final byte[] value)
    {
        return localeOfIssue(value, 0, value.length);
    }

    public boolean hasLocaleOfIssue()
    {
        return localeOfIssueLength > 0;
    }

    public MutableDirectBuffer localeOfIssue()
    {
        return localeOfIssue;
    }

    public String localeOfIssueAsString()
    {
        return localeOfIssue.getStringWithoutLengthAscii(localeOfIssueOffset, localeOfIssueLength);
    }

    public InstrumentEncoder localeOfIssue(final CharSequence value)
    {
        toBytes(value, localeOfIssue);
        localeOfIssueOffset = 0;
        localeOfIssueLength = value.length();
        return this;
    }

    public InstrumentEncoder localeOfIssue(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            localeOfIssue.wrap(buffer);
            localeOfIssueOffset = value.offset();
            localeOfIssueLength = value.length();
        }
        return this;
    }

    public InstrumentEncoder localeOfIssue(final char[] value)
    {
        return localeOfIssue(value, 0, value.length);
    }

    public InstrumentEncoder localeOfIssue(final char[] value, final int length)
    {
        return localeOfIssue(value, 0, length);
    }

    public InstrumentEncoder localeOfIssue(final char[] value, final int offset, final int length)
    {
        toBytes(value, localeOfIssue, offset, length);
        localeOfIssueOffset = 0;
        localeOfIssueLength = length;
        return this;
    }

    private final MutableDirectBuffer redemptionDate = new UnsafeBuffer();

    private int redemptionDateOffset = 0;

    private int redemptionDateLength = 0;

    public InstrumentEncoder redemptionDate(final DirectBuffer value, final int offset, final int length)
    {
        redemptionDate.wrap(value);
        redemptionDateOffset = offset;
        redemptionDateLength = length;
        return this;
    }

    public InstrumentEncoder redemptionDate(final DirectBuffer value, final int length)
    {
        return redemptionDate(value, 0, length);
    }

    public InstrumentEncoder redemptionDate(final DirectBuffer value)
    {
        return redemptionDate(value, 0, value.capacity());
    }

    public InstrumentEncoder redemptionDate(final byte[] value, final int offset, final int length)
    {
        redemptionDate.wrap(value);
        redemptionDateOffset = offset;
        redemptionDateLength = length;
        return this;
    }

    public InstrumentEncoder redemptionDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(redemptionDate, value, offset, length);
        redemptionDateOffset = offset;
        redemptionDateLength = length;
        return this;
    }

    public InstrumentEncoder redemptionDate(final byte[] value, final int length)
    {
        return redemptionDate(value, 0, length);
    }

    public InstrumentEncoder redemptionDate(final byte[] value)
    {
        return redemptionDate(value, 0, value.length);
    }

    public boolean hasRedemptionDate()
    {
        return redemptionDateLength > 0;
    }

    public MutableDirectBuffer redemptionDate()
    {
        return redemptionDate;
    }

    public String redemptionDateAsString()
    {
        return redemptionDate.getStringWithoutLengthAscii(redemptionDateOffset, redemptionDateLength);
    }

    private final DecimalFloat strikePrice = new DecimalFloat();

    private boolean hasStrikePrice;

    public boolean hasStrikePrice()
    {
        return hasStrikePrice;
    }

    public InstrumentEncoder strikePrice(DecimalFloat value)
    {
        strikePrice.set(value);
        hasStrikePrice = true;
        return this;
    }

    public InstrumentEncoder strikePrice(long value, int scale)
    {
        strikePrice.set(value, scale);
        hasStrikePrice = true;
        return this;
    }

    public DecimalFloat strikePrice()
    {
        return strikePrice;
    }

    private final MutableDirectBuffer strikeCurrency = new UnsafeBuffer();

    private int strikeCurrencyOffset = 0;

    private int strikeCurrencyLength = 0;

    public InstrumentEncoder strikeCurrency(final DirectBuffer value, final int offset, final int length)
    {
        strikeCurrency.wrap(value);
        strikeCurrencyOffset = offset;
        strikeCurrencyLength = length;
        return this;
    }

    public InstrumentEncoder strikeCurrency(final DirectBuffer value, final int length)
    {
        return strikeCurrency(value, 0, length);
    }

    public InstrumentEncoder strikeCurrency(final DirectBuffer value)
    {
        return strikeCurrency(value, 0, value.capacity());
    }

    public InstrumentEncoder strikeCurrency(final byte[] value, final int offset, final int length)
    {
        strikeCurrency.wrap(value);
        strikeCurrencyOffset = offset;
        strikeCurrencyLength = length;
        return this;
    }

    public InstrumentEncoder strikeCurrencyAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(strikeCurrency, value, offset, length);
        strikeCurrencyOffset = offset;
        strikeCurrencyLength = length;
        return this;
    }

    public InstrumentEncoder strikeCurrency(final byte[] value, final int length)
    {
        return strikeCurrency(value, 0, length);
    }

    public InstrumentEncoder strikeCurrency(final byte[] value)
    {
        return strikeCurrency(value, 0, value.length);
    }

    public boolean hasStrikeCurrency()
    {
        return strikeCurrencyLength > 0;
    }

    public MutableDirectBuffer strikeCurrency()
    {
        return strikeCurrency;
    }

    public String strikeCurrencyAsString()
    {
        return strikeCurrency.getStringWithoutLengthAscii(strikeCurrencyOffset, strikeCurrencyLength);
    }

    public InstrumentEncoder strikeCurrency(final CharSequence value)
    {
        toBytes(value, strikeCurrency);
        strikeCurrencyOffset = 0;
        strikeCurrencyLength = value.length();
        return this;
    }

    public InstrumentEncoder strikeCurrency(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            strikeCurrency.wrap(buffer);
            strikeCurrencyOffset = value.offset();
            strikeCurrencyLength = value.length();
        }
        return this;
    }

    public InstrumentEncoder strikeCurrency(final char[] value)
    {
        return strikeCurrency(value, 0, value.length);
    }

    public InstrumentEncoder strikeCurrency(final char[] value, final int length)
    {
        return strikeCurrency(value, 0, length);
    }

    public InstrumentEncoder strikeCurrency(final char[] value, final int offset, final int length)
    {
        toBytes(value, strikeCurrency, offset, length);
        strikeCurrencyOffset = 0;
        strikeCurrencyLength = length;
        return this;
    }

    private final DecimalFloat strikeMultiplier = new DecimalFloat();

    private boolean hasStrikeMultiplier;

    public boolean hasStrikeMultiplier()
    {
        return hasStrikeMultiplier;
    }

    public InstrumentEncoder strikeMultiplier(DecimalFloat value)
    {
        strikeMultiplier.set(value);
        hasStrikeMultiplier = true;
        return this;
    }

    public InstrumentEncoder strikeMultiplier(long value, int scale)
    {
        strikeMultiplier.set(value, scale);
        hasStrikeMultiplier = true;
        return this;
    }

    public DecimalFloat strikeMultiplier()
    {
        return strikeMultiplier;
    }

    private final DecimalFloat strikeValue = new DecimalFloat();

    private boolean hasStrikeValue;

    public boolean hasStrikeValue()
    {
        return hasStrikeValue;
    }

    public InstrumentEncoder strikeValue(DecimalFloat value)
    {
        strikeValue.set(value);
        hasStrikeValue = true;
        return this;
    }

    public InstrumentEncoder strikeValue(long value, int scale)
    {
        strikeValue.set(value, scale);
        hasStrikeValue = true;
        return this;
    }

    public DecimalFloat strikeValue()
    {
        return strikeValue;
    }

    private int strikePriceDeterminationMethod;

    private boolean hasStrikePriceDeterminationMethod;

    public boolean hasStrikePriceDeterminationMethod()
    {
        return hasStrikePriceDeterminationMethod;
    }

    public InstrumentEncoder strikePriceDeterminationMethod(int value)
    {
        strikePriceDeterminationMethod = value;
        hasStrikePriceDeterminationMethod = true;
        return this;
    }

    public int strikePriceDeterminationMethod()
    {
        return strikePriceDeterminationMethod;
    }

    public InstrumentEncoder strikePriceDeterminationMethod(StrikePriceDeterminationMethod value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == StrikePriceDeterminationMethod.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: strikePriceDeterminationMethod Value: " + value );
            }
            if (value == StrikePriceDeterminationMethod.NULL_VAL)
            {
                return this;
            }
        }
        return strikePriceDeterminationMethod(value.representation());
    }

    private int strikePriceBoundaryMethod;

    private boolean hasStrikePriceBoundaryMethod;

    public boolean hasStrikePriceBoundaryMethod()
    {
        return hasStrikePriceBoundaryMethod;
    }

    public InstrumentEncoder strikePriceBoundaryMethod(int value)
    {
        strikePriceBoundaryMethod = value;
        hasStrikePriceBoundaryMethod = true;
        return this;
    }

    public int strikePriceBoundaryMethod()
    {
        return strikePriceBoundaryMethod;
    }

    public InstrumentEncoder strikePriceBoundaryMethod(StrikePriceBoundaryMethod value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == StrikePriceBoundaryMethod.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: strikePriceBoundaryMethod Value: " + value );
            }
            if (value == StrikePriceBoundaryMethod.NULL_VAL)
            {
                return this;
            }
        }
        return strikePriceBoundaryMethod(value.representation());
    }

    private final DecimalFloat strikePriceBoundaryPrecision = new DecimalFloat();

    private boolean hasStrikePriceBoundaryPrecision;

    public boolean hasStrikePriceBoundaryPrecision()
    {
        return hasStrikePriceBoundaryPrecision;
    }

    public InstrumentEncoder strikePriceBoundaryPrecision(DecimalFloat value)
    {
        strikePriceBoundaryPrecision.set(value);
        hasStrikePriceBoundaryPrecision = true;
        return this;
    }

    public InstrumentEncoder strikePriceBoundaryPrecision(long value, int scale)
    {
        strikePriceBoundaryPrecision.set(value, scale);
        hasStrikePriceBoundaryPrecision = true;
        return this;
    }

    public DecimalFloat strikePriceBoundaryPrecision()
    {
        return strikePriceBoundaryPrecision;
    }

    private int underlyingPriceDeterminationMethod;

    private boolean hasUnderlyingPriceDeterminationMethod;

    public boolean hasUnderlyingPriceDeterminationMethod()
    {
        return hasUnderlyingPriceDeterminationMethod;
    }

    public InstrumentEncoder underlyingPriceDeterminationMethod(int value)
    {
        underlyingPriceDeterminationMethod = value;
        hasUnderlyingPriceDeterminationMethod = true;
        return this;
    }

    public int underlyingPriceDeterminationMethod()
    {
        return underlyingPriceDeterminationMethod;
    }

    public InstrumentEncoder underlyingPriceDeterminationMethod(UnderlyingPriceDeterminationMethod value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == UnderlyingPriceDeterminationMethod.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: underlyingPriceDeterminationMethod Value: " + value );
            }
            if (value == UnderlyingPriceDeterminationMethod.NULL_VAL)
            {
                return this;
            }
        }
        return underlyingPriceDeterminationMethod(value.representation());
    }

    private char optAttribute;

    private boolean hasOptAttribute;

    public boolean hasOptAttribute()
    {
        return hasOptAttribute;
    }

    public InstrumentEncoder optAttribute(char value)
    {
        optAttribute = value;
        hasOptAttribute = true;
        return this;
    }

    public char optAttribute()
    {
        return optAttribute;
    }

    private final DecimalFloat contractMultiplier = new DecimalFloat();

    private boolean hasContractMultiplier;

    public boolean hasContractMultiplier()
    {
        return hasContractMultiplier;
    }

    public InstrumentEncoder contractMultiplier(DecimalFloat value)
    {
        contractMultiplier.set(value);
        hasContractMultiplier = true;
        return this;
    }

    public InstrumentEncoder contractMultiplier(long value, int scale)
    {
        contractMultiplier.set(value, scale);
        hasContractMultiplier = true;
        return this;
    }

    public DecimalFloat contractMultiplier()
    {
        return contractMultiplier;
    }

    private int contractMultiplierUnit;

    private boolean hasContractMultiplierUnit;

    public boolean hasContractMultiplierUnit()
    {
        return hasContractMultiplierUnit;
    }

    public InstrumentEncoder contractMultiplierUnit(int value)
    {
        contractMultiplierUnit = value;
        hasContractMultiplierUnit = true;
        return this;
    }

    public int contractMultiplierUnit()
    {
        return contractMultiplierUnit;
    }

    public InstrumentEncoder contractMultiplierUnit(ContractMultiplierUnit value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == ContractMultiplierUnit.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: contractMultiplierUnit Value: " + value );
            }
            if (value == ContractMultiplierUnit.NULL_VAL)
            {
                return this;
            }
        }
        return contractMultiplierUnit(value.representation());
    }

    private int flowScheduleType;

    private boolean hasFlowScheduleType;

    public boolean hasFlowScheduleType()
    {
        return hasFlowScheduleType;
    }

    public InstrumentEncoder flowScheduleType(int value)
    {
        flowScheduleType = value;
        hasFlowScheduleType = true;
        return this;
    }

    public int flowScheduleType()
    {
        return flowScheduleType;
    }

    public InstrumentEncoder flowScheduleType(FlowScheduleType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == FlowScheduleType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: flowScheduleType Value: " + value );
            }
            if (value == FlowScheduleType.NULL_VAL)
            {
                return this;
            }
        }
        return flowScheduleType(value.representation());
    }

    private final DecimalFloat minPriceIncrement = new DecimalFloat();

    private boolean hasMinPriceIncrement;

    public boolean hasMinPriceIncrement()
    {
        return hasMinPriceIncrement;
    }

    public InstrumentEncoder minPriceIncrement(DecimalFloat value)
    {
        minPriceIncrement.set(value);
        hasMinPriceIncrement = true;
        return this;
    }

    public InstrumentEncoder minPriceIncrement(long value, int scale)
    {
        minPriceIncrement.set(value, scale);
        hasMinPriceIncrement = true;
        return this;
    }

    public DecimalFloat minPriceIncrement()
    {
        return minPriceIncrement;
    }

    private final DecimalFloat minPriceIncrementAmount = new DecimalFloat();

    private boolean hasMinPriceIncrementAmount;

    public boolean hasMinPriceIncrementAmount()
    {
        return hasMinPriceIncrementAmount;
    }

    public InstrumentEncoder minPriceIncrementAmount(DecimalFloat value)
    {
        minPriceIncrementAmount.set(value);
        hasMinPriceIncrementAmount = true;
        return this;
    }

    public InstrumentEncoder minPriceIncrementAmount(long value, int scale)
    {
        minPriceIncrementAmount.set(value, scale);
        hasMinPriceIncrementAmount = true;
        return this;
    }

    public DecimalFloat minPriceIncrementAmount()
    {
        return minPriceIncrementAmount;
    }

    private final MutableDirectBuffer unitOfMeasure = new UnsafeBuffer();

    private int unitOfMeasureOffset = 0;

    private int unitOfMeasureLength = 0;

    public InstrumentEncoder unitOfMeasure(final DirectBuffer value, final int offset, final int length)
    {
        unitOfMeasure.wrap(value);
        unitOfMeasureOffset = offset;
        unitOfMeasureLength = length;
        return this;
    }

    public InstrumentEncoder unitOfMeasure(final DirectBuffer value, final int length)
    {
        return unitOfMeasure(value, 0, length);
    }

    public InstrumentEncoder unitOfMeasure(final DirectBuffer value)
    {
        return unitOfMeasure(value, 0, value.capacity());
    }

    public InstrumentEncoder unitOfMeasure(final byte[] value, final int offset, final int length)
    {
        unitOfMeasure.wrap(value);
        unitOfMeasureOffset = offset;
        unitOfMeasureLength = length;
        return this;
    }

    public InstrumentEncoder unitOfMeasureAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(unitOfMeasure, value, offset, length);
        unitOfMeasureOffset = offset;
        unitOfMeasureLength = length;
        return this;
    }

    public InstrumentEncoder unitOfMeasure(final byte[] value, final int length)
    {
        return unitOfMeasure(value, 0, length);
    }

    public InstrumentEncoder unitOfMeasure(final byte[] value)
    {
        return unitOfMeasure(value, 0, value.length);
    }

    public boolean hasUnitOfMeasure()
    {
        return unitOfMeasureLength > 0;
    }

    public MutableDirectBuffer unitOfMeasure()
    {
        return unitOfMeasure;
    }

    public String unitOfMeasureAsString()
    {
        return unitOfMeasure.getStringWithoutLengthAscii(unitOfMeasureOffset, unitOfMeasureLength);
    }

    public InstrumentEncoder unitOfMeasure(final CharSequence value)
    {
        toBytes(value, unitOfMeasure);
        unitOfMeasureOffset = 0;
        unitOfMeasureLength = value.length();
        return this;
    }

    public InstrumentEncoder unitOfMeasure(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            unitOfMeasure.wrap(buffer);
            unitOfMeasureOffset = value.offset();
            unitOfMeasureLength = value.length();
        }
        return this;
    }

    public InstrumentEncoder unitOfMeasure(final char[] value)
    {
        return unitOfMeasure(value, 0, value.length);
    }

    public InstrumentEncoder unitOfMeasure(final char[] value, final int length)
    {
        return unitOfMeasure(value, 0, length);
    }

    public InstrumentEncoder unitOfMeasure(final char[] value, final int offset, final int length)
    {
        toBytes(value, unitOfMeasure, offset, length);
        unitOfMeasureOffset = 0;
        unitOfMeasureLength = length;
        return this;
    }

    public InstrumentEncoder unitOfMeasure(UnitOfMeasure value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == UnitOfMeasure.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: unitOfMeasure Value: " + value );
            }
            if (value == UnitOfMeasure.NULL_VAL)
            {
                return this;
            }
        }
        return unitOfMeasure(value.representation());
    }

    private final DecimalFloat unitOfMeasureQty = new DecimalFloat();

    private boolean hasUnitOfMeasureQty;

    public boolean hasUnitOfMeasureQty()
    {
        return hasUnitOfMeasureQty;
    }

    public InstrumentEncoder unitOfMeasureQty(DecimalFloat value)
    {
        unitOfMeasureQty.set(value);
        hasUnitOfMeasureQty = true;
        return this;
    }

    public InstrumentEncoder unitOfMeasureQty(long value, int scale)
    {
        unitOfMeasureQty.set(value, scale);
        hasUnitOfMeasureQty = true;
        return this;
    }

    public DecimalFloat unitOfMeasureQty()
    {
        return unitOfMeasureQty;
    }

    private final MutableDirectBuffer priceUnitOfMeasure = new UnsafeBuffer();

    private int priceUnitOfMeasureOffset = 0;

    private int priceUnitOfMeasureLength = 0;

    public InstrumentEncoder priceUnitOfMeasure(final DirectBuffer value, final int offset, final int length)
    {
        priceUnitOfMeasure.wrap(value);
        priceUnitOfMeasureOffset = offset;
        priceUnitOfMeasureLength = length;
        return this;
    }

    public InstrumentEncoder priceUnitOfMeasure(final DirectBuffer value, final int length)
    {
        return priceUnitOfMeasure(value, 0, length);
    }

    public InstrumentEncoder priceUnitOfMeasure(final DirectBuffer value)
    {
        return priceUnitOfMeasure(value, 0, value.capacity());
    }

    public InstrumentEncoder priceUnitOfMeasure(final byte[] value, final int offset, final int length)
    {
        priceUnitOfMeasure.wrap(value);
        priceUnitOfMeasureOffset = offset;
        priceUnitOfMeasureLength = length;
        return this;
    }

    public InstrumentEncoder priceUnitOfMeasureAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(priceUnitOfMeasure, value, offset, length);
        priceUnitOfMeasureOffset = offset;
        priceUnitOfMeasureLength = length;
        return this;
    }

    public InstrumentEncoder priceUnitOfMeasure(final byte[] value, final int length)
    {
        return priceUnitOfMeasure(value, 0, length);
    }

    public InstrumentEncoder priceUnitOfMeasure(final byte[] value)
    {
        return priceUnitOfMeasure(value, 0, value.length);
    }

    public boolean hasPriceUnitOfMeasure()
    {
        return priceUnitOfMeasureLength > 0;
    }

    public MutableDirectBuffer priceUnitOfMeasure()
    {
        return priceUnitOfMeasure;
    }

    public String priceUnitOfMeasureAsString()
    {
        return priceUnitOfMeasure.getStringWithoutLengthAscii(priceUnitOfMeasureOffset, priceUnitOfMeasureLength);
    }

    public InstrumentEncoder priceUnitOfMeasure(final CharSequence value)
    {
        toBytes(value, priceUnitOfMeasure);
        priceUnitOfMeasureOffset = 0;
        priceUnitOfMeasureLength = value.length();
        return this;
    }

    public InstrumentEncoder priceUnitOfMeasure(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            priceUnitOfMeasure.wrap(buffer);
            priceUnitOfMeasureOffset = value.offset();
            priceUnitOfMeasureLength = value.length();
        }
        return this;
    }

    public InstrumentEncoder priceUnitOfMeasure(final char[] value)
    {
        return priceUnitOfMeasure(value, 0, value.length);
    }

    public InstrumentEncoder priceUnitOfMeasure(final char[] value, final int length)
    {
        return priceUnitOfMeasure(value, 0, length);
    }

    public InstrumentEncoder priceUnitOfMeasure(final char[] value, final int offset, final int length)
    {
        toBytes(value, priceUnitOfMeasure, offset, length);
        priceUnitOfMeasureOffset = 0;
        priceUnitOfMeasureLength = length;
        return this;
    }

    private final DecimalFloat priceUnitOfMeasureQty = new DecimalFloat();

    private boolean hasPriceUnitOfMeasureQty;

    public boolean hasPriceUnitOfMeasureQty()
    {
        return hasPriceUnitOfMeasureQty;
    }

    public InstrumentEncoder priceUnitOfMeasureQty(DecimalFloat value)
    {
        priceUnitOfMeasureQty.set(value);
        hasPriceUnitOfMeasureQty = true;
        return this;
    }

    public InstrumentEncoder priceUnitOfMeasureQty(long value, int scale)
    {
        priceUnitOfMeasureQty.set(value, scale);
        hasPriceUnitOfMeasureQty = true;
        return this;
    }

    public DecimalFloat priceUnitOfMeasureQty()
    {
        return priceUnitOfMeasureQty;
    }

    private char settlMethod;

    private boolean hasSettlMethod;

    public boolean hasSettlMethod()
    {
        return hasSettlMethod;
    }

    public InstrumentEncoder settlMethod(char value)
    {
        settlMethod = value;
        hasSettlMethod = true;
        return this;
    }

    public char settlMethod()
    {
        return settlMethod;
    }

    public InstrumentEncoder settlMethod(SettlMethod value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == SettlMethod.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: settlMethod Value: " + value );
            }
            if (value == SettlMethod.NULL_VAL)
            {
                return this;
            }
        }
        return settlMethod(value.representation());
    }

    private int exerciseStyle;

    private boolean hasExerciseStyle;

    public boolean hasExerciseStyle()
    {
        return hasExerciseStyle;
    }

    public InstrumentEncoder exerciseStyle(int value)
    {
        exerciseStyle = value;
        hasExerciseStyle = true;
        return this;
    }

    public int exerciseStyle()
    {
        return exerciseStyle;
    }

    public InstrumentEncoder exerciseStyle(ExerciseStyle value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == ExerciseStyle.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: exerciseStyle Value: " + value );
            }
            if (value == ExerciseStyle.NULL_VAL)
            {
                return this;
            }
        }
        return exerciseStyle(value.representation());
    }

    private int optPayoutType;

    private boolean hasOptPayoutType;

    public boolean hasOptPayoutType()
    {
        return hasOptPayoutType;
    }

    public InstrumentEncoder optPayoutType(int value)
    {
        optPayoutType = value;
        hasOptPayoutType = true;
        return this;
    }

    public int optPayoutType()
    {
        return optPayoutType;
    }

    public InstrumentEncoder optPayoutType(OptPayoutType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == OptPayoutType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: optPayoutType Value: " + value );
            }
            if (value == OptPayoutType.NULL_VAL)
            {
                return this;
            }
        }
        return optPayoutType(value.representation());
    }

    private final DecimalFloat optPayoutAmount = new DecimalFloat();

    private boolean hasOptPayoutAmount;

    public boolean hasOptPayoutAmount()
    {
        return hasOptPayoutAmount;
    }

    public InstrumentEncoder optPayoutAmount(DecimalFloat value)
    {
        optPayoutAmount.set(value);
        hasOptPayoutAmount = true;
        return this;
    }

    public InstrumentEncoder optPayoutAmount(long value, int scale)
    {
        optPayoutAmount.set(value, scale);
        hasOptPayoutAmount = true;
        return this;
    }

    public DecimalFloat optPayoutAmount()
    {
        return optPayoutAmount;
    }

    private final MutableDirectBuffer priceQuoteMethod = new UnsafeBuffer();

    private int priceQuoteMethodOffset = 0;

    private int priceQuoteMethodLength = 0;

    public InstrumentEncoder priceQuoteMethod(final DirectBuffer value, final int offset, final int length)
    {
        priceQuoteMethod.wrap(value);
        priceQuoteMethodOffset = offset;
        priceQuoteMethodLength = length;
        return this;
    }

    public InstrumentEncoder priceQuoteMethod(final DirectBuffer value, final int length)
    {
        return priceQuoteMethod(value, 0, length);
    }

    public InstrumentEncoder priceQuoteMethod(final DirectBuffer value)
    {
        return priceQuoteMethod(value, 0, value.capacity());
    }

    public InstrumentEncoder priceQuoteMethod(final byte[] value, final int offset, final int length)
    {
        priceQuoteMethod.wrap(value);
        priceQuoteMethodOffset = offset;
        priceQuoteMethodLength = length;
        return this;
    }

    public InstrumentEncoder priceQuoteMethodAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(priceQuoteMethod, value, offset, length);
        priceQuoteMethodOffset = offset;
        priceQuoteMethodLength = length;
        return this;
    }

    public InstrumentEncoder priceQuoteMethod(final byte[] value, final int length)
    {
        return priceQuoteMethod(value, 0, length);
    }

    public InstrumentEncoder priceQuoteMethod(final byte[] value)
    {
        return priceQuoteMethod(value, 0, value.length);
    }

    public boolean hasPriceQuoteMethod()
    {
        return priceQuoteMethodLength > 0;
    }

    public MutableDirectBuffer priceQuoteMethod()
    {
        return priceQuoteMethod;
    }

    public String priceQuoteMethodAsString()
    {
        return priceQuoteMethod.getStringWithoutLengthAscii(priceQuoteMethodOffset, priceQuoteMethodLength);
    }

    public InstrumentEncoder priceQuoteMethod(final CharSequence value)
    {
        toBytes(value, priceQuoteMethod);
        priceQuoteMethodOffset = 0;
        priceQuoteMethodLength = value.length();
        return this;
    }

    public InstrumentEncoder priceQuoteMethod(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            priceQuoteMethod.wrap(buffer);
            priceQuoteMethodOffset = value.offset();
            priceQuoteMethodLength = value.length();
        }
        return this;
    }

    public InstrumentEncoder priceQuoteMethod(final char[] value)
    {
        return priceQuoteMethod(value, 0, value.length);
    }

    public InstrumentEncoder priceQuoteMethod(final char[] value, final int length)
    {
        return priceQuoteMethod(value, 0, length);
    }

    public InstrumentEncoder priceQuoteMethod(final char[] value, final int offset, final int length)
    {
        toBytes(value, priceQuoteMethod, offset, length);
        priceQuoteMethodOffset = 0;
        priceQuoteMethodLength = length;
        return this;
    }

    public InstrumentEncoder priceQuoteMethod(PriceQuoteMethod value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == PriceQuoteMethod.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: priceQuoteMethod Value: " + value );
            }
            if (value == PriceQuoteMethod.NULL_VAL)
            {
                return this;
            }
        }
        return priceQuoteMethod(value.representation());
    }

    private final MutableDirectBuffer valuationMethod = new UnsafeBuffer();

    private int valuationMethodOffset = 0;

    private int valuationMethodLength = 0;

    public InstrumentEncoder valuationMethod(final DirectBuffer value, final int offset, final int length)
    {
        valuationMethod.wrap(value);
        valuationMethodOffset = offset;
        valuationMethodLength = length;
        return this;
    }

    public InstrumentEncoder valuationMethod(final DirectBuffer value, final int length)
    {
        return valuationMethod(value, 0, length);
    }

    public InstrumentEncoder valuationMethod(final DirectBuffer value)
    {
        return valuationMethod(value, 0, value.capacity());
    }

    public InstrumentEncoder valuationMethod(final byte[] value, final int offset, final int length)
    {
        valuationMethod.wrap(value);
        valuationMethodOffset = offset;
        valuationMethodLength = length;
        return this;
    }

    public InstrumentEncoder valuationMethodAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(valuationMethod, value, offset, length);
        valuationMethodOffset = offset;
        valuationMethodLength = length;
        return this;
    }

    public InstrumentEncoder valuationMethod(final byte[] value, final int length)
    {
        return valuationMethod(value, 0, length);
    }

    public InstrumentEncoder valuationMethod(final byte[] value)
    {
        return valuationMethod(value, 0, value.length);
    }

    public boolean hasValuationMethod()
    {
        return valuationMethodLength > 0;
    }

    public MutableDirectBuffer valuationMethod()
    {
        return valuationMethod;
    }

    public String valuationMethodAsString()
    {
        return valuationMethod.getStringWithoutLengthAscii(valuationMethodOffset, valuationMethodLength);
    }

    public InstrumentEncoder valuationMethod(final CharSequence value)
    {
        toBytes(value, valuationMethod);
        valuationMethodOffset = 0;
        valuationMethodLength = value.length();
        return this;
    }

    public InstrumentEncoder valuationMethod(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            valuationMethod.wrap(buffer);
            valuationMethodOffset = value.offset();
            valuationMethodLength = value.length();
        }
        return this;
    }

    public InstrumentEncoder valuationMethod(final char[] value)
    {
        return valuationMethod(value, 0, value.length);
    }

    public InstrumentEncoder valuationMethod(final char[] value, final int length)
    {
        return valuationMethod(value, 0, length);
    }

    public InstrumentEncoder valuationMethod(final char[] value, final int offset, final int length)
    {
        toBytes(value, valuationMethod, offset, length);
        valuationMethodOffset = 0;
        valuationMethodLength = length;
        return this;
    }

    public InstrumentEncoder valuationMethod(ValuationMethod value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == ValuationMethod.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: valuationMethod Value: " + value );
            }
            if (value == ValuationMethod.NULL_VAL)
            {
                return this;
            }
        }
        return valuationMethod(value.representation());
    }

    private int listMethod;

    private boolean hasListMethod;

    public boolean hasListMethod()
    {
        return hasListMethod;
    }

    public InstrumentEncoder listMethod(int value)
    {
        listMethod = value;
        hasListMethod = true;
        return this;
    }

    public int listMethod()
    {
        return listMethod;
    }

    public InstrumentEncoder listMethod(ListMethod value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == ListMethod.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: listMethod Value: " + value );
            }
            if (value == ListMethod.NULL_VAL)
            {
                return this;
            }
        }
        return listMethod(value.representation());
    }

    private final DecimalFloat capPrice = new DecimalFloat();

    private boolean hasCapPrice;

    public boolean hasCapPrice()
    {
        return hasCapPrice;
    }

    public InstrumentEncoder capPrice(DecimalFloat value)
    {
        capPrice.set(value);
        hasCapPrice = true;
        return this;
    }

    public InstrumentEncoder capPrice(long value, int scale)
    {
        capPrice.set(value, scale);
        hasCapPrice = true;
        return this;
    }

    public DecimalFloat capPrice()
    {
        return capPrice;
    }

    private final DecimalFloat floorPrice = new DecimalFloat();

    private boolean hasFloorPrice;

    public boolean hasFloorPrice()
    {
        return hasFloorPrice;
    }

    public InstrumentEncoder floorPrice(DecimalFloat value)
    {
        floorPrice.set(value);
        hasFloorPrice = true;
        return this;
    }

    public InstrumentEncoder floorPrice(long value, int scale)
    {
        floorPrice.set(value, scale);
        hasFloorPrice = true;
        return this;
    }

    public DecimalFloat floorPrice()
    {
        return floorPrice;
    }

    private int putOrCall;

    private boolean hasPutOrCall;

    public boolean hasPutOrCall()
    {
        return hasPutOrCall;
    }

    public InstrumentEncoder putOrCall(int value)
    {
        putOrCall = value;
        hasPutOrCall = true;
        return this;
    }

    public int putOrCall()
    {
        return putOrCall;
    }

    public InstrumentEncoder putOrCall(PutOrCall value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == PutOrCall.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: putOrCall Value: " + value );
            }
            if (value == PutOrCall.NULL_VAL)
            {
                return this;
            }
        }
        return putOrCall(value.representation());
    }

    private boolean flexibleIndicator;

    private boolean hasFlexibleIndicator;

    public boolean hasFlexibleIndicator()
    {
        return hasFlexibleIndicator;
    }

    public InstrumentEncoder flexibleIndicator(boolean value)
    {
        flexibleIndicator = value;
        hasFlexibleIndicator = true;
        return this;
    }

    public boolean flexibleIndicator()
    {
        return flexibleIndicator;
    }

    private boolean flexProductEligibilityIndicator;

    private boolean hasFlexProductEligibilityIndicator;

    public boolean hasFlexProductEligibilityIndicator()
    {
        return hasFlexProductEligibilityIndicator;
    }

    public InstrumentEncoder flexProductEligibilityIndicator(boolean value)
    {
        flexProductEligibilityIndicator = value;
        hasFlexProductEligibilityIndicator = true;
        return this;
    }

    public boolean flexProductEligibilityIndicator()
    {
        return flexProductEligibilityIndicator;
    }

    private final MutableDirectBuffer timeUnit = new UnsafeBuffer();

    private int timeUnitOffset = 0;

    private int timeUnitLength = 0;

    public InstrumentEncoder timeUnit(final DirectBuffer value, final int offset, final int length)
    {
        timeUnit.wrap(value);
        timeUnitOffset = offset;
        timeUnitLength = length;
        return this;
    }

    public InstrumentEncoder timeUnit(final DirectBuffer value, final int length)
    {
        return timeUnit(value, 0, length);
    }

    public InstrumentEncoder timeUnit(final DirectBuffer value)
    {
        return timeUnit(value, 0, value.capacity());
    }

    public InstrumentEncoder timeUnit(final byte[] value, final int offset, final int length)
    {
        timeUnit.wrap(value);
        timeUnitOffset = offset;
        timeUnitLength = length;
        return this;
    }

    public InstrumentEncoder timeUnitAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(timeUnit, value, offset, length);
        timeUnitOffset = offset;
        timeUnitLength = length;
        return this;
    }

    public InstrumentEncoder timeUnit(final byte[] value, final int length)
    {
        return timeUnit(value, 0, length);
    }

    public InstrumentEncoder timeUnit(final byte[] value)
    {
        return timeUnit(value, 0, value.length);
    }

    public boolean hasTimeUnit()
    {
        return timeUnitLength > 0;
    }

    public MutableDirectBuffer timeUnit()
    {
        return timeUnit;
    }

    public String timeUnitAsString()
    {
        return timeUnit.getStringWithoutLengthAscii(timeUnitOffset, timeUnitLength);
    }

    public InstrumentEncoder timeUnit(final CharSequence value)
    {
        toBytes(value, timeUnit);
        timeUnitOffset = 0;
        timeUnitLength = value.length();
        return this;
    }

    public InstrumentEncoder timeUnit(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            timeUnit.wrap(buffer);
            timeUnitOffset = value.offset();
            timeUnitLength = value.length();
        }
        return this;
    }

    public InstrumentEncoder timeUnit(final char[] value)
    {
        return timeUnit(value, 0, value.length);
    }

    public InstrumentEncoder timeUnit(final char[] value, final int length)
    {
        return timeUnit(value, 0, length);
    }

    public InstrumentEncoder timeUnit(final char[] value, final int offset, final int length)
    {
        toBytes(value, timeUnit, offset, length);
        timeUnitOffset = 0;
        timeUnitLength = length;
        return this;
    }

    public InstrumentEncoder timeUnit(TimeUnit value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == TimeUnit.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: timeUnit Value: " + value );
            }
            if (value == TimeUnit.NULL_VAL)
            {
                return this;
            }
        }
        return timeUnit(value.representation());
    }

    private final DecimalFloat couponRate = new DecimalFloat();

    private boolean hasCouponRate;

    public boolean hasCouponRate()
    {
        return hasCouponRate;
    }

    public InstrumentEncoder couponRate(DecimalFloat value)
    {
        couponRate.set(value);
        hasCouponRate = true;
        return this;
    }

    public InstrumentEncoder couponRate(long value, int scale)
    {
        couponRate.set(value, scale);
        hasCouponRate = true;
        return this;
    }

    public DecimalFloat couponRate()
    {
        return couponRate;
    }

    private final MutableDirectBuffer securityExchange = new UnsafeBuffer();

    private int securityExchangeOffset = 0;

    private int securityExchangeLength = 0;

    public InstrumentEncoder securityExchange(final DirectBuffer value, final int offset, final int length)
    {
        securityExchange.wrap(value);
        securityExchangeOffset = offset;
        securityExchangeLength = length;
        return this;
    }

    public InstrumentEncoder securityExchange(final DirectBuffer value, final int length)
    {
        return securityExchange(value, 0, length);
    }

    public InstrumentEncoder securityExchange(final DirectBuffer value)
    {
        return securityExchange(value, 0, value.capacity());
    }

    public InstrumentEncoder securityExchange(final byte[] value, final int offset, final int length)
    {
        securityExchange.wrap(value);
        securityExchangeOffset = offset;
        securityExchangeLength = length;
        return this;
    }

    public InstrumentEncoder securityExchangeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(securityExchange, value, offset, length);
        securityExchangeOffset = offset;
        securityExchangeLength = length;
        return this;
    }

    public InstrumentEncoder securityExchange(final byte[] value, final int length)
    {
        return securityExchange(value, 0, length);
    }

    public InstrumentEncoder securityExchange(final byte[] value)
    {
        return securityExchange(value, 0, value.length);
    }

    public boolean hasSecurityExchange()
    {
        return securityExchangeLength > 0;
    }

    public MutableDirectBuffer securityExchange()
    {
        return securityExchange;
    }

    public String securityExchangeAsString()
    {
        return securityExchange.getStringWithoutLengthAscii(securityExchangeOffset, securityExchangeLength);
    }

    public InstrumentEncoder securityExchange(final CharSequence value)
    {
        toBytes(value, securityExchange);
        securityExchangeOffset = 0;
        securityExchangeLength = value.length();
        return this;
    }

    public InstrumentEncoder securityExchange(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            securityExchange.wrap(buffer);
            securityExchangeOffset = value.offset();
            securityExchangeLength = value.length();
        }
        return this;
    }

    public InstrumentEncoder securityExchange(final char[] value)
    {
        return securityExchange(value, 0, value.length);
    }

    public InstrumentEncoder securityExchange(final char[] value, final int length)
    {
        return securityExchange(value, 0, length);
    }

    public InstrumentEncoder securityExchange(final char[] value, final int offset, final int length)
    {
        toBytes(value, securityExchange, offset, length);
        securityExchangeOffset = 0;
        securityExchangeLength = length;
        return this;
    }

    private int positionLimit;

    private boolean hasPositionLimit;

    public boolean hasPositionLimit()
    {
        return hasPositionLimit;
    }

    public InstrumentEncoder positionLimit(int value)
    {
        positionLimit = value;
        hasPositionLimit = true;
        return this;
    }

    public int positionLimit()
    {
        return positionLimit;
    }

    private int nTPositionLimit;

    private boolean hasNTPositionLimit;

    public boolean hasNTPositionLimit()
    {
        return hasNTPositionLimit;
    }

    public InstrumentEncoder nTPositionLimit(int value)
    {
        nTPositionLimit = value;
        hasNTPositionLimit = true;
        return this;
    }

    public int nTPositionLimit()
    {
        return nTPositionLimit;
    }

    private final MutableDirectBuffer issuer = new UnsafeBuffer();

    private int issuerOffset = 0;

    private int issuerLength = 0;

    public InstrumentEncoder issuer(final DirectBuffer value, final int offset, final int length)
    {
        issuer.wrap(value);
        issuerOffset = offset;
        issuerLength = length;
        return this;
    }

    public InstrumentEncoder issuer(final DirectBuffer value, final int length)
    {
        return issuer(value, 0, length);
    }

    public InstrumentEncoder issuer(final DirectBuffer value)
    {
        return issuer(value, 0, value.capacity());
    }

    public InstrumentEncoder issuer(final byte[] value, final int offset, final int length)
    {
        issuer.wrap(value);
        issuerOffset = offset;
        issuerLength = length;
        return this;
    }

    public InstrumentEncoder issuerAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(issuer, value, offset, length);
        issuerOffset = offset;
        issuerLength = length;
        return this;
    }

    public InstrumentEncoder issuer(final byte[] value, final int length)
    {
        return issuer(value, 0, length);
    }

    public InstrumentEncoder issuer(final byte[] value)
    {
        return issuer(value, 0, value.length);
    }

    public boolean hasIssuer()
    {
        return issuerLength > 0;
    }

    public MutableDirectBuffer issuer()
    {
        return issuer;
    }

    public String issuerAsString()
    {
        return issuer.getStringWithoutLengthAscii(issuerOffset, issuerLength);
    }

    public InstrumentEncoder issuer(final CharSequence value)
    {
        toBytes(value, issuer);
        issuerOffset = 0;
        issuerLength = value.length();
        return this;
    }

    public InstrumentEncoder issuer(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            issuer.wrap(buffer);
            issuerOffset = value.offset();
            issuerLength = value.length();
        }
        return this;
    }

    public InstrumentEncoder issuer(final char[] value)
    {
        return issuer(value, 0, value.length);
    }

    public InstrumentEncoder issuer(final char[] value, final int length)
    {
        return issuer(value, 0, length);
    }

    public InstrumentEncoder issuer(final char[] value, final int offset, final int length)
    {
        toBytes(value, issuer, offset, length);
        issuerOffset = 0;
        issuerLength = length;
        return this;
    }

    private int encodedIssuerLen;

    private boolean hasEncodedIssuerLen;

    public boolean hasEncodedIssuerLen()
    {
        return hasEncodedIssuerLen;
    }

    public InstrumentEncoder encodedIssuerLen(int value)
    {
        encodedIssuerLen = value;
        hasEncodedIssuerLen = true;
        return this;
    }

    public int encodedIssuerLen()
    {
        return encodedIssuerLen;
    }

    private byte[] encodedIssuer;

    private boolean hasEncodedIssuer;

    public boolean hasEncodedIssuer()
    {
        return hasEncodedIssuer;
    }

    public InstrumentEncoder encodedIssuer(byte[] value)
    {
        encodedIssuer = value;
        hasEncodedIssuer = true;
        return this;
    }

    public byte[] encodedIssuer()
    {
        return encodedIssuer;
    }

    public InstrumentEncoder encodedIssuerAsCopy(final byte[] value, final int offset, final int length)
    {
        encodedIssuer = copyInto(encodedIssuer, value, offset, length);
        hasEncodedIssuer = true;
        return this;
    }

    private final MutableDirectBuffer securityDesc = new UnsafeBuffer();

    private int securityDescOffset = 0;

    private int securityDescLength = 0;

    public InstrumentEncoder securityDesc(final DirectBuffer value, final int offset, final int length)
    {
        securityDesc.wrap(value);
        securityDescOffset = offset;
        securityDescLength = length;
        return this;
    }

    public InstrumentEncoder securityDesc(final DirectBuffer value, final int length)
    {
        return securityDesc(value, 0, length);
    }

    public InstrumentEncoder securityDesc(final DirectBuffer value)
    {
        return securityDesc(value, 0, value.capacity());
    }

    public InstrumentEncoder securityDesc(final byte[] value, final int offset, final int length)
    {
        securityDesc.wrap(value);
        securityDescOffset = offset;
        securityDescLength = length;
        return this;
    }

    public InstrumentEncoder securityDescAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(securityDesc, value, offset, length);
        securityDescOffset = offset;
        securityDescLength = length;
        return this;
    }

    public InstrumentEncoder securityDesc(final byte[] value, final int length)
    {
        return securityDesc(value, 0, length);
    }

    public InstrumentEncoder securityDesc(final byte[] value)
    {
        return securityDesc(value, 0, value.length);
    }

    public boolean hasSecurityDesc()
    {
        return securityDescLength > 0;
    }

    public MutableDirectBuffer securityDesc()
    {
        return securityDesc;
    }

    public String securityDescAsString()
    {
        return securityDesc.getStringWithoutLengthAscii(securityDescOffset, securityDescLength);
    }

    public InstrumentEncoder securityDesc(final CharSequence value)
    {
        toBytes(value, securityDesc);
        securityDescOffset = 0;
        securityDescLength = value.length();
        return this;
    }

    public InstrumentEncoder securityDesc(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            securityDesc.wrap(buffer);
            securityDescOffset = value.offset();
            securityDescLength = value.length();
        }
        return this;
    }

    public InstrumentEncoder securityDesc(final char[] value)
    {
        return securityDesc(value, 0, value.length);
    }

    public InstrumentEncoder securityDesc(final char[] value, final int length)
    {
        return securityDesc(value, 0, length);
    }

    public InstrumentEncoder securityDesc(final char[] value, final int offset, final int length)
    {
        toBytes(value, securityDesc, offset, length);
        securityDescOffset = 0;
        securityDescLength = length;
        return this;
    }

    private int encodedSecurityDescLen;

    private boolean hasEncodedSecurityDescLen;

    public boolean hasEncodedSecurityDescLen()
    {
        return hasEncodedSecurityDescLen;
    }

    public InstrumentEncoder encodedSecurityDescLen(int value)
    {
        encodedSecurityDescLen = value;
        hasEncodedSecurityDescLen = true;
        return this;
    }

    public int encodedSecurityDescLen()
    {
        return encodedSecurityDescLen;
    }

    private byte[] encodedSecurityDesc;

    private boolean hasEncodedSecurityDesc;

    public boolean hasEncodedSecurityDesc()
    {
        return hasEncodedSecurityDesc;
    }

    public InstrumentEncoder encodedSecurityDesc(byte[] value)
    {
        encodedSecurityDesc = value;
        hasEncodedSecurityDesc = true;
        return this;
    }

    public byte[] encodedSecurityDesc()
    {
        return encodedSecurityDesc;
    }

    public InstrumentEncoder encodedSecurityDescAsCopy(final byte[] value, final int offset, final int length)
    {
        encodedSecurityDesc = copyInto(encodedSecurityDesc, value, offset, length);
        hasEncodedSecurityDesc = true;
        return this;
    }

    private final SecurityXMLEncoder securityXML = new SecurityXMLEncoder();
    public SecurityXMLEncoder securityXML()
    {
        return securityXML;
    }

    private final MutableDirectBuffer pool = new UnsafeBuffer();

    private int poolOffset = 0;

    private int poolLength = 0;

    public InstrumentEncoder pool(final DirectBuffer value, final int offset, final int length)
    {
        pool.wrap(value);
        poolOffset = offset;
        poolLength = length;
        return this;
    }

    public InstrumentEncoder pool(final DirectBuffer value, final int length)
    {
        return pool(value, 0, length);
    }

    public InstrumentEncoder pool(final DirectBuffer value)
    {
        return pool(value, 0, value.capacity());
    }

    public InstrumentEncoder pool(final byte[] value, final int offset, final int length)
    {
        pool.wrap(value);
        poolOffset = offset;
        poolLength = length;
        return this;
    }

    public InstrumentEncoder poolAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(pool, value, offset, length);
        poolOffset = offset;
        poolLength = length;
        return this;
    }

    public InstrumentEncoder pool(final byte[] value, final int length)
    {
        return pool(value, 0, length);
    }

    public InstrumentEncoder pool(final byte[] value)
    {
        return pool(value, 0, value.length);
    }

    public boolean hasPool()
    {
        return poolLength > 0;
    }

    public MutableDirectBuffer pool()
    {
        return pool;
    }

    public String poolAsString()
    {
        return pool.getStringWithoutLengthAscii(poolOffset, poolLength);
    }

    public InstrumentEncoder pool(final CharSequence value)
    {
        toBytes(value, pool);
        poolOffset = 0;
        poolLength = value.length();
        return this;
    }

    public InstrumentEncoder pool(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            pool.wrap(buffer);
            poolOffset = value.offset();
            poolLength = value.length();
        }
        return this;
    }

    public InstrumentEncoder pool(final char[] value)
    {
        return pool(value, 0, value.length);
    }

    public InstrumentEncoder pool(final char[] value, final int length)
    {
        return pool(value, 0, length);
    }

    public InstrumentEncoder pool(final char[] value, final int offset, final int length)
    {
        toBytes(value, pool, offset, length);
        poolOffset = 0;
        poolLength = length;
        return this;
    }

    private final MutableDirectBuffer contractSettlMonth = new UnsafeBuffer();

    private int contractSettlMonthOffset = 0;

    private int contractSettlMonthLength = 0;

    public InstrumentEncoder contractSettlMonth(final DirectBuffer value, final int offset, final int length)
    {
        contractSettlMonth.wrap(value);
        contractSettlMonthOffset = offset;
        contractSettlMonthLength = length;
        return this;
    }

    public InstrumentEncoder contractSettlMonth(final DirectBuffer value, final int length)
    {
        return contractSettlMonth(value, 0, length);
    }

    public InstrumentEncoder contractSettlMonth(final DirectBuffer value)
    {
        return contractSettlMonth(value, 0, value.capacity());
    }

    public InstrumentEncoder contractSettlMonth(final byte[] value, final int offset, final int length)
    {
        contractSettlMonth.wrap(value);
        contractSettlMonthOffset = offset;
        contractSettlMonthLength = length;
        return this;
    }

    public InstrumentEncoder contractSettlMonthAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(contractSettlMonth, value, offset, length);
        contractSettlMonthOffset = offset;
        contractSettlMonthLength = length;
        return this;
    }

    public InstrumentEncoder contractSettlMonth(final byte[] value, final int length)
    {
        return contractSettlMonth(value, 0, length);
    }

    public InstrumentEncoder contractSettlMonth(final byte[] value)
    {
        return contractSettlMonth(value, 0, value.length);
    }

    public boolean hasContractSettlMonth()
    {
        return contractSettlMonthLength > 0;
    }

    public MutableDirectBuffer contractSettlMonth()
    {
        return contractSettlMonth;
    }

    public String contractSettlMonthAsString()
    {
        return contractSettlMonth.getStringWithoutLengthAscii(contractSettlMonthOffset, contractSettlMonthLength);
    }

    private int cPProgram;

    private boolean hasCPProgram;

    public boolean hasCPProgram()
    {
        return hasCPProgram;
    }

    public InstrumentEncoder cPProgram(int value)
    {
        cPProgram = value;
        hasCPProgram = true;
        return this;
    }

    public int cPProgram()
    {
        return cPProgram;
    }

    public InstrumentEncoder cPProgram(CPProgram value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == CPProgram.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: cPProgram Value: " + value );
            }
            if (value == CPProgram.NULL_VAL)
            {
                return this;
            }
        }
        return cPProgram(value.representation());
    }

    private final MutableDirectBuffer cPRegType = new UnsafeBuffer();

    private int cPRegTypeOffset = 0;

    private int cPRegTypeLength = 0;

    public InstrumentEncoder cPRegType(final DirectBuffer value, final int offset, final int length)
    {
        cPRegType.wrap(value);
        cPRegTypeOffset = offset;
        cPRegTypeLength = length;
        return this;
    }

    public InstrumentEncoder cPRegType(final DirectBuffer value, final int length)
    {
        return cPRegType(value, 0, length);
    }

    public InstrumentEncoder cPRegType(final DirectBuffer value)
    {
        return cPRegType(value, 0, value.capacity());
    }

    public InstrumentEncoder cPRegType(final byte[] value, final int offset, final int length)
    {
        cPRegType.wrap(value);
        cPRegTypeOffset = offset;
        cPRegTypeLength = length;
        return this;
    }

    public InstrumentEncoder cPRegTypeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(cPRegType, value, offset, length);
        cPRegTypeOffset = offset;
        cPRegTypeLength = length;
        return this;
    }

    public InstrumentEncoder cPRegType(final byte[] value, final int length)
    {
        return cPRegType(value, 0, length);
    }

    public InstrumentEncoder cPRegType(final byte[] value)
    {
        return cPRegType(value, 0, value.length);
    }

    public boolean hasCPRegType()
    {
        return cPRegTypeLength > 0;
    }

    public MutableDirectBuffer cPRegType()
    {
        return cPRegType;
    }

    public String cPRegTypeAsString()
    {
        return cPRegType.getStringWithoutLengthAscii(cPRegTypeOffset, cPRegTypeLength);
    }

    public InstrumentEncoder cPRegType(final CharSequence value)
    {
        toBytes(value, cPRegType);
        cPRegTypeOffset = 0;
        cPRegTypeLength = value.length();
        return this;
    }

    public InstrumentEncoder cPRegType(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            cPRegType.wrap(buffer);
            cPRegTypeOffset = value.offset();
            cPRegTypeLength = value.length();
        }
        return this;
    }

    public InstrumentEncoder cPRegType(final char[] value)
    {
        return cPRegType(value, 0, value.length);
    }

    public InstrumentEncoder cPRegType(final char[] value, final int length)
    {
        return cPRegType(value, 0, length);
    }

    public InstrumentEncoder cPRegType(final char[] value, final int offset, final int length)
    {
        toBytes(value, cPRegType, offset, length);
        cPRegTypeOffset = 0;
        cPRegTypeLength = length;
        return this;
    }

    private final EvntGrpEncoder evntGrp = new EvntGrpEncoder();
    public EvntGrpEncoder evntGrp()
    {
        return evntGrp;
    }

    private final MutableDirectBuffer datedDate = new UnsafeBuffer();

    private int datedDateOffset = 0;

    private int datedDateLength = 0;

    public InstrumentEncoder datedDate(final DirectBuffer value, final int offset, final int length)
    {
        datedDate.wrap(value);
        datedDateOffset = offset;
        datedDateLength = length;
        return this;
    }

    public InstrumentEncoder datedDate(final DirectBuffer value, final int length)
    {
        return datedDate(value, 0, length);
    }

    public InstrumentEncoder datedDate(final DirectBuffer value)
    {
        return datedDate(value, 0, value.capacity());
    }

    public InstrumentEncoder datedDate(final byte[] value, final int offset, final int length)
    {
        datedDate.wrap(value);
        datedDateOffset = offset;
        datedDateLength = length;
        return this;
    }

    public InstrumentEncoder datedDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(datedDate, value, offset, length);
        datedDateOffset = offset;
        datedDateLength = length;
        return this;
    }

    public InstrumentEncoder datedDate(final byte[] value, final int length)
    {
        return datedDate(value, 0, length);
    }

    public InstrumentEncoder datedDate(final byte[] value)
    {
        return datedDate(value, 0, value.length);
    }

    public boolean hasDatedDate()
    {
        return datedDateLength > 0;
    }

    public MutableDirectBuffer datedDate()
    {
        return datedDate;
    }

    public String datedDateAsString()
    {
        return datedDate.getStringWithoutLengthAscii(datedDateOffset, datedDateLength);
    }

    private final MutableDirectBuffer interestAccrualDate = new UnsafeBuffer();

    private int interestAccrualDateOffset = 0;

    private int interestAccrualDateLength = 0;

    public InstrumentEncoder interestAccrualDate(final DirectBuffer value, final int offset, final int length)
    {
        interestAccrualDate.wrap(value);
        interestAccrualDateOffset = offset;
        interestAccrualDateLength = length;
        return this;
    }

    public InstrumentEncoder interestAccrualDate(final DirectBuffer value, final int length)
    {
        return interestAccrualDate(value, 0, length);
    }

    public InstrumentEncoder interestAccrualDate(final DirectBuffer value)
    {
        return interestAccrualDate(value, 0, value.capacity());
    }

    public InstrumentEncoder interestAccrualDate(final byte[] value, final int offset, final int length)
    {
        interestAccrualDate.wrap(value);
        interestAccrualDateOffset = offset;
        interestAccrualDateLength = length;
        return this;
    }

    public InstrumentEncoder interestAccrualDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(interestAccrualDate, value, offset, length);
        interestAccrualDateOffset = offset;
        interestAccrualDateLength = length;
        return this;
    }

    public InstrumentEncoder interestAccrualDate(final byte[] value, final int length)
    {
        return interestAccrualDate(value, 0, length);
    }

    public InstrumentEncoder interestAccrualDate(final byte[] value)
    {
        return interestAccrualDate(value, 0, value.length);
    }

    public boolean hasInterestAccrualDate()
    {
        return interestAccrualDateLength > 0;
    }

    public MutableDirectBuffer interestAccrualDate()
    {
        return interestAccrualDate;
    }

    public String interestAccrualDateAsString()
    {
        return interestAccrualDate.getStringWithoutLengthAscii(interestAccrualDateOffset, interestAccrualDateLength);
    }

    private final InstrumentPartiesEncoder instrumentParties = new InstrumentPartiesEncoder();
    public InstrumentPartiesEncoder instrumentParties()
    {
        return instrumentParties;
    }

    private final ComplexEventsEncoder complexEvents = new ComplexEventsEncoder();
    public ComplexEventsEncoder complexEvents()
    {
        return complexEvents;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (symbolLength > 0)
        {
            buffer.putBytes(position, symbolHeader, 0, symbolHeaderLength);
            position += symbolHeaderLength;
            buffer.putBytes(position, symbol, symbolOffset, symbolLength);
            position += symbolLength;
            buffer.putSeparator(position);
            position++;
        }

        if (symbolSfxLength > 0)
        {
            buffer.putBytes(position, symbolSfxHeader, 0, symbolSfxHeaderLength);
            position += symbolSfxHeaderLength;
            buffer.putBytes(position, symbolSfx, symbolSfxOffset, symbolSfxLength);
            position += symbolSfxLength;
            buffer.putSeparator(position);
            position++;
        }

        if (securityIDLength > 0)
        {
            buffer.putBytes(position, securityIDHeader, 0, securityIDHeaderLength);
            position += securityIDHeaderLength;
            buffer.putBytes(position, securityID, securityIDOffset, securityIDLength);
            position += securityIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (securityIDSourceLength > 0)
        {
            buffer.putBytes(position, securityIDSourceHeader, 0, securityIDSourceHeaderLength);
            position += securityIDSourceHeaderLength;
            buffer.putBytes(position, securityIDSource, securityIDSourceOffset, securityIDSourceLength);
            position += securityIDSourceLength;
            buffer.putSeparator(position);
            position++;
        }

            position += secAltIDGrp.encode(buffer, position);

        if (hasProduct)
        {
            buffer.putBytes(position, productHeader, 0, productHeaderLength);
            position += productHeaderLength;
            position += buffer.putIntAscii(position, product);
            buffer.putSeparator(position);
            position++;
        }

        if (productComplexLength > 0)
        {
            buffer.putBytes(position, productComplexHeader, 0, productComplexHeaderLength);
            position += productComplexHeaderLength;
            buffer.putBytes(position, productComplex, productComplexOffset, productComplexLength);
            position += productComplexLength;
            buffer.putSeparator(position);
            position++;
        }

        if (securityGroupLength > 0)
        {
            buffer.putBytes(position, securityGroupHeader, 0, securityGroupHeaderLength);
            position += securityGroupHeaderLength;
            buffer.putBytes(position, securityGroup, securityGroupOffset, securityGroupLength);
            position += securityGroupLength;
            buffer.putSeparator(position);
            position++;
        }

        if (cFICodeLength > 0)
        {
            buffer.putBytes(position, cFICodeHeader, 0, cFICodeHeaderLength);
            position += cFICodeHeaderLength;
            buffer.putBytes(position, cFICode, cFICodeOffset, cFICodeLength);
            position += cFICodeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (securityTypeLength > 0)
        {
            buffer.putBytes(position, securityTypeHeader, 0, securityTypeHeaderLength);
            position += securityTypeHeaderLength;
            buffer.putBytes(position, securityType, securityTypeOffset, securityTypeLength);
            position += securityTypeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (securitySubTypeLength > 0)
        {
            buffer.putBytes(position, securitySubTypeHeader, 0, securitySubTypeHeaderLength);
            position += securitySubTypeHeaderLength;
            buffer.putBytes(position, securitySubType, securitySubTypeOffset, securitySubTypeLength);
            position += securitySubTypeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (maturityMonthYearLength > 0)
        {
            buffer.putBytes(position, maturityMonthYearHeader, 0, maturityMonthYearHeaderLength);
            position += maturityMonthYearHeaderLength;
            buffer.putBytes(position, maturityMonthYear, maturityMonthYearOffset, maturityMonthYearLength);
            position += maturityMonthYearLength;
            buffer.putSeparator(position);
            position++;
        }

        if (maturityDateLength > 0)
        {
            buffer.putBytes(position, maturityDateHeader, 0, maturityDateHeaderLength);
            position += maturityDateHeaderLength;
            buffer.putBytes(position, maturityDate, maturityDateOffset, maturityDateLength);
            position += maturityDateLength;
            buffer.putSeparator(position);
            position++;
        }

        if (maturityTimeLength > 0)
        {
            buffer.putBytes(position, maturityTimeHeader, 0, maturityTimeHeaderLength);
            position += maturityTimeHeaderLength;
            buffer.putBytes(position, maturityTime, maturityTimeOffset, maturityTimeLength);
            position += maturityTimeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (settleOnOpenFlagLength > 0)
        {
            buffer.putBytes(position, settleOnOpenFlagHeader, 0, settleOnOpenFlagHeaderLength);
            position += settleOnOpenFlagHeaderLength;
            buffer.putBytes(position, settleOnOpenFlag, settleOnOpenFlagOffset, settleOnOpenFlagLength);
            position += settleOnOpenFlagLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasInstrmtAssignmentMethod)
        {
            buffer.putBytes(position, instrmtAssignmentMethodHeader, 0, instrmtAssignmentMethodHeaderLength);
            position += instrmtAssignmentMethodHeaderLength;
            position += buffer.putCharAscii(position, instrmtAssignmentMethod);
            buffer.putSeparator(position);
            position++;
        }

        if (securityStatusLength > 0)
        {
            buffer.putBytes(position, securityStatusHeader, 0, securityStatusHeaderLength);
            position += securityStatusHeaderLength;
            buffer.putBytes(position, securityStatus, securityStatusOffset, securityStatusLength);
            position += securityStatusLength;
            buffer.putSeparator(position);
            position++;
        }

        if (couponPaymentDateLength > 0)
        {
            buffer.putBytes(position, couponPaymentDateHeader, 0, couponPaymentDateHeaderLength);
            position += couponPaymentDateHeaderLength;
            buffer.putBytes(position, couponPaymentDate, couponPaymentDateOffset, couponPaymentDateLength);
            position += couponPaymentDateLength;
            buffer.putSeparator(position);
            position++;
        }

        if (restructuringTypeLength > 0)
        {
            buffer.putBytes(position, restructuringTypeHeader, 0, restructuringTypeHeaderLength);
            position += restructuringTypeHeaderLength;
            buffer.putBytes(position, restructuringType, restructuringTypeOffset, restructuringTypeLength);
            position += restructuringTypeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (seniorityLength > 0)
        {
            buffer.putBytes(position, seniorityHeader, 0, seniorityHeaderLength);
            position += seniorityHeaderLength;
            buffer.putBytes(position, seniority, seniorityOffset, seniorityLength);
            position += seniorityLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasNotionalPercentageOutstanding)
        {
            buffer.putBytes(position, notionalPercentageOutstandingHeader, 0, notionalPercentageOutstandingHeaderLength);
            position += notionalPercentageOutstandingHeaderLength;
            position += buffer.putFloatAscii(position, notionalPercentageOutstanding);
            buffer.putSeparator(position);
            position++;
        }

        if (hasOriginalNotionalPercentageOutstanding)
        {
            buffer.putBytes(position, originalNotionalPercentageOutstandingHeader, 0, originalNotionalPercentageOutstandingHeaderLength);
            position += originalNotionalPercentageOutstandingHeaderLength;
            position += buffer.putFloatAscii(position, originalNotionalPercentageOutstanding);
            buffer.putSeparator(position);
            position++;
        }

        if (hasAttachmentPoint)
        {
            buffer.putBytes(position, attachmentPointHeader, 0, attachmentPointHeaderLength);
            position += attachmentPointHeaderLength;
            position += buffer.putFloatAscii(position, attachmentPoint);
            buffer.putSeparator(position);
            position++;
        }

        if (hasDetachmentPoint)
        {
            buffer.putBytes(position, detachmentPointHeader, 0, detachmentPointHeaderLength);
            position += detachmentPointHeaderLength;
            position += buffer.putFloatAscii(position, detachmentPoint);
            buffer.putSeparator(position);
            position++;
        }

        if (issueDateLength > 0)
        {
            buffer.putBytes(position, issueDateHeader, 0, issueDateHeaderLength);
            position += issueDateHeaderLength;
            buffer.putBytes(position, issueDate, issueDateOffset, issueDateLength);
            position += issueDateLength;
            buffer.putSeparator(position);
            position++;
        }

        if (repoCollateralSecurityTypeLength > 0)
        {
            buffer.putBytes(position, repoCollateralSecurityTypeHeader, 0, repoCollateralSecurityTypeHeaderLength);
            position += repoCollateralSecurityTypeHeaderLength;
            buffer.putBytes(position, repoCollateralSecurityType, repoCollateralSecurityTypeOffset, repoCollateralSecurityTypeLength);
            position += repoCollateralSecurityTypeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasRepurchaseTerm)
        {
            buffer.putBytes(position, repurchaseTermHeader, 0, repurchaseTermHeaderLength);
            position += repurchaseTermHeaderLength;
            position += buffer.putIntAscii(position, repurchaseTerm);
            buffer.putSeparator(position);
            position++;
        }

        if (hasRepurchaseRate)
        {
            buffer.putBytes(position, repurchaseRateHeader, 0, repurchaseRateHeaderLength);
            position += repurchaseRateHeaderLength;
            position += buffer.putFloatAscii(position, repurchaseRate);
            buffer.putSeparator(position);
            position++;
        }

        if (hasFactor)
        {
            buffer.putBytes(position, factorHeader, 0, factorHeaderLength);
            position += factorHeaderLength;
            position += buffer.putFloatAscii(position, factor);
            buffer.putSeparator(position);
            position++;
        }

        if (creditRatingLength > 0)
        {
            buffer.putBytes(position, creditRatingHeader, 0, creditRatingHeaderLength);
            position += creditRatingHeaderLength;
            buffer.putBytes(position, creditRating, creditRatingOffset, creditRatingLength);
            position += creditRatingLength;
            buffer.putSeparator(position);
            position++;
        }

        if (instrRegistryLength > 0)
        {
            buffer.putBytes(position, instrRegistryHeader, 0, instrRegistryHeaderLength);
            position += instrRegistryHeaderLength;
            buffer.putBytes(position, instrRegistry, instrRegistryOffset, instrRegistryLength);
            position += instrRegistryLength;
            buffer.putSeparator(position);
            position++;
        }

        if (countryOfIssueLength > 0)
        {
            buffer.putBytes(position, countryOfIssueHeader, 0, countryOfIssueHeaderLength);
            position += countryOfIssueHeaderLength;
            buffer.putBytes(position, countryOfIssue, countryOfIssueOffset, countryOfIssueLength);
            position += countryOfIssueLength;
            buffer.putSeparator(position);
            position++;
        }

        if (stateOrProvinceOfIssueLength > 0)
        {
            buffer.putBytes(position, stateOrProvinceOfIssueHeader, 0, stateOrProvinceOfIssueHeaderLength);
            position += stateOrProvinceOfIssueHeaderLength;
            buffer.putBytes(position, stateOrProvinceOfIssue, stateOrProvinceOfIssueOffset, stateOrProvinceOfIssueLength);
            position += stateOrProvinceOfIssueLength;
            buffer.putSeparator(position);
            position++;
        }

        if (localeOfIssueLength > 0)
        {
            buffer.putBytes(position, localeOfIssueHeader, 0, localeOfIssueHeaderLength);
            position += localeOfIssueHeaderLength;
            buffer.putBytes(position, localeOfIssue, localeOfIssueOffset, localeOfIssueLength);
            position += localeOfIssueLength;
            buffer.putSeparator(position);
            position++;
        }

        if (redemptionDateLength > 0)
        {
            buffer.putBytes(position, redemptionDateHeader, 0, redemptionDateHeaderLength);
            position += redemptionDateHeaderLength;
            buffer.putBytes(position, redemptionDate, redemptionDateOffset, redemptionDateLength);
            position += redemptionDateLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasStrikePrice)
        {
            buffer.putBytes(position, strikePriceHeader, 0, strikePriceHeaderLength);
            position += strikePriceHeaderLength;
            position += buffer.putFloatAscii(position, strikePrice);
            buffer.putSeparator(position);
            position++;
        }

        if (strikeCurrencyLength > 0)
        {
            buffer.putBytes(position, strikeCurrencyHeader, 0, strikeCurrencyHeaderLength);
            position += strikeCurrencyHeaderLength;
            buffer.putBytes(position, strikeCurrency, strikeCurrencyOffset, strikeCurrencyLength);
            position += strikeCurrencyLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasStrikeMultiplier)
        {
            buffer.putBytes(position, strikeMultiplierHeader, 0, strikeMultiplierHeaderLength);
            position += strikeMultiplierHeaderLength;
            position += buffer.putFloatAscii(position, strikeMultiplier);
            buffer.putSeparator(position);
            position++;
        }

        if (hasStrikeValue)
        {
            buffer.putBytes(position, strikeValueHeader, 0, strikeValueHeaderLength);
            position += strikeValueHeaderLength;
            position += buffer.putFloatAscii(position, strikeValue);
            buffer.putSeparator(position);
            position++;
        }

        if (hasStrikePriceDeterminationMethod)
        {
            buffer.putBytes(position, strikePriceDeterminationMethodHeader, 0, strikePriceDeterminationMethodHeaderLength);
            position += strikePriceDeterminationMethodHeaderLength;
            position += buffer.putIntAscii(position, strikePriceDeterminationMethod);
            buffer.putSeparator(position);
            position++;
        }

        if (hasStrikePriceBoundaryMethod)
        {
            buffer.putBytes(position, strikePriceBoundaryMethodHeader, 0, strikePriceBoundaryMethodHeaderLength);
            position += strikePriceBoundaryMethodHeaderLength;
            position += buffer.putIntAscii(position, strikePriceBoundaryMethod);
            buffer.putSeparator(position);
            position++;
        }

        if (hasStrikePriceBoundaryPrecision)
        {
            buffer.putBytes(position, strikePriceBoundaryPrecisionHeader, 0, strikePriceBoundaryPrecisionHeaderLength);
            position += strikePriceBoundaryPrecisionHeaderLength;
            position += buffer.putFloatAscii(position, strikePriceBoundaryPrecision);
            buffer.putSeparator(position);
            position++;
        }

        if (hasUnderlyingPriceDeterminationMethod)
        {
            buffer.putBytes(position, underlyingPriceDeterminationMethodHeader, 0, underlyingPriceDeterminationMethodHeaderLength);
            position += underlyingPriceDeterminationMethodHeaderLength;
            position += buffer.putIntAscii(position, underlyingPriceDeterminationMethod);
            buffer.putSeparator(position);
            position++;
        }

        if (hasOptAttribute)
        {
            buffer.putBytes(position, optAttributeHeader, 0, optAttributeHeaderLength);
            position += optAttributeHeaderLength;
            position += buffer.putCharAscii(position, optAttribute);
            buffer.putSeparator(position);
            position++;
        }

        if (hasContractMultiplier)
        {
            buffer.putBytes(position, contractMultiplierHeader, 0, contractMultiplierHeaderLength);
            position += contractMultiplierHeaderLength;
            position += buffer.putFloatAscii(position, contractMultiplier);
            buffer.putSeparator(position);
            position++;
        }

        if (hasContractMultiplierUnit)
        {
            buffer.putBytes(position, contractMultiplierUnitHeader, 0, contractMultiplierUnitHeaderLength);
            position += contractMultiplierUnitHeaderLength;
            position += buffer.putIntAscii(position, contractMultiplierUnit);
            buffer.putSeparator(position);
            position++;
        }

        if (hasFlowScheduleType)
        {
            buffer.putBytes(position, flowScheduleTypeHeader, 0, flowScheduleTypeHeaderLength);
            position += flowScheduleTypeHeaderLength;
            position += buffer.putIntAscii(position, flowScheduleType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasMinPriceIncrement)
        {
            buffer.putBytes(position, minPriceIncrementHeader, 0, minPriceIncrementHeaderLength);
            position += minPriceIncrementHeaderLength;
            position += buffer.putFloatAscii(position, minPriceIncrement);
            buffer.putSeparator(position);
            position++;
        }

        if (hasMinPriceIncrementAmount)
        {
            buffer.putBytes(position, minPriceIncrementAmountHeader, 0, minPriceIncrementAmountHeaderLength);
            position += minPriceIncrementAmountHeaderLength;
            position += buffer.putFloatAscii(position, minPriceIncrementAmount);
            buffer.putSeparator(position);
            position++;
        }

        if (unitOfMeasureLength > 0)
        {
            buffer.putBytes(position, unitOfMeasureHeader, 0, unitOfMeasureHeaderLength);
            position += unitOfMeasureHeaderLength;
            buffer.putBytes(position, unitOfMeasure, unitOfMeasureOffset, unitOfMeasureLength);
            position += unitOfMeasureLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasUnitOfMeasureQty)
        {
            buffer.putBytes(position, unitOfMeasureQtyHeader, 0, unitOfMeasureQtyHeaderLength);
            position += unitOfMeasureQtyHeaderLength;
            position += buffer.putFloatAscii(position, unitOfMeasureQty);
            buffer.putSeparator(position);
            position++;
        }

        if (priceUnitOfMeasureLength > 0)
        {
            buffer.putBytes(position, priceUnitOfMeasureHeader, 0, priceUnitOfMeasureHeaderLength);
            position += priceUnitOfMeasureHeaderLength;
            buffer.putBytes(position, priceUnitOfMeasure, priceUnitOfMeasureOffset, priceUnitOfMeasureLength);
            position += priceUnitOfMeasureLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasPriceUnitOfMeasureQty)
        {
            buffer.putBytes(position, priceUnitOfMeasureQtyHeader, 0, priceUnitOfMeasureQtyHeaderLength);
            position += priceUnitOfMeasureQtyHeaderLength;
            position += buffer.putFloatAscii(position, priceUnitOfMeasureQty);
            buffer.putSeparator(position);
            position++;
        }

        if (hasSettlMethod)
        {
            buffer.putBytes(position, settlMethodHeader, 0, settlMethodHeaderLength);
            position += settlMethodHeaderLength;
            position += buffer.putCharAscii(position, settlMethod);
            buffer.putSeparator(position);
            position++;
        }

        if (hasExerciseStyle)
        {
            buffer.putBytes(position, exerciseStyleHeader, 0, exerciseStyleHeaderLength);
            position += exerciseStyleHeaderLength;
            position += buffer.putIntAscii(position, exerciseStyle);
            buffer.putSeparator(position);
            position++;
        }

        if (hasOptPayoutType)
        {
            buffer.putBytes(position, optPayoutTypeHeader, 0, optPayoutTypeHeaderLength);
            position += optPayoutTypeHeaderLength;
            position += buffer.putIntAscii(position, optPayoutType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasOptPayoutAmount)
        {
            buffer.putBytes(position, optPayoutAmountHeader, 0, optPayoutAmountHeaderLength);
            position += optPayoutAmountHeaderLength;
            position += buffer.putFloatAscii(position, optPayoutAmount);
            buffer.putSeparator(position);
            position++;
        }

        if (priceQuoteMethodLength > 0)
        {
            buffer.putBytes(position, priceQuoteMethodHeader, 0, priceQuoteMethodHeaderLength);
            position += priceQuoteMethodHeaderLength;
            buffer.putBytes(position, priceQuoteMethod, priceQuoteMethodOffset, priceQuoteMethodLength);
            position += priceQuoteMethodLength;
            buffer.putSeparator(position);
            position++;
        }

        if (valuationMethodLength > 0)
        {
            buffer.putBytes(position, valuationMethodHeader, 0, valuationMethodHeaderLength);
            position += valuationMethodHeaderLength;
            buffer.putBytes(position, valuationMethod, valuationMethodOffset, valuationMethodLength);
            position += valuationMethodLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasListMethod)
        {
            buffer.putBytes(position, listMethodHeader, 0, listMethodHeaderLength);
            position += listMethodHeaderLength;
            position += buffer.putIntAscii(position, listMethod);
            buffer.putSeparator(position);
            position++;
        }

        if (hasCapPrice)
        {
            buffer.putBytes(position, capPriceHeader, 0, capPriceHeaderLength);
            position += capPriceHeaderLength;
            position += buffer.putFloatAscii(position, capPrice);
            buffer.putSeparator(position);
            position++;
        }

        if (hasFloorPrice)
        {
            buffer.putBytes(position, floorPriceHeader, 0, floorPriceHeaderLength);
            position += floorPriceHeaderLength;
            position += buffer.putFloatAscii(position, floorPrice);
            buffer.putSeparator(position);
            position++;
        }

        if (hasPutOrCall)
        {
            buffer.putBytes(position, putOrCallHeader, 0, putOrCallHeaderLength);
            position += putOrCallHeaderLength;
            position += buffer.putIntAscii(position, putOrCall);
            buffer.putSeparator(position);
            position++;
        }

        if (hasFlexibleIndicator)
        {
            buffer.putBytes(position, flexibleIndicatorHeader, 0, flexibleIndicatorHeaderLength);
            position += flexibleIndicatorHeaderLength;
            position += buffer.putBooleanAscii(position, flexibleIndicator);
            buffer.putSeparator(position);
            position++;
        }

        if (hasFlexProductEligibilityIndicator)
        {
            buffer.putBytes(position, flexProductEligibilityIndicatorHeader, 0, flexProductEligibilityIndicatorHeaderLength);
            position += flexProductEligibilityIndicatorHeaderLength;
            position += buffer.putBooleanAscii(position, flexProductEligibilityIndicator);
            buffer.putSeparator(position);
            position++;
        }

        if (timeUnitLength > 0)
        {
            buffer.putBytes(position, timeUnitHeader, 0, timeUnitHeaderLength);
            position += timeUnitHeaderLength;
            buffer.putBytes(position, timeUnit, timeUnitOffset, timeUnitLength);
            position += timeUnitLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasCouponRate)
        {
            buffer.putBytes(position, couponRateHeader, 0, couponRateHeaderLength);
            position += couponRateHeaderLength;
            position += buffer.putFloatAscii(position, couponRate);
            buffer.putSeparator(position);
            position++;
        }

        if (securityExchangeLength > 0)
        {
            buffer.putBytes(position, securityExchangeHeader, 0, securityExchangeHeaderLength);
            position += securityExchangeHeaderLength;
            buffer.putBytes(position, securityExchange, securityExchangeOffset, securityExchangeLength);
            position += securityExchangeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasPositionLimit)
        {
            buffer.putBytes(position, positionLimitHeader, 0, positionLimitHeaderLength);
            position += positionLimitHeaderLength;
            position += buffer.putIntAscii(position, positionLimit);
            buffer.putSeparator(position);
            position++;
        }

        if (hasNTPositionLimit)
        {
            buffer.putBytes(position, nTPositionLimitHeader, 0, nTPositionLimitHeaderLength);
            position += nTPositionLimitHeaderLength;
            position += buffer.putIntAscii(position, nTPositionLimit);
            buffer.putSeparator(position);
            position++;
        }

        if (issuerLength > 0)
        {
            buffer.putBytes(position, issuerHeader, 0, issuerHeaderLength);
            position += issuerHeaderLength;
            buffer.putBytes(position, issuer, issuerOffset, issuerLength);
            position += issuerLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasEncodedIssuerLen)
        {
            buffer.putBytes(position, encodedIssuerLenHeader, 0, encodedIssuerLenHeaderLength);
            position += encodedIssuerLenHeaderLength;
            position += buffer.putIntAscii(position, encodedIssuerLen);
            buffer.putSeparator(position);
            position++;
        }

        if (hasEncodedIssuer)
        {
            buffer.putBytes(position, encodedIssuerHeader, 0, encodedIssuerHeaderLength);
            position += encodedIssuerHeaderLength;
            buffer.putBytes(position, encodedIssuer);
            position += encodedIssuer.length;
            buffer.putSeparator(position);
            position++;
        }

        if (securityDescLength > 0)
        {
            buffer.putBytes(position, securityDescHeader, 0, securityDescHeaderLength);
            position += securityDescHeaderLength;
            buffer.putBytes(position, securityDesc, securityDescOffset, securityDescLength);
            position += securityDescLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasEncodedSecurityDescLen)
        {
            buffer.putBytes(position, encodedSecurityDescLenHeader, 0, encodedSecurityDescLenHeaderLength);
            position += encodedSecurityDescLenHeaderLength;
            position += buffer.putIntAscii(position, encodedSecurityDescLen);
            buffer.putSeparator(position);
            position++;
        }

        if (hasEncodedSecurityDesc)
        {
            buffer.putBytes(position, encodedSecurityDescHeader, 0, encodedSecurityDescHeaderLength);
            position += encodedSecurityDescHeaderLength;
            buffer.putBytes(position, encodedSecurityDesc);
            position += encodedSecurityDesc.length;
            buffer.putSeparator(position);
            position++;
        }

            position += securityXML.encode(buffer, position);

        if (poolLength > 0)
        {
            buffer.putBytes(position, poolHeader, 0, poolHeaderLength);
            position += poolHeaderLength;
            buffer.putBytes(position, pool, poolOffset, poolLength);
            position += poolLength;
            buffer.putSeparator(position);
            position++;
        }

        if (contractSettlMonthLength > 0)
        {
            buffer.putBytes(position, contractSettlMonthHeader, 0, contractSettlMonthHeaderLength);
            position += contractSettlMonthHeaderLength;
            buffer.putBytes(position, contractSettlMonth, contractSettlMonthOffset, contractSettlMonthLength);
            position += contractSettlMonthLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasCPProgram)
        {
            buffer.putBytes(position, cPProgramHeader, 0, cPProgramHeaderLength);
            position += cPProgramHeaderLength;
            position += buffer.putIntAscii(position, cPProgram);
            buffer.putSeparator(position);
            position++;
        }

        if (cPRegTypeLength > 0)
        {
            buffer.putBytes(position, cPRegTypeHeader, 0, cPRegTypeHeaderLength);
            position += cPRegTypeHeaderLength;
            buffer.putBytes(position, cPRegType, cPRegTypeOffset, cPRegTypeLength);
            position += cPRegTypeLength;
            buffer.putSeparator(position);
            position++;
        }

            position += evntGrp.encode(buffer, position);

        if (datedDateLength > 0)
        {
            buffer.putBytes(position, datedDateHeader, 0, datedDateHeaderLength);
            position += datedDateHeaderLength;
            buffer.putBytes(position, datedDate, datedDateOffset, datedDateLength);
            position += datedDateLength;
            buffer.putSeparator(position);
            position++;
        }

        if (interestAccrualDateLength > 0)
        {
            buffer.putBytes(position, interestAccrualDateHeader, 0, interestAccrualDateHeaderLength);
            position += interestAccrualDateHeaderLength;
            buffer.putBytes(position, interestAccrualDate, interestAccrualDateOffset, interestAccrualDateLength);
            position += interestAccrualDateLength;
            buffer.putSeparator(position);
            position++;
        }

            position += instrumentParties.encode(buffer, position);

            position += complexEvents.encode(buffer, position);
        return position - offset;
    }

    public void reset()
    {
        this.resetSymbol();
        this.resetSymbolSfx();
        this.resetSecurityID();
        this.resetSecurityIDSource();
        this.resetProduct();
        this.resetProductComplex();
        this.resetSecurityGroup();
        this.resetCFICode();
        this.resetSecurityType();
        this.resetSecuritySubType();
        this.resetMaturityMonthYear();
        this.resetMaturityDate();
        this.resetMaturityTime();
        this.resetSettleOnOpenFlag();
        this.resetInstrmtAssignmentMethod();
        this.resetSecurityStatus();
        this.resetCouponPaymentDate();
        this.resetRestructuringType();
        this.resetSeniority();
        this.resetNotionalPercentageOutstanding();
        this.resetOriginalNotionalPercentageOutstanding();
        this.resetAttachmentPoint();
        this.resetDetachmentPoint();
        this.resetIssueDate();
        this.resetRepoCollateralSecurityType();
        this.resetRepurchaseTerm();
        this.resetRepurchaseRate();
        this.resetFactor();
        this.resetCreditRating();
        this.resetInstrRegistry();
        this.resetCountryOfIssue();
        this.resetStateOrProvinceOfIssue();
        this.resetLocaleOfIssue();
        this.resetRedemptionDate();
        this.resetStrikePrice();
        this.resetStrikeCurrency();
        this.resetStrikeMultiplier();
        this.resetStrikeValue();
        this.resetStrikePriceDeterminationMethod();
        this.resetStrikePriceBoundaryMethod();
        this.resetStrikePriceBoundaryPrecision();
        this.resetUnderlyingPriceDeterminationMethod();
        this.resetOptAttribute();
        this.resetContractMultiplier();
        this.resetContractMultiplierUnit();
        this.resetFlowScheduleType();
        this.resetMinPriceIncrement();
        this.resetMinPriceIncrementAmount();
        this.resetUnitOfMeasure();
        this.resetUnitOfMeasureQty();
        this.resetPriceUnitOfMeasure();
        this.resetPriceUnitOfMeasureQty();
        this.resetSettlMethod();
        this.resetExerciseStyle();
        this.resetOptPayoutType();
        this.resetOptPayoutAmount();
        this.resetPriceQuoteMethod();
        this.resetValuationMethod();
        this.resetListMethod();
        this.resetCapPrice();
        this.resetFloorPrice();
        this.resetPutOrCall();
        this.resetFlexibleIndicator();
        this.resetFlexProductEligibilityIndicator();
        this.resetTimeUnit();
        this.resetCouponRate();
        this.resetSecurityExchange();
        this.resetPositionLimit();
        this.resetNTPositionLimit();
        this.resetIssuer();
        this.resetEncodedIssuerLen();
        this.resetEncodedIssuer();
        this.resetSecurityDesc();
        this.resetEncodedSecurityDescLen();
        this.resetEncodedSecurityDesc();
        this.resetPool();
        this.resetContractSettlMonth();
        this.resetCPProgram();
        this.resetCPRegType();
        this.resetDatedDate();
        this.resetInterestAccrualDate();
        secAltIDGrp.reset();
        securityXML.reset();
        evntGrp.reset();
        instrumentParties.reset();
        complexEvents.reset();
    }

    public void resetSymbol()
    {
        symbolLength = 0;
    }

    public void resetSymbolSfx()
    {
        symbolSfxLength = 0;
    }

    public void resetSecurityID()
    {
        securityIDLength = 0;
    }

    public void resetSecurityIDSource()
    {
        securityIDSourceLength = 0;
    }

    public void resetProduct()
    {
        hasProduct = false;
    }

    public void resetProductComplex()
    {
        productComplexLength = 0;
    }

    public void resetSecurityGroup()
    {
        securityGroupLength = 0;
    }

    public void resetCFICode()
    {
        cFICodeLength = 0;
    }

    public void resetSecurityType()
    {
        securityTypeLength = 0;
    }

    public void resetSecuritySubType()
    {
        securitySubTypeLength = 0;
    }

    public void resetMaturityMonthYear()
    {
        maturityMonthYearLength = 0;
    }

    public void resetMaturityDate()
    {
        maturityDateLength = 0;
    }

    public void resetMaturityTime()
    {
        maturityTimeLength = 0;
    }

    public void resetSettleOnOpenFlag()
    {
        settleOnOpenFlagLength = 0;
    }

    public void resetInstrmtAssignmentMethod()
    {
        hasInstrmtAssignmentMethod = false;
    }

    public void resetSecurityStatus()
    {
        securityStatusLength = 0;
    }

    public void resetCouponPaymentDate()
    {
        couponPaymentDateLength = 0;
    }

    public void resetRestructuringType()
    {
        restructuringTypeLength = 0;
    }

    public void resetSeniority()
    {
        seniorityLength = 0;
    }

    public void resetNotionalPercentageOutstanding()
    {
        hasNotionalPercentageOutstanding = false;
    }

    public void resetOriginalNotionalPercentageOutstanding()
    {
        hasOriginalNotionalPercentageOutstanding = false;
    }

    public void resetAttachmentPoint()
    {
        hasAttachmentPoint = false;
    }

    public void resetDetachmentPoint()
    {
        hasDetachmentPoint = false;
    }

    public void resetIssueDate()
    {
        issueDateLength = 0;
    }

    public void resetRepoCollateralSecurityType()
    {
        repoCollateralSecurityTypeLength = 0;
    }

    public void resetRepurchaseTerm()
    {
        hasRepurchaseTerm = false;
    }

    public void resetRepurchaseRate()
    {
        hasRepurchaseRate = false;
    }

    public void resetFactor()
    {
        hasFactor = false;
    }

    public void resetCreditRating()
    {
        creditRatingLength = 0;
    }

    public void resetInstrRegistry()
    {
        instrRegistryLength = 0;
    }

    public void resetCountryOfIssue()
    {
        countryOfIssueLength = 0;
    }

    public void resetStateOrProvinceOfIssue()
    {
        stateOrProvinceOfIssueLength = 0;
    }

    public void resetLocaleOfIssue()
    {
        localeOfIssueLength = 0;
    }

    public void resetRedemptionDate()
    {
        redemptionDateLength = 0;
    }

    public void resetStrikePrice()
    {
        hasStrikePrice = false;
    }

    public void resetStrikeCurrency()
    {
        strikeCurrencyLength = 0;
    }

    public void resetStrikeMultiplier()
    {
        hasStrikeMultiplier = false;
    }

    public void resetStrikeValue()
    {
        hasStrikeValue = false;
    }

    public void resetStrikePriceDeterminationMethod()
    {
        hasStrikePriceDeterminationMethod = false;
    }

    public void resetStrikePriceBoundaryMethod()
    {
        hasStrikePriceBoundaryMethod = false;
    }

    public void resetStrikePriceBoundaryPrecision()
    {
        hasStrikePriceBoundaryPrecision = false;
    }

    public void resetUnderlyingPriceDeterminationMethod()
    {
        hasUnderlyingPriceDeterminationMethod = false;
    }

    public void resetOptAttribute()
    {
        hasOptAttribute = false;
    }

    public void resetContractMultiplier()
    {
        hasContractMultiplier = false;
    }

    public void resetContractMultiplierUnit()
    {
        hasContractMultiplierUnit = false;
    }

    public void resetFlowScheduleType()
    {
        hasFlowScheduleType = false;
    }

    public void resetMinPriceIncrement()
    {
        hasMinPriceIncrement = false;
    }

    public void resetMinPriceIncrementAmount()
    {
        hasMinPriceIncrementAmount = false;
    }

    public void resetUnitOfMeasure()
    {
        unitOfMeasureLength = 0;
    }

    public void resetUnitOfMeasureQty()
    {
        hasUnitOfMeasureQty = false;
    }

    public void resetPriceUnitOfMeasure()
    {
        priceUnitOfMeasureLength = 0;
    }

    public void resetPriceUnitOfMeasureQty()
    {
        hasPriceUnitOfMeasureQty = false;
    }

    public void resetSettlMethod()
    {
        hasSettlMethod = false;
    }

    public void resetExerciseStyle()
    {
        hasExerciseStyle = false;
    }

    public void resetOptPayoutType()
    {
        hasOptPayoutType = false;
    }

    public void resetOptPayoutAmount()
    {
        hasOptPayoutAmount = false;
    }

    public void resetPriceQuoteMethod()
    {
        priceQuoteMethodLength = 0;
    }

    public void resetValuationMethod()
    {
        valuationMethodLength = 0;
    }

    public void resetListMethod()
    {
        hasListMethod = false;
    }

    public void resetCapPrice()
    {
        hasCapPrice = false;
    }

    public void resetFloorPrice()
    {
        hasFloorPrice = false;
    }

    public void resetPutOrCall()
    {
        hasPutOrCall = false;
    }

    public void resetFlexibleIndicator()
    {
        hasFlexibleIndicator = false;
    }

    public void resetFlexProductEligibilityIndicator()
    {
        hasFlexProductEligibilityIndicator = false;
    }

    public void resetTimeUnit()
    {
        timeUnitLength = 0;
    }

    public void resetCouponRate()
    {
        hasCouponRate = false;
    }

    public void resetSecurityExchange()
    {
        securityExchangeLength = 0;
    }

    public void resetPositionLimit()
    {
        hasPositionLimit = false;
    }

    public void resetNTPositionLimit()
    {
        hasNTPositionLimit = false;
    }

    public void resetIssuer()
    {
        issuerLength = 0;
    }

    public void resetEncodedIssuerLen()
    {
        hasEncodedIssuerLen = false;
    }

    public void resetEncodedIssuer()
    {
        hasEncodedIssuer = false;
    }

    public void resetSecurityDesc()
    {
        securityDescLength = 0;
    }

    public void resetEncodedSecurityDescLen()
    {
        hasEncodedSecurityDescLen = false;
    }

    public void resetEncodedSecurityDesc()
    {
        hasEncodedSecurityDesc = false;
    }

    public void resetPool()
    {
        poolLength = 0;
    }

    public void resetContractSettlMonth()
    {
        contractSettlMonthLength = 0;
    }

    public void resetCPProgram()
    {
        hasCPProgram = false;
    }

    public void resetCPRegType()
    {
        cPRegTypeLength = 0;
    }

    public void resetDatedDate()
    {
        datedDateLength = 0;
    }

    public void resetInterestAccrualDate()
    {
        interestAccrualDateLength = 0;
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
        builder.append("\"MessageName\": \"Instrument\",\n");
        if (hasSymbol())
        {
            indent(builder, level);
            builder.append("\"Symbol\": \"");
            appendBuffer(builder, symbol, symbolOffset, symbolLength);
            builder.append("\",\n");
        }

        if (hasSymbolSfx())
        {
            indent(builder, level);
            builder.append("\"SymbolSfx\": \"");
            appendBuffer(builder, symbolSfx, symbolSfxOffset, symbolSfxLength);
            builder.append("\",\n");
        }

        if (hasSecurityID())
        {
            indent(builder, level);
            builder.append("\"SecurityID\": \"");
            appendBuffer(builder, securityID, securityIDOffset, securityIDLength);
            builder.append("\",\n");
        }

        if (hasSecurityIDSource())
        {
            indent(builder, level);
            builder.append("\"SecurityIDSource\": \"");
            appendBuffer(builder, securityIDSource, securityIDSourceOffset, securityIDSourceLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"SecAltIDGrp\": ");
    secAltIDGrp.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasProduct())
        {
            indent(builder, level);
            builder.append("\"Product\": \"");
            builder.append(product);
            builder.append("\",\n");
        }

        if (hasProductComplex())
        {
            indent(builder, level);
            builder.append("\"ProductComplex\": \"");
            appendBuffer(builder, productComplex, productComplexOffset, productComplexLength);
            builder.append("\",\n");
        }

        if (hasSecurityGroup())
        {
            indent(builder, level);
            builder.append("\"SecurityGroup\": \"");
            appendBuffer(builder, securityGroup, securityGroupOffset, securityGroupLength);
            builder.append("\",\n");
        }

        if (hasCFICode())
        {
            indent(builder, level);
            builder.append("\"CFICode\": \"");
            appendBuffer(builder, cFICode, cFICodeOffset, cFICodeLength);
            builder.append("\",\n");
        }

        if (hasSecurityType())
        {
            indent(builder, level);
            builder.append("\"SecurityType\": \"");
            appendBuffer(builder, securityType, securityTypeOffset, securityTypeLength);
            builder.append("\",\n");
        }

        if (hasSecuritySubType())
        {
            indent(builder, level);
            builder.append("\"SecuritySubType\": \"");
            appendBuffer(builder, securitySubType, securitySubTypeOffset, securitySubTypeLength);
            builder.append("\",\n");
        }

        if (hasMaturityMonthYear())
        {
            indent(builder, level);
            builder.append("\"MaturityMonthYear\": \"");
            appendBuffer(builder, maturityMonthYear, maturityMonthYearOffset, maturityMonthYearLength);
            builder.append("\",\n");
        }

        if (hasMaturityDate())
        {
            indent(builder, level);
            builder.append("\"MaturityDate\": \"");
            appendBuffer(builder, maturityDate, maturityDateOffset, maturityDateLength);
            builder.append("\",\n");
        }

        if (hasMaturityTime())
        {
            indent(builder, level);
            builder.append("\"MaturityTime\": \"");
            appendBuffer(builder, maturityTime, maturityTimeOffset, maturityTimeLength);
            builder.append("\",\n");
        }

        if (hasSettleOnOpenFlag())
        {
            indent(builder, level);
            builder.append("\"SettleOnOpenFlag\": \"");
            appendBuffer(builder, settleOnOpenFlag, settleOnOpenFlagOffset, settleOnOpenFlagLength);
            builder.append("\",\n");
        }

        if (hasInstrmtAssignmentMethod())
        {
            indent(builder, level);
            builder.append("\"InstrmtAssignmentMethod\": \"");
            builder.append(instrmtAssignmentMethod);
            builder.append("\",\n");
        }

        if (hasSecurityStatus())
        {
            indent(builder, level);
            builder.append("\"SecurityStatus\": \"");
            appendBuffer(builder, securityStatus, securityStatusOffset, securityStatusLength);
            builder.append("\",\n");
        }

        if (hasCouponPaymentDate())
        {
            indent(builder, level);
            builder.append("\"CouponPaymentDate\": \"");
            appendBuffer(builder, couponPaymentDate, couponPaymentDateOffset, couponPaymentDateLength);
            builder.append("\",\n");
        }

        if (hasRestructuringType())
        {
            indent(builder, level);
            builder.append("\"RestructuringType\": \"");
            appendBuffer(builder, restructuringType, restructuringTypeOffset, restructuringTypeLength);
            builder.append("\",\n");
        }

        if (hasSeniority())
        {
            indent(builder, level);
            builder.append("\"Seniority\": \"");
            appendBuffer(builder, seniority, seniorityOffset, seniorityLength);
            builder.append("\",\n");
        }

        if (hasNotionalPercentageOutstanding())
        {
            indent(builder, level);
            builder.append("\"NotionalPercentageOutstanding\": \"");
            notionalPercentageOutstanding.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasOriginalNotionalPercentageOutstanding())
        {
            indent(builder, level);
            builder.append("\"OriginalNotionalPercentageOutstanding\": \"");
            originalNotionalPercentageOutstanding.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasAttachmentPoint())
        {
            indent(builder, level);
            builder.append("\"AttachmentPoint\": \"");
            attachmentPoint.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasDetachmentPoint())
        {
            indent(builder, level);
            builder.append("\"DetachmentPoint\": \"");
            detachmentPoint.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasIssueDate())
        {
            indent(builder, level);
            builder.append("\"IssueDate\": \"");
            appendBuffer(builder, issueDate, issueDateOffset, issueDateLength);
            builder.append("\",\n");
        }

        if (hasRepoCollateralSecurityType())
        {
            indent(builder, level);
            builder.append("\"RepoCollateralSecurityType\": \"");
            appendBuffer(builder, repoCollateralSecurityType, repoCollateralSecurityTypeOffset, repoCollateralSecurityTypeLength);
            builder.append("\",\n");
        }

        if (hasRepurchaseTerm())
        {
            indent(builder, level);
            builder.append("\"RepurchaseTerm\": \"");
            builder.append(repurchaseTerm);
            builder.append("\",\n");
        }

        if (hasRepurchaseRate())
        {
            indent(builder, level);
            builder.append("\"RepurchaseRate\": \"");
            repurchaseRate.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasFactor())
        {
            indent(builder, level);
            builder.append("\"Factor\": \"");
            factor.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasCreditRating())
        {
            indent(builder, level);
            builder.append("\"CreditRating\": \"");
            appendBuffer(builder, creditRating, creditRatingOffset, creditRatingLength);
            builder.append("\",\n");
        }

        if (hasInstrRegistry())
        {
            indent(builder, level);
            builder.append("\"InstrRegistry\": \"");
            appendBuffer(builder, instrRegistry, instrRegistryOffset, instrRegistryLength);
            builder.append("\",\n");
        }

        if (hasCountryOfIssue())
        {
            indent(builder, level);
            builder.append("\"CountryOfIssue\": \"");
            appendBuffer(builder, countryOfIssue, countryOfIssueOffset, countryOfIssueLength);
            builder.append("\",\n");
        }

        if (hasStateOrProvinceOfIssue())
        {
            indent(builder, level);
            builder.append("\"StateOrProvinceOfIssue\": \"");
            appendBuffer(builder, stateOrProvinceOfIssue, stateOrProvinceOfIssueOffset, stateOrProvinceOfIssueLength);
            builder.append("\",\n");
        }

        if (hasLocaleOfIssue())
        {
            indent(builder, level);
            builder.append("\"LocaleOfIssue\": \"");
            appendBuffer(builder, localeOfIssue, localeOfIssueOffset, localeOfIssueLength);
            builder.append("\",\n");
        }

        if (hasRedemptionDate())
        {
            indent(builder, level);
            builder.append("\"RedemptionDate\": \"");
            appendBuffer(builder, redemptionDate, redemptionDateOffset, redemptionDateLength);
            builder.append("\",\n");
        }

        if (hasStrikePrice())
        {
            indent(builder, level);
            builder.append("\"StrikePrice\": \"");
            strikePrice.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasStrikeCurrency())
        {
            indent(builder, level);
            builder.append("\"StrikeCurrency\": \"");
            appendBuffer(builder, strikeCurrency, strikeCurrencyOffset, strikeCurrencyLength);
            builder.append("\",\n");
        }

        if (hasStrikeMultiplier())
        {
            indent(builder, level);
            builder.append("\"StrikeMultiplier\": \"");
            strikeMultiplier.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasStrikeValue())
        {
            indent(builder, level);
            builder.append("\"StrikeValue\": \"");
            strikeValue.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasStrikePriceDeterminationMethod())
        {
            indent(builder, level);
            builder.append("\"StrikePriceDeterminationMethod\": \"");
            builder.append(strikePriceDeterminationMethod);
            builder.append("\",\n");
        }

        if (hasStrikePriceBoundaryMethod())
        {
            indent(builder, level);
            builder.append("\"StrikePriceBoundaryMethod\": \"");
            builder.append(strikePriceBoundaryMethod);
            builder.append("\",\n");
        }

        if (hasStrikePriceBoundaryPrecision())
        {
            indent(builder, level);
            builder.append("\"StrikePriceBoundaryPrecision\": \"");
            strikePriceBoundaryPrecision.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasUnderlyingPriceDeterminationMethod())
        {
            indent(builder, level);
            builder.append("\"UnderlyingPriceDeterminationMethod\": \"");
            builder.append(underlyingPriceDeterminationMethod);
            builder.append("\",\n");
        }

        if (hasOptAttribute())
        {
            indent(builder, level);
            builder.append("\"OptAttribute\": \"");
            builder.append(optAttribute);
            builder.append("\",\n");
        }

        if (hasContractMultiplier())
        {
            indent(builder, level);
            builder.append("\"ContractMultiplier\": \"");
            contractMultiplier.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasContractMultiplierUnit())
        {
            indent(builder, level);
            builder.append("\"ContractMultiplierUnit\": \"");
            builder.append(contractMultiplierUnit);
            builder.append("\",\n");
        }

        if (hasFlowScheduleType())
        {
            indent(builder, level);
            builder.append("\"FlowScheduleType\": \"");
            builder.append(flowScheduleType);
            builder.append("\",\n");
        }

        if (hasMinPriceIncrement())
        {
            indent(builder, level);
            builder.append("\"MinPriceIncrement\": \"");
            minPriceIncrement.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasMinPriceIncrementAmount())
        {
            indent(builder, level);
            builder.append("\"MinPriceIncrementAmount\": \"");
            minPriceIncrementAmount.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasUnitOfMeasure())
        {
            indent(builder, level);
            builder.append("\"UnitOfMeasure\": \"");
            appendBuffer(builder, unitOfMeasure, unitOfMeasureOffset, unitOfMeasureLength);
            builder.append("\",\n");
        }

        if (hasUnitOfMeasureQty())
        {
            indent(builder, level);
            builder.append("\"UnitOfMeasureQty\": \"");
            unitOfMeasureQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasPriceUnitOfMeasure())
        {
            indent(builder, level);
            builder.append("\"PriceUnitOfMeasure\": \"");
            appendBuffer(builder, priceUnitOfMeasure, priceUnitOfMeasureOffset, priceUnitOfMeasureLength);
            builder.append("\",\n");
        }

        if (hasPriceUnitOfMeasureQty())
        {
            indent(builder, level);
            builder.append("\"PriceUnitOfMeasureQty\": \"");
            priceUnitOfMeasureQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasSettlMethod())
        {
            indent(builder, level);
            builder.append("\"SettlMethod\": \"");
            builder.append(settlMethod);
            builder.append("\",\n");
        }

        if (hasExerciseStyle())
        {
            indent(builder, level);
            builder.append("\"ExerciseStyle\": \"");
            builder.append(exerciseStyle);
            builder.append("\",\n");
        }

        if (hasOptPayoutType())
        {
            indent(builder, level);
            builder.append("\"OptPayoutType\": \"");
            builder.append(optPayoutType);
            builder.append("\",\n");
        }

        if (hasOptPayoutAmount())
        {
            indent(builder, level);
            builder.append("\"OptPayoutAmount\": \"");
            optPayoutAmount.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasPriceQuoteMethod())
        {
            indent(builder, level);
            builder.append("\"PriceQuoteMethod\": \"");
            appendBuffer(builder, priceQuoteMethod, priceQuoteMethodOffset, priceQuoteMethodLength);
            builder.append("\",\n");
        }

        if (hasValuationMethod())
        {
            indent(builder, level);
            builder.append("\"ValuationMethod\": \"");
            appendBuffer(builder, valuationMethod, valuationMethodOffset, valuationMethodLength);
            builder.append("\",\n");
        }

        if (hasListMethod())
        {
            indent(builder, level);
            builder.append("\"ListMethod\": \"");
            builder.append(listMethod);
            builder.append("\",\n");
        }

        if (hasCapPrice())
        {
            indent(builder, level);
            builder.append("\"CapPrice\": \"");
            capPrice.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasFloorPrice())
        {
            indent(builder, level);
            builder.append("\"FloorPrice\": \"");
            floorPrice.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasPutOrCall())
        {
            indent(builder, level);
            builder.append("\"PutOrCall\": \"");
            builder.append(putOrCall);
            builder.append("\",\n");
        }

        if (hasFlexibleIndicator())
        {
            indent(builder, level);
            builder.append("\"FlexibleIndicator\": \"");
            builder.append(flexibleIndicator);
            builder.append("\",\n");
        }

        if (hasFlexProductEligibilityIndicator())
        {
            indent(builder, level);
            builder.append("\"FlexProductEligibilityIndicator\": \"");
            builder.append(flexProductEligibilityIndicator);
            builder.append("\",\n");
        }

        if (hasTimeUnit())
        {
            indent(builder, level);
            builder.append("\"TimeUnit\": \"");
            appendBuffer(builder, timeUnit, timeUnitOffset, timeUnitLength);
            builder.append("\",\n");
        }

        if (hasCouponRate())
        {
            indent(builder, level);
            builder.append("\"CouponRate\": \"");
            couponRate.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasSecurityExchange())
        {
            indent(builder, level);
            builder.append("\"SecurityExchange\": \"");
            appendBuffer(builder, securityExchange, securityExchangeOffset, securityExchangeLength);
            builder.append("\",\n");
        }

        if (hasPositionLimit())
        {
            indent(builder, level);
            builder.append("\"PositionLimit\": \"");
            builder.append(positionLimit);
            builder.append("\",\n");
        }

        if (hasNTPositionLimit())
        {
            indent(builder, level);
            builder.append("\"NTPositionLimit\": \"");
            builder.append(nTPositionLimit);
            builder.append("\",\n");
        }

        if (hasIssuer())
        {
            indent(builder, level);
            builder.append("\"Issuer\": \"");
            appendBuffer(builder, issuer, issuerOffset, issuerLength);
            builder.append("\",\n");
        }

        if (hasEncodedIssuerLen())
        {
            indent(builder, level);
            builder.append("\"EncodedIssuerLen\": \"");
            builder.append(encodedIssuerLen);
            builder.append("\",\n");
        }

        if (hasEncodedIssuer())
        {
            indent(builder, level);
            builder.append("\"EncodedIssuer\": \"");
            appendData(builder, encodedIssuer, encodedIssuerLen);
            builder.append("\",\n");
        }

        if (hasSecurityDesc())
        {
            indent(builder, level);
            builder.append("\"SecurityDesc\": \"");
            appendBuffer(builder, securityDesc, securityDescOffset, securityDescLength);
            builder.append("\",\n");
        }

        if (hasEncodedSecurityDescLen())
        {
            indent(builder, level);
            builder.append("\"EncodedSecurityDescLen\": \"");
            builder.append(encodedSecurityDescLen);
            builder.append("\",\n");
        }

        if (hasEncodedSecurityDesc())
        {
            indent(builder, level);
            builder.append("\"EncodedSecurityDesc\": \"");
            appendData(builder, encodedSecurityDesc, encodedSecurityDescLen);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"SecurityXML\": ");
    securityXML.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasPool())
        {
            indent(builder, level);
            builder.append("\"Pool\": \"");
            appendBuffer(builder, pool, poolOffset, poolLength);
            builder.append("\",\n");
        }

        if (hasContractSettlMonth())
        {
            indent(builder, level);
            builder.append("\"ContractSettlMonth\": \"");
            appendBuffer(builder, contractSettlMonth, contractSettlMonthOffset, contractSettlMonthLength);
            builder.append("\",\n");
        }

        if (hasCPProgram())
        {
            indent(builder, level);
            builder.append("\"CPProgram\": \"");
            builder.append(cPProgram);
            builder.append("\",\n");
        }

        if (hasCPRegType())
        {
            indent(builder, level);
            builder.append("\"CPRegType\": \"");
            appendBuffer(builder, cPRegType, cPRegTypeOffset, cPRegTypeLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"EvntGrp\": ");
    evntGrp.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasDatedDate())
        {
            indent(builder, level);
            builder.append("\"DatedDate\": \"");
            appendBuffer(builder, datedDate, datedDateOffset, datedDateLength);
            builder.append("\",\n");
        }

        if (hasInterestAccrualDate())
        {
            indent(builder, level);
            builder.append("\"InterestAccrualDate\": \"");
            appendBuffer(builder, interestAccrualDate, interestAccrualDateOffset, interestAccrualDateLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"InstrumentParties\": ");
    instrumentParties.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"ComplexEvents\": ");
    complexEvents.appendTo(builder, level + 1);
    builder.append("\n");
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public InstrumentEncoder copyTo(final Encoder encoder)
    {
        return copyTo((InstrumentEncoder)encoder);
    }

    public InstrumentEncoder copyTo(final InstrumentEncoder encoder)
    {
        encoder.reset();
        if (hasSymbol())
        {
            encoder.symbolAsCopy(symbol.byteArray(), 0, symbolLength);
        }

        if (hasSymbolSfx())
        {
            encoder.symbolSfxAsCopy(symbolSfx.byteArray(), 0, symbolSfxLength);
        }

        if (hasSecurityID())
        {
            encoder.securityIDAsCopy(securityID.byteArray(), 0, securityIDLength);
        }

        if (hasSecurityIDSource())
        {
            encoder.securityIDSourceAsCopy(securityIDSource.byteArray(), 0, securityIDSourceLength);
        }


        secAltIDGrp.copyTo(encoder.secAltIDGrp());
        if (hasProduct())
        {
            encoder.product(this.product());
        }

        if (hasProductComplex())
        {
            encoder.productComplexAsCopy(productComplex.byteArray(), 0, productComplexLength);
        }

        if (hasSecurityGroup())
        {
            encoder.securityGroupAsCopy(securityGroup.byteArray(), 0, securityGroupLength);
        }

        if (hasCFICode())
        {
            encoder.cFICodeAsCopy(cFICode.byteArray(), 0, cFICodeLength);
        }

        if (hasSecurityType())
        {
            encoder.securityTypeAsCopy(securityType.byteArray(), 0, securityTypeLength);
        }

        if (hasSecuritySubType())
        {
            encoder.securitySubTypeAsCopy(securitySubType.byteArray(), 0, securitySubTypeLength);
        }

        if (hasMaturityMonthYear())
        {
            encoder.maturityMonthYearAsCopy(maturityMonthYear.byteArray(), 0, maturityMonthYearLength);
        }

        if (hasMaturityDate())
        {
            encoder.maturityDateAsCopy(maturityDate.byteArray(), 0, maturityDateLength);
        }

        if (hasMaturityTime())
        {
            encoder.maturityTimeAsCopy(maturityTime.byteArray(), 0, maturityTimeLength);
        }

        if (hasSettleOnOpenFlag())
        {
            encoder.settleOnOpenFlagAsCopy(settleOnOpenFlag.byteArray(), 0, settleOnOpenFlagLength);
        }

        if (hasInstrmtAssignmentMethod())
        {
            encoder.instrmtAssignmentMethod(this.instrmtAssignmentMethod());
        }

        if (hasSecurityStatus())
        {
            encoder.securityStatusAsCopy(securityStatus.byteArray(), 0, securityStatusLength);
        }

        if (hasCouponPaymentDate())
        {
            encoder.couponPaymentDateAsCopy(couponPaymentDate.byteArray(), 0, couponPaymentDateLength);
        }

        if (hasRestructuringType())
        {
            encoder.restructuringTypeAsCopy(restructuringType.byteArray(), 0, restructuringTypeLength);
        }

        if (hasSeniority())
        {
            encoder.seniorityAsCopy(seniority.byteArray(), 0, seniorityLength);
        }

        if (hasNotionalPercentageOutstanding())
        {
            encoder.notionalPercentageOutstanding(this.notionalPercentageOutstanding());
        }

        if (hasOriginalNotionalPercentageOutstanding())
        {
            encoder.originalNotionalPercentageOutstanding(this.originalNotionalPercentageOutstanding());
        }

        if (hasAttachmentPoint())
        {
            encoder.attachmentPoint(this.attachmentPoint());
        }

        if (hasDetachmentPoint())
        {
            encoder.detachmentPoint(this.detachmentPoint());
        }

        if (hasIssueDate())
        {
            encoder.issueDateAsCopy(issueDate.byteArray(), 0, issueDateLength);
        }

        if (hasRepoCollateralSecurityType())
        {
            encoder.repoCollateralSecurityTypeAsCopy(repoCollateralSecurityType.byteArray(), 0, repoCollateralSecurityTypeLength);
        }

        if (hasRepurchaseTerm())
        {
            encoder.repurchaseTerm(this.repurchaseTerm());
        }

        if (hasRepurchaseRate())
        {
            encoder.repurchaseRate(this.repurchaseRate());
        }

        if (hasFactor())
        {
            encoder.factor(this.factor());
        }

        if (hasCreditRating())
        {
            encoder.creditRatingAsCopy(creditRating.byteArray(), 0, creditRatingLength);
        }

        if (hasInstrRegistry())
        {
            encoder.instrRegistryAsCopy(instrRegistry.byteArray(), 0, instrRegistryLength);
        }

        if (hasCountryOfIssue())
        {
            encoder.countryOfIssueAsCopy(countryOfIssue.byteArray(), 0, countryOfIssueLength);
        }

        if (hasStateOrProvinceOfIssue())
        {
            encoder.stateOrProvinceOfIssueAsCopy(stateOrProvinceOfIssue.byteArray(), 0, stateOrProvinceOfIssueLength);
        }

        if (hasLocaleOfIssue())
        {
            encoder.localeOfIssueAsCopy(localeOfIssue.byteArray(), 0, localeOfIssueLength);
        }

        if (hasRedemptionDate())
        {
            encoder.redemptionDateAsCopy(redemptionDate.byteArray(), 0, redemptionDateLength);
        }

        if (hasStrikePrice())
        {
            encoder.strikePrice(this.strikePrice());
        }

        if (hasStrikeCurrency())
        {
            encoder.strikeCurrencyAsCopy(strikeCurrency.byteArray(), 0, strikeCurrencyLength);
        }

        if (hasStrikeMultiplier())
        {
            encoder.strikeMultiplier(this.strikeMultiplier());
        }

        if (hasStrikeValue())
        {
            encoder.strikeValue(this.strikeValue());
        }

        if (hasStrikePriceDeterminationMethod())
        {
            encoder.strikePriceDeterminationMethod(this.strikePriceDeterminationMethod());
        }

        if (hasStrikePriceBoundaryMethod())
        {
            encoder.strikePriceBoundaryMethod(this.strikePriceBoundaryMethod());
        }

        if (hasStrikePriceBoundaryPrecision())
        {
            encoder.strikePriceBoundaryPrecision(this.strikePriceBoundaryPrecision());
        }

        if (hasUnderlyingPriceDeterminationMethod())
        {
            encoder.underlyingPriceDeterminationMethod(this.underlyingPriceDeterminationMethod());
        }

        if (hasOptAttribute())
        {
            encoder.optAttribute(this.optAttribute());
        }

        if (hasContractMultiplier())
        {
            encoder.contractMultiplier(this.contractMultiplier());
        }

        if (hasContractMultiplierUnit())
        {
            encoder.contractMultiplierUnit(this.contractMultiplierUnit());
        }

        if (hasFlowScheduleType())
        {
            encoder.flowScheduleType(this.flowScheduleType());
        }

        if (hasMinPriceIncrement())
        {
            encoder.minPriceIncrement(this.minPriceIncrement());
        }

        if (hasMinPriceIncrementAmount())
        {
            encoder.minPriceIncrementAmount(this.minPriceIncrementAmount());
        }

        if (hasUnitOfMeasure())
        {
            encoder.unitOfMeasureAsCopy(unitOfMeasure.byteArray(), 0, unitOfMeasureLength);
        }

        if (hasUnitOfMeasureQty())
        {
            encoder.unitOfMeasureQty(this.unitOfMeasureQty());
        }

        if (hasPriceUnitOfMeasure())
        {
            encoder.priceUnitOfMeasureAsCopy(priceUnitOfMeasure.byteArray(), 0, priceUnitOfMeasureLength);
        }

        if (hasPriceUnitOfMeasureQty())
        {
            encoder.priceUnitOfMeasureQty(this.priceUnitOfMeasureQty());
        }

        if (hasSettlMethod())
        {
            encoder.settlMethod(this.settlMethod());
        }

        if (hasExerciseStyle())
        {
            encoder.exerciseStyle(this.exerciseStyle());
        }

        if (hasOptPayoutType())
        {
            encoder.optPayoutType(this.optPayoutType());
        }

        if (hasOptPayoutAmount())
        {
            encoder.optPayoutAmount(this.optPayoutAmount());
        }

        if (hasPriceQuoteMethod())
        {
            encoder.priceQuoteMethodAsCopy(priceQuoteMethod.byteArray(), 0, priceQuoteMethodLength);
        }

        if (hasValuationMethod())
        {
            encoder.valuationMethodAsCopy(valuationMethod.byteArray(), 0, valuationMethodLength);
        }

        if (hasListMethod())
        {
            encoder.listMethod(this.listMethod());
        }

        if (hasCapPrice())
        {
            encoder.capPrice(this.capPrice());
        }

        if (hasFloorPrice())
        {
            encoder.floorPrice(this.floorPrice());
        }

        if (hasPutOrCall())
        {
            encoder.putOrCall(this.putOrCall());
        }

        if (hasFlexibleIndicator())
        {
            encoder.flexibleIndicator(this.flexibleIndicator());
        }

        if (hasFlexProductEligibilityIndicator())
        {
            encoder.flexProductEligibilityIndicator(this.flexProductEligibilityIndicator());
        }

        if (hasTimeUnit())
        {
            encoder.timeUnitAsCopy(timeUnit.byteArray(), 0, timeUnitLength);
        }

        if (hasCouponRate())
        {
            encoder.couponRate(this.couponRate());
        }

        if (hasSecurityExchange())
        {
            encoder.securityExchangeAsCopy(securityExchange.byteArray(), 0, securityExchangeLength);
        }

        if (hasPositionLimit())
        {
            encoder.positionLimit(this.positionLimit());
        }

        if (hasNTPositionLimit())
        {
            encoder.nTPositionLimit(this.nTPositionLimit());
        }

        if (hasIssuer())
        {
            encoder.issuerAsCopy(issuer.byteArray(), 0, issuerLength);
        }

        if (hasEncodedIssuerLen())
        {
            encoder.encodedIssuerLen(this.encodedIssuerLen());
        }

        if (hasEncodedIssuer())
        {
            encoder.encodedIssuerAsCopy(this.encodedIssuer(), 0, encodedIssuerLen());
            encoder.encodedIssuerLen(encodedIssuerLen());
        }

        if (hasSecurityDesc())
        {
            encoder.securityDescAsCopy(securityDesc.byteArray(), 0, securityDescLength);
        }

        if (hasEncodedSecurityDescLen())
        {
            encoder.encodedSecurityDescLen(this.encodedSecurityDescLen());
        }

        if (hasEncodedSecurityDesc())
        {
            encoder.encodedSecurityDescAsCopy(this.encodedSecurityDesc(), 0, encodedSecurityDescLen());
            encoder.encodedSecurityDescLen(encodedSecurityDescLen());
        }


        securityXML.copyTo(encoder.securityXML());
        if (hasPool())
        {
            encoder.poolAsCopy(pool.byteArray(), 0, poolLength);
        }

        if (hasContractSettlMonth())
        {
            encoder.contractSettlMonthAsCopy(contractSettlMonth.byteArray(), 0, contractSettlMonthLength);
        }

        if (hasCPProgram())
        {
            encoder.cPProgram(this.cPProgram());
        }

        if (hasCPRegType())
        {
            encoder.cPRegTypeAsCopy(cPRegType.byteArray(), 0, cPRegTypeLength);
        }


        evntGrp.copyTo(encoder.evntGrp());
        if (hasDatedDate())
        {
            encoder.datedDateAsCopy(datedDate.byteArray(), 0, datedDateLength);
        }

        if (hasInterestAccrualDate())
        {
            encoder.interestAccrualDateAsCopy(interestAccrualDate.byteArray(), 0, interestAccrualDateLength);
        }


        instrumentParties.copyTo(encoder.instrumentParties());

        complexEvents.copyTo(encoder.complexEvents());        return encoder;
    }

}
