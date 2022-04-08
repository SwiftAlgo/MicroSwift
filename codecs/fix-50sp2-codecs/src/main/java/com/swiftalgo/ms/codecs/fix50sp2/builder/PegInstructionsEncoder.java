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


public class PegInstructionsEncoder
{
    private static final int pegOffsetValueHeaderLength = 4;
    private static final byte[] pegOffsetValueHeader = new byte[] {50, 49, 49, (byte) '='};

    private static final int pegPriceTypeHeaderLength = 5;
    private static final byte[] pegPriceTypeHeader = new byte[] {49, 48, 57, 52, (byte) '='};

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

    private static final int pegSecurityIDSourceHeaderLength = 5;
    private static final byte[] pegSecurityIDSourceHeader = new byte[] {49, 48, 57, 54, (byte) '='};

    private static final int pegSecurityIDHeaderLength = 5;
    private static final byte[] pegSecurityIDHeader = new byte[] {49, 48, 57, 55, (byte) '='};

    private static final int pegSymbolHeaderLength = 5;
    private static final byte[] pegSymbolHeader = new byte[] {49, 48, 57, 56, (byte) '='};

    private static final int pegSecurityDescHeaderLength = 5;
    private static final byte[] pegSecurityDescHeader = new byte[] {49, 48, 57, 57, (byte) '='};

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

    private int pegPriceType;

    private boolean hasPegPriceType;

    public boolean hasPegPriceType()
    {
        return hasPegPriceType;
    }

    public PegInstructionsEncoder pegPriceType(int value)
    {
        pegPriceType = value;
        hasPegPriceType = true;
        return this;
    }

    public int pegPriceType()
    {
        return pegPriceType;
    }

    public PegInstructionsEncoder pegPriceType(PegPriceType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == PegPriceType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: pegPriceType Value: " + value );
            }
            if (value == PegPriceType.NULL_VAL)
            {
                return this;
            }
        }
        return pegPriceType(value.representation());
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

    private final MutableDirectBuffer pegSecurityIDSource = new UnsafeBuffer();

    private int pegSecurityIDSourceOffset = 0;

    private int pegSecurityIDSourceLength = 0;

    public PegInstructionsEncoder pegSecurityIDSource(final DirectBuffer value, final int offset, final int length)
    {
        pegSecurityIDSource.wrap(value);
        pegSecurityIDSourceOffset = offset;
        pegSecurityIDSourceLength = length;
        return this;
    }

    public PegInstructionsEncoder pegSecurityIDSource(final DirectBuffer value, final int length)
    {
        return pegSecurityIDSource(value, 0, length);
    }

    public PegInstructionsEncoder pegSecurityIDSource(final DirectBuffer value)
    {
        return pegSecurityIDSource(value, 0, value.capacity());
    }

    public PegInstructionsEncoder pegSecurityIDSource(final byte[] value, final int offset, final int length)
    {
        pegSecurityIDSource.wrap(value);
        pegSecurityIDSourceOffset = offset;
        pegSecurityIDSourceLength = length;
        return this;
    }

    public PegInstructionsEncoder pegSecurityIDSourceAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(pegSecurityIDSource, value, offset, length);
        pegSecurityIDSourceOffset = offset;
        pegSecurityIDSourceLength = length;
        return this;
    }

    public PegInstructionsEncoder pegSecurityIDSource(final byte[] value, final int length)
    {
        return pegSecurityIDSource(value, 0, length);
    }

    public PegInstructionsEncoder pegSecurityIDSource(final byte[] value)
    {
        return pegSecurityIDSource(value, 0, value.length);
    }

    public boolean hasPegSecurityIDSource()
    {
        return pegSecurityIDSourceLength > 0;
    }

    public MutableDirectBuffer pegSecurityIDSource()
    {
        return pegSecurityIDSource;
    }

    public String pegSecurityIDSourceAsString()
    {
        return pegSecurityIDSource.getStringWithoutLengthAscii(pegSecurityIDSourceOffset, pegSecurityIDSourceLength);
    }

    public PegInstructionsEncoder pegSecurityIDSource(final CharSequence value)
    {
        toBytes(value, pegSecurityIDSource);
        pegSecurityIDSourceOffset = 0;
        pegSecurityIDSourceLength = value.length();
        return this;
    }

    public PegInstructionsEncoder pegSecurityIDSource(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            pegSecurityIDSource.wrap(buffer);
            pegSecurityIDSourceOffset = value.offset();
            pegSecurityIDSourceLength = value.length();
        }
        return this;
    }

    public PegInstructionsEncoder pegSecurityIDSource(final char[] value)
    {
        return pegSecurityIDSource(value, 0, value.length);
    }

    public PegInstructionsEncoder pegSecurityIDSource(final char[] value, final int length)
    {
        return pegSecurityIDSource(value, 0, length);
    }

    public PegInstructionsEncoder pegSecurityIDSource(final char[] value, final int offset, final int length)
    {
        toBytes(value, pegSecurityIDSource, offset, length);
        pegSecurityIDSourceOffset = 0;
        pegSecurityIDSourceLength = length;
        return this;
    }

    private final MutableDirectBuffer pegSecurityID = new UnsafeBuffer();

    private int pegSecurityIDOffset = 0;

    private int pegSecurityIDLength = 0;

    public PegInstructionsEncoder pegSecurityID(final DirectBuffer value, final int offset, final int length)
    {
        pegSecurityID.wrap(value);
        pegSecurityIDOffset = offset;
        pegSecurityIDLength = length;
        return this;
    }

    public PegInstructionsEncoder pegSecurityID(final DirectBuffer value, final int length)
    {
        return pegSecurityID(value, 0, length);
    }

    public PegInstructionsEncoder pegSecurityID(final DirectBuffer value)
    {
        return pegSecurityID(value, 0, value.capacity());
    }

    public PegInstructionsEncoder pegSecurityID(final byte[] value, final int offset, final int length)
    {
        pegSecurityID.wrap(value);
        pegSecurityIDOffset = offset;
        pegSecurityIDLength = length;
        return this;
    }

    public PegInstructionsEncoder pegSecurityIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(pegSecurityID, value, offset, length);
        pegSecurityIDOffset = offset;
        pegSecurityIDLength = length;
        return this;
    }

    public PegInstructionsEncoder pegSecurityID(final byte[] value, final int length)
    {
        return pegSecurityID(value, 0, length);
    }

    public PegInstructionsEncoder pegSecurityID(final byte[] value)
    {
        return pegSecurityID(value, 0, value.length);
    }

    public boolean hasPegSecurityID()
    {
        return pegSecurityIDLength > 0;
    }

    public MutableDirectBuffer pegSecurityID()
    {
        return pegSecurityID;
    }

    public String pegSecurityIDAsString()
    {
        return pegSecurityID.getStringWithoutLengthAscii(pegSecurityIDOffset, pegSecurityIDLength);
    }

    public PegInstructionsEncoder pegSecurityID(final CharSequence value)
    {
        toBytes(value, pegSecurityID);
        pegSecurityIDOffset = 0;
        pegSecurityIDLength = value.length();
        return this;
    }

    public PegInstructionsEncoder pegSecurityID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            pegSecurityID.wrap(buffer);
            pegSecurityIDOffset = value.offset();
            pegSecurityIDLength = value.length();
        }
        return this;
    }

    public PegInstructionsEncoder pegSecurityID(final char[] value)
    {
        return pegSecurityID(value, 0, value.length);
    }

    public PegInstructionsEncoder pegSecurityID(final char[] value, final int length)
    {
        return pegSecurityID(value, 0, length);
    }

    public PegInstructionsEncoder pegSecurityID(final char[] value, final int offset, final int length)
    {
        toBytes(value, pegSecurityID, offset, length);
        pegSecurityIDOffset = 0;
        pegSecurityIDLength = length;
        return this;
    }

    private final MutableDirectBuffer pegSymbol = new UnsafeBuffer();

    private int pegSymbolOffset = 0;

    private int pegSymbolLength = 0;

    public PegInstructionsEncoder pegSymbol(final DirectBuffer value, final int offset, final int length)
    {
        pegSymbol.wrap(value);
        pegSymbolOffset = offset;
        pegSymbolLength = length;
        return this;
    }

    public PegInstructionsEncoder pegSymbol(final DirectBuffer value, final int length)
    {
        return pegSymbol(value, 0, length);
    }

    public PegInstructionsEncoder pegSymbol(final DirectBuffer value)
    {
        return pegSymbol(value, 0, value.capacity());
    }

    public PegInstructionsEncoder pegSymbol(final byte[] value, final int offset, final int length)
    {
        pegSymbol.wrap(value);
        pegSymbolOffset = offset;
        pegSymbolLength = length;
        return this;
    }

    public PegInstructionsEncoder pegSymbolAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(pegSymbol, value, offset, length);
        pegSymbolOffset = offset;
        pegSymbolLength = length;
        return this;
    }

    public PegInstructionsEncoder pegSymbol(final byte[] value, final int length)
    {
        return pegSymbol(value, 0, length);
    }

    public PegInstructionsEncoder pegSymbol(final byte[] value)
    {
        return pegSymbol(value, 0, value.length);
    }

    public boolean hasPegSymbol()
    {
        return pegSymbolLength > 0;
    }

    public MutableDirectBuffer pegSymbol()
    {
        return pegSymbol;
    }

    public String pegSymbolAsString()
    {
        return pegSymbol.getStringWithoutLengthAscii(pegSymbolOffset, pegSymbolLength);
    }

    public PegInstructionsEncoder pegSymbol(final CharSequence value)
    {
        toBytes(value, pegSymbol);
        pegSymbolOffset = 0;
        pegSymbolLength = value.length();
        return this;
    }

    public PegInstructionsEncoder pegSymbol(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            pegSymbol.wrap(buffer);
            pegSymbolOffset = value.offset();
            pegSymbolLength = value.length();
        }
        return this;
    }

    public PegInstructionsEncoder pegSymbol(final char[] value)
    {
        return pegSymbol(value, 0, value.length);
    }

    public PegInstructionsEncoder pegSymbol(final char[] value, final int length)
    {
        return pegSymbol(value, 0, length);
    }

    public PegInstructionsEncoder pegSymbol(final char[] value, final int offset, final int length)
    {
        toBytes(value, pegSymbol, offset, length);
        pegSymbolOffset = 0;
        pegSymbolLength = length;
        return this;
    }

    private final MutableDirectBuffer pegSecurityDesc = new UnsafeBuffer();

    private int pegSecurityDescOffset = 0;

    private int pegSecurityDescLength = 0;

    public PegInstructionsEncoder pegSecurityDesc(final DirectBuffer value, final int offset, final int length)
    {
        pegSecurityDesc.wrap(value);
        pegSecurityDescOffset = offset;
        pegSecurityDescLength = length;
        return this;
    }

    public PegInstructionsEncoder pegSecurityDesc(final DirectBuffer value, final int length)
    {
        return pegSecurityDesc(value, 0, length);
    }

    public PegInstructionsEncoder pegSecurityDesc(final DirectBuffer value)
    {
        return pegSecurityDesc(value, 0, value.capacity());
    }

    public PegInstructionsEncoder pegSecurityDesc(final byte[] value, final int offset, final int length)
    {
        pegSecurityDesc.wrap(value);
        pegSecurityDescOffset = offset;
        pegSecurityDescLength = length;
        return this;
    }

    public PegInstructionsEncoder pegSecurityDescAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(pegSecurityDesc, value, offset, length);
        pegSecurityDescOffset = offset;
        pegSecurityDescLength = length;
        return this;
    }

    public PegInstructionsEncoder pegSecurityDesc(final byte[] value, final int length)
    {
        return pegSecurityDesc(value, 0, length);
    }

    public PegInstructionsEncoder pegSecurityDesc(final byte[] value)
    {
        return pegSecurityDesc(value, 0, value.length);
    }

    public boolean hasPegSecurityDesc()
    {
        return pegSecurityDescLength > 0;
    }

    public MutableDirectBuffer pegSecurityDesc()
    {
        return pegSecurityDesc;
    }

    public String pegSecurityDescAsString()
    {
        return pegSecurityDesc.getStringWithoutLengthAscii(pegSecurityDescOffset, pegSecurityDescLength);
    }

    public PegInstructionsEncoder pegSecurityDesc(final CharSequence value)
    {
        toBytes(value, pegSecurityDesc);
        pegSecurityDescOffset = 0;
        pegSecurityDescLength = value.length();
        return this;
    }

    public PegInstructionsEncoder pegSecurityDesc(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            pegSecurityDesc.wrap(buffer);
            pegSecurityDescOffset = value.offset();
            pegSecurityDescLength = value.length();
        }
        return this;
    }

    public PegInstructionsEncoder pegSecurityDesc(final char[] value)
    {
        return pegSecurityDesc(value, 0, value.length);
    }

    public PegInstructionsEncoder pegSecurityDesc(final char[] value, final int length)
    {
        return pegSecurityDesc(value, 0, length);
    }

    public PegInstructionsEncoder pegSecurityDesc(final char[] value, final int offset, final int length)
    {
        toBytes(value, pegSecurityDesc, offset, length);
        pegSecurityDescOffset = 0;
        pegSecurityDescLength = length;
        return this;
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

        if (hasPegPriceType)
        {
            buffer.putBytes(position, pegPriceTypeHeader, 0, pegPriceTypeHeaderLength);
            position += pegPriceTypeHeaderLength;
            position += buffer.putIntAscii(position, pegPriceType);
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

        if (pegSecurityIDSourceLength > 0)
        {
            buffer.putBytes(position, pegSecurityIDSourceHeader, 0, pegSecurityIDSourceHeaderLength);
            position += pegSecurityIDSourceHeaderLength;
            buffer.putBytes(position, pegSecurityIDSource, pegSecurityIDSourceOffset, pegSecurityIDSourceLength);
            position += pegSecurityIDSourceLength;
            buffer.putSeparator(position);
            position++;
        }

        if (pegSecurityIDLength > 0)
        {
            buffer.putBytes(position, pegSecurityIDHeader, 0, pegSecurityIDHeaderLength);
            position += pegSecurityIDHeaderLength;
            buffer.putBytes(position, pegSecurityID, pegSecurityIDOffset, pegSecurityIDLength);
            position += pegSecurityIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (pegSymbolLength > 0)
        {
            buffer.putBytes(position, pegSymbolHeader, 0, pegSymbolHeaderLength);
            position += pegSymbolHeaderLength;
            buffer.putBytes(position, pegSymbol, pegSymbolOffset, pegSymbolLength);
            position += pegSymbolLength;
            buffer.putSeparator(position);
            position++;
        }

        if (pegSecurityDescLength > 0)
        {
            buffer.putBytes(position, pegSecurityDescHeader, 0, pegSecurityDescHeaderLength);
            position += pegSecurityDescHeaderLength;
            buffer.putBytes(position, pegSecurityDesc, pegSecurityDescOffset, pegSecurityDescLength);
            position += pegSecurityDescLength;
            buffer.putSeparator(position);
            position++;
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetPegOffsetValue();
        this.resetPegPriceType();
        this.resetPegMoveType();
        this.resetPegOffsetType();
        this.resetPegLimitType();
        this.resetPegRoundDirection();
        this.resetPegScope();
        this.resetPegSecurityIDSource();
        this.resetPegSecurityID();
        this.resetPegSymbol();
        this.resetPegSecurityDesc();
    }

    public void resetPegOffsetValue()
    {
        hasPegOffsetValue = false;
    }

    public void resetPegPriceType()
    {
        hasPegPriceType = false;
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

    public void resetPegSecurityIDSource()
    {
        pegSecurityIDSourceLength = 0;
    }

    public void resetPegSecurityID()
    {
        pegSecurityIDLength = 0;
    }

    public void resetPegSymbol()
    {
        pegSymbolLength = 0;
    }

    public void resetPegSecurityDesc()
    {
        pegSecurityDescLength = 0;
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

        if (hasPegPriceType())
        {
            indent(builder, level);
            builder.append("\"PegPriceType\": \"");
            builder.append(pegPriceType);
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

        if (hasPegSecurityIDSource())
        {
            indent(builder, level);
            builder.append("\"PegSecurityIDSource\": \"");
            appendBuffer(builder, pegSecurityIDSource, pegSecurityIDSourceOffset, pegSecurityIDSourceLength);
            builder.append("\",\n");
        }

        if (hasPegSecurityID())
        {
            indent(builder, level);
            builder.append("\"PegSecurityID\": \"");
            appendBuffer(builder, pegSecurityID, pegSecurityIDOffset, pegSecurityIDLength);
            builder.append("\",\n");
        }

        if (hasPegSymbol())
        {
            indent(builder, level);
            builder.append("\"PegSymbol\": \"");
            appendBuffer(builder, pegSymbol, pegSymbolOffset, pegSymbolLength);
            builder.append("\",\n");
        }

        if (hasPegSecurityDesc())
        {
            indent(builder, level);
            builder.append("\"PegSecurityDesc\": \"");
            appendBuffer(builder, pegSecurityDesc, pegSecurityDescOffset, pegSecurityDescLength);
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

        if (hasPegPriceType())
        {
            encoder.pegPriceType(this.pegPriceType());
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

        if (hasPegSecurityIDSource())
        {
            encoder.pegSecurityIDSourceAsCopy(pegSecurityIDSource.byteArray(), 0, pegSecurityIDSourceLength);
        }

        if (hasPegSecurityID())
        {
            encoder.pegSecurityIDAsCopy(pegSecurityID.byteArray(), 0, pegSecurityIDLength);
        }

        if (hasPegSymbol())
        {
            encoder.pegSymbolAsCopy(pegSymbol.byteArray(), 0, pegSymbolLength);
        }

        if (hasPegSecurityDesc())
        {
            encoder.pegSecurityDescAsCopy(pegSecurityDesc.byteArray(), 0, pegSecurityDescLength);
        }
        return encoder;
    }

}
