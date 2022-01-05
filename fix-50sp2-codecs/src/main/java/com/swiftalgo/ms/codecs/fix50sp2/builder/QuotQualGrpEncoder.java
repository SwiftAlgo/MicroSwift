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


public class QuotQualGrpEncoder
{
    private static final int noQuoteQualifiersGroupCounterHeaderLength = 4;
    private static final byte[] noQuoteQualifiersGroupCounterHeader = new byte[] {55, 51, 53, (byte) '='};



public static class QuoteQualifiersGroupEncoder
{
    private QuoteQualifiersGroupEncoder next = null;

    public QuoteQualifiersGroupEncoder next()
    {
        if (next == null)
        {
            next = new QuoteQualifiersGroupEncoder();
        }
        return next;
    }

    private static final int quoteQualifierHeaderLength = 4;
    private static final byte[] quoteQualifierHeader = new byte[] {54, 57, 53, (byte) '='};

    private char quoteQualifier;

    private boolean hasQuoteQualifier;

    public boolean hasQuoteQualifier()
    {
        return hasQuoteQualifier;
    }

    public QuoteQualifiersGroupEncoder quoteQualifier(char value)
    {
        quoteQualifier = value;
        hasQuoteQualifier = true;
        return this;
    }

    public char quoteQualifier()
    {
        return quoteQualifier;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (hasQuoteQualifier)
        {
            buffer.putBytes(position, quoteQualifierHeader, 0, quoteQualifierHeaderLength);
            position += quoteQualifierHeaderLength;
            position += buffer.putCharAscii(position, quoteQualifier);
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
        this.resetQuoteQualifier();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetQuoteQualifier()
    {
        hasQuoteQualifier = false;
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
        builder.append("\"MessageName\": \"QuoteQualifiersGroup\",\n");
        if (hasQuoteQualifier())
        {
            indent(builder, level);
            builder.append("\"QuoteQualifier\": \"");
            builder.append(quoteQualifier);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public QuoteQualifiersGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((QuoteQualifiersGroupEncoder)encoder);
    }

    public QuoteQualifiersGroupEncoder copyTo(final QuoteQualifiersGroupEncoder encoder)
    {
        encoder.reset();
        if (hasQuoteQualifier())
        {
            encoder.quoteQualifier(this.quoteQualifier());
        }
        return encoder;
    }

}
    private int noQuoteQualifiersGroupCounter;

    private boolean hasNoQuoteQualifiersGroupCounter;

    public boolean hasNoQuoteQualifiersGroupCounter()
    {
        return hasNoQuoteQualifiersGroupCounter;
    }

    public QuotQualGrpEncoder noQuoteQualifiersGroupCounter(int value)
    {
        noQuoteQualifiersGroupCounter = value;
        hasNoQuoteQualifiersGroupCounter = true;
        return this;
    }

    public int noQuoteQualifiersGroupCounter()
    {
        return noQuoteQualifiersGroupCounter;
    }


    private QuoteQualifiersGroupEncoder quoteQualifiersGroup = null;

    public QuoteQualifiersGroupEncoder quoteQualifiersGroup(final int numberOfElements)
    {
        hasNoQuoteQualifiersGroupCounter = true;
        noQuoteQualifiersGroupCounter = numberOfElements;
        if (quoteQualifiersGroup == null)
        {
            quoteQualifiersGroup = new QuoteQualifiersGroupEncoder();
        }
        return quoteQualifiersGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoQuoteQualifiersGroupCounter)
        {
            buffer.putBytes(position, noQuoteQualifiersGroupCounterHeader, 0, noQuoteQualifiersGroupCounterHeaderLength);
            position += noQuoteQualifiersGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noQuoteQualifiersGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (quoteQualifiersGroup != null)
        {
            position += quoteQualifiersGroup.encode(buffer, position, noQuoteQualifiersGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetQuoteQualifiersGroup();
    }

    public void resetQuoteQualifiersGroup()
    {
        if (quoteQualifiersGroup != null)
        {
            quoteQualifiersGroup.reset();
        }
        noQuoteQualifiersGroupCounter = 0;
        hasNoQuoteQualifiersGroupCounter = false;
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
        builder.append("\"MessageName\": \"QuotQualGrp\",\n");
        if (hasNoQuoteQualifiersGroupCounter)
        {
            indent(builder, level);
            builder.append("\"QuoteQualifiersGroup\": [\n");
            final int noQuoteQualifiersGroupCounter = this.noQuoteQualifiersGroupCounter;
            QuoteQualifiersGroupEncoder quoteQualifiersGroup = this.quoteQualifiersGroup;
            for (int i = 0; i < noQuoteQualifiersGroupCounter; i++)
            {
                indent(builder, level);
                quoteQualifiersGroup.appendTo(builder, level + 1);
                if (i < (noQuoteQualifiersGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                quoteQualifiersGroup = quoteQualifiersGroup.next();
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
    public QuotQualGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((QuotQualGrpEncoder)encoder);
    }

    public QuotQualGrpEncoder copyTo(final QuotQualGrpEncoder encoder)
    {
        encoder.reset();
        if (hasNoQuoteQualifiersGroupCounter)
        {
            final int size = this.noQuoteQualifiersGroupCounter;
            QuoteQualifiersGroupEncoder quoteQualifiersGroup = this.quoteQualifiersGroup;
            QuoteQualifiersGroupEncoder quoteQualifiersGroupEncoder = encoder.quoteQualifiersGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (quoteQualifiersGroup != null)
                {
                    quoteQualifiersGroup.copyTo(quoteQualifiersGroupEncoder);
                    quoteQualifiersGroup = quoteQualifiersGroup.next();
                    quoteQualifiersGroupEncoder = quoteQualifiersGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
