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


public class MassQuoteEncoder implements Encoder
{
    public long messageType()
    {
        return 105L;
    }

    public MassQuoteEncoder()
    {
        header.msgType("i");
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

    private static final int defBidSizeHeaderLength = 4;
    private static final byte[] defBidSizeHeader = new byte[] {50, 57, 51, (byte) '='};

    private static final int defOfferSizeHeaderLength = 4;
    private static final byte[] defOfferSizeHeader = new byte[] {50, 57, 52, (byte) '='};

    private static final int noQuoteSetsGroupCounterHeaderLength = 4;
    private static final byte[] noQuoteSetsGroupCounterHeader = new byte[] {50, 57, 54, (byte) '='};

    private final MutableDirectBuffer quoteReqID = new UnsafeBuffer();

    private int quoteReqIDOffset = 0;

    private int quoteReqIDLength = 0;

    public MassQuoteEncoder quoteReqID(final DirectBuffer value, final int offset, final int length)
    {
        quoteReqID.wrap(value);
        quoteReqIDOffset = offset;
        quoteReqIDLength = length;
        return this;
    }

    public MassQuoteEncoder quoteReqID(final DirectBuffer value, final int length)
    {
        return quoteReqID(value, 0, length);
    }

    public MassQuoteEncoder quoteReqID(final DirectBuffer value)
    {
        return quoteReqID(value, 0, value.capacity());
    }

    public MassQuoteEncoder quoteReqID(final byte[] value, final int offset, final int length)
    {
        quoteReqID.wrap(value);
        quoteReqIDOffset = offset;
        quoteReqIDLength = length;
        return this;
    }

    public MassQuoteEncoder quoteReqIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(quoteReqID, value, offset, length);
        quoteReqIDOffset = offset;
        quoteReqIDLength = length;
        return this;
    }

    public MassQuoteEncoder quoteReqID(final byte[] value, final int length)
    {
        return quoteReqID(value, 0, length);
    }

    public MassQuoteEncoder quoteReqID(final byte[] value)
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

    public MassQuoteEncoder quoteReqID(final CharSequence value)
    {
        toBytes(value, quoteReqID);
        quoteReqIDOffset = 0;
        quoteReqIDLength = value.length();
        return this;
    }

    public MassQuoteEncoder quoteReqID(final AsciiSequenceView value)
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

    public MassQuoteEncoder quoteReqID(final char[] value)
    {
        return quoteReqID(value, 0, value.length);
    }

    public MassQuoteEncoder quoteReqID(final char[] value, final int length)
    {
        return quoteReqID(value, 0, length);
    }

    public MassQuoteEncoder quoteReqID(final char[] value, final int offset, final int length)
    {
        toBytes(value, quoteReqID, offset, length);
        quoteReqIDOffset = 0;
        quoteReqIDLength = length;
        return this;
    }

    private final MutableDirectBuffer quoteID = new UnsafeBuffer();

    private int quoteIDOffset = 0;

    private int quoteIDLength = 0;

    public MassQuoteEncoder quoteID(final DirectBuffer value, final int offset, final int length)
    {
        quoteID.wrap(value);
        quoteIDOffset = offset;
        quoteIDLength = length;
        return this;
    }

    public MassQuoteEncoder quoteID(final DirectBuffer value, final int length)
    {
        return quoteID(value, 0, length);
    }

    public MassQuoteEncoder quoteID(final DirectBuffer value)
    {
        return quoteID(value, 0, value.capacity());
    }

    public MassQuoteEncoder quoteID(final byte[] value, final int offset, final int length)
    {
        quoteID.wrap(value);
        quoteIDOffset = offset;
        quoteIDLength = length;
        return this;
    }

    public MassQuoteEncoder quoteIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(quoteID, value, offset, length);
        quoteIDOffset = offset;
        quoteIDLength = length;
        return this;
    }

    public MassQuoteEncoder quoteID(final byte[] value, final int length)
    {
        return quoteID(value, 0, length);
    }

    public MassQuoteEncoder quoteID(final byte[] value)
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

    public MassQuoteEncoder quoteID(final CharSequence value)
    {
        toBytes(value, quoteID);
        quoteIDOffset = 0;
        quoteIDLength = value.length();
        return this;
    }

    public MassQuoteEncoder quoteID(final AsciiSequenceView value)
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

    public MassQuoteEncoder quoteID(final char[] value)
    {
        return quoteID(value, 0, value.length);
    }

    public MassQuoteEncoder quoteID(final char[] value, final int length)
    {
        return quoteID(value, 0, length);
    }

    public MassQuoteEncoder quoteID(final char[] value, final int offset, final int length)
    {
        toBytes(value, quoteID, offset, length);
        quoteIDOffset = 0;
        quoteIDLength = length;
        return this;
    }

    private int quoteType;

    private boolean hasQuoteType;

    public boolean hasQuoteType()
    {
        return hasQuoteType;
    }

    public MassQuoteEncoder quoteType(int value)
    {
        quoteType = value;
        hasQuoteType = true;
        return this;
    }

    public int quoteType()
    {
        return quoteType;
    }

    public MassQuoteEncoder quoteType(QuoteType value)
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

    public MassQuoteEncoder quoteResponseLevel(int value)
    {
        quoteResponseLevel = value;
        hasQuoteResponseLevel = true;
        return this;
    }

    public int quoteResponseLevel()
    {
        return quoteResponseLevel;
    }

    public MassQuoteEncoder quoteResponseLevel(QuoteResponseLevel value)
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

    private final MutableDirectBuffer account = new UnsafeBuffer();

    private int accountOffset = 0;

    private int accountLength = 0;

    public MassQuoteEncoder account(final DirectBuffer value, final int offset, final int length)
    {
        account.wrap(value);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    public MassQuoteEncoder account(final DirectBuffer value, final int length)
    {
        return account(value, 0, length);
    }

    public MassQuoteEncoder account(final DirectBuffer value)
    {
        return account(value, 0, value.capacity());
    }

    public MassQuoteEncoder account(final byte[] value, final int offset, final int length)
    {
        account.wrap(value);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    public MassQuoteEncoder accountAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(account, value, offset, length);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    public MassQuoteEncoder account(final byte[] value, final int length)
    {
        return account(value, 0, length);
    }

    public MassQuoteEncoder account(final byte[] value)
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

    public MassQuoteEncoder account(final CharSequence value)
    {
        toBytes(value, account);
        accountOffset = 0;
        accountLength = value.length();
        return this;
    }

    public MassQuoteEncoder account(final AsciiSequenceView value)
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

    public MassQuoteEncoder account(final char[] value)
    {
        return account(value, 0, value.length);
    }

    public MassQuoteEncoder account(final char[] value, final int length)
    {
        return account(value, 0, length);
    }

    public MassQuoteEncoder account(final char[] value, final int offset, final int length)
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

    public MassQuoteEncoder acctIDSource(int value)
    {
        acctIDSource = value;
        hasAcctIDSource = true;
        return this;
    }

    public int acctIDSource()
    {
        return acctIDSource;
    }

    public MassQuoteEncoder acctIDSource(AcctIDSource value)
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

    public MassQuoteEncoder accountType(int value)
    {
        accountType = value;
        hasAccountType = true;
        return this;
    }

    public int accountType()
    {
        return accountType;
    }

    public MassQuoteEncoder accountType(AccountType value)
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

    private final DecimalFloat defBidSize = new DecimalFloat();

    private boolean hasDefBidSize;

    public boolean hasDefBidSize()
    {
        return hasDefBidSize;
    }

    public MassQuoteEncoder defBidSize(DecimalFloat value)
    {
        defBidSize.set(value);
        hasDefBidSize = true;
        return this;
    }

    public MassQuoteEncoder defBidSize(long value, int scale)
    {
        defBidSize.set(value, scale);
        hasDefBidSize = true;
        return this;
    }

    public DecimalFloat defBidSize()
    {
        return defBidSize;
    }

    private final DecimalFloat defOfferSize = new DecimalFloat();

    private boolean hasDefOfferSize;

    public boolean hasDefOfferSize()
    {
        return hasDefOfferSize;
    }

    public MassQuoteEncoder defOfferSize(DecimalFloat value)
    {
        defOfferSize.set(value);
        hasDefOfferSize = true;
        return this;
    }

    public MassQuoteEncoder defOfferSize(long value, int scale)
    {
        defOfferSize.set(value, scale);
        hasDefOfferSize = true;
        return this;
    }

    public DecimalFloat defOfferSize()
    {
        return defOfferSize;
    }



public static class QuoteSetsGroupEncoder
{
    private QuoteSetsGroupEncoder next = null;

    public QuoteSetsGroupEncoder next()
    {
        if (next == null)
        {
            next = new QuoteSetsGroupEncoder();
        }
        return next;
    }

    private static final int quoteSetIDHeaderLength = 4;
    private static final byte[] quoteSetIDHeader = new byte[] {51, 48, 50, (byte) '='};

    private static final int quoteSetValidUntilTimeHeaderLength = 4;
    private static final byte[] quoteSetValidUntilTimeHeader = new byte[] {51, 54, 55, (byte) '='};

    private static final int totNoQuoteEntriesHeaderLength = 4;
    private static final byte[] totNoQuoteEntriesHeader = new byte[] {51, 48, 52, (byte) '='};

    private static final int lastFragmentHeaderLength = 4;
    private static final byte[] lastFragmentHeader = new byte[] {56, 57, 51, (byte) '='};

    private static final int noQuoteEntriesGroupCounterHeaderLength = 4;
    private static final byte[] noQuoteEntriesGroupCounterHeader = new byte[] {50, 57, 53, (byte) '='};

    private final MutableDirectBuffer quoteSetID = new UnsafeBuffer();

    private int quoteSetIDOffset = 0;

    private int quoteSetIDLength = 0;

    public QuoteSetsGroupEncoder quoteSetID(final DirectBuffer value, final int offset, final int length)
    {
        quoteSetID.wrap(value);
        quoteSetIDOffset = offset;
        quoteSetIDLength = length;
        return this;
    }

    public QuoteSetsGroupEncoder quoteSetID(final DirectBuffer value, final int length)
    {
        return quoteSetID(value, 0, length);
    }

    public QuoteSetsGroupEncoder quoteSetID(final DirectBuffer value)
    {
        return quoteSetID(value, 0, value.capacity());
    }

    public QuoteSetsGroupEncoder quoteSetID(final byte[] value, final int offset, final int length)
    {
        quoteSetID.wrap(value);
        quoteSetIDOffset = offset;
        quoteSetIDLength = length;
        return this;
    }

    public QuoteSetsGroupEncoder quoteSetIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(quoteSetID, value, offset, length);
        quoteSetIDOffset = offset;
        quoteSetIDLength = length;
        return this;
    }

    public QuoteSetsGroupEncoder quoteSetID(final byte[] value, final int length)
    {
        return quoteSetID(value, 0, length);
    }

    public QuoteSetsGroupEncoder quoteSetID(final byte[] value)
    {
        return quoteSetID(value, 0, value.length);
    }

    public boolean hasQuoteSetID()
    {
        return quoteSetIDLength > 0;
    }

    public MutableDirectBuffer quoteSetID()
    {
        return quoteSetID;
    }

    public String quoteSetIDAsString()
    {
        return quoteSetID.getStringWithoutLengthAscii(quoteSetIDOffset, quoteSetIDLength);
    }

    public QuoteSetsGroupEncoder quoteSetID(final CharSequence value)
    {
        toBytes(value, quoteSetID);
        quoteSetIDOffset = 0;
        quoteSetIDLength = value.length();
        return this;
    }

    public QuoteSetsGroupEncoder quoteSetID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            quoteSetID.wrap(buffer);
            quoteSetIDOffset = value.offset();
            quoteSetIDLength = value.length();
        }
        return this;
    }

    public QuoteSetsGroupEncoder quoteSetID(final char[] value)
    {
        return quoteSetID(value, 0, value.length);
    }

    public QuoteSetsGroupEncoder quoteSetID(final char[] value, final int length)
    {
        return quoteSetID(value, 0, length);
    }

    public QuoteSetsGroupEncoder quoteSetID(final char[] value, final int offset, final int length)
    {
        toBytes(value, quoteSetID, offset, length);
        quoteSetIDOffset = 0;
        quoteSetIDLength = length;
        return this;
    }

    private final UnderlyingInstrumentEncoder underlyingInstrument = new UnderlyingInstrumentEncoder();
    public UnderlyingInstrumentEncoder underlyingInstrument()
    {
        return underlyingInstrument;
    }

    private final MutableDirectBuffer quoteSetValidUntilTime = new UnsafeBuffer();

    private int quoteSetValidUntilTimeOffset = 0;

    private int quoteSetValidUntilTimeLength = 0;

    public QuoteSetsGroupEncoder quoteSetValidUntilTime(final DirectBuffer value, final int offset, final int length)
    {
        quoteSetValidUntilTime.wrap(value);
        quoteSetValidUntilTimeOffset = offset;
        quoteSetValidUntilTimeLength = length;
        return this;
    }

    public QuoteSetsGroupEncoder quoteSetValidUntilTime(final DirectBuffer value, final int length)
    {
        return quoteSetValidUntilTime(value, 0, length);
    }

    public QuoteSetsGroupEncoder quoteSetValidUntilTime(final DirectBuffer value)
    {
        return quoteSetValidUntilTime(value, 0, value.capacity());
    }

    public QuoteSetsGroupEncoder quoteSetValidUntilTime(final byte[] value, final int offset, final int length)
    {
        quoteSetValidUntilTime.wrap(value);
        quoteSetValidUntilTimeOffset = offset;
        quoteSetValidUntilTimeLength = length;
        return this;
    }

    public QuoteSetsGroupEncoder quoteSetValidUntilTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(quoteSetValidUntilTime, value, offset, length);
        quoteSetValidUntilTimeOffset = offset;
        quoteSetValidUntilTimeLength = length;
        return this;
    }

    public QuoteSetsGroupEncoder quoteSetValidUntilTime(final byte[] value, final int length)
    {
        return quoteSetValidUntilTime(value, 0, length);
    }

    public QuoteSetsGroupEncoder quoteSetValidUntilTime(final byte[] value)
    {
        return quoteSetValidUntilTime(value, 0, value.length);
    }

    public boolean hasQuoteSetValidUntilTime()
    {
        return quoteSetValidUntilTimeLength > 0;
    }

    public MutableDirectBuffer quoteSetValidUntilTime()
    {
        return quoteSetValidUntilTime;
    }

    public String quoteSetValidUntilTimeAsString()
    {
        return quoteSetValidUntilTime.getStringWithoutLengthAscii(quoteSetValidUntilTimeOffset, quoteSetValidUntilTimeLength);
    }

    private int totNoQuoteEntries;

    private boolean hasTotNoQuoteEntries;

    public boolean hasTotNoQuoteEntries()
    {
        return hasTotNoQuoteEntries;
    }

    public QuoteSetsGroupEncoder totNoQuoteEntries(int value)
    {
        totNoQuoteEntries = value;
        hasTotNoQuoteEntries = true;
        return this;
    }

    public int totNoQuoteEntries()
    {
        return totNoQuoteEntries;
    }

    private boolean lastFragment;

    private boolean hasLastFragment;

    public boolean hasLastFragment()
    {
        return hasLastFragment;
    }

    public QuoteSetsGroupEncoder lastFragment(boolean value)
    {
        lastFragment = value;
        hasLastFragment = true;
        return this;
    }

    public boolean lastFragment()
    {
        return lastFragment;
    }



public static class QuoteEntriesGroupEncoder
{
    private QuoteEntriesGroupEncoder next = null;

    public QuoteEntriesGroupEncoder next()
    {
        if (next == null)
        {
            next = new QuoteEntriesGroupEncoder();
        }
        return next;
    }

    private static final int quoteEntryIDHeaderLength = 4;
    private static final byte[] quoteEntryIDHeader = new byte[] {50, 57, 57, (byte) '='};

    private static final int noLegsGroupCounterHeaderLength = 4;
    private static final byte[] noLegsGroupCounterHeader = new byte[] {53, 53, 53, (byte) '='};

    private static final int bidPxHeaderLength = 4;
    private static final byte[] bidPxHeader = new byte[] {49, 51, 50, (byte) '='};

    private static final int offerPxHeaderLength = 4;
    private static final byte[] offerPxHeader = new byte[] {49, 51, 51, (byte) '='};

    private static final int bidSizeHeaderLength = 4;
    private static final byte[] bidSizeHeader = new byte[] {49, 51, 52, (byte) '='};

    private static final int offerSizeHeaderLength = 4;
    private static final byte[] offerSizeHeader = new byte[] {49, 51, 53, (byte) '='};

    private static final int validUntilTimeHeaderLength = 3;
    private static final byte[] validUntilTimeHeader = new byte[] {54, 50, (byte) '='};

    private static final int bidSpotRateHeaderLength = 4;
    private static final byte[] bidSpotRateHeader = new byte[] {49, 56, 56, (byte) '='};

    private static final int offerSpotRateHeaderLength = 4;
    private static final byte[] offerSpotRateHeader = new byte[] {49, 57, 48, (byte) '='};

    private static final int bidForwardPointsHeaderLength = 4;
    private static final byte[] bidForwardPointsHeader = new byte[] {49, 56, 57, (byte) '='};

    private static final int offerForwardPointsHeaderLength = 4;
    private static final byte[] offerForwardPointsHeader = new byte[] {49, 57, 49, (byte) '='};

    private static final int midPxHeaderLength = 4;
    private static final byte[] midPxHeader = new byte[] {54, 51, 49, (byte) '='};

    private static final int bidYieldHeaderLength = 4;
    private static final byte[] bidYieldHeader = new byte[] {54, 51, 50, (byte) '='};

    private static final int midYieldHeaderLength = 4;
    private static final byte[] midYieldHeader = new byte[] {54, 51, 51, (byte) '='};

    private static final int offerYieldHeaderLength = 4;
    private static final byte[] offerYieldHeader = new byte[] {54, 51, 52, (byte) '='};

    private static final int transactTimeHeaderLength = 3;
    private static final byte[] transactTimeHeader = new byte[] {54, 48, (byte) '='};

    private static final int tradingSessionIDHeaderLength = 4;
    private static final byte[] tradingSessionIDHeader = new byte[] {51, 51, 54, (byte) '='};

    private static final int tradingSessionSubIDHeaderLength = 4;
    private static final byte[] tradingSessionSubIDHeader = new byte[] {54, 50, 53, (byte) '='};

    private static final int settlDateHeaderLength = 3;
    private static final byte[] settlDateHeader = new byte[] {54, 52, (byte) '='};

    private static final int ordTypeHeaderLength = 3;
    private static final byte[] ordTypeHeader = new byte[] {52, 48, (byte) '='};

    private static final int settlDate2HeaderLength = 4;
    private static final byte[] settlDate2Header = new byte[] {49, 57, 51, (byte) '='};

    private static final int orderQty2HeaderLength = 4;
    private static final byte[] orderQty2Header = new byte[] {49, 57, 50, (byte) '='};

    private static final int bidForwardPoints2HeaderLength = 4;
    private static final byte[] bidForwardPoints2Header = new byte[] {54, 52, 50, (byte) '='};

    private static final int offerForwardPoints2HeaderLength = 4;
    private static final byte[] offerForwardPoints2Header = new byte[] {54, 52, 51, (byte) '='};

    private static final int currencyHeaderLength = 3;
    private static final byte[] currencyHeader = new byte[] {49, 53, (byte) '='};

    private final MutableDirectBuffer quoteEntryID = new UnsafeBuffer();

    private int quoteEntryIDOffset = 0;

    private int quoteEntryIDLength = 0;

    public QuoteEntriesGroupEncoder quoteEntryID(final DirectBuffer value, final int offset, final int length)
    {
        quoteEntryID.wrap(value);
        quoteEntryIDOffset = offset;
        quoteEntryIDLength = length;
        return this;
    }

    public QuoteEntriesGroupEncoder quoteEntryID(final DirectBuffer value, final int length)
    {
        return quoteEntryID(value, 0, length);
    }

    public QuoteEntriesGroupEncoder quoteEntryID(final DirectBuffer value)
    {
        return quoteEntryID(value, 0, value.capacity());
    }

    public QuoteEntriesGroupEncoder quoteEntryID(final byte[] value, final int offset, final int length)
    {
        quoteEntryID.wrap(value);
        quoteEntryIDOffset = offset;
        quoteEntryIDLength = length;
        return this;
    }

    public QuoteEntriesGroupEncoder quoteEntryIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(quoteEntryID, value, offset, length);
        quoteEntryIDOffset = offset;
        quoteEntryIDLength = length;
        return this;
    }

    public QuoteEntriesGroupEncoder quoteEntryID(final byte[] value, final int length)
    {
        return quoteEntryID(value, 0, length);
    }

    public QuoteEntriesGroupEncoder quoteEntryID(final byte[] value)
    {
        return quoteEntryID(value, 0, value.length);
    }

    public boolean hasQuoteEntryID()
    {
        return quoteEntryIDLength > 0;
    }

    public MutableDirectBuffer quoteEntryID()
    {
        return quoteEntryID;
    }

    public String quoteEntryIDAsString()
    {
        return quoteEntryID.getStringWithoutLengthAscii(quoteEntryIDOffset, quoteEntryIDLength);
    }

    public QuoteEntriesGroupEncoder quoteEntryID(final CharSequence value)
    {
        toBytes(value, quoteEntryID);
        quoteEntryIDOffset = 0;
        quoteEntryIDLength = value.length();
        return this;
    }

    public QuoteEntriesGroupEncoder quoteEntryID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            quoteEntryID.wrap(buffer);
            quoteEntryIDOffset = value.offset();
            quoteEntryIDLength = value.length();
        }
        return this;
    }

    public QuoteEntriesGroupEncoder quoteEntryID(final char[] value)
    {
        return quoteEntryID(value, 0, value.length);
    }

    public QuoteEntriesGroupEncoder quoteEntryID(final char[] value, final int length)
    {
        return quoteEntryID(value, 0, length);
    }

    public QuoteEntriesGroupEncoder quoteEntryID(final char[] value, final int offset, final int length)
    {
        toBytes(value, quoteEntryID, offset, length);
        quoteEntryIDOffset = 0;
        quoteEntryIDLength = length;
        return this;
    }

    private final InstrumentEncoder instrument = new InstrumentEncoder();
    public InstrumentEncoder instrument()
    {
        return instrument;
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

    public QuoteEntriesGroupEncoder noLegsGroupCounter(int value)
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

    private final DecimalFloat bidPx = new DecimalFloat();

    private boolean hasBidPx;

    public boolean hasBidPx()
    {
        return hasBidPx;
    }

    public QuoteEntriesGroupEncoder bidPx(DecimalFloat value)
    {
        bidPx.set(value);
        hasBidPx = true;
        return this;
    }

    public QuoteEntriesGroupEncoder bidPx(long value, int scale)
    {
        bidPx.set(value, scale);
        hasBidPx = true;
        return this;
    }

    public DecimalFloat bidPx()
    {
        return bidPx;
    }

    private final DecimalFloat offerPx = new DecimalFloat();

    private boolean hasOfferPx;

    public boolean hasOfferPx()
    {
        return hasOfferPx;
    }

    public QuoteEntriesGroupEncoder offerPx(DecimalFloat value)
    {
        offerPx.set(value);
        hasOfferPx = true;
        return this;
    }

    public QuoteEntriesGroupEncoder offerPx(long value, int scale)
    {
        offerPx.set(value, scale);
        hasOfferPx = true;
        return this;
    }

    public DecimalFloat offerPx()
    {
        return offerPx;
    }

    private final DecimalFloat bidSize = new DecimalFloat();

    private boolean hasBidSize;

    public boolean hasBidSize()
    {
        return hasBidSize;
    }

    public QuoteEntriesGroupEncoder bidSize(DecimalFloat value)
    {
        bidSize.set(value);
        hasBidSize = true;
        return this;
    }

    public QuoteEntriesGroupEncoder bidSize(long value, int scale)
    {
        bidSize.set(value, scale);
        hasBidSize = true;
        return this;
    }

    public DecimalFloat bidSize()
    {
        return bidSize;
    }

    private final DecimalFloat offerSize = new DecimalFloat();

    private boolean hasOfferSize;

    public boolean hasOfferSize()
    {
        return hasOfferSize;
    }

    public QuoteEntriesGroupEncoder offerSize(DecimalFloat value)
    {
        offerSize.set(value);
        hasOfferSize = true;
        return this;
    }

    public QuoteEntriesGroupEncoder offerSize(long value, int scale)
    {
        offerSize.set(value, scale);
        hasOfferSize = true;
        return this;
    }

    public DecimalFloat offerSize()
    {
        return offerSize;
    }

    private final MutableDirectBuffer validUntilTime = new UnsafeBuffer();

    private int validUntilTimeOffset = 0;

    private int validUntilTimeLength = 0;

    public QuoteEntriesGroupEncoder validUntilTime(final DirectBuffer value, final int offset, final int length)
    {
        validUntilTime.wrap(value);
        validUntilTimeOffset = offset;
        validUntilTimeLength = length;
        return this;
    }

    public QuoteEntriesGroupEncoder validUntilTime(final DirectBuffer value, final int length)
    {
        return validUntilTime(value, 0, length);
    }

    public QuoteEntriesGroupEncoder validUntilTime(final DirectBuffer value)
    {
        return validUntilTime(value, 0, value.capacity());
    }

    public QuoteEntriesGroupEncoder validUntilTime(final byte[] value, final int offset, final int length)
    {
        validUntilTime.wrap(value);
        validUntilTimeOffset = offset;
        validUntilTimeLength = length;
        return this;
    }

    public QuoteEntriesGroupEncoder validUntilTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(validUntilTime, value, offset, length);
        validUntilTimeOffset = offset;
        validUntilTimeLength = length;
        return this;
    }

    public QuoteEntriesGroupEncoder validUntilTime(final byte[] value, final int length)
    {
        return validUntilTime(value, 0, length);
    }

    public QuoteEntriesGroupEncoder validUntilTime(final byte[] value)
    {
        return validUntilTime(value, 0, value.length);
    }

    public boolean hasValidUntilTime()
    {
        return validUntilTimeLength > 0;
    }

    public MutableDirectBuffer validUntilTime()
    {
        return validUntilTime;
    }

    public String validUntilTimeAsString()
    {
        return validUntilTime.getStringWithoutLengthAscii(validUntilTimeOffset, validUntilTimeLength);
    }

    private final DecimalFloat bidSpotRate = new DecimalFloat();

    private boolean hasBidSpotRate;

    public boolean hasBidSpotRate()
    {
        return hasBidSpotRate;
    }

    public QuoteEntriesGroupEncoder bidSpotRate(DecimalFloat value)
    {
        bidSpotRate.set(value);
        hasBidSpotRate = true;
        return this;
    }

    public QuoteEntriesGroupEncoder bidSpotRate(long value, int scale)
    {
        bidSpotRate.set(value, scale);
        hasBidSpotRate = true;
        return this;
    }

    public DecimalFloat bidSpotRate()
    {
        return bidSpotRate;
    }

    private final DecimalFloat offerSpotRate = new DecimalFloat();

    private boolean hasOfferSpotRate;

    public boolean hasOfferSpotRate()
    {
        return hasOfferSpotRate;
    }

    public QuoteEntriesGroupEncoder offerSpotRate(DecimalFloat value)
    {
        offerSpotRate.set(value);
        hasOfferSpotRate = true;
        return this;
    }

    public QuoteEntriesGroupEncoder offerSpotRate(long value, int scale)
    {
        offerSpotRate.set(value, scale);
        hasOfferSpotRate = true;
        return this;
    }

    public DecimalFloat offerSpotRate()
    {
        return offerSpotRate;
    }

    private final DecimalFloat bidForwardPoints = new DecimalFloat();

    private boolean hasBidForwardPoints;

    public boolean hasBidForwardPoints()
    {
        return hasBidForwardPoints;
    }

    public QuoteEntriesGroupEncoder bidForwardPoints(DecimalFloat value)
    {
        bidForwardPoints.set(value);
        hasBidForwardPoints = true;
        return this;
    }

    public QuoteEntriesGroupEncoder bidForwardPoints(long value, int scale)
    {
        bidForwardPoints.set(value, scale);
        hasBidForwardPoints = true;
        return this;
    }

    public DecimalFloat bidForwardPoints()
    {
        return bidForwardPoints;
    }

    private final DecimalFloat offerForwardPoints = new DecimalFloat();

    private boolean hasOfferForwardPoints;

    public boolean hasOfferForwardPoints()
    {
        return hasOfferForwardPoints;
    }

    public QuoteEntriesGroupEncoder offerForwardPoints(DecimalFloat value)
    {
        offerForwardPoints.set(value);
        hasOfferForwardPoints = true;
        return this;
    }

    public QuoteEntriesGroupEncoder offerForwardPoints(long value, int scale)
    {
        offerForwardPoints.set(value, scale);
        hasOfferForwardPoints = true;
        return this;
    }

    public DecimalFloat offerForwardPoints()
    {
        return offerForwardPoints;
    }

    private final DecimalFloat midPx = new DecimalFloat();

    private boolean hasMidPx;

    public boolean hasMidPx()
    {
        return hasMidPx;
    }

    public QuoteEntriesGroupEncoder midPx(DecimalFloat value)
    {
        midPx.set(value);
        hasMidPx = true;
        return this;
    }

    public QuoteEntriesGroupEncoder midPx(long value, int scale)
    {
        midPx.set(value, scale);
        hasMidPx = true;
        return this;
    }

    public DecimalFloat midPx()
    {
        return midPx;
    }

    private final DecimalFloat bidYield = new DecimalFloat();

    private boolean hasBidYield;

    public boolean hasBidYield()
    {
        return hasBidYield;
    }

    public QuoteEntriesGroupEncoder bidYield(DecimalFloat value)
    {
        bidYield.set(value);
        hasBidYield = true;
        return this;
    }

    public QuoteEntriesGroupEncoder bidYield(long value, int scale)
    {
        bidYield.set(value, scale);
        hasBidYield = true;
        return this;
    }

    public DecimalFloat bidYield()
    {
        return bidYield;
    }

    private final DecimalFloat midYield = new DecimalFloat();

    private boolean hasMidYield;

    public boolean hasMidYield()
    {
        return hasMidYield;
    }

    public QuoteEntriesGroupEncoder midYield(DecimalFloat value)
    {
        midYield.set(value);
        hasMidYield = true;
        return this;
    }

    public QuoteEntriesGroupEncoder midYield(long value, int scale)
    {
        midYield.set(value, scale);
        hasMidYield = true;
        return this;
    }

    public DecimalFloat midYield()
    {
        return midYield;
    }

    private final DecimalFloat offerYield = new DecimalFloat();

    private boolean hasOfferYield;

    public boolean hasOfferYield()
    {
        return hasOfferYield;
    }

    public QuoteEntriesGroupEncoder offerYield(DecimalFloat value)
    {
        offerYield.set(value);
        hasOfferYield = true;
        return this;
    }

    public QuoteEntriesGroupEncoder offerYield(long value, int scale)
    {
        offerYield.set(value, scale);
        hasOfferYield = true;
        return this;
    }

    public DecimalFloat offerYield()
    {
        return offerYield;
    }

    private final MutableDirectBuffer transactTime = new UnsafeBuffer();

    private int transactTimeOffset = 0;

    private int transactTimeLength = 0;

    public QuoteEntriesGroupEncoder transactTime(final DirectBuffer value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public QuoteEntriesGroupEncoder transactTime(final DirectBuffer value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public QuoteEntriesGroupEncoder transactTime(final DirectBuffer value)
    {
        return transactTime(value, 0, value.capacity());
    }

    public QuoteEntriesGroupEncoder transactTime(final byte[] value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public QuoteEntriesGroupEncoder transactTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(transactTime, value, offset, length);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public QuoteEntriesGroupEncoder transactTime(final byte[] value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public QuoteEntriesGroupEncoder transactTime(final byte[] value)
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

    private final MutableDirectBuffer tradingSessionID = new UnsafeBuffer();

    private int tradingSessionIDOffset = 0;

    private int tradingSessionIDLength = 0;

    public QuoteEntriesGroupEncoder tradingSessionID(final DirectBuffer value, final int offset, final int length)
    {
        tradingSessionID.wrap(value);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public QuoteEntriesGroupEncoder tradingSessionID(final DirectBuffer value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public QuoteEntriesGroupEncoder tradingSessionID(final DirectBuffer value)
    {
        return tradingSessionID(value, 0, value.capacity());
    }

    public QuoteEntriesGroupEncoder tradingSessionID(final byte[] value, final int offset, final int length)
    {
        tradingSessionID.wrap(value);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public QuoteEntriesGroupEncoder tradingSessionIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradingSessionID, value, offset, length);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public QuoteEntriesGroupEncoder tradingSessionID(final byte[] value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public QuoteEntriesGroupEncoder tradingSessionID(final byte[] value)
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

    public QuoteEntriesGroupEncoder tradingSessionID(final CharSequence value)
    {
        toBytes(value, tradingSessionID);
        tradingSessionIDOffset = 0;
        tradingSessionIDLength = value.length();
        return this;
    }

    public QuoteEntriesGroupEncoder tradingSessionID(final AsciiSequenceView value)
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

    public QuoteEntriesGroupEncoder tradingSessionID(final char[] value)
    {
        return tradingSessionID(value, 0, value.length);
    }

    public QuoteEntriesGroupEncoder tradingSessionID(final char[] value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public QuoteEntriesGroupEncoder tradingSessionID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradingSessionID, offset, length);
        tradingSessionIDOffset = 0;
        tradingSessionIDLength = length;
        return this;
    }

    private final MutableDirectBuffer tradingSessionSubID = new UnsafeBuffer();

    private int tradingSessionSubIDOffset = 0;

    private int tradingSessionSubIDLength = 0;

    public QuoteEntriesGroupEncoder tradingSessionSubID(final DirectBuffer value, final int offset, final int length)
    {
        tradingSessionSubID.wrap(value);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public QuoteEntriesGroupEncoder tradingSessionSubID(final DirectBuffer value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public QuoteEntriesGroupEncoder tradingSessionSubID(final DirectBuffer value)
    {
        return tradingSessionSubID(value, 0, value.capacity());
    }

    public QuoteEntriesGroupEncoder tradingSessionSubID(final byte[] value, final int offset, final int length)
    {
        tradingSessionSubID.wrap(value);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public QuoteEntriesGroupEncoder tradingSessionSubIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradingSessionSubID, value, offset, length);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public QuoteEntriesGroupEncoder tradingSessionSubID(final byte[] value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public QuoteEntriesGroupEncoder tradingSessionSubID(final byte[] value)
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

    public QuoteEntriesGroupEncoder tradingSessionSubID(final CharSequence value)
    {
        toBytes(value, tradingSessionSubID);
        tradingSessionSubIDOffset = 0;
        tradingSessionSubIDLength = value.length();
        return this;
    }

    public QuoteEntriesGroupEncoder tradingSessionSubID(final AsciiSequenceView value)
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

    public QuoteEntriesGroupEncoder tradingSessionSubID(final char[] value)
    {
        return tradingSessionSubID(value, 0, value.length);
    }

    public QuoteEntriesGroupEncoder tradingSessionSubID(final char[] value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public QuoteEntriesGroupEncoder tradingSessionSubID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradingSessionSubID, offset, length);
        tradingSessionSubIDOffset = 0;
        tradingSessionSubIDLength = length;
        return this;
    }

    private final MutableDirectBuffer settlDate = new UnsafeBuffer();

    private int settlDateOffset = 0;

    private int settlDateLength = 0;

    public QuoteEntriesGroupEncoder settlDate(final DirectBuffer value, final int offset, final int length)
    {
        settlDate.wrap(value);
        settlDateOffset = offset;
        settlDateLength = length;
        return this;
    }

    public QuoteEntriesGroupEncoder settlDate(final DirectBuffer value, final int length)
    {
        return settlDate(value, 0, length);
    }

    public QuoteEntriesGroupEncoder settlDate(final DirectBuffer value)
    {
        return settlDate(value, 0, value.capacity());
    }

    public QuoteEntriesGroupEncoder settlDate(final byte[] value, final int offset, final int length)
    {
        settlDate.wrap(value);
        settlDateOffset = offset;
        settlDateLength = length;
        return this;
    }

    public QuoteEntriesGroupEncoder settlDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlDate, value, offset, length);
        settlDateOffset = offset;
        settlDateLength = length;
        return this;
    }

    public QuoteEntriesGroupEncoder settlDate(final byte[] value, final int length)
    {
        return settlDate(value, 0, length);
    }

    public QuoteEntriesGroupEncoder settlDate(final byte[] value)
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

    private char ordType;

    private boolean hasOrdType;

    public boolean hasOrdType()
    {
        return hasOrdType;
    }

    public QuoteEntriesGroupEncoder ordType(char value)
    {
        ordType = value;
        hasOrdType = true;
        return this;
    }

    public char ordType()
    {
        return ordType;
    }

    public QuoteEntriesGroupEncoder ordType(OrdType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == OrdType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: ordType Value: " + value );
            }
            if (value == OrdType.NULL_VAL)
            {
                return this;
            }
        }
        return ordType(value.representation());
    }

    private final MutableDirectBuffer settlDate2 = new UnsafeBuffer();

    private int settlDate2Offset = 0;

    private int settlDate2Length = 0;

    public QuoteEntriesGroupEncoder settlDate2(final DirectBuffer value, final int offset, final int length)
    {
        settlDate2.wrap(value);
        settlDate2Offset = offset;
        settlDate2Length = length;
        return this;
    }

    public QuoteEntriesGroupEncoder settlDate2(final DirectBuffer value, final int length)
    {
        return settlDate2(value, 0, length);
    }

    public QuoteEntriesGroupEncoder settlDate2(final DirectBuffer value)
    {
        return settlDate2(value, 0, value.capacity());
    }

    public QuoteEntriesGroupEncoder settlDate2(final byte[] value, final int offset, final int length)
    {
        settlDate2.wrap(value);
        settlDate2Offset = offset;
        settlDate2Length = length;
        return this;
    }

    public QuoteEntriesGroupEncoder settlDate2AsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlDate2, value, offset, length);
        settlDate2Offset = offset;
        settlDate2Length = length;
        return this;
    }

    public QuoteEntriesGroupEncoder settlDate2(final byte[] value, final int length)
    {
        return settlDate2(value, 0, length);
    }

    public QuoteEntriesGroupEncoder settlDate2(final byte[] value)
    {
        return settlDate2(value, 0, value.length);
    }

    public boolean hasSettlDate2()
    {
        return settlDate2Length > 0;
    }

    public MutableDirectBuffer settlDate2()
    {
        return settlDate2;
    }

    public String settlDate2AsString()
    {
        return settlDate2.getStringWithoutLengthAscii(settlDate2Offset, settlDate2Length);
    }

    private final DecimalFloat orderQty2 = new DecimalFloat();

    private boolean hasOrderQty2;

    public boolean hasOrderQty2()
    {
        return hasOrderQty2;
    }

    public QuoteEntriesGroupEncoder orderQty2(DecimalFloat value)
    {
        orderQty2.set(value);
        hasOrderQty2 = true;
        return this;
    }

    public QuoteEntriesGroupEncoder orderQty2(long value, int scale)
    {
        orderQty2.set(value, scale);
        hasOrderQty2 = true;
        return this;
    }

    public DecimalFloat orderQty2()
    {
        return orderQty2;
    }

    private final DecimalFloat bidForwardPoints2 = new DecimalFloat();

    private boolean hasBidForwardPoints2;

    public boolean hasBidForwardPoints2()
    {
        return hasBidForwardPoints2;
    }

    public QuoteEntriesGroupEncoder bidForwardPoints2(DecimalFloat value)
    {
        bidForwardPoints2.set(value);
        hasBidForwardPoints2 = true;
        return this;
    }

    public QuoteEntriesGroupEncoder bidForwardPoints2(long value, int scale)
    {
        bidForwardPoints2.set(value, scale);
        hasBidForwardPoints2 = true;
        return this;
    }

    public DecimalFloat bidForwardPoints2()
    {
        return bidForwardPoints2;
    }

    private final DecimalFloat offerForwardPoints2 = new DecimalFloat();

    private boolean hasOfferForwardPoints2;

    public boolean hasOfferForwardPoints2()
    {
        return hasOfferForwardPoints2;
    }

    public QuoteEntriesGroupEncoder offerForwardPoints2(DecimalFloat value)
    {
        offerForwardPoints2.set(value);
        hasOfferForwardPoints2 = true;
        return this;
    }

    public QuoteEntriesGroupEncoder offerForwardPoints2(long value, int scale)
    {
        offerForwardPoints2.set(value, scale);
        hasOfferForwardPoints2 = true;
        return this;
    }

    public DecimalFloat offerForwardPoints2()
    {
        return offerForwardPoints2;
    }

    private final MutableDirectBuffer currency = new UnsafeBuffer();

    private int currencyOffset = 0;

    private int currencyLength = 0;

    public QuoteEntriesGroupEncoder currency(final DirectBuffer value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public QuoteEntriesGroupEncoder currency(final DirectBuffer value, final int length)
    {
        return currency(value, 0, length);
    }

    public QuoteEntriesGroupEncoder currency(final DirectBuffer value)
    {
        return currency(value, 0, value.capacity());
    }

    public QuoteEntriesGroupEncoder currency(final byte[] value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public QuoteEntriesGroupEncoder currencyAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(currency, value, offset, length);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public QuoteEntriesGroupEncoder currency(final byte[] value, final int length)
    {
        return currency(value, 0, length);
    }

    public QuoteEntriesGroupEncoder currency(final byte[] value)
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

    public QuoteEntriesGroupEncoder currency(final CharSequence value)
    {
        toBytes(value, currency);
        currencyOffset = 0;
        currencyLength = value.length();
        return this;
    }

    public QuoteEntriesGroupEncoder currency(final AsciiSequenceView value)
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

    public QuoteEntriesGroupEncoder currency(final char[] value)
    {
        return currency(value, 0, value.length);
    }

    public QuoteEntriesGroupEncoder currency(final char[] value, final int length)
    {
        return currency(value, 0, length);
    }

    public QuoteEntriesGroupEncoder currency(final char[] value, final int offset, final int length)
    {
        toBytes(value, currency, offset, length);
        currencyOffset = 0;
        currencyLength = length;
        return this;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (quoteEntryIDLength > 0)
        {
            buffer.putBytes(position, quoteEntryIDHeader, 0, quoteEntryIDHeaderLength);
            position += quoteEntryIDHeaderLength;
            buffer.putBytes(position, quoteEntryID, quoteEntryIDOffset, quoteEntryIDLength);
            position += quoteEntryIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: QuoteEntryID");
        }

            position += instrument.encode(buffer, position);

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


        if (hasBidPx)
        {
            buffer.putBytes(position, bidPxHeader, 0, bidPxHeaderLength);
            position += bidPxHeaderLength;
            position += buffer.putFloatAscii(position, bidPx);
            buffer.putSeparator(position);
            position++;
        }

        if (hasOfferPx)
        {
            buffer.putBytes(position, offerPxHeader, 0, offerPxHeaderLength);
            position += offerPxHeaderLength;
            position += buffer.putFloatAscii(position, offerPx);
            buffer.putSeparator(position);
            position++;
        }

        if (hasBidSize)
        {
            buffer.putBytes(position, bidSizeHeader, 0, bidSizeHeaderLength);
            position += bidSizeHeaderLength;
            position += buffer.putFloatAscii(position, bidSize);
            buffer.putSeparator(position);
            position++;
        }

        if (hasOfferSize)
        {
            buffer.putBytes(position, offerSizeHeader, 0, offerSizeHeaderLength);
            position += offerSizeHeaderLength;
            position += buffer.putFloatAscii(position, offerSize);
            buffer.putSeparator(position);
            position++;
        }

        if (validUntilTimeLength > 0)
        {
            buffer.putBytes(position, validUntilTimeHeader, 0, validUntilTimeHeaderLength);
            position += validUntilTimeHeaderLength;
            buffer.putBytes(position, validUntilTime, validUntilTimeOffset, validUntilTimeLength);
            position += validUntilTimeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasBidSpotRate)
        {
            buffer.putBytes(position, bidSpotRateHeader, 0, bidSpotRateHeaderLength);
            position += bidSpotRateHeaderLength;
            position += buffer.putFloatAscii(position, bidSpotRate);
            buffer.putSeparator(position);
            position++;
        }

        if (hasOfferSpotRate)
        {
            buffer.putBytes(position, offerSpotRateHeader, 0, offerSpotRateHeaderLength);
            position += offerSpotRateHeaderLength;
            position += buffer.putFloatAscii(position, offerSpotRate);
            buffer.putSeparator(position);
            position++;
        }

        if (hasBidForwardPoints)
        {
            buffer.putBytes(position, bidForwardPointsHeader, 0, bidForwardPointsHeaderLength);
            position += bidForwardPointsHeaderLength;
            position += buffer.putFloatAscii(position, bidForwardPoints);
            buffer.putSeparator(position);
            position++;
        }

        if (hasOfferForwardPoints)
        {
            buffer.putBytes(position, offerForwardPointsHeader, 0, offerForwardPointsHeaderLength);
            position += offerForwardPointsHeaderLength;
            position += buffer.putFloatAscii(position, offerForwardPoints);
            buffer.putSeparator(position);
            position++;
        }

        if (hasMidPx)
        {
            buffer.putBytes(position, midPxHeader, 0, midPxHeaderLength);
            position += midPxHeaderLength;
            position += buffer.putFloatAscii(position, midPx);
            buffer.putSeparator(position);
            position++;
        }

        if (hasBidYield)
        {
            buffer.putBytes(position, bidYieldHeader, 0, bidYieldHeaderLength);
            position += bidYieldHeaderLength;
            position += buffer.putFloatAscii(position, bidYield);
            buffer.putSeparator(position);
            position++;
        }

        if (hasMidYield)
        {
            buffer.putBytes(position, midYieldHeader, 0, midYieldHeaderLength);
            position += midYieldHeaderLength;
            position += buffer.putFloatAscii(position, midYield);
            buffer.putSeparator(position);
            position++;
        }

        if (hasOfferYield)
        {
            buffer.putBytes(position, offerYieldHeader, 0, offerYieldHeaderLength);
            position += offerYieldHeaderLength;
            position += buffer.putFloatAscii(position, offerYield);
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

        if (settlDateLength > 0)
        {
            buffer.putBytes(position, settlDateHeader, 0, settlDateHeaderLength);
            position += settlDateHeaderLength;
            buffer.putBytes(position, settlDate, settlDateOffset, settlDateLength);
            position += settlDateLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasOrdType)
        {
            buffer.putBytes(position, ordTypeHeader, 0, ordTypeHeaderLength);
            position += ordTypeHeaderLength;
            position += buffer.putCharAscii(position, ordType);
            buffer.putSeparator(position);
            position++;
        }

        if (settlDate2Length > 0)
        {
            buffer.putBytes(position, settlDate2Header, 0, settlDate2HeaderLength);
            position += settlDate2HeaderLength;
            buffer.putBytes(position, settlDate2, settlDate2Offset, settlDate2Length);
            position += settlDate2Length;
            buffer.putSeparator(position);
            position++;
        }

        if (hasOrderQty2)
        {
            buffer.putBytes(position, orderQty2Header, 0, orderQty2HeaderLength);
            position += orderQty2HeaderLength;
            position += buffer.putFloatAscii(position, orderQty2);
            buffer.putSeparator(position);
            position++;
        }

        if (hasBidForwardPoints2)
        {
            buffer.putBytes(position, bidForwardPoints2Header, 0, bidForwardPoints2HeaderLength);
            position += bidForwardPoints2HeaderLength;
            position += buffer.putFloatAscii(position, bidForwardPoints2);
            buffer.putSeparator(position);
            position++;
        }

        if (hasOfferForwardPoints2)
        {
            buffer.putBytes(position, offerForwardPoints2Header, 0, offerForwardPoints2HeaderLength);
            position += offerForwardPoints2HeaderLength;
            position += buffer.putFloatAscii(position, offerForwardPoints2);
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
        if (next != null)
        {
            position += next.encode(buffer, position, remainingElements - 1);
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetQuoteEntryID();
        this.resetBidPx();
        this.resetOfferPx();
        this.resetBidSize();
        this.resetOfferSize();
        this.resetValidUntilTime();
        this.resetBidSpotRate();
        this.resetOfferSpotRate();
        this.resetBidForwardPoints();
        this.resetOfferForwardPoints();
        this.resetMidPx();
        this.resetBidYield();
        this.resetMidYield();
        this.resetOfferYield();
        this.resetTransactTime();
        this.resetTradingSessionID();
        this.resetTradingSessionSubID();
        this.resetSettlDate();
        this.resetOrdType();
        this.resetSettlDate2();
        this.resetOrderQty2();
        this.resetBidForwardPoints2();
        this.resetOfferForwardPoints2();
        this.resetCurrency();
        instrument.reset();
        this.resetLegsGroup();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetQuoteEntryID()
    {
        quoteEntryIDLength = 0;
    }

    public void resetBidPx()
    {
        hasBidPx = false;
    }

    public void resetOfferPx()
    {
        hasOfferPx = false;
    }

    public void resetBidSize()
    {
        hasBidSize = false;
    }

    public void resetOfferSize()
    {
        hasOfferSize = false;
    }

    public void resetValidUntilTime()
    {
        validUntilTimeLength = 0;
    }

    public void resetBidSpotRate()
    {
        hasBidSpotRate = false;
    }

    public void resetOfferSpotRate()
    {
        hasOfferSpotRate = false;
    }

    public void resetBidForwardPoints()
    {
        hasBidForwardPoints = false;
    }

    public void resetOfferForwardPoints()
    {
        hasOfferForwardPoints = false;
    }

    public void resetMidPx()
    {
        hasMidPx = false;
    }

    public void resetBidYield()
    {
        hasBidYield = false;
    }

    public void resetMidYield()
    {
        hasMidYield = false;
    }

    public void resetOfferYield()
    {
        hasOfferYield = false;
    }

    public void resetTransactTime()
    {
        transactTimeLength = 0;
    }

    public void resetTradingSessionID()
    {
        tradingSessionIDLength = 0;
    }

    public void resetTradingSessionSubID()
    {
        tradingSessionSubIDLength = 0;
    }

    public void resetSettlDate()
    {
        settlDateLength = 0;
    }

    public void resetOrdType()
    {
        hasOrdType = false;
    }

    public void resetSettlDate2()
    {
        settlDate2Length = 0;
    }

    public void resetOrderQty2()
    {
        hasOrderQty2 = false;
    }

    public void resetBidForwardPoints2()
    {
        hasBidForwardPoints2 = false;
    }

    public void resetOfferForwardPoints2()
    {
        hasOfferForwardPoints2 = false;
    }

    public void resetCurrency()
    {
        currencyLength = 0;
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
        builder.append("\"MessageName\": \"QuoteEntriesGroup\",\n");
        if (hasQuoteEntryID())
        {
            indent(builder, level);
            builder.append("\"QuoteEntryID\": \"");
            appendBuffer(builder, quoteEntryID, quoteEntryIDOffset, quoteEntryIDLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"Instrument\": ");
    instrument.appendTo(builder, level + 1);
    builder.append("\n");

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

        if (hasBidPx())
        {
            indent(builder, level);
            builder.append("\"BidPx\": \"");
            bidPx.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasOfferPx())
        {
            indent(builder, level);
            builder.append("\"OfferPx\": \"");
            offerPx.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasBidSize())
        {
            indent(builder, level);
            builder.append("\"BidSize\": \"");
            bidSize.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasOfferSize())
        {
            indent(builder, level);
            builder.append("\"OfferSize\": \"");
            offerSize.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasValidUntilTime())
        {
            indent(builder, level);
            builder.append("\"ValidUntilTime\": \"");
            appendBuffer(builder, validUntilTime, validUntilTimeOffset, validUntilTimeLength);
            builder.append("\",\n");
        }

        if (hasBidSpotRate())
        {
            indent(builder, level);
            builder.append("\"BidSpotRate\": \"");
            bidSpotRate.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasOfferSpotRate())
        {
            indent(builder, level);
            builder.append("\"OfferSpotRate\": \"");
            offerSpotRate.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasBidForwardPoints())
        {
            indent(builder, level);
            builder.append("\"BidForwardPoints\": \"");
            bidForwardPoints.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasOfferForwardPoints())
        {
            indent(builder, level);
            builder.append("\"OfferForwardPoints\": \"");
            offerForwardPoints.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasMidPx())
        {
            indent(builder, level);
            builder.append("\"MidPx\": \"");
            midPx.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasBidYield())
        {
            indent(builder, level);
            builder.append("\"BidYield\": \"");
            bidYield.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasMidYield())
        {
            indent(builder, level);
            builder.append("\"MidYield\": \"");
            midYield.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasOfferYield())
        {
            indent(builder, level);
            builder.append("\"OfferYield\": \"");
            offerYield.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasTransactTime())
        {
            indent(builder, level);
            builder.append("\"TransactTime\": \"");
            appendBuffer(builder, transactTime, transactTimeOffset, transactTimeLength);
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

        if (hasSettlDate())
        {
            indent(builder, level);
            builder.append("\"SettlDate\": \"");
            appendBuffer(builder, settlDate, settlDateOffset, settlDateLength);
            builder.append("\",\n");
        }

        if (hasOrdType())
        {
            indent(builder, level);
            builder.append("\"OrdType\": \"");
            builder.append(ordType);
            builder.append("\",\n");
        }

        if (hasSettlDate2())
        {
            indent(builder, level);
            builder.append("\"SettlDate2\": \"");
            appendBuffer(builder, settlDate2, settlDate2Offset, settlDate2Length);
            builder.append("\",\n");
        }

        if (hasOrderQty2())
        {
            indent(builder, level);
            builder.append("\"OrderQty2\": \"");
            orderQty2.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasBidForwardPoints2())
        {
            indent(builder, level);
            builder.append("\"BidForwardPoints2\": \"");
            bidForwardPoints2.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasOfferForwardPoints2())
        {
            indent(builder, level);
            builder.append("\"OfferForwardPoints2\": \"");
            offerForwardPoints2.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasCurrency())
        {
            indent(builder, level);
            builder.append("\"Currency\": \"");
            appendBuffer(builder, currency, currencyOffset, currencyLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public QuoteEntriesGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((QuoteEntriesGroupEncoder)encoder);
    }

    public QuoteEntriesGroupEncoder copyTo(final QuoteEntriesGroupEncoder encoder)
    {
        encoder.reset();
        if (hasQuoteEntryID())
        {
            encoder.quoteEntryIDAsCopy(quoteEntryID.byteArray(), 0, quoteEntryIDLength);
        }


        instrument.copyTo(encoder.instrument());
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

        if (hasBidPx())
        {
            encoder.bidPx(this.bidPx());
        }

        if (hasOfferPx())
        {
            encoder.offerPx(this.offerPx());
        }

        if (hasBidSize())
        {
            encoder.bidSize(this.bidSize());
        }

        if (hasOfferSize())
        {
            encoder.offerSize(this.offerSize());
        }

        if (hasValidUntilTime())
        {
            encoder.validUntilTimeAsCopy(validUntilTime.byteArray(), 0, validUntilTimeLength);
        }

        if (hasBidSpotRate())
        {
            encoder.bidSpotRate(this.bidSpotRate());
        }

        if (hasOfferSpotRate())
        {
            encoder.offerSpotRate(this.offerSpotRate());
        }

        if (hasBidForwardPoints())
        {
            encoder.bidForwardPoints(this.bidForwardPoints());
        }

        if (hasOfferForwardPoints())
        {
            encoder.offerForwardPoints(this.offerForwardPoints());
        }

        if (hasMidPx())
        {
            encoder.midPx(this.midPx());
        }

        if (hasBidYield())
        {
            encoder.bidYield(this.bidYield());
        }

        if (hasMidYield())
        {
            encoder.midYield(this.midYield());
        }

        if (hasOfferYield())
        {
            encoder.offerYield(this.offerYield());
        }

        if (hasTransactTime())
        {
            encoder.transactTimeAsCopy(transactTime.byteArray(), 0, transactTimeLength);
        }

        if (hasTradingSessionID())
        {
            encoder.tradingSessionIDAsCopy(tradingSessionID.byteArray(), 0, tradingSessionIDLength);
        }

        if (hasTradingSessionSubID())
        {
            encoder.tradingSessionSubIDAsCopy(tradingSessionSubID.byteArray(), 0, tradingSessionSubIDLength);
        }

        if (hasSettlDate())
        {
            encoder.settlDateAsCopy(settlDate.byteArray(), 0, settlDateLength);
        }

        if (hasOrdType())
        {
            encoder.ordType(this.ordType());
        }

        if (hasSettlDate2())
        {
            encoder.settlDate2AsCopy(settlDate2.byteArray(), 0, settlDate2Length);
        }

        if (hasOrderQty2())
        {
            encoder.orderQty2(this.orderQty2());
        }

        if (hasBidForwardPoints2())
        {
            encoder.bidForwardPoints2(this.bidForwardPoints2());
        }

        if (hasOfferForwardPoints2())
        {
            encoder.offerForwardPoints2(this.offerForwardPoints2());
        }

        if (hasCurrency())
        {
            encoder.currencyAsCopy(currency.byteArray(), 0, currencyLength);
        }
        return encoder;
    }

}
    private int noQuoteEntriesGroupCounter;

    private boolean hasNoQuoteEntriesGroupCounter;

    public boolean hasNoQuoteEntriesGroupCounter()
    {
        return hasNoQuoteEntriesGroupCounter;
    }

    public QuoteSetsGroupEncoder noQuoteEntriesGroupCounter(int value)
    {
        noQuoteEntriesGroupCounter = value;
        hasNoQuoteEntriesGroupCounter = true;
        return this;
    }

    public int noQuoteEntriesGroupCounter()
    {
        return noQuoteEntriesGroupCounter;
    }


    private QuoteEntriesGroupEncoder quoteEntriesGroup = null;

    public QuoteEntriesGroupEncoder quoteEntriesGroup(final int numberOfElements)
    {
        hasNoQuoteEntriesGroupCounter = true;
        noQuoteEntriesGroupCounter = numberOfElements;
        if (quoteEntriesGroup == null)
        {
            quoteEntriesGroup = new QuoteEntriesGroupEncoder();
        }
        return quoteEntriesGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (quoteSetIDLength > 0)
        {
            buffer.putBytes(position, quoteSetIDHeader, 0, quoteSetIDHeaderLength);
            position += quoteSetIDHeaderLength;
            buffer.putBytes(position, quoteSetID, quoteSetIDOffset, quoteSetIDLength);
            position += quoteSetIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: QuoteSetID");
        }

            position += underlyingInstrument.encode(buffer, position);

        if (quoteSetValidUntilTimeLength > 0)
        {
            buffer.putBytes(position, quoteSetValidUntilTimeHeader, 0, quoteSetValidUntilTimeHeaderLength);
            position += quoteSetValidUntilTimeHeaderLength;
            buffer.putBytes(position, quoteSetValidUntilTime, quoteSetValidUntilTimeOffset, quoteSetValidUntilTimeLength);
            position += quoteSetValidUntilTimeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasTotNoQuoteEntries)
        {
            buffer.putBytes(position, totNoQuoteEntriesHeader, 0, totNoQuoteEntriesHeaderLength);
            position += totNoQuoteEntriesHeaderLength;
            position += buffer.putIntAscii(position, totNoQuoteEntries);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: TotNoQuoteEntries");
        }

        if (hasLastFragment)
        {
            buffer.putBytes(position, lastFragmentHeader, 0, lastFragmentHeaderLength);
            position += lastFragmentHeaderLength;
            position += buffer.putBooleanAscii(position, lastFragment);
            buffer.putSeparator(position);
            position++;
        }

        if (hasNoQuoteEntriesGroupCounter)
        {
            buffer.putBytes(position, noQuoteEntriesGroupCounterHeader, 0, noQuoteEntriesGroupCounterHeaderLength);
            position += noQuoteEntriesGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noQuoteEntriesGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (quoteEntriesGroup != null)
        {
            position += quoteEntriesGroup.encode(buffer, position, noQuoteEntriesGroupCounter);
        }

        if (next != null)
        {
            position += next.encode(buffer, position, remainingElements - 1);
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetQuoteSetID();
        this.resetQuoteSetValidUntilTime();
        this.resetTotNoQuoteEntries();
        this.resetLastFragment();
        underlyingInstrument.reset();
        this.resetQuoteEntriesGroup();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetQuoteSetID()
    {
        quoteSetIDLength = 0;
    }

    public void resetQuoteSetValidUntilTime()
    {
        quoteSetValidUntilTimeLength = 0;
    }

    public void resetTotNoQuoteEntries()
    {
        hasTotNoQuoteEntries = false;
    }

    public void resetLastFragment()
    {
        hasLastFragment = false;
    }

    public void resetQuoteEntriesGroup()
    {
        if (quoteEntriesGroup != null)
        {
            quoteEntriesGroup.reset();
        }
        noQuoteEntriesGroupCounter = 0;
        hasNoQuoteEntriesGroupCounter = false;
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
        builder.append("\"MessageName\": \"QuoteSetsGroup\",\n");
        if (hasQuoteSetID())
        {
            indent(builder, level);
            builder.append("\"QuoteSetID\": \"");
            appendBuffer(builder, quoteSetID, quoteSetIDOffset, quoteSetIDLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"UnderlyingInstrument\": ");
    underlyingInstrument.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasQuoteSetValidUntilTime())
        {
            indent(builder, level);
            builder.append("\"QuoteSetValidUntilTime\": \"");
            appendBuffer(builder, quoteSetValidUntilTime, quoteSetValidUntilTimeOffset, quoteSetValidUntilTimeLength);
            builder.append("\",\n");
        }

        if (hasTotNoQuoteEntries())
        {
            indent(builder, level);
            builder.append("\"TotNoQuoteEntries\": \"");
            builder.append(totNoQuoteEntries);
            builder.append("\",\n");
        }

        if (hasLastFragment())
        {
            indent(builder, level);
            builder.append("\"LastFragment\": \"");
            builder.append(lastFragment);
            builder.append("\",\n");
        }

        if (hasNoQuoteEntriesGroupCounter)
        {
            indent(builder, level);
            builder.append("\"QuoteEntriesGroup\": [\n");
            final int noQuoteEntriesGroupCounter = this.noQuoteEntriesGroupCounter;
            QuoteEntriesGroupEncoder quoteEntriesGroup = this.quoteEntriesGroup;
            for (int i = 0; i < noQuoteEntriesGroupCounter; i++)
            {
                indent(builder, level);
                quoteEntriesGroup.appendTo(builder, level + 1);
                if (i < (noQuoteEntriesGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                quoteEntriesGroup = quoteEntriesGroup.next();
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
    public QuoteSetsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((QuoteSetsGroupEncoder)encoder);
    }

    public QuoteSetsGroupEncoder copyTo(final QuoteSetsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasQuoteSetID())
        {
            encoder.quoteSetIDAsCopy(quoteSetID.byteArray(), 0, quoteSetIDLength);
        }


        underlyingInstrument.copyTo(encoder.underlyingInstrument());
        if (hasQuoteSetValidUntilTime())
        {
            encoder.quoteSetValidUntilTimeAsCopy(quoteSetValidUntilTime.byteArray(), 0, quoteSetValidUntilTimeLength);
        }

        if (hasTotNoQuoteEntries())
        {
            encoder.totNoQuoteEntries(this.totNoQuoteEntries());
        }

        if (hasLastFragment())
        {
            encoder.lastFragment(this.lastFragment());
        }

        if (hasNoQuoteEntriesGroupCounter)
        {
            final int size = this.noQuoteEntriesGroupCounter;
            QuoteEntriesGroupEncoder quoteEntriesGroup = this.quoteEntriesGroup;
            QuoteEntriesGroupEncoder quoteEntriesGroupEncoder = encoder.quoteEntriesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (quoteEntriesGroup != null)
                {
                    quoteEntriesGroup.copyTo(quoteEntriesGroupEncoder);
                    quoteEntriesGroup = quoteEntriesGroup.next();
                    quoteEntriesGroupEncoder = quoteEntriesGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
    private int noQuoteSetsGroupCounter;

    private boolean hasNoQuoteSetsGroupCounter;

    public boolean hasNoQuoteSetsGroupCounter()
    {
        return hasNoQuoteSetsGroupCounter;
    }

    public MassQuoteEncoder noQuoteSetsGroupCounter(int value)
    {
        noQuoteSetsGroupCounter = value;
        hasNoQuoteSetsGroupCounter = true;
        return this;
    }

    public int noQuoteSetsGroupCounter()
    {
        return noQuoteSetsGroupCounter;
    }


    private QuoteSetsGroupEncoder quoteSetsGroup = null;

    public QuoteSetsGroupEncoder quoteSetsGroup(final int numberOfElements)
    {
        hasNoQuoteSetsGroupCounter = true;
        noQuoteSetsGroupCounter = numberOfElements;
        if (quoteSetsGroup == null)
        {
            quoteSetsGroup = new QuoteSetsGroupEncoder();
        }
        return quoteSetsGroup;
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
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: QuoteID");
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

        if (hasDefBidSize)
        {
            buffer.putBytes(position, defBidSizeHeader, 0, defBidSizeHeaderLength);
            position += defBidSizeHeaderLength;
            position += buffer.putFloatAscii(position, defBidSize);
            buffer.putSeparator(position);
            position++;
        }

        if (hasDefOfferSize)
        {
            buffer.putBytes(position, defOfferSizeHeader, 0, defOfferSizeHeaderLength);
            position += defOfferSizeHeaderLength;
            position += buffer.putFloatAscii(position, defOfferSize);
            buffer.putSeparator(position);
            position++;
        }

        if (hasNoQuoteSetsGroupCounter)
        {
            buffer.putBytes(position, noQuoteSetsGroupCounterHeader, 0, noQuoteSetsGroupCounterHeaderLength);
            position += noQuoteSetsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noQuoteSetsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (quoteSetsGroup != null)
        {
            position += quoteSetsGroup.encode(buffer, position, noQuoteSetsGroupCounter);
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
        this.resetQuoteReqID();
        this.resetQuoteID();
        this.resetQuoteType();
        this.resetQuoteResponseLevel();
        this.resetAccount();
        this.resetAcctIDSource();
        this.resetAccountType();
        this.resetDefBidSize();
        this.resetDefOfferSize();
        parties.reset();
        this.resetQuoteSetsGroup();
    }

    public void resetQuoteReqID()
    {
        quoteReqIDLength = 0;
    }

    public void resetQuoteID()
    {
        quoteIDLength = 0;
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

    public void resetDefBidSize()
    {
        hasDefBidSize = false;
    }

    public void resetDefOfferSize()
    {
        hasDefOfferSize = false;
    }

    public void resetQuoteSetsGroup()
    {
        if (quoteSetsGroup != null)
        {
            quoteSetsGroup.reset();
        }
        noQuoteSetsGroupCounter = 0;
        hasNoQuoteSetsGroupCounter = false;
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
        builder.append("\"MessageName\": \"MassQuote\",\n");
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

        if (hasDefBidSize())
        {
            indent(builder, level);
            builder.append("\"DefBidSize\": \"");
            defBidSize.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasDefOfferSize())
        {
            indent(builder, level);
            builder.append("\"DefOfferSize\": \"");
            defOfferSize.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasNoQuoteSetsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"QuoteSetsGroup\": [\n");
            final int noQuoteSetsGroupCounter = this.noQuoteSetsGroupCounter;
            QuoteSetsGroupEncoder quoteSetsGroup = this.quoteSetsGroup;
            for (int i = 0; i < noQuoteSetsGroupCounter; i++)
            {
                indent(builder, level);
                quoteSetsGroup.appendTo(builder, level + 1);
                if (i < (noQuoteSetsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                quoteSetsGroup = quoteSetsGroup.next();
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
    public MassQuoteEncoder copyTo(final Encoder encoder)
    {
        return copyTo((MassQuoteEncoder)encoder);
    }

    public MassQuoteEncoder copyTo(final MassQuoteEncoder encoder)
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

        if (hasQuoteType())
        {
            encoder.quoteType(this.quoteType());
        }

        if (hasQuoteResponseLevel())
        {
            encoder.quoteResponseLevel(this.quoteResponseLevel());
        }


        parties.copyTo(encoder.parties());
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

        if (hasDefBidSize())
        {
            encoder.defBidSize(this.defBidSize());
        }

        if (hasDefOfferSize())
        {
            encoder.defOfferSize(this.defOfferSize());
        }

        if (hasNoQuoteSetsGroupCounter)
        {
            final int size = this.noQuoteSetsGroupCounter;
            QuoteSetsGroupEncoder quoteSetsGroup = this.quoteSetsGroup;
            QuoteSetsGroupEncoder quoteSetsGroupEncoder = encoder.quoteSetsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (quoteSetsGroup != null)
                {
                    quoteSetsGroup.copyTo(quoteSetsGroupEncoder);
                    quoteSetsGroup = quoteSetsGroup.next();
                    quoteSetsGroupEncoder = quoteSetsGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
