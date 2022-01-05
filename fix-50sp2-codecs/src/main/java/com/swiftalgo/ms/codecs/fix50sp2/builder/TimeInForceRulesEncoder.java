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


public class TimeInForceRulesEncoder
{
    private static final int noTimeInForceRulesGroupCounterHeaderLength = 5;
    private static final byte[] noTimeInForceRulesGroupCounterHeader = new byte[] {49, 50, 51, 57, (byte) '='};



public static class TimeInForceRulesGroupEncoder
{
    private TimeInForceRulesGroupEncoder next = null;

    public TimeInForceRulesGroupEncoder next()
    {
        if (next == null)
        {
            next = new TimeInForceRulesGroupEncoder();
        }
        return next;
    }

    private static final int timeInForceHeaderLength = 3;
    private static final byte[] timeInForceHeader = new byte[] {53, 57, (byte) '='};

    private char timeInForce;

    private boolean hasTimeInForce;

    public boolean hasTimeInForce()
    {
        return hasTimeInForce;
    }

    public TimeInForceRulesGroupEncoder timeInForce(char value)
    {
        timeInForce = value;
        hasTimeInForce = true;
        return this;
    }

    public char timeInForce()
    {
        return timeInForce;
    }

    public TimeInForceRulesGroupEncoder timeInForce(TimeInForce value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == TimeInForce.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: timeInForce Value: " + value );
            }
            if (value == TimeInForce.NULL_VAL)
            {
                return this;
            }
        }
        return timeInForce(value.representation());
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (hasTimeInForce)
        {
            buffer.putBytes(position, timeInForceHeader, 0, timeInForceHeaderLength);
            position += timeInForceHeaderLength;
            position += buffer.putCharAscii(position, timeInForce);
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
        this.resetTimeInForce();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetTimeInForce()
    {
        hasTimeInForce = false;
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
        builder.append("\"MessageName\": \"TimeInForceRulesGroup\",\n");
        if (hasTimeInForce())
        {
            indent(builder, level);
            builder.append("\"TimeInForce\": \"");
            builder.append(timeInForce);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public TimeInForceRulesGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((TimeInForceRulesGroupEncoder)encoder);
    }

    public TimeInForceRulesGroupEncoder copyTo(final TimeInForceRulesGroupEncoder encoder)
    {
        encoder.reset();
        if (hasTimeInForce())
        {
            encoder.timeInForce(this.timeInForce());
        }
        return encoder;
    }

}
    private int noTimeInForceRulesGroupCounter;

    private boolean hasNoTimeInForceRulesGroupCounter;

    public boolean hasNoTimeInForceRulesGroupCounter()
    {
        return hasNoTimeInForceRulesGroupCounter;
    }

    public TimeInForceRulesEncoder noTimeInForceRulesGroupCounter(int value)
    {
        noTimeInForceRulesGroupCounter = value;
        hasNoTimeInForceRulesGroupCounter = true;
        return this;
    }

    public int noTimeInForceRulesGroupCounter()
    {
        return noTimeInForceRulesGroupCounter;
    }


    private TimeInForceRulesGroupEncoder timeInForceRulesGroup = null;

    public TimeInForceRulesGroupEncoder timeInForceRulesGroup(final int numberOfElements)
    {
        hasNoTimeInForceRulesGroupCounter = true;
        noTimeInForceRulesGroupCounter = numberOfElements;
        if (timeInForceRulesGroup == null)
        {
            timeInForceRulesGroup = new TimeInForceRulesGroupEncoder();
        }
        return timeInForceRulesGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoTimeInForceRulesGroupCounter)
        {
            buffer.putBytes(position, noTimeInForceRulesGroupCounterHeader, 0, noTimeInForceRulesGroupCounterHeaderLength);
            position += noTimeInForceRulesGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noTimeInForceRulesGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (timeInForceRulesGroup != null)
        {
            position += timeInForceRulesGroup.encode(buffer, position, noTimeInForceRulesGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetTimeInForceRulesGroup();
    }

    public void resetTimeInForceRulesGroup()
    {
        if (timeInForceRulesGroup != null)
        {
            timeInForceRulesGroup.reset();
        }
        noTimeInForceRulesGroupCounter = 0;
        hasNoTimeInForceRulesGroupCounter = false;
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
        builder.append("\"MessageName\": \"TimeInForceRules\",\n");
        if (hasNoTimeInForceRulesGroupCounter)
        {
            indent(builder, level);
            builder.append("\"TimeInForceRulesGroup\": [\n");
            final int noTimeInForceRulesGroupCounter = this.noTimeInForceRulesGroupCounter;
            TimeInForceRulesGroupEncoder timeInForceRulesGroup = this.timeInForceRulesGroup;
            for (int i = 0; i < noTimeInForceRulesGroupCounter; i++)
            {
                indent(builder, level);
                timeInForceRulesGroup.appendTo(builder, level + 1);
                if (i < (noTimeInForceRulesGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                timeInForceRulesGroup = timeInForceRulesGroup.next();
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
    public TimeInForceRulesEncoder copyTo(final Encoder encoder)
    {
        return copyTo((TimeInForceRulesEncoder)encoder);
    }

    public TimeInForceRulesEncoder copyTo(final TimeInForceRulesEncoder encoder)
    {
        encoder.reset();
        if (hasNoTimeInForceRulesGroupCounter)
        {
            final int size = this.noTimeInForceRulesGroupCounter;
            TimeInForceRulesGroupEncoder timeInForceRulesGroup = this.timeInForceRulesGroup;
            TimeInForceRulesGroupEncoder timeInForceRulesGroupEncoder = encoder.timeInForceRulesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (timeInForceRulesGroup != null)
                {
                    timeInForceRulesGroup.copyTo(timeInForceRulesGroupEncoder);
                    timeInForceRulesGroup = timeInForceRulesGroup.next();
                    timeInForceRulesGroupEncoder = timeInForceRulesGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
