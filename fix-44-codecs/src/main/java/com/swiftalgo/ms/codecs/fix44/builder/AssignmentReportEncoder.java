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


public class AssignmentReportEncoder implements Encoder
{
    public long messageType()
    {
        return 22337L;
    }

    public AssignmentReportEncoder()
    {
        header.msgType("AW");
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

    private static final int asgnRptIDHeaderLength = 4;
    private static final byte[] asgnRptIDHeader = new byte[] {56, 51, 51, (byte) '='};

    private static final int totNumAssignmentReportsHeaderLength = 4;
    private static final byte[] totNumAssignmentReportsHeader = new byte[] {56, 51, 50, (byte) '='};

    private static final int lastRptRequestedHeaderLength = 4;
    private static final byte[] lastRptRequestedHeader = new byte[] {57, 49, 50, (byte) '='};

    private static final int accountHeaderLength = 2;
    private static final byte[] accountHeader = new byte[] {49, (byte) '='};

    private static final int accountTypeHeaderLength = 4;
    private static final byte[] accountTypeHeader = new byte[] {53, 56, 49, (byte) '='};

    private static final int currencyHeaderLength = 3;
    private static final byte[] currencyHeader = new byte[] {49, 53, (byte) '='};

    private static final int noLegsGroupCounterHeaderLength = 4;
    private static final byte[] noLegsGroupCounterHeader = new byte[] {53, 53, 53, (byte) '='};

    private static final int noUnderlyingsGroupCounterHeaderLength = 4;
    private static final byte[] noUnderlyingsGroupCounterHeader = new byte[] {55, 49, 49, (byte) '='};

    private static final int thresholdAmountHeaderLength = 4;
    private static final byte[] thresholdAmountHeader = new byte[] {56, 51, 52, (byte) '='};

    private static final int settlPriceHeaderLength = 4;
    private static final byte[] settlPriceHeader = new byte[] {55, 51, 48, (byte) '='};

    private static final int settlPriceTypeHeaderLength = 4;
    private static final byte[] settlPriceTypeHeader = new byte[] {55, 51, 49, (byte) '='};

    private static final int underlyingSettlPriceHeaderLength = 4;
    private static final byte[] underlyingSettlPriceHeader = new byte[] {55, 51, 50, (byte) '='};

    private static final int expireDateHeaderLength = 4;
    private static final byte[] expireDateHeader = new byte[] {52, 51, 50, (byte) '='};

    private static final int assignmentMethodHeaderLength = 4;
    private static final byte[] assignmentMethodHeader = new byte[] {55, 52, 52, (byte) '='};

    private static final int assignmentUnitHeaderLength = 4;
    private static final byte[] assignmentUnitHeader = new byte[] {55, 52, 53, (byte) '='};

    private static final int openInterestHeaderLength = 4;
    private static final byte[] openInterestHeader = new byte[] {55, 52, 54, (byte) '='};

    private static final int exerciseMethodHeaderLength = 4;
    private static final byte[] exerciseMethodHeader = new byte[] {55, 52, 55, (byte) '='};

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

    private final MutableDirectBuffer asgnRptID = new UnsafeBuffer();

    private int asgnRptIDOffset = 0;

    private int asgnRptIDLength = 0;

    public AssignmentReportEncoder asgnRptID(final DirectBuffer value, final int offset, final int length)
    {
        asgnRptID.wrap(value);
        asgnRptIDOffset = offset;
        asgnRptIDLength = length;
        return this;
    }

    public AssignmentReportEncoder asgnRptID(final DirectBuffer value, final int length)
    {
        return asgnRptID(value, 0, length);
    }

    public AssignmentReportEncoder asgnRptID(final DirectBuffer value)
    {
        return asgnRptID(value, 0, value.capacity());
    }

    public AssignmentReportEncoder asgnRptID(final byte[] value, final int offset, final int length)
    {
        asgnRptID.wrap(value);
        asgnRptIDOffset = offset;
        asgnRptIDLength = length;
        return this;
    }

    public AssignmentReportEncoder asgnRptIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(asgnRptID, value, offset, length);
        asgnRptIDOffset = offset;
        asgnRptIDLength = length;
        return this;
    }

    public AssignmentReportEncoder asgnRptID(final byte[] value, final int length)
    {
        return asgnRptID(value, 0, length);
    }

    public AssignmentReportEncoder asgnRptID(final byte[] value)
    {
        return asgnRptID(value, 0, value.length);
    }

    public boolean hasAsgnRptID()
    {
        return asgnRptIDLength > 0;
    }

    public MutableDirectBuffer asgnRptID()
    {
        return asgnRptID;
    }

    public String asgnRptIDAsString()
    {
        return asgnRptID.getStringWithoutLengthAscii(asgnRptIDOffset, asgnRptIDLength);
    }

    public AssignmentReportEncoder asgnRptID(final CharSequence value)
    {
        toBytes(value, asgnRptID);
        asgnRptIDOffset = 0;
        asgnRptIDLength = value.length();
        return this;
    }

    public AssignmentReportEncoder asgnRptID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            asgnRptID.wrap(buffer);
            asgnRptIDOffset = value.offset();
            asgnRptIDLength = value.length();
        }
        return this;
    }

    public AssignmentReportEncoder asgnRptID(final char[] value)
    {
        return asgnRptID(value, 0, value.length);
    }

    public AssignmentReportEncoder asgnRptID(final char[] value, final int length)
    {
        return asgnRptID(value, 0, length);
    }

    public AssignmentReportEncoder asgnRptID(final char[] value, final int offset, final int length)
    {
        toBytes(value, asgnRptID, offset, length);
        asgnRptIDOffset = 0;
        asgnRptIDLength = length;
        return this;
    }

    private int totNumAssignmentReports;

    private boolean hasTotNumAssignmentReports;

    public boolean hasTotNumAssignmentReports()
    {
        return hasTotNumAssignmentReports;
    }

    public AssignmentReportEncoder totNumAssignmentReports(int value)
    {
        totNumAssignmentReports = value;
        hasTotNumAssignmentReports = true;
        return this;
    }

    public int totNumAssignmentReports()
    {
        return totNumAssignmentReports;
    }

    private boolean lastRptRequested;

    private boolean hasLastRptRequested;

    public boolean hasLastRptRequested()
    {
        return hasLastRptRequested;
    }

    public AssignmentReportEncoder lastRptRequested(boolean value)
    {
        lastRptRequested = value;
        hasLastRptRequested = true;
        return this;
    }

    public boolean lastRptRequested()
    {
        return lastRptRequested;
    }

    private final PartiesEncoder parties = new PartiesEncoder();
    public PartiesEncoder parties()
    {
        return parties;
    }

    private final MutableDirectBuffer account = new UnsafeBuffer();

    private int accountOffset = 0;

    private int accountLength = 0;

    public AssignmentReportEncoder account(final DirectBuffer value, final int offset, final int length)
    {
        account.wrap(value);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    public AssignmentReportEncoder account(final DirectBuffer value, final int length)
    {
        return account(value, 0, length);
    }

    public AssignmentReportEncoder account(final DirectBuffer value)
    {
        return account(value, 0, value.capacity());
    }

    public AssignmentReportEncoder account(final byte[] value, final int offset, final int length)
    {
        account.wrap(value);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    public AssignmentReportEncoder accountAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(account, value, offset, length);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    public AssignmentReportEncoder account(final byte[] value, final int length)
    {
        return account(value, 0, length);
    }

    public AssignmentReportEncoder account(final byte[] value)
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

    public AssignmentReportEncoder account(final CharSequence value)
    {
        toBytes(value, account);
        accountOffset = 0;
        accountLength = value.length();
        return this;
    }

    public AssignmentReportEncoder account(final AsciiSequenceView value)
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

    public AssignmentReportEncoder account(final char[] value)
    {
        return account(value, 0, value.length);
    }

    public AssignmentReportEncoder account(final char[] value, final int length)
    {
        return account(value, 0, length);
    }

    public AssignmentReportEncoder account(final char[] value, final int offset, final int length)
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

    public AssignmentReportEncoder accountType(int value)
    {
        accountType = value;
        hasAccountType = true;
        return this;
    }

    public int accountType()
    {
        return accountType;
    }

    public AssignmentReportEncoder accountType(AccountType value)
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

    public AssignmentReportEncoder currency(final DirectBuffer value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public AssignmentReportEncoder currency(final DirectBuffer value, final int length)
    {
        return currency(value, 0, length);
    }

    public AssignmentReportEncoder currency(final DirectBuffer value)
    {
        return currency(value, 0, value.capacity());
    }

    public AssignmentReportEncoder currency(final byte[] value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public AssignmentReportEncoder currencyAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(currency, value, offset, length);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public AssignmentReportEncoder currency(final byte[] value, final int length)
    {
        return currency(value, 0, length);
    }

    public AssignmentReportEncoder currency(final byte[] value)
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

    public AssignmentReportEncoder currency(final CharSequence value)
    {
        toBytes(value, currency);
        currencyOffset = 0;
        currencyLength = value.length();
        return this;
    }

    public AssignmentReportEncoder currency(final AsciiSequenceView value)
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

    public AssignmentReportEncoder currency(final char[] value)
    {
        return currency(value, 0, value.length);
    }

    public AssignmentReportEncoder currency(final char[] value, final int length)
    {
        return currency(value, 0, length);
    }

    public AssignmentReportEncoder currency(final char[] value, final int offset, final int length)
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

    public AssignmentReportEncoder noLegsGroupCounter(int value)
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

    public AssignmentReportEncoder noUnderlyingsGroupCounter(int value)
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

    private final DecimalFloat thresholdAmount = new DecimalFloat();

    private boolean hasThresholdAmount;

    public boolean hasThresholdAmount()
    {
        return hasThresholdAmount;
    }

    public AssignmentReportEncoder thresholdAmount(DecimalFloat value)
    {
        thresholdAmount.set(value);
        hasThresholdAmount = true;
        return this;
    }

    public AssignmentReportEncoder thresholdAmount(long value, int scale)
    {
        thresholdAmount.set(value, scale);
        hasThresholdAmount = true;
        return this;
    }

    public DecimalFloat thresholdAmount()
    {
        return thresholdAmount;
    }

    private final DecimalFloat settlPrice = new DecimalFloat();

    private boolean hasSettlPrice;

    public boolean hasSettlPrice()
    {
        return hasSettlPrice;
    }

    public AssignmentReportEncoder settlPrice(DecimalFloat value)
    {
        settlPrice.set(value);
        hasSettlPrice = true;
        return this;
    }

    public AssignmentReportEncoder settlPrice(long value, int scale)
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

    public AssignmentReportEncoder settlPriceType(int value)
    {
        settlPriceType = value;
        hasSettlPriceType = true;
        return this;
    }

    public int settlPriceType()
    {
        return settlPriceType;
    }

    public AssignmentReportEncoder settlPriceType(SettlPriceType value)
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

    private final DecimalFloat underlyingSettlPrice = new DecimalFloat();

    private boolean hasUnderlyingSettlPrice;

    public boolean hasUnderlyingSettlPrice()
    {
        return hasUnderlyingSettlPrice;
    }

    public AssignmentReportEncoder underlyingSettlPrice(DecimalFloat value)
    {
        underlyingSettlPrice.set(value);
        hasUnderlyingSettlPrice = true;
        return this;
    }

    public AssignmentReportEncoder underlyingSettlPrice(long value, int scale)
    {
        underlyingSettlPrice.set(value, scale);
        hasUnderlyingSettlPrice = true;
        return this;
    }

    public DecimalFloat underlyingSettlPrice()
    {
        return underlyingSettlPrice;
    }

    private final MutableDirectBuffer expireDate = new UnsafeBuffer();

    private int expireDateOffset = 0;

    private int expireDateLength = 0;

    public AssignmentReportEncoder expireDate(final DirectBuffer value, final int offset, final int length)
    {
        expireDate.wrap(value);
        expireDateOffset = offset;
        expireDateLength = length;
        return this;
    }

    public AssignmentReportEncoder expireDate(final DirectBuffer value, final int length)
    {
        return expireDate(value, 0, length);
    }

    public AssignmentReportEncoder expireDate(final DirectBuffer value)
    {
        return expireDate(value, 0, value.capacity());
    }

    public AssignmentReportEncoder expireDate(final byte[] value, final int offset, final int length)
    {
        expireDate.wrap(value);
        expireDateOffset = offset;
        expireDateLength = length;
        return this;
    }

    public AssignmentReportEncoder expireDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(expireDate, value, offset, length);
        expireDateOffset = offset;
        expireDateLength = length;
        return this;
    }

    public AssignmentReportEncoder expireDate(final byte[] value, final int length)
    {
        return expireDate(value, 0, length);
    }

    public AssignmentReportEncoder expireDate(final byte[] value)
    {
        return expireDate(value, 0, value.length);
    }

    public boolean hasExpireDate()
    {
        return expireDateLength > 0;
    }

    public MutableDirectBuffer expireDate()
    {
        return expireDate;
    }

    public String expireDateAsString()
    {
        return expireDate.getStringWithoutLengthAscii(expireDateOffset, expireDateLength);
    }

    private char assignmentMethod;

    private boolean hasAssignmentMethod;

    public boolean hasAssignmentMethod()
    {
        return hasAssignmentMethod;
    }

    public AssignmentReportEncoder assignmentMethod(char value)
    {
        assignmentMethod = value;
        hasAssignmentMethod = true;
        return this;
    }

    public char assignmentMethod()
    {
        return assignmentMethod;
    }

    public AssignmentReportEncoder assignmentMethod(AssignmentMethod value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == AssignmentMethod.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: assignmentMethod Value: " + value );
            }
            if (value == AssignmentMethod.NULL_VAL)
            {
                return this;
            }
        }
        return assignmentMethod(value.representation());
    }

    private final DecimalFloat assignmentUnit = new DecimalFloat();

    private boolean hasAssignmentUnit;

    public boolean hasAssignmentUnit()
    {
        return hasAssignmentUnit;
    }

    public AssignmentReportEncoder assignmentUnit(DecimalFloat value)
    {
        assignmentUnit.set(value);
        hasAssignmentUnit = true;
        return this;
    }

    public AssignmentReportEncoder assignmentUnit(long value, int scale)
    {
        assignmentUnit.set(value, scale);
        hasAssignmentUnit = true;
        return this;
    }

    public DecimalFloat assignmentUnit()
    {
        return assignmentUnit;
    }

    private final DecimalFloat openInterest = new DecimalFloat();

    private boolean hasOpenInterest;

    public boolean hasOpenInterest()
    {
        return hasOpenInterest;
    }

    public AssignmentReportEncoder openInterest(DecimalFloat value)
    {
        openInterest.set(value);
        hasOpenInterest = true;
        return this;
    }

    public AssignmentReportEncoder openInterest(long value, int scale)
    {
        openInterest.set(value, scale);
        hasOpenInterest = true;
        return this;
    }

    public DecimalFloat openInterest()
    {
        return openInterest;
    }

    private char exerciseMethod;

    private boolean hasExerciseMethod;

    public boolean hasExerciseMethod()
    {
        return hasExerciseMethod;
    }

    public AssignmentReportEncoder exerciseMethod(char value)
    {
        exerciseMethod = value;
        hasExerciseMethod = true;
        return this;
    }

    public char exerciseMethod()
    {
        return exerciseMethod;
    }

    public AssignmentReportEncoder exerciseMethod(ExerciseMethod value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == ExerciseMethod.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: exerciseMethod Value: " + value );
            }
            if (value == ExerciseMethod.NULL_VAL)
            {
                return this;
            }
        }
        return exerciseMethod(value.representation());
    }

    private final MutableDirectBuffer settlSessID = new UnsafeBuffer();

    private int settlSessIDOffset = 0;

    private int settlSessIDLength = 0;

    public AssignmentReportEncoder settlSessID(final DirectBuffer value, final int offset, final int length)
    {
        settlSessID.wrap(value);
        settlSessIDOffset = offset;
        settlSessIDLength = length;
        return this;
    }

    public AssignmentReportEncoder settlSessID(final DirectBuffer value, final int length)
    {
        return settlSessID(value, 0, length);
    }

    public AssignmentReportEncoder settlSessID(final DirectBuffer value)
    {
        return settlSessID(value, 0, value.capacity());
    }

    public AssignmentReportEncoder settlSessID(final byte[] value, final int offset, final int length)
    {
        settlSessID.wrap(value);
        settlSessIDOffset = offset;
        settlSessIDLength = length;
        return this;
    }

    public AssignmentReportEncoder settlSessIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlSessID, value, offset, length);
        settlSessIDOffset = offset;
        settlSessIDLength = length;
        return this;
    }

    public AssignmentReportEncoder settlSessID(final byte[] value, final int length)
    {
        return settlSessID(value, 0, length);
    }

    public AssignmentReportEncoder settlSessID(final byte[] value)
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

    public AssignmentReportEncoder settlSessID(final CharSequence value)
    {
        toBytes(value, settlSessID);
        settlSessIDOffset = 0;
        settlSessIDLength = value.length();
        return this;
    }

    public AssignmentReportEncoder settlSessID(final AsciiSequenceView value)
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

    public AssignmentReportEncoder settlSessID(final char[] value)
    {
        return settlSessID(value, 0, value.length);
    }

    public AssignmentReportEncoder settlSessID(final char[] value, final int length)
    {
        return settlSessID(value, 0, length);
    }

    public AssignmentReportEncoder settlSessID(final char[] value, final int offset, final int length)
    {
        toBytes(value, settlSessID, offset, length);
        settlSessIDOffset = 0;
        settlSessIDLength = length;
        return this;
    }

    private final MutableDirectBuffer settlSessSubID = new UnsafeBuffer();

    private int settlSessSubIDOffset = 0;

    private int settlSessSubIDLength = 0;

    public AssignmentReportEncoder settlSessSubID(final DirectBuffer value, final int offset, final int length)
    {
        settlSessSubID.wrap(value);
        settlSessSubIDOffset = offset;
        settlSessSubIDLength = length;
        return this;
    }

    public AssignmentReportEncoder settlSessSubID(final DirectBuffer value, final int length)
    {
        return settlSessSubID(value, 0, length);
    }

    public AssignmentReportEncoder settlSessSubID(final DirectBuffer value)
    {
        return settlSessSubID(value, 0, value.capacity());
    }

    public AssignmentReportEncoder settlSessSubID(final byte[] value, final int offset, final int length)
    {
        settlSessSubID.wrap(value);
        settlSessSubIDOffset = offset;
        settlSessSubIDLength = length;
        return this;
    }

    public AssignmentReportEncoder settlSessSubIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlSessSubID, value, offset, length);
        settlSessSubIDOffset = offset;
        settlSessSubIDLength = length;
        return this;
    }

    public AssignmentReportEncoder settlSessSubID(final byte[] value, final int length)
    {
        return settlSessSubID(value, 0, length);
    }

    public AssignmentReportEncoder settlSessSubID(final byte[] value)
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

    public AssignmentReportEncoder settlSessSubID(final CharSequence value)
    {
        toBytes(value, settlSessSubID);
        settlSessSubIDOffset = 0;
        settlSessSubIDLength = value.length();
        return this;
    }

    public AssignmentReportEncoder settlSessSubID(final AsciiSequenceView value)
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

    public AssignmentReportEncoder settlSessSubID(final char[] value)
    {
        return settlSessSubID(value, 0, value.length);
    }

    public AssignmentReportEncoder settlSessSubID(final char[] value, final int length)
    {
        return settlSessSubID(value, 0, length);
    }

    public AssignmentReportEncoder settlSessSubID(final char[] value, final int offset, final int length)
    {
        toBytes(value, settlSessSubID, offset, length);
        settlSessSubIDOffset = 0;
        settlSessSubIDLength = length;
        return this;
    }

    private final MutableDirectBuffer clearingBusinessDate = new UnsafeBuffer();

    private int clearingBusinessDateOffset = 0;

    private int clearingBusinessDateLength = 0;

    public AssignmentReportEncoder clearingBusinessDate(final DirectBuffer value, final int offset, final int length)
    {
        clearingBusinessDate.wrap(value);
        clearingBusinessDateOffset = offset;
        clearingBusinessDateLength = length;
        return this;
    }

    public AssignmentReportEncoder clearingBusinessDate(final DirectBuffer value, final int length)
    {
        return clearingBusinessDate(value, 0, length);
    }

    public AssignmentReportEncoder clearingBusinessDate(final DirectBuffer value)
    {
        return clearingBusinessDate(value, 0, value.capacity());
    }

    public AssignmentReportEncoder clearingBusinessDate(final byte[] value, final int offset, final int length)
    {
        clearingBusinessDate.wrap(value);
        clearingBusinessDateOffset = offset;
        clearingBusinessDateLength = length;
        return this;
    }

    public AssignmentReportEncoder clearingBusinessDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(clearingBusinessDate, value, offset, length);
        clearingBusinessDateOffset = offset;
        clearingBusinessDateLength = length;
        return this;
    }

    public AssignmentReportEncoder clearingBusinessDate(final byte[] value, final int length)
    {
        return clearingBusinessDate(value, 0, length);
    }

    public AssignmentReportEncoder clearingBusinessDate(final byte[] value)
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

    public AssignmentReportEncoder text(final DirectBuffer value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public AssignmentReportEncoder text(final DirectBuffer value, final int length)
    {
        return text(value, 0, length);
    }

    public AssignmentReportEncoder text(final DirectBuffer value)
    {
        return text(value, 0, value.capacity());
    }

    public AssignmentReportEncoder text(final byte[] value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public AssignmentReportEncoder textAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(text, value, offset, length);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public AssignmentReportEncoder text(final byte[] value, final int length)
    {
        return text(value, 0, length);
    }

    public AssignmentReportEncoder text(final byte[] value)
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

    public AssignmentReportEncoder text(final CharSequence value)
    {
        toBytes(value, text);
        textOffset = 0;
        textLength = value.length();
        return this;
    }

    public AssignmentReportEncoder text(final AsciiSequenceView value)
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

    public AssignmentReportEncoder text(final char[] value)
    {
        return text(value, 0, value.length);
    }

    public AssignmentReportEncoder text(final char[] value, final int length)
    {
        return text(value, 0, length);
    }

    public AssignmentReportEncoder text(final char[] value, final int offset, final int length)
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

    public AssignmentReportEncoder encodedTextLen(int value)
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

    public AssignmentReportEncoder encodedText(byte[] value)
    {
        encodedText = value;
        hasEncodedText = true;
        return this;
    }

    public byte[] encodedText()
    {
        return encodedText;
    }

    public AssignmentReportEncoder encodedTextAsCopy(final byte[] value, final int offset, final int length)
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

        if (asgnRptIDLength > 0)
        {
            buffer.putBytes(position, asgnRptIDHeader, 0, asgnRptIDHeaderLength);
            position += asgnRptIDHeaderLength;
            buffer.putBytes(position, asgnRptID, asgnRptIDOffset, asgnRptIDLength);
            position += asgnRptIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: AsgnRptID");
        }

        if (hasTotNumAssignmentReports)
        {
            buffer.putBytes(position, totNumAssignmentReportsHeader, 0, totNumAssignmentReportsHeaderLength);
            position += totNumAssignmentReportsHeaderLength;
            position += buffer.putIntAscii(position, totNumAssignmentReports);
            buffer.putSeparator(position);
            position++;
        }

        if (hasLastRptRequested)
        {
            buffer.putBytes(position, lastRptRequestedHeader, 0, lastRptRequestedHeaderLength);
            position += lastRptRequestedHeaderLength;
            position += buffer.putBooleanAscii(position, lastRptRequested);
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


            position += positionQty.encode(buffer, position);

            position += positionAmountData.encode(buffer, position);

        if (hasThresholdAmount)
        {
            buffer.putBytes(position, thresholdAmountHeader, 0, thresholdAmountHeaderLength);
            position += thresholdAmountHeaderLength;
            position += buffer.putFloatAscii(position, thresholdAmount);
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
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: SettlPrice");
        }

        if (hasSettlPriceType)
        {
            buffer.putBytes(position, settlPriceTypeHeader, 0, settlPriceTypeHeaderLength);
            position += settlPriceTypeHeaderLength;
            position += buffer.putIntAscii(position, settlPriceType);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: SettlPriceType");
        }

        if (hasUnderlyingSettlPrice)
        {
            buffer.putBytes(position, underlyingSettlPriceHeader, 0, underlyingSettlPriceHeaderLength);
            position += underlyingSettlPriceHeaderLength;
            position += buffer.putFloatAscii(position, underlyingSettlPrice);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: UnderlyingSettlPrice");
        }

        if (expireDateLength > 0)
        {
            buffer.putBytes(position, expireDateHeader, 0, expireDateHeaderLength);
            position += expireDateHeaderLength;
            buffer.putBytes(position, expireDate, expireDateOffset, expireDateLength);
            position += expireDateLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasAssignmentMethod)
        {
            buffer.putBytes(position, assignmentMethodHeader, 0, assignmentMethodHeaderLength);
            position += assignmentMethodHeaderLength;
            position += buffer.putCharAscii(position, assignmentMethod);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: AssignmentMethod");
        }

        if (hasAssignmentUnit)
        {
            buffer.putBytes(position, assignmentUnitHeader, 0, assignmentUnitHeaderLength);
            position += assignmentUnitHeaderLength;
            position += buffer.putFloatAscii(position, assignmentUnit);
            buffer.putSeparator(position);
            position++;
        }

        if (hasOpenInterest)
        {
            buffer.putBytes(position, openInterestHeader, 0, openInterestHeaderLength);
            position += openInterestHeaderLength;
            position += buffer.putFloatAscii(position, openInterest);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: OpenInterest");
        }

        if (hasExerciseMethod)
        {
            buffer.putBytes(position, exerciseMethodHeader, 0, exerciseMethodHeaderLength);
            position += exerciseMethodHeaderLength;
            position += buffer.putCharAscii(position, exerciseMethod);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: ExerciseMethod");
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
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: SettlSessID");
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
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: SettlSessSubID");
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
        this.resetAsgnRptID();
        this.resetTotNumAssignmentReports();
        this.resetLastRptRequested();
        this.resetAccount();
        this.resetAccountType();
        this.resetCurrency();
        this.resetThresholdAmount();
        this.resetSettlPrice();
        this.resetSettlPriceType();
        this.resetUnderlyingSettlPrice();
        this.resetExpireDate();
        this.resetAssignmentMethod();
        this.resetAssignmentUnit();
        this.resetOpenInterest();
        this.resetExerciseMethod();
        this.resetSettlSessID();
        this.resetSettlSessSubID();
        this.resetClearingBusinessDate();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        parties.reset();
        instrument.reset();
        positionQty.reset();
        positionAmountData.reset();
        this.resetLegsGroup();
        this.resetUnderlyingsGroup();
    }

    public void resetAsgnRptID()
    {
        asgnRptIDLength = 0;
    }

    public void resetTotNumAssignmentReports()
    {
        hasTotNumAssignmentReports = false;
    }

    public void resetLastRptRequested()
    {
        hasLastRptRequested = false;
    }

    public void resetAccount()
    {
        accountLength = 0;
    }

    public void resetAccountType()
    {
        hasAccountType = false;
    }

    public void resetCurrency()
    {
        currencyLength = 0;
    }

    public void resetThresholdAmount()
    {
        hasThresholdAmount = false;
    }

    public void resetSettlPrice()
    {
        hasSettlPrice = false;
    }

    public void resetSettlPriceType()
    {
        hasSettlPriceType = false;
    }

    public void resetUnderlyingSettlPrice()
    {
        hasUnderlyingSettlPrice = false;
    }

    public void resetExpireDate()
    {
        expireDateLength = 0;
    }

    public void resetAssignmentMethod()
    {
        assignmentMethod = MISSING_CHAR;
    }

    public void resetAssignmentUnit()
    {
        hasAssignmentUnit = false;
    }

    public void resetOpenInterest()
    {
        hasOpenInterest = false;
    }

    public void resetExerciseMethod()
    {
        exerciseMethod = MISSING_CHAR;
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
        builder.append("\"MessageName\": \"AssignmentReport\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasAsgnRptID())
        {
            indent(builder, level);
            builder.append("\"AsgnRptID\": \"");
            appendBuffer(builder, asgnRptID, asgnRptIDOffset, asgnRptIDLength);
            builder.append("\",\n");
        }

        if (hasTotNumAssignmentReports())
        {
            indent(builder, level);
            builder.append("\"TotNumAssignmentReports\": \"");
            builder.append(totNumAssignmentReports);
            builder.append("\",\n");
        }

        if (hasLastRptRequested())
        {
            indent(builder, level);
            builder.append("\"LastRptRequested\": \"");
            builder.append(lastRptRequested);
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

    indent(builder, level);
    builder.append("\"PositionQty\": ");
    positionQty.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"PositionAmountData\": ");
    positionAmountData.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasThresholdAmount())
        {
            indent(builder, level);
            builder.append("\"ThresholdAmount\": \"");
            thresholdAmount.appendTo(builder);
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

        if (hasUnderlyingSettlPrice())
        {
            indent(builder, level);
            builder.append("\"UnderlyingSettlPrice\": \"");
            underlyingSettlPrice.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasExpireDate())
        {
            indent(builder, level);
            builder.append("\"ExpireDate\": \"");
            appendBuffer(builder, expireDate, expireDateOffset, expireDateLength);
            builder.append("\",\n");
        }

        if (hasAssignmentMethod())
        {
            indent(builder, level);
            builder.append("\"AssignmentMethod\": \"");
            builder.append(assignmentMethod);
            builder.append("\",\n");
        }

        if (hasAssignmentUnit())
        {
            indent(builder, level);
            builder.append("\"AssignmentUnit\": \"");
            assignmentUnit.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasOpenInterest())
        {
            indent(builder, level);
            builder.append("\"OpenInterest\": \"");
            openInterest.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasExerciseMethod())
        {
            indent(builder, level);
            builder.append("\"ExerciseMethod\": \"");
            builder.append(exerciseMethod);
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
    public AssignmentReportEncoder copyTo(final Encoder encoder)
    {
        return copyTo((AssignmentReportEncoder)encoder);
    }

    public AssignmentReportEncoder copyTo(final AssignmentReportEncoder encoder)
    {
        encoder.reset();
        if (hasAsgnRptID())
        {
            encoder.asgnRptIDAsCopy(asgnRptID.byteArray(), 0, asgnRptIDLength);
        }

        if (hasTotNumAssignmentReports())
        {
            encoder.totNumAssignmentReports(this.totNumAssignmentReports());
        }

        if (hasLastRptRequested())
        {
            encoder.lastRptRequested(this.lastRptRequested());
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


        positionQty.copyTo(encoder.positionQty());

        positionAmountData.copyTo(encoder.positionAmountData());
        if (hasThresholdAmount())
        {
            encoder.thresholdAmount(this.thresholdAmount());
        }

        if (hasSettlPrice())
        {
            encoder.settlPrice(this.settlPrice());
        }

        if (hasSettlPriceType())
        {
            encoder.settlPriceType(this.settlPriceType());
        }

        if (hasUnderlyingSettlPrice())
        {
            encoder.underlyingSettlPrice(this.underlyingSettlPrice());
        }

        if (hasExpireDate())
        {
            encoder.expireDateAsCopy(expireDate.byteArray(), 0, expireDateLength);
        }

        if (hasAssignmentMethod())
        {
            encoder.assignmentMethod(this.assignmentMethod());
        }

        if (hasAssignmentUnit())
        {
            encoder.assignmentUnit(this.assignmentUnit());
        }

        if (hasOpenInterest())
        {
            encoder.openInterest(this.openInterest());
        }

        if (hasExerciseMethod())
        {
            encoder.exerciseMethod(this.exerciseMethod());
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
