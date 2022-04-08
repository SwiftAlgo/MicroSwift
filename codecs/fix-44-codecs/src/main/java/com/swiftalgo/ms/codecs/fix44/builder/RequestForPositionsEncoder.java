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


public class RequestForPositionsEncoder implements Encoder
{
    public long messageType()
    {
        return 20033L;
    }

    public RequestForPositionsEncoder()
    {
        header.msgType("AN");
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

    private static final int posReqIDHeaderLength = 4;
    private static final byte[] posReqIDHeader = new byte[] {55, 49, 48, (byte) '='};

    private static final int posReqTypeHeaderLength = 4;
    private static final byte[] posReqTypeHeader = new byte[] {55, 50, 52, (byte) '='};

    private static final int matchStatusHeaderLength = 4;
    private static final byte[] matchStatusHeader = new byte[] {53, 55, 51, (byte) '='};

    private static final int subscriptionRequestTypeHeaderLength = 4;
    private static final byte[] subscriptionRequestTypeHeader = new byte[] {50, 54, 51, (byte) '='};

    private static final int accountHeaderLength = 2;
    private static final byte[] accountHeader = new byte[] {49, (byte) '='};

    private static final int acctIDSourceHeaderLength = 4;
    private static final byte[] acctIDSourceHeader = new byte[] {54, 54, 48, (byte) '='};

    private static final int accountTypeHeaderLength = 4;
    private static final byte[] accountTypeHeader = new byte[] {53, 56, 49, (byte) '='};

    private static final int currencyHeaderLength = 3;
    private static final byte[] currencyHeader = new byte[] {49, 53, (byte) '='};

    private static final int noLegsGroupCounterHeaderLength = 4;
    private static final byte[] noLegsGroupCounterHeader = new byte[] {53, 53, 53, (byte) '='};

    private static final int noUnderlyingsGroupCounterHeaderLength = 4;
    private static final byte[] noUnderlyingsGroupCounterHeader = new byte[] {55, 49, 49, (byte) '='};

    private static final int clearingBusinessDateHeaderLength = 4;
    private static final byte[] clearingBusinessDateHeader = new byte[] {55, 49, 53, (byte) '='};

    private static final int settlSessIDHeaderLength = 4;
    private static final byte[] settlSessIDHeader = new byte[] {55, 49, 54, (byte) '='};

    private static final int settlSessSubIDHeaderLength = 4;
    private static final byte[] settlSessSubIDHeader = new byte[] {55, 49, 55, (byte) '='};

    private static final int noTradingSessionsGroupCounterHeaderLength = 4;
    private static final byte[] noTradingSessionsGroupCounterHeader = new byte[] {51, 56, 54, (byte) '='};

    private static final int transactTimeHeaderLength = 3;
    private static final byte[] transactTimeHeader = new byte[] {54, 48, (byte) '='};

    private static final int responseTransportTypeHeaderLength = 4;
    private static final byte[] responseTransportTypeHeader = new byte[] {55, 50, 53, (byte) '='};

    private static final int responseDestinationHeaderLength = 4;
    private static final byte[] responseDestinationHeader = new byte[] {55, 50, 54, (byte) '='};

    private static final int textHeaderLength = 3;
    private static final byte[] textHeader = new byte[] {53, 56, (byte) '='};

    private static final int encodedTextLenHeaderLength = 4;
    private static final byte[] encodedTextLenHeader = new byte[] {51, 53, 52, (byte) '='};

    private static final int encodedTextHeaderLength = 4;
    private static final byte[] encodedTextHeader = new byte[] {51, 53, 53, (byte) '='};

    private final MutableDirectBuffer posReqID = new UnsafeBuffer();

    private int posReqIDOffset = 0;

    private int posReqIDLength = 0;

    public RequestForPositionsEncoder posReqID(final DirectBuffer value, final int offset, final int length)
    {
        posReqID.wrap(value);
        posReqIDOffset = offset;
        posReqIDLength = length;
        return this;
    }

    public RequestForPositionsEncoder posReqID(final DirectBuffer value, final int length)
    {
        return posReqID(value, 0, length);
    }

    public RequestForPositionsEncoder posReqID(final DirectBuffer value)
    {
        return posReqID(value, 0, value.capacity());
    }

    public RequestForPositionsEncoder posReqID(final byte[] value, final int offset, final int length)
    {
        posReqID.wrap(value);
        posReqIDOffset = offset;
        posReqIDLength = length;
        return this;
    }

    public RequestForPositionsEncoder posReqIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(posReqID, value, offset, length);
        posReqIDOffset = offset;
        posReqIDLength = length;
        return this;
    }

    public RequestForPositionsEncoder posReqID(final byte[] value, final int length)
    {
        return posReqID(value, 0, length);
    }

    public RequestForPositionsEncoder posReqID(final byte[] value)
    {
        return posReqID(value, 0, value.length);
    }

    public boolean hasPosReqID()
    {
        return posReqIDLength > 0;
    }

    public MutableDirectBuffer posReqID()
    {
        return posReqID;
    }

    public String posReqIDAsString()
    {
        return posReqID.getStringWithoutLengthAscii(posReqIDOffset, posReqIDLength);
    }

    public RequestForPositionsEncoder posReqID(final CharSequence value)
    {
        toBytes(value, posReqID);
        posReqIDOffset = 0;
        posReqIDLength = value.length();
        return this;
    }

    public RequestForPositionsEncoder posReqID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            posReqID.wrap(buffer);
            posReqIDOffset = value.offset();
            posReqIDLength = value.length();
        }
        return this;
    }

    public RequestForPositionsEncoder posReqID(final char[] value)
    {
        return posReqID(value, 0, value.length);
    }

    public RequestForPositionsEncoder posReqID(final char[] value, final int length)
    {
        return posReqID(value, 0, length);
    }

    public RequestForPositionsEncoder posReqID(final char[] value, final int offset, final int length)
    {
        toBytes(value, posReqID, offset, length);
        posReqIDOffset = 0;
        posReqIDLength = length;
        return this;
    }

    private int posReqType;

    private boolean hasPosReqType;

    public boolean hasPosReqType()
    {
        return hasPosReqType;
    }

    public RequestForPositionsEncoder posReqType(int value)
    {
        posReqType = value;
        hasPosReqType = true;
        return this;
    }

    public int posReqType()
    {
        return posReqType;
    }

    public RequestForPositionsEncoder posReqType(PosReqType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == PosReqType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: posReqType Value: " + value );
            }
            if (value == PosReqType.NULL_VAL)
            {
                return this;
            }
        }
        return posReqType(value.representation());
    }

    private char matchStatus;

    private boolean hasMatchStatus;

    public boolean hasMatchStatus()
    {
        return hasMatchStatus;
    }

    public RequestForPositionsEncoder matchStatus(char value)
    {
        matchStatus = value;
        hasMatchStatus = true;
        return this;
    }

    public char matchStatus()
    {
        return matchStatus;
    }

    public RequestForPositionsEncoder matchStatus(MatchStatus value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == MatchStatus.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: matchStatus Value: " + value );
            }
            if (value == MatchStatus.NULL_VAL)
            {
                return this;
            }
        }
        return matchStatus(value.representation());
    }

    private char subscriptionRequestType;

    private boolean hasSubscriptionRequestType;

    public boolean hasSubscriptionRequestType()
    {
        return hasSubscriptionRequestType;
    }

    public RequestForPositionsEncoder subscriptionRequestType(char value)
    {
        subscriptionRequestType = value;
        hasSubscriptionRequestType = true;
        return this;
    }

    public char subscriptionRequestType()
    {
        return subscriptionRequestType;
    }

    public RequestForPositionsEncoder subscriptionRequestType(SubscriptionRequestType value)
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

    private final PartiesEncoder parties = new PartiesEncoder();
    public PartiesEncoder parties()
    {
        return parties;
    }

    private final MutableDirectBuffer account = new UnsafeBuffer();

    private int accountOffset = 0;

    private int accountLength = 0;

    public RequestForPositionsEncoder account(final DirectBuffer value, final int offset, final int length)
    {
        account.wrap(value);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    public RequestForPositionsEncoder account(final DirectBuffer value, final int length)
    {
        return account(value, 0, length);
    }

    public RequestForPositionsEncoder account(final DirectBuffer value)
    {
        return account(value, 0, value.capacity());
    }

    public RequestForPositionsEncoder account(final byte[] value, final int offset, final int length)
    {
        account.wrap(value);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    public RequestForPositionsEncoder accountAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(account, value, offset, length);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    public RequestForPositionsEncoder account(final byte[] value, final int length)
    {
        return account(value, 0, length);
    }

    public RequestForPositionsEncoder account(final byte[] value)
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

    public RequestForPositionsEncoder account(final CharSequence value)
    {
        toBytes(value, account);
        accountOffset = 0;
        accountLength = value.length();
        return this;
    }

    public RequestForPositionsEncoder account(final AsciiSequenceView value)
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

    public RequestForPositionsEncoder account(final char[] value)
    {
        return account(value, 0, value.length);
    }

    public RequestForPositionsEncoder account(final char[] value, final int length)
    {
        return account(value, 0, length);
    }

    public RequestForPositionsEncoder account(final char[] value, final int offset, final int length)
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

    public RequestForPositionsEncoder acctIDSource(int value)
    {
        acctIDSource = value;
        hasAcctIDSource = true;
        return this;
    }

    public int acctIDSource()
    {
        return acctIDSource;
    }

    public RequestForPositionsEncoder acctIDSource(AcctIDSource value)
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

    public RequestForPositionsEncoder accountType(int value)
    {
        accountType = value;
        hasAccountType = true;
        return this;
    }

    public int accountType()
    {
        return accountType;
    }

    public RequestForPositionsEncoder accountType(AccountType value)
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

    private final InstrumentEncoder instrument = new InstrumentEncoder();
    public InstrumentEncoder instrument()
    {
        return instrument;
    }

    private final MutableDirectBuffer currency = new UnsafeBuffer();

    private int currencyOffset = 0;

    private int currencyLength = 0;

    public RequestForPositionsEncoder currency(final DirectBuffer value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public RequestForPositionsEncoder currency(final DirectBuffer value, final int length)
    {
        return currency(value, 0, length);
    }

    public RequestForPositionsEncoder currency(final DirectBuffer value)
    {
        return currency(value, 0, value.capacity());
    }

    public RequestForPositionsEncoder currency(final byte[] value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public RequestForPositionsEncoder currencyAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(currency, value, offset, length);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public RequestForPositionsEncoder currency(final byte[] value, final int length)
    {
        return currency(value, 0, length);
    }

    public RequestForPositionsEncoder currency(final byte[] value)
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

    public RequestForPositionsEncoder currency(final CharSequence value)
    {
        toBytes(value, currency);
        currencyOffset = 0;
        currencyLength = value.length();
        return this;
    }

    public RequestForPositionsEncoder currency(final AsciiSequenceView value)
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

    public RequestForPositionsEncoder currency(final char[] value)
    {
        return currency(value, 0, value.length);
    }

    public RequestForPositionsEncoder currency(final char[] value, final int length)
    {
        return currency(value, 0, length);
    }

    public RequestForPositionsEncoder currency(final char[] value, final int offset, final int length)
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

    public RequestForPositionsEncoder noLegsGroupCounter(int value)
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

    private final UnderlyingInstrumentEncoder underlyingInstrument = new UnderlyingInstrumentEncoder();
    public UnderlyingInstrumentEncoder underlyingInstrument()
    {
        return underlyingInstrument;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

            position += underlyingInstrument.encode(buffer, position);
        if (next != null)
        {
            position += next.encode(buffer, position, remainingElements - 1);
        }
        return position - offset;
    }

    public void reset()
    {
        underlyingInstrument.reset();
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
        builder.append("\"MessageName\": \"UnderlyingsGroup\",\n");
    indent(builder, level);
    builder.append("\"UnderlyingInstrument\": ");
    underlyingInstrument.appendTo(builder, level + 1);
    builder.append("\n");
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

        underlyingInstrument.copyTo(encoder.underlyingInstrument());        return encoder;
    }

}
    private int noUnderlyingsGroupCounter;

    private boolean hasNoUnderlyingsGroupCounter;

    public boolean hasNoUnderlyingsGroupCounter()
    {
        return hasNoUnderlyingsGroupCounter;
    }

    public RequestForPositionsEncoder noUnderlyingsGroupCounter(int value)
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

    private final MutableDirectBuffer clearingBusinessDate = new UnsafeBuffer();

    private int clearingBusinessDateOffset = 0;

    private int clearingBusinessDateLength = 0;

    public RequestForPositionsEncoder clearingBusinessDate(final DirectBuffer value, final int offset, final int length)
    {
        clearingBusinessDate.wrap(value);
        clearingBusinessDateOffset = offset;
        clearingBusinessDateLength = length;
        return this;
    }

    public RequestForPositionsEncoder clearingBusinessDate(final DirectBuffer value, final int length)
    {
        return clearingBusinessDate(value, 0, length);
    }

    public RequestForPositionsEncoder clearingBusinessDate(final DirectBuffer value)
    {
        return clearingBusinessDate(value, 0, value.capacity());
    }

    public RequestForPositionsEncoder clearingBusinessDate(final byte[] value, final int offset, final int length)
    {
        clearingBusinessDate.wrap(value);
        clearingBusinessDateOffset = offset;
        clearingBusinessDateLength = length;
        return this;
    }

    public RequestForPositionsEncoder clearingBusinessDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(clearingBusinessDate, value, offset, length);
        clearingBusinessDateOffset = offset;
        clearingBusinessDateLength = length;
        return this;
    }

    public RequestForPositionsEncoder clearingBusinessDate(final byte[] value, final int length)
    {
        return clearingBusinessDate(value, 0, length);
    }

    public RequestForPositionsEncoder clearingBusinessDate(final byte[] value)
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

    private final MutableDirectBuffer settlSessID = new UnsafeBuffer();

    private int settlSessIDOffset = 0;

    private int settlSessIDLength = 0;

    public RequestForPositionsEncoder settlSessID(final DirectBuffer value, final int offset, final int length)
    {
        settlSessID.wrap(value);
        settlSessIDOffset = offset;
        settlSessIDLength = length;
        return this;
    }

    public RequestForPositionsEncoder settlSessID(final DirectBuffer value, final int length)
    {
        return settlSessID(value, 0, length);
    }

    public RequestForPositionsEncoder settlSessID(final DirectBuffer value)
    {
        return settlSessID(value, 0, value.capacity());
    }

    public RequestForPositionsEncoder settlSessID(final byte[] value, final int offset, final int length)
    {
        settlSessID.wrap(value);
        settlSessIDOffset = offset;
        settlSessIDLength = length;
        return this;
    }

    public RequestForPositionsEncoder settlSessIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlSessID, value, offset, length);
        settlSessIDOffset = offset;
        settlSessIDLength = length;
        return this;
    }

    public RequestForPositionsEncoder settlSessID(final byte[] value, final int length)
    {
        return settlSessID(value, 0, length);
    }

    public RequestForPositionsEncoder settlSessID(final byte[] value)
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

    public RequestForPositionsEncoder settlSessID(final CharSequence value)
    {
        toBytes(value, settlSessID);
        settlSessIDOffset = 0;
        settlSessIDLength = value.length();
        return this;
    }

    public RequestForPositionsEncoder settlSessID(final AsciiSequenceView value)
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

    public RequestForPositionsEncoder settlSessID(final char[] value)
    {
        return settlSessID(value, 0, value.length);
    }

    public RequestForPositionsEncoder settlSessID(final char[] value, final int length)
    {
        return settlSessID(value, 0, length);
    }

    public RequestForPositionsEncoder settlSessID(final char[] value, final int offset, final int length)
    {
        toBytes(value, settlSessID, offset, length);
        settlSessIDOffset = 0;
        settlSessIDLength = length;
        return this;
    }

    private final MutableDirectBuffer settlSessSubID = new UnsafeBuffer();

    private int settlSessSubIDOffset = 0;

    private int settlSessSubIDLength = 0;

    public RequestForPositionsEncoder settlSessSubID(final DirectBuffer value, final int offset, final int length)
    {
        settlSessSubID.wrap(value);
        settlSessSubIDOffset = offset;
        settlSessSubIDLength = length;
        return this;
    }

    public RequestForPositionsEncoder settlSessSubID(final DirectBuffer value, final int length)
    {
        return settlSessSubID(value, 0, length);
    }

    public RequestForPositionsEncoder settlSessSubID(final DirectBuffer value)
    {
        return settlSessSubID(value, 0, value.capacity());
    }

    public RequestForPositionsEncoder settlSessSubID(final byte[] value, final int offset, final int length)
    {
        settlSessSubID.wrap(value);
        settlSessSubIDOffset = offset;
        settlSessSubIDLength = length;
        return this;
    }

    public RequestForPositionsEncoder settlSessSubIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlSessSubID, value, offset, length);
        settlSessSubIDOffset = offset;
        settlSessSubIDLength = length;
        return this;
    }

    public RequestForPositionsEncoder settlSessSubID(final byte[] value, final int length)
    {
        return settlSessSubID(value, 0, length);
    }

    public RequestForPositionsEncoder settlSessSubID(final byte[] value)
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

    public RequestForPositionsEncoder settlSessSubID(final CharSequence value)
    {
        toBytes(value, settlSessSubID);
        settlSessSubIDOffset = 0;
        settlSessSubIDLength = value.length();
        return this;
    }

    public RequestForPositionsEncoder settlSessSubID(final AsciiSequenceView value)
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

    public RequestForPositionsEncoder settlSessSubID(final char[] value)
    {
        return settlSessSubID(value, 0, value.length);
    }

    public RequestForPositionsEncoder settlSessSubID(final char[] value, final int length)
    {
        return settlSessSubID(value, 0, length);
    }

    public RequestForPositionsEncoder settlSessSubID(final char[] value, final int offset, final int length)
    {
        toBytes(value, settlSessSubID, offset, length);
        settlSessSubIDOffset = 0;
        settlSessSubIDLength = length;
        return this;
    }



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

        if (tradingSessionSubIDLength > 0)
        {
            buffer.putBytes(position, tradingSessionSubIDHeader, 0, tradingSessionSubIDHeaderLength);
            position += tradingSessionSubIDHeaderLength;
            buffer.putBytes(position, tradingSessionSubID, tradingSessionSubIDOffset, tradingSessionSubIDLength);
            position += tradingSessionSubIDLength;
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
        return encoder;
    }

}
    private int noTradingSessionsGroupCounter;

    private boolean hasNoTradingSessionsGroupCounter;

    public boolean hasNoTradingSessionsGroupCounter()
    {
        return hasNoTradingSessionsGroupCounter;
    }

    public RequestForPositionsEncoder noTradingSessionsGroupCounter(int value)
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

    private final MutableDirectBuffer transactTime = new UnsafeBuffer();

    private int transactTimeOffset = 0;

    private int transactTimeLength = 0;

    public RequestForPositionsEncoder transactTime(final DirectBuffer value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public RequestForPositionsEncoder transactTime(final DirectBuffer value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public RequestForPositionsEncoder transactTime(final DirectBuffer value)
    {
        return transactTime(value, 0, value.capacity());
    }

    public RequestForPositionsEncoder transactTime(final byte[] value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public RequestForPositionsEncoder transactTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(transactTime, value, offset, length);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public RequestForPositionsEncoder transactTime(final byte[] value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public RequestForPositionsEncoder transactTime(final byte[] value)
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

    private int responseTransportType;

    private boolean hasResponseTransportType;

    public boolean hasResponseTransportType()
    {
        return hasResponseTransportType;
    }

    public RequestForPositionsEncoder responseTransportType(int value)
    {
        responseTransportType = value;
        hasResponseTransportType = true;
        return this;
    }

    public int responseTransportType()
    {
        return responseTransportType;
    }

    public RequestForPositionsEncoder responseTransportType(ResponseTransportType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == ResponseTransportType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: responseTransportType Value: " + value );
            }
            if (value == ResponseTransportType.NULL_VAL)
            {
                return this;
            }
        }
        return responseTransportType(value.representation());
    }

    private final MutableDirectBuffer responseDestination = new UnsafeBuffer();

    private int responseDestinationOffset = 0;

    private int responseDestinationLength = 0;

    public RequestForPositionsEncoder responseDestination(final DirectBuffer value, final int offset, final int length)
    {
        responseDestination.wrap(value);
        responseDestinationOffset = offset;
        responseDestinationLength = length;
        return this;
    }

    public RequestForPositionsEncoder responseDestination(final DirectBuffer value, final int length)
    {
        return responseDestination(value, 0, length);
    }

    public RequestForPositionsEncoder responseDestination(final DirectBuffer value)
    {
        return responseDestination(value, 0, value.capacity());
    }

    public RequestForPositionsEncoder responseDestination(final byte[] value, final int offset, final int length)
    {
        responseDestination.wrap(value);
        responseDestinationOffset = offset;
        responseDestinationLength = length;
        return this;
    }

    public RequestForPositionsEncoder responseDestinationAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(responseDestination, value, offset, length);
        responseDestinationOffset = offset;
        responseDestinationLength = length;
        return this;
    }

    public RequestForPositionsEncoder responseDestination(final byte[] value, final int length)
    {
        return responseDestination(value, 0, length);
    }

    public RequestForPositionsEncoder responseDestination(final byte[] value)
    {
        return responseDestination(value, 0, value.length);
    }

    public boolean hasResponseDestination()
    {
        return responseDestinationLength > 0;
    }

    public MutableDirectBuffer responseDestination()
    {
        return responseDestination;
    }

    public String responseDestinationAsString()
    {
        return responseDestination.getStringWithoutLengthAscii(responseDestinationOffset, responseDestinationLength);
    }

    public RequestForPositionsEncoder responseDestination(final CharSequence value)
    {
        toBytes(value, responseDestination);
        responseDestinationOffset = 0;
        responseDestinationLength = value.length();
        return this;
    }

    public RequestForPositionsEncoder responseDestination(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            responseDestination.wrap(buffer);
            responseDestinationOffset = value.offset();
            responseDestinationLength = value.length();
        }
        return this;
    }

    public RequestForPositionsEncoder responseDestination(final char[] value)
    {
        return responseDestination(value, 0, value.length);
    }

    public RequestForPositionsEncoder responseDestination(final char[] value, final int length)
    {
        return responseDestination(value, 0, length);
    }

    public RequestForPositionsEncoder responseDestination(final char[] value, final int offset, final int length)
    {
        toBytes(value, responseDestination, offset, length);
        responseDestinationOffset = 0;
        responseDestinationLength = length;
        return this;
    }

    private final MutableDirectBuffer text = new UnsafeBuffer();

    private int textOffset = 0;

    private int textLength = 0;

    public RequestForPositionsEncoder text(final DirectBuffer value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public RequestForPositionsEncoder text(final DirectBuffer value, final int length)
    {
        return text(value, 0, length);
    }

    public RequestForPositionsEncoder text(final DirectBuffer value)
    {
        return text(value, 0, value.capacity());
    }

    public RequestForPositionsEncoder text(final byte[] value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public RequestForPositionsEncoder textAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(text, value, offset, length);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public RequestForPositionsEncoder text(final byte[] value, final int length)
    {
        return text(value, 0, length);
    }

    public RequestForPositionsEncoder text(final byte[] value)
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

    public RequestForPositionsEncoder text(final CharSequence value)
    {
        toBytes(value, text);
        textOffset = 0;
        textLength = value.length();
        return this;
    }

    public RequestForPositionsEncoder text(final AsciiSequenceView value)
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

    public RequestForPositionsEncoder text(final char[] value)
    {
        return text(value, 0, value.length);
    }

    public RequestForPositionsEncoder text(final char[] value, final int length)
    {
        return text(value, 0, length);
    }

    public RequestForPositionsEncoder text(final char[] value, final int offset, final int length)
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

    public RequestForPositionsEncoder encodedTextLen(int value)
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

    public RequestForPositionsEncoder encodedText(byte[] value)
    {
        encodedText = value;
        hasEncodedText = true;
        return this;
    }

    public byte[] encodedText()
    {
        return encodedText;
    }

    public RequestForPositionsEncoder encodedTextAsCopy(final byte[] value, final int offset, final int length)
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

        if (posReqIDLength > 0)
        {
            buffer.putBytes(position, posReqIDHeader, 0, posReqIDHeaderLength);
            position += posReqIDHeaderLength;
            buffer.putBytes(position, posReqID, posReqIDOffset, posReqIDLength);
            position += posReqIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: PosReqID");
        }

        if (hasPosReqType)
        {
            buffer.putBytes(position, posReqTypeHeader, 0, posReqTypeHeaderLength);
            position += posReqTypeHeaderLength;
            position += buffer.putIntAscii(position, posReqType);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: PosReqType");
        }

        if (hasMatchStatus)
        {
            buffer.putBytes(position, matchStatusHeader, 0, matchStatusHeaderLength);
            position += matchStatusHeaderLength;
            position += buffer.putCharAscii(position, matchStatus);
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
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: Account");
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
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: AccountType");
        }

            position += instrument.encode(buffer, position);

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


        if (clearingBusinessDateLength > 0)
        {
            buffer.putBytes(position, clearingBusinessDateHeader, 0, clearingBusinessDateHeaderLength);
            position += clearingBusinessDateHeaderLength;
            buffer.putBytes(position, clearingBusinessDate, clearingBusinessDateOffset, clearingBusinessDateLength);
            position += clearingBusinessDateLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: ClearingBusinessDate");
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

        if (hasResponseTransportType)
        {
            buffer.putBytes(position, responseTransportTypeHeader, 0, responseTransportTypeHeaderLength);
            position += responseTransportTypeHeaderLength;
            position += buffer.putIntAscii(position, responseTransportType);
            buffer.putSeparator(position);
            position++;
        }

        if (responseDestinationLength > 0)
        {
            buffer.putBytes(position, responseDestinationHeader, 0, responseDestinationHeaderLength);
            position += responseDestinationHeaderLength;
            buffer.putBytes(position, responseDestination, responseDestinationOffset, responseDestinationLength);
            position += responseDestinationLength;
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
        this.resetPosReqID();
        this.resetPosReqType();
        this.resetMatchStatus();
        this.resetSubscriptionRequestType();
        this.resetAccount();
        this.resetAcctIDSource();
        this.resetAccountType();
        this.resetCurrency();
        this.resetClearingBusinessDate();
        this.resetSettlSessID();
        this.resetSettlSessSubID();
        this.resetTransactTime();
        this.resetResponseTransportType();
        this.resetResponseDestination();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        parties.reset();
        instrument.reset();
        this.resetLegsGroup();
        this.resetUnderlyingsGroup();
        this.resetTradingSessionsGroup();
    }

    public void resetPosReqID()
    {
        posReqIDLength = 0;
    }

    public void resetPosReqType()
    {
        hasPosReqType = false;
    }

    public void resetMatchStatus()
    {
        hasMatchStatus = false;
    }

    public void resetSubscriptionRequestType()
    {
        hasSubscriptionRequestType = false;
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

    public void resetCurrency()
    {
        currencyLength = 0;
    }

    public void resetClearingBusinessDate()
    {
        clearingBusinessDateLength = 0;
    }

    public void resetSettlSessID()
    {
        settlSessIDLength = 0;
    }

    public void resetSettlSessSubID()
    {
        settlSessSubIDLength = 0;
    }

    public void resetTransactTime()
    {
        transactTimeLength = 0;
    }

    public void resetResponseTransportType()
    {
        hasResponseTransportType = false;
    }

    public void resetResponseDestination()
    {
        responseDestinationLength = 0;
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
        builder.append("\"MessageName\": \"RequestForPositions\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasPosReqID())
        {
            indent(builder, level);
            builder.append("\"PosReqID\": \"");
            appendBuffer(builder, posReqID, posReqIDOffset, posReqIDLength);
            builder.append("\",\n");
        }

        if (hasPosReqType())
        {
            indent(builder, level);
            builder.append("\"PosReqType\": \"");
            builder.append(posReqType);
            builder.append("\",\n");
        }

        if (hasMatchStatus())
        {
            indent(builder, level);
            builder.append("\"MatchStatus\": \"");
            builder.append(matchStatus);
            builder.append("\",\n");
        }

        if (hasSubscriptionRequestType())
        {
            indent(builder, level);
            builder.append("\"SubscriptionRequestType\": \"");
            builder.append(subscriptionRequestType);
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

    indent(builder, level);
    builder.append("\"Instrument\": ");
    instrument.appendTo(builder, level + 1);
    builder.append("\n");

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

        if (hasClearingBusinessDate())
        {
            indent(builder, level);
            builder.append("\"ClearingBusinessDate\": \"");
            appendBuffer(builder, clearingBusinessDate, clearingBusinessDateOffset, clearingBusinessDateLength);
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

        if (hasTransactTime())
        {
            indent(builder, level);
            builder.append("\"TransactTime\": \"");
            appendBuffer(builder, transactTime, transactTimeOffset, transactTimeLength);
            builder.append("\",\n");
        }

        if (hasResponseTransportType())
        {
            indent(builder, level);
            builder.append("\"ResponseTransportType\": \"");
            builder.append(responseTransportType);
            builder.append("\",\n");
        }

        if (hasResponseDestination())
        {
            indent(builder, level);
            builder.append("\"ResponseDestination\": \"");
            appendBuffer(builder, responseDestination, responseDestinationOffset, responseDestinationLength);
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
    public RequestForPositionsEncoder copyTo(final Encoder encoder)
    {
        return copyTo((RequestForPositionsEncoder)encoder);
    }

    public RequestForPositionsEncoder copyTo(final RequestForPositionsEncoder encoder)
    {
        encoder.reset();
        if (hasPosReqID())
        {
            encoder.posReqIDAsCopy(posReqID.byteArray(), 0, posReqIDLength);
        }

        if (hasPosReqType())
        {
            encoder.posReqType(this.posReqType());
        }

        if (hasMatchStatus())
        {
            encoder.matchStatus(this.matchStatus());
        }

        if (hasSubscriptionRequestType())
        {
            encoder.subscriptionRequestType(this.subscriptionRequestType());
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


        instrument.copyTo(encoder.instrument());
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

        if (hasClearingBusinessDate())
        {
            encoder.clearingBusinessDateAsCopy(clearingBusinessDate.byteArray(), 0, clearingBusinessDateLength);
        }

        if (hasSettlSessID())
        {
            encoder.settlSessIDAsCopy(settlSessID.byteArray(), 0, settlSessIDLength);
        }

        if (hasSettlSessSubID())
        {
            encoder.settlSessSubIDAsCopy(settlSessSubID.byteArray(), 0, settlSessSubIDLength);
        }

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

        if (hasTransactTime())
        {
            encoder.transactTimeAsCopy(transactTime.byteArray(), 0, transactTimeLength);
        }

        if (hasResponseTransportType())
        {
            encoder.responseTransportType(this.responseTransportType());
        }

        if (hasResponseDestination())
        {
            encoder.responseDestinationAsCopy(responseDestination.byteArray(), 0, responseDestinationLength);
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
