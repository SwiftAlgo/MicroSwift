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


public class CrossOrderCancelReplaceRequestEncoder implements Encoder
{
    public long messageType()
    {
        return 116L;
    }

    public CrossOrderCancelReplaceRequestEncoder()
    {
        header.msgType("t");
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

    private static final int crossIDHeaderLength = 4;
    private static final byte[] crossIDHeader = new byte[] {53, 52, 56, (byte) '='};

    private static final int origCrossIDHeaderLength = 4;
    private static final byte[] origCrossIDHeader = new byte[] {53, 53, 49, (byte) '='};

    private static final int hostCrossIDHeaderLength = 4;
    private static final byte[] hostCrossIDHeader = new byte[] {57, 54, 49, (byte) '='};

    private static final int crossTypeHeaderLength = 4;
    private static final byte[] crossTypeHeader = new byte[] {53, 52, 57, (byte) '='};

    private static final int crossPrioritizationHeaderLength = 4;
    private static final byte[] crossPrioritizationHeader = new byte[] {53, 53, 48, (byte) '='};

    private static final int settlTypeHeaderLength = 3;
    private static final byte[] settlTypeHeader = new byte[] {54, 51, (byte) '='};

    private static final int settlDateHeaderLength = 3;
    private static final byte[] settlDateHeader = new byte[] {54, 52, (byte) '='};

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

    private static final int prevClosePxHeaderLength = 4;
    private static final byte[] prevClosePxHeader = new byte[] {49, 52, 48, (byte) '='};

    private static final int locateReqdHeaderLength = 4;
    private static final byte[] locateReqdHeader = new byte[] {49, 49, 52, (byte) '='};

    private static final int transactTimeHeaderLength = 3;
    private static final byte[] transactTimeHeader = new byte[] {54, 48, (byte) '='};

    private static final int transBkdTimeHeaderLength = 4;
    private static final byte[] transBkdTimeHeader = new byte[] {52, 56, 51, (byte) '='};

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

    private static final int currencyHeaderLength = 3;
    private static final byte[] currencyHeader = new byte[] {49, 53, (byte) '='};

    private static final int complianceIDHeaderLength = 4;
    private static final byte[] complianceIDHeader = new byte[] {51, 55, 54, (byte) '='};

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

    private static final int maxShowHeaderLength = 4;
    private static final byte[] maxShowHeader = new byte[] {50, 49, 48, (byte) '='};

    private static final int targetStrategyHeaderLength = 4;
    private static final byte[] targetStrategyHeader = new byte[] {56, 52, 55, (byte) '='};

    private static final int targetStrategyParametersHeaderLength = 4;
    private static final byte[] targetStrategyParametersHeader = new byte[] {56, 52, 56, (byte) '='};

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

    private final MutableDirectBuffer orderID = new UnsafeBuffer();

    private int orderIDOffset = 0;

    private int orderIDLength = 0;

    public CrossOrderCancelReplaceRequestEncoder orderID(final DirectBuffer value, final int offset, final int length)
    {
        orderID.wrap(value);
        orderIDOffset = offset;
        orderIDLength = length;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder orderID(final DirectBuffer value, final int length)
    {
        return orderID(value, 0, length);
    }

    public CrossOrderCancelReplaceRequestEncoder orderID(final DirectBuffer value)
    {
        return orderID(value, 0, value.capacity());
    }

    public CrossOrderCancelReplaceRequestEncoder orderID(final byte[] value, final int offset, final int length)
    {
        orderID.wrap(value);
        orderIDOffset = offset;
        orderIDLength = length;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder orderIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(orderID, value, offset, length);
        orderIDOffset = offset;
        orderIDLength = length;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder orderID(final byte[] value, final int length)
    {
        return orderID(value, 0, length);
    }

    public CrossOrderCancelReplaceRequestEncoder orderID(final byte[] value)
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

    public CrossOrderCancelReplaceRequestEncoder orderID(final CharSequence value)
    {
        toBytes(value, orderID);
        orderIDOffset = 0;
        orderIDLength = value.length();
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder orderID(final AsciiSequenceView value)
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

    public CrossOrderCancelReplaceRequestEncoder orderID(final char[] value)
    {
        return orderID(value, 0, value.length);
    }

    public CrossOrderCancelReplaceRequestEncoder orderID(final char[] value, final int length)
    {
        return orderID(value, 0, length);
    }

    public CrossOrderCancelReplaceRequestEncoder orderID(final char[] value, final int offset, final int length)
    {
        toBytes(value, orderID, offset, length);
        orderIDOffset = 0;
        orderIDLength = length;
        return this;
    }

    private final MutableDirectBuffer crossID = new UnsafeBuffer();

    private int crossIDOffset = 0;

    private int crossIDLength = 0;

    public CrossOrderCancelReplaceRequestEncoder crossID(final DirectBuffer value, final int offset, final int length)
    {
        crossID.wrap(value);
        crossIDOffset = offset;
        crossIDLength = length;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder crossID(final DirectBuffer value, final int length)
    {
        return crossID(value, 0, length);
    }

    public CrossOrderCancelReplaceRequestEncoder crossID(final DirectBuffer value)
    {
        return crossID(value, 0, value.capacity());
    }

    public CrossOrderCancelReplaceRequestEncoder crossID(final byte[] value, final int offset, final int length)
    {
        crossID.wrap(value);
        crossIDOffset = offset;
        crossIDLength = length;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder crossIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(crossID, value, offset, length);
        crossIDOffset = offset;
        crossIDLength = length;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder crossID(final byte[] value, final int length)
    {
        return crossID(value, 0, length);
    }

    public CrossOrderCancelReplaceRequestEncoder crossID(final byte[] value)
    {
        return crossID(value, 0, value.length);
    }

    public boolean hasCrossID()
    {
        return crossIDLength > 0;
    }

    public MutableDirectBuffer crossID()
    {
        return crossID;
    }

    public String crossIDAsString()
    {
        return crossID.getStringWithoutLengthAscii(crossIDOffset, crossIDLength);
    }

    public CrossOrderCancelReplaceRequestEncoder crossID(final CharSequence value)
    {
        toBytes(value, crossID);
        crossIDOffset = 0;
        crossIDLength = value.length();
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder crossID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            crossID.wrap(buffer);
            crossIDOffset = value.offset();
            crossIDLength = value.length();
        }
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder crossID(final char[] value)
    {
        return crossID(value, 0, value.length);
    }

    public CrossOrderCancelReplaceRequestEncoder crossID(final char[] value, final int length)
    {
        return crossID(value, 0, length);
    }

    public CrossOrderCancelReplaceRequestEncoder crossID(final char[] value, final int offset, final int length)
    {
        toBytes(value, crossID, offset, length);
        crossIDOffset = 0;
        crossIDLength = length;
        return this;
    }

    private final MutableDirectBuffer origCrossID = new UnsafeBuffer();

    private int origCrossIDOffset = 0;

    private int origCrossIDLength = 0;

    public CrossOrderCancelReplaceRequestEncoder origCrossID(final DirectBuffer value, final int offset, final int length)
    {
        origCrossID.wrap(value);
        origCrossIDOffset = offset;
        origCrossIDLength = length;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder origCrossID(final DirectBuffer value, final int length)
    {
        return origCrossID(value, 0, length);
    }

    public CrossOrderCancelReplaceRequestEncoder origCrossID(final DirectBuffer value)
    {
        return origCrossID(value, 0, value.capacity());
    }

    public CrossOrderCancelReplaceRequestEncoder origCrossID(final byte[] value, final int offset, final int length)
    {
        origCrossID.wrap(value);
        origCrossIDOffset = offset;
        origCrossIDLength = length;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder origCrossIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(origCrossID, value, offset, length);
        origCrossIDOffset = offset;
        origCrossIDLength = length;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder origCrossID(final byte[] value, final int length)
    {
        return origCrossID(value, 0, length);
    }

    public CrossOrderCancelReplaceRequestEncoder origCrossID(final byte[] value)
    {
        return origCrossID(value, 0, value.length);
    }

    public boolean hasOrigCrossID()
    {
        return origCrossIDLength > 0;
    }

    public MutableDirectBuffer origCrossID()
    {
        return origCrossID;
    }

    public String origCrossIDAsString()
    {
        return origCrossID.getStringWithoutLengthAscii(origCrossIDOffset, origCrossIDLength);
    }

    public CrossOrderCancelReplaceRequestEncoder origCrossID(final CharSequence value)
    {
        toBytes(value, origCrossID);
        origCrossIDOffset = 0;
        origCrossIDLength = value.length();
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder origCrossID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            origCrossID.wrap(buffer);
            origCrossIDOffset = value.offset();
            origCrossIDLength = value.length();
        }
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder origCrossID(final char[] value)
    {
        return origCrossID(value, 0, value.length);
    }

    public CrossOrderCancelReplaceRequestEncoder origCrossID(final char[] value, final int length)
    {
        return origCrossID(value, 0, length);
    }

    public CrossOrderCancelReplaceRequestEncoder origCrossID(final char[] value, final int offset, final int length)
    {
        toBytes(value, origCrossID, offset, length);
        origCrossIDOffset = 0;
        origCrossIDLength = length;
        return this;
    }

    private final MutableDirectBuffer hostCrossID = new UnsafeBuffer();

    private int hostCrossIDOffset = 0;

    private int hostCrossIDLength = 0;

    public CrossOrderCancelReplaceRequestEncoder hostCrossID(final DirectBuffer value, final int offset, final int length)
    {
        hostCrossID.wrap(value);
        hostCrossIDOffset = offset;
        hostCrossIDLength = length;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder hostCrossID(final DirectBuffer value, final int length)
    {
        return hostCrossID(value, 0, length);
    }

    public CrossOrderCancelReplaceRequestEncoder hostCrossID(final DirectBuffer value)
    {
        return hostCrossID(value, 0, value.capacity());
    }

    public CrossOrderCancelReplaceRequestEncoder hostCrossID(final byte[] value, final int offset, final int length)
    {
        hostCrossID.wrap(value);
        hostCrossIDOffset = offset;
        hostCrossIDLength = length;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder hostCrossIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(hostCrossID, value, offset, length);
        hostCrossIDOffset = offset;
        hostCrossIDLength = length;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder hostCrossID(final byte[] value, final int length)
    {
        return hostCrossID(value, 0, length);
    }

    public CrossOrderCancelReplaceRequestEncoder hostCrossID(final byte[] value)
    {
        return hostCrossID(value, 0, value.length);
    }

    public boolean hasHostCrossID()
    {
        return hostCrossIDLength > 0;
    }

    public MutableDirectBuffer hostCrossID()
    {
        return hostCrossID;
    }

    public String hostCrossIDAsString()
    {
        return hostCrossID.getStringWithoutLengthAscii(hostCrossIDOffset, hostCrossIDLength);
    }

    public CrossOrderCancelReplaceRequestEncoder hostCrossID(final CharSequence value)
    {
        toBytes(value, hostCrossID);
        hostCrossIDOffset = 0;
        hostCrossIDLength = value.length();
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder hostCrossID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            hostCrossID.wrap(buffer);
            hostCrossIDOffset = value.offset();
            hostCrossIDLength = value.length();
        }
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder hostCrossID(final char[] value)
    {
        return hostCrossID(value, 0, value.length);
    }

    public CrossOrderCancelReplaceRequestEncoder hostCrossID(final char[] value, final int length)
    {
        return hostCrossID(value, 0, length);
    }

    public CrossOrderCancelReplaceRequestEncoder hostCrossID(final char[] value, final int offset, final int length)
    {
        toBytes(value, hostCrossID, offset, length);
        hostCrossIDOffset = 0;
        hostCrossIDLength = length;
        return this;
    }

    private int crossType;

    private boolean hasCrossType;

    public boolean hasCrossType()
    {
        return hasCrossType;
    }

    public CrossOrderCancelReplaceRequestEncoder crossType(int value)
    {
        crossType = value;
        hasCrossType = true;
        return this;
    }

    public int crossType()
    {
        return crossType;
    }

    public CrossOrderCancelReplaceRequestEncoder crossType(CrossType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == CrossType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: crossType Value: " + value );
            }
            if (value == CrossType.NULL_VAL)
            {
                return this;
            }
        }
        return crossType(value.representation());
    }

    private int crossPrioritization;

    private boolean hasCrossPrioritization;

    public boolean hasCrossPrioritization()
    {
        return hasCrossPrioritization;
    }

    public CrossOrderCancelReplaceRequestEncoder crossPrioritization(int value)
    {
        crossPrioritization = value;
        hasCrossPrioritization = true;
        return this;
    }

    public int crossPrioritization()
    {
        return crossPrioritization;
    }

    public CrossOrderCancelReplaceRequestEncoder crossPrioritization(CrossPrioritization value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == CrossPrioritization.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: crossPrioritization Value: " + value );
            }
            if (value == CrossPrioritization.NULL_VAL)
            {
                return this;
            }
        }
        return crossPrioritization(value.representation());
    }

    private final RootPartiesEncoder rootParties = new RootPartiesEncoder();
    public RootPartiesEncoder rootParties()
    {
        return rootParties;
    }

    private final SideCrossOrdModGrpEncoder sideCrossOrdModGrp = new SideCrossOrdModGrpEncoder();
    public SideCrossOrdModGrpEncoder sideCrossOrdModGrp()
    {
        return sideCrossOrdModGrp;
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

    private final InstrmtLegGrpEncoder instrmtLegGrp = new InstrmtLegGrpEncoder();
    public InstrmtLegGrpEncoder instrmtLegGrp()
    {
        return instrmtLegGrp;
    }

    private final MutableDirectBuffer settlType = new UnsafeBuffer();

    private int settlTypeOffset = 0;

    private int settlTypeLength = 0;

    public CrossOrderCancelReplaceRequestEncoder settlType(final DirectBuffer value, final int offset, final int length)
    {
        settlType.wrap(value);
        settlTypeOffset = offset;
        settlTypeLength = length;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder settlType(final DirectBuffer value, final int length)
    {
        return settlType(value, 0, length);
    }

    public CrossOrderCancelReplaceRequestEncoder settlType(final DirectBuffer value)
    {
        return settlType(value, 0, value.capacity());
    }

    public CrossOrderCancelReplaceRequestEncoder settlType(final byte[] value, final int offset, final int length)
    {
        settlType.wrap(value);
        settlTypeOffset = offset;
        settlTypeLength = length;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder settlTypeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlType, value, offset, length);
        settlTypeOffset = offset;
        settlTypeLength = length;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder settlType(final byte[] value, final int length)
    {
        return settlType(value, 0, length);
    }

    public CrossOrderCancelReplaceRequestEncoder settlType(final byte[] value)
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

    public CrossOrderCancelReplaceRequestEncoder settlType(final CharSequence value)
    {
        toBytes(value, settlType);
        settlTypeOffset = 0;
        settlTypeLength = value.length();
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder settlType(final AsciiSequenceView value)
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

    public CrossOrderCancelReplaceRequestEncoder settlType(final char[] value)
    {
        return settlType(value, 0, value.length);
    }

    public CrossOrderCancelReplaceRequestEncoder settlType(final char[] value, final int length)
    {
        return settlType(value, 0, length);
    }

    public CrossOrderCancelReplaceRequestEncoder settlType(final char[] value, final int offset, final int length)
    {
        toBytes(value, settlType, offset, length);
        settlTypeOffset = 0;
        settlTypeLength = length;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder settlType(SettlType value)
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

    public CrossOrderCancelReplaceRequestEncoder settlDate(final DirectBuffer value, final int offset, final int length)
    {
        settlDate.wrap(value);
        settlDateOffset = offset;
        settlDateLength = length;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder settlDate(final DirectBuffer value, final int length)
    {
        return settlDate(value, 0, length);
    }

    public CrossOrderCancelReplaceRequestEncoder settlDate(final DirectBuffer value)
    {
        return settlDate(value, 0, value.capacity());
    }

    public CrossOrderCancelReplaceRequestEncoder settlDate(final byte[] value, final int offset, final int length)
    {
        settlDate.wrap(value);
        settlDateOffset = offset;
        settlDateLength = length;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder settlDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlDate, value, offset, length);
        settlDateOffset = offset;
        settlDateLength = length;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder settlDate(final byte[] value, final int length)
    {
        return settlDate(value, 0, length);
    }

    public CrossOrderCancelReplaceRequestEncoder settlDate(final byte[] value)
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

    private char handlInst;

    private boolean hasHandlInst;

    public boolean hasHandlInst()
    {
        return hasHandlInst;
    }

    public CrossOrderCancelReplaceRequestEncoder handlInst(char value)
    {
        handlInst = value;
        hasHandlInst = true;
        return this;
    }

    public char handlInst()
    {
        return handlInst;
    }

    public CrossOrderCancelReplaceRequestEncoder handlInst(HandlInst value)
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

    public CrossOrderCancelReplaceRequestEncoder execInst(final DirectBuffer value, final int offset, final int length)
    {
        execInst.wrap(value);
        execInstOffset = offset;
        execInstLength = length;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder execInst(final DirectBuffer value, final int length)
    {
        return execInst(value, 0, length);
    }

    public CrossOrderCancelReplaceRequestEncoder execInst(final DirectBuffer value)
    {
        return execInst(value, 0, value.capacity());
    }

    public CrossOrderCancelReplaceRequestEncoder execInst(final byte[] value, final int offset, final int length)
    {
        execInst.wrap(value);
        execInstOffset = offset;
        execInstLength = length;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder execInstAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(execInst, value, offset, length);
        execInstOffset = offset;
        execInstLength = length;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder execInst(final byte[] value, final int length)
    {
        return execInst(value, 0, length);
    }

    public CrossOrderCancelReplaceRequestEncoder execInst(final byte[] value)
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

    public CrossOrderCancelReplaceRequestEncoder execInst(final CharSequence value)
    {
        toBytes(value, execInst);
        execInstOffset = 0;
        execInstLength = value.length();
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder execInst(final AsciiSequenceView value)
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

    public CrossOrderCancelReplaceRequestEncoder execInst(final char[] value)
    {
        return execInst(value, 0, value.length);
    }

    public CrossOrderCancelReplaceRequestEncoder execInst(final char[] value, final int length)
    {
        return execInst(value, 0, length);
    }

    public CrossOrderCancelReplaceRequestEncoder execInst(final char[] value, final int offset, final int length)
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

    public CrossOrderCancelReplaceRequestEncoder minQty(DecimalFloat value)
    {
        minQty.set(value);
        hasMinQty = true;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder minQty(long value, int scale)
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

    public CrossOrderCancelReplaceRequestEncoder matchIncrement(DecimalFloat value)
    {
        matchIncrement.set(value);
        hasMatchIncrement = true;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder matchIncrement(long value, int scale)
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

    public CrossOrderCancelReplaceRequestEncoder maxPriceLevels(int value)
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

    public CrossOrderCancelReplaceRequestEncoder maxFloor(DecimalFloat value)
    {
        maxFloor.set(value);
        hasMaxFloor = true;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder maxFloor(long value, int scale)
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

    public CrossOrderCancelReplaceRequestEncoder exDestination(final DirectBuffer value, final int offset, final int length)
    {
        exDestination.wrap(value);
        exDestinationOffset = offset;
        exDestinationLength = length;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder exDestination(final DirectBuffer value, final int length)
    {
        return exDestination(value, 0, length);
    }

    public CrossOrderCancelReplaceRequestEncoder exDestination(final DirectBuffer value)
    {
        return exDestination(value, 0, value.capacity());
    }

    public CrossOrderCancelReplaceRequestEncoder exDestination(final byte[] value, final int offset, final int length)
    {
        exDestination.wrap(value);
        exDestinationOffset = offset;
        exDestinationLength = length;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder exDestinationAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(exDestination, value, offset, length);
        exDestinationOffset = offset;
        exDestinationLength = length;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder exDestination(final byte[] value, final int length)
    {
        return exDestination(value, 0, length);
    }

    public CrossOrderCancelReplaceRequestEncoder exDestination(final byte[] value)
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

    public CrossOrderCancelReplaceRequestEncoder exDestination(final CharSequence value)
    {
        toBytes(value, exDestination);
        exDestinationOffset = 0;
        exDestinationLength = value.length();
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder exDestination(final AsciiSequenceView value)
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

    public CrossOrderCancelReplaceRequestEncoder exDestination(final char[] value)
    {
        return exDestination(value, 0, value.length);
    }

    public CrossOrderCancelReplaceRequestEncoder exDestination(final char[] value, final int length)
    {
        return exDestination(value, 0, length);
    }

    public CrossOrderCancelReplaceRequestEncoder exDestination(final char[] value, final int offset, final int length)
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

    public CrossOrderCancelReplaceRequestEncoder exDestinationIDSource(char value)
    {
        exDestinationIDSource = value;
        hasExDestinationIDSource = true;
        return this;
    }

    public char exDestinationIDSource()
    {
        return exDestinationIDSource;
    }

    public CrossOrderCancelReplaceRequestEncoder exDestinationIDSource(ExDestinationIDSource value)
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

    public CrossOrderCancelReplaceRequestEncoder processCode(char value)
    {
        processCode = value;
        hasProcessCode = true;
        return this;
    }

    public char processCode()
    {
        return processCode;
    }

    public CrossOrderCancelReplaceRequestEncoder processCode(ProcessCode value)
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

    private final DecimalFloat prevClosePx = new DecimalFloat();

    private boolean hasPrevClosePx;

    public boolean hasPrevClosePx()
    {
        return hasPrevClosePx;
    }

    public CrossOrderCancelReplaceRequestEncoder prevClosePx(DecimalFloat value)
    {
        prevClosePx.set(value);
        hasPrevClosePx = true;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder prevClosePx(long value, int scale)
    {
        prevClosePx.set(value, scale);
        hasPrevClosePx = true;
        return this;
    }

    public DecimalFloat prevClosePx()
    {
        return prevClosePx;
    }

    private boolean locateReqd;

    private boolean hasLocateReqd;

    public boolean hasLocateReqd()
    {
        return hasLocateReqd;
    }

    public CrossOrderCancelReplaceRequestEncoder locateReqd(boolean value)
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

    public CrossOrderCancelReplaceRequestEncoder transactTime(final DirectBuffer value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder transactTime(final DirectBuffer value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public CrossOrderCancelReplaceRequestEncoder transactTime(final DirectBuffer value)
    {
        return transactTime(value, 0, value.capacity());
    }

    public CrossOrderCancelReplaceRequestEncoder transactTime(final byte[] value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder transactTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(transactTime, value, offset, length);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder transactTime(final byte[] value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public CrossOrderCancelReplaceRequestEncoder transactTime(final byte[] value)
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

    private final MutableDirectBuffer transBkdTime = new UnsafeBuffer();

    private int transBkdTimeOffset = 0;

    private int transBkdTimeLength = 0;

    public CrossOrderCancelReplaceRequestEncoder transBkdTime(final DirectBuffer value, final int offset, final int length)
    {
        transBkdTime.wrap(value);
        transBkdTimeOffset = offset;
        transBkdTimeLength = length;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder transBkdTime(final DirectBuffer value, final int length)
    {
        return transBkdTime(value, 0, length);
    }

    public CrossOrderCancelReplaceRequestEncoder transBkdTime(final DirectBuffer value)
    {
        return transBkdTime(value, 0, value.capacity());
    }

    public CrossOrderCancelReplaceRequestEncoder transBkdTime(final byte[] value, final int offset, final int length)
    {
        transBkdTime.wrap(value);
        transBkdTimeOffset = offset;
        transBkdTimeLength = length;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder transBkdTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(transBkdTime, value, offset, length);
        transBkdTimeOffset = offset;
        transBkdTimeLength = length;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder transBkdTime(final byte[] value, final int length)
    {
        return transBkdTime(value, 0, length);
    }

    public CrossOrderCancelReplaceRequestEncoder transBkdTime(final byte[] value)
    {
        return transBkdTime(value, 0, value.length);
    }

    public boolean hasTransBkdTime()
    {
        return transBkdTimeLength > 0;
    }

    public MutableDirectBuffer transBkdTime()
    {
        return transBkdTime;
    }

    public String transBkdTimeAsString()
    {
        return transBkdTime.getStringWithoutLengthAscii(transBkdTimeOffset, transBkdTimeLength);
    }

    private final StipulationsEncoder stipulations = new StipulationsEncoder();
    public StipulationsEncoder stipulations()
    {
        return stipulations;
    }

    private char ordType;

    private boolean hasOrdType;

    public boolean hasOrdType()
    {
        return hasOrdType;
    }

    public CrossOrderCancelReplaceRequestEncoder ordType(char value)
    {
        ordType = value;
        hasOrdType = true;
        return this;
    }

    public char ordType()
    {
        return ordType;
    }

    public CrossOrderCancelReplaceRequestEncoder ordType(OrdType value)
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

    public CrossOrderCancelReplaceRequestEncoder priceType(int value)
    {
        priceType = value;
        hasPriceType = true;
        return this;
    }

    public int priceType()
    {
        return priceType;
    }

    public CrossOrderCancelReplaceRequestEncoder priceType(PriceType value)
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

    public CrossOrderCancelReplaceRequestEncoder price(DecimalFloat value)
    {
        price.set(value);
        hasPrice = true;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder price(long value, int scale)
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

    public CrossOrderCancelReplaceRequestEncoder priceProtectionScope(char value)
    {
        priceProtectionScope = value;
        hasPriceProtectionScope = true;
        return this;
    }

    public char priceProtectionScope()
    {
        return priceProtectionScope;
    }

    public CrossOrderCancelReplaceRequestEncoder priceProtectionScope(PriceProtectionScope value)
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

    public CrossOrderCancelReplaceRequestEncoder stopPx(DecimalFloat value)
    {
        stopPx.set(value);
        hasStopPx = true;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder stopPx(long value, int scale)
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

    private final MutableDirectBuffer currency = new UnsafeBuffer();

    private int currencyOffset = 0;

    private int currencyLength = 0;

    public CrossOrderCancelReplaceRequestEncoder currency(final DirectBuffer value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder currency(final DirectBuffer value, final int length)
    {
        return currency(value, 0, length);
    }

    public CrossOrderCancelReplaceRequestEncoder currency(final DirectBuffer value)
    {
        return currency(value, 0, value.capacity());
    }

    public CrossOrderCancelReplaceRequestEncoder currency(final byte[] value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder currencyAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(currency, value, offset, length);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder currency(final byte[] value, final int length)
    {
        return currency(value, 0, length);
    }

    public CrossOrderCancelReplaceRequestEncoder currency(final byte[] value)
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

    public CrossOrderCancelReplaceRequestEncoder currency(final CharSequence value)
    {
        toBytes(value, currency);
        currencyOffset = 0;
        currencyLength = value.length();
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder currency(final AsciiSequenceView value)
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

    public CrossOrderCancelReplaceRequestEncoder currency(final char[] value)
    {
        return currency(value, 0, value.length);
    }

    public CrossOrderCancelReplaceRequestEncoder currency(final char[] value, final int length)
    {
        return currency(value, 0, length);
    }

    public CrossOrderCancelReplaceRequestEncoder currency(final char[] value, final int offset, final int length)
    {
        toBytes(value, currency, offset, length);
        currencyOffset = 0;
        currencyLength = length;
        return this;
    }

    private final MutableDirectBuffer complianceID = new UnsafeBuffer();

    private int complianceIDOffset = 0;

    private int complianceIDLength = 0;

    public CrossOrderCancelReplaceRequestEncoder complianceID(final DirectBuffer value, final int offset, final int length)
    {
        complianceID.wrap(value);
        complianceIDOffset = offset;
        complianceIDLength = length;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder complianceID(final DirectBuffer value, final int length)
    {
        return complianceID(value, 0, length);
    }

    public CrossOrderCancelReplaceRequestEncoder complianceID(final DirectBuffer value)
    {
        return complianceID(value, 0, value.capacity());
    }

    public CrossOrderCancelReplaceRequestEncoder complianceID(final byte[] value, final int offset, final int length)
    {
        complianceID.wrap(value);
        complianceIDOffset = offset;
        complianceIDLength = length;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder complianceIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(complianceID, value, offset, length);
        complianceIDOffset = offset;
        complianceIDLength = length;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder complianceID(final byte[] value, final int length)
    {
        return complianceID(value, 0, length);
    }

    public CrossOrderCancelReplaceRequestEncoder complianceID(final byte[] value)
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

    public CrossOrderCancelReplaceRequestEncoder complianceID(final CharSequence value)
    {
        toBytes(value, complianceID);
        complianceIDOffset = 0;
        complianceIDLength = value.length();
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder complianceID(final AsciiSequenceView value)
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

    public CrossOrderCancelReplaceRequestEncoder complianceID(final char[] value)
    {
        return complianceID(value, 0, value.length);
    }

    public CrossOrderCancelReplaceRequestEncoder complianceID(final char[] value, final int length)
    {
        return complianceID(value, 0, length);
    }

    public CrossOrderCancelReplaceRequestEncoder complianceID(final char[] value, final int offset, final int length)
    {
        toBytes(value, complianceID, offset, length);
        complianceIDOffset = 0;
        complianceIDLength = length;
        return this;
    }

    private final MutableDirectBuffer iOIID = new UnsafeBuffer();

    private int iOIIDOffset = 0;

    private int iOIIDLength = 0;

    public CrossOrderCancelReplaceRequestEncoder iOIID(final DirectBuffer value, final int offset, final int length)
    {
        iOIID.wrap(value);
        iOIIDOffset = offset;
        iOIIDLength = length;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder iOIID(final DirectBuffer value, final int length)
    {
        return iOIID(value, 0, length);
    }

    public CrossOrderCancelReplaceRequestEncoder iOIID(final DirectBuffer value)
    {
        return iOIID(value, 0, value.capacity());
    }

    public CrossOrderCancelReplaceRequestEncoder iOIID(final byte[] value, final int offset, final int length)
    {
        iOIID.wrap(value);
        iOIIDOffset = offset;
        iOIIDLength = length;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder iOIIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(iOIID, value, offset, length);
        iOIIDOffset = offset;
        iOIIDLength = length;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder iOIID(final byte[] value, final int length)
    {
        return iOIID(value, 0, length);
    }

    public CrossOrderCancelReplaceRequestEncoder iOIID(final byte[] value)
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

    public CrossOrderCancelReplaceRequestEncoder iOIID(final CharSequence value)
    {
        toBytes(value, iOIID);
        iOIIDOffset = 0;
        iOIIDLength = value.length();
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder iOIID(final AsciiSequenceView value)
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

    public CrossOrderCancelReplaceRequestEncoder iOIID(final char[] value)
    {
        return iOIID(value, 0, value.length);
    }

    public CrossOrderCancelReplaceRequestEncoder iOIID(final char[] value, final int length)
    {
        return iOIID(value, 0, length);
    }

    public CrossOrderCancelReplaceRequestEncoder iOIID(final char[] value, final int offset, final int length)
    {
        toBytes(value, iOIID, offset, length);
        iOIIDOffset = 0;
        iOIIDLength = length;
        return this;
    }

    private final MutableDirectBuffer quoteID = new UnsafeBuffer();

    private int quoteIDOffset = 0;

    private int quoteIDLength = 0;

    public CrossOrderCancelReplaceRequestEncoder quoteID(final DirectBuffer value, final int offset, final int length)
    {
        quoteID.wrap(value);
        quoteIDOffset = offset;
        quoteIDLength = length;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder quoteID(final DirectBuffer value, final int length)
    {
        return quoteID(value, 0, length);
    }

    public CrossOrderCancelReplaceRequestEncoder quoteID(final DirectBuffer value)
    {
        return quoteID(value, 0, value.capacity());
    }

    public CrossOrderCancelReplaceRequestEncoder quoteID(final byte[] value, final int offset, final int length)
    {
        quoteID.wrap(value);
        quoteIDOffset = offset;
        quoteIDLength = length;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder quoteIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(quoteID, value, offset, length);
        quoteIDOffset = offset;
        quoteIDLength = length;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder quoteID(final byte[] value, final int length)
    {
        return quoteID(value, 0, length);
    }

    public CrossOrderCancelReplaceRequestEncoder quoteID(final byte[] value)
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

    public CrossOrderCancelReplaceRequestEncoder quoteID(final CharSequence value)
    {
        toBytes(value, quoteID);
        quoteIDOffset = 0;
        quoteIDLength = value.length();
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder quoteID(final AsciiSequenceView value)
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

    public CrossOrderCancelReplaceRequestEncoder quoteID(final char[] value)
    {
        return quoteID(value, 0, value.length);
    }

    public CrossOrderCancelReplaceRequestEncoder quoteID(final char[] value, final int length)
    {
        return quoteID(value, 0, length);
    }

    public CrossOrderCancelReplaceRequestEncoder quoteID(final char[] value, final int offset, final int length)
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

    public CrossOrderCancelReplaceRequestEncoder timeInForce(char value)
    {
        timeInForce = value;
        hasTimeInForce = true;
        return this;
    }

    public char timeInForce()
    {
        return timeInForce;
    }

    public CrossOrderCancelReplaceRequestEncoder timeInForce(TimeInForce value)
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

    public CrossOrderCancelReplaceRequestEncoder effectiveTime(final DirectBuffer value, final int offset, final int length)
    {
        effectiveTime.wrap(value);
        effectiveTimeOffset = offset;
        effectiveTimeLength = length;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder effectiveTime(final DirectBuffer value, final int length)
    {
        return effectiveTime(value, 0, length);
    }

    public CrossOrderCancelReplaceRequestEncoder effectiveTime(final DirectBuffer value)
    {
        return effectiveTime(value, 0, value.capacity());
    }

    public CrossOrderCancelReplaceRequestEncoder effectiveTime(final byte[] value, final int offset, final int length)
    {
        effectiveTime.wrap(value);
        effectiveTimeOffset = offset;
        effectiveTimeLength = length;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder effectiveTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(effectiveTime, value, offset, length);
        effectiveTimeOffset = offset;
        effectiveTimeLength = length;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder effectiveTime(final byte[] value, final int length)
    {
        return effectiveTime(value, 0, length);
    }

    public CrossOrderCancelReplaceRequestEncoder effectiveTime(final byte[] value)
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

    public CrossOrderCancelReplaceRequestEncoder expireDate(final DirectBuffer value, final int offset, final int length)
    {
        expireDate.wrap(value);
        expireDateOffset = offset;
        expireDateLength = length;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder expireDate(final DirectBuffer value, final int length)
    {
        return expireDate(value, 0, length);
    }

    public CrossOrderCancelReplaceRequestEncoder expireDate(final DirectBuffer value)
    {
        return expireDate(value, 0, value.capacity());
    }

    public CrossOrderCancelReplaceRequestEncoder expireDate(final byte[] value, final int offset, final int length)
    {
        expireDate.wrap(value);
        expireDateOffset = offset;
        expireDateLength = length;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder expireDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(expireDate, value, offset, length);
        expireDateOffset = offset;
        expireDateLength = length;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder expireDate(final byte[] value, final int length)
    {
        return expireDate(value, 0, length);
    }

    public CrossOrderCancelReplaceRequestEncoder expireDate(final byte[] value)
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

    public CrossOrderCancelReplaceRequestEncoder expireTime(final DirectBuffer value, final int offset, final int length)
    {
        expireTime.wrap(value);
        expireTimeOffset = offset;
        expireTimeLength = length;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder expireTime(final DirectBuffer value, final int length)
    {
        return expireTime(value, 0, length);
    }

    public CrossOrderCancelReplaceRequestEncoder expireTime(final DirectBuffer value)
    {
        return expireTime(value, 0, value.capacity());
    }

    public CrossOrderCancelReplaceRequestEncoder expireTime(final byte[] value, final int offset, final int length)
    {
        expireTime.wrap(value);
        expireTimeOffset = offset;
        expireTimeLength = length;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder expireTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(expireTime, value, offset, length);
        expireTimeOffset = offset;
        expireTimeLength = length;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder expireTime(final byte[] value, final int length)
    {
        return expireTime(value, 0, length);
    }

    public CrossOrderCancelReplaceRequestEncoder expireTime(final byte[] value)
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

    public CrossOrderCancelReplaceRequestEncoder gTBookingInst(int value)
    {
        gTBookingInst = value;
        hasGTBookingInst = true;
        return this;
    }

    public int gTBookingInst()
    {
        return gTBookingInst;
    }

    public CrossOrderCancelReplaceRequestEncoder gTBookingInst(GTBookingInst value)
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

    private final DecimalFloat maxShow = new DecimalFloat();

    private boolean hasMaxShow;

    public boolean hasMaxShow()
    {
        return hasMaxShow;
    }

    public CrossOrderCancelReplaceRequestEncoder maxShow(DecimalFloat value)
    {
        maxShow.set(value);
        hasMaxShow = true;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder maxShow(long value, int scale)
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

    public CrossOrderCancelReplaceRequestEncoder targetStrategy(int value)
    {
        targetStrategy = value;
        hasTargetStrategy = true;
        return this;
    }

    public int targetStrategy()
    {
        return targetStrategy;
    }

    public CrossOrderCancelReplaceRequestEncoder targetStrategy(TargetStrategy value)
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

    public CrossOrderCancelReplaceRequestEncoder targetStrategyParameters(final DirectBuffer value, final int offset, final int length)
    {
        targetStrategyParameters.wrap(value);
        targetStrategyParametersOffset = offset;
        targetStrategyParametersLength = length;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder targetStrategyParameters(final DirectBuffer value, final int length)
    {
        return targetStrategyParameters(value, 0, length);
    }

    public CrossOrderCancelReplaceRequestEncoder targetStrategyParameters(final DirectBuffer value)
    {
        return targetStrategyParameters(value, 0, value.capacity());
    }

    public CrossOrderCancelReplaceRequestEncoder targetStrategyParameters(final byte[] value, final int offset, final int length)
    {
        targetStrategyParameters.wrap(value);
        targetStrategyParametersOffset = offset;
        targetStrategyParametersLength = length;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder targetStrategyParametersAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(targetStrategyParameters, value, offset, length);
        targetStrategyParametersOffset = offset;
        targetStrategyParametersLength = length;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder targetStrategyParameters(final byte[] value, final int length)
    {
        return targetStrategyParameters(value, 0, length);
    }

    public CrossOrderCancelReplaceRequestEncoder targetStrategyParameters(final byte[] value)
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

    public CrossOrderCancelReplaceRequestEncoder targetStrategyParameters(final CharSequence value)
    {
        toBytes(value, targetStrategyParameters);
        targetStrategyParametersOffset = 0;
        targetStrategyParametersLength = value.length();
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder targetStrategyParameters(final AsciiSequenceView value)
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

    public CrossOrderCancelReplaceRequestEncoder targetStrategyParameters(final char[] value)
    {
        return targetStrategyParameters(value, 0, value.length);
    }

    public CrossOrderCancelReplaceRequestEncoder targetStrategyParameters(final char[] value, final int length)
    {
        return targetStrategyParameters(value, 0, length);
    }

    public CrossOrderCancelReplaceRequestEncoder targetStrategyParameters(final char[] value, final int offset, final int length)
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

    public CrossOrderCancelReplaceRequestEncoder participationRate(DecimalFloat value)
    {
        participationRate.set(value);
        hasParticipationRate = true;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder participationRate(long value, int scale)
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

    public CrossOrderCancelReplaceRequestEncoder cancellationRights(char value)
    {
        cancellationRights = value;
        hasCancellationRights = true;
        return this;
    }

    public char cancellationRights()
    {
        return cancellationRights;
    }

    public CrossOrderCancelReplaceRequestEncoder cancellationRights(CancellationRights value)
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

    public CrossOrderCancelReplaceRequestEncoder moneyLaunderingStatus(char value)
    {
        moneyLaunderingStatus = value;
        hasMoneyLaunderingStatus = true;
        return this;
    }

    public char moneyLaunderingStatus()
    {
        return moneyLaunderingStatus;
    }

    public CrossOrderCancelReplaceRequestEncoder moneyLaunderingStatus(MoneyLaunderingStatus value)
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

    public CrossOrderCancelReplaceRequestEncoder registID(final DirectBuffer value, final int offset, final int length)
    {
        registID.wrap(value);
        registIDOffset = offset;
        registIDLength = length;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder registID(final DirectBuffer value, final int length)
    {
        return registID(value, 0, length);
    }

    public CrossOrderCancelReplaceRequestEncoder registID(final DirectBuffer value)
    {
        return registID(value, 0, value.capacity());
    }

    public CrossOrderCancelReplaceRequestEncoder registID(final byte[] value, final int offset, final int length)
    {
        registID.wrap(value);
        registIDOffset = offset;
        registIDLength = length;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder registIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(registID, value, offset, length);
        registIDOffset = offset;
        registIDLength = length;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder registID(final byte[] value, final int length)
    {
        return registID(value, 0, length);
    }

    public CrossOrderCancelReplaceRequestEncoder registID(final byte[] value)
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

    public CrossOrderCancelReplaceRequestEncoder registID(final CharSequence value)
    {
        toBytes(value, registID);
        registIDOffset = 0;
        registIDLength = value.length();
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder registID(final AsciiSequenceView value)
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

    public CrossOrderCancelReplaceRequestEncoder registID(final char[] value)
    {
        return registID(value, 0, value.length);
    }

    public CrossOrderCancelReplaceRequestEncoder registID(final char[] value, final int length)
    {
        return registID(value, 0, length);
    }

    public CrossOrderCancelReplaceRequestEncoder registID(final char[] value, final int offset, final int length)
    {
        toBytes(value, registID, offset, length);
        registIDOffset = 0;
        registIDLength = length;
        return this;
    }

    private final MutableDirectBuffer designation = new UnsafeBuffer();

    private int designationOffset = 0;

    private int designationLength = 0;

    public CrossOrderCancelReplaceRequestEncoder designation(final DirectBuffer value, final int offset, final int length)
    {
        designation.wrap(value);
        designationOffset = offset;
        designationLength = length;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder designation(final DirectBuffer value, final int length)
    {
        return designation(value, 0, length);
    }

    public CrossOrderCancelReplaceRequestEncoder designation(final DirectBuffer value)
    {
        return designation(value, 0, value.capacity());
    }

    public CrossOrderCancelReplaceRequestEncoder designation(final byte[] value, final int offset, final int length)
    {
        designation.wrap(value);
        designationOffset = offset;
        designationLength = length;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder designationAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(designation, value, offset, length);
        designationOffset = offset;
        designationLength = length;
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder designation(final byte[] value, final int length)
    {
        return designation(value, 0, length);
    }

    public CrossOrderCancelReplaceRequestEncoder designation(final byte[] value)
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

    public CrossOrderCancelReplaceRequestEncoder designation(final CharSequence value)
    {
        toBytes(value, designation);
        designationOffset = 0;
        designationLength = value.length();
        return this;
    }

    public CrossOrderCancelReplaceRequestEncoder designation(final AsciiSequenceView value)
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

    public CrossOrderCancelReplaceRequestEncoder designation(final char[] value)
    {
        return designation(value, 0, value.length);
    }

    public CrossOrderCancelReplaceRequestEncoder designation(final char[] value, final int length)
    {
        return designation(value, 0, length);
    }

    public CrossOrderCancelReplaceRequestEncoder designation(final char[] value, final int offset, final int length)
    {
        toBytes(value, designation, offset, length);
        designationOffset = 0;
        designationLength = length;
        return this;
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

        if (crossIDLength > 0)
        {
            buffer.putBytes(position, crossIDHeader, 0, crossIDHeaderLength);
            position += crossIDHeaderLength;
            buffer.putBytes(position, crossID, crossIDOffset, crossIDLength);
            position += crossIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: CrossID");
        }

        if (origCrossIDLength > 0)
        {
            buffer.putBytes(position, origCrossIDHeader, 0, origCrossIDHeaderLength);
            position += origCrossIDHeaderLength;
            buffer.putBytes(position, origCrossID, origCrossIDOffset, origCrossIDLength);
            position += origCrossIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: OrigCrossID");
        }

        if (hostCrossIDLength > 0)
        {
            buffer.putBytes(position, hostCrossIDHeader, 0, hostCrossIDHeaderLength);
            position += hostCrossIDHeaderLength;
            buffer.putBytes(position, hostCrossID, hostCrossIDOffset, hostCrossIDLength);
            position += hostCrossIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasCrossType)
        {
            buffer.putBytes(position, crossTypeHeader, 0, crossTypeHeaderLength);
            position += crossTypeHeaderLength;
            position += buffer.putIntAscii(position, crossType);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: CrossType");
        }

        if (hasCrossPrioritization)
        {
            buffer.putBytes(position, crossPrioritizationHeader, 0, crossPrioritizationHeaderLength);
            position += crossPrioritizationHeaderLength;
            position += buffer.putIntAscii(position, crossPrioritization);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: CrossPrioritization");
        }

            position += rootParties.encode(buffer, position);

            position += sideCrossOrdModGrp.encode(buffer, position);

            position += instrument.encode(buffer, position);

            position += undInstrmtGrp.encode(buffer, position);

            position += instrmtLegGrp.encode(buffer, position);

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

        if (hasPrevClosePx)
        {
            buffer.putBytes(position, prevClosePxHeader, 0, prevClosePxHeaderLength);
            position += prevClosePxHeaderLength;
            position += buffer.putFloatAscii(position, prevClosePx);
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

        if (transBkdTimeLength > 0)
        {
            buffer.putBytes(position, transBkdTimeHeader, 0, transBkdTimeHeaderLength);
            position += transBkdTimeHeaderLength;
            buffer.putBytes(position, transBkdTime, transBkdTimeOffset, transBkdTimeLength);
            position += transBkdTimeLength;
            buffer.putSeparator(position);
            position++;
        }

            position += stipulations.encode(buffer, position);

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
        this.resetCrossID();
        this.resetOrigCrossID();
        this.resetHostCrossID();
        this.resetCrossType();
        this.resetCrossPrioritization();
        this.resetSettlType();
        this.resetSettlDate();
        this.resetHandlInst();
        this.resetExecInst();
        this.resetMinQty();
        this.resetMatchIncrement();
        this.resetMaxPriceLevels();
        this.resetMaxFloor();
        this.resetExDestination();
        this.resetExDestinationIDSource();
        this.resetProcessCode();
        this.resetPrevClosePx();
        this.resetLocateReqd();
        this.resetTransactTime();
        this.resetTransBkdTime();
        this.resetOrdType();
        this.resetPriceType();
        this.resetPrice();
        this.resetPriceProtectionScope();
        this.resetStopPx();
        this.resetCurrency();
        this.resetComplianceID();
        this.resetIOIID();
        this.resetQuoteID();
        this.resetTimeInForce();
        this.resetEffectiveTime();
        this.resetExpireDate();
        this.resetExpireTime();
        this.resetGTBookingInst();
        this.resetMaxShow();
        this.resetTargetStrategy();
        this.resetTargetStrategyParameters();
        this.resetParticipationRate();
        this.resetCancellationRights();
        this.resetMoneyLaunderingStatus();
        this.resetRegistID();
        this.resetDesignation();
        rootParties.reset();
        sideCrossOrdModGrp.reset();
        instrument.reset();
        undInstrmtGrp.reset();
        instrmtLegGrp.reset();
        displayInstruction.reset();
        trdgSesGrp.reset();
        stipulations.reset();
        triggeringInstruction.reset();
        spreadOrBenchmarkCurveData.reset();
        yieldData.reset();
        pegInstructions.reset();
        discretionInstructions.reset();
        strategyParametersGrp.reset();
    }

    public void resetOrderID()
    {
        orderIDLength = 0;
    }

    public void resetCrossID()
    {
        crossIDLength = 0;
    }

    public void resetOrigCrossID()
    {
        origCrossIDLength = 0;
    }

    public void resetHostCrossID()
    {
        hostCrossIDLength = 0;
    }

    public void resetCrossType()
    {
        hasCrossType = false;
    }

    public void resetCrossPrioritization()
    {
        hasCrossPrioritization = false;
    }

    public void resetSettlType()
    {
        settlTypeLength = 0;
    }

    public void resetSettlDate()
    {
        settlDateLength = 0;
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

    public void resetPrevClosePx()
    {
        hasPrevClosePx = false;
    }

    public void resetLocateReqd()
    {
        hasLocateReqd = false;
    }

    public void resetTransactTime()
    {
        transactTimeLength = 0;
    }

    public void resetTransBkdTime()
    {
        transBkdTimeLength = 0;
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

    public void resetCurrency()
    {
        currencyLength = 0;
    }

    public void resetComplianceID()
    {
        complianceIDLength = 0;
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
        builder.append("\"MessageName\": \"CrossOrderCancelReplaceRequest\",\n");
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

        if (hasCrossID())
        {
            indent(builder, level);
            builder.append("\"CrossID\": \"");
            appendBuffer(builder, crossID, crossIDOffset, crossIDLength);
            builder.append("\",\n");
        }

        if (hasOrigCrossID())
        {
            indent(builder, level);
            builder.append("\"OrigCrossID\": \"");
            appendBuffer(builder, origCrossID, origCrossIDOffset, origCrossIDLength);
            builder.append("\",\n");
        }

        if (hasHostCrossID())
        {
            indent(builder, level);
            builder.append("\"HostCrossID\": \"");
            appendBuffer(builder, hostCrossID, hostCrossIDOffset, hostCrossIDLength);
            builder.append("\",\n");
        }

        if (hasCrossType())
        {
            indent(builder, level);
            builder.append("\"CrossType\": \"");
            builder.append(crossType);
            builder.append("\",\n");
        }

        if (hasCrossPrioritization())
        {
            indent(builder, level);
            builder.append("\"CrossPrioritization\": \"");
            builder.append(crossPrioritization);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"RootParties\": ");
    rootParties.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"SideCrossOrdModGrp\": ");
    sideCrossOrdModGrp.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"Instrument\": ");
    instrument.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"UndInstrmtGrp\": ");
    undInstrmtGrp.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"InstrmtLegGrp\": ");
    instrmtLegGrp.appendTo(builder, level + 1);
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

        if (hasPrevClosePx())
        {
            indent(builder, level);
            builder.append("\"PrevClosePx\": \"");
            prevClosePx.appendTo(builder);
            builder.append("\",\n");
        }

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

        if (hasTransBkdTime())
        {
            indent(builder, level);
            builder.append("\"TransBkdTime\": \"");
            appendBuffer(builder, transBkdTime, transBkdTimeOffset, transBkdTimeLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"Stipulations\": ");
    stipulations.appendTo(builder, level + 1);
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
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public CrossOrderCancelReplaceRequestEncoder copyTo(final Encoder encoder)
    {
        return copyTo((CrossOrderCancelReplaceRequestEncoder)encoder);
    }

    public CrossOrderCancelReplaceRequestEncoder copyTo(final CrossOrderCancelReplaceRequestEncoder encoder)
    {
        encoder.reset();
        if (hasOrderID())
        {
            encoder.orderIDAsCopy(orderID.byteArray(), 0, orderIDLength);
        }

        if (hasCrossID())
        {
            encoder.crossIDAsCopy(crossID.byteArray(), 0, crossIDLength);
        }

        if (hasOrigCrossID())
        {
            encoder.origCrossIDAsCopy(origCrossID.byteArray(), 0, origCrossIDLength);
        }

        if (hasHostCrossID())
        {
            encoder.hostCrossIDAsCopy(hostCrossID.byteArray(), 0, hostCrossIDLength);
        }

        if (hasCrossType())
        {
            encoder.crossType(this.crossType());
        }

        if (hasCrossPrioritization())
        {
            encoder.crossPrioritization(this.crossPrioritization());
        }


        rootParties.copyTo(encoder.rootParties());

        sideCrossOrdModGrp.copyTo(encoder.sideCrossOrdModGrp());

        instrument.copyTo(encoder.instrument());

        undInstrmtGrp.copyTo(encoder.undInstrmtGrp());

        instrmtLegGrp.copyTo(encoder.instrmtLegGrp());
        if (hasSettlType())
        {
            encoder.settlTypeAsCopy(settlType.byteArray(), 0, settlTypeLength);
        }

        if (hasSettlDate())
        {
            encoder.settlDateAsCopy(settlDate.byteArray(), 0, settlDateLength);
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

        if (hasPrevClosePx())
        {
            encoder.prevClosePx(this.prevClosePx());
        }

        if (hasLocateReqd())
        {
            encoder.locateReqd(this.locateReqd());
        }

        if (hasTransactTime())
        {
            encoder.transactTimeAsCopy(transactTime.byteArray(), 0, transactTimeLength);
        }

        if (hasTransBkdTime())
        {
            encoder.transBkdTimeAsCopy(transBkdTime.byteArray(), 0, transBkdTimeLength);
        }


        stipulations.copyTo(encoder.stipulations());
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
        if (hasCurrency())
        {
            encoder.currencyAsCopy(currency.byteArray(), 0, currencyLength);
        }

        if (hasComplianceID())
        {
            encoder.complianceIDAsCopy(complianceID.byteArray(), 0, complianceIDLength);
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
        return encoder;
    }

}
