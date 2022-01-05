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


public class RateSourceEncoder
{
    private static final int noRateSourcesGroupCounterHeaderLength = 5;
    private static final byte[] noRateSourcesGroupCounterHeader = new byte[] {49, 52, 52, 53, (byte) '='};



public static class RateSourcesGroupEncoder
{
    private RateSourcesGroupEncoder next = null;

    public RateSourcesGroupEncoder next()
    {
        if (next == null)
        {
            next = new RateSourcesGroupEncoder();
        }
        return next;
    }

    private static final int rateSourceHeaderLength = 5;
    private static final byte[] rateSourceHeader = new byte[] {49, 52, 52, 54, (byte) '='};

    private static final int rateSourceTypeHeaderLength = 5;
    private static final byte[] rateSourceTypeHeader = new byte[] {49, 52, 52, 55, (byte) '='};

    private static final int referencePageHeaderLength = 5;
    private static final byte[] referencePageHeader = new byte[] {49, 52, 52, 56, (byte) '='};

    private int rateSource;

    private boolean hasRateSource;

    public boolean hasRateSource()
    {
        return hasRateSource;
    }

    public RateSourcesGroupEncoder rateSource(int value)
    {
        rateSource = value;
        hasRateSource = true;
        return this;
    }

    public int rateSource()
    {
        return rateSource;
    }

    public RateSourcesGroupEncoder rateSource(RateSource value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == RateSource.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: rateSource Value: " + value );
            }
            if (value == RateSource.NULL_VAL)
            {
                return this;
            }
        }
        return rateSource(value.representation());
    }

    private int rateSourceType;

    private boolean hasRateSourceType;

    public boolean hasRateSourceType()
    {
        return hasRateSourceType;
    }

    public RateSourcesGroupEncoder rateSourceType(int value)
    {
        rateSourceType = value;
        hasRateSourceType = true;
        return this;
    }

    public int rateSourceType()
    {
        return rateSourceType;
    }

    public RateSourcesGroupEncoder rateSourceType(RateSourceType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == RateSourceType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: rateSourceType Value: " + value );
            }
            if (value == RateSourceType.NULL_VAL)
            {
                return this;
            }
        }
        return rateSourceType(value.representation());
    }

    private final MutableDirectBuffer referencePage = new UnsafeBuffer();

    private int referencePageOffset = 0;

    private int referencePageLength = 0;

    public RateSourcesGroupEncoder referencePage(final DirectBuffer value, final int offset, final int length)
    {
        referencePage.wrap(value);
        referencePageOffset = offset;
        referencePageLength = length;
        return this;
    }

    public RateSourcesGroupEncoder referencePage(final DirectBuffer value, final int length)
    {
        return referencePage(value, 0, length);
    }

    public RateSourcesGroupEncoder referencePage(final DirectBuffer value)
    {
        return referencePage(value, 0, value.capacity());
    }

    public RateSourcesGroupEncoder referencePage(final byte[] value, final int offset, final int length)
    {
        referencePage.wrap(value);
        referencePageOffset = offset;
        referencePageLength = length;
        return this;
    }

    public RateSourcesGroupEncoder referencePageAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(referencePage, value, offset, length);
        referencePageOffset = offset;
        referencePageLength = length;
        return this;
    }

    public RateSourcesGroupEncoder referencePage(final byte[] value, final int length)
    {
        return referencePage(value, 0, length);
    }

    public RateSourcesGroupEncoder referencePage(final byte[] value)
    {
        return referencePage(value, 0, value.length);
    }

    public boolean hasReferencePage()
    {
        return referencePageLength > 0;
    }

    public MutableDirectBuffer referencePage()
    {
        return referencePage;
    }

    public String referencePageAsString()
    {
        return referencePage.getStringWithoutLengthAscii(referencePageOffset, referencePageLength);
    }

    public RateSourcesGroupEncoder referencePage(final CharSequence value)
    {
        toBytes(value, referencePage);
        referencePageOffset = 0;
        referencePageLength = value.length();
        return this;
    }

    public RateSourcesGroupEncoder referencePage(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            referencePage.wrap(buffer);
            referencePageOffset = value.offset();
            referencePageLength = value.length();
        }
        return this;
    }

    public RateSourcesGroupEncoder referencePage(final char[] value)
    {
        return referencePage(value, 0, value.length);
    }

    public RateSourcesGroupEncoder referencePage(final char[] value, final int length)
    {
        return referencePage(value, 0, length);
    }

    public RateSourcesGroupEncoder referencePage(final char[] value, final int offset, final int length)
    {
        toBytes(value, referencePage, offset, length);
        referencePageOffset = 0;
        referencePageLength = length;
        return this;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (hasRateSource)
        {
            buffer.putBytes(position, rateSourceHeader, 0, rateSourceHeaderLength);
            position += rateSourceHeaderLength;
            position += buffer.putIntAscii(position, rateSource);
            buffer.putSeparator(position);
            position++;
        }

        if (hasRateSourceType)
        {
            buffer.putBytes(position, rateSourceTypeHeader, 0, rateSourceTypeHeaderLength);
            position += rateSourceTypeHeaderLength;
            position += buffer.putIntAscii(position, rateSourceType);
            buffer.putSeparator(position);
            position++;
        }

        if (referencePageLength > 0)
        {
            buffer.putBytes(position, referencePageHeader, 0, referencePageHeaderLength);
            position += referencePageHeaderLength;
            buffer.putBytes(position, referencePage, referencePageOffset, referencePageLength);
            position += referencePageLength;
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
        this.resetRateSource();
        this.resetRateSourceType();
        this.resetReferencePage();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetRateSource()
    {
        hasRateSource = false;
    }

    public void resetRateSourceType()
    {
        hasRateSourceType = false;
    }

    public void resetReferencePage()
    {
        referencePageLength = 0;
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
        builder.append("\"MessageName\": \"RateSourcesGroup\",\n");
        if (hasRateSource())
        {
            indent(builder, level);
            builder.append("\"RateSource\": \"");
            builder.append(rateSource);
            builder.append("\",\n");
        }

        if (hasRateSourceType())
        {
            indent(builder, level);
            builder.append("\"RateSourceType\": \"");
            builder.append(rateSourceType);
            builder.append("\",\n");
        }

        if (hasReferencePage())
        {
            indent(builder, level);
            builder.append("\"ReferencePage\": \"");
            appendBuffer(builder, referencePage, referencePageOffset, referencePageLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public RateSourcesGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((RateSourcesGroupEncoder)encoder);
    }

    public RateSourcesGroupEncoder copyTo(final RateSourcesGroupEncoder encoder)
    {
        encoder.reset();
        if (hasRateSource())
        {
            encoder.rateSource(this.rateSource());
        }

        if (hasRateSourceType())
        {
            encoder.rateSourceType(this.rateSourceType());
        }

        if (hasReferencePage())
        {
            encoder.referencePageAsCopy(referencePage.byteArray(), 0, referencePageLength);
        }
        return encoder;
    }

}
    private int noRateSourcesGroupCounter;

    private boolean hasNoRateSourcesGroupCounter;

    public boolean hasNoRateSourcesGroupCounter()
    {
        return hasNoRateSourcesGroupCounter;
    }

    public RateSourceEncoder noRateSourcesGroupCounter(int value)
    {
        noRateSourcesGroupCounter = value;
        hasNoRateSourcesGroupCounter = true;
        return this;
    }

    public int noRateSourcesGroupCounter()
    {
        return noRateSourcesGroupCounter;
    }


    private RateSourcesGroupEncoder rateSourcesGroup = null;

    public RateSourcesGroupEncoder rateSourcesGroup(final int numberOfElements)
    {
        hasNoRateSourcesGroupCounter = true;
        noRateSourcesGroupCounter = numberOfElements;
        if (rateSourcesGroup == null)
        {
            rateSourcesGroup = new RateSourcesGroupEncoder();
        }
        return rateSourcesGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoRateSourcesGroupCounter)
        {
            buffer.putBytes(position, noRateSourcesGroupCounterHeader, 0, noRateSourcesGroupCounterHeaderLength);
            position += noRateSourcesGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noRateSourcesGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (rateSourcesGroup != null)
        {
            position += rateSourcesGroup.encode(buffer, position, noRateSourcesGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetRateSourcesGroup();
    }

    public void resetRateSourcesGroup()
    {
        if (rateSourcesGroup != null)
        {
            rateSourcesGroup.reset();
        }
        noRateSourcesGroupCounter = 0;
        hasNoRateSourcesGroupCounter = false;
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
        builder.append("\"MessageName\": \"RateSource\",\n");
        if (hasNoRateSourcesGroupCounter)
        {
            indent(builder, level);
            builder.append("\"RateSourcesGroup\": [\n");
            final int noRateSourcesGroupCounter = this.noRateSourcesGroupCounter;
            RateSourcesGroupEncoder rateSourcesGroup = this.rateSourcesGroup;
            for (int i = 0; i < noRateSourcesGroupCounter; i++)
            {
                indent(builder, level);
                rateSourcesGroup.appendTo(builder, level + 1);
                if (i < (noRateSourcesGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                rateSourcesGroup = rateSourcesGroup.next();
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
    public RateSourceEncoder copyTo(final Encoder encoder)
    {
        return copyTo((RateSourceEncoder)encoder);
    }

    public RateSourceEncoder copyTo(final RateSourceEncoder encoder)
    {
        encoder.reset();
        if (hasNoRateSourcesGroupCounter)
        {
            final int size = this.noRateSourcesGroupCounter;
            RateSourcesGroupEncoder rateSourcesGroup = this.rateSourcesGroup;
            RateSourcesGroupEncoder rateSourcesGroupEncoder = encoder.rateSourcesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (rateSourcesGroup != null)
                {
                    rateSourcesGroup.copyTo(rateSourcesGroupEncoder);
                    rateSourcesGroup = rateSourcesGroup.next();
                    rateSourcesGroupEncoder = rateSourcesGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
