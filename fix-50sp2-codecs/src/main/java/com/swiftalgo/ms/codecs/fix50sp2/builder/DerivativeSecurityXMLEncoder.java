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


public class DerivativeSecurityXMLEncoder
{
    private static final int derivativeSecurityXMLLenHeaderLength = 5;
    private static final byte[] derivativeSecurityXMLLenHeader = new byte[] {49, 50, 56, 50, (byte) '='};

    private static final int derivativeSecurityXMLHeaderLength = 5;
    private static final byte[] derivativeSecurityXMLHeader = new byte[] {49, 50, 56, 51, (byte) '='};

    private static final int derivativeSecurityXMLSchemaHeaderLength = 5;
    private static final byte[] derivativeSecurityXMLSchemaHeader = new byte[] {49, 50, 56, 52, (byte) '='};

    private int derivativeSecurityXMLLen;

    private boolean hasDerivativeSecurityXMLLen;

    public boolean hasDerivativeSecurityXMLLen()
    {
        return hasDerivativeSecurityXMLLen;
    }

    public DerivativeSecurityXMLEncoder derivativeSecurityXMLLen(int value)
    {
        derivativeSecurityXMLLen = value;
        hasDerivativeSecurityXMLLen = true;
        return this;
    }

    public int derivativeSecurityXMLLen()
    {
        return derivativeSecurityXMLLen;
    }

    private byte[] derivativeSecurityXML;

    private boolean hasDerivativeSecurityXML;

    public boolean hasDerivativeSecurityXML()
    {
        return hasDerivativeSecurityXML;
    }

    public DerivativeSecurityXMLEncoder derivativeSecurityXML(byte[] value)
    {
        derivativeSecurityXML = value;
        hasDerivativeSecurityXML = true;
        return this;
    }

    public byte[] derivativeSecurityXML()
    {
        return derivativeSecurityXML;
    }

    public DerivativeSecurityXMLEncoder derivativeSecurityXMLAsCopy(final byte[] value, final int offset, final int length)
    {
        derivativeSecurityXML = copyInto(derivativeSecurityXML, value, offset, length);
        hasDerivativeSecurityXML = true;
        return this;
    }

    private final MutableDirectBuffer derivativeSecurityXMLSchema = new UnsafeBuffer();

    private int derivativeSecurityXMLSchemaOffset = 0;

    private int derivativeSecurityXMLSchemaLength = 0;

    public DerivativeSecurityXMLEncoder derivativeSecurityXMLSchema(final DirectBuffer value, final int offset, final int length)
    {
        derivativeSecurityXMLSchema.wrap(value);
        derivativeSecurityXMLSchemaOffset = offset;
        derivativeSecurityXMLSchemaLength = length;
        return this;
    }

    public DerivativeSecurityXMLEncoder derivativeSecurityXMLSchema(final DirectBuffer value, final int length)
    {
        return derivativeSecurityXMLSchema(value, 0, length);
    }

    public DerivativeSecurityXMLEncoder derivativeSecurityXMLSchema(final DirectBuffer value)
    {
        return derivativeSecurityXMLSchema(value, 0, value.capacity());
    }

    public DerivativeSecurityXMLEncoder derivativeSecurityXMLSchema(final byte[] value, final int offset, final int length)
    {
        derivativeSecurityXMLSchema.wrap(value);
        derivativeSecurityXMLSchemaOffset = offset;
        derivativeSecurityXMLSchemaLength = length;
        return this;
    }

    public DerivativeSecurityXMLEncoder derivativeSecurityXMLSchemaAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(derivativeSecurityXMLSchema, value, offset, length);
        derivativeSecurityXMLSchemaOffset = offset;
        derivativeSecurityXMLSchemaLength = length;
        return this;
    }

    public DerivativeSecurityXMLEncoder derivativeSecurityXMLSchema(final byte[] value, final int length)
    {
        return derivativeSecurityXMLSchema(value, 0, length);
    }

    public DerivativeSecurityXMLEncoder derivativeSecurityXMLSchema(final byte[] value)
    {
        return derivativeSecurityXMLSchema(value, 0, value.length);
    }

    public boolean hasDerivativeSecurityXMLSchema()
    {
        return derivativeSecurityXMLSchemaLength > 0;
    }

    public MutableDirectBuffer derivativeSecurityXMLSchema()
    {
        return derivativeSecurityXMLSchema;
    }

    public String derivativeSecurityXMLSchemaAsString()
    {
        return derivativeSecurityXMLSchema.getStringWithoutLengthAscii(derivativeSecurityXMLSchemaOffset, derivativeSecurityXMLSchemaLength);
    }

    public DerivativeSecurityXMLEncoder derivativeSecurityXMLSchema(final CharSequence value)
    {
        toBytes(value, derivativeSecurityXMLSchema);
        derivativeSecurityXMLSchemaOffset = 0;
        derivativeSecurityXMLSchemaLength = value.length();
        return this;
    }

    public DerivativeSecurityXMLEncoder derivativeSecurityXMLSchema(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            derivativeSecurityXMLSchema.wrap(buffer);
            derivativeSecurityXMLSchemaOffset = value.offset();
            derivativeSecurityXMLSchemaLength = value.length();
        }
        return this;
    }

    public DerivativeSecurityXMLEncoder derivativeSecurityXMLSchema(final char[] value)
    {
        return derivativeSecurityXMLSchema(value, 0, value.length);
    }

    public DerivativeSecurityXMLEncoder derivativeSecurityXMLSchema(final char[] value, final int length)
    {
        return derivativeSecurityXMLSchema(value, 0, length);
    }

    public DerivativeSecurityXMLEncoder derivativeSecurityXMLSchema(final char[] value, final int offset, final int length)
    {
        toBytes(value, derivativeSecurityXMLSchema, offset, length);
        derivativeSecurityXMLSchemaOffset = 0;
        derivativeSecurityXMLSchemaLength = length;
        return this;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasDerivativeSecurityXMLLen)
        {
            buffer.putBytes(position, derivativeSecurityXMLLenHeader, 0, derivativeSecurityXMLLenHeaderLength);
            position += derivativeSecurityXMLLenHeaderLength;
            position += buffer.putIntAscii(position, derivativeSecurityXMLLen);
            buffer.putSeparator(position);
            position++;
        }

        if (hasDerivativeSecurityXML)
        {
            buffer.putBytes(position, derivativeSecurityXMLHeader, 0, derivativeSecurityXMLHeaderLength);
            position += derivativeSecurityXMLHeaderLength;
            buffer.putBytes(position, derivativeSecurityXML);
            position += derivativeSecurityXML.length;
            buffer.putSeparator(position);
            position++;
        }

        if (derivativeSecurityXMLSchemaLength > 0)
        {
            buffer.putBytes(position, derivativeSecurityXMLSchemaHeader, 0, derivativeSecurityXMLSchemaHeaderLength);
            position += derivativeSecurityXMLSchemaHeaderLength;
            buffer.putBytes(position, derivativeSecurityXMLSchema, derivativeSecurityXMLSchemaOffset, derivativeSecurityXMLSchemaLength);
            position += derivativeSecurityXMLSchemaLength;
            buffer.putSeparator(position);
            position++;
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetDerivativeSecurityXMLLen();
        this.resetDerivativeSecurityXML();
        this.resetDerivativeSecurityXMLSchema();
    }

    public void resetDerivativeSecurityXMLLen()
    {
        hasDerivativeSecurityXMLLen = false;
    }

    public void resetDerivativeSecurityXML()
    {
        hasDerivativeSecurityXML = false;
    }

    public void resetDerivativeSecurityXMLSchema()
    {
        derivativeSecurityXMLSchemaLength = 0;
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
        builder.append("\"MessageName\": \"DerivativeSecurityXML\",\n");
        if (hasDerivativeSecurityXMLLen())
        {
            indent(builder, level);
            builder.append("\"DerivativeSecurityXMLLen\": \"");
            builder.append(derivativeSecurityXMLLen);
            builder.append("\",\n");
        }

        if (hasDerivativeSecurityXML())
        {
            indent(builder, level);
            builder.append("\"DerivativeSecurityXML\": \"");
            appendData(builder, derivativeSecurityXML, derivativeSecurityXMLLen);
            builder.append("\",\n");
        }

        if (hasDerivativeSecurityXMLSchema())
        {
            indent(builder, level);
            builder.append("\"DerivativeSecurityXMLSchema\": \"");
            appendBuffer(builder, derivativeSecurityXMLSchema, derivativeSecurityXMLSchemaOffset, derivativeSecurityXMLSchemaLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public DerivativeSecurityXMLEncoder copyTo(final Encoder encoder)
    {
        return copyTo((DerivativeSecurityXMLEncoder)encoder);
    }

    public DerivativeSecurityXMLEncoder copyTo(final DerivativeSecurityXMLEncoder encoder)
    {
        encoder.reset();
        if (hasDerivativeSecurityXMLLen())
        {
            encoder.derivativeSecurityXMLLen(this.derivativeSecurityXMLLen());
        }

        if (hasDerivativeSecurityXML())
        {
            encoder.derivativeSecurityXMLAsCopy(this.derivativeSecurityXML(), 0, derivativeSecurityXMLLen());
            encoder.derivativeSecurityXMLLen(derivativeSecurityXMLLen());
        }

        if (hasDerivativeSecurityXMLSchema())
        {
            encoder.derivativeSecurityXMLSchemaAsCopy(derivativeSecurityXMLSchema.byteArray(), 0, derivativeSecurityXMLSchemaLength);
        }
        return encoder;
    }

}
