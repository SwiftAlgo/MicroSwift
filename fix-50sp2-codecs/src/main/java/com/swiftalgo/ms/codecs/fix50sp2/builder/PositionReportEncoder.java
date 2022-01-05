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


public class PositionReportEncoder implements Encoder
{
    public long messageType()
    {
        return 20545L;
    }

    public PositionReportEncoder()
    {
        header.msgType("AP");
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

    private static final int posMaintRptIDHeaderLength = 4;
    private static final byte[] posMaintRptIDHeader = new byte[] {55, 50, 49, (byte) '='};

    private static final int posReqIDHeaderLength = 4;
    private static final byte[] posReqIDHeader = new byte[] {55, 49, 48, (byte) '='};

    private static final int posReqTypeHeaderLength = 4;
    private static final byte[] posReqTypeHeader = new byte[] {55, 50, 52, (byte) '='};

    private static final int subscriptionRequestTypeHeaderLength = 4;
    private static final byte[] subscriptionRequestTypeHeader = new byte[] {50, 54, 51, (byte) '='};

    private static final int totalNumPosReportsHeaderLength = 4;
    private static final byte[] totalNumPosReportsHeader = new byte[] {55, 50, 55, (byte) '='};

    private static final int posReqResultHeaderLength = 4;
    private static final byte[] posReqResultHeader = new byte[] {55, 50, 56, (byte) '='};

    private static final int unsolicitedIndicatorHeaderLength = 4;
    private static final byte[] unsolicitedIndicatorHeader = new byte[] {51, 50, 53, (byte) '='};

    private static final int clearingBusinessDateHeaderLength = 4;
    private static final byte[] clearingBusinessDateHeader = new byte[] {55, 49, 53, (byte) '='};

    private static final int settlSessIDHeaderLength = 4;
    private static final byte[] settlSessIDHeader = new byte[] {55, 49, 54, (byte) '='};

    private static final int settlSessSubIDHeaderLength = 4;
    private static final byte[] settlSessSubIDHeader = new byte[] {55, 49, 55, (byte) '='};

    private static final int priceTypeHeaderLength = 4;
    private static final byte[] priceTypeHeader = new byte[] {52, 50, 51, (byte) '='};

    private static final int settlCurrencyHeaderLength = 4;
    private static final byte[] settlCurrencyHeader = new byte[] {49, 50, 48, (byte) '='};

    private static final int messageEventSourceHeaderLength = 5;
    private static final byte[] messageEventSourceHeader = new byte[] {49, 48, 49, 49, (byte) '='};

    private static final int accountHeaderLength = 2;
    private static final byte[] accountHeader = new byte[] {49, (byte) '='};

    private static final int acctIDSourceHeaderLength = 4;
    private static final byte[] acctIDSourceHeader = new byte[] {54, 54, 48, (byte) '='};

    private static final int accountTypeHeaderLength = 4;
    private static final byte[] accountTypeHeader = new byte[] {53, 56, 49, (byte) '='};

    private static final int currencyHeaderLength = 3;
    private static final byte[] currencyHeader = new byte[] {49, 53, (byte) '='};

    private static final int settlPriceHeaderLength = 4;
    private static final byte[] settlPriceHeader = new byte[] {55, 51, 48, (byte) '='};

    private static final int settlPriceTypeHeaderLength = 4;
    private static final byte[] settlPriceTypeHeader = new byte[] {55, 51, 49, (byte) '='};

    private static final int priorSettlPriceHeaderLength = 4;
    private static final byte[] priorSettlPriceHeader = new byte[] {55, 51, 52, (byte) '='};

    private static final int matchStatusHeaderLength = 4;
    private static final byte[] matchStatusHeader = new byte[] {53, 55, 51, (byte) '='};

    private static final int registStatusHeaderLength = 4;
    private static final byte[] registStatusHeader = new byte[] {53, 48, 54, (byte) '='};

    private static final int deliveryDateHeaderLength = 4;
    private static final byte[] deliveryDateHeader = new byte[] {55, 52, 51, (byte) '='};

    private static final int modelTypeHeaderLength = 5;
    private static final byte[] modelTypeHeader = new byte[] {49, 52, 51, 52, (byte) '='};

    private static final int priceDeltaHeaderLength = 4;
    private static final byte[] priceDeltaHeader = new byte[] {56, 49, 49, (byte) '='};

    private static final int textHeaderLength = 3;
    private static final byte[] textHeader = new byte[] {53, 56, (byte) '='};

    private static final int encodedTextLenHeaderLength = 4;
    private static final byte[] encodedTextLenHeader = new byte[] {51, 53, 52, (byte) '='};

    private static final int encodedTextHeaderLength = 4;
    private static final byte[] encodedTextHeader = new byte[] {51, 53, 53, (byte) '='};

    private final ApplicationSequenceControlEncoder applicationSequenceControl = new ApplicationSequenceControlEncoder();
    public ApplicationSequenceControlEncoder applicationSequenceControl()
    {
        return applicationSequenceControl;
    }

    private final MutableDirectBuffer posMaintRptID = new UnsafeBuffer();

    private int posMaintRptIDOffset = 0;

    private int posMaintRptIDLength = 0;

    public PositionReportEncoder posMaintRptID(final DirectBuffer value, final int offset, final int length)
    {
        posMaintRptID.wrap(value);
        posMaintRptIDOffset = offset;
        posMaintRptIDLength = length;
        return this;
    }

    public PositionReportEncoder posMaintRptID(final DirectBuffer value, final int length)
    {
        return posMaintRptID(value, 0, length);
    }

    public PositionReportEncoder posMaintRptID(final DirectBuffer value)
    {
        return posMaintRptID(value, 0, value.capacity());
    }

    public PositionReportEncoder posMaintRptID(final byte[] value, final int offset, final int length)
    {
        posMaintRptID.wrap(value);
        posMaintRptIDOffset = offset;
        posMaintRptIDLength = length;
        return this;
    }

    public PositionReportEncoder posMaintRptIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(posMaintRptID, value, offset, length);
        posMaintRptIDOffset = offset;
        posMaintRptIDLength = length;
        return this;
    }

    public PositionReportEncoder posMaintRptID(final byte[] value, final int length)
    {
        return posMaintRptID(value, 0, length);
    }

    public PositionReportEncoder posMaintRptID(final byte[] value)
    {
        return posMaintRptID(value, 0, value.length);
    }

    public boolean hasPosMaintRptID()
    {
        return posMaintRptIDLength > 0;
    }

    public MutableDirectBuffer posMaintRptID()
    {
        return posMaintRptID;
    }

    public String posMaintRptIDAsString()
    {
        return posMaintRptID.getStringWithoutLengthAscii(posMaintRptIDOffset, posMaintRptIDLength);
    }

    public PositionReportEncoder posMaintRptID(final CharSequence value)
    {
        toBytes(value, posMaintRptID);
        posMaintRptIDOffset = 0;
        posMaintRptIDLength = value.length();
        return this;
    }

    public PositionReportEncoder posMaintRptID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            posMaintRptID.wrap(buffer);
            posMaintRptIDOffset = value.offset();
            posMaintRptIDLength = value.length();
        }
        return this;
    }

    public PositionReportEncoder posMaintRptID(final char[] value)
    {
        return posMaintRptID(value, 0, value.length);
    }

    public PositionReportEncoder posMaintRptID(final char[] value, final int length)
    {
        return posMaintRptID(value, 0, length);
    }

    public PositionReportEncoder posMaintRptID(final char[] value, final int offset, final int length)
    {
        toBytes(value, posMaintRptID, offset, length);
        posMaintRptIDOffset = 0;
        posMaintRptIDLength = length;
        return this;
    }

    private final MutableDirectBuffer posReqID = new UnsafeBuffer();

    private int posReqIDOffset = 0;

    private int posReqIDLength = 0;

    public PositionReportEncoder posReqID(final DirectBuffer value, final int offset, final int length)
    {
        posReqID.wrap(value);
        posReqIDOffset = offset;
        posReqIDLength = length;
        return this;
    }

    public PositionReportEncoder posReqID(final DirectBuffer value, final int length)
    {
        return posReqID(value, 0, length);
    }

    public PositionReportEncoder posReqID(final DirectBuffer value)
    {
        return posReqID(value, 0, value.capacity());
    }

    public PositionReportEncoder posReqID(final byte[] value, final int offset, final int length)
    {
        posReqID.wrap(value);
        posReqIDOffset = offset;
        posReqIDLength = length;
        return this;
    }

    public PositionReportEncoder posReqIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(posReqID, value, offset, length);
        posReqIDOffset = offset;
        posReqIDLength = length;
        return this;
    }

    public PositionReportEncoder posReqID(final byte[] value, final int length)
    {
        return posReqID(value, 0, length);
    }

    public PositionReportEncoder posReqID(final byte[] value)
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

    public PositionReportEncoder posReqID(final CharSequence value)
    {
        toBytes(value, posReqID);
        posReqIDOffset = 0;
        posReqIDLength = value.length();
        return this;
    }

    public PositionReportEncoder posReqID(final AsciiSequenceView value)
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

    public PositionReportEncoder posReqID(final char[] value)
    {
        return posReqID(value, 0, value.length);
    }

    public PositionReportEncoder posReqID(final char[] value, final int length)
    {
        return posReqID(value, 0, length);
    }

    public PositionReportEncoder posReqID(final char[] value, final int offset, final int length)
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

    public PositionReportEncoder posReqType(int value)
    {
        posReqType = value;
        hasPosReqType = true;
        return this;
    }

    public int posReqType()
    {
        return posReqType;
    }

    public PositionReportEncoder posReqType(PosReqType value)
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

    private char subscriptionRequestType;

    private boolean hasSubscriptionRequestType;

    public boolean hasSubscriptionRequestType()
    {
        return hasSubscriptionRequestType;
    }

    public PositionReportEncoder subscriptionRequestType(char value)
    {
        subscriptionRequestType = value;
        hasSubscriptionRequestType = true;
        return this;
    }

    public char subscriptionRequestType()
    {
        return subscriptionRequestType;
    }

    public PositionReportEncoder subscriptionRequestType(SubscriptionRequestType value)
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

    private int totalNumPosReports;

    private boolean hasTotalNumPosReports;

    public boolean hasTotalNumPosReports()
    {
        return hasTotalNumPosReports;
    }

    public PositionReportEncoder totalNumPosReports(int value)
    {
        totalNumPosReports = value;
        hasTotalNumPosReports = true;
        return this;
    }

    public int totalNumPosReports()
    {
        return totalNumPosReports;
    }

    private int posReqResult;

    private boolean hasPosReqResult;

    public boolean hasPosReqResult()
    {
        return hasPosReqResult;
    }

    public PositionReportEncoder posReqResult(int value)
    {
        posReqResult = value;
        hasPosReqResult = true;
        return this;
    }

    public int posReqResult()
    {
        return posReqResult;
    }

    public PositionReportEncoder posReqResult(PosReqResult value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == PosReqResult.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: posReqResult Value: " + value );
            }
            if (value == PosReqResult.NULL_VAL)
            {
                return this;
            }
        }
        return posReqResult(value.representation());
    }

    private boolean unsolicitedIndicator;

    private boolean hasUnsolicitedIndicator;

    public boolean hasUnsolicitedIndicator()
    {
        return hasUnsolicitedIndicator;
    }

    public PositionReportEncoder unsolicitedIndicator(boolean value)
    {
        unsolicitedIndicator = value;
        hasUnsolicitedIndicator = true;
        return this;
    }

    public boolean unsolicitedIndicator()
    {
        return unsolicitedIndicator;
    }

    private final MutableDirectBuffer clearingBusinessDate = new UnsafeBuffer();

    private int clearingBusinessDateOffset = 0;

    private int clearingBusinessDateLength = 0;

    public PositionReportEncoder clearingBusinessDate(final DirectBuffer value, final int offset, final int length)
    {
        clearingBusinessDate.wrap(value);
        clearingBusinessDateOffset = offset;
        clearingBusinessDateLength = length;
        return this;
    }

    public PositionReportEncoder clearingBusinessDate(final DirectBuffer value, final int length)
    {
        return clearingBusinessDate(value, 0, length);
    }

    public PositionReportEncoder clearingBusinessDate(final DirectBuffer value)
    {
        return clearingBusinessDate(value, 0, value.capacity());
    }

    public PositionReportEncoder clearingBusinessDate(final byte[] value, final int offset, final int length)
    {
        clearingBusinessDate.wrap(value);
        clearingBusinessDateOffset = offset;
        clearingBusinessDateLength = length;
        return this;
    }

    public PositionReportEncoder clearingBusinessDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(clearingBusinessDate, value, offset, length);
        clearingBusinessDateOffset = offset;
        clearingBusinessDateLength = length;
        return this;
    }

    public PositionReportEncoder clearingBusinessDate(final byte[] value, final int length)
    {
        return clearingBusinessDate(value, 0, length);
    }

    public PositionReportEncoder clearingBusinessDate(final byte[] value)
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

    public PositionReportEncoder settlSessID(final DirectBuffer value, final int offset, final int length)
    {
        settlSessID.wrap(value);
        settlSessIDOffset = offset;
        settlSessIDLength = length;
        return this;
    }

    public PositionReportEncoder settlSessID(final DirectBuffer value, final int length)
    {
        return settlSessID(value, 0, length);
    }

    public PositionReportEncoder settlSessID(final DirectBuffer value)
    {
        return settlSessID(value, 0, value.capacity());
    }

    public PositionReportEncoder settlSessID(final byte[] value, final int offset, final int length)
    {
        settlSessID.wrap(value);
        settlSessIDOffset = offset;
        settlSessIDLength = length;
        return this;
    }

    public PositionReportEncoder settlSessIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlSessID, value, offset, length);
        settlSessIDOffset = offset;
        settlSessIDLength = length;
        return this;
    }

    public PositionReportEncoder settlSessID(final byte[] value, final int length)
    {
        return settlSessID(value, 0, length);
    }

    public PositionReportEncoder settlSessID(final byte[] value)
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

    public PositionReportEncoder settlSessID(final CharSequence value)
    {
        toBytes(value, settlSessID);
        settlSessIDOffset = 0;
        settlSessIDLength = value.length();
        return this;
    }

    public PositionReportEncoder settlSessID(final AsciiSequenceView value)
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

    public PositionReportEncoder settlSessID(final char[] value)
    {
        return settlSessID(value, 0, value.length);
    }

    public PositionReportEncoder settlSessID(final char[] value, final int length)
    {
        return settlSessID(value, 0, length);
    }

    public PositionReportEncoder settlSessID(final char[] value, final int offset, final int length)
    {
        toBytes(value, settlSessID, offset, length);
        settlSessIDOffset = 0;
        settlSessIDLength = length;
        return this;
    }

    public PositionReportEncoder settlSessID(SettlSessID value)
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

    public PositionReportEncoder settlSessSubID(final DirectBuffer value, final int offset, final int length)
    {
        settlSessSubID.wrap(value);
        settlSessSubIDOffset = offset;
        settlSessSubIDLength = length;
        return this;
    }

    public PositionReportEncoder settlSessSubID(final DirectBuffer value, final int length)
    {
        return settlSessSubID(value, 0, length);
    }

    public PositionReportEncoder settlSessSubID(final DirectBuffer value)
    {
        return settlSessSubID(value, 0, value.capacity());
    }

    public PositionReportEncoder settlSessSubID(final byte[] value, final int offset, final int length)
    {
        settlSessSubID.wrap(value);
        settlSessSubIDOffset = offset;
        settlSessSubIDLength = length;
        return this;
    }

    public PositionReportEncoder settlSessSubIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlSessSubID, value, offset, length);
        settlSessSubIDOffset = offset;
        settlSessSubIDLength = length;
        return this;
    }

    public PositionReportEncoder settlSessSubID(final byte[] value, final int length)
    {
        return settlSessSubID(value, 0, length);
    }

    public PositionReportEncoder settlSessSubID(final byte[] value)
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

    public PositionReportEncoder settlSessSubID(final CharSequence value)
    {
        toBytes(value, settlSessSubID);
        settlSessSubIDOffset = 0;
        settlSessSubIDLength = value.length();
        return this;
    }

    public PositionReportEncoder settlSessSubID(final AsciiSequenceView value)
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

    public PositionReportEncoder settlSessSubID(final char[] value)
    {
        return settlSessSubID(value, 0, value.length);
    }

    public PositionReportEncoder settlSessSubID(final char[] value, final int length)
    {
        return settlSessSubID(value, 0, length);
    }

    public PositionReportEncoder settlSessSubID(final char[] value, final int offset, final int length)
    {
        toBytes(value, settlSessSubID, offset, length);
        settlSessSubIDOffset = 0;
        settlSessSubIDLength = length;
        return this;
    }

    private int priceType;

    private boolean hasPriceType;

    public boolean hasPriceType()
    {
        return hasPriceType;
    }

    public PositionReportEncoder priceType(int value)
    {
        priceType = value;
        hasPriceType = true;
        return this;
    }

    public int priceType()
    {
        return priceType;
    }

    public PositionReportEncoder priceType(PriceType value)
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

    private final MutableDirectBuffer settlCurrency = new UnsafeBuffer();

    private int settlCurrencyOffset = 0;

    private int settlCurrencyLength = 0;

    public PositionReportEncoder settlCurrency(final DirectBuffer value, final int offset, final int length)
    {
        settlCurrency.wrap(value);
        settlCurrencyOffset = offset;
        settlCurrencyLength = length;
        return this;
    }

    public PositionReportEncoder settlCurrency(final DirectBuffer value, final int length)
    {
        return settlCurrency(value, 0, length);
    }

    public PositionReportEncoder settlCurrency(final DirectBuffer value)
    {
        return settlCurrency(value, 0, value.capacity());
    }

    public PositionReportEncoder settlCurrency(final byte[] value, final int offset, final int length)
    {
        settlCurrency.wrap(value);
        settlCurrencyOffset = offset;
        settlCurrencyLength = length;
        return this;
    }

    public PositionReportEncoder settlCurrencyAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlCurrency, value, offset, length);
        settlCurrencyOffset = offset;
        settlCurrencyLength = length;
        return this;
    }

    public PositionReportEncoder settlCurrency(final byte[] value, final int length)
    {
        return settlCurrency(value, 0, length);
    }

    public PositionReportEncoder settlCurrency(final byte[] value)
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

    public PositionReportEncoder settlCurrency(final CharSequence value)
    {
        toBytes(value, settlCurrency);
        settlCurrencyOffset = 0;
        settlCurrencyLength = value.length();
        return this;
    }

    public PositionReportEncoder settlCurrency(final AsciiSequenceView value)
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

    public PositionReportEncoder settlCurrency(final char[] value)
    {
        return settlCurrency(value, 0, value.length);
    }

    public PositionReportEncoder settlCurrency(final char[] value, final int length)
    {
        return settlCurrency(value, 0, length);
    }

    public PositionReportEncoder settlCurrency(final char[] value, final int offset, final int length)
    {
        toBytes(value, settlCurrency, offset, length);
        settlCurrencyOffset = 0;
        settlCurrencyLength = length;
        return this;
    }

    private final MutableDirectBuffer messageEventSource = new UnsafeBuffer();

    private int messageEventSourceOffset = 0;

    private int messageEventSourceLength = 0;

    public PositionReportEncoder messageEventSource(final DirectBuffer value, final int offset, final int length)
    {
        messageEventSource.wrap(value);
        messageEventSourceOffset = offset;
        messageEventSourceLength = length;
        return this;
    }

    public PositionReportEncoder messageEventSource(final DirectBuffer value, final int length)
    {
        return messageEventSource(value, 0, length);
    }

    public PositionReportEncoder messageEventSource(final DirectBuffer value)
    {
        return messageEventSource(value, 0, value.capacity());
    }

    public PositionReportEncoder messageEventSource(final byte[] value, final int offset, final int length)
    {
        messageEventSource.wrap(value);
        messageEventSourceOffset = offset;
        messageEventSourceLength = length;
        return this;
    }

    public PositionReportEncoder messageEventSourceAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(messageEventSource, value, offset, length);
        messageEventSourceOffset = offset;
        messageEventSourceLength = length;
        return this;
    }

    public PositionReportEncoder messageEventSource(final byte[] value, final int length)
    {
        return messageEventSource(value, 0, length);
    }

    public PositionReportEncoder messageEventSource(final byte[] value)
    {
        return messageEventSource(value, 0, value.length);
    }

    public boolean hasMessageEventSource()
    {
        return messageEventSourceLength > 0;
    }

    public MutableDirectBuffer messageEventSource()
    {
        return messageEventSource;
    }

    public String messageEventSourceAsString()
    {
        return messageEventSource.getStringWithoutLengthAscii(messageEventSourceOffset, messageEventSourceLength);
    }

    public PositionReportEncoder messageEventSource(final CharSequence value)
    {
        toBytes(value, messageEventSource);
        messageEventSourceOffset = 0;
        messageEventSourceLength = value.length();
        return this;
    }

    public PositionReportEncoder messageEventSource(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            messageEventSource.wrap(buffer);
            messageEventSourceOffset = value.offset();
            messageEventSourceLength = value.length();
        }
        return this;
    }

    public PositionReportEncoder messageEventSource(final char[] value)
    {
        return messageEventSource(value, 0, value.length);
    }

    public PositionReportEncoder messageEventSource(final char[] value, final int length)
    {
        return messageEventSource(value, 0, length);
    }

    public PositionReportEncoder messageEventSource(final char[] value, final int offset, final int length)
    {
        toBytes(value, messageEventSource, offset, length);
        messageEventSourceOffset = 0;
        messageEventSourceLength = length;
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

    public PositionReportEncoder account(final DirectBuffer value, final int offset, final int length)
    {
        account.wrap(value);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    public PositionReportEncoder account(final DirectBuffer value, final int length)
    {
        return account(value, 0, length);
    }

    public PositionReportEncoder account(final DirectBuffer value)
    {
        return account(value, 0, value.capacity());
    }

    public PositionReportEncoder account(final byte[] value, final int offset, final int length)
    {
        account.wrap(value);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    public PositionReportEncoder accountAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(account, value, offset, length);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    public PositionReportEncoder account(final byte[] value, final int length)
    {
        return account(value, 0, length);
    }

    public PositionReportEncoder account(final byte[] value)
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

    public PositionReportEncoder account(final CharSequence value)
    {
        toBytes(value, account);
        accountOffset = 0;
        accountLength = value.length();
        return this;
    }

    public PositionReportEncoder account(final AsciiSequenceView value)
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

    public PositionReportEncoder account(final char[] value)
    {
        return account(value, 0, value.length);
    }

    public PositionReportEncoder account(final char[] value, final int length)
    {
        return account(value, 0, length);
    }

    public PositionReportEncoder account(final char[] value, final int offset, final int length)
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

    public PositionReportEncoder acctIDSource(int value)
    {
        acctIDSource = value;
        hasAcctIDSource = true;
        return this;
    }

    public int acctIDSource()
    {
        return acctIDSource;
    }

    public PositionReportEncoder acctIDSource(AcctIDSource value)
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

    public PositionReportEncoder accountType(int value)
    {
        accountType = value;
        hasAccountType = true;
        return this;
    }

    public int accountType()
    {
        return accountType;
    }

    public PositionReportEncoder accountType(AccountType value)
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

    public PositionReportEncoder currency(final DirectBuffer value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public PositionReportEncoder currency(final DirectBuffer value, final int length)
    {
        return currency(value, 0, length);
    }

    public PositionReportEncoder currency(final DirectBuffer value)
    {
        return currency(value, 0, value.capacity());
    }

    public PositionReportEncoder currency(final byte[] value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public PositionReportEncoder currencyAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(currency, value, offset, length);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public PositionReportEncoder currency(final byte[] value, final int length)
    {
        return currency(value, 0, length);
    }

    public PositionReportEncoder currency(final byte[] value)
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

    public PositionReportEncoder currency(final CharSequence value)
    {
        toBytes(value, currency);
        currencyOffset = 0;
        currencyLength = value.length();
        return this;
    }

    public PositionReportEncoder currency(final AsciiSequenceView value)
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

    public PositionReportEncoder currency(final char[] value)
    {
        return currency(value, 0, value.length);
    }

    public PositionReportEncoder currency(final char[] value, final int length)
    {
        return currency(value, 0, length);
    }

    public PositionReportEncoder currency(final char[] value, final int offset, final int length)
    {
        toBytes(value, currency, offset, length);
        currencyOffset = 0;
        currencyLength = length;
        return this;
    }

    private final DecimalFloat settlPrice = new DecimalFloat();

    private boolean hasSettlPrice;

    public boolean hasSettlPrice()
    {
        return hasSettlPrice;
    }

    public PositionReportEncoder settlPrice(DecimalFloat value)
    {
        settlPrice.set(value);
        hasSettlPrice = true;
        return this;
    }

    public PositionReportEncoder settlPrice(long value, int scale)
    {
        settlPrice.set(value, scale);
        hasSettlPrice = true;
        return this;
    }

    public DecimalFloat settlPrice()
    {
        return settlPrice;
    }

    private int settlPriceType;

    private boolean hasSettlPriceType;

    public boolean hasSettlPriceType()
    {
        return hasSettlPriceType;
    }

    public PositionReportEncoder settlPriceType(int value)
    {
        settlPriceType = value;
        hasSettlPriceType = true;
        return this;
    }

    public int settlPriceType()
    {
        return settlPriceType;
    }

    public PositionReportEncoder settlPriceType(SettlPriceType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == SettlPriceType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: settlPriceType Value: " + value );
            }
            if (value == SettlPriceType.NULL_VAL)
            {
                return this;
            }
        }
        return settlPriceType(value.representation());
    }

    private final DecimalFloat priorSettlPrice = new DecimalFloat();

    private boolean hasPriorSettlPrice;

    public boolean hasPriorSettlPrice()
    {
        return hasPriorSettlPrice;
    }

    public PositionReportEncoder priorSettlPrice(DecimalFloat value)
    {
        priorSettlPrice.set(value);
        hasPriorSettlPrice = true;
        return this;
    }

    public PositionReportEncoder priorSettlPrice(long value, int scale)
    {
        priorSettlPrice.set(value, scale);
        hasPriorSettlPrice = true;
        return this;
    }

    public DecimalFloat priorSettlPrice()
    {
        return priorSettlPrice;
    }

    private char matchStatus;

    private boolean hasMatchStatus;

    public boolean hasMatchStatus()
    {
        return hasMatchStatus;
    }

    public PositionReportEncoder matchStatus(char value)
    {
        matchStatus = value;
        hasMatchStatus = true;
        return this;
    }

    public char matchStatus()
    {
        return matchStatus;
    }

    public PositionReportEncoder matchStatus(MatchStatus value)
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

    private final InstrmtLegGrpEncoder instrmtLegGrp = new InstrmtLegGrpEncoder();
    public InstrmtLegGrpEncoder instrmtLegGrp()
    {
        return instrmtLegGrp;
    }

    private final PosUndInstrmtGrpEncoder posUndInstrmtGrp = new PosUndInstrmtGrpEncoder();
    public PosUndInstrmtGrpEncoder posUndInstrmtGrp()
    {
        return posUndInstrmtGrp;
    }

    private final PositionQtyEncoder positionQty = new PositionQtyEncoder();
    public PositionQtyEncoder positionQty()
    {
        return positionQty;
    }

    private final PositionAmountDataEncoder positionAmountData = new PositionAmountDataEncoder();
    public PositionAmountDataEncoder positionAmountData()
    {
        return positionAmountData;
    }

    private char registStatus;

    private boolean hasRegistStatus;

    public boolean hasRegistStatus()
    {
        return hasRegistStatus;
    }

    public PositionReportEncoder registStatus(char value)
    {
        registStatus = value;
        hasRegistStatus = true;
        return this;
    }

    public char registStatus()
    {
        return registStatus;
    }

    public PositionReportEncoder registStatus(RegistStatus value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == RegistStatus.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: registStatus Value: " + value );
            }
            if (value == RegistStatus.NULL_VAL)
            {
                return this;
            }
        }
        return registStatus(value.representation());
    }

    private final MutableDirectBuffer deliveryDate = new UnsafeBuffer();

    private int deliveryDateOffset = 0;

    private int deliveryDateLength = 0;

    public PositionReportEncoder deliveryDate(final DirectBuffer value, final int offset, final int length)
    {
        deliveryDate.wrap(value);
        deliveryDateOffset = offset;
        deliveryDateLength = length;
        return this;
    }

    public PositionReportEncoder deliveryDate(final DirectBuffer value, final int length)
    {
        return deliveryDate(value, 0, length);
    }

    public PositionReportEncoder deliveryDate(final DirectBuffer value)
    {
        return deliveryDate(value, 0, value.capacity());
    }

    public PositionReportEncoder deliveryDate(final byte[] value, final int offset, final int length)
    {
        deliveryDate.wrap(value);
        deliveryDateOffset = offset;
        deliveryDateLength = length;
        return this;
    }

    public PositionReportEncoder deliveryDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(deliveryDate, value, offset, length);
        deliveryDateOffset = offset;
        deliveryDateLength = length;
        return this;
    }

    public PositionReportEncoder deliveryDate(final byte[] value, final int length)
    {
        return deliveryDate(value, 0, length);
    }

    public PositionReportEncoder deliveryDate(final byte[] value)
    {
        return deliveryDate(value, 0, value.length);
    }

    public boolean hasDeliveryDate()
    {
        return deliveryDateLength > 0;
    }

    public MutableDirectBuffer deliveryDate()
    {
        return deliveryDate;
    }

    public String deliveryDateAsString()
    {
        return deliveryDate.getStringWithoutLengthAscii(deliveryDateOffset, deliveryDateLength);
    }

    private int modelType;

    private boolean hasModelType;

    public boolean hasModelType()
    {
        return hasModelType;
    }

    public PositionReportEncoder modelType(int value)
    {
        modelType = value;
        hasModelType = true;
        return this;
    }

    public int modelType()
    {
        return modelType;
    }

    public PositionReportEncoder modelType(ModelType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == ModelType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: modelType Value: " + value );
            }
            if (value == ModelType.NULL_VAL)
            {
                return this;
            }
        }
        return modelType(value.representation());
    }

    private final DecimalFloat priceDelta = new DecimalFloat();

    private boolean hasPriceDelta;

    public boolean hasPriceDelta()
    {
        return hasPriceDelta;
    }

    public PositionReportEncoder priceDelta(DecimalFloat value)
    {
        priceDelta.set(value);
        hasPriceDelta = true;
        return this;
    }

    public PositionReportEncoder priceDelta(long value, int scale)
    {
        priceDelta.set(value, scale);
        hasPriceDelta = true;
        return this;
    }

    public DecimalFloat priceDelta()
    {
        return priceDelta;
    }

    private final MutableDirectBuffer text = new UnsafeBuffer();

    private int textOffset = 0;

    private int textLength = 0;

    public PositionReportEncoder text(final DirectBuffer value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public PositionReportEncoder text(final DirectBuffer value, final int length)
    {
        return text(value, 0, length);
    }

    public PositionReportEncoder text(final DirectBuffer value)
    {
        return text(value, 0, value.capacity());
    }

    public PositionReportEncoder text(final byte[] value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public PositionReportEncoder textAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(text, value, offset, length);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public PositionReportEncoder text(final byte[] value, final int length)
    {
        return text(value, 0, length);
    }

    public PositionReportEncoder text(final byte[] value)
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

    public PositionReportEncoder text(final CharSequence value)
    {
        toBytes(value, text);
        textOffset = 0;
        textLength = value.length();
        return this;
    }

    public PositionReportEncoder text(final AsciiSequenceView value)
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

    public PositionReportEncoder text(final char[] value)
    {
        return text(value, 0, value.length);
    }

    public PositionReportEncoder text(final char[] value, final int length)
    {
        return text(value, 0, length);
    }

    public PositionReportEncoder text(final char[] value, final int offset, final int length)
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

    public PositionReportEncoder encodedTextLen(int value)
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

    public PositionReportEncoder encodedText(byte[] value)
    {
        encodedText = value;
        hasEncodedText = true;
        return this;
    }

    public byte[] encodedText()
    {
        return encodedText;
    }

    public PositionReportEncoder encodedTextAsCopy(final byte[] value, final int offset, final int length)
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

            position += applicationSequenceControl.encode(buffer, position);

        if (posMaintRptIDLength > 0)
        {
            buffer.putBytes(position, posMaintRptIDHeader, 0, posMaintRptIDHeaderLength);
            position += posMaintRptIDHeaderLength;
            buffer.putBytes(position, posMaintRptID, posMaintRptIDOffset, posMaintRptIDLength);
            position += posMaintRptIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: PosMaintRptID");
        }

        if (posReqIDLength > 0)
        {
            buffer.putBytes(position, posReqIDHeader, 0, posReqIDHeaderLength);
            position += posReqIDHeaderLength;
            buffer.putBytes(position, posReqID, posReqIDOffset, posReqIDLength);
            position += posReqIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasPosReqType)
        {
            buffer.putBytes(position, posReqTypeHeader, 0, posReqTypeHeaderLength);
            position += posReqTypeHeaderLength;
            position += buffer.putIntAscii(position, posReqType);
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

        if (hasTotalNumPosReports)
        {
            buffer.putBytes(position, totalNumPosReportsHeader, 0, totalNumPosReportsHeaderLength);
            position += totalNumPosReportsHeaderLength;
            position += buffer.putIntAscii(position, totalNumPosReports);
            buffer.putSeparator(position);
            position++;
        }

        if (hasPosReqResult)
        {
            buffer.putBytes(position, posReqResultHeader, 0, posReqResultHeaderLength);
            position += posReqResultHeaderLength;
            position += buffer.putIntAscii(position, posReqResult);
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

        if (hasPriceType)
        {
            buffer.putBytes(position, priceTypeHeader, 0, priceTypeHeaderLength);
            position += priceTypeHeaderLength;
            position += buffer.putIntAscii(position, priceType);
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

        if (messageEventSourceLength > 0)
        {
            buffer.putBytes(position, messageEventSourceHeader, 0, messageEventSourceHeaderLength);
            position += messageEventSourceHeaderLength;
            buffer.putBytes(position, messageEventSource, messageEventSourceOffset, messageEventSourceLength);
            position += messageEventSourceLength;
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

        if (hasSettlPrice)
        {
            buffer.putBytes(position, settlPriceHeader, 0, settlPriceHeaderLength);
            position += settlPriceHeaderLength;
            position += buffer.putFloatAscii(position, settlPrice);
            buffer.putSeparator(position);
            position++;
        }

        if (hasSettlPriceType)
        {
            buffer.putBytes(position, settlPriceTypeHeader, 0, settlPriceTypeHeaderLength);
            position += settlPriceTypeHeaderLength;
            position += buffer.putIntAscii(position, settlPriceType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasPriorSettlPrice)
        {
            buffer.putBytes(position, priorSettlPriceHeader, 0, priorSettlPriceHeaderLength);
            position += priorSettlPriceHeaderLength;
            position += buffer.putFloatAscii(position, priorSettlPrice);
            buffer.putSeparator(position);
            position++;
        }

        if (hasMatchStatus)
        {
            buffer.putBytes(position, matchStatusHeader, 0, matchStatusHeaderLength);
            position += matchStatusHeaderLength;
            position += buffer.putCharAscii(position, matchStatus);
            buffer.putSeparator(position);
            position++;
        }

            position += instrmtLegGrp.encode(buffer, position);

            position += posUndInstrmtGrp.encode(buffer, position);

            position += positionQty.encode(buffer, position);

            position += positionAmountData.encode(buffer, position);

        if (hasRegistStatus)
        {
            buffer.putBytes(position, registStatusHeader, 0, registStatusHeaderLength);
            position += registStatusHeaderLength;
            position += buffer.putCharAscii(position, registStatus);
            buffer.putSeparator(position);
            position++;
        }

        if (deliveryDateLength > 0)
        {
            buffer.putBytes(position, deliveryDateHeader, 0, deliveryDateHeaderLength);
            position += deliveryDateHeaderLength;
            buffer.putBytes(position, deliveryDate, deliveryDateOffset, deliveryDateLength);
            position += deliveryDateLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasModelType)
        {
            buffer.putBytes(position, modelTypeHeader, 0, modelTypeHeaderLength);
            position += modelTypeHeaderLength;
            position += buffer.putIntAscii(position, modelType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasPriceDelta)
        {
            buffer.putBytes(position, priceDeltaHeader, 0, priceDeltaHeaderLength);
            position += priceDeltaHeaderLength;
            position += buffer.putFloatAscii(position, priceDelta);
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
        this.resetPosMaintRptID();
        this.resetPosReqID();
        this.resetPosReqType();
        this.resetSubscriptionRequestType();
        this.resetTotalNumPosReports();
        this.resetPosReqResult();
        this.resetUnsolicitedIndicator();
        this.resetClearingBusinessDate();
        this.resetSettlSessID();
        this.resetSettlSessSubID();
        this.resetPriceType();
        this.resetSettlCurrency();
        this.resetMessageEventSource();
        this.resetAccount();
        this.resetAcctIDSource();
        this.resetAccountType();
        this.resetCurrency();
        this.resetSettlPrice();
        this.resetSettlPriceType();
        this.resetPriorSettlPrice();
        this.resetMatchStatus();
        this.resetRegistStatus();
        this.resetDeliveryDate();
        this.resetModelType();
        this.resetPriceDelta();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        applicationSequenceControl.reset();
        parties.reset();
        instrument.reset();
        instrmtLegGrp.reset();
        posUndInstrmtGrp.reset();
        positionQty.reset();
        positionAmountData.reset();
    }

    public void resetPosMaintRptID()
    {
        posMaintRptIDLength = 0;
    }

    public void resetPosReqID()
    {
        posReqIDLength = 0;
    }

    public void resetPosReqType()
    {
        hasPosReqType = false;
    }

    public void resetSubscriptionRequestType()
    {
        hasSubscriptionRequestType = false;
    }

    public void resetTotalNumPosReports()
    {
        hasTotalNumPosReports = false;
    }

    public void resetPosReqResult()
    {
        hasPosReqResult = false;
    }

    public void resetUnsolicitedIndicator()
    {
        hasUnsolicitedIndicator = false;
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

    public void resetPriceType()
    {
        hasPriceType = false;
    }

    public void resetSettlCurrency()
    {
        settlCurrencyLength = 0;
    }

    public void resetMessageEventSource()
    {
        messageEventSourceLength = 0;
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

    public void resetSettlPrice()
    {
        hasSettlPrice = false;
    }

    public void resetSettlPriceType()
    {
        hasSettlPriceType = false;
    }

    public void resetPriorSettlPrice()
    {
        hasPriorSettlPrice = false;
    }

    public void resetMatchStatus()
    {
        hasMatchStatus = false;
    }

    public void resetRegistStatus()
    {
        hasRegistStatus = false;
    }

    public void resetDeliveryDate()
    {
        deliveryDateLength = 0;
    }

    public void resetModelType()
    {
        hasModelType = false;
    }

    public void resetPriceDelta()
    {
        hasPriceDelta = false;
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
        builder.append("\"MessageName\": \"PositionReport\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
    indent(builder, level);
    builder.append("\"ApplicationSequenceControl\": ");
    applicationSequenceControl.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasPosMaintRptID())
        {
            indent(builder, level);
            builder.append("\"PosMaintRptID\": \"");
            appendBuffer(builder, posMaintRptID, posMaintRptIDOffset, posMaintRptIDLength);
            builder.append("\",\n");
        }

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

        if (hasSubscriptionRequestType())
        {
            indent(builder, level);
            builder.append("\"SubscriptionRequestType\": \"");
            builder.append(subscriptionRequestType);
            builder.append("\",\n");
        }

        if (hasTotalNumPosReports())
        {
            indent(builder, level);
            builder.append("\"TotalNumPosReports\": \"");
            builder.append(totalNumPosReports);
            builder.append("\",\n");
        }

        if (hasPosReqResult())
        {
            indent(builder, level);
            builder.append("\"PosReqResult\": \"");
            builder.append(posReqResult);
            builder.append("\",\n");
        }

        if (hasUnsolicitedIndicator())
        {
            indent(builder, level);
            builder.append("\"UnsolicitedIndicator\": \"");
            builder.append(unsolicitedIndicator);
            builder.append("\",\n");
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

        if (hasPriceType())
        {
            indent(builder, level);
            builder.append("\"PriceType\": \"");
            builder.append(priceType);
            builder.append("\",\n");
        }

        if (hasSettlCurrency())
        {
            indent(builder, level);
            builder.append("\"SettlCurrency\": \"");
            appendBuffer(builder, settlCurrency, settlCurrencyOffset, settlCurrencyLength);
            builder.append("\",\n");
        }

        if (hasMessageEventSource())
        {
            indent(builder, level);
            builder.append("\"MessageEventSource\": \"");
            appendBuffer(builder, messageEventSource, messageEventSourceOffset, messageEventSourceLength);
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

        if (hasSettlPrice())
        {
            indent(builder, level);
            builder.append("\"SettlPrice\": \"");
            settlPrice.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasSettlPriceType())
        {
            indent(builder, level);
            builder.append("\"SettlPriceType\": \"");
            builder.append(settlPriceType);
            builder.append("\",\n");
        }

        if (hasPriorSettlPrice())
        {
            indent(builder, level);
            builder.append("\"PriorSettlPrice\": \"");
            priorSettlPrice.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasMatchStatus())
        {
            indent(builder, level);
            builder.append("\"MatchStatus\": \"");
            builder.append(matchStatus);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"InstrmtLegGrp\": ");
    instrmtLegGrp.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"PosUndInstrmtGrp\": ");
    posUndInstrmtGrp.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"PositionQty\": ");
    positionQty.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"PositionAmountData\": ");
    positionAmountData.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasRegistStatus())
        {
            indent(builder, level);
            builder.append("\"RegistStatus\": \"");
            builder.append(registStatus);
            builder.append("\",\n");
        }

        if (hasDeliveryDate())
        {
            indent(builder, level);
            builder.append("\"DeliveryDate\": \"");
            appendBuffer(builder, deliveryDate, deliveryDateOffset, deliveryDateLength);
            builder.append("\",\n");
        }

        if (hasModelType())
        {
            indent(builder, level);
            builder.append("\"ModelType\": \"");
            builder.append(modelType);
            builder.append("\",\n");
        }

        if (hasPriceDelta())
        {
            indent(builder, level);
            builder.append("\"PriceDelta\": \"");
            priceDelta.appendTo(builder);
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
    public PositionReportEncoder copyTo(final Encoder encoder)
    {
        return copyTo((PositionReportEncoder)encoder);
    }

    public PositionReportEncoder copyTo(final PositionReportEncoder encoder)
    {
        encoder.reset();

        applicationSequenceControl.copyTo(encoder.applicationSequenceControl());
        if (hasPosMaintRptID())
        {
            encoder.posMaintRptIDAsCopy(posMaintRptID.byteArray(), 0, posMaintRptIDLength);
        }

        if (hasPosReqID())
        {
            encoder.posReqIDAsCopy(posReqID.byteArray(), 0, posReqIDLength);
        }

        if (hasPosReqType())
        {
            encoder.posReqType(this.posReqType());
        }

        if (hasSubscriptionRequestType())
        {
            encoder.subscriptionRequestType(this.subscriptionRequestType());
        }

        if (hasTotalNumPosReports())
        {
            encoder.totalNumPosReports(this.totalNumPosReports());
        }

        if (hasPosReqResult())
        {
            encoder.posReqResult(this.posReqResult());
        }

        if (hasUnsolicitedIndicator())
        {
            encoder.unsolicitedIndicator(this.unsolicitedIndicator());
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

        if (hasPriceType())
        {
            encoder.priceType(this.priceType());
        }

        if (hasSettlCurrency())
        {
            encoder.settlCurrencyAsCopy(settlCurrency.byteArray(), 0, settlCurrencyLength);
        }

        if (hasMessageEventSource())
        {
            encoder.messageEventSourceAsCopy(messageEventSource.byteArray(), 0, messageEventSourceLength);
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

        if (hasSettlPrice())
        {
            encoder.settlPrice(this.settlPrice());
        }

        if (hasSettlPriceType())
        {
            encoder.settlPriceType(this.settlPriceType());
        }

        if (hasPriorSettlPrice())
        {
            encoder.priorSettlPrice(this.priorSettlPrice());
        }

        if (hasMatchStatus())
        {
            encoder.matchStatus(this.matchStatus());
        }


        instrmtLegGrp.copyTo(encoder.instrmtLegGrp());

        posUndInstrmtGrp.copyTo(encoder.posUndInstrmtGrp());

        positionQty.copyTo(encoder.positionQty());

        positionAmountData.copyTo(encoder.positionAmountData());
        if (hasRegistStatus())
        {
            encoder.registStatus(this.registStatus());
        }

        if (hasDeliveryDate())
        {
            encoder.deliveryDateAsCopy(deliveryDate.byteArray(), 0, deliveryDateLength);
        }

        if (hasModelType())
        {
            encoder.modelType(this.modelType());
        }

        if (hasPriceDelta())
        {
            encoder.priceDelta(this.priceDelta());
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
