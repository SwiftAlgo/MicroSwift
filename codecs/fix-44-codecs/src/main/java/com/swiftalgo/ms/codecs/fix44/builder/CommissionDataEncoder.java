/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44.builder;

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
import com.swiftalgo.ms.codecs.fix44.*;


public class CommissionDataEncoder
{
    private static final int commissionHeaderLength = 3;
    private static final byte[] commissionHeader = new byte[] {49, 50, (byte) '='};

    private static final int commTypeHeaderLength = 3;
    private static final byte[] commTypeHeader = new byte[] {49, 51, (byte) '='};

    private static final int commCurrencyHeaderLength = 4;
    private static final byte[] commCurrencyHeader = new byte[] {52, 55, 57, (byte) '='};

    private static final int fundRenewWaivHeaderLength = 4;
    private static final byte[] fundRenewWaivHeader = new byte[] {52, 57, 55, (byte) '='};

    private final DecimalFloat commission = new DecimalFloat();

    private boolean hasCommission;

    public boolean hasCommission()
    {
        return hasCommission;
    }

    public CommissionDataEncoder commission(DecimalFloat value)
    {
        commission.set(value);
        hasCommission = true;
        return this;
    }

    public CommissionDataEncoder commission(long value, int scale)
    {
        commission.set(value, scale);
        hasCommission = true;
        return this;
    }

    public DecimalFloat commission()
    {
        return commission;
    }

    private char commType;

    private boolean hasCommType;

    public boolean hasCommType()
    {
        return hasCommType;
    }

    public CommissionDataEncoder commType(char value)
    {
        commType = value;
        hasCommType = true;
        return this;
    }

    public char commType()
    {
        return commType;
    }

    public CommissionDataEncoder commType(CommType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == CommType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: commType Value: " + value );
            }
            if (value == CommType.NULL_VAL)
            {
                return this;
            }
        }
        return commType(value.representation());
    }

    private final MutableDirectBuffer commCurrency = new UnsafeBuffer();

    private int commCurrencyOffset = 0;

    private int commCurrencyLength = 0;

    public CommissionDataEncoder commCurrency(final DirectBuffer value, final int offset, final int length)
    {
        commCurrency.wrap(value);
        commCurrencyOffset = offset;
        commCurrencyLength = length;
        return this;
    }

    public CommissionDataEncoder commCurrency(final DirectBuffer value, final int length)
    {
        return commCurrency(value, 0, length);
    }

    public CommissionDataEncoder commCurrency(final DirectBuffer value)
    {
        return commCurrency(value, 0, value.capacity());
    }

    public CommissionDataEncoder commCurrency(final byte[] value, final int offset, final int length)
    {
        commCurrency.wrap(value);
        commCurrencyOffset = offset;
        commCurrencyLength = length;
        return this;
    }

    public CommissionDataEncoder commCurrencyAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(commCurrency, value, offset, length);
        commCurrencyOffset = offset;
        commCurrencyLength = length;
        return this;
    }

    public CommissionDataEncoder commCurrency(final byte[] value, final int length)
    {
        return commCurrency(value, 0, length);
    }

    public CommissionDataEncoder commCurrency(final byte[] value)
    {
        return commCurrency(value, 0, value.length);
    }

    public boolean hasCommCurrency()
    {
        return commCurrencyLength > 0;
    }

    public MutableDirectBuffer commCurrency()
    {
        return commCurrency;
    }

    public String commCurrencyAsString()
    {
        return commCurrency.getStringWithoutLengthAscii(commCurrencyOffset, commCurrencyLength);
    }

    public CommissionDataEncoder commCurrency(final CharSequence value)
    {
        toBytes(value, commCurrency);
        commCurrencyOffset = 0;
        commCurrencyLength = value.length();
        return this;
    }

    public CommissionDataEncoder commCurrency(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            commCurrency.wrap(buffer);
            commCurrencyOffset = value.offset();
            commCurrencyLength = value.length();
        }
        return this;
    }

    public CommissionDataEncoder commCurrency(final char[] value)
    {
        return commCurrency(value, 0, value.length);
    }

    public CommissionDataEncoder commCurrency(final char[] value, final int length)
    {
        return commCurrency(value, 0, length);
    }

    public CommissionDataEncoder commCurrency(final char[] value, final int offset, final int length)
    {
        toBytes(value, commCurrency, offset, length);
        commCurrencyOffset = 0;
        commCurrencyLength = length;
        return this;
    }

    private char fundRenewWaiv;

    private boolean hasFundRenewWaiv;

    public boolean hasFundRenewWaiv()
    {
        return hasFundRenewWaiv;
    }

    public CommissionDataEncoder fundRenewWaiv(char value)
    {
        fundRenewWaiv = value;
        hasFundRenewWaiv = true;
        return this;
    }

    public char fundRenewWaiv()
    {
        return fundRenewWaiv;
    }

    public CommissionDataEncoder fundRenewWaiv(FundRenewWaiv value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == FundRenewWaiv.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: fundRenewWaiv Value: " + value );
            }
            if (value == FundRenewWaiv.NULL_VAL)
            {
                return this;
            }
        }
        return fundRenewWaiv(value.representation());
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasCommission)
        {
            buffer.putBytes(position, commissionHeader, 0, commissionHeaderLength);
            position += commissionHeaderLength;
            position += buffer.putFloatAscii(position, commission);
            buffer.putSeparator(position);
            position++;
        }

        if (hasCommType)
        {
            buffer.putBytes(position, commTypeHeader, 0, commTypeHeaderLength);
            position += commTypeHeaderLength;
            position += buffer.putCharAscii(position, commType);
            buffer.putSeparator(position);
            position++;
        }

        if (commCurrencyLength > 0)
        {
            buffer.putBytes(position, commCurrencyHeader, 0, commCurrencyHeaderLength);
            position += commCurrencyHeaderLength;
            buffer.putBytes(position, commCurrency, commCurrencyOffset, commCurrencyLength);
            position += commCurrencyLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasFundRenewWaiv)
        {
            buffer.putBytes(position, fundRenewWaivHeader, 0, fundRenewWaivHeaderLength);
            position += fundRenewWaivHeaderLength;
            position += buffer.putCharAscii(position, fundRenewWaiv);
            buffer.putSeparator(position);
            position++;
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetCommission();
        this.resetCommType();
        this.resetCommCurrency();
        this.resetFundRenewWaiv();
    }

    public void resetCommission()
    {
        hasCommission = false;
    }

    public void resetCommType()
    {
        hasCommType = false;
    }

    public void resetCommCurrency()
    {
        commCurrencyLength = 0;
    }

    public void resetFundRenewWaiv()
    {
        hasFundRenewWaiv = false;
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
        builder.append("\"MessageName\": \"CommissionData\",\n");
        if (hasCommission())
        {
            indent(builder, level);
            builder.append("\"Commission\": \"");
            commission.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasCommType())
        {
            indent(builder, level);
            builder.append("\"CommType\": \"");
            builder.append(commType);
            builder.append("\",\n");
        }

        if (hasCommCurrency())
        {
            indent(builder, level);
            builder.append("\"CommCurrency\": \"");
            appendBuffer(builder, commCurrency, commCurrencyOffset, commCurrencyLength);
            builder.append("\",\n");
        }

        if (hasFundRenewWaiv())
        {
            indent(builder, level);
            builder.append("\"FundRenewWaiv\": \"");
            builder.append(fundRenewWaiv);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public CommissionDataEncoder copyTo(final Encoder encoder)
    {
        return copyTo((CommissionDataEncoder)encoder);
    }

    public CommissionDataEncoder copyTo(final CommissionDataEncoder encoder)
    {
        encoder.reset();
        if (hasCommission())
        {
            encoder.commission(this.commission());
        }

        if (hasCommType())
        {
            encoder.commType(this.commType());
        }

        if (hasCommCurrency())
        {
            encoder.commCurrencyAsCopy(commCurrency.byteArray(), 0, commCurrencyLength);
        }

        if (hasFundRenewWaiv())
        {
            encoder.fundRenewWaiv(this.fundRenewWaiv());
        }
        return encoder;
    }

}
