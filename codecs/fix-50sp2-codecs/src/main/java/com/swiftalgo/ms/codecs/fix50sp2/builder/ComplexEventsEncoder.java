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


public class ComplexEventsEncoder
{
    private static final int noComplexEventsGroupCounterHeaderLength = 5;
    private static final byte[] noComplexEventsGroupCounterHeader = new byte[] {49, 52, 56, 51, (byte) '='};



public static class ComplexEventsGroupEncoder
{
    private ComplexEventsGroupEncoder next = null;

    public ComplexEventsGroupEncoder next()
    {
        if (next == null)
        {
            next = new ComplexEventsGroupEncoder();
        }
        return next;
    }

    private static final int complexEventTypeHeaderLength = 5;
    private static final byte[] complexEventTypeHeader = new byte[] {49, 52, 56, 52, (byte) '='};

    private static final int complexOptPayoutAmountHeaderLength = 5;
    private static final byte[] complexOptPayoutAmountHeader = new byte[] {49, 52, 56, 53, (byte) '='};

    private static final int complexEventPriceHeaderLength = 5;
    private static final byte[] complexEventPriceHeader = new byte[] {49, 52, 56, 54, (byte) '='};

    private static final int complexEventPriceBoundaryMethodHeaderLength = 5;
    private static final byte[] complexEventPriceBoundaryMethodHeader = new byte[] {49, 52, 56, 55, (byte) '='};

    private static final int complexEventPriceBoundaryPrecisionHeaderLength = 5;
    private static final byte[] complexEventPriceBoundaryPrecisionHeader = new byte[] {49, 52, 56, 56, (byte) '='};

    private static final int complexEventPriceTimeTypeHeaderLength = 5;
    private static final byte[] complexEventPriceTimeTypeHeader = new byte[] {49, 52, 56, 57, (byte) '='};

    private static final int complexEventConditionHeaderLength = 5;
    private static final byte[] complexEventConditionHeader = new byte[] {49, 52, 57, 48, (byte) '='};

    private int complexEventType;

    private boolean hasComplexEventType;

    public boolean hasComplexEventType()
    {
        return hasComplexEventType;
    }

    public ComplexEventsGroupEncoder complexEventType(int value)
    {
        complexEventType = value;
        hasComplexEventType = true;
        return this;
    }

    public int complexEventType()
    {
        return complexEventType;
    }

    public ComplexEventsGroupEncoder complexEventType(ComplexEventType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == ComplexEventType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: complexEventType Value: " + value );
            }
            if (value == ComplexEventType.NULL_VAL)
            {
                return this;
            }
        }
        return complexEventType(value.representation());
    }

    private final DecimalFloat complexOptPayoutAmount = new DecimalFloat();

    private boolean hasComplexOptPayoutAmount;

    public boolean hasComplexOptPayoutAmount()
    {
        return hasComplexOptPayoutAmount;
    }

    public ComplexEventsGroupEncoder complexOptPayoutAmount(DecimalFloat value)
    {
        complexOptPayoutAmount.set(value);
        hasComplexOptPayoutAmount = true;
        return this;
    }

    public ComplexEventsGroupEncoder complexOptPayoutAmount(long value, int scale)
    {
        complexOptPayoutAmount.set(value, scale);
        hasComplexOptPayoutAmount = true;
        return this;
    }

    public DecimalFloat complexOptPayoutAmount()
    {
        return complexOptPayoutAmount;
    }

    private final DecimalFloat complexEventPrice = new DecimalFloat();

    private boolean hasComplexEventPrice;

    public boolean hasComplexEventPrice()
    {
        return hasComplexEventPrice;
    }

    public ComplexEventsGroupEncoder complexEventPrice(DecimalFloat value)
    {
        complexEventPrice.set(value);
        hasComplexEventPrice = true;
        return this;
    }

    public ComplexEventsGroupEncoder complexEventPrice(long value, int scale)
    {
        complexEventPrice.set(value, scale);
        hasComplexEventPrice = true;
        return this;
    }

    public DecimalFloat complexEventPrice()
    {
        return complexEventPrice;
    }

    private int complexEventPriceBoundaryMethod;

    private boolean hasComplexEventPriceBoundaryMethod;

    public boolean hasComplexEventPriceBoundaryMethod()
    {
        return hasComplexEventPriceBoundaryMethod;
    }

    public ComplexEventsGroupEncoder complexEventPriceBoundaryMethod(int value)
    {
        complexEventPriceBoundaryMethod = value;
        hasComplexEventPriceBoundaryMethod = true;
        return this;
    }

    public int complexEventPriceBoundaryMethod()
    {
        return complexEventPriceBoundaryMethod;
    }

    public ComplexEventsGroupEncoder complexEventPriceBoundaryMethod(ComplexEventPriceBoundaryMethod value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == ComplexEventPriceBoundaryMethod.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: complexEventPriceBoundaryMethod Value: " + value );
            }
            if (value == ComplexEventPriceBoundaryMethod.NULL_VAL)
            {
                return this;
            }
        }
        return complexEventPriceBoundaryMethod(value.representation());
    }

    private final DecimalFloat complexEventPriceBoundaryPrecision = new DecimalFloat();

    private boolean hasComplexEventPriceBoundaryPrecision;

    public boolean hasComplexEventPriceBoundaryPrecision()
    {
        return hasComplexEventPriceBoundaryPrecision;
    }

    public ComplexEventsGroupEncoder complexEventPriceBoundaryPrecision(DecimalFloat value)
    {
        complexEventPriceBoundaryPrecision.set(value);
        hasComplexEventPriceBoundaryPrecision = true;
        return this;
    }

    public ComplexEventsGroupEncoder complexEventPriceBoundaryPrecision(long value, int scale)
    {
        complexEventPriceBoundaryPrecision.set(value, scale);
        hasComplexEventPriceBoundaryPrecision = true;
        return this;
    }

    public DecimalFloat complexEventPriceBoundaryPrecision()
    {
        return complexEventPriceBoundaryPrecision;
    }

    private int complexEventPriceTimeType;

    private boolean hasComplexEventPriceTimeType;

    public boolean hasComplexEventPriceTimeType()
    {
        return hasComplexEventPriceTimeType;
    }

    public ComplexEventsGroupEncoder complexEventPriceTimeType(int value)
    {
        complexEventPriceTimeType = value;
        hasComplexEventPriceTimeType = true;
        return this;
    }

    public int complexEventPriceTimeType()
    {
        return complexEventPriceTimeType;
    }

    public ComplexEventsGroupEncoder complexEventPriceTimeType(ComplexEventPriceTimeType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == ComplexEventPriceTimeType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: complexEventPriceTimeType Value: " + value );
            }
            if (value == ComplexEventPriceTimeType.NULL_VAL)
            {
                return this;
            }
        }
        return complexEventPriceTimeType(value.representation());
    }

    private int complexEventCondition;

    private boolean hasComplexEventCondition;

    public boolean hasComplexEventCondition()
    {
        return hasComplexEventCondition;
    }

    public ComplexEventsGroupEncoder complexEventCondition(int value)
    {
        complexEventCondition = value;
        hasComplexEventCondition = true;
        return this;
    }

    public int complexEventCondition()
    {
        return complexEventCondition;
    }

    public ComplexEventsGroupEncoder complexEventCondition(ComplexEventCondition value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == ComplexEventCondition.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: complexEventCondition Value: " + value );
            }
            if (value == ComplexEventCondition.NULL_VAL)
            {
                return this;
            }
        }
        return complexEventCondition(value.representation());
    }

    private final ComplexEventDatesEncoder complexEventDates = new ComplexEventDatesEncoder();
    public ComplexEventDatesEncoder complexEventDates()
    {
        return complexEventDates;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (hasComplexEventType)
        {
            buffer.putBytes(position, complexEventTypeHeader, 0, complexEventTypeHeaderLength);
            position += complexEventTypeHeaderLength;
            position += buffer.putIntAscii(position, complexEventType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasComplexOptPayoutAmount)
        {
            buffer.putBytes(position, complexOptPayoutAmountHeader, 0, complexOptPayoutAmountHeaderLength);
            position += complexOptPayoutAmountHeaderLength;
            position += buffer.putFloatAscii(position, complexOptPayoutAmount);
            buffer.putSeparator(position);
            position++;
        }

        if (hasComplexEventPrice)
        {
            buffer.putBytes(position, complexEventPriceHeader, 0, complexEventPriceHeaderLength);
            position += complexEventPriceHeaderLength;
            position += buffer.putFloatAscii(position, complexEventPrice);
            buffer.putSeparator(position);
            position++;
        }

        if (hasComplexEventPriceBoundaryMethod)
        {
            buffer.putBytes(position, complexEventPriceBoundaryMethodHeader, 0, complexEventPriceBoundaryMethodHeaderLength);
            position += complexEventPriceBoundaryMethodHeaderLength;
            position += buffer.putIntAscii(position, complexEventPriceBoundaryMethod);
            buffer.putSeparator(position);
            position++;
        }

        if (hasComplexEventPriceBoundaryPrecision)
        {
            buffer.putBytes(position, complexEventPriceBoundaryPrecisionHeader, 0, complexEventPriceBoundaryPrecisionHeaderLength);
            position += complexEventPriceBoundaryPrecisionHeaderLength;
            position += buffer.putFloatAscii(position, complexEventPriceBoundaryPrecision);
            buffer.putSeparator(position);
            position++;
        }

        if (hasComplexEventPriceTimeType)
        {
            buffer.putBytes(position, complexEventPriceTimeTypeHeader, 0, complexEventPriceTimeTypeHeaderLength);
            position += complexEventPriceTimeTypeHeaderLength;
            position += buffer.putIntAscii(position, complexEventPriceTimeType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasComplexEventCondition)
        {
            buffer.putBytes(position, complexEventConditionHeader, 0, complexEventConditionHeaderLength);
            position += complexEventConditionHeaderLength;
            position += buffer.putIntAscii(position, complexEventCondition);
            buffer.putSeparator(position);
            position++;
        }

            position += complexEventDates.encode(buffer, position);
        if (next != null)
        {
            position += next.encode(buffer, position, remainingElements - 1);
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
        complexEventDates.reset();
        if (next != null)        {
            next.reset();
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

    indent(builder, level);
    builder.append("\"ComplexEventDates\": ");
    complexEventDates.appendTo(builder, level + 1);
    builder.append("\n");
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public ComplexEventsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((ComplexEventsGroupEncoder)encoder);
    }

    public ComplexEventsGroupEncoder copyTo(final ComplexEventsGroupEncoder encoder)
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


        complexEventDates.copyTo(encoder.complexEventDates());        return encoder;
    }

}
    private int noComplexEventsGroupCounter;

    private boolean hasNoComplexEventsGroupCounter;

    public boolean hasNoComplexEventsGroupCounter()
    {
        return hasNoComplexEventsGroupCounter;
    }

    public ComplexEventsEncoder noComplexEventsGroupCounter(int value)
    {
        noComplexEventsGroupCounter = value;
        hasNoComplexEventsGroupCounter = true;
        return this;
    }

    public int noComplexEventsGroupCounter()
    {
        return noComplexEventsGroupCounter;
    }


    private ComplexEventsGroupEncoder complexEventsGroup = null;

    public ComplexEventsGroupEncoder complexEventsGroup(final int numberOfElements)
    {
        hasNoComplexEventsGroupCounter = true;
        noComplexEventsGroupCounter = numberOfElements;
        if (complexEventsGroup == null)
        {
            complexEventsGroup = new ComplexEventsGroupEncoder();
        }
        return complexEventsGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoComplexEventsGroupCounter)
        {
            buffer.putBytes(position, noComplexEventsGroupCounterHeader, 0, noComplexEventsGroupCounterHeaderLength);
            position += noComplexEventsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noComplexEventsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (complexEventsGroup != null)
        {
            position += complexEventsGroup.encode(buffer, position, noComplexEventsGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetComplexEventsGroup();
    }

    public void resetComplexEventsGroup()
    {
        if (complexEventsGroup != null)
        {
            complexEventsGroup.reset();
        }
        noComplexEventsGroupCounter = 0;
        hasNoComplexEventsGroupCounter = false;
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
        builder.append("\"MessageName\": \"ComplexEvents\",\n");
        if (hasNoComplexEventsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"ComplexEventsGroup\": [\n");
            final int noComplexEventsGroupCounter = this.noComplexEventsGroupCounter;
            ComplexEventsGroupEncoder complexEventsGroup = this.complexEventsGroup;
            for (int i = 0; i < noComplexEventsGroupCounter; i++)
            {
                indent(builder, level);
                complexEventsGroup.appendTo(builder, level + 1);
                if (i < (noComplexEventsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                complexEventsGroup = complexEventsGroup.next();
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
    public ComplexEventsEncoder copyTo(final Encoder encoder)
    {
        return copyTo((ComplexEventsEncoder)encoder);
    }

    public ComplexEventsEncoder copyTo(final ComplexEventsEncoder encoder)
    {
        encoder.reset();
        if (hasNoComplexEventsGroupCounter)
        {
            final int size = this.noComplexEventsGroupCounter;
            ComplexEventsGroupEncoder complexEventsGroup = this.complexEventsGroup;
            ComplexEventsGroupEncoder complexEventsGroupEncoder = encoder.complexEventsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (complexEventsGroup != null)
                {
                    complexEventsGroup.copyTo(complexEventsGroupEncoder);
                    complexEventsGroup = complexEventsGroup.next();
                    complexEventsGroupEncoder = complexEventsGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
