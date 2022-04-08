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


public class TrdRepIndicatorsGrpEncoder
{
    private static final int noTrdRepIndicatorsGroupCounterHeaderLength = 5;
    private static final byte[] noTrdRepIndicatorsGroupCounterHeader = new byte[] {49, 51, 56, 55, (byte) '='};



public static class TrdRepIndicatorsGroupEncoder
{
    private TrdRepIndicatorsGroupEncoder next = null;

    public TrdRepIndicatorsGroupEncoder next()
    {
        if (next == null)
        {
            next = new TrdRepIndicatorsGroupEncoder();
        }
        return next;
    }

    private static final int trdRepPartyRoleHeaderLength = 5;
    private static final byte[] trdRepPartyRoleHeader = new byte[] {49, 51, 56, 56, (byte) '='};

    private static final int trdRepIndicatorHeaderLength = 5;
    private static final byte[] trdRepIndicatorHeader = new byte[] {49, 51, 56, 57, (byte) '='};

    private int trdRepPartyRole;

    private boolean hasTrdRepPartyRole;

    public boolean hasTrdRepPartyRole()
    {
        return hasTrdRepPartyRole;
    }

    public TrdRepIndicatorsGroupEncoder trdRepPartyRole(int value)
    {
        trdRepPartyRole = value;
        hasTrdRepPartyRole = true;
        return this;
    }

    public int trdRepPartyRole()
    {
        return trdRepPartyRole;
    }

    private boolean trdRepIndicator;

    private boolean hasTrdRepIndicator;

    public boolean hasTrdRepIndicator()
    {
        return hasTrdRepIndicator;
    }

    public TrdRepIndicatorsGroupEncoder trdRepIndicator(boolean value)
    {
        trdRepIndicator = value;
        hasTrdRepIndicator = true;
        return this;
    }

    public boolean trdRepIndicator()
    {
        return trdRepIndicator;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (hasTrdRepPartyRole)
        {
            buffer.putBytes(position, trdRepPartyRoleHeader, 0, trdRepPartyRoleHeaderLength);
            position += trdRepPartyRoleHeaderLength;
            position += buffer.putIntAscii(position, trdRepPartyRole);
            buffer.putSeparator(position);
            position++;
        }

        if (hasTrdRepIndicator)
        {
            buffer.putBytes(position, trdRepIndicatorHeader, 0, trdRepIndicatorHeaderLength);
            position += trdRepIndicatorHeaderLength;
            position += buffer.putBooleanAscii(position, trdRepIndicator);
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
        this.resetTrdRepPartyRole();
        this.resetTrdRepIndicator();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetTrdRepPartyRole()
    {
        hasTrdRepPartyRole = false;
    }

    public void resetTrdRepIndicator()
    {
        hasTrdRepIndicator = false;
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
        builder.append("\"MessageName\": \"TrdRepIndicatorsGroup\",\n");
        if (hasTrdRepPartyRole())
        {
            indent(builder, level);
            builder.append("\"TrdRepPartyRole\": \"");
            builder.append(trdRepPartyRole);
            builder.append("\",\n");
        }

        if (hasTrdRepIndicator())
        {
            indent(builder, level);
            builder.append("\"TrdRepIndicator\": \"");
            builder.append(trdRepIndicator);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public TrdRepIndicatorsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((TrdRepIndicatorsGroupEncoder)encoder);
    }

    public TrdRepIndicatorsGroupEncoder copyTo(final TrdRepIndicatorsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasTrdRepPartyRole())
        {
            encoder.trdRepPartyRole(this.trdRepPartyRole());
        }

        if (hasTrdRepIndicator())
        {
            encoder.trdRepIndicator(this.trdRepIndicator());
        }
        return encoder;
    }

}
    private int noTrdRepIndicatorsGroupCounter;

    private boolean hasNoTrdRepIndicatorsGroupCounter;

    public boolean hasNoTrdRepIndicatorsGroupCounter()
    {
        return hasNoTrdRepIndicatorsGroupCounter;
    }

    public TrdRepIndicatorsGrpEncoder noTrdRepIndicatorsGroupCounter(int value)
    {
        noTrdRepIndicatorsGroupCounter = value;
        hasNoTrdRepIndicatorsGroupCounter = true;
        return this;
    }

    public int noTrdRepIndicatorsGroupCounter()
    {
        return noTrdRepIndicatorsGroupCounter;
    }


    private TrdRepIndicatorsGroupEncoder trdRepIndicatorsGroup = null;

    public TrdRepIndicatorsGroupEncoder trdRepIndicatorsGroup(final int numberOfElements)
    {
        hasNoTrdRepIndicatorsGroupCounter = true;
        noTrdRepIndicatorsGroupCounter = numberOfElements;
        if (trdRepIndicatorsGroup == null)
        {
            trdRepIndicatorsGroup = new TrdRepIndicatorsGroupEncoder();
        }
        return trdRepIndicatorsGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoTrdRepIndicatorsGroupCounter)
        {
            buffer.putBytes(position, noTrdRepIndicatorsGroupCounterHeader, 0, noTrdRepIndicatorsGroupCounterHeaderLength);
            position += noTrdRepIndicatorsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noTrdRepIndicatorsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (trdRepIndicatorsGroup != null)
        {
            position += trdRepIndicatorsGroup.encode(buffer, position, noTrdRepIndicatorsGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetTrdRepIndicatorsGroup();
    }

    public void resetTrdRepIndicatorsGroup()
    {
        if (trdRepIndicatorsGroup != null)
        {
            trdRepIndicatorsGroup.reset();
        }
        noTrdRepIndicatorsGroupCounter = 0;
        hasNoTrdRepIndicatorsGroupCounter = false;
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
        builder.append("\"MessageName\": \"TrdRepIndicatorsGrp\",\n");
        if (hasNoTrdRepIndicatorsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"TrdRepIndicatorsGroup\": [\n");
            final int noTrdRepIndicatorsGroupCounter = this.noTrdRepIndicatorsGroupCounter;
            TrdRepIndicatorsGroupEncoder trdRepIndicatorsGroup = this.trdRepIndicatorsGroup;
            for (int i = 0; i < noTrdRepIndicatorsGroupCounter; i++)
            {
                indent(builder, level);
                trdRepIndicatorsGroup.appendTo(builder, level + 1);
                if (i < (noTrdRepIndicatorsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                trdRepIndicatorsGroup = trdRepIndicatorsGroup.next();
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
    public TrdRepIndicatorsGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((TrdRepIndicatorsGrpEncoder)encoder);
    }

    public TrdRepIndicatorsGrpEncoder copyTo(final TrdRepIndicatorsGrpEncoder encoder)
    {
        encoder.reset();
        if (hasNoTrdRepIndicatorsGroupCounter)
        {
            final int size = this.noTrdRepIndicatorsGroupCounter;
            TrdRepIndicatorsGroupEncoder trdRepIndicatorsGroup = this.trdRepIndicatorsGroup;
            TrdRepIndicatorsGroupEncoder trdRepIndicatorsGroupEncoder = encoder.trdRepIndicatorsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (trdRepIndicatorsGroup != null)
                {
                    trdRepIndicatorsGroup.copyTo(trdRepIndicatorsGroupEncoder);
                    trdRepIndicatorsGroup = trdRepIndicatorsGroup.next();
                    trdRepIndicatorsGroupEncoder = trdRepIndicatorsGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
