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


public class SettlementInstructionRequestEncoder implements Encoder
{
    public long messageType()
    {
        return 22081L;
    }

    public SettlementInstructionRequestEncoder()
    {
        header.msgType("AV");
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

    private static final int settlInstReqIDHeaderLength = 4;
    private static final byte[] settlInstReqIDHeader = new byte[] {55, 57, 49, (byte) '='};

    private static final int transactTimeHeaderLength = 3;
    private static final byte[] transactTimeHeader = new byte[] {54, 48, (byte) '='};

    private static final int allocAccountHeaderLength = 3;
    private static final byte[] allocAccountHeader = new byte[] {55, 57, (byte) '='};

    private static final int allocAcctIDSourceHeaderLength = 4;
    private static final byte[] allocAcctIDSourceHeader = new byte[] {54, 54, 49, (byte) '='};

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

    private static final int standInstDbTypeHeaderLength = 4;
    private static final byte[] standInstDbTypeHeader = new byte[] {49, 54, 57, (byte) '='};

    private static final int standInstDbNameHeaderLength = 4;
    private static final byte[] standInstDbNameHeader = new byte[] {49, 55, 48, (byte) '='};

    private static final int standInstDbIDHeaderLength = 4;
    private static final byte[] standInstDbIDHeader = new byte[] {49, 55, 49, (byte) '='};

    private final MutableDirectBuffer settlInstReqID = new UnsafeBuffer();

    private int settlInstReqIDOffset = 0;

    private int settlInstReqIDLength = 0;

    public SettlementInstructionRequestEncoder settlInstReqID(final DirectBuffer value, final int offset, final int length)
    {
        settlInstReqID.wrap(value);
        settlInstReqIDOffset = offset;
        settlInstReqIDLength = length;
        return this;
    }

    public SettlementInstructionRequestEncoder settlInstReqID(final DirectBuffer value, final int length)
    {
        return settlInstReqID(value, 0, length);
    }

    public SettlementInstructionRequestEncoder settlInstReqID(final DirectBuffer value)
    {
        return settlInstReqID(value, 0, value.capacity());
    }

    public SettlementInstructionRequestEncoder settlInstReqID(final byte[] value, final int offset, final int length)
    {
        settlInstReqID.wrap(value);
        settlInstReqIDOffset = offset;
        settlInstReqIDLength = length;
        return this;
    }

    public SettlementInstructionRequestEncoder settlInstReqIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlInstReqID, value, offset, length);
        settlInstReqIDOffset = offset;
        settlInstReqIDLength = length;
        return this;
    }

    public SettlementInstructionRequestEncoder settlInstReqID(final byte[] value, final int length)
    {
        return settlInstReqID(value, 0, length);
    }

    public SettlementInstructionRequestEncoder settlInstReqID(final byte[] value)
    {
        return settlInstReqID(value, 0, value.length);
    }

    public boolean hasSettlInstReqID()
    {
        return settlInstReqIDLength > 0;
    }

    public MutableDirectBuffer settlInstReqID()
    {
        return settlInstReqID;
    }

    public String settlInstReqIDAsString()
    {
        return settlInstReqID.getStringWithoutLengthAscii(settlInstReqIDOffset, settlInstReqIDLength);
    }

    public SettlementInstructionRequestEncoder settlInstReqID(final CharSequence value)
    {
        toBytes(value, settlInstReqID);
        settlInstReqIDOffset = 0;
        settlInstReqIDLength = value.length();
        return this;
    }

    public SettlementInstructionRequestEncoder settlInstReqID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            settlInstReqID.wrap(buffer);
            settlInstReqIDOffset = value.offset();
            settlInstReqIDLength = value.length();
        }
        return this;
    }

    public SettlementInstructionRequestEncoder settlInstReqID(final char[] value)
    {
        return settlInstReqID(value, 0, value.length);
    }

    public SettlementInstructionRequestEncoder settlInstReqID(final char[] value, final int length)
    {
        return settlInstReqID(value, 0, length);
    }

    public SettlementInstructionRequestEncoder settlInstReqID(final char[] value, final int offset, final int length)
    {
        toBytes(value, settlInstReqID, offset, length);
        settlInstReqIDOffset = 0;
        settlInstReqIDLength = length;
        return this;
    }

    private final MutableDirectBuffer transactTime = new UnsafeBuffer();

    private int transactTimeOffset = 0;

    private int transactTimeLength = 0;

    public SettlementInstructionRequestEncoder transactTime(final DirectBuffer value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public SettlementInstructionRequestEncoder transactTime(final DirectBuffer value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public SettlementInstructionRequestEncoder transactTime(final DirectBuffer value)
    {
        return transactTime(value, 0, value.capacity());
    }

    public SettlementInstructionRequestEncoder transactTime(final byte[] value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public SettlementInstructionRequestEncoder transactTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(transactTime, value, offset, length);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public SettlementInstructionRequestEncoder transactTime(final byte[] value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public SettlementInstructionRequestEncoder transactTime(final byte[] value)
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

    private final PartiesEncoder parties = new PartiesEncoder();
    public PartiesEncoder parties()
    {
        return parties;
    }

    private final MutableDirectBuffer allocAccount = new UnsafeBuffer();

    private int allocAccountOffset = 0;

    private int allocAccountLength = 0;

    public SettlementInstructionRequestEncoder allocAccount(final DirectBuffer value, final int offset, final int length)
    {
        allocAccount.wrap(value);
        allocAccountOffset = offset;
        allocAccountLength = length;
        return this;
    }

    public SettlementInstructionRequestEncoder allocAccount(final DirectBuffer value, final int length)
    {
        return allocAccount(value, 0, length);
    }

    public SettlementInstructionRequestEncoder allocAccount(final DirectBuffer value)
    {
        return allocAccount(value, 0, value.capacity());
    }

    public SettlementInstructionRequestEncoder allocAccount(final byte[] value, final int offset, final int length)
    {
        allocAccount.wrap(value);
        allocAccountOffset = offset;
        allocAccountLength = length;
        return this;
    }

    public SettlementInstructionRequestEncoder allocAccountAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(allocAccount, value, offset, length);
        allocAccountOffset = offset;
        allocAccountLength = length;
        return this;
    }

    public SettlementInstructionRequestEncoder allocAccount(final byte[] value, final int length)
    {
        return allocAccount(value, 0, length);
    }

    public SettlementInstructionRequestEncoder allocAccount(final byte[] value)
    {
        return allocAccount(value, 0, value.length);
    }

    public boolean hasAllocAccount()
    {
        return allocAccountLength > 0;
    }

    public MutableDirectBuffer allocAccount()
    {
        return allocAccount;
    }

    public String allocAccountAsString()
    {
        return allocAccount.getStringWithoutLengthAscii(allocAccountOffset, allocAccountLength);
    }

    public SettlementInstructionRequestEncoder allocAccount(final CharSequence value)
    {
        toBytes(value, allocAccount);
        allocAccountOffset = 0;
        allocAccountLength = value.length();
        return this;
    }

    public SettlementInstructionRequestEncoder allocAccount(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            allocAccount.wrap(buffer);
            allocAccountOffset = value.offset();
            allocAccountLength = value.length();
        }
        return this;
    }

    public SettlementInstructionRequestEncoder allocAccount(final char[] value)
    {
        return allocAccount(value, 0, value.length);
    }

    public SettlementInstructionRequestEncoder allocAccount(final char[] value, final int length)
    {
        return allocAccount(value, 0, length);
    }

    public SettlementInstructionRequestEncoder allocAccount(final char[] value, final int offset, final int length)
    {
        toBytes(value, allocAccount, offset, length);
        allocAccountOffset = 0;
        allocAccountLength = length;
        return this;
    }

    private int allocAcctIDSource;

    private boolean hasAllocAcctIDSource;

    public boolean hasAllocAcctIDSource()
    {
        return hasAllocAcctIDSource;
    }

    public SettlementInstructionRequestEncoder allocAcctIDSource(int value)
    {
        allocAcctIDSource = value;
        hasAllocAcctIDSource = true;
        return this;
    }

    public int allocAcctIDSource()
    {
        return allocAcctIDSource;
    }

    private char side;

    private boolean hasSide;

    public boolean hasSide()
    {
        return hasSide;
    }

    public SettlementInstructionRequestEncoder side(char value)
    {
        side = value;
        hasSide = true;
        return this;
    }

    public char side()
    {
        return side;
    }

    public SettlementInstructionRequestEncoder side(Side value)
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

    public SettlementInstructionRequestEncoder product(int value)
    {
        product = value;
        hasProduct = true;
        return this;
    }

    public int product()
    {
        return product;
    }

    public SettlementInstructionRequestEncoder product(Product value)
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

    public SettlementInstructionRequestEncoder securityType(final DirectBuffer value, final int offset, final int length)
    {
        securityType.wrap(value);
        securityTypeOffset = offset;
        securityTypeLength = length;
        return this;
    }

    public SettlementInstructionRequestEncoder securityType(final DirectBuffer value, final int length)
    {
        return securityType(value, 0, length);
    }

    public SettlementInstructionRequestEncoder securityType(final DirectBuffer value)
    {
        return securityType(value, 0, value.capacity());
    }

    public SettlementInstructionRequestEncoder securityType(final byte[] value, final int offset, final int length)
    {
        securityType.wrap(value);
        securityTypeOffset = offset;
        securityTypeLength = length;
        return this;
    }

    public SettlementInstructionRequestEncoder securityTypeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(securityType, value, offset, length);
        securityTypeOffset = offset;
        securityTypeLength = length;
        return this;
    }

    public SettlementInstructionRequestEncoder securityType(final byte[] value, final int length)
    {
        return securityType(value, 0, length);
    }

    public SettlementInstructionRequestEncoder securityType(final byte[] value)
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

    public SettlementInstructionRequestEncoder securityType(final CharSequence value)
    {
        toBytes(value, securityType);
        securityTypeOffset = 0;
        securityTypeLength = value.length();
        return this;
    }

    public SettlementInstructionRequestEncoder securityType(final AsciiSequenceView value)
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

    public SettlementInstructionRequestEncoder securityType(final char[] value)
    {
        return securityType(value, 0, value.length);
    }

    public SettlementInstructionRequestEncoder securityType(final char[] value, final int length)
    {
        return securityType(value, 0, length);
    }

    public SettlementInstructionRequestEncoder securityType(final char[] value, final int offset, final int length)
    {
        toBytes(value, securityType, offset, length);
        securityTypeOffset = 0;
        securityTypeLength = length;
        return this;
    }

    public SettlementInstructionRequestEncoder securityType(SecurityType value)
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

    public SettlementInstructionRequestEncoder cFICode(final DirectBuffer value, final int offset, final int length)
    {
        cFICode.wrap(value);
        cFICodeOffset = offset;
        cFICodeLength = length;
        return this;
    }

    public SettlementInstructionRequestEncoder cFICode(final DirectBuffer value, final int length)
    {
        return cFICode(value, 0, length);
    }

    public SettlementInstructionRequestEncoder cFICode(final DirectBuffer value)
    {
        return cFICode(value, 0, value.capacity());
    }

    public SettlementInstructionRequestEncoder cFICode(final byte[] value, final int offset, final int length)
    {
        cFICode.wrap(value);
        cFICodeOffset = offset;
        cFICodeLength = length;
        return this;
    }

    public SettlementInstructionRequestEncoder cFICodeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(cFICode, value, offset, length);
        cFICodeOffset = offset;
        cFICodeLength = length;
        return this;
    }

    public SettlementInstructionRequestEncoder cFICode(final byte[] value, final int length)
    {
        return cFICode(value, 0, length);
    }

    public SettlementInstructionRequestEncoder cFICode(final byte[] value)
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

    public SettlementInstructionRequestEncoder cFICode(final CharSequence value)
    {
        toBytes(value, cFICode);
        cFICodeOffset = 0;
        cFICodeLength = value.length();
        return this;
    }

    public SettlementInstructionRequestEncoder cFICode(final AsciiSequenceView value)
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

    public SettlementInstructionRequestEncoder cFICode(final char[] value)
    {
        return cFICode(value, 0, value.length);
    }

    public SettlementInstructionRequestEncoder cFICode(final char[] value, final int length)
    {
        return cFICode(value, 0, length);
    }

    public SettlementInstructionRequestEncoder cFICode(final char[] value, final int offset, final int length)
    {
        toBytes(value, cFICode, offset, length);
        cFICodeOffset = 0;
        cFICodeLength = length;
        return this;
    }

    private final MutableDirectBuffer settlCurrency = new UnsafeBuffer();

    private int settlCurrencyOffset = 0;

    private int settlCurrencyLength = 0;

    public SettlementInstructionRequestEncoder settlCurrency(final DirectBuffer value, final int offset, final int length)
    {
        settlCurrency.wrap(value);
        settlCurrencyOffset = offset;
        settlCurrencyLength = length;
        return this;
    }

    public SettlementInstructionRequestEncoder settlCurrency(final DirectBuffer value, final int length)
    {
        return settlCurrency(value, 0, length);
    }

    public SettlementInstructionRequestEncoder settlCurrency(final DirectBuffer value)
    {
        return settlCurrency(value, 0, value.capacity());
    }

    public SettlementInstructionRequestEncoder settlCurrency(final byte[] value, final int offset, final int length)
    {
        settlCurrency.wrap(value);
        settlCurrencyOffset = offset;
        settlCurrencyLength = length;
        return this;
    }

    public SettlementInstructionRequestEncoder settlCurrencyAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlCurrency, value, offset, length);
        settlCurrencyOffset = offset;
        settlCurrencyLength = length;
        return this;
    }

    public SettlementInstructionRequestEncoder settlCurrency(final byte[] value, final int length)
    {
        return settlCurrency(value, 0, length);
    }

    public SettlementInstructionRequestEncoder settlCurrency(final byte[] value)
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

    public SettlementInstructionRequestEncoder settlCurrency(final CharSequence value)
    {
        toBytes(value, settlCurrency);
        settlCurrencyOffset = 0;
        settlCurrencyLength = value.length();
        return this;
    }

    public SettlementInstructionRequestEncoder settlCurrency(final AsciiSequenceView value)
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

    public SettlementInstructionRequestEncoder settlCurrency(final char[] value)
    {
        return settlCurrency(value, 0, value.length);
    }

    public SettlementInstructionRequestEncoder settlCurrency(final char[] value, final int length)
    {
        return settlCurrency(value, 0, length);
    }

    public SettlementInstructionRequestEncoder settlCurrency(final char[] value, final int offset, final int length)
    {
        toBytes(value, settlCurrency, offset, length);
        settlCurrencyOffset = 0;
        settlCurrencyLength = length;
        return this;
    }

    private final MutableDirectBuffer effectiveTime = new UnsafeBuffer();

    private int effectiveTimeOffset = 0;

    private int effectiveTimeLength = 0;

    public SettlementInstructionRequestEncoder effectiveTime(final DirectBuffer value, final int offset, final int length)
    {
        effectiveTime.wrap(value);
        effectiveTimeOffset = offset;
        effectiveTimeLength = length;
        return this;
    }

    public SettlementInstructionRequestEncoder effectiveTime(final DirectBuffer value, final int length)
    {
        return effectiveTime(value, 0, length);
    }

    public SettlementInstructionRequestEncoder effectiveTime(final DirectBuffer value)
    {
        return effectiveTime(value, 0, value.capacity());
    }

    public SettlementInstructionRequestEncoder effectiveTime(final byte[] value, final int offset, final int length)
    {
        effectiveTime.wrap(value);
        effectiveTimeOffset = offset;
        effectiveTimeLength = length;
        return this;
    }

    public SettlementInstructionRequestEncoder effectiveTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(effectiveTime, value, offset, length);
        effectiveTimeOffset = offset;
        effectiveTimeLength = length;
        return this;
    }

    public SettlementInstructionRequestEncoder effectiveTime(final byte[] value, final int length)
    {
        return effectiveTime(value, 0, length);
    }

    public SettlementInstructionRequestEncoder effectiveTime(final byte[] value)
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

    public SettlementInstructionRequestEncoder expireTime(final DirectBuffer value, final int offset, final int length)
    {
        expireTime.wrap(value);
        expireTimeOffset = offset;
        expireTimeLength = length;
        return this;
    }

    public SettlementInstructionRequestEncoder expireTime(final DirectBuffer value, final int length)
    {
        return expireTime(value, 0, length);
    }

    public SettlementInstructionRequestEncoder expireTime(final DirectBuffer value)
    {
        return expireTime(value, 0, value.capacity());
    }

    public SettlementInstructionRequestEncoder expireTime(final byte[] value, final int offset, final int length)
    {
        expireTime.wrap(value);
        expireTimeOffset = offset;
        expireTimeLength = length;
        return this;
    }

    public SettlementInstructionRequestEncoder expireTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(expireTime, value, offset, length);
        expireTimeOffset = offset;
        expireTimeLength = length;
        return this;
    }

    public SettlementInstructionRequestEncoder expireTime(final byte[] value, final int length)
    {
        return expireTime(value, 0, length);
    }

    public SettlementInstructionRequestEncoder expireTime(final byte[] value)
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

    public SettlementInstructionRequestEncoder lastUpdateTime(final DirectBuffer value, final int offset, final int length)
    {
        lastUpdateTime.wrap(value);
        lastUpdateTimeOffset = offset;
        lastUpdateTimeLength = length;
        return this;
    }

    public SettlementInstructionRequestEncoder lastUpdateTime(final DirectBuffer value, final int length)
    {
        return lastUpdateTime(value, 0, length);
    }

    public SettlementInstructionRequestEncoder lastUpdateTime(final DirectBuffer value)
    {
        return lastUpdateTime(value, 0, value.capacity());
    }

    public SettlementInstructionRequestEncoder lastUpdateTime(final byte[] value, final int offset, final int length)
    {
        lastUpdateTime.wrap(value);
        lastUpdateTimeOffset = offset;
        lastUpdateTimeLength = length;
        return this;
    }

    public SettlementInstructionRequestEncoder lastUpdateTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(lastUpdateTime, value, offset, length);
        lastUpdateTimeOffset = offset;
        lastUpdateTimeLength = length;
        return this;
    }

    public SettlementInstructionRequestEncoder lastUpdateTime(final byte[] value, final int length)
    {
        return lastUpdateTime(value, 0, length);
    }

    public SettlementInstructionRequestEncoder lastUpdateTime(final byte[] value)
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

    private int standInstDbType;

    private boolean hasStandInstDbType;

    public boolean hasStandInstDbType()
    {
        return hasStandInstDbType;
    }

    public SettlementInstructionRequestEncoder standInstDbType(int value)
    {
        standInstDbType = value;
        hasStandInstDbType = true;
        return this;
    }

    public int standInstDbType()
    {
        return standInstDbType;
    }

    public SettlementInstructionRequestEncoder standInstDbType(StandInstDbType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == StandInstDbType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: standInstDbType Value: " + value );
            }
            if (value == StandInstDbType.NULL_VAL)
            {
                return this;
            }
        }
        return standInstDbType(value.representation());
    }

    private final MutableDirectBuffer standInstDbName = new UnsafeBuffer();

    private int standInstDbNameOffset = 0;

    private int standInstDbNameLength = 0;

    public SettlementInstructionRequestEncoder standInstDbName(final DirectBuffer value, final int offset, final int length)
    {
        standInstDbName.wrap(value);
        standInstDbNameOffset = offset;
        standInstDbNameLength = length;
        return this;
    }

    public SettlementInstructionRequestEncoder standInstDbName(final DirectBuffer value, final int length)
    {
        return standInstDbName(value, 0, length);
    }

    public SettlementInstructionRequestEncoder standInstDbName(final DirectBuffer value)
    {
        return standInstDbName(value, 0, value.capacity());
    }

    public SettlementInstructionRequestEncoder standInstDbName(final byte[] value, final int offset, final int length)
    {
        standInstDbName.wrap(value);
        standInstDbNameOffset = offset;
        standInstDbNameLength = length;
        return this;
    }

    public SettlementInstructionRequestEncoder standInstDbNameAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(standInstDbName, value, offset, length);
        standInstDbNameOffset = offset;
        standInstDbNameLength = length;
        return this;
    }

    public SettlementInstructionRequestEncoder standInstDbName(final byte[] value, final int length)
    {
        return standInstDbName(value, 0, length);
    }

    public SettlementInstructionRequestEncoder standInstDbName(final byte[] value)
    {
        return standInstDbName(value, 0, value.length);
    }

    public boolean hasStandInstDbName()
    {
        return standInstDbNameLength > 0;
    }

    public MutableDirectBuffer standInstDbName()
    {
        return standInstDbName;
    }

    public String standInstDbNameAsString()
    {
        return standInstDbName.getStringWithoutLengthAscii(standInstDbNameOffset, standInstDbNameLength);
    }

    public SettlementInstructionRequestEncoder standInstDbName(final CharSequence value)
    {
        toBytes(value, standInstDbName);
        standInstDbNameOffset = 0;
        standInstDbNameLength = value.length();
        return this;
    }

    public SettlementInstructionRequestEncoder standInstDbName(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            standInstDbName.wrap(buffer);
            standInstDbNameOffset = value.offset();
            standInstDbNameLength = value.length();
        }
        return this;
    }

    public SettlementInstructionRequestEncoder standInstDbName(final char[] value)
    {
        return standInstDbName(value, 0, value.length);
    }

    public SettlementInstructionRequestEncoder standInstDbName(final char[] value, final int length)
    {
        return standInstDbName(value, 0, length);
    }

    public SettlementInstructionRequestEncoder standInstDbName(final char[] value, final int offset, final int length)
    {
        toBytes(value, standInstDbName, offset, length);
        standInstDbNameOffset = 0;
        standInstDbNameLength = length;
        return this;
    }

    private final MutableDirectBuffer standInstDbID = new UnsafeBuffer();

    private int standInstDbIDOffset = 0;

    private int standInstDbIDLength = 0;

    public SettlementInstructionRequestEncoder standInstDbID(final DirectBuffer value, final int offset, final int length)
    {
        standInstDbID.wrap(value);
        standInstDbIDOffset = offset;
        standInstDbIDLength = length;
        return this;
    }

    public SettlementInstructionRequestEncoder standInstDbID(final DirectBuffer value, final int length)
    {
        return standInstDbID(value, 0, length);
    }

    public SettlementInstructionRequestEncoder standInstDbID(final DirectBuffer value)
    {
        return standInstDbID(value, 0, value.capacity());
    }

    public SettlementInstructionRequestEncoder standInstDbID(final byte[] value, final int offset, final int length)
    {
        standInstDbID.wrap(value);
        standInstDbIDOffset = offset;
        standInstDbIDLength = length;
        return this;
    }

    public SettlementInstructionRequestEncoder standInstDbIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(standInstDbID, value, offset, length);
        standInstDbIDOffset = offset;
        standInstDbIDLength = length;
        return this;
    }

    public SettlementInstructionRequestEncoder standInstDbID(final byte[] value, final int length)
    {
        return standInstDbID(value, 0, length);
    }

    public SettlementInstructionRequestEncoder standInstDbID(final byte[] value)
    {
        return standInstDbID(value, 0, value.length);
    }

    public boolean hasStandInstDbID()
    {
        return standInstDbIDLength > 0;
    }

    public MutableDirectBuffer standInstDbID()
    {
        return standInstDbID;
    }

    public String standInstDbIDAsString()
    {
        return standInstDbID.getStringWithoutLengthAscii(standInstDbIDOffset, standInstDbIDLength);
    }

    public SettlementInstructionRequestEncoder standInstDbID(final CharSequence value)
    {
        toBytes(value, standInstDbID);
        standInstDbIDOffset = 0;
        standInstDbIDLength = value.length();
        return this;
    }

    public SettlementInstructionRequestEncoder standInstDbID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            standInstDbID.wrap(buffer);
            standInstDbIDOffset = value.offset();
            standInstDbIDLength = value.length();
        }
        return this;
    }

    public SettlementInstructionRequestEncoder standInstDbID(final char[] value)
    {
        return standInstDbID(value, 0, value.length);
    }

    public SettlementInstructionRequestEncoder standInstDbID(final char[] value, final int length)
    {
        return standInstDbID(value, 0, length);
    }

    public SettlementInstructionRequestEncoder standInstDbID(final char[] value, final int offset, final int length)
    {
        toBytes(value, standInstDbID, offset, length);
        standInstDbIDOffset = 0;
        standInstDbIDLength = length;
        return this;
    }

    public long encode(final MutableAsciiBuffer buffer, final int offset)
    {
        final long startMessageResult = header.startMessage(buffer, offset);
        final int bodyStart = Encoder.offset(startMessageResult);
        int position = bodyStart + Encoder.length(startMessageResult);

        if (settlInstReqIDLength > 0)
        {
            buffer.putBytes(position, settlInstReqIDHeader, 0, settlInstReqIDHeaderLength);
            position += settlInstReqIDHeaderLength;
            buffer.putBytes(position, settlInstReqID, settlInstReqIDOffset, settlInstReqIDLength);
            position += settlInstReqIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: SettlInstReqID");
        }

        if (transactTimeLength > 0)
        {
            buffer.putBytes(position, transactTimeHeader, 0, transactTimeHeaderLength);
            position += transactTimeHeaderLength;
            buffer.putBytes(position, transactTime, transactTimeOffset, transactTimeLength);
            position += transactTimeLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: TransactTime");
        }

            position += parties.encode(buffer, position);

        if (allocAccountLength > 0)
        {
            buffer.putBytes(position, allocAccountHeader, 0, allocAccountHeaderLength);
            position += allocAccountHeaderLength;
            buffer.putBytes(position, allocAccount, allocAccountOffset, allocAccountLength);
            position += allocAccountLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasAllocAcctIDSource)
        {
            buffer.putBytes(position, allocAcctIDSourceHeader, 0, allocAcctIDSourceHeaderLength);
            position += allocAcctIDSourceHeaderLength;
            position += buffer.putIntAscii(position, allocAcctIDSource);
            buffer.putSeparator(position);
            position++;
        }

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

        if (hasStandInstDbType)
        {
            buffer.putBytes(position, standInstDbTypeHeader, 0, standInstDbTypeHeaderLength);
            position += standInstDbTypeHeaderLength;
            position += buffer.putIntAscii(position, standInstDbType);
            buffer.putSeparator(position);
            position++;
        }

        if (standInstDbNameLength > 0)
        {
            buffer.putBytes(position, standInstDbNameHeader, 0, standInstDbNameHeaderLength);
            position += standInstDbNameHeaderLength;
            buffer.putBytes(position, standInstDbName, standInstDbNameOffset, standInstDbNameLength);
            position += standInstDbNameLength;
            buffer.putSeparator(position);
            position++;
        }

        if (standInstDbIDLength > 0)
        {
            buffer.putBytes(position, standInstDbIDHeader, 0, standInstDbIDHeaderLength);
            position += standInstDbIDHeaderLength;
            buffer.putBytes(position, standInstDbID, standInstDbIDOffset, standInstDbIDLength);
            position += standInstDbIDLength;
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
        this.resetSettlInstReqID();
        this.resetTransactTime();
        this.resetAllocAccount();
        this.resetAllocAcctIDSource();
        this.resetSide();
        this.resetProduct();
        this.resetSecurityType();
        this.resetCFICode();
        this.resetSettlCurrency();
        this.resetEffectiveTime();
        this.resetExpireTime();
        this.resetLastUpdateTime();
        this.resetStandInstDbType();
        this.resetStandInstDbName();
        this.resetStandInstDbID();
        parties.reset();
    }

    public void resetSettlInstReqID()
    {
        settlInstReqIDLength = 0;
    }

    public void resetTransactTime()
    {
        transactTimeLength = 0;
    }

    public void resetAllocAccount()
    {
        allocAccountLength = 0;
    }

    public void resetAllocAcctIDSource()
    {
        hasAllocAcctIDSource = false;
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

    public void resetStandInstDbType()
    {
        hasStandInstDbType = false;
    }

    public void resetStandInstDbName()
    {
        standInstDbNameLength = 0;
    }

    public void resetStandInstDbID()
    {
        standInstDbIDLength = 0;
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
        builder.append("\"MessageName\": \"SettlementInstructionRequest\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasSettlInstReqID())
        {
            indent(builder, level);
            builder.append("\"SettlInstReqID\": \"");
            appendBuffer(builder, settlInstReqID, settlInstReqIDOffset, settlInstReqIDLength);
            builder.append("\",\n");
        }

        if (hasTransactTime())
        {
            indent(builder, level);
            builder.append("\"TransactTime\": \"");
            appendBuffer(builder, transactTime, transactTimeOffset, transactTimeLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"Parties\": ");
    parties.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasAllocAccount())
        {
            indent(builder, level);
            builder.append("\"AllocAccount\": \"");
            appendBuffer(builder, allocAccount, allocAccountOffset, allocAccountLength);
            builder.append("\",\n");
        }

        if (hasAllocAcctIDSource())
        {
            indent(builder, level);
            builder.append("\"AllocAcctIDSource\": \"");
            builder.append(allocAcctIDSource);
            builder.append("\",\n");
        }

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

        if (hasStandInstDbType())
        {
            indent(builder, level);
            builder.append("\"StandInstDbType\": \"");
            builder.append(standInstDbType);
            builder.append("\",\n");
        }

        if (hasStandInstDbName())
        {
            indent(builder, level);
            builder.append("\"StandInstDbName\": \"");
            appendBuffer(builder, standInstDbName, standInstDbNameOffset, standInstDbNameLength);
            builder.append("\",\n");
        }

        if (hasStandInstDbID())
        {
            indent(builder, level);
            builder.append("\"StandInstDbID\": \"");
            appendBuffer(builder, standInstDbID, standInstDbIDOffset, standInstDbIDLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public SettlementInstructionRequestEncoder copyTo(final Encoder encoder)
    {
        return copyTo((SettlementInstructionRequestEncoder)encoder);
    }

    public SettlementInstructionRequestEncoder copyTo(final SettlementInstructionRequestEncoder encoder)
    {
        encoder.reset();
        if (hasSettlInstReqID())
        {
            encoder.settlInstReqIDAsCopy(settlInstReqID.byteArray(), 0, settlInstReqIDLength);
        }

        if (hasTransactTime())
        {
            encoder.transactTimeAsCopy(transactTime.byteArray(), 0, transactTimeLength);
        }


        parties.copyTo(encoder.parties());
        if (hasAllocAccount())
        {
            encoder.allocAccountAsCopy(allocAccount.byteArray(), 0, allocAccountLength);
        }

        if (hasAllocAcctIDSource())
        {
            encoder.allocAcctIDSource(this.allocAcctIDSource());
        }

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

        if (hasStandInstDbType())
        {
            encoder.standInstDbType(this.standInstDbType());
        }

        if (hasStandInstDbName())
        {
            encoder.standInstDbNameAsCopy(standInstDbName.byteArray(), 0, standInstDbNameLength);
        }

        if (hasStandInstDbID())
        {
            encoder.standInstDbIDAsCopy(standInstDbID.byteArray(), 0, standInstDbIDLength);
        }
        return encoder;
    }

}
