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


public class AdvertisementEncoder implements Encoder
{
    public long messageType()
    {
        return 55L;
    }

    public AdvertisementEncoder()
    {
        header.msgType("7");
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

    private static final int advIdHeaderLength = 2;
    private static final byte[] advIdHeader = new byte[] {50, (byte) '='};

    private static final int advTransTypeHeaderLength = 2;
    private static final byte[] advTransTypeHeader = new byte[] {53, (byte) '='};

    private static final int advRefIDHeaderLength = 2;
    private static final byte[] advRefIDHeader = new byte[] {51, (byte) '='};

    private static final int advSideHeaderLength = 2;
    private static final byte[] advSideHeader = new byte[] {52, (byte) '='};

    private static final int quantityHeaderLength = 3;
    private static final byte[] quantityHeader = new byte[] {53, 51, (byte) '='};

    private static final int qtyTypeHeaderLength = 4;
    private static final byte[] qtyTypeHeader = new byte[] {56, 53, 52, (byte) '='};

    private static final int priceHeaderLength = 3;
    private static final byte[] priceHeader = new byte[] {52, 52, (byte) '='};

    private static final int currencyHeaderLength = 3;
    private static final byte[] currencyHeader = new byte[] {49, 53, (byte) '='};

    private static final int tradeDateHeaderLength = 3;
    private static final byte[] tradeDateHeader = new byte[] {55, 53, (byte) '='};

    private static final int transactTimeHeaderLength = 3;
    private static final byte[] transactTimeHeader = new byte[] {54, 48, (byte) '='};

    private static final int textHeaderLength = 3;
    private static final byte[] textHeader = new byte[] {53, 56, (byte) '='};

    private static final int encodedTextLenHeaderLength = 4;
    private static final byte[] encodedTextLenHeader = new byte[] {51, 53, 52, (byte) '='};

    private static final int encodedTextHeaderLength = 4;
    private static final byte[] encodedTextHeader = new byte[] {51, 53, 53, (byte) '='};

    private static final int uRLLinkHeaderLength = 4;
    private static final byte[] uRLLinkHeader = new byte[] {49, 52, 57, (byte) '='};

    private static final int lastMktHeaderLength = 3;
    private static final byte[] lastMktHeader = new byte[] {51, 48, (byte) '='};

    private static final int tradingSessionIDHeaderLength = 4;
    private static final byte[] tradingSessionIDHeader = new byte[] {51, 51, 54, (byte) '='};

    private static final int tradingSessionSubIDHeaderLength = 4;
    private static final byte[] tradingSessionSubIDHeader = new byte[] {54, 50, 53, (byte) '='};

    private final MutableDirectBuffer advId = new UnsafeBuffer();

    private int advIdOffset = 0;

    private int advIdLength = 0;

    public AdvertisementEncoder advId(final DirectBuffer value, final int offset, final int length)
    {
        advId.wrap(value);
        advIdOffset = offset;
        advIdLength = length;
        return this;
    }

    public AdvertisementEncoder advId(final DirectBuffer value, final int length)
    {
        return advId(value, 0, length);
    }

    public AdvertisementEncoder advId(final DirectBuffer value)
    {
        return advId(value, 0, value.capacity());
    }

    public AdvertisementEncoder advId(final byte[] value, final int offset, final int length)
    {
        advId.wrap(value);
        advIdOffset = offset;
        advIdLength = length;
        return this;
    }

    public AdvertisementEncoder advIdAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(advId, value, offset, length);
        advIdOffset = offset;
        advIdLength = length;
        return this;
    }

    public AdvertisementEncoder advId(final byte[] value, final int length)
    {
        return advId(value, 0, length);
    }

    public AdvertisementEncoder advId(final byte[] value)
    {
        return advId(value, 0, value.length);
    }

    public boolean hasAdvId()
    {
        return advIdLength > 0;
    }

    public MutableDirectBuffer advId()
    {
        return advId;
    }

    public String advIdAsString()
    {
        return advId.getStringWithoutLengthAscii(advIdOffset, advIdLength);
    }

    public AdvertisementEncoder advId(final CharSequence value)
    {
        toBytes(value, advId);
        advIdOffset = 0;
        advIdLength = value.length();
        return this;
    }

    public AdvertisementEncoder advId(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            advId.wrap(buffer);
            advIdOffset = value.offset();
            advIdLength = value.length();
        }
        return this;
    }

    public AdvertisementEncoder advId(final char[] value)
    {
        return advId(value, 0, value.length);
    }

    public AdvertisementEncoder advId(final char[] value, final int length)
    {
        return advId(value, 0, length);
    }

    public AdvertisementEncoder advId(final char[] value, final int offset, final int length)
    {
        toBytes(value, advId, offset, length);
        advIdOffset = 0;
        advIdLength = length;
        return this;
    }

    private final MutableDirectBuffer advTransType = new UnsafeBuffer();

    private int advTransTypeOffset = 0;

    private int advTransTypeLength = 0;

    public AdvertisementEncoder advTransType(final DirectBuffer value, final int offset, final int length)
    {
        advTransType.wrap(value);
        advTransTypeOffset = offset;
        advTransTypeLength = length;
        return this;
    }

    public AdvertisementEncoder advTransType(final DirectBuffer value, final int length)
    {
        return advTransType(value, 0, length);
    }

    public AdvertisementEncoder advTransType(final DirectBuffer value)
    {
        return advTransType(value, 0, value.capacity());
    }

    public AdvertisementEncoder advTransType(final byte[] value, final int offset, final int length)
    {
        advTransType.wrap(value);
        advTransTypeOffset = offset;
        advTransTypeLength = length;
        return this;
    }

    public AdvertisementEncoder advTransTypeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(advTransType, value, offset, length);
        advTransTypeOffset = offset;
        advTransTypeLength = length;
        return this;
    }

    public AdvertisementEncoder advTransType(final byte[] value, final int length)
    {
        return advTransType(value, 0, length);
    }

    public AdvertisementEncoder advTransType(final byte[] value)
    {
        return advTransType(value, 0, value.length);
    }

    public boolean hasAdvTransType()
    {
        return advTransTypeLength > 0;
    }

    public MutableDirectBuffer advTransType()
    {
        return advTransType;
    }

    public String advTransTypeAsString()
    {
        return advTransType.getStringWithoutLengthAscii(advTransTypeOffset, advTransTypeLength);
    }

    public AdvertisementEncoder advTransType(final CharSequence value)
    {
        toBytes(value, advTransType);
        advTransTypeOffset = 0;
        advTransTypeLength = value.length();
        return this;
    }

    public AdvertisementEncoder advTransType(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            advTransType.wrap(buffer);
            advTransTypeOffset = value.offset();
            advTransTypeLength = value.length();
        }
        return this;
    }

    public AdvertisementEncoder advTransType(final char[] value)
    {
        return advTransType(value, 0, value.length);
    }

    public AdvertisementEncoder advTransType(final char[] value, final int length)
    {
        return advTransType(value, 0, length);
    }

    public AdvertisementEncoder advTransType(final char[] value, final int offset, final int length)
    {
        toBytes(value, advTransType, offset, length);
        advTransTypeOffset = 0;
        advTransTypeLength = length;
        return this;
    }

    public AdvertisementEncoder advTransType(AdvTransType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == AdvTransType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: advTransType Value: " + value );
            }
            if (value == AdvTransType.NULL_VAL)
            {
                return this;
            }
        }
        return advTransType(value.representation());
    }

    private final MutableDirectBuffer advRefID = new UnsafeBuffer();

    private int advRefIDOffset = 0;

    private int advRefIDLength = 0;

    public AdvertisementEncoder advRefID(final DirectBuffer value, final int offset, final int length)
    {
        advRefID.wrap(value);
        advRefIDOffset = offset;
        advRefIDLength = length;
        return this;
    }

    public AdvertisementEncoder advRefID(final DirectBuffer value, final int length)
    {
        return advRefID(value, 0, length);
    }

    public AdvertisementEncoder advRefID(final DirectBuffer value)
    {
        return advRefID(value, 0, value.capacity());
    }

    public AdvertisementEncoder advRefID(final byte[] value, final int offset, final int length)
    {
        advRefID.wrap(value);
        advRefIDOffset = offset;
        advRefIDLength = length;
        return this;
    }

    public AdvertisementEncoder advRefIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(advRefID, value, offset, length);
        advRefIDOffset = offset;
        advRefIDLength = length;
        return this;
    }

    public AdvertisementEncoder advRefID(final byte[] value, final int length)
    {
        return advRefID(value, 0, length);
    }

    public AdvertisementEncoder advRefID(final byte[] value)
    {
        return advRefID(value, 0, value.length);
    }

    public boolean hasAdvRefID()
    {
        return advRefIDLength > 0;
    }

    public MutableDirectBuffer advRefID()
    {
        return advRefID;
    }

    public String advRefIDAsString()
    {
        return advRefID.getStringWithoutLengthAscii(advRefIDOffset, advRefIDLength);
    }

    public AdvertisementEncoder advRefID(final CharSequence value)
    {
        toBytes(value, advRefID);
        advRefIDOffset = 0;
        advRefIDLength = value.length();
        return this;
    }

    public AdvertisementEncoder advRefID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            advRefID.wrap(buffer);
            advRefIDOffset = value.offset();
            advRefIDLength = value.length();
        }
        return this;
    }

    public AdvertisementEncoder advRefID(final char[] value)
    {
        return advRefID(value, 0, value.length);
    }

    public AdvertisementEncoder advRefID(final char[] value, final int length)
    {
        return advRefID(value, 0, length);
    }

    public AdvertisementEncoder advRefID(final char[] value, final int offset, final int length)
    {
        toBytes(value, advRefID, offset, length);
        advRefIDOffset = 0;
        advRefIDLength = length;
        return this;
    }

    private final InstrumentEncoder instrument = new InstrumentEncoder();
    public InstrumentEncoder instrument()
    {
        return instrument;
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

    private char advSide;

    private boolean hasAdvSide;

    public boolean hasAdvSide()
    {
        return hasAdvSide;
    }

    public AdvertisementEncoder advSide(char value)
    {
        advSide = value;
        hasAdvSide = true;
        return this;
    }

    public char advSide()
    {
        return advSide;
    }

    public AdvertisementEncoder advSide(AdvSide value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == AdvSide.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: advSide Value: " + value );
            }
            if (value == AdvSide.NULL_VAL)
            {
                return this;
            }
        }
        return advSide(value.representation());
    }

    private final DecimalFloat quantity = new DecimalFloat();

    private boolean hasQuantity;

    public boolean hasQuantity()
    {
        return hasQuantity;
    }

    public AdvertisementEncoder quantity(DecimalFloat value)
    {
        quantity.set(value);
        hasQuantity = true;
        return this;
    }

    public AdvertisementEncoder quantity(long value, int scale)
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

    public AdvertisementEncoder qtyType(int value)
    {
        qtyType = value;
        hasQtyType = true;
        return this;
    }

    public int qtyType()
    {
        return qtyType;
    }

    public AdvertisementEncoder qtyType(QtyType value)
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

    private final DecimalFloat price = new DecimalFloat();

    private boolean hasPrice;

    public boolean hasPrice()
    {
        return hasPrice;
    }

    public AdvertisementEncoder price(DecimalFloat value)
    {
        price.set(value);
        hasPrice = true;
        return this;
    }

    public AdvertisementEncoder price(long value, int scale)
    {
        price.set(value, scale);
        hasPrice = true;
        return this;
    }

    public DecimalFloat price()
    {
        return price;
    }

    private final MutableDirectBuffer currency = new UnsafeBuffer();

    private int currencyOffset = 0;

    private int currencyLength = 0;

    public AdvertisementEncoder currency(final DirectBuffer value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public AdvertisementEncoder currency(final DirectBuffer value, final int length)
    {
        return currency(value, 0, length);
    }

    public AdvertisementEncoder currency(final DirectBuffer value)
    {
        return currency(value, 0, value.capacity());
    }

    public AdvertisementEncoder currency(final byte[] value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public AdvertisementEncoder currencyAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(currency, value, offset, length);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public AdvertisementEncoder currency(final byte[] value, final int length)
    {
        return currency(value, 0, length);
    }

    public AdvertisementEncoder currency(final byte[] value)
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

    public AdvertisementEncoder currency(final CharSequence value)
    {
        toBytes(value, currency);
        currencyOffset = 0;
        currencyLength = value.length();
        return this;
    }

    public AdvertisementEncoder currency(final AsciiSequenceView value)
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

    public AdvertisementEncoder currency(final char[] value)
    {
        return currency(value, 0, value.length);
    }

    public AdvertisementEncoder currency(final char[] value, final int length)
    {
        return currency(value, 0, length);
    }

    public AdvertisementEncoder currency(final char[] value, final int offset, final int length)
    {
        toBytes(value, currency, offset, length);
        currencyOffset = 0;
        currencyLength = length;
        return this;
    }

    private final MutableDirectBuffer tradeDate = new UnsafeBuffer();

    private int tradeDateOffset = 0;

    private int tradeDateLength = 0;

    public AdvertisementEncoder tradeDate(final DirectBuffer value, final int offset, final int length)
    {
        tradeDate.wrap(value);
        tradeDateOffset = offset;
        tradeDateLength = length;
        return this;
    }

    public AdvertisementEncoder tradeDate(final DirectBuffer value, final int length)
    {
        return tradeDate(value, 0, length);
    }

    public AdvertisementEncoder tradeDate(final DirectBuffer value)
    {
        return tradeDate(value, 0, value.capacity());
    }

    public AdvertisementEncoder tradeDate(final byte[] value, final int offset, final int length)
    {
        tradeDate.wrap(value);
        tradeDateOffset = offset;
        tradeDateLength = length;
        return this;
    }

    public AdvertisementEncoder tradeDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradeDate, value, offset, length);
        tradeDateOffset = offset;
        tradeDateLength = length;
        return this;
    }

    public AdvertisementEncoder tradeDate(final byte[] value, final int length)
    {
        return tradeDate(value, 0, length);
    }

    public AdvertisementEncoder tradeDate(final byte[] value)
    {
        return tradeDate(value, 0, value.length);
    }

    public boolean hasTradeDate()
    {
        return tradeDateLength > 0;
    }

    public MutableDirectBuffer tradeDate()
    {
        return tradeDate;
    }

    public String tradeDateAsString()
    {
        return tradeDate.getStringWithoutLengthAscii(tradeDateOffset, tradeDateLength);
    }

    private final MutableDirectBuffer transactTime = new UnsafeBuffer();

    private int transactTimeOffset = 0;

    private int transactTimeLength = 0;

    public AdvertisementEncoder transactTime(final DirectBuffer value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public AdvertisementEncoder transactTime(final DirectBuffer value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public AdvertisementEncoder transactTime(final DirectBuffer value)
    {
        return transactTime(value, 0, value.capacity());
    }

    public AdvertisementEncoder transactTime(final byte[] value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public AdvertisementEncoder transactTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(transactTime, value, offset, length);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public AdvertisementEncoder transactTime(final byte[] value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public AdvertisementEncoder transactTime(final byte[] value)
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

    private final MutableDirectBuffer text = new UnsafeBuffer();

    private int textOffset = 0;

    private int textLength = 0;

    public AdvertisementEncoder text(final DirectBuffer value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public AdvertisementEncoder text(final DirectBuffer value, final int length)
    {
        return text(value, 0, length);
    }

    public AdvertisementEncoder text(final DirectBuffer value)
    {
        return text(value, 0, value.capacity());
    }

    public AdvertisementEncoder text(final byte[] value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public AdvertisementEncoder textAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(text, value, offset, length);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public AdvertisementEncoder text(final byte[] value, final int length)
    {
        return text(value, 0, length);
    }

    public AdvertisementEncoder text(final byte[] value)
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

    public AdvertisementEncoder text(final CharSequence value)
    {
        toBytes(value, text);
        textOffset = 0;
        textLength = value.length();
        return this;
    }

    public AdvertisementEncoder text(final AsciiSequenceView value)
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

    public AdvertisementEncoder text(final char[] value)
    {
        return text(value, 0, value.length);
    }

    public AdvertisementEncoder text(final char[] value, final int length)
    {
        return text(value, 0, length);
    }

    public AdvertisementEncoder text(final char[] value, final int offset, final int length)
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

    public AdvertisementEncoder encodedTextLen(int value)
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

    public AdvertisementEncoder encodedText(byte[] value)
    {
        encodedText = value;
        hasEncodedText = true;
        return this;
    }

    public byte[] encodedText()
    {
        return encodedText;
    }

    public AdvertisementEncoder encodedTextAsCopy(final byte[] value, final int offset, final int length)
    {
        encodedText = copyInto(encodedText, value, offset, length);
        hasEncodedText = true;
        return this;
    }

    private final MutableDirectBuffer uRLLink = new UnsafeBuffer();

    private int uRLLinkOffset = 0;

    private int uRLLinkLength = 0;

    public AdvertisementEncoder uRLLink(final DirectBuffer value, final int offset, final int length)
    {
        uRLLink.wrap(value);
        uRLLinkOffset = offset;
        uRLLinkLength = length;
        return this;
    }

    public AdvertisementEncoder uRLLink(final DirectBuffer value, final int length)
    {
        return uRLLink(value, 0, length);
    }

    public AdvertisementEncoder uRLLink(final DirectBuffer value)
    {
        return uRLLink(value, 0, value.capacity());
    }

    public AdvertisementEncoder uRLLink(final byte[] value, final int offset, final int length)
    {
        uRLLink.wrap(value);
        uRLLinkOffset = offset;
        uRLLinkLength = length;
        return this;
    }

    public AdvertisementEncoder uRLLinkAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(uRLLink, value, offset, length);
        uRLLinkOffset = offset;
        uRLLinkLength = length;
        return this;
    }

    public AdvertisementEncoder uRLLink(final byte[] value, final int length)
    {
        return uRLLink(value, 0, length);
    }

    public AdvertisementEncoder uRLLink(final byte[] value)
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

    public AdvertisementEncoder uRLLink(final CharSequence value)
    {
        toBytes(value, uRLLink);
        uRLLinkOffset = 0;
        uRLLinkLength = value.length();
        return this;
    }

    public AdvertisementEncoder uRLLink(final AsciiSequenceView value)
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

    public AdvertisementEncoder uRLLink(final char[] value)
    {
        return uRLLink(value, 0, value.length);
    }

    public AdvertisementEncoder uRLLink(final char[] value, final int length)
    {
        return uRLLink(value, 0, length);
    }

    public AdvertisementEncoder uRLLink(final char[] value, final int offset, final int length)
    {
        toBytes(value, uRLLink, offset, length);
        uRLLinkOffset = 0;
        uRLLinkLength = length;
        return this;
    }

    private final MutableDirectBuffer lastMkt = new UnsafeBuffer();

    private int lastMktOffset = 0;

    private int lastMktLength = 0;

    public AdvertisementEncoder lastMkt(final DirectBuffer value, final int offset, final int length)
    {
        lastMkt.wrap(value);
        lastMktOffset = offset;
        lastMktLength = length;
        return this;
    }

    public AdvertisementEncoder lastMkt(final DirectBuffer value, final int length)
    {
        return lastMkt(value, 0, length);
    }

    public AdvertisementEncoder lastMkt(final DirectBuffer value)
    {
        return lastMkt(value, 0, value.capacity());
    }

    public AdvertisementEncoder lastMkt(final byte[] value, final int offset, final int length)
    {
        lastMkt.wrap(value);
        lastMktOffset = offset;
        lastMktLength = length;
        return this;
    }

    public AdvertisementEncoder lastMktAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(lastMkt, value, offset, length);
        lastMktOffset = offset;
        lastMktLength = length;
        return this;
    }

    public AdvertisementEncoder lastMkt(final byte[] value, final int length)
    {
        return lastMkt(value, 0, length);
    }

    public AdvertisementEncoder lastMkt(final byte[] value)
    {
        return lastMkt(value, 0, value.length);
    }

    public boolean hasLastMkt()
    {
        return lastMktLength > 0;
    }

    public MutableDirectBuffer lastMkt()
    {
        return lastMkt;
    }

    public String lastMktAsString()
    {
        return lastMkt.getStringWithoutLengthAscii(lastMktOffset, lastMktLength);
    }

    public AdvertisementEncoder lastMkt(final CharSequence value)
    {
        toBytes(value, lastMkt);
        lastMktOffset = 0;
        lastMktLength = value.length();
        return this;
    }

    public AdvertisementEncoder lastMkt(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            lastMkt.wrap(buffer);
            lastMktOffset = value.offset();
            lastMktLength = value.length();
        }
        return this;
    }

    public AdvertisementEncoder lastMkt(final char[] value)
    {
        return lastMkt(value, 0, value.length);
    }

    public AdvertisementEncoder lastMkt(final char[] value, final int length)
    {
        return lastMkt(value, 0, length);
    }

    public AdvertisementEncoder lastMkt(final char[] value, final int offset, final int length)
    {
        toBytes(value, lastMkt, offset, length);
        lastMktOffset = 0;
        lastMktLength = length;
        return this;
    }

    private final MutableDirectBuffer tradingSessionID = new UnsafeBuffer();

    private int tradingSessionIDOffset = 0;

    private int tradingSessionIDLength = 0;

    public AdvertisementEncoder tradingSessionID(final DirectBuffer value, final int offset, final int length)
    {
        tradingSessionID.wrap(value);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public AdvertisementEncoder tradingSessionID(final DirectBuffer value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public AdvertisementEncoder tradingSessionID(final DirectBuffer value)
    {
        return tradingSessionID(value, 0, value.capacity());
    }

    public AdvertisementEncoder tradingSessionID(final byte[] value, final int offset, final int length)
    {
        tradingSessionID.wrap(value);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public AdvertisementEncoder tradingSessionIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradingSessionID, value, offset, length);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public AdvertisementEncoder tradingSessionID(final byte[] value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public AdvertisementEncoder tradingSessionID(final byte[] value)
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

    public AdvertisementEncoder tradingSessionID(final CharSequence value)
    {
        toBytes(value, tradingSessionID);
        tradingSessionIDOffset = 0;
        tradingSessionIDLength = value.length();
        return this;
    }

    public AdvertisementEncoder tradingSessionID(final AsciiSequenceView value)
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

    public AdvertisementEncoder tradingSessionID(final char[] value)
    {
        return tradingSessionID(value, 0, value.length);
    }

    public AdvertisementEncoder tradingSessionID(final char[] value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public AdvertisementEncoder tradingSessionID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradingSessionID, offset, length);
        tradingSessionIDOffset = 0;
        tradingSessionIDLength = length;
        return this;
    }

    public AdvertisementEncoder tradingSessionID(TradingSessionID value)
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

    public AdvertisementEncoder tradingSessionSubID(final DirectBuffer value, final int offset, final int length)
    {
        tradingSessionSubID.wrap(value);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public AdvertisementEncoder tradingSessionSubID(final DirectBuffer value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public AdvertisementEncoder tradingSessionSubID(final DirectBuffer value)
    {
        return tradingSessionSubID(value, 0, value.capacity());
    }

    public AdvertisementEncoder tradingSessionSubID(final byte[] value, final int offset, final int length)
    {
        tradingSessionSubID.wrap(value);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public AdvertisementEncoder tradingSessionSubIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradingSessionSubID, value, offset, length);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public AdvertisementEncoder tradingSessionSubID(final byte[] value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public AdvertisementEncoder tradingSessionSubID(final byte[] value)
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

    public AdvertisementEncoder tradingSessionSubID(final CharSequence value)
    {
        toBytes(value, tradingSessionSubID);
        tradingSessionSubIDOffset = 0;
        tradingSessionSubIDLength = value.length();
        return this;
    }

    public AdvertisementEncoder tradingSessionSubID(final AsciiSequenceView value)
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

    public AdvertisementEncoder tradingSessionSubID(final char[] value)
    {
        return tradingSessionSubID(value, 0, value.length);
    }

    public AdvertisementEncoder tradingSessionSubID(final char[] value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public AdvertisementEncoder tradingSessionSubID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradingSessionSubID, offset, length);
        tradingSessionSubIDOffset = 0;
        tradingSessionSubIDLength = length;
        return this;
    }

    public AdvertisementEncoder tradingSessionSubID(TradingSessionSubID value)
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

    public long encode(final MutableAsciiBuffer buffer, final int offset)
    {
        final long startMessageResult = header.startMessage(buffer, offset);
        final int bodyStart = Encoder.offset(startMessageResult);
        int position = bodyStart + Encoder.length(startMessageResult);

        if (advIdLength > 0)
        {
            buffer.putBytes(position, advIdHeader, 0, advIdHeaderLength);
            position += advIdHeaderLength;
            buffer.putBytes(position, advId, advIdOffset, advIdLength);
            position += advIdLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: AdvId");
        }

        if (advTransTypeLength > 0)
        {
            buffer.putBytes(position, advTransTypeHeader, 0, advTransTypeHeaderLength);
            position += advTransTypeHeaderLength;
            buffer.putBytes(position, advTransType, advTransTypeOffset, advTransTypeLength);
            position += advTransTypeLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: AdvTransType");
        }

        if (advRefIDLength > 0)
        {
            buffer.putBytes(position, advRefIDHeader, 0, advRefIDHeaderLength);
            position += advRefIDHeaderLength;
            buffer.putBytes(position, advRefID, advRefIDOffset, advRefIDLength);
            position += advRefIDLength;
            buffer.putSeparator(position);
            position++;
        }

            position += instrument.encode(buffer, position);

            position += instrmtLegGrp.encode(buffer, position);

            position += undInstrmtGrp.encode(buffer, position);

        if (hasAdvSide)
        {
            buffer.putBytes(position, advSideHeader, 0, advSideHeaderLength);
            position += advSideHeaderLength;
            position += buffer.putCharAscii(position, advSide);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: AdvSide");
        }

        if (hasQuantity)
        {
            buffer.putBytes(position, quantityHeader, 0, quantityHeaderLength);
            position += quantityHeaderLength;
            position += buffer.putFloatAscii(position, quantity);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: Quantity");
        }

        if (hasQtyType)
        {
            buffer.putBytes(position, qtyTypeHeader, 0, qtyTypeHeaderLength);
            position += qtyTypeHeaderLength;
            position += buffer.putIntAscii(position, qtyType);
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

        if (currencyLength > 0)
        {
            buffer.putBytes(position, currencyHeader, 0, currencyHeaderLength);
            position += currencyHeaderLength;
            buffer.putBytes(position, currency, currencyOffset, currencyLength);
            position += currencyLength;
            buffer.putSeparator(position);
            position++;
        }

        if (tradeDateLength > 0)
        {
            buffer.putBytes(position, tradeDateHeader, 0, tradeDateHeaderLength);
            position += tradeDateHeaderLength;
            buffer.putBytes(position, tradeDate, tradeDateOffset, tradeDateLength);
            position += tradeDateLength;
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

        if (uRLLinkLength > 0)
        {
            buffer.putBytes(position, uRLLinkHeader, 0, uRLLinkHeaderLength);
            position += uRLLinkHeaderLength;
            buffer.putBytes(position, uRLLink, uRLLinkOffset, uRLLinkLength);
            position += uRLLinkLength;
            buffer.putSeparator(position);
            position++;
        }

        if (lastMktLength > 0)
        {
            buffer.putBytes(position, lastMktHeader, 0, lastMktHeaderLength);
            position += lastMktHeaderLength;
            buffer.putBytes(position, lastMkt, lastMktOffset, lastMktLength);
            position += lastMktLength;
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
        this.resetAdvId();
        this.resetAdvTransType();
        this.resetAdvRefID();
        this.resetAdvSide();
        this.resetQuantity();
        this.resetQtyType();
        this.resetPrice();
        this.resetCurrency();
        this.resetTradeDate();
        this.resetTransactTime();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        this.resetURLLink();
        this.resetLastMkt();
        this.resetTradingSessionID();
        this.resetTradingSessionSubID();
        instrument.reset();
        instrmtLegGrp.reset();
        undInstrmtGrp.reset();
    }

    public void resetAdvId()
    {
        advIdLength = 0;
    }

    public void resetAdvTransType()
    {
        advTransTypeLength = 0;
    }

    public void resetAdvRefID()
    {
        advRefIDLength = 0;
    }

    public void resetAdvSide()
    {
        advSide = MISSING_CHAR;
    }

    public void resetQuantity()
    {
        hasQuantity = false;
    }

    public void resetQtyType()
    {
        hasQtyType = false;
    }

    public void resetPrice()
    {
        hasPrice = false;
    }

    public void resetCurrency()
    {
        currencyLength = 0;
    }

    public void resetTradeDate()
    {
        tradeDateLength = 0;
    }

    public void resetTransactTime()
    {
        transactTimeLength = 0;
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

    public void resetURLLink()
    {
        uRLLinkLength = 0;
    }

    public void resetLastMkt()
    {
        lastMktLength = 0;
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
        builder.append("\"MessageName\": \"Advertisement\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasAdvId())
        {
            indent(builder, level);
            builder.append("\"AdvId\": \"");
            appendBuffer(builder, advId, advIdOffset, advIdLength);
            builder.append("\",\n");
        }

        if (hasAdvTransType())
        {
            indent(builder, level);
            builder.append("\"AdvTransType\": \"");
            appendBuffer(builder, advTransType, advTransTypeOffset, advTransTypeLength);
            builder.append("\",\n");
        }

        if (hasAdvRefID())
        {
            indent(builder, level);
            builder.append("\"AdvRefID\": \"");
            appendBuffer(builder, advRefID, advRefIDOffset, advRefIDLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"Instrument\": ");
    instrument.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"InstrmtLegGrp\": ");
    instrmtLegGrp.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"UndInstrmtGrp\": ");
    undInstrmtGrp.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasAdvSide())
        {
            indent(builder, level);
            builder.append("\"AdvSide\": \"");
            builder.append(advSide);
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

        if (hasPrice())
        {
            indent(builder, level);
            builder.append("\"Price\": \"");
            price.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasCurrency())
        {
            indent(builder, level);
            builder.append("\"Currency\": \"");
            appendBuffer(builder, currency, currencyOffset, currencyLength);
            builder.append("\",\n");
        }

        if (hasTradeDate())
        {
            indent(builder, level);
            builder.append("\"TradeDate\": \"");
            appendBuffer(builder, tradeDate, tradeDateOffset, tradeDateLength);
            builder.append("\",\n");
        }

        if (hasTransactTime())
        {
            indent(builder, level);
            builder.append("\"TransactTime\": \"");
            appendBuffer(builder, transactTime, transactTimeOffset, transactTimeLength);
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

        if (hasURLLink())
        {
            indent(builder, level);
            builder.append("\"URLLink\": \"");
            appendBuffer(builder, uRLLink, uRLLinkOffset, uRLLinkLength);
            builder.append("\",\n");
        }

        if (hasLastMkt())
        {
            indent(builder, level);
            builder.append("\"LastMkt\": \"");
            appendBuffer(builder, lastMkt, lastMktOffset, lastMktLength);
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
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public AdvertisementEncoder copyTo(final Encoder encoder)
    {
        return copyTo((AdvertisementEncoder)encoder);
    }

    public AdvertisementEncoder copyTo(final AdvertisementEncoder encoder)
    {
        encoder.reset();
        if (hasAdvId())
        {
            encoder.advIdAsCopy(advId.byteArray(), 0, advIdLength);
        }

        if (hasAdvTransType())
        {
            encoder.advTransTypeAsCopy(advTransType.byteArray(), 0, advTransTypeLength);
        }

        if (hasAdvRefID())
        {
            encoder.advRefIDAsCopy(advRefID.byteArray(), 0, advRefIDLength);
        }


        instrument.copyTo(encoder.instrument());

        instrmtLegGrp.copyTo(encoder.instrmtLegGrp());

        undInstrmtGrp.copyTo(encoder.undInstrmtGrp());
        if (hasAdvSide())
        {
            encoder.advSide(this.advSide());
        }

        if (hasQuantity())
        {
            encoder.quantity(this.quantity());
        }

        if (hasQtyType())
        {
            encoder.qtyType(this.qtyType());
        }

        if (hasPrice())
        {
            encoder.price(this.price());
        }

        if (hasCurrency())
        {
            encoder.currencyAsCopy(currency.byteArray(), 0, currencyLength);
        }

        if (hasTradeDate())
        {
            encoder.tradeDateAsCopy(tradeDate.byteArray(), 0, tradeDateLength);
        }

        if (hasTransactTime())
        {
            encoder.transactTimeAsCopy(transactTime.byteArray(), 0, transactTimeLength);
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

        if (hasURLLink())
        {
            encoder.uRLLinkAsCopy(uRLLink.byteArray(), 0, uRLLinkLength);
        }

        if (hasLastMkt())
        {
            encoder.lastMktAsCopy(lastMkt.byteArray(), 0, lastMktLength);
        }

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
