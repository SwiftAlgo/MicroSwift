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

    private static final int contingencyTypeHeaderLength = 5;
    private static final byte[] contingencyTypeHeader = new byte[] {49, 51, 56, 53, (byte) '='};

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

    private int contingencyType;

    private boolean hasContingencyType;

    public boolean hasContingencyType()
    {
        return hasContingencyType;
    }

    public NewOrderListEncoder contingencyType(int value)
    {
        contingencyType = value;
        hasContingencyType = true;
        return this;
    }

    public int contingencyType()
    {
        return contingencyType;
    }

    public NewOrderListEncoder contingencyType(ContingencyType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == ContingencyType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: contingencyType Value: " + value );
            }
            if (value == ContingencyType.NULL_VAL)
            {
                return this;
            }
        }
        return contingencyType(value.representation());
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

    private final RootPartiesEncoder rootParties = new RootPartiesEncoder();
    public RootPartiesEncoder rootParties()
    {
        return rootParties;
    }

    private final ListOrdGrpEncoder listOrdGrp = new ListOrdGrpEncoder();
    public ListOrdGrpEncoder listOrdGrp()
    {
        return listOrdGrp;
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

        if (hasContingencyType)
        {
            buffer.putBytes(position, contingencyTypeHeader, 0, contingencyTypeHeaderLength);
            position += contingencyTypeHeaderLength;
            position += buffer.putIntAscii(position, contingencyType);
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

            position += rootParties.encode(buffer, position);

            position += listOrdGrp.encode(buffer, position);
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
        this.resetContingencyType();
        this.resetEncodedListExecInstLen();
        this.resetEncodedListExecInst();
        this.resetAllowableOneSidednessPct();
        this.resetAllowableOneSidednessValue();
        this.resetAllowableOneSidednessCurr();
        this.resetTotNoOrders();
        this.resetLastFragment();
        rootParties.reset();
        listOrdGrp.reset();
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

    public void resetContingencyType()
    {
        hasContingencyType = false;
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

        if (hasContingencyType())
        {
            indent(builder, level);
            builder.append("\"ContingencyType\": \"");
            builder.append(contingencyType);
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

    indent(builder, level);
    builder.append("\"RootParties\": ");
    rootParties.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"ListOrdGrp\": ");
    listOrdGrp.appendTo(builder, level + 1);
    builder.append("\n");
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

        if (hasContingencyType())
        {
            encoder.contingencyType(this.contingencyType());
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


        rootParties.copyTo(encoder.rootParties());

        listOrdGrp.copyTo(encoder.listOrdGrp());        return encoder;
    }

}
