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


public class SecTypesGrpEncoder
{
    private static final int noSecurityTypesGroupCounterHeaderLength = 4;
    private static final byte[] noSecurityTypesGroupCounterHeader = new byte[] {53, 53, 56, (byte) '='};



public static class SecurityTypesGroupEncoder
{
    private SecurityTypesGroupEncoder next = null;

    public SecurityTypesGroupEncoder next()
    {
        if (next == null)
        {
            next = new SecurityTypesGroupEncoder();
        }
        return next;
    }

    private static final int securityTypeHeaderLength = 4;
    private static final byte[] securityTypeHeader = new byte[] {49, 54, 55, (byte) '='};

    private static final int securitySubTypeHeaderLength = 4;
    private static final byte[] securitySubTypeHeader = new byte[] {55, 54, 50, (byte) '='};

    private static final int productHeaderLength = 4;
    private static final byte[] productHeader = new byte[] {52, 54, 48, (byte) '='};

    private static final int cFICodeHeaderLength = 4;
    private static final byte[] cFICodeHeader = new byte[] {52, 54, 49, (byte) '='};

    private static final int transactTimeHeaderLength = 3;
    private static final byte[] transactTimeHeader = new byte[] {54, 48, (byte) '='};

    private final MutableDirectBuffer securityType = new UnsafeBuffer();

    private int securityTypeOffset = 0;

    private int securityTypeLength = 0;

    public SecurityTypesGroupEncoder securityType(final DirectBuffer value, final int offset, final int length)
    {
        securityType.wrap(value);
        securityTypeOffset = offset;
        securityTypeLength = length;
        return this;
    }

    public SecurityTypesGroupEncoder securityType(final DirectBuffer value, final int length)
    {
        return securityType(value, 0, length);
    }

    public SecurityTypesGroupEncoder securityType(final DirectBuffer value)
    {
        return securityType(value, 0, value.capacity());
    }

    public SecurityTypesGroupEncoder securityType(final byte[] value, final int offset, final int length)
    {
        securityType.wrap(value);
        securityTypeOffset = offset;
        securityTypeLength = length;
        return this;
    }

    public SecurityTypesGroupEncoder securityTypeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(securityType, value, offset, length);
        securityTypeOffset = offset;
        securityTypeLength = length;
        return this;
    }

    public SecurityTypesGroupEncoder securityType(final byte[] value, final int length)
    {
        return securityType(value, 0, length);
    }

    public SecurityTypesGroupEncoder securityType(final byte[] value)
    {
        return securityType(value, 0, value.length);
    }

    public boolean hasSecurityType()
    {
        return securityTypeLength > 0;
    }

    public MutableDirectBuffer securityType()
    {
        return securityType;
    }

    public String securityTypeAsString()
    {
        return securityType.getStringWithoutLengthAscii(securityTypeOffset, securityTypeLength);
    }

    public SecurityTypesGroupEncoder securityType(final CharSequence value)
    {
        toBytes(value, securityType);
        securityTypeOffset = 0;
        securityTypeLength = value.length();
        return this;
    }

    public SecurityTypesGroupEncoder securityType(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            securityType.wrap(buffer);
            securityTypeOffset = value.offset();
            securityTypeLength = value.length();
        }
        return this;
    }

    public SecurityTypesGroupEncoder securityType(final char[] value)
    {
        return securityType(value, 0, value.length);
    }

    public SecurityTypesGroupEncoder securityType(final char[] value, final int length)
    {
        return securityType(value, 0, length);
    }

    public SecurityTypesGroupEncoder securityType(final char[] value, final int offset, final int length)
    {
        toBytes(value, securityType, offset, length);
        securityTypeOffset = 0;
        securityTypeLength = length;
        return this;
    }

    public SecurityTypesGroupEncoder securityType(SecurityType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == SecurityType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: securityType Value: " + value );
            }
            if (value == SecurityType.NULL_VAL)
            {
                return this;
            }
        }
        return securityType(value.representation());
    }

    private final MutableDirectBuffer securitySubType = new UnsafeBuffer();

    private int securitySubTypeOffset = 0;

    private int securitySubTypeLength = 0;

    public SecurityTypesGroupEncoder securitySubType(final DirectBuffer value, final int offset, final int length)
    {
        securitySubType.wrap(value);
        securitySubTypeOffset = offset;
        securitySubTypeLength = length;
        return this;
    }

    public SecurityTypesGroupEncoder securitySubType(final DirectBuffer value, final int length)
    {
        return securitySubType(value, 0, length);
    }

    public SecurityTypesGroupEncoder securitySubType(final DirectBuffer value)
    {
        return securitySubType(value, 0, value.capacity());
    }

    public SecurityTypesGroupEncoder securitySubType(final byte[] value, final int offset, final int length)
    {
        securitySubType.wrap(value);
        securitySubTypeOffset = offset;
        securitySubTypeLength = length;
        return this;
    }

    public SecurityTypesGroupEncoder securitySubTypeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(securitySubType, value, offset, length);
        securitySubTypeOffset = offset;
        securitySubTypeLength = length;
        return this;
    }

    public SecurityTypesGroupEncoder securitySubType(final byte[] value, final int length)
    {
        return securitySubType(value, 0, length);
    }

    public SecurityTypesGroupEncoder securitySubType(final byte[] value)
    {
        return securitySubType(value, 0, value.length);
    }

    public boolean hasSecuritySubType()
    {
        return securitySubTypeLength > 0;
    }

    public MutableDirectBuffer securitySubType()
    {
        return securitySubType;
    }

    public String securitySubTypeAsString()
    {
        return securitySubType.getStringWithoutLengthAscii(securitySubTypeOffset, securitySubTypeLength);
    }

    public SecurityTypesGroupEncoder securitySubType(final CharSequence value)
    {
        toBytes(value, securitySubType);
        securitySubTypeOffset = 0;
        securitySubTypeLength = value.length();
        return this;
    }

    public SecurityTypesGroupEncoder securitySubType(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            securitySubType.wrap(buffer);
            securitySubTypeOffset = value.offset();
            securitySubTypeLength = value.length();
        }
        return this;
    }

    public SecurityTypesGroupEncoder securitySubType(final char[] value)
    {
        return securitySubType(value, 0, value.length);
    }

    public SecurityTypesGroupEncoder securitySubType(final char[] value, final int length)
    {
        return securitySubType(value, 0, length);
    }

    public SecurityTypesGroupEncoder securitySubType(final char[] value, final int offset, final int length)
    {
        toBytes(value, securitySubType, offset, length);
        securitySubTypeOffset = 0;
        securitySubTypeLength = length;
        return this;
    }

    private int product;

    private boolean hasProduct;

    public boolean hasProduct()
    {
        return hasProduct;
    }

    public SecurityTypesGroupEncoder product(int value)
    {
        product = value;
        hasProduct = true;
        return this;
    }

    public int product()
    {
        return product;
    }

    public SecurityTypesGroupEncoder product(Product value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == Product.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: product Value: " + value );
            }
            if (value == Product.NULL_VAL)
            {
                return this;
            }
        }
        return product(value.representation());
    }

    private final MutableDirectBuffer cFICode = new UnsafeBuffer();

    private int cFICodeOffset = 0;

    private int cFICodeLength = 0;

    public SecurityTypesGroupEncoder cFICode(final DirectBuffer value, final int offset, final int length)
    {
        cFICode.wrap(value);
        cFICodeOffset = offset;
        cFICodeLength = length;
        return this;
    }

    public SecurityTypesGroupEncoder cFICode(final DirectBuffer value, final int length)
    {
        return cFICode(value, 0, length);
    }

    public SecurityTypesGroupEncoder cFICode(final DirectBuffer value)
    {
        return cFICode(value, 0, value.capacity());
    }

    public SecurityTypesGroupEncoder cFICode(final byte[] value, final int offset, final int length)
    {
        cFICode.wrap(value);
        cFICodeOffset = offset;
        cFICodeLength = length;
        return this;
    }

    public SecurityTypesGroupEncoder cFICodeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(cFICode, value, offset, length);
        cFICodeOffset = offset;
        cFICodeLength = length;
        return this;
    }

    public SecurityTypesGroupEncoder cFICode(final byte[] value, final int length)
    {
        return cFICode(value, 0, length);
    }

    public SecurityTypesGroupEncoder cFICode(final byte[] value)
    {
        return cFICode(value, 0, value.length);
    }

    public boolean hasCFICode()
    {
        return cFICodeLength > 0;
    }

    public MutableDirectBuffer cFICode()
    {
        return cFICode;
    }

    public String cFICodeAsString()
    {
        return cFICode.getStringWithoutLengthAscii(cFICodeOffset, cFICodeLength);
    }

    public SecurityTypesGroupEncoder cFICode(final CharSequence value)
    {
        toBytes(value, cFICode);
        cFICodeOffset = 0;
        cFICodeLength = value.length();
        return this;
    }

    public SecurityTypesGroupEncoder cFICode(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            cFICode.wrap(buffer);
            cFICodeOffset = value.offset();
            cFICodeLength = value.length();
        }
        return this;
    }

    public SecurityTypesGroupEncoder cFICode(final char[] value)
    {
        return cFICode(value, 0, value.length);
    }

    public SecurityTypesGroupEncoder cFICode(final char[] value, final int length)
    {
        return cFICode(value, 0, length);
    }

    public SecurityTypesGroupEncoder cFICode(final char[] value, final int offset, final int length)
    {
        toBytes(value, cFICode, offset, length);
        cFICodeOffset = 0;
        cFICodeLength = length;
        return this;
    }

    private final MutableDirectBuffer transactTime = new UnsafeBuffer();

    private int transactTimeOffset = 0;

    private int transactTimeLength = 0;

    public SecurityTypesGroupEncoder transactTime(final DirectBuffer value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public SecurityTypesGroupEncoder transactTime(final DirectBuffer value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public SecurityTypesGroupEncoder transactTime(final DirectBuffer value)
    {
        return transactTime(value, 0, value.capacity());
    }

    public SecurityTypesGroupEncoder transactTime(final byte[] value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public SecurityTypesGroupEncoder transactTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(transactTime, value, offset, length);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public SecurityTypesGroupEncoder transactTime(final byte[] value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public SecurityTypesGroupEncoder transactTime(final byte[] value)
    {
        return transactTime(value, 0, value.length);
    }

    public boolean hasTransactTime()
    {
        return transactTimeLength > 0;
    }

    public MutableDirectBuffer transactTime()
    {
        return transactTime;
    }

    public String transactTimeAsString()
    {
        return transactTime.getStringWithoutLengthAscii(transactTimeOffset, transactTimeLength);
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (securityTypeLength > 0)
        {
            buffer.putBytes(position, securityTypeHeader, 0, securityTypeHeaderLength);
            position += securityTypeHeaderLength;
            buffer.putBytes(position, securityType, securityTypeOffset, securityTypeLength);
            position += securityTypeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (securitySubTypeLength > 0)
        {
            buffer.putBytes(position, securitySubTypeHeader, 0, securitySubTypeHeaderLength);
            position += securitySubTypeHeaderLength;
            buffer.putBytes(position, securitySubType, securitySubTypeOffset, securitySubTypeLength);
            position += securitySubTypeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasProduct)
        {
            buffer.putBytes(position, productHeader, 0, productHeaderLength);
            position += productHeaderLength;
            position += buffer.putIntAscii(position, product);
            buffer.putSeparator(position);
            position++;
        }

        if (cFICodeLength > 0)
        {
            buffer.putBytes(position, cFICodeHeader, 0, cFICodeHeaderLength);
            position += cFICodeHeaderLength;
            buffer.putBytes(position, cFICode, cFICodeOffset, cFICodeLength);
            position += cFICodeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (transactTimeLength > 0)
        {
            buffer.putBytes(position, transactTimeHeader, 0, transactTimeHeaderLength);
            position += transactTimeHeaderLength;
            buffer.putBytes(position, transactTime, transactTimeOffset, transactTimeLength);
            position += transactTimeLength;
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
        this.resetSecurityType();
        this.resetSecuritySubType();
        this.resetProduct();
        this.resetCFICode();
        this.resetTransactTime();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetSecurityType()
    {
        securityTypeLength = 0;
    }

    public void resetSecuritySubType()
    {
        securitySubTypeLength = 0;
    }

    public void resetProduct()
    {
        hasProduct = false;
    }

    public void resetCFICode()
    {
        cFICodeLength = 0;
    }

    public void resetTransactTime()
    {
        transactTimeLength = 0;
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
        builder.append("\"MessageName\": \"SecurityTypesGroup\",\n");
        if (hasSecurityType())
        {
            indent(builder, level);
            builder.append("\"SecurityType\": \"");
            appendBuffer(builder, securityType, securityTypeOffset, securityTypeLength);
            builder.append("\",\n");
        }

        if (hasSecuritySubType())
        {
            indent(builder, level);
            builder.append("\"SecuritySubType\": \"");
            appendBuffer(builder, securitySubType, securitySubTypeOffset, securitySubTypeLength);
            builder.append("\",\n");
        }

        if (hasProduct())
        {
            indent(builder, level);
            builder.append("\"Product\": \"");
            builder.append(product);
            builder.append("\",\n");
        }

        if (hasCFICode())
        {
            indent(builder, level);
            builder.append("\"CFICode\": \"");
            appendBuffer(builder, cFICode, cFICodeOffset, cFICodeLength);
            builder.append("\",\n");
        }

        if (hasTransactTime())
        {
            indent(builder, level);
            builder.append("\"TransactTime\": \"");
            appendBuffer(builder, transactTime, transactTimeOffset, transactTimeLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public SecurityTypesGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((SecurityTypesGroupEncoder)encoder);
    }

    public SecurityTypesGroupEncoder copyTo(final SecurityTypesGroupEncoder encoder)
    {
        encoder.reset();
        if (hasSecurityType())
        {
            encoder.securityTypeAsCopy(securityType.byteArray(), 0, securityTypeLength);
        }

        if (hasSecuritySubType())
        {
            encoder.securitySubTypeAsCopy(securitySubType.byteArray(), 0, securitySubTypeLength);
        }

        if (hasProduct())
        {
            encoder.product(this.product());
        }

        if (hasCFICode())
        {
            encoder.cFICodeAsCopy(cFICode.byteArray(), 0, cFICodeLength);
        }

        if (hasTransactTime())
        {
            encoder.transactTimeAsCopy(transactTime.byteArray(), 0, transactTimeLength);
        }
        return encoder;
    }

}
    private int noSecurityTypesGroupCounter;

    private boolean hasNoSecurityTypesGroupCounter;

    public boolean hasNoSecurityTypesGroupCounter()
    {
        return hasNoSecurityTypesGroupCounter;
    }

    public SecTypesGrpEncoder noSecurityTypesGroupCounter(int value)
    {
        noSecurityTypesGroupCounter = value;
        hasNoSecurityTypesGroupCounter = true;
        return this;
    }

    public int noSecurityTypesGroupCounter()
    {
        return noSecurityTypesGroupCounter;
    }


    private SecurityTypesGroupEncoder securityTypesGroup = null;

    public SecurityTypesGroupEncoder securityTypesGroup(final int numberOfElements)
    {
        hasNoSecurityTypesGroupCounter = true;
        noSecurityTypesGroupCounter = numberOfElements;
        if (securityTypesGroup == null)
        {
            securityTypesGroup = new SecurityTypesGroupEncoder();
        }
        return securityTypesGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoSecurityTypesGroupCounter)
        {
            buffer.putBytes(position, noSecurityTypesGroupCounterHeader, 0, noSecurityTypesGroupCounterHeaderLength);
            position += noSecurityTypesGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noSecurityTypesGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (securityTypesGroup != null)
        {
            position += securityTypesGroup.encode(buffer, position, noSecurityTypesGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetSecurityTypesGroup();
    }

    public void resetSecurityTypesGroup()
    {
        if (securityTypesGroup != null)
        {
            securityTypesGroup.reset();
        }
        noSecurityTypesGroupCounter = 0;
        hasNoSecurityTypesGroupCounter = false;
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
        builder.append("\"MessageName\": \"SecTypesGrp\",\n");
        if (hasNoSecurityTypesGroupCounter)
        {
            indent(builder, level);
            builder.append("\"SecurityTypesGroup\": [\n");
            final int noSecurityTypesGroupCounter = this.noSecurityTypesGroupCounter;
            SecurityTypesGroupEncoder securityTypesGroup = this.securityTypesGroup;
            for (int i = 0; i < noSecurityTypesGroupCounter; i++)
            {
                indent(builder, level);
                securityTypesGroup.appendTo(builder, level + 1);
                if (i < (noSecurityTypesGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                securityTypesGroup = securityTypesGroup.next();
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
    public SecTypesGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((SecTypesGrpEncoder)encoder);
    }

    public SecTypesGrpEncoder copyTo(final SecTypesGrpEncoder encoder)
    {
        encoder.reset();
        if (hasNoSecurityTypesGroupCounter)
        {
            final int size = this.noSecurityTypesGroupCounter;
            SecurityTypesGroupEncoder securityTypesGroup = this.securityTypesGroup;
            SecurityTypesGroupEncoder securityTypesGroupEncoder = encoder.securityTypesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (securityTypesGroup != null)
                {
                    securityTypesGroup.copyTo(securityTypesGroupEncoder);
                    securityTypesGroup = securityTypesGroup.next();
                    securityTypesGroupEncoder = securityTypesGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
