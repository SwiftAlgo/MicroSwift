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


public class StrmAsgnRptGrpEncoder
{
    private static final int noAsgnReqsGroupCounterHeaderLength = 5;
    private static final byte[] noAsgnReqsGroupCounterHeader = new byte[] {49, 52, 57, 57, (byte) '='};



public static class AsgnReqsGroupEncoder
{
    private AsgnReqsGroupEncoder next = null;

    public AsgnReqsGroupEncoder next()
    {
        if (next == null)
        {
            next = new AsgnReqsGroupEncoder();
        }
        return next;
    }

    private final PartiesEncoder parties = new PartiesEncoder();
    public PartiesEncoder parties()
    {
        return parties;
    }

    private final StrmAsgnRptInstrmtGrpEncoder strmAsgnRptInstrmtGrp = new StrmAsgnRptInstrmtGrpEncoder();
    public StrmAsgnRptInstrmtGrpEncoder strmAsgnRptInstrmtGrp()
    {
        return strmAsgnRptInstrmtGrp;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

            position += parties.encode(buffer, position);

            position += strmAsgnRptInstrmtGrp.encode(buffer, position);
        if (next != null)
        {
            position += next.encode(buffer, position, remainingElements - 1);
        }
        return position - offset;
    }

    public void reset()
    {
        parties.reset();
        strmAsgnRptInstrmtGrp.reset();
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
        builder.append("\"MessageName\": \"AsgnReqsGroup\",\n");
    indent(builder, level);
    builder.append("\"Parties\": ");
    parties.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"StrmAsgnRptInstrmtGrp\": ");
    strmAsgnRptInstrmtGrp.appendTo(builder, level + 1);
    builder.append("\n");
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public AsgnReqsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((AsgnReqsGroupEncoder)encoder);
    }

    public AsgnReqsGroupEncoder copyTo(final AsgnReqsGroupEncoder encoder)
    {
        encoder.reset();

        parties.copyTo(encoder.parties());

        strmAsgnRptInstrmtGrp.copyTo(encoder.strmAsgnRptInstrmtGrp());        return encoder;
    }

}
    private int noAsgnReqsGroupCounter;

    private boolean hasNoAsgnReqsGroupCounter;

    public boolean hasNoAsgnReqsGroupCounter()
    {
        return hasNoAsgnReqsGroupCounter;
    }

    public StrmAsgnRptGrpEncoder noAsgnReqsGroupCounter(int value)
    {
        noAsgnReqsGroupCounter = value;
        hasNoAsgnReqsGroupCounter = true;
        return this;
    }

    public int noAsgnReqsGroupCounter()
    {
        return noAsgnReqsGroupCounter;
    }


    private AsgnReqsGroupEncoder asgnReqsGroup = null;

    public AsgnReqsGroupEncoder asgnReqsGroup(final int numberOfElements)
    {
        hasNoAsgnReqsGroupCounter = true;
        noAsgnReqsGroupCounter = numberOfElements;
        if (asgnReqsGroup == null)
        {
            asgnReqsGroup = new AsgnReqsGroupEncoder();
        }
        return asgnReqsGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoAsgnReqsGroupCounter)
        {
            buffer.putBytes(position, noAsgnReqsGroupCounterHeader, 0, noAsgnReqsGroupCounterHeaderLength);
            position += noAsgnReqsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noAsgnReqsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (asgnReqsGroup != null)
        {
            position += asgnReqsGroup.encode(buffer, position, noAsgnReqsGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetAsgnReqsGroup();
    }

    public void resetAsgnReqsGroup()
    {
        if (asgnReqsGroup != null)
        {
            asgnReqsGroup.reset();
        }
        noAsgnReqsGroupCounter = 0;
        hasNoAsgnReqsGroupCounter = false;
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
        builder.append("\"MessageName\": \"StrmAsgnRptGrp\",\n");
        if (hasNoAsgnReqsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"AsgnReqsGroup\": [\n");
            final int noAsgnReqsGroupCounter = this.noAsgnReqsGroupCounter;
            AsgnReqsGroupEncoder asgnReqsGroup = this.asgnReqsGroup;
            for (int i = 0; i < noAsgnReqsGroupCounter; i++)
            {
                indent(builder, level);
                asgnReqsGroup.appendTo(builder, level + 1);
                if (i < (noAsgnReqsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                asgnReqsGroup = asgnReqsGroup.next();
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
    public StrmAsgnRptGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((StrmAsgnRptGrpEncoder)encoder);
    }

    public StrmAsgnRptGrpEncoder copyTo(final StrmAsgnRptGrpEncoder encoder)
    {
        encoder.reset();
        if (hasNoAsgnReqsGroupCounter)
        {
            final int size = this.noAsgnReqsGroupCounter;
            AsgnReqsGroupEncoder asgnReqsGroup = this.asgnReqsGroup;
            AsgnReqsGroupEncoder asgnReqsGroupEncoder = encoder.asgnReqsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (asgnReqsGroup != null)
                {
                    asgnReqsGroup.copyTo(asgnReqsGroupEncoder);
                    asgnReqsGroup = asgnReqsGroup.next();
                    asgnReqsGroupEncoder = asgnReqsGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
