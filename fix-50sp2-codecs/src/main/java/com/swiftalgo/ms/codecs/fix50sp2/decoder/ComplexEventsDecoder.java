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
import com.swiftalgo.ms.codecs.fix50sp2.builder.ComplexEventsEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.ComplexEventsEncoder.ComplexEventsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.ComplexEventDatesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.ComplexEventDatesEncoder.ComplexEventDatesGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.ComplexEventTimesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.ComplexEventTimesEncoder.ComplexEventTimesGroupEncoder;

public interface ComplexEventsDecoder 
{



public class ComplexEventsGroupDecoder extends CommonDecoderImpl implements ComplexEventDatesDecoder
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(0);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
        }
    }

    public final IntHashSet GROUP_FIELDS = new IntHashSet(14);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            GROUP_FIELDS.add(Constants.COMPLEX_EVENT_TYPE);
            GROUP_FIELDS.add(Constants.COMPLEX_OPT_PAYOUT_AMOUNT);
            GROUP_FIELDS.add(Constants.COMPLEX_EVENT_PRICE);
            GROUP_FIELDS.add(Constants.COMPLEX_EVENT_PRICE_BOUNDARY_METHOD);
            GROUP_FIELDS.add(Constants.COMPLEX_EVENT_PRICE_BOUNDARY_PRECISION);
            GROUP_FIELDS.add(Constants.COMPLEX_EVENT_PRICE_TIME_TYPE);
            GROUP_FIELDS.add(Constants.COMPLEX_EVENT_CONDITION);
        }
    }

    public final IntHashSet ALL_GROUP_FIELDS = new IntHashSet(14);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            ALL_GROUP_FIELDS.add(Constants.COMPLEX_EVENT_TYPE);
            ALL_GROUP_FIELDS.add(Constants.COMPLEX_OPT_PAYOUT_AMOUNT);
            ALL_GROUP_FIELDS.add(Constants.COMPLEX_EVENT_PRICE);
            ALL_GROUP_FIELDS.add(Constants.COMPLEX_EVENT_PRICE_BOUNDARY_METHOD);
            ALL_GROUP_FIELDS.add(Constants.COMPLEX_EVENT_PRICE_BOUNDARY_PRECISION);
            ALL_GROUP_FIELDS.add(Constants.COMPLEX_EVENT_PRICE_TIME_TYPE);
            ALL_GROUP_FIELDS.add(Constants.COMPLEX_EVENT_CONDITION);
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
        if (hasComplexEventType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !ComplexEventType.isValid(complexEventType()))
        {
            invalidTagId = 1484;
            rejectReason = 5;
            return false;
        }
        }

        if (hasComplexEventPriceBoundaryMethod)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !ComplexEventPriceBoundaryMethod.isValid(complexEventPriceBoundaryMethod()))
        {
            invalidTagId = 1487;
            rejectReason = 5;
            return false;
        }
        }

        if (hasComplexEventPriceTimeType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !ComplexEventPriceTimeType.isValid(complexEventPriceTimeType()))
        {
            invalidTagId = 1489;
            rejectReason = 5;
            return false;
        }
        }

        if (hasComplexEventCondition)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !ComplexEventCondition.isValid(complexEventCondition()))
        {
            invalidTagId = 1490;
            rejectReason = 5;
            return false;
        }
        }
        if (hasNoComplexEventDatesGroupCounter)
        {
            {
                int count = 0;
                final ComplexEventDatesGroupIterator iterator = complexEventDatesGroupIterator.iterator();
                for (final ComplexEventDatesGroupDecoder group : iterator)
                {
                    count++;                    if (!group.validate())
                    {
                        invalidTagId = group.invalidTagId();
                        rejectReason = group.rejectReason();
                        return false;
                    }
                }
                if (count != iterator.numberFieldValue())
                {
                    invalidTagId = 1491;
                    rejectReason = 16;
                    return false;
                }
            }
        }
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public ComplexEventsGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private ComplexEventsGroupDecoder next = null;

    public ComplexEventsGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(16);

    private int complexEventType = MISSING_INT;

    private boolean hasComplexEventType;

    public int complexEventType()
    {
        if (!hasComplexEventType)
        {
            throw new IllegalArgumentException("No value for optional field: ComplexEventType");
        }

        return complexEventType;
    }

    public boolean hasComplexEventType()
    {
        return hasComplexEventType;
    }



    private final CharArrayWrapper complexEventTypeWrapper = new CharArrayWrapper();
    public ComplexEventType complexEventTypeAsEnum()
    {
        if (!hasComplexEventType)
 return ComplexEventType.NULL_VAL;
        return ComplexEventType.decode(complexEventType);
    }

    private DecimalFloat complexOptPayoutAmount = DecimalFloat.newNaNValue();

    private boolean hasComplexOptPayoutAmount;

    public DecimalFloat complexOptPayoutAmount()
    {
        if (!hasComplexOptPayoutAmount)
        {
            throw new IllegalArgumentException("No value for optional field: ComplexOptPayoutAmount");
        }

        return complexOptPayoutAmount;
    }

    public boolean hasComplexOptPayoutAmount()
    {
        return hasComplexOptPayoutAmount;
    }



    private DecimalFloat complexEventPrice = DecimalFloat.newNaNValue();

    private boolean hasComplexEventPrice;

    public DecimalFloat complexEventPrice()
    {
        if (!hasComplexEventPrice)
        {
            throw new IllegalArgumentException("No value for optional field: ComplexEventPrice");
        }

        return complexEventPrice;
    }

    public boolean hasComplexEventPrice()
    {
        return hasComplexEventPrice;
    }



    private int complexEventPriceBoundaryMethod = MISSING_INT;

    private boolean hasComplexEventPriceBoundaryMethod;

    public int complexEventPriceBoundaryMethod()
    {
        if (!hasComplexEventPriceBoundaryMethod)
        {
            throw new IllegalArgumentException("No value for optional field: ComplexEventPriceBoundaryMethod");
        }

        return complexEventPriceBoundaryMethod;
    }

    public boolean hasComplexEventPriceBoundaryMethod()
    {
        return hasComplexEventPriceBoundaryMethod;
    }



    private final CharArrayWrapper complexEventPriceBoundaryMethodWrapper = new CharArrayWrapper();
    public ComplexEventPriceBoundaryMethod complexEventPriceBoundaryMethodAsEnum()
    {
        if (!hasComplexEventPriceBoundaryMethod)
 return ComplexEventPriceBoundaryMethod.NULL_VAL;
        return ComplexEventPriceBoundaryMethod.decode(complexEventPriceBoundaryMethod);
    }

    private DecimalFloat complexEventPriceBoundaryPrecision = DecimalFloat.newNaNValue();

    private boolean hasComplexEventPriceBoundaryPrecision;

    public DecimalFloat complexEventPriceBoundaryPrecision()
    {
        if (!hasComplexEventPriceBoundaryPrecision)
        {
            throw new IllegalArgumentException("No value for optional field: ComplexEventPriceBoundaryPrecision");
        }

        return complexEventPriceBoundaryPrecision;
    }

    public boolean hasComplexEventPriceBoundaryPrecision()
    {
        return hasComplexEventPriceBoundaryPrecision;
    }



    private int complexEventPriceTimeType = MISSING_INT;

    private boolean hasComplexEventPriceTimeType;

    public int complexEventPriceTimeType()
    {
        if (!hasComplexEventPriceTimeType)
        {
            throw new IllegalArgumentException("No value for optional field: ComplexEventPriceTimeType");
        }

        return complexEventPriceTimeType;
    }

    public boolean hasComplexEventPriceTimeType()
    {
        return hasComplexEventPriceTimeType;
    }



    private final CharArrayWrapper complexEventPriceTimeTypeWrapper = new CharArrayWrapper();
    public ComplexEventPriceTimeType complexEventPriceTimeTypeAsEnum()
    {
        if (!hasComplexEventPriceTimeType)
 return ComplexEventPriceTimeType.NULL_VAL;
        return ComplexEventPriceTimeType.decode(complexEventPriceTimeType);
    }

    private int complexEventCondition = MISSING_INT;

    private boolean hasComplexEventCondition;

    public int complexEventCondition()
    {
        if (!hasComplexEventCondition)
        {
            throw new IllegalArgumentException("No value for optional field: ComplexEventCondition");
        }

        return complexEventCondition;
    }

    public boolean hasComplexEventCondition()
    {
        return hasComplexEventCondition;
    }



    private final CharArrayWrapper complexEventConditionWrapper = new CharArrayWrapper();
    public ComplexEventCondition complexEventConditionAsEnum()
    {
        if (!hasComplexEventCondition)
 return ComplexEventCondition.NULL_VAL;
        return ComplexEventCondition.decode(complexEventCondition);
    }



    private ComplexEventDatesGroupDecoder complexEventDatesGroup = null;
    public ComplexEventDatesGroupDecoder complexEventDatesGroup()
    {
        return complexEventDatesGroup;
    }

    private int noComplexEventDatesGroupCounter = MISSING_INT;

    private boolean hasNoComplexEventDatesGroupCounter;

    public int noComplexEventDatesGroupCounter()
    {
        if (!hasNoComplexEventDatesGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoComplexEventDatesGroupCounter");
        }

        return noComplexEventDatesGroupCounter;
    }

    public boolean hasNoComplexEventDatesGroupCounter()
    {
        return hasNoComplexEventDatesGroupCounter;
    }




    private ComplexEventDatesGroupIterator complexEventDatesGroupIterator = new ComplexEventDatesGroupIterator(this);
    public ComplexEventDatesGroupIterator complexEventDatesGroupIterator()
    {
        return complexEventDatesGroupIterator.iterator();
    }


    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode ComplexEventsGroup
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
                    next = new ComplexEventsGroupDecoder(trailer, messageFields);
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
            case Constants.COMPLEX_EVENT_TYPE:
                hasComplexEventType = true;
                complexEventType = getInt(buffer, valueOffset, endOfField, 1484, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.COMPLEX_OPT_PAYOUT_AMOUNT:
                hasComplexOptPayoutAmount = true;
                complexOptPayoutAmount = getFloat(buffer, complexOptPayoutAmount, valueOffset, valueLength, 1485, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.COMPLEX_EVENT_PRICE:
                hasComplexEventPrice = true;
                complexEventPrice = getFloat(buffer, complexEventPrice, valueOffset, valueLength, 1486, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.COMPLEX_EVENT_PRICE_BOUNDARY_METHOD:
                hasComplexEventPriceBoundaryMethod = true;
                complexEventPriceBoundaryMethod = getInt(buffer, valueOffset, endOfField, 1487, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.COMPLEX_EVENT_PRICE_BOUNDARY_PRECISION:
                hasComplexEventPriceBoundaryPrecision = true;
                complexEventPriceBoundaryPrecision = getFloat(buffer, complexEventPriceBoundaryPrecision, valueOffset, valueLength, 1488, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.COMPLEX_EVENT_PRICE_TIME_TYPE:
                hasComplexEventPriceTimeType = true;
                complexEventPriceTimeType = getInt(buffer, valueOffset, endOfField, 1489, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.COMPLEX_EVENT_CONDITION:
                hasComplexEventCondition = true;
                complexEventCondition = getInt(buffer, valueOffset, endOfField, 1490, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.NO_COMPLEX_EVENT_DATES_GROUP_COUNTER:
                hasNoComplexEventDatesGroupCounter = true;
                noComplexEventDatesGroupCounter = getInt(buffer, valueOffset, endOfField, 1491, CODEC_VALIDATION_ENABLED);
                if (complexEventDatesGroup == null)
                {
                    complexEventDatesGroup = new ComplexEventDatesGroupDecoder(trailer, messageFields);
                }
                ComplexEventDatesGroupDecoder complexEventDatesGroupCurrent = complexEventDatesGroup;
                position = endOfField + 1;
                final int noComplexEventDatesGroupCounter = this.noComplexEventDatesGroupCounter;
                for (int i = 0; i < noComplexEventDatesGroupCounter && position < end; i++)
                {
                    if (complexEventDatesGroupCurrent != null)
                    {
                        position += complexEventDatesGroupCurrent.decode(buffer, position, end - position);
                        complexEventDatesGroupCurrent = complexEventDatesGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (complexEventDatesGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
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
        this.resetComplexEventType();
        this.resetComplexOptPayoutAmount();
        this.resetComplexEventPrice();
        this.resetComplexEventPriceBoundaryMethod();
        this.resetComplexEventPriceBoundaryPrecision();
        this.resetComplexEventPriceTimeType();
        this.resetComplexEventCondition();
        this.resetComplexEventDatesGroup();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetComplexEventType()
    {
        hasComplexEventType = false;
    }

    public void resetComplexOptPayoutAmount()
    {
        hasComplexOptPayoutAmount = false;
    }

    public void resetComplexEventPrice()
    {
        hasComplexEventPrice = false;
    }

    public void resetComplexEventPriceBoundaryMethod()
    {
        hasComplexEventPriceBoundaryMethod = false;
    }

    public void resetComplexEventPriceBoundaryPrecision()
    {
        hasComplexEventPriceBoundaryPrecision = false;
    }

    public void resetComplexEventPriceTimeType()
    {
        hasComplexEventPriceTimeType = false;
    }

    public void resetComplexEventCondition()
    {
        hasComplexEventCondition = false;
    }

    public void resetComplexEventDatesGroup()
    {
        for (final ComplexEventDatesGroupDecoder complexEventDatesGroupDecoder : complexEventDatesGroupIterator.iterator())
        {
            complexEventDatesGroupDecoder.reset();
            if (complexEventDatesGroupDecoder.next() == null)
            {
                break;
            }
        }
        noComplexEventDatesGroupCounter = MISSING_INT;
        hasNoComplexEventDatesGroupCounter = false;
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
        builder.append("\"MessageName\": \"ComplexEventsGroup\",\n");
        if (hasComplexEventType())
        {
            indent(builder, level);
            builder.append("\"ComplexEventType\": \"");
            builder.append(complexEventType);
            builder.append("\",\n");
        }

        if (hasComplexOptPayoutAmount())
        {
            indent(builder, level);
            builder.append("\"ComplexOptPayoutAmount\": \"");
            complexOptPayoutAmount.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasComplexEventPrice())
        {
            indent(builder, level);
            builder.append("\"ComplexEventPrice\": \"");
            complexEventPrice.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasComplexEventPriceBoundaryMethod())
        {
            indent(builder, level);
            builder.append("\"ComplexEventPriceBoundaryMethod\": \"");
            builder.append(complexEventPriceBoundaryMethod);
            builder.append("\",\n");
        }

        if (hasComplexEventPriceBoundaryPrecision())
        {
            indent(builder, level);
            builder.append("\"ComplexEventPriceBoundaryPrecision\": \"");
            complexEventPriceBoundaryPrecision.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasComplexEventPriceTimeType())
        {
            indent(builder, level);
            builder.append("\"ComplexEventPriceTimeType\": \"");
            builder.append(complexEventPriceTimeType);
            builder.append("\",\n");
        }

        if (hasComplexEventCondition())
        {
            indent(builder, level);
            builder.append("\"ComplexEventCondition\": \"");
            builder.append(complexEventCondition);
            builder.append("\",\n");
        }

        if (hasNoComplexEventDatesGroupCounter)
        {
            indent(builder, level);
            builder.append("\"ComplexEventDatesGroup\": [\n");
            ComplexEventDatesGroupDecoder complexEventDatesGroup = this.complexEventDatesGroup;
            for (int i = 0, size = this.noComplexEventDatesGroupCounter; i < size; i++)
            {
                indent(builder, level);
                complexEventDatesGroup.appendTo(builder, level + 1);
                if (complexEventDatesGroup.next() != null)
                {
                    builder.append(',');
                }
                builder.append('\n');
                complexEventDatesGroup = complexEventDatesGroup.next();            }
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
    public ComplexEventsEncoder.ComplexEventsGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((ComplexEventsEncoder.ComplexEventsGroupEncoder)encoder);
    }

    public ComplexEventsEncoder.ComplexEventsGroupEncoder toEncoder(final ComplexEventsEncoder.ComplexEventsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasComplexEventType())
        {
            encoder.complexEventType(this.complexEventType());
        }

        if (hasComplexOptPayoutAmount())
        {
            encoder.complexOptPayoutAmount(this.complexOptPayoutAmount());
        }

        if (hasComplexEventPrice())
        {
            encoder.complexEventPrice(this.complexEventPrice());
        }

        if (hasComplexEventPriceBoundaryMethod())
        {
            encoder.complexEventPriceBoundaryMethod(this.complexEventPriceBoundaryMethod());
        }

        if (hasComplexEventPriceBoundaryPrecision())
        {
            encoder.complexEventPriceBoundaryPrecision(this.complexEventPriceBoundaryPrecision());
        }

        if (hasComplexEventPriceTimeType())
        {
            encoder.complexEventPriceTimeType(this.complexEventPriceTimeType());
        }

        if (hasComplexEventCondition())
        {
            encoder.complexEventCondition(this.complexEventCondition());
        }


        final ComplexEventDatesEncoder complexEventDates = encoder.complexEventDates();        if (hasNoComplexEventDatesGroupCounter)
        {
            final int size = this.noComplexEventDatesGroupCounter;
            ComplexEventDatesGroupDecoder complexEventDatesGroup = this.complexEventDatesGroup;
            ComplexEventDatesGroupEncoder complexEventDatesGroupEncoder = complexEventDates.complexEventDatesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (complexEventDatesGroup != null)
                {
                    complexEventDatesGroup.toEncoder(complexEventDatesGroupEncoder);
                    complexEventDatesGroup = complexEventDatesGroup.next();
                    complexEventDatesGroupEncoder = complexEventDatesGroupEncoder.next();
                }
            }
        }

        return encoder;
    }

}
    public class ComplexEventsGroupIterator implements Iterable<ComplexEventsGroupDecoder>, java.util.Iterator<ComplexEventsGroupDecoder>
    {
        private final ComplexEventsDecoder parent;
        private int remainder;
        private ComplexEventsGroupDecoder current;

        public ComplexEventsGroupIterator(final ComplexEventsDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }

        public ComplexEventsGroupDecoder next()
        {
            remainder--;
            final ComplexEventsGroupDecoder value = current;
            current = current.next();
            return value;
        }

        public int numberFieldValue()
        {
            return parent.hasNoComplexEventsGroupCounter() ? parent.noComplexEventsGroupCounter() : 0;
        }

        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.complexEventsGroup();
        }

        public ComplexEventsGroupIterator iterator()
        {
            reset();
            return this;
        }

    }

    public ComplexEventsGroupIterator complexEventsGroupIterator();
    public int noComplexEventsGroupCounter();
    public boolean hasNoComplexEventsGroupCounter();
    public ComplexEventsGroupDecoder complexEventsGroup();

}
