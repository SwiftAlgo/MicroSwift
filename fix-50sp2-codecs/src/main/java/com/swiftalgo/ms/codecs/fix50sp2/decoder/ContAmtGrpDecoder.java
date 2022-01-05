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
import com.swiftalgo.ms.codecs.fix50sp2.builder.ContAmtGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.ContAmtGrpEncoder.ContAmtsGroupEncoder;

public interface ContAmtGrpDecoder 
{



public class ContAmtsGroupDecoder extends CommonDecoderImpl
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(0);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
        }
    }

    public final IntHashSet ALL_GROUP_FIELDS = new IntHashSet(6);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            ALL_GROUP_FIELDS.add(Constants.CONT_AMT_TYPE);
            ALL_GROUP_FIELDS.add(Constants.CONT_AMT_VALUE);
            ALL_GROUP_FIELDS.add(Constants.CONT_AMT_CURR);
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
        if (hasContAmtType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !ContAmtType.isValid(contAmtType()))
        {
            invalidTagId = 519;
            rejectReason = 5;
            return false;
        }
        }
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public ContAmtsGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private ContAmtsGroupDecoder next = null;

    public ContAmtsGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(6);

    private int contAmtType = MISSING_INT;

    private boolean hasContAmtType;

    public int contAmtType()
    {
        if (!hasContAmtType)
        {
            throw new IllegalArgumentException("No value for optional field: ContAmtType");
        }

        return contAmtType;
    }

    public boolean hasContAmtType()
    {
        return hasContAmtType;
    }



    private final CharArrayWrapper contAmtTypeWrapper = new CharArrayWrapper();
    public ContAmtType contAmtTypeAsEnum()
    {
        if (!hasContAmtType)
 return ContAmtType.NULL_VAL;
        return ContAmtType.decode(contAmtType);
    }

    private DecimalFloat contAmtValue = DecimalFloat.newNaNValue();

    private boolean hasContAmtValue;

    public DecimalFloat contAmtValue()
    {
        if (!hasContAmtValue)
        {
            throw new IllegalArgumentException("No value for optional field: ContAmtValue");
        }

        return contAmtValue;
    }

    public boolean hasContAmtValue()
    {
        return hasContAmtValue;
    }



    private char[] contAmtCurr = new char[1];

    private boolean hasContAmtCurr;

    public char[] contAmtCurr()
    {
        if (!hasContAmtCurr)
        {
            throw new IllegalArgumentException("No value for optional field: ContAmtCurr");
        }

        return contAmtCurr;
    }

    public boolean hasContAmtCurr()
    {
        return hasContAmtCurr;
    }


    private int contAmtCurrOffset;

    private int contAmtCurrLength;

    public int contAmtCurrLength()
    {
        if (!hasContAmtCurr)
        {
            throw new IllegalArgumentException("No value for optional field: ContAmtCurr");
        }

        return contAmtCurrLength;
    }

    public String contAmtCurrAsString()
    {
        return hasContAmtCurr ? new String(contAmtCurr, 0, contAmtCurrLength) : null;
    }

    public void contAmtCurr(final AsciiSequenceView view)
    {
        if (!hasContAmtCurr)
        {
            throw new IllegalArgumentException("No value for optional field: ContAmtCurr");
        }

        view.wrap(buffer, contAmtCurrOffset, contAmtCurrLength);
    }


    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode ContAmtsGroup
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
                    next = new ContAmtsGroupDecoder(trailer, messageFields);
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
            case Constants.CONT_AMT_TYPE:
                hasContAmtType = true;
                contAmtType = getInt(buffer, valueOffset, endOfField, 519, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.CONT_AMT_VALUE:
                hasContAmtValue = true;
                contAmtValue = getFloat(buffer, contAmtValue, valueOffset, valueLength, 520, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.CONT_AMT_CURR:
                hasContAmtCurr = true;
                contAmtCurr = buffer.getChars(contAmtCurr, valueOffset, valueLength);
                contAmtCurrOffset = valueOffset;
                contAmtCurrLength = valueLength;
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
        this.resetContAmtType();
        this.resetContAmtValue();
        this.resetContAmtCurr();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetContAmtType()
    {
        hasContAmtType = false;
    }

    public void resetContAmtValue()
    {
        hasContAmtValue = false;
    }

    public void resetContAmtCurr()
    {
        hasContAmtCurr = false;
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
        builder.append("\"MessageName\": \"ContAmtsGroup\",\n");
        if (hasContAmtType())
        {
            indent(builder, level);
            builder.append("\"ContAmtType\": \"");
            builder.append(contAmtType);
            builder.append("\",\n");
        }

        if (hasContAmtValue())
        {
            indent(builder, level);
            builder.append("\"ContAmtValue\": \"");
            contAmtValue.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasContAmtCurr())
        {
            indent(builder, level);
            builder.append("\"ContAmtCurr\": \"");
            builder.append(this.contAmtCurr(), 0, contAmtCurrLength());
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public ContAmtsGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((ContAmtsGroupEncoder)encoder);
    }

    public ContAmtsGroupEncoder toEncoder(final ContAmtsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasContAmtType())
        {
            encoder.contAmtType(this.contAmtType());
        }

        if (hasContAmtValue())
        {
            encoder.contAmtValue(this.contAmtValue());
        }

        if (hasContAmtCurr())
        {
            encoder.contAmtCurr(this.contAmtCurr(), 0, contAmtCurrLength());
        }
        return encoder;
    }

}
    public class ContAmtsGroupIterator implements Iterable<ContAmtsGroupDecoder>, java.util.Iterator<ContAmtsGroupDecoder>
    {
        private final ContAmtGrpDecoder parent;
        private int remainder;
        private ContAmtsGroupDecoder current;

        public ContAmtsGroupIterator(final ContAmtGrpDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }
        public ContAmtsGroupDecoder next()
        {
            remainder--;
            final ContAmtsGroupDecoder value = current;
            current = current.next();
            return value;
        }
        public int numberFieldValue()
        {
            return parent.hasNoContAmtsGroupCounter() ? parent.noContAmtsGroupCounter() : 0;
        }
        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.contAmtsGroup();
        }
        public ContAmtsGroupIterator iterator()
        {
            reset();
            return this;
        }
    }

public ContAmtsGroupIterator contAmtsGroupIterator();
    public int noContAmtsGroupCounter();
    public boolean hasNoContAmtsGroupCounter();
    public ContAmtsGroupDecoder contAmtsGroup();

}
