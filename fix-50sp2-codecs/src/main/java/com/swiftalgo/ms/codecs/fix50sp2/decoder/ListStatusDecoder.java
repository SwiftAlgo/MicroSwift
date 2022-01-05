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
import com.swiftalgo.ms.codecs.fix50sp2.builder.ListStatusEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.OrdListStatGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.OrdListStatGrpEncoder.OrdersGroupEncoder;


public class ListStatusDecoder extends CommonDecoderImpl implements OrdListStatGrpDecoder, MessageDecoder
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

    public final IntHashSet GROUP_FIELDS = new IntHashSet(26);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            GROUP_FIELDS.add(Constants.LIST_ID);
            GROUP_FIELDS.add(Constants.LIST_STATUS_TYPE);
            GROUP_FIELDS.add(Constants.NO_RPTS);
            GROUP_FIELDS.add(Constants.LIST_ORDER_STATUS);
            GROUP_FIELDS.add(Constants.CONTINGENCY_TYPE);
            GROUP_FIELDS.add(Constants.LIST_REJECT_REASON);
            GROUP_FIELDS.add(Constants.RPT_SEQ);
            GROUP_FIELDS.add(Constants.LIST_STATUS_TEXT);
            GROUP_FIELDS.add(Constants.ENCODED_LIST_STATUS_TEXT_LEN);
            GROUP_FIELDS.add(Constants.ENCODED_LIST_STATUS_TEXT);
            GROUP_FIELDS.add(Constants.TRANSACT_TIME);
            GROUP_FIELDS.add(Constants.TOT_NO_ORDERS);
            GROUP_FIELDS.add(Constants.LAST_FRAGMENT);
        }
    }

    private final IntHashSet alreadyVisitedFields = new IntHashSet(26);

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

        if (hasContingencyType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !ContingencyType.isValid(contingencyType()))
        {
            invalidTagId = 1385;
            rejectReason = 5;
            return false;
        }
        }

        if (hasListRejectReason)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !ListRejectReason.isValid(listRejectReason()))
        {
            invalidTagId = 1386;
            rejectReason = 5;
            return false;
        }
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

    public final IntHashSet messageFields = new IntHashSet(118);

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
        messageFields.add(Constants.LIST_ID);
        messageFields.add(Constants.LIST_STATUS_TYPE);
        messageFields.add(Constants.NO_RPTS);
        messageFields.add(Constants.LIST_ORDER_STATUS);
        messageFields.add(Constants.CONTINGENCY_TYPE);
        messageFields.add(Constants.LIST_REJECT_REASON);
        messageFields.add(Constants.RPT_SEQ);
        messageFields.add(Constants.LIST_STATUS_TEXT);
        messageFields.add(Constants.ENCODED_LIST_STATUS_TEXT_LEN);
        messageFields.add(Constants.ENCODED_LIST_STATUS_TEXT);
        messageFields.add(Constants.TRANSACT_TIME);
        messageFields.add(Constants.TOT_NO_ORDERS);
        messageFields.add(Constants.LAST_FRAGMENT);
        messageFields.add(Constants.NO_ORDERS);
        messageFields.add(Constants.CL_ORD_ID);
        messageFields.add(Constants.ORDER_ID);
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

    private int contingencyType = MISSING_INT;

    private boolean hasContingencyType;

    public int contingencyType()
    {
        if (!hasContingencyType)
        {
            throw new IllegalArgumentException("No value for optional field: ContingencyType");
        }

        return contingencyType;
    }

    public boolean hasContingencyType()
    {
        return hasContingencyType;
    }



    private final CharArrayWrapper contingencyTypeWrapper = new CharArrayWrapper();
    public ContingencyType contingencyTypeAsEnum()
    {
        if (!hasContingencyType)
 return ContingencyType.NULL_VAL;
        return ContingencyType.decode(contingencyType);
    }

    private int listRejectReason = MISSING_INT;

    private boolean hasListRejectReason;

    public int listRejectReason()
    {
        if (!hasListRejectReason)
        {
            throw new IllegalArgumentException("No value for optional field: ListRejectReason");
        }

        return listRejectReason;
    }

    public boolean hasListRejectReason()
    {
        return hasListRejectReason;
    }



    private final CharArrayWrapper listRejectReasonWrapper = new CharArrayWrapper();
    public ListRejectReason listRejectReasonAsEnum()
    {
        if (!hasListRejectReason)
 return ListRejectReason.NULL_VAL;
        return ListRejectReason.decode(listRejectReason);
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

            case Constants.CONTINGENCY_TYPE:
                hasContingencyType = true;
                contingencyType = getInt(buffer, valueOffset, endOfField, 1385, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.LIST_REJECT_REASON:
                hasListRejectReason = true;
                listRejectReason = getInt(buffer, valueOffset, endOfField, 1386, CODEC_VALIDATION_ENABLED);
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
        this.resetContingencyType();
        this.resetListRejectReason();
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

    public void resetContingencyType()
    {
        hasContingencyType = false;
    }

    public void resetListRejectReason()
    {
        hasListRejectReason = false;
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

        if (hasContingencyType())
        {
            indent(builder, level);
            builder.append("\"ContingencyType\": \"");
            builder.append(contingencyType);
            builder.append("\",\n");
        }

        if (hasListRejectReason())
        {
            indent(builder, level);
            builder.append("\"ListRejectReason\": \"");
            builder.append(listRejectReason);
            builder.append("\",\n");
        }

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
        encoder.noRpts(this.noRpts());
        encoder.listOrderStatus(this.listOrderStatus());
        if (hasContingencyType())
        {
            encoder.contingencyType(this.contingencyType());
        }

        if (hasListRejectReason())
        {
            encoder.listRejectReason(this.listRejectReason());
        }

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


        final OrdListStatGrpEncoder ordListStatGrp = encoder.ordListStatGrp();        if (hasNoOrdersGroupCounter)
        {
            final int size = this.noOrdersGroupCounter;
            OrdersGroupDecoder ordersGroup = this.ordersGroup;
            OrdersGroupEncoder ordersGroupEncoder = ordListStatGrp.ordersGroup(size);
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
