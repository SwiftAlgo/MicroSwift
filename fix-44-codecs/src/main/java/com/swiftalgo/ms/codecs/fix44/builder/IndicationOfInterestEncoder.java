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


public class IndicationOfInterestEncoder implements Encoder
{
    public long messageType()
    {
        return 54L;
    }

    public IndicationOfInterestEncoder()
    {
        header.msgType("6");
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

    private static final int iOIIDHeaderLength = 3;
    private static final byte[] iOIIDHeader = new byte[] {50, 51, (byte) '='};

    private static final int iOITransTypeHeaderLength = 3;
    private static final byte[] iOITransTypeHeader = new byte[] {50, 56, (byte) '='};

    private static final int iOIRefIDHeaderLength = 3;
    private static final byte[] iOIRefIDHeader = new byte[] {50, 54, (byte) '='};

    private static final int noUnderlyingsGroupCounterHeaderLength = 4;
    private static final byte[] noUnderlyingsGroupCounterHeader = new byte[] {55, 49, 49, (byte) '='};

    private static final int sideHeaderLength = 3;
    private static final byte[] sideHeader = new byte[] {53, 52, (byte) '='};

    private static final int qtyTypeHeaderLength = 4;
    private static final byte[] qtyTypeHeader = new byte[] {56, 53, 52, (byte) '='};

    private static final int iOIQtyHeaderLength = 3;
    private static final byte[] iOIQtyHeader = new byte[] {50, 55, (byte) '='};

    private static final int currencyHeaderLength = 3;
    private static final byte[] currencyHeader = new byte[] {49, 53, (byte) '='};

    private static final int noLegsGroupCounterHeaderLength = 4;
    private static final byte[] noLegsGroupCounterHeader = new byte[] {53, 53, 53, (byte) '='};

    private static final int priceTypeHeaderLength = 4;
    private static final byte[] priceTypeHeader = new byte[] {52, 50, 51, (byte) '='};

    private static final int priceHeaderLength = 3;
    private static final byte[] priceHeader = new byte[] {52, 52, (byte) '='};

    private static final int validUntilTimeHeaderLength = 3;
    private static final byte[] validUntilTimeHeader = new byte[] {54, 50, (byte) '='};

    private static final int iOIQltyIndHeaderLength = 3;
    private static final byte[] iOIQltyIndHeader = new byte[] {50, 53, (byte) '='};

    private static final int iOINaturalFlagHeaderLength = 4;
    private static final byte[] iOINaturalFlagHeader = new byte[] {49, 51, 48, (byte) '='};

    private static final int noIOIQualifiersGroupCounterHeaderLength = 4;
    private static final byte[] noIOIQualifiersGroupCounterHeader = new byte[] {49, 57, 57, (byte) '='};

    private static final int textHeaderLength = 3;
    private static final byte[] textHeader = new byte[] {53, 56, (byte) '='};

    private static final int encodedTextLenHeaderLength = 4;
    private static final byte[] encodedTextLenHeader = new byte[] {51, 53, 52, (byte) '='};

    private static final int encodedTextHeaderLength = 4;
    private static final byte[] encodedTextHeader = new byte[] {51, 53, 53, (byte) '='};

    private static final int transactTimeHeaderLength = 3;
    private static final byte[] transactTimeHeader = new byte[] {54, 48, (byte) '='};

    private static final int uRLLinkHeaderLength = 4;
    private static final byte[] uRLLinkHeader = new byte[] {49, 52, 57, (byte) '='};

    private static final int noRoutingIDsGroupCounterHeaderLength = 4;
    private static final byte[] noRoutingIDsGroupCounterHeader = new byte[] {50, 49, 53, (byte) '='};

    private final MutableDirectBuffer iOIID = new UnsafeBuffer();

    private int iOIIDOffset = 0;

    private int iOIIDLength = 0;

    public IndicationOfInterestEncoder iOIID(final DirectBuffer value, final int offset, final int length)
    {
        iOIID.wrap(value);
        iOIIDOffset = offset;
        iOIIDLength = length;
        return this;
    }

    public IndicationOfInterestEncoder iOIID(final DirectBuffer value, final int length)
    {
        return iOIID(value, 0, length);
    }

    public IndicationOfInterestEncoder iOIID(final DirectBuffer value)
    {
        return iOIID(value, 0, value.capacity());
    }

    public IndicationOfInterestEncoder iOIID(final byte[] value, final int offset, final int length)
    {
        iOIID.wrap(value);
        iOIIDOffset = offset;
        iOIIDLength = length;
        return this;
    }

    public IndicationOfInterestEncoder iOIIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(iOIID, value, offset, length);
        iOIIDOffset = offset;
        iOIIDLength = length;
        return this;
    }

    public IndicationOfInterestEncoder iOIID(final byte[] value, final int length)
    {
        return iOIID(value, 0, length);
    }

    public IndicationOfInterestEncoder iOIID(final byte[] value)
    {
        return iOIID(value, 0, value.length);
    }

    public boolean hasIOIID()
    {
        return iOIIDLength > 0;
    }

    public MutableDirectBuffer iOIID()
    {
        return iOIID;
    }

    public String iOIIDAsString()
    {
        return iOIID.getStringWithoutLengthAscii(iOIIDOffset, iOIIDLength);
    }

    public IndicationOfInterestEncoder iOIID(final CharSequence value)
    {
        toBytes(value, iOIID);
        iOIIDOffset = 0;
        iOIIDLength = value.length();
        return this;
    }

    public IndicationOfInterestEncoder iOIID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            iOIID.wrap(buffer);
            iOIIDOffset = value.offset();
            iOIIDLength = value.length();
        }
        return this;
    }

    public IndicationOfInterestEncoder iOIID(final char[] value)
    {
        return iOIID(value, 0, value.length);
    }

    public IndicationOfInterestEncoder iOIID(final char[] value, final int length)
    {
        return iOIID(value, 0, length);
    }

    public IndicationOfInterestEncoder iOIID(final char[] value, final int offset, final int length)
    {
        toBytes(value, iOIID, offset, length);
        iOIIDOffset = 0;
        iOIIDLength = length;
        return this;
    }

    private char iOITransType;

    private boolean hasIOITransType;

    public boolean hasIOITransType()
    {
        return hasIOITransType;
    }

    public IndicationOfInterestEncoder iOITransType(char value)
    {
        iOITransType = value;
        hasIOITransType = true;
        return this;
    }

    public char iOITransType()
    {
        return iOITransType;
    }

    public IndicationOfInterestEncoder iOITransType(IOITransType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == IOITransType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: iOITransType Value: " + value );
            }
            if (value == IOITransType.NULL_VAL)
            {
                return this;
            }
        }
        return iOITransType(value.representation());
    }

    private final MutableDirectBuffer iOIRefID = new UnsafeBuffer();

    private int iOIRefIDOffset = 0;

    private int iOIRefIDLength = 0;

    public IndicationOfInterestEncoder iOIRefID(final DirectBuffer value, final int offset, final int length)
    {
        iOIRefID.wrap(value);
        iOIRefIDOffset = offset;
        iOIRefIDLength = length;
        return this;
    }

    public IndicationOfInterestEncoder iOIRefID(final DirectBuffer value, final int length)
    {
        return iOIRefID(value, 0, length);
    }

    public IndicationOfInterestEncoder iOIRefID(final DirectBuffer value)
    {
        return iOIRefID(value, 0, value.capacity());
    }

    public IndicationOfInterestEncoder iOIRefID(final byte[] value, final int offset, final int length)
    {
        iOIRefID.wrap(value);
        iOIRefIDOffset = offset;
        iOIRefIDLength = length;
        return this;
    }

    public IndicationOfInterestEncoder iOIRefIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(iOIRefID, value, offset, length);
        iOIRefIDOffset = offset;
        iOIRefIDLength = length;
        return this;
    }

    public IndicationOfInterestEncoder iOIRefID(final byte[] value, final int length)
    {
        return iOIRefID(value, 0, length);
    }

    public IndicationOfInterestEncoder iOIRefID(final byte[] value)
    {
        return iOIRefID(value, 0, value.length);
    }

    public boolean hasIOIRefID()
    {
        return iOIRefIDLength > 0;
    }

    public MutableDirectBuffer iOIRefID()
    {
        return iOIRefID;
    }

    public String iOIRefIDAsString()
    {
        return iOIRefID.getStringWithoutLengthAscii(iOIRefIDOffset, iOIRefIDLength);
    }

    public IndicationOfInterestEncoder iOIRefID(final CharSequence value)
    {
        toBytes(value, iOIRefID);
        iOIRefIDOffset = 0;
        iOIRefIDLength = value.length();
        return this;
    }

    public IndicationOfInterestEncoder iOIRefID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            iOIRefID.wrap(buffer);
            iOIRefIDOffset = value.offset();
            iOIRefIDLength = value.length();
        }
        return this;
    }

    public IndicationOfInterestEncoder iOIRefID(final char[] value)
    {
        return iOIRefID(value, 0, value.length);
    }

    public IndicationOfInterestEncoder iOIRefID(final char[] value, final int length)
    {
        return iOIRefID(value, 0, length);
    }

    public IndicationOfInterestEncoder iOIRefID(final char[] value, final int offset, final int length)
    {
        toBytes(value, iOIRefID, offset, length);
        iOIRefIDOffset = 0;
        iOIRefIDLength = length;
        return this;
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

    public IndicationOfInterestEncoder noUnderlyingsGroupCounter(int value)
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

    private char side;

    private boolean hasSide;

    public boolean hasSide()
    {
        return hasSide;
    }

    public IndicationOfInterestEncoder side(char value)
    {
        side = value;
        hasSide = true;
        return this;
    }

    public char side()
    {
        return side;
    }

    public IndicationOfInterestEncoder side(Side value)
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

    private int qtyType;

    private boolean hasQtyType;

    public boolean hasQtyType()
    {
        return hasQtyType;
    }

    public IndicationOfInterestEncoder qtyType(int value)
    {
        qtyType = value;
        hasQtyType = true;
        return this;
    }

    public int qtyType()
    {
        return qtyType;
    }

    public IndicationOfInterestEncoder qtyType(QtyType value)
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

    private final OrderQtyDataEncoder orderQtyData = new OrderQtyDataEncoder();
    public OrderQtyDataEncoder orderQtyData()
    {
        return orderQtyData;
    }

    private final MutableDirectBuffer iOIQty = new UnsafeBuffer();

    private int iOIQtyOffset = 0;

    private int iOIQtyLength = 0;

    public IndicationOfInterestEncoder iOIQty(final DirectBuffer value, final int offset, final int length)
    {
        iOIQty.wrap(value);
        iOIQtyOffset = offset;
        iOIQtyLength = length;
        return this;
    }

    public IndicationOfInterestEncoder iOIQty(final DirectBuffer value, final int length)
    {
        return iOIQty(value, 0, length);
    }

    public IndicationOfInterestEncoder iOIQty(final DirectBuffer value)
    {
        return iOIQty(value, 0, value.capacity());
    }

    public IndicationOfInterestEncoder iOIQty(final byte[] value, final int offset, final int length)
    {
        iOIQty.wrap(value);
        iOIQtyOffset = offset;
        iOIQtyLength = length;
        return this;
    }

    public IndicationOfInterestEncoder iOIQtyAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(iOIQty, value, offset, length);
        iOIQtyOffset = offset;
        iOIQtyLength = length;
        return this;
    }

    public IndicationOfInterestEncoder iOIQty(final byte[] value, final int length)
    {
        return iOIQty(value, 0, length);
    }

    public IndicationOfInterestEncoder iOIQty(final byte[] value)
    {
        return iOIQty(value, 0, value.length);
    }

    public boolean hasIOIQty()
    {
        return iOIQtyLength > 0;
    }

    public MutableDirectBuffer iOIQty()
    {
        return iOIQty;
    }

    public String iOIQtyAsString()
    {
        return iOIQty.getStringWithoutLengthAscii(iOIQtyOffset, iOIQtyLength);
    }

    public IndicationOfInterestEncoder iOIQty(final CharSequence value)
    {
        toBytes(value, iOIQty);
        iOIQtyOffset = 0;
        iOIQtyLength = value.length();
        return this;
    }

    public IndicationOfInterestEncoder iOIQty(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            iOIQty.wrap(buffer);
            iOIQtyOffset = value.offset();
            iOIQtyLength = value.length();
        }
        return this;
    }

    public IndicationOfInterestEncoder iOIQty(final char[] value)
    {
        return iOIQty(value, 0, value.length);
    }

    public IndicationOfInterestEncoder iOIQty(final char[] value, final int length)
    {
        return iOIQty(value, 0, length);
    }

    public IndicationOfInterestEncoder iOIQty(final char[] value, final int offset, final int length)
    {
        toBytes(value, iOIQty, offset, length);
        iOIQtyOffset = 0;
        iOIQtyLength = length;
        return this;
    }

    private final MutableDirectBuffer currency = new UnsafeBuffer();

    private int currencyOffset = 0;

    private int currencyLength = 0;

    public IndicationOfInterestEncoder currency(final DirectBuffer value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public IndicationOfInterestEncoder currency(final DirectBuffer value, final int length)
    {
        return currency(value, 0, length);
    }

    public IndicationOfInterestEncoder currency(final DirectBuffer value)
    {
        return currency(value, 0, value.capacity());
    }

    public IndicationOfInterestEncoder currency(final byte[] value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public IndicationOfInterestEncoder currencyAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(currency, value, offset, length);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public IndicationOfInterestEncoder currency(final byte[] value, final int length)
    {
        return currency(value, 0, length);
    }

    public IndicationOfInterestEncoder currency(final byte[] value)
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

    public IndicationOfInterestEncoder currency(final CharSequence value)
    {
        toBytes(value, currency);
        currencyOffset = 0;
        currencyLength = value.length();
        return this;
    }

    public IndicationOfInterestEncoder currency(final AsciiSequenceView value)
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

    public IndicationOfInterestEncoder currency(final char[] value)
    {
        return currency(value, 0, value.length);
    }

    public IndicationOfInterestEncoder currency(final char[] value, final int length)
    {
        return currency(value, 0, length);
    }

    public IndicationOfInterestEncoder currency(final char[] value, final int offset, final int length)
    {
        toBytes(value, currency, offset, length);
        currencyOffset = 0;
        currencyLength = length;
        return this;
    }

    private final StipulationsEncoder stipulations = new StipulationsEncoder();
    public StipulationsEncoder stipulations()
    {
        return stipulations;
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

    private static final int legIOIQtyHeaderLength = 4;
    private static final byte[] legIOIQtyHeader = new byte[] {54, 56, 50, (byte) '='};

    private final InstrumentLegEncoder instrumentLeg = new InstrumentLegEncoder();
    public InstrumentLegEncoder instrumentLeg()
    {
        return instrumentLeg;
    }

    private final MutableDirectBuffer legIOIQty = new UnsafeBuffer();

    private int legIOIQtyOffset = 0;

    private int legIOIQtyLength = 0;

    public LegsGroupEncoder legIOIQty(final DirectBuffer value, final int offset, final int length)
    {
        legIOIQty.wrap(value);
        legIOIQtyOffset = offset;
        legIOIQtyLength = length;
        return this;
    }

    public LegsGroupEncoder legIOIQty(final DirectBuffer value, final int length)
    {
        return legIOIQty(value, 0, length);
    }

    public LegsGroupEncoder legIOIQty(final DirectBuffer value)
    {
        return legIOIQty(value, 0, value.capacity());
    }

    public LegsGroupEncoder legIOIQty(final byte[] value, final int offset, final int length)
    {
        legIOIQty.wrap(value);
        legIOIQtyOffset = offset;
        legIOIQtyLength = length;
        return this;
    }

    public LegsGroupEncoder legIOIQtyAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(legIOIQty, value, offset, length);
        legIOIQtyOffset = offset;
        legIOIQtyLength = length;
        return this;
    }

    public LegsGroupEncoder legIOIQty(final byte[] value, final int length)
    {
        return legIOIQty(value, 0, length);
    }

    public LegsGroupEncoder legIOIQty(final byte[] value)
    {
        return legIOIQty(value, 0, value.length);
    }

    public boolean hasLegIOIQty()
    {
        return legIOIQtyLength > 0;
    }

    public MutableDirectBuffer legIOIQty()
    {
        return legIOIQty;
    }

    public String legIOIQtyAsString()
    {
        return legIOIQty.getStringWithoutLengthAscii(legIOIQtyOffset, legIOIQtyLength);
    }

    public LegsGroupEncoder legIOIQty(final CharSequence value)
    {
        toBytes(value, legIOIQty);
        legIOIQtyOffset = 0;
        legIOIQtyLength = value.length();
        return this;
    }

    public LegsGroupEncoder legIOIQty(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            legIOIQty.wrap(buffer);
            legIOIQtyOffset = value.offset();
            legIOIQtyLength = value.length();
        }
        return this;
    }

    public LegsGroupEncoder legIOIQty(final char[] value)
    {
        return legIOIQty(value, 0, value.length);
    }

    public LegsGroupEncoder legIOIQty(final char[] value, final int length)
    {
        return legIOIQty(value, 0, length);
    }

    public LegsGroupEncoder legIOIQty(final char[] value, final int offset, final int length)
    {
        toBytes(value, legIOIQty, offset, length);
        legIOIQtyOffset = 0;
        legIOIQtyLength = length;
        return this;
    }

    private final LegStipulationsEncoder legStipulations = new LegStipulationsEncoder();
    public LegStipulationsEncoder legStipulations()
    {
        return legStipulations;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

            position += instrumentLeg.encode(buffer, position);

        if (legIOIQtyLength > 0)
        {
            buffer.putBytes(position, legIOIQtyHeader, 0, legIOIQtyHeaderLength);
            position += legIOIQtyHeaderLength;
            buffer.putBytes(position, legIOIQty, legIOIQtyOffset, legIOIQtyLength);
            position += legIOIQtyLength;
            buffer.putSeparator(position);
            position++;
        }

            position += legStipulations.encode(buffer, position);
        if (next != null)
        {
            position += next.encode(buffer, position, remainingElements - 1);
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetLegIOIQty();
        instrumentLeg.reset();
        legStipulations.reset();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetLegIOIQty()
    {
        legIOIQtyLength = 0;
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

        if (hasLegIOIQty())
        {
            indent(builder, level);
            builder.append("\"LegIOIQty\": \"");
            appendBuffer(builder, legIOIQty, legIOIQtyOffset, legIOIQtyLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"LegStipulations\": ");
    legStipulations.appendTo(builder, level + 1);
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

        instrumentLeg.copyTo(encoder.instrumentLeg());
        if (hasLegIOIQty())
        {
            encoder.legIOIQtyAsCopy(legIOIQty.byteArray(), 0, legIOIQtyLength);
        }


        legStipulations.copyTo(encoder.legStipulations());        return encoder;
    }

}
    private int noLegsGroupCounter;

    private boolean hasNoLegsGroupCounter;

    public boolean hasNoLegsGroupCounter()
    {
        return hasNoLegsGroupCounter;
    }

    public IndicationOfInterestEncoder noLegsGroupCounter(int value)
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

    private int priceType;

    private boolean hasPriceType;

    public boolean hasPriceType()
    {
        return hasPriceType;
    }

    public IndicationOfInterestEncoder priceType(int value)
    {
        priceType = value;
        hasPriceType = true;
        return this;
    }

    public int priceType()
    {
        return priceType;
    }

    public IndicationOfInterestEncoder priceType(PriceType value)
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

    private final DecimalFloat price = new DecimalFloat();

    private boolean hasPrice;

    public boolean hasPrice()
    {
        return hasPrice;
    }

    public IndicationOfInterestEncoder price(DecimalFloat value)
    {
        price.set(value);
        hasPrice = true;
        return this;
    }

    public IndicationOfInterestEncoder price(long value, int scale)
    {
        price.set(value, scale);
        hasPrice = true;
        return this;
    }

    public DecimalFloat price()
    {
        return price;
    }

    private final MutableDirectBuffer validUntilTime = new UnsafeBuffer();

    private int validUntilTimeOffset = 0;

    private int validUntilTimeLength = 0;

    public IndicationOfInterestEncoder validUntilTime(final DirectBuffer value, final int offset, final int length)
    {
        validUntilTime.wrap(value);
        validUntilTimeOffset = offset;
        validUntilTimeLength = length;
        return this;
    }

    public IndicationOfInterestEncoder validUntilTime(final DirectBuffer value, final int length)
    {
        return validUntilTime(value, 0, length);
    }

    public IndicationOfInterestEncoder validUntilTime(final DirectBuffer value)
    {
        return validUntilTime(value, 0, value.capacity());
    }

    public IndicationOfInterestEncoder validUntilTime(final byte[] value, final int offset, final int length)
    {
        validUntilTime.wrap(value);
        validUntilTimeOffset = offset;
        validUntilTimeLength = length;
        return this;
    }

    public IndicationOfInterestEncoder validUntilTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(validUntilTime, value, offset, length);
        validUntilTimeOffset = offset;
        validUntilTimeLength = length;
        return this;
    }

    public IndicationOfInterestEncoder validUntilTime(final byte[] value, final int length)
    {
        return validUntilTime(value, 0, length);
    }

    public IndicationOfInterestEncoder validUntilTime(final byte[] value)
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

    private char iOIQltyInd;

    private boolean hasIOIQltyInd;

    public boolean hasIOIQltyInd()
    {
        return hasIOIQltyInd;
    }

    public IndicationOfInterestEncoder iOIQltyInd(char value)
    {
        iOIQltyInd = value;
        hasIOIQltyInd = true;
        return this;
    }

    public char iOIQltyInd()
    {
        return iOIQltyInd;
    }

    public IndicationOfInterestEncoder iOIQltyInd(IOIQltyInd value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == IOIQltyInd.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: iOIQltyInd Value: " + value );
            }
            if (value == IOIQltyInd.NULL_VAL)
            {
                return this;
            }
        }
        return iOIQltyInd(value.representation());
    }

    private boolean iOINaturalFlag;

    private boolean hasIOINaturalFlag;

    public boolean hasIOINaturalFlag()
    {
        return hasIOINaturalFlag;
    }

    public IndicationOfInterestEncoder iOINaturalFlag(boolean value)
    {
        iOINaturalFlag = value;
        hasIOINaturalFlag = true;
        return this;
    }

    public boolean iOINaturalFlag()
    {
        return iOINaturalFlag;
    }



public static class IOIQualifiersGroupEncoder
{
    private IOIQualifiersGroupEncoder next = null;

    public IOIQualifiersGroupEncoder next()
    {
        if (next == null)
        {
            next = new IOIQualifiersGroupEncoder();
        }
        return next;
    }

    private static final int iOIQualifierHeaderLength = 4;
    private static final byte[] iOIQualifierHeader = new byte[] {49, 48, 52, (byte) '='};

    private char iOIQualifier;

    private boolean hasIOIQualifier;

    public boolean hasIOIQualifier()
    {
        return hasIOIQualifier;
    }

    public IOIQualifiersGroupEncoder iOIQualifier(char value)
    {
        iOIQualifier = value;
        hasIOIQualifier = true;
        return this;
    }

    public char iOIQualifier()
    {
        return iOIQualifier;
    }

    public IOIQualifiersGroupEncoder iOIQualifier(IOIQualifier value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == IOIQualifier.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: iOIQualifier Value: " + value );
            }
            if (value == IOIQualifier.NULL_VAL)
            {
                return this;
            }
        }
        return iOIQualifier(value.representation());
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (hasIOIQualifier)
        {
            buffer.putBytes(position, iOIQualifierHeader, 0, iOIQualifierHeaderLength);
            position += iOIQualifierHeaderLength;
            position += buffer.putCharAscii(position, iOIQualifier);
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
        this.resetIOIQualifier();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetIOIQualifier()
    {
        hasIOIQualifier = false;
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
        builder.append("\"MessageName\": \"IOIQualifiersGroup\",\n");
        if (hasIOIQualifier())
        {
            indent(builder, level);
            builder.append("\"IOIQualifier\": \"");
            builder.append(iOIQualifier);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public IOIQualifiersGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((IOIQualifiersGroupEncoder)encoder);
    }

    public IOIQualifiersGroupEncoder copyTo(final IOIQualifiersGroupEncoder encoder)
    {
        encoder.reset();
        if (hasIOIQualifier())
        {
            encoder.iOIQualifier(this.iOIQualifier());
        }
        return encoder;
    }

}
    private int noIOIQualifiersGroupCounter;

    private boolean hasNoIOIQualifiersGroupCounter;

    public boolean hasNoIOIQualifiersGroupCounter()
    {
        return hasNoIOIQualifiersGroupCounter;
    }

    public IndicationOfInterestEncoder noIOIQualifiersGroupCounter(int value)
    {
        noIOIQualifiersGroupCounter = value;
        hasNoIOIQualifiersGroupCounter = true;
        return this;
    }

    public int noIOIQualifiersGroupCounter()
    {
        return noIOIQualifiersGroupCounter;
    }


    private IOIQualifiersGroupEncoder iOIQualifiersGroup = null;

    public IOIQualifiersGroupEncoder iOIQualifiersGroup(final int numberOfElements)
    {
        hasNoIOIQualifiersGroupCounter = true;
        noIOIQualifiersGroupCounter = numberOfElements;
        if (iOIQualifiersGroup == null)
        {
            iOIQualifiersGroup = new IOIQualifiersGroupEncoder();
        }
        return iOIQualifiersGroup;
    }

    private final MutableDirectBuffer text = new UnsafeBuffer();

    private int textOffset = 0;

    private int textLength = 0;

    public IndicationOfInterestEncoder text(final DirectBuffer value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public IndicationOfInterestEncoder text(final DirectBuffer value, final int length)
    {
        return text(value, 0, length);
    }

    public IndicationOfInterestEncoder text(final DirectBuffer value)
    {
        return text(value, 0, value.capacity());
    }

    public IndicationOfInterestEncoder text(final byte[] value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public IndicationOfInterestEncoder textAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(text, value, offset, length);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public IndicationOfInterestEncoder text(final byte[] value, final int length)
    {
        return text(value, 0, length);
    }

    public IndicationOfInterestEncoder text(final byte[] value)
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

    public IndicationOfInterestEncoder text(final CharSequence value)
    {
        toBytes(value, text);
        textOffset = 0;
        textLength = value.length();
        return this;
    }

    public IndicationOfInterestEncoder text(final AsciiSequenceView value)
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

    public IndicationOfInterestEncoder text(final char[] value)
    {
        return text(value, 0, value.length);
    }

    public IndicationOfInterestEncoder text(final char[] value, final int length)
    {
        return text(value, 0, length);
    }

    public IndicationOfInterestEncoder text(final char[] value, final int offset, final int length)
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

    public IndicationOfInterestEncoder encodedTextLen(int value)
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

    public IndicationOfInterestEncoder encodedText(byte[] value)
    {
        encodedText = value;
        hasEncodedText = true;
        return this;
    }

    public byte[] encodedText()
    {
        return encodedText;
    }

    public IndicationOfInterestEncoder encodedTextAsCopy(final byte[] value, final int offset, final int length)
    {
        encodedText = copyInto(encodedText, value, offset, length);
        hasEncodedText = true;
        return this;
    }

    private final MutableDirectBuffer transactTime = new UnsafeBuffer();

    private int transactTimeOffset = 0;

    private int transactTimeLength = 0;

    public IndicationOfInterestEncoder transactTime(final DirectBuffer value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public IndicationOfInterestEncoder transactTime(final DirectBuffer value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public IndicationOfInterestEncoder transactTime(final DirectBuffer value)
    {
        return transactTime(value, 0, value.capacity());
    }

    public IndicationOfInterestEncoder transactTime(final byte[] value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public IndicationOfInterestEncoder transactTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(transactTime, value, offset, length);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public IndicationOfInterestEncoder transactTime(final byte[] value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public IndicationOfInterestEncoder transactTime(final byte[] value)
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

    private final MutableDirectBuffer uRLLink = new UnsafeBuffer();

    private int uRLLinkOffset = 0;

    private int uRLLinkLength = 0;

    public IndicationOfInterestEncoder uRLLink(final DirectBuffer value, final int offset, final int length)
    {
        uRLLink.wrap(value);
        uRLLinkOffset = offset;
        uRLLinkLength = length;
        return this;
    }

    public IndicationOfInterestEncoder uRLLink(final DirectBuffer value, final int length)
    {
        return uRLLink(value, 0, length);
    }

    public IndicationOfInterestEncoder uRLLink(final DirectBuffer value)
    {
        return uRLLink(value, 0, value.capacity());
    }

    public IndicationOfInterestEncoder uRLLink(final byte[] value, final int offset, final int length)
    {
        uRLLink.wrap(value);
        uRLLinkOffset = offset;
        uRLLinkLength = length;
        return this;
    }

    public IndicationOfInterestEncoder uRLLinkAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(uRLLink, value, offset, length);
        uRLLinkOffset = offset;
        uRLLinkLength = length;
        return this;
    }

    public IndicationOfInterestEncoder uRLLink(final byte[] value, final int length)
    {
        return uRLLink(value, 0, length);
    }

    public IndicationOfInterestEncoder uRLLink(final byte[] value)
    {
        return uRLLink(value, 0, value.length);
    }

    public boolean hasURLLink()
    {
        return uRLLinkLength > 0;
    }

    public MutableDirectBuffer uRLLink()
    {
        return uRLLink;
    }

    public String uRLLinkAsString()
    {
        return uRLLink.getStringWithoutLengthAscii(uRLLinkOffset, uRLLinkLength);
    }

    public IndicationOfInterestEncoder uRLLink(final CharSequence value)
    {
        toBytes(value, uRLLink);
        uRLLinkOffset = 0;
        uRLLinkLength = value.length();
        return this;
    }

    public IndicationOfInterestEncoder uRLLink(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            uRLLink.wrap(buffer);
            uRLLinkOffset = value.offset();
            uRLLinkLength = value.length();
        }
        return this;
    }

    public IndicationOfInterestEncoder uRLLink(final char[] value)
    {
        return uRLLink(value, 0, value.length);
    }

    public IndicationOfInterestEncoder uRLLink(final char[] value, final int length)
    {
        return uRLLink(value, 0, length);
    }

    public IndicationOfInterestEncoder uRLLink(final char[] value, final int offset, final int length)
    {
        toBytes(value, uRLLink, offset, length);
        uRLLinkOffset = 0;
        uRLLinkLength = length;
        return this;
    }



public static class RoutingIDsGroupEncoder
{
    private RoutingIDsGroupEncoder next = null;

    public RoutingIDsGroupEncoder next()
    {
        if (next == null)
        {
            next = new RoutingIDsGroupEncoder();
        }
        return next;
    }

    private static final int routingTypeHeaderLength = 4;
    private static final byte[] routingTypeHeader = new byte[] {50, 49, 54, (byte) '='};

    private static final int routingIDHeaderLength = 4;
    private static final byte[] routingIDHeader = new byte[] {50, 49, 55, (byte) '='};

    private int routingType;

    private boolean hasRoutingType;

    public boolean hasRoutingType()
    {
        return hasRoutingType;
    }

    public RoutingIDsGroupEncoder routingType(int value)
    {
        routingType = value;
        hasRoutingType = true;
        return this;
    }

    public int routingType()
    {
        return routingType;
    }

    public RoutingIDsGroupEncoder routingType(RoutingType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == RoutingType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: routingType Value: " + value );
            }
            if (value == RoutingType.NULL_VAL)
            {
                return this;
            }
        }
        return routingType(value.representation());
    }

    private final MutableDirectBuffer routingID = new UnsafeBuffer();

    private int routingIDOffset = 0;

    private int routingIDLength = 0;

    public RoutingIDsGroupEncoder routingID(final DirectBuffer value, final int offset, final int length)
    {
        routingID.wrap(value);
        routingIDOffset = offset;
        routingIDLength = length;
        return this;
    }

    public RoutingIDsGroupEncoder routingID(final DirectBuffer value, final int length)
    {
        return routingID(value, 0, length);
    }

    public RoutingIDsGroupEncoder routingID(final DirectBuffer value)
    {
        return routingID(value, 0, value.capacity());
    }

    public RoutingIDsGroupEncoder routingID(final byte[] value, final int offset, final int length)
    {
        routingID.wrap(value);
        routingIDOffset = offset;
        routingIDLength = length;
        return this;
    }

    public RoutingIDsGroupEncoder routingIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(routingID, value, offset, length);
        routingIDOffset = offset;
        routingIDLength = length;
        return this;
    }

    public RoutingIDsGroupEncoder routingID(final byte[] value, final int length)
    {
        return routingID(value, 0, length);
    }

    public RoutingIDsGroupEncoder routingID(final byte[] value)
    {
        return routingID(value, 0, value.length);
    }

    public boolean hasRoutingID()
    {
        return routingIDLength > 0;
    }

    public MutableDirectBuffer routingID()
    {
        return routingID;
    }

    public String routingIDAsString()
    {
        return routingID.getStringWithoutLengthAscii(routingIDOffset, routingIDLength);
    }

    public RoutingIDsGroupEncoder routingID(final CharSequence value)
    {
        toBytes(value, routingID);
        routingIDOffset = 0;
        routingIDLength = value.length();
        return this;
    }

    public RoutingIDsGroupEncoder routingID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            routingID.wrap(buffer);
            routingIDOffset = value.offset();
            routingIDLength = value.length();
        }
        return this;
    }

    public RoutingIDsGroupEncoder routingID(final char[] value)
    {
        return routingID(value, 0, value.length);
    }

    public RoutingIDsGroupEncoder routingID(final char[] value, final int length)
    {
        return routingID(value, 0, length);
    }

    public RoutingIDsGroupEncoder routingID(final char[] value, final int offset, final int length)
    {
        toBytes(value, routingID, offset, length);
        routingIDOffset = 0;
        routingIDLength = length;
        return this;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (hasRoutingType)
        {
            buffer.putBytes(position, routingTypeHeader, 0, routingTypeHeaderLength);
            position += routingTypeHeaderLength;
            position += buffer.putIntAscii(position, routingType);
            buffer.putSeparator(position);
            position++;
        }

        if (routingIDLength > 0)
        {
            buffer.putBytes(position, routingIDHeader, 0, routingIDHeaderLength);
            position += routingIDHeaderLength;
            buffer.putBytes(position, routingID, routingIDOffset, routingIDLength);
            position += routingIDLength;
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
        this.resetRoutingType();
        this.resetRoutingID();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetRoutingType()
    {
        hasRoutingType = false;
    }

    public void resetRoutingID()
    {
        routingIDLength = 0;
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
        builder.append("\"MessageName\": \"RoutingIDsGroup\",\n");
        if (hasRoutingType())
        {
            indent(builder, level);
            builder.append("\"RoutingType\": \"");
            builder.append(routingType);
            builder.append("\",\n");
        }

        if (hasRoutingID())
        {
            indent(builder, level);
            builder.append("\"RoutingID\": \"");
            appendBuffer(builder, routingID, routingIDOffset, routingIDLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public RoutingIDsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((RoutingIDsGroupEncoder)encoder);
    }

    public RoutingIDsGroupEncoder copyTo(final RoutingIDsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasRoutingType())
        {
            encoder.routingType(this.routingType());
        }

        if (hasRoutingID())
        {
            encoder.routingIDAsCopy(routingID.byteArray(), 0, routingIDLength);
        }
        return encoder;
    }

}
    private int noRoutingIDsGroupCounter;

    private boolean hasNoRoutingIDsGroupCounter;

    public boolean hasNoRoutingIDsGroupCounter()
    {
        return hasNoRoutingIDsGroupCounter;
    }

    public IndicationOfInterestEncoder noRoutingIDsGroupCounter(int value)
    {
        noRoutingIDsGroupCounter = value;
        hasNoRoutingIDsGroupCounter = true;
        return this;
    }

    public int noRoutingIDsGroupCounter()
    {
        return noRoutingIDsGroupCounter;
    }


    private RoutingIDsGroupEncoder routingIDsGroup = null;

    public RoutingIDsGroupEncoder routingIDsGroup(final int numberOfElements)
    {
        hasNoRoutingIDsGroupCounter = true;
        noRoutingIDsGroupCounter = numberOfElements;
        if (routingIDsGroup == null)
        {
            routingIDsGroup = new RoutingIDsGroupEncoder();
        }
        return routingIDsGroup;
    }

    private final SpreadOrBenchmarkCurveDataEncoder spreadOrBenchmarkCurveData = new SpreadOrBenchmarkCurveDataEncoder();
    public SpreadOrBenchmarkCurveDataEncoder spreadOrBenchmarkCurveData()
    {
        return spreadOrBenchmarkCurveData;
    }

    private final YieldDataEncoder yieldData = new YieldDataEncoder();
    public YieldDataEncoder yieldData()
    {
        return yieldData;
    }

    public long encode(final MutableAsciiBuffer buffer, final int offset)
    {
        final long startMessageResult = header.startMessage(buffer, offset);
        final int bodyStart = Encoder.offset(startMessageResult);
        int position = bodyStart + Encoder.length(startMessageResult);

        if (iOIIDLength > 0)
        {
            buffer.putBytes(position, iOIIDHeader, 0, iOIIDHeaderLength);
            position += iOIIDHeaderLength;
            buffer.putBytes(position, iOIID, iOIIDOffset, iOIIDLength);
            position += iOIIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: IOIID");
        }

        if (hasIOITransType)
        {
            buffer.putBytes(position, iOITransTypeHeader, 0, iOITransTypeHeaderLength);
            position += iOITransTypeHeaderLength;
            position += buffer.putCharAscii(position, iOITransType);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: IOITransType");
        }

        if (iOIRefIDLength > 0)
        {
            buffer.putBytes(position, iOIRefIDHeader, 0, iOIRefIDHeaderLength);
            position += iOIRefIDHeaderLength;
            buffer.putBytes(position, iOIRefID, iOIRefIDOffset, iOIRefIDLength);
            position += iOIRefIDLength;
            buffer.putSeparator(position);
            position++;
        }

            position += instrument.encode(buffer, position);

            position += financingDetails.encode(buffer, position);

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


        if (hasSide)
        {
            buffer.putBytes(position, sideHeader, 0, sideHeaderLength);
            position += sideHeaderLength;
            position += buffer.putCharAscii(position, side);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: Side");
        }

        if (hasQtyType)
        {
            buffer.putBytes(position, qtyTypeHeader, 0, qtyTypeHeaderLength);
            position += qtyTypeHeaderLength;
            position += buffer.putIntAscii(position, qtyType);
            buffer.putSeparator(position);
            position++;
        }

            position += orderQtyData.encode(buffer, position);

        if (iOIQtyLength > 0)
        {
            buffer.putBytes(position, iOIQtyHeader, 0, iOIQtyHeaderLength);
            position += iOIQtyHeaderLength;
            buffer.putBytes(position, iOIQty, iOIQtyOffset, iOIQtyLength);
            position += iOIQtyLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: IOIQty");
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

            position += stipulations.encode(buffer, position);

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


        if (hasPriceType)
        {
            buffer.putBytes(position, priceTypeHeader, 0, priceTypeHeaderLength);
            position += priceTypeHeaderLength;
            position += buffer.putIntAscii(position, priceType);
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

        if (validUntilTimeLength > 0)
        {
            buffer.putBytes(position, validUntilTimeHeader, 0, validUntilTimeHeaderLength);
            position += validUntilTimeHeaderLength;
            buffer.putBytes(position, validUntilTime, validUntilTimeOffset, validUntilTimeLength);
            position += validUntilTimeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasIOIQltyInd)
        {
            buffer.putBytes(position, iOIQltyIndHeader, 0, iOIQltyIndHeaderLength);
            position += iOIQltyIndHeaderLength;
            position += buffer.putCharAscii(position, iOIQltyInd);
            buffer.putSeparator(position);
            position++;
        }

        if (hasIOINaturalFlag)
        {
            buffer.putBytes(position, iOINaturalFlagHeader, 0, iOINaturalFlagHeaderLength);
            position += iOINaturalFlagHeaderLength;
            position += buffer.putBooleanAscii(position, iOINaturalFlag);
            buffer.putSeparator(position);
            position++;
        }

        if (hasNoIOIQualifiersGroupCounter)
        {
            buffer.putBytes(position, noIOIQualifiersGroupCounterHeader, 0, noIOIQualifiersGroupCounterHeaderLength);
            position += noIOIQualifiersGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noIOIQualifiersGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (iOIQualifiersGroup != null)
        {
            position += iOIQualifiersGroup.encode(buffer, position, noIOIQualifiersGroupCounter);
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

        if (transactTimeLength > 0)
        {
            buffer.putBytes(position, transactTimeHeader, 0, transactTimeHeaderLength);
            position += transactTimeHeaderLength;
            buffer.putBytes(position, transactTime, transactTimeOffset, transactTimeLength);
            position += transactTimeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (uRLLinkLength > 0)
        {
            buffer.putBytes(position, uRLLinkHeader, 0, uRLLinkHeaderLength);
            position += uRLLinkHeaderLength;
            buffer.putBytes(position, uRLLink, uRLLinkOffset, uRLLinkLength);
            position += uRLLinkLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasNoRoutingIDsGroupCounter)
        {
            buffer.putBytes(position, noRoutingIDsGroupCounterHeader, 0, noRoutingIDsGroupCounterHeaderLength);
            position += noRoutingIDsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noRoutingIDsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (routingIDsGroup != null)
        {
            position += routingIDsGroup.encode(buffer, position, noRoutingIDsGroupCounter);
        }


            position += spreadOrBenchmarkCurveData.encode(buffer, position);

            position += yieldData.encode(buffer, position);
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
        this.resetIOIID();
        this.resetIOITransType();
        this.resetIOIRefID();
        this.resetSide();
        this.resetQtyType();
        this.resetIOIQty();
        this.resetCurrency();
        this.resetPriceType();
        this.resetPrice();
        this.resetValidUntilTime();
        this.resetIOIQltyInd();
        this.resetIOINaturalFlag();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        this.resetTransactTime();
        this.resetURLLink();
        instrument.reset();
        financingDetails.reset();
        orderQtyData.reset();
        stipulations.reset();
        spreadOrBenchmarkCurveData.reset();
        yieldData.reset();
        this.resetUnderlyingsGroup();
        this.resetLegsGroup();
        this.resetIOIQualifiersGroup();
        this.resetRoutingIDsGroup();
    }

    public void resetIOIID()
    {
        iOIIDLength = 0;
    }

    public void resetIOITransType()
    {
        iOITransType = MISSING_CHAR;
    }

    public void resetIOIRefID()
    {
        iOIRefIDLength = 0;
    }

    public void resetSide()
    {
        side = MISSING_CHAR;
    }

    public void resetQtyType()
    {
        hasQtyType = false;
    }

    public void resetIOIQty()
    {
        iOIQtyLength = 0;
    }

    public void resetCurrency()
    {
        currencyLength = 0;
    }

    public void resetPriceType()
    {
        hasPriceType = false;
    }

    public void resetPrice()
    {
        hasPrice = false;
    }

    public void resetValidUntilTime()
    {
        validUntilTimeLength = 0;
    }

    public void resetIOIQltyInd()
    {
        hasIOIQltyInd = false;
    }

    public void resetIOINaturalFlag()
    {
        hasIOINaturalFlag = false;
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

    public void resetTransactTime()
    {
        transactTimeLength = 0;
    }

    public void resetURLLink()
    {
        uRLLinkLength = 0;
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

    public void resetIOIQualifiersGroup()
    {
        if (iOIQualifiersGroup != null)
        {
            iOIQualifiersGroup.reset();
        }
        noIOIQualifiersGroupCounter = 0;
        hasNoIOIQualifiersGroupCounter = false;
    }

    public void resetRoutingIDsGroup()
    {
        if (routingIDsGroup != null)
        {
            routingIDsGroup.reset();
        }
        noRoutingIDsGroupCounter = 0;
        hasNoRoutingIDsGroupCounter = false;
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
        builder.append("\"MessageName\": \"IndicationOfInterest\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasIOIID())
        {
            indent(builder, level);
            builder.append("\"IOIID\": \"");
            appendBuffer(builder, iOIID, iOIIDOffset, iOIIDLength);
            builder.append("\",\n");
        }

        if (hasIOITransType())
        {
            indent(builder, level);
            builder.append("\"IOITransType\": \"");
            builder.append(iOITransType);
            builder.append("\",\n");
        }

        if (hasIOIRefID())
        {
            indent(builder, level);
            builder.append("\"IOIRefID\": \"");
            appendBuffer(builder, iOIRefID, iOIRefIDOffset, iOIRefIDLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"Instrument\": ");
    instrument.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"FinancingDetails\": ");
    financingDetails.appendTo(builder, level + 1);
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

        if (hasSide())
        {
            indent(builder, level);
            builder.append("\"Side\": \"");
            builder.append(side);
            builder.append("\",\n");
        }

        if (hasQtyType())
        {
            indent(builder, level);
            builder.append("\"QtyType\": \"");
            builder.append(qtyType);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"OrderQtyData\": ");
    orderQtyData.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasIOIQty())
        {
            indent(builder, level);
            builder.append("\"IOIQty\": \"");
            appendBuffer(builder, iOIQty, iOIQtyOffset, iOIQtyLength);
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
    builder.append("\"Stipulations\": ");
    stipulations.appendTo(builder, level + 1);
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

        if (hasPriceType())
        {
            indent(builder, level);
            builder.append("\"PriceType\": \"");
            builder.append(priceType);
            builder.append("\",\n");
        }

        if (hasPrice())
        {
            indent(builder, level);
            builder.append("\"Price\": \"");
            price.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasValidUntilTime())
        {
            indent(builder, level);
            builder.append("\"ValidUntilTime\": \"");
            appendBuffer(builder, validUntilTime, validUntilTimeOffset, validUntilTimeLength);
            builder.append("\",\n");
        }

        if (hasIOIQltyInd())
        {
            indent(builder, level);
            builder.append("\"IOIQltyInd\": \"");
            builder.append(iOIQltyInd);
            builder.append("\",\n");
        }

        if (hasIOINaturalFlag())
        {
            indent(builder, level);
            builder.append("\"IOINaturalFlag\": \"");
            builder.append(iOINaturalFlag);
            builder.append("\",\n");
        }

        if (hasNoIOIQualifiersGroupCounter)
        {
            indent(builder, level);
            builder.append("\"IOIQualifiersGroup\": [\n");
            final int noIOIQualifiersGroupCounter = this.noIOIQualifiersGroupCounter;
            IOIQualifiersGroupEncoder iOIQualifiersGroup = this.iOIQualifiersGroup;
            for (int i = 0; i < noIOIQualifiersGroupCounter; i++)
            {
                indent(builder, level);
                iOIQualifiersGroup.appendTo(builder, level + 1);
                if (i < (noIOIQualifiersGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                iOIQualifiersGroup = iOIQualifiersGroup.next();
            }
            indent(builder, level);
            builder.append("],\n");
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

        if (hasTransactTime())
        {
            indent(builder, level);
            builder.append("\"TransactTime\": \"");
            appendBuffer(builder, transactTime, transactTimeOffset, transactTimeLength);
            builder.append("\",\n");
        }

        if (hasURLLink())
        {
            indent(builder, level);
            builder.append("\"URLLink\": \"");
            appendBuffer(builder, uRLLink, uRLLinkOffset, uRLLinkLength);
            builder.append("\",\n");
        }

        if (hasNoRoutingIDsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"RoutingIDsGroup\": [\n");
            final int noRoutingIDsGroupCounter = this.noRoutingIDsGroupCounter;
            RoutingIDsGroupEncoder routingIDsGroup = this.routingIDsGroup;
            for (int i = 0; i < noRoutingIDsGroupCounter; i++)
            {
                indent(builder, level);
                routingIDsGroup.appendTo(builder, level + 1);
                if (i < (noRoutingIDsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                routingIDsGroup = routingIDsGroup.next();
            }
            indent(builder, level);
            builder.append("],\n");
        }

    indent(builder, level);
    builder.append("\"SpreadOrBenchmarkCurveData\": ");
    spreadOrBenchmarkCurveData.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"YieldData\": ");
    yieldData.appendTo(builder, level + 1);
    builder.append("\n");
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public IndicationOfInterestEncoder copyTo(final Encoder encoder)
    {
        return copyTo((IndicationOfInterestEncoder)encoder);
    }

    public IndicationOfInterestEncoder copyTo(final IndicationOfInterestEncoder encoder)
    {
        encoder.reset();
        if (hasIOIID())
        {
            encoder.iOIIDAsCopy(iOIID.byteArray(), 0, iOIIDLength);
        }

        if (hasIOITransType())
        {
            encoder.iOITransType(this.iOITransType());
        }

        if (hasIOIRefID())
        {
            encoder.iOIRefIDAsCopy(iOIRefID.byteArray(), 0, iOIRefIDLength);
        }


        instrument.copyTo(encoder.instrument());

        financingDetails.copyTo(encoder.financingDetails());
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

        if (hasSide())
        {
            encoder.side(this.side());
        }

        if (hasQtyType())
        {
            encoder.qtyType(this.qtyType());
        }


        orderQtyData.copyTo(encoder.orderQtyData());
        if (hasIOIQty())
        {
            encoder.iOIQtyAsCopy(iOIQty.byteArray(), 0, iOIQtyLength);
        }

        if (hasCurrency())
        {
            encoder.currencyAsCopy(currency.byteArray(), 0, currencyLength);
        }


        stipulations.copyTo(encoder.stipulations());
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

        if (hasPriceType())
        {
            encoder.priceType(this.priceType());
        }

        if (hasPrice())
        {
            encoder.price(this.price());
        }

        if (hasValidUntilTime())
        {
            encoder.validUntilTimeAsCopy(validUntilTime.byteArray(), 0, validUntilTimeLength);
        }

        if (hasIOIQltyInd())
        {
            encoder.iOIQltyInd(this.iOIQltyInd());
        }

        if (hasIOINaturalFlag())
        {
            encoder.iOINaturalFlag(this.iOINaturalFlag());
        }

        if (hasNoIOIQualifiersGroupCounter)
        {
            final int size = this.noIOIQualifiersGroupCounter;
            IOIQualifiersGroupEncoder iOIQualifiersGroup = this.iOIQualifiersGroup;
            IOIQualifiersGroupEncoder iOIQualifiersGroupEncoder = encoder.iOIQualifiersGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (iOIQualifiersGroup != null)
                {
                    iOIQualifiersGroup.copyTo(iOIQualifiersGroupEncoder);
                    iOIQualifiersGroup = iOIQualifiersGroup.next();
                    iOIQualifiersGroupEncoder = iOIQualifiersGroupEncoder.next();
                }
            }
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

        if (hasTransactTime())
        {
            encoder.transactTimeAsCopy(transactTime.byteArray(), 0, transactTimeLength);
        }

        if (hasURLLink())
        {
            encoder.uRLLinkAsCopy(uRLLink.byteArray(), 0, uRLLinkLength);
        }

        if (hasNoRoutingIDsGroupCounter)
        {
            final int size = this.noRoutingIDsGroupCounter;
            RoutingIDsGroupEncoder routingIDsGroup = this.routingIDsGroup;
            RoutingIDsGroupEncoder routingIDsGroupEncoder = encoder.routingIDsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (routingIDsGroup != null)
                {
                    routingIDsGroup.copyTo(routingIDsGroupEncoder);
                    routingIDsGroup = routingIDsGroup.next();
                    routingIDsGroupEncoder = routingIDsGroupEncoder.next();
                }
            }
        }


        spreadOrBenchmarkCurveData.copyTo(encoder.spreadOrBenchmarkCurveData());

        yieldData.copyTo(encoder.yieldData());        return encoder;
    }

}
