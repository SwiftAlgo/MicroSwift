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


public class QuoteRequestRejectEncoder implements Encoder
{
    public long messageType()
    {
        return 18241L;
    }

    public QuoteRequestRejectEncoder()
    {
        header.msgType("AG");
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

    private static final int quoteReqIDHeaderLength = 4;
    private static final byte[] quoteReqIDHeader = new byte[] {49, 51, 49, (byte) '='};

    private static final int rFQReqIDHeaderLength = 4;
    private static final byte[] rFQReqIDHeader = new byte[] {54, 52, 52, (byte) '='};

    private static final int quoteRequestRejectReasonHeaderLength = 4;
    private static final byte[] quoteRequestRejectReasonHeader = new byte[] {54, 53, 56, (byte) '='};

    private static final int privateQuoteHeaderLength = 5;
    private static final byte[] privateQuoteHeader = new byte[] {49, 49, 55, 49, (byte) '='};

    private static final int respondentTypeHeaderLength = 5;
    private static final byte[] respondentTypeHeader = new byte[] {49, 49, 55, 50, (byte) '='};

    private static final int preTradeAnonymityHeaderLength = 5;
    private static final byte[] preTradeAnonymityHeader = new byte[] {49, 48, 57, 49, (byte) '='};

    private static final int textHeaderLength = 3;
    private static final byte[] textHeader = new byte[] {53, 56, (byte) '='};

    private static final int encodedTextLenHeaderLength = 4;
    private static final byte[] encodedTextLenHeader = new byte[] {51, 53, 52, (byte) '='};

    private static final int encodedTextHeaderLength = 4;
    private static final byte[] encodedTextHeader = new byte[] {51, 53, 53, (byte) '='};

    private final MutableDirectBuffer quoteReqID = new UnsafeBuffer();

    private int quoteReqIDOffset = 0;

    private int quoteReqIDLength = 0;

    public QuoteRequestRejectEncoder quoteReqID(final DirectBuffer value, final int offset, final int length)
    {
        quoteReqID.wrap(value);
        quoteReqIDOffset = offset;
        quoteReqIDLength = length;
        return this;
    }

    public QuoteRequestRejectEncoder quoteReqID(final DirectBuffer value, final int length)
    {
        return quoteReqID(value, 0, length);
    }

    public QuoteRequestRejectEncoder quoteReqID(final DirectBuffer value)
    {
        return quoteReqID(value, 0, value.capacity());
    }

    public QuoteRequestRejectEncoder quoteReqID(final byte[] value, final int offset, final int length)
    {
        quoteReqID.wrap(value);
        quoteReqIDOffset = offset;
        quoteReqIDLength = length;
        return this;
    }

    public QuoteRequestRejectEncoder quoteReqIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(quoteReqID, value, offset, length);
        quoteReqIDOffset = offset;
        quoteReqIDLength = length;
        return this;
    }

    public QuoteRequestRejectEncoder quoteReqID(final byte[] value, final int length)
    {
        return quoteReqID(value, 0, length);
    }

    public QuoteRequestRejectEncoder quoteReqID(final byte[] value)
    {
        return quoteReqID(value, 0, value.length);
    }

    public boolean hasQuoteReqID()
    {
        return quoteReqIDLength > 0;
    }

    public MutableDirectBuffer quoteReqID()
    {
        return quoteReqID;
    }

    public String quoteReqIDAsString()
    {
        return quoteReqID.getStringWithoutLengthAscii(quoteReqIDOffset, quoteReqIDLength);
    }

    public QuoteRequestRejectEncoder quoteReqID(final CharSequence value)
    {
        toBytes(value, quoteReqID);
        quoteReqIDOffset = 0;
        quoteReqIDLength = value.length();
        return this;
    }

    public QuoteRequestRejectEncoder quoteReqID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            quoteReqID.wrap(buffer);
            quoteReqIDOffset = value.offset();
            quoteReqIDLength = value.length();
        }
        return this;
    }

    public QuoteRequestRejectEncoder quoteReqID(final char[] value)
    {
        return quoteReqID(value, 0, value.length);
    }

    public QuoteRequestRejectEncoder quoteReqID(final char[] value, final int length)
    {
        return quoteReqID(value, 0, length);
    }

    public QuoteRequestRejectEncoder quoteReqID(final char[] value, final int offset, final int length)
    {
        toBytes(value, quoteReqID, offset, length);
        quoteReqIDOffset = 0;
        quoteReqIDLength = length;
        return this;
    }

    private final MutableDirectBuffer rFQReqID = new UnsafeBuffer();

    private int rFQReqIDOffset = 0;

    private int rFQReqIDLength = 0;

    public QuoteRequestRejectEncoder rFQReqID(final DirectBuffer value, final int offset, final int length)
    {
        rFQReqID.wrap(value);
        rFQReqIDOffset = offset;
        rFQReqIDLength = length;
        return this;
    }

    public QuoteRequestRejectEncoder rFQReqID(final DirectBuffer value, final int length)
    {
        return rFQReqID(value, 0, length);
    }

    public QuoteRequestRejectEncoder rFQReqID(final DirectBuffer value)
    {
        return rFQReqID(value, 0, value.capacity());
    }

    public QuoteRequestRejectEncoder rFQReqID(final byte[] value, final int offset, final int length)
    {
        rFQReqID.wrap(value);
        rFQReqIDOffset = offset;
        rFQReqIDLength = length;
        return this;
    }

    public QuoteRequestRejectEncoder rFQReqIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(rFQReqID, value, offset, length);
        rFQReqIDOffset = offset;
        rFQReqIDLength = length;
        return this;
    }

    public QuoteRequestRejectEncoder rFQReqID(final byte[] value, final int length)
    {
        return rFQReqID(value, 0, length);
    }

    public QuoteRequestRejectEncoder rFQReqID(final byte[] value)
    {
        return rFQReqID(value, 0, value.length);
    }

    public boolean hasRFQReqID()
    {
        return rFQReqIDLength > 0;
    }

    public MutableDirectBuffer rFQReqID()
    {
        return rFQReqID;
    }

    public String rFQReqIDAsString()
    {
        return rFQReqID.getStringWithoutLengthAscii(rFQReqIDOffset, rFQReqIDLength);
    }

    public QuoteRequestRejectEncoder rFQReqID(final CharSequence value)
    {
        toBytes(value, rFQReqID);
        rFQReqIDOffset = 0;
        rFQReqIDLength = value.length();
        return this;
    }

    public QuoteRequestRejectEncoder rFQReqID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            rFQReqID.wrap(buffer);
            rFQReqIDOffset = value.offset();
            rFQReqIDLength = value.length();
        }
        return this;
    }

    public QuoteRequestRejectEncoder rFQReqID(final char[] value)
    {
        return rFQReqID(value, 0, value.length);
    }

    public QuoteRequestRejectEncoder rFQReqID(final char[] value, final int length)
    {
        return rFQReqID(value, 0, length);
    }

    public QuoteRequestRejectEncoder rFQReqID(final char[] value, final int offset, final int length)
    {
        toBytes(value, rFQReqID, offset, length);
        rFQReqIDOffset = 0;
        rFQReqIDLength = length;
        return this;
    }

    private int quoteRequestRejectReason;

    private boolean hasQuoteRequestRejectReason;

    public boolean hasQuoteRequestRejectReason()
    {
        return hasQuoteRequestRejectReason;
    }

    public QuoteRequestRejectEncoder quoteRequestRejectReason(int value)
    {
        quoteRequestRejectReason = value;
        hasQuoteRequestRejectReason = true;
        return this;
    }

    public int quoteRequestRejectReason()
    {
        return quoteRequestRejectReason;
    }

    public QuoteRequestRejectEncoder quoteRequestRejectReason(QuoteRequestRejectReason value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == QuoteRequestRejectReason.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: quoteRequestRejectReason Value: " + value );
            }
            if (value == QuoteRequestRejectReason.NULL_VAL)
            {
                return this;
            }
        }
        return quoteRequestRejectReason(value.representation());
    }

    private boolean privateQuote;

    private boolean hasPrivateQuote;

    public boolean hasPrivateQuote()
    {
        return hasPrivateQuote;
    }

    public QuoteRequestRejectEncoder privateQuote(boolean value)
    {
        privateQuote = value;
        hasPrivateQuote = true;
        return this;
    }

    public boolean privateQuote()
    {
        return privateQuote;
    }

    private int respondentType;

    private boolean hasRespondentType;

    public boolean hasRespondentType()
    {
        return hasRespondentType;
    }

    public QuoteRequestRejectEncoder respondentType(int value)
    {
        respondentType = value;
        hasRespondentType = true;
        return this;
    }

    public int respondentType()
    {
        return respondentType;
    }

    public QuoteRequestRejectEncoder respondentType(RespondentType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == RespondentType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: respondentType Value: " + value );
            }
            if (value == RespondentType.NULL_VAL)
            {
                return this;
            }
        }
        return respondentType(value.representation());
    }

    private boolean preTradeAnonymity;

    private boolean hasPreTradeAnonymity;

    public boolean hasPreTradeAnonymity()
    {
        return hasPreTradeAnonymity;
    }

    public QuoteRequestRejectEncoder preTradeAnonymity(boolean value)
    {
        preTradeAnonymity = value;
        hasPreTradeAnonymity = true;
        return this;
    }

    public boolean preTradeAnonymity()
    {
        return preTradeAnonymity;
    }

    private final RootPartiesEncoder rootParties = new RootPartiesEncoder();
    public RootPartiesEncoder rootParties()
    {
        return rootParties;
    }

    private final QuotReqRjctGrpEncoder quotReqRjctGrp = new QuotReqRjctGrpEncoder();
    public QuotReqRjctGrpEncoder quotReqRjctGrp()
    {
        return quotReqRjctGrp;
    }

    private final MutableDirectBuffer text = new UnsafeBuffer();

    private int textOffset = 0;

    private int textLength = 0;

    public QuoteRequestRejectEncoder text(final DirectBuffer value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public QuoteRequestRejectEncoder text(final DirectBuffer value, final int length)
    {
        return text(value, 0, length);
    }

    public QuoteRequestRejectEncoder text(final DirectBuffer value)
    {
        return text(value, 0, value.capacity());
    }

    public QuoteRequestRejectEncoder text(final byte[] value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public QuoteRequestRejectEncoder textAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(text, value, offset, length);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public QuoteRequestRejectEncoder text(final byte[] value, final int length)
    {
        return text(value, 0, length);
    }

    public QuoteRequestRejectEncoder text(final byte[] value)
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

    public QuoteRequestRejectEncoder text(final CharSequence value)
    {
        toBytes(value, text);
        textOffset = 0;
        textLength = value.length();
        return this;
    }

    public QuoteRequestRejectEncoder text(final AsciiSequenceView value)
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

    public QuoteRequestRejectEncoder text(final char[] value)
    {
        return text(value, 0, value.length);
    }

    public QuoteRequestRejectEncoder text(final char[] value, final int length)
    {
        return text(value, 0, length);
    }

    public QuoteRequestRejectEncoder text(final char[] value, final int offset, final int length)
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

    public QuoteRequestRejectEncoder encodedTextLen(int value)
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

    public QuoteRequestRejectEncoder encodedText(byte[] value)
    {
        encodedText = value;
        hasEncodedText = true;
        return this;
    }

    public byte[] encodedText()
    {
        return encodedText;
    }

    public QuoteRequestRejectEncoder encodedTextAsCopy(final byte[] value, final int offset, final int length)
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

        if (quoteReqIDLength > 0)
        {
            buffer.putBytes(position, quoteReqIDHeader, 0, quoteReqIDHeaderLength);
            position += quoteReqIDHeaderLength;
            buffer.putBytes(position, quoteReqID, quoteReqIDOffset, quoteReqIDLength);
            position += quoteReqIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: QuoteReqID");
        }

        if (rFQReqIDLength > 0)
        {
            buffer.putBytes(position, rFQReqIDHeader, 0, rFQReqIDHeaderLength);
            position += rFQReqIDHeaderLength;
            buffer.putBytes(position, rFQReqID, rFQReqIDOffset, rFQReqIDLength);
            position += rFQReqIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasQuoteRequestRejectReason)
        {
            buffer.putBytes(position, quoteRequestRejectReasonHeader, 0, quoteRequestRejectReasonHeaderLength);
            position += quoteRequestRejectReasonHeaderLength;
            position += buffer.putIntAscii(position, quoteRequestRejectReason);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: QuoteRequestRejectReason");
        }

        if (hasPrivateQuote)
        {
            buffer.putBytes(position, privateQuoteHeader, 0, privateQuoteHeaderLength);
            position += privateQuoteHeaderLength;
            position += buffer.putBooleanAscii(position, privateQuote);
            buffer.putSeparator(position);
            position++;
        }

        if (hasRespondentType)
        {
            buffer.putBytes(position, respondentTypeHeader, 0, respondentTypeHeaderLength);
            position += respondentTypeHeaderLength;
            position += buffer.putIntAscii(position, respondentType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasPreTradeAnonymity)
        {
            buffer.putBytes(position, preTradeAnonymityHeader, 0, preTradeAnonymityHeaderLength);
            position += preTradeAnonymityHeaderLength;
            position += buffer.putBooleanAscii(position, preTradeAnonymity);
            buffer.putSeparator(position);
            position++;
        }

            position += rootParties.encode(buffer, position);

            position += quotReqRjctGrp.encode(buffer, position);

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
        this.resetQuoteReqID();
        this.resetRFQReqID();
        this.resetQuoteRequestRejectReason();
        this.resetPrivateQuote();
        this.resetRespondentType();
        this.resetPreTradeAnonymity();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        rootParties.reset();
        quotReqRjctGrp.reset();
    }

    public void resetQuoteReqID()
    {
        quoteReqIDLength = 0;
    }

    public void resetRFQReqID()
    {
        rFQReqIDLength = 0;
    }

    public void resetQuoteRequestRejectReason()
    {
        hasQuoteRequestRejectReason = false;
    }

    public void resetPrivateQuote()
    {
        hasPrivateQuote = false;
    }

    public void resetRespondentType()
    {
        hasRespondentType = false;
    }

    public void resetPreTradeAnonymity()
    {
        hasPreTradeAnonymity = false;
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
        builder.append("\"MessageName\": \"QuoteRequestReject\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasQuoteReqID())
        {
            indent(builder, level);
            builder.append("\"QuoteReqID\": \"");
            appendBuffer(builder, quoteReqID, quoteReqIDOffset, quoteReqIDLength);
            builder.append("\",\n");
        }

        if (hasRFQReqID())
        {
            indent(builder, level);
            builder.append("\"RFQReqID\": \"");
            appendBuffer(builder, rFQReqID, rFQReqIDOffset, rFQReqIDLength);
            builder.append("\",\n");
        }

        if (hasQuoteRequestRejectReason())
        {
            indent(builder, level);
            builder.append("\"QuoteRequestRejectReason\": \"");
            builder.append(quoteRequestRejectReason);
            builder.append("\",\n");
        }

        if (hasPrivateQuote())
        {
            indent(builder, level);
            builder.append("\"PrivateQuote\": \"");
            builder.append(privateQuote);
            builder.append("\",\n");
        }

        if (hasRespondentType())
        {
            indent(builder, level);
            builder.append("\"RespondentType\": \"");
            builder.append(respondentType);
            builder.append("\",\n");
        }

        if (hasPreTradeAnonymity())
        {
            indent(builder, level);
            builder.append("\"PreTradeAnonymity\": \"");
            builder.append(preTradeAnonymity);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"RootParties\": ");
    rootParties.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"QuotReqRjctGrp\": ");
    quotReqRjctGrp.appendTo(builder, level + 1);
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
    public QuoteRequestRejectEncoder copyTo(final Encoder encoder)
    {
        return copyTo((QuoteRequestRejectEncoder)encoder);
    }

    public QuoteRequestRejectEncoder copyTo(final QuoteRequestRejectEncoder encoder)
    {
        encoder.reset();
        if (hasQuoteReqID())
        {
            encoder.quoteReqIDAsCopy(quoteReqID.byteArray(), 0, quoteReqIDLength);
        }

        if (hasRFQReqID())
        {
            encoder.rFQReqIDAsCopy(rFQReqID.byteArray(), 0, rFQReqIDLength);
        }

        if (hasQuoteRequestRejectReason())
        {
            encoder.quoteRequestRejectReason(this.quoteRequestRejectReason());
        }

        if (hasPrivateQuote())
        {
            encoder.privateQuote(this.privateQuote());
        }

        if (hasRespondentType())
        {
            encoder.respondentType(this.respondentType());
        }

        if (hasPreTradeAnonymity())
        {
            encoder.preTradeAnonymity(this.preTradeAnonymity());
        }


        rootParties.copyTo(encoder.rootParties());

        quotReqRjctGrp.copyTo(encoder.quotReqRjctGrp());
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
