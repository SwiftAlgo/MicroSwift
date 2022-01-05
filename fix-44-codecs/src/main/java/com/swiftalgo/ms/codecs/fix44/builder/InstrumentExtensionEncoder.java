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


public class InstrumentExtensionEncoder
{
    private static final int deliveryFormHeaderLength = 4;
    private static final byte[] deliveryFormHeader = new byte[] {54, 54, 56, (byte) '='};

    private static final int pctAtRiskHeaderLength = 4;
    private static final byte[] pctAtRiskHeader = new byte[] {56, 54, 57, (byte) '='};

    private static final int noInstrAttribGroupCounterHeaderLength = 4;
    private static final byte[] noInstrAttribGroupCounterHeader = new byte[] {56, 55, 48, (byte) '='};

    private int deliveryForm;

    private boolean hasDeliveryForm;

    public boolean hasDeliveryForm()
    {
        return hasDeliveryForm;
    }

    public InstrumentExtensionEncoder deliveryForm(int value)
    {
        deliveryForm = value;
        hasDeliveryForm = true;
        return this;
    }

    public int deliveryForm()
    {
        return deliveryForm;
    }

    public InstrumentExtensionEncoder deliveryForm(DeliveryForm value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == DeliveryForm.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: deliveryForm Value: " + value );
            }
            if (value == DeliveryForm.NULL_VAL)
            {
                return this;
            }
        }
        return deliveryForm(value.representation());
    }

    private final DecimalFloat pctAtRisk = new DecimalFloat();

    private boolean hasPctAtRisk;

    public boolean hasPctAtRisk()
    {
        return hasPctAtRisk;
    }

    public InstrumentExtensionEncoder pctAtRisk(DecimalFloat value)
    {
        pctAtRisk.set(value);
        hasPctAtRisk = true;
        return this;
    }

    public InstrumentExtensionEncoder pctAtRisk(long value, int scale)
    {
        pctAtRisk.set(value, scale);
        hasPctAtRisk = true;
        return this;
    }

    public DecimalFloat pctAtRisk()
    {
        return pctAtRisk;
    }



public static class InstrAttribGroupEncoder
{
    private InstrAttribGroupEncoder next = null;

    public InstrAttribGroupEncoder next()
    {
        if (next == null)
        {
            next = new InstrAttribGroupEncoder();
        }
        return next;
    }

    private static final int instrAttribTypeHeaderLength = 4;
    private static final byte[] instrAttribTypeHeader = new byte[] {56, 55, 49, (byte) '='};

    private static final int instrAttribValueHeaderLength = 4;
    private static final byte[] instrAttribValueHeader = new byte[] {56, 55, 50, (byte) '='};

    private int instrAttribType;

    private boolean hasInstrAttribType;

    public boolean hasInstrAttribType()
    {
        return hasInstrAttribType;
    }

    public InstrAttribGroupEncoder instrAttribType(int value)
    {
        instrAttribType = value;
        hasInstrAttribType = true;
        return this;
    }

    public int instrAttribType()
    {
        return instrAttribType;
    }

    public InstrAttribGroupEncoder instrAttribType(InstrAttribType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == InstrAttribType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: instrAttribType Value: " + value );
            }
            if (value == InstrAttribType.NULL_VAL)
            {
                return this;
            }
        }
        return instrAttribType(value.representation());
    }

    private final MutableDirectBuffer instrAttribValue = new UnsafeBuffer();

    private int instrAttribValueOffset = 0;

    private int instrAttribValueLength = 0;

    public InstrAttribGroupEncoder instrAttribValue(final DirectBuffer value, final int offset, final int length)
    {
        instrAttribValue.wrap(value);
        instrAttribValueOffset = offset;
        instrAttribValueLength = length;
        return this;
    }

    public InstrAttribGroupEncoder instrAttribValue(final DirectBuffer value, final int length)
    {
        return instrAttribValue(value, 0, length);
    }

    public InstrAttribGroupEncoder instrAttribValue(final DirectBuffer value)
    {
        return instrAttribValue(value, 0, value.capacity());
    }

    public InstrAttribGroupEncoder instrAttribValue(final byte[] value, final int offset, final int length)
    {
        instrAttribValue.wrap(value);
        instrAttribValueOffset = offset;
        instrAttribValueLength = length;
        return this;
    }

    public InstrAttribGroupEncoder instrAttribValueAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(instrAttribValue, value, offset, length);
        instrAttribValueOffset = offset;
        instrAttribValueLength = length;
        return this;
    }

    public InstrAttribGroupEncoder instrAttribValue(final byte[] value, final int length)
    {
        return instrAttribValue(value, 0, length);
    }

    public InstrAttribGroupEncoder instrAttribValue(final byte[] value)
    {
        return instrAttribValue(value, 0, value.length);
    }

    public boolean hasInstrAttribValue()
    {
        return instrAttribValueLength > 0;
    }

    public MutableDirectBuffer instrAttribValue()
    {
        return instrAttribValue;
    }

    public String instrAttribValueAsString()
    {
        return instrAttribValue.getStringWithoutLengthAscii(instrAttribValueOffset, instrAttribValueLength);
    }

    public InstrAttribGroupEncoder instrAttribValue(final CharSequence value)
    {
        toBytes(value, instrAttribValue);
        instrAttribValueOffset = 0;
        instrAttribValueLength = value.length();
        return this;
    }

    public InstrAttribGroupEncoder instrAttribValue(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            instrAttribValue.wrap(buffer);
            instrAttribValueOffset = value.offset();
            instrAttribValueLength = value.length();
        }
        return this;
    }

    public InstrAttribGroupEncoder instrAttribValue(final char[] value)
    {
        return instrAttribValue(value, 0, value.length);
    }

    public InstrAttribGroupEncoder instrAttribValue(final char[] value, final int length)
    {
        return instrAttribValue(value, 0, length);
    }

    public InstrAttribGroupEncoder instrAttribValue(final char[] value, final int offset, final int length)
    {
        toBytes(value, instrAttribValue, offset, length);
        instrAttribValueOffset = 0;
        instrAttribValueLength = length;
        return this;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (hasInstrAttribType)
        {
            buffer.putBytes(position, instrAttribTypeHeader, 0, instrAttribTypeHeaderLength);
            position += instrAttribTypeHeaderLength;
            position += buffer.putIntAscii(position, instrAttribType);
            buffer.putSeparator(position);
            position++;
        }

        if (instrAttribValueLength > 0)
        {
            buffer.putBytes(position, instrAttribValueHeader, 0, instrAttribValueHeaderLength);
            position += instrAttribValueHeaderLength;
            buffer.putBytes(position, instrAttribValue, instrAttribValueOffset, instrAttribValueLength);
            position += instrAttribValueLength;
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
        this.resetInstrAttribType();
        this.resetInstrAttribValue();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetInstrAttribType()
    {
        hasInstrAttribType = false;
    }

    public void resetInstrAttribValue()
    {
        instrAttribValueLength = 0;
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
        builder.append("\"MessageName\": \"InstrAttribGroup\",\n");
        if (hasInstrAttribType())
        {
            indent(builder, level);
            builder.append("\"InstrAttribType\": \"");
            builder.append(instrAttribType);
            builder.append("\",\n");
        }

        if (hasInstrAttribValue())
        {
            indent(builder, level);
            builder.append("\"InstrAttribValue\": \"");
            appendBuffer(builder, instrAttribValue, instrAttribValueOffset, instrAttribValueLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public InstrAttribGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((InstrAttribGroupEncoder)encoder);
    }

    public InstrAttribGroupEncoder copyTo(final InstrAttribGroupEncoder encoder)
    {
        encoder.reset();
        if (hasInstrAttribType())
        {
            encoder.instrAttribType(this.instrAttribType());
        }

        if (hasInstrAttribValue())
        {
            encoder.instrAttribValueAsCopy(instrAttribValue.byteArray(), 0, instrAttribValueLength);
        }
        return encoder;
    }

}
    private int noInstrAttribGroupCounter;

    private boolean hasNoInstrAttribGroupCounter;

    public boolean hasNoInstrAttribGroupCounter()
    {
        return hasNoInstrAttribGroupCounter;
    }

    public InstrumentExtensionEncoder noInstrAttribGroupCounter(int value)
    {
        noInstrAttribGroupCounter = value;
        hasNoInstrAttribGroupCounter = true;
        return this;
    }

    public int noInstrAttribGroupCounter()
    {
        return noInstrAttribGroupCounter;
    }


    private InstrAttribGroupEncoder instrAttribGroup = null;

    public InstrAttribGroupEncoder instrAttribGroup(final int numberOfElements)
    {
        hasNoInstrAttribGroupCounter = true;
        noInstrAttribGroupCounter = numberOfElements;
        if (instrAttribGroup == null)
        {
            instrAttribGroup = new InstrAttribGroupEncoder();
        }
        return instrAttribGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasDeliveryForm)
        {
            buffer.putBytes(position, deliveryFormHeader, 0, deliveryFormHeaderLength);
            position += deliveryFormHeaderLength;
            position += buffer.putIntAscii(position, deliveryForm);
            buffer.putSeparator(position);
            position++;
        }

        if (hasPctAtRisk)
        {
            buffer.putBytes(position, pctAtRiskHeader, 0, pctAtRiskHeaderLength);
            position += pctAtRiskHeaderLength;
            position += buffer.putFloatAscii(position, pctAtRisk);
            buffer.putSeparator(position);
            position++;
        }

        if (hasNoInstrAttribGroupCounter)
        {
            buffer.putBytes(position, noInstrAttribGroupCounterHeader, 0, noInstrAttribGroupCounterHeaderLength);
            position += noInstrAttribGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noInstrAttribGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (instrAttribGroup != null)
        {
            position += instrAttribGroup.encode(buffer, position, noInstrAttribGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetDeliveryForm();
        this.resetPctAtRisk();
        this.resetInstrAttribGroup();
    }

    public void resetDeliveryForm()
    {
        hasDeliveryForm = false;
    }

    public void resetPctAtRisk()
    {
        hasPctAtRisk = false;
    }

    public void resetInstrAttribGroup()
    {
        if (instrAttribGroup != null)
        {
            instrAttribGroup.reset();
        }
        noInstrAttribGroupCounter = 0;
        hasNoInstrAttribGroupCounter = false;
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
        builder.append("\"MessageName\": \"InstrumentExtension\",\n");
        if (hasDeliveryForm())
        {
            indent(builder, level);
            builder.append("\"DeliveryForm\": \"");
            builder.append(deliveryForm);
            builder.append("\",\n");
        }

        if (hasPctAtRisk())
        {
            indent(builder, level);
            builder.append("\"PctAtRisk\": \"");
            pctAtRisk.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasNoInstrAttribGroupCounter)
        {
            indent(builder, level);
            builder.append("\"InstrAttribGroup\": [\n");
            final int noInstrAttribGroupCounter = this.noInstrAttribGroupCounter;
            InstrAttribGroupEncoder instrAttribGroup = this.instrAttribGroup;
            for (int i = 0; i < noInstrAttribGroupCounter; i++)
            {
                indent(builder, level);
                instrAttribGroup.appendTo(builder, level + 1);
                if (i < (noInstrAttribGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                instrAttribGroup = instrAttribGroup.next();
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
    public InstrumentExtensionEncoder copyTo(final Encoder encoder)
    {
        return copyTo((InstrumentExtensionEncoder)encoder);
    }

    public InstrumentExtensionEncoder copyTo(final InstrumentExtensionEncoder encoder)
    {
        encoder.reset();
        if (hasDeliveryForm())
        {
            encoder.deliveryForm(this.deliveryForm());
        }

        if (hasPctAtRisk())
        {
            encoder.pctAtRisk(this.pctAtRisk());
        }

        if (hasNoInstrAttribGroupCounter)
        {
            final int size = this.noInstrAttribGroupCounter;
            InstrAttribGroupEncoder instrAttribGroup = this.instrAttribGroup;
            InstrAttribGroupEncoder instrAttribGroupEncoder = encoder.instrAttribGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (instrAttribGroup != null)
                {
                    instrAttribGroup.copyTo(instrAttribGroupEncoder);
                    instrAttribGroup = instrAttribGroup.next();
                    instrAttribGroupEncoder = instrAttribGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
