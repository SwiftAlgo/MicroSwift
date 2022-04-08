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


public class OrdListStatGrpEncoder
{
    private static final int noOrdersGroupCounterHeaderLength = 3;
    private static final byte[] noOrdersGroupCounterHeader = new byte[] {55, 51, (byte) '='};



public static class OrdersGroupEncoder
{
    private OrdersGroupEncoder next = null;

    public OrdersGroupEncoder next()
    {
        if (next == null)
        {
            next = new OrdersGroupEncoder();
        }
        return next;
    }

    private static final int clOrdIDHeaderLength = 3;
    private static final byte[] clOrdIDHeader = new byte[] {49, 49, (byte) '='};

    private static final int orderIDHeaderLength = 3;
    private static final byte[] orderIDHeader = new byte[] {51, 55, (byte) '='};

    private static final int secondaryClOrdIDHeaderLength = 4;
    private static final byte[] secondaryClOrdIDHeader = new byte[] {53, 50, 54, (byte) '='};

    private static final int cumQtyHeaderLength = 3;
    private static final byte[] cumQtyHeader = new byte[] {49, 52, (byte) '='};

    private static final int ordStatusHeaderLength = 3;
    private static final byte[] ordStatusHeader = new byte[] {51, 57, (byte) '='};

    private static final int workingIndicatorHeaderLength = 4;
    private static final byte[] workingIndicatorHeader = new byte[] {54, 51, 54, (byte) '='};

    private static final int leavesQtyHeaderLength = 4;
    private static final byte[] leavesQtyHeader = new byte[] {49, 53, 49, (byte) '='};

    private static final int cxlQtyHeaderLength = 3;
    private static final byte[] cxlQtyHeader = new byte[] {56, 52, (byte) '='};

    private static final int avgPxHeaderLength = 2;
    private static final byte[] avgPxHeader = new byte[] {54, (byte) '='};

    private static final int ordRejReasonHeaderLength = 4;
    private static final byte[] ordRejReasonHeader = new byte[] {49, 48, 51, (byte) '='};

    private static final int textHeaderLength = 3;
    private static final byte[] textHeader = new byte[] {53, 56, (byte) '='};

    private static final int encodedTextLenHeaderLength = 4;
    private static final byte[] encodedTextLenHeader = new byte[] {51, 53, 52, (byte) '='};

    private static final int encodedTextHeaderLength = 4;
    private static final byte[] encodedTextHeader = new byte[] {51, 53, 53, (byte) '='};

    private final MutableDirectBuffer clOrdID = new UnsafeBuffer();

    private int clOrdIDOffset = 0;

    private int clOrdIDLength = 0;

    public OrdersGroupEncoder clOrdID(final DirectBuffer value, final int offset, final int length)
    {
        clOrdID.wrap(value);
        clOrdIDOffset = offset;
        clOrdIDLength = length;
        return this;
    }

    public OrdersGroupEncoder clOrdID(final DirectBuffer value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    public OrdersGroupEncoder clOrdID(final DirectBuffer value)
    {
        return clOrdID(value, 0, value.capacity());
    }

    public OrdersGroupEncoder clOrdID(final byte[] value, final int offset, final int length)
    {
        clOrdID.wrap(value);
        clOrdIDOffset = offset;
        clOrdIDLength = length;
        return this;
    }

    public OrdersGroupEncoder clOrdIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(clOrdID, value, offset, length);
        clOrdIDOffset = offset;
        clOrdIDLength = length;
        return this;
    }

    public OrdersGroupEncoder clOrdID(final byte[] value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    public OrdersGroupEncoder clOrdID(final byte[] value)
    {
        return clOrdID(value, 0, value.length);
    }

    public boolean hasClOrdID()
    {
        return clOrdIDLength > 0;
    }

    public MutableDirectBuffer clOrdID()
    {
        return clOrdID;
    }

    public String clOrdIDAsString()
    {
        return clOrdID.getStringWithoutLengthAscii(clOrdIDOffset, clOrdIDLength);
    }

    public OrdersGroupEncoder clOrdID(final CharSequence value)
    {
        toBytes(value, clOrdID);
        clOrdIDOffset = 0;
        clOrdIDLength = value.length();
        return this;
    }

    public OrdersGroupEncoder clOrdID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            clOrdID.wrap(buffer);
            clOrdIDOffset = value.offset();
            clOrdIDLength = value.length();
        }
        return this;
    }

    public OrdersGroupEncoder clOrdID(final char[] value)
    {
        return clOrdID(value, 0, value.length);
    }

    public OrdersGroupEncoder clOrdID(final char[] value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    public OrdersGroupEncoder clOrdID(final char[] value, final int offset, final int length)
    {
        toBytes(value, clOrdID, offset, length);
        clOrdIDOffset = 0;
        clOrdIDLength = length;
        return this;
    }

    private final MutableDirectBuffer orderID = new UnsafeBuffer();

    private int orderIDOffset = 0;

    private int orderIDLength = 0;

    public OrdersGroupEncoder orderID(final DirectBuffer value, final int offset, final int length)
    {
        orderID.wrap(value);
        orderIDOffset = offset;
        orderIDLength = length;
        return this;
    }

    public OrdersGroupEncoder orderID(final DirectBuffer value, final int length)
    {
        return orderID(value, 0, length);
    }

    public OrdersGroupEncoder orderID(final DirectBuffer value)
    {
        return orderID(value, 0, value.capacity());
    }

    public OrdersGroupEncoder orderID(final byte[] value, final int offset, final int length)
    {
        orderID.wrap(value);
        orderIDOffset = offset;
        orderIDLength = length;
        return this;
    }

    public OrdersGroupEncoder orderIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(orderID, value, offset, length);
        orderIDOffset = offset;
        orderIDLength = length;
        return this;
    }

    public OrdersGroupEncoder orderID(final byte[] value, final int length)
    {
        return orderID(value, 0, length);
    }

    public OrdersGroupEncoder orderID(final byte[] value)
    {
        return orderID(value, 0, value.length);
    }

    public boolean hasOrderID()
    {
        return orderIDLength > 0;
    }

    public MutableDirectBuffer orderID()
    {
        return orderID;
    }

    public String orderIDAsString()
    {
        return orderID.getStringWithoutLengthAscii(orderIDOffset, orderIDLength);
    }

    public OrdersGroupEncoder orderID(final CharSequence value)
    {
        toBytes(value, orderID);
        orderIDOffset = 0;
        orderIDLength = value.length();
        return this;
    }

    public OrdersGroupEncoder orderID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            orderID.wrap(buffer);
            orderIDOffset = value.offset();
            orderIDLength = value.length();
        }
        return this;
    }

    public OrdersGroupEncoder orderID(final char[] value)
    {
        return orderID(value, 0, value.length);
    }

    public OrdersGroupEncoder orderID(final char[] value, final int length)
    {
        return orderID(value, 0, length);
    }

    public OrdersGroupEncoder orderID(final char[] value, final int offset, final int length)
    {
        toBytes(value, orderID, offset, length);
        orderIDOffset = 0;
        orderIDLength = length;
        return this;
    }

    private final MutableDirectBuffer secondaryClOrdID = new UnsafeBuffer();

    private int secondaryClOrdIDOffset = 0;

    private int secondaryClOrdIDLength = 0;

    public OrdersGroupEncoder secondaryClOrdID(final DirectBuffer value, final int offset, final int length)
    {
        secondaryClOrdID.wrap(value);
        secondaryClOrdIDOffset = offset;
        secondaryClOrdIDLength = length;
        return this;
    }

    public OrdersGroupEncoder secondaryClOrdID(final DirectBuffer value, final int length)
    {
        return secondaryClOrdID(value, 0, length);
    }

    public OrdersGroupEncoder secondaryClOrdID(final DirectBuffer value)
    {
        return secondaryClOrdID(value, 0, value.capacity());
    }

    public OrdersGroupEncoder secondaryClOrdID(final byte[] value, final int offset, final int length)
    {
        secondaryClOrdID.wrap(value);
        secondaryClOrdIDOffset = offset;
        secondaryClOrdIDLength = length;
        return this;
    }

    public OrdersGroupEncoder secondaryClOrdIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(secondaryClOrdID, value, offset, length);
        secondaryClOrdIDOffset = offset;
        secondaryClOrdIDLength = length;
        return this;
    }

    public OrdersGroupEncoder secondaryClOrdID(final byte[] value, final int length)
    {
        return secondaryClOrdID(value, 0, length);
    }

    public OrdersGroupEncoder secondaryClOrdID(final byte[] value)
    {
        return secondaryClOrdID(value, 0, value.length);
    }

    public boolean hasSecondaryClOrdID()
    {
        return secondaryClOrdIDLength > 0;
    }

    public MutableDirectBuffer secondaryClOrdID()
    {
        return secondaryClOrdID;
    }

    public String secondaryClOrdIDAsString()
    {
        return secondaryClOrdID.getStringWithoutLengthAscii(secondaryClOrdIDOffset, secondaryClOrdIDLength);
    }

    public OrdersGroupEncoder secondaryClOrdID(final CharSequence value)
    {
        toBytes(value, secondaryClOrdID);
        secondaryClOrdIDOffset = 0;
        secondaryClOrdIDLength = value.length();
        return this;
    }

    public OrdersGroupEncoder secondaryClOrdID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            secondaryClOrdID.wrap(buffer);
            secondaryClOrdIDOffset = value.offset();
            secondaryClOrdIDLength = value.length();
        }
        return this;
    }

    public OrdersGroupEncoder secondaryClOrdID(final char[] value)
    {
        return secondaryClOrdID(value, 0, value.length);
    }

    public OrdersGroupEncoder secondaryClOrdID(final char[] value, final int length)
    {
        return secondaryClOrdID(value, 0, length);
    }

    public OrdersGroupEncoder secondaryClOrdID(final char[] value, final int offset, final int length)
    {
        toBytes(value, secondaryClOrdID, offset, length);
        secondaryClOrdIDOffset = 0;
        secondaryClOrdIDLength = length;
        return this;
    }

    private final DecimalFloat cumQty = new DecimalFloat();

    private boolean hasCumQty;

    public boolean hasCumQty()
    {
        return hasCumQty;
    }

    public OrdersGroupEncoder cumQty(DecimalFloat value)
    {
        cumQty.set(value);
        hasCumQty = true;
        return this;
    }

    public OrdersGroupEncoder cumQty(long value, int scale)
    {
        cumQty.set(value, scale);
        hasCumQty = true;
        return this;
    }

    public DecimalFloat cumQty()
    {
        return cumQty;
    }

    private char ordStatus;

    private boolean hasOrdStatus;

    public boolean hasOrdStatus()
    {
        return hasOrdStatus;
    }

    public OrdersGroupEncoder ordStatus(char value)
    {
        ordStatus = value;
        hasOrdStatus = true;
        return this;
    }

    public char ordStatus()
    {
        return ordStatus;
    }

    public OrdersGroupEncoder ordStatus(OrdStatus value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == OrdStatus.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: ordStatus Value: " + value );
            }
            if (value == OrdStatus.NULL_VAL)
            {
                return this;
            }
        }
        return ordStatus(value.representation());
    }

    private boolean workingIndicator;

    private boolean hasWorkingIndicator;

    public boolean hasWorkingIndicator()
    {
        return hasWorkingIndicator;
    }

    public OrdersGroupEncoder workingIndicator(boolean value)
    {
        workingIndicator = value;
        hasWorkingIndicator = true;
        return this;
    }

    public boolean workingIndicator()
    {
        return workingIndicator;
    }

    private final DecimalFloat leavesQty = new DecimalFloat();

    private boolean hasLeavesQty;

    public boolean hasLeavesQty()
    {
        return hasLeavesQty;
    }

    public OrdersGroupEncoder leavesQty(DecimalFloat value)
    {
        leavesQty.set(value);
        hasLeavesQty = true;
        return this;
    }

    public OrdersGroupEncoder leavesQty(long value, int scale)
    {
        leavesQty.set(value, scale);
        hasLeavesQty = true;
        return this;
    }

    public DecimalFloat leavesQty()
    {
        return leavesQty;
    }

    private final DecimalFloat cxlQty = new DecimalFloat();

    private boolean hasCxlQty;

    public boolean hasCxlQty()
    {
        return hasCxlQty;
    }

    public OrdersGroupEncoder cxlQty(DecimalFloat value)
    {
        cxlQty.set(value);
        hasCxlQty = true;
        return this;
    }

    public OrdersGroupEncoder cxlQty(long value, int scale)
    {
        cxlQty.set(value, scale);
        hasCxlQty = true;
        return this;
    }

    public DecimalFloat cxlQty()
    {
        return cxlQty;
    }

    private final DecimalFloat avgPx = new DecimalFloat();

    private boolean hasAvgPx;

    public boolean hasAvgPx()
    {
        return hasAvgPx;
    }

    public OrdersGroupEncoder avgPx(DecimalFloat value)
    {
        avgPx.set(value);
        hasAvgPx = true;
        return this;
    }

    public OrdersGroupEncoder avgPx(long value, int scale)
    {
        avgPx.set(value, scale);
        hasAvgPx = true;
        return this;
    }

    public DecimalFloat avgPx()
    {
        return avgPx;
    }

    private int ordRejReason;

    private boolean hasOrdRejReason;

    public boolean hasOrdRejReason()
    {
        return hasOrdRejReason;
    }

    public OrdersGroupEncoder ordRejReason(int value)
    {
        ordRejReason = value;
        hasOrdRejReason = true;
        return this;
    }

    public int ordRejReason()
    {
        return ordRejReason;
    }

    public OrdersGroupEncoder ordRejReason(OrdRejReason value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == OrdRejReason.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: ordRejReason Value: " + value );
            }
            if (value == OrdRejReason.NULL_VAL)
            {
                return this;
            }
        }
        return ordRejReason(value.representation());
    }

    private final MutableDirectBuffer text = new UnsafeBuffer();

    private int textOffset = 0;

    private int textLength = 0;

    public OrdersGroupEncoder text(final DirectBuffer value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public OrdersGroupEncoder text(final DirectBuffer value, final int length)
    {
        return text(value, 0, length);
    }

    public OrdersGroupEncoder text(final DirectBuffer value)
    {
        return text(value, 0, value.capacity());
    }

    public OrdersGroupEncoder text(final byte[] value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public OrdersGroupEncoder textAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(text, value, offset, length);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public OrdersGroupEncoder text(final byte[] value, final int length)
    {
        return text(value, 0, length);
    }

    public OrdersGroupEncoder text(final byte[] value)
    {
        return text(value, 0, value.length);
    }

    public boolean hasText()
    {
        return textLength > 0;
    }

    public MutableDirectBuffer text()
    {
        return text;
    }

    public String textAsString()
    {
        return text.getStringWithoutLengthAscii(textOffset, textLength);
    }

    public OrdersGroupEncoder text(final CharSequence value)
    {
        toBytes(value, text);
        textOffset = 0;
        textLength = value.length();
        return this;
    }

    public OrdersGroupEncoder text(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            text.wrap(buffer);
            textOffset = value.offset();
            textLength = value.length();
        }
        return this;
    }

    public OrdersGroupEncoder text(final char[] value)
    {
        return text(value, 0, value.length);
    }

    public OrdersGroupEncoder text(final char[] value, final int length)
    {
        return text(value, 0, length);
    }

    public OrdersGroupEncoder text(final char[] value, final int offset, final int length)
    {
        toBytes(value, text, offset, length);
        textOffset = 0;
        textLength = length;
        return this;
    }

    private int encodedTextLen;

    private boolean hasEncodedTextLen;

    public boolean hasEncodedTextLen()
    {
        return hasEncodedTextLen;
    }

    public OrdersGroupEncoder encodedTextLen(int value)
    {
        encodedTextLen = value;
        hasEncodedTextLen = true;
        return this;
    }

    public int encodedTextLen()
    {
        return encodedTextLen;
    }

    private byte[] encodedText;

    private boolean hasEncodedText;

    public boolean hasEncodedText()
    {
        return hasEncodedText;
    }

    public OrdersGroupEncoder encodedText(byte[] value)
    {
        encodedText = value;
        hasEncodedText = true;
        return this;
    }

    public byte[] encodedText()
    {
        return encodedText;
    }

    public OrdersGroupEncoder encodedTextAsCopy(final byte[] value, final int offset, final int length)
    {
        encodedText = copyInto(encodedText, value, offset, length);
        hasEncodedText = true;
        return this;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (clOrdIDLength > 0)
        {
            buffer.putBytes(position, clOrdIDHeader, 0, clOrdIDHeaderLength);
            position += clOrdIDHeaderLength;
            buffer.putBytes(position, clOrdID, clOrdIDOffset, clOrdIDLength);
            position += clOrdIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (orderIDLength > 0)
        {
            buffer.putBytes(position, orderIDHeader, 0, orderIDHeaderLength);
            position += orderIDHeaderLength;
            buffer.putBytes(position, orderID, orderIDOffset, orderIDLength);
            position += orderIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (secondaryClOrdIDLength > 0)
        {
            buffer.putBytes(position, secondaryClOrdIDHeader, 0, secondaryClOrdIDHeaderLength);
            position += secondaryClOrdIDHeaderLength;
            buffer.putBytes(position, secondaryClOrdID, secondaryClOrdIDOffset, secondaryClOrdIDLength);
            position += secondaryClOrdIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasCumQty)
        {
            buffer.putBytes(position, cumQtyHeader, 0, cumQtyHeaderLength);
            position += cumQtyHeaderLength;
            position += buffer.putFloatAscii(position, cumQty);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: CumQty");
        }

        if (hasOrdStatus)
        {
            buffer.putBytes(position, ordStatusHeader, 0, ordStatusHeaderLength);
            position += ordStatusHeaderLength;
            position += buffer.putCharAscii(position, ordStatus);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: OrdStatus");
        }

        if (hasWorkingIndicator)
        {
            buffer.putBytes(position, workingIndicatorHeader, 0, workingIndicatorHeaderLength);
            position += workingIndicatorHeaderLength;
            position += buffer.putBooleanAscii(position, workingIndicator);
            buffer.putSeparator(position);
            position++;
        }

        if (hasLeavesQty)
        {
            buffer.putBytes(position, leavesQtyHeader, 0, leavesQtyHeaderLength);
            position += leavesQtyHeaderLength;
            position += buffer.putFloatAscii(position, leavesQty);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: LeavesQty");
        }

        if (hasCxlQty)
        {
            buffer.putBytes(position, cxlQtyHeader, 0, cxlQtyHeaderLength);
            position += cxlQtyHeaderLength;
            position += buffer.putFloatAscii(position, cxlQty);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: CxlQty");
        }

        if (hasAvgPx)
        {
            buffer.putBytes(position, avgPxHeader, 0, avgPxHeaderLength);
            position += avgPxHeaderLength;
            position += buffer.putFloatAscii(position, avgPx);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: AvgPx");
        }

        if (hasOrdRejReason)
        {
            buffer.putBytes(position, ordRejReasonHeader, 0, ordRejReasonHeaderLength);
            position += ordRejReasonHeaderLength;
            position += buffer.putIntAscii(position, ordRejReason);
            buffer.putSeparator(position);
            position++;
        }

        if (textLength > 0)
        {
            buffer.putBytes(position, textHeader, 0, textHeaderLength);
            position += textHeaderLength;
            buffer.putBytes(position, text, textOffset, textLength);
            position += textLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasEncodedTextLen)
        {
            buffer.putBytes(position, encodedTextLenHeader, 0, encodedTextLenHeaderLength);
            position += encodedTextLenHeaderLength;
            position += buffer.putIntAscii(position, encodedTextLen);
            buffer.putSeparator(position);
            position++;
        }

        if (hasEncodedText)
        {
            buffer.putBytes(position, encodedTextHeader, 0, encodedTextHeaderLength);
            position += encodedTextHeaderLength;
            buffer.putBytes(position, encodedText);
            position += encodedText.length;
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
        if (next != null)        {
            next.reset();
        }
    }

    public void resetClOrdID()
    {
        clOrdIDLength = 0;
    }

    public void resetOrderID()
    {
        orderIDLength = 0;
    }

    public void resetSecondaryClOrdID()
    {
        secondaryClOrdIDLength = 0;
    }

    public void resetCumQty()
    {
        hasCumQty = false;
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
        hasLeavesQty = false;
    }

    public void resetCxlQty()
    {
        hasCxlQty = false;
    }

    public void resetAvgPx()
    {
        hasAvgPx = false;
    }

    public void resetOrdRejReason()
    {
        hasOrdRejReason = false;
    }

    public void resetText()
    {
        textLength = 0;
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
            appendBuffer(builder, clOrdID, clOrdIDOffset, clOrdIDLength);
            builder.append("\",\n");
        }

        if (hasOrderID())
        {
            indent(builder, level);
            builder.append("\"OrderID\": \"");
            appendBuffer(builder, orderID, orderIDOffset, orderIDLength);
            builder.append("\",\n");
        }

        if (hasSecondaryClOrdID())
        {
            indent(builder, level);
            builder.append("\"SecondaryClOrdID\": \"");
            appendBuffer(builder, secondaryClOrdID, secondaryClOrdIDOffset, secondaryClOrdIDLength);
            builder.append("\",\n");
        }

        if (hasCumQty())
        {
            indent(builder, level);
            builder.append("\"CumQty\": \"");
            cumQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasOrdStatus())
        {
            indent(builder, level);
            builder.append("\"OrdStatus\": \"");
            builder.append(ordStatus);
            builder.append("\",\n");
        }

        if (hasWorkingIndicator())
        {
            indent(builder, level);
            builder.append("\"WorkingIndicator\": \"");
            builder.append(workingIndicator);
            builder.append("\",\n");
        }

        if (hasLeavesQty())
        {
            indent(builder, level);
            builder.append("\"LeavesQty\": \"");
            leavesQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasCxlQty())
        {
            indent(builder, level);
            builder.append("\"CxlQty\": \"");
            cxlQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasAvgPx())
        {
            indent(builder, level);
            builder.append("\"AvgPx\": \"");
            avgPx.appendTo(builder);
            builder.append("\",\n");
        }

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
            appendBuffer(builder, text, textOffset, textLength);
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
    public OrdersGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((OrdersGroupEncoder)encoder);
    }

    public OrdersGroupEncoder copyTo(final OrdersGroupEncoder encoder)
    {
        encoder.reset();
        if (hasClOrdID())
        {
            encoder.clOrdIDAsCopy(clOrdID.byteArray(), 0, clOrdIDLength);
        }

        if (hasOrderID())
        {
            encoder.orderIDAsCopy(orderID.byteArray(), 0, orderIDLength);
        }

        if (hasSecondaryClOrdID())
        {
            encoder.secondaryClOrdIDAsCopy(secondaryClOrdID.byteArray(), 0, secondaryClOrdIDLength);
        }

        if (hasCumQty())
        {
            encoder.cumQty(this.cumQty());
        }

        if (hasOrdStatus())
        {
            encoder.ordStatus(this.ordStatus());
        }

        if (hasWorkingIndicator())
        {
            encoder.workingIndicator(this.workingIndicator());
        }

        if (hasLeavesQty())
        {
            encoder.leavesQty(this.leavesQty());
        }

        if (hasCxlQty())
        {
            encoder.cxlQty(this.cxlQty());
        }

        if (hasAvgPx())
        {
            encoder.avgPx(this.avgPx());
        }

        if (hasOrdRejReason())
        {
            encoder.ordRejReason(this.ordRejReason());
        }

        if (hasText())
        {
            encoder.textAsCopy(text.byteArray(), 0, textLength);
        }

        if (hasEncodedTextLen())
        {
            encoder.encodedTextLen(this.encodedTextLen());
        }

        if (hasEncodedText())
        {
            encoder.encodedTextAsCopy(this.encodedText(), 0, encodedTextLen());
            encoder.encodedTextLen(encodedTextLen());
        }
        return encoder;
    }

}
    private int noOrdersGroupCounter;

    private boolean hasNoOrdersGroupCounter;

    public boolean hasNoOrdersGroupCounter()
    {
        return hasNoOrdersGroupCounter;
    }

    public OrdListStatGrpEncoder noOrdersGroupCounter(int value)
    {
        noOrdersGroupCounter = value;
        hasNoOrdersGroupCounter = true;
        return this;
    }

    public int noOrdersGroupCounter()
    {
        return noOrdersGroupCounter;
    }


    private OrdersGroupEncoder ordersGroup = null;

    public OrdersGroupEncoder ordersGroup(final int numberOfElements)
    {
        hasNoOrdersGroupCounter = true;
        noOrdersGroupCounter = numberOfElements;
        if (ordersGroup == null)
        {
            ordersGroup = new OrdersGroupEncoder();
        }
        return ordersGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoOrdersGroupCounter)
        {
            buffer.putBytes(position, noOrdersGroupCounterHeader, 0, noOrdersGroupCounterHeaderLength);
            position += noOrdersGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noOrdersGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (ordersGroup != null)
        {
            position += ordersGroup.encode(buffer, position, noOrdersGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetOrdersGroup();
    }

    public void resetOrdersGroup()
    {
        if (ordersGroup != null)
        {
            ordersGroup.reset();
        }
        noOrdersGroupCounter = 0;
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
        builder.append("\"MessageName\": \"OrdListStatGrp\",\n");
        if (hasNoOrdersGroupCounter)
        {
            indent(builder, level);
            builder.append("\"OrdersGroup\": [\n");
            final int noOrdersGroupCounter = this.noOrdersGroupCounter;
            OrdersGroupEncoder ordersGroup = this.ordersGroup;
            for (int i = 0; i < noOrdersGroupCounter; i++)
            {
                indent(builder, level);
                ordersGroup.appendTo(builder, level + 1);
                if (i < (noOrdersGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                ordersGroup = ordersGroup.next();
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
    public OrdListStatGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((OrdListStatGrpEncoder)encoder);
    }

    public OrdListStatGrpEncoder copyTo(final OrdListStatGrpEncoder encoder)
    {
        encoder.reset();
        if (hasNoOrdersGroupCounter)
        {
            final int size = this.noOrdersGroupCounter;
            OrdersGroupEncoder ordersGroup = this.ordersGroup;
            OrdersGroupEncoder ordersGroupEncoder = encoder.ordersGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (ordersGroup != null)
                {
                    ordersGroup.copyTo(ordersGroupEncoder);
                    ordersGroup = ordersGroup.next();
                    ordersGroupEncoder = ordersGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
