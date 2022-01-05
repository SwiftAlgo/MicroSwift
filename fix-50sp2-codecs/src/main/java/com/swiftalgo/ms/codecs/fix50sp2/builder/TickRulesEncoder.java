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


public class TickRulesEncoder
{
    private static final int noTickRulesGroupCounterHeaderLength = 5;
    private static final byte[] noTickRulesGroupCounterHeader = new byte[] {49, 50, 48, 53, (byte) '='};



public static class TickRulesGroupEncoder
{
    private TickRulesGroupEncoder next = null;

    public TickRulesGroupEncoder next()
    {
        if (next == null)
        {
            next = new TickRulesGroupEncoder();
        }
        return next;
    }

    private static final int startTickPriceRangeHeaderLength = 5;
    private static final byte[] startTickPriceRangeHeader = new byte[] {49, 50, 48, 54, (byte) '='};

    private static final int endTickPriceRangeHeaderLength = 5;
    private static final byte[] endTickPriceRangeHeader = new byte[] {49, 50, 48, 55, (byte) '='};

    private static final int tickIncrementHeaderLength = 5;
    private static final byte[] tickIncrementHeader = new byte[] {49, 50, 48, 56, (byte) '='};

    private static final int tickRuleTypeHeaderLength = 5;
    private static final byte[] tickRuleTypeHeader = new byte[] {49, 50, 48, 57, (byte) '='};

    private final DecimalFloat startTickPriceRange = new DecimalFloat();

    private boolean hasStartTickPriceRange;

    public boolean hasStartTickPriceRange()
    {
        return hasStartTickPriceRange;
    }

    public TickRulesGroupEncoder startTickPriceRange(DecimalFloat value)
    {
        startTickPriceRange.set(value);
        hasStartTickPriceRange = true;
        return this;
    }

    public TickRulesGroupEncoder startTickPriceRange(long value, int scale)
    {
        startTickPriceRange.set(value, scale);
        hasStartTickPriceRange = true;
        return this;
    }

    public DecimalFloat startTickPriceRange()
    {
        return startTickPriceRange;
    }

    private final DecimalFloat endTickPriceRange = new DecimalFloat();

    private boolean hasEndTickPriceRange;

    public boolean hasEndTickPriceRange()
    {
        return hasEndTickPriceRange;
    }

    public TickRulesGroupEncoder endTickPriceRange(DecimalFloat value)
    {
        endTickPriceRange.set(value);
        hasEndTickPriceRange = true;
        return this;
    }

    public TickRulesGroupEncoder endTickPriceRange(long value, int scale)
    {
        endTickPriceRange.set(value, scale);
        hasEndTickPriceRange = true;
        return this;
    }

    public DecimalFloat endTickPriceRange()
    {
        return endTickPriceRange;
    }

    private final DecimalFloat tickIncrement = new DecimalFloat();

    private boolean hasTickIncrement;

    public boolean hasTickIncrement()
    {
        return hasTickIncrement;
    }

    public TickRulesGroupEncoder tickIncrement(DecimalFloat value)
    {
        tickIncrement.set(value);
        hasTickIncrement = true;
        return this;
    }

    public TickRulesGroupEncoder tickIncrement(long value, int scale)
    {
        tickIncrement.set(value, scale);
        hasTickIncrement = true;
        return this;
    }

    public DecimalFloat tickIncrement()
    {
        return tickIncrement;
    }

    private int tickRuleType;

    private boolean hasTickRuleType;

    public boolean hasTickRuleType()
    {
        return hasTickRuleType;
    }

    public TickRulesGroupEncoder tickRuleType(int value)
    {
        tickRuleType = value;
        hasTickRuleType = true;
        return this;
    }

    public int tickRuleType()
    {
        return tickRuleType;
    }

    public TickRulesGroupEncoder tickRuleType(TickRuleType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == TickRuleType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: tickRuleType Value: " + value );
            }
            if (value == TickRuleType.NULL_VAL)
            {
                return this;
            }
        }
        return tickRuleType(value.representation());
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (hasStartTickPriceRange)
        {
            buffer.putBytes(position, startTickPriceRangeHeader, 0, startTickPriceRangeHeaderLength);
            position += startTickPriceRangeHeaderLength;
            position += buffer.putFloatAscii(position, startTickPriceRange);
            buffer.putSeparator(position);
            position++;
        }

        if (hasEndTickPriceRange)
        {
            buffer.putBytes(position, endTickPriceRangeHeader, 0, endTickPriceRangeHeaderLength);
            position += endTickPriceRangeHeaderLength;
            position += buffer.putFloatAscii(position, endTickPriceRange);
            buffer.putSeparator(position);
            position++;
        }

        if (hasTickIncrement)
        {
            buffer.putBytes(position, tickIncrementHeader, 0, tickIncrementHeaderLength);
            position += tickIncrementHeaderLength;
            position += buffer.putFloatAscii(position, tickIncrement);
            buffer.putSeparator(position);
            position++;
        }

        if (hasTickRuleType)
        {
            buffer.putBytes(position, tickRuleTypeHeader, 0, tickRuleTypeHeaderLength);
            position += tickRuleTypeHeaderLength;
            position += buffer.putIntAscii(position, tickRuleType);
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
        this.resetStartTickPriceRange();
        this.resetEndTickPriceRange();
        this.resetTickIncrement();
        this.resetTickRuleType();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetStartTickPriceRange()
    {
        hasStartTickPriceRange = false;
    }

    public void resetEndTickPriceRange()
    {
        hasEndTickPriceRange = false;
    }

    public void resetTickIncrement()
    {
        hasTickIncrement = false;
    }

    public void resetTickRuleType()
    {
        hasTickRuleType = false;
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
        builder.append("\"MessageName\": \"TickRulesGroup\",\n");
        if (hasStartTickPriceRange())
        {
            indent(builder, level);
            builder.append("\"StartTickPriceRange\": \"");
            startTickPriceRange.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasEndTickPriceRange())
        {
            indent(builder, level);
            builder.append("\"EndTickPriceRange\": \"");
            endTickPriceRange.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasTickIncrement())
        {
            indent(builder, level);
            builder.append("\"TickIncrement\": \"");
            tickIncrement.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasTickRuleType())
        {
            indent(builder, level);
            builder.append("\"TickRuleType\": \"");
            builder.append(tickRuleType);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public TickRulesGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((TickRulesGroupEncoder)encoder);
    }

    public TickRulesGroupEncoder copyTo(final TickRulesGroupEncoder encoder)
    {
        encoder.reset();
        if (hasStartTickPriceRange())
        {
            encoder.startTickPriceRange(this.startTickPriceRange());
        }

        if (hasEndTickPriceRange())
        {
            encoder.endTickPriceRange(this.endTickPriceRange());
        }

        if (hasTickIncrement())
        {
            encoder.tickIncrement(this.tickIncrement());
        }

        if (hasTickRuleType())
        {
            encoder.tickRuleType(this.tickRuleType());
        }
        return encoder;
    }

}
    private int noTickRulesGroupCounter;

    private boolean hasNoTickRulesGroupCounter;

    public boolean hasNoTickRulesGroupCounter()
    {
        return hasNoTickRulesGroupCounter;
    }

    public TickRulesEncoder noTickRulesGroupCounter(int value)
    {
        noTickRulesGroupCounter = value;
        hasNoTickRulesGroupCounter = true;
        return this;
    }

    public int noTickRulesGroupCounter()
    {
        return noTickRulesGroupCounter;
    }


    private TickRulesGroupEncoder tickRulesGroup = null;

    public TickRulesGroupEncoder tickRulesGroup(final int numberOfElements)
    {
        hasNoTickRulesGroupCounter = true;
        noTickRulesGroupCounter = numberOfElements;
        if (tickRulesGroup == null)
        {
            tickRulesGroup = new TickRulesGroupEncoder();
        }
        return tickRulesGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoTickRulesGroupCounter)
        {
            buffer.putBytes(position, noTickRulesGroupCounterHeader, 0, noTickRulesGroupCounterHeaderLength);
            position += noTickRulesGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noTickRulesGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (tickRulesGroup != null)
        {
            position += tickRulesGroup.encode(buffer, position, noTickRulesGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetTickRulesGroup();
    }

    public void resetTickRulesGroup()
    {
        if (tickRulesGroup != null)
        {
            tickRulesGroup.reset();
        }
        noTickRulesGroupCounter = 0;
        hasNoTickRulesGroupCounter = false;
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
        builder.append("\"MessageName\": \"TickRules\",\n");
        if (hasNoTickRulesGroupCounter)
        {
            indent(builder, level);
            builder.append("\"TickRulesGroup\": [\n");
            final int noTickRulesGroupCounter = this.noTickRulesGroupCounter;
            TickRulesGroupEncoder tickRulesGroup = this.tickRulesGroup;
            for (int i = 0; i < noTickRulesGroupCounter; i++)
            {
                indent(builder, level);
                tickRulesGroup.appendTo(builder, level + 1);
                if (i < (noTickRulesGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                tickRulesGroup = tickRulesGroup.next();
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
    public TickRulesEncoder copyTo(final Encoder encoder)
    {
        return copyTo((TickRulesEncoder)encoder);
    }

    public TickRulesEncoder copyTo(final TickRulesEncoder encoder)
    {
        encoder.reset();
        if (hasNoTickRulesGroupCounter)
        {
            final int size = this.noTickRulesGroupCounter;
            TickRulesGroupEncoder tickRulesGroup = this.tickRulesGroup;
            TickRulesGroupEncoder tickRulesGroupEncoder = encoder.tickRulesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (tickRulesGroup != null)
                {
                    tickRulesGroup.copyTo(tickRulesGroupEncoder);
                    tickRulesGroup = tickRulesGroup.next();
                    tickRulesGroupEncoder = tickRulesGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
