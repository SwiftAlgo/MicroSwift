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


public class MDReqGrpEncoder
{
    private static final int noMDEntryTypesGroupCounterHeaderLength = 4;
    private static final byte[] noMDEntryTypesGroupCounterHeader = new byte[] {50, 54, 55, (byte) '='};



public static class MDEntryTypesGroupEncoder
{
    private MDEntryTypesGroupEncoder next = null;

    public MDEntryTypesGroupEncoder next()
    {
        if (next == null)
        {
            next = new MDEntryTypesGroupEncoder();
        }
        return next;
    }

    private static final int mDEntryTypeHeaderLength = 4;
    private static final byte[] mDEntryTypeHeader = new byte[] {50, 54, 57, (byte) '='};

    private char mDEntryType;

    private boolean hasMDEntryType;

    public boolean hasMDEntryType()
    {
        return hasMDEntryType;
    }

    public MDEntryTypesGroupEncoder mDEntryType(char value)
    {
        mDEntryType = value;
        hasMDEntryType = true;
        return this;
    }

    public char mDEntryType()
    {
        return mDEntryType;
    }

    public MDEntryTypesGroupEncoder mDEntryType(MDEntryType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == MDEntryType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: mDEntryType Value: " + value );
            }
            if (value == MDEntryType.NULL_VAL)
            {
                return this;
            }
        }
        return mDEntryType(value.representation());
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (hasMDEntryType)
        {
            buffer.putBytes(position, mDEntryTypeHeader, 0, mDEntryTypeHeaderLength);
            position += mDEntryTypeHeaderLength;
            position += buffer.putCharAscii(position, mDEntryType);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: MDEntryType");
        }
        if (next != null)
        {
            position += next.encode(buffer, position, remainingElements - 1);
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetMDEntryType();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetMDEntryType()
    {
        mDEntryType = MISSING_CHAR;
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
        builder.append("\"MessageName\": \"MDEntryTypesGroup\",\n");
        if (hasMDEntryType())
        {
            indent(builder, level);
            builder.append("\"MDEntryType\": \"");
            builder.append(mDEntryType);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public MDEntryTypesGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((MDEntryTypesGroupEncoder)encoder);
    }

    public MDEntryTypesGroupEncoder copyTo(final MDEntryTypesGroupEncoder encoder)
    {
        encoder.reset();
        if (hasMDEntryType())
        {
            encoder.mDEntryType(this.mDEntryType());
        }
        return encoder;
    }

}
    private int noMDEntryTypesGroupCounter;

    private boolean hasNoMDEntryTypesGroupCounter;

    public boolean hasNoMDEntryTypesGroupCounter()
    {
        return hasNoMDEntryTypesGroupCounter;
    }

    public MDReqGrpEncoder noMDEntryTypesGroupCounter(int value)
    {
        noMDEntryTypesGroupCounter = value;
        hasNoMDEntryTypesGroupCounter = true;
        return this;
    }

    public int noMDEntryTypesGroupCounter()
    {
        return noMDEntryTypesGroupCounter;
    }


    private MDEntryTypesGroupEncoder mDEntryTypesGroup = null;

    public MDEntryTypesGroupEncoder mDEntryTypesGroup(final int numberOfElements)
    {
        hasNoMDEntryTypesGroupCounter = true;
        noMDEntryTypesGroupCounter = numberOfElements;
        if (mDEntryTypesGroup == null)
        {
            mDEntryTypesGroup = new MDEntryTypesGroupEncoder();
        }
        return mDEntryTypesGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoMDEntryTypesGroupCounter)
        {
            buffer.putBytes(position, noMDEntryTypesGroupCounterHeader, 0, noMDEntryTypesGroupCounterHeaderLength);
            position += noMDEntryTypesGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noMDEntryTypesGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (mDEntryTypesGroup != null)
        {
            position += mDEntryTypesGroup.encode(buffer, position, noMDEntryTypesGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetMDEntryTypesGroup();
    }

    public void resetMDEntryTypesGroup()
    {
        if (mDEntryTypesGroup != null)
        {
            mDEntryTypesGroup.reset();
        }
        noMDEntryTypesGroupCounter = 0;
        hasNoMDEntryTypesGroupCounter = false;
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
        builder.append("\"MessageName\": \"MDReqGrp\",\n");
        if (hasNoMDEntryTypesGroupCounter)
        {
            indent(builder, level);
            builder.append("\"MDEntryTypesGroup\": [\n");
            final int noMDEntryTypesGroupCounter = this.noMDEntryTypesGroupCounter;
            MDEntryTypesGroupEncoder mDEntryTypesGroup = this.mDEntryTypesGroup;
            for (int i = 0; i < noMDEntryTypesGroupCounter; i++)
            {
                indent(builder, level);
                mDEntryTypesGroup.appendTo(builder, level + 1);
                if (i < (noMDEntryTypesGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                mDEntryTypesGroup = mDEntryTypesGroup.next();
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
    public MDReqGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((MDReqGrpEncoder)encoder);
    }

    public MDReqGrpEncoder copyTo(final MDReqGrpEncoder encoder)
    {
        encoder.reset();
        if (hasNoMDEntryTypesGroupCounter)
        {
            final int size = this.noMDEntryTypesGroupCounter;
            MDEntryTypesGroupEncoder mDEntryTypesGroup = this.mDEntryTypesGroup;
            MDEntryTypesGroupEncoder mDEntryTypesGroupEncoder = encoder.mDEntryTypesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (mDEntryTypesGroup != null)
                {
                    mDEntryTypesGroup.copyTo(mDEntryTypesGroupEncoder);
                    mDEntryTypesGroup = mDEntryTypesGroup.next();
                    mDEntryTypesGroupEncoder = mDEntryTypesGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
