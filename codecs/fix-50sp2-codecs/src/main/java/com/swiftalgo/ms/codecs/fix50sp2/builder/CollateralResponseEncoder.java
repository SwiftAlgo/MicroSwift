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


public class CollateralResponseEncoder implements Encoder
{
    public long messageType()
    {
        return 23105L;
    }

    public CollateralResponseEncoder()
    {
        header.msgType("AZ");
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

    private static final int collRespIDHeaderLength = 4;
    private static final byte[] collRespIDHeader = new byte[] {57, 48, 52, (byte) '='};

    private static final int collAsgnIDHeaderLength = 4;
    private static final byte[] collAsgnIDHeader = new byte[] {57, 48, 50, (byte) '='};

    private static final int collReqIDHeaderLength = 4;
    private static final byte[] collReqIDHeader = new byte[] {56, 57, 52, (byte) '='};

    private static final int collAsgnReasonHeaderLength = 4;
    private static final byte[] collAsgnReasonHeader = new byte[] {56, 57, 53, (byte) '='};

    private static final int collAsgnTransTypeHeaderLength = 4;
    private static final byte[] collAsgnTransTypeHeader = new byte[] {57, 48, 51, (byte) '='};

    private static final int collAsgnRespTypeHeaderLength = 4;
    private static final byte[] collAsgnRespTypeHeader = new byte[] {57, 48, 53, (byte) '='};

    private static final int collAsgnRejectReasonHeaderLength = 4;
    private static final byte[] collAsgnRejectReasonHeader = new byte[] {57, 48, 54, (byte) '='};

    private static final int transactTimeHeaderLength = 3;
    private static final byte[] transactTimeHeader = new byte[] {54, 48, (byte) '='};

    private static final int collApplTypeHeaderLength = 5;
    private static final byte[] collApplTypeHeader = new byte[] {49, 48, 52, 51, (byte) '='};

    private static final int financialStatusHeaderLength = 4;
    private static final byte[] financialStatusHeader = new byte[] {50, 57, 49, (byte) '='};

    private static final int clearingBusinessDateHeaderLength = 4;
    private static final byte[] clearingBusinessDateHeader = new byte[] {55, 49, 53, (byte) '='};

    private static final int accountHeaderLength = 2;
    private static final byte[] accountHeader = new byte[] {49, (byte) '='};

    private static final int accountTypeHeaderLength = 4;
    private static final byte[] accountTypeHeader = new byte[] {53, 56, 49, (byte) '='};

    private static final int clOrdIDHeaderLength = 3;
    private static final byte[] clOrdIDHeader = new byte[] {49, 49, (byte) '='};

    private static final int orderIDHeaderLength = 3;
    private static final byte[] orderIDHeader = new byte[] {51, 55, (byte) '='};

    private static final int secondaryOrderIDHeaderLength = 4;
    private static final byte[] secondaryOrderIDHeader = new byte[] {49, 57, 56, (byte) '='};

    private static final int secondaryClOrdIDHeaderLength = 4;
    private static final byte[] secondaryClOrdIDHeader = new byte[] {53, 50, 54, (byte) '='};

    private static final int settlDateHeaderLength = 3;
    private static final byte[] settlDateHeader = new byte[] {54, 52, (byte) '='};

    private static final int quantityHeaderLength = 3;
    private static final byte[] quantityHeader = new byte[] {53, 51, (byte) '='};

    private static final int qtyTypeHeaderLength = 4;
    private static final byte[] qtyTypeHeader = new byte[] {56, 53, 52, (byte) '='};

    private static final int currencyHeaderLength = 3;
    private static final byte[] currencyHeader = new byte[] {49, 53, (byte) '='};

    private static final int marginExcessHeaderLength = 4;
    private static final byte[] marginExcessHeader = new byte[] {56, 57, 57, (byte) '='};

    private static final int totalNetValueHeaderLength = 4;
    private static final byte[] totalNetValueHeader = new byte[] {57, 48, 48, (byte) '='};

    private static final int cashOutstandingHeaderLength = 4;
    private static final byte[] cashOutstandingHeader = new byte[] {57, 48, 49, (byte) '='};

    private static final int sideHeaderLength = 3;
    private static final byte[] sideHeader = new byte[] {53, 52, (byte) '='};

    private static final int priceHeaderLength = 3;
    private static final byte[] priceHeader = new byte[] {52, 52, (byte) '='};

    private static final int priceTypeHeaderLength = 4;
    private static final byte[] priceTypeHeader = new byte[] {52, 50, 51, (byte) '='};

    private static final int accruedInterestAmtHeaderLength = 4;
    private static final byte[] accruedInterestAmtHeader = new byte[] {49, 53, 57, (byte) '='};

    private static final int endAccruedInterestAmtHeaderLength = 4;
    private static final byte[] endAccruedInterestAmtHeader = new byte[] {57, 50, 48, (byte) '='};

    private static final int startCashHeaderLength = 4;
    private static final byte[] startCashHeader = new byte[] {57, 50, 49, (byte) '='};

    private static final int endCashHeaderLength = 4;
    private static final byte[] endCashHeader = new byte[] {57, 50, 50, (byte) '='};

    private static final int textHeaderLength = 3;
    private static final byte[] textHeader = new byte[] {53, 56, (byte) '='};

    private static final int encodedTextLenHeaderLength = 4;
    private static final byte[] encodedTextLenHeader = new byte[] {51, 53, 52, (byte) '='};

    private static final int encodedTextHeaderLength = 4;
    private static final byte[] encodedTextHeader = new byte[] {51, 53, 53, (byte) '='};

    private final MutableDirectBuffer collRespID = new UnsafeBuffer();

    private int collRespIDOffset = 0;

    private int collRespIDLength = 0;

    public CollateralResponseEncoder collRespID(final DirectBuffer value, final int offset, final int length)
    {
        collRespID.wrap(value);
        collRespIDOffset = offset;
        collRespIDLength = length;
        return this;
    }

    public CollateralResponseEncoder collRespID(final DirectBuffer value, final int length)
    {
        return collRespID(value, 0, length);
    }

    public CollateralResponseEncoder collRespID(final DirectBuffer value)
    {
        return collRespID(value, 0, value.capacity());
    }

    public CollateralResponseEncoder collRespID(final byte[] value, final int offset, final int length)
    {
        collRespID.wrap(value);
        collRespIDOffset = offset;
        collRespIDLength = length;
        return this;
    }

    public CollateralResponseEncoder collRespIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(collRespID, value, offset, length);
        collRespIDOffset = offset;
        collRespIDLength = length;
        return this;
    }

    public CollateralResponseEncoder collRespID(final byte[] value, final int length)
    {
        return collRespID(value, 0, length);
    }

    public CollateralResponseEncoder collRespID(final byte[] value)
    {
        return collRespID(value, 0, value.length);
    }

    public boolean hasCollRespID()
    {
        return collRespIDLength > 0;
    }

    public MutableDirectBuffer collRespID()
    {
        return collRespID;
    }

    public String collRespIDAsString()
    {
        return collRespID.getStringWithoutLengthAscii(collRespIDOffset, collRespIDLength);
    }

    public CollateralResponseEncoder collRespID(final CharSequence value)
    {
        toBytes(value, collRespID);
        collRespIDOffset = 0;
        collRespIDLength = value.length();
        return this;
    }

    public CollateralResponseEncoder collRespID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            collRespID.wrap(buffer);
            collRespIDOffset = value.offset();
            collRespIDLength = value.length();
        }
        return this;
    }

    public CollateralResponseEncoder collRespID(final char[] value)
    {
        return collRespID(value, 0, value.length);
    }

    public CollateralResponseEncoder collRespID(final char[] value, final int length)
    {
        return collRespID(value, 0, length);
    }

    public CollateralResponseEncoder collRespID(final char[] value, final int offset, final int length)
    {
        toBytes(value, collRespID, offset, length);
        collRespIDOffset = 0;
        collRespIDLength = length;
        return this;
    }

    private final MutableDirectBuffer collAsgnID = new UnsafeBuffer();

    private int collAsgnIDOffset = 0;

    private int collAsgnIDLength = 0;

    public CollateralResponseEncoder collAsgnID(final DirectBuffer value, final int offset, final int length)
    {
        collAsgnID.wrap(value);
        collAsgnIDOffset = offset;
        collAsgnIDLength = length;
        return this;
    }

    public CollateralResponseEncoder collAsgnID(final DirectBuffer value, final int length)
    {
        return collAsgnID(value, 0, length);
    }

    public CollateralResponseEncoder collAsgnID(final DirectBuffer value)
    {
        return collAsgnID(value, 0, value.capacity());
    }

    public CollateralResponseEncoder collAsgnID(final byte[] value, final int offset, final int length)
    {
        collAsgnID.wrap(value);
        collAsgnIDOffset = offset;
        collAsgnIDLength = length;
        return this;
    }

    public CollateralResponseEncoder collAsgnIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(collAsgnID, value, offset, length);
        collAsgnIDOffset = offset;
        collAsgnIDLength = length;
        return this;
    }

    public CollateralResponseEncoder collAsgnID(final byte[] value, final int length)
    {
        return collAsgnID(value, 0, length);
    }

    public CollateralResponseEncoder collAsgnID(final byte[] value)
    {
        return collAsgnID(value, 0, value.length);
    }

    public boolean hasCollAsgnID()
    {
        return collAsgnIDLength > 0;
    }

    public MutableDirectBuffer collAsgnID()
    {
        return collAsgnID;
    }

    public String collAsgnIDAsString()
    {
        return collAsgnID.getStringWithoutLengthAscii(collAsgnIDOffset, collAsgnIDLength);
    }

    public CollateralResponseEncoder collAsgnID(final CharSequence value)
    {
        toBytes(value, collAsgnID);
        collAsgnIDOffset = 0;
        collAsgnIDLength = value.length();
        return this;
    }

    public CollateralResponseEncoder collAsgnID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            collAsgnID.wrap(buffer);
            collAsgnIDOffset = value.offset();
            collAsgnIDLength = value.length();
        }
        return this;
    }

    public CollateralResponseEncoder collAsgnID(final char[] value)
    {
        return collAsgnID(value, 0, value.length);
    }

    public CollateralResponseEncoder collAsgnID(final char[] value, final int length)
    {
        return collAsgnID(value, 0, length);
    }

    public CollateralResponseEncoder collAsgnID(final char[] value, final int offset, final int length)
    {
        toBytes(value, collAsgnID, offset, length);
        collAsgnIDOffset = 0;
        collAsgnIDLength = length;
        return this;
    }

    private final MutableDirectBuffer collReqID = new UnsafeBuffer();

    private int collReqIDOffset = 0;

    private int collReqIDLength = 0;

    public CollateralResponseEncoder collReqID(final DirectBuffer value, final int offset, final int length)
    {
        collReqID.wrap(value);
        collReqIDOffset = offset;
        collReqIDLength = length;
        return this;
    }

    public CollateralResponseEncoder collReqID(final DirectBuffer value, final int length)
    {
        return collReqID(value, 0, length);
    }

    public CollateralResponseEncoder collReqID(final DirectBuffer value)
    {
        return collReqID(value, 0, value.capacity());
    }

    public CollateralResponseEncoder collReqID(final byte[] value, final int offset, final int length)
    {
        collReqID.wrap(value);
        collReqIDOffset = offset;
        collReqIDLength = length;
        return this;
    }

    public CollateralResponseEncoder collReqIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(collReqID, value, offset, length);
        collReqIDOffset = offset;
        collReqIDLength = length;
        return this;
    }

    public CollateralResponseEncoder collReqID(final byte[] value, final int length)
    {
        return collReqID(value, 0, length);
    }

    public CollateralResponseEncoder collReqID(final byte[] value)
    {
        return collReqID(value, 0, value.length);
    }

    public boolean hasCollReqID()
    {
        return collReqIDLength > 0;
    }

    public MutableDirectBuffer collReqID()
    {
        return collReqID;
    }

    public String collReqIDAsString()
    {
        return collReqID.getStringWithoutLengthAscii(collReqIDOffset, collReqIDLength);
    }

    public CollateralResponseEncoder collReqID(final CharSequence value)
    {
        toBytes(value, collReqID);
        collReqIDOffset = 0;
        collReqIDLength = value.length();
        return this;
    }

    public CollateralResponseEncoder collReqID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            collReqID.wrap(buffer);
            collReqIDOffset = value.offset();
            collReqIDLength = value.length();
        }
        return this;
    }

    public CollateralResponseEncoder collReqID(final char[] value)
    {
        return collReqID(value, 0, value.length);
    }

    public CollateralResponseEncoder collReqID(final char[] value, final int length)
    {
        return collReqID(value, 0, length);
    }

    public CollateralResponseEncoder collReqID(final char[] value, final int offset, final int length)
    {
        toBytes(value, collReqID, offset, length);
        collReqIDOffset = 0;
        collReqIDLength = length;
        return this;
    }

    private int collAsgnReason;

    private boolean hasCollAsgnReason;

    public boolean hasCollAsgnReason()
    {
        return hasCollAsgnReason;
    }

    public CollateralResponseEncoder collAsgnReason(int value)
    {
        collAsgnReason = value;
        hasCollAsgnReason = true;
        return this;
    }

    public int collAsgnReason()
    {
        return collAsgnReason;
    }

    public CollateralResponseEncoder collAsgnReason(CollAsgnReason value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == CollAsgnReason.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: collAsgnReason Value: " + value );
            }
            if (value == CollAsgnReason.NULL_VAL)
            {
                return this;
            }
        }
        return collAsgnReason(value.representation());
    }

    private int collAsgnTransType;

    private boolean hasCollAsgnTransType;

    public boolean hasCollAsgnTransType()
    {
        return hasCollAsgnTransType;
    }

    public CollateralResponseEncoder collAsgnTransType(int value)
    {
        collAsgnTransType = value;
        hasCollAsgnTransType = true;
        return this;
    }

    public int collAsgnTransType()
    {
        return collAsgnTransType;
    }

    public CollateralResponseEncoder collAsgnTransType(CollAsgnTransType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == CollAsgnTransType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: collAsgnTransType Value: " + value );
            }
            if (value == CollAsgnTransType.NULL_VAL)
            {
                return this;
            }
        }
        return collAsgnTransType(value.representation());
    }

    private int collAsgnRespType;

    private boolean hasCollAsgnRespType;

    public boolean hasCollAsgnRespType()
    {
        return hasCollAsgnRespType;
    }

    public CollateralResponseEncoder collAsgnRespType(int value)
    {
        collAsgnRespType = value;
        hasCollAsgnRespType = true;
        return this;
    }

    public int collAsgnRespType()
    {
        return collAsgnRespType;
    }

    public CollateralResponseEncoder collAsgnRespType(CollAsgnRespType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == CollAsgnRespType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: collAsgnRespType Value: " + value );
            }
            if (value == CollAsgnRespType.NULL_VAL)
            {
                return this;
            }
        }
        return collAsgnRespType(value.representation());
    }

    private int collAsgnRejectReason;

    private boolean hasCollAsgnRejectReason;

    public boolean hasCollAsgnRejectReason()
    {
        return hasCollAsgnRejectReason;
    }

    public CollateralResponseEncoder collAsgnRejectReason(int value)
    {
        collAsgnRejectReason = value;
        hasCollAsgnRejectReason = true;
        return this;
    }

    public int collAsgnRejectReason()
    {
        return collAsgnRejectReason;
    }

    public CollateralResponseEncoder collAsgnRejectReason(CollAsgnRejectReason value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == CollAsgnRejectReason.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: collAsgnRejectReason Value: " + value );
            }
            if (value == CollAsgnRejectReason.NULL_VAL)
            {
                return this;
            }
        }
        return collAsgnRejectReason(value.representation());
    }

    private final MutableDirectBuffer transactTime = new UnsafeBuffer();

    private int transactTimeOffset = 0;

    private int transactTimeLength = 0;

    public CollateralResponseEncoder transactTime(final DirectBuffer value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public CollateralResponseEncoder transactTime(final DirectBuffer value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public CollateralResponseEncoder transactTime(final DirectBuffer value)
    {
        return transactTime(value, 0, value.capacity());
    }

    public CollateralResponseEncoder transactTime(final byte[] value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public CollateralResponseEncoder transactTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(transactTime, value, offset, length);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public CollateralResponseEncoder transactTime(final byte[] value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public CollateralResponseEncoder transactTime(final byte[] value)
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

    private int collApplType;

    private boolean hasCollApplType;

    public boolean hasCollApplType()
    {
        return hasCollApplType;
    }

    public CollateralResponseEncoder collApplType(int value)
    {
        collApplType = value;
        hasCollApplType = true;
        return this;
    }

    public int collApplType()
    {
        return collApplType;
    }

    public CollateralResponseEncoder collApplType(CollApplType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == CollApplType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: collApplType Value: " + value );
            }
            if (value == CollApplType.NULL_VAL)
            {
                return this;
            }
        }
        return collApplType(value.representation());
    }

    private final MutableDirectBuffer financialStatus = new UnsafeBuffer();

    private int financialStatusOffset = 0;

    private int financialStatusLength = 0;

    public CollateralResponseEncoder financialStatus(final DirectBuffer value, final int offset, final int length)
    {
        financialStatus.wrap(value);
        financialStatusOffset = offset;
        financialStatusLength = length;
        return this;
    }

    public CollateralResponseEncoder financialStatus(final DirectBuffer value, final int length)
    {
        return financialStatus(value, 0, length);
    }

    public CollateralResponseEncoder financialStatus(final DirectBuffer value)
    {
        return financialStatus(value, 0, value.capacity());
    }

    public CollateralResponseEncoder financialStatus(final byte[] value, final int offset, final int length)
    {
        financialStatus.wrap(value);
        financialStatusOffset = offset;
        financialStatusLength = length;
        return this;
    }

    public CollateralResponseEncoder financialStatusAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(financialStatus, value, offset, length);
        financialStatusOffset = offset;
        financialStatusLength = length;
        return this;
    }

    public CollateralResponseEncoder financialStatus(final byte[] value, final int length)
    {
        return financialStatus(value, 0, length);
    }

    public CollateralResponseEncoder financialStatus(final byte[] value)
    {
        return financialStatus(value, 0, value.length);
    }

    public boolean hasFinancialStatus()
    {
        return financialStatusLength > 0;
    }

    public MutableDirectBuffer financialStatus()
    {
        return financialStatus;
    }

    public String financialStatusAsString()
    {
        return financialStatus.getStringWithoutLengthAscii(financialStatusOffset, financialStatusLength);
    }

    public CollateralResponseEncoder financialStatus(final CharSequence value)
    {
        toBytes(value, financialStatus);
        financialStatusOffset = 0;
        financialStatusLength = value.length();
        return this;
    }

    public CollateralResponseEncoder financialStatus(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            financialStatus.wrap(buffer);
            financialStatusOffset = value.offset();
            financialStatusLength = value.length();
        }
        return this;
    }

    public CollateralResponseEncoder financialStatus(final char[] value)
    {
        return financialStatus(value, 0, value.length);
    }

    public CollateralResponseEncoder financialStatus(final char[] value, final int length)
    {
        return financialStatus(value, 0, length);
    }

    public CollateralResponseEncoder financialStatus(final char[] value, final int offset, final int length)
    {
        toBytes(value, financialStatus, offset, length);
        financialStatusOffset = 0;
        financialStatusLength = length;
        return this;
    }

    private final MutableDirectBuffer clearingBusinessDate = new UnsafeBuffer();

    private int clearingBusinessDateOffset = 0;

    private int clearingBusinessDateLength = 0;

    public CollateralResponseEncoder clearingBusinessDate(final DirectBuffer value, final int offset, final int length)
    {
        clearingBusinessDate.wrap(value);
        clearingBusinessDateOffset = offset;
        clearingBusinessDateLength = length;
        return this;
    }

    public CollateralResponseEncoder clearingBusinessDate(final DirectBuffer value, final int length)
    {
        return clearingBusinessDate(value, 0, length);
    }

    public CollateralResponseEncoder clearingBusinessDate(final DirectBuffer value)
    {
        return clearingBusinessDate(value, 0, value.capacity());
    }

    public CollateralResponseEncoder clearingBusinessDate(final byte[] value, final int offset, final int length)
    {
        clearingBusinessDate.wrap(value);
        clearingBusinessDateOffset = offset;
        clearingBusinessDateLength = length;
        return this;
    }

    public CollateralResponseEncoder clearingBusinessDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(clearingBusinessDate, value, offset, length);
        clearingBusinessDateOffset = offset;
        clearingBusinessDateLength = length;
        return this;
    }

    public CollateralResponseEncoder clearingBusinessDate(final byte[] value, final int length)
    {
        return clearingBusinessDate(value, 0, length);
    }

    public CollateralResponseEncoder clearingBusinessDate(final byte[] value)
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

    private final PartiesEncoder parties = new PartiesEncoder();
    public PartiesEncoder parties()
    {
        return parties;
    }

    private final MutableDirectBuffer account = new UnsafeBuffer();

    private int accountOffset = 0;

    private int accountLength = 0;

    public CollateralResponseEncoder account(final DirectBuffer value, final int offset, final int length)
    {
        account.wrap(value);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    public CollateralResponseEncoder account(final DirectBuffer value, final int length)
    {
        return account(value, 0, length);
    }

    public CollateralResponseEncoder account(final DirectBuffer value)
    {
        return account(value, 0, value.capacity());
    }

    public CollateralResponseEncoder account(final byte[] value, final int offset, final int length)
    {
        account.wrap(value);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    public CollateralResponseEncoder accountAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(account, value, offset, length);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    public CollateralResponseEncoder account(final byte[] value, final int length)
    {
        return account(value, 0, length);
    }

    public CollateralResponseEncoder account(final byte[] value)
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

    public CollateralResponseEncoder account(final CharSequence value)
    {
        toBytes(value, account);
        accountOffset = 0;
        accountLength = value.length();
        return this;
    }

    public CollateralResponseEncoder account(final AsciiSequenceView value)
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

    public CollateralResponseEncoder account(final char[] value)
    {
        return account(value, 0, value.length);
    }

    public CollateralResponseEncoder account(final char[] value, final int length)
    {
        return account(value, 0, length);
    }

    public CollateralResponseEncoder account(final char[] value, final int offset, final int length)
    {
        toBytes(value, account, offset, length);
        accountOffset = 0;
        accountLength = length;
        return this;
    }

    private int accountType;

    private boolean hasAccountType;

    public boolean hasAccountType()
    {
        return hasAccountType;
    }

    public CollateralResponseEncoder accountType(int value)
    {
        accountType = value;
        hasAccountType = true;
        return this;
    }

    public int accountType()
    {
        return accountType;
    }

    public CollateralResponseEncoder accountType(AccountType value)
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

    private final MutableDirectBuffer clOrdID = new UnsafeBuffer();

    private int clOrdIDOffset = 0;

    private int clOrdIDLength = 0;

    public CollateralResponseEncoder clOrdID(final DirectBuffer value, final int offset, final int length)
    {
        clOrdID.wrap(value);
        clOrdIDOffset = offset;
        clOrdIDLength = length;
        return this;
    }

    public CollateralResponseEncoder clOrdID(final DirectBuffer value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    public CollateralResponseEncoder clOrdID(final DirectBuffer value)
    {
        return clOrdID(value, 0, value.capacity());
    }

    public CollateralResponseEncoder clOrdID(final byte[] value, final int offset, final int length)
    {
        clOrdID.wrap(value);
        clOrdIDOffset = offset;
        clOrdIDLength = length;
        return this;
    }

    public CollateralResponseEncoder clOrdIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(clOrdID, value, offset, length);
        clOrdIDOffset = offset;
        clOrdIDLength = length;
        return this;
    }

    public CollateralResponseEncoder clOrdID(final byte[] value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    public CollateralResponseEncoder clOrdID(final byte[] value)
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

    public CollateralResponseEncoder clOrdID(final CharSequence value)
    {
        toBytes(value, clOrdID);
        clOrdIDOffset = 0;
        clOrdIDLength = value.length();
        return this;
    }

    public CollateralResponseEncoder clOrdID(final AsciiSequenceView value)
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

    public CollateralResponseEncoder clOrdID(final char[] value)
    {
        return clOrdID(value, 0, value.length);
    }

    public CollateralResponseEncoder clOrdID(final char[] value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    public CollateralResponseEncoder clOrdID(final char[] value, final int offset, final int length)
    {
        toBytes(value, clOrdID, offset, length);
        clOrdIDOffset = 0;
        clOrdIDLength = length;
        return this;
    }

    private final MutableDirectBuffer orderID = new UnsafeBuffer();

    private int orderIDOffset = 0;

    private int orderIDLength = 0;

    public CollateralResponseEncoder orderID(final DirectBuffer value, final int offset, final int length)
    {
        orderID.wrap(value);
        orderIDOffset = offset;
        orderIDLength = length;
        return this;
    }

    public CollateralResponseEncoder orderID(final DirectBuffer value, final int length)
    {
        return orderID(value, 0, length);
    }

    public CollateralResponseEncoder orderID(final DirectBuffer value)
    {
        return orderID(value, 0, value.capacity());
    }

    public CollateralResponseEncoder orderID(final byte[] value, final int offset, final int length)
    {
        orderID.wrap(value);
        orderIDOffset = offset;
        orderIDLength = length;
        return this;
    }

    public CollateralResponseEncoder orderIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(orderID, value, offset, length);
        orderIDOffset = offset;
        orderIDLength = length;
        return this;
    }

    public CollateralResponseEncoder orderID(final byte[] value, final int length)
    {
        return orderID(value, 0, length);
    }

    public CollateralResponseEncoder orderID(final byte[] value)
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

    public CollateralResponseEncoder orderID(final CharSequence value)
    {
        toBytes(value, orderID);
        orderIDOffset = 0;
        orderIDLength = value.length();
        return this;
    }

    public CollateralResponseEncoder orderID(final AsciiSequenceView value)
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

    public CollateralResponseEncoder orderID(final char[] value)
    {
        return orderID(value, 0, value.length);
    }

    public CollateralResponseEncoder orderID(final char[] value, final int length)
    {
        return orderID(value, 0, length);
    }

    public CollateralResponseEncoder orderID(final char[] value, final int offset, final int length)
    {
        toBytes(value, orderID, offset, length);
        orderIDOffset = 0;
        orderIDLength = length;
        return this;
    }

    private final MutableDirectBuffer secondaryOrderID = new UnsafeBuffer();

    private int secondaryOrderIDOffset = 0;

    private int secondaryOrderIDLength = 0;

    public CollateralResponseEncoder secondaryOrderID(final DirectBuffer value, final int offset, final int length)
    {
        secondaryOrderID.wrap(value);
        secondaryOrderIDOffset = offset;
        secondaryOrderIDLength = length;
        return this;
    }

    public CollateralResponseEncoder secondaryOrderID(final DirectBuffer value, final int length)
    {
        return secondaryOrderID(value, 0, length);
    }

    public CollateralResponseEncoder secondaryOrderID(final DirectBuffer value)
    {
        return secondaryOrderID(value, 0, value.capacity());
    }

    public CollateralResponseEncoder secondaryOrderID(final byte[] value, final int offset, final int length)
    {
        secondaryOrderID.wrap(value);
        secondaryOrderIDOffset = offset;
        secondaryOrderIDLength = length;
        return this;
    }

    public CollateralResponseEncoder secondaryOrderIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(secondaryOrderID, value, offset, length);
        secondaryOrderIDOffset = offset;
        secondaryOrderIDLength = length;
        return this;
    }

    public CollateralResponseEncoder secondaryOrderID(final byte[] value, final int length)
    {
        return secondaryOrderID(value, 0, length);
    }

    public CollateralResponseEncoder secondaryOrderID(final byte[] value)
    {
        return secondaryOrderID(value, 0, value.length);
    }

    public boolean hasSecondaryOrderID()
    {
        return secondaryOrderIDLength > 0;
    }

    public MutableDirectBuffer secondaryOrderID()
    {
        return secondaryOrderID;
    }

    public String secondaryOrderIDAsString()
    {
        return secondaryOrderID.getStringWithoutLengthAscii(secondaryOrderIDOffset, secondaryOrderIDLength);
    }

    public CollateralResponseEncoder secondaryOrderID(final CharSequence value)
    {
        toBytes(value, secondaryOrderID);
        secondaryOrderIDOffset = 0;
        secondaryOrderIDLength = value.length();
        return this;
    }

    public CollateralResponseEncoder secondaryOrderID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            secondaryOrderID.wrap(buffer);
            secondaryOrderIDOffset = value.offset();
            secondaryOrderIDLength = value.length();
        }
        return this;
    }

    public CollateralResponseEncoder secondaryOrderID(final char[] value)
    {
        return secondaryOrderID(value, 0, value.length);
    }

    public CollateralResponseEncoder secondaryOrderID(final char[] value, final int length)
    {
        return secondaryOrderID(value, 0, length);
    }

    public CollateralResponseEncoder secondaryOrderID(final char[] value, final int offset, final int length)
    {
        toBytes(value, secondaryOrderID, offset, length);
        secondaryOrderIDOffset = 0;
        secondaryOrderIDLength = length;
        return this;
    }

    private final MutableDirectBuffer secondaryClOrdID = new UnsafeBuffer();

    private int secondaryClOrdIDOffset = 0;

    private int secondaryClOrdIDLength = 0;

    public CollateralResponseEncoder secondaryClOrdID(final DirectBuffer value, final int offset, final int length)
    {
        secondaryClOrdID.wrap(value);
        secondaryClOrdIDOffset = offset;
        secondaryClOrdIDLength = length;
        return this;
    }

    public CollateralResponseEncoder secondaryClOrdID(final DirectBuffer value, final int length)
    {
        return secondaryClOrdID(value, 0, length);
    }

    public CollateralResponseEncoder secondaryClOrdID(final DirectBuffer value)
    {
        return secondaryClOrdID(value, 0, value.capacity());
    }

    public CollateralResponseEncoder secondaryClOrdID(final byte[] value, final int offset, final int length)
    {
        secondaryClOrdID.wrap(value);
        secondaryClOrdIDOffset = offset;
        secondaryClOrdIDLength = length;
        return this;
    }

    public CollateralResponseEncoder secondaryClOrdIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(secondaryClOrdID, value, offset, length);
        secondaryClOrdIDOffset = offset;
        secondaryClOrdIDLength = length;
        return this;
    }

    public CollateralResponseEncoder secondaryClOrdID(final byte[] value, final int length)
    {
        return secondaryClOrdID(value, 0, length);
    }

    public CollateralResponseEncoder secondaryClOrdID(final byte[] value)
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

    public CollateralResponseEncoder secondaryClOrdID(final CharSequence value)
    {
        toBytes(value, secondaryClOrdID);
        secondaryClOrdIDOffset = 0;
        secondaryClOrdIDLength = value.length();
        return this;
    }

    public CollateralResponseEncoder secondaryClOrdID(final AsciiSequenceView value)
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

    public CollateralResponseEncoder secondaryClOrdID(final char[] value)
    {
        return secondaryClOrdID(value, 0, value.length);
    }

    public CollateralResponseEncoder secondaryClOrdID(final char[] value, final int length)
    {
        return secondaryClOrdID(value, 0, length);
    }

    public CollateralResponseEncoder secondaryClOrdID(final char[] value, final int offset, final int length)
    {
        toBytes(value, secondaryClOrdID, offset, length);
        secondaryClOrdIDOffset = 0;
        secondaryClOrdIDLength = length;
        return this;
    }

    private final ExecCollGrpEncoder execCollGrp = new ExecCollGrpEncoder();
    public ExecCollGrpEncoder execCollGrp()
    {
        return execCollGrp;
    }

    private final TrdCollGrpEncoder trdCollGrp = new TrdCollGrpEncoder();
    public TrdCollGrpEncoder trdCollGrp()
    {
        return trdCollGrp;
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

    private final MutableDirectBuffer settlDate = new UnsafeBuffer();

    private int settlDateOffset = 0;

    private int settlDateLength = 0;

    public CollateralResponseEncoder settlDate(final DirectBuffer value, final int offset, final int length)
    {
        settlDate.wrap(value);
        settlDateOffset = offset;
        settlDateLength = length;
        return this;
    }

    public CollateralResponseEncoder settlDate(final DirectBuffer value, final int length)
    {
        return settlDate(value, 0, length);
    }

    public CollateralResponseEncoder settlDate(final DirectBuffer value)
    {
        return settlDate(value, 0, value.capacity());
    }

    public CollateralResponseEncoder settlDate(final byte[] value, final int offset, final int length)
    {
        settlDate.wrap(value);
        settlDateOffset = offset;
        settlDateLength = length;
        return this;
    }

    public CollateralResponseEncoder settlDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlDate, value, offset, length);
        settlDateOffset = offset;
        settlDateLength = length;
        return this;
    }

    public CollateralResponseEncoder settlDate(final byte[] value, final int length)
    {
        return settlDate(value, 0, length);
    }

    public CollateralResponseEncoder settlDate(final byte[] value)
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

    private final DecimalFloat quantity = new DecimalFloat();

    private boolean hasQuantity;

    public boolean hasQuantity()
    {
        return hasQuantity;
    }

    public CollateralResponseEncoder quantity(DecimalFloat value)
    {
        quantity.set(value);
        hasQuantity = true;
        return this;
    }

    public CollateralResponseEncoder quantity(long value, int scale)
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

    public CollateralResponseEncoder qtyType(int value)
    {
        qtyType = value;
        hasQtyType = true;
        return this;
    }

    public int qtyType()
    {
        return qtyType;
    }

    public CollateralResponseEncoder qtyType(QtyType value)
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

    private final MutableDirectBuffer currency = new UnsafeBuffer();

    private int currencyOffset = 0;

    private int currencyLength = 0;

    public CollateralResponseEncoder currency(final DirectBuffer value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public CollateralResponseEncoder currency(final DirectBuffer value, final int length)
    {
        return currency(value, 0, length);
    }

    public CollateralResponseEncoder currency(final DirectBuffer value)
    {
        return currency(value, 0, value.capacity());
    }

    public CollateralResponseEncoder currency(final byte[] value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public CollateralResponseEncoder currencyAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(currency, value, offset, length);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public CollateralResponseEncoder currency(final byte[] value, final int length)
    {
        return currency(value, 0, length);
    }

    public CollateralResponseEncoder currency(final byte[] value)
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

    public CollateralResponseEncoder currency(final CharSequence value)
    {
        toBytes(value, currency);
        currencyOffset = 0;
        currencyLength = value.length();
        return this;
    }

    public CollateralResponseEncoder currency(final AsciiSequenceView value)
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

    public CollateralResponseEncoder currency(final char[] value)
    {
        return currency(value, 0, value.length);
    }

    public CollateralResponseEncoder currency(final char[] value, final int length)
    {
        return currency(value, 0, length);
    }

    public CollateralResponseEncoder currency(final char[] value, final int offset, final int length)
    {
        toBytes(value, currency, offset, length);
        currencyOffset = 0;
        currencyLength = length;
        return this;
    }

    private final InstrmtLegGrpEncoder instrmtLegGrp = new InstrmtLegGrpEncoder();
    public InstrmtLegGrpEncoder instrmtLegGrp()
    {
        return instrmtLegGrp;
    }

    private final UndInstrmtCollGrpEncoder undInstrmtCollGrp = new UndInstrmtCollGrpEncoder();
    public UndInstrmtCollGrpEncoder undInstrmtCollGrp()
    {
        return undInstrmtCollGrp;
    }

    private final DecimalFloat marginExcess = new DecimalFloat();

    private boolean hasMarginExcess;

    public boolean hasMarginExcess()
    {
        return hasMarginExcess;
    }

    public CollateralResponseEncoder marginExcess(DecimalFloat value)
    {
        marginExcess.set(value);
        hasMarginExcess = true;
        return this;
    }

    public CollateralResponseEncoder marginExcess(long value, int scale)
    {
        marginExcess.set(value, scale);
        hasMarginExcess = true;
        return this;
    }

    public DecimalFloat marginExcess()
    {
        return marginExcess;
    }

    private final DecimalFloat totalNetValue = new DecimalFloat();

    private boolean hasTotalNetValue;

    public boolean hasTotalNetValue()
    {
        return hasTotalNetValue;
    }

    public CollateralResponseEncoder totalNetValue(DecimalFloat value)
    {
        totalNetValue.set(value);
        hasTotalNetValue = true;
        return this;
    }

    public CollateralResponseEncoder totalNetValue(long value, int scale)
    {
        totalNetValue.set(value, scale);
        hasTotalNetValue = true;
        return this;
    }

    public DecimalFloat totalNetValue()
    {
        return totalNetValue;
    }

    private final DecimalFloat cashOutstanding = new DecimalFloat();

    private boolean hasCashOutstanding;

    public boolean hasCashOutstanding()
    {
        return hasCashOutstanding;
    }

    public CollateralResponseEncoder cashOutstanding(DecimalFloat value)
    {
        cashOutstanding.set(value);
        hasCashOutstanding = true;
        return this;
    }

    public CollateralResponseEncoder cashOutstanding(long value, int scale)
    {
        cashOutstanding.set(value, scale);
        hasCashOutstanding = true;
        return this;
    }

    public DecimalFloat cashOutstanding()
    {
        return cashOutstanding;
    }

    private final TrdRegTimestampsEncoder trdRegTimestamps = new TrdRegTimestampsEncoder();
    public TrdRegTimestampsEncoder trdRegTimestamps()
    {
        return trdRegTimestamps;
    }

    private char side;

    private boolean hasSide;

    public boolean hasSide()
    {
        return hasSide;
    }

    public CollateralResponseEncoder side(char value)
    {
        side = value;
        hasSide = true;
        return this;
    }

    public char side()
    {
        return side;
    }

    public CollateralResponseEncoder side(Side value)
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

    private final MiscFeesGrpEncoder miscFeesGrp = new MiscFeesGrpEncoder();
    public MiscFeesGrpEncoder miscFeesGrp()
    {
        return miscFeesGrp;
    }

    private final DecimalFloat price = new DecimalFloat();

    private boolean hasPrice;

    public boolean hasPrice()
    {
        return hasPrice;
    }

    public CollateralResponseEncoder price(DecimalFloat value)
    {
        price.set(value);
        hasPrice = true;
        return this;
    }

    public CollateralResponseEncoder price(long value, int scale)
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

    public CollateralResponseEncoder priceType(int value)
    {
        priceType = value;
        hasPriceType = true;
        return this;
    }

    public int priceType()
    {
        return priceType;
    }

    public CollateralResponseEncoder priceType(PriceType value)
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

    private final DecimalFloat accruedInterestAmt = new DecimalFloat();

    private boolean hasAccruedInterestAmt;

    public boolean hasAccruedInterestAmt()
    {
        return hasAccruedInterestAmt;
    }

    public CollateralResponseEncoder accruedInterestAmt(DecimalFloat value)
    {
        accruedInterestAmt.set(value);
        hasAccruedInterestAmt = true;
        return this;
    }

    public CollateralResponseEncoder accruedInterestAmt(long value, int scale)
    {
        accruedInterestAmt.set(value, scale);
        hasAccruedInterestAmt = true;
        return this;
    }

    public DecimalFloat accruedInterestAmt()
    {
        return accruedInterestAmt;
    }

    private final DecimalFloat endAccruedInterestAmt = new DecimalFloat();

    private boolean hasEndAccruedInterestAmt;

    public boolean hasEndAccruedInterestAmt()
    {
        return hasEndAccruedInterestAmt;
    }

    public CollateralResponseEncoder endAccruedInterestAmt(DecimalFloat value)
    {
        endAccruedInterestAmt.set(value);
        hasEndAccruedInterestAmt = true;
        return this;
    }

    public CollateralResponseEncoder endAccruedInterestAmt(long value, int scale)
    {
        endAccruedInterestAmt.set(value, scale);
        hasEndAccruedInterestAmt = true;
        return this;
    }

    public DecimalFloat endAccruedInterestAmt()
    {
        return endAccruedInterestAmt;
    }

    private final DecimalFloat startCash = new DecimalFloat();

    private boolean hasStartCash;

    public boolean hasStartCash()
    {
        return hasStartCash;
    }

    public CollateralResponseEncoder startCash(DecimalFloat value)
    {
        startCash.set(value);
        hasStartCash = true;
        return this;
    }

    public CollateralResponseEncoder startCash(long value, int scale)
    {
        startCash.set(value, scale);
        hasStartCash = true;
        return this;
    }

    public DecimalFloat startCash()
    {
        return startCash;
    }

    private final DecimalFloat endCash = new DecimalFloat();

    private boolean hasEndCash;

    public boolean hasEndCash()
    {
        return hasEndCash;
    }

    public CollateralResponseEncoder endCash(DecimalFloat value)
    {
        endCash.set(value);
        hasEndCash = true;
        return this;
    }

    public CollateralResponseEncoder endCash(long value, int scale)
    {
        endCash.set(value, scale);
        hasEndCash = true;
        return this;
    }

    public DecimalFloat endCash()
    {
        return endCash;
    }

    private final SpreadOrBenchmarkCurveDataEncoder spreadOrBenchmarkCurveData = new SpreadOrBenchmarkCurveDataEncoder();
    public SpreadOrBenchmarkCurveDataEncoder spreadOrBenchmarkCurveData()
    {
        return spreadOrBenchmarkCurveData;
    }

    private final StipulationsEncoder stipulations = new StipulationsEncoder();
    public StipulationsEncoder stipulations()
    {
        return stipulations;
    }

    private final MutableDirectBuffer text = new UnsafeBuffer();

    private int textOffset = 0;

    private int textLength = 0;

    public CollateralResponseEncoder text(final DirectBuffer value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public CollateralResponseEncoder text(final DirectBuffer value, final int length)
    {
        return text(value, 0, length);
    }

    public CollateralResponseEncoder text(final DirectBuffer value)
    {
        return text(value, 0, value.capacity());
    }

    public CollateralResponseEncoder text(final byte[] value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public CollateralResponseEncoder textAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(text, value, offset, length);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public CollateralResponseEncoder text(final byte[] value, final int length)
    {
        return text(value, 0, length);
    }

    public CollateralResponseEncoder text(final byte[] value)
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

    public CollateralResponseEncoder text(final CharSequence value)
    {
        toBytes(value, text);
        textOffset = 0;
        textLength = value.length();
        return this;
    }

    public CollateralResponseEncoder text(final AsciiSequenceView value)
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

    public CollateralResponseEncoder text(final char[] value)
    {
        return text(value, 0, value.length);
    }

    public CollateralResponseEncoder text(final char[] value, final int length)
    {
        return text(value, 0, length);
    }

    public CollateralResponseEncoder text(final char[] value, final int offset, final int length)
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

    public CollateralResponseEncoder encodedTextLen(int value)
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

    public CollateralResponseEncoder encodedText(byte[] value)
    {
        encodedText = value;
        hasEncodedText = true;
        return this;
    }

    public byte[] encodedText()
    {
        return encodedText;
    }

    public CollateralResponseEncoder encodedTextAsCopy(final byte[] value, final int offset, final int length)
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

        if (collRespIDLength > 0)
        {
            buffer.putBytes(position, collRespIDHeader, 0, collRespIDHeaderLength);
            position += collRespIDHeaderLength;
            buffer.putBytes(position, collRespID, collRespIDOffset, collRespIDLength);
            position += collRespIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: CollRespID");
        }

        if (collAsgnIDLength > 0)
        {
            buffer.putBytes(position, collAsgnIDHeader, 0, collAsgnIDHeaderLength);
            position += collAsgnIDHeaderLength;
            buffer.putBytes(position, collAsgnID, collAsgnIDOffset, collAsgnIDLength);
            position += collAsgnIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (collReqIDLength > 0)
        {
            buffer.putBytes(position, collReqIDHeader, 0, collReqIDHeaderLength);
            position += collReqIDHeaderLength;
            buffer.putBytes(position, collReqID, collReqIDOffset, collReqIDLength);
            position += collReqIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasCollAsgnReason)
        {
            buffer.putBytes(position, collAsgnReasonHeader, 0, collAsgnReasonHeaderLength);
            position += collAsgnReasonHeaderLength;
            position += buffer.putIntAscii(position, collAsgnReason);
            buffer.putSeparator(position);
            position++;
        }

        if (hasCollAsgnTransType)
        {
            buffer.putBytes(position, collAsgnTransTypeHeader, 0, collAsgnTransTypeHeaderLength);
            position += collAsgnTransTypeHeaderLength;
            position += buffer.putIntAscii(position, collAsgnTransType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasCollAsgnRespType)
        {
            buffer.putBytes(position, collAsgnRespTypeHeader, 0, collAsgnRespTypeHeaderLength);
            position += collAsgnRespTypeHeaderLength;
            position += buffer.putIntAscii(position, collAsgnRespType);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: CollAsgnRespType");
        }

        if (hasCollAsgnRejectReason)
        {
            buffer.putBytes(position, collAsgnRejectReasonHeader, 0, collAsgnRejectReasonHeaderLength);
            position += collAsgnRejectReasonHeaderLength;
            position += buffer.putIntAscii(position, collAsgnRejectReason);
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

        if (hasCollApplType)
        {
            buffer.putBytes(position, collApplTypeHeader, 0, collApplTypeHeaderLength);
            position += collApplTypeHeaderLength;
            position += buffer.putIntAscii(position, collApplType);
            buffer.putSeparator(position);
            position++;
        }

        if (financialStatusLength > 0)
        {
            buffer.putBytes(position, financialStatusHeader, 0, financialStatusHeaderLength);
            position += financialStatusHeaderLength;
            buffer.putBytes(position, financialStatus, financialStatusOffset, financialStatusLength);
            position += financialStatusLength;
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

        if (hasAccountType)
        {
            buffer.putBytes(position, accountTypeHeader, 0, accountTypeHeaderLength);
            position += accountTypeHeaderLength;
            position += buffer.putIntAscii(position, accountType);
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

        if (orderIDLength > 0)
        {
            buffer.putBytes(position, orderIDHeader, 0, orderIDHeaderLength);
            position += orderIDHeaderLength;
            buffer.putBytes(position, orderID, orderIDOffset, orderIDLength);
            position += orderIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (secondaryOrderIDLength > 0)
        {
            buffer.putBytes(position, secondaryOrderIDHeader, 0, secondaryOrderIDHeaderLength);
            position += secondaryOrderIDHeaderLength;
            buffer.putBytes(position, secondaryOrderID, secondaryOrderIDOffset, secondaryOrderIDLength);
            position += secondaryOrderIDLength;
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

            position += execCollGrp.encode(buffer, position);

            position += trdCollGrp.encode(buffer, position);

            position += instrument.encode(buffer, position);

            position += financingDetails.encode(buffer, position);

        if (settlDateLength > 0)
        {
            buffer.putBytes(position, settlDateHeader, 0, settlDateHeaderLength);
            position += settlDateHeaderLength;
            buffer.putBytes(position, settlDate, settlDateOffset, settlDateLength);
            position += settlDateLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasQuantity)
        {
            buffer.putBytes(position, quantityHeader, 0, quantityHeaderLength);
            position += quantityHeaderLength;
            position += buffer.putFloatAscii(position, quantity);
            buffer.putSeparator(position);
            position++;
        }

        if (hasQtyType)
        {
            buffer.putBytes(position, qtyTypeHeader, 0, qtyTypeHeaderLength);
            position += qtyTypeHeaderLength;
            position += buffer.putIntAscii(position, qtyType);
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

            position += instrmtLegGrp.encode(buffer, position);

            position += undInstrmtCollGrp.encode(buffer, position);

        if (hasMarginExcess)
        {
            buffer.putBytes(position, marginExcessHeader, 0, marginExcessHeaderLength);
            position += marginExcessHeaderLength;
            position += buffer.putFloatAscii(position, marginExcess);
            buffer.putSeparator(position);
            position++;
        }

        if (hasTotalNetValue)
        {
            buffer.putBytes(position, totalNetValueHeader, 0, totalNetValueHeaderLength);
            position += totalNetValueHeaderLength;
            position += buffer.putFloatAscii(position, totalNetValue);
            buffer.putSeparator(position);
            position++;
        }

        if (hasCashOutstanding)
        {
            buffer.putBytes(position, cashOutstandingHeader, 0, cashOutstandingHeaderLength);
            position += cashOutstandingHeaderLength;
            position += buffer.putFloatAscii(position, cashOutstanding);
            buffer.putSeparator(position);
            position++;
        }

            position += trdRegTimestamps.encode(buffer, position);

        if (hasSide)
        {
            buffer.putBytes(position, sideHeader, 0, sideHeaderLength);
            position += sideHeaderLength;
            position += buffer.putCharAscii(position, side);
            buffer.putSeparator(position);
            position++;
        }

            position += miscFeesGrp.encode(buffer, position);

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

        if (hasAccruedInterestAmt)
        {
            buffer.putBytes(position, accruedInterestAmtHeader, 0, accruedInterestAmtHeaderLength);
            position += accruedInterestAmtHeaderLength;
            position += buffer.putFloatAscii(position, accruedInterestAmt);
            buffer.putSeparator(position);
            position++;
        }

        if (hasEndAccruedInterestAmt)
        {
            buffer.putBytes(position, endAccruedInterestAmtHeader, 0, endAccruedInterestAmtHeaderLength);
            position += endAccruedInterestAmtHeaderLength;
            position += buffer.putFloatAscii(position, endAccruedInterestAmt);
            buffer.putSeparator(position);
            position++;
        }

        if (hasStartCash)
        {
            buffer.putBytes(position, startCashHeader, 0, startCashHeaderLength);
            position += startCashHeaderLength;
            position += buffer.putFloatAscii(position, startCash);
            buffer.putSeparator(position);
            position++;
        }

        if (hasEndCash)
        {
            buffer.putBytes(position, endCashHeader, 0, endCashHeaderLength);
            position += endCashHeaderLength;
            position += buffer.putFloatAscii(position, endCash);
            buffer.putSeparator(position);
            position++;
        }

            position += spreadOrBenchmarkCurveData.encode(buffer, position);

            position += stipulations.encode(buffer, position);

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
        this.resetCollRespID();
        this.resetCollAsgnID();
        this.resetCollReqID();
        this.resetCollAsgnReason();
        this.resetCollAsgnTransType();
        this.resetCollAsgnRespType();
        this.resetCollAsgnRejectReason();
        this.resetTransactTime();
        this.resetCollApplType();
        this.resetFinancialStatus();
        this.resetClearingBusinessDate();
        this.resetAccount();
        this.resetAccountType();
        this.resetClOrdID();
        this.resetOrderID();
        this.resetSecondaryOrderID();
        this.resetSecondaryClOrdID();
        this.resetSettlDate();
        this.resetQuantity();
        this.resetQtyType();
        this.resetCurrency();
        this.resetMarginExcess();
        this.resetTotalNetValue();
        this.resetCashOutstanding();
        this.resetSide();
        this.resetPrice();
        this.resetPriceType();
        this.resetAccruedInterestAmt();
        this.resetEndAccruedInterestAmt();
        this.resetStartCash();
        this.resetEndCash();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        parties.reset();
        execCollGrp.reset();
        trdCollGrp.reset();
        instrument.reset();
        financingDetails.reset();
        instrmtLegGrp.reset();
        undInstrmtCollGrp.reset();
        trdRegTimestamps.reset();
        miscFeesGrp.reset();
        spreadOrBenchmarkCurveData.reset();
        stipulations.reset();
    }

    public void resetCollRespID()
    {
        collRespIDLength = 0;
    }

    public void resetCollAsgnID()
    {
        collAsgnIDLength = 0;
    }

    public void resetCollReqID()
    {
        collReqIDLength = 0;
    }

    public void resetCollAsgnReason()
    {
        hasCollAsgnReason = false;
    }

    public void resetCollAsgnTransType()
    {
        hasCollAsgnTransType = false;
    }

    public void resetCollAsgnRespType()
    {
        hasCollAsgnRespType = false;
    }

    public void resetCollAsgnRejectReason()
    {
        hasCollAsgnRejectReason = false;
    }

    public void resetTransactTime()
    {
        transactTimeLength = 0;
    }

    public void resetCollApplType()
    {
        hasCollApplType = false;
    }

    public void resetFinancialStatus()
    {
        financialStatusLength = 0;
    }

    public void resetClearingBusinessDate()
    {
        clearingBusinessDateLength = 0;
    }

    public void resetAccount()
    {
        accountLength = 0;
    }

    public void resetAccountType()
    {
        hasAccountType = false;
    }

    public void resetClOrdID()
    {
        clOrdIDLength = 0;
    }

    public void resetOrderID()
    {
        orderIDLength = 0;
    }

    public void resetSecondaryOrderID()
    {
        secondaryOrderIDLength = 0;
    }

    public void resetSecondaryClOrdID()
    {
        secondaryClOrdIDLength = 0;
    }

    public void resetSettlDate()
    {
        settlDateLength = 0;
    }

    public void resetQuantity()
    {
        hasQuantity = false;
    }

    public void resetQtyType()
    {
        hasQtyType = false;
    }

    public void resetCurrency()
    {
        currencyLength = 0;
    }

    public void resetMarginExcess()
    {
        hasMarginExcess = false;
    }

    public void resetTotalNetValue()
    {
        hasTotalNetValue = false;
    }

    public void resetCashOutstanding()
    {
        hasCashOutstanding = false;
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

    public void resetAccruedInterestAmt()
    {
        hasAccruedInterestAmt = false;
    }

    public void resetEndAccruedInterestAmt()
    {
        hasEndAccruedInterestAmt = false;
    }

    public void resetStartCash()
    {
        hasStartCash = false;
    }

    public void resetEndCash()
    {
        hasEndCash = false;
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
        builder.append("\"MessageName\": \"CollateralResponse\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasCollRespID())
        {
            indent(builder, level);
            builder.append("\"CollRespID\": \"");
            appendBuffer(builder, collRespID, collRespIDOffset, collRespIDLength);
            builder.append("\",\n");
        }

        if (hasCollAsgnID())
        {
            indent(builder, level);
            builder.append("\"CollAsgnID\": \"");
            appendBuffer(builder, collAsgnID, collAsgnIDOffset, collAsgnIDLength);
            builder.append("\",\n");
        }

        if (hasCollReqID())
        {
            indent(builder, level);
            builder.append("\"CollReqID\": \"");
            appendBuffer(builder, collReqID, collReqIDOffset, collReqIDLength);
            builder.append("\",\n");
        }

        if (hasCollAsgnReason())
        {
            indent(builder, level);
            builder.append("\"CollAsgnReason\": \"");
            builder.append(collAsgnReason);
            builder.append("\",\n");
        }

        if (hasCollAsgnTransType())
        {
            indent(builder, level);
            builder.append("\"CollAsgnTransType\": \"");
            builder.append(collAsgnTransType);
            builder.append("\",\n");
        }

        if (hasCollAsgnRespType())
        {
            indent(builder, level);
            builder.append("\"CollAsgnRespType\": \"");
            builder.append(collAsgnRespType);
            builder.append("\",\n");
        }

        if (hasCollAsgnRejectReason())
        {
            indent(builder, level);
            builder.append("\"CollAsgnRejectReason\": \"");
            builder.append(collAsgnRejectReason);
            builder.append("\",\n");
        }

        if (hasTransactTime())
        {
            indent(builder, level);
            builder.append("\"TransactTime\": \"");
            appendBuffer(builder, transactTime, transactTimeOffset, transactTimeLength);
            builder.append("\",\n");
        }

        if (hasCollApplType())
        {
            indent(builder, level);
            builder.append("\"CollApplType\": \"");
            builder.append(collApplType);
            builder.append("\",\n");
        }

        if (hasFinancialStatus())
        {
            indent(builder, level);
            builder.append("\"FinancialStatus\": \"");
            appendBuffer(builder, financialStatus, financialStatusOffset, financialStatusLength);
            builder.append("\",\n");
        }

        if (hasClearingBusinessDate())
        {
            indent(builder, level);
            builder.append("\"ClearingBusinessDate\": \"");
            appendBuffer(builder, clearingBusinessDate, clearingBusinessDateOffset, clearingBusinessDateLength);
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

        if (hasAccountType())
        {
            indent(builder, level);
            builder.append("\"AccountType\": \"");
            builder.append(accountType);
            builder.append("\",\n");
        }

        if (hasClOrdID())
        {
            indent(builder, level);
            builder.append("\"ClOrdID\": \"");
            appendBuffer(builder, clOrdID, clOrdIDOffset, clOrdIDLength);
            builder.append("\",\n");
        }

        if (hasOrderID())
        {
            indent(builder, level);
            builder.append("\"OrderID\": \"");
            appendBuffer(builder, orderID, orderIDOffset, orderIDLength);
            builder.append("\",\n");
        }

        if (hasSecondaryOrderID())
        {
            indent(builder, level);
            builder.append("\"SecondaryOrderID\": \"");
            appendBuffer(builder, secondaryOrderID, secondaryOrderIDOffset, secondaryOrderIDLength);
            builder.append("\",\n");
        }

        if (hasSecondaryClOrdID())
        {
            indent(builder, level);
            builder.append("\"SecondaryClOrdID\": \"");
            appendBuffer(builder, secondaryClOrdID, secondaryClOrdIDOffset, secondaryClOrdIDLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"ExecCollGrp\": ");
    execCollGrp.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"TrdCollGrp\": ");
    trdCollGrp.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"Instrument\": ");
    instrument.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"FinancingDetails\": ");
    financingDetails.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasSettlDate())
        {
            indent(builder, level);
            builder.append("\"SettlDate\": \"");
            appendBuffer(builder, settlDate, settlDateOffset, settlDateLength);
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

        if (hasCurrency())
        {
            indent(builder, level);
            builder.append("\"Currency\": \"");
            appendBuffer(builder, currency, currencyOffset, currencyLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"InstrmtLegGrp\": ");
    instrmtLegGrp.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"UndInstrmtCollGrp\": ");
    undInstrmtCollGrp.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasMarginExcess())
        {
            indent(builder, level);
            builder.append("\"MarginExcess\": \"");
            marginExcess.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasTotalNetValue())
        {
            indent(builder, level);
            builder.append("\"TotalNetValue\": \"");
            totalNetValue.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasCashOutstanding())
        {
            indent(builder, level);
            builder.append("\"CashOutstanding\": \"");
            cashOutstanding.appendTo(builder);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"TrdRegTimestamps\": ");
    trdRegTimestamps.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasSide())
        {
            indent(builder, level);
            builder.append("\"Side\": \"");
            builder.append(side);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"MiscFeesGrp\": ");
    miscFeesGrp.appendTo(builder, level + 1);
    builder.append("\n");

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

        if (hasAccruedInterestAmt())
        {
            indent(builder, level);
            builder.append("\"AccruedInterestAmt\": \"");
            accruedInterestAmt.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasEndAccruedInterestAmt())
        {
            indent(builder, level);
            builder.append("\"EndAccruedInterestAmt\": \"");
            endAccruedInterestAmt.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasStartCash())
        {
            indent(builder, level);
            builder.append("\"StartCash\": \"");
            startCash.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasEndCash())
        {
            indent(builder, level);
            builder.append("\"EndCash\": \"");
            endCash.appendTo(builder);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"SpreadOrBenchmarkCurveData\": ");
    spreadOrBenchmarkCurveData.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"Stipulations\": ");
    stipulations.appendTo(builder, level + 1);
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
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public CollateralResponseEncoder copyTo(final Encoder encoder)
    {
        return copyTo((CollateralResponseEncoder)encoder);
    }

    public CollateralResponseEncoder copyTo(final CollateralResponseEncoder encoder)
    {
        encoder.reset();
        if (hasCollRespID())
        {
            encoder.collRespIDAsCopy(collRespID.byteArray(), 0, collRespIDLength);
        }

        if (hasCollAsgnID())
        {
            encoder.collAsgnIDAsCopy(collAsgnID.byteArray(), 0, collAsgnIDLength);
        }

        if (hasCollReqID())
        {
            encoder.collReqIDAsCopy(collReqID.byteArray(), 0, collReqIDLength);
        }

        if (hasCollAsgnReason())
        {
            encoder.collAsgnReason(this.collAsgnReason());
        }

        if (hasCollAsgnTransType())
        {
            encoder.collAsgnTransType(this.collAsgnTransType());
        }

        if (hasCollAsgnRespType())
        {
            encoder.collAsgnRespType(this.collAsgnRespType());
        }

        if (hasCollAsgnRejectReason())
        {
            encoder.collAsgnRejectReason(this.collAsgnRejectReason());
        }

        if (hasTransactTime())
        {
            encoder.transactTimeAsCopy(transactTime.byteArray(), 0, transactTimeLength);
        }

        if (hasCollApplType())
        {
            encoder.collApplType(this.collApplType());
        }

        if (hasFinancialStatus())
        {
            encoder.financialStatusAsCopy(financialStatus.byteArray(), 0, financialStatusLength);
        }

        if (hasClearingBusinessDate())
        {
            encoder.clearingBusinessDateAsCopy(clearingBusinessDate.byteArray(), 0, clearingBusinessDateLength);
        }


        parties.copyTo(encoder.parties());
        if (hasAccount())
        {
            encoder.accountAsCopy(account.byteArray(), 0, accountLength);
        }

        if (hasAccountType())
        {
            encoder.accountType(this.accountType());
        }

        if (hasClOrdID())
        {
            encoder.clOrdIDAsCopy(clOrdID.byteArray(), 0, clOrdIDLength);
        }

        if (hasOrderID())
        {
            encoder.orderIDAsCopy(orderID.byteArray(), 0, orderIDLength);
        }

        if (hasSecondaryOrderID())
        {
            encoder.secondaryOrderIDAsCopy(secondaryOrderID.byteArray(), 0, secondaryOrderIDLength);
        }

        if (hasSecondaryClOrdID())
        {
            encoder.secondaryClOrdIDAsCopy(secondaryClOrdID.byteArray(), 0, secondaryClOrdIDLength);
        }


        execCollGrp.copyTo(encoder.execCollGrp());

        trdCollGrp.copyTo(encoder.trdCollGrp());

        instrument.copyTo(encoder.instrument());

        financingDetails.copyTo(encoder.financingDetails());
        if (hasSettlDate())
        {
            encoder.settlDateAsCopy(settlDate.byteArray(), 0, settlDateLength);
        }

        if (hasQuantity())
        {
            encoder.quantity(this.quantity());
        }

        if (hasQtyType())
        {
            encoder.qtyType(this.qtyType());
        }

        if (hasCurrency())
        {
            encoder.currencyAsCopy(currency.byteArray(), 0, currencyLength);
        }


        instrmtLegGrp.copyTo(encoder.instrmtLegGrp());

        undInstrmtCollGrp.copyTo(encoder.undInstrmtCollGrp());
        if (hasMarginExcess())
        {
            encoder.marginExcess(this.marginExcess());
        }

        if (hasTotalNetValue())
        {
            encoder.totalNetValue(this.totalNetValue());
        }

        if (hasCashOutstanding())
        {
            encoder.cashOutstanding(this.cashOutstanding());
        }


        trdRegTimestamps.copyTo(encoder.trdRegTimestamps());
        if (hasSide())
        {
            encoder.side(this.side());
        }


        miscFeesGrp.copyTo(encoder.miscFeesGrp());
        if (hasPrice())
        {
            encoder.price(this.price());
        }

        if (hasPriceType())
        {
            encoder.priceType(this.priceType());
        }

        if (hasAccruedInterestAmt())
        {
            encoder.accruedInterestAmt(this.accruedInterestAmt());
        }

        if (hasEndAccruedInterestAmt())
        {
            encoder.endAccruedInterestAmt(this.endAccruedInterestAmt());
        }

        if (hasStartCash())
        {
            encoder.startCash(this.startCash());
        }

        if (hasEndCash())
        {
            encoder.endCash(this.endCash());
        }


        spreadOrBenchmarkCurveData.copyTo(encoder.spreadOrBenchmarkCurveData());

        stipulations.copyTo(encoder.stipulations());
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
