/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2.builder;

import org.agrona.MutableDirectBuffer;
import org.agrona.AsciiSequenceView;
import static uk.co.real_logic.artio.dictionary.generation.CodecUtil.*;
import static uk.co.real_logic.artio.dictionary.SessionConstants.*;
import uk.co.real_logic.artio.builder.Encoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.HeaderEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.TrailerEncoder;
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


public class SettlementInstructionsEncoder implements Encoder
{
    public long messageType()
    {
        return 84L;
    }

    public SettlementInstructionsEncoder()
    {
        header.msgType("T");
    }

    private final TrailerEncoder trailer = new TrailerEncoder();

    public TrailerEncoder trailer()
    {
        return trailer;
    }

    private final HeaderEncoder header = new HeaderEncoder();

    public HeaderEncoder header()
    {
        return header;
    }

    private static final int settlInstMsgIDHeaderLength = 4;
    private static final byte[] settlInstMsgIDHeader = new byte[] {55, 55, 55, (byte) '='};

    private static final int settlInstReqIDHeaderLength = 4;
    private static final byte[] settlInstReqIDHeader = new byte[] {55, 57, 49, (byte) '='};

    private static final int settlInstModeHeaderLength = 4;
    private static final byte[] settlInstModeHeader = new byte[] {49, 54, 48, (byte) '='};

    private static final int settlInstReqRejCodeHeaderLength = 4;
    private static final byte[] settlInstReqRejCodeHeader = new byte[] {55, 57, 50, (byte) '='};

    private static final int textHeaderLength = 3;
    private static final byte[] textHeader = new byte[] {53, 56, (byte) '='};

    private static final int encodedTextLenHeaderLength = 4;
    private static final byte[] encodedTextLenHeader = new byte[] {51, 53, 52, (byte) '='};

    private static final int encodedTextHeaderLength = 4;
    private static final byte[] encodedTextHeader = new byte[] {51, 53, 53, (byte) '='};

    private static final int clOrdIDHeaderLength = 3;
    private static final byte[] clOrdIDHeader = new byte[] {49, 49, (byte) '='};

    private static final int transactTimeHeaderLength = 3;
    private static final byte[] transactTimeHeader = new byte[] {54, 48, (byte) '='};

    private final MutableDirectBuffer settlInstMsgID = new UnsafeBuffer();

    private int settlInstMsgIDOffset = 0;

    private int settlInstMsgIDLength = 0;

    public SettlementInstructionsEncoder settlInstMsgID(final DirectBuffer value, final int offset, final int length)
    {
        settlInstMsgID.wrap(value);
        settlInstMsgIDOffset = offset;
        settlInstMsgIDLength = length;
        return this;
    }

    public SettlementInstructionsEncoder settlInstMsgID(final DirectBuffer value, final int length)
    {
        return settlInstMsgID(value, 0, length);
    }

    public SettlementInstructionsEncoder settlInstMsgID(final DirectBuffer value)
    {
        return settlInstMsgID(value, 0, value.capacity());
    }

    public SettlementInstructionsEncoder settlInstMsgID(final byte[] value, final int offset, final int length)
    {
        settlInstMsgID.wrap(value);
        settlInstMsgIDOffset = offset;
        settlInstMsgIDLength = length;
        return this;
    }

    public SettlementInstructionsEncoder settlInstMsgIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlInstMsgID, value, offset, length);
        settlInstMsgIDOffset = offset;
        settlInstMsgIDLength = length;
        return this;
    }

    public SettlementInstructionsEncoder settlInstMsgID(final byte[] value, final int length)
    {
        return settlInstMsgID(value, 0, length);
    }

    public SettlementInstructionsEncoder settlInstMsgID(final byte[] value)
    {
        return settlInstMsgID(value, 0, value.length);
    }

    public boolean hasSettlInstMsgID()
    {
        return settlInstMsgIDLength > 0;
    }

    public MutableDirectBuffer settlInstMsgID()
    {
        return settlInstMsgID;
    }

    public String settlInstMsgIDAsString()
    {
        return settlInstMsgID.getStringWithoutLengthAscii(settlInstMsgIDOffset, settlInstMsgIDLength);
    }

    public SettlementInstructionsEncoder settlInstMsgID(final CharSequence value)
    {
        toBytes(value, settlInstMsgID);
        settlInstMsgIDOffset = 0;
        settlInstMsgIDLength = value.length();
        return this;
    }

    public SettlementInstructionsEncoder settlInstMsgID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            settlInstMsgID.wrap(buffer);
            settlInstMsgIDOffset = value.offset();
            settlInstMsgIDLength = value.length();
        }
        return this;
    }

    public SettlementInstructionsEncoder settlInstMsgID(final char[] value)
    {
        return settlInstMsgID(value, 0, value.length);
    }

    public SettlementInstructionsEncoder settlInstMsgID(final char[] value, final int length)
    {
        return settlInstMsgID(value, 0, length);
    }

    public SettlementInstructionsEncoder settlInstMsgID(final char[] value, final int offset, final int length)
    {
        toBytes(value, settlInstMsgID, offset, length);
        settlInstMsgIDOffset = 0;
        settlInstMsgIDLength = length;
        return this;
    }

    private final MutableDirectBuffer settlInstReqID = new UnsafeBuffer();

    private int settlInstReqIDOffset = 0;

    private int settlInstReqIDLength = 0;

    public SettlementInstructionsEncoder settlInstReqID(final DirectBuffer value, final int offset, final int length)
    {
        settlInstReqID.wrap(value);
        settlInstReqIDOffset = offset;
        settlInstReqIDLength = length;
        return this;
    }

    public SettlementInstructionsEncoder settlInstReqID(final DirectBuffer value, final int length)
    {
        return settlInstReqID(value, 0, length);
    }

    public SettlementInstructionsEncoder settlInstReqID(final DirectBuffer value)
    {
        return settlInstReqID(value, 0, value.capacity());
    }

    public SettlementInstructionsEncoder settlInstReqID(final byte[] value, final int offset, final int length)
    {
        settlInstReqID.wrap(value);
        settlInstReqIDOffset = offset;
        settlInstReqIDLength = length;
        return this;
    }

    public SettlementInstructionsEncoder settlInstReqIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlInstReqID, value, offset, length);
        settlInstReqIDOffset = offset;
        settlInstReqIDLength = length;
        return this;
    }

    public SettlementInstructionsEncoder settlInstReqID(final byte[] value, final int length)
    {
        return settlInstReqID(value, 0, length);
    }

    public SettlementInstructionsEncoder settlInstReqID(final byte[] value)
    {
        return settlInstReqID(value, 0, value.length);
    }

    public boolean hasSettlInstReqID()
    {
        return settlInstReqIDLength > 0;
    }

    public MutableDirectBuffer settlInstReqID()
    {
        return settlInstReqID;
    }

    public String settlInstReqIDAsString()
    {
        return settlInstReqID.getStringWithoutLengthAscii(settlInstReqIDOffset, settlInstReqIDLength);
    }

    public SettlementInstructionsEncoder settlInstReqID(final CharSequence value)
    {
        toBytes(value, settlInstReqID);
        settlInstReqIDOffset = 0;
        settlInstReqIDLength = value.length();
        return this;
    }

    public SettlementInstructionsEncoder settlInstReqID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            settlInstReqID.wrap(buffer);
            settlInstReqIDOffset = value.offset();
            settlInstReqIDLength = value.length();
        }
        return this;
    }

    public SettlementInstructionsEncoder settlInstReqID(final char[] value)
    {
        return settlInstReqID(value, 0, value.length);
    }

    public SettlementInstructionsEncoder settlInstReqID(final char[] value, final int length)
    {
        return settlInstReqID(value, 0, length);
    }

    public SettlementInstructionsEncoder settlInstReqID(final char[] value, final int offset, final int length)
    {
        toBytes(value, settlInstReqID, offset, length);
        settlInstReqIDOffset = 0;
        settlInstReqIDLength = length;
        return this;
    }

    private char settlInstMode;

    private boolean hasSettlInstMode;

    public boolean hasSettlInstMode()
    {
        return hasSettlInstMode;
    }

    public SettlementInstructionsEncoder settlInstMode(char value)
    {
        settlInstMode = value;
        hasSettlInstMode = true;
        return this;
    }

    public char settlInstMode()
    {
        return settlInstMode;
    }

    public SettlementInstructionsEncoder settlInstMode(SettlInstMode value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == SettlInstMode.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: settlInstMode Value: " + value );
            }
            if (value == SettlInstMode.NULL_VAL)
            {
                return this;
            }
        }
        return settlInstMode(value.representation());
    }

    private int settlInstReqRejCode;

    private boolean hasSettlInstReqRejCode;

    public boolean hasSettlInstReqRejCode()
    {
        return hasSettlInstReqRejCode;
    }

    public SettlementInstructionsEncoder settlInstReqRejCode(int value)
    {
        settlInstReqRejCode = value;
        hasSettlInstReqRejCode = true;
        return this;
    }

    public int settlInstReqRejCode()
    {
        return settlInstReqRejCode;
    }

    public SettlementInstructionsEncoder settlInstReqRejCode(SettlInstReqRejCode value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == SettlInstReqRejCode.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: settlInstReqRejCode Value: " + value );
            }
            if (value == SettlInstReqRejCode.NULL_VAL)
            {
                return this;
            }
        }
        return settlInstReqRejCode(value.representation());
    }

    private final MutableDirectBuffer text = new UnsafeBuffer();

    private int textOffset = 0;

    private int textLength = 0;

    public SettlementInstructionsEncoder text(final DirectBuffer value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public SettlementInstructionsEncoder text(final DirectBuffer value, final int length)
    {
        return text(value, 0, length);
    }

    public SettlementInstructionsEncoder text(final DirectBuffer value)
    {
        return text(value, 0, value.capacity());
    }

    public SettlementInstructionsEncoder text(final byte[] value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public SettlementInstructionsEncoder textAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(text, value, offset, length);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public SettlementInstructionsEncoder text(final byte[] value, final int length)
    {
        return text(value, 0, length);
    }

    public SettlementInstructionsEncoder text(final byte[] value)
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

    public SettlementInstructionsEncoder text(final CharSequence value)
    {
        toBytes(value, text);
        textOffset = 0;
        textLength = value.length();
        return this;
    }

    public SettlementInstructionsEncoder text(final AsciiSequenceView value)
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

    public SettlementInstructionsEncoder text(final char[] value)
    {
        return text(value, 0, value.length);
    }

    public SettlementInstructionsEncoder text(final char[] value, final int length)
    {
        return text(value, 0, length);
    }

    public SettlementInstructionsEncoder text(final char[] value, final int offset, final int length)
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

    public SettlementInstructionsEncoder encodedTextLen(int value)
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

    public SettlementInstructionsEncoder encodedText(byte[] value)
    {
        encodedText = value;
        hasEncodedText = true;
        return this;
    }

    public byte[] encodedText()
    {
        return encodedText;
    }

    public SettlementInstructionsEncoder encodedTextAsCopy(final byte[] value, final int offset, final int length)
    {
        encodedText = copyInto(encodedText, value, offset, length);
        hasEncodedText = true;
        return this;
    }

    private final MutableDirectBuffer clOrdID = new UnsafeBuffer();

    private int clOrdIDOffset = 0;

    private int clOrdIDLength = 0;

    public SettlementInstructionsEncoder clOrdID(final DirectBuffer value, final int offset, final int length)
    {
        clOrdID.wrap(value);
        clOrdIDOffset = offset;
        clOrdIDLength = length;
        return this;
    }

    public SettlementInstructionsEncoder clOrdID(final DirectBuffer value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    public SettlementInstructionsEncoder clOrdID(final DirectBuffer value)
    {
        return clOrdID(value, 0, value.capacity());
    }

    public SettlementInstructionsEncoder clOrdID(final byte[] value, final int offset, final int length)
    {
        clOrdID.wrap(value);
        clOrdIDOffset = offset;
        clOrdIDLength = length;
        return this;
    }

    public SettlementInstructionsEncoder clOrdIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(clOrdID, value, offset, length);
        clOrdIDOffset = offset;
        clOrdIDLength = length;
        return this;
    }

    public SettlementInstructionsEncoder clOrdID(final byte[] value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    public SettlementInstructionsEncoder clOrdID(final byte[] value)
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

    public SettlementInstructionsEncoder clOrdID(final CharSequence value)
    {
        toBytes(value, clOrdID);
        clOrdIDOffset = 0;
        clOrdIDLength = value.length();
        return this;
    }

    public SettlementInstructionsEncoder clOrdID(final AsciiSequenceView value)
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

    public SettlementInstructionsEncoder clOrdID(final char[] value)
    {
        return clOrdID(value, 0, value.length);
    }

    public SettlementInstructionsEncoder clOrdID(final char[] value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    public SettlementInstructionsEncoder clOrdID(final char[] value, final int offset, final int length)
    {
        toBytes(value, clOrdID, offset, length);
        clOrdIDOffset = 0;
        clOrdIDLength = length;
        return this;
    }

    private final MutableDirectBuffer transactTime = new UnsafeBuffer();

    private int transactTimeOffset = 0;

    private int transactTimeLength = 0;

    public SettlementInstructionsEncoder transactTime(final DirectBuffer value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public SettlementInstructionsEncoder transactTime(final DirectBuffer value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public SettlementInstructionsEncoder transactTime(final DirectBuffer value)
    {
        return transactTime(value, 0, value.capacity());
    }

    public SettlementInstructionsEncoder transactTime(final byte[] value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public SettlementInstructionsEncoder transactTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(transactTime, value, offset, length);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public SettlementInstructionsEncoder transactTime(final byte[] value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public SettlementInstructionsEncoder transactTime(final byte[] value)
    {
        return transactTime(value, 0, value.length);
    }

    public boolean hasTransactTime()
    {
        return transactTimeLength > 0;
    }

    public MutableDirectBuffer transactTime()
    {
        return transactTime;
    }

    public String transactTimeAsString()
    {
        return transactTime.getStringWithoutLengthAscii(transactTimeOffset, transactTimeLength);
    }

    private final SettlInstGrpEncoder settlInstGrp = new SettlInstGrpEncoder();
    public SettlInstGrpEncoder settlInstGrp()
    {
        return settlInstGrp;
    }

    public long encode(final MutableAsciiBuffer buffer, final int offset)
    {
        final long startMessageResult = header.startMessage(buffer, offset);
        final int bodyStart = Encoder.offset(startMessageResult);
        int position = bodyStart + Encoder.length(startMessageResult);

        if (settlInstMsgIDLength > 0)
        {
            buffer.putBytes(position, settlInstMsgIDHeader, 0, settlInstMsgIDHeaderLength);
            position += settlInstMsgIDHeaderLength;
            buffer.putBytes(position, settlInstMsgID, settlInstMsgIDOffset, settlInstMsgIDLength);
            position += settlInstMsgIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: SettlInstMsgID");
        }

        if (settlInstReqIDLength > 0)
        {
            buffer.putBytes(position, settlInstReqIDHeader, 0, settlInstReqIDHeaderLength);
            position += settlInstReqIDHeaderLength;
            buffer.putBytes(position, settlInstReqID, settlInstReqIDOffset, settlInstReqIDLength);
            position += settlInstReqIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasSettlInstMode)
        {
            buffer.putBytes(position, settlInstModeHeader, 0, settlInstModeHeaderLength);
            position += settlInstModeHeaderLength;
            position += buffer.putCharAscii(position, settlInstMode);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: SettlInstMode");
        }

        if (hasSettlInstReqRejCode)
        {
            buffer.putBytes(position, settlInstReqRejCodeHeader, 0, settlInstReqRejCodeHeaderLength);
            position += settlInstReqRejCodeHeaderLength;
            position += buffer.putIntAscii(position, settlInstReqRejCode);
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

        if (clOrdIDLength > 0)
        {
            buffer.putBytes(position, clOrdIDHeader, 0, clOrdIDHeaderLength);
            position += clOrdIDHeaderLength;
            buffer.putBytes(position, clOrdID, clOrdIDOffset, clOrdIDLength);
            position += clOrdIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (transactTimeLength > 0)
        {
            buffer.putBytes(position, transactTimeHeader, 0, transactTimeHeaderLength);
            position += transactTimeHeaderLength;
            buffer.putBytes(position, transactTime, transactTimeOffset, transactTimeLength);
            position += transactTimeLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: TransactTime");
        }

            position += settlInstGrp.encode(buffer, position);
        position += trailer.startTrailer(buffer, position);

        final int messageStart = header.finishHeader(buffer, bodyStart, position - bodyStart);
        return trailer.finishMessage(buffer, messageStart, position);
    }

    public void reset()
    {
        header.reset();
        trailer.reset();
        resetMessage();
    }

    public void resetMessage()
    {
        this.resetSettlInstMsgID();
        this.resetSettlInstReqID();
        this.resetSettlInstMode();
        this.resetSettlInstReqRejCode();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        this.resetClOrdID();
        this.resetTransactTime();
        settlInstGrp.reset();
    }

    public void resetSettlInstMsgID()
    {
        settlInstMsgIDLength = 0;
    }

    public void resetSettlInstReqID()
    {
        settlInstReqIDLength = 0;
    }

    public void resetSettlInstMode()
    {
        settlInstMode = MISSING_CHAR;
    }

    public void resetSettlInstReqRejCode()
    {
        hasSettlInstReqRejCode = false;
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

    public void resetClOrdID()
    {
        clOrdIDLength = 0;
    }

    public void resetTransactTime()
    {
        transactTimeLength = 0;
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
        builder.append("\"MessageName\": \"SettlementInstructions\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasSettlInstMsgID())
        {
            indent(builder, level);
            builder.append("\"SettlInstMsgID\": \"");
            appendBuffer(builder, settlInstMsgID, settlInstMsgIDOffset, settlInstMsgIDLength);
            builder.append("\",\n");
        }

        if (hasSettlInstReqID())
        {
            indent(builder, level);
            builder.append("\"SettlInstReqID\": \"");
            appendBuffer(builder, settlInstReqID, settlInstReqIDOffset, settlInstReqIDLength);
            builder.append("\",\n");
        }

        if (hasSettlInstMode())
        {
            indent(builder, level);
            builder.append("\"SettlInstMode\": \"");
            builder.append(settlInstMode);
            builder.append("\",\n");
        }

        if (hasSettlInstReqRejCode())
        {
            indent(builder, level);
            builder.append("\"SettlInstReqRejCode\": \"");
            builder.append(settlInstReqRejCode);
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

        if (hasClOrdID())
        {
            indent(builder, level);
            builder.append("\"ClOrdID\": \"");
            appendBuffer(builder, clOrdID, clOrdIDOffset, clOrdIDLength);
            builder.append("\",\n");
        }

        if (hasTransactTime())
        {
            indent(builder, level);
            builder.append("\"TransactTime\": \"");
            appendBuffer(builder, transactTime, transactTimeOffset, transactTimeLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"SettlInstGrp\": ");
    settlInstGrp.appendTo(builder, level + 1);
    builder.append("\n");
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public SettlementInstructionsEncoder copyTo(final Encoder encoder)
    {
        return copyTo((SettlementInstructionsEncoder)encoder);
    }

    public SettlementInstructionsEncoder copyTo(final SettlementInstructionsEncoder encoder)
    {
        encoder.reset();
        if (hasSettlInstMsgID())
        {
            encoder.settlInstMsgIDAsCopy(settlInstMsgID.byteArray(), 0, settlInstMsgIDLength);
        }

        if (hasSettlInstReqID())
        {
            encoder.settlInstReqIDAsCopy(settlInstReqID.byteArray(), 0, settlInstReqIDLength);
        }

        if (hasSettlInstMode())
        {
            encoder.settlInstMode(this.settlInstMode());
        }

        if (hasSettlInstReqRejCode())
        {
            encoder.settlInstReqRejCode(this.settlInstReqRejCode());
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

        if (hasClOrdID())
        {
            encoder.clOrdIDAsCopy(clOrdID.byteArray(), 0, clOrdIDLength);
        }

        if (hasTransactTime())
        {
            encoder.transactTimeAsCopy(transactTime.byteArray(), 0, transactTimeLength);
        }


        settlInstGrp.copyTo(encoder.settlInstGrp());        return encoder;
    }

}
