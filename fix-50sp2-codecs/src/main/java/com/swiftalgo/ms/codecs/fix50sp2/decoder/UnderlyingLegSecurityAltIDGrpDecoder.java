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
import com.swiftalgo.ms.codecs.fix50sp2.builder.UnderlyingLegSecurityAltIDGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.UnderlyingLegSecurityAltIDGrpEncoder.UnderlyingLegSecurityAltIDGroupEncoder;

public interface UnderlyingLegSecurityAltIDGrpDecoder 
{



public class UnderlyingLegSecurityAltIDGroupDecoder extends CommonDecoderImpl
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
            ALL_GROUP_FIELDS.add(Constants.UNDERLYING_LEG_SECURITY_ALT_ID);
            ALL_GROUP_FIELDS.add(Constants.UNDERLYING_LEG_SECURITY_ALT_ID_SOURCE);
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
    public UnderlyingLegSecurityAltIDGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private UnderlyingLegSecurityAltIDGroupDecoder next = null;

    public UnderlyingLegSecurityAltIDGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(4);

    private char[] underlyingLegSecurityAltID = new char[1];

    private boolean hasUnderlyingLegSecurityAltID;

    public char[] underlyingLegSecurityAltID()
    {
        if (!hasUnderlyingLegSecurityAltID)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingLegSecurityAltID");
        }

        return underlyingLegSecurityAltID;
    }

    public boolean hasUnderlyingLegSecurityAltID()
    {
        return hasUnderlyingLegSecurityAltID;
    }


    private int underlyingLegSecurityAltIDOffset;

    private int underlyingLegSecurityAltIDLength;

    public int underlyingLegSecurityAltIDLength()
    {
        if (!hasUnderlyingLegSecurityAltID)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingLegSecurityAltID");
        }

        return underlyingLegSecurityAltIDLength;
    }

    public String underlyingLegSecurityAltIDAsString()
    {
        return hasUnderlyingLegSecurityAltID ? new String(underlyingLegSecurityAltID, 0, underlyingLegSecurityAltIDLength) : null;
    }

    public void underlyingLegSecurityAltID(final AsciiSequenceView view)
    {
        if (!hasUnderlyingLegSecurityAltID)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingLegSecurityAltID");
        }

        view.wrap(buffer, underlyingLegSecurityAltIDOffset, underlyingLegSecurityAltIDLength);
    }


    private char[] underlyingLegSecurityAltIDSource = new char[1];

    private boolean hasUnderlyingLegSecurityAltIDSource;

    public char[] underlyingLegSecurityAltIDSource()
    {
        if (!hasUnderlyingLegSecurityAltIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingLegSecurityAltIDSource");
        }

        return underlyingLegSecurityAltIDSource;
    }

    public boolean hasUnderlyingLegSecurityAltIDSource()
    {
        return hasUnderlyingLegSecurityAltIDSource;
    }


    private int underlyingLegSecurityAltIDSourceOffset;

    private int underlyingLegSecurityAltIDSourceLength;

    public int underlyingLegSecurityAltIDSourceLength()
    {
        if (!hasUnderlyingLegSecurityAltIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingLegSecurityAltIDSource");
        }

        return underlyingLegSecurityAltIDSourceLength;
    }

    public String underlyingLegSecurityAltIDSourceAsString()
    {
        return hasUnderlyingLegSecurityAltIDSource ? new String(underlyingLegSecurityAltIDSource, 0, underlyingLegSecurityAltIDSourceLength) : null;
    }

    public void underlyingLegSecurityAltIDSource(final AsciiSequenceView view)
    {
        if (!hasUnderlyingLegSecurityAltIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingLegSecurityAltIDSource");
        }

        view.wrap(buffer, underlyingLegSecurityAltIDSourceOffset, underlyingLegSecurityAltIDSourceLength);
    }


    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode UnderlyingLegSecurityAltIDGroup
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
                    next = new UnderlyingLegSecurityAltIDGroupDecoder(trailer, messageFields);
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
            case Constants.UNDERLYING_LEG_SECURITY_ALT_ID:
                hasUnderlyingLegSecurityAltID = true;
                underlyingLegSecurityAltID = buffer.getChars(underlyingLegSecurityAltID, valueOffset, valueLength);
                underlyingLegSecurityAltIDOffset = valueOffset;
                underlyingLegSecurityAltIDLength = valueLength;
                break;

            case Constants.UNDERLYING_LEG_SECURITY_ALT_ID_SOURCE:
                hasUnderlyingLegSecurityAltIDSource = true;
                underlyingLegSecurityAltIDSource = buffer.getChars(underlyingLegSecurityAltIDSource, valueOffset, valueLength);
                underlyingLegSecurityAltIDSourceOffset = valueOffset;
                underlyingLegSecurityAltIDSourceLength = valueLength;
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
        this.resetUnderlyingLegSecurityAltID();
        this.resetUnderlyingLegSecurityAltIDSource();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetUnderlyingLegSecurityAltID()
    {
        hasUnderlyingLegSecurityAltID = false;
    }

    public void resetUnderlyingLegSecurityAltIDSource()
    {
        hasUnderlyingLegSecurityAltIDSource = false;
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
        builder.append("\"MessageName\": \"UnderlyingLegSecurityAltIDGroup\",\n");
        if (hasUnderlyingLegSecurityAltID())
        {
            indent(builder, level);
            builder.append("\"UnderlyingLegSecurityAltID\": \"");
            builder.append(this.underlyingLegSecurityAltID(), 0, underlyingLegSecurityAltIDLength());
            builder.append("\",\n");
        }

        if (hasUnderlyingLegSecurityAltIDSource())
        {
            indent(builder, level);
            builder.append("\"UnderlyingLegSecurityAltIDSource\": \"");
            builder.append(this.underlyingLegSecurityAltIDSource(), 0, underlyingLegSecurityAltIDSourceLength());
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public UnderlyingLegSecurityAltIDGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((UnderlyingLegSecurityAltIDGroupEncoder)encoder);
    }

    public UnderlyingLegSecurityAltIDGroupEncoder toEncoder(final UnderlyingLegSecurityAltIDGroupEncoder encoder)
    {
        encoder.reset();
        if (hasUnderlyingLegSecurityAltID())
        {
            encoder.underlyingLegSecurityAltID(this.underlyingLegSecurityAltID(), 0, underlyingLegSecurityAltIDLength());
        }

        if (hasUnderlyingLegSecurityAltIDSource())
        {
            encoder.underlyingLegSecurityAltIDSource(this.underlyingLegSecurityAltIDSource(), 0, underlyingLegSecurityAltIDSourceLength());
        }
        return encoder;
    }

}
    public class UnderlyingLegSecurityAltIDGroupIterator implements Iterable<UnderlyingLegSecurityAltIDGroupDecoder>, java.util.Iterator<UnderlyingLegSecurityAltIDGroupDecoder>
    {
        private final UnderlyingLegSecurityAltIDGrpDecoder parent;
        private int remainder;
        private UnderlyingLegSecurityAltIDGroupDecoder current;

        public UnderlyingLegSecurityAltIDGroupIterator(final UnderlyingLegSecurityAltIDGrpDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }
        public UnderlyingLegSecurityAltIDGroupDecoder next()
        {
            remainder--;
            final UnderlyingLegSecurityAltIDGroupDecoder value = current;
            current = current.next();
            return value;
        }
        public int numberFieldValue()
        {
            return parent.hasNoUnderlyingLegSecurityAltIDGroupCounter() ? parent.noUnderlyingLegSecurityAltIDGroupCounter() : 0;
        }
        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.underlyingLegSecurityAltIDGroup();
        }
        public UnderlyingLegSecurityAltIDGroupIterator iterator()
        {
            reset();
            return this;
        }
    }

public UnderlyingLegSecurityAltIDGroupIterator underlyingLegSecurityAltIDGroupIterator();
    public int noUnderlyingLegSecurityAltIDGroupCounter();
    public boolean hasNoUnderlyingLegSecurityAltIDGroupCounter();
    public UnderlyingLegSecurityAltIDGroupDecoder underlyingLegSecurityAltIDGroup();

}
