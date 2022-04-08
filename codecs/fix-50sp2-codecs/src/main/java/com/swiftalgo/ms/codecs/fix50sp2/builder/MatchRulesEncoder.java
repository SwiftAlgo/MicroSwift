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


public class MatchRulesEncoder
{
    private static final int noMatchRulesGroupCounterHeaderLength = 5;
    private static final byte[] noMatchRulesGroupCounterHeader = new byte[] {49, 50, 51, 53, (byte) '='};



public static class MatchRulesGroupEncoder
{
    private MatchRulesGroupEncoder next = null;

    public MatchRulesGroupEncoder next()
    {
        if (next == null)
        {
            next = new MatchRulesGroupEncoder();
        }
        return next;
    }

    private static final int matchAlgorithmHeaderLength = 5;
    private static final byte[] matchAlgorithmHeader = new byte[] {49, 49, 52, 50, (byte) '='};

    private static final int matchTypeHeaderLength = 4;
    private static final byte[] matchTypeHeader = new byte[] {53, 55, 52, (byte) '='};

    private final MutableDirectBuffer matchAlgorithm = new UnsafeBuffer();

    private int matchAlgorithmOffset = 0;

    private int matchAlgorithmLength = 0;

    public MatchRulesGroupEncoder matchAlgorithm(final DirectBuffer value, final int offset, final int length)
    {
        matchAlgorithm.wrap(value);
        matchAlgorithmOffset = offset;
        matchAlgorithmLength = length;
        return this;
    }

    public MatchRulesGroupEncoder matchAlgorithm(final DirectBuffer value, final int length)
    {
        return matchAlgorithm(value, 0, length);
    }

    public MatchRulesGroupEncoder matchAlgorithm(final DirectBuffer value)
    {
        return matchAlgorithm(value, 0, value.capacity());
    }

    public MatchRulesGroupEncoder matchAlgorithm(final byte[] value, final int offset, final int length)
    {
        matchAlgorithm.wrap(value);
        matchAlgorithmOffset = offset;
        matchAlgorithmLength = length;
        return this;
    }

    public MatchRulesGroupEncoder matchAlgorithmAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(matchAlgorithm, value, offset, length);
        matchAlgorithmOffset = offset;
        matchAlgorithmLength = length;
        return this;
    }

    public MatchRulesGroupEncoder matchAlgorithm(final byte[] value, final int length)
    {
        return matchAlgorithm(value, 0, length);
    }

    public MatchRulesGroupEncoder matchAlgorithm(final byte[] value)
    {
        return matchAlgorithm(value, 0, value.length);
    }

    public boolean hasMatchAlgorithm()
    {
        return matchAlgorithmLength > 0;
    }

    public MutableDirectBuffer matchAlgorithm()
    {
        return matchAlgorithm;
    }

    public String matchAlgorithmAsString()
    {
        return matchAlgorithm.getStringWithoutLengthAscii(matchAlgorithmOffset, matchAlgorithmLength);
    }

    public MatchRulesGroupEncoder matchAlgorithm(final CharSequence value)
    {
        toBytes(value, matchAlgorithm);
        matchAlgorithmOffset = 0;
        matchAlgorithmLength = value.length();
        return this;
    }

    public MatchRulesGroupEncoder matchAlgorithm(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            matchAlgorithm.wrap(buffer);
            matchAlgorithmOffset = value.offset();
            matchAlgorithmLength = value.length();
        }
        return this;
    }

    public MatchRulesGroupEncoder matchAlgorithm(final char[] value)
    {
        return matchAlgorithm(value, 0, value.length);
    }

    public MatchRulesGroupEncoder matchAlgorithm(final char[] value, final int length)
    {
        return matchAlgorithm(value, 0, length);
    }

    public MatchRulesGroupEncoder matchAlgorithm(final char[] value, final int offset, final int length)
    {
        toBytes(value, matchAlgorithm, offset, length);
        matchAlgorithmOffset = 0;
        matchAlgorithmLength = length;
        return this;
    }

    private final MutableDirectBuffer matchType = new UnsafeBuffer();

    private int matchTypeOffset = 0;

    private int matchTypeLength = 0;

    public MatchRulesGroupEncoder matchType(final DirectBuffer value, final int offset, final int length)
    {
        matchType.wrap(value);
        matchTypeOffset = offset;
        matchTypeLength = length;
        return this;
    }

    public MatchRulesGroupEncoder matchType(final DirectBuffer value, final int length)
    {
        return matchType(value, 0, length);
    }

    public MatchRulesGroupEncoder matchType(final DirectBuffer value)
    {
        return matchType(value, 0, value.capacity());
    }

    public MatchRulesGroupEncoder matchType(final byte[] value, final int offset, final int length)
    {
        matchType.wrap(value);
        matchTypeOffset = offset;
        matchTypeLength = length;
        return this;
    }

    public MatchRulesGroupEncoder matchTypeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(matchType, value, offset, length);
        matchTypeOffset = offset;
        matchTypeLength = length;
        return this;
    }

    public MatchRulesGroupEncoder matchType(final byte[] value, final int length)
    {
        return matchType(value, 0, length);
    }

    public MatchRulesGroupEncoder matchType(final byte[] value)
    {
        return matchType(value, 0, value.length);
    }

    public boolean hasMatchType()
    {
        return matchTypeLength > 0;
    }

    public MutableDirectBuffer matchType()
    {
        return matchType;
    }

    public String matchTypeAsString()
    {
        return matchType.getStringWithoutLengthAscii(matchTypeOffset, matchTypeLength);
    }

    public MatchRulesGroupEncoder matchType(final CharSequence value)
    {
        toBytes(value, matchType);
        matchTypeOffset = 0;
        matchTypeLength = value.length();
        return this;
    }

    public MatchRulesGroupEncoder matchType(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            matchType.wrap(buffer);
            matchTypeOffset = value.offset();
            matchTypeLength = value.length();
        }
        return this;
    }

    public MatchRulesGroupEncoder matchType(final char[] value)
    {
        return matchType(value, 0, value.length);
    }

    public MatchRulesGroupEncoder matchType(final char[] value, final int length)
    {
        return matchType(value, 0, length);
    }

    public MatchRulesGroupEncoder matchType(final char[] value, final int offset, final int length)
    {
        toBytes(value, matchType, offset, length);
        matchTypeOffset = 0;
        matchTypeLength = length;
        return this;
    }

    public MatchRulesGroupEncoder matchType(MatchType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == MatchType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: matchType Value: " + value );
            }
            if (value == MatchType.NULL_VAL)
            {
                return this;
            }
        }
        return matchType(value.representation());
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (matchAlgorithmLength > 0)
        {
            buffer.putBytes(position, matchAlgorithmHeader, 0, matchAlgorithmHeaderLength);
            position += matchAlgorithmHeaderLength;
            buffer.putBytes(position, matchAlgorithm, matchAlgorithmOffset, matchAlgorithmLength);
            position += matchAlgorithmLength;
            buffer.putSeparator(position);
            position++;
        }

        if (matchTypeLength > 0)
        {
            buffer.putBytes(position, matchTypeHeader, 0, matchTypeHeaderLength);
            position += matchTypeHeaderLength;
            buffer.putBytes(position, matchType, matchTypeOffset, matchTypeLength);
            position += matchTypeLength;
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
        this.resetMatchAlgorithm();
        this.resetMatchType();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetMatchAlgorithm()
    {
        matchAlgorithmLength = 0;
    }

    public void resetMatchType()
    {
        matchTypeLength = 0;
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
        builder.append("\"MessageName\": \"MatchRulesGroup\",\n");
        if (hasMatchAlgorithm())
        {
            indent(builder, level);
            builder.append("\"MatchAlgorithm\": \"");
            appendBuffer(builder, matchAlgorithm, matchAlgorithmOffset, matchAlgorithmLength);
            builder.append("\",\n");
        }

        if (hasMatchType())
        {
            indent(builder, level);
            builder.append("\"MatchType\": \"");
            appendBuffer(builder, matchType, matchTypeOffset, matchTypeLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public MatchRulesGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((MatchRulesGroupEncoder)encoder);
    }

    public MatchRulesGroupEncoder copyTo(final MatchRulesGroupEncoder encoder)
    {
        encoder.reset();
        if (hasMatchAlgorithm())
        {
            encoder.matchAlgorithmAsCopy(matchAlgorithm.byteArray(), 0, matchAlgorithmLength);
        }

        if (hasMatchType())
        {
            encoder.matchTypeAsCopy(matchType.byteArray(), 0, matchTypeLength);
        }
        return encoder;
    }

}
    private int noMatchRulesGroupCounter;

    private boolean hasNoMatchRulesGroupCounter;

    public boolean hasNoMatchRulesGroupCounter()
    {
        return hasNoMatchRulesGroupCounter;
    }

    public MatchRulesEncoder noMatchRulesGroupCounter(int value)
    {
        noMatchRulesGroupCounter = value;
        hasNoMatchRulesGroupCounter = true;
        return this;
    }

    public int noMatchRulesGroupCounter()
    {
        return noMatchRulesGroupCounter;
    }


    private MatchRulesGroupEncoder matchRulesGroup = null;

    public MatchRulesGroupEncoder matchRulesGroup(final int numberOfElements)
    {
        hasNoMatchRulesGroupCounter = true;
        noMatchRulesGroupCounter = numberOfElements;
        if (matchRulesGroup == null)
        {
            matchRulesGroup = new MatchRulesGroupEncoder();
        }
        return matchRulesGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoMatchRulesGroupCounter)
        {
            buffer.putBytes(position, noMatchRulesGroupCounterHeader, 0, noMatchRulesGroupCounterHeaderLength);
            position += noMatchRulesGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noMatchRulesGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (matchRulesGroup != null)
        {
            position += matchRulesGroup.encode(buffer, position, noMatchRulesGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetMatchRulesGroup();
    }

    public void resetMatchRulesGroup()
    {
        if (matchRulesGroup != null)
        {
            matchRulesGroup.reset();
        }
        noMatchRulesGroupCounter = 0;
        hasNoMatchRulesGroupCounter = false;
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
        builder.append("\"MessageName\": \"MatchRules\",\n");
        if (hasNoMatchRulesGroupCounter)
        {
            indent(builder, level);
            builder.append("\"MatchRulesGroup\": [\n");
            final int noMatchRulesGroupCounter = this.noMatchRulesGroupCounter;
            MatchRulesGroupEncoder matchRulesGroup = this.matchRulesGroup;
            for (int i = 0; i < noMatchRulesGroupCounter; i++)
            {
                indent(builder, level);
                matchRulesGroup.appendTo(builder, level + 1);
                if (i < (noMatchRulesGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                matchRulesGroup = matchRulesGroup.next();
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
    public MatchRulesEncoder copyTo(final Encoder encoder)
    {
        return copyTo((MatchRulesEncoder)encoder);
    }

    public MatchRulesEncoder copyTo(final MatchRulesEncoder encoder)
    {
        encoder.reset();
        if (hasNoMatchRulesGroupCounter)
        {
            final int size = this.noMatchRulesGroupCounter;
            MatchRulesGroupEncoder matchRulesGroup = this.matchRulesGroup;
            MatchRulesGroupEncoder matchRulesGroupEncoder = encoder.matchRulesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (matchRulesGroup != null)
                {
                    matchRulesGroup.copyTo(matchRulesGroupEncoder);
                    matchRulesGroup = matchRulesGroup.next();
                    matchRulesGroupEncoder = matchRulesGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
