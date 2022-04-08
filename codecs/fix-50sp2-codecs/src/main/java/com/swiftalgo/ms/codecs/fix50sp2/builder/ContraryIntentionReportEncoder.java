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


public class ContraryIntentionReportEncoder implements Encoder
{
    public long messageType()
    {
        return 20290L;
    }

    public ContraryIntentionReportEncoder()
    {
        header.msgType("BO");
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

    private static final int contIntRptIDHeaderLength = 4;
    private static final byte[] contIntRptIDHeader = new byte[] {57, 55, 55, (byte) '='};

    private static final int transactTimeHeaderLength = 3;
    private static final byte[] transactTimeHeader = new byte[] {54, 48, (byte) '='};

    private static final int lateIndicatorHeaderLength = 4;
    private static final byte[] lateIndicatorHeader = new byte[] {57, 55, 56, (byte) '='};

    private static final int inputSourceHeaderLength = 4;
    private static final byte[] inputSourceHeader = new byte[] {57, 55, 57, (byte) '='};

    private static final int clearingBusinessDateHeaderLength = 4;
    private static final byte[] clearingBusinessDateHeader = new byte[] {55, 49, 53, (byte) '='};

    private static final int textHeaderLength = 3;
    private static final byte[] textHeader = new byte[] {53, 56, (byte) '='};

    private static final int encodedTextLenHeaderLength = 4;
    private static final byte[] encodedTextLenHeader = new byte[] {51, 53, 52, (byte) '='};

    private static final int encodedTextHeaderLength = 4;
    private static final byte[] encodedTextHeader = new byte[] {51, 53, 53, (byte) '='};

    private final ApplicationSequenceControlEncoder applicationSequenceControl = new ApplicationSequenceControlEncoder();
    public ApplicationSequenceControlEncoder applicationSequenceControl()
    {
        return applicationSequenceControl;
    }

    private final MutableDirectBuffer contIntRptID = new UnsafeBuffer();

    private int contIntRptIDOffset = 0;

    private int contIntRptIDLength = 0;

    public ContraryIntentionReportEncoder contIntRptID(final DirectBuffer value, final int offset, final int length)
    {
        contIntRptID.wrap(value);
        contIntRptIDOffset = offset;
        contIntRptIDLength = length;
        return this;
    }

    public ContraryIntentionReportEncoder contIntRptID(final DirectBuffer value, final int length)
    {
        return contIntRptID(value, 0, length);
    }

    public ContraryIntentionReportEncoder contIntRptID(final DirectBuffer value)
    {
        return contIntRptID(value, 0, value.capacity());
    }

    public ContraryIntentionReportEncoder contIntRptID(final byte[] value, final int offset, final int length)
    {
        contIntRptID.wrap(value);
        contIntRptIDOffset = offset;
        contIntRptIDLength = length;
        return this;
    }

    public ContraryIntentionReportEncoder contIntRptIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(contIntRptID, value, offset, length);
        contIntRptIDOffset = offset;
        contIntRptIDLength = length;
        return this;
    }

    public ContraryIntentionReportEncoder contIntRptID(final byte[] value, final int length)
    {
        return contIntRptID(value, 0, length);
    }

    public ContraryIntentionReportEncoder contIntRptID(final byte[] value)
    {
        return contIntRptID(value, 0, value.length);
    }

    public boolean hasContIntRptID()
    {
        return contIntRptIDLength > 0;
    }

    public MutableDirectBuffer contIntRptID()
    {
        return contIntRptID;
    }

    public String contIntRptIDAsString()
    {
        return contIntRptID.getStringWithoutLengthAscii(contIntRptIDOffset, contIntRptIDLength);
    }

    public ContraryIntentionReportEncoder contIntRptID(final CharSequence value)
    {
        toBytes(value, contIntRptID);
        contIntRptIDOffset = 0;
        contIntRptIDLength = value.length();
        return this;
    }

    public ContraryIntentionReportEncoder contIntRptID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            contIntRptID.wrap(buffer);
            contIntRptIDOffset = value.offset();
            contIntRptIDLength = value.length();
        }
        return this;
    }

    public ContraryIntentionReportEncoder contIntRptID(final char[] value)
    {
        return contIntRptID(value, 0, value.length);
    }

    public ContraryIntentionReportEncoder contIntRptID(final char[] value, final int length)
    {
        return contIntRptID(value, 0, length);
    }

    public ContraryIntentionReportEncoder contIntRptID(final char[] value, final int offset, final int length)
    {
        toBytes(value, contIntRptID, offset, length);
        contIntRptIDOffset = 0;
        contIntRptIDLength = length;
        return this;
    }

    private final MutableDirectBuffer transactTime = new UnsafeBuffer();

    private int transactTimeOffset = 0;

    private int transactTimeLength = 0;

    public ContraryIntentionReportEncoder transactTime(final DirectBuffer value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public ContraryIntentionReportEncoder transactTime(final DirectBuffer value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public ContraryIntentionReportEncoder transactTime(final DirectBuffer value)
    {
        return transactTime(value, 0, value.capacity());
    }

    public ContraryIntentionReportEncoder transactTime(final byte[] value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public ContraryIntentionReportEncoder transactTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(transactTime, value, offset, length);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public ContraryIntentionReportEncoder transactTime(final byte[] value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public ContraryIntentionReportEncoder transactTime(final byte[] value)
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

    private boolean lateIndicator;

    private boolean hasLateIndicator;

    public boolean hasLateIndicator()
    {
        return hasLateIndicator;
    }

    public ContraryIntentionReportEncoder lateIndicator(boolean value)
    {
        lateIndicator = value;
        hasLateIndicator = true;
        return this;
    }

    public boolean lateIndicator()
    {
        return lateIndicator;
    }

    private final MutableDirectBuffer inputSource = new UnsafeBuffer();

    private int inputSourceOffset = 0;

    private int inputSourceLength = 0;

    public ContraryIntentionReportEncoder inputSource(final DirectBuffer value, final int offset, final int length)
    {
        inputSource.wrap(value);
        inputSourceOffset = offset;
        inputSourceLength = length;
        return this;
    }

    public ContraryIntentionReportEncoder inputSource(final DirectBuffer value, final int length)
    {
        return inputSource(value, 0, length);
    }

    public ContraryIntentionReportEncoder inputSource(final DirectBuffer value)
    {
        return inputSource(value, 0, value.capacity());
    }

    public ContraryIntentionReportEncoder inputSource(final byte[] value, final int offset, final int length)
    {
        inputSource.wrap(value);
        inputSourceOffset = offset;
        inputSourceLength = length;
        return this;
    }

    public ContraryIntentionReportEncoder inputSourceAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(inputSource, value, offset, length);
        inputSourceOffset = offset;
        inputSourceLength = length;
        return this;
    }

    public ContraryIntentionReportEncoder inputSource(final byte[] value, final int length)
    {
        return inputSource(value, 0, length);
    }

    public ContraryIntentionReportEncoder inputSource(final byte[] value)
    {
        return inputSource(value, 0, value.length);
    }

    public boolean hasInputSource()
    {
        return inputSourceLength > 0;
    }

    public MutableDirectBuffer inputSource()
    {
        return inputSource;
    }

    public String inputSourceAsString()
    {
        return inputSource.getStringWithoutLengthAscii(inputSourceOffset, inputSourceLength);
    }

    public ContraryIntentionReportEncoder inputSource(final CharSequence value)
    {
        toBytes(value, inputSource);
        inputSourceOffset = 0;
        inputSourceLength = value.length();
        return this;
    }

    public ContraryIntentionReportEncoder inputSource(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            inputSource.wrap(buffer);
            inputSourceOffset = value.offset();
            inputSourceLength = value.length();
        }
        return this;
    }

    public ContraryIntentionReportEncoder inputSource(final char[] value)
    {
        return inputSource(value, 0, value.length);
    }

    public ContraryIntentionReportEncoder inputSource(final char[] value, final int length)
    {
        return inputSource(value, 0, length);
    }

    public ContraryIntentionReportEncoder inputSource(final char[] value, final int offset, final int length)
    {
        toBytes(value, inputSource, offset, length);
        inputSourceOffset = 0;
        inputSourceLength = length;
        return this;
    }

    private final MutableDirectBuffer clearingBusinessDate = new UnsafeBuffer();

    private int clearingBusinessDateOffset = 0;

    private int clearingBusinessDateLength = 0;

    public ContraryIntentionReportEncoder clearingBusinessDate(final DirectBuffer value, final int offset, final int length)
    {
        clearingBusinessDate.wrap(value);
        clearingBusinessDateOffset = offset;
        clearingBusinessDateLength = length;
        return this;
    }

    public ContraryIntentionReportEncoder clearingBusinessDate(final DirectBuffer value, final int length)
    {
        return clearingBusinessDate(value, 0, length);
    }

    public ContraryIntentionReportEncoder clearingBusinessDate(final DirectBuffer value)
    {
        return clearingBusinessDate(value, 0, value.capacity());
    }

    public ContraryIntentionReportEncoder clearingBusinessDate(final byte[] value, final int offset, final int length)
    {
        clearingBusinessDate.wrap(value);
        clearingBusinessDateOffset = offset;
        clearingBusinessDateLength = length;
        return this;
    }

    public ContraryIntentionReportEncoder clearingBusinessDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(clearingBusinessDate, value, offset, length);
        clearingBusinessDateOffset = offset;
        clearingBusinessDateLength = length;
        return this;
    }

    public ContraryIntentionReportEncoder clearingBusinessDate(final byte[] value, final int length)
    {
        return clearingBusinessDate(value, 0, length);
    }

    public ContraryIntentionReportEncoder clearingBusinessDate(final byte[] value)
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

    private final PartiesEncoder parties = new PartiesEncoder();
    public PartiesEncoder parties()
    {
        return parties;
    }

    private final ExpirationQtyEncoder expirationQty = new ExpirationQtyEncoder();
    public ExpirationQtyEncoder expirationQty()
    {
        return expirationQty;
    }

    private final InstrumentEncoder instrument = new InstrumentEncoder();
    public InstrumentEncoder instrument()
    {
        return instrument;
    }

    private final UndInstrmtGrpEncoder undInstrmtGrp = new UndInstrmtGrpEncoder();
    public UndInstrmtGrpEncoder undInstrmtGrp()
    {
        return undInstrmtGrp;
    }

    private final MutableDirectBuffer text = new UnsafeBuffer();

    private int textOffset = 0;

    private int textLength = 0;

    public ContraryIntentionReportEncoder text(final DirectBuffer value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public ContraryIntentionReportEncoder text(final DirectBuffer value, final int length)
    {
        return text(value, 0, length);
    }

    public ContraryIntentionReportEncoder text(final DirectBuffer value)
    {
        return text(value, 0, value.capacity());
    }

    public ContraryIntentionReportEncoder text(final byte[] value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public ContraryIntentionReportEncoder textAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(text, value, offset, length);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public ContraryIntentionReportEncoder text(final byte[] value, final int length)
    {
        return text(value, 0, length);
    }

    public ContraryIntentionReportEncoder text(final byte[] value)
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

    public ContraryIntentionReportEncoder text(final CharSequence value)
    {
        toBytes(value, text);
        textOffset = 0;
        textLength = value.length();
        return this;
    }

    public ContraryIntentionReportEncoder text(final AsciiSequenceView value)
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

    public ContraryIntentionReportEncoder text(final char[] value)
    {
        return text(value, 0, value.length);
    }

    public ContraryIntentionReportEncoder text(final char[] value, final int length)
    {
        return text(value, 0, length);
    }

    public ContraryIntentionReportEncoder text(final char[] value, final int offset, final int length)
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

    public ContraryIntentionReportEncoder encodedTextLen(int value)
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

    public ContraryIntentionReportEncoder encodedText(byte[] value)
    {
        encodedText = value;
        hasEncodedText = true;
        return this;
    }

    public byte[] encodedText()
    {
        return encodedText;
    }

    public ContraryIntentionReportEncoder encodedTextAsCopy(final byte[] value, final int offset, final int length)
    {
        encodedText = copyInto(encodedText, value, offset, length);
        hasEncodedText = true;
        return this;
    }

    public long encode(final MutableAsciiBuffer buffer, final int offset)
    {
        final long startMessageResult = header.startMessage(buffer, offset);
        final int bodyStart = Encoder.offset(startMessageResult);
        int position = bodyStart + Encoder.length(startMessageResult);

            position += applicationSequenceControl.encode(buffer, position);

        if (contIntRptIDLength > 0)
        {
            buffer.putBytes(position, contIntRptIDHeader, 0, contIntRptIDHeaderLength);
            position += contIntRptIDHeaderLength;
            buffer.putBytes(position, contIntRptID, contIntRptIDOffset, contIntRptIDLength);
            position += contIntRptIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: ContIntRptID");
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

        if (hasLateIndicator)
        {
            buffer.putBytes(position, lateIndicatorHeader, 0, lateIndicatorHeaderLength);
            position += lateIndicatorHeaderLength;
            position += buffer.putBooleanAscii(position, lateIndicator);
            buffer.putSeparator(position);
            position++;
        }

        if (inputSourceLength > 0)
        {
            buffer.putBytes(position, inputSourceHeader, 0, inputSourceHeaderLength);
            position += inputSourceHeaderLength;
            buffer.putBytes(position, inputSource, inputSourceOffset, inputSourceLength);
            position += inputSourceLength;
            buffer.putSeparator(position);
            position++;
        }

        if (clearingBusinessDateLength > 0)
        {
            buffer.putBytes(position, clearingBusinessDateHeader, 0, clearingBusinessDateHeaderLength);
            position += clearingBusinessDateHeaderLength;
            buffer.putBytes(position, clearingBusinessDate, clearingBusinessDateOffset, clearingBusinessDateLength);
            position += clearingBusinessDateLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: ClearingBusinessDate");
        }

            position += parties.encode(buffer, position);

            position += expirationQty.encode(buffer, position);

            position += instrument.encode(buffer, position);

            position += undInstrmtGrp.encode(buffer, position);

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
        this.resetContIntRptID();
        this.resetTransactTime();
        this.resetLateIndicator();
        this.resetInputSource();
        this.resetClearingBusinessDate();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        applicationSequenceControl.reset();
        parties.reset();
        expirationQty.reset();
        instrument.reset();
        undInstrmtGrp.reset();
    }

    public void resetContIntRptID()
    {
        contIntRptIDLength = 0;
    }

    public void resetTransactTime()
    {
        transactTimeLength = 0;
    }

    public void resetLateIndicator()
    {
        hasLateIndicator = false;
    }

    public void resetInputSource()
    {
        inputSourceLength = 0;
    }

    public void resetClearingBusinessDate()
    {
        clearingBusinessDateLength = 0;
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
        builder.append("\"MessageName\": \"ContraryIntentionReport\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
    indent(builder, level);
    builder.append("\"ApplicationSequenceControl\": ");
    applicationSequenceControl.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasContIntRptID())
        {
            indent(builder, level);
            builder.append("\"ContIntRptID\": \"");
            appendBuffer(builder, contIntRptID, contIntRptIDOffset, contIntRptIDLength);
            builder.append("\",\n");
        }

        if (hasTransactTime())
        {
            indent(builder, level);
            builder.append("\"TransactTime\": \"");
            appendBuffer(builder, transactTime, transactTimeOffset, transactTimeLength);
            builder.append("\",\n");
        }

        if (hasLateIndicator())
        {
            indent(builder, level);
            builder.append("\"LateIndicator\": \"");
            builder.append(lateIndicator);
            builder.append("\",\n");
        }

        if (hasInputSource())
        {
            indent(builder, level);
            builder.append("\"InputSource\": \"");
            appendBuffer(builder, inputSource, inputSourceOffset, inputSourceLength);
            builder.append("\",\n");
        }

        if (hasClearingBusinessDate())
        {
            indent(builder, level);
            builder.append("\"ClearingBusinessDate\": \"");
            appendBuffer(builder, clearingBusinessDate, clearingBusinessDateOffset, clearingBusinessDateLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"Parties\": ");
    parties.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"ExpirationQty\": ");
    expirationQty.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"Instrument\": ");
    instrument.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"UndInstrmtGrp\": ");
    undInstrmtGrp.appendTo(builder, level + 1);
    builder.append("\n");

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
    public ContraryIntentionReportEncoder copyTo(final Encoder encoder)
    {
        return copyTo((ContraryIntentionReportEncoder)encoder);
    }

    public ContraryIntentionReportEncoder copyTo(final ContraryIntentionReportEncoder encoder)
    {
        encoder.reset();

        applicationSequenceControl.copyTo(encoder.applicationSequenceControl());
        if (hasContIntRptID())
        {
            encoder.contIntRptIDAsCopy(contIntRptID.byteArray(), 0, contIntRptIDLength);
        }

        if (hasTransactTime())
        {
            encoder.transactTimeAsCopy(transactTime.byteArray(), 0, transactTimeLength);
        }

        if (hasLateIndicator())
        {
            encoder.lateIndicator(this.lateIndicator());
        }

        if (hasInputSource())
        {
            encoder.inputSourceAsCopy(inputSource.byteArray(), 0, inputSourceLength);
        }

        if (hasClearingBusinessDate())
        {
            encoder.clearingBusinessDateAsCopy(clearingBusinessDate.byteArray(), 0, clearingBusinessDateLength);
        }


        parties.copyTo(encoder.parties());

        expirationQty.copyTo(encoder.expirationQty());

        instrument.copyTo(encoder.instrument());

        undInstrmtGrp.copyTo(encoder.undInstrmtGrp());
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
