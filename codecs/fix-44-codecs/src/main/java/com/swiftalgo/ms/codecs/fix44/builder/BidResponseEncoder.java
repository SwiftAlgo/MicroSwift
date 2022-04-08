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


public class BidResponseEncoder implements Encoder
{
    public long messageType()
    {
        return 108L;
    }

    public BidResponseEncoder()
    {
        header.msgType("l");
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

    private static final int bidIDHeaderLength = 4;
    private static final byte[] bidIDHeader = new byte[] {51, 57, 48, (byte) '='};

    private static final int clientBidIDHeaderLength = 4;
    private static final byte[] clientBidIDHeader = new byte[] {51, 57, 49, (byte) '='};

    private static final int noBidComponentsGroupCounterHeaderLength = 4;
    private static final byte[] noBidComponentsGroupCounterHeader = new byte[] {52, 50, 48, (byte) '='};

    private final MutableDirectBuffer bidID = new UnsafeBuffer();

    private int bidIDOffset = 0;

    private int bidIDLength = 0;

    public BidResponseEncoder bidID(final DirectBuffer value, final int offset, final int length)
    {
        bidID.wrap(value);
        bidIDOffset = offset;
        bidIDLength = length;
        return this;
    }

    public BidResponseEncoder bidID(final DirectBuffer value, final int length)
    {
        return bidID(value, 0, length);
    }

    public BidResponseEncoder bidID(final DirectBuffer value)
    {
        return bidID(value, 0, value.capacity());
    }

    public BidResponseEncoder bidID(final byte[] value, final int offset, final int length)
    {
        bidID.wrap(value);
        bidIDOffset = offset;
        bidIDLength = length;
        return this;
    }

    public BidResponseEncoder bidIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(bidID, value, offset, length);
        bidIDOffset = offset;
        bidIDLength = length;
        return this;
    }

    public BidResponseEncoder bidID(final byte[] value, final int length)
    {
        return bidID(value, 0, length);
    }

    public BidResponseEncoder bidID(final byte[] value)
    {
        return bidID(value, 0, value.length);
    }

    public boolean hasBidID()
    {
        return bidIDLength > 0;
    }

    public MutableDirectBuffer bidID()
    {
        return bidID;
    }

    public String bidIDAsString()
    {
        return bidID.getStringWithoutLengthAscii(bidIDOffset, bidIDLength);
    }

    public BidResponseEncoder bidID(final CharSequence value)
    {
        toBytes(value, bidID);
        bidIDOffset = 0;
        bidIDLength = value.length();
        return this;
    }

    public BidResponseEncoder bidID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            bidID.wrap(buffer);
            bidIDOffset = value.offset();
            bidIDLength = value.length();
        }
        return this;
    }

    public BidResponseEncoder bidID(final char[] value)
    {
        return bidID(value, 0, value.length);
    }

    public BidResponseEncoder bidID(final char[] value, final int length)
    {
        return bidID(value, 0, length);
    }

    public BidResponseEncoder bidID(final char[] value, final int offset, final int length)
    {
        toBytes(value, bidID, offset, length);
        bidIDOffset = 0;
        bidIDLength = length;
        return this;
    }

    private final MutableDirectBuffer clientBidID = new UnsafeBuffer();

    private int clientBidIDOffset = 0;

    private int clientBidIDLength = 0;

    public BidResponseEncoder clientBidID(final DirectBuffer value, final int offset, final int length)
    {
        clientBidID.wrap(value);
        clientBidIDOffset = offset;
        clientBidIDLength = length;
        return this;
    }

    public BidResponseEncoder clientBidID(final DirectBuffer value, final int length)
    {
        return clientBidID(value, 0, length);
    }

    public BidResponseEncoder clientBidID(final DirectBuffer value)
    {
        return clientBidID(value, 0, value.capacity());
    }

    public BidResponseEncoder clientBidID(final byte[] value, final int offset, final int length)
    {
        clientBidID.wrap(value);
        clientBidIDOffset = offset;
        clientBidIDLength = length;
        return this;
    }

    public BidResponseEncoder clientBidIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(clientBidID, value, offset, length);
        clientBidIDOffset = offset;
        clientBidIDLength = length;
        return this;
    }

    public BidResponseEncoder clientBidID(final byte[] value, final int length)
    {
        return clientBidID(value, 0, length);
    }

    public BidResponseEncoder clientBidID(final byte[] value)
    {
        return clientBidID(value, 0, value.length);
    }

    public boolean hasClientBidID()
    {
        return clientBidIDLength > 0;
    }

    public MutableDirectBuffer clientBidID()
    {
        return clientBidID;
    }

    public String clientBidIDAsString()
    {
        return clientBidID.getStringWithoutLengthAscii(clientBidIDOffset, clientBidIDLength);
    }

    public BidResponseEncoder clientBidID(final CharSequence value)
    {
        toBytes(value, clientBidID);
        clientBidIDOffset = 0;
        clientBidIDLength = value.length();
        return this;
    }

    public BidResponseEncoder clientBidID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            clientBidID.wrap(buffer);
            clientBidIDOffset = value.offset();
            clientBidIDLength = value.length();
        }
        return this;
    }

    public BidResponseEncoder clientBidID(final char[] value)
    {
        return clientBidID(value, 0, value.length);
    }

    public BidResponseEncoder clientBidID(final char[] value, final int length)
    {
        return clientBidID(value, 0, length);
    }

    public BidResponseEncoder clientBidID(final char[] value, final int offset, final int length)
    {
        toBytes(value, clientBidID, offset, length);
        clientBidIDOffset = 0;
        clientBidIDLength = length;
        return this;
    }



public static class BidComponentsGroupEncoder
{
    private BidComponentsGroupEncoder next = null;

    public BidComponentsGroupEncoder next()
    {
        if (next == null)
        {
            next = new BidComponentsGroupEncoder();
        }
        return next;
    }

    private static final int listIDHeaderLength = 3;
    private static final byte[] listIDHeader = new byte[] {54, 54, (byte) '='};

    private static final int countryHeaderLength = 4;
    private static final byte[] countryHeader = new byte[] {52, 50, 49, (byte) '='};

    private static final int sideHeaderLength = 3;
    private static final byte[] sideHeader = new byte[] {53, 52, (byte) '='};

    private static final int priceHeaderLength = 3;
    private static final byte[] priceHeader = new byte[] {52, 52, (byte) '='};

    private static final int priceTypeHeaderLength = 4;
    private static final byte[] priceTypeHeader = new byte[] {52, 50, 51, (byte) '='};

    private static final int fairValueHeaderLength = 4;
    private static final byte[] fairValueHeader = new byte[] {52, 48, 54, (byte) '='};

    private static final int netGrossIndHeaderLength = 4;
    private static final byte[] netGrossIndHeader = new byte[] {52, 51, 48, (byte) '='};

    private static final int settlTypeHeaderLength = 3;
    private static final byte[] settlTypeHeader = new byte[] {54, 51, (byte) '='};

    private static final int settlDateHeaderLength = 3;
    private static final byte[] settlDateHeader = new byte[] {54, 52, (byte) '='};

    private static final int tradingSessionIDHeaderLength = 4;
    private static final byte[] tradingSessionIDHeader = new byte[] {51, 51, 54, (byte) '='};

    private static final int tradingSessionSubIDHeaderLength = 4;
    private static final byte[] tradingSessionSubIDHeader = new byte[] {54, 50, 53, (byte) '='};

    private static final int textHeaderLength = 3;
    private static final byte[] textHeader = new byte[] {53, 56, (byte) '='};

    private static final int encodedTextLenHeaderLength = 4;
    private static final byte[] encodedTextLenHeader = new byte[] {51, 53, 52, (byte) '='};

    private static final int encodedTextHeaderLength = 4;
    private static final byte[] encodedTextHeader = new byte[] {51, 53, 53, (byte) '='};

    private final CommissionDataEncoder commissionData = new CommissionDataEncoder();
    public CommissionDataEncoder commissionData()
    {
        return commissionData;
    }

    private final MutableDirectBuffer listID = new UnsafeBuffer();

    private int listIDOffset = 0;

    private int listIDLength = 0;

    public BidComponentsGroupEncoder listID(final DirectBuffer value, final int offset, final int length)
    {
        listID.wrap(value);
        listIDOffset = offset;
        listIDLength = length;
        return this;
    }

    public BidComponentsGroupEncoder listID(final DirectBuffer value, final int length)
    {
        return listID(value, 0, length);
    }

    public BidComponentsGroupEncoder listID(final DirectBuffer value)
    {
        return listID(value, 0, value.capacity());
    }

    public BidComponentsGroupEncoder listID(final byte[] value, final int offset, final int length)
    {
        listID.wrap(value);
        listIDOffset = offset;
        listIDLength = length;
        return this;
    }

    public BidComponentsGroupEncoder listIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(listID, value, offset, length);
        listIDOffset = offset;
        listIDLength = length;
        return this;
    }

    public BidComponentsGroupEncoder listID(final byte[] value, final int length)
    {
        return listID(value, 0, length);
    }

    public BidComponentsGroupEncoder listID(final byte[] value)
    {
        return listID(value, 0, value.length);
    }

    public boolean hasListID()
    {
        return listIDLength > 0;
    }

    public MutableDirectBuffer listID()
    {
        return listID;
    }

    public String listIDAsString()
    {
        return listID.getStringWithoutLengthAscii(listIDOffset, listIDLength);
    }

    public BidComponentsGroupEncoder listID(final CharSequence value)
    {
        toBytes(value, listID);
        listIDOffset = 0;
        listIDLength = value.length();
        return this;
    }

    public BidComponentsGroupEncoder listID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            listID.wrap(buffer);
            listIDOffset = value.offset();
            listIDLength = value.length();
        }
        return this;
    }

    public BidComponentsGroupEncoder listID(final char[] value)
    {
        return listID(value, 0, value.length);
    }

    public BidComponentsGroupEncoder listID(final char[] value, final int length)
    {
        return listID(value, 0, length);
    }

    public BidComponentsGroupEncoder listID(final char[] value, final int offset, final int length)
    {
        toBytes(value, listID, offset, length);
        listIDOffset = 0;
        listIDLength = length;
        return this;
    }

    private final MutableDirectBuffer country = new UnsafeBuffer();

    private int countryOffset = 0;

    private int countryLength = 0;

    public BidComponentsGroupEncoder country(final DirectBuffer value, final int offset, final int length)
    {
        country.wrap(value);
        countryOffset = offset;
        countryLength = length;
        return this;
    }

    public BidComponentsGroupEncoder country(final DirectBuffer value, final int length)
    {
        return country(value, 0, length);
    }

    public BidComponentsGroupEncoder country(final DirectBuffer value)
    {
        return country(value, 0, value.capacity());
    }

    public BidComponentsGroupEncoder country(final byte[] value, final int offset, final int length)
    {
        country.wrap(value);
        countryOffset = offset;
        countryLength = length;
        return this;
    }

    public BidComponentsGroupEncoder countryAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(country, value, offset, length);
        countryOffset = offset;
        countryLength = length;
        return this;
    }

    public BidComponentsGroupEncoder country(final byte[] value, final int length)
    {
        return country(value, 0, length);
    }

    public BidComponentsGroupEncoder country(final byte[] value)
    {
        return country(value, 0, value.length);
    }

    public boolean hasCountry()
    {
        return countryLength > 0;
    }

    public MutableDirectBuffer country()
    {
        return country;
    }

    public String countryAsString()
    {
        return country.getStringWithoutLengthAscii(countryOffset, countryLength);
    }

    public BidComponentsGroupEncoder country(final CharSequence value)
    {
        toBytes(value, country);
        countryOffset = 0;
        countryLength = value.length();
        return this;
    }

    public BidComponentsGroupEncoder country(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            country.wrap(buffer);
            countryOffset = value.offset();
            countryLength = value.length();
        }
        return this;
    }

    public BidComponentsGroupEncoder country(final char[] value)
    {
        return country(value, 0, value.length);
    }

    public BidComponentsGroupEncoder country(final char[] value, final int length)
    {
        return country(value, 0, length);
    }

    public BidComponentsGroupEncoder country(final char[] value, final int offset, final int length)
    {
        toBytes(value, country, offset, length);
        countryOffset = 0;
        countryLength = length;
        return this;
    }

    private char side;

    private boolean hasSide;

    public boolean hasSide()
    {
        return hasSide;
    }

    public BidComponentsGroupEncoder side(char value)
    {
        side = value;
        hasSide = true;
        return this;
    }

    public char side()
    {
        return side;
    }

    public BidComponentsGroupEncoder side(Side value)
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

    public BidComponentsGroupEncoder price(DecimalFloat value)
    {
        price.set(value);
        hasPrice = true;
        return this;
    }

    public BidComponentsGroupEncoder price(long value, int scale)
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

    public BidComponentsGroupEncoder priceType(int value)
    {
        priceType = value;
        hasPriceType = true;
        return this;
    }

    public int priceType()
    {
        return priceType;
    }

    public BidComponentsGroupEncoder priceType(PriceType value)
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

    private final DecimalFloat fairValue = new DecimalFloat();

    private boolean hasFairValue;

    public boolean hasFairValue()
    {
        return hasFairValue;
    }

    public BidComponentsGroupEncoder fairValue(DecimalFloat value)
    {
        fairValue.set(value);
        hasFairValue = true;
        return this;
    }

    public BidComponentsGroupEncoder fairValue(long value, int scale)
    {
        fairValue.set(value, scale);
        hasFairValue = true;
        return this;
    }

    public DecimalFloat fairValue()
    {
        return fairValue;
    }

    private int netGrossInd;

    private boolean hasNetGrossInd;

    public boolean hasNetGrossInd()
    {
        return hasNetGrossInd;
    }

    public BidComponentsGroupEncoder netGrossInd(int value)
    {
        netGrossInd = value;
        hasNetGrossInd = true;
        return this;
    }

    public int netGrossInd()
    {
        return netGrossInd;
    }

    public BidComponentsGroupEncoder netGrossInd(NetGrossInd value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == NetGrossInd.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: netGrossInd Value: " + value );
            }
            if (value == NetGrossInd.NULL_VAL)
            {
                return this;
            }
        }
        return netGrossInd(value.representation());
    }

    private char settlType;

    private boolean hasSettlType;

    public boolean hasSettlType()
    {
        return hasSettlType;
    }

    public BidComponentsGroupEncoder settlType(char value)
    {
        settlType = value;
        hasSettlType = true;
        return this;
    }

    public char settlType()
    {
        return settlType;
    }

    public BidComponentsGroupEncoder settlType(SettlType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == SettlType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: settlType Value: " + value );
            }
            if (value == SettlType.NULL_VAL)
            {
                return this;
            }
        }
        return settlType(value.representation());
    }

    private final MutableDirectBuffer settlDate = new UnsafeBuffer();

    private int settlDateOffset = 0;

    private int settlDateLength = 0;

    public BidComponentsGroupEncoder settlDate(final DirectBuffer value, final int offset, final int length)
    {
        settlDate.wrap(value);
        settlDateOffset = offset;
        settlDateLength = length;
        return this;
    }

    public BidComponentsGroupEncoder settlDate(final DirectBuffer value, final int length)
    {
        return settlDate(value, 0, length);
    }

    public BidComponentsGroupEncoder settlDate(final DirectBuffer value)
    {
        return settlDate(value, 0, value.capacity());
    }

    public BidComponentsGroupEncoder settlDate(final byte[] value, final int offset, final int length)
    {
        settlDate.wrap(value);
        settlDateOffset = offset;
        settlDateLength = length;
        return this;
    }

    public BidComponentsGroupEncoder settlDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlDate, value, offset, length);
        settlDateOffset = offset;
        settlDateLength = length;
        return this;
    }

    public BidComponentsGroupEncoder settlDate(final byte[] value, final int length)
    {
        return settlDate(value, 0, length);
    }

    public BidComponentsGroupEncoder settlDate(final byte[] value)
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

    private final MutableDirectBuffer tradingSessionID = new UnsafeBuffer();

    private int tradingSessionIDOffset = 0;

    private int tradingSessionIDLength = 0;

    public BidComponentsGroupEncoder tradingSessionID(final DirectBuffer value, final int offset, final int length)
    {
        tradingSessionID.wrap(value);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public BidComponentsGroupEncoder tradingSessionID(final DirectBuffer value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public BidComponentsGroupEncoder tradingSessionID(final DirectBuffer value)
    {
        return tradingSessionID(value, 0, value.capacity());
    }

    public BidComponentsGroupEncoder tradingSessionID(final byte[] value, final int offset, final int length)
    {
        tradingSessionID.wrap(value);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public BidComponentsGroupEncoder tradingSessionIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradingSessionID, value, offset, length);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public BidComponentsGroupEncoder tradingSessionID(final byte[] value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public BidComponentsGroupEncoder tradingSessionID(final byte[] value)
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

    public BidComponentsGroupEncoder tradingSessionID(final CharSequence value)
    {
        toBytes(value, tradingSessionID);
        tradingSessionIDOffset = 0;
        tradingSessionIDLength = value.length();
        return this;
    }

    public BidComponentsGroupEncoder tradingSessionID(final AsciiSequenceView value)
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

    public BidComponentsGroupEncoder tradingSessionID(final char[] value)
    {
        return tradingSessionID(value, 0, value.length);
    }

    public BidComponentsGroupEncoder tradingSessionID(final char[] value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public BidComponentsGroupEncoder tradingSessionID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradingSessionID, offset, length);
        tradingSessionIDOffset = 0;
        tradingSessionIDLength = length;
        return this;
    }

    private final MutableDirectBuffer tradingSessionSubID = new UnsafeBuffer();

    private int tradingSessionSubIDOffset = 0;

    private int tradingSessionSubIDLength = 0;

    public BidComponentsGroupEncoder tradingSessionSubID(final DirectBuffer value, final int offset, final int length)
    {
        tradingSessionSubID.wrap(value);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public BidComponentsGroupEncoder tradingSessionSubID(final DirectBuffer value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public BidComponentsGroupEncoder tradingSessionSubID(final DirectBuffer value)
    {
        return tradingSessionSubID(value, 0, value.capacity());
    }

    public BidComponentsGroupEncoder tradingSessionSubID(final byte[] value, final int offset, final int length)
    {
        tradingSessionSubID.wrap(value);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public BidComponentsGroupEncoder tradingSessionSubIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradingSessionSubID, value, offset, length);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public BidComponentsGroupEncoder tradingSessionSubID(final byte[] value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public BidComponentsGroupEncoder tradingSessionSubID(final byte[] value)
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

    public BidComponentsGroupEncoder tradingSessionSubID(final CharSequence value)
    {
        toBytes(value, tradingSessionSubID);
        tradingSessionSubIDOffset = 0;
        tradingSessionSubIDLength = value.length();
        return this;
    }

    public BidComponentsGroupEncoder tradingSessionSubID(final AsciiSequenceView value)
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

    public BidComponentsGroupEncoder tradingSessionSubID(final char[] value)
    {
        return tradingSessionSubID(value, 0, value.length);
    }

    public BidComponentsGroupEncoder tradingSessionSubID(final char[] value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public BidComponentsGroupEncoder tradingSessionSubID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradingSessionSubID, offset, length);
        tradingSessionSubIDOffset = 0;
        tradingSessionSubIDLength = length;
        return this;
    }

    private final MutableDirectBuffer text = new UnsafeBuffer();

    private int textOffset = 0;

    private int textLength = 0;

    public BidComponentsGroupEncoder text(final DirectBuffer value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public BidComponentsGroupEncoder text(final DirectBuffer value, final int length)
    {
        return text(value, 0, length);
    }

    public BidComponentsGroupEncoder text(final DirectBuffer value)
    {
        return text(value, 0, value.capacity());
    }

    public BidComponentsGroupEncoder text(final byte[] value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public BidComponentsGroupEncoder textAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(text, value, offset, length);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public BidComponentsGroupEncoder text(final byte[] value, final int length)
    {
        return text(value, 0, length);
    }

    public BidComponentsGroupEncoder text(final byte[] value)
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

    public BidComponentsGroupEncoder text(final CharSequence value)
    {
        toBytes(value, text);
        textOffset = 0;
        textLength = value.length();
        return this;
    }

    public BidComponentsGroupEncoder text(final AsciiSequenceView value)
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

    public BidComponentsGroupEncoder text(final char[] value)
    {
        return text(value, 0, value.length);
    }

    public BidComponentsGroupEncoder text(final char[] value, final int length)
    {
        return text(value, 0, length);
    }

    public BidComponentsGroupEncoder text(final char[] value, final int offset, final int length)
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

    public BidComponentsGroupEncoder encodedTextLen(int value)
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

    public BidComponentsGroupEncoder encodedText(byte[] value)
    {
        encodedText = value;
        hasEncodedText = true;
        return this;
    }

    public byte[] encodedText()
    {
        return encodedText;
    }

    public BidComponentsGroupEncoder encodedTextAsCopy(final byte[] value, final int offset, final int length)
    {
        encodedText = copyInto(encodedText, value, offset, length);
        hasEncodedText = true;
        return this;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

            position += commissionData.encode(buffer, position);

        if (listIDLength > 0)
        {
            buffer.putBytes(position, listIDHeader, 0, listIDHeaderLength);
            position += listIDHeaderLength;
            buffer.putBytes(position, listID, listIDOffset, listIDLength);
            position += listIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (countryLength > 0)
        {
            buffer.putBytes(position, countryHeader, 0, countryHeaderLength);
            position += countryHeaderLength;
            buffer.putBytes(position, country, countryOffset, countryLength);
            position += countryLength;
            buffer.putSeparator(position);
            position++;
        }

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

        if (hasFairValue)
        {
            buffer.putBytes(position, fairValueHeader, 0, fairValueHeaderLength);
            position += fairValueHeaderLength;
            position += buffer.putFloatAscii(position, fairValue);
            buffer.putSeparator(position);
            position++;
        }

        if (hasNetGrossInd)
        {
            buffer.putBytes(position, netGrossIndHeader, 0, netGrossIndHeaderLength);
            position += netGrossIndHeaderLength;
            position += buffer.putIntAscii(position, netGrossInd);
            buffer.putSeparator(position);
            position++;
        }

        if (hasSettlType)
        {
            buffer.putBytes(position, settlTypeHeader, 0, settlTypeHeaderLength);
            position += settlTypeHeaderLength;
            position += buffer.putCharAscii(position, settlType);
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
        if (next != null)
        {
            position += next.encode(buffer, position, remainingElements - 1);
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetListID();
        this.resetCountry();
        this.resetSide();
        this.resetPrice();
        this.resetPriceType();
        this.resetFairValue();
        this.resetNetGrossInd();
        this.resetSettlType();
        this.resetSettlDate();
        this.resetTradingSessionID();
        this.resetTradingSessionSubID();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        commissionData.reset();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetListID()
    {
        listIDLength = 0;
    }

    public void resetCountry()
    {
        countryLength = 0;
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

    public void resetFairValue()
    {
        hasFairValue = false;
    }

    public void resetNetGrossInd()
    {
        hasNetGrossInd = false;
    }

    public void resetSettlType()
    {
        hasSettlType = false;
    }

    public void resetSettlDate()
    {
        settlDateLength = 0;
    }

    public void resetTradingSessionID()
    {
        tradingSessionIDLength = 0;
    }

    public void resetTradingSessionSubID()
    {
        tradingSessionSubIDLength = 0;
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
        builder.append("\"MessageName\": \"BidComponentsGroup\",\n");
    indent(builder, level);
    builder.append("\"CommissionData\": ");
    commissionData.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasListID())
        {
            indent(builder, level);
            builder.append("\"ListID\": \"");
            appendBuffer(builder, listID, listIDOffset, listIDLength);
            builder.append("\",\n");
        }

        if (hasCountry())
        {
            indent(builder, level);
            builder.append("\"Country\": \"");
            appendBuffer(builder, country, countryOffset, countryLength);
            builder.append("\",\n");
        }

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

        if (hasFairValue())
        {
            indent(builder, level);
            builder.append("\"FairValue\": \"");
            fairValue.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasNetGrossInd())
        {
            indent(builder, level);
            builder.append("\"NetGrossInd\": \"");
            builder.append(netGrossInd);
            builder.append("\",\n");
        }

        if (hasSettlType())
        {
            indent(builder, level);
            builder.append("\"SettlType\": \"");
            builder.append(settlType);
            builder.append("\",\n");
        }

        if (hasSettlDate())
        {
            indent(builder, level);
            builder.append("\"SettlDate\": \"");
            appendBuffer(builder, settlDate, settlDateOffset, settlDateLength);
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
    public BidComponentsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((BidComponentsGroupEncoder)encoder);
    }

    public BidComponentsGroupEncoder copyTo(final BidComponentsGroupEncoder encoder)
    {
        encoder.reset();

        commissionData.copyTo(encoder.commissionData());
        if (hasListID())
        {
            encoder.listIDAsCopy(listID.byteArray(), 0, listIDLength);
        }

        if (hasCountry())
        {
            encoder.countryAsCopy(country.byteArray(), 0, countryLength);
        }

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

        if (hasFairValue())
        {
            encoder.fairValue(this.fairValue());
        }

        if (hasNetGrossInd())
        {
            encoder.netGrossInd(this.netGrossInd());
        }

        if (hasSettlType())
        {
            encoder.settlType(this.settlType());
        }

        if (hasSettlDate())
        {
            encoder.settlDateAsCopy(settlDate.byteArray(), 0, settlDateLength);
        }

        if (hasTradingSessionID())
        {
            encoder.tradingSessionIDAsCopy(tradingSessionID.byteArray(), 0, tradingSessionIDLength);
        }

        if (hasTradingSessionSubID())
        {
            encoder.tradingSessionSubIDAsCopy(tradingSessionSubID.byteArray(), 0, tradingSessionSubIDLength);
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
    private int noBidComponentsGroupCounter;

    private boolean hasNoBidComponentsGroupCounter;

    public boolean hasNoBidComponentsGroupCounter()
    {
        return hasNoBidComponentsGroupCounter;
    }

    public BidResponseEncoder noBidComponentsGroupCounter(int value)
    {
        noBidComponentsGroupCounter = value;
        hasNoBidComponentsGroupCounter = true;
        return this;
    }

    public int noBidComponentsGroupCounter()
    {
        return noBidComponentsGroupCounter;
    }


    private BidComponentsGroupEncoder bidComponentsGroup = null;

    public BidComponentsGroupEncoder bidComponentsGroup(final int numberOfElements)
    {
        hasNoBidComponentsGroupCounter = true;
        noBidComponentsGroupCounter = numberOfElements;
        if (bidComponentsGroup == null)
        {
            bidComponentsGroup = new BidComponentsGroupEncoder();
        }
        return bidComponentsGroup;
    }

    public long encode(final MutableAsciiBuffer buffer, final int offset)
    {
        final long startMessageResult = header.startMessage(buffer, offset);
        final int bodyStart = Encoder.offset(startMessageResult);
        int position = bodyStart + Encoder.length(startMessageResult);

        if (bidIDLength > 0)
        {
            buffer.putBytes(position, bidIDHeader, 0, bidIDHeaderLength);
            position += bidIDHeaderLength;
            buffer.putBytes(position, bidID, bidIDOffset, bidIDLength);
            position += bidIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (clientBidIDLength > 0)
        {
            buffer.putBytes(position, clientBidIDHeader, 0, clientBidIDHeaderLength);
            position += clientBidIDHeaderLength;
            buffer.putBytes(position, clientBidID, clientBidIDOffset, clientBidIDLength);
            position += clientBidIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasNoBidComponentsGroupCounter)
        {
            buffer.putBytes(position, noBidComponentsGroupCounterHeader, 0, noBidComponentsGroupCounterHeaderLength);
            position += noBidComponentsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noBidComponentsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (bidComponentsGroup != null)
        {
            position += bidComponentsGroup.encode(buffer, position, noBidComponentsGroupCounter);
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
        this.resetBidID();
        this.resetClientBidID();
        this.resetBidComponentsGroup();
    }

    public void resetBidID()
    {
        bidIDLength = 0;
    }

    public void resetClientBidID()
    {
        clientBidIDLength = 0;
    }

    public void resetBidComponentsGroup()
    {
        if (bidComponentsGroup != null)
        {
            bidComponentsGroup.reset();
        }
        noBidComponentsGroupCounter = 0;
        hasNoBidComponentsGroupCounter = false;
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
        builder.append("\"MessageName\": \"BidResponse\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasBidID())
        {
            indent(builder, level);
            builder.append("\"BidID\": \"");
            appendBuffer(builder, bidID, bidIDOffset, bidIDLength);
            builder.append("\",\n");
        }

        if (hasClientBidID())
        {
            indent(builder, level);
            builder.append("\"ClientBidID\": \"");
            appendBuffer(builder, clientBidID, clientBidIDOffset, clientBidIDLength);
            builder.append("\",\n");
        }

        if (hasNoBidComponentsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"BidComponentsGroup\": [\n");
            final int noBidComponentsGroupCounter = this.noBidComponentsGroupCounter;
            BidComponentsGroupEncoder bidComponentsGroup = this.bidComponentsGroup;
            for (int i = 0; i < noBidComponentsGroupCounter; i++)
            {
                indent(builder, level);
                bidComponentsGroup.appendTo(builder, level + 1);
                if (i < (noBidComponentsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                bidComponentsGroup = bidComponentsGroup.next();
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
    public BidResponseEncoder copyTo(final Encoder encoder)
    {
        return copyTo((BidResponseEncoder)encoder);
    }

    public BidResponseEncoder copyTo(final BidResponseEncoder encoder)
    {
        encoder.reset();
        if (hasBidID())
        {
            encoder.bidIDAsCopy(bidID.byteArray(), 0, bidIDLength);
        }

        if (hasClientBidID())
        {
            encoder.clientBidIDAsCopy(clientBidID.byteArray(), 0, clientBidIDLength);
        }

        if (hasNoBidComponentsGroupCounter)
        {
            final int size = this.noBidComponentsGroupCounter;
            BidComponentsGroupEncoder bidComponentsGroup = this.bidComponentsGroup;
            BidComponentsGroupEncoder bidComponentsGroupEncoder = encoder.bidComponentsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (bidComponentsGroup != null)
                {
                    bidComponentsGroup.copyTo(bidComponentsGroupEncoder);
                    bidComponentsGroup = bidComponentsGroup.next();
                    bidComponentsGroupEncoder = bidComponentsGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
