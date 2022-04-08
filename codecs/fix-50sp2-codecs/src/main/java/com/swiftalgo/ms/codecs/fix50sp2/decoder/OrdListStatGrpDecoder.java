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
import com.swiftalgo.ms.codecs.fix50sp2.builder.OrdListStatGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.OrdListStatGrpEncoder.OrdersGroupEncoder;

public interface OrdListStatGrpDecoder 
{



public class OrdersGroupDecoder extends CommonDecoderImpl
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(10);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            REQUIRED_FIELDS.add(Constants.CUM_QTY);
            REQUIRED_FIELDS.add(Constants.ORD_STATUS);
            REQUIRED_FIELDS.add(Constants.LEAVES_QTY);
            REQUIRED_FIELDS.add(Constants.CXL_QTY);
            REQUIRED_FIELDS.add(Constants.AVG_PX);
        }
    }

    public final IntHashSet ALL_GROUP_FIELDS = new IntHashSet(26);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            ALL_GROUP_FIELDS.add(Constants.CL_ORD_ID);
            ALL_GROUP_FIELDS.add(Constants.ORDER_ID);
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

    private final IntHashSet missingRequiredFields = new IntHashSet(10);

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

    private IntHashSet seenFields = new IntHashSet(26);

    private char[] clOrdID = new char[1];

    private boolean hasClOrdID;

    public char[] clOrdID()
    {
        if (!hasClOrdID)
        {
            throw new IllegalArgumentException("No value for optional field: ClOrdID");
        }

        return clOrdID;
    }

    public boolean hasClOrdID()
    {
        return hasClOrdID;
    }


    private int clOrdIDOffset;

    private int clOrdIDLength;

    public int clOrdIDLength()
    {
        if (!hasClOrdID)
        {
            throw new IllegalArgumentException("No value for optional field: ClOrdID");
        }

        return clOrdIDLength;
    }

    public String clOrdIDAsString()
    {
        return hasClOrdID ? new String(clOrdID, 0, clOrdIDLength) : null;
    }

    public void clOrdID(final AsciiSequenceView view)
    {
        if (!hasClOrdID)
        {
            throw new IllegalArgumentException("No value for optional field: ClOrdID");
        }

        view.wrap(buffer, clOrdIDOffset, clOrdIDLength);
    }


    private final CharArrayWrapper clOrdIDWrapper = new CharArrayWrapper();
    private char[] orderID = new char[1];

    private boolean hasOrderID;

    public char[] orderID()
    {
        if (!hasOrderID)
        {
            throw new IllegalArgumentException("No value for optional field: OrderID");
        }

        return orderID;
    }

    public boolean hasOrderID()
    {
        return hasOrderID;
    }


    private int orderIDOffset;

    private int orderIDLength;

    public int orderIDLength()
    {
        if (!hasOrderID)
        {
            throw new IllegalArgumentException("No value for optional field: OrderID");
        }

        return orderIDLength;
    }

    public String orderIDAsString()
    {
        return hasOrderID ? new String(orderID, 0, orderIDLength) : null;
    }

    public void orderID(final AsciiSequenceView view)
    {
        if (!hasOrderID)
        {
            throw new IllegalArgumentException("No value for optional field: OrderID");
        }

        view.wrap(buffer, orderIDOffset, orderIDLength);
    }


    private final CharArrayWrapper orderIDWrapper = new CharArrayWrapper();
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


    private final CharArrayWrapper secondaryClOrdIDWrapper = new CharArrayWrapper();
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
                hasClOrdID = true;
                clOrdID = buffer.getChars(clOrdID, valueOffset, valueLength);
                clOrdIDOffset = valueOffset;
                clOrdIDLength = valueLength;
                break;

            case Constants.ORDER_ID:
                hasOrderID = true;
                orderID = buffer.getChars(orderID, valueOffset, valueLength);
                orderIDOffset = valueOffset;
                orderIDLength = valueLength;
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
        this.resetOrderID();
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
        hasClOrdID = false;
    }

    public void resetOrderID()
    {
        hasOrderID = false;
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
        if (hasClOrdID())
        {
            indent(builder, level);
            builder.append("\"ClOrdID\": \"");
            builder.append(this.clOrdID(), 0, clOrdIDLength());
            builder.append("\",\n");
        }

        if (hasOrderID())
        {
            indent(builder, level);
            builder.append("\"OrderID\": \"");
            builder.append(this.orderID(), 0, orderIDLength());
            builder.append("\",\n");
        }

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
    public OrdListStatGrpEncoder.OrdersGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((OrdListStatGrpEncoder.OrdersGroupEncoder)encoder);
    }

    public OrdListStatGrpEncoder.OrdersGroupEncoder toEncoder(final OrdListStatGrpEncoder.OrdersGroupEncoder encoder)
    {
        encoder.reset();
        if (hasClOrdID())
        {
            encoder.clOrdID(this.clOrdID(), 0, clOrdIDLength());
        }

        if (hasOrderID())
        {
            encoder.orderID(this.orderID(), 0, orderIDLength());
        }

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
        private final OrdListStatGrpDecoder parent;
        private int remainder;
        private OrdersGroupDecoder current;

        public OrdersGroupIterator(final OrdListStatGrpDecoder parent)
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

    public OrdersGroupIterator ordersGroupIterator();
    public int noOrdersGroupCounter();
    public boolean hasNoOrdersGroupCounter();
    public OrdersGroupDecoder ordersGroup();

}
