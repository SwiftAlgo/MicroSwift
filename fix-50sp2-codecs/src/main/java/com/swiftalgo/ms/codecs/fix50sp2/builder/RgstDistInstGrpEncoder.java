/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2.builder;

import org.agrona.MutableDirectBuffer;
import org.agrona.AsciiSequenceView;
import static uk.co.real_logic.artio.dictionary.generation.CodecUtil.*;
import static uk.co.real_logic.artio.dictionary.SessionConstants.*;
import uk.co.real_logic.artio.builder.Encoder;
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


public class RgstDistInstGrpEncoder
{
    private static final int noDistribInstsGroupCounterHeaderLength = 4;
    private static final byte[] noDistribInstsGroupCounterHeader = new byte[] {53, 49, 48, (byte) '='};



public static class DistribInstsGroupEncoder
{
    private DistribInstsGroupEncoder next = null;

    public DistribInstsGroupEncoder next()
    {
        if (next == null)
        {
            next = new DistribInstsGroupEncoder();
        }
        return next;
    }

    private static final int distribPaymentMethodHeaderLength = 4;
    private static final byte[] distribPaymentMethodHeader = new byte[] {52, 55, 55, (byte) '='};

    private static final int distribPercentageHeaderLength = 4;
    private static final byte[] distribPercentageHeader = new byte[] {53, 49, 50, (byte) '='};

    private static final int cashDistribCurrHeaderLength = 4;
    private static final byte[] cashDistribCurrHeader = new byte[] {52, 55, 56, (byte) '='};

    private static final int cashDistribAgentNameHeaderLength = 4;
    private static final byte[] cashDistribAgentNameHeader = new byte[] {52, 57, 56, (byte) '='};

    private static final int cashDistribAgentCodeHeaderLength = 4;
    private static final byte[] cashDistribAgentCodeHeader = new byte[] {52, 57, 57, (byte) '='};

    private static final int cashDistribAgentAcctNumberHeaderLength = 4;
    private static final byte[] cashDistribAgentAcctNumberHeader = new byte[] {53, 48, 48, (byte) '='};

    private static final int cashDistribPayRefHeaderLength = 4;
    private static final byte[] cashDistribPayRefHeader = new byte[] {53, 48, 49, (byte) '='};

    private static final int cashDistribAgentAcctNameHeaderLength = 4;
    private static final byte[] cashDistribAgentAcctNameHeader = new byte[] {53, 48, 50, (byte) '='};

    private int distribPaymentMethod;

    private boolean hasDistribPaymentMethod;

    public boolean hasDistribPaymentMethod()
    {
        return hasDistribPaymentMethod;
    }

    public DistribInstsGroupEncoder distribPaymentMethod(int value)
    {
        distribPaymentMethod = value;
        hasDistribPaymentMethod = true;
        return this;
    }

    public int distribPaymentMethod()
    {
        return distribPaymentMethod;
    }

    public DistribInstsGroupEncoder distribPaymentMethod(DistribPaymentMethod value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == DistribPaymentMethod.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: distribPaymentMethod Value: " + value );
            }
            if (value == DistribPaymentMethod.NULL_VAL)
            {
                return this;
            }
        }
        return distribPaymentMethod(value.representation());
    }

    private final DecimalFloat distribPercentage = new DecimalFloat();

    private boolean hasDistribPercentage;

    public boolean hasDistribPercentage()
    {
        return hasDistribPercentage;
    }

    public DistribInstsGroupEncoder distribPercentage(DecimalFloat value)
    {
        distribPercentage.set(value);
        hasDistribPercentage = true;
        return this;
    }

    public DistribInstsGroupEncoder distribPercentage(long value, int scale)
    {
        distribPercentage.set(value, scale);
        hasDistribPercentage = true;
        return this;
    }

    public DecimalFloat distribPercentage()
    {
        return distribPercentage;
    }

    private final MutableDirectBuffer cashDistribCurr = new UnsafeBuffer();

    private int cashDistribCurrOffset = 0;

    private int cashDistribCurrLength = 0;

    public DistribInstsGroupEncoder cashDistribCurr(final DirectBuffer value, final int offset, final int length)
    {
        cashDistribCurr.wrap(value);
        cashDistribCurrOffset = offset;
        cashDistribCurrLength = length;
        return this;
    }

    public DistribInstsGroupEncoder cashDistribCurr(final DirectBuffer value, final int length)
    {
        return cashDistribCurr(value, 0, length);
    }

    public DistribInstsGroupEncoder cashDistribCurr(final DirectBuffer value)
    {
        return cashDistribCurr(value, 0, value.capacity());
    }

    public DistribInstsGroupEncoder cashDistribCurr(final byte[] value, final int offset, final int length)
    {
        cashDistribCurr.wrap(value);
        cashDistribCurrOffset = offset;
        cashDistribCurrLength = length;
        return this;
    }

    public DistribInstsGroupEncoder cashDistribCurrAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(cashDistribCurr, value, offset, length);
        cashDistribCurrOffset = offset;
        cashDistribCurrLength = length;
        return this;
    }

    public DistribInstsGroupEncoder cashDistribCurr(final byte[] value, final int length)
    {
        return cashDistribCurr(value, 0, length);
    }

    public DistribInstsGroupEncoder cashDistribCurr(final byte[] value)
    {
        return cashDistribCurr(value, 0, value.length);
    }

    public boolean hasCashDistribCurr()
    {
        return cashDistribCurrLength > 0;
    }

    public MutableDirectBuffer cashDistribCurr()
    {
        return cashDistribCurr;
    }

    public String cashDistribCurrAsString()
    {
        return cashDistribCurr.getStringWithoutLengthAscii(cashDistribCurrOffset, cashDistribCurrLength);
    }

    public DistribInstsGroupEncoder cashDistribCurr(final CharSequence value)
    {
        toBytes(value, cashDistribCurr);
        cashDistribCurrOffset = 0;
        cashDistribCurrLength = value.length();
        return this;
    }

    public DistribInstsGroupEncoder cashDistribCurr(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            cashDistribCurr.wrap(buffer);
            cashDistribCurrOffset = value.offset();
            cashDistribCurrLength = value.length();
        }
        return this;
    }

    public DistribInstsGroupEncoder cashDistribCurr(final char[] value)
    {
        return cashDistribCurr(value, 0, value.length);
    }

    public DistribInstsGroupEncoder cashDistribCurr(final char[] value, final int length)
    {
        return cashDistribCurr(value, 0, length);
    }

    public DistribInstsGroupEncoder cashDistribCurr(final char[] value, final int offset, final int length)
    {
        toBytes(value, cashDistribCurr, offset, length);
        cashDistribCurrOffset = 0;
        cashDistribCurrLength = length;
        return this;
    }

    private final MutableDirectBuffer cashDistribAgentName = new UnsafeBuffer();

    private int cashDistribAgentNameOffset = 0;

    private int cashDistribAgentNameLength = 0;

    public DistribInstsGroupEncoder cashDistribAgentName(final DirectBuffer value, final int offset, final int length)
    {
        cashDistribAgentName.wrap(value);
        cashDistribAgentNameOffset = offset;
        cashDistribAgentNameLength = length;
        return this;
    }

    public DistribInstsGroupEncoder cashDistribAgentName(final DirectBuffer value, final int length)
    {
        return cashDistribAgentName(value, 0, length);
    }

    public DistribInstsGroupEncoder cashDistribAgentName(final DirectBuffer value)
    {
        return cashDistribAgentName(value, 0, value.capacity());
    }

    public DistribInstsGroupEncoder cashDistribAgentName(final byte[] value, final int offset, final int length)
    {
        cashDistribAgentName.wrap(value);
        cashDistribAgentNameOffset = offset;
        cashDistribAgentNameLength = length;
        return this;
    }

    public DistribInstsGroupEncoder cashDistribAgentNameAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(cashDistribAgentName, value, offset, length);
        cashDistribAgentNameOffset = offset;
        cashDistribAgentNameLength = length;
        return this;
    }

    public DistribInstsGroupEncoder cashDistribAgentName(final byte[] value, final int length)
    {
        return cashDistribAgentName(value, 0, length);
    }

    public DistribInstsGroupEncoder cashDistribAgentName(final byte[] value)
    {
        return cashDistribAgentName(value, 0, value.length);
    }

    public boolean hasCashDistribAgentName()
    {
        return cashDistribAgentNameLength > 0;
    }

    public MutableDirectBuffer cashDistribAgentName()
    {
        return cashDistribAgentName;
    }

    public String cashDistribAgentNameAsString()
    {
        return cashDistribAgentName.getStringWithoutLengthAscii(cashDistribAgentNameOffset, cashDistribAgentNameLength);
    }

    public DistribInstsGroupEncoder cashDistribAgentName(final CharSequence value)
    {
        toBytes(value, cashDistribAgentName);
        cashDistribAgentNameOffset = 0;
        cashDistribAgentNameLength = value.length();
        return this;
    }

    public DistribInstsGroupEncoder cashDistribAgentName(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            cashDistribAgentName.wrap(buffer);
            cashDistribAgentNameOffset = value.offset();
            cashDistribAgentNameLength = value.length();
        }
        return this;
    }

    public DistribInstsGroupEncoder cashDistribAgentName(final char[] value)
    {
        return cashDistribAgentName(value, 0, value.length);
    }

    public DistribInstsGroupEncoder cashDistribAgentName(final char[] value, final int length)
    {
        return cashDistribAgentName(value, 0, length);
    }

    public DistribInstsGroupEncoder cashDistribAgentName(final char[] value, final int offset, final int length)
    {
        toBytes(value, cashDistribAgentName, offset, length);
        cashDistribAgentNameOffset = 0;
        cashDistribAgentNameLength = length;
        return this;
    }

    private final MutableDirectBuffer cashDistribAgentCode = new UnsafeBuffer();

    private int cashDistribAgentCodeOffset = 0;

    private int cashDistribAgentCodeLength = 0;

    public DistribInstsGroupEncoder cashDistribAgentCode(final DirectBuffer value, final int offset, final int length)
    {
        cashDistribAgentCode.wrap(value);
        cashDistribAgentCodeOffset = offset;
        cashDistribAgentCodeLength = length;
        return this;
    }

    public DistribInstsGroupEncoder cashDistribAgentCode(final DirectBuffer value, final int length)
    {
        return cashDistribAgentCode(value, 0, length);
    }

    public DistribInstsGroupEncoder cashDistribAgentCode(final DirectBuffer value)
    {
        return cashDistribAgentCode(value, 0, value.capacity());
    }

    public DistribInstsGroupEncoder cashDistribAgentCode(final byte[] value, final int offset, final int length)
    {
        cashDistribAgentCode.wrap(value);
        cashDistribAgentCodeOffset = offset;
        cashDistribAgentCodeLength = length;
        return this;
    }

    public DistribInstsGroupEncoder cashDistribAgentCodeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(cashDistribAgentCode, value, offset, length);
        cashDistribAgentCodeOffset = offset;
        cashDistribAgentCodeLength = length;
        return this;
    }

    public DistribInstsGroupEncoder cashDistribAgentCode(final byte[] value, final int length)
    {
        return cashDistribAgentCode(value, 0, length);
    }

    public DistribInstsGroupEncoder cashDistribAgentCode(final byte[] value)
    {
        return cashDistribAgentCode(value, 0, value.length);
    }

    public boolean hasCashDistribAgentCode()
    {
        return cashDistribAgentCodeLength > 0;
    }

    public MutableDirectBuffer cashDistribAgentCode()
    {
        return cashDistribAgentCode;
    }

    public String cashDistribAgentCodeAsString()
    {
        return cashDistribAgentCode.getStringWithoutLengthAscii(cashDistribAgentCodeOffset, cashDistribAgentCodeLength);
    }

    public DistribInstsGroupEncoder cashDistribAgentCode(final CharSequence value)
    {
        toBytes(value, cashDistribAgentCode);
        cashDistribAgentCodeOffset = 0;
        cashDistribAgentCodeLength = value.length();
        return this;
    }

    public DistribInstsGroupEncoder cashDistribAgentCode(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            cashDistribAgentCode.wrap(buffer);
            cashDistribAgentCodeOffset = value.offset();
            cashDistribAgentCodeLength = value.length();
        }
        return this;
    }

    public DistribInstsGroupEncoder cashDistribAgentCode(final char[] value)
    {
        return cashDistribAgentCode(value, 0, value.length);
    }

    public DistribInstsGroupEncoder cashDistribAgentCode(final char[] value, final int length)
    {
        return cashDistribAgentCode(value, 0, length);
    }

    public DistribInstsGroupEncoder cashDistribAgentCode(final char[] value, final int offset, final int length)
    {
        toBytes(value, cashDistribAgentCode, offset, length);
        cashDistribAgentCodeOffset = 0;
        cashDistribAgentCodeLength = length;
        return this;
    }

    private final MutableDirectBuffer cashDistribAgentAcctNumber = new UnsafeBuffer();

    private int cashDistribAgentAcctNumberOffset = 0;

    private int cashDistribAgentAcctNumberLength = 0;

    public DistribInstsGroupEncoder cashDistribAgentAcctNumber(final DirectBuffer value, final int offset, final int length)
    {
        cashDistribAgentAcctNumber.wrap(value);
        cashDistribAgentAcctNumberOffset = offset;
        cashDistribAgentAcctNumberLength = length;
        return this;
    }

    public DistribInstsGroupEncoder cashDistribAgentAcctNumber(final DirectBuffer value, final int length)
    {
        return cashDistribAgentAcctNumber(value, 0, length);
    }

    public DistribInstsGroupEncoder cashDistribAgentAcctNumber(final DirectBuffer value)
    {
        return cashDistribAgentAcctNumber(value, 0, value.capacity());
    }

    public DistribInstsGroupEncoder cashDistribAgentAcctNumber(final byte[] value, final int offset, final int length)
    {
        cashDistribAgentAcctNumber.wrap(value);
        cashDistribAgentAcctNumberOffset = offset;
        cashDistribAgentAcctNumberLength = length;
        return this;
    }

    public DistribInstsGroupEncoder cashDistribAgentAcctNumberAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(cashDistribAgentAcctNumber, value, offset, length);
        cashDistribAgentAcctNumberOffset = offset;
        cashDistribAgentAcctNumberLength = length;
        return this;
    }

    public DistribInstsGroupEncoder cashDistribAgentAcctNumber(final byte[] value, final int length)
    {
        return cashDistribAgentAcctNumber(value, 0, length);
    }

    public DistribInstsGroupEncoder cashDistribAgentAcctNumber(final byte[] value)
    {
        return cashDistribAgentAcctNumber(value, 0, value.length);
    }

    public boolean hasCashDistribAgentAcctNumber()
    {
        return cashDistribAgentAcctNumberLength > 0;
    }

    public MutableDirectBuffer cashDistribAgentAcctNumber()
    {
        return cashDistribAgentAcctNumber;
    }

    public String cashDistribAgentAcctNumberAsString()
    {
        return cashDistribAgentAcctNumber.getStringWithoutLengthAscii(cashDistribAgentAcctNumberOffset, cashDistribAgentAcctNumberLength);
    }

    public DistribInstsGroupEncoder cashDistribAgentAcctNumber(final CharSequence value)
    {
        toBytes(value, cashDistribAgentAcctNumber);
        cashDistribAgentAcctNumberOffset = 0;
        cashDistribAgentAcctNumberLength = value.length();
        return this;
    }

    public DistribInstsGroupEncoder cashDistribAgentAcctNumber(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            cashDistribAgentAcctNumber.wrap(buffer);
            cashDistribAgentAcctNumberOffset = value.offset();
            cashDistribAgentAcctNumberLength = value.length();
        }
        return this;
    }

    public DistribInstsGroupEncoder cashDistribAgentAcctNumber(final char[] value)
    {
        return cashDistribAgentAcctNumber(value, 0, value.length);
    }

    public DistribInstsGroupEncoder cashDistribAgentAcctNumber(final char[] value, final int length)
    {
        return cashDistribAgentAcctNumber(value, 0, length);
    }

    public DistribInstsGroupEncoder cashDistribAgentAcctNumber(final char[] value, final int offset, final int length)
    {
        toBytes(value, cashDistribAgentAcctNumber, offset, length);
        cashDistribAgentAcctNumberOffset = 0;
        cashDistribAgentAcctNumberLength = length;
        return this;
    }

    private final MutableDirectBuffer cashDistribPayRef = new UnsafeBuffer();

    private int cashDistribPayRefOffset = 0;

    private int cashDistribPayRefLength = 0;

    public DistribInstsGroupEncoder cashDistribPayRef(final DirectBuffer value, final int offset, final int length)
    {
        cashDistribPayRef.wrap(value);
        cashDistribPayRefOffset = offset;
        cashDistribPayRefLength = length;
        return this;
    }

    public DistribInstsGroupEncoder cashDistribPayRef(final DirectBuffer value, final int length)
    {
        return cashDistribPayRef(value, 0, length);
    }

    public DistribInstsGroupEncoder cashDistribPayRef(final DirectBuffer value)
    {
        return cashDistribPayRef(value, 0, value.capacity());
    }

    public DistribInstsGroupEncoder cashDistribPayRef(final byte[] value, final int offset, final int length)
    {
        cashDistribPayRef.wrap(value);
        cashDistribPayRefOffset = offset;
        cashDistribPayRefLength = length;
        return this;
    }

    public DistribInstsGroupEncoder cashDistribPayRefAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(cashDistribPayRef, value, offset, length);
        cashDistribPayRefOffset = offset;
        cashDistribPayRefLength = length;
        return this;
    }

    public DistribInstsGroupEncoder cashDistribPayRef(final byte[] value, final int length)
    {
        return cashDistribPayRef(value, 0, length);
    }

    public DistribInstsGroupEncoder cashDistribPayRef(final byte[] value)
    {
        return cashDistribPayRef(value, 0, value.length);
    }

    public boolean hasCashDistribPayRef()
    {
        return cashDistribPayRefLength > 0;
    }

    public MutableDirectBuffer cashDistribPayRef()
    {
        return cashDistribPayRef;
    }

    public String cashDistribPayRefAsString()
    {
        return cashDistribPayRef.getStringWithoutLengthAscii(cashDistribPayRefOffset, cashDistribPayRefLength);
    }

    public DistribInstsGroupEncoder cashDistribPayRef(final CharSequence value)
    {
        toBytes(value, cashDistribPayRef);
        cashDistribPayRefOffset = 0;
        cashDistribPayRefLength = value.length();
        return this;
    }

    public DistribInstsGroupEncoder cashDistribPayRef(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            cashDistribPayRef.wrap(buffer);
            cashDistribPayRefOffset = value.offset();
            cashDistribPayRefLength = value.length();
        }
        return this;
    }

    public DistribInstsGroupEncoder cashDistribPayRef(final char[] value)
    {
        return cashDistribPayRef(value, 0, value.length);
    }

    public DistribInstsGroupEncoder cashDistribPayRef(final char[] value, final int length)
    {
        return cashDistribPayRef(value, 0, length);
    }

    public DistribInstsGroupEncoder cashDistribPayRef(final char[] value, final int offset, final int length)
    {
        toBytes(value, cashDistribPayRef, offset, length);
        cashDistribPayRefOffset = 0;
        cashDistribPayRefLength = length;
        return this;
    }

    private final MutableDirectBuffer cashDistribAgentAcctName = new UnsafeBuffer();

    private int cashDistribAgentAcctNameOffset = 0;

    private int cashDistribAgentAcctNameLength = 0;

    public DistribInstsGroupEncoder cashDistribAgentAcctName(final DirectBuffer value, final int offset, final int length)
    {
        cashDistribAgentAcctName.wrap(value);
        cashDistribAgentAcctNameOffset = offset;
        cashDistribAgentAcctNameLength = length;
        return this;
    }

    public DistribInstsGroupEncoder cashDistribAgentAcctName(final DirectBuffer value, final int length)
    {
        return cashDistribAgentAcctName(value, 0, length);
    }

    public DistribInstsGroupEncoder cashDistribAgentAcctName(final DirectBuffer value)
    {
        return cashDistribAgentAcctName(value, 0, value.capacity());
    }

    public DistribInstsGroupEncoder cashDistribAgentAcctName(final byte[] value, final int offset, final int length)
    {
        cashDistribAgentAcctName.wrap(value);
        cashDistribAgentAcctNameOffset = offset;
        cashDistribAgentAcctNameLength = length;
        return this;
    }

    public DistribInstsGroupEncoder cashDistribAgentAcctNameAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(cashDistribAgentAcctName, value, offset, length);
        cashDistribAgentAcctNameOffset = offset;
        cashDistribAgentAcctNameLength = length;
        return this;
    }

    public DistribInstsGroupEncoder cashDistribAgentAcctName(final byte[] value, final int length)
    {
        return cashDistribAgentAcctName(value, 0, length);
    }

    public DistribInstsGroupEncoder cashDistribAgentAcctName(final byte[] value)
    {
        return cashDistribAgentAcctName(value, 0, value.length);
    }

    public boolean hasCashDistribAgentAcctName()
    {
        return cashDistribAgentAcctNameLength > 0;
    }

    public MutableDirectBuffer cashDistribAgentAcctName()
    {
        return cashDistribAgentAcctName;
    }

    public String cashDistribAgentAcctNameAsString()
    {
        return cashDistribAgentAcctName.getStringWithoutLengthAscii(cashDistribAgentAcctNameOffset, cashDistribAgentAcctNameLength);
    }

    public DistribInstsGroupEncoder cashDistribAgentAcctName(final CharSequence value)
    {
        toBytes(value, cashDistribAgentAcctName);
        cashDistribAgentAcctNameOffset = 0;
        cashDistribAgentAcctNameLength = value.length();
        return this;
    }

    public DistribInstsGroupEncoder cashDistribAgentAcctName(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            cashDistribAgentAcctName.wrap(buffer);
            cashDistribAgentAcctNameOffset = value.offset();
            cashDistribAgentAcctNameLength = value.length();
        }
        return this;
    }

    public DistribInstsGroupEncoder cashDistribAgentAcctName(final char[] value)
    {
        return cashDistribAgentAcctName(value, 0, value.length);
    }

    public DistribInstsGroupEncoder cashDistribAgentAcctName(final char[] value, final int length)
    {
        return cashDistribAgentAcctName(value, 0, length);
    }

    public DistribInstsGroupEncoder cashDistribAgentAcctName(final char[] value, final int offset, final int length)
    {
        toBytes(value, cashDistribAgentAcctName, offset, length);
        cashDistribAgentAcctNameOffset = 0;
        cashDistribAgentAcctNameLength = length;
        return this;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (hasDistribPaymentMethod)
        {
            buffer.putBytes(position, distribPaymentMethodHeader, 0, distribPaymentMethodHeaderLength);
            position += distribPaymentMethodHeaderLength;
            position += buffer.putIntAscii(position, distribPaymentMethod);
            buffer.putSeparator(position);
            position++;
        }

        if (hasDistribPercentage)
        {
            buffer.putBytes(position, distribPercentageHeader, 0, distribPercentageHeaderLength);
            position += distribPercentageHeaderLength;
            position += buffer.putFloatAscii(position, distribPercentage);
            buffer.putSeparator(position);
            position++;
        }

        if (cashDistribCurrLength > 0)
        {
            buffer.putBytes(position, cashDistribCurrHeader, 0, cashDistribCurrHeaderLength);
            position += cashDistribCurrHeaderLength;
            buffer.putBytes(position, cashDistribCurr, cashDistribCurrOffset, cashDistribCurrLength);
            position += cashDistribCurrLength;
            buffer.putSeparator(position);
            position++;
        }

        if (cashDistribAgentNameLength > 0)
        {
            buffer.putBytes(position, cashDistribAgentNameHeader, 0, cashDistribAgentNameHeaderLength);
            position += cashDistribAgentNameHeaderLength;
            buffer.putBytes(position, cashDistribAgentName, cashDistribAgentNameOffset, cashDistribAgentNameLength);
            position += cashDistribAgentNameLength;
            buffer.putSeparator(position);
            position++;
        }

        if (cashDistribAgentCodeLength > 0)
        {
            buffer.putBytes(position, cashDistribAgentCodeHeader, 0, cashDistribAgentCodeHeaderLength);
            position += cashDistribAgentCodeHeaderLength;
            buffer.putBytes(position, cashDistribAgentCode, cashDistribAgentCodeOffset, cashDistribAgentCodeLength);
            position += cashDistribAgentCodeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (cashDistribAgentAcctNumberLength > 0)
        {
            buffer.putBytes(position, cashDistribAgentAcctNumberHeader, 0, cashDistribAgentAcctNumberHeaderLength);
            position += cashDistribAgentAcctNumberHeaderLength;
            buffer.putBytes(position, cashDistribAgentAcctNumber, cashDistribAgentAcctNumberOffset, cashDistribAgentAcctNumberLength);
            position += cashDistribAgentAcctNumberLength;
            buffer.putSeparator(position);
            position++;
        }

        if (cashDistribPayRefLength > 0)
        {
            buffer.putBytes(position, cashDistribPayRefHeader, 0, cashDistribPayRefHeaderLength);
            position += cashDistribPayRefHeaderLength;
            buffer.putBytes(position, cashDistribPayRef, cashDistribPayRefOffset, cashDistribPayRefLength);
            position += cashDistribPayRefLength;
            buffer.putSeparator(position);
            position++;
        }

        if (cashDistribAgentAcctNameLength > 0)
        {
            buffer.putBytes(position, cashDistribAgentAcctNameHeader, 0, cashDistribAgentAcctNameHeaderLength);
            position += cashDistribAgentAcctNameHeaderLength;
            buffer.putBytes(position, cashDistribAgentAcctName, cashDistribAgentAcctNameOffset, cashDistribAgentAcctNameLength);
            position += cashDistribAgentAcctNameLength;
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
        this.resetDistribPaymentMethod();
        this.resetDistribPercentage();
        this.resetCashDistribCurr();
        this.resetCashDistribAgentName();
        this.resetCashDistribAgentCode();
        this.resetCashDistribAgentAcctNumber();
        this.resetCashDistribPayRef();
        this.resetCashDistribAgentAcctName();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetDistribPaymentMethod()
    {
        hasDistribPaymentMethod = false;
    }

    public void resetDistribPercentage()
    {
        hasDistribPercentage = false;
    }

    public void resetCashDistribCurr()
    {
        cashDistribCurrLength = 0;
    }

    public void resetCashDistribAgentName()
    {
        cashDistribAgentNameLength = 0;
    }

    public void resetCashDistribAgentCode()
    {
        cashDistribAgentCodeLength = 0;
    }

    public void resetCashDistribAgentAcctNumber()
    {
        cashDistribAgentAcctNumberLength = 0;
    }

    public void resetCashDistribPayRef()
    {
        cashDistribPayRefLength = 0;
    }

    public void resetCashDistribAgentAcctName()
    {
        cashDistribAgentAcctNameLength = 0;
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
        builder.append("\"MessageName\": \"DistribInstsGroup\",\n");
        if (hasDistribPaymentMethod())
        {
            indent(builder, level);
            builder.append("\"DistribPaymentMethod\": \"");
            builder.append(distribPaymentMethod);
            builder.append("\",\n");
        }

        if (hasDistribPercentage())
        {
            indent(builder, level);
            builder.append("\"DistribPercentage\": \"");
            distribPercentage.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasCashDistribCurr())
        {
            indent(builder, level);
            builder.append("\"CashDistribCurr\": \"");
            appendBuffer(builder, cashDistribCurr, cashDistribCurrOffset, cashDistribCurrLength);
            builder.append("\",\n");
        }

        if (hasCashDistribAgentName())
        {
            indent(builder, level);
            builder.append("\"CashDistribAgentName\": \"");
            appendBuffer(builder, cashDistribAgentName, cashDistribAgentNameOffset, cashDistribAgentNameLength);
            builder.append("\",\n");
        }

        if (hasCashDistribAgentCode())
        {
            indent(builder, level);
            builder.append("\"CashDistribAgentCode\": \"");
            appendBuffer(builder, cashDistribAgentCode, cashDistribAgentCodeOffset, cashDistribAgentCodeLength);
            builder.append("\",\n");
        }

        if (hasCashDistribAgentAcctNumber())
        {
            indent(builder, level);
            builder.append("\"CashDistribAgentAcctNumber\": \"");
            appendBuffer(builder, cashDistribAgentAcctNumber, cashDistribAgentAcctNumberOffset, cashDistribAgentAcctNumberLength);
            builder.append("\",\n");
        }

        if (hasCashDistribPayRef())
        {
            indent(builder, level);
            builder.append("\"CashDistribPayRef\": \"");
            appendBuffer(builder, cashDistribPayRef, cashDistribPayRefOffset, cashDistribPayRefLength);
            builder.append("\",\n");
        }

        if (hasCashDistribAgentAcctName())
        {
            indent(builder, level);
            builder.append("\"CashDistribAgentAcctName\": \"");
            appendBuffer(builder, cashDistribAgentAcctName, cashDistribAgentAcctNameOffset, cashDistribAgentAcctNameLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public DistribInstsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((DistribInstsGroupEncoder)encoder);
    }

    public DistribInstsGroupEncoder copyTo(final DistribInstsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasDistribPaymentMethod())
        {
            encoder.distribPaymentMethod(this.distribPaymentMethod());
        }

        if (hasDistribPercentage())
        {
            encoder.distribPercentage(this.distribPercentage());
        }

        if (hasCashDistribCurr())
        {
            encoder.cashDistribCurrAsCopy(cashDistribCurr.byteArray(), 0, cashDistribCurrLength);
        }

        if (hasCashDistribAgentName())
        {
            encoder.cashDistribAgentNameAsCopy(cashDistribAgentName.byteArray(), 0, cashDistribAgentNameLength);
        }

        if (hasCashDistribAgentCode())
        {
            encoder.cashDistribAgentCodeAsCopy(cashDistribAgentCode.byteArray(), 0, cashDistribAgentCodeLength);
        }

        if (hasCashDistribAgentAcctNumber())
        {
            encoder.cashDistribAgentAcctNumberAsCopy(cashDistribAgentAcctNumber.byteArray(), 0, cashDistribAgentAcctNumberLength);
        }

        if (hasCashDistribPayRef())
        {
            encoder.cashDistribPayRefAsCopy(cashDistribPayRef.byteArray(), 0, cashDistribPayRefLength);
        }

        if (hasCashDistribAgentAcctName())
        {
            encoder.cashDistribAgentAcctNameAsCopy(cashDistribAgentAcctName.byteArray(), 0, cashDistribAgentAcctNameLength);
        }
        return encoder;
    }

}
    private int noDistribInstsGroupCounter;

    private boolean hasNoDistribInstsGroupCounter;

    public boolean hasNoDistribInstsGroupCounter()
    {
        return hasNoDistribInstsGroupCounter;
    }

    public RgstDistInstGrpEncoder noDistribInstsGroupCounter(int value)
    {
        noDistribInstsGroupCounter = value;
        hasNoDistribInstsGroupCounter = true;
        return this;
    }

    public int noDistribInstsGroupCounter()
    {
        return noDistribInstsGroupCounter;
    }


    private DistribInstsGroupEncoder distribInstsGroup = null;

    public DistribInstsGroupEncoder distribInstsGroup(final int numberOfElements)
    {
        hasNoDistribInstsGroupCounter = true;
        noDistribInstsGroupCounter = numberOfElements;
        if (distribInstsGroup == null)
        {
            distribInstsGroup = new DistribInstsGroupEncoder();
        }
        return distribInstsGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoDistribInstsGroupCounter)
        {
            buffer.putBytes(position, noDistribInstsGroupCounterHeader, 0, noDistribInstsGroupCounterHeaderLength);
            position += noDistribInstsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noDistribInstsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (distribInstsGroup != null)
        {
            position += distribInstsGroup.encode(buffer, position, noDistribInstsGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetDistribInstsGroup();
    }

    public void resetDistribInstsGroup()
    {
        if (distribInstsGroup != null)
        {
            distribInstsGroup.reset();
        }
        noDistribInstsGroupCounter = 0;
        hasNoDistribInstsGroupCounter = false;
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
        builder.append("\"MessageName\": \"RgstDistInstGrp\",\n");
        if (hasNoDistribInstsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"DistribInstsGroup\": [\n");
            final int noDistribInstsGroupCounter = this.noDistribInstsGroupCounter;
            DistribInstsGroupEncoder distribInstsGroup = this.distribInstsGroup;
            for (int i = 0; i < noDistribInstsGroupCounter; i++)
            {
                indent(builder, level);
                distribInstsGroup.appendTo(builder, level + 1);
                if (i < (noDistribInstsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                distribInstsGroup = distribInstsGroup.next();
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
    public RgstDistInstGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((RgstDistInstGrpEncoder)encoder);
    }

    public RgstDistInstGrpEncoder copyTo(final RgstDistInstGrpEncoder encoder)
    {
        encoder.reset();
        if (hasNoDistribInstsGroupCounter)
        {
            final int size = this.noDistribInstsGroupCounter;
            DistribInstsGroupEncoder distribInstsGroup = this.distribInstsGroup;
            DistribInstsGroupEncoder distribInstsGroupEncoder = encoder.distribInstsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (distribInstsGroup != null)
                {
                    distribInstsGroup.copyTo(distribInstsGroupEncoder);
                    distribInstsGroup = distribInstsGroup.next();
                    distribInstsGroupEncoder = distribInstsGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
