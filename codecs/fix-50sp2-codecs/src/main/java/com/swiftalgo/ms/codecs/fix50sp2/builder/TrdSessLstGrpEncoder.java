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


public class TrdSessLstGrpEncoder
{
    private static final int noTradingSessionsGroupCounterHeaderLength = 4;
    private static final byte[] noTradingSessionsGroupCounterHeader = new byte[] {51, 56, 54, (byte) '='};



public static class TradingSessionsGroupEncoder
{
    private TradingSessionsGroupEncoder next = null;

    public TradingSessionsGroupEncoder next()
    {
        if (next == null)
        {
            next = new TradingSessionsGroupEncoder();
        }
        return next;
    }

    private static final int tradingSessionIDHeaderLength = 4;
    private static final byte[] tradingSessionIDHeader = new byte[] {51, 51, 54, (byte) '='};

    private static final int tradingSessionSubIDHeaderLength = 4;
    private static final byte[] tradingSessionSubIDHeader = new byte[] {54, 50, 53, (byte) '='};

    private static final int tradSesUpdateActionHeaderLength = 5;
    private static final byte[] tradSesUpdateActionHeader = new byte[] {49, 51, 50, 55, (byte) '='};

    private static final int securityExchangeHeaderLength = 4;
    private static final byte[] securityExchangeHeader = new byte[] {50, 48, 55, (byte) '='};

    private static final int marketIDHeaderLength = 5;
    private static final byte[] marketIDHeader = new byte[] {49, 51, 48, 49, (byte) '='};

    private static final int marketSegmentIDHeaderLength = 5;
    private static final byte[] marketSegmentIDHeader = new byte[] {49, 51, 48, 48, (byte) '='};

    private static final int tradingSessionDescHeaderLength = 5;
    private static final byte[] tradingSessionDescHeader = new byte[] {49, 51, 50, 54, (byte) '='};

    private static final int tradSesMethodHeaderLength = 4;
    private static final byte[] tradSesMethodHeader = new byte[] {51, 51, 56, (byte) '='};

    private static final int tradSesModeHeaderLength = 4;
    private static final byte[] tradSesModeHeader = new byte[] {51, 51, 57, (byte) '='};

    private static final int unsolicitedIndicatorHeaderLength = 4;
    private static final byte[] unsolicitedIndicatorHeader = new byte[] {51, 50, 53, (byte) '='};

    private static final int tradSesStatusHeaderLength = 4;
    private static final byte[] tradSesStatusHeader = new byte[] {51, 52, 48, (byte) '='};

    private static final int tradSesStatusRejReasonHeaderLength = 4;
    private static final byte[] tradSesStatusRejReasonHeader = new byte[] {53, 54, 55, (byte) '='};

    private static final int tradSesStartTimeHeaderLength = 4;
    private static final byte[] tradSesStartTimeHeader = new byte[] {51, 52, 49, (byte) '='};

    private static final int tradSesOpenTimeHeaderLength = 4;
    private static final byte[] tradSesOpenTimeHeader = new byte[] {51, 52, 50, (byte) '='};

    private static final int tradSesPreCloseTimeHeaderLength = 4;
    private static final byte[] tradSesPreCloseTimeHeader = new byte[] {51, 52, 51, (byte) '='};

    private static final int tradSesCloseTimeHeaderLength = 4;
    private static final byte[] tradSesCloseTimeHeader = new byte[] {51, 52, 52, (byte) '='};

    private static final int tradSesEndTimeHeaderLength = 4;
    private static final byte[] tradSesEndTimeHeader = new byte[] {51, 52, 53, (byte) '='};

    private static final int totalVolumeTradedHeaderLength = 4;
    private static final byte[] totalVolumeTradedHeader = new byte[] {51, 56, 55, (byte) '='};

    private static final int transactTimeHeaderLength = 3;
    private static final byte[] transactTimeHeader = new byte[] {54, 48, (byte) '='};

    private static final int textHeaderLength = 3;
    private static final byte[] textHeader = new byte[] {53, 56, (byte) '='};

    private static final int encodedTextLenHeaderLength = 4;
    private static final byte[] encodedTextLenHeader = new byte[] {51, 53, 52, (byte) '='};

    private static final int encodedTextHeaderLength = 4;
    private static final byte[] encodedTextHeader = new byte[] {51, 53, 53, (byte) '='};

    private final MutableDirectBuffer tradingSessionID = new UnsafeBuffer();

    private int tradingSessionIDOffset = 0;

    private int tradingSessionIDLength = 0;

    public TradingSessionsGroupEncoder tradingSessionID(final DirectBuffer value, final int offset, final int length)
    {
        tradingSessionID.wrap(value);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public TradingSessionsGroupEncoder tradingSessionID(final DirectBuffer value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public TradingSessionsGroupEncoder tradingSessionID(final DirectBuffer value)
    {
        return tradingSessionID(value, 0, value.capacity());
    }

    public TradingSessionsGroupEncoder tradingSessionID(final byte[] value, final int offset, final int length)
    {
        tradingSessionID.wrap(value);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public TradingSessionsGroupEncoder tradingSessionIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradingSessionID, value, offset, length);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public TradingSessionsGroupEncoder tradingSessionID(final byte[] value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public TradingSessionsGroupEncoder tradingSessionID(final byte[] value)
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

    public TradingSessionsGroupEncoder tradingSessionID(final CharSequence value)
    {
        toBytes(value, tradingSessionID);
        tradingSessionIDOffset = 0;
        tradingSessionIDLength = value.length();
        return this;
    }

    public TradingSessionsGroupEncoder tradingSessionID(final AsciiSequenceView value)
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

    public TradingSessionsGroupEncoder tradingSessionID(final char[] value)
    {
        return tradingSessionID(value, 0, value.length);
    }

    public TradingSessionsGroupEncoder tradingSessionID(final char[] value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public TradingSessionsGroupEncoder tradingSessionID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradingSessionID, offset, length);
        tradingSessionIDOffset = 0;
        tradingSessionIDLength = length;
        return this;
    }

    public TradingSessionsGroupEncoder tradingSessionID(TradingSessionID value)
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

    public TradingSessionsGroupEncoder tradingSessionSubID(final DirectBuffer value, final int offset, final int length)
    {
        tradingSessionSubID.wrap(value);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public TradingSessionsGroupEncoder tradingSessionSubID(final DirectBuffer value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public TradingSessionsGroupEncoder tradingSessionSubID(final DirectBuffer value)
    {
        return tradingSessionSubID(value, 0, value.capacity());
    }

    public TradingSessionsGroupEncoder tradingSessionSubID(final byte[] value, final int offset, final int length)
    {
        tradingSessionSubID.wrap(value);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public TradingSessionsGroupEncoder tradingSessionSubIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradingSessionSubID, value, offset, length);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public TradingSessionsGroupEncoder tradingSessionSubID(final byte[] value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public TradingSessionsGroupEncoder tradingSessionSubID(final byte[] value)
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

    public TradingSessionsGroupEncoder tradingSessionSubID(final CharSequence value)
    {
        toBytes(value, tradingSessionSubID);
        tradingSessionSubIDOffset = 0;
        tradingSessionSubIDLength = value.length();
        return this;
    }

    public TradingSessionsGroupEncoder tradingSessionSubID(final AsciiSequenceView value)
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

    public TradingSessionsGroupEncoder tradingSessionSubID(final char[] value)
    {
        return tradingSessionSubID(value, 0, value.length);
    }

    public TradingSessionsGroupEncoder tradingSessionSubID(final char[] value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public TradingSessionsGroupEncoder tradingSessionSubID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradingSessionSubID, offset, length);
        tradingSessionSubIDOffset = 0;
        tradingSessionSubIDLength = length;
        return this;
    }

    public TradingSessionsGroupEncoder tradingSessionSubID(TradingSessionSubID value)
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

    private char tradSesUpdateAction;

    private boolean hasTradSesUpdateAction;

    public boolean hasTradSesUpdateAction()
    {
        return hasTradSesUpdateAction;
    }

    public TradingSessionsGroupEncoder tradSesUpdateAction(char value)
    {
        tradSesUpdateAction = value;
        hasTradSesUpdateAction = true;
        return this;
    }

    public char tradSesUpdateAction()
    {
        return tradSesUpdateAction;
    }

    private final MutableDirectBuffer securityExchange = new UnsafeBuffer();

    private int securityExchangeOffset = 0;

    private int securityExchangeLength = 0;

    public TradingSessionsGroupEncoder securityExchange(final DirectBuffer value, final int offset, final int length)
    {
        securityExchange.wrap(value);
        securityExchangeOffset = offset;
        securityExchangeLength = length;
        return this;
    }

    public TradingSessionsGroupEncoder securityExchange(final DirectBuffer value, final int length)
    {
        return securityExchange(value, 0, length);
    }

    public TradingSessionsGroupEncoder securityExchange(final DirectBuffer value)
    {
        return securityExchange(value, 0, value.capacity());
    }

    public TradingSessionsGroupEncoder securityExchange(final byte[] value, final int offset, final int length)
    {
        securityExchange.wrap(value);
        securityExchangeOffset = offset;
        securityExchangeLength = length;
        return this;
    }

    public TradingSessionsGroupEncoder securityExchangeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(securityExchange, value, offset, length);
        securityExchangeOffset = offset;
        securityExchangeLength = length;
        return this;
    }

    public TradingSessionsGroupEncoder securityExchange(final byte[] value, final int length)
    {
        return securityExchange(value, 0, length);
    }

    public TradingSessionsGroupEncoder securityExchange(final byte[] value)
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

    public TradingSessionsGroupEncoder securityExchange(final CharSequence value)
    {
        toBytes(value, securityExchange);
        securityExchangeOffset = 0;
        securityExchangeLength = value.length();
        return this;
    }

    public TradingSessionsGroupEncoder securityExchange(final AsciiSequenceView value)
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

    public TradingSessionsGroupEncoder securityExchange(final char[] value)
    {
        return securityExchange(value, 0, value.length);
    }

    public TradingSessionsGroupEncoder securityExchange(final char[] value, final int length)
    {
        return securityExchange(value, 0, length);
    }

    public TradingSessionsGroupEncoder securityExchange(final char[] value, final int offset, final int length)
    {
        toBytes(value, securityExchange, offset, length);
        securityExchangeOffset = 0;
        securityExchangeLength = length;
        return this;
    }

    private final MutableDirectBuffer marketID = new UnsafeBuffer();

    private int marketIDOffset = 0;

    private int marketIDLength = 0;

    public TradingSessionsGroupEncoder marketID(final DirectBuffer value, final int offset, final int length)
    {
        marketID.wrap(value);
        marketIDOffset = offset;
        marketIDLength = length;
        return this;
    }

    public TradingSessionsGroupEncoder marketID(final DirectBuffer value, final int length)
    {
        return marketID(value, 0, length);
    }

    public TradingSessionsGroupEncoder marketID(final DirectBuffer value)
    {
        return marketID(value, 0, value.capacity());
    }

    public TradingSessionsGroupEncoder marketID(final byte[] value, final int offset, final int length)
    {
        marketID.wrap(value);
        marketIDOffset = offset;
        marketIDLength = length;
        return this;
    }

    public TradingSessionsGroupEncoder marketIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(marketID, value, offset, length);
        marketIDOffset = offset;
        marketIDLength = length;
        return this;
    }

    public TradingSessionsGroupEncoder marketID(final byte[] value, final int length)
    {
        return marketID(value, 0, length);
    }

    public TradingSessionsGroupEncoder marketID(final byte[] value)
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

    public TradingSessionsGroupEncoder marketID(final CharSequence value)
    {
        toBytes(value, marketID);
        marketIDOffset = 0;
        marketIDLength = value.length();
        return this;
    }

    public TradingSessionsGroupEncoder marketID(final AsciiSequenceView value)
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

    public TradingSessionsGroupEncoder marketID(final char[] value)
    {
        return marketID(value, 0, value.length);
    }

    public TradingSessionsGroupEncoder marketID(final char[] value, final int length)
    {
        return marketID(value, 0, length);
    }

    public TradingSessionsGroupEncoder marketID(final char[] value, final int offset, final int length)
    {
        toBytes(value, marketID, offset, length);
        marketIDOffset = 0;
        marketIDLength = length;
        return this;
    }

    private final MutableDirectBuffer marketSegmentID = new UnsafeBuffer();

    private int marketSegmentIDOffset = 0;

    private int marketSegmentIDLength = 0;

    public TradingSessionsGroupEncoder marketSegmentID(final DirectBuffer value, final int offset, final int length)
    {
        marketSegmentID.wrap(value);
        marketSegmentIDOffset = offset;
        marketSegmentIDLength = length;
        return this;
    }

    public TradingSessionsGroupEncoder marketSegmentID(final DirectBuffer value, final int length)
    {
        return marketSegmentID(value, 0, length);
    }

    public TradingSessionsGroupEncoder marketSegmentID(final DirectBuffer value)
    {
        return marketSegmentID(value, 0, value.capacity());
    }

    public TradingSessionsGroupEncoder marketSegmentID(final byte[] value, final int offset, final int length)
    {
        marketSegmentID.wrap(value);
        marketSegmentIDOffset = offset;
        marketSegmentIDLength = length;
        return this;
    }

    public TradingSessionsGroupEncoder marketSegmentIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(marketSegmentID, value, offset, length);
        marketSegmentIDOffset = offset;
        marketSegmentIDLength = length;
        return this;
    }

    public TradingSessionsGroupEncoder marketSegmentID(final byte[] value, final int length)
    {
        return marketSegmentID(value, 0, length);
    }

    public TradingSessionsGroupEncoder marketSegmentID(final byte[] value)
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

    public TradingSessionsGroupEncoder marketSegmentID(final CharSequence value)
    {
        toBytes(value, marketSegmentID);
        marketSegmentIDOffset = 0;
        marketSegmentIDLength = value.length();
        return this;
    }

    public TradingSessionsGroupEncoder marketSegmentID(final AsciiSequenceView value)
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

    public TradingSessionsGroupEncoder marketSegmentID(final char[] value)
    {
        return marketSegmentID(value, 0, value.length);
    }

    public TradingSessionsGroupEncoder marketSegmentID(final char[] value, final int length)
    {
        return marketSegmentID(value, 0, length);
    }

    public TradingSessionsGroupEncoder marketSegmentID(final char[] value, final int offset, final int length)
    {
        toBytes(value, marketSegmentID, offset, length);
        marketSegmentIDOffset = 0;
        marketSegmentIDLength = length;
        return this;
    }

    private final MutableDirectBuffer tradingSessionDesc = new UnsafeBuffer();

    private int tradingSessionDescOffset = 0;

    private int tradingSessionDescLength = 0;

    public TradingSessionsGroupEncoder tradingSessionDesc(final DirectBuffer value, final int offset, final int length)
    {
        tradingSessionDesc.wrap(value);
        tradingSessionDescOffset = offset;
        tradingSessionDescLength = length;
        return this;
    }

    public TradingSessionsGroupEncoder tradingSessionDesc(final DirectBuffer value, final int length)
    {
        return tradingSessionDesc(value, 0, length);
    }

    public TradingSessionsGroupEncoder tradingSessionDesc(final DirectBuffer value)
    {
        return tradingSessionDesc(value, 0, value.capacity());
    }

    public TradingSessionsGroupEncoder tradingSessionDesc(final byte[] value, final int offset, final int length)
    {
        tradingSessionDesc.wrap(value);
        tradingSessionDescOffset = offset;
        tradingSessionDescLength = length;
        return this;
    }

    public TradingSessionsGroupEncoder tradingSessionDescAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradingSessionDesc, value, offset, length);
        tradingSessionDescOffset = offset;
        tradingSessionDescLength = length;
        return this;
    }

    public TradingSessionsGroupEncoder tradingSessionDesc(final byte[] value, final int length)
    {
        return tradingSessionDesc(value, 0, length);
    }

    public TradingSessionsGroupEncoder tradingSessionDesc(final byte[] value)
    {
        return tradingSessionDesc(value, 0, value.length);
    }

    public boolean hasTradingSessionDesc()
    {
        return tradingSessionDescLength > 0;
    }

    public MutableDirectBuffer tradingSessionDesc()
    {
        return tradingSessionDesc;
    }

    public String tradingSessionDescAsString()
    {
        return tradingSessionDesc.getStringWithoutLengthAscii(tradingSessionDescOffset, tradingSessionDescLength);
    }

    public TradingSessionsGroupEncoder tradingSessionDesc(final CharSequence value)
    {
        toBytes(value, tradingSessionDesc);
        tradingSessionDescOffset = 0;
        tradingSessionDescLength = value.length();
        return this;
    }

    public TradingSessionsGroupEncoder tradingSessionDesc(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            tradingSessionDesc.wrap(buffer);
            tradingSessionDescOffset = value.offset();
            tradingSessionDescLength = value.length();
        }
        return this;
    }

    public TradingSessionsGroupEncoder tradingSessionDesc(final char[] value)
    {
        return tradingSessionDesc(value, 0, value.length);
    }

    public TradingSessionsGroupEncoder tradingSessionDesc(final char[] value, final int length)
    {
        return tradingSessionDesc(value, 0, length);
    }

    public TradingSessionsGroupEncoder tradingSessionDesc(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradingSessionDesc, offset, length);
        tradingSessionDescOffset = 0;
        tradingSessionDescLength = length;
        return this;
    }

    private int tradSesMethod;

    private boolean hasTradSesMethod;

    public boolean hasTradSesMethod()
    {
        return hasTradSesMethod;
    }

    public TradingSessionsGroupEncoder tradSesMethod(int value)
    {
        tradSesMethod = value;
        hasTradSesMethod = true;
        return this;
    }

    public int tradSesMethod()
    {
        return tradSesMethod;
    }

    public TradingSessionsGroupEncoder tradSesMethod(TradSesMethod value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == TradSesMethod.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: tradSesMethod Value: " + value );
            }
            if (value == TradSesMethod.NULL_VAL)
            {
                return this;
            }
        }
        return tradSesMethod(value.representation());
    }

    private int tradSesMode;

    private boolean hasTradSesMode;

    public boolean hasTradSesMode()
    {
        return hasTradSesMode;
    }

    public TradingSessionsGroupEncoder tradSesMode(int value)
    {
        tradSesMode = value;
        hasTradSesMode = true;
        return this;
    }

    public int tradSesMode()
    {
        return tradSesMode;
    }

    public TradingSessionsGroupEncoder tradSesMode(TradSesMode value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == TradSesMode.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: tradSesMode Value: " + value );
            }
            if (value == TradSesMode.NULL_VAL)
            {
                return this;
            }
        }
        return tradSesMode(value.representation());
    }

    private boolean unsolicitedIndicator;

    private boolean hasUnsolicitedIndicator;

    public boolean hasUnsolicitedIndicator()
    {
        return hasUnsolicitedIndicator;
    }

    public TradingSessionsGroupEncoder unsolicitedIndicator(boolean value)
    {
        unsolicitedIndicator = value;
        hasUnsolicitedIndicator = true;
        return this;
    }

    public boolean unsolicitedIndicator()
    {
        return unsolicitedIndicator;
    }

    private int tradSesStatus;

    private boolean hasTradSesStatus;

    public boolean hasTradSesStatus()
    {
        return hasTradSesStatus;
    }

    public TradingSessionsGroupEncoder tradSesStatus(int value)
    {
        tradSesStatus = value;
        hasTradSesStatus = true;
        return this;
    }

    public int tradSesStatus()
    {
        return tradSesStatus;
    }

    public TradingSessionsGroupEncoder tradSesStatus(TradSesStatus value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == TradSesStatus.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: tradSesStatus Value: " + value );
            }
            if (value == TradSesStatus.NULL_VAL)
            {
                return this;
            }
        }
        return tradSesStatus(value.representation());
    }

    private int tradSesStatusRejReason;

    private boolean hasTradSesStatusRejReason;

    public boolean hasTradSesStatusRejReason()
    {
        return hasTradSesStatusRejReason;
    }

    public TradingSessionsGroupEncoder tradSesStatusRejReason(int value)
    {
        tradSesStatusRejReason = value;
        hasTradSesStatusRejReason = true;
        return this;
    }

    public int tradSesStatusRejReason()
    {
        return tradSesStatusRejReason;
    }

    public TradingSessionsGroupEncoder tradSesStatusRejReason(TradSesStatusRejReason value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == TradSesStatusRejReason.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: tradSesStatusRejReason Value: " + value );
            }
            if (value == TradSesStatusRejReason.NULL_VAL)
            {
                return this;
            }
        }
        return tradSesStatusRejReason(value.representation());
    }

    private final MutableDirectBuffer tradSesStartTime = new UnsafeBuffer();

    private int tradSesStartTimeOffset = 0;

    private int tradSesStartTimeLength = 0;

    public TradingSessionsGroupEncoder tradSesStartTime(final DirectBuffer value, final int offset, final int length)
    {
        tradSesStartTime.wrap(value);
        tradSesStartTimeOffset = offset;
        tradSesStartTimeLength = length;
        return this;
    }

    public TradingSessionsGroupEncoder tradSesStartTime(final DirectBuffer value, final int length)
    {
        return tradSesStartTime(value, 0, length);
    }

    public TradingSessionsGroupEncoder tradSesStartTime(final DirectBuffer value)
    {
        return tradSesStartTime(value, 0, value.capacity());
    }

    public TradingSessionsGroupEncoder tradSesStartTime(final byte[] value, final int offset, final int length)
    {
        tradSesStartTime.wrap(value);
        tradSesStartTimeOffset = offset;
        tradSesStartTimeLength = length;
        return this;
    }

    public TradingSessionsGroupEncoder tradSesStartTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradSesStartTime, value, offset, length);
        tradSesStartTimeOffset = offset;
        tradSesStartTimeLength = length;
        return this;
    }

    public TradingSessionsGroupEncoder tradSesStartTime(final byte[] value, final int length)
    {
        return tradSesStartTime(value, 0, length);
    }

    public TradingSessionsGroupEncoder tradSesStartTime(final byte[] value)
    {
        return tradSesStartTime(value, 0, value.length);
    }

    public boolean hasTradSesStartTime()
    {
        return tradSesStartTimeLength > 0;
    }

    public MutableDirectBuffer tradSesStartTime()
    {
        return tradSesStartTime;
    }

    public String tradSesStartTimeAsString()
    {
        return tradSesStartTime.getStringWithoutLengthAscii(tradSesStartTimeOffset, tradSesStartTimeLength);
    }

    private final MutableDirectBuffer tradSesOpenTime = new UnsafeBuffer();

    private int tradSesOpenTimeOffset = 0;

    private int tradSesOpenTimeLength = 0;

    public TradingSessionsGroupEncoder tradSesOpenTime(final DirectBuffer value, final int offset, final int length)
    {
        tradSesOpenTime.wrap(value);
        tradSesOpenTimeOffset = offset;
        tradSesOpenTimeLength = length;
        return this;
    }

    public TradingSessionsGroupEncoder tradSesOpenTime(final DirectBuffer value, final int length)
    {
        return tradSesOpenTime(value, 0, length);
    }

    public TradingSessionsGroupEncoder tradSesOpenTime(final DirectBuffer value)
    {
        return tradSesOpenTime(value, 0, value.capacity());
    }

    public TradingSessionsGroupEncoder tradSesOpenTime(final byte[] value, final int offset, final int length)
    {
        tradSesOpenTime.wrap(value);
        tradSesOpenTimeOffset = offset;
        tradSesOpenTimeLength = length;
        return this;
    }

    public TradingSessionsGroupEncoder tradSesOpenTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradSesOpenTime, value, offset, length);
        tradSesOpenTimeOffset = offset;
        tradSesOpenTimeLength = length;
        return this;
    }

    public TradingSessionsGroupEncoder tradSesOpenTime(final byte[] value, final int length)
    {
        return tradSesOpenTime(value, 0, length);
    }

    public TradingSessionsGroupEncoder tradSesOpenTime(final byte[] value)
    {
        return tradSesOpenTime(value, 0, value.length);
    }

    public boolean hasTradSesOpenTime()
    {
        return tradSesOpenTimeLength > 0;
    }

    public MutableDirectBuffer tradSesOpenTime()
    {
        return tradSesOpenTime;
    }

    public String tradSesOpenTimeAsString()
    {
        return tradSesOpenTime.getStringWithoutLengthAscii(tradSesOpenTimeOffset, tradSesOpenTimeLength);
    }

    private final MutableDirectBuffer tradSesPreCloseTime = new UnsafeBuffer();

    private int tradSesPreCloseTimeOffset = 0;

    private int tradSesPreCloseTimeLength = 0;

    public TradingSessionsGroupEncoder tradSesPreCloseTime(final DirectBuffer value, final int offset, final int length)
    {
        tradSesPreCloseTime.wrap(value);
        tradSesPreCloseTimeOffset = offset;
        tradSesPreCloseTimeLength = length;
        return this;
    }

    public TradingSessionsGroupEncoder tradSesPreCloseTime(final DirectBuffer value, final int length)
    {
        return tradSesPreCloseTime(value, 0, length);
    }

    public TradingSessionsGroupEncoder tradSesPreCloseTime(final DirectBuffer value)
    {
        return tradSesPreCloseTime(value, 0, value.capacity());
    }

    public TradingSessionsGroupEncoder tradSesPreCloseTime(final byte[] value, final int offset, final int length)
    {
        tradSesPreCloseTime.wrap(value);
        tradSesPreCloseTimeOffset = offset;
        tradSesPreCloseTimeLength = length;
        return this;
    }

    public TradingSessionsGroupEncoder tradSesPreCloseTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradSesPreCloseTime, value, offset, length);
        tradSesPreCloseTimeOffset = offset;
        tradSesPreCloseTimeLength = length;
        return this;
    }

    public TradingSessionsGroupEncoder tradSesPreCloseTime(final byte[] value, final int length)
    {
        return tradSesPreCloseTime(value, 0, length);
    }

    public TradingSessionsGroupEncoder tradSesPreCloseTime(final byte[] value)
    {
        return tradSesPreCloseTime(value, 0, value.length);
    }

    public boolean hasTradSesPreCloseTime()
    {
        return tradSesPreCloseTimeLength > 0;
    }

    public MutableDirectBuffer tradSesPreCloseTime()
    {
        return tradSesPreCloseTime;
    }

    public String tradSesPreCloseTimeAsString()
    {
        return tradSesPreCloseTime.getStringWithoutLengthAscii(tradSesPreCloseTimeOffset, tradSesPreCloseTimeLength);
    }

    private final MutableDirectBuffer tradSesCloseTime = new UnsafeBuffer();

    private int tradSesCloseTimeOffset = 0;

    private int tradSesCloseTimeLength = 0;

    public TradingSessionsGroupEncoder tradSesCloseTime(final DirectBuffer value, final int offset, final int length)
    {
        tradSesCloseTime.wrap(value);
        tradSesCloseTimeOffset = offset;
        tradSesCloseTimeLength = length;
        return this;
    }

    public TradingSessionsGroupEncoder tradSesCloseTime(final DirectBuffer value, final int length)
    {
        return tradSesCloseTime(value, 0, length);
    }

    public TradingSessionsGroupEncoder tradSesCloseTime(final DirectBuffer value)
    {
        return tradSesCloseTime(value, 0, value.capacity());
    }

    public TradingSessionsGroupEncoder tradSesCloseTime(final byte[] value, final int offset, final int length)
    {
        tradSesCloseTime.wrap(value);
        tradSesCloseTimeOffset = offset;
        tradSesCloseTimeLength = length;
        return this;
    }

    public TradingSessionsGroupEncoder tradSesCloseTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradSesCloseTime, value, offset, length);
        tradSesCloseTimeOffset = offset;
        tradSesCloseTimeLength = length;
        return this;
    }

    public TradingSessionsGroupEncoder tradSesCloseTime(final byte[] value, final int length)
    {
        return tradSesCloseTime(value, 0, length);
    }

    public TradingSessionsGroupEncoder tradSesCloseTime(final byte[] value)
    {
        return tradSesCloseTime(value, 0, value.length);
    }

    public boolean hasTradSesCloseTime()
    {
        return tradSesCloseTimeLength > 0;
    }

    public MutableDirectBuffer tradSesCloseTime()
    {
        return tradSesCloseTime;
    }

    public String tradSesCloseTimeAsString()
    {
        return tradSesCloseTime.getStringWithoutLengthAscii(tradSesCloseTimeOffset, tradSesCloseTimeLength);
    }

    private final MutableDirectBuffer tradSesEndTime = new UnsafeBuffer();

    private int tradSesEndTimeOffset = 0;

    private int tradSesEndTimeLength = 0;

    public TradingSessionsGroupEncoder tradSesEndTime(final DirectBuffer value, final int offset, final int length)
    {
        tradSesEndTime.wrap(value);
        tradSesEndTimeOffset = offset;
        tradSesEndTimeLength = length;
        return this;
    }

    public TradingSessionsGroupEncoder tradSesEndTime(final DirectBuffer value, final int length)
    {
        return tradSesEndTime(value, 0, length);
    }

    public TradingSessionsGroupEncoder tradSesEndTime(final DirectBuffer value)
    {
        return tradSesEndTime(value, 0, value.capacity());
    }

    public TradingSessionsGroupEncoder tradSesEndTime(final byte[] value, final int offset, final int length)
    {
        tradSesEndTime.wrap(value);
        tradSesEndTimeOffset = offset;
        tradSesEndTimeLength = length;
        return this;
    }

    public TradingSessionsGroupEncoder tradSesEndTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradSesEndTime, value, offset, length);
        tradSesEndTimeOffset = offset;
        tradSesEndTimeLength = length;
        return this;
    }

    public TradingSessionsGroupEncoder tradSesEndTime(final byte[] value, final int length)
    {
        return tradSesEndTime(value, 0, length);
    }

    public TradingSessionsGroupEncoder tradSesEndTime(final byte[] value)
    {
        return tradSesEndTime(value, 0, value.length);
    }

    public boolean hasTradSesEndTime()
    {
        return tradSesEndTimeLength > 0;
    }

    public MutableDirectBuffer tradSesEndTime()
    {
        return tradSesEndTime;
    }

    public String tradSesEndTimeAsString()
    {
        return tradSesEndTime.getStringWithoutLengthAscii(tradSesEndTimeOffset, tradSesEndTimeLength);
    }

    private final DecimalFloat totalVolumeTraded = new DecimalFloat();

    private boolean hasTotalVolumeTraded;

    public boolean hasTotalVolumeTraded()
    {
        return hasTotalVolumeTraded;
    }

    public TradingSessionsGroupEncoder totalVolumeTraded(DecimalFloat value)
    {
        totalVolumeTraded.set(value);
        hasTotalVolumeTraded = true;
        return this;
    }

    public TradingSessionsGroupEncoder totalVolumeTraded(long value, int scale)
    {
        totalVolumeTraded.set(value, scale);
        hasTotalVolumeTraded = true;
        return this;
    }

    public DecimalFloat totalVolumeTraded()
    {
        return totalVolumeTraded;
    }

    private final TradingSessionRulesEncoder tradingSessionRules = new TradingSessionRulesEncoder();
    public TradingSessionRulesEncoder tradingSessionRules()
    {
        return tradingSessionRules;
    }

    private final MutableDirectBuffer transactTime = new UnsafeBuffer();

    private int transactTimeOffset = 0;

    private int transactTimeLength = 0;

    public TradingSessionsGroupEncoder transactTime(final DirectBuffer value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public TradingSessionsGroupEncoder transactTime(final DirectBuffer value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public TradingSessionsGroupEncoder transactTime(final DirectBuffer value)
    {
        return transactTime(value, 0, value.capacity());
    }

    public TradingSessionsGroupEncoder transactTime(final byte[] value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public TradingSessionsGroupEncoder transactTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(transactTime, value, offset, length);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public TradingSessionsGroupEncoder transactTime(final byte[] value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public TradingSessionsGroupEncoder transactTime(final byte[] value)
    {
        return transactTime(value, 0, value.length);
    }

    public boolean hasTransactTime()
    {
        return transactTimeLength > 0;
    }

    public MutableDirectBuffer transactTime()
    {
        return transactTime;
    }

    public String transactTimeAsString()
    {
        return transactTime.getStringWithoutLengthAscii(transactTimeOffset, transactTimeLength);
    }

    private final MutableDirectBuffer text = new UnsafeBuffer();

    private int textOffset = 0;

    private int textLength = 0;

    public TradingSessionsGroupEncoder text(final DirectBuffer value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public TradingSessionsGroupEncoder text(final DirectBuffer value, final int length)
    {
        return text(value, 0, length);
    }

    public TradingSessionsGroupEncoder text(final DirectBuffer value)
    {
        return text(value, 0, value.capacity());
    }

    public TradingSessionsGroupEncoder text(final byte[] value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public TradingSessionsGroupEncoder textAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(text, value, offset, length);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public TradingSessionsGroupEncoder text(final byte[] value, final int length)
    {
        return text(value, 0, length);
    }

    public TradingSessionsGroupEncoder text(final byte[] value)
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

    public TradingSessionsGroupEncoder text(final CharSequence value)
    {
        toBytes(value, text);
        textOffset = 0;
        textLength = value.length();
        return this;
    }

    public TradingSessionsGroupEncoder text(final AsciiSequenceView value)
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

    public TradingSessionsGroupEncoder text(final char[] value)
    {
        return text(value, 0, value.length);
    }

    public TradingSessionsGroupEncoder text(final char[] value, final int length)
    {
        return text(value, 0, length);
    }

    public TradingSessionsGroupEncoder text(final char[] value, final int offset, final int length)
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

    public TradingSessionsGroupEncoder encodedTextLen(int value)
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

    public TradingSessionsGroupEncoder encodedText(byte[] value)
    {
        encodedText = value;
        hasEncodedText = true;
        return this;
    }

    public byte[] encodedText()
    {
        return encodedText;
    }

    public TradingSessionsGroupEncoder encodedTextAsCopy(final byte[] value, final int offset, final int length)
    {
        encodedText = copyInto(encodedText, value, offset, length);
        hasEncodedText = true;
        return this;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (tradingSessionIDLength > 0)
        {
            buffer.putBytes(position, tradingSessionIDHeader, 0, tradingSessionIDHeaderLength);
            position += tradingSessionIDHeaderLength;
            buffer.putBytes(position, tradingSessionID, tradingSessionIDOffset, tradingSessionIDLength);
            position += tradingSessionIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: TradingSessionID");
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

        if (hasTradSesUpdateAction)
        {
            buffer.putBytes(position, tradSesUpdateActionHeader, 0, tradSesUpdateActionHeaderLength);
            position += tradSesUpdateActionHeaderLength;
            position += buffer.putCharAscii(position, tradSesUpdateAction);
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

        if (tradingSessionDescLength > 0)
        {
            buffer.putBytes(position, tradingSessionDescHeader, 0, tradingSessionDescHeaderLength);
            position += tradingSessionDescHeaderLength;
            buffer.putBytes(position, tradingSessionDesc, tradingSessionDescOffset, tradingSessionDescLength);
            position += tradingSessionDescLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasTradSesMethod)
        {
            buffer.putBytes(position, tradSesMethodHeader, 0, tradSesMethodHeaderLength);
            position += tradSesMethodHeaderLength;
            position += buffer.putIntAscii(position, tradSesMethod);
            buffer.putSeparator(position);
            position++;
        }

        if (hasTradSesMode)
        {
            buffer.putBytes(position, tradSesModeHeader, 0, tradSesModeHeaderLength);
            position += tradSesModeHeaderLength;
            position += buffer.putIntAscii(position, tradSesMode);
            buffer.putSeparator(position);
            position++;
        }

        if (hasUnsolicitedIndicator)
        {
            buffer.putBytes(position, unsolicitedIndicatorHeader, 0, unsolicitedIndicatorHeaderLength);
            position += unsolicitedIndicatorHeaderLength;
            position += buffer.putBooleanAscii(position, unsolicitedIndicator);
            buffer.putSeparator(position);
            position++;
        }

        if (hasTradSesStatus)
        {
            buffer.putBytes(position, tradSesStatusHeader, 0, tradSesStatusHeaderLength);
            position += tradSesStatusHeaderLength;
            position += buffer.putIntAscii(position, tradSesStatus);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: TradSesStatus");
        }

        if (hasTradSesStatusRejReason)
        {
            buffer.putBytes(position, tradSesStatusRejReasonHeader, 0, tradSesStatusRejReasonHeaderLength);
            position += tradSesStatusRejReasonHeaderLength;
            position += buffer.putIntAscii(position, tradSesStatusRejReason);
            buffer.putSeparator(position);
            position++;
        }

        if (tradSesStartTimeLength > 0)
        {
            buffer.putBytes(position, tradSesStartTimeHeader, 0, tradSesStartTimeHeaderLength);
            position += tradSesStartTimeHeaderLength;
            buffer.putBytes(position, tradSesStartTime, tradSesStartTimeOffset, tradSesStartTimeLength);
            position += tradSesStartTimeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (tradSesOpenTimeLength > 0)
        {
            buffer.putBytes(position, tradSesOpenTimeHeader, 0, tradSesOpenTimeHeaderLength);
            position += tradSesOpenTimeHeaderLength;
            buffer.putBytes(position, tradSesOpenTime, tradSesOpenTimeOffset, tradSesOpenTimeLength);
            position += tradSesOpenTimeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (tradSesPreCloseTimeLength > 0)
        {
            buffer.putBytes(position, tradSesPreCloseTimeHeader, 0, tradSesPreCloseTimeHeaderLength);
            position += tradSesPreCloseTimeHeaderLength;
            buffer.putBytes(position, tradSesPreCloseTime, tradSesPreCloseTimeOffset, tradSesPreCloseTimeLength);
            position += tradSesPreCloseTimeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (tradSesCloseTimeLength > 0)
        {
            buffer.putBytes(position, tradSesCloseTimeHeader, 0, tradSesCloseTimeHeaderLength);
            position += tradSesCloseTimeHeaderLength;
            buffer.putBytes(position, tradSesCloseTime, tradSesCloseTimeOffset, tradSesCloseTimeLength);
            position += tradSesCloseTimeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (tradSesEndTimeLength > 0)
        {
            buffer.putBytes(position, tradSesEndTimeHeader, 0, tradSesEndTimeHeaderLength);
            position += tradSesEndTimeHeaderLength;
            buffer.putBytes(position, tradSesEndTime, tradSesEndTimeOffset, tradSesEndTimeLength);
            position += tradSesEndTimeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasTotalVolumeTraded)
        {
            buffer.putBytes(position, totalVolumeTradedHeader, 0, totalVolumeTradedHeaderLength);
            position += totalVolumeTradedHeaderLength;
            position += buffer.putFloatAscii(position, totalVolumeTraded);
            buffer.putSeparator(position);
            position++;
        }

            position += tradingSessionRules.encode(buffer, position);

        if (transactTimeLength > 0)
        {
            buffer.putBytes(position, transactTimeHeader, 0, transactTimeHeaderLength);
            position += transactTimeHeaderLength;
            buffer.putBytes(position, transactTime, transactTimeOffset, transactTimeLength);
            position += transactTimeLength;
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
        if (next != null)
        {
            position += next.encode(buffer, position, remainingElements - 1);
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetTradingSessionID();
        this.resetTradingSessionSubID();
        this.resetTradSesUpdateAction();
        this.resetSecurityExchange();
        this.resetMarketID();
        this.resetMarketSegmentID();
        this.resetTradingSessionDesc();
        this.resetTradSesMethod();
        this.resetTradSesMode();
        this.resetUnsolicitedIndicator();
        this.resetTradSesStatus();
        this.resetTradSesStatusRejReason();
        this.resetTradSesStartTime();
        this.resetTradSesOpenTime();
        this.resetTradSesPreCloseTime();
        this.resetTradSesCloseTime();
        this.resetTradSesEndTime();
        this.resetTotalVolumeTraded();
        this.resetTransactTime();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        tradingSessionRules.reset();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetTradingSessionID()
    {
        tradingSessionIDLength = 0;
    }

    public void resetTradingSessionSubID()
    {
        tradingSessionSubIDLength = 0;
    }

    public void resetTradSesUpdateAction()
    {
        hasTradSesUpdateAction = false;
    }

    public void resetSecurityExchange()
    {
        securityExchangeLength = 0;
    }

    public void resetMarketID()
    {
        marketIDLength = 0;
    }

    public void resetMarketSegmentID()
    {
        marketSegmentIDLength = 0;
    }

    public void resetTradingSessionDesc()
    {
        tradingSessionDescLength = 0;
    }

    public void resetTradSesMethod()
    {
        hasTradSesMethod = false;
    }

    public void resetTradSesMode()
    {
        hasTradSesMode = false;
    }

    public void resetUnsolicitedIndicator()
    {
        hasUnsolicitedIndicator = false;
    }

    public void resetTradSesStatus()
    {
        hasTradSesStatus = false;
    }

    public void resetTradSesStatusRejReason()
    {
        hasTradSesStatusRejReason = false;
    }

    public void resetTradSesStartTime()
    {
        tradSesStartTimeLength = 0;
    }

    public void resetTradSesOpenTime()
    {
        tradSesOpenTimeLength = 0;
    }

    public void resetTradSesPreCloseTime()
    {
        tradSesPreCloseTimeLength = 0;
    }

    public void resetTradSesCloseTime()
    {
        tradSesCloseTimeLength = 0;
    }

    public void resetTradSesEndTime()
    {
        tradSesEndTimeLength = 0;
    }

    public void resetTotalVolumeTraded()
    {
        hasTotalVolumeTraded = false;
    }

    public void resetTransactTime()
    {
        transactTimeLength = 0;
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
        builder.append("\"MessageName\": \"TradingSessionsGroup\",\n");
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

        if (hasTradSesUpdateAction())
        {
            indent(builder, level);
            builder.append("\"TradSesUpdateAction\": \"");
            builder.append(tradSesUpdateAction);
            builder.append("\",\n");
        }

        if (hasSecurityExchange())
        {
            indent(builder, level);
            builder.append("\"SecurityExchange\": \"");
            appendBuffer(builder, securityExchange, securityExchangeOffset, securityExchangeLength);
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

        if (hasTradingSessionDesc())
        {
            indent(builder, level);
            builder.append("\"TradingSessionDesc\": \"");
            appendBuffer(builder, tradingSessionDesc, tradingSessionDescOffset, tradingSessionDescLength);
            builder.append("\",\n");
        }

        if (hasTradSesMethod())
        {
            indent(builder, level);
            builder.append("\"TradSesMethod\": \"");
            builder.append(tradSesMethod);
            builder.append("\",\n");
        }

        if (hasTradSesMode())
        {
            indent(builder, level);
            builder.append("\"TradSesMode\": \"");
            builder.append(tradSesMode);
            builder.append("\",\n");
        }

        if (hasUnsolicitedIndicator())
        {
            indent(builder, level);
            builder.append("\"UnsolicitedIndicator\": \"");
            builder.append(unsolicitedIndicator);
            builder.append("\",\n");
        }

        if (hasTradSesStatus())
        {
            indent(builder, level);
            builder.append("\"TradSesStatus\": \"");
            builder.append(tradSesStatus);
            builder.append("\",\n");
        }

        if (hasTradSesStatusRejReason())
        {
            indent(builder, level);
            builder.append("\"TradSesStatusRejReason\": \"");
            builder.append(tradSesStatusRejReason);
            builder.append("\",\n");
        }

        if (hasTradSesStartTime())
        {
            indent(builder, level);
            builder.append("\"TradSesStartTime\": \"");
            appendBuffer(builder, tradSesStartTime, tradSesStartTimeOffset, tradSesStartTimeLength);
            builder.append("\",\n");
        }

        if (hasTradSesOpenTime())
        {
            indent(builder, level);
            builder.append("\"TradSesOpenTime\": \"");
            appendBuffer(builder, tradSesOpenTime, tradSesOpenTimeOffset, tradSesOpenTimeLength);
            builder.append("\",\n");
        }

        if (hasTradSesPreCloseTime())
        {
            indent(builder, level);
            builder.append("\"TradSesPreCloseTime\": \"");
            appendBuffer(builder, tradSesPreCloseTime, tradSesPreCloseTimeOffset, tradSesPreCloseTimeLength);
            builder.append("\",\n");
        }

        if (hasTradSesCloseTime())
        {
            indent(builder, level);
            builder.append("\"TradSesCloseTime\": \"");
            appendBuffer(builder, tradSesCloseTime, tradSesCloseTimeOffset, tradSesCloseTimeLength);
            builder.append("\",\n");
        }

        if (hasTradSesEndTime())
        {
            indent(builder, level);
            builder.append("\"TradSesEndTime\": \"");
            appendBuffer(builder, tradSesEndTime, tradSesEndTimeOffset, tradSesEndTimeLength);
            builder.append("\",\n");
        }

        if (hasTotalVolumeTraded())
        {
            indent(builder, level);
            builder.append("\"TotalVolumeTraded\": \"");
            totalVolumeTraded.appendTo(builder);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"TradingSessionRules\": ");
    tradingSessionRules.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasTransactTime())
        {
            indent(builder, level);
            builder.append("\"TransactTime\": \"");
            appendBuffer(builder, transactTime, transactTimeOffset, transactTimeLength);
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
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public TradingSessionsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((TradingSessionsGroupEncoder)encoder);
    }

    public TradingSessionsGroupEncoder copyTo(final TradingSessionsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasTradingSessionID())
        {
            encoder.tradingSessionIDAsCopy(tradingSessionID.byteArray(), 0, tradingSessionIDLength);
        }

        if (hasTradingSessionSubID())
        {
            encoder.tradingSessionSubIDAsCopy(tradingSessionSubID.byteArray(), 0, tradingSessionSubIDLength);
        }

        if (hasTradSesUpdateAction())
        {
            encoder.tradSesUpdateAction(this.tradSesUpdateAction());
        }

        if (hasSecurityExchange())
        {
            encoder.securityExchangeAsCopy(securityExchange.byteArray(), 0, securityExchangeLength);
        }

        if (hasMarketID())
        {
            encoder.marketIDAsCopy(marketID.byteArray(), 0, marketIDLength);
        }

        if (hasMarketSegmentID())
        {
            encoder.marketSegmentIDAsCopy(marketSegmentID.byteArray(), 0, marketSegmentIDLength);
        }

        if (hasTradingSessionDesc())
        {
            encoder.tradingSessionDescAsCopy(tradingSessionDesc.byteArray(), 0, tradingSessionDescLength);
        }

        if (hasTradSesMethod())
        {
            encoder.tradSesMethod(this.tradSesMethod());
        }

        if (hasTradSesMode())
        {
            encoder.tradSesMode(this.tradSesMode());
        }

        if (hasUnsolicitedIndicator())
        {
            encoder.unsolicitedIndicator(this.unsolicitedIndicator());
        }

        if (hasTradSesStatus())
        {
            encoder.tradSesStatus(this.tradSesStatus());
        }

        if (hasTradSesStatusRejReason())
        {
            encoder.tradSesStatusRejReason(this.tradSesStatusRejReason());
        }

        if (hasTradSesStartTime())
        {
            encoder.tradSesStartTimeAsCopy(tradSesStartTime.byteArray(), 0, tradSesStartTimeLength);
        }

        if (hasTradSesOpenTime())
        {
            encoder.tradSesOpenTimeAsCopy(tradSesOpenTime.byteArray(), 0, tradSesOpenTimeLength);
        }

        if (hasTradSesPreCloseTime())
        {
            encoder.tradSesPreCloseTimeAsCopy(tradSesPreCloseTime.byteArray(), 0, tradSesPreCloseTimeLength);
        }

        if (hasTradSesCloseTime())
        {
            encoder.tradSesCloseTimeAsCopy(tradSesCloseTime.byteArray(), 0, tradSesCloseTimeLength);
        }

        if (hasTradSesEndTime())
        {
            encoder.tradSesEndTimeAsCopy(tradSesEndTime.byteArray(), 0, tradSesEndTimeLength);
        }

        if (hasTotalVolumeTraded())
        {
            encoder.totalVolumeTraded(this.totalVolumeTraded());
        }


        tradingSessionRules.copyTo(encoder.tradingSessionRules());
        if (hasTransactTime())
        {
            encoder.transactTimeAsCopy(transactTime.byteArray(), 0, transactTimeLength);
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
        return encoder;
    }

}
    private int noTradingSessionsGroupCounter;

    private boolean hasNoTradingSessionsGroupCounter;

    public boolean hasNoTradingSessionsGroupCounter()
    {
        return hasNoTradingSessionsGroupCounter;
    }

    public TrdSessLstGrpEncoder noTradingSessionsGroupCounter(int value)
    {
        noTradingSessionsGroupCounter = value;
        hasNoTradingSessionsGroupCounter = true;
        return this;
    }

    public int noTradingSessionsGroupCounter()
    {
        return noTradingSessionsGroupCounter;
    }


    private TradingSessionsGroupEncoder tradingSessionsGroup = null;

    public TradingSessionsGroupEncoder tradingSessionsGroup(final int numberOfElements)
    {
        hasNoTradingSessionsGroupCounter = true;
        noTradingSessionsGroupCounter = numberOfElements;
        if (tradingSessionsGroup == null)
        {
            tradingSessionsGroup = new TradingSessionsGroupEncoder();
        }
        return tradingSessionsGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoTradingSessionsGroupCounter)
        {
            buffer.putBytes(position, noTradingSessionsGroupCounterHeader, 0, noTradingSessionsGroupCounterHeaderLength);
            position += noTradingSessionsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noTradingSessionsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (tradingSessionsGroup != null)
        {
            position += tradingSessionsGroup.encode(buffer, position, noTradingSessionsGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetTradingSessionsGroup();
    }

    public void resetTradingSessionsGroup()
    {
        if (tradingSessionsGroup != null)
        {
            tradingSessionsGroup.reset();
        }
        noTradingSessionsGroupCounter = 0;
        hasNoTradingSessionsGroupCounter = false;
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
        builder.append("\"MessageName\": \"TrdSessLstGrp\",\n");
        if (hasNoTradingSessionsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"TradingSessionsGroup\": [\n");
            final int noTradingSessionsGroupCounter = this.noTradingSessionsGroupCounter;
            TradingSessionsGroupEncoder tradingSessionsGroup = this.tradingSessionsGroup;
            for (int i = 0; i < noTradingSessionsGroupCounter; i++)
            {
                indent(builder, level);
                tradingSessionsGroup.appendTo(builder, level + 1);
                if (i < (noTradingSessionsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                tradingSessionsGroup = tradingSessionsGroup.next();
            }
            indent(builder, level);
            builder.append("],\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public TrdSessLstGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((TrdSessLstGrpEncoder)encoder);
    }

    public TrdSessLstGrpEncoder copyTo(final TrdSessLstGrpEncoder encoder)
    {
        encoder.reset();
        if (hasNoTradingSessionsGroupCounter)
        {
            final int size = this.noTradingSessionsGroupCounter;
            TradingSessionsGroupEncoder tradingSessionsGroup = this.tradingSessionsGroup;
            TradingSessionsGroupEncoder tradingSessionsGroupEncoder = encoder.tradingSessionsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (tradingSessionsGroup != null)
                {
                    tradingSessionsGroup.copyTo(tradingSessionsGroupEncoder);
                    tradingSessionsGroup = tradingSessionsGroup.next();
                    tradingSessionsGroupEncoder = tradingSessionsGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
