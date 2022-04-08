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

    private static final int noSecurityAltIDGroupCounterHeaderLength = 4;
    private static final byte[] noSecurityAltIDGroupCounterHeader = new byte[] {52, 53, 52, (byte) '='};

    private static final int productHeaderLength = 4;
    private static final byte[] productHeader = new byte[] {52, 54, 48, (byte) '='};

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

    private static final int putOrCallHeaderLength = 4;
    private static final byte[] putOrCallHeader = new byte[] {50, 48, 49, (byte) '='};

    private static final int couponPaymentDateHeaderLength = 4;
    private static final byte[] couponPaymentDateHeader = new byte[] {50, 50, 52, (byte) '='};

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

    private static final int optAttributeHeaderLength = 4;
    private static final byte[] optAttributeHeader = new byte[] {50, 48, 54, (byte) '='};

    private static final int contractMultiplierHeaderLength = 4;
    private static final byte[] contractMultiplierHeader = new byte[] {50, 51, 49, (byte) '='};

    private static final int couponRateHeaderLength = 4;
    private static final byte[] couponRateHeader = new byte[] {50, 50, 51, (byte) '='};

    private static final int securityExchangeHeaderLength = 4;
    private static final byte[] securityExchangeHeader = new byte[] {50, 48, 55, (byte) '='};

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

    private static final int noEventsGroupCounterHeaderLength = 4;
    private static final byte[] noEventsGroupCounterHeader = new byte[] {56, 54, 52, (byte) '='};

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



public static class SecurityAltIDGroupEncoder
{
    private SecurityAltIDGroupEncoder next = null;

    public SecurityAltIDGroupEncoder next()
    {
        if (next == null)
        {
            next = new SecurityAltIDGroupEncoder();
        }
        return next;
    }

    private static final int securityAltIDHeaderLength = 4;
    private static final byte[] securityAltIDHeader = new byte[] {52, 53, 53, (byte) '='};

    private static final int securityAltIDSourceHeaderLength = 4;
    private static final byte[] securityAltIDSourceHeader = new byte[] {52, 53, 54, (byte) '='};

    private final MutableDirectBuffer securityAltID = new UnsafeBuffer();

    private int securityAltIDOffset = 0;

    private int securityAltIDLength = 0;

    public SecurityAltIDGroupEncoder securityAltID(final DirectBuffer value, final int offset, final int length)
    {
        securityAltID.wrap(value);
        securityAltIDOffset = offset;
        securityAltIDLength = length;
        return this;
    }

    public SecurityAltIDGroupEncoder securityAltID(final DirectBuffer value, final int length)
    {
        return securityAltID(value, 0, length);
    }

    public SecurityAltIDGroupEncoder securityAltID(final DirectBuffer value)
    {
        return securityAltID(value, 0, value.capacity());
    }

    public SecurityAltIDGroupEncoder securityAltID(final byte[] value, final int offset, final int length)
    {
        securityAltID.wrap(value);
        securityAltIDOffset = offset;
        securityAltIDLength = length;
        return this;
    }

    public SecurityAltIDGroupEncoder securityAltIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(securityAltID, value, offset, length);
        securityAltIDOffset = offset;
        securityAltIDLength = length;
        return this;
    }

    public SecurityAltIDGroupEncoder securityAltID(final byte[] value, final int length)
    {
        return securityAltID(value, 0, length);
    }

    public SecurityAltIDGroupEncoder securityAltID(final byte[] value)
    {
        return securityAltID(value, 0, value.length);
    }

    public boolean hasSecurityAltID()
    {
        return securityAltIDLength > 0;
    }

    public MutableDirectBuffer securityAltID()
    {
        return securityAltID;
    }

    public String securityAltIDAsString()
    {
        return securityAltID.getStringWithoutLengthAscii(securityAltIDOffset, securityAltIDLength);
    }

    public SecurityAltIDGroupEncoder securityAltID(final CharSequence value)
    {
        toBytes(value, securityAltID);
        securityAltIDOffset = 0;
        securityAltIDLength = value.length();
        return this;
    }

    public SecurityAltIDGroupEncoder securityAltID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            securityAltID.wrap(buffer);
            securityAltIDOffset = value.offset();
            securityAltIDLength = value.length();
        }
        return this;
    }

    public SecurityAltIDGroupEncoder securityAltID(final char[] value)
    {
        return securityAltID(value, 0, value.length);
    }

    public SecurityAltIDGroupEncoder securityAltID(final char[] value, final int length)
    {
        return securityAltID(value, 0, length);
    }

    public SecurityAltIDGroupEncoder securityAltID(final char[] value, final int offset, final int length)
    {
        toBytes(value, securityAltID, offset, length);
        securityAltIDOffset = 0;
        securityAltIDLength = length;
        return this;
    }

    private final MutableDirectBuffer securityAltIDSource = new UnsafeBuffer();

    private int securityAltIDSourceOffset = 0;

    private int securityAltIDSourceLength = 0;

    public SecurityAltIDGroupEncoder securityAltIDSource(final DirectBuffer value, final int offset, final int length)
    {
        securityAltIDSource.wrap(value);
        securityAltIDSourceOffset = offset;
        securityAltIDSourceLength = length;
        return this;
    }

    public SecurityAltIDGroupEncoder securityAltIDSource(final DirectBuffer value, final int length)
    {
        return securityAltIDSource(value, 0, length);
    }

    public SecurityAltIDGroupEncoder securityAltIDSource(final DirectBuffer value)
    {
        return securityAltIDSource(value, 0, value.capacity());
    }

    public SecurityAltIDGroupEncoder securityAltIDSource(final byte[] value, final int offset, final int length)
    {
        securityAltIDSource.wrap(value);
        securityAltIDSourceOffset = offset;
        securityAltIDSourceLength = length;
        return this;
    }

    public SecurityAltIDGroupEncoder securityAltIDSourceAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(securityAltIDSource, value, offset, length);
        securityAltIDSourceOffset = offset;
        securityAltIDSourceLength = length;
        return this;
    }

    public SecurityAltIDGroupEncoder securityAltIDSource(final byte[] value, final int length)
    {
        return securityAltIDSource(value, 0, length);
    }

    public SecurityAltIDGroupEncoder securityAltIDSource(final byte[] value)
    {
        return securityAltIDSource(value, 0, value.length);
    }

    public boolean hasSecurityAltIDSource()
    {
        return securityAltIDSourceLength > 0;
    }

    public MutableDirectBuffer securityAltIDSource()
    {
        return securityAltIDSource;
    }

    public String securityAltIDSourceAsString()
    {
        return securityAltIDSource.getStringWithoutLengthAscii(securityAltIDSourceOffset, securityAltIDSourceLength);
    }

    public SecurityAltIDGroupEncoder securityAltIDSource(final CharSequence value)
    {
        toBytes(value, securityAltIDSource);
        securityAltIDSourceOffset = 0;
        securityAltIDSourceLength = value.length();
        return this;
    }

    public SecurityAltIDGroupEncoder securityAltIDSource(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            securityAltIDSource.wrap(buffer);
            securityAltIDSourceOffset = value.offset();
            securityAltIDSourceLength = value.length();
        }
        return this;
    }

    public SecurityAltIDGroupEncoder securityAltIDSource(final char[] value)
    {
        return securityAltIDSource(value, 0, value.length);
    }

    public SecurityAltIDGroupEncoder securityAltIDSource(final char[] value, final int length)
    {
        return securityAltIDSource(value, 0, length);
    }

    public SecurityAltIDGroupEncoder securityAltIDSource(final char[] value, final int offset, final int length)
    {
        toBytes(value, securityAltIDSource, offset, length);
        securityAltIDSourceOffset = 0;
        securityAltIDSourceLength = length;
        return this;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (securityAltIDLength > 0)
        {
            buffer.putBytes(position, securityAltIDHeader, 0, securityAltIDHeaderLength);
            position += securityAltIDHeaderLength;
            buffer.putBytes(position, securityAltID, securityAltIDOffset, securityAltIDLength);
            position += securityAltIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (securityAltIDSourceLength > 0)
        {
            buffer.putBytes(position, securityAltIDSourceHeader, 0, securityAltIDSourceHeaderLength);
            position += securityAltIDSourceHeaderLength;
            buffer.putBytes(position, securityAltIDSource, securityAltIDSourceOffset, securityAltIDSourceLength);
            position += securityAltIDSourceLength;
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
        this.resetSecurityAltID();
        this.resetSecurityAltIDSource();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetSecurityAltID()
    {
        securityAltIDLength = 0;
    }

    public void resetSecurityAltIDSource()
    {
        securityAltIDSourceLength = 0;
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
        builder.append("\"MessageName\": \"SecurityAltIDGroup\",\n");
        if (hasSecurityAltID())
        {
            indent(builder, level);
            builder.append("\"SecurityAltID\": \"");
            appendBuffer(builder, securityAltID, securityAltIDOffset, securityAltIDLength);
            builder.append("\",\n");
        }

        if (hasSecurityAltIDSource())
        {
            indent(builder, level);
            builder.append("\"SecurityAltIDSource\": \"");
            appendBuffer(builder, securityAltIDSource, securityAltIDSourceOffset, securityAltIDSourceLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public SecurityAltIDGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((SecurityAltIDGroupEncoder)encoder);
    }

    public SecurityAltIDGroupEncoder copyTo(final SecurityAltIDGroupEncoder encoder)
    {
        encoder.reset();
        if (hasSecurityAltID())
        {
            encoder.securityAltIDAsCopy(securityAltID.byteArray(), 0, securityAltIDLength);
        }

        if (hasSecurityAltIDSource())
        {
            encoder.securityAltIDSourceAsCopy(securityAltIDSource.byteArray(), 0, securityAltIDSourceLength);
        }
        return encoder;
    }

}
    private int noSecurityAltIDGroupCounter;

    private boolean hasNoSecurityAltIDGroupCounter;

    public boolean hasNoSecurityAltIDGroupCounter()
    {
        return hasNoSecurityAltIDGroupCounter;
    }

    public InstrumentEncoder noSecurityAltIDGroupCounter(int value)
    {
        noSecurityAltIDGroupCounter = value;
        hasNoSecurityAltIDGroupCounter = true;
        return this;
    }

    public int noSecurityAltIDGroupCounter()
    {
        return noSecurityAltIDGroupCounter;
    }


    private SecurityAltIDGroupEncoder securityAltIDGroup = null;

    public SecurityAltIDGroupEncoder securityAltIDGroup(final int numberOfElements)
    {
        hasNoSecurityAltIDGroupCounter = true;
        noSecurityAltIDGroupCounter = numberOfElements;
        if (securityAltIDGroup == null)
        {
            securityAltIDGroup = new SecurityAltIDGroupEncoder();
        }
        return securityAltIDGroup;
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



public static class EventsGroupEncoder
{
    private EventsGroupEncoder next = null;

    public EventsGroupEncoder next()
    {
        if (next == null)
        {
            next = new EventsGroupEncoder();
        }
        return next;
    }

    private static final int eventTypeHeaderLength = 4;
    private static final byte[] eventTypeHeader = new byte[] {56, 54, 53, (byte) '='};

    private static final int eventDateHeaderLength = 4;
    private static final byte[] eventDateHeader = new byte[] {56, 54, 54, (byte) '='};

    private static final int eventPxHeaderLength = 4;
    private static final byte[] eventPxHeader = new byte[] {56, 54, 55, (byte) '='};

    private static final int eventTextHeaderLength = 4;
    private static final byte[] eventTextHeader = new byte[] {56, 54, 56, (byte) '='};

    private int eventType;

    private boolean hasEventType;

    public boolean hasEventType()
    {
        return hasEventType;
    }

    public EventsGroupEncoder eventType(int value)
    {
        eventType = value;
        hasEventType = true;
        return this;
    }

    public int eventType()
    {
        return eventType;
    }

    public EventsGroupEncoder eventType(EventType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == EventType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: eventType Value: " + value );
            }
            if (value == EventType.NULL_VAL)
            {
                return this;
            }
        }
        return eventType(value.representation());
    }

    private final MutableDirectBuffer eventDate = new UnsafeBuffer();

    private int eventDateOffset = 0;

    private int eventDateLength = 0;

    public EventsGroupEncoder eventDate(final DirectBuffer value, final int offset, final int length)
    {
        eventDate.wrap(value);
        eventDateOffset = offset;
        eventDateLength = length;
        return this;
    }

    public EventsGroupEncoder eventDate(final DirectBuffer value, final int length)
    {
        return eventDate(value, 0, length);
    }

    public EventsGroupEncoder eventDate(final DirectBuffer value)
    {
        return eventDate(value, 0, value.capacity());
    }

    public EventsGroupEncoder eventDate(final byte[] value, final int offset, final int length)
    {
        eventDate.wrap(value);
        eventDateOffset = offset;
        eventDateLength = length;
        return this;
    }

    public EventsGroupEncoder eventDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(eventDate, value, offset, length);
        eventDateOffset = offset;
        eventDateLength = length;
        return this;
    }

    public EventsGroupEncoder eventDate(final byte[] value, final int length)
    {
        return eventDate(value, 0, length);
    }

    public EventsGroupEncoder eventDate(final byte[] value)
    {
        return eventDate(value, 0, value.length);
    }

    public boolean hasEventDate()
    {
        return eventDateLength > 0;
    }

    public MutableDirectBuffer eventDate()
    {
        return eventDate;
    }

    public String eventDateAsString()
    {
        return eventDate.getStringWithoutLengthAscii(eventDateOffset, eventDateLength);
    }

    private final DecimalFloat eventPx = new DecimalFloat();

    private boolean hasEventPx;

    public boolean hasEventPx()
    {
        return hasEventPx;
    }

    public EventsGroupEncoder eventPx(DecimalFloat value)
    {
        eventPx.set(value);
        hasEventPx = true;
        return this;
    }

    public EventsGroupEncoder eventPx(long value, int scale)
    {
        eventPx.set(value, scale);
        hasEventPx = true;
        return this;
    }

    public DecimalFloat eventPx()
    {
        return eventPx;
    }

    private final MutableDirectBuffer eventText = new UnsafeBuffer();

    private int eventTextOffset = 0;

    private int eventTextLength = 0;

    public EventsGroupEncoder eventText(final DirectBuffer value, final int offset, final int length)
    {
        eventText.wrap(value);
        eventTextOffset = offset;
        eventTextLength = length;
        return this;
    }

    public EventsGroupEncoder eventText(final DirectBuffer value, final int length)
    {
        return eventText(value, 0, length);
    }

    public EventsGroupEncoder eventText(final DirectBuffer value)
    {
        return eventText(value, 0, value.capacity());
    }

    public EventsGroupEncoder eventText(final byte[] value, final int offset, final int length)
    {
        eventText.wrap(value);
        eventTextOffset = offset;
        eventTextLength = length;
        return this;
    }

    public EventsGroupEncoder eventTextAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(eventText, value, offset, length);
        eventTextOffset = offset;
        eventTextLength = length;
        return this;
    }

    public EventsGroupEncoder eventText(final byte[] value, final int length)
    {
        return eventText(value, 0, length);
    }

    public EventsGroupEncoder eventText(final byte[] value)
    {
        return eventText(value, 0, value.length);
    }

    public boolean hasEventText()
    {
        return eventTextLength > 0;
    }

    public MutableDirectBuffer eventText()
    {
        return eventText;
    }

    public String eventTextAsString()
    {
        return eventText.getStringWithoutLengthAscii(eventTextOffset, eventTextLength);
    }

    public EventsGroupEncoder eventText(final CharSequence value)
    {
        toBytes(value, eventText);
        eventTextOffset = 0;
        eventTextLength = value.length();
        return this;
    }

    public EventsGroupEncoder eventText(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            eventText.wrap(buffer);
            eventTextOffset = value.offset();
            eventTextLength = value.length();
        }
        return this;
    }

    public EventsGroupEncoder eventText(final char[] value)
    {
        return eventText(value, 0, value.length);
    }

    public EventsGroupEncoder eventText(final char[] value, final int length)
    {
        return eventText(value, 0, length);
    }

    public EventsGroupEncoder eventText(final char[] value, final int offset, final int length)
    {
        toBytes(value, eventText, offset, length);
        eventTextOffset = 0;
        eventTextLength = length;
        return this;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (hasEventType)
        {
            buffer.putBytes(position, eventTypeHeader, 0, eventTypeHeaderLength);
            position += eventTypeHeaderLength;
            position += buffer.putIntAscii(position, eventType);
            buffer.putSeparator(position);
            position++;
        }

        if (eventDateLength > 0)
        {
            buffer.putBytes(position, eventDateHeader, 0, eventDateHeaderLength);
            position += eventDateHeaderLength;
            buffer.putBytes(position, eventDate, eventDateOffset, eventDateLength);
            position += eventDateLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasEventPx)
        {
            buffer.putBytes(position, eventPxHeader, 0, eventPxHeaderLength);
            position += eventPxHeaderLength;
            position += buffer.putFloatAscii(position, eventPx);
            buffer.putSeparator(position);
            position++;
        }

        if (eventTextLength > 0)
        {
            buffer.putBytes(position, eventTextHeader, 0, eventTextHeaderLength);
            position += eventTextHeaderLength;
            buffer.putBytes(position, eventText, eventTextOffset, eventTextLength);
            position += eventTextLength;
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
        this.resetEventType();
        this.resetEventDate();
        this.resetEventPx();
        this.resetEventText();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetEventType()
    {
        hasEventType = false;
    }

    public void resetEventDate()
    {
        eventDateLength = 0;
    }

    public void resetEventPx()
    {
        hasEventPx = false;
    }

    public void resetEventText()
    {
        eventTextLength = 0;
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
        builder.append("\"MessageName\": \"EventsGroup\",\n");
        if (hasEventType())
        {
            indent(builder, level);
            builder.append("\"EventType\": \"");
            builder.append(eventType);
            builder.append("\",\n");
        }

        if (hasEventDate())
        {
            indent(builder, level);
            builder.append("\"EventDate\": \"");
            appendBuffer(builder, eventDate, eventDateOffset, eventDateLength);
            builder.append("\",\n");
        }

        if (hasEventPx())
        {
            indent(builder, level);
            builder.append("\"EventPx\": \"");
            eventPx.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasEventText())
        {
            indent(builder, level);
            builder.append("\"EventText\": \"");
            appendBuffer(builder, eventText, eventTextOffset, eventTextLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public EventsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((EventsGroupEncoder)encoder);
    }

    public EventsGroupEncoder copyTo(final EventsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasEventType())
        {
            encoder.eventType(this.eventType());
        }

        if (hasEventDate())
        {
            encoder.eventDateAsCopy(eventDate.byteArray(), 0, eventDateLength);
        }

        if (hasEventPx())
        {
            encoder.eventPx(this.eventPx());
        }

        if (hasEventText())
        {
            encoder.eventTextAsCopy(eventText.byteArray(), 0, eventTextLength);
        }
        return encoder;
    }

}
    private int noEventsGroupCounter;

    private boolean hasNoEventsGroupCounter;

    public boolean hasNoEventsGroupCounter()
    {
        return hasNoEventsGroupCounter;
    }

    public InstrumentEncoder noEventsGroupCounter(int value)
    {
        noEventsGroupCounter = value;
        hasNoEventsGroupCounter = true;
        return this;
    }

    public int noEventsGroupCounter()
    {
        return noEventsGroupCounter;
    }


    private EventsGroupEncoder eventsGroup = null;

    public EventsGroupEncoder eventsGroup(final int numberOfElements)
    {
        hasNoEventsGroupCounter = true;
        noEventsGroupCounter = numberOfElements;
        if (eventsGroup == null)
        {
            eventsGroup = new EventsGroupEncoder();
        }
        return eventsGroup;
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
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: Symbol");
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

        if (hasNoSecurityAltIDGroupCounter)
        {
            buffer.putBytes(position, noSecurityAltIDGroupCounterHeader, 0, noSecurityAltIDGroupCounterHeaderLength);
            position += noSecurityAltIDGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noSecurityAltIDGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (securityAltIDGroup != null)
        {
            position += securityAltIDGroup.encode(buffer, position, noSecurityAltIDGroupCounter);
        }


        if (hasProduct)
        {
            buffer.putBytes(position, productHeader, 0, productHeaderLength);
            position += productHeaderLength;
            position += buffer.putIntAscii(position, product);
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

        if (hasPutOrCall)
        {
            buffer.putBytes(position, putOrCallHeader, 0, putOrCallHeaderLength);
            position += putOrCallHeaderLength;
            position += buffer.putIntAscii(position, putOrCall);
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

        if (hasNoEventsGroupCounter)
        {
            buffer.putBytes(position, noEventsGroupCounterHeader, 0, noEventsGroupCounterHeaderLength);
            position += noEventsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noEventsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (eventsGroup != null)
        {
            position += eventsGroup.encode(buffer, position, noEventsGroupCounter);
        }


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
        return position - offset;
    }

    public void reset()
    {
        this.resetSymbol();
        this.resetSymbolSfx();
        this.resetSecurityID();
        this.resetSecurityIDSource();
        this.resetProduct();
        this.resetCFICode();
        this.resetSecurityType();
        this.resetSecuritySubType();
        this.resetMaturityMonthYear();
        this.resetMaturityDate();
        this.resetPutOrCall();
        this.resetCouponPaymentDate();
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
        this.resetOptAttribute();
        this.resetContractMultiplier();
        this.resetCouponRate();
        this.resetSecurityExchange();
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
        this.resetSecurityAltIDGroup();
        this.resetEventsGroup();
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

    public void resetPutOrCall()
    {
        hasPutOrCall = false;
    }

    public void resetCouponPaymentDate()
    {
        couponPaymentDateLength = 0;
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

    public void resetOptAttribute()
    {
        hasOptAttribute = false;
    }

    public void resetContractMultiplier()
    {
        hasContractMultiplier = false;
    }

    public void resetCouponRate()
    {
        hasCouponRate = false;
    }

    public void resetSecurityExchange()
    {
        securityExchangeLength = 0;
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

    public void resetSecurityAltIDGroup()
    {
        if (securityAltIDGroup != null)
        {
            securityAltIDGroup.reset();
        }
        noSecurityAltIDGroupCounter = 0;
        hasNoSecurityAltIDGroupCounter = false;
    }

    public void resetEventsGroup()
    {
        if (eventsGroup != null)
        {
            eventsGroup.reset();
        }
        noEventsGroupCounter = 0;
        hasNoEventsGroupCounter = false;
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

        if (hasNoSecurityAltIDGroupCounter)
        {
            indent(builder, level);
            builder.append("\"SecurityAltIDGroup\": [\n");
            final int noSecurityAltIDGroupCounter = this.noSecurityAltIDGroupCounter;
            SecurityAltIDGroupEncoder securityAltIDGroup = this.securityAltIDGroup;
            for (int i = 0; i < noSecurityAltIDGroupCounter; i++)
            {
                indent(builder, level);
                securityAltIDGroup.appendTo(builder, level + 1);
                if (i < (noSecurityAltIDGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                securityAltIDGroup = securityAltIDGroup.next();
            }
            indent(builder, level);
            builder.append("],\n");
        }

        if (hasProduct())
        {
            indent(builder, level);
            builder.append("\"Product\": \"");
            builder.append(product);
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

        if (hasPutOrCall())
        {
            indent(builder, level);
            builder.append("\"PutOrCall\": \"");
            builder.append(putOrCall);
            builder.append("\",\n");
        }

        if (hasCouponPaymentDate())
        {
            indent(builder, level);
            builder.append("\"CouponPaymentDate\": \"");
            appendBuffer(builder, couponPaymentDate, couponPaymentDateOffset, couponPaymentDateLength);
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

        if (hasNoEventsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"EventsGroup\": [\n");
            final int noEventsGroupCounter = this.noEventsGroupCounter;
            EventsGroupEncoder eventsGroup = this.eventsGroup;
            for (int i = 0; i < noEventsGroupCounter; i++)
            {
                indent(builder, level);
                eventsGroup.appendTo(builder, level + 1);
                if (i < (noEventsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                eventsGroup = eventsGroup.next();
            }
            indent(builder, level);
            builder.append("],\n");
        }

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

        if (hasNoSecurityAltIDGroupCounter)
        {
            final int size = this.noSecurityAltIDGroupCounter;
            SecurityAltIDGroupEncoder securityAltIDGroup = this.securityAltIDGroup;
            SecurityAltIDGroupEncoder securityAltIDGroupEncoder = encoder.securityAltIDGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (securityAltIDGroup != null)
                {
                    securityAltIDGroup.copyTo(securityAltIDGroupEncoder);
                    securityAltIDGroup = securityAltIDGroup.next();
                    securityAltIDGroupEncoder = securityAltIDGroupEncoder.next();
                }
            }
        }

        if (hasProduct())
        {
            encoder.product(this.product());
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

        if (hasPutOrCall())
        {
            encoder.putOrCall(this.putOrCall());
        }

        if (hasCouponPaymentDate())
        {
            encoder.couponPaymentDateAsCopy(couponPaymentDate.byteArray(), 0, couponPaymentDateLength);
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

        if (hasOptAttribute())
        {
            encoder.optAttribute(this.optAttribute());
        }

        if (hasContractMultiplier())
        {
            encoder.contractMultiplier(this.contractMultiplier());
        }

        if (hasCouponRate())
        {
            encoder.couponRate(this.couponRate());
        }

        if (hasSecurityExchange())
        {
            encoder.securityExchangeAsCopy(securityExchange.byteArray(), 0, securityExchangeLength);
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

        if (hasNoEventsGroupCounter)
        {
            final int size = this.noEventsGroupCounter;
            EventsGroupEncoder eventsGroup = this.eventsGroup;
            EventsGroupEncoder eventsGroupEncoder = encoder.eventsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (eventsGroup != null)
                {
                    eventsGroup.copyTo(eventsGroupEncoder);
                    eventsGroup = eventsGroup.next();
                    eventsGroupEncoder = eventsGroupEncoder.next();
                }
            }
        }

        if (hasDatedDate())
        {
            encoder.datedDateAsCopy(datedDate.byteArray(), 0, datedDateLength);
        }

        if (hasInterestAccrualDate())
        {
            encoder.interestAccrualDateAsCopy(interestAccrualDate.byteArray(), 0, interestAccrualDateLength);
        }
        return encoder;
    }

}
