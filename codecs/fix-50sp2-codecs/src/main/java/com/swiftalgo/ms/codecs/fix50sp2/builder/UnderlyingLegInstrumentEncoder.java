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


public class UnderlyingLegInstrumentEncoder
{
    private static final int underlyingLegSymbolHeaderLength = 5;
    private static final byte[] underlyingLegSymbolHeader = new byte[] {49, 51, 51, 48, (byte) '='};

    private static final int underlyingLegSymbolSfxHeaderLength = 5;
    private static final byte[] underlyingLegSymbolSfxHeader = new byte[] {49, 51, 51, 49, (byte) '='};

    private static final int underlyingLegSecurityIDHeaderLength = 5;
    private static final byte[] underlyingLegSecurityIDHeader = new byte[] {49, 51, 51, 50, (byte) '='};

    private static final int underlyingLegSecurityIDSourceHeaderLength = 5;
    private static final byte[] underlyingLegSecurityIDSourceHeader = new byte[] {49, 51, 51, 51, (byte) '='};

    private static final int underlyingLegCFICodeHeaderLength = 5;
    private static final byte[] underlyingLegCFICodeHeader = new byte[] {49, 51, 52, 52, (byte) '='};

    private static final int underlyingLegSecurityTypeHeaderLength = 5;
    private static final byte[] underlyingLegSecurityTypeHeader = new byte[] {49, 51, 51, 55, (byte) '='};

    private static final int underlyingLegSecuritySubTypeHeaderLength = 5;
    private static final byte[] underlyingLegSecuritySubTypeHeader = new byte[] {49, 51, 51, 56, (byte) '='};

    private static final int underlyingLegMaturityMonthYearHeaderLength = 5;
    private static final byte[] underlyingLegMaturityMonthYearHeader = new byte[] {49, 51, 51, 57, (byte) '='};

    private static final int underlyingLegMaturityDateHeaderLength = 5;
    private static final byte[] underlyingLegMaturityDateHeader = new byte[] {49, 51, 52, 53, (byte) '='};

    private static final int underlyingLegMaturityTimeHeaderLength = 5;
    private static final byte[] underlyingLegMaturityTimeHeader = new byte[] {49, 52, 48, 53, (byte) '='};

    private static final int underlyingLegStrikePriceHeaderLength = 5;
    private static final byte[] underlyingLegStrikePriceHeader = new byte[] {49, 51, 52, 48, (byte) '='};

    private static final int underlyingLegOptAttributeHeaderLength = 5;
    private static final byte[] underlyingLegOptAttributeHeader = new byte[] {49, 51, 57, 49, (byte) '='};

    private static final int underlyingLegPutOrCallHeaderLength = 5;
    private static final byte[] underlyingLegPutOrCallHeader = new byte[] {49, 51, 52, 51, (byte) '='};

    private static final int underlyingLegSecurityExchangeHeaderLength = 5;
    private static final byte[] underlyingLegSecurityExchangeHeader = new byte[] {49, 51, 52, 49, (byte) '='};

    private static final int underlyingLegSecurityDescHeaderLength = 5;
    private static final byte[] underlyingLegSecurityDescHeader = new byte[] {49, 51, 57, 50, (byte) '='};

    private final MutableDirectBuffer underlyingLegSymbol = new UnsafeBuffer();

    private int underlyingLegSymbolOffset = 0;

    private int underlyingLegSymbolLength = 0;

    public UnderlyingLegInstrumentEncoder underlyingLegSymbol(final DirectBuffer value, final int offset, final int length)
    {
        underlyingLegSymbol.wrap(value);
        underlyingLegSymbolOffset = offset;
        underlyingLegSymbolLength = length;
        return this;
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSymbol(final DirectBuffer value, final int length)
    {
        return underlyingLegSymbol(value, 0, length);
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSymbol(final DirectBuffer value)
    {
        return underlyingLegSymbol(value, 0, value.capacity());
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSymbol(final byte[] value, final int offset, final int length)
    {
        underlyingLegSymbol.wrap(value);
        underlyingLegSymbolOffset = offset;
        underlyingLegSymbolLength = length;
        return this;
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSymbolAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(underlyingLegSymbol, value, offset, length);
        underlyingLegSymbolOffset = offset;
        underlyingLegSymbolLength = length;
        return this;
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSymbol(final byte[] value, final int length)
    {
        return underlyingLegSymbol(value, 0, length);
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSymbol(final byte[] value)
    {
        return underlyingLegSymbol(value, 0, value.length);
    }

    public boolean hasUnderlyingLegSymbol()
    {
        return underlyingLegSymbolLength > 0;
    }

    public MutableDirectBuffer underlyingLegSymbol()
    {
        return underlyingLegSymbol;
    }

    public String underlyingLegSymbolAsString()
    {
        return underlyingLegSymbol.getStringWithoutLengthAscii(underlyingLegSymbolOffset, underlyingLegSymbolLength);
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSymbol(final CharSequence value)
    {
        toBytes(value, underlyingLegSymbol);
        underlyingLegSymbolOffset = 0;
        underlyingLegSymbolLength = value.length();
        return this;
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSymbol(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            underlyingLegSymbol.wrap(buffer);
            underlyingLegSymbolOffset = value.offset();
            underlyingLegSymbolLength = value.length();
        }
        return this;
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSymbol(final char[] value)
    {
        return underlyingLegSymbol(value, 0, value.length);
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSymbol(final char[] value, final int length)
    {
        return underlyingLegSymbol(value, 0, length);
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSymbol(final char[] value, final int offset, final int length)
    {
        toBytes(value, underlyingLegSymbol, offset, length);
        underlyingLegSymbolOffset = 0;
        underlyingLegSymbolLength = length;
        return this;
    }

    private final MutableDirectBuffer underlyingLegSymbolSfx = new UnsafeBuffer();

    private int underlyingLegSymbolSfxOffset = 0;

    private int underlyingLegSymbolSfxLength = 0;

    public UnderlyingLegInstrumentEncoder underlyingLegSymbolSfx(final DirectBuffer value, final int offset, final int length)
    {
        underlyingLegSymbolSfx.wrap(value);
        underlyingLegSymbolSfxOffset = offset;
        underlyingLegSymbolSfxLength = length;
        return this;
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSymbolSfx(final DirectBuffer value, final int length)
    {
        return underlyingLegSymbolSfx(value, 0, length);
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSymbolSfx(final DirectBuffer value)
    {
        return underlyingLegSymbolSfx(value, 0, value.capacity());
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSymbolSfx(final byte[] value, final int offset, final int length)
    {
        underlyingLegSymbolSfx.wrap(value);
        underlyingLegSymbolSfxOffset = offset;
        underlyingLegSymbolSfxLength = length;
        return this;
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSymbolSfxAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(underlyingLegSymbolSfx, value, offset, length);
        underlyingLegSymbolSfxOffset = offset;
        underlyingLegSymbolSfxLength = length;
        return this;
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSymbolSfx(final byte[] value, final int length)
    {
        return underlyingLegSymbolSfx(value, 0, length);
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSymbolSfx(final byte[] value)
    {
        return underlyingLegSymbolSfx(value, 0, value.length);
    }

    public boolean hasUnderlyingLegSymbolSfx()
    {
        return underlyingLegSymbolSfxLength > 0;
    }

    public MutableDirectBuffer underlyingLegSymbolSfx()
    {
        return underlyingLegSymbolSfx;
    }

    public String underlyingLegSymbolSfxAsString()
    {
        return underlyingLegSymbolSfx.getStringWithoutLengthAscii(underlyingLegSymbolSfxOffset, underlyingLegSymbolSfxLength);
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSymbolSfx(final CharSequence value)
    {
        toBytes(value, underlyingLegSymbolSfx);
        underlyingLegSymbolSfxOffset = 0;
        underlyingLegSymbolSfxLength = value.length();
        return this;
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSymbolSfx(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            underlyingLegSymbolSfx.wrap(buffer);
            underlyingLegSymbolSfxOffset = value.offset();
            underlyingLegSymbolSfxLength = value.length();
        }
        return this;
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSymbolSfx(final char[] value)
    {
        return underlyingLegSymbolSfx(value, 0, value.length);
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSymbolSfx(final char[] value, final int length)
    {
        return underlyingLegSymbolSfx(value, 0, length);
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSymbolSfx(final char[] value, final int offset, final int length)
    {
        toBytes(value, underlyingLegSymbolSfx, offset, length);
        underlyingLegSymbolSfxOffset = 0;
        underlyingLegSymbolSfxLength = length;
        return this;
    }

    private final MutableDirectBuffer underlyingLegSecurityID = new UnsafeBuffer();

    private int underlyingLegSecurityIDOffset = 0;

    private int underlyingLegSecurityIDLength = 0;

    public UnderlyingLegInstrumentEncoder underlyingLegSecurityID(final DirectBuffer value, final int offset, final int length)
    {
        underlyingLegSecurityID.wrap(value);
        underlyingLegSecurityIDOffset = offset;
        underlyingLegSecurityIDLength = length;
        return this;
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSecurityID(final DirectBuffer value, final int length)
    {
        return underlyingLegSecurityID(value, 0, length);
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSecurityID(final DirectBuffer value)
    {
        return underlyingLegSecurityID(value, 0, value.capacity());
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSecurityID(final byte[] value, final int offset, final int length)
    {
        underlyingLegSecurityID.wrap(value);
        underlyingLegSecurityIDOffset = offset;
        underlyingLegSecurityIDLength = length;
        return this;
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSecurityIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(underlyingLegSecurityID, value, offset, length);
        underlyingLegSecurityIDOffset = offset;
        underlyingLegSecurityIDLength = length;
        return this;
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSecurityID(final byte[] value, final int length)
    {
        return underlyingLegSecurityID(value, 0, length);
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSecurityID(final byte[] value)
    {
        return underlyingLegSecurityID(value, 0, value.length);
    }

    public boolean hasUnderlyingLegSecurityID()
    {
        return underlyingLegSecurityIDLength > 0;
    }

    public MutableDirectBuffer underlyingLegSecurityID()
    {
        return underlyingLegSecurityID;
    }

    public String underlyingLegSecurityIDAsString()
    {
        return underlyingLegSecurityID.getStringWithoutLengthAscii(underlyingLegSecurityIDOffset, underlyingLegSecurityIDLength);
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSecurityID(final CharSequence value)
    {
        toBytes(value, underlyingLegSecurityID);
        underlyingLegSecurityIDOffset = 0;
        underlyingLegSecurityIDLength = value.length();
        return this;
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSecurityID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            underlyingLegSecurityID.wrap(buffer);
            underlyingLegSecurityIDOffset = value.offset();
            underlyingLegSecurityIDLength = value.length();
        }
        return this;
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSecurityID(final char[] value)
    {
        return underlyingLegSecurityID(value, 0, value.length);
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSecurityID(final char[] value, final int length)
    {
        return underlyingLegSecurityID(value, 0, length);
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSecurityID(final char[] value, final int offset, final int length)
    {
        toBytes(value, underlyingLegSecurityID, offset, length);
        underlyingLegSecurityIDOffset = 0;
        underlyingLegSecurityIDLength = length;
        return this;
    }

    private final MutableDirectBuffer underlyingLegSecurityIDSource = new UnsafeBuffer();

    private int underlyingLegSecurityIDSourceOffset = 0;

    private int underlyingLegSecurityIDSourceLength = 0;

    public UnderlyingLegInstrumentEncoder underlyingLegSecurityIDSource(final DirectBuffer value, final int offset, final int length)
    {
        underlyingLegSecurityIDSource.wrap(value);
        underlyingLegSecurityIDSourceOffset = offset;
        underlyingLegSecurityIDSourceLength = length;
        return this;
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSecurityIDSource(final DirectBuffer value, final int length)
    {
        return underlyingLegSecurityIDSource(value, 0, length);
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSecurityIDSource(final DirectBuffer value)
    {
        return underlyingLegSecurityIDSource(value, 0, value.capacity());
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSecurityIDSource(final byte[] value, final int offset, final int length)
    {
        underlyingLegSecurityIDSource.wrap(value);
        underlyingLegSecurityIDSourceOffset = offset;
        underlyingLegSecurityIDSourceLength = length;
        return this;
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSecurityIDSourceAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(underlyingLegSecurityIDSource, value, offset, length);
        underlyingLegSecurityIDSourceOffset = offset;
        underlyingLegSecurityIDSourceLength = length;
        return this;
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSecurityIDSource(final byte[] value, final int length)
    {
        return underlyingLegSecurityIDSource(value, 0, length);
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSecurityIDSource(final byte[] value)
    {
        return underlyingLegSecurityIDSource(value, 0, value.length);
    }

    public boolean hasUnderlyingLegSecurityIDSource()
    {
        return underlyingLegSecurityIDSourceLength > 0;
    }

    public MutableDirectBuffer underlyingLegSecurityIDSource()
    {
        return underlyingLegSecurityIDSource;
    }

    public String underlyingLegSecurityIDSourceAsString()
    {
        return underlyingLegSecurityIDSource.getStringWithoutLengthAscii(underlyingLegSecurityIDSourceOffset, underlyingLegSecurityIDSourceLength);
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSecurityIDSource(final CharSequence value)
    {
        toBytes(value, underlyingLegSecurityIDSource);
        underlyingLegSecurityIDSourceOffset = 0;
        underlyingLegSecurityIDSourceLength = value.length();
        return this;
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSecurityIDSource(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            underlyingLegSecurityIDSource.wrap(buffer);
            underlyingLegSecurityIDSourceOffset = value.offset();
            underlyingLegSecurityIDSourceLength = value.length();
        }
        return this;
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSecurityIDSource(final char[] value)
    {
        return underlyingLegSecurityIDSource(value, 0, value.length);
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSecurityIDSource(final char[] value, final int length)
    {
        return underlyingLegSecurityIDSource(value, 0, length);
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSecurityIDSource(final char[] value, final int offset, final int length)
    {
        toBytes(value, underlyingLegSecurityIDSource, offset, length);
        underlyingLegSecurityIDSourceOffset = 0;
        underlyingLegSecurityIDSourceLength = length;
        return this;
    }

    private final UnderlyingLegSecurityAltIDGrpEncoder underlyingLegSecurityAltIDGrp = new UnderlyingLegSecurityAltIDGrpEncoder();
    public UnderlyingLegSecurityAltIDGrpEncoder underlyingLegSecurityAltIDGrp()
    {
        return underlyingLegSecurityAltIDGrp;
    }

    private final MutableDirectBuffer underlyingLegCFICode = new UnsafeBuffer();

    private int underlyingLegCFICodeOffset = 0;

    private int underlyingLegCFICodeLength = 0;

    public UnderlyingLegInstrumentEncoder underlyingLegCFICode(final DirectBuffer value, final int offset, final int length)
    {
        underlyingLegCFICode.wrap(value);
        underlyingLegCFICodeOffset = offset;
        underlyingLegCFICodeLength = length;
        return this;
    }

    public UnderlyingLegInstrumentEncoder underlyingLegCFICode(final DirectBuffer value, final int length)
    {
        return underlyingLegCFICode(value, 0, length);
    }

    public UnderlyingLegInstrumentEncoder underlyingLegCFICode(final DirectBuffer value)
    {
        return underlyingLegCFICode(value, 0, value.capacity());
    }

    public UnderlyingLegInstrumentEncoder underlyingLegCFICode(final byte[] value, final int offset, final int length)
    {
        underlyingLegCFICode.wrap(value);
        underlyingLegCFICodeOffset = offset;
        underlyingLegCFICodeLength = length;
        return this;
    }

    public UnderlyingLegInstrumentEncoder underlyingLegCFICodeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(underlyingLegCFICode, value, offset, length);
        underlyingLegCFICodeOffset = offset;
        underlyingLegCFICodeLength = length;
        return this;
    }

    public UnderlyingLegInstrumentEncoder underlyingLegCFICode(final byte[] value, final int length)
    {
        return underlyingLegCFICode(value, 0, length);
    }

    public UnderlyingLegInstrumentEncoder underlyingLegCFICode(final byte[] value)
    {
        return underlyingLegCFICode(value, 0, value.length);
    }

    public boolean hasUnderlyingLegCFICode()
    {
        return underlyingLegCFICodeLength > 0;
    }

    public MutableDirectBuffer underlyingLegCFICode()
    {
        return underlyingLegCFICode;
    }

    public String underlyingLegCFICodeAsString()
    {
        return underlyingLegCFICode.getStringWithoutLengthAscii(underlyingLegCFICodeOffset, underlyingLegCFICodeLength);
    }

    public UnderlyingLegInstrumentEncoder underlyingLegCFICode(final CharSequence value)
    {
        toBytes(value, underlyingLegCFICode);
        underlyingLegCFICodeOffset = 0;
        underlyingLegCFICodeLength = value.length();
        return this;
    }

    public UnderlyingLegInstrumentEncoder underlyingLegCFICode(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            underlyingLegCFICode.wrap(buffer);
            underlyingLegCFICodeOffset = value.offset();
            underlyingLegCFICodeLength = value.length();
        }
        return this;
    }

    public UnderlyingLegInstrumentEncoder underlyingLegCFICode(final char[] value)
    {
        return underlyingLegCFICode(value, 0, value.length);
    }

    public UnderlyingLegInstrumentEncoder underlyingLegCFICode(final char[] value, final int length)
    {
        return underlyingLegCFICode(value, 0, length);
    }

    public UnderlyingLegInstrumentEncoder underlyingLegCFICode(final char[] value, final int offset, final int length)
    {
        toBytes(value, underlyingLegCFICode, offset, length);
        underlyingLegCFICodeOffset = 0;
        underlyingLegCFICodeLength = length;
        return this;
    }

    private final MutableDirectBuffer underlyingLegSecurityType = new UnsafeBuffer();

    private int underlyingLegSecurityTypeOffset = 0;

    private int underlyingLegSecurityTypeLength = 0;

    public UnderlyingLegInstrumentEncoder underlyingLegSecurityType(final DirectBuffer value, final int offset, final int length)
    {
        underlyingLegSecurityType.wrap(value);
        underlyingLegSecurityTypeOffset = offset;
        underlyingLegSecurityTypeLength = length;
        return this;
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSecurityType(final DirectBuffer value, final int length)
    {
        return underlyingLegSecurityType(value, 0, length);
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSecurityType(final DirectBuffer value)
    {
        return underlyingLegSecurityType(value, 0, value.capacity());
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSecurityType(final byte[] value, final int offset, final int length)
    {
        underlyingLegSecurityType.wrap(value);
        underlyingLegSecurityTypeOffset = offset;
        underlyingLegSecurityTypeLength = length;
        return this;
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSecurityTypeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(underlyingLegSecurityType, value, offset, length);
        underlyingLegSecurityTypeOffset = offset;
        underlyingLegSecurityTypeLength = length;
        return this;
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSecurityType(final byte[] value, final int length)
    {
        return underlyingLegSecurityType(value, 0, length);
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSecurityType(final byte[] value)
    {
        return underlyingLegSecurityType(value, 0, value.length);
    }

    public boolean hasUnderlyingLegSecurityType()
    {
        return underlyingLegSecurityTypeLength > 0;
    }

    public MutableDirectBuffer underlyingLegSecurityType()
    {
        return underlyingLegSecurityType;
    }

    public String underlyingLegSecurityTypeAsString()
    {
        return underlyingLegSecurityType.getStringWithoutLengthAscii(underlyingLegSecurityTypeOffset, underlyingLegSecurityTypeLength);
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSecurityType(final CharSequence value)
    {
        toBytes(value, underlyingLegSecurityType);
        underlyingLegSecurityTypeOffset = 0;
        underlyingLegSecurityTypeLength = value.length();
        return this;
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSecurityType(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            underlyingLegSecurityType.wrap(buffer);
            underlyingLegSecurityTypeOffset = value.offset();
            underlyingLegSecurityTypeLength = value.length();
        }
        return this;
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSecurityType(final char[] value)
    {
        return underlyingLegSecurityType(value, 0, value.length);
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSecurityType(final char[] value, final int length)
    {
        return underlyingLegSecurityType(value, 0, length);
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSecurityType(final char[] value, final int offset, final int length)
    {
        toBytes(value, underlyingLegSecurityType, offset, length);
        underlyingLegSecurityTypeOffset = 0;
        underlyingLegSecurityTypeLength = length;
        return this;
    }

    private final MutableDirectBuffer underlyingLegSecuritySubType = new UnsafeBuffer();

    private int underlyingLegSecuritySubTypeOffset = 0;

    private int underlyingLegSecuritySubTypeLength = 0;

    public UnderlyingLegInstrumentEncoder underlyingLegSecuritySubType(final DirectBuffer value, final int offset, final int length)
    {
        underlyingLegSecuritySubType.wrap(value);
        underlyingLegSecuritySubTypeOffset = offset;
        underlyingLegSecuritySubTypeLength = length;
        return this;
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSecuritySubType(final DirectBuffer value, final int length)
    {
        return underlyingLegSecuritySubType(value, 0, length);
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSecuritySubType(final DirectBuffer value)
    {
        return underlyingLegSecuritySubType(value, 0, value.capacity());
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSecuritySubType(final byte[] value, final int offset, final int length)
    {
        underlyingLegSecuritySubType.wrap(value);
        underlyingLegSecuritySubTypeOffset = offset;
        underlyingLegSecuritySubTypeLength = length;
        return this;
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSecuritySubTypeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(underlyingLegSecuritySubType, value, offset, length);
        underlyingLegSecuritySubTypeOffset = offset;
        underlyingLegSecuritySubTypeLength = length;
        return this;
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSecuritySubType(final byte[] value, final int length)
    {
        return underlyingLegSecuritySubType(value, 0, length);
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSecuritySubType(final byte[] value)
    {
        return underlyingLegSecuritySubType(value, 0, value.length);
    }

    public boolean hasUnderlyingLegSecuritySubType()
    {
        return underlyingLegSecuritySubTypeLength > 0;
    }

    public MutableDirectBuffer underlyingLegSecuritySubType()
    {
        return underlyingLegSecuritySubType;
    }

    public String underlyingLegSecuritySubTypeAsString()
    {
        return underlyingLegSecuritySubType.getStringWithoutLengthAscii(underlyingLegSecuritySubTypeOffset, underlyingLegSecuritySubTypeLength);
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSecuritySubType(final CharSequence value)
    {
        toBytes(value, underlyingLegSecuritySubType);
        underlyingLegSecuritySubTypeOffset = 0;
        underlyingLegSecuritySubTypeLength = value.length();
        return this;
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSecuritySubType(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            underlyingLegSecuritySubType.wrap(buffer);
            underlyingLegSecuritySubTypeOffset = value.offset();
            underlyingLegSecuritySubTypeLength = value.length();
        }
        return this;
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSecuritySubType(final char[] value)
    {
        return underlyingLegSecuritySubType(value, 0, value.length);
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSecuritySubType(final char[] value, final int length)
    {
        return underlyingLegSecuritySubType(value, 0, length);
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSecuritySubType(final char[] value, final int offset, final int length)
    {
        toBytes(value, underlyingLegSecuritySubType, offset, length);
        underlyingLegSecuritySubTypeOffset = 0;
        underlyingLegSecuritySubTypeLength = length;
        return this;
    }

    private final MutableDirectBuffer underlyingLegMaturityMonthYear = new UnsafeBuffer();

    private int underlyingLegMaturityMonthYearOffset = 0;

    private int underlyingLegMaturityMonthYearLength = 0;

    public UnderlyingLegInstrumentEncoder underlyingLegMaturityMonthYear(final DirectBuffer value, final int offset, final int length)
    {
        underlyingLegMaturityMonthYear.wrap(value);
        underlyingLegMaturityMonthYearOffset = offset;
        underlyingLegMaturityMonthYearLength = length;
        return this;
    }

    public UnderlyingLegInstrumentEncoder underlyingLegMaturityMonthYear(final DirectBuffer value, final int length)
    {
        return underlyingLegMaturityMonthYear(value, 0, length);
    }

    public UnderlyingLegInstrumentEncoder underlyingLegMaturityMonthYear(final DirectBuffer value)
    {
        return underlyingLegMaturityMonthYear(value, 0, value.capacity());
    }

    public UnderlyingLegInstrumentEncoder underlyingLegMaturityMonthYear(final byte[] value, final int offset, final int length)
    {
        underlyingLegMaturityMonthYear.wrap(value);
        underlyingLegMaturityMonthYearOffset = offset;
        underlyingLegMaturityMonthYearLength = length;
        return this;
    }

    public UnderlyingLegInstrumentEncoder underlyingLegMaturityMonthYearAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(underlyingLegMaturityMonthYear, value, offset, length);
        underlyingLegMaturityMonthYearOffset = offset;
        underlyingLegMaturityMonthYearLength = length;
        return this;
    }

    public UnderlyingLegInstrumentEncoder underlyingLegMaturityMonthYear(final byte[] value, final int length)
    {
        return underlyingLegMaturityMonthYear(value, 0, length);
    }

    public UnderlyingLegInstrumentEncoder underlyingLegMaturityMonthYear(final byte[] value)
    {
        return underlyingLegMaturityMonthYear(value, 0, value.length);
    }

    public boolean hasUnderlyingLegMaturityMonthYear()
    {
        return underlyingLegMaturityMonthYearLength > 0;
    }

    public MutableDirectBuffer underlyingLegMaturityMonthYear()
    {
        return underlyingLegMaturityMonthYear;
    }

    public String underlyingLegMaturityMonthYearAsString()
    {
        return underlyingLegMaturityMonthYear.getStringWithoutLengthAscii(underlyingLegMaturityMonthYearOffset, underlyingLegMaturityMonthYearLength);
    }

    private final MutableDirectBuffer underlyingLegMaturityDate = new UnsafeBuffer();

    private int underlyingLegMaturityDateOffset = 0;

    private int underlyingLegMaturityDateLength = 0;

    public UnderlyingLegInstrumentEncoder underlyingLegMaturityDate(final DirectBuffer value, final int offset, final int length)
    {
        underlyingLegMaturityDate.wrap(value);
        underlyingLegMaturityDateOffset = offset;
        underlyingLegMaturityDateLength = length;
        return this;
    }

    public UnderlyingLegInstrumentEncoder underlyingLegMaturityDate(final DirectBuffer value, final int length)
    {
        return underlyingLegMaturityDate(value, 0, length);
    }

    public UnderlyingLegInstrumentEncoder underlyingLegMaturityDate(final DirectBuffer value)
    {
        return underlyingLegMaturityDate(value, 0, value.capacity());
    }

    public UnderlyingLegInstrumentEncoder underlyingLegMaturityDate(final byte[] value, final int offset, final int length)
    {
        underlyingLegMaturityDate.wrap(value);
        underlyingLegMaturityDateOffset = offset;
        underlyingLegMaturityDateLength = length;
        return this;
    }

    public UnderlyingLegInstrumentEncoder underlyingLegMaturityDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(underlyingLegMaturityDate, value, offset, length);
        underlyingLegMaturityDateOffset = offset;
        underlyingLegMaturityDateLength = length;
        return this;
    }

    public UnderlyingLegInstrumentEncoder underlyingLegMaturityDate(final byte[] value, final int length)
    {
        return underlyingLegMaturityDate(value, 0, length);
    }

    public UnderlyingLegInstrumentEncoder underlyingLegMaturityDate(final byte[] value)
    {
        return underlyingLegMaturityDate(value, 0, value.length);
    }

    public boolean hasUnderlyingLegMaturityDate()
    {
        return underlyingLegMaturityDateLength > 0;
    }

    public MutableDirectBuffer underlyingLegMaturityDate()
    {
        return underlyingLegMaturityDate;
    }

    public String underlyingLegMaturityDateAsString()
    {
        return underlyingLegMaturityDate.getStringWithoutLengthAscii(underlyingLegMaturityDateOffset, underlyingLegMaturityDateLength);
    }

    private final MutableDirectBuffer underlyingLegMaturityTime = new UnsafeBuffer();

    private int underlyingLegMaturityTimeOffset = 0;

    private int underlyingLegMaturityTimeLength = 0;

    public UnderlyingLegInstrumentEncoder underlyingLegMaturityTime(final DirectBuffer value, final int offset, final int length)
    {
        underlyingLegMaturityTime.wrap(value);
        underlyingLegMaturityTimeOffset = offset;
        underlyingLegMaturityTimeLength = length;
        return this;
    }

    public UnderlyingLegInstrumentEncoder underlyingLegMaturityTime(final DirectBuffer value, final int length)
    {
        return underlyingLegMaturityTime(value, 0, length);
    }

    public UnderlyingLegInstrumentEncoder underlyingLegMaturityTime(final DirectBuffer value)
    {
        return underlyingLegMaturityTime(value, 0, value.capacity());
    }

    public UnderlyingLegInstrumentEncoder underlyingLegMaturityTime(final byte[] value, final int offset, final int length)
    {
        underlyingLegMaturityTime.wrap(value);
        underlyingLegMaturityTimeOffset = offset;
        underlyingLegMaturityTimeLength = length;
        return this;
    }

    public UnderlyingLegInstrumentEncoder underlyingLegMaturityTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(underlyingLegMaturityTime, value, offset, length);
        underlyingLegMaturityTimeOffset = offset;
        underlyingLegMaturityTimeLength = length;
        return this;
    }

    public UnderlyingLegInstrumentEncoder underlyingLegMaturityTime(final byte[] value, final int length)
    {
        return underlyingLegMaturityTime(value, 0, length);
    }

    public UnderlyingLegInstrumentEncoder underlyingLegMaturityTime(final byte[] value)
    {
        return underlyingLegMaturityTime(value, 0, value.length);
    }

    public boolean hasUnderlyingLegMaturityTime()
    {
        return underlyingLegMaturityTimeLength > 0;
    }

    public MutableDirectBuffer underlyingLegMaturityTime()
    {
        return underlyingLegMaturityTime;
    }

    public String underlyingLegMaturityTimeAsString()
    {
        return underlyingLegMaturityTime.getStringWithoutLengthAscii(underlyingLegMaturityTimeOffset, underlyingLegMaturityTimeLength);
    }

    private final DecimalFloat underlyingLegStrikePrice = new DecimalFloat();

    private boolean hasUnderlyingLegStrikePrice;

    public boolean hasUnderlyingLegStrikePrice()
    {
        return hasUnderlyingLegStrikePrice;
    }

    public UnderlyingLegInstrumentEncoder underlyingLegStrikePrice(DecimalFloat value)
    {
        underlyingLegStrikePrice.set(value);
        hasUnderlyingLegStrikePrice = true;
        return this;
    }

    public UnderlyingLegInstrumentEncoder underlyingLegStrikePrice(long value, int scale)
    {
        underlyingLegStrikePrice.set(value, scale);
        hasUnderlyingLegStrikePrice = true;
        return this;
    }

    public DecimalFloat underlyingLegStrikePrice()
    {
        return underlyingLegStrikePrice;
    }

    private char underlyingLegOptAttribute;

    private boolean hasUnderlyingLegOptAttribute;

    public boolean hasUnderlyingLegOptAttribute()
    {
        return hasUnderlyingLegOptAttribute;
    }

    public UnderlyingLegInstrumentEncoder underlyingLegOptAttribute(char value)
    {
        underlyingLegOptAttribute = value;
        hasUnderlyingLegOptAttribute = true;
        return this;
    }

    public char underlyingLegOptAttribute()
    {
        return underlyingLegOptAttribute;
    }

    private int underlyingLegPutOrCall;

    private boolean hasUnderlyingLegPutOrCall;

    public boolean hasUnderlyingLegPutOrCall()
    {
        return hasUnderlyingLegPutOrCall;
    }

    public UnderlyingLegInstrumentEncoder underlyingLegPutOrCall(int value)
    {
        underlyingLegPutOrCall = value;
        hasUnderlyingLegPutOrCall = true;
        return this;
    }

    public int underlyingLegPutOrCall()
    {
        return underlyingLegPutOrCall;
    }

    private final MutableDirectBuffer underlyingLegSecurityExchange = new UnsafeBuffer();

    private int underlyingLegSecurityExchangeOffset = 0;

    private int underlyingLegSecurityExchangeLength = 0;

    public UnderlyingLegInstrumentEncoder underlyingLegSecurityExchange(final DirectBuffer value, final int offset, final int length)
    {
        underlyingLegSecurityExchange.wrap(value);
        underlyingLegSecurityExchangeOffset = offset;
        underlyingLegSecurityExchangeLength = length;
        return this;
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSecurityExchange(final DirectBuffer value, final int length)
    {
        return underlyingLegSecurityExchange(value, 0, length);
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSecurityExchange(final DirectBuffer value)
    {
        return underlyingLegSecurityExchange(value, 0, value.capacity());
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSecurityExchange(final byte[] value, final int offset, final int length)
    {
        underlyingLegSecurityExchange.wrap(value);
        underlyingLegSecurityExchangeOffset = offset;
        underlyingLegSecurityExchangeLength = length;
        return this;
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSecurityExchangeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(underlyingLegSecurityExchange, value, offset, length);
        underlyingLegSecurityExchangeOffset = offset;
        underlyingLegSecurityExchangeLength = length;
        return this;
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSecurityExchange(final byte[] value, final int length)
    {
        return underlyingLegSecurityExchange(value, 0, length);
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSecurityExchange(final byte[] value)
    {
        return underlyingLegSecurityExchange(value, 0, value.length);
    }

    public boolean hasUnderlyingLegSecurityExchange()
    {
        return underlyingLegSecurityExchangeLength > 0;
    }

    public MutableDirectBuffer underlyingLegSecurityExchange()
    {
        return underlyingLegSecurityExchange;
    }

    public String underlyingLegSecurityExchangeAsString()
    {
        return underlyingLegSecurityExchange.getStringWithoutLengthAscii(underlyingLegSecurityExchangeOffset, underlyingLegSecurityExchangeLength);
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSecurityExchange(final CharSequence value)
    {
        toBytes(value, underlyingLegSecurityExchange);
        underlyingLegSecurityExchangeOffset = 0;
        underlyingLegSecurityExchangeLength = value.length();
        return this;
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSecurityExchange(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            underlyingLegSecurityExchange.wrap(buffer);
            underlyingLegSecurityExchangeOffset = value.offset();
            underlyingLegSecurityExchangeLength = value.length();
        }
        return this;
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSecurityExchange(final char[] value)
    {
        return underlyingLegSecurityExchange(value, 0, value.length);
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSecurityExchange(final char[] value, final int length)
    {
        return underlyingLegSecurityExchange(value, 0, length);
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSecurityExchange(final char[] value, final int offset, final int length)
    {
        toBytes(value, underlyingLegSecurityExchange, offset, length);
        underlyingLegSecurityExchangeOffset = 0;
        underlyingLegSecurityExchangeLength = length;
        return this;
    }

    private final MutableDirectBuffer underlyingLegSecurityDesc = new UnsafeBuffer();

    private int underlyingLegSecurityDescOffset = 0;

    private int underlyingLegSecurityDescLength = 0;

    public UnderlyingLegInstrumentEncoder underlyingLegSecurityDesc(final DirectBuffer value, final int offset, final int length)
    {
        underlyingLegSecurityDesc.wrap(value);
        underlyingLegSecurityDescOffset = offset;
        underlyingLegSecurityDescLength = length;
        return this;
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSecurityDesc(final DirectBuffer value, final int length)
    {
        return underlyingLegSecurityDesc(value, 0, length);
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSecurityDesc(final DirectBuffer value)
    {
        return underlyingLegSecurityDesc(value, 0, value.capacity());
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSecurityDesc(final byte[] value, final int offset, final int length)
    {
        underlyingLegSecurityDesc.wrap(value);
        underlyingLegSecurityDescOffset = offset;
        underlyingLegSecurityDescLength = length;
        return this;
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSecurityDescAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(underlyingLegSecurityDesc, value, offset, length);
        underlyingLegSecurityDescOffset = offset;
        underlyingLegSecurityDescLength = length;
        return this;
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSecurityDesc(final byte[] value, final int length)
    {
        return underlyingLegSecurityDesc(value, 0, length);
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSecurityDesc(final byte[] value)
    {
        return underlyingLegSecurityDesc(value, 0, value.length);
    }

    public boolean hasUnderlyingLegSecurityDesc()
    {
        return underlyingLegSecurityDescLength > 0;
    }

    public MutableDirectBuffer underlyingLegSecurityDesc()
    {
        return underlyingLegSecurityDesc;
    }

    public String underlyingLegSecurityDescAsString()
    {
        return underlyingLegSecurityDesc.getStringWithoutLengthAscii(underlyingLegSecurityDescOffset, underlyingLegSecurityDescLength);
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSecurityDesc(final CharSequence value)
    {
        toBytes(value, underlyingLegSecurityDesc);
        underlyingLegSecurityDescOffset = 0;
        underlyingLegSecurityDescLength = value.length();
        return this;
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSecurityDesc(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            underlyingLegSecurityDesc.wrap(buffer);
            underlyingLegSecurityDescOffset = value.offset();
            underlyingLegSecurityDescLength = value.length();
        }
        return this;
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSecurityDesc(final char[] value)
    {
        return underlyingLegSecurityDesc(value, 0, value.length);
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSecurityDesc(final char[] value, final int length)
    {
        return underlyingLegSecurityDesc(value, 0, length);
    }

    public UnderlyingLegInstrumentEncoder underlyingLegSecurityDesc(final char[] value, final int offset, final int length)
    {
        toBytes(value, underlyingLegSecurityDesc, offset, length);
        underlyingLegSecurityDescOffset = 0;
        underlyingLegSecurityDescLength = length;
        return this;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (underlyingLegSymbolLength > 0)
        {
            buffer.putBytes(position, underlyingLegSymbolHeader, 0, underlyingLegSymbolHeaderLength);
            position += underlyingLegSymbolHeaderLength;
            buffer.putBytes(position, underlyingLegSymbol, underlyingLegSymbolOffset, underlyingLegSymbolLength);
            position += underlyingLegSymbolLength;
            buffer.putSeparator(position);
            position++;
        }

        if (underlyingLegSymbolSfxLength > 0)
        {
            buffer.putBytes(position, underlyingLegSymbolSfxHeader, 0, underlyingLegSymbolSfxHeaderLength);
            position += underlyingLegSymbolSfxHeaderLength;
            buffer.putBytes(position, underlyingLegSymbolSfx, underlyingLegSymbolSfxOffset, underlyingLegSymbolSfxLength);
            position += underlyingLegSymbolSfxLength;
            buffer.putSeparator(position);
            position++;
        }

        if (underlyingLegSecurityIDLength > 0)
        {
            buffer.putBytes(position, underlyingLegSecurityIDHeader, 0, underlyingLegSecurityIDHeaderLength);
            position += underlyingLegSecurityIDHeaderLength;
            buffer.putBytes(position, underlyingLegSecurityID, underlyingLegSecurityIDOffset, underlyingLegSecurityIDLength);
            position += underlyingLegSecurityIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (underlyingLegSecurityIDSourceLength > 0)
        {
            buffer.putBytes(position, underlyingLegSecurityIDSourceHeader, 0, underlyingLegSecurityIDSourceHeaderLength);
            position += underlyingLegSecurityIDSourceHeaderLength;
            buffer.putBytes(position, underlyingLegSecurityIDSource, underlyingLegSecurityIDSourceOffset, underlyingLegSecurityIDSourceLength);
            position += underlyingLegSecurityIDSourceLength;
            buffer.putSeparator(position);
            position++;
        }

            position += underlyingLegSecurityAltIDGrp.encode(buffer, position);

        if (underlyingLegCFICodeLength > 0)
        {
            buffer.putBytes(position, underlyingLegCFICodeHeader, 0, underlyingLegCFICodeHeaderLength);
            position += underlyingLegCFICodeHeaderLength;
            buffer.putBytes(position, underlyingLegCFICode, underlyingLegCFICodeOffset, underlyingLegCFICodeLength);
            position += underlyingLegCFICodeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (underlyingLegSecurityTypeLength > 0)
        {
            buffer.putBytes(position, underlyingLegSecurityTypeHeader, 0, underlyingLegSecurityTypeHeaderLength);
            position += underlyingLegSecurityTypeHeaderLength;
            buffer.putBytes(position, underlyingLegSecurityType, underlyingLegSecurityTypeOffset, underlyingLegSecurityTypeLength);
            position += underlyingLegSecurityTypeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (underlyingLegSecuritySubTypeLength > 0)
        {
            buffer.putBytes(position, underlyingLegSecuritySubTypeHeader, 0, underlyingLegSecuritySubTypeHeaderLength);
            position += underlyingLegSecuritySubTypeHeaderLength;
            buffer.putBytes(position, underlyingLegSecuritySubType, underlyingLegSecuritySubTypeOffset, underlyingLegSecuritySubTypeLength);
            position += underlyingLegSecuritySubTypeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (underlyingLegMaturityMonthYearLength > 0)
        {
            buffer.putBytes(position, underlyingLegMaturityMonthYearHeader, 0, underlyingLegMaturityMonthYearHeaderLength);
            position += underlyingLegMaturityMonthYearHeaderLength;
            buffer.putBytes(position, underlyingLegMaturityMonthYear, underlyingLegMaturityMonthYearOffset, underlyingLegMaturityMonthYearLength);
            position += underlyingLegMaturityMonthYearLength;
            buffer.putSeparator(position);
            position++;
        }

        if (underlyingLegMaturityDateLength > 0)
        {
            buffer.putBytes(position, underlyingLegMaturityDateHeader, 0, underlyingLegMaturityDateHeaderLength);
            position += underlyingLegMaturityDateHeaderLength;
            buffer.putBytes(position, underlyingLegMaturityDate, underlyingLegMaturityDateOffset, underlyingLegMaturityDateLength);
            position += underlyingLegMaturityDateLength;
            buffer.putSeparator(position);
            position++;
        }

        if (underlyingLegMaturityTimeLength > 0)
        {
            buffer.putBytes(position, underlyingLegMaturityTimeHeader, 0, underlyingLegMaturityTimeHeaderLength);
            position += underlyingLegMaturityTimeHeaderLength;
            buffer.putBytes(position, underlyingLegMaturityTime, underlyingLegMaturityTimeOffset, underlyingLegMaturityTimeLength);
            position += underlyingLegMaturityTimeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasUnderlyingLegStrikePrice)
        {
            buffer.putBytes(position, underlyingLegStrikePriceHeader, 0, underlyingLegStrikePriceHeaderLength);
            position += underlyingLegStrikePriceHeaderLength;
            position += buffer.putFloatAscii(position, underlyingLegStrikePrice);
            buffer.putSeparator(position);
            position++;
        }

        if (hasUnderlyingLegOptAttribute)
        {
            buffer.putBytes(position, underlyingLegOptAttributeHeader, 0, underlyingLegOptAttributeHeaderLength);
            position += underlyingLegOptAttributeHeaderLength;
            position += buffer.putCharAscii(position, underlyingLegOptAttribute);
            buffer.putSeparator(position);
            position++;
        }

        if (hasUnderlyingLegPutOrCall)
        {
            buffer.putBytes(position, underlyingLegPutOrCallHeader, 0, underlyingLegPutOrCallHeaderLength);
            position += underlyingLegPutOrCallHeaderLength;
            position += buffer.putIntAscii(position, underlyingLegPutOrCall);
            buffer.putSeparator(position);
            position++;
        }

        if (underlyingLegSecurityExchangeLength > 0)
        {
            buffer.putBytes(position, underlyingLegSecurityExchangeHeader, 0, underlyingLegSecurityExchangeHeaderLength);
            position += underlyingLegSecurityExchangeHeaderLength;
            buffer.putBytes(position, underlyingLegSecurityExchange, underlyingLegSecurityExchangeOffset, underlyingLegSecurityExchangeLength);
            position += underlyingLegSecurityExchangeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (underlyingLegSecurityDescLength > 0)
        {
            buffer.putBytes(position, underlyingLegSecurityDescHeader, 0, underlyingLegSecurityDescHeaderLength);
            position += underlyingLegSecurityDescHeaderLength;
            buffer.putBytes(position, underlyingLegSecurityDesc, underlyingLegSecurityDescOffset, underlyingLegSecurityDescLength);
            position += underlyingLegSecurityDescLength;
            buffer.putSeparator(position);
            position++;
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetUnderlyingLegSymbol();
        this.resetUnderlyingLegSymbolSfx();
        this.resetUnderlyingLegSecurityID();
        this.resetUnderlyingLegSecurityIDSource();
        this.resetUnderlyingLegCFICode();
        this.resetUnderlyingLegSecurityType();
        this.resetUnderlyingLegSecuritySubType();
        this.resetUnderlyingLegMaturityMonthYear();
        this.resetUnderlyingLegMaturityDate();
        this.resetUnderlyingLegMaturityTime();
        this.resetUnderlyingLegStrikePrice();
        this.resetUnderlyingLegOptAttribute();
        this.resetUnderlyingLegPutOrCall();
        this.resetUnderlyingLegSecurityExchange();
        this.resetUnderlyingLegSecurityDesc();
        underlyingLegSecurityAltIDGrp.reset();
    }

    public void resetUnderlyingLegSymbol()
    {
        underlyingLegSymbolLength = 0;
    }

    public void resetUnderlyingLegSymbolSfx()
    {
        underlyingLegSymbolSfxLength = 0;
    }

    public void resetUnderlyingLegSecurityID()
    {
        underlyingLegSecurityIDLength = 0;
    }

    public void resetUnderlyingLegSecurityIDSource()
    {
        underlyingLegSecurityIDSourceLength = 0;
    }

    public void resetUnderlyingLegCFICode()
    {
        underlyingLegCFICodeLength = 0;
    }

    public void resetUnderlyingLegSecurityType()
    {
        underlyingLegSecurityTypeLength = 0;
    }

    public void resetUnderlyingLegSecuritySubType()
    {
        underlyingLegSecuritySubTypeLength = 0;
    }

    public void resetUnderlyingLegMaturityMonthYear()
    {
        underlyingLegMaturityMonthYearLength = 0;
    }

    public void resetUnderlyingLegMaturityDate()
    {
        underlyingLegMaturityDateLength = 0;
    }

    public void resetUnderlyingLegMaturityTime()
    {
        underlyingLegMaturityTimeLength = 0;
    }

    public void resetUnderlyingLegStrikePrice()
    {
        hasUnderlyingLegStrikePrice = false;
    }

    public void resetUnderlyingLegOptAttribute()
    {
        hasUnderlyingLegOptAttribute = false;
    }

    public void resetUnderlyingLegPutOrCall()
    {
        hasUnderlyingLegPutOrCall = false;
    }

    public void resetUnderlyingLegSecurityExchange()
    {
        underlyingLegSecurityExchangeLength = 0;
    }

    public void resetUnderlyingLegSecurityDesc()
    {
        underlyingLegSecurityDescLength = 0;
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
        builder.append("\"MessageName\": \"UnderlyingLegInstrument\",\n");
        if (hasUnderlyingLegSymbol())
        {
            indent(builder, level);
            builder.append("\"UnderlyingLegSymbol\": \"");
            appendBuffer(builder, underlyingLegSymbol, underlyingLegSymbolOffset, underlyingLegSymbolLength);
            builder.append("\",\n");
        }

        if (hasUnderlyingLegSymbolSfx())
        {
            indent(builder, level);
            builder.append("\"UnderlyingLegSymbolSfx\": \"");
            appendBuffer(builder, underlyingLegSymbolSfx, underlyingLegSymbolSfxOffset, underlyingLegSymbolSfxLength);
            builder.append("\",\n");
        }

        if (hasUnderlyingLegSecurityID())
        {
            indent(builder, level);
            builder.append("\"UnderlyingLegSecurityID\": \"");
            appendBuffer(builder, underlyingLegSecurityID, underlyingLegSecurityIDOffset, underlyingLegSecurityIDLength);
            builder.append("\",\n");
        }

        if (hasUnderlyingLegSecurityIDSource())
        {
            indent(builder, level);
            builder.append("\"UnderlyingLegSecurityIDSource\": \"");
            appendBuffer(builder, underlyingLegSecurityIDSource, underlyingLegSecurityIDSourceOffset, underlyingLegSecurityIDSourceLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"UnderlyingLegSecurityAltIDGrp\": ");
    underlyingLegSecurityAltIDGrp.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasUnderlyingLegCFICode())
        {
            indent(builder, level);
            builder.append("\"UnderlyingLegCFICode\": \"");
            appendBuffer(builder, underlyingLegCFICode, underlyingLegCFICodeOffset, underlyingLegCFICodeLength);
            builder.append("\",\n");
        }

        if (hasUnderlyingLegSecurityType())
        {
            indent(builder, level);
            builder.append("\"UnderlyingLegSecurityType\": \"");
            appendBuffer(builder, underlyingLegSecurityType, underlyingLegSecurityTypeOffset, underlyingLegSecurityTypeLength);
            builder.append("\",\n");
        }

        if (hasUnderlyingLegSecuritySubType())
        {
            indent(builder, level);
            builder.append("\"UnderlyingLegSecuritySubType\": \"");
            appendBuffer(builder, underlyingLegSecuritySubType, underlyingLegSecuritySubTypeOffset, underlyingLegSecuritySubTypeLength);
            builder.append("\",\n");
        }

        if (hasUnderlyingLegMaturityMonthYear())
        {
            indent(builder, level);
            builder.append("\"UnderlyingLegMaturityMonthYear\": \"");
            appendBuffer(builder, underlyingLegMaturityMonthYear, underlyingLegMaturityMonthYearOffset, underlyingLegMaturityMonthYearLength);
            builder.append("\",\n");
        }

        if (hasUnderlyingLegMaturityDate())
        {
            indent(builder, level);
            builder.append("\"UnderlyingLegMaturityDate\": \"");
            appendBuffer(builder, underlyingLegMaturityDate, underlyingLegMaturityDateOffset, underlyingLegMaturityDateLength);
            builder.append("\",\n");
        }

        if (hasUnderlyingLegMaturityTime())
        {
            indent(builder, level);
            builder.append("\"UnderlyingLegMaturityTime\": \"");
            appendBuffer(builder, underlyingLegMaturityTime, underlyingLegMaturityTimeOffset, underlyingLegMaturityTimeLength);
            builder.append("\",\n");
        }

        if (hasUnderlyingLegStrikePrice())
        {
            indent(builder, level);
            builder.append("\"UnderlyingLegStrikePrice\": \"");
            underlyingLegStrikePrice.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasUnderlyingLegOptAttribute())
        {
            indent(builder, level);
            builder.append("\"UnderlyingLegOptAttribute\": \"");
            builder.append(underlyingLegOptAttribute);
            builder.append("\",\n");
        }

        if (hasUnderlyingLegPutOrCall())
        {
            indent(builder, level);
            builder.append("\"UnderlyingLegPutOrCall\": \"");
            builder.append(underlyingLegPutOrCall);
            builder.append("\",\n");
        }

        if (hasUnderlyingLegSecurityExchange())
        {
            indent(builder, level);
            builder.append("\"UnderlyingLegSecurityExchange\": \"");
            appendBuffer(builder, underlyingLegSecurityExchange, underlyingLegSecurityExchangeOffset, underlyingLegSecurityExchangeLength);
            builder.append("\",\n");
        }

        if (hasUnderlyingLegSecurityDesc())
        {
            indent(builder, level);
            builder.append("\"UnderlyingLegSecurityDesc\": \"");
            appendBuffer(builder, underlyingLegSecurityDesc, underlyingLegSecurityDescOffset, underlyingLegSecurityDescLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public UnderlyingLegInstrumentEncoder copyTo(final Encoder encoder)
    {
        return copyTo((UnderlyingLegInstrumentEncoder)encoder);
    }

    public UnderlyingLegInstrumentEncoder copyTo(final UnderlyingLegInstrumentEncoder encoder)
    {
        encoder.reset();
        if (hasUnderlyingLegSymbol())
        {
            encoder.underlyingLegSymbolAsCopy(underlyingLegSymbol.byteArray(), 0, underlyingLegSymbolLength);
        }

        if (hasUnderlyingLegSymbolSfx())
        {
            encoder.underlyingLegSymbolSfxAsCopy(underlyingLegSymbolSfx.byteArray(), 0, underlyingLegSymbolSfxLength);
        }

        if (hasUnderlyingLegSecurityID())
        {
            encoder.underlyingLegSecurityIDAsCopy(underlyingLegSecurityID.byteArray(), 0, underlyingLegSecurityIDLength);
        }

        if (hasUnderlyingLegSecurityIDSource())
        {
            encoder.underlyingLegSecurityIDSourceAsCopy(underlyingLegSecurityIDSource.byteArray(), 0, underlyingLegSecurityIDSourceLength);
        }


        underlyingLegSecurityAltIDGrp.copyTo(encoder.underlyingLegSecurityAltIDGrp());
        if (hasUnderlyingLegCFICode())
        {
            encoder.underlyingLegCFICodeAsCopy(underlyingLegCFICode.byteArray(), 0, underlyingLegCFICodeLength);
        }

        if (hasUnderlyingLegSecurityType())
        {
            encoder.underlyingLegSecurityTypeAsCopy(underlyingLegSecurityType.byteArray(), 0, underlyingLegSecurityTypeLength);
        }

        if (hasUnderlyingLegSecuritySubType())
        {
            encoder.underlyingLegSecuritySubTypeAsCopy(underlyingLegSecuritySubType.byteArray(), 0, underlyingLegSecuritySubTypeLength);
        }

        if (hasUnderlyingLegMaturityMonthYear())
        {
            encoder.underlyingLegMaturityMonthYearAsCopy(underlyingLegMaturityMonthYear.byteArray(), 0, underlyingLegMaturityMonthYearLength);
        }

        if (hasUnderlyingLegMaturityDate())
        {
            encoder.underlyingLegMaturityDateAsCopy(underlyingLegMaturityDate.byteArray(), 0, underlyingLegMaturityDateLength);
        }

        if (hasUnderlyingLegMaturityTime())
        {
            encoder.underlyingLegMaturityTimeAsCopy(underlyingLegMaturityTime.byteArray(), 0, underlyingLegMaturityTimeLength);
        }

        if (hasUnderlyingLegStrikePrice())
        {
            encoder.underlyingLegStrikePrice(this.underlyingLegStrikePrice());
        }

        if (hasUnderlyingLegOptAttribute())
        {
            encoder.underlyingLegOptAttribute(this.underlyingLegOptAttribute());
        }

        if (hasUnderlyingLegPutOrCall())
        {
            encoder.underlyingLegPutOrCall(this.underlyingLegPutOrCall());
        }

        if (hasUnderlyingLegSecurityExchange())
        {
            encoder.underlyingLegSecurityExchangeAsCopy(underlyingLegSecurityExchange.byteArray(), 0, underlyingLegSecurityExchangeLength);
        }

        if (hasUnderlyingLegSecurityDesc())
        {
            encoder.underlyingLegSecurityDescAsCopy(underlyingLegSecurityDesc.byteArray(), 0, underlyingLegSecurityDescLength);
        }
        return encoder;
    }

}
