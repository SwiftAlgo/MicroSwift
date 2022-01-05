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


public class StatsIndGrpEncoder
{
    private static final int noStatsIndicatorsGroupCounterHeaderLength = 5;
    private static final byte[] noStatsIndicatorsGroupCounterHeader = new byte[] {49, 49, 55, 53, (byte) '='};



public static class StatsIndicatorsGroupEncoder
{
    private StatsIndicatorsGroupEncoder next = null;

    public StatsIndicatorsGroupEncoder next()
    {
        if (next == null)
        {
            next = new StatsIndicatorsGroupEncoder();
        }
        return next;
    }

    private static final int statsTypeHeaderLength = 5;
    private static final byte[] statsTypeHeader = new byte[] {49, 49, 55, 54, (byte) '='};

    private int statsType;

    private boolean hasStatsType;

    public boolean hasStatsType()
    {
        return hasStatsType;
    }

    public StatsIndicatorsGroupEncoder statsType(int value)
    {
        statsType = value;
        hasStatsType = true;
        return this;
    }

    public int statsType()
    {
        return statsType;
    }

    public StatsIndicatorsGroupEncoder statsType(StatsType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == StatsType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: statsType Value: " + value );
            }
            if (value == StatsType.NULL_VAL)
            {
                return this;
            }
        }
        return statsType(value.representation());
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (hasStatsType)
        {
            buffer.putBytes(position, statsTypeHeader, 0, statsTypeHeaderLength);
            position += statsTypeHeaderLength;
            position += buffer.putIntAscii(position, statsType);
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
        this.resetStatsType();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetStatsType()
    {
        hasStatsType = false;
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
        builder.append("\"MessageName\": \"StatsIndicatorsGroup\",\n");
        if (hasStatsType())
        {
            indent(builder, level);
            builder.append("\"StatsType\": \"");
            builder.append(statsType);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public StatsIndicatorsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((StatsIndicatorsGroupEncoder)encoder);
    }

    public StatsIndicatorsGroupEncoder copyTo(final StatsIndicatorsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasStatsType())
        {
            encoder.statsType(this.statsType());
        }
        return encoder;
    }

}
    private int noStatsIndicatorsGroupCounter;

    private boolean hasNoStatsIndicatorsGroupCounter;

    public boolean hasNoStatsIndicatorsGroupCounter()
    {
        return hasNoStatsIndicatorsGroupCounter;
    }

    public StatsIndGrpEncoder noStatsIndicatorsGroupCounter(int value)
    {
        noStatsIndicatorsGroupCounter = value;
        hasNoStatsIndicatorsGroupCounter = true;
        return this;
    }

    public int noStatsIndicatorsGroupCounter()
    {
        return noStatsIndicatorsGroupCounter;
    }


    private StatsIndicatorsGroupEncoder statsIndicatorsGroup = null;

    public StatsIndicatorsGroupEncoder statsIndicatorsGroup(final int numberOfElements)
    {
        hasNoStatsIndicatorsGroupCounter = true;
        noStatsIndicatorsGroupCounter = numberOfElements;
        if (statsIndicatorsGroup == null)
        {
            statsIndicatorsGroup = new StatsIndicatorsGroupEncoder();
        }
        return statsIndicatorsGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoStatsIndicatorsGroupCounter)
        {
            buffer.putBytes(position, noStatsIndicatorsGroupCounterHeader, 0, noStatsIndicatorsGroupCounterHeaderLength);
            position += noStatsIndicatorsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noStatsIndicatorsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (statsIndicatorsGroup != null)
        {
            position += statsIndicatorsGroup.encode(buffer, position, noStatsIndicatorsGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetStatsIndicatorsGroup();
    }

    public void resetStatsIndicatorsGroup()
    {
        if (statsIndicatorsGroup != null)
        {
            statsIndicatorsGroup.reset();
        }
        noStatsIndicatorsGroupCounter = 0;
        hasNoStatsIndicatorsGroupCounter = false;
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
        builder.append("\"MessageName\": \"StatsIndGrp\",\n");
        if (hasNoStatsIndicatorsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"StatsIndicatorsGroup\": [\n");
            final int noStatsIndicatorsGroupCounter = this.noStatsIndicatorsGroupCounter;
            StatsIndicatorsGroupEncoder statsIndicatorsGroup = this.statsIndicatorsGroup;
            for (int i = 0; i < noStatsIndicatorsGroupCounter; i++)
            {
                indent(builder, level);
                statsIndicatorsGroup.appendTo(builder, level + 1);
                if (i < (noStatsIndicatorsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                statsIndicatorsGroup = statsIndicatorsGroup.next();
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
    public StatsIndGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((StatsIndGrpEncoder)encoder);
    }

    public StatsIndGrpEncoder copyTo(final StatsIndGrpEncoder encoder)
    {
        encoder.reset();
        if (hasNoStatsIndicatorsGroupCounter)
        {
            final int size = this.noStatsIndicatorsGroupCounter;
            StatsIndicatorsGroupEncoder statsIndicatorsGroup = this.statsIndicatorsGroup;
            StatsIndicatorsGroupEncoder statsIndicatorsGroupEncoder = encoder.statsIndicatorsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (statsIndicatorsGroup != null)
                {
                    statsIndicatorsGroup.copyTo(statsIndicatorsGroupEncoder);
                    statsIndicatorsGroup = statsIndicatorsGroup.next();
                    statsIndicatorsGroupEncoder = statsIndicatorsGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
