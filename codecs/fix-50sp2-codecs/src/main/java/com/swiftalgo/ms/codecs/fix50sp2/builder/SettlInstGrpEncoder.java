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


public class SettlInstGrpEncoder
{
    private static final int noSettlInstGroupCounterHeaderLength = 4;
    private static final byte[] noSettlInstGroupCounterHeader = new byte[] {55, 55, 56, (byte) '='};



public static class SettlInstGroupEncoder
{
    private SettlInstGroupEncoder next = null;

    public SettlInstGroupEncoder next()
    {
        if (next == null)
        {
            next = new SettlInstGroupEncoder();
        }
        return next;
    }

    private static final int settlInstIDHeaderLength = 4;
    private static final byte[] settlInstIDHeader = new byte[] {49, 54, 50, (byte) '='};

    private static final int settlInstTransTypeHeaderLength = 4;
    private static final byte[] settlInstTransTypeHeader = new byte[] {49, 54, 51, (byte) '='};

    private static final int settlInstRefIDHeaderLength = 4;
    private static final byte[] settlInstRefIDHeader = new byte[] {50, 49, 52, (byte) '='};

    private static final int sideHeaderLength = 3;
    private static final byte[] sideHeader = new byte[] {53, 52, (byte) '='};

    private static final int productHeaderLength = 4;
    private static final byte[] productHeader = new byte[] {52, 54, 48, (byte) '='};

    private static final int securityTypeHeaderLength = 4;
    private static final byte[] securityTypeHeader = new byte[] {49, 54, 55, (byte) '='};

    private static final int cFICodeHeaderLength = 4;
    private static final byte[] cFICodeHeader = new byte[] {52, 54, 49, (byte) '='};

    private static final int settlCurrencyHeaderLength = 4;
    private static final byte[] settlCurrencyHeader = new byte[] {49, 50, 48, (byte) '='};

    private static final int effectiveTimeHeaderLength = 4;
    private static final byte[] effectiveTimeHeader = new byte[] {49, 54, 56, (byte) '='};

    private static final int expireTimeHeaderLength = 4;
    private static final byte[] expireTimeHeader = new byte[] {49, 50, 54, (byte) '='};

    private static final int lastUpdateTimeHeaderLength = 4;
    private static final byte[] lastUpdateTimeHeader = new byte[] {55, 55, 57, (byte) '='};

    private static final int paymentMethodHeaderLength = 4;
    private static final byte[] paymentMethodHeader = new byte[] {52, 57, 50, (byte) '='};

    private static final int paymentRefHeaderLength = 4;
    private static final byte[] paymentRefHeader = new byte[] {52, 55, 54, (byte) '='};

    private static final int cardHolderNameHeaderLength = 4;
    private static final byte[] cardHolderNameHeader = new byte[] {52, 56, 56, (byte) '='};

    private static final int cardNumberHeaderLength = 4;
    private static final byte[] cardNumberHeader = new byte[] {52, 56, 57, (byte) '='};

    private static final int cardStartDateHeaderLength = 4;
    private static final byte[] cardStartDateHeader = new byte[] {53, 48, 51, (byte) '='};

    private static final int cardExpDateHeaderLength = 4;
    private static final byte[] cardExpDateHeader = new byte[] {52, 57, 48, (byte) '='};

    private static final int cardIssNumHeaderLength = 4;
    private static final byte[] cardIssNumHeader = new byte[] {52, 57, 49, (byte) '='};

    private static final int paymentDateHeaderLength = 4;
    private static final byte[] paymentDateHeader = new byte[] {53, 48, 52, (byte) '='};

    private static final int paymentRemitterIDHeaderLength = 4;
    private static final byte[] paymentRemitterIDHeader = new byte[] {53, 48, 53, (byte) '='};

    private final MutableDirectBuffer settlInstID = new UnsafeBuffer();

    private int settlInstIDOffset = 0;

    private int settlInstIDLength = 0;

    public SettlInstGroupEncoder settlInstID(final DirectBuffer value, final int offset, final int length)
    {
        settlInstID.wrap(value);
        settlInstIDOffset = offset;
        settlInstIDLength = length;
        return this;
    }

    public SettlInstGroupEncoder settlInstID(final DirectBuffer value, final int length)
    {
        return settlInstID(value, 0, length);
    }

    public SettlInstGroupEncoder settlInstID(final DirectBuffer value)
    {
        return settlInstID(value, 0, value.capacity());
    }

    public SettlInstGroupEncoder settlInstID(final byte[] value, final int offset, final int length)
    {
        settlInstID.wrap(value);
        settlInstIDOffset = offset;
        settlInstIDLength = length;
        return this;
    }

    public SettlInstGroupEncoder settlInstIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlInstID, value, offset, length);
        settlInstIDOffset = offset;
        settlInstIDLength = length;
        return this;
    }

    public SettlInstGroupEncoder settlInstID(final byte[] value, final int length)
    {
        return settlInstID(value, 0, length);
    }

    public SettlInstGroupEncoder settlInstID(final byte[] value)
    {
        return settlInstID(value, 0, value.length);
    }

    public boolean hasSettlInstID()
    {
        return settlInstIDLength > 0;
    }

    public MutableDirectBuffer settlInstID()
    {
        return settlInstID;
    }

    public String settlInstIDAsString()
    {
        return settlInstID.getStringWithoutLengthAscii(settlInstIDOffset, settlInstIDLength);
    }

    public SettlInstGroupEncoder settlInstID(final CharSequence value)
    {
        toBytes(value, settlInstID);
        settlInstIDOffset = 0;
        settlInstIDLength = value.length();
        return this;
    }

    public SettlInstGroupEncoder settlInstID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            settlInstID.wrap(buffer);
            settlInstIDOffset = value.offset();
            settlInstIDLength = value.length();
        }
        return this;
    }

    public SettlInstGroupEncoder settlInstID(final char[] value)
    {
        return settlInstID(value, 0, value.length);
    }

    public SettlInstGroupEncoder settlInstID(final char[] value, final int length)
    {
        return settlInstID(value, 0, length);
    }

    public SettlInstGroupEncoder settlInstID(final char[] value, final int offset, final int length)
    {
        toBytes(value, settlInstID, offset, length);
        settlInstIDOffset = 0;
        settlInstIDLength = length;
        return this;
    }

    private char settlInstTransType;

    private boolean hasSettlInstTransType;

    public boolean hasSettlInstTransType()
    {
        return hasSettlInstTransType;
    }

    public SettlInstGroupEncoder settlInstTransType(char value)
    {
        settlInstTransType = value;
        hasSettlInstTransType = true;
        return this;
    }

    public char settlInstTransType()
    {
        return settlInstTransType;
    }

    public SettlInstGroupEncoder settlInstTransType(SettlInstTransType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == SettlInstTransType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: settlInstTransType Value: " + value );
            }
            if (value == SettlInstTransType.NULL_VAL)
            {
                return this;
            }
        }
        return settlInstTransType(value.representation());
    }

    private final MutableDirectBuffer settlInstRefID = new UnsafeBuffer();

    private int settlInstRefIDOffset = 0;

    private int settlInstRefIDLength = 0;

    public SettlInstGroupEncoder settlInstRefID(final DirectBuffer value, final int offset, final int length)
    {
        settlInstRefID.wrap(value);
        settlInstRefIDOffset = offset;
        settlInstRefIDLength = length;
        return this;
    }

    public SettlInstGroupEncoder settlInstRefID(final DirectBuffer value, final int length)
    {
        return settlInstRefID(value, 0, length);
    }

    public SettlInstGroupEncoder settlInstRefID(final DirectBuffer value)
    {
        return settlInstRefID(value, 0, value.capacity());
    }

    public SettlInstGroupEncoder settlInstRefID(final byte[] value, final int offset, final int length)
    {
        settlInstRefID.wrap(value);
        settlInstRefIDOffset = offset;
        settlInstRefIDLength = length;
        return this;
    }

    public SettlInstGroupEncoder settlInstRefIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlInstRefID, value, offset, length);
        settlInstRefIDOffset = offset;
        settlInstRefIDLength = length;
        return this;
    }

    public SettlInstGroupEncoder settlInstRefID(final byte[] value, final int length)
    {
        return settlInstRefID(value, 0, length);
    }

    public SettlInstGroupEncoder settlInstRefID(final byte[] value)
    {
        return settlInstRefID(value, 0, value.length);
    }

    public boolean hasSettlInstRefID()
    {
        return settlInstRefIDLength > 0;
    }

    public MutableDirectBuffer settlInstRefID()
    {
        return settlInstRefID;
    }

    public String settlInstRefIDAsString()
    {
        return settlInstRefID.getStringWithoutLengthAscii(settlInstRefIDOffset, settlInstRefIDLength);
    }

    public SettlInstGroupEncoder settlInstRefID(final CharSequence value)
    {
        toBytes(value, settlInstRefID);
        settlInstRefIDOffset = 0;
        settlInstRefIDLength = value.length();
        return this;
    }

    public SettlInstGroupEncoder settlInstRefID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            settlInstRefID.wrap(buffer);
            settlInstRefIDOffset = value.offset();
            settlInstRefIDLength = value.length();
        }
        return this;
    }

    public SettlInstGroupEncoder settlInstRefID(final char[] value)
    {
        return settlInstRefID(value, 0, value.length);
    }

    public SettlInstGroupEncoder settlInstRefID(final char[] value, final int length)
    {
        return settlInstRefID(value, 0, length);
    }

    public SettlInstGroupEncoder settlInstRefID(final char[] value, final int offset, final int length)
    {
        toBytes(value, settlInstRefID, offset, length);
        settlInstRefIDOffset = 0;
        settlInstRefIDLength = length;
        return this;
    }

    private final PartiesEncoder parties = new PartiesEncoder();
    public PartiesEncoder parties()
    {
        return parties;
    }

    private char side;

    private boolean hasSide;

    public boolean hasSide()
    {
        return hasSide;
    }

    public SettlInstGroupEncoder side(char value)
    {
        side = value;
        hasSide = true;
        return this;
    }

    public char side()
    {
        return side;
    }

    public SettlInstGroupEncoder side(Side value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == Side.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: side Value: " + value );
            }
            if (value == Side.NULL_VAL)
            {
                return this;
            }
        }
        return side(value.representation());
    }

    private int product;

    private boolean hasProduct;

    public boolean hasProduct()
    {
        return hasProduct;
    }

    public SettlInstGroupEncoder product(int value)
    {
        product = value;
        hasProduct = true;
        return this;
    }

    public int product()
    {
        return product;
    }

    public SettlInstGroupEncoder product(Product value)
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

    private final MutableDirectBuffer securityType = new UnsafeBuffer();

    private int securityTypeOffset = 0;

    private int securityTypeLength = 0;

    public SettlInstGroupEncoder securityType(final DirectBuffer value, final int offset, final int length)
    {
        securityType.wrap(value);
        securityTypeOffset = offset;
        securityTypeLength = length;
        return this;
    }

    public SettlInstGroupEncoder securityType(final DirectBuffer value, final int length)
    {
        return securityType(value, 0, length);
    }

    public SettlInstGroupEncoder securityType(final DirectBuffer value)
    {
        return securityType(value, 0, value.capacity());
    }

    public SettlInstGroupEncoder securityType(final byte[] value, final int offset, final int length)
    {
        securityType.wrap(value);
        securityTypeOffset = offset;
        securityTypeLength = length;
        return this;
    }

    public SettlInstGroupEncoder securityTypeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(securityType, value, offset, length);
        securityTypeOffset = offset;
        securityTypeLength = length;
        return this;
    }

    public SettlInstGroupEncoder securityType(final byte[] value, final int length)
    {
        return securityType(value, 0, length);
    }

    public SettlInstGroupEncoder securityType(final byte[] value)
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

    public SettlInstGroupEncoder securityType(final CharSequence value)
    {
        toBytes(value, securityType);
        securityTypeOffset = 0;
        securityTypeLength = value.length();
        return this;
    }

    public SettlInstGroupEncoder securityType(final AsciiSequenceView value)
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

    public SettlInstGroupEncoder securityType(final char[] value)
    {
        return securityType(value, 0, value.length);
    }

    public SettlInstGroupEncoder securityType(final char[] value, final int length)
    {
        return securityType(value, 0, length);
    }

    public SettlInstGroupEncoder securityType(final char[] value, final int offset, final int length)
    {
        toBytes(value, securityType, offset, length);
        securityTypeOffset = 0;
        securityTypeLength = length;
        return this;
    }

    public SettlInstGroupEncoder securityType(SecurityType value)
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

    private final MutableDirectBuffer cFICode = new UnsafeBuffer();

    private int cFICodeOffset = 0;

    private int cFICodeLength = 0;

    public SettlInstGroupEncoder cFICode(final DirectBuffer value, final int offset, final int length)
    {
        cFICode.wrap(value);
        cFICodeOffset = offset;
        cFICodeLength = length;
        return this;
    }

    public SettlInstGroupEncoder cFICode(final DirectBuffer value, final int length)
    {
        return cFICode(value, 0, length);
    }

    public SettlInstGroupEncoder cFICode(final DirectBuffer value)
    {
        return cFICode(value, 0, value.capacity());
    }

    public SettlInstGroupEncoder cFICode(final byte[] value, final int offset, final int length)
    {
        cFICode.wrap(value);
        cFICodeOffset = offset;
        cFICodeLength = length;
        return this;
    }

    public SettlInstGroupEncoder cFICodeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(cFICode, value, offset, length);
        cFICodeOffset = offset;
        cFICodeLength = length;
        return this;
    }

    public SettlInstGroupEncoder cFICode(final byte[] value, final int length)
    {
        return cFICode(value, 0, length);
    }

    public SettlInstGroupEncoder cFICode(final byte[] value)
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

    public SettlInstGroupEncoder cFICode(final CharSequence value)
    {
        toBytes(value, cFICode);
        cFICodeOffset = 0;
        cFICodeLength = value.length();
        return this;
    }

    public SettlInstGroupEncoder cFICode(final AsciiSequenceView value)
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

    public SettlInstGroupEncoder cFICode(final char[] value)
    {
        return cFICode(value, 0, value.length);
    }

    public SettlInstGroupEncoder cFICode(final char[] value, final int length)
    {
        return cFICode(value, 0, length);
    }

    public SettlInstGroupEncoder cFICode(final char[] value, final int offset, final int length)
    {
        toBytes(value, cFICode, offset, length);
        cFICodeOffset = 0;
        cFICodeLength = length;
        return this;
    }

    private final MutableDirectBuffer settlCurrency = new UnsafeBuffer();

    private int settlCurrencyOffset = 0;

    private int settlCurrencyLength = 0;

    public SettlInstGroupEncoder settlCurrency(final DirectBuffer value, final int offset, final int length)
    {
        settlCurrency.wrap(value);
        settlCurrencyOffset = offset;
        settlCurrencyLength = length;
        return this;
    }

    public SettlInstGroupEncoder settlCurrency(final DirectBuffer value, final int length)
    {
        return settlCurrency(value, 0, length);
    }

    public SettlInstGroupEncoder settlCurrency(final DirectBuffer value)
    {
        return settlCurrency(value, 0, value.capacity());
    }

    public SettlInstGroupEncoder settlCurrency(final byte[] value, final int offset, final int length)
    {
        settlCurrency.wrap(value);
        settlCurrencyOffset = offset;
        settlCurrencyLength = length;
        return this;
    }

    public SettlInstGroupEncoder settlCurrencyAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlCurrency, value, offset, length);
        settlCurrencyOffset = offset;
        settlCurrencyLength = length;
        return this;
    }

    public SettlInstGroupEncoder settlCurrency(final byte[] value, final int length)
    {
        return settlCurrency(value, 0, length);
    }

    public SettlInstGroupEncoder settlCurrency(final byte[] value)
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

    public SettlInstGroupEncoder settlCurrency(final CharSequence value)
    {
        toBytes(value, settlCurrency);
        settlCurrencyOffset = 0;
        settlCurrencyLength = value.length();
        return this;
    }

    public SettlInstGroupEncoder settlCurrency(final AsciiSequenceView value)
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

    public SettlInstGroupEncoder settlCurrency(final char[] value)
    {
        return settlCurrency(value, 0, value.length);
    }

    public SettlInstGroupEncoder settlCurrency(final char[] value, final int length)
    {
        return settlCurrency(value, 0, length);
    }

    public SettlInstGroupEncoder settlCurrency(final char[] value, final int offset, final int length)
    {
        toBytes(value, settlCurrency, offset, length);
        settlCurrencyOffset = 0;
        settlCurrencyLength = length;
        return this;
    }

    private final MutableDirectBuffer effectiveTime = new UnsafeBuffer();

    private int effectiveTimeOffset = 0;

    private int effectiveTimeLength = 0;

    public SettlInstGroupEncoder effectiveTime(final DirectBuffer value, final int offset, final int length)
    {
        effectiveTime.wrap(value);
        effectiveTimeOffset = offset;
        effectiveTimeLength = length;
        return this;
    }

    public SettlInstGroupEncoder effectiveTime(final DirectBuffer value, final int length)
    {
        return effectiveTime(value, 0, length);
    }

    public SettlInstGroupEncoder effectiveTime(final DirectBuffer value)
    {
        return effectiveTime(value, 0, value.capacity());
    }

    public SettlInstGroupEncoder effectiveTime(final byte[] value, final int offset, final int length)
    {
        effectiveTime.wrap(value);
        effectiveTimeOffset = offset;
        effectiveTimeLength = length;
        return this;
    }

    public SettlInstGroupEncoder effectiveTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(effectiveTime, value, offset, length);
        effectiveTimeOffset = offset;
        effectiveTimeLength = length;
        return this;
    }

    public SettlInstGroupEncoder effectiveTime(final byte[] value, final int length)
    {
        return effectiveTime(value, 0, length);
    }

    public SettlInstGroupEncoder effectiveTime(final byte[] value)
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

    public SettlInstGroupEncoder expireTime(final DirectBuffer value, final int offset, final int length)
    {
        expireTime.wrap(value);
        expireTimeOffset = offset;
        expireTimeLength = length;
        return this;
    }

    public SettlInstGroupEncoder expireTime(final DirectBuffer value, final int length)
    {
        return expireTime(value, 0, length);
    }

    public SettlInstGroupEncoder expireTime(final DirectBuffer value)
    {
        return expireTime(value, 0, value.capacity());
    }

    public SettlInstGroupEncoder expireTime(final byte[] value, final int offset, final int length)
    {
        expireTime.wrap(value);
        expireTimeOffset = offset;
        expireTimeLength = length;
        return this;
    }

    public SettlInstGroupEncoder expireTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(expireTime, value, offset, length);
        expireTimeOffset = offset;
        expireTimeLength = length;
        return this;
    }

    public SettlInstGroupEncoder expireTime(final byte[] value, final int length)
    {
        return expireTime(value, 0, length);
    }

    public SettlInstGroupEncoder expireTime(final byte[] value)
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

    public SettlInstGroupEncoder lastUpdateTime(final DirectBuffer value, final int offset, final int length)
    {
        lastUpdateTime.wrap(value);
        lastUpdateTimeOffset = offset;
        lastUpdateTimeLength = length;
        return this;
    }

    public SettlInstGroupEncoder lastUpdateTime(final DirectBuffer value, final int length)
    {
        return lastUpdateTime(value, 0, length);
    }

    public SettlInstGroupEncoder lastUpdateTime(final DirectBuffer value)
    {
        return lastUpdateTime(value, 0, value.capacity());
    }

    public SettlInstGroupEncoder lastUpdateTime(final byte[] value, final int offset, final int length)
    {
        lastUpdateTime.wrap(value);
        lastUpdateTimeOffset = offset;
        lastUpdateTimeLength = length;
        return this;
    }

    public SettlInstGroupEncoder lastUpdateTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(lastUpdateTime, value, offset, length);
        lastUpdateTimeOffset = offset;
        lastUpdateTimeLength = length;
        return this;
    }

    public SettlInstGroupEncoder lastUpdateTime(final byte[] value, final int length)
    {
        return lastUpdateTime(value, 0, length);
    }

    public SettlInstGroupEncoder lastUpdateTime(final byte[] value)
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

    private final SettlInstructionsDataEncoder settlInstructionsData = new SettlInstructionsDataEncoder();
    public SettlInstructionsDataEncoder settlInstructionsData()
    {
        return settlInstructionsData;
    }

    private int paymentMethod;

    private boolean hasPaymentMethod;

    public boolean hasPaymentMethod()
    {
        return hasPaymentMethod;
    }

    public SettlInstGroupEncoder paymentMethod(int value)
    {
        paymentMethod = value;
        hasPaymentMethod = true;
        return this;
    }

    public int paymentMethod()
    {
        return paymentMethod;
    }

    public SettlInstGroupEncoder paymentMethod(PaymentMethod value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == PaymentMethod.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: paymentMethod Value: " + value );
            }
            if (value == PaymentMethod.NULL_VAL)
            {
                return this;
            }
        }
        return paymentMethod(value.representation());
    }

    private final MutableDirectBuffer paymentRef = new UnsafeBuffer();

    private int paymentRefOffset = 0;

    private int paymentRefLength = 0;

    public SettlInstGroupEncoder paymentRef(final DirectBuffer value, final int offset, final int length)
    {
        paymentRef.wrap(value);
        paymentRefOffset = offset;
        paymentRefLength = length;
        return this;
    }

    public SettlInstGroupEncoder paymentRef(final DirectBuffer value, final int length)
    {
        return paymentRef(value, 0, length);
    }

    public SettlInstGroupEncoder paymentRef(final DirectBuffer value)
    {
        return paymentRef(value, 0, value.capacity());
    }

    public SettlInstGroupEncoder paymentRef(final byte[] value, final int offset, final int length)
    {
        paymentRef.wrap(value);
        paymentRefOffset = offset;
        paymentRefLength = length;
        return this;
    }

    public SettlInstGroupEncoder paymentRefAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(paymentRef, value, offset, length);
        paymentRefOffset = offset;
        paymentRefLength = length;
        return this;
    }

    public SettlInstGroupEncoder paymentRef(final byte[] value, final int length)
    {
        return paymentRef(value, 0, length);
    }

    public SettlInstGroupEncoder paymentRef(final byte[] value)
    {
        return paymentRef(value, 0, value.length);
    }

    public boolean hasPaymentRef()
    {
        return paymentRefLength > 0;
    }

    public MutableDirectBuffer paymentRef()
    {
        return paymentRef;
    }

    public String paymentRefAsString()
    {
        return paymentRef.getStringWithoutLengthAscii(paymentRefOffset, paymentRefLength);
    }

    public SettlInstGroupEncoder paymentRef(final CharSequence value)
    {
        toBytes(value, paymentRef);
        paymentRefOffset = 0;
        paymentRefLength = value.length();
        return this;
    }

    public SettlInstGroupEncoder paymentRef(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            paymentRef.wrap(buffer);
            paymentRefOffset = value.offset();
            paymentRefLength = value.length();
        }
        return this;
    }

    public SettlInstGroupEncoder paymentRef(final char[] value)
    {
        return paymentRef(value, 0, value.length);
    }

    public SettlInstGroupEncoder paymentRef(final char[] value, final int length)
    {
        return paymentRef(value, 0, length);
    }

    public SettlInstGroupEncoder paymentRef(final char[] value, final int offset, final int length)
    {
        toBytes(value, paymentRef, offset, length);
        paymentRefOffset = 0;
        paymentRefLength = length;
        return this;
    }

    private final MutableDirectBuffer cardHolderName = new UnsafeBuffer();

    private int cardHolderNameOffset = 0;

    private int cardHolderNameLength = 0;

    public SettlInstGroupEncoder cardHolderName(final DirectBuffer value, final int offset, final int length)
    {
        cardHolderName.wrap(value);
        cardHolderNameOffset = offset;
        cardHolderNameLength = length;
        return this;
    }

    public SettlInstGroupEncoder cardHolderName(final DirectBuffer value, final int length)
    {
        return cardHolderName(value, 0, length);
    }

    public SettlInstGroupEncoder cardHolderName(final DirectBuffer value)
    {
        return cardHolderName(value, 0, value.capacity());
    }

    public SettlInstGroupEncoder cardHolderName(final byte[] value, final int offset, final int length)
    {
        cardHolderName.wrap(value);
        cardHolderNameOffset = offset;
        cardHolderNameLength = length;
        return this;
    }

    public SettlInstGroupEncoder cardHolderNameAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(cardHolderName, value, offset, length);
        cardHolderNameOffset = offset;
        cardHolderNameLength = length;
        return this;
    }

    public SettlInstGroupEncoder cardHolderName(final byte[] value, final int length)
    {
        return cardHolderName(value, 0, length);
    }

    public SettlInstGroupEncoder cardHolderName(final byte[] value)
    {
        return cardHolderName(value, 0, value.length);
    }

    public boolean hasCardHolderName()
    {
        return cardHolderNameLength > 0;
    }

    public MutableDirectBuffer cardHolderName()
    {
        return cardHolderName;
    }

    public String cardHolderNameAsString()
    {
        return cardHolderName.getStringWithoutLengthAscii(cardHolderNameOffset, cardHolderNameLength);
    }

    public SettlInstGroupEncoder cardHolderName(final CharSequence value)
    {
        toBytes(value, cardHolderName);
        cardHolderNameOffset = 0;
        cardHolderNameLength = value.length();
        return this;
    }

    public SettlInstGroupEncoder cardHolderName(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            cardHolderName.wrap(buffer);
            cardHolderNameOffset = value.offset();
            cardHolderNameLength = value.length();
        }
        return this;
    }

    public SettlInstGroupEncoder cardHolderName(final char[] value)
    {
        return cardHolderName(value, 0, value.length);
    }

    public SettlInstGroupEncoder cardHolderName(final char[] value, final int length)
    {
        return cardHolderName(value, 0, length);
    }

    public SettlInstGroupEncoder cardHolderName(final char[] value, final int offset, final int length)
    {
        toBytes(value, cardHolderName, offset, length);
        cardHolderNameOffset = 0;
        cardHolderNameLength = length;
        return this;
    }

    private final MutableDirectBuffer cardNumber = new UnsafeBuffer();

    private int cardNumberOffset = 0;

    private int cardNumberLength = 0;

    public SettlInstGroupEncoder cardNumber(final DirectBuffer value, final int offset, final int length)
    {
        cardNumber.wrap(value);
        cardNumberOffset = offset;
        cardNumberLength = length;
        return this;
    }

    public SettlInstGroupEncoder cardNumber(final DirectBuffer value, final int length)
    {
        return cardNumber(value, 0, length);
    }

    public SettlInstGroupEncoder cardNumber(final DirectBuffer value)
    {
        return cardNumber(value, 0, value.capacity());
    }

    public SettlInstGroupEncoder cardNumber(final byte[] value, final int offset, final int length)
    {
        cardNumber.wrap(value);
        cardNumberOffset = offset;
        cardNumberLength = length;
        return this;
    }

    public SettlInstGroupEncoder cardNumberAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(cardNumber, value, offset, length);
        cardNumberOffset = offset;
        cardNumberLength = length;
        return this;
    }

    public SettlInstGroupEncoder cardNumber(final byte[] value, final int length)
    {
        return cardNumber(value, 0, length);
    }

    public SettlInstGroupEncoder cardNumber(final byte[] value)
    {
        return cardNumber(value, 0, value.length);
    }

    public boolean hasCardNumber()
    {
        return cardNumberLength > 0;
    }

    public MutableDirectBuffer cardNumber()
    {
        return cardNumber;
    }

    public String cardNumberAsString()
    {
        return cardNumber.getStringWithoutLengthAscii(cardNumberOffset, cardNumberLength);
    }

    public SettlInstGroupEncoder cardNumber(final CharSequence value)
    {
        toBytes(value, cardNumber);
        cardNumberOffset = 0;
        cardNumberLength = value.length();
        return this;
    }

    public SettlInstGroupEncoder cardNumber(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            cardNumber.wrap(buffer);
            cardNumberOffset = value.offset();
            cardNumberLength = value.length();
        }
        return this;
    }

    public SettlInstGroupEncoder cardNumber(final char[] value)
    {
        return cardNumber(value, 0, value.length);
    }

    public SettlInstGroupEncoder cardNumber(final char[] value, final int length)
    {
        return cardNumber(value, 0, length);
    }

    public SettlInstGroupEncoder cardNumber(final char[] value, final int offset, final int length)
    {
        toBytes(value, cardNumber, offset, length);
        cardNumberOffset = 0;
        cardNumberLength = length;
        return this;
    }

    private final MutableDirectBuffer cardStartDate = new UnsafeBuffer();

    private int cardStartDateOffset = 0;

    private int cardStartDateLength = 0;

    public SettlInstGroupEncoder cardStartDate(final DirectBuffer value, final int offset, final int length)
    {
        cardStartDate.wrap(value);
        cardStartDateOffset = offset;
        cardStartDateLength = length;
        return this;
    }

    public SettlInstGroupEncoder cardStartDate(final DirectBuffer value, final int length)
    {
        return cardStartDate(value, 0, length);
    }

    public SettlInstGroupEncoder cardStartDate(final DirectBuffer value)
    {
        return cardStartDate(value, 0, value.capacity());
    }

    public SettlInstGroupEncoder cardStartDate(final byte[] value, final int offset, final int length)
    {
        cardStartDate.wrap(value);
        cardStartDateOffset = offset;
        cardStartDateLength = length;
        return this;
    }

    public SettlInstGroupEncoder cardStartDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(cardStartDate, value, offset, length);
        cardStartDateOffset = offset;
        cardStartDateLength = length;
        return this;
    }

    public SettlInstGroupEncoder cardStartDate(final byte[] value, final int length)
    {
        return cardStartDate(value, 0, length);
    }

    public SettlInstGroupEncoder cardStartDate(final byte[] value)
    {
        return cardStartDate(value, 0, value.length);
    }

    public boolean hasCardStartDate()
    {
        return cardStartDateLength > 0;
    }

    public MutableDirectBuffer cardStartDate()
    {
        return cardStartDate;
    }

    public String cardStartDateAsString()
    {
        return cardStartDate.getStringWithoutLengthAscii(cardStartDateOffset, cardStartDateLength);
    }

    private final MutableDirectBuffer cardExpDate = new UnsafeBuffer();

    private int cardExpDateOffset = 0;

    private int cardExpDateLength = 0;

    public SettlInstGroupEncoder cardExpDate(final DirectBuffer value, final int offset, final int length)
    {
        cardExpDate.wrap(value);
        cardExpDateOffset = offset;
        cardExpDateLength = length;
        return this;
    }

    public SettlInstGroupEncoder cardExpDate(final DirectBuffer value, final int length)
    {
        return cardExpDate(value, 0, length);
    }

    public SettlInstGroupEncoder cardExpDate(final DirectBuffer value)
    {
        return cardExpDate(value, 0, value.capacity());
    }

    public SettlInstGroupEncoder cardExpDate(final byte[] value, final int offset, final int length)
    {
        cardExpDate.wrap(value);
        cardExpDateOffset = offset;
        cardExpDateLength = length;
        return this;
    }

    public SettlInstGroupEncoder cardExpDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(cardExpDate, value, offset, length);
        cardExpDateOffset = offset;
        cardExpDateLength = length;
        return this;
    }

    public SettlInstGroupEncoder cardExpDate(final byte[] value, final int length)
    {
        return cardExpDate(value, 0, length);
    }

    public SettlInstGroupEncoder cardExpDate(final byte[] value)
    {
        return cardExpDate(value, 0, value.length);
    }

    public boolean hasCardExpDate()
    {
        return cardExpDateLength > 0;
    }

    public MutableDirectBuffer cardExpDate()
    {
        return cardExpDate;
    }

    public String cardExpDateAsString()
    {
        return cardExpDate.getStringWithoutLengthAscii(cardExpDateOffset, cardExpDateLength);
    }

    private final MutableDirectBuffer cardIssNum = new UnsafeBuffer();

    private int cardIssNumOffset = 0;

    private int cardIssNumLength = 0;

    public SettlInstGroupEncoder cardIssNum(final DirectBuffer value, final int offset, final int length)
    {
        cardIssNum.wrap(value);
        cardIssNumOffset = offset;
        cardIssNumLength = length;
        return this;
    }

    public SettlInstGroupEncoder cardIssNum(final DirectBuffer value, final int length)
    {
        return cardIssNum(value, 0, length);
    }

    public SettlInstGroupEncoder cardIssNum(final DirectBuffer value)
    {
        return cardIssNum(value, 0, value.capacity());
    }

    public SettlInstGroupEncoder cardIssNum(final byte[] value, final int offset, final int length)
    {
        cardIssNum.wrap(value);
        cardIssNumOffset = offset;
        cardIssNumLength = length;
        return this;
    }

    public SettlInstGroupEncoder cardIssNumAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(cardIssNum, value, offset, length);
        cardIssNumOffset = offset;
        cardIssNumLength = length;
        return this;
    }

    public SettlInstGroupEncoder cardIssNum(final byte[] value, final int length)
    {
        return cardIssNum(value, 0, length);
    }

    public SettlInstGroupEncoder cardIssNum(final byte[] value)
    {
        return cardIssNum(value, 0, value.length);
    }

    public boolean hasCardIssNum()
    {
        return cardIssNumLength > 0;
    }

    public MutableDirectBuffer cardIssNum()
    {
        return cardIssNum;
    }

    public String cardIssNumAsString()
    {
        return cardIssNum.getStringWithoutLengthAscii(cardIssNumOffset, cardIssNumLength);
    }

    public SettlInstGroupEncoder cardIssNum(final CharSequence value)
    {
        toBytes(value, cardIssNum);
        cardIssNumOffset = 0;
        cardIssNumLength = value.length();
        return this;
    }

    public SettlInstGroupEncoder cardIssNum(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            cardIssNum.wrap(buffer);
            cardIssNumOffset = value.offset();
            cardIssNumLength = value.length();
        }
        return this;
    }

    public SettlInstGroupEncoder cardIssNum(final char[] value)
    {
        return cardIssNum(value, 0, value.length);
    }

    public SettlInstGroupEncoder cardIssNum(final char[] value, final int length)
    {
        return cardIssNum(value, 0, length);
    }

    public SettlInstGroupEncoder cardIssNum(final char[] value, final int offset, final int length)
    {
        toBytes(value, cardIssNum, offset, length);
        cardIssNumOffset = 0;
        cardIssNumLength = length;
        return this;
    }

    private final MutableDirectBuffer paymentDate = new UnsafeBuffer();

    private int paymentDateOffset = 0;

    private int paymentDateLength = 0;

    public SettlInstGroupEncoder paymentDate(final DirectBuffer value, final int offset, final int length)
    {
        paymentDate.wrap(value);
        paymentDateOffset = offset;
        paymentDateLength = length;
        return this;
    }

    public SettlInstGroupEncoder paymentDate(final DirectBuffer value, final int length)
    {
        return paymentDate(value, 0, length);
    }

    public SettlInstGroupEncoder paymentDate(final DirectBuffer value)
    {
        return paymentDate(value, 0, value.capacity());
    }

    public SettlInstGroupEncoder paymentDate(final byte[] value, final int offset, final int length)
    {
        paymentDate.wrap(value);
        paymentDateOffset = offset;
        paymentDateLength = length;
        return this;
    }

    public SettlInstGroupEncoder paymentDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(paymentDate, value, offset, length);
        paymentDateOffset = offset;
        paymentDateLength = length;
        return this;
    }

    public SettlInstGroupEncoder paymentDate(final byte[] value, final int length)
    {
        return paymentDate(value, 0, length);
    }

    public SettlInstGroupEncoder paymentDate(final byte[] value)
    {
        return paymentDate(value, 0, value.length);
    }

    public boolean hasPaymentDate()
    {
        return paymentDateLength > 0;
    }

    public MutableDirectBuffer paymentDate()
    {
        return paymentDate;
    }

    public String paymentDateAsString()
    {
        return paymentDate.getStringWithoutLengthAscii(paymentDateOffset, paymentDateLength);
    }

    private final MutableDirectBuffer paymentRemitterID = new UnsafeBuffer();

    private int paymentRemitterIDOffset = 0;

    private int paymentRemitterIDLength = 0;

    public SettlInstGroupEncoder paymentRemitterID(final DirectBuffer value, final int offset, final int length)
    {
        paymentRemitterID.wrap(value);
        paymentRemitterIDOffset = offset;
        paymentRemitterIDLength = length;
        return this;
    }

    public SettlInstGroupEncoder paymentRemitterID(final DirectBuffer value, final int length)
    {
        return paymentRemitterID(value, 0, length);
    }

    public SettlInstGroupEncoder paymentRemitterID(final DirectBuffer value)
    {
        return paymentRemitterID(value, 0, value.capacity());
    }

    public SettlInstGroupEncoder paymentRemitterID(final byte[] value, final int offset, final int length)
    {
        paymentRemitterID.wrap(value);
        paymentRemitterIDOffset = offset;
        paymentRemitterIDLength = length;
        return this;
    }

    public SettlInstGroupEncoder paymentRemitterIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(paymentRemitterID, value, offset, length);
        paymentRemitterIDOffset = offset;
        paymentRemitterIDLength = length;
        return this;
    }

    public SettlInstGroupEncoder paymentRemitterID(final byte[] value, final int length)
    {
        return paymentRemitterID(value, 0, length);
    }

    public SettlInstGroupEncoder paymentRemitterID(final byte[] value)
    {
        return paymentRemitterID(value, 0, value.length);
    }

    public boolean hasPaymentRemitterID()
    {
        return paymentRemitterIDLength > 0;
    }

    public MutableDirectBuffer paymentRemitterID()
    {
        return paymentRemitterID;
    }

    public String paymentRemitterIDAsString()
    {
        return paymentRemitterID.getStringWithoutLengthAscii(paymentRemitterIDOffset, paymentRemitterIDLength);
    }

    public SettlInstGroupEncoder paymentRemitterID(final CharSequence value)
    {
        toBytes(value, paymentRemitterID);
        paymentRemitterIDOffset = 0;
        paymentRemitterIDLength = value.length();
        return this;
    }

    public SettlInstGroupEncoder paymentRemitterID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            paymentRemitterID.wrap(buffer);
            paymentRemitterIDOffset = value.offset();
            paymentRemitterIDLength = value.length();
        }
        return this;
    }

    public SettlInstGroupEncoder paymentRemitterID(final char[] value)
    {
        return paymentRemitterID(value, 0, value.length);
    }

    public SettlInstGroupEncoder paymentRemitterID(final char[] value, final int length)
    {
        return paymentRemitterID(value, 0, length);
    }

    public SettlInstGroupEncoder paymentRemitterID(final char[] value, final int offset, final int length)
    {
        toBytes(value, paymentRemitterID, offset, length);
        paymentRemitterIDOffset = 0;
        paymentRemitterIDLength = length;
        return this;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (settlInstIDLength > 0)
        {
            buffer.putBytes(position, settlInstIDHeader, 0, settlInstIDHeaderLength);
            position += settlInstIDHeaderLength;
            buffer.putBytes(position, settlInstID, settlInstIDOffset, settlInstIDLength);
            position += settlInstIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasSettlInstTransType)
        {
            buffer.putBytes(position, settlInstTransTypeHeader, 0, settlInstTransTypeHeaderLength);
            position += settlInstTransTypeHeaderLength;
            position += buffer.putCharAscii(position, settlInstTransType);
            buffer.putSeparator(position);
            position++;
        }

        if (settlInstRefIDLength > 0)
        {
            buffer.putBytes(position, settlInstRefIDHeader, 0, settlInstRefIDHeaderLength);
            position += settlInstRefIDHeaderLength;
            buffer.putBytes(position, settlInstRefID, settlInstRefIDOffset, settlInstRefIDLength);
            position += settlInstRefIDLength;
            buffer.putSeparator(position);
            position++;
        }

            position += parties.encode(buffer, position);

        if (hasSide)
        {
            buffer.putBytes(position, sideHeader, 0, sideHeaderLength);
            position += sideHeaderLength;
            position += buffer.putCharAscii(position, side);
            buffer.putSeparator(position);
            position++;
        }

        if (hasProduct)
        {
            buffer.putBytes(position, productHeader, 0, productHeaderLength);
            position += productHeaderLength;
            position += buffer.putIntAscii(position, product);
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

        if (cFICodeLength > 0)
        {
            buffer.putBytes(position, cFICodeHeader, 0, cFICodeHeaderLength);
            position += cFICodeHeaderLength;
            buffer.putBytes(position, cFICode, cFICodeOffset, cFICodeLength);
            position += cFICodeLength;
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

            position += settlInstructionsData.encode(buffer, position);

        if (hasPaymentMethod)
        {
            buffer.putBytes(position, paymentMethodHeader, 0, paymentMethodHeaderLength);
            position += paymentMethodHeaderLength;
            position += buffer.putIntAscii(position, paymentMethod);
            buffer.putSeparator(position);
            position++;
        }

        if (paymentRefLength > 0)
        {
            buffer.putBytes(position, paymentRefHeader, 0, paymentRefHeaderLength);
            position += paymentRefHeaderLength;
            buffer.putBytes(position, paymentRef, paymentRefOffset, paymentRefLength);
            position += paymentRefLength;
            buffer.putSeparator(position);
            position++;
        }

        if (cardHolderNameLength > 0)
        {
            buffer.putBytes(position, cardHolderNameHeader, 0, cardHolderNameHeaderLength);
            position += cardHolderNameHeaderLength;
            buffer.putBytes(position, cardHolderName, cardHolderNameOffset, cardHolderNameLength);
            position += cardHolderNameLength;
            buffer.putSeparator(position);
            position++;
        }

        if (cardNumberLength > 0)
        {
            buffer.putBytes(position, cardNumberHeader, 0, cardNumberHeaderLength);
            position += cardNumberHeaderLength;
            buffer.putBytes(position, cardNumber, cardNumberOffset, cardNumberLength);
            position += cardNumberLength;
            buffer.putSeparator(position);
            position++;
        }

        if (cardStartDateLength > 0)
        {
            buffer.putBytes(position, cardStartDateHeader, 0, cardStartDateHeaderLength);
            position += cardStartDateHeaderLength;
            buffer.putBytes(position, cardStartDate, cardStartDateOffset, cardStartDateLength);
            position += cardStartDateLength;
            buffer.putSeparator(position);
            position++;
        }

        if (cardExpDateLength > 0)
        {
            buffer.putBytes(position, cardExpDateHeader, 0, cardExpDateHeaderLength);
            position += cardExpDateHeaderLength;
            buffer.putBytes(position, cardExpDate, cardExpDateOffset, cardExpDateLength);
            position += cardExpDateLength;
            buffer.putSeparator(position);
            position++;
        }

        if (cardIssNumLength > 0)
        {
            buffer.putBytes(position, cardIssNumHeader, 0, cardIssNumHeaderLength);
            position += cardIssNumHeaderLength;
            buffer.putBytes(position, cardIssNum, cardIssNumOffset, cardIssNumLength);
            position += cardIssNumLength;
            buffer.putSeparator(position);
            position++;
        }

        if (paymentDateLength > 0)
        {
            buffer.putBytes(position, paymentDateHeader, 0, paymentDateHeaderLength);
            position += paymentDateHeaderLength;
            buffer.putBytes(position, paymentDate, paymentDateOffset, paymentDateLength);
            position += paymentDateLength;
            buffer.putSeparator(position);
            position++;
        }

        if (paymentRemitterIDLength > 0)
        {
            buffer.putBytes(position, paymentRemitterIDHeader, 0, paymentRemitterIDHeaderLength);
            position += paymentRemitterIDHeaderLength;
            buffer.putBytes(position, paymentRemitterID, paymentRemitterIDOffset, paymentRemitterIDLength);
            position += paymentRemitterIDLength;
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
        this.resetSettlInstID();
        this.resetSettlInstTransType();
        this.resetSettlInstRefID();
        this.resetSide();
        this.resetProduct();
        this.resetSecurityType();
        this.resetCFICode();
        this.resetSettlCurrency();
        this.resetEffectiveTime();
        this.resetExpireTime();
        this.resetLastUpdateTime();
        this.resetPaymentMethod();
        this.resetPaymentRef();
        this.resetCardHolderName();
        this.resetCardNumber();
        this.resetCardStartDate();
        this.resetCardExpDate();
        this.resetCardIssNum();
        this.resetPaymentDate();
        this.resetPaymentRemitterID();
        parties.reset();
        settlInstructionsData.reset();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetSettlInstID()
    {
        settlInstIDLength = 0;
    }

    public void resetSettlInstTransType()
    {
        hasSettlInstTransType = false;
    }

    public void resetSettlInstRefID()
    {
        settlInstRefIDLength = 0;
    }

    public void resetSide()
    {
        hasSide = false;
    }

    public void resetProduct()
    {
        hasProduct = false;
    }

    public void resetSecurityType()
    {
        securityTypeLength = 0;
    }

    public void resetCFICode()
    {
        cFICodeLength = 0;
    }

    public void resetSettlCurrency()
    {
        settlCurrencyLength = 0;
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

    public void resetPaymentMethod()
    {
        hasPaymentMethod = false;
    }

    public void resetPaymentRef()
    {
        paymentRefLength = 0;
    }

    public void resetCardHolderName()
    {
        cardHolderNameLength = 0;
    }

    public void resetCardNumber()
    {
        cardNumberLength = 0;
    }

    public void resetCardStartDate()
    {
        cardStartDateLength = 0;
    }

    public void resetCardExpDate()
    {
        cardExpDateLength = 0;
    }

    public void resetCardIssNum()
    {
        cardIssNumLength = 0;
    }

    public void resetPaymentDate()
    {
        paymentDateLength = 0;
    }

    public void resetPaymentRemitterID()
    {
        paymentRemitterIDLength = 0;
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
        builder.append("\"MessageName\": \"SettlInstGroup\",\n");
        if (hasSettlInstID())
        {
            indent(builder, level);
            builder.append("\"SettlInstID\": \"");
            appendBuffer(builder, settlInstID, settlInstIDOffset, settlInstIDLength);
            builder.append("\",\n");
        }

        if (hasSettlInstTransType())
        {
            indent(builder, level);
            builder.append("\"SettlInstTransType\": \"");
            builder.append(settlInstTransType);
            builder.append("\",\n");
        }

        if (hasSettlInstRefID())
        {
            indent(builder, level);
            builder.append("\"SettlInstRefID\": \"");
            appendBuffer(builder, settlInstRefID, settlInstRefIDOffset, settlInstRefIDLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"Parties\": ");
    parties.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasSide())
        {
            indent(builder, level);
            builder.append("\"Side\": \"");
            builder.append(side);
            builder.append("\",\n");
        }

        if (hasProduct())
        {
            indent(builder, level);
            builder.append("\"Product\": \"");
            builder.append(product);
            builder.append("\",\n");
        }

        if (hasSecurityType())
        {
            indent(builder, level);
            builder.append("\"SecurityType\": \"");
            appendBuffer(builder, securityType, securityTypeOffset, securityTypeLength);
            builder.append("\",\n");
        }

        if (hasCFICode())
        {
            indent(builder, level);
            builder.append("\"CFICode\": \"");
            appendBuffer(builder, cFICode, cFICodeOffset, cFICodeLength);
            builder.append("\",\n");
        }

        if (hasSettlCurrency())
        {
            indent(builder, level);
            builder.append("\"SettlCurrency\": \"");
            appendBuffer(builder, settlCurrency, settlCurrencyOffset, settlCurrencyLength);
            builder.append("\",\n");
        }

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
    builder.append("\"SettlInstructionsData\": ");
    settlInstructionsData.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasPaymentMethod())
        {
            indent(builder, level);
            builder.append("\"PaymentMethod\": \"");
            builder.append(paymentMethod);
            builder.append("\",\n");
        }

        if (hasPaymentRef())
        {
            indent(builder, level);
            builder.append("\"PaymentRef\": \"");
            appendBuffer(builder, paymentRef, paymentRefOffset, paymentRefLength);
            builder.append("\",\n");
        }

        if (hasCardHolderName())
        {
            indent(builder, level);
            builder.append("\"CardHolderName\": \"");
            appendBuffer(builder, cardHolderName, cardHolderNameOffset, cardHolderNameLength);
            builder.append("\",\n");
        }

        if (hasCardNumber())
        {
            indent(builder, level);
            builder.append("\"CardNumber\": \"");
            appendBuffer(builder, cardNumber, cardNumberOffset, cardNumberLength);
            builder.append("\",\n");
        }

        if (hasCardStartDate())
        {
            indent(builder, level);
            builder.append("\"CardStartDate\": \"");
            appendBuffer(builder, cardStartDate, cardStartDateOffset, cardStartDateLength);
            builder.append("\",\n");
        }

        if (hasCardExpDate())
        {
            indent(builder, level);
            builder.append("\"CardExpDate\": \"");
            appendBuffer(builder, cardExpDate, cardExpDateOffset, cardExpDateLength);
            builder.append("\",\n");
        }

        if (hasCardIssNum())
        {
            indent(builder, level);
            builder.append("\"CardIssNum\": \"");
            appendBuffer(builder, cardIssNum, cardIssNumOffset, cardIssNumLength);
            builder.append("\",\n");
        }

        if (hasPaymentDate())
        {
            indent(builder, level);
            builder.append("\"PaymentDate\": \"");
            appendBuffer(builder, paymentDate, paymentDateOffset, paymentDateLength);
            builder.append("\",\n");
        }

        if (hasPaymentRemitterID())
        {
            indent(builder, level);
            builder.append("\"PaymentRemitterID\": \"");
            appendBuffer(builder, paymentRemitterID, paymentRemitterIDOffset, paymentRemitterIDLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public SettlInstGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((SettlInstGroupEncoder)encoder);
    }

    public SettlInstGroupEncoder copyTo(final SettlInstGroupEncoder encoder)
    {
        encoder.reset();
        if (hasSettlInstID())
        {
            encoder.settlInstIDAsCopy(settlInstID.byteArray(), 0, settlInstIDLength);
        }

        if (hasSettlInstTransType())
        {
            encoder.settlInstTransType(this.settlInstTransType());
        }

        if (hasSettlInstRefID())
        {
            encoder.settlInstRefIDAsCopy(settlInstRefID.byteArray(), 0, settlInstRefIDLength);
        }


        parties.copyTo(encoder.parties());
        if (hasSide())
        {
            encoder.side(this.side());
        }

        if (hasProduct())
        {
            encoder.product(this.product());
        }

        if (hasSecurityType())
        {
            encoder.securityTypeAsCopy(securityType.byteArray(), 0, securityTypeLength);
        }

        if (hasCFICode())
        {
            encoder.cFICodeAsCopy(cFICode.byteArray(), 0, cFICodeLength);
        }

        if (hasSettlCurrency())
        {
            encoder.settlCurrencyAsCopy(settlCurrency.byteArray(), 0, settlCurrencyLength);
        }

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


        settlInstructionsData.copyTo(encoder.settlInstructionsData());
        if (hasPaymentMethod())
        {
            encoder.paymentMethod(this.paymentMethod());
        }

        if (hasPaymentRef())
        {
            encoder.paymentRefAsCopy(paymentRef.byteArray(), 0, paymentRefLength);
        }

        if (hasCardHolderName())
        {
            encoder.cardHolderNameAsCopy(cardHolderName.byteArray(), 0, cardHolderNameLength);
        }

        if (hasCardNumber())
        {
            encoder.cardNumberAsCopy(cardNumber.byteArray(), 0, cardNumberLength);
        }

        if (hasCardStartDate())
        {
            encoder.cardStartDateAsCopy(cardStartDate.byteArray(), 0, cardStartDateLength);
        }

        if (hasCardExpDate())
        {
            encoder.cardExpDateAsCopy(cardExpDate.byteArray(), 0, cardExpDateLength);
        }

        if (hasCardIssNum())
        {
            encoder.cardIssNumAsCopy(cardIssNum.byteArray(), 0, cardIssNumLength);
        }

        if (hasPaymentDate())
        {
            encoder.paymentDateAsCopy(paymentDate.byteArray(), 0, paymentDateLength);
        }

        if (hasPaymentRemitterID())
        {
            encoder.paymentRemitterIDAsCopy(paymentRemitterID.byteArray(), 0, paymentRemitterIDLength);
        }
        return encoder;
    }

}
    private int noSettlInstGroupCounter;

    private boolean hasNoSettlInstGroupCounter;

    public boolean hasNoSettlInstGroupCounter()
    {
        return hasNoSettlInstGroupCounter;
    }

    public SettlInstGrpEncoder noSettlInstGroupCounter(int value)
    {
        noSettlInstGroupCounter = value;
        hasNoSettlInstGroupCounter = true;
        return this;
    }

    public int noSettlInstGroupCounter()
    {
        return noSettlInstGroupCounter;
    }


    private SettlInstGroupEncoder settlInstGroup = null;

    public SettlInstGroupEncoder settlInstGroup(final int numberOfElements)
    {
        hasNoSettlInstGroupCounter = true;
        noSettlInstGroupCounter = numberOfElements;
        if (settlInstGroup == null)
        {
            settlInstGroup = new SettlInstGroupEncoder();
        }
        return settlInstGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoSettlInstGroupCounter)
        {
            buffer.putBytes(position, noSettlInstGroupCounterHeader, 0, noSettlInstGroupCounterHeaderLength);
            position += noSettlInstGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noSettlInstGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (settlInstGroup != null)
        {
            position += settlInstGroup.encode(buffer, position, noSettlInstGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetSettlInstGroup();
    }

    public void resetSettlInstGroup()
    {
        if (settlInstGroup != null)
        {
            settlInstGroup.reset();
        }
        noSettlInstGroupCounter = 0;
        hasNoSettlInstGroupCounter = false;
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
        builder.append("\"MessageName\": \"SettlInstGrp\",\n");
        if (hasNoSettlInstGroupCounter)
        {
            indent(builder, level);
            builder.append("\"SettlInstGroup\": [\n");
            final int noSettlInstGroupCounter = this.noSettlInstGroupCounter;
            SettlInstGroupEncoder settlInstGroup = this.settlInstGroup;
            for (int i = 0; i < noSettlInstGroupCounter; i++)
            {
                indent(builder, level);
                settlInstGroup.appendTo(builder, level + 1);
                if (i < (noSettlInstGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                settlInstGroup = settlInstGroup.next();
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
    public SettlInstGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((SettlInstGrpEncoder)encoder);
    }

    public SettlInstGrpEncoder copyTo(final SettlInstGrpEncoder encoder)
    {
        encoder.reset();
        if (hasNoSettlInstGroupCounter)
        {
            final int size = this.noSettlInstGroupCounter;
            SettlInstGroupEncoder settlInstGroup = this.settlInstGroup;
            SettlInstGroupEncoder settlInstGroupEncoder = encoder.settlInstGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (settlInstGroup != null)
                {
                    settlInstGroup.copyTo(settlInstGroupEncoder);
                    settlInstGroup = settlInstGroup.next();
                    settlInstGroupEncoder = settlInstGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
