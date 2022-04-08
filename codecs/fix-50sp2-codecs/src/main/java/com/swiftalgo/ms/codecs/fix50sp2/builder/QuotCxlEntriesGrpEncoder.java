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


public class QuotCxlEntriesGrpEncoder
{
    private static final int noQuoteEntriesGroupCounterHeaderLength = 4;
    private static final byte[] noQuoteEntriesGroupCounterHeader = new byte[] {50, 57, 53, (byte) '='};



public static class QuoteEntriesGroupEncoder
{
    private QuoteEntriesGroupEncoder next = null;

    public QuoteEntriesGroupEncoder next()
    {
        if (next == null)
        {
            next = new QuoteEntriesGroupEncoder();
        }
        return next;
    }

    private final InstrumentEncoder instrument = new InstrumentEncoder();
    public InstrumentEncoder instrument()
    {
        return instrument;
    }

    private final FinancingDetailsEncoder financingDetails = new FinancingDetailsEncoder();
    public FinancingDetailsEncoder financingDetails()
    {
        return financingDetails;
    }

    private final UndInstrmtGrpEncoder undInstrmtGrp = new UndInstrmtGrpEncoder();
    public UndInstrmtGrpEncoder undInstrmtGrp()
    {
        return undInstrmtGrp;
    }

    private final InstrmtLegGrpEncoder instrmtLegGrp = new InstrmtLegGrpEncoder();
    public InstrmtLegGrpEncoder instrmtLegGrp()
    {
        return instrmtLegGrp;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

            position += instrument.encode(buffer, position);

            position += financingDetails.encode(buffer, position);

            position += undInstrmtGrp.encode(buffer, position);

            position += instrmtLegGrp.encode(buffer, position);
        if (next != null)
        {
            position += next.encode(buffer, position, remainingElements - 1);
        }
        return position - offset;
    }

    public void reset()
    {
        instrument.reset();
        financingDetails.reset();
        undInstrmtGrp.reset();
        instrmtLegGrp.reset();
        if (next != null)        {
            next.reset();
        }
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
        builder.append("\"MessageName\": \"QuoteEntriesGroup\",\n");
    indent(builder, level);
    builder.append("\"Instrument\": ");
    instrument.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"FinancingDetails\": ");
    financingDetails.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"UndInstrmtGrp\": ");
    undInstrmtGrp.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"InstrmtLegGrp\": ");
    instrmtLegGrp.appendTo(builder, level + 1);
    builder.append("\n");
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public QuoteEntriesGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((QuoteEntriesGroupEncoder)encoder);
    }

    public QuoteEntriesGroupEncoder copyTo(final QuoteEntriesGroupEncoder encoder)
    {
        encoder.reset();

        instrument.copyTo(encoder.instrument());

        financingDetails.copyTo(encoder.financingDetails());

        undInstrmtGrp.copyTo(encoder.undInstrmtGrp());

        instrmtLegGrp.copyTo(encoder.instrmtLegGrp());        return encoder;
    }

}
    private int noQuoteEntriesGroupCounter;

    private boolean hasNoQuoteEntriesGroupCounter;

    public boolean hasNoQuoteEntriesGroupCounter()
    {
        return hasNoQuoteEntriesGroupCounter;
    }

    public QuotCxlEntriesGrpEncoder noQuoteEntriesGroupCounter(int value)
    {
        noQuoteEntriesGroupCounter = value;
        hasNoQuoteEntriesGroupCounter = true;
        return this;
    }

    public int noQuoteEntriesGroupCounter()
    {
        return noQuoteEntriesGroupCounter;
    }


    private QuoteEntriesGroupEncoder quoteEntriesGroup = null;

    public QuoteEntriesGroupEncoder quoteEntriesGroup(final int numberOfElements)
    {
        hasNoQuoteEntriesGroupCounter = true;
        noQuoteEntriesGroupCounter = numberOfElements;
        if (quoteEntriesGroup == null)
        {
            quoteEntriesGroup = new QuoteEntriesGroupEncoder();
        }
        return quoteEntriesGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoQuoteEntriesGroupCounter)
        {
            buffer.putBytes(position, noQuoteEntriesGroupCounterHeader, 0, noQuoteEntriesGroupCounterHeaderLength);
            position += noQuoteEntriesGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noQuoteEntriesGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (quoteEntriesGroup != null)
        {
            position += quoteEntriesGroup.encode(buffer, position, noQuoteEntriesGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetQuoteEntriesGroup();
    }

    public void resetQuoteEntriesGroup()
    {
        if (quoteEntriesGroup != null)
        {
            quoteEntriesGroup.reset();
        }
        noQuoteEntriesGroupCounter = 0;
        hasNoQuoteEntriesGroupCounter = false;
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
        builder.append("\"MessageName\": \"QuotCxlEntriesGrp\",\n");
        if (hasNoQuoteEntriesGroupCounter)
        {
            indent(builder, level);
            builder.append("\"QuoteEntriesGroup\": [\n");
            final int noQuoteEntriesGroupCounter = this.noQuoteEntriesGroupCounter;
            QuoteEntriesGroupEncoder quoteEntriesGroup = this.quoteEntriesGroup;
            for (int i = 0; i < noQuoteEntriesGroupCounter; i++)
            {
                indent(builder, level);
                quoteEntriesGroup.appendTo(builder, level + 1);
                if (i < (noQuoteEntriesGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                quoteEntriesGroup = quoteEntriesGroup.next();
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
    public QuotCxlEntriesGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((QuotCxlEntriesGrpEncoder)encoder);
    }

    public QuotCxlEntriesGrpEncoder copyTo(final QuotCxlEntriesGrpEncoder encoder)
    {
        encoder.reset();
        if (hasNoQuoteEntriesGroupCounter)
        {
            final int size = this.noQuoteEntriesGroupCounter;
            QuoteEntriesGroupEncoder quoteEntriesGroup = this.quoteEntriesGroup;
            QuoteEntriesGroupEncoder quoteEntriesGroupEncoder = encoder.quoteEntriesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (quoteEntriesGroup != null)
                {
                    quoteEntriesGroup.copyTo(quoteEntriesGroupEncoder);
                    quoteEntriesGroup = quoteEntriesGroup.next();
                    quoteEntriesGroupEncoder = quoteEntriesGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
