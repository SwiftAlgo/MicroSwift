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


public class PositionMaintenanceReportEncoder implements Encoder
{
    public long messageType()
    {
        return 19777L;
    }

    public PositionMaintenanceReportEncoder()
    {
        header.msgType("AM");
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

    private static final int posMaintRptIDHeaderLength = 4;
    private static final byte[] posMaintRptIDHeader = new byte[] {55, 50, 49, (byte) '='};

    private static final int posTransTypeHeaderLength = 4;
    private static final byte[] posTransTypeHeader = new byte[] {55, 48, 57, (byte) '='};

    private static final int posReqIDHeaderLength = 4;
    private static final byte[] posReqIDHeader = new byte[] {55, 49, 48, (byte) '='};

    private static final int posMaintActionHeaderLength = 4;
    private static final byte[] posMaintActionHeader = new byte[] {55, 49, 50, (byte) '='};

    private static final int origPosReqRefIDHeaderLength = 4;
    private static final byte[] origPosReqRefIDHeader = new byte[] {55, 49, 51, (byte) '='};

    private static final int posMaintStatusHeaderLength = 4;
    private static final byte[] posMaintStatusHeader = new byte[] {55, 50, 50, (byte) '='};

    private static final int posMaintResultHeaderLength = 4;
    private static final byte[] posMaintResultHeader = new byte[] {55, 50, 51, (byte) '='};

    private static final int clearingBusinessDateHeaderLength = 4;
    private static final byte[] clearingBusinessDateHeader = new byte[] {55, 49, 53, (byte) '='};

    private static final int settlSessIDHeaderLength = 4;
    private static final byte[] settlSessIDHeader = new byte[] {55, 49, 54, (byte) '='};

    private static final int settlSessSubIDHeaderLength = 4;
    private static final byte[] settlSessSubIDHeader = new byte[] {55, 49, 55, (byte) '='};

    private static final int accountHeaderLength = 2;
    private static final byte[] accountHeader = new byte[] {49, (byte) '='};

    private static final int acctIDSourceHeaderLength = 4;
    private static final byte[] acctIDSourceHeader = new byte[] {54, 54, 48, (byte) '='};

    private static final int accountTypeHeaderLength = 4;
    private static final byte[] accountTypeHeader = new byte[] {53, 56, 49, (byte) '='};

    private static final int posMaintRptRefIDHeaderLength = 4;
    private static final byte[] posMaintRptRefIDHeader = new byte[] {55, 49, 52, (byte) '='};

    private static final int currencyHeaderLength = 3;
    private static final byte[] currencyHeader = new byte[] {49, 53, (byte) '='};

    private static final int settlCurrencyHeaderLength = 4;
    private static final byte[] settlCurrencyHeader = new byte[] {49, 50, 48, (byte) '='};

    private static final int contraryInstructionIndicatorHeaderLength = 4;
    private static final byte[] contraryInstructionIndicatorHeader = new byte[] {55, 49, 57, (byte) '='};

    private static final int priorSpreadIndicatorHeaderLength = 4;
    private static final byte[] priorSpreadIndicatorHeader = new byte[] {55, 50, 48, (byte) '='};

    private static final int transactTimeHeaderLength = 3;
    private static final byte[] transactTimeHeader = new byte[] {54, 48, (byte) '='};

    private static final int adjustmentTypeHeaderLength = 4;
    private static final byte[] adjustmentTypeHeader = new byte[] {55, 49, 56, (byte) '='};

    private static final int thresholdAmountHeaderLength = 4;
    private static final byte[] thresholdAmountHeader = new byte[] {56, 51, 52, (byte) '='};

    private static final int textHeaderLength = 3;
    private static final byte[] textHeader = new byte[] {53, 56, (byte) '='};

    private static final int encodedTextLenHeaderLength = 4;
    private static final byte[] encodedTextLenHeader = new byte[] {51, 53, 52, (byte) '='};

    private static final int encodedTextHeaderLength = 4;
    private static final byte[] encodedTextHeader = new byte[] {51, 53, 53, (byte) '='};

    private final MutableDirectBuffer posMaintRptID = new UnsafeBuffer();

    private int posMaintRptIDOffset = 0;

    private int posMaintRptIDLength = 0;

    public PositionMaintenanceReportEncoder posMaintRptID(final DirectBuffer value, final int offset, final int length)
    {
        posMaintRptID.wrap(value);
        posMaintRptIDOffset = offset;
        posMaintRptIDLength = length;
        return this;
    }

    public PositionMaintenanceReportEncoder posMaintRptID(final DirectBuffer value, final int length)
    {
        return posMaintRptID(value, 0, length);
    }

    public PositionMaintenanceReportEncoder posMaintRptID(final DirectBuffer value)
    {
        return posMaintRptID(value, 0, value.capacity());
    }

    public PositionMaintenanceReportEncoder posMaintRptID(final byte[] value, final int offset, final int length)
    {
        posMaintRptID.wrap(value);
        posMaintRptIDOffset = offset;
        posMaintRptIDLength = length;
        return this;
    }

    public PositionMaintenanceReportEncoder posMaintRptIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(posMaintRptID, value, offset, length);
        posMaintRptIDOffset = offset;
        posMaintRptIDLength = length;
        return this;
    }

    public PositionMaintenanceReportEncoder posMaintRptID(final byte[] value, final int length)
    {
        return posMaintRptID(value, 0, length);
    }

    public PositionMaintenanceReportEncoder posMaintRptID(final byte[] value)
    {
        return posMaintRptID(value, 0, value.length);
    }

    public boolean hasPosMaintRptID()
    {
        return posMaintRptIDLength > 0;
    }

    public MutableDirectBuffer posMaintRptID()
    {
        return posMaintRptID;
    }

    public String posMaintRptIDAsString()
    {
        return posMaintRptID.getStringWithoutLengthAscii(posMaintRptIDOffset, posMaintRptIDLength);
    }

    public PositionMaintenanceReportEncoder posMaintRptID(final CharSequence value)
    {
        toBytes(value, posMaintRptID);
        posMaintRptIDOffset = 0;
        posMaintRptIDLength = value.length();
        return this;
    }

    public PositionMaintenanceReportEncoder posMaintRptID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            posMaintRptID.wrap(buffer);
            posMaintRptIDOffset = value.offset();
            posMaintRptIDLength = value.length();
        }
        return this;
    }

    public PositionMaintenanceReportEncoder posMaintRptID(final char[] value)
    {
        return posMaintRptID(value, 0, value.length);
    }

    public PositionMaintenanceReportEncoder posMaintRptID(final char[] value, final int length)
    {
        return posMaintRptID(value, 0, length);
    }

    public PositionMaintenanceReportEncoder posMaintRptID(final char[] value, final int offset, final int length)
    {
        toBytes(value, posMaintRptID, offset, length);
        posMaintRptIDOffset = 0;
        posMaintRptIDLength = length;
        return this;
    }

    private int posTransType;

    private boolean hasPosTransType;

    public boolean hasPosTransType()
    {
        return hasPosTransType;
    }

    public PositionMaintenanceReportEncoder posTransType(int value)
    {
        posTransType = value;
        hasPosTransType = true;
        return this;
    }

    public int posTransType()
    {
        return posTransType;
    }

    public PositionMaintenanceReportEncoder posTransType(PosTransType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == PosTransType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: posTransType Value: " + value );
            }
            if (value == PosTransType.NULL_VAL)
            {
                return this;
            }
        }
        return posTransType(value.representation());
    }

    private final MutableDirectBuffer posReqID = new UnsafeBuffer();

    private int posReqIDOffset = 0;

    private int posReqIDLength = 0;

    public PositionMaintenanceReportEncoder posReqID(final DirectBuffer value, final int offset, final int length)
    {
        posReqID.wrap(value);
        posReqIDOffset = offset;
        posReqIDLength = length;
        return this;
    }

    public PositionMaintenanceReportEncoder posReqID(final DirectBuffer value, final int length)
    {
        return posReqID(value, 0, length);
    }

    public PositionMaintenanceReportEncoder posReqID(final DirectBuffer value)
    {
        return posReqID(value, 0, value.capacity());
    }

    public PositionMaintenanceReportEncoder posReqID(final byte[] value, final int offset, final int length)
    {
        posReqID.wrap(value);
        posReqIDOffset = offset;
        posReqIDLength = length;
        return this;
    }

    public PositionMaintenanceReportEncoder posReqIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(posReqID, value, offset, length);
        posReqIDOffset = offset;
        posReqIDLength = length;
        return this;
    }

    public PositionMaintenanceReportEncoder posReqID(final byte[] value, final int length)
    {
        return posReqID(value, 0, length);
    }

    public PositionMaintenanceReportEncoder posReqID(final byte[] value)
    {
        return posReqID(value, 0, value.length);
    }

    public boolean hasPosReqID()
    {
        return posReqIDLength > 0;
    }

    public MutableDirectBuffer posReqID()
    {
        return posReqID;
    }

    public String posReqIDAsString()
    {
        return posReqID.getStringWithoutLengthAscii(posReqIDOffset, posReqIDLength);
    }

    public PositionMaintenanceReportEncoder posReqID(final CharSequence value)
    {
        toBytes(value, posReqID);
        posReqIDOffset = 0;
        posReqIDLength = value.length();
        return this;
    }

    public PositionMaintenanceReportEncoder posReqID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            posReqID.wrap(buffer);
            posReqIDOffset = value.offset();
            posReqIDLength = value.length();
        }
        return this;
    }

    public PositionMaintenanceReportEncoder posReqID(final char[] value)
    {
        return posReqID(value, 0, value.length);
    }

    public PositionMaintenanceReportEncoder posReqID(final char[] value, final int length)
    {
        return posReqID(value, 0, length);
    }

    public PositionMaintenanceReportEncoder posReqID(final char[] value, final int offset, final int length)
    {
        toBytes(value, posReqID, offset, length);
        posReqIDOffset = 0;
        posReqIDLength = length;
        return this;
    }

    private int posMaintAction;

    private boolean hasPosMaintAction;

    public boolean hasPosMaintAction()
    {
        return hasPosMaintAction;
    }

    public PositionMaintenanceReportEncoder posMaintAction(int value)
    {
        posMaintAction = value;
        hasPosMaintAction = true;
        return this;
    }

    public int posMaintAction()
    {
        return posMaintAction;
    }

    public PositionMaintenanceReportEncoder posMaintAction(PosMaintAction value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == PosMaintAction.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: posMaintAction Value: " + value );
            }
            if (value == PosMaintAction.NULL_VAL)
            {
                return this;
            }
        }
        return posMaintAction(value.representation());
    }

    private final MutableDirectBuffer origPosReqRefID = new UnsafeBuffer();

    private int origPosReqRefIDOffset = 0;

    private int origPosReqRefIDLength = 0;

    public PositionMaintenanceReportEncoder origPosReqRefID(final DirectBuffer value, final int offset, final int length)
    {
        origPosReqRefID.wrap(value);
        origPosReqRefIDOffset = offset;
        origPosReqRefIDLength = length;
        return this;
    }

    public PositionMaintenanceReportEncoder origPosReqRefID(final DirectBuffer value, final int length)
    {
        return origPosReqRefID(value, 0, length);
    }

    public PositionMaintenanceReportEncoder origPosReqRefID(final DirectBuffer value)
    {
        return origPosReqRefID(value, 0, value.capacity());
    }

    public PositionMaintenanceReportEncoder origPosReqRefID(final byte[] value, final int offset, final int length)
    {
        origPosReqRefID.wrap(value);
        origPosReqRefIDOffset = offset;
        origPosReqRefIDLength = length;
        return this;
    }

    public PositionMaintenanceReportEncoder origPosReqRefIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(origPosReqRefID, value, offset, length);
        origPosReqRefIDOffset = offset;
        origPosReqRefIDLength = length;
        return this;
    }

    public PositionMaintenanceReportEncoder origPosReqRefID(final byte[] value, final int length)
    {
        return origPosReqRefID(value, 0, length);
    }

    public PositionMaintenanceReportEncoder origPosReqRefID(final byte[] value)
    {
        return origPosReqRefID(value, 0, value.length);
    }

    public boolean hasOrigPosReqRefID()
    {
        return origPosReqRefIDLength > 0;
    }

    public MutableDirectBuffer origPosReqRefID()
    {
        return origPosReqRefID;
    }

    public String origPosReqRefIDAsString()
    {
        return origPosReqRefID.getStringWithoutLengthAscii(origPosReqRefIDOffset, origPosReqRefIDLength);
    }

    public PositionMaintenanceReportEncoder origPosReqRefID(final CharSequence value)
    {
        toBytes(value, origPosReqRefID);
        origPosReqRefIDOffset = 0;
        origPosReqRefIDLength = value.length();
        return this;
    }

    public PositionMaintenanceReportEncoder origPosReqRefID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            origPosReqRefID.wrap(buffer);
            origPosReqRefIDOffset = value.offset();
            origPosReqRefIDLength = value.length();
        }
        return this;
    }

    public PositionMaintenanceReportEncoder origPosReqRefID(final char[] value)
    {
        return origPosReqRefID(value, 0, value.length);
    }

    public PositionMaintenanceReportEncoder origPosReqRefID(final char[] value, final int length)
    {
        return origPosReqRefID(value, 0, length);
    }

    public PositionMaintenanceReportEncoder origPosReqRefID(final char[] value, final int offset, final int length)
    {
        toBytes(value, origPosReqRefID, offset, length);
        origPosReqRefIDOffset = 0;
        origPosReqRefIDLength = length;
        return this;
    }

    private int posMaintStatus;

    private boolean hasPosMaintStatus;

    public boolean hasPosMaintStatus()
    {
        return hasPosMaintStatus;
    }

    public PositionMaintenanceReportEncoder posMaintStatus(int value)
    {
        posMaintStatus = value;
        hasPosMaintStatus = true;
        return this;
    }

    public int posMaintStatus()
    {
        return posMaintStatus;
    }

    public PositionMaintenanceReportEncoder posMaintStatus(PosMaintStatus value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == PosMaintStatus.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: posMaintStatus Value: " + value );
            }
            if (value == PosMaintStatus.NULL_VAL)
            {
                return this;
            }
        }
        return posMaintStatus(value.representation());
    }

    private int posMaintResult;

    private boolean hasPosMaintResult;

    public boolean hasPosMaintResult()
    {
        return hasPosMaintResult;
    }

    public PositionMaintenanceReportEncoder posMaintResult(int value)
    {
        posMaintResult = value;
        hasPosMaintResult = true;
        return this;
    }

    public int posMaintResult()
    {
        return posMaintResult;
    }

    public PositionMaintenanceReportEncoder posMaintResult(PosMaintResult value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == PosMaintResult.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: posMaintResult Value: " + value );
            }
            if (value == PosMaintResult.NULL_VAL)
            {
                return this;
            }
        }
        return posMaintResult(value.representation());
    }

    private final MutableDirectBuffer clearingBusinessDate = new UnsafeBuffer();

    private int clearingBusinessDateOffset = 0;

    private int clearingBusinessDateLength = 0;

    public PositionMaintenanceReportEncoder clearingBusinessDate(final DirectBuffer value, final int offset, final int length)
    {
        clearingBusinessDate.wrap(value);
        clearingBusinessDateOffset = offset;
        clearingBusinessDateLength = length;
        return this;
    }

    public PositionMaintenanceReportEncoder clearingBusinessDate(final DirectBuffer value, final int length)
    {
        return clearingBusinessDate(value, 0, length);
    }

    public PositionMaintenanceReportEncoder clearingBusinessDate(final DirectBuffer value)
    {
        return clearingBusinessDate(value, 0, value.capacity());
    }

    public PositionMaintenanceReportEncoder clearingBusinessDate(final byte[] value, final int offset, final int length)
    {
        clearingBusinessDate.wrap(value);
        clearingBusinessDateOffset = offset;
        clearingBusinessDateLength = length;
        return this;
    }

    public PositionMaintenanceReportEncoder clearingBusinessDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(clearingBusinessDate, value, offset, length);
        clearingBusinessDateOffset = offset;
        clearingBusinessDateLength = length;
        return this;
    }

    public PositionMaintenanceReportEncoder clearingBusinessDate(final byte[] value, final int length)
    {
        return clearingBusinessDate(value, 0, length);
    }

    public PositionMaintenanceReportEncoder clearingBusinessDate(final byte[] value)
    {
        return clearingBusinessDate(value, 0, value.length);
    }

    public boolean hasClearingBusinessDate()
    {
        return clearingBusinessDateLength > 0;
    }

    public MutableDirectBuffer clearingBusinessDate()
    {
        return clearingBusinessDate;
    }

    public String clearingBusinessDateAsString()
    {
        return clearingBusinessDate.getStringWithoutLengthAscii(clearingBusinessDateOffset, clearingBusinessDateLength);
    }

    private final MutableDirectBuffer settlSessID = new UnsafeBuffer();

    private int settlSessIDOffset = 0;

    private int settlSessIDLength = 0;

    public PositionMaintenanceReportEncoder settlSessID(final DirectBuffer value, final int offset, final int length)
    {
        settlSessID.wrap(value);
        settlSessIDOffset = offset;
        settlSessIDLength = length;
        return this;
    }

    public PositionMaintenanceReportEncoder settlSessID(final DirectBuffer value, final int length)
    {
        return settlSessID(value, 0, length);
    }

    public PositionMaintenanceReportEncoder settlSessID(final DirectBuffer value)
    {
        return settlSessID(value, 0, value.capacity());
    }

    public PositionMaintenanceReportEncoder settlSessID(final byte[] value, final int offset, final int length)
    {
        settlSessID.wrap(value);
        settlSessIDOffset = offset;
        settlSessIDLength = length;
        return this;
    }

    public PositionMaintenanceReportEncoder settlSessIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlSessID, value, offset, length);
        settlSessIDOffset = offset;
        settlSessIDLength = length;
        return this;
    }

    public PositionMaintenanceReportEncoder settlSessID(final byte[] value, final int length)
    {
        return settlSessID(value, 0, length);
    }

    public PositionMaintenanceReportEncoder settlSessID(final byte[] value)
    {
        return settlSessID(value, 0, value.length);
    }

    public boolean hasSettlSessID()
    {
        return settlSessIDLength > 0;
    }

    public MutableDirectBuffer settlSessID()
    {
        return settlSessID;
    }

    public String settlSessIDAsString()
    {
        return settlSessID.getStringWithoutLengthAscii(settlSessIDOffset, settlSessIDLength);
    }

    public PositionMaintenanceReportEncoder settlSessID(final CharSequence value)
    {
        toBytes(value, settlSessID);
        settlSessIDOffset = 0;
        settlSessIDLength = value.length();
        return this;
    }

    public PositionMaintenanceReportEncoder settlSessID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            settlSessID.wrap(buffer);
            settlSessIDOffset = value.offset();
            settlSessIDLength = value.length();
        }
        return this;
    }

    public PositionMaintenanceReportEncoder settlSessID(final char[] value)
    {
        return settlSessID(value, 0, value.length);
    }

    public PositionMaintenanceReportEncoder settlSessID(final char[] value, final int length)
    {
        return settlSessID(value, 0, length);
    }

    public PositionMaintenanceReportEncoder settlSessID(final char[] value, final int offset, final int length)
    {
        toBytes(value, settlSessID, offset, length);
        settlSessIDOffset = 0;
        settlSessIDLength = length;
        return this;
    }

    public PositionMaintenanceReportEncoder settlSessID(SettlSessID value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == SettlSessID.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: settlSessID Value: " + value );
            }
            if (value == SettlSessID.NULL_VAL)
            {
                return this;
            }
        }
        return settlSessID(value.representation());
    }

    private final MutableDirectBuffer settlSessSubID = new UnsafeBuffer();

    private int settlSessSubIDOffset = 0;

    private int settlSessSubIDLength = 0;

    public PositionMaintenanceReportEncoder settlSessSubID(final DirectBuffer value, final int offset, final int length)
    {
        settlSessSubID.wrap(value);
        settlSessSubIDOffset = offset;
        settlSessSubIDLength = length;
        return this;
    }

    public PositionMaintenanceReportEncoder settlSessSubID(final DirectBuffer value, final int length)
    {
        return settlSessSubID(value, 0, length);
    }

    public PositionMaintenanceReportEncoder settlSessSubID(final DirectBuffer value)
    {
        return settlSessSubID(value, 0, value.capacity());
    }

    public PositionMaintenanceReportEncoder settlSessSubID(final byte[] value, final int offset, final int length)
    {
        settlSessSubID.wrap(value);
        settlSessSubIDOffset = offset;
        settlSessSubIDLength = length;
        return this;
    }

    public PositionMaintenanceReportEncoder settlSessSubIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlSessSubID, value, offset, length);
        settlSessSubIDOffset = offset;
        settlSessSubIDLength = length;
        return this;
    }

    public PositionMaintenanceReportEncoder settlSessSubID(final byte[] value, final int length)
    {
        return settlSessSubID(value, 0, length);
    }

    public PositionMaintenanceReportEncoder settlSessSubID(final byte[] value)
    {
        return settlSessSubID(value, 0, value.length);
    }

    public boolean hasSettlSessSubID()
    {
        return settlSessSubIDLength > 0;
    }

    public MutableDirectBuffer settlSessSubID()
    {
        return settlSessSubID;
    }

    public String settlSessSubIDAsString()
    {
        return settlSessSubID.getStringWithoutLengthAscii(settlSessSubIDOffset, settlSessSubIDLength);
    }

    public PositionMaintenanceReportEncoder settlSessSubID(final CharSequence value)
    {
        toBytes(value, settlSessSubID);
        settlSessSubIDOffset = 0;
        settlSessSubIDLength = value.length();
        return this;
    }

    public PositionMaintenanceReportEncoder settlSessSubID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            settlSessSubID.wrap(buffer);
            settlSessSubIDOffset = value.offset();
            settlSessSubIDLength = value.length();
        }
        return this;
    }

    public PositionMaintenanceReportEncoder settlSessSubID(final char[] value)
    {
        return settlSessSubID(value, 0, value.length);
    }

    public PositionMaintenanceReportEncoder settlSessSubID(final char[] value, final int length)
    {
        return settlSessSubID(value, 0, length);
    }

    public PositionMaintenanceReportEncoder settlSessSubID(final char[] value, final int offset, final int length)
    {
        toBytes(value, settlSessSubID, offset, length);
        settlSessSubIDOffset = 0;
        settlSessSubIDLength = length;
        return this;
    }

    private final PartiesEncoder parties = new PartiesEncoder();
    public PartiesEncoder parties()
    {
        return parties;
    }

    private final MutableDirectBuffer account = new UnsafeBuffer();

    private int accountOffset = 0;

    private int accountLength = 0;

    public PositionMaintenanceReportEncoder account(final DirectBuffer value, final int offset, final int length)
    {
        account.wrap(value);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    public PositionMaintenanceReportEncoder account(final DirectBuffer value, final int length)
    {
        return account(value, 0, length);
    }

    public PositionMaintenanceReportEncoder account(final DirectBuffer value)
    {
        return account(value, 0, value.capacity());
    }

    public PositionMaintenanceReportEncoder account(final byte[] value, final int offset, final int length)
    {
        account.wrap(value);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    public PositionMaintenanceReportEncoder accountAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(account, value, offset, length);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    public PositionMaintenanceReportEncoder account(final byte[] value, final int length)
    {
        return account(value, 0, length);
    }

    public PositionMaintenanceReportEncoder account(final byte[] value)
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

    public PositionMaintenanceReportEncoder account(final CharSequence value)
    {
        toBytes(value, account);
        accountOffset = 0;
        accountLength = value.length();
        return this;
    }

    public PositionMaintenanceReportEncoder account(final AsciiSequenceView value)
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

    public PositionMaintenanceReportEncoder account(final char[] value)
    {
        return account(value, 0, value.length);
    }

    public PositionMaintenanceReportEncoder account(final char[] value, final int length)
    {
        return account(value, 0, length);
    }

    public PositionMaintenanceReportEncoder account(final char[] value, final int offset, final int length)
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

    public PositionMaintenanceReportEncoder acctIDSource(int value)
    {
        acctIDSource = value;
        hasAcctIDSource = true;
        return this;
    }

    public int acctIDSource()
    {
        return acctIDSource;
    }

    public PositionMaintenanceReportEncoder acctIDSource(AcctIDSource value)
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

    public PositionMaintenanceReportEncoder accountType(int value)
    {
        accountType = value;
        hasAccountType = true;
        return this;
    }

    public int accountType()
    {
        return accountType;
    }

    public PositionMaintenanceReportEncoder accountType(AccountType value)
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

    private final MutableDirectBuffer posMaintRptRefID = new UnsafeBuffer();

    private int posMaintRptRefIDOffset = 0;

    private int posMaintRptRefIDLength = 0;

    public PositionMaintenanceReportEncoder posMaintRptRefID(final DirectBuffer value, final int offset, final int length)
    {
        posMaintRptRefID.wrap(value);
        posMaintRptRefIDOffset = offset;
        posMaintRptRefIDLength = length;
        return this;
    }

    public PositionMaintenanceReportEncoder posMaintRptRefID(final DirectBuffer value, final int length)
    {
        return posMaintRptRefID(value, 0, length);
    }

    public PositionMaintenanceReportEncoder posMaintRptRefID(final DirectBuffer value)
    {
        return posMaintRptRefID(value, 0, value.capacity());
    }

    public PositionMaintenanceReportEncoder posMaintRptRefID(final byte[] value, final int offset, final int length)
    {
        posMaintRptRefID.wrap(value);
        posMaintRptRefIDOffset = offset;
        posMaintRptRefIDLength = length;
        return this;
    }

    public PositionMaintenanceReportEncoder posMaintRptRefIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(posMaintRptRefID, value, offset, length);
        posMaintRptRefIDOffset = offset;
        posMaintRptRefIDLength = length;
        return this;
    }

    public PositionMaintenanceReportEncoder posMaintRptRefID(final byte[] value, final int length)
    {
        return posMaintRptRefID(value, 0, length);
    }

    public PositionMaintenanceReportEncoder posMaintRptRefID(final byte[] value)
    {
        return posMaintRptRefID(value, 0, value.length);
    }

    public boolean hasPosMaintRptRefID()
    {
        return posMaintRptRefIDLength > 0;
    }

    public MutableDirectBuffer posMaintRptRefID()
    {
        return posMaintRptRefID;
    }

    public String posMaintRptRefIDAsString()
    {
        return posMaintRptRefID.getStringWithoutLengthAscii(posMaintRptRefIDOffset, posMaintRptRefIDLength);
    }

    public PositionMaintenanceReportEncoder posMaintRptRefID(final CharSequence value)
    {
        toBytes(value, posMaintRptRefID);
        posMaintRptRefIDOffset = 0;
        posMaintRptRefIDLength = value.length();
        return this;
    }

    public PositionMaintenanceReportEncoder posMaintRptRefID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            posMaintRptRefID.wrap(buffer);
            posMaintRptRefIDOffset = value.offset();
            posMaintRptRefIDLength = value.length();
        }
        return this;
    }

    public PositionMaintenanceReportEncoder posMaintRptRefID(final char[] value)
    {
        return posMaintRptRefID(value, 0, value.length);
    }

    public PositionMaintenanceReportEncoder posMaintRptRefID(final char[] value, final int length)
    {
        return posMaintRptRefID(value, 0, length);
    }

    public PositionMaintenanceReportEncoder posMaintRptRefID(final char[] value, final int offset, final int length)
    {
        toBytes(value, posMaintRptRefID, offset, length);
        posMaintRptRefIDOffset = 0;
        posMaintRptRefIDLength = length;
        return this;
    }

    private final InstrumentEncoder instrument = new InstrumentEncoder();
    public InstrumentEncoder instrument()
    {
        return instrument;
    }

    private final MutableDirectBuffer currency = new UnsafeBuffer();

    private int currencyOffset = 0;

    private int currencyLength = 0;

    public PositionMaintenanceReportEncoder currency(final DirectBuffer value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public PositionMaintenanceReportEncoder currency(final DirectBuffer value, final int length)
    {
        return currency(value, 0, length);
    }

    public PositionMaintenanceReportEncoder currency(final DirectBuffer value)
    {
        return currency(value, 0, value.capacity());
    }

    public PositionMaintenanceReportEncoder currency(final byte[] value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public PositionMaintenanceReportEncoder currencyAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(currency, value, offset, length);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public PositionMaintenanceReportEncoder currency(final byte[] value, final int length)
    {
        return currency(value, 0, length);
    }

    public PositionMaintenanceReportEncoder currency(final byte[] value)
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

    public PositionMaintenanceReportEncoder currency(final CharSequence value)
    {
        toBytes(value, currency);
        currencyOffset = 0;
        currencyLength = value.length();
        return this;
    }

    public PositionMaintenanceReportEncoder currency(final AsciiSequenceView value)
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

    public PositionMaintenanceReportEncoder currency(final char[] value)
    {
        return currency(value, 0, value.length);
    }

    public PositionMaintenanceReportEncoder currency(final char[] value, final int length)
    {
        return currency(value, 0, length);
    }

    public PositionMaintenanceReportEncoder currency(final char[] value, final int offset, final int length)
    {
        toBytes(value, currency, offset, length);
        currencyOffset = 0;
        currencyLength = length;
        return this;
    }

    private final MutableDirectBuffer settlCurrency = new UnsafeBuffer();

    private int settlCurrencyOffset = 0;

    private int settlCurrencyLength = 0;

    public PositionMaintenanceReportEncoder settlCurrency(final DirectBuffer value, final int offset, final int length)
    {
        settlCurrency.wrap(value);
        settlCurrencyOffset = offset;
        settlCurrencyLength = length;
        return this;
    }

    public PositionMaintenanceReportEncoder settlCurrency(final DirectBuffer value, final int length)
    {
        return settlCurrency(value, 0, length);
    }

    public PositionMaintenanceReportEncoder settlCurrency(final DirectBuffer value)
    {
        return settlCurrency(value, 0, value.capacity());
    }

    public PositionMaintenanceReportEncoder settlCurrency(final byte[] value, final int offset, final int length)
    {
        settlCurrency.wrap(value);
        settlCurrencyOffset = offset;
        settlCurrencyLength = length;
        return this;
    }

    public PositionMaintenanceReportEncoder settlCurrencyAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlCurrency, value, offset, length);
        settlCurrencyOffset = offset;
        settlCurrencyLength = length;
        return this;
    }

    public PositionMaintenanceReportEncoder settlCurrency(final byte[] value, final int length)
    {
        return settlCurrency(value, 0, length);
    }

    public PositionMaintenanceReportEncoder settlCurrency(final byte[] value)
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

    public PositionMaintenanceReportEncoder settlCurrency(final CharSequence value)
    {
        toBytes(value, settlCurrency);
        settlCurrencyOffset = 0;
        settlCurrencyLength = value.length();
        return this;
    }

    public PositionMaintenanceReportEncoder settlCurrency(final AsciiSequenceView value)
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

    public PositionMaintenanceReportEncoder settlCurrency(final char[] value)
    {
        return settlCurrency(value, 0, value.length);
    }

    public PositionMaintenanceReportEncoder settlCurrency(final char[] value, final int length)
    {
        return settlCurrency(value, 0, length);
    }

    public PositionMaintenanceReportEncoder settlCurrency(final char[] value, final int offset, final int length)
    {
        toBytes(value, settlCurrency, offset, length);
        settlCurrencyOffset = 0;
        settlCurrencyLength = length;
        return this;
    }

    private boolean contraryInstructionIndicator;

    private boolean hasContraryInstructionIndicator;

    public boolean hasContraryInstructionIndicator()
    {
        return hasContraryInstructionIndicator;
    }

    public PositionMaintenanceReportEncoder contraryInstructionIndicator(boolean value)
    {
        contraryInstructionIndicator = value;
        hasContraryInstructionIndicator = true;
        return this;
    }

    public boolean contraryInstructionIndicator()
    {
        return contraryInstructionIndicator;
    }

    private boolean priorSpreadIndicator;

    private boolean hasPriorSpreadIndicator;

    public boolean hasPriorSpreadIndicator()
    {
        return hasPriorSpreadIndicator;
    }

    public PositionMaintenanceReportEncoder priorSpreadIndicator(boolean value)
    {
        priorSpreadIndicator = value;
        hasPriorSpreadIndicator = true;
        return this;
    }

    public boolean priorSpreadIndicator()
    {
        return priorSpreadIndicator;
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

    private final TrdgSesGrpEncoder trdgSesGrp = new TrdgSesGrpEncoder();
    public TrdgSesGrpEncoder trdgSesGrp()
    {
        return trdgSesGrp;
    }

    private final MutableDirectBuffer transactTime = new UnsafeBuffer();

    private int transactTimeOffset = 0;

    private int transactTimeLength = 0;

    public PositionMaintenanceReportEncoder transactTime(final DirectBuffer value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public PositionMaintenanceReportEncoder transactTime(final DirectBuffer value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public PositionMaintenanceReportEncoder transactTime(final DirectBuffer value)
    {
        return transactTime(value, 0, value.capacity());
    }

    public PositionMaintenanceReportEncoder transactTime(final byte[] value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public PositionMaintenanceReportEncoder transactTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(transactTime, value, offset, length);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public PositionMaintenanceReportEncoder transactTime(final byte[] value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public PositionMaintenanceReportEncoder transactTime(final byte[] value)
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

    private final PositionQtyEncoder positionQty = new PositionQtyEncoder();
    public PositionQtyEncoder positionQty()
    {
        return positionQty;
    }

    private final PositionAmountDataEncoder positionAmountData = new PositionAmountDataEncoder();
    public PositionAmountDataEncoder positionAmountData()
    {
        return positionAmountData;
    }

    private int adjustmentType;

    private boolean hasAdjustmentType;

    public boolean hasAdjustmentType()
    {
        return hasAdjustmentType;
    }

    public PositionMaintenanceReportEncoder adjustmentType(int value)
    {
        adjustmentType = value;
        hasAdjustmentType = true;
        return this;
    }

    public int adjustmentType()
    {
        return adjustmentType;
    }

    public PositionMaintenanceReportEncoder adjustmentType(AdjustmentType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == AdjustmentType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: adjustmentType Value: " + value );
            }
            if (value == AdjustmentType.NULL_VAL)
            {
                return this;
            }
        }
        return adjustmentType(value.representation());
    }

    private final DecimalFloat thresholdAmount = new DecimalFloat();

    private boolean hasThresholdAmount;

    public boolean hasThresholdAmount()
    {
        return hasThresholdAmount;
    }

    public PositionMaintenanceReportEncoder thresholdAmount(DecimalFloat value)
    {
        thresholdAmount.set(value);
        hasThresholdAmount = true;
        return this;
    }

    public PositionMaintenanceReportEncoder thresholdAmount(long value, int scale)
    {
        thresholdAmount.set(value, scale);
        hasThresholdAmount = true;
        return this;
    }

    public DecimalFloat thresholdAmount()
    {
        return thresholdAmount;
    }

    private final MutableDirectBuffer text = new UnsafeBuffer();

    private int textOffset = 0;

    private int textLength = 0;

    public PositionMaintenanceReportEncoder text(final DirectBuffer value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public PositionMaintenanceReportEncoder text(final DirectBuffer value, final int length)
    {
        return text(value, 0, length);
    }

    public PositionMaintenanceReportEncoder text(final DirectBuffer value)
    {
        return text(value, 0, value.capacity());
    }

    public PositionMaintenanceReportEncoder text(final byte[] value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public PositionMaintenanceReportEncoder textAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(text, value, offset, length);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public PositionMaintenanceReportEncoder text(final byte[] value, final int length)
    {
        return text(value, 0, length);
    }

    public PositionMaintenanceReportEncoder text(final byte[] value)
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

    public PositionMaintenanceReportEncoder text(final CharSequence value)
    {
        toBytes(value, text);
        textOffset = 0;
        textLength = value.length();
        return this;
    }

    public PositionMaintenanceReportEncoder text(final AsciiSequenceView value)
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

    public PositionMaintenanceReportEncoder text(final char[] value)
    {
        return text(value, 0, value.length);
    }

    public PositionMaintenanceReportEncoder text(final char[] value, final int length)
    {
        return text(value, 0, length);
    }

    public PositionMaintenanceReportEncoder text(final char[] value, final int offset, final int length)
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

    public PositionMaintenanceReportEncoder encodedTextLen(int value)
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

    public PositionMaintenanceReportEncoder encodedText(byte[] value)
    {
        encodedText = value;
        hasEncodedText = true;
        return this;
    }

    public byte[] encodedText()
    {
        return encodedText;
    }

    public PositionMaintenanceReportEncoder encodedTextAsCopy(final byte[] value, final int offset, final int length)
    {
        encodedText = copyInto(encodedText, value, offset, length);
        hasEncodedText = true;
        return this;
    }

    public long encode(final MutableAsciiBuffer buffer, final int offset)
    {
        final long startMessageResult = header.startMessage(buffer, offset);
        final int bodyStart = Encoder.offset(startMessageResult);
        int position = bodyStart + Encoder.length(startMessageResult);

        if (posMaintRptIDLength > 0)
        {
            buffer.putBytes(position, posMaintRptIDHeader, 0, posMaintRptIDHeaderLength);
            position += posMaintRptIDHeaderLength;
            buffer.putBytes(position, posMaintRptID, posMaintRptIDOffset, posMaintRptIDLength);
            position += posMaintRptIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: PosMaintRptID");
        }

        if (hasPosTransType)
        {
            buffer.putBytes(position, posTransTypeHeader, 0, posTransTypeHeaderLength);
            position += posTransTypeHeaderLength;
            position += buffer.putIntAscii(position, posTransType);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: PosTransType");
        }

        if (posReqIDLength > 0)
        {
            buffer.putBytes(position, posReqIDHeader, 0, posReqIDHeaderLength);
            position += posReqIDHeaderLength;
            buffer.putBytes(position, posReqID, posReqIDOffset, posReqIDLength);
            position += posReqIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasPosMaintAction)
        {
            buffer.putBytes(position, posMaintActionHeader, 0, posMaintActionHeaderLength);
            position += posMaintActionHeaderLength;
            position += buffer.putIntAscii(position, posMaintAction);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: PosMaintAction");
        }

        if (origPosReqRefIDLength > 0)
        {
            buffer.putBytes(position, origPosReqRefIDHeader, 0, origPosReqRefIDHeaderLength);
            position += origPosReqRefIDHeaderLength;
            buffer.putBytes(position, origPosReqRefID, origPosReqRefIDOffset, origPosReqRefIDLength);
            position += origPosReqRefIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasPosMaintStatus)
        {
            buffer.putBytes(position, posMaintStatusHeader, 0, posMaintStatusHeaderLength);
            position += posMaintStatusHeaderLength;
            position += buffer.putIntAscii(position, posMaintStatus);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: PosMaintStatus");
        }

        if (hasPosMaintResult)
        {
            buffer.putBytes(position, posMaintResultHeader, 0, posMaintResultHeaderLength);
            position += posMaintResultHeaderLength;
            position += buffer.putIntAscii(position, posMaintResult);
            buffer.putSeparator(position);
            position++;
        }

        if (clearingBusinessDateLength > 0)
        {
            buffer.putBytes(position, clearingBusinessDateHeader, 0, clearingBusinessDateHeaderLength);
            position += clearingBusinessDateHeaderLength;
            buffer.putBytes(position, clearingBusinessDate, clearingBusinessDateOffset, clearingBusinessDateLength);
            position += clearingBusinessDateLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: ClearingBusinessDate");
        }

        if (settlSessIDLength > 0)
        {
            buffer.putBytes(position, settlSessIDHeader, 0, settlSessIDHeaderLength);
            position += settlSessIDHeaderLength;
            buffer.putBytes(position, settlSessID, settlSessIDOffset, settlSessIDLength);
            position += settlSessIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (settlSessSubIDLength > 0)
        {
            buffer.putBytes(position, settlSessSubIDHeader, 0, settlSessSubIDHeaderLength);
            position += settlSessSubIDHeaderLength;
            buffer.putBytes(position, settlSessSubID, settlSessSubIDOffset, settlSessSubIDLength);
            position += settlSessSubIDLength;
            buffer.putSeparator(position);
            position++;
        }

            position += parties.encode(buffer, position);

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

        if (posMaintRptRefIDLength > 0)
        {
            buffer.putBytes(position, posMaintRptRefIDHeader, 0, posMaintRptRefIDHeaderLength);
            position += posMaintRptRefIDHeaderLength;
            buffer.putBytes(position, posMaintRptRefID, posMaintRptRefIDOffset, posMaintRptRefIDLength);
            position += posMaintRptRefIDLength;
            buffer.putSeparator(position);
            position++;
        }

            position += instrument.encode(buffer, position);

        if (currencyLength > 0)
        {
            buffer.putBytes(position, currencyHeader, 0, currencyHeaderLength);
            position += currencyHeaderLength;
            buffer.putBytes(position, currency, currencyOffset, currencyLength);
            position += currencyLength;
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

        if (hasContraryInstructionIndicator)
        {
            buffer.putBytes(position, contraryInstructionIndicatorHeader, 0, contraryInstructionIndicatorHeaderLength);
            position += contraryInstructionIndicatorHeaderLength;
            position += buffer.putBooleanAscii(position, contraryInstructionIndicator);
            buffer.putSeparator(position);
            position++;
        }

        if (hasPriorSpreadIndicator)
        {
            buffer.putBytes(position, priorSpreadIndicatorHeader, 0, priorSpreadIndicatorHeaderLength);
            position += priorSpreadIndicatorHeaderLength;
            position += buffer.putBooleanAscii(position, priorSpreadIndicator);
            buffer.putSeparator(position);
            position++;
        }

            position += instrmtLegGrp.encode(buffer, position);

            position += undInstrmtGrp.encode(buffer, position);

            position += trdgSesGrp.encode(buffer, position);

        if (transactTimeLength > 0)
        {
            buffer.putBytes(position, transactTimeHeader, 0, transactTimeHeaderLength);
            position += transactTimeHeaderLength;
            buffer.putBytes(position, transactTime, transactTimeOffset, transactTimeLength);
            position += transactTimeLength;
            buffer.putSeparator(position);
            position++;
        }

            position += positionQty.encode(buffer, position);

            position += positionAmountData.encode(buffer, position);

        if (hasAdjustmentType)
        {
            buffer.putBytes(position, adjustmentTypeHeader, 0, adjustmentTypeHeaderLength);
            position += adjustmentTypeHeaderLength;
            position += buffer.putIntAscii(position, adjustmentType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasThresholdAmount)
        {
            buffer.putBytes(position, thresholdAmountHeader, 0, thresholdAmountHeaderLength);
            position += thresholdAmountHeaderLength;
            position += buffer.putFloatAscii(position, thresholdAmount);
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
        this.resetPosMaintRptID();
        this.resetPosTransType();
        this.resetPosReqID();
        this.resetPosMaintAction();
        this.resetOrigPosReqRefID();
        this.resetPosMaintStatus();
        this.resetPosMaintResult();
        this.resetClearingBusinessDate();
        this.resetSettlSessID();
        this.resetSettlSessSubID();
        this.resetAccount();
        this.resetAcctIDSource();
        this.resetAccountType();
        this.resetPosMaintRptRefID();
        this.resetCurrency();
        this.resetSettlCurrency();
        this.resetContraryInstructionIndicator();
        this.resetPriorSpreadIndicator();
        this.resetTransactTime();
        this.resetAdjustmentType();
        this.resetThresholdAmount();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        parties.reset();
        instrument.reset();
        instrmtLegGrp.reset();
        undInstrmtGrp.reset();
        trdgSesGrp.reset();
        positionQty.reset();
        positionAmountData.reset();
    }

    public void resetPosMaintRptID()
    {
        posMaintRptIDLength = 0;
    }

    public void resetPosTransType()
    {
        hasPosTransType = false;
    }

    public void resetPosReqID()
    {
        posReqIDLength = 0;
    }

    public void resetPosMaintAction()
    {
        hasPosMaintAction = false;
    }

    public void resetOrigPosReqRefID()
    {
        origPosReqRefIDLength = 0;
    }

    public void resetPosMaintStatus()
    {
        hasPosMaintStatus = false;
    }

    public void resetPosMaintResult()
    {
        hasPosMaintResult = false;
    }

    public void resetClearingBusinessDate()
    {
        clearingBusinessDateLength = 0;
    }

    public void resetSettlSessID()
    {
        settlSessIDLength = 0;
    }

    public void resetSettlSessSubID()
    {
        settlSessSubIDLength = 0;
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

    public void resetPosMaintRptRefID()
    {
        posMaintRptRefIDLength = 0;
    }

    public void resetCurrency()
    {
        currencyLength = 0;
    }

    public void resetSettlCurrency()
    {
        settlCurrencyLength = 0;
    }

    public void resetContraryInstructionIndicator()
    {
        hasContraryInstructionIndicator = false;
    }

    public void resetPriorSpreadIndicator()
    {
        hasPriorSpreadIndicator = false;
    }

    public void resetTransactTime()
    {
        transactTimeLength = 0;
    }

    public void resetAdjustmentType()
    {
        hasAdjustmentType = false;
    }

    public void resetThresholdAmount()
    {
        hasThresholdAmount = false;
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
        builder.append("\"MessageName\": \"PositionMaintenanceReport\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasPosMaintRptID())
        {
            indent(builder, level);
            builder.append("\"PosMaintRptID\": \"");
            appendBuffer(builder, posMaintRptID, posMaintRptIDOffset, posMaintRptIDLength);
            builder.append("\",\n");
        }

        if (hasPosTransType())
        {
            indent(builder, level);
            builder.append("\"PosTransType\": \"");
            builder.append(posTransType);
            builder.append("\",\n");
        }

        if (hasPosReqID())
        {
            indent(builder, level);
            builder.append("\"PosReqID\": \"");
            appendBuffer(builder, posReqID, posReqIDOffset, posReqIDLength);
            builder.append("\",\n");
        }

        if (hasPosMaintAction())
        {
            indent(builder, level);
            builder.append("\"PosMaintAction\": \"");
            builder.append(posMaintAction);
            builder.append("\",\n");
        }

        if (hasOrigPosReqRefID())
        {
            indent(builder, level);
            builder.append("\"OrigPosReqRefID\": \"");
            appendBuffer(builder, origPosReqRefID, origPosReqRefIDOffset, origPosReqRefIDLength);
            builder.append("\",\n");
        }

        if (hasPosMaintStatus())
        {
            indent(builder, level);
            builder.append("\"PosMaintStatus\": \"");
            builder.append(posMaintStatus);
            builder.append("\",\n");
        }

        if (hasPosMaintResult())
        {
            indent(builder, level);
            builder.append("\"PosMaintResult\": \"");
            builder.append(posMaintResult);
            builder.append("\",\n");
        }

        if (hasClearingBusinessDate())
        {
            indent(builder, level);
            builder.append("\"ClearingBusinessDate\": \"");
            appendBuffer(builder, clearingBusinessDate, clearingBusinessDateOffset, clearingBusinessDateLength);
            builder.append("\",\n");
        }

        if (hasSettlSessID())
        {
            indent(builder, level);
            builder.append("\"SettlSessID\": \"");
            appendBuffer(builder, settlSessID, settlSessIDOffset, settlSessIDLength);
            builder.append("\",\n");
        }

        if (hasSettlSessSubID())
        {
            indent(builder, level);
            builder.append("\"SettlSessSubID\": \"");
            appendBuffer(builder, settlSessSubID, settlSessSubIDOffset, settlSessSubIDLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"Parties\": ");
    parties.appendTo(builder, level + 1);
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

        if (hasPosMaintRptRefID())
        {
            indent(builder, level);
            builder.append("\"PosMaintRptRefID\": \"");
            appendBuffer(builder, posMaintRptRefID, posMaintRptRefIDOffset, posMaintRptRefIDLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"Instrument\": ");
    instrument.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasCurrency())
        {
            indent(builder, level);
            builder.append("\"Currency\": \"");
            appendBuffer(builder, currency, currencyOffset, currencyLength);
            builder.append("\",\n");
        }

        if (hasSettlCurrency())
        {
            indent(builder, level);
            builder.append("\"SettlCurrency\": \"");
            appendBuffer(builder, settlCurrency, settlCurrencyOffset, settlCurrencyLength);
            builder.append("\",\n");
        }

        if (hasContraryInstructionIndicator())
        {
            indent(builder, level);
            builder.append("\"ContraryInstructionIndicator\": \"");
            builder.append(contraryInstructionIndicator);
            builder.append("\",\n");
        }

        if (hasPriorSpreadIndicator())
        {
            indent(builder, level);
            builder.append("\"PriorSpreadIndicator\": \"");
            builder.append(priorSpreadIndicator);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"InstrmtLegGrp\": ");
    instrmtLegGrp.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"UndInstrmtGrp\": ");
    undInstrmtGrp.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"TrdgSesGrp\": ");
    trdgSesGrp.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasTransactTime())
        {
            indent(builder, level);
            builder.append("\"TransactTime\": \"");
            appendBuffer(builder, transactTime, transactTimeOffset, transactTimeLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"PositionQty\": ");
    positionQty.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"PositionAmountData\": ");
    positionAmountData.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasAdjustmentType())
        {
            indent(builder, level);
            builder.append("\"AdjustmentType\": \"");
            builder.append(adjustmentType);
            builder.append("\",\n");
        }

        if (hasThresholdAmount())
        {
            indent(builder, level);
            builder.append("\"ThresholdAmount\": \"");
            thresholdAmount.appendTo(builder);
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
    public PositionMaintenanceReportEncoder copyTo(final Encoder encoder)
    {
        return copyTo((PositionMaintenanceReportEncoder)encoder);
    }

    public PositionMaintenanceReportEncoder copyTo(final PositionMaintenanceReportEncoder encoder)
    {
        encoder.reset();
        if (hasPosMaintRptID())
        {
            encoder.posMaintRptIDAsCopy(posMaintRptID.byteArray(), 0, posMaintRptIDLength);
        }

        if (hasPosTransType())
        {
            encoder.posTransType(this.posTransType());
        }

        if (hasPosReqID())
        {
            encoder.posReqIDAsCopy(posReqID.byteArray(), 0, posReqIDLength);
        }

        if (hasPosMaintAction())
        {
            encoder.posMaintAction(this.posMaintAction());
        }

        if (hasOrigPosReqRefID())
        {
            encoder.origPosReqRefIDAsCopy(origPosReqRefID.byteArray(), 0, origPosReqRefIDLength);
        }

        if (hasPosMaintStatus())
        {
            encoder.posMaintStatus(this.posMaintStatus());
        }

        if (hasPosMaintResult())
        {
            encoder.posMaintResult(this.posMaintResult());
        }

        if (hasClearingBusinessDate())
        {
            encoder.clearingBusinessDateAsCopy(clearingBusinessDate.byteArray(), 0, clearingBusinessDateLength);
        }

        if (hasSettlSessID())
        {
            encoder.settlSessIDAsCopy(settlSessID.byteArray(), 0, settlSessIDLength);
        }

        if (hasSettlSessSubID())
        {
            encoder.settlSessSubIDAsCopy(settlSessSubID.byteArray(), 0, settlSessSubIDLength);
        }


        parties.copyTo(encoder.parties());
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

        if (hasPosMaintRptRefID())
        {
            encoder.posMaintRptRefIDAsCopy(posMaintRptRefID.byteArray(), 0, posMaintRptRefIDLength);
        }


        instrument.copyTo(encoder.instrument());
        if (hasCurrency())
        {
            encoder.currencyAsCopy(currency.byteArray(), 0, currencyLength);
        }

        if (hasSettlCurrency())
        {
            encoder.settlCurrencyAsCopy(settlCurrency.byteArray(), 0, settlCurrencyLength);
        }

        if (hasContraryInstructionIndicator())
        {
            encoder.contraryInstructionIndicator(this.contraryInstructionIndicator());
        }

        if (hasPriorSpreadIndicator())
        {
            encoder.priorSpreadIndicator(this.priorSpreadIndicator());
        }


        instrmtLegGrp.copyTo(encoder.instrmtLegGrp());

        undInstrmtGrp.copyTo(encoder.undInstrmtGrp());

        trdgSesGrp.copyTo(encoder.trdgSesGrp());
        if (hasTransactTime())
        {
            encoder.transactTimeAsCopy(transactTime.byteArray(), 0, transactTimeLength);
        }


        positionQty.copyTo(encoder.positionQty());

        positionAmountData.copyTo(encoder.positionAmountData());
        if (hasAdjustmentType())
        {
            encoder.adjustmentType(this.adjustmentType());
        }

        if (hasThresholdAmount())
        {
            encoder.thresholdAmount(this.thresholdAmount());
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
