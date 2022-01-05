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


public class ApplicationMessageRequestEncoder implements Encoder
{
    public long messageType()
    {
        return 22338L;
    }

    public ApplicationMessageRequestEncoder()
    {
        header.msgType("BW");
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

    private static final int applReqIDHeaderLength = 5;
    private static final byte[] applReqIDHeader = new byte[] {49, 51, 52, 54, (byte) '='};

    private static final int applReqTypeHeaderLength = 5;
    private static final byte[] applReqTypeHeader = new byte[] {49, 51, 52, 55, (byte) '='};

    private static final int textHeaderLength = 3;
    private static final byte[] textHeader = new byte[] {53, 56, (byte) '='};

    private static final int encodedTextLenHeaderLength = 4;
    private static final byte[] encodedTextLenHeader = new byte[] {51, 53, 52, (byte) '='};

    private static final int encodedTextHeaderLength = 4;
    private static final byte[] encodedTextHeader = new byte[] {51, 53, 53, (byte) '='};

    private final MutableDirectBuffer applReqID = new UnsafeBuffer();

    private int applReqIDOffset = 0;

    private int applReqIDLength = 0;

    public ApplicationMessageRequestEncoder applReqID(final DirectBuffer value, final int offset, final int length)
    {
        applReqID.wrap(value);
        applReqIDOffset = offset;
        applReqIDLength = length;
        return this;
    }

    public ApplicationMessageRequestEncoder applReqID(final DirectBuffer value, final int length)
    {
        return applReqID(value, 0, length);
    }

    public ApplicationMessageRequestEncoder applReqID(final DirectBuffer value)
    {
        return applReqID(value, 0, value.capacity());
    }

    public ApplicationMessageRequestEncoder applReqID(final byte[] value, final int offset, final int length)
    {
        applReqID.wrap(value);
        applReqIDOffset = offset;
        applReqIDLength = length;
        return this;
    }

    public ApplicationMessageRequestEncoder applReqIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(applReqID, value, offset, length);
        applReqIDOffset = offset;
        applReqIDLength = length;
        return this;
    }

    public ApplicationMessageRequestEncoder applReqID(final byte[] value, final int length)
    {
        return applReqID(value, 0, length);
    }

    public ApplicationMessageRequestEncoder applReqID(final byte[] value)
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

    public ApplicationMessageRequestEncoder applReqID(final CharSequence value)
    {
        toBytes(value, applReqID);
        applReqIDOffset = 0;
        applReqIDLength = value.length();
        return this;
    }

    public ApplicationMessageRequestEncoder applReqID(final AsciiSequenceView value)
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

    public ApplicationMessageRequestEncoder applReqID(final char[] value)
    {
        return applReqID(value, 0, value.length);
    }

    public ApplicationMessageRequestEncoder applReqID(final char[] value, final int length)
    {
        return applReqID(value, 0, length);
    }

    public ApplicationMessageRequestEncoder applReqID(final char[] value, final int offset, final int length)
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

    public ApplicationMessageRequestEncoder applReqType(int value)
    {
        applReqType = value;
        hasApplReqType = true;
        return this;
    }

    public int applReqType()
    {
        return applReqType;
    }

    public ApplicationMessageRequestEncoder applReqType(ApplReqType value)
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

    private final ApplIDRequestGrpEncoder applIDRequestGrp = new ApplIDRequestGrpEncoder();
    public ApplIDRequestGrpEncoder applIDRequestGrp()
    {
        return applIDRequestGrp;
    }

    private final PartiesEncoder parties = new PartiesEncoder();
    public PartiesEncoder parties()
    {
        return parties;
    }

    private final MutableDirectBuffer text = new UnsafeBuffer();

    private int textOffset = 0;

    private int textLength = 0;

    public ApplicationMessageRequestEncoder text(final DirectBuffer value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public ApplicationMessageRequestEncoder text(final DirectBuffer value, final int length)
    {
        return text(value, 0, length);
    }

    public ApplicationMessageRequestEncoder text(final DirectBuffer value)
    {
        return text(value, 0, value.capacity());
    }

    public ApplicationMessageRequestEncoder text(final byte[] value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public ApplicationMessageRequestEncoder textAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(text, value, offset, length);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public ApplicationMessageRequestEncoder text(final byte[] value, final int length)
    {
        return text(value, 0, length);
    }

    public ApplicationMessageRequestEncoder text(final byte[] value)
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

    public ApplicationMessageRequestEncoder text(final CharSequence value)
    {
        toBytes(value, text);
        textOffset = 0;
        textLength = value.length();
        return this;
    }

    public ApplicationMessageRequestEncoder text(final AsciiSequenceView value)
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

    public ApplicationMessageRequestEncoder text(final char[] value)
    {
        return text(value, 0, value.length);
    }

    public ApplicationMessageRequestEncoder text(final char[] value, final int length)
    {
        return text(value, 0, length);
    }

    public ApplicationMessageRequestEncoder text(final char[] value, final int offset, final int length)
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

    public ApplicationMessageRequestEncoder encodedTextLen(int value)
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

    public ApplicationMessageRequestEncoder encodedText(byte[] value)
    {
        encodedText = value;
        hasEncodedText = true;
        return this;
    }

    public byte[] encodedText()
    {
        return encodedText;
    }

    public ApplicationMessageRequestEncoder encodedTextAsCopy(final byte[] value, final int offset, final int length)
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

        if (applReqIDLength > 0)
        {
            buffer.putBytes(position, applReqIDHeader, 0, applReqIDHeaderLength);
            position += applReqIDHeaderLength;
            buffer.putBytes(position, applReqID, applReqIDOffset, applReqIDLength);
            position += applReqIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: ApplReqID");
        }

        if (hasApplReqType)
        {
            buffer.putBytes(position, applReqTypeHeader, 0, applReqTypeHeaderLength);
            position += applReqTypeHeaderLength;
            position += buffer.putIntAscii(position, applReqType);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: ApplReqType");
        }

            position += applIDRequestGrp.encode(buffer, position);

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
        this.resetApplReqID();
        this.resetApplReqType();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        applIDRequestGrp.reset();
        parties.reset();
    }

    public void resetApplReqID()
    {
        applReqIDLength = 0;
    }

    public void resetApplReqType()
    {
        hasApplReqType = false;
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
        builder.append("\"MessageName\": \"ApplicationMessageRequest\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
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

    indent(builder, level);
    builder.append("\"ApplIDRequestGrp\": ");
    applIDRequestGrp.appendTo(builder, level + 1);
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
    public ApplicationMessageRequestEncoder copyTo(final Encoder encoder)
    {
        return copyTo((ApplicationMessageRequestEncoder)encoder);
    }

    public ApplicationMessageRequestEncoder copyTo(final ApplicationMessageRequestEncoder encoder)
    {
        encoder.reset();
        if (hasApplReqID())
        {
            encoder.applReqIDAsCopy(applReqID.byteArray(), 0, applReqIDLength);
        }

        if (hasApplReqType())
        {
            encoder.applReqType(this.applReqType());
        }


        applIDRequestGrp.copyTo(encoder.applIDRequestGrp());

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
