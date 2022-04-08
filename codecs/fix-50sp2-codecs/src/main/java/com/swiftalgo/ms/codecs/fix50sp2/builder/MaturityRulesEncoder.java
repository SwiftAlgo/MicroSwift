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


public class MaturityRulesEncoder
{
    private static final int noMaturityRulesGroupCounterHeaderLength = 5;
    private static final byte[] noMaturityRulesGroupCounterHeader = new byte[] {49, 50, 51, 54, (byte) '='};



public static class MaturityRulesGroupEncoder
{
    private MaturityRulesGroupEncoder next = null;

    public MaturityRulesGroupEncoder next()
    {
        if (next == null)
        {
            next = new MaturityRulesGroupEncoder();
        }
        return next;
    }

    private static final int maturityRuleIDHeaderLength = 5;
    private static final byte[] maturityRuleIDHeader = new byte[] {49, 50, 50, 50, (byte) '='};

    private static final int maturityMonthYearFormatHeaderLength = 5;
    private static final byte[] maturityMonthYearFormatHeader = new byte[] {49, 51, 48, 51, (byte) '='};

    private static final int maturityMonthYearIncrementUnitsHeaderLength = 5;
    private static final byte[] maturityMonthYearIncrementUnitsHeader = new byte[] {49, 51, 48, 50, (byte) '='};

    private static final int startMaturityMonthYearHeaderLength = 5;
    private static final byte[] startMaturityMonthYearHeader = new byte[] {49, 50, 52, 49, (byte) '='};

    private static final int endMaturityMonthYearHeaderLength = 5;
    private static final byte[] endMaturityMonthYearHeader = new byte[] {49, 50, 50, 54, (byte) '='};

    private static final int maturityMonthYearIncrementHeaderLength = 5;
    private static final byte[] maturityMonthYearIncrementHeader = new byte[] {49, 50, 50, 57, (byte) '='};

    private final MutableDirectBuffer maturityRuleID = new UnsafeBuffer();

    private int maturityRuleIDOffset = 0;

    private int maturityRuleIDLength = 0;

    public MaturityRulesGroupEncoder maturityRuleID(final DirectBuffer value, final int offset, final int length)
    {
        maturityRuleID.wrap(value);
        maturityRuleIDOffset = offset;
        maturityRuleIDLength = length;
        return this;
    }

    public MaturityRulesGroupEncoder maturityRuleID(final DirectBuffer value, final int length)
    {
        return maturityRuleID(value, 0, length);
    }

    public MaturityRulesGroupEncoder maturityRuleID(final DirectBuffer value)
    {
        return maturityRuleID(value, 0, value.capacity());
    }

    public MaturityRulesGroupEncoder maturityRuleID(final byte[] value, final int offset, final int length)
    {
        maturityRuleID.wrap(value);
        maturityRuleIDOffset = offset;
        maturityRuleIDLength = length;
        return this;
    }

    public MaturityRulesGroupEncoder maturityRuleIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(maturityRuleID, value, offset, length);
        maturityRuleIDOffset = offset;
        maturityRuleIDLength = length;
        return this;
    }

    public MaturityRulesGroupEncoder maturityRuleID(final byte[] value, final int length)
    {
        return maturityRuleID(value, 0, length);
    }

    public MaturityRulesGroupEncoder maturityRuleID(final byte[] value)
    {
        return maturityRuleID(value, 0, value.length);
    }

    public boolean hasMaturityRuleID()
    {
        return maturityRuleIDLength > 0;
    }

    public MutableDirectBuffer maturityRuleID()
    {
        return maturityRuleID;
    }

    public String maturityRuleIDAsString()
    {
        return maturityRuleID.getStringWithoutLengthAscii(maturityRuleIDOffset, maturityRuleIDLength);
    }

    public MaturityRulesGroupEncoder maturityRuleID(final CharSequence value)
    {
        toBytes(value, maturityRuleID);
        maturityRuleIDOffset = 0;
        maturityRuleIDLength = value.length();
        return this;
    }

    public MaturityRulesGroupEncoder maturityRuleID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            maturityRuleID.wrap(buffer);
            maturityRuleIDOffset = value.offset();
            maturityRuleIDLength = value.length();
        }
        return this;
    }

    public MaturityRulesGroupEncoder maturityRuleID(final char[] value)
    {
        return maturityRuleID(value, 0, value.length);
    }

    public MaturityRulesGroupEncoder maturityRuleID(final char[] value, final int length)
    {
        return maturityRuleID(value, 0, length);
    }

    public MaturityRulesGroupEncoder maturityRuleID(final char[] value, final int offset, final int length)
    {
        toBytes(value, maturityRuleID, offset, length);
        maturityRuleIDOffset = 0;
        maturityRuleIDLength = length;
        return this;
    }

    private int maturityMonthYearFormat;

    private boolean hasMaturityMonthYearFormat;

    public boolean hasMaturityMonthYearFormat()
    {
        return hasMaturityMonthYearFormat;
    }

    public MaturityRulesGroupEncoder maturityMonthYearFormat(int value)
    {
        maturityMonthYearFormat = value;
        hasMaturityMonthYearFormat = true;
        return this;
    }

    public int maturityMonthYearFormat()
    {
        return maturityMonthYearFormat;
    }

    public MaturityRulesGroupEncoder maturityMonthYearFormat(MaturityMonthYearFormat value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == MaturityMonthYearFormat.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: maturityMonthYearFormat Value: " + value );
            }
            if (value == MaturityMonthYearFormat.NULL_VAL)
            {
                return this;
            }
        }
        return maturityMonthYearFormat(value.representation());
    }

    private int maturityMonthYearIncrementUnits;

    private boolean hasMaturityMonthYearIncrementUnits;

    public boolean hasMaturityMonthYearIncrementUnits()
    {
        return hasMaturityMonthYearIncrementUnits;
    }

    public MaturityRulesGroupEncoder maturityMonthYearIncrementUnits(int value)
    {
        maturityMonthYearIncrementUnits = value;
        hasMaturityMonthYearIncrementUnits = true;
        return this;
    }

    public int maturityMonthYearIncrementUnits()
    {
        return maturityMonthYearIncrementUnits;
    }

    public MaturityRulesGroupEncoder maturityMonthYearIncrementUnits(MaturityMonthYearIncrementUnits value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == MaturityMonthYearIncrementUnits.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: maturityMonthYearIncrementUnits Value: " + value );
            }
            if (value == MaturityMonthYearIncrementUnits.NULL_VAL)
            {
                return this;
            }
        }
        return maturityMonthYearIncrementUnits(value.representation());
    }

    private final MutableDirectBuffer startMaturityMonthYear = new UnsafeBuffer();

    private int startMaturityMonthYearOffset = 0;

    private int startMaturityMonthYearLength = 0;

    public MaturityRulesGroupEncoder startMaturityMonthYear(final DirectBuffer value, final int offset, final int length)
    {
        startMaturityMonthYear.wrap(value);
        startMaturityMonthYearOffset = offset;
        startMaturityMonthYearLength = length;
        return this;
    }

    public MaturityRulesGroupEncoder startMaturityMonthYear(final DirectBuffer value, final int length)
    {
        return startMaturityMonthYear(value, 0, length);
    }

    public MaturityRulesGroupEncoder startMaturityMonthYear(final DirectBuffer value)
    {
        return startMaturityMonthYear(value, 0, value.capacity());
    }

    public MaturityRulesGroupEncoder startMaturityMonthYear(final byte[] value, final int offset, final int length)
    {
        startMaturityMonthYear.wrap(value);
        startMaturityMonthYearOffset = offset;
        startMaturityMonthYearLength = length;
        return this;
    }

    public MaturityRulesGroupEncoder startMaturityMonthYearAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(startMaturityMonthYear, value, offset, length);
        startMaturityMonthYearOffset = offset;
        startMaturityMonthYearLength = length;
        return this;
    }

    public MaturityRulesGroupEncoder startMaturityMonthYear(final byte[] value, final int length)
    {
        return startMaturityMonthYear(value, 0, length);
    }

    public MaturityRulesGroupEncoder startMaturityMonthYear(final byte[] value)
    {
        return startMaturityMonthYear(value, 0, value.length);
    }

    public boolean hasStartMaturityMonthYear()
    {
        return startMaturityMonthYearLength > 0;
    }

    public MutableDirectBuffer startMaturityMonthYear()
    {
        return startMaturityMonthYear;
    }

    public String startMaturityMonthYearAsString()
    {
        return startMaturityMonthYear.getStringWithoutLengthAscii(startMaturityMonthYearOffset, startMaturityMonthYearLength);
    }

    private final MutableDirectBuffer endMaturityMonthYear = new UnsafeBuffer();

    private int endMaturityMonthYearOffset = 0;

    private int endMaturityMonthYearLength = 0;

    public MaturityRulesGroupEncoder endMaturityMonthYear(final DirectBuffer value, final int offset, final int length)
    {
        endMaturityMonthYear.wrap(value);
        endMaturityMonthYearOffset = offset;
        endMaturityMonthYearLength = length;
        return this;
    }

    public MaturityRulesGroupEncoder endMaturityMonthYear(final DirectBuffer value, final int length)
    {
        return endMaturityMonthYear(value, 0, length);
    }

    public MaturityRulesGroupEncoder endMaturityMonthYear(final DirectBuffer value)
    {
        return endMaturityMonthYear(value, 0, value.capacity());
    }

    public MaturityRulesGroupEncoder endMaturityMonthYear(final byte[] value, final int offset, final int length)
    {
        endMaturityMonthYear.wrap(value);
        endMaturityMonthYearOffset = offset;
        endMaturityMonthYearLength = length;
        return this;
    }

    public MaturityRulesGroupEncoder endMaturityMonthYearAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(endMaturityMonthYear, value, offset, length);
        endMaturityMonthYearOffset = offset;
        endMaturityMonthYearLength = length;
        return this;
    }

    public MaturityRulesGroupEncoder endMaturityMonthYear(final byte[] value, final int length)
    {
        return endMaturityMonthYear(value, 0, length);
    }

    public MaturityRulesGroupEncoder endMaturityMonthYear(final byte[] value)
    {
        return endMaturityMonthYear(value, 0, value.length);
    }

    public boolean hasEndMaturityMonthYear()
    {
        return endMaturityMonthYearLength > 0;
    }

    public MutableDirectBuffer endMaturityMonthYear()
    {
        return endMaturityMonthYear;
    }

    public String endMaturityMonthYearAsString()
    {
        return endMaturityMonthYear.getStringWithoutLengthAscii(endMaturityMonthYearOffset, endMaturityMonthYearLength);
    }

    private int maturityMonthYearIncrement;

    private boolean hasMaturityMonthYearIncrement;

    public boolean hasMaturityMonthYearIncrement()
    {
        return hasMaturityMonthYearIncrement;
    }

    public MaturityRulesGroupEncoder maturityMonthYearIncrement(int value)
    {
        maturityMonthYearIncrement = value;
        hasMaturityMonthYearIncrement = true;
        return this;
    }

    public int maturityMonthYearIncrement()
    {
        return maturityMonthYearIncrement;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (maturityRuleIDLength > 0)
        {
            buffer.putBytes(position, maturityRuleIDHeader, 0, maturityRuleIDHeaderLength);
            position += maturityRuleIDHeaderLength;
            buffer.putBytes(position, maturityRuleID, maturityRuleIDOffset, maturityRuleIDLength);
            position += maturityRuleIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasMaturityMonthYearFormat)
        {
            buffer.putBytes(position, maturityMonthYearFormatHeader, 0, maturityMonthYearFormatHeaderLength);
            position += maturityMonthYearFormatHeaderLength;
            position += buffer.putIntAscii(position, maturityMonthYearFormat);
            buffer.putSeparator(position);
            position++;
        }

        if (hasMaturityMonthYearIncrementUnits)
        {
            buffer.putBytes(position, maturityMonthYearIncrementUnitsHeader, 0, maturityMonthYearIncrementUnitsHeaderLength);
            position += maturityMonthYearIncrementUnitsHeaderLength;
            position += buffer.putIntAscii(position, maturityMonthYearIncrementUnits);
            buffer.putSeparator(position);
            position++;
        }

        if (startMaturityMonthYearLength > 0)
        {
            buffer.putBytes(position, startMaturityMonthYearHeader, 0, startMaturityMonthYearHeaderLength);
            position += startMaturityMonthYearHeaderLength;
            buffer.putBytes(position, startMaturityMonthYear, startMaturityMonthYearOffset, startMaturityMonthYearLength);
            position += startMaturityMonthYearLength;
            buffer.putSeparator(position);
            position++;
        }

        if (endMaturityMonthYearLength > 0)
        {
            buffer.putBytes(position, endMaturityMonthYearHeader, 0, endMaturityMonthYearHeaderLength);
            position += endMaturityMonthYearHeaderLength;
            buffer.putBytes(position, endMaturityMonthYear, endMaturityMonthYearOffset, endMaturityMonthYearLength);
            position += endMaturityMonthYearLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasMaturityMonthYearIncrement)
        {
            buffer.putBytes(position, maturityMonthYearIncrementHeader, 0, maturityMonthYearIncrementHeaderLength);
            position += maturityMonthYearIncrementHeaderLength;
            position += buffer.putIntAscii(position, maturityMonthYearIncrement);
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
        this.resetMaturityRuleID();
        this.resetMaturityMonthYearFormat();
        this.resetMaturityMonthYearIncrementUnits();
        this.resetStartMaturityMonthYear();
        this.resetEndMaturityMonthYear();
        this.resetMaturityMonthYearIncrement();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetMaturityRuleID()
    {
        maturityRuleIDLength = 0;
    }

    public void resetMaturityMonthYearFormat()
    {
        hasMaturityMonthYearFormat = false;
    }

    public void resetMaturityMonthYearIncrementUnits()
    {
        hasMaturityMonthYearIncrementUnits = false;
    }

    public void resetStartMaturityMonthYear()
    {
        startMaturityMonthYearLength = 0;
    }

    public void resetEndMaturityMonthYear()
    {
        endMaturityMonthYearLength = 0;
    }

    public void resetMaturityMonthYearIncrement()
    {
        hasMaturityMonthYearIncrement = false;
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
        builder.append("\"MessageName\": \"MaturityRulesGroup\",\n");
        if (hasMaturityRuleID())
        {
            indent(builder, level);
            builder.append("\"MaturityRuleID\": \"");
            appendBuffer(builder, maturityRuleID, maturityRuleIDOffset, maturityRuleIDLength);
            builder.append("\",\n");
        }

        if (hasMaturityMonthYearFormat())
        {
            indent(builder, level);
            builder.append("\"MaturityMonthYearFormat\": \"");
            builder.append(maturityMonthYearFormat);
            builder.append("\",\n");
        }

        if (hasMaturityMonthYearIncrementUnits())
        {
            indent(builder, level);
            builder.append("\"MaturityMonthYearIncrementUnits\": \"");
            builder.append(maturityMonthYearIncrementUnits);
            builder.append("\",\n");
        }

        if (hasStartMaturityMonthYear())
        {
            indent(builder, level);
            builder.append("\"StartMaturityMonthYear\": \"");
            appendBuffer(builder, startMaturityMonthYear, startMaturityMonthYearOffset, startMaturityMonthYearLength);
            builder.append("\",\n");
        }

        if (hasEndMaturityMonthYear())
        {
            indent(builder, level);
            builder.append("\"EndMaturityMonthYear\": \"");
            appendBuffer(builder, endMaturityMonthYear, endMaturityMonthYearOffset, endMaturityMonthYearLength);
            builder.append("\",\n");
        }

        if (hasMaturityMonthYearIncrement())
        {
            indent(builder, level);
            builder.append("\"MaturityMonthYearIncrement\": \"");
            builder.append(maturityMonthYearIncrement);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public MaturityRulesGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((MaturityRulesGroupEncoder)encoder);
    }

    public MaturityRulesGroupEncoder copyTo(final MaturityRulesGroupEncoder encoder)
    {
        encoder.reset();
        if (hasMaturityRuleID())
        {
            encoder.maturityRuleIDAsCopy(maturityRuleID.byteArray(), 0, maturityRuleIDLength);
        }

        if (hasMaturityMonthYearFormat())
        {
            encoder.maturityMonthYearFormat(this.maturityMonthYearFormat());
        }

        if (hasMaturityMonthYearIncrementUnits())
        {
            encoder.maturityMonthYearIncrementUnits(this.maturityMonthYearIncrementUnits());
        }

        if (hasStartMaturityMonthYear())
        {
            encoder.startMaturityMonthYearAsCopy(startMaturityMonthYear.byteArray(), 0, startMaturityMonthYearLength);
        }

        if (hasEndMaturityMonthYear())
        {
            encoder.endMaturityMonthYearAsCopy(endMaturityMonthYear.byteArray(), 0, endMaturityMonthYearLength);
        }

        if (hasMaturityMonthYearIncrement())
        {
            encoder.maturityMonthYearIncrement(this.maturityMonthYearIncrement());
        }
        return encoder;
    }

}
    private int noMaturityRulesGroupCounter;

    private boolean hasNoMaturityRulesGroupCounter;

    public boolean hasNoMaturityRulesGroupCounter()
    {
        return hasNoMaturityRulesGroupCounter;
    }

    public MaturityRulesEncoder noMaturityRulesGroupCounter(int value)
    {
        noMaturityRulesGroupCounter = value;
        hasNoMaturityRulesGroupCounter = true;
        return this;
    }

    public int noMaturityRulesGroupCounter()
    {
        return noMaturityRulesGroupCounter;
    }


    private MaturityRulesGroupEncoder maturityRulesGroup = null;

    public MaturityRulesGroupEncoder maturityRulesGroup(final int numberOfElements)
    {
        hasNoMaturityRulesGroupCounter = true;
        noMaturityRulesGroupCounter = numberOfElements;
        if (maturityRulesGroup == null)
        {
            maturityRulesGroup = new MaturityRulesGroupEncoder();
        }
        return maturityRulesGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoMaturityRulesGroupCounter)
        {
            buffer.putBytes(position, noMaturityRulesGroupCounterHeader, 0, noMaturityRulesGroupCounterHeaderLength);
            position += noMaturityRulesGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noMaturityRulesGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (maturityRulesGroup != null)
        {
            position += maturityRulesGroup.encode(buffer, position, noMaturityRulesGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetMaturityRulesGroup();
    }

    public void resetMaturityRulesGroup()
    {
        if (maturityRulesGroup != null)
        {
            maturityRulesGroup.reset();
        }
        noMaturityRulesGroupCounter = 0;
        hasNoMaturityRulesGroupCounter = false;
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
        builder.append("\"MessageName\": \"MaturityRules\",\n");
        if (hasNoMaturityRulesGroupCounter)
        {
            indent(builder, level);
            builder.append("\"MaturityRulesGroup\": [\n");
            final int noMaturityRulesGroupCounter = this.noMaturityRulesGroupCounter;
            MaturityRulesGroupEncoder maturityRulesGroup = this.maturityRulesGroup;
            for (int i = 0; i < noMaturityRulesGroupCounter; i++)
            {
                indent(builder, level);
                maturityRulesGroup.appendTo(builder, level + 1);
                if (i < (noMaturityRulesGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                maturityRulesGroup = maturityRulesGroup.next();
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
    public MaturityRulesEncoder copyTo(final Encoder encoder)
    {
        return copyTo((MaturityRulesEncoder)encoder);
    }

    public MaturityRulesEncoder copyTo(final MaturityRulesEncoder encoder)
    {
        encoder.reset();
        if (hasNoMaturityRulesGroupCounter)
        {
            final int size = this.noMaturityRulesGroupCounter;
            MaturityRulesGroupEncoder maturityRulesGroup = this.maturityRulesGroup;
            MaturityRulesGroupEncoder maturityRulesGroupEncoder = encoder.maturityRulesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (maturityRulesGroup != null)
                {
                    maturityRulesGroup.copyTo(maturityRulesGroupEncoder);
                    maturityRulesGroup = maturityRulesGroup.next();
                    maturityRulesGroupEncoder = maturityRulesGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
