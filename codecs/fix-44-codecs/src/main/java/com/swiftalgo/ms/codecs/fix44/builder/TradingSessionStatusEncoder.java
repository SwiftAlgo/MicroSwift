/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44.builder;

import org.agrona.MutableDirectBuffer;
import org.agrona.AsciiSequenceView;
import static uk.co.real_logic.artio.dictionary.generation.CodecUtil.*;
import static uk.co.real_logic.artio.dictionary.SessionConstants.*;
import uk.co.real_logic.artio.builder.Encoder;
import com.swiftalgo.ms.codecs.fix44.builder.HeaderEncoder;
import com.swiftalgo.ms.codecs.fix44.builder.TrailerEncoder;
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


public class TradingSessionStatusEncoder implements Encoder
{
    public long messageType()
    {
        return 104L;
    }

    public TradingSessionStatusEncoder()
    {
        header.msgType("h");
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

    private static final int tradSesReqIDHeaderLength = 4;
    private static final byte[] tradSesReqIDHeader = new byte[] {51, 51, 53, (byte) '='};

    private static final int tradingSessionIDHeaderLength = 4;
    private static final byte[] tradingSessionIDHeader = new byte[] {51, 51, 54, (byte) '='};

    private static final int tradingSessionSubIDHeaderLength = 4;
    private static final byte[] tradingSessionSubIDHeader = new byte[] {54, 50, 53, (byte) '='};

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

    private static final int textHeaderLength = 3;
    private static final byte[] textHeader = new byte[] {53, 56, (byte) '='};

    private static final int encodedTextLenHeaderLength = 4;
    private static final byte[] encodedTextLenHeader = new byte[] {51, 53, 52, (byte) '='};

    private static final int encodedTextHeaderLength = 4;
    private static final byte[] encodedTextHeader = new byte[] {51, 53, 53, (byte) '='};

    private final MutableDirectBuffer tradSesReqID = new UnsafeBuffer();

    private int tradSesReqIDOffset = 0;

    private int tradSesReqIDLength = 0;

    public TradingSessionStatusEncoder tradSesReqID(final DirectBuffer value, final int offset, final int length)
    {
        tradSesReqID.wrap(value);
        tradSesReqIDOffset = offset;
        tradSesReqIDLength = length;
        return this;
    }

    public TradingSessionStatusEncoder tradSesReqID(final DirectBuffer value, final int length)
    {
        return tradSesReqID(value, 0, length);
    }

    public TradingSessionStatusEncoder tradSesReqID(final DirectBuffer value)
    {
        return tradSesReqID(value, 0, value.capacity());
    }

    public TradingSessionStatusEncoder tradSesReqID(final byte[] value, final int offset, final int length)
    {
        tradSesReqID.wrap(value);
        tradSesReqIDOffset = offset;
        tradSesReqIDLength = length;
        return this;
    }

    public TradingSessionStatusEncoder tradSesReqIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradSesReqID, value, offset, length);
        tradSesReqIDOffset = offset;
        tradSesReqIDLength = length;
        return this;
    }

    public TradingSessionStatusEncoder tradSesReqID(final byte[] value, final int length)
    {
        return tradSesReqID(value, 0, length);
    }

    public TradingSessionStatusEncoder tradSesReqID(final byte[] value)
    {
        return tradSesReqID(value, 0, value.length);
    }

    public boolean hasTradSesReqID()
    {
        return tradSesReqIDLength > 0;
    }

    public MutableDirectBuffer tradSesReqID()
    {
        return tradSesReqID;
    }

    public String tradSesReqIDAsString()
    {
        return tradSesReqID.getStringWithoutLengthAscii(tradSesReqIDOffset, tradSesReqIDLength);
    }

    public TradingSessionStatusEncoder tradSesReqID(final CharSequence value)
    {
        toBytes(value, tradSesReqID);
        tradSesReqIDOffset = 0;
        tradSesReqIDLength = value.length();
        return this;
    }

    public TradingSessionStatusEncoder tradSesReqID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            tradSesReqID.wrap(buffer);
            tradSesReqIDOffset = value.offset();
            tradSesReqIDLength = value.length();
        }
        return this;
    }

    public TradingSessionStatusEncoder tradSesReqID(final char[] value)
    {
        return tradSesReqID(value, 0, value.length);
    }

    public TradingSessionStatusEncoder tradSesReqID(final char[] value, final int length)
    {
        return tradSesReqID(value, 0, length);
    }

    public TradingSessionStatusEncoder tradSesReqID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradSesReqID, offset, length);
        tradSesReqIDOffset = 0;
        tradSesReqIDLength = length;
        return this;
    }

    private final MutableDirectBuffer tradingSessionID = new UnsafeBuffer();

    private int tradingSessionIDOffset = 0;

    private int tradingSessionIDLength = 0;

    public TradingSessionStatusEncoder tradingSessionID(final DirectBuffer value, final int offset, final int length)
    {
        tradingSessionID.wrap(value);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public TradingSessionStatusEncoder tradingSessionID(final DirectBuffer value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public TradingSessionStatusEncoder tradingSessionID(final DirectBuffer value)
    {
        return tradingSessionID(value, 0, value.capacity());
    }

    public TradingSessionStatusEncoder tradingSessionID(final byte[] value, final int offset, final int length)
    {
        tradingSessionID.wrap(value);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public TradingSessionStatusEncoder tradingSessionIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradingSessionID, value, offset, length);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public TradingSessionStatusEncoder tradingSessionID(final byte[] value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public TradingSessionStatusEncoder tradingSessionID(final byte[] value)
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

    public TradingSessionStatusEncoder tradingSessionID(final CharSequence value)
    {
        toBytes(value, tradingSessionID);
        tradingSessionIDOffset = 0;
        tradingSessionIDLength = value.length();
        return this;
    }

    public TradingSessionStatusEncoder tradingSessionID(final AsciiSequenceView value)
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

    public TradingSessionStatusEncoder tradingSessionID(final char[] value)
    {
        return tradingSessionID(value, 0, value.length);
    }

    public TradingSessionStatusEncoder tradingSessionID(final char[] value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public TradingSessionStatusEncoder tradingSessionID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradingSessionID, offset, length);
        tradingSessionIDOffset = 0;
        tradingSessionIDLength = length;
        return this;
    }

    private final MutableDirectBuffer tradingSessionSubID = new UnsafeBuffer();

    private int tradingSessionSubIDOffset = 0;

    private int tradingSessionSubIDLength = 0;

    public TradingSessionStatusEncoder tradingSessionSubID(final DirectBuffer value, final int offset, final int length)
    {
        tradingSessionSubID.wrap(value);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public TradingSessionStatusEncoder tradingSessionSubID(final DirectBuffer value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public TradingSessionStatusEncoder tradingSessionSubID(final DirectBuffer value)
    {
        return tradingSessionSubID(value, 0, value.capacity());
    }

    public TradingSessionStatusEncoder tradingSessionSubID(final byte[] value, final int offset, final int length)
    {
        tradingSessionSubID.wrap(value);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public TradingSessionStatusEncoder tradingSessionSubIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradingSessionSubID, value, offset, length);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public TradingSessionStatusEncoder tradingSessionSubID(final byte[] value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public TradingSessionStatusEncoder tradingSessionSubID(final byte[] value)
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

    public TradingSessionStatusEncoder tradingSessionSubID(final CharSequence value)
    {
        toBytes(value, tradingSessionSubID);
        tradingSessionSubIDOffset = 0;
        tradingSessionSubIDLength = value.length();
        return this;
    }

    public TradingSessionStatusEncoder tradingSessionSubID(final AsciiSequenceView value)
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

    public TradingSessionStatusEncoder tradingSessionSubID(final char[] value)
    {
        return tradingSessionSubID(value, 0, value.length);
    }

    public TradingSessionStatusEncoder tradingSessionSubID(final char[] value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public TradingSessionStatusEncoder tradingSessionSubID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradingSessionSubID, offset, length);
        tradingSessionSubIDOffset = 0;
        tradingSessionSubIDLength = length;
        return this;
    }

    private int tradSesMethod;

    private boolean hasTradSesMethod;

    public boolean hasTradSesMethod()
    {
        return hasTradSesMethod;
    }

    public TradingSessionStatusEncoder tradSesMethod(int value)
    {
        tradSesMethod = value;
        hasTradSesMethod = true;
        return this;
    }

    public int tradSesMethod()
    {
        return tradSesMethod;
    }

    public TradingSessionStatusEncoder tradSesMethod(TradSesMethod value)
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

    public TradingSessionStatusEncoder tradSesMode(int value)
    {
        tradSesMode = value;
        hasTradSesMode = true;
        return this;
    }

    public int tradSesMode()
    {
        return tradSesMode;
    }

    public TradingSessionStatusEncoder tradSesMode(TradSesMode value)
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

    public TradingSessionStatusEncoder unsolicitedIndicator(boolean value)
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

    public TradingSessionStatusEncoder tradSesStatus(int value)
    {
        tradSesStatus = value;
        hasTradSesStatus = true;
        return this;
    }

    public int tradSesStatus()
    {
        return tradSesStatus;
    }

    public TradingSessionStatusEncoder tradSesStatus(TradSesStatus value)
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

    public TradingSessionStatusEncoder tradSesStatusRejReason(int value)
    {
        tradSesStatusRejReason = value;
        hasTradSesStatusRejReason = true;
        return this;
    }

    public int tradSesStatusRejReason()
    {
        return tradSesStatusRejReason;
    }

    public TradingSessionStatusEncoder tradSesStatusRejReason(TradSesStatusRejReason value)
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

    public TradingSessionStatusEncoder tradSesStartTime(final DirectBuffer value, final int offset, final int length)
    {
        tradSesStartTime.wrap(value);
        tradSesStartTimeOffset = offset;
        tradSesStartTimeLength = length;
        return this;
    }

    public TradingSessionStatusEncoder tradSesStartTime(final DirectBuffer value, final int length)
    {
        return tradSesStartTime(value, 0, length);
    }

    public TradingSessionStatusEncoder tradSesStartTime(final DirectBuffer value)
    {
        return tradSesStartTime(value, 0, value.capacity());
    }

    public TradingSessionStatusEncoder tradSesStartTime(final byte[] value, final int offset, final int length)
    {
        tradSesStartTime.wrap(value);
        tradSesStartTimeOffset = offset;
        tradSesStartTimeLength = length;
        return this;
    }

    public TradingSessionStatusEncoder tradSesStartTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradSesStartTime, value, offset, length);
        tradSesStartTimeOffset = offset;
        tradSesStartTimeLength = length;
        return this;
    }

    public TradingSessionStatusEncoder tradSesStartTime(final byte[] value, final int length)
    {
        return tradSesStartTime(value, 0, length);
    }

    public TradingSessionStatusEncoder tradSesStartTime(final byte[] value)
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

    public TradingSessionStatusEncoder tradSesOpenTime(final DirectBuffer value, final int offset, final int length)
    {
        tradSesOpenTime.wrap(value);
        tradSesOpenTimeOffset = offset;
        tradSesOpenTimeLength = length;
        return this;
    }

    public TradingSessionStatusEncoder tradSesOpenTime(final DirectBuffer value, final int length)
    {
        return tradSesOpenTime(value, 0, length);
    }

    public TradingSessionStatusEncoder tradSesOpenTime(final DirectBuffer value)
    {
        return tradSesOpenTime(value, 0, value.capacity());
    }

    public TradingSessionStatusEncoder tradSesOpenTime(final byte[] value, final int offset, final int length)
    {
        tradSesOpenTime.wrap(value);
        tradSesOpenTimeOffset = offset;
        tradSesOpenTimeLength = length;
        return this;
    }

    public TradingSessionStatusEncoder tradSesOpenTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradSesOpenTime, value, offset, length);
        tradSesOpenTimeOffset = offset;
        tradSesOpenTimeLength = length;
        return this;
    }

    public TradingSessionStatusEncoder tradSesOpenTime(final byte[] value, final int length)
    {
        return tradSesOpenTime(value, 0, length);
    }

    public TradingSessionStatusEncoder tradSesOpenTime(final byte[] value)
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

    public TradingSessionStatusEncoder tradSesPreCloseTime(final DirectBuffer value, final int offset, final int length)
    {
        tradSesPreCloseTime.wrap(value);
        tradSesPreCloseTimeOffset = offset;
        tradSesPreCloseTimeLength = length;
        return this;
    }

    public TradingSessionStatusEncoder tradSesPreCloseTime(final DirectBuffer value, final int length)
    {
        return tradSesPreCloseTime(value, 0, length);
    }

    public TradingSessionStatusEncoder tradSesPreCloseTime(final DirectBuffer value)
    {
        return tradSesPreCloseTime(value, 0, value.capacity());
    }

    public TradingSessionStatusEncoder tradSesPreCloseTime(final byte[] value, final int offset, final int length)
    {
        tradSesPreCloseTime.wrap(value);
        tradSesPreCloseTimeOffset = offset;
        tradSesPreCloseTimeLength = length;
        return this;
    }

    public TradingSessionStatusEncoder tradSesPreCloseTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradSesPreCloseTime, value, offset, length);
        tradSesPreCloseTimeOffset = offset;
        tradSesPreCloseTimeLength = length;
        return this;
    }

    public TradingSessionStatusEncoder tradSesPreCloseTime(final byte[] value, final int length)
    {
        return tradSesPreCloseTime(value, 0, length);
    }

    public TradingSessionStatusEncoder tradSesPreCloseTime(final byte[] value)
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

    public TradingSessionStatusEncoder tradSesCloseTime(final DirectBuffer value, final int offset, final int length)
    {
        tradSesCloseTime.wrap(value);
        tradSesCloseTimeOffset = offset;
        tradSesCloseTimeLength = length;
        return this;
    }

    public TradingSessionStatusEncoder tradSesCloseTime(final DirectBuffer value, final int length)
    {
        return tradSesCloseTime(value, 0, length);
    }

    public TradingSessionStatusEncoder tradSesCloseTime(final DirectBuffer value)
    {
        return tradSesCloseTime(value, 0, value.capacity());
    }

    public TradingSessionStatusEncoder tradSesCloseTime(final byte[] value, final int offset, final int length)
    {
        tradSesCloseTime.wrap(value);
        tradSesCloseTimeOffset = offset;
        tradSesCloseTimeLength = length;
        return this;
    }

    public TradingSessionStatusEncoder tradSesCloseTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradSesCloseTime, value, offset, length);
        tradSesCloseTimeOffset = offset;
        tradSesCloseTimeLength = length;
        return this;
    }

    public TradingSessionStatusEncoder tradSesCloseTime(final byte[] value, final int length)
    {
        return tradSesCloseTime(value, 0, length);
    }

    public TradingSessionStatusEncoder tradSesCloseTime(final byte[] value)
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

    public TradingSessionStatusEncoder tradSesEndTime(final DirectBuffer value, final int offset, final int length)
    {
        tradSesEndTime.wrap(value);
        tradSesEndTimeOffset = offset;
        tradSesEndTimeLength = length;
        return this;
    }

    public TradingSessionStatusEncoder tradSesEndTime(final DirectBuffer value, final int length)
    {
        return tradSesEndTime(value, 0, length);
    }

    public TradingSessionStatusEncoder tradSesEndTime(final DirectBuffer value)
    {
        return tradSesEndTime(value, 0, value.capacity());
    }

    public TradingSessionStatusEncoder tradSesEndTime(final byte[] value, final int offset, final int length)
    {
        tradSesEndTime.wrap(value);
        tradSesEndTimeOffset = offset;
        tradSesEndTimeLength = length;
        return this;
    }

    public TradingSessionStatusEncoder tradSesEndTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradSesEndTime, value, offset, length);
        tradSesEndTimeOffset = offset;
        tradSesEndTimeLength = length;
        return this;
    }

    public TradingSessionStatusEncoder tradSesEndTime(final byte[] value, final int length)
    {
        return tradSesEndTime(value, 0, length);
    }

    public TradingSessionStatusEncoder tradSesEndTime(final byte[] value)
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

    public TradingSessionStatusEncoder totalVolumeTraded(DecimalFloat value)
    {
        totalVolumeTraded.set(value);
        hasTotalVolumeTraded = true;
        return this;
    }

    public TradingSessionStatusEncoder totalVolumeTraded(long value, int scale)
    {
        totalVolumeTraded.set(value, scale);
        hasTotalVolumeTraded = true;
        return this;
    }

    public DecimalFloat totalVolumeTraded()
    {
        return totalVolumeTraded;
    }

    private final MutableDirectBuffer text = new UnsafeBuffer();

    private int textOffset = 0;

    private int textLength = 0;

    public TradingSessionStatusEncoder text(final DirectBuffer value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public TradingSessionStatusEncoder text(final DirectBuffer value, final int length)
    {
        return text(value, 0, length);
    }

    public TradingSessionStatusEncoder text(final DirectBuffer value)
    {
        return text(value, 0, value.capacity());
    }

    public TradingSessionStatusEncoder text(final byte[] value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public TradingSessionStatusEncoder textAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(text, value, offset, length);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public TradingSessionStatusEncoder text(final byte[] value, final int length)
    {
        return text(value, 0, length);
    }

    public TradingSessionStatusEncoder text(final byte[] value)
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

    public TradingSessionStatusEncoder text(final CharSequence value)
    {
        toBytes(value, text);
        textOffset = 0;
        textLength = value.length();
        return this;
    }

    public TradingSessionStatusEncoder text(final AsciiSequenceView value)
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

    public TradingSessionStatusEncoder text(final char[] value)
    {
        return text(value, 0, value.length);
    }

    public TradingSessionStatusEncoder text(final char[] value, final int length)
    {
        return text(value, 0, length);
    }

    public TradingSessionStatusEncoder text(final char[] value, final int offset, final int length)
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

    public TradingSessionStatusEncoder encodedTextLen(int value)
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

    public TradingSessionStatusEncoder encodedText(byte[] value)
    {
        encodedText = value;
        hasEncodedText = true;
        return this;
    }

    public byte[] encodedText()
    {
        return encodedText;
    }

    public TradingSessionStatusEncoder encodedTextAsCopy(final byte[] value, final int offset, final int length)
    {
        encodedText = copyInto(encodedText, value, offset, length);
        hasEncodedText = true;
        return this;
    }

    public long encode(final MutableAsciiBuffer buffer, final int offset)
    {
        final long startMessageResult = header.startMessage(buffer, offset);
        final int bodyStart = Encoder.offset(startMessageResult);
        int position = bodyStart + Encoder.length(startMessageResult);

        if (tradSesReqIDLength > 0)
        {
            buffer.putBytes(position, tradSesReqIDHeader, 0, tradSesReqIDHeaderLength);
            position += tradSesReqIDHeaderLength;
            buffer.putBytes(position, tradSesReqID, tradSesReqIDOffset, tradSesReqIDLength);
            position += tradSesReqIDLength;
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
        this.resetTradSesReqID();
        this.resetTradingSessionID();
        this.resetTradingSessionSubID();
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
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
    }

    public void resetTradSesReqID()
    {
        tradSesReqIDLength = 0;
    }

    public void resetTradingSessionID()
    {
        tradingSessionIDLength = 0;
    }

    public void resetTradingSessionSubID()
    {
        tradingSessionSubIDLength = 0;
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
        builder.append("\"MessageName\": \"TradingSessionStatus\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasTradSesReqID())
        {
            indent(builder, level);
            builder.append("\"TradSesReqID\": \"");
            appendBuffer(builder, tradSesReqID, tradSesReqIDOffset, tradSesReqIDLength);
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
    public TradingSessionStatusEncoder copyTo(final Encoder encoder)
    {
        return copyTo((TradingSessionStatusEncoder)encoder);
    }

    public TradingSessionStatusEncoder copyTo(final TradingSessionStatusEncoder encoder)
    {
        encoder.reset();
        if (hasTradSesReqID())
        {
            encoder.tradSesReqIDAsCopy(tradSesReqID.byteArray(), 0, tradSesReqIDLength);
        }

        if (hasTradingSessionID())
        {
            encoder.tradingSessionIDAsCopy(tradingSessionID.byteArray(), 0, tradingSessionIDLength);
        }

        if (hasTradingSessionSubID())
        {
            encoder.tradingSessionSubIDAsCopy(tradingSessionSubID.byteArray(), 0, tradingSessionSubIDLength);
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
