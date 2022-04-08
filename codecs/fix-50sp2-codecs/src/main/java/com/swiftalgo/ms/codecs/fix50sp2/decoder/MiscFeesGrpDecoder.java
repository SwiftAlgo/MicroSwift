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
import com.swiftalgo.ms.codecs.fix50sp2.builder.MiscFeesGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.MiscFeesGrpEncoder.MiscFeesGroupEncoder;

public interface MiscFeesGrpDecoder 
{



public class MiscFeesGroupDecoder extends CommonDecoderImpl
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(0);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
        }
    }

    public final IntHashSet ALL_GROUP_FIELDS = new IntHashSet(8);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            ALL_GROUP_FIELDS.add(Constants.MISC_FEE_AMT);
            ALL_GROUP_FIELDS.add(Constants.MISC_FEE_CURR);
            ALL_GROUP_FIELDS.add(Constants.MISC_FEE_TYPE);
            ALL_GROUP_FIELDS.add(Constants.MISC_FEE_BASIS);
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
        if (hasMiscFeeType)
        {
        miscFeeTypeWrapper.wrap(this.miscFeeType(), miscFeeTypeLength);
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !MiscFeeType.isValid(miscFeeTypeWrapper))
        {
            invalidTagId = 139;
            rejectReason = 5;
            return false;
        }
        }

        if (hasMiscFeeBasis)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !MiscFeeBasis.isValid(miscFeeBasis()))
        {
            invalidTagId = 891;
            rejectReason = 5;
            return false;
        }
        }
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public MiscFeesGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private MiscFeesGroupDecoder next = null;

    public MiscFeesGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(8);

    private DecimalFloat miscFeeAmt = DecimalFloat.newNaNValue();

    private boolean hasMiscFeeAmt;

    public DecimalFloat miscFeeAmt()
    {
        if (!hasMiscFeeAmt)
        {
            throw new IllegalArgumentException("No value for optional field: MiscFeeAmt");
        }

        return miscFeeAmt;
    }

    public boolean hasMiscFeeAmt()
    {
        return hasMiscFeeAmt;
    }



    private char[] miscFeeCurr = new char[1];

    private boolean hasMiscFeeCurr;

    public char[] miscFeeCurr()
    {
        if (!hasMiscFeeCurr)
        {
            throw new IllegalArgumentException("No value for optional field: MiscFeeCurr");
        }

        return miscFeeCurr;
    }

    public boolean hasMiscFeeCurr()
    {
        return hasMiscFeeCurr;
    }


    private int miscFeeCurrOffset;

    private int miscFeeCurrLength;

    public int miscFeeCurrLength()
    {
        if (!hasMiscFeeCurr)
        {
            throw new IllegalArgumentException("No value for optional field: MiscFeeCurr");
        }

        return miscFeeCurrLength;
    }

    public String miscFeeCurrAsString()
    {
        return hasMiscFeeCurr ? new String(miscFeeCurr, 0, miscFeeCurrLength) : null;
    }

    public void miscFeeCurr(final AsciiSequenceView view)
    {
        if (!hasMiscFeeCurr)
        {
            throw new IllegalArgumentException("No value for optional field: MiscFeeCurr");
        }

        view.wrap(buffer, miscFeeCurrOffset, miscFeeCurrLength);
    }


    private char[] miscFeeType = new char[1];

    private boolean hasMiscFeeType;

    public char[] miscFeeType()
    {
        if (!hasMiscFeeType)
        {
            throw new IllegalArgumentException("No value for optional field: MiscFeeType");
        }

        return miscFeeType;
    }

    public boolean hasMiscFeeType()
    {
        return hasMiscFeeType;
    }


    private int miscFeeTypeOffset;

    private int miscFeeTypeLength;

    public int miscFeeTypeLength()
    {
        if (!hasMiscFeeType)
        {
            throw new IllegalArgumentException("No value for optional field: MiscFeeType");
        }

        return miscFeeTypeLength;
    }

    public String miscFeeTypeAsString()
    {
        return hasMiscFeeType ? new String(miscFeeType, 0, miscFeeTypeLength) : null;
    }

    public void miscFeeType(final AsciiSequenceView view)
    {
        if (!hasMiscFeeType)
        {
            throw new IllegalArgumentException("No value for optional field: MiscFeeType");
        }

        view.wrap(buffer, miscFeeTypeOffset, miscFeeTypeLength);
    }


    private final CharArrayWrapper miscFeeTypeWrapper = new CharArrayWrapper();
    public MiscFeeType miscFeeTypeAsEnum()
    {
        if (!hasMiscFeeType)
 return MiscFeeType.NULL_VAL;
        miscFeeTypeWrapper.wrap(this.miscFeeType(), miscFeeTypeLength);
        return MiscFeeType.decode(miscFeeTypeWrapper);
    }

    private int miscFeeBasis = MISSING_INT;

    private boolean hasMiscFeeBasis;

    public int miscFeeBasis()
    {
        if (!hasMiscFeeBasis)
        {
            throw new IllegalArgumentException("No value for optional field: MiscFeeBasis");
        }

        return miscFeeBasis;
    }

    public boolean hasMiscFeeBasis()
    {
        return hasMiscFeeBasis;
    }



    private final CharArrayWrapper miscFeeBasisWrapper = new CharArrayWrapper();
    public MiscFeeBasis miscFeeBasisAsEnum()
    {
        if (!hasMiscFeeBasis)
 return MiscFeeBasis.NULL_VAL;
        return MiscFeeBasis.decode(miscFeeBasis);
    }

    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode MiscFeesGroup
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
                    next = new MiscFeesGroupDecoder(trailer, messageFields);
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
            case Constants.MISC_FEE_AMT:
                hasMiscFeeAmt = true;
                miscFeeAmt = getFloat(buffer, miscFeeAmt, valueOffset, valueLength, 137, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.MISC_FEE_CURR:
                hasMiscFeeCurr = true;
                miscFeeCurr = buffer.getChars(miscFeeCurr, valueOffset, valueLength);
                miscFeeCurrOffset = valueOffset;
                miscFeeCurrLength = valueLength;
                break;

            case Constants.MISC_FEE_TYPE:
                hasMiscFeeType = true;
                miscFeeType = buffer.getChars(miscFeeType, valueOffset, valueLength);
                miscFeeTypeOffset = valueOffset;
                miscFeeTypeLength = valueLength;
                break;

            case Constants.MISC_FEE_BASIS:
                hasMiscFeeBasis = true;
                miscFeeBasis = getInt(buffer, valueOffset, endOfField, 891, CODEC_VALIDATION_ENABLED);
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
        this.resetMiscFeeAmt();
        this.resetMiscFeeCurr();
        this.resetMiscFeeType();
        this.resetMiscFeeBasis();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetMiscFeeAmt()
    {
        hasMiscFeeAmt = false;
    }

    public void resetMiscFeeCurr()
    {
        hasMiscFeeCurr = false;
    }

    public void resetMiscFeeType()
    {
        hasMiscFeeType = false;
    }

    public void resetMiscFeeBasis()
    {
        hasMiscFeeBasis = false;
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
        builder.append("\"MessageName\": \"MiscFeesGroup\",\n");
        if (hasMiscFeeAmt())
        {
            indent(builder, level);
            builder.append("\"MiscFeeAmt\": \"");
            miscFeeAmt.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasMiscFeeCurr())
        {
            indent(builder, level);
            builder.append("\"MiscFeeCurr\": \"");
            builder.append(this.miscFeeCurr(), 0, miscFeeCurrLength());
            builder.append("\",\n");
        }

        if (hasMiscFeeType())
        {
            indent(builder, level);
            builder.append("\"MiscFeeType\": \"");
            builder.append(this.miscFeeType(), 0, miscFeeTypeLength());
            builder.append("\",\n");
        }

        if (hasMiscFeeBasis())
        {
            indent(builder, level);
            builder.append("\"MiscFeeBasis\": \"");
            builder.append(miscFeeBasis);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public MiscFeesGrpEncoder.MiscFeesGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((MiscFeesGrpEncoder.MiscFeesGroupEncoder)encoder);
    }

    public MiscFeesGrpEncoder.MiscFeesGroupEncoder toEncoder(final MiscFeesGrpEncoder.MiscFeesGroupEncoder encoder)
    {
        encoder.reset();
        if (hasMiscFeeAmt())
        {
            encoder.miscFeeAmt(this.miscFeeAmt());
        }

        if (hasMiscFeeCurr())
        {
            encoder.miscFeeCurr(this.miscFeeCurr(), 0, miscFeeCurrLength());
        }

        if (hasMiscFeeType())
        {
            encoder.miscFeeType(this.miscFeeType(), 0, miscFeeTypeLength());
        }

        if (hasMiscFeeBasis())
        {
            encoder.miscFeeBasis(this.miscFeeBasis());
        }
        return encoder;
    }

}
    public class MiscFeesGroupIterator implements Iterable<MiscFeesGroupDecoder>, java.util.Iterator<MiscFeesGroupDecoder>
    {
        private final MiscFeesGrpDecoder parent;
        private int remainder;
        private MiscFeesGroupDecoder current;

        public MiscFeesGroupIterator(final MiscFeesGrpDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }

        public MiscFeesGroupDecoder next()
        {
            remainder--;
            final MiscFeesGroupDecoder value = current;
            current = current.next();
            return value;
        }

        public int numberFieldValue()
        {
            return parent.hasNoMiscFeesGroupCounter() ? parent.noMiscFeesGroupCounter() : 0;
        }

        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.miscFeesGroup();
        }

        public MiscFeesGroupIterator iterator()
        {
            reset();
            return this;
        }

    }

    public MiscFeesGroupIterator miscFeesGroupIterator();
    public int noMiscFeesGroupCounter();
    public boolean hasNoMiscFeesGroupCounter();
    public MiscFeesGroupDecoder miscFeesGroup();

}
