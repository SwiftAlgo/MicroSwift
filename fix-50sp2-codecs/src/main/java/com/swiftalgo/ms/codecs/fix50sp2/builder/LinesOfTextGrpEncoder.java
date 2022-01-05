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


public class LinesOfTextGrpEncoder
{
    private static final int noLinesOfTextGroupCounterHeaderLength = 3;
    private static final byte[] noLinesOfTextGroupCounterHeader = new byte[] {51, 51, (byte) '='};



public static class LinesOfTextGroupEncoder
{
    private LinesOfTextGroupEncoder next = null;

    public LinesOfTextGroupEncoder next()
    {
        if (next == null)
        {
            next = new LinesOfTextGroupEncoder();
        }
        return next;
    }

    private static final int textHeaderLength = 3;
    private static final byte[] textHeader = new byte[] {53, 56, (byte) '='};

    private static final int encodedTextLenHeaderLength = 4;
    private static final byte[] encodedTextLenHeader = new byte[] {51, 53, 52, (byte) '='};

    private static final int encodedTextHeaderLength = 4;
    private static final byte[] encodedTextHeader = new byte[] {51, 53, 53, (byte) '='};

    private final MutableDirectBuffer text = new UnsafeBuffer();

    private int textOffset = 0;

    private int textLength = 0;

    public LinesOfTextGroupEncoder text(final DirectBuffer value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public LinesOfTextGroupEncoder text(final DirectBuffer value, final int length)
    {
        return text(value, 0, length);
    }

    public LinesOfTextGroupEncoder text(final DirectBuffer value)
    {
        return text(value, 0, value.capacity());
    }

    public LinesOfTextGroupEncoder text(final byte[] value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public LinesOfTextGroupEncoder textAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(text, value, offset, length);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public LinesOfTextGroupEncoder text(final byte[] value, final int length)
    {
        return text(value, 0, length);
    }

    public LinesOfTextGroupEncoder text(final byte[] value)
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

    public LinesOfTextGroupEncoder text(final CharSequence value)
    {
        toBytes(value, text);
        textOffset = 0;
        textLength = value.length();
        return this;
    }

    public LinesOfTextGroupEncoder text(final AsciiSequenceView value)
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

    public LinesOfTextGroupEncoder text(final char[] value)
    {
        return text(value, 0, value.length);
    }

    public LinesOfTextGroupEncoder text(final char[] value, final int length)
    {
        return text(value, 0, length);
    }

    public LinesOfTextGroupEncoder text(final char[] value, final int offset, final int length)
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

    public LinesOfTextGroupEncoder encodedTextLen(int value)
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

    public LinesOfTextGroupEncoder encodedText(byte[] value)
    {
        encodedText = value;
        hasEncodedText = true;
        return this;
    }

    public byte[] encodedText()
    {
        return encodedText;
    }

    public LinesOfTextGroupEncoder encodedTextAsCopy(final byte[] value, final int offset, final int length)
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

        if (textLength > 0)
        {
            buffer.putBytes(position, textHeader, 0, textHeaderLength);
            position += textHeaderLength;
            buffer.putBytes(position, text, textOffset, textLength);
            position += textLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: Text");
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
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        if (next != null)        {
            next.reset();
        }
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
        builder.append("\"MessageName\": \"LinesOfTextGroup\",\n");
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
    public LinesOfTextGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((LinesOfTextGroupEncoder)encoder);
    }

    public LinesOfTextGroupEncoder copyTo(final LinesOfTextGroupEncoder encoder)
    {
        encoder.reset();
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
    private int noLinesOfTextGroupCounter;

    private boolean hasNoLinesOfTextGroupCounter;

    public boolean hasNoLinesOfTextGroupCounter()
    {
        return hasNoLinesOfTextGroupCounter;
    }

    public LinesOfTextGrpEncoder noLinesOfTextGroupCounter(int value)
    {
        noLinesOfTextGroupCounter = value;
        hasNoLinesOfTextGroupCounter = true;
        return this;
    }

    public int noLinesOfTextGroupCounter()
    {
        return noLinesOfTextGroupCounter;
    }


    private LinesOfTextGroupEncoder linesOfTextGroup = null;

    public LinesOfTextGroupEncoder linesOfTextGroup(final int numberOfElements)
    {
        hasNoLinesOfTextGroupCounter = true;
        noLinesOfTextGroupCounter = numberOfElements;
        if (linesOfTextGroup == null)
        {
            linesOfTextGroup = new LinesOfTextGroupEncoder();
        }
        return linesOfTextGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoLinesOfTextGroupCounter)
        {
            buffer.putBytes(position, noLinesOfTextGroupCounterHeader, 0, noLinesOfTextGroupCounterHeaderLength);
            position += noLinesOfTextGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noLinesOfTextGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (linesOfTextGroup != null)
        {
            position += linesOfTextGroup.encode(buffer, position, noLinesOfTextGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetLinesOfTextGroup();
    }

    public void resetLinesOfTextGroup()
    {
        if (linesOfTextGroup != null)
        {
            linesOfTextGroup.reset();
        }
        noLinesOfTextGroupCounter = 0;
        hasNoLinesOfTextGroupCounter = false;
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
        builder.append("\"MessageName\": \"LinesOfTextGrp\",\n");
        if (hasNoLinesOfTextGroupCounter)
        {
            indent(builder, level);
            builder.append("\"LinesOfTextGroup\": [\n");
            final int noLinesOfTextGroupCounter = this.noLinesOfTextGroupCounter;
            LinesOfTextGroupEncoder linesOfTextGroup = this.linesOfTextGroup;
            for (int i = 0; i < noLinesOfTextGroupCounter; i++)
            {
                indent(builder, level);
                linesOfTextGroup.appendTo(builder, level + 1);
                if (i < (noLinesOfTextGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                linesOfTextGroup = linesOfTextGroup.next();
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
    public LinesOfTextGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((LinesOfTextGrpEncoder)encoder);
    }

    public LinesOfTextGrpEncoder copyTo(final LinesOfTextGrpEncoder encoder)
    {
        encoder.reset();
        if (hasNoLinesOfTextGroupCounter)
        {
            final int size = this.noLinesOfTextGroupCounter;
            LinesOfTextGroupEncoder linesOfTextGroup = this.linesOfTextGroup;
            LinesOfTextGroupEncoder linesOfTextGroupEncoder = encoder.linesOfTextGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (linesOfTextGroup != null)
                {
                    linesOfTextGroup.copyTo(linesOfTextGroupEncoder);
                    linesOfTextGroup = linesOfTextGroup.next();
                    linesOfTextGroupEncoder = linesOfTextGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
