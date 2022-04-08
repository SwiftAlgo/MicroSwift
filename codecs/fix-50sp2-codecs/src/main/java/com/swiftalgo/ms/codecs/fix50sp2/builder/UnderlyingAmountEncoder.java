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


public class UnderlyingAmountEncoder
{
    private static final int noUnderlyingAmountsGroupCounterHeaderLength = 4;
    private static final byte[] noUnderlyingAmountsGroupCounterHeader = new byte[] {57, 56, 52, (byte) '='};



public static class UnderlyingAmountsGroupEncoder
{
    private UnderlyingAmountsGroupEncoder next = null;

    public UnderlyingAmountsGroupEncoder next()
    {
        if (next == null)
        {
            next = new UnderlyingAmountsGroupEncoder();
        }
        return next;
    }

    private static final int underlyingPayAmountHeaderLength = 4;
    private static final byte[] underlyingPayAmountHeader = new byte[] {57, 56, 53, (byte) '='};

    private static final int underlyingCollectAmountHeaderLength = 4;
    private static final byte[] underlyingCollectAmountHeader = new byte[] {57, 56, 54, (byte) '='};

    private static final int underlyingSettlementDateHeaderLength = 4;
    private static final byte[] underlyingSettlementDateHeader = new byte[] {57, 56, 55, (byte) '='};

    private static final int underlyingSettlementStatusHeaderLength = 4;
    private static final byte[] underlyingSettlementStatusHeader = new byte[] {57, 56, 56, (byte) '='};

    private final DecimalFloat underlyingPayAmount = new DecimalFloat();

    private boolean hasUnderlyingPayAmount;

    public boolean hasUnderlyingPayAmount()
    {
        return hasUnderlyingPayAmount;
    }

    public UnderlyingAmountsGroupEncoder underlyingPayAmount(DecimalFloat value)
    {
        underlyingPayAmount.set(value);
        hasUnderlyingPayAmount = true;
        return this;
    }

    public UnderlyingAmountsGroupEncoder underlyingPayAmount(long value, int scale)
    {
        underlyingPayAmount.set(value, scale);
        hasUnderlyingPayAmount = true;
        return this;
    }

    public DecimalFloat underlyingPayAmount()
    {
        return underlyingPayAmount;
    }

    private final DecimalFloat underlyingCollectAmount = new DecimalFloat();

    private boolean hasUnderlyingCollectAmount;

    public boolean hasUnderlyingCollectAmount()
    {
        return hasUnderlyingCollectAmount;
    }

    public UnderlyingAmountsGroupEncoder underlyingCollectAmount(DecimalFloat value)
    {
        underlyingCollectAmount.set(value);
        hasUnderlyingCollectAmount = true;
        return this;
    }

    public UnderlyingAmountsGroupEncoder underlyingCollectAmount(long value, int scale)
    {
        underlyingCollectAmount.set(value, scale);
        hasUnderlyingCollectAmount = true;
        return this;
    }

    public DecimalFloat underlyingCollectAmount()
    {
        return underlyingCollectAmount;
    }

    private final MutableDirectBuffer underlyingSettlementDate = new UnsafeBuffer();

    private int underlyingSettlementDateOffset = 0;

    private int underlyingSettlementDateLength = 0;

    public UnderlyingAmountsGroupEncoder underlyingSettlementDate(final DirectBuffer value, final int offset, final int length)
    {
        underlyingSettlementDate.wrap(value);
        underlyingSettlementDateOffset = offset;
        underlyingSettlementDateLength = length;
        return this;
    }

    public UnderlyingAmountsGroupEncoder underlyingSettlementDate(final DirectBuffer value, final int length)
    {
        return underlyingSettlementDate(value, 0, length);
    }

    public UnderlyingAmountsGroupEncoder underlyingSettlementDate(final DirectBuffer value)
    {
        return underlyingSettlementDate(value, 0, value.capacity());
    }

    public UnderlyingAmountsGroupEncoder underlyingSettlementDate(final byte[] value, final int offset, final int length)
    {
        underlyingSettlementDate.wrap(value);
        underlyingSettlementDateOffset = offset;
        underlyingSettlementDateLength = length;
        return this;
    }

    public UnderlyingAmountsGroupEncoder underlyingSettlementDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(underlyingSettlementDate, value, offset, length);
        underlyingSettlementDateOffset = offset;
        underlyingSettlementDateLength = length;
        return this;
    }

    public UnderlyingAmountsGroupEncoder underlyingSettlementDate(final byte[] value, final int length)
    {
        return underlyingSettlementDate(value, 0, length);
    }

    public UnderlyingAmountsGroupEncoder underlyingSettlementDate(final byte[] value)
    {
        return underlyingSettlementDate(value, 0, value.length);
    }

    public boolean hasUnderlyingSettlementDate()
    {
        return underlyingSettlementDateLength > 0;
    }

    public MutableDirectBuffer underlyingSettlementDate()
    {
        return underlyingSettlementDate;
    }

    public String underlyingSettlementDateAsString()
    {
        return underlyingSettlementDate.getStringWithoutLengthAscii(underlyingSettlementDateOffset, underlyingSettlementDateLength);
    }

    private final MutableDirectBuffer underlyingSettlementStatus = new UnsafeBuffer();

    private int underlyingSettlementStatusOffset = 0;

    private int underlyingSettlementStatusLength = 0;

    public UnderlyingAmountsGroupEncoder underlyingSettlementStatus(final DirectBuffer value, final int offset, final int length)
    {
        underlyingSettlementStatus.wrap(value);
        underlyingSettlementStatusOffset = offset;
        underlyingSettlementStatusLength = length;
        return this;
    }

    public UnderlyingAmountsGroupEncoder underlyingSettlementStatus(final DirectBuffer value, final int length)
    {
        return underlyingSettlementStatus(value, 0, length);
    }

    public UnderlyingAmountsGroupEncoder underlyingSettlementStatus(final DirectBuffer value)
    {
        return underlyingSettlementStatus(value, 0, value.capacity());
    }

    public UnderlyingAmountsGroupEncoder underlyingSettlementStatus(final byte[] value, final int offset, final int length)
    {
        underlyingSettlementStatus.wrap(value);
        underlyingSettlementStatusOffset = offset;
        underlyingSettlementStatusLength = length;
        return this;
    }

    public UnderlyingAmountsGroupEncoder underlyingSettlementStatusAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(underlyingSettlementStatus, value, offset, length);
        underlyingSettlementStatusOffset = offset;
        underlyingSettlementStatusLength = length;
        return this;
    }

    public UnderlyingAmountsGroupEncoder underlyingSettlementStatus(final byte[] value, final int length)
    {
        return underlyingSettlementStatus(value, 0, length);
    }

    public UnderlyingAmountsGroupEncoder underlyingSettlementStatus(final byte[] value)
    {
        return underlyingSettlementStatus(value, 0, value.length);
    }

    public boolean hasUnderlyingSettlementStatus()
    {
        return underlyingSettlementStatusLength > 0;
    }

    public MutableDirectBuffer underlyingSettlementStatus()
    {
        return underlyingSettlementStatus;
    }

    public String underlyingSettlementStatusAsString()
    {
        return underlyingSettlementStatus.getStringWithoutLengthAscii(underlyingSettlementStatusOffset, underlyingSettlementStatusLength);
    }

    public UnderlyingAmountsGroupEncoder underlyingSettlementStatus(final CharSequence value)
    {
        toBytes(value, underlyingSettlementStatus);
        underlyingSettlementStatusOffset = 0;
        underlyingSettlementStatusLength = value.length();
        return this;
    }

    public UnderlyingAmountsGroupEncoder underlyingSettlementStatus(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            underlyingSettlementStatus.wrap(buffer);
            underlyingSettlementStatusOffset = value.offset();
            underlyingSettlementStatusLength = value.length();
        }
        return this;
    }

    public UnderlyingAmountsGroupEncoder underlyingSettlementStatus(final char[] value)
    {
        return underlyingSettlementStatus(value, 0, value.length);
    }

    public UnderlyingAmountsGroupEncoder underlyingSettlementStatus(final char[] value, final int length)
    {
        return underlyingSettlementStatus(value, 0, length);
    }

    public UnderlyingAmountsGroupEncoder underlyingSettlementStatus(final char[] value, final int offset, final int length)
    {
        toBytes(value, underlyingSettlementStatus, offset, length);
        underlyingSettlementStatusOffset = 0;
        underlyingSettlementStatusLength = length;
        return this;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (hasUnderlyingPayAmount)
        {
            buffer.putBytes(position, underlyingPayAmountHeader, 0, underlyingPayAmountHeaderLength);
            position += underlyingPayAmountHeaderLength;
            position += buffer.putFloatAscii(position, underlyingPayAmount);
            buffer.putSeparator(position);
            position++;
        }

        if (hasUnderlyingCollectAmount)
        {
            buffer.putBytes(position, underlyingCollectAmountHeader, 0, underlyingCollectAmountHeaderLength);
            position += underlyingCollectAmountHeaderLength;
            position += buffer.putFloatAscii(position, underlyingCollectAmount);
            buffer.putSeparator(position);
            position++;
        }

        if (underlyingSettlementDateLength > 0)
        {
            buffer.putBytes(position, underlyingSettlementDateHeader, 0, underlyingSettlementDateHeaderLength);
            position += underlyingSettlementDateHeaderLength;
            buffer.putBytes(position, underlyingSettlementDate, underlyingSettlementDateOffset, underlyingSettlementDateLength);
            position += underlyingSettlementDateLength;
            buffer.putSeparator(position);
            position++;
        }

        if (underlyingSettlementStatusLength > 0)
        {
            buffer.putBytes(position, underlyingSettlementStatusHeader, 0, underlyingSettlementStatusHeaderLength);
            position += underlyingSettlementStatusHeaderLength;
            buffer.putBytes(position, underlyingSettlementStatus, underlyingSettlementStatusOffset, underlyingSettlementStatusLength);
            position += underlyingSettlementStatusLength;
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
        this.resetUnderlyingPayAmount();
        this.resetUnderlyingCollectAmount();
        this.resetUnderlyingSettlementDate();
        this.resetUnderlyingSettlementStatus();
        if (next != null)        {
            next.reset();
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
        underlyingSettlementDateLength = 0;
    }

    public void resetUnderlyingSettlementStatus()
    {
        underlyingSettlementStatusLength = 0;
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
            appendBuffer(builder, underlyingSettlementDate, underlyingSettlementDateOffset, underlyingSettlementDateLength);
            builder.append("\",\n");
        }

        if (hasUnderlyingSettlementStatus())
        {
            indent(builder, level);
            builder.append("\"UnderlyingSettlementStatus\": \"");
            appendBuffer(builder, underlyingSettlementStatus, underlyingSettlementStatusOffset, underlyingSettlementStatusLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public UnderlyingAmountsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((UnderlyingAmountsGroupEncoder)encoder);
    }

    public UnderlyingAmountsGroupEncoder copyTo(final UnderlyingAmountsGroupEncoder encoder)
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
            encoder.underlyingSettlementDateAsCopy(underlyingSettlementDate.byteArray(), 0, underlyingSettlementDateLength);
        }

        if (hasUnderlyingSettlementStatus())
        {
            encoder.underlyingSettlementStatusAsCopy(underlyingSettlementStatus.byteArray(), 0, underlyingSettlementStatusLength);
        }
        return encoder;
    }

}
    private int noUnderlyingAmountsGroupCounter;

    private boolean hasNoUnderlyingAmountsGroupCounter;

    public boolean hasNoUnderlyingAmountsGroupCounter()
    {
        return hasNoUnderlyingAmountsGroupCounter;
    }

    public UnderlyingAmountEncoder noUnderlyingAmountsGroupCounter(int value)
    {
        noUnderlyingAmountsGroupCounter = value;
        hasNoUnderlyingAmountsGroupCounter = true;
        return this;
    }

    public int noUnderlyingAmountsGroupCounter()
    {
        return noUnderlyingAmountsGroupCounter;
    }


    private UnderlyingAmountsGroupEncoder underlyingAmountsGroup = null;

    public UnderlyingAmountsGroupEncoder underlyingAmountsGroup(final int numberOfElements)
    {
        hasNoUnderlyingAmountsGroupCounter = true;
        noUnderlyingAmountsGroupCounter = numberOfElements;
        if (underlyingAmountsGroup == null)
        {
            underlyingAmountsGroup = new UnderlyingAmountsGroupEncoder();
        }
        return underlyingAmountsGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoUnderlyingAmountsGroupCounter)
        {
            buffer.putBytes(position, noUnderlyingAmountsGroupCounterHeader, 0, noUnderlyingAmountsGroupCounterHeaderLength);
            position += noUnderlyingAmountsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noUnderlyingAmountsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (underlyingAmountsGroup != null)
        {
            position += underlyingAmountsGroup.encode(buffer, position, noUnderlyingAmountsGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetUnderlyingAmountsGroup();
    }

    public void resetUnderlyingAmountsGroup()
    {
        if (underlyingAmountsGroup != null)
        {
            underlyingAmountsGroup.reset();
        }
        noUnderlyingAmountsGroupCounter = 0;
        hasNoUnderlyingAmountsGroupCounter = false;
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
        builder.append("\"MessageName\": \"UnderlyingAmount\",\n");
        if (hasNoUnderlyingAmountsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"UnderlyingAmountsGroup\": [\n");
            final int noUnderlyingAmountsGroupCounter = this.noUnderlyingAmountsGroupCounter;
            UnderlyingAmountsGroupEncoder underlyingAmountsGroup = this.underlyingAmountsGroup;
            for (int i = 0; i < noUnderlyingAmountsGroupCounter; i++)
            {
                indent(builder, level);
                underlyingAmountsGroup.appendTo(builder, level + 1);
                if (i < (noUnderlyingAmountsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                underlyingAmountsGroup = underlyingAmountsGroup.next();
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
    public UnderlyingAmountEncoder copyTo(final Encoder encoder)
    {
        return copyTo((UnderlyingAmountEncoder)encoder);
    }

    public UnderlyingAmountEncoder copyTo(final UnderlyingAmountEncoder encoder)
    {
        encoder.reset();
        if (hasNoUnderlyingAmountsGroupCounter)
        {
            final int size = this.noUnderlyingAmountsGroupCounter;
            UnderlyingAmountsGroupEncoder underlyingAmountsGroup = this.underlyingAmountsGroup;
            UnderlyingAmountsGroupEncoder underlyingAmountsGroupEncoder = encoder.underlyingAmountsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (underlyingAmountsGroup != null)
                {
                    underlyingAmountsGroup.copyTo(underlyingAmountsGroupEncoder);
                    underlyingAmountsGroup = underlyingAmountsGroup.next();
                    underlyingAmountsGroupEncoder = underlyingAmountsGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
