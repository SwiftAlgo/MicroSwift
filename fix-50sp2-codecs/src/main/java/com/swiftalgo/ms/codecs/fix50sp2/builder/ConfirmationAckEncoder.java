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


public class ConfirmationAckEncoder implements Encoder
{
    public long messageType()
    {
        return 21825L;
    }

    public ConfirmationAckEncoder()
    {
        header.msgType("AU");
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

    private static final int confirmIDHeaderLength = 4;
    private static final byte[] confirmIDHeader = new byte[] {54, 54, 52, (byte) '='};

    private static final int tradeDateHeaderLength = 3;
    private static final byte[] tradeDateHeader = new byte[] {55, 53, (byte) '='};

    private static final int transactTimeHeaderLength = 3;
    private static final byte[] transactTimeHeader = new byte[] {54, 48, (byte) '='};

    private static final int affirmStatusHeaderLength = 4;
    private static final byte[] affirmStatusHeader = new byte[] {57, 52, 48, (byte) '='};

    private static final int confirmRejReasonHeaderLength = 4;
    private static final byte[] confirmRejReasonHeader = new byte[] {55, 55, 52, (byte) '='};

    private static final int matchStatusHeaderLength = 4;
    private static final byte[] matchStatusHeader = new byte[] {53, 55, 51, (byte) '='};

    private static final int textHeaderLength = 3;
    private static final byte[] textHeader = new byte[] {53, 56, (byte) '='};

    private static final int encodedTextLenHeaderLength = 4;
    private static final byte[] encodedTextLenHeader = new byte[] {51, 53, 52, (byte) '='};

    private static final int encodedTextHeaderLength = 4;
    private static final byte[] encodedTextHeader = new byte[] {51, 53, 53, (byte) '='};

    private final MutableDirectBuffer confirmID = new UnsafeBuffer();

    private int confirmIDOffset = 0;

    private int confirmIDLength = 0;

    public ConfirmationAckEncoder confirmID(final DirectBuffer value, final int offset, final int length)
    {
        confirmID.wrap(value);
        confirmIDOffset = offset;
        confirmIDLength = length;
        return this;
    }

    public ConfirmationAckEncoder confirmID(final DirectBuffer value, final int length)
    {
        return confirmID(value, 0, length);
    }

    public ConfirmationAckEncoder confirmID(final DirectBuffer value)
    {
        return confirmID(value, 0, value.capacity());
    }

    public ConfirmationAckEncoder confirmID(final byte[] value, final int offset, final int length)
    {
        confirmID.wrap(value);
        confirmIDOffset = offset;
        confirmIDLength = length;
        return this;
    }

    public ConfirmationAckEncoder confirmIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(confirmID, value, offset, length);
        confirmIDOffset = offset;
        confirmIDLength = length;
        return this;
    }

    public ConfirmationAckEncoder confirmID(final byte[] value, final int length)
    {
        return confirmID(value, 0, length);
    }

    public ConfirmationAckEncoder confirmID(final byte[] value)
    {
        return confirmID(value, 0, value.length);
    }

    public boolean hasConfirmID()
    {
        return confirmIDLength > 0;
    }

    public MutableDirectBuffer confirmID()
    {
        return confirmID;
    }

    public String confirmIDAsString()
    {
        return confirmID.getStringWithoutLengthAscii(confirmIDOffset, confirmIDLength);
    }

    public ConfirmationAckEncoder confirmID(final CharSequence value)
    {
        toBytes(value, confirmID);
        confirmIDOffset = 0;
        confirmIDLength = value.length();
        return this;
    }

    public ConfirmationAckEncoder confirmID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            confirmID.wrap(buffer);
            confirmIDOffset = value.offset();
            confirmIDLength = value.length();
        }
        return this;
    }

    public ConfirmationAckEncoder confirmID(final char[] value)
    {
        return confirmID(value, 0, value.length);
    }

    public ConfirmationAckEncoder confirmID(final char[] value, final int length)
    {
        return confirmID(value, 0, length);
    }

    public ConfirmationAckEncoder confirmID(final char[] value, final int offset, final int length)
    {
        toBytes(value, confirmID, offset, length);
        confirmIDOffset = 0;
        confirmIDLength = length;
        return this;
    }

    private final MutableDirectBuffer tradeDate = new UnsafeBuffer();

    private int tradeDateOffset = 0;

    private int tradeDateLength = 0;

    public ConfirmationAckEncoder tradeDate(final DirectBuffer value, final int offset, final int length)
    {
        tradeDate.wrap(value);
        tradeDateOffset = offset;
        tradeDateLength = length;
        return this;
    }

    public ConfirmationAckEncoder tradeDate(final DirectBuffer value, final int length)
    {
        return tradeDate(value, 0, length);
    }

    public ConfirmationAckEncoder tradeDate(final DirectBuffer value)
    {
        return tradeDate(value, 0, value.capacity());
    }

    public ConfirmationAckEncoder tradeDate(final byte[] value, final int offset, final int length)
    {
        tradeDate.wrap(value);
        tradeDateOffset = offset;
        tradeDateLength = length;
        return this;
    }

    public ConfirmationAckEncoder tradeDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradeDate, value, offset, length);
        tradeDateOffset = offset;
        tradeDateLength = length;
        return this;
    }

    public ConfirmationAckEncoder tradeDate(final byte[] value, final int length)
    {
        return tradeDate(value, 0, length);
    }

    public ConfirmationAckEncoder tradeDate(final byte[] value)
    {
        return tradeDate(value, 0, value.length);
    }

    public boolean hasTradeDate()
    {
        return tradeDateLength > 0;
    }

    public MutableDirectBuffer tradeDate()
    {
        return tradeDate;
    }

    public String tradeDateAsString()
    {
        return tradeDate.getStringWithoutLengthAscii(tradeDateOffset, tradeDateLength);
    }

    private final MutableDirectBuffer transactTime = new UnsafeBuffer();

    private int transactTimeOffset = 0;

    private int transactTimeLength = 0;

    public ConfirmationAckEncoder transactTime(final DirectBuffer value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public ConfirmationAckEncoder transactTime(final DirectBuffer value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public ConfirmationAckEncoder transactTime(final DirectBuffer value)
    {
        return transactTime(value, 0, value.capacity());
    }

    public ConfirmationAckEncoder transactTime(final byte[] value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public ConfirmationAckEncoder transactTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(transactTime, value, offset, length);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public ConfirmationAckEncoder transactTime(final byte[] value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public ConfirmationAckEncoder transactTime(final byte[] value)
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

    private int affirmStatus;

    private boolean hasAffirmStatus;

    public boolean hasAffirmStatus()
    {
        return hasAffirmStatus;
    }

    public ConfirmationAckEncoder affirmStatus(int value)
    {
        affirmStatus = value;
        hasAffirmStatus = true;
        return this;
    }

    public int affirmStatus()
    {
        return affirmStatus;
    }

    public ConfirmationAckEncoder affirmStatus(AffirmStatus value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == AffirmStatus.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: affirmStatus Value: " + value );
            }
            if (value == AffirmStatus.NULL_VAL)
            {
                return this;
            }
        }
        return affirmStatus(value.representation());
    }

    private int confirmRejReason;

    private boolean hasConfirmRejReason;

    public boolean hasConfirmRejReason()
    {
        return hasConfirmRejReason;
    }

    public ConfirmationAckEncoder confirmRejReason(int value)
    {
        confirmRejReason = value;
        hasConfirmRejReason = true;
        return this;
    }

    public int confirmRejReason()
    {
        return confirmRejReason;
    }

    public ConfirmationAckEncoder confirmRejReason(ConfirmRejReason value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == ConfirmRejReason.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: confirmRejReason Value: " + value );
            }
            if (value == ConfirmRejReason.NULL_VAL)
            {
                return this;
            }
        }
        return confirmRejReason(value.representation());
    }

    private char matchStatus;

    private boolean hasMatchStatus;

    public boolean hasMatchStatus()
    {
        return hasMatchStatus;
    }

    public ConfirmationAckEncoder matchStatus(char value)
    {
        matchStatus = value;
        hasMatchStatus = true;
        return this;
    }

    public char matchStatus()
    {
        return matchStatus;
    }

    public ConfirmationAckEncoder matchStatus(MatchStatus value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == MatchStatus.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: matchStatus Value: " + value );
            }
            if (value == MatchStatus.NULL_VAL)
            {
                return this;
            }
        }
        return matchStatus(value.representation());
    }

    private final MutableDirectBuffer text = new UnsafeBuffer();

    private int textOffset = 0;

    private int textLength = 0;

    public ConfirmationAckEncoder text(final DirectBuffer value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public ConfirmationAckEncoder text(final DirectBuffer value, final int length)
    {
        return text(value, 0, length);
    }

    public ConfirmationAckEncoder text(final DirectBuffer value)
    {
        return text(value, 0, value.capacity());
    }

    public ConfirmationAckEncoder text(final byte[] value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public ConfirmationAckEncoder textAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(text, value, offset, length);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public ConfirmationAckEncoder text(final byte[] value, final int length)
    {
        return text(value, 0, length);
    }

    public ConfirmationAckEncoder text(final byte[] value)
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

    public ConfirmationAckEncoder text(final CharSequence value)
    {
        toBytes(value, text);
        textOffset = 0;
        textLength = value.length();
        return this;
    }

    public ConfirmationAckEncoder text(final AsciiSequenceView value)
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

    public ConfirmationAckEncoder text(final char[] value)
    {
        return text(value, 0, value.length);
    }

    public ConfirmationAckEncoder text(final char[] value, final int length)
    {
        return text(value, 0, length);
    }

    public ConfirmationAckEncoder text(final char[] value, final int offset, final int length)
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

    public ConfirmationAckEncoder encodedTextLen(int value)
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

    public ConfirmationAckEncoder encodedText(byte[] value)
    {
        encodedText = value;
        hasEncodedText = true;
        return this;
    }

    public byte[] encodedText()
    {
        return encodedText;
    }

    public ConfirmationAckEncoder encodedTextAsCopy(final byte[] value, final int offset, final int length)
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

        if (confirmIDLength > 0)
        {
            buffer.putBytes(position, confirmIDHeader, 0, confirmIDHeaderLength);
            position += confirmIDHeaderLength;
            buffer.putBytes(position, confirmID, confirmIDOffset, confirmIDLength);
            position += confirmIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: ConfirmID");
        }

        if (tradeDateLength > 0)
        {
            buffer.putBytes(position, tradeDateHeader, 0, tradeDateHeaderLength);
            position += tradeDateHeaderLength;
            buffer.putBytes(position, tradeDate, tradeDateOffset, tradeDateLength);
            position += tradeDateLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: TradeDate");
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

        if (hasAffirmStatus)
        {
            buffer.putBytes(position, affirmStatusHeader, 0, affirmStatusHeaderLength);
            position += affirmStatusHeaderLength;
            position += buffer.putIntAscii(position, affirmStatus);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: AffirmStatus");
        }

        if (hasConfirmRejReason)
        {
            buffer.putBytes(position, confirmRejReasonHeader, 0, confirmRejReasonHeaderLength);
            position += confirmRejReasonHeaderLength;
            position += buffer.putIntAscii(position, confirmRejReason);
            buffer.putSeparator(position);
            position++;
        }

        if (hasMatchStatus)
        {
            buffer.putBytes(position, matchStatusHeader, 0, matchStatusHeaderLength);
            position += matchStatusHeaderLength;
            position += buffer.putCharAscii(position, matchStatus);
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
        this.resetConfirmID();
        this.resetTradeDate();
        this.resetTransactTime();
        this.resetAffirmStatus();
        this.resetConfirmRejReason();
        this.resetMatchStatus();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
    }

    public void resetConfirmID()
    {
        confirmIDLength = 0;
    }

    public void resetTradeDate()
    {
        tradeDateLength = 0;
    }

    public void resetTransactTime()
    {
        transactTimeLength = 0;
    }

    public void resetAffirmStatus()
    {
        hasAffirmStatus = false;
    }

    public void resetConfirmRejReason()
    {
        hasConfirmRejReason = false;
    }

    public void resetMatchStatus()
    {
        hasMatchStatus = false;
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
        builder.append("\"MessageName\": \"ConfirmationAck\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasConfirmID())
        {
            indent(builder, level);
            builder.append("\"ConfirmID\": \"");
            appendBuffer(builder, confirmID, confirmIDOffset, confirmIDLength);
            builder.append("\",\n");
        }

        if (hasTradeDate())
        {
            indent(builder, level);
            builder.append("\"TradeDate\": \"");
            appendBuffer(builder, tradeDate, tradeDateOffset, tradeDateLength);
            builder.append("\",\n");
        }

        if (hasTransactTime())
        {
            indent(builder, level);
            builder.append("\"TransactTime\": \"");
            appendBuffer(builder, transactTime, transactTimeOffset, transactTimeLength);
            builder.append("\",\n");
        }

        if (hasAffirmStatus())
        {
            indent(builder, level);
            builder.append("\"AffirmStatus\": \"");
            builder.append(affirmStatus);
            builder.append("\",\n");
        }

        if (hasConfirmRejReason())
        {
            indent(builder, level);
            builder.append("\"ConfirmRejReason\": \"");
            builder.append(confirmRejReason);
            builder.append("\",\n");
        }

        if (hasMatchStatus())
        {
            indent(builder, level);
            builder.append("\"MatchStatus\": \"");
            builder.append(matchStatus);
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
    public ConfirmationAckEncoder copyTo(final Encoder encoder)
    {
        return copyTo((ConfirmationAckEncoder)encoder);
    }

    public ConfirmationAckEncoder copyTo(final ConfirmationAckEncoder encoder)
    {
        encoder.reset();
        if (hasConfirmID())
        {
            encoder.confirmIDAsCopy(confirmID.byteArray(), 0, confirmIDLength);
        }

        if (hasTradeDate())
        {
            encoder.tradeDateAsCopy(tradeDate.byteArray(), 0, tradeDateLength);
        }

        if (hasTransactTime())
        {
            encoder.transactTimeAsCopy(transactTime.byteArray(), 0, transactTimeLength);
        }

        if (hasAffirmStatus())
        {
            encoder.affirmStatus(this.affirmStatus());
        }

        if (hasConfirmRejReason())
        {
            encoder.confirmRejReason(this.confirmRejReason());
        }

        if (hasMatchStatus())
        {
            encoder.matchStatus(this.matchStatus());
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
