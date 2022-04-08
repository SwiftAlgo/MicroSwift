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


public class SettlDetailsEncoder
{
    private static final int noSettlDetailsGroupCounterHeaderLength = 5;
    private static final byte[] noSettlDetailsGroupCounterHeader = new byte[] {49, 49, 53, 56, (byte) '='};



public static class SettlDetailsGroupEncoder
{
    private SettlDetailsGroupEncoder next = null;

    public SettlDetailsGroupEncoder next()
    {
        if (next == null)
        {
            next = new SettlDetailsGroupEncoder();
        }
        return next;
    }

    private static final int settlObligSourceHeaderLength = 5;
    private static final byte[] settlObligSourceHeader = new byte[] {49, 49, 54, 52, (byte) '='};

    private char settlObligSource;

    private boolean hasSettlObligSource;

    public boolean hasSettlObligSource()
    {
        return hasSettlObligSource;
    }

    public SettlDetailsGroupEncoder settlObligSource(char value)
    {
        settlObligSource = value;
        hasSettlObligSource = true;
        return this;
    }

    public char settlObligSource()
    {
        return settlObligSource;
    }

    public SettlDetailsGroupEncoder settlObligSource(SettlObligSource value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == SettlObligSource.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: settlObligSource Value: " + value );
            }
            if (value == SettlObligSource.NULL_VAL)
            {
                return this;
            }
        }
        return settlObligSource(value.representation());
    }

    private final SettlPartiesEncoder settlParties = new SettlPartiesEncoder();
    public SettlPartiesEncoder settlParties()
    {
        return settlParties;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (hasSettlObligSource)
        {
            buffer.putBytes(position, settlObligSourceHeader, 0, settlObligSourceHeaderLength);
            position += settlObligSourceHeaderLength;
            position += buffer.putCharAscii(position, settlObligSource);
            buffer.putSeparator(position);
            position++;
        }

            position += settlParties.encode(buffer, position);
        if (next != null)
        {
            position += next.encode(buffer, position, remainingElements - 1);
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetSettlObligSource();
        settlParties.reset();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetSettlObligSource()
    {
        hasSettlObligSource = false;
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
        builder.append("\"MessageName\": \"SettlDetailsGroup\",\n");
        if (hasSettlObligSource())
        {
            indent(builder, level);
            builder.append("\"SettlObligSource\": \"");
            builder.append(settlObligSource);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"SettlParties\": ");
    settlParties.appendTo(builder, level + 1);
    builder.append("\n");
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public SettlDetailsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((SettlDetailsGroupEncoder)encoder);
    }

    public SettlDetailsGroupEncoder copyTo(final SettlDetailsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasSettlObligSource())
        {
            encoder.settlObligSource(this.settlObligSource());
        }


        settlParties.copyTo(encoder.settlParties());        return encoder;
    }

}
    private int noSettlDetailsGroupCounter;

    private boolean hasNoSettlDetailsGroupCounter;

    public boolean hasNoSettlDetailsGroupCounter()
    {
        return hasNoSettlDetailsGroupCounter;
    }

    public SettlDetailsEncoder noSettlDetailsGroupCounter(int value)
    {
        noSettlDetailsGroupCounter = value;
        hasNoSettlDetailsGroupCounter = true;
        return this;
    }

    public int noSettlDetailsGroupCounter()
    {
        return noSettlDetailsGroupCounter;
    }


    private SettlDetailsGroupEncoder settlDetailsGroup = null;

    public SettlDetailsGroupEncoder settlDetailsGroup(final int numberOfElements)
    {
        hasNoSettlDetailsGroupCounter = true;
        noSettlDetailsGroupCounter = numberOfElements;
        if (settlDetailsGroup == null)
        {
            settlDetailsGroup = new SettlDetailsGroupEncoder();
        }
        return settlDetailsGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoSettlDetailsGroupCounter)
        {
            buffer.putBytes(position, noSettlDetailsGroupCounterHeader, 0, noSettlDetailsGroupCounterHeaderLength);
            position += noSettlDetailsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noSettlDetailsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (settlDetailsGroup != null)
        {
            position += settlDetailsGroup.encode(buffer, position, noSettlDetailsGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetSettlDetailsGroup();
    }

    public void resetSettlDetailsGroup()
    {
        if (settlDetailsGroup != null)
        {
            settlDetailsGroup.reset();
        }
        noSettlDetailsGroupCounter = 0;
        hasNoSettlDetailsGroupCounter = false;
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
        builder.append("\"MessageName\": \"SettlDetails\",\n");
        if (hasNoSettlDetailsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"SettlDetailsGroup\": [\n");
            final int noSettlDetailsGroupCounter = this.noSettlDetailsGroupCounter;
            SettlDetailsGroupEncoder settlDetailsGroup = this.settlDetailsGroup;
            for (int i = 0; i < noSettlDetailsGroupCounter; i++)
            {
                indent(builder, level);
                settlDetailsGroup.appendTo(builder, level + 1);
                if (i < (noSettlDetailsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                settlDetailsGroup = settlDetailsGroup.next();
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
    public SettlDetailsEncoder copyTo(final Encoder encoder)
    {
        return copyTo((SettlDetailsEncoder)encoder);
    }

    public SettlDetailsEncoder copyTo(final SettlDetailsEncoder encoder)
    {
        encoder.reset();
        if (hasNoSettlDetailsGroupCounter)
        {
            final int size = this.noSettlDetailsGroupCounter;
            SettlDetailsGroupEncoder settlDetailsGroup = this.settlDetailsGroup;
            SettlDetailsGroupEncoder settlDetailsGroupEncoder = encoder.settlDetailsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (settlDetailsGroup != null)
                {
                    settlDetailsGroup.copyTo(settlDetailsGroupEncoder);
                    settlDetailsGroup = settlDetailsGroup.next();
                    settlDetailsGroupEncoder = settlDetailsGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
