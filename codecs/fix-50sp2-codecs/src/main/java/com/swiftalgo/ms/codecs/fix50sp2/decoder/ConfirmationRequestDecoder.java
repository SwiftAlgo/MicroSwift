/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2.decoder;

import org.agrona.AsciiNumberFormatException;
import org.agrona.MutableDirectBuffer;
import org.agrona.AsciiSequenceView;
import static uk.co.real_logic.artio.dictionary.generation.CodecUtil.*;
import static uk.co.real_logic.artio.dictionary.SessionConstants.*;
import uk.co.real_logic.artio.builder.Decoder;
import com.swiftalgo.ms.codecs.fix50sp2.decoder.HeaderDecoder;
import com.swiftalgo.ms.codecs.fix50sp2.decoder.TrailerDecoder;
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
import com.swiftalgo.ms.codecs.fix50sp2.builder.ConfirmationRequestEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.OrdAllocGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.OrdAllocGrpEncoder.OrdersGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.NestedParties2Encoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.NestedParties2Encoder.Nested2PartyIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.NstdPtys2SubGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.NstdPtys2SubGrpEncoder.Nested2PartySubIDsGroupEncoder;


public class ConfirmationRequestDecoder extends CommonDecoderImpl implements OrdAllocGrpDecoder, MessageDecoder
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(6);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            REQUIRED_FIELDS.add(Constants.CONFIRM_REQ_ID);
            REQUIRED_FIELDS.add(Constants.CONFIRM_TYPE);
            REQUIRED_FIELDS.add(Constants.TRANSACT_TIME);
        }
    }

    public final IntHashSet GROUP_FIELDS = new IntHashSet(24);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            GROUP_FIELDS.add(Constants.CONFIRM_REQ_ID);
            GROUP_FIELDS.add(Constants.CONFIRM_TYPE);
            GROUP_FIELDS.add(Constants.ALLOC_ID);
            GROUP_FIELDS.add(Constants.SECONDARY_ALLOC_ID);
            GROUP_FIELDS.add(Constants.INDIVIDUAL_ALLOC_ID);
            GROUP_FIELDS.add(Constants.TRANSACT_TIME);
            GROUP_FIELDS.add(Constants.ALLOC_ACCOUNT);
            GROUP_FIELDS.add(Constants.ALLOC_ACCT_ID_SOURCE);
            GROUP_FIELDS.add(Constants.ALLOC_ACCOUNT_TYPE);
            GROUP_FIELDS.add(Constants.TEXT);
            GROUP_FIELDS.add(Constants.ENCODED_TEXT_LEN);
            GROUP_FIELDS.add(Constants.ENCODED_TEXT);
        }
    }

    private final IntHashSet alreadyVisitedFields = new IntHashSet(24);

    private final IntHashSet unknownFields = new IntHashSet(10);

    private final IntHashSet missingRequiredFields = new IntHashSet(6);

    public boolean validate()
    {
        if (rejectReason != Decoder.NO_ERROR)
        {
            return false;
        }
        final IntIterator missingFieldsIterator = missingRequiredFields.iterator();
        final IntIterator unknownFieldsIterator = unknownFields.iterator();
        if (CODEC_REJECT_UNKNOWN_FIELD_ENABLED && unknownFieldsIterator.hasNext())
        {
            invalidTagId = unknownFieldsIterator.nextValue();
            rejectReason = Constants.ALL_FIELDS.contains(invalidTagId) ? 2 : 0;
            return false;
        }
        if (!header.validate())
        {
            invalidTagId = header.invalidTagId();
            rejectReason = header.rejectReason();
            return false;
        }
        else if (!trailer.validate())
        {
            invalidTagId = trailer.invalidTagId();
            rejectReason = trailer.rejectReason();
            return false;
        }
        if (missingFieldsIterator.hasNext())
        {
            invalidTagId = missingFieldsIterator.nextValue();
            rejectReason = 1;
            return false;
        }
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !ConfirmType.isValid(confirmType()))
        {
            invalidTagId = 773;
            rejectReason = 5;
            return false;
        }

        if (hasAllocAccountType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !AllocAccountType.isValid(allocAccountType()))
        {
            invalidTagId = 798;
            rejectReason = 5;
            return false;
        }
        }
        if (hasNoOrdersGroupCounter)
        {
            {
                int count = 0;
                final OrdersGroupIterator iterator = ordersGroupIterator.iterator();
                for (final OrdersGroupDecoder group : iterator)
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
                    invalidTagId = 73;
                    rejectReason = 16;
                    return false;
                }
            }
        }
        return true;
    }

    public static final long MESSAGE_TYPE = 18498L;

    public static final String MESSAGE_TYPE_AS_STRING = "BH";

    public static final char[] MESSAGE_TYPE_CHARS = MESSAGE_TYPE_AS_STRING.toCharArray();

    public static final byte[] MESSAGE_TYPE_BYTES = MESSAGE_TYPE_AS_STRING.getBytes(US_ASCII);

    public final IntHashSet messageFields = new IntHashSet(120);

    {
        messageFields.add(Constants.BEGIN_STRING);
        messageFields.add(Constants.BODY_LENGTH);
        messageFields.add(Constants.MSG_TYPE);
        messageFields.add(Constants.APPL_VER_ID);
        messageFields.add(Constants.APPL_EXT_ID);
        messageFields.add(Constants.CSTM_APPL_VER_ID);
        messageFields.add(Constants.SENDER_COMP_ID);
        messageFields.add(Constants.TARGET_COMP_ID);
        messageFields.add(Constants.ON_BEHALF_OF_COMP_ID);
        messageFields.add(Constants.DELIVER_TO_COMP_ID);
        messageFields.add(Constants.SECURE_DATA_LEN);
        messageFields.add(Constants.SECURE_DATA);
        messageFields.add(Constants.MSG_SEQ_NUM);
        messageFields.add(Constants.SENDER_SUB_ID);
        messageFields.add(Constants.SENDER_LOCATION_ID);
        messageFields.add(Constants.TARGET_SUB_ID);
        messageFields.add(Constants.TARGET_LOCATION_ID);
        messageFields.add(Constants.ON_BEHALF_OF_SUB_ID);
        messageFields.add(Constants.ON_BEHALF_OF_LOCATION_ID);
        messageFields.add(Constants.DELIVER_TO_SUB_ID);
        messageFields.add(Constants.DELIVER_TO_LOCATION_ID);
        messageFields.add(Constants.POSS_DUP_FLAG);
        messageFields.add(Constants.POSS_RESEND);
        messageFields.add(Constants.SENDING_TIME);
        messageFields.add(Constants.ORIG_SENDING_TIME);
        messageFields.add(Constants.XML_DATA_LEN);
        messageFields.add(Constants.XML_DATA);
        messageFields.add(Constants.MESSAGE_ENCODING);
        messageFields.add(Constants.LAST_MSG_SEQ_NUM_PROCESSED);
        messageFields.add(Constants.CONFIRM_REQ_ID);
        messageFields.add(Constants.CONFIRM_TYPE);
        messageFields.add(Constants.NO_ORDERS_GROUP_COUNTER);
        messageFields.add(Constants.CL_ORD_ID);
        messageFields.add(Constants.ORDER_ID);
        messageFields.add(Constants.SECONDARY_ORDER_ID);
        messageFields.add(Constants.SECONDARY_CL_ORD_ID);
        messageFields.add(Constants.LIST_ID);
        messageFields.add(Constants.NO_NESTED2_PARTY_IDS_GROUP_COUNTER);
        messageFields.add(Constants.NESTED2_PARTY_ID);
        messageFields.add(Constants.NESTED2_PARTY_ID_SOURCE);
        messageFields.add(Constants.NESTED2_PARTY_ROLE);
        messageFields.add(Constants.NO_NESTED2_PARTY_SUB_IDS_GROUP_COUNTER);
        messageFields.add(Constants.NESTED2_PARTY_SUB_ID);
        messageFields.add(Constants.NESTED2_PARTY_SUB_ID_TYPE);
        messageFields.add(Constants.ORDER_QTY);
        messageFields.add(Constants.ORDER_AVG_PX);
        messageFields.add(Constants.ORDER_BOOKING_QTY);
        messageFields.add(Constants.ALLOC_ID);
        messageFields.add(Constants.SECONDARY_ALLOC_ID);
        messageFields.add(Constants.INDIVIDUAL_ALLOC_ID);
        messageFields.add(Constants.TRANSACT_TIME);
        messageFields.add(Constants.ALLOC_ACCOUNT);
        messageFields.add(Constants.ALLOC_ACCT_ID_SOURCE);
        messageFields.add(Constants.ALLOC_ACCOUNT_TYPE);
        messageFields.add(Constants.TEXT);
        messageFields.add(Constants.ENCODED_TEXT_LEN);
        messageFields.add(Constants.ENCODED_TEXT);
        messageFields.add(Constants.SIGNATURE_LENGTH);
        messageFields.add(Constants.SIGNATURE);
        messageFields.add(Constants.CHECK_SUM);
    }

    private final TrailerDecoder trailer = new TrailerDecoder();

    public TrailerDecoder trailer()
    {
        return trailer;
    }

    private final HeaderDecoder header = new HeaderDecoder(trailer);

    public HeaderDecoder header()
    {
        return header;
    }

    private char[] confirmReqID = new char[1];

    public char[] confirmReqID()
    {
        return confirmReqID;
    }


    private int confirmReqIDOffset;

    private int confirmReqIDLength;

    public int confirmReqIDLength()
    {
        return confirmReqIDLength;
    }

    public String confirmReqIDAsString()
    {
        return new String(confirmReqID, 0, confirmReqIDLength);
    }

    public void confirmReqID(final AsciiSequenceView view)
    {
        view.wrap(buffer, confirmReqIDOffset, confirmReqIDLength);
    }


    private final CharArrayWrapper confirmReqIDWrapper = new CharArrayWrapper();
    private int confirmType = MISSING_INT;

    public int confirmType()
    {
        return confirmType;
    }



    private final CharArrayWrapper confirmTypeWrapper = new CharArrayWrapper();
    public ConfirmType confirmTypeAsEnum()
    {
        return ConfirmType.decode(confirmType);
    }



    private OrdersGroupDecoder ordersGroup = null;
    public OrdersGroupDecoder ordersGroup()
    {
        return ordersGroup;
    }

    private int noOrdersGroupCounter = MISSING_INT;

    private boolean hasNoOrdersGroupCounter;

    public int noOrdersGroupCounter()
    {
        if (!hasNoOrdersGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoOrdersGroupCounter");
        }

        return noOrdersGroupCounter;
    }

    public boolean hasNoOrdersGroupCounter()
    {
        return hasNoOrdersGroupCounter;
    }




    private OrdersGroupIterator ordersGroupIterator = new OrdersGroupIterator(this);
    public OrdersGroupIterator ordersGroupIterator()
    {
        return ordersGroupIterator.iterator();
    }


    private char[] allocID = new char[1];

    private boolean hasAllocID;

    public char[] allocID()
    {
        if (!hasAllocID)
        {
            throw new IllegalArgumentException("No value for optional field: AllocID");
        }

        return allocID;
    }

    public boolean hasAllocID()
    {
        return hasAllocID;
    }


    private int allocIDOffset;

    private int allocIDLength;

    public int allocIDLength()
    {
        if (!hasAllocID)
        {
            throw new IllegalArgumentException("No value for optional field: AllocID");
        }

        return allocIDLength;
    }

    public String allocIDAsString()
    {
        return hasAllocID ? new String(allocID, 0, allocIDLength) : null;
    }

    public void allocID(final AsciiSequenceView view)
    {
        if (!hasAllocID)
        {
            throw new IllegalArgumentException("No value for optional field: AllocID");
        }

        view.wrap(buffer, allocIDOffset, allocIDLength);
    }


    private final CharArrayWrapper allocIDWrapper = new CharArrayWrapper();
    private char[] secondaryAllocID = new char[1];

    private boolean hasSecondaryAllocID;

    public char[] secondaryAllocID()
    {
        if (!hasSecondaryAllocID)
        {
            throw new IllegalArgumentException("No value for optional field: SecondaryAllocID");
        }

        return secondaryAllocID;
    }

    public boolean hasSecondaryAllocID()
    {
        return hasSecondaryAllocID;
    }


    private int secondaryAllocIDOffset;

    private int secondaryAllocIDLength;

    public int secondaryAllocIDLength()
    {
        if (!hasSecondaryAllocID)
        {
            throw new IllegalArgumentException("No value for optional field: SecondaryAllocID");
        }

        return secondaryAllocIDLength;
    }

    public String secondaryAllocIDAsString()
    {
        return hasSecondaryAllocID ? new String(secondaryAllocID, 0, secondaryAllocIDLength) : null;
    }

    public void secondaryAllocID(final AsciiSequenceView view)
    {
        if (!hasSecondaryAllocID)
        {
            throw new IllegalArgumentException("No value for optional field: SecondaryAllocID");
        }

        view.wrap(buffer, secondaryAllocIDOffset, secondaryAllocIDLength);
    }


    private final CharArrayWrapper secondaryAllocIDWrapper = new CharArrayWrapper();
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
    private byte[] transactTime = new byte[24];

    public byte[] transactTime()
    {
        return transactTime;
    }


    private int transactTimeOffset;

    private int transactTimeLength;

    public int transactTimeLength()
    {
        return transactTimeLength;
    }

    public String transactTimeAsString()
    {
        return new String(transactTime, 0, transactTimeLength);
    }

    public void transactTime(final AsciiSequenceView view)
    {
        view.wrap(buffer, transactTimeOffset, transactTimeLength);
    }


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



    private int allocAccountType = MISSING_INT;

    private boolean hasAllocAccountType;

    public int allocAccountType()
    {
        if (!hasAllocAccountType)
        {
            throw new IllegalArgumentException("No value for optional field: AllocAccountType");
        }

        return allocAccountType;
    }

    public boolean hasAllocAccountType()
    {
        return hasAllocAccountType;
    }



    private final CharArrayWrapper allocAccountTypeWrapper = new CharArrayWrapper();
    public AllocAccountType allocAccountTypeAsEnum()
    {
        if (!hasAllocAccountType)
 return AllocAccountType.NULL_VAL;
        return AllocAccountType.decode(allocAccountType);
    }

    private char[] text = new char[1];

    private boolean hasText;

    public char[] text()
    {
        if (!hasText)
        {
            throw new IllegalArgumentException("No value for optional field: Text");
        }

        return text;
    }

    public boolean hasText()
    {
        return hasText;
    }


    private int textOffset;

    private int textLength;

    public int textLength()
    {
        if (!hasText)
        {
            throw new IllegalArgumentException("No value for optional field: Text");
        }

        return textLength;
    }

    public String textAsString()
    {
        return hasText ? new String(text, 0, textLength) : null;
    }

    public void text(final AsciiSequenceView view)
    {
        if (!hasText)
        {
            throw new IllegalArgumentException("No value for optional field: Text");
        }

        view.wrap(buffer, textOffset, textLength);
    }


    private final CharArrayWrapper textWrapper = new CharArrayWrapper();
    private int encodedTextLen = MISSING_INT;

    private boolean hasEncodedTextLen;

    public int encodedTextLen()
    {
        if (!hasEncodedTextLen)
        {
            throw new IllegalArgumentException("No value for optional field: EncodedTextLen");
        }

        return encodedTextLen;
    }

    public boolean hasEncodedTextLen()
    {
        return hasEncodedTextLen;
    }



    private byte[] encodedText = new byte[1];

    private boolean hasEncodedText;

    public byte[] encodedText()
    {
        if (!hasEncodedText)
        {
            throw new IllegalArgumentException("No value for optional field: EncodedText");
        }

        return encodedText;
    }

    public boolean hasEncodedText()
    {
        return hasEncodedText;
    }



    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode ConfirmationRequest
        int seenFieldCount = 0;
        if (CODEC_VALIDATION_ENABLED)
        {
            missingRequiredFields.copy(REQUIRED_FIELDS);
            alreadyVisitedFields.clear();
        }
        this.buffer = buffer;
        final int end = offset + length;
        int position = offset;
        position += header.decode(buffer, position, length);
        int tag;

        while (position < end)
        {
            final int equalsPosition = buffer.scan(position, end, '=');
            if (equalsPosition == AsciiBuffer.UNKNOWN_INDEX)
            {
               return position;
            }
            tag = buffer.getInt(position, equalsPosition);
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
                if (!alreadyVisitedFields.add(tag))
                {
                    invalidTagId = tag;
                    rejectReason = 13;
                }
                missingRequiredFields.remove(tag);
                seenFieldCount++;
            }

            switch (tag)
            {
            case Constants.CONFIRM_REQ_ID:
                confirmReqID = buffer.getChars(confirmReqID, valueOffset, valueLength);
                confirmReqIDOffset = valueOffset;
                confirmReqIDLength = valueLength;
                break;

            case Constants.CONFIRM_TYPE:
                confirmType = getInt(buffer, valueOffset, endOfField, 773, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.NO_ORDERS_GROUP_COUNTER:
                hasNoOrdersGroupCounter = true;
                noOrdersGroupCounter = getInt(buffer, valueOffset, endOfField, 73, CODEC_VALIDATION_ENABLED);
                if (ordersGroup == null)
                {
                    ordersGroup = new OrdersGroupDecoder(trailer, messageFields);
                }
                OrdersGroupDecoder ordersGroupCurrent = ordersGroup;
                position = endOfField + 1;
                final int noOrdersGroupCounter = this.noOrdersGroupCounter;
                for (int i = 0; i < noOrdersGroupCounter && position < end; i++)
                {
                    if (ordersGroupCurrent != null)
                    {
                        position += ordersGroupCurrent.decode(buffer, position, end - position);
                        ordersGroupCurrent = ordersGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (ordersGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;


            case Constants.ALLOC_ID:
                hasAllocID = true;
                allocID = buffer.getChars(allocID, valueOffset, valueLength);
                allocIDOffset = valueOffset;
                allocIDLength = valueLength;
                break;

            case Constants.SECONDARY_ALLOC_ID:
                hasSecondaryAllocID = true;
                secondaryAllocID = buffer.getChars(secondaryAllocID, valueOffset, valueLength);
                secondaryAllocIDOffset = valueOffset;
                secondaryAllocIDLength = valueLength;
                break;

            case Constants.INDIVIDUAL_ALLOC_ID:
                hasIndividualAllocID = true;
                individualAllocID = buffer.getChars(individualAllocID, valueOffset, valueLength);
                individualAllocIDOffset = valueOffset;
                individualAllocIDLength = valueLength;
                break;

            case Constants.TRANSACT_TIME:
                transactTime = buffer.getBytes(transactTime, valueOffset, valueLength);
                transactTimeOffset = valueOffset;
                transactTimeLength = valueLength;
                break;

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

            case Constants.ALLOC_ACCOUNT_TYPE:
                hasAllocAccountType = true;
                allocAccountType = getInt(buffer, valueOffset, endOfField, 798, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.TEXT:
                hasText = true;
                text = buffer.getChars(text, valueOffset, valueLength);
                textOffset = valueOffset;
                textLength = valueLength;
                break;

            case Constants.ENCODED_TEXT_LEN:
                hasEncodedTextLen = true;
                encodedTextLen = getInt(buffer, valueOffset, endOfField, 354, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.ENCODED_TEXT:
                hasEncodedText = true;
                encodedText = buffer.getBytes(encodedText, valueOffset, encodedTextLen);
                endOfField = valueOffset + encodedTextLen;
                break;

            default:
                if (!CODEC_REJECT_UNKNOWN_FIELD_ENABLED)
                {
                    alreadyVisitedFields.remove(tag);
                }
                else
                {
                    if (!(trailer.REQUIRED_FIELDS.contains(tag)))
                    {
                        unknownFields.add(tag);
                    }
                }
                if (CODEC_REJECT_UNKNOWN_FIELD_ENABLED || (trailer.REQUIRED_FIELDS.contains(tag)))
                {
                    position += trailer.decode(buffer, position, end - position);
                    return position - offset;
                }

            }

            if (position < (endOfField + 1))
            {
                position = endOfField + 1;
            }
        }
        position += trailer.decode(buffer, position, end - position);
        return position - offset;
    }

    public void reset()
    {
        header.reset();
        trailer.reset();
        resetMessage();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
            unknownFields.clear();
            alreadyVisitedFields.clear();
        }
    }

    public void resetMessage()
    {
        this.resetConfirmReqID();
        this.resetConfirmType();
        this.resetAllocID();
        this.resetSecondaryAllocID();
        this.resetIndividualAllocID();
        this.resetTransactTime();
        this.resetAllocAccount();
        this.resetAllocAcctIDSource();
        this.resetAllocAccountType();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        this.resetOrdersGroup();
    }

    public void resetConfirmReqID()
    {
        confirmReqIDOffset = 0;
        confirmReqIDLength = 0;
    }

    public void resetConfirmType()
    {
        confirmType = MISSING_INT;
    }

    public void resetAllocID()
    {
        hasAllocID = false;
    }

    public void resetSecondaryAllocID()
    {
        hasSecondaryAllocID = false;
    }

    public void resetIndividualAllocID()
    {
        hasIndividualAllocID = false;
    }

    public void resetTransactTime()
    {
    }

    public void resetAllocAccount()
    {
        hasAllocAccount = false;
    }

    public void resetAllocAcctIDSource()
    {
        hasAllocAcctIDSource = false;
    }

    public void resetAllocAccountType()
    {
        hasAllocAccountType = false;
    }

    public void resetText()
    {
        hasText = false;
    }

    public void resetEncodedTextLen()
    {
        hasEncodedTextLen = false;
    }

    public void resetEncodedText()
    {
        hasEncodedText = false;
    }

    public void resetOrdersGroup()
    {
        for (final OrdersGroupDecoder ordersGroupDecoder : ordersGroupIterator.iterator())
        {
            ordersGroupDecoder.reset();
            if (ordersGroupDecoder.next() == null)
            {
                break;
            }
        }
        noOrdersGroupCounter = MISSING_INT;
        hasNoOrdersGroupCounter = false;
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
        builder.append("\"MessageName\": \"ConfirmationRequest\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        indent(builder, level);
        builder.append("\"ConfirmReqID\": \"");
        builder.append(this.confirmReqID(), 0, confirmReqIDLength());
        builder.append("\",\n");

        indent(builder, level);
        builder.append("\"ConfirmType\": \"");
        builder.append(confirmType);
        builder.append("\",\n");

        if (hasNoOrdersGroupCounter)
        {
            indent(builder, level);
            builder.append("\"OrdersGroup\": [\n");
            OrdersGroupDecoder ordersGroup = this.ordersGroup;
            for (int i = 0, size = this.noOrdersGroupCounter; i < size; i++)
            {
                indent(builder, level);
                ordersGroup.appendTo(builder, level + 1);
                if (ordersGroup.next() != null)
                {
                    builder.append(',');
                }
                builder.append('\n');
                ordersGroup = ordersGroup.next();            }
            indent(builder, level);
            builder.append("],\n");
        }

        if (hasAllocID())
        {
            indent(builder, level);
            builder.append("\"AllocID\": \"");
            builder.append(this.allocID(), 0, allocIDLength());
            builder.append("\",\n");
        }

        if (hasSecondaryAllocID())
        {
            indent(builder, level);
            builder.append("\"SecondaryAllocID\": \"");
            builder.append(this.secondaryAllocID(), 0, secondaryAllocIDLength());
            builder.append("\",\n");
        }

        if (hasIndividualAllocID())
        {
            indent(builder, level);
            builder.append("\"IndividualAllocID\": \"");
            builder.append(this.individualAllocID(), 0, individualAllocIDLength());
            builder.append("\",\n");
        }

        indent(builder, level);
        builder.append("\"TransactTime\": \"");
        appendData(builder, transactTime, transactTimeLength);
        builder.append("\",\n");

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

        if (hasAllocAccountType())
        {
            indent(builder, level);
            builder.append("\"AllocAccountType\": \"");
            builder.append(allocAccountType);
            builder.append("\",\n");
        }

        if (hasText())
        {
            indent(builder, level);
            builder.append("\"Text\": \"");
            builder.append(this.text(), 0, textLength());
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
    public ConfirmationRequestEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((ConfirmationRequestEncoder)encoder);
    }

    public ConfirmationRequestEncoder toEncoder(final ConfirmationRequestEncoder encoder)
    {
        encoder.reset();
        encoder.confirmReqID(this.confirmReqID(), 0, confirmReqIDLength());
        encoder.confirmType(this.confirmType());

        final OrdAllocGrpEncoder ordAllocGrp = encoder.ordAllocGrp();        if (hasNoOrdersGroupCounter)
        {
            final int size = this.noOrdersGroupCounter;
            OrdersGroupDecoder ordersGroup = this.ordersGroup;
            OrdersGroupEncoder ordersGroupEncoder = ordAllocGrp.ordersGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (ordersGroup != null)
                {
                    ordersGroup.toEncoder(ordersGroupEncoder);
                    ordersGroup = ordersGroup.next();
                    ordersGroupEncoder = ordersGroupEncoder.next();
                }
            }
        }


        if (hasAllocID())
        {
            encoder.allocID(this.allocID(), 0, allocIDLength());
        }

        if (hasSecondaryAllocID())
        {
            encoder.secondaryAllocID(this.secondaryAllocID(), 0, secondaryAllocIDLength());
        }

        if (hasIndividualAllocID())
        {
            encoder.individualAllocID(this.individualAllocID(), 0, individualAllocIDLength());
        }

        encoder.transactTimeAsCopy(this.transactTime(), 0, transactTimeLength());
        if (hasAllocAccount())
        {
            encoder.allocAccount(this.allocAccount(), 0, allocAccountLength());
        }

        if (hasAllocAcctIDSource())
        {
            encoder.allocAcctIDSource(this.allocAcctIDSource());
        }

        if (hasAllocAccountType())
        {
            encoder.allocAccountType(this.allocAccountType());
        }

        if (hasText())
        {
            encoder.text(this.text(), 0, textLength());
        }

        if (hasEncodedTextLen())
        {
            encoder.encodedTextLen(this.encodedTextLen());
        }

        if (hasEncodedText())
        {
            encoder.encodedTextAsCopy(this.encodedText(), 0, encodedTextLen());
            encoder.encodedTextLen(this.encodedTextLen());
        }
        return encoder;
    }

}
