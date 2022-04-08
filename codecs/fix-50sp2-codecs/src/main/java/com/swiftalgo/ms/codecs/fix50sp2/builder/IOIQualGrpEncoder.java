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


public class IOIQualGrpEncoder
{
    private static final int noIOIQualifiersGroupCounterHeaderLength = 4;
    private static final byte[] noIOIQualifiersGroupCounterHeader = new byte[] {49, 57, 57, (byte) '='};



public static class IOIQualifiersGroupEncoder
{
    private IOIQualifiersGroupEncoder next = null;

    public IOIQualifiersGroupEncoder next()
    {
        if (next == null)
        {
            next = new IOIQualifiersGroupEncoder();
        }
        return next;
    }

    private static final int iOIQualifierHeaderLength = 4;
    private static final byte[] iOIQualifierHeader = new byte[] {49, 48, 52, (byte) '='};

    private char iOIQualifier;

    private boolean hasIOIQualifier;

    public boolean hasIOIQualifier()
    {
        return hasIOIQualifier;
    }

    public IOIQualifiersGroupEncoder iOIQualifier(char value)
    {
        iOIQualifier = value;
        hasIOIQualifier = true;
        return this;
    }

    public char iOIQualifier()
    {
        return iOIQualifier;
    }

    public IOIQualifiersGroupEncoder iOIQualifier(IOIQualifier value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == IOIQualifier.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: iOIQualifier Value: " + value );
            }
            if (value == IOIQualifier.NULL_VAL)
            {
                return this;
            }
        }
        return iOIQualifier(value.representation());
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (hasIOIQualifier)
        {
            buffer.putBytes(position, iOIQualifierHeader, 0, iOIQualifierHeaderLength);
            position += iOIQualifierHeaderLength;
            position += buffer.putCharAscii(position, iOIQualifier);
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
        this.resetIOIQualifier();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetIOIQualifier()
    {
        hasIOIQualifier = false;
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
        builder.append("\"MessageName\": \"IOIQualifiersGroup\",\n");
        if (hasIOIQualifier())
        {
            indent(builder, level);
            builder.append("\"IOIQualifier\": \"");
            builder.append(iOIQualifier);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public IOIQualifiersGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((IOIQualifiersGroupEncoder)encoder);
    }

    public IOIQualifiersGroupEncoder copyTo(final IOIQualifiersGroupEncoder encoder)
    {
        encoder.reset();
        if (hasIOIQualifier())
        {
            encoder.iOIQualifier(this.iOIQualifier());
        }
        return encoder;
    }

}
    private int noIOIQualifiersGroupCounter;

    private boolean hasNoIOIQualifiersGroupCounter;

    public boolean hasNoIOIQualifiersGroupCounter()
    {
        return hasNoIOIQualifiersGroupCounter;
    }

    public IOIQualGrpEncoder noIOIQualifiersGroupCounter(int value)
    {
        noIOIQualifiersGroupCounter = value;
        hasNoIOIQualifiersGroupCounter = true;
        return this;
    }

    public int noIOIQualifiersGroupCounter()
    {
        return noIOIQualifiersGroupCounter;
    }


    private IOIQualifiersGroupEncoder iOIQualifiersGroup = null;

    public IOIQualifiersGroupEncoder iOIQualifiersGroup(final int numberOfElements)
    {
        hasNoIOIQualifiersGroupCounter = true;
        noIOIQualifiersGroupCounter = numberOfElements;
        if (iOIQualifiersGroup == null)
        {
            iOIQualifiersGroup = new IOIQualifiersGroupEncoder();
        }
        return iOIQualifiersGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoIOIQualifiersGroupCounter)
        {
            buffer.putBytes(position, noIOIQualifiersGroupCounterHeader, 0, noIOIQualifiersGroupCounterHeaderLength);
            position += noIOIQualifiersGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noIOIQualifiersGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (iOIQualifiersGroup != null)
        {
            position += iOIQualifiersGroup.encode(buffer, position, noIOIQualifiersGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetIOIQualifiersGroup();
    }

    public void resetIOIQualifiersGroup()
    {
        if (iOIQualifiersGroup != null)
        {
            iOIQualifiersGroup.reset();
        }
        noIOIQualifiersGroupCounter = 0;
        hasNoIOIQualifiersGroupCounter = false;
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
        builder.append("\"MessageName\": \"IOIQualGrp\",\n");
        if (hasNoIOIQualifiersGroupCounter)
        {
            indent(builder, level);
            builder.append("\"IOIQualifiersGroup\": [\n");
            final int noIOIQualifiersGroupCounter = this.noIOIQualifiersGroupCounter;
            IOIQualifiersGroupEncoder iOIQualifiersGroup = this.iOIQualifiersGroup;
            for (int i = 0; i < noIOIQualifiersGroupCounter; i++)
            {
                indent(builder, level);
                iOIQualifiersGroup.appendTo(builder, level + 1);
                if (i < (noIOIQualifiersGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                iOIQualifiersGroup = iOIQualifiersGroup.next();
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
    public IOIQualGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((IOIQualGrpEncoder)encoder);
    }

    public IOIQualGrpEncoder copyTo(final IOIQualGrpEncoder encoder)
    {
        encoder.reset();
        if (hasNoIOIQualifiersGroupCounter)
        {
            final int size = this.noIOIQualifiersGroupCounter;
            IOIQualifiersGroupEncoder iOIQualifiersGroup = this.iOIQualifiersGroup;
            IOIQualifiersGroupEncoder iOIQualifiersGroupEncoder = encoder.iOIQualifiersGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (iOIQualifiersGroup != null)
                {
                    iOIQualifiersGroup.copyTo(iOIQualifiersGroupEncoder);
                    iOIQualifiersGroup = iOIQualifiersGroup.next();
                    iOIQualifiersGroupEncoder = iOIQualifiersGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
