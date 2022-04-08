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


public class PegInstructionsEncoder
{
    private static final int pegOffsetValueHeaderLength = 4;
    private static final byte[] pegOffsetValueHeader = new byte[] {50, 49, 49, (byte) '='};

    private static final int pegMoveTypeHeaderLength = 4;
    private static final byte[] pegMoveTypeHeader = new byte[] {56, 51, 53, (byte) '='};

    private static final int pegOffsetTypeHeaderLength = 4;
    private static final byte[] pegOffsetTypeHeader = new byte[] {56, 51, 54, (byte) '='};

    private static final int pegLimitTypeHeaderLength = 4;
    private static final byte[] pegLimitTypeHeader = new byte[] {56, 51, 55, (byte) '='};

    private static final int pegRoundDirectionHeaderLength = 4;
    private static final byte[] pegRoundDirectionHeader = new byte[] {56, 51, 56, (byte) '='};

    private static final int pegScopeHeaderLength = 4;
    private static final byte[] pegScopeHeader = new byte[] {56, 52, 48, (byte) '='};

    private final DecimalFloat pegOffsetValue = new DecimalFloat();

    private boolean hasPegOffsetValue;

    public boolean hasPegOffsetValue()
    {
        return hasPegOffsetValue;
    }

    public PegInstructionsEncoder pegOffsetValue(DecimalFloat value)
    {
        pegOffsetValue.set(value);
        hasPegOffsetValue = true;
        return this;
    }

    public PegInstructionsEncoder pegOffsetValue(long value, int scale)
    {
        pegOffsetValue.set(value, scale);
        hasPegOffsetValue = true;
        return this;
    }

    public DecimalFloat pegOffsetValue()
    {
        return pegOffsetValue;
    }

    private int pegMoveType;

    private boolean hasPegMoveType;

    public boolean hasPegMoveType()
    {
        return hasPegMoveType;
    }

    public PegInstructionsEncoder pegMoveType(int value)
    {
        pegMoveType = value;
        hasPegMoveType = true;
        return this;
    }

    public int pegMoveType()
    {
        return pegMoveType;
    }

    public PegInstructionsEncoder pegMoveType(PegMoveType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == PegMoveType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: pegMoveType Value: " + value );
            }
            if (value == PegMoveType.NULL_VAL)
            {
                return this;
            }
        }
        return pegMoveType(value.representation());
    }

    private int pegOffsetType;

    private boolean hasPegOffsetType;

    public boolean hasPegOffsetType()
    {
        return hasPegOffsetType;
    }

    public PegInstructionsEncoder pegOffsetType(int value)
    {
        pegOffsetType = value;
        hasPegOffsetType = true;
        return this;
    }

    public int pegOffsetType()
    {
        return pegOffsetType;
    }

    public PegInstructionsEncoder pegOffsetType(PegOffsetType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == PegOffsetType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: pegOffsetType Value: " + value );
            }
            if (value == PegOffsetType.NULL_VAL)
            {
                return this;
            }
        }
        return pegOffsetType(value.representation());
    }

    private int pegLimitType;

    private boolean hasPegLimitType;

    public boolean hasPegLimitType()
    {
        return hasPegLimitType;
    }

    public PegInstructionsEncoder pegLimitType(int value)
    {
        pegLimitType = value;
        hasPegLimitType = true;
        return this;
    }

    public int pegLimitType()
    {
        return pegLimitType;
    }

    public PegInstructionsEncoder pegLimitType(PegLimitType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == PegLimitType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: pegLimitType Value: " + value );
            }
            if (value == PegLimitType.NULL_VAL)
            {
                return this;
            }
        }
        return pegLimitType(value.representation());
    }

    private int pegRoundDirection;

    private boolean hasPegRoundDirection;

    public boolean hasPegRoundDirection()
    {
        return hasPegRoundDirection;
    }

    public PegInstructionsEncoder pegRoundDirection(int value)
    {
        pegRoundDirection = value;
        hasPegRoundDirection = true;
        return this;
    }

    public int pegRoundDirection()
    {
        return pegRoundDirection;
    }

    public PegInstructionsEncoder pegRoundDirection(PegRoundDirection value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == PegRoundDirection.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: pegRoundDirection Value: " + value );
            }
            if (value == PegRoundDirection.NULL_VAL)
            {
                return this;
            }
        }
        return pegRoundDirection(value.representation());
    }

    private int pegScope;

    private boolean hasPegScope;

    public boolean hasPegScope()
    {
        return hasPegScope;
    }

    public PegInstructionsEncoder pegScope(int value)
    {
        pegScope = value;
        hasPegScope = true;
        return this;
    }

    public int pegScope()
    {
        return pegScope;
    }

    public PegInstructionsEncoder pegScope(PegScope value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == PegScope.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: pegScope Value: " + value );
            }
            if (value == PegScope.NULL_VAL)
            {
                return this;
            }
        }
        return pegScope(value.representation());
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasPegOffsetValue)
        {
            buffer.putBytes(position, pegOffsetValueHeader, 0, pegOffsetValueHeaderLength);
            position += pegOffsetValueHeaderLength;
            position += buffer.putFloatAscii(position, pegOffsetValue);
            buffer.putSeparator(position);
            position++;
        }

        if (hasPegMoveType)
        {
            buffer.putBytes(position, pegMoveTypeHeader, 0, pegMoveTypeHeaderLength);
            position += pegMoveTypeHeaderLength;
            position += buffer.putIntAscii(position, pegMoveType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasPegOffsetType)
        {
            buffer.putBytes(position, pegOffsetTypeHeader, 0, pegOffsetTypeHeaderLength);
            position += pegOffsetTypeHeaderLength;
            position += buffer.putIntAscii(position, pegOffsetType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasPegLimitType)
        {
            buffer.putBytes(position, pegLimitTypeHeader, 0, pegLimitTypeHeaderLength);
            position += pegLimitTypeHeaderLength;
            position += buffer.putIntAscii(position, pegLimitType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasPegRoundDirection)
        {
            buffer.putBytes(position, pegRoundDirectionHeader, 0, pegRoundDirectionHeaderLength);
            position += pegRoundDirectionHeaderLength;
            position += buffer.putIntAscii(position, pegRoundDirection);
            buffer.putSeparator(position);
            position++;
        }

        if (hasPegScope)
        {
            buffer.putBytes(position, pegScopeHeader, 0, pegScopeHeaderLength);
            position += pegScopeHeaderLength;
            position += buffer.putIntAscii(position, pegScope);
            buffer.putSeparator(position);
            position++;
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetPegOffsetValue();
        this.resetPegMoveType();
        this.resetPegOffsetType();
        this.resetPegLimitType();
        this.resetPegRoundDirection();
        this.resetPegScope();
    }

    public void resetPegOffsetValue()
    {
        hasPegOffsetValue = false;
    }

    public void resetPegMoveType()
    {
        hasPegMoveType = false;
    }

    public void resetPegOffsetType()
    {
        hasPegOffsetType = false;
    }

    public void resetPegLimitType()
    {
        hasPegLimitType = false;
    }

    public void resetPegRoundDirection()
    {
        hasPegRoundDirection = false;
    }

    public void resetPegScope()
    {
        hasPegScope = false;
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
        builder.append("\"MessageName\": \"PegInstructions\",\n");
        if (hasPegOffsetValue())
        {
            indent(builder, level);
            builder.append("\"PegOffsetValue\": \"");
            pegOffsetValue.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasPegMoveType())
        {
            indent(builder, level);
            builder.append("\"PegMoveType\": \"");
            builder.append(pegMoveType);
            builder.append("\",\n");
        }

        if (hasPegOffsetType())
        {
            indent(builder, level);
            builder.append("\"PegOffsetType\": \"");
            builder.append(pegOffsetType);
            builder.append("\",\n");
        }

        if (hasPegLimitType())
        {
            indent(builder, level);
            builder.append("\"PegLimitType\": \"");
            builder.append(pegLimitType);
            builder.append("\",\n");
        }

        if (hasPegRoundDirection())
        {
            indent(builder, level);
            builder.append("\"PegRoundDirection\": \"");
            builder.append(pegRoundDirection);
            builder.append("\",\n");
        }

        if (hasPegScope())
        {
            indent(builder, level);
            builder.append("\"PegScope\": \"");
            builder.append(pegScope);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public PegInstructionsEncoder copyTo(final Encoder encoder)
    {
        return copyTo((PegInstructionsEncoder)encoder);
    }

    public PegInstructionsEncoder copyTo(final PegInstructionsEncoder encoder)
    {
        encoder.reset();
        if (hasPegOffsetValue())
        {
            encoder.pegOffsetValue(this.pegOffsetValue());
        }

        if (hasPegMoveType())
        {
            encoder.pegMoveType(this.pegMoveType());
        }

        if (hasPegOffsetType())
        {
            encoder.pegOffsetType(this.pegOffsetType());
        }

        if (hasPegLimitType())
        {
            encoder.pegLimitType(this.pegLimitType());
        }

        if (hasPegRoundDirection())
        {
            encoder.pegRoundDirection(this.pegRoundDirection());
        }

        if (hasPegScope())
        {
            encoder.pegScope(this.pegScope());
        }
        return encoder;
    }

}
