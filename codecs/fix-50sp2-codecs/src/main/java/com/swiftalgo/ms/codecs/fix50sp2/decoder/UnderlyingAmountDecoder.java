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
import com.swiftalgo.ms.codecs.fix50sp2.builder.UnderlyingAmountEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.UnderlyingAmountEncoder.UnderlyingAmountsGroupEncoder;

public interface UnderlyingAmountDecoder 
{



public class UnderlyingAmountsGroupDecoder extends CommonDecoderImpl
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
            ALL_GROUP_FIELDS.add(Constants.UNDERLYING_PAY_AMOUNT);
            ALL_GROUP_FIELDS.add(Constants.UNDERLYING_COLLECT_AMOUNT);
            ALL_GROUP_FIELDS.add(Constants.UNDERLYING_SETTLEMENT_DATE);
            ALL_GROUP_FIELDS.add(Constants.UNDERLYING_SETTLEMENT_STATUS);
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
    public UnderlyingAmountsGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private UnderlyingAmountsGroupDecoder next = null;

    public UnderlyingAmountsGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(8);

    private DecimalFloat underlyingPayAmount = DecimalFloat.newNaNValue();

    private boolean hasUnderlyingPayAmount;

    public DecimalFloat underlyingPayAmount()
    {
        if (!hasUnderlyingPayAmount)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingPayAmount");
        }

        return underlyingPayAmount;
    }

    public boolean hasUnderlyingPayAmount()
    {
        return hasUnderlyingPayAmount;
    }



    private DecimalFloat underlyingCollectAmount = DecimalFloat.newNaNValue();

    private boolean hasUnderlyingCollectAmount;

    public DecimalFloat underlyingCollectAmount()
    {
        if (!hasUnderlyingCollectAmount)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingCollectAmount");
        }

        return underlyingCollectAmount;
    }

    public boolean hasUnderlyingCollectAmount()
    {
        return hasUnderlyingCollectAmount;
    }



    private byte[] underlyingSettlementDate = new byte[8];

    private boolean hasUnderlyingSettlementDate;

    public byte[] underlyingSettlementDate()
    {
        if (!hasUnderlyingSettlementDate)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSettlementDate");
        }

        return underlyingSettlementDate;
    }

    public boolean hasUnderlyingSettlementDate()
    {
        return hasUnderlyingSettlementDate;
    }


    private int underlyingSettlementDateOffset;

    private int underlyingSettlementDateLength;

    public int underlyingSettlementDateLength()
    {
        if (!hasUnderlyingSettlementDate)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSettlementDate");
        }

        return underlyingSettlementDateLength;
    }

    public String underlyingSettlementDateAsString()
    {
        return hasUnderlyingSettlementDate ? new String(underlyingSettlementDate, 0, underlyingSettlementDateLength) : null;
    }

    public void underlyingSettlementDate(final AsciiSequenceView view)
    {
        if (!hasUnderlyingSettlementDate)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSettlementDate");
        }

        view.wrap(buffer, underlyingSettlementDateOffset, underlyingSettlementDateLength);
    }


    private char[] underlyingSettlementStatus = new char[1];

    private boolean hasUnderlyingSettlementStatus;

    public char[] underlyingSettlementStatus()
    {
        if (!hasUnderlyingSettlementStatus)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSettlementStatus");
        }

        return underlyingSettlementStatus;
    }

    public boolean hasUnderlyingSettlementStatus()
    {
        return hasUnderlyingSettlementStatus;
    }


    private int underlyingSettlementStatusOffset;

    private int underlyingSettlementStatusLength;

    public int underlyingSettlementStatusLength()
    {
        if (!hasUnderlyingSettlementStatus)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSettlementStatus");
        }

        return underlyingSettlementStatusLength;
    }

    public String underlyingSettlementStatusAsString()
    {
        return hasUnderlyingSettlementStatus ? new String(underlyingSettlementStatus, 0, underlyingSettlementStatusLength) : null;
    }

    public void underlyingSettlementStatus(final AsciiSequenceView view)
    {
        if (!hasUnderlyingSettlementStatus)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSettlementStatus");
        }

        view.wrap(buffer, underlyingSettlementStatusOffset, underlyingSettlementStatusLength);
    }


    private final CharArrayWrapper underlyingSettlementStatusWrapper = new CharArrayWrapper();
    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode UnderlyingAmountsGroup
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
                    next = new UnderlyingAmountsGroupDecoder(trailer, messageFields);
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
            case Constants.UNDERLYING_PAY_AMOUNT:
                hasUnderlyingPayAmount = true;
                underlyingPayAmount = getFloat(buffer, underlyingPayAmount, valueOffset, valueLength, 985, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.UNDERLYING_COLLECT_AMOUNT:
                hasUnderlyingCollectAmount = true;
                underlyingCollectAmount = getFloat(buffer, underlyingCollectAmount, valueOffset, valueLength, 986, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.UNDERLYING_SETTLEMENT_DATE:
                hasUnderlyingSettlementDate = true;
                underlyingSettlementDate = buffer.getBytes(underlyingSettlementDate, valueOffset, valueLength);
                underlyingSettlementDateOffset = valueOffset;
                underlyingSettlementDateLength = valueLength;
                break;

            case Constants.UNDERLYING_SETTLEMENT_STATUS:
                hasUnderlyingSettlementStatus = true;
                underlyingSettlementStatus = buffer.getChars(underlyingSettlementStatus, valueOffset, valueLength);
                underlyingSettlementStatusOffset = valueOffset;
                underlyingSettlementStatusLength = valueLength;
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
        this.resetUnderlyingPayAmount();
        this.resetUnderlyingCollectAmount();
        this.resetUnderlyingSettlementDate();
        this.resetUnderlyingSettlementStatus();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetUnderlyingPayAmount()
    {
        hasUnderlyingPayAmount = false;
    }

    public void resetUnderlyingCollectAmount()
    {
        hasUnderlyingCollectAmount = false;
    }

    public void resetUnderlyingSettlementDate()
    {
        hasUnderlyingSettlementDate = false;
    }

    public void resetUnderlyingSettlementStatus()
    {
        hasUnderlyingSettlementStatus = false;
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
        builder.append("\"MessageName\": \"UnderlyingAmountsGroup\",\n");
        if (hasUnderlyingPayAmount())
        {
            indent(builder, level);
            builder.append("\"UnderlyingPayAmount\": \"");
            underlyingPayAmount.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasUnderlyingCollectAmount())
        {
            indent(builder, level);
            builder.append("\"UnderlyingCollectAmount\": \"");
            underlyingCollectAmount.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasUnderlyingSettlementDate())
        {
            indent(builder, level);
            builder.append("\"UnderlyingSettlementDate\": \"");
            appendData(builder, underlyingSettlementDate, underlyingSettlementDateLength);
            builder.append("\",\n");
        }

        if (hasUnderlyingSettlementStatus())
        {
            indent(builder, level);
            builder.append("\"UnderlyingSettlementStatus\": \"");
            builder.append(this.underlyingSettlementStatus(), 0, underlyingSettlementStatusLength());
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public UnderlyingAmountEncoder.UnderlyingAmountsGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((UnderlyingAmountEncoder.UnderlyingAmountsGroupEncoder)encoder);
    }

    public UnderlyingAmountEncoder.UnderlyingAmountsGroupEncoder toEncoder(final UnderlyingAmountEncoder.UnderlyingAmountsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasUnderlyingPayAmount())
        {
            encoder.underlyingPayAmount(this.underlyingPayAmount());
        }

        if (hasUnderlyingCollectAmount())
        {
            encoder.underlyingCollectAmount(this.underlyingCollectAmount());
        }

        if (hasUnderlyingSettlementDate())
        {
            encoder.underlyingSettlementDateAsCopy(this.underlyingSettlementDate(), 0, underlyingSettlementDateLength());
        }

        if (hasUnderlyingSettlementStatus())
        {
            encoder.underlyingSettlementStatus(this.underlyingSettlementStatus(), 0, underlyingSettlementStatusLength());
        }
        return encoder;
    }

}
    public class UnderlyingAmountsGroupIterator implements Iterable<UnderlyingAmountsGroupDecoder>, java.util.Iterator<UnderlyingAmountsGroupDecoder>
    {
        private final UnderlyingAmountDecoder parent;
        private int remainder;
        private UnderlyingAmountsGroupDecoder current;

        public UnderlyingAmountsGroupIterator(final UnderlyingAmountDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }

        public UnderlyingAmountsGroupDecoder next()
        {
            remainder--;
            final UnderlyingAmountsGroupDecoder value = current;
            current = current.next();
            return value;
        }

        public int numberFieldValue()
        {
            return parent.hasNoUnderlyingAmountsGroupCounter() ? parent.noUnderlyingAmountsGroupCounter() : 0;
        }

        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.underlyingAmountsGroup();
        }

        public UnderlyingAmountsGroupIterator iterator()
        {
            reset();
            return this;
        }

    }

    public UnderlyingAmountsGroupIterator underlyingAmountsGroupIterator();
    public int noUnderlyingAmountsGroupCounter();
    public boolean hasNoUnderlyingAmountsGroupCounter();
    public UnderlyingAmountsGroupDecoder underlyingAmountsGroup();

}
