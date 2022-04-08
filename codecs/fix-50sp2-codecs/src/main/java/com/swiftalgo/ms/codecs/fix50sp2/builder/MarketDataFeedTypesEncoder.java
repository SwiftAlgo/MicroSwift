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


public class MarketDataFeedTypesEncoder
{
    private static final int noMDFeedTypesGroupCounterHeaderLength = 5;
    private static final byte[] noMDFeedTypesGroupCounterHeader = new byte[] {49, 49, 52, 49, (byte) '='};



public static class MDFeedTypesGroupEncoder
{
    private MDFeedTypesGroupEncoder next = null;

    public MDFeedTypesGroupEncoder next()
    {
        if (next == null)
        {
            next = new MDFeedTypesGroupEncoder();
        }
        return next;
    }

    private static final int mDFeedTypeHeaderLength = 5;
    private static final byte[] mDFeedTypeHeader = new byte[] {49, 48, 50, 50, (byte) '='};

    private static final int marketDepthHeaderLength = 4;
    private static final byte[] marketDepthHeader = new byte[] {50, 54, 52, (byte) '='};

    private static final int mDBookTypeHeaderLength = 5;
    private static final byte[] mDBookTypeHeader = new byte[] {49, 48, 50, 49, (byte) '='};

    private final MutableDirectBuffer mDFeedType = new UnsafeBuffer();

    private int mDFeedTypeOffset = 0;

    private int mDFeedTypeLength = 0;

    public MDFeedTypesGroupEncoder mDFeedType(final DirectBuffer value, final int offset, final int length)
    {
        mDFeedType.wrap(value);
        mDFeedTypeOffset = offset;
        mDFeedTypeLength = length;
        return this;
    }

    public MDFeedTypesGroupEncoder mDFeedType(final DirectBuffer value, final int length)
    {
        return mDFeedType(value, 0, length);
    }

    public MDFeedTypesGroupEncoder mDFeedType(final DirectBuffer value)
    {
        return mDFeedType(value, 0, value.capacity());
    }

    public MDFeedTypesGroupEncoder mDFeedType(final byte[] value, final int offset, final int length)
    {
        mDFeedType.wrap(value);
        mDFeedTypeOffset = offset;
        mDFeedTypeLength = length;
        return this;
    }

    public MDFeedTypesGroupEncoder mDFeedTypeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(mDFeedType, value, offset, length);
        mDFeedTypeOffset = offset;
        mDFeedTypeLength = length;
        return this;
    }

    public MDFeedTypesGroupEncoder mDFeedType(final byte[] value, final int length)
    {
        return mDFeedType(value, 0, length);
    }

    public MDFeedTypesGroupEncoder mDFeedType(final byte[] value)
    {
        return mDFeedType(value, 0, value.length);
    }

    public boolean hasMDFeedType()
    {
        return mDFeedTypeLength > 0;
    }

    public MutableDirectBuffer mDFeedType()
    {
        return mDFeedType;
    }

    public String mDFeedTypeAsString()
    {
        return mDFeedType.getStringWithoutLengthAscii(mDFeedTypeOffset, mDFeedTypeLength);
    }

    public MDFeedTypesGroupEncoder mDFeedType(final CharSequence value)
    {
        toBytes(value, mDFeedType);
        mDFeedTypeOffset = 0;
        mDFeedTypeLength = value.length();
        return this;
    }

    public MDFeedTypesGroupEncoder mDFeedType(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            mDFeedType.wrap(buffer);
            mDFeedTypeOffset = value.offset();
            mDFeedTypeLength = value.length();
        }
        return this;
    }

    public MDFeedTypesGroupEncoder mDFeedType(final char[] value)
    {
        return mDFeedType(value, 0, value.length);
    }

    public MDFeedTypesGroupEncoder mDFeedType(final char[] value, final int length)
    {
        return mDFeedType(value, 0, length);
    }

    public MDFeedTypesGroupEncoder mDFeedType(final char[] value, final int offset, final int length)
    {
        toBytes(value, mDFeedType, offset, length);
        mDFeedTypeOffset = 0;
        mDFeedTypeLength = length;
        return this;
    }

    private int marketDepth;

    private boolean hasMarketDepth;

    public boolean hasMarketDepth()
    {
        return hasMarketDepth;
    }

    public MDFeedTypesGroupEncoder marketDepth(int value)
    {
        marketDepth = value;
        hasMarketDepth = true;
        return this;
    }

    public int marketDepth()
    {
        return marketDepth;
    }

    private int mDBookType;

    private boolean hasMDBookType;

    public boolean hasMDBookType()
    {
        return hasMDBookType;
    }

    public MDFeedTypesGroupEncoder mDBookType(int value)
    {
        mDBookType = value;
        hasMDBookType = true;
        return this;
    }

    public int mDBookType()
    {
        return mDBookType;
    }

    public MDFeedTypesGroupEncoder mDBookType(MDBookType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == MDBookType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: mDBookType Value: " + value );
            }
            if (value == MDBookType.NULL_VAL)
            {
                return this;
            }
        }
        return mDBookType(value.representation());
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (mDFeedTypeLength > 0)
        {
            buffer.putBytes(position, mDFeedTypeHeader, 0, mDFeedTypeHeaderLength);
            position += mDFeedTypeHeaderLength;
            buffer.putBytes(position, mDFeedType, mDFeedTypeOffset, mDFeedTypeLength);
            position += mDFeedTypeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasMarketDepth)
        {
            buffer.putBytes(position, marketDepthHeader, 0, marketDepthHeaderLength);
            position += marketDepthHeaderLength;
            position += buffer.putIntAscii(position, marketDepth);
            buffer.putSeparator(position);
            position++;
        }

        if (hasMDBookType)
        {
            buffer.putBytes(position, mDBookTypeHeader, 0, mDBookTypeHeaderLength);
            position += mDBookTypeHeaderLength;
            position += buffer.putIntAscii(position, mDBookType);
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
        this.resetMDFeedType();
        this.resetMarketDepth();
        this.resetMDBookType();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetMDFeedType()
    {
        mDFeedTypeLength = 0;
    }

    public void resetMarketDepth()
    {
        hasMarketDepth = false;
    }

    public void resetMDBookType()
    {
        hasMDBookType = false;
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
        builder.append("\"MessageName\": \"MDFeedTypesGroup\",\n");
        if (hasMDFeedType())
        {
            indent(builder, level);
            builder.append("\"MDFeedType\": \"");
            appendBuffer(builder, mDFeedType, mDFeedTypeOffset, mDFeedTypeLength);
            builder.append("\",\n");
        }

        if (hasMarketDepth())
        {
            indent(builder, level);
            builder.append("\"MarketDepth\": \"");
            builder.append(marketDepth);
            builder.append("\",\n");
        }

        if (hasMDBookType())
        {
            indent(builder, level);
            builder.append("\"MDBookType\": \"");
            builder.append(mDBookType);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public MDFeedTypesGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((MDFeedTypesGroupEncoder)encoder);
    }

    public MDFeedTypesGroupEncoder copyTo(final MDFeedTypesGroupEncoder encoder)
    {
        encoder.reset();
        if (hasMDFeedType())
        {
            encoder.mDFeedTypeAsCopy(mDFeedType.byteArray(), 0, mDFeedTypeLength);
        }

        if (hasMarketDepth())
        {
            encoder.marketDepth(this.marketDepth());
        }

        if (hasMDBookType())
        {
            encoder.mDBookType(this.mDBookType());
        }
        return encoder;
    }

}
    private int noMDFeedTypesGroupCounter;

    private boolean hasNoMDFeedTypesGroupCounter;

    public boolean hasNoMDFeedTypesGroupCounter()
    {
        return hasNoMDFeedTypesGroupCounter;
    }

    public MarketDataFeedTypesEncoder noMDFeedTypesGroupCounter(int value)
    {
        noMDFeedTypesGroupCounter = value;
        hasNoMDFeedTypesGroupCounter = true;
        return this;
    }

    public int noMDFeedTypesGroupCounter()
    {
        return noMDFeedTypesGroupCounter;
    }


    private MDFeedTypesGroupEncoder mDFeedTypesGroup = null;

    public MDFeedTypesGroupEncoder mDFeedTypesGroup(final int numberOfElements)
    {
        hasNoMDFeedTypesGroupCounter = true;
        noMDFeedTypesGroupCounter = numberOfElements;
        if (mDFeedTypesGroup == null)
        {
            mDFeedTypesGroup = new MDFeedTypesGroupEncoder();
        }
        return mDFeedTypesGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoMDFeedTypesGroupCounter)
        {
            buffer.putBytes(position, noMDFeedTypesGroupCounterHeader, 0, noMDFeedTypesGroupCounterHeaderLength);
            position += noMDFeedTypesGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noMDFeedTypesGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (mDFeedTypesGroup != null)
        {
            position += mDFeedTypesGroup.encode(buffer, position, noMDFeedTypesGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetMDFeedTypesGroup();
    }

    public void resetMDFeedTypesGroup()
    {
        if (mDFeedTypesGroup != null)
        {
            mDFeedTypesGroup.reset();
        }
        noMDFeedTypesGroupCounter = 0;
        hasNoMDFeedTypesGroupCounter = false;
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
        builder.append("\"MessageName\": \"MarketDataFeedTypes\",\n");
        if (hasNoMDFeedTypesGroupCounter)
        {
            indent(builder, level);
            builder.append("\"MDFeedTypesGroup\": [\n");
            final int noMDFeedTypesGroupCounter = this.noMDFeedTypesGroupCounter;
            MDFeedTypesGroupEncoder mDFeedTypesGroup = this.mDFeedTypesGroup;
            for (int i = 0; i < noMDFeedTypesGroupCounter; i++)
            {
                indent(builder, level);
                mDFeedTypesGroup.appendTo(builder, level + 1);
                if (i < (noMDFeedTypesGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                mDFeedTypesGroup = mDFeedTypesGroup.next();
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
    public MarketDataFeedTypesEncoder copyTo(final Encoder encoder)
    {
        return copyTo((MarketDataFeedTypesEncoder)encoder);
    }

    public MarketDataFeedTypesEncoder copyTo(final MarketDataFeedTypesEncoder encoder)
    {
        encoder.reset();
        if (hasNoMDFeedTypesGroupCounter)
        {
            final int size = this.noMDFeedTypesGroupCounter;
            MDFeedTypesGroupEncoder mDFeedTypesGroup = this.mDFeedTypesGroup;
            MDFeedTypesGroupEncoder mDFeedTypesGroupEncoder = encoder.mDFeedTypesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (mDFeedTypesGroup != null)
                {
                    mDFeedTypesGroup.copyTo(mDFeedTypesGroupEncoder);
                    mDFeedTypesGroup = mDFeedTypesGroup.next();
                    mDFeedTypesGroupEncoder = mDFeedTypesGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
