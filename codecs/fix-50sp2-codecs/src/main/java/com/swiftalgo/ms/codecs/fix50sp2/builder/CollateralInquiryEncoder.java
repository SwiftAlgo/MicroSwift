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


public class CollateralInquiryEncoder implements Encoder
{
    public long messageType()
    {
        return 16962L;
    }

    public CollateralInquiryEncoder()
    {
        header.msgType("BB");
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

    private static final int collInquiryIDHeaderLength = 4;
    private static final byte[] collInquiryIDHeader = new byte[] {57, 48, 57, (byte) '='};

    private static final int subscriptionRequestTypeHeaderLength = 4;
    private static final byte[] subscriptionRequestTypeHeader = new byte[] {50, 54, 51, (byte) '='};

    private static final int responseTransportTypeHeaderLength = 4;
    private static final byte[] responseTransportTypeHeader = new byte[] {55, 50, 53, (byte) '='};

    private static final int responseDestinationHeaderLength = 4;
    private static final byte[] responseDestinationHeader = new byte[] {55, 50, 54, (byte) '='};

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

    private static final int settlDateHeaderLength = 3;
    private static final byte[] settlDateHeader = new byte[] {54, 52, (byte) '='};

    private static final int quantityHeaderLength = 3;
    private static final byte[] quantityHeader = new byte[] {53, 51, (byte) '='};

    private static final int qtyTypeHeaderLength = 4;
    private static final byte[] qtyTypeHeader = new byte[] {56, 53, 52, (byte) '='};

    private static final int currencyHeaderLength = 3;
    private static final byte[] currencyHeader = new byte[] {49, 53, (byte) '='};

    private static final int marginExcessHeaderLength = 4;
    private static final byte[] marginExcessHeader = new byte[] {56, 57, 57, (byte) '='};

    private static final int totalNetValueHeaderLength = 4;
    private static final byte[] totalNetValueHeader = new byte[] {57, 48, 48, (byte) '='};

    private static final int cashOutstandingHeaderLength = 4;
    private static final byte[] cashOutstandingHeader = new byte[] {57, 48, 49, (byte) '='};

    private static final int sideHeaderLength = 3;
    private static final byte[] sideHeader = new byte[] {53, 52, (byte) '='};

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

    private final MutableDirectBuffer collInquiryID = new UnsafeBuffer();

    private int collInquiryIDOffset = 0;

    private int collInquiryIDLength = 0;

    public CollateralInquiryEncoder collInquiryID(final DirectBuffer value, final int offset, final int length)
    {
        collInquiryID.wrap(value);
        collInquiryIDOffset = offset;
        collInquiryIDLength = length;
        return this;
    }

    public CollateralInquiryEncoder collInquiryID(final DirectBuffer value, final int length)
    {
        return collInquiryID(value, 0, length);
    }

    public CollateralInquiryEncoder collInquiryID(final DirectBuffer value)
    {
        return collInquiryID(value, 0, value.capacity());
    }

    public CollateralInquiryEncoder collInquiryID(final byte[] value, final int offset, final int length)
    {
        collInquiryID.wrap(value);
        collInquiryIDOffset = offset;
        collInquiryIDLength = length;
        return this;
    }

    public CollateralInquiryEncoder collInquiryIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(collInquiryID, value, offset, length);
        collInquiryIDOffset = offset;
        collInquiryIDLength = length;
        return this;
    }

    public CollateralInquiryEncoder collInquiryID(final byte[] value, final int length)
    {
        return collInquiryID(value, 0, length);
    }

    public CollateralInquiryEncoder collInquiryID(final byte[] value)
    {
        return collInquiryID(value, 0, value.length);
    }

    public boolean hasCollInquiryID()
    {
        return collInquiryIDLength > 0;
    }

    public MutableDirectBuffer collInquiryID()
    {
        return collInquiryID;
    }

    public String collInquiryIDAsString()
    {
        return collInquiryID.getStringWithoutLengthAscii(collInquiryIDOffset, collInquiryIDLength);
    }

    public CollateralInquiryEncoder collInquiryID(final CharSequence value)
    {
        toBytes(value, collInquiryID);
        collInquiryIDOffset = 0;
        collInquiryIDLength = value.length();
        return this;
    }

    public CollateralInquiryEncoder collInquiryID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            collInquiryID.wrap(buffer);
            collInquiryIDOffset = value.offset();
            collInquiryIDLength = value.length();
        }
        return this;
    }

    public CollateralInquiryEncoder collInquiryID(final char[] value)
    {
        return collInquiryID(value, 0, value.length);
    }

    public CollateralInquiryEncoder collInquiryID(final char[] value, final int length)
    {
        return collInquiryID(value, 0, length);
    }

    public CollateralInquiryEncoder collInquiryID(final char[] value, final int offset, final int length)
    {
        toBytes(value, collInquiryID, offset, length);
        collInquiryIDOffset = 0;
        collInquiryIDLength = length;
        return this;
    }

    private final CollInqQualGrpEncoder collInqQualGrp = new CollInqQualGrpEncoder();
    public CollInqQualGrpEncoder collInqQualGrp()
    {
        return collInqQualGrp;
    }

    private char subscriptionRequestType;

    private boolean hasSubscriptionRequestType;

    public boolean hasSubscriptionRequestType()
    {
        return hasSubscriptionRequestType;
    }

    public CollateralInquiryEncoder subscriptionRequestType(char value)
    {
        subscriptionRequestType = value;
        hasSubscriptionRequestType = true;
        return this;
    }

    public char subscriptionRequestType()
    {
        return subscriptionRequestType;
    }

    public CollateralInquiryEncoder subscriptionRequestType(SubscriptionRequestType value)
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

    private int responseTransportType;

    private boolean hasResponseTransportType;

    public boolean hasResponseTransportType()
    {
        return hasResponseTransportType;
    }

    public CollateralInquiryEncoder responseTransportType(int value)
    {
        responseTransportType = value;
        hasResponseTransportType = true;
        return this;
    }

    public int responseTransportType()
    {
        return responseTransportType;
    }

    public CollateralInquiryEncoder responseTransportType(ResponseTransportType value)
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

    public CollateralInquiryEncoder responseDestination(final DirectBuffer value, final int offset, final int length)
    {
        responseDestination.wrap(value);
        responseDestinationOffset = offset;
        responseDestinationLength = length;
        return this;
    }

    public CollateralInquiryEncoder responseDestination(final DirectBuffer value, final int length)
    {
        return responseDestination(value, 0, length);
    }

    public CollateralInquiryEncoder responseDestination(final DirectBuffer value)
    {
        return responseDestination(value, 0, value.capacity());
    }

    public CollateralInquiryEncoder responseDestination(final byte[] value, final int offset, final int length)
    {
        responseDestination.wrap(value);
        responseDestinationOffset = offset;
        responseDestinationLength = length;
        return this;
    }

    public CollateralInquiryEncoder responseDestinationAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(responseDestination, value, offset, length);
        responseDestinationOffset = offset;
        responseDestinationLength = length;
        return this;
    }

    public CollateralInquiryEncoder responseDestination(final byte[] value, final int length)
    {
        return responseDestination(value, 0, length);
    }

    public CollateralInquiryEncoder responseDestination(final byte[] value)
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

    public CollateralInquiryEncoder responseDestination(final CharSequence value)
    {
        toBytes(value, responseDestination);
        responseDestinationOffset = 0;
        responseDestinationLength = value.length();
        return this;
    }

    public CollateralInquiryEncoder responseDestination(final AsciiSequenceView value)
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

    public CollateralInquiryEncoder responseDestination(final char[] value)
    {
        return responseDestination(value, 0, value.length);
    }

    public CollateralInquiryEncoder responseDestination(final char[] value, final int length)
    {
        return responseDestination(value, 0, length);
    }

    public CollateralInquiryEncoder responseDestination(final char[] value, final int offset, final int length)
    {
        toBytes(value, responseDestination, offset, length);
        responseDestinationOffset = 0;
        responseDestinationLength = length;
        return this;
    }

    private final PartiesEncoder parties = new PartiesEncoder();
    public PartiesEncoder parties()
    {
        return parties;
    }

    private final MutableDirectBuffer account = new UnsafeBuffer();

    private int accountOffset = 0;

    private int accountLength = 0;

    public CollateralInquiryEncoder account(final DirectBuffer value, final int offset, final int length)
    {
        account.wrap(value);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    public CollateralInquiryEncoder account(final DirectBuffer value, final int length)
    {
        return account(value, 0, length);
    }

    public CollateralInquiryEncoder account(final DirectBuffer value)
    {
        return account(value, 0, value.capacity());
    }

    public CollateralInquiryEncoder account(final byte[] value, final int offset, final int length)
    {
        account.wrap(value);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    public CollateralInquiryEncoder accountAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(account, value, offset, length);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    public CollateralInquiryEncoder account(final byte[] value, final int length)
    {
        return account(value, 0, length);
    }

    public CollateralInquiryEncoder account(final byte[] value)
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

    public CollateralInquiryEncoder account(final CharSequence value)
    {
        toBytes(value, account);
        accountOffset = 0;
        accountLength = value.length();
        return this;
    }

    public CollateralInquiryEncoder account(final AsciiSequenceView value)
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

    public CollateralInquiryEncoder account(final char[] value)
    {
        return account(value, 0, value.length);
    }

    public CollateralInquiryEncoder account(final char[] value, final int length)
    {
        return account(value, 0, length);
    }

    public CollateralInquiryEncoder account(final char[] value, final int offset, final int length)
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

    public CollateralInquiryEncoder accountType(int value)
    {
        accountType = value;
        hasAccountType = true;
        return this;
    }

    public int accountType()
    {
        return accountType;
    }

    public CollateralInquiryEncoder accountType(AccountType value)
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

    public CollateralInquiryEncoder clOrdID(final DirectBuffer value, final int offset, final int length)
    {
        clOrdID.wrap(value);
        clOrdIDOffset = offset;
        clOrdIDLength = length;
        return this;
    }

    public CollateralInquiryEncoder clOrdID(final DirectBuffer value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    public CollateralInquiryEncoder clOrdID(final DirectBuffer value)
    {
        return clOrdID(value, 0, value.capacity());
    }

    public CollateralInquiryEncoder clOrdID(final byte[] value, final int offset, final int length)
    {
        clOrdID.wrap(value);
        clOrdIDOffset = offset;
        clOrdIDLength = length;
        return this;
    }

    public CollateralInquiryEncoder clOrdIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(clOrdID, value, offset, length);
        clOrdIDOffset = offset;
        clOrdIDLength = length;
        return this;
    }

    public CollateralInquiryEncoder clOrdID(final byte[] value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    public CollateralInquiryEncoder clOrdID(final byte[] value)
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

    public CollateralInquiryEncoder clOrdID(final CharSequence value)
    {
        toBytes(value, clOrdID);
        clOrdIDOffset = 0;
        clOrdIDLength = value.length();
        return this;
    }

    public CollateralInquiryEncoder clOrdID(final AsciiSequenceView value)
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

    public CollateralInquiryEncoder clOrdID(final char[] value)
    {
        return clOrdID(value, 0, value.length);
    }

    public CollateralInquiryEncoder clOrdID(final char[] value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    public CollateralInquiryEncoder clOrdID(final char[] value, final int offset, final int length)
    {
        toBytes(value, clOrdID, offset, length);
        clOrdIDOffset = 0;
        clOrdIDLength = length;
        return this;
    }

    private final MutableDirectBuffer orderID = new UnsafeBuffer();

    private int orderIDOffset = 0;

    private int orderIDLength = 0;

    public CollateralInquiryEncoder orderID(final DirectBuffer value, final int offset, final int length)
    {
        orderID.wrap(value);
        orderIDOffset = offset;
        orderIDLength = length;
        return this;
    }

    public CollateralInquiryEncoder orderID(final DirectBuffer value, final int length)
    {
        return orderID(value, 0, length);
    }

    public CollateralInquiryEncoder orderID(final DirectBuffer value)
    {
        return orderID(value, 0, value.capacity());
    }

    public CollateralInquiryEncoder orderID(final byte[] value, final int offset, final int length)
    {
        orderID.wrap(value);
        orderIDOffset = offset;
        orderIDLength = length;
        return this;
    }

    public CollateralInquiryEncoder orderIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(orderID, value, offset, length);
        orderIDOffset = offset;
        orderIDLength = length;
        return this;
    }

    public CollateralInquiryEncoder orderID(final byte[] value, final int length)
    {
        return orderID(value, 0, length);
    }

    public CollateralInquiryEncoder orderID(final byte[] value)
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

    public CollateralInquiryEncoder orderID(final CharSequence value)
    {
        toBytes(value, orderID);
        orderIDOffset = 0;
        orderIDLength = value.length();
        return this;
    }

    public CollateralInquiryEncoder orderID(final AsciiSequenceView value)
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

    public CollateralInquiryEncoder orderID(final char[] value)
    {
        return orderID(value, 0, value.length);
    }

    public CollateralInquiryEncoder orderID(final char[] value, final int length)
    {
        return orderID(value, 0, length);
    }

    public CollateralInquiryEncoder orderID(final char[] value, final int offset, final int length)
    {
        toBytes(value, orderID, offset, length);
        orderIDOffset = 0;
        orderIDLength = length;
        return this;
    }

    private final MutableDirectBuffer secondaryOrderID = new UnsafeBuffer();

    private int secondaryOrderIDOffset = 0;

    private int secondaryOrderIDLength = 0;

    public CollateralInquiryEncoder secondaryOrderID(final DirectBuffer value, final int offset, final int length)
    {
        secondaryOrderID.wrap(value);
        secondaryOrderIDOffset = offset;
        secondaryOrderIDLength = length;
        return this;
    }

    public CollateralInquiryEncoder secondaryOrderID(final DirectBuffer value, final int length)
    {
        return secondaryOrderID(value, 0, length);
    }

    public CollateralInquiryEncoder secondaryOrderID(final DirectBuffer value)
    {
        return secondaryOrderID(value, 0, value.capacity());
    }

    public CollateralInquiryEncoder secondaryOrderID(final byte[] value, final int offset, final int length)
    {
        secondaryOrderID.wrap(value);
        secondaryOrderIDOffset = offset;
        secondaryOrderIDLength = length;
        return this;
    }

    public CollateralInquiryEncoder secondaryOrderIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(secondaryOrderID, value, offset, length);
        secondaryOrderIDOffset = offset;
        secondaryOrderIDLength = length;
        return this;
    }

    public CollateralInquiryEncoder secondaryOrderID(final byte[] value, final int length)
    {
        return secondaryOrderID(value, 0, length);
    }

    public CollateralInquiryEncoder secondaryOrderID(final byte[] value)
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

    public CollateralInquiryEncoder secondaryOrderID(final CharSequence value)
    {
        toBytes(value, secondaryOrderID);
        secondaryOrderIDOffset = 0;
        secondaryOrderIDLength = value.length();
        return this;
    }

    public CollateralInquiryEncoder secondaryOrderID(final AsciiSequenceView value)
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

    public CollateralInquiryEncoder secondaryOrderID(final char[] value)
    {
        return secondaryOrderID(value, 0, value.length);
    }

    public CollateralInquiryEncoder secondaryOrderID(final char[] value, final int length)
    {
        return secondaryOrderID(value, 0, length);
    }

    public CollateralInquiryEncoder secondaryOrderID(final char[] value, final int offset, final int length)
    {
        toBytes(value, secondaryOrderID, offset, length);
        secondaryOrderIDOffset = 0;
        secondaryOrderIDLength = length;
        return this;
    }

    private final MutableDirectBuffer secondaryClOrdID = new UnsafeBuffer();

    private int secondaryClOrdIDOffset = 0;

    private int secondaryClOrdIDLength = 0;

    public CollateralInquiryEncoder secondaryClOrdID(final DirectBuffer value, final int offset, final int length)
    {
        secondaryClOrdID.wrap(value);
        secondaryClOrdIDOffset = offset;
        secondaryClOrdIDLength = length;
        return this;
    }

    public CollateralInquiryEncoder secondaryClOrdID(final DirectBuffer value, final int length)
    {
        return secondaryClOrdID(value, 0, length);
    }

    public CollateralInquiryEncoder secondaryClOrdID(final DirectBuffer value)
    {
        return secondaryClOrdID(value, 0, value.capacity());
    }

    public CollateralInquiryEncoder secondaryClOrdID(final byte[] value, final int offset, final int length)
    {
        secondaryClOrdID.wrap(value);
        secondaryClOrdIDOffset = offset;
        secondaryClOrdIDLength = length;
        return this;
    }

    public CollateralInquiryEncoder secondaryClOrdIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(secondaryClOrdID, value, offset, length);
        secondaryClOrdIDOffset = offset;
        secondaryClOrdIDLength = length;
        return this;
    }

    public CollateralInquiryEncoder secondaryClOrdID(final byte[] value, final int length)
    {
        return secondaryClOrdID(value, 0, length);
    }

    public CollateralInquiryEncoder secondaryClOrdID(final byte[] value)
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

    public CollateralInquiryEncoder secondaryClOrdID(final CharSequence value)
    {
        toBytes(value, secondaryClOrdID);
        secondaryClOrdIDOffset = 0;
        secondaryClOrdIDLength = value.length();
        return this;
    }

    public CollateralInquiryEncoder secondaryClOrdID(final AsciiSequenceView value)
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

    public CollateralInquiryEncoder secondaryClOrdID(final char[] value)
    {
        return secondaryClOrdID(value, 0, value.length);
    }

    public CollateralInquiryEncoder secondaryClOrdID(final char[] value, final int length)
    {
        return secondaryClOrdID(value, 0, length);
    }

    public CollateralInquiryEncoder secondaryClOrdID(final char[] value, final int offset, final int length)
    {
        toBytes(value, secondaryClOrdID, offset, length);
        secondaryClOrdIDOffset = 0;
        secondaryClOrdIDLength = length;
        return this;
    }

    private final ExecCollGrpEncoder execCollGrp = new ExecCollGrpEncoder();
    public ExecCollGrpEncoder execCollGrp()
    {
        return execCollGrp;
    }

    private final TrdCollGrpEncoder trdCollGrp = new TrdCollGrpEncoder();
    public TrdCollGrpEncoder trdCollGrp()
    {
        return trdCollGrp;
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

    public CollateralInquiryEncoder settlDate(final DirectBuffer value, final int offset, final int length)
    {
        settlDate.wrap(value);
        settlDateOffset = offset;
        settlDateLength = length;
        return this;
    }

    public CollateralInquiryEncoder settlDate(final DirectBuffer value, final int length)
    {
        return settlDate(value, 0, length);
    }

    public CollateralInquiryEncoder settlDate(final DirectBuffer value)
    {
        return settlDate(value, 0, value.capacity());
    }

    public CollateralInquiryEncoder settlDate(final byte[] value, final int offset, final int length)
    {
        settlDate.wrap(value);
        settlDateOffset = offset;
        settlDateLength = length;
        return this;
    }

    public CollateralInquiryEncoder settlDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlDate, value, offset, length);
        settlDateOffset = offset;
        settlDateLength = length;
        return this;
    }

    public CollateralInquiryEncoder settlDate(final byte[] value, final int length)
    {
        return settlDate(value, 0, length);
    }

    public CollateralInquiryEncoder settlDate(final byte[] value)
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

    public CollateralInquiryEncoder quantity(DecimalFloat value)
    {
        quantity.set(value);
        hasQuantity = true;
        return this;
    }

    public CollateralInquiryEncoder quantity(long value, int scale)
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

    public CollateralInquiryEncoder qtyType(int value)
    {
        qtyType = value;
        hasQtyType = true;
        return this;
    }

    public int qtyType()
    {
        return qtyType;
    }

    public CollateralInquiryEncoder qtyType(QtyType value)
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

    public CollateralInquiryEncoder currency(final DirectBuffer value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public CollateralInquiryEncoder currency(final DirectBuffer value, final int length)
    {
        return currency(value, 0, length);
    }

    public CollateralInquiryEncoder currency(final DirectBuffer value)
    {
        return currency(value, 0, value.capacity());
    }

    public CollateralInquiryEncoder currency(final byte[] value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public CollateralInquiryEncoder currencyAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(currency, value, offset, length);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public CollateralInquiryEncoder currency(final byte[] value, final int length)
    {
        return currency(value, 0, length);
    }

    public CollateralInquiryEncoder currency(final byte[] value)
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

    public CollateralInquiryEncoder currency(final CharSequence value)
    {
        toBytes(value, currency);
        currencyOffset = 0;
        currencyLength = value.length();
        return this;
    }

    public CollateralInquiryEncoder currency(final AsciiSequenceView value)
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

    public CollateralInquiryEncoder currency(final char[] value)
    {
        return currency(value, 0, value.length);
    }

    public CollateralInquiryEncoder currency(final char[] value, final int length)
    {
        return currency(value, 0, length);
    }

    public CollateralInquiryEncoder currency(final char[] value, final int offset, final int length)
    {
        toBytes(value, currency, offset, length);
        currencyOffset = 0;
        currencyLength = length;
        return this;
    }

    private final InstrmtLegGrpEncoder instrmtLegGrp = new InstrmtLegGrpEncoder();
    public InstrmtLegGrpEncoder instrmtLegGrp()
    {
        return instrmtLegGrp;
    }

    private final UndInstrmtGrpEncoder undInstrmtGrp = new UndInstrmtGrpEncoder();
    public UndInstrmtGrpEncoder undInstrmtGrp()
    {
        return undInstrmtGrp;
    }

    private final DecimalFloat marginExcess = new DecimalFloat();

    private boolean hasMarginExcess;

    public boolean hasMarginExcess()
    {
        return hasMarginExcess;
    }

    public CollateralInquiryEncoder marginExcess(DecimalFloat value)
    {
        marginExcess.set(value);
        hasMarginExcess = true;
        return this;
    }

    public CollateralInquiryEncoder marginExcess(long value, int scale)
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

    public CollateralInquiryEncoder totalNetValue(DecimalFloat value)
    {
        totalNetValue.set(value);
        hasTotalNetValue = true;
        return this;
    }

    public CollateralInquiryEncoder totalNetValue(long value, int scale)
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

    public CollateralInquiryEncoder cashOutstanding(DecimalFloat value)
    {
        cashOutstanding.set(value);
        hasCashOutstanding = true;
        return this;
    }

    public CollateralInquiryEncoder cashOutstanding(long value, int scale)
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

    public CollateralInquiryEncoder side(char value)
    {
        side = value;
        hasSide = true;
        return this;
    }

    public char side()
    {
        return side;
    }

    public CollateralInquiryEncoder side(Side value)
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

    private final DecimalFloat price = new DecimalFloat();

    private boolean hasPrice;

    public boolean hasPrice()
    {
        return hasPrice;
    }

    public CollateralInquiryEncoder price(DecimalFloat value)
    {
        price.set(value);
        hasPrice = true;
        return this;
    }

    public CollateralInquiryEncoder price(long value, int scale)
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

    public CollateralInquiryEncoder priceType(int value)
    {
        priceType = value;
        hasPriceType = true;
        return this;
    }

    public int priceType()
    {
        return priceType;
    }

    public CollateralInquiryEncoder priceType(PriceType value)
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

    public CollateralInquiryEncoder accruedInterestAmt(DecimalFloat value)
    {
        accruedInterestAmt.set(value);
        hasAccruedInterestAmt = true;
        return this;
    }

    public CollateralInquiryEncoder accruedInterestAmt(long value, int scale)
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

    public CollateralInquiryEncoder endAccruedInterestAmt(DecimalFloat value)
    {
        endAccruedInterestAmt.set(value);
        hasEndAccruedInterestAmt = true;
        return this;
    }

    public CollateralInquiryEncoder endAccruedInterestAmt(long value, int scale)
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

    public CollateralInquiryEncoder startCash(DecimalFloat value)
    {
        startCash.set(value);
        hasStartCash = true;
        return this;
    }

    public CollateralInquiryEncoder startCash(long value, int scale)
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

    public CollateralInquiryEncoder endCash(DecimalFloat value)
    {
        endCash.set(value);
        hasEndCash = true;
        return this;
    }

    public CollateralInquiryEncoder endCash(long value, int scale)
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

    public CollateralInquiryEncoder tradingSessionID(final DirectBuffer value, final int offset, final int length)
    {
        tradingSessionID.wrap(value);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public CollateralInquiryEncoder tradingSessionID(final DirectBuffer value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public CollateralInquiryEncoder tradingSessionID(final DirectBuffer value)
    {
        return tradingSessionID(value, 0, value.capacity());
    }

    public CollateralInquiryEncoder tradingSessionID(final byte[] value, final int offset, final int length)
    {
        tradingSessionID.wrap(value);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public CollateralInquiryEncoder tradingSessionIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradingSessionID, value, offset, length);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public CollateralInquiryEncoder tradingSessionID(final byte[] value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public CollateralInquiryEncoder tradingSessionID(final byte[] value)
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

    public CollateralInquiryEncoder tradingSessionID(final CharSequence value)
    {
        toBytes(value, tradingSessionID);
        tradingSessionIDOffset = 0;
        tradingSessionIDLength = value.length();
        return this;
    }

    public CollateralInquiryEncoder tradingSessionID(final AsciiSequenceView value)
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

    public CollateralInquiryEncoder tradingSessionID(final char[] value)
    {
        return tradingSessionID(value, 0, value.length);
    }

    public CollateralInquiryEncoder tradingSessionID(final char[] value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public CollateralInquiryEncoder tradingSessionID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradingSessionID, offset, length);
        tradingSessionIDOffset = 0;
        tradingSessionIDLength = length;
        return this;
    }

    public CollateralInquiryEncoder tradingSessionID(TradingSessionID value)
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

    public CollateralInquiryEncoder tradingSessionSubID(final DirectBuffer value, final int offset, final int length)
    {
        tradingSessionSubID.wrap(value);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public CollateralInquiryEncoder tradingSessionSubID(final DirectBuffer value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public CollateralInquiryEncoder tradingSessionSubID(final DirectBuffer value)
    {
        return tradingSessionSubID(value, 0, value.capacity());
    }

    public CollateralInquiryEncoder tradingSessionSubID(final byte[] value, final int offset, final int length)
    {
        tradingSessionSubID.wrap(value);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public CollateralInquiryEncoder tradingSessionSubIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradingSessionSubID, value, offset, length);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public CollateralInquiryEncoder tradingSessionSubID(final byte[] value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public CollateralInquiryEncoder tradingSessionSubID(final byte[] value)
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

    public CollateralInquiryEncoder tradingSessionSubID(final CharSequence value)
    {
        toBytes(value, tradingSessionSubID);
        tradingSessionSubIDOffset = 0;
        tradingSessionSubIDLength = value.length();
        return this;
    }

    public CollateralInquiryEncoder tradingSessionSubID(final AsciiSequenceView value)
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

    public CollateralInquiryEncoder tradingSessionSubID(final char[] value)
    {
        return tradingSessionSubID(value, 0, value.length);
    }

    public CollateralInquiryEncoder tradingSessionSubID(final char[] value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public CollateralInquiryEncoder tradingSessionSubID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradingSessionSubID, offset, length);
        tradingSessionSubIDOffset = 0;
        tradingSessionSubIDLength = length;
        return this;
    }

    public CollateralInquiryEncoder tradingSessionSubID(TradingSessionSubID value)
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

    private final MutableDirectBuffer settlSessID = new UnsafeBuffer();

    private int settlSessIDOffset = 0;

    private int settlSessIDLength = 0;

    public CollateralInquiryEncoder settlSessID(final DirectBuffer value, final int offset, final int length)
    {
        settlSessID.wrap(value);
        settlSessIDOffset = offset;
        settlSessIDLength = length;
        return this;
    }

    public CollateralInquiryEncoder settlSessID(final DirectBuffer value, final int length)
    {
        return settlSessID(value, 0, length);
    }

    public CollateralInquiryEncoder settlSessID(final DirectBuffer value)
    {
        return settlSessID(value, 0, value.capacity());
    }

    public CollateralInquiryEncoder settlSessID(final byte[] value, final int offset, final int length)
    {
        settlSessID.wrap(value);
        settlSessIDOffset = offset;
        settlSessIDLength = length;
        return this;
    }

    public CollateralInquiryEncoder settlSessIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlSessID, value, offset, length);
        settlSessIDOffset = offset;
        settlSessIDLength = length;
        return this;
    }

    public CollateralInquiryEncoder settlSessID(final byte[] value, final int length)
    {
        return settlSessID(value, 0, length);
    }

    public CollateralInquiryEncoder settlSessID(final byte[] value)
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

    public CollateralInquiryEncoder settlSessID(final CharSequence value)
    {
        toBytes(value, settlSessID);
        settlSessIDOffset = 0;
        settlSessIDLength = value.length();
        return this;
    }

    public CollateralInquiryEncoder settlSessID(final AsciiSequenceView value)
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

    public CollateralInquiryEncoder settlSessID(final char[] value)
    {
        return settlSessID(value, 0, value.length);
    }

    public CollateralInquiryEncoder settlSessID(final char[] value, final int length)
    {
        return settlSessID(value, 0, length);
    }

    public CollateralInquiryEncoder settlSessID(final char[] value, final int offset, final int length)
    {
        toBytes(value, settlSessID, offset, length);
        settlSessIDOffset = 0;
        settlSessIDLength = length;
        return this;
    }

    public CollateralInquiryEncoder settlSessID(SettlSessID value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == SettlSessID.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: settlSessID Value: " + value );
            }
            if (value == SettlSessID.NULL_VAL)
            {
                return this;
            }
        }
        return settlSessID(value.representation());
    }

    private final MutableDirectBuffer settlSessSubID = new UnsafeBuffer();

    private int settlSessSubIDOffset = 0;

    private int settlSessSubIDLength = 0;

    public CollateralInquiryEncoder settlSessSubID(final DirectBuffer value, final int offset, final int length)
    {
        settlSessSubID.wrap(value);
        settlSessSubIDOffset = offset;
        settlSessSubIDLength = length;
        return this;
    }

    public CollateralInquiryEncoder settlSessSubID(final DirectBuffer value, final int length)
    {
        return settlSessSubID(value, 0, length);
    }

    public CollateralInquiryEncoder settlSessSubID(final DirectBuffer value)
    {
        return settlSessSubID(value, 0, value.capacity());
    }

    public CollateralInquiryEncoder settlSessSubID(final byte[] value, final int offset, final int length)
    {
        settlSessSubID.wrap(value);
        settlSessSubIDOffset = offset;
        settlSessSubIDLength = length;
        return this;
    }

    public CollateralInquiryEncoder settlSessSubIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlSessSubID, value, offset, length);
        settlSessSubIDOffset = offset;
        settlSessSubIDLength = length;
        return this;
    }

    public CollateralInquiryEncoder settlSessSubID(final byte[] value, final int length)
    {
        return settlSessSubID(value, 0, length);
    }

    public CollateralInquiryEncoder settlSessSubID(final byte[] value)
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

    public CollateralInquiryEncoder settlSessSubID(final CharSequence value)
    {
        toBytes(value, settlSessSubID);
        settlSessSubIDOffset = 0;
        settlSessSubIDLength = value.length();
        return this;
    }

    public CollateralInquiryEncoder settlSessSubID(final AsciiSequenceView value)
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

    public CollateralInquiryEncoder settlSessSubID(final char[] value)
    {
        return settlSessSubID(value, 0, value.length);
    }

    public CollateralInquiryEncoder settlSessSubID(final char[] value, final int length)
    {
        return settlSessSubID(value, 0, length);
    }

    public CollateralInquiryEncoder settlSessSubID(final char[] value, final int offset, final int length)
    {
        toBytes(value, settlSessSubID, offset, length);
        settlSessSubIDOffset = 0;
        settlSessSubIDLength = length;
        return this;
    }

    private final MutableDirectBuffer clearingBusinessDate = new UnsafeBuffer();

    private int clearingBusinessDateOffset = 0;

    private int clearingBusinessDateLength = 0;

    public CollateralInquiryEncoder clearingBusinessDate(final DirectBuffer value, final int offset, final int length)
    {
        clearingBusinessDate.wrap(value);
        clearingBusinessDateOffset = offset;
        clearingBusinessDateLength = length;
        return this;
    }

    public CollateralInquiryEncoder clearingBusinessDate(final DirectBuffer value, final int length)
    {
        return clearingBusinessDate(value, 0, length);
    }

    public CollateralInquiryEncoder clearingBusinessDate(final DirectBuffer value)
    {
        return clearingBusinessDate(value, 0, value.capacity());
    }

    public CollateralInquiryEncoder clearingBusinessDate(final byte[] value, final int offset, final int length)
    {
        clearingBusinessDate.wrap(value);
        clearingBusinessDateOffset = offset;
        clearingBusinessDateLength = length;
        return this;
    }

    public CollateralInquiryEncoder clearingBusinessDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(clearingBusinessDate, value, offset, length);
        clearingBusinessDateOffset = offset;
        clearingBusinessDateLength = length;
        return this;
    }

    public CollateralInquiryEncoder clearingBusinessDate(final byte[] value, final int length)
    {
        return clearingBusinessDate(value, 0, length);
    }

    public CollateralInquiryEncoder clearingBusinessDate(final byte[] value)
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

    public CollateralInquiryEncoder text(final DirectBuffer value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public CollateralInquiryEncoder text(final DirectBuffer value, final int length)
    {
        return text(value, 0, length);
    }

    public CollateralInquiryEncoder text(final DirectBuffer value)
    {
        return text(value, 0, value.capacity());
    }

    public CollateralInquiryEncoder text(final byte[] value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public CollateralInquiryEncoder textAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(text, value, offset, length);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public CollateralInquiryEncoder text(final byte[] value, final int length)
    {
        return text(value, 0, length);
    }

    public CollateralInquiryEncoder text(final byte[] value)
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

    public CollateralInquiryEncoder text(final CharSequence value)
    {
        toBytes(value, text);
        textOffset = 0;
        textLength = value.length();
        return this;
    }

    public CollateralInquiryEncoder text(final AsciiSequenceView value)
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

    public CollateralInquiryEncoder text(final char[] value)
    {
        return text(value, 0, value.length);
    }

    public CollateralInquiryEncoder text(final char[] value, final int length)
    {
        return text(value, 0, length);
    }

    public CollateralInquiryEncoder text(final char[] value, final int offset, final int length)
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

    public CollateralInquiryEncoder encodedTextLen(int value)
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

    public CollateralInquiryEncoder encodedText(byte[] value)
    {
        encodedText = value;
        hasEncodedText = true;
        return this;
    }

    public byte[] encodedText()
    {
        return encodedText;
    }

    public CollateralInquiryEncoder encodedTextAsCopy(final byte[] value, final int offset, final int length)
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

        if (collInquiryIDLength > 0)
        {
            buffer.putBytes(position, collInquiryIDHeader, 0, collInquiryIDHeaderLength);
            position += collInquiryIDHeaderLength;
            buffer.putBytes(position, collInquiryID, collInquiryIDOffset, collInquiryIDLength);
            position += collInquiryIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: CollInquiryID");
        }

            position += collInqQualGrp.encode(buffer, position);

        if (hasSubscriptionRequestType)
        {
            buffer.putBytes(position, subscriptionRequestTypeHeader, 0, subscriptionRequestTypeHeaderLength);
            position += subscriptionRequestTypeHeaderLength;
            position += buffer.putCharAscii(position, subscriptionRequestType);
            buffer.putSeparator(position);
            position++;
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

            position += execCollGrp.encode(buffer, position);

            position += trdCollGrp.encode(buffer, position);

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

            position += instrmtLegGrp.encode(buffer, position);

            position += undInstrmtGrp.encode(buffer, position);

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
        this.resetCollInquiryID();
        this.resetSubscriptionRequestType();
        this.resetResponseTransportType();
        this.resetResponseDestination();
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
        collInqQualGrp.reset();
        parties.reset();
        execCollGrp.reset();
        trdCollGrp.reset();
        instrument.reset();
        financingDetails.reset();
        instrmtLegGrp.reset();
        undInstrmtGrp.reset();
        trdRegTimestamps.reset();
        spreadOrBenchmarkCurveData.reset();
        stipulations.reset();
        settlInstructionsData.reset();
    }

    public void resetCollInquiryID()
    {
        collInquiryIDLength = 0;
    }

    public void resetSubscriptionRequestType()
    {
        hasSubscriptionRequestType = false;
    }

    public void resetResponseTransportType()
    {
        hasResponseTransportType = false;
    }

    public void resetResponseDestination()
    {
        responseDestinationLength = 0;
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
        builder.append("\"MessageName\": \"CollateralInquiry\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasCollInquiryID())
        {
            indent(builder, level);
            builder.append("\"CollInquiryID\": \"");
            appendBuffer(builder, collInquiryID, collInquiryIDOffset, collInquiryIDLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"CollInqQualGrp\": ");
    collInqQualGrp.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasSubscriptionRequestType())
        {
            indent(builder, level);
            builder.append("\"SubscriptionRequestType\": \"");
            builder.append(subscriptionRequestType);
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

    indent(builder, level);
    builder.append("\"ExecCollGrp\": ");
    execCollGrp.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"TrdCollGrp\": ");
    trdCollGrp.appendTo(builder, level + 1);
    builder.append("\n");

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

    indent(builder, level);
    builder.append("\"InstrmtLegGrp\": ");
    instrmtLegGrp.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"UndInstrmtGrp\": ");
    undInstrmtGrp.appendTo(builder, level + 1);
    builder.append("\n");

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
    public CollateralInquiryEncoder copyTo(final Encoder encoder)
    {
        return copyTo((CollateralInquiryEncoder)encoder);
    }

    public CollateralInquiryEncoder copyTo(final CollateralInquiryEncoder encoder)
    {
        encoder.reset();
        if (hasCollInquiryID())
        {
            encoder.collInquiryIDAsCopy(collInquiryID.byteArray(), 0, collInquiryIDLength);
        }


        collInqQualGrp.copyTo(encoder.collInqQualGrp());
        if (hasSubscriptionRequestType())
        {
            encoder.subscriptionRequestType(this.subscriptionRequestType());
        }

        if (hasResponseTransportType())
        {
            encoder.responseTransportType(this.responseTransportType());
        }

        if (hasResponseDestination())
        {
            encoder.responseDestinationAsCopy(responseDestination.byteArray(), 0, responseDestinationLength);
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


        execCollGrp.copyTo(encoder.execCollGrp());

        trdCollGrp.copyTo(encoder.trdCollGrp());

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


        instrmtLegGrp.copyTo(encoder.instrmtLegGrp());

        undInstrmtGrp.copyTo(encoder.undInstrmtGrp());
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
