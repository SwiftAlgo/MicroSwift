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


public class SecurityListEncoder implements Encoder
{
    public long messageType()
    {
        return 121L;
    }

    public SecurityListEncoder()
    {
        header.msgType("y");
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

    private static final int securityReportIDHeaderLength = 4;
    private static final byte[] securityReportIDHeader = new byte[] {57, 54, 52, (byte) '='};

    private static final int clearingBusinessDateHeaderLength = 4;
    private static final byte[] clearingBusinessDateHeader = new byte[] {55, 49, 53, (byte) '='};

    private static final int securityListIDHeaderLength = 5;
    private static final byte[] securityListIDHeader = new byte[] {49, 52, 54, 53, (byte) '='};

    private static final int securityListRefIDHeaderLength = 5;
    private static final byte[] securityListRefIDHeader = new byte[] {49, 52, 54, 54, (byte) '='};

    private static final int securityListDescHeaderLength = 5;
    private static final byte[] securityListDescHeader = new byte[] {49, 52, 54, 55, (byte) '='};

    private static final int encodedSecurityListDescLenHeaderLength = 5;
    private static final byte[] encodedSecurityListDescLenHeader = new byte[] {49, 52, 54, 56, (byte) '='};

    private static final int encodedSecurityListDescHeaderLength = 5;
    private static final byte[] encodedSecurityListDescHeader = new byte[] {49, 52, 54, 57, (byte) '='};

    private static final int securityListTypeHeaderLength = 5;
    private static final byte[] securityListTypeHeader = new byte[] {49, 52, 55, 48, (byte) '='};

    private static final int securityListTypeSourceHeaderLength = 5;
    private static final byte[] securityListTypeSourceHeader = new byte[] {49, 52, 55, 49, (byte) '='};

    private static final int securityReqIDHeaderLength = 4;
    private static final byte[] securityReqIDHeader = new byte[] {51, 50, 48, (byte) '='};

    private static final int securityResponseIDHeaderLength = 4;
    private static final byte[] securityResponseIDHeader = new byte[] {51, 50, 50, (byte) '='};

    private static final int securityRequestResultHeaderLength = 4;
    private static final byte[] securityRequestResultHeader = new byte[] {53, 54, 48, (byte) '='};

    private static final int transactTimeHeaderLength = 3;
    private static final byte[] transactTimeHeader = new byte[] {54, 48, (byte) '='};

    private static final int totNoRelatedSymHeaderLength = 4;
    private static final byte[] totNoRelatedSymHeader = new byte[] {51, 57, 51, (byte) '='};

    private static final int marketIDHeaderLength = 5;
    private static final byte[] marketIDHeader = new byte[] {49, 51, 48, 49, (byte) '='};

    private static final int marketSegmentIDHeaderLength = 5;
    private static final byte[] marketSegmentIDHeader = new byte[] {49, 51, 48, 48, (byte) '='};

    private static final int lastFragmentHeaderLength = 4;
    private static final byte[] lastFragmentHeader = new byte[] {56, 57, 51, (byte) '='};

    private final ApplicationSequenceControlEncoder applicationSequenceControl = new ApplicationSequenceControlEncoder();
    public ApplicationSequenceControlEncoder applicationSequenceControl()
    {
        return applicationSequenceControl;
    }

    private int securityReportID;

    private boolean hasSecurityReportID;

    public boolean hasSecurityReportID()
    {
        return hasSecurityReportID;
    }

    public SecurityListEncoder securityReportID(int value)
    {
        securityReportID = value;
        hasSecurityReportID = true;
        return this;
    }

    public int securityReportID()
    {
        return securityReportID;
    }

    private final MutableDirectBuffer clearingBusinessDate = new UnsafeBuffer();

    private int clearingBusinessDateOffset = 0;

    private int clearingBusinessDateLength = 0;

    public SecurityListEncoder clearingBusinessDate(final DirectBuffer value, final int offset, final int length)
    {
        clearingBusinessDate.wrap(value);
        clearingBusinessDateOffset = offset;
        clearingBusinessDateLength = length;
        return this;
    }

    public SecurityListEncoder clearingBusinessDate(final DirectBuffer value, final int length)
    {
        return clearingBusinessDate(value, 0, length);
    }

    public SecurityListEncoder clearingBusinessDate(final DirectBuffer value)
    {
        return clearingBusinessDate(value, 0, value.capacity());
    }

    public SecurityListEncoder clearingBusinessDate(final byte[] value, final int offset, final int length)
    {
        clearingBusinessDate.wrap(value);
        clearingBusinessDateOffset = offset;
        clearingBusinessDateLength = length;
        return this;
    }

    public SecurityListEncoder clearingBusinessDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(clearingBusinessDate, value, offset, length);
        clearingBusinessDateOffset = offset;
        clearingBusinessDateLength = length;
        return this;
    }

    public SecurityListEncoder clearingBusinessDate(final byte[] value, final int length)
    {
        return clearingBusinessDate(value, 0, length);
    }

    public SecurityListEncoder clearingBusinessDate(final byte[] value)
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

    private final MutableDirectBuffer securityListID = new UnsafeBuffer();

    private int securityListIDOffset = 0;

    private int securityListIDLength = 0;

    public SecurityListEncoder securityListID(final DirectBuffer value, final int offset, final int length)
    {
        securityListID.wrap(value);
        securityListIDOffset = offset;
        securityListIDLength = length;
        return this;
    }

    public SecurityListEncoder securityListID(final DirectBuffer value, final int length)
    {
        return securityListID(value, 0, length);
    }

    public SecurityListEncoder securityListID(final DirectBuffer value)
    {
        return securityListID(value, 0, value.capacity());
    }

    public SecurityListEncoder securityListID(final byte[] value, final int offset, final int length)
    {
        securityListID.wrap(value);
        securityListIDOffset = offset;
        securityListIDLength = length;
        return this;
    }

    public SecurityListEncoder securityListIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(securityListID, value, offset, length);
        securityListIDOffset = offset;
        securityListIDLength = length;
        return this;
    }

    public SecurityListEncoder securityListID(final byte[] value, final int length)
    {
        return securityListID(value, 0, length);
    }

    public SecurityListEncoder securityListID(final byte[] value)
    {
        return securityListID(value, 0, value.length);
    }

    public boolean hasSecurityListID()
    {
        return securityListIDLength > 0;
    }

    public MutableDirectBuffer securityListID()
    {
        return securityListID;
    }

    public String securityListIDAsString()
    {
        return securityListID.getStringWithoutLengthAscii(securityListIDOffset, securityListIDLength);
    }

    public SecurityListEncoder securityListID(final CharSequence value)
    {
        toBytes(value, securityListID);
        securityListIDOffset = 0;
        securityListIDLength = value.length();
        return this;
    }

    public SecurityListEncoder securityListID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            securityListID.wrap(buffer);
            securityListIDOffset = value.offset();
            securityListIDLength = value.length();
        }
        return this;
    }

    public SecurityListEncoder securityListID(final char[] value)
    {
        return securityListID(value, 0, value.length);
    }

    public SecurityListEncoder securityListID(final char[] value, final int length)
    {
        return securityListID(value, 0, length);
    }

    public SecurityListEncoder securityListID(final char[] value, final int offset, final int length)
    {
        toBytes(value, securityListID, offset, length);
        securityListIDOffset = 0;
        securityListIDLength = length;
        return this;
    }

    private final MutableDirectBuffer securityListRefID = new UnsafeBuffer();

    private int securityListRefIDOffset = 0;

    private int securityListRefIDLength = 0;

    public SecurityListEncoder securityListRefID(final DirectBuffer value, final int offset, final int length)
    {
        securityListRefID.wrap(value);
        securityListRefIDOffset = offset;
        securityListRefIDLength = length;
        return this;
    }

    public SecurityListEncoder securityListRefID(final DirectBuffer value, final int length)
    {
        return securityListRefID(value, 0, length);
    }

    public SecurityListEncoder securityListRefID(final DirectBuffer value)
    {
        return securityListRefID(value, 0, value.capacity());
    }

    public SecurityListEncoder securityListRefID(final byte[] value, final int offset, final int length)
    {
        securityListRefID.wrap(value);
        securityListRefIDOffset = offset;
        securityListRefIDLength = length;
        return this;
    }

    public SecurityListEncoder securityListRefIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(securityListRefID, value, offset, length);
        securityListRefIDOffset = offset;
        securityListRefIDLength = length;
        return this;
    }

    public SecurityListEncoder securityListRefID(final byte[] value, final int length)
    {
        return securityListRefID(value, 0, length);
    }

    public SecurityListEncoder securityListRefID(final byte[] value)
    {
        return securityListRefID(value, 0, value.length);
    }

    public boolean hasSecurityListRefID()
    {
        return securityListRefIDLength > 0;
    }

    public MutableDirectBuffer securityListRefID()
    {
        return securityListRefID;
    }

    public String securityListRefIDAsString()
    {
        return securityListRefID.getStringWithoutLengthAscii(securityListRefIDOffset, securityListRefIDLength);
    }

    public SecurityListEncoder securityListRefID(final CharSequence value)
    {
        toBytes(value, securityListRefID);
        securityListRefIDOffset = 0;
        securityListRefIDLength = value.length();
        return this;
    }

    public SecurityListEncoder securityListRefID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            securityListRefID.wrap(buffer);
            securityListRefIDOffset = value.offset();
            securityListRefIDLength = value.length();
        }
        return this;
    }

    public SecurityListEncoder securityListRefID(final char[] value)
    {
        return securityListRefID(value, 0, value.length);
    }

    public SecurityListEncoder securityListRefID(final char[] value, final int length)
    {
        return securityListRefID(value, 0, length);
    }

    public SecurityListEncoder securityListRefID(final char[] value, final int offset, final int length)
    {
        toBytes(value, securityListRefID, offset, length);
        securityListRefIDOffset = 0;
        securityListRefIDLength = length;
        return this;
    }

    private final MutableDirectBuffer securityListDesc = new UnsafeBuffer();

    private int securityListDescOffset = 0;

    private int securityListDescLength = 0;

    public SecurityListEncoder securityListDesc(final DirectBuffer value, final int offset, final int length)
    {
        securityListDesc.wrap(value);
        securityListDescOffset = offset;
        securityListDescLength = length;
        return this;
    }

    public SecurityListEncoder securityListDesc(final DirectBuffer value, final int length)
    {
        return securityListDesc(value, 0, length);
    }

    public SecurityListEncoder securityListDesc(final DirectBuffer value)
    {
        return securityListDesc(value, 0, value.capacity());
    }

    public SecurityListEncoder securityListDesc(final byte[] value, final int offset, final int length)
    {
        securityListDesc.wrap(value);
        securityListDescOffset = offset;
        securityListDescLength = length;
        return this;
    }

    public SecurityListEncoder securityListDescAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(securityListDesc, value, offset, length);
        securityListDescOffset = offset;
        securityListDescLength = length;
        return this;
    }

    public SecurityListEncoder securityListDesc(final byte[] value, final int length)
    {
        return securityListDesc(value, 0, length);
    }

    public SecurityListEncoder securityListDesc(final byte[] value)
    {
        return securityListDesc(value, 0, value.length);
    }

    public boolean hasSecurityListDesc()
    {
        return securityListDescLength > 0;
    }

    public MutableDirectBuffer securityListDesc()
    {
        return securityListDesc;
    }

    public String securityListDescAsString()
    {
        return securityListDesc.getStringWithoutLengthAscii(securityListDescOffset, securityListDescLength);
    }

    public SecurityListEncoder securityListDesc(final CharSequence value)
    {
        toBytes(value, securityListDesc);
        securityListDescOffset = 0;
        securityListDescLength = value.length();
        return this;
    }

    public SecurityListEncoder securityListDesc(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            securityListDesc.wrap(buffer);
            securityListDescOffset = value.offset();
            securityListDescLength = value.length();
        }
        return this;
    }

    public SecurityListEncoder securityListDesc(final char[] value)
    {
        return securityListDesc(value, 0, value.length);
    }

    public SecurityListEncoder securityListDesc(final char[] value, final int length)
    {
        return securityListDesc(value, 0, length);
    }

    public SecurityListEncoder securityListDesc(final char[] value, final int offset, final int length)
    {
        toBytes(value, securityListDesc, offset, length);
        securityListDescOffset = 0;
        securityListDescLength = length;
        return this;
    }

    private int encodedSecurityListDescLen;

    private boolean hasEncodedSecurityListDescLen;

    public boolean hasEncodedSecurityListDescLen()
    {
        return hasEncodedSecurityListDescLen;
    }

    public SecurityListEncoder encodedSecurityListDescLen(int value)
    {
        encodedSecurityListDescLen = value;
        hasEncodedSecurityListDescLen = true;
        return this;
    }

    public int encodedSecurityListDescLen()
    {
        return encodedSecurityListDescLen;
    }

    private byte[] encodedSecurityListDesc;

    private boolean hasEncodedSecurityListDesc;

    public boolean hasEncodedSecurityListDesc()
    {
        return hasEncodedSecurityListDesc;
    }

    public SecurityListEncoder encodedSecurityListDesc(byte[] value)
    {
        encodedSecurityListDesc = value;
        hasEncodedSecurityListDesc = true;
        return this;
    }

    public byte[] encodedSecurityListDesc()
    {
        return encodedSecurityListDesc;
    }

    public SecurityListEncoder encodedSecurityListDescAsCopy(final byte[] value, final int offset, final int length)
    {
        encodedSecurityListDesc = copyInto(encodedSecurityListDesc, value, offset, length);
        hasEncodedSecurityListDesc = true;
        return this;
    }

    private int securityListType;

    private boolean hasSecurityListType;

    public boolean hasSecurityListType()
    {
        return hasSecurityListType;
    }

    public SecurityListEncoder securityListType(int value)
    {
        securityListType = value;
        hasSecurityListType = true;
        return this;
    }

    public int securityListType()
    {
        return securityListType;
    }

    public SecurityListEncoder securityListType(SecurityListType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == SecurityListType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: securityListType Value: " + value );
            }
            if (value == SecurityListType.NULL_VAL)
            {
                return this;
            }
        }
        return securityListType(value.representation());
    }

    private int securityListTypeSource;

    private boolean hasSecurityListTypeSource;

    public boolean hasSecurityListTypeSource()
    {
        return hasSecurityListTypeSource;
    }

    public SecurityListEncoder securityListTypeSource(int value)
    {
        securityListTypeSource = value;
        hasSecurityListTypeSource = true;
        return this;
    }

    public int securityListTypeSource()
    {
        return securityListTypeSource;
    }

    public SecurityListEncoder securityListTypeSource(SecurityListTypeSource value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == SecurityListTypeSource.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: securityListTypeSource Value: " + value );
            }
            if (value == SecurityListTypeSource.NULL_VAL)
            {
                return this;
            }
        }
        return securityListTypeSource(value.representation());
    }

    private final MutableDirectBuffer securityReqID = new UnsafeBuffer();

    private int securityReqIDOffset = 0;

    private int securityReqIDLength = 0;

    public SecurityListEncoder securityReqID(final DirectBuffer value, final int offset, final int length)
    {
        securityReqID.wrap(value);
        securityReqIDOffset = offset;
        securityReqIDLength = length;
        return this;
    }

    public SecurityListEncoder securityReqID(final DirectBuffer value, final int length)
    {
        return securityReqID(value, 0, length);
    }

    public SecurityListEncoder securityReqID(final DirectBuffer value)
    {
        return securityReqID(value, 0, value.capacity());
    }

    public SecurityListEncoder securityReqID(final byte[] value, final int offset, final int length)
    {
        securityReqID.wrap(value);
        securityReqIDOffset = offset;
        securityReqIDLength = length;
        return this;
    }

    public SecurityListEncoder securityReqIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(securityReqID, value, offset, length);
        securityReqIDOffset = offset;
        securityReqIDLength = length;
        return this;
    }

    public SecurityListEncoder securityReqID(final byte[] value, final int length)
    {
        return securityReqID(value, 0, length);
    }

    public SecurityListEncoder securityReqID(final byte[] value)
    {
        return securityReqID(value, 0, value.length);
    }

    public boolean hasSecurityReqID()
    {
        return securityReqIDLength > 0;
    }

    public MutableDirectBuffer securityReqID()
    {
        return securityReqID;
    }

    public String securityReqIDAsString()
    {
        return securityReqID.getStringWithoutLengthAscii(securityReqIDOffset, securityReqIDLength);
    }

    public SecurityListEncoder securityReqID(final CharSequence value)
    {
        toBytes(value, securityReqID);
        securityReqIDOffset = 0;
        securityReqIDLength = value.length();
        return this;
    }

    public SecurityListEncoder securityReqID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            securityReqID.wrap(buffer);
            securityReqIDOffset = value.offset();
            securityReqIDLength = value.length();
        }
        return this;
    }

    public SecurityListEncoder securityReqID(final char[] value)
    {
        return securityReqID(value, 0, value.length);
    }

    public SecurityListEncoder securityReqID(final char[] value, final int length)
    {
        return securityReqID(value, 0, length);
    }

    public SecurityListEncoder securityReqID(final char[] value, final int offset, final int length)
    {
        toBytes(value, securityReqID, offset, length);
        securityReqIDOffset = 0;
        securityReqIDLength = length;
        return this;
    }

    private final MutableDirectBuffer securityResponseID = new UnsafeBuffer();

    private int securityResponseIDOffset = 0;

    private int securityResponseIDLength = 0;

    public SecurityListEncoder securityResponseID(final DirectBuffer value, final int offset, final int length)
    {
        securityResponseID.wrap(value);
        securityResponseIDOffset = offset;
        securityResponseIDLength = length;
        return this;
    }

    public SecurityListEncoder securityResponseID(final DirectBuffer value, final int length)
    {
        return securityResponseID(value, 0, length);
    }

    public SecurityListEncoder securityResponseID(final DirectBuffer value)
    {
        return securityResponseID(value, 0, value.capacity());
    }

    public SecurityListEncoder securityResponseID(final byte[] value, final int offset, final int length)
    {
        securityResponseID.wrap(value);
        securityResponseIDOffset = offset;
        securityResponseIDLength = length;
        return this;
    }

    public SecurityListEncoder securityResponseIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(securityResponseID, value, offset, length);
        securityResponseIDOffset = offset;
        securityResponseIDLength = length;
        return this;
    }

    public SecurityListEncoder securityResponseID(final byte[] value, final int length)
    {
        return securityResponseID(value, 0, length);
    }

    public SecurityListEncoder securityResponseID(final byte[] value)
    {
        return securityResponseID(value, 0, value.length);
    }

    public boolean hasSecurityResponseID()
    {
        return securityResponseIDLength > 0;
    }

    public MutableDirectBuffer securityResponseID()
    {
        return securityResponseID;
    }

    public String securityResponseIDAsString()
    {
        return securityResponseID.getStringWithoutLengthAscii(securityResponseIDOffset, securityResponseIDLength);
    }

    public SecurityListEncoder securityResponseID(final CharSequence value)
    {
        toBytes(value, securityResponseID);
        securityResponseIDOffset = 0;
        securityResponseIDLength = value.length();
        return this;
    }

    public SecurityListEncoder securityResponseID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            securityResponseID.wrap(buffer);
            securityResponseIDOffset = value.offset();
            securityResponseIDLength = value.length();
        }
        return this;
    }

    public SecurityListEncoder securityResponseID(final char[] value)
    {
        return securityResponseID(value, 0, value.length);
    }

    public SecurityListEncoder securityResponseID(final char[] value, final int length)
    {
        return securityResponseID(value, 0, length);
    }

    public SecurityListEncoder securityResponseID(final char[] value, final int offset, final int length)
    {
        toBytes(value, securityResponseID, offset, length);
        securityResponseIDOffset = 0;
        securityResponseIDLength = length;
        return this;
    }

    private int securityRequestResult;

    private boolean hasSecurityRequestResult;

    public boolean hasSecurityRequestResult()
    {
        return hasSecurityRequestResult;
    }

    public SecurityListEncoder securityRequestResult(int value)
    {
        securityRequestResult = value;
        hasSecurityRequestResult = true;
        return this;
    }

    public int securityRequestResult()
    {
        return securityRequestResult;
    }

    public SecurityListEncoder securityRequestResult(SecurityRequestResult value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == SecurityRequestResult.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: securityRequestResult Value: " + value );
            }
            if (value == SecurityRequestResult.NULL_VAL)
            {
                return this;
            }
        }
        return securityRequestResult(value.representation());
    }

    private final MutableDirectBuffer transactTime = new UnsafeBuffer();

    private int transactTimeOffset = 0;

    private int transactTimeLength = 0;

    public SecurityListEncoder transactTime(final DirectBuffer value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public SecurityListEncoder transactTime(final DirectBuffer value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public SecurityListEncoder transactTime(final DirectBuffer value)
    {
        return transactTime(value, 0, value.capacity());
    }

    public SecurityListEncoder transactTime(final byte[] value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public SecurityListEncoder transactTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(transactTime, value, offset, length);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public SecurityListEncoder transactTime(final byte[] value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public SecurityListEncoder transactTime(final byte[] value)
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

    private int totNoRelatedSym;

    private boolean hasTotNoRelatedSym;

    public boolean hasTotNoRelatedSym()
    {
        return hasTotNoRelatedSym;
    }

    public SecurityListEncoder totNoRelatedSym(int value)
    {
        totNoRelatedSym = value;
        hasTotNoRelatedSym = true;
        return this;
    }

    public int totNoRelatedSym()
    {
        return totNoRelatedSym;
    }

    private final MutableDirectBuffer marketID = new UnsafeBuffer();

    private int marketIDOffset = 0;

    private int marketIDLength = 0;

    public SecurityListEncoder marketID(final DirectBuffer value, final int offset, final int length)
    {
        marketID.wrap(value);
        marketIDOffset = offset;
        marketIDLength = length;
        return this;
    }

    public SecurityListEncoder marketID(final DirectBuffer value, final int length)
    {
        return marketID(value, 0, length);
    }

    public SecurityListEncoder marketID(final DirectBuffer value)
    {
        return marketID(value, 0, value.capacity());
    }

    public SecurityListEncoder marketID(final byte[] value, final int offset, final int length)
    {
        marketID.wrap(value);
        marketIDOffset = offset;
        marketIDLength = length;
        return this;
    }

    public SecurityListEncoder marketIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(marketID, value, offset, length);
        marketIDOffset = offset;
        marketIDLength = length;
        return this;
    }

    public SecurityListEncoder marketID(final byte[] value, final int length)
    {
        return marketID(value, 0, length);
    }

    public SecurityListEncoder marketID(final byte[] value)
    {
        return marketID(value, 0, value.length);
    }

    public boolean hasMarketID()
    {
        return marketIDLength > 0;
    }

    public MutableDirectBuffer marketID()
    {
        return marketID;
    }

    public String marketIDAsString()
    {
        return marketID.getStringWithoutLengthAscii(marketIDOffset, marketIDLength);
    }

    public SecurityListEncoder marketID(final CharSequence value)
    {
        toBytes(value, marketID);
        marketIDOffset = 0;
        marketIDLength = value.length();
        return this;
    }

    public SecurityListEncoder marketID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            marketID.wrap(buffer);
            marketIDOffset = value.offset();
            marketIDLength = value.length();
        }
        return this;
    }

    public SecurityListEncoder marketID(final char[] value)
    {
        return marketID(value, 0, value.length);
    }

    public SecurityListEncoder marketID(final char[] value, final int length)
    {
        return marketID(value, 0, length);
    }

    public SecurityListEncoder marketID(final char[] value, final int offset, final int length)
    {
        toBytes(value, marketID, offset, length);
        marketIDOffset = 0;
        marketIDLength = length;
        return this;
    }

    private final MutableDirectBuffer marketSegmentID = new UnsafeBuffer();

    private int marketSegmentIDOffset = 0;

    private int marketSegmentIDLength = 0;

    public SecurityListEncoder marketSegmentID(final DirectBuffer value, final int offset, final int length)
    {
        marketSegmentID.wrap(value);
        marketSegmentIDOffset = offset;
        marketSegmentIDLength = length;
        return this;
    }

    public SecurityListEncoder marketSegmentID(final DirectBuffer value, final int length)
    {
        return marketSegmentID(value, 0, length);
    }

    public SecurityListEncoder marketSegmentID(final DirectBuffer value)
    {
        return marketSegmentID(value, 0, value.capacity());
    }

    public SecurityListEncoder marketSegmentID(final byte[] value, final int offset, final int length)
    {
        marketSegmentID.wrap(value);
        marketSegmentIDOffset = offset;
        marketSegmentIDLength = length;
        return this;
    }

    public SecurityListEncoder marketSegmentIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(marketSegmentID, value, offset, length);
        marketSegmentIDOffset = offset;
        marketSegmentIDLength = length;
        return this;
    }

    public SecurityListEncoder marketSegmentID(final byte[] value, final int length)
    {
        return marketSegmentID(value, 0, length);
    }

    public SecurityListEncoder marketSegmentID(final byte[] value)
    {
        return marketSegmentID(value, 0, value.length);
    }

    public boolean hasMarketSegmentID()
    {
        return marketSegmentIDLength > 0;
    }

    public MutableDirectBuffer marketSegmentID()
    {
        return marketSegmentID;
    }

    public String marketSegmentIDAsString()
    {
        return marketSegmentID.getStringWithoutLengthAscii(marketSegmentIDOffset, marketSegmentIDLength);
    }

    public SecurityListEncoder marketSegmentID(final CharSequence value)
    {
        toBytes(value, marketSegmentID);
        marketSegmentIDOffset = 0;
        marketSegmentIDLength = value.length();
        return this;
    }

    public SecurityListEncoder marketSegmentID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            marketSegmentID.wrap(buffer);
            marketSegmentIDOffset = value.offset();
            marketSegmentIDLength = value.length();
        }
        return this;
    }

    public SecurityListEncoder marketSegmentID(final char[] value)
    {
        return marketSegmentID(value, 0, value.length);
    }

    public SecurityListEncoder marketSegmentID(final char[] value, final int length)
    {
        return marketSegmentID(value, 0, length);
    }

    public SecurityListEncoder marketSegmentID(final char[] value, final int offset, final int length)
    {
        toBytes(value, marketSegmentID, offset, length);
        marketSegmentIDOffset = 0;
        marketSegmentIDLength = length;
        return this;
    }

    private boolean lastFragment;

    private boolean hasLastFragment;

    public boolean hasLastFragment()
    {
        return hasLastFragment;
    }

    public SecurityListEncoder lastFragment(boolean value)
    {
        lastFragment = value;
        hasLastFragment = true;
        return this;
    }

    public boolean lastFragment()
    {
        return lastFragment;
    }

    private final SecListGrpEncoder secListGrp = new SecListGrpEncoder();
    public SecListGrpEncoder secListGrp()
    {
        return secListGrp;
    }

    public long encode(final MutableAsciiBuffer buffer, final int offset)
    {
        final long startMessageResult = header.startMessage(buffer, offset);
        final int bodyStart = Encoder.offset(startMessageResult);
        int position = bodyStart + Encoder.length(startMessageResult);

            position += applicationSequenceControl.encode(buffer, position);

        if (hasSecurityReportID)
        {
            buffer.putBytes(position, securityReportIDHeader, 0, securityReportIDHeaderLength);
            position += securityReportIDHeaderLength;
            position += buffer.putIntAscii(position, securityReportID);
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

        if (securityListIDLength > 0)
        {
            buffer.putBytes(position, securityListIDHeader, 0, securityListIDHeaderLength);
            position += securityListIDHeaderLength;
            buffer.putBytes(position, securityListID, securityListIDOffset, securityListIDLength);
            position += securityListIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (securityListRefIDLength > 0)
        {
            buffer.putBytes(position, securityListRefIDHeader, 0, securityListRefIDHeaderLength);
            position += securityListRefIDHeaderLength;
            buffer.putBytes(position, securityListRefID, securityListRefIDOffset, securityListRefIDLength);
            position += securityListRefIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (securityListDescLength > 0)
        {
            buffer.putBytes(position, securityListDescHeader, 0, securityListDescHeaderLength);
            position += securityListDescHeaderLength;
            buffer.putBytes(position, securityListDesc, securityListDescOffset, securityListDescLength);
            position += securityListDescLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasEncodedSecurityListDescLen)
        {
            buffer.putBytes(position, encodedSecurityListDescLenHeader, 0, encodedSecurityListDescLenHeaderLength);
            position += encodedSecurityListDescLenHeaderLength;
            position += buffer.putIntAscii(position, encodedSecurityListDescLen);
            buffer.putSeparator(position);
            position++;
        }

        if (hasEncodedSecurityListDesc)
        {
            buffer.putBytes(position, encodedSecurityListDescHeader, 0, encodedSecurityListDescHeaderLength);
            position += encodedSecurityListDescHeaderLength;
            buffer.putBytes(position, encodedSecurityListDesc);
            position += encodedSecurityListDesc.length;
            buffer.putSeparator(position);
            position++;
        }

        if (hasSecurityListType)
        {
            buffer.putBytes(position, securityListTypeHeader, 0, securityListTypeHeaderLength);
            position += securityListTypeHeaderLength;
            position += buffer.putIntAscii(position, securityListType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasSecurityListTypeSource)
        {
            buffer.putBytes(position, securityListTypeSourceHeader, 0, securityListTypeSourceHeaderLength);
            position += securityListTypeSourceHeaderLength;
            position += buffer.putIntAscii(position, securityListTypeSource);
            buffer.putSeparator(position);
            position++;
        }

        if (securityReqIDLength > 0)
        {
            buffer.putBytes(position, securityReqIDHeader, 0, securityReqIDHeaderLength);
            position += securityReqIDHeaderLength;
            buffer.putBytes(position, securityReqID, securityReqIDOffset, securityReqIDLength);
            position += securityReqIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (securityResponseIDLength > 0)
        {
            buffer.putBytes(position, securityResponseIDHeader, 0, securityResponseIDHeaderLength);
            position += securityResponseIDHeaderLength;
            buffer.putBytes(position, securityResponseID, securityResponseIDOffset, securityResponseIDLength);
            position += securityResponseIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasSecurityRequestResult)
        {
            buffer.putBytes(position, securityRequestResultHeader, 0, securityRequestResultHeaderLength);
            position += securityRequestResultHeaderLength;
            position += buffer.putIntAscii(position, securityRequestResult);
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

        if (hasTotNoRelatedSym)
        {
            buffer.putBytes(position, totNoRelatedSymHeader, 0, totNoRelatedSymHeaderLength);
            position += totNoRelatedSymHeaderLength;
            position += buffer.putIntAscii(position, totNoRelatedSym);
            buffer.putSeparator(position);
            position++;
        }

        if (marketIDLength > 0)
        {
            buffer.putBytes(position, marketIDHeader, 0, marketIDHeaderLength);
            position += marketIDHeaderLength;
            buffer.putBytes(position, marketID, marketIDOffset, marketIDLength);
            position += marketIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (marketSegmentIDLength > 0)
        {
            buffer.putBytes(position, marketSegmentIDHeader, 0, marketSegmentIDHeaderLength);
            position += marketSegmentIDHeaderLength;
            buffer.putBytes(position, marketSegmentID, marketSegmentIDOffset, marketSegmentIDLength);
            position += marketSegmentIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasLastFragment)
        {
            buffer.putBytes(position, lastFragmentHeader, 0, lastFragmentHeaderLength);
            position += lastFragmentHeaderLength;
            position += buffer.putBooleanAscii(position, lastFragment);
            buffer.putSeparator(position);
            position++;
        }

            position += secListGrp.encode(buffer, position);
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
        this.resetSecurityReportID();
        this.resetClearingBusinessDate();
        this.resetSecurityListID();
        this.resetSecurityListRefID();
        this.resetSecurityListDesc();
        this.resetEncodedSecurityListDescLen();
        this.resetEncodedSecurityListDesc();
        this.resetSecurityListType();
        this.resetSecurityListTypeSource();
        this.resetSecurityReqID();
        this.resetSecurityResponseID();
        this.resetSecurityRequestResult();
        this.resetTransactTime();
        this.resetTotNoRelatedSym();
        this.resetMarketID();
        this.resetMarketSegmentID();
        this.resetLastFragment();
        applicationSequenceControl.reset();
        secListGrp.reset();
    }

    public void resetSecurityReportID()
    {
        hasSecurityReportID = false;
    }

    public void resetClearingBusinessDate()
    {
        clearingBusinessDateLength = 0;
    }

    public void resetSecurityListID()
    {
        securityListIDLength = 0;
    }

    public void resetSecurityListRefID()
    {
        securityListRefIDLength = 0;
    }

    public void resetSecurityListDesc()
    {
        securityListDescLength = 0;
    }

    public void resetEncodedSecurityListDescLen()
    {
        hasEncodedSecurityListDescLen = false;
    }

    public void resetEncodedSecurityListDesc()
    {
        hasEncodedSecurityListDesc = false;
    }

    public void resetSecurityListType()
    {
        hasSecurityListType = false;
    }

    public void resetSecurityListTypeSource()
    {
        hasSecurityListTypeSource = false;
    }

    public void resetSecurityReqID()
    {
        securityReqIDLength = 0;
    }

    public void resetSecurityResponseID()
    {
        securityResponseIDLength = 0;
    }

    public void resetSecurityRequestResult()
    {
        hasSecurityRequestResult = false;
    }

    public void resetTransactTime()
    {
        transactTimeLength = 0;
    }

    public void resetTotNoRelatedSym()
    {
        hasTotNoRelatedSym = false;
    }

    public void resetMarketID()
    {
        marketIDLength = 0;
    }

    public void resetMarketSegmentID()
    {
        marketSegmentIDLength = 0;
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
        builder.append("\"MessageName\": \"SecurityList\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
    indent(builder, level);
    builder.append("\"ApplicationSequenceControl\": ");
    applicationSequenceControl.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasSecurityReportID())
        {
            indent(builder, level);
            builder.append("\"SecurityReportID\": \"");
            builder.append(securityReportID);
            builder.append("\",\n");
        }

        if (hasClearingBusinessDate())
        {
            indent(builder, level);
            builder.append("\"ClearingBusinessDate\": \"");
            appendBuffer(builder, clearingBusinessDate, clearingBusinessDateOffset, clearingBusinessDateLength);
            builder.append("\",\n");
        }

        if (hasSecurityListID())
        {
            indent(builder, level);
            builder.append("\"SecurityListID\": \"");
            appendBuffer(builder, securityListID, securityListIDOffset, securityListIDLength);
            builder.append("\",\n");
        }

        if (hasSecurityListRefID())
        {
            indent(builder, level);
            builder.append("\"SecurityListRefID\": \"");
            appendBuffer(builder, securityListRefID, securityListRefIDOffset, securityListRefIDLength);
            builder.append("\",\n");
        }

        if (hasSecurityListDesc())
        {
            indent(builder, level);
            builder.append("\"SecurityListDesc\": \"");
            appendBuffer(builder, securityListDesc, securityListDescOffset, securityListDescLength);
            builder.append("\",\n");
        }

        if (hasEncodedSecurityListDescLen())
        {
            indent(builder, level);
            builder.append("\"EncodedSecurityListDescLen\": \"");
            builder.append(encodedSecurityListDescLen);
            builder.append("\",\n");
        }

        if (hasEncodedSecurityListDesc())
        {
            indent(builder, level);
            builder.append("\"EncodedSecurityListDesc\": \"");
            appendData(builder, encodedSecurityListDesc, encodedSecurityListDescLen);
            builder.append("\",\n");
        }

        if (hasSecurityListType())
        {
            indent(builder, level);
            builder.append("\"SecurityListType\": \"");
            builder.append(securityListType);
            builder.append("\",\n");
        }

        if (hasSecurityListTypeSource())
        {
            indent(builder, level);
            builder.append("\"SecurityListTypeSource\": \"");
            builder.append(securityListTypeSource);
            builder.append("\",\n");
        }

        if (hasSecurityReqID())
        {
            indent(builder, level);
            builder.append("\"SecurityReqID\": \"");
            appendBuffer(builder, securityReqID, securityReqIDOffset, securityReqIDLength);
            builder.append("\",\n");
        }

        if (hasSecurityResponseID())
        {
            indent(builder, level);
            builder.append("\"SecurityResponseID\": \"");
            appendBuffer(builder, securityResponseID, securityResponseIDOffset, securityResponseIDLength);
            builder.append("\",\n");
        }

        if (hasSecurityRequestResult())
        {
            indent(builder, level);
            builder.append("\"SecurityRequestResult\": \"");
            builder.append(securityRequestResult);
            builder.append("\",\n");
        }

        if (hasTransactTime())
        {
            indent(builder, level);
            builder.append("\"TransactTime\": \"");
            appendBuffer(builder, transactTime, transactTimeOffset, transactTimeLength);
            builder.append("\",\n");
        }

        if (hasTotNoRelatedSym())
        {
            indent(builder, level);
            builder.append("\"TotNoRelatedSym\": \"");
            builder.append(totNoRelatedSym);
            builder.append("\",\n");
        }

        if (hasMarketID())
        {
            indent(builder, level);
            builder.append("\"MarketID\": \"");
            appendBuffer(builder, marketID, marketIDOffset, marketIDLength);
            builder.append("\",\n");
        }

        if (hasMarketSegmentID())
        {
            indent(builder, level);
            builder.append("\"MarketSegmentID\": \"");
            appendBuffer(builder, marketSegmentID, marketSegmentIDOffset, marketSegmentIDLength);
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
    builder.append("\"SecListGrp\": ");
    secListGrp.appendTo(builder, level + 1);
    builder.append("\n");
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public SecurityListEncoder copyTo(final Encoder encoder)
    {
        return copyTo((SecurityListEncoder)encoder);
    }

    public SecurityListEncoder copyTo(final SecurityListEncoder encoder)
    {
        encoder.reset();

        applicationSequenceControl.copyTo(encoder.applicationSequenceControl());
        if (hasSecurityReportID())
        {
            encoder.securityReportID(this.securityReportID());
        }

        if (hasClearingBusinessDate())
        {
            encoder.clearingBusinessDateAsCopy(clearingBusinessDate.byteArray(), 0, clearingBusinessDateLength);
        }

        if (hasSecurityListID())
        {
            encoder.securityListIDAsCopy(securityListID.byteArray(), 0, securityListIDLength);
        }

        if (hasSecurityListRefID())
        {
            encoder.securityListRefIDAsCopy(securityListRefID.byteArray(), 0, securityListRefIDLength);
        }

        if (hasSecurityListDesc())
        {
            encoder.securityListDescAsCopy(securityListDesc.byteArray(), 0, securityListDescLength);
        }

        if (hasEncodedSecurityListDescLen())
        {
            encoder.encodedSecurityListDescLen(this.encodedSecurityListDescLen());
        }

        if (hasEncodedSecurityListDesc())
        {
            encoder.encodedSecurityListDescAsCopy(this.encodedSecurityListDesc(), 0, encodedSecurityListDescLen());
            encoder.encodedSecurityListDescLen(encodedSecurityListDescLen());
        }

        if (hasSecurityListType())
        {
            encoder.securityListType(this.securityListType());
        }

        if (hasSecurityListTypeSource())
        {
            encoder.securityListTypeSource(this.securityListTypeSource());
        }

        if (hasSecurityReqID())
        {
            encoder.securityReqIDAsCopy(securityReqID.byteArray(), 0, securityReqIDLength);
        }

        if (hasSecurityResponseID())
        {
            encoder.securityResponseIDAsCopy(securityResponseID.byteArray(), 0, securityResponseIDLength);
        }

        if (hasSecurityRequestResult())
        {
            encoder.securityRequestResult(this.securityRequestResult());
        }

        if (hasTransactTime())
        {
            encoder.transactTimeAsCopy(transactTime.byteArray(), 0, transactTimeLength);
        }

        if (hasTotNoRelatedSym())
        {
            encoder.totNoRelatedSym(this.totNoRelatedSym());
        }

        if (hasMarketID())
        {
            encoder.marketIDAsCopy(marketID.byteArray(), 0, marketIDLength);
        }

        if (hasMarketSegmentID())
        {
            encoder.marketSegmentIDAsCopy(marketSegmentID.byteArray(), 0, marketSegmentIDLength);
        }

        if (hasLastFragment())
        {
            encoder.lastFragment(this.lastFragment());
        }


        secListGrp.copyTo(encoder.secListGrp());        return encoder;
    }

}
