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


public class CollateralAssignmentEncoder implements Encoder
{
    public long messageType()
    {
        return 22849L;
    }

    public CollateralAssignmentEncoder()
    {
        header.msgType("AY");
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

    private static final int collAsgnIDHeaderLength = 4;
    private static final byte[] collAsgnIDHeader = new byte[] {57, 48, 50, (byte) '='};

    private static final int collReqIDHeaderLength = 4;
    private static final byte[] collReqIDHeader = new byte[] {56, 57, 52, (byte) '='};

    private static final int collAsgnReasonHeaderLength = 4;
    private static final byte[] collAsgnReasonHeader = new byte[] {56, 57, 53, (byte) '='};

    private static final int collAsgnTransTypeHeaderLength = 4;
    private static final byte[] collAsgnTransTypeHeader = new byte[] {57, 48, 51, (byte) '='};

    private static final int collAsgnRefIDHeaderLength = 4;
    private static final byte[] collAsgnRefIDHeader = new byte[] {57, 48, 55, (byte) '='};

    private static final int transactTimeHeaderLength = 3;
    private static final byte[] transactTimeHeader = new byte[] {54, 48, (byte) '='};

    private static final int expireTimeHeaderLength = 4;
    private static final byte[] expireTimeHeader = new byte[] {49, 50, 54, (byte) '='};

    private static final int accountHeaderLength = 2;
    private static final byte[] accountHeader = new byte[] {49, (byte) '='};

    private static final int accountTypeHeaderLength = 4;
    private static final byte[] accountTypeHeader = new byte[] {53, 56, 49, (byte) '='};

    private static final int clOrdIDHeaderLength = 3;
    private static final byte[] clOrdIDHeader = new byte[] {49, 49, (byte) '='};

    private static final int orderIDHeaderLength = 3;
    private static final byte[] orderIDHeader = new byte[] {51, 55, (byte) '='};

    private static final int secondaryOrderIDHeaderLength = 4;
    private static final byte[] secondaryOrderIDHeader = new byte[] {49, 57, 56, (byte) '='};

    private static final int secondaryClOrdIDHeaderLength = 4;
    private static final byte[] secondaryClOrdIDHeader = new byte[] {53, 50, 54, (byte) '='};

    private static final int noExecsGroupCounterHeaderLength = 4;
    private static final byte[] noExecsGroupCounterHeader = new byte[] {49, 50, 52, (byte) '='};

    private static final int noTradesGroupCounterHeaderLength = 4;
    private static final byte[] noTradesGroupCounterHeader = new byte[] {56, 57, 55, (byte) '='};

    private static final int settlDateHeaderLength = 3;
    private static final byte[] settlDateHeader = new byte[] {54, 52, (byte) '='};

    private static final int quantityHeaderLength = 3;
    private static final byte[] quantityHeader = new byte[] {53, 51, (byte) '='};

    private static final int qtyTypeHeaderLength = 4;
    private static final byte[] qtyTypeHeader = new byte[] {56, 53, 52, (byte) '='};

    private static final int currencyHeaderLength = 3;
    private static final byte[] currencyHeader = new byte[] {49, 53, (byte) '='};

    private static final int noLegsGroupCounterHeaderLength = 4;
    private static final byte[] noLegsGroupCounterHeader = new byte[] {53, 53, 53, (byte) '='};

    private static final int noUnderlyingsGroupCounterHeaderLength = 4;
    private static final byte[] noUnderlyingsGroupCounterHeader = new byte[] {55, 49, 49, (byte) '='};

    private static final int marginExcessHeaderLength = 4;
    private static final byte[] marginExcessHeader = new byte[] {56, 57, 57, (byte) '='};

    private static final int totalNetValueHeaderLength = 4;
    private static final byte[] totalNetValueHeader = new byte[] {57, 48, 48, (byte) '='};

    private static final int cashOutstandingHeaderLength = 4;
    private static final byte[] cashOutstandingHeader = new byte[] {57, 48, 49, (byte) '='};

    private static final int sideHeaderLength = 3;
    private static final byte[] sideHeader = new byte[] {53, 52, (byte) '='};

    private static final int noMiscFeesGroupCounterHeaderLength = 4;
    private static final byte[] noMiscFeesGroupCounterHeader = new byte[] {49, 51, 54, (byte) '='};

    private static final int priceHeaderLength = 3;
    private static final byte[] priceHeader = new byte[] {52, 52, (byte) '='};

    private static final int priceTypeHeaderLength = 4;
    private static final byte[] priceTypeHeader = new byte[] {52, 50, 51, (byte) '='};

    private static final int accruedInterestAmtHeaderLength = 4;
    private static final byte[] accruedInterestAmtHeader = new byte[] {49, 53, 57, (byte) '='};

    private static final int endAccruedInterestAmtHeaderLength = 4;
    private static final byte[] endAccruedInterestAmtHeader = new byte[] {57, 50, 48, (byte) '='};

    private static final int startCashHeaderLength = 4;
    private static final byte[] startCashHeader = new byte[] {57, 50, 49, (byte) '='};

    private static final int endCashHeaderLength = 4;
    private static final byte[] endCashHeader = new byte[] {57, 50, 50, (byte) '='};

    private static final int tradingSessionIDHeaderLength = 4;
    private static final byte[] tradingSessionIDHeader = new byte[] {51, 51, 54, (byte) '='};

    private static final int tradingSessionSubIDHeaderLength = 4;
    private static final byte[] tradingSessionSubIDHeader = new byte[] {54, 50, 53, (byte) '='};

    private static final int settlSessIDHeaderLength = 4;
    private static final byte[] settlSessIDHeader = new byte[] {55, 49, 54, (byte) '='};

    private static final int settlSessSubIDHeaderLength = 4;
    private static final byte[] settlSessSubIDHeader = new byte[] {55, 49, 55, (byte) '='};

    private static final int clearingBusinessDateHeaderLength = 4;
    private static final byte[] clearingBusinessDateHeader = new byte[] {55, 49, 53, (byte) '='};

    private static final int textHeaderLength = 3;
    private static final byte[] textHeader = new byte[] {53, 56, (byte) '='};

    private static final int encodedTextLenHeaderLength = 4;
    private static final byte[] encodedTextLenHeader = new byte[] {51, 53, 52, (byte) '='};

    private static final int encodedTextHeaderLength = 4;
    private static final byte[] encodedTextHeader = new byte[] {51, 53, 53, (byte) '='};

    private final MutableDirectBuffer collAsgnID = new UnsafeBuffer();

    private int collAsgnIDOffset = 0;

    private int collAsgnIDLength = 0;

    public CollateralAssignmentEncoder collAsgnID(final DirectBuffer value, final int offset, final int length)
    {
        collAsgnID.wrap(value);
        collAsgnIDOffset = offset;
        collAsgnIDLength = length;
        return this;
    }

    public CollateralAssignmentEncoder collAsgnID(final DirectBuffer value, final int length)
    {
        return collAsgnID(value, 0, length);
    }

    public CollateralAssignmentEncoder collAsgnID(final DirectBuffer value)
    {
        return collAsgnID(value, 0, value.capacity());
    }

    public CollateralAssignmentEncoder collAsgnID(final byte[] value, final int offset, final int length)
    {
        collAsgnID.wrap(value);
        collAsgnIDOffset = offset;
        collAsgnIDLength = length;
        return this;
    }

    public CollateralAssignmentEncoder collAsgnIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(collAsgnID, value, offset, length);
        collAsgnIDOffset = offset;
        collAsgnIDLength = length;
        return this;
    }

    public CollateralAssignmentEncoder collAsgnID(final byte[] value, final int length)
    {
        return collAsgnID(value, 0, length);
    }

    public CollateralAssignmentEncoder collAsgnID(final byte[] value)
    {
        return collAsgnID(value, 0, value.length);
    }

    public boolean hasCollAsgnID()
    {
        return collAsgnIDLength > 0;
    }

    public MutableDirectBuffer collAsgnID()
    {
        return collAsgnID;
    }

    public String collAsgnIDAsString()
    {
        return collAsgnID.getStringWithoutLengthAscii(collAsgnIDOffset, collAsgnIDLength);
    }

    public CollateralAssignmentEncoder collAsgnID(final CharSequence value)
    {
        toBytes(value, collAsgnID);
        collAsgnIDOffset = 0;
        collAsgnIDLength = value.length();
        return this;
    }

    public CollateralAssignmentEncoder collAsgnID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            collAsgnID.wrap(buffer);
            collAsgnIDOffset = value.offset();
            collAsgnIDLength = value.length();
        }
        return this;
    }

    public CollateralAssignmentEncoder collAsgnID(final char[] value)
    {
        return collAsgnID(value, 0, value.length);
    }

    public CollateralAssignmentEncoder collAsgnID(final char[] value, final int length)
    {
        return collAsgnID(value, 0, length);
    }

    public CollateralAssignmentEncoder collAsgnID(final char[] value, final int offset, final int length)
    {
        toBytes(value, collAsgnID, offset, length);
        collAsgnIDOffset = 0;
        collAsgnIDLength = length;
        return this;
    }

    private final MutableDirectBuffer collReqID = new UnsafeBuffer();

    private int collReqIDOffset = 0;

    private int collReqIDLength = 0;

    public CollateralAssignmentEncoder collReqID(final DirectBuffer value, final int offset, final int length)
    {
        collReqID.wrap(value);
        collReqIDOffset = offset;
        collReqIDLength = length;
        return this;
    }

    public CollateralAssignmentEncoder collReqID(final DirectBuffer value, final int length)
    {
        return collReqID(value, 0, length);
    }

    public CollateralAssignmentEncoder collReqID(final DirectBuffer value)
    {
        return collReqID(value, 0, value.capacity());
    }

    public CollateralAssignmentEncoder collReqID(final byte[] value, final int offset, final int length)
    {
        collReqID.wrap(value);
        collReqIDOffset = offset;
        collReqIDLength = length;
        return this;
    }

    public CollateralAssignmentEncoder collReqIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(collReqID, value, offset, length);
        collReqIDOffset = offset;
        collReqIDLength = length;
        return this;
    }

    public CollateralAssignmentEncoder collReqID(final byte[] value, final int length)
    {
        return collReqID(value, 0, length);
    }

    public CollateralAssignmentEncoder collReqID(final byte[] value)
    {
        return collReqID(value, 0, value.length);
    }

    public boolean hasCollReqID()
    {
        return collReqIDLength > 0;
    }

    public MutableDirectBuffer collReqID()
    {
        return collReqID;
    }

    public String collReqIDAsString()
    {
        return collReqID.getStringWithoutLengthAscii(collReqIDOffset, collReqIDLength);
    }

    public CollateralAssignmentEncoder collReqID(final CharSequence value)
    {
        toBytes(value, collReqID);
        collReqIDOffset = 0;
        collReqIDLength = value.length();
        return this;
    }

    public CollateralAssignmentEncoder collReqID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            collReqID.wrap(buffer);
            collReqIDOffset = value.offset();
            collReqIDLength = value.length();
        }
        return this;
    }

    public CollateralAssignmentEncoder collReqID(final char[] value)
    {
        return collReqID(value, 0, value.length);
    }

    public CollateralAssignmentEncoder collReqID(final char[] value, final int length)
    {
        return collReqID(value, 0, length);
    }

    public CollateralAssignmentEncoder collReqID(final char[] value, final int offset, final int length)
    {
        toBytes(value, collReqID, offset, length);
        collReqIDOffset = 0;
        collReqIDLength = length;
        return this;
    }

    private int collAsgnReason;

    private boolean hasCollAsgnReason;

    public boolean hasCollAsgnReason()
    {
        return hasCollAsgnReason;
    }

    public CollateralAssignmentEncoder collAsgnReason(int value)
    {
        collAsgnReason = value;
        hasCollAsgnReason = true;
        return this;
    }

    public int collAsgnReason()
    {
        return collAsgnReason;
    }

    public CollateralAssignmentEncoder collAsgnReason(CollAsgnReason value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == CollAsgnReason.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: collAsgnReason Value: " + value );
            }
            if (value == CollAsgnReason.NULL_VAL)
            {
                return this;
            }
        }
        return collAsgnReason(value.representation());
    }

    private int collAsgnTransType;

    private boolean hasCollAsgnTransType;

    public boolean hasCollAsgnTransType()
    {
        return hasCollAsgnTransType;
    }

    public CollateralAssignmentEncoder collAsgnTransType(int value)
    {
        collAsgnTransType = value;
        hasCollAsgnTransType = true;
        return this;
    }

    public int collAsgnTransType()
    {
        return collAsgnTransType;
    }

    public CollateralAssignmentEncoder collAsgnTransType(CollAsgnTransType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == CollAsgnTransType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: collAsgnTransType Value: " + value );
            }
            if (value == CollAsgnTransType.NULL_VAL)
            {
                return this;
            }
        }
        return collAsgnTransType(value.representation());
    }

    private final MutableDirectBuffer collAsgnRefID = new UnsafeBuffer();

    private int collAsgnRefIDOffset = 0;

    private int collAsgnRefIDLength = 0;

    public CollateralAssignmentEncoder collAsgnRefID(final DirectBuffer value, final int offset, final int length)
    {
        collAsgnRefID.wrap(value);
        collAsgnRefIDOffset = offset;
        collAsgnRefIDLength = length;
        return this;
    }

    public CollateralAssignmentEncoder collAsgnRefID(final DirectBuffer value, final int length)
    {
        return collAsgnRefID(value, 0, length);
    }

    public CollateralAssignmentEncoder collAsgnRefID(final DirectBuffer value)
    {
        return collAsgnRefID(value, 0, value.capacity());
    }

    public CollateralAssignmentEncoder collAsgnRefID(final byte[] value, final int offset, final int length)
    {
        collAsgnRefID.wrap(value);
        collAsgnRefIDOffset = offset;
        collAsgnRefIDLength = length;
        return this;
    }

    public CollateralAssignmentEncoder collAsgnRefIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(collAsgnRefID, value, offset, length);
        collAsgnRefIDOffset = offset;
        collAsgnRefIDLength = length;
        return this;
    }

    public CollateralAssignmentEncoder collAsgnRefID(final byte[] value, final int length)
    {
        return collAsgnRefID(value, 0, length);
    }

    public CollateralAssignmentEncoder collAsgnRefID(final byte[] value)
    {
        return collAsgnRefID(value, 0, value.length);
    }

    public boolean hasCollAsgnRefID()
    {
        return collAsgnRefIDLength > 0;
    }

    public MutableDirectBuffer collAsgnRefID()
    {
        return collAsgnRefID;
    }

    public String collAsgnRefIDAsString()
    {
        return collAsgnRefID.getStringWithoutLengthAscii(collAsgnRefIDOffset, collAsgnRefIDLength);
    }

    public CollateralAssignmentEncoder collAsgnRefID(final CharSequence value)
    {
        toBytes(value, collAsgnRefID);
        collAsgnRefIDOffset = 0;
        collAsgnRefIDLength = value.length();
        return this;
    }

    public CollateralAssignmentEncoder collAsgnRefID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            collAsgnRefID.wrap(buffer);
            collAsgnRefIDOffset = value.offset();
            collAsgnRefIDLength = value.length();
        }
        return this;
    }

    public CollateralAssignmentEncoder collAsgnRefID(final char[] value)
    {
        return collAsgnRefID(value, 0, value.length);
    }

    public CollateralAssignmentEncoder collAsgnRefID(final char[] value, final int length)
    {
        return collAsgnRefID(value, 0, length);
    }

    public CollateralAssignmentEncoder collAsgnRefID(final char[] value, final int offset, final int length)
    {
        toBytes(value, collAsgnRefID, offset, length);
        collAsgnRefIDOffset = 0;
        collAsgnRefIDLength = length;
        return this;
    }

    private final MutableDirectBuffer transactTime = new UnsafeBuffer();

    private int transactTimeOffset = 0;

    private int transactTimeLength = 0;

    public CollateralAssignmentEncoder transactTime(final DirectBuffer value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public CollateralAssignmentEncoder transactTime(final DirectBuffer value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public CollateralAssignmentEncoder transactTime(final DirectBuffer value)
    {
        return transactTime(value, 0, value.capacity());
    }

    public CollateralAssignmentEncoder transactTime(final byte[] value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public CollateralAssignmentEncoder transactTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(transactTime, value, offset, length);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public CollateralAssignmentEncoder transactTime(final byte[] value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public CollateralAssignmentEncoder transactTime(final byte[] value)
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

    private final MutableDirectBuffer expireTime = new UnsafeBuffer();

    private int expireTimeOffset = 0;

    private int expireTimeLength = 0;

    public CollateralAssignmentEncoder expireTime(final DirectBuffer value, final int offset, final int length)
    {
        expireTime.wrap(value);
        expireTimeOffset = offset;
        expireTimeLength = length;
        return this;
    }

    public CollateralAssignmentEncoder expireTime(final DirectBuffer value, final int length)
    {
        return expireTime(value, 0, length);
    }

    public CollateralAssignmentEncoder expireTime(final DirectBuffer value)
    {
        return expireTime(value, 0, value.capacity());
    }

    public CollateralAssignmentEncoder expireTime(final byte[] value, final int offset, final int length)
    {
        expireTime.wrap(value);
        expireTimeOffset = offset;
        expireTimeLength = length;
        return this;
    }

    public CollateralAssignmentEncoder expireTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(expireTime, value, offset, length);
        expireTimeOffset = offset;
        expireTimeLength = length;
        return this;
    }

    public CollateralAssignmentEncoder expireTime(final byte[] value, final int length)
    {
        return expireTime(value, 0, length);
    }

    public CollateralAssignmentEncoder expireTime(final byte[] value)
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

    private final PartiesEncoder parties = new PartiesEncoder();
    public PartiesEncoder parties()
    {
        return parties;
    }

    private final MutableDirectBuffer account = new UnsafeBuffer();

    private int accountOffset = 0;

    private int accountLength = 0;

    public CollateralAssignmentEncoder account(final DirectBuffer value, final int offset, final int length)
    {
        account.wrap(value);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    public CollateralAssignmentEncoder account(final DirectBuffer value, final int length)
    {
        return account(value, 0, length);
    }

    public CollateralAssignmentEncoder account(final DirectBuffer value)
    {
        return account(value, 0, value.capacity());
    }

    public CollateralAssignmentEncoder account(final byte[] value, final int offset, final int length)
    {
        account.wrap(value);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    public CollateralAssignmentEncoder accountAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(account, value, offset, length);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    public CollateralAssignmentEncoder account(final byte[] value, final int length)
    {
        return account(value, 0, length);
    }

    public CollateralAssignmentEncoder account(final byte[] value)
    {
        return account(value, 0, value.length);
    }

    public boolean hasAccount()
    {
        return accountLength > 0;
    }

    public MutableDirectBuffer account()
    {
        return account;
    }

    public String accountAsString()
    {
        return account.getStringWithoutLengthAscii(accountOffset, accountLength);
    }

    public CollateralAssignmentEncoder account(final CharSequence value)
    {
        toBytes(value, account);
        accountOffset = 0;
        accountLength = value.length();
        return this;
    }

    public CollateralAssignmentEncoder account(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            account.wrap(buffer);
            accountOffset = value.offset();
            accountLength = value.length();
        }
        return this;
    }

    public CollateralAssignmentEncoder account(final char[] value)
    {
        return account(value, 0, value.length);
    }

    public CollateralAssignmentEncoder account(final char[] value, final int length)
    {
        return account(value, 0, length);
    }

    public CollateralAssignmentEncoder account(final char[] value, final int offset, final int length)
    {
        toBytes(value, account, offset, length);
        accountOffset = 0;
        accountLength = length;
        return this;
    }

    private int accountType;

    private boolean hasAccountType;

    public boolean hasAccountType()
    {
        return hasAccountType;
    }

    public CollateralAssignmentEncoder accountType(int value)
    {
        accountType = value;
        hasAccountType = true;
        return this;
    }

    public int accountType()
    {
        return accountType;
    }

    public CollateralAssignmentEncoder accountType(AccountType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == AccountType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: accountType Value: " + value );
            }
            if (value == AccountType.NULL_VAL)
            {
                return this;
            }
        }
        return accountType(value.representation());
    }

    private final MutableDirectBuffer clOrdID = new UnsafeBuffer();

    private int clOrdIDOffset = 0;

    private int clOrdIDLength = 0;

    public CollateralAssignmentEncoder clOrdID(final DirectBuffer value, final int offset, final int length)
    {
        clOrdID.wrap(value);
        clOrdIDOffset = offset;
        clOrdIDLength = length;
        return this;
    }

    public CollateralAssignmentEncoder clOrdID(final DirectBuffer value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    public CollateralAssignmentEncoder clOrdID(final DirectBuffer value)
    {
        return clOrdID(value, 0, value.capacity());
    }

    public CollateralAssignmentEncoder clOrdID(final byte[] value, final int offset, final int length)
    {
        clOrdID.wrap(value);
        clOrdIDOffset = offset;
        clOrdIDLength = length;
        return this;
    }

    public CollateralAssignmentEncoder clOrdIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(clOrdID, value, offset, length);
        clOrdIDOffset = offset;
        clOrdIDLength = length;
        return this;
    }

    public CollateralAssignmentEncoder clOrdID(final byte[] value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    public CollateralAssignmentEncoder clOrdID(final byte[] value)
    {
        return clOrdID(value, 0, value.length);
    }

    public boolean hasClOrdID()
    {
        return clOrdIDLength > 0;
    }

    public MutableDirectBuffer clOrdID()
    {
        return clOrdID;
    }

    public String clOrdIDAsString()
    {
        return clOrdID.getStringWithoutLengthAscii(clOrdIDOffset, clOrdIDLength);
    }

    public CollateralAssignmentEncoder clOrdID(final CharSequence value)
    {
        toBytes(value, clOrdID);
        clOrdIDOffset = 0;
        clOrdIDLength = value.length();
        return this;
    }

    public CollateralAssignmentEncoder clOrdID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            clOrdID.wrap(buffer);
            clOrdIDOffset = value.offset();
            clOrdIDLength = value.length();
        }
        return this;
    }

    public CollateralAssignmentEncoder clOrdID(final char[] value)
    {
        return clOrdID(value, 0, value.length);
    }

    public CollateralAssignmentEncoder clOrdID(final char[] value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    public CollateralAssignmentEncoder clOrdID(final char[] value, final int offset, final int length)
    {
        toBytes(value, clOrdID, offset, length);
        clOrdIDOffset = 0;
        clOrdIDLength = length;
        return this;
    }

    private final MutableDirectBuffer orderID = new UnsafeBuffer();

    private int orderIDOffset = 0;

    private int orderIDLength = 0;

    public CollateralAssignmentEncoder orderID(final DirectBuffer value, final int offset, final int length)
    {
        orderID.wrap(value);
        orderIDOffset = offset;
        orderIDLength = length;
        return this;
    }

    public CollateralAssignmentEncoder orderID(final DirectBuffer value, final int length)
    {
        return orderID(value, 0, length);
    }

    public CollateralAssignmentEncoder orderID(final DirectBuffer value)
    {
        return orderID(value, 0, value.capacity());
    }

    public CollateralAssignmentEncoder orderID(final byte[] value, final int offset, final int length)
    {
        orderID.wrap(value);
        orderIDOffset = offset;
        orderIDLength = length;
        return this;
    }

    public CollateralAssignmentEncoder orderIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(orderID, value, offset, length);
        orderIDOffset = offset;
        orderIDLength = length;
        return this;
    }

    public CollateralAssignmentEncoder orderID(final byte[] value, final int length)
    {
        return orderID(value, 0, length);
    }

    public CollateralAssignmentEncoder orderID(final byte[] value)
    {
        return orderID(value, 0, value.length);
    }

    public boolean hasOrderID()
    {
        return orderIDLength > 0;
    }

    public MutableDirectBuffer orderID()
    {
        return orderID;
    }

    public String orderIDAsString()
    {
        return orderID.getStringWithoutLengthAscii(orderIDOffset, orderIDLength);
    }

    public CollateralAssignmentEncoder orderID(final CharSequence value)
    {
        toBytes(value, orderID);
        orderIDOffset = 0;
        orderIDLength = value.length();
        return this;
    }

    public CollateralAssignmentEncoder orderID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            orderID.wrap(buffer);
            orderIDOffset = value.offset();
            orderIDLength = value.length();
        }
        return this;
    }

    public CollateralAssignmentEncoder orderID(final char[] value)
    {
        return orderID(value, 0, value.length);
    }

    public CollateralAssignmentEncoder orderID(final char[] value, final int length)
    {
        return orderID(value, 0, length);
    }

    public CollateralAssignmentEncoder orderID(final char[] value, final int offset, final int length)
    {
        toBytes(value, orderID, offset, length);
        orderIDOffset = 0;
        orderIDLength = length;
        return this;
    }

    private final MutableDirectBuffer secondaryOrderID = new UnsafeBuffer();

    private int secondaryOrderIDOffset = 0;

    private int secondaryOrderIDLength = 0;

    public CollateralAssignmentEncoder secondaryOrderID(final DirectBuffer value, final int offset, final int length)
    {
        secondaryOrderID.wrap(value);
        secondaryOrderIDOffset = offset;
        secondaryOrderIDLength = length;
        return this;
    }

    public CollateralAssignmentEncoder secondaryOrderID(final DirectBuffer value, final int length)
    {
        return secondaryOrderID(value, 0, length);
    }

    public CollateralAssignmentEncoder secondaryOrderID(final DirectBuffer value)
    {
        return secondaryOrderID(value, 0, value.capacity());
    }

    public CollateralAssignmentEncoder secondaryOrderID(final byte[] value, final int offset, final int length)
    {
        secondaryOrderID.wrap(value);
        secondaryOrderIDOffset = offset;
        secondaryOrderIDLength = length;
        return this;
    }

    public CollateralAssignmentEncoder secondaryOrderIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(secondaryOrderID, value, offset, length);
        secondaryOrderIDOffset = offset;
        secondaryOrderIDLength = length;
        return this;
    }

    public CollateralAssignmentEncoder secondaryOrderID(final byte[] value, final int length)
    {
        return secondaryOrderID(value, 0, length);
    }

    public CollateralAssignmentEncoder secondaryOrderID(final byte[] value)
    {
        return secondaryOrderID(value, 0, value.length);
    }

    public boolean hasSecondaryOrderID()
    {
        return secondaryOrderIDLength > 0;
    }

    public MutableDirectBuffer secondaryOrderID()
    {
        return secondaryOrderID;
    }

    public String secondaryOrderIDAsString()
    {
        return secondaryOrderID.getStringWithoutLengthAscii(secondaryOrderIDOffset, secondaryOrderIDLength);
    }

    public CollateralAssignmentEncoder secondaryOrderID(final CharSequence value)
    {
        toBytes(value, secondaryOrderID);
        secondaryOrderIDOffset = 0;
        secondaryOrderIDLength = value.length();
        return this;
    }

    public CollateralAssignmentEncoder secondaryOrderID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            secondaryOrderID.wrap(buffer);
            secondaryOrderIDOffset = value.offset();
            secondaryOrderIDLength = value.length();
        }
        return this;
    }

    public CollateralAssignmentEncoder secondaryOrderID(final char[] value)
    {
        return secondaryOrderID(value, 0, value.length);
    }

    public CollateralAssignmentEncoder secondaryOrderID(final char[] value, final int length)
    {
        return secondaryOrderID(value, 0, length);
    }

    public CollateralAssignmentEncoder secondaryOrderID(final char[] value, final int offset, final int length)
    {
        toBytes(value, secondaryOrderID, offset, length);
        secondaryOrderIDOffset = 0;
        secondaryOrderIDLength = length;
        return this;
    }

    private final MutableDirectBuffer secondaryClOrdID = new UnsafeBuffer();

    private int secondaryClOrdIDOffset = 0;

    private int secondaryClOrdIDLength = 0;

    public CollateralAssignmentEncoder secondaryClOrdID(final DirectBuffer value, final int offset, final int length)
    {
        secondaryClOrdID.wrap(value);
        secondaryClOrdIDOffset = offset;
        secondaryClOrdIDLength = length;
        return this;
    }

    public CollateralAssignmentEncoder secondaryClOrdID(final DirectBuffer value, final int length)
    {
        return secondaryClOrdID(value, 0, length);
    }

    public CollateralAssignmentEncoder secondaryClOrdID(final DirectBuffer value)
    {
        return secondaryClOrdID(value, 0, value.capacity());
    }

    public CollateralAssignmentEncoder secondaryClOrdID(final byte[] value, final int offset, final int length)
    {
        secondaryClOrdID.wrap(value);
        secondaryClOrdIDOffset = offset;
        secondaryClOrdIDLength = length;
        return this;
    }

    public CollateralAssignmentEncoder secondaryClOrdIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(secondaryClOrdID, value, offset, length);
        secondaryClOrdIDOffset = offset;
        secondaryClOrdIDLength = length;
        return this;
    }

    public CollateralAssignmentEncoder secondaryClOrdID(final byte[] value, final int length)
    {
        return secondaryClOrdID(value, 0, length);
    }

    public CollateralAssignmentEncoder secondaryClOrdID(final byte[] value)
    {
        return secondaryClOrdID(value, 0, value.length);
    }

    public boolean hasSecondaryClOrdID()
    {
        return secondaryClOrdIDLength > 0;
    }

    public MutableDirectBuffer secondaryClOrdID()
    {
        return secondaryClOrdID;
    }

    public String secondaryClOrdIDAsString()
    {
        return secondaryClOrdID.getStringWithoutLengthAscii(secondaryClOrdIDOffset, secondaryClOrdIDLength);
    }

    public CollateralAssignmentEncoder secondaryClOrdID(final CharSequence value)
    {
        toBytes(value, secondaryClOrdID);
        secondaryClOrdIDOffset = 0;
        secondaryClOrdIDLength = value.length();
        return this;
    }

    public CollateralAssignmentEncoder secondaryClOrdID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            secondaryClOrdID.wrap(buffer);
            secondaryClOrdIDOffset = value.offset();
            secondaryClOrdIDLength = value.length();
        }
        return this;
    }

    public CollateralAssignmentEncoder secondaryClOrdID(final char[] value)
    {
        return secondaryClOrdID(value, 0, value.length);
    }

    public CollateralAssignmentEncoder secondaryClOrdID(final char[] value, final int length)
    {
        return secondaryClOrdID(value, 0, length);
    }

    public CollateralAssignmentEncoder secondaryClOrdID(final char[] value, final int offset, final int length)
    {
        toBytes(value, secondaryClOrdID, offset, length);
        secondaryClOrdIDOffset = 0;
        secondaryClOrdIDLength = length;
        return this;
    }



public static class ExecsGroupEncoder
{
    private ExecsGroupEncoder next = null;

    public ExecsGroupEncoder next()
    {
        if (next == null)
        {
            next = new ExecsGroupEncoder();
        }
        return next;
    }

    private static final int execIDHeaderLength = 3;
    private static final byte[] execIDHeader = new byte[] {49, 55, (byte) '='};

    private final MutableDirectBuffer execID = new UnsafeBuffer();

    private int execIDOffset = 0;

    private int execIDLength = 0;

    public ExecsGroupEncoder execID(final DirectBuffer value, final int offset, final int length)
    {
        execID.wrap(value);
        execIDOffset = offset;
        execIDLength = length;
        return this;
    }

    public ExecsGroupEncoder execID(final DirectBuffer value, final int length)
    {
        return execID(value, 0, length);
    }

    public ExecsGroupEncoder execID(final DirectBuffer value)
    {
        return execID(value, 0, value.capacity());
    }

    public ExecsGroupEncoder execID(final byte[] value, final int offset, final int length)
    {
        execID.wrap(value);
        execIDOffset = offset;
        execIDLength = length;
        return this;
    }

    public ExecsGroupEncoder execIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(execID, value, offset, length);
        execIDOffset = offset;
        execIDLength = length;
        return this;
    }

    public ExecsGroupEncoder execID(final byte[] value, final int length)
    {
        return execID(value, 0, length);
    }

    public ExecsGroupEncoder execID(final byte[] value)
    {
        return execID(value, 0, value.length);
    }

    public boolean hasExecID()
    {
        return execIDLength > 0;
    }

    public MutableDirectBuffer execID()
    {
        return execID;
    }

    public String execIDAsString()
    {
        return execID.getStringWithoutLengthAscii(execIDOffset, execIDLength);
    }

    public ExecsGroupEncoder execID(final CharSequence value)
    {
        toBytes(value, execID);
        execIDOffset = 0;
        execIDLength = value.length();
        return this;
    }

    public ExecsGroupEncoder execID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            execID.wrap(buffer);
            execIDOffset = value.offset();
            execIDLength = value.length();
        }
        return this;
    }

    public ExecsGroupEncoder execID(final char[] value)
    {
        return execID(value, 0, value.length);
    }

    public ExecsGroupEncoder execID(final char[] value, final int length)
    {
        return execID(value, 0, length);
    }

    public ExecsGroupEncoder execID(final char[] value, final int offset, final int length)
    {
        toBytes(value, execID, offset, length);
        execIDOffset = 0;
        execIDLength = length;
        return this;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (execIDLength > 0)
        {
            buffer.putBytes(position, execIDHeader, 0, execIDHeaderLength);
            position += execIDHeaderLength;
            buffer.putBytes(position, execID, execIDOffset, execIDLength);
            position += execIDLength;
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
        this.resetExecID();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetExecID()
    {
        execIDLength = 0;
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
        builder.append("\"MessageName\": \"ExecsGroup\",\n");
        if (hasExecID())
        {
            indent(builder, level);
            builder.append("\"ExecID\": \"");
            appendBuffer(builder, execID, execIDOffset, execIDLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public ExecsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((ExecsGroupEncoder)encoder);
    }

    public ExecsGroupEncoder copyTo(final ExecsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasExecID())
        {
            encoder.execIDAsCopy(execID.byteArray(), 0, execIDLength);
        }
        return encoder;
    }

}
    private int noExecsGroupCounter;

    private boolean hasNoExecsGroupCounter;

    public boolean hasNoExecsGroupCounter()
    {
        return hasNoExecsGroupCounter;
    }

    public CollateralAssignmentEncoder noExecsGroupCounter(int value)
    {
        noExecsGroupCounter = value;
        hasNoExecsGroupCounter = true;
        return this;
    }

    public int noExecsGroupCounter()
    {
        return noExecsGroupCounter;
    }


    private ExecsGroupEncoder execsGroup = null;

    public ExecsGroupEncoder execsGroup(final int numberOfElements)
    {
        hasNoExecsGroupCounter = true;
        noExecsGroupCounter = numberOfElements;
        if (execsGroup == null)
        {
            execsGroup = new ExecsGroupEncoder();
        }
        return execsGroup;
    }



public static class TradesGroupEncoder
{
    private TradesGroupEncoder next = null;

    public TradesGroupEncoder next()
    {
        if (next == null)
        {
            next = new TradesGroupEncoder();
        }
        return next;
    }

    private static final int tradeReportIDHeaderLength = 4;
    private static final byte[] tradeReportIDHeader = new byte[] {53, 55, 49, (byte) '='};

    private static final int secondaryTradeReportIDHeaderLength = 4;
    private static final byte[] secondaryTradeReportIDHeader = new byte[] {56, 49, 56, (byte) '='};

    private final MutableDirectBuffer tradeReportID = new UnsafeBuffer();

    private int tradeReportIDOffset = 0;

    private int tradeReportIDLength = 0;

    public TradesGroupEncoder tradeReportID(final DirectBuffer value, final int offset, final int length)
    {
        tradeReportID.wrap(value);
        tradeReportIDOffset = offset;
        tradeReportIDLength = length;
        return this;
    }

    public TradesGroupEncoder tradeReportID(final DirectBuffer value, final int length)
    {
        return tradeReportID(value, 0, length);
    }

    public TradesGroupEncoder tradeReportID(final DirectBuffer value)
    {
        return tradeReportID(value, 0, value.capacity());
    }

    public TradesGroupEncoder tradeReportID(final byte[] value, final int offset, final int length)
    {
        tradeReportID.wrap(value);
        tradeReportIDOffset = offset;
        tradeReportIDLength = length;
        return this;
    }

    public TradesGroupEncoder tradeReportIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradeReportID, value, offset, length);
        tradeReportIDOffset = offset;
        tradeReportIDLength = length;
        return this;
    }

    public TradesGroupEncoder tradeReportID(final byte[] value, final int length)
    {
        return tradeReportID(value, 0, length);
    }

    public TradesGroupEncoder tradeReportID(final byte[] value)
    {
        return tradeReportID(value, 0, value.length);
    }

    public boolean hasTradeReportID()
    {
        return tradeReportIDLength > 0;
    }

    public MutableDirectBuffer tradeReportID()
    {
        return tradeReportID;
    }

    public String tradeReportIDAsString()
    {
        return tradeReportID.getStringWithoutLengthAscii(tradeReportIDOffset, tradeReportIDLength);
    }

    public TradesGroupEncoder tradeReportID(final CharSequence value)
    {
        toBytes(value, tradeReportID);
        tradeReportIDOffset = 0;
        tradeReportIDLength = value.length();
        return this;
    }

    public TradesGroupEncoder tradeReportID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            tradeReportID.wrap(buffer);
            tradeReportIDOffset = value.offset();
            tradeReportIDLength = value.length();
        }
        return this;
    }

    public TradesGroupEncoder tradeReportID(final char[] value)
    {
        return tradeReportID(value, 0, value.length);
    }

    public TradesGroupEncoder tradeReportID(final char[] value, final int length)
    {
        return tradeReportID(value, 0, length);
    }

    public TradesGroupEncoder tradeReportID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradeReportID, offset, length);
        tradeReportIDOffset = 0;
        tradeReportIDLength = length;
        return this;
    }

    private final MutableDirectBuffer secondaryTradeReportID = new UnsafeBuffer();

    private int secondaryTradeReportIDOffset = 0;

    private int secondaryTradeReportIDLength = 0;

    public TradesGroupEncoder secondaryTradeReportID(final DirectBuffer value, final int offset, final int length)
    {
        secondaryTradeReportID.wrap(value);
        secondaryTradeReportIDOffset = offset;
        secondaryTradeReportIDLength = length;
        return this;
    }

    public TradesGroupEncoder secondaryTradeReportID(final DirectBuffer value, final int length)
    {
        return secondaryTradeReportID(value, 0, length);
    }

    public TradesGroupEncoder secondaryTradeReportID(final DirectBuffer value)
    {
        return secondaryTradeReportID(value, 0, value.capacity());
    }

    public TradesGroupEncoder secondaryTradeReportID(final byte[] value, final int offset, final int length)
    {
        secondaryTradeReportID.wrap(value);
        secondaryTradeReportIDOffset = offset;
        secondaryTradeReportIDLength = length;
        return this;
    }

    public TradesGroupEncoder secondaryTradeReportIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(secondaryTradeReportID, value, offset, length);
        secondaryTradeReportIDOffset = offset;
        secondaryTradeReportIDLength = length;
        return this;
    }

    public TradesGroupEncoder secondaryTradeReportID(final byte[] value, final int length)
    {
        return secondaryTradeReportID(value, 0, length);
    }

    public TradesGroupEncoder secondaryTradeReportID(final byte[] value)
    {
        return secondaryTradeReportID(value, 0, value.length);
    }

    public boolean hasSecondaryTradeReportID()
    {
        return secondaryTradeReportIDLength > 0;
    }

    public MutableDirectBuffer secondaryTradeReportID()
    {
        return secondaryTradeReportID;
    }

    public String secondaryTradeReportIDAsString()
    {
        return secondaryTradeReportID.getStringWithoutLengthAscii(secondaryTradeReportIDOffset, secondaryTradeReportIDLength);
    }

    public TradesGroupEncoder secondaryTradeReportID(final CharSequence value)
    {
        toBytes(value, secondaryTradeReportID);
        secondaryTradeReportIDOffset = 0;
        secondaryTradeReportIDLength = value.length();
        return this;
    }

    public TradesGroupEncoder secondaryTradeReportID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            secondaryTradeReportID.wrap(buffer);
            secondaryTradeReportIDOffset = value.offset();
            secondaryTradeReportIDLength = value.length();
        }
        return this;
    }

    public TradesGroupEncoder secondaryTradeReportID(final char[] value)
    {
        return secondaryTradeReportID(value, 0, value.length);
    }

    public TradesGroupEncoder secondaryTradeReportID(final char[] value, final int length)
    {
        return secondaryTradeReportID(value, 0, length);
    }

    public TradesGroupEncoder secondaryTradeReportID(final char[] value, final int offset, final int length)
    {
        toBytes(value, secondaryTradeReportID, offset, length);
        secondaryTradeReportIDOffset = 0;
        secondaryTradeReportIDLength = length;
        return this;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (tradeReportIDLength > 0)
        {
            buffer.putBytes(position, tradeReportIDHeader, 0, tradeReportIDHeaderLength);
            position += tradeReportIDHeaderLength;
            buffer.putBytes(position, tradeReportID, tradeReportIDOffset, tradeReportIDLength);
            position += tradeReportIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (secondaryTradeReportIDLength > 0)
        {
            buffer.putBytes(position, secondaryTradeReportIDHeader, 0, secondaryTradeReportIDHeaderLength);
            position += secondaryTradeReportIDHeaderLength;
            buffer.putBytes(position, secondaryTradeReportID, secondaryTradeReportIDOffset, secondaryTradeReportIDLength);
            position += secondaryTradeReportIDLength;
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
        this.resetTradeReportID();
        this.resetSecondaryTradeReportID();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetTradeReportID()
    {
        tradeReportIDLength = 0;
    }

    public void resetSecondaryTradeReportID()
    {
        secondaryTradeReportIDLength = 0;
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
        builder.append("\"MessageName\": \"TradesGroup\",\n");
        if (hasTradeReportID())
        {
            indent(builder, level);
            builder.append("\"TradeReportID\": \"");
            appendBuffer(builder, tradeReportID, tradeReportIDOffset, tradeReportIDLength);
            builder.append("\",\n");
        }

        if (hasSecondaryTradeReportID())
        {
            indent(builder, level);
            builder.append("\"SecondaryTradeReportID\": \"");
            appendBuffer(builder, secondaryTradeReportID, secondaryTradeReportIDOffset, secondaryTradeReportIDLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public TradesGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((TradesGroupEncoder)encoder);
    }

    public TradesGroupEncoder copyTo(final TradesGroupEncoder encoder)
    {
        encoder.reset();
        if (hasTradeReportID())
        {
            encoder.tradeReportIDAsCopy(tradeReportID.byteArray(), 0, tradeReportIDLength);
        }

        if (hasSecondaryTradeReportID())
        {
            encoder.secondaryTradeReportIDAsCopy(secondaryTradeReportID.byteArray(), 0, secondaryTradeReportIDLength);
        }
        return encoder;
    }

}
    private int noTradesGroupCounter;

    private boolean hasNoTradesGroupCounter;

    public boolean hasNoTradesGroupCounter()
    {
        return hasNoTradesGroupCounter;
    }

    public CollateralAssignmentEncoder noTradesGroupCounter(int value)
    {
        noTradesGroupCounter = value;
        hasNoTradesGroupCounter = true;
        return this;
    }

    public int noTradesGroupCounter()
    {
        return noTradesGroupCounter;
    }


    private TradesGroupEncoder tradesGroup = null;

    public TradesGroupEncoder tradesGroup(final int numberOfElements)
    {
        hasNoTradesGroupCounter = true;
        noTradesGroupCounter = numberOfElements;
        if (tradesGroup == null)
        {
            tradesGroup = new TradesGroupEncoder();
        }
        return tradesGroup;
    }

    private final InstrumentEncoder instrument = new InstrumentEncoder();
    public InstrumentEncoder instrument()
    {
        return instrument;
    }

    private final FinancingDetailsEncoder financingDetails = new FinancingDetailsEncoder();
    public FinancingDetailsEncoder financingDetails()
    {
        return financingDetails;
    }

    private final MutableDirectBuffer settlDate = new UnsafeBuffer();

    private int settlDateOffset = 0;

    private int settlDateLength = 0;

    public CollateralAssignmentEncoder settlDate(final DirectBuffer value, final int offset, final int length)
    {
        settlDate.wrap(value);
        settlDateOffset = offset;
        settlDateLength = length;
        return this;
    }

    public CollateralAssignmentEncoder settlDate(final DirectBuffer value, final int length)
    {
        return settlDate(value, 0, length);
    }

    public CollateralAssignmentEncoder settlDate(final DirectBuffer value)
    {
        return settlDate(value, 0, value.capacity());
    }

    public CollateralAssignmentEncoder settlDate(final byte[] value, final int offset, final int length)
    {
        settlDate.wrap(value);
        settlDateOffset = offset;
        settlDateLength = length;
        return this;
    }

    public CollateralAssignmentEncoder settlDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlDate, value, offset, length);
        settlDateOffset = offset;
        settlDateLength = length;
        return this;
    }

    public CollateralAssignmentEncoder settlDate(final byte[] value, final int length)
    {
        return settlDate(value, 0, length);
    }

    public CollateralAssignmentEncoder settlDate(final byte[] value)
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

    private final DecimalFloat quantity = new DecimalFloat();

    private boolean hasQuantity;

    public boolean hasQuantity()
    {
        return hasQuantity;
    }

    public CollateralAssignmentEncoder quantity(DecimalFloat value)
    {
        quantity.set(value);
        hasQuantity = true;
        return this;
    }

    public CollateralAssignmentEncoder quantity(long value, int scale)
    {
        quantity.set(value, scale);
        hasQuantity = true;
        return this;
    }

    public DecimalFloat quantity()
    {
        return quantity;
    }

    private int qtyType;

    private boolean hasQtyType;

    public boolean hasQtyType()
    {
        return hasQtyType;
    }

    public CollateralAssignmentEncoder qtyType(int value)
    {
        qtyType = value;
        hasQtyType = true;
        return this;
    }

    public int qtyType()
    {
        return qtyType;
    }

    public CollateralAssignmentEncoder qtyType(QtyType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == QtyType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: qtyType Value: " + value );
            }
            if (value == QtyType.NULL_VAL)
            {
                return this;
            }
        }
        return qtyType(value.representation());
    }

    private final MutableDirectBuffer currency = new UnsafeBuffer();

    private int currencyOffset = 0;

    private int currencyLength = 0;

    public CollateralAssignmentEncoder currency(final DirectBuffer value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public CollateralAssignmentEncoder currency(final DirectBuffer value, final int length)
    {
        return currency(value, 0, length);
    }

    public CollateralAssignmentEncoder currency(final DirectBuffer value)
    {
        return currency(value, 0, value.capacity());
    }

    public CollateralAssignmentEncoder currency(final byte[] value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public CollateralAssignmentEncoder currencyAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(currency, value, offset, length);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public CollateralAssignmentEncoder currency(final byte[] value, final int length)
    {
        return currency(value, 0, length);
    }

    public CollateralAssignmentEncoder currency(final byte[] value)
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

    public CollateralAssignmentEncoder currency(final CharSequence value)
    {
        toBytes(value, currency);
        currencyOffset = 0;
        currencyLength = value.length();
        return this;
    }

    public CollateralAssignmentEncoder currency(final AsciiSequenceView value)
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

    public CollateralAssignmentEncoder currency(final char[] value)
    {
        return currency(value, 0, value.length);
    }

    public CollateralAssignmentEncoder currency(final char[] value, final int length)
    {
        return currency(value, 0, length);
    }

    public CollateralAssignmentEncoder currency(final char[] value, final int offset, final int length)
    {
        toBytes(value, currency, offset, length);
        currencyOffset = 0;
        currencyLength = length;
        return this;
    }



public static class LegsGroupEncoder
{
    private LegsGroupEncoder next = null;

    public LegsGroupEncoder next()
    {
        if (next == null)
        {
            next = new LegsGroupEncoder();
        }
        return next;
    }

    private final InstrumentLegEncoder instrumentLeg = new InstrumentLegEncoder();
    public InstrumentLegEncoder instrumentLeg()
    {
        return instrumentLeg;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

            position += instrumentLeg.encode(buffer, position);
        if (next != null)
        {
            position += next.encode(buffer, position, remainingElements - 1);
        }
        return position - offset;
    }

    public void reset()
    {
        instrumentLeg.reset();
        if (next != null)        {
            next.reset();
        }
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
        builder.append("\"MessageName\": \"LegsGroup\",\n");
    indent(builder, level);
    builder.append("\"InstrumentLeg\": ");
    instrumentLeg.appendTo(builder, level + 1);
    builder.append("\n");
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public LegsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((LegsGroupEncoder)encoder);
    }

    public LegsGroupEncoder copyTo(final LegsGroupEncoder encoder)
    {
        encoder.reset();

        instrumentLeg.copyTo(encoder.instrumentLeg());        return encoder;
    }

}
    private int noLegsGroupCounter;

    private boolean hasNoLegsGroupCounter;

    public boolean hasNoLegsGroupCounter()
    {
        return hasNoLegsGroupCounter;
    }

    public CollateralAssignmentEncoder noLegsGroupCounter(int value)
    {
        noLegsGroupCounter = value;
        hasNoLegsGroupCounter = true;
        return this;
    }

    public int noLegsGroupCounter()
    {
        return noLegsGroupCounter;
    }


    private LegsGroupEncoder legsGroup = null;

    public LegsGroupEncoder legsGroup(final int numberOfElements)
    {
        hasNoLegsGroupCounter = true;
        noLegsGroupCounter = numberOfElements;
        if (legsGroup == null)
        {
            legsGroup = new LegsGroupEncoder();
        }
        return legsGroup;
    }



public static class UnderlyingsGroupEncoder
{
    private UnderlyingsGroupEncoder next = null;

    public UnderlyingsGroupEncoder next()
    {
        if (next == null)
        {
            next = new UnderlyingsGroupEncoder();
        }
        return next;
    }

    private static final int collActionHeaderLength = 4;
    private static final byte[] collActionHeader = new byte[] {57, 52, 52, (byte) '='};

    private final UnderlyingInstrumentEncoder underlyingInstrument = new UnderlyingInstrumentEncoder();
    public UnderlyingInstrumentEncoder underlyingInstrument()
    {
        return underlyingInstrument;
    }

    private int collAction;

    private boolean hasCollAction;

    public boolean hasCollAction()
    {
        return hasCollAction;
    }

    public UnderlyingsGroupEncoder collAction(int value)
    {
        collAction = value;
        hasCollAction = true;
        return this;
    }

    public int collAction()
    {
        return collAction;
    }

    public UnderlyingsGroupEncoder collAction(CollAction value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == CollAction.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: collAction Value: " + value );
            }
            if (value == CollAction.NULL_VAL)
            {
                return this;
            }
        }
        return collAction(value.representation());
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

            position += underlyingInstrument.encode(buffer, position);

        if (hasCollAction)
        {
            buffer.putBytes(position, collActionHeader, 0, collActionHeaderLength);
            position += collActionHeaderLength;
            position += buffer.putIntAscii(position, collAction);
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
        this.resetCollAction();
        underlyingInstrument.reset();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetCollAction()
    {
        hasCollAction = false;
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
        builder.append("\"MessageName\": \"UnderlyingsGroup\",\n");
    indent(builder, level);
    builder.append("\"UnderlyingInstrument\": ");
    underlyingInstrument.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasCollAction())
        {
            indent(builder, level);
            builder.append("\"CollAction\": \"");
            builder.append(collAction);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public UnderlyingsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((UnderlyingsGroupEncoder)encoder);
    }

    public UnderlyingsGroupEncoder copyTo(final UnderlyingsGroupEncoder encoder)
    {
        encoder.reset();

        underlyingInstrument.copyTo(encoder.underlyingInstrument());
        if (hasCollAction())
        {
            encoder.collAction(this.collAction());
        }
        return encoder;
    }

}
    private int noUnderlyingsGroupCounter;

    private boolean hasNoUnderlyingsGroupCounter;

    public boolean hasNoUnderlyingsGroupCounter()
    {
        return hasNoUnderlyingsGroupCounter;
    }

    public CollateralAssignmentEncoder noUnderlyingsGroupCounter(int value)
    {
        noUnderlyingsGroupCounter = value;
        hasNoUnderlyingsGroupCounter = true;
        return this;
    }

    public int noUnderlyingsGroupCounter()
    {
        return noUnderlyingsGroupCounter;
    }


    private UnderlyingsGroupEncoder underlyingsGroup = null;

    public UnderlyingsGroupEncoder underlyingsGroup(final int numberOfElements)
    {
        hasNoUnderlyingsGroupCounter = true;
        noUnderlyingsGroupCounter = numberOfElements;
        if (underlyingsGroup == null)
        {
            underlyingsGroup = new UnderlyingsGroupEncoder();
        }
        return underlyingsGroup;
    }

    private final DecimalFloat marginExcess = new DecimalFloat();

    private boolean hasMarginExcess;

    public boolean hasMarginExcess()
    {
        return hasMarginExcess;
    }

    public CollateralAssignmentEncoder marginExcess(DecimalFloat value)
    {
        marginExcess.set(value);
        hasMarginExcess = true;
        return this;
    }

    public CollateralAssignmentEncoder marginExcess(long value, int scale)
    {
        marginExcess.set(value, scale);
        hasMarginExcess = true;
        return this;
    }

    public DecimalFloat marginExcess()
    {
        return marginExcess;
    }

    private final DecimalFloat totalNetValue = new DecimalFloat();

    private boolean hasTotalNetValue;

    public boolean hasTotalNetValue()
    {
        return hasTotalNetValue;
    }

    public CollateralAssignmentEncoder totalNetValue(DecimalFloat value)
    {
        totalNetValue.set(value);
        hasTotalNetValue = true;
        return this;
    }

    public CollateralAssignmentEncoder totalNetValue(long value, int scale)
    {
        totalNetValue.set(value, scale);
        hasTotalNetValue = true;
        return this;
    }

    public DecimalFloat totalNetValue()
    {
        return totalNetValue;
    }

    private final DecimalFloat cashOutstanding = new DecimalFloat();

    private boolean hasCashOutstanding;

    public boolean hasCashOutstanding()
    {
        return hasCashOutstanding;
    }

    public CollateralAssignmentEncoder cashOutstanding(DecimalFloat value)
    {
        cashOutstanding.set(value);
        hasCashOutstanding = true;
        return this;
    }

    public CollateralAssignmentEncoder cashOutstanding(long value, int scale)
    {
        cashOutstanding.set(value, scale);
        hasCashOutstanding = true;
        return this;
    }

    public DecimalFloat cashOutstanding()
    {
        return cashOutstanding;
    }

    private final TrdRegTimestampsEncoder trdRegTimestamps = new TrdRegTimestampsEncoder();
    public TrdRegTimestampsEncoder trdRegTimestamps()
    {
        return trdRegTimestamps;
    }

    private char side;

    private boolean hasSide;

    public boolean hasSide()
    {
        return hasSide;
    }

    public CollateralAssignmentEncoder side(char value)
    {
        side = value;
        hasSide = true;
        return this;
    }

    public char side()
    {
        return side;
    }

    public CollateralAssignmentEncoder side(Side value)
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



public static class MiscFeesGroupEncoder
{
    private MiscFeesGroupEncoder next = null;

    public MiscFeesGroupEncoder next()
    {
        if (next == null)
        {
            next = new MiscFeesGroupEncoder();
        }
        return next;
    }

    private static final int miscFeeAmtHeaderLength = 4;
    private static final byte[] miscFeeAmtHeader = new byte[] {49, 51, 55, (byte) '='};

    private static final int miscFeeCurrHeaderLength = 4;
    private static final byte[] miscFeeCurrHeader = new byte[] {49, 51, 56, (byte) '='};

    private static final int miscFeeTypeHeaderLength = 4;
    private static final byte[] miscFeeTypeHeader = new byte[] {49, 51, 57, (byte) '='};

    private static final int miscFeeBasisHeaderLength = 4;
    private static final byte[] miscFeeBasisHeader = new byte[] {56, 57, 49, (byte) '='};

    private final DecimalFloat miscFeeAmt = new DecimalFloat();

    private boolean hasMiscFeeAmt;

    public boolean hasMiscFeeAmt()
    {
        return hasMiscFeeAmt;
    }

    public MiscFeesGroupEncoder miscFeeAmt(DecimalFloat value)
    {
        miscFeeAmt.set(value);
        hasMiscFeeAmt = true;
        return this;
    }

    public MiscFeesGroupEncoder miscFeeAmt(long value, int scale)
    {
        miscFeeAmt.set(value, scale);
        hasMiscFeeAmt = true;
        return this;
    }

    public DecimalFloat miscFeeAmt()
    {
        return miscFeeAmt;
    }

    private final MutableDirectBuffer miscFeeCurr = new UnsafeBuffer();

    private int miscFeeCurrOffset = 0;

    private int miscFeeCurrLength = 0;

    public MiscFeesGroupEncoder miscFeeCurr(final DirectBuffer value, final int offset, final int length)
    {
        miscFeeCurr.wrap(value);
        miscFeeCurrOffset = offset;
        miscFeeCurrLength = length;
        return this;
    }

    public MiscFeesGroupEncoder miscFeeCurr(final DirectBuffer value, final int length)
    {
        return miscFeeCurr(value, 0, length);
    }

    public MiscFeesGroupEncoder miscFeeCurr(final DirectBuffer value)
    {
        return miscFeeCurr(value, 0, value.capacity());
    }

    public MiscFeesGroupEncoder miscFeeCurr(final byte[] value, final int offset, final int length)
    {
        miscFeeCurr.wrap(value);
        miscFeeCurrOffset = offset;
        miscFeeCurrLength = length;
        return this;
    }

    public MiscFeesGroupEncoder miscFeeCurrAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(miscFeeCurr, value, offset, length);
        miscFeeCurrOffset = offset;
        miscFeeCurrLength = length;
        return this;
    }

    public MiscFeesGroupEncoder miscFeeCurr(final byte[] value, final int length)
    {
        return miscFeeCurr(value, 0, length);
    }

    public MiscFeesGroupEncoder miscFeeCurr(final byte[] value)
    {
        return miscFeeCurr(value, 0, value.length);
    }

    public boolean hasMiscFeeCurr()
    {
        return miscFeeCurrLength > 0;
    }

    public MutableDirectBuffer miscFeeCurr()
    {
        return miscFeeCurr;
    }

    public String miscFeeCurrAsString()
    {
        return miscFeeCurr.getStringWithoutLengthAscii(miscFeeCurrOffset, miscFeeCurrLength);
    }

    public MiscFeesGroupEncoder miscFeeCurr(final CharSequence value)
    {
        toBytes(value, miscFeeCurr);
        miscFeeCurrOffset = 0;
        miscFeeCurrLength = value.length();
        return this;
    }

    public MiscFeesGroupEncoder miscFeeCurr(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            miscFeeCurr.wrap(buffer);
            miscFeeCurrOffset = value.offset();
            miscFeeCurrLength = value.length();
        }
        return this;
    }

    public MiscFeesGroupEncoder miscFeeCurr(final char[] value)
    {
        return miscFeeCurr(value, 0, value.length);
    }

    public MiscFeesGroupEncoder miscFeeCurr(final char[] value, final int length)
    {
        return miscFeeCurr(value, 0, length);
    }

    public MiscFeesGroupEncoder miscFeeCurr(final char[] value, final int offset, final int length)
    {
        toBytes(value, miscFeeCurr, offset, length);
        miscFeeCurrOffset = 0;
        miscFeeCurrLength = length;
        return this;
    }

    private final MutableDirectBuffer miscFeeType = new UnsafeBuffer();

    private int miscFeeTypeOffset = 0;

    private int miscFeeTypeLength = 0;

    public MiscFeesGroupEncoder miscFeeType(final DirectBuffer value, final int offset, final int length)
    {
        miscFeeType.wrap(value);
        miscFeeTypeOffset = offset;
        miscFeeTypeLength = length;
        return this;
    }

    public MiscFeesGroupEncoder miscFeeType(final DirectBuffer value, final int length)
    {
        return miscFeeType(value, 0, length);
    }

    public MiscFeesGroupEncoder miscFeeType(final DirectBuffer value)
    {
        return miscFeeType(value, 0, value.capacity());
    }

    public MiscFeesGroupEncoder miscFeeType(final byte[] value, final int offset, final int length)
    {
        miscFeeType.wrap(value);
        miscFeeTypeOffset = offset;
        miscFeeTypeLength = length;
        return this;
    }

    public MiscFeesGroupEncoder miscFeeTypeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(miscFeeType, value, offset, length);
        miscFeeTypeOffset = offset;
        miscFeeTypeLength = length;
        return this;
    }

    public MiscFeesGroupEncoder miscFeeType(final byte[] value, final int length)
    {
        return miscFeeType(value, 0, length);
    }

    public MiscFeesGroupEncoder miscFeeType(final byte[] value)
    {
        return miscFeeType(value, 0, value.length);
    }

    public boolean hasMiscFeeType()
    {
        return miscFeeTypeLength > 0;
    }

    public MutableDirectBuffer miscFeeType()
    {
        return miscFeeType;
    }

    public String miscFeeTypeAsString()
    {
        return miscFeeType.getStringWithoutLengthAscii(miscFeeTypeOffset, miscFeeTypeLength);
    }

    public MiscFeesGroupEncoder miscFeeType(final CharSequence value)
    {
        toBytes(value, miscFeeType);
        miscFeeTypeOffset = 0;
        miscFeeTypeLength = value.length();
        return this;
    }

    public MiscFeesGroupEncoder miscFeeType(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            miscFeeType.wrap(buffer);
            miscFeeTypeOffset = value.offset();
            miscFeeTypeLength = value.length();
        }
        return this;
    }

    public MiscFeesGroupEncoder miscFeeType(final char[] value)
    {
        return miscFeeType(value, 0, value.length);
    }

    public MiscFeesGroupEncoder miscFeeType(final char[] value, final int length)
    {
        return miscFeeType(value, 0, length);
    }

    public MiscFeesGroupEncoder miscFeeType(final char[] value, final int offset, final int length)
    {
        toBytes(value, miscFeeType, offset, length);
        miscFeeTypeOffset = 0;
        miscFeeTypeLength = length;
        return this;
    }

    public MiscFeesGroupEncoder miscFeeType(MiscFeeType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == MiscFeeType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: miscFeeType Value: " + value );
            }
            if (value == MiscFeeType.NULL_VAL)
            {
                return this;
            }
        }
        return miscFeeType(value.representation());
    }

    private int miscFeeBasis;

    private boolean hasMiscFeeBasis;

    public boolean hasMiscFeeBasis()
    {
        return hasMiscFeeBasis;
    }

    public MiscFeesGroupEncoder miscFeeBasis(int value)
    {
        miscFeeBasis = value;
        hasMiscFeeBasis = true;
        return this;
    }

    public int miscFeeBasis()
    {
        return miscFeeBasis;
    }

    public MiscFeesGroupEncoder miscFeeBasis(MiscFeeBasis value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == MiscFeeBasis.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: miscFeeBasis Value: " + value );
            }
            if (value == MiscFeeBasis.NULL_VAL)
            {
                return this;
            }
        }
        return miscFeeBasis(value.representation());
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (hasMiscFeeAmt)
        {
            buffer.putBytes(position, miscFeeAmtHeader, 0, miscFeeAmtHeaderLength);
            position += miscFeeAmtHeaderLength;
            position += buffer.putFloatAscii(position, miscFeeAmt);
            buffer.putSeparator(position);
            position++;
        }

        if (miscFeeCurrLength > 0)
        {
            buffer.putBytes(position, miscFeeCurrHeader, 0, miscFeeCurrHeaderLength);
            position += miscFeeCurrHeaderLength;
            buffer.putBytes(position, miscFeeCurr, miscFeeCurrOffset, miscFeeCurrLength);
            position += miscFeeCurrLength;
            buffer.putSeparator(position);
            position++;
        }

        if (miscFeeTypeLength > 0)
        {
            buffer.putBytes(position, miscFeeTypeHeader, 0, miscFeeTypeHeaderLength);
            position += miscFeeTypeHeaderLength;
            buffer.putBytes(position, miscFeeType, miscFeeTypeOffset, miscFeeTypeLength);
            position += miscFeeTypeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasMiscFeeBasis)
        {
            buffer.putBytes(position, miscFeeBasisHeader, 0, miscFeeBasisHeaderLength);
            position += miscFeeBasisHeaderLength;
            position += buffer.putIntAscii(position, miscFeeBasis);
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
        this.resetMiscFeeAmt();
        this.resetMiscFeeCurr();
        this.resetMiscFeeType();
        this.resetMiscFeeBasis();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetMiscFeeAmt()
    {
        hasMiscFeeAmt = false;
    }

    public void resetMiscFeeCurr()
    {
        miscFeeCurrLength = 0;
    }

    public void resetMiscFeeType()
    {
        miscFeeTypeLength = 0;
    }

    public void resetMiscFeeBasis()
    {
        hasMiscFeeBasis = false;
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
        builder.append("\"MessageName\": \"MiscFeesGroup\",\n");
        if (hasMiscFeeAmt())
        {
            indent(builder, level);
            builder.append("\"MiscFeeAmt\": \"");
            miscFeeAmt.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasMiscFeeCurr())
        {
            indent(builder, level);
            builder.append("\"MiscFeeCurr\": \"");
            appendBuffer(builder, miscFeeCurr, miscFeeCurrOffset, miscFeeCurrLength);
            builder.append("\",\n");
        }

        if (hasMiscFeeType())
        {
            indent(builder, level);
            builder.append("\"MiscFeeType\": \"");
            appendBuffer(builder, miscFeeType, miscFeeTypeOffset, miscFeeTypeLength);
            builder.append("\",\n");
        }

        if (hasMiscFeeBasis())
        {
            indent(builder, level);
            builder.append("\"MiscFeeBasis\": \"");
            builder.append(miscFeeBasis);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public MiscFeesGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((MiscFeesGroupEncoder)encoder);
    }

    public MiscFeesGroupEncoder copyTo(final MiscFeesGroupEncoder encoder)
    {
        encoder.reset();
        if (hasMiscFeeAmt())
        {
            encoder.miscFeeAmt(this.miscFeeAmt());
        }

        if (hasMiscFeeCurr())
        {
            encoder.miscFeeCurrAsCopy(miscFeeCurr.byteArray(), 0, miscFeeCurrLength);
        }

        if (hasMiscFeeType())
        {
            encoder.miscFeeTypeAsCopy(miscFeeType.byteArray(), 0, miscFeeTypeLength);
        }

        if (hasMiscFeeBasis())
        {
            encoder.miscFeeBasis(this.miscFeeBasis());
        }
        return encoder;
    }

}
    private int noMiscFeesGroupCounter;

    private boolean hasNoMiscFeesGroupCounter;

    public boolean hasNoMiscFeesGroupCounter()
    {
        return hasNoMiscFeesGroupCounter;
    }

    public CollateralAssignmentEncoder noMiscFeesGroupCounter(int value)
    {
        noMiscFeesGroupCounter = value;
        hasNoMiscFeesGroupCounter = true;
        return this;
    }

    public int noMiscFeesGroupCounter()
    {
        return noMiscFeesGroupCounter;
    }


    private MiscFeesGroupEncoder miscFeesGroup = null;

    public MiscFeesGroupEncoder miscFeesGroup(final int numberOfElements)
    {
        hasNoMiscFeesGroupCounter = true;
        noMiscFeesGroupCounter = numberOfElements;
        if (miscFeesGroup == null)
        {
            miscFeesGroup = new MiscFeesGroupEncoder();
        }
        return miscFeesGroup;
    }

    private final DecimalFloat price = new DecimalFloat();

    private boolean hasPrice;

    public boolean hasPrice()
    {
        return hasPrice;
    }

    public CollateralAssignmentEncoder price(DecimalFloat value)
    {
        price.set(value);
        hasPrice = true;
        return this;
    }

    public CollateralAssignmentEncoder price(long value, int scale)
    {
        price.set(value, scale);
        hasPrice = true;
        return this;
    }

    public DecimalFloat price()
    {
        return price;
    }

    private int priceType;

    private boolean hasPriceType;

    public boolean hasPriceType()
    {
        return hasPriceType;
    }

    public CollateralAssignmentEncoder priceType(int value)
    {
        priceType = value;
        hasPriceType = true;
        return this;
    }

    public int priceType()
    {
        return priceType;
    }

    public CollateralAssignmentEncoder priceType(PriceType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == PriceType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: priceType Value: " + value );
            }
            if (value == PriceType.NULL_VAL)
            {
                return this;
            }
        }
        return priceType(value.representation());
    }

    private final DecimalFloat accruedInterestAmt = new DecimalFloat();

    private boolean hasAccruedInterestAmt;

    public boolean hasAccruedInterestAmt()
    {
        return hasAccruedInterestAmt;
    }

    public CollateralAssignmentEncoder accruedInterestAmt(DecimalFloat value)
    {
        accruedInterestAmt.set(value);
        hasAccruedInterestAmt = true;
        return this;
    }

    public CollateralAssignmentEncoder accruedInterestAmt(long value, int scale)
    {
        accruedInterestAmt.set(value, scale);
        hasAccruedInterestAmt = true;
        return this;
    }

    public DecimalFloat accruedInterestAmt()
    {
        return accruedInterestAmt;
    }

    private final DecimalFloat endAccruedInterestAmt = new DecimalFloat();

    private boolean hasEndAccruedInterestAmt;

    public boolean hasEndAccruedInterestAmt()
    {
        return hasEndAccruedInterestAmt;
    }

    public CollateralAssignmentEncoder endAccruedInterestAmt(DecimalFloat value)
    {
        endAccruedInterestAmt.set(value);
        hasEndAccruedInterestAmt = true;
        return this;
    }

    public CollateralAssignmentEncoder endAccruedInterestAmt(long value, int scale)
    {
        endAccruedInterestAmt.set(value, scale);
        hasEndAccruedInterestAmt = true;
        return this;
    }

    public DecimalFloat endAccruedInterestAmt()
    {
        return endAccruedInterestAmt;
    }

    private final DecimalFloat startCash = new DecimalFloat();

    private boolean hasStartCash;

    public boolean hasStartCash()
    {
        return hasStartCash;
    }

    public CollateralAssignmentEncoder startCash(DecimalFloat value)
    {
        startCash.set(value);
        hasStartCash = true;
        return this;
    }

    public CollateralAssignmentEncoder startCash(long value, int scale)
    {
        startCash.set(value, scale);
        hasStartCash = true;
        return this;
    }

    public DecimalFloat startCash()
    {
        return startCash;
    }

    private final DecimalFloat endCash = new DecimalFloat();

    private boolean hasEndCash;

    public boolean hasEndCash()
    {
        return hasEndCash;
    }

    public CollateralAssignmentEncoder endCash(DecimalFloat value)
    {
        endCash.set(value);
        hasEndCash = true;
        return this;
    }

    public CollateralAssignmentEncoder endCash(long value, int scale)
    {
        endCash.set(value, scale);
        hasEndCash = true;
        return this;
    }

    public DecimalFloat endCash()
    {
        return endCash;
    }

    private final SpreadOrBenchmarkCurveDataEncoder spreadOrBenchmarkCurveData = new SpreadOrBenchmarkCurveDataEncoder();
    public SpreadOrBenchmarkCurveDataEncoder spreadOrBenchmarkCurveData()
    {
        return spreadOrBenchmarkCurveData;
    }

    private final StipulationsEncoder stipulations = new StipulationsEncoder();
    public StipulationsEncoder stipulations()
    {
        return stipulations;
    }

    private final SettlInstructionsDataEncoder settlInstructionsData = new SettlInstructionsDataEncoder();
    public SettlInstructionsDataEncoder settlInstructionsData()
    {
        return settlInstructionsData;
    }

    private final MutableDirectBuffer tradingSessionID = new UnsafeBuffer();

    private int tradingSessionIDOffset = 0;

    private int tradingSessionIDLength = 0;

    public CollateralAssignmentEncoder tradingSessionID(final DirectBuffer value, final int offset, final int length)
    {
        tradingSessionID.wrap(value);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public CollateralAssignmentEncoder tradingSessionID(final DirectBuffer value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public CollateralAssignmentEncoder tradingSessionID(final DirectBuffer value)
    {
        return tradingSessionID(value, 0, value.capacity());
    }

    public CollateralAssignmentEncoder tradingSessionID(final byte[] value, final int offset, final int length)
    {
        tradingSessionID.wrap(value);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public CollateralAssignmentEncoder tradingSessionIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradingSessionID, value, offset, length);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public CollateralAssignmentEncoder tradingSessionID(final byte[] value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public CollateralAssignmentEncoder tradingSessionID(final byte[] value)
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

    public CollateralAssignmentEncoder tradingSessionID(final CharSequence value)
    {
        toBytes(value, tradingSessionID);
        tradingSessionIDOffset = 0;
        tradingSessionIDLength = value.length();
        return this;
    }

    public CollateralAssignmentEncoder tradingSessionID(final AsciiSequenceView value)
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

    public CollateralAssignmentEncoder tradingSessionID(final char[] value)
    {
        return tradingSessionID(value, 0, value.length);
    }

    public CollateralAssignmentEncoder tradingSessionID(final char[] value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public CollateralAssignmentEncoder tradingSessionID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradingSessionID, offset, length);
        tradingSessionIDOffset = 0;
        tradingSessionIDLength = length;
        return this;
    }

    private final MutableDirectBuffer tradingSessionSubID = new UnsafeBuffer();

    private int tradingSessionSubIDOffset = 0;

    private int tradingSessionSubIDLength = 0;

    public CollateralAssignmentEncoder tradingSessionSubID(final DirectBuffer value, final int offset, final int length)
    {
        tradingSessionSubID.wrap(value);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public CollateralAssignmentEncoder tradingSessionSubID(final DirectBuffer value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public CollateralAssignmentEncoder tradingSessionSubID(final DirectBuffer value)
    {
        return tradingSessionSubID(value, 0, value.capacity());
    }

    public CollateralAssignmentEncoder tradingSessionSubID(final byte[] value, final int offset, final int length)
    {
        tradingSessionSubID.wrap(value);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public CollateralAssignmentEncoder tradingSessionSubIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradingSessionSubID, value, offset, length);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public CollateralAssignmentEncoder tradingSessionSubID(final byte[] value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public CollateralAssignmentEncoder tradingSessionSubID(final byte[] value)
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

    public CollateralAssignmentEncoder tradingSessionSubID(final CharSequence value)
    {
        toBytes(value, tradingSessionSubID);
        tradingSessionSubIDOffset = 0;
        tradingSessionSubIDLength = value.length();
        return this;
    }

    public CollateralAssignmentEncoder tradingSessionSubID(final AsciiSequenceView value)
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

    public CollateralAssignmentEncoder tradingSessionSubID(final char[] value)
    {
        return tradingSessionSubID(value, 0, value.length);
    }

    public CollateralAssignmentEncoder tradingSessionSubID(final char[] value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public CollateralAssignmentEncoder tradingSessionSubID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradingSessionSubID, offset, length);
        tradingSessionSubIDOffset = 0;
        tradingSessionSubIDLength = length;
        return this;
    }

    private final MutableDirectBuffer settlSessID = new UnsafeBuffer();

    private int settlSessIDOffset = 0;

    private int settlSessIDLength = 0;

    public CollateralAssignmentEncoder settlSessID(final DirectBuffer value, final int offset, final int length)
    {
        settlSessID.wrap(value);
        settlSessIDOffset = offset;
        settlSessIDLength = length;
        return this;
    }

    public CollateralAssignmentEncoder settlSessID(final DirectBuffer value, final int length)
    {
        return settlSessID(value, 0, length);
    }

    public CollateralAssignmentEncoder settlSessID(final DirectBuffer value)
    {
        return settlSessID(value, 0, value.capacity());
    }

    public CollateralAssignmentEncoder settlSessID(final byte[] value, final int offset, final int length)
    {
        settlSessID.wrap(value);
        settlSessIDOffset = offset;
        settlSessIDLength = length;
        return this;
    }

    public CollateralAssignmentEncoder settlSessIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlSessID, value, offset, length);
        settlSessIDOffset = offset;
        settlSessIDLength = length;
        return this;
    }

    public CollateralAssignmentEncoder settlSessID(final byte[] value, final int length)
    {
        return settlSessID(value, 0, length);
    }

    public CollateralAssignmentEncoder settlSessID(final byte[] value)
    {
        return settlSessID(value, 0, value.length);
    }

    public boolean hasSettlSessID()
    {
        return settlSessIDLength > 0;
    }

    public MutableDirectBuffer settlSessID()
    {
        return settlSessID;
    }

    public String settlSessIDAsString()
    {
        return settlSessID.getStringWithoutLengthAscii(settlSessIDOffset, settlSessIDLength);
    }

    public CollateralAssignmentEncoder settlSessID(final CharSequence value)
    {
        toBytes(value, settlSessID);
        settlSessIDOffset = 0;
        settlSessIDLength = value.length();
        return this;
    }

    public CollateralAssignmentEncoder settlSessID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            settlSessID.wrap(buffer);
            settlSessIDOffset = value.offset();
            settlSessIDLength = value.length();
        }
        return this;
    }

    public CollateralAssignmentEncoder settlSessID(final char[] value)
    {
        return settlSessID(value, 0, value.length);
    }

    public CollateralAssignmentEncoder settlSessID(final char[] value, final int length)
    {
        return settlSessID(value, 0, length);
    }

    public CollateralAssignmentEncoder settlSessID(final char[] value, final int offset, final int length)
    {
        toBytes(value, settlSessID, offset, length);
        settlSessIDOffset = 0;
        settlSessIDLength = length;
        return this;
    }

    private final MutableDirectBuffer settlSessSubID = new UnsafeBuffer();

    private int settlSessSubIDOffset = 0;

    private int settlSessSubIDLength = 0;

    public CollateralAssignmentEncoder settlSessSubID(final DirectBuffer value, final int offset, final int length)
    {
        settlSessSubID.wrap(value);
        settlSessSubIDOffset = offset;
        settlSessSubIDLength = length;
        return this;
    }

    public CollateralAssignmentEncoder settlSessSubID(final DirectBuffer value, final int length)
    {
        return settlSessSubID(value, 0, length);
    }

    public CollateralAssignmentEncoder settlSessSubID(final DirectBuffer value)
    {
        return settlSessSubID(value, 0, value.capacity());
    }

    public CollateralAssignmentEncoder settlSessSubID(final byte[] value, final int offset, final int length)
    {
        settlSessSubID.wrap(value);
        settlSessSubIDOffset = offset;
        settlSessSubIDLength = length;
        return this;
    }

    public CollateralAssignmentEncoder settlSessSubIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlSessSubID, value, offset, length);
        settlSessSubIDOffset = offset;
        settlSessSubIDLength = length;
        return this;
    }

    public CollateralAssignmentEncoder settlSessSubID(final byte[] value, final int length)
    {
        return settlSessSubID(value, 0, length);
    }

    public CollateralAssignmentEncoder settlSessSubID(final byte[] value)
    {
        return settlSessSubID(value, 0, value.length);
    }

    public boolean hasSettlSessSubID()
    {
        return settlSessSubIDLength > 0;
    }

    public MutableDirectBuffer settlSessSubID()
    {
        return settlSessSubID;
    }

    public String settlSessSubIDAsString()
    {
        return settlSessSubID.getStringWithoutLengthAscii(settlSessSubIDOffset, settlSessSubIDLength);
    }

    public CollateralAssignmentEncoder settlSessSubID(final CharSequence value)
    {
        toBytes(value, settlSessSubID);
        settlSessSubIDOffset = 0;
        settlSessSubIDLength = value.length();
        return this;
    }

    public CollateralAssignmentEncoder settlSessSubID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            settlSessSubID.wrap(buffer);
            settlSessSubIDOffset = value.offset();
            settlSessSubIDLength = value.length();
        }
        return this;
    }

    public CollateralAssignmentEncoder settlSessSubID(final char[] value)
    {
        return settlSessSubID(value, 0, value.length);
    }

    public CollateralAssignmentEncoder settlSessSubID(final char[] value, final int length)
    {
        return settlSessSubID(value, 0, length);
    }

    public CollateralAssignmentEncoder settlSessSubID(final char[] value, final int offset, final int length)
    {
        toBytes(value, settlSessSubID, offset, length);
        settlSessSubIDOffset = 0;
        settlSessSubIDLength = length;
        return this;
    }

    private final MutableDirectBuffer clearingBusinessDate = new UnsafeBuffer();

    private int clearingBusinessDateOffset = 0;

    private int clearingBusinessDateLength = 0;

    public CollateralAssignmentEncoder clearingBusinessDate(final DirectBuffer value, final int offset, final int length)
    {
        clearingBusinessDate.wrap(value);
        clearingBusinessDateOffset = offset;
        clearingBusinessDateLength = length;
        return this;
    }

    public CollateralAssignmentEncoder clearingBusinessDate(final DirectBuffer value, final int length)
    {
        return clearingBusinessDate(value, 0, length);
    }

    public CollateralAssignmentEncoder clearingBusinessDate(final DirectBuffer value)
    {
        return clearingBusinessDate(value, 0, value.capacity());
    }

    public CollateralAssignmentEncoder clearingBusinessDate(final byte[] value, final int offset, final int length)
    {
        clearingBusinessDate.wrap(value);
        clearingBusinessDateOffset = offset;
        clearingBusinessDateLength = length;
        return this;
    }

    public CollateralAssignmentEncoder clearingBusinessDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(clearingBusinessDate, value, offset, length);
        clearingBusinessDateOffset = offset;
        clearingBusinessDateLength = length;
        return this;
    }

    public CollateralAssignmentEncoder clearingBusinessDate(final byte[] value, final int length)
    {
        return clearingBusinessDate(value, 0, length);
    }

    public CollateralAssignmentEncoder clearingBusinessDate(final byte[] value)
    {
        return clearingBusinessDate(value, 0, value.length);
    }

    public boolean hasClearingBusinessDate()
    {
        return clearingBusinessDateLength > 0;
    }

    public MutableDirectBuffer clearingBusinessDate()
    {
        return clearingBusinessDate;
    }

    public String clearingBusinessDateAsString()
    {
        return clearingBusinessDate.getStringWithoutLengthAscii(clearingBusinessDateOffset, clearingBusinessDateLength);
    }

    private final MutableDirectBuffer text = new UnsafeBuffer();

    private int textOffset = 0;

    private int textLength = 0;

    public CollateralAssignmentEncoder text(final DirectBuffer value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public CollateralAssignmentEncoder text(final DirectBuffer value, final int length)
    {
        return text(value, 0, length);
    }

    public CollateralAssignmentEncoder text(final DirectBuffer value)
    {
        return text(value, 0, value.capacity());
    }

    public CollateralAssignmentEncoder text(final byte[] value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public CollateralAssignmentEncoder textAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(text, value, offset, length);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public CollateralAssignmentEncoder text(final byte[] value, final int length)
    {
        return text(value, 0, length);
    }

    public CollateralAssignmentEncoder text(final byte[] value)
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

    public CollateralAssignmentEncoder text(final CharSequence value)
    {
        toBytes(value, text);
        textOffset = 0;
        textLength = value.length();
        return this;
    }

    public CollateralAssignmentEncoder text(final AsciiSequenceView value)
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

    public CollateralAssignmentEncoder text(final char[] value)
    {
        return text(value, 0, value.length);
    }

    public CollateralAssignmentEncoder text(final char[] value, final int length)
    {
        return text(value, 0, length);
    }

    public CollateralAssignmentEncoder text(final char[] value, final int offset, final int length)
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

    public CollateralAssignmentEncoder encodedTextLen(int value)
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

    public CollateralAssignmentEncoder encodedText(byte[] value)
    {
        encodedText = value;
        hasEncodedText = true;
        return this;
    }

    public byte[] encodedText()
    {
        return encodedText;
    }

    public CollateralAssignmentEncoder encodedTextAsCopy(final byte[] value, final int offset, final int length)
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

        if (collAsgnIDLength > 0)
        {
            buffer.putBytes(position, collAsgnIDHeader, 0, collAsgnIDHeaderLength);
            position += collAsgnIDHeaderLength;
            buffer.putBytes(position, collAsgnID, collAsgnIDOffset, collAsgnIDLength);
            position += collAsgnIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: CollAsgnID");
        }

        if (collReqIDLength > 0)
        {
            buffer.putBytes(position, collReqIDHeader, 0, collReqIDHeaderLength);
            position += collReqIDHeaderLength;
            buffer.putBytes(position, collReqID, collReqIDOffset, collReqIDLength);
            position += collReqIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasCollAsgnReason)
        {
            buffer.putBytes(position, collAsgnReasonHeader, 0, collAsgnReasonHeaderLength);
            position += collAsgnReasonHeaderLength;
            position += buffer.putIntAscii(position, collAsgnReason);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: CollAsgnReason");
        }

        if (hasCollAsgnTransType)
        {
            buffer.putBytes(position, collAsgnTransTypeHeader, 0, collAsgnTransTypeHeaderLength);
            position += collAsgnTransTypeHeaderLength;
            position += buffer.putIntAscii(position, collAsgnTransType);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: CollAsgnTransType");
        }

        if (collAsgnRefIDLength > 0)
        {
            buffer.putBytes(position, collAsgnRefIDHeader, 0, collAsgnRefIDHeaderLength);
            position += collAsgnRefIDHeaderLength;
            buffer.putBytes(position, collAsgnRefID, collAsgnRefIDOffset, collAsgnRefIDLength);
            position += collAsgnRefIDLength;
            buffer.putSeparator(position);
            position++;
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

        if (expireTimeLength > 0)
        {
            buffer.putBytes(position, expireTimeHeader, 0, expireTimeHeaderLength);
            position += expireTimeHeaderLength;
            buffer.putBytes(position, expireTime, expireTimeOffset, expireTimeLength);
            position += expireTimeLength;
            buffer.putSeparator(position);
            position++;
        }

            position += parties.encode(buffer, position);

        if (accountLength > 0)
        {
            buffer.putBytes(position, accountHeader, 0, accountHeaderLength);
            position += accountHeaderLength;
            buffer.putBytes(position, account, accountOffset, accountLength);
            position += accountLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasAccountType)
        {
            buffer.putBytes(position, accountTypeHeader, 0, accountTypeHeaderLength);
            position += accountTypeHeaderLength;
            position += buffer.putIntAscii(position, accountType);
            buffer.putSeparator(position);
            position++;
        }

        if (clOrdIDLength > 0)
        {
            buffer.putBytes(position, clOrdIDHeader, 0, clOrdIDHeaderLength);
            position += clOrdIDHeaderLength;
            buffer.putBytes(position, clOrdID, clOrdIDOffset, clOrdIDLength);
            position += clOrdIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (orderIDLength > 0)
        {
            buffer.putBytes(position, orderIDHeader, 0, orderIDHeaderLength);
            position += orderIDHeaderLength;
            buffer.putBytes(position, orderID, orderIDOffset, orderIDLength);
            position += orderIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (secondaryOrderIDLength > 0)
        {
            buffer.putBytes(position, secondaryOrderIDHeader, 0, secondaryOrderIDHeaderLength);
            position += secondaryOrderIDHeaderLength;
            buffer.putBytes(position, secondaryOrderID, secondaryOrderIDOffset, secondaryOrderIDLength);
            position += secondaryOrderIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (secondaryClOrdIDLength > 0)
        {
            buffer.putBytes(position, secondaryClOrdIDHeader, 0, secondaryClOrdIDHeaderLength);
            position += secondaryClOrdIDHeaderLength;
            buffer.putBytes(position, secondaryClOrdID, secondaryClOrdIDOffset, secondaryClOrdIDLength);
            position += secondaryClOrdIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasNoExecsGroupCounter)
        {
            buffer.putBytes(position, noExecsGroupCounterHeader, 0, noExecsGroupCounterHeaderLength);
            position += noExecsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noExecsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (execsGroup != null)
        {
            position += execsGroup.encode(buffer, position, noExecsGroupCounter);
        }


        if (hasNoTradesGroupCounter)
        {
            buffer.putBytes(position, noTradesGroupCounterHeader, 0, noTradesGroupCounterHeaderLength);
            position += noTradesGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noTradesGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (tradesGroup != null)
        {
            position += tradesGroup.encode(buffer, position, noTradesGroupCounter);
        }


            position += instrument.encode(buffer, position);

            position += financingDetails.encode(buffer, position);

        if (settlDateLength > 0)
        {
            buffer.putBytes(position, settlDateHeader, 0, settlDateHeaderLength);
            position += settlDateHeaderLength;
            buffer.putBytes(position, settlDate, settlDateOffset, settlDateLength);
            position += settlDateLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasQuantity)
        {
            buffer.putBytes(position, quantityHeader, 0, quantityHeaderLength);
            position += quantityHeaderLength;
            position += buffer.putFloatAscii(position, quantity);
            buffer.putSeparator(position);
            position++;
        }

        if (hasQtyType)
        {
            buffer.putBytes(position, qtyTypeHeader, 0, qtyTypeHeaderLength);
            position += qtyTypeHeaderLength;
            position += buffer.putIntAscii(position, qtyType);
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

        if (hasNoLegsGroupCounter)
        {
            buffer.putBytes(position, noLegsGroupCounterHeader, 0, noLegsGroupCounterHeaderLength);
            position += noLegsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noLegsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (legsGroup != null)
        {
            position += legsGroup.encode(buffer, position, noLegsGroupCounter);
        }


        if (hasNoUnderlyingsGroupCounter)
        {
            buffer.putBytes(position, noUnderlyingsGroupCounterHeader, 0, noUnderlyingsGroupCounterHeaderLength);
            position += noUnderlyingsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noUnderlyingsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (underlyingsGroup != null)
        {
            position += underlyingsGroup.encode(buffer, position, noUnderlyingsGroupCounter);
        }


        if (hasMarginExcess)
        {
            buffer.putBytes(position, marginExcessHeader, 0, marginExcessHeaderLength);
            position += marginExcessHeaderLength;
            position += buffer.putFloatAscii(position, marginExcess);
            buffer.putSeparator(position);
            position++;
        }

        if (hasTotalNetValue)
        {
            buffer.putBytes(position, totalNetValueHeader, 0, totalNetValueHeaderLength);
            position += totalNetValueHeaderLength;
            position += buffer.putFloatAscii(position, totalNetValue);
            buffer.putSeparator(position);
            position++;
        }

        if (hasCashOutstanding)
        {
            buffer.putBytes(position, cashOutstandingHeader, 0, cashOutstandingHeaderLength);
            position += cashOutstandingHeaderLength;
            position += buffer.putFloatAscii(position, cashOutstanding);
            buffer.putSeparator(position);
            position++;
        }

            position += trdRegTimestamps.encode(buffer, position);

        if (hasSide)
        {
            buffer.putBytes(position, sideHeader, 0, sideHeaderLength);
            position += sideHeaderLength;
            position += buffer.putCharAscii(position, side);
            buffer.putSeparator(position);
            position++;
        }

        if (hasNoMiscFeesGroupCounter)
        {
            buffer.putBytes(position, noMiscFeesGroupCounterHeader, 0, noMiscFeesGroupCounterHeaderLength);
            position += noMiscFeesGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noMiscFeesGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (miscFeesGroup != null)
        {
            position += miscFeesGroup.encode(buffer, position, noMiscFeesGroupCounter);
        }


        if (hasPrice)
        {
            buffer.putBytes(position, priceHeader, 0, priceHeaderLength);
            position += priceHeaderLength;
            position += buffer.putFloatAscii(position, price);
            buffer.putSeparator(position);
            position++;
        }

        if (hasPriceType)
        {
            buffer.putBytes(position, priceTypeHeader, 0, priceTypeHeaderLength);
            position += priceTypeHeaderLength;
            position += buffer.putIntAscii(position, priceType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasAccruedInterestAmt)
        {
            buffer.putBytes(position, accruedInterestAmtHeader, 0, accruedInterestAmtHeaderLength);
            position += accruedInterestAmtHeaderLength;
            position += buffer.putFloatAscii(position, accruedInterestAmt);
            buffer.putSeparator(position);
            position++;
        }

        if (hasEndAccruedInterestAmt)
        {
            buffer.putBytes(position, endAccruedInterestAmtHeader, 0, endAccruedInterestAmtHeaderLength);
            position += endAccruedInterestAmtHeaderLength;
            position += buffer.putFloatAscii(position, endAccruedInterestAmt);
            buffer.putSeparator(position);
            position++;
        }

        if (hasStartCash)
        {
            buffer.putBytes(position, startCashHeader, 0, startCashHeaderLength);
            position += startCashHeaderLength;
            position += buffer.putFloatAscii(position, startCash);
            buffer.putSeparator(position);
            position++;
        }

        if (hasEndCash)
        {
            buffer.putBytes(position, endCashHeader, 0, endCashHeaderLength);
            position += endCashHeaderLength;
            position += buffer.putFloatAscii(position, endCash);
            buffer.putSeparator(position);
            position++;
        }

            position += spreadOrBenchmarkCurveData.encode(buffer, position);

            position += stipulations.encode(buffer, position);

            position += settlInstructionsData.encode(buffer, position);

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

        if (settlSessIDLength > 0)
        {
            buffer.putBytes(position, settlSessIDHeader, 0, settlSessIDHeaderLength);
            position += settlSessIDHeaderLength;
            buffer.putBytes(position, settlSessID, settlSessIDOffset, settlSessIDLength);
            position += settlSessIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (settlSessSubIDLength > 0)
        {
            buffer.putBytes(position, settlSessSubIDHeader, 0, settlSessSubIDHeaderLength);
            position += settlSessSubIDHeaderLength;
            buffer.putBytes(position, settlSessSubID, settlSessSubIDOffset, settlSessSubIDLength);
            position += settlSessSubIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (clearingBusinessDateLength > 0)
        {
            buffer.putBytes(position, clearingBusinessDateHeader, 0, clearingBusinessDateHeaderLength);
            position += clearingBusinessDateHeaderLength;
            buffer.putBytes(position, clearingBusinessDate, clearingBusinessDateOffset, clearingBusinessDateLength);
            position += clearingBusinessDateLength;
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
        this.resetCollAsgnID();
        this.resetCollReqID();
        this.resetCollAsgnReason();
        this.resetCollAsgnTransType();
        this.resetCollAsgnRefID();
        this.resetTransactTime();
        this.resetExpireTime();
        this.resetAccount();
        this.resetAccountType();
        this.resetClOrdID();
        this.resetOrderID();
        this.resetSecondaryOrderID();
        this.resetSecondaryClOrdID();
        this.resetSettlDate();
        this.resetQuantity();
        this.resetQtyType();
        this.resetCurrency();
        this.resetMarginExcess();
        this.resetTotalNetValue();
        this.resetCashOutstanding();
        this.resetSide();
        this.resetPrice();
        this.resetPriceType();
        this.resetAccruedInterestAmt();
        this.resetEndAccruedInterestAmt();
        this.resetStartCash();
        this.resetEndCash();
        this.resetTradingSessionID();
        this.resetTradingSessionSubID();
        this.resetSettlSessID();
        this.resetSettlSessSubID();
        this.resetClearingBusinessDate();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        parties.reset();
        instrument.reset();
        financingDetails.reset();
        trdRegTimestamps.reset();
        spreadOrBenchmarkCurveData.reset();
        stipulations.reset();
        settlInstructionsData.reset();
        this.resetExecsGroup();
        this.resetTradesGroup();
        this.resetLegsGroup();
        this.resetUnderlyingsGroup();
        this.resetMiscFeesGroup();
    }

    public void resetCollAsgnID()
    {
        collAsgnIDLength = 0;
    }

    public void resetCollReqID()
    {
        collReqIDLength = 0;
    }

    public void resetCollAsgnReason()
    {
        hasCollAsgnReason = false;
    }

    public void resetCollAsgnTransType()
    {
        hasCollAsgnTransType = false;
    }

    public void resetCollAsgnRefID()
    {
        collAsgnRefIDLength = 0;
    }

    public void resetTransactTime()
    {
        transactTimeLength = 0;
    }

    public void resetExpireTime()
    {
        expireTimeLength = 0;
    }

    public void resetAccount()
    {
        accountLength = 0;
    }

    public void resetAccountType()
    {
        hasAccountType = false;
    }

    public void resetClOrdID()
    {
        clOrdIDLength = 0;
    }

    public void resetOrderID()
    {
        orderIDLength = 0;
    }

    public void resetSecondaryOrderID()
    {
        secondaryOrderIDLength = 0;
    }

    public void resetSecondaryClOrdID()
    {
        secondaryClOrdIDLength = 0;
    }

    public void resetSettlDate()
    {
        settlDateLength = 0;
    }

    public void resetQuantity()
    {
        hasQuantity = false;
    }

    public void resetQtyType()
    {
        hasQtyType = false;
    }

    public void resetCurrency()
    {
        currencyLength = 0;
    }

    public void resetMarginExcess()
    {
        hasMarginExcess = false;
    }

    public void resetTotalNetValue()
    {
        hasTotalNetValue = false;
    }

    public void resetCashOutstanding()
    {
        hasCashOutstanding = false;
    }

    public void resetSide()
    {
        hasSide = false;
    }

    public void resetPrice()
    {
        hasPrice = false;
    }

    public void resetPriceType()
    {
        hasPriceType = false;
    }

    public void resetAccruedInterestAmt()
    {
        hasAccruedInterestAmt = false;
    }

    public void resetEndAccruedInterestAmt()
    {
        hasEndAccruedInterestAmt = false;
    }

    public void resetStartCash()
    {
        hasStartCash = false;
    }

    public void resetEndCash()
    {
        hasEndCash = false;
    }

    public void resetTradingSessionID()
    {
        tradingSessionIDLength = 0;
    }

    public void resetTradingSessionSubID()
    {
        tradingSessionSubIDLength = 0;
    }

    public void resetSettlSessID()
    {
        settlSessIDLength = 0;
    }

    public void resetSettlSessSubID()
    {
        settlSessSubIDLength = 0;
    }

    public void resetClearingBusinessDate()
    {
        clearingBusinessDateLength = 0;
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

    public void resetExecsGroup()
    {
        if (execsGroup != null)
        {
            execsGroup.reset();
        }
        noExecsGroupCounter = 0;
        hasNoExecsGroupCounter = false;
    }

    public void resetTradesGroup()
    {
        if (tradesGroup != null)
        {
            tradesGroup.reset();
        }
        noTradesGroupCounter = 0;
        hasNoTradesGroupCounter = false;
    }

    public void resetLegsGroup()
    {
        if (legsGroup != null)
        {
            legsGroup.reset();
        }
        noLegsGroupCounter = 0;
        hasNoLegsGroupCounter = false;
    }

    public void resetUnderlyingsGroup()
    {
        if (underlyingsGroup != null)
        {
            underlyingsGroup.reset();
        }
        noUnderlyingsGroupCounter = 0;
        hasNoUnderlyingsGroupCounter = false;
    }

    public void resetMiscFeesGroup()
    {
        if (miscFeesGroup != null)
        {
            miscFeesGroup.reset();
        }
        noMiscFeesGroupCounter = 0;
        hasNoMiscFeesGroupCounter = false;
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
        builder.append("\"MessageName\": \"CollateralAssignment\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasCollAsgnID())
        {
            indent(builder, level);
            builder.append("\"CollAsgnID\": \"");
            appendBuffer(builder, collAsgnID, collAsgnIDOffset, collAsgnIDLength);
            builder.append("\",\n");
        }

        if (hasCollReqID())
        {
            indent(builder, level);
            builder.append("\"CollReqID\": \"");
            appendBuffer(builder, collReqID, collReqIDOffset, collReqIDLength);
            builder.append("\",\n");
        }

        if (hasCollAsgnReason())
        {
            indent(builder, level);
            builder.append("\"CollAsgnReason\": \"");
            builder.append(collAsgnReason);
            builder.append("\",\n");
        }

        if (hasCollAsgnTransType())
        {
            indent(builder, level);
            builder.append("\"CollAsgnTransType\": \"");
            builder.append(collAsgnTransType);
            builder.append("\",\n");
        }

        if (hasCollAsgnRefID())
        {
            indent(builder, level);
            builder.append("\"CollAsgnRefID\": \"");
            appendBuffer(builder, collAsgnRefID, collAsgnRefIDOffset, collAsgnRefIDLength);
            builder.append("\",\n");
        }

        if (hasTransactTime())
        {
            indent(builder, level);
            builder.append("\"TransactTime\": \"");
            appendBuffer(builder, transactTime, transactTimeOffset, transactTimeLength);
            builder.append("\",\n");
        }

        if (hasExpireTime())
        {
            indent(builder, level);
            builder.append("\"ExpireTime\": \"");
            appendBuffer(builder, expireTime, expireTimeOffset, expireTimeLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"Parties\": ");
    parties.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasAccount())
        {
            indent(builder, level);
            builder.append("\"Account\": \"");
            appendBuffer(builder, account, accountOffset, accountLength);
            builder.append("\",\n");
        }

        if (hasAccountType())
        {
            indent(builder, level);
            builder.append("\"AccountType\": \"");
            builder.append(accountType);
            builder.append("\",\n");
        }

        if (hasClOrdID())
        {
            indent(builder, level);
            builder.append("\"ClOrdID\": \"");
            appendBuffer(builder, clOrdID, clOrdIDOffset, clOrdIDLength);
            builder.append("\",\n");
        }

        if (hasOrderID())
        {
            indent(builder, level);
            builder.append("\"OrderID\": \"");
            appendBuffer(builder, orderID, orderIDOffset, orderIDLength);
            builder.append("\",\n");
        }

        if (hasSecondaryOrderID())
        {
            indent(builder, level);
            builder.append("\"SecondaryOrderID\": \"");
            appendBuffer(builder, secondaryOrderID, secondaryOrderIDOffset, secondaryOrderIDLength);
            builder.append("\",\n");
        }

        if (hasSecondaryClOrdID())
        {
            indent(builder, level);
            builder.append("\"SecondaryClOrdID\": \"");
            appendBuffer(builder, secondaryClOrdID, secondaryClOrdIDOffset, secondaryClOrdIDLength);
            builder.append("\",\n");
        }

        if (hasNoExecsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"ExecsGroup\": [\n");
            final int noExecsGroupCounter = this.noExecsGroupCounter;
            ExecsGroupEncoder execsGroup = this.execsGroup;
            for (int i = 0; i < noExecsGroupCounter; i++)
            {
                indent(builder, level);
                execsGroup.appendTo(builder, level + 1);
                if (i < (noExecsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                execsGroup = execsGroup.next();
            }
            indent(builder, level);
            builder.append("],\n");
        }

        if (hasNoTradesGroupCounter)
        {
            indent(builder, level);
            builder.append("\"TradesGroup\": [\n");
            final int noTradesGroupCounter = this.noTradesGroupCounter;
            TradesGroupEncoder tradesGroup = this.tradesGroup;
            for (int i = 0; i < noTradesGroupCounter; i++)
            {
                indent(builder, level);
                tradesGroup.appendTo(builder, level + 1);
                if (i < (noTradesGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                tradesGroup = tradesGroup.next();
            }
            indent(builder, level);
            builder.append("],\n");
        }

    indent(builder, level);
    builder.append("\"Instrument\": ");
    instrument.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"FinancingDetails\": ");
    financingDetails.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasSettlDate())
        {
            indent(builder, level);
            builder.append("\"SettlDate\": \"");
            appendBuffer(builder, settlDate, settlDateOffset, settlDateLength);
            builder.append("\",\n");
        }

        if (hasQuantity())
        {
            indent(builder, level);
            builder.append("\"Quantity\": \"");
            quantity.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasQtyType())
        {
            indent(builder, level);
            builder.append("\"QtyType\": \"");
            builder.append(qtyType);
            builder.append("\",\n");
        }

        if (hasCurrency())
        {
            indent(builder, level);
            builder.append("\"Currency\": \"");
            appendBuffer(builder, currency, currencyOffset, currencyLength);
            builder.append("\",\n");
        }

        if (hasNoLegsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"LegsGroup\": [\n");
            final int noLegsGroupCounter = this.noLegsGroupCounter;
            LegsGroupEncoder legsGroup = this.legsGroup;
            for (int i = 0; i < noLegsGroupCounter; i++)
            {
                indent(builder, level);
                legsGroup.appendTo(builder, level + 1);
                if (i < (noLegsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                legsGroup = legsGroup.next();
            }
            indent(builder, level);
            builder.append("],\n");
        }

        if (hasNoUnderlyingsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"UnderlyingsGroup\": [\n");
            final int noUnderlyingsGroupCounter = this.noUnderlyingsGroupCounter;
            UnderlyingsGroupEncoder underlyingsGroup = this.underlyingsGroup;
            for (int i = 0; i < noUnderlyingsGroupCounter; i++)
            {
                indent(builder, level);
                underlyingsGroup.appendTo(builder, level + 1);
                if (i < (noUnderlyingsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                underlyingsGroup = underlyingsGroup.next();
            }
            indent(builder, level);
            builder.append("],\n");
        }

        if (hasMarginExcess())
        {
            indent(builder, level);
            builder.append("\"MarginExcess\": \"");
            marginExcess.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasTotalNetValue())
        {
            indent(builder, level);
            builder.append("\"TotalNetValue\": \"");
            totalNetValue.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasCashOutstanding())
        {
            indent(builder, level);
            builder.append("\"CashOutstanding\": \"");
            cashOutstanding.appendTo(builder);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"TrdRegTimestamps\": ");
    trdRegTimestamps.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasSide())
        {
            indent(builder, level);
            builder.append("\"Side\": \"");
            builder.append(side);
            builder.append("\",\n");
        }

        if (hasNoMiscFeesGroupCounter)
        {
            indent(builder, level);
            builder.append("\"MiscFeesGroup\": [\n");
            final int noMiscFeesGroupCounter = this.noMiscFeesGroupCounter;
            MiscFeesGroupEncoder miscFeesGroup = this.miscFeesGroup;
            for (int i = 0; i < noMiscFeesGroupCounter; i++)
            {
                indent(builder, level);
                miscFeesGroup.appendTo(builder, level + 1);
                if (i < (noMiscFeesGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                miscFeesGroup = miscFeesGroup.next();
            }
            indent(builder, level);
            builder.append("],\n");
        }

        if (hasPrice())
        {
            indent(builder, level);
            builder.append("\"Price\": \"");
            price.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasPriceType())
        {
            indent(builder, level);
            builder.append("\"PriceType\": \"");
            builder.append(priceType);
            builder.append("\",\n");
        }

        if (hasAccruedInterestAmt())
        {
            indent(builder, level);
            builder.append("\"AccruedInterestAmt\": \"");
            accruedInterestAmt.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasEndAccruedInterestAmt())
        {
            indent(builder, level);
            builder.append("\"EndAccruedInterestAmt\": \"");
            endAccruedInterestAmt.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasStartCash())
        {
            indent(builder, level);
            builder.append("\"StartCash\": \"");
            startCash.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasEndCash())
        {
            indent(builder, level);
            builder.append("\"EndCash\": \"");
            endCash.appendTo(builder);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"SpreadOrBenchmarkCurveData\": ");
    spreadOrBenchmarkCurveData.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"Stipulations\": ");
    stipulations.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"SettlInstructionsData\": ");
    settlInstructionsData.appendTo(builder, level + 1);
    builder.append("\n");

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

        if (hasSettlSessID())
        {
            indent(builder, level);
            builder.append("\"SettlSessID\": \"");
            appendBuffer(builder, settlSessID, settlSessIDOffset, settlSessIDLength);
            builder.append("\",\n");
        }

        if (hasSettlSessSubID())
        {
            indent(builder, level);
            builder.append("\"SettlSessSubID\": \"");
            appendBuffer(builder, settlSessSubID, settlSessSubIDOffset, settlSessSubIDLength);
            builder.append("\",\n");
        }

        if (hasClearingBusinessDate())
        {
            indent(builder, level);
            builder.append("\"ClearingBusinessDate\": \"");
            appendBuffer(builder, clearingBusinessDate, clearingBusinessDateOffset, clearingBusinessDateLength);
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
    public CollateralAssignmentEncoder copyTo(final Encoder encoder)
    {
        return copyTo((CollateralAssignmentEncoder)encoder);
    }

    public CollateralAssignmentEncoder copyTo(final CollateralAssignmentEncoder encoder)
    {
        encoder.reset();
        if (hasCollAsgnID())
        {
            encoder.collAsgnIDAsCopy(collAsgnID.byteArray(), 0, collAsgnIDLength);
        }

        if (hasCollReqID())
        {
            encoder.collReqIDAsCopy(collReqID.byteArray(), 0, collReqIDLength);
        }

        if (hasCollAsgnReason())
        {
            encoder.collAsgnReason(this.collAsgnReason());
        }

        if (hasCollAsgnTransType())
        {
            encoder.collAsgnTransType(this.collAsgnTransType());
        }

        if (hasCollAsgnRefID())
        {
            encoder.collAsgnRefIDAsCopy(collAsgnRefID.byteArray(), 0, collAsgnRefIDLength);
        }

        if (hasTransactTime())
        {
            encoder.transactTimeAsCopy(transactTime.byteArray(), 0, transactTimeLength);
        }

        if (hasExpireTime())
        {
            encoder.expireTimeAsCopy(expireTime.byteArray(), 0, expireTimeLength);
        }


        parties.copyTo(encoder.parties());
        if (hasAccount())
        {
            encoder.accountAsCopy(account.byteArray(), 0, accountLength);
        }

        if (hasAccountType())
        {
            encoder.accountType(this.accountType());
        }

        if (hasClOrdID())
        {
            encoder.clOrdIDAsCopy(clOrdID.byteArray(), 0, clOrdIDLength);
        }

        if (hasOrderID())
        {
            encoder.orderIDAsCopy(orderID.byteArray(), 0, orderIDLength);
        }

        if (hasSecondaryOrderID())
        {
            encoder.secondaryOrderIDAsCopy(secondaryOrderID.byteArray(), 0, secondaryOrderIDLength);
        }

        if (hasSecondaryClOrdID())
        {
            encoder.secondaryClOrdIDAsCopy(secondaryClOrdID.byteArray(), 0, secondaryClOrdIDLength);
        }

        if (hasNoExecsGroupCounter)
        {
            final int size = this.noExecsGroupCounter;
            ExecsGroupEncoder execsGroup = this.execsGroup;
            ExecsGroupEncoder execsGroupEncoder = encoder.execsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (execsGroup != null)
                {
                    execsGroup.copyTo(execsGroupEncoder);
                    execsGroup = execsGroup.next();
                    execsGroupEncoder = execsGroupEncoder.next();
                }
            }
        }

        if (hasNoTradesGroupCounter)
        {
            final int size = this.noTradesGroupCounter;
            TradesGroupEncoder tradesGroup = this.tradesGroup;
            TradesGroupEncoder tradesGroupEncoder = encoder.tradesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (tradesGroup != null)
                {
                    tradesGroup.copyTo(tradesGroupEncoder);
                    tradesGroup = tradesGroup.next();
                    tradesGroupEncoder = tradesGroupEncoder.next();
                }
            }
        }


        instrument.copyTo(encoder.instrument());

        financingDetails.copyTo(encoder.financingDetails());
        if (hasSettlDate())
        {
            encoder.settlDateAsCopy(settlDate.byteArray(), 0, settlDateLength);
        }

        if (hasQuantity())
        {
            encoder.quantity(this.quantity());
        }

        if (hasQtyType())
        {
            encoder.qtyType(this.qtyType());
        }

        if (hasCurrency())
        {
            encoder.currencyAsCopy(currency.byteArray(), 0, currencyLength);
        }

        if (hasNoLegsGroupCounter)
        {
            final int size = this.noLegsGroupCounter;
            LegsGroupEncoder legsGroup = this.legsGroup;
            LegsGroupEncoder legsGroupEncoder = encoder.legsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (legsGroup != null)
                {
                    legsGroup.copyTo(legsGroupEncoder);
                    legsGroup = legsGroup.next();
                    legsGroupEncoder = legsGroupEncoder.next();
                }
            }
        }

        if (hasNoUnderlyingsGroupCounter)
        {
            final int size = this.noUnderlyingsGroupCounter;
            UnderlyingsGroupEncoder underlyingsGroup = this.underlyingsGroup;
            UnderlyingsGroupEncoder underlyingsGroupEncoder = encoder.underlyingsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (underlyingsGroup != null)
                {
                    underlyingsGroup.copyTo(underlyingsGroupEncoder);
                    underlyingsGroup = underlyingsGroup.next();
                    underlyingsGroupEncoder = underlyingsGroupEncoder.next();
                }
            }
        }

        if (hasMarginExcess())
        {
            encoder.marginExcess(this.marginExcess());
        }

        if (hasTotalNetValue())
        {
            encoder.totalNetValue(this.totalNetValue());
        }

        if (hasCashOutstanding())
        {
            encoder.cashOutstanding(this.cashOutstanding());
        }


        trdRegTimestamps.copyTo(encoder.trdRegTimestamps());
        if (hasSide())
        {
            encoder.side(this.side());
        }

        if (hasNoMiscFeesGroupCounter)
        {
            final int size = this.noMiscFeesGroupCounter;
            MiscFeesGroupEncoder miscFeesGroup = this.miscFeesGroup;
            MiscFeesGroupEncoder miscFeesGroupEncoder = encoder.miscFeesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (miscFeesGroup != null)
                {
                    miscFeesGroup.copyTo(miscFeesGroupEncoder);
                    miscFeesGroup = miscFeesGroup.next();
                    miscFeesGroupEncoder = miscFeesGroupEncoder.next();
                }
            }
        }

        if (hasPrice())
        {
            encoder.price(this.price());
        }

        if (hasPriceType())
        {
            encoder.priceType(this.priceType());
        }

        if (hasAccruedInterestAmt())
        {
            encoder.accruedInterestAmt(this.accruedInterestAmt());
        }

        if (hasEndAccruedInterestAmt())
        {
            encoder.endAccruedInterestAmt(this.endAccruedInterestAmt());
        }

        if (hasStartCash())
        {
            encoder.startCash(this.startCash());
        }

        if (hasEndCash())
        {
            encoder.endCash(this.endCash());
        }


        spreadOrBenchmarkCurveData.copyTo(encoder.spreadOrBenchmarkCurveData());

        stipulations.copyTo(encoder.stipulations());

        settlInstructionsData.copyTo(encoder.settlInstructionsData());
        if (hasTradingSessionID())
        {
            encoder.tradingSessionIDAsCopy(tradingSessionID.byteArray(), 0, tradingSessionIDLength);
        }

        if (hasTradingSessionSubID())
        {
            encoder.tradingSessionSubIDAsCopy(tradingSessionSubID.byteArray(), 0, tradingSessionSubIDLength);
        }

        if (hasSettlSessID())
        {
            encoder.settlSessIDAsCopy(settlSessID.byteArray(), 0, settlSessIDLength);
        }

        if (hasSettlSessSubID())
        {
            encoder.settlSessSubIDAsCopy(settlSessSubID.byteArray(), 0, settlSessSubIDLength);
        }

        if (hasClearingBusinessDate())
        {
            encoder.clearingBusinessDateAsCopy(clearingBusinessDate.byteArray(), 0, clearingBusinessDateLength);
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
