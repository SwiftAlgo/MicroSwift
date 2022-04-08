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


public class SecSizesGrpEncoder
{
    private static final int noOfSecSizesGroupCounterHeaderLength = 5;
    private static final byte[] noOfSecSizesGroupCounterHeader = new byte[] {49, 49, 55, 55, (byte) '='};



public static class OfSecSizesGroupEncoder
{
    private OfSecSizesGroupEncoder next = null;

    public OfSecSizesGroupEncoder next()
    {
        if (next == null)
        {
            next = new OfSecSizesGroupEncoder();
        }
        return next;
    }

    private static final int mDSecSizeTypeHeaderLength = 5;
    private static final byte[] mDSecSizeTypeHeader = new byte[] {49, 49, 55, 56, (byte) '='};

    private static final int mDSecSizeHeaderLength = 5;
    private static final byte[] mDSecSizeHeader = new byte[] {49, 49, 55, 57, (byte) '='};

    private int mDSecSizeType;

    private boolean hasMDSecSizeType;

    public boolean hasMDSecSizeType()
    {
        return hasMDSecSizeType;
    }

    public OfSecSizesGroupEncoder mDSecSizeType(int value)
    {
        mDSecSizeType = value;
        hasMDSecSizeType = true;
        return this;
    }

    public int mDSecSizeType()
    {
        return mDSecSizeType;
    }

    public OfSecSizesGroupEncoder mDSecSizeType(MDSecSizeType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == MDSecSizeType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: mDSecSizeType Value: " + value );
            }
            if (value == MDSecSizeType.NULL_VAL)
            {
                return this;
            }
        }
        return mDSecSizeType(value.representation());
    }

    private final DecimalFloat mDSecSize = new DecimalFloat();

    private boolean hasMDSecSize;

    public boolean hasMDSecSize()
    {
        return hasMDSecSize;
    }

    public OfSecSizesGroupEncoder mDSecSize(DecimalFloat value)
    {
        mDSecSize.set(value);
        hasMDSecSize = true;
        return this;
    }

    public OfSecSizesGroupEncoder mDSecSize(long value, int scale)
    {
        mDSecSize.set(value, scale);
        hasMDSecSize = true;
        return this;
    }

    public DecimalFloat mDSecSize()
    {
        return mDSecSize;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (hasMDSecSizeType)
        {
            buffer.putBytes(position, mDSecSizeTypeHeader, 0, mDSecSizeTypeHeaderLength);
            position += mDSecSizeTypeHeaderLength;
            position += buffer.putIntAscii(position, mDSecSizeType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasMDSecSize)
        {
            buffer.putBytes(position, mDSecSizeHeader, 0, mDSecSizeHeaderLength);
            position += mDSecSizeHeaderLength;
            position += buffer.putFloatAscii(position, mDSecSize);
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
        this.resetMDSecSizeType();
        this.resetMDSecSize();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetMDSecSizeType()
    {
        hasMDSecSizeType = false;
    }

    public void resetMDSecSize()
    {
        hasMDSecSize = false;
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
        builder.append("\"MessageName\": \"OfSecSizesGroup\",\n");
        if (hasMDSecSizeType())
        {
            indent(builder, level);
            builder.append("\"MDSecSizeType\": \"");
            builder.append(mDSecSizeType);
            builder.append("\",\n");
        }

        if (hasMDSecSize())
        {
            indent(builder, level);
            builder.append("\"MDSecSize\": \"");
            mDSecSize.appendTo(builder);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public OfSecSizesGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((OfSecSizesGroupEncoder)encoder);
    }

    public OfSecSizesGroupEncoder copyTo(final OfSecSizesGroupEncoder encoder)
    {
        encoder.reset();
        if (hasMDSecSizeType())
        {
            encoder.mDSecSizeType(this.mDSecSizeType());
        }

        if (hasMDSecSize())
        {
            encoder.mDSecSize(this.mDSecSize());
        }
        return encoder;
    }

}
    private int noOfSecSizesGroupCounter;

    private boolean hasNoOfSecSizesGroupCounter;

    public boolean hasNoOfSecSizesGroupCounter()
    {
        return hasNoOfSecSizesGroupCounter;
    }

    public SecSizesGrpEncoder noOfSecSizesGroupCounter(int value)
    {
        noOfSecSizesGroupCounter = value;
        hasNoOfSecSizesGroupCounter = true;
        return this;
    }

    public int noOfSecSizesGroupCounter()
    {
        return noOfSecSizesGroupCounter;
    }


    private OfSecSizesGroupEncoder ofSecSizesGroup = null;

    public OfSecSizesGroupEncoder ofSecSizesGroup(final int numberOfElements)
    {
        hasNoOfSecSizesGroupCounter = true;
        noOfSecSizesGroupCounter = numberOfElements;
        if (ofSecSizesGroup == null)
        {
            ofSecSizesGroup = new OfSecSizesGroupEncoder();
        }
        return ofSecSizesGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoOfSecSizesGroupCounter)
        {
            buffer.putBytes(position, noOfSecSizesGroupCounterHeader, 0, noOfSecSizesGroupCounterHeaderLength);
            position += noOfSecSizesGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noOfSecSizesGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (ofSecSizesGroup != null)
        {
            position += ofSecSizesGroup.encode(buffer, position, noOfSecSizesGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetOfSecSizesGroup();
    }

    public void resetOfSecSizesGroup()
    {
        if (ofSecSizesGroup != null)
        {
            ofSecSizesGroup.reset();
        }
        noOfSecSizesGroupCounter = 0;
        hasNoOfSecSizesGroupCounter = false;
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
        builder.append("\"MessageName\": \"SecSizesGrp\",\n");
        if (hasNoOfSecSizesGroupCounter)
        {
            indent(builder, level);
            builder.append("\"OfSecSizesGroup\": [\n");
            final int noOfSecSizesGroupCounter = this.noOfSecSizesGroupCounter;
            OfSecSizesGroupEncoder ofSecSizesGroup = this.ofSecSizesGroup;
            for (int i = 0; i < noOfSecSizesGroupCounter; i++)
            {
                indent(builder, level);
                ofSecSizesGroup.appendTo(builder, level + 1);
                if (i < (noOfSecSizesGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                ofSecSizesGroup = ofSecSizesGroup.next();
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
    public SecSizesGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((SecSizesGrpEncoder)encoder);
    }

    public SecSizesGrpEncoder copyTo(final SecSizesGrpEncoder encoder)
    {
        encoder.reset();
        if (hasNoOfSecSizesGroupCounter)
        {
            final int size = this.noOfSecSizesGroupCounter;
            OfSecSizesGroupEncoder ofSecSizesGroup = this.ofSecSizesGroup;
            OfSecSizesGroupEncoder ofSecSizesGroupEncoder = encoder.ofSecSizesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (ofSecSizesGroup != null)
                {
                    ofSecSizesGroup.copyTo(ofSecSizesGroupEncoder);
                    ofSecSizesGroup = ofSecSizesGroup.next();
                    ofSecSizesGroupEncoder = ofSecSizesGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
