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


public class OrdTypeRulesEncoder
{
    private static final int noOrdTypeRulesGroupCounterHeaderLength = 5;
    private static final byte[] noOrdTypeRulesGroupCounterHeader = new byte[] {49, 50, 51, 55, (byte) '='};



public static class OrdTypeRulesGroupEncoder
{
    private OrdTypeRulesGroupEncoder next = null;

    public OrdTypeRulesGroupEncoder next()
    {
        if (next == null)
        {
            next = new OrdTypeRulesGroupEncoder();
        }
        return next;
    }

    private static final int ordTypeHeaderLength = 3;
    private static final byte[] ordTypeHeader = new byte[] {52, 48, (byte) '='};

    private char ordType;

    private boolean hasOrdType;

    public boolean hasOrdType()
    {
        return hasOrdType;
    }

    public OrdTypeRulesGroupEncoder ordType(char value)
    {
        ordType = value;
        hasOrdType = true;
        return this;
    }

    public char ordType()
    {
        return ordType;
    }

    public OrdTypeRulesGroupEncoder ordType(OrdType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == OrdType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: ordType Value: " + value );
            }
            if (value == OrdType.NULL_VAL)
            {
                return this;
            }
        }
        return ordType(value.representation());
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (hasOrdType)
        {
            buffer.putBytes(position, ordTypeHeader, 0, ordTypeHeaderLength);
            position += ordTypeHeaderLength;
            position += buffer.putCharAscii(position, ordType);
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
        this.resetOrdType();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetOrdType()
    {
        hasOrdType = false;
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
        builder.append("\"MessageName\": \"OrdTypeRulesGroup\",\n");
        if (hasOrdType())
        {
            indent(builder, level);
            builder.append("\"OrdType\": \"");
            builder.append(ordType);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public OrdTypeRulesGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((OrdTypeRulesGroupEncoder)encoder);
    }

    public OrdTypeRulesGroupEncoder copyTo(final OrdTypeRulesGroupEncoder encoder)
    {
        encoder.reset();
        if (hasOrdType())
        {
            encoder.ordType(this.ordType());
        }
        return encoder;
    }

}
    private int noOrdTypeRulesGroupCounter;

    private boolean hasNoOrdTypeRulesGroupCounter;

    public boolean hasNoOrdTypeRulesGroupCounter()
    {
        return hasNoOrdTypeRulesGroupCounter;
    }

    public OrdTypeRulesEncoder noOrdTypeRulesGroupCounter(int value)
    {
        noOrdTypeRulesGroupCounter = value;
        hasNoOrdTypeRulesGroupCounter = true;
        return this;
    }

    public int noOrdTypeRulesGroupCounter()
    {
        return noOrdTypeRulesGroupCounter;
    }


    private OrdTypeRulesGroupEncoder ordTypeRulesGroup = null;

    public OrdTypeRulesGroupEncoder ordTypeRulesGroup(final int numberOfElements)
    {
        hasNoOrdTypeRulesGroupCounter = true;
        noOrdTypeRulesGroupCounter = numberOfElements;
        if (ordTypeRulesGroup == null)
        {
            ordTypeRulesGroup = new OrdTypeRulesGroupEncoder();
        }
        return ordTypeRulesGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoOrdTypeRulesGroupCounter)
        {
            buffer.putBytes(position, noOrdTypeRulesGroupCounterHeader, 0, noOrdTypeRulesGroupCounterHeaderLength);
            position += noOrdTypeRulesGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noOrdTypeRulesGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (ordTypeRulesGroup != null)
        {
            position += ordTypeRulesGroup.encode(buffer, position, noOrdTypeRulesGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetOrdTypeRulesGroup();
    }

    public void resetOrdTypeRulesGroup()
    {
        if (ordTypeRulesGroup != null)
        {
            ordTypeRulesGroup.reset();
        }
        noOrdTypeRulesGroupCounter = 0;
        hasNoOrdTypeRulesGroupCounter = false;
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
        builder.append("\"MessageName\": \"OrdTypeRules\",\n");
        if (hasNoOrdTypeRulesGroupCounter)
        {
            indent(builder, level);
            builder.append("\"OrdTypeRulesGroup\": [\n");
            final int noOrdTypeRulesGroupCounter = this.noOrdTypeRulesGroupCounter;
            OrdTypeRulesGroupEncoder ordTypeRulesGroup = this.ordTypeRulesGroup;
            for (int i = 0; i < noOrdTypeRulesGroupCounter; i++)
            {
                indent(builder, level);
                ordTypeRulesGroup.appendTo(builder, level + 1);
                if (i < (noOrdTypeRulesGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                ordTypeRulesGroup = ordTypeRulesGroup.next();
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
    public OrdTypeRulesEncoder copyTo(final Encoder encoder)
    {
        return copyTo((OrdTypeRulesEncoder)encoder);
    }

    public OrdTypeRulesEncoder copyTo(final OrdTypeRulesEncoder encoder)
    {
        encoder.reset();
        if (hasNoOrdTypeRulesGroupCounter)
        {
            final int size = this.noOrdTypeRulesGroupCounter;
            OrdTypeRulesGroupEncoder ordTypeRulesGroup = this.ordTypeRulesGroup;
            OrdTypeRulesGroupEncoder ordTypeRulesGroupEncoder = encoder.ordTypeRulesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (ordTypeRulesGroup != null)
                {
                    ordTypeRulesGroup.copyTo(ordTypeRulesGroupEncoder);
                    ordTypeRulesGroup = ordTypeRulesGroup.next();
                    ordTypeRulesGroupEncoder = ordTypeRulesGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
