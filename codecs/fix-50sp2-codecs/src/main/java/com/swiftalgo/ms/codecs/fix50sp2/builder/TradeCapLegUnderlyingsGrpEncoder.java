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


public class TradeCapLegUnderlyingsGrpEncoder
{
    private static final int noOfLegUnderlyingsGroupCounterHeaderLength = 5;
    private static final byte[] noOfLegUnderlyingsGroupCounterHeader = new byte[] {49, 51, 52, 50, (byte) '='};



public static class OfLegUnderlyingsGroupEncoder
{
    private OfLegUnderlyingsGroupEncoder next = null;

    public OfLegUnderlyingsGroupEncoder next()
    {
        if (next == null)
        {
            next = new OfLegUnderlyingsGroupEncoder();
        }
        return next;
    }

    private final UnderlyingLegInstrumentEncoder underlyingLegInstrument = new UnderlyingLegInstrumentEncoder();
    public UnderlyingLegInstrumentEncoder underlyingLegInstrument()
    {
        return underlyingLegInstrument;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

            position += underlyingLegInstrument.encode(buffer, position);
        if (next != null)
        {
            position += next.encode(buffer, position, remainingElements - 1);
        }
        return position - offset;
    }

    public void reset()
    {
        underlyingLegInstrument.reset();
        if (next != null)        {
            next.reset();
        }
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
        builder.append("\"MessageName\": \"OfLegUnderlyingsGroup\",\n");
    indent(builder, level);
    builder.append("\"UnderlyingLegInstrument\": ");
    underlyingLegInstrument.appendTo(builder, level + 1);
    builder.append("\n");
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public OfLegUnderlyingsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((OfLegUnderlyingsGroupEncoder)encoder);
    }

    public OfLegUnderlyingsGroupEncoder copyTo(final OfLegUnderlyingsGroupEncoder encoder)
    {
        encoder.reset();

        underlyingLegInstrument.copyTo(encoder.underlyingLegInstrument());        return encoder;
    }

}
    private int noOfLegUnderlyingsGroupCounter;

    private boolean hasNoOfLegUnderlyingsGroupCounter;

    public boolean hasNoOfLegUnderlyingsGroupCounter()
    {
        return hasNoOfLegUnderlyingsGroupCounter;
    }

    public TradeCapLegUnderlyingsGrpEncoder noOfLegUnderlyingsGroupCounter(int value)
    {
        noOfLegUnderlyingsGroupCounter = value;
        hasNoOfLegUnderlyingsGroupCounter = true;
        return this;
    }

    public int noOfLegUnderlyingsGroupCounter()
    {
        return noOfLegUnderlyingsGroupCounter;
    }


    private OfLegUnderlyingsGroupEncoder ofLegUnderlyingsGroup = null;

    public OfLegUnderlyingsGroupEncoder ofLegUnderlyingsGroup(final int numberOfElements)
    {
        hasNoOfLegUnderlyingsGroupCounter = true;
        noOfLegUnderlyingsGroupCounter = numberOfElements;
        if (ofLegUnderlyingsGroup == null)
        {
            ofLegUnderlyingsGroup = new OfLegUnderlyingsGroupEncoder();
        }
        return ofLegUnderlyingsGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoOfLegUnderlyingsGroupCounter)
        {
            buffer.putBytes(position, noOfLegUnderlyingsGroupCounterHeader, 0, noOfLegUnderlyingsGroupCounterHeaderLength);
            position += noOfLegUnderlyingsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noOfLegUnderlyingsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (ofLegUnderlyingsGroup != null)
        {
            position += ofLegUnderlyingsGroup.encode(buffer, position, noOfLegUnderlyingsGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetOfLegUnderlyingsGroup();
    }

    public void resetOfLegUnderlyingsGroup()
    {
        if (ofLegUnderlyingsGroup != null)
        {
            ofLegUnderlyingsGroup.reset();
        }
        noOfLegUnderlyingsGroupCounter = 0;
        hasNoOfLegUnderlyingsGroupCounter = false;
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
        builder.append("\"MessageName\": \"TradeCapLegUnderlyingsGrp\",\n");
        if (hasNoOfLegUnderlyingsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"OfLegUnderlyingsGroup\": [\n");
            final int noOfLegUnderlyingsGroupCounter = this.noOfLegUnderlyingsGroupCounter;
            OfLegUnderlyingsGroupEncoder ofLegUnderlyingsGroup = this.ofLegUnderlyingsGroup;
            for (int i = 0; i < noOfLegUnderlyingsGroupCounter; i++)
            {
                indent(builder, level);
                ofLegUnderlyingsGroup.appendTo(builder, level + 1);
                if (i < (noOfLegUnderlyingsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                ofLegUnderlyingsGroup = ofLegUnderlyingsGroup.next();
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
    public TradeCapLegUnderlyingsGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((TradeCapLegUnderlyingsGrpEncoder)encoder);
    }

    public TradeCapLegUnderlyingsGrpEncoder copyTo(final TradeCapLegUnderlyingsGrpEncoder encoder)
    {
        encoder.reset();
        if (hasNoOfLegUnderlyingsGroupCounter)
        {
            final int size = this.noOfLegUnderlyingsGroupCounter;
            OfLegUnderlyingsGroupEncoder ofLegUnderlyingsGroup = this.ofLegUnderlyingsGroup;
            OfLegUnderlyingsGroupEncoder ofLegUnderlyingsGroupEncoder = encoder.ofLegUnderlyingsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (ofLegUnderlyingsGroup != null)
                {
                    ofLegUnderlyingsGroup.copyTo(ofLegUnderlyingsGroupEncoder);
                    ofLegUnderlyingsGroup = ofLegUnderlyingsGroup.next();
                    ofLegUnderlyingsGroupEncoder = ofLegUnderlyingsGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
