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


public class InstrumentLegEncoder
{
    private static final int legSymbolHeaderLength = 4;
    private static final byte[] legSymbolHeader = new byte[] {54, 48, 48, (byte) '='};

    private static final int legSymbolSfxHeaderLength = 4;
    private static final byte[] legSymbolSfxHeader = new byte[] {54, 48, 49, (byte) '='};

    private static final int legSecurityIDHeaderLength = 4;
    private static final byte[] legSecurityIDHeader = new byte[] {54, 48, 50, (byte) '='};

    private static final int legSecurityIDSourceHeaderLength = 4;
    private static final byte[] legSecurityIDSourceHeader = new byte[] {54, 48, 51, (byte) '='};

    private static final int legProductHeaderLength = 4;
    private static final byte[] legProductHeader = new byte[] {54, 48, 55, (byte) '='};

    private static final int legCFICodeHeaderLength = 4;
    private static final byte[] legCFICodeHeader = new byte[] {54, 48, 56, (byte) '='};

    private static final int legSecurityTypeHeaderLength = 4;
    private static final byte[] legSecurityTypeHeader = new byte[] {54, 48, 57, (byte) '='};

    private static final int legSecuritySubTypeHeaderLength = 4;
    private static final byte[] legSecuritySubTypeHeader = new byte[] {55, 54, 52, (byte) '='};

    private static final int legMaturityMonthYearHeaderLength = 4;
    private static final byte[] legMaturityMonthYearHeader = new byte[] {54, 49, 48, (byte) '='};

    private static final int legMaturityDateHeaderLength = 4;
    private static final byte[] legMaturityDateHeader = new byte[] {54, 49, 49, (byte) '='};

    private static final int legMaturityTimeHeaderLength = 5;
    private static final byte[] legMaturityTimeHeader = new byte[] {49, 50, 49, 50, (byte) '='};

    private static final int legCouponPaymentDateHeaderLength = 4;
    private static final byte[] legCouponPaymentDateHeader = new byte[] {50, 52, 56, (byte) '='};

    private static final int legIssueDateHeaderLength = 4;
    private static final byte[] legIssueDateHeader = new byte[] {50, 52, 57, (byte) '='};

    private static final int legRepoCollateralSecurityTypeHeaderLength = 4;
    private static final byte[] legRepoCollateralSecurityTypeHeader = new byte[] {50, 53, 48, (byte) '='};

    private static final int legRepurchaseTermHeaderLength = 4;
    private static final byte[] legRepurchaseTermHeader = new byte[] {50, 53, 49, (byte) '='};

    private static final int legRepurchaseRateHeaderLength = 4;
    private static final byte[] legRepurchaseRateHeader = new byte[] {50, 53, 50, (byte) '='};

    private static final int legFactorHeaderLength = 4;
    private static final byte[] legFactorHeader = new byte[] {50, 53, 51, (byte) '='};

    private static final int legCreditRatingHeaderLength = 4;
    private static final byte[] legCreditRatingHeader = new byte[] {50, 53, 55, (byte) '='};

    private static final int legInstrRegistryHeaderLength = 4;
    private static final byte[] legInstrRegistryHeader = new byte[] {53, 57, 57, (byte) '='};

    private static final int legCountryOfIssueHeaderLength = 4;
    private static final byte[] legCountryOfIssueHeader = new byte[] {53, 57, 54, (byte) '='};

    private static final int legStateOrProvinceOfIssueHeaderLength = 4;
    private static final byte[] legStateOrProvinceOfIssueHeader = new byte[] {53, 57, 55, (byte) '='};

    private static final int legLocaleOfIssueHeaderLength = 4;
    private static final byte[] legLocaleOfIssueHeader = new byte[] {53, 57, 56, (byte) '='};

    private static final int legRedemptionDateHeaderLength = 4;
    private static final byte[] legRedemptionDateHeader = new byte[] {50, 53, 52, (byte) '='};

    private static final int legStrikePriceHeaderLength = 4;
    private static final byte[] legStrikePriceHeader = new byte[] {54, 49, 50, (byte) '='};

    private static final int legStrikeCurrencyHeaderLength = 4;
    private static final byte[] legStrikeCurrencyHeader = new byte[] {57, 52, 50, (byte) '='};

    private static final int legOptAttributeHeaderLength = 4;
    private static final byte[] legOptAttributeHeader = new byte[] {54, 49, 51, (byte) '='};

    private static final int legContractMultiplierHeaderLength = 4;
    private static final byte[] legContractMultiplierHeader = new byte[] {54, 49, 52, (byte) '='};

    private static final int legContractMultiplierUnitHeaderLength = 5;
    private static final byte[] legContractMultiplierUnitHeader = new byte[] {49, 52, 51, 54, (byte) '='};

    private static final int legFlowScheduleTypeHeaderLength = 5;
    private static final byte[] legFlowScheduleTypeHeader = new byte[] {49, 52, 52, 48, (byte) '='};

    private static final int legUnitOfMeasureHeaderLength = 4;
    private static final byte[] legUnitOfMeasureHeader = new byte[] {57, 57, 57, (byte) '='};

    private static final int legUnitOfMeasureQtyHeaderLength = 5;
    private static final byte[] legUnitOfMeasureQtyHeader = new byte[] {49, 50, 50, 52, (byte) '='};

    private static final int legPriceUnitOfMeasureHeaderLength = 5;
    private static final byte[] legPriceUnitOfMeasureHeader = new byte[] {49, 52, 50, 49, (byte) '='};

    private static final int legPriceUnitOfMeasureQtyHeaderLength = 5;
    private static final byte[] legPriceUnitOfMeasureQtyHeader = new byte[] {49, 52, 50, 50, (byte) '='};

    private static final int legTimeUnitHeaderLength = 5;
    private static final byte[] legTimeUnitHeader = new byte[] {49, 48, 48, 49, (byte) '='};

    private static final int legExerciseStyleHeaderLength = 5;
    private static final byte[] legExerciseStyleHeader = new byte[] {49, 52, 50, 48, (byte) '='};

    private static final int legCouponRateHeaderLength = 4;
    private static final byte[] legCouponRateHeader = new byte[] {54, 49, 53, (byte) '='};

    private static final int legSecurityExchangeHeaderLength = 4;
    private static final byte[] legSecurityExchangeHeader = new byte[] {54, 49, 54, (byte) '='};

    private static final int legIssuerHeaderLength = 4;
    private static final byte[] legIssuerHeader = new byte[] {54, 49, 55, (byte) '='};

    private static final int encodedLegIssuerLenHeaderLength = 4;
    private static final byte[] encodedLegIssuerLenHeader = new byte[] {54, 49, 56, (byte) '='};

    private static final int encodedLegIssuerHeaderLength = 4;
    private static final byte[] encodedLegIssuerHeader = new byte[] {54, 49, 57, (byte) '='};

    private static final int legSecurityDescHeaderLength = 4;
    private static final byte[] legSecurityDescHeader = new byte[] {54, 50, 48, (byte) '='};

    private static final int encodedLegSecurityDescLenHeaderLength = 4;
    private static final byte[] encodedLegSecurityDescLenHeader = new byte[] {54, 50, 49, (byte) '='};

    private static final int encodedLegSecurityDescHeaderLength = 4;
    private static final byte[] encodedLegSecurityDescHeader = new byte[] {54, 50, 50, (byte) '='};

    private static final int legRatioQtyHeaderLength = 4;
    private static final byte[] legRatioQtyHeader = new byte[] {54, 50, 51, (byte) '='};

    private static final int legSideHeaderLength = 4;
    private static final byte[] legSideHeader = new byte[] {54, 50, 52, (byte) '='};

    private static final int legCurrencyHeaderLength = 4;
    private static final byte[] legCurrencyHeader = new byte[] {53, 53, 54, (byte) '='};

    private static final int legPoolHeaderLength = 4;
    private static final byte[] legPoolHeader = new byte[] {55, 52, 48, (byte) '='};

    private static final int legDatedDateHeaderLength = 4;
    private static final byte[] legDatedDateHeader = new byte[] {55, 51, 57, (byte) '='};

    private static final int legContractSettlMonthHeaderLength = 4;
    private static final byte[] legContractSettlMonthHeader = new byte[] {57, 53, 53, (byte) '='};

    private static final int legInterestAccrualDateHeaderLength = 4;
    private static final byte[] legInterestAccrualDateHeader = new byte[] {57, 53, 54, (byte) '='};

    private static final int legPutOrCallHeaderLength = 5;
    private static final byte[] legPutOrCallHeader = new byte[] {49, 51, 53, 56, (byte) '='};

    private static final int legOptionRatioHeaderLength = 5;
    private static final byte[] legOptionRatioHeader = new byte[] {49, 48, 49, 55, (byte) '='};

    private static final int legPriceHeaderLength = 4;
    private static final byte[] legPriceHeader = new byte[] {53, 54, 54, (byte) '='};

    private final MutableDirectBuffer legSymbol = new UnsafeBuffer();

    private int legSymbolOffset = 0;

    private int legSymbolLength = 0;

    public InstrumentLegEncoder legSymbol(final DirectBuffer value, final int offset, final int length)
    {
        legSymbol.wrap(value);
        legSymbolOffset = offset;
        legSymbolLength = length;
        return this;
    }

    public InstrumentLegEncoder legSymbol(final DirectBuffer value, final int length)
    {
        return legSymbol(value, 0, length);
    }

    public InstrumentLegEncoder legSymbol(final DirectBuffer value)
    {
        return legSymbol(value, 0, value.capacity());
    }

    public InstrumentLegEncoder legSymbol(final byte[] value, final int offset, final int length)
    {
        legSymbol.wrap(value);
        legSymbolOffset = offset;
        legSymbolLength = length;
        return this;
    }

    public InstrumentLegEncoder legSymbolAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(legSymbol, value, offset, length);
        legSymbolOffset = offset;
        legSymbolLength = length;
        return this;
    }

    public InstrumentLegEncoder legSymbol(final byte[] value, final int length)
    {
        return legSymbol(value, 0, length);
    }

    public InstrumentLegEncoder legSymbol(final byte[] value)
    {
        return legSymbol(value, 0, value.length);
    }

    public boolean hasLegSymbol()
    {
        return legSymbolLength > 0;
    }

    public MutableDirectBuffer legSymbol()
    {
        return legSymbol;
    }

    public String legSymbolAsString()
    {
        return legSymbol.getStringWithoutLengthAscii(legSymbolOffset, legSymbolLength);
    }

    public InstrumentLegEncoder legSymbol(final CharSequence value)
    {
        toBytes(value, legSymbol);
        legSymbolOffset = 0;
        legSymbolLength = value.length();
        return this;
    }

    public InstrumentLegEncoder legSymbol(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            legSymbol.wrap(buffer);
            legSymbolOffset = value.offset();
            legSymbolLength = value.length();
        }
        return this;
    }

    public InstrumentLegEncoder legSymbol(final char[] value)
    {
        return legSymbol(value, 0, value.length);
    }

    public InstrumentLegEncoder legSymbol(final char[] value, final int length)
    {
        return legSymbol(value, 0, length);
    }

    public InstrumentLegEncoder legSymbol(final char[] value, final int offset, final int length)
    {
        toBytes(value, legSymbol, offset, length);
        legSymbolOffset = 0;
        legSymbolLength = length;
        return this;
    }

    private final MutableDirectBuffer legSymbolSfx = new UnsafeBuffer();

    private int legSymbolSfxOffset = 0;

    private int legSymbolSfxLength = 0;

    public InstrumentLegEncoder legSymbolSfx(final DirectBuffer value, final int offset, final int length)
    {
        legSymbolSfx.wrap(value);
        legSymbolSfxOffset = offset;
        legSymbolSfxLength = length;
        return this;
    }

    public InstrumentLegEncoder legSymbolSfx(final DirectBuffer value, final int length)
    {
        return legSymbolSfx(value, 0, length);
    }

    public InstrumentLegEncoder legSymbolSfx(final DirectBuffer value)
    {
        return legSymbolSfx(value, 0, value.capacity());
    }

    public InstrumentLegEncoder legSymbolSfx(final byte[] value, final int offset, final int length)
    {
        legSymbolSfx.wrap(value);
        legSymbolSfxOffset = offset;
        legSymbolSfxLength = length;
        return this;
    }

    public InstrumentLegEncoder legSymbolSfxAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(legSymbolSfx, value, offset, length);
        legSymbolSfxOffset = offset;
        legSymbolSfxLength = length;
        return this;
    }

    public InstrumentLegEncoder legSymbolSfx(final byte[] value, final int length)
    {
        return legSymbolSfx(value, 0, length);
    }

    public InstrumentLegEncoder legSymbolSfx(final byte[] value)
    {
        return legSymbolSfx(value, 0, value.length);
    }

    public boolean hasLegSymbolSfx()
    {
        return legSymbolSfxLength > 0;
    }

    public MutableDirectBuffer legSymbolSfx()
    {
        return legSymbolSfx;
    }

    public String legSymbolSfxAsString()
    {
        return legSymbolSfx.getStringWithoutLengthAscii(legSymbolSfxOffset, legSymbolSfxLength);
    }

    public InstrumentLegEncoder legSymbolSfx(final CharSequence value)
    {
        toBytes(value, legSymbolSfx);
        legSymbolSfxOffset = 0;
        legSymbolSfxLength = value.length();
        return this;
    }

    public InstrumentLegEncoder legSymbolSfx(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            legSymbolSfx.wrap(buffer);
            legSymbolSfxOffset = value.offset();
            legSymbolSfxLength = value.length();
        }
        return this;
    }

    public InstrumentLegEncoder legSymbolSfx(final char[] value)
    {
        return legSymbolSfx(value, 0, value.length);
    }

    public InstrumentLegEncoder legSymbolSfx(final char[] value, final int length)
    {
        return legSymbolSfx(value, 0, length);
    }

    public InstrumentLegEncoder legSymbolSfx(final char[] value, final int offset, final int length)
    {
        toBytes(value, legSymbolSfx, offset, length);
        legSymbolSfxOffset = 0;
        legSymbolSfxLength = length;
        return this;
    }

    private final MutableDirectBuffer legSecurityID = new UnsafeBuffer();

    private int legSecurityIDOffset = 0;

    private int legSecurityIDLength = 0;

    public InstrumentLegEncoder legSecurityID(final DirectBuffer value, final int offset, final int length)
    {
        legSecurityID.wrap(value);
        legSecurityIDOffset = offset;
        legSecurityIDLength = length;
        return this;
    }

    public InstrumentLegEncoder legSecurityID(final DirectBuffer value, final int length)
    {
        return legSecurityID(value, 0, length);
    }

    public InstrumentLegEncoder legSecurityID(final DirectBuffer value)
    {
        return legSecurityID(value, 0, value.capacity());
    }

    public InstrumentLegEncoder legSecurityID(final byte[] value, final int offset, final int length)
    {
        legSecurityID.wrap(value);
        legSecurityIDOffset = offset;
        legSecurityIDLength = length;
        return this;
    }

    public InstrumentLegEncoder legSecurityIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(legSecurityID, value, offset, length);
        legSecurityIDOffset = offset;
        legSecurityIDLength = length;
        return this;
    }

    public InstrumentLegEncoder legSecurityID(final byte[] value, final int length)
    {
        return legSecurityID(value, 0, length);
    }

    public InstrumentLegEncoder legSecurityID(final byte[] value)
    {
        return legSecurityID(value, 0, value.length);
    }

    public boolean hasLegSecurityID()
    {
        return legSecurityIDLength > 0;
    }

    public MutableDirectBuffer legSecurityID()
    {
        return legSecurityID;
    }

    public String legSecurityIDAsString()
    {
        return legSecurityID.getStringWithoutLengthAscii(legSecurityIDOffset, legSecurityIDLength);
    }

    public InstrumentLegEncoder legSecurityID(final CharSequence value)
    {
        toBytes(value, legSecurityID);
        legSecurityIDOffset = 0;
        legSecurityIDLength = value.length();
        return this;
    }

    public InstrumentLegEncoder legSecurityID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            legSecurityID.wrap(buffer);
            legSecurityIDOffset = value.offset();
            legSecurityIDLength = value.length();
        }
        return this;
    }

    public InstrumentLegEncoder legSecurityID(final char[] value)
    {
        return legSecurityID(value, 0, value.length);
    }

    public InstrumentLegEncoder legSecurityID(final char[] value, final int length)
    {
        return legSecurityID(value, 0, length);
    }

    public InstrumentLegEncoder legSecurityID(final char[] value, final int offset, final int length)
    {
        toBytes(value, legSecurityID, offset, length);
        legSecurityIDOffset = 0;
        legSecurityIDLength = length;
        return this;
    }

    private final MutableDirectBuffer legSecurityIDSource = new UnsafeBuffer();

    private int legSecurityIDSourceOffset = 0;

    private int legSecurityIDSourceLength = 0;

    public InstrumentLegEncoder legSecurityIDSource(final DirectBuffer value, final int offset, final int length)
    {
        legSecurityIDSource.wrap(value);
        legSecurityIDSourceOffset = offset;
        legSecurityIDSourceLength = length;
        return this;
    }

    public InstrumentLegEncoder legSecurityIDSource(final DirectBuffer value, final int length)
    {
        return legSecurityIDSource(value, 0, length);
    }

    public InstrumentLegEncoder legSecurityIDSource(final DirectBuffer value)
    {
        return legSecurityIDSource(value, 0, value.capacity());
    }

    public InstrumentLegEncoder legSecurityIDSource(final byte[] value, final int offset, final int length)
    {
        legSecurityIDSource.wrap(value);
        legSecurityIDSourceOffset = offset;
        legSecurityIDSourceLength = length;
        return this;
    }

    public InstrumentLegEncoder legSecurityIDSourceAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(legSecurityIDSource, value, offset, length);
        legSecurityIDSourceOffset = offset;
        legSecurityIDSourceLength = length;
        return this;
    }

    public InstrumentLegEncoder legSecurityIDSource(final byte[] value, final int length)
    {
        return legSecurityIDSource(value, 0, length);
    }

    public InstrumentLegEncoder legSecurityIDSource(final byte[] value)
    {
        return legSecurityIDSource(value, 0, value.length);
    }

    public boolean hasLegSecurityIDSource()
    {
        return legSecurityIDSourceLength > 0;
    }

    public MutableDirectBuffer legSecurityIDSource()
    {
        return legSecurityIDSource;
    }

    public String legSecurityIDSourceAsString()
    {
        return legSecurityIDSource.getStringWithoutLengthAscii(legSecurityIDSourceOffset, legSecurityIDSourceLength);
    }

    public InstrumentLegEncoder legSecurityIDSource(final CharSequence value)
    {
        toBytes(value, legSecurityIDSource);
        legSecurityIDSourceOffset = 0;
        legSecurityIDSourceLength = value.length();
        return this;
    }

    public InstrumentLegEncoder legSecurityIDSource(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            legSecurityIDSource.wrap(buffer);
            legSecurityIDSourceOffset = value.offset();
            legSecurityIDSourceLength = value.length();
        }
        return this;
    }

    public InstrumentLegEncoder legSecurityIDSource(final char[] value)
    {
        return legSecurityIDSource(value, 0, value.length);
    }

    public InstrumentLegEncoder legSecurityIDSource(final char[] value, final int length)
    {
        return legSecurityIDSource(value, 0, length);
    }

    public InstrumentLegEncoder legSecurityIDSource(final char[] value, final int offset, final int length)
    {
        toBytes(value, legSecurityIDSource, offset, length);
        legSecurityIDSourceOffset = 0;
        legSecurityIDSourceLength = length;
        return this;
    }

    private final LegSecAltIDGrpEncoder legSecAltIDGrp = new LegSecAltIDGrpEncoder();
    public LegSecAltIDGrpEncoder legSecAltIDGrp()
    {
        return legSecAltIDGrp;
    }

    private int legProduct;

    private boolean hasLegProduct;

    public boolean hasLegProduct()
    {
        return hasLegProduct;
    }

    public InstrumentLegEncoder legProduct(int value)
    {
        legProduct = value;
        hasLegProduct = true;
        return this;
    }

    public int legProduct()
    {
        return legProduct;
    }

    private final MutableDirectBuffer legCFICode = new UnsafeBuffer();

    private int legCFICodeOffset = 0;

    private int legCFICodeLength = 0;

    public InstrumentLegEncoder legCFICode(final DirectBuffer value, final int offset, final int length)
    {
        legCFICode.wrap(value);
        legCFICodeOffset = offset;
        legCFICodeLength = length;
        return this;
    }

    public InstrumentLegEncoder legCFICode(final DirectBuffer value, final int length)
    {
        return legCFICode(value, 0, length);
    }

    public InstrumentLegEncoder legCFICode(final DirectBuffer value)
    {
        return legCFICode(value, 0, value.capacity());
    }

    public InstrumentLegEncoder legCFICode(final byte[] value, final int offset, final int length)
    {
        legCFICode.wrap(value);
        legCFICodeOffset = offset;
        legCFICodeLength = length;
        return this;
    }

    public InstrumentLegEncoder legCFICodeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(legCFICode, value, offset, length);
        legCFICodeOffset = offset;
        legCFICodeLength = length;
        return this;
    }

    public InstrumentLegEncoder legCFICode(final byte[] value, final int length)
    {
        return legCFICode(value, 0, length);
    }

    public InstrumentLegEncoder legCFICode(final byte[] value)
    {
        return legCFICode(value, 0, value.length);
    }

    public boolean hasLegCFICode()
    {
        return legCFICodeLength > 0;
    }

    public MutableDirectBuffer legCFICode()
    {
        return legCFICode;
    }

    public String legCFICodeAsString()
    {
        return legCFICode.getStringWithoutLengthAscii(legCFICodeOffset, legCFICodeLength);
    }

    public InstrumentLegEncoder legCFICode(final CharSequence value)
    {
        toBytes(value, legCFICode);
        legCFICodeOffset = 0;
        legCFICodeLength = value.length();
        return this;
    }

    public InstrumentLegEncoder legCFICode(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            legCFICode.wrap(buffer);
            legCFICodeOffset = value.offset();
            legCFICodeLength = value.length();
        }
        return this;
    }

    public InstrumentLegEncoder legCFICode(final char[] value)
    {
        return legCFICode(value, 0, value.length);
    }

    public InstrumentLegEncoder legCFICode(final char[] value, final int length)
    {
        return legCFICode(value, 0, length);
    }

    public InstrumentLegEncoder legCFICode(final char[] value, final int offset, final int length)
    {
        toBytes(value, legCFICode, offset, length);
        legCFICodeOffset = 0;
        legCFICodeLength = length;
        return this;
    }

    private final MutableDirectBuffer legSecurityType = new UnsafeBuffer();

    private int legSecurityTypeOffset = 0;

    private int legSecurityTypeLength = 0;

    public InstrumentLegEncoder legSecurityType(final DirectBuffer value, final int offset, final int length)
    {
        legSecurityType.wrap(value);
        legSecurityTypeOffset = offset;
        legSecurityTypeLength = length;
        return this;
    }

    public InstrumentLegEncoder legSecurityType(final DirectBuffer value, final int length)
    {
        return legSecurityType(value, 0, length);
    }

    public InstrumentLegEncoder legSecurityType(final DirectBuffer value)
    {
        return legSecurityType(value, 0, value.capacity());
    }

    public InstrumentLegEncoder legSecurityType(final byte[] value, final int offset, final int length)
    {
        legSecurityType.wrap(value);
        legSecurityTypeOffset = offset;
        legSecurityTypeLength = length;
        return this;
    }

    public InstrumentLegEncoder legSecurityTypeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(legSecurityType, value, offset, length);
        legSecurityTypeOffset = offset;
        legSecurityTypeLength = length;
        return this;
    }

    public InstrumentLegEncoder legSecurityType(final byte[] value, final int length)
    {
        return legSecurityType(value, 0, length);
    }

    public InstrumentLegEncoder legSecurityType(final byte[] value)
    {
        return legSecurityType(value, 0, value.length);
    }

    public boolean hasLegSecurityType()
    {
        return legSecurityTypeLength > 0;
    }

    public MutableDirectBuffer legSecurityType()
    {
        return legSecurityType;
    }

    public String legSecurityTypeAsString()
    {
        return legSecurityType.getStringWithoutLengthAscii(legSecurityTypeOffset, legSecurityTypeLength);
    }

    public InstrumentLegEncoder legSecurityType(final CharSequence value)
    {
        toBytes(value, legSecurityType);
        legSecurityTypeOffset = 0;
        legSecurityTypeLength = value.length();
        return this;
    }

    public InstrumentLegEncoder legSecurityType(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            legSecurityType.wrap(buffer);
            legSecurityTypeOffset = value.offset();
            legSecurityTypeLength = value.length();
        }
        return this;
    }

    public InstrumentLegEncoder legSecurityType(final char[] value)
    {
        return legSecurityType(value, 0, value.length);
    }

    public InstrumentLegEncoder legSecurityType(final char[] value, final int length)
    {
        return legSecurityType(value, 0, length);
    }

    public InstrumentLegEncoder legSecurityType(final char[] value, final int offset, final int length)
    {
        toBytes(value, legSecurityType, offset, length);
        legSecurityTypeOffset = 0;
        legSecurityTypeLength = length;
        return this;
    }

    private final MutableDirectBuffer legSecuritySubType = new UnsafeBuffer();

    private int legSecuritySubTypeOffset = 0;

    private int legSecuritySubTypeLength = 0;

    public InstrumentLegEncoder legSecuritySubType(final DirectBuffer value, final int offset, final int length)
    {
        legSecuritySubType.wrap(value);
        legSecuritySubTypeOffset = offset;
        legSecuritySubTypeLength = length;
        return this;
    }

    public InstrumentLegEncoder legSecuritySubType(final DirectBuffer value, final int length)
    {
        return legSecuritySubType(value, 0, length);
    }

    public InstrumentLegEncoder legSecuritySubType(final DirectBuffer value)
    {
        return legSecuritySubType(value, 0, value.capacity());
    }

    public InstrumentLegEncoder legSecuritySubType(final byte[] value, final int offset, final int length)
    {
        legSecuritySubType.wrap(value);
        legSecuritySubTypeOffset = offset;
        legSecuritySubTypeLength = length;
        return this;
    }

    public InstrumentLegEncoder legSecuritySubTypeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(legSecuritySubType, value, offset, length);
        legSecuritySubTypeOffset = offset;
        legSecuritySubTypeLength = length;
        return this;
    }

    public InstrumentLegEncoder legSecuritySubType(final byte[] value, final int length)
    {
        return legSecuritySubType(value, 0, length);
    }

    public InstrumentLegEncoder legSecuritySubType(final byte[] value)
    {
        return legSecuritySubType(value, 0, value.length);
    }

    public boolean hasLegSecuritySubType()
    {
        return legSecuritySubTypeLength > 0;
    }

    public MutableDirectBuffer legSecuritySubType()
    {
        return legSecuritySubType;
    }

    public String legSecuritySubTypeAsString()
    {
        return legSecuritySubType.getStringWithoutLengthAscii(legSecuritySubTypeOffset, legSecuritySubTypeLength);
    }

    public InstrumentLegEncoder legSecuritySubType(final CharSequence value)
    {
        toBytes(value, legSecuritySubType);
        legSecuritySubTypeOffset = 0;
        legSecuritySubTypeLength = value.length();
        return this;
    }

    public InstrumentLegEncoder legSecuritySubType(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            legSecuritySubType.wrap(buffer);
            legSecuritySubTypeOffset = value.offset();
            legSecuritySubTypeLength = value.length();
        }
        return this;
    }

    public InstrumentLegEncoder legSecuritySubType(final char[] value)
    {
        return legSecuritySubType(value, 0, value.length);
    }

    public InstrumentLegEncoder legSecuritySubType(final char[] value, final int length)
    {
        return legSecuritySubType(value, 0, length);
    }

    public InstrumentLegEncoder legSecuritySubType(final char[] value, final int offset, final int length)
    {
        toBytes(value, legSecuritySubType, offset, length);
        legSecuritySubTypeOffset = 0;
        legSecuritySubTypeLength = length;
        return this;
    }

    private final MutableDirectBuffer legMaturityMonthYear = new UnsafeBuffer();

    private int legMaturityMonthYearOffset = 0;

    private int legMaturityMonthYearLength = 0;

    public InstrumentLegEncoder legMaturityMonthYear(final DirectBuffer value, final int offset, final int length)
    {
        legMaturityMonthYear.wrap(value);
        legMaturityMonthYearOffset = offset;
        legMaturityMonthYearLength = length;
        return this;
    }

    public InstrumentLegEncoder legMaturityMonthYear(final DirectBuffer value, final int length)
    {
        return legMaturityMonthYear(value, 0, length);
    }

    public InstrumentLegEncoder legMaturityMonthYear(final DirectBuffer value)
    {
        return legMaturityMonthYear(value, 0, value.capacity());
    }

    public InstrumentLegEncoder legMaturityMonthYear(final byte[] value, final int offset, final int length)
    {
        legMaturityMonthYear.wrap(value);
        legMaturityMonthYearOffset = offset;
        legMaturityMonthYearLength = length;
        return this;
    }

    public InstrumentLegEncoder legMaturityMonthYearAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(legMaturityMonthYear, value, offset, length);
        legMaturityMonthYearOffset = offset;
        legMaturityMonthYearLength = length;
        return this;
    }

    public InstrumentLegEncoder legMaturityMonthYear(final byte[] value, final int length)
    {
        return legMaturityMonthYear(value, 0, length);
    }

    public InstrumentLegEncoder legMaturityMonthYear(final byte[] value)
    {
        return legMaturityMonthYear(value, 0, value.length);
    }

    public boolean hasLegMaturityMonthYear()
    {
        return legMaturityMonthYearLength > 0;
    }

    public MutableDirectBuffer legMaturityMonthYear()
    {
        return legMaturityMonthYear;
    }

    public String legMaturityMonthYearAsString()
    {
        return legMaturityMonthYear.getStringWithoutLengthAscii(legMaturityMonthYearOffset, legMaturityMonthYearLength);
    }

    private final MutableDirectBuffer legMaturityDate = new UnsafeBuffer();

    private int legMaturityDateOffset = 0;

    private int legMaturityDateLength = 0;

    public InstrumentLegEncoder legMaturityDate(final DirectBuffer value, final int offset, final int length)
    {
        legMaturityDate.wrap(value);
        legMaturityDateOffset = offset;
        legMaturityDateLength = length;
        return this;
    }

    public InstrumentLegEncoder legMaturityDate(final DirectBuffer value, final int length)
    {
        return legMaturityDate(value, 0, length);
    }

    public InstrumentLegEncoder legMaturityDate(final DirectBuffer value)
    {
        return legMaturityDate(value, 0, value.capacity());
    }

    public InstrumentLegEncoder legMaturityDate(final byte[] value, final int offset, final int length)
    {
        legMaturityDate.wrap(value);
        legMaturityDateOffset = offset;
        legMaturityDateLength = length;
        return this;
    }

    public InstrumentLegEncoder legMaturityDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(legMaturityDate, value, offset, length);
        legMaturityDateOffset = offset;
        legMaturityDateLength = length;
        return this;
    }

    public InstrumentLegEncoder legMaturityDate(final byte[] value, final int length)
    {
        return legMaturityDate(value, 0, length);
    }

    public InstrumentLegEncoder legMaturityDate(final byte[] value)
    {
        return legMaturityDate(value, 0, value.length);
    }

    public boolean hasLegMaturityDate()
    {
        return legMaturityDateLength > 0;
    }

    public MutableDirectBuffer legMaturityDate()
    {
        return legMaturityDate;
    }

    public String legMaturityDateAsString()
    {
        return legMaturityDate.getStringWithoutLengthAscii(legMaturityDateOffset, legMaturityDateLength);
    }

    private final MutableDirectBuffer legMaturityTime = new UnsafeBuffer();

    private int legMaturityTimeOffset = 0;

    private int legMaturityTimeLength = 0;

    public InstrumentLegEncoder legMaturityTime(final DirectBuffer value, final int offset, final int length)
    {
        legMaturityTime.wrap(value);
        legMaturityTimeOffset = offset;
        legMaturityTimeLength = length;
        return this;
    }

    public InstrumentLegEncoder legMaturityTime(final DirectBuffer value, final int length)
    {
        return legMaturityTime(value, 0, length);
    }

    public InstrumentLegEncoder legMaturityTime(final DirectBuffer value)
    {
        return legMaturityTime(value, 0, value.capacity());
    }

    public InstrumentLegEncoder legMaturityTime(final byte[] value, final int offset, final int length)
    {
        legMaturityTime.wrap(value);
        legMaturityTimeOffset = offset;
        legMaturityTimeLength = length;
        return this;
    }

    public InstrumentLegEncoder legMaturityTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(legMaturityTime, value, offset, length);
        legMaturityTimeOffset = offset;
        legMaturityTimeLength = length;
        return this;
    }

    public InstrumentLegEncoder legMaturityTime(final byte[] value, final int length)
    {
        return legMaturityTime(value, 0, length);
    }

    public InstrumentLegEncoder legMaturityTime(final byte[] value)
    {
        return legMaturityTime(value, 0, value.length);
    }

    public boolean hasLegMaturityTime()
    {
        return legMaturityTimeLength > 0;
    }

    public MutableDirectBuffer legMaturityTime()
    {
        return legMaturityTime;
    }

    public String legMaturityTimeAsString()
    {
        return legMaturityTime.getStringWithoutLengthAscii(legMaturityTimeOffset, legMaturityTimeLength);
    }

    private final MutableDirectBuffer legCouponPaymentDate = new UnsafeBuffer();

    private int legCouponPaymentDateOffset = 0;

    private int legCouponPaymentDateLength = 0;

    public InstrumentLegEncoder legCouponPaymentDate(final DirectBuffer value, final int offset, final int length)
    {
        legCouponPaymentDate.wrap(value);
        legCouponPaymentDateOffset = offset;
        legCouponPaymentDateLength = length;
        return this;
    }

    public InstrumentLegEncoder legCouponPaymentDate(final DirectBuffer value, final int length)
    {
        return legCouponPaymentDate(value, 0, length);
    }

    public InstrumentLegEncoder legCouponPaymentDate(final DirectBuffer value)
    {
        return legCouponPaymentDate(value, 0, value.capacity());
    }

    public InstrumentLegEncoder legCouponPaymentDate(final byte[] value, final int offset, final int length)
    {
        legCouponPaymentDate.wrap(value);
        legCouponPaymentDateOffset = offset;
        legCouponPaymentDateLength = length;
        return this;
    }

    public InstrumentLegEncoder legCouponPaymentDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(legCouponPaymentDate, value, offset, length);
        legCouponPaymentDateOffset = offset;
        legCouponPaymentDateLength = length;
        return this;
    }

    public InstrumentLegEncoder legCouponPaymentDate(final byte[] value, final int length)
    {
        return legCouponPaymentDate(value, 0, length);
    }

    public InstrumentLegEncoder legCouponPaymentDate(final byte[] value)
    {
        return legCouponPaymentDate(value, 0, value.length);
    }

    public boolean hasLegCouponPaymentDate()
    {
        return legCouponPaymentDateLength > 0;
    }

    public MutableDirectBuffer legCouponPaymentDate()
    {
        return legCouponPaymentDate;
    }

    public String legCouponPaymentDateAsString()
    {
        return legCouponPaymentDate.getStringWithoutLengthAscii(legCouponPaymentDateOffset, legCouponPaymentDateLength);
    }

    private final MutableDirectBuffer legIssueDate = new UnsafeBuffer();

    private int legIssueDateOffset = 0;

    private int legIssueDateLength = 0;

    public InstrumentLegEncoder legIssueDate(final DirectBuffer value, final int offset, final int length)
    {
        legIssueDate.wrap(value);
        legIssueDateOffset = offset;
        legIssueDateLength = length;
        return this;
    }

    public InstrumentLegEncoder legIssueDate(final DirectBuffer value, final int length)
    {
        return legIssueDate(value, 0, length);
    }

    public InstrumentLegEncoder legIssueDate(final DirectBuffer value)
    {
        return legIssueDate(value, 0, value.capacity());
    }

    public InstrumentLegEncoder legIssueDate(final byte[] value, final int offset, final int length)
    {
        legIssueDate.wrap(value);
        legIssueDateOffset = offset;
        legIssueDateLength = length;
        return this;
    }

    public InstrumentLegEncoder legIssueDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(legIssueDate, value, offset, length);
        legIssueDateOffset = offset;
        legIssueDateLength = length;
        return this;
    }

    public InstrumentLegEncoder legIssueDate(final byte[] value, final int length)
    {
        return legIssueDate(value, 0, length);
    }

    public InstrumentLegEncoder legIssueDate(final byte[] value)
    {
        return legIssueDate(value, 0, value.length);
    }

    public boolean hasLegIssueDate()
    {
        return legIssueDateLength > 0;
    }

    public MutableDirectBuffer legIssueDate()
    {
        return legIssueDate;
    }

    public String legIssueDateAsString()
    {
        return legIssueDate.getStringWithoutLengthAscii(legIssueDateOffset, legIssueDateLength);
    }

    private final MutableDirectBuffer legRepoCollateralSecurityType = new UnsafeBuffer();

    private int legRepoCollateralSecurityTypeOffset = 0;

    private int legRepoCollateralSecurityTypeLength = 0;

    public InstrumentLegEncoder legRepoCollateralSecurityType(final DirectBuffer value, final int offset, final int length)
    {
        legRepoCollateralSecurityType.wrap(value);
        legRepoCollateralSecurityTypeOffset = offset;
        legRepoCollateralSecurityTypeLength = length;
        return this;
    }

    public InstrumentLegEncoder legRepoCollateralSecurityType(final DirectBuffer value, final int length)
    {
        return legRepoCollateralSecurityType(value, 0, length);
    }

    public InstrumentLegEncoder legRepoCollateralSecurityType(final DirectBuffer value)
    {
        return legRepoCollateralSecurityType(value, 0, value.capacity());
    }

    public InstrumentLegEncoder legRepoCollateralSecurityType(final byte[] value, final int offset, final int length)
    {
        legRepoCollateralSecurityType.wrap(value);
        legRepoCollateralSecurityTypeOffset = offset;
        legRepoCollateralSecurityTypeLength = length;
        return this;
    }

    public InstrumentLegEncoder legRepoCollateralSecurityTypeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(legRepoCollateralSecurityType, value, offset, length);
        legRepoCollateralSecurityTypeOffset = offset;
        legRepoCollateralSecurityTypeLength = length;
        return this;
    }

    public InstrumentLegEncoder legRepoCollateralSecurityType(final byte[] value, final int length)
    {
        return legRepoCollateralSecurityType(value, 0, length);
    }

    public InstrumentLegEncoder legRepoCollateralSecurityType(final byte[] value)
    {
        return legRepoCollateralSecurityType(value, 0, value.length);
    }

    public boolean hasLegRepoCollateralSecurityType()
    {
        return legRepoCollateralSecurityTypeLength > 0;
    }

    public MutableDirectBuffer legRepoCollateralSecurityType()
    {
        return legRepoCollateralSecurityType;
    }

    public String legRepoCollateralSecurityTypeAsString()
    {
        return legRepoCollateralSecurityType.getStringWithoutLengthAscii(legRepoCollateralSecurityTypeOffset, legRepoCollateralSecurityTypeLength);
    }

    public InstrumentLegEncoder legRepoCollateralSecurityType(final CharSequence value)
    {
        toBytes(value, legRepoCollateralSecurityType);
        legRepoCollateralSecurityTypeOffset = 0;
        legRepoCollateralSecurityTypeLength = value.length();
        return this;
    }

    public InstrumentLegEncoder legRepoCollateralSecurityType(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            legRepoCollateralSecurityType.wrap(buffer);
            legRepoCollateralSecurityTypeOffset = value.offset();
            legRepoCollateralSecurityTypeLength = value.length();
        }
        return this;
    }

    public InstrumentLegEncoder legRepoCollateralSecurityType(final char[] value)
    {
        return legRepoCollateralSecurityType(value, 0, value.length);
    }

    public InstrumentLegEncoder legRepoCollateralSecurityType(final char[] value, final int length)
    {
        return legRepoCollateralSecurityType(value, 0, length);
    }

    public InstrumentLegEncoder legRepoCollateralSecurityType(final char[] value, final int offset, final int length)
    {
        toBytes(value, legRepoCollateralSecurityType, offset, length);
        legRepoCollateralSecurityTypeOffset = 0;
        legRepoCollateralSecurityTypeLength = length;
        return this;
    }

    private int legRepurchaseTerm;

    private boolean hasLegRepurchaseTerm;

    public boolean hasLegRepurchaseTerm()
    {
        return hasLegRepurchaseTerm;
    }

    public InstrumentLegEncoder legRepurchaseTerm(int value)
    {
        legRepurchaseTerm = value;
        hasLegRepurchaseTerm = true;
        return this;
    }

    public int legRepurchaseTerm()
    {
        return legRepurchaseTerm;
    }

    private final DecimalFloat legRepurchaseRate = new DecimalFloat();

    private boolean hasLegRepurchaseRate;

    public boolean hasLegRepurchaseRate()
    {
        return hasLegRepurchaseRate;
    }

    public InstrumentLegEncoder legRepurchaseRate(DecimalFloat value)
    {
        legRepurchaseRate.set(value);
        hasLegRepurchaseRate = true;
        return this;
    }

    public InstrumentLegEncoder legRepurchaseRate(long value, int scale)
    {
        legRepurchaseRate.set(value, scale);
        hasLegRepurchaseRate = true;
        return this;
    }

    public DecimalFloat legRepurchaseRate()
    {
        return legRepurchaseRate;
    }

    private final DecimalFloat legFactor = new DecimalFloat();

    private boolean hasLegFactor;

    public boolean hasLegFactor()
    {
        return hasLegFactor;
    }

    public InstrumentLegEncoder legFactor(DecimalFloat value)
    {
        legFactor.set(value);
        hasLegFactor = true;
        return this;
    }

    public InstrumentLegEncoder legFactor(long value, int scale)
    {
        legFactor.set(value, scale);
        hasLegFactor = true;
        return this;
    }

    public DecimalFloat legFactor()
    {
        return legFactor;
    }

    private final MutableDirectBuffer legCreditRating = new UnsafeBuffer();

    private int legCreditRatingOffset = 0;

    private int legCreditRatingLength = 0;

    public InstrumentLegEncoder legCreditRating(final DirectBuffer value, final int offset, final int length)
    {
        legCreditRating.wrap(value);
        legCreditRatingOffset = offset;
        legCreditRatingLength = length;
        return this;
    }

    public InstrumentLegEncoder legCreditRating(final DirectBuffer value, final int length)
    {
        return legCreditRating(value, 0, length);
    }

    public InstrumentLegEncoder legCreditRating(final DirectBuffer value)
    {
        return legCreditRating(value, 0, value.capacity());
    }

    public InstrumentLegEncoder legCreditRating(final byte[] value, final int offset, final int length)
    {
        legCreditRating.wrap(value);
        legCreditRatingOffset = offset;
        legCreditRatingLength = length;
        return this;
    }

    public InstrumentLegEncoder legCreditRatingAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(legCreditRating, value, offset, length);
        legCreditRatingOffset = offset;
        legCreditRatingLength = length;
        return this;
    }

    public InstrumentLegEncoder legCreditRating(final byte[] value, final int length)
    {
        return legCreditRating(value, 0, length);
    }

    public InstrumentLegEncoder legCreditRating(final byte[] value)
    {
        return legCreditRating(value, 0, value.length);
    }

    public boolean hasLegCreditRating()
    {
        return legCreditRatingLength > 0;
    }

    public MutableDirectBuffer legCreditRating()
    {
        return legCreditRating;
    }

    public String legCreditRatingAsString()
    {
        return legCreditRating.getStringWithoutLengthAscii(legCreditRatingOffset, legCreditRatingLength);
    }

    public InstrumentLegEncoder legCreditRating(final CharSequence value)
    {
        toBytes(value, legCreditRating);
        legCreditRatingOffset = 0;
        legCreditRatingLength = value.length();
        return this;
    }

    public InstrumentLegEncoder legCreditRating(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            legCreditRating.wrap(buffer);
            legCreditRatingOffset = value.offset();
            legCreditRatingLength = value.length();
        }
        return this;
    }

    public InstrumentLegEncoder legCreditRating(final char[] value)
    {
        return legCreditRating(value, 0, value.length);
    }

    public InstrumentLegEncoder legCreditRating(final char[] value, final int length)
    {
        return legCreditRating(value, 0, length);
    }

    public InstrumentLegEncoder legCreditRating(final char[] value, final int offset, final int length)
    {
        toBytes(value, legCreditRating, offset, length);
        legCreditRatingOffset = 0;
        legCreditRatingLength = length;
        return this;
    }

    private final MutableDirectBuffer legInstrRegistry = new UnsafeBuffer();

    private int legInstrRegistryOffset = 0;

    private int legInstrRegistryLength = 0;

    public InstrumentLegEncoder legInstrRegistry(final DirectBuffer value, final int offset, final int length)
    {
        legInstrRegistry.wrap(value);
        legInstrRegistryOffset = offset;
        legInstrRegistryLength = length;
        return this;
    }

    public InstrumentLegEncoder legInstrRegistry(final DirectBuffer value, final int length)
    {
        return legInstrRegistry(value, 0, length);
    }

    public InstrumentLegEncoder legInstrRegistry(final DirectBuffer value)
    {
        return legInstrRegistry(value, 0, value.capacity());
    }

    public InstrumentLegEncoder legInstrRegistry(final byte[] value, final int offset, final int length)
    {
        legInstrRegistry.wrap(value);
        legInstrRegistryOffset = offset;
        legInstrRegistryLength = length;
        return this;
    }

    public InstrumentLegEncoder legInstrRegistryAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(legInstrRegistry, value, offset, length);
        legInstrRegistryOffset = offset;
        legInstrRegistryLength = length;
        return this;
    }

    public InstrumentLegEncoder legInstrRegistry(final byte[] value, final int length)
    {
        return legInstrRegistry(value, 0, length);
    }

    public InstrumentLegEncoder legInstrRegistry(final byte[] value)
    {
        return legInstrRegistry(value, 0, value.length);
    }

    public boolean hasLegInstrRegistry()
    {
        return legInstrRegistryLength > 0;
    }

    public MutableDirectBuffer legInstrRegistry()
    {
        return legInstrRegistry;
    }

    public String legInstrRegistryAsString()
    {
        return legInstrRegistry.getStringWithoutLengthAscii(legInstrRegistryOffset, legInstrRegistryLength);
    }

    public InstrumentLegEncoder legInstrRegistry(final CharSequence value)
    {
        toBytes(value, legInstrRegistry);
        legInstrRegistryOffset = 0;
        legInstrRegistryLength = value.length();
        return this;
    }

    public InstrumentLegEncoder legInstrRegistry(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            legInstrRegistry.wrap(buffer);
            legInstrRegistryOffset = value.offset();
            legInstrRegistryLength = value.length();
        }
        return this;
    }

    public InstrumentLegEncoder legInstrRegistry(final char[] value)
    {
        return legInstrRegistry(value, 0, value.length);
    }

    public InstrumentLegEncoder legInstrRegistry(final char[] value, final int length)
    {
        return legInstrRegistry(value, 0, length);
    }

    public InstrumentLegEncoder legInstrRegistry(final char[] value, final int offset, final int length)
    {
        toBytes(value, legInstrRegistry, offset, length);
        legInstrRegistryOffset = 0;
        legInstrRegistryLength = length;
        return this;
    }

    private final MutableDirectBuffer legCountryOfIssue = new UnsafeBuffer();

    private int legCountryOfIssueOffset = 0;

    private int legCountryOfIssueLength = 0;

    public InstrumentLegEncoder legCountryOfIssue(final DirectBuffer value, final int offset, final int length)
    {
        legCountryOfIssue.wrap(value);
        legCountryOfIssueOffset = offset;
        legCountryOfIssueLength = length;
        return this;
    }

    public InstrumentLegEncoder legCountryOfIssue(final DirectBuffer value, final int length)
    {
        return legCountryOfIssue(value, 0, length);
    }

    public InstrumentLegEncoder legCountryOfIssue(final DirectBuffer value)
    {
        return legCountryOfIssue(value, 0, value.capacity());
    }

    public InstrumentLegEncoder legCountryOfIssue(final byte[] value, final int offset, final int length)
    {
        legCountryOfIssue.wrap(value);
        legCountryOfIssueOffset = offset;
        legCountryOfIssueLength = length;
        return this;
    }

    public InstrumentLegEncoder legCountryOfIssueAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(legCountryOfIssue, value, offset, length);
        legCountryOfIssueOffset = offset;
        legCountryOfIssueLength = length;
        return this;
    }

    public InstrumentLegEncoder legCountryOfIssue(final byte[] value, final int length)
    {
        return legCountryOfIssue(value, 0, length);
    }

    public InstrumentLegEncoder legCountryOfIssue(final byte[] value)
    {
        return legCountryOfIssue(value, 0, value.length);
    }

    public boolean hasLegCountryOfIssue()
    {
        return legCountryOfIssueLength > 0;
    }

    public MutableDirectBuffer legCountryOfIssue()
    {
        return legCountryOfIssue;
    }

    public String legCountryOfIssueAsString()
    {
        return legCountryOfIssue.getStringWithoutLengthAscii(legCountryOfIssueOffset, legCountryOfIssueLength);
    }

    public InstrumentLegEncoder legCountryOfIssue(final CharSequence value)
    {
        toBytes(value, legCountryOfIssue);
        legCountryOfIssueOffset = 0;
        legCountryOfIssueLength = value.length();
        return this;
    }

    public InstrumentLegEncoder legCountryOfIssue(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            legCountryOfIssue.wrap(buffer);
            legCountryOfIssueOffset = value.offset();
            legCountryOfIssueLength = value.length();
        }
        return this;
    }

    public InstrumentLegEncoder legCountryOfIssue(final char[] value)
    {
        return legCountryOfIssue(value, 0, value.length);
    }

    public InstrumentLegEncoder legCountryOfIssue(final char[] value, final int length)
    {
        return legCountryOfIssue(value, 0, length);
    }

    public InstrumentLegEncoder legCountryOfIssue(final char[] value, final int offset, final int length)
    {
        toBytes(value, legCountryOfIssue, offset, length);
        legCountryOfIssueOffset = 0;
        legCountryOfIssueLength = length;
        return this;
    }

    private final MutableDirectBuffer legStateOrProvinceOfIssue = new UnsafeBuffer();

    private int legStateOrProvinceOfIssueOffset = 0;

    private int legStateOrProvinceOfIssueLength = 0;

    public InstrumentLegEncoder legStateOrProvinceOfIssue(final DirectBuffer value, final int offset, final int length)
    {
        legStateOrProvinceOfIssue.wrap(value);
        legStateOrProvinceOfIssueOffset = offset;
        legStateOrProvinceOfIssueLength = length;
        return this;
    }

    public InstrumentLegEncoder legStateOrProvinceOfIssue(final DirectBuffer value, final int length)
    {
        return legStateOrProvinceOfIssue(value, 0, length);
    }

    public InstrumentLegEncoder legStateOrProvinceOfIssue(final DirectBuffer value)
    {
        return legStateOrProvinceOfIssue(value, 0, value.capacity());
    }

    public InstrumentLegEncoder legStateOrProvinceOfIssue(final byte[] value, final int offset, final int length)
    {
        legStateOrProvinceOfIssue.wrap(value);
        legStateOrProvinceOfIssueOffset = offset;
        legStateOrProvinceOfIssueLength = length;
        return this;
    }

    public InstrumentLegEncoder legStateOrProvinceOfIssueAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(legStateOrProvinceOfIssue, value, offset, length);
        legStateOrProvinceOfIssueOffset = offset;
        legStateOrProvinceOfIssueLength = length;
        return this;
    }

    public InstrumentLegEncoder legStateOrProvinceOfIssue(final byte[] value, final int length)
    {
        return legStateOrProvinceOfIssue(value, 0, length);
    }

    public InstrumentLegEncoder legStateOrProvinceOfIssue(final byte[] value)
    {
        return legStateOrProvinceOfIssue(value, 0, value.length);
    }

    public boolean hasLegStateOrProvinceOfIssue()
    {
        return legStateOrProvinceOfIssueLength > 0;
    }

    public MutableDirectBuffer legStateOrProvinceOfIssue()
    {
        return legStateOrProvinceOfIssue;
    }

    public String legStateOrProvinceOfIssueAsString()
    {
        return legStateOrProvinceOfIssue.getStringWithoutLengthAscii(legStateOrProvinceOfIssueOffset, legStateOrProvinceOfIssueLength);
    }

    public InstrumentLegEncoder legStateOrProvinceOfIssue(final CharSequence value)
    {
        toBytes(value, legStateOrProvinceOfIssue);
        legStateOrProvinceOfIssueOffset = 0;
        legStateOrProvinceOfIssueLength = value.length();
        return this;
    }

    public InstrumentLegEncoder legStateOrProvinceOfIssue(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            legStateOrProvinceOfIssue.wrap(buffer);
            legStateOrProvinceOfIssueOffset = value.offset();
            legStateOrProvinceOfIssueLength = value.length();
        }
        return this;
    }

    public InstrumentLegEncoder legStateOrProvinceOfIssue(final char[] value)
    {
        return legStateOrProvinceOfIssue(value, 0, value.length);
    }

    public InstrumentLegEncoder legStateOrProvinceOfIssue(final char[] value, final int length)
    {
        return legStateOrProvinceOfIssue(value, 0, length);
    }

    public InstrumentLegEncoder legStateOrProvinceOfIssue(final char[] value, final int offset, final int length)
    {
        toBytes(value, legStateOrProvinceOfIssue, offset, length);
        legStateOrProvinceOfIssueOffset = 0;
        legStateOrProvinceOfIssueLength = length;
        return this;
    }

    private final MutableDirectBuffer legLocaleOfIssue = new UnsafeBuffer();

    private int legLocaleOfIssueOffset = 0;

    private int legLocaleOfIssueLength = 0;

    public InstrumentLegEncoder legLocaleOfIssue(final DirectBuffer value, final int offset, final int length)
    {
        legLocaleOfIssue.wrap(value);
        legLocaleOfIssueOffset = offset;
        legLocaleOfIssueLength = length;
        return this;
    }

    public InstrumentLegEncoder legLocaleOfIssue(final DirectBuffer value, final int length)
    {
        return legLocaleOfIssue(value, 0, length);
    }

    public InstrumentLegEncoder legLocaleOfIssue(final DirectBuffer value)
    {
        return legLocaleOfIssue(value, 0, value.capacity());
    }

    public InstrumentLegEncoder legLocaleOfIssue(final byte[] value, final int offset, final int length)
    {
        legLocaleOfIssue.wrap(value);
        legLocaleOfIssueOffset = offset;
        legLocaleOfIssueLength = length;
        return this;
    }

    public InstrumentLegEncoder legLocaleOfIssueAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(legLocaleOfIssue, value, offset, length);
        legLocaleOfIssueOffset = offset;
        legLocaleOfIssueLength = length;
        return this;
    }

    public InstrumentLegEncoder legLocaleOfIssue(final byte[] value, final int length)
    {
        return legLocaleOfIssue(value, 0, length);
    }

    public InstrumentLegEncoder legLocaleOfIssue(final byte[] value)
    {
        return legLocaleOfIssue(value, 0, value.length);
    }

    public boolean hasLegLocaleOfIssue()
    {
        return legLocaleOfIssueLength > 0;
    }

    public MutableDirectBuffer legLocaleOfIssue()
    {
        return legLocaleOfIssue;
    }

    public String legLocaleOfIssueAsString()
    {
        return legLocaleOfIssue.getStringWithoutLengthAscii(legLocaleOfIssueOffset, legLocaleOfIssueLength);
    }

    public InstrumentLegEncoder legLocaleOfIssue(final CharSequence value)
    {
        toBytes(value, legLocaleOfIssue);
        legLocaleOfIssueOffset = 0;
        legLocaleOfIssueLength = value.length();
        return this;
    }

    public InstrumentLegEncoder legLocaleOfIssue(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            legLocaleOfIssue.wrap(buffer);
            legLocaleOfIssueOffset = value.offset();
            legLocaleOfIssueLength = value.length();
        }
        return this;
    }

    public InstrumentLegEncoder legLocaleOfIssue(final char[] value)
    {
        return legLocaleOfIssue(value, 0, value.length);
    }

    public InstrumentLegEncoder legLocaleOfIssue(final char[] value, final int length)
    {
        return legLocaleOfIssue(value, 0, length);
    }

    public InstrumentLegEncoder legLocaleOfIssue(final char[] value, final int offset, final int length)
    {
        toBytes(value, legLocaleOfIssue, offset, length);
        legLocaleOfIssueOffset = 0;
        legLocaleOfIssueLength = length;
        return this;
    }

    private final MutableDirectBuffer legRedemptionDate = new UnsafeBuffer();

    private int legRedemptionDateOffset = 0;

    private int legRedemptionDateLength = 0;

    public InstrumentLegEncoder legRedemptionDate(final DirectBuffer value, final int offset, final int length)
    {
        legRedemptionDate.wrap(value);
        legRedemptionDateOffset = offset;
        legRedemptionDateLength = length;
        return this;
    }

    public InstrumentLegEncoder legRedemptionDate(final DirectBuffer value, final int length)
    {
        return legRedemptionDate(value, 0, length);
    }

    public InstrumentLegEncoder legRedemptionDate(final DirectBuffer value)
    {
        return legRedemptionDate(value, 0, value.capacity());
    }

    public InstrumentLegEncoder legRedemptionDate(final byte[] value, final int offset, final int length)
    {
        legRedemptionDate.wrap(value);
        legRedemptionDateOffset = offset;
        legRedemptionDateLength = length;
        return this;
    }

    public InstrumentLegEncoder legRedemptionDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(legRedemptionDate, value, offset, length);
        legRedemptionDateOffset = offset;
        legRedemptionDateLength = length;
        return this;
    }

    public InstrumentLegEncoder legRedemptionDate(final byte[] value, final int length)
    {
        return legRedemptionDate(value, 0, length);
    }

    public InstrumentLegEncoder legRedemptionDate(final byte[] value)
    {
        return legRedemptionDate(value, 0, value.length);
    }

    public boolean hasLegRedemptionDate()
    {
        return legRedemptionDateLength > 0;
    }

    public MutableDirectBuffer legRedemptionDate()
    {
        return legRedemptionDate;
    }

    public String legRedemptionDateAsString()
    {
        return legRedemptionDate.getStringWithoutLengthAscii(legRedemptionDateOffset, legRedemptionDateLength);
    }

    private final DecimalFloat legStrikePrice = new DecimalFloat();

    private boolean hasLegStrikePrice;

    public boolean hasLegStrikePrice()
    {
        return hasLegStrikePrice;
    }

    public InstrumentLegEncoder legStrikePrice(DecimalFloat value)
    {
        legStrikePrice.set(value);
        hasLegStrikePrice = true;
        return this;
    }

    public InstrumentLegEncoder legStrikePrice(long value, int scale)
    {
        legStrikePrice.set(value, scale);
        hasLegStrikePrice = true;
        return this;
    }

    public DecimalFloat legStrikePrice()
    {
        return legStrikePrice;
    }

    private final MutableDirectBuffer legStrikeCurrency = new UnsafeBuffer();

    private int legStrikeCurrencyOffset = 0;

    private int legStrikeCurrencyLength = 0;

    public InstrumentLegEncoder legStrikeCurrency(final DirectBuffer value, final int offset, final int length)
    {
        legStrikeCurrency.wrap(value);
        legStrikeCurrencyOffset = offset;
        legStrikeCurrencyLength = length;
        return this;
    }

    public InstrumentLegEncoder legStrikeCurrency(final DirectBuffer value, final int length)
    {
        return legStrikeCurrency(value, 0, length);
    }

    public InstrumentLegEncoder legStrikeCurrency(final DirectBuffer value)
    {
        return legStrikeCurrency(value, 0, value.capacity());
    }

    public InstrumentLegEncoder legStrikeCurrency(final byte[] value, final int offset, final int length)
    {
        legStrikeCurrency.wrap(value);
        legStrikeCurrencyOffset = offset;
        legStrikeCurrencyLength = length;
        return this;
    }

    public InstrumentLegEncoder legStrikeCurrencyAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(legStrikeCurrency, value, offset, length);
        legStrikeCurrencyOffset = offset;
        legStrikeCurrencyLength = length;
        return this;
    }

    public InstrumentLegEncoder legStrikeCurrency(final byte[] value, final int length)
    {
        return legStrikeCurrency(value, 0, length);
    }

    public InstrumentLegEncoder legStrikeCurrency(final byte[] value)
    {
        return legStrikeCurrency(value, 0, value.length);
    }

    public boolean hasLegStrikeCurrency()
    {
        return legStrikeCurrencyLength > 0;
    }

    public MutableDirectBuffer legStrikeCurrency()
    {
        return legStrikeCurrency;
    }

    public String legStrikeCurrencyAsString()
    {
        return legStrikeCurrency.getStringWithoutLengthAscii(legStrikeCurrencyOffset, legStrikeCurrencyLength);
    }

    public InstrumentLegEncoder legStrikeCurrency(final CharSequence value)
    {
        toBytes(value, legStrikeCurrency);
        legStrikeCurrencyOffset = 0;
        legStrikeCurrencyLength = value.length();
        return this;
    }

    public InstrumentLegEncoder legStrikeCurrency(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            legStrikeCurrency.wrap(buffer);
            legStrikeCurrencyOffset = value.offset();
            legStrikeCurrencyLength = value.length();
        }
        return this;
    }

    public InstrumentLegEncoder legStrikeCurrency(final char[] value)
    {
        return legStrikeCurrency(value, 0, value.length);
    }

    public InstrumentLegEncoder legStrikeCurrency(final char[] value, final int length)
    {
        return legStrikeCurrency(value, 0, length);
    }

    public InstrumentLegEncoder legStrikeCurrency(final char[] value, final int offset, final int length)
    {
        toBytes(value, legStrikeCurrency, offset, length);
        legStrikeCurrencyOffset = 0;
        legStrikeCurrencyLength = length;
        return this;
    }

    private char legOptAttribute;

    private boolean hasLegOptAttribute;

    public boolean hasLegOptAttribute()
    {
        return hasLegOptAttribute;
    }

    public InstrumentLegEncoder legOptAttribute(char value)
    {
        legOptAttribute = value;
        hasLegOptAttribute = true;
        return this;
    }

    public char legOptAttribute()
    {
        return legOptAttribute;
    }

    private final DecimalFloat legContractMultiplier = new DecimalFloat();

    private boolean hasLegContractMultiplier;

    public boolean hasLegContractMultiplier()
    {
        return hasLegContractMultiplier;
    }

    public InstrumentLegEncoder legContractMultiplier(DecimalFloat value)
    {
        legContractMultiplier.set(value);
        hasLegContractMultiplier = true;
        return this;
    }

    public InstrumentLegEncoder legContractMultiplier(long value, int scale)
    {
        legContractMultiplier.set(value, scale);
        hasLegContractMultiplier = true;
        return this;
    }

    public DecimalFloat legContractMultiplier()
    {
        return legContractMultiplier;
    }

    private int legContractMultiplierUnit;

    private boolean hasLegContractMultiplierUnit;

    public boolean hasLegContractMultiplierUnit()
    {
        return hasLegContractMultiplierUnit;
    }

    public InstrumentLegEncoder legContractMultiplierUnit(int value)
    {
        legContractMultiplierUnit = value;
        hasLegContractMultiplierUnit = true;
        return this;
    }

    public int legContractMultiplierUnit()
    {
        return legContractMultiplierUnit;
    }

    private int legFlowScheduleType;

    private boolean hasLegFlowScheduleType;

    public boolean hasLegFlowScheduleType()
    {
        return hasLegFlowScheduleType;
    }

    public InstrumentLegEncoder legFlowScheduleType(int value)
    {
        legFlowScheduleType = value;
        hasLegFlowScheduleType = true;
        return this;
    }

    public int legFlowScheduleType()
    {
        return legFlowScheduleType;
    }

    private final MutableDirectBuffer legUnitOfMeasure = new UnsafeBuffer();

    private int legUnitOfMeasureOffset = 0;

    private int legUnitOfMeasureLength = 0;

    public InstrumentLegEncoder legUnitOfMeasure(final DirectBuffer value, final int offset, final int length)
    {
        legUnitOfMeasure.wrap(value);
        legUnitOfMeasureOffset = offset;
        legUnitOfMeasureLength = length;
        return this;
    }

    public InstrumentLegEncoder legUnitOfMeasure(final DirectBuffer value, final int length)
    {
        return legUnitOfMeasure(value, 0, length);
    }

    public InstrumentLegEncoder legUnitOfMeasure(final DirectBuffer value)
    {
        return legUnitOfMeasure(value, 0, value.capacity());
    }

    public InstrumentLegEncoder legUnitOfMeasure(final byte[] value, final int offset, final int length)
    {
        legUnitOfMeasure.wrap(value);
        legUnitOfMeasureOffset = offset;
        legUnitOfMeasureLength = length;
        return this;
    }

    public InstrumentLegEncoder legUnitOfMeasureAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(legUnitOfMeasure, value, offset, length);
        legUnitOfMeasureOffset = offset;
        legUnitOfMeasureLength = length;
        return this;
    }

    public InstrumentLegEncoder legUnitOfMeasure(final byte[] value, final int length)
    {
        return legUnitOfMeasure(value, 0, length);
    }

    public InstrumentLegEncoder legUnitOfMeasure(final byte[] value)
    {
        return legUnitOfMeasure(value, 0, value.length);
    }

    public boolean hasLegUnitOfMeasure()
    {
        return legUnitOfMeasureLength > 0;
    }

    public MutableDirectBuffer legUnitOfMeasure()
    {
        return legUnitOfMeasure;
    }

    public String legUnitOfMeasureAsString()
    {
        return legUnitOfMeasure.getStringWithoutLengthAscii(legUnitOfMeasureOffset, legUnitOfMeasureLength);
    }

    public InstrumentLegEncoder legUnitOfMeasure(final CharSequence value)
    {
        toBytes(value, legUnitOfMeasure);
        legUnitOfMeasureOffset = 0;
        legUnitOfMeasureLength = value.length();
        return this;
    }

    public InstrumentLegEncoder legUnitOfMeasure(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            legUnitOfMeasure.wrap(buffer);
            legUnitOfMeasureOffset = value.offset();
            legUnitOfMeasureLength = value.length();
        }
        return this;
    }

    public InstrumentLegEncoder legUnitOfMeasure(final char[] value)
    {
        return legUnitOfMeasure(value, 0, value.length);
    }

    public InstrumentLegEncoder legUnitOfMeasure(final char[] value, final int length)
    {
        return legUnitOfMeasure(value, 0, length);
    }

    public InstrumentLegEncoder legUnitOfMeasure(final char[] value, final int offset, final int length)
    {
        toBytes(value, legUnitOfMeasure, offset, length);
        legUnitOfMeasureOffset = 0;
        legUnitOfMeasureLength = length;
        return this;
    }

    private final DecimalFloat legUnitOfMeasureQty = new DecimalFloat();

    private boolean hasLegUnitOfMeasureQty;

    public boolean hasLegUnitOfMeasureQty()
    {
        return hasLegUnitOfMeasureQty;
    }

    public InstrumentLegEncoder legUnitOfMeasureQty(DecimalFloat value)
    {
        legUnitOfMeasureQty.set(value);
        hasLegUnitOfMeasureQty = true;
        return this;
    }

    public InstrumentLegEncoder legUnitOfMeasureQty(long value, int scale)
    {
        legUnitOfMeasureQty.set(value, scale);
        hasLegUnitOfMeasureQty = true;
        return this;
    }

    public DecimalFloat legUnitOfMeasureQty()
    {
        return legUnitOfMeasureQty;
    }

    private final MutableDirectBuffer legPriceUnitOfMeasure = new UnsafeBuffer();

    private int legPriceUnitOfMeasureOffset = 0;

    private int legPriceUnitOfMeasureLength = 0;

    public InstrumentLegEncoder legPriceUnitOfMeasure(final DirectBuffer value, final int offset, final int length)
    {
        legPriceUnitOfMeasure.wrap(value);
        legPriceUnitOfMeasureOffset = offset;
        legPriceUnitOfMeasureLength = length;
        return this;
    }

    public InstrumentLegEncoder legPriceUnitOfMeasure(final DirectBuffer value, final int length)
    {
        return legPriceUnitOfMeasure(value, 0, length);
    }

    public InstrumentLegEncoder legPriceUnitOfMeasure(final DirectBuffer value)
    {
        return legPriceUnitOfMeasure(value, 0, value.capacity());
    }

    public InstrumentLegEncoder legPriceUnitOfMeasure(final byte[] value, final int offset, final int length)
    {
        legPriceUnitOfMeasure.wrap(value);
        legPriceUnitOfMeasureOffset = offset;
        legPriceUnitOfMeasureLength = length;
        return this;
    }

    public InstrumentLegEncoder legPriceUnitOfMeasureAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(legPriceUnitOfMeasure, value, offset, length);
        legPriceUnitOfMeasureOffset = offset;
        legPriceUnitOfMeasureLength = length;
        return this;
    }

    public InstrumentLegEncoder legPriceUnitOfMeasure(final byte[] value, final int length)
    {
        return legPriceUnitOfMeasure(value, 0, length);
    }

    public InstrumentLegEncoder legPriceUnitOfMeasure(final byte[] value)
    {
        return legPriceUnitOfMeasure(value, 0, value.length);
    }

    public boolean hasLegPriceUnitOfMeasure()
    {
        return legPriceUnitOfMeasureLength > 0;
    }

    public MutableDirectBuffer legPriceUnitOfMeasure()
    {
        return legPriceUnitOfMeasure;
    }

    public String legPriceUnitOfMeasureAsString()
    {
        return legPriceUnitOfMeasure.getStringWithoutLengthAscii(legPriceUnitOfMeasureOffset, legPriceUnitOfMeasureLength);
    }

    public InstrumentLegEncoder legPriceUnitOfMeasure(final CharSequence value)
    {
        toBytes(value, legPriceUnitOfMeasure);
        legPriceUnitOfMeasureOffset = 0;
        legPriceUnitOfMeasureLength = value.length();
        return this;
    }

    public InstrumentLegEncoder legPriceUnitOfMeasure(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            legPriceUnitOfMeasure.wrap(buffer);
            legPriceUnitOfMeasureOffset = value.offset();
            legPriceUnitOfMeasureLength = value.length();
        }
        return this;
    }

    public InstrumentLegEncoder legPriceUnitOfMeasure(final char[] value)
    {
        return legPriceUnitOfMeasure(value, 0, value.length);
    }

    public InstrumentLegEncoder legPriceUnitOfMeasure(final char[] value, final int length)
    {
        return legPriceUnitOfMeasure(value, 0, length);
    }

    public InstrumentLegEncoder legPriceUnitOfMeasure(final char[] value, final int offset, final int length)
    {
        toBytes(value, legPriceUnitOfMeasure, offset, length);
        legPriceUnitOfMeasureOffset = 0;
        legPriceUnitOfMeasureLength = length;
        return this;
    }

    private final DecimalFloat legPriceUnitOfMeasureQty = new DecimalFloat();

    private boolean hasLegPriceUnitOfMeasureQty;

    public boolean hasLegPriceUnitOfMeasureQty()
    {
        return hasLegPriceUnitOfMeasureQty;
    }

    public InstrumentLegEncoder legPriceUnitOfMeasureQty(DecimalFloat value)
    {
        legPriceUnitOfMeasureQty.set(value);
        hasLegPriceUnitOfMeasureQty = true;
        return this;
    }

    public InstrumentLegEncoder legPriceUnitOfMeasureQty(long value, int scale)
    {
        legPriceUnitOfMeasureQty.set(value, scale);
        hasLegPriceUnitOfMeasureQty = true;
        return this;
    }

    public DecimalFloat legPriceUnitOfMeasureQty()
    {
        return legPriceUnitOfMeasureQty;
    }

    private final MutableDirectBuffer legTimeUnit = new UnsafeBuffer();

    private int legTimeUnitOffset = 0;

    private int legTimeUnitLength = 0;

    public InstrumentLegEncoder legTimeUnit(final DirectBuffer value, final int offset, final int length)
    {
        legTimeUnit.wrap(value);
        legTimeUnitOffset = offset;
        legTimeUnitLength = length;
        return this;
    }

    public InstrumentLegEncoder legTimeUnit(final DirectBuffer value, final int length)
    {
        return legTimeUnit(value, 0, length);
    }

    public InstrumentLegEncoder legTimeUnit(final DirectBuffer value)
    {
        return legTimeUnit(value, 0, value.capacity());
    }

    public InstrumentLegEncoder legTimeUnit(final byte[] value, final int offset, final int length)
    {
        legTimeUnit.wrap(value);
        legTimeUnitOffset = offset;
        legTimeUnitLength = length;
        return this;
    }

    public InstrumentLegEncoder legTimeUnitAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(legTimeUnit, value, offset, length);
        legTimeUnitOffset = offset;
        legTimeUnitLength = length;
        return this;
    }

    public InstrumentLegEncoder legTimeUnit(final byte[] value, final int length)
    {
        return legTimeUnit(value, 0, length);
    }

    public InstrumentLegEncoder legTimeUnit(final byte[] value)
    {
        return legTimeUnit(value, 0, value.length);
    }

    public boolean hasLegTimeUnit()
    {
        return legTimeUnitLength > 0;
    }

    public MutableDirectBuffer legTimeUnit()
    {
        return legTimeUnit;
    }

    public String legTimeUnitAsString()
    {
        return legTimeUnit.getStringWithoutLengthAscii(legTimeUnitOffset, legTimeUnitLength);
    }

    public InstrumentLegEncoder legTimeUnit(final CharSequence value)
    {
        toBytes(value, legTimeUnit);
        legTimeUnitOffset = 0;
        legTimeUnitLength = value.length();
        return this;
    }

    public InstrumentLegEncoder legTimeUnit(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            legTimeUnit.wrap(buffer);
            legTimeUnitOffset = value.offset();
            legTimeUnitLength = value.length();
        }
        return this;
    }

    public InstrumentLegEncoder legTimeUnit(final char[] value)
    {
        return legTimeUnit(value, 0, value.length);
    }

    public InstrumentLegEncoder legTimeUnit(final char[] value, final int length)
    {
        return legTimeUnit(value, 0, length);
    }

    public InstrumentLegEncoder legTimeUnit(final char[] value, final int offset, final int length)
    {
        toBytes(value, legTimeUnit, offset, length);
        legTimeUnitOffset = 0;
        legTimeUnitLength = length;
        return this;
    }

    private int legExerciseStyle;

    private boolean hasLegExerciseStyle;

    public boolean hasLegExerciseStyle()
    {
        return hasLegExerciseStyle;
    }

    public InstrumentLegEncoder legExerciseStyle(int value)
    {
        legExerciseStyle = value;
        hasLegExerciseStyle = true;
        return this;
    }

    public int legExerciseStyle()
    {
        return legExerciseStyle;
    }

    private final DecimalFloat legCouponRate = new DecimalFloat();

    private boolean hasLegCouponRate;

    public boolean hasLegCouponRate()
    {
        return hasLegCouponRate;
    }

    public InstrumentLegEncoder legCouponRate(DecimalFloat value)
    {
        legCouponRate.set(value);
        hasLegCouponRate = true;
        return this;
    }

    public InstrumentLegEncoder legCouponRate(long value, int scale)
    {
        legCouponRate.set(value, scale);
        hasLegCouponRate = true;
        return this;
    }

    public DecimalFloat legCouponRate()
    {
        return legCouponRate;
    }

    private final MutableDirectBuffer legSecurityExchange = new UnsafeBuffer();

    private int legSecurityExchangeOffset = 0;

    private int legSecurityExchangeLength = 0;

    public InstrumentLegEncoder legSecurityExchange(final DirectBuffer value, final int offset, final int length)
    {
        legSecurityExchange.wrap(value);
        legSecurityExchangeOffset = offset;
        legSecurityExchangeLength = length;
        return this;
    }

    public InstrumentLegEncoder legSecurityExchange(final DirectBuffer value, final int length)
    {
        return legSecurityExchange(value, 0, length);
    }

    public InstrumentLegEncoder legSecurityExchange(final DirectBuffer value)
    {
        return legSecurityExchange(value, 0, value.capacity());
    }

    public InstrumentLegEncoder legSecurityExchange(final byte[] value, final int offset, final int length)
    {
        legSecurityExchange.wrap(value);
        legSecurityExchangeOffset = offset;
        legSecurityExchangeLength = length;
        return this;
    }

    public InstrumentLegEncoder legSecurityExchangeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(legSecurityExchange, value, offset, length);
        legSecurityExchangeOffset = offset;
        legSecurityExchangeLength = length;
        return this;
    }

    public InstrumentLegEncoder legSecurityExchange(final byte[] value, final int length)
    {
        return legSecurityExchange(value, 0, length);
    }

    public InstrumentLegEncoder legSecurityExchange(final byte[] value)
    {
        return legSecurityExchange(value, 0, value.length);
    }

    public boolean hasLegSecurityExchange()
    {
        return legSecurityExchangeLength > 0;
    }

    public MutableDirectBuffer legSecurityExchange()
    {
        return legSecurityExchange;
    }

    public String legSecurityExchangeAsString()
    {
        return legSecurityExchange.getStringWithoutLengthAscii(legSecurityExchangeOffset, legSecurityExchangeLength);
    }

    public InstrumentLegEncoder legSecurityExchange(final CharSequence value)
    {
        toBytes(value, legSecurityExchange);
        legSecurityExchangeOffset = 0;
        legSecurityExchangeLength = value.length();
        return this;
    }

    public InstrumentLegEncoder legSecurityExchange(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            legSecurityExchange.wrap(buffer);
            legSecurityExchangeOffset = value.offset();
            legSecurityExchangeLength = value.length();
        }
        return this;
    }

    public InstrumentLegEncoder legSecurityExchange(final char[] value)
    {
        return legSecurityExchange(value, 0, value.length);
    }

    public InstrumentLegEncoder legSecurityExchange(final char[] value, final int length)
    {
        return legSecurityExchange(value, 0, length);
    }

    public InstrumentLegEncoder legSecurityExchange(final char[] value, final int offset, final int length)
    {
        toBytes(value, legSecurityExchange, offset, length);
        legSecurityExchangeOffset = 0;
        legSecurityExchangeLength = length;
        return this;
    }

    private final MutableDirectBuffer legIssuer = new UnsafeBuffer();

    private int legIssuerOffset = 0;

    private int legIssuerLength = 0;

    public InstrumentLegEncoder legIssuer(final DirectBuffer value, final int offset, final int length)
    {
        legIssuer.wrap(value);
        legIssuerOffset = offset;
        legIssuerLength = length;
        return this;
    }

    public InstrumentLegEncoder legIssuer(final DirectBuffer value, final int length)
    {
        return legIssuer(value, 0, length);
    }

    public InstrumentLegEncoder legIssuer(final DirectBuffer value)
    {
        return legIssuer(value, 0, value.capacity());
    }

    public InstrumentLegEncoder legIssuer(final byte[] value, final int offset, final int length)
    {
        legIssuer.wrap(value);
        legIssuerOffset = offset;
        legIssuerLength = length;
        return this;
    }

    public InstrumentLegEncoder legIssuerAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(legIssuer, value, offset, length);
        legIssuerOffset = offset;
        legIssuerLength = length;
        return this;
    }

    public InstrumentLegEncoder legIssuer(final byte[] value, final int length)
    {
        return legIssuer(value, 0, length);
    }

    public InstrumentLegEncoder legIssuer(final byte[] value)
    {
        return legIssuer(value, 0, value.length);
    }

    public boolean hasLegIssuer()
    {
        return legIssuerLength > 0;
    }

    public MutableDirectBuffer legIssuer()
    {
        return legIssuer;
    }

    public String legIssuerAsString()
    {
        return legIssuer.getStringWithoutLengthAscii(legIssuerOffset, legIssuerLength);
    }

    public InstrumentLegEncoder legIssuer(final CharSequence value)
    {
        toBytes(value, legIssuer);
        legIssuerOffset = 0;
        legIssuerLength = value.length();
        return this;
    }

    public InstrumentLegEncoder legIssuer(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            legIssuer.wrap(buffer);
            legIssuerOffset = value.offset();
            legIssuerLength = value.length();
        }
        return this;
    }

    public InstrumentLegEncoder legIssuer(final char[] value)
    {
        return legIssuer(value, 0, value.length);
    }

    public InstrumentLegEncoder legIssuer(final char[] value, final int length)
    {
        return legIssuer(value, 0, length);
    }

    public InstrumentLegEncoder legIssuer(final char[] value, final int offset, final int length)
    {
        toBytes(value, legIssuer, offset, length);
        legIssuerOffset = 0;
        legIssuerLength = length;
        return this;
    }

    private int encodedLegIssuerLen;

    private boolean hasEncodedLegIssuerLen;

    public boolean hasEncodedLegIssuerLen()
    {
        return hasEncodedLegIssuerLen;
    }

    public InstrumentLegEncoder encodedLegIssuerLen(int value)
    {
        encodedLegIssuerLen = value;
        hasEncodedLegIssuerLen = true;
        return this;
    }

    public int encodedLegIssuerLen()
    {
        return encodedLegIssuerLen;
    }

    private byte[] encodedLegIssuer;

    private boolean hasEncodedLegIssuer;

    public boolean hasEncodedLegIssuer()
    {
        return hasEncodedLegIssuer;
    }

    public InstrumentLegEncoder encodedLegIssuer(byte[] value)
    {
        encodedLegIssuer = value;
        hasEncodedLegIssuer = true;
        return this;
    }

    public byte[] encodedLegIssuer()
    {
        return encodedLegIssuer;
    }

    public InstrumentLegEncoder encodedLegIssuerAsCopy(final byte[] value, final int offset, final int length)
    {
        encodedLegIssuer = copyInto(encodedLegIssuer, value, offset, length);
        hasEncodedLegIssuer = true;
        return this;
    }

    private final MutableDirectBuffer legSecurityDesc = new UnsafeBuffer();

    private int legSecurityDescOffset = 0;

    private int legSecurityDescLength = 0;

    public InstrumentLegEncoder legSecurityDesc(final DirectBuffer value, final int offset, final int length)
    {
        legSecurityDesc.wrap(value);
        legSecurityDescOffset = offset;
        legSecurityDescLength = length;
        return this;
    }

    public InstrumentLegEncoder legSecurityDesc(final DirectBuffer value, final int length)
    {
        return legSecurityDesc(value, 0, length);
    }

    public InstrumentLegEncoder legSecurityDesc(final DirectBuffer value)
    {
        return legSecurityDesc(value, 0, value.capacity());
    }

    public InstrumentLegEncoder legSecurityDesc(final byte[] value, final int offset, final int length)
    {
        legSecurityDesc.wrap(value);
        legSecurityDescOffset = offset;
        legSecurityDescLength = length;
        return this;
    }

    public InstrumentLegEncoder legSecurityDescAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(legSecurityDesc, value, offset, length);
        legSecurityDescOffset = offset;
        legSecurityDescLength = length;
        return this;
    }

    public InstrumentLegEncoder legSecurityDesc(final byte[] value, final int length)
    {
        return legSecurityDesc(value, 0, length);
    }

    public InstrumentLegEncoder legSecurityDesc(final byte[] value)
    {
        return legSecurityDesc(value, 0, value.length);
    }

    public boolean hasLegSecurityDesc()
    {
        return legSecurityDescLength > 0;
    }

    public MutableDirectBuffer legSecurityDesc()
    {
        return legSecurityDesc;
    }

    public String legSecurityDescAsString()
    {
        return legSecurityDesc.getStringWithoutLengthAscii(legSecurityDescOffset, legSecurityDescLength);
    }

    public InstrumentLegEncoder legSecurityDesc(final CharSequence value)
    {
        toBytes(value, legSecurityDesc);
        legSecurityDescOffset = 0;
        legSecurityDescLength = value.length();
        return this;
    }

    public InstrumentLegEncoder legSecurityDesc(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            legSecurityDesc.wrap(buffer);
            legSecurityDescOffset = value.offset();
            legSecurityDescLength = value.length();
        }
        return this;
    }

    public InstrumentLegEncoder legSecurityDesc(final char[] value)
    {
        return legSecurityDesc(value, 0, value.length);
    }

    public InstrumentLegEncoder legSecurityDesc(final char[] value, final int length)
    {
        return legSecurityDesc(value, 0, length);
    }

    public InstrumentLegEncoder legSecurityDesc(final char[] value, final int offset, final int length)
    {
        toBytes(value, legSecurityDesc, offset, length);
        legSecurityDescOffset = 0;
        legSecurityDescLength = length;
        return this;
    }

    private int encodedLegSecurityDescLen;

    private boolean hasEncodedLegSecurityDescLen;

    public boolean hasEncodedLegSecurityDescLen()
    {
        return hasEncodedLegSecurityDescLen;
    }

    public InstrumentLegEncoder encodedLegSecurityDescLen(int value)
    {
        encodedLegSecurityDescLen = value;
        hasEncodedLegSecurityDescLen = true;
        return this;
    }

    public int encodedLegSecurityDescLen()
    {
        return encodedLegSecurityDescLen;
    }

    private byte[] encodedLegSecurityDesc;

    private boolean hasEncodedLegSecurityDesc;

    public boolean hasEncodedLegSecurityDesc()
    {
        return hasEncodedLegSecurityDesc;
    }

    public InstrumentLegEncoder encodedLegSecurityDesc(byte[] value)
    {
        encodedLegSecurityDesc = value;
        hasEncodedLegSecurityDesc = true;
        return this;
    }

    public byte[] encodedLegSecurityDesc()
    {
        return encodedLegSecurityDesc;
    }

    public InstrumentLegEncoder encodedLegSecurityDescAsCopy(final byte[] value, final int offset, final int length)
    {
        encodedLegSecurityDesc = copyInto(encodedLegSecurityDesc, value, offset, length);
        hasEncodedLegSecurityDesc = true;
        return this;
    }

    private final DecimalFloat legRatioQty = new DecimalFloat();

    private boolean hasLegRatioQty;

    public boolean hasLegRatioQty()
    {
        return hasLegRatioQty;
    }

    public InstrumentLegEncoder legRatioQty(DecimalFloat value)
    {
        legRatioQty.set(value);
        hasLegRatioQty = true;
        return this;
    }

    public InstrumentLegEncoder legRatioQty(long value, int scale)
    {
        legRatioQty.set(value, scale);
        hasLegRatioQty = true;
        return this;
    }

    public DecimalFloat legRatioQty()
    {
        return legRatioQty;
    }

    private char legSide;

    private boolean hasLegSide;

    public boolean hasLegSide()
    {
        return hasLegSide;
    }

    public InstrumentLegEncoder legSide(char value)
    {
        legSide = value;
        hasLegSide = true;
        return this;
    }

    public char legSide()
    {
        return legSide;
    }

    private final MutableDirectBuffer legCurrency = new UnsafeBuffer();

    private int legCurrencyOffset = 0;

    private int legCurrencyLength = 0;

    public InstrumentLegEncoder legCurrency(final DirectBuffer value, final int offset, final int length)
    {
        legCurrency.wrap(value);
        legCurrencyOffset = offset;
        legCurrencyLength = length;
        return this;
    }

    public InstrumentLegEncoder legCurrency(final DirectBuffer value, final int length)
    {
        return legCurrency(value, 0, length);
    }

    public InstrumentLegEncoder legCurrency(final DirectBuffer value)
    {
        return legCurrency(value, 0, value.capacity());
    }

    public InstrumentLegEncoder legCurrency(final byte[] value, final int offset, final int length)
    {
        legCurrency.wrap(value);
        legCurrencyOffset = offset;
        legCurrencyLength = length;
        return this;
    }

    public InstrumentLegEncoder legCurrencyAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(legCurrency, value, offset, length);
        legCurrencyOffset = offset;
        legCurrencyLength = length;
        return this;
    }

    public InstrumentLegEncoder legCurrency(final byte[] value, final int length)
    {
        return legCurrency(value, 0, length);
    }

    public InstrumentLegEncoder legCurrency(final byte[] value)
    {
        return legCurrency(value, 0, value.length);
    }

    public boolean hasLegCurrency()
    {
        return legCurrencyLength > 0;
    }

    public MutableDirectBuffer legCurrency()
    {
        return legCurrency;
    }

    public String legCurrencyAsString()
    {
        return legCurrency.getStringWithoutLengthAscii(legCurrencyOffset, legCurrencyLength);
    }

    public InstrumentLegEncoder legCurrency(final CharSequence value)
    {
        toBytes(value, legCurrency);
        legCurrencyOffset = 0;
        legCurrencyLength = value.length();
        return this;
    }

    public InstrumentLegEncoder legCurrency(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            legCurrency.wrap(buffer);
            legCurrencyOffset = value.offset();
            legCurrencyLength = value.length();
        }
        return this;
    }

    public InstrumentLegEncoder legCurrency(final char[] value)
    {
        return legCurrency(value, 0, value.length);
    }

    public InstrumentLegEncoder legCurrency(final char[] value, final int length)
    {
        return legCurrency(value, 0, length);
    }

    public InstrumentLegEncoder legCurrency(final char[] value, final int offset, final int length)
    {
        toBytes(value, legCurrency, offset, length);
        legCurrencyOffset = 0;
        legCurrencyLength = length;
        return this;
    }

    private final MutableDirectBuffer legPool = new UnsafeBuffer();

    private int legPoolOffset = 0;

    private int legPoolLength = 0;

    public InstrumentLegEncoder legPool(final DirectBuffer value, final int offset, final int length)
    {
        legPool.wrap(value);
        legPoolOffset = offset;
        legPoolLength = length;
        return this;
    }

    public InstrumentLegEncoder legPool(final DirectBuffer value, final int length)
    {
        return legPool(value, 0, length);
    }

    public InstrumentLegEncoder legPool(final DirectBuffer value)
    {
        return legPool(value, 0, value.capacity());
    }

    public InstrumentLegEncoder legPool(final byte[] value, final int offset, final int length)
    {
        legPool.wrap(value);
        legPoolOffset = offset;
        legPoolLength = length;
        return this;
    }

    public InstrumentLegEncoder legPoolAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(legPool, value, offset, length);
        legPoolOffset = offset;
        legPoolLength = length;
        return this;
    }

    public InstrumentLegEncoder legPool(final byte[] value, final int length)
    {
        return legPool(value, 0, length);
    }

    public InstrumentLegEncoder legPool(final byte[] value)
    {
        return legPool(value, 0, value.length);
    }

    public boolean hasLegPool()
    {
        return legPoolLength > 0;
    }

    public MutableDirectBuffer legPool()
    {
        return legPool;
    }

    public String legPoolAsString()
    {
        return legPool.getStringWithoutLengthAscii(legPoolOffset, legPoolLength);
    }

    public InstrumentLegEncoder legPool(final CharSequence value)
    {
        toBytes(value, legPool);
        legPoolOffset = 0;
        legPoolLength = value.length();
        return this;
    }

    public InstrumentLegEncoder legPool(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            legPool.wrap(buffer);
            legPoolOffset = value.offset();
            legPoolLength = value.length();
        }
        return this;
    }

    public InstrumentLegEncoder legPool(final char[] value)
    {
        return legPool(value, 0, value.length);
    }

    public InstrumentLegEncoder legPool(final char[] value, final int length)
    {
        return legPool(value, 0, length);
    }

    public InstrumentLegEncoder legPool(final char[] value, final int offset, final int length)
    {
        toBytes(value, legPool, offset, length);
        legPoolOffset = 0;
        legPoolLength = length;
        return this;
    }

    private final MutableDirectBuffer legDatedDate = new UnsafeBuffer();

    private int legDatedDateOffset = 0;

    private int legDatedDateLength = 0;

    public InstrumentLegEncoder legDatedDate(final DirectBuffer value, final int offset, final int length)
    {
        legDatedDate.wrap(value);
        legDatedDateOffset = offset;
        legDatedDateLength = length;
        return this;
    }

    public InstrumentLegEncoder legDatedDate(final DirectBuffer value, final int length)
    {
        return legDatedDate(value, 0, length);
    }

    public InstrumentLegEncoder legDatedDate(final DirectBuffer value)
    {
        return legDatedDate(value, 0, value.capacity());
    }

    public InstrumentLegEncoder legDatedDate(final byte[] value, final int offset, final int length)
    {
        legDatedDate.wrap(value);
        legDatedDateOffset = offset;
        legDatedDateLength = length;
        return this;
    }

    public InstrumentLegEncoder legDatedDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(legDatedDate, value, offset, length);
        legDatedDateOffset = offset;
        legDatedDateLength = length;
        return this;
    }

    public InstrumentLegEncoder legDatedDate(final byte[] value, final int length)
    {
        return legDatedDate(value, 0, length);
    }

    public InstrumentLegEncoder legDatedDate(final byte[] value)
    {
        return legDatedDate(value, 0, value.length);
    }

    public boolean hasLegDatedDate()
    {
        return legDatedDateLength > 0;
    }

    public MutableDirectBuffer legDatedDate()
    {
        return legDatedDate;
    }

    public String legDatedDateAsString()
    {
        return legDatedDate.getStringWithoutLengthAscii(legDatedDateOffset, legDatedDateLength);
    }

    private final MutableDirectBuffer legContractSettlMonth = new UnsafeBuffer();

    private int legContractSettlMonthOffset = 0;

    private int legContractSettlMonthLength = 0;

    public InstrumentLegEncoder legContractSettlMonth(final DirectBuffer value, final int offset, final int length)
    {
        legContractSettlMonth.wrap(value);
        legContractSettlMonthOffset = offset;
        legContractSettlMonthLength = length;
        return this;
    }

    public InstrumentLegEncoder legContractSettlMonth(final DirectBuffer value, final int length)
    {
        return legContractSettlMonth(value, 0, length);
    }

    public InstrumentLegEncoder legContractSettlMonth(final DirectBuffer value)
    {
        return legContractSettlMonth(value, 0, value.capacity());
    }

    public InstrumentLegEncoder legContractSettlMonth(final byte[] value, final int offset, final int length)
    {
        legContractSettlMonth.wrap(value);
        legContractSettlMonthOffset = offset;
        legContractSettlMonthLength = length;
        return this;
    }

    public InstrumentLegEncoder legContractSettlMonthAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(legContractSettlMonth, value, offset, length);
        legContractSettlMonthOffset = offset;
        legContractSettlMonthLength = length;
        return this;
    }

    public InstrumentLegEncoder legContractSettlMonth(final byte[] value, final int length)
    {
        return legContractSettlMonth(value, 0, length);
    }

    public InstrumentLegEncoder legContractSettlMonth(final byte[] value)
    {
        return legContractSettlMonth(value, 0, value.length);
    }

    public boolean hasLegContractSettlMonth()
    {
        return legContractSettlMonthLength > 0;
    }

    public MutableDirectBuffer legContractSettlMonth()
    {
        return legContractSettlMonth;
    }

    public String legContractSettlMonthAsString()
    {
        return legContractSettlMonth.getStringWithoutLengthAscii(legContractSettlMonthOffset, legContractSettlMonthLength);
    }

    private final MutableDirectBuffer legInterestAccrualDate = new UnsafeBuffer();

    private int legInterestAccrualDateOffset = 0;

    private int legInterestAccrualDateLength = 0;

    public InstrumentLegEncoder legInterestAccrualDate(final DirectBuffer value, final int offset, final int length)
    {
        legInterestAccrualDate.wrap(value);
        legInterestAccrualDateOffset = offset;
        legInterestAccrualDateLength = length;
        return this;
    }

    public InstrumentLegEncoder legInterestAccrualDate(final DirectBuffer value, final int length)
    {
        return legInterestAccrualDate(value, 0, length);
    }

    public InstrumentLegEncoder legInterestAccrualDate(final DirectBuffer value)
    {
        return legInterestAccrualDate(value, 0, value.capacity());
    }

    public InstrumentLegEncoder legInterestAccrualDate(final byte[] value, final int offset, final int length)
    {
        legInterestAccrualDate.wrap(value);
        legInterestAccrualDateOffset = offset;
        legInterestAccrualDateLength = length;
        return this;
    }

    public InstrumentLegEncoder legInterestAccrualDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(legInterestAccrualDate, value, offset, length);
        legInterestAccrualDateOffset = offset;
        legInterestAccrualDateLength = length;
        return this;
    }

    public InstrumentLegEncoder legInterestAccrualDate(final byte[] value, final int length)
    {
        return legInterestAccrualDate(value, 0, length);
    }

    public InstrumentLegEncoder legInterestAccrualDate(final byte[] value)
    {
        return legInterestAccrualDate(value, 0, value.length);
    }

    public boolean hasLegInterestAccrualDate()
    {
        return legInterestAccrualDateLength > 0;
    }

    public MutableDirectBuffer legInterestAccrualDate()
    {
        return legInterestAccrualDate;
    }

    public String legInterestAccrualDateAsString()
    {
        return legInterestAccrualDate.getStringWithoutLengthAscii(legInterestAccrualDateOffset, legInterestAccrualDateLength);
    }

    private int legPutOrCall;

    private boolean hasLegPutOrCall;

    public boolean hasLegPutOrCall()
    {
        return hasLegPutOrCall;
    }

    public InstrumentLegEncoder legPutOrCall(int value)
    {
        legPutOrCall = value;
        hasLegPutOrCall = true;
        return this;
    }

    public int legPutOrCall()
    {
        return legPutOrCall;
    }

    private final DecimalFloat legOptionRatio = new DecimalFloat();

    private boolean hasLegOptionRatio;

    public boolean hasLegOptionRatio()
    {
        return hasLegOptionRatio;
    }

    public InstrumentLegEncoder legOptionRatio(DecimalFloat value)
    {
        legOptionRatio.set(value);
        hasLegOptionRatio = true;
        return this;
    }

    public InstrumentLegEncoder legOptionRatio(long value, int scale)
    {
        legOptionRatio.set(value, scale);
        hasLegOptionRatio = true;
        return this;
    }

    public DecimalFloat legOptionRatio()
    {
        return legOptionRatio;
    }

    private final DecimalFloat legPrice = new DecimalFloat();

    private boolean hasLegPrice;

    public boolean hasLegPrice()
    {
        return hasLegPrice;
    }

    public InstrumentLegEncoder legPrice(DecimalFloat value)
    {
        legPrice.set(value);
        hasLegPrice = true;
        return this;
    }

    public InstrumentLegEncoder legPrice(long value, int scale)
    {
        legPrice.set(value, scale);
        hasLegPrice = true;
        return this;
    }

    public DecimalFloat legPrice()
    {
        return legPrice;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (legSymbolLength > 0)
        {
            buffer.putBytes(position, legSymbolHeader, 0, legSymbolHeaderLength);
            position += legSymbolHeaderLength;
            buffer.putBytes(position, legSymbol, legSymbolOffset, legSymbolLength);
            position += legSymbolLength;
            buffer.putSeparator(position);
            position++;
        }

        if (legSymbolSfxLength > 0)
        {
            buffer.putBytes(position, legSymbolSfxHeader, 0, legSymbolSfxHeaderLength);
            position += legSymbolSfxHeaderLength;
            buffer.putBytes(position, legSymbolSfx, legSymbolSfxOffset, legSymbolSfxLength);
            position += legSymbolSfxLength;
            buffer.putSeparator(position);
            position++;
        }

        if (legSecurityIDLength > 0)
        {
            buffer.putBytes(position, legSecurityIDHeader, 0, legSecurityIDHeaderLength);
            position += legSecurityIDHeaderLength;
            buffer.putBytes(position, legSecurityID, legSecurityIDOffset, legSecurityIDLength);
            position += legSecurityIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (legSecurityIDSourceLength > 0)
        {
            buffer.putBytes(position, legSecurityIDSourceHeader, 0, legSecurityIDSourceHeaderLength);
            position += legSecurityIDSourceHeaderLength;
            buffer.putBytes(position, legSecurityIDSource, legSecurityIDSourceOffset, legSecurityIDSourceLength);
            position += legSecurityIDSourceLength;
            buffer.putSeparator(position);
            position++;
        }

            position += legSecAltIDGrp.encode(buffer, position);

        if (hasLegProduct)
        {
            buffer.putBytes(position, legProductHeader, 0, legProductHeaderLength);
            position += legProductHeaderLength;
            position += buffer.putIntAscii(position, legProduct);
            buffer.putSeparator(position);
            position++;
        }

        if (legCFICodeLength > 0)
        {
            buffer.putBytes(position, legCFICodeHeader, 0, legCFICodeHeaderLength);
            position += legCFICodeHeaderLength;
            buffer.putBytes(position, legCFICode, legCFICodeOffset, legCFICodeLength);
            position += legCFICodeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (legSecurityTypeLength > 0)
        {
            buffer.putBytes(position, legSecurityTypeHeader, 0, legSecurityTypeHeaderLength);
            position += legSecurityTypeHeaderLength;
            buffer.putBytes(position, legSecurityType, legSecurityTypeOffset, legSecurityTypeLength);
            position += legSecurityTypeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (legSecuritySubTypeLength > 0)
        {
            buffer.putBytes(position, legSecuritySubTypeHeader, 0, legSecuritySubTypeHeaderLength);
            position += legSecuritySubTypeHeaderLength;
            buffer.putBytes(position, legSecuritySubType, legSecuritySubTypeOffset, legSecuritySubTypeLength);
            position += legSecuritySubTypeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (legMaturityMonthYearLength > 0)
        {
            buffer.putBytes(position, legMaturityMonthYearHeader, 0, legMaturityMonthYearHeaderLength);
            position += legMaturityMonthYearHeaderLength;
            buffer.putBytes(position, legMaturityMonthYear, legMaturityMonthYearOffset, legMaturityMonthYearLength);
            position += legMaturityMonthYearLength;
            buffer.putSeparator(position);
            position++;
        }

        if (legMaturityDateLength > 0)
        {
            buffer.putBytes(position, legMaturityDateHeader, 0, legMaturityDateHeaderLength);
            position += legMaturityDateHeaderLength;
            buffer.putBytes(position, legMaturityDate, legMaturityDateOffset, legMaturityDateLength);
            position += legMaturityDateLength;
            buffer.putSeparator(position);
            position++;
        }

        if (legMaturityTimeLength > 0)
        {
            buffer.putBytes(position, legMaturityTimeHeader, 0, legMaturityTimeHeaderLength);
            position += legMaturityTimeHeaderLength;
            buffer.putBytes(position, legMaturityTime, legMaturityTimeOffset, legMaturityTimeLength);
            position += legMaturityTimeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (legCouponPaymentDateLength > 0)
        {
            buffer.putBytes(position, legCouponPaymentDateHeader, 0, legCouponPaymentDateHeaderLength);
            position += legCouponPaymentDateHeaderLength;
            buffer.putBytes(position, legCouponPaymentDate, legCouponPaymentDateOffset, legCouponPaymentDateLength);
            position += legCouponPaymentDateLength;
            buffer.putSeparator(position);
            position++;
        }

        if (legIssueDateLength > 0)
        {
            buffer.putBytes(position, legIssueDateHeader, 0, legIssueDateHeaderLength);
            position += legIssueDateHeaderLength;
            buffer.putBytes(position, legIssueDate, legIssueDateOffset, legIssueDateLength);
            position += legIssueDateLength;
            buffer.putSeparator(position);
            position++;
        }

        if (legRepoCollateralSecurityTypeLength > 0)
        {
            buffer.putBytes(position, legRepoCollateralSecurityTypeHeader, 0, legRepoCollateralSecurityTypeHeaderLength);
            position += legRepoCollateralSecurityTypeHeaderLength;
            buffer.putBytes(position, legRepoCollateralSecurityType, legRepoCollateralSecurityTypeOffset, legRepoCollateralSecurityTypeLength);
            position += legRepoCollateralSecurityTypeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasLegRepurchaseTerm)
        {
            buffer.putBytes(position, legRepurchaseTermHeader, 0, legRepurchaseTermHeaderLength);
            position += legRepurchaseTermHeaderLength;
            position += buffer.putIntAscii(position, legRepurchaseTerm);
            buffer.putSeparator(position);
            position++;
        }

        if (hasLegRepurchaseRate)
        {
            buffer.putBytes(position, legRepurchaseRateHeader, 0, legRepurchaseRateHeaderLength);
            position += legRepurchaseRateHeaderLength;
            position += buffer.putFloatAscii(position, legRepurchaseRate);
            buffer.putSeparator(position);
            position++;
        }

        if (hasLegFactor)
        {
            buffer.putBytes(position, legFactorHeader, 0, legFactorHeaderLength);
            position += legFactorHeaderLength;
            position += buffer.putFloatAscii(position, legFactor);
            buffer.putSeparator(position);
            position++;
        }

        if (legCreditRatingLength > 0)
        {
            buffer.putBytes(position, legCreditRatingHeader, 0, legCreditRatingHeaderLength);
            position += legCreditRatingHeaderLength;
            buffer.putBytes(position, legCreditRating, legCreditRatingOffset, legCreditRatingLength);
            position += legCreditRatingLength;
            buffer.putSeparator(position);
            position++;
        }

        if (legInstrRegistryLength > 0)
        {
            buffer.putBytes(position, legInstrRegistryHeader, 0, legInstrRegistryHeaderLength);
            position += legInstrRegistryHeaderLength;
            buffer.putBytes(position, legInstrRegistry, legInstrRegistryOffset, legInstrRegistryLength);
            position += legInstrRegistryLength;
            buffer.putSeparator(position);
            position++;
        }

        if (legCountryOfIssueLength > 0)
        {
            buffer.putBytes(position, legCountryOfIssueHeader, 0, legCountryOfIssueHeaderLength);
            position += legCountryOfIssueHeaderLength;
            buffer.putBytes(position, legCountryOfIssue, legCountryOfIssueOffset, legCountryOfIssueLength);
            position += legCountryOfIssueLength;
            buffer.putSeparator(position);
            position++;
        }

        if (legStateOrProvinceOfIssueLength > 0)
        {
            buffer.putBytes(position, legStateOrProvinceOfIssueHeader, 0, legStateOrProvinceOfIssueHeaderLength);
            position += legStateOrProvinceOfIssueHeaderLength;
            buffer.putBytes(position, legStateOrProvinceOfIssue, legStateOrProvinceOfIssueOffset, legStateOrProvinceOfIssueLength);
            position += legStateOrProvinceOfIssueLength;
            buffer.putSeparator(position);
            position++;
        }

        if (legLocaleOfIssueLength > 0)
        {
            buffer.putBytes(position, legLocaleOfIssueHeader, 0, legLocaleOfIssueHeaderLength);
            position += legLocaleOfIssueHeaderLength;
            buffer.putBytes(position, legLocaleOfIssue, legLocaleOfIssueOffset, legLocaleOfIssueLength);
            position += legLocaleOfIssueLength;
            buffer.putSeparator(position);
            position++;
        }

        if (legRedemptionDateLength > 0)
        {
            buffer.putBytes(position, legRedemptionDateHeader, 0, legRedemptionDateHeaderLength);
            position += legRedemptionDateHeaderLength;
            buffer.putBytes(position, legRedemptionDate, legRedemptionDateOffset, legRedemptionDateLength);
            position += legRedemptionDateLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasLegStrikePrice)
        {
            buffer.putBytes(position, legStrikePriceHeader, 0, legStrikePriceHeaderLength);
            position += legStrikePriceHeaderLength;
            position += buffer.putFloatAscii(position, legStrikePrice);
            buffer.putSeparator(position);
            position++;
        }

        if (legStrikeCurrencyLength > 0)
        {
            buffer.putBytes(position, legStrikeCurrencyHeader, 0, legStrikeCurrencyHeaderLength);
            position += legStrikeCurrencyHeaderLength;
            buffer.putBytes(position, legStrikeCurrency, legStrikeCurrencyOffset, legStrikeCurrencyLength);
            position += legStrikeCurrencyLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasLegOptAttribute)
        {
            buffer.putBytes(position, legOptAttributeHeader, 0, legOptAttributeHeaderLength);
            position += legOptAttributeHeaderLength;
            position += buffer.putCharAscii(position, legOptAttribute);
            buffer.putSeparator(position);
            position++;
        }

        if (hasLegContractMultiplier)
        {
            buffer.putBytes(position, legContractMultiplierHeader, 0, legContractMultiplierHeaderLength);
            position += legContractMultiplierHeaderLength;
            position += buffer.putFloatAscii(position, legContractMultiplier);
            buffer.putSeparator(position);
            position++;
        }

        if (hasLegContractMultiplierUnit)
        {
            buffer.putBytes(position, legContractMultiplierUnitHeader, 0, legContractMultiplierUnitHeaderLength);
            position += legContractMultiplierUnitHeaderLength;
            position += buffer.putIntAscii(position, legContractMultiplierUnit);
            buffer.putSeparator(position);
            position++;
        }

        if (hasLegFlowScheduleType)
        {
            buffer.putBytes(position, legFlowScheduleTypeHeader, 0, legFlowScheduleTypeHeaderLength);
            position += legFlowScheduleTypeHeaderLength;
            position += buffer.putIntAscii(position, legFlowScheduleType);
            buffer.putSeparator(position);
            position++;
        }

        if (legUnitOfMeasureLength > 0)
        {
            buffer.putBytes(position, legUnitOfMeasureHeader, 0, legUnitOfMeasureHeaderLength);
            position += legUnitOfMeasureHeaderLength;
            buffer.putBytes(position, legUnitOfMeasure, legUnitOfMeasureOffset, legUnitOfMeasureLength);
            position += legUnitOfMeasureLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasLegUnitOfMeasureQty)
        {
            buffer.putBytes(position, legUnitOfMeasureQtyHeader, 0, legUnitOfMeasureQtyHeaderLength);
            position += legUnitOfMeasureQtyHeaderLength;
            position += buffer.putFloatAscii(position, legUnitOfMeasureQty);
            buffer.putSeparator(position);
            position++;
        }

        if (legPriceUnitOfMeasureLength > 0)
        {
            buffer.putBytes(position, legPriceUnitOfMeasureHeader, 0, legPriceUnitOfMeasureHeaderLength);
            position += legPriceUnitOfMeasureHeaderLength;
            buffer.putBytes(position, legPriceUnitOfMeasure, legPriceUnitOfMeasureOffset, legPriceUnitOfMeasureLength);
            position += legPriceUnitOfMeasureLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasLegPriceUnitOfMeasureQty)
        {
            buffer.putBytes(position, legPriceUnitOfMeasureQtyHeader, 0, legPriceUnitOfMeasureQtyHeaderLength);
            position += legPriceUnitOfMeasureQtyHeaderLength;
            position += buffer.putFloatAscii(position, legPriceUnitOfMeasureQty);
            buffer.putSeparator(position);
            position++;
        }

        if (legTimeUnitLength > 0)
        {
            buffer.putBytes(position, legTimeUnitHeader, 0, legTimeUnitHeaderLength);
            position += legTimeUnitHeaderLength;
            buffer.putBytes(position, legTimeUnit, legTimeUnitOffset, legTimeUnitLength);
            position += legTimeUnitLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasLegExerciseStyle)
        {
            buffer.putBytes(position, legExerciseStyleHeader, 0, legExerciseStyleHeaderLength);
            position += legExerciseStyleHeaderLength;
            position += buffer.putIntAscii(position, legExerciseStyle);
            buffer.putSeparator(position);
            position++;
        }

        if (hasLegCouponRate)
        {
            buffer.putBytes(position, legCouponRateHeader, 0, legCouponRateHeaderLength);
            position += legCouponRateHeaderLength;
            position += buffer.putFloatAscii(position, legCouponRate);
            buffer.putSeparator(position);
            position++;
        }

        if (legSecurityExchangeLength > 0)
        {
            buffer.putBytes(position, legSecurityExchangeHeader, 0, legSecurityExchangeHeaderLength);
            position += legSecurityExchangeHeaderLength;
            buffer.putBytes(position, legSecurityExchange, legSecurityExchangeOffset, legSecurityExchangeLength);
            position += legSecurityExchangeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (legIssuerLength > 0)
        {
            buffer.putBytes(position, legIssuerHeader, 0, legIssuerHeaderLength);
            position += legIssuerHeaderLength;
            buffer.putBytes(position, legIssuer, legIssuerOffset, legIssuerLength);
            position += legIssuerLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasEncodedLegIssuerLen)
        {
            buffer.putBytes(position, encodedLegIssuerLenHeader, 0, encodedLegIssuerLenHeaderLength);
            position += encodedLegIssuerLenHeaderLength;
            position += buffer.putIntAscii(position, encodedLegIssuerLen);
            buffer.putSeparator(position);
            position++;
        }

        if (hasEncodedLegIssuer)
        {
            buffer.putBytes(position, encodedLegIssuerHeader, 0, encodedLegIssuerHeaderLength);
            position += encodedLegIssuerHeaderLength;
            buffer.putBytes(position, encodedLegIssuer);
            position += encodedLegIssuer.length;
            buffer.putSeparator(position);
            position++;
        }

        if (legSecurityDescLength > 0)
        {
            buffer.putBytes(position, legSecurityDescHeader, 0, legSecurityDescHeaderLength);
            position += legSecurityDescHeaderLength;
            buffer.putBytes(position, legSecurityDesc, legSecurityDescOffset, legSecurityDescLength);
            position += legSecurityDescLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasEncodedLegSecurityDescLen)
        {
            buffer.putBytes(position, encodedLegSecurityDescLenHeader, 0, encodedLegSecurityDescLenHeaderLength);
            position += encodedLegSecurityDescLenHeaderLength;
            position += buffer.putIntAscii(position, encodedLegSecurityDescLen);
            buffer.putSeparator(position);
            position++;
        }

        if (hasEncodedLegSecurityDesc)
        {
            buffer.putBytes(position, encodedLegSecurityDescHeader, 0, encodedLegSecurityDescHeaderLength);
            position += encodedLegSecurityDescHeaderLength;
            buffer.putBytes(position, encodedLegSecurityDesc);
            position += encodedLegSecurityDesc.length;
            buffer.putSeparator(position);
            position++;
        }

        if (hasLegRatioQty)
        {
            buffer.putBytes(position, legRatioQtyHeader, 0, legRatioQtyHeaderLength);
            position += legRatioQtyHeaderLength;
            position += buffer.putFloatAscii(position, legRatioQty);
            buffer.putSeparator(position);
            position++;
        }

        if (hasLegSide)
        {
            buffer.putBytes(position, legSideHeader, 0, legSideHeaderLength);
            position += legSideHeaderLength;
            position += buffer.putCharAscii(position, legSide);
            buffer.putSeparator(position);
            position++;
        }

        if (legCurrencyLength > 0)
        {
            buffer.putBytes(position, legCurrencyHeader, 0, legCurrencyHeaderLength);
            position += legCurrencyHeaderLength;
            buffer.putBytes(position, legCurrency, legCurrencyOffset, legCurrencyLength);
            position += legCurrencyLength;
            buffer.putSeparator(position);
            position++;
        }

        if (legPoolLength > 0)
        {
            buffer.putBytes(position, legPoolHeader, 0, legPoolHeaderLength);
            position += legPoolHeaderLength;
            buffer.putBytes(position, legPool, legPoolOffset, legPoolLength);
            position += legPoolLength;
            buffer.putSeparator(position);
            position++;
        }

        if (legDatedDateLength > 0)
        {
            buffer.putBytes(position, legDatedDateHeader, 0, legDatedDateHeaderLength);
            position += legDatedDateHeaderLength;
            buffer.putBytes(position, legDatedDate, legDatedDateOffset, legDatedDateLength);
            position += legDatedDateLength;
            buffer.putSeparator(position);
            position++;
        }

        if (legContractSettlMonthLength > 0)
        {
            buffer.putBytes(position, legContractSettlMonthHeader, 0, legContractSettlMonthHeaderLength);
            position += legContractSettlMonthHeaderLength;
            buffer.putBytes(position, legContractSettlMonth, legContractSettlMonthOffset, legContractSettlMonthLength);
            position += legContractSettlMonthLength;
            buffer.putSeparator(position);
            position++;
        }

        if (legInterestAccrualDateLength > 0)
        {
            buffer.putBytes(position, legInterestAccrualDateHeader, 0, legInterestAccrualDateHeaderLength);
            position += legInterestAccrualDateHeaderLength;
            buffer.putBytes(position, legInterestAccrualDate, legInterestAccrualDateOffset, legInterestAccrualDateLength);
            position += legInterestAccrualDateLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasLegPutOrCall)
        {
            buffer.putBytes(position, legPutOrCallHeader, 0, legPutOrCallHeaderLength);
            position += legPutOrCallHeaderLength;
            position += buffer.putIntAscii(position, legPutOrCall);
            buffer.putSeparator(position);
            position++;
        }

        if (hasLegOptionRatio)
        {
            buffer.putBytes(position, legOptionRatioHeader, 0, legOptionRatioHeaderLength);
            position += legOptionRatioHeaderLength;
            position += buffer.putFloatAscii(position, legOptionRatio);
            buffer.putSeparator(position);
            position++;
        }

        if (hasLegPrice)
        {
            buffer.putBytes(position, legPriceHeader, 0, legPriceHeaderLength);
            position += legPriceHeaderLength;
            position += buffer.putFloatAscii(position, legPrice);
            buffer.putSeparator(position);
            position++;
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetLegSymbol();
        this.resetLegSymbolSfx();
        this.resetLegSecurityID();
        this.resetLegSecurityIDSource();
        this.resetLegProduct();
        this.resetLegCFICode();
        this.resetLegSecurityType();
        this.resetLegSecuritySubType();
        this.resetLegMaturityMonthYear();
        this.resetLegMaturityDate();
        this.resetLegMaturityTime();
        this.resetLegCouponPaymentDate();
        this.resetLegIssueDate();
        this.resetLegRepoCollateralSecurityType();
        this.resetLegRepurchaseTerm();
        this.resetLegRepurchaseRate();
        this.resetLegFactor();
        this.resetLegCreditRating();
        this.resetLegInstrRegistry();
        this.resetLegCountryOfIssue();
        this.resetLegStateOrProvinceOfIssue();
        this.resetLegLocaleOfIssue();
        this.resetLegRedemptionDate();
        this.resetLegStrikePrice();
        this.resetLegStrikeCurrency();
        this.resetLegOptAttribute();
        this.resetLegContractMultiplier();
        this.resetLegContractMultiplierUnit();
        this.resetLegFlowScheduleType();
        this.resetLegUnitOfMeasure();
        this.resetLegUnitOfMeasureQty();
        this.resetLegPriceUnitOfMeasure();
        this.resetLegPriceUnitOfMeasureQty();
        this.resetLegTimeUnit();
        this.resetLegExerciseStyle();
        this.resetLegCouponRate();
        this.resetLegSecurityExchange();
        this.resetLegIssuer();
        this.resetEncodedLegIssuerLen();
        this.resetEncodedLegIssuer();
        this.resetLegSecurityDesc();
        this.resetEncodedLegSecurityDescLen();
        this.resetEncodedLegSecurityDesc();
        this.resetLegRatioQty();
        this.resetLegSide();
        this.resetLegCurrency();
        this.resetLegPool();
        this.resetLegDatedDate();
        this.resetLegContractSettlMonth();
        this.resetLegInterestAccrualDate();
        this.resetLegPutOrCall();
        this.resetLegOptionRatio();
        this.resetLegPrice();
        legSecAltIDGrp.reset();
    }

    public void resetLegSymbol()
    {
        legSymbolLength = 0;
    }

    public void resetLegSymbolSfx()
    {
        legSymbolSfxLength = 0;
    }

    public void resetLegSecurityID()
    {
        legSecurityIDLength = 0;
    }

    public void resetLegSecurityIDSource()
    {
        legSecurityIDSourceLength = 0;
    }

    public void resetLegProduct()
    {
        hasLegProduct = false;
    }

    public void resetLegCFICode()
    {
        legCFICodeLength = 0;
    }

    public void resetLegSecurityType()
    {
        legSecurityTypeLength = 0;
    }

    public void resetLegSecuritySubType()
    {
        legSecuritySubTypeLength = 0;
    }

    public void resetLegMaturityMonthYear()
    {
        legMaturityMonthYearLength = 0;
    }

    public void resetLegMaturityDate()
    {
        legMaturityDateLength = 0;
    }

    public void resetLegMaturityTime()
    {
        legMaturityTimeLength = 0;
    }

    public void resetLegCouponPaymentDate()
    {
        legCouponPaymentDateLength = 0;
    }

    public void resetLegIssueDate()
    {
        legIssueDateLength = 0;
    }

    public void resetLegRepoCollateralSecurityType()
    {
        legRepoCollateralSecurityTypeLength = 0;
    }

    public void resetLegRepurchaseTerm()
    {
        hasLegRepurchaseTerm = false;
    }

    public void resetLegRepurchaseRate()
    {
        hasLegRepurchaseRate = false;
    }

    public void resetLegFactor()
    {
        hasLegFactor = false;
    }

    public void resetLegCreditRating()
    {
        legCreditRatingLength = 0;
    }

    public void resetLegInstrRegistry()
    {
        legInstrRegistryLength = 0;
    }

    public void resetLegCountryOfIssue()
    {
        legCountryOfIssueLength = 0;
    }

    public void resetLegStateOrProvinceOfIssue()
    {
        legStateOrProvinceOfIssueLength = 0;
    }

    public void resetLegLocaleOfIssue()
    {
        legLocaleOfIssueLength = 0;
    }

    public void resetLegRedemptionDate()
    {
        legRedemptionDateLength = 0;
    }

    public void resetLegStrikePrice()
    {
        hasLegStrikePrice = false;
    }

    public void resetLegStrikeCurrency()
    {
        legStrikeCurrencyLength = 0;
    }

    public void resetLegOptAttribute()
    {
        hasLegOptAttribute = false;
    }

    public void resetLegContractMultiplier()
    {
        hasLegContractMultiplier = false;
    }

    public void resetLegContractMultiplierUnit()
    {
        hasLegContractMultiplierUnit = false;
    }

    public void resetLegFlowScheduleType()
    {
        hasLegFlowScheduleType = false;
    }

    public void resetLegUnitOfMeasure()
    {
        legUnitOfMeasureLength = 0;
    }

    public void resetLegUnitOfMeasureQty()
    {
        hasLegUnitOfMeasureQty = false;
    }

    public void resetLegPriceUnitOfMeasure()
    {
        legPriceUnitOfMeasureLength = 0;
    }

    public void resetLegPriceUnitOfMeasureQty()
    {
        hasLegPriceUnitOfMeasureQty = false;
    }

    public void resetLegTimeUnit()
    {
        legTimeUnitLength = 0;
    }

    public void resetLegExerciseStyle()
    {
        hasLegExerciseStyle = false;
    }

    public void resetLegCouponRate()
    {
        hasLegCouponRate = false;
    }

    public void resetLegSecurityExchange()
    {
        legSecurityExchangeLength = 0;
    }

    public void resetLegIssuer()
    {
        legIssuerLength = 0;
    }

    public void resetEncodedLegIssuerLen()
    {
        hasEncodedLegIssuerLen = false;
    }

    public void resetEncodedLegIssuer()
    {
        hasEncodedLegIssuer = false;
    }

    public void resetLegSecurityDesc()
    {
        legSecurityDescLength = 0;
    }

    public void resetEncodedLegSecurityDescLen()
    {
        hasEncodedLegSecurityDescLen = false;
    }

    public void resetEncodedLegSecurityDesc()
    {
        hasEncodedLegSecurityDesc = false;
    }

    public void resetLegRatioQty()
    {
        hasLegRatioQty = false;
    }

    public void resetLegSide()
    {
        hasLegSide = false;
    }

    public void resetLegCurrency()
    {
        legCurrencyLength = 0;
    }

    public void resetLegPool()
    {
        legPoolLength = 0;
    }

    public void resetLegDatedDate()
    {
        legDatedDateLength = 0;
    }

    public void resetLegContractSettlMonth()
    {
        legContractSettlMonthLength = 0;
    }

    public void resetLegInterestAccrualDate()
    {
        legInterestAccrualDateLength = 0;
    }

    public void resetLegPutOrCall()
    {
        hasLegPutOrCall = false;
    }

    public void resetLegOptionRatio()
    {
        hasLegOptionRatio = false;
    }

    public void resetLegPrice()
    {
        hasLegPrice = false;
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
        builder.append("\"MessageName\": \"InstrumentLeg\",\n");
        if (hasLegSymbol())
        {
            indent(builder, level);
            builder.append("\"LegSymbol\": \"");
            appendBuffer(builder, legSymbol, legSymbolOffset, legSymbolLength);
            builder.append("\",\n");
        }

        if (hasLegSymbolSfx())
        {
            indent(builder, level);
            builder.append("\"LegSymbolSfx\": \"");
            appendBuffer(builder, legSymbolSfx, legSymbolSfxOffset, legSymbolSfxLength);
            builder.append("\",\n");
        }

        if (hasLegSecurityID())
        {
            indent(builder, level);
            builder.append("\"LegSecurityID\": \"");
            appendBuffer(builder, legSecurityID, legSecurityIDOffset, legSecurityIDLength);
            builder.append("\",\n");
        }

        if (hasLegSecurityIDSource())
        {
            indent(builder, level);
            builder.append("\"LegSecurityIDSource\": \"");
            appendBuffer(builder, legSecurityIDSource, legSecurityIDSourceOffset, legSecurityIDSourceLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"LegSecAltIDGrp\": ");
    legSecAltIDGrp.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasLegProduct())
        {
            indent(builder, level);
            builder.append("\"LegProduct\": \"");
            builder.append(legProduct);
            builder.append("\",\n");
        }

        if (hasLegCFICode())
        {
            indent(builder, level);
            builder.append("\"LegCFICode\": \"");
            appendBuffer(builder, legCFICode, legCFICodeOffset, legCFICodeLength);
            builder.append("\",\n");
        }

        if (hasLegSecurityType())
        {
            indent(builder, level);
            builder.append("\"LegSecurityType\": \"");
            appendBuffer(builder, legSecurityType, legSecurityTypeOffset, legSecurityTypeLength);
            builder.append("\",\n");
        }

        if (hasLegSecuritySubType())
        {
            indent(builder, level);
            builder.append("\"LegSecuritySubType\": \"");
            appendBuffer(builder, legSecuritySubType, legSecuritySubTypeOffset, legSecuritySubTypeLength);
            builder.append("\",\n");
        }

        if (hasLegMaturityMonthYear())
        {
            indent(builder, level);
            builder.append("\"LegMaturityMonthYear\": \"");
            appendBuffer(builder, legMaturityMonthYear, legMaturityMonthYearOffset, legMaturityMonthYearLength);
            builder.append("\",\n");
        }

        if (hasLegMaturityDate())
        {
            indent(builder, level);
            builder.append("\"LegMaturityDate\": \"");
            appendBuffer(builder, legMaturityDate, legMaturityDateOffset, legMaturityDateLength);
            builder.append("\",\n");
        }

        if (hasLegMaturityTime())
        {
            indent(builder, level);
            builder.append("\"LegMaturityTime\": \"");
            appendBuffer(builder, legMaturityTime, legMaturityTimeOffset, legMaturityTimeLength);
            builder.append("\",\n");
        }

        if (hasLegCouponPaymentDate())
        {
            indent(builder, level);
            builder.append("\"LegCouponPaymentDate\": \"");
            appendBuffer(builder, legCouponPaymentDate, legCouponPaymentDateOffset, legCouponPaymentDateLength);
            builder.append("\",\n");
        }

        if (hasLegIssueDate())
        {
            indent(builder, level);
            builder.append("\"LegIssueDate\": \"");
            appendBuffer(builder, legIssueDate, legIssueDateOffset, legIssueDateLength);
            builder.append("\",\n");
        }

        if (hasLegRepoCollateralSecurityType())
        {
            indent(builder, level);
            builder.append("\"LegRepoCollateralSecurityType\": \"");
            appendBuffer(builder, legRepoCollateralSecurityType, legRepoCollateralSecurityTypeOffset, legRepoCollateralSecurityTypeLength);
            builder.append("\",\n");
        }

        if (hasLegRepurchaseTerm())
        {
            indent(builder, level);
            builder.append("\"LegRepurchaseTerm\": \"");
            builder.append(legRepurchaseTerm);
            builder.append("\",\n");
        }

        if (hasLegRepurchaseRate())
        {
            indent(builder, level);
            builder.append("\"LegRepurchaseRate\": \"");
            legRepurchaseRate.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasLegFactor())
        {
            indent(builder, level);
            builder.append("\"LegFactor\": \"");
            legFactor.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasLegCreditRating())
        {
            indent(builder, level);
            builder.append("\"LegCreditRating\": \"");
            appendBuffer(builder, legCreditRating, legCreditRatingOffset, legCreditRatingLength);
            builder.append("\",\n");
        }

        if (hasLegInstrRegistry())
        {
            indent(builder, level);
            builder.append("\"LegInstrRegistry\": \"");
            appendBuffer(builder, legInstrRegistry, legInstrRegistryOffset, legInstrRegistryLength);
            builder.append("\",\n");
        }

        if (hasLegCountryOfIssue())
        {
            indent(builder, level);
            builder.append("\"LegCountryOfIssue\": \"");
            appendBuffer(builder, legCountryOfIssue, legCountryOfIssueOffset, legCountryOfIssueLength);
            builder.append("\",\n");
        }

        if (hasLegStateOrProvinceOfIssue())
        {
            indent(builder, level);
            builder.append("\"LegStateOrProvinceOfIssue\": \"");
            appendBuffer(builder, legStateOrProvinceOfIssue, legStateOrProvinceOfIssueOffset, legStateOrProvinceOfIssueLength);
            builder.append("\",\n");
        }

        if (hasLegLocaleOfIssue())
        {
            indent(builder, level);
            builder.append("\"LegLocaleOfIssue\": \"");
            appendBuffer(builder, legLocaleOfIssue, legLocaleOfIssueOffset, legLocaleOfIssueLength);
            builder.append("\",\n");
        }

        if (hasLegRedemptionDate())
        {
            indent(builder, level);
            builder.append("\"LegRedemptionDate\": \"");
            appendBuffer(builder, legRedemptionDate, legRedemptionDateOffset, legRedemptionDateLength);
            builder.append("\",\n");
        }

        if (hasLegStrikePrice())
        {
            indent(builder, level);
            builder.append("\"LegStrikePrice\": \"");
            legStrikePrice.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasLegStrikeCurrency())
        {
            indent(builder, level);
            builder.append("\"LegStrikeCurrency\": \"");
            appendBuffer(builder, legStrikeCurrency, legStrikeCurrencyOffset, legStrikeCurrencyLength);
            builder.append("\",\n");
        }

        if (hasLegOptAttribute())
        {
            indent(builder, level);
            builder.append("\"LegOptAttribute\": \"");
            builder.append(legOptAttribute);
            builder.append("\",\n");
        }

        if (hasLegContractMultiplier())
        {
            indent(builder, level);
            builder.append("\"LegContractMultiplier\": \"");
            legContractMultiplier.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasLegContractMultiplierUnit())
        {
            indent(builder, level);
            builder.append("\"LegContractMultiplierUnit\": \"");
            builder.append(legContractMultiplierUnit);
            builder.append("\",\n");
        }

        if (hasLegFlowScheduleType())
        {
            indent(builder, level);
            builder.append("\"LegFlowScheduleType\": \"");
            builder.append(legFlowScheduleType);
            builder.append("\",\n");
        }

        if (hasLegUnitOfMeasure())
        {
            indent(builder, level);
            builder.append("\"LegUnitOfMeasure\": \"");
            appendBuffer(builder, legUnitOfMeasure, legUnitOfMeasureOffset, legUnitOfMeasureLength);
            builder.append("\",\n");
        }

        if (hasLegUnitOfMeasureQty())
        {
            indent(builder, level);
            builder.append("\"LegUnitOfMeasureQty\": \"");
            legUnitOfMeasureQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasLegPriceUnitOfMeasure())
        {
            indent(builder, level);
            builder.append("\"LegPriceUnitOfMeasure\": \"");
            appendBuffer(builder, legPriceUnitOfMeasure, legPriceUnitOfMeasureOffset, legPriceUnitOfMeasureLength);
            builder.append("\",\n");
        }

        if (hasLegPriceUnitOfMeasureQty())
        {
            indent(builder, level);
            builder.append("\"LegPriceUnitOfMeasureQty\": \"");
            legPriceUnitOfMeasureQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasLegTimeUnit())
        {
            indent(builder, level);
            builder.append("\"LegTimeUnit\": \"");
            appendBuffer(builder, legTimeUnit, legTimeUnitOffset, legTimeUnitLength);
            builder.append("\",\n");
        }

        if (hasLegExerciseStyle())
        {
            indent(builder, level);
            builder.append("\"LegExerciseStyle\": \"");
            builder.append(legExerciseStyle);
            builder.append("\",\n");
        }

        if (hasLegCouponRate())
        {
            indent(builder, level);
            builder.append("\"LegCouponRate\": \"");
            legCouponRate.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasLegSecurityExchange())
        {
            indent(builder, level);
            builder.append("\"LegSecurityExchange\": \"");
            appendBuffer(builder, legSecurityExchange, legSecurityExchangeOffset, legSecurityExchangeLength);
            builder.append("\",\n");
        }

        if (hasLegIssuer())
        {
            indent(builder, level);
            builder.append("\"LegIssuer\": \"");
            appendBuffer(builder, legIssuer, legIssuerOffset, legIssuerLength);
            builder.append("\",\n");
        }

        if (hasEncodedLegIssuerLen())
        {
            indent(builder, level);
            builder.append("\"EncodedLegIssuerLen\": \"");
            builder.append(encodedLegIssuerLen);
            builder.append("\",\n");
        }

        if (hasEncodedLegIssuer())
        {
            indent(builder, level);
            builder.append("\"EncodedLegIssuer\": \"");
            appendData(builder, encodedLegIssuer, encodedLegIssuerLen);
            builder.append("\",\n");
        }

        if (hasLegSecurityDesc())
        {
            indent(builder, level);
            builder.append("\"LegSecurityDesc\": \"");
            appendBuffer(builder, legSecurityDesc, legSecurityDescOffset, legSecurityDescLength);
            builder.append("\",\n");
        }

        if (hasEncodedLegSecurityDescLen())
        {
            indent(builder, level);
            builder.append("\"EncodedLegSecurityDescLen\": \"");
            builder.append(encodedLegSecurityDescLen);
            builder.append("\",\n");
        }

        if (hasEncodedLegSecurityDesc())
        {
            indent(builder, level);
            builder.append("\"EncodedLegSecurityDesc\": \"");
            appendData(builder, encodedLegSecurityDesc, encodedLegSecurityDescLen);
            builder.append("\",\n");
        }

        if (hasLegRatioQty())
        {
            indent(builder, level);
            builder.append("\"LegRatioQty\": \"");
            legRatioQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasLegSide())
        {
            indent(builder, level);
            builder.append("\"LegSide\": \"");
            builder.append(legSide);
            builder.append("\",\n");
        }

        if (hasLegCurrency())
        {
            indent(builder, level);
            builder.append("\"LegCurrency\": \"");
            appendBuffer(builder, legCurrency, legCurrencyOffset, legCurrencyLength);
            builder.append("\",\n");
        }

        if (hasLegPool())
        {
            indent(builder, level);
            builder.append("\"LegPool\": \"");
            appendBuffer(builder, legPool, legPoolOffset, legPoolLength);
            builder.append("\",\n");
        }

        if (hasLegDatedDate())
        {
            indent(builder, level);
            builder.append("\"LegDatedDate\": \"");
            appendBuffer(builder, legDatedDate, legDatedDateOffset, legDatedDateLength);
            builder.append("\",\n");
        }

        if (hasLegContractSettlMonth())
        {
            indent(builder, level);
            builder.append("\"LegContractSettlMonth\": \"");
            appendBuffer(builder, legContractSettlMonth, legContractSettlMonthOffset, legContractSettlMonthLength);
            builder.append("\",\n");
        }

        if (hasLegInterestAccrualDate())
        {
            indent(builder, level);
            builder.append("\"LegInterestAccrualDate\": \"");
            appendBuffer(builder, legInterestAccrualDate, legInterestAccrualDateOffset, legInterestAccrualDateLength);
            builder.append("\",\n");
        }

        if (hasLegPutOrCall())
        {
            indent(builder, level);
            builder.append("\"LegPutOrCall\": \"");
            builder.append(legPutOrCall);
            builder.append("\",\n");
        }

        if (hasLegOptionRatio())
        {
            indent(builder, level);
            builder.append("\"LegOptionRatio\": \"");
            legOptionRatio.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasLegPrice())
        {
            indent(builder, level);
            builder.append("\"LegPrice\": \"");
            legPrice.appendTo(builder);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public InstrumentLegEncoder copyTo(final Encoder encoder)
    {
        return copyTo((InstrumentLegEncoder)encoder);
    }

    public InstrumentLegEncoder copyTo(final InstrumentLegEncoder encoder)
    {
        encoder.reset();
        if (hasLegSymbol())
        {
            encoder.legSymbolAsCopy(legSymbol.byteArray(), 0, legSymbolLength);
        }

        if (hasLegSymbolSfx())
        {
            encoder.legSymbolSfxAsCopy(legSymbolSfx.byteArray(), 0, legSymbolSfxLength);
        }

        if (hasLegSecurityID())
        {
            encoder.legSecurityIDAsCopy(legSecurityID.byteArray(), 0, legSecurityIDLength);
        }

        if (hasLegSecurityIDSource())
        {
            encoder.legSecurityIDSourceAsCopy(legSecurityIDSource.byteArray(), 0, legSecurityIDSourceLength);
        }


        legSecAltIDGrp.copyTo(encoder.legSecAltIDGrp());
        if (hasLegProduct())
        {
            encoder.legProduct(this.legProduct());
        }

        if (hasLegCFICode())
        {
            encoder.legCFICodeAsCopy(legCFICode.byteArray(), 0, legCFICodeLength);
        }

        if (hasLegSecurityType())
        {
            encoder.legSecurityTypeAsCopy(legSecurityType.byteArray(), 0, legSecurityTypeLength);
        }

        if (hasLegSecuritySubType())
        {
            encoder.legSecuritySubTypeAsCopy(legSecuritySubType.byteArray(), 0, legSecuritySubTypeLength);
        }

        if (hasLegMaturityMonthYear())
        {
            encoder.legMaturityMonthYearAsCopy(legMaturityMonthYear.byteArray(), 0, legMaturityMonthYearLength);
        }

        if (hasLegMaturityDate())
        {
            encoder.legMaturityDateAsCopy(legMaturityDate.byteArray(), 0, legMaturityDateLength);
        }

        if (hasLegMaturityTime())
        {
            encoder.legMaturityTimeAsCopy(legMaturityTime.byteArray(), 0, legMaturityTimeLength);
        }

        if (hasLegCouponPaymentDate())
        {
            encoder.legCouponPaymentDateAsCopy(legCouponPaymentDate.byteArray(), 0, legCouponPaymentDateLength);
        }

        if (hasLegIssueDate())
        {
            encoder.legIssueDateAsCopy(legIssueDate.byteArray(), 0, legIssueDateLength);
        }

        if (hasLegRepoCollateralSecurityType())
        {
            encoder.legRepoCollateralSecurityTypeAsCopy(legRepoCollateralSecurityType.byteArray(), 0, legRepoCollateralSecurityTypeLength);
        }

        if (hasLegRepurchaseTerm())
        {
            encoder.legRepurchaseTerm(this.legRepurchaseTerm());
        }

        if (hasLegRepurchaseRate())
        {
            encoder.legRepurchaseRate(this.legRepurchaseRate());
        }

        if (hasLegFactor())
        {
            encoder.legFactor(this.legFactor());
        }

        if (hasLegCreditRating())
        {
            encoder.legCreditRatingAsCopy(legCreditRating.byteArray(), 0, legCreditRatingLength);
        }

        if (hasLegInstrRegistry())
        {
            encoder.legInstrRegistryAsCopy(legInstrRegistry.byteArray(), 0, legInstrRegistryLength);
        }

        if (hasLegCountryOfIssue())
        {
            encoder.legCountryOfIssueAsCopy(legCountryOfIssue.byteArray(), 0, legCountryOfIssueLength);
        }

        if (hasLegStateOrProvinceOfIssue())
        {
            encoder.legStateOrProvinceOfIssueAsCopy(legStateOrProvinceOfIssue.byteArray(), 0, legStateOrProvinceOfIssueLength);
        }

        if (hasLegLocaleOfIssue())
        {
            encoder.legLocaleOfIssueAsCopy(legLocaleOfIssue.byteArray(), 0, legLocaleOfIssueLength);
        }

        if (hasLegRedemptionDate())
        {
            encoder.legRedemptionDateAsCopy(legRedemptionDate.byteArray(), 0, legRedemptionDateLength);
        }

        if (hasLegStrikePrice())
        {
            encoder.legStrikePrice(this.legStrikePrice());
        }

        if (hasLegStrikeCurrency())
        {
            encoder.legStrikeCurrencyAsCopy(legStrikeCurrency.byteArray(), 0, legStrikeCurrencyLength);
        }

        if (hasLegOptAttribute())
        {
            encoder.legOptAttribute(this.legOptAttribute());
        }

        if (hasLegContractMultiplier())
        {
            encoder.legContractMultiplier(this.legContractMultiplier());
        }

        if (hasLegContractMultiplierUnit())
        {
            encoder.legContractMultiplierUnit(this.legContractMultiplierUnit());
        }

        if (hasLegFlowScheduleType())
        {
            encoder.legFlowScheduleType(this.legFlowScheduleType());
        }

        if (hasLegUnitOfMeasure())
        {
            encoder.legUnitOfMeasureAsCopy(legUnitOfMeasure.byteArray(), 0, legUnitOfMeasureLength);
        }

        if (hasLegUnitOfMeasureQty())
        {
            encoder.legUnitOfMeasureQty(this.legUnitOfMeasureQty());
        }

        if (hasLegPriceUnitOfMeasure())
        {
            encoder.legPriceUnitOfMeasureAsCopy(legPriceUnitOfMeasure.byteArray(), 0, legPriceUnitOfMeasureLength);
        }

        if (hasLegPriceUnitOfMeasureQty())
        {
            encoder.legPriceUnitOfMeasureQty(this.legPriceUnitOfMeasureQty());
        }

        if (hasLegTimeUnit())
        {
            encoder.legTimeUnitAsCopy(legTimeUnit.byteArray(), 0, legTimeUnitLength);
        }

        if (hasLegExerciseStyle())
        {
            encoder.legExerciseStyle(this.legExerciseStyle());
        }

        if (hasLegCouponRate())
        {
            encoder.legCouponRate(this.legCouponRate());
        }

        if (hasLegSecurityExchange())
        {
            encoder.legSecurityExchangeAsCopy(legSecurityExchange.byteArray(), 0, legSecurityExchangeLength);
        }

        if (hasLegIssuer())
        {
            encoder.legIssuerAsCopy(legIssuer.byteArray(), 0, legIssuerLength);
        }

        if (hasEncodedLegIssuerLen())
        {
            encoder.encodedLegIssuerLen(this.encodedLegIssuerLen());
        }

        if (hasEncodedLegIssuer())
        {
            encoder.encodedLegIssuerAsCopy(this.encodedLegIssuer(), 0, encodedLegIssuerLen());
            encoder.encodedLegIssuerLen(encodedLegIssuerLen());
        }

        if (hasLegSecurityDesc())
        {
            encoder.legSecurityDescAsCopy(legSecurityDesc.byteArray(), 0, legSecurityDescLength);
        }

        if (hasEncodedLegSecurityDescLen())
        {
            encoder.encodedLegSecurityDescLen(this.encodedLegSecurityDescLen());
        }

        if (hasEncodedLegSecurityDesc())
        {
            encoder.encodedLegSecurityDescAsCopy(this.encodedLegSecurityDesc(), 0, encodedLegSecurityDescLen());
            encoder.encodedLegSecurityDescLen(encodedLegSecurityDescLen());
        }

        if (hasLegRatioQty())
        {
            encoder.legRatioQty(this.legRatioQty());
        }

        if (hasLegSide())
        {
            encoder.legSide(this.legSide());
        }

        if (hasLegCurrency())
        {
            encoder.legCurrencyAsCopy(legCurrency.byteArray(), 0, legCurrencyLength);
        }

        if (hasLegPool())
        {
            encoder.legPoolAsCopy(legPool.byteArray(), 0, legPoolLength);
        }

        if (hasLegDatedDate())
        {
            encoder.legDatedDateAsCopy(legDatedDate.byteArray(), 0, legDatedDateLength);
        }

        if (hasLegContractSettlMonth())
        {
            encoder.legContractSettlMonthAsCopy(legContractSettlMonth.byteArray(), 0, legContractSettlMonthLength);
        }

        if (hasLegInterestAccrualDate())
        {
            encoder.legInterestAccrualDateAsCopy(legInterestAccrualDate.byteArray(), 0, legInterestAccrualDateLength);
        }

        if (hasLegPutOrCall())
        {
            encoder.legPutOrCall(this.legPutOrCall());
        }

        if (hasLegOptionRatio())
        {
            encoder.legOptionRatio(this.legOptionRatio());
        }

        if (hasLegPrice())
        {
            encoder.legPrice(this.legPrice());
        }
        return encoder;
    }

}
