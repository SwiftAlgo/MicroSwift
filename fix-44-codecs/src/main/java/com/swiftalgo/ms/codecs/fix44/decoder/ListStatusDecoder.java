/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44.decoder;

import org.agrona.AsciiNumberFormatException;
import org.agrona.MutableDirectBuffer;
import org.agrona.AsciiSequenceView;
import static uk.co.real_logic.artio.dictionary.generation.CodecUtil.*;
import static uk.co.real_logic.artio.dictionary.SessionConstants.*;
import uk.co.real_logic.artio.builder.Decoder;
import com.swiftalgo.ms.codecs.fix44.decoder.HeaderDecoder;
import com.swiftalgo.ms.codecs.fix44.decoder.TrailerDecoder;
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
import com.swiftalgo.ms.codecs.fix44.*;
import com.swiftalgo.ms.codecs.fix44.builder.ListStatusEncoder;
import static com.swiftalgo.ms.codecs.fix44.builder.ListStatusEncoder.OrdersGroupEncoder;


public class ListStatusDecoder extends CommonDecoderImpl implements MessageDecoder
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(14);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            REQUIRED_FIELDS.add(Constants.LIST_ID);
            REQUIRED_FIELDS.add(Constants.LIST_STATUS_TYPE);
            REQUIRED_FIELDS.add(Constants.NO_RPTS);
            REQUIRED_FIELDS.add(Constants.LIST_ORDER_STATUS);
            REQUIRED_FIELDS.add(Constants.RPT_SEQ);
            REQUIRED_FIELDS.add(Constants.TOT_NO_ORDERS);
            REQUIRED_FIELDS.add(Constants.NO_ORDERS);
        }
    }

    public final IntHashSet GROUP_FIELDS = new IntHashSet(22);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            GROUP_FIELDS.add(Constants.LIST_ID);
            GROUP_FIELDS.add(Constants.LIST_STATUS_TYPE);
            GROUP_FIELDS.add(Constants.NO_RPTS);
            GROUP_FIELDS.add(Constants.LIST_ORDER_STATUS);
            GROUP_FIELDS.add(Constants.RPT_SEQ);
            GROUP_FIELDS.add(Constants.LIST_STATUS_TEXT);
            GROUP_FIELDS.add(Constants.ENCODED_LIST_STATUS_TEXT_LEN);
            GROUP_FIELDS.add(Constants.ENCODED_LIST_STATUS_TEXT);
            GROUP_FIELDS.add(Constants.TRANSACT_TIME);
            GROUP_FIELDS.add(Constants.TOT_NO_ORDERS);
            GROUP_FIELDS.add(Constants.LAST_FRAGMENT);
        }
    }

    private final IntHashSet alreadyVisitedFields = new IntHashSet(22);

    private final IntHashSet unknownFields = new IntHashSet(10);

    private final IntHashSet missingRequiredFields = new IntHashSet(14);

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
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !ListStatusType.isValid(listStatusType()))
        {
            invalidTagId = 429;
            rejectReason = 5;
            return false;
        }

        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !ListOrderStatus.isValid(listOrderStatus()))
        {
            invalidTagId = 431;
            rejectReason = 5;
            return false;
        }
        {
            int count = 0;
            final OrdersGroupIterator iterator = ordersGroupIterator.iterator();
            for (final OrdersGroupDecoder group : iterator)
            {
                count++;                if (!group.validate())
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
        return true;
    }

    public static final long MESSAGE_TYPE = 78L;

    public static final String MESSAGE_TYPE_AS_STRING = "N";

    public static final char[] MESSAGE_TYPE_CHARS = MESSAGE_TYPE_AS_STRING.toCharArray();

    public static final byte[] MESSAGE_TYPE_BYTES = MESSAGE_TYPE_AS_STRING.getBytes(US_ASCII);

    public final IntHashSet messageFields = new IntHashSet(106);

    {
        messageFields.add(Constants.BEGIN_STRING);
        messageFields.add(Constants.BODY_LENGTH);
        messageFields.add(Constants.MSG_TYPE);
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
        messageFields.add(Constants.LIST_ID);
        messageFields.add(Constants.LIST_STATUS_TYPE);
        messageFields.add(Constants.NO_RPTS);
        messageFields.add(Constants.LIST_ORDER_STATUS);
        messageFields.add(Constants.RPT_SEQ);
        messageFields.add(Constants.LIST_STATUS_TEXT);
        messageFields.add(Constants.ENCODED_LIST_STATUS_TEXT_LEN);
        messageFields.add(Constants.ENCODED_LIST_STATUS_TEXT);
        messageFields.add(Constants.TRANSACT_TIME);
        messageFields.add(Constants.TOT_NO_ORDERS);
        messageFields.add(Constants.LAST_FRAGMENT);
        messageFields.add(Constants.NO_ORDERS);
        messageFields.add(Constants.CL_ORD_ID);
        messageFields.add(Constants.SECONDARY_CL_ORD_ID);
        messageFields.add(Constants.CUM_QTY);
        messageFields.add(Constants.ORD_STATUS);
        messageFields.add(Constants.WORKING_INDICATOR);
        messageFields.add(Constants.LEAVES_QTY);
        messageFields.add(Constants.CXL_QTY);
        messageFields.add(Constants.AVG_PX);
        messageFields.add(Constants.ORD_REJ_REASON);
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

    private char[] listID = new char[1];

    public char[] listID()
    {
        return listID;
    }


    private int listIDOffset;

    private int listIDLength;

    public int listIDLength()
    {
        return listIDLength;
    }

    public String listIDAsString()
    {
        return new String(listID, 0, listIDLength);
    }

    public void listID(final AsciiSequenceView view)
    {
        view.wrap(buffer, listIDOffset, listIDLength);
    }


    private int listStatusType = MISSING_INT;

    public int listStatusType()
    {
        return listStatusType;
    }



    private final CharArrayWrapper listStatusTypeWrapper = new CharArrayWrapper();
    public ListStatusType listStatusTypeAsEnum()
    {
        return ListStatusType.decode(listStatusType);
    }

    private int noRpts = MISSING_INT;

    public int noRpts()
    {
        return noRpts;
    }



    private int listOrderStatus = MISSING_INT;

    public int listOrderStatus()
    {
        return listOrderStatus;
    }



    private final CharArrayWrapper listOrderStatusWrapper = new CharArrayWrapper();
    public ListOrderStatus listOrderStatusAsEnum()
    {
        return ListOrderStatus.decode(listOrderStatus);
    }

    private int rptSeq = MISSING_INT;

    public int rptSeq()
    {
        return rptSeq;
    }



    private char[] listStatusText = new char[1];

    private boolean hasListStatusText;

    public char[] listStatusText()
    {
        if (!hasListStatusText)
        {
            throw new IllegalArgumentException("No value for optional field: ListStatusText");
        }

        return listStatusText;
    }

    public boolean hasListStatusText()
    {
        return hasListStatusText;
    }


    private int listStatusTextOffset;

    private int listStatusTextLength;

    public int listStatusTextLength()
    {
        if (!hasListStatusText)
        {
            throw new IllegalArgumentException("No value for optional field: ListStatusText");
        }

        return listStatusTextLength;
    }

    public String listStatusTextAsString()
    {
        return hasListStatusText ? new String(listStatusText, 0, listStatusTextLength) : null;
    }

    public void listStatusText(final AsciiSequenceView view)
    {
        if (!hasListStatusText)
        {
            throw new IllegalArgumentException("No value for optional field: ListStatusText");
        }

        view.wrap(buffer, listStatusTextOffset, listStatusTextLength);
    }


    private int encodedListStatusTextLen = MISSING_INT;

    private boolean hasEncodedListStatusTextLen;

    public int encodedListStatusTextLen()
    {
        if (!hasEncodedListStatusTextLen)
        {
            throw new IllegalArgumentException("No value for optional field: EncodedListStatusTextLen");
        }

        return encodedListStatusTextLen;
    }

    public boolean hasEncodedListStatusTextLen()
    {
        return hasEncodedListStatusTextLen;
    }



    private byte[] encodedListStatusText = new byte[1];

    private boolean hasEncodedListStatusText;

    public byte[] encodedListStatusText()
    {
        if (!hasEncodedListStatusText)
        {
            throw new IllegalArgumentException("No value for optional field: EncodedListStatusText");
        }

        return encodedListStatusText;
    }

    public boolean hasEncodedListStatusText()
    {
        return hasEncodedListStatusText;
    }



    private byte[] transactTime = new byte[24];

    private boolean hasTransactTime;

    public byte[] transactTime()
    {
        if (!hasTransactTime)
        {
            throw new IllegalArgumentException("No value for optional field: TransactTime");
        }

        return transactTime;
    }

    public boolean hasTransactTime()
    {
        return hasTransactTime;
    }


    private int transactTimeOffset;

    private int transactTimeLength;

    public int transactTimeLength()
    {
        if (!hasTransactTime)
        {
            throw new IllegalArgumentException("No value for optional field: TransactTime");
        }

        return transactTimeLength;
    }

    public String transactTimeAsString()
    {
        return hasTransactTime ? new String(transactTime, 0, transactTimeLength) : null;
    }

    public void transactTime(final AsciiSequenceView view)
    {
        if (!hasTransactTime)
        {
            throw new IllegalArgumentException("No value for optional field: TransactTime");
        }

        view.wrap(buffer, transactTimeOffset, transactTimeLength);
    }


    private int totNoOrders = MISSING_INT;

    public int totNoOrders()
    {
        return totNoOrders;
    }



    private boolean lastFragment;

    private boolean hasLastFragment;

    public boolean lastFragment()
    {
        if (!hasLastFragment)
        {
            throw new IllegalArgumentException("No value for optional field: LastFragment");
        }

        return lastFragment;
    }

    public boolean hasLastFragment()
    {
        return hasLastFragment;
    }





public class OrdersGroupDecoder extends CommonDecoderImpl
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(12);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            REQUIRED_FIELDS.add(Constants.CL_ORD_ID);
            REQUIRED_FIELDS.add(Constants.CUM_QTY);
            REQUIRED_FIELDS.add(Constants.ORD_STATUS);
            REQUIRED_FIELDS.add(Constants.LEAVES_QTY);
            REQUIRED_FIELDS.add(Constants.CXL_QTY);
            REQUIRED_FIELDS.add(Constants.AVG_PX);
        }
    }

    public final IntHashSet ALL_GROUP_FIELDS = new IntHashSet(24);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            ALL_GROUP_FIELDS.add(Constants.CL_ORD_ID);
            ALL_GROUP_FIELDS.add(Constants.SECONDARY_CL_ORD_ID);
            ALL_GROUP_FIELDS.add(Constants.CUM_QTY);
            ALL_GROUP_FIELDS.add(Constants.ORD_STATUS);
            ALL_GROUP_FIELDS.add(Constants.WORKING_INDICATOR);
            ALL_GROUP_FIELDS.add(Constants.LEAVES_QTY);
            ALL_GROUP_FIELDS.add(Constants.CXL_QTY);
            ALL_GROUP_FIELDS.add(Constants.AVG_PX);
            ALL_GROUP_FIELDS.add(Constants.ORD_REJ_REASON);
            ALL_GROUP_FIELDS.add(Constants.TEXT);
            ALL_GROUP_FIELDS.add(Constants.ENCODED_TEXT_LEN);
            ALL_GROUP_FIELDS.add(Constants.ENCODED_TEXT);
        }
    }

    private final IntHashSet missingRequiredFields = new IntHashSet(12);

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
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !OrdStatus.isValid(ordStatus()))
        {
            invalidTagId = 39;
            rejectReason = 5;
            return false;
        }

        if (hasOrdRejReason)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !OrdRejReason.isValid(ordRejReason()))
        {
            invalidTagId = 103;
            rejectReason = 5;
            return false;
        }
        }
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public OrdersGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private OrdersGroupDecoder next = null;

    public OrdersGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(24);

    private char[] clOrdID = new char[1];

    public char[] clOrdID()
    {
        return clOrdID;
    }


    private int clOrdIDOffset;

    private int clOrdIDLength;

    public int clOrdIDLength()
    {
        return clOrdIDLength;
    }

    public String clOrdIDAsString()
    {
        return new String(clOrdID, 0, clOrdIDLength);
    }

    public void clOrdID(final AsciiSequenceView view)
    {
        view.wrap(buffer, clOrdIDOffset, clOrdIDLength);
    }


    private char[] secondaryClOrdID = new char[1];

    private boolean hasSecondaryClOrdID;

    public char[] secondaryClOrdID()
    {
        if (!hasSecondaryClOrdID)
        {
            throw new IllegalArgumentException("No value for optional field: SecondaryClOrdID");
        }

        return secondaryClOrdID;
    }

    public boolean hasSecondaryClOrdID()
    {
        return hasSecondaryClOrdID;
    }


    private int secondaryClOrdIDOffset;

    private int secondaryClOrdIDLength;

    public int secondaryClOrdIDLength()
    {
        if (!hasSecondaryClOrdID)
        {
            throw new IllegalArgumentException("No value for optional field: SecondaryClOrdID");
        }

        return secondaryClOrdIDLength;
    }

    public String secondaryClOrdIDAsString()
    {
        return hasSecondaryClOrdID ? new String(secondaryClOrdID, 0, secondaryClOrdIDLength) : null;
    }

    public void secondaryClOrdID(final AsciiSequenceView view)
    {
        if (!hasSecondaryClOrdID)
        {
            throw new IllegalArgumentException("No value for optional field: SecondaryClOrdID");
        }

        view.wrap(buffer, secondaryClOrdIDOffset, secondaryClOrdIDLength);
    }


    private DecimalFloat cumQty = DecimalFloat.newNaNValue();

    public DecimalFloat cumQty()
    {
        return cumQty;
    }



    private char ordStatus = MISSING_CHAR;

    public char ordStatus()
    {
        return ordStatus;
    }



    private final CharArrayWrapper ordStatusWrapper = new CharArrayWrapper();
    public OrdStatus ordStatusAsEnum()
    {
        return OrdStatus.decode(ordStatus);
    }

    private boolean workingIndicator;

    private boolean hasWorkingIndicator;

    public boolean workingIndicator()
    {
        if (!hasWorkingIndicator)
        {
            throw new IllegalArgumentException("No value for optional field: WorkingIndicator");
        }

        return workingIndicator;
    }

    public boolean hasWorkingIndicator()
    {
        return hasWorkingIndicator;
    }



    private DecimalFloat leavesQty = DecimalFloat.newNaNValue();

    public DecimalFloat leavesQty()
    {
        return leavesQty;
    }



    private DecimalFloat cxlQty = DecimalFloat.newNaNValue();

    public DecimalFloat cxlQty()
    {
        return cxlQty;
    }



    private DecimalFloat avgPx = DecimalFloat.newNaNValue();

    public DecimalFloat avgPx()
    {
        return avgPx;
    }



    private int ordRejReason = MISSING_INT;

    private boolean hasOrdRejReason;

    public int ordRejReason()
    {
        if (!hasOrdRejReason)
        {
            throw new IllegalArgumentException("No value for optional field: OrdRejReason");
        }

        return ordRejReason;
    }

    public boolean hasOrdRejReason()
    {
        return hasOrdRejReason;
    }



    private final CharArrayWrapper ordRejReasonWrapper = new CharArrayWrapper();
    public OrdRejReason ordRejReasonAsEnum()
    {
        if (!hasOrdRejReason)
 return OrdRejReason.NULL_VAL;
        return OrdRejReason.decode(ordRejReason);
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
        // Decode OrdersGroup
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
                    next = new OrdersGroupDecoder(trailer, messageFields);
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
            case Constants.CL_ORD_ID:
                clOrdID = buffer.getChars(clOrdID, valueOffset, valueLength);
                clOrdIDOffset = valueOffset;
                clOrdIDLength = valueLength;
                break;

            case Constants.SECONDARY_CL_ORD_ID:
                hasSecondaryClOrdID = true;
                secondaryClOrdID = buffer.getChars(secondaryClOrdID, valueOffset, valueLength);
                secondaryClOrdIDOffset = valueOffset;
                secondaryClOrdIDLength = valueLength;
                break;

            case Constants.CUM_QTY:
                cumQty = getFloat(buffer, cumQty, valueOffset, valueLength, 14, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.ORD_STATUS:
                ordStatus = buffer.getChar(valueOffset);
                break;

            case Constants.WORKING_INDICATOR:
                hasWorkingIndicator = true;
                workingIndicator = buffer.getBoolean(valueOffset);
                break;

            case Constants.LEAVES_QTY:
                leavesQty = getFloat(buffer, leavesQty, valueOffset, valueLength, 151, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.CXL_QTY:
                cxlQty = getFloat(buffer, cxlQty, valueOffset, valueLength, 84, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.AVG_PX:
                avgPx = getFloat(buffer, avgPx, valueOffset, valueLength, 6, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.ORD_REJ_REASON:
                hasOrdRejReason = true;
                ordRejReason = getInt(buffer, valueOffset, endOfField, 103, CODEC_VALIDATION_ENABLED);
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
        this.resetClOrdID();
        this.resetSecondaryClOrdID();
        this.resetCumQty();
        this.resetOrdStatus();
        this.resetWorkingIndicator();
        this.resetLeavesQty();
        this.resetCxlQty();
        this.resetAvgPx();
        this.resetOrdRejReason();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetClOrdID()
    {
        clOrdIDOffset = 0;
        clOrdIDLength = 0;
    }

    public void resetSecondaryClOrdID()
    {
        hasSecondaryClOrdID = false;
    }

    public void resetCumQty()
    {
        cumQty.reset();
    }

    public void resetOrdStatus()
    {
        ordStatus = MISSING_CHAR;
    }

    public void resetWorkingIndicator()
    {
        hasWorkingIndicator = false;
    }

    public void resetLeavesQty()
    {
        leavesQty.reset();
    }

    public void resetCxlQty()
    {
        cxlQty.reset();
    }

    public void resetAvgPx()
    {
        avgPx.reset();
    }

    public void resetOrdRejReason()
    {
        hasOrdRejReason = false;
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
        builder.append("\"MessageName\": \"OrdersGroup\",\n");
        indent(builder, level);
        builder.append("\"ClOrdID\": \"");
        builder.append(this.clOrdID(), 0, clOrdIDLength());
        builder.append("\",\n");

        if (hasSecondaryClOrdID())
        {
            indent(builder, level);
            builder.append("\"SecondaryClOrdID\": \"");
            builder.append(this.secondaryClOrdID(), 0, secondaryClOrdIDLength());
            builder.append("\",\n");
        }

        indent(builder, level);
        builder.append("\"CumQty\": \"");
        cumQty.appendTo(builder);
        builder.append("\",\n");

        indent(builder, level);
        builder.append("\"OrdStatus\": \"");
        builder.append(ordStatus);
        builder.append("\",\n");

        if (hasWorkingIndicator())
        {
            indent(builder, level);
            builder.append("\"WorkingIndicator\": \"");
            builder.append(workingIndicator);
            builder.append("\",\n");
        }

        indent(builder, level);
        builder.append("\"LeavesQty\": \"");
        leavesQty.appendTo(builder);
        builder.append("\",\n");

        indent(builder, level);
        builder.append("\"CxlQty\": \"");
        cxlQty.appendTo(builder);
        builder.append("\",\n");

        indent(builder, level);
        builder.append("\"AvgPx\": \"");
        avgPx.appendTo(builder);
        builder.append("\",\n");

        if (hasOrdRejReason())
        {
            indent(builder, level);
            builder.append("\"OrdRejReason\": \"");
            builder.append(ordRejReason);
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
    public OrdersGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((OrdersGroupEncoder)encoder);
    }

    public OrdersGroupEncoder toEncoder(final OrdersGroupEncoder encoder)
    {
        encoder.reset();
        encoder.clOrdID(this.clOrdID(), 0, clOrdIDLength());
        if (hasSecondaryClOrdID())
        {
            encoder.secondaryClOrdID(this.secondaryClOrdID(), 0, secondaryClOrdIDLength());
        }

        encoder.cumQty(this.cumQty());
        encoder.ordStatus(this.ordStatus());
        if (hasWorkingIndicator())
        {
            encoder.workingIndicator(this.workingIndicator());
        }

        encoder.leavesQty(this.leavesQty());
        encoder.cxlQty(this.cxlQty());
        encoder.avgPx(this.avgPx());
        if (hasOrdRejReason())
        {
            encoder.ordRejReason(this.ordRejReason());
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
    public class OrdersGroupIterator implements Iterable<OrdersGroupDecoder>, java.util.Iterator<OrdersGroupDecoder>
    {
        private final ListStatusDecoder parent;
        private int remainder;
        private OrdersGroupDecoder current;

        public OrdersGroupIterator(final ListStatusDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }
        public OrdersGroupDecoder next()
        {
            remainder--;
            final OrdersGroupDecoder value = current;
            current = current.next();
            return value;
        }
        public int numberFieldValue()
        {
            return parent.hasNoOrdersGroupCounter() ? parent.noOrdersGroupCounter() : 0;
        }
        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.ordersGroup();
        }
        public OrdersGroupIterator iterator()
        {
            reset();
            return this;
        }
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

    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode ListStatus
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
            case Constants.LIST_ID:
                listID = buffer.getChars(listID, valueOffset, valueLength);
                listIDOffset = valueOffset;
                listIDLength = valueLength;
                break;

            case Constants.LIST_STATUS_TYPE:
                listStatusType = getInt(buffer, valueOffset, endOfField, 429, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.NO_RPTS:
                noRpts = getInt(buffer, valueOffset, endOfField, 82, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.LIST_ORDER_STATUS:
                listOrderStatus = getInt(buffer, valueOffset, endOfField, 431, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.RPT_SEQ:
                rptSeq = getInt(buffer, valueOffset, endOfField, 83, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.LIST_STATUS_TEXT:
                hasListStatusText = true;
                listStatusText = buffer.getChars(listStatusText, valueOffset, valueLength);
                listStatusTextOffset = valueOffset;
                listStatusTextLength = valueLength;
                break;

            case Constants.ENCODED_LIST_STATUS_TEXT_LEN:
                hasEncodedListStatusTextLen = true;
                encodedListStatusTextLen = getInt(buffer, valueOffset, endOfField, 445, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.ENCODED_LIST_STATUS_TEXT:
                hasEncodedListStatusText = true;
                encodedListStatusText = buffer.getBytes(encodedListStatusText, valueOffset, encodedListStatusTextLen);
                endOfField = valueOffset + encodedListStatusTextLen;
                break;

            case Constants.TRANSACT_TIME:
                hasTransactTime = true;
                transactTime = buffer.getBytes(transactTime, valueOffset, valueLength);
                transactTimeOffset = valueOffset;
                transactTimeLength = valueLength;
                break;

            case Constants.TOT_NO_ORDERS:
                totNoOrders = getInt(buffer, valueOffset, endOfField, 68, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.LAST_FRAGMENT:
                hasLastFragment = true;
                lastFragment = buffer.getBoolean(valueOffset);
                break;

            case Constants.NO_ORDERS:
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
        this.resetListID();
        this.resetListStatusType();
        this.resetNoRpts();
        this.resetListOrderStatus();
        this.resetRptSeq();
        this.resetListStatusText();
        this.resetEncodedListStatusTextLen();
        this.resetEncodedListStatusText();
        this.resetTransactTime();
        this.resetTotNoOrders();
        this.resetLastFragment();
        this.resetOrdersGroup();
    }

    public void resetListID()
    {
        listIDOffset = 0;
        listIDLength = 0;
    }

    public void resetListStatusType()
    {
        listStatusType = MISSING_INT;
    }

    public void resetNoRpts()
    {
        noRpts = MISSING_INT;
    }

    public void resetListOrderStatus()
    {
        listOrderStatus = MISSING_INT;
    }

    public void resetRptSeq()
    {
        rptSeq = MISSING_INT;
    }

    public void resetListStatusText()
    {
        hasListStatusText = false;
    }

    public void resetEncodedListStatusTextLen()
    {
        hasEncodedListStatusTextLen = false;
    }

    public void resetEncodedListStatusText()
    {
        hasEncodedListStatusText = false;
    }

    public void resetTransactTime()
    {
        hasTransactTime = false;
    }

    public void resetTotNoOrders()
    {
        totNoOrders = MISSING_INT;
    }

    public void resetLastFragment()
    {
        hasLastFragment = false;
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
        builder.append("\"MessageName\": \"ListStatus\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        indent(builder, level);
        builder.append("\"ListID\": \"");
        builder.append(this.listID(), 0, listIDLength());
        builder.append("\",\n");

        indent(builder, level);
        builder.append("\"ListStatusType\": \"");
        builder.append(listStatusType);
        builder.append("\",\n");

        indent(builder, level);
        builder.append("\"NoRpts\": \"");
        builder.append(noRpts);
        builder.append("\",\n");

        indent(builder, level);
        builder.append("\"ListOrderStatus\": \"");
        builder.append(listOrderStatus);
        builder.append("\",\n");

        indent(builder, level);
        builder.append("\"RptSeq\": \"");
        builder.append(rptSeq);
        builder.append("\",\n");

        if (hasListStatusText())
        {
            indent(builder, level);
            builder.append("\"ListStatusText\": \"");
            builder.append(this.listStatusText(), 0, listStatusTextLength());
            builder.append("\",\n");
        }

        if (hasEncodedListStatusTextLen())
        {
            indent(builder, level);
            builder.append("\"EncodedListStatusTextLen\": \"");
            builder.append(encodedListStatusTextLen);
            builder.append("\",\n");
        }

        if (hasEncodedListStatusText())
        {
            indent(builder, level);
            builder.append("\"EncodedListStatusText\": \"");
            appendData(builder, encodedListStatusText, encodedListStatusTextLen);
            builder.append("\",\n");
        }

        if (hasTransactTime())
        {
            indent(builder, level);
            builder.append("\"TransactTime\": \"");
            appendData(builder, transactTime, transactTimeLength);
            builder.append("\",\n");
        }

        indent(builder, level);
        builder.append("\"TotNoOrders\": \"");
        builder.append(totNoOrders);
        builder.append("\",\n");

        if (hasLastFragment())
        {
            indent(builder, level);
            builder.append("\"LastFragment\": \"");
            builder.append(lastFragment);
            builder.append("\",\n");
        }

    if (hasNoOrdersGroupCounter)
    {
        indent(builder, level);
        builder.append("\"OrdersGroup\": [\n");
        OrdersGroupDecoder ordersGroup = this.ordersGroup;
        for (int i = 0, size = this.noOrdersGroupCounter; i < size; i++)
        {
            indent(builder, level);
            ordersGroup.appendTo(builder, level + 1);            if (ordersGroup.next() != null)
            {
                builder.append(',');
            }
            builder.append('\n');
            ordersGroup = ordersGroup.next();        }
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
    public ListStatusEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((ListStatusEncoder)encoder);
    }

    public ListStatusEncoder toEncoder(final ListStatusEncoder encoder)
    {
        encoder.reset();
        encoder.listID(this.listID(), 0, listIDLength());
        encoder.listStatusType(this.listStatusType());

        encoder.listOrderStatus(this.listOrderStatus());
        encoder.rptSeq(this.rptSeq());
        if (hasListStatusText())
        {
            encoder.listStatusText(this.listStatusText(), 0, listStatusTextLength());
        }

        if (hasEncodedListStatusTextLen())
        {
            encoder.encodedListStatusTextLen(this.encodedListStatusTextLen());
        }

        if (hasEncodedListStatusText())
        {
            encoder.encodedListStatusTextAsCopy(this.encodedListStatusText(), 0, encodedListStatusTextLen());
            encoder.encodedListStatusTextLen(this.encodedListStatusTextLen());
        }

        if (hasTransactTime())
        {
            encoder.transactTimeAsCopy(this.transactTime(), 0, transactTimeLength());
        }

        encoder.totNoOrders(this.totNoOrders());
        if (hasLastFragment())
        {
            encoder.lastFragment(this.lastFragment());
        }

        if (hasNoOrdersGroupCounter)
        {
            final int size = this.noOrdersGroupCounter;
            OrdersGroupDecoder ordersGroup = this.ordersGroup;
            OrdersGroupEncoder ordersGroupEncoder = encoder.ordersGroup(size);
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
        return encoder;
    }

}
