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


public class SettlObligationInstructionsEncoder
{
    private static final int noSettlObligGroupCounterHeaderLength = 5;
    private static final byte[] noSettlObligGroupCounterHeader = new byte[] {49, 49, 54, 53, (byte) '='};



public static class SettlObligGroupEncoder
{
    private SettlObligGroupEncoder next = null;

    public SettlObligGroupEncoder next()
    {
        if (next == null)
        {
            next = new SettlObligGroupEncoder();
        }
        return next;
    }

    private static final int netGrossIndHeaderLength = 4;
    private static final byte[] netGrossIndHeader = new byte[] {52, 51, 48, (byte) '='};

    private static final int settlObligIDHeaderLength = 5;
    private static final byte[] settlObligIDHeader = new byte[] {49, 49, 54, 49, (byte) '='};

    private static final int settlObligTransTypeHeaderLength = 5;
    private static final byte[] settlObligTransTypeHeader = new byte[] {49, 49, 54, 50, (byte) '='};

    private static final int settlObligRefIDHeaderLength = 5;
    private static final byte[] settlObligRefIDHeader = new byte[] {49, 49, 54, 51, (byte) '='};

    private static final int ccyAmtHeaderLength = 5;
    private static final byte[] ccyAmtHeader = new byte[] {49, 49, 53, 55, (byte) '='};

    private static final int settlCurrAmtHeaderLength = 4;
    private static final byte[] settlCurrAmtHeader = new byte[] {49, 49, 57, (byte) '='};

    private static final int currencyHeaderLength = 3;
    private static final byte[] currencyHeader = new byte[] {49, 53, (byte) '='};

    private static final int settlCurrencyHeaderLength = 4;
    private static final byte[] settlCurrencyHeader = new byte[] {49, 50, 48, (byte) '='};

    private static final int settlCurrFxRateHeaderLength = 4;
    private static final byte[] settlCurrFxRateHeader = new byte[] {49, 53, 53, (byte) '='};

    private static final int settlDateHeaderLength = 3;
    private static final byte[] settlDateHeader = new byte[] {54, 52, (byte) '='};

    private static final int effectiveTimeHeaderLength = 4;
    private static final byte[] effectiveTimeHeader = new byte[] {49, 54, 56, (byte) '='};

    private static final int expireTimeHeaderLength = 4;
    private static final byte[] expireTimeHeader = new byte[] {49, 50, 54, (byte) '='};

    private static final int lastUpdateTimeHeaderLength = 4;
    private static final byte[] lastUpdateTimeHeader = new byte[] {55, 55, 57, (byte) '='};

    private int netGrossInd;

    private boolean hasNetGrossInd;

    public boolean hasNetGrossInd()
    {
        return hasNetGrossInd;
    }

    public SettlObligGroupEncoder netGrossInd(int value)
    {
        netGrossInd = value;
        hasNetGrossInd = true;
        return this;
    }

    public int netGrossInd()
    {
        return netGrossInd;
    }

    public SettlObligGroupEncoder netGrossInd(NetGrossInd value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == NetGrossInd.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: netGrossInd Value: " + value );
            }
            if (value == NetGrossInd.NULL_VAL)
            {
                return this;
            }
        }
        return netGrossInd(value.representation());
    }

    private final MutableDirectBuffer settlObligID = new UnsafeBuffer();

    private int settlObligIDOffset = 0;

    private int settlObligIDLength = 0;

    public SettlObligGroupEncoder settlObligID(final DirectBuffer value, final int offset, final int length)
    {
        settlObligID.wrap(value);
        settlObligIDOffset = offset;
        settlObligIDLength = length;
        return this;
    }

    public SettlObligGroupEncoder settlObligID(final DirectBuffer value, final int length)
    {
        return settlObligID(value, 0, length);
    }

    public SettlObligGroupEncoder settlObligID(final DirectBuffer value)
    {
        return settlObligID(value, 0, value.capacity());
    }

    public SettlObligGroupEncoder settlObligID(final byte[] value, final int offset, final int length)
    {
        settlObligID.wrap(value);
        settlObligIDOffset = offset;
        settlObligIDLength = length;
        return this;
    }

    public SettlObligGroupEncoder settlObligIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlObligID, value, offset, length);
        settlObligIDOffset = offset;
        settlObligIDLength = length;
        return this;
    }

    public SettlObligGroupEncoder settlObligID(final byte[] value, final int length)
    {
        return settlObligID(value, 0, length);
    }

    public SettlObligGroupEncoder settlObligID(final byte[] value)
    {
        return settlObligID(value, 0, value.length);
    }

    public boolean hasSettlObligID()
    {
        return settlObligIDLength > 0;
    }

    public MutableDirectBuffer settlObligID()
    {
        return settlObligID;
    }

    public String settlObligIDAsString()
    {
        return settlObligID.getStringWithoutLengthAscii(settlObligIDOffset, settlObligIDLength);
    }

    public SettlObligGroupEncoder settlObligID(final CharSequence value)
    {
        toBytes(value, settlObligID);
        settlObligIDOffset = 0;
        settlObligIDLength = value.length();
        return this;
    }

    public SettlObligGroupEncoder settlObligID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            settlObligID.wrap(buffer);
            settlObligIDOffset = value.offset();
            settlObligIDLength = value.length();
        }
        return this;
    }

    public SettlObligGroupEncoder settlObligID(final char[] value)
    {
        return settlObligID(value, 0, value.length);
    }

    public SettlObligGroupEncoder settlObligID(final char[] value, final int length)
    {
        return settlObligID(value, 0, length);
    }

    public SettlObligGroupEncoder settlObligID(final char[] value, final int offset, final int length)
    {
        toBytes(value, settlObligID, offset, length);
        settlObligIDOffset = 0;
        settlObligIDLength = length;
        return this;
    }

    private char settlObligTransType;

    private boolean hasSettlObligTransType;

    public boolean hasSettlObligTransType()
    {
        return hasSettlObligTransType;
    }

    public SettlObligGroupEncoder settlObligTransType(char value)
    {
        settlObligTransType = value;
        hasSettlObligTransType = true;
        return this;
    }

    public char settlObligTransType()
    {
        return settlObligTransType;
    }

    public SettlObligGroupEncoder settlObligTransType(SettlObligTransType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == SettlObligTransType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: settlObligTransType Value: " + value );
            }
            if (value == SettlObligTransType.NULL_VAL)
            {
                return this;
            }
        }
        return settlObligTransType(value.representation());
    }

    private final MutableDirectBuffer settlObligRefID = new UnsafeBuffer();

    private int settlObligRefIDOffset = 0;

    private int settlObligRefIDLength = 0;

    public SettlObligGroupEncoder settlObligRefID(final DirectBuffer value, final int offset, final int length)
    {
        settlObligRefID.wrap(value);
        settlObligRefIDOffset = offset;
        settlObligRefIDLength = length;
        return this;
    }

    public SettlObligGroupEncoder settlObligRefID(final DirectBuffer value, final int length)
    {
        return settlObligRefID(value, 0, length);
    }

    public SettlObligGroupEncoder settlObligRefID(final DirectBuffer value)
    {
        return settlObligRefID(value, 0, value.capacity());
    }

    public SettlObligGroupEncoder settlObligRefID(final byte[] value, final int offset, final int length)
    {
        settlObligRefID.wrap(value);
        settlObligRefIDOffset = offset;
        settlObligRefIDLength = length;
        return this;
    }

    public SettlObligGroupEncoder settlObligRefIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlObligRefID, value, offset, length);
        settlObligRefIDOffset = offset;
        settlObligRefIDLength = length;
        return this;
    }

    public SettlObligGroupEncoder settlObligRefID(final byte[] value, final int length)
    {
        return settlObligRefID(value, 0, length);
    }

    public SettlObligGroupEncoder settlObligRefID(final byte[] value)
    {
        return settlObligRefID(value, 0, value.length);
    }

    public boolean hasSettlObligRefID()
    {
        return settlObligRefIDLength > 0;
    }

    public MutableDirectBuffer settlObligRefID()
    {
        return settlObligRefID;
    }

    public String settlObligRefIDAsString()
    {
        return settlObligRefID.getStringWithoutLengthAscii(settlObligRefIDOffset, settlObligRefIDLength);
    }

    public SettlObligGroupEncoder settlObligRefID(final CharSequence value)
    {
        toBytes(value, settlObligRefID);
        settlObligRefIDOffset = 0;
        settlObligRefIDLength = value.length();
        return this;
    }

    public SettlObligGroupEncoder settlObligRefID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            settlObligRefID.wrap(buffer);
            settlObligRefIDOffset = value.offset();
            settlObligRefIDLength = value.length();
        }
        return this;
    }

    public SettlObligGroupEncoder settlObligRefID(final char[] value)
    {
        return settlObligRefID(value, 0, value.length);
    }

    public SettlObligGroupEncoder settlObligRefID(final char[] value, final int length)
    {
        return settlObligRefID(value, 0, length);
    }

    public SettlObligGroupEncoder settlObligRefID(final char[] value, final int offset, final int length)
    {
        toBytes(value, settlObligRefID, offset, length);
        settlObligRefIDOffset = 0;
        settlObligRefIDLength = length;
        return this;
    }

    private final DecimalFloat ccyAmt = new DecimalFloat();

    private boolean hasCcyAmt;

    public boolean hasCcyAmt()
    {
        return hasCcyAmt;
    }

    public SettlObligGroupEncoder ccyAmt(DecimalFloat value)
    {
        ccyAmt.set(value);
        hasCcyAmt = true;
        return this;
    }

    public SettlObligGroupEncoder ccyAmt(long value, int scale)
    {
        ccyAmt.set(value, scale);
        hasCcyAmt = true;
        return this;
    }

    public DecimalFloat ccyAmt()
    {
        return ccyAmt;
    }

    private final DecimalFloat settlCurrAmt = new DecimalFloat();

    private boolean hasSettlCurrAmt;

    public boolean hasSettlCurrAmt()
    {
        return hasSettlCurrAmt;
    }

    public SettlObligGroupEncoder settlCurrAmt(DecimalFloat value)
    {
        settlCurrAmt.set(value);
        hasSettlCurrAmt = true;
        return this;
    }

    public SettlObligGroupEncoder settlCurrAmt(long value, int scale)
    {
        settlCurrAmt.set(value, scale);
        hasSettlCurrAmt = true;
        return this;
    }

    public DecimalFloat settlCurrAmt()
    {
        return settlCurrAmt;
    }

    private final MutableDirectBuffer currency = new UnsafeBuffer();

    private int currencyOffset = 0;

    private int currencyLength = 0;

    public SettlObligGroupEncoder currency(final DirectBuffer value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public SettlObligGroupEncoder currency(final DirectBuffer value, final int length)
    {
        return currency(value, 0, length);
    }

    public SettlObligGroupEncoder currency(final DirectBuffer value)
    {
        return currency(value, 0, value.capacity());
    }

    public SettlObligGroupEncoder currency(final byte[] value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public SettlObligGroupEncoder currencyAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(currency, value, offset, length);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public SettlObligGroupEncoder currency(final byte[] value, final int length)
    {
        return currency(value, 0, length);
    }

    public SettlObligGroupEncoder currency(final byte[] value)
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

    public SettlObligGroupEncoder currency(final CharSequence value)
    {
        toBytes(value, currency);
        currencyOffset = 0;
        currencyLength = value.length();
        return this;
    }

    public SettlObligGroupEncoder currency(final AsciiSequenceView value)
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

    public SettlObligGroupEncoder currency(final char[] value)
    {
        return currency(value, 0, value.length);
    }

    public SettlObligGroupEncoder currency(final char[] value, final int length)
    {
        return currency(value, 0, length);
    }

    public SettlObligGroupEncoder currency(final char[] value, final int offset, final int length)
    {
        toBytes(value, currency, offset, length);
        currencyOffset = 0;
        currencyLength = length;
        return this;
    }

    private final MutableDirectBuffer settlCurrency = new UnsafeBuffer();

    private int settlCurrencyOffset = 0;

    private int settlCurrencyLength = 0;

    public SettlObligGroupEncoder settlCurrency(final DirectBuffer value, final int offset, final int length)
    {
        settlCurrency.wrap(value);
        settlCurrencyOffset = offset;
        settlCurrencyLength = length;
        return this;
    }

    public SettlObligGroupEncoder settlCurrency(final DirectBuffer value, final int length)
    {
        return settlCurrency(value, 0, length);
    }

    public SettlObligGroupEncoder settlCurrency(final DirectBuffer value)
    {
        return settlCurrency(value, 0, value.capacity());
    }

    public SettlObligGroupEncoder settlCurrency(final byte[] value, final int offset, final int length)
    {
        settlCurrency.wrap(value);
        settlCurrencyOffset = offset;
        settlCurrencyLength = length;
        return this;
    }

    public SettlObligGroupEncoder settlCurrencyAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlCurrency, value, offset, length);
        settlCurrencyOffset = offset;
        settlCurrencyLength = length;
        return this;
    }

    public SettlObligGroupEncoder settlCurrency(final byte[] value, final int length)
    {
        return settlCurrency(value, 0, length);
    }

    public SettlObligGroupEncoder settlCurrency(final byte[] value)
    {
        return settlCurrency(value, 0, value.length);
    }

    public boolean hasSettlCurrency()
    {
        return settlCurrencyLength > 0;
    }

    public MutableDirectBuffer settlCurrency()
    {
        return settlCurrency;
    }

    public String settlCurrencyAsString()
    {
        return settlCurrency.getStringWithoutLengthAscii(settlCurrencyOffset, settlCurrencyLength);
    }

    public SettlObligGroupEncoder settlCurrency(final CharSequence value)
    {
        toBytes(value, settlCurrency);
        settlCurrencyOffset = 0;
        settlCurrencyLength = value.length();
        return this;
    }

    public SettlObligGroupEncoder settlCurrency(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            settlCurrency.wrap(buffer);
            settlCurrencyOffset = value.offset();
            settlCurrencyLength = value.length();
        }
        return this;
    }

    public SettlObligGroupEncoder settlCurrency(final char[] value)
    {
        return settlCurrency(value, 0, value.length);
    }

    public SettlObligGroupEncoder settlCurrency(final char[] value, final int length)
    {
        return settlCurrency(value, 0, length);
    }

    public SettlObligGroupEncoder settlCurrency(final char[] value, final int offset, final int length)
    {
        toBytes(value, settlCurrency, offset, length);
        settlCurrencyOffset = 0;
        settlCurrencyLength = length;
        return this;
    }

    private final DecimalFloat settlCurrFxRate = new DecimalFloat();

    private boolean hasSettlCurrFxRate;

    public boolean hasSettlCurrFxRate()
    {
        return hasSettlCurrFxRate;
    }

    public SettlObligGroupEncoder settlCurrFxRate(DecimalFloat value)
    {
        settlCurrFxRate.set(value);
        hasSettlCurrFxRate = true;
        return this;
    }

    public SettlObligGroupEncoder settlCurrFxRate(long value, int scale)
    {
        settlCurrFxRate.set(value, scale);
        hasSettlCurrFxRate = true;
        return this;
    }

    public DecimalFloat settlCurrFxRate()
    {
        return settlCurrFxRate;
    }

    private final MutableDirectBuffer settlDate = new UnsafeBuffer();

    private int settlDateOffset = 0;

    private int settlDateLength = 0;

    public SettlObligGroupEncoder settlDate(final DirectBuffer value, final int offset, final int length)
    {
        settlDate.wrap(value);
        settlDateOffset = offset;
        settlDateLength = length;
        return this;
    }

    public SettlObligGroupEncoder settlDate(final DirectBuffer value, final int length)
    {
        return settlDate(value, 0, length);
    }

    public SettlObligGroupEncoder settlDate(final DirectBuffer value)
    {
        return settlDate(value, 0, value.capacity());
    }

    public SettlObligGroupEncoder settlDate(final byte[] value, final int offset, final int length)
    {
        settlDate.wrap(value);
        settlDateOffset = offset;
        settlDateLength = length;
        return this;
    }

    public SettlObligGroupEncoder settlDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlDate, value, offset, length);
        settlDateOffset = offset;
        settlDateLength = length;
        return this;
    }

    public SettlObligGroupEncoder settlDate(final byte[] value, final int length)
    {
        return settlDate(value, 0, length);
    }

    public SettlObligGroupEncoder settlDate(final byte[] value)
    {
        return settlDate(value, 0, value.length);
    }

    public boolean hasSettlDate()
    {
        return settlDateLength > 0;
    }

    public MutableDirectBuffer settlDate()
    {
        return settlDate;
    }

    public String settlDateAsString()
    {
        return settlDate.getStringWithoutLengthAscii(settlDateOffset, settlDateLength);
    }

    private final InstrumentEncoder instrument = new InstrumentEncoder();
    public InstrumentEncoder instrument()
    {
        return instrument;
    }

    private final PartiesEncoder parties = new PartiesEncoder();
    public PartiesEncoder parties()
    {
        return parties;
    }

    private final MutableDirectBuffer effectiveTime = new UnsafeBuffer();

    private int effectiveTimeOffset = 0;

    private int effectiveTimeLength = 0;

    public SettlObligGroupEncoder effectiveTime(final DirectBuffer value, final int offset, final int length)
    {
        effectiveTime.wrap(value);
        effectiveTimeOffset = offset;
        effectiveTimeLength = length;
        return this;
    }

    public SettlObligGroupEncoder effectiveTime(final DirectBuffer value, final int length)
    {
        return effectiveTime(value, 0, length);
    }

    public SettlObligGroupEncoder effectiveTime(final DirectBuffer value)
    {
        return effectiveTime(value, 0, value.capacity());
    }

    public SettlObligGroupEncoder effectiveTime(final byte[] value, final int offset, final int length)
    {
        effectiveTime.wrap(value);
        effectiveTimeOffset = offset;
        effectiveTimeLength = length;
        return this;
    }

    public SettlObligGroupEncoder effectiveTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(effectiveTime, value, offset, length);
        effectiveTimeOffset = offset;
        effectiveTimeLength = length;
        return this;
    }

    public SettlObligGroupEncoder effectiveTime(final byte[] value, final int length)
    {
        return effectiveTime(value, 0, length);
    }

    public SettlObligGroupEncoder effectiveTime(final byte[] value)
    {
        return effectiveTime(value, 0, value.length);
    }

    public boolean hasEffectiveTime()
    {
        return effectiveTimeLength > 0;
    }

    public MutableDirectBuffer effectiveTime()
    {
        return effectiveTime;
    }

    public String effectiveTimeAsString()
    {
        return effectiveTime.getStringWithoutLengthAscii(effectiveTimeOffset, effectiveTimeLength);
    }

    private final MutableDirectBuffer expireTime = new UnsafeBuffer();

    private int expireTimeOffset = 0;

    private int expireTimeLength = 0;

    public SettlObligGroupEncoder expireTime(final DirectBuffer value, final int offset, final int length)
    {
        expireTime.wrap(value);
        expireTimeOffset = offset;
        expireTimeLength = length;
        return this;
    }

    public SettlObligGroupEncoder expireTime(final DirectBuffer value, final int length)
    {
        return expireTime(value, 0, length);
    }

    public SettlObligGroupEncoder expireTime(final DirectBuffer value)
    {
        return expireTime(value, 0, value.capacity());
    }

    public SettlObligGroupEncoder expireTime(final byte[] value, final int offset, final int length)
    {
        expireTime.wrap(value);
        expireTimeOffset = offset;
        expireTimeLength = length;
        return this;
    }

    public SettlObligGroupEncoder expireTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(expireTime, value, offset, length);
        expireTimeOffset = offset;
        expireTimeLength = length;
        return this;
    }

    public SettlObligGroupEncoder expireTime(final byte[] value, final int length)
    {
        return expireTime(value, 0, length);
    }

    public SettlObligGroupEncoder expireTime(final byte[] value)
    {
        return expireTime(value, 0, value.length);
    }

    public boolean hasExpireTime()
    {
        return expireTimeLength > 0;
    }

    public MutableDirectBuffer expireTime()
    {
        return expireTime;
    }

    public String expireTimeAsString()
    {
        return expireTime.getStringWithoutLengthAscii(expireTimeOffset, expireTimeLength);
    }

    private final MutableDirectBuffer lastUpdateTime = new UnsafeBuffer();

    private int lastUpdateTimeOffset = 0;

    private int lastUpdateTimeLength = 0;

    public SettlObligGroupEncoder lastUpdateTime(final DirectBuffer value, final int offset, final int length)
    {
        lastUpdateTime.wrap(value);
        lastUpdateTimeOffset = offset;
        lastUpdateTimeLength = length;
        return this;
    }

    public SettlObligGroupEncoder lastUpdateTime(final DirectBuffer value, final int length)
    {
        return lastUpdateTime(value, 0, length);
    }

    public SettlObligGroupEncoder lastUpdateTime(final DirectBuffer value)
    {
        return lastUpdateTime(value, 0, value.capacity());
    }

    public SettlObligGroupEncoder lastUpdateTime(final byte[] value, final int offset, final int length)
    {
        lastUpdateTime.wrap(value);
        lastUpdateTimeOffset = offset;
        lastUpdateTimeLength = length;
        return this;
    }

    public SettlObligGroupEncoder lastUpdateTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(lastUpdateTime, value, offset, length);
        lastUpdateTimeOffset = offset;
        lastUpdateTimeLength = length;
        return this;
    }

    public SettlObligGroupEncoder lastUpdateTime(final byte[] value, final int length)
    {
        return lastUpdateTime(value, 0, length);
    }

    public SettlObligGroupEncoder lastUpdateTime(final byte[] value)
    {
        return lastUpdateTime(value, 0, value.length);
    }

    public boolean hasLastUpdateTime()
    {
        return lastUpdateTimeLength > 0;
    }

    public MutableDirectBuffer lastUpdateTime()
    {
        return lastUpdateTime;
    }

    public String lastUpdateTimeAsString()
    {
        return lastUpdateTime.getStringWithoutLengthAscii(lastUpdateTimeOffset, lastUpdateTimeLength);
    }

    private final SettlDetailsEncoder settlDetails = new SettlDetailsEncoder();
    public SettlDetailsEncoder settlDetails()
    {
        return settlDetails;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (hasNetGrossInd)
        {
            buffer.putBytes(position, netGrossIndHeader, 0, netGrossIndHeaderLength);
            position += netGrossIndHeaderLength;
            position += buffer.putIntAscii(position, netGrossInd);
            buffer.putSeparator(position);
            position++;
        }

        if (settlObligIDLength > 0)
        {
            buffer.putBytes(position, settlObligIDHeader, 0, settlObligIDHeaderLength);
            position += settlObligIDHeaderLength;
            buffer.putBytes(position, settlObligID, settlObligIDOffset, settlObligIDLength);
            position += settlObligIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasSettlObligTransType)
        {
            buffer.putBytes(position, settlObligTransTypeHeader, 0, settlObligTransTypeHeaderLength);
            position += settlObligTransTypeHeaderLength;
            position += buffer.putCharAscii(position, settlObligTransType);
            buffer.putSeparator(position);
            position++;
        }

        if (settlObligRefIDLength > 0)
        {
            buffer.putBytes(position, settlObligRefIDHeader, 0, settlObligRefIDHeaderLength);
            position += settlObligRefIDHeaderLength;
            buffer.putBytes(position, settlObligRefID, settlObligRefIDOffset, settlObligRefIDLength);
            position += settlObligRefIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasCcyAmt)
        {
            buffer.putBytes(position, ccyAmtHeader, 0, ccyAmtHeaderLength);
            position += ccyAmtHeaderLength;
            position += buffer.putFloatAscii(position, ccyAmt);
            buffer.putSeparator(position);
            position++;
        }

        if (hasSettlCurrAmt)
        {
            buffer.putBytes(position, settlCurrAmtHeader, 0, settlCurrAmtHeaderLength);
            position += settlCurrAmtHeaderLength;
            position += buffer.putFloatAscii(position, settlCurrAmt);
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

        if (settlCurrencyLength > 0)
        {
            buffer.putBytes(position, settlCurrencyHeader, 0, settlCurrencyHeaderLength);
            position += settlCurrencyHeaderLength;
            buffer.putBytes(position, settlCurrency, settlCurrencyOffset, settlCurrencyLength);
            position += settlCurrencyLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasSettlCurrFxRate)
        {
            buffer.putBytes(position, settlCurrFxRateHeader, 0, settlCurrFxRateHeaderLength);
            position += settlCurrFxRateHeaderLength;
            position += buffer.putFloatAscii(position, settlCurrFxRate);
            buffer.putSeparator(position);
            position++;
        }

        if (settlDateLength > 0)
        {
            buffer.putBytes(position, settlDateHeader, 0, settlDateHeaderLength);
            position += settlDateHeaderLength;
            buffer.putBytes(position, settlDate, settlDateOffset, settlDateLength);
            position += settlDateLength;
            buffer.putSeparator(position);
            position++;
        }

            position += instrument.encode(buffer, position);

            position += parties.encode(buffer, position);

        if (effectiveTimeLength > 0)
        {
            buffer.putBytes(position, effectiveTimeHeader, 0, effectiveTimeHeaderLength);
            position += effectiveTimeHeaderLength;
            buffer.putBytes(position, effectiveTime, effectiveTimeOffset, effectiveTimeLength);
            position += effectiveTimeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (expireTimeLength > 0)
        {
            buffer.putBytes(position, expireTimeHeader, 0, expireTimeHeaderLength);
            position += expireTimeHeaderLength;
            buffer.putBytes(position, expireTime, expireTimeOffset, expireTimeLength);
            position += expireTimeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (lastUpdateTimeLength > 0)
        {
            buffer.putBytes(position, lastUpdateTimeHeader, 0, lastUpdateTimeHeaderLength);
            position += lastUpdateTimeHeaderLength;
            buffer.putBytes(position, lastUpdateTime, lastUpdateTimeOffset, lastUpdateTimeLength);
            position += lastUpdateTimeLength;
            buffer.putSeparator(position);
            position++;
        }

            position += settlDetails.encode(buffer, position);
        if (next != null)
        {
            position += next.encode(buffer, position, remainingElements - 1);
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetNetGrossInd();
        this.resetSettlObligID();
        this.resetSettlObligTransType();
        this.resetSettlObligRefID();
        this.resetCcyAmt();
        this.resetSettlCurrAmt();
        this.resetCurrency();
        this.resetSettlCurrency();
        this.resetSettlCurrFxRate();
        this.resetSettlDate();
        this.resetEffectiveTime();
        this.resetExpireTime();
        this.resetLastUpdateTime();
        instrument.reset();
        parties.reset();
        settlDetails.reset();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetNetGrossInd()
    {
        hasNetGrossInd = false;
    }

    public void resetSettlObligID()
    {
        settlObligIDLength = 0;
    }

    public void resetSettlObligTransType()
    {
        hasSettlObligTransType = false;
    }

    public void resetSettlObligRefID()
    {
        settlObligRefIDLength = 0;
    }

    public void resetCcyAmt()
    {
        hasCcyAmt = false;
    }

    public void resetSettlCurrAmt()
    {
        hasSettlCurrAmt = false;
    }

    public void resetCurrency()
    {
        currencyLength = 0;
    }

    public void resetSettlCurrency()
    {
        settlCurrencyLength = 0;
    }

    public void resetSettlCurrFxRate()
    {
        hasSettlCurrFxRate = false;
    }

    public void resetSettlDate()
    {
        settlDateLength = 0;
    }

    public void resetEffectiveTime()
    {
        effectiveTimeLength = 0;
    }

    public void resetExpireTime()
    {
        expireTimeLength = 0;
    }

    public void resetLastUpdateTime()
    {
        lastUpdateTimeLength = 0;
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
        builder.append("\"MessageName\": \"SettlObligGroup\",\n");
        if (hasNetGrossInd())
        {
            indent(builder, level);
            builder.append("\"NetGrossInd\": \"");
            builder.append(netGrossInd);
            builder.append("\",\n");
        }

        if (hasSettlObligID())
        {
            indent(builder, level);
            builder.append("\"SettlObligID\": \"");
            appendBuffer(builder, settlObligID, settlObligIDOffset, settlObligIDLength);
            builder.append("\",\n");
        }

        if (hasSettlObligTransType())
        {
            indent(builder, level);
            builder.append("\"SettlObligTransType\": \"");
            builder.append(settlObligTransType);
            builder.append("\",\n");
        }

        if (hasSettlObligRefID())
        {
            indent(builder, level);
            builder.append("\"SettlObligRefID\": \"");
            appendBuffer(builder, settlObligRefID, settlObligRefIDOffset, settlObligRefIDLength);
            builder.append("\",\n");
        }

        if (hasCcyAmt())
        {
            indent(builder, level);
            builder.append("\"CcyAmt\": \"");
            ccyAmt.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasSettlCurrAmt())
        {
            indent(builder, level);
            builder.append("\"SettlCurrAmt\": \"");
            settlCurrAmt.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasCurrency())
        {
            indent(builder, level);
            builder.append("\"Currency\": \"");
            appendBuffer(builder, currency, currencyOffset, currencyLength);
            builder.append("\",\n");
        }

        if (hasSettlCurrency())
        {
            indent(builder, level);
            builder.append("\"SettlCurrency\": \"");
            appendBuffer(builder, settlCurrency, settlCurrencyOffset, settlCurrencyLength);
            builder.append("\",\n");
        }

        if (hasSettlCurrFxRate())
        {
            indent(builder, level);
            builder.append("\"SettlCurrFxRate\": \"");
            settlCurrFxRate.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasSettlDate())
        {
            indent(builder, level);
            builder.append("\"SettlDate\": \"");
            appendBuffer(builder, settlDate, settlDateOffset, settlDateLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"Instrument\": ");
    instrument.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"Parties\": ");
    parties.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasEffectiveTime())
        {
            indent(builder, level);
            builder.append("\"EffectiveTime\": \"");
            appendBuffer(builder, effectiveTime, effectiveTimeOffset, effectiveTimeLength);
            builder.append("\",\n");
        }

        if (hasExpireTime())
        {
            indent(builder, level);
            builder.append("\"ExpireTime\": \"");
            appendBuffer(builder, expireTime, expireTimeOffset, expireTimeLength);
            builder.append("\",\n");
        }

        if (hasLastUpdateTime())
        {
            indent(builder, level);
            builder.append("\"LastUpdateTime\": \"");
            appendBuffer(builder, lastUpdateTime, lastUpdateTimeOffset, lastUpdateTimeLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"SettlDetails\": ");
    settlDetails.appendTo(builder, level + 1);
    builder.append("\n");
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public SettlObligGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((SettlObligGroupEncoder)encoder);
    }

    public SettlObligGroupEncoder copyTo(final SettlObligGroupEncoder encoder)
    {
        encoder.reset();
        if (hasNetGrossInd())
        {
            encoder.netGrossInd(this.netGrossInd());
        }

        if (hasSettlObligID())
        {
            encoder.settlObligIDAsCopy(settlObligID.byteArray(), 0, settlObligIDLength);
        }

        if (hasSettlObligTransType())
        {
            encoder.settlObligTransType(this.settlObligTransType());
        }

        if (hasSettlObligRefID())
        {
            encoder.settlObligRefIDAsCopy(settlObligRefID.byteArray(), 0, settlObligRefIDLength);
        }

        if (hasCcyAmt())
        {
            encoder.ccyAmt(this.ccyAmt());
        }

        if (hasSettlCurrAmt())
        {
            encoder.settlCurrAmt(this.settlCurrAmt());
        }

        if (hasCurrency())
        {
            encoder.currencyAsCopy(currency.byteArray(), 0, currencyLength);
        }

        if (hasSettlCurrency())
        {
            encoder.settlCurrencyAsCopy(settlCurrency.byteArray(), 0, settlCurrencyLength);
        }

        if (hasSettlCurrFxRate())
        {
            encoder.settlCurrFxRate(this.settlCurrFxRate());
        }

        if (hasSettlDate())
        {
            encoder.settlDateAsCopy(settlDate.byteArray(), 0, settlDateLength);
        }


        instrument.copyTo(encoder.instrument());

        parties.copyTo(encoder.parties());
        if (hasEffectiveTime())
        {
            encoder.effectiveTimeAsCopy(effectiveTime.byteArray(), 0, effectiveTimeLength);
        }

        if (hasExpireTime())
        {
            encoder.expireTimeAsCopy(expireTime.byteArray(), 0, expireTimeLength);
        }

        if (hasLastUpdateTime())
        {
            encoder.lastUpdateTimeAsCopy(lastUpdateTime.byteArray(), 0, lastUpdateTimeLength);
        }


        settlDetails.copyTo(encoder.settlDetails());        return encoder;
    }

}
    private int noSettlObligGroupCounter;

    private boolean hasNoSettlObligGroupCounter;

    public boolean hasNoSettlObligGroupCounter()
    {
        return hasNoSettlObligGroupCounter;
    }

    public SettlObligationInstructionsEncoder noSettlObligGroupCounter(int value)
    {
        noSettlObligGroupCounter = value;
        hasNoSettlObligGroupCounter = true;
        return this;
    }

    public int noSettlObligGroupCounter()
    {
        return noSettlObligGroupCounter;
    }


    private SettlObligGroupEncoder settlObligGroup = null;

    public SettlObligGroupEncoder settlObligGroup(final int numberOfElements)
    {
        hasNoSettlObligGroupCounter = true;
        noSettlObligGroupCounter = numberOfElements;
        if (settlObligGroup == null)
        {
            settlObligGroup = new SettlObligGroupEncoder();
        }
        return settlObligGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoSettlObligGroupCounter)
        {
            buffer.putBytes(position, noSettlObligGroupCounterHeader, 0, noSettlObligGroupCounterHeaderLength);
            position += noSettlObligGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noSettlObligGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (settlObligGroup != null)
        {
            position += settlObligGroup.encode(buffer, position, noSettlObligGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetSettlObligGroup();
    }

    public void resetSettlObligGroup()
    {
        if (settlObligGroup != null)
        {
            settlObligGroup.reset();
        }
        noSettlObligGroupCounter = 0;
        hasNoSettlObligGroupCounter = false;
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
        builder.append("\"MessageName\": \"SettlObligationInstructions\",\n");
        if (hasNoSettlObligGroupCounter)
        {
            indent(builder, level);
            builder.append("\"SettlObligGroup\": [\n");
            final int noSettlObligGroupCounter = this.noSettlObligGroupCounter;
            SettlObligGroupEncoder settlObligGroup = this.settlObligGroup;
            for (int i = 0; i < noSettlObligGroupCounter; i++)
            {
                indent(builder, level);
                settlObligGroup.appendTo(builder, level + 1);
                if (i < (noSettlObligGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                settlObligGroup = settlObligGroup.next();
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
    public SettlObligationInstructionsEncoder copyTo(final Encoder encoder)
    {
        return copyTo((SettlObligationInstructionsEncoder)encoder);
    }

    public SettlObligationInstructionsEncoder copyTo(final SettlObligationInstructionsEncoder encoder)
    {
        encoder.reset();
        if (hasNoSettlObligGroupCounter)
        {
            final int size = this.noSettlObligGroupCounter;
            SettlObligGroupEncoder settlObligGroup = this.settlObligGroup;
            SettlObligGroupEncoder settlObligGroupEncoder = encoder.settlObligGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (settlObligGroup != null)
                {
                    settlObligGroup.copyTo(settlObligGroupEncoder);
                    settlObligGroup = settlObligGroup.next();
                    settlObligGroupEncoder = settlObligGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
