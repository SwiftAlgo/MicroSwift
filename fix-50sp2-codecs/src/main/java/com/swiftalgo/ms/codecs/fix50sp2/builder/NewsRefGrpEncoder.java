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


public class NewsRefGrpEncoder
{
    private static final int noNewsRefIDsGroupCounterHeaderLength = 5;
    private static final byte[] noNewsRefIDsGroupCounterHeader = new byte[] {49, 52, 55, 53, (byte) '='};



public static class NewsRefIDsGroupEncoder
{
    private NewsRefIDsGroupEncoder next = null;

    public NewsRefIDsGroupEncoder next()
    {
        if (next == null)
        {
            next = new NewsRefIDsGroupEncoder();
        }
        return next;
    }

    private static final int newsRefIDHeaderLength = 5;
    private static final byte[] newsRefIDHeader = new byte[] {49, 52, 55, 54, (byte) '='};

    private static final int newsRefTypeHeaderLength = 5;
    private static final byte[] newsRefTypeHeader = new byte[] {49, 52, 55, 55, (byte) '='};

    private final MutableDirectBuffer newsRefID = new UnsafeBuffer();

    private int newsRefIDOffset = 0;

    private int newsRefIDLength = 0;

    public NewsRefIDsGroupEncoder newsRefID(final DirectBuffer value, final int offset, final int length)
    {
        newsRefID.wrap(value);
        newsRefIDOffset = offset;
        newsRefIDLength = length;
        return this;
    }

    public NewsRefIDsGroupEncoder newsRefID(final DirectBuffer value, final int length)
    {
        return newsRefID(value, 0, length);
    }

    public NewsRefIDsGroupEncoder newsRefID(final DirectBuffer value)
    {
        return newsRefID(value, 0, value.capacity());
    }

    public NewsRefIDsGroupEncoder newsRefID(final byte[] value, final int offset, final int length)
    {
        newsRefID.wrap(value);
        newsRefIDOffset = offset;
        newsRefIDLength = length;
        return this;
    }

    public NewsRefIDsGroupEncoder newsRefIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(newsRefID, value, offset, length);
        newsRefIDOffset = offset;
        newsRefIDLength = length;
        return this;
    }

    public NewsRefIDsGroupEncoder newsRefID(final byte[] value, final int length)
    {
        return newsRefID(value, 0, length);
    }

    public NewsRefIDsGroupEncoder newsRefID(final byte[] value)
    {
        return newsRefID(value, 0, value.length);
    }

    public boolean hasNewsRefID()
    {
        return newsRefIDLength > 0;
    }

    public MutableDirectBuffer newsRefID()
    {
        return newsRefID;
    }

    public String newsRefIDAsString()
    {
        return newsRefID.getStringWithoutLengthAscii(newsRefIDOffset, newsRefIDLength);
    }

    public NewsRefIDsGroupEncoder newsRefID(final CharSequence value)
    {
        toBytes(value, newsRefID);
        newsRefIDOffset = 0;
        newsRefIDLength = value.length();
        return this;
    }

    public NewsRefIDsGroupEncoder newsRefID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            newsRefID.wrap(buffer);
            newsRefIDOffset = value.offset();
            newsRefIDLength = value.length();
        }
        return this;
    }

    public NewsRefIDsGroupEncoder newsRefID(final char[] value)
    {
        return newsRefID(value, 0, value.length);
    }

    public NewsRefIDsGroupEncoder newsRefID(final char[] value, final int length)
    {
        return newsRefID(value, 0, length);
    }

    public NewsRefIDsGroupEncoder newsRefID(final char[] value, final int offset, final int length)
    {
        toBytes(value, newsRefID, offset, length);
        newsRefIDOffset = 0;
        newsRefIDLength = length;
        return this;
    }

    private int newsRefType;

    private boolean hasNewsRefType;

    public boolean hasNewsRefType()
    {
        return hasNewsRefType;
    }

    public NewsRefIDsGroupEncoder newsRefType(int value)
    {
        newsRefType = value;
        hasNewsRefType = true;
        return this;
    }

    public int newsRefType()
    {
        return newsRefType;
    }

    public NewsRefIDsGroupEncoder newsRefType(NewsRefType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == NewsRefType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: newsRefType Value: " + value );
            }
            if (value == NewsRefType.NULL_VAL)
            {
                return this;
            }
        }
        return newsRefType(value.representation());
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (newsRefIDLength > 0)
        {
            buffer.putBytes(position, newsRefIDHeader, 0, newsRefIDHeaderLength);
            position += newsRefIDHeaderLength;
            buffer.putBytes(position, newsRefID, newsRefIDOffset, newsRefIDLength);
            position += newsRefIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasNewsRefType)
        {
            buffer.putBytes(position, newsRefTypeHeader, 0, newsRefTypeHeaderLength);
            position += newsRefTypeHeaderLength;
            position += buffer.putIntAscii(position, newsRefType);
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
        this.resetNewsRefID();
        this.resetNewsRefType();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetNewsRefID()
    {
        newsRefIDLength = 0;
    }

    public void resetNewsRefType()
    {
        hasNewsRefType = false;
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
        builder.append("\"MessageName\": \"NewsRefIDsGroup\",\n");
        if (hasNewsRefID())
        {
            indent(builder, level);
            builder.append("\"NewsRefID\": \"");
            appendBuffer(builder, newsRefID, newsRefIDOffset, newsRefIDLength);
            builder.append("\",\n");
        }

        if (hasNewsRefType())
        {
            indent(builder, level);
            builder.append("\"NewsRefType\": \"");
            builder.append(newsRefType);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public NewsRefIDsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((NewsRefIDsGroupEncoder)encoder);
    }

    public NewsRefIDsGroupEncoder copyTo(final NewsRefIDsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasNewsRefID())
        {
            encoder.newsRefIDAsCopy(newsRefID.byteArray(), 0, newsRefIDLength);
        }

        if (hasNewsRefType())
        {
            encoder.newsRefType(this.newsRefType());
        }
        return encoder;
    }

}
    private int noNewsRefIDsGroupCounter;

    private boolean hasNoNewsRefIDsGroupCounter;

    public boolean hasNoNewsRefIDsGroupCounter()
    {
        return hasNoNewsRefIDsGroupCounter;
    }

    public NewsRefGrpEncoder noNewsRefIDsGroupCounter(int value)
    {
        noNewsRefIDsGroupCounter = value;
        hasNoNewsRefIDsGroupCounter = true;
        return this;
    }

    public int noNewsRefIDsGroupCounter()
    {
        return noNewsRefIDsGroupCounter;
    }


    private NewsRefIDsGroupEncoder newsRefIDsGroup = null;

    public NewsRefIDsGroupEncoder newsRefIDsGroup(final int numberOfElements)
    {
        hasNoNewsRefIDsGroupCounter = true;
        noNewsRefIDsGroupCounter = numberOfElements;
        if (newsRefIDsGroup == null)
        {
            newsRefIDsGroup = new NewsRefIDsGroupEncoder();
        }
        return newsRefIDsGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoNewsRefIDsGroupCounter)
        {
            buffer.putBytes(position, noNewsRefIDsGroupCounterHeader, 0, noNewsRefIDsGroupCounterHeaderLength);
            position += noNewsRefIDsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noNewsRefIDsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (newsRefIDsGroup != null)
        {
            position += newsRefIDsGroup.encode(buffer, position, noNewsRefIDsGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetNewsRefIDsGroup();
    }

    public void resetNewsRefIDsGroup()
    {
        if (newsRefIDsGroup != null)
        {
            newsRefIDsGroup.reset();
        }
        noNewsRefIDsGroupCounter = 0;
        hasNoNewsRefIDsGroupCounter = false;
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
        builder.append("\"MessageName\": \"NewsRefGrp\",\n");
        if (hasNoNewsRefIDsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"NewsRefIDsGroup\": [\n");
            final int noNewsRefIDsGroupCounter = this.noNewsRefIDsGroupCounter;
            NewsRefIDsGroupEncoder newsRefIDsGroup = this.newsRefIDsGroup;
            for (int i = 0; i < noNewsRefIDsGroupCounter; i++)
            {
                indent(builder, level);
                newsRefIDsGroup.appendTo(builder, level + 1);
                if (i < (noNewsRefIDsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                newsRefIDsGroup = newsRefIDsGroup.next();
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
    public NewsRefGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((NewsRefGrpEncoder)encoder);
    }

    public NewsRefGrpEncoder copyTo(final NewsRefGrpEncoder encoder)
    {
        encoder.reset();
        if (hasNoNewsRefIDsGroupCounter)
        {
            final int size = this.noNewsRefIDsGroupCounter;
            NewsRefIDsGroupEncoder newsRefIDsGroup = this.newsRefIDsGroup;
            NewsRefIDsGroupEncoder newsRefIDsGroupEncoder = encoder.newsRefIDsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (newsRefIDsGroup != null)
                {
                    newsRefIDsGroup.copyTo(newsRefIDsGroupEncoder);
                    newsRefIDsGroup = newsRefIDsGroup.next();
                    newsRefIDsGroupEncoder = newsRefIDsGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
