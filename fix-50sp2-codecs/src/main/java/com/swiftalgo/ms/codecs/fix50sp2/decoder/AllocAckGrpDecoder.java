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
import com.swiftalgo.ms.codecs.fix50sp2.builder.AllocAckGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.AllocAckGrpEncoder.AllocsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.NestedPartiesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.NestedPartiesEncoder.NestedPartyIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.NstdPtysSubGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.NstdPtysSubGrpEncoder.NestedPartySubIDsGroupEncoder;

public interface AllocAckGrpDecoder 
{



public class AllocsGroupDecoder extends CommonDecoderImpl implements NestedPartiesDecoder
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(0);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
        }
    }

    public final IntHashSet GROUP_FIELDS = new IntHashSet(26);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            GROUP_FIELDS.add(Constants.ALLOC_ACCOUNT);
            GROUP_FIELDS.add(Constants.ALLOC_ACCT_ID_SOURCE);
            GROUP_FIELDS.add(Constants.ALLOC_PRICE);
            GROUP_FIELDS.add(Constants.ALLOC_POSITION_EFFECT);
            GROUP_FIELDS.add(Constants.INDIVIDUAL_ALLOC_ID);
            GROUP_FIELDS.add(Constants.INDIVIDUAL_ALLOC_REJ_CODE);
            GROUP_FIELDS.add(Constants.ALLOC_TEXT);
            GROUP_FIELDS.add(Constants.ENCODED_ALLOC_TEXT_LEN);
            GROUP_FIELDS.add(Constants.ENCODED_ALLOC_TEXT);
            GROUP_FIELDS.add(Constants.SECONDARY_INDIVIDUAL_ALLOC_ID);
            GROUP_FIELDS.add(Constants.ALLOC_CUSTOMER_CAPACITY);
            GROUP_FIELDS.add(Constants.INDIVIDUAL_ALLOC_TYPE);
            GROUP_FIELDS.add(Constants.ALLOC_QTY);
        }
    }

    public final IntHashSet ALL_GROUP_FIELDS = new IntHashSet(26);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            ALL_GROUP_FIELDS.add(Constants.ALLOC_ACCOUNT);
            ALL_GROUP_FIELDS.add(Constants.ALLOC_ACCT_ID_SOURCE);
            ALL_GROUP_FIELDS.add(Constants.ALLOC_PRICE);
            ALL_GROUP_FIELDS.add(Constants.ALLOC_POSITION_EFFECT);
            ALL_GROUP_FIELDS.add(Constants.INDIVIDUAL_ALLOC_ID);
            ALL_GROUP_FIELDS.add(Constants.INDIVIDUAL_ALLOC_REJ_CODE);
            ALL_GROUP_FIELDS.add(Constants.ALLOC_TEXT);
            ALL_GROUP_FIELDS.add(Constants.ENCODED_ALLOC_TEXT_LEN);
            ALL_GROUP_FIELDS.add(Constants.ENCODED_ALLOC_TEXT);
            ALL_GROUP_FIELDS.add(Constants.SECONDARY_INDIVIDUAL_ALLOC_ID);
            ALL_GROUP_FIELDS.add(Constants.ALLOC_CUSTOMER_CAPACITY);
            ALL_GROUP_FIELDS.add(Constants.INDIVIDUAL_ALLOC_TYPE);
            ALL_GROUP_FIELDS.add(Constants.ALLOC_QTY);
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
        if (hasAllocPositionEffect)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !AllocPositionEffect.isValid(allocPositionEffect()))
        {
            invalidTagId = 1047;
            rejectReason = 5;
            return false;
        }
        }

        if (hasIndividualAllocType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !IndividualAllocType.isValid(individualAllocType()))
        {
            invalidTagId = 992;
            rejectReason = 5;
            return false;
        }
        }
        if (hasNoNestedPartyIDsGroupCounter)
        {
            {
                int count = 0;
                final NestedPartyIDsGroupIterator iterator = nestedPartyIDsGroupIterator.iterator();
                for (final NestedPartyIDsGroupDecoder group : iterator)
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
                    invalidTagId = 539;
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

    private IntHashSet seenFields = new IntHashSet(28);

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


    private final CharArrayWrapper allocAccountWrapper = new CharArrayWrapper();
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



    private DecimalFloat allocPrice = DecimalFloat.newNaNValue();

    private boolean hasAllocPrice;

    public DecimalFloat allocPrice()
    {
        if (!hasAllocPrice)
        {
            throw new IllegalArgumentException("No value for optional field: AllocPrice");
        }

        return allocPrice;
    }

    public boolean hasAllocPrice()
    {
        return hasAllocPrice;
    }



    private char allocPositionEffect = MISSING_CHAR;

    private boolean hasAllocPositionEffect;

    public char allocPositionEffect()
    {
        if (!hasAllocPositionEffect)
        {
            throw new IllegalArgumentException("No value for optional field: AllocPositionEffect");
        }

        return allocPositionEffect;
    }

    public boolean hasAllocPositionEffect()
    {
        return hasAllocPositionEffect;
    }



    private final CharArrayWrapper allocPositionEffectWrapper = new CharArrayWrapper();
    public AllocPositionEffect allocPositionEffectAsEnum()
    {
        if (!hasAllocPositionEffect)
 return AllocPositionEffect.NULL_VAL;
        return AllocPositionEffect.decode(allocPositionEffect);
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


    private final CharArrayWrapper individualAllocIDWrapper = new CharArrayWrapper();
    private int individualAllocRejCode = MISSING_INT;

    private boolean hasIndividualAllocRejCode;

    public int individualAllocRejCode()
    {
        if (!hasIndividualAllocRejCode)
        {
            throw new IllegalArgumentException("No value for optional field: IndividualAllocRejCode");
        }

        return individualAllocRejCode;
    }

    public boolean hasIndividualAllocRejCode()
    {
        return hasIndividualAllocRejCode;
    }





    private NestedPartyIDsGroupDecoder nestedPartyIDsGroup = null;
    public NestedPartyIDsGroupDecoder nestedPartyIDsGroup()
    {
        return nestedPartyIDsGroup;
    }

    private int noNestedPartyIDsGroupCounter = MISSING_INT;

    private boolean hasNoNestedPartyIDsGroupCounter;

    public int noNestedPartyIDsGroupCounter()
    {
        if (!hasNoNestedPartyIDsGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoNestedPartyIDsGroupCounter");
        }

        return noNestedPartyIDsGroupCounter;
    }

    public boolean hasNoNestedPartyIDsGroupCounter()
    {
        return hasNoNestedPartyIDsGroupCounter;
    }




    private NestedPartyIDsGroupIterator nestedPartyIDsGroupIterator = new NestedPartyIDsGroupIterator(this);
    public NestedPartyIDsGroupIterator nestedPartyIDsGroupIterator()
    {
        return nestedPartyIDsGroupIterator.iterator();
    }


    private char[] allocText = new char[1];

    private boolean hasAllocText;

    public char[] allocText()
    {
        if (!hasAllocText)
        {
            throw new IllegalArgumentException("No value for optional field: AllocText");
        }

        return allocText;
    }

    public boolean hasAllocText()
    {
        return hasAllocText;
    }


    private int allocTextOffset;

    private int allocTextLength;

    public int allocTextLength()
    {
        if (!hasAllocText)
        {
            throw new IllegalArgumentException("No value for optional field: AllocText");
        }

        return allocTextLength;
    }

    public String allocTextAsString()
    {
        return hasAllocText ? new String(allocText, 0, allocTextLength) : null;
    }

    public void allocText(final AsciiSequenceView view)
    {
        if (!hasAllocText)
        {
            throw new IllegalArgumentException("No value for optional field: AllocText");
        }

        view.wrap(buffer, allocTextOffset, allocTextLength);
    }


    private final CharArrayWrapper allocTextWrapper = new CharArrayWrapper();
    private int encodedAllocTextLen = MISSING_INT;

    private boolean hasEncodedAllocTextLen;

    public int encodedAllocTextLen()
    {
        if (!hasEncodedAllocTextLen)
        {
            throw new IllegalArgumentException("No value for optional field: EncodedAllocTextLen");
        }

        return encodedAllocTextLen;
    }

    public boolean hasEncodedAllocTextLen()
    {
        return hasEncodedAllocTextLen;
    }



    private byte[] encodedAllocText = new byte[1];

    private boolean hasEncodedAllocText;

    public byte[] encodedAllocText()
    {
        if (!hasEncodedAllocText)
        {
            throw new IllegalArgumentException("No value for optional field: EncodedAllocText");
        }

        return encodedAllocText;
    }

    public boolean hasEncodedAllocText()
    {
        return hasEncodedAllocText;
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


    private final CharArrayWrapper secondaryIndividualAllocIDWrapper = new CharArrayWrapper();
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


    private final CharArrayWrapper allocCustomerCapacityWrapper = new CharArrayWrapper();
    private int individualAllocType = MISSING_INT;

    private boolean hasIndividualAllocType;

    public int individualAllocType()
    {
        if (!hasIndividualAllocType)
        {
            throw new IllegalArgumentException("No value for optional field: IndividualAllocType");
        }

        return individualAllocType;
    }

    public boolean hasIndividualAllocType()
    {
        return hasIndividualAllocType;
    }



    private final CharArrayWrapper individualAllocTypeWrapper = new CharArrayWrapper();
    public IndividualAllocType individualAllocTypeAsEnum()
    {
        if (!hasIndividualAllocType)
 return IndividualAllocType.NULL_VAL;
        return IndividualAllocType.decode(individualAllocType);
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

            case Constants.ALLOC_PRICE:
                hasAllocPrice = true;
                allocPrice = getFloat(buffer, allocPrice, valueOffset, valueLength, 366, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.ALLOC_POSITION_EFFECT:
                hasAllocPositionEffect = true;
                allocPositionEffect = buffer.getChar(valueOffset);
                break;

            case Constants.INDIVIDUAL_ALLOC_ID:
                hasIndividualAllocID = true;
                individualAllocID = buffer.getChars(individualAllocID, valueOffset, valueLength);
                individualAllocIDOffset = valueOffset;
                individualAllocIDLength = valueLength;
                break;

            case Constants.INDIVIDUAL_ALLOC_REJ_CODE:
                hasIndividualAllocRejCode = true;
                individualAllocRejCode = getInt(buffer, valueOffset, endOfField, 776, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.NO_NESTED_PARTY_IDS_GROUP_COUNTER:
                hasNoNestedPartyIDsGroupCounter = true;
                noNestedPartyIDsGroupCounter = getInt(buffer, valueOffset, endOfField, 539, CODEC_VALIDATION_ENABLED);
                if (nestedPartyIDsGroup == null)
                {
                    nestedPartyIDsGroup = new NestedPartyIDsGroupDecoder(trailer, messageFields);
                }
                NestedPartyIDsGroupDecoder nestedPartyIDsGroupCurrent = nestedPartyIDsGroup;
                position = endOfField + 1;
                final int noNestedPartyIDsGroupCounter = this.noNestedPartyIDsGroupCounter;
                for (int i = 0; i < noNestedPartyIDsGroupCounter && position < end; i++)
                {
                    if (nestedPartyIDsGroupCurrent != null)
                    {
                        position += nestedPartyIDsGroupCurrent.decode(buffer, position, end - position);
                        nestedPartyIDsGroupCurrent = nestedPartyIDsGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (nestedPartyIDsGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;


            case Constants.ALLOC_TEXT:
                hasAllocText = true;
                allocText = buffer.getChars(allocText, valueOffset, valueLength);
                allocTextOffset = valueOffset;
                allocTextLength = valueLength;
                break;

            case Constants.ENCODED_ALLOC_TEXT_LEN:
                hasEncodedAllocTextLen = true;
                encodedAllocTextLen = getInt(buffer, valueOffset, endOfField, 360, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.ENCODED_ALLOC_TEXT:
                hasEncodedAllocText = true;
                encodedAllocText = buffer.getBytes(encodedAllocText, valueOffset, encodedAllocTextLen);
                endOfField = valueOffset + encodedAllocTextLen;
                break;

            case Constants.SECONDARY_INDIVIDUAL_ALLOC_ID:
                hasSecondaryIndividualAllocID = true;
                secondaryIndividualAllocID = buffer.getChars(secondaryIndividualAllocID, valueOffset, valueLength);
                secondaryIndividualAllocIDOffset = valueOffset;
                secondaryIndividualAllocIDLength = valueLength;
                break;

            case Constants.ALLOC_CUSTOMER_CAPACITY:
                hasAllocCustomerCapacity = true;
                allocCustomerCapacity = buffer.getChars(allocCustomerCapacity, valueOffset, valueLength);
                allocCustomerCapacityOffset = valueOffset;
                allocCustomerCapacityLength = valueLength;
                break;

            case Constants.INDIVIDUAL_ALLOC_TYPE:
                hasIndividualAllocType = true;
                individualAllocType = getInt(buffer, valueOffset, endOfField, 992, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.ALLOC_QTY:
                hasAllocQty = true;
                allocQty = getFloat(buffer, allocQty, valueOffset, valueLength, 80, CODEC_VALIDATION_ENABLED);
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
        this.resetNestedPartyIDsGroup();
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
        hasIndividualAllocID = false;
    }

    public void resetIndividualAllocRejCode()
    {
        hasIndividualAllocRejCode = false;
    }

    public void resetAllocText()
    {
        hasAllocText = false;
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
        hasSecondaryIndividualAllocID = false;
    }

    public void resetAllocCustomerCapacity()
    {
        hasAllocCustomerCapacity = false;
    }

    public void resetIndividualAllocType()
    {
        hasIndividualAllocType = false;
    }

    public void resetAllocQty()
    {
        hasAllocQty = false;
    }

    public void resetNestedPartyIDsGroup()
    {
        for (final NestedPartyIDsGroupDecoder nestedPartyIDsGroupDecoder : nestedPartyIDsGroupIterator.iterator())
        {
            nestedPartyIDsGroupDecoder.reset();
            if (nestedPartyIDsGroupDecoder.next() == null)
            {
                break;
            }
        }
        noNestedPartyIDsGroupCounter = MISSING_INT;
        hasNoNestedPartyIDsGroupCounter = false;
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
            builder.append(this.individualAllocID(), 0, individualAllocIDLength());
            builder.append("\",\n");
        }

        if (hasIndividualAllocRejCode())
        {
            indent(builder, level);
            builder.append("\"IndividualAllocRejCode\": \"");
            builder.append(individualAllocRejCode);
            builder.append("\",\n");
        }

        if (hasNoNestedPartyIDsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"NestedPartyIDsGroup\": [\n");
            NestedPartyIDsGroupDecoder nestedPartyIDsGroup = this.nestedPartyIDsGroup;
            for (int i = 0, size = this.noNestedPartyIDsGroupCounter; i < size; i++)
            {
                indent(builder, level);
                nestedPartyIDsGroup.appendTo(builder, level + 1);
                if (nestedPartyIDsGroup.next() != null)
                {
                    builder.append(',');
                }
                builder.append('\n');
                nestedPartyIDsGroup = nestedPartyIDsGroup.next();            }
            indent(builder, level);
            builder.append("],\n");
        }

        if (hasAllocText())
        {
            indent(builder, level);
            builder.append("\"AllocText\": \"");
            builder.append(this.allocText(), 0, allocTextLength());
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
            builder.append(this.secondaryIndividualAllocID(), 0, secondaryIndividualAllocIDLength());
            builder.append("\",\n");
        }

        if (hasAllocCustomerCapacity())
        {
            indent(builder, level);
            builder.append("\"AllocCustomerCapacity\": \"");
            builder.append(this.allocCustomerCapacity(), 0, allocCustomerCapacityLength());
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
    public AllocAckGrpEncoder.AllocsGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((AllocAckGrpEncoder.AllocsGroupEncoder)encoder);
    }

    public AllocAckGrpEncoder.AllocsGroupEncoder toEncoder(final AllocAckGrpEncoder.AllocsGroupEncoder encoder)
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
            encoder.individualAllocID(this.individualAllocID(), 0, individualAllocIDLength());
        }

        if (hasIndividualAllocRejCode())
        {
            encoder.individualAllocRejCode(this.individualAllocRejCode());
        }


        final NestedPartiesEncoder nestedParties = encoder.nestedParties();        if (hasNoNestedPartyIDsGroupCounter)
        {
            final int size = this.noNestedPartyIDsGroupCounter;
            NestedPartyIDsGroupDecoder nestedPartyIDsGroup = this.nestedPartyIDsGroup;
            NestedPartyIDsGroupEncoder nestedPartyIDsGroupEncoder = nestedParties.nestedPartyIDsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (nestedPartyIDsGroup != null)
                {
                    nestedPartyIDsGroup.toEncoder(nestedPartyIDsGroupEncoder);
                    nestedPartyIDsGroup = nestedPartyIDsGroup.next();
                    nestedPartyIDsGroupEncoder = nestedPartyIDsGroupEncoder.next();
                }
            }
        }


        if (hasAllocText())
        {
            encoder.allocText(this.allocText(), 0, allocTextLength());
        }

        if (hasEncodedAllocTextLen())
        {
            encoder.encodedAllocTextLen(this.encodedAllocTextLen());
        }

        if (hasEncodedAllocText())
        {
            encoder.encodedAllocTextAsCopy(this.encodedAllocText(), 0, encodedAllocTextLen());
            encoder.encodedAllocTextLen(this.encodedAllocTextLen());
        }

        if (hasSecondaryIndividualAllocID())
        {
            encoder.secondaryIndividualAllocID(this.secondaryIndividualAllocID(), 0, secondaryIndividualAllocIDLength());
        }

        if (hasAllocCustomerCapacity())
        {
            encoder.allocCustomerCapacity(this.allocCustomerCapacity(), 0, allocCustomerCapacityLength());
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
    public class AllocsGroupIterator implements Iterable<AllocsGroupDecoder>, java.util.Iterator<AllocsGroupDecoder>
    {
        private final AllocAckGrpDecoder parent;
        private int remainder;
        private AllocsGroupDecoder current;

        public AllocsGroupIterator(final AllocAckGrpDecoder parent)
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
