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
import com.swiftalgo.ms.codecs.fix50sp2.builder.DerivativeSecurityAltIDGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.DerivativeSecurityAltIDGrpEncoder.DerivativeSecurityAltIDGroupEncoder;

public interface DerivativeSecurityAltIDGrpDecoder 
{



public class DerivativeSecurityAltIDGroupDecoder extends CommonDecoderImpl
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(0);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
        }
    }

    public final IntHashSet ALL_GROUP_FIELDS = new IntHashSet(4);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            ALL_GROUP_FIELDS.add(Constants.DERIVATIVE_SECURITY_ALT_ID);
            ALL_GROUP_FIELDS.add(Constants.DERIVATIVE_SECURITY_ALT_ID_SOURCE);
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
    public DerivativeSecurityAltIDGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private DerivativeSecurityAltIDGroupDecoder next = null;

    public DerivativeSecurityAltIDGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(4);

    private char[] derivativeSecurityAltID = new char[1];

    private boolean hasDerivativeSecurityAltID;

    public char[] derivativeSecurityAltID()
    {
        if (!hasDerivativeSecurityAltID)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeSecurityAltID");
        }

        return derivativeSecurityAltID;
    }

    public boolean hasDerivativeSecurityAltID()
    {
        return hasDerivativeSecurityAltID;
    }


    private int derivativeSecurityAltIDOffset;

    private int derivativeSecurityAltIDLength;

    public int derivativeSecurityAltIDLength()
    {
        if (!hasDerivativeSecurityAltID)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeSecurityAltID");
        }

        return derivativeSecurityAltIDLength;
    }

    public String derivativeSecurityAltIDAsString()
    {
        return hasDerivativeSecurityAltID ? new String(derivativeSecurityAltID, 0, derivativeSecurityAltIDLength) : null;
    }

    public void derivativeSecurityAltID(final AsciiSequenceView view)
    {
        if (!hasDerivativeSecurityAltID)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeSecurityAltID");
        }

        view.wrap(buffer, derivativeSecurityAltIDOffset, derivativeSecurityAltIDLength);
    }


    private final CharArrayWrapper derivativeSecurityAltIDWrapper = new CharArrayWrapper();
    private char[] derivativeSecurityAltIDSource = new char[1];

    private boolean hasDerivativeSecurityAltIDSource;

    public char[] derivativeSecurityAltIDSource()
    {
        if (!hasDerivativeSecurityAltIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeSecurityAltIDSource");
        }

        return derivativeSecurityAltIDSource;
    }

    public boolean hasDerivativeSecurityAltIDSource()
    {
        return hasDerivativeSecurityAltIDSource;
    }


    private int derivativeSecurityAltIDSourceOffset;

    private int derivativeSecurityAltIDSourceLength;

    public int derivativeSecurityAltIDSourceLength()
    {
        if (!hasDerivativeSecurityAltIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeSecurityAltIDSource");
        }

        return derivativeSecurityAltIDSourceLength;
    }

    public String derivativeSecurityAltIDSourceAsString()
    {
        return hasDerivativeSecurityAltIDSource ? new String(derivativeSecurityAltIDSource, 0, derivativeSecurityAltIDSourceLength) : null;
    }

    public void derivativeSecurityAltIDSource(final AsciiSequenceView view)
    {
        if (!hasDerivativeSecurityAltIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: DerivativeSecurityAltIDSource");
        }

        view.wrap(buffer, derivativeSecurityAltIDSourceOffset, derivativeSecurityAltIDSourceLength);
    }


    private final CharArrayWrapper derivativeSecurityAltIDSourceWrapper = new CharArrayWrapper();
    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode DerivativeSecurityAltIDGroup
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
                    next = new DerivativeSecurityAltIDGroupDecoder(trailer, messageFields);
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
            case Constants.DERIVATIVE_SECURITY_ALT_ID:
                hasDerivativeSecurityAltID = true;
                derivativeSecurityAltID = buffer.getChars(derivativeSecurityAltID, valueOffset, valueLength);
                derivativeSecurityAltIDOffset = valueOffset;
                derivativeSecurityAltIDLength = valueLength;
                break;

            case Constants.DERIVATIVE_SECURITY_ALT_ID_SOURCE:
                hasDerivativeSecurityAltIDSource = true;
                derivativeSecurityAltIDSource = buffer.getChars(derivativeSecurityAltIDSource, valueOffset, valueLength);
                derivativeSecurityAltIDSourceOffset = valueOffset;
                derivativeSecurityAltIDSourceLength = valueLength;
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
        this.resetDerivativeSecurityAltID();
        this.resetDerivativeSecurityAltIDSource();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetDerivativeSecurityAltID()
    {
        hasDerivativeSecurityAltID = false;
    }

    public void resetDerivativeSecurityAltIDSource()
    {
        hasDerivativeSecurityAltIDSource = false;
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
        builder.append("\"MessageName\": \"DerivativeSecurityAltIDGroup\",\n");
        if (hasDerivativeSecurityAltID())
        {
            indent(builder, level);
            builder.append("\"DerivativeSecurityAltID\": \"");
            builder.append(this.derivativeSecurityAltID(), 0, derivativeSecurityAltIDLength());
            builder.append("\",\n");
        }

        if (hasDerivativeSecurityAltIDSource())
        {
            indent(builder, level);
            builder.append("\"DerivativeSecurityAltIDSource\": \"");
            builder.append(this.derivativeSecurityAltIDSource(), 0, derivativeSecurityAltIDSourceLength());
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public DerivativeSecurityAltIDGrpEncoder.DerivativeSecurityAltIDGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((DerivativeSecurityAltIDGrpEncoder.DerivativeSecurityAltIDGroupEncoder)encoder);
    }

    public DerivativeSecurityAltIDGrpEncoder.DerivativeSecurityAltIDGroupEncoder toEncoder(final DerivativeSecurityAltIDGrpEncoder.DerivativeSecurityAltIDGroupEncoder encoder)
    {
        encoder.reset();
        if (hasDerivativeSecurityAltID())
        {
            encoder.derivativeSecurityAltID(this.derivativeSecurityAltID(), 0, derivativeSecurityAltIDLength());
        }

        if (hasDerivativeSecurityAltIDSource())
        {
            encoder.derivativeSecurityAltIDSource(this.derivativeSecurityAltIDSource(), 0, derivativeSecurityAltIDSourceLength());
        }
        return encoder;
    }

}
    public class DerivativeSecurityAltIDGroupIterator implements Iterable<DerivativeSecurityAltIDGroupDecoder>, java.util.Iterator<DerivativeSecurityAltIDGroupDecoder>
    {
        private final DerivativeSecurityAltIDGrpDecoder parent;
        private int remainder;
        private DerivativeSecurityAltIDGroupDecoder current;

        public DerivativeSecurityAltIDGroupIterator(final DerivativeSecurityAltIDGrpDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }

        public DerivativeSecurityAltIDGroupDecoder next()
        {
            remainder--;
            final DerivativeSecurityAltIDGroupDecoder value = current;
            current = current.next();
            return value;
        }

        public int numberFieldValue()
        {
            return parent.hasNoDerivativeSecurityAltIDGroupCounter() ? parent.noDerivativeSecurityAltIDGroupCounter() : 0;
        }

        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.derivativeSecurityAltIDGroup();
        }

        public DerivativeSecurityAltIDGroupIterator iterator()
        {
            reset();
            return this;
        }

    }

    public DerivativeSecurityAltIDGroupIterator derivativeSecurityAltIDGroupIterator();
    public int noDerivativeSecurityAltIDGroupCounter();
    public boolean hasNoDerivativeSecurityAltIDGroupCounter();
    public DerivativeSecurityAltIDGroupDecoder derivativeSecurityAltIDGroup();

}
