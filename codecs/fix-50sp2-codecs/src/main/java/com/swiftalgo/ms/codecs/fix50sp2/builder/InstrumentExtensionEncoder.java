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


public class InstrumentExtensionEncoder
{
    private static final int deliveryFormHeaderLength = 4;
    private static final byte[] deliveryFormHeader = new byte[] {54, 54, 56, (byte) '='};

    private static final int pctAtRiskHeaderLength = 4;
    private static final byte[] pctAtRiskHeader = new byte[] {56, 54, 57, (byte) '='};

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

    private final AttrbGrpEncoder attrbGrp = new AttrbGrpEncoder();
    public AttrbGrpEncoder attrbGrp()
    {
        return attrbGrp;
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

            position += attrbGrp.encode(buffer, position);
        return position - offset;
    }

    public void reset()
    {
        this.resetDeliveryForm();
        this.resetPctAtRisk();
        attrbGrp.reset();
    }

    public void resetDeliveryForm()
    {
        hasDeliveryForm = false;
    }

    public void resetPctAtRisk()
    {
        hasPctAtRisk = false;
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

    indent(builder, level);
    builder.append("\"AttrbGrp\": ");
    attrbGrp.appendTo(builder, level + 1);
    builder.append("\n");
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


        attrbGrp.copyTo(encoder.attrbGrp());        return encoder;
    }

}
