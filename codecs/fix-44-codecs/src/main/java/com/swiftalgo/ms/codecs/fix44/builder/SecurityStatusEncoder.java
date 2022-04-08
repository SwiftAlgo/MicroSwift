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


public class SecurityStatusEncoder implements Encoder
{
    public long messageType()
    {
        return 102L;
    }

    public SecurityStatusEncoder()
    {
        header.msgType("f");
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

    private static final int securityStatusReqIDHeaderLength = 4;
    private static final byte[] securityStatusReqIDHeader = new byte[] {51, 50, 52, (byte) '='};

    private static final int noUnderlyingsGroupCounterHeaderLength = 4;
    private static final byte[] noUnderlyingsGroupCounterHeader = new byte[] {55, 49, 49, (byte) '='};

    private static final int noLegsGroupCounterHeaderLength = 4;
    private static final byte[] noLegsGroupCounterHeader = new byte[] {53, 53, 53, (byte) '='};

    private static final int currencyHeaderLength = 3;
    private static final byte[] currencyHeader = new byte[] {49, 53, (byte) '='};

    private static final int tradingSessionIDHeaderLength = 4;
    private static final byte[] tradingSessionIDHeader = new byte[] {51, 51, 54, (byte) '='};

    private static final int tradingSessionSubIDHeaderLength = 4;
    private static final byte[] tradingSessionSubIDHeader = new byte[] {54, 50, 53, (byte) '='};

    private static final int unsolicitedIndicatorHeaderLength = 4;
    private static final byte[] unsolicitedIndicatorHeader = new byte[] {51, 50, 53, (byte) '='};

    private static final int securityTradingStatusHeaderLength = 4;
    private static final byte[] securityTradingStatusHeader = new byte[] {51, 50, 54, (byte) '='};

    private static final int financialStatusHeaderLength = 4;
    private static final byte[] financialStatusHeader = new byte[] {50, 57, 49, (byte) '='};

    private static final int corporateActionHeaderLength = 4;
    private static final byte[] corporateActionHeader = new byte[] {50, 57, 50, (byte) '='};

    private static final int haltReasonHeaderLength = 4;
    private static final byte[] haltReasonHeader = new byte[] {51, 50, 55, (byte) '='};

    private static final int inViewOfCommonHeaderLength = 4;
    private static final byte[] inViewOfCommonHeader = new byte[] {51, 50, 56, (byte) '='};

    private static final int dueToRelatedHeaderLength = 4;
    private static final byte[] dueToRelatedHeader = new byte[] {51, 50, 57, (byte) '='};

    private static final int buyVolumeHeaderLength = 4;
    private static final byte[] buyVolumeHeader = new byte[] {51, 51, 48, (byte) '='};

    private static final int sellVolumeHeaderLength = 4;
    private static final byte[] sellVolumeHeader = new byte[] {51, 51, 49, (byte) '='};

    private static final int highPxHeaderLength = 4;
    private static final byte[] highPxHeader = new byte[] {51, 51, 50, (byte) '='};

    private static final int lowPxHeaderLength = 4;
    private static final byte[] lowPxHeader = new byte[] {51, 51, 51, (byte) '='};

    private static final int lastPxHeaderLength = 3;
    private static final byte[] lastPxHeader = new byte[] {51, 49, (byte) '='};

    private static final int transactTimeHeaderLength = 3;
    private static final byte[] transactTimeHeader = new byte[] {54, 48, (byte) '='};

    private static final int adjustmentHeaderLength = 4;
    private static final byte[] adjustmentHeader = new byte[] {51, 51, 52, (byte) '='};

    private static final int textHeaderLength = 3;
    private static final byte[] textHeader = new byte[] {53, 56, (byte) '='};

    private static final int encodedTextLenHeaderLength = 4;
    private static final byte[] encodedTextLenHeader = new byte[] {51, 53, 52, (byte) '='};

    private static final int encodedTextHeaderLength = 4;
    private static final byte[] encodedTextHeader = new byte[] {51, 53, 53, (byte) '='};

    private final MutableDirectBuffer securityStatusReqID = new UnsafeBuffer();

    private int securityStatusReqIDOffset = 0;

    private int securityStatusReqIDLength = 0;

    public SecurityStatusEncoder securityStatusReqID(final DirectBuffer value, final int offset, final int length)
    {
        securityStatusReqID.wrap(value);
        securityStatusReqIDOffset = offset;
        securityStatusReqIDLength = length;
        return this;
    }

    public SecurityStatusEncoder securityStatusReqID(final DirectBuffer value, final int length)
    {
        return securityStatusReqID(value, 0, length);
    }

    public SecurityStatusEncoder securityStatusReqID(final DirectBuffer value)
    {
        return securityStatusReqID(value, 0, value.capacity());
    }

    public SecurityStatusEncoder securityStatusReqID(final byte[] value, final int offset, final int length)
    {
        securityStatusReqID.wrap(value);
        securityStatusReqIDOffset = offset;
        securityStatusReqIDLength = length;
        return this;
    }

    public SecurityStatusEncoder securityStatusReqIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(securityStatusReqID, value, offset, length);
        securityStatusReqIDOffset = offset;
        securityStatusReqIDLength = length;
        return this;
    }

    public SecurityStatusEncoder securityStatusReqID(final byte[] value, final int length)
    {
        return securityStatusReqID(value, 0, length);
    }

    public SecurityStatusEncoder securityStatusReqID(final byte[] value)
    {
        return securityStatusReqID(value, 0, value.length);
    }

    public boolean hasSecurityStatusReqID()
    {
        return securityStatusReqIDLength > 0;
    }

    public MutableDirectBuffer securityStatusReqID()
    {
        return securityStatusReqID;
    }

    public String securityStatusReqIDAsString()
    {
        return securityStatusReqID.getStringWithoutLengthAscii(securityStatusReqIDOffset, securityStatusReqIDLength);
    }

    public SecurityStatusEncoder securityStatusReqID(final CharSequence value)
    {
        toBytes(value, securityStatusReqID);
        securityStatusReqIDOffset = 0;
        securityStatusReqIDLength = value.length();
        return this;
    }

    public SecurityStatusEncoder securityStatusReqID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            securityStatusReqID.wrap(buffer);
            securityStatusReqIDOffset = value.offset();
            securityStatusReqIDLength = value.length();
        }
        return this;
    }

    public SecurityStatusEncoder securityStatusReqID(final char[] value)
    {
        return securityStatusReqID(value, 0, value.length);
    }

    public SecurityStatusEncoder securityStatusReqID(final char[] value, final int length)
    {
        return securityStatusReqID(value, 0, length);
    }

    public SecurityStatusEncoder securityStatusReqID(final char[] value, final int offset, final int length)
    {
        toBytes(value, securityStatusReqID, offset, length);
        securityStatusReqIDOffset = 0;
        securityStatusReqIDLength = length;
        return this;
    }

    private final InstrumentEncoder instrument = new InstrumentEncoder();
    public InstrumentEncoder instrument()
    {
        return instrument;
    }

    private final InstrumentExtensionEncoder instrumentExtension = new InstrumentExtensionEncoder();
    public InstrumentExtensionEncoder instrumentExtension()
    {
        return instrumentExtension;
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

    public SecurityStatusEncoder noUnderlyingsGroupCounter(int value)
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

    public SecurityStatusEncoder noLegsGroupCounter(int value)
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

    private final MutableDirectBuffer currency = new UnsafeBuffer();

    private int currencyOffset = 0;

    private int currencyLength = 0;

    public SecurityStatusEncoder currency(final DirectBuffer value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public SecurityStatusEncoder currency(final DirectBuffer value, final int length)
    {
        return currency(value, 0, length);
    }

    public SecurityStatusEncoder currency(final DirectBuffer value)
    {
        return currency(value, 0, value.capacity());
    }

    public SecurityStatusEncoder currency(final byte[] value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public SecurityStatusEncoder currencyAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(currency, value, offset, length);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public SecurityStatusEncoder currency(final byte[] value, final int length)
    {
        return currency(value, 0, length);
    }

    public SecurityStatusEncoder currency(final byte[] value)
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

    public SecurityStatusEncoder currency(final CharSequence value)
    {
        toBytes(value, currency);
        currencyOffset = 0;
        currencyLength = value.length();
        return this;
    }

    public SecurityStatusEncoder currency(final AsciiSequenceView value)
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

    public SecurityStatusEncoder currency(final char[] value)
    {
        return currency(value, 0, value.length);
    }

    public SecurityStatusEncoder currency(final char[] value, final int length)
    {
        return currency(value, 0, length);
    }

    public SecurityStatusEncoder currency(final char[] value, final int offset, final int length)
    {
        toBytes(value, currency, offset, length);
        currencyOffset = 0;
        currencyLength = length;
        return this;
    }

    private final MutableDirectBuffer tradingSessionID = new UnsafeBuffer();

    private int tradingSessionIDOffset = 0;

    private int tradingSessionIDLength = 0;

    public SecurityStatusEncoder tradingSessionID(final DirectBuffer value, final int offset, final int length)
    {
        tradingSessionID.wrap(value);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public SecurityStatusEncoder tradingSessionID(final DirectBuffer value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public SecurityStatusEncoder tradingSessionID(final DirectBuffer value)
    {
        return tradingSessionID(value, 0, value.capacity());
    }

    public SecurityStatusEncoder tradingSessionID(final byte[] value, final int offset, final int length)
    {
        tradingSessionID.wrap(value);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public SecurityStatusEncoder tradingSessionIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradingSessionID, value, offset, length);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public SecurityStatusEncoder tradingSessionID(final byte[] value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public SecurityStatusEncoder tradingSessionID(final byte[] value)
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

    public SecurityStatusEncoder tradingSessionID(final CharSequence value)
    {
        toBytes(value, tradingSessionID);
        tradingSessionIDOffset = 0;
        tradingSessionIDLength = value.length();
        return this;
    }

    public SecurityStatusEncoder tradingSessionID(final AsciiSequenceView value)
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

    public SecurityStatusEncoder tradingSessionID(final char[] value)
    {
        return tradingSessionID(value, 0, value.length);
    }

    public SecurityStatusEncoder tradingSessionID(final char[] value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public SecurityStatusEncoder tradingSessionID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradingSessionID, offset, length);
        tradingSessionIDOffset = 0;
        tradingSessionIDLength = length;
        return this;
    }

    private final MutableDirectBuffer tradingSessionSubID = new UnsafeBuffer();

    private int tradingSessionSubIDOffset = 0;

    private int tradingSessionSubIDLength = 0;

    public SecurityStatusEncoder tradingSessionSubID(final DirectBuffer value, final int offset, final int length)
    {
        tradingSessionSubID.wrap(value);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public SecurityStatusEncoder tradingSessionSubID(final DirectBuffer value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public SecurityStatusEncoder tradingSessionSubID(final DirectBuffer value)
    {
        return tradingSessionSubID(value, 0, value.capacity());
    }

    public SecurityStatusEncoder tradingSessionSubID(final byte[] value, final int offset, final int length)
    {
        tradingSessionSubID.wrap(value);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public SecurityStatusEncoder tradingSessionSubIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradingSessionSubID, value, offset, length);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public SecurityStatusEncoder tradingSessionSubID(final byte[] value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public SecurityStatusEncoder tradingSessionSubID(final byte[] value)
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

    public SecurityStatusEncoder tradingSessionSubID(final CharSequence value)
    {
        toBytes(value, tradingSessionSubID);
        tradingSessionSubIDOffset = 0;
        tradingSessionSubIDLength = value.length();
        return this;
    }

    public SecurityStatusEncoder tradingSessionSubID(final AsciiSequenceView value)
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

    public SecurityStatusEncoder tradingSessionSubID(final char[] value)
    {
        return tradingSessionSubID(value, 0, value.length);
    }

    public SecurityStatusEncoder tradingSessionSubID(final char[] value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public SecurityStatusEncoder tradingSessionSubID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradingSessionSubID, offset, length);
        tradingSessionSubIDOffset = 0;
        tradingSessionSubIDLength = length;
        return this;
    }

    private boolean unsolicitedIndicator;

    private boolean hasUnsolicitedIndicator;

    public boolean hasUnsolicitedIndicator()
    {
        return hasUnsolicitedIndicator;
    }

    public SecurityStatusEncoder unsolicitedIndicator(boolean value)
    {
        unsolicitedIndicator = value;
        hasUnsolicitedIndicator = true;
        return this;
    }

    public boolean unsolicitedIndicator()
    {
        return unsolicitedIndicator;
    }

    private int securityTradingStatus;

    private boolean hasSecurityTradingStatus;

    public boolean hasSecurityTradingStatus()
    {
        return hasSecurityTradingStatus;
    }

    public SecurityStatusEncoder securityTradingStatus(int value)
    {
        securityTradingStatus = value;
        hasSecurityTradingStatus = true;
        return this;
    }

    public int securityTradingStatus()
    {
        return securityTradingStatus;
    }

    public SecurityStatusEncoder securityTradingStatus(SecurityTradingStatus value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == SecurityTradingStatus.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: securityTradingStatus Value: " + value );
            }
            if (value == SecurityTradingStatus.NULL_VAL)
            {
                return this;
            }
        }
        return securityTradingStatus(value.representation());
    }

    private final MutableDirectBuffer financialStatus = new UnsafeBuffer();

    private int financialStatusOffset = 0;

    private int financialStatusLength = 0;

    public SecurityStatusEncoder financialStatus(final DirectBuffer value, final int offset, final int length)
    {
        financialStatus.wrap(value);
        financialStatusOffset = offset;
        financialStatusLength = length;
        return this;
    }

    public SecurityStatusEncoder financialStatus(final DirectBuffer value, final int length)
    {
        return financialStatus(value, 0, length);
    }

    public SecurityStatusEncoder financialStatus(final DirectBuffer value)
    {
        return financialStatus(value, 0, value.capacity());
    }

    public SecurityStatusEncoder financialStatus(final byte[] value, final int offset, final int length)
    {
        financialStatus.wrap(value);
        financialStatusOffset = offset;
        financialStatusLength = length;
        return this;
    }

    public SecurityStatusEncoder financialStatusAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(financialStatus, value, offset, length);
        financialStatusOffset = offset;
        financialStatusLength = length;
        return this;
    }

    public SecurityStatusEncoder financialStatus(final byte[] value, final int length)
    {
        return financialStatus(value, 0, length);
    }

    public SecurityStatusEncoder financialStatus(final byte[] value)
    {
        return financialStatus(value, 0, value.length);
    }

    public boolean hasFinancialStatus()
    {
        return financialStatusLength > 0;
    }

    public MutableDirectBuffer financialStatus()
    {
        return financialStatus;
    }

    public String financialStatusAsString()
    {
        return financialStatus.getStringWithoutLengthAscii(financialStatusOffset, financialStatusLength);
    }

    public SecurityStatusEncoder financialStatus(final CharSequence value)
    {
        toBytes(value, financialStatus);
        financialStatusOffset = 0;
        financialStatusLength = value.length();
        return this;
    }

    public SecurityStatusEncoder financialStatus(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            financialStatus.wrap(buffer);
            financialStatusOffset = value.offset();
            financialStatusLength = value.length();
        }
        return this;
    }

    public SecurityStatusEncoder financialStatus(final char[] value)
    {
        return financialStatus(value, 0, value.length);
    }

    public SecurityStatusEncoder financialStatus(final char[] value, final int length)
    {
        return financialStatus(value, 0, length);
    }

    public SecurityStatusEncoder financialStatus(final char[] value, final int offset, final int length)
    {
        toBytes(value, financialStatus, offset, length);
        financialStatusOffset = 0;
        financialStatusLength = length;
        return this;
    }

    private final MutableDirectBuffer corporateAction = new UnsafeBuffer();

    private int corporateActionOffset = 0;

    private int corporateActionLength = 0;

    public SecurityStatusEncoder corporateAction(final DirectBuffer value, final int offset, final int length)
    {
        corporateAction.wrap(value);
        corporateActionOffset = offset;
        corporateActionLength = length;
        return this;
    }

    public SecurityStatusEncoder corporateAction(final DirectBuffer value, final int length)
    {
        return corporateAction(value, 0, length);
    }

    public SecurityStatusEncoder corporateAction(final DirectBuffer value)
    {
        return corporateAction(value, 0, value.capacity());
    }

    public SecurityStatusEncoder corporateAction(final byte[] value, final int offset, final int length)
    {
        corporateAction.wrap(value);
        corporateActionOffset = offset;
        corporateActionLength = length;
        return this;
    }

    public SecurityStatusEncoder corporateActionAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(corporateAction, value, offset, length);
        corporateActionOffset = offset;
        corporateActionLength = length;
        return this;
    }

    public SecurityStatusEncoder corporateAction(final byte[] value, final int length)
    {
        return corporateAction(value, 0, length);
    }

    public SecurityStatusEncoder corporateAction(final byte[] value)
    {
        return corporateAction(value, 0, value.length);
    }

    public boolean hasCorporateAction()
    {
        return corporateActionLength > 0;
    }

    public MutableDirectBuffer corporateAction()
    {
        return corporateAction;
    }

    public String corporateActionAsString()
    {
        return corporateAction.getStringWithoutLengthAscii(corporateActionOffset, corporateActionLength);
    }

    public SecurityStatusEncoder corporateAction(final CharSequence value)
    {
        toBytes(value, corporateAction);
        corporateActionOffset = 0;
        corporateActionLength = value.length();
        return this;
    }

    public SecurityStatusEncoder corporateAction(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            corporateAction.wrap(buffer);
            corporateActionOffset = value.offset();
            corporateActionLength = value.length();
        }
        return this;
    }

    public SecurityStatusEncoder corporateAction(final char[] value)
    {
        return corporateAction(value, 0, value.length);
    }

    public SecurityStatusEncoder corporateAction(final char[] value, final int length)
    {
        return corporateAction(value, 0, length);
    }

    public SecurityStatusEncoder corporateAction(final char[] value, final int offset, final int length)
    {
        toBytes(value, corporateAction, offset, length);
        corporateActionOffset = 0;
        corporateActionLength = length;
        return this;
    }

    private char haltReason;

    private boolean hasHaltReason;

    public boolean hasHaltReason()
    {
        return hasHaltReason;
    }

    public SecurityStatusEncoder haltReason(char value)
    {
        haltReason = value;
        hasHaltReason = true;
        return this;
    }

    public char haltReason()
    {
        return haltReason;
    }

    public SecurityStatusEncoder haltReason(HaltReason value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == HaltReason.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: haltReason Value: " + value );
            }
            if (value == HaltReason.NULL_VAL)
            {
                return this;
            }
        }
        return haltReason(value.representation());
    }

    private boolean inViewOfCommon;

    private boolean hasInViewOfCommon;

    public boolean hasInViewOfCommon()
    {
        return hasInViewOfCommon;
    }

    public SecurityStatusEncoder inViewOfCommon(boolean value)
    {
        inViewOfCommon = value;
        hasInViewOfCommon = true;
        return this;
    }

    public boolean inViewOfCommon()
    {
        return inViewOfCommon;
    }

    private boolean dueToRelated;

    private boolean hasDueToRelated;

    public boolean hasDueToRelated()
    {
        return hasDueToRelated;
    }

    public SecurityStatusEncoder dueToRelated(boolean value)
    {
        dueToRelated = value;
        hasDueToRelated = true;
        return this;
    }

    public boolean dueToRelated()
    {
        return dueToRelated;
    }

    private final DecimalFloat buyVolume = new DecimalFloat();

    private boolean hasBuyVolume;

    public boolean hasBuyVolume()
    {
        return hasBuyVolume;
    }

    public SecurityStatusEncoder buyVolume(DecimalFloat value)
    {
        buyVolume.set(value);
        hasBuyVolume = true;
        return this;
    }

    public SecurityStatusEncoder buyVolume(long value, int scale)
    {
        buyVolume.set(value, scale);
        hasBuyVolume = true;
        return this;
    }

    public DecimalFloat buyVolume()
    {
        return buyVolume;
    }

    private final DecimalFloat sellVolume = new DecimalFloat();

    private boolean hasSellVolume;

    public boolean hasSellVolume()
    {
        return hasSellVolume;
    }

    public SecurityStatusEncoder sellVolume(DecimalFloat value)
    {
        sellVolume.set(value);
        hasSellVolume = true;
        return this;
    }

    public SecurityStatusEncoder sellVolume(long value, int scale)
    {
        sellVolume.set(value, scale);
        hasSellVolume = true;
        return this;
    }

    public DecimalFloat sellVolume()
    {
        return sellVolume;
    }

    private final DecimalFloat highPx = new DecimalFloat();

    private boolean hasHighPx;

    public boolean hasHighPx()
    {
        return hasHighPx;
    }

    public SecurityStatusEncoder highPx(DecimalFloat value)
    {
        highPx.set(value);
        hasHighPx = true;
        return this;
    }

    public SecurityStatusEncoder highPx(long value, int scale)
    {
        highPx.set(value, scale);
        hasHighPx = true;
        return this;
    }

    public DecimalFloat highPx()
    {
        return highPx;
    }

    private final DecimalFloat lowPx = new DecimalFloat();

    private boolean hasLowPx;

    public boolean hasLowPx()
    {
        return hasLowPx;
    }

    public SecurityStatusEncoder lowPx(DecimalFloat value)
    {
        lowPx.set(value);
        hasLowPx = true;
        return this;
    }

    public SecurityStatusEncoder lowPx(long value, int scale)
    {
        lowPx.set(value, scale);
        hasLowPx = true;
        return this;
    }

    public DecimalFloat lowPx()
    {
        return lowPx;
    }

    private final DecimalFloat lastPx = new DecimalFloat();

    private boolean hasLastPx;

    public boolean hasLastPx()
    {
        return hasLastPx;
    }

    public SecurityStatusEncoder lastPx(DecimalFloat value)
    {
        lastPx.set(value);
        hasLastPx = true;
        return this;
    }

    public SecurityStatusEncoder lastPx(long value, int scale)
    {
        lastPx.set(value, scale);
        hasLastPx = true;
        return this;
    }

    public DecimalFloat lastPx()
    {
        return lastPx;
    }

    private final MutableDirectBuffer transactTime = new UnsafeBuffer();

    private int transactTimeOffset = 0;

    private int transactTimeLength = 0;

    public SecurityStatusEncoder transactTime(final DirectBuffer value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public SecurityStatusEncoder transactTime(final DirectBuffer value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public SecurityStatusEncoder transactTime(final DirectBuffer value)
    {
        return transactTime(value, 0, value.capacity());
    }

    public SecurityStatusEncoder transactTime(final byte[] value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public SecurityStatusEncoder transactTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(transactTime, value, offset, length);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public SecurityStatusEncoder transactTime(final byte[] value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public SecurityStatusEncoder transactTime(final byte[] value)
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

    private int adjustment;

    private boolean hasAdjustment;

    public boolean hasAdjustment()
    {
        return hasAdjustment;
    }

    public SecurityStatusEncoder adjustment(int value)
    {
        adjustment = value;
        hasAdjustment = true;
        return this;
    }

    public int adjustment()
    {
        return adjustment;
    }

    public SecurityStatusEncoder adjustment(Adjustment value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == Adjustment.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: adjustment Value: " + value );
            }
            if (value == Adjustment.NULL_VAL)
            {
                return this;
            }
        }
        return adjustment(value.representation());
    }

    private final MutableDirectBuffer text = new UnsafeBuffer();

    private int textOffset = 0;

    private int textLength = 0;

    public SecurityStatusEncoder text(final DirectBuffer value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public SecurityStatusEncoder text(final DirectBuffer value, final int length)
    {
        return text(value, 0, length);
    }

    public SecurityStatusEncoder text(final DirectBuffer value)
    {
        return text(value, 0, value.capacity());
    }

    public SecurityStatusEncoder text(final byte[] value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public SecurityStatusEncoder textAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(text, value, offset, length);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public SecurityStatusEncoder text(final byte[] value, final int length)
    {
        return text(value, 0, length);
    }

    public SecurityStatusEncoder text(final byte[] value)
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

    public SecurityStatusEncoder text(final CharSequence value)
    {
        toBytes(value, text);
        textOffset = 0;
        textLength = value.length();
        return this;
    }

    public SecurityStatusEncoder text(final AsciiSequenceView value)
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

    public SecurityStatusEncoder text(final char[] value)
    {
        return text(value, 0, value.length);
    }

    public SecurityStatusEncoder text(final char[] value, final int length)
    {
        return text(value, 0, length);
    }

    public SecurityStatusEncoder text(final char[] value, final int offset, final int length)
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

    public SecurityStatusEncoder encodedTextLen(int value)
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

    public SecurityStatusEncoder encodedText(byte[] value)
    {
        encodedText = value;
        hasEncodedText = true;
        return this;
    }

    public byte[] encodedText()
    {
        return encodedText;
    }

    public SecurityStatusEncoder encodedTextAsCopy(final byte[] value, final int offset, final int length)
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

        if (securityStatusReqIDLength > 0)
        {
            buffer.putBytes(position, securityStatusReqIDHeader, 0, securityStatusReqIDHeaderLength);
            position += securityStatusReqIDHeaderLength;
            buffer.putBytes(position, securityStatusReqID, securityStatusReqIDOffset, securityStatusReqIDLength);
            position += securityStatusReqIDLength;
            buffer.putSeparator(position);
            position++;
        }

            position += instrument.encode(buffer, position);

            position += instrumentExtension.encode(buffer, position);

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


        if (currencyLength > 0)
        {
            buffer.putBytes(position, currencyHeader, 0, currencyHeaderLength);
            position += currencyHeaderLength;
            buffer.putBytes(position, currency, currencyOffset, currencyLength);
            position += currencyLength;
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

        if (hasUnsolicitedIndicator)
        {
            buffer.putBytes(position, unsolicitedIndicatorHeader, 0, unsolicitedIndicatorHeaderLength);
            position += unsolicitedIndicatorHeaderLength;
            position += buffer.putBooleanAscii(position, unsolicitedIndicator);
            buffer.putSeparator(position);
            position++;
        }

        if (hasSecurityTradingStatus)
        {
            buffer.putBytes(position, securityTradingStatusHeader, 0, securityTradingStatusHeaderLength);
            position += securityTradingStatusHeaderLength;
            position += buffer.putIntAscii(position, securityTradingStatus);
            buffer.putSeparator(position);
            position++;
        }

        if (financialStatusLength > 0)
        {
            buffer.putBytes(position, financialStatusHeader, 0, financialStatusHeaderLength);
            position += financialStatusHeaderLength;
            buffer.putBytes(position, financialStatus, financialStatusOffset, financialStatusLength);
            position += financialStatusLength;
            buffer.putSeparator(position);
            position++;
        }

        if (corporateActionLength > 0)
        {
            buffer.putBytes(position, corporateActionHeader, 0, corporateActionHeaderLength);
            position += corporateActionHeaderLength;
            buffer.putBytes(position, corporateAction, corporateActionOffset, corporateActionLength);
            position += corporateActionLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasHaltReason)
        {
            buffer.putBytes(position, haltReasonHeader, 0, haltReasonHeaderLength);
            position += haltReasonHeaderLength;
            position += buffer.putCharAscii(position, haltReason);
            buffer.putSeparator(position);
            position++;
        }

        if (hasInViewOfCommon)
        {
            buffer.putBytes(position, inViewOfCommonHeader, 0, inViewOfCommonHeaderLength);
            position += inViewOfCommonHeaderLength;
            position += buffer.putBooleanAscii(position, inViewOfCommon);
            buffer.putSeparator(position);
            position++;
        }

        if (hasDueToRelated)
        {
            buffer.putBytes(position, dueToRelatedHeader, 0, dueToRelatedHeaderLength);
            position += dueToRelatedHeaderLength;
            position += buffer.putBooleanAscii(position, dueToRelated);
            buffer.putSeparator(position);
            position++;
        }

        if (hasBuyVolume)
        {
            buffer.putBytes(position, buyVolumeHeader, 0, buyVolumeHeaderLength);
            position += buyVolumeHeaderLength;
            position += buffer.putFloatAscii(position, buyVolume);
            buffer.putSeparator(position);
            position++;
        }

        if (hasSellVolume)
        {
            buffer.putBytes(position, sellVolumeHeader, 0, sellVolumeHeaderLength);
            position += sellVolumeHeaderLength;
            position += buffer.putFloatAscii(position, sellVolume);
            buffer.putSeparator(position);
            position++;
        }

        if (hasHighPx)
        {
            buffer.putBytes(position, highPxHeader, 0, highPxHeaderLength);
            position += highPxHeaderLength;
            position += buffer.putFloatAscii(position, highPx);
            buffer.putSeparator(position);
            position++;
        }

        if (hasLowPx)
        {
            buffer.putBytes(position, lowPxHeader, 0, lowPxHeaderLength);
            position += lowPxHeaderLength;
            position += buffer.putFloatAscii(position, lowPx);
            buffer.putSeparator(position);
            position++;
        }

        if (hasLastPx)
        {
            buffer.putBytes(position, lastPxHeader, 0, lastPxHeaderLength);
            position += lastPxHeaderLength;
            position += buffer.putFloatAscii(position, lastPx);
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

        if (hasAdjustment)
        {
            buffer.putBytes(position, adjustmentHeader, 0, adjustmentHeaderLength);
            position += adjustmentHeaderLength;
            position += buffer.putIntAscii(position, adjustment);
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
        this.resetSecurityStatusReqID();
        this.resetCurrency();
        this.resetTradingSessionID();
        this.resetTradingSessionSubID();
        this.resetUnsolicitedIndicator();
        this.resetSecurityTradingStatus();
        this.resetFinancialStatus();
        this.resetCorporateAction();
        this.resetHaltReason();
        this.resetInViewOfCommon();
        this.resetDueToRelated();
        this.resetBuyVolume();
        this.resetSellVolume();
        this.resetHighPx();
        this.resetLowPx();
        this.resetLastPx();
        this.resetTransactTime();
        this.resetAdjustment();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        instrument.reset();
        instrumentExtension.reset();
        this.resetUnderlyingsGroup();
        this.resetLegsGroup();
    }

    public void resetSecurityStatusReqID()
    {
        securityStatusReqIDLength = 0;
    }

    public void resetCurrency()
    {
        currencyLength = 0;
    }

    public void resetTradingSessionID()
    {
        tradingSessionIDLength = 0;
    }

    public void resetTradingSessionSubID()
    {
        tradingSessionSubIDLength = 0;
    }

    public void resetUnsolicitedIndicator()
    {
        hasUnsolicitedIndicator = false;
    }

    public void resetSecurityTradingStatus()
    {
        hasSecurityTradingStatus = false;
    }

    public void resetFinancialStatus()
    {
        financialStatusLength = 0;
    }

    public void resetCorporateAction()
    {
        corporateActionLength = 0;
    }

    public void resetHaltReason()
    {
        hasHaltReason = false;
    }

    public void resetInViewOfCommon()
    {
        hasInViewOfCommon = false;
    }

    public void resetDueToRelated()
    {
        hasDueToRelated = false;
    }

    public void resetBuyVolume()
    {
        hasBuyVolume = false;
    }

    public void resetSellVolume()
    {
        hasSellVolume = false;
    }

    public void resetHighPx()
    {
        hasHighPx = false;
    }

    public void resetLowPx()
    {
        hasLowPx = false;
    }

    public void resetLastPx()
    {
        hasLastPx = false;
    }

    public void resetTransactTime()
    {
        transactTimeLength = 0;
    }

    public void resetAdjustment()
    {
        hasAdjustment = false;
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

    public void resetUnderlyingsGroup()
    {
        if (underlyingsGroup != null)
        {
            underlyingsGroup.reset();
        }
        noUnderlyingsGroupCounter = 0;
        hasNoUnderlyingsGroupCounter = false;
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
        builder.append("\"MessageName\": \"SecurityStatus\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasSecurityStatusReqID())
        {
            indent(builder, level);
            builder.append("\"SecurityStatusReqID\": \"");
            appendBuffer(builder, securityStatusReqID, securityStatusReqIDOffset, securityStatusReqIDLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"Instrument\": ");
    instrument.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"InstrumentExtension\": ");
    instrumentExtension.appendTo(builder, level + 1);
    builder.append("\n");

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

        if (hasCurrency())
        {
            indent(builder, level);
            builder.append("\"Currency\": \"");
            appendBuffer(builder, currency, currencyOffset, currencyLength);
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

        if (hasUnsolicitedIndicator())
        {
            indent(builder, level);
            builder.append("\"UnsolicitedIndicator\": \"");
            builder.append(unsolicitedIndicator);
            builder.append("\",\n");
        }

        if (hasSecurityTradingStatus())
        {
            indent(builder, level);
            builder.append("\"SecurityTradingStatus\": \"");
            builder.append(securityTradingStatus);
            builder.append("\",\n");
        }

        if (hasFinancialStatus())
        {
            indent(builder, level);
            builder.append("\"FinancialStatus\": \"");
            appendBuffer(builder, financialStatus, financialStatusOffset, financialStatusLength);
            builder.append("\",\n");
        }

        if (hasCorporateAction())
        {
            indent(builder, level);
            builder.append("\"CorporateAction\": \"");
            appendBuffer(builder, corporateAction, corporateActionOffset, corporateActionLength);
            builder.append("\",\n");
        }

        if (hasHaltReason())
        {
            indent(builder, level);
            builder.append("\"HaltReason\": \"");
            builder.append(haltReason);
            builder.append("\",\n");
        }

        if (hasInViewOfCommon())
        {
            indent(builder, level);
            builder.append("\"InViewOfCommon\": \"");
            builder.append(inViewOfCommon);
            builder.append("\",\n");
        }

        if (hasDueToRelated())
        {
            indent(builder, level);
            builder.append("\"DueToRelated\": \"");
            builder.append(dueToRelated);
            builder.append("\",\n");
        }

        if (hasBuyVolume())
        {
            indent(builder, level);
            builder.append("\"BuyVolume\": \"");
            buyVolume.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasSellVolume())
        {
            indent(builder, level);
            builder.append("\"SellVolume\": \"");
            sellVolume.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasHighPx())
        {
            indent(builder, level);
            builder.append("\"HighPx\": \"");
            highPx.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasLowPx())
        {
            indent(builder, level);
            builder.append("\"LowPx\": \"");
            lowPx.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasLastPx())
        {
            indent(builder, level);
            builder.append("\"LastPx\": \"");
            lastPx.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasTransactTime())
        {
            indent(builder, level);
            builder.append("\"TransactTime\": \"");
            appendBuffer(builder, transactTime, transactTimeOffset, transactTimeLength);
            builder.append("\",\n");
        }

        if (hasAdjustment())
        {
            indent(builder, level);
            builder.append("\"Adjustment\": \"");
            builder.append(adjustment);
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
    public SecurityStatusEncoder copyTo(final Encoder encoder)
    {
        return copyTo((SecurityStatusEncoder)encoder);
    }

    public SecurityStatusEncoder copyTo(final SecurityStatusEncoder encoder)
    {
        encoder.reset();
        if (hasSecurityStatusReqID())
        {
            encoder.securityStatusReqIDAsCopy(securityStatusReqID.byteArray(), 0, securityStatusReqIDLength);
        }


        instrument.copyTo(encoder.instrument());

        instrumentExtension.copyTo(encoder.instrumentExtension());
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

        if (hasCurrency())
        {
            encoder.currencyAsCopy(currency.byteArray(), 0, currencyLength);
        }

        if (hasTradingSessionID())
        {
            encoder.tradingSessionIDAsCopy(tradingSessionID.byteArray(), 0, tradingSessionIDLength);
        }

        if (hasTradingSessionSubID())
        {
            encoder.tradingSessionSubIDAsCopy(tradingSessionSubID.byteArray(), 0, tradingSessionSubIDLength);
        }

        if (hasUnsolicitedIndicator())
        {
            encoder.unsolicitedIndicator(this.unsolicitedIndicator());
        }

        if (hasSecurityTradingStatus())
        {
            encoder.securityTradingStatus(this.securityTradingStatus());
        }

        if (hasFinancialStatus())
        {
            encoder.financialStatusAsCopy(financialStatus.byteArray(), 0, financialStatusLength);
        }

        if (hasCorporateAction())
        {
            encoder.corporateActionAsCopy(corporateAction.byteArray(), 0, corporateActionLength);
        }

        if (hasHaltReason())
        {
            encoder.haltReason(this.haltReason());
        }

        if (hasInViewOfCommon())
        {
            encoder.inViewOfCommon(this.inViewOfCommon());
        }

        if (hasDueToRelated())
        {
            encoder.dueToRelated(this.dueToRelated());
        }

        if (hasBuyVolume())
        {
            encoder.buyVolume(this.buyVolume());
        }

        if (hasSellVolume())
        {
            encoder.sellVolume(this.sellVolume());
        }

        if (hasHighPx())
        {
            encoder.highPx(this.highPx());
        }

        if (hasLowPx())
        {
            encoder.lowPx(this.lowPx());
        }

        if (hasLastPx())
        {
            encoder.lastPx(this.lastPx());
        }

        if (hasTransactTime())
        {
            encoder.transactTimeAsCopy(transactTime.byteArray(), 0, transactTimeLength);
        }

        if (hasAdjustment())
        {
            encoder.adjustment(this.adjustment());
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
