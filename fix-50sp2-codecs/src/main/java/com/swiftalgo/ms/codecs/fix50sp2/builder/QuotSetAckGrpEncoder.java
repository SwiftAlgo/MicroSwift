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


public class QuotSetAckGrpEncoder
{
    private static final int noQuoteSetsGroupCounterHeaderLength = 4;
    private static final byte[] noQuoteSetsGroupCounterHeader = new byte[] {50, 57, 54, (byte) '='};



public static class QuoteSetsGroupEncoder
{
    private QuoteSetsGroupEncoder next = null;

    public QuoteSetsGroupEncoder next()
    {
        if (next == null)
        {
            next = new QuoteSetsGroupEncoder();
        }
        return next;
    }

    private static final int quoteSetIDHeaderLength = 4;
    private static final byte[] quoteSetIDHeader = new byte[] {51, 48, 50, (byte) '='};

    private static final int quoteSetValidUntilTimeHeaderLength = 4;
    private static final byte[] quoteSetValidUntilTimeHeader = new byte[] {51, 54, 55, (byte) '='};

    private static final int totNoQuoteEntriesHeaderLength = 4;
    private static final byte[] totNoQuoteEntriesHeader = new byte[] {51, 48, 52, (byte) '='};

    private static final int totNoCxldQuotesHeaderLength = 5;
    private static final byte[] totNoCxldQuotesHeader = new byte[] {49, 49, 54, 56, (byte) '='};

    private static final int totNoAccQuotesHeaderLength = 5;
    private static final byte[] totNoAccQuotesHeader = new byte[] {49, 49, 54, 57, (byte) '='};

    private static final int totNoRejQuotesHeaderLength = 5;
    private static final byte[] totNoRejQuotesHeader = new byte[] {49, 49, 55, 48, (byte) '='};

    private static final int lastFragmentHeaderLength = 4;
    private static final byte[] lastFragmentHeader = new byte[] {56, 57, 51, (byte) '='};

    private final MutableDirectBuffer quoteSetID = new UnsafeBuffer();

    private int quoteSetIDOffset = 0;

    private int quoteSetIDLength = 0;

    public QuoteSetsGroupEncoder quoteSetID(final DirectBuffer value, final int offset, final int length)
    {
        quoteSetID.wrap(value);
        quoteSetIDOffset = offset;
        quoteSetIDLength = length;
        return this;
    }

    public QuoteSetsGroupEncoder quoteSetID(final DirectBuffer value, final int length)
    {
        return quoteSetID(value, 0, length);
    }

    public QuoteSetsGroupEncoder quoteSetID(final DirectBuffer value)
    {
        return quoteSetID(value, 0, value.capacity());
    }

    public QuoteSetsGroupEncoder quoteSetID(final byte[] value, final int offset, final int length)
    {
        quoteSetID.wrap(value);
        quoteSetIDOffset = offset;
        quoteSetIDLength = length;
        return this;
    }

    public QuoteSetsGroupEncoder quoteSetIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(quoteSetID, value, offset, length);
        quoteSetIDOffset = offset;
        quoteSetIDLength = length;
        return this;
    }

    public QuoteSetsGroupEncoder quoteSetID(final byte[] value, final int length)
    {
        return quoteSetID(value, 0, length);
    }

    public QuoteSetsGroupEncoder quoteSetID(final byte[] value)
    {
        return quoteSetID(value, 0, value.length);
    }

    public boolean hasQuoteSetID()
    {
        return quoteSetIDLength > 0;
    }

    public MutableDirectBuffer quoteSetID()
    {
        return quoteSetID;
    }

    public String quoteSetIDAsString()
    {
        return quoteSetID.getStringWithoutLengthAscii(quoteSetIDOffset, quoteSetIDLength);
    }

    public QuoteSetsGroupEncoder quoteSetID(final CharSequence value)
    {
        toBytes(value, quoteSetID);
        quoteSetIDOffset = 0;
        quoteSetIDLength = value.length();
        return this;
    }

    public QuoteSetsGroupEncoder quoteSetID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            quoteSetID.wrap(buffer);
            quoteSetIDOffset = value.offset();
            quoteSetIDLength = value.length();
        }
        return this;
    }

    public QuoteSetsGroupEncoder quoteSetID(final char[] value)
    {
        return quoteSetID(value, 0, value.length);
    }

    public QuoteSetsGroupEncoder quoteSetID(final char[] value, final int length)
    {
        return quoteSetID(value, 0, length);
    }

    public QuoteSetsGroupEncoder quoteSetID(final char[] value, final int offset, final int length)
    {
        toBytes(value, quoteSetID, offset, length);
        quoteSetIDOffset = 0;
        quoteSetIDLength = length;
        return this;
    }

    private final UnderlyingInstrumentEncoder underlyingInstrument = new UnderlyingInstrumentEncoder();
    public UnderlyingInstrumentEncoder underlyingInstrument()
    {
        return underlyingInstrument;
    }

    private final MutableDirectBuffer quoteSetValidUntilTime = new UnsafeBuffer();

    private int quoteSetValidUntilTimeOffset = 0;

    private int quoteSetValidUntilTimeLength = 0;

    public QuoteSetsGroupEncoder quoteSetValidUntilTime(final DirectBuffer value, final int offset, final int length)
    {
        quoteSetValidUntilTime.wrap(value);
        quoteSetValidUntilTimeOffset = offset;
        quoteSetValidUntilTimeLength = length;
        return this;
    }

    public QuoteSetsGroupEncoder quoteSetValidUntilTime(final DirectBuffer value, final int length)
    {
        return quoteSetValidUntilTime(value, 0, length);
    }

    public QuoteSetsGroupEncoder quoteSetValidUntilTime(final DirectBuffer value)
    {
        return quoteSetValidUntilTime(value, 0, value.capacity());
    }

    public QuoteSetsGroupEncoder quoteSetValidUntilTime(final byte[] value, final int offset, final int length)
    {
        quoteSetValidUntilTime.wrap(value);
        quoteSetValidUntilTimeOffset = offset;
        quoteSetValidUntilTimeLength = length;
        return this;
    }

    public QuoteSetsGroupEncoder quoteSetValidUntilTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(quoteSetValidUntilTime, value, offset, length);
        quoteSetValidUntilTimeOffset = offset;
        quoteSetValidUntilTimeLength = length;
        return this;
    }

    public QuoteSetsGroupEncoder quoteSetValidUntilTime(final byte[] value, final int length)
    {
        return quoteSetValidUntilTime(value, 0, length);
    }

    public QuoteSetsGroupEncoder quoteSetValidUntilTime(final byte[] value)
    {
        return quoteSetValidUntilTime(value, 0, value.length);
    }

    public boolean hasQuoteSetValidUntilTime()
    {
        return quoteSetValidUntilTimeLength > 0;
    }

    public MutableDirectBuffer quoteSetValidUntilTime()
    {
        return quoteSetValidUntilTime;
    }

    public String quoteSetValidUntilTimeAsString()
    {
        return quoteSetValidUntilTime.getStringWithoutLengthAscii(quoteSetValidUntilTimeOffset, quoteSetValidUntilTimeLength);
    }

    private int totNoQuoteEntries;

    private boolean hasTotNoQuoteEntries;

    public boolean hasTotNoQuoteEntries()
    {
        return hasTotNoQuoteEntries;
    }

    public QuoteSetsGroupEncoder totNoQuoteEntries(int value)
    {
        totNoQuoteEntries = value;
        hasTotNoQuoteEntries = true;
        return this;
    }

    public int totNoQuoteEntries()
    {
        return totNoQuoteEntries;
    }

    private int totNoCxldQuotes;

    private boolean hasTotNoCxldQuotes;

    public boolean hasTotNoCxldQuotes()
    {
        return hasTotNoCxldQuotes;
    }

    public QuoteSetsGroupEncoder totNoCxldQuotes(int value)
    {
        totNoCxldQuotes = value;
        hasTotNoCxldQuotes = true;
        return this;
    }

    public int totNoCxldQuotes()
    {
        return totNoCxldQuotes;
    }

    private int totNoAccQuotes;

    private boolean hasTotNoAccQuotes;

    public boolean hasTotNoAccQuotes()
    {
        return hasTotNoAccQuotes;
    }

    public QuoteSetsGroupEncoder totNoAccQuotes(int value)
    {
        totNoAccQuotes = value;
        hasTotNoAccQuotes = true;
        return this;
    }

    public int totNoAccQuotes()
    {
        return totNoAccQuotes;
    }

    private int totNoRejQuotes;

    private boolean hasTotNoRejQuotes;

    public boolean hasTotNoRejQuotes()
    {
        return hasTotNoRejQuotes;
    }

    public QuoteSetsGroupEncoder totNoRejQuotes(int value)
    {
        totNoRejQuotes = value;
        hasTotNoRejQuotes = true;
        return this;
    }

    public int totNoRejQuotes()
    {
        return totNoRejQuotes;
    }

    private boolean lastFragment;

    private boolean hasLastFragment;

    public boolean hasLastFragment()
    {
        return hasLastFragment;
    }

    public QuoteSetsGroupEncoder lastFragment(boolean value)
    {
        lastFragment = value;
        hasLastFragment = true;
        return this;
    }

    public boolean lastFragment()
    {
        return lastFragment;
    }

    private final QuotEntryAckGrpEncoder quotEntryAckGrp = new QuotEntryAckGrpEncoder();
    public QuotEntryAckGrpEncoder quotEntryAckGrp()
    {
        return quotEntryAckGrp;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (quoteSetIDLength > 0)
        {
            buffer.putBytes(position, quoteSetIDHeader, 0, quoteSetIDHeaderLength);
            position += quoteSetIDHeaderLength;
            buffer.putBytes(position, quoteSetID, quoteSetIDOffset, quoteSetIDLength);
            position += quoteSetIDLength;
            buffer.putSeparator(position);
            position++;
        }

            position += underlyingInstrument.encode(buffer, position);

        if (quoteSetValidUntilTimeLength > 0)
        {
            buffer.putBytes(position, quoteSetValidUntilTimeHeader, 0, quoteSetValidUntilTimeHeaderLength);
            position += quoteSetValidUntilTimeHeaderLength;
            buffer.putBytes(position, quoteSetValidUntilTime, quoteSetValidUntilTimeOffset, quoteSetValidUntilTimeLength);
            position += quoteSetValidUntilTimeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasTotNoQuoteEntries)
        {
            buffer.putBytes(position, totNoQuoteEntriesHeader, 0, totNoQuoteEntriesHeaderLength);
            position += totNoQuoteEntriesHeaderLength;
            position += buffer.putIntAscii(position, totNoQuoteEntries);
            buffer.putSeparator(position);
            position++;
        }

        if (hasTotNoCxldQuotes)
        {
            buffer.putBytes(position, totNoCxldQuotesHeader, 0, totNoCxldQuotesHeaderLength);
            position += totNoCxldQuotesHeaderLength;
            position += buffer.putIntAscii(position, totNoCxldQuotes);
            buffer.putSeparator(position);
            position++;
        }

        if (hasTotNoAccQuotes)
        {
            buffer.putBytes(position, totNoAccQuotesHeader, 0, totNoAccQuotesHeaderLength);
            position += totNoAccQuotesHeaderLength;
            position += buffer.putIntAscii(position, totNoAccQuotes);
            buffer.putSeparator(position);
            position++;
        }

        if (hasTotNoRejQuotes)
        {
            buffer.putBytes(position, totNoRejQuotesHeader, 0, totNoRejQuotesHeaderLength);
            position += totNoRejQuotesHeaderLength;
            position += buffer.putIntAscii(position, totNoRejQuotes);
            buffer.putSeparator(position);
            position++;
        }

        if (hasLastFragment)
        {
            buffer.putBytes(position, lastFragmentHeader, 0, lastFragmentHeaderLength);
            position += lastFragmentHeaderLength;
            position += buffer.putBooleanAscii(position, lastFragment);
            buffer.putSeparator(position);
            position++;
        }

            position += quotEntryAckGrp.encode(buffer, position);
        if (next != null)
        {
            position += next.encode(buffer, position, remainingElements - 1);
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetQuoteSetID();
        this.resetQuoteSetValidUntilTime();
        this.resetTotNoQuoteEntries();
        this.resetTotNoCxldQuotes();
        this.resetTotNoAccQuotes();
        this.resetTotNoRejQuotes();
        this.resetLastFragment();
        underlyingInstrument.reset();
        quotEntryAckGrp.reset();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetQuoteSetID()
    {
        quoteSetIDLength = 0;
    }

    public void resetQuoteSetValidUntilTime()
    {
        quoteSetValidUntilTimeLength = 0;
    }

    public void resetTotNoQuoteEntries()
    {
        hasTotNoQuoteEntries = false;
    }

    public void resetTotNoCxldQuotes()
    {
        hasTotNoCxldQuotes = false;
    }

    public void resetTotNoAccQuotes()
    {
        hasTotNoAccQuotes = false;
    }

    public void resetTotNoRejQuotes()
    {
        hasTotNoRejQuotes = false;
    }

    public void resetLastFragment()
    {
        hasLastFragment = false;
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
        builder.append("\"MessageName\": \"QuoteSetsGroup\",\n");
        if (hasQuoteSetID())
        {
            indent(builder, level);
            builder.append("\"QuoteSetID\": \"");
            appendBuffer(builder, quoteSetID, quoteSetIDOffset, quoteSetIDLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"UnderlyingInstrument\": ");
    underlyingInstrument.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasQuoteSetValidUntilTime())
        {
            indent(builder, level);
            builder.append("\"QuoteSetValidUntilTime\": \"");
            appendBuffer(builder, quoteSetValidUntilTime, quoteSetValidUntilTimeOffset, quoteSetValidUntilTimeLength);
            builder.append("\",\n");
        }

        if (hasTotNoQuoteEntries())
        {
            indent(builder, level);
            builder.append("\"TotNoQuoteEntries\": \"");
            builder.append(totNoQuoteEntries);
            builder.append("\",\n");
        }

        if (hasTotNoCxldQuotes())
        {
            indent(builder, level);
            builder.append("\"TotNoCxldQuotes\": \"");
            builder.append(totNoCxldQuotes);
            builder.append("\",\n");
        }

        if (hasTotNoAccQuotes())
        {
            indent(builder, level);
            builder.append("\"TotNoAccQuotes\": \"");
            builder.append(totNoAccQuotes);
            builder.append("\",\n");
        }

        if (hasTotNoRejQuotes())
        {
            indent(builder, level);
            builder.append("\"TotNoRejQuotes\": \"");
            builder.append(totNoRejQuotes);
            builder.append("\",\n");
        }

        if (hasLastFragment())
        {
            indent(builder, level);
            builder.append("\"LastFragment\": \"");
            builder.append(lastFragment);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"QuotEntryAckGrp\": ");
    quotEntryAckGrp.appendTo(builder, level + 1);
    builder.append("\n");
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public QuoteSetsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((QuoteSetsGroupEncoder)encoder);
    }

    public QuoteSetsGroupEncoder copyTo(final QuoteSetsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasQuoteSetID())
        {
            encoder.quoteSetIDAsCopy(quoteSetID.byteArray(), 0, quoteSetIDLength);
        }


        underlyingInstrument.copyTo(encoder.underlyingInstrument());
        if (hasQuoteSetValidUntilTime())
        {
            encoder.quoteSetValidUntilTimeAsCopy(quoteSetValidUntilTime.byteArray(), 0, quoteSetValidUntilTimeLength);
        }

        if (hasTotNoQuoteEntries())
        {
            encoder.totNoQuoteEntries(this.totNoQuoteEntries());
        }

        if (hasTotNoCxldQuotes())
        {
            encoder.totNoCxldQuotes(this.totNoCxldQuotes());
        }

        if (hasTotNoAccQuotes())
        {
            encoder.totNoAccQuotes(this.totNoAccQuotes());
        }

        if (hasTotNoRejQuotes())
        {
            encoder.totNoRejQuotes(this.totNoRejQuotes());
        }

        if (hasLastFragment())
        {
            encoder.lastFragment(this.lastFragment());
        }


        quotEntryAckGrp.copyTo(encoder.quotEntryAckGrp());        return encoder;
    }

}
    private int noQuoteSetsGroupCounter;

    private boolean hasNoQuoteSetsGroupCounter;

    public boolean hasNoQuoteSetsGroupCounter()
    {
        return hasNoQuoteSetsGroupCounter;
    }

    public QuotSetAckGrpEncoder noQuoteSetsGroupCounter(int value)
    {
        noQuoteSetsGroupCounter = value;
        hasNoQuoteSetsGroupCounter = true;
        return this;
    }

    public int noQuoteSetsGroupCounter()
    {
        return noQuoteSetsGroupCounter;
    }


    private QuoteSetsGroupEncoder quoteSetsGroup = null;

    public QuoteSetsGroupEncoder quoteSetsGroup(final int numberOfElements)
    {
        hasNoQuoteSetsGroupCounter = true;
        noQuoteSetsGroupCounter = numberOfElements;
        if (quoteSetsGroup == null)
        {
            quoteSetsGroup = new QuoteSetsGroupEncoder();
        }
        return quoteSetsGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoQuoteSetsGroupCounter)
        {
            buffer.putBytes(position, noQuoteSetsGroupCounterHeader, 0, noQuoteSetsGroupCounterHeaderLength);
            position += noQuoteSetsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noQuoteSetsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (quoteSetsGroup != null)
        {
            position += quoteSetsGroup.encode(buffer, position, noQuoteSetsGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetQuoteSetsGroup();
    }

    public void resetQuoteSetsGroup()
    {
        if (quoteSetsGroup != null)
        {
            quoteSetsGroup.reset();
        }
        noQuoteSetsGroupCounter = 0;
        hasNoQuoteSetsGroupCounter = false;
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
        builder.append("\"MessageName\": \"QuotSetAckGrp\",\n");
        if (hasNoQuoteSetsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"QuoteSetsGroup\": [\n");
            final int noQuoteSetsGroupCounter = this.noQuoteSetsGroupCounter;
            QuoteSetsGroupEncoder quoteSetsGroup = this.quoteSetsGroup;
            for (int i = 0; i < noQuoteSetsGroupCounter; i++)
            {
                indent(builder, level);
                quoteSetsGroup.appendTo(builder, level + 1);
                if (i < (noQuoteSetsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                quoteSetsGroup = quoteSetsGroup.next();
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
    public QuotSetAckGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((QuotSetAckGrpEncoder)encoder);
    }

    public QuotSetAckGrpEncoder copyTo(final QuotSetAckGrpEncoder encoder)
    {
        encoder.reset();
        if (hasNoQuoteSetsGroupCounter)
        {
            final int size = this.noQuoteSetsGroupCounter;
            QuoteSetsGroupEncoder quoteSetsGroup = this.quoteSetsGroup;
            QuoteSetsGroupEncoder quoteSetsGroupEncoder = encoder.quoteSetsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (quoteSetsGroup != null)
                {
                    quoteSetsGroup.copyTo(quoteSetsGroupEncoder);
                    quoteSetsGroup = quoteSetsGroup.next();
                    quoteSetsGroupEncoder = quoteSetsGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
