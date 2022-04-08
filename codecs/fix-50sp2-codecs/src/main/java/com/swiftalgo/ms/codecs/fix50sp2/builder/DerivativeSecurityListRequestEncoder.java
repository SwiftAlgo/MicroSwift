/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2.builder;

import org.agrona.MutableDirectBuffer;
import org.agrona.AsciiSequenceView;
import static uk.co.real_logic.artio.dictionary.generation.CodecUtil.*;
import static uk.co.real_logic.artio.dictionary.SessionConstants.*;
import uk.co.real_logic.artio.builder.Encoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.HeaderEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.TrailerEncoder;
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


public class DerivativeSecurityListRequestEncoder implements Encoder
{
    public long messageType()
    {
        return 122L;
    }

    public DerivativeSecurityListRequestEncoder()
    {
        header.msgType("z");
    }

    private final TrailerEncoder trailer = new TrailerEncoder();

    public TrailerEncoder trailer()
    {
        return trailer;
    }

    private final HeaderEncoder header = new HeaderEncoder();

    public HeaderEncoder header()
    {
        return header;
    }

    private static final int securityReqIDHeaderLength = 4;
    private static final byte[] securityReqIDHeader = new byte[] {51, 50, 48, (byte) '='};

    private static final int securityListRequestTypeHeaderLength = 4;
    private static final byte[] securityListRequestTypeHeader = new byte[] {53, 53, 57, (byte) '='};

    private static final int marketIDHeaderLength = 5;
    private static final byte[] marketIDHeader = new byte[] {49, 51, 48, 49, (byte) '='};

    private static final int marketSegmentIDHeaderLength = 5;
    private static final byte[] marketSegmentIDHeader = new byte[] {49, 51, 48, 48, (byte) '='};

    private static final int securitySubTypeHeaderLength = 4;
    private static final byte[] securitySubTypeHeader = new byte[] {55, 54, 50, (byte) '='};

    private static final int currencyHeaderLength = 3;
    private static final byte[] currencyHeader = new byte[] {49, 53, (byte) '='};

    private static final int textHeaderLength = 3;
    private static final byte[] textHeader = new byte[] {53, 56, (byte) '='};

    private static final int encodedTextLenHeaderLength = 4;
    private static final byte[] encodedTextLenHeader = new byte[] {51, 53, 52, (byte) '='};

    private static final int encodedTextHeaderLength = 4;
    private static final byte[] encodedTextHeader = new byte[] {51, 53, 53, (byte) '='};

    private static final int tradingSessionIDHeaderLength = 4;
    private static final byte[] tradingSessionIDHeader = new byte[] {51, 51, 54, (byte) '='};

    private static final int tradingSessionSubIDHeaderLength = 4;
    private static final byte[] tradingSessionSubIDHeader = new byte[] {54, 50, 53, (byte) '='};

    private static final int subscriptionRequestTypeHeaderLength = 4;
    private static final byte[] subscriptionRequestTypeHeader = new byte[] {50, 54, 51, (byte) '='};

    private final MutableDirectBuffer securityReqID = new UnsafeBuffer();

    private int securityReqIDOffset = 0;

    private int securityReqIDLength = 0;

    public DerivativeSecurityListRequestEncoder securityReqID(final DirectBuffer value, final int offset, final int length)
    {
        securityReqID.wrap(value);
        securityReqIDOffset = offset;
        securityReqIDLength = length;
        return this;
    }

    public DerivativeSecurityListRequestEncoder securityReqID(final DirectBuffer value, final int length)
    {
        return securityReqID(value, 0, length);
    }

    public DerivativeSecurityListRequestEncoder securityReqID(final DirectBuffer value)
    {
        return securityReqID(value, 0, value.capacity());
    }

    public DerivativeSecurityListRequestEncoder securityReqID(final byte[] value, final int offset, final int length)
    {
        securityReqID.wrap(value);
        securityReqIDOffset = offset;
        securityReqIDLength = length;
        return this;
    }

    public DerivativeSecurityListRequestEncoder securityReqIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(securityReqID, value, offset, length);
        securityReqIDOffset = offset;
        securityReqIDLength = length;
        return this;
    }

    public DerivativeSecurityListRequestEncoder securityReqID(final byte[] value, final int length)
    {
        return securityReqID(value, 0, length);
    }

    public DerivativeSecurityListRequestEncoder securityReqID(final byte[] value)
    {
        return securityReqID(value, 0, value.length);
    }

    public boolean hasSecurityReqID()
    {
        return securityReqIDLength > 0;
    }

    public MutableDirectBuffer securityReqID()
    {
        return securityReqID;
    }

    public String securityReqIDAsString()
    {
        return securityReqID.getStringWithoutLengthAscii(securityReqIDOffset, securityReqIDLength);
    }

    public DerivativeSecurityListRequestEncoder securityReqID(final CharSequence value)
    {
        toBytes(value, securityReqID);
        securityReqIDOffset = 0;
        securityReqIDLength = value.length();
        return this;
    }

    public DerivativeSecurityListRequestEncoder securityReqID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            securityReqID.wrap(buffer);
            securityReqIDOffset = value.offset();
            securityReqIDLength = value.length();
        }
        return this;
    }

    public DerivativeSecurityListRequestEncoder securityReqID(final char[] value)
    {
        return securityReqID(value, 0, value.length);
    }

    public DerivativeSecurityListRequestEncoder securityReqID(final char[] value, final int length)
    {
        return securityReqID(value, 0, length);
    }

    public DerivativeSecurityListRequestEncoder securityReqID(final char[] value, final int offset, final int length)
    {
        toBytes(value, securityReqID, offset, length);
        securityReqIDOffset = 0;
        securityReqIDLength = length;
        return this;
    }

    private int securityListRequestType;

    private boolean hasSecurityListRequestType;

    public boolean hasSecurityListRequestType()
    {
        return hasSecurityListRequestType;
    }

    public DerivativeSecurityListRequestEncoder securityListRequestType(int value)
    {
        securityListRequestType = value;
        hasSecurityListRequestType = true;
        return this;
    }

    public int securityListRequestType()
    {
        return securityListRequestType;
    }

    public DerivativeSecurityListRequestEncoder securityListRequestType(SecurityListRequestType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == SecurityListRequestType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: securityListRequestType Value: " + value );
            }
            if (value == SecurityListRequestType.NULL_VAL)
            {
                return this;
            }
        }
        return securityListRequestType(value.representation());
    }

    private final MutableDirectBuffer marketID = new UnsafeBuffer();

    private int marketIDOffset = 0;

    private int marketIDLength = 0;

    public DerivativeSecurityListRequestEncoder marketID(final DirectBuffer value, final int offset, final int length)
    {
        marketID.wrap(value);
        marketIDOffset = offset;
        marketIDLength = length;
        return this;
    }

    public DerivativeSecurityListRequestEncoder marketID(final DirectBuffer value, final int length)
    {
        return marketID(value, 0, length);
    }

    public DerivativeSecurityListRequestEncoder marketID(final DirectBuffer value)
    {
        return marketID(value, 0, value.capacity());
    }

    public DerivativeSecurityListRequestEncoder marketID(final byte[] value, final int offset, final int length)
    {
        marketID.wrap(value);
        marketIDOffset = offset;
        marketIDLength = length;
        return this;
    }

    public DerivativeSecurityListRequestEncoder marketIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(marketID, value, offset, length);
        marketIDOffset = offset;
        marketIDLength = length;
        return this;
    }

    public DerivativeSecurityListRequestEncoder marketID(final byte[] value, final int length)
    {
        return marketID(value, 0, length);
    }

    public DerivativeSecurityListRequestEncoder marketID(final byte[] value)
    {
        return marketID(value, 0, value.length);
    }

    public boolean hasMarketID()
    {
        return marketIDLength > 0;
    }

    public MutableDirectBuffer marketID()
    {
        return marketID;
    }

    public String marketIDAsString()
    {
        return marketID.getStringWithoutLengthAscii(marketIDOffset, marketIDLength);
    }

    public DerivativeSecurityListRequestEncoder marketID(final CharSequence value)
    {
        toBytes(value, marketID);
        marketIDOffset = 0;
        marketIDLength = value.length();
        return this;
    }

    public DerivativeSecurityListRequestEncoder marketID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            marketID.wrap(buffer);
            marketIDOffset = value.offset();
            marketIDLength = value.length();
        }
        return this;
    }

    public DerivativeSecurityListRequestEncoder marketID(final char[] value)
    {
        return marketID(value, 0, value.length);
    }

    public DerivativeSecurityListRequestEncoder marketID(final char[] value, final int length)
    {
        return marketID(value, 0, length);
    }

    public DerivativeSecurityListRequestEncoder marketID(final char[] value, final int offset, final int length)
    {
        toBytes(value, marketID, offset, length);
        marketIDOffset = 0;
        marketIDLength = length;
        return this;
    }

    private final MutableDirectBuffer marketSegmentID = new UnsafeBuffer();

    private int marketSegmentIDOffset = 0;

    private int marketSegmentIDLength = 0;

    public DerivativeSecurityListRequestEncoder marketSegmentID(final DirectBuffer value, final int offset, final int length)
    {
        marketSegmentID.wrap(value);
        marketSegmentIDOffset = offset;
        marketSegmentIDLength = length;
        return this;
    }

    public DerivativeSecurityListRequestEncoder marketSegmentID(final DirectBuffer value, final int length)
    {
        return marketSegmentID(value, 0, length);
    }

    public DerivativeSecurityListRequestEncoder marketSegmentID(final DirectBuffer value)
    {
        return marketSegmentID(value, 0, value.capacity());
    }

    public DerivativeSecurityListRequestEncoder marketSegmentID(final byte[] value, final int offset, final int length)
    {
        marketSegmentID.wrap(value);
        marketSegmentIDOffset = offset;
        marketSegmentIDLength = length;
        return this;
    }

    public DerivativeSecurityListRequestEncoder marketSegmentIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(marketSegmentID, value, offset, length);
        marketSegmentIDOffset = offset;
        marketSegmentIDLength = length;
        return this;
    }

    public DerivativeSecurityListRequestEncoder marketSegmentID(final byte[] value, final int length)
    {
        return marketSegmentID(value, 0, length);
    }

    public DerivativeSecurityListRequestEncoder marketSegmentID(final byte[] value)
    {
        return marketSegmentID(value, 0, value.length);
    }

    public boolean hasMarketSegmentID()
    {
        return marketSegmentIDLength > 0;
    }

    public MutableDirectBuffer marketSegmentID()
    {
        return marketSegmentID;
    }

    public String marketSegmentIDAsString()
    {
        return marketSegmentID.getStringWithoutLengthAscii(marketSegmentIDOffset, marketSegmentIDLength);
    }

    public DerivativeSecurityListRequestEncoder marketSegmentID(final CharSequence value)
    {
        toBytes(value, marketSegmentID);
        marketSegmentIDOffset = 0;
        marketSegmentIDLength = value.length();
        return this;
    }

    public DerivativeSecurityListRequestEncoder marketSegmentID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            marketSegmentID.wrap(buffer);
            marketSegmentIDOffset = value.offset();
            marketSegmentIDLength = value.length();
        }
        return this;
    }

    public DerivativeSecurityListRequestEncoder marketSegmentID(final char[] value)
    {
        return marketSegmentID(value, 0, value.length);
    }

    public DerivativeSecurityListRequestEncoder marketSegmentID(final char[] value, final int length)
    {
        return marketSegmentID(value, 0, length);
    }

    public DerivativeSecurityListRequestEncoder marketSegmentID(final char[] value, final int offset, final int length)
    {
        toBytes(value, marketSegmentID, offset, length);
        marketSegmentIDOffset = 0;
        marketSegmentIDLength = length;
        return this;
    }

    private final UnderlyingInstrumentEncoder underlyingInstrument = new UnderlyingInstrumentEncoder();
    public UnderlyingInstrumentEncoder underlyingInstrument()
    {
        return underlyingInstrument;
    }

    private final DerivativeInstrumentEncoder derivativeInstrument = new DerivativeInstrumentEncoder();
    public DerivativeInstrumentEncoder derivativeInstrument()
    {
        return derivativeInstrument;
    }

    private final MutableDirectBuffer securitySubType = new UnsafeBuffer();

    private int securitySubTypeOffset = 0;

    private int securitySubTypeLength = 0;

    public DerivativeSecurityListRequestEncoder securitySubType(final DirectBuffer value, final int offset, final int length)
    {
        securitySubType.wrap(value);
        securitySubTypeOffset = offset;
        securitySubTypeLength = length;
        return this;
    }

    public DerivativeSecurityListRequestEncoder securitySubType(final DirectBuffer value, final int length)
    {
        return securitySubType(value, 0, length);
    }

    public DerivativeSecurityListRequestEncoder securitySubType(final DirectBuffer value)
    {
        return securitySubType(value, 0, value.capacity());
    }

    public DerivativeSecurityListRequestEncoder securitySubType(final byte[] value, final int offset, final int length)
    {
        securitySubType.wrap(value);
        securitySubTypeOffset = offset;
        securitySubTypeLength = length;
        return this;
    }

    public DerivativeSecurityListRequestEncoder securitySubTypeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(securitySubType, value, offset, length);
        securitySubTypeOffset = offset;
        securitySubTypeLength = length;
        return this;
    }

    public DerivativeSecurityListRequestEncoder securitySubType(final byte[] value, final int length)
    {
        return securitySubType(value, 0, length);
    }

    public DerivativeSecurityListRequestEncoder securitySubType(final byte[] value)
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

    public DerivativeSecurityListRequestEncoder securitySubType(final CharSequence value)
    {
        toBytes(value, securitySubType);
        securitySubTypeOffset = 0;
        securitySubTypeLength = value.length();
        return this;
    }

    public DerivativeSecurityListRequestEncoder securitySubType(final AsciiSequenceView value)
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

    public DerivativeSecurityListRequestEncoder securitySubType(final char[] value)
    {
        return securitySubType(value, 0, value.length);
    }

    public DerivativeSecurityListRequestEncoder securitySubType(final char[] value, final int length)
    {
        return securitySubType(value, 0, length);
    }

    public DerivativeSecurityListRequestEncoder securitySubType(final char[] value, final int offset, final int length)
    {
        toBytes(value, securitySubType, offset, length);
        securitySubTypeOffset = 0;
        securitySubTypeLength = length;
        return this;
    }

    private final MutableDirectBuffer currency = new UnsafeBuffer();

    private int currencyOffset = 0;

    private int currencyLength = 0;

    public DerivativeSecurityListRequestEncoder currency(final DirectBuffer value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public DerivativeSecurityListRequestEncoder currency(final DirectBuffer value, final int length)
    {
        return currency(value, 0, length);
    }

    public DerivativeSecurityListRequestEncoder currency(final DirectBuffer value)
    {
        return currency(value, 0, value.capacity());
    }

    public DerivativeSecurityListRequestEncoder currency(final byte[] value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public DerivativeSecurityListRequestEncoder currencyAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(currency, value, offset, length);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public DerivativeSecurityListRequestEncoder currency(final byte[] value, final int length)
    {
        return currency(value, 0, length);
    }

    public DerivativeSecurityListRequestEncoder currency(final byte[] value)
    {
        return currency(value, 0, value.length);
    }

    public boolean hasCurrency()
    {
        return currencyLength > 0;
    }

    public MutableDirectBuffer currency()
    {
        return currency;
    }

    public String currencyAsString()
    {
        return currency.getStringWithoutLengthAscii(currencyOffset, currencyLength);
    }

    public DerivativeSecurityListRequestEncoder currency(final CharSequence value)
    {
        toBytes(value, currency);
        currencyOffset = 0;
        currencyLength = value.length();
        return this;
    }

    public DerivativeSecurityListRequestEncoder currency(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            currency.wrap(buffer);
            currencyOffset = value.offset();
            currencyLength = value.length();
        }
        return this;
    }

    public DerivativeSecurityListRequestEncoder currency(final char[] value)
    {
        return currency(value, 0, value.length);
    }

    public DerivativeSecurityListRequestEncoder currency(final char[] value, final int length)
    {
        return currency(value, 0, length);
    }

    public DerivativeSecurityListRequestEncoder currency(final char[] value, final int offset, final int length)
    {
        toBytes(value, currency, offset, length);
        currencyOffset = 0;
        currencyLength = length;
        return this;
    }

    private final MutableDirectBuffer text = new UnsafeBuffer();

    private int textOffset = 0;

    private int textLength = 0;

    public DerivativeSecurityListRequestEncoder text(final DirectBuffer value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public DerivativeSecurityListRequestEncoder text(final DirectBuffer value, final int length)
    {
        return text(value, 0, length);
    }

    public DerivativeSecurityListRequestEncoder text(final DirectBuffer value)
    {
        return text(value, 0, value.capacity());
    }

    public DerivativeSecurityListRequestEncoder text(final byte[] value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public DerivativeSecurityListRequestEncoder textAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(text, value, offset, length);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public DerivativeSecurityListRequestEncoder text(final byte[] value, final int length)
    {
        return text(value, 0, length);
    }

    public DerivativeSecurityListRequestEncoder text(final byte[] value)
    {
        return text(value, 0, value.length);
    }

    public boolean hasText()
    {
        return textLength > 0;
    }

    public MutableDirectBuffer text()
    {
        return text;
    }

    public String textAsString()
    {
        return text.getStringWithoutLengthAscii(textOffset, textLength);
    }

    public DerivativeSecurityListRequestEncoder text(final CharSequence value)
    {
        toBytes(value, text);
        textOffset = 0;
        textLength = value.length();
        return this;
    }

    public DerivativeSecurityListRequestEncoder text(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            text.wrap(buffer);
            textOffset = value.offset();
            textLength = value.length();
        }
        return this;
    }

    public DerivativeSecurityListRequestEncoder text(final char[] value)
    {
        return text(value, 0, value.length);
    }

    public DerivativeSecurityListRequestEncoder text(final char[] value, final int length)
    {
        return text(value, 0, length);
    }

    public DerivativeSecurityListRequestEncoder text(final char[] value, final int offset, final int length)
    {
        toBytes(value, text, offset, length);
        textOffset = 0;
        textLength = length;
        return this;
    }

    private int encodedTextLen;

    private boolean hasEncodedTextLen;

    public boolean hasEncodedTextLen()
    {
        return hasEncodedTextLen;
    }

    public DerivativeSecurityListRequestEncoder encodedTextLen(int value)
    {
        encodedTextLen = value;
        hasEncodedTextLen = true;
        return this;
    }

    public int encodedTextLen()
    {
        return encodedTextLen;
    }

    private byte[] encodedText;

    private boolean hasEncodedText;

    public boolean hasEncodedText()
    {
        return hasEncodedText;
    }

    public DerivativeSecurityListRequestEncoder encodedText(byte[] value)
    {
        encodedText = value;
        hasEncodedText = true;
        return this;
    }

    public byte[] encodedText()
    {
        return encodedText;
    }

    public DerivativeSecurityListRequestEncoder encodedTextAsCopy(final byte[] value, final int offset, final int length)
    {
        encodedText = copyInto(encodedText, value, offset, length);
        hasEncodedText = true;
        return this;
    }

    private final MutableDirectBuffer tradingSessionID = new UnsafeBuffer();

    private int tradingSessionIDOffset = 0;

    private int tradingSessionIDLength = 0;

    public DerivativeSecurityListRequestEncoder tradingSessionID(final DirectBuffer value, final int offset, final int length)
    {
        tradingSessionID.wrap(value);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public DerivativeSecurityListRequestEncoder tradingSessionID(final DirectBuffer value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public DerivativeSecurityListRequestEncoder tradingSessionID(final DirectBuffer value)
    {
        return tradingSessionID(value, 0, value.capacity());
    }

    public DerivativeSecurityListRequestEncoder tradingSessionID(final byte[] value, final int offset, final int length)
    {
        tradingSessionID.wrap(value);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public DerivativeSecurityListRequestEncoder tradingSessionIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradingSessionID, value, offset, length);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public DerivativeSecurityListRequestEncoder tradingSessionID(final byte[] value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public DerivativeSecurityListRequestEncoder tradingSessionID(final byte[] value)
    {
        return tradingSessionID(value, 0, value.length);
    }

    public boolean hasTradingSessionID()
    {
        return tradingSessionIDLength > 0;
    }

    public MutableDirectBuffer tradingSessionID()
    {
        return tradingSessionID;
    }

    public String tradingSessionIDAsString()
    {
        return tradingSessionID.getStringWithoutLengthAscii(tradingSessionIDOffset, tradingSessionIDLength);
    }

    public DerivativeSecurityListRequestEncoder tradingSessionID(final CharSequence value)
    {
        toBytes(value, tradingSessionID);
        tradingSessionIDOffset = 0;
        tradingSessionIDLength = value.length();
        return this;
    }

    public DerivativeSecurityListRequestEncoder tradingSessionID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            tradingSessionID.wrap(buffer);
            tradingSessionIDOffset = value.offset();
            tradingSessionIDLength = value.length();
        }
        return this;
    }

    public DerivativeSecurityListRequestEncoder tradingSessionID(final char[] value)
    {
        return tradingSessionID(value, 0, value.length);
    }

    public DerivativeSecurityListRequestEncoder tradingSessionID(final char[] value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public DerivativeSecurityListRequestEncoder tradingSessionID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradingSessionID, offset, length);
        tradingSessionIDOffset = 0;
        tradingSessionIDLength = length;
        return this;
    }

    public DerivativeSecurityListRequestEncoder tradingSessionID(TradingSessionID value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == TradingSessionID.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: tradingSessionID Value: " + value );
            }
            if (value == TradingSessionID.NULL_VAL)
            {
                return this;
            }
        }
        return tradingSessionID(value.representation());
    }

    private final MutableDirectBuffer tradingSessionSubID = new UnsafeBuffer();

    private int tradingSessionSubIDOffset = 0;

    private int tradingSessionSubIDLength = 0;

    public DerivativeSecurityListRequestEncoder tradingSessionSubID(final DirectBuffer value, final int offset, final int length)
    {
        tradingSessionSubID.wrap(value);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public DerivativeSecurityListRequestEncoder tradingSessionSubID(final DirectBuffer value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public DerivativeSecurityListRequestEncoder tradingSessionSubID(final DirectBuffer value)
    {
        return tradingSessionSubID(value, 0, value.capacity());
    }

    public DerivativeSecurityListRequestEncoder tradingSessionSubID(final byte[] value, final int offset, final int length)
    {
        tradingSessionSubID.wrap(value);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public DerivativeSecurityListRequestEncoder tradingSessionSubIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradingSessionSubID, value, offset, length);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public DerivativeSecurityListRequestEncoder tradingSessionSubID(final byte[] value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public DerivativeSecurityListRequestEncoder tradingSessionSubID(final byte[] value)
    {
        return tradingSessionSubID(value, 0, value.length);
    }

    public boolean hasTradingSessionSubID()
    {
        return tradingSessionSubIDLength > 0;
    }

    public MutableDirectBuffer tradingSessionSubID()
    {
        return tradingSessionSubID;
    }

    public String tradingSessionSubIDAsString()
    {
        return tradingSessionSubID.getStringWithoutLengthAscii(tradingSessionSubIDOffset, tradingSessionSubIDLength);
    }

    public DerivativeSecurityListRequestEncoder tradingSessionSubID(final CharSequence value)
    {
        toBytes(value, tradingSessionSubID);
        tradingSessionSubIDOffset = 0;
        tradingSessionSubIDLength = value.length();
        return this;
    }

    public DerivativeSecurityListRequestEncoder tradingSessionSubID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            tradingSessionSubID.wrap(buffer);
            tradingSessionSubIDOffset = value.offset();
            tradingSessionSubIDLength = value.length();
        }
        return this;
    }

    public DerivativeSecurityListRequestEncoder tradingSessionSubID(final char[] value)
    {
        return tradingSessionSubID(value, 0, value.length);
    }

    public DerivativeSecurityListRequestEncoder tradingSessionSubID(final char[] value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public DerivativeSecurityListRequestEncoder tradingSessionSubID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradingSessionSubID, offset, length);
        tradingSessionSubIDOffset = 0;
        tradingSessionSubIDLength = length;
        return this;
    }

    public DerivativeSecurityListRequestEncoder tradingSessionSubID(TradingSessionSubID value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == TradingSessionSubID.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: tradingSessionSubID Value: " + value );
            }
            if (value == TradingSessionSubID.NULL_VAL)
            {
                return this;
            }
        }
        return tradingSessionSubID(value.representation());
    }

    private char subscriptionRequestType;

    private boolean hasSubscriptionRequestType;

    public boolean hasSubscriptionRequestType()
    {
        return hasSubscriptionRequestType;
    }

    public DerivativeSecurityListRequestEncoder subscriptionRequestType(char value)
    {
        subscriptionRequestType = value;
        hasSubscriptionRequestType = true;
        return this;
    }

    public char subscriptionRequestType()
    {
        return subscriptionRequestType;
    }

    public DerivativeSecurityListRequestEncoder subscriptionRequestType(SubscriptionRequestType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == SubscriptionRequestType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: subscriptionRequestType Value: " + value );
            }
            if (value == SubscriptionRequestType.NULL_VAL)
            {
                return this;
            }
        }
        return subscriptionRequestType(value.representation());
    }

    public long encode(final MutableAsciiBuffer buffer, final int offset)
    {
        final long startMessageResult = header.startMessage(buffer, offset);
        final int bodyStart = Encoder.offset(startMessageResult);
        int position = bodyStart + Encoder.length(startMessageResult);

        if (securityReqIDLength > 0)
        {
            buffer.putBytes(position, securityReqIDHeader, 0, securityReqIDHeaderLength);
            position += securityReqIDHeaderLength;
            buffer.putBytes(position, securityReqID, securityReqIDOffset, securityReqIDLength);
            position += securityReqIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: SecurityReqID");
        }

        if (hasSecurityListRequestType)
        {
            buffer.putBytes(position, securityListRequestTypeHeader, 0, securityListRequestTypeHeaderLength);
            position += securityListRequestTypeHeaderLength;
            position += buffer.putIntAscii(position, securityListRequestType);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: SecurityListRequestType");
        }

        if (marketIDLength > 0)
        {
            buffer.putBytes(position, marketIDHeader, 0, marketIDHeaderLength);
            position += marketIDHeaderLength;
            buffer.putBytes(position, marketID, marketIDOffset, marketIDLength);
            position += marketIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (marketSegmentIDLength > 0)
        {
            buffer.putBytes(position, marketSegmentIDHeader, 0, marketSegmentIDHeaderLength);
            position += marketSegmentIDHeaderLength;
            buffer.putBytes(position, marketSegmentID, marketSegmentIDOffset, marketSegmentIDLength);
            position += marketSegmentIDLength;
            buffer.putSeparator(position);
            position++;
        }

            position += underlyingInstrument.encode(buffer, position);

            position += derivativeInstrument.encode(buffer, position);

        if (securitySubTypeLength > 0)
        {
            buffer.putBytes(position, securitySubTypeHeader, 0, securitySubTypeHeaderLength);
            position += securitySubTypeHeaderLength;
            buffer.putBytes(position, securitySubType, securitySubTypeOffset, securitySubTypeLength);
            position += securitySubTypeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (currencyLength > 0)
        {
            buffer.putBytes(position, currencyHeader, 0, currencyHeaderLength);
            position += currencyHeaderLength;
            buffer.putBytes(position, currency, currencyOffset, currencyLength);
            position += currencyLength;
            buffer.putSeparator(position);
            position++;
        }

        if (textLength > 0)
        {
            buffer.putBytes(position, textHeader, 0, textHeaderLength);
            position += textHeaderLength;
            buffer.putBytes(position, text, textOffset, textLength);
            position += textLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasEncodedTextLen)
        {
            buffer.putBytes(position, encodedTextLenHeader, 0, encodedTextLenHeaderLength);
            position += encodedTextLenHeaderLength;
            position += buffer.putIntAscii(position, encodedTextLen);
            buffer.putSeparator(position);
            position++;
        }

        if (hasEncodedText)
        {
            buffer.putBytes(position, encodedTextHeader, 0, encodedTextHeaderLength);
            position += encodedTextHeaderLength;
            buffer.putBytes(position, encodedText);
            position += encodedText.length;
            buffer.putSeparator(position);
            position++;
        }

        if (tradingSessionIDLength > 0)
        {
            buffer.putBytes(position, tradingSessionIDHeader, 0, tradingSessionIDHeaderLength);
            position += tradingSessionIDHeaderLength;
            buffer.putBytes(position, tradingSessionID, tradingSessionIDOffset, tradingSessionIDLength);
            position += tradingSessionIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (tradingSessionSubIDLength > 0)
        {
            buffer.putBytes(position, tradingSessionSubIDHeader, 0, tradingSessionSubIDHeaderLength);
            position += tradingSessionSubIDHeaderLength;
            buffer.putBytes(position, tradingSessionSubID, tradingSessionSubIDOffset, tradingSessionSubIDLength);
            position += tradingSessionSubIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasSubscriptionRequestType)
        {
            buffer.putBytes(position, subscriptionRequestTypeHeader, 0, subscriptionRequestTypeHeaderLength);
            position += subscriptionRequestTypeHeaderLength;
            position += buffer.putCharAscii(position, subscriptionRequestType);
            buffer.putSeparator(position);
            position++;
        }
        position += trailer.startTrailer(buffer, position);

        final int messageStart = header.finishHeader(buffer, bodyStart, position - bodyStart);
        return trailer.finishMessage(buffer, messageStart, position);
    }

    public void reset()
    {
        header.reset();
        trailer.reset();
        resetMessage();
    }

    public void resetMessage()
    {
        this.resetSecurityReqID();
        this.resetSecurityListRequestType();
        this.resetMarketID();
        this.resetMarketSegmentID();
        this.resetSecuritySubType();
        this.resetCurrency();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        this.resetTradingSessionID();
        this.resetTradingSessionSubID();
        this.resetSubscriptionRequestType();
        underlyingInstrument.reset();
        derivativeInstrument.reset();
    }

    public void resetSecurityReqID()
    {
        securityReqIDLength = 0;
    }

    public void resetSecurityListRequestType()
    {
        hasSecurityListRequestType = false;
    }

    public void resetMarketID()
    {
        marketIDLength = 0;
    }

    public void resetMarketSegmentID()
    {
        marketSegmentIDLength = 0;
    }

    public void resetSecuritySubType()
    {
        securitySubTypeLength = 0;
    }

    public void resetCurrency()
    {
        currencyLength = 0;
    }

    public void resetText()
    {
        textLength = 0;
    }

    public void resetEncodedTextLen()
    {
        hasEncodedTextLen = false;
    }

    public void resetEncodedText()
    {
        hasEncodedText = false;
    }

    public void resetTradingSessionID()
    {
        tradingSessionIDLength = 0;
    }

    public void resetTradingSessionSubID()
    {
        tradingSessionSubIDLength = 0;
    }

    public void resetSubscriptionRequestType()
    {
        hasSubscriptionRequestType = false;
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
        builder.append("\"MessageName\": \"DerivativeSecurityListRequest\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasSecurityReqID())
        {
            indent(builder, level);
            builder.append("\"SecurityReqID\": \"");
            appendBuffer(builder, securityReqID, securityReqIDOffset, securityReqIDLength);
            builder.append("\",\n");
        }

        if (hasSecurityListRequestType())
        {
            indent(builder, level);
            builder.append("\"SecurityListRequestType\": \"");
            builder.append(securityListRequestType);
            builder.append("\",\n");
        }

        if (hasMarketID())
        {
            indent(builder, level);
            builder.append("\"MarketID\": \"");
            appendBuffer(builder, marketID, marketIDOffset, marketIDLength);
            builder.append("\",\n");
        }

        if (hasMarketSegmentID())
        {
            indent(builder, level);
            builder.append("\"MarketSegmentID\": \"");
            appendBuffer(builder, marketSegmentID, marketSegmentIDOffset, marketSegmentIDLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"UnderlyingInstrument\": ");
    underlyingInstrument.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"DerivativeInstrument\": ");
    derivativeInstrument.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasSecuritySubType())
        {
            indent(builder, level);
            builder.append("\"SecuritySubType\": \"");
            appendBuffer(builder, securitySubType, securitySubTypeOffset, securitySubTypeLength);
            builder.append("\",\n");
        }

        if (hasCurrency())
        {
            indent(builder, level);
            builder.append("\"Currency\": \"");
            appendBuffer(builder, currency, currencyOffset, currencyLength);
            builder.append("\",\n");
        }

        if (hasText())
        {
            indent(builder, level);
            builder.append("\"Text\": \"");
            appendBuffer(builder, text, textOffset, textLength);
            builder.append("\",\n");
        }

        if (hasEncodedTextLen())
        {
            indent(builder, level);
            builder.append("\"EncodedTextLen\": \"");
            builder.append(encodedTextLen);
            builder.append("\",\n");
        }

        if (hasEncodedText())
        {
            indent(builder, level);
            builder.append("\"EncodedText\": \"");
            appendData(builder, encodedText, encodedTextLen);
            builder.append("\",\n");
        }

        if (hasTradingSessionID())
        {
            indent(builder, level);
            builder.append("\"TradingSessionID\": \"");
            appendBuffer(builder, tradingSessionID, tradingSessionIDOffset, tradingSessionIDLength);
            builder.append("\",\n");
        }

        if (hasTradingSessionSubID())
        {
            indent(builder, level);
            builder.append("\"TradingSessionSubID\": \"");
            appendBuffer(builder, tradingSessionSubID, tradingSessionSubIDOffset, tradingSessionSubIDLength);
            builder.append("\",\n");
        }

        if (hasSubscriptionRequestType())
        {
            indent(builder, level);
            builder.append("\"SubscriptionRequestType\": \"");
            builder.append(subscriptionRequestType);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public DerivativeSecurityListRequestEncoder copyTo(final Encoder encoder)
    {
        return copyTo((DerivativeSecurityListRequestEncoder)encoder);
    }

    public DerivativeSecurityListRequestEncoder copyTo(final DerivativeSecurityListRequestEncoder encoder)
    {
        encoder.reset();
        if (hasSecurityReqID())
        {
            encoder.securityReqIDAsCopy(securityReqID.byteArray(), 0, securityReqIDLength);
        }

        if (hasSecurityListRequestType())
        {
            encoder.securityListRequestType(this.securityListRequestType());
        }

        if (hasMarketID())
        {
            encoder.marketIDAsCopy(marketID.byteArray(), 0, marketIDLength);
        }

        if (hasMarketSegmentID())
        {
            encoder.marketSegmentIDAsCopy(marketSegmentID.byteArray(), 0, marketSegmentIDLength);
        }


        underlyingInstrument.copyTo(encoder.underlyingInstrument());

        derivativeInstrument.copyTo(encoder.derivativeInstrument());
        if (hasSecuritySubType())
        {
            encoder.securitySubTypeAsCopy(securitySubType.byteArray(), 0, securitySubTypeLength);
        }

        if (hasCurrency())
        {
            encoder.currencyAsCopy(currency.byteArray(), 0, currencyLength);
        }

        if (hasText())
        {
            encoder.textAsCopy(text.byteArray(), 0, textLength);
        }

        if (hasEncodedTextLen())
        {
            encoder.encodedTextLen(this.encodedTextLen());
        }

        if (hasEncodedText())
        {
            encoder.encodedTextAsCopy(this.encodedText(), 0, encodedTextLen());
            encoder.encodedTextLen(encodedTextLen());
        }

        if (hasTradingSessionID())
        {
            encoder.tradingSessionIDAsCopy(tradingSessionID.byteArray(), 0, tradingSessionIDLength);
        }

        if (hasTradingSessionSubID())
        {
            encoder.tradingSessionSubIDAsCopy(tradingSessionSubID.byteArray(), 0, tradingSessionSubIDLength);
        }

        if (hasSubscriptionRequestType())
        {
            encoder.subscriptionRequestType(this.subscriptionRequestType());
        }
        return encoder;
    }

}
