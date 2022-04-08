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


public class TrailerEncoder
{
    private static final int signatureLengthHeaderLength = 3;
    private static final byte[] signatureLengthHeader = new byte[] {57, 51, (byte) '='};

    private static final int signatureHeaderLength = 3;
    private static final byte[] signatureHeader = new byte[] {56, 57, (byte) '='};

    private static final int checkSumHeaderLength = 3;
    private static final byte[] checkSumHeader = new byte[] {49, 48, (byte) '='};

    private int signatureLength;

    private boolean hasSignatureLength;

    public boolean hasSignatureLength()
    {
        return hasSignatureLength;
    }

    public TrailerEncoder signatureLength(int value)
    {
        signatureLength = value;
        hasSignatureLength = true;
        return this;
    }

    public int signatureLength()
    {
        return signatureLength;
    }

    private byte[] signature;

    private boolean hasSignature;

    public boolean hasSignature()
    {
        return hasSignature;
    }

    public TrailerEncoder signature(byte[] value)
    {
        signature = value;
        hasSignature = true;
        return this;
    }

    public byte[] signature()
    {
        return signature;
    }

    public TrailerEncoder signatureAsCopy(final byte[] value, final int offset, final int length)
    {
        signature = copyInto(signature, value, offset, length);
        hasSignature = true;
        return this;
    }

    private final MutableDirectBuffer checkSum = new UnsafeBuffer();

    private int checkSumOffset = 0;

    private int checkSumLength = 0;

    public TrailerEncoder checkSum(final DirectBuffer value, final int offset, final int length)
    {
        checkSum.wrap(value);
        checkSumOffset = offset;
        checkSumLength = length;
        return this;
    }

    public TrailerEncoder checkSum(final DirectBuffer value, final int length)
    {
        return checkSum(value, 0, length);
    }

    public TrailerEncoder checkSum(final DirectBuffer value)
    {
        return checkSum(value, 0, value.capacity());
    }

    public TrailerEncoder checkSum(final byte[] value, final int offset, final int length)
    {
        checkSum.wrap(value);
        checkSumOffset = offset;
        checkSumLength = length;
        return this;
    }

    public TrailerEncoder checkSumAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(checkSum, value, offset, length);
        checkSumOffset = offset;
        checkSumLength = length;
        return this;
    }

    public TrailerEncoder checkSum(final byte[] value, final int length)
    {
        return checkSum(value, 0, length);
    }

    public TrailerEncoder checkSum(final byte[] value)
    {
        return checkSum(value, 0, value.length);
    }

    public boolean hasCheckSum()
    {
        return checkSumLength > 0;
    }

    public MutableDirectBuffer checkSum()
    {
        return checkSum;
    }

    public String checkSumAsString()
    {
        return checkSum.getStringWithoutLengthAscii(checkSumOffset, checkSumLength);
    }

    public TrailerEncoder checkSum(final CharSequence value)
    {
        toBytes(value, checkSum);
        checkSumOffset = 0;
        checkSumLength = value.length();
        return this;
    }

    public TrailerEncoder checkSum(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            checkSum.wrap(buffer);
            checkSumOffset = value.offset();
            checkSumLength = value.length();
        }
        return this;
    }

    public TrailerEncoder checkSum(final char[] value)
    {
        return checkSum(value, 0, value.length);
    }

    public TrailerEncoder checkSum(final char[] value, final int length)
    {
        return checkSum(value, 0, length);
    }

    public TrailerEncoder checkSum(final char[] value, final int offset, final int length)
    {
        toBytes(value, checkSum, offset, length);
        checkSumOffset = 0;
        checkSumLength = length;
        return this;
    }

    long finishMessage(final MutableAsciiBuffer buffer, final int messageStart, final int offset)
    {
        int position = offset;

        final int checkSum = buffer.computeChecksum(messageStart, position);
        buffer.putBytes(position, checkSumHeader, 0, checkSumHeaderLength);
        position += checkSumHeaderLength;
        buffer.putNaturalPaddedIntAscii(position, 3, checkSum);
        position += 3;
        buffer.putSeparator(position);
        position++;

        return Encoder.result(position - messageStart, messageStart);
    }
    int startTrailer(final MutableAsciiBuffer buffer, final int offset)
    {
        final int start = offset;
        int position = start;

        if (hasSignatureLength)
        {
            buffer.putBytes(position, signatureLengthHeader, 0, signatureLengthHeaderLength);
            position += signatureLengthHeaderLength;
            position += buffer.putIntAscii(position, signatureLength);
            buffer.putSeparator(position);
            position++;
        }

        if (hasSignature)
        {
            buffer.putBytes(position, signatureHeader, 0, signatureHeaderLength);
            position += signatureHeaderLength;
            buffer.putBytes(position, signature);
            position += signature.length;
            buffer.putSeparator(position);
            position++;
        }

        return position - start;
    }

    public void reset()
    {
        this.resetSignatureLength();
        this.resetSignature();
    }

    public void resetSignatureLength()
    {
        hasSignatureLength = false;
    }

    public void resetSignature()
    {
        hasSignature = false;
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
        builder.append("\"MessageName\": \"Trailer\",\n");
        if (hasSignatureLength())
        {
            indent(builder, level);
            builder.append("\"SignatureLength\": \"");
            builder.append(signatureLength);
            builder.append("\",\n");
        }

        if (hasSignature())
        {
            indent(builder, level);
            builder.append("\"Signature\": \"");
            appendData(builder, signature, signatureLength);
            builder.append("\",\n");
        }

        if (hasCheckSum())
        {
            indent(builder, level);
            builder.append("\"CheckSum\": \"");
            appendBuffer(builder, checkSum, checkSumOffset, checkSumLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public TrailerEncoder copyTo(final Encoder encoder)
    {
        return copyTo((TrailerEncoder)encoder);
    }

    public TrailerEncoder copyTo(final TrailerEncoder encoder)
    {
        encoder.reset();
        if (hasSignatureLength())
        {
            encoder.signatureLength(this.signatureLength());
        }

        if (hasSignature())
        {
            encoder.signatureAsCopy(this.signature(), 0, signatureLength());
            encoder.signatureLength(signatureLength());
        }

        if (hasCheckSum())
        {
            encoder.checkSumAsCopy(checkSum.byteArray(), 0, checkSumLength);
        }
        return encoder;
    }

}
