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


public class CollInqQualGrpEncoder
{
    private static final int noCollInquiryQualifierGroupCounterHeaderLength = 4;
    private static final byte[] noCollInquiryQualifierGroupCounterHeader = new byte[] {57, 51, 56, (byte) '='};



public static class CollInquiryQualifierGroupEncoder
{
    private CollInquiryQualifierGroupEncoder next = null;

    public CollInquiryQualifierGroupEncoder next()
    {
        if (next == null)
        {
            next = new CollInquiryQualifierGroupEncoder();
        }
        return next;
    }

    private static final int collInquiryQualifierHeaderLength = 4;
    private static final byte[] collInquiryQualifierHeader = new byte[] {56, 57, 54, (byte) '='};

    private int collInquiryQualifier;

    private boolean hasCollInquiryQualifier;

    public boolean hasCollInquiryQualifier()
    {
        return hasCollInquiryQualifier;
    }

    public CollInquiryQualifierGroupEncoder collInquiryQualifier(int value)
    {
        collInquiryQualifier = value;
        hasCollInquiryQualifier = true;
        return this;
    }

    public int collInquiryQualifier()
    {
        return collInquiryQualifier;
    }

    public CollInquiryQualifierGroupEncoder collInquiryQualifier(CollInquiryQualifier value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == CollInquiryQualifier.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: collInquiryQualifier Value: " + value );
            }
            if (value == CollInquiryQualifier.NULL_VAL)
            {
                return this;
            }
        }
        return collInquiryQualifier(value.representation());
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (hasCollInquiryQualifier)
        {
            buffer.putBytes(position, collInquiryQualifierHeader, 0, collInquiryQualifierHeaderLength);
            position += collInquiryQualifierHeaderLength;
            position += buffer.putIntAscii(position, collInquiryQualifier);
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
        this.resetCollInquiryQualifier();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetCollInquiryQualifier()
    {
        hasCollInquiryQualifier = false;
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
        builder.append("\"MessageName\": \"CollInquiryQualifierGroup\",\n");
        if (hasCollInquiryQualifier())
        {
            indent(builder, level);
            builder.append("\"CollInquiryQualifier\": \"");
            builder.append(collInquiryQualifier);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public CollInquiryQualifierGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((CollInquiryQualifierGroupEncoder)encoder);
    }

    public CollInquiryQualifierGroupEncoder copyTo(final CollInquiryQualifierGroupEncoder encoder)
    {
        encoder.reset();
        if (hasCollInquiryQualifier())
        {
            encoder.collInquiryQualifier(this.collInquiryQualifier());
        }
        return encoder;
    }

}
    private int noCollInquiryQualifierGroupCounter;

    private boolean hasNoCollInquiryQualifierGroupCounter;

    public boolean hasNoCollInquiryQualifierGroupCounter()
    {
        return hasNoCollInquiryQualifierGroupCounter;
    }

    public CollInqQualGrpEncoder noCollInquiryQualifierGroupCounter(int value)
    {
        noCollInquiryQualifierGroupCounter = value;
        hasNoCollInquiryQualifierGroupCounter = true;
        return this;
    }

    public int noCollInquiryQualifierGroupCounter()
    {
        return noCollInquiryQualifierGroupCounter;
    }


    private CollInquiryQualifierGroupEncoder collInquiryQualifierGroup = null;

    public CollInquiryQualifierGroupEncoder collInquiryQualifierGroup(final int numberOfElements)
    {
        hasNoCollInquiryQualifierGroupCounter = true;
        noCollInquiryQualifierGroupCounter = numberOfElements;
        if (collInquiryQualifierGroup == null)
        {
            collInquiryQualifierGroup = new CollInquiryQualifierGroupEncoder();
        }
        return collInquiryQualifierGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoCollInquiryQualifierGroupCounter)
        {
            buffer.putBytes(position, noCollInquiryQualifierGroupCounterHeader, 0, noCollInquiryQualifierGroupCounterHeaderLength);
            position += noCollInquiryQualifierGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noCollInquiryQualifierGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (collInquiryQualifierGroup != null)
        {
            position += collInquiryQualifierGroup.encode(buffer, position, noCollInquiryQualifierGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetCollInquiryQualifierGroup();
    }

    public void resetCollInquiryQualifierGroup()
    {
        if (collInquiryQualifierGroup != null)
        {
            collInquiryQualifierGroup.reset();
        }
        noCollInquiryQualifierGroupCounter = 0;
        hasNoCollInquiryQualifierGroupCounter = false;
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
        builder.append("\"MessageName\": \"CollInqQualGrp\",\n");
        if (hasNoCollInquiryQualifierGroupCounter)
        {
            indent(builder, level);
            builder.append("\"CollInquiryQualifierGroup\": [\n");
            final int noCollInquiryQualifierGroupCounter = this.noCollInquiryQualifierGroupCounter;
            CollInquiryQualifierGroupEncoder collInquiryQualifierGroup = this.collInquiryQualifierGroup;
            for (int i = 0; i < noCollInquiryQualifierGroupCounter; i++)
            {
                indent(builder, level);
                collInquiryQualifierGroup.appendTo(builder, level + 1);
                if (i < (noCollInquiryQualifierGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                collInquiryQualifierGroup = collInquiryQualifierGroup.next();
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
    public CollInqQualGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((CollInqQualGrpEncoder)encoder);
    }

    public CollInqQualGrpEncoder copyTo(final CollInqQualGrpEncoder encoder)
    {
        encoder.reset();
        if (hasNoCollInquiryQualifierGroupCounter)
        {
            final int size = this.noCollInquiryQualifierGroupCounter;
            CollInquiryQualifierGroupEncoder collInquiryQualifierGroup = this.collInquiryQualifierGroup;
            CollInquiryQualifierGroupEncoder collInquiryQualifierGroupEncoder = encoder.collInquiryQualifierGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (collInquiryQualifierGroup != null)
                {
                    collInquiryQualifierGroup.copyTo(collInquiryQualifierGroupEncoder);
                    collInquiryQualifierGroup = collInquiryQualifierGroup.next();
                    collInquiryQualifierGroupEncoder = collInquiryQualifierGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
