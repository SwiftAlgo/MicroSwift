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


public class SecurityXMLEncoder
{
    private static final int securityXMLLenHeaderLength = 5;
    private static final byte[] securityXMLLenHeader = new byte[] {49, 49, 56, 52, (byte) '='};

    private static final int securityXMLHeaderLength = 5;
    private static final byte[] securityXMLHeader = new byte[] {49, 49, 56, 53, (byte) '='};

    private static final int securityXMLSchemaHeaderLength = 5;
    private static final byte[] securityXMLSchemaHeader = new byte[] {49, 49, 56, 54, (byte) '='};

    private int securityXMLLen;

    private boolean hasSecurityXMLLen;

    public boolean hasSecurityXMLLen()
    {
        return hasSecurityXMLLen;
    }

    public SecurityXMLEncoder securityXMLLen(int value)
    {
        securityXMLLen = value;
        hasSecurityXMLLen = true;
        return this;
    }

    public int securityXMLLen()
    {
        return securityXMLLen;
    }

    private byte[] securityXML;

    private boolean hasSecurityXML;

    public boolean hasSecurityXML()
    {
        return hasSecurityXML;
    }

    public SecurityXMLEncoder securityXML(byte[] value)
    {
        securityXML = value;
        hasSecurityXML = true;
        return this;
    }

    public byte[] securityXML()
    {
        return securityXML;
    }

    public SecurityXMLEncoder securityXMLAsCopy(final byte[] value, final int offset, final int length)
    {
        securityXML = copyInto(securityXML, value, offset, length);
        hasSecurityXML = true;
        return this;
    }

    private final MutableDirectBuffer securityXMLSchema = new UnsafeBuffer();

    private int securityXMLSchemaOffset = 0;

    private int securityXMLSchemaLength = 0;

    public SecurityXMLEncoder securityXMLSchema(final DirectBuffer value, final int offset, final int length)
    {
        securityXMLSchema.wrap(value);
        securityXMLSchemaOffset = offset;
        securityXMLSchemaLength = length;
        return this;
    }

    public SecurityXMLEncoder securityXMLSchema(final DirectBuffer value, final int length)
    {
        return securityXMLSchema(value, 0, length);
    }

    public SecurityXMLEncoder securityXMLSchema(final DirectBuffer value)
    {
        return securityXMLSchema(value, 0, value.capacity());
    }

    public SecurityXMLEncoder securityXMLSchema(final byte[] value, final int offset, final int length)
    {
        securityXMLSchema.wrap(value);
        securityXMLSchemaOffset = offset;
        securityXMLSchemaLength = length;
        return this;
    }

    public SecurityXMLEncoder securityXMLSchemaAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(securityXMLSchema, value, offset, length);
        securityXMLSchemaOffset = offset;
        securityXMLSchemaLength = length;
        return this;
    }

    public SecurityXMLEncoder securityXMLSchema(final byte[] value, final int length)
    {
        return securityXMLSchema(value, 0, length);
    }

    public SecurityXMLEncoder securityXMLSchema(final byte[] value)
    {
        return securityXMLSchema(value, 0, value.length);
    }

    public boolean hasSecurityXMLSchema()
    {
        return securityXMLSchemaLength > 0;
    }

    public MutableDirectBuffer securityXMLSchema()
    {
        return securityXMLSchema;
    }

    public String securityXMLSchemaAsString()
    {
        return securityXMLSchema.getStringWithoutLengthAscii(securityXMLSchemaOffset, securityXMLSchemaLength);
    }

    public SecurityXMLEncoder securityXMLSchema(final CharSequence value)
    {
        toBytes(value, securityXMLSchema);
        securityXMLSchemaOffset = 0;
        securityXMLSchemaLength = value.length();
        return this;
    }

    public SecurityXMLEncoder securityXMLSchema(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            securityXMLSchema.wrap(buffer);
            securityXMLSchemaOffset = value.offset();
            securityXMLSchemaLength = value.length();
        }
        return this;
    }

    public SecurityXMLEncoder securityXMLSchema(final char[] value)
    {
        return securityXMLSchema(value, 0, value.length);
    }

    public SecurityXMLEncoder securityXMLSchema(final char[] value, final int length)
    {
        return securityXMLSchema(value, 0, length);
    }

    public SecurityXMLEncoder securityXMLSchema(final char[] value, final int offset, final int length)
    {
        toBytes(value, securityXMLSchema, offset, length);
        securityXMLSchemaOffset = 0;
        securityXMLSchemaLength = length;
        return this;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasSecurityXMLLen)
        {
            buffer.putBytes(position, securityXMLLenHeader, 0, securityXMLLenHeaderLength);
            position += securityXMLLenHeaderLength;
            position += buffer.putIntAscii(position, securityXMLLen);
            buffer.putSeparator(position);
            position++;
        }

        if (hasSecurityXML)
        {
            buffer.putBytes(position, securityXMLHeader, 0, securityXMLHeaderLength);
            position += securityXMLHeaderLength;
            buffer.putBytes(position, securityXML);
            position += securityXML.length;
            buffer.putSeparator(position);
            position++;
        }

        if (securityXMLSchemaLength > 0)
        {
            buffer.putBytes(position, securityXMLSchemaHeader, 0, securityXMLSchemaHeaderLength);
            position += securityXMLSchemaHeaderLength;
            buffer.putBytes(position, securityXMLSchema, securityXMLSchemaOffset, securityXMLSchemaLength);
            position += securityXMLSchemaLength;
            buffer.putSeparator(position);
            position++;
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetSecurityXMLLen();
        this.resetSecurityXML();
        this.resetSecurityXMLSchema();
    }

    public void resetSecurityXMLLen()
    {
        hasSecurityXMLLen = false;
    }

    public void resetSecurityXML()
    {
        hasSecurityXML = false;
    }

    public void resetSecurityXMLSchema()
    {
        securityXMLSchemaLength = 0;
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
        builder.append("\"MessageName\": \"SecurityXML\",\n");
        if (hasSecurityXMLLen())
        {
            indent(builder, level);
            builder.append("\"SecurityXMLLen\": \"");
            builder.append(securityXMLLen);
            builder.append("\",\n");
        }

        if (hasSecurityXML())
        {
            indent(builder, level);
            builder.append("\"SecurityXML\": \"");
            appendData(builder, securityXML, securityXMLLen);
            builder.append("\",\n");
        }

        if (hasSecurityXMLSchema())
        {
            indent(builder, level);
            builder.append("\"SecurityXMLSchema\": \"");
            appendBuffer(builder, securityXMLSchema, securityXMLSchemaOffset, securityXMLSchemaLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public SecurityXMLEncoder copyTo(final Encoder encoder)
    {
        return copyTo((SecurityXMLEncoder)encoder);
    }

    public SecurityXMLEncoder copyTo(final SecurityXMLEncoder encoder)
    {
        encoder.reset();
        if (hasSecurityXMLLen())
        {
            encoder.securityXMLLen(this.securityXMLLen());
        }

        if (hasSecurityXML())
        {
            encoder.securityXMLAsCopy(this.securityXML(), 0, securityXMLLen());
            encoder.securityXMLLen(securityXMLLen());
        }

        if (hasSecurityXMLSchema())
        {
            encoder.securityXMLSchemaAsCopy(securityXMLSchema.byteArray(), 0, securityXMLSchemaLength);
        }
        return encoder;
    }

}
