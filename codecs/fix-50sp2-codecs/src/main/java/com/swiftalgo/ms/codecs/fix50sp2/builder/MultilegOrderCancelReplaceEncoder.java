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


public class MultilegOrderCancelReplaceEncoder implements Encoder
{
    public long messageType()
    {
        return 17217L;
    }

    public MultilegOrderCancelReplaceEncoder()
    {
        header.msgType("AC");
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

    private static final int origClOrdIDHeaderLength = 3;
    private static final byte[] origClOrdIDHeader = new byte[] {52, 49, (byte) '='};

    private static final int clOrdIDHeaderLength = 3;
    private static final byte[] clOrdIDHeader = new byte[] {49, 49, (byte) '='};

    private static final int secondaryClOrdIDHeaderLength = 4;
    private static final byte[] secondaryClOrdIDHeader = new byte[] {53, 50, 54, (byte) '='};

    private static final int clOrdLinkIDHeaderLength = 4;
    private static final byte[] clOrdLinkIDHeader = new byte[] {53, 56, 51, (byte) '='};

    private static final int origOrdModTimeHeaderLength = 4;
    private static final byte[] origOrdModTimeHeader = new byte[] {53, 56, 54, (byte) '='};

    private static final int tradeOriginationDateHeaderLength = 4;
    private static final byte[] tradeOriginationDateHeader = new byte[] {50, 50, 57, (byte) '='};

    private static final int tradeDateHeaderLength = 3;
    private static final byte[] tradeDateHeader = new byte[] {55, 53, (byte) '='};

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

    private static final int processCodeHeaderLength = 3;
    private static final byte[] processCodeHeader = new byte[] {56, 49, (byte) '='};

    private static final int sideHeaderLength = 3;
    private static final byte[] sideHeader = new byte[] {53, 52, (byte) '='};

    private static final int prevClosePxHeaderLength = 4;
    private static final byte[] prevClosePxHeader = new byte[] {49, 52, 48, (byte) '='};

    private static final int swapPointsHeaderLength = 5;
    private static final byte[] swapPointsHeader = new byte[] {49, 48, 54, 57, (byte) '='};

    private static final int locateReqdHeaderLength = 4;
    private static final byte[] locateReqdHeader = new byte[] {49, 49, 52, (byte) '='};

    private static final int transactTimeHeaderLength = 3;
    private static final byte[] transactTimeHeader = new byte[] {54, 48, (byte) '='};

    private static final int qtyTypeHeaderLength = 4;
    private static final byte[] qtyTypeHeader = new byte[] {56, 53, 52, (byte) '='};

    private static final int ordTypeHeaderLength = 3;
    private static final byte[] ordTypeHeader = new byte[] {52, 48, (byte) '='};

    private static final int multilegModelHeaderLength = 5;
    private static final byte[] multilegModelHeader = new byte[] {49, 51, 55, 55, (byte) '='};

    private static final int multilegPriceMethodHeaderLength = 5;
    private static final byte[] multilegPriceMethodHeader = new byte[] {49, 51, 55, 56, (byte) '='};

    private static final int priceTypeHeaderLength = 4;
    private static final byte[] priceTypeHeader = new byte[] {52, 50, 51, (byte) '='};

    private static final int priceHeaderLength = 3;
    private static final byte[] priceHeader = new byte[] {52, 52, (byte) '='};

    private static final int priceProtectionScopeHeaderLength = 5;
    private static final byte[] priceProtectionScopeHeader = new byte[] {49, 48, 57, 50, (byte) '='};

    private static final int stopPxHeaderLength = 3;
    private static final byte[] stopPxHeader = new byte[] {57, 57, (byte) '='};

    private static final int currencyHeaderLength = 3;
    private static final byte[] currencyHeader = new byte[] {49, 53, (byte) '='};

    private static final int complianceIDHeaderLength = 4;
    private static final byte[] complianceIDHeader = new byte[] {51, 55, 54, (byte) '='};

    private static final int solicitedFlagHeaderLength = 4;
    private static final byte[] solicitedFlagHeader = new byte[] {51, 55, 55, (byte) '='};

    private static final int iOIIDHeaderLength = 3;
    private static final byte[] iOIIDHeader = new byte[] {50, 51, (byte) '='};

    private static final int quoteIDHeaderLength = 4;
    private static final byte[] quoteIDHeader = new byte[] {49, 49, 55, (byte) '='};

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

    private static final int positionEffectHeaderLength = 3;
    private static final byte[] positionEffectHeader = new byte[] {55, 55, (byte) '='};

    private static final int coveredOrUncoveredHeaderLength = 4;
    private static final byte[] coveredOrUncoveredHeader = new byte[] {50, 48, 51, (byte) '='};

    private static final int maxShowHeaderLength = 4;
    private static final byte[] maxShowHeader = new byte[] {50, 49, 48, (byte) '='};

    private static final int targetStrategyHeaderLength = 4;
    private static final byte[] targetStrategyHeader = new byte[] {56, 52, 55, (byte) '='};

    private static final int targetStrategyParametersHeaderLength = 4;
    private static final byte[] targetStrategyParametersHeader = new byte[] {56, 52, 56, (byte) '='};

    private static final int riskFreeRateHeaderLength = 5;
    private static final byte[] riskFreeRateHeader = new byte[] {49, 49, 57, 48, (byte) '='};

    private static final int participationRateHeaderLength = 4;
    private static final byte[] participationRateHeader = new byte[] {56, 52, 57, (byte) '='};

    private static final int cancellationRightsHeaderLength = 4;
    private static final byte[] cancellationRightsHeader = new byte[] {52, 56, 48, (byte) '='};

    private static final int moneyLaunderingStatusHeaderLength = 4;
    private static final byte[] moneyLaunderingStatusHeader = new byte[] {52, 56, 49, (byte) '='};

    private static final int registIDHeaderLength = 4;
    private static final byte[] registIDHeader = new byte[] {53, 49, 51, (byte) '='};

    private static final int designationHeaderLength = 4;
    private static final byte[] designationHeader = new byte[] {52, 57, 52, (byte) '='};

    private static final int multiLegRptTypeReqHeaderLength = 4;
    private static final byte[] multiLegRptTypeReqHeader = new byte[] {53, 54, 51, (byte) '='};

    private final MutableDirectBuffer orderID = new UnsafeBuffer();

    private int orderIDOffset = 0;

    private int orderIDLength = 0;

    public MultilegOrderCancelReplaceEncoder orderID(final DirectBuffer value, final int offset, final int length)
    {
        orderID.wrap(value);
        orderIDOffset = offset;
        orderIDLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder orderID(final DirectBuffer value, final int length)
    {
        return orderID(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder orderID(final DirectBuffer value)
    {
        return orderID(value, 0, value.capacity());
    }

    public MultilegOrderCancelReplaceEncoder orderID(final byte[] value, final int offset, final int length)
    {
        orderID.wrap(value);
        orderIDOffset = offset;
        orderIDLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder orderIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(orderID, value, offset, length);
        orderIDOffset = offset;
        orderIDLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder orderID(final byte[] value, final int length)
    {
        return orderID(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder orderID(final byte[] value)
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

    public MultilegOrderCancelReplaceEncoder orderID(final CharSequence value)
    {
        toBytes(value, orderID);
        orderIDOffset = 0;
        orderIDLength = value.length();
        return this;
    }

    public MultilegOrderCancelReplaceEncoder orderID(final AsciiSequenceView value)
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

    public MultilegOrderCancelReplaceEncoder orderID(final char[] value)
    {
        return orderID(value, 0, value.length);
    }

    public MultilegOrderCancelReplaceEncoder orderID(final char[] value, final int length)
    {
        return orderID(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder orderID(final char[] value, final int offset, final int length)
    {
        toBytes(value, orderID, offset, length);
        orderIDOffset = 0;
        orderIDLength = length;
        return this;
    }

    private final MutableDirectBuffer origClOrdID = new UnsafeBuffer();

    private int origClOrdIDOffset = 0;

    private int origClOrdIDLength = 0;

    public MultilegOrderCancelReplaceEncoder origClOrdID(final DirectBuffer value, final int offset, final int length)
    {
        origClOrdID.wrap(value);
        origClOrdIDOffset = offset;
        origClOrdIDLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder origClOrdID(final DirectBuffer value, final int length)
    {
        return origClOrdID(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder origClOrdID(final DirectBuffer value)
    {
        return origClOrdID(value, 0, value.capacity());
    }

    public MultilegOrderCancelReplaceEncoder origClOrdID(final byte[] value, final int offset, final int length)
    {
        origClOrdID.wrap(value);
        origClOrdIDOffset = offset;
        origClOrdIDLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder origClOrdIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(origClOrdID, value, offset, length);
        origClOrdIDOffset = offset;
        origClOrdIDLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder origClOrdID(final byte[] value, final int length)
    {
        return origClOrdID(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder origClOrdID(final byte[] value)
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

    public MultilegOrderCancelReplaceEncoder origClOrdID(final CharSequence value)
    {
        toBytes(value, origClOrdID);
        origClOrdIDOffset = 0;
        origClOrdIDLength = value.length();
        return this;
    }

    public MultilegOrderCancelReplaceEncoder origClOrdID(final AsciiSequenceView value)
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

    public MultilegOrderCancelReplaceEncoder origClOrdID(final char[] value)
    {
        return origClOrdID(value, 0, value.length);
    }

    public MultilegOrderCancelReplaceEncoder origClOrdID(final char[] value, final int length)
    {
        return origClOrdID(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder origClOrdID(final char[] value, final int offset, final int length)
    {
        toBytes(value, origClOrdID, offset, length);
        origClOrdIDOffset = 0;
        origClOrdIDLength = length;
        return this;
    }

    private final MutableDirectBuffer clOrdID = new UnsafeBuffer();

    private int clOrdIDOffset = 0;

    private int clOrdIDLength = 0;

    public MultilegOrderCancelReplaceEncoder clOrdID(final DirectBuffer value, final int offset, final int length)
    {
        clOrdID.wrap(value);
        clOrdIDOffset = offset;
        clOrdIDLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder clOrdID(final DirectBuffer value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder clOrdID(final DirectBuffer value)
    {
        return clOrdID(value, 0, value.capacity());
    }

    public MultilegOrderCancelReplaceEncoder clOrdID(final byte[] value, final int offset, final int length)
    {
        clOrdID.wrap(value);
        clOrdIDOffset = offset;
        clOrdIDLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder clOrdIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(clOrdID, value, offset, length);
        clOrdIDOffset = offset;
        clOrdIDLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder clOrdID(final byte[] value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder clOrdID(final byte[] value)
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

    public MultilegOrderCancelReplaceEncoder clOrdID(final CharSequence value)
    {
        toBytes(value, clOrdID);
        clOrdIDOffset = 0;
        clOrdIDLength = value.length();
        return this;
    }

    public MultilegOrderCancelReplaceEncoder clOrdID(final AsciiSequenceView value)
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

    public MultilegOrderCancelReplaceEncoder clOrdID(final char[] value)
    {
        return clOrdID(value, 0, value.length);
    }

    public MultilegOrderCancelReplaceEncoder clOrdID(final char[] value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder clOrdID(final char[] value, final int offset, final int length)
    {
        toBytes(value, clOrdID, offset, length);
        clOrdIDOffset = 0;
        clOrdIDLength = length;
        return this;
    }

    private final MutableDirectBuffer secondaryClOrdID = new UnsafeBuffer();

    private int secondaryClOrdIDOffset = 0;

    private int secondaryClOrdIDLength = 0;

    public MultilegOrderCancelReplaceEncoder secondaryClOrdID(final DirectBuffer value, final int offset, final int length)
    {
        secondaryClOrdID.wrap(value);
        secondaryClOrdIDOffset = offset;
        secondaryClOrdIDLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder secondaryClOrdID(final DirectBuffer value, final int length)
    {
        return secondaryClOrdID(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder secondaryClOrdID(final DirectBuffer value)
    {
        return secondaryClOrdID(value, 0, value.capacity());
    }

    public MultilegOrderCancelReplaceEncoder secondaryClOrdID(final byte[] value, final int offset, final int length)
    {
        secondaryClOrdID.wrap(value);
        secondaryClOrdIDOffset = offset;
        secondaryClOrdIDLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder secondaryClOrdIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(secondaryClOrdID, value, offset, length);
        secondaryClOrdIDOffset = offset;
        secondaryClOrdIDLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder secondaryClOrdID(final byte[] value, final int length)
    {
        return secondaryClOrdID(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder secondaryClOrdID(final byte[] value)
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

    public MultilegOrderCancelReplaceEncoder secondaryClOrdID(final CharSequence value)
    {
        toBytes(value, secondaryClOrdID);
        secondaryClOrdIDOffset = 0;
        secondaryClOrdIDLength = value.length();
        return this;
    }

    public MultilegOrderCancelReplaceEncoder secondaryClOrdID(final AsciiSequenceView value)
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

    public MultilegOrderCancelReplaceEncoder secondaryClOrdID(final char[] value)
    {
        return secondaryClOrdID(value, 0, value.length);
    }

    public MultilegOrderCancelReplaceEncoder secondaryClOrdID(final char[] value, final int length)
    {
        return secondaryClOrdID(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder secondaryClOrdID(final char[] value, final int offset, final int length)
    {
        toBytes(value, secondaryClOrdID, offset, length);
        secondaryClOrdIDOffset = 0;
        secondaryClOrdIDLength = length;
        return this;
    }

    private final MutableDirectBuffer clOrdLinkID = new UnsafeBuffer();

    private int clOrdLinkIDOffset = 0;

    private int clOrdLinkIDLength = 0;

    public MultilegOrderCancelReplaceEncoder clOrdLinkID(final DirectBuffer value, final int offset, final int length)
    {
        clOrdLinkID.wrap(value);
        clOrdLinkIDOffset = offset;
        clOrdLinkIDLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder clOrdLinkID(final DirectBuffer value, final int length)
    {
        return clOrdLinkID(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder clOrdLinkID(final DirectBuffer value)
    {
        return clOrdLinkID(value, 0, value.capacity());
    }

    public MultilegOrderCancelReplaceEncoder clOrdLinkID(final byte[] value, final int offset, final int length)
    {
        clOrdLinkID.wrap(value);
        clOrdLinkIDOffset = offset;
        clOrdLinkIDLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder clOrdLinkIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(clOrdLinkID, value, offset, length);
        clOrdLinkIDOffset = offset;
        clOrdLinkIDLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder clOrdLinkID(final byte[] value, final int length)
    {
        return clOrdLinkID(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder clOrdLinkID(final byte[] value)
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

    public MultilegOrderCancelReplaceEncoder clOrdLinkID(final CharSequence value)
    {
        toBytes(value, clOrdLinkID);
        clOrdLinkIDOffset = 0;
        clOrdLinkIDLength = value.length();
        return this;
    }

    public MultilegOrderCancelReplaceEncoder clOrdLinkID(final AsciiSequenceView value)
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

    public MultilegOrderCancelReplaceEncoder clOrdLinkID(final char[] value)
    {
        return clOrdLinkID(value, 0, value.length);
    }

    public MultilegOrderCancelReplaceEncoder clOrdLinkID(final char[] value, final int length)
    {
        return clOrdLinkID(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder clOrdLinkID(final char[] value, final int offset, final int length)
    {
        toBytes(value, clOrdLinkID, offset, length);
        clOrdLinkIDOffset = 0;
        clOrdLinkIDLength = length;
        return this;
    }

    private final MutableDirectBuffer origOrdModTime = new UnsafeBuffer();

    private int origOrdModTimeOffset = 0;

    private int origOrdModTimeLength = 0;

    public MultilegOrderCancelReplaceEncoder origOrdModTime(final DirectBuffer value, final int offset, final int length)
    {
        origOrdModTime.wrap(value);
        origOrdModTimeOffset = offset;
        origOrdModTimeLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder origOrdModTime(final DirectBuffer value, final int length)
    {
        return origOrdModTime(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder origOrdModTime(final DirectBuffer value)
    {
        return origOrdModTime(value, 0, value.capacity());
    }

    public MultilegOrderCancelReplaceEncoder origOrdModTime(final byte[] value, final int offset, final int length)
    {
        origOrdModTime.wrap(value);
        origOrdModTimeOffset = offset;
        origOrdModTimeLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder origOrdModTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(origOrdModTime, value, offset, length);
        origOrdModTimeOffset = offset;
        origOrdModTimeLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder origOrdModTime(final byte[] value, final int length)
    {
        return origOrdModTime(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder origOrdModTime(final byte[] value)
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

    private final PartiesEncoder parties = new PartiesEncoder();
    public PartiesEncoder parties()
    {
        return parties;
    }

    private final MutableDirectBuffer tradeOriginationDate = new UnsafeBuffer();

    private int tradeOriginationDateOffset = 0;

    private int tradeOriginationDateLength = 0;

    public MultilegOrderCancelReplaceEncoder tradeOriginationDate(final DirectBuffer value, final int offset, final int length)
    {
        tradeOriginationDate.wrap(value);
        tradeOriginationDateOffset = offset;
        tradeOriginationDateLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder tradeOriginationDate(final DirectBuffer value, final int length)
    {
        return tradeOriginationDate(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder tradeOriginationDate(final DirectBuffer value)
    {
        return tradeOriginationDate(value, 0, value.capacity());
    }

    public MultilegOrderCancelReplaceEncoder tradeOriginationDate(final byte[] value, final int offset, final int length)
    {
        tradeOriginationDate.wrap(value);
        tradeOriginationDateOffset = offset;
        tradeOriginationDateLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder tradeOriginationDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradeOriginationDate, value, offset, length);
        tradeOriginationDateOffset = offset;
        tradeOriginationDateLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder tradeOriginationDate(final byte[] value, final int length)
    {
        return tradeOriginationDate(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder tradeOriginationDate(final byte[] value)
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

    public MultilegOrderCancelReplaceEncoder tradeDate(final DirectBuffer value, final int offset, final int length)
    {
        tradeDate.wrap(value);
        tradeDateOffset = offset;
        tradeDateLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder tradeDate(final DirectBuffer value, final int length)
    {
        return tradeDate(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder tradeDate(final DirectBuffer value)
    {
        return tradeDate(value, 0, value.capacity());
    }

    public MultilegOrderCancelReplaceEncoder tradeDate(final byte[] value, final int offset, final int length)
    {
        tradeDate.wrap(value);
        tradeDateOffset = offset;
        tradeDateLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder tradeDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradeDate, value, offset, length);
        tradeDateOffset = offset;
        tradeDateLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder tradeDate(final byte[] value, final int length)
    {
        return tradeDate(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder tradeDate(final byte[] value)
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

    private final MutableDirectBuffer account = new UnsafeBuffer();

    private int accountOffset = 0;

    private int accountLength = 0;

    public MultilegOrderCancelReplaceEncoder account(final DirectBuffer value, final int offset, final int length)
    {
        account.wrap(value);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder account(final DirectBuffer value, final int length)
    {
        return account(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder account(final DirectBuffer value)
    {
        return account(value, 0, value.capacity());
    }

    public MultilegOrderCancelReplaceEncoder account(final byte[] value, final int offset, final int length)
    {
        account.wrap(value);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder accountAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(account, value, offset, length);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder account(final byte[] value, final int length)
    {
        return account(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder account(final byte[] value)
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

    public MultilegOrderCancelReplaceEncoder account(final CharSequence value)
    {
        toBytes(value, account);
        accountOffset = 0;
        accountLength = value.length();
        return this;
    }

    public MultilegOrderCancelReplaceEncoder account(final AsciiSequenceView value)
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

    public MultilegOrderCancelReplaceEncoder account(final char[] value)
    {
        return account(value, 0, value.length);
    }

    public MultilegOrderCancelReplaceEncoder account(final char[] value, final int length)
    {
        return account(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder account(final char[] value, final int offset, final int length)
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

    public MultilegOrderCancelReplaceEncoder acctIDSource(int value)
    {
        acctIDSource = value;
        hasAcctIDSource = true;
        return this;
    }

    public int acctIDSource()
    {
        return acctIDSource;
    }

    public MultilegOrderCancelReplaceEncoder acctIDSource(AcctIDSource value)
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

    public MultilegOrderCancelReplaceEncoder accountType(int value)
    {
        accountType = value;
        hasAccountType = true;
        return this;
    }

    public int accountType()
    {
        return accountType;
    }

    public MultilegOrderCancelReplaceEncoder accountType(AccountType value)
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

    public MultilegOrderCancelReplaceEncoder dayBookingInst(char value)
    {
        dayBookingInst = value;
        hasDayBookingInst = true;
        return this;
    }

    public char dayBookingInst()
    {
        return dayBookingInst;
    }

    public MultilegOrderCancelReplaceEncoder dayBookingInst(DayBookingInst value)
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

    public MultilegOrderCancelReplaceEncoder bookingUnit(char value)
    {
        bookingUnit = value;
        hasBookingUnit = true;
        return this;
    }

    public char bookingUnit()
    {
        return bookingUnit;
    }

    public MultilegOrderCancelReplaceEncoder bookingUnit(BookingUnit value)
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

    public MultilegOrderCancelReplaceEncoder preallocMethod(char value)
    {
        preallocMethod = value;
        hasPreallocMethod = true;
        return this;
    }

    public char preallocMethod()
    {
        return preallocMethod;
    }

    public MultilegOrderCancelReplaceEncoder preallocMethod(PreallocMethod value)
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

    public MultilegOrderCancelReplaceEncoder allocID(final DirectBuffer value, final int offset, final int length)
    {
        allocID.wrap(value);
        allocIDOffset = offset;
        allocIDLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder allocID(final DirectBuffer value, final int length)
    {
        return allocID(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder allocID(final DirectBuffer value)
    {
        return allocID(value, 0, value.capacity());
    }

    public MultilegOrderCancelReplaceEncoder allocID(final byte[] value, final int offset, final int length)
    {
        allocID.wrap(value);
        allocIDOffset = offset;
        allocIDLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder allocIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(allocID, value, offset, length);
        allocIDOffset = offset;
        allocIDLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder allocID(final byte[] value, final int length)
    {
        return allocID(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder allocID(final byte[] value)
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

    public MultilegOrderCancelReplaceEncoder allocID(final CharSequence value)
    {
        toBytes(value, allocID);
        allocIDOffset = 0;
        allocIDLength = value.length();
        return this;
    }

    public MultilegOrderCancelReplaceEncoder allocID(final AsciiSequenceView value)
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

    public MultilegOrderCancelReplaceEncoder allocID(final char[] value)
    {
        return allocID(value, 0, value.length);
    }

    public MultilegOrderCancelReplaceEncoder allocID(final char[] value, final int length)
    {
        return allocID(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder allocID(final char[] value, final int offset, final int length)
    {
        toBytes(value, allocID, offset, length);
        allocIDOffset = 0;
        allocIDLength = length;
        return this;
    }

    private final PreAllocMlegGrpEncoder preAllocMlegGrp = new PreAllocMlegGrpEncoder();
    public PreAllocMlegGrpEncoder preAllocMlegGrp()
    {
        return preAllocMlegGrp;
    }

    private final MutableDirectBuffer settlType = new UnsafeBuffer();

    private int settlTypeOffset = 0;

    private int settlTypeLength = 0;

    public MultilegOrderCancelReplaceEncoder settlType(final DirectBuffer value, final int offset, final int length)
    {
        settlType.wrap(value);
        settlTypeOffset = offset;
        settlTypeLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder settlType(final DirectBuffer value, final int length)
    {
        return settlType(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder settlType(final DirectBuffer value)
    {
        return settlType(value, 0, value.capacity());
    }

    public MultilegOrderCancelReplaceEncoder settlType(final byte[] value, final int offset, final int length)
    {
        settlType.wrap(value);
        settlTypeOffset = offset;
        settlTypeLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder settlTypeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlType, value, offset, length);
        settlTypeOffset = offset;
        settlTypeLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder settlType(final byte[] value, final int length)
    {
        return settlType(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder settlType(final byte[] value)
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

    public MultilegOrderCancelReplaceEncoder settlType(final CharSequence value)
    {
        toBytes(value, settlType);
        settlTypeOffset = 0;
        settlTypeLength = value.length();
        return this;
    }

    public MultilegOrderCancelReplaceEncoder settlType(final AsciiSequenceView value)
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

    public MultilegOrderCancelReplaceEncoder settlType(final char[] value)
    {
        return settlType(value, 0, value.length);
    }

    public MultilegOrderCancelReplaceEncoder settlType(final char[] value, final int length)
    {
        return settlType(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder settlType(final char[] value, final int offset, final int length)
    {
        toBytes(value, settlType, offset, length);
        settlTypeOffset = 0;
        settlTypeLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder settlType(SettlType value)
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

    public MultilegOrderCancelReplaceEncoder settlDate(final DirectBuffer value, final int offset, final int length)
    {
        settlDate.wrap(value);
        settlDateOffset = offset;
        settlDateLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder settlDate(final DirectBuffer value, final int length)
    {
        return settlDate(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder settlDate(final DirectBuffer value)
    {
        return settlDate(value, 0, value.capacity());
    }

    public MultilegOrderCancelReplaceEncoder settlDate(final byte[] value, final int offset, final int length)
    {
        settlDate.wrap(value);
        settlDateOffset = offset;
        settlDateLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder settlDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlDate, value, offset, length);
        settlDateOffset = offset;
        settlDateLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder settlDate(final byte[] value, final int length)
    {
        return settlDate(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder settlDate(final byte[] value)
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

    public MultilegOrderCancelReplaceEncoder cashMargin(char value)
    {
        cashMargin = value;
        hasCashMargin = true;
        return this;
    }

    public char cashMargin()
    {
        return cashMargin;
    }

    public MultilegOrderCancelReplaceEncoder cashMargin(CashMargin value)
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

    public MultilegOrderCancelReplaceEncoder clearingFeeIndicator(final DirectBuffer value, final int offset, final int length)
    {
        clearingFeeIndicator.wrap(value);
        clearingFeeIndicatorOffset = offset;
        clearingFeeIndicatorLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder clearingFeeIndicator(final DirectBuffer value, final int length)
    {
        return clearingFeeIndicator(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder clearingFeeIndicator(final DirectBuffer value)
    {
        return clearingFeeIndicator(value, 0, value.capacity());
    }

    public MultilegOrderCancelReplaceEncoder clearingFeeIndicator(final byte[] value, final int offset, final int length)
    {
        clearingFeeIndicator.wrap(value);
        clearingFeeIndicatorOffset = offset;
        clearingFeeIndicatorLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder clearingFeeIndicatorAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(clearingFeeIndicator, value, offset, length);
        clearingFeeIndicatorOffset = offset;
        clearingFeeIndicatorLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder clearingFeeIndicator(final byte[] value, final int length)
    {
        return clearingFeeIndicator(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder clearingFeeIndicator(final byte[] value)
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

    public MultilegOrderCancelReplaceEncoder clearingFeeIndicator(final CharSequence value)
    {
        toBytes(value, clearingFeeIndicator);
        clearingFeeIndicatorOffset = 0;
        clearingFeeIndicatorLength = value.length();
        return this;
    }

    public MultilegOrderCancelReplaceEncoder clearingFeeIndicator(final AsciiSequenceView value)
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

    public MultilegOrderCancelReplaceEncoder clearingFeeIndicator(final char[] value)
    {
        return clearingFeeIndicator(value, 0, value.length);
    }

    public MultilegOrderCancelReplaceEncoder clearingFeeIndicator(final char[] value, final int length)
    {
        return clearingFeeIndicator(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder clearingFeeIndicator(final char[] value, final int offset, final int length)
    {
        toBytes(value, clearingFeeIndicator, offset, length);
        clearingFeeIndicatorOffset = 0;
        clearingFeeIndicatorLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder clearingFeeIndicator(ClearingFeeIndicator value)
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

    public MultilegOrderCancelReplaceEncoder handlInst(char value)
    {
        handlInst = value;
        hasHandlInst = true;
        return this;
    }

    public char handlInst()
    {
        return handlInst;
    }

    public MultilegOrderCancelReplaceEncoder handlInst(HandlInst value)
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

    public MultilegOrderCancelReplaceEncoder execInst(final DirectBuffer value, final int offset, final int length)
    {
        execInst.wrap(value);
        execInstOffset = offset;
        execInstLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder execInst(final DirectBuffer value, final int length)
    {
        return execInst(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder execInst(final DirectBuffer value)
    {
        return execInst(value, 0, value.capacity());
    }

    public MultilegOrderCancelReplaceEncoder execInst(final byte[] value, final int offset, final int length)
    {
        execInst.wrap(value);
        execInstOffset = offset;
        execInstLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder execInstAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(execInst, value, offset, length);
        execInstOffset = offset;
        execInstLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder execInst(final byte[] value, final int length)
    {
        return execInst(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder execInst(final byte[] value)
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

    public MultilegOrderCancelReplaceEncoder execInst(final CharSequence value)
    {
        toBytes(value, execInst);
        execInstOffset = 0;
        execInstLength = value.length();
        return this;
    }

    public MultilegOrderCancelReplaceEncoder execInst(final AsciiSequenceView value)
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

    public MultilegOrderCancelReplaceEncoder execInst(final char[] value)
    {
        return execInst(value, 0, value.length);
    }

    public MultilegOrderCancelReplaceEncoder execInst(final char[] value, final int length)
    {
        return execInst(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder execInst(final char[] value, final int offset, final int length)
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

    public MultilegOrderCancelReplaceEncoder minQty(DecimalFloat value)
    {
        minQty.set(value);
        hasMinQty = true;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder minQty(long value, int scale)
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

    public MultilegOrderCancelReplaceEncoder matchIncrement(DecimalFloat value)
    {
        matchIncrement.set(value);
        hasMatchIncrement = true;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder matchIncrement(long value, int scale)
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

    public MultilegOrderCancelReplaceEncoder maxPriceLevels(int value)
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

    public MultilegOrderCancelReplaceEncoder maxFloor(DecimalFloat value)
    {
        maxFloor.set(value);
        hasMaxFloor = true;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder maxFloor(long value, int scale)
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

    public MultilegOrderCancelReplaceEncoder exDestination(final DirectBuffer value, final int offset, final int length)
    {
        exDestination.wrap(value);
        exDestinationOffset = offset;
        exDestinationLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder exDestination(final DirectBuffer value, final int length)
    {
        return exDestination(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder exDestination(final DirectBuffer value)
    {
        return exDestination(value, 0, value.capacity());
    }

    public MultilegOrderCancelReplaceEncoder exDestination(final byte[] value, final int offset, final int length)
    {
        exDestination.wrap(value);
        exDestinationOffset = offset;
        exDestinationLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder exDestinationAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(exDestination, value, offset, length);
        exDestinationOffset = offset;
        exDestinationLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder exDestination(final byte[] value, final int length)
    {
        return exDestination(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder exDestination(final byte[] value)
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

    public MultilegOrderCancelReplaceEncoder exDestination(final CharSequence value)
    {
        toBytes(value, exDestination);
        exDestinationOffset = 0;
        exDestinationLength = value.length();
        return this;
    }

    public MultilegOrderCancelReplaceEncoder exDestination(final AsciiSequenceView value)
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

    public MultilegOrderCancelReplaceEncoder exDestination(final char[] value)
    {
        return exDestination(value, 0, value.length);
    }

    public MultilegOrderCancelReplaceEncoder exDestination(final char[] value, final int length)
    {
        return exDestination(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder exDestination(final char[] value, final int offset, final int length)
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

    public MultilegOrderCancelReplaceEncoder exDestinationIDSource(char value)
    {
        exDestinationIDSource = value;
        hasExDestinationIDSource = true;
        return this;
    }

    public char exDestinationIDSource()
    {
        return exDestinationIDSource;
    }

    public MultilegOrderCancelReplaceEncoder exDestinationIDSource(ExDestinationIDSource value)
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

    private char processCode;

    private boolean hasProcessCode;

    public boolean hasProcessCode()
    {
        return hasProcessCode;
    }

    public MultilegOrderCancelReplaceEncoder processCode(char value)
    {
        processCode = value;
        hasProcessCode = true;
        return this;
    }

    public char processCode()
    {
        return processCode;
    }

    public MultilegOrderCancelReplaceEncoder processCode(ProcessCode value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == ProcessCode.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: processCode Value: " + value );
            }
            if (value == ProcessCode.NULL_VAL)
            {
                return this;
            }
        }
        return processCode(value.representation());
    }

    private char side;

    private boolean hasSide;

    public boolean hasSide()
    {
        return hasSide;
    }

    public MultilegOrderCancelReplaceEncoder side(char value)
    {
        side = value;
        hasSide = true;
        return this;
    }

    public char side()
    {
        return side;
    }

    public MultilegOrderCancelReplaceEncoder side(Side value)
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

    private final InstrumentEncoder instrument = new InstrumentEncoder();
    public InstrumentEncoder instrument()
    {
        return instrument;
    }

    private final UndInstrmtGrpEncoder undInstrmtGrp = new UndInstrmtGrpEncoder();
    public UndInstrmtGrpEncoder undInstrmtGrp()
    {
        return undInstrmtGrp;
    }

    private final DecimalFloat prevClosePx = new DecimalFloat();

    private boolean hasPrevClosePx;

    public boolean hasPrevClosePx()
    {
        return hasPrevClosePx;
    }

    public MultilegOrderCancelReplaceEncoder prevClosePx(DecimalFloat value)
    {
        prevClosePx.set(value);
        hasPrevClosePx = true;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder prevClosePx(long value, int scale)
    {
        prevClosePx.set(value, scale);
        hasPrevClosePx = true;
        return this;
    }

    public DecimalFloat prevClosePx()
    {
        return prevClosePx;
    }

    private final DecimalFloat swapPoints = new DecimalFloat();

    private boolean hasSwapPoints;

    public boolean hasSwapPoints()
    {
        return hasSwapPoints;
    }

    public MultilegOrderCancelReplaceEncoder swapPoints(DecimalFloat value)
    {
        swapPoints.set(value);
        hasSwapPoints = true;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder swapPoints(long value, int scale)
    {
        swapPoints.set(value, scale);
        hasSwapPoints = true;
        return this;
    }

    public DecimalFloat swapPoints()
    {
        return swapPoints;
    }

    private final LegOrdGrpEncoder legOrdGrp = new LegOrdGrpEncoder();
    public LegOrdGrpEncoder legOrdGrp()
    {
        return legOrdGrp;
    }

    private boolean locateReqd;

    private boolean hasLocateReqd;

    public boolean hasLocateReqd()
    {
        return hasLocateReqd;
    }

    public MultilegOrderCancelReplaceEncoder locateReqd(boolean value)
    {
        locateReqd = value;
        hasLocateReqd = true;
        return this;
    }

    public boolean locateReqd()
    {
        return locateReqd;
    }

    private final MutableDirectBuffer transactTime = new UnsafeBuffer();

    private int transactTimeOffset = 0;

    private int transactTimeLength = 0;

    public MultilegOrderCancelReplaceEncoder transactTime(final DirectBuffer value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder transactTime(final DirectBuffer value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder transactTime(final DirectBuffer value)
    {
        return transactTime(value, 0, value.capacity());
    }

    public MultilegOrderCancelReplaceEncoder transactTime(final byte[] value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder transactTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(transactTime, value, offset, length);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder transactTime(final byte[] value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder transactTime(final byte[] value)
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

    public MultilegOrderCancelReplaceEncoder qtyType(int value)
    {
        qtyType = value;
        hasQtyType = true;
        return this;
    }

    public int qtyType()
    {
        return qtyType;
    }

    public MultilegOrderCancelReplaceEncoder qtyType(QtyType value)
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

    public MultilegOrderCancelReplaceEncoder ordType(char value)
    {
        ordType = value;
        hasOrdType = true;
        return this;
    }

    public char ordType()
    {
        return ordType;
    }

    public MultilegOrderCancelReplaceEncoder ordType(OrdType value)
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

    private int multilegModel;

    private boolean hasMultilegModel;

    public boolean hasMultilegModel()
    {
        return hasMultilegModel;
    }

    public MultilegOrderCancelReplaceEncoder multilegModel(int value)
    {
        multilegModel = value;
        hasMultilegModel = true;
        return this;
    }

    public int multilegModel()
    {
        return multilegModel;
    }

    public MultilegOrderCancelReplaceEncoder multilegModel(MultilegModel value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == MultilegModel.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: multilegModel Value: " + value );
            }
            if (value == MultilegModel.NULL_VAL)
            {
                return this;
            }
        }
        return multilegModel(value.representation());
    }

    private int multilegPriceMethod;

    private boolean hasMultilegPriceMethod;

    public boolean hasMultilegPriceMethod()
    {
        return hasMultilegPriceMethod;
    }

    public MultilegOrderCancelReplaceEncoder multilegPriceMethod(int value)
    {
        multilegPriceMethod = value;
        hasMultilegPriceMethod = true;
        return this;
    }

    public int multilegPriceMethod()
    {
        return multilegPriceMethod;
    }

    public MultilegOrderCancelReplaceEncoder multilegPriceMethod(MultilegPriceMethod value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == MultilegPriceMethod.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: multilegPriceMethod Value: " + value );
            }
            if (value == MultilegPriceMethod.NULL_VAL)
            {
                return this;
            }
        }
        return multilegPriceMethod(value.representation());
    }

    private int priceType;

    private boolean hasPriceType;

    public boolean hasPriceType()
    {
        return hasPriceType;
    }

    public MultilegOrderCancelReplaceEncoder priceType(int value)
    {
        priceType = value;
        hasPriceType = true;
        return this;
    }

    public int priceType()
    {
        return priceType;
    }

    public MultilegOrderCancelReplaceEncoder priceType(PriceType value)
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

    public MultilegOrderCancelReplaceEncoder price(DecimalFloat value)
    {
        price.set(value);
        hasPrice = true;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder price(long value, int scale)
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

    public MultilegOrderCancelReplaceEncoder priceProtectionScope(char value)
    {
        priceProtectionScope = value;
        hasPriceProtectionScope = true;
        return this;
    }

    public char priceProtectionScope()
    {
        return priceProtectionScope;
    }

    public MultilegOrderCancelReplaceEncoder priceProtectionScope(PriceProtectionScope value)
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

    public MultilegOrderCancelReplaceEncoder stopPx(DecimalFloat value)
    {
        stopPx.set(value);
        hasStopPx = true;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder stopPx(long value, int scale)
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

    private final MutableDirectBuffer currency = new UnsafeBuffer();

    private int currencyOffset = 0;

    private int currencyLength = 0;

    public MultilegOrderCancelReplaceEncoder currency(final DirectBuffer value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder currency(final DirectBuffer value, final int length)
    {
        return currency(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder currency(final DirectBuffer value)
    {
        return currency(value, 0, value.capacity());
    }

    public MultilegOrderCancelReplaceEncoder currency(final byte[] value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder currencyAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(currency, value, offset, length);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder currency(final byte[] value, final int length)
    {
        return currency(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder currency(final byte[] value)
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

    public MultilegOrderCancelReplaceEncoder currency(final CharSequence value)
    {
        toBytes(value, currency);
        currencyOffset = 0;
        currencyLength = value.length();
        return this;
    }

    public MultilegOrderCancelReplaceEncoder currency(final AsciiSequenceView value)
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

    public MultilegOrderCancelReplaceEncoder currency(final char[] value)
    {
        return currency(value, 0, value.length);
    }

    public MultilegOrderCancelReplaceEncoder currency(final char[] value, final int length)
    {
        return currency(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder currency(final char[] value, final int offset, final int length)
    {
        toBytes(value, currency, offset, length);
        currencyOffset = 0;
        currencyLength = length;
        return this;
    }

    private final MutableDirectBuffer complianceID = new UnsafeBuffer();

    private int complianceIDOffset = 0;

    private int complianceIDLength = 0;

    public MultilegOrderCancelReplaceEncoder complianceID(final DirectBuffer value, final int offset, final int length)
    {
        complianceID.wrap(value);
        complianceIDOffset = offset;
        complianceIDLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder complianceID(final DirectBuffer value, final int length)
    {
        return complianceID(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder complianceID(final DirectBuffer value)
    {
        return complianceID(value, 0, value.capacity());
    }

    public MultilegOrderCancelReplaceEncoder complianceID(final byte[] value, final int offset, final int length)
    {
        complianceID.wrap(value);
        complianceIDOffset = offset;
        complianceIDLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder complianceIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(complianceID, value, offset, length);
        complianceIDOffset = offset;
        complianceIDLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder complianceID(final byte[] value, final int length)
    {
        return complianceID(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder complianceID(final byte[] value)
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

    public MultilegOrderCancelReplaceEncoder complianceID(final CharSequence value)
    {
        toBytes(value, complianceID);
        complianceIDOffset = 0;
        complianceIDLength = value.length();
        return this;
    }

    public MultilegOrderCancelReplaceEncoder complianceID(final AsciiSequenceView value)
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

    public MultilegOrderCancelReplaceEncoder complianceID(final char[] value)
    {
        return complianceID(value, 0, value.length);
    }

    public MultilegOrderCancelReplaceEncoder complianceID(final char[] value, final int length)
    {
        return complianceID(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder complianceID(final char[] value, final int offset, final int length)
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

    public MultilegOrderCancelReplaceEncoder solicitedFlag(boolean value)
    {
        solicitedFlag = value;
        hasSolicitedFlag = true;
        return this;
    }

    public boolean solicitedFlag()
    {
        return solicitedFlag;
    }

    private final MutableDirectBuffer iOIID = new UnsafeBuffer();

    private int iOIIDOffset = 0;

    private int iOIIDLength = 0;

    public MultilegOrderCancelReplaceEncoder iOIID(final DirectBuffer value, final int offset, final int length)
    {
        iOIID.wrap(value);
        iOIIDOffset = offset;
        iOIIDLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder iOIID(final DirectBuffer value, final int length)
    {
        return iOIID(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder iOIID(final DirectBuffer value)
    {
        return iOIID(value, 0, value.capacity());
    }

    public MultilegOrderCancelReplaceEncoder iOIID(final byte[] value, final int offset, final int length)
    {
        iOIID.wrap(value);
        iOIIDOffset = offset;
        iOIIDLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder iOIIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(iOIID, value, offset, length);
        iOIIDOffset = offset;
        iOIIDLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder iOIID(final byte[] value, final int length)
    {
        return iOIID(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder iOIID(final byte[] value)
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

    public MultilegOrderCancelReplaceEncoder iOIID(final CharSequence value)
    {
        toBytes(value, iOIID);
        iOIIDOffset = 0;
        iOIIDLength = value.length();
        return this;
    }

    public MultilegOrderCancelReplaceEncoder iOIID(final AsciiSequenceView value)
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

    public MultilegOrderCancelReplaceEncoder iOIID(final char[] value)
    {
        return iOIID(value, 0, value.length);
    }

    public MultilegOrderCancelReplaceEncoder iOIID(final char[] value, final int length)
    {
        return iOIID(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder iOIID(final char[] value, final int offset, final int length)
    {
        toBytes(value, iOIID, offset, length);
        iOIIDOffset = 0;
        iOIIDLength = length;
        return this;
    }

    private final MutableDirectBuffer quoteID = new UnsafeBuffer();

    private int quoteIDOffset = 0;

    private int quoteIDLength = 0;

    public MultilegOrderCancelReplaceEncoder quoteID(final DirectBuffer value, final int offset, final int length)
    {
        quoteID.wrap(value);
        quoteIDOffset = offset;
        quoteIDLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder quoteID(final DirectBuffer value, final int length)
    {
        return quoteID(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder quoteID(final DirectBuffer value)
    {
        return quoteID(value, 0, value.capacity());
    }

    public MultilegOrderCancelReplaceEncoder quoteID(final byte[] value, final int offset, final int length)
    {
        quoteID.wrap(value);
        quoteIDOffset = offset;
        quoteIDLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder quoteIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(quoteID, value, offset, length);
        quoteIDOffset = offset;
        quoteIDLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder quoteID(final byte[] value, final int length)
    {
        return quoteID(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder quoteID(final byte[] value)
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

    public MultilegOrderCancelReplaceEncoder quoteID(final CharSequence value)
    {
        toBytes(value, quoteID);
        quoteIDOffset = 0;
        quoteIDLength = value.length();
        return this;
    }

    public MultilegOrderCancelReplaceEncoder quoteID(final AsciiSequenceView value)
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

    public MultilegOrderCancelReplaceEncoder quoteID(final char[] value)
    {
        return quoteID(value, 0, value.length);
    }

    public MultilegOrderCancelReplaceEncoder quoteID(final char[] value, final int length)
    {
        return quoteID(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder quoteID(final char[] value, final int offset, final int length)
    {
        toBytes(value, quoteID, offset, length);
        quoteIDOffset = 0;
        quoteIDLength = length;
        return this;
    }

    private char timeInForce;

    private boolean hasTimeInForce;

    public boolean hasTimeInForce()
    {
        return hasTimeInForce;
    }

    public MultilegOrderCancelReplaceEncoder timeInForce(char value)
    {
        timeInForce = value;
        hasTimeInForce = true;
        return this;
    }

    public char timeInForce()
    {
        return timeInForce;
    }

    public MultilegOrderCancelReplaceEncoder timeInForce(TimeInForce value)
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

    public MultilegOrderCancelReplaceEncoder effectiveTime(final DirectBuffer value, final int offset, final int length)
    {
        effectiveTime.wrap(value);
        effectiveTimeOffset = offset;
        effectiveTimeLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder effectiveTime(final DirectBuffer value, final int length)
    {
        return effectiveTime(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder effectiveTime(final DirectBuffer value)
    {
        return effectiveTime(value, 0, value.capacity());
    }

    public MultilegOrderCancelReplaceEncoder effectiveTime(final byte[] value, final int offset, final int length)
    {
        effectiveTime.wrap(value);
        effectiveTimeOffset = offset;
        effectiveTimeLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder effectiveTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(effectiveTime, value, offset, length);
        effectiveTimeOffset = offset;
        effectiveTimeLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder effectiveTime(final byte[] value, final int length)
    {
        return effectiveTime(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder effectiveTime(final byte[] value)
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

    public MultilegOrderCancelReplaceEncoder expireDate(final DirectBuffer value, final int offset, final int length)
    {
        expireDate.wrap(value);
        expireDateOffset = offset;
        expireDateLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder expireDate(final DirectBuffer value, final int length)
    {
        return expireDate(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder expireDate(final DirectBuffer value)
    {
        return expireDate(value, 0, value.capacity());
    }

    public MultilegOrderCancelReplaceEncoder expireDate(final byte[] value, final int offset, final int length)
    {
        expireDate.wrap(value);
        expireDateOffset = offset;
        expireDateLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder expireDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(expireDate, value, offset, length);
        expireDateOffset = offset;
        expireDateLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder expireDate(final byte[] value, final int length)
    {
        return expireDate(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder expireDate(final byte[] value)
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

    public MultilegOrderCancelReplaceEncoder expireTime(final DirectBuffer value, final int offset, final int length)
    {
        expireTime.wrap(value);
        expireTimeOffset = offset;
        expireTimeLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder expireTime(final DirectBuffer value, final int length)
    {
        return expireTime(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder expireTime(final DirectBuffer value)
    {
        return expireTime(value, 0, value.capacity());
    }

    public MultilegOrderCancelReplaceEncoder expireTime(final byte[] value, final int offset, final int length)
    {
        expireTime.wrap(value);
        expireTimeOffset = offset;
        expireTimeLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder expireTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(expireTime, value, offset, length);
        expireTimeOffset = offset;
        expireTimeLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder expireTime(final byte[] value, final int length)
    {
        return expireTime(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder expireTime(final byte[] value)
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

    public MultilegOrderCancelReplaceEncoder gTBookingInst(int value)
    {
        gTBookingInst = value;
        hasGTBookingInst = true;
        return this;
    }

    public int gTBookingInst()
    {
        return gTBookingInst;
    }

    public MultilegOrderCancelReplaceEncoder gTBookingInst(GTBookingInst value)
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

    public MultilegOrderCancelReplaceEncoder orderCapacity(char value)
    {
        orderCapacity = value;
        hasOrderCapacity = true;
        return this;
    }

    public char orderCapacity()
    {
        return orderCapacity;
    }

    public MultilegOrderCancelReplaceEncoder orderCapacity(OrderCapacity value)
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

    public MultilegOrderCancelReplaceEncoder orderRestrictions(final DirectBuffer value, final int offset, final int length)
    {
        orderRestrictions.wrap(value);
        orderRestrictionsOffset = offset;
        orderRestrictionsLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder orderRestrictions(final DirectBuffer value, final int length)
    {
        return orderRestrictions(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder orderRestrictions(final DirectBuffer value)
    {
        return orderRestrictions(value, 0, value.capacity());
    }

    public MultilegOrderCancelReplaceEncoder orderRestrictions(final byte[] value, final int offset, final int length)
    {
        orderRestrictions.wrap(value);
        orderRestrictionsOffset = offset;
        orderRestrictionsLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder orderRestrictionsAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(orderRestrictions, value, offset, length);
        orderRestrictionsOffset = offset;
        orderRestrictionsLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder orderRestrictions(final byte[] value, final int length)
    {
        return orderRestrictions(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder orderRestrictions(final byte[] value)
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

    public MultilegOrderCancelReplaceEncoder orderRestrictions(final CharSequence value)
    {
        toBytes(value, orderRestrictions);
        orderRestrictionsOffset = 0;
        orderRestrictionsLength = value.length();
        return this;
    }

    public MultilegOrderCancelReplaceEncoder orderRestrictions(final AsciiSequenceView value)
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

    public MultilegOrderCancelReplaceEncoder orderRestrictions(final char[] value)
    {
        return orderRestrictions(value, 0, value.length);
    }

    public MultilegOrderCancelReplaceEncoder orderRestrictions(final char[] value, final int length)
    {
        return orderRestrictions(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder orderRestrictions(final char[] value, final int offset, final int length)
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

    public MultilegOrderCancelReplaceEncoder preTradeAnonymity(boolean value)
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

    public MultilegOrderCancelReplaceEncoder custOrderCapacity(int value)
    {
        custOrderCapacity = value;
        hasCustOrderCapacity = true;
        return this;
    }

    public int custOrderCapacity()
    {
        return custOrderCapacity;
    }

    public MultilegOrderCancelReplaceEncoder custOrderCapacity(CustOrderCapacity value)
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

    public MultilegOrderCancelReplaceEncoder forexReq(boolean value)
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

    public MultilegOrderCancelReplaceEncoder settlCurrency(final DirectBuffer value, final int offset, final int length)
    {
        settlCurrency.wrap(value);
        settlCurrencyOffset = offset;
        settlCurrencyLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder settlCurrency(final DirectBuffer value, final int length)
    {
        return settlCurrency(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder settlCurrency(final DirectBuffer value)
    {
        return settlCurrency(value, 0, value.capacity());
    }

    public MultilegOrderCancelReplaceEncoder settlCurrency(final byte[] value, final int offset, final int length)
    {
        settlCurrency.wrap(value);
        settlCurrencyOffset = offset;
        settlCurrencyLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder settlCurrencyAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlCurrency, value, offset, length);
        settlCurrencyOffset = offset;
        settlCurrencyLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder settlCurrency(final byte[] value, final int length)
    {
        return settlCurrency(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder settlCurrency(final byte[] value)
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

    public MultilegOrderCancelReplaceEncoder settlCurrency(final CharSequence value)
    {
        toBytes(value, settlCurrency);
        settlCurrencyOffset = 0;
        settlCurrencyLength = value.length();
        return this;
    }

    public MultilegOrderCancelReplaceEncoder settlCurrency(final AsciiSequenceView value)
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

    public MultilegOrderCancelReplaceEncoder settlCurrency(final char[] value)
    {
        return settlCurrency(value, 0, value.length);
    }

    public MultilegOrderCancelReplaceEncoder settlCurrency(final char[] value, final int length)
    {
        return settlCurrency(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder settlCurrency(final char[] value, final int offset, final int length)
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

    public MultilegOrderCancelReplaceEncoder bookingType(int value)
    {
        bookingType = value;
        hasBookingType = true;
        return this;
    }

    public int bookingType()
    {
        return bookingType;
    }

    public MultilegOrderCancelReplaceEncoder bookingType(BookingType value)
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

    public MultilegOrderCancelReplaceEncoder text(final DirectBuffer value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder text(final DirectBuffer value, final int length)
    {
        return text(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder text(final DirectBuffer value)
    {
        return text(value, 0, value.capacity());
    }

    public MultilegOrderCancelReplaceEncoder text(final byte[] value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder textAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(text, value, offset, length);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder text(final byte[] value, final int length)
    {
        return text(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder text(final byte[] value)
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

    public MultilegOrderCancelReplaceEncoder text(final CharSequence value)
    {
        toBytes(value, text);
        textOffset = 0;
        textLength = value.length();
        return this;
    }

    public MultilegOrderCancelReplaceEncoder text(final AsciiSequenceView value)
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

    public MultilegOrderCancelReplaceEncoder text(final char[] value)
    {
        return text(value, 0, value.length);
    }

    public MultilegOrderCancelReplaceEncoder text(final char[] value, final int length)
    {
        return text(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder text(final char[] value, final int offset, final int length)
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

    public MultilegOrderCancelReplaceEncoder encodedTextLen(int value)
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

    public MultilegOrderCancelReplaceEncoder encodedText(byte[] value)
    {
        encodedText = value;
        hasEncodedText = true;
        return this;
    }

    public byte[] encodedText()
    {
        return encodedText;
    }

    public MultilegOrderCancelReplaceEncoder encodedTextAsCopy(final byte[] value, final int offset, final int length)
    {
        encodedText = copyInto(encodedText, value, offset, length);
        hasEncodedText = true;
        return this;
    }

    private char positionEffect;

    private boolean hasPositionEffect;

    public boolean hasPositionEffect()
    {
        return hasPositionEffect;
    }

    public MultilegOrderCancelReplaceEncoder positionEffect(char value)
    {
        positionEffect = value;
        hasPositionEffect = true;
        return this;
    }

    public char positionEffect()
    {
        return positionEffect;
    }

    public MultilegOrderCancelReplaceEncoder positionEffect(PositionEffect value)
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

    public MultilegOrderCancelReplaceEncoder coveredOrUncovered(int value)
    {
        coveredOrUncovered = value;
        hasCoveredOrUncovered = true;
        return this;
    }

    public int coveredOrUncovered()
    {
        return coveredOrUncovered;
    }

    public MultilegOrderCancelReplaceEncoder coveredOrUncovered(CoveredOrUncovered value)
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

    public MultilegOrderCancelReplaceEncoder maxShow(DecimalFloat value)
    {
        maxShow.set(value);
        hasMaxShow = true;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder maxShow(long value, int scale)
    {
        maxShow.set(value, scale);
        hasMaxShow = true;
        return this;
    }

    public DecimalFloat maxShow()
    {
        return maxShow;
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

    public MultilegOrderCancelReplaceEncoder targetStrategy(int value)
    {
        targetStrategy = value;
        hasTargetStrategy = true;
        return this;
    }

    public int targetStrategy()
    {
        return targetStrategy;
    }

    public MultilegOrderCancelReplaceEncoder targetStrategy(TargetStrategy value)
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

    public MultilegOrderCancelReplaceEncoder targetStrategyParameters(final DirectBuffer value, final int offset, final int length)
    {
        targetStrategyParameters.wrap(value);
        targetStrategyParametersOffset = offset;
        targetStrategyParametersLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder targetStrategyParameters(final DirectBuffer value, final int length)
    {
        return targetStrategyParameters(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder targetStrategyParameters(final DirectBuffer value)
    {
        return targetStrategyParameters(value, 0, value.capacity());
    }

    public MultilegOrderCancelReplaceEncoder targetStrategyParameters(final byte[] value, final int offset, final int length)
    {
        targetStrategyParameters.wrap(value);
        targetStrategyParametersOffset = offset;
        targetStrategyParametersLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder targetStrategyParametersAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(targetStrategyParameters, value, offset, length);
        targetStrategyParametersOffset = offset;
        targetStrategyParametersLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder targetStrategyParameters(final byte[] value, final int length)
    {
        return targetStrategyParameters(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder targetStrategyParameters(final byte[] value)
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

    public MultilegOrderCancelReplaceEncoder targetStrategyParameters(final CharSequence value)
    {
        toBytes(value, targetStrategyParameters);
        targetStrategyParametersOffset = 0;
        targetStrategyParametersLength = value.length();
        return this;
    }

    public MultilegOrderCancelReplaceEncoder targetStrategyParameters(final AsciiSequenceView value)
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

    public MultilegOrderCancelReplaceEncoder targetStrategyParameters(final char[] value)
    {
        return targetStrategyParameters(value, 0, value.length);
    }

    public MultilegOrderCancelReplaceEncoder targetStrategyParameters(final char[] value, final int length)
    {
        return targetStrategyParameters(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder targetStrategyParameters(final char[] value, final int offset, final int length)
    {
        toBytes(value, targetStrategyParameters, offset, length);
        targetStrategyParametersOffset = 0;
        targetStrategyParametersLength = length;
        return this;
    }

    private final DecimalFloat riskFreeRate = new DecimalFloat();

    private boolean hasRiskFreeRate;

    public boolean hasRiskFreeRate()
    {
        return hasRiskFreeRate;
    }

    public MultilegOrderCancelReplaceEncoder riskFreeRate(DecimalFloat value)
    {
        riskFreeRate.set(value);
        hasRiskFreeRate = true;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder riskFreeRate(long value, int scale)
    {
        riskFreeRate.set(value, scale);
        hasRiskFreeRate = true;
        return this;
    }

    public DecimalFloat riskFreeRate()
    {
        return riskFreeRate;
    }

    private final DecimalFloat participationRate = new DecimalFloat();

    private boolean hasParticipationRate;

    public boolean hasParticipationRate()
    {
        return hasParticipationRate;
    }

    public MultilegOrderCancelReplaceEncoder participationRate(DecimalFloat value)
    {
        participationRate.set(value);
        hasParticipationRate = true;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder participationRate(long value, int scale)
    {
        participationRate.set(value, scale);
        hasParticipationRate = true;
        return this;
    }

    public DecimalFloat participationRate()
    {
        return participationRate;
    }

    private char cancellationRights;

    private boolean hasCancellationRights;

    public boolean hasCancellationRights()
    {
        return hasCancellationRights;
    }

    public MultilegOrderCancelReplaceEncoder cancellationRights(char value)
    {
        cancellationRights = value;
        hasCancellationRights = true;
        return this;
    }

    public char cancellationRights()
    {
        return cancellationRights;
    }

    public MultilegOrderCancelReplaceEncoder cancellationRights(CancellationRights value)
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

    public MultilegOrderCancelReplaceEncoder moneyLaunderingStatus(char value)
    {
        moneyLaunderingStatus = value;
        hasMoneyLaunderingStatus = true;
        return this;
    }

    public char moneyLaunderingStatus()
    {
        return moneyLaunderingStatus;
    }

    public MultilegOrderCancelReplaceEncoder moneyLaunderingStatus(MoneyLaunderingStatus value)
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

    public MultilegOrderCancelReplaceEncoder registID(final DirectBuffer value, final int offset, final int length)
    {
        registID.wrap(value);
        registIDOffset = offset;
        registIDLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder registID(final DirectBuffer value, final int length)
    {
        return registID(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder registID(final DirectBuffer value)
    {
        return registID(value, 0, value.capacity());
    }

    public MultilegOrderCancelReplaceEncoder registID(final byte[] value, final int offset, final int length)
    {
        registID.wrap(value);
        registIDOffset = offset;
        registIDLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder registIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(registID, value, offset, length);
        registIDOffset = offset;
        registIDLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder registID(final byte[] value, final int length)
    {
        return registID(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder registID(final byte[] value)
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

    public MultilegOrderCancelReplaceEncoder registID(final CharSequence value)
    {
        toBytes(value, registID);
        registIDOffset = 0;
        registIDLength = value.length();
        return this;
    }

    public MultilegOrderCancelReplaceEncoder registID(final AsciiSequenceView value)
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

    public MultilegOrderCancelReplaceEncoder registID(final char[] value)
    {
        return registID(value, 0, value.length);
    }

    public MultilegOrderCancelReplaceEncoder registID(final char[] value, final int length)
    {
        return registID(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder registID(final char[] value, final int offset, final int length)
    {
        toBytes(value, registID, offset, length);
        registIDOffset = 0;
        registIDLength = length;
        return this;
    }

    private final MutableDirectBuffer designation = new UnsafeBuffer();

    private int designationOffset = 0;

    private int designationLength = 0;

    public MultilegOrderCancelReplaceEncoder designation(final DirectBuffer value, final int offset, final int length)
    {
        designation.wrap(value);
        designationOffset = offset;
        designationLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder designation(final DirectBuffer value, final int length)
    {
        return designation(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder designation(final DirectBuffer value)
    {
        return designation(value, 0, value.capacity());
    }

    public MultilegOrderCancelReplaceEncoder designation(final byte[] value, final int offset, final int length)
    {
        designation.wrap(value);
        designationOffset = offset;
        designationLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder designationAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(designation, value, offset, length);
        designationOffset = offset;
        designationLength = length;
        return this;
    }

    public MultilegOrderCancelReplaceEncoder designation(final byte[] value, final int length)
    {
        return designation(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder designation(final byte[] value)
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

    public MultilegOrderCancelReplaceEncoder designation(final CharSequence value)
    {
        toBytes(value, designation);
        designationOffset = 0;
        designationLength = value.length();
        return this;
    }

    public MultilegOrderCancelReplaceEncoder designation(final AsciiSequenceView value)
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

    public MultilegOrderCancelReplaceEncoder designation(final char[] value)
    {
        return designation(value, 0, value.length);
    }

    public MultilegOrderCancelReplaceEncoder designation(final char[] value, final int length)
    {
        return designation(value, 0, length);
    }

    public MultilegOrderCancelReplaceEncoder designation(final char[] value, final int offset, final int length)
    {
        toBytes(value, designation, offset, length);
        designationOffset = 0;
        designationLength = length;
        return this;
    }

    private int multiLegRptTypeReq;

    private boolean hasMultiLegRptTypeReq;

    public boolean hasMultiLegRptTypeReq()
    {
        return hasMultiLegRptTypeReq;
    }

    public MultilegOrderCancelReplaceEncoder multiLegRptTypeReq(int value)
    {
        multiLegRptTypeReq = value;
        hasMultiLegRptTypeReq = true;
        return this;
    }

    public int multiLegRptTypeReq()
    {
        return multiLegRptTypeReq;
    }

    public MultilegOrderCancelReplaceEncoder multiLegRptTypeReq(MultiLegRptTypeReq value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == MultiLegRptTypeReq.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: multiLegRptTypeReq Value: " + value );
            }
            if (value == MultiLegRptTypeReq.NULL_VAL)
            {
                return this;
            }
        }
        return multiLegRptTypeReq(value.representation());
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

        if (origOrdModTimeLength > 0)
        {
            buffer.putBytes(position, origOrdModTimeHeader, 0, origOrdModTimeHeaderLength);
            position += origOrdModTimeHeaderLength;
            buffer.putBytes(position, origOrdModTime, origOrdModTimeOffset, origOrdModTimeLength);
            position += origOrdModTimeLength;
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

            position += preAllocMlegGrp.encode(buffer, position);

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

        if (hasProcessCode)
        {
            buffer.putBytes(position, processCodeHeader, 0, processCodeHeaderLength);
            position += processCodeHeaderLength;
            position += buffer.putCharAscii(position, processCode);
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
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: Side");
        }

            position += instrument.encode(buffer, position);

            position += undInstrmtGrp.encode(buffer, position);

        if (hasPrevClosePx)
        {
            buffer.putBytes(position, prevClosePxHeader, 0, prevClosePxHeaderLength);
            position += prevClosePxHeaderLength;
            position += buffer.putFloatAscii(position, prevClosePx);
            buffer.putSeparator(position);
            position++;
        }

        if (hasSwapPoints)
        {
            buffer.putBytes(position, swapPointsHeader, 0, swapPointsHeaderLength);
            position += swapPointsHeaderLength;
            position += buffer.putFloatAscii(position, swapPoints);
            buffer.putSeparator(position);
            position++;
        }

            position += legOrdGrp.encode(buffer, position);

        if (hasLocateReqd)
        {
            buffer.putBytes(position, locateReqdHeader, 0, locateReqdHeaderLength);
            position += locateReqdHeaderLength;
            position += buffer.putBooleanAscii(position, locateReqd);
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

        if (hasMultilegModel)
        {
            buffer.putBytes(position, multilegModelHeader, 0, multilegModelHeaderLength);
            position += multilegModelHeaderLength;
            position += buffer.putIntAscii(position, multilegModel);
            buffer.putSeparator(position);
            position++;
        }

        if (hasMultilegPriceMethod)
        {
            buffer.putBytes(position, multilegPriceMethodHeader, 0, multilegPriceMethodHeaderLength);
            position += multilegPriceMethodHeaderLength;
            position += buffer.putIntAscii(position, multilegPriceMethod);
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

        if (currencyLength > 0)
        {
            buffer.putBytes(position, currencyHeader, 0, currencyHeaderLength);
            position += currencyHeaderLength;
            buffer.putBytes(position, currency, currencyOffset, currencyLength);
            position += currencyLength;
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

        if (iOIIDLength > 0)
        {
            buffer.putBytes(position, iOIIDHeader, 0, iOIIDHeaderLength);
            position += iOIIDHeaderLength;
            buffer.putBytes(position, iOIID, iOIIDOffset, iOIIDLength);
            position += iOIIDLength;
            buffer.putSeparator(position);
            position++;
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

        if (hasRiskFreeRate)
        {
            buffer.putBytes(position, riskFreeRateHeader, 0, riskFreeRateHeaderLength);
            position += riskFreeRateHeaderLength;
            position += buffer.putFloatAscii(position, riskFreeRate);
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

        if (hasMultiLegRptTypeReq)
        {
            buffer.putBytes(position, multiLegRptTypeReqHeader, 0, multiLegRptTypeReqHeaderLength);
            position += multiLegRptTypeReqHeaderLength;
            position += buffer.putIntAscii(position, multiLegRptTypeReq);
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
        this.resetOrderID();
        this.resetOrigClOrdID();
        this.resetClOrdID();
        this.resetSecondaryClOrdID();
        this.resetClOrdLinkID();
        this.resetOrigOrdModTime();
        this.resetTradeOriginationDate();
        this.resetTradeDate();
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
        this.resetProcessCode();
        this.resetSide();
        this.resetPrevClosePx();
        this.resetSwapPoints();
        this.resetLocateReqd();
        this.resetTransactTime();
        this.resetQtyType();
        this.resetOrdType();
        this.resetMultilegModel();
        this.resetMultilegPriceMethod();
        this.resetPriceType();
        this.resetPrice();
        this.resetPriceProtectionScope();
        this.resetStopPx();
        this.resetCurrency();
        this.resetComplianceID();
        this.resetSolicitedFlag();
        this.resetIOIID();
        this.resetQuoteID();
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
        this.resetPositionEffect();
        this.resetCoveredOrUncovered();
        this.resetMaxShow();
        this.resetTargetStrategy();
        this.resetTargetStrategyParameters();
        this.resetRiskFreeRate();
        this.resetParticipationRate();
        this.resetCancellationRights();
        this.resetMoneyLaunderingStatus();
        this.resetRegistID();
        this.resetDesignation();
        this.resetMultiLegRptTypeReq();
        parties.reset();
        preAllocMlegGrp.reset();
        displayInstruction.reset();
        trdgSesGrp.reset();
        instrument.reset();
        undInstrmtGrp.reset();
        legOrdGrp.reset();
        orderQtyData.reset();
        triggeringInstruction.reset();
        commissionData.reset();
        pegInstructions.reset();
        discretionInstructions.reset();
        strategyParametersGrp.reset();
    }

    public void resetOrderID()
    {
        orderIDLength = 0;
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

    public void resetOrigOrdModTime()
    {
        origOrdModTimeLength = 0;
    }

    public void resetTradeOriginationDate()
    {
        tradeOriginationDateLength = 0;
    }

    public void resetTradeDate()
    {
        tradeDateLength = 0;
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

    public void resetProcessCode()
    {
        hasProcessCode = false;
    }

    public void resetSide()
    {
        side = MISSING_CHAR;
    }

    public void resetPrevClosePx()
    {
        hasPrevClosePx = false;
    }

    public void resetSwapPoints()
    {
        hasSwapPoints = false;
    }

    public void resetLocateReqd()
    {
        hasLocateReqd = false;
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

    public void resetMultilegModel()
    {
        hasMultilegModel = false;
    }

    public void resetMultilegPriceMethod()
    {
        hasMultilegPriceMethod = false;
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

    public void resetCurrency()
    {
        currencyLength = 0;
    }

    public void resetComplianceID()
    {
        complianceIDLength = 0;
    }

    public void resetSolicitedFlag()
    {
        hasSolicitedFlag = false;
    }

    public void resetIOIID()
    {
        iOIIDLength = 0;
    }

    public void resetQuoteID()
    {
        quoteIDLength = 0;
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

    public void resetTargetStrategy()
    {
        hasTargetStrategy = false;
    }

    public void resetTargetStrategyParameters()
    {
        targetStrategyParametersLength = 0;
    }

    public void resetRiskFreeRate()
    {
        hasRiskFreeRate = false;
    }

    public void resetParticipationRate()
    {
        hasParticipationRate = false;
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

    public void resetMultiLegRptTypeReq()
    {
        hasMultiLegRptTypeReq = false;
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
        builder.append("\"MessageName\": \"MultilegOrderCancelReplace\",\n");
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

        if (hasOrigOrdModTime())
        {
            indent(builder, level);
            builder.append("\"OrigOrdModTime\": \"");
            appendBuffer(builder, origOrdModTime, origOrdModTimeOffset, origOrdModTimeLength);
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
    builder.append("\"PreAllocMlegGrp\": ");
    preAllocMlegGrp.appendTo(builder, level + 1);
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

        if (hasProcessCode())
        {
            indent(builder, level);
            builder.append("\"ProcessCode\": \"");
            builder.append(processCode);
            builder.append("\",\n");
        }

        if (hasSide())
        {
            indent(builder, level);
            builder.append("\"Side\": \"");
            builder.append(side);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"Instrument\": ");
    instrument.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"UndInstrmtGrp\": ");
    undInstrmtGrp.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasPrevClosePx())
        {
            indent(builder, level);
            builder.append("\"PrevClosePx\": \"");
            prevClosePx.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasSwapPoints())
        {
            indent(builder, level);
            builder.append("\"SwapPoints\": \"");
            swapPoints.appendTo(builder);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"LegOrdGrp\": ");
    legOrdGrp.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasLocateReqd())
        {
            indent(builder, level);
            builder.append("\"LocateReqd\": \"");
            builder.append(locateReqd);
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

        if (hasMultilegModel())
        {
            indent(builder, level);
            builder.append("\"MultilegModel\": \"");
            builder.append(multilegModel);
            builder.append("\",\n");
        }

        if (hasMultilegPriceMethod())
        {
            indent(builder, level);
            builder.append("\"MultilegPriceMethod\": \"");
            builder.append(multilegPriceMethod);
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

        if (hasCurrency())
        {
            indent(builder, level);
            builder.append("\"Currency\": \"");
            appendBuffer(builder, currency, currencyOffset, currencyLength);
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

        if (hasIOIID())
        {
            indent(builder, level);
            builder.append("\"IOIID\": \"");
            appendBuffer(builder, iOIID, iOIIDOffset, iOIIDLength);
            builder.append("\",\n");
        }

        if (hasQuoteID())
        {
            indent(builder, level);
            builder.append("\"QuoteID\": \"");
            appendBuffer(builder, quoteID, quoteIDOffset, quoteIDLength);
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

        if (hasRiskFreeRate())
        {
            indent(builder, level);
            builder.append("\"RiskFreeRate\": \"");
            riskFreeRate.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasParticipationRate())
        {
            indent(builder, level);
            builder.append("\"ParticipationRate\": \"");
            participationRate.appendTo(builder);
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

        if (hasMultiLegRptTypeReq())
        {
            indent(builder, level);
            builder.append("\"MultiLegRptTypeReq\": \"");
            builder.append(multiLegRptTypeReq);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public MultilegOrderCancelReplaceEncoder copyTo(final Encoder encoder)
    {
        return copyTo((MultilegOrderCancelReplaceEncoder)encoder);
    }

    public MultilegOrderCancelReplaceEncoder copyTo(final MultilegOrderCancelReplaceEncoder encoder)
    {
        encoder.reset();
        if (hasOrderID())
        {
            encoder.orderIDAsCopy(orderID.byteArray(), 0, orderIDLength);
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

        if (hasOrigOrdModTime())
        {
            encoder.origOrdModTimeAsCopy(origOrdModTime.byteArray(), 0, origOrdModTimeLength);
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


        preAllocMlegGrp.copyTo(encoder.preAllocMlegGrp());
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
        if (hasProcessCode())
        {
            encoder.processCode(this.processCode());
        }

        if (hasSide())
        {
            encoder.side(this.side());
        }


        instrument.copyTo(encoder.instrument());

        undInstrmtGrp.copyTo(encoder.undInstrmtGrp());
        if (hasPrevClosePx())
        {
            encoder.prevClosePx(this.prevClosePx());
        }

        if (hasSwapPoints())
        {
            encoder.swapPoints(this.swapPoints());
        }


        legOrdGrp.copyTo(encoder.legOrdGrp());
        if (hasLocateReqd())
        {
            encoder.locateReqd(this.locateReqd());
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

        if (hasMultilegModel())
        {
            encoder.multilegModel(this.multilegModel());
        }

        if (hasMultilegPriceMethod())
        {
            encoder.multilegPriceMethod(this.multilegPriceMethod());
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
        if (hasCurrency())
        {
            encoder.currencyAsCopy(currency.byteArray(), 0, currencyLength);
        }

        if (hasComplianceID())
        {
            encoder.complianceIDAsCopy(complianceID.byteArray(), 0, complianceIDLength);
        }

        if (hasSolicitedFlag())
        {
            encoder.solicitedFlag(this.solicitedFlag());
        }

        if (hasIOIID())
        {
            encoder.iOIIDAsCopy(iOIID.byteArray(), 0, iOIIDLength);
        }

        if (hasQuoteID())
        {
            encoder.quoteIDAsCopy(quoteID.byteArray(), 0, quoteIDLength);
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

        if (hasRiskFreeRate())
        {
            encoder.riskFreeRate(this.riskFreeRate());
        }

        if (hasParticipationRate())
        {
            encoder.participationRate(this.participationRate());
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

        if (hasMultiLegRptTypeReq())
        {
            encoder.multiLegRptTypeReq(this.multiLegRptTypeReq());
        }
        return encoder;
    }

}
