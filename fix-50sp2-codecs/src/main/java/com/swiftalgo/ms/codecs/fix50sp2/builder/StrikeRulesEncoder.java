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


public class StrikeRulesEncoder
{
    private static final int noStrikeRulesGroupCounterHeaderLength = 5;
    private static final byte[] noStrikeRulesGroupCounterHeader = new byte[] {49, 50, 48, 49, (byte) '='};



public static class StrikeRulesGroupEncoder
{
    private StrikeRulesGroupEncoder next = null;

    public StrikeRulesGroupEncoder next()
    {
        if (next == null)
        {
            next = new StrikeRulesGroupEncoder();
        }
        return next;
    }

    private static final int strikeRuleIDHeaderLength = 5;
    private static final byte[] strikeRuleIDHeader = new byte[] {49, 50, 50, 51, (byte) '='};

    private static final int startStrikePxRangeHeaderLength = 5;
    private static final byte[] startStrikePxRangeHeader = new byte[] {49, 50, 48, 50, (byte) '='};

    private static final int endStrikePxRangeHeaderLength = 5;
    private static final byte[] endStrikePxRangeHeader = new byte[] {49, 50, 48, 51, (byte) '='};

    private static final int strikeIncrementHeaderLength = 5;
    private static final byte[] strikeIncrementHeader = new byte[] {49, 50, 48, 52, (byte) '='};

    private static final int strikeExerciseStyleHeaderLength = 5;
    private static final byte[] strikeExerciseStyleHeader = new byte[] {49, 51, 48, 52, (byte) '='};

    private final MutableDirectBuffer strikeRuleID = new UnsafeBuffer();

    private int strikeRuleIDOffset = 0;

    private int strikeRuleIDLength = 0;

    public StrikeRulesGroupEncoder strikeRuleID(final DirectBuffer value, final int offset, final int length)
    {
        strikeRuleID.wrap(value);
        strikeRuleIDOffset = offset;
        strikeRuleIDLength = length;
        return this;
    }

    public StrikeRulesGroupEncoder strikeRuleID(final DirectBuffer value, final int length)
    {
        return strikeRuleID(value, 0, length);
    }

    public StrikeRulesGroupEncoder strikeRuleID(final DirectBuffer value)
    {
        return strikeRuleID(value, 0, value.capacity());
    }

    public StrikeRulesGroupEncoder strikeRuleID(final byte[] value, final int offset, final int length)
    {
        strikeRuleID.wrap(value);
        strikeRuleIDOffset = offset;
        strikeRuleIDLength = length;
        return this;
    }

    public StrikeRulesGroupEncoder strikeRuleIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(strikeRuleID, value, offset, length);
        strikeRuleIDOffset = offset;
        strikeRuleIDLength = length;
        return this;
    }

    public StrikeRulesGroupEncoder strikeRuleID(final byte[] value, final int length)
    {
        return strikeRuleID(value, 0, length);
    }

    public StrikeRulesGroupEncoder strikeRuleID(final byte[] value)
    {
        return strikeRuleID(value, 0, value.length);
    }

    public boolean hasStrikeRuleID()
    {
        return strikeRuleIDLength > 0;
    }

    public MutableDirectBuffer strikeRuleID()
    {
        return strikeRuleID;
    }

    public String strikeRuleIDAsString()
    {
        return strikeRuleID.getStringWithoutLengthAscii(strikeRuleIDOffset, strikeRuleIDLength);
    }

    public StrikeRulesGroupEncoder strikeRuleID(final CharSequence value)
    {
        toBytes(value, strikeRuleID);
        strikeRuleIDOffset = 0;
        strikeRuleIDLength = value.length();
        return this;
    }

    public StrikeRulesGroupEncoder strikeRuleID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            strikeRuleID.wrap(buffer);
            strikeRuleIDOffset = value.offset();
            strikeRuleIDLength = value.length();
        }
        return this;
    }

    public StrikeRulesGroupEncoder strikeRuleID(final char[] value)
    {
        return strikeRuleID(value, 0, value.length);
    }

    public StrikeRulesGroupEncoder strikeRuleID(final char[] value, final int length)
    {
        return strikeRuleID(value, 0, length);
    }

    public StrikeRulesGroupEncoder strikeRuleID(final char[] value, final int offset, final int length)
    {
        toBytes(value, strikeRuleID, offset, length);
        strikeRuleIDOffset = 0;
        strikeRuleIDLength = length;
        return this;
    }

    private final DecimalFloat startStrikePxRange = new DecimalFloat();

    private boolean hasStartStrikePxRange;

    public boolean hasStartStrikePxRange()
    {
        return hasStartStrikePxRange;
    }

    public StrikeRulesGroupEncoder startStrikePxRange(DecimalFloat value)
    {
        startStrikePxRange.set(value);
        hasStartStrikePxRange = true;
        return this;
    }

    public StrikeRulesGroupEncoder startStrikePxRange(long value, int scale)
    {
        startStrikePxRange.set(value, scale);
        hasStartStrikePxRange = true;
        return this;
    }

    public DecimalFloat startStrikePxRange()
    {
        return startStrikePxRange;
    }

    private final DecimalFloat endStrikePxRange = new DecimalFloat();

    private boolean hasEndStrikePxRange;

    public boolean hasEndStrikePxRange()
    {
        return hasEndStrikePxRange;
    }

    public StrikeRulesGroupEncoder endStrikePxRange(DecimalFloat value)
    {
        endStrikePxRange.set(value);
        hasEndStrikePxRange = true;
        return this;
    }

    public StrikeRulesGroupEncoder endStrikePxRange(long value, int scale)
    {
        endStrikePxRange.set(value, scale);
        hasEndStrikePxRange = true;
        return this;
    }

    public DecimalFloat endStrikePxRange()
    {
        return endStrikePxRange;
    }

    private final DecimalFloat strikeIncrement = new DecimalFloat();

    private boolean hasStrikeIncrement;

    public boolean hasStrikeIncrement()
    {
        return hasStrikeIncrement;
    }

    public StrikeRulesGroupEncoder strikeIncrement(DecimalFloat value)
    {
        strikeIncrement.set(value);
        hasStrikeIncrement = true;
        return this;
    }

    public StrikeRulesGroupEncoder strikeIncrement(long value, int scale)
    {
        strikeIncrement.set(value, scale);
        hasStrikeIncrement = true;
        return this;
    }

    public DecimalFloat strikeIncrement()
    {
        return strikeIncrement;
    }

    private int strikeExerciseStyle;

    private boolean hasStrikeExerciseStyle;

    public boolean hasStrikeExerciseStyle()
    {
        return hasStrikeExerciseStyle;
    }

    public StrikeRulesGroupEncoder strikeExerciseStyle(int value)
    {
        strikeExerciseStyle = value;
        hasStrikeExerciseStyle = true;
        return this;
    }

    public int strikeExerciseStyle()
    {
        return strikeExerciseStyle;
    }

    private final MaturityRulesEncoder maturityRules = new MaturityRulesEncoder();
    public MaturityRulesEncoder maturityRules()
    {
        return maturityRules;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (strikeRuleIDLength > 0)
        {
            buffer.putBytes(position, strikeRuleIDHeader, 0, strikeRuleIDHeaderLength);
            position += strikeRuleIDHeaderLength;
            buffer.putBytes(position, strikeRuleID, strikeRuleIDOffset, strikeRuleIDLength);
            position += strikeRuleIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasStartStrikePxRange)
        {
            buffer.putBytes(position, startStrikePxRangeHeader, 0, startStrikePxRangeHeaderLength);
            position += startStrikePxRangeHeaderLength;
            position += buffer.putFloatAscii(position, startStrikePxRange);
            buffer.putSeparator(position);
            position++;
        }

        if (hasEndStrikePxRange)
        {
            buffer.putBytes(position, endStrikePxRangeHeader, 0, endStrikePxRangeHeaderLength);
            position += endStrikePxRangeHeaderLength;
            position += buffer.putFloatAscii(position, endStrikePxRange);
            buffer.putSeparator(position);
            position++;
        }

        if (hasStrikeIncrement)
        {
            buffer.putBytes(position, strikeIncrementHeader, 0, strikeIncrementHeaderLength);
            position += strikeIncrementHeaderLength;
            position += buffer.putFloatAscii(position, strikeIncrement);
            buffer.putSeparator(position);
            position++;
        }

        if (hasStrikeExerciseStyle)
        {
            buffer.putBytes(position, strikeExerciseStyleHeader, 0, strikeExerciseStyleHeaderLength);
            position += strikeExerciseStyleHeaderLength;
            position += buffer.putIntAscii(position, strikeExerciseStyle);
            buffer.putSeparator(position);
            position++;
        }

            position += maturityRules.encode(buffer, position);
        if (next != null)
        {
            position += next.encode(buffer, position, remainingElements - 1);
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetStrikeRuleID();
        this.resetStartStrikePxRange();
        this.resetEndStrikePxRange();
        this.resetStrikeIncrement();
        this.resetStrikeExerciseStyle();
        maturityRules.reset();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetStrikeRuleID()
    {
        strikeRuleIDLength = 0;
    }

    public void resetStartStrikePxRange()
    {
        hasStartStrikePxRange = false;
    }

    public void resetEndStrikePxRange()
    {
        hasEndStrikePxRange = false;
    }

    public void resetStrikeIncrement()
    {
        hasStrikeIncrement = false;
    }

    public void resetStrikeExerciseStyle()
    {
        hasStrikeExerciseStyle = false;
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
        builder.append("\"MessageName\": \"StrikeRulesGroup\",\n");
        if (hasStrikeRuleID())
        {
            indent(builder, level);
            builder.append("\"StrikeRuleID\": \"");
            appendBuffer(builder, strikeRuleID, strikeRuleIDOffset, strikeRuleIDLength);
            builder.append("\",\n");
        }

        if (hasStartStrikePxRange())
        {
            indent(builder, level);
            builder.append("\"StartStrikePxRange\": \"");
            startStrikePxRange.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasEndStrikePxRange())
        {
            indent(builder, level);
            builder.append("\"EndStrikePxRange\": \"");
            endStrikePxRange.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasStrikeIncrement())
        {
            indent(builder, level);
            builder.append("\"StrikeIncrement\": \"");
            strikeIncrement.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasStrikeExerciseStyle())
        {
            indent(builder, level);
            builder.append("\"StrikeExerciseStyle\": \"");
            builder.append(strikeExerciseStyle);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"MaturityRules\": ");
    maturityRules.appendTo(builder, level + 1);
    builder.append("\n");
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public StrikeRulesGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((StrikeRulesGroupEncoder)encoder);
    }

    public StrikeRulesGroupEncoder copyTo(final StrikeRulesGroupEncoder encoder)
    {
        encoder.reset();
        if (hasStrikeRuleID())
        {
            encoder.strikeRuleIDAsCopy(strikeRuleID.byteArray(), 0, strikeRuleIDLength);
        }

        if (hasStartStrikePxRange())
        {
            encoder.startStrikePxRange(this.startStrikePxRange());
        }

        if (hasEndStrikePxRange())
        {
            encoder.endStrikePxRange(this.endStrikePxRange());
        }

        if (hasStrikeIncrement())
        {
            encoder.strikeIncrement(this.strikeIncrement());
        }

        if (hasStrikeExerciseStyle())
        {
            encoder.strikeExerciseStyle(this.strikeExerciseStyle());
        }


        maturityRules.copyTo(encoder.maturityRules());        return encoder;
    }

}
    private int noStrikeRulesGroupCounter;

    private boolean hasNoStrikeRulesGroupCounter;

    public boolean hasNoStrikeRulesGroupCounter()
    {
        return hasNoStrikeRulesGroupCounter;
    }

    public StrikeRulesEncoder noStrikeRulesGroupCounter(int value)
    {
        noStrikeRulesGroupCounter = value;
        hasNoStrikeRulesGroupCounter = true;
        return this;
    }

    public int noStrikeRulesGroupCounter()
    {
        return noStrikeRulesGroupCounter;
    }


    private StrikeRulesGroupEncoder strikeRulesGroup = null;

    public StrikeRulesGroupEncoder strikeRulesGroup(final int numberOfElements)
    {
        hasNoStrikeRulesGroupCounter = true;
        noStrikeRulesGroupCounter = numberOfElements;
        if (strikeRulesGroup == null)
        {
            strikeRulesGroup = new StrikeRulesGroupEncoder();
        }
        return strikeRulesGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoStrikeRulesGroupCounter)
        {
            buffer.putBytes(position, noStrikeRulesGroupCounterHeader, 0, noStrikeRulesGroupCounterHeaderLength);
            position += noStrikeRulesGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noStrikeRulesGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (strikeRulesGroup != null)
        {
            position += strikeRulesGroup.encode(buffer, position, noStrikeRulesGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetStrikeRulesGroup();
    }

    public void resetStrikeRulesGroup()
    {
        if (strikeRulesGroup != null)
        {
            strikeRulesGroup.reset();
        }
        noStrikeRulesGroupCounter = 0;
        hasNoStrikeRulesGroupCounter = false;
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
        builder.append("\"MessageName\": \"StrikeRules\",\n");
        if (hasNoStrikeRulesGroupCounter)
        {
            indent(builder, level);
            builder.append("\"StrikeRulesGroup\": [\n");
            final int noStrikeRulesGroupCounter = this.noStrikeRulesGroupCounter;
            StrikeRulesGroupEncoder strikeRulesGroup = this.strikeRulesGroup;
            for (int i = 0; i < noStrikeRulesGroupCounter; i++)
            {
                indent(builder, level);
                strikeRulesGroup.appendTo(builder, level + 1);
                if (i < (noStrikeRulesGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                strikeRulesGroup = strikeRulesGroup.next();
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
    public StrikeRulesEncoder copyTo(final Encoder encoder)
    {
        return copyTo((StrikeRulesEncoder)encoder);
    }

    public StrikeRulesEncoder copyTo(final StrikeRulesEncoder encoder)
    {
        encoder.reset();
        if (hasNoStrikeRulesGroupCounter)
        {
            final int size = this.noStrikeRulesGroupCounter;
            StrikeRulesGroupEncoder strikeRulesGroup = this.strikeRulesGroup;
            StrikeRulesGroupEncoder strikeRulesGroupEncoder = encoder.strikeRulesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (strikeRulesGroup != null)
                {
                    strikeRulesGroup.copyTo(strikeRulesGroupEncoder);
                    strikeRulesGroup = strikeRulesGroup.next();
                    strikeRulesGroupEncoder = strikeRulesGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
