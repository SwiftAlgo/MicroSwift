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


public class AllocationReportAckEncoder implements Encoder
{
    public long messageType()
    {
        return 21569L;
    }

    public AllocationReportAckEncoder()
    {
        header.msgType("AT");
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

    private static final int allocReportIDHeaderLength = 4;
    private static final byte[] allocReportIDHeader = new byte[] {55, 53, 53, (byte) '='};

    private static final int allocIDHeaderLength = 3;
    private static final byte[] allocIDHeader = new byte[] {55, 48, (byte) '='};

    private static final int secondaryAllocIDHeaderLength = 4;
    private static final byte[] secondaryAllocIDHeader = new byte[] {55, 57, 51, (byte) '='};

    private static final int tradeDateHeaderLength = 3;
    private static final byte[] tradeDateHeader = new byte[] {55, 53, (byte) '='};

    private static final int transactTimeHeaderLength = 3;
    private static final byte[] transactTimeHeader = new byte[] {54, 48, (byte) '='};

    private static final int allocStatusHeaderLength = 3;
    private static final byte[] allocStatusHeader = new byte[] {56, 55, (byte) '='};

    private static final int allocRejCodeHeaderLength = 3;
    private static final byte[] allocRejCodeHeader = new byte[] {56, 56, (byte) '='};

    private static final int allocReportTypeHeaderLength = 4;
    private static final byte[] allocReportTypeHeader = new byte[] {55, 57, 52, (byte) '='};

    private static final int allocIntermedReqTypeHeaderLength = 4;
    private static final byte[] allocIntermedReqTypeHeader = new byte[] {56, 48, 56, (byte) '='};

    private static final int matchStatusHeaderLength = 4;
    private static final byte[] matchStatusHeader = new byte[] {53, 55, 51, (byte) '='};

    private static final int productHeaderLength = 4;
    private static final byte[] productHeader = new byte[] {52, 54, 48, (byte) '='};

    private static final int securityTypeHeaderLength = 4;
    private static final byte[] securityTypeHeader = new byte[] {49, 54, 55, (byte) '='};

    private static final int textHeaderLength = 3;
    private static final byte[] textHeader = new byte[] {53, 56, (byte) '='};

    private static final int encodedTextLenHeaderLength = 4;
    private static final byte[] encodedTextLenHeader = new byte[] {51, 53, 52, (byte) '='};

    private static final int encodedTextHeaderLength = 4;
    private static final byte[] encodedTextHeader = new byte[] {51, 53, 53, (byte) '='};

    private static final int noAllocsGroupCounterHeaderLength = 3;
    private static final byte[] noAllocsGroupCounterHeader = new byte[] {55, 56, (byte) '='};

    private final MutableDirectBuffer allocReportID = new UnsafeBuffer();

    private int allocReportIDOffset = 0;

    private int allocReportIDLength = 0;

    public AllocationReportAckEncoder allocReportID(final DirectBuffer value, final int offset, final int length)
    {
        allocReportID.wrap(value);
        allocReportIDOffset = offset;
        allocReportIDLength = length;
        return this;
    }

    public AllocationReportAckEncoder allocReportID(final DirectBuffer value, final int length)
    {
        return allocReportID(value, 0, length);
    }

    public AllocationReportAckEncoder allocReportID(final DirectBuffer value)
    {
        return allocReportID(value, 0, value.capacity());
    }

    public AllocationReportAckEncoder allocReportID(final byte[] value, final int offset, final int length)
    {
        allocReportID.wrap(value);
        allocReportIDOffset = offset;
        allocReportIDLength = length;
        return this;
    }

    public AllocationReportAckEncoder allocReportIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(allocReportID, value, offset, length);
        allocReportIDOffset = offset;
        allocReportIDLength = length;
        return this;
    }

    public AllocationReportAckEncoder allocReportID(final byte[] value, final int length)
    {
        return allocReportID(value, 0, length);
    }

    public AllocationReportAckEncoder allocReportID(final byte[] value)
    {
        return allocReportID(value, 0, value.length);
    }

    public boolean hasAllocReportID()
    {
        return allocReportIDLength > 0;
    }

    public MutableDirectBuffer allocReportID()
    {
        return allocReportID;
    }

    public String allocReportIDAsString()
    {
        return allocReportID.getStringWithoutLengthAscii(allocReportIDOffset, allocReportIDLength);
    }

    public AllocationReportAckEncoder allocReportID(final CharSequence value)
    {
        toBytes(value, allocReportID);
        allocReportIDOffset = 0;
        allocReportIDLength = value.length();
        return this;
    }

    public AllocationReportAckEncoder allocReportID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            allocReportID.wrap(buffer);
            allocReportIDOffset = value.offset();
            allocReportIDLength = value.length();
        }
        return this;
    }

    public AllocationReportAckEncoder allocReportID(final char[] value)
    {
        return allocReportID(value, 0, value.length);
    }

    public AllocationReportAckEncoder allocReportID(final char[] value, final int length)
    {
        return allocReportID(value, 0, length);
    }

    public AllocationReportAckEncoder allocReportID(final char[] value, final int offset, final int length)
    {
        toBytes(value, allocReportID, offset, length);
        allocReportIDOffset = 0;
        allocReportIDLength = length;
        return this;
    }

    private final MutableDirectBuffer allocID = new UnsafeBuffer();

    private int allocIDOffset = 0;

    private int allocIDLength = 0;

    public AllocationReportAckEncoder allocID(final DirectBuffer value, final int offset, final int length)
    {
        allocID.wrap(value);
        allocIDOffset = offset;
        allocIDLength = length;
        return this;
    }

    public AllocationReportAckEncoder allocID(final DirectBuffer value, final int length)
    {
        return allocID(value, 0, length);
    }

    public AllocationReportAckEncoder allocID(final DirectBuffer value)
    {
        return allocID(value, 0, value.capacity());
    }

    public AllocationReportAckEncoder allocID(final byte[] value, final int offset, final int length)
    {
        allocID.wrap(value);
        allocIDOffset = offset;
        allocIDLength = length;
        return this;
    }

    public AllocationReportAckEncoder allocIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(allocID, value, offset, length);
        allocIDOffset = offset;
        allocIDLength = length;
        return this;
    }

    public AllocationReportAckEncoder allocID(final byte[] value, final int length)
    {
        return allocID(value, 0, length);
    }

    public AllocationReportAckEncoder allocID(final byte[] value)
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

    public AllocationReportAckEncoder allocID(final CharSequence value)
    {
        toBytes(value, allocID);
        allocIDOffset = 0;
        allocIDLength = value.length();
        return this;
    }

    public AllocationReportAckEncoder allocID(final AsciiSequenceView value)
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

    public AllocationReportAckEncoder allocID(final char[] value)
    {
        return allocID(value, 0, value.length);
    }

    public AllocationReportAckEncoder allocID(final char[] value, final int length)
    {
        return allocID(value, 0, length);
    }

    public AllocationReportAckEncoder allocID(final char[] value, final int offset, final int length)
    {
        toBytes(value, allocID, offset, length);
        allocIDOffset = 0;
        allocIDLength = length;
        return this;
    }

    private final PartiesEncoder parties = new PartiesEncoder();
    public PartiesEncoder parties()
    {
        return parties;
    }

    private final MutableDirectBuffer secondaryAllocID = new UnsafeBuffer();

    private int secondaryAllocIDOffset = 0;

    private int secondaryAllocIDLength = 0;

    public AllocationReportAckEncoder secondaryAllocID(final DirectBuffer value, final int offset, final int length)
    {
        secondaryAllocID.wrap(value);
        secondaryAllocIDOffset = offset;
        secondaryAllocIDLength = length;
        return this;
    }

    public AllocationReportAckEncoder secondaryAllocID(final DirectBuffer value, final int length)
    {
        return secondaryAllocID(value, 0, length);
    }

    public AllocationReportAckEncoder secondaryAllocID(final DirectBuffer value)
    {
        return secondaryAllocID(value, 0, value.capacity());
    }

    public AllocationReportAckEncoder secondaryAllocID(final byte[] value, final int offset, final int length)
    {
        secondaryAllocID.wrap(value);
        secondaryAllocIDOffset = offset;
        secondaryAllocIDLength = length;
        return this;
    }

    public AllocationReportAckEncoder secondaryAllocIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(secondaryAllocID, value, offset, length);
        secondaryAllocIDOffset = offset;
        secondaryAllocIDLength = length;
        return this;
    }

    public AllocationReportAckEncoder secondaryAllocID(final byte[] value, final int length)
    {
        return secondaryAllocID(value, 0, length);
    }

    public AllocationReportAckEncoder secondaryAllocID(final byte[] value)
    {
        return secondaryAllocID(value, 0, value.length);
    }

    public boolean hasSecondaryAllocID()
    {
        return secondaryAllocIDLength > 0;
    }

    public MutableDirectBuffer secondaryAllocID()
    {
        return secondaryAllocID;
    }

    public String secondaryAllocIDAsString()
    {
        return secondaryAllocID.getStringWithoutLengthAscii(secondaryAllocIDOffset, secondaryAllocIDLength);
    }

    public AllocationReportAckEncoder secondaryAllocID(final CharSequence value)
    {
        toBytes(value, secondaryAllocID);
        secondaryAllocIDOffset = 0;
        secondaryAllocIDLength = value.length();
        return this;
    }

    public AllocationReportAckEncoder secondaryAllocID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            secondaryAllocID.wrap(buffer);
            secondaryAllocIDOffset = value.offset();
            secondaryAllocIDLength = value.length();
        }
        return this;
    }

    public AllocationReportAckEncoder secondaryAllocID(final char[] value)
    {
        return secondaryAllocID(value, 0, value.length);
    }

    public AllocationReportAckEncoder secondaryAllocID(final char[] value, final int length)
    {
        return secondaryAllocID(value, 0, length);
    }

    public AllocationReportAckEncoder secondaryAllocID(final char[] value, final int offset, final int length)
    {
        toBytes(value, secondaryAllocID, offset, length);
        secondaryAllocIDOffset = 0;
        secondaryAllocIDLength = length;
        return this;
    }

    private final MutableDirectBuffer tradeDate = new UnsafeBuffer();

    private int tradeDateOffset = 0;

    private int tradeDateLength = 0;

    public AllocationReportAckEncoder tradeDate(final DirectBuffer value, final int offset, final int length)
    {
        tradeDate.wrap(value);
        tradeDateOffset = offset;
        tradeDateLength = length;
        return this;
    }

    public AllocationReportAckEncoder tradeDate(final DirectBuffer value, final int length)
    {
        return tradeDate(value, 0, length);
    }

    public AllocationReportAckEncoder tradeDate(final DirectBuffer value)
    {
        return tradeDate(value, 0, value.capacity());
    }

    public AllocationReportAckEncoder tradeDate(final byte[] value, final int offset, final int length)
    {
        tradeDate.wrap(value);
        tradeDateOffset = offset;
        tradeDateLength = length;
        return this;
    }

    public AllocationReportAckEncoder tradeDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradeDate, value, offset, length);
        tradeDateOffset = offset;
        tradeDateLength = length;
        return this;
    }

    public AllocationReportAckEncoder tradeDate(final byte[] value, final int length)
    {
        return tradeDate(value, 0, length);
    }

    public AllocationReportAckEncoder tradeDate(final byte[] value)
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

    public AllocationReportAckEncoder transactTime(final DirectBuffer value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public AllocationReportAckEncoder transactTime(final DirectBuffer value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public AllocationReportAckEncoder transactTime(final DirectBuffer value)
    {
        return transactTime(value, 0, value.capacity());
    }

    public AllocationReportAckEncoder transactTime(final byte[] value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public AllocationReportAckEncoder transactTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(transactTime, value, offset, length);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public AllocationReportAckEncoder transactTime(final byte[] value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public AllocationReportAckEncoder transactTime(final byte[] value)
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

    private int allocStatus;

    private boolean hasAllocStatus;

    public boolean hasAllocStatus()
    {
        return hasAllocStatus;
    }

    public AllocationReportAckEncoder allocStatus(int value)
    {
        allocStatus = value;
        hasAllocStatus = true;
        return this;
    }

    public int allocStatus()
    {
        return allocStatus;
    }

    public AllocationReportAckEncoder allocStatus(AllocStatus value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == AllocStatus.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: allocStatus Value: " + value );
            }
            if (value == AllocStatus.NULL_VAL)
            {
                return this;
            }
        }
        return allocStatus(value.representation());
    }

    private int allocRejCode;

    private boolean hasAllocRejCode;

    public boolean hasAllocRejCode()
    {
        return hasAllocRejCode;
    }

    public AllocationReportAckEncoder allocRejCode(int value)
    {
        allocRejCode = value;
        hasAllocRejCode = true;
        return this;
    }

    public int allocRejCode()
    {
        return allocRejCode;
    }

    public AllocationReportAckEncoder allocRejCode(AllocRejCode value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == AllocRejCode.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: allocRejCode Value: " + value );
            }
            if (value == AllocRejCode.NULL_VAL)
            {
                return this;
            }
        }
        return allocRejCode(value.representation());
    }

    private int allocReportType;

    private boolean hasAllocReportType;

    public boolean hasAllocReportType()
    {
        return hasAllocReportType;
    }

    public AllocationReportAckEncoder allocReportType(int value)
    {
        allocReportType = value;
        hasAllocReportType = true;
        return this;
    }

    public int allocReportType()
    {
        return allocReportType;
    }

    public AllocationReportAckEncoder allocReportType(AllocReportType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == AllocReportType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: allocReportType Value: " + value );
            }
            if (value == AllocReportType.NULL_VAL)
            {
                return this;
            }
        }
        return allocReportType(value.representation());
    }

    private int allocIntermedReqType;

    private boolean hasAllocIntermedReqType;

    public boolean hasAllocIntermedReqType()
    {
        return hasAllocIntermedReqType;
    }

    public AllocationReportAckEncoder allocIntermedReqType(int value)
    {
        allocIntermedReqType = value;
        hasAllocIntermedReqType = true;
        return this;
    }

    public int allocIntermedReqType()
    {
        return allocIntermedReqType;
    }

    public AllocationReportAckEncoder allocIntermedReqType(AllocIntermedReqType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == AllocIntermedReqType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: allocIntermedReqType Value: " + value );
            }
            if (value == AllocIntermedReqType.NULL_VAL)
            {
                return this;
            }
        }
        return allocIntermedReqType(value.representation());
    }

    private char matchStatus;

    private boolean hasMatchStatus;

    public boolean hasMatchStatus()
    {
        return hasMatchStatus;
    }

    public AllocationReportAckEncoder matchStatus(char value)
    {
        matchStatus = value;
        hasMatchStatus = true;
        return this;
    }

    public char matchStatus()
    {
        return matchStatus;
    }

    public AllocationReportAckEncoder matchStatus(MatchStatus value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == MatchStatus.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: matchStatus Value: " + value );
            }
            if (value == MatchStatus.NULL_VAL)
            {
                return this;
            }
        }
        return matchStatus(value.representation());
    }

    private int product;

    private boolean hasProduct;

    public boolean hasProduct()
    {
        return hasProduct;
    }

    public AllocationReportAckEncoder product(int value)
    {
        product = value;
        hasProduct = true;
        return this;
    }

    public int product()
    {
        return product;
    }

    public AllocationReportAckEncoder product(Product value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == Product.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: product Value: " + value );
            }
            if (value == Product.NULL_VAL)
            {
                return this;
            }
        }
        return product(value.representation());
    }

    private final MutableDirectBuffer securityType = new UnsafeBuffer();

    private int securityTypeOffset = 0;

    private int securityTypeLength = 0;

    public AllocationReportAckEncoder securityType(final DirectBuffer value, final int offset, final int length)
    {
        securityType.wrap(value);
        securityTypeOffset = offset;
        securityTypeLength = length;
        return this;
    }

    public AllocationReportAckEncoder securityType(final DirectBuffer value, final int length)
    {
        return securityType(value, 0, length);
    }

    public AllocationReportAckEncoder securityType(final DirectBuffer value)
    {
        return securityType(value, 0, value.capacity());
    }

    public AllocationReportAckEncoder securityType(final byte[] value, final int offset, final int length)
    {
        securityType.wrap(value);
        securityTypeOffset = offset;
        securityTypeLength = length;
        return this;
    }

    public AllocationReportAckEncoder securityTypeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(securityType, value, offset, length);
        securityTypeOffset = offset;
        securityTypeLength = length;
        return this;
    }

    public AllocationReportAckEncoder securityType(final byte[] value, final int length)
    {
        return securityType(value, 0, length);
    }

    public AllocationReportAckEncoder securityType(final byte[] value)
    {
        return securityType(value, 0, value.length);
    }

    public boolean hasSecurityType()
    {
        return securityTypeLength > 0;
    }

    public MutableDirectBuffer securityType()
    {
        return securityType;
    }

    public String securityTypeAsString()
    {
        return securityType.getStringWithoutLengthAscii(securityTypeOffset, securityTypeLength);
    }

    public AllocationReportAckEncoder securityType(final CharSequence value)
    {
        toBytes(value, securityType);
        securityTypeOffset = 0;
        securityTypeLength = value.length();
        return this;
    }

    public AllocationReportAckEncoder securityType(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            securityType.wrap(buffer);
            securityTypeOffset = value.offset();
            securityTypeLength = value.length();
        }
        return this;
    }

    public AllocationReportAckEncoder securityType(final char[] value)
    {
        return securityType(value, 0, value.length);
    }

    public AllocationReportAckEncoder securityType(final char[] value, final int length)
    {
        return securityType(value, 0, length);
    }

    public AllocationReportAckEncoder securityType(final char[] value, final int offset, final int length)
    {
        toBytes(value, securityType, offset, length);
        securityTypeOffset = 0;
        securityTypeLength = length;
        return this;
    }

    public AllocationReportAckEncoder securityType(SecurityType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == SecurityType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: securityType Value: " + value );
            }
            if (value == SecurityType.NULL_VAL)
            {
                return this;
            }
        }
        return securityType(value.representation());
    }

    private final MutableDirectBuffer text = new UnsafeBuffer();

    private int textOffset = 0;

    private int textLength = 0;

    public AllocationReportAckEncoder text(final DirectBuffer value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public AllocationReportAckEncoder text(final DirectBuffer value, final int length)
    {
        return text(value, 0, length);
    }

    public AllocationReportAckEncoder text(final DirectBuffer value)
    {
        return text(value, 0, value.capacity());
    }

    public AllocationReportAckEncoder text(final byte[] value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public AllocationReportAckEncoder textAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(text, value, offset, length);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public AllocationReportAckEncoder text(final byte[] value, final int length)
    {
        return text(value, 0, length);
    }

    public AllocationReportAckEncoder text(final byte[] value)
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

    public AllocationReportAckEncoder text(final CharSequence value)
    {
        toBytes(value, text);
        textOffset = 0;
        textLength = value.length();
        return this;
    }

    public AllocationReportAckEncoder text(final AsciiSequenceView value)
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

    public AllocationReportAckEncoder text(final char[] value)
    {
        return text(value, 0, value.length);
    }

    public AllocationReportAckEncoder text(final char[] value, final int length)
    {
        return text(value, 0, length);
    }

    public AllocationReportAckEncoder text(final char[] value, final int offset, final int length)
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

    public AllocationReportAckEncoder encodedTextLen(int value)
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

    public AllocationReportAckEncoder encodedText(byte[] value)
    {
        encodedText = value;
        hasEncodedText = true;
        return this;
    }

    public byte[] encodedText()
    {
        return encodedText;
    }

    public AllocationReportAckEncoder encodedTextAsCopy(final byte[] value, final int offset, final int length)
    {
        encodedText = copyInto(encodedText, value, offset, length);
        hasEncodedText = true;
        return this;
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

    private static final int allocPriceHeaderLength = 4;
    private static final byte[] allocPriceHeader = new byte[] {51, 54, 54, (byte) '='};

    private static final int individualAllocIDHeaderLength = 4;
    private static final byte[] individualAllocIDHeader = new byte[] {52, 54, 55, (byte) '='};

    private static final int individualAllocRejCodeHeaderLength = 4;
    private static final byte[] individualAllocRejCodeHeader = new byte[] {55, 55, 54, (byte) '='};

    private static final int allocTextHeaderLength = 4;
    private static final byte[] allocTextHeader = new byte[] {49, 54, 49, (byte) '='};

    private static final int encodedAllocTextLenHeaderLength = 4;
    private static final byte[] encodedAllocTextLenHeader = new byte[] {51, 54, 48, (byte) '='};

    private static final int encodedAllocTextHeaderLength = 4;
    private static final byte[] encodedAllocTextHeader = new byte[] {51, 54, 49, (byte) '='};

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

    private final DecimalFloat allocPrice = new DecimalFloat();

    private boolean hasAllocPrice;

    public boolean hasAllocPrice()
    {
        return hasAllocPrice;
    }

    public AllocsGroupEncoder allocPrice(DecimalFloat value)
    {
        allocPrice.set(value);
        hasAllocPrice = true;
        return this;
    }

    public AllocsGroupEncoder allocPrice(long value, int scale)
    {
        allocPrice.set(value, scale);
        hasAllocPrice = true;
        return this;
    }

    public DecimalFloat allocPrice()
    {
        return allocPrice;
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

    private int individualAllocRejCode;

    private boolean hasIndividualAllocRejCode;

    public boolean hasIndividualAllocRejCode()
    {
        return hasIndividualAllocRejCode;
    }

    public AllocsGroupEncoder individualAllocRejCode(int value)
    {
        individualAllocRejCode = value;
        hasIndividualAllocRejCode = true;
        return this;
    }

    public int individualAllocRejCode()
    {
        return individualAllocRejCode;
    }

    private final MutableDirectBuffer allocText = new UnsafeBuffer();

    private int allocTextOffset = 0;

    private int allocTextLength = 0;

    public AllocsGroupEncoder allocText(final DirectBuffer value, final int offset, final int length)
    {
        allocText.wrap(value);
        allocTextOffset = offset;
        allocTextLength = length;
        return this;
    }

    public AllocsGroupEncoder allocText(final DirectBuffer value, final int length)
    {
        return allocText(value, 0, length);
    }

    public AllocsGroupEncoder allocText(final DirectBuffer value)
    {
        return allocText(value, 0, value.capacity());
    }

    public AllocsGroupEncoder allocText(final byte[] value, final int offset, final int length)
    {
        allocText.wrap(value);
        allocTextOffset = offset;
        allocTextLength = length;
        return this;
    }

    public AllocsGroupEncoder allocTextAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(allocText, value, offset, length);
        allocTextOffset = offset;
        allocTextLength = length;
        return this;
    }

    public AllocsGroupEncoder allocText(final byte[] value, final int length)
    {
        return allocText(value, 0, length);
    }

    public AllocsGroupEncoder allocText(final byte[] value)
    {
        return allocText(value, 0, value.length);
    }

    public boolean hasAllocText()
    {
        return allocTextLength > 0;
    }

    public MutableDirectBuffer allocText()
    {
        return allocText;
    }

    public String allocTextAsString()
    {
        return allocText.getStringWithoutLengthAscii(allocTextOffset, allocTextLength);
    }

    public AllocsGroupEncoder allocText(final CharSequence value)
    {
        toBytes(value, allocText);
        allocTextOffset = 0;
        allocTextLength = value.length();
        return this;
    }

    public AllocsGroupEncoder allocText(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            allocText.wrap(buffer);
            allocTextOffset = value.offset();
            allocTextLength = value.length();
        }
        return this;
    }

    public AllocsGroupEncoder allocText(final char[] value)
    {
        return allocText(value, 0, value.length);
    }

    public AllocsGroupEncoder allocText(final char[] value, final int length)
    {
        return allocText(value, 0, length);
    }

    public AllocsGroupEncoder allocText(final char[] value, final int offset, final int length)
    {
        toBytes(value, allocText, offset, length);
        allocTextOffset = 0;
        allocTextLength = length;
        return this;
    }

    private int encodedAllocTextLen;

    private boolean hasEncodedAllocTextLen;

    public boolean hasEncodedAllocTextLen()
    {
        return hasEncodedAllocTextLen;
    }

    public AllocsGroupEncoder encodedAllocTextLen(int value)
    {
        encodedAllocTextLen = value;
        hasEncodedAllocTextLen = true;
        return this;
    }

    public int encodedAllocTextLen()
    {
        return encodedAllocTextLen;
    }

    private byte[] encodedAllocText;

    private boolean hasEncodedAllocText;

    public boolean hasEncodedAllocText()
    {
        return hasEncodedAllocText;
    }

    public AllocsGroupEncoder encodedAllocText(byte[] value)
    {
        encodedAllocText = value;
        hasEncodedAllocText = true;
        return this;
    }

    public byte[] encodedAllocText()
    {
        return encodedAllocText;
    }

    public AllocsGroupEncoder encodedAllocTextAsCopy(final byte[] value, final int offset, final int length)
    {
        encodedAllocText = copyInto(encodedAllocText, value, offset, length);
        hasEncodedAllocText = true;
        return this;
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

        if (hasAllocPrice)
        {
            buffer.putBytes(position, allocPriceHeader, 0, allocPriceHeaderLength);
            position += allocPriceHeaderLength;
            position += buffer.putFloatAscii(position, allocPrice);
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

        if (hasIndividualAllocRejCode)
        {
            buffer.putBytes(position, individualAllocRejCodeHeader, 0, individualAllocRejCodeHeaderLength);
            position += individualAllocRejCodeHeaderLength;
            position += buffer.putIntAscii(position, individualAllocRejCode);
            buffer.putSeparator(position);
            position++;
        }

        if (allocTextLength > 0)
        {
            buffer.putBytes(position, allocTextHeader, 0, allocTextHeaderLength);
            position += allocTextHeaderLength;
            buffer.putBytes(position, allocText, allocTextOffset, allocTextLength);
            position += allocTextLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasEncodedAllocTextLen)
        {
            buffer.putBytes(position, encodedAllocTextLenHeader, 0, encodedAllocTextLenHeaderLength);
            position += encodedAllocTextLenHeaderLength;
            position += buffer.putIntAscii(position, encodedAllocTextLen);
            buffer.putSeparator(position);
            position++;
        }

        if (hasEncodedAllocText)
        {
            buffer.putBytes(position, encodedAllocTextHeader, 0, encodedAllocTextHeaderLength);
            position += encodedAllocTextHeaderLength;
            buffer.putBytes(position, encodedAllocText);
            position += encodedAllocText.length;
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
        this.resetAllocPrice();
        this.resetIndividualAllocID();
        this.resetIndividualAllocRejCode();
        this.resetAllocText();
        this.resetEncodedAllocTextLen();
        this.resetEncodedAllocText();
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

    public void resetAllocPrice()
    {
        hasAllocPrice = false;
    }

    public void resetIndividualAllocID()
    {
        individualAllocIDLength = 0;
    }

    public void resetIndividualAllocRejCode()
    {
        hasIndividualAllocRejCode = false;
    }

    public void resetAllocText()
    {
        allocTextLength = 0;
    }

    public void resetEncodedAllocTextLen()
    {
        hasEncodedAllocTextLen = false;
    }

    public void resetEncodedAllocText()
    {
        hasEncodedAllocText = false;
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

        if (hasAllocPrice())
        {
            indent(builder, level);
            builder.append("\"AllocPrice\": \"");
            allocPrice.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasIndividualAllocID())
        {
            indent(builder, level);
            builder.append("\"IndividualAllocID\": \"");
            appendBuffer(builder, individualAllocID, individualAllocIDOffset, individualAllocIDLength);
            builder.append("\",\n");
        }

        if (hasIndividualAllocRejCode())
        {
            indent(builder, level);
            builder.append("\"IndividualAllocRejCode\": \"");
            builder.append(individualAllocRejCode);
            builder.append("\",\n");
        }

        if (hasAllocText())
        {
            indent(builder, level);
            builder.append("\"AllocText\": \"");
            appendBuffer(builder, allocText, allocTextOffset, allocTextLength);
            builder.append("\",\n");
        }

        if (hasEncodedAllocTextLen())
        {
            indent(builder, level);
            builder.append("\"EncodedAllocTextLen\": \"");
            builder.append(encodedAllocTextLen);
            builder.append("\",\n");
        }

        if (hasEncodedAllocText())
        {
            indent(builder, level);
            builder.append("\"EncodedAllocText\": \"");
            appendData(builder, encodedAllocText, encodedAllocTextLen);
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

        if (hasAllocPrice())
        {
            encoder.allocPrice(this.allocPrice());
        }

        if (hasIndividualAllocID())
        {
            encoder.individualAllocIDAsCopy(individualAllocID.byteArray(), 0, individualAllocIDLength);
        }

        if (hasIndividualAllocRejCode())
        {
            encoder.individualAllocRejCode(this.individualAllocRejCode());
        }

        if (hasAllocText())
        {
            encoder.allocTextAsCopy(allocText.byteArray(), 0, allocTextLength);
        }

        if (hasEncodedAllocTextLen())
        {
            encoder.encodedAllocTextLen(this.encodedAllocTextLen());
        }

        if (hasEncodedAllocText())
        {
            encoder.encodedAllocTextAsCopy(this.encodedAllocText(), 0, encodedAllocTextLen());
            encoder.encodedAllocTextLen(encodedAllocTextLen());
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

    public AllocationReportAckEncoder noAllocsGroupCounter(int value)
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

    public long encode(final MutableAsciiBuffer buffer, final int offset)
    {
        final long startMessageResult = header.startMessage(buffer, offset);
        final int bodyStart = Encoder.offset(startMessageResult);
        int position = bodyStart + Encoder.length(startMessageResult);

        if (allocReportIDLength > 0)
        {
            buffer.putBytes(position, allocReportIDHeader, 0, allocReportIDHeaderLength);
            position += allocReportIDHeaderLength;
            buffer.putBytes(position, allocReportID, allocReportIDOffset, allocReportIDLength);
            position += allocReportIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: AllocReportID");
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
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: AllocID");
        }

            position += parties.encode(buffer, position);

        if (secondaryAllocIDLength > 0)
        {
            buffer.putBytes(position, secondaryAllocIDHeader, 0, secondaryAllocIDHeaderLength);
            position += secondaryAllocIDHeaderLength;
            buffer.putBytes(position, secondaryAllocID, secondaryAllocIDOffset, secondaryAllocIDLength);
            position += secondaryAllocIDLength;
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
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: TransactTime");
        }

        if (hasAllocStatus)
        {
            buffer.putBytes(position, allocStatusHeader, 0, allocStatusHeaderLength);
            position += allocStatusHeaderLength;
            position += buffer.putIntAscii(position, allocStatus);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: AllocStatus");
        }

        if (hasAllocRejCode)
        {
            buffer.putBytes(position, allocRejCodeHeader, 0, allocRejCodeHeaderLength);
            position += allocRejCodeHeaderLength;
            position += buffer.putIntAscii(position, allocRejCode);
            buffer.putSeparator(position);
            position++;
        }

        if (hasAllocReportType)
        {
            buffer.putBytes(position, allocReportTypeHeader, 0, allocReportTypeHeaderLength);
            position += allocReportTypeHeaderLength;
            position += buffer.putIntAscii(position, allocReportType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasAllocIntermedReqType)
        {
            buffer.putBytes(position, allocIntermedReqTypeHeader, 0, allocIntermedReqTypeHeaderLength);
            position += allocIntermedReqTypeHeaderLength;
            position += buffer.putIntAscii(position, allocIntermedReqType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasMatchStatus)
        {
            buffer.putBytes(position, matchStatusHeader, 0, matchStatusHeaderLength);
            position += matchStatusHeaderLength;
            position += buffer.putCharAscii(position, matchStatus);
            buffer.putSeparator(position);
            position++;
        }

        if (hasProduct)
        {
            buffer.putBytes(position, productHeader, 0, productHeaderLength);
            position += productHeaderLength;
            position += buffer.putIntAscii(position, product);
            buffer.putSeparator(position);
            position++;
        }

        if (securityTypeLength > 0)
        {
            buffer.putBytes(position, securityTypeHeader, 0, securityTypeHeaderLength);
            position += securityTypeHeaderLength;
            buffer.putBytes(position, securityType, securityTypeOffset, securityTypeLength);
            position += securityTypeLength;
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
        this.resetAllocReportID();
        this.resetAllocID();
        this.resetSecondaryAllocID();
        this.resetTradeDate();
        this.resetTransactTime();
        this.resetAllocStatus();
        this.resetAllocRejCode();
        this.resetAllocReportType();
        this.resetAllocIntermedReqType();
        this.resetMatchStatus();
        this.resetProduct();
        this.resetSecurityType();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        parties.reset();
        this.resetAllocsGroup();
    }

    public void resetAllocReportID()
    {
        allocReportIDLength = 0;
    }

    public void resetAllocID()
    {
        allocIDLength = 0;
    }

    public void resetSecondaryAllocID()
    {
        secondaryAllocIDLength = 0;
    }

    public void resetTradeDate()
    {
        tradeDateLength = 0;
    }

    public void resetTransactTime()
    {
        transactTimeLength = 0;
    }

    public void resetAllocStatus()
    {
        hasAllocStatus = false;
    }

    public void resetAllocRejCode()
    {
        hasAllocRejCode = false;
    }

    public void resetAllocReportType()
    {
        hasAllocReportType = false;
    }

    public void resetAllocIntermedReqType()
    {
        hasAllocIntermedReqType = false;
    }

    public void resetMatchStatus()
    {
        hasMatchStatus = false;
    }

    public void resetProduct()
    {
        hasProduct = false;
    }

    public void resetSecurityType()
    {
        securityTypeLength = 0;
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

    public void resetAllocsGroup()
    {
        if (allocsGroup != null)
        {
            allocsGroup.reset();
        }
        noAllocsGroupCounter = 0;
        hasNoAllocsGroupCounter = false;
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
        builder.append("\"MessageName\": \"AllocationReportAck\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasAllocReportID())
        {
            indent(builder, level);
            builder.append("\"AllocReportID\": \"");
            appendBuffer(builder, allocReportID, allocReportIDOffset, allocReportIDLength);
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
    builder.append("\"Parties\": ");
    parties.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasSecondaryAllocID())
        {
            indent(builder, level);
            builder.append("\"SecondaryAllocID\": \"");
            appendBuffer(builder, secondaryAllocID, secondaryAllocIDOffset, secondaryAllocIDLength);
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

        if (hasAllocStatus())
        {
            indent(builder, level);
            builder.append("\"AllocStatus\": \"");
            builder.append(allocStatus);
            builder.append("\",\n");
        }

        if (hasAllocRejCode())
        {
            indent(builder, level);
            builder.append("\"AllocRejCode\": \"");
            builder.append(allocRejCode);
            builder.append("\",\n");
        }

        if (hasAllocReportType())
        {
            indent(builder, level);
            builder.append("\"AllocReportType\": \"");
            builder.append(allocReportType);
            builder.append("\",\n");
        }

        if (hasAllocIntermedReqType())
        {
            indent(builder, level);
            builder.append("\"AllocIntermedReqType\": \"");
            builder.append(allocIntermedReqType);
            builder.append("\",\n");
        }

        if (hasMatchStatus())
        {
            indent(builder, level);
            builder.append("\"MatchStatus\": \"");
            builder.append(matchStatus);
            builder.append("\",\n");
        }

        if (hasProduct())
        {
            indent(builder, level);
            builder.append("\"Product\": \"");
            builder.append(product);
            builder.append("\",\n");
        }

        if (hasSecurityType())
        {
            indent(builder, level);
            builder.append("\"SecurityType\": \"");
            appendBuffer(builder, securityType, securityTypeOffset, securityTypeLength);
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
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public AllocationReportAckEncoder copyTo(final Encoder encoder)
    {
        return copyTo((AllocationReportAckEncoder)encoder);
    }

    public AllocationReportAckEncoder copyTo(final AllocationReportAckEncoder encoder)
    {
        encoder.reset();
        if (hasAllocReportID())
        {
            encoder.allocReportIDAsCopy(allocReportID.byteArray(), 0, allocReportIDLength);
        }

        if (hasAllocID())
        {
            encoder.allocIDAsCopy(allocID.byteArray(), 0, allocIDLength);
        }


        parties.copyTo(encoder.parties());
        if (hasSecondaryAllocID())
        {
            encoder.secondaryAllocIDAsCopy(secondaryAllocID.byteArray(), 0, secondaryAllocIDLength);
        }

        if (hasTradeDate())
        {
            encoder.tradeDateAsCopy(tradeDate.byteArray(), 0, tradeDateLength);
        }

        if (hasTransactTime())
        {
            encoder.transactTimeAsCopy(transactTime.byteArray(), 0, transactTimeLength);
        }

        if (hasAllocStatus())
        {
            encoder.allocStatus(this.allocStatus());
        }

        if (hasAllocRejCode())
        {
            encoder.allocRejCode(this.allocRejCode());
        }

        if (hasAllocReportType())
        {
            encoder.allocReportType(this.allocReportType());
        }

        if (hasAllocIntermedReqType())
        {
            encoder.allocIntermedReqType(this.allocIntermedReqType());
        }

        if (hasMatchStatus())
        {
            encoder.matchStatus(this.matchStatus());
        }

        if (hasProduct())
        {
            encoder.product(this.product());
        }

        if (hasSecurityType())
        {
            encoder.securityTypeAsCopy(securityType.byteArray(), 0, securityTypeLength);
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
        return encoder;
    }

}
