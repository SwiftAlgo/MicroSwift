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


public class MarketSegmentGrpEncoder
{
    private static final int noMarketSegmentsGroupCounterHeaderLength = 5;
    private static final byte[] noMarketSegmentsGroupCounterHeader = new byte[] {49, 51, 49, 48, (byte) '='};



public static class MarketSegmentsGroupEncoder
{
    private MarketSegmentsGroupEncoder next = null;

    public MarketSegmentsGroupEncoder next()
    {
        if (next == null)
        {
            next = new MarketSegmentsGroupEncoder();
        }
        return next;
    }

    private static final int marketIDHeaderLength = 5;
    private static final byte[] marketIDHeader = new byte[] {49, 51, 48, 49, (byte) '='};

    private static final int marketSegmentIDHeaderLength = 5;
    private static final byte[] marketSegmentIDHeader = new byte[] {49, 51, 48, 48, (byte) '='};

    private final MutableDirectBuffer marketID = new UnsafeBuffer();

    private int marketIDOffset = 0;

    private int marketIDLength = 0;

    public MarketSegmentsGroupEncoder marketID(final DirectBuffer value, final int offset, final int length)
    {
        marketID.wrap(value);
        marketIDOffset = offset;
        marketIDLength = length;
        return this;
    }

    public MarketSegmentsGroupEncoder marketID(final DirectBuffer value, final int length)
    {
        return marketID(value, 0, length);
    }

    public MarketSegmentsGroupEncoder marketID(final DirectBuffer value)
    {
        return marketID(value, 0, value.capacity());
    }

    public MarketSegmentsGroupEncoder marketID(final byte[] value, final int offset, final int length)
    {
        marketID.wrap(value);
        marketIDOffset = offset;
        marketIDLength = length;
        return this;
    }

    public MarketSegmentsGroupEncoder marketIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(marketID, value, offset, length);
        marketIDOffset = offset;
        marketIDLength = length;
        return this;
    }

    public MarketSegmentsGroupEncoder marketID(final byte[] value, final int length)
    {
        return marketID(value, 0, length);
    }

    public MarketSegmentsGroupEncoder marketID(final byte[] value)
    {
        return marketID(value, 0, value.length);
    }

    public boolean hasMarketID()
    {
        return marketIDLength > 0;
    }

    public MutableDirectBuffer marketID()
    {
        return marketID;
    }

    public String marketIDAsString()
    {
        return marketID.getStringWithoutLengthAscii(marketIDOffset, marketIDLength);
    }

    public MarketSegmentsGroupEncoder marketID(final CharSequence value)
    {
        toBytes(value, marketID);
        marketIDOffset = 0;
        marketIDLength = value.length();
        return this;
    }

    public MarketSegmentsGroupEncoder marketID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            marketID.wrap(buffer);
            marketIDOffset = value.offset();
            marketIDLength = value.length();
        }
        return this;
    }

    public MarketSegmentsGroupEncoder marketID(final char[] value)
    {
        return marketID(value, 0, value.length);
    }

    public MarketSegmentsGroupEncoder marketID(final char[] value, final int length)
    {
        return marketID(value, 0, length);
    }

    public MarketSegmentsGroupEncoder marketID(final char[] value, final int offset, final int length)
    {
        toBytes(value, marketID, offset, length);
        marketIDOffset = 0;
        marketIDLength = length;
        return this;
    }

    private final MutableDirectBuffer marketSegmentID = new UnsafeBuffer();

    private int marketSegmentIDOffset = 0;

    private int marketSegmentIDLength = 0;

    public MarketSegmentsGroupEncoder marketSegmentID(final DirectBuffer value, final int offset, final int length)
    {
        marketSegmentID.wrap(value);
        marketSegmentIDOffset = offset;
        marketSegmentIDLength = length;
        return this;
    }

    public MarketSegmentsGroupEncoder marketSegmentID(final DirectBuffer value, final int length)
    {
        return marketSegmentID(value, 0, length);
    }

    public MarketSegmentsGroupEncoder marketSegmentID(final DirectBuffer value)
    {
        return marketSegmentID(value, 0, value.capacity());
    }

    public MarketSegmentsGroupEncoder marketSegmentID(final byte[] value, final int offset, final int length)
    {
        marketSegmentID.wrap(value);
        marketSegmentIDOffset = offset;
        marketSegmentIDLength = length;
        return this;
    }

    public MarketSegmentsGroupEncoder marketSegmentIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(marketSegmentID, value, offset, length);
        marketSegmentIDOffset = offset;
        marketSegmentIDLength = length;
        return this;
    }

    public MarketSegmentsGroupEncoder marketSegmentID(final byte[] value, final int length)
    {
        return marketSegmentID(value, 0, length);
    }

    public MarketSegmentsGroupEncoder marketSegmentID(final byte[] value)
    {
        return marketSegmentID(value, 0, value.length);
    }

    public boolean hasMarketSegmentID()
    {
        return marketSegmentIDLength > 0;
    }

    public MutableDirectBuffer marketSegmentID()
    {
        return marketSegmentID;
    }

    public String marketSegmentIDAsString()
    {
        return marketSegmentID.getStringWithoutLengthAscii(marketSegmentIDOffset, marketSegmentIDLength);
    }

    public MarketSegmentsGroupEncoder marketSegmentID(final CharSequence value)
    {
        toBytes(value, marketSegmentID);
        marketSegmentIDOffset = 0;
        marketSegmentIDLength = value.length();
        return this;
    }

    public MarketSegmentsGroupEncoder marketSegmentID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            marketSegmentID.wrap(buffer);
            marketSegmentIDOffset = value.offset();
            marketSegmentIDLength = value.length();
        }
        return this;
    }

    public MarketSegmentsGroupEncoder marketSegmentID(final char[] value)
    {
        return marketSegmentID(value, 0, value.length);
    }

    public MarketSegmentsGroupEncoder marketSegmentID(final char[] value, final int length)
    {
        return marketSegmentID(value, 0, length);
    }

    public MarketSegmentsGroupEncoder marketSegmentID(final char[] value, final int offset, final int length)
    {
        toBytes(value, marketSegmentID, offset, length);
        marketSegmentIDOffset = 0;
        marketSegmentIDLength = length;
        return this;
    }

    private final SecurityTradingRulesEncoder securityTradingRules = new SecurityTradingRulesEncoder();
    public SecurityTradingRulesEncoder securityTradingRules()
    {
        return securityTradingRules;
    }

    private final StrikeRulesEncoder strikeRules = new StrikeRulesEncoder();
    public StrikeRulesEncoder strikeRules()
    {
        return strikeRules;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (marketIDLength > 0)
        {
            buffer.putBytes(position, marketIDHeader, 0, marketIDHeaderLength);
            position += marketIDHeaderLength;
            buffer.putBytes(position, marketID, marketIDOffset, marketIDLength);
            position += marketIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (marketSegmentIDLength > 0)
        {
            buffer.putBytes(position, marketSegmentIDHeader, 0, marketSegmentIDHeaderLength);
            position += marketSegmentIDHeaderLength;
            buffer.putBytes(position, marketSegmentID, marketSegmentIDOffset, marketSegmentIDLength);
            position += marketSegmentIDLength;
            buffer.putSeparator(position);
            position++;
        }

            position += securityTradingRules.encode(buffer, position);

            position += strikeRules.encode(buffer, position);
        if (next != null)
        {
            position += next.encode(buffer, position, remainingElements - 1);
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetMarketID();
        this.resetMarketSegmentID();
        securityTradingRules.reset();
        strikeRules.reset();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetMarketID()
    {
        marketIDLength = 0;
    }

    public void resetMarketSegmentID()
    {
        marketSegmentIDLength = 0;
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
        builder.append("\"MessageName\": \"MarketSegmentsGroup\",\n");
        if (hasMarketID())
        {
            indent(builder, level);
            builder.append("\"MarketID\": \"");
            appendBuffer(builder, marketID, marketIDOffset, marketIDLength);
            builder.append("\",\n");
        }

        if (hasMarketSegmentID())
        {
            indent(builder, level);
            builder.append("\"MarketSegmentID\": \"");
            appendBuffer(builder, marketSegmentID, marketSegmentIDOffset, marketSegmentIDLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"SecurityTradingRules\": ");
    securityTradingRules.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"StrikeRules\": ");
    strikeRules.appendTo(builder, level + 1);
    builder.append("\n");
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public MarketSegmentsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((MarketSegmentsGroupEncoder)encoder);
    }

    public MarketSegmentsGroupEncoder copyTo(final MarketSegmentsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasMarketID())
        {
            encoder.marketIDAsCopy(marketID.byteArray(), 0, marketIDLength);
        }

        if (hasMarketSegmentID())
        {
            encoder.marketSegmentIDAsCopy(marketSegmentID.byteArray(), 0, marketSegmentIDLength);
        }


        securityTradingRules.copyTo(encoder.securityTradingRules());

        strikeRules.copyTo(encoder.strikeRules());        return encoder;
    }

}
    private int noMarketSegmentsGroupCounter;

    private boolean hasNoMarketSegmentsGroupCounter;

    public boolean hasNoMarketSegmentsGroupCounter()
    {
        return hasNoMarketSegmentsGroupCounter;
    }

    public MarketSegmentGrpEncoder noMarketSegmentsGroupCounter(int value)
    {
        noMarketSegmentsGroupCounter = value;
        hasNoMarketSegmentsGroupCounter = true;
        return this;
    }

    public int noMarketSegmentsGroupCounter()
    {
        return noMarketSegmentsGroupCounter;
    }


    private MarketSegmentsGroupEncoder marketSegmentsGroup = null;

    public MarketSegmentsGroupEncoder marketSegmentsGroup(final int numberOfElements)
    {
        hasNoMarketSegmentsGroupCounter = true;
        noMarketSegmentsGroupCounter = numberOfElements;
        if (marketSegmentsGroup == null)
        {
            marketSegmentsGroup = new MarketSegmentsGroupEncoder();
        }
        return marketSegmentsGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoMarketSegmentsGroupCounter)
        {
            buffer.putBytes(position, noMarketSegmentsGroupCounterHeader, 0, noMarketSegmentsGroupCounterHeaderLength);
            position += noMarketSegmentsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noMarketSegmentsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (marketSegmentsGroup != null)
        {
            position += marketSegmentsGroup.encode(buffer, position, noMarketSegmentsGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetMarketSegmentsGroup();
    }

    public void resetMarketSegmentsGroup()
    {
        if (marketSegmentsGroup != null)
        {
            marketSegmentsGroup.reset();
        }
        noMarketSegmentsGroupCounter = 0;
        hasNoMarketSegmentsGroupCounter = false;
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
        builder.append("\"MessageName\": \"MarketSegmentGrp\",\n");
        if (hasNoMarketSegmentsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"MarketSegmentsGroup\": [\n");
            final int noMarketSegmentsGroupCounter = this.noMarketSegmentsGroupCounter;
            MarketSegmentsGroupEncoder marketSegmentsGroup = this.marketSegmentsGroup;
            for (int i = 0; i < noMarketSegmentsGroupCounter; i++)
            {
                indent(builder, level);
                marketSegmentsGroup.appendTo(builder, level + 1);
                if (i < (noMarketSegmentsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                marketSegmentsGroup = marketSegmentsGroup.next();
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
    public MarketSegmentGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((MarketSegmentGrpEncoder)encoder);
    }

    public MarketSegmentGrpEncoder copyTo(final MarketSegmentGrpEncoder encoder)
    {
        encoder.reset();
        if (hasNoMarketSegmentsGroupCounter)
        {
            final int size = this.noMarketSegmentsGroupCounter;
            MarketSegmentsGroupEncoder marketSegmentsGroup = this.marketSegmentsGroup;
            MarketSegmentsGroupEncoder marketSegmentsGroupEncoder = encoder.marketSegmentsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (marketSegmentsGroup != null)
                {
                    marketSegmentsGroup.copyTo(marketSegmentsGroupEncoder);
                    marketSegmentsGroup = marketSegmentsGroup.next();
                    marketSegmentsGroupEncoder = marketSegmentsGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
