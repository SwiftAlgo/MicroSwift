/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2.decoder;

import org.agrona.AsciiNumberFormatException;
import org.agrona.MutableDirectBuffer;
import org.agrona.AsciiSequenceView;
import static uk.co.real_logic.artio.dictionary.generation.CodecUtil.*;
import static uk.co.real_logic.artio.dictionary.SessionConstants.*;
import uk.co.real_logic.artio.builder.Decoder;
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
import uk.co.real_logic.artio.builder.Encoder;
import uk.co.real_logic.artio.builder.CommonDecoderImpl;
import static java.nio.charset.StandardCharsets.US_ASCII;
import static uk.co.real_logic.artio.builder.Validation.CODEC_VALIDATION_ENABLED;
import static uk.co.real_logic.artio.builder.RejectUnknownField.CODEC_REJECT_UNKNOWN_FIELD_ENABLED;
import static uk.co.real_logic.artio.builder.RejectUnknownEnumValue.CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED;
import com.swiftalgo.ms.codecs.fix50sp2.*;
import com.swiftalgo.ms.codecs.fix50sp2.builder.TrdAllocGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.TrdAllocGrpEncoder.AllocsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.NestedParties2Encoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.NestedParties2Encoder.Nested2PartyIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.NstdPtys2SubGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.NstdPtys2SubGrpEncoder.Nested2PartySubIDsGroupEncoder;

public interface TrdAllocGrpDecoder 
{



public class AllocsGroupDecoder extends CommonDecoderImpl implements NestedParties2Decoder
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(0);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
        }
    }

    public final IntHashSet GROUP_FIELDS = new IntHashSet(18);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            GROUP_FIELDS.add(Constants.ALLOC_ACCOUNT);
            GROUP_FIELDS.add(Constants.ALLOC_ACCT_ID_SOURCE);
            GROUP_FIELDS.add(Constants.ALLOC_SETTL_CURRENCY);
            GROUP_FIELDS.add(Constants.INDIVIDUAL_ALLOC_ID);
            GROUP_FIELDS.add(Constants.ALLOC_QTY);
            GROUP_FIELDS.add(Constants.ALLOC_CUSTOMER_CAPACITY);
            GROUP_FIELDS.add(Constants.ALLOC_METHOD);
            GROUP_FIELDS.add(Constants.SECONDARY_INDIVIDUAL_ALLOC_ID);
            GROUP_FIELDS.add(Constants.ALLOC_CLEARING_FEE_INDICATOR);
        }
    }

    public final IntHashSet ALL_GROUP_FIELDS = new IntHashSet(18);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            ALL_GROUP_FIELDS.add(Constants.ALLOC_ACCOUNT);
            ALL_GROUP_FIELDS.add(Constants.ALLOC_ACCT_ID_SOURCE);
            ALL_GROUP_FIELDS.add(Constants.ALLOC_SETTL_CURRENCY);
            ALL_GROUP_FIELDS.add(Constants.INDIVIDUAL_ALLOC_ID);
            ALL_GROUP_FIELDS.add(Constants.ALLOC_QTY);
            ALL_GROUP_FIELDS.add(Constants.ALLOC_CUSTOMER_CAPACITY);
            ALL_GROUP_FIELDS.add(Constants.ALLOC_METHOD);
            ALL_GROUP_FIELDS.add(Constants.SECONDARY_INDIVIDUAL_ALLOC_ID);
            ALL_GROUP_FIELDS.add(Constants.ALLOC_CLEARING_FEE_INDICATOR);
        }
    }

    private final IntHashSet missingRequiredFields = new IntHashSet(0);

    public boolean validate()
    {
        if (rejectReason != Decoder.NO_ERROR)
        {
            return false;
        }
        final IntIterator missingFieldsIterator = missingRequiredFields.iterator();
        if (missingFieldsIterator.hasNext())
        {
            invalidTagId = missingFieldsIterator.nextValue();
            rejectReason = 1;
            return false;
        }
        if (hasAllocMethod)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !AllocMethod.isValid(allocMethod()))
        {
            invalidTagId = 1002;
            rejectReason = 5;
            return false;
        }
        }
        if (hasNoNested2PartyIDsGroupCounter)
        {
            {
                int count = 0;
                final Nested2PartyIDsGroupIterator iterator = nested2PartyIDsGroupIterator.iterator();
                for (final Nested2PartyIDsGroupDecoder group : iterator)
                {
                    count++;                    if (!group.validate())
                    {
                        invalidTagId = group.invalidTagId();
                        rejectReason = group.rejectReason();
                        return false;
                    }
                }
                if (count != iterator.numberFieldValue())
                {
                    invalidTagId = 756;
                    rejectReason = 16;
                    return false;
                }
            }
        }
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public AllocsGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private AllocsGroupDecoder next = null;

    public AllocsGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(20);

    private char[] allocAccount = new char[1];

    private boolean hasAllocAccount;

    public char[] allocAccount()
    {
        if (!hasAllocAccount)
        {
            throw new IllegalArgumentException("No value for optional field: AllocAccount");
        }

        return allocAccount;
    }

    public boolean hasAllocAccount()
    {
        return hasAllocAccount;
    }


    private int allocAccountOffset;

    private int allocAccountLength;

    public int allocAccountLength()
    {
        if (!hasAllocAccount)
        {
            throw new IllegalArgumentException("No value for optional field: AllocAccount");
        }

        return allocAccountLength;
    }

    public String allocAccountAsString()
    {
        return hasAllocAccount ? new String(allocAccount, 0, allocAccountLength) : null;
    }

    public void allocAccount(final AsciiSequenceView view)
    {
        if (!hasAllocAccount)
        {
            throw new IllegalArgumentException("No value for optional field: AllocAccount");
        }

        view.wrap(buffer, allocAccountOffset, allocAccountLength);
    }


    private int allocAcctIDSource = MISSING_INT;

    private boolean hasAllocAcctIDSource;

    public int allocAcctIDSource()
    {
        if (!hasAllocAcctIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: AllocAcctIDSource");
        }

        return allocAcctIDSource;
    }

    public boolean hasAllocAcctIDSource()
    {
        return hasAllocAcctIDSource;
    }



    private char[] allocSettlCurrency = new char[1];

    private boolean hasAllocSettlCurrency;

    public char[] allocSettlCurrency()
    {
        if (!hasAllocSettlCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: AllocSettlCurrency");
        }

        return allocSettlCurrency;
    }

    public boolean hasAllocSettlCurrency()
    {
        return hasAllocSettlCurrency;
    }


    private int allocSettlCurrencyOffset;

    private int allocSettlCurrencyLength;

    public int allocSettlCurrencyLength()
    {
        if (!hasAllocSettlCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: AllocSettlCurrency");
        }

        return allocSettlCurrencyLength;
    }

    public String allocSettlCurrencyAsString()
    {
        return hasAllocSettlCurrency ? new String(allocSettlCurrency, 0, allocSettlCurrencyLength) : null;
    }

    public void allocSettlCurrency(final AsciiSequenceView view)
    {
        if (!hasAllocSettlCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: AllocSettlCurrency");
        }

        view.wrap(buffer, allocSettlCurrencyOffset, allocSettlCurrencyLength);
    }


    private char[] individualAllocID = new char[1];

    private boolean hasIndividualAllocID;

    public char[] individualAllocID()
    {
        if (!hasIndividualAllocID)
        {
            throw new IllegalArgumentException("No value for optional field: IndividualAllocID");
        }

        return individualAllocID;
    }

    public boolean hasIndividualAllocID()
    {
        return hasIndividualAllocID;
    }


    private int individualAllocIDOffset;

    private int individualAllocIDLength;

    public int individualAllocIDLength()
    {
        if (!hasIndividualAllocID)
        {
            throw new IllegalArgumentException("No value for optional field: IndividualAllocID");
        }

        return individualAllocIDLength;
    }

    public String individualAllocIDAsString()
    {
        return hasIndividualAllocID ? new String(individualAllocID, 0, individualAllocIDLength) : null;
    }

    public void individualAllocID(final AsciiSequenceView view)
    {
        if (!hasIndividualAllocID)
        {
            throw new IllegalArgumentException("No value for optional field: IndividualAllocID");
        }

        view.wrap(buffer, individualAllocIDOffset, individualAllocIDLength);
    }




    private Nested2PartyIDsGroupDecoder nested2PartyIDsGroup = null;
    public Nested2PartyIDsGroupDecoder nested2PartyIDsGroup()
    {
        return nested2PartyIDsGroup;
    }

    private int noNested2PartyIDsGroupCounter = MISSING_INT;

    private boolean hasNoNested2PartyIDsGroupCounter;

    public int noNested2PartyIDsGroupCounter()
    {
        if (!hasNoNested2PartyIDsGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoNested2PartyIDsGroupCounter");
        }

        return noNested2PartyIDsGroupCounter;
    }

    public boolean hasNoNested2PartyIDsGroupCounter()
    {
        return hasNoNested2PartyIDsGroupCounter;
    }




    private Nested2PartyIDsGroupIterator nested2PartyIDsGroupIterator = new Nested2PartyIDsGroupIterator(this);
    public Nested2PartyIDsGroupIterator nested2PartyIDsGroupIterator()
    {
        return nested2PartyIDsGroupIterator.iterator();
    }


    private DecimalFloat allocQty = DecimalFloat.newNaNValue();

    private boolean hasAllocQty;

    public DecimalFloat allocQty()
    {
        if (!hasAllocQty)
        {
            throw new IllegalArgumentException("No value for optional field: AllocQty");
        }

        return allocQty;
    }

    public boolean hasAllocQty()
    {
        return hasAllocQty;
    }



    private char[] allocCustomerCapacity = new char[1];

    private boolean hasAllocCustomerCapacity;

    public char[] allocCustomerCapacity()
    {
        if (!hasAllocCustomerCapacity)
        {
            throw new IllegalArgumentException("No value for optional field: AllocCustomerCapacity");
        }

        return allocCustomerCapacity;
    }

    public boolean hasAllocCustomerCapacity()
    {
        return hasAllocCustomerCapacity;
    }


    private int allocCustomerCapacityOffset;

    private int allocCustomerCapacityLength;

    public int allocCustomerCapacityLength()
    {
        if (!hasAllocCustomerCapacity)
        {
            throw new IllegalArgumentException("No value for optional field: AllocCustomerCapacity");
        }

        return allocCustomerCapacityLength;
    }

    public String allocCustomerCapacityAsString()
    {
        return hasAllocCustomerCapacity ? new String(allocCustomerCapacity, 0, allocCustomerCapacityLength) : null;
    }

    public void allocCustomerCapacity(final AsciiSequenceView view)
    {
        if (!hasAllocCustomerCapacity)
        {
            throw new IllegalArgumentException("No value for optional field: AllocCustomerCapacity");
        }

        view.wrap(buffer, allocCustomerCapacityOffset, allocCustomerCapacityLength);
    }


    private int allocMethod = MISSING_INT;

    private boolean hasAllocMethod;

    public int allocMethod()
    {
        if (!hasAllocMethod)
        {
            throw new IllegalArgumentException("No value for optional field: AllocMethod");
        }

        return allocMethod;
    }

    public boolean hasAllocMethod()
    {
        return hasAllocMethod;
    }



    private final CharArrayWrapper allocMethodWrapper = new CharArrayWrapper();
    public AllocMethod allocMethodAsEnum()
    {
        if (!hasAllocMethod)
 return AllocMethod.NULL_VAL;
        return AllocMethod.decode(allocMethod);
    }

    private char[] secondaryIndividualAllocID = new char[1];

    private boolean hasSecondaryIndividualAllocID;

    public char[] secondaryIndividualAllocID()
    {
        if (!hasSecondaryIndividualAllocID)
        {
            throw new IllegalArgumentException("No value for optional field: SecondaryIndividualAllocID");
        }

        return secondaryIndividualAllocID;
    }

    public boolean hasSecondaryIndividualAllocID()
    {
        return hasSecondaryIndividualAllocID;
    }


    private int secondaryIndividualAllocIDOffset;

    private int secondaryIndividualAllocIDLength;

    public int secondaryIndividualAllocIDLength()
    {
        if (!hasSecondaryIndividualAllocID)
        {
            throw new IllegalArgumentException("No value for optional field: SecondaryIndividualAllocID");
        }

        return secondaryIndividualAllocIDLength;
    }

    public String secondaryIndividualAllocIDAsString()
    {
        return hasSecondaryIndividualAllocID ? new String(secondaryIndividualAllocID, 0, secondaryIndividualAllocIDLength) : null;
    }

    public void secondaryIndividualAllocID(final AsciiSequenceView view)
    {
        if (!hasSecondaryIndividualAllocID)
        {
            throw new IllegalArgumentException("No value for optional field: SecondaryIndividualAllocID");
        }

        view.wrap(buffer, secondaryIndividualAllocIDOffset, secondaryIndividualAllocIDLength);
    }


    private char[] allocClearingFeeIndicator = new char[1];

    private boolean hasAllocClearingFeeIndicator;

    public char[] allocClearingFeeIndicator()
    {
        if (!hasAllocClearingFeeIndicator)
        {
            throw new IllegalArgumentException("No value for optional field: AllocClearingFeeIndicator");
        }

        return allocClearingFeeIndicator;
    }

    public boolean hasAllocClearingFeeIndicator()
    {
        return hasAllocClearingFeeIndicator;
    }


    private int allocClearingFeeIndicatorOffset;

    private int allocClearingFeeIndicatorLength;

    public int allocClearingFeeIndicatorLength()
    {
        if (!hasAllocClearingFeeIndicator)
        {
            throw new IllegalArgumentException("No value for optional field: AllocClearingFeeIndicator");
        }

        return allocClearingFeeIndicatorLength;
    }

    public String allocClearingFeeIndicatorAsString()
    {
        return hasAllocClearingFeeIndicator ? new String(allocClearingFeeIndicator, 0, allocClearingFeeIndicatorLength) : null;
    }

    public void allocClearingFeeIndicator(final AsciiSequenceView view)
    {
        if (!hasAllocClearingFeeIndicator)
        {
            throw new IllegalArgumentException("No value for optional field: AllocClearingFeeIndicator");
        }

        view.wrap(buffer, allocClearingFeeIndicatorOffset, allocClearingFeeIndicatorLength);
    }


    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode AllocsGroup
        int seenFieldCount = 0;
        if (CODEC_VALIDATION_ENABLED)
        {
            missingRequiredFields.copy(REQUIRED_FIELDS);
        }
        this.buffer = buffer;
        final int end = offset + length;
        int position = offset;
        seenFields.clear();
        int tag;

        while (position < end)
        {
            final int equalsPosition = buffer.scan(position, end, '=');
            if (equalsPosition == AsciiBuffer.UNKNOWN_INDEX)
            {
               return position;
            }
            tag = buffer.getInt(position, equalsPosition);
            if (!seenFields.add(tag))
            {
                if (next == null)
                {
                    next = new AllocsGroupDecoder(trailer, messageFields);
                }
                return position - offset;
            }
            final int valueOffset = equalsPosition + 1;
            int endOfField = buffer.scan(valueOffset, end, START_OF_HEADER);
            if (endOfField == AsciiBuffer.UNKNOWN_INDEX || equalsPosition == AsciiBuffer.UNKNOWN_INDEX)
            {
                rejectReason = 5;
                break;
            }
            final int valueLength = endOfField - valueOffset;
            if (CODEC_VALIDATION_ENABLED)
            {
                if (tag <= 0)
                {
                    invalidTagId = tag;
                    rejectReason = 0;
                }
                else if (valueLength == 0)
                {
                    invalidTagId = tag;
                    rejectReason = 4;
                }
                missingRequiredFields.remove(tag);
                seenFieldCount++;
            }

            switch (tag)
            {
            case Constants.ALLOC_ACCOUNT:
                hasAllocAccount = true;
                allocAccount = buffer.getChars(allocAccount, valueOffset, valueLength);
                allocAccountOffset = valueOffset;
                allocAccountLength = valueLength;
                break;

            case Constants.ALLOC_ACCT_ID_SOURCE:
                hasAllocAcctIDSource = true;
                allocAcctIDSource = getInt(buffer, valueOffset, endOfField, 661, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.ALLOC_SETTL_CURRENCY:
                hasAllocSettlCurrency = true;
                allocSettlCurrency = buffer.getChars(allocSettlCurrency, valueOffset, valueLength);
                allocSettlCurrencyOffset = valueOffset;
                allocSettlCurrencyLength = valueLength;
                break;

            case Constants.INDIVIDUAL_ALLOC_ID:
                hasIndividualAllocID = true;
                individualAllocID = buffer.getChars(individualAllocID, valueOffset, valueLength);
                individualAllocIDOffset = valueOffset;
                individualAllocIDLength = valueLength;
                break;

            case Constants.NO_NESTED2_PARTY_IDS:
                hasNoNested2PartyIDsGroupCounter = true;
                noNested2PartyIDsGroupCounter = getInt(buffer, valueOffset, endOfField, 756, CODEC_VALIDATION_ENABLED);
                if (nested2PartyIDsGroup == null)
                {
                    nested2PartyIDsGroup = new Nested2PartyIDsGroupDecoder(trailer, messageFields);
                }
                Nested2PartyIDsGroupDecoder nested2PartyIDsGroupCurrent = nested2PartyIDsGroup;
                position = endOfField + 1;
                final int noNested2PartyIDsGroupCounter = this.noNested2PartyIDsGroupCounter;
                for (int i = 0; i < noNested2PartyIDsGroupCounter && position < end; i++)
                {
                    if (nested2PartyIDsGroupCurrent != null)
                    {
                        position += nested2PartyIDsGroupCurrent.decode(buffer, position, end - position);
                        nested2PartyIDsGroupCurrent = nested2PartyIDsGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (nested2PartyIDsGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;


            case Constants.ALLOC_QTY:
                hasAllocQty = true;
                allocQty = getFloat(buffer, allocQty, valueOffset, valueLength, 80, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.ALLOC_CUSTOMER_CAPACITY:
                hasAllocCustomerCapacity = true;
                allocCustomerCapacity = buffer.getChars(allocCustomerCapacity, valueOffset, valueLength);
                allocCustomerCapacityOffset = valueOffset;
                allocCustomerCapacityLength = valueLength;
                break;

            case Constants.ALLOC_METHOD:
                hasAllocMethod = true;
                allocMethod = getInt(buffer, valueOffset, endOfField, 1002, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.SECONDARY_INDIVIDUAL_ALLOC_ID:
                hasSecondaryIndividualAllocID = true;
                secondaryIndividualAllocID = buffer.getChars(secondaryIndividualAllocID, valueOffset, valueLength);
                secondaryIndividualAllocIDOffset = valueOffset;
                secondaryIndividualAllocIDLength = valueLength;
                break;

            case Constants.ALLOC_CLEARING_FEE_INDICATOR:
                hasAllocClearingFeeIndicator = true;
                allocClearingFeeIndicator = buffer.getChars(allocClearingFeeIndicator, valueOffset, valueLength);
                allocClearingFeeIndicatorOffset = valueOffset;
                allocClearingFeeIndicatorLength = valueLength;
                break;

            default:
                if (!CODEC_REJECT_UNKNOWN_FIELD_ENABLED)
                {
                    seenFields.remove(tag);
                }
                if (CODEC_REJECT_UNKNOWN_FIELD_ENABLED || (trailer.REQUIRED_FIELDS.contains(tag) || messageFields.contains(tag)))
                {
                    return position - offset;
                }

            }

            if (position < (endOfField + 1))
            {
                position = endOfField + 1;
            }
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
        this.resetAllocCustomerCapacity();
        this.resetAllocMethod();
        this.resetSecondaryIndividualAllocID();
        this.resetAllocClearingFeeIndicator();
        this.resetNested2PartyIDsGroup();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetAllocAccount()
    {
        hasAllocAccount = false;
    }

    public void resetAllocAcctIDSource()
    {
        hasAllocAcctIDSource = false;
    }

    public void resetAllocSettlCurrency()
    {
        hasAllocSettlCurrency = false;
    }

    public void resetIndividualAllocID()
    {
        hasIndividualAllocID = false;
    }

    public void resetAllocQty()
    {
        hasAllocQty = false;
    }

    public void resetAllocCustomerCapacity()
    {
        hasAllocCustomerCapacity = false;
    }

    public void resetAllocMethod()
    {
        hasAllocMethod = false;
    }

    public void resetSecondaryIndividualAllocID()
    {
        hasSecondaryIndividualAllocID = false;
    }

    public void resetAllocClearingFeeIndicator()
    {
        hasAllocClearingFeeIndicator = false;
    }

    public void resetNested2PartyIDsGroup()
    {
        for (final Nested2PartyIDsGroupDecoder nested2PartyIDsGroupDecoder : nested2PartyIDsGroupIterator.iterator())
        {
            nested2PartyIDsGroupDecoder.reset();
            if (nested2PartyIDsGroupDecoder.next() == null)
            {
                break;
            }
        }
        noNested2PartyIDsGroupCounter = MISSING_INT;
        hasNoNested2PartyIDsGroupCounter = false;
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
            builder.append(this.allocAccount(), 0, allocAccountLength());
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
            builder.append(this.allocSettlCurrency(), 0, allocSettlCurrencyLength());
            builder.append("\",\n");
        }

        if (hasIndividualAllocID())
        {
            indent(builder, level);
            builder.append("\"IndividualAllocID\": \"");
            builder.append(this.individualAllocID(), 0, individualAllocIDLength());
            builder.append("\",\n");
        }

    if (hasNoNested2PartyIDsGroupCounter)
    {
        indent(builder, level);
        builder.append("\"Nested2PartyIDsGroup\": [\n");
        Nested2PartyIDsGroupDecoder nested2PartyIDsGroup = this.nested2PartyIDsGroup;
        for (int i = 0, size = this.noNested2PartyIDsGroupCounter; i < size; i++)
        {
            indent(builder, level);
            nested2PartyIDsGroup.appendTo(builder, level + 1);            if (nested2PartyIDsGroup.next() != null)
            {
                builder.append(',');
            }
            builder.append('\n');
            nested2PartyIDsGroup = nested2PartyIDsGroup.next();        }
        indent(builder, level);
        builder.append("],\n");
    }

        if (hasAllocQty())
        {
            indent(builder, level);
            builder.append("\"AllocQty\": \"");
            allocQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasAllocCustomerCapacity())
        {
            indent(builder, level);
            builder.append("\"AllocCustomerCapacity\": \"");
            builder.append(this.allocCustomerCapacity(), 0, allocCustomerCapacityLength());
            builder.append("\",\n");
        }

        if (hasAllocMethod())
        {
            indent(builder, level);
            builder.append("\"AllocMethod\": \"");
            builder.append(allocMethod);
            builder.append("\",\n");
        }

        if (hasSecondaryIndividualAllocID())
        {
            indent(builder, level);
            builder.append("\"SecondaryIndividualAllocID\": \"");
            builder.append(this.secondaryIndividualAllocID(), 0, secondaryIndividualAllocIDLength());
            builder.append("\",\n");
        }

        if (hasAllocClearingFeeIndicator())
        {
            indent(builder, level);
            builder.append("\"AllocClearingFeeIndicator\": \"");
            builder.append(this.allocClearingFeeIndicator(), 0, allocClearingFeeIndicatorLength());
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public AllocsGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((AllocsGroupEncoder)encoder);
    }

    public AllocsGroupEncoder toEncoder(final AllocsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasAllocAccount())
        {
            encoder.allocAccount(this.allocAccount(), 0, allocAccountLength());
        }

        if (hasAllocAcctIDSource())
        {
            encoder.allocAcctIDSource(this.allocAcctIDSource());
        }

        if (hasAllocSettlCurrency())
        {
            encoder.allocSettlCurrency(this.allocSettlCurrency(), 0, allocSettlCurrencyLength());
        }

        if (hasIndividualAllocID())
        {
            encoder.individualAllocID(this.individualAllocID(), 0, individualAllocIDLength());
        }


        final NestedParties2Encoder nestedParties2 = encoder.nestedParties2();        if (hasNoNested2PartyIDsGroupCounter)
        {
            final int size = this.noNested2PartyIDsGroupCounter;
            Nested2PartyIDsGroupDecoder nested2PartyIDsGroup = this.nested2PartyIDsGroup;
            Nested2PartyIDsGroupEncoder nested2PartyIDsGroupEncoder = nestedParties2.nested2PartyIDsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (nested2PartyIDsGroup != null)
                {
                    nested2PartyIDsGroup.toEncoder(nested2PartyIDsGroupEncoder);
                    nested2PartyIDsGroup = nested2PartyIDsGroup.next();
                    nested2PartyIDsGroupEncoder = nested2PartyIDsGroupEncoder.next();
                }
            }
        }


        if (hasAllocQty())
        {
            encoder.allocQty(this.allocQty());
        }

        if (hasAllocCustomerCapacity())
        {
            encoder.allocCustomerCapacity(this.allocCustomerCapacity(), 0, allocCustomerCapacityLength());
        }

        if (hasAllocMethod())
        {
            encoder.allocMethod(this.allocMethod());
        }

        if (hasSecondaryIndividualAllocID())
        {
            encoder.secondaryIndividualAllocID(this.secondaryIndividualAllocID(), 0, secondaryIndividualAllocIDLength());
        }

        if (hasAllocClearingFeeIndicator())
        {
            encoder.allocClearingFeeIndicator(this.allocClearingFeeIndicator(), 0, allocClearingFeeIndicatorLength());
        }
        return encoder;
    }

}
    public class AllocsGroupIterator implements Iterable<AllocsGroupDecoder>, java.util.Iterator<AllocsGroupDecoder>
    {
        private final TrdAllocGrpDecoder parent;
        private int remainder;
        private AllocsGroupDecoder current;

        public AllocsGroupIterator(final TrdAllocGrpDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }
        public AllocsGroupDecoder next()
        {
            remainder--;
            final AllocsGroupDecoder value = current;
            current = current.next();
            return value;
        }
        public int numberFieldValue()
        {
            return parent.hasNoAllocsGroupCounter() ? parent.noAllocsGroupCounter() : 0;
        }
        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.allocsGroup();
        }
        public AllocsGroupIterator iterator()
        {
            reset();
            return this;
        }
    }

public AllocsGroupIterator allocsGroupIterator();
    public int noAllocsGroupCounter();
    public boolean hasNoAllocsGroupCounter();
    public AllocsGroupDecoder allocsGroup();

}
