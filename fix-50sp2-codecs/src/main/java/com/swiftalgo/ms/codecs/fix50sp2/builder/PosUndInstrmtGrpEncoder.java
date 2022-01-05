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


public class PosUndInstrmtGrpEncoder
{
    private static final int noUnderlyingsGroupCounterHeaderLength = 4;
    private static final byte[] noUnderlyingsGroupCounterHeader = new byte[] {55, 49, 49, (byte) '='};



public static class UnderlyingsGroupEncoder
{
    private UnderlyingsGroupEncoder next = null;

    public UnderlyingsGroupEncoder next()
    {
        if (next == null)
        {
            next = new UnderlyingsGroupEncoder();
        }
        return next;
    }

    private static final int underlyingSettlPriceHeaderLength = 4;
    private static final byte[] underlyingSettlPriceHeader = new byte[] {55, 51, 50, (byte) '='};

    private static final int underlyingSettlPriceTypeHeaderLength = 4;
    private static final byte[] underlyingSettlPriceTypeHeader = new byte[] {55, 51, 51, (byte) '='};

    private static final int underlyingDeliveryAmountHeaderLength = 5;
    private static final byte[] underlyingDeliveryAmountHeader = new byte[] {49, 48, 51, 55, (byte) '='};

    private final UnderlyingInstrumentEncoder underlyingInstrument = new UnderlyingInstrumentEncoder();
    public UnderlyingInstrumentEncoder underlyingInstrument()
    {
        return underlyingInstrument;
    }

    private final DecimalFloat underlyingSettlPrice = new DecimalFloat();

    private boolean hasUnderlyingSettlPrice;

    public boolean hasUnderlyingSettlPrice()
    {
        return hasUnderlyingSettlPrice;
    }

    public UnderlyingsGroupEncoder underlyingSettlPrice(DecimalFloat value)
    {
        underlyingSettlPrice.set(value);
        hasUnderlyingSettlPrice = true;
        return this;
    }

    public UnderlyingsGroupEncoder underlyingSettlPrice(long value, int scale)
    {
        underlyingSettlPrice.set(value, scale);
        hasUnderlyingSettlPrice = true;
        return this;
    }

    public DecimalFloat underlyingSettlPrice()
    {
        return underlyingSettlPrice;
    }

    private int underlyingSettlPriceType;

    private boolean hasUnderlyingSettlPriceType;

    public boolean hasUnderlyingSettlPriceType()
    {
        return hasUnderlyingSettlPriceType;
    }

    public UnderlyingsGroupEncoder underlyingSettlPriceType(int value)
    {
        underlyingSettlPriceType = value;
        hasUnderlyingSettlPriceType = true;
        return this;
    }

    public int underlyingSettlPriceType()
    {
        return underlyingSettlPriceType;
    }

    private final DecimalFloat underlyingDeliveryAmount = new DecimalFloat();

    private boolean hasUnderlyingDeliveryAmount;

    public boolean hasUnderlyingDeliveryAmount()
    {
        return hasUnderlyingDeliveryAmount;
    }

    public UnderlyingsGroupEncoder underlyingDeliveryAmount(DecimalFloat value)
    {
        underlyingDeliveryAmount.set(value);
        hasUnderlyingDeliveryAmount = true;
        return this;
    }

    public UnderlyingsGroupEncoder underlyingDeliveryAmount(long value, int scale)
    {
        underlyingDeliveryAmount.set(value, scale);
        hasUnderlyingDeliveryAmount = true;
        return this;
    }

    public DecimalFloat underlyingDeliveryAmount()
    {
        return underlyingDeliveryAmount;
    }

    private final UnderlyingAmountEncoder underlyingAmount = new UnderlyingAmountEncoder();
    public UnderlyingAmountEncoder underlyingAmount()
    {
        return underlyingAmount;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

            position += underlyingInstrument.encode(buffer, position);

        if (hasUnderlyingSettlPrice)
        {
            buffer.putBytes(position, underlyingSettlPriceHeader, 0, underlyingSettlPriceHeaderLength);
            position += underlyingSettlPriceHeaderLength;
            position += buffer.putFloatAscii(position, underlyingSettlPrice);
            buffer.putSeparator(position);
            position++;
        }

        if (hasUnderlyingSettlPriceType)
        {
            buffer.putBytes(position, underlyingSettlPriceTypeHeader, 0, underlyingSettlPriceTypeHeaderLength);
            position += underlyingSettlPriceTypeHeaderLength;
            position += buffer.putIntAscii(position, underlyingSettlPriceType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasUnderlyingDeliveryAmount)
        {
            buffer.putBytes(position, underlyingDeliveryAmountHeader, 0, underlyingDeliveryAmountHeaderLength);
            position += underlyingDeliveryAmountHeaderLength;
            position += buffer.putFloatAscii(position, underlyingDeliveryAmount);
            buffer.putSeparator(position);
            position++;
        }

            position += underlyingAmount.encode(buffer, position);
        if (next != null)
        {
            position += next.encode(buffer, position, remainingElements - 1);
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetUnderlyingSettlPrice();
        this.resetUnderlyingSettlPriceType();
        this.resetUnderlyingDeliveryAmount();
        underlyingInstrument.reset();
        underlyingAmount.reset();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetUnderlyingSettlPrice()
    {
        hasUnderlyingSettlPrice = false;
    }

    public void resetUnderlyingSettlPriceType()
    {
        hasUnderlyingSettlPriceType = false;
    }

    public void resetUnderlyingDeliveryAmount()
    {
        hasUnderlyingDeliveryAmount = false;
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
        builder.append("\"MessageName\": \"UnderlyingsGroup\",\n");
    indent(builder, level);
    builder.append("\"UnderlyingInstrument\": ");
    underlyingInstrument.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasUnderlyingSettlPrice())
        {
            indent(builder, level);
            builder.append("\"UnderlyingSettlPrice\": \"");
            underlyingSettlPrice.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasUnderlyingSettlPriceType())
        {
            indent(builder, level);
            builder.append("\"UnderlyingSettlPriceType\": \"");
            builder.append(underlyingSettlPriceType);
            builder.append("\",\n");
        }

        if (hasUnderlyingDeliveryAmount())
        {
            indent(builder, level);
            builder.append("\"UnderlyingDeliveryAmount\": \"");
            underlyingDeliveryAmount.appendTo(builder);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"UnderlyingAmount\": ");
    underlyingAmount.appendTo(builder, level + 1);
    builder.append("\n");
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public UnderlyingsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((UnderlyingsGroupEncoder)encoder);
    }

    public UnderlyingsGroupEncoder copyTo(final UnderlyingsGroupEncoder encoder)
    {
        encoder.reset();

        underlyingInstrument.copyTo(encoder.underlyingInstrument());
        if (hasUnderlyingSettlPrice())
        {
            encoder.underlyingSettlPrice(this.underlyingSettlPrice());
        }

        if (hasUnderlyingSettlPriceType())
        {
            encoder.underlyingSettlPriceType(this.underlyingSettlPriceType());
        }

        if (hasUnderlyingDeliveryAmount())
        {
            encoder.underlyingDeliveryAmount(this.underlyingDeliveryAmount());
        }


        underlyingAmount.copyTo(encoder.underlyingAmount());        return encoder;
    }

}
    private int noUnderlyingsGroupCounter;

    private boolean hasNoUnderlyingsGroupCounter;

    public boolean hasNoUnderlyingsGroupCounter()
    {
        return hasNoUnderlyingsGroupCounter;
    }

    public PosUndInstrmtGrpEncoder noUnderlyingsGroupCounter(int value)
    {
        noUnderlyingsGroupCounter = value;
        hasNoUnderlyingsGroupCounter = true;
        return this;
    }

    public int noUnderlyingsGroupCounter()
    {
        return noUnderlyingsGroupCounter;
    }


    private UnderlyingsGroupEncoder underlyingsGroup = null;

    public UnderlyingsGroupEncoder underlyingsGroup(final int numberOfElements)
    {
        hasNoUnderlyingsGroupCounter = true;
        noUnderlyingsGroupCounter = numberOfElements;
        if (underlyingsGroup == null)
        {
            underlyingsGroup = new UnderlyingsGroupEncoder();
        }
        return underlyingsGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoUnderlyingsGroupCounter)
        {
            buffer.putBytes(position, noUnderlyingsGroupCounterHeader, 0, noUnderlyingsGroupCounterHeaderLength);
            position += noUnderlyingsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noUnderlyingsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (underlyingsGroup != null)
        {
            position += underlyingsGroup.encode(buffer, position, noUnderlyingsGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetUnderlyingsGroup();
    }

    public void resetUnderlyingsGroup()
    {
        if (underlyingsGroup != null)
        {
            underlyingsGroup.reset();
        }
        noUnderlyingsGroupCounter = 0;
        hasNoUnderlyingsGroupCounter = false;
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
        builder.append("\"MessageName\": \"PosUndInstrmtGrp\",\n");
        if (hasNoUnderlyingsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"UnderlyingsGroup\": [\n");
            final int noUnderlyingsGroupCounter = this.noUnderlyingsGroupCounter;
            UnderlyingsGroupEncoder underlyingsGroup = this.underlyingsGroup;
            for (int i = 0; i < noUnderlyingsGroupCounter; i++)
            {
                indent(builder, level);
                underlyingsGroup.appendTo(builder, level + 1);
                if (i < (noUnderlyingsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                underlyingsGroup = underlyingsGroup.next();
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
    public PosUndInstrmtGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((PosUndInstrmtGrpEncoder)encoder);
    }

    public PosUndInstrmtGrpEncoder copyTo(final PosUndInstrmtGrpEncoder encoder)
    {
        encoder.reset();
        if (hasNoUnderlyingsGroupCounter)
        {
            final int size = this.noUnderlyingsGroupCounter;
            UnderlyingsGroupEncoder underlyingsGroup = this.underlyingsGroup;
            UnderlyingsGroupEncoder underlyingsGroupEncoder = encoder.underlyingsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (underlyingsGroup != null)
                {
                    underlyingsGroup.copyTo(underlyingsGroupEncoder);
                    underlyingsGroup = underlyingsGroup.next();
                    underlyingsGroupEncoder = underlyingsGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
