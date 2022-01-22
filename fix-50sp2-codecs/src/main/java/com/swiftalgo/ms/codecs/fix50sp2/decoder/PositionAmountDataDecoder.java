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
import com.swiftalgo.ms.codecs.fix50sp2.builder.PositionAmountDataEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.PositionAmountDataEncoder.PosAmtGroupEncoder;

public interface PositionAmountDataDecoder 
{



public class PosAmtGroupDecoder extends CommonDecoderImpl
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
            ALL_GROUP_FIELDS.add(Constants.POS_AMT_TYPE);
            ALL_GROUP_FIELDS.add(Constants.POS_AMT);
            ALL_GROUP_FIELDS.add(Constants.POSITION_CURRENCY);
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
        if (hasPosAmtType)
        {
        posAmtTypeWrapper.wrap(this.posAmtType(), posAmtTypeLength);
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !PosAmtType.isValid(posAmtTypeWrapper))
        {
            invalidTagId = 707;
            rejectReason = 5;
            return false;
        }
        }
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public PosAmtGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private PosAmtGroupDecoder next = null;

    public PosAmtGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(6);

    private char[] posAmtType = new char[1];

    private boolean hasPosAmtType;

    public char[] posAmtType()
    {
        if (!hasPosAmtType)
        {
            throw new IllegalArgumentException("No value for optional field: PosAmtType");
        }

        return posAmtType;
    }

    public boolean hasPosAmtType()
    {
        return hasPosAmtType;
    }


    private int posAmtTypeOffset;

    private int posAmtTypeLength;

    public int posAmtTypeLength()
    {
        if (!hasPosAmtType)
        {
            throw new IllegalArgumentException("No value for optional field: PosAmtType");
        }

        return posAmtTypeLength;
    }

    public String posAmtTypeAsString()
    {
        return hasPosAmtType ? new String(posAmtType, 0, posAmtTypeLength) : null;
    }

    public void posAmtType(final AsciiSequenceView view)
    {
        if (!hasPosAmtType)
        {
            throw new IllegalArgumentException("No value for optional field: PosAmtType");
        }

        view.wrap(buffer, posAmtTypeOffset, posAmtTypeLength);
    }


    private final CharArrayWrapper posAmtTypeWrapper = new CharArrayWrapper();
    public PosAmtType posAmtTypeAsEnum()
    {
        if (!hasPosAmtType)
 return PosAmtType.NULL_VAL;
        posAmtTypeWrapper.wrap(this.posAmtType(), posAmtTypeLength);
        return PosAmtType.decode(posAmtTypeWrapper);
    }

    private DecimalFloat posAmt = DecimalFloat.newNaNValue();

    private boolean hasPosAmt;

    public DecimalFloat posAmt()
    {
        if (!hasPosAmt)
        {
            throw new IllegalArgumentException("No value for optional field: PosAmt");
        }

        return posAmt;
    }

    public boolean hasPosAmt()
    {
        return hasPosAmt;
    }



    private char[] positionCurrency = new char[1];

    private boolean hasPositionCurrency;

    public char[] positionCurrency()
    {
        if (!hasPositionCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: PositionCurrency");
        }

        return positionCurrency;
    }

    public boolean hasPositionCurrency()
    {
        return hasPositionCurrency;
    }


    private int positionCurrencyOffset;

    private int positionCurrencyLength;

    public int positionCurrencyLength()
    {
        if (!hasPositionCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: PositionCurrency");
        }

        return positionCurrencyLength;
    }

    public String positionCurrencyAsString()
    {
        return hasPositionCurrency ? new String(positionCurrency, 0, positionCurrencyLength) : null;
    }

    public void positionCurrency(final AsciiSequenceView view)
    {
        if (!hasPositionCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: PositionCurrency");
        }

        view.wrap(buffer, positionCurrencyOffset, positionCurrencyLength);
    }


    private final CharArrayWrapper positionCurrencyWrapper = new CharArrayWrapper();
    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode PosAmtGroup
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
                    next = new PosAmtGroupDecoder(trailer, messageFields);
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
            case Constants.POS_AMT_TYPE:
                hasPosAmtType = true;
                posAmtType = buffer.getChars(posAmtType, valueOffset, valueLength);
                posAmtTypeOffset = valueOffset;
                posAmtTypeLength = valueLength;
                break;

            case Constants.POS_AMT:
                hasPosAmt = true;
                posAmt = getFloat(buffer, posAmt, valueOffset, valueLength, 708, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.POSITION_CURRENCY:
                hasPositionCurrency = true;
                positionCurrency = buffer.getChars(positionCurrency, valueOffset, valueLength);
                positionCurrencyOffset = valueOffset;
                positionCurrencyLength = valueLength;
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
        this.resetPosAmtType();
        this.resetPosAmt();
        this.resetPositionCurrency();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetPosAmtType()
    {
        hasPosAmtType = false;
    }

    public void resetPosAmt()
    {
        hasPosAmt = false;
    }

    public void resetPositionCurrency()
    {
        hasPositionCurrency = false;
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
        builder.append("\"MessageName\": \"PosAmtGroup\",\n");
        if (hasPosAmtType())
        {
            indent(builder, level);
            builder.append("\"PosAmtType\": \"");
            builder.append(this.posAmtType(), 0, posAmtTypeLength());
            builder.append("\",\n");
        }

        if (hasPosAmt())
        {
            indent(builder, level);
            builder.append("\"PosAmt\": \"");
            posAmt.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasPositionCurrency())
        {
            indent(builder, level);
            builder.append("\"PositionCurrency\": \"");
            builder.append(this.positionCurrency(), 0, positionCurrencyLength());
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public PositionAmountDataEncoder.PosAmtGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((PositionAmountDataEncoder.PosAmtGroupEncoder)encoder);
    }

    public PositionAmountDataEncoder.PosAmtGroupEncoder toEncoder(final PositionAmountDataEncoder.PosAmtGroupEncoder encoder)
    {
        encoder.reset();
        if (hasPosAmtType())
        {
            encoder.posAmtType(this.posAmtType(), 0, posAmtTypeLength());
        }

        if (hasPosAmt())
        {
            encoder.posAmt(this.posAmt());
        }

        if (hasPositionCurrency())
        {
            encoder.positionCurrency(this.positionCurrency(), 0, positionCurrencyLength());
        }
        return encoder;
    }

}
    public class PosAmtGroupIterator implements Iterable<PosAmtGroupDecoder>, java.util.Iterator<PosAmtGroupDecoder>
    {
        private final PositionAmountDataDecoder parent;
        private int remainder;
        private PosAmtGroupDecoder current;

        public PosAmtGroupIterator(final PositionAmountDataDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }

        public PosAmtGroupDecoder next()
        {
            remainder--;
            final PosAmtGroupDecoder value = current;
            current = current.next();
            return value;
        }

        public int numberFieldValue()
        {
            return parent.hasNoPosAmtGroupCounter() ? parent.noPosAmtGroupCounter() : 0;
        }

        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.posAmtGroup();
        }

        public PosAmtGroupIterator iterator()
        {
            reset();
            return this;
        }

    }

    public PosAmtGroupIterator posAmtGroupIterator();
    public int noPosAmtGroupCounter();
    public boolean hasNoPosAmtGroupCounter();
    public PosAmtGroupDecoder posAmtGroup();

}
