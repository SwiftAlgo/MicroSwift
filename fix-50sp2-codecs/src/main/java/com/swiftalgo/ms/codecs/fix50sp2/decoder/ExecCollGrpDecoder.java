/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2.decoder;

import org.agrona.AsciiNumberFormatException;
import org.agrona.MutableDirectBuffer;
import org.agrona.AsciiSequenceView;
import static uk.co.real_logic.artio.dictionary.generation.CodecUtil.*;
import static uk.co.real_logic.artio.dictionary.SessionConstants.*;
import uk.co.real_logic.artio.builder.Decoder;
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
import uk.co.real_logic.artio.builder.Encoder;
import uk.co.real_logic.artio.builder.CommonDecoderImpl;
import static java.nio.charset.StandardCharsets.US_ASCII;
import static uk.co.real_logic.artio.builder.Validation.CODEC_VALIDATION_ENABLED;
import static uk.co.real_logic.artio.builder.RejectUnknownField.CODEC_REJECT_UNKNOWN_FIELD_ENABLED;
import static uk.co.real_logic.artio.builder.RejectUnknownEnumValue.CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED;
import com.swiftalgo.ms.codecs.fix50sp2.*;
import com.swiftalgo.ms.codecs.fix50sp2.builder.ExecCollGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.ExecCollGrpEncoder.ExecsGroupEncoder;

public interface ExecCollGrpDecoder 
{



public class ExecsGroupDecoder extends CommonDecoderImpl
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(0);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
        }
    }

    public final IntHashSet ALL_GROUP_FIELDS = new IntHashSet(2);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            ALL_GROUP_FIELDS.add(Constants.EXEC_ID);
        }
    }

    private final IntHashSet missingRequiredFields = new IntHashSet(0);

    public boolean validate()
    {
        if (rejectReason != Decoder.NO_ERROR)
        {
            return false;
        }
        final IntIterator missingFieldsIterator = missingRequiredFields.iterator();
        if (missingFieldsIterator.hasNext())
        {
            invalidTagId = missingFieldsIterator.nextValue();
            rejectReason = 1;
            return false;
        }
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public ExecsGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private ExecsGroupDecoder next = null;

    public ExecsGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(2);

    private char[] execID = new char[1];

    private boolean hasExecID;

    public char[] execID()
    {
        if (!hasExecID)
        {
            throw new IllegalArgumentException("No value for optional field: ExecID");
        }

        return execID;
    }

    public boolean hasExecID()
    {
        return hasExecID;
    }


    private int execIDOffset;

    private int execIDLength;

    public int execIDLength()
    {
        if (!hasExecID)
        {
            throw new IllegalArgumentException("No value for optional field: ExecID");
        }

        return execIDLength;
    }

    public String execIDAsString()
    {
        return hasExecID ? new String(execID, 0, execIDLength) : null;
    }

    public void execID(final AsciiSequenceView view)
    {
        if (!hasExecID)
        {
            throw new IllegalArgumentException("No value for optional field: ExecID");
        }

        view.wrap(buffer, execIDOffset, execIDLength);
    }


    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode ExecsGroup
        int seenFieldCount = 0;
        if (CODEC_VALIDATION_ENABLED)
        {
            missingRequiredFields.copy(REQUIRED_FIELDS);
        }
        this.buffer = buffer;
        final int end = offset + length;
        int position = offset;
        seenFields.clear();
        int tag;

        while (position < end)
        {
            final int equalsPosition = buffer.scan(position, end, '=');
            if (equalsPosition == AsciiBuffer.UNKNOWN_INDEX)
            {
               return position;
            }
            tag = buffer.getInt(position, equalsPosition);
            if (!seenFields.add(tag))
            {
                if (next == null)
                {
                    next = new ExecsGroupDecoder(trailer, messageFields);
                }
                return position - offset;
            }
            final int valueOffset = equalsPosition + 1;
            int endOfField = buffer.scan(valueOffset, end, START_OF_HEADER);
            if (endOfField == AsciiBuffer.UNKNOWN_INDEX || equalsPosition == AsciiBuffer.UNKNOWN_INDEX)
            {
                rejectReason = 5;
                break;
            }
            final int valueLength = endOfField - valueOffset;
            if (CODEC_VALIDATION_ENABLED)
            {
                if (tag <= 0)
                {
                    invalidTagId = tag;
                    rejectReason = 0;
                }
                else if (valueLength == 0)
                {
                    invalidTagId = tag;
                    rejectReason = 4;
                }
                missingRequiredFields.remove(tag);
                seenFieldCount++;
            }

            switch (tag)
            {
            case Constants.EXEC_ID:
                hasExecID = true;
                execID = buffer.getChars(execID, valueOffset, valueLength);
                execIDOffset = valueOffset;
                execIDLength = valueLength;
                break;

            default:
                if (!CODEC_REJECT_UNKNOWN_FIELD_ENABLED)
                {
                    seenFields.remove(tag);
                }
                if (CODEC_REJECT_UNKNOWN_FIELD_ENABLED || (trailer.REQUIRED_FIELDS.contains(tag) || messageFields.contains(tag)))
                {
                    return position - offset;
                }

            }

            if (position < (endOfField + 1))
            {
                position = endOfField + 1;
            }
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetExecID();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetExecID()
    {
        hasExecID = false;
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
        builder.append("\"MessageName\": \"ExecsGroup\",\n");
        if (hasExecID())
        {
            indent(builder, level);
            builder.append("\"ExecID\": \"");
            builder.append(this.execID(), 0, execIDLength());
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public ExecsGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((ExecsGroupEncoder)encoder);
    }

    public ExecsGroupEncoder toEncoder(final ExecsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasExecID())
        {
            encoder.execID(this.execID(), 0, execIDLength());
        }
        return encoder;
    }

}
    public class ExecsGroupIterator implements Iterable<ExecsGroupDecoder>, java.util.Iterator<ExecsGroupDecoder>
    {
        private final ExecCollGrpDecoder parent;
        private int remainder;
        private ExecsGroupDecoder current;

        public ExecsGroupIterator(final ExecCollGrpDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }
        public ExecsGroupDecoder next()
        {
            remainder--;
            final ExecsGroupDecoder value = current;
            current = current.next();
            return value;
        }
        public int numberFieldValue()
        {
            return parent.hasNoExecsGroupCounter() ? parent.noExecsGroupCounter() : 0;
        }
        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.execsGroup();
        }
        public ExecsGroupIterator iterator()
        {
            reset();
            return this;
        }
    }

public ExecsGroupIterator execsGroupIterator();
    public int noExecsGroupCounter();
    public boolean hasNoExecsGroupCounter();
    public ExecsGroupDecoder execsGroup();

}
