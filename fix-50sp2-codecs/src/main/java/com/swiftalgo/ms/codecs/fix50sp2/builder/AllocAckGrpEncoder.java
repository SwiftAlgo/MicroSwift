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


public class AllocAckGrpEncoder
{
    private static final int noAllocsGroupCounterHeaderLength = 3;
    private static final byte[] noAllocsGroupCounterHeader = new byte[] {55, 56, (byte) '='};



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

    private static final int allocPositionEffectHeaderLength = 5;
    private static final byte[] allocPositionEffectHeader = new byte[] {49, 48, 52, 55, (byte) '='};

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

    private static final int secondaryIndividualAllocIDHeaderLength = 4;
    private static final byte[] secondaryIndividualAllocIDHeader = new byte[] {57, 56, 57, (byte) '='};

    private static final int allocCustomerCapacityHeaderLength = 4;
    private static final byte[] allocCustomerCapacityHeader = new byte[] {57, 57, 51, (byte) '='};

    private static final int individualAllocTypeHeaderLength = 4;
    private static final byte[] individualAllocTypeHeader = new byte[] {57, 57, 50, (byte) '='};

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

    private char allocPositionEffect;

    private boolean hasAllocPositionEffect;

    public boolean hasAllocPositionEffect()
    {
        return hasAllocPositionEffect;
    }

    public AllocsGroupEncoder allocPositionEffect(char value)
    {
        allocPositionEffect = value;
        hasAllocPositionEffect = true;
        return this;
    }

    public char allocPositionEffect()
    {
        return allocPositionEffect;
    }

    public AllocsGroupEncoder allocPositionEffect(AllocPositionEffect value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == AllocPositionEffect.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: allocPositionEffect Value: " + value );
            }
            if (value == AllocPositionEffect.NULL_VAL)
            {
                return this;
            }
        }
        return allocPositionEffect(value.representation());
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

    private final NestedPartiesEncoder nestedParties = new NestedPartiesEncoder();
    public NestedPartiesEncoder nestedParties()
    {
        return nestedParties;
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

    private final MutableDirectBuffer secondaryIndividualAllocID = new UnsafeBuffer();

    private int secondaryIndividualAllocIDOffset = 0;

    private int secondaryIndividualAllocIDLength = 0;

    public AllocsGroupEncoder secondaryIndividualAllocID(final DirectBuffer value, final int offset, final int length)
    {
        secondaryIndividualAllocID.wrap(value);
        secondaryIndividualAllocIDOffset = offset;
        secondaryIndividualAllocIDLength = length;
        return this;
    }

    public AllocsGroupEncoder secondaryIndividualAllocID(final DirectBuffer value, final int length)
    {
        return secondaryIndividualAllocID(value, 0, length);
    }

    public AllocsGroupEncoder secondaryIndividualAllocID(final DirectBuffer value)
    {
        return secondaryIndividualAllocID(value, 0, value.capacity());
    }

    public AllocsGroupEncoder secondaryIndividualAllocID(final byte[] value, final int offset, final int length)
    {
        secondaryIndividualAllocID.wrap(value);
        secondaryIndividualAllocIDOffset = offset;
        secondaryIndividualAllocIDLength = length;
        return this;
    }

    public AllocsGroupEncoder secondaryIndividualAllocIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(secondaryIndividualAllocID, value, offset, length);
        secondaryIndividualAllocIDOffset = offset;
        secondaryIndividualAllocIDLength = length;
        return this;
    }

    public AllocsGroupEncoder secondaryIndividualAllocID(final byte[] value, final int length)
    {
        return secondaryIndividualAllocID(value, 0, length);
    }

    public AllocsGroupEncoder secondaryIndividualAllocID(final byte[] value)
    {
        return secondaryIndividualAllocID(value, 0, value.length);
    }

    public boolean hasSecondaryIndividualAllocID()
    {
        return secondaryIndividualAllocIDLength > 0;
    }

    public MutableDirectBuffer secondaryIndividualAllocID()
    {
        return secondaryIndividualAllocID;
    }

    public String secondaryIndividualAllocIDAsString()
    {
        return secondaryIndividualAllocID.getStringWithoutLengthAscii(secondaryIndividualAllocIDOffset, secondaryIndividualAllocIDLength);
    }

    public AllocsGroupEncoder secondaryIndividualAllocID(final CharSequence value)
    {
        toBytes(value, secondaryIndividualAllocID);
        secondaryIndividualAllocIDOffset = 0;
        secondaryIndividualAllocIDLength = value.length();
        return this;
    }

    public AllocsGroupEncoder secondaryIndividualAllocID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            secondaryIndividualAllocID.wrap(buffer);
            secondaryIndividualAllocIDOffset = value.offset();
            secondaryIndividualAllocIDLength = value.length();
        }
        return this;
    }

    public AllocsGroupEncoder secondaryIndividualAllocID(final char[] value)
    {
        return secondaryIndividualAllocID(value, 0, value.length);
    }

    public AllocsGroupEncoder secondaryIndividualAllocID(final char[] value, final int length)
    {
        return secondaryIndividualAllocID(value, 0, length);
    }

    public AllocsGroupEncoder secondaryIndividualAllocID(final char[] value, final int offset, final int length)
    {
        toBytes(value, secondaryIndividualAllocID, offset, length);
        secondaryIndividualAllocIDOffset = 0;
        secondaryIndividualAllocIDLength = length;
        return this;
    }

    private final MutableDirectBuffer allocCustomerCapacity = new UnsafeBuffer();

    private int allocCustomerCapacityOffset = 0;

    private int allocCustomerCapacityLength = 0;

    public AllocsGroupEncoder allocCustomerCapacity(final DirectBuffer value, final int offset, final int length)
    {
        allocCustomerCapacity.wrap(value);
        allocCustomerCapacityOffset = offset;
        allocCustomerCapacityLength = length;
        return this;
    }

    public AllocsGroupEncoder allocCustomerCapacity(final DirectBuffer value, final int length)
    {
        return allocCustomerCapacity(value, 0, length);
    }

    public AllocsGroupEncoder allocCustomerCapacity(final DirectBuffer value)
    {
        return allocCustomerCapacity(value, 0, value.capacity());
    }

    public AllocsGroupEncoder allocCustomerCapacity(final byte[] value, final int offset, final int length)
    {
        allocCustomerCapacity.wrap(value);
        allocCustomerCapacityOffset = offset;
        allocCustomerCapacityLength = length;
        return this;
    }

    public AllocsGroupEncoder allocCustomerCapacityAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(allocCustomerCapacity, value, offset, length);
        allocCustomerCapacityOffset = offset;
        allocCustomerCapacityLength = length;
        return this;
    }

    public AllocsGroupEncoder allocCustomerCapacity(final byte[] value, final int length)
    {
        return allocCustomerCapacity(value, 0, length);
    }

    public AllocsGroupEncoder allocCustomerCapacity(final byte[] value)
    {
        return allocCustomerCapacity(value, 0, value.length);
    }

    public boolean hasAllocCustomerCapacity()
    {
        return allocCustomerCapacityLength > 0;
    }

    public MutableDirectBuffer allocCustomerCapacity()
    {
        return allocCustomerCapacity;
    }

    public String allocCustomerCapacityAsString()
    {
        return allocCustomerCapacity.getStringWithoutLengthAscii(allocCustomerCapacityOffset, allocCustomerCapacityLength);
    }

    public AllocsGroupEncoder allocCustomerCapacity(final CharSequence value)
    {
        toBytes(value, allocCustomerCapacity);
        allocCustomerCapacityOffset = 0;
        allocCustomerCapacityLength = value.length();
        return this;
    }

    public AllocsGroupEncoder allocCustomerCapacity(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            allocCustomerCapacity.wrap(buffer);
            allocCustomerCapacityOffset = value.offset();
            allocCustomerCapacityLength = value.length();
        }
        return this;
    }

    public AllocsGroupEncoder allocCustomerCapacity(final char[] value)
    {
        return allocCustomerCapacity(value, 0, value.length);
    }

    public AllocsGroupEncoder allocCustomerCapacity(final char[] value, final int length)
    {
        return allocCustomerCapacity(value, 0, length);
    }

    public AllocsGroupEncoder allocCustomerCapacity(final char[] value, final int offset, final int length)
    {
        toBytes(value, allocCustomerCapacity, offset, length);
        allocCustomerCapacityOffset = 0;
        allocCustomerCapacityLength = length;
        return this;
    }

    private int individualAllocType;

    private boolean hasIndividualAllocType;

    public boolean hasIndividualAllocType()
    {
        return hasIndividualAllocType;
    }

    public AllocsGroupEncoder individualAllocType(int value)
    {
        individualAllocType = value;
        hasIndividualAllocType = true;
        return this;
    }

    public int individualAllocType()
    {
        return individualAllocType;
    }

    public AllocsGroupEncoder individualAllocType(IndividualAllocType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == IndividualAllocType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: individualAllocType Value: " + value );
            }
            if (value == IndividualAllocType.NULL_VAL)
            {
                return this;
            }
        }
        return individualAllocType(value.representation());
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

        if (hasAllocPrice)
        {
            buffer.putBytes(position, allocPriceHeader, 0, allocPriceHeaderLength);
            position += allocPriceHeaderLength;
            position += buffer.putFloatAscii(position, allocPrice);
            buffer.putSeparator(position);
            position++;
        }

        if (hasAllocPositionEffect)
        {
            buffer.putBytes(position, allocPositionEffectHeader, 0, allocPositionEffectHeaderLength);
            position += allocPositionEffectHeaderLength;
            position += buffer.putCharAscii(position, allocPositionEffect);
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

            position += nestedParties.encode(buffer, position);

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

        if (secondaryIndividualAllocIDLength > 0)
        {
            buffer.putBytes(position, secondaryIndividualAllocIDHeader, 0, secondaryIndividualAllocIDHeaderLength);
            position += secondaryIndividualAllocIDHeaderLength;
            buffer.putBytes(position, secondaryIndividualAllocID, secondaryIndividualAllocIDOffset, secondaryIndividualAllocIDLength);
            position += secondaryIndividualAllocIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (allocCustomerCapacityLength > 0)
        {
            buffer.putBytes(position, allocCustomerCapacityHeader, 0, allocCustomerCapacityHeaderLength);
            position += allocCustomerCapacityHeaderLength;
            buffer.putBytes(position, allocCustomerCapacity, allocCustomerCapacityOffset, allocCustomerCapacityLength);
            position += allocCustomerCapacityLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasIndividualAllocType)
        {
            buffer.putBytes(position, individualAllocTypeHeader, 0, individualAllocTypeHeaderLength);
            position += individualAllocTypeHeaderLength;
            position += buffer.putIntAscii(position, individualAllocType);
            buffer.putSeparator(position);
            position++;
        }

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
        this.resetAllocPrice();
        this.resetAllocPositionEffect();
        this.resetIndividualAllocID();
        this.resetIndividualAllocRejCode();
        this.resetAllocText();
        this.resetEncodedAllocTextLen();
        this.resetEncodedAllocText();
        this.resetSecondaryIndividualAllocID();
        this.resetAllocCustomerCapacity();
        this.resetIndividualAllocType();
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

    public void resetAllocPrice()
    {
        hasAllocPrice = false;
    }

    public void resetAllocPositionEffect()
    {
        hasAllocPositionEffect = false;
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

    public void resetSecondaryIndividualAllocID()
    {
        secondaryIndividualAllocIDLength = 0;
    }

    public void resetAllocCustomerCapacity()
    {
        allocCustomerCapacityLength = 0;
    }

    public void resetIndividualAllocType()
    {
        hasIndividualAllocType = false;
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

        if (hasAllocPrice())
        {
            indent(builder, level);
            builder.append("\"AllocPrice\": \"");
            allocPrice.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasAllocPositionEffect())
        {
            indent(builder, level);
            builder.append("\"AllocPositionEffect\": \"");
            builder.append(allocPositionEffect);
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

    indent(builder, level);
    builder.append("\"NestedParties\": ");
    nestedParties.appendTo(builder, level + 1);
    builder.append("\n");

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

        if (hasSecondaryIndividualAllocID())
        {
            indent(builder, level);
            builder.append("\"SecondaryIndividualAllocID\": \"");
            appendBuffer(builder, secondaryIndividualAllocID, secondaryIndividualAllocIDOffset, secondaryIndividualAllocIDLength);
            builder.append("\",\n");
        }

        if (hasAllocCustomerCapacity())
        {
            indent(builder, level);
            builder.append("\"AllocCustomerCapacity\": \"");
            appendBuffer(builder, allocCustomerCapacity, allocCustomerCapacityOffset, allocCustomerCapacityLength);
            builder.append("\",\n");
        }

        if (hasIndividualAllocType())
        {
            indent(builder, level);
            builder.append("\"IndividualAllocType\": \"");
            builder.append(individualAllocType);
            builder.append("\",\n");
        }

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

        if (hasAllocPrice())
        {
            encoder.allocPrice(this.allocPrice());
        }

        if (hasAllocPositionEffect())
        {
            encoder.allocPositionEffect(this.allocPositionEffect());
        }

        if (hasIndividualAllocID())
        {
            encoder.individualAllocIDAsCopy(individualAllocID.byteArray(), 0, individualAllocIDLength);
        }

        if (hasIndividualAllocRejCode())
        {
            encoder.individualAllocRejCode(this.individualAllocRejCode());
        }


        nestedParties.copyTo(encoder.nestedParties());
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

        if (hasSecondaryIndividualAllocID())
        {
            encoder.secondaryIndividualAllocIDAsCopy(secondaryIndividualAllocID.byteArray(), 0, secondaryIndividualAllocIDLength);
        }

        if (hasAllocCustomerCapacity())
        {
            encoder.allocCustomerCapacityAsCopy(allocCustomerCapacity.byteArray(), 0, allocCustomerCapacityLength);
        }

        if (hasIndividualAllocType())
        {
            encoder.individualAllocType(this.individualAllocType());
        }

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

    public AllocAckGrpEncoder noAllocsGroupCounter(int value)
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

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

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

        return position - offset;
    }

    public void reset()
    {
        this.resetAllocsGroup();
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
        builder.append("\"MessageName\": \"AllocAckGrp\",\n");
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
    public AllocAckGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((AllocAckGrpEncoder)encoder);
    }

    public AllocAckGrpEncoder copyTo(final AllocAckGrpEncoder encoder)
    {
        encoder.reset();
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
