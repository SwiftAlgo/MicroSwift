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


public class NewOrderListEncoder implements Encoder
{
    public long messageType()
    {
        return 69L;
    }

    public NewOrderListEncoder()
    {
        header.msgType("E");
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

    private static final int listIDHeaderLength = 3;
    private static final byte[] listIDHeader = new byte[] {54, 54, (byte) '='};

    private static final int bidIDHeaderLength = 4;
    private static final byte[] bidIDHeader = new byte[] {51, 57, 48, (byte) '='};

    private static final int clientBidIDHeaderLength = 4;
    private static final byte[] clientBidIDHeader = new byte[] {51, 57, 49, (byte) '='};

    private static final int progRptReqsHeaderLength = 4;
    private static final byte[] progRptReqsHeader = new byte[] {52, 49, 52, (byte) '='};

    private static final int bidTypeHeaderLength = 4;
    private static final byte[] bidTypeHeader = new byte[] {51, 57, 52, (byte) '='};

    private static final int progPeriodIntervalHeaderLength = 4;
    private static final byte[] progPeriodIntervalHeader = new byte[] {52, 49, 53, (byte) '='};

    private static final int cancellationRightsHeaderLength = 4;
    private static final byte[] cancellationRightsHeader = new byte[] {52, 56, 48, (byte) '='};

    private static final int moneyLaunderingStatusHeaderLength = 4;
    private static final byte[] moneyLaunderingStatusHeader = new byte[] {52, 56, 49, (byte) '='};

    private static final int registIDHeaderLength = 4;
    private static final byte[] registIDHeader = new byte[] {53, 49, 51, (byte) '='};

    private static final int listExecInstTypeHeaderLength = 4;
    private static final byte[] listExecInstTypeHeader = new byte[] {52, 51, 51, (byte) '='};

    private static final int listExecInstHeaderLength = 3;
    private static final byte[] listExecInstHeader = new byte[] {54, 57, (byte) '='};

    private static final int encodedListExecInstLenHeaderLength = 4;
    private static final byte[] encodedListExecInstLenHeader = new byte[] {51, 53, 50, (byte) '='};

    private static final int encodedListExecInstHeaderLength = 4;
    private static final byte[] encodedListExecInstHeader = new byte[] {51, 53, 51, (byte) '='};

    private static final int allowableOneSidednessPctHeaderLength = 4;
    private static final byte[] allowableOneSidednessPctHeader = new byte[] {55, 54, 53, (byte) '='};

    private static final int allowableOneSidednessValueHeaderLength = 4;
    private static final byte[] allowableOneSidednessValueHeader = new byte[] {55, 54, 54, (byte) '='};

    private static final int allowableOneSidednessCurrHeaderLength = 4;
    private static final byte[] allowableOneSidednessCurrHeader = new byte[] {55, 54, 55, (byte) '='};

    private static final int totNoOrdersHeaderLength = 3;
    private static final byte[] totNoOrdersHeader = new byte[] {54, 56, (byte) '='};

    private static final int lastFragmentHeaderLength = 4;
    private static final byte[] lastFragmentHeader = new byte[] {56, 57, 51, (byte) '='};

    private static final int noOrdersGroupCounterHeaderLength = 3;
    private static final byte[] noOrdersGroupCounterHeader = new byte[] {55, 51, (byte) '='};

    private final MutableDirectBuffer listID = new UnsafeBuffer();

    private int listIDOffset = 0;

    private int listIDLength = 0;

    public NewOrderListEncoder listID(final DirectBuffer value, final int offset, final int length)
    {
        listID.wrap(value);
        listIDOffset = offset;
        listIDLength = length;
        return this;
    }

    public NewOrderListEncoder listID(final DirectBuffer value, final int length)
    {
        return listID(value, 0, length);
    }

    public NewOrderListEncoder listID(final DirectBuffer value)
    {
        return listID(value, 0, value.capacity());
    }

    public NewOrderListEncoder listID(final byte[] value, final int offset, final int length)
    {
        listID.wrap(value);
        listIDOffset = offset;
        listIDLength = length;
        return this;
    }

    public NewOrderListEncoder listIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(listID, value, offset, length);
        listIDOffset = offset;
        listIDLength = length;
        return this;
    }

    public NewOrderListEncoder listID(final byte[] value, final int length)
    {
        return listID(value, 0, length);
    }

    public NewOrderListEncoder listID(final byte[] value)
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

    public NewOrderListEncoder listID(final CharSequence value)
    {
        toBytes(value, listID);
        listIDOffset = 0;
        listIDLength = value.length();
        return this;
    }

    public NewOrderListEncoder listID(final AsciiSequenceView value)
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

    public NewOrderListEncoder listID(final char[] value)
    {
        return listID(value, 0, value.length);
    }

    public NewOrderListEncoder listID(final char[] value, final int length)
    {
        return listID(value, 0, length);
    }

    public NewOrderListEncoder listID(final char[] value, final int offset, final int length)
    {
        toBytes(value, listID, offset, length);
        listIDOffset = 0;
        listIDLength = length;
        return this;
    }

    private final MutableDirectBuffer bidID = new UnsafeBuffer();

    private int bidIDOffset = 0;

    private int bidIDLength = 0;

    public NewOrderListEncoder bidID(final DirectBuffer value, final int offset, final int length)
    {
        bidID.wrap(value);
        bidIDOffset = offset;
        bidIDLength = length;
        return this;
    }

    public NewOrderListEncoder bidID(final DirectBuffer value, final int length)
    {
        return bidID(value, 0, length);
    }

    public NewOrderListEncoder bidID(final DirectBuffer value)
    {
        return bidID(value, 0, value.capacity());
    }

    public NewOrderListEncoder bidID(final byte[] value, final int offset, final int length)
    {
        bidID.wrap(value);
        bidIDOffset = offset;
        bidIDLength = length;
        return this;
    }

    public NewOrderListEncoder bidIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(bidID, value, offset, length);
        bidIDOffset = offset;
        bidIDLength = length;
        return this;
    }

    public NewOrderListEncoder bidID(final byte[] value, final int length)
    {
        return bidID(value, 0, length);
    }

    public NewOrderListEncoder bidID(final byte[] value)
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

    public NewOrderListEncoder bidID(final CharSequence value)
    {
        toBytes(value, bidID);
        bidIDOffset = 0;
        bidIDLength = value.length();
        return this;
    }

    public NewOrderListEncoder bidID(final AsciiSequenceView value)
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

    public NewOrderListEncoder bidID(final char[] value)
    {
        return bidID(value, 0, value.length);
    }

    public NewOrderListEncoder bidID(final char[] value, final int length)
    {
        return bidID(value, 0, length);
    }

    public NewOrderListEncoder bidID(final char[] value, final int offset, final int length)
    {
        toBytes(value, bidID, offset, length);
        bidIDOffset = 0;
        bidIDLength = length;
        return this;
    }

    private final MutableDirectBuffer clientBidID = new UnsafeBuffer();

    private int clientBidIDOffset = 0;

    private int clientBidIDLength = 0;

    public NewOrderListEncoder clientBidID(final DirectBuffer value, final int offset, final int length)
    {
        clientBidID.wrap(value);
        clientBidIDOffset = offset;
        clientBidIDLength = length;
        return this;
    }

    public NewOrderListEncoder clientBidID(final DirectBuffer value, final int length)
    {
        return clientBidID(value, 0, length);
    }

    public NewOrderListEncoder clientBidID(final DirectBuffer value)
    {
        return clientBidID(value, 0, value.capacity());
    }

    public NewOrderListEncoder clientBidID(final byte[] value, final int offset, final int length)
    {
        clientBidID.wrap(value);
        clientBidIDOffset = offset;
        clientBidIDLength = length;
        return this;
    }

    public NewOrderListEncoder clientBidIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(clientBidID, value, offset, length);
        clientBidIDOffset = offset;
        clientBidIDLength = length;
        return this;
    }

    public NewOrderListEncoder clientBidID(final byte[] value, final int length)
    {
        return clientBidID(value, 0, length);
    }

    public NewOrderListEncoder clientBidID(final byte[] value)
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

    public NewOrderListEncoder clientBidID(final CharSequence value)
    {
        toBytes(value, clientBidID);
        clientBidIDOffset = 0;
        clientBidIDLength = value.length();
        return this;
    }

    public NewOrderListEncoder clientBidID(final AsciiSequenceView value)
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

    public NewOrderListEncoder clientBidID(final char[] value)
    {
        return clientBidID(value, 0, value.length);
    }

    public NewOrderListEncoder clientBidID(final char[] value, final int length)
    {
        return clientBidID(value, 0, length);
    }

    public NewOrderListEncoder clientBidID(final char[] value, final int offset, final int length)
    {
        toBytes(value, clientBidID, offset, length);
        clientBidIDOffset = 0;
        clientBidIDLength = length;
        return this;
    }

    private int progRptReqs;

    private boolean hasProgRptReqs;

    public boolean hasProgRptReqs()
    {
        return hasProgRptReqs;
    }

    public NewOrderListEncoder progRptReqs(int value)
    {
        progRptReqs = value;
        hasProgRptReqs = true;
        return this;
    }

    public int progRptReqs()
    {
        return progRptReqs;
    }

    public NewOrderListEncoder progRptReqs(ProgRptReqs value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == ProgRptReqs.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: progRptReqs Value: " + value );
            }
            if (value == ProgRptReqs.NULL_VAL)
            {
                return this;
            }
        }
        return progRptReqs(value.representation());
    }

    private int bidType;

    private boolean hasBidType;

    public boolean hasBidType()
    {
        return hasBidType;
    }

    public NewOrderListEncoder bidType(int value)
    {
        bidType = value;
        hasBidType = true;
        return this;
    }

    public int bidType()
    {
        return bidType;
    }

    public NewOrderListEncoder bidType(BidType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == BidType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: bidType Value: " + value );
            }
            if (value == BidType.NULL_VAL)
            {
                return this;
            }
        }
        return bidType(value.representation());
    }

    private int progPeriodInterval;

    private boolean hasProgPeriodInterval;

    public boolean hasProgPeriodInterval()
    {
        return hasProgPeriodInterval;
    }

    public NewOrderListEncoder progPeriodInterval(int value)
    {
        progPeriodInterval = value;
        hasProgPeriodInterval = true;
        return this;
    }

    public int progPeriodInterval()
    {
        return progPeriodInterval;
    }

    private char cancellationRights;

    private boolean hasCancellationRights;

    public boolean hasCancellationRights()
    {
        return hasCancellationRights;
    }

    public NewOrderListEncoder cancellationRights(char value)
    {
        cancellationRights = value;
        hasCancellationRights = true;
        return this;
    }

    public char cancellationRights()
    {
        return cancellationRights;
    }

    public NewOrderListEncoder cancellationRights(CancellationRights value)
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

    public NewOrderListEncoder moneyLaunderingStatus(char value)
    {
        moneyLaunderingStatus = value;
        hasMoneyLaunderingStatus = true;
        return this;
    }

    public char moneyLaunderingStatus()
    {
        return moneyLaunderingStatus;
    }

    public NewOrderListEncoder moneyLaunderingStatus(MoneyLaunderingStatus value)
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

    public NewOrderListEncoder registID(final DirectBuffer value, final int offset, final int length)
    {
        registID.wrap(value);
        registIDOffset = offset;
        registIDLength = length;
        return this;
    }

    public NewOrderListEncoder registID(final DirectBuffer value, final int length)
    {
        return registID(value, 0, length);
    }

    public NewOrderListEncoder registID(final DirectBuffer value)
    {
        return registID(value, 0, value.capacity());
    }

    public NewOrderListEncoder registID(final byte[] value, final int offset, final int length)
    {
        registID.wrap(value);
        registIDOffset = offset;
        registIDLength = length;
        return this;
    }

    public NewOrderListEncoder registIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(registID, value, offset, length);
        registIDOffset = offset;
        registIDLength = length;
        return this;
    }

    public NewOrderListEncoder registID(final byte[] value, final int length)
    {
        return registID(value, 0, length);
    }

    public NewOrderListEncoder registID(final byte[] value)
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

    public NewOrderListEncoder registID(final CharSequence value)
    {
        toBytes(value, registID);
        registIDOffset = 0;
        registIDLength = value.length();
        return this;
    }

    public NewOrderListEncoder registID(final AsciiSequenceView value)
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

    public NewOrderListEncoder registID(final char[] value)
    {
        return registID(value, 0, value.length);
    }

    public NewOrderListEncoder registID(final char[] value, final int length)
    {
        return registID(value, 0, length);
    }

    public NewOrderListEncoder registID(final char[] value, final int offset, final int length)
    {
        toBytes(value, registID, offset, length);
        registIDOffset = 0;
        registIDLength = length;
        return this;
    }

    private char listExecInstType;

    private boolean hasListExecInstType;

    public boolean hasListExecInstType()
    {
        return hasListExecInstType;
    }

    public NewOrderListEncoder listExecInstType(char value)
    {
        listExecInstType = value;
        hasListExecInstType = true;
        return this;
    }

    public char listExecInstType()
    {
        return listExecInstType;
    }

    public NewOrderListEncoder listExecInstType(ListExecInstType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == ListExecInstType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: listExecInstType Value: " + value );
            }
            if (value == ListExecInstType.NULL_VAL)
            {
                return this;
            }
        }
        return listExecInstType(value.representation());
    }

    private final MutableDirectBuffer listExecInst = new UnsafeBuffer();

    private int listExecInstOffset = 0;

    private int listExecInstLength = 0;

    public NewOrderListEncoder listExecInst(final DirectBuffer value, final int offset, final int length)
    {
        listExecInst.wrap(value);
        listExecInstOffset = offset;
        listExecInstLength = length;
        return this;
    }

    public NewOrderListEncoder listExecInst(final DirectBuffer value, final int length)
    {
        return listExecInst(value, 0, length);
    }

    public NewOrderListEncoder listExecInst(final DirectBuffer value)
    {
        return listExecInst(value, 0, value.capacity());
    }

    public NewOrderListEncoder listExecInst(final byte[] value, final int offset, final int length)
    {
        listExecInst.wrap(value);
        listExecInstOffset = offset;
        listExecInstLength = length;
        return this;
    }

    public NewOrderListEncoder listExecInstAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(listExecInst, value, offset, length);
        listExecInstOffset = offset;
        listExecInstLength = length;
        return this;
    }

    public NewOrderListEncoder listExecInst(final byte[] value, final int length)
    {
        return listExecInst(value, 0, length);
    }

    public NewOrderListEncoder listExecInst(final byte[] value)
    {
        return listExecInst(value, 0, value.length);
    }

    public boolean hasListExecInst()
    {
        return listExecInstLength > 0;
    }

    public MutableDirectBuffer listExecInst()
    {
        return listExecInst;
    }

    public String listExecInstAsString()
    {
        return listExecInst.getStringWithoutLengthAscii(listExecInstOffset, listExecInstLength);
    }

    public NewOrderListEncoder listExecInst(final CharSequence value)
    {
        toBytes(value, listExecInst);
        listExecInstOffset = 0;
        listExecInstLength = value.length();
        return this;
    }

    public NewOrderListEncoder listExecInst(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            listExecInst.wrap(buffer);
            listExecInstOffset = value.offset();
            listExecInstLength = value.length();
        }
        return this;
    }

    public NewOrderListEncoder listExecInst(final char[] value)
    {
        return listExecInst(value, 0, value.length);
    }

    public NewOrderListEncoder listExecInst(final char[] value, final int length)
    {
        return listExecInst(value, 0, length);
    }

    public NewOrderListEncoder listExecInst(final char[] value, final int offset, final int length)
    {
        toBytes(value, listExecInst, offset, length);
        listExecInstOffset = 0;
        listExecInstLength = length;
        return this;
    }

    private int encodedListExecInstLen;

    private boolean hasEncodedListExecInstLen;

    public boolean hasEncodedListExecInstLen()
    {
        return hasEncodedListExecInstLen;
    }

    public NewOrderListEncoder encodedListExecInstLen(int value)
    {
        encodedListExecInstLen = value;
        hasEncodedListExecInstLen = true;
        return this;
    }

    public int encodedListExecInstLen()
    {
        return encodedListExecInstLen;
    }

    private byte[] encodedListExecInst;

    private boolean hasEncodedListExecInst;

    public boolean hasEncodedListExecInst()
    {
        return hasEncodedListExecInst;
    }

    public NewOrderListEncoder encodedListExecInst(byte[] value)
    {
        encodedListExecInst = value;
        hasEncodedListExecInst = true;
        return this;
    }

    public byte[] encodedListExecInst()
    {
        return encodedListExecInst;
    }

    public NewOrderListEncoder encodedListExecInstAsCopy(final byte[] value, final int offset, final int length)
    {
        encodedListExecInst = copyInto(encodedListExecInst, value, offset, length);
        hasEncodedListExecInst = true;
        return this;
    }

    private final DecimalFloat allowableOneSidednessPct = new DecimalFloat();

    private boolean hasAllowableOneSidednessPct;

    public boolean hasAllowableOneSidednessPct()
    {
        return hasAllowableOneSidednessPct;
    }

    public NewOrderListEncoder allowableOneSidednessPct(DecimalFloat value)
    {
        allowableOneSidednessPct.set(value);
        hasAllowableOneSidednessPct = true;
        return this;
    }

    public NewOrderListEncoder allowableOneSidednessPct(long value, int scale)
    {
        allowableOneSidednessPct.set(value, scale);
        hasAllowableOneSidednessPct = true;
        return this;
    }

    public DecimalFloat allowableOneSidednessPct()
    {
        return allowableOneSidednessPct;
    }

    private final DecimalFloat allowableOneSidednessValue = new DecimalFloat();

    private boolean hasAllowableOneSidednessValue;

    public boolean hasAllowableOneSidednessValue()
    {
        return hasAllowableOneSidednessValue;
    }

    public NewOrderListEncoder allowableOneSidednessValue(DecimalFloat value)
    {
        allowableOneSidednessValue.set(value);
        hasAllowableOneSidednessValue = true;
        return this;
    }

    public NewOrderListEncoder allowableOneSidednessValue(long value, int scale)
    {
        allowableOneSidednessValue.set(value, scale);
        hasAllowableOneSidednessValue = true;
        return this;
    }

    public DecimalFloat allowableOneSidednessValue()
    {
        return allowableOneSidednessValue;
    }

    private final MutableDirectBuffer allowableOneSidednessCurr = new UnsafeBuffer();

    private int allowableOneSidednessCurrOffset = 0;

    private int allowableOneSidednessCurrLength = 0;

    public NewOrderListEncoder allowableOneSidednessCurr(final DirectBuffer value, final int offset, final int length)
    {
        allowableOneSidednessCurr.wrap(value);
        allowableOneSidednessCurrOffset = offset;
        allowableOneSidednessCurrLength = length;
        return this;
    }

    public NewOrderListEncoder allowableOneSidednessCurr(final DirectBuffer value, final int length)
    {
        return allowableOneSidednessCurr(value, 0, length);
    }

    public NewOrderListEncoder allowableOneSidednessCurr(final DirectBuffer value)
    {
        return allowableOneSidednessCurr(value, 0, value.capacity());
    }

    public NewOrderListEncoder allowableOneSidednessCurr(final byte[] value, final int offset, final int length)
    {
        allowableOneSidednessCurr.wrap(value);
        allowableOneSidednessCurrOffset = offset;
        allowableOneSidednessCurrLength = length;
        return this;
    }

    public NewOrderListEncoder allowableOneSidednessCurrAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(allowableOneSidednessCurr, value, offset, length);
        allowableOneSidednessCurrOffset = offset;
        allowableOneSidednessCurrLength = length;
        return this;
    }

    public NewOrderListEncoder allowableOneSidednessCurr(final byte[] value, final int length)
    {
        return allowableOneSidednessCurr(value, 0, length);
    }

    public NewOrderListEncoder allowableOneSidednessCurr(final byte[] value)
    {
        return allowableOneSidednessCurr(value, 0, value.length);
    }

    public boolean hasAllowableOneSidednessCurr()
    {
        return allowableOneSidednessCurrLength > 0;
    }

    public MutableDirectBuffer allowableOneSidednessCurr()
    {
        return allowableOneSidednessCurr;
    }

    public String allowableOneSidednessCurrAsString()
    {
        return allowableOneSidednessCurr.getStringWithoutLengthAscii(allowableOneSidednessCurrOffset, allowableOneSidednessCurrLength);
    }

    public NewOrderListEncoder allowableOneSidednessCurr(final CharSequence value)
    {
        toBytes(value, allowableOneSidednessCurr);
        allowableOneSidednessCurrOffset = 0;
        allowableOneSidednessCurrLength = value.length();
        return this;
    }

    public NewOrderListEncoder allowableOneSidednessCurr(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            allowableOneSidednessCurr.wrap(buffer);
            allowableOneSidednessCurrOffset = value.offset();
            allowableOneSidednessCurrLength = value.length();
        }
        return this;
    }

    public NewOrderListEncoder allowableOneSidednessCurr(final char[] value)
    {
        return allowableOneSidednessCurr(value, 0, value.length);
    }

    public NewOrderListEncoder allowableOneSidednessCurr(final char[] value, final int length)
    {
        return allowableOneSidednessCurr(value, 0, length);
    }

    public NewOrderListEncoder allowableOneSidednessCurr(final char[] value, final int offset, final int length)
    {
        toBytes(value, allowableOneSidednessCurr, offset, length);
        allowableOneSidednessCurrOffset = 0;
        allowableOneSidednessCurrLength = length;
        return this;
    }

    private int totNoOrders;

    private boolean hasTotNoOrders;

    public boolean hasTotNoOrders()
    {
        return hasTotNoOrders;
    }

    public NewOrderListEncoder totNoOrders(int value)
    {
        totNoOrders = value;
        hasTotNoOrders = true;
        return this;
    }

    public int totNoOrders()
    {
        return totNoOrders;
    }

    private boolean lastFragment;

    private boolean hasLastFragment;

    public boolean hasLastFragment()
    {
        return hasLastFragment;
    }

    public NewOrderListEncoder lastFragment(boolean value)
    {
        lastFragment = value;
        hasLastFragment = true;
        return this;
    }

    public boolean lastFragment()
    {
        return lastFragment;
    }



public static class OrdersGroupEncoder
{
    private OrdersGroupEncoder next = null;

    public OrdersGroupEncoder next()
    {
        if (next == null)
        {
            next = new OrdersGroupEncoder();
        }
        return next;
    }

    private static final int clOrdIDHeaderLength = 3;
    private static final byte[] clOrdIDHeader = new byte[] {49, 49, (byte) '='};

    private static final int secondaryClOrdIDHeaderLength = 4;
    private static final byte[] secondaryClOrdIDHeader = new byte[] {53, 50, 54, (byte) '='};

    private static final int listSeqNoHeaderLength = 3;
    private static final byte[] listSeqNoHeader = new byte[] {54, 55, (byte) '='};

    private static final int clOrdLinkIDHeaderLength = 4;
    private static final byte[] clOrdLinkIDHeader = new byte[] {53, 56, 51, (byte) '='};

    private static final int settlInstModeHeaderLength = 4;
    private static final byte[] settlInstModeHeader = new byte[] {49, 54, 48, (byte) '='};

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

    private static final int allocIDHeaderLength = 3;
    private static final byte[] allocIDHeader = new byte[] {55, 48, (byte) '='};

    private static final int preallocMethodHeaderLength = 4;
    private static final byte[] preallocMethodHeader = new byte[] {53, 57, 49, (byte) '='};

    private static final int noAllocsGroupCounterHeaderLength = 3;
    private static final byte[] noAllocsGroupCounterHeader = new byte[] {55, 56, (byte) '='};

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

    private static final int maxFloorHeaderLength = 4;
    private static final byte[] maxFloorHeader = new byte[] {49, 49, 49, (byte) '='};

    private static final int exDestinationHeaderLength = 4;
    private static final byte[] exDestinationHeader = new byte[] {49, 48, 48, (byte) '='};

    private static final int noTradingSessionsGroupCounterHeaderLength = 4;
    private static final byte[] noTradingSessionsGroupCounterHeader = new byte[] {51, 56, 54, (byte) '='};

    private static final int processCodeHeaderLength = 3;
    private static final byte[] processCodeHeader = new byte[] {56, 49, (byte) '='};

    private static final int noUnderlyingsGroupCounterHeaderLength = 4;
    private static final byte[] noUnderlyingsGroupCounterHeader = new byte[] {55, 49, 49, (byte) '='};

    private static final int prevClosePxHeaderLength = 4;
    private static final byte[] prevClosePxHeader = new byte[] {49, 52, 48, (byte) '='};

    private static final int sideHeaderLength = 3;
    private static final byte[] sideHeader = new byte[] {53, 52, (byte) '='};

    private static final int sideValueIndHeaderLength = 4;
    private static final byte[] sideValueIndHeader = new byte[] {52, 48, 49, (byte) '='};

    private static final int locateReqdHeaderLength = 4;
    private static final byte[] locateReqdHeader = new byte[] {49, 49, 52, (byte) '='};

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

    private static final int targetStrategyHeaderLength = 4;
    private static final byte[] targetStrategyHeader = new byte[] {56, 52, 55, (byte) '='};

    private static final int targetStrategyParametersHeaderLength = 4;
    private static final byte[] targetStrategyParametersHeader = new byte[] {56, 52, 56, (byte) '='};

    private static final int participationRateHeaderLength = 4;
    private static final byte[] participationRateHeader = new byte[] {56, 52, 57, (byte) '='};

    private static final int designationHeaderLength = 4;
    private static final byte[] designationHeader = new byte[] {52, 57, 52, (byte) '='};

    private final MutableDirectBuffer clOrdID = new UnsafeBuffer();

    private int clOrdIDOffset = 0;

    private int clOrdIDLength = 0;

    public OrdersGroupEncoder clOrdID(final DirectBuffer value, final int offset, final int length)
    {
        clOrdID.wrap(value);
        clOrdIDOffset = offset;
        clOrdIDLength = length;
        return this;
    }

    public OrdersGroupEncoder clOrdID(final DirectBuffer value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    public OrdersGroupEncoder clOrdID(final DirectBuffer value)
    {
        return clOrdID(value, 0, value.capacity());
    }

    public OrdersGroupEncoder clOrdID(final byte[] value, final int offset, final int length)
    {
        clOrdID.wrap(value);
        clOrdIDOffset = offset;
        clOrdIDLength = length;
        return this;
    }

    public OrdersGroupEncoder clOrdIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(clOrdID, value, offset, length);
        clOrdIDOffset = offset;
        clOrdIDLength = length;
        return this;
    }

    public OrdersGroupEncoder clOrdID(final byte[] value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    public OrdersGroupEncoder clOrdID(final byte[] value)
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

    public OrdersGroupEncoder clOrdID(final CharSequence value)
    {
        toBytes(value, clOrdID);
        clOrdIDOffset = 0;
        clOrdIDLength = value.length();
        return this;
    }

    public OrdersGroupEncoder clOrdID(final AsciiSequenceView value)
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

    public OrdersGroupEncoder clOrdID(final char[] value)
    {
        return clOrdID(value, 0, value.length);
    }

    public OrdersGroupEncoder clOrdID(final char[] value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    public OrdersGroupEncoder clOrdID(final char[] value, final int offset, final int length)
    {
        toBytes(value, clOrdID, offset, length);
        clOrdIDOffset = 0;
        clOrdIDLength = length;
        return this;
    }

    private final MutableDirectBuffer secondaryClOrdID = new UnsafeBuffer();

    private int secondaryClOrdIDOffset = 0;

    private int secondaryClOrdIDLength = 0;

    public OrdersGroupEncoder secondaryClOrdID(final DirectBuffer value, final int offset, final int length)
    {
        secondaryClOrdID.wrap(value);
        secondaryClOrdIDOffset = offset;
        secondaryClOrdIDLength = length;
        return this;
    }

    public OrdersGroupEncoder secondaryClOrdID(final DirectBuffer value, final int length)
    {
        return secondaryClOrdID(value, 0, length);
    }

    public OrdersGroupEncoder secondaryClOrdID(final DirectBuffer value)
    {
        return secondaryClOrdID(value, 0, value.capacity());
    }

    public OrdersGroupEncoder secondaryClOrdID(final byte[] value, final int offset, final int length)
    {
        secondaryClOrdID.wrap(value);
        secondaryClOrdIDOffset = offset;
        secondaryClOrdIDLength = length;
        return this;
    }

    public OrdersGroupEncoder secondaryClOrdIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(secondaryClOrdID, value, offset, length);
        secondaryClOrdIDOffset = offset;
        secondaryClOrdIDLength = length;
        return this;
    }

    public OrdersGroupEncoder secondaryClOrdID(final byte[] value, final int length)
    {
        return secondaryClOrdID(value, 0, length);
    }

    public OrdersGroupEncoder secondaryClOrdID(final byte[] value)
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

    public OrdersGroupEncoder secondaryClOrdID(final CharSequence value)
    {
        toBytes(value, secondaryClOrdID);
        secondaryClOrdIDOffset = 0;
        secondaryClOrdIDLength = value.length();
        return this;
    }

    public OrdersGroupEncoder secondaryClOrdID(final AsciiSequenceView value)
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

    public OrdersGroupEncoder secondaryClOrdID(final char[] value)
    {
        return secondaryClOrdID(value, 0, value.length);
    }

    public OrdersGroupEncoder secondaryClOrdID(final char[] value, final int length)
    {
        return secondaryClOrdID(value, 0, length);
    }

    public OrdersGroupEncoder secondaryClOrdID(final char[] value, final int offset, final int length)
    {
        toBytes(value, secondaryClOrdID, offset, length);
        secondaryClOrdIDOffset = 0;
        secondaryClOrdIDLength = length;
        return this;
    }

    private int listSeqNo;

    private boolean hasListSeqNo;

    public boolean hasListSeqNo()
    {
        return hasListSeqNo;
    }

    public OrdersGroupEncoder listSeqNo(int value)
    {
        listSeqNo = value;
        hasListSeqNo = true;
        return this;
    }

    public int listSeqNo()
    {
        return listSeqNo;
    }

    private final MutableDirectBuffer clOrdLinkID = new UnsafeBuffer();

    private int clOrdLinkIDOffset = 0;

    private int clOrdLinkIDLength = 0;

    public OrdersGroupEncoder clOrdLinkID(final DirectBuffer value, final int offset, final int length)
    {
        clOrdLinkID.wrap(value);
        clOrdLinkIDOffset = offset;
        clOrdLinkIDLength = length;
        return this;
    }

    public OrdersGroupEncoder clOrdLinkID(final DirectBuffer value, final int length)
    {
        return clOrdLinkID(value, 0, length);
    }

    public OrdersGroupEncoder clOrdLinkID(final DirectBuffer value)
    {
        return clOrdLinkID(value, 0, value.capacity());
    }

    public OrdersGroupEncoder clOrdLinkID(final byte[] value, final int offset, final int length)
    {
        clOrdLinkID.wrap(value);
        clOrdLinkIDOffset = offset;
        clOrdLinkIDLength = length;
        return this;
    }

    public OrdersGroupEncoder clOrdLinkIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(clOrdLinkID, value, offset, length);
        clOrdLinkIDOffset = offset;
        clOrdLinkIDLength = length;
        return this;
    }

    public OrdersGroupEncoder clOrdLinkID(final byte[] value, final int length)
    {
        return clOrdLinkID(value, 0, length);
    }

    public OrdersGroupEncoder clOrdLinkID(final byte[] value)
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

    public OrdersGroupEncoder clOrdLinkID(final CharSequence value)
    {
        toBytes(value, clOrdLinkID);
        clOrdLinkIDOffset = 0;
        clOrdLinkIDLength = value.length();
        return this;
    }

    public OrdersGroupEncoder clOrdLinkID(final AsciiSequenceView value)
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

    public OrdersGroupEncoder clOrdLinkID(final char[] value)
    {
        return clOrdLinkID(value, 0, value.length);
    }

    public OrdersGroupEncoder clOrdLinkID(final char[] value, final int length)
    {
        return clOrdLinkID(value, 0, length);
    }

    public OrdersGroupEncoder clOrdLinkID(final char[] value, final int offset, final int length)
    {
        toBytes(value, clOrdLinkID, offset, length);
        clOrdLinkIDOffset = 0;
        clOrdLinkIDLength = length;
        return this;
    }

    private char settlInstMode;

    private boolean hasSettlInstMode;

    public boolean hasSettlInstMode()
    {
        return hasSettlInstMode;
    }

    public OrdersGroupEncoder settlInstMode(char value)
    {
        settlInstMode = value;
        hasSettlInstMode = true;
        return this;
    }

    public char settlInstMode()
    {
        return settlInstMode;
    }

    public OrdersGroupEncoder settlInstMode(SettlInstMode value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == SettlInstMode.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: settlInstMode Value: " + value );
            }
            if (value == SettlInstMode.NULL_VAL)
            {
                return this;
            }
        }
        return settlInstMode(value.representation());
    }

    private final PartiesEncoder parties = new PartiesEncoder();
    public PartiesEncoder parties()
    {
        return parties;
    }

    private final MutableDirectBuffer tradeOriginationDate = new UnsafeBuffer();

    private int tradeOriginationDateOffset = 0;

    private int tradeOriginationDateLength = 0;

    public OrdersGroupEncoder tradeOriginationDate(final DirectBuffer value, final int offset, final int length)
    {
        tradeOriginationDate.wrap(value);
        tradeOriginationDateOffset = offset;
        tradeOriginationDateLength = length;
        return this;
    }

    public OrdersGroupEncoder tradeOriginationDate(final DirectBuffer value, final int length)
    {
        return tradeOriginationDate(value, 0, length);
    }

    public OrdersGroupEncoder tradeOriginationDate(final DirectBuffer value)
    {
        return tradeOriginationDate(value, 0, value.capacity());
    }

    public OrdersGroupEncoder tradeOriginationDate(final byte[] value, final int offset, final int length)
    {
        tradeOriginationDate.wrap(value);
        tradeOriginationDateOffset = offset;
        tradeOriginationDateLength = length;
        return this;
    }

    public OrdersGroupEncoder tradeOriginationDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradeOriginationDate, value, offset, length);
        tradeOriginationDateOffset = offset;
        tradeOriginationDateLength = length;
        return this;
    }

    public OrdersGroupEncoder tradeOriginationDate(final byte[] value, final int length)
    {
        return tradeOriginationDate(value, 0, length);
    }

    public OrdersGroupEncoder tradeOriginationDate(final byte[] value)
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

    public OrdersGroupEncoder tradeDate(final DirectBuffer value, final int offset, final int length)
    {
        tradeDate.wrap(value);
        tradeDateOffset = offset;
        tradeDateLength = length;
        return this;
    }

    public OrdersGroupEncoder tradeDate(final DirectBuffer value, final int length)
    {
        return tradeDate(value, 0, length);
    }

    public OrdersGroupEncoder tradeDate(final DirectBuffer value)
    {
        return tradeDate(value, 0, value.capacity());
    }

    public OrdersGroupEncoder tradeDate(final byte[] value, final int offset, final int length)
    {
        tradeDate.wrap(value);
        tradeDateOffset = offset;
        tradeDateLength = length;
        return this;
    }

    public OrdersGroupEncoder tradeDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradeDate, value, offset, length);
        tradeDateOffset = offset;
        tradeDateLength = length;
        return this;
    }

    public OrdersGroupEncoder tradeDate(final byte[] value, final int length)
    {
        return tradeDate(value, 0, length);
    }

    public OrdersGroupEncoder tradeDate(final byte[] value)
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

    public OrdersGroupEncoder account(final DirectBuffer value, final int offset, final int length)
    {
        account.wrap(value);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    public OrdersGroupEncoder account(final DirectBuffer value, final int length)
    {
        return account(value, 0, length);
    }

    public OrdersGroupEncoder account(final DirectBuffer value)
    {
        return account(value, 0, value.capacity());
    }

    public OrdersGroupEncoder account(final byte[] value, final int offset, final int length)
    {
        account.wrap(value);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    public OrdersGroupEncoder accountAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(account, value, offset, length);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    public OrdersGroupEncoder account(final byte[] value, final int length)
    {
        return account(value, 0, length);
    }

    public OrdersGroupEncoder account(final byte[] value)
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

    public OrdersGroupEncoder account(final CharSequence value)
    {
        toBytes(value, account);
        accountOffset = 0;
        accountLength = value.length();
        return this;
    }

    public OrdersGroupEncoder account(final AsciiSequenceView value)
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

    public OrdersGroupEncoder account(final char[] value)
    {
        return account(value, 0, value.length);
    }

    public OrdersGroupEncoder account(final char[] value, final int length)
    {
        return account(value, 0, length);
    }

    public OrdersGroupEncoder account(final char[] value, final int offset, final int length)
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

    public OrdersGroupEncoder acctIDSource(int value)
    {
        acctIDSource = value;
        hasAcctIDSource = true;
        return this;
    }

    public int acctIDSource()
    {
        return acctIDSource;
    }

    public OrdersGroupEncoder acctIDSource(AcctIDSource value)
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

    public OrdersGroupEncoder accountType(int value)
    {
        accountType = value;
        hasAccountType = true;
        return this;
    }

    public int accountType()
    {
        return accountType;
    }

    public OrdersGroupEncoder accountType(AccountType value)
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

    public OrdersGroupEncoder dayBookingInst(char value)
    {
        dayBookingInst = value;
        hasDayBookingInst = true;
        return this;
    }

    public char dayBookingInst()
    {
        return dayBookingInst;
    }

    public OrdersGroupEncoder dayBookingInst(DayBookingInst value)
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

    public OrdersGroupEncoder bookingUnit(char value)
    {
        bookingUnit = value;
        hasBookingUnit = true;
        return this;
    }

    public char bookingUnit()
    {
        return bookingUnit;
    }

    public OrdersGroupEncoder bookingUnit(BookingUnit value)
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

    private final MutableDirectBuffer allocID = new UnsafeBuffer();

    private int allocIDOffset = 0;

    private int allocIDLength = 0;

    public OrdersGroupEncoder allocID(final DirectBuffer value, final int offset, final int length)
    {
        allocID.wrap(value);
        allocIDOffset = offset;
        allocIDLength = length;
        return this;
    }

    public OrdersGroupEncoder allocID(final DirectBuffer value, final int length)
    {
        return allocID(value, 0, length);
    }

    public OrdersGroupEncoder allocID(final DirectBuffer value)
    {
        return allocID(value, 0, value.capacity());
    }

    public OrdersGroupEncoder allocID(final byte[] value, final int offset, final int length)
    {
        allocID.wrap(value);
        allocIDOffset = offset;
        allocIDLength = length;
        return this;
    }

    public OrdersGroupEncoder allocIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(allocID, value, offset, length);
        allocIDOffset = offset;
        allocIDLength = length;
        return this;
    }

    public OrdersGroupEncoder allocID(final byte[] value, final int length)
    {
        return allocID(value, 0, length);
    }

    public OrdersGroupEncoder allocID(final byte[] value)
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

    public OrdersGroupEncoder allocID(final CharSequence value)
    {
        toBytes(value, allocID);
        allocIDOffset = 0;
        allocIDLength = value.length();
        return this;
    }

    public OrdersGroupEncoder allocID(final AsciiSequenceView value)
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

    public OrdersGroupEncoder allocID(final char[] value)
    {
        return allocID(value, 0, value.length);
    }

    public OrdersGroupEncoder allocID(final char[] value, final int length)
    {
        return allocID(value, 0, length);
    }

    public OrdersGroupEncoder allocID(final char[] value, final int offset, final int length)
    {
        toBytes(value, allocID, offset, length);
        allocIDOffset = 0;
        allocIDLength = length;
        return this;
    }

    private char preallocMethod;

    private boolean hasPreallocMethod;

    public boolean hasPreallocMethod()
    {
        return hasPreallocMethod;
    }

    public OrdersGroupEncoder preallocMethod(char value)
    {
        preallocMethod = value;
        hasPreallocMethod = true;
        return this;
    }

    public char preallocMethod()
    {
        return preallocMethod;
    }

    public OrdersGroupEncoder preallocMethod(PreallocMethod value)
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



public static class AllocsGroupEncoder
{
    private AllocsGroupEncoder next = null;

    public AllocsGroupEncoder next()
    {
        if (next == null)
        {
            next = new AllocsGroupEncoder();
        }
        return next;
    }

    private static final int allocAccountHeaderLength = 3;
    private static final byte[] allocAccountHeader = new byte[] {55, 57, (byte) '='};

    private static final int allocAcctIDSourceHeaderLength = 4;
    private static final byte[] allocAcctIDSourceHeader = new byte[] {54, 54, 49, (byte) '='};

    private static final int allocSettlCurrencyHeaderLength = 4;
    private static final byte[] allocSettlCurrencyHeader = new byte[] {55, 51, 54, (byte) '='};

    private static final int individualAllocIDHeaderLength = 4;
    private static final byte[] individualAllocIDHeader = new byte[] {52, 54, 55, (byte) '='};

    private static final int allocQtyHeaderLength = 3;
    private static final byte[] allocQtyHeader = new byte[] {56, 48, (byte) '='};

    private final MutableDirectBuffer allocAccount = new UnsafeBuffer();

    private int allocAccountOffset = 0;

    private int allocAccountLength = 0;

    public AllocsGroupEncoder allocAccount(final DirectBuffer value, final int offset, final int length)
    {
        allocAccount.wrap(value);
        allocAccountOffset = offset;
        allocAccountLength = length;
        return this;
    }

    public AllocsGroupEncoder allocAccount(final DirectBuffer value, final int length)
    {
        return allocAccount(value, 0, length);
    }

    public AllocsGroupEncoder allocAccount(final DirectBuffer value)
    {
        return allocAccount(value, 0, value.capacity());
    }

    public AllocsGroupEncoder allocAccount(final byte[] value, final int offset, final int length)
    {
        allocAccount.wrap(value);
        allocAccountOffset = offset;
        allocAccountLength = length;
        return this;
    }

    public AllocsGroupEncoder allocAccountAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(allocAccount, value, offset, length);
        allocAccountOffset = offset;
        allocAccountLength = length;
        return this;
    }

    public AllocsGroupEncoder allocAccount(final byte[] value, final int length)
    {
        return allocAccount(value, 0, length);
    }

    public AllocsGroupEncoder allocAccount(final byte[] value)
    {
        return allocAccount(value, 0, value.length);
    }

    public boolean hasAllocAccount()
    {
        return allocAccountLength > 0;
    }

    public MutableDirectBuffer allocAccount()
    {
        return allocAccount;
    }

    public String allocAccountAsString()
    {
        return allocAccount.getStringWithoutLengthAscii(allocAccountOffset, allocAccountLength);
    }

    public AllocsGroupEncoder allocAccount(final CharSequence value)
    {
        toBytes(value, allocAccount);
        allocAccountOffset = 0;
        allocAccountLength = value.length();
        return this;
    }

    public AllocsGroupEncoder allocAccount(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            allocAccount.wrap(buffer);
            allocAccountOffset = value.offset();
            allocAccountLength = value.length();
        }
        return this;
    }

    public AllocsGroupEncoder allocAccount(final char[] value)
    {
        return allocAccount(value, 0, value.length);
    }

    public AllocsGroupEncoder allocAccount(final char[] value, final int length)
    {
        return allocAccount(value, 0, length);
    }

    public AllocsGroupEncoder allocAccount(final char[] value, final int offset, final int length)
    {
        toBytes(value, allocAccount, offset, length);
        allocAccountOffset = 0;
        allocAccountLength = length;
        return this;
    }

    private int allocAcctIDSource;

    private boolean hasAllocAcctIDSource;

    public boolean hasAllocAcctIDSource()
    {
        return hasAllocAcctIDSource;
    }

    public AllocsGroupEncoder allocAcctIDSource(int value)
    {
        allocAcctIDSource = value;
        hasAllocAcctIDSource = true;
        return this;
    }

    public int allocAcctIDSource()
    {
        return allocAcctIDSource;
    }

    private final MutableDirectBuffer allocSettlCurrency = new UnsafeBuffer();

    private int allocSettlCurrencyOffset = 0;

    private int allocSettlCurrencyLength = 0;

    public AllocsGroupEncoder allocSettlCurrency(final DirectBuffer value, final int offset, final int length)
    {
        allocSettlCurrency.wrap(value);
        allocSettlCurrencyOffset = offset;
        allocSettlCurrencyLength = length;
        return this;
    }

    public AllocsGroupEncoder allocSettlCurrency(final DirectBuffer value, final int length)
    {
        return allocSettlCurrency(value, 0, length);
    }

    public AllocsGroupEncoder allocSettlCurrency(final DirectBuffer value)
    {
        return allocSettlCurrency(value, 0, value.capacity());
    }

    public AllocsGroupEncoder allocSettlCurrency(final byte[] value, final int offset, final int length)
    {
        allocSettlCurrency.wrap(value);
        allocSettlCurrencyOffset = offset;
        allocSettlCurrencyLength = length;
        return this;
    }

    public AllocsGroupEncoder allocSettlCurrencyAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(allocSettlCurrency, value, offset, length);
        allocSettlCurrencyOffset = offset;
        allocSettlCurrencyLength = length;
        return this;
    }

    public AllocsGroupEncoder allocSettlCurrency(final byte[] value, final int length)
    {
        return allocSettlCurrency(value, 0, length);
    }

    public AllocsGroupEncoder allocSettlCurrency(final byte[] value)
    {
        return allocSettlCurrency(value, 0, value.length);
    }

    public boolean hasAllocSettlCurrency()
    {
        return allocSettlCurrencyLength > 0;
    }

    public MutableDirectBuffer allocSettlCurrency()
    {
        return allocSettlCurrency;
    }

    public String allocSettlCurrencyAsString()
    {
        return allocSettlCurrency.getStringWithoutLengthAscii(allocSettlCurrencyOffset, allocSettlCurrencyLength);
    }

    public AllocsGroupEncoder allocSettlCurrency(final CharSequence value)
    {
        toBytes(value, allocSettlCurrency);
        allocSettlCurrencyOffset = 0;
        allocSettlCurrencyLength = value.length();
        return this;
    }

    public AllocsGroupEncoder allocSettlCurrency(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            allocSettlCurrency.wrap(buffer);
            allocSettlCurrencyOffset = value.offset();
            allocSettlCurrencyLength = value.length();
        }
        return this;
    }

    public AllocsGroupEncoder allocSettlCurrency(final char[] value)
    {
        return allocSettlCurrency(value, 0, value.length);
    }

    public AllocsGroupEncoder allocSettlCurrency(final char[] value, final int length)
    {
        return allocSettlCurrency(value, 0, length);
    }

    public AllocsGroupEncoder allocSettlCurrency(final char[] value, final int offset, final int length)
    {
        toBytes(value, allocSettlCurrency, offset, length);
        allocSettlCurrencyOffset = 0;
        allocSettlCurrencyLength = length;
        return this;
    }

    private final MutableDirectBuffer individualAllocID = new UnsafeBuffer();

    private int individualAllocIDOffset = 0;

    private int individualAllocIDLength = 0;

    public AllocsGroupEncoder individualAllocID(final DirectBuffer value, final int offset, final int length)
    {
        individualAllocID.wrap(value);
        individualAllocIDOffset = offset;
        individualAllocIDLength = length;
        return this;
    }

    public AllocsGroupEncoder individualAllocID(final DirectBuffer value, final int length)
    {
        return individualAllocID(value, 0, length);
    }

    public AllocsGroupEncoder individualAllocID(final DirectBuffer value)
    {
        return individualAllocID(value, 0, value.capacity());
    }

    public AllocsGroupEncoder individualAllocID(final byte[] value, final int offset, final int length)
    {
        individualAllocID.wrap(value);
        individualAllocIDOffset = offset;
        individualAllocIDLength = length;
        return this;
    }

    public AllocsGroupEncoder individualAllocIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(individualAllocID, value, offset, length);
        individualAllocIDOffset = offset;
        individualAllocIDLength = length;
        return this;
    }

    public AllocsGroupEncoder individualAllocID(final byte[] value, final int length)
    {
        return individualAllocID(value, 0, length);
    }

    public AllocsGroupEncoder individualAllocID(final byte[] value)
    {
        return individualAllocID(value, 0, value.length);
    }

    public boolean hasIndividualAllocID()
    {
        return individualAllocIDLength > 0;
    }

    public MutableDirectBuffer individualAllocID()
    {
        return individualAllocID;
    }

    public String individualAllocIDAsString()
    {
        return individualAllocID.getStringWithoutLengthAscii(individualAllocIDOffset, individualAllocIDLength);
    }

    public AllocsGroupEncoder individualAllocID(final CharSequence value)
    {
        toBytes(value, individualAllocID);
        individualAllocIDOffset = 0;
        individualAllocIDLength = value.length();
        return this;
    }

    public AllocsGroupEncoder individualAllocID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            individualAllocID.wrap(buffer);
            individualAllocIDOffset = value.offset();
            individualAllocIDLength = value.length();
        }
        return this;
    }

    public AllocsGroupEncoder individualAllocID(final char[] value)
    {
        return individualAllocID(value, 0, value.length);
    }

    public AllocsGroupEncoder individualAllocID(final char[] value, final int length)
    {
        return individualAllocID(value, 0, length);
    }

    public AllocsGroupEncoder individualAllocID(final char[] value, final int offset, final int length)
    {
        toBytes(value, individualAllocID, offset, length);
        individualAllocIDOffset = 0;
        individualAllocIDLength = length;
        return this;
    }

    private final NestedPartiesEncoder nestedParties = new NestedPartiesEncoder();
    public NestedPartiesEncoder nestedParties()
    {
        return nestedParties;
    }

    private final DecimalFloat allocQty = new DecimalFloat();

    private boolean hasAllocQty;

    public boolean hasAllocQty()
    {
        return hasAllocQty;
    }

    public AllocsGroupEncoder allocQty(DecimalFloat value)
    {
        allocQty.set(value);
        hasAllocQty = true;
        return this;
    }

    public AllocsGroupEncoder allocQty(long value, int scale)
    {
        allocQty.set(value, scale);
        hasAllocQty = true;
        return this;
    }

    public DecimalFloat allocQty()
    {
        return allocQty;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (allocAccountLength > 0)
        {
            buffer.putBytes(position, allocAccountHeader, 0, allocAccountHeaderLength);
            position += allocAccountHeaderLength;
            buffer.putBytes(position, allocAccount, allocAccountOffset, allocAccountLength);
            position += allocAccountLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasAllocAcctIDSource)
        {
            buffer.putBytes(position, allocAcctIDSourceHeader, 0, allocAcctIDSourceHeaderLength);
            position += allocAcctIDSourceHeaderLength;
            position += buffer.putIntAscii(position, allocAcctIDSource);
            buffer.putSeparator(position);
            position++;
        }

        if (allocSettlCurrencyLength > 0)
        {
            buffer.putBytes(position, allocSettlCurrencyHeader, 0, allocSettlCurrencyHeaderLength);
            position += allocSettlCurrencyHeaderLength;
            buffer.putBytes(position, allocSettlCurrency, allocSettlCurrencyOffset, allocSettlCurrencyLength);
            position += allocSettlCurrencyLength;
            buffer.putSeparator(position);
            position++;
        }

        if (individualAllocIDLength > 0)
        {
            buffer.putBytes(position, individualAllocIDHeader, 0, individualAllocIDHeaderLength);
            position += individualAllocIDHeaderLength;
            buffer.putBytes(position, individualAllocID, individualAllocIDOffset, individualAllocIDLength);
            position += individualAllocIDLength;
            buffer.putSeparator(position);
            position++;
        }

            position += nestedParties.encode(buffer, position);

        if (hasAllocQty)
        {
            buffer.putBytes(position, allocQtyHeader, 0, allocQtyHeaderLength);
            position += allocQtyHeaderLength;
            position += buffer.putFloatAscii(position, allocQty);
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
        this.resetAllocAccount();
        this.resetAllocAcctIDSource();
        this.resetAllocSettlCurrency();
        this.resetIndividualAllocID();
        this.resetAllocQty();
        nestedParties.reset();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetAllocAccount()
    {
        allocAccountLength = 0;
    }

    public void resetAllocAcctIDSource()
    {
        hasAllocAcctIDSource = false;
    }

    public void resetAllocSettlCurrency()
    {
        allocSettlCurrencyLength = 0;
    }

    public void resetIndividualAllocID()
    {
        individualAllocIDLength = 0;
    }

    public void resetAllocQty()
    {
        hasAllocQty = false;
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
        builder.append("\"MessageName\": \"AllocsGroup\",\n");
        if (hasAllocAccount())
        {
            indent(builder, level);
            builder.append("\"AllocAccount\": \"");
            appendBuffer(builder, allocAccount, allocAccountOffset, allocAccountLength);
            builder.append("\",\n");
        }

        if (hasAllocAcctIDSource())
        {
            indent(builder, level);
            builder.append("\"AllocAcctIDSource\": \"");
            builder.append(allocAcctIDSource);
            builder.append("\",\n");
        }

        if (hasAllocSettlCurrency())
        {
            indent(builder, level);
            builder.append("\"AllocSettlCurrency\": \"");
            appendBuffer(builder, allocSettlCurrency, allocSettlCurrencyOffset, allocSettlCurrencyLength);
            builder.append("\",\n");
        }

        if (hasIndividualAllocID())
        {
            indent(builder, level);
            builder.append("\"IndividualAllocID\": \"");
            appendBuffer(builder, individualAllocID, individualAllocIDOffset, individualAllocIDLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"NestedParties\": ");
    nestedParties.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasAllocQty())
        {
            indent(builder, level);
            builder.append("\"AllocQty\": \"");
            allocQty.appendTo(builder);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public AllocsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((AllocsGroupEncoder)encoder);
    }

    public AllocsGroupEncoder copyTo(final AllocsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasAllocAccount())
        {
            encoder.allocAccountAsCopy(allocAccount.byteArray(), 0, allocAccountLength);
        }

        if (hasAllocAcctIDSource())
        {
            encoder.allocAcctIDSource(this.allocAcctIDSource());
        }

        if (hasAllocSettlCurrency())
        {
            encoder.allocSettlCurrencyAsCopy(allocSettlCurrency.byteArray(), 0, allocSettlCurrencyLength);
        }

        if (hasIndividualAllocID())
        {
            encoder.individualAllocIDAsCopy(individualAllocID.byteArray(), 0, individualAllocIDLength);
        }


        nestedParties.copyTo(encoder.nestedParties());
        if (hasAllocQty())
        {
            encoder.allocQty(this.allocQty());
        }
        return encoder;
    }

}
    private int noAllocsGroupCounter;

    private boolean hasNoAllocsGroupCounter;

    public boolean hasNoAllocsGroupCounter()
    {
        return hasNoAllocsGroupCounter;
    }

    public OrdersGroupEncoder noAllocsGroupCounter(int value)
    {
        noAllocsGroupCounter = value;
        hasNoAllocsGroupCounter = true;
        return this;
    }

    public int noAllocsGroupCounter()
    {
        return noAllocsGroupCounter;
    }


    private AllocsGroupEncoder allocsGroup = null;

    public AllocsGroupEncoder allocsGroup(final int numberOfElements)
    {
        hasNoAllocsGroupCounter = true;
        noAllocsGroupCounter = numberOfElements;
        if (allocsGroup == null)
        {
            allocsGroup = new AllocsGroupEncoder();
        }
        return allocsGroup;
    }

    private char settlType;

    private boolean hasSettlType;

    public boolean hasSettlType()
    {
        return hasSettlType;
    }

    public OrdersGroupEncoder settlType(char value)
    {
        settlType = value;
        hasSettlType = true;
        return this;
    }

    public char settlType()
    {
        return settlType;
    }

    public OrdersGroupEncoder settlType(SettlType value)
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

    public OrdersGroupEncoder settlDate(final DirectBuffer value, final int offset, final int length)
    {
        settlDate.wrap(value);
        settlDateOffset = offset;
        settlDateLength = length;
        return this;
    }

    public OrdersGroupEncoder settlDate(final DirectBuffer value, final int length)
    {
        return settlDate(value, 0, length);
    }

    public OrdersGroupEncoder settlDate(final DirectBuffer value)
    {
        return settlDate(value, 0, value.capacity());
    }

    public OrdersGroupEncoder settlDate(final byte[] value, final int offset, final int length)
    {
        settlDate.wrap(value);
        settlDateOffset = offset;
        settlDateLength = length;
        return this;
    }

    public OrdersGroupEncoder settlDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlDate, value, offset, length);
        settlDateOffset = offset;
        settlDateLength = length;
        return this;
    }

    public OrdersGroupEncoder settlDate(final byte[] value, final int length)
    {
        return settlDate(value, 0, length);
    }

    public OrdersGroupEncoder settlDate(final byte[] value)
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

    public OrdersGroupEncoder cashMargin(char value)
    {
        cashMargin = value;
        hasCashMargin = true;
        return this;
    }

    public char cashMargin()
    {
        return cashMargin;
    }

    public OrdersGroupEncoder cashMargin(CashMargin value)
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

    public OrdersGroupEncoder clearingFeeIndicator(final DirectBuffer value, final int offset, final int length)
    {
        clearingFeeIndicator.wrap(value);
        clearingFeeIndicatorOffset = offset;
        clearingFeeIndicatorLength = length;
        return this;
    }

    public OrdersGroupEncoder clearingFeeIndicator(final DirectBuffer value, final int length)
    {
        return clearingFeeIndicator(value, 0, length);
    }

    public OrdersGroupEncoder clearingFeeIndicator(final DirectBuffer value)
    {
        return clearingFeeIndicator(value, 0, value.capacity());
    }

    public OrdersGroupEncoder clearingFeeIndicator(final byte[] value, final int offset, final int length)
    {
        clearingFeeIndicator.wrap(value);
        clearingFeeIndicatorOffset = offset;
        clearingFeeIndicatorLength = length;
        return this;
    }

    public OrdersGroupEncoder clearingFeeIndicatorAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(clearingFeeIndicator, value, offset, length);
        clearingFeeIndicatorOffset = offset;
        clearingFeeIndicatorLength = length;
        return this;
    }

    public OrdersGroupEncoder clearingFeeIndicator(final byte[] value, final int length)
    {
        return clearingFeeIndicator(value, 0, length);
    }

    public OrdersGroupEncoder clearingFeeIndicator(final byte[] value)
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

    public OrdersGroupEncoder clearingFeeIndicator(final CharSequence value)
    {
        toBytes(value, clearingFeeIndicator);
        clearingFeeIndicatorOffset = 0;
        clearingFeeIndicatorLength = value.length();
        return this;
    }

    public OrdersGroupEncoder clearingFeeIndicator(final AsciiSequenceView value)
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

    public OrdersGroupEncoder clearingFeeIndicator(final char[] value)
    {
        return clearingFeeIndicator(value, 0, value.length);
    }

    public OrdersGroupEncoder clearingFeeIndicator(final char[] value, final int length)
    {
        return clearingFeeIndicator(value, 0, length);
    }

    public OrdersGroupEncoder clearingFeeIndicator(final char[] value, final int offset, final int length)
    {
        toBytes(value, clearingFeeIndicator, offset, length);
        clearingFeeIndicatorOffset = 0;
        clearingFeeIndicatorLength = length;
        return this;
    }

    public OrdersGroupEncoder clearingFeeIndicator(ClearingFeeIndicator value)
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

    public OrdersGroupEncoder handlInst(char value)
    {
        handlInst = value;
        hasHandlInst = true;
        return this;
    }

    public char handlInst()
    {
        return handlInst;
    }

    public OrdersGroupEncoder handlInst(HandlInst value)
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

    public OrdersGroupEncoder execInst(final DirectBuffer value, final int offset, final int length)
    {
        execInst.wrap(value);
        execInstOffset = offset;
        execInstLength = length;
        return this;
    }

    public OrdersGroupEncoder execInst(final DirectBuffer value, final int length)
    {
        return execInst(value, 0, length);
    }

    public OrdersGroupEncoder execInst(final DirectBuffer value)
    {
        return execInst(value, 0, value.capacity());
    }

    public OrdersGroupEncoder execInst(final byte[] value, final int offset, final int length)
    {
        execInst.wrap(value);
        execInstOffset = offset;
        execInstLength = length;
        return this;
    }

    public OrdersGroupEncoder execInstAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(execInst, value, offset, length);
        execInstOffset = offset;
        execInstLength = length;
        return this;
    }

    public OrdersGroupEncoder execInst(final byte[] value, final int length)
    {
        return execInst(value, 0, length);
    }

    public OrdersGroupEncoder execInst(final byte[] value)
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

    public OrdersGroupEncoder execInst(final CharSequence value)
    {
        toBytes(value, execInst);
        execInstOffset = 0;
        execInstLength = value.length();
        return this;
    }

    public OrdersGroupEncoder execInst(final AsciiSequenceView value)
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

    public OrdersGroupEncoder execInst(final char[] value)
    {
        return execInst(value, 0, value.length);
    }

    public OrdersGroupEncoder execInst(final char[] value, final int length)
    {
        return execInst(value, 0, length);
    }

    public OrdersGroupEncoder execInst(final char[] value, final int offset, final int length)
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

    public OrdersGroupEncoder minQty(DecimalFloat value)
    {
        minQty.set(value);
        hasMinQty = true;
        return this;
    }

    public OrdersGroupEncoder minQty(long value, int scale)
    {
        minQty.set(value, scale);
        hasMinQty = true;
        return this;
    }

    public DecimalFloat minQty()
    {
        return minQty;
    }

    private final DecimalFloat maxFloor = new DecimalFloat();

    private boolean hasMaxFloor;

    public boolean hasMaxFloor()
    {
        return hasMaxFloor;
    }

    public OrdersGroupEncoder maxFloor(DecimalFloat value)
    {
        maxFloor.set(value);
        hasMaxFloor = true;
        return this;
    }

    public OrdersGroupEncoder maxFloor(long value, int scale)
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

    public OrdersGroupEncoder exDestination(final DirectBuffer value, final int offset, final int length)
    {
        exDestination.wrap(value);
        exDestinationOffset = offset;
        exDestinationLength = length;
        return this;
    }

    public OrdersGroupEncoder exDestination(final DirectBuffer value, final int length)
    {
        return exDestination(value, 0, length);
    }

    public OrdersGroupEncoder exDestination(final DirectBuffer value)
    {
        return exDestination(value, 0, value.capacity());
    }

    public OrdersGroupEncoder exDestination(final byte[] value, final int offset, final int length)
    {
        exDestination.wrap(value);
        exDestinationOffset = offset;
        exDestinationLength = length;
        return this;
    }

    public OrdersGroupEncoder exDestinationAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(exDestination, value, offset, length);
        exDestinationOffset = offset;
        exDestinationLength = length;
        return this;
    }

    public OrdersGroupEncoder exDestination(final byte[] value, final int length)
    {
        return exDestination(value, 0, length);
    }

    public OrdersGroupEncoder exDestination(final byte[] value)
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

    public OrdersGroupEncoder exDestination(final CharSequence value)
    {
        toBytes(value, exDestination);
        exDestinationOffset = 0;
        exDestinationLength = value.length();
        return this;
    }

    public OrdersGroupEncoder exDestination(final AsciiSequenceView value)
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

    public OrdersGroupEncoder exDestination(final char[] value)
    {
        return exDestination(value, 0, value.length);
    }

    public OrdersGroupEncoder exDestination(final char[] value, final int length)
    {
        return exDestination(value, 0, length);
    }

    public OrdersGroupEncoder exDestination(final char[] value, final int offset, final int length)
    {
        toBytes(value, exDestination, offset, length);
        exDestinationOffset = 0;
        exDestinationLength = length;
        return this;
    }



public static class TradingSessionsGroupEncoder
{
    private TradingSessionsGroupEncoder next = null;

    public TradingSessionsGroupEncoder next()
    {
        if (next == null)
        {
            next = new TradingSessionsGroupEncoder();
        }
        return next;
    }

    private static final int tradingSessionIDHeaderLength = 4;
    private static final byte[] tradingSessionIDHeader = new byte[] {51, 51, 54, (byte) '='};

    private static final int tradingSessionSubIDHeaderLength = 4;
    private static final byte[] tradingSessionSubIDHeader = new byte[] {54, 50, 53, (byte) '='};

    private final MutableDirectBuffer tradingSessionID = new UnsafeBuffer();

    private int tradingSessionIDOffset = 0;

    private int tradingSessionIDLength = 0;

    public TradingSessionsGroupEncoder tradingSessionID(final DirectBuffer value, final int offset, final int length)
    {
        tradingSessionID.wrap(value);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public TradingSessionsGroupEncoder tradingSessionID(final DirectBuffer value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public TradingSessionsGroupEncoder tradingSessionID(final DirectBuffer value)
    {
        return tradingSessionID(value, 0, value.capacity());
    }

    public TradingSessionsGroupEncoder tradingSessionID(final byte[] value, final int offset, final int length)
    {
        tradingSessionID.wrap(value);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public TradingSessionsGroupEncoder tradingSessionIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradingSessionID, value, offset, length);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public TradingSessionsGroupEncoder tradingSessionID(final byte[] value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public TradingSessionsGroupEncoder tradingSessionID(final byte[] value)
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

    public TradingSessionsGroupEncoder tradingSessionID(final CharSequence value)
    {
        toBytes(value, tradingSessionID);
        tradingSessionIDOffset = 0;
        tradingSessionIDLength = value.length();
        return this;
    }

    public TradingSessionsGroupEncoder tradingSessionID(final AsciiSequenceView value)
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

    public TradingSessionsGroupEncoder tradingSessionID(final char[] value)
    {
        return tradingSessionID(value, 0, value.length);
    }

    public TradingSessionsGroupEncoder tradingSessionID(final char[] value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public TradingSessionsGroupEncoder tradingSessionID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradingSessionID, offset, length);
        tradingSessionIDOffset = 0;
        tradingSessionIDLength = length;
        return this;
    }

    private final MutableDirectBuffer tradingSessionSubID = new UnsafeBuffer();

    private int tradingSessionSubIDOffset = 0;

    private int tradingSessionSubIDLength = 0;

    public TradingSessionsGroupEncoder tradingSessionSubID(final DirectBuffer value, final int offset, final int length)
    {
        tradingSessionSubID.wrap(value);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public TradingSessionsGroupEncoder tradingSessionSubID(final DirectBuffer value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public TradingSessionsGroupEncoder tradingSessionSubID(final DirectBuffer value)
    {
        return tradingSessionSubID(value, 0, value.capacity());
    }

    public TradingSessionsGroupEncoder tradingSessionSubID(final byte[] value, final int offset, final int length)
    {
        tradingSessionSubID.wrap(value);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public TradingSessionsGroupEncoder tradingSessionSubIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradingSessionSubID, value, offset, length);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public TradingSessionsGroupEncoder tradingSessionSubID(final byte[] value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public TradingSessionsGroupEncoder tradingSessionSubID(final byte[] value)
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

    public TradingSessionsGroupEncoder tradingSessionSubID(final CharSequence value)
    {
        toBytes(value, tradingSessionSubID);
        tradingSessionSubIDOffset = 0;
        tradingSessionSubIDLength = value.length();
        return this;
    }

    public TradingSessionsGroupEncoder tradingSessionSubID(final AsciiSequenceView value)
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

    public TradingSessionsGroupEncoder tradingSessionSubID(final char[] value)
    {
        return tradingSessionSubID(value, 0, value.length);
    }

    public TradingSessionsGroupEncoder tradingSessionSubID(final char[] value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public TradingSessionsGroupEncoder tradingSessionSubID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradingSessionSubID, offset, length);
        tradingSessionSubIDOffset = 0;
        tradingSessionSubIDLength = length;
        return this;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

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
        if (next != null)
        {
            position += next.encode(buffer, position, remainingElements - 1);
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetTradingSessionID();
        this.resetTradingSessionSubID();
        if (next != null)        {
            next.reset();
        }
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
        builder.append("\"MessageName\": \"TradingSessionsGroup\",\n");
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
    public TradingSessionsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((TradingSessionsGroupEncoder)encoder);
    }

    public TradingSessionsGroupEncoder copyTo(final TradingSessionsGroupEncoder encoder)
    {
        encoder.reset();
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
    private int noTradingSessionsGroupCounter;

    private boolean hasNoTradingSessionsGroupCounter;

    public boolean hasNoTradingSessionsGroupCounter()
    {
        return hasNoTradingSessionsGroupCounter;
    }

    public OrdersGroupEncoder noTradingSessionsGroupCounter(int value)
    {
        noTradingSessionsGroupCounter = value;
        hasNoTradingSessionsGroupCounter = true;
        return this;
    }

    public int noTradingSessionsGroupCounter()
    {
        return noTradingSessionsGroupCounter;
    }


    private TradingSessionsGroupEncoder tradingSessionsGroup = null;

    public TradingSessionsGroupEncoder tradingSessionsGroup(final int numberOfElements)
    {
        hasNoTradingSessionsGroupCounter = true;
        noTradingSessionsGroupCounter = numberOfElements;
        if (tradingSessionsGroup == null)
        {
            tradingSessionsGroup = new TradingSessionsGroupEncoder();
        }
        return tradingSessionsGroup;
    }

    private char processCode;

    private boolean hasProcessCode;

    public boolean hasProcessCode()
    {
        return hasProcessCode;
    }

    public OrdersGroupEncoder processCode(char value)
    {
        processCode = value;
        hasProcessCode = true;
        return this;
    }

    public char processCode()
    {
        return processCode;
    }

    public OrdersGroupEncoder processCode(ProcessCode value)
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

    private final InstrumentEncoder instrument = new InstrumentEncoder();
    public InstrumentEncoder instrument()
    {
        return instrument;
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

    public OrdersGroupEncoder noUnderlyingsGroupCounter(int value)
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

    private final DecimalFloat prevClosePx = new DecimalFloat();

    private boolean hasPrevClosePx;

    public boolean hasPrevClosePx()
    {
        return hasPrevClosePx;
    }

    public OrdersGroupEncoder prevClosePx(DecimalFloat value)
    {
        prevClosePx.set(value);
        hasPrevClosePx = true;
        return this;
    }

    public OrdersGroupEncoder prevClosePx(long value, int scale)
    {
        prevClosePx.set(value, scale);
        hasPrevClosePx = true;
        return this;
    }

    public DecimalFloat prevClosePx()
    {
        return prevClosePx;
    }

    private char side;

    private boolean hasSide;

    public boolean hasSide()
    {
        return hasSide;
    }

    public OrdersGroupEncoder side(char value)
    {
        side = value;
        hasSide = true;
        return this;
    }

    public char side()
    {
        return side;
    }

    public OrdersGroupEncoder side(Side value)
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

    private int sideValueInd;

    private boolean hasSideValueInd;

    public boolean hasSideValueInd()
    {
        return hasSideValueInd;
    }

    public OrdersGroupEncoder sideValueInd(int value)
    {
        sideValueInd = value;
        hasSideValueInd = true;
        return this;
    }

    public int sideValueInd()
    {
        return sideValueInd;
    }

    public OrdersGroupEncoder sideValueInd(SideValueInd value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == SideValueInd.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: sideValueInd Value: " + value );
            }
            if (value == SideValueInd.NULL_VAL)
            {
                return this;
            }
        }
        return sideValueInd(value.representation());
    }

    private boolean locateReqd;

    private boolean hasLocateReqd;

    public boolean hasLocateReqd()
    {
        return hasLocateReqd;
    }

    public OrdersGroupEncoder locateReqd(boolean value)
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

    public OrdersGroupEncoder transactTime(final DirectBuffer value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public OrdersGroupEncoder transactTime(final DirectBuffer value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public OrdersGroupEncoder transactTime(final DirectBuffer value)
    {
        return transactTime(value, 0, value.capacity());
    }

    public OrdersGroupEncoder transactTime(final byte[] value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public OrdersGroupEncoder transactTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(transactTime, value, offset, length);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public OrdersGroupEncoder transactTime(final byte[] value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public OrdersGroupEncoder transactTime(final byte[] value)
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

    private final StipulationsEncoder stipulations = new StipulationsEncoder();
    public StipulationsEncoder stipulations()
    {
        return stipulations;
    }

    private int qtyType;

    private boolean hasQtyType;

    public boolean hasQtyType()
    {
        return hasQtyType;
    }

    public OrdersGroupEncoder qtyType(int value)
    {
        qtyType = value;
        hasQtyType = true;
        return this;
    }

    public int qtyType()
    {
        return qtyType;
    }

    public OrdersGroupEncoder qtyType(QtyType value)
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

    public OrdersGroupEncoder ordType(char value)
    {
        ordType = value;
        hasOrdType = true;
        return this;
    }

    public char ordType()
    {
        return ordType;
    }

    public OrdersGroupEncoder ordType(OrdType value)
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

    public OrdersGroupEncoder priceType(int value)
    {
        priceType = value;
        hasPriceType = true;
        return this;
    }

    public int priceType()
    {
        return priceType;
    }

    public OrdersGroupEncoder priceType(PriceType value)
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

    public OrdersGroupEncoder price(DecimalFloat value)
    {
        price.set(value);
        hasPrice = true;
        return this;
    }

    public OrdersGroupEncoder price(long value, int scale)
    {
        price.set(value, scale);
        hasPrice = true;
        return this;
    }

    public DecimalFloat price()
    {
        return price;
    }

    private final DecimalFloat stopPx = new DecimalFloat();

    private boolean hasStopPx;

    public boolean hasStopPx()
    {
        return hasStopPx;
    }

    public OrdersGroupEncoder stopPx(DecimalFloat value)
    {
        stopPx.set(value);
        hasStopPx = true;
        return this;
    }

    public OrdersGroupEncoder stopPx(long value, int scale)
    {
        stopPx.set(value, scale);
        hasStopPx = true;
        return this;
    }

    public DecimalFloat stopPx()
    {
        return stopPx;
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

    public OrdersGroupEncoder currency(final DirectBuffer value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public OrdersGroupEncoder currency(final DirectBuffer value, final int length)
    {
        return currency(value, 0, length);
    }

    public OrdersGroupEncoder currency(final DirectBuffer value)
    {
        return currency(value, 0, value.capacity());
    }

    public OrdersGroupEncoder currency(final byte[] value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public OrdersGroupEncoder currencyAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(currency, value, offset, length);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public OrdersGroupEncoder currency(final byte[] value, final int length)
    {
        return currency(value, 0, length);
    }

    public OrdersGroupEncoder currency(final byte[] value)
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

    public OrdersGroupEncoder currency(final CharSequence value)
    {
        toBytes(value, currency);
        currencyOffset = 0;
        currencyLength = value.length();
        return this;
    }

    public OrdersGroupEncoder currency(final AsciiSequenceView value)
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

    public OrdersGroupEncoder currency(final char[] value)
    {
        return currency(value, 0, value.length);
    }

    public OrdersGroupEncoder currency(final char[] value, final int length)
    {
        return currency(value, 0, length);
    }

    public OrdersGroupEncoder currency(final char[] value, final int offset, final int length)
    {
        toBytes(value, currency, offset, length);
        currencyOffset = 0;
        currencyLength = length;
        return this;
    }

    private final MutableDirectBuffer complianceID = new UnsafeBuffer();

    private int complianceIDOffset = 0;

    private int complianceIDLength = 0;

    public OrdersGroupEncoder complianceID(final DirectBuffer value, final int offset, final int length)
    {
        complianceID.wrap(value);
        complianceIDOffset = offset;
        complianceIDLength = length;
        return this;
    }

    public OrdersGroupEncoder complianceID(final DirectBuffer value, final int length)
    {
        return complianceID(value, 0, length);
    }

    public OrdersGroupEncoder complianceID(final DirectBuffer value)
    {
        return complianceID(value, 0, value.capacity());
    }

    public OrdersGroupEncoder complianceID(final byte[] value, final int offset, final int length)
    {
        complianceID.wrap(value);
        complianceIDOffset = offset;
        complianceIDLength = length;
        return this;
    }

    public OrdersGroupEncoder complianceIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(complianceID, value, offset, length);
        complianceIDOffset = offset;
        complianceIDLength = length;
        return this;
    }

    public OrdersGroupEncoder complianceID(final byte[] value, final int length)
    {
        return complianceID(value, 0, length);
    }

    public OrdersGroupEncoder complianceID(final byte[] value)
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

    public OrdersGroupEncoder complianceID(final CharSequence value)
    {
        toBytes(value, complianceID);
        complianceIDOffset = 0;
        complianceIDLength = value.length();
        return this;
    }

    public OrdersGroupEncoder complianceID(final AsciiSequenceView value)
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

    public OrdersGroupEncoder complianceID(final char[] value)
    {
        return complianceID(value, 0, value.length);
    }

    public OrdersGroupEncoder complianceID(final char[] value, final int length)
    {
        return complianceID(value, 0, length);
    }

    public OrdersGroupEncoder complianceID(final char[] value, final int offset, final int length)
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

    public OrdersGroupEncoder solicitedFlag(boolean value)
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

    public OrdersGroupEncoder iOIID(final DirectBuffer value, final int offset, final int length)
    {
        iOIID.wrap(value);
        iOIIDOffset = offset;
        iOIIDLength = length;
        return this;
    }

    public OrdersGroupEncoder iOIID(final DirectBuffer value, final int length)
    {
        return iOIID(value, 0, length);
    }

    public OrdersGroupEncoder iOIID(final DirectBuffer value)
    {
        return iOIID(value, 0, value.capacity());
    }

    public OrdersGroupEncoder iOIID(final byte[] value, final int offset, final int length)
    {
        iOIID.wrap(value);
        iOIIDOffset = offset;
        iOIIDLength = length;
        return this;
    }

    public OrdersGroupEncoder iOIIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(iOIID, value, offset, length);
        iOIIDOffset = offset;
        iOIIDLength = length;
        return this;
    }

    public OrdersGroupEncoder iOIID(final byte[] value, final int length)
    {
        return iOIID(value, 0, length);
    }

    public OrdersGroupEncoder iOIID(final byte[] value)
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

    public OrdersGroupEncoder iOIID(final CharSequence value)
    {
        toBytes(value, iOIID);
        iOIIDOffset = 0;
        iOIIDLength = value.length();
        return this;
    }

    public OrdersGroupEncoder iOIID(final AsciiSequenceView value)
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

    public OrdersGroupEncoder iOIID(final char[] value)
    {
        return iOIID(value, 0, value.length);
    }

    public OrdersGroupEncoder iOIID(final char[] value, final int length)
    {
        return iOIID(value, 0, length);
    }

    public OrdersGroupEncoder iOIID(final char[] value, final int offset, final int length)
    {
        toBytes(value, iOIID, offset, length);
        iOIIDOffset = 0;
        iOIIDLength = length;
        return this;
    }

    private final MutableDirectBuffer quoteID = new UnsafeBuffer();

    private int quoteIDOffset = 0;

    private int quoteIDLength = 0;

    public OrdersGroupEncoder quoteID(final DirectBuffer value, final int offset, final int length)
    {
        quoteID.wrap(value);
        quoteIDOffset = offset;
        quoteIDLength = length;
        return this;
    }

    public OrdersGroupEncoder quoteID(final DirectBuffer value, final int length)
    {
        return quoteID(value, 0, length);
    }

    public OrdersGroupEncoder quoteID(final DirectBuffer value)
    {
        return quoteID(value, 0, value.capacity());
    }

    public OrdersGroupEncoder quoteID(final byte[] value, final int offset, final int length)
    {
        quoteID.wrap(value);
        quoteIDOffset = offset;
        quoteIDLength = length;
        return this;
    }

    public OrdersGroupEncoder quoteIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(quoteID, value, offset, length);
        quoteIDOffset = offset;
        quoteIDLength = length;
        return this;
    }

    public OrdersGroupEncoder quoteID(final byte[] value, final int length)
    {
        return quoteID(value, 0, length);
    }

    public OrdersGroupEncoder quoteID(final byte[] value)
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

    public OrdersGroupEncoder quoteID(final CharSequence value)
    {
        toBytes(value, quoteID);
        quoteIDOffset = 0;
        quoteIDLength = value.length();
        return this;
    }

    public OrdersGroupEncoder quoteID(final AsciiSequenceView value)
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

    public OrdersGroupEncoder quoteID(final char[] value)
    {
        return quoteID(value, 0, value.length);
    }

    public OrdersGroupEncoder quoteID(final char[] value, final int length)
    {
        return quoteID(value, 0, length);
    }

    public OrdersGroupEncoder quoteID(final char[] value, final int offset, final int length)
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

    public OrdersGroupEncoder timeInForce(char value)
    {
        timeInForce = value;
        hasTimeInForce = true;
        return this;
    }

    public char timeInForce()
    {
        return timeInForce;
    }

    public OrdersGroupEncoder timeInForce(TimeInForce value)
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

    public OrdersGroupEncoder effectiveTime(final DirectBuffer value, final int offset, final int length)
    {
        effectiveTime.wrap(value);
        effectiveTimeOffset = offset;
        effectiveTimeLength = length;
        return this;
    }

    public OrdersGroupEncoder effectiveTime(final DirectBuffer value, final int length)
    {
        return effectiveTime(value, 0, length);
    }

    public OrdersGroupEncoder effectiveTime(final DirectBuffer value)
    {
        return effectiveTime(value, 0, value.capacity());
    }

    public OrdersGroupEncoder effectiveTime(final byte[] value, final int offset, final int length)
    {
        effectiveTime.wrap(value);
        effectiveTimeOffset = offset;
        effectiveTimeLength = length;
        return this;
    }

    public OrdersGroupEncoder effectiveTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(effectiveTime, value, offset, length);
        effectiveTimeOffset = offset;
        effectiveTimeLength = length;
        return this;
    }

    public OrdersGroupEncoder effectiveTime(final byte[] value, final int length)
    {
        return effectiveTime(value, 0, length);
    }

    public OrdersGroupEncoder effectiveTime(final byte[] value)
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

    public OrdersGroupEncoder expireDate(final DirectBuffer value, final int offset, final int length)
    {
        expireDate.wrap(value);
        expireDateOffset = offset;
        expireDateLength = length;
        return this;
    }

    public OrdersGroupEncoder expireDate(final DirectBuffer value, final int length)
    {
        return expireDate(value, 0, length);
    }

    public OrdersGroupEncoder expireDate(final DirectBuffer value)
    {
        return expireDate(value, 0, value.capacity());
    }

    public OrdersGroupEncoder expireDate(final byte[] value, final int offset, final int length)
    {
        expireDate.wrap(value);
        expireDateOffset = offset;
        expireDateLength = length;
        return this;
    }

    public OrdersGroupEncoder expireDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(expireDate, value, offset, length);
        expireDateOffset = offset;
        expireDateLength = length;
        return this;
    }

    public OrdersGroupEncoder expireDate(final byte[] value, final int length)
    {
        return expireDate(value, 0, length);
    }

    public OrdersGroupEncoder expireDate(final byte[] value)
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

    public OrdersGroupEncoder expireTime(final DirectBuffer value, final int offset, final int length)
    {
        expireTime.wrap(value);
        expireTimeOffset = offset;
        expireTimeLength = length;
        return this;
    }

    public OrdersGroupEncoder expireTime(final DirectBuffer value, final int length)
    {
        return expireTime(value, 0, length);
    }

    public OrdersGroupEncoder expireTime(final DirectBuffer value)
    {
        return expireTime(value, 0, value.capacity());
    }

    public OrdersGroupEncoder expireTime(final byte[] value, final int offset, final int length)
    {
        expireTime.wrap(value);
        expireTimeOffset = offset;
        expireTimeLength = length;
        return this;
    }

    public OrdersGroupEncoder expireTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(expireTime, value, offset, length);
        expireTimeOffset = offset;
        expireTimeLength = length;
        return this;
    }

    public OrdersGroupEncoder expireTime(final byte[] value, final int length)
    {
        return expireTime(value, 0, length);
    }

    public OrdersGroupEncoder expireTime(final byte[] value)
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

    public OrdersGroupEncoder gTBookingInst(int value)
    {
        gTBookingInst = value;
        hasGTBookingInst = true;
        return this;
    }

    public int gTBookingInst()
    {
        return gTBookingInst;
    }

    public OrdersGroupEncoder gTBookingInst(GTBookingInst value)
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

    public OrdersGroupEncoder orderCapacity(char value)
    {
        orderCapacity = value;
        hasOrderCapacity = true;
        return this;
    }

    public char orderCapacity()
    {
        return orderCapacity;
    }

    public OrdersGroupEncoder orderCapacity(OrderCapacity value)
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

    public OrdersGroupEncoder orderRestrictions(final DirectBuffer value, final int offset, final int length)
    {
        orderRestrictions.wrap(value);
        orderRestrictionsOffset = offset;
        orderRestrictionsLength = length;
        return this;
    }

    public OrdersGroupEncoder orderRestrictions(final DirectBuffer value, final int length)
    {
        return orderRestrictions(value, 0, length);
    }

    public OrdersGroupEncoder orderRestrictions(final DirectBuffer value)
    {
        return orderRestrictions(value, 0, value.capacity());
    }

    public OrdersGroupEncoder orderRestrictions(final byte[] value, final int offset, final int length)
    {
        orderRestrictions.wrap(value);
        orderRestrictionsOffset = offset;
        orderRestrictionsLength = length;
        return this;
    }

    public OrdersGroupEncoder orderRestrictionsAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(orderRestrictions, value, offset, length);
        orderRestrictionsOffset = offset;
        orderRestrictionsLength = length;
        return this;
    }

    public OrdersGroupEncoder orderRestrictions(final byte[] value, final int length)
    {
        return orderRestrictions(value, 0, length);
    }

    public OrdersGroupEncoder orderRestrictions(final byte[] value)
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

    public OrdersGroupEncoder orderRestrictions(final CharSequence value)
    {
        toBytes(value, orderRestrictions);
        orderRestrictionsOffset = 0;
        orderRestrictionsLength = value.length();
        return this;
    }

    public OrdersGroupEncoder orderRestrictions(final AsciiSequenceView value)
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

    public OrdersGroupEncoder orderRestrictions(final char[] value)
    {
        return orderRestrictions(value, 0, value.length);
    }

    public OrdersGroupEncoder orderRestrictions(final char[] value, final int length)
    {
        return orderRestrictions(value, 0, length);
    }

    public OrdersGroupEncoder orderRestrictions(final char[] value, final int offset, final int length)
    {
        toBytes(value, orderRestrictions, offset, length);
        orderRestrictionsOffset = 0;
        orderRestrictionsLength = length;
        return this;
    }

    private int custOrderCapacity;

    private boolean hasCustOrderCapacity;

    public boolean hasCustOrderCapacity()
    {
        return hasCustOrderCapacity;
    }

    public OrdersGroupEncoder custOrderCapacity(int value)
    {
        custOrderCapacity = value;
        hasCustOrderCapacity = true;
        return this;
    }

    public int custOrderCapacity()
    {
        return custOrderCapacity;
    }

    public OrdersGroupEncoder custOrderCapacity(CustOrderCapacity value)
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

    public OrdersGroupEncoder forexReq(boolean value)
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

    public OrdersGroupEncoder settlCurrency(final DirectBuffer value, final int offset, final int length)
    {
        settlCurrency.wrap(value);
        settlCurrencyOffset = offset;
        settlCurrencyLength = length;
        return this;
    }

    public OrdersGroupEncoder settlCurrency(final DirectBuffer value, final int length)
    {
        return settlCurrency(value, 0, length);
    }

    public OrdersGroupEncoder settlCurrency(final DirectBuffer value)
    {
        return settlCurrency(value, 0, value.capacity());
    }

    public OrdersGroupEncoder settlCurrency(final byte[] value, final int offset, final int length)
    {
        settlCurrency.wrap(value);
        settlCurrencyOffset = offset;
        settlCurrencyLength = length;
        return this;
    }

    public OrdersGroupEncoder settlCurrencyAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlCurrency, value, offset, length);
        settlCurrencyOffset = offset;
        settlCurrencyLength = length;
        return this;
    }

    public OrdersGroupEncoder settlCurrency(final byte[] value, final int length)
    {
        return settlCurrency(value, 0, length);
    }

    public OrdersGroupEncoder settlCurrency(final byte[] value)
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

    public OrdersGroupEncoder settlCurrency(final CharSequence value)
    {
        toBytes(value, settlCurrency);
        settlCurrencyOffset = 0;
        settlCurrencyLength = value.length();
        return this;
    }

    public OrdersGroupEncoder settlCurrency(final AsciiSequenceView value)
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

    public OrdersGroupEncoder settlCurrency(final char[] value)
    {
        return settlCurrency(value, 0, value.length);
    }

    public OrdersGroupEncoder settlCurrency(final char[] value, final int length)
    {
        return settlCurrency(value, 0, length);
    }

    public OrdersGroupEncoder settlCurrency(final char[] value, final int offset, final int length)
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

    public OrdersGroupEncoder bookingType(int value)
    {
        bookingType = value;
        hasBookingType = true;
        return this;
    }

    public int bookingType()
    {
        return bookingType;
    }

    public OrdersGroupEncoder bookingType(BookingType value)
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

    public OrdersGroupEncoder text(final DirectBuffer value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public OrdersGroupEncoder text(final DirectBuffer value, final int length)
    {
        return text(value, 0, length);
    }

    public OrdersGroupEncoder text(final DirectBuffer value)
    {
        return text(value, 0, value.capacity());
    }

    public OrdersGroupEncoder text(final byte[] value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public OrdersGroupEncoder textAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(text, value, offset, length);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public OrdersGroupEncoder text(final byte[] value, final int length)
    {
        return text(value, 0, length);
    }

    public OrdersGroupEncoder text(final byte[] value)
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

    public OrdersGroupEncoder text(final CharSequence value)
    {
        toBytes(value, text);
        textOffset = 0;
        textLength = value.length();
        return this;
    }

    public OrdersGroupEncoder text(final AsciiSequenceView value)
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

    public OrdersGroupEncoder text(final char[] value)
    {
        return text(value, 0, value.length);
    }

    public OrdersGroupEncoder text(final char[] value, final int length)
    {
        return text(value, 0, length);
    }

    public OrdersGroupEncoder text(final char[] value, final int offset, final int length)
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

    public OrdersGroupEncoder encodedTextLen(int value)
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

    public OrdersGroupEncoder encodedText(byte[] value)
    {
        encodedText = value;
        hasEncodedText = true;
        return this;
    }

    public byte[] encodedText()
    {
        return encodedText;
    }

    public OrdersGroupEncoder encodedTextAsCopy(final byte[] value, final int offset, final int length)
    {
        encodedText = copyInto(encodedText, value, offset, length);
        hasEncodedText = true;
        return this;
    }

    private final MutableDirectBuffer settlDate2 = new UnsafeBuffer();

    private int settlDate2Offset = 0;

    private int settlDate2Length = 0;

    public OrdersGroupEncoder settlDate2(final DirectBuffer value, final int offset, final int length)
    {
        settlDate2.wrap(value);
        settlDate2Offset = offset;
        settlDate2Length = length;
        return this;
    }

    public OrdersGroupEncoder settlDate2(final DirectBuffer value, final int length)
    {
        return settlDate2(value, 0, length);
    }

    public OrdersGroupEncoder settlDate2(final DirectBuffer value)
    {
        return settlDate2(value, 0, value.capacity());
    }

    public OrdersGroupEncoder settlDate2(final byte[] value, final int offset, final int length)
    {
        settlDate2.wrap(value);
        settlDate2Offset = offset;
        settlDate2Length = length;
        return this;
    }

    public OrdersGroupEncoder settlDate2AsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlDate2, value, offset, length);
        settlDate2Offset = offset;
        settlDate2Length = length;
        return this;
    }

    public OrdersGroupEncoder settlDate2(final byte[] value, final int length)
    {
        return settlDate2(value, 0, length);
    }

    public OrdersGroupEncoder settlDate2(final byte[] value)
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

    public OrdersGroupEncoder orderQty2(DecimalFloat value)
    {
        orderQty2.set(value);
        hasOrderQty2 = true;
        return this;
    }

    public OrdersGroupEncoder orderQty2(long value, int scale)
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

    public OrdersGroupEncoder price2(DecimalFloat value)
    {
        price2.set(value);
        hasPrice2 = true;
        return this;
    }

    public OrdersGroupEncoder price2(long value, int scale)
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

    public OrdersGroupEncoder positionEffect(char value)
    {
        positionEffect = value;
        hasPositionEffect = true;
        return this;
    }

    public char positionEffect()
    {
        return positionEffect;
    }

    public OrdersGroupEncoder positionEffect(PositionEffect value)
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

    public OrdersGroupEncoder coveredOrUncovered(int value)
    {
        coveredOrUncovered = value;
        hasCoveredOrUncovered = true;
        return this;
    }

    public int coveredOrUncovered()
    {
        return coveredOrUncovered;
    }

    public OrdersGroupEncoder coveredOrUncovered(CoveredOrUncovered value)
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

    public OrdersGroupEncoder maxShow(DecimalFloat value)
    {
        maxShow.set(value);
        hasMaxShow = true;
        return this;
    }

    public OrdersGroupEncoder maxShow(long value, int scale)
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

    public OrdersGroupEncoder targetStrategy(int value)
    {
        targetStrategy = value;
        hasTargetStrategy = true;
        return this;
    }

    public int targetStrategy()
    {
        return targetStrategy;
    }

    private final MutableDirectBuffer targetStrategyParameters = new UnsafeBuffer();

    private int targetStrategyParametersOffset = 0;

    private int targetStrategyParametersLength = 0;

    public OrdersGroupEncoder targetStrategyParameters(final DirectBuffer value, final int offset, final int length)
    {
        targetStrategyParameters.wrap(value);
        targetStrategyParametersOffset = offset;
        targetStrategyParametersLength = length;
        return this;
    }

    public OrdersGroupEncoder targetStrategyParameters(final DirectBuffer value, final int length)
    {
        return targetStrategyParameters(value, 0, length);
    }

    public OrdersGroupEncoder targetStrategyParameters(final DirectBuffer value)
    {
        return targetStrategyParameters(value, 0, value.capacity());
    }

    public OrdersGroupEncoder targetStrategyParameters(final byte[] value, final int offset, final int length)
    {
        targetStrategyParameters.wrap(value);
        targetStrategyParametersOffset = offset;
        targetStrategyParametersLength = length;
        return this;
    }

    public OrdersGroupEncoder targetStrategyParametersAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(targetStrategyParameters, value, offset, length);
        targetStrategyParametersOffset = offset;
        targetStrategyParametersLength = length;
        return this;
    }

    public OrdersGroupEncoder targetStrategyParameters(final byte[] value, final int length)
    {
        return targetStrategyParameters(value, 0, length);
    }

    public OrdersGroupEncoder targetStrategyParameters(final byte[] value)
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

    public OrdersGroupEncoder targetStrategyParameters(final CharSequence value)
    {
        toBytes(value, targetStrategyParameters);
        targetStrategyParametersOffset = 0;
        targetStrategyParametersLength = value.length();
        return this;
    }

    public OrdersGroupEncoder targetStrategyParameters(final AsciiSequenceView value)
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

    public OrdersGroupEncoder targetStrategyParameters(final char[] value)
    {
        return targetStrategyParameters(value, 0, value.length);
    }

    public OrdersGroupEncoder targetStrategyParameters(final char[] value, final int length)
    {
        return targetStrategyParameters(value, 0, length);
    }

    public OrdersGroupEncoder targetStrategyParameters(final char[] value, final int offset, final int length)
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

    public OrdersGroupEncoder participationRate(DecimalFloat value)
    {
        participationRate.set(value);
        hasParticipationRate = true;
        return this;
    }

    public OrdersGroupEncoder participationRate(long value, int scale)
    {
        participationRate.set(value, scale);
        hasParticipationRate = true;
        return this;
    }

    public DecimalFloat participationRate()
    {
        return participationRate;
    }

    private final MutableDirectBuffer designation = new UnsafeBuffer();

    private int designationOffset = 0;

    private int designationLength = 0;

    public OrdersGroupEncoder designation(final DirectBuffer value, final int offset, final int length)
    {
        designation.wrap(value);
        designationOffset = offset;
        designationLength = length;
        return this;
    }

    public OrdersGroupEncoder designation(final DirectBuffer value, final int length)
    {
        return designation(value, 0, length);
    }

    public OrdersGroupEncoder designation(final DirectBuffer value)
    {
        return designation(value, 0, value.capacity());
    }

    public OrdersGroupEncoder designation(final byte[] value, final int offset, final int length)
    {
        designation.wrap(value);
        designationOffset = offset;
        designationLength = length;
        return this;
    }

    public OrdersGroupEncoder designationAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(designation, value, offset, length);
        designationOffset = offset;
        designationLength = length;
        return this;
    }

    public OrdersGroupEncoder designation(final byte[] value, final int length)
    {
        return designation(value, 0, length);
    }

    public OrdersGroupEncoder designation(final byte[] value)
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

    public OrdersGroupEncoder designation(final CharSequence value)
    {
        toBytes(value, designation);
        designationOffset = 0;
        designationLength = value.length();
        return this;
    }

    public OrdersGroupEncoder designation(final AsciiSequenceView value)
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

    public OrdersGroupEncoder designation(final char[] value)
    {
        return designation(value, 0, value.length);
    }

    public OrdersGroupEncoder designation(final char[] value, final int length)
    {
        return designation(value, 0, length);
    }

    public OrdersGroupEncoder designation(final char[] value, final int offset, final int length)
    {
        toBytes(value, designation, offset, length);
        designationOffset = 0;
        designationLength = length;
        return this;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

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

        if (hasListSeqNo)
        {
            buffer.putBytes(position, listSeqNoHeader, 0, listSeqNoHeaderLength);
            position += listSeqNoHeaderLength;
            position += buffer.putIntAscii(position, listSeqNo);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: ListSeqNo");
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

        if (hasSettlInstMode)
        {
            buffer.putBytes(position, settlInstModeHeader, 0, settlInstModeHeaderLength);
            position += settlInstModeHeaderLength;
            position += buffer.putCharAscii(position, settlInstMode);
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

        if (allocIDLength > 0)
        {
            buffer.putBytes(position, allocIDHeader, 0, allocIDHeaderLength);
            position += allocIDHeaderLength;
            buffer.putBytes(position, allocID, allocIDOffset, allocIDLength);
            position += allocIDLength;
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

        if (hasNoAllocsGroupCounter)
        {
            buffer.putBytes(position, noAllocsGroupCounterHeader, 0, noAllocsGroupCounterHeaderLength);
            position += noAllocsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noAllocsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (allocsGroup != null)
        {
            position += allocsGroup.encode(buffer, position, noAllocsGroupCounter);
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

        if (hasNoTradingSessionsGroupCounter)
        {
            buffer.putBytes(position, noTradingSessionsGroupCounterHeader, 0, noTradingSessionsGroupCounterHeaderLength);
            position += noTradingSessionsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noTradingSessionsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (tradingSessionsGroup != null)
        {
            position += tradingSessionsGroup.encode(buffer, position, noTradingSessionsGroupCounter);
        }


        if (hasProcessCode)
        {
            buffer.putBytes(position, processCodeHeader, 0, processCodeHeaderLength);
            position += processCodeHeaderLength;
            position += buffer.putCharAscii(position, processCode);
            buffer.putSeparator(position);
            position++;
        }

            position += instrument.encode(buffer, position);

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


        if (hasPrevClosePx)
        {
            buffer.putBytes(position, prevClosePxHeader, 0, prevClosePxHeaderLength);
            position += prevClosePxHeaderLength;
            position += buffer.putFloatAscii(position, prevClosePx);
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

        if (hasSideValueInd)
        {
            buffer.putBytes(position, sideValueIndHeader, 0, sideValueIndHeaderLength);
            position += sideValueIndHeaderLength;
            position += buffer.putIntAscii(position, sideValueInd);
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

            position += stipulations.encode(buffer, position);

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

        if (hasStopPx)
        {
            buffer.putBytes(position, stopPxHeader, 0, stopPxHeaderLength);
            position += stopPxHeaderLength;
            position += buffer.putFloatAscii(position, stopPx);
            buffer.putSeparator(position);
            position++;
        }

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

        if (designationLength > 0)
        {
            buffer.putBytes(position, designationHeader, 0, designationHeaderLength);
            position += designationHeaderLength;
            buffer.putBytes(position, designation, designationOffset, designationLength);
            position += designationLength;
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
        this.resetClOrdID();
        this.resetSecondaryClOrdID();
        this.resetListSeqNo();
        this.resetClOrdLinkID();
        this.resetSettlInstMode();
        this.resetTradeOriginationDate();
        this.resetTradeDate();
        this.resetAccount();
        this.resetAcctIDSource();
        this.resetAccountType();
        this.resetDayBookingInst();
        this.resetBookingUnit();
        this.resetAllocID();
        this.resetPreallocMethod();
        this.resetSettlType();
        this.resetSettlDate();
        this.resetCashMargin();
        this.resetClearingFeeIndicator();
        this.resetHandlInst();
        this.resetExecInst();
        this.resetMinQty();
        this.resetMaxFloor();
        this.resetExDestination();
        this.resetProcessCode();
        this.resetPrevClosePx();
        this.resetSide();
        this.resetSideValueInd();
        this.resetLocateReqd();
        this.resetTransactTime();
        this.resetQtyType();
        this.resetOrdType();
        this.resetPriceType();
        this.resetPrice();
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
        this.resetTargetStrategy();
        this.resetTargetStrategyParameters();
        this.resetParticipationRate();
        this.resetDesignation();
        parties.reset();
        instrument.reset();
        stipulations.reset();
        orderQtyData.reset();
        spreadOrBenchmarkCurveData.reset();
        yieldData.reset();
        commissionData.reset();
        pegInstructions.reset();
        discretionInstructions.reset();
        this.resetAllocsGroup();
        this.resetTradingSessionsGroup();
        this.resetUnderlyingsGroup();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetClOrdID()
    {
        clOrdIDLength = 0;
    }

    public void resetSecondaryClOrdID()
    {
        secondaryClOrdIDLength = 0;
    }

    public void resetListSeqNo()
    {
        hasListSeqNo = false;
    }

    public void resetClOrdLinkID()
    {
        clOrdLinkIDLength = 0;
    }

    public void resetSettlInstMode()
    {
        hasSettlInstMode = false;
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

    public void resetAllocID()
    {
        allocIDLength = 0;
    }

    public void resetPreallocMethod()
    {
        hasPreallocMethod = false;
    }

    public void resetSettlType()
    {
        hasSettlType = false;
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

    public void resetMaxFloor()
    {
        hasMaxFloor = false;
    }

    public void resetExDestination()
    {
        exDestinationLength = 0;
    }

    public void resetProcessCode()
    {
        hasProcessCode = false;
    }

    public void resetPrevClosePx()
    {
        hasPrevClosePx = false;
    }

    public void resetSide()
    {
        side = MISSING_CHAR;
    }

    public void resetSideValueInd()
    {
        hasSideValueInd = false;
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
        hasOrdType = false;
    }

    public void resetPriceType()
    {
        hasPriceType = false;
    }

    public void resetPrice()
    {
        hasPrice = false;
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

    public void resetDesignation()
    {
        designationLength = 0;
    }

    public void resetAllocsGroup()
    {
        if (allocsGroup != null)
        {
            allocsGroup.reset();
        }
        noAllocsGroupCounter = 0;
        hasNoAllocsGroupCounter = false;
    }

    public void resetTradingSessionsGroup()
    {
        if (tradingSessionsGroup != null)
        {
            tradingSessionsGroup.reset();
        }
        noTradingSessionsGroupCounter = 0;
        hasNoTradingSessionsGroupCounter = false;
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
        builder.append("\"MessageName\": \"OrdersGroup\",\n");
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

        if (hasListSeqNo())
        {
            indent(builder, level);
            builder.append("\"ListSeqNo\": \"");
            builder.append(listSeqNo);
            builder.append("\",\n");
        }

        if (hasClOrdLinkID())
        {
            indent(builder, level);
            builder.append("\"ClOrdLinkID\": \"");
            appendBuffer(builder, clOrdLinkID, clOrdLinkIDOffset, clOrdLinkIDLength);
            builder.append("\",\n");
        }

        if (hasSettlInstMode())
        {
            indent(builder, level);
            builder.append("\"SettlInstMode\": \"");
            builder.append(settlInstMode);
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

        if (hasAllocID())
        {
            indent(builder, level);
            builder.append("\"AllocID\": \"");
            appendBuffer(builder, allocID, allocIDOffset, allocIDLength);
            builder.append("\",\n");
        }

        if (hasPreallocMethod())
        {
            indent(builder, level);
            builder.append("\"PreallocMethod\": \"");
            builder.append(preallocMethod);
            builder.append("\",\n");
        }

        if (hasNoAllocsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"AllocsGroup\": [\n");
            final int noAllocsGroupCounter = this.noAllocsGroupCounter;
            AllocsGroupEncoder allocsGroup = this.allocsGroup;
            for (int i = 0; i < noAllocsGroupCounter; i++)
            {
                indent(builder, level);
                allocsGroup.appendTo(builder, level + 1);
                if (i < (noAllocsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                allocsGroup = allocsGroup.next();
            }
            indent(builder, level);
            builder.append("],\n");
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

        if (hasNoTradingSessionsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"TradingSessionsGroup\": [\n");
            final int noTradingSessionsGroupCounter = this.noTradingSessionsGroupCounter;
            TradingSessionsGroupEncoder tradingSessionsGroup = this.tradingSessionsGroup;
            for (int i = 0; i < noTradingSessionsGroupCounter; i++)
            {
                indent(builder, level);
                tradingSessionsGroup.appendTo(builder, level + 1);
                if (i < (noTradingSessionsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                tradingSessionsGroup = tradingSessionsGroup.next();
            }
            indent(builder, level);
            builder.append("],\n");
        }

        if (hasProcessCode())
        {
            indent(builder, level);
            builder.append("\"ProcessCode\": \"");
            builder.append(processCode);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"Instrument\": ");
    instrument.appendTo(builder, level + 1);
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

        if (hasPrevClosePx())
        {
            indent(builder, level);
            builder.append("\"PrevClosePx\": \"");
            prevClosePx.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasSide())
        {
            indent(builder, level);
            builder.append("\"Side\": \"");
            builder.append(side);
            builder.append("\",\n");
        }

        if (hasSideValueInd())
        {
            indent(builder, level);
            builder.append("\"SideValueInd\": \"");
            builder.append(sideValueInd);
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

    indent(builder, level);
    builder.append("\"Stipulations\": ");
    stipulations.appendTo(builder, level + 1);
    builder.append("\n");

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

        if (hasStopPx())
        {
            indent(builder, level);
            builder.append("\"StopPx\": \"");
            stopPx.appendTo(builder);
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
    public OrdersGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((OrdersGroupEncoder)encoder);
    }

    public OrdersGroupEncoder copyTo(final OrdersGroupEncoder encoder)
    {
        encoder.reset();
        if (hasClOrdID())
        {
            encoder.clOrdIDAsCopy(clOrdID.byteArray(), 0, clOrdIDLength);
        }

        if (hasSecondaryClOrdID())
        {
            encoder.secondaryClOrdIDAsCopy(secondaryClOrdID.byteArray(), 0, secondaryClOrdIDLength);
        }

        if (hasListSeqNo())
        {
            encoder.listSeqNo(this.listSeqNo());
        }

        if (hasClOrdLinkID())
        {
            encoder.clOrdLinkIDAsCopy(clOrdLinkID.byteArray(), 0, clOrdLinkIDLength);
        }

        if (hasSettlInstMode())
        {
            encoder.settlInstMode(this.settlInstMode());
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

        if (hasAllocID())
        {
            encoder.allocIDAsCopy(allocID.byteArray(), 0, allocIDLength);
        }

        if (hasPreallocMethod())
        {
            encoder.preallocMethod(this.preallocMethod());
        }

        if (hasNoAllocsGroupCounter)
        {
            final int size = this.noAllocsGroupCounter;
            AllocsGroupEncoder allocsGroup = this.allocsGroup;
            AllocsGroupEncoder allocsGroupEncoder = encoder.allocsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (allocsGroup != null)
                {
                    allocsGroup.copyTo(allocsGroupEncoder);
                    allocsGroup = allocsGroup.next();
                    allocsGroupEncoder = allocsGroupEncoder.next();
                }
            }
        }

        if (hasSettlType())
        {
            encoder.settlType(this.settlType());
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

        if (hasMaxFloor())
        {
            encoder.maxFloor(this.maxFloor());
        }

        if (hasExDestination())
        {
            encoder.exDestinationAsCopy(exDestination.byteArray(), 0, exDestinationLength);
        }

        if (hasNoTradingSessionsGroupCounter)
        {
            final int size = this.noTradingSessionsGroupCounter;
            TradingSessionsGroupEncoder tradingSessionsGroup = this.tradingSessionsGroup;
            TradingSessionsGroupEncoder tradingSessionsGroupEncoder = encoder.tradingSessionsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (tradingSessionsGroup != null)
                {
                    tradingSessionsGroup.copyTo(tradingSessionsGroupEncoder);
                    tradingSessionsGroup = tradingSessionsGroup.next();
                    tradingSessionsGroupEncoder = tradingSessionsGroupEncoder.next();
                }
            }
        }

        if (hasProcessCode())
        {
            encoder.processCode(this.processCode());
        }


        instrument.copyTo(encoder.instrument());
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

        if (hasPrevClosePx())
        {
            encoder.prevClosePx(this.prevClosePx());
        }

        if (hasSide())
        {
            encoder.side(this.side());
        }

        if (hasSideValueInd())
        {
            encoder.sideValueInd(this.sideValueInd());
        }

        if (hasLocateReqd())
        {
            encoder.locateReqd(this.locateReqd());
        }

        if (hasTransactTime())
        {
            encoder.transactTimeAsCopy(transactTime.byteArray(), 0, transactTimeLength);
        }


        stipulations.copyTo(encoder.stipulations());
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

        if (hasStopPx())
        {
            encoder.stopPx(this.stopPx());
        }


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


        pegInstructions.copyTo(encoder.pegInstructions());

        discretionInstructions.copyTo(encoder.discretionInstructions());
        if (hasTargetStrategy())
        {
            encoder.targetStrategy(this.targetStrategy());
        }

        if (hasTargetStrategyParameters())
        {
            encoder.targetStrategyParametersAsCopy(targetStrategyParameters.byteArray(), 0, targetStrategyParametersLength);
        }

        if (hasParticipationRate())
        {
            encoder.participationRate(this.participationRate());
        }

        if (hasDesignation())
        {
            encoder.designationAsCopy(designation.byteArray(), 0, designationLength);
        }
        return encoder;
    }

}
    private int noOrdersGroupCounter;

    private boolean hasNoOrdersGroupCounter;

    public boolean hasNoOrdersGroupCounter()
    {
        return hasNoOrdersGroupCounter;
    }

    public NewOrderListEncoder noOrdersGroupCounter(int value)
    {
        noOrdersGroupCounter = value;
        hasNoOrdersGroupCounter = true;
        return this;
    }

    public int noOrdersGroupCounter()
    {
        return noOrdersGroupCounter;
    }


    private OrdersGroupEncoder ordersGroup = null;

    public OrdersGroupEncoder ordersGroup(final int numberOfElements)
    {
        hasNoOrdersGroupCounter = true;
        noOrdersGroupCounter = numberOfElements;
        if (ordersGroup == null)
        {
            ordersGroup = new OrdersGroupEncoder();
        }
        return ordersGroup;
    }

    public long encode(final MutableAsciiBuffer buffer, final int offset)
    {
        final long startMessageResult = header.startMessage(buffer, offset);
        final int bodyStart = Encoder.offset(startMessageResult);
        int position = bodyStart + Encoder.length(startMessageResult);

        if (listIDLength > 0)
        {
            buffer.putBytes(position, listIDHeader, 0, listIDHeaderLength);
            position += listIDHeaderLength;
            buffer.putBytes(position, listID, listIDOffset, listIDLength);
            position += listIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: ListID");
        }

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

        if (hasProgRptReqs)
        {
            buffer.putBytes(position, progRptReqsHeader, 0, progRptReqsHeaderLength);
            position += progRptReqsHeaderLength;
            position += buffer.putIntAscii(position, progRptReqs);
            buffer.putSeparator(position);
            position++;
        }

        if (hasBidType)
        {
            buffer.putBytes(position, bidTypeHeader, 0, bidTypeHeaderLength);
            position += bidTypeHeaderLength;
            position += buffer.putIntAscii(position, bidType);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: BidType");
        }

        if (hasProgPeriodInterval)
        {
            buffer.putBytes(position, progPeriodIntervalHeader, 0, progPeriodIntervalHeaderLength);
            position += progPeriodIntervalHeaderLength;
            position += buffer.putIntAscii(position, progPeriodInterval);
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

        if (hasListExecInstType)
        {
            buffer.putBytes(position, listExecInstTypeHeader, 0, listExecInstTypeHeaderLength);
            position += listExecInstTypeHeaderLength;
            position += buffer.putCharAscii(position, listExecInstType);
            buffer.putSeparator(position);
            position++;
        }

        if (listExecInstLength > 0)
        {
            buffer.putBytes(position, listExecInstHeader, 0, listExecInstHeaderLength);
            position += listExecInstHeaderLength;
            buffer.putBytes(position, listExecInst, listExecInstOffset, listExecInstLength);
            position += listExecInstLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasEncodedListExecInstLen)
        {
            buffer.putBytes(position, encodedListExecInstLenHeader, 0, encodedListExecInstLenHeaderLength);
            position += encodedListExecInstLenHeaderLength;
            position += buffer.putIntAscii(position, encodedListExecInstLen);
            buffer.putSeparator(position);
            position++;
        }

        if (hasEncodedListExecInst)
        {
            buffer.putBytes(position, encodedListExecInstHeader, 0, encodedListExecInstHeaderLength);
            position += encodedListExecInstHeaderLength;
            buffer.putBytes(position, encodedListExecInst);
            position += encodedListExecInst.length;
            buffer.putSeparator(position);
            position++;
        }

        if (hasAllowableOneSidednessPct)
        {
            buffer.putBytes(position, allowableOneSidednessPctHeader, 0, allowableOneSidednessPctHeaderLength);
            position += allowableOneSidednessPctHeaderLength;
            position += buffer.putFloatAscii(position, allowableOneSidednessPct);
            buffer.putSeparator(position);
            position++;
        }

        if (hasAllowableOneSidednessValue)
        {
            buffer.putBytes(position, allowableOneSidednessValueHeader, 0, allowableOneSidednessValueHeaderLength);
            position += allowableOneSidednessValueHeaderLength;
            position += buffer.putFloatAscii(position, allowableOneSidednessValue);
            buffer.putSeparator(position);
            position++;
        }

        if (allowableOneSidednessCurrLength > 0)
        {
            buffer.putBytes(position, allowableOneSidednessCurrHeader, 0, allowableOneSidednessCurrHeaderLength);
            position += allowableOneSidednessCurrHeaderLength;
            buffer.putBytes(position, allowableOneSidednessCurr, allowableOneSidednessCurrOffset, allowableOneSidednessCurrLength);
            position += allowableOneSidednessCurrLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasTotNoOrders)
        {
            buffer.putBytes(position, totNoOrdersHeader, 0, totNoOrdersHeaderLength);
            position += totNoOrdersHeaderLength;
            position += buffer.putIntAscii(position, totNoOrders);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: TotNoOrders");
        }

        if (hasLastFragment)
        {
            buffer.putBytes(position, lastFragmentHeader, 0, lastFragmentHeaderLength);
            position += lastFragmentHeaderLength;
            position += buffer.putBooleanAscii(position, lastFragment);
            buffer.putSeparator(position);
            position++;
        }

        if (hasNoOrdersGroupCounter)
        {
            buffer.putBytes(position, noOrdersGroupCounterHeader, 0, noOrdersGroupCounterHeaderLength);
            position += noOrdersGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noOrdersGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (ordersGroup != null)
        {
            position += ordersGroup.encode(buffer, position, noOrdersGroupCounter);
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
        this.resetListID();
        this.resetBidID();
        this.resetClientBidID();
        this.resetProgRptReqs();
        this.resetBidType();
        this.resetProgPeriodInterval();
        this.resetCancellationRights();
        this.resetMoneyLaunderingStatus();
        this.resetRegistID();
        this.resetListExecInstType();
        this.resetListExecInst();
        this.resetEncodedListExecInstLen();
        this.resetEncodedListExecInst();
        this.resetAllowableOneSidednessPct();
        this.resetAllowableOneSidednessValue();
        this.resetAllowableOneSidednessCurr();
        this.resetTotNoOrders();
        this.resetLastFragment();
        this.resetOrdersGroup();
    }

    public void resetListID()
    {
        listIDLength = 0;
    }

    public void resetBidID()
    {
        bidIDLength = 0;
    }

    public void resetClientBidID()
    {
        clientBidIDLength = 0;
    }

    public void resetProgRptReqs()
    {
        hasProgRptReqs = false;
    }

    public void resetBidType()
    {
        hasBidType = false;
    }

    public void resetProgPeriodInterval()
    {
        hasProgPeriodInterval = false;
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

    public void resetListExecInstType()
    {
        hasListExecInstType = false;
    }

    public void resetListExecInst()
    {
        listExecInstLength = 0;
    }

    public void resetEncodedListExecInstLen()
    {
        hasEncodedListExecInstLen = false;
    }

    public void resetEncodedListExecInst()
    {
        hasEncodedListExecInst = false;
    }

    public void resetAllowableOneSidednessPct()
    {
        hasAllowableOneSidednessPct = false;
    }

    public void resetAllowableOneSidednessValue()
    {
        hasAllowableOneSidednessValue = false;
    }

    public void resetAllowableOneSidednessCurr()
    {
        allowableOneSidednessCurrLength = 0;
    }

    public void resetTotNoOrders()
    {
        hasTotNoOrders = false;
    }

    public void resetLastFragment()
    {
        hasLastFragment = false;
    }

    public void resetOrdersGroup()
    {
        if (ordersGroup != null)
        {
            ordersGroup.reset();
        }
        noOrdersGroupCounter = 0;
        hasNoOrdersGroupCounter = false;
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
        builder.append("\"MessageName\": \"NewOrderList\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasListID())
        {
            indent(builder, level);
            builder.append("\"ListID\": \"");
            appendBuffer(builder, listID, listIDOffset, listIDLength);
            builder.append("\",\n");
        }

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

        if (hasProgRptReqs())
        {
            indent(builder, level);
            builder.append("\"ProgRptReqs\": \"");
            builder.append(progRptReqs);
            builder.append("\",\n");
        }

        if (hasBidType())
        {
            indent(builder, level);
            builder.append("\"BidType\": \"");
            builder.append(bidType);
            builder.append("\",\n");
        }

        if (hasProgPeriodInterval())
        {
            indent(builder, level);
            builder.append("\"ProgPeriodInterval\": \"");
            builder.append(progPeriodInterval);
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

        if (hasListExecInstType())
        {
            indent(builder, level);
            builder.append("\"ListExecInstType\": \"");
            builder.append(listExecInstType);
            builder.append("\",\n");
        }

        if (hasListExecInst())
        {
            indent(builder, level);
            builder.append("\"ListExecInst\": \"");
            appendBuffer(builder, listExecInst, listExecInstOffset, listExecInstLength);
            builder.append("\",\n");
        }

        if (hasEncodedListExecInstLen())
        {
            indent(builder, level);
            builder.append("\"EncodedListExecInstLen\": \"");
            builder.append(encodedListExecInstLen);
            builder.append("\",\n");
        }

        if (hasEncodedListExecInst())
        {
            indent(builder, level);
            builder.append("\"EncodedListExecInst\": \"");
            appendData(builder, encodedListExecInst, encodedListExecInstLen);
            builder.append("\",\n");
        }

        if (hasAllowableOneSidednessPct())
        {
            indent(builder, level);
            builder.append("\"AllowableOneSidednessPct\": \"");
            allowableOneSidednessPct.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasAllowableOneSidednessValue())
        {
            indent(builder, level);
            builder.append("\"AllowableOneSidednessValue\": \"");
            allowableOneSidednessValue.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasAllowableOneSidednessCurr())
        {
            indent(builder, level);
            builder.append("\"AllowableOneSidednessCurr\": \"");
            appendBuffer(builder, allowableOneSidednessCurr, allowableOneSidednessCurrOffset, allowableOneSidednessCurrLength);
            builder.append("\",\n");
        }

        if (hasTotNoOrders())
        {
            indent(builder, level);
            builder.append("\"TotNoOrders\": \"");
            builder.append(totNoOrders);
            builder.append("\",\n");
        }

        if (hasLastFragment())
        {
            indent(builder, level);
            builder.append("\"LastFragment\": \"");
            builder.append(lastFragment);
            builder.append("\",\n");
        }

        if (hasNoOrdersGroupCounter)
        {
            indent(builder, level);
            builder.append("\"OrdersGroup\": [\n");
            final int noOrdersGroupCounter = this.noOrdersGroupCounter;
            OrdersGroupEncoder ordersGroup = this.ordersGroup;
            for (int i = 0; i < noOrdersGroupCounter; i++)
            {
                indent(builder, level);
                ordersGroup.appendTo(builder, level + 1);
                if (i < (noOrdersGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                ordersGroup = ordersGroup.next();
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
    public NewOrderListEncoder copyTo(final Encoder encoder)
    {
        return copyTo((NewOrderListEncoder)encoder);
    }

    public NewOrderListEncoder copyTo(final NewOrderListEncoder encoder)
    {
        encoder.reset();
        if (hasListID())
        {
            encoder.listIDAsCopy(listID.byteArray(), 0, listIDLength);
        }

        if (hasBidID())
        {
            encoder.bidIDAsCopy(bidID.byteArray(), 0, bidIDLength);
        }

        if (hasClientBidID())
        {
            encoder.clientBidIDAsCopy(clientBidID.byteArray(), 0, clientBidIDLength);
        }

        if (hasProgRptReqs())
        {
            encoder.progRptReqs(this.progRptReqs());
        }

        if (hasBidType())
        {
            encoder.bidType(this.bidType());
        }

        if (hasProgPeriodInterval())
        {
            encoder.progPeriodInterval(this.progPeriodInterval());
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

        if (hasListExecInstType())
        {
            encoder.listExecInstType(this.listExecInstType());
        }

        if (hasListExecInst())
        {
            encoder.listExecInstAsCopy(listExecInst.byteArray(), 0, listExecInstLength);
        }

        if (hasEncodedListExecInstLen())
        {
            encoder.encodedListExecInstLen(this.encodedListExecInstLen());
        }

        if (hasEncodedListExecInst())
        {
            encoder.encodedListExecInstAsCopy(this.encodedListExecInst(), 0, encodedListExecInstLen());
            encoder.encodedListExecInstLen(encodedListExecInstLen());
        }

        if (hasAllowableOneSidednessPct())
        {
            encoder.allowableOneSidednessPct(this.allowableOneSidednessPct());
        }

        if (hasAllowableOneSidednessValue())
        {
            encoder.allowableOneSidednessValue(this.allowableOneSidednessValue());
        }

        if (hasAllowableOneSidednessCurr())
        {
            encoder.allowableOneSidednessCurrAsCopy(allowableOneSidednessCurr.byteArray(), 0, allowableOneSidednessCurrLength);
        }

        if (hasTotNoOrders())
        {
            encoder.totNoOrders(this.totNoOrders());
        }

        if (hasLastFragment())
        {
            encoder.lastFragment(this.lastFragment());
        }

        if (hasNoOrdersGroupCounter)
        {
            final int size = this.noOrdersGroupCounter;
            OrdersGroupEncoder ordersGroup = this.ordersGroup;
            OrdersGroupEncoder ordersGroupEncoder = encoder.ordersGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (ordersGroup != null)
                {
                    ordersGroup.copyTo(ordersGroupEncoder);
                    ordersGroup = ordersGroup.next();
                    ordersGroupEncoder = ordersGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
