/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44.builder;

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
import com.swiftalgo.ms.codecs.fix44.*;


public class DiscretionInstructionsEncoder
{
    private static final int discretionInstHeaderLength = 4;
    private static final byte[] discretionInstHeader = new byte[] {51, 56, 56, (byte) '='};

    private static final int discretionOffsetValueHeaderLength = 4;
    private static final byte[] discretionOffsetValueHeader = new byte[] {51, 56, 57, (byte) '='};

    private static final int discretionMoveTypeHeaderLength = 4;
    private static final byte[] discretionMoveTypeHeader = new byte[] {56, 52, 49, (byte) '='};

    private static final int discretionOffsetTypeHeaderLength = 4;
    private static final byte[] discretionOffsetTypeHeader = new byte[] {56, 52, 50, (byte) '='};

    private static final int discretionLimitTypeHeaderLength = 4;
    private static final byte[] discretionLimitTypeHeader = new byte[] {56, 52, 51, (byte) '='};

    private static final int discretionRoundDirectionHeaderLength = 4;
    private static final byte[] discretionRoundDirectionHeader = new byte[] {56, 52, 52, (byte) '='};

    private static final int discretionScopeHeaderLength = 4;
    private static final byte[] discretionScopeHeader = new byte[] {56, 52, 54, (byte) '='};

    private char discretionInst;

    private boolean hasDiscretionInst;

    public boolean hasDiscretionInst()
    {
        return hasDiscretionInst;
    }

    public DiscretionInstructionsEncoder discretionInst(char value)
    {
        discretionInst = value;
        hasDiscretionInst = true;
        return this;
    }

    public char discretionInst()
    {
        return discretionInst;
    }

    public DiscretionInstructionsEncoder discretionInst(DiscretionInst value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == DiscretionInst.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: discretionInst Value: " + value );
            }
            if (value == DiscretionInst.NULL_VAL)
            {
                return this;
            }
        }
        return discretionInst(value.representation());
    }

    private final DecimalFloat discretionOffsetValue = new DecimalFloat();

    private boolean hasDiscretionOffsetValue;

    public boolean hasDiscretionOffsetValue()
    {
        return hasDiscretionOffsetValue;
    }

    public DiscretionInstructionsEncoder discretionOffsetValue(DecimalFloat value)
    {
        discretionOffsetValue.set(value);
        hasDiscretionOffsetValue = true;
        return this;
    }

    public DiscretionInstructionsEncoder discretionOffsetValue(long value, int scale)
    {
        discretionOffsetValue.set(value, scale);
        hasDiscretionOffsetValue = true;
        return this;
    }

    public DecimalFloat discretionOffsetValue()
    {
        return discretionOffsetValue;
    }

    private int discretionMoveType;

    private boolean hasDiscretionMoveType;

    public boolean hasDiscretionMoveType()
    {
        return hasDiscretionMoveType;
    }

    public DiscretionInstructionsEncoder discretionMoveType(int value)
    {
        discretionMoveType = value;
        hasDiscretionMoveType = true;
        return this;
    }

    public int discretionMoveType()
    {
        return discretionMoveType;
    }

    public DiscretionInstructionsEncoder discretionMoveType(DiscretionMoveType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == DiscretionMoveType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: discretionMoveType Value: " + value );
            }
            if (value == DiscretionMoveType.NULL_VAL)
            {
                return this;
            }
        }
        return discretionMoveType(value.representation());
    }

    private int discretionOffsetType;

    private boolean hasDiscretionOffsetType;

    public boolean hasDiscretionOffsetType()
    {
        return hasDiscretionOffsetType;
    }

    public DiscretionInstructionsEncoder discretionOffsetType(int value)
    {
        discretionOffsetType = value;
        hasDiscretionOffsetType = true;
        return this;
    }

    public int discretionOffsetType()
    {
        return discretionOffsetType;
    }

    public DiscretionInstructionsEncoder discretionOffsetType(DiscretionOffsetType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == DiscretionOffsetType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: discretionOffsetType Value: " + value );
            }
            if (value == DiscretionOffsetType.NULL_VAL)
            {
                return this;
            }
        }
        return discretionOffsetType(value.representation());
    }

    private int discretionLimitType;

    private boolean hasDiscretionLimitType;

    public boolean hasDiscretionLimitType()
    {
        return hasDiscretionLimitType;
    }

    public DiscretionInstructionsEncoder discretionLimitType(int value)
    {
        discretionLimitType = value;
        hasDiscretionLimitType = true;
        return this;
    }

    public int discretionLimitType()
    {
        return discretionLimitType;
    }

    public DiscretionInstructionsEncoder discretionLimitType(DiscretionLimitType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == DiscretionLimitType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: discretionLimitType Value: " + value );
            }
            if (value == DiscretionLimitType.NULL_VAL)
            {
                return this;
            }
        }
        return discretionLimitType(value.representation());
    }

    private int discretionRoundDirection;

    private boolean hasDiscretionRoundDirection;

    public boolean hasDiscretionRoundDirection()
    {
        return hasDiscretionRoundDirection;
    }

    public DiscretionInstructionsEncoder discretionRoundDirection(int value)
    {
        discretionRoundDirection = value;
        hasDiscretionRoundDirection = true;
        return this;
    }

    public int discretionRoundDirection()
    {
        return discretionRoundDirection;
    }

    public DiscretionInstructionsEncoder discretionRoundDirection(DiscretionRoundDirection value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == DiscretionRoundDirection.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: discretionRoundDirection Value: " + value );
            }
            if (value == DiscretionRoundDirection.NULL_VAL)
            {
                return this;
            }
        }
        return discretionRoundDirection(value.representation());
    }

    private int discretionScope;

    private boolean hasDiscretionScope;

    public boolean hasDiscretionScope()
    {
        return hasDiscretionScope;
    }

    public DiscretionInstructionsEncoder discretionScope(int value)
    {
        discretionScope = value;
        hasDiscretionScope = true;
        return this;
    }

    public int discretionScope()
    {
        return discretionScope;
    }

    public DiscretionInstructionsEncoder discretionScope(DiscretionScope value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == DiscretionScope.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: discretionScope Value: " + value );
            }
            if (value == DiscretionScope.NULL_VAL)
            {
                return this;
            }
        }
        return discretionScope(value.representation());
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasDiscretionInst)
        {
            buffer.putBytes(position, discretionInstHeader, 0, discretionInstHeaderLength);
            position += discretionInstHeaderLength;
            position += buffer.putCharAscii(position, discretionInst);
            buffer.putSeparator(position);
            position++;
        }

        if (hasDiscretionOffsetValue)
        {
            buffer.putBytes(position, discretionOffsetValueHeader, 0, discretionOffsetValueHeaderLength);
            position += discretionOffsetValueHeaderLength;
            position += buffer.putFloatAscii(position, discretionOffsetValue);
            buffer.putSeparator(position);
            position++;
        }

        if (hasDiscretionMoveType)
        {
            buffer.putBytes(position, discretionMoveTypeHeader, 0, discretionMoveTypeHeaderLength);
            position += discretionMoveTypeHeaderLength;
            position += buffer.putIntAscii(position, discretionMoveType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasDiscretionOffsetType)
        {
            buffer.putBytes(position, discretionOffsetTypeHeader, 0, discretionOffsetTypeHeaderLength);
            position += discretionOffsetTypeHeaderLength;
            position += buffer.putIntAscii(position, discretionOffsetType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasDiscretionLimitType)
        {
            buffer.putBytes(position, discretionLimitTypeHeader, 0, discretionLimitTypeHeaderLength);
            position += discretionLimitTypeHeaderLength;
            position += buffer.putIntAscii(position, discretionLimitType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasDiscretionRoundDirection)
        {
            buffer.putBytes(position, discretionRoundDirectionHeader, 0, discretionRoundDirectionHeaderLength);
            position += discretionRoundDirectionHeaderLength;
            position += buffer.putIntAscii(position, discretionRoundDirection);
            buffer.putSeparator(position);
            position++;
        }

        if (hasDiscretionScope)
        {
            buffer.putBytes(position, discretionScopeHeader, 0, discretionScopeHeaderLength);
            position += discretionScopeHeaderLength;
            position += buffer.putIntAscii(position, discretionScope);
            buffer.putSeparator(position);
            position++;
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetDiscretionInst();
        this.resetDiscretionOffsetValue();
        this.resetDiscretionMoveType();
        this.resetDiscretionOffsetType();
        this.resetDiscretionLimitType();
        this.resetDiscretionRoundDirection();
        this.resetDiscretionScope();
    }

    public void resetDiscretionInst()
    {
        hasDiscretionInst = false;
    }

    public void resetDiscretionOffsetValue()
    {
        hasDiscretionOffsetValue = false;
    }

    public void resetDiscretionMoveType()
    {
        hasDiscretionMoveType = false;
    }

    public void resetDiscretionOffsetType()
    {
        hasDiscretionOffsetType = false;
    }

    public void resetDiscretionLimitType()
    {
        hasDiscretionLimitType = false;
    }

    public void resetDiscretionRoundDirection()
    {
        hasDiscretionRoundDirection = false;
    }

    public void resetDiscretionScope()
    {
        hasDiscretionScope = false;
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
        builder.append("\"MessageName\": \"DiscretionInstructions\",\n");
        if (hasDiscretionInst())
        {
            indent(builder, level);
            builder.append("\"DiscretionInst\": \"");
            builder.append(discretionInst);
            builder.append("\",\n");
        }

        if (hasDiscretionOffsetValue())
        {
            indent(builder, level);
            builder.append("\"DiscretionOffsetValue\": \"");
            discretionOffsetValue.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasDiscretionMoveType())
        {
            indent(builder, level);
            builder.append("\"DiscretionMoveType\": \"");
            builder.append(discretionMoveType);
            builder.append("\",\n");
        }

        if (hasDiscretionOffsetType())
        {
            indent(builder, level);
            builder.append("\"DiscretionOffsetType\": \"");
            builder.append(discretionOffsetType);
            builder.append("\",\n");
        }

        if (hasDiscretionLimitType())
        {
            indent(builder, level);
            builder.append("\"DiscretionLimitType\": \"");
            builder.append(discretionLimitType);
            builder.append("\",\n");
        }

        if (hasDiscretionRoundDirection())
        {
            indent(builder, level);
            builder.append("\"DiscretionRoundDirection\": \"");
            builder.append(discretionRoundDirection);
            builder.append("\",\n");
        }

        if (hasDiscretionScope())
        {
            indent(builder, level);
            builder.append("\"DiscretionScope\": \"");
            builder.append(discretionScope);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public DiscretionInstructionsEncoder copyTo(final Encoder encoder)
    {
        return copyTo((DiscretionInstructionsEncoder)encoder);
    }

    public DiscretionInstructionsEncoder copyTo(final DiscretionInstructionsEncoder encoder)
    {
        encoder.reset();
        if (hasDiscretionInst())
        {
            encoder.discretionInst(this.discretionInst());
        }

        if (hasDiscretionOffsetValue())
        {
            encoder.discretionOffsetValue(this.discretionOffsetValue());
        }

        if (hasDiscretionMoveType())
        {
            encoder.discretionMoveType(this.discretionMoveType());
        }

        if (hasDiscretionOffsetType())
        {
            encoder.discretionOffsetType(this.discretionOffsetType());
        }

        if (hasDiscretionLimitType())
        {
            encoder.discretionLimitType(this.discretionLimitType());
        }

        if (hasDiscretionRoundDirection())
        {
            encoder.discretionRoundDirection(this.discretionRoundDirection());
        }

        if (hasDiscretionScope())
        {
            encoder.discretionScope(this.discretionScope());
        }
        return encoder;
    }

}
