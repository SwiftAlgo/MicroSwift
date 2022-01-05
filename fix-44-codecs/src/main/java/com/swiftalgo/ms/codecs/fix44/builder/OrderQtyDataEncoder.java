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


public class OrderQtyDataEncoder
{
    private static final int orderQtyHeaderLength = 3;
    private static final byte[] orderQtyHeader = new byte[] {51, 56, (byte) '='};

    private static final int cashOrderQtyHeaderLength = 4;
    private static final byte[] cashOrderQtyHeader = new byte[] {49, 53, 50, (byte) '='};

    private static final int orderPercentHeaderLength = 4;
    private static final byte[] orderPercentHeader = new byte[] {53, 49, 54, (byte) '='};

    private static final int roundingDirectionHeaderLength = 4;
    private static final byte[] roundingDirectionHeader = new byte[] {52, 54, 56, (byte) '='};

    private static final int roundingModulusHeaderLength = 4;
    private static final byte[] roundingModulusHeader = new byte[] {52, 54, 57, (byte) '='};

    private final DecimalFloat orderQty = new DecimalFloat();

    private boolean hasOrderQty;

    public boolean hasOrderQty()
    {
        return hasOrderQty;
    }

    public OrderQtyDataEncoder orderQty(DecimalFloat value)
    {
        orderQty.set(value);
        hasOrderQty = true;
        return this;
    }

    public OrderQtyDataEncoder orderQty(long value, int scale)
    {
        orderQty.set(value, scale);
        hasOrderQty = true;
        return this;
    }

    public DecimalFloat orderQty()
    {
        return orderQty;
    }

    private final DecimalFloat cashOrderQty = new DecimalFloat();

    private boolean hasCashOrderQty;

    public boolean hasCashOrderQty()
    {
        return hasCashOrderQty;
    }

    public OrderQtyDataEncoder cashOrderQty(DecimalFloat value)
    {
        cashOrderQty.set(value);
        hasCashOrderQty = true;
        return this;
    }

    public OrderQtyDataEncoder cashOrderQty(long value, int scale)
    {
        cashOrderQty.set(value, scale);
        hasCashOrderQty = true;
        return this;
    }

    public DecimalFloat cashOrderQty()
    {
        return cashOrderQty;
    }

    private final DecimalFloat orderPercent = new DecimalFloat();

    private boolean hasOrderPercent;

    public boolean hasOrderPercent()
    {
        return hasOrderPercent;
    }

    public OrderQtyDataEncoder orderPercent(DecimalFloat value)
    {
        orderPercent.set(value);
        hasOrderPercent = true;
        return this;
    }

    public OrderQtyDataEncoder orderPercent(long value, int scale)
    {
        orderPercent.set(value, scale);
        hasOrderPercent = true;
        return this;
    }

    public DecimalFloat orderPercent()
    {
        return orderPercent;
    }

    private char roundingDirection;

    private boolean hasRoundingDirection;

    public boolean hasRoundingDirection()
    {
        return hasRoundingDirection;
    }

    public OrderQtyDataEncoder roundingDirection(char value)
    {
        roundingDirection = value;
        hasRoundingDirection = true;
        return this;
    }

    public char roundingDirection()
    {
        return roundingDirection;
    }

    public OrderQtyDataEncoder roundingDirection(RoundingDirection value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == RoundingDirection.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: roundingDirection Value: " + value );
            }
            if (value == RoundingDirection.NULL_VAL)
            {
                return this;
            }
        }
        return roundingDirection(value.representation());
    }

    private final DecimalFloat roundingModulus = new DecimalFloat();

    private boolean hasRoundingModulus;

    public boolean hasRoundingModulus()
    {
        return hasRoundingModulus;
    }

    public OrderQtyDataEncoder roundingModulus(DecimalFloat value)
    {
        roundingModulus.set(value);
        hasRoundingModulus = true;
        return this;
    }

    public OrderQtyDataEncoder roundingModulus(long value, int scale)
    {
        roundingModulus.set(value, scale);
        hasRoundingModulus = true;
        return this;
    }

    public DecimalFloat roundingModulus()
    {
        return roundingModulus;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasOrderQty)
        {
            buffer.putBytes(position, orderQtyHeader, 0, orderQtyHeaderLength);
            position += orderQtyHeaderLength;
            position += buffer.putFloatAscii(position, orderQty);
            buffer.putSeparator(position);
            position++;
        }

        if (hasCashOrderQty)
        {
            buffer.putBytes(position, cashOrderQtyHeader, 0, cashOrderQtyHeaderLength);
            position += cashOrderQtyHeaderLength;
            position += buffer.putFloatAscii(position, cashOrderQty);
            buffer.putSeparator(position);
            position++;
        }

        if (hasOrderPercent)
        {
            buffer.putBytes(position, orderPercentHeader, 0, orderPercentHeaderLength);
            position += orderPercentHeaderLength;
            position += buffer.putFloatAscii(position, orderPercent);
            buffer.putSeparator(position);
            position++;
        }

        if (hasRoundingDirection)
        {
            buffer.putBytes(position, roundingDirectionHeader, 0, roundingDirectionHeaderLength);
            position += roundingDirectionHeaderLength;
            position += buffer.putCharAscii(position, roundingDirection);
            buffer.putSeparator(position);
            position++;
        }

        if (hasRoundingModulus)
        {
            buffer.putBytes(position, roundingModulusHeader, 0, roundingModulusHeaderLength);
            position += roundingModulusHeaderLength;
            position += buffer.putFloatAscii(position, roundingModulus);
            buffer.putSeparator(position);
            position++;
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetOrderQty();
        this.resetCashOrderQty();
        this.resetOrderPercent();
        this.resetRoundingDirection();
        this.resetRoundingModulus();
    }

    public void resetOrderQty()
    {
        hasOrderQty = false;
    }

    public void resetCashOrderQty()
    {
        hasCashOrderQty = false;
    }

    public void resetOrderPercent()
    {
        hasOrderPercent = false;
    }

    public void resetRoundingDirection()
    {
        hasRoundingDirection = false;
    }

    public void resetRoundingModulus()
    {
        hasRoundingModulus = false;
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
        builder.append("\"MessageName\": \"OrderQtyData\",\n");
        if (hasOrderQty())
        {
            indent(builder, level);
            builder.append("\"OrderQty\": \"");
            orderQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasCashOrderQty())
        {
            indent(builder, level);
            builder.append("\"CashOrderQty\": \"");
            cashOrderQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasOrderPercent())
        {
            indent(builder, level);
            builder.append("\"OrderPercent\": \"");
            orderPercent.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasRoundingDirection())
        {
            indent(builder, level);
            builder.append("\"RoundingDirection\": \"");
            builder.append(roundingDirection);
            builder.append("\",\n");
        }

        if (hasRoundingModulus())
        {
            indent(builder, level);
            builder.append("\"RoundingModulus\": \"");
            roundingModulus.appendTo(builder);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public OrderQtyDataEncoder copyTo(final Encoder encoder)
    {
        return copyTo((OrderQtyDataEncoder)encoder);
    }

    public OrderQtyDataEncoder copyTo(final OrderQtyDataEncoder encoder)
    {
        encoder.reset();
        if (hasOrderQty())
        {
            encoder.orderQty(this.orderQty());
        }

        if (hasCashOrderQty())
        {
            encoder.cashOrderQty(this.cashOrderQty());
        }

        if (hasOrderPercent())
        {
            encoder.orderPercent(this.orderPercent());
        }

        if (hasRoundingDirection())
        {
            encoder.roundingDirection(this.roundingDirection());
        }

        if (hasRoundingModulus())
        {
            encoder.roundingModulus(this.roundingModulus());
        }
        return encoder;
    }

}
