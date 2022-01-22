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
import com.swiftalgo.ms.codecs.fix50sp2.builder.SecAltIDGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.SecAltIDGrpEncoder.SecurityAltIDGroupEncoder;

public interface SecAltIDGrpDecoder 
{



public class SecurityAltIDGroupDecoder extends CommonDecoderImpl
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
            ALL_GROUP_FIELDS.add(Constants.SECURITY_ALT_ID);
            ALL_GROUP_FIELDS.add(Constants.SECURITY_ALT_ID_SOURCE);
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
    public SecurityAltIDGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private SecurityAltIDGroupDecoder next = null;

    public SecurityAltIDGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(4);

    private char[] securityAltID = new char[1];

    private boolean hasSecurityAltID;

    public char[] securityAltID()
    {
        if (!hasSecurityAltID)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityAltID");
        }

        return securityAltID;
    }

    public boolean hasSecurityAltID()
    {
        return hasSecurityAltID;
    }


    private int securityAltIDOffset;

    private int securityAltIDLength;

    public int securityAltIDLength()
    {
        if (!hasSecurityAltID)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityAltID");
        }

        return securityAltIDLength;
    }

    public String securityAltIDAsString()
    {
        return hasSecurityAltID ? new String(securityAltID, 0, securityAltIDLength) : null;
    }

    public void securityAltID(final AsciiSequenceView view)
    {
        if (!hasSecurityAltID)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityAltID");
        }

        view.wrap(buffer, securityAltIDOffset, securityAltIDLength);
    }


    private final CharArrayWrapper securityAltIDWrapper = new CharArrayWrapper();
    private char[] securityAltIDSource = new char[1];

    private boolean hasSecurityAltIDSource;

    public char[] securityAltIDSource()
    {
        if (!hasSecurityAltIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityAltIDSource");
        }

        return securityAltIDSource;
    }

    public boolean hasSecurityAltIDSource()
    {
        return hasSecurityAltIDSource;
    }


    private int securityAltIDSourceOffset;

    private int securityAltIDSourceLength;

    public int securityAltIDSourceLength()
    {
        if (!hasSecurityAltIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityAltIDSource");
        }

        return securityAltIDSourceLength;
    }

    public String securityAltIDSourceAsString()
    {
        return hasSecurityAltIDSource ? new String(securityAltIDSource, 0, securityAltIDSourceLength) : null;
    }

    public void securityAltIDSource(final AsciiSequenceView view)
    {
        if (!hasSecurityAltIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityAltIDSource");
        }

        view.wrap(buffer, securityAltIDSourceOffset, securityAltIDSourceLength);
    }


    private final CharArrayWrapper securityAltIDSourceWrapper = new CharArrayWrapper();
    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode SecurityAltIDGroup
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
                    next = new SecurityAltIDGroupDecoder(trailer, messageFields);
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
            case Constants.SECURITY_ALT_ID:
                hasSecurityAltID = true;
                securityAltID = buffer.getChars(securityAltID, valueOffset, valueLength);
                securityAltIDOffset = valueOffset;
                securityAltIDLength = valueLength;
                break;

            case Constants.SECURITY_ALT_ID_SOURCE:
                hasSecurityAltIDSource = true;
                securityAltIDSource = buffer.getChars(securityAltIDSource, valueOffset, valueLength);
                securityAltIDSourceOffset = valueOffset;
                securityAltIDSourceLength = valueLength;
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
        this.resetSecurityAltID();
        this.resetSecurityAltIDSource();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetSecurityAltID()
    {
        hasSecurityAltID = false;
    }

    public void resetSecurityAltIDSource()
    {
        hasSecurityAltIDSource = false;
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
        builder.append("\"MessageName\": \"SecurityAltIDGroup\",\n");
        if (hasSecurityAltID())
        {
            indent(builder, level);
            builder.append("\"SecurityAltID\": \"");
            builder.append(this.securityAltID(), 0, securityAltIDLength());
            builder.append("\",\n");
        }

        if (hasSecurityAltIDSource())
        {
            indent(builder, level);
            builder.append("\"SecurityAltIDSource\": \"");
            builder.append(this.securityAltIDSource(), 0, securityAltIDSourceLength());
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public SecAltIDGrpEncoder.SecurityAltIDGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((SecAltIDGrpEncoder.SecurityAltIDGroupEncoder)encoder);
    }

    public SecAltIDGrpEncoder.SecurityAltIDGroupEncoder toEncoder(final SecAltIDGrpEncoder.SecurityAltIDGroupEncoder encoder)
    {
        encoder.reset();
        if (hasSecurityAltID())
        {
            encoder.securityAltID(this.securityAltID(), 0, securityAltIDLength());
        }

        if (hasSecurityAltIDSource())
        {
            encoder.securityAltIDSource(this.securityAltIDSource(), 0, securityAltIDSourceLength());
        }
        return encoder;
    }

}
    public class SecurityAltIDGroupIterator implements Iterable<SecurityAltIDGroupDecoder>, java.util.Iterator<SecurityAltIDGroupDecoder>
    {
        private final SecAltIDGrpDecoder parent;
        private int remainder;
        private SecurityAltIDGroupDecoder current;

        public SecurityAltIDGroupIterator(final SecAltIDGrpDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }

        public SecurityAltIDGroupDecoder next()
        {
            remainder--;
            final SecurityAltIDGroupDecoder value = current;
            current = current.next();
            return value;
        }

        public int numberFieldValue()
        {
            return parent.hasNoSecurityAltIDGroupCounter() ? parent.noSecurityAltIDGroupCounter() : 0;
        }

        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.securityAltIDGroup();
        }

        public SecurityAltIDGroupIterator iterator()
        {
            reset();
            return this;
        }

    }

    public SecurityAltIDGroupIterator securityAltIDGroupIterator();
    public int noSecurityAltIDGroupCounter();
    public boolean hasNoSecurityAltIDGroupCounter();
    public SecurityAltIDGroupDecoder securityAltIDGroup();

}
