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


public class OrderCancelReplaceRequestEncoder implements Encoder
{
    public long messageType()
    {
        return 71L;
    }

    public OrderCancelReplaceRequestEncoder()
    {
        header.msgType("G");
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

    private static final int orderIDHeaderLength = 3;
    private static final byte[] orderIDHeader = new byte[] {51, 55, (byte) '='};

    private static final int tradeOriginationDateHeaderLength = 4;
    private static final byte[] tradeOriginationDateHeader = new byte[] {50, 50, 57, (byte) '='};

    private static final int tradeDateHeaderLength = 3;
    private static final byte[] tradeDateHeader = new byte[] {55, 53, (byte) '='};

    private static final int origClOrdIDHeaderLength = 3;
    private static final byte[] origClOrdIDHeader = new byte[] {52, 49, (byte) '='};

    private static final int clOrdIDHeaderLength = 3;
    private static final byte[] clOrdIDHeader = new byte[] {49, 49, (byte) '='};

    private static final int secondaryClOrdIDHeaderLength = 4;
    private static final byte[] secondaryClOrdIDHeader = new byte[] {53, 50, 54, (byte) '='};

    private static final int clOrdLinkIDHeaderLength = 4;
    private static final byte[] clOrdLinkIDHeader = new byte[] {53, 56, 51, (byte) '='};

    private static final int listIDHeaderLength = 3;
    private static final byte[] listIDHeader = new byte[] {54, 54, (byte) '='};

    private static final int origOrdModTimeHeaderLength = 4;
    private static final byte[] origOrdModTimeHeader = new byte[] {53, 56, 54, (byte) '='};

    private static final int accountHeaderLength = 2;
    private static final byte[] accountHeader = new byte[] {49, (byte) '='};

    private static final int acctIDSourceHeaderLength = 4;
    private static final byte[] acctIDSourceHeader = new byte[] {54, 54, 48, (byte) '='};

    private static final int accountTypeHeaderLength = 4;
    private static final byte[] accountTypeHeader = new byte[] {53, 56, 49, (byte) '='};

    private static final int dayBookingInstHeaderLength = 4;
    private static final byte[] dayBookingInstHeader = new byte[] {53, 56, 57, (byte) '='};

    private static final int bookingUnitHeaderLength = 4;
    private static final byte[] bookingUnitHeader = new byte[] {53, 57, 48, (byte) '='};

    private static final int preallocMethodHeaderLength = 4;
    private static final byte[] preallocMethodHeader = new byte[] {53, 57, 49, (byte) '='};

    private static final int allocIDHeaderLength = 3;
    private static final byte[] allocIDHeader = new byte[] {55, 48, (byte) '='};

    private static final int settlTypeHeaderLength = 3;
    private static final byte[] settlTypeHeader = new byte[] {54, 51, (byte) '='};

    private static final int settlDateHeaderLength = 3;
    private static final byte[] settlDateHeader = new byte[] {54, 52, (byte) '='};

    private static final int cashMarginHeaderLength = 4;
    private static final byte[] cashMarginHeader = new byte[] {53, 52, 52, (byte) '='};

    private static final int clearingFeeIndicatorHeaderLength = 4;
    private static final byte[] clearingFeeIndicatorHeader = new byte[] {54, 51, 53, (byte) '='};

    private static final int handlInstHeaderLength = 3;
    private static final byte[] handlInstHeader = new byte[] {50, 49, (byte) '='};

    private static final int execInstHeaderLength = 3;
    private static final byte[] execInstHeader = new byte[] {49, 56, (byte) '='};

    private static final int minQtyHeaderLength = 4;
    private static final byte[] minQtyHeader = new byte[] {49, 49, 48, (byte) '='};

    private static final int matchIncrementHeaderLength = 5;
    private static final byte[] matchIncrementHeader = new byte[] {49, 48, 56, 57, (byte) '='};

    private static final int maxPriceLevelsHeaderLength = 5;
    private static final byte[] maxPriceLevelsHeader = new byte[] {49, 48, 57, 48, (byte) '='};

    private static final int maxFloorHeaderLength = 4;
    private static final byte[] maxFloorHeader = new byte[] {49, 49, 49, (byte) '='};

    private static final int exDestinationHeaderLength = 4;
    private static final byte[] exDestinationHeader = new byte[] {49, 48, 48, (byte) '='};

    private static final int exDestinationIDSourceHeaderLength = 5;
    private static final byte[] exDestinationIDSourceHeader = new byte[] {49, 49, 51, 51, (byte) '='};

    private static final int sideHeaderLength = 3;
    private static final byte[] sideHeader = new byte[] {53, 52, (byte) '='};

    private static final int transactTimeHeaderLength = 3;
    private static final byte[] transactTimeHeader = new byte[] {54, 48, (byte) '='};

    private static final int qtyTypeHeaderLength = 4;
    private static final byte[] qtyTypeHeader = new byte[] {56, 53, 52, (byte) '='};

    private static final int ordTypeHeaderLength = 3;
    private static final byte[] ordTypeHeader = new byte[] {52, 48, (byte) '='};

    private static final int priceTypeHeaderLength = 4;
    private static final byte[] priceTypeHeader = new byte[] {52, 50, 51, (byte) '='};

    private static final int priceHeaderLength = 3;
    private static final byte[] priceHeader = new byte[] {52, 52, (byte) '='};

    private static final int priceProtectionScopeHeaderLength = 5;
    private static final byte[] priceProtectionScopeHeader = new byte[] {49, 48, 57, 50, (byte) '='};

    private static final int stopPxHeaderLength = 3;
    private static final byte[] stopPxHeader = new byte[] {57, 57, (byte) '='};

    private static final int targetStrategyHeaderLength = 4;
    private static final byte[] targetStrategyHeader = new byte[] {56, 52, 55, (byte) '='};

    private static final int targetStrategyParametersHeaderLength = 4;
    private static final byte[] targetStrategyParametersHeader = new byte[] {56, 52, 56, (byte) '='};

    private static final int participationRateHeaderLength = 4;
    private static final byte[] participationRateHeader = new byte[] {56, 52, 57, (byte) '='};

    private static final int complianceIDHeaderLength = 4;
    private static final byte[] complianceIDHeader = new byte[] {51, 55, 54, (byte) '='};

    private static final int solicitedFlagHeaderLength = 4;
    private static final byte[] solicitedFlagHeader = new byte[] {51, 55, 55, (byte) '='};

    private static final int currencyHeaderLength = 3;
    private static final byte[] currencyHeader = new byte[] {49, 53, (byte) '='};

    private static final int timeInForceHeaderLength = 3;
    private static final byte[] timeInForceHeader = new byte[] {53, 57, (byte) '='};

    private static final int effectiveTimeHeaderLength = 4;
    private static final byte[] effectiveTimeHeader = new byte[] {49, 54, 56, (byte) '='};

    private static final int expireDateHeaderLength = 4;
    private static final byte[] expireDateHeader = new byte[] {52, 51, 50, (byte) '='};

    private static final int expireTimeHeaderLength = 4;
    private static final byte[] expireTimeHeader = new byte[] {49, 50, 54, (byte) '='};

    private static final int gTBookingInstHeaderLength = 4;
    private static final byte[] gTBookingInstHeader = new byte[] {52, 50, 55, (byte) '='};

    private static final int orderCapacityHeaderLength = 4;
    private static final byte[] orderCapacityHeader = new byte[] {53, 50, 56, (byte) '='};

    private static final int orderRestrictionsHeaderLength = 4;
    private static final byte[] orderRestrictionsHeader = new byte[] {53, 50, 57, (byte) '='};

    private static final int preTradeAnonymityHeaderLength = 5;
    private static final byte[] preTradeAnonymityHeader = new byte[] {49, 48, 57, 49, (byte) '='};

    private static final int custOrderCapacityHeaderLength = 4;
    private static final byte[] custOrderCapacityHeader = new byte[] {53, 56, 50, (byte) '='};

    private static final int forexReqHeaderLength = 4;
    private static final byte[] forexReqHeader = new byte[] {49, 50, 49, (byte) '='};

    private static final int settlCurrencyHeaderLength = 4;
    private static final byte[] settlCurrencyHeader = new byte[] {49, 50, 48, (byte) '='};

    private static final int bookingTypeHeaderLength = 4;
    private static final byte[] bookingTypeHeader = new byte[] {55, 55, 53, (byte) '='};

    private static final int textHeaderLength = 3;
    private static final byte[] textHeader = new byte[] {53, 56, (byte) '='};

    private static final int encodedTextLenHeaderLength = 4;
    private static final byte[] encodedTextLenHeader = new byte[] {51, 53, 52, (byte) '='};

    private static final int encodedTextHeaderLength = 4;
    private static final byte[] encodedTextHeader = new byte[] {51, 53, 53, (byte) '='};

    private static final int settlDate2HeaderLength = 4;
    private static final byte[] settlDate2Header = new byte[] {49, 57, 51, (byte) '='};

    private static final int orderQty2HeaderLength = 4;
    private static final byte[] orderQty2Header = new byte[] {49, 57, 50, (byte) '='};

    private static final int price2HeaderLength = 4;
    private static final byte[] price2Header = new byte[] {54, 52, 48, (byte) '='};

    private static final int positionEffectHeaderLength = 3;
    private static final byte[] positionEffectHeader = new byte[] {55, 55, (byte) '='};

    private static final int coveredOrUncoveredHeaderLength = 4;
    private static final byte[] coveredOrUncoveredHeader = new byte[] {50, 48, 51, (byte) '='};

    private static final int maxShowHeaderLength = 4;
    private static final byte[] maxShowHeader = new byte[] {50, 49, 48, (byte) '='};

    private static final int locateReqdHeaderLength = 4;
    private static final byte[] locateReqdHeader = new byte[] {49, 49, 52, (byte) '='};

    private static final int cancellationRightsHeaderLength = 4;
    private static final byte[] cancellationRightsHeader = new byte[] {52, 56, 48, (byte) '='};

    private static final int moneyLaunderingStatusHeaderLength = 4;
    private static final byte[] moneyLaunderingStatusHeader = new byte[] {52, 56, 49, (byte) '='};

    private static final int registIDHeaderLength = 4;
    private static final byte[] registIDHeader = new byte[] {53, 49, 51, (byte) '='};

    private static final int designationHeaderLength = 4;
    private static final byte[] designationHeader = new byte[] {52, 57, 52, (byte) '='};

    private static final int manualOrderIndicatorHeaderLength = 5;
    private static final byte[] manualOrderIndicatorHeader = new byte[] {49, 48, 50, 56, (byte) '='};

    private static final int custDirectedOrderHeaderLength = 5;
    private static final byte[] custDirectedOrderHeader = new byte[] {49, 48, 50, 57, (byte) '='};

    private static final int receivedDeptIDHeaderLength = 5;
    private static final byte[] receivedDeptIDHeader = new byte[] {49, 48, 51, 48, (byte) '='};

    private static final int custOrderHandlingInstHeaderLength = 5;
    private static final byte[] custOrderHandlingInstHeader = new byte[] {49, 48, 51, 49, (byte) '='};

    private static final int orderHandlingInstSourceHeaderLength = 5;
    private static final byte[] orderHandlingInstSourceHeader = new byte[] {49, 48, 51, 50, (byte) '='};

    private final MutableDirectBuffer orderID = new UnsafeBuffer();

    private int orderIDOffset = 0;

    private int orderIDLength = 0;

    public OrderCancelReplaceRequestEncoder orderID(final DirectBuffer value, final int offset, final int length)
    {
        orderID.wrap(value);
        orderIDOffset = offset;
        orderIDLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder orderID(final DirectBuffer value, final int length)
    {
        return orderID(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder orderID(final DirectBuffer value)
    {
        return orderID(value, 0, value.capacity());
    }

    public OrderCancelReplaceRequestEncoder orderID(final byte[] value, final int offset, final int length)
    {
        orderID.wrap(value);
        orderIDOffset = offset;
        orderIDLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder orderIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(orderID, value, offset, length);
        orderIDOffset = offset;
        orderIDLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder orderID(final byte[] value, final int length)
    {
        return orderID(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder orderID(final byte[] value)
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

    public OrderCancelReplaceRequestEncoder orderID(final CharSequence value)
    {
        toBytes(value, orderID);
        orderIDOffset = 0;
        orderIDLength = value.length();
        return this;
    }

    public OrderCancelReplaceRequestEncoder orderID(final AsciiSequenceView value)
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

    public OrderCancelReplaceRequestEncoder orderID(final char[] value)
    {
        return orderID(value, 0, value.length);
    }

    public OrderCancelReplaceRequestEncoder orderID(final char[] value, final int length)
    {
        return orderID(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder orderID(final char[] value, final int offset, final int length)
    {
        toBytes(value, orderID, offset, length);
        orderIDOffset = 0;
        orderIDLength = length;
        return this;
    }

    private final PartiesEncoder parties = new PartiesEncoder();
    public PartiesEncoder parties()
    {
        return parties;
    }

    private final MutableDirectBuffer tradeOriginationDate = new UnsafeBuffer();

    private int tradeOriginationDateOffset = 0;

    private int tradeOriginationDateLength = 0;

    public OrderCancelReplaceRequestEncoder tradeOriginationDate(final DirectBuffer value, final int offset, final int length)
    {
        tradeOriginationDate.wrap(value);
        tradeOriginationDateOffset = offset;
        tradeOriginationDateLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder tradeOriginationDate(final DirectBuffer value, final int length)
    {
        return tradeOriginationDate(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder tradeOriginationDate(final DirectBuffer value)
    {
        return tradeOriginationDate(value, 0, value.capacity());
    }

    public OrderCancelReplaceRequestEncoder tradeOriginationDate(final byte[] value, final int offset, final int length)
    {
        tradeOriginationDate.wrap(value);
        tradeOriginationDateOffset = offset;
        tradeOriginationDateLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder tradeOriginationDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradeOriginationDate, value, offset, length);
        tradeOriginationDateOffset = offset;
        tradeOriginationDateLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder tradeOriginationDate(final byte[] value, final int length)
    {
        return tradeOriginationDate(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder tradeOriginationDate(final byte[] value)
    {
        return tradeOriginationDate(value, 0, value.length);
    }

    public boolean hasTradeOriginationDate()
    {
        return tradeOriginationDateLength > 0;
    }

    public MutableDirectBuffer tradeOriginationDate()
    {
        return tradeOriginationDate;
    }

    public String tradeOriginationDateAsString()
    {
        return tradeOriginationDate.getStringWithoutLengthAscii(tradeOriginationDateOffset, tradeOriginationDateLength);
    }

    private final MutableDirectBuffer tradeDate = new UnsafeBuffer();

    private int tradeDateOffset = 0;

    private int tradeDateLength = 0;

    public OrderCancelReplaceRequestEncoder tradeDate(final DirectBuffer value, final int offset, final int length)
    {
        tradeDate.wrap(value);
        tradeDateOffset = offset;
        tradeDateLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder tradeDate(final DirectBuffer value, final int length)
    {
        return tradeDate(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder tradeDate(final DirectBuffer value)
    {
        return tradeDate(value, 0, value.capacity());
    }

    public OrderCancelReplaceRequestEncoder tradeDate(final byte[] value, final int offset, final int length)
    {
        tradeDate.wrap(value);
        tradeDateOffset = offset;
        tradeDateLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder tradeDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradeDate, value, offset, length);
        tradeDateOffset = offset;
        tradeDateLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder tradeDate(final byte[] value, final int length)
    {
        return tradeDate(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder tradeDate(final byte[] value)
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

    private final MutableDirectBuffer origClOrdID = new UnsafeBuffer();

    private int origClOrdIDOffset = 0;

    private int origClOrdIDLength = 0;

    public OrderCancelReplaceRequestEncoder origClOrdID(final DirectBuffer value, final int offset, final int length)
    {
        origClOrdID.wrap(value);
        origClOrdIDOffset = offset;
        origClOrdIDLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder origClOrdID(final DirectBuffer value, final int length)
    {
        return origClOrdID(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder origClOrdID(final DirectBuffer value)
    {
        return origClOrdID(value, 0, value.capacity());
    }

    public OrderCancelReplaceRequestEncoder origClOrdID(final byte[] value, final int offset, final int length)
    {
        origClOrdID.wrap(value);
        origClOrdIDOffset = offset;
        origClOrdIDLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder origClOrdIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(origClOrdID, value, offset, length);
        origClOrdIDOffset = offset;
        origClOrdIDLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder origClOrdID(final byte[] value, final int length)
    {
        return origClOrdID(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder origClOrdID(final byte[] value)
    {
        return origClOrdID(value, 0, value.length);
    }

    public boolean hasOrigClOrdID()
    {
        return origClOrdIDLength > 0;
    }

    public MutableDirectBuffer origClOrdID()
    {
        return origClOrdID;
    }

    public String origClOrdIDAsString()
    {
        return origClOrdID.getStringWithoutLengthAscii(origClOrdIDOffset, origClOrdIDLength);
    }

    public OrderCancelReplaceRequestEncoder origClOrdID(final CharSequence value)
    {
        toBytes(value, origClOrdID);
        origClOrdIDOffset = 0;
        origClOrdIDLength = value.length();
        return this;
    }

    public OrderCancelReplaceRequestEncoder origClOrdID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            origClOrdID.wrap(buffer);
            origClOrdIDOffset = value.offset();
            origClOrdIDLength = value.length();
        }
        return this;
    }

    public OrderCancelReplaceRequestEncoder origClOrdID(final char[] value)
    {
        return origClOrdID(value, 0, value.length);
    }

    public OrderCancelReplaceRequestEncoder origClOrdID(final char[] value, final int length)
    {
        return origClOrdID(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder origClOrdID(final char[] value, final int offset, final int length)
    {
        toBytes(value, origClOrdID, offset, length);
        origClOrdIDOffset = 0;
        origClOrdIDLength = length;
        return this;
    }

    private final MutableDirectBuffer clOrdID = new UnsafeBuffer();

    private int clOrdIDOffset = 0;

    private int clOrdIDLength = 0;

    public OrderCancelReplaceRequestEncoder clOrdID(final DirectBuffer value, final int offset, final int length)
    {
        clOrdID.wrap(value);
        clOrdIDOffset = offset;
        clOrdIDLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder clOrdID(final DirectBuffer value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder clOrdID(final DirectBuffer value)
    {
        return clOrdID(value, 0, value.capacity());
    }

    public OrderCancelReplaceRequestEncoder clOrdID(final byte[] value, final int offset, final int length)
    {
        clOrdID.wrap(value);
        clOrdIDOffset = offset;
        clOrdIDLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder clOrdIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(clOrdID, value, offset, length);
        clOrdIDOffset = offset;
        clOrdIDLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder clOrdID(final byte[] value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder clOrdID(final byte[] value)
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

    public OrderCancelReplaceRequestEncoder clOrdID(final CharSequence value)
    {
        toBytes(value, clOrdID);
        clOrdIDOffset = 0;
        clOrdIDLength = value.length();
        return this;
    }

    public OrderCancelReplaceRequestEncoder clOrdID(final AsciiSequenceView value)
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

    public OrderCancelReplaceRequestEncoder clOrdID(final char[] value)
    {
        return clOrdID(value, 0, value.length);
    }

    public OrderCancelReplaceRequestEncoder clOrdID(final char[] value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder clOrdID(final char[] value, final int offset, final int length)
    {
        toBytes(value, clOrdID, offset, length);
        clOrdIDOffset = 0;
        clOrdIDLength = length;
        return this;
    }

    private final MutableDirectBuffer secondaryClOrdID = new UnsafeBuffer();

    private int secondaryClOrdIDOffset = 0;

    private int secondaryClOrdIDLength = 0;

    public OrderCancelReplaceRequestEncoder secondaryClOrdID(final DirectBuffer value, final int offset, final int length)
    {
        secondaryClOrdID.wrap(value);
        secondaryClOrdIDOffset = offset;
        secondaryClOrdIDLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder secondaryClOrdID(final DirectBuffer value, final int length)
    {
        return secondaryClOrdID(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder secondaryClOrdID(final DirectBuffer value)
    {
        return secondaryClOrdID(value, 0, value.capacity());
    }

    public OrderCancelReplaceRequestEncoder secondaryClOrdID(final byte[] value, final int offset, final int length)
    {
        secondaryClOrdID.wrap(value);
        secondaryClOrdIDOffset = offset;
        secondaryClOrdIDLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder secondaryClOrdIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(secondaryClOrdID, value, offset, length);
        secondaryClOrdIDOffset = offset;
        secondaryClOrdIDLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder secondaryClOrdID(final byte[] value, final int length)
    {
        return secondaryClOrdID(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder secondaryClOrdID(final byte[] value)
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

    public OrderCancelReplaceRequestEncoder secondaryClOrdID(final CharSequence value)
    {
        toBytes(value, secondaryClOrdID);
        secondaryClOrdIDOffset = 0;
        secondaryClOrdIDLength = value.length();
        return this;
    }

    public OrderCancelReplaceRequestEncoder secondaryClOrdID(final AsciiSequenceView value)
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

    public OrderCancelReplaceRequestEncoder secondaryClOrdID(final char[] value)
    {
        return secondaryClOrdID(value, 0, value.length);
    }

    public OrderCancelReplaceRequestEncoder secondaryClOrdID(final char[] value, final int length)
    {
        return secondaryClOrdID(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder secondaryClOrdID(final char[] value, final int offset, final int length)
    {
        toBytes(value, secondaryClOrdID, offset, length);
        secondaryClOrdIDOffset = 0;
        secondaryClOrdIDLength = length;
        return this;
    }

    private final MutableDirectBuffer clOrdLinkID = new UnsafeBuffer();

    private int clOrdLinkIDOffset = 0;

    private int clOrdLinkIDLength = 0;

    public OrderCancelReplaceRequestEncoder clOrdLinkID(final DirectBuffer value, final int offset, final int length)
    {
        clOrdLinkID.wrap(value);
        clOrdLinkIDOffset = offset;
        clOrdLinkIDLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder clOrdLinkID(final DirectBuffer value, final int length)
    {
        return clOrdLinkID(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder clOrdLinkID(final DirectBuffer value)
    {
        return clOrdLinkID(value, 0, value.capacity());
    }

    public OrderCancelReplaceRequestEncoder clOrdLinkID(final byte[] value, final int offset, final int length)
    {
        clOrdLinkID.wrap(value);
        clOrdLinkIDOffset = offset;
        clOrdLinkIDLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder clOrdLinkIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(clOrdLinkID, value, offset, length);
        clOrdLinkIDOffset = offset;
        clOrdLinkIDLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder clOrdLinkID(final byte[] value, final int length)
    {
        return clOrdLinkID(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder clOrdLinkID(final byte[] value)
    {
        return clOrdLinkID(value, 0, value.length);
    }

    public boolean hasClOrdLinkID()
    {
        return clOrdLinkIDLength > 0;
    }

    public MutableDirectBuffer clOrdLinkID()
    {
        return clOrdLinkID;
    }

    public String clOrdLinkIDAsString()
    {
        return clOrdLinkID.getStringWithoutLengthAscii(clOrdLinkIDOffset, clOrdLinkIDLength);
    }

    public OrderCancelReplaceRequestEncoder clOrdLinkID(final CharSequence value)
    {
        toBytes(value, clOrdLinkID);
        clOrdLinkIDOffset = 0;
        clOrdLinkIDLength = value.length();
        return this;
    }

    public OrderCancelReplaceRequestEncoder clOrdLinkID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            clOrdLinkID.wrap(buffer);
            clOrdLinkIDOffset = value.offset();
            clOrdLinkIDLength = value.length();
        }
        return this;
    }

    public OrderCancelReplaceRequestEncoder clOrdLinkID(final char[] value)
    {
        return clOrdLinkID(value, 0, value.length);
    }

    public OrderCancelReplaceRequestEncoder clOrdLinkID(final char[] value, final int length)
    {
        return clOrdLinkID(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder clOrdLinkID(final char[] value, final int offset, final int length)
    {
        toBytes(value, clOrdLinkID, offset, length);
        clOrdLinkIDOffset = 0;
        clOrdLinkIDLength = length;
        return this;
    }

    private final MutableDirectBuffer listID = new UnsafeBuffer();

    private int listIDOffset = 0;

    private int listIDLength = 0;

    public OrderCancelReplaceRequestEncoder listID(final DirectBuffer value, final int offset, final int length)
    {
        listID.wrap(value);
        listIDOffset = offset;
        listIDLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder listID(final DirectBuffer value, final int length)
    {
        return listID(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder listID(final DirectBuffer value)
    {
        return listID(value, 0, value.capacity());
    }

    public OrderCancelReplaceRequestEncoder listID(final byte[] value, final int offset, final int length)
    {
        listID.wrap(value);
        listIDOffset = offset;
        listIDLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder listIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(listID, value, offset, length);
        listIDOffset = offset;
        listIDLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder listID(final byte[] value, final int length)
    {
        return listID(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder listID(final byte[] value)
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

    public OrderCancelReplaceRequestEncoder listID(final CharSequence value)
    {
        toBytes(value, listID);
        listIDOffset = 0;
        listIDLength = value.length();
        return this;
    }

    public OrderCancelReplaceRequestEncoder listID(final AsciiSequenceView value)
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

    public OrderCancelReplaceRequestEncoder listID(final char[] value)
    {
        return listID(value, 0, value.length);
    }

    public OrderCancelReplaceRequestEncoder listID(final char[] value, final int length)
    {
        return listID(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder listID(final char[] value, final int offset, final int length)
    {
        toBytes(value, listID, offset, length);
        listIDOffset = 0;
        listIDLength = length;
        return this;
    }

    private final MutableDirectBuffer origOrdModTime = new UnsafeBuffer();

    private int origOrdModTimeOffset = 0;

    private int origOrdModTimeLength = 0;

    public OrderCancelReplaceRequestEncoder origOrdModTime(final DirectBuffer value, final int offset, final int length)
    {
        origOrdModTime.wrap(value);
        origOrdModTimeOffset = offset;
        origOrdModTimeLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder origOrdModTime(final DirectBuffer value, final int length)
    {
        return origOrdModTime(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder origOrdModTime(final DirectBuffer value)
    {
        return origOrdModTime(value, 0, value.capacity());
    }

    public OrderCancelReplaceRequestEncoder origOrdModTime(final byte[] value, final int offset, final int length)
    {
        origOrdModTime.wrap(value);
        origOrdModTimeOffset = offset;
        origOrdModTimeLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder origOrdModTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(origOrdModTime, value, offset, length);
        origOrdModTimeOffset = offset;
        origOrdModTimeLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder origOrdModTime(final byte[] value, final int length)
    {
        return origOrdModTime(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder origOrdModTime(final byte[] value)
    {
        return origOrdModTime(value, 0, value.length);
    }

    public boolean hasOrigOrdModTime()
    {
        return origOrdModTimeLength > 0;
    }

    public MutableDirectBuffer origOrdModTime()
    {
        return origOrdModTime;
    }

    public String origOrdModTimeAsString()
    {
        return origOrdModTime.getStringWithoutLengthAscii(origOrdModTimeOffset, origOrdModTimeLength);
    }

    private final MutableDirectBuffer account = new UnsafeBuffer();

    private int accountOffset = 0;

    private int accountLength = 0;

    public OrderCancelReplaceRequestEncoder account(final DirectBuffer value, final int offset, final int length)
    {
        account.wrap(value);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder account(final DirectBuffer value, final int length)
    {
        return account(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder account(final DirectBuffer value)
    {
        return account(value, 0, value.capacity());
    }

    public OrderCancelReplaceRequestEncoder account(final byte[] value, final int offset, final int length)
    {
        account.wrap(value);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder accountAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(account, value, offset, length);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder account(final byte[] value, final int length)
    {
        return account(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder account(final byte[] value)
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

    public OrderCancelReplaceRequestEncoder account(final CharSequence value)
    {
        toBytes(value, account);
        accountOffset = 0;
        accountLength = value.length();
        return this;
    }

    public OrderCancelReplaceRequestEncoder account(final AsciiSequenceView value)
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

    public OrderCancelReplaceRequestEncoder account(final char[] value)
    {
        return account(value, 0, value.length);
    }

    public OrderCancelReplaceRequestEncoder account(final char[] value, final int length)
    {
        return account(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder account(final char[] value, final int offset, final int length)
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

    public OrderCancelReplaceRequestEncoder acctIDSource(int value)
    {
        acctIDSource = value;
        hasAcctIDSource = true;
        return this;
    }

    public int acctIDSource()
    {
        return acctIDSource;
    }

    public OrderCancelReplaceRequestEncoder acctIDSource(AcctIDSource value)
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

    public OrderCancelReplaceRequestEncoder accountType(int value)
    {
        accountType = value;
        hasAccountType = true;
        return this;
    }

    public int accountType()
    {
        return accountType;
    }

    public OrderCancelReplaceRequestEncoder accountType(AccountType value)
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

    private char dayBookingInst;

    private boolean hasDayBookingInst;

    public boolean hasDayBookingInst()
    {
        return hasDayBookingInst;
    }

    public OrderCancelReplaceRequestEncoder dayBookingInst(char value)
    {
        dayBookingInst = value;
        hasDayBookingInst = true;
        return this;
    }

    public char dayBookingInst()
    {
        return dayBookingInst;
    }

    public OrderCancelReplaceRequestEncoder dayBookingInst(DayBookingInst value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == DayBookingInst.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: dayBookingInst Value: " + value );
            }
            if (value == DayBookingInst.NULL_VAL)
            {
                return this;
            }
        }
        return dayBookingInst(value.representation());
    }

    private char bookingUnit;

    private boolean hasBookingUnit;

    public boolean hasBookingUnit()
    {
        return hasBookingUnit;
    }

    public OrderCancelReplaceRequestEncoder bookingUnit(char value)
    {
        bookingUnit = value;
        hasBookingUnit = true;
        return this;
    }

    public char bookingUnit()
    {
        return bookingUnit;
    }

    public OrderCancelReplaceRequestEncoder bookingUnit(BookingUnit value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == BookingUnit.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: bookingUnit Value: " + value );
            }
            if (value == BookingUnit.NULL_VAL)
            {
                return this;
            }
        }
        return bookingUnit(value.representation());
    }

    private char preallocMethod;

    private boolean hasPreallocMethod;

    public boolean hasPreallocMethod()
    {
        return hasPreallocMethod;
    }

    public OrderCancelReplaceRequestEncoder preallocMethod(char value)
    {
        preallocMethod = value;
        hasPreallocMethod = true;
        return this;
    }

    public char preallocMethod()
    {
        return preallocMethod;
    }

    public OrderCancelReplaceRequestEncoder preallocMethod(PreallocMethod value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == PreallocMethod.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: preallocMethod Value: " + value );
            }
            if (value == PreallocMethod.NULL_VAL)
            {
                return this;
            }
        }
        return preallocMethod(value.representation());
    }

    private final MutableDirectBuffer allocID = new UnsafeBuffer();

    private int allocIDOffset = 0;

    private int allocIDLength = 0;

    public OrderCancelReplaceRequestEncoder allocID(final DirectBuffer value, final int offset, final int length)
    {
        allocID.wrap(value);
        allocIDOffset = offset;
        allocIDLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder allocID(final DirectBuffer value, final int length)
    {
        return allocID(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder allocID(final DirectBuffer value)
    {
        return allocID(value, 0, value.capacity());
    }

    public OrderCancelReplaceRequestEncoder allocID(final byte[] value, final int offset, final int length)
    {
        allocID.wrap(value);
        allocIDOffset = offset;
        allocIDLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder allocIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(allocID, value, offset, length);
        allocIDOffset = offset;
        allocIDLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder allocID(final byte[] value, final int length)
    {
        return allocID(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder allocID(final byte[] value)
    {
        return allocID(value, 0, value.length);
    }

    public boolean hasAllocID()
    {
        return allocIDLength > 0;
    }

    public MutableDirectBuffer allocID()
    {
        return allocID;
    }

    public String allocIDAsString()
    {
        return allocID.getStringWithoutLengthAscii(allocIDOffset, allocIDLength);
    }

    public OrderCancelReplaceRequestEncoder allocID(final CharSequence value)
    {
        toBytes(value, allocID);
        allocIDOffset = 0;
        allocIDLength = value.length();
        return this;
    }

    public OrderCancelReplaceRequestEncoder allocID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            allocID.wrap(buffer);
            allocIDOffset = value.offset();
            allocIDLength = value.length();
        }
        return this;
    }

    public OrderCancelReplaceRequestEncoder allocID(final char[] value)
    {
        return allocID(value, 0, value.length);
    }

    public OrderCancelReplaceRequestEncoder allocID(final char[] value, final int length)
    {
        return allocID(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder allocID(final char[] value, final int offset, final int length)
    {
        toBytes(value, allocID, offset, length);
        allocIDOffset = 0;
        allocIDLength = length;
        return this;
    }

    private final PreAllocGrpEncoder preAllocGrp = new PreAllocGrpEncoder();
    public PreAllocGrpEncoder preAllocGrp()
    {
        return preAllocGrp;
    }

    private final MutableDirectBuffer settlType = new UnsafeBuffer();

    private int settlTypeOffset = 0;

    private int settlTypeLength = 0;

    public OrderCancelReplaceRequestEncoder settlType(final DirectBuffer value, final int offset, final int length)
    {
        settlType.wrap(value);
        settlTypeOffset = offset;
        settlTypeLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder settlType(final DirectBuffer value, final int length)
    {
        return settlType(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder settlType(final DirectBuffer value)
    {
        return settlType(value, 0, value.capacity());
    }

    public OrderCancelReplaceRequestEncoder settlType(final byte[] value, final int offset, final int length)
    {
        settlType.wrap(value);
        settlTypeOffset = offset;
        settlTypeLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder settlTypeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlType, value, offset, length);
        settlTypeOffset = offset;
        settlTypeLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder settlType(final byte[] value, final int length)
    {
        return settlType(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder settlType(final byte[] value)
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

    public OrderCancelReplaceRequestEncoder settlType(final CharSequence value)
    {
        toBytes(value, settlType);
        settlTypeOffset = 0;
        settlTypeLength = value.length();
        return this;
    }

    public OrderCancelReplaceRequestEncoder settlType(final AsciiSequenceView value)
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

    public OrderCancelReplaceRequestEncoder settlType(final char[] value)
    {
        return settlType(value, 0, value.length);
    }

    public OrderCancelReplaceRequestEncoder settlType(final char[] value, final int length)
    {
        return settlType(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder settlType(final char[] value, final int offset, final int length)
    {
        toBytes(value, settlType, offset, length);
        settlTypeOffset = 0;
        settlTypeLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder settlType(SettlType value)
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

    public OrderCancelReplaceRequestEncoder settlDate(final DirectBuffer value, final int offset, final int length)
    {
        settlDate.wrap(value);
        settlDateOffset = offset;
        settlDateLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder settlDate(final DirectBuffer value, final int length)
    {
        return settlDate(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder settlDate(final DirectBuffer value)
    {
        return settlDate(value, 0, value.capacity());
    }

    public OrderCancelReplaceRequestEncoder settlDate(final byte[] value, final int offset, final int length)
    {
        settlDate.wrap(value);
        settlDateOffset = offset;
        settlDateLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder settlDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlDate, value, offset, length);
        settlDateOffset = offset;
        settlDateLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder settlDate(final byte[] value, final int length)
    {
        return settlDate(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder settlDate(final byte[] value)
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

    private char cashMargin;

    private boolean hasCashMargin;

    public boolean hasCashMargin()
    {
        return hasCashMargin;
    }

    public OrderCancelReplaceRequestEncoder cashMargin(char value)
    {
        cashMargin = value;
        hasCashMargin = true;
        return this;
    }

    public char cashMargin()
    {
        return cashMargin;
    }

    public OrderCancelReplaceRequestEncoder cashMargin(CashMargin value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == CashMargin.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: cashMargin Value: " + value );
            }
            if (value == CashMargin.NULL_VAL)
            {
                return this;
            }
        }
        return cashMargin(value.representation());
    }

    private final MutableDirectBuffer clearingFeeIndicator = new UnsafeBuffer();

    private int clearingFeeIndicatorOffset = 0;

    private int clearingFeeIndicatorLength = 0;

    public OrderCancelReplaceRequestEncoder clearingFeeIndicator(final DirectBuffer value, final int offset, final int length)
    {
        clearingFeeIndicator.wrap(value);
        clearingFeeIndicatorOffset = offset;
        clearingFeeIndicatorLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder clearingFeeIndicator(final DirectBuffer value, final int length)
    {
        return clearingFeeIndicator(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder clearingFeeIndicator(final DirectBuffer value)
    {
        return clearingFeeIndicator(value, 0, value.capacity());
    }

    public OrderCancelReplaceRequestEncoder clearingFeeIndicator(final byte[] value, final int offset, final int length)
    {
        clearingFeeIndicator.wrap(value);
        clearingFeeIndicatorOffset = offset;
        clearingFeeIndicatorLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder clearingFeeIndicatorAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(clearingFeeIndicator, value, offset, length);
        clearingFeeIndicatorOffset = offset;
        clearingFeeIndicatorLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder clearingFeeIndicator(final byte[] value, final int length)
    {
        return clearingFeeIndicator(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder clearingFeeIndicator(final byte[] value)
    {
        return clearingFeeIndicator(value, 0, value.length);
    }

    public boolean hasClearingFeeIndicator()
    {
        return clearingFeeIndicatorLength > 0;
    }

    public MutableDirectBuffer clearingFeeIndicator()
    {
        return clearingFeeIndicator;
    }

    public String clearingFeeIndicatorAsString()
    {
        return clearingFeeIndicator.getStringWithoutLengthAscii(clearingFeeIndicatorOffset, clearingFeeIndicatorLength);
    }

    public OrderCancelReplaceRequestEncoder clearingFeeIndicator(final CharSequence value)
    {
        toBytes(value, clearingFeeIndicator);
        clearingFeeIndicatorOffset = 0;
        clearingFeeIndicatorLength = value.length();
        return this;
    }

    public OrderCancelReplaceRequestEncoder clearingFeeIndicator(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            clearingFeeIndicator.wrap(buffer);
            clearingFeeIndicatorOffset = value.offset();
            clearingFeeIndicatorLength = value.length();
        }
        return this;
    }

    public OrderCancelReplaceRequestEncoder clearingFeeIndicator(final char[] value)
    {
        return clearingFeeIndicator(value, 0, value.length);
    }

    public OrderCancelReplaceRequestEncoder clearingFeeIndicator(final char[] value, final int length)
    {
        return clearingFeeIndicator(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder clearingFeeIndicator(final char[] value, final int offset, final int length)
    {
        toBytes(value, clearingFeeIndicator, offset, length);
        clearingFeeIndicatorOffset = 0;
        clearingFeeIndicatorLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder clearingFeeIndicator(ClearingFeeIndicator value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == ClearingFeeIndicator.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: clearingFeeIndicator Value: " + value );
            }
            if (value == ClearingFeeIndicator.NULL_VAL)
            {
                return this;
            }
        }
        return clearingFeeIndicator(value.representation());
    }

    private char handlInst;

    private boolean hasHandlInst;

    public boolean hasHandlInst()
    {
        return hasHandlInst;
    }

    public OrderCancelReplaceRequestEncoder handlInst(char value)
    {
        handlInst = value;
        hasHandlInst = true;
        return this;
    }

    public char handlInst()
    {
        return handlInst;
    }

    public OrderCancelReplaceRequestEncoder handlInst(HandlInst value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == HandlInst.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: handlInst Value: " + value );
            }
            if (value == HandlInst.NULL_VAL)
            {
                return this;
            }
        }
        return handlInst(value.representation());
    }

    private final MutableDirectBuffer execInst = new UnsafeBuffer();

    private int execInstOffset = 0;

    private int execInstLength = 0;

    public OrderCancelReplaceRequestEncoder execInst(final DirectBuffer value, final int offset, final int length)
    {
        execInst.wrap(value);
        execInstOffset = offset;
        execInstLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder execInst(final DirectBuffer value, final int length)
    {
        return execInst(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder execInst(final DirectBuffer value)
    {
        return execInst(value, 0, value.capacity());
    }

    public OrderCancelReplaceRequestEncoder execInst(final byte[] value, final int offset, final int length)
    {
        execInst.wrap(value);
        execInstOffset = offset;
        execInstLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder execInstAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(execInst, value, offset, length);
        execInstOffset = offset;
        execInstLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder execInst(final byte[] value, final int length)
    {
        return execInst(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder execInst(final byte[] value)
    {
        return execInst(value, 0, value.length);
    }

    public boolean hasExecInst()
    {
        return execInstLength > 0;
    }

    public MutableDirectBuffer execInst()
    {
        return execInst;
    }

    public String execInstAsString()
    {
        return execInst.getStringWithoutLengthAscii(execInstOffset, execInstLength);
    }

    public OrderCancelReplaceRequestEncoder execInst(final CharSequence value)
    {
        toBytes(value, execInst);
        execInstOffset = 0;
        execInstLength = value.length();
        return this;
    }

    public OrderCancelReplaceRequestEncoder execInst(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            execInst.wrap(buffer);
            execInstOffset = value.offset();
            execInstLength = value.length();
        }
        return this;
    }

    public OrderCancelReplaceRequestEncoder execInst(final char[] value)
    {
        return execInst(value, 0, value.length);
    }

    public OrderCancelReplaceRequestEncoder execInst(final char[] value, final int length)
    {
        return execInst(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder execInst(final char[] value, final int offset, final int length)
    {
        toBytes(value, execInst, offset, length);
        execInstOffset = 0;
        execInstLength = length;
        return this;
    }

    private final DecimalFloat minQty = new DecimalFloat();

    private boolean hasMinQty;

    public boolean hasMinQty()
    {
        return hasMinQty;
    }

    public OrderCancelReplaceRequestEncoder minQty(DecimalFloat value)
    {
        minQty.set(value);
        hasMinQty = true;
        return this;
    }

    public OrderCancelReplaceRequestEncoder minQty(long value, int scale)
    {
        minQty.set(value, scale);
        hasMinQty = true;
        return this;
    }

    public DecimalFloat minQty()
    {
        return minQty;
    }

    private final DecimalFloat matchIncrement = new DecimalFloat();

    private boolean hasMatchIncrement;

    public boolean hasMatchIncrement()
    {
        return hasMatchIncrement;
    }

    public OrderCancelReplaceRequestEncoder matchIncrement(DecimalFloat value)
    {
        matchIncrement.set(value);
        hasMatchIncrement = true;
        return this;
    }

    public OrderCancelReplaceRequestEncoder matchIncrement(long value, int scale)
    {
        matchIncrement.set(value, scale);
        hasMatchIncrement = true;
        return this;
    }

    public DecimalFloat matchIncrement()
    {
        return matchIncrement;
    }

    private int maxPriceLevels;

    private boolean hasMaxPriceLevels;

    public boolean hasMaxPriceLevels()
    {
        return hasMaxPriceLevels;
    }

    public OrderCancelReplaceRequestEncoder maxPriceLevels(int value)
    {
        maxPriceLevels = value;
        hasMaxPriceLevels = true;
        return this;
    }

    public int maxPriceLevels()
    {
        return maxPriceLevels;
    }

    private final DisplayInstructionEncoder displayInstruction = new DisplayInstructionEncoder();
    public DisplayInstructionEncoder displayInstruction()
    {
        return displayInstruction;
    }

    private final DecimalFloat maxFloor = new DecimalFloat();

    private boolean hasMaxFloor;

    public boolean hasMaxFloor()
    {
        return hasMaxFloor;
    }

    public OrderCancelReplaceRequestEncoder maxFloor(DecimalFloat value)
    {
        maxFloor.set(value);
        hasMaxFloor = true;
        return this;
    }

    public OrderCancelReplaceRequestEncoder maxFloor(long value, int scale)
    {
        maxFloor.set(value, scale);
        hasMaxFloor = true;
        return this;
    }

    public DecimalFloat maxFloor()
    {
        return maxFloor;
    }

    private final MutableDirectBuffer exDestination = new UnsafeBuffer();

    private int exDestinationOffset = 0;

    private int exDestinationLength = 0;

    public OrderCancelReplaceRequestEncoder exDestination(final DirectBuffer value, final int offset, final int length)
    {
        exDestination.wrap(value);
        exDestinationOffset = offset;
        exDestinationLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder exDestination(final DirectBuffer value, final int length)
    {
        return exDestination(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder exDestination(final DirectBuffer value)
    {
        return exDestination(value, 0, value.capacity());
    }

    public OrderCancelReplaceRequestEncoder exDestination(final byte[] value, final int offset, final int length)
    {
        exDestination.wrap(value);
        exDestinationOffset = offset;
        exDestinationLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder exDestinationAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(exDestination, value, offset, length);
        exDestinationOffset = offset;
        exDestinationLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder exDestination(final byte[] value, final int length)
    {
        return exDestination(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder exDestination(final byte[] value)
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

    public OrderCancelReplaceRequestEncoder exDestination(final CharSequence value)
    {
        toBytes(value, exDestination);
        exDestinationOffset = 0;
        exDestinationLength = value.length();
        return this;
    }

    public OrderCancelReplaceRequestEncoder exDestination(final AsciiSequenceView value)
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

    public OrderCancelReplaceRequestEncoder exDestination(final char[] value)
    {
        return exDestination(value, 0, value.length);
    }

    public OrderCancelReplaceRequestEncoder exDestination(final char[] value, final int length)
    {
        return exDestination(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder exDestination(final char[] value, final int offset, final int length)
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

    public OrderCancelReplaceRequestEncoder exDestinationIDSource(char value)
    {
        exDestinationIDSource = value;
        hasExDestinationIDSource = true;
        return this;
    }

    public char exDestinationIDSource()
    {
        return exDestinationIDSource;
    }

    public OrderCancelReplaceRequestEncoder exDestinationIDSource(ExDestinationIDSource value)
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

    private final TrdgSesGrpEncoder trdgSesGrp = new TrdgSesGrpEncoder();
    public TrdgSesGrpEncoder trdgSesGrp()
    {
        return trdgSesGrp;
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

    public OrderCancelReplaceRequestEncoder side(char value)
    {
        side = value;
        hasSide = true;
        return this;
    }

    public char side()
    {
        return side;
    }

    public OrderCancelReplaceRequestEncoder side(Side value)
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

    private final MutableDirectBuffer transactTime = new UnsafeBuffer();

    private int transactTimeOffset = 0;

    private int transactTimeLength = 0;

    public OrderCancelReplaceRequestEncoder transactTime(final DirectBuffer value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder transactTime(final DirectBuffer value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder transactTime(final DirectBuffer value)
    {
        return transactTime(value, 0, value.capacity());
    }

    public OrderCancelReplaceRequestEncoder transactTime(final byte[] value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder transactTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(transactTime, value, offset, length);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder transactTime(final byte[] value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder transactTime(final byte[] value)
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

    private int qtyType;

    private boolean hasQtyType;

    public boolean hasQtyType()
    {
        return hasQtyType;
    }

    public OrderCancelReplaceRequestEncoder qtyType(int value)
    {
        qtyType = value;
        hasQtyType = true;
        return this;
    }

    public int qtyType()
    {
        return qtyType;
    }

    public OrderCancelReplaceRequestEncoder qtyType(QtyType value)
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

    private char ordType;

    private boolean hasOrdType;

    public boolean hasOrdType()
    {
        return hasOrdType;
    }

    public OrderCancelReplaceRequestEncoder ordType(char value)
    {
        ordType = value;
        hasOrdType = true;
        return this;
    }

    public char ordType()
    {
        return ordType;
    }

    public OrderCancelReplaceRequestEncoder ordType(OrdType value)
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

    private int priceType;

    private boolean hasPriceType;

    public boolean hasPriceType()
    {
        return hasPriceType;
    }

    public OrderCancelReplaceRequestEncoder priceType(int value)
    {
        priceType = value;
        hasPriceType = true;
        return this;
    }

    public int priceType()
    {
        return priceType;
    }

    public OrderCancelReplaceRequestEncoder priceType(PriceType value)
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

    public OrderCancelReplaceRequestEncoder price(DecimalFloat value)
    {
        price.set(value);
        hasPrice = true;
        return this;
    }

    public OrderCancelReplaceRequestEncoder price(long value, int scale)
    {
        price.set(value, scale);
        hasPrice = true;
        return this;
    }

    public DecimalFloat price()
    {
        return price;
    }

    private char priceProtectionScope;

    private boolean hasPriceProtectionScope;

    public boolean hasPriceProtectionScope()
    {
        return hasPriceProtectionScope;
    }

    public OrderCancelReplaceRequestEncoder priceProtectionScope(char value)
    {
        priceProtectionScope = value;
        hasPriceProtectionScope = true;
        return this;
    }

    public char priceProtectionScope()
    {
        return priceProtectionScope;
    }

    public OrderCancelReplaceRequestEncoder priceProtectionScope(PriceProtectionScope value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == PriceProtectionScope.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: priceProtectionScope Value: " + value );
            }
            if (value == PriceProtectionScope.NULL_VAL)
            {
                return this;
            }
        }
        return priceProtectionScope(value.representation());
    }

    private final DecimalFloat stopPx = new DecimalFloat();

    private boolean hasStopPx;

    public boolean hasStopPx()
    {
        return hasStopPx;
    }

    public OrderCancelReplaceRequestEncoder stopPx(DecimalFloat value)
    {
        stopPx.set(value);
        hasStopPx = true;
        return this;
    }

    public OrderCancelReplaceRequestEncoder stopPx(long value, int scale)
    {
        stopPx.set(value, scale);
        hasStopPx = true;
        return this;
    }

    public DecimalFloat stopPx()
    {
        return stopPx;
    }

    private final TriggeringInstructionEncoder triggeringInstruction = new TriggeringInstructionEncoder();
    public TriggeringInstructionEncoder triggeringInstruction()
    {
        return triggeringInstruction;
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

    private final PegInstructionsEncoder pegInstructions = new PegInstructionsEncoder();
    public PegInstructionsEncoder pegInstructions()
    {
        return pegInstructions;
    }

    private final DiscretionInstructionsEncoder discretionInstructions = new DiscretionInstructionsEncoder();
    public DiscretionInstructionsEncoder discretionInstructions()
    {
        return discretionInstructions;
    }

    private int targetStrategy;

    private boolean hasTargetStrategy;

    public boolean hasTargetStrategy()
    {
        return hasTargetStrategy;
    }

    public OrderCancelReplaceRequestEncoder targetStrategy(int value)
    {
        targetStrategy = value;
        hasTargetStrategy = true;
        return this;
    }

    public int targetStrategy()
    {
        return targetStrategy;
    }

    public OrderCancelReplaceRequestEncoder targetStrategy(TargetStrategy value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == TargetStrategy.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: targetStrategy Value: " + value );
            }
            if (value == TargetStrategy.NULL_VAL)
            {
                return this;
            }
        }
        return targetStrategy(value.representation());
    }

    private final StrategyParametersGrpEncoder strategyParametersGrp = new StrategyParametersGrpEncoder();
    public StrategyParametersGrpEncoder strategyParametersGrp()
    {
        return strategyParametersGrp;
    }

    private final MutableDirectBuffer targetStrategyParameters = new UnsafeBuffer();

    private int targetStrategyParametersOffset = 0;

    private int targetStrategyParametersLength = 0;

    public OrderCancelReplaceRequestEncoder targetStrategyParameters(final DirectBuffer value, final int offset, final int length)
    {
        targetStrategyParameters.wrap(value);
        targetStrategyParametersOffset = offset;
        targetStrategyParametersLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder targetStrategyParameters(final DirectBuffer value, final int length)
    {
        return targetStrategyParameters(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder targetStrategyParameters(final DirectBuffer value)
    {
        return targetStrategyParameters(value, 0, value.capacity());
    }

    public OrderCancelReplaceRequestEncoder targetStrategyParameters(final byte[] value, final int offset, final int length)
    {
        targetStrategyParameters.wrap(value);
        targetStrategyParametersOffset = offset;
        targetStrategyParametersLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder targetStrategyParametersAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(targetStrategyParameters, value, offset, length);
        targetStrategyParametersOffset = offset;
        targetStrategyParametersLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder targetStrategyParameters(final byte[] value, final int length)
    {
        return targetStrategyParameters(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder targetStrategyParameters(final byte[] value)
    {
        return targetStrategyParameters(value, 0, value.length);
    }

    public boolean hasTargetStrategyParameters()
    {
        return targetStrategyParametersLength > 0;
    }

    public MutableDirectBuffer targetStrategyParameters()
    {
        return targetStrategyParameters;
    }

    public String targetStrategyParametersAsString()
    {
        return targetStrategyParameters.getStringWithoutLengthAscii(targetStrategyParametersOffset, targetStrategyParametersLength);
    }

    public OrderCancelReplaceRequestEncoder targetStrategyParameters(final CharSequence value)
    {
        toBytes(value, targetStrategyParameters);
        targetStrategyParametersOffset = 0;
        targetStrategyParametersLength = value.length();
        return this;
    }

    public OrderCancelReplaceRequestEncoder targetStrategyParameters(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            targetStrategyParameters.wrap(buffer);
            targetStrategyParametersOffset = value.offset();
            targetStrategyParametersLength = value.length();
        }
        return this;
    }

    public OrderCancelReplaceRequestEncoder targetStrategyParameters(final char[] value)
    {
        return targetStrategyParameters(value, 0, value.length);
    }

    public OrderCancelReplaceRequestEncoder targetStrategyParameters(final char[] value, final int length)
    {
        return targetStrategyParameters(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder targetStrategyParameters(final char[] value, final int offset, final int length)
    {
        toBytes(value, targetStrategyParameters, offset, length);
        targetStrategyParametersOffset = 0;
        targetStrategyParametersLength = length;
        return this;
    }

    private final DecimalFloat participationRate = new DecimalFloat();

    private boolean hasParticipationRate;

    public boolean hasParticipationRate()
    {
        return hasParticipationRate;
    }

    public OrderCancelReplaceRequestEncoder participationRate(DecimalFloat value)
    {
        participationRate.set(value);
        hasParticipationRate = true;
        return this;
    }

    public OrderCancelReplaceRequestEncoder participationRate(long value, int scale)
    {
        participationRate.set(value, scale);
        hasParticipationRate = true;
        return this;
    }

    public DecimalFloat participationRate()
    {
        return participationRate;
    }

    private final MutableDirectBuffer complianceID = new UnsafeBuffer();

    private int complianceIDOffset = 0;

    private int complianceIDLength = 0;

    public OrderCancelReplaceRequestEncoder complianceID(final DirectBuffer value, final int offset, final int length)
    {
        complianceID.wrap(value);
        complianceIDOffset = offset;
        complianceIDLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder complianceID(final DirectBuffer value, final int length)
    {
        return complianceID(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder complianceID(final DirectBuffer value)
    {
        return complianceID(value, 0, value.capacity());
    }

    public OrderCancelReplaceRequestEncoder complianceID(final byte[] value, final int offset, final int length)
    {
        complianceID.wrap(value);
        complianceIDOffset = offset;
        complianceIDLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder complianceIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(complianceID, value, offset, length);
        complianceIDOffset = offset;
        complianceIDLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder complianceID(final byte[] value, final int length)
    {
        return complianceID(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder complianceID(final byte[] value)
    {
        return complianceID(value, 0, value.length);
    }

    public boolean hasComplianceID()
    {
        return complianceIDLength > 0;
    }

    public MutableDirectBuffer complianceID()
    {
        return complianceID;
    }

    public String complianceIDAsString()
    {
        return complianceID.getStringWithoutLengthAscii(complianceIDOffset, complianceIDLength);
    }

    public OrderCancelReplaceRequestEncoder complianceID(final CharSequence value)
    {
        toBytes(value, complianceID);
        complianceIDOffset = 0;
        complianceIDLength = value.length();
        return this;
    }

    public OrderCancelReplaceRequestEncoder complianceID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            complianceID.wrap(buffer);
            complianceIDOffset = value.offset();
            complianceIDLength = value.length();
        }
        return this;
    }

    public OrderCancelReplaceRequestEncoder complianceID(final char[] value)
    {
        return complianceID(value, 0, value.length);
    }

    public OrderCancelReplaceRequestEncoder complianceID(final char[] value, final int length)
    {
        return complianceID(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder complianceID(final char[] value, final int offset, final int length)
    {
        toBytes(value, complianceID, offset, length);
        complianceIDOffset = 0;
        complianceIDLength = length;
        return this;
    }

    private boolean solicitedFlag;

    private boolean hasSolicitedFlag;

    public boolean hasSolicitedFlag()
    {
        return hasSolicitedFlag;
    }

    public OrderCancelReplaceRequestEncoder solicitedFlag(boolean value)
    {
        solicitedFlag = value;
        hasSolicitedFlag = true;
        return this;
    }

    public boolean solicitedFlag()
    {
        return solicitedFlag;
    }

    private final MutableDirectBuffer currency = new UnsafeBuffer();

    private int currencyOffset = 0;

    private int currencyLength = 0;

    public OrderCancelReplaceRequestEncoder currency(final DirectBuffer value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder currency(final DirectBuffer value, final int length)
    {
        return currency(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder currency(final DirectBuffer value)
    {
        return currency(value, 0, value.capacity());
    }

    public OrderCancelReplaceRequestEncoder currency(final byte[] value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder currencyAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(currency, value, offset, length);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder currency(final byte[] value, final int length)
    {
        return currency(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder currency(final byte[] value)
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

    public OrderCancelReplaceRequestEncoder currency(final CharSequence value)
    {
        toBytes(value, currency);
        currencyOffset = 0;
        currencyLength = value.length();
        return this;
    }

    public OrderCancelReplaceRequestEncoder currency(final AsciiSequenceView value)
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

    public OrderCancelReplaceRequestEncoder currency(final char[] value)
    {
        return currency(value, 0, value.length);
    }

    public OrderCancelReplaceRequestEncoder currency(final char[] value, final int length)
    {
        return currency(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder currency(final char[] value, final int offset, final int length)
    {
        toBytes(value, currency, offset, length);
        currencyOffset = 0;
        currencyLength = length;
        return this;
    }

    private char timeInForce;

    private boolean hasTimeInForce;

    public boolean hasTimeInForce()
    {
        return hasTimeInForce;
    }

    public OrderCancelReplaceRequestEncoder timeInForce(char value)
    {
        timeInForce = value;
        hasTimeInForce = true;
        return this;
    }

    public char timeInForce()
    {
        return timeInForce;
    }

    public OrderCancelReplaceRequestEncoder timeInForce(TimeInForce value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == TimeInForce.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: timeInForce Value: " + value );
            }
            if (value == TimeInForce.NULL_VAL)
            {
                return this;
            }
        }
        return timeInForce(value.representation());
    }

    private final MutableDirectBuffer effectiveTime = new UnsafeBuffer();

    private int effectiveTimeOffset = 0;

    private int effectiveTimeLength = 0;

    public OrderCancelReplaceRequestEncoder effectiveTime(final DirectBuffer value, final int offset, final int length)
    {
        effectiveTime.wrap(value);
        effectiveTimeOffset = offset;
        effectiveTimeLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder effectiveTime(final DirectBuffer value, final int length)
    {
        return effectiveTime(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder effectiveTime(final DirectBuffer value)
    {
        return effectiveTime(value, 0, value.capacity());
    }

    public OrderCancelReplaceRequestEncoder effectiveTime(final byte[] value, final int offset, final int length)
    {
        effectiveTime.wrap(value);
        effectiveTimeOffset = offset;
        effectiveTimeLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder effectiveTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(effectiveTime, value, offset, length);
        effectiveTimeOffset = offset;
        effectiveTimeLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder effectiveTime(final byte[] value, final int length)
    {
        return effectiveTime(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder effectiveTime(final byte[] value)
    {
        return effectiveTime(value, 0, value.length);
    }

    public boolean hasEffectiveTime()
    {
        return effectiveTimeLength > 0;
    }

    public MutableDirectBuffer effectiveTime()
    {
        return effectiveTime;
    }

    public String effectiveTimeAsString()
    {
        return effectiveTime.getStringWithoutLengthAscii(effectiveTimeOffset, effectiveTimeLength);
    }

    private final MutableDirectBuffer expireDate = new UnsafeBuffer();

    private int expireDateOffset = 0;

    private int expireDateLength = 0;

    public OrderCancelReplaceRequestEncoder expireDate(final DirectBuffer value, final int offset, final int length)
    {
        expireDate.wrap(value);
        expireDateOffset = offset;
        expireDateLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder expireDate(final DirectBuffer value, final int length)
    {
        return expireDate(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder expireDate(final DirectBuffer value)
    {
        return expireDate(value, 0, value.capacity());
    }

    public OrderCancelReplaceRequestEncoder expireDate(final byte[] value, final int offset, final int length)
    {
        expireDate.wrap(value);
        expireDateOffset = offset;
        expireDateLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder expireDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(expireDate, value, offset, length);
        expireDateOffset = offset;
        expireDateLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder expireDate(final byte[] value, final int length)
    {
        return expireDate(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder expireDate(final byte[] value)
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

    private final MutableDirectBuffer expireTime = new UnsafeBuffer();

    private int expireTimeOffset = 0;

    private int expireTimeLength = 0;

    public OrderCancelReplaceRequestEncoder expireTime(final DirectBuffer value, final int offset, final int length)
    {
        expireTime.wrap(value);
        expireTimeOffset = offset;
        expireTimeLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder expireTime(final DirectBuffer value, final int length)
    {
        return expireTime(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder expireTime(final DirectBuffer value)
    {
        return expireTime(value, 0, value.capacity());
    }

    public OrderCancelReplaceRequestEncoder expireTime(final byte[] value, final int offset, final int length)
    {
        expireTime.wrap(value);
        expireTimeOffset = offset;
        expireTimeLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder expireTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(expireTime, value, offset, length);
        expireTimeOffset = offset;
        expireTimeLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder expireTime(final byte[] value, final int length)
    {
        return expireTime(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder expireTime(final byte[] value)
    {
        return expireTime(value, 0, value.length);
    }

    public boolean hasExpireTime()
    {
        return expireTimeLength > 0;
    }

    public MutableDirectBuffer expireTime()
    {
        return expireTime;
    }

    public String expireTimeAsString()
    {
        return expireTime.getStringWithoutLengthAscii(expireTimeOffset, expireTimeLength);
    }

    private int gTBookingInst;

    private boolean hasGTBookingInst;

    public boolean hasGTBookingInst()
    {
        return hasGTBookingInst;
    }

    public OrderCancelReplaceRequestEncoder gTBookingInst(int value)
    {
        gTBookingInst = value;
        hasGTBookingInst = true;
        return this;
    }

    public int gTBookingInst()
    {
        return gTBookingInst;
    }

    public OrderCancelReplaceRequestEncoder gTBookingInst(GTBookingInst value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == GTBookingInst.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: gTBookingInst Value: " + value );
            }
            if (value == GTBookingInst.NULL_VAL)
            {
                return this;
            }
        }
        return gTBookingInst(value.representation());
    }

    private final CommissionDataEncoder commissionData = new CommissionDataEncoder();
    public CommissionDataEncoder commissionData()
    {
        return commissionData;
    }

    private char orderCapacity;

    private boolean hasOrderCapacity;

    public boolean hasOrderCapacity()
    {
        return hasOrderCapacity;
    }

    public OrderCancelReplaceRequestEncoder orderCapacity(char value)
    {
        orderCapacity = value;
        hasOrderCapacity = true;
        return this;
    }

    public char orderCapacity()
    {
        return orderCapacity;
    }

    public OrderCancelReplaceRequestEncoder orderCapacity(OrderCapacity value)
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

    public OrderCancelReplaceRequestEncoder orderRestrictions(final DirectBuffer value, final int offset, final int length)
    {
        orderRestrictions.wrap(value);
        orderRestrictionsOffset = offset;
        orderRestrictionsLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder orderRestrictions(final DirectBuffer value, final int length)
    {
        return orderRestrictions(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder orderRestrictions(final DirectBuffer value)
    {
        return orderRestrictions(value, 0, value.capacity());
    }

    public OrderCancelReplaceRequestEncoder orderRestrictions(final byte[] value, final int offset, final int length)
    {
        orderRestrictions.wrap(value);
        orderRestrictionsOffset = offset;
        orderRestrictionsLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder orderRestrictionsAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(orderRestrictions, value, offset, length);
        orderRestrictionsOffset = offset;
        orderRestrictionsLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder orderRestrictions(final byte[] value, final int length)
    {
        return orderRestrictions(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder orderRestrictions(final byte[] value)
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

    public OrderCancelReplaceRequestEncoder orderRestrictions(final CharSequence value)
    {
        toBytes(value, orderRestrictions);
        orderRestrictionsOffset = 0;
        orderRestrictionsLength = value.length();
        return this;
    }

    public OrderCancelReplaceRequestEncoder orderRestrictions(final AsciiSequenceView value)
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

    public OrderCancelReplaceRequestEncoder orderRestrictions(final char[] value)
    {
        return orderRestrictions(value, 0, value.length);
    }

    public OrderCancelReplaceRequestEncoder orderRestrictions(final char[] value, final int length)
    {
        return orderRestrictions(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder orderRestrictions(final char[] value, final int offset, final int length)
    {
        toBytes(value, orderRestrictions, offset, length);
        orderRestrictionsOffset = 0;
        orderRestrictionsLength = length;
        return this;
    }

    private boolean preTradeAnonymity;

    private boolean hasPreTradeAnonymity;

    public boolean hasPreTradeAnonymity()
    {
        return hasPreTradeAnonymity;
    }

    public OrderCancelReplaceRequestEncoder preTradeAnonymity(boolean value)
    {
        preTradeAnonymity = value;
        hasPreTradeAnonymity = true;
        return this;
    }

    public boolean preTradeAnonymity()
    {
        return preTradeAnonymity;
    }

    private int custOrderCapacity;

    private boolean hasCustOrderCapacity;

    public boolean hasCustOrderCapacity()
    {
        return hasCustOrderCapacity;
    }

    public OrderCancelReplaceRequestEncoder custOrderCapacity(int value)
    {
        custOrderCapacity = value;
        hasCustOrderCapacity = true;
        return this;
    }

    public int custOrderCapacity()
    {
        return custOrderCapacity;
    }

    public OrderCancelReplaceRequestEncoder custOrderCapacity(CustOrderCapacity value)
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

    private boolean forexReq;

    private boolean hasForexReq;

    public boolean hasForexReq()
    {
        return hasForexReq;
    }

    public OrderCancelReplaceRequestEncoder forexReq(boolean value)
    {
        forexReq = value;
        hasForexReq = true;
        return this;
    }

    public boolean forexReq()
    {
        return forexReq;
    }

    private final MutableDirectBuffer settlCurrency = new UnsafeBuffer();

    private int settlCurrencyOffset = 0;

    private int settlCurrencyLength = 0;

    public OrderCancelReplaceRequestEncoder settlCurrency(final DirectBuffer value, final int offset, final int length)
    {
        settlCurrency.wrap(value);
        settlCurrencyOffset = offset;
        settlCurrencyLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder settlCurrency(final DirectBuffer value, final int length)
    {
        return settlCurrency(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder settlCurrency(final DirectBuffer value)
    {
        return settlCurrency(value, 0, value.capacity());
    }

    public OrderCancelReplaceRequestEncoder settlCurrency(final byte[] value, final int offset, final int length)
    {
        settlCurrency.wrap(value);
        settlCurrencyOffset = offset;
        settlCurrencyLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder settlCurrencyAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlCurrency, value, offset, length);
        settlCurrencyOffset = offset;
        settlCurrencyLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder settlCurrency(final byte[] value, final int length)
    {
        return settlCurrency(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder settlCurrency(final byte[] value)
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

    public OrderCancelReplaceRequestEncoder settlCurrency(final CharSequence value)
    {
        toBytes(value, settlCurrency);
        settlCurrencyOffset = 0;
        settlCurrencyLength = value.length();
        return this;
    }

    public OrderCancelReplaceRequestEncoder settlCurrency(final AsciiSequenceView value)
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

    public OrderCancelReplaceRequestEncoder settlCurrency(final char[] value)
    {
        return settlCurrency(value, 0, value.length);
    }

    public OrderCancelReplaceRequestEncoder settlCurrency(final char[] value, final int length)
    {
        return settlCurrency(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder settlCurrency(final char[] value, final int offset, final int length)
    {
        toBytes(value, settlCurrency, offset, length);
        settlCurrencyOffset = 0;
        settlCurrencyLength = length;
        return this;
    }

    private int bookingType;

    private boolean hasBookingType;

    public boolean hasBookingType()
    {
        return hasBookingType;
    }

    public OrderCancelReplaceRequestEncoder bookingType(int value)
    {
        bookingType = value;
        hasBookingType = true;
        return this;
    }

    public int bookingType()
    {
        return bookingType;
    }

    public OrderCancelReplaceRequestEncoder bookingType(BookingType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == BookingType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: bookingType Value: " + value );
            }
            if (value == BookingType.NULL_VAL)
            {
                return this;
            }
        }
        return bookingType(value.representation());
    }

    private final MutableDirectBuffer text = new UnsafeBuffer();

    private int textOffset = 0;

    private int textLength = 0;

    public OrderCancelReplaceRequestEncoder text(final DirectBuffer value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder text(final DirectBuffer value, final int length)
    {
        return text(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder text(final DirectBuffer value)
    {
        return text(value, 0, value.capacity());
    }

    public OrderCancelReplaceRequestEncoder text(final byte[] value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder textAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(text, value, offset, length);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder text(final byte[] value, final int length)
    {
        return text(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder text(final byte[] value)
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

    public OrderCancelReplaceRequestEncoder text(final CharSequence value)
    {
        toBytes(value, text);
        textOffset = 0;
        textLength = value.length();
        return this;
    }

    public OrderCancelReplaceRequestEncoder text(final AsciiSequenceView value)
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

    public OrderCancelReplaceRequestEncoder text(final char[] value)
    {
        return text(value, 0, value.length);
    }

    public OrderCancelReplaceRequestEncoder text(final char[] value, final int length)
    {
        return text(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder text(final char[] value, final int offset, final int length)
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

    public OrderCancelReplaceRequestEncoder encodedTextLen(int value)
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

    public OrderCancelReplaceRequestEncoder encodedText(byte[] value)
    {
        encodedText = value;
        hasEncodedText = true;
        return this;
    }

    public byte[] encodedText()
    {
        return encodedText;
    }

    public OrderCancelReplaceRequestEncoder encodedTextAsCopy(final byte[] value, final int offset, final int length)
    {
        encodedText = copyInto(encodedText, value, offset, length);
        hasEncodedText = true;
        return this;
    }

    private final MutableDirectBuffer settlDate2 = new UnsafeBuffer();

    private int settlDate2Offset = 0;

    private int settlDate2Length = 0;

    public OrderCancelReplaceRequestEncoder settlDate2(final DirectBuffer value, final int offset, final int length)
    {
        settlDate2.wrap(value);
        settlDate2Offset = offset;
        settlDate2Length = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder settlDate2(final DirectBuffer value, final int length)
    {
        return settlDate2(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder settlDate2(final DirectBuffer value)
    {
        return settlDate2(value, 0, value.capacity());
    }

    public OrderCancelReplaceRequestEncoder settlDate2(final byte[] value, final int offset, final int length)
    {
        settlDate2.wrap(value);
        settlDate2Offset = offset;
        settlDate2Length = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder settlDate2AsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlDate2, value, offset, length);
        settlDate2Offset = offset;
        settlDate2Length = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder settlDate2(final byte[] value, final int length)
    {
        return settlDate2(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder settlDate2(final byte[] value)
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

    public OrderCancelReplaceRequestEncoder orderQty2(DecimalFloat value)
    {
        orderQty2.set(value);
        hasOrderQty2 = true;
        return this;
    }

    public OrderCancelReplaceRequestEncoder orderQty2(long value, int scale)
    {
        orderQty2.set(value, scale);
        hasOrderQty2 = true;
        return this;
    }

    public DecimalFloat orderQty2()
    {
        return orderQty2;
    }

    private final DecimalFloat price2 = new DecimalFloat();

    private boolean hasPrice2;

    public boolean hasPrice2()
    {
        return hasPrice2;
    }

    public OrderCancelReplaceRequestEncoder price2(DecimalFloat value)
    {
        price2.set(value);
        hasPrice2 = true;
        return this;
    }

    public OrderCancelReplaceRequestEncoder price2(long value, int scale)
    {
        price2.set(value, scale);
        hasPrice2 = true;
        return this;
    }

    public DecimalFloat price2()
    {
        return price2;
    }

    private char positionEffect;

    private boolean hasPositionEffect;

    public boolean hasPositionEffect()
    {
        return hasPositionEffect;
    }

    public OrderCancelReplaceRequestEncoder positionEffect(char value)
    {
        positionEffect = value;
        hasPositionEffect = true;
        return this;
    }

    public char positionEffect()
    {
        return positionEffect;
    }

    public OrderCancelReplaceRequestEncoder positionEffect(PositionEffect value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == PositionEffect.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: positionEffect Value: " + value );
            }
            if (value == PositionEffect.NULL_VAL)
            {
                return this;
            }
        }
        return positionEffect(value.representation());
    }

    private int coveredOrUncovered;

    private boolean hasCoveredOrUncovered;

    public boolean hasCoveredOrUncovered()
    {
        return hasCoveredOrUncovered;
    }

    public OrderCancelReplaceRequestEncoder coveredOrUncovered(int value)
    {
        coveredOrUncovered = value;
        hasCoveredOrUncovered = true;
        return this;
    }

    public int coveredOrUncovered()
    {
        return coveredOrUncovered;
    }

    public OrderCancelReplaceRequestEncoder coveredOrUncovered(CoveredOrUncovered value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == CoveredOrUncovered.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: coveredOrUncovered Value: " + value );
            }
            if (value == CoveredOrUncovered.NULL_VAL)
            {
                return this;
            }
        }
        return coveredOrUncovered(value.representation());
    }

    private final DecimalFloat maxShow = new DecimalFloat();

    private boolean hasMaxShow;

    public boolean hasMaxShow()
    {
        return hasMaxShow;
    }

    public OrderCancelReplaceRequestEncoder maxShow(DecimalFloat value)
    {
        maxShow.set(value);
        hasMaxShow = true;
        return this;
    }

    public OrderCancelReplaceRequestEncoder maxShow(long value, int scale)
    {
        maxShow.set(value, scale);
        hasMaxShow = true;
        return this;
    }

    public DecimalFloat maxShow()
    {
        return maxShow;
    }

    private boolean locateReqd;

    private boolean hasLocateReqd;

    public boolean hasLocateReqd()
    {
        return hasLocateReqd;
    }

    public OrderCancelReplaceRequestEncoder locateReqd(boolean value)
    {
        locateReqd = value;
        hasLocateReqd = true;
        return this;
    }

    public boolean locateReqd()
    {
        return locateReqd;
    }

    private char cancellationRights;

    private boolean hasCancellationRights;

    public boolean hasCancellationRights()
    {
        return hasCancellationRights;
    }

    public OrderCancelReplaceRequestEncoder cancellationRights(char value)
    {
        cancellationRights = value;
        hasCancellationRights = true;
        return this;
    }

    public char cancellationRights()
    {
        return cancellationRights;
    }

    public OrderCancelReplaceRequestEncoder cancellationRights(CancellationRights value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == CancellationRights.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: cancellationRights Value: " + value );
            }
            if (value == CancellationRights.NULL_VAL)
            {
                return this;
            }
        }
        return cancellationRights(value.representation());
    }

    private char moneyLaunderingStatus;

    private boolean hasMoneyLaunderingStatus;

    public boolean hasMoneyLaunderingStatus()
    {
        return hasMoneyLaunderingStatus;
    }

    public OrderCancelReplaceRequestEncoder moneyLaunderingStatus(char value)
    {
        moneyLaunderingStatus = value;
        hasMoneyLaunderingStatus = true;
        return this;
    }

    public char moneyLaunderingStatus()
    {
        return moneyLaunderingStatus;
    }

    public OrderCancelReplaceRequestEncoder moneyLaunderingStatus(MoneyLaunderingStatus value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == MoneyLaunderingStatus.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: moneyLaunderingStatus Value: " + value );
            }
            if (value == MoneyLaunderingStatus.NULL_VAL)
            {
                return this;
            }
        }
        return moneyLaunderingStatus(value.representation());
    }

    private final MutableDirectBuffer registID = new UnsafeBuffer();

    private int registIDOffset = 0;

    private int registIDLength = 0;

    public OrderCancelReplaceRequestEncoder registID(final DirectBuffer value, final int offset, final int length)
    {
        registID.wrap(value);
        registIDOffset = offset;
        registIDLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder registID(final DirectBuffer value, final int length)
    {
        return registID(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder registID(final DirectBuffer value)
    {
        return registID(value, 0, value.capacity());
    }

    public OrderCancelReplaceRequestEncoder registID(final byte[] value, final int offset, final int length)
    {
        registID.wrap(value);
        registIDOffset = offset;
        registIDLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder registIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(registID, value, offset, length);
        registIDOffset = offset;
        registIDLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder registID(final byte[] value, final int length)
    {
        return registID(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder registID(final byte[] value)
    {
        return registID(value, 0, value.length);
    }

    public boolean hasRegistID()
    {
        return registIDLength > 0;
    }

    public MutableDirectBuffer registID()
    {
        return registID;
    }

    public String registIDAsString()
    {
        return registID.getStringWithoutLengthAscii(registIDOffset, registIDLength);
    }

    public OrderCancelReplaceRequestEncoder registID(final CharSequence value)
    {
        toBytes(value, registID);
        registIDOffset = 0;
        registIDLength = value.length();
        return this;
    }

    public OrderCancelReplaceRequestEncoder registID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            registID.wrap(buffer);
            registIDOffset = value.offset();
            registIDLength = value.length();
        }
        return this;
    }

    public OrderCancelReplaceRequestEncoder registID(final char[] value)
    {
        return registID(value, 0, value.length);
    }

    public OrderCancelReplaceRequestEncoder registID(final char[] value, final int length)
    {
        return registID(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder registID(final char[] value, final int offset, final int length)
    {
        toBytes(value, registID, offset, length);
        registIDOffset = 0;
        registIDLength = length;
        return this;
    }

    private final MutableDirectBuffer designation = new UnsafeBuffer();

    private int designationOffset = 0;

    private int designationLength = 0;

    public OrderCancelReplaceRequestEncoder designation(final DirectBuffer value, final int offset, final int length)
    {
        designation.wrap(value);
        designationOffset = offset;
        designationLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder designation(final DirectBuffer value, final int length)
    {
        return designation(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder designation(final DirectBuffer value)
    {
        return designation(value, 0, value.capacity());
    }

    public OrderCancelReplaceRequestEncoder designation(final byte[] value, final int offset, final int length)
    {
        designation.wrap(value);
        designationOffset = offset;
        designationLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder designationAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(designation, value, offset, length);
        designationOffset = offset;
        designationLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder designation(final byte[] value, final int length)
    {
        return designation(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder designation(final byte[] value)
    {
        return designation(value, 0, value.length);
    }

    public boolean hasDesignation()
    {
        return designationLength > 0;
    }

    public MutableDirectBuffer designation()
    {
        return designation;
    }

    public String designationAsString()
    {
        return designation.getStringWithoutLengthAscii(designationOffset, designationLength);
    }

    public OrderCancelReplaceRequestEncoder designation(final CharSequence value)
    {
        toBytes(value, designation);
        designationOffset = 0;
        designationLength = value.length();
        return this;
    }

    public OrderCancelReplaceRequestEncoder designation(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            designation.wrap(buffer);
            designationOffset = value.offset();
            designationLength = value.length();
        }
        return this;
    }

    public OrderCancelReplaceRequestEncoder designation(final char[] value)
    {
        return designation(value, 0, value.length);
    }

    public OrderCancelReplaceRequestEncoder designation(final char[] value, final int length)
    {
        return designation(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder designation(final char[] value, final int offset, final int length)
    {
        toBytes(value, designation, offset, length);
        designationOffset = 0;
        designationLength = length;
        return this;
    }

    private boolean manualOrderIndicator;

    private boolean hasManualOrderIndicator;

    public boolean hasManualOrderIndicator()
    {
        return hasManualOrderIndicator;
    }

    public OrderCancelReplaceRequestEncoder manualOrderIndicator(boolean value)
    {
        manualOrderIndicator = value;
        hasManualOrderIndicator = true;
        return this;
    }

    public boolean manualOrderIndicator()
    {
        return manualOrderIndicator;
    }

    private boolean custDirectedOrder;

    private boolean hasCustDirectedOrder;

    public boolean hasCustDirectedOrder()
    {
        return hasCustDirectedOrder;
    }

    public OrderCancelReplaceRequestEncoder custDirectedOrder(boolean value)
    {
        custDirectedOrder = value;
        hasCustDirectedOrder = true;
        return this;
    }

    public boolean custDirectedOrder()
    {
        return custDirectedOrder;
    }

    private final MutableDirectBuffer receivedDeptID = new UnsafeBuffer();

    private int receivedDeptIDOffset = 0;

    private int receivedDeptIDLength = 0;

    public OrderCancelReplaceRequestEncoder receivedDeptID(final DirectBuffer value, final int offset, final int length)
    {
        receivedDeptID.wrap(value);
        receivedDeptIDOffset = offset;
        receivedDeptIDLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder receivedDeptID(final DirectBuffer value, final int length)
    {
        return receivedDeptID(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder receivedDeptID(final DirectBuffer value)
    {
        return receivedDeptID(value, 0, value.capacity());
    }

    public OrderCancelReplaceRequestEncoder receivedDeptID(final byte[] value, final int offset, final int length)
    {
        receivedDeptID.wrap(value);
        receivedDeptIDOffset = offset;
        receivedDeptIDLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder receivedDeptIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(receivedDeptID, value, offset, length);
        receivedDeptIDOffset = offset;
        receivedDeptIDLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder receivedDeptID(final byte[] value, final int length)
    {
        return receivedDeptID(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder receivedDeptID(final byte[] value)
    {
        return receivedDeptID(value, 0, value.length);
    }

    public boolean hasReceivedDeptID()
    {
        return receivedDeptIDLength > 0;
    }

    public MutableDirectBuffer receivedDeptID()
    {
        return receivedDeptID;
    }

    public String receivedDeptIDAsString()
    {
        return receivedDeptID.getStringWithoutLengthAscii(receivedDeptIDOffset, receivedDeptIDLength);
    }

    public OrderCancelReplaceRequestEncoder receivedDeptID(final CharSequence value)
    {
        toBytes(value, receivedDeptID);
        receivedDeptIDOffset = 0;
        receivedDeptIDLength = value.length();
        return this;
    }

    public OrderCancelReplaceRequestEncoder receivedDeptID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            receivedDeptID.wrap(buffer);
            receivedDeptIDOffset = value.offset();
            receivedDeptIDLength = value.length();
        }
        return this;
    }

    public OrderCancelReplaceRequestEncoder receivedDeptID(final char[] value)
    {
        return receivedDeptID(value, 0, value.length);
    }

    public OrderCancelReplaceRequestEncoder receivedDeptID(final char[] value, final int length)
    {
        return receivedDeptID(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder receivedDeptID(final char[] value, final int offset, final int length)
    {
        toBytes(value, receivedDeptID, offset, length);
        receivedDeptIDOffset = 0;
        receivedDeptIDLength = length;
        return this;
    }

    private final MutableDirectBuffer custOrderHandlingInst = new UnsafeBuffer();

    private int custOrderHandlingInstOffset = 0;

    private int custOrderHandlingInstLength = 0;

    public OrderCancelReplaceRequestEncoder custOrderHandlingInst(final DirectBuffer value, final int offset, final int length)
    {
        custOrderHandlingInst.wrap(value);
        custOrderHandlingInstOffset = offset;
        custOrderHandlingInstLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder custOrderHandlingInst(final DirectBuffer value, final int length)
    {
        return custOrderHandlingInst(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder custOrderHandlingInst(final DirectBuffer value)
    {
        return custOrderHandlingInst(value, 0, value.capacity());
    }

    public OrderCancelReplaceRequestEncoder custOrderHandlingInst(final byte[] value, final int offset, final int length)
    {
        custOrderHandlingInst.wrap(value);
        custOrderHandlingInstOffset = offset;
        custOrderHandlingInstLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder custOrderHandlingInstAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(custOrderHandlingInst, value, offset, length);
        custOrderHandlingInstOffset = offset;
        custOrderHandlingInstLength = length;
        return this;
    }

    public OrderCancelReplaceRequestEncoder custOrderHandlingInst(final byte[] value, final int length)
    {
        return custOrderHandlingInst(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder custOrderHandlingInst(final byte[] value)
    {
        return custOrderHandlingInst(value, 0, value.length);
    }

    public boolean hasCustOrderHandlingInst()
    {
        return custOrderHandlingInstLength > 0;
    }

    public MutableDirectBuffer custOrderHandlingInst()
    {
        return custOrderHandlingInst;
    }

    public String custOrderHandlingInstAsString()
    {
        return custOrderHandlingInst.getStringWithoutLengthAscii(custOrderHandlingInstOffset, custOrderHandlingInstLength);
    }

    public OrderCancelReplaceRequestEncoder custOrderHandlingInst(final CharSequence value)
    {
        toBytes(value, custOrderHandlingInst);
        custOrderHandlingInstOffset = 0;
        custOrderHandlingInstLength = value.length();
        return this;
    }

    public OrderCancelReplaceRequestEncoder custOrderHandlingInst(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            custOrderHandlingInst.wrap(buffer);
            custOrderHandlingInstOffset = value.offset();
            custOrderHandlingInstLength = value.length();
        }
        return this;
    }

    public OrderCancelReplaceRequestEncoder custOrderHandlingInst(final char[] value)
    {
        return custOrderHandlingInst(value, 0, value.length);
    }

    public OrderCancelReplaceRequestEncoder custOrderHandlingInst(final char[] value, final int length)
    {
        return custOrderHandlingInst(value, 0, length);
    }

    public OrderCancelReplaceRequestEncoder custOrderHandlingInst(final char[] value, final int offset, final int length)
    {
        toBytes(value, custOrderHandlingInst, offset, length);
        custOrderHandlingInstOffset = 0;
        custOrderHandlingInstLength = length;
        return this;
    }

    private int orderHandlingInstSource;

    private boolean hasOrderHandlingInstSource;

    public boolean hasOrderHandlingInstSource()
    {
        return hasOrderHandlingInstSource;
    }

    public OrderCancelReplaceRequestEncoder orderHandlingInstSource(int value)
    {
        orderHandlingInstSource = value;
        hasOrderHandlingInstSource = true;
        return this;
    }

    public int orderHandlingInstSource()
    {
        return orderHandlingInstSource;
    }

    public OrderCancelReplaceRequestEncoder orderHandlingInstSource(OrderHandlingInstSource value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == OrderHandlingInstSource.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: orderHandlingInstSource Value: " + value );
            }
            if (value == OrderHandlingInstSource.NULL_VAL)
            {
                return this;
            }
        }
        return orderHandlingInstSource(value.representation());
    }

    private final TrdRegTimestampsEncoder trdRegTimestamps = new TrdRegTimestampsEncoder();
    public TrdRegTimestampsEncoder trdRegTimestamps()
    {
        return trdRegTimestamps;
    }

    public long encode(final MutableAsciiBuffer buffer, final int offset)
    {
        final long startMessageResult = header.startMessage(buffer, offset);
        final int bodyStart = Encoder.offset(startMessageResult);
        int position = bodyStart + Encoder.length(startMessageResult);

        if (orderIDLength > 0)
        {
            buffer.putBytes(position, orderIDHeader, 0, orderIDHeaderLength);
            position += orderIDHeaderLength;
            buffer.putBytes(position, orderID, orderIDOffset, orderIDLength);
            position += orderIDLength;
            buffer.putSeparator(position);
            position++;
        }

            position += parties.encode(buffer, position);

        if (tradeOriginationDateLength > 0)
        {
            buffer.putBytes(position, tradeOriginationDateHeader, 0, tradeOriginationDateHeaderLength);
            position += tradeOriginationDateHeaderLength;
            buffer.putBytes(position, tradeOriginationDate, tradeOriginationDateOffset, tradeOriginationDateLength);
            position += tradeOriginationDateLength;
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

        if (origClOrdIDLength > 0)
        {
            buffer.putBytes(position, origClOrdIDHeader, 0, origClOrdIDHeaderLength);
            position += origClOrdIDHeaderLength;
            buffer.putBytes(position, origClOrdID, origClOrdIDOffset, origClOrdIDLength);
            position += origClOrdIDLength;
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
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: ClOrdID");
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

        if (clOrdLinkIDLength > 0)
        {
            buffer.putBytes(position, clOrdLinkIDHeader, 0, clOrdLinkIDHeaderLength);
            position += clOrdLinkIDHeaderLength;
            buffer.putBytes(position, clOrdLinkID, clOrdLinkIDOffset, clOrdLinkIDLength);
            position += clOrdLinkIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (listIDLength > 0)
        {
            buffer.putBytes(position, listIDHeader, 0, listIDHeaderLength);
            position += listIDHeaderLength;
            buffer.putBytes(position, listID, listIDOffset, listIDLength);
            position += listIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (origOrdModTimeLength > 0)
        {
            buffer.putBytes(position, origOrdModTimeHeader, 0, origOrdModTimeHeaderLength);
            position += origOrdModTimeHeaderLength;
            buffer.putBytes(position, origOrdModTime, origOrdModTimeOffset, origOrdModTimeLength);
            position += origOrdModTimeLength;
            buffer.putSeparator(position);
            position++;
        }

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

        if (hasDayBookingInst)
        {
            buffer.putBytes(position, dayBookingInstHeader, 0, dayBookingInstHeaderLength);
            position += dayBookingInstHeaderLength;
            position += buffer.putCharAscii(position, dayBookingInst);
            buffer.putSeparator(position);
            position++;
        }

        if (hasBookingUnit)
        {
            buffer.putBytes(position, bookingUnitHeader, 0, bookingUnitHeaderLength);
            position += bookingUnitHeaderLength;
            position += buffer.putCharAscii(position, bookingUnit);
            buffer.putSeparator(position);
            position++;
        }

        if (hasPreallocMethod)
        {
            buffer.putBytes(position, preallocMethodHeader, 0, preallocMethodHeaderLength);
            position += preallocMethodHeaderLength;
            position += buffer.putCharAscii(position, preallocMethod);
            buffer.putSeparator(position);
            position++;
        }

        if (allocIDLength > 0)
        {
            buffer.putBytes(position, allocIDHeader, 0, allocIDHeaderLength);
            position += allocIDHeaderLength;
            buffer.putBytes(position, allocID, allocIDOffset, allocIDLength);
            position += allocIDLength;
            buffer.putSeparator(position);
            position++;
        }

            position += preAllocGrp.encode(buffer, position);

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

        if (hasCashMargin)
        {
            buffer.putBytes(position, cashMarginHeader, 0, cashMarginHeaderLength);
            position += cashMarginHeaderLength;
            position += buffer.putCharAscii(position, cashMargin);
            buffer.putSeparator(position);
            position++;
        }

        if (clearingFeeIndicatorLength > 0)
        {
            buffer.putBytes(position, clearingFeeIndicatorHeader, 0, clearingFeeIndicatorHeaderLength);
            position += clearingFeeIndicatorHeaderLength;
            buffer.putBytes(position, clearingFeeIndicator, clearingFeeIndicatorOffset, clearingFeeIndicatorLength);
            position += clearingFeeIndicatorLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasHandlInst)
        {
            buffer.putBytes(position, handlInstHeader, 0, handlInstHeaderLength);
            position += handlInstHeaderLength;
            position += buffer.putCharAscii(position, handlInst);
            buffer.putSeparator(position);
            position++;
        }

        if (execInstLength > 0)
        {
            buffer.putBytes(position, execInstHeader, 0, execInstHeaderLength);
            position += execInstHeaderLength;
            buffer.putBytes(position, execInst, execInstOffset, execInstLength);
            position += execInstLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasMinQty)
        {
            buffer.putBytes(position, minQtyHeader, 0, minQtyHeaderLength);
            position += minQtyHeaderLength;
            position += buffer.putFloatAscii(position, minQty);
            buffer.putSeparator(position);
            position++;
        }

        if (hasMatchIncrement)
        {
            buffer.putBytes(position, matchIncrementHeader, 0, matchIncrementHeaderLength);
            position += matchIncrementHeaderLength;
            position += buffer.putFloatAscii(position, matchIncrement);
            buffer.putSeparator(position);
            position++;
        }

        if (hasMaxPriceLevels)
        {
            buffer.putBytes(position, maxPriceLevelsHeader, 0, maxPriceLevelsHeaderLength);
            position += maxPriceLevelsHeaderLength;
            position += buffer.putIntAscii(position, maxPriceLevels);
            buffer.putSeparator(position);
            position++;
        }

            position += displayInstruction.encode(buffer, position);

        if (hasMaxFloor)
        {
            buffer.putBytes(position, maxFloorHeader, 0, maxFloorHeaderLength);
            position += maxFloorHeaderLength;
            position += buffer.putFloatAscii(position, maxFloor);
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

            position += trdgSesGrp.encode(buffer, position);

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
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: Side");
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

        if (hasQtyType)
        {
            buffer.putBytes(position, qtyTypeHeader, 0, qtyTypeHeaderLength);
            position += qtyTypeHeaderLength;
            position += buffer.putIntAscii(position, qtyType);
            buffer.putSeparator(position);
            position++;
        }

            position += orderQtyData.encode(buffer, position);

        if (hasOrdType)
        {
            buffer.putBytes(position, ordTypeHeader, 0, ordTypeHeaderLength);
            position += ordTypeHeaderLength;
            position += buffer.putCharAscii(position, ordType);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: OrdType");
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

        if (hasPriceProtectionScope)
        {
            buffer.putBytes(position, priceProtectionScopeHeader, 0, priceProtectionScopeHeaderLength);
            position += priceProtectionScopeHeaderLength;
            position += buffer.putCharAscii(position, priceProtectionScope);
            buffer.putSeparator(position);
            position++;
        }

        if (hasStopPx)
        {
            buffer.putBytes(position, stopPxHeader, 0, stopPxHeaderLength);
            position += stopPxHeaderLength;
            position += buffer.putFloatAscii(position, stopPx);
            buffer.putSeparator(position);
            position++;
        }

            position += triggeringInstruction.encode(buffer, position);

            position += spreadOrBenchmarkCurveData.encode(buffer, position);

            position += yieldData.encode(buffer, position);

            position += pegInstructions.encode(buffer, position);

            position += discretionInstructions.encode(buffer, position);

        if (hasTargetStrategy)
        {
            buffer.putBytes(position, targetStrategyHeader, 0, targetStrategyHeaderLength);
            position += targetStrategyHeaderLength;
            position += buffer.putIntAscii(position, targetStrategy);
            buffer.putSeparator(position);
            position++;
        }

            position += strategyParametersGrp.encode(buffer, position);

        if (targetStrategyParametersLength > 0)
        {
            buffer.putBytes(position, targetStrategyParametersHeader, 0, targetStrategyParametersHeaderLength);
            position += targetStrategyParametersHeaderLength;
            buffer.putBytes(position, targetStrategyParameters, targetStrategyParametersOffset, targetStrategyParametersLength);
            position += targetStrategyParametersLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasParticipationRate)
        {
            buffer.putBytes(position, participationRateHeader, 0, participationRateHeaderLength);
            position += participationRateHeaderLength;
            position += buffer.putFloatAscii(position, participationRate);
            buffer.putSeparator(position);
            position++;
        }

        if (complianceIDLength > 0)
        {
            buffer.putBytes(position, complianceIDHeader, 0, complianceIDHeaderLength);
            position += complianceIDHeaderLength;
            buffer.putBytes(position, complianceID, complianceIDOffset, complianceIDLength);
            position += complianceIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasSolicitedFlag)
        {
            buffer.putBytes(position, solicitedFlagHeader, 0, solicitedFlagHeaderLength);
            position += solicitedFlagHeaderLength;
            position += buffer.putBooleanAscii(position, solicitedFlag);
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

        if (hasTimeInForce)
        {
            buffer.putBytes(position, timeInForceHeader, 0, timeInForceHeaderLength);
            position += timeInForceHeaderLength;
            position += buffer.putCharAscii(position, timeInForce);
            buffer.putSeparator(position);
            position++;
        }

        if (effectiveTimeLength > 0)
        {
            buffer.putBytes(position, effectiveTimeHeader, 0, effectiveTimeHeaderLength);
            position += effectiveTimeHeaderLength;
            buffer.putBytes(position, effectiveTime, effectiveTimeOffset, effectiveTimeLength);
            position += effectiveTimeLength;
            buffer.putSeparator(position);
            position++;
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

        if (expireTimeLength > 0)
        {
            buffer.putBytes(position, expireTimeHeader, 0, expireTimeHeaderLength);
            position += expireTimeHeaderLength;
            buffer.putBytes(position, expireTime, expireTimeOffset, expireTimeLength);
            position += expireTimeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasGTBookingInst)
        {
            buffer.putBytes(position, gTBookingInstHeader, 0, gTBookingInstHeaderLength);
            position += gTBookingInstHeaderLength;
            position += buffer.putIntAscii(position, gTBookingInst);
            buffer.putSeparator(position);
            position++;
        }

            position += commissionData.encode(buffer, position);

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

        if (hasPreTradeAnonymity)
        {
            buffer.putBytes(position, preTradeAnonymityHeader, 0, preTradeAnonymityHeaderLength);
            position += preTradeAnonymityHeaderLength;
            position += buffer.putBooleanAscii(position, preTradeAnonymity);
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

        if (hasForexReq)
        {
            buffer.putBytes(position, forexReqHeader, 0, forexReqHeaderLength);
            position += forexReqHeaderLength;
            position += buffer.putBooleanAscii(position, forexReq);
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

        if (hasBookingType)
        {
            buffer.putBytes(position, bookingTypeHeader, 0, bookingTypeHeaderLength);
            position += bookingTypeHeaderLength;
            position += buffer.putIntAscii(position, bookingType);
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

        if (hasPrice2)
        {
            buffer.putBytes(position, price2Header, 0, price2HeaderLength);
            position += price2HeaderLength;
            position += buffer.putFloatAscii(position, price2);
            buffer.putSeparator(position);
            position++;
        }

        if (hasPositionEffect)
        {
            buffer.putBytes(position, positionEffectHeader, 0, positionEffectHeaderLength);
            position += positionEffectHeaderLength;
            position += buffer.putCharAscii(position, positionEffect);
            buffer.putSeparator(position);
            position++;
        }

        if (hasCoveredOrUncovered)
        {
            buffer.putBytes(position, coveredOrUncoveredHeader, 0, coveredOrUncoveredHeaderLength);
            position += coveredOrUncoveredHeaderLength;
            position += buffer.putIntAscii(position, coveredOrUncovered);
            buffer.putSeparator(position);
            position++;
        }

        if (hasMaxShow)
        {
            buffer.putBytes(position, maxShowHeader, 0, maxShowHeaderLength);
            position += maxShowHeaderLength;
            position += buffer.putFloatAscii(position, maxShow);
            buffer.putSeparator(position);
            position++;
        }

        if (hasLocateReqd)
        {
            buffer.putBytes(position, locateReqdHeader, 0, locateReqdHeaderLength);
            position += locateReqdHeaderLength;
            position += buffer.putBooleanAscii(position, locateReqd);
            buffer.putSeparator(position);
            position++;
        }

        if (hasCancellationRights)
        {
            buffer.putBytes(position, cancellationRightsHeader, 0, cancellationRightsHeaderLength);
            position += cancellationRightsHeaderLength;
            position += buffer.putCharAscii(position, cancellationRights);
            buffer.putSeparator(position);
            position++;
        }

        if (hasMoneyLaunderingStatus)
        {
            buffer.putBytes(position, moneyLaunderingStatusHeader, 0, moneyLaunderingStatusHeaderLength);
            position += moneyLaunderingStatusHeaderLength;
            position += buffer.putCharAscii(position, moneyLaunderingStatus);
            buffer.putSeparator(position);
            position++;
        }

        if (registIDLength > 0)
        {
            buffer.putBytes(position, registIDHeader, 0, registIDHeaderLength);
            position += registIDHeaderLength;
            buffer.putBytes(position, registID, registIDOffset, registIDLength);
            position += registIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (designationLength > 0)
        {
            buffer.putBytes(position, designationHeader, 0, designationHeaderLength);
            position += designationHeaderLength;
            buffer.putBytes(position, designation, designationOffset, designationLength);
            position += designationLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasManualOrderIndicator)
        {
            buffer.putBytes(position, manualOrderIndicatorHeader, 0, manualOrderIndicatorHeaderLength);
            position += manualOrderIndicatorHeaderLength;
            position += buffer.putBooleanAscii(position, manualOrderIndicator);
            buffer.putSeparator(position);
            position++;
        }

        if (hasCustDirectedOrder)
        {
            buffer.putBytes(position, custDirectedOrderHeader, 0, custDirectedOrderHeaderLength);
            position += custDirectedOrderHeaderLength;
            position += buffer.putBooleanAscii(position, custDirectedOrder);
            buffer.putSeparator(position);
            position++;
        }

        if (receivedDeptIDLength > 0)
        {
            buffer.putBytes(position, receivedDeptIDHeader, 0, receivedDeptIDHeaderLength);
            position += receivedDeptIDHeaderLength;
            buffer.putBytes(position, receivedDeptID, receivedDeptIDOffset, receivedDeptIDLength);
            position += receivedDeptIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (custOrderHandlingInstLength > 0)
        {
            buffer.putBytes(position, custOrderHandlingInstHeader, 0, custOrderHandlingInstHeaderLength);
            position += custOrderHandlingInstHeaderLength;
            buffer.putBytes(position, custOrderHandlingInst, custOrderHandlingInstOffset, custOrderHandlingInstLength);
            position += custOrderHandlingInstLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasOrderHandlingInstSource)
        {
            buffer.putBytes(position, orderHandlingInstSourceHeader, 0, orderHandlingInstSourceHeaderLength);
            position += orderHandlingInstSourceHeaderLength;
            position += buffer.putIntAscii(position, orderHandlingInstSource);
            buffer.putSeparator(position);
            position++;
        }

            position += trdRegTimestamps.encode(buffer, position);
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
        this.resetOrderID();
        this.resetTradeOriginationDate();
        this.resetTradeDate();
        this.resetOrigClOrdID();
        this.resetClOrdID();
        this.resetSecondaryClOrdID();
        this.resetClOrdLinkID();
        this.resetListID();
        this.resetOrigOrdModTime();
        this.resetAccount();
        this.resetAcctIDSource();
        this.resetAccountType();
        this.resetDayBookingInst();
        this.resetBookingUnit();
        this.resetPreallocMethod();
        this.resetAllocID();
        this.resetSettlType();
        this.resetSettlDate();
        this.resetCashMargin();
        this.resetClearingFeeIndicator();
        this.resetHandlInst();
        this.resetExecInst();
        this.resetMinQty();
        this.resetMatchIncrement();
        this.resetMaxPriceLevels();
        this.resetMaxFloor();
        this.resetExDestination();
        this.resetExDestinationIDSource();
        this.resetSide();
        this.resetTransactTime();
        this.resetQtyType();
        this.resetOrdType();
        this.resetPriceType();
        this.resetPrice();
        this.resetPriceProtectionScope();
        this.resetStopPx();
        this.resetTargetStrategy();
        this.resetTargetStrategyParameters();
        this.resetParticipationRate();
        this.resetComplianceID();
        this.resetSolicitedFlag();
        this.resetCurrency();
        this.resetTimeInForce();
        this.resetEffectiveTime();
        this.resetExpireDate();
        this.resetExpireTime();
        this.resetGTBookingInst();
        this.resetOrderCapacity();
        this.resetOrderRestrictions();
        this.resetPreTradeAnonymity();
        this.resetCustOrderCapacity();
        this.resetForexReq();
        this.resetSettlCurrency();
        this.resetBookingType();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        this.resetSettlDate2();
        this.resetOrderQty2();
        this.resetPrice2();
        this.resetPositionEffect();
        this.resetCoveredOrUncovered();
        this.resetMaxShow();
        this.resetLocateReqd();
        this.resetCancellationRights();
        this.resetMoneyLaunderingStatus();
        this.resetRegistID();
        this.resetDesignation();
        this.resetManualOrderIndicator();
        this.resetCustDirectedOrder();
        this.resetReceivedDeptID();
        this.resetCustOrderHandlingInst();
        this.resetOrderHandlingInstSource();
        parties.reset();
        preAllocGrp.reset();
        displayInstruction.reset();
        trdgSesGrp.reset();
        instrument.reset();
        financingDetails.reset();
        undInstrmtGrp.reset();
        orderQtyData.reset();
        triggeringInstruction.reset();
        spreadOrBenchmarkCurveData.reset();
        yieldData.reset();
        pegInstructions.reset();
        discretionInstructions.reset();
        strategyParametersGrp.reset();
        commissionData.reset();
        trdRegTimestamps.reset();
    }

    public void resetOrderID()
    {
        orderIDLength = 0;
    }

    public void resetTradeOriginationDate()
    {
        tradeOriginationDateLength = 0;
    }

    public void resetTradeDate()
    {
        tradeDateLength = 0;
    }

    public void resetOrigClOrdID()
    {
        origClOrdIDLength = 0;
    }

    public void resetClOrdID()
    {
        clOrdIDLength = 0;
    }

    public void resetSecondaryClOrdID()
    {
        secondaryClOrdIDLength = 0;
    }

    public void resetClOrdLinkID()
    {
        clOrdLinkIDLength = 0;
    }

    public void resetListID()
    {
        listIDLength = 0;
    }

    public void resetOrigOrdModTime()
    {
        origOrdModTimeLength = 0;
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

    public void resetDayBookingInst()
    {
        hasDayBookingInst = false;
    }

    public void resetBookingUnit()
    {
        hasBookingUnit = false;
    }

    public void resetPreallocMethod()
    {
        hasPreallocMethod = false;
    }

    public void resetAllocID()
    {
        allocIDLength = 0;
    }

    public void resetSettlType()
    {
        settlTypeLength = 0;
    }

    public void resetSettlDate()
    {
        settlDateLength = 0;
    }

    public void resetCashMargin()
    {
        hasCashMargin = false;
    }

    public void resetClearingFeeIndicator()
    {
        clearingFeeIndicatorLength = 0;
    }

    public void resetHandlInst()
    {
        hasHandlInst = false;
    }

    public void resetExecInst()
    {
        execInstLength = 0;
    }

    public void resetMinQty()
    {
        hasMinQty = false;
    }

    public void resetMatchIncrement()
    {
        hasMatchIncrement = false;
    }

    public void resetMaxPriceLevels()
    {
        hasMaxPriceLevels = false;
    }

    public void resetMaxFloor()
    {
        hasMaxFloor = false;
    }

    public void resetExDestination()
    {
        exDestinationLength = 0;
    }

    public void resetExDestinationIDSource()
    {
        hasExDestinationIDSource = false;
    }

    public void resetSide()
    {
        side = MISSING_CHAR;
    }

    public void resetTransactTime()
    {
        transactTimeLength = 0;
    }

    public void resetQtyType()
    {
        hasQtyType = false;
    }

    public void resetOrdType()
    {
        ordType = MISSING_CHAR;
    }

    public void resetPriceType()
    {
        hasPriceType = false;
    }

    public void resetPrice()
    {
        hasPrice = false;
    }

    public void resetPriceProtectionScope()
    {
        hasPriceProtectionScope = false;
    }

    public void resetStopPx()
    {
        hasStopPx = false;
    }

    public void resetTargetStrategy()
    {
        hasTargetStrategy = false;
    }

    public void resetTargetStrategyParameters()
    {
        targetStrategyParametersLength = 0;
    }

    public void resetParticipationRate()
    {
        hasParticipationRate = false;
    }

    public void resetComplianceID()
    {
        complianceIDLength = 0;
    }

    public void resetSolicitedFlag()
    {
        hasSolicitedFlag = false;
    }

    public void resetCurrency()
    {
        currencyLength = 0;
    }

    public void resetTimeInForce()
    {
        hasTimeInForce = false;
    }

    public void resetEffectiveTime()
    {
        effectiveTimeLength = 0;
    }

    public void resetExpireDate()
    {
        expireDateLength = 0;
    }

    public void resetExpireTime()
    {
        expireTimeLength = 0;
    }

    public void resetGTBookingInst()
    {
        hasGTBookingInst = false;
    }

    public void resetOrderCapacity()
    {
        hasOrderCapacity = false;
    }

    public void resetOrderRestrictions()
    {
        orderRestrictionsLength = 0;
    }

    public void resetPreTradeAnonymity()
    {
        hasPreTradeAnonymity = false;
    }

    public void resetCustOrderCapacity()
    {
        hasCustOrderCapacity = false;
    }

    public void resetForexReq()
    {
        hasForexReq = false;
    }

    public void resetSettlCurrency()
    {
        settlCurrencyLength = 0;
    }

    public void resetBookingType()
    {
        hasBookingType = false;
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

    public void resetSettlDate2()
    {
        settlDate2Length = 0;
    }

    public void resetOrderQty2()
    {
        hasOrderQty2 = false;
    }

    public void resetPrice2()
    {
        hasPrice2 = false;
    }

    public void resetPositionEffect()
    {
        hasPositionEffect = false;
    }

    public void resetCoveredOrUncovered()
    {
        hasCoveredOrUncovered = false;
    }

    public void resetMaxShow()
    {
        hasMaxShow = false;
    }

    public void resetLocateReqd()
    {
        hasLocateReqd = false;
    }

    public void resetCancellationRights()
    {
        hasCancellationRights = false;
    }

    public void resetMoneyLaunderingStatus()
    {
        hasMoneyLaunderingStatus = false;
    }

    public void resetRegistID()
    {
        registIDLength = 0;
    }

    public void resetDesignation()
    {
        designationLength = 0;
    }

    public void resetManualOrderIndicator()
    {
        hasManualOrderIndicator = false;
    }

    public void resetCustDirectedOrder()
    {
        hasCustDirectedOrder = false;
    }

    public void resetReceivedDeptID()
    {
        receivedDeptIDLength = 0;
    }

    public void resetCustOrderHandlingInst()
    {
        custOrderHandlingInstLength = 0;
    }

    public void resetOrderHandlingInstSource()
    {
        hasOrderHandlingInstSource = false;
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
        builder.append("\"MessageName\": \"OrderCancelReplaceRequest\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasOrderID())
        {
            indent(builder, level);
            builder.append("\"OrderID\": \"");
            appendBuffer(builder, orderID, orderIDOffset, orderIDLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"Parties\": ");
    parties.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasTradeOriginationDate())
        {
            indent(builder, level);
            builder.append("\"TradeOriginationDate\": \"");
            appendBuffer(builder, tradeOriginationDate, tradeOriginationDateOffset, tradeOriginationDateLength);
            builder.append("\",\n");
        }

        if (hasTradeDate())
        {
            indent(builder, level);
            builder.append("\"TradeDate\": \"");
            appendBuffer(builder, tradeDate, tradeDateOffset, tradeDateLength);
            builder.append("\",\n");
        }

        if (hasOrigClOrdID())
        {
            indent(builder, level);
            builder.append("\"OrigClOrdID\": \"");
            appendBuffer(builder, origClOrdID, origClOrdIDOffset, origClOrdIDLength);
            builder.append("\",\n");
        }

        if (hasClOrdID())
        {
            indent(builder, level);
            builder.append("\"ClOrdID\": \"");
            appendBuffer(builder, clOrdID, clOrdIDOffset, clOrdIDLength);
            builder.append("\",\n");
        }

        if (hasSecondaryClOrdID())
        {
            indent(builder, level);
            builder.append("\"SecondaryClOrdID\": \"");
            appendBuffer(builder, secondaryClOrdID, secondaryClOrdIDOffset, secondaryClOrdIDLength);
            builder.append("\",\n");
        }

        if (hasClOrdLinkID())
        {
            indent(builder, level);
            builder.append("\"ClOrdLinkID\": \"");
            appendBuffer(builder, clOrdLinkID, clOrdLinkIDOffset, clOrdLinkIDLength);
            builder.append("\",\n");
        }

        if (hasListID())
        {
            indent(builder, level);
            builder.append("\"ListID\": \"");
            appendBuffer(builder, listID, listIDOffset, listIDLength);
            builder.append("\",\n");
        }

        if (hasOrigOrdModTime())
        {
            indent(builder, level);
            builder.append("\"OrigOrdModTime\": \"");
            appendBuffer(builder, origOrdModTime, origOrdModTimeOffset, origOrdModTimeLength);
            builder.append("\",\n");
        }

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

        if (hasDayBookingInst())
        {
            indent(builder, level);
            builder.append("\"DayBookingInst\": \"");
            builder.append(dayBookingInst);
            builder.append("\",\n");
        }

        if (hasBookingUnit())
        {
            indent(builder, level);
            builder.append("\"BookingUnit\": \"");
            builder.append(bookingUnit);
            builder.append("\",\n");
        }

        if (hasPreallocMethod())
        {
            indent(builder, level);
            builder.append("\"PreallocMethod\": \"");
            builder.append(preallocMethod);
            builder.append("\",\n");
        }

        if (hasAllocID())
        {
            indent(builder, level);
            builder.append("\"AllocID\": \"");
            appendBuffer(builder, allocID, allocIDOffset, allocIDLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"PreAllocGrp\": ");
    preAllocGrp.appendTo(builder, level + 1);
    builder.append("\n");

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

        if (hasCashMargin())
        {
            indent(builder, level);
            builder.append("\"CashMargin\": \"");
            builder.append(cashMargin);
            builder.append("\",\n");
        }

        if (hasClearingFeeIndicator())
        {
            indent(builder, level);
            builder.append("\"ClearingFeeIndicator\": \"");
            appendBuffer(builder, clearingFeeIndicator, clearingFeeIndicatorOffset, clearingFeeIndicatorLength);
            builder.append("\",\n");
        }

        if (hasHandlInst())
        {
            indent(builder, level);
            builder.append("\"HandlInst\": \"");
            builder.append(handlInst);
            builder.append("\",\n");
        }

        if (hasExecInst())
        {
            indent(builder, level);
            builder.append("\"ExecInst\": \"");
            appendBuffer(builder, execInst, execInstOffset, execInstLength);
            builder.append("\",\n");
        }

        if (hasMinQty())
        {
            indent(builder, level);
            builder.append("\"MinQty\": \"");
            minQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasMatchIncrement())
        {
            indent(builder, level);
            builder.append("\"MatchIncrement\": \"");
            matchIncrement.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasMaxPriceLevels())
        {
            indent(builder, level);
            builder.append("\"MaxPriceLevels\": \"");
            builder.append(maxPriceLevels);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"DisplayInstruction\": ");
    displayInstruction.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasMaxFloor())
        {
            indent(builder, level);
            builder.append("\"MaxFloor\": \"");
            maxFloor.appendTo(builder);
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

    indent(builder, level);
    builder.append("\"TrdgSesGrp\": ");
    trdgSesGrp.appendTo(builder, level + 1);
    builder.append("\n");

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

        if (hasTransactTime())
        {
            indent(builder, level);
            builder.append("\"TransactTime\": \"");
            appendBuffer(builder, transactTime, transactTimeOffset, transactTimeLength);
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

        if (hasOrdType())
        {
            indent(builder, level);
            builder.append("\"OrdType\": \"");
            builder.append(ordType);
            builder.append("\",\n");
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

        if (hasPriceProtectionScope())
        {
            indent(builder, level);
            builder.append("\"PriceProtectionScope\": \"");
            builder.append(priceProtectionScope);
            builder.append("\",\n");
        }

        if (hasStopPx())
        {
            indent(builder, level);
            builder.append("\"StopPx\": \"");
            stopPx.appendTo(builder);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"TriggeringInstruction\": ");
    triggeringInstruction.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"SpreadOrBenchmarkCurveData\": ");
    spreadOrBenchmarkCurveData.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"YieldData\": ");
    yieldData.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"PegInstructions\": ");
    pegInstructions.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"DiscretionInstructions\": ");
    discretionInstructions.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasTargetStrategy())
        {
            indent(builder, level);
            builder.append("\"TargetStrategy\": \"");
            builder.append(targetStrategy);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"StrategyParametersGrp\": ");
    strategyParametersGrp.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasTargetStrategyParameters())
        {
            indent(builder, level);
            builder.append("\"TargetStrategyParameters\": \"");
            appendBuffer(builder, targetStrategyParameters, targetStrategyParametersOffset, targetStrategyParametersLength);
            builder.append("\",\n");
        }

        if (hasParticipationRate())
        {
            indent(builder, level);
            builder.append("\"ParticipationRate\": \"");
            participationRate.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasComplianceID())
        {
            indent(builder, level);
            builder.append("\"ComplianceID\": \"");
            appendBuffer(builder, complianceID, complianceIDOffset, complianceIDLength);
            builder.append("\",\n");
        }

        if (hasSolicitedFlag())
        {
            indent(builder, level);
            builder.append("\"SolicitedFlag\": \"");
            builder.append(solicitedFlag);
            builder.append("\",\n");
        }

        if (hasCurrency())
        {
            indent(builder, level);
            builder.append("\"Currency\": \"");
            appendBuffer(builder, currency, currencyOffset, currencyLength);
            builder.append("\",\n");
        }

        if (hasTimeInForce())
        {
            indent(builder, level);
            builder.append("\"TimeInForce\": \"");
            builder.append(timeInForce);
            builder.append("\",\n");
        }

        if (hasEffectiveTime())
        {
            indent(builder, level);
            builder.append("\"EffectiveTime\": \"");
            appendBuffer(builder, effectiveTime, effectiveTimeOffset, effectiveTimeLength);
            builder.append("\",\n");
        }

        if (hasExpireDate())
        {
            indent(builder, level);
            builder.append("\"ExpireDate\": \"");
            appendBuffer(builder, expireDate, expireDateOffset, expireDateLength);
            builder.append("\",\n");
        }

        if (hasExpireTime())
        {
            indent(builder, level);
            builder.append("\"ExpireTime\": \"");
            appendBuffer(builder, expireTime, expireTimeOffset, expireTimeLength);
            builder.append("\",\n");
        }

        if (hasGTBookingInst())
        {
            indent(builder, level);
            builder.append("\"GTBookingInst\": \"");
            builder.append(gTBookingInst);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"CommissionData\": ");
    commissionData.appendTo(builder, level + 1);
    builder.append("\n");

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

        if (hasPreTradeAnonymity())
        {
            indent(builder, level);
            builder.append("\"PreTradeAnonymity\": \"");
            builder.append(preTradeAnonymity);
            builder.append("\",\n");
        }

        if (hasCustOrderCapacity())
        {
            indent(builder, level);
            builder.append("\"CustOrderCapacity\": \"");
            builder.append(custOrderCapacity);
            builder.append("\",\n");
        }

        if (hasForexReq())
        {
            indent(builder, level);
            builder.append("\"ForexReq\": \"");
            builder.append(forexReq);
            builder.append("\",\n");
        }

        if (hasSettlCurrency())
        {
            indent(builder, level);
            builder.append("\"SettlCurrency\": \"");
            appendBuffer(builder, settlCurrency, settlCurrencyOffset, settlCurrencyLength);
            builder.append("\",\n");
        }

        if (hasBookingType())
        {
            indent(builder, level);
            builder.append("\"BookingType\": \"");
            builder.append(bookingType);
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

        if (hasPrice2())
        {
            indent(builder, level);
            builder.append("\"Price2\": \"");
            price2.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasPositionEffect())
        {
            indent(builder, level);
            builder.append("\"PositionEffect\": \"");
            builder.append(positionEffect);
            builder.append("\",\n");
        }

        if (hasCoveredOrUncovered())
        {
            indent(builder, level);
            builder.append("\"CoveredOrUncovered\": \"");
            builder.append(coveredOrUncovered);
            builder.append("\",\n");
        }

        if (hasMaxShow())
        {
            indent(builder, level);
            builder.append("\"MaxShow\": \"");
            maxShow.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasLocateReqd())
        {
            indent(builder, level);
            builder.append("\"LocateReqd\": \"");
            builder.append(locateReqd);
            builder.append("\",\n");
        }

        if (hasCancellationRights())
        {
            indent(builder, level);
            builder.append("\"CancellationRights\": \"");
            builder.append(cancellationRights);
            builder.append("\",\n");
        }

        if (hasMoneyLaunderingStatus())
        {
            indent(builder, level);
            builder.append("\"MoneyLaunderingStatus\": \"");
            builder.append(moneyLaunderingStatus);
            builder.append("\",\n");
        }

        if (hasRegistID())
        {
            indent(builder, level);
            builder.append("\"RegistID\": \"");
            appendBuffer(builder, registID, registIDOffset, registIDLength);
            builder.append("\",\n");
        }

        if (hasDesignation())
        {
            indent(builder, level);
            builder.append("\"Designation\": \"");
            appendBuffer(builder, designation, designationOffset, designationLength);
            builder.append("\",\n");
        }

        if (hasManualOrderIndicator())
        {
            indent(builder, level);
            builder.append("\"ManualOrderIndicator\": \"");
            builder.append(manualOrderIndicator);
            builder.append("\",\n");
        }

        if (hasCustDirectedOrder())
        {
            indent(builder, level);
            builder.append("\"CustDirectedOrder\": \"");
            builder.append(custDirectedOrder);
            builder.append("\",\n");
        }

        if (hasReceivedDeptID())
        {
            indent(builder, level);
            builder.append("\"ReceivedDeptID\": \"");
            appendBuffer(builder, receivedDeptID, receivedDeptIDOffset, receivedDeptIDLength);
            builder.append("\",\n");
        }

        if (hasCustOrderHandlingInst())
        {
            indent(builder, level);
            builder.append("\"CustOrderHandlingInst\": \"");
            appendBuffer(builder, custOrderHandlingInst, custOrderHandlingInstOffset, custOrderHandlingInstLength);
            builder.append("\",\n");
        }

        if (hasOrderHandlingInstSource())
        {
            indent(builder, level);
            builder.append("\"OrderHandlingInstSource\": \"");
            builder.append(orderHandlingInstSource);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"TrdRegTimestamps\": ");
    trdRegTimestamps.appendTo(builder, level + 1);
    builder.append("\n");
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public OrderCancelReplaceRequestEncoder copyTo(final Encoder encoder)
    {
        return copyTo((OrderCancelReplaceRequestEncoder)encoder);
    }

    public OrderCancelReplaceRequestEncoder copyTo(final OrderCancelReplaceRequestEncoder encoder)
    {
        encoder.reset();
        if (hasOrderID())
        {
            encoder.orderIDAsCopy(orderID.byteArray(), 0, orderIDLength);
        }


        parties.copyTo(encoder.parties());
        if (hasTradeOriginationDate())
        {
            encoder.tradeOriginationDateAsCopy(tradeOriginationDate.byteArray(), 0, tradeOriginationDateLength);
        }

        if (hasTradeDate())
        {
            encoder.tradeDateAsCopy(tradeDate.byteArray(), 0, tradeDateLength);
        }

        if (hasOrigClOrdID())
        {
            encoder.origClOrdIDAsCopy(origClOrdID.byteArray(), 0, origClOrdIDLength);
        }

        if (hasClOrdID())
        {
            encoder.clOrdIDAsCopy(clOrdID.byteArray(), 0, clOrdIDLength);
        }

        if (hasSecondaryClOrdID())
        {
            encoder.secondaryClOrdIDAsCopy(secondaryClOrdID.byteArray(), 0, secondaryClOrdIDLength);
        }

        if (hasClOrdLinkID())
        {
            encoder.clOrdLinkIDAsCopy(clOrdLinkID.byteArray(), 0, clOrdLinkIDLength);
        }

        if (hasListID())
        {
            encoder.listIDAsCopy(listID.byteArray(), 0, listIDLength);
        }

        if (hasOrigOrdModTime())
        {
            encoder.origOrdModTimeAsCopy(origOrdModTime.byteArray(), 0, origOrdModTimeLength);
        }

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

        if (hasDayBookingInst())
        {
            encoder.dayBookingInst(this.dayBookingInst());
        }

        if (hasBookingUnit())
        {
            encoder.bookingUnit(this.bookingUnit());
        }

        if (hasPreallocMethod())
        {
            encoder.preallocMethod(this.preallocMethod());
        }

        if (hasAllocID())
        {
            encoder.allocIDAsCopy(allocID.byteArray(), 0, allocIDLength);
        }


        preAllocGrp.copyTo(encoder.preAllocGrp());
        if (hasSettlType())
        {
            encoder.settlTypeAsCopy(settlType.byteArray(), 0, settlTypeLength);
        }

        if (hasSettlDate())
        {
            encoder.settlDateAsCopy(settlDate.byteArray(), 0, settlDateLength);
        }

        if (hasCashMargin())
        {
            encoder.cashMargin(this.cashMargin());
        }

        if (hasClearingFeeIndicator())
        {
            encoder.clearingFeeIndicatorAsCopy(clearingFeeIndicator.byteArray(), 0, clearingFeeIndicatorLength);
        }

        if (hasHandlInst())
        {
            encoder.handlInst(this.handlInst());
        }

        if (hasExecInst())
        {
            encoder.execInstAsCopy(execInst.byteArray(), 0, execInstLength);
        }

        if (hasMinQty())
        {
            encoder.minQty(this.minQty());
        }

        if (hasMatchIncrement())
        {
            encoder.matchIncrement(this.matchIncrement());
        }

        if (hasMaxPriceLevels())
        {
            encoder.maxPriceLevels(this.maxPriceLevels());
        }


        displayInstruction.copyTo(encoder.displayInstruction());
        if (hasMaxFloor())
        {
            encoder.maxFloor(this.maxFloor());
        }

        if (hasExDestination())
        {
            encoder.exDestinationAsCopy(exDestination.byteArray(), 0, exDestinationLength);
        }

        if (hasExDestinationIDSource())
        {
            encoder.exDestinationIDSource(this.exDestinationIDSource());
        }


        trdgSesGrp.copyTo(encoder.trdgSesGrp());

        instrument.copyTo(encoder.instrument());

        financingDetails.copyTo(encoder.financingDetails());

        undInstrmtGrp.copyTo(encoder.undInstrmtGrp());
        if (hasSide())
        {
            encoder.side(this.side());
        }

        if (hasTransactTime())
        {
            encoder.transactTimeAsCopy(transactTime.byteArray(), 0, transactTimeLength);
        }

        if (hasQtyType())
        {
            encoder.qtyType(this.qtyType());
        }


        orderQtyData.copyTo(encoder.orderQtyData());
        if (hasOrdType())
        {
            encoder.ordType(this.ordType());
        }

        if (hasPriceType())
        {
            encoder.priceType(this.priceType());
        }

        if (hasPrice())
        {
            encoder.price(this.price());
        }

        if (hasPriceProtectionScope())
        {
            encoder.priceProtectionScope(this.priceProtectionScope());
        }

        if (hasStopPx())
        {
            encoder.stopPx(this.stopPx());
        }


        triggeringInstruction.copyTo(encoder.triggeringInstruction());

        spreadOrBenchmarkCurveData.copyTo(encoder.spreadOrBenchmarkCurveData());

        yieldData.copyTo(encoder.yieldData());

        pegInstructions.copyTo(encoder.pegInstructions());

        discretionInstructions.copyTo(encoder.discretionInstructions());
        if (hasTargetStrategy())
        {
            encoder.targetStrategy(this.targetStrategy());
        }


        strategyParametersGrp.copyTo(encoder.strategyParametersGrp());
        if (hasTargetStrategyParameters())
        {
            encoder.targetStrategyParametersAsCopy(targetStrategyParameters.byteArray(), 0, targetStrategyParametersLength);
        }

        if (hasParticipationRate())
        {
            encoder.participationRate(this.participationRate());
        }

        if (hasComplianceID())
        {
            encoder.complianceIDAsCopy(complianceID.byteArray(), 0, complianceIDLength);
        }

        if (hasSolicitedFlag())
        {
            encoder.solicitedFlag(this.solicitedFlag());
        }

        if (hasCurrency())
        {
            encoder.currencyAsCopy(currency.byteArray(), 0, currencyLength);
        }

        if (hasTimeInForce())
        {
            encoder.timeInForce(this.timeInForce());
        }

        if (hasEffectiveTime())
        {
            encoder.effectiveTimeAsCopy(effectiveTime.byteArray(), 0, effectiveTimeLength);
        }

        if (hasExpireDate())
        {
            encoder.expireDateAsCopy(expireDate.byteArray(), 0, expireDateLength);
        }

        if (hasExpireTime())
        {
            encoder.expireTimeAsCopy(expireTime.byteArray(), 0, expireTimeLength);
        }

        if (hasGTBookingInst())
        {
            encoder.gTBookingInst(this.gTBookingInst());
        }


        commissionData.copyTo(encoder.commissionData());
        if (hasOrderCapacity())
        {
            encoder.orderCapacity(this.orderCapacity());
        }

        if (hasOrderRestrictions())
        {
            encoder.orderRestrictionsAsCopy(orderRestrictions.byteArray(), 0, orderRestrictionsLength);
        }

        if (hasPreTradeAnonymity())
        {
            encoder.preTradeAnonymity(this.preTradeAnonymity());
        }

        if (hasCustOrderCapacity())
        {
            encoder.custOrderCapacity(this.custOrderCapacity());
        }

        if (hasForexReq())
        {
            encoder.forexReq(this.forexReq());
        }

        if (hasSettlCurrency())
        {
            encoder.settlCurrencyAsCopy(settlCurrency.byteArray(), 0, settlCurrencyLength);
        }

        if (hasBookingType())
        {
            encoder.bookingType(this.bookingType());
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

        if (hasSettlDate2())
        {
            encoder.settlDate2AsCopy(settlDate2.byteArray(), 0, settlDate2Length);
        }

        if (hasOrderQty2())
        {
            encoder.orderQty2(this.orderQty2());
        }

        if (hasPrice2())
        {
            encoder.price2(this.price2());
        }

        if (hasPositionEffect())
        {
            encoder.positionEffect(this.positionEffect());
        }

        if (hasCoveredOrUncovered())
        {
            encoder.coveredOrUncovered(this.coveredOrUncovered());
        }

        if (hasMaxShow())
        {
            encoder.maxShow(this.maxShow());
        }

        if (hasLocateReqd())
        {
            encoder.locateReqd(this.locateReqd());
        }

        if (hasCancellationRights())
        {
            encoder.cancellationRights(this.cancellationRights());
        }

        if (hasMoneyLaunderingStatus())
        {
            encoder.moneyLaunderingStatus(this.moneyLaunderingStatus());
        }

        if (hasRegistID())
        {
            encoder.registIDAsCopy(registID.byteArray(), 0, registIDLength);
        }

        if (hasDesignation())
        {
            encoder.designationAsCopy(designation.byteArray(), 0, designationLength);
        }

        if (hasManualOrderIndicator())
        {
            encoder.manualOrderIndicator(this.manualOrderIndicator());
        }

        if (hasCustDirectedOrder())
        {
            encoder.custDirectedOrder(this.custDirectedOrder());
        }

        if (hasReceivedDeptID())
        {
            encoder.receivedDeptIDAsCopy(receivedDeptID.byteArray(), 0, receivedDeptIDLength);
        }

        if (hasCustOrderHandlingInst())
        {
            encoder.custOrderHandlingInstAsCopy(custOrderHandlingInst.byteArray(), 0, custOrderHandlingInstLength);
        }

        if (hasOrderHandlingInstSource())
        {
            encoder.orderHandlingInstSource(this.orderHandlingInstSource());
        }


        trdRegTimestamps.copyTo(encoder.trdRegTimestamps());        return encoder;
    }

}
