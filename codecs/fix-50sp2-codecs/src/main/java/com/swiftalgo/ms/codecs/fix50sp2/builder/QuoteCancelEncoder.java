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


public class QuoteCancelEncoder implements Encoder
{
    public long messageType()
    {
        return 90L;
    }

    public QuoteCancelEncoder()
    {
        header.msgType("Z");
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

    private static final int quoteReqIDHeaderLength = 4;
    private static final byte[] quoteReqIDHeader = new byte[] {49, 51, 49, (byte) '='};

    private static final int quoteIDHeaderLength = 4;
    private static final byte[] quoteIDHeader = new byte[] {49, 49, 55, (byte) '='};

    private static final int quoteMsgIDHeaderLength = 5;
    private static final byte[] quoteMsgIDHeader = new byte[] {49, 49, 54, 54, (byte) '='};

    private static final int quoteCancelTypeHeaderLength = 4;
    private static final byte[] quoteCancelTypeHeader = new byte[] {50, 57, 56, (byte) '='};

    private static final int quoteTypeHeaderLength = 4;
    private static final byte[] quoteTypeHeader = new byte[] {53, 51, 55, (byte) '='};

    private static final int quoteResponseLevelHeaderLength = 4;
    private static final byte[] quoteResponseLevelHeader = new byte[] {51, 48, 49, (byte) '='};

    private static final int accountHeaderLength = 2;
    private static final byte[] accountHeader = new byte[] {49, (byte) '='};

    private static final int acctIDSourceHeaderLength = 4;
    private static final byte[] acctIDSourceHeader = new byte[] {54, 54, 48, (byte) '='};

    private static final int accountTypeHeaderLength = 4;
    private static final byte[] accountTypeHeader = new byte[] {53, 56, 49, (byte) '='};

    private static final int tradingSessionIDHeaderLength = 4;
    private static final byte[] tradingSessionIDHeader = new byte[] {51, 51, 54, (byte) '='};

    private static final int tradingSessionSubIDHeaderLength = 4;
    private static final byte[] tradingSessionSubIDHeader = new byte[] {54, 50, 53, (byte) '='};

    private final MutableDirectBuffer quoteReqID = new UnsafeBuffer();

    private int quoteReqIDOffset = 0;

    private int quoteReqIDLength = 0;

    public QuoteCancelEncoder quoteReqID(final DirectBuffer value, final int offset, final int length)
    {
        quoteReqID.wrap(value);
        quoteReqIDOffset = offset;
        quoteReqIDLength = length;
        return this;
    }

    public QuoteCancelEncoder quoteReqID(final DirectBuffer value, final int length)
    {
        return quoteReqID(value, 0, length);
    }

    public QuoteCancelEncoder quoteReqID(final DirectBuffer value)
    {
        return quoteReqID(value, 0, value.capacity());
    }

    public QuoteCancelEncoder quoteReqID(final byte[] value, final int offset, final int length)
    {
        quoteReqID.wrap(value);
        quoteReqIDOffset = offset;
        quoteReqIDLength = length;
        return this;
    }

    public QuoteCancelEncoder quoteReqIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(quoteReqID, value, offset, length);
        quoteReqIDOffset = offset;
        quoteReqIDLength = length;
        return this;
    }

    public QuoteCancelEncoder quoteReqID(final byte[] value, final int length)
    {
        return quoteReqID(value, 0, length);
    }

    public QuoteCancelEncoder quoteReqID(final byte[] value)
    {
        return quoteReqID(value, 0, value.length);
    }

    public boolean hasQuoteReqID()
    {
        return quoteReqIDLength > 0;
    }

    public MutableDirectBuffer quoteReqID()
    {
        return quoteReqID;
    }

    public String quoteReqIDAsString()
    {
        return quoteReqID.getStringWithoutLengthAscii(quoteReqIDOffset, quoteReqIDLength);
    }

    public QuoteCancelEncoder quoteReqID(final CharSequence value)
    {
        toBytes(value, quoteReqID);
        quoteReqIDOffset = 0;
        quoteReqIDLength = value.length();
        return this;
    }

    public QuoteCancelEncoder quoteReqID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            quoteReqID.wrap(buffer);
            quoteReqIDOffset = value.offset();
            quoteReqIDLength = value.length();
        }
        return this;
    }

    public QuoteCancelEncoder quoteReqID(final char[] value)
    {
        return quoteReqID(value, 0, value.length);
    }

    public QuoteCancelEncoder quoteReqID(final char[] value, final int length)
    {
        return quoteReqID(value, 0, length);
    }

    public QuoteCancelEncoder quoteReqID(final char[] value, final int offset, final int length)
    {
        toBytes(value, quoteReqID, offset, length);
        quoteReqIDOffset = 0;
        quoteReqIDLength = length;
        return this;
    }

    private final MutableDirectBuffer quoteID = new UnsafeBuffer();

    private int quoteIDOffset = 0;

    private int quoteIDLength = 0;

    public QuoteCancelEncoder quoteID(final DirectBuffer value, final int offset, final int length)
    {
        quoteID.wrap(value);
        quoteIDOffset = offset;
        quoteIDLength = length;
        return this;
    }

    public QuoteCancelEncoder quoteID(final DirectBuffer value, final int length)
    {
        return quoteID(value, 0, length);
    }

    public QuoteCancelEncoder quoteID(final DirectBuffer value)
    {
        return quoteID(value, 0, value.capacity());
    }

    public QuoteCancelEncoder quoteID(final byte[] value, final int offset, final int length)
    {
        quoteID.wrap(value);
        quoteIDOffset = offset;
        quoteIDLength = length;
        return this;
    }

    public QuoteCancelEncoder quoteIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(quoteID, value, offset, length);
        quoteIDOffset = offset;
        quoteIDLength = length;
        return this;
    }

    public QuoteCancelEncoder quoteID(final byte[] value, final int length)
    {
        return quoteID(value, 0, length);
    }

    public QuoteCancelEncoder quoteID(final byte[] value)
    {
        return quoteID(value, 0, value.length);
    }

    public boolean hasQuoteID()
    {
        return quoteIDLength > 0;
    }

    public MutableDirectBuffer quoteID()
    {
        return quoteID;
    }

    public String quoteIDAsString()
    {
        return quoteID.getStringWithoutLengthAscii(quoteIDOffset, quoteIDLength);
    }

    public QuoteCancelEncoder quoteID(final CharSequence value)
    {
        toBytes(value, quoteID);
        quoteIDOffset = 0;
        quoteIDLength = value.length();
        return this;
    }

    public QuoteCancelEncoder quoteID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            quoteID.wrap(buffer);
            quoteIDOffset = value.offset();
            quoteIDLength = value.length();
        }
        return this;
    }

    public QuoteCancelEncoder quoteID(final char[] value)
    {
        return quoteID(value, 0, value.length);
    }

    public QuoteCancelEncoder quoteID(final char[] value, final int length)
    {
        return quoteID(value, 0, length);
    }

    public QuoteCancelEncoder quoteID(final char[] value, final int offset, final int length)
    {
        toBytes(value, quoteID, offset, length);
        quoteIDOffset = 0;
        quoteIDLength = length;
        return this;
    }

    private final MutableDirectBuffer quoteMsgID = new UnsafeBuffer();

    private int quoteMsgIDOffset = 0;

    private int quoteMsgIDLength = 0;

    public QuoteCancelEncoder quoteMsgID(final DirectBuffer value, final int offset, final int length)
    {
        quoteMsgID.wrap(value);
        quoteMsgIDOffset = offset;
        quoteMsgIDLength = length;
        return this;
    }

    public QuoteCancelEncoder quoteMsgID(final DirectBuffer value, final int length)
    {
        return quoteMsgID(value, 0, length);
    }

    public QuoteCancelEncoder quoteMsgID(final DirectBuffer value)
    {
        return quoteMsgID(value, 0, value.capacity());
    }

    public QuoteCancelEncoder quoteMsgID(final byte[] value, final int offset, final int length)
    {
        quoteMsgID.wrap(value);
        quoteMsgIDOffset = offset;
        quoteMsgIDLength = length;
        return this;
    }

    public QuoteCancelEncoder quoteMsgIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(quoteMsgID, value, offset, length);
        quoteMsgIDOffset = offset;
        quoteMsgIDLength = length;
        return this;
    }

    public QuoteCancelEncoder quoteMsgID(final byte[] value, final int length)
    {
        return quoteMsgID(value, 0, length);
    }

    public QuoteCancelEncoder quoteMsgID(final byte[] value)
    {
        return quoteMsgID(value, 0, value.length);
    }

    public boolean hasQuoteMsgID()
    {
        return quoteMsgIDLength > 0;
    }

    public MutableDirectBuffer quoteMsgID()
    {
        return quoteMsgID;
    }

    public String quoteMsgIDAsString()
    {
        return quoteMsgID.getStringWithoutLengthAscii(quoteMsgIDOffset, quoteMsgIDLength);
    }

    public QuoteCancelEncoder quoteMsgID(final CharSequence value)
    {
        toBytes(value, quoteMsgID);
        quoteMsgIDOffset = 0;
        quoteMsgIDLength = value.length();
        return this;
    }

    public QuoteCancelEncoder quoteMsgID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            quoteMsgID.wrap(buffer);
            quoteMsgIDOffset = value.offset();
            quoteMsgIDLength = value.length();
        }
        return this;
    }

    public QuoteCancelEncoder quoteMsgID(final char[] value)
    {
        return quoteMsgID(value, 0, value.length);
    }

    public QuoteCancelEncoder quoteMsgID(final char[] value, final int length)
    {
        return quoteMsgID(value, 0, length);
    }

    public QuoteCancelEncoder quoteMsgID(final char[] value, final int offset, final int length)
    {
        toBytes(value, quoteMsgID, offset, length);
        quoteMsgIDOffset = 0;
        quoteMsgIDLength = length;
        return this;
    }

    private int quoteCancelType;

    private boolean hasQuoteCancelType;

    public boolean hasQuoteCancelType()
    {
        return hasQuoteCancelType;
    }

    public QuoteCancelEncoder quoteCancelType(int value)
    {
        quoteCancelType = value;
        hasQuoteCancelType = true;
        return this;
    }

    public int quoteCancelType()
    {
        return quoteCancelType;
    }

    public QuoteCancelEncoder quoteCancelType(QuoteCancelType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == QuoteCancelType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: quoteCancelType Value: " + value );
            }
            if (value == QuoteCancelType.NULL_VAL)
            {
                return this;
            }
        }
        return quoteCancelType(value.representation());
    }

    private int quoteType;

    private boolean hasQuoteType;

    public boolean hasQuoteType()
    {
        return hasQuoteType;
    }

    public QuoteCancelEncoder quoteType(int value)
    {
        quoteType = value;
        hasQuoteType = true;
        return this;
    }

    public int quoteType()
    {
        return quoteType;
    }

    public QuoteCancelEncoder quoteType(QuoteType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == QuoteType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: quoteType Value: " + value );
            }
            if (value == QuoteType.NULL_VAL)
            {
                return this;
            }
        }
        return quoteType(value.representation());
    }

    private int quoteResponseLevel;

    private boolean hasQuoteResponseLevel;

    public boolean hasQuoteResponseLevel()
    {
        return hasQuoteResponseLevel;
    }

    public QuoteCancelEncoder quoteResponseLevel(int value)
    {
        quoteResponseLevel = value;
        hasQuoteResponseLevel = true;
        return this;
    }

    public int quoteResponseLevel()
    {
        return quoteResponseLevel;
    }

    public QuoteCancelEncoder quoteResponseLevel(QuoteResponseLevel value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == QuoteResponseLevel.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: quoteResponseLevel Value: " + value );
            }
            if (value == QuoteResponseLevel.NULL_VAL)
            {
                return this;
            }
        }
        return quoteResponseLevel(value.representation());
    }

    private final PartiesEncoder parties = new PartiesEncoder();
    public PartiesEncoder parties()
    {
        return parties;
    }

    private final TargetPartiesEncoder targetParties = new TargetPartiesEncoder();
    public TargetPartiesEncoder targetParties()
    {
        return targetParties;
    }

    private final MutableDirectBuffer account = new UnsafeBuffer();

    private int accountOffset = 0;

    private int accountLength = 0;

    public QuoteCancelEncoder account(final DirectBuffer value, final int offset, final int length)
    {
        account.wrap(value);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    public QuoteCancelEncoder account(final DirectBuffer value, final int length)
    {
        return account(value, 0, length);
    }

    public QuoteCancelEncoder account(final DirectBuffer value)
    {
        return account(value, 0, value.capacity());
    }

    public QuoteCancelEncoder account(final byte[] value, final int offset, final int length)
    {
        account.wrap(value);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    public QuoteCancelEncoder accountAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(account, value, offset, length);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    public QuoteCancelEncoder account(final byte[] value, final int length)
    {
        return account(value, 0, length);
    }

    public QuoteCancelEncoder account(final byte[] value)
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

    public QuoteCancelEncoder account(final CharSequence value)
    {
        toBytes(value, account);
        accountOffset = 0;
        accountLength = value.length();
        return this;
    }

    public QuoteCancelEncoder account(final AsciiSequenceView value)
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

    public QuoteCancelEncoder account(final char[] value)
    {
        return account(value, 0, value.length);
    }

    public QuoteCancelEncoder account(final char[] value, final int length)
    {
        return account(value, 0, length);
    }

    public QuoteCancelEncoder account(final char[] value, final int offset, final int length)
    {
        toBytes(value, account, offset, length);
        accountOffset = 0;
        accountLength = length;
        return this;
    }

    private int acctIDSource;

    private boolean hasAcctIDSource;

    public boolean hasAcctIDSource()
    {
        return hasAcctIDSource;
    }

    public QuoteCancelEncoder acctIDSource(int value)
    {
        acctIDSource = value;
        hasAcctIDSource = true;
        return this;
    }

    public int acctIDSource()
    {
        return acctIDSource;
    }

    public QuoteCancelEncoder acctIDSource(AcctIDSource value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == AcctIDSource.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: acctIDSource Value: " + value );
            }
            if (value == AcctIDSource.NULL_VAL)
            {
                return this;
            }
        }
        return acctIDSource(value.representation());
    }

    private int accountType;

    private boolean hasAccountType;

    public boolean hasAccountType()
    {
        return hasAccountType;
    }

    public QuoteCancelEncoder accountType(int value)
    {
        accountType = value;
        hasAccountType = true;
        return this;
    }

    public int accountType()
    {
        return accountType;
    }

    public QuoteCancelEncoder accountType(AccountType value)
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

    private final MutableDirectBuffer tradingSessionID = new UnsafeBuffer();

    private int tradingSessionIDOffset = 0;

    private int tradingSessionIDLength = 0;

    public QuoteCancelEncoder tradingSessionID(final DirectBuffer value, final int offset, final int length)
    {
        tradingSessionID.wrap(value);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public QuoteCancelEncoder tradingSessionID(final DirectBuffer value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public QuoteCancelEncoder tradingSessionID(final DirectBuffer value)
    {
        return tradingSessionID(value, 0, value.capacity());
    }

    public QuoteCancelEncoder tradingSessionID(final byte[] value, final int offset, final int length)
    {
        tradingSessionID.wrap(value);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public QuoteCancelEncoder tradingSessionIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradingSessionID, value, offset, length);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public QuoteCancelEncoder tradingSessionID(final byte[] value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public QuoteCancelEncoder tradingSessionID(final byte[] value)
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

    public QuoteCancelEncoder tradingSessionID(final CharSequence value)
    {
        toBytes(value, tradingSessionID);
        tradingSessionIDOffset = 0;
        tradingSessionIDLength = value.length();
        return this;
    }

    public QuoteCancelEncoder tradingSessionID(final AsciiSequenceView value)
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

    public QuoteCancelEncoder tradingSessionID(final char[] value)
    {
        return tradingSessionID(value, 0, value.length);
    }

    public QuoteCancelEncoder tradingSessionID(final char[] value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public QuoteCancelEncoder tradingSessionID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradingSessionID, offset, length);
        tradingSessionIDOffset = 0;
        tradingSessionIDLength = length;
        return this;
    }

    public QuoteCancelEncoder tradingSessionID(TradingSessionID value)
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

    public QuoteCancelEncoder tradingSessionSubID(final DirectBuffer value, final int offset, final int length)
    {
        tradingSessionSubID.wrap(value);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public QuoteCancelEncoder tradingSessionSubID(final DirectBuffer value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public QuoteCancelEncoder tradingSessionSubID(final DirectBuffer value)
    {
        return tradingSessionSubID(value, 0, value.capacity());
    }

    public QuoteCancelEncoder tradingSessionSubID(final byte[] value, final int offset, final int length)
    {
        tradingSessionSubID.wrap(value);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public QuoteCancelEncoder tradingSessionSubIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradingSessionSubID, value, offset, length);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public QuoteCancelEncoder tradingSessionSubID(final byte[] value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public QuoteCancelEncoder tradingSessionSubID(final byte[] value)
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

    public QuoteCancelEncoder tradingSessionSubID(final CharSequence value)
    {
        toBytes(value, tradingSessionSubID);
        tradingSessionSubIDOffset = 0;
        tradingSessionSubIDLength = value.length();
        return this;
    }

    public QuoteCancelEncoder tradingSessionSubID(final AsciiSequenceView value)
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

    public QuoteCancelEncoder tradingSessionSubID(final char[] value)
    {
        return tradingSessionSubID(value, 0, value.length);
    }

    public QuoteCancelEncoder tradingSessionSubID(final char[] value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public QuoteCancelEncoder tradingSessionSubID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradingSessionSubID, offset, length);
        tradingSessionSubIDOffset = 0;
        tradingSessionSubIDLength = length;
        return this;
    }

    public QuoteCancelEncoder tradingSessionSubID(TradingSessionSubID value)
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

    private final QuotCxlEntriesGrpEncoder quotCxlEntriesGrp = new QuotCxlEntriesGrpEncoder();
    public QuotCxlEntriesGrpEncoder quotCxlEntriesGrp()
    {
        return quotCxlEntriesGrp;
    }

    public long encode(final MutableAsciiBuffer buffer, final int offset)
    {
        final long startMessageResult = header.startMessage(buffer, offset);
        final int bodyStart = Encoder.offset(startMessageResult);
        int position = bodyStart + Encoder.length(startMessageResult);

        if (quoteReqIDLength > 0)
        {
            buffer.putBytes(position, quoteReqIDHeader, 0, quoteReqIDHeaderLength);
            position += quoteReqIDHeaderLength;
            buffer.putBytes(position, quoteReqID, quoteReqIDOffset, quoteReqIDLength);
            position += quoteReqIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (quoteIDLength > 0)
        {
            buffer.putBytes(position, quoteIDHeader, 0, quoteIDHeaderLength);
            position += quoteIDHeaderLength;
            buffer.putBytes(position, quoteID, quoteIDOffset, quoteIDLength);
            position += quoteIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (quoteMsgIDLength > 0)
        {
            buffer.putBytes(position, quoteMsgIDHeader, 0, quoteMsgIDHeaderLength);
            position += quoteMsgIDHeaderLength;
            buffer.putBytes(position, quoteMsgID, quoteMsgIDOffset, quoteMsgIDLength);
            position += quoteMsgIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasQuoteCancelType)
        {
            buffer.putBytes(position, quoteCancelTypeHeader, 0, quoteCancelTypeHeaderLength);
            position += quoteCancelTypeHeaderLength;
            position += buffer.putIntAscii(position, quoteCancelType);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: QuoteCancelType");
        }

        if (hasQuoteType)
        {
            buffer.putBytes(position, quoteTypeHeader, 0, quoteTypeHeaderLength);
            position += quoteTypeHeaderLength;
            position += buffer.putIntAscii(position, quoteType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasQuoteResponseLevel)
        {
            buffer.putBytes(position, quoteResponseLevelHeader, 0, quoteResponseLevelHeaderLength);
            position += quoteResponseLevelHeaderLength;
            position += buffer.putIntAscii(position, quoteResponseLevel);
            buffer.putSeparator(position);
            position++;
        }

            position += parties.encode(buffer, position);

            position += targetParties.encode(buffer, position);

        if (accountLength > 0)
        {
            buffer.putBytes(position, accountHeader, 0, accountHeaderLength);
            position += accountHeaderLength;
            buffer.putBytes(position, account, accountOffset, accountLength);
            position += accountLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasAcctIDSource)
        {
            buffer.putBytes(position, acctIDSourceHeader, 0, acctIDSourceHeaderLength);
            position += acctIDSourceHeaderLength;
            position += buffer.putIntAscii(position, acctIDSource);
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

            position += quotCxlEntriesGrp.encode(buffer, position);
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
        this.resetQuoteReqID();
        this.resetQuoteID();
        this.resetQuoteMsgID();
        this.resetQuoteCancelType();
        this.resetQuoteType();
        this.resetQuoteResponseLevel();
        this.resetAccount();
        this.resetAcctIDSource();
        this.resetAccountType();
        this.resetTradingSessionID();
        this.resetTradingSessionSubID();
        parties.reset();
        targetParties.reset();
        quotCxlEntriesGrp.reset();
    }

    public void resetQuoteReqID()
    {
        quoteReqIDLength = 0;
    }

    public void resetQuoteID()
    {
        quoteIDLength = 0;
    }

    public void resetQuoteMsgID()
    {
        quoteMsgIDLength = 0;
    }

    public void resetQuoteCancelType()
    {
        hasQuoteCancelType = false;
    }

    public void resetQuoteType()
    {
        hasQuoteType = false;
    }

    public void resetQuoteResponseLevel()
    {
        hasQuoteResponseLevel = false;
    }

    public void resetAccount()
    {
        accountLength = 0;
    }

    public void resetAcctIDSource()
    {
        hasAcctIDSource = false;
    }

    public void resetAccountType()
    {
        hasAccountType = false;
    }

    public void resetTradingSessionID()
    {
        tradingSessionIDLength = 0;
    }

    public void resetTradingSessionSubID()
    {
        tradingSessionSubIDLength = 0;
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
        builder.append("\"MessageName\": \"QuoteCancel\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasQuoteReqID())
        {
            indent(builder, level);
            builder.append("\"QuoteReqID\": \"");
            appendBuffer(builder, quoteReqID, quoteReqIDOffset, quoteReqIDLength);
            builder.append("\",\n");
        }

        if (hasQuoteID())
        {
            indent(builder, level);
            builder.append("\"QuoteID\": \"");
            appendBuffer(builder, quoteID, quoteIDOffset, quoteIDLength);
            builder.append("\",\n");
        }

        if (hasQuoteMsgID())
        {
            indent(builder, level);
            builder.append("\"QuoteMsgID\": \"");
            appendBuffer(builder, quoteMsgID, quoteMsgIDOffset, quoteMsgIDLength);
            builder.append("\",\n");
        }

        if (hasQuoteCancelType())
        {
            indent(builder, level);
            builder.append("\"QuoteCancelType\": \"");
            builder.append(quoteCancelType);
            builder.append("\",\n");
        }

        if (hasQuoteType())
        {
            indent(builder, level);
            builder.append("\"QuoteType\": \"");
            builder.append(quoteType);
            builder.append("\",\n");
        }

        if (hasQuoteResponseLevel())
        {
            indent(builder, level);
            builder.append("\"QuoteResponseLevel\": \"");
            builder.append(quoteResponseLevel);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"Parties\": ");
    parties.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"TargetParties\": ");
    targetParties.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasAccount())
        {
            indent(builder, level);
            builder.append("\"Account\": \"");
            appendBuffer(builder, account, accountOffset, accountLength);
            builder.append("\",\n");
        }

        if (hasAcctIDSource())
        {
            indent(builder, level);
            builder.append("\"AcctIDSource\": \"");
            builder.append(acctIDSource);
            builder.append("\",\n");
        }

        if (hasAccountType())
        {
            indent(builder, level);
            builder.append("\"AccountType\": \"");
            builder.append(accountType);
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

    indent(builder, level);
    builder.append("\"QuotCxlEntriesGrp\": ");
    quotCxlEntriesGrp.appendTo(builder, level + 1);
    builder.append("\n");
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public QuoteCancelEncoder copyTo(final Encoder encoder)
    {
        return copyTo((QuoteCancelEncoder)encoder);
    }

    public QuoteCancelEncoder copyTo(final QuoteCancelEncoder encoder)
    {
        encoder.reset();
        if (hasQuoteReqID())
        {
            encoder.quoteReqIDAsCopy(quoteReqID.byteArray(), 0, quoteReqIDLength);
        }

        if (hasQuoteID())
        {
            encoder.quoteIDAsCopy(quoteID.byteArray(), 0, quoteIDLength);
        }

        if (hasQuoteMsgID())
        {
            encoder.quoteMsgIDAsCopy(quoteMsgID.byteArray(), 0, quoteMsgIDLength);
        }

        if (hasQuoteCancelType())
        {
            encoder.quoteCancelType(this.quoteCancelType());
        }

        if (hasQuoteType())
        {
            encoder.quoteType(this.quoteType());
        }

        if (hasQuoteResponseLevel())
        {
            encoder.quoteResponseLevel(this.quoteResponseLevel());
        }


        parties.copyTo(encoder.parties());

        targetParties.copyTo(encoder.targetParties());
        if (hasAccount())
        {
            encoder.accountAsCopy(account.byteArray(), 0, accountLength);
        }

        if (hasAcctIDSource())
        {
            encoder.acctIDSource(this.acctIDSource());
        }

        if (hasAccountType())
        {
            encoder.accountType(this.accountType());
        }

        if (hasTradingSessionID())
        {
            encoder.tradingSessionIDAsCopy(tradingSessionID.byteArray(), 0, tradingSessionIDLength);
        }

        if (hasTradingSessionSubID())
        {
            encoder.tradingSessionSubIDAsCopy(tradingSessionSubID.byteArray(), 0, tradingSessionSubIDLength);
        }


        quotCxlEntriesGrp.copyTo(encoder.quotCxlEntriesGrp());        return encoder;
    }

}
