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


public class QuoteResponseEncoder implements Encoder
{
    public long messageType()
    {
        return 19009L;
    }

    public QuoteResponseEncoder()
    {
        header.msgType("AJ");
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

    private static final int quoteRespIDHeaderLength = 4;
    private static final byte[] quoteRespIDHeader = new byte[] {54, 57, 51, (byte) '='};

    private static final int quoteIDHeaderLength = 4;
    private static final byte[] quoteIDHeader = new byte[] {49, 49, 55, (byte) '='};

    private static final int quoteMsgIDHeaderLength = 5;
    private static final byte[] quoteMsgIDHeader = new byte[] {49, 49, 54, 54, (byte) '='};

    private static final int quoteRespTypeHeaderLength = 4;
    private static final byte[] quoteRespTypeHeader = new byte[] {54, 57, 52, (byte) '='};

    private static final int clOrdIDHeaderLength = 3;
    private static final byte[] clOrdIDHeader = new byte[] {49, 49, (byte) '='};

    private static final int orderCapacityHeaderLength = 4;
    private static final byte[] orderCapacityHeader = new byte[] {53, 50, 56, (byte) '='};

    private static final int orderRestrictionsHeaderLength = 4;
    private static final byte[] orderRestrictionsHeader = new byte[] {53, 50, 57, (byte) '='};

    private static final int iOIIDHeaderLength = 3;
    private static final byte[] iOIIDHeader = new byte[] {50, 51, (byte) '='};

    private static final int quoteTypeHeaderLength = 4;
    private static final byte[] quoteTypeHeader = new byte[] {53, 51, 55, (byte) '='};

    private static final int preTradeAnonymityHeaderLength = 5;
    private static final byte[] preTradeAnonymityHeader = new byte[] {49, 48, 57, 49, (byte) '='};

    private static final int tradingSessionIDHeaderLength = 4;
    private static final byte[] tradingSessionIDHeader = new byte[] {51, 51, 54, (byte) '='};

    private static final int tradingSessionSubIDHeaderLength = 4;
    private static final byte[] tradingSessionSubIDHeader = new byte[] {54, 50, 53, (byte) '='};

    private static final int sideHeaderLength = 3;
    private static final byte[] sideHeader = new byte[] {53, 52, (byte) '='};

    private static final int minQtyHeaderLength = 4;
    private static final byte[] minQtyHeader = new byte[] {49, 49, 48, (byte) '='};

    private static final int settlTypeHeaderLength = 3;
    private static final byte[] settlTypeHeader = new byte[] {54, 51, (byte) '='};

    private static final int settlDateHeaderLength = 3;
    private static final byte[] settlDateHeader = new byte[] {54, 52, (byte) '='};

    private static final int settlDate2HeaderLength = 4;
    private static final byte[] settlDate2Header = new byte[] {49, 57, 51, (byte) '='};

    private static final int orderQty2HeaderLength = 4;
    private static final byte[] orderQty2Header = new byte[] {49, 57, 50, (byte) '='};

    private static final int currencyHeaderLength = 3;
    private static final byte[] currencyHeader = new byte[] {49, 53, (byte) '='};

    private static final int accountHeaderLength = 2;
    private static final byte[] accountHeader = new byte[] {49, (byte) '='};

    private static final int acctIDSourceHeaderLength = 4;
    private static final byte[] acctIDSourceHeader = new byte[] {54, 54, 48, (byte) '='};

    private static final int accountTypeHeaderLength = 4;
    private static final byte[] accountTypeHeader = new byte[] {53, 56, 49, (byte) '='};

    private static final int bidPxHeaderLength = 4;
    private static final byte[] bidPxHeader = new byte[] {49, 51, 50, (byte) '='};

    private static final int offerPxHeaderLength = 4;
    private static final byte[] offerPxHeader = new byte[] {49, 51, 51, (byte) '='};

    private static final int mktBidPxHeaderLength = 4;
    private static final byte[] mktBidPxHeader = new byte[] {54, 52, 53, (byte) '='};

    private static final int mktOfferPxHeaderLength = 4;
    private static final byte[] mktOfferPxHeader = new byte[] {54, 52, 54, (byte) '='};

    private static final int minBidSizeHeaderLength = 4;
    private static final byte[] minBidSizeHeader = new byte[] {54, 52, 55, (byte) '='};

    private static final int bidSizeHeaderLength = 4;
    private static final byte[] bidSizeHeader = new byte[] {49, 51, 52, (byte) '='};

    private static final int minOfferSizeHeaderLength = 4;
    private static final byte[] minOfferSizeHeader = new byte[] {54, 52, 56, (byte) '='};

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

    private static final int ordTypeHeaderLength = 3;
    private static final byte[] ordTypeHeader = new byte[] {52, 48, (byte) '='};

    private static final int bidForwardPoints2HeaderLength = 4;
    private static final byte[] bidForwardPoints2Header = new byte[] {54, 52, 50, (byte) '='};

    private static final int offerForwardPoints2HeaderLength = 4;
    private static final byte[] offerForwardPoints2Header = new byte[] {54, 52, 51, (byte) '='};

    private static final int settlCurrBidFxRateHeaderLength = 4;
    private static final byte[] settlCurrBidFxRateHeader = new byte[] {54, 53, 54, (byte) '='};

    private static final int settlCurrOfferFxRateHeaderLength = 4;
    private static final byte[] settlCurrOfferFxRateHeader = new byte[] {54, 53, 55, (byte) '='};

    private static final int settlCurrFxRateCalcHeaderLength = 4;
    private static final byte[] settlCurrFxRateCalcHeader = new byte[] {49, 53, 54, (byte) '='};

    private static final int commissionHeaderLength = 3;
    private static final byte[] commissionHeader = new byte[] {49, 50, (byte) '='};

    private static final int commTypeHeaderLength = 3;
    private static final byte[] commTypeHeader = new byte[] {49, 51, (byte) '='};

    private static final int custOrderCapacityHeaderLength = 4;
    private static final byte[] custOrderCapacityHeader = new byte[] {53, 56, 50, (byte) '='};

    private static final int exDestinationHeaderLength = 4;
    private static final byte[] exDestinationHeader = new byte[] {49, 48, 48, (byte) '='};

    private static final int exDestinationIDSourceHeaderLength = 5;
    private static final byte[] exDestinationIDSourceHeader = new byte[] {49, 49, 51, 51, (byte) '='};

    private static final int textHeaderLength = 3;
    private static final byte[] textHeader = new byte[] {53, 56, (byte) '='};

    private static final int encodedTextLenHeaderLength = 4;
    private static final byte[] encodedTextLenHeader = new byte[] {51, 53, 52, (byte) '='};

    private static final int encodedTextHeaderLength = 4;
    private static final byte[] encodedTextHeader = new byte[] {51, 53, 53, (byte) '='};

    private static final int priceHeaderLength = 3;
    private static final byte[] priceHeader = new byte[] {52, 52, (byte) '='};

    private static final int priceTypeHeaderLength = 4;
    private static final byte[] priceTypeHeader = new byte[] {52, 50, 51, (byte) '='};

    private final MutableDirectBuffer quoteRespID = new UnsafeBuffer();

    private int quoteRespIDOffset = 0;

    private int quoteRespIDLength = 0;

    public QuoteResponseEncoder quoteRespID(final DirectBuffer value, final int offset, final int length)
    {
        quoteRespID.wrap(value);
        quoteRespIDOffset = offset;
        quoteRespIDLength = length;
        return this;
    }

    public QuoteResponseEncoder quoteRespID(final DirectBuffer value, final int length)
    {
        return quoteRespID(value, 0, length);
    }

    public QuoteResponseEncoder quoteRespID(final DirectBuffer value)
    {
        return quoteRespID(value, 0, value.capacity());
    }

    public QuoteResponseEncoder quoteRespID(final byte[] value, final int offset, final int length)
    {
        quoteRespID.wrap(value);
        quoteRespIDOffset = offset;
        quoteRespIDLength = length;
        return this;
    }

    public QuoteResponseEncoder quoteRespIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(quoteRespID, value, offset, length);
        quoteRespIDOffset = offset;
        quoteRespIDLength = length;
        return this;
    }

    public QuoteResponseEncoder quoteRespID(final byte[] value, final int length)
    {
        return quoteRespID(value, 0, length);
    }

    public QuoteResponseEncoder quoteRespID(final byte[] value)
    {
        return quoteRespID(value, 0, value.length);
    }

    public boolean hasQuoteRespID()
    {
        return quoteRespIDLength > 0;
    }

    public MutableDirectBuffer quoteRespID()
    {
        return quoteRespID;
    }

    public String quoteRespIDAsString()
    {
        return quoteRespID.getStringWithoutLengthAscii(quoteRespIDOffset, quoteRespIDLength);
    }

    public QuoteResponseEncoder quoteRespID(final CharSequence value)
    {
        toBytes(value, quoteRespID);
        quoteRespIDOffset = 0;
        quoteRespIDLength = value.length();
        return this;
    }

    public QuoteResponseEncoder quoteRespID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            quoteRespID.wrap(buffer);
            quoteRespIDOffset = value.offset();
            quoteRespIDLength = value.length();
        }
        return this;
    }

    public QuoteResponseEncoder quoteRespID(final char[] value)
    {
        return quoteRespID(value, 0, value.length);
    }

    public QuoteResponseEncoder quoteRespID(final char[] value, final int length)
    {
        return quoteRespID(value, 0, length);
    }

    public QuoteResponseEncoder quoteRespID(final char[] value, final int offset, final int length)
    {
        toBytes(value, quoteRespID, offset, length);
        quoteRespIDOffset = 0;
        quoteRespIDLength = length;
        return this;
    }

    private final MutableDirectBuffer quoteID = new UnsafeBuffer();

    private int quoteIDOffset = 0;

    private int quoteIDLength = 0;

    public QuoteResponseEncoder quoteID(final DirectBuffer value, final int offset, final int length)
    {
        quoteID.wrap(value);
        quoteIDOffset = offset;
        quoteIDLength = length;
        return this;
    }

    public QuoteResponseEncoder quoteID(final DirectBuffer value, final int length)
    {
        return quoteID(value, 0, length);
    }

    public QuoteResponseEncoder quoteID(final DirectBuffer value)
    {
        return quoteID(value, 0, value.capacity());
    }

    public QuoteResponseEncoder quoteID(final byte[] value, final int offset, final int length)
    {
        quoteID.wrap(value);
        quoteIDOffset = offset;
        quoteIDLength = length;
        return this;
    }

    public QuoteResponseEncoder quoteIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(quoteID, value, offset, length);
        quoteIDOffset = offset;
        quoteIDLength = length;
        return this;
    }

    public QuoteResponseEncoder quoteID(final byte[] value, final int length)
    {
        return quoteID(value, 0, length);
    }

    public QuoteResponseEncoder quoteID(final byte[] value)
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

    public QuoteResponseEncoder quoteID(final CharSequence value)
    {
        toBytes(value, quoteID);
        quoteIDOffset = 0;
        quoteIDLength = value.length();
        return this;
    }

    public QuoteResponseEncoder quoteID(final AsciiSequenceView value)
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

    public QuoteResponseEncoder quoteID(final char[] value)
    {
        return quoteID(value, 0, value.length);
    }

    public QuoteResponseEncoder quoteID(final char[] value, final int length)
    {
        return quoteID(value, 0, length);
    }

    public QuoteResponseEncoder quoteID(final char[] value, final int offset, final int length)
    {
        toBytes(value, quoteID, offset, length);
        quoteIDOffset = 0;
        quoteIDLength = length;
        return this;
    }

    private final MutableDirectBuffer quoteMsgID = new UnsafeBuffer();

    private int quoteMsgIDOffset = 0;

    private int quoteMsgIDLength = 0;

    public QuoteResponseEncoder quoteMsgID(final DirectBuffer value, final int offset, final int length)
    {
        quoteMsgID.wrap(value);
        quoteMsgIDOffset = offset;
        quoteMsgIDLength = length;
        return this;
    }

    public QuoteResponseEncoder quoteMsgID(final DirectBuffer value, final int length)
    {
        return quoteMsgID(value, 0, length);
    }

    public QuoteResponseEncoder quoteMsgID(final DirectBuffer value)
    {
        return quoteMsgID(value, 0, value.capacity());
    }

    public QuoteResponseEncoder quoteMsgID(final byte[] value, final int offset, final int length)
    {
        quoteMsgID.wrap(value);
        quoteMsgIDOffset = offset;
        quoteMsgIDLength = length;
        return this;
    }

    public QuoteResponseEncoder quoteMsgIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(quoteMsgID, value, offset, length);
        quoteMsgIDOffset = offset;
        quoteMsgIDLength = length;
        return this;
    }

    public QuoteResponseEncoder quoteMsgID(final byte[] value, final int length)
    {
        return quoteMsgID(value, 0, length);
    }

    public QuoteResponseEncoder quoteMsgID(final byte[] value)
    {
        return quoteMsgID(value, 0, value.length);
    }

    public boolean hasQuoteMsgID()
    {
        return quoteMsgIDLength > 0;
    }

    public MutableDirectBuffer quoteMsgID()
    {
        return quoteMsgID;
    }

    public String quoteMsgIDAsString()
    {
        return quoteMsgID.getStringWithoutLengthAscii(quoteMsgIDOffset, quoteMsgIDLength);
    }

    public QuoteResponseEncoder quoteMsgID(final CharSequence value)
    {
        toBytes(value, quoteMsgID);
        quoteMsgIDOffset = 0;
        quoteMsgIDLength = value.length();
        return this;
    }

    public QuoteResponseEncoder quoteMsgID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            quoteMsgID.wrap(buffer);
            quoteMsgIDOffset = value.offset();
            quoteMsgIDLength = value.length();
        }
        return this;
    }

    public QuoteResponseEncoder quoteMsgID(final char[] value)
    {
        return quoteMsgID(value, 0, value.length);
    }

    public QuoteResponseEncoder quoteMsgID(final char[] value, final int length)
    {
        return quoteMsgID(value, 0, length);
    }

    public QuoteResponseEncoder quoteMsgID(final char[] value, final int offset, final int length)
    {
        toBytes(value, quoteMsgID, offset, length);
        quoteMsgIDOffset = 0;
        quoteMsgIDLength = length;
        return this;
    }

    private int quoteRespType;

    private boolean hasQuoteRespType;

    public boolean hasQuoteRespType()
    {
        return hasQuoteRespType;
    }

    public QuoteResponseEncoder quoteRespType(int value)
    {
        quoteRespType = value;
        hasQuoteRespType = true;
        return this;
    }

    public int quoteRespType()
    {
        return quoteRespType;
    }

    public QuoteResponseEncoder quoteRespType(QuoteRespType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == QuoteRespType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: quoteRespType Value: " + value );
            }
            if (value == QuoteRespType.NULL_VAL)
            {
                return this;
            }
        }
        return quoteRespType(value.representation());
    }

    private final MutableDirectBuffer clOrdID = new UnsafeBuffer();

    private int clOrdIDOffset = 0;

    private int clOrdIDLength = 0;

    public QuoteResponseEncoder clOrdID(final DirectBuffer value, final int offset, final int length)
    {
        clOrdID.wrap(value);
        clOrdIDOffset = offset;
        clOrdIDLength = length;
        return this;
    }

    public QuoteResponseEncoder clOrdID(final DirectBuffer value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    public QuoteResponseEncoder clOrdID(final DirectBuffer value)
    {
        return clOrdID(value, 0, value.capacity());
    }

    public QuoteResponseEncoder clOrdID(final byte[] value, final int offset, final int length)
    {
        clOrdID.wrap(value);
        clOrdIDOffset = offset;
        clOrdIDLength = length;
        return this;
    }

    public QuoteResponseEncoder clOrdIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(clOrdID, value, offset, length);
        clOrdIDOffset = offset;
        clOrdIDLength = length;
        return this;
    }

    public QuoteResponseEncoder clOrdID(final byte[] value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    public QuoteResponseEncoder clOrdID(final byte[] value)
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

    public QuoteResponseEncoder clOrdID(final CharSequence value)
    {
        toBytes(value, clOrdID);
        clOrdIDOffset = 0;
        clOrdIDLength = value.length();
        return this;
    }

    public QuoteResponseEncoder clOrdID(final AsciiSequenceView value)
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

    public QuoteResponseEncoder clOrdID(final char[] value)
    {
        return clOrdID(value, 0, value.length);
    }

    public QuoteResponseEncoder clOrdID(final char[] value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    public QuoteResponseEncoder clOrdID(final char[] value, final int offset, final int length)
    {
        toBytes(value, clOrdID, offset, length);
        clOrdIDOffset = 0;
        clOrdIDLength = length;
        return this;
    }

    private char orderCapacity;

    private boolean hasOrderCapacity;

    public boolean hasOrderCapacity()
    {
        return hasOrderCapacity;
    }

    public QuoteResponseEncoder orderCapacity(char value)
    {
        orderCapacity = value;
        hasOrderCapacity = true;
        return this;
    }

    public char orderCapacity()
    {
        return orderCapacity;
    }

    public QuoteResponseEncoder orderCapacity(OrderCapacity value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == OrderCapacity.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: orderCapacity Value: " + value );
            }
            if (value == OrderCapacity.NULL_VAL)
            {
                return this;
            }
        }
        return orderCapacity(value.representation());
    }

    private final MutableDirectBuffer orderRestrictions = new UnsafeBuffer();

    private int orderRestrictionsOffset = 0;

    private int orderRestrictionsLength = 0;

    public QuoteResponseEncoder orderRestrictions(final DirectBuffer value, final int offset, final int length)
    {
        orderRestrictions.wrap(value);
        orderRestrictionsOffset = offset;
        orderRestrictionsLength = length;
        return this;
    }

    public QuoteResponseEncoder orderRestrictions(final DirectBuffer value, final int length)
    {
        return orderRestrictions(value, 0, length);
    }

    public QuoteResponseEncoder orderRestrictions(final DirectBuffer value)
    {
        return orderRestrictions(value, 0, value.capacity());
    }

    public QuoteResponseEncoder orderRestrictions(final byte[] value, final int offset, final int length)
    {
        orderRestrictions.wrap(value);
        orderRestrictionsOffset = offset;
        orderRestrictionsLength = length;
        return this;
    }

    public QuoteResponseEncoder orderRestrictionsAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(orderRestrictions, value, offset, length);
        orderRestrictionsOffset = offset;
        orderRestrictionsLength = length;
        return this;
    }

    public QuoteResponseEncoder orderRestrictions(final byte[] value, final int length)
    {
        return orderRestrictions(value, 0, length);
    }

    public QuoteResponseEncoder orderRestrictions(final byte[] value)
    {
        return orderRestrictions(value, 0, value.length);
    }

    public boolean hasOrderRestrictions()
    {
        return orderRestrictionsLength > 0;
    }

    public MutableDirectBuffer orderRestrictions()
    {
        return orderRestrictions;
    }

    public String orderRestrictionsAsString()
    {
        return orderRestrictions.getStringWithoutLengthAscii(orderRestrictionsOffset, orderRestrictionsLength);
    }

    public QuoteResponseEncoder orderRestrictions(final CharSequence value)
    {
        toBytes(value, orderRestrictions);
        orderRestrictionsOffset = 0;
        orderRestrictionsLength = value.length();
        return this;
    }

    public QuoteResponseEncoder orderRestrictions(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            orderRestrictions.wrap(buffer);
            orderRestrictionsOffset = value.offset();
            orderRestrictionsLength = value.length();
        }
        return this;
    }

    public QuoteResponseEncoder orderRestrictions(final char[] value)
    {
        return orderRestrictions(value, 0, value.length);
    }

    public QuoteResponseEncoder orderRestrictions(final char[] value, final int length)
    {
        return orderRestrictions(value, 0, length);
    }

    public QuoteResponseEncoder orderRestrictions(final char[] value, final int offset, final int length)
    {
        toBytes(value, orderRestrictions, offset, length);
        orderRestrictionsOffset = 0;
        orderRestrictionsLength = length;
        return this;
    }

    private final MutableDirectBuffer iOIID = new UnsafeBuffer();

    private int iOIIDOffset = 0;

    private int iOIIDLength = 0;

    public QuoteResponseEncoder iOIID(final DirectBuffer value, final int offset, final int length)
    {
        iOIID.wrap(value);
        iOIIDOffset = offset;
        iOIIDLength = length;
        return this;
    }

    public QuoteResponseEncoder iOIID(final DirectBuffer value, final int length)
    {
        return iOIID(value, 0, length);
    }

    public QuoteResponseEncoder iOIID(final DirectBuffer value)
    {
        return iOIID(value, 0, value.capacity());
    }

    public QuoteResponseEncoder iOIID(final byte[] value, final int offset, final int length)
    {
        iOIID.wrap(value);
        iOIIDOffset = offset;
        iOIIDLength = length;
        return this;
    }

    public QuoteResponseEncoder iOIIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(iOIID, value, offset, length);
        iOIIDOffset = offset;
        iOIIDLength = length;
        return this;
    }

    public QuoteResponseEncoder iOIID(final byte[] value, final int length)
    {
        return iOIID(value, 0, length);
    }

    public QuoteResponseEncoder iOIID(final byte[] value)
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

    public QuoteResponseEncoder iOIID(final CharSequence value)
    {
        toBytes(value, iOIID);
        iOIIDOffset = 0;
        iOIIDLength = value.length();
        return this;
    }

    public QuoteResponseEncoder iOIID(final AsciiSequenceView value)
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

    public QuoteResponseEncoder iOIID(final char[] value)
    {
        return iOIID(value, 0, value.length);
    }

    public QuoteResponseEncoder iOIID(final char[] value, final int length)
    {
        return iOIID(value, 0, length);
    }

    public QuoteResponseEncoder iOIID(final char[] value, final int offset, final int length)
    {
        toBytes(value, iOIID, offset, length);
        iOIIDOffset = 0;
        iOIIDLength = length;
        return this;
    }

    private int quoteType;

    private boolean hasQuoteType;

    public boolean hasQuoteType()
    {
        return hasQuoteType;
    }

    public QuoteResponseEncoder quoteType(int value)
    {
        quoteType = value;
        hasQuoteType = true;
        return this;
    }

    public int quoteType()
    {
        return quoteType;
    }

    public QuoteResponseEncoder quoteType(QuoteType value)
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

    private boolean preTradeAnonymity;

    private boolean hasPreTradeAnonymity;

    public boolean hasPreTradeAnonymity()
    {
        return hasPreTradeAnonymity;
    }

    public QuoteResponseEncoder preTradeAnonymity(boolean value)
    {
        preTradeAnonymity = value;
        hasPreTradeAnonymity = true;
        return this;
    }

    public boolean preTradeAnonymity()
    {
        return preTradeAnonymity;
    }

    private final QuotQualGrpEncoder quotQualGrp = new QuotQualGrpEncoder();
    public QuotQualGrpEncoder quotQualGrp()
    {
        return quotQualGrp;
    }

    private final PartiesEncoder parties = new PartiesEncoder();
    public PartiesEncoder parties()
    {
        return parties;
    }

    private final MutableDirectBuffer tradingSessionID = new UnsafeBuffer();

    private int tradingSessionIDOffset = 0;

    private int tradingSessionIDLength = 0;

    public QuoteResponseEncoder tradingSessionID(final DirectBuffer value, final int offset, final int length)
    {
        tradingSessionID.wrap(value);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public QuoteResponseEncoder tradingSessionID(final DirectBuffer value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public QuoteResponseEncoder tradingSessionID(final DirectBuffer value)
    {
        return tradingSessionID(value, 0, value.capacity());
    }

    public QuoteResponseEncoder tradingSessionID(final byte[] value, final int offset, final int length)
    {
        tradingSessionID.wrap(value);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public QuoteResponseEncoder tradingSessionIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradingSessionID, value, offset, length);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public QuoteResponseEncoder tradingSessionID(final byte[] value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public QuoteResponseEncoder tradingSessionID(final byte[] value)
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

    public QuoteResponseEncoder tradingSessionID(final CharSequence value)
    {
        toBytes(value, tradingSessionID);
        tradingSessionIDOffset = 0;
        tradingSessionIDLength = value.length();
        return this;
    }

    public QuoteResponseEncoder tradingSessionID(final AsciiSequenceView value)
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

    public QuoteResponseEncoder tradingSessionID(final char[] value)
    {
        return tradingSessionID(value, 0, value.length);
    }

    public QuoteResponseEncoder tradingSessionID(final char[] value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public QuoteResponseEncoder tradingSessionID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradingSessionID, offset, length);
        tradingSessionIDOffset = 0;
        tradingSessionIDLength = length;
        return this;
    }

    public QuoteResponseEncoder tradingSessionID(TradingSessionID value)
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

    public QuoteResponseEncoder tradingSessionSubID(final DirectBuffer value, final int offset, final int length)
    {
        tradingSessionSubID.wrap(value);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public QuoteResponseEncoder tradingSessionSubID(final DirectBuffer value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public QuoteResponseEncoder tradingSessionSubID(final DirectBuffer value)
    {
        return tradingSessionSubID(value, 0, value.capacity());
    }

    public QuoteResponseEncoder tradingSessionSubID(final byte[] value, final int offset, final int length)
    {
        tradingSessionSubID.wrap(value);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public QuoteResponseEncoder tradingSessionSubIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradingSessionSubID, value, offset, length);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public QuoteResponseEncoder tradingSessionSubID(final byte[] value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public QuoteResponseEncoder tradingSessionSubID(final byte[] value)
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

    public QuoteResponseEncoder tradingSessionSubID(final CharSequence value)
    {
        toBytes(value, tradingSessionSubID);
        tradingSessionSubIDOffset = 0;
        tradingSessionSubIDLength = value.length();
        return this;
    }

    public QuoteResponseEncoder tradingSessionSubID(final AsciiSequenceView value)
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

    public QuoteResponseEncoder tradingSessionSubID(final char[] value)
    {
        return tradingSessionSubID(value, 0, value.length);
    }

    public QuoteResponseEncoder tradingSessionSubID(final char[] value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public QuoteResponseEncoder tradingSessionSubID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradingSessionSubID, offset, length);
        tradingSessionSubIDOffset = 0;
        tradingSessionSubIDLength = length;
        return this;
    }

    public QuoteResponseEncoder tradingSessionSubID(TradingSessionSubID value)
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

    public QuoteResponseEncoder side(char value)
    {
        side = value;
        hasSide = true;
        return this;
    }

    public char side()
    {
        return side;
    }

    public QuoteResponseEncoder side(Side value)
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

    private final OrderQtyDataEncoder orderQtyData = new OrderQtyDataEncoder();
    public OrderQtyDataEncoder orderQtyData()
    {
        return orderQtyData;
    }

    private final DecimalFloat minQty = new DecimalFloat();

    private boolean hasMinQty;

    public boolean hasMinQty()
    {
        return hasMinQty;
    }

    public QuoteResponseEncoder minQty(DecimalFloat value)
    {
        minQty.set(value);
        hasMinQty = true;
        return this;
    }

    public QuoteResponseEncoder minQty(long value, int scale)
    {
        minQty.set(value, scale);
        hasMinQty = true;
        return this;
    }

    public DecimalFloat minQty()
    {
        return minQty;
    }

    private final MutableDirectBuffer settlType = new UnsafeBuffer();

    private int settlTypeOffset = 0;

    private int settlTypeLength = 0;

    public QuoteResponseEncoder settlType(final DirectBuffer value, final int offset, final int length)
    {
        settlType.wrap(value);
        settlTypeOffset = offset;
        settlTypeLength = length;
        return this;
    }

    public QuoteResponseEncoder settlType(final DirectBuffer value, final int length)
    {
        return settlType(value, 0, length);
    }

    public QuoteResponseEncoder settlType(final DirectBuffer value)
    {
        return settlType(value, 0, value.capacity());
    }

    public QuoteResponseEncoder settlType(final byte[] value, final int offset, final int length)
    {
        settlType.wrap(value);
        settlTypeOffset = offset;
        settlTypeLength = length;
        return this;
    }

    public QuoteResponseEncoder settlTypeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlType, value, offset, length);
        settlTypeOffset = offset;
        settlTypeLength = length;
        return this;
    }

    public QuoteResponseEncoder settlType(final byte[] value, final int length)
    {
        return settlType(value, 0, length);
    }

    public QuoteResponseEncoder settlType(final byte[] value)
    {
        return settlType(value, 0, value.length);
    }

    public boolean hasSettlType()
    {
        return settlTypeLength > 0;
    }

    public MutableDirectBuffer settlType()
    {
        return settlType;
    }

    public String settlTypeAsString()
    {
        return settlType.getStringWithoutLengthAscii(settlTypeOffset, settlTypeLength);
    }

    public QuoteResponseEncoder settlType(final CharSequence value)
    {
        toBytes(value, settlType);
        settlTypeOffset = 0;
        settlTypeLength = value.length();
        return this;
    }

    public QuoteResponseEncoder settlType(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            settlType.wrap(buffer);
            settlTypeOffset = value.offset();
            settlTypeLength = value.length();
        }
        return this;
    }

    public QuoteResponseEncoder settlType(final char[] value)
    {
        return settlType(value, 0, value.length);
    }

    public QuoteResponseEncoder settlType(final char[] value, final int length)
    {
        return settlType(value, 0, length);
    }

    public QuoteResponseEncoder settlType(final char[] value, final int offset, final int length)
    {
        toBytes(value, settlType, offset, length);
        settlTypeOffset = 0;
        settlTypeLength = length;
        return this;
    }

    public QuoteResponseEncoder settlType(SettlType value)
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

    public QuoteResponseEncoder settlDate(final DirectBuffer value, final int offset, final int length)
    {
        settlDate.wrap(value);
        settlDateOffset = offset;
        settlDateLength = length;
        return this;
    }

    public QuoteResponseEncoder settlDate(final DirectBuffer value, final int length)
    {
        return settlDate(value, 0, length);
    }

    public QuoteResponseEncoder settlDate(final DirectBuffer value)
    {
        return settlDate(value, 0, value.capacity());
    }

    public QuoteResponseEncoder settlDate(final byte[] value, final int offset, final int length)
    {
        settlDate.wrap(value);
        settlDateOffset = offset;
        settlDateLength = length;
        return this;
    }

    public QuoteResponseEncoder settlDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlDate, value, offset, length);
        settlDateOffset = offset;
        settlDateLength = length;
        return this;
    }

    public QuoteResponseEncoder settlDate(final byte[] value, final int length)
    {
        return settlDate(value, 0, length);
    }

    public QuoteResponseEncoder settlDate(final byte[] value)
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

    private final MutableDirectBuffer settlDate2 = new UnsafeBuffer();

    private int settlDate2Offset = 0;

    private int settlDate2Length = 0;

    public QuoteResponseEncoder settlDate2(final DirectBuffer value, final int offset, final int length)
    {
        settlDate2.wrap(value);
        settlDate2Offset = offset;
        settlDate2Length = length;
        return this;
    }

    public QuoteResponseEncoder settlDate2(final DirectBuffer value, final int length)
    {
        return settlDate2(value, 0, length);
    }

    public QuoteResponseEncoder settlDate2(final DirectBuffer value)
    {
        return settlDate2(value, 0, value.capacity());
    }

    public QuoteResponseEncoder settlDate2(final byte[] value, final int offset, final int length)
    {
        settlDate2.wrap(value);
        settlDate2Offset = offset;
        settlDate2Length = length;
        return this;
    }

    public QuoteResponseEncoder settlDate2AsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlDate2, value, offset, length);
        settlDate2Offset = offset;
        settlDate2Length = length;
        return this;
    }

    public QuoteResponseEncoder settlDate2(final byte[] value, final int length)
    {
        return settlDate2(value, 0, length);
    }

    public QuoteResponseEncoder settlDate2(final byte[] value)
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

    public QuoteResponseEncoder orderQty2(DecimalFloat value)
    {
        orderQty2.set(value);
        hasOrderQty2 = true;
        return this;
    }

    public QuoteResponseEncoder orderQty2(long value, int scale)
    {
        orderQty2.set(value, scale);
        hasOrderQty2 = true;
        return this;
    }

    public DecimalFloat orderQty2()
    {
        return orderQty2;
    }

    private final MutableDirectBuffer currency = new UnsafeBuffer();

    private int currencyOffset = 0;

    private int currencyLength = 0;

    public QuoteResponseEncoder currency(final DirectBuffer value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public QuoteResponseEncoder currency(final DirectBuffer value, final int length)
    {
        return currency(value, 0, length);
    }

    public QuoteResponseEncoder currency(final DirectBuffer value)
    {
        return currency(value, 0, value.capacity());
    }

    public QuoteResponseEncoder currency(final byte[] value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public QuoteResponseEncoder currencyAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(currency, value, offset, length);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public QuoteResponseEncoder currency(final byte[] value, final int length)
    {
        return currency(value, 0, length);
    }

    public QuoteResponseEncoder currency(final byte[] value)
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

    public QuoteResponseEncoder currency(final CharSequence value)
    {
        toBytes(value, currency);
        currencyOffset = 0;
        currencyLength = value.length();
        return this;
    }

    public QuoteResponseEncoder currency(final AsciiSequenceView value)
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

    public QuoteResponseEncoder currency(final char[] value)
    {
        return currency(value, 0, value.length);
    }

    public QuoteResponseEncoder currency(final char[] value, final int length)
    {
        return currency(value, 0, length);
    }

    public QuoteResponseEncoder currency(final char[] value, final int offset, final int length)
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

    private final MutableDirectBuffer account = new UnsafeBuffer();

    private int accountOffset = 0;

    private int accountLength = 0;

    public QuoteResponseEncoder account(final DirectBuffer value, final int offset, final int length)
    {
        account.wrap(value);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    public QuoteResponseEncoder account(final DirectBuffer value, final int length)
    {
        return account(value, 0, length);
    }

    public QuoteResponseEncoder account(final DirectBuffer value)
    {
        return account(value, 0, value.capacity());
    }

    public QuoteResponseEncoder account(final byte[] value, final int offset, final int length)
    {
        account.wrap(value);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    public QuoteResponseEncoder accountAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(account, value, offset, length);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    public QuoteResponseEncoder account(final byte[] value, final int length)
    {
        return account(value, 0, length);
    }

    public QuoteResponseEncoder account(final byte[] value)
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

    public QuoteResponseEncoder account(final CharSequence value)
    {
        toBytes(value, account);
        accountOffset = 0;
        accountLength = value.length();
        return this;
    }

    public QuoteResponseEncoder account(final AsciiSequenceView value)
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

    public QuoteResponseEncoder account(final char[] value)
    {
        return account(value, 0, value.length);
    }

    public QuoteResponseEncoder account(final char[] value, final int length)
    {
        return account(value, 0, length);
    }

    public QuoteResponseEncoder account(final char[] value, final int offset, final int length)
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

    public QuoteResponseEncoder acctIDSource(int value)
    {
        acctIDSource = value;
        hasAcctIDSource = true;
        return this;
    }

    public int acctIDSource()
    {
        return acctIDSource;
    }

    public QuoteResponseEncoder acctIDSource(AcctIDSource value)
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

    public QuoteResponseEncoder accountType(int value)
    {
        accountType = value;
        hasAccountType = true;
        return this;
    }

    public int accountType()
    {
        return accountType;
    }

    public QuoteResponseEncoder accountType(AccountType value)
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

    private final LegQuotGrpEncoder legQuotGrp = new LegQuotGrpEncoder();
    public LegQuotGrpEncoder legQuotGrp()
    {
        return legQuotGrp;
    }

    private final DecimalFloat bidPx = new DecimalFloat();

    private boolean hasBidPx;

    public boolean hasBidPx()
    {
        return hasBidPx;
    }

    public QuoteResponseEncoder bidPx(DecimalFloat value)
    {
        bidPx.set(value);
        hasBidPx = true;
        return this;
    }

    public QuoteResponseEncoder bidPx(long value, int scale)
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

    public QuoteResponseEncoder offerPx(DecimalFloat value)
    {
        offerPx.set(value);
        hasOfferPx = true;
        return this;
    }

    public QuoteResponseEncoder offerPx(long value, int scale)
    {
        offerPx.set(value, scale);
        hasOfferPx = true;
        return this;
    }

    public DecimalFloat offerPx()
    {
        return offerPx;
    }

    private final DecimalFloat mktBidPx = new DecimalFloat();

    private boolean hasMktBidPx;

    public boolean hasMktBidPx()
    {
        return hasMktBidPx;
    }

    public QuoteResponseEncoder mktBidPx(DecimalFloat value)
    {
        mktBidPx.set(value);
        hasMktBidPx = true;
        return this;
    }

    public QuoteResponseEncoder mktBidPx(long value, int scale)
    {
        mktBidPx.set(value, scale);
        hasMktBidPx = true;
        return this;
    }

    public DecimalFloat mktBidPx()
    {
        return mktBidPx;
    }

    private final DecimalFloat mktOfferPx = new DecimalFloat();

    private boolean hasMktOfferPx;

    public boolean hasMktOfferPx()
    {
        return hasMktOfferPx;
    }

    public QuoteResponseEncoder mktOfferPx(DecimalFloat value)
    {
        mktOfferPx.set(value);
        hasMktOfferPx = true;
        return this;
    }

    public QuoteResponseEncoder mktOfferPx(long value, int scale)
    {
        mktOfferPx.set(value, scale);
        hasMktOfferPx = true;
        return this;
    }

    public DecimalFloat mktOfferPx()
    {
        return mktOfferPx;
    }

    private final DecimalFloat minBidSize = new DecimalFloat();

    private boolean hasMinBidSize;

    public boolean hasMinBidSize()
    {
        return hasMinBidSize;
    }

    public QuoteResponseEncoder minBidSize(DecimalFloat value)
    {
        minBidSize.set(value);
        hasMinBidSize = true;
        return this;
    }

    public QuoteResponseEncoder minBidSize(long value, int scale)
    {
        minBidSize.set(value, scale);
        hasMinBidSize = true;
        return this;
    }

    public DecimalFloat minBidSize()
    {
        return minBidSize;
    }

    private final DecimalFloat bidSize = new DecimalFloat();

    private boolean hasBidSize;

    public boolean hasBidSize()
    {
        return hasBidSize;
    }

    public QuoteResponseEncoder bidSize(DecimalFloat value)
    {
        bidSize.set(value);
        hasBidSize = true;
        return this;
    }

    public QuoteResponseEncoder bidSize(long value, int scale)
    {
        bidSize.set(value, scale);
        hasBidSize = true;
        return this;
    }

    public DecimalFloat bidSize()
    {
        return bidSize;
    }

    private final DecimalFloat minOfferSize = new DecimalFloat();

    private boolean hasMinOfferSize;

    public boolean hasMinOfferSize()
    {
        return hasMinOfferSize;
    }

    public QuoteResponseEncoder minOfferSize(DecimalFloat value)
    {
        minOfferSize.set(value);
        hasMinOfferSize = true;
        return this;
    }

    public QuoteResponseEncoder minOfferSize(long value, int scale)
    {
        minOfferSize.set(value, scale);
        hasMinOfferSize = true;
        return this;
    }

    public DecimalFloat minOfferSize()
    {
        return minOfferSize;
    }

    private final DecimalFloat offerSize = new DecimalFloat();

    private boolean hasOfferSize;

    public boolean hasOfferSize()
    {
        return hasOfferSize;
    }

    public QuoteResponseEncoder offerSize(DecimalFloat value)
    {
        offerSize.set(value);
        hasOfferSize = true;
        return this;
    }

    public QuoteResponseEncoder offerSize(long value, int scale)
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

    public QuoteResponseEncoder validUntilTime(final DirectBuffer value, final int offset, final int length)
    {
        validUntilTime.wrap(value);
        validUntilTimeOffset = offset;
        validUntilTimeLength = length;
        return this;
    }

    public QuoteResponseEncoder validUntilTime(final DirectBuffer value, final int length)
    {
        return validUntilTime(value, 0, length);
    }

    public QuoteResponseEncoder validUntilTime(final DirectBuffer value)
    {
        return validUntilTime(value, 0, value.capacity());
    }

    public QuoteResponseEncoder validUntilTime(final byte[] value, final int offset, final int length)
    {
        validUntilTime.wrap(value);
        validUntilTimeOffset = offset;
        validUntilTimeLength = length;
        return this;
    }

    public QuoteResponseEncoder validUntilTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(validUntilTime, value, offset, length);
        validUntilTimeOffset = offset;
        validUntilTimeLength = length;
        return this;
    }

    public QuoteResponseEncoder validUntilTime(final byte[] value, final int length)
    {
        return validUntilTime(value, 0, length);
    }

    public QuoteResponseEncoder validUntilTime(final byte[] value)
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

    public QuoteResponseEncoder bidSpotRate(DecimalFloat value)
    {
        bidSpotRate.set(value);
        hasBidSpotRate = true;
        return this;
    }

    public QuoteResponseEncoder bidSpotRate(long value, int scale)
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

    public QuoteResponseEncoder offerSpotRate(DecimalFloat value)
    {
        offerSpotRate.set(value);
        hasOfferSpotRate = true;
        return this;
    }

    public QuoteResponseEncoder offerSpotRate(long value, int scale)
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

    public QuoteResponseEncoder bidForwardPoints(DecimalFloat value)
    {
        bidForwardPoints.set(value);
        hasBidForwardPoints = true;
        return this;
    }

    public QuoteResponseEncoder bidForwardPoints(long value, int scale)
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

    public QuoteResponseEncoder offerForwardPoints(DecimalFloat value)
    {
        offerForwardPoints.set(value);
        hasOfferForwardPoints = true;
        return this;
    }

    public QuoteResponseEncoder offerForwardPoints(long value, int scale)
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

    public QuoteResponseEncoder midPx(DecimalFloat value)
    {
        midPx.set(value);
        hasMidPx = true;
        return this;
    }

    public QuoteResponseEncoder midPx(long value, int scale)
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

    public QuoteResponseEncoder bidYield(DecimalFloat value)
    {
        bidYield.set(value);
        hasBidYield = true;
        return this;
    }

    public QuoteResponseEncoder bidYield(long value, int scale)
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

    public QuoteResponseEncoder midYield(DecimalFloat value)
    {
        midYield.set(value);
        hasMidYield = true;
        return this;
    }

    public QuoteResponseEncoder midYield(long value, int scale)
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

    public QuoteResponseEncoder offerYield(DecimalFloat value)
    {
        offerYield.set(value);
        hasOfferYield = true;
        return this;
    }

    public QuoteResponseEncoder offerYield(long value, int scale)
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

    public QuoteResponseEncoder transactTime(final DirectBuffer value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public QuoteResponseEncoder transactTime(final DirectBuffer value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public QuoteResponseEncoder transactTime(final DirectBuffer value)
    {
        return transactTime(value, 0, value.capacity());
    }

    public QuoteResponseEncoder transactTime(final byte[] value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public QuoteResponseEncoder transactTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(transactTime, value, offset, length);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public QuoteResponseEncoder transactTime(final byte[] value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public QuoteResponseEncoder transactTime(final byte[] value)
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

    private char ordType;

    private boolean hasOrdType;

    public boolean hasOrdType()
    {
        return hasOrdType;
    }

    public QuoteResponseEncoder ordType(char value)
    {
        ordType = value;
        hasOrdType = true;
        return this;
    }

    public char ordType()
    {
        return ordType;
    }

    public QuoteResponseEncoder ordType(OrdType value)
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

    private final DecimalFloat bidForwardPoints2 = new DecimalFloat();

    private boolean hasBidForwardPoints2;

    public boolean hasBidForwardPoints2()
    {
        return hasBidForwardPoints2;
    }

    public QuoteResponseEncoder bidForwardPoints2(DecimalFloat value)
    {
        bidForwardPoints2.set(value);
        hasBidForwardPoints2 = true;
        return this;
    }

    public QuoteResponseEncoder bidForwardPoints2(long value, int scale)
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

    public QuoteResponseEncoder offerForwardPoints2(DecimalFloat value)
    {
        offerForwardPoints2.set(value);
        hasOfferForwardPoints2 = true;
        return this;
    }

    public QuoteResponseEncoder offerForwardPoints2(long value, int scale)
    {
        offerForwardPoints2.set(value, scale);
        hasOfferForwardPoints2 = true;
        return this;
    }

    public DecimalFloat offerForwardPoints2()
    {
        return offerForwardPoints2;
    }

    private final DecimalFloat settlCurrBidFxRate = new DecimalFloat();

    private boolean hasSettlCurrBidFxRate;

    public boolean hasSettlCurrBidFxRate()
    {
        return hasSettlCurrBidFxRate;
    }

    public QuoteResponseEncoder settlCurrBidFxRate(DecimalFloat value)
    {
        settlCurrBidFxRate.set(value);
        hasSettlCurrBidFxRate = true;
        return this;
    }

    public QuoteResponseEncoder settlCurrBidFxRate(long value, int scale)
    {
        settlCurrBidFxRate.set(value, scale);
        hasSettlCurrBidFxRate = true;
        return this;
    }

    public DecimalFloat settlCurrBidFxRate()
    {
        return settlCurrBidFxRate;
    }

    private final DecimalFloat settlCurrOfferFxRate = new DecimalFloat();

    private boolean hasSettlCurrOfferFxRate;

    public boolean hasSettlCurrOfferFxRate()
    {
        return hasSettlCurrOfferFxRate;
    }

    public QuoteResponseEncoder settlCurrOfferFxRate(DecimalFloat value)
    {
        settlCurrOfferFxRate.set(value);
        hasSettlCurrOfferFxRate = true;
        return this;
    }

    public QuoteResponseEncoder settlCurrOfferFxRate(long value, int scale)
    {
        settlCurrOfferFxRate.set(value, scale);
        hasSettlCurrOfferFxRate = true;
        return this;
    }

    public DecimalFloat settlCurrOfferFxRate()
    {
        return settlCurrOfferFxRate;
    }

    private char settlCurrFxRateCalc;

    private boolean hasSettlCurrFxRateCalc;

    public boolean hasSettlCurrFxRateCalc()
    {
        return hasSettlCurrFxRateCalc;
    }

    public QuoteResponseEncoder settlCurrFxRateCalc(char value)
    {
        settlCurrFxRateCalc = value;
        hasSettlCurrFxRateCalc = true;
        return this;
    }

    public char settlCurrFxRateCalc()
    {
        return settlCurrFxRateCalc;
    }

    public QuoteResponseEncoder settlCurrFxRateCalc(SettlCurrFxRateCalc value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == SettlCurrFxRateCalc.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: settlCurrFxRateCalc Value: " + value );
            }
            if (value == SettlCurrFxRateCalc.NULL_VAL)
            {
                return this;
            }
        }
        return settlCurrFxRateCalc(value.representation());
    }

    private final DecimalFloat commission = new DecimalFloat();

    private boolean hasCommission;

    public boolean hasCommission()
    {
        return hasCommission;
    }

    public QuoteResponseEncoder commission(DecimalFloat value)
    {
        commission.set(value);
        hasCommission = true;
        return this;
    }

    public QuoteResponseEncoder commission(long value, int scale)
    {
        commission.set(value, scale);
        hasCommission = true;
        return this;
    }

    public DecimalFloat commission()
    {
        return commission;
    }

    private char commType;

    private boolean hasCommType;

    public boolean hasCommType()
    {
        return hasCommType;
    }

    public QuoteResponseEncoder commType(char value)
    {
        commType = value;
        hasCommType = true;
        return this;
    }

    public char commType()
    {
        return commType;
    }

    public QuoteResponseEncoder commType(CommType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == CommType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: commType Value: " + value );
            }
            if (value == CommType.NULL_VAL)
            {
                return this;
            }
        }
        return commType(value.representation());
    }

    private int custOrderCapacity;

    private boolean hasCustOrderCapacity;

    public boolean hasCustOrderCapacity()
    {
        return hasCustOrderCapacity;
    }

    public QuoteResponseEncoder custOrderCapacity(int value)
    {
        custOrderCapacity = value;
        hasCustOrderCapacity = true;
        return this;
    }

    public int custOrderCapacity()
    {
        return custOrderCapacity;
    }

    public QuoteResponseEncoder custOrderCapacity(CustOrderCapacity value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == CustOrderCapacity.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: custOrderCapacity Value: " + value );
            }
            if (value == CustOrderCapacity.NULL_VAL)
            {
                return this;
            }
        }
        return custOrderCapacity(value.representation());
    }

    private final MutableDirectBuffer exDestination = new UnsafeBuffer();

    private int exDestinationOffset = 0;

    private int exDestinationLength = 0;

    public QuoteResponseEncoder exDestination(final DirectBuffer value, final int offset, final int length)
    {
        exDestination.wrap(value);
        exDestinationOffset = offset;
        exDestinationLength = length;
        return this;
    }

    public QuoteResponseEncoder exDestination(final DirectBuffer value, final int length)
    {
        return exDestination(value, 0, length);
    }

    public QuoteResponseEncoder exDestination(final DirectBuffer value)
    {
        return exDestination(value, 0, value.capacity());
    }

    public QuoteResponseEncoder exDestination(final byte[] value, final int offset, final int length)
    {
        exDestination.wrap(value);
        exDestinationOffset = offset;
        exDestinationLength = length;
        return this;
    }

    public QuoteResponseEncoder exDestinationAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(exDestination, value, offset, length);
        exDestinationOffset = offset;
        exDestinationLength = length;
        return this;
    }

    public QuoteResponseEncoder exDestination(final byte[] value, final int length)
    {
        return exDestination(value, 0, length);
    }

    public QuoteResponseEncoder exDestination(final byte[] value)
    {
        return exDestination(value, 0, value.length);
    }

    public boolean hasExDestination()
    {
        return exDestinationLength > 0;
    }

    public MutableDirectBuffer exDestination()
    {
        return exDestination;
    }

    public String exDestinationAsString()
    {
        return exDestination.getStringWithoutLengthAscii(exDestinationOffset, exDestinationLength);
    }

    public QuoteResponseEncoder exDestination(final CharSequence value)
    {
        toBytes(value, exDestination);
        exDestinationOffset = 0;
        exDestinationLength = value.length();
        return this;
    }

    public QuoteResponseEncoder exDestination(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            exDestination.wrap(buffer);
            exDestinationOffset = value.offset();
            exDestinationLength = value.length();
        }
        return this;
    }

    public QuoteResponseEncoder exDestination(final char[] value)
    {
        return exDestination(value, 0, value.length);
    }

    public QuoteResponseEncoder exDestination(final char[] value, final int length)
    {
        return exDestination(value, 0, length);
    }

    public QuoteResponseEncoder exDestination(final char[] value, final int offset, final int length)
    {
        toBytes(value, exDestination, offset, length);
        exDestinationOffset = 0;
        exDestinationLength = length;
        return this;
    }

    private char exDestinationIDSource;

    private boolean hasExDestinationIDSource;

    public boolean hasExDestinationIDSource()
    {
        return hasExDestinationIDSource;
    }

    public QuoteResponseEncoder exDestinationIDSource(char value)
    {
        exDestinationIDSource = value;
        hasExDestinationIDSource = true;
        return this;
    }

    public char exDestinationIDSource()
    {
        return exDestinationIDSource;
    }

    public QuoteResponseEncoder exDestinationIDSource(ExDestinationIDSource value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == ExDestinationIDSource.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: exDestinationIDSource Value: " + value );
            }
            if (value == ExDestinationIDSource.NULL_VAL)
            {
                return this;
            }
        }
        return exDestinationIDSource(value.representation());
    }

    private final MutableDirectBuffer text = new UnsafeBuffer();

    private int textOffset = 0;

    private int textLength = 0;

    public QuoteResponseEncoder text(final DirectBuffer value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public QuoteResponseEncoder text(final DirectBuffer value, final int length)
    {
        return text(value, 0, length);
    }

    public QuoteResponseEncoder text(final DirectBuffer value)
    {
        return text(value, 0, value.capacity());
    }

    public QuoteResponseEncoder text(final byte[] value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public QuoteResponseEncoder textAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(text, value, offset, length);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public QuoteResponseEncoder text(final byte[] value, final int length)
    {
        return text(value, 0, length);
    }

    public QuoteResponseEncoder text(final byte[] value)
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

    public QuoteResponseEncoder text(final CharSequence value)
    {
        toBytes(value, text);
        textOffset = 0;
        textLength = value.length();
        return this;
    }

    public QuoteResponseEncoder text(final AsciiSequenceView value)
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

    public QuoteResponseEncoder text(final char[] value)
    {
        return text(value, 0, value.length);
    }

    public QuoteResponseEncoder text(final char[] value, final int length)
    {
        return text(value, 0, length);
    }

    public QuoteResponseEncoder text(final char[] value, final int offset, final int length)
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

    public QuoteResponseEncoder encodedTextLen(int value)
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

    public QuoteResponseEncoder encodedText(byte[] value)
    {
        encodedText = value;
        hasEncodedText = true;
        return this;
    }

    public byte[] encodedText()
    {
        return encodedText;
    }

    public QuoteResponseEncoder encodedTextAsCopy(final byte[] value, final int offset, final int length)
    {
        encodedText = copyInto(encodedText, value, offset, length);
        hasEncodedText = true;
        return this;
    }

    private final DecimalFloat price = new DecimalFloat();

    private boolean hasPrice;

    public boolean hasPrice()
    {
        return hasPrice;
    }

    public QuoteResponseEncoder price(DecimalFloat value)
    {
        price.set(value);
        hasPrice = true;
        return this;
    }

    public QuoteResponseEncoder price(long value, int scale)
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

    public QuoteResponseEncoder priceType(int value)
    {
        priceType = value;
        hasPriceType = true;
        return this;
    }

    public int priceType()
    {
        return priceType;
    }

    public QuoteResponseEncoder priceType(PriceType value)
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

        if (quoteRespIDLength > 0)
        {
            buffer.putBytes(position, quoteRespIDHeader, 0, quoteRespIDHeaderLength);
            position += quoteRespIDHeaderLength;
            buffer.putBytes(position, quoteRespID, quoteRespIDOffset, quoteRespIDLength);
            position += quoteRespIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: QuoteRespID");
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

        if (quoteMsgIDLength > 0)
        {
            buffer.putBytes(position, quoteMsgIDHeader, 0, quoteMsgIDHeaderLength);
            position += quoteMsgIDHeaderLength;
            buffer.putBytes(position, quoteMsgID, quoteMsgIDOffset, quoteMsgIDLength);
            position += quoteMsgIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasQuoteRespType)
        {
            buffer.putBytes(position, quoteRespTypeHeader, 0, quoteRespTypeHeaderLength);
            position += quoteRespTypeHeaderLength;
            position += buffer.putIntAscii(position, quoteRespType);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: QuoteRespType");
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

        if (hasOrderCapacity)
        {
            buffer.putBytes(position, orderCapacityHeader, 0, orderCapacityHeaderLength);
            position += orderCapacityHeaderLength;
            position += buffer.putCharAscii(position, orderCapacity);
            buffer.putSeparator(position);
            position++;
        }

        if (orderRestrictionsLength > 0)
        {
            buffer.putBytes(position, orderRestrictionsHeader, 0, orderRestrictionsHeaderLength);
            position += orderRestrictionsHeaderLength;
            buffer.putBytes(position, orderRestrictions, orderRestrictionsOffset, orderRestrictionsLength);
            position += orderRestrictionsLength;
            buffer.putSeparator(position);
            position++;
        }

        if (iOIIDLength > 0)
        {
            buffer.putBytes(position, iOIIDHeader, 0, iOIIDHeaderLength);
            position += iOIIDHeaderLength;
            buffer.putBytes(position, iOIID, iOIIDOffset, iOIIDLength);
            position += iOIIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasQuoteType)
        {
            buffer.putBytes(position, quoteTypeHeader, 0, quoteTypeHeaderLength);
            position += quoteTypeHeaderLength;
            position += buffer.putIntAscii(position, quoteType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasPreTradeAnonymity)
        {
            buffer.putBytes(position, preTradeAnonymityHeader, 0, preTradeAnonymityHeaderLength);
            position += preTradeAnonymityHeaderLength;
            position += buffer.putBooleanAscii(position, preTradeAnonymity);
            buffer.putSeparator(position);
            position++;
        }

            position += quotQualGrp.encode(buffer, position);

            position += parties.encode(buffer, position);

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

            position += instrument.encode(buffer, position);

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

            position += orderQtyData.encode(buffer, position);

        if (hasMinQty)
        {
            buffer.putBytes(position, minQtyHeader, 0, minQtyHeaderLength);
            position += minQtyHeaderLength;
            position += buffer.putFloatAscii(position, minQty);
            buffer.putSeparator(position);
            position++;
        }

        if (settlTypeLength > 0)
        {
            buffer.putBytes(position, settlTypeHeader, 0, settlTypeHeaderLength);
            position += settlTypeHeaderLength;
            buffer.putBytes(position, settlType, settlTypeOffset, settlTypeLength);
            position += settlTypeLength;
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

            position += legQuotGrp.encode(buffer, position);

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

        if (hasMktBidPx)
        {
            buffer.putBytes(position, mktBidPxHeader, 0, mktBidPxHeaderLength);
            position += mktBidPxHeaderLength;
            position += buffer.putFloatAscii(position, mktBidPx);
            buffer.putSeparator(position);
            position++;
        }

        if (hasMktOfferPx)
        {
            buffer.putBytes(position, mktOfferPxHeader, 0, mktOfferPxHeaderLength);
            position += mktOfferPxHeaderLength;
            position += buffer.putFloatAscii(position, mktOfferPx);
            buffer.putSeparator(position);
            position++;
        }

        if (hasMinBidSize)
        {
            buffer.putBytes(position, minBidSizeHeader, 0, minBidSizeHeaderLength);
            position += minBidSizeHeaderLength;
            position += buffer.putFloatAscii(position, minBidSize);
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

        if (hasMinOfferSize)
        {
            buffer.putBytes(position, minOfferSizeHeader, 0, minOfferSizeHeaderLength);
            position += minOfferSizeHeaderLength;
            position += buffer.putFloatAscii(position, minOfferSize);
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

        if (hasOrdType)
        {
            buffer.putBytes(position, ordTypeHeader, 0, ordTypeHeaderLength);
            position += ordTypeHeaderLength;
            position += buffer.putCharAscii(position, ordType);
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

        if (hasSettlCurrBidFxRate)
        {
            buffer.putBytes(position, settlCurrBidFxRateHeader, 0, settlCurrBidFxRateHeaderLength);
            position += settlCurrBidFxRateHeaderLength;
            position += buffer.putFloatAscii(position, settlCurrBidFxRate);
            buffer.putSeparator(position);
            position++;
        }

        if (hasSettlCurrOfferFxRate)
        {
            buffer.putBytes(position, settlCurrOfferFxRateHeader, 0, settlCurrOfferFxRateHeaderLength);
            position += settlCurrOfferFxRateHeaderLength;
            position += buffer.putFloatAscii(position, settlCurrOfferFxRate);
            buffer.putSeparator(position);
            position++;
        }

        if (hasSettlCurrFxRateCalc)
        {
            buffer.putBytes(position, settlCurrFxRateCalcHeader, 0, settlCurrFxRateCalcHeaderLength);
            position += settlCurrFxRateCalcHeaderLength;
            position += buffer.putCharAscii(position, settlCurrFxRateCalc);
            buffer.putSeparator(position);
            position++;
        }

        if (hasCommission)
        {
            buffer.putBytes(position, commissionHeader, 0, commissionHeaderLength);
            position += commissionHeaderLength;
            position += buffer.putFloatAscii(position, commission);
            buffer.putSeparator(position);
            position++;
        }

        if (hasCommType)
        {
            buffer.putBytes(position, commTypeHeader, 0, commTypeHeaderLength);
            position += commTypeHeaderLength;
            position += buffer.putCharAscii(position, commType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasCustOrderCapacity)
        {
            buffer.putBytes(position, custOrderCapacityHeader, 0, custOrderCapacityHeaderLength);
            position += custOrderCapacityHeaderLength;
            position += buffer.putIntAscii(position, custOrderCapacity);
            buffer.putSeparator(position);
            position++;
        }

        if (exDestinationLength > 0)
        {
            buffer.putBytes(position, exDestinationHeader, 0, exDestinationHeaderLength);
            position += exDestinationHeaderLength;
            buffer.putBytes(position, exDestination, exDestinationOffset, exDestinationLength);
            position += exDestinationLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasExDestinationIDSource)
        {
            buffer.putBytes(position, exDestinationIDSourceHeader, 0, exDestinationIDSourceHeaderLength);
            position += exDestinationIDSourceHeaderLength;
            position += buffer.putCharAscii(position, exDestinationIDSource);
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
        this.resetQuoteRespID();
        this.resetQuoteID();
        this.resetQuoteMsgID();
        this.resetQuoteRespType();
        this.resetClOrdID();
        this.resetOrderCapacity();
        this.resetOrderRestrictions();
        this.resetIOIID();
        this.resetQuoteType();
        this.resetPreTradeAnonymity();
        this.resetTradingSessionID();
        this.resetTradingSessionSubID();
        this.resetSide();
        this.resetMinQty();
        this.resetSettlType();
        this.resetSettlDate();
        this.resetSettlDate2();
        this.resetOrderQty2();
        this.resetCurrency();
        this.resetAccount();
        this.resetAcctIDSource();
        this.resetAccountType();
        this.resetBidPx();
        this.resetOfferPx();
        this.resetMktBidPx();
        this.resetMktOfferPx();
        this.resetMinBidSize();
        this.resetBidSize();
        this.resetMinOfferSize();
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
        this.resetOrdType();
        this.resetBidForwardPoints2();
        this.resetOfferForwardPoints2();
        this.resetSettlCurrBidFxRate();
        this.resetSettlCurrOfferFxRate();
        this.resetSettlCurrFxRateCalc();
        this.resetCommission();
        this.resetCommType();
        this.resetCustOrderCapacity();
        this.resetExDestination();
        this.resetExDestinationIDSource();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        this.resetPrice();
        this.resetPriceType();
        quotQualGrp.reset();
        parties.reset();
        instrument.reset();
        financingDetails.reset();
        undInstrmtGrp.reset();
        orderQtyData.reset();
        stipulations.reset();
        legQuotGrp.reset();
        spreadOrBenchmarkCurveData.reset();
        yieldData.reset();
    }

    public void resetQuoteRespID()
    {
        quoteRespIDLength = 0;
    }

    public void resetQuoteID()
    {
        quoteIDLength = 0;
    }

    public void resetQuoteMsgID()
    {
        quoteMsgIDLength = 0;
    }

    public void resetQuoteRespType()
    {
        hasQuoteRespType = false;
    }

    public void resetClOrdID()
    {
        clOrdIDLength = 0;
    }

    public void resetOrderCapacity()
    {
        hasOrderCapacity = false;
    }

    public void resetOrderRestrictions()
    {
        orderRestrictionsLength = 0;
    }

    public void resetIOIID()
    {
        iOIIDLength = 0;
    }

    public void resetQuoteType()
    {
        hasQuoteType = false;
    }

    public void resetPreTradeAnonymity()
    {
        hasPreTradeAnonymity = false;
    }

    public void resetTradingSessionID()
    {
        tradingSessionIDLength = 0;
    }

    public void resetTradingSessionSubID()
    {
        tradingSessionSubIDLength = 0;
    }

    public void resetSide()
    {
        hasSide = false;
    }

    public void resetMinQty()
    {
        hasMinQty = false;
    }

    public void resetSettlType()
    {
        settlTypeLength = 0;
    }

    public void resetSettlDate()
    {
        settlDateLength = 0;
    }

    public void resetSettlDate2()
    {
        settlDate2Length = 0;
    }

    public void resetOrderQty2()
    {
        hasOrderQty2 = false;
    }

    public void resetCurrency()
    {
        currencyLength = 0;
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

    public void resetBidPx()
    {
        hasBidPx = false;
    }

    public void resetOfferPx()
    {
        hasOfferPx = false;
    }

    public void resetMktBidPx()
    {
        hasMktBidPx = false;
    }

    public void resetMktOfferPx()
    {
        hasMktOfferPx = false;
    }

    public void resetMinBidSize()
    {
        hasMinBidSize = false;
    }

    public void resetBidSize()
    {
        hasBidSize = false;
    }

    public void resetMinOfferSize()
    {
        hasMinOfferSize = false;
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

    public void resetOrdType()
    {
        hasOrdType = false;
    }

    public void resetBidForwardPoints2()
    {
        hasBidForwardPoints2 = false;
    }

    public void resetOfferForwardPoints2()
    {
        hasOfferForwardPoints2 = false;
    }

    public void resetSettlCurrBidFxRate()
    {
        hasSettlCurrBidFxRate = false;
    }

    public void resetSettlCurrOfferFxRate()
    {
        hasSettlCurrOfferFxRate = false;
    }

    public void resetSettlCurrFxRateCalc()
    {
        hasSettlCurrFxRateCalc = false;
    }

    public void resetCommission()
    {
        hasCommission = false;
    }

    public void resetCommType()
    {
        hasCommType = false;
    }

    public void resetCustOrderCapacity()
    {
        hasCustOrderCapacity = false;
    }

    public void resetExDestination()
    {
        exDestinationLength = 0;
    }

    public void resetExDestinationIDSource()
    {
        hasExDestinationIDSource = false;
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

    public void resetPrice()
    {
        hasPrice = false;
    }

    public void resetPriceType()
    {
        hasPriceType = false;
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
        builder.append("\"MessageName\": \"QuoteResponse\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasQuoteRespID())
        {
            indent(builder, level);
            builder.append("\"QuoteRespID\": \"");
            appendBuffer(builder, quoteRespID, quoteRespIDOffset, quoteRespIDLength);
            builder.append("\",\n");
        }

        if (hasQuoteID())
        {
            indent(builder, level);
            builder.append("\"QuoteID\": \"");
            appendBuffer(builder, quoteID, quoteIDOffset, quoteIDLength);
            builder.append("\",\n");
        }

        if (hasQuoteMsgID())
        {
            indent(builder, level);
            builder.append("\"QuoteMsgID\": \"");
            appendBuffer(builder, quoteMsgID, quoteMsgIDOffset, quoteMsgIDLength);
            builder.append("\",\n");
        }

        if (hasQuoteRespType())
        {
            indent(builder, level);
            builder.append("\"QuoteRespType\": \"");
            builder.append(quoteRespType);
            builder.append("\",\n");
        }

        if (hasClOrdID())
        {
            indent(builder, level);
            builder.append("\"ClOrdID\": \"");
            appendBuffer(builder, clOrdID, clOrdIDOffset, clOrdIDLength);
            builder.append("\",\n");
        }

        if (hasOrderCapacity())
        {
            indent(builder, level);
            builder.append("\"OrderCapacity\": \"");
            builder.append(orderCapacity);
            builder.append("\",\n");
        }

        if (hasOrderRestrictions())
        {
            indent(builder, level);
            builder.append("\"OrderRestrictions\": \"");
            appendBuffer(builder, orderRestrictions, orderRestrictionsOffset, orderRestrictionsLength);
            builder.append("\",\n");
        }

        if (hasIOIID())
        {
            indent(builder, level);
            builder.append("\"IOIID\": \"");
            appendBuffer(builder, iOIID, iOIIDOffset, iOIIDLength);
            builder.append("\",\n");
        }

        if (hasQuoteType())
        {
            indent(builder, level);
            builder.append("\"QuoteType\": \"");
            builder.append(quoteType);
            builder.append("\",\n");
        }

        if (hasPreTradeAnonymity())
        {
            indent(builder, level);
            builder.append("\"PreTradeAnonymity\": \"");
            builder.append(preTradeAnonymity);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"QuotQualGrp\": ");
    quotQualGrp.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"Parties\": ");
    parties.appendTo(builder, level + 1);
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

    indent(builder, level);
    builder.append("\"Instrument\": ");
    instrument.appendTo(builder, level + 1);
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

    indent(builder, level);
    builder.append("\"OrderQtyData\": ");
    orderQtyData.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasMinQty())
        {
            indent(builder, level);
            builder.append("\"MinQty\": \"");
            minQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasSettlType())
        {
            indent(builder, level);
            builder.append("\"SettlType\": \"");
            appendBuffer(builder, settlType, settlTypeOffset, settlTypeLength);
            builder.append("\",\n");
        }

        if (hasSettlDate())
        {
            indent(builder, level);
            builder.append("\"SettlDate\": \"");
            appendBuffer(builder, settlDate, settlDateOffset, settlDateLength);
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
    builder.append("\"LegQuotGrp\": ");
    legQuotGrp.appendTo(builder, level + 1);
    builder.append("\n");

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

        if (hasMktBidPx())
        {
            indent(builder, level);
            builder.append("\"MktBidPx\": \"");
            mktBidPx.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasMktOfferPx())
        {
            indent(builder, level);
            builder.append("\"MktOfferPx\": \"");
            mktOfferPx.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasMinBidSize())
        {
            indent(builder, level);
            builder.append("\"MinBidSize\": \"");
            minBidSize.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasBidSize())
        {
            indent(builder, level);
            builder.append("\"BidSize\": \"");
            bidSize.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasMinOfferSize())
        {
            indent(builder, level);
            builder.append("\"MinOfferSize\": \"");
            minOfferSize.appendTo(builder);
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

        if (hasOrdType())
        {
            indent(builder, level);
            builder.append("\"OrdType\": \"");
            builder.append(ordType);
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

        if (hasSettlCurrBidFxRate())
        {
            indent(builder, level);
            builder.append("\"SettlCurrBidFxRate\": \"");
            settlCurrBidFxRate.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasSettlCurrOfferFxRate())
        {
            indent(builder, level);
            builder.append("\"SettlCurrOfferFxRate\": \"");
            settlCurrOfferFxRate.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasSettlCurrFxRateCalc())
        {
            indent(builder, level);
            builder.append("\"SettlCurrFxRateCalc\": \"");
            builder.append(settlCurrFxRateCalc);
            builder.append("\",\n");
        }

        if (hasCommission())
        {
            indent(builder, level);
            builder.append("\"Commission\": \"");
            commission.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasCommType())
        {
            indent(builder, level);
            builder.append("\"CommType\": \"");
            builder.append(commType);
            builder.append("\",\n");
        }

        if (hasCustOrderCapacity())
        {
            indent(builder, level);
            builder.append("\"CustOrderCapacity\": \"");
            builder.append(custOrderCapacity);
            builder.append("\",\n");
        }

        if (hasExDestination())
        {
            indent(builder, level);
            builder.append("\"ExDestination\": \"");
            appendBuffer(builder, exDestination, exDestinationOffset, exDestinationLength);
            builder.append("\",\n");
        }

        if (hasExDestinationIDSource())
        {
            indent(builder, level);
            builder.append("\"ExDestinationIDSource\": \"");
            builder.append(exDestinationIDSource);
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
    public QuoteResponseEncoder copyTo(final Encoder encoder)
    {
        return copyTo((QuoteResponseEncoder)encoder);
    }

    public QuoteResponseEncoder copyTo(final QuoteResponseEncoder encoder)
    {
        encoder.reset();
        if (hasQuoteRespID())
        {
            encoder.quoteRespIDAsCopy(quoteRespID.byteArray(), 0, quoteRespIDLength);
        }

        if (hasQuoteID())
        {
            encoder.quoteIDAsCopy(quoteID.byteArray(), 0, quoteIDLength);
        }

        if (hasQuoteMsgID())
        {
            encoder.quoteMsgIDAsCopy(quoteMsgID.byteArray(), 0, quoteMsgIDLength);
        }

        if (hasQuoteRespType())
        {
            encoder.quoteRespType(this.quoteRespType());
        }

        if (hasClOrdID())
        {
            encoder.clOrdIDAsCopy(clOrdID.byteArray(), 0, clOrdIDLength);
        }

        if (hasOrderCapacity())
        {
            encoder.orderCapacity(this.orderCapacity());
        }

        if (hasOrderRestrictions())
        {
            encoder.orderRestrictionsAsCopy(orderRestrictions.byteArray(), 0, orderRestrictionsLength);
        }

        if (hasIOIID())
        {
            encoder.iOIIDAsCopy(iOIID.byteArray(), 0, iOIIDLength);
        }

        if (hasQuoteType())
        {
            encoder.quoteType(this.quoteType());
        }

        if (hasPreTradeAnonymity())
        {
            encoder.preTradeAnonymity(this.preTradeAnonymity());
        }


        quotQualGrp.copyTo(encoder.quotQualGrp());

        parties.copyTo(encoder.parties());
        if (hasTradingSessionID())
        {
            encoder.tradingSessionIDAsCopy(tradingSessionID.byteArray(), 0, tradingSessionIDLength);
        }

        if (hasTradingSessionSubID())
        {
            encoder.tradingSessionSubIDAsCopy(tradingSessionSubID.byteArray(), 0, tradingSessionSubIDLength);
        }


        instrument.copyTo(encoder.instrument());

        financingDetails.copyTo(encoder.financingDetails());

        undInstrmtGrp.copyTo(encoder.undInstrmtGrp());
        if (hasSide())
        {
            encoder.side(this.side());
        }


        orderQtyData.copyTo(encoder.orderQtyData());
        if (hasMinQty())
        {
            encoder.minQty(this.minQty());
        }

        if (hasSettlType())
        {
            encoder.settlTypeAsCopy(settlType.byteArray(), 0, settlTypeLength);
        }

        if (hasSettlDate())
        {
            encoder.settlDateAsCopy(settlDate.byteArray(), 0, settlDateLength);
        }

        if (hasSettlDate2())
        {
            encoder.settlDate2AsCopy(settlDate2.byteArray(), 0, settlDate2Length);
        }

        if (hasOrderQty2())
        {
            encoder.orderQty2(this.orderQty2());
        }

        if (hasCurrency())
        {
            encoder.currencyAsCopy(currency.byteArray(), 0, currencyLength);
        }


        stipulations.copyTo(encoder.stipulations());
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


        legQuotGrp.copyTo(encoder.legQuotGrp());
        if (hasBidPx())
        {
            encoder.bidPx(this.bidPx());
        }

        if (hasOfferPx())
        {
            encoder.offerPx(this.offerPx());
        }

        if (hasMktBidPx())
        {
            encoder.mktBidPx(this.mktBidPx());
        }

        if (hasMktOfferPx())
        {
            encoder.mktOfferPx(this.mktOfferPx());
        }

        if (hasMinBidSize())
        {
            encoder.minBidSize(this.minBidSize());
        }

        if (hasBidSize())
        {
            encoder.bidSize(this.bidSize());
        }

        if (hasMinOfferSize())
        {
            encoder.minOfferSize(this.minOfferSize());
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

        if (hasOrdType())
        {
            encoder.ordType(this.ordType());
        }

        if (hasBidForwardPoints2())
        {
            encoder.bidForwardPoints2(this.bidForwardPoints2());
        }

        if (hasOfferForwardPoints2())
        {
            encoder.offerForwardPoints2(this.offerForwardPoints2());
        }

        if (hasSettlCurrBidFxRate())
        {
            encoder.settlCurrBidFxRate(this.settlCurrBidFxRate());
        }

        if (hasSettlCurrOfferFxRate())
        {
            encoder.settlCurrOfferFxRate(this.settlCurrOfferFxRate());
        }

        if (hasSettlCurrFxRateCalc())
        {
            encoder.settlCurrFxRateCalc(this.settlCurrFxRateCalc());
        }

        if (hasCommission())
        {
            encoder.commission(this.commission());
        }

        if (hasCommType())
        {
            encoder.commType(this.commType());
        }

        if (hasCustOrderCapacity())
        {
            encoder.custOrderCapacity(this.custOrderCapacity());
        }

        if (hasExDestination())
        {
            encoder.exDestinationAsCopy(exDestination.byteArray(), 0, exDestinationLength);
        }

        if (hasExDestinationIDSource())
        {
            encoder.exDestinationIDSource(this.exDestinationIDSource());
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

        if (hasPrice())
        {
            encoder.price(this.price());
        }

        if (hasPriceType())
        {
            encoder.priceType(this.priceType());
        }


        spreadOrBenchmarkCurveData.copyTo(encoder.spreadOrBenchmarkCurveData());

        yieldData.copyTo(encoder.yieldData());        return encoder;
    }

}
