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
import com.swiftalgo.ms.codecs.fix50sp2.builder.ClrInstGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.ClrInstGrpEncoder.ClearingInstructionsGroupEncoder;

public interface ClrInstGrpDecoder 
{



public class ClearingInstructionsGroupDecoder extends CommonDecoderImpl
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
            ALL_GROUP_FIELDS.add(Constants.CLEARING_INSTRUCTION);
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
        if (hasClearingInstruction)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !ClearingInstruction.isValid(clearingInstruction()))
        {
            invalidTagId = 577;
            rejectReason = 5;
            return false;
        }
        }
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public ClearingInstructionsGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private ClearingInstructionsGroupDecoder next = null;

    public ClearingInstructionsGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(2);

    private int clearingInstruction = MISSING_INT;

    private boolean hasClearingInstruction;

    public int clearingInstruction()
    {
        if (!hasClearingInstruction)
        {
            throw new IllegalArgumentException("No value for optional field: ClearingInstruction");
        }

        return clearingInstruction;
    }

    public boolean hasClearingInstruction()
    {
        return hasClearingInstruction;
    }



    private final CharArrayWrapper clearingInstructionWrapper = new CharArrayWrapper();
    public ClearingInstruction clearingInstructionAsEnum()
    {
        if (!hasClearingInstruction)
 return ClearingInstruction.NULL_VAL;
        return ClearingInstruction.decode(clearingInstruction);
    }

    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode ClearingInstructionsGroup
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
                    next = new ClearingInstructionsGroupDecoder(trailer, messageFields);
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
            case Constants.CLEARING_INSTRUCTION:
                hasClearingInstruction = true;
                clearingInstruction = getInt(buffer, valueOffset, endOfField, 577, CODEC_VALIDATION_ENABLED);
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
        this.resetClearingInstruction();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetClearingInstruction()
    {
        hasClearingInstruction = false;
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
        builder.append("\"MessageName\": \"ClearingInstructionsGroup\",\n");
        if (hasClearingInstruction())
        {
            indent(builder, level);
            builder.append("\"ClearingInstruction\": \"");
            builder.append(clearingInstruction);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public ClrInstGrpEncoder.ClearingInstructionsGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((ClrInstGrpEncoder.ClearingInstructionsGroupEncoder)encoder);
    }

    public ClrInstGrpEncoder.ClearingInstructionsGroupEncoder toEncoder(final ClrInstGrpEncoder.ClearingInstructionsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasClearingInstruction())
        {
            encoder.clearingInstruction(this.clearingInstruction());
        }
        return encoder;
    }

}
    public class ClearingInstructionsGroupIterator implements Iterable<ClearingInstructionsGroupDecoder>, java.util.Iterator<ClearingInstructionsGroupDecoder>
    {
        private final ClrInstGrpDecoder parent;
        private int remainder;
        private ClearingInstructionsGroupDecoder current;

        public ClearingInstructionsGroupIterator(final ClrInstGrpDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }

        public ClearingInstructionsGroupDecoder next()
        {
            remainder--;
            final ClearingInstructionsGroupDecoder value = current;
            current = current.next();
            return value;
        }

        public int numberFieldValue()
        {
            return parent.hasNoClearingInstructionsGroupCounter() ? parent.noClearingInstructionsGroupCounter() : 0;
        }

        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.clearingInstructionsGroup();
        }

        public ClearingInstructionsGroupIterator iterator()
        {
            reset();
            return this;
        }

    }

    public ClearingInstructionsGroupIterator clearingInstructionsGroupIterator();
    public int noClearingInstructionsGroupCounter();
    public boolean hasNoClearingInstructionsGroupCounter();
    public ClearingInstructionsGroupDecoder clearingInstructionsGroup();

}
