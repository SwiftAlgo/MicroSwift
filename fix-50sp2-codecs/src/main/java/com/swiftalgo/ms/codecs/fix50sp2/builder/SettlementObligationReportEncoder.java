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


public class SettlementObligationReportEncoder implements Encoder
{
    public long messageType()
    {
        return 20802L;
    }

    public SettlementObligationReportEncoder()
    {
        header.msgType("BQ");
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

    private static final int clearingBusinessDateHeaderLength = 4;
    private static final byte[] clearingBusinessDateHeader = new byte[] {55, 49, 53, (byte) '='};

    private static final int settlementCycleNoHeaderLength = 5;
    private static final byte[] settlementCycleNoHeader = new byte[] {49, 49, 53, 51, (byte) '='};

    private static final int settlObligMsgIDHeaderLength = 5;
    private static final byte[] settlObligMsgIDHeader = new byte[] {49, 49, 54, 48, (byte) '='};

    private static final int settlObligModeHeaderLength = 5;
    private static final byte[] settlObligModeHeader = new byte[] {49, 49, 53, 57, (byte) '='};

    private static final int textHeaderLength = 3;
    private static final byte[] textHeader = new byte[] {53, 56, (byte) '='};

    private static final int encodedTextLenHeaderLength = 4;
    private static final byte[] encodedTextLenHeader = new byte[] {51, 53, 52, (byte) '='};

    private static final int encodedTextHeaderLength = 4;
    private static final byte[] encodedTextHeader = new byte[] {51, 53, 53, (byte) '='};

    private static final int transactTimeHeaderLength = 3;
    private static final byte[] transactTimeHeader = new byte[] {54, 48, (byte) '='};

    private final ApplicationSequenceControlEncoder applicationSequenceControl = new ApplicationSequenceControlEncoder();
    public ApplicationSequenceControlEncoder applicationSequenceControl()
    {
        return applicationSequenceControl;
    }

    private final MutableDirectBuffer clearingBusinessDate = new UnsafeBuffer();

    private int clearingBusinessDateOffset = 0;

    private int clearingBusinessDateLength = 0;

    public SettlementObligationReportEncoder clearingBusinessDate(final DirectBuffer value, final int offset, final int length)
    {
        clearingBusinessDate.wrap(value);
        clearingBusinessDateOffset = offset;
        clearingBusinessDateLength = length;
        return this;
    }

    public SettlementObligationReportEncoder clearingBusinessDate(final DirectBuffer value, final int length)
    {
        return clearingBusinessDate(value, 0, length);
    }

    public SettlementObligationReportEncoder clearingBusinessDate(final DirectBuffer value)
    {
        return clearingBusinessDate(value, 0, value.capacity());
    }

    public SettlementObligationReportEncoder clearingBusinessDate(final byte[] value, final int offset, final int length)
    {
        clearingBusinessDate.wrap(value);
        clearingBusinessDateOffset = offset;
        clearingBusinessDateLength = length;
        return this;
    }

    public SettlementObligationReportEncoder clearingBusinessDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(clearingBusinessDate, value, offset, length);
        clearingBusinessDateOffset = offset;
        clearingBusinessDateLength = length;
        return this;
    }

    public SettlementObligationReportEncoder clearingBusinessDate(final byte[] value, final int length)
    {
        return clearingBusinessDate(value, 0, length);
    }

    public SettlementObligationReportEncoder clearingBusinessDate(final byte[] value)
    {
        return clearingBusinessDate(value, 0, value.length);
    }

    public boolean hasClearingBusinessDate()
    {
        return clearingBusinessDateLength > 0;
    }

    public MutableDirectBuffer clearingBusinessDate()
    {
        return clearingBusinessDate;
    }

    public String clearingBusinessDateAsString()
    {
        return clearingBusinessDate.getStringWithoutLengthAscii(clearingBusinessDateOffset, clearingBusinessDateLength);
    }

    private int settlementCycleNo;

    private boolean hasSettlementCycleNo;

    public boolean hasSettlementCycleNo()
    {
        return hasSettlementCycleNo;
    }

    public SettlementObligationReportEncoder settlementCycleNo(int value)
    {
        settlementCycleNo = value;
        hasSettlementCycleNo = true;
        return this;
    }

    public int settlementCycleNo()
    {
        return settlementCycleNo;
    }

    private final MutableDirectBuffer settlObligMsgID = new UnsafeBuffer();

    private int settlObligMsgIDOffset = 0;

    private int settlObligMsgIDLength = 0;

    public SettlementObligationReportEncoder settlObligMsgID(final DirectBuffer value, final int offset, final int length)
    {
        settlObligMsgID.wrap(value);
        settlObligMsgIDOffset = offset;
        settlObligMsgIDLength = length;
        return this;
    }

    public SettlementObligationReportEncoder settlObligMsgID(final DirectBuffer value, final int length)
    {
        return settlObligMsgID(value, 0, length);
    }

    public SettlementObligationReportEncoder settlObligMsgID(final DirectBuffer value)
    {
        return settlObligMsgID(value, 0, value.capacity());
    }

    public SettlementObligationReportEncoder settlObligMsgID(final byte[] value, final int offset, final int length)
    {
        settlObligMsgID.wrap(value);
        settlObligMsgIDOffset = offset;
        settlObligMsgIDLength = length;
        return this;
    }

    public SettlementObligationReportEncoder settlObligMsgIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlObligMsgID, value, offset, length);
        settlObligMsgIDOffset = offset;
        settlObligMsgIDLength = length;
        return this;
    }

    public SettlementObligationReportEncoder settlObligMsgID(final byte[] value, final int length)
    {
        return settlObligMsgID(value, 0, length);
    }

    public SettlementObligationReportEncoder settlObligMsgID(final byte[] value)
    {
        return settlObligMsgID(value, 0, value.length);
    }

    public boolean hasSettlObligMsgID()
    {
        return settlObligMsgIDLength > 0;
    }

    public MutableDirectBuffer settlObligMsgID()
    {
        return settlObligMsgID;
    }

    public String settlObligMsgIDAsString()
    {
        return settlObligMsgID.getStringWithoutLengthAscii(settlObligMsgIDOffset, settlObligMsgIDLength);
    }

    public SettlementObligationReportEncoder settlObligMsgID(final CharSequence value)
    {
        toBytes(value, settlObligMsgID);
        settlObligMsgIDOffset = 0;
        settlObligMsgIDLength = value.length();
        return this;
    }

    public SettlementObligationReportEncoder settlObligMsgID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            settlObligMsgID.wrap(buffer);
            settlObligMsgIDOffset = value.offset();
            settlObligMsgIDLength = value.length();
        }
        return this;
    }

    public SettlementObligationReportEncoder settlObligMsgID(final char[] value)
    {
        return settlObligMsgID(value, 0, value.length);
    }

    public SettlementObligationReportEncoder settlObligMsgID(final char[] value, final int length)
    {
        return settlObligMsgID(value, 0, length);
    }

    public SettlementObligationReportEncoder settlObligMsgID(final char[] value, final int offset, final int length)
    {
        toBytes(value, settlObligMsgID, offset, length);
        settlObligMsgIDOffset = 0;
        settlObligMsgIDLength = length;
        return this;
    }

    private int settlObligMode;

    private boolean hasSettlObligMode;

    public boolean hasSettlObligMode()
    {
        return hasSettlObligMode;
    }

    public SettlementObligationReportEncoder settlObligMode(int value)
    {
        settlObligMode = value;
        hasSettlObligMode = true;
        return this;
    }

    public int settlObligMode()
    {
        return settlObligMode;
    }

    public SettlementObligationReportEncoder settlObligMode(SettlObligMode value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == SettlObligMode.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: settlObligMode Value: " + value );
            }
            if (value == SettlObligMode.NULL_VAL)
            {
                return this;
            }
        }
        return settlObligMode(value.representation());
    }

    private final MutableDirectBuffer text = new UnsafeBuffer();

    private int textOffset = 0;

    private int textLength = 0;

    public SettlementObligationReportEncoder text(final DirectBuffer value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public SettlementObligationReportEncoder text(final DirectBuffer value, final int length)
    {
        return text(value, 0, length);
    }

    public SettlementObligationReportEncoder text(final DirectBuffer value)
    {
        return text(value, 0, value.capacity());
    }

    public SettlementObligationReportEncoder text(final byte[] value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public SettlementObligationReportEncoder textAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(text, value, offset, length);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public SettlementObligationReportEncoder text(final byte[] value, final int length)
    {
        return text(value, 0, length);
    }

    public SettlementObligationReportEncoder text(final byte[] value)
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

    public SettlementObligationReportEncoder text(final CharSequence value)
    {
        toBytes(value, text);
        textOffset = 0;
        textLength = value.length();
        return this;
    }

    public SettlementObligationReportEncoder text(final AsciiSequenceView value)
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

    public SettlementObligationReportEncoder text(final char[] value)
    {
        return text(value, 0, value.length);
    }

    public SettlementObligationReportEncoder text(final char[] value, final int length)
    {
        return text(value, 0, length);
    }

    public SettlementObligationReportEncoder text(final char[] value, final int offset, final int length)
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

    public SettlementObligationReportEncoder encodedTextLen(int value)
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

    public SettlementObligationReportEncoder encodedText(byte[] value)
    {
        encodedText = value;
        hasEncodedText = true;
        return this;
    }

    public byte[] encodedText()
    {
        return encodedText;
    }

    public SettlementObligationReportEncoder encodedTextAsCopy(final byte[] value, final int offset, final int length)
    {
        encodedText = copyInto(encodedText, value, offset, length);
        hasEncodedText = true;
        return this;
    }

    private final MutableDirectBuffer transactTime = new UnsafeBuffer();

    private int transactTimeOffset = 0;

    private int transactTimeLength = 0;

    public SettlementObligationReportEncoder transactTime(final DirectBuffer value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public SettlementObligationReportEncoder transactTime(final DirectBuffer value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public SettlementObligationReportEncoder transactTime(final DirectBuffer value)
    {
        return transactTime(value, 0, value.capacity());
    }

    public SettlementObligationReportEncoder transactTime(final byte[] value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public SettlementObligationReportEncoder transactTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(transactTime, value, offset, length);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public SettlementObligationReportEncoder transactTime(final byte[] value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public SettlementObligationReportEncoder transactTime(final byte[] value)
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

    private final SettlObligationInstructionsEncoder settlObligationInstructions = new SettlObligationInstructionsEncoder();
    public SettlObligationInstructionsEncoder settlObligationInstructions()
    {
        return settlObligationInstructions;
    }

    public long encode(final MutableAsciiBuffer buffer, final int offset)
    {
        final long startMessageResult = header.startMessage(buffer, offset);
        final int bodyStart = Encoder.offset(startMessageResult);
        int position = bodyStart + Encoder.length(startMessageResult);

            position += applicationSequenceControl.encode(buffer, position);

        if (clearingBusinessDateLength > 0)
        {
            buffer.putBytes(position, clearingBusinessDateHeader, 0, clearingBusinessDateHeaderLength);
            position += clearingBusinessDateHeaderLength;
            buffer.putBytes(position, clearingBusinessDate, clearingBusinessDateOffset, clearingBusinessDateLength);
            position += clearingBusinessDateLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasSettlementCycleNo)
        {
            buffer.putBytes(position, settlementCycleNoHeader, 0, settlementCycleNoHeaderLength);
            position += settlementCycleNoHeaderLength;
            position += buffer.putIntAscii(position, settlementCycleNo);
            buffer.putSeparator(position);
            position++;
        }

        if (settlObligMsgIDLength > 0)
        {
            buffer.putBytes(position, settlObligMsgIDHeader, 0, settlObligMsgIDHeaderLength);
            position += settlObligMsgIDHeaderLength;
            buffer.putBytes(position, settlObligMsgID, settlObligMsgIDOffset, settlObligMsgIDLength);
            position += settlObligMsgIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: SettlObligMsgID");
        }

        if (hasSettlObligMode)
        {
            buffer.putBytes(position, settlObligModeHeader, 0, settlObligModeHeaderLength);
            position += settlObligModeHeaderLength;
            position += buffer.putIntAscii(position, settlObligMode);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: SettlObligMode");
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

        if (transactTimeLength > 0)
        {
            buffer.putBytes(position, transactTimeHeader, 0, transactTimeHeaderLength);
            position += transactTimeHeaderLength;
            buffer.putBytes(position, transactTime, transactTimeOffset, transactTimeLength);
            position += transactTimeLength;
            buffer.putSeparator(position);
            position++;
        }

            position += settlObligationInstructions.encode(buffer, position);
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
        this.resetClearingBusinessDate();
        this.resetSettlementCycleNo();
        this.resetSettlObligMsgID();
        this.resetSettlObligMode();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        this.resetTransactTime();
        applicationSequenceControl.reset();
        settlObligationInstructions.reset();
    }

    public void resetClearingBusinessDate()
    {
        clearingBusinessDateLength = 0;
    }

    public void resetSettlementCycleNo()
    {
        hasSettlementCycleNo = false;
    }

    public void resetSettlObligMsgID()
    {
        settlObligMsgIDLength = 0;
    }

    public void resetSettlObligMode()
    {
        hasSettlObligMode = false;
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
        builder.append("\"MessageName\": \"SettlementObligationReport\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
    indent(builder, level);
    builder.append("\"ApplicationSequenceControl\": ");
    applicationSequenceControl.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasClearingBusinessDate())
        {
            indent(builder, level);
            builder.append("\"ClearingBusinessDate\": \"");
            appendBuffer(builder, clearingBusinessDate, clearingBusinessDateOffset, clearingBusinessDateLength);
            builder.append("\",\n");
        }

        if (hasSettlementCycleNo())
        {
            indent(builder, level);
            builder.append("\"SettlementCycleNo\": \"");
            builder.append(settlementCycleNo);
            builder.append("\",\n");
        }

        if (hasSettlObligMsgID())
        {
            indent(builder, level);
            builder.append("\"SettlObligMsgID\": \"");
            appendBuffer(builder, settlObligMsgID, settlObligMsgIDOffset, settlObligMsgIDLength);
            builder.append("\",\n");
        }

        if (hasSettlObligMode())
        {
            indent(builder, level);
            builder.append("\"SettlObligMode\": \"");
            builder.append(settlObligMode);
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

        if (hasTransactTime())
        {
            indent(builder, level);
            builder.append("\"TransactTime\": \"");
            appendBuffer(builder, transactTime, transactTimeOffset, transactTimeLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"SettlObligationInstructions\": ");
    settlObligationInstructions.appendTo(builder, level + 1);
    builder.append("\n");
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public SettlementObligationReportEncoder copyTo(final Encoder encoder)
    {
        return copyTo((SettlementObligationReportEncoder)encoder);
    }

    public SettlementObligationReportEncoder copyTo(final SettlementObligationReportEncoder encoder)
    {
        encoder.reset();

        applicationSequenceControl.copyTo(encoder.applicationSequenceControl());
        if (hasClearingBusinessDate())
        {
            encoder.clearingBusinessDateAsCopy(clearingBusinessDate.byteArray(), 0, clearingBusinessDateLength);
        }

        if (hasSettlementCycleNo())
        {
            encoder.settlementCycleNo(this.settlementCycleNo());
        }

        if (hasSettlObligMsgID())
        {
            encoder.settlObligMsgIDAsCopy(settlObligMsgID.byteArray(), 0, settlObligMsgIDLength);
        }

        if (hasSettlObligMode())
        {
            encoder.settlObligMode(this.settlObligMode());
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

        if (hasTransactTime())
        {
            encoder.transactTimeAsCopy(transactTime.byteArray(), 0, transactTimeLength);
        }


        settlObligationInstructions.copyTo(encoder.settlObligationInstructions());        return encoder;
    }

}
