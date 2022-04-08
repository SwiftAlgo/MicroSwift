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


public class TradingSessionRulesGrpEncoder
{
    private static final int noTradingSessionRulesGroupCounterHeaderLength = 5;
    private static final byte[] noTradingSessionRulesGroupCounterHeader = new byte[] {49, 51, 48, 57, (byte) '='};



public static class TradingSessionRulesGroupEncoder
{
    private TradingSessionRulesGroupEncoder next = null;

    public TradingSessionRulesGroupEncoder next()
    {
        if (next == null)
        {
            next = new TradingSessionRulesGroupEncoder();
        }
        return next;
    }

    private static final int tradingSessionIDHeaderLength = 4;
    private static final byte[] tradingSessionIDHeader = new byte[] {51, 51, 54, (byte) '='};

    private static final int tradingSessionSubIDHeaderLength = 4;
    private static final byte[] tradingSessionSubIDHeader = new byte[] {54, 50, 53, (byte) '='};

    private final MutableDirectBuffer tradingSessionID = new UnsafeBuffer();

    private int tradingSessionIDOffset = 0;

    private int tradingSessionIDLength = 0;

    public TradingSessionRulesGroupEncoder tradingSessionID(final DirectBuffer value, final int offset, final int length)
    {
        tradingSessionID.wrap(value);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public TradingSessionRulesGroupEncoder tradingSessionID(final DirectBuffer value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public TradingSessionRulesGroupEncoder tradingSessionID(final DirectBuffer value)
    {
        return tradingSessionID(value, 0, value.capacity());
    }

    public TradingSessionRulesGroupEncoder tradingSessionID(final byte[] value, final int offset, final int length)
    {
        tradingSessionID.wrap(value);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public TradingSessionRulesGroupEncoder tradingSessionIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradingSessionID, value, offset, length);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public TradingSessionRulesGroupEncoder tradingSessionID(final byte[] value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public TradingSessionRulesGroupEncoder tradingSessionID(final byte[] value)
    {
        return tradingSessionID(value, 0, value.length);
    }

    public boolean hasTradingSessionID()
    {
        return tradingSessionIDLength > 0;
    }

    public MutableDirectBuffer tradingSessionID()
    {
        return tradingSessionID;
    }

    public String tradingSessionIDAsString()
    {
        return tradingSessionID.getStringWithoutLengthAscii(tradingSessionIDOffset, tradingSessionIDLength);
    }

    public TradingSessionRulesGroupEncoder tradingSessionID(final CharSequence value)
    {
        toBytes(value, tradingSessionID);
        tradingSessionIDOffset = 0;
        tradingSessionIDLength = value.length();
        return this;
    }

    public TradingSessionRulesGroupEncoder tradingSessionID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            tradingSessionID.wrap(buffer);
            tradingSessionIDOffset = value.offset();
            tradingSessionIDLength = value.length();
        }
        return this;
    }

    public TradingSessionRulesGroupEncoder tradingSessionID(final char[] value)
    {
        return tradingSessionID(value, 0, value.length);
    }

    public TradingSessionRulesGroupEncoder tradingSessionID(final char[] value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public TradingSessionRulesGroupEncoder tradingSessionID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradingSessionID, offset, length);
        tradingSessionIDOffset = 0;
        tradingSessionIDLength = length;
        return this;
    }

    public TradingSessionRulesGroupEncoder tradingSessionID(TradingSessionID value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == TradingSessionID.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: tradingSessionID Value: " + value );
            }
            if (value == TradingSessionID.NULL_VAL)
            {
                return this;
            }
        }
        return tradingSessionID(value.representation());
    }

    private final MutableDirectBuffer tradingSessionSubID = new UnsafeBuffer();

    private int tradingSessionSubIDOffset = 0;

    private int tradingSessionSubIDLength = 0;

    public TradingSessionRulesGroupEncoder tradingSessionSubID(final DirectBuffer value, final int offset, final int length)
    {
        tradingSessionSubID.wrap(value);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public TradingSessionRulesGroupEncoder tradingSessionSubID(final DirectBuffer value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public TradingSessionRulesGroupEncoder tradingSessionSubID(final DirectBuffer value)
    {
        return tradingSessionSubID(value, 0, value.capacity());
    }

    public TradingSessionRulesGroupEncoder tradingSessionSubID(final byte[] value, final int offset, final int length)
    {
        tradingSessionSubID.wrap(value);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public TradingSessionRulesGroupEncoder tradingSessionSubIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradingSessionSubID, value, offset, length);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public TradingSessionRulesGroupEncoder tradingSessionSubID(final byte[] value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public TradingSessionRulesGroupEncoder tradingSessionSubID(final byte[] value)
    {
        return tradingSessionSubID(value, 0, value.length);
    }

    public boolean hasTradingSessionSubID()
    {
        return tradingSessionSubIDLength > 0;
    }

    public MutableDirectBuffer tradingSessionSubID()
    {
        return tradingSessionSubID;
    }

    public String tradingSessionSubIDAsString()
    {
        return tradingSessionSubID.getStringWithoutLengthAscii(tradingSessionSubIDOffset, tradingSessionSubIDLength);
    }

    public TradingSessionRulesGroupEncoder tradingSessionSubID(final CharSequence value)
    {
        toBytes(value, tradingSessionSubID);
        tradingSessionSubIDOffset = 0;
        tradingSessionSubIDLength = value.length();
        return this;
    }

    public TradingSessionRulesGroupEncoder tradingSessionSubID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            tradingSessionSubID.wrap(buffer);
            tradingSessionSubIDOffset = value.offset();
            tradingSessionSubIDLength = value.length();
        }
        return this;
    }

    public TradingSessionRulesGroupEncoder tradingSessionSubID(final char[] value)
    {
        return tradingSessionSubID(value, 0, value.length);
    }

    public TradingSessionRulesGroupEncoder tradingSessionSubID(final char[] value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public TradingSessionRulesGroupEncoder tradingSessionSubID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradingSessionSubID, offset, length);
        tradingSessionSubIDOffset = 0;
        tradingSessionSubIDLength = length;
        return this;
    }

    public TradingSessionRulesGroupEncoder tradingSessionSubID(TradingSessionSubID value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == TradingSessionSubID.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: tradingSessionSubID Value: " + value );
            }
            if (value == TradingSessionSubID.NULL_VAL)
            {
                return this;
            }
        }
        return tradingSessionSubID(value.representation());
    }

    private final TradingSessionRulesEncoder tradingSessionRules = new TradingSessionRulesEncoder();
    public TradingSessionRulesEncoder tradingSessionRules()
    {
        return tradingSessionRules;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (tradingSessionIDLength > 0)
        {
            buffer.putBytes(position, tradingSessionIDHeader, 0, tradingSessionIDHeaderLength);
            position += tradingSessionIDHeaderLength;
            buffer.putBytes(position, tradingSessionID, tradingSessionIDOffset, tradingSessionIDLength);
            position += tradingSessionIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (tradingSessionSubIDLength > 0)
        {
            buffer.putBytes(position, tradingSessionSubIDHeader, 0, tradingSessionSubIDHeaderLength);
            position += tradingSessionSubIDHeaderLength;
            buffer.putBytes(position, tradingSessionSubID, tradingSessionSubIDOffset, tradingSessionSubIDLength);
            position += tradingSessionSubIDLength;
            buffer.putSeparator(position);
            position++;
        }

            position += tradingSessionRules.encode(buffer, position);
        if (next != null)
        {
            position += next.encode(buffer, position, remainingElements - 1);
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetTradingSessionID();
        this.resetTradingSessionSubID();
        tradingSessionRules.reset();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetTradingSessionID()
    {
        tradingSessionIDLength = 0;
    }

    public void resetTradingSessionSubID()
    {
        tradingSessionSubIDLength = 0;
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
        builder.append("\"MessageName\": \"TradingSessionRulesGroup\",\n");
        if (hasTradingSessionID())
        {
            indent(builder, level);
            builder.append("\"TradingSessionID\": \"");
            appendBuffer(builder, tradingSessionID, tradingSessionIDOffset, tradingSessionIDLength);
            builder.append("\",\n");
        }

        if (hasTradingSessionSubID())
        {
            indent(builder, level);
            builder.append("\"TradingSessionSubID\": \"");
            appendBuffer(builder, tradingSessionSubID, tradingSessionSubIDOffset, tradingSessionSubIDLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"TradingSessionRules\": ");
    tradingSessionRules.appendTo(builder, level + 1);
    builder.append("\n");
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public TradingSessionRulesGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((TradingSessionRulesGroupEncoder)encoder);
    }

    public TradingSessionRulesGroupEncoder copyTo(final TradingSessionRulesGroupEncoder encoder)
    {
        encoder.reset();
        if (hasTradingSessionID())
        {
            encoder.tradingSessionIDAsCopy(tradingSessionID.byteArray(), 0, tradingSessionIDLength);
        }

        if (hasTradingSessionSubID())
        {
            encoder.tradingSessionSubIDAsCopy(tradingSessionSubID.byteArray(), 0, tradingSessionSubIDLength);
        }


        tradingSessionRules.copyTo(encoder.tradingSessionRules());        return encoder;
    }

}
    private int noTradingSessionRulesGroupCounter;

    private boolean hasNoTradingSessionRulesGroupCounter;

    public boolean hasNoTradingSessionRulesGroupCounter()
    {
        return hasNoTradingSessionRulesGroupCounter;
    }

    public TradingSessionRulesGrpEncoder noTradingSessionRulesGroupCounter(int value)
    {
        noTradingSessionRulesGroupCounter = value;
        hasNoTradingSessionRulesGroupCounter = true;
        return this;
    }

    public int noTradingSessionRulesGroupCounter()
    {
        return noTradingSessionRulesGroupCounter;
    }


    private TradingSessionRulesGroupEncoder tradingSessionRulesGroup = null;

    public TradingSessionRulesGroupEncoder tradingSessionRulesGroup(final int numberOfElements)
    {
        hasNoTradingSessionRulesGroupCounter = true;
        noTradingSessionRulesGroupCounter = numberOfElements;
        if (tradingSessionRulesGroup == null)
        {
            tradingSessionRulesGroup = new TradingSessionRulesGroupEncoder();
        }
        return tradingSessionRulesGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoTradingSessionRulesGroupCounter)
        {
            buffer.putBytes(position, noTradingSessionRulesGroupCounterHeader, 0, noTradingSessionRulesGroupCounterHeaderLength);
            position += noTradingSessionRulesGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noTradingSessionRulesGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (tradingSessionRulesGroup != null)
        {
            position += tradingSessionRulesGroup.encode(buffer, position, noTradingSessionRulesGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetTradingSessionRulesGroup();
    }

    public void resetTradingSessionRulesGroup()
    {
        if (tradingSessionRulesGroup != null)
        {
            tradingSessionRulesGroup.reset();
        }
        noTradingSessionRulesGroupCounter = 0;
        hasNoTradingSessionRulesGroupCounter = false;
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
        builder.append("\"MessageName\": \"TradingSessionRulesGrp\",\n");
        if (hasNoTradingSessionRulesGroupCounter)
        {
            indent(builder, level);
            builder.append("\"TradingSessionRulesGroup\": [\n");
            final int noTradingSessionRulesGroupCounter = this.noTradingSessionRulesGroupCounter;
            TradingSessionRulesGroupEncoder tradingSessionRulesGroup = this.tradingSessionRulesGroup;
            for (int i = 0; i < noTradingSessionRulesGroupCounter; i++)
            {
                indent(builder, level);
                tradingSessionRulesGroup.appendTo(builder, level + 1);
                if (i < (noTradingSessionRulesGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                tradingSessionRulesGroup = tradingSessionRulesGroup.next();
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
    public TradingSessionRulesGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((TradingSessionRulesGrpEncoder)encoder);
    }

    public TradingSessionRulesGrpEncoder copyTo(final TradingSessionRulesGrpEncoder encoder)
    {
        encoder.reset();
        if (hasNoTradingSessionRulesGroupCounter)
        {
            final int size = this.noTradingSessionRulesGroupCounter;
            TradingSessionRulesGroupEncoder tradingSessionRulesGroup = this.tradingSessionRulesGroup;
            TradingSessionRulesGroupEncoder tradingSessionRulesGroupEncoder = encoder.tradingSessionRulesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (tradingSessionRulesGroup != null)
                {
                    tradingSessionRulesGroup.copyTo(tradingSessionRulesGroupEncoder);
                    tradingSessionRulesGroup = tradingSessionRulesGroup.next();
                    tradingSessionRulesGroupEncoder = tradingSessionRulesGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
