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


public class ApplicationMessageReportEncoder implements Encoder
{
    public long messageType()
    {
        return 22850L;
    }

    public ApplicationMessageReportEncoder()
    {
        header.msgType("BY");
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

    private static final int applReportIDHeaderLength = 5;
    private static final byte[] applReportIDHeader = new byte[] {49, 51, 53, 54, (byte) '='};

    private static final int applReqIDHeaderLength = 5;
    private static final byte[] applReqIDHeader = new byte[] {49, 51, 52, 54, (byte) '='};

    private static final int applReportTypeHeaderLength = 5;
    private static final byte[] applReportTypeHeader = new byte[] {49, 52, 50, 54, (byte) '='};

    private static final int textHeaderLength = 3;
    private static final byte[] textHeader = new byte[] {53, 56, (byte) '='};

    private static final int encodedTextLenHeaderLength = 4;
    private static final byte[] encodedTextLenHeader = new byte[] {51, 53, 52, (byte) '='};

    private static final int encodedTextHeaderLength = 4;
    private static final byte[] encodedTextHeader = new byte[] {51, 53, 53, (byte) '='};

    private final MutableDirectBuffer applReportID = new UnsafeBuffer();

    private int applReportIDOffset = 0;

    private int applReportIDLength = 0;

    public ApplicationMessageReportEncoder applReportID(final DirectBuffer value, final int offset, final int length)
    {
        applReportID.wrap(value);
        applReportIDOffset = offset;
        applReportIDLength = length;
        return this;
    }

    public ApplicationMessageReportEncoder applReportID(final DirectBuffer value, final int length)
    {
        return applReportID(value, 0, length);
    }

    public ApplicationMessageReportEncoder applReportID(final DirectBuffer value)
    {
        return applReportID(value, 0, value.capacity());
    }

    public ApplicationMessageReportEncoder applReportID(final byte[] value, final int offset, final int length)
    {
        applReportID.wrap(value);
        applReportIDOffset = offset;
        applReportIDLength = length;
        return this;
    }

    public ApplicationMessageReportEncoder applReportIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(applReportID, value, offset, length);
        applReportIDOffset = offset;
        applReportIDLength = length;
        return this;
    }

    public ApplicationMessageReportEncoder applReportID(final byte[] value, final int length)
    {
        return applReportID(value, 0, length);
    }

    public ApplicationMessageReportEncoder applReportID(final byte[] value)
    {
        return applReportID(value, 0, value.length);
    }

    public boolean hasApplReportID()
    {
        return applReportIDLength > 0;
    }

    public MutableDirectBuffer applReportID()
    {
        return applReportID;
    }

    public String applReportIDAsString()
    {
        return applReportID.getStringWithoutLengthAscii(applReportIDOffset, applReportIDLength);
    }

    public ApplicationMessageReportEncoder applReportID(final CharSequence value)
    {
        toBytes(value, applReportID);
        applReportIDOffset = 0;
        applReportIDLength = value.length();
        return this;
    }

    public ApplicationMessageReportEncoder applReportID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            applReportID.wrap(buffer);
            applReportIDOffset = value.offset();
            applReportIDLength = value.length();
        }
        return this;
    }

    public ApplicationMessageReportEncoder applReportID(final char[] value)
    {
        return applReportID(value, 0, value.length);
    }

    public ApplicationMessageReportEncoder applReportID(final char[] value, final int length)
    {
        return applReportID(value, 0, length);
    }

    public ApplicationMessageReportEncoder applReportID(final char[] value, final int offset, final int length)
    {
        toBytes(value, applReportID, offset, length);
        applReportIDOffset = 0;
        applReportIDLength = length;
        return this;
    }

    private final MutableDirectBuffer applReqID = new UnsafeBuffer();

    private int applReqIDOffset = 0;

    private int applReqIDLength = 0;

    public ApplicationMessageReportEncoder applReqID(final DirectBuffer value, final int offset, final int length)
    {
        applReqID.wrap(value);
        applReqIDOffset = offset;
        applReqIDLength = length;
        return this;
    }

    public ApplicationMessageReportEncoder applReqID(final DirectBuffer value, final int length)
    {
        return applReqID(value, 0, length);
    }

    public ApplicationMessageReportEncoder applReqID(final DirectBuffer value)
    {
        return applReqID(value, 0, value.capacity());
    }

    public ApplicationMessageReportEncoder applReqID(final byte[] value, final int offset, final int length)
    {
        applReqID.wrap(value);
        applReqIDOffset = offset;
        applReqIDLength = length;
        return this;
    }

    public ApplicationMessageReportEncoder applReqIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(applReqID, value, offset, length);
        applReqIDOffset = offset;
        applReqIDLength = length;
        return this;
    }

    public ApplicationMessageReportEncoder applReqID(final byte[] value, final int length)
    {
        return applReqID(value, 0, length);
    }

    public ApplicationMessageReportEncoder applReqID(final byte[] value)
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

    public ApplicationMessageReportEncoder applReqID(final CharSequence value)
    {
        toBytes(value, applReqID);
        applReqIDOffset = 0;
        applReqIDLength = value.length();
        return this;
    }

    public ApplicationMessageReportEncoder applReqID(final AsciiSequenceView value)
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

    public ApplicationMessageReportEncoder applReqID(final char[] value)
    {
        return applReqID(value, 0, value.length);
    }

    public ApplicationMessageReportEncoder applReqID(final char[] value, final int length)
    {
        return applReqID(value, 0, length);
    }

    public ApplicationMessageReportEncoder applReqID(final char[] value, final int offset, final int length)
    {
        toBytes(value, applReqID, offset, length);
        applReqIDOffset = 0;
        applReqIDLength = length;
        return this;
    }

    private int applReportType;

    private boolean hasApplReportType;

    public boolean hasApplReportType()
    {
        return hasApplReportType;
    }

    public ApplicationMessageReportEncoder applReportType(int value)
    {
        applReportType = value;
        hasApplReportType = true;
        return this;
    }

    public int applReportType()
    {
        return applReportType;
    }

    public ApplicationMessageReportEncoder applReportType(ApplReportType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == ApplReportType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: applReportType Value: " + value );
            }
            if (value == ApplReportType.NULL_VAL)
            {
                return this;
            }
        }
        return applReportType(value.representation());
    }

    private final ApplIDReportGrpEncoder applIDReportGrp = new ApplIDReportGrpEncoder();
    public ApplIDReportGrpEncoder applIDReportGrp()
    {
        return applIDReportGrp;
    }

    private final MutableDirectBuffer text = new UnsafeBuffer();

    private int textOffset = 0;

    private int textLength = 0;

    public ApplicationMessageReportEncoder text(final DirectBuffer value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public ApplicationMessageReportEncoder text(final DirectBuffer value, final int length)
    {
        return text(value, 0, length);
    }

    public ApplicationMessageReportEncoder text(final DirectBuffer value)
    {
        return text(value, 0, value.capacity());
    }

    public ApplicationMessageReportEncoder text(final byte[] value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public ApplicationMessageReportEncoder textAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(text, value, offset, length);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public ApplicationMessageReportEncoder text(final byte[] value, final int length)
    {
        return text(value, 0, length);
    }

    public ApplicationMessageReportEncoder text(final byte[] value)
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

    public ApplicationMessageReportEncoder text(final CharSequence value)
    {
        toBytes(value, text);
        textOffset = 0;
        textLength = value.length();
        return this;
    }

    public ApplicationMessageReportEncoder text(final AsciiSequenceView value)
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

    public ApplicationMessageReportEncoder text(final char[] value)
    {
        return text(value, 0, value.length);
    }

    public ApplicationMessageReportEncoder text(final char[] value, final int length)
    {
        return text(value, 0, length);
    }

    public ApplicationMessageReportEncoder text(final char[] value, final int offset, final int length)
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

    public ApplicationMessageReportEncoder encodedTextLen(int value)
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

    public ApplicationMessageReportEncoder encodedText(byte[] value)
    {
        encodedText = value;
        hasEncodedText = true;
        return this;
    }

    public byte[] encodedText()
    {
        return encodedText;
    }

    public ApplicationMessageReportEncoder encodedTextAsCopy(final byte[] value, final int offset, final int length)
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

        if (applReportIDLength > 0)
        {
            buffer.putBytes(position, applReportIDHeader, 0, applReportIDHeaderLength);
            position += applReportIDHeaderLength;
            buffer.putBytes(position, applReportID, applReportIDOffset, applReportIDLength);
            position += applReportIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: ApplReportID");
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

        if (hasApplReportType)
        {
            buffer.putBytes(position, applReportTypeHeader, 0, applReportTypeHeaderLength);
            position += applReportTypeHeaderLength;
            position += buffer.putIntAscii(position, applReportType);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: ApplReportType");
        }

            position += applIDReportGrp.encode(buffer, position);

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
        this.resetApplReportID();
        this.resetApplReqID();
        this.resetApplReportType();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        applIDReportGrp.reset();
    }

    public void resetApplReportID()
    {
        applReportIDLength = 0;
    }

    public void resetApplReqID()
    {
        applReqIDLength = 0;
    }

    public void resetApplReportType()
    {
        hasApplReportType = false;
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
        builder.append("\"MessageName\": \"ApplicationMessageReport\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasApplReportID())
        {
            indent(builder, level);
            builder.append("\"ApplReportID\": \"");
            appendBuffer(builder, applReportID, applReportIDOffset, applReportIDLength);
            builder.append("\",\n");
        }

        if (hasApplReqID())
        {
            indent(builder, level);
            builder.append("\"ApplReqID\": \"");
            appendBuffer(builder, applReqID, applReqIDOffset, applReqIDLength);
            builder.append("\",\n");
        }

        if (hasApplReportType())
        {
            indent(builder, level);
            builder.append("\"ApplReportType\": \"");
            builder.append(applReportType);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"ApplIDReportGrp\": ");
    applIDReportGrp.appendTo(builder, level + 1);
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
    public ApplicationMessageReportEncoder copyTo(final Encoder encoder)
    {
        return copyTo((ApplicationMessageReportEncoder)encoder);
    }

    public ApplicationMessageReportEncoder copyTo(final ApplicationMessageReportEncoder encoder)
    {
        encoder.reset();
        if (hasApplReportID())
        {
            encoder.applReportIDAsCopy(applReportID.byteArray(), 0, applReportIDLength);
        }

        if (hasApplReqID())
        {
            encoder.applReqIDAsCopy(applReqID.byteArray(), 0, applReqIDLength);
        }

        if (hasApplReportType())
        {
            encoder.applReportType(this.applReportType());
        }


        applIDReportGrp.copyTo(encoder.applIDReportGrp());
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
