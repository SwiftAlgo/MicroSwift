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


public class ApplicationMessageRequestAckEncoder implements Encoder
{
    public long messageType()
    {
        return 22594L;
    }

    public ApplicationMessageRequestAckEncoder()
    {
        header.msgType("BX");
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

    private static final int applResponseIDHeaderLength = 5;
    private static final byte[] applResponseIDHeader = new byte[] {49, 51, 53, 51, (byte) '='};

    private static final int applReqIDHeaderLength = 5;
    private static final byte[] applReqIDHeader = new byte[] {49, 51, 52, 54, (byte) '='};

    private static final int applReqTypeHeaderLength = 5;
    private static final byte[] applReqTypeHeader = new byte[] {49, 51, 52, 55, (byte) '='};

    private static final int applResponseTypeHeaderLength = 5;
    private static final byte[] applResponseTypeHeader = new byte[] {49, 51, 52, 56, (byte) '='};

    private static final int applTotalMessageCountHeaderLength = 5;
    private static final byte[] applTotalMessageCountHeader = new byte[] {49, 51, 52, 57, (byte) '='};

    private static final int textHeaderLength = 3;
    private static final byte[] textHeader = new byte[] {53, 56, (byte) '='};

    private static final int encodedTextLenHeaderLength = 4;
    private static final byte[] encodedTextLenHeader = new byte[] {51, 53, 52, (byte) '='};

    private static final int encodedTextHeaderLength = 4;
    private static final byte[] encodedTextHeader = new byte[] {51, 53, 53, (byte) '='};

    private final MutableDirectBuffer applResponseID = new UnsafeBuffer();

    private int applResponseIDOffset = 0;

    private int applResponseIDLength = 0;

    public ApplicationMessageRequestAckEncoder applResponseID(final DirectBuffer value, final int offset, final int length)
    {
        applResponseID.wrap(value);
        applResponseIDOffset = offset;
        applResponseIDLength = length;
        return this;
    }

    public ApplicationMessageRequestAckEncoder applResponseID(final DirectBuffer value, final int length)
    {
        return applResponseID(value, 0, length);
    }

    public ApplicationMessageRequestAckEncoder applResponseID(final DirectBuffer value)
    {
        return applResponseID(value, 0, value.capacity());
    }

    public ApplicationMessageRequestAckEncoder applResponseID(final byte[] value, final int offset, final int length)
    {
        applResponseID.wrap(value);
        applResponseIDOffset = offset;
        applResponseIDLength = length;
        return this;
    }

    public ApplicationMessageRequestAckEncoder applResponseIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(applResponseID, value, offset, length);
        applResponseIDOffset = offset;
        applResponseIDLength = length;
        return this;
    }

    public ApplicationMessageRequestAckEncoder applResponseID(final byte[] value, final int length)
    {
        return applResponseID(value, 0, length);
    }

    public ApplicationMessageRequestAckEncoder applResponseID(final byte[] value)
    {
        return applResponseID(value, 0, value.length);
    }

    public boolean hasApplResponseID()
    {
        return applResponseIDLength > 0;
    }

    public MutableDirectBuffer applResponseID()
    {
        return applResponseID;
    }

    public String applResponseIDAsString()
    {
        return applResponseID.getStringWithoutLengthAscii(applResponseIDOffset, applResponseIDLength);
    }

    public ApplicationMessageRequestAckEncoder applResponseID(final CharSequence value)
    {
        toBytes(value, applResponseID);
        applResponseIDOffset = 0;
        applResponseIDLength = value.length();
        return this;
    }

    public ApplicationMessageRequestAckEncoder applResponseID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            applResponseID.wrap(buffer);
            applResponseIDOffset = value.offset();
            applResponseIDLength = value.length();
        }
        return this;
    }

    public ApplicationMessageRequestAckEncoder applResponseID(final char[] value)
    {
        return applResponseID(value, 0, value.length);
    }

    public ApplicationMessageRequestAckEncoder applResponseID(final char[] value, final int length)
    {
        return applResponseID(value, 0, length);
    }

    public ApplicationMessageRequestAckEncoder applResponseID(final char[] value, final int offset, final int length)
    {
        toBytes(value, applResponseID, offset, length);
        applResponseIDOffset = 0;
        applResponseIDLength = length;
        return this;
    }

    private final MutableDirectBuffer applReqID = new UnsafeBuffer();

    private int applReqIDOffset = 0;

    private int applReqIDLength = 0;

    public ApplicationMessageRequestAckEncoder applReqID(final DirectBuffer value, final int offset, final int length)
    {
        applReqID.wrap(value);
        applReqIDOffset = offset;
        applReqIDLength = length;
        return this;
    }

    public ApplicationMessageRequestAckEncoder applReqID(final DirectBuffer value, final int length)
    {
        return applReqID(value, 0, length);
    }

    public ApplicationMessageRequestAckEncoder applReqID(final DirectBuffer value)
    {
        return applReqID(value, 0, value.capacity());
    }

    public ApplicationMessageRequestAckEncoder applReqID(final byte[] value, final int offset, final int length)
    {
        applReqID.wrap(value);
        applReqIDOffset = offset;
        applReqIDLength = length;
        return this;
    }

    public ApplicationMessageRequestAckEncoder applReqIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(applReqID, value, offset, length);
        applReqIDOffset = offset;
        applReqIDLength = length;
        return this;
    }

    public ApplicationMessageRequestAckEncoder applReqID(final byte[] value, final int length)
    {
        return applReqID(value, 0, length);
    }

    public ApplicationMessageRequestAckEncoder applReqID(final byte[] value)
    {
        return applReqID(value, 0, value.length);
    }

    public boolean hasApplReqID()
    {
        return applReqIDLength > 0;
    }

    public MutableDirectBuffer applReqID()
    {
        return applReqID;
    }

    public String applReqIDAsString()
    {
        return applReqID.getStringWithoutLengthAscii(applReqIDOffset, applReqIDLength);
    }

    public ApplicationMessageRequestAckEncoder applReqID(final CharSequence value)
    {
        toBytes(value, applReqID);
        applReqIDOffset = 0;
        applReqIDLength = value.length();
        return this;
    }

    public ApplicationMessageRequestAckEncoder applReqID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            applReqID.wrap(buffer);
            applReqIDOffset = value.offset();
            applReqIDLength = value.length();
        }
        return this;
    }

    public ApplicationMessageRequestAckEncoder applReqID(final char[] value)
    {
        return applReqID(value, 0, value.length);
    }

    public ApplicationMessageRequestAckEncoder applReqID(final char[] value, final int length)
    {
        return applReqID(value, 0, length);
    }

    public ApplicationMessageRequestAckEncoder applReqID(final char[] value, final int offset, final int length)
    {
        toBytes(value, applReqID, offset, length);
        applReqIDOffset = 0;
        applReqIDLength = length;
        return this;
    }

    private int applReqType;

    private boolean hasApplReqType;

    public boolean hasApplReqType()
    {
        return hasApplReqType;
    }

    public ApplicationMessageRequestAckEncoder applReqType(int value)
    {
        applReqType = value;
        hasApplReqType = true;
        return this;
    }

    public int applReqType()
    {
        return applReqType;
    }

    public ApplicationMessageRequestAckEncoder applReqType(ApplReqType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == ApplReqType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: applReqType Value: " + value );
            }
            if (value == ApplReqType.NULL_VAL)
            {
                return this;
            }
        }
        return applReqType(value.representation());
    }

    private int applResponseType;

    private boolean hasApplResponseType;

    public boolean hasApplResponseType()
    {
        return hasApplResponseType;
    }

    public ApplicationMessageRequestAckEncoder applResponseType(int value)
    {
        applResponseType = value;
        hasApplResponseType = true;
        return this;
    }

    public int applResponseType()
    {
        return applResponseType;
    }

    public ApplicationMessageRequestAckEncoder applResponseType(ApplResponseType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == ApplResponseType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: applResponseType Value: " + value );
            }
            if (value == ApplResponseType.NULL_VAL)
            {
                return this;
            }
        }
        return applResponseType(value.representation());
    }

    private int applTotalMessageCount;

    private boolean hasApplTotalMessageCount;

    public boolean hasApplTotalMessageCount()
    {
        return hasApplTotalMessageCount;
    }

    public ApplicationMessageRequestAckEncoder applTotalMessageCount(int value)
    {
        applTotalMessageCount = value;
        hasApplTotalMessageCount = true;
        return this;
    }

    public int applTotalMessageCount()
    {
        return applTotalMessageCount;
    }

    private final ApplIDRequestAckGrpEncoder applIDRequestAckGrp = new ApplIDRequestAckGrpEncoder();
    public ApplIDRequestAckGrpEncoder applIDRequestAckGrp()
    {
        return applIDRequestAckGrp;
    }

    private final PartiesEncoder parties = new PartiesEncoder();
    public PartiesEncoder parties()
    {
        return parties;
    }

    private final MutableDirectBuffer text = new UnsafeBuffer();

    private int textOffset = 0;

    private int textLength = 0;

    public ApplicationMessageRequestAckEncoder text(final DirectBuffer value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public ApplicationMessageRequestAckEncoder text(final DirectBuffer value, final int length)
    {
        return text(value, 0, length);
    }

    public ApplicationMessageRequestAckEncoder text(final DirectBuffer value)
    {
        return text(value, 0, value.capacity());
    }

    public ApplicationMessageRequestAckEncoder text(final byte[] value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public ApplicationMessageRequestAckEncoder textAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(text, value, offset, length);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public ApplicationMessageRequestAckEncoder text(final byte[] value, final int length)
    {
        return text(value, 0, length);
    }

    public ApplicationMessageRequestAckEncoder text(final byte[] value)
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

    public ApplicationMessageRequestAckEncoder text(final CharSequence value)
    {
        toBytes(value, text);
        textOffset = 0;
        textLength = value.length();
        return this;
    }

    public ApplicationMessageRequestAckEncoder text(final AsciiSequenceView value)
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

    public ApplicationMessageRequestAckEncoder text(final char[] value)
    {
        return text(value, 0, value.length);
    }

    public ApplicationMessageRequestAckEncoder text(final char[] value, final int length)
    {
        return text(value, 0, length);
    }

    public ApplicationMessageRequestAckEncoder text(final char[] value, final int offset, final int length)
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

    public ApplicationMessageRequestAckEncoder encodedTextLen(int value)
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

    public ApplicationMessageRequestAckEncoder encodedText(byte[] value)
    {
        encodedText = value;
        hasEncodedText = true;
        return this;
    }

    public byte[] encodedText()
    {
        return encodedText;
    }

    public ApplicationMessageRequestAckEncoder encodedTextAsCopy(final byte[] value, final int offset, final int length)
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

        if (applResponseIDLength > 0)
        {
            buffer.putBytes(position, applResponseIDHeader, 0, applResponseIDHeaderLength);
            position += applResponseIDHeaderLength;
            buffer.putBytes(position, applResponseID, applResponseIDOffset, applResponseIDLength);
            position += applResponseIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: ApplResponseID");
        }

        if (applReqIDLength > 0)
        {
            buffer.putBytes(position, applReqIDHeader, 0, applReqIDHeaderLength);
            position += applReqIDHeaderLength;
            buffer.putBytes(position, applReqID, applReqIDOffset, applReqIDLength);
            position += applReqIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasApplReqType)
        {
            buffer.putBytes(position, applReqTypeHeader, 0, applReqTypeHeaderLength);
            position += applReqTypeHeaderLength;
            position += buffer.putIntAscii(position, applReqType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasApplResponseType)
        {
            buffer.putBytes(position, applResponseTypeHeader, 0, applResponseTypeHeaderLength);
            position += applResponseTypeHeaderLength;
            position += buffer.putIntAscii(position, applResponseType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasApplTotalMessageCount)
        {
            buffer.putBytes(position, applTotalMessageCountHeader, 0, applTotalMessageCountHeaderLength);
            position += applTotalMessageCountHeaderLength;
            position += buffer.putIntAscii(position, applTotalMessageCount);
            buffer.putSeparator(position);
            position++;
        }

            position += applIDRequestAckGrp.encode(buffer, position);

            position += parties.encode(buffer, position);

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
        this.resetApplResponseID();
        this.resetApplReqID();
        this.resetApplReqType();
        this.resetApplResponseType();
        this.resetApplTotalMessageCount();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        applIDRequestAckGrp.reset();
        parties.reset();
    }

    public void resetApplResponseID()
    {
        applResponseIDLength = 0;
    }

    public void resetApplReqID()
    {
        applReqIDLength = 0;
    }

    public void resetApplReqType()
    {
        hasApplReqType = false;
    }

    public void resetApplResponseType()
    {
        hasApplResponseType = false;
    }

    public void resetApplTotalMessageCount()
    {
        hasApplTotalMessageCount = false;
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
        builder.append("\"MessageName\": \"ApplicationMessageRequestAck\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasApplResponseID())
        {
            indent(builder, level);
            builder.append("\"ApplResponseID\": \"");
            appendBuffer(builder, applResponseID, applResponseIDOffset, applResponseIDLength);
            builder.append("\",\n");
        }

        if (hasApplReqID())
        {
            indent(builder, level);
            builder.append("\"ApplReqID\": \"");
            appendBuffer(builder, applReqID, applReqIDOffset, applReqIDLength);
            builder.append("\",\n");
        }

        if (hasApplReqType())
        {
            indent(builder, level);
            builder.append("\"ApplReqType\": \"");
            builder.append(applReqType);
            builder.append("\",\n");
        }

        if (hasApplResponseType())
        {
            indent(builder, level);
            builder.append("\"ApplResponseType\": \"");
            builder.append(applResponseType);
            builder.append("\",\n");
        }

        if (hasApplTotalMessageCount())
        {
            indent(builder, level);
            builder.append("\"ApplTotalMessageCount\": \"");
            builder.append(applTotalMessageCount);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"ApplIDRequestAckGrp\": ");
    applIDRequestAckGrp.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"Parties\": ");
    parties.appendTo(builder, level + 1);
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
    public ApplicationMessageRequestAckEncoder copyTo(final Encoder encoder)
    {
        return copyTo((ApplicationMessageRequestAckEncoder)encoder);
    }

    public ApplicationMessageRequestAckEncoder copyTo(final ApplicationMessageRequestAckEncoder encoder)
    {
        encoder.reset();
        if (hasApplResponseID())
        {
            encoder.applResponseIDAsCopy(applResponseID.byteArray(), 0, applResponseIDLength);
        }

        if (hasApplReqID())
        {
            encoder.applReqIDAsCopy(applReqID.byteArray(), 0, applReqIDLength);
        }

        if (hasApplReqType())
        {
            encoder.applReqType(this.applReqType());
        }

        if (hasApplResponseType())
        {
            encoder.applResponseType(this.applResponseType());
        }

        if (hasApplTotalMessageCount())
        {
            encoder.applTotalMessageCount(this.applTotalMessageCount());
        }


        applIDRequestAckGrp.copyTo(encoder.applIDRequestAckGrp());

        parties.copyTo(encoder.parties());
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
