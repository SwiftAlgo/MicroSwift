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


public class IOIEncoder implements Encoder
{
    public long messageType()
    {
        return 54L;
    }

    public IOIEncoder()
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

    private static final int sideHeaderLength = 3;
    private static final byte[] sideHeader = new byte[] {53, 52, (byte) '='};

    private static final int qtyTypeHeaderLength = 4;
    private static final byte[] qtyTypeHeader = new byte[] {56, 53, 52, (byte) '='};

    private static final int iOIQtyHeaderLength = 3;
    private static final byte[] iOIQtyHeader = new byte[] {50, 55, (byte) '='};

    private static final int currencyHeaderLength = 3;
    private static final byte[] currencyHeader = new byte[] {49, 53, (byte) '='};

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

    private final ApplicationSequenceControlEncoder applicationSequenceControl = new ApplicationSequenceControlEncoder();
    public ApplicationSequenceControlEncoder applicationSequenceControl()
    {
        return applicationSequenceControl;
    }

    private final MutableDirectBuffer iOIID = new UnsafeBuffer();

    private int iOIIDOffset = 0;

    private int iOIIDLength = 0;

    public IOIEncoder iOIID(final DirectBuffer value, final int offset, final int length)
    {
        iOIID.wrap(value);
        iOIIDOffset = offset;
        iOIIDLength = length;
        return this;
    }

    public IOIEncoder iOIID(final DirectBuffer value, final int length)
    {
        return iOIID(value, 0, length);
    }

    public IOIEncoder iOIID(final DirectBuffer value)
    {
        return iOIID(value, 0, value.capacity());
    }

    public IOIEncoder iOIID(final byte[] value, final int offset, final int length)
    {
        iOIID.wrap(value);
        iOIIDOffset = offset;
        iOIIDLength = length;
        return this;
    }

    public IOIEncoder iOIIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(iOIID, value, offset, length);
        iOIIDOffset = offset;
        iOIIDLength = length;
        return this;
    }

    public IOIEncoder iOIID(final byte[] value, final int length)
    {
        return iOIID(value, 0, length);
    }

    public IOIEncoder iOIID(final byte[] value)
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

    public IOIEncoder iOIID(final CharSequence value)
    {
        toBytes(value, iOIID);
        iOIIDOffset = 0;
        iOIIDLength = value.length();
        return this;
    }

    public IOIEncoder iOIID(final AsciiSequenceView value)
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

    public IOIEncoder iOIID(final char[] value)
    {
        return iOIID(value, 0, value.length);
    }

    public IOIEncoder iOIID(final char[] value, final int length)
    {
        return iOIID(value, 0, length);
    }

    public IOIEncoder iOIID(final char[] value, final int offset, final int length)
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

    public IOIEncoder iOITransType(char value)
    {
        iOITransType = value;
        hasIOITransType = true;
        return this;
    }

    public char iOITransType()
    {
        return iOITransType;
    }

    public IOIEncoder iOITransType(IOITransType value)
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

    public IOIEncoder iOIRefID(final DirectBuffer value, final int offset, final int length)
    {
        iOIRefID.wrap(value);
        iOIRefIDOffset = offset;
        iOIRefIDLength = length;
        return this;
    }

    public IOIEncoder iOIRefID(final DirectBuffer value, final int length)
    {
        return iOIRefID(value, 0, length);
    }

    public IOIEncoder iOIRefID(final DirectBuffer value)
    {
        return iOIRefID(value, 0, value.capacity());
    }

    public IOIEncoder iOIRefID(final byte[] value, final int offset, final int length)
    {
        iOIRefID.wrap(value);
        iOIRefIDOffset = offset;
        iOIRefIDLength = length;
        return this;
    }

    public IOIEncoder iOIRefIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(iOIRefID, value, offset, length);
        iOIRefIDOffset = offset;
        iOIRefIDLength = length;
        return this;
    }

    public IOIEncoder iOIRefID(final byte[] value, final int length)
    {
        return iOIRefID(value, 0, length);
    }

    public IOIEncoder iOIRefID(final byte[] value)
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

    public IOIEncoder iOIRefID(final CharSequence value)
    {
        toBytes(value, iOIRefID);
        iOIRefIDOffset = 0;
        iOIRefIDLength = value.length();
        return this;
    }

    public IOIEncoder iOIRefID(final AsciiSequenceView value)
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

    public IOIEncoder iOIRefID(final char[] value)
    {
        return iOIRefID(value, 0, value.length);
    }

    public IOIEncoder iOIRefID(final char[] value, final int length)
    {
        return iOIRefID(value, 0, length);
    }

    public IOIEncoder iOIRefID(final char[] value, final int offset, final int length)
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

    private final PartiesEncoder parties = new PartiesEncoder();
    public PartiesEncoder parties()
    {
        return parties;
    }

    private final FinancingDetailsEncoder financingDetails = new FinancingDetailsEncoder();
    public FinancingDetailsEncoder financingDetails()
    {
        return financingDetails;
    }

    private final UndInstrmtGrpEncoder undInstrmtGrp = new UndInstrmtGrpEncoder();
    public UndInstrmtGrpEncoder undInstrmtGrp()
    {
        return undInstrmtGrp;
    }

    private char side;

    private boolean hasSide;

    public boolean hasSide()
    {
        return hasSide;
    }

    public IOIEncoder side(char value)
    {
        side = value;
        hasSide = true;
        return this;
    }

    public char side()
    {
        return side;
    }

    public IOIEncoder side(Side value)
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

    public IOIEncoder qtyType(int value)
    {
        qtyType = value;
        hasQtyType = true;
        return this;
    }

    public int qtyType()
    {
        return qtyType;
    }

    public IOIEncoder qtyType(QtyType value)
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

    public IOIEncoder iOIQty(final DirectBuffer value, final int offset, final int length)
    {
        iOIQty.wrap(value);
        iOIQtyOffset = offset;
        iOIQtyLength = length;
        return this;
    }

    public IOIEncoder iOIQty(final DirectBuffer value, final int length)
    {
        return iOIQty(value, 0, length);
    }

    public IOIEncoder iOIQty(final DirectBuffer value)
    {
        return iOIQty(value, 0, value.capacity());
    }

    public IOIEncoder iOIQty(final byte[] value, final int offset, final int length)
    {
        iOIQty.wrap(value);
        iOIQtyOffset = offset;
        iOIQtyLength = length;
        return this;
    }

    public IOIEncoder iOIQtyAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(iOIQty, value, offset, length);
        iOIQtyOffset = offset;
        iOIQtyLength = length;
        return this;
    }

    public IOIEncoder iOIQty(final byte[] value, final int length)
    {
        return iOIQty(value, 0, length);
    }

    public IOIEncoder iOIQty(final byte[] value)
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

    public IOIEncoder iOIQty(final CharSequence value)
    {
        toBytes(value, iOIQty);
        iOIQtyOffset = 0;
        iOIQtyLength = value.length();
        return this;
    }

    public IOIEncoder iOIQty(final AsciiSequenceView value)
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

    public IOIEncoder iOIQty(final char[] value)
    {
        return iOIQty(value, 0, value.length);
    }

    public IOIEncoder iOIQty(final char[] value, final int length)
    {
        return iOIQty(value, 0, length);
    }

    public IOIEncoder iOIQty(final char[] value, final int offset, final int length)
    {
        toBytes(value, iOIQty, offset, length);
        iOIQtyOffset = 0;
        iOIQtyLength = length;
        return this;
    }

    public IOIEncoder iOIQty(IOIQty value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == IOIQty.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: iOIQty Value: " + value );
            }
            if (value == IOIQty.NULL_VAL)
            {
                return this;
            }
        }
        return iOIQty(value.representation());
    }

    private final MutableDirectBuffer currency = new UnsafeBuffer();

    private int currencyOffset = 0;

    private int currencyLength = 0;

    public IOIEncoder currency(final DirectBuffer value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public IOIEncoder currency(final DirectBuffer value, final int length)
    {
        return currency(value, 0, length);
    }

    public IOIEncoder currency(final DirectBuffer value)
    {
        return currency(value, 0, value.capacity());
    }

    public IOIEncoder currency(final byte[] value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public IOIEncoder currencyAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(currency, value, offset, length);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public IOIEncoder currency(final byte[] value, final int length)
    {
        return currency(value, 0, length);
    }

    public IOIEncoder currency(final byte[] value)
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

    public IOIEncoder currency(final CharSequence value)
    {
        toBytes(value, currency);
        currencyOffset = 0;
        currencyLength = value.length();
        return this;
    }

    public IOIEncoder currency(final AsciiSequenceView value)
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

    public IOIEncoder currency(final char[] value)
    {
        return currency(value, 0, value.length);
    }

    public IOIEncoder currency(final char[] value, final int length)
    {
        return currency(value, 0, length);
    }

    public IOIEncoder currency(final char[] value, final int offset, final int length)
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

    private final InstrmtLegIOIGrpEncoder instrmtLegIOIGrp = new InstrmtLegIOIGrpEncoder();
    public InstrmtLegIOIGrpEncoder instrmtLegIOIGrp()
    {
        return instrmtLegIOIGrp;
    }

    private int priceType;

    private boolean hasPriceType;

    public boolean hasPriceType()
    {
        return hasPriceType;
    }

    public IOIEncoder priceType(int value)
    {
        priceType = value;
        hasPriceType = true;
        return this;
    }

    public int priceType()
    {
        return priceType;
    }

    public IOIEncoder priceType(PriceType value)
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

    public IOIEncoder price(DecimalFloat value)
    {
        price.set(value);
        hasPrice = true;
        return this;
    }

    public IOIEncoder price(long value, int scale)
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

    public IOIEncoder validUntilTime(final DirectBuffer value, final int offset, final int length)
    {
        validUntilTime.wrap(value);
        validUntilTimeOffset = offset;
        validUntilTimeLength = length;
        return this;
    }

    public IOIEncoder validUntilTime(final DirectBuffer value, final int length)
    {
        return validUntilTime(value, 0, length);
    }

    public IOIEncoder validUntilTime(final DirectBuffer value)
    {
        return validUntilTime(value, 0, value.capacity());
    }

    public IOIEncoder validUntilTime(final byte[] value, final int offset, final int length)
    {
        validUntilTime.wrap(value);
        validUntilTimeOffset = offset;
        validUntilTimeLength = length;
        return this;
    }

    public IOIEncoder validUntilTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(validUntilTime, value, offset, length);
        validUntilTimeOffset = offset;
        validUntilTimeLength = length;
        return this;
    }

    public IOIEncoder validUntilTime(final byte[] value, final int length)
    {
        return validUntilTime(value, 0, length);
    }

    public IOIEncoder validUntilTime(final byte[] value)
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

    public IOIEncoder iOIQltyInd(char value)
    {
        iOIQltyInd = value;
        hasIOIQltyInd = true;
        return this;
    }

    public char iOIQltyInd()
    {
        return iOIQltyInd;
    }

    public IOIEncoder iOIQltyInd(IOIQltyInd value)
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

    public IOIEncoder iOINaturalFlag(boolean value)
    {
        iOINaturalFlag = value;
        hasIOINaturalFlag = true;
        return this;
    }

    public boolean iOINaturalFlag()
    {
        return iOINaturalFlag;
    }

    private final IOIQualGrpEncoder iOIQualGrp = new IOIQualGrpEncoder();
    public IOIQualGrpEncoder iOIQualGrp()
    {
        return iOIQualGrp;
    }

    private final MutableDirectBuffer text = new UnsafeBuffer();

    private int textOffset = 0;

    private int textLength = 0;

    public IOIEncoder text(final DirectBuffer value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public IOIEncoder text(final DirectBuffer value, final int length)
    {
        return text(value, 0, length);
    }

    public IOIEncoder text(final DirectBuffer value)
    {
        return text(value, 0, value.capacity());
    }

    public IOIEncoder text(final byte[] value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public IOIEncoder textAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(text, value, offset, length);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public IOIEncoder text(final byte[] value, final int length)
    {
        return text(value, 0, length);
    }

    public IOIEncoder text(final byte[] value)
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

    public IOIEncoder text(final CharSequence value)
    {
        toBytes(value, text);
        textOffset = 0;
        textLength = value.length();
        return this;
    }

    public IOIEncoder text(final AsciiSequenceView value)
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

    public IOIEncoder text(final char[] value)
    {
        return text(value, 0, value.length);
    }

    public IOIEncoder text(final char[] value, final int length)
    {
        return text(value, 0, length);
    }

    public IOIEncoder text(final char[] value, final int offset, final int length)
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

    public IOIEncoder encodedTextLen(int value)
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

    public IOIEncoder encodedText(byte[] value)
    {
        encodedText = value;
        hasEncodedText = true;
        return this;
    }

    public byte[] encodedText()
    {
        return encodedText;
    }

    public IOIEncoder encodedTextAsCopy(final byte[] value, final int offset, final int length)
    {
        encodedText = copyInto(encodedText, value, offset, length);
        hasEncodedText = true;
        return this;
    }

    private final MutableDirectBuffer transactTime = new UnsafeBuffer();

    private int transactTimeOffset = 0;

    private int transactTimeLength = 0;

    public IOIEncoder transactTime(final DirectBuffer value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public IOIEncoder transactTime(final DirectBuffer value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public IOIEncoder transactTime(final DirectBuffer value)
    {
        return transactTime(value, 0, value.capacity());
    }

    public IOIEncoder transactTime(final byte[] value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public IOIEncoder transactTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(transactTime, value, offset, length);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public IOIEncoder transactTime(final byte[] value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public IOIEncoder transactTime(final byte[] value)
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

    public IOIEncoder uRLLink(final DirectBuffer value, final int offset, final int length)
    {
        uRLLink.wrap(value);
        uRLLinkOffset = offset;
        uRLLinkLength = length;
        return this;
    }

    public IOIEncoder uRLLink(final DirectBuffer value, final int length)
    {
        return uRLLink(value, 0, length);
    }

    public IOIEncoder uRLLink(final DirectBuffer value)
    {
        return uRLLink(value, 0, value.capacity());
    }

    public IOIEncoder uRLLink(final byte[] value, final int offset, final int length)
    {
        uRLLink.wrap(value);
        uRLLinkOffset = offset;
        uRLLinkLength = length;
        return this;
    }

    public IOIEncoder uRLLinkAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(uRLLink, value, offset, length);
        uRLLinkOffset = offset;
        uRLLinkLength = length;
        return this;
    }

    public IOIEncoder uRLLink(final byte[] value, final int length)
    {
        return uRLLink(value, 0, length);
    }

    public IOIEncoder uRLLink(final byte[] value)
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

    public IOIEncoder uRLLink(final CharSequence value)
    {
        toBytes(value, uRLLink);
        uRLLinkOffset = 0;
        uRLLinkLength = value.length();
        return this;
    }

    public IOIEncoder uRLLink(final AsciiSequenceView value)
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

    public IOIEncoder uRLLink(final char[] value)
    {
        return uRLLink(value, 0, value.length);
    }

    public IOIEncoder uRLLink(final char[] value, final int length)
    {
        return uRLLink(value, 0, length);
    }

    public IOIEncoder uRLLink(final char[] value, final int offset, final int length)
    {
        toBytes(value, uRLLink, offset, length);
        uRLLinkOffset = 0;
        uRLLinkLength = length;
        return this;
    }

    private final RoutingGrpEncoder routingGrp = new RoutingGrpEncoder();
    public RoutingGrpEncoder routingGrp()
    {
        return routingGrp;
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

            position += applicationSequenceControl.encode(buffer, position);

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

            position += parties.encode(buffer, position);

            position += financingDetails.encode(buffer, position);

            position += undInstrmtGrp.encode(buffer, position);

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

            position += instrmtLegIOIGrp.encode(buffer, position);

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

            position += iOIQualGrp.encode(buffer, position);

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

            position += routingGrp.encode(buffer, position);

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
        applicationSequenceControl.reset();
        instrument.reset();
        parties.reset();
        financingDetails.reset();
        undInstrmtGrp.reset();
        orderQtyData.reset();
        stipulations.reset();
        instrmtLegIOIGrp.reset();
        iOIQualGrp.reset();
        routingGrp.reset();
        spreadOrBenchmarkCurveData.reset();
        yieldData.reset();
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
        builder.append("\"MessageName\": \"IOI\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
    indent(builder, level);
    builder.append("\"ApplicationSequenceControl\": ");
    applicationSequenceControl.appendTo(builder, level + 1);
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
    builder.append("\"Parties\": ");
    parties.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"FinancingDetails\": ");
    financingDetails.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"UndInstrmtGrp\": ");
    undInstrmtGrp.appendTo(builder, level + 1);
    builder.append("\n");

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

    indent(builder, level);
    builder.append("\"InstrmtLegIOIGrp\": ");
    instrmtLegIOIGrp.appendTo(builder, level + 1);
    builder.append("\n");

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

    indent(builder, level);
    builder.append("\"IOIQualGrp\": ");
    iOIQualGrp.appendTo(builder, level + 1);
    builder.append("\n");

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

    indent(builder, level);
    builder.append("\"RoutingGrp\": ");
    routingGrp.appendTo(builder, level + 1);
    builder.append("\n");

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
    public IOIEncoder copyTo(final Encoder encoder)
    {
        return copyTo((IOIEncoder)encoder);
    }

    public IOIEncoder copyTo(final IOIEncoder encoder)
    {
        encoder.reset();

        applicationSequenceControl.copyTo(encoder.applicationSequenceControl());
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

        parties.copyTo(encoder.parties());

        financingDetails.copyTo(encoder.financingDetails());

        undInstrmtGrp.copyTo(encoder.undInstrmtGrp());
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

        instrmtLegIOIGrp.copyTo(encoder.instrmtLegIOIGrp());
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


        iOIQualGrp.copyTo(encoder.iOIQualGrp());
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


        routingGrp.copyTo(encoder.routingGrp());

        spreadOrBenchmarkCurveData.copyTo(encoder.spreadOrBenchmarkCurveData());

        yieldData.copyTo(encoder.yieldData());        return encoder;
    }

}
