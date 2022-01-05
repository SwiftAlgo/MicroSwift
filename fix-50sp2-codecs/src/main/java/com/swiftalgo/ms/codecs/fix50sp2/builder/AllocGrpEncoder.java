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


public class AllocGrpEncoder
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

    private static final int matchStatusHeaderLength = 4;
    private static final byte[] matchStatusHeader = new byte[] {53, 55, 51, (byte) '='};

    private static final int allocPriceHeaderLength = 4;
    private static final byte[] allocPriceHeader = new byte[] {51, 54, 54, (byte) '='};

    private static final int allocQtyHeaderLength = 3;
    private static final byte[] allocQtyHeader = new byte[] {56, 48, (byte) '='};

    private static final int individualAllocIDHeaderLength = 4;
    private static final byte[] individualAllocIDHeader = new byte[] {52, 54, 55, (byte) '='};

    private static final int processCodeHeaderLength = 3;
    private static final byte[] processCodeHeader = new byte[] {56, 49, (byte) '='};

    private static final int secondaryIndividualAllocIDHeaderLength = 4;
    private static final byte[] secondaryIndividualAllocIDHeader = new byte[] {57, 56, 57, (byte) '='};

    private static final int allocMethodHeaderLength = 5;
    private static final byte[] allocMethodHeader = new byte[] {49, 48, 48, 50, (byte) '='};

    private static final int allocCustomerCapacityHeaderLength = 4;
    private static final byte[] allocCustomerCapacityHeader = new byte[] {57, 57, 51, (byte) '='};

    private static final int allocPositionEffectHeaderLength = 5;
    private static final byte[] allocPositionEffectHeader = new byte[] {49, 48, 52, 55, (byte) '='};

    private static final int individualAllocTypeHeaderLength = 4;
    private static final byte[] individualAllocTypeHeader = new byte[] {57, 57, 50, (byte) '='};

    private static final int notifyBrokerOfCreditHeaderLength = 4;
    private static final byte[] notifyBrokerOfCreditHeader = new byte[] {50, 48, 56, (byte) '='};

    private static final int allocHandlInstHeaderLength = 4;
    private static final byte[] allocHandlInstHeader = new byte[] {50, 48, 57, (byte) '='};

    private static final int allocTextHeaderLength = 4;
    private static final byte[] allocTextHeader = new byte[] {49, 54, 49, (byte) '='};

    private static final int encodedAllocTextLenHeaderLength = 4;
    private static final byte[] encodedAllocTextLenHeader = new byte[] {51, 54, 48, (byte) '='};

    private static final int encodedAllocTextHeaderLength = 4;
    private static final byte[] encodedAllocTextHeader = new byte[] {51, 54, 49, (byte) '='};

    private static final int allocAvgPxHeaderLength = 4;
    private static final byte[] allocAvgPxHeader = new byte[] {49, 53, 51, (byte) '='};

    private static final int allocNetMoneyHeaderLength = 4;
    private static final byte[] allocNetMoneyHeader = new byte[] {49, 53, 52, (byte) '='};

    private static final int settlCurrAmtHeaderLength = 4;
    private static final byte[] settlCurrAmtHeader = new byte[] {49, 49, 57, (byte) '='};

    private static final int allocSettlCurrAmtHeaderLength = 4;
    private static final byte[] allocSettlCurrAmtHeader = new byte[] {55, 51, 55, (byte) '='};

    private static final int settlCurrencyHeaderLength = 4;
    private static final byte[] settlCurrencyHeader = new byte[] {49, 50, 48, (byte) '='};

    private static final int allocSettlCurrencyHeaderLength = 4;
    private static final byte[] allocSettlCurrencyHeader = new byte[] {55, 51, 54, (byte) '='};

    private static final int settlCurrFxRateHeaderLength = 4;
    private static final byte[] settlCurrFxRateHeader = new byte[] {49, 53, 53, (byte) '='};

    private static final int settlCurrFxRateCalcHeaderLength = 4;
    private static final byte[] settlCurrFxRateCalcHeader = new byte[] {49, 53, 54, (byte) '='};

    private static final int allocAccruedInterestAmtHeaderLength = 4;
    private static final byte[] allocAccruedInterestAmtHeader = new byte[] {55, 52, 50, (byte) '='};

    private static final int allocInterestAtMaturityHeaderLength = 4;
    private static final byte[] allocInterestAtMaturityHeader = new byte[] {55, 52, 49, (byte) '='};

    private static final int clearingFeeIndicatorHeaderLength = 4;
    private static final byte[] clearingFeeIndicatorHeader = new byte[] {54, 51, 53, (byte) '='};

    private static final int allocSettlInstTypeHeaderLength = 4;
    private static final byte[] allocSettlInstTypeHeader = new byte[] {55, 56, 48, (byte) '='};

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

    private char matchStatus;

    private boolean hasMatchStatus;

    public boolean hasMatchStatus()
    {
        return hasMatchStatus;
    }

    public AllocsGroupEncoder matchStatus(char value)
    {
        matchStatus = value;
        hasMatchStatus = true;
        return this;
    }

    public char matchStatus()
    {
        return matchStatus;
    }

    public AllocsGroupEncoder matchStatus(MatchStatus value)
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

    private char processCode;

    private boolean hasProcessCode;

    public boolean hasProcessCode()
    {
        return hasProcessCode;
    }

    public AllocsGroupEncoder processCode(char value)
    {
        processCode = value;
        hasProcessCode = true;
        return this;
    }

    public char processCode()
    {
        return processCode;
    }

    public AllocsGroupEncoder processCode(ProcessCode value)
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

    private int allocMethod;

    private boolean hasAllocMethod;

    public boolean hasAllocMethod()
    {
        return hasAllocMethod;
    }

    public AllocsGroupEncoder allocMethod(int value)
    {
        allocMethod = value;
        hasAllocMethod = true;
        return this;
    }

    public int allocMethod()
    {
        return allocMethod;
    }

    public AllocsGroupEncoder allocMethod(AllocMethod value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == AllocMethod.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: allocMethod Value: " + value );
            }
            if (value == AllocMethod.NULL_VAL)
            {
                return this;
            }
        }
        return allocMethod(value.representation());
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

    private final NestedPartiesEncoder nestedParties = new NestedPartiesEncoder();
    public NestedPartiesEncoder nestedParties()
    {
        return nestedParties;
    }

    private boolean notifyBrokerOfCredit;

    private boolean hasNotifyBrokerOfCredit;

    public boolean hasNotifyBrokerOfCredit()
    {
        return hasNotifyBrokerOfCredit;
    }

    public AllocsGroupEncoder notifyBrokerOfCredit(boolean value)
    {
        notifyBrokerOfCredit = value;
        hasNotifyBrokerOfCredit = true;
        return this;
    }

    public boolean notifyBrokerOfCredit()
    {
        return notifyBrokerOfCredit;
    }

    private int allocHandlInst;

    private boolean hasAllocHandlInst;

    public boolean hasAllocHandlInst()
    {
        return hasAllocHandlInst;
    }

    public AllocsGroupEncoder allocHandlInst(int value)
    {
        allocHandlInst = value;
        hasAllocHandlInst = true;
        return this;
    }

    public int allocHandlInst()
    {
        return allocHandlInst;
    }

    public AllocsGroupEncoder allocHandlInst(AllocHandlInst value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == AllocHandlInst.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: allocHandlInst Value: " + value );
            }
            if (value == AllocHandlInst.NULL_VAL)
            {
                return this;
            }
        }
        return allocHandlInst(value.representation());
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

    private final CommissionDataEncoder commissionData = new CommissionDataEncoder();
    public CommissionDataEncoder commissionData()
    {
        return commissionData;
    }

    private final DecimalFloat allocAvgPx = new DecimalFloat();

    private boolean hasAllocAvgPx;

    public boolean hasAllocAvgPx()
    {
        return hasAllocAvgPx;
    }

    public AllocsGroupEncoder allocAvgPx(DecimalFloat value)
    {
        allocAvgPx.set(value);
        hasAllocAvgPx = true;
        return this;
    }

    public AllocsGroupEncoder allocAvgPx(long value, int scale)
    {
        allocAvgPx.set(value, scale);
        hasAllocAvgPx = true;
        return this;
    }

    public DecimalFloat allocAvgPx()
    {
        return allocAvgPx;
    }

    private final DecimalFloat allocNetMoney = new DecimalFloat();

    private boolean hasAllocNetMoney;

    public boolean hasAllocNetMoney()
    {
        return hasAllocNetMoney;
    }

    public AllocsGroupEncoder allocNetMoney(DecimalFloat value)
    {
        allocNetMoney.set(value);
        hasAllocNetMoney = true;
        return this;
    }

    public AllocsGroupEncoder allocNetMoney(long value, int scale)
    {
        allocNetMoney.set(value, scale);
        hasAllocNetMoney = true;
        return this;
    }

    public DecimalFloat allocNetMoney()
    {
        return allocNetMoney;
    }

    private final DecimalFloat settlCurrAmt = new DecimalFloat();

    private boolean hasSettlCurrAmt;

    public boolean hasSettlCurrAmt()
    {
        return hasSettlCurrAmt;
    }

    public AllocsGroupEncoder settlCurrAmt(DecimalFloat value)
    {
        settlCurrAmt.set(value);
        hasSettlCurrAmt = true;
        return this;
    }

    public AllocsGroupEncoder settlCurrAmt(long value, int scale)
    {
        settlCurrAmt.set(value, scale);
        hasSettlCurrAmt = true;
        return this;
    }

    public DecimalFloat settlCurrAmt()
    {
        return settlCurrAmt;
    }

    private final DecimalFloat allocSettlCurrAmt = new DecimalFloat();

    private boolean hasAllocSettlCurrAmt;

    public boolean hasAllocSettlCurrAmt()
    {
        return hasAllocSettlCurrAmt;
    }

    public AllocsGroupEncoder allocSettlCurrAmt(DecimalFloat value)
    {
        allocSettlCurrAmt.set(value);
        hasAllocSettlCurrAmt = true;
        return this;
    }

    public AllocsGroupEncoder allocSettlCurrAmt(long value, int scale)
    {
        allocSettlCurrAmt.set(value, scale);
        hasAllocSettlCurrAmt = true;
        return this;
    }

    public DecimalFloat allocSettlCurrAmt()
    {
        return allocSettlCurrAmt;
    }

    private final MutableDirectBuffer settlCurrency = new UnsafeBuffer();

    private int settlCurrencyOffset = 0;

    private int settlCurrencyLength = 0;

    public AllocsGroupEncoder settlCurrency(final DirectBuffer value, final int offset, final int length)
    {
        settlCurrency.wrap(value);
        settlCurrencyOffset = offset;
        settlCurrencyLength = length;
        return this;
    }

    public AllocsGroupEncoder settlCurrency(final DirectBuffer value, final int length)
    {
        return settlCurrency(value, 0, length);
    }

    public AllocsGroupEncoder settlCurrency(final DirectBuffer value)
    {
        return settlCurrency(value, 0, value.capacity());
    }

    public AllocsGroupEncoder settlCurrency(final byte[] value, final int offset, final int length)
    {
        settlCurrency.wrap(value);
        settlCurrencyOffset = offset;
        settlCurrencyLength = length;
        return this;
    }

    public AllocsGroupEncoder settlCurrencyAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlCurrency, value, offset, length);
        settlCurrencyOffset = offset;
        settlCurrencyLength = length;
        return this;
    }

    public AllocsGroupEncoder settlCurrency(final byte[] value, final int length)
    {
        return settlCurrency(value, 0, length);
    }

    public AllocsGroupEncoder settlCurrency(final byte[] value)
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

    public AllocsGroupEncoder settlCurrency(final CharSequence value)
    {
        toBytes(value, settlCurrency);
        settlCurrencyOffset = 0;
        settlCurrencyLength = value.length();
        return this;
    }

    public AllocsGroupEncoder settlCurrency(final AsciiSequenceView value)
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

    public AllocsGroupEncoder settlCurrency(final char[] value)
    {
        return settlCurrency(value, 0, value.length);
    }

    public AllocsGroupEncoder settlCurrency(final char[] value, final int length)
    {
        return settlCurrency(value, 0, length);
    }

    public AllocsGroupEncoder settlCurrency(final char[] value, final int offset, final int length)
    {
        toBytes(value, settlCurrency, offset, length);
        settlCurrencyOffset = 0;
        settlCurrencyLength = length;
        return this;
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

    private final DecimalFloat settlCurrFxRate = new DecimalFloat();

    private boolean hasSettlCurrFxRate;

    public boolean hasSettlCurrFxRate()
    {
        return hasSettlCurrFxRate;
    }

    public AllocsGroupEncoder settlCurrFxRate(DecimalFloat value)
    {
        settlCurrFxRate.set(value);
        hasSettlCurrFxRate = true;
        return this;
    }

    public AllocsGroupEncoder settlCurrFxRate(long value, int scale)
    {
        settlCurrFxRate.set(value, scale);
        hasSettlCurrFxRate = true;
        return this;
    }

    public DecimalFloat settlCurrFxRate()
    {
        return settlCurrFxRate;
    }

    private char settlCurrFxRateCalc;

    private boolean hasSettlCurrFxRateCalc;

    public boolean hasSettlCurrFxRateCalc()
    {
        return hasSettlCurrFxRateCalc;
    }

    public AllocsGroupEncoder settlCurrFxRateCalc(char value)
    {
        settlCurrFxRateCalc = value;
        hasSettlCurrFxRateCalc = true;
        return this;
    }

    public char settlCurrFxRateCalc()
    {
        return settlCurrFxRateCalc;
    }

    public AllocsGroupEncoder settlCurrFxRateCalc(SettlCurrFxRateCalc value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == SettlCurrFxRateCalc.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: settlCurrFxRateCalc Value: " + value );
            }
            if (value == SettlCurrFxRateCalc.NULL_VAL)
            {
                return this;
            }
        }
        return settlCurrFxRateCalc(value.representation());
    }

    private final DecimalFloat allocAccruedInterestAmt = new DecimalFloat();

    private boolean hasAllocAccruedInterestAmt;

    public boolean hasAllocAccruedInterestAmt()
    {
        return hasAllocAccruedInterestAmt;
    }

    public AllocsGroupEncoder allocAccruedInterestAmt(DecimalFloat value)
    {
        allocAccruedInterestAmt.set(value);
        hasAllocAccruedInterestAmt = true;
        return this;
    }

    public AllocsGroupEncoder allocAccruedInterestAmt(long value, int scale)
    {
        allocAccruedInterestAmt.set(value, scale);
        hasAllocAccruedInterestAmt = true;
        return this;
    }

    public DecimalFloat allocAccruedInterestAmt()
    {
        return allocAccruedInterestAmt;
    }

    private final DecimalFloat allocInterestAtMaturity = new DecimalFloat();

    private boolean hasAllocInterestAtMaturity;

    public boolean hasAllocInterestAtMaturity()
    {
        return hasAllocInterestAtMaturity;
    }

    public AllocsGroupEncoder allocInterestAtMaturity(DecimalFloat value)
    {
        allocInterestAtMaturity.set(value);
        hasAllocInterestAtMaturity = true;
        return this;
    }

    public AllocsGroupEncoder allocInterestAtMaturity(long value, int scale)
    {
        allocInterestAtMaturity.set(value, scale);
        hasAllocInterestAtMaturity = true;
        return this;
    }

    public DecimalFloat allocInterestAtMaturity()
    {
        return allocInterestAtMaturity;
    }

    private final MiscFeesGrpEncoder miscFeesGrp = new MiscFeesGrpEncoder();
    public MiscFeesGrpEncoder miscFeesGrp()
    {
        return miscFeesGrp;
    }

    private final ClrInstGrpEncoder clrInstGrp = new ClrInstGrpEncoder();
    public ClrInstGrpEncoder clrInstGrp()
    {
        return clrInstGrp;
    }

    private final MutableDirectBuffer clearingFeeIndicator = new UnsafeBuffer();

    private int clearingFeeIndicatorOffset = 0;

    private int clearingFeeIndicatorLength = 0;

    public AllocsGroupEncoder clearingFeeIndicator(final DirectBuffer value, final int offset, final int length)
    {
        clearingFeeIndicator.wrap(value);
        clearingFeeIndicatorOffset = offset;
        clearingFeeIndicatorLength = length;
        return this;
    }

    public AllocsGroupEncoder clearingFeeIndicator(final DirectBuffer value, final int length)
    {
        return clearingFeeIndicator(value, 0, length);
    }

    public AllocsGroupEncoder clearingFeeIndicator(final DirectBuffer value)
    {
        return clearingFeeIndicator(value, 0, value.capacity());
    }

    public AllocsGroupEncoder clearingFeeIndicator(final byte[] value, final int offset, final int length)
    {
        clearingFeeIndicator.wrap(value);
        clearingFeeIndicatorOffset = offset;
        clearingFeeIndicatorLength = length;
        return this;
    }

    public AllocsGroupEncoder clearingFeeIndicatorAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(clearingFeeIndicator, value, offset, length);
        clearingFeeIndicatorOffset = offset;
        clearingFeeIndicatorLength = length;
        return this;
    }

    public AllocsGroupEncoder clearingFeeIndicator(final byte[] value, final int length)
    {
        return clearingFeeIndicator(value, 0, length);
    }

    public AllocsGroupEncoder clearingFeeIndicator(final byte[] value)
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

    public AllocsGroupEncoder clearingFeeIndicator(final CharSequence value)
    {
        toBytes(value, clearingFeeIndicator);
        clearingFeeIndicatorOffset = 0;
        clearingFeeIndicatorLength = value.length();
        return this;
    }

    public AllocsGroupEncoder clearingFeeIndicator(final AsciiSequenceView value)
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

    public AllocsGroupEncoder clearingFeeIndicator(final char[] value)
    {
        return clearingFeeIndicator(value, 0, value.length);
    }

    public AllocsGroupEncoder clearingFeeIndicator(final char[] value, final int length)
    {
        return clearingFeeIndicator(value, 0, length);
    }

    public AllocsGroupEncoder clearingFeeIndicator(final char[] value, final int offset, final int length)
    {
        toBytes(value, clearingFeeIndicator, offset, length);
        clearingFeeIndicatorOffset = 0;
        clearingFeeIndicatorLength = length;
        return this;
    }

    public AllocsGroupEncoder clearingFeeIndicator(ClearingFeeIndicator value)
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

    private int allocSettlInstType;

    private boolean hasAllocSettlInstType;

    public boolean hasAllocSettlInstType()
    {
        return hasAllocSettlInstType;
    }

    public AllocsGroupEncoder allocSettlInstType(int value)
    {
        allocSettlInstType = value;
        hasAllocSettlInstType = true;
        return this;
    }

    public int allocSettlInstType()
    {
        return allocSettlInstType;
    }

    public AllocsGroupEncoder allocSettlInstType(AllocSettlInstType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == AllocSettlInstType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: allocSettlInstType Value: " + value );
            }
            if (value == AllocSettlInstType.NULL_VAL)
            {
                return this;
            }
        }
        return allocSettlInstType(value.representation());
    }

    private final SettlInstructionsDataEncoder settlInstructionsData = new SettlInstructionsDataEncoder();
    public SettlInstructionsDataEncoder settlInstructionsData()
    {
        return settlInstructionsData;
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

        if (hasMatchStatus)
        {
            buffer.putBytes(position, matchStatusHeader, 0, matchStatusHeaderLength);
            position += matchStatusHeaderLength;
            position += buffer.putCharAscii(position, matchStatus);
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

        if (hasAllocQty)
        {
            buffer.putBytes(position, allocQtyHeader, 0, allocQtyHeaderLength);
            position += allocQtyHeaderLength;
            position += buffer.putFloatAscii(position, allocQty);
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

        if (hasProcessCode)
        {
            buffer.putBytes(position, processCodeHeader, 0, processCodeHeaderLength);
            position += processCodeHeaderLength;
            position += buffer.putCharAscii(position, processCode);
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

        if (hasAllocMethod)
        {
            buffer.putBytes(position, allocMethodHeader, 0, allocMethodHeaderLength);
            position += allocMethodHeaderLength;
            position += buffer.putIntAscii(position, allocMethod);
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

        if (hasAllocPositionEffect)
        {
            buffer.putBytes(position, allocPositionEffectHeader, 0, allocPositionEffectHeaderLength);
            position += allocPositionEffectHeaderLength;
            position += buffer.putCharAscii(position, allocPositionEffect);
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

            position += nestedParties.encode(buffer, position);

        if (hasNotifyBrokerOfCredit)
        {
            buffer.putBytes(position, notifyBrokerOfCreditHeader, 0, notifyBrokerOfCreditHeaderLength);
            position += notifyBrokerOfCreditHeaderLength;
            position += buffer.putBooleanAscii(position, notifyBrokerOfCredit);
            buffer.putSeparator(position);
            position++;
        }

        if (hasAllocHandlInst)
        {
            buffer.putBytes(position, allocHandlInstHeader, 0, allocHandlInstHeaderLength);
            position += allocHandlInstHeaderLength;
            position += buffer.putIntAscii(position, allocHandlInst);
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

            position += commissionData.encode(buffer, position);

        if (hasAllocAvgPx)
        {
            buffer.putBytes(position, allocAvgPxHeader, 0, allocAvgPxHeaderLength);
            position += allocAvgPxHeaderLength;
            position += buffer.putFloatAscii(position, allocAvgPx);
            buffer.putSeparator(position);
            position++;
        }

        if (hasAllocNetMoney)
        {
            buffer.putBytes(position, allocNetMoneyHeader, 0, allocNetMoneyHeaderLength);
            position += allocNetMoneyHeaderLength;
            position += buffer.putFloatAscii(position, allocNetMoney);
            buffer.putSeparator(position);
            position++;
        }

        if (hasSettlCurrAmt)
        {
            buffer.putBytes(position, settlCurrAmtHeader, 0, settlCurrAmtHeaderLength);
            position += settlCurrAmtHeaderLength;
            position += buffer.putFloatAscii(position, settlCurrAmt);
            buffer.putSeparator(position);
            position++;
        }

        if (hasAllocSettlCurrAmt)
        {
            buffer.putBytes(position, allocSettlCurrAmtHeader, 0, allocSettlCurrAmtHeaderLength);
            position += allocSettlCurrAmtHeaderLength;
            position += buffer.putFloatAscii(position, allocSettlCurrAmt);
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

        if (allocSettlCurrencyLength > 0)
        {
            buffer.putBytes(position, allocSettlCurrencyHeader, 0, allocSettlCurrencyHeaderLength);
            position += allocSettlCurrencyHeaderLength;
            buffer.putBytes(position, allocSettlCurrency, allocSettlCurrencyOffset, allocSettlCurrencyLength);
            position += allocSettlCurrencyLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasSettlCurrFxRate)
        {
            buffer.putBytes(position, settlCurrFxRateHeader, 0, settlCurrFxRateHeaderLength);
            position += settlCurrFxRateHeaderLength;
            position += buffer.putFloatAscii(position, settlCurrFxRate);
            buffer.putSeparator(position);
            position++;
        }

        if (hasSettlCurrFxRateCalc)
        {
            buffer.putBytes(position, settlCurrFxRateCalcHeader, 0, settlCurrFxRateCalcHeaderLength);
            position += settlCurrFxRateCalcHeaderLength;
            position += buffer.putCharAscii(position, settlCurrFxRateCalc);
            buffer.putSeparator(position);
            position++;
        }

        if (hasAllocAccruedInterestAmt)
        {
            buffer.putBytes(position, allocAccruedInterestAmtHeader, 0, allocAccruedInterestAmtHeaderLength);
            position += allocAccruedInterestAmtHeaderLength;
            position += buffer.putFloatAscii(position, allocAccruedInterestAmt);
            buffer.putSeparator(position);
            position++;
        }

        if (hasAllocInterestAtMaturity)
        {
            buffer.putBytes(position, allocInterestAtMaturityHeader, 0, allocInterestAtMaturityHeaderLength);
            position += allocInterestAtMaturityHeaderLength;
            position += buffer.putFloatAscii(position, allocInterestAtMaturity);
            buffer.putSeparator(position);
            position++;
        }

            position += miscFeesGrp.encode(buffer, position);

            position += clrInstGrp.encode(buffer, position);

        if (clearingFeeIndicatorLength > 0)
        {
            buffer.putBytes(position, clearingFeeIndicatorHeader, 0, clearingFeeIndicatorHeaderLength);
            position += clearingFeeIndicatorHeaderLength;
            buffer.putBytes(position, clearingFeeIndicator, clearingFeeIndicatorOffset, clearingFeeIndicatorLength);
            position += clearingFeeIndicatorLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasAllocSettlInstType)
        {
            buffer.putBytes(position, allocSettlInstTypeHeader, 0, allocSettlInstTypeHeaderLength);
            position += allocSettlInstTypeHeaderLength;
            position += buffer.putIntAscii(position, allocSettlInstType);
            buffer.putSeparator(position);
            position++;
        }

            position += settlInstructionsData.encode(buffer, position);
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
        this.resetMatchStatus();
        this.resetAllocPrice();
        this.resetAllocQty();
        this.resetIndividualAllocID();
        this.resetProcessCode();
        this.resetSecondaryIndividualAllocID();
        this.resetAllocMethod();
        this.resetAllocCustomerCapacity();
        this.resetAllocPositionEffect();
        this.resetIndividualAllocType();
        this.resetNotifyBrokerOfCredit();
        this.resetAllocHandlInst();
        this.resetAllocText();
        this.resetEncodedAllocTextLen();
        this.resetEncodedAllocText();
        this.resetAllocAvgPx();
        this.resetAllocNetMoney();
        this.resetSettlCurrAmt();
        this.resetAllocSettlCurrAmt();
        this.resetSettlCurrency();
        this.resetAllocSettlCurrency();
        this.resetSettlCurrFxRate();
        this.resetSettlCurrFxRateCalc();
        this.resetAllocAccruedInterestAmt();
        this.resetAllocInterestAtMaturity();
        this.resetClearingFeeIndicator();
        this.resetAllocSettlInstType();
        nestedParties.reset();
        commissionData.reset();
        miscFeesGrp.reset();
        clrInstGrp.reset();
        settlInstructionsData.reset();
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

    public void resetMatchStatus()
    {
        hasMatchStatus = false;
    }

    public void resetAllocPrice()
    {
        hasAllocPrice = false;
    }

    public void resetAllocQty()
    {
        hasAllocQty = false;
    }

    public void resetIndividualAllocID()
    {
        individualAllocIDLength = 0;
    }

    public void resetProcessCode()
    {
        hasProcessCode = false;
    }

    public void resetSecondaryIndividualAllocID()
    {
        secondaryIndividualAllocIDLength = 0;
    }

    public void resetAllocMethod()
    {
        hasAllocMethod = false;
    }

    public void resetAllocCustomerCapacity()
    {
        allocCustomerCapacityLength = 0;
    }

    public void resetAllocPositionEffect()
    {
        hasAllocPositionEffect = false;
    }

    public void resetIndividualAllocType()
    {
        hasIndividualAllocType = false;
    }

    public void resetNotifyBrokerOfCredit()
    {
        hasNotifyBrokerOfCredit = false;
    }

    public void resetAllocHandlInst()
    {
        hasAllocHandlInst = false;
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

    public void resetAllocAvgPx()
    {
        hasAllocAvgPx = false;
    }

    public void resetAllocNetMoney()
    {
        hasAllocNetMoney = false;
    }

    public void resetSettlCurrAmt()
    {
        hasSettlCurrAmt = false;
    }

    public void resetAllocSettlCurrAmt()
    {
        hasAllocSettlCurrAmt = false;
    }

    public void resetSettlCurrency()
    {
        settlCurrencyLength = 0;
    }

    public void resetAllocSettlCurrency()
    {
        allocSettlCurrencyLength = 0;
    }

    public void resetSettlCurrFxRate()
    {
        hasSettlCurrFxRate = false;
    }

    public void resetSettlCurrFxRateCalc()
    {
        hasSettlCurrFxRateCalc = false;
    }

    public void resetAllocAccruedInterestAmt()
    {
        hasAllocAccruedInterestAmt = false;
    }

    public void resetAllocInterestAtMaturity()
    {
        hasAllocInterestAtMaturity = false;
    }

    public void resetClearingFeeIndicator()
    {
        clearingFeeIndicatorLength = 0;
    }

    public void resetAllocSettlInstType()
    {
        hasAllocSettlInstType = false;
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

        if (hasMatchStatus())
        {
            indent(builder, level);
            builder.append("\"MatchStatus\": \"");
            builder.append(matchStatus);
            builder.append("\",\n");
        }

        if (hasAllocPrice())
        {
            indent(builder, level);
            builder.append("\"AllocPrice\": \"");
            allocPrice.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasAllocQty())
        {
            indent(builder, level);
            builder.append("\"AllocQty\": \"");
            allocQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasIndividualAllocID())
        {
            indent(builder, level);
            builder.append("\"IndividualAllocID\": \"");
            appendBuffer(builder, individualAllocID, individualAllocIDOffset, individualAllocIDLength);
            builder.append("\",\n");
        }

        if (hasProcessCode())
        {
            indent(builder, level);
            builder.append("\"ProcessCode\": \"");
            builder.append(processCode);
            builder.append("\",\n");
        }

        if (hasSecondaryIndividualAllocID())
        {
            indent(builder, level);
            builder.append("\"SecondaryIndividualAllocID\": \"");
            appendBuffer(builder, secondaryIndividualAllocID, secondaryIndividualAllocIDOffset, secondaryIndividualAllocIDLength);
            builder.append("\",\n");
        }

        if (hasAllocMethod())
        {
            indent(builder, level);
            builder.append("\"AllocMethod\": \"");
            builder.append(allocMethod);
            builder.append("\",\n");
        }

        if (hasAllocCustomerCapacity())
        {
            indent(builder, level);
            builder.append("\"AllocCustomerCapacity\": \"");
            appendBuffer(builder, allocCustomerCapacity, allocCustomerCapacityOffset, allocCustomerCapacityLength);
            builder.append("\",\n");
        }

        if (hasAllocPositionEffect())
        {
            indent(builder, level);
            builder.append("\"AllocPositionEffect\": \"");
            builder.append(allocPositionEffect);
            builder.append("\",\n");
        }

        if (hasIndividualAllocType())
        {
            indent(builder, level);
            builder.append("\"IndividualAllocType\": \"");
            builder.append(individualAllocType);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"NestedParties\": ");
    nestedParties.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasNotifyBrokerOfCredit())
        {
            indent(builder, level);
            builder.append("\"NotifyBrokerOfCredit\": \"");
            builder.append(notifyBrokerOfCredit);
            builder.append("\",\n");
        }

        if (hasAllocHandlInst())
        {
            indent(builder, level);
            builder.append("\"AllocHandlInst\": \"");
            builder.append(allocHandlInst);
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

    indent(builder, level);
    builder.append("\"CommissionData\": ");
    commissionData.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasAllocAvgPx())
        {
            indent(builder, level);
            builder.append("\"AllocAvgPx\": \"");
            allocAvgPx.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasAllocNetMoney())
        {
            indent(builder, level);
            builder.append("\"AllocNetMoney\": \"");
            allocNetMoney.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasSettlCurrAmt())
        {
            indent(builder, level);
            builder.append("\"SettlCurrAmt\": \"");
            settlCurrAmt.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasAllocSettlCurrAmt())
        {
            indent(builder, level);
            builder.append("\"AllocSettlCurrAmt\": \"");
            allocSettlCurrAmt.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasSettlCurrency())
        {
            indent(builder, level);
            builder.append("\"SettlCurrency\": \"");
            appendBuffer(builder, settlCurrency, settlCurrencyOffset, settlCurrencyLength);
            builder.append("\",\n");
        }

        if (hasAllocSettlCurrency())
        {
            indent(builder, level);
            builder.append("\"AllocSettlCurrency\": \"");
            appendBuffer(builder, allocSettlCurrency, allocSettlCurrencyOffset, allocSettlCurrencyLength);
            builder.append("\",\n");
        }

        if (hasSettlCurrFxRate())
        {
            indent(builder, level);
            builder.append("\"SettlCurrFxRate\": \"");
            settlCurrFxRate.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasSettlCurrFxRateCalc())
        {
            indent(builder, level);
            builder.append("\"SettlCurrFxRateCalc\": \"");
            builder.append(settlCurrFxRateCalc);
            builder.append("\",\n");
        }

        if (hasAllocAccruedInterestAmt())
        {
            indent(builder, level);
            builder.append("\"AllocAccruedInterestAmt\": \"");
            allocAccruedInterestAmt.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasAllocInterestAtMaturity())
        {
            indent(builder, level);
            builder.append("\"AllocInterestAtMaturity\": \"");
            allocInterestAtMaturity.appendTo(builder);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"MiscFeesGrp\": ");
    miscFeesGrp.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"ClrInstGrp\": ");
    clrInstGrp.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasClearingFeeIndicator())
        {
            indent(builder, level);
            builder.append("\"ClearingFeeIndicator\": \"");
            appendBuffer(builder, clearingFeeIndicator, clearingFeeIndicatorOffset, clearingFeeIndicatorLength);
            builder.append("\",\n");
        }

        if (hasAllocSettlInstType())
        {
            indent(builder, level);
            builder.append("\"AllocSettlInstType\": \"");
            builder.append(allocSettlInstType);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"SettlInstructionsData\": ");
    settlInstructionsData.appendTo(builder, level + 1);
    builder.append("\n");
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

        if (hasMatchStatus())
        {
            encoder.matchStatus(this.matchStatus());
        }

        if (hasAllocPrice())
        {
            encoder.allocPrice(this.allocPrice());
        }

        if (hasAllocQty())
        {
            encoder.allocQty(this.allocQty());
        }

        if (hasIndividualAllocID())
        {
            encoder.individualAllocIDAsCopy(individualAllocID.byteArray(), 0, individualAllocIDLength);
        }

        if (hasProcessCode())
        {
            encoder.processCode(this.processCode());
        }

        if (hasSecondaryIndividualAllocID())
        {
            encoder.secondaryIndividualAllocIDAsCopy(secondaryIndividualAllocID.byteArray(), 0, secondaryIndividualAllocIDLength);
        }

        if (hasAllocMethod())
        {
            encoder.allocMethod(this.allocMethod());
        }

        if (hasAllocCustomerCapacity())
        {
            encoder.allocCustomerCapacityAsCopy(allocCustomerCapacity.byteArray(), 0, allocCustomerCapacityLength);
        }

        if (hasAllocPositionEffect())
        {
            encoder.allocPositionEffect(this.allocPositionEffect());
        }

        if (hasIndividualAllocType())
        {
            encoder.individualAllocType(this.individualAllocType());
        }


        nestedParties.copyTo(encoder.nestedParties());
        if (hasNotifyBrokerOfCredit())
        {
            encoder.notifyBrokerOfCredit(this.notifyBrokerOfCredit());
        }

        if (hasAllocHandlInst())
        {
            encoder.allocHandlInst(this.allocHandlInst());
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


        commissionData.copyTo(encoder.commissionData());
        if (hasAllocAvgPx())
        {
            encoder.allocAvgPx(this.allocAvgPx());
        }

        if (hasAllocNetMoney())
        {
            encoder.allocNetMoney(this.allocNetMoney());
        }

        if (hasSettlCurrAmt())
        {
            encoder.settlCurrAmt(this.settlCurrAmt());
        }

        if (hasAllocSettlCurrAmt())
        {
            encoder.allocSettlCurrAmt(this.allocSettlCurrAmt());
        }

        if (hasSettlCurrency())
        {
            encoder.settlCurrencyAsCopy(settlCurrency.byteArray(), 0, settlCurrencyLength);
        }

        if (hasAllocSettlCurrency())
        {
            encoder.allocSettlCurrencyAsCopy(allocSettlCurrency.byteArray(), 0, allocSettlCurrencyLength);
        }

        if (hasSettlCurrFxRate())
        {
            encoder.settlCurrFxRate(this.settlCurrFxRate());
        }

        if (hasSettlCurrFxRateCalc())
        {
            encoder.settlCurrFxRateCalc(this.settlCurrFxRateCalc());
        }

        if (hasAllocAccruedInterestAmt())
        {
            encoder.allocAccruedInterestAmt(this.allocAccruedInterestAmt());
        }

        if (hasAllocInterestAtMaturity())
        {
            encoder.allocInterestAtMaturity(this.allocInterestAtMaturity());
        }


        miscFeesGrp.copyTo(encoder.miscFeesGrp());

        clrInstGrp.copyTo(encoder.clrInstGrp());
        if (hasClearingFeeIndicator())
        {
            encoder.clearingFeeIndicatorAsCopy(clearingFeeIndicator.byteArray(), 0, clearingFeeIndicatorLength);
        }

        if (hasAllocSettlInstType())
        {
            encoder.allocSettlInstType(this.allocSettlInstType());
        }


        settlInstructionsData.copyTo(encoder.settlInstructionsData());        return encoder;
    }

}
    private int noAllocsGroupCounter;

    private boolean hasNoAllocsGroupCounter;

    public boolean hasNoAllocsGroupCounter()
    {
        return hasNoAllocsGroupCounter;
    }

    public AllocGrpEncoder noAllocsGroupCounter(int value)
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
        builder.append("\"MessageName\": \"AllocGrp\",\n");
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
    public AllocGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((AllocGrpEncoder)encoder);
    }

    public AllocGrpEncoder copyTo(final AllocGrpEncoder encoder)
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
