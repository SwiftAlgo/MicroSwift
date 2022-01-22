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
import com.swiftalgo.ms.codecs.fix50sp2.builder.TrailerEncoder;


public class TrailerDecoder extends CommonDecoderImpl
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(2);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            REQUIRED_FIELDS.add(Constants.CHECK_SUM);
        }
    }

    private final IntHashSet alreadyVisitedFields = new IntHashSet(6);

    private final IntHashSet unknownFields = new IntHashSet(10);

    private final IntHashSet missingRequiredFields = new IntHashSet(2);

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

    private int signatureLength = MISSING_INT;

    private boolean hasSignatureLength;

    public int signatureLength()
    {
        if (!hasSignatureLength)
        {
            throw new IllegalArgumentException("No value for optional field: SignatureLength");
        }

        return signatureLength;
    }

    public boolean hasSignatureLength()
    {
        return hasSignatureLength;
    }



    private byte[] signature = new byte[1];

    private boolean hasSignature;

    public byte[] signature()
    {
        if (!hasSignature)
        {
            throw new IllegalArgumentException("No value for optional field: Signature");
        }

        return signature;
    }

    public boolean hasSignature()
    {
        return hasSignature;
    }



    private char[] checkSum = new char[1];

    public char[] checkSum()
    {
        return checkSum;
    }


    private int checkSumOffset;

    private int checkSumLength;

    public int checkSumLength()
    {
        return checkSumLength;
    }

    public String checkSumAsString()
    {
        return new String(checkSum, 0, checkSumLength);
    }

    public void checkSum(final AsciiSequenceView view)
    {
        view.wrap(buffer, checkSumOffset, checkSumLength);
    }


    private final CharArrayWrapper checkSumWrapper = new CharArrayWrapper();
    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode Trailer
        int seenFieldCount = 0;
        if (CODEC_VALIDATION_ENABLED)
        {
            missingRequiredFields.copy(REQUIRED_FIELDS);
            alreadyVisitedFields.clear();
        }
        this.buffer = buffer;
        final int end = offset + length;
        int position = offset;
        int tag;

        while (position < end)
        {
            final int equalsPosition = buffer.scan(position, end, '=');
            if (equalsPosition == AsciiBuffer.UNKNOWN_INDEX)
            {
               return position;
            }
            tag = buffer.getInt(position, equalsPosition);
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
                if (!alreadyVisitedFields.add(tag))
                {
                    invalidTagId = tag;
                    rejectReason = 13;
                }
                missingRequiredFields.remove(tag);
                seenFieldCount++;
            }

            switch (tag)
            {
            case Constants.SIGNATURE_LENGTH:
                hasSignatureLength = true;
                signatureLength = getInt(buffer, valueOffset, endOfField, 93, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.SIGNATURE:
                hasSignature = true;
                signature = buffer.getBytes(signature, valueOffset, signatureLength);
                endOfField = valueOffset + signatureLength;
                break;

            case Constants.CHECK_SUM:
                checkSum = buffer.getChars(checkSum, valueOffset, valueLength);
                checkSumOffset = valueOffset;
                checkSumLength = valueLength;
                break;

            default:
                if (!CODEC_REJECT_UNKNOWN_FIELD_ENABLED)
                {
                    alreadyVisitedFields.remove(tag);
                }
                else
                {
                    if (!REQUIRED_FIELDS.contains(tag))
                    {
                        unknownFields.add(tag);
                    }
                }
                if (CODEC_REJECT_UNKNOWN_FIELD_ENABLED || REQUIRED_FIELDS.contains(tag))
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
        this.resetSignatureLength();
        this.resetSignature();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
            unknownFields.clear();
            alreadyVisitedFields.clear();
        }
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

        indent(builder, level);
        builder.append("\"CheckSum\": \"");
        builder.append(this.checkSum(), 0, checkSumLength());
        builder.append("\",\n");
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public TrailerEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((TrailerEncoder)encoder);
    }

    public TrailerEncoder toEncoder(final TrailerEncoder encoder)
    {
        encoder.reset();
        if (hasSignatureLength())
        {
            encoder.signatureLength(this.signatureLength());
        }

        if (hasSignature())
        {
            encoder.signatureAsCopy(this.signature(), 0, signatureLength());
            encoder.signatureLength(this.signatureLength());
        }

        encoder.checkSum(this.checkSum(), 0, checkSumLength());        return encoder;
    }

}
