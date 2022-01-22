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
import com.swiftalgo.ms.codecs.fix50sp2.builder.LegSecAltIDGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.LegSecAltIDGrpEncoder.LegSecurityAltIDGroupEncoder;

public interface LegSecAltIDGrpDecoder 
{



public class LegSecurityAltIDGroupDecoder extends CommonDecoderImpl
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
            ALL_GROUP_FIELDS.add(Constants.LEG_SECURITY_ALT_ID);
            ALL_GROUP_FIELDS.add(Constants.LEG_SECURITY_ALT_ID_SOURCE);
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
    public LegSecurityAltIDGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private LegSecurityAltIDGroupDecoder next = null;

    public LegSecurityAltIDGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(4);

    private char[] legSecurityAltID = new char[1];

    private boolean hasLegSecurityAltID;

    public char[] legSecurityAltID()
    {
        if (!hasLegSecurityAltID)
        {
            throw new IllegalArgumentException("No value for optional field: LegSecurityAltID");
        }

        return legSecurityAltID;
    }

    public boolean hasLegSecurityAltID()
    {
        return hasLegSecurityAltID;
    }


    private int legSecurityAltIDOffset;

    private int legSecurityAltIDLength;

    public int legSecurityAltIDLength()
    {
        if (!hasLegSecurityAltID)
        {
            throw new IllegalArgumentException("No value for optional field: LegSecurityAltID");
        }

        return legSecurityAltIDLength;
    }

    public String legSecurityAltIDAsString()
    {
        return hasLegSecurityAltID ? new String(legSecurityAltID, 0, legSecurityAltIDLength) : null;
    }

    public void legSecurityAltID(final AsciiSequenceView view)
    {
        if (!hasLegSecurityAltID)
        {
            throw new IllegalArgumentException("No value for optional field: LegSecurityAltID");
        }

        view.wrap(buffer, legSecurityAltIDOffset, legSecurityAltIDLength);
    }


    private final CharArrayWrapper legSecurityAltIDWrapper = new CharArrayWrapper();
    private char[] legSecurityAltIDSource = new char[1];

    private boolean hasLegSecurityAltIDSource;

    public char[] legSecurityAltIDSource()
    {
        if (!hasLegSecurityAltIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: LegSecurityAltIDSource");
        }

        return legSecurityAltIDSource;
    }

    public boolean hasLegSecurityAltIDSource()
    {
        return hasLegSecurityAltIDSource;
    }


    private int legSecurityAltIDSourceOffset;

    private int legSecurityAltIDSourceLength;

    public int legSecurityAltIDSourceLength()
    {
        if (!hasLegSecurityAltIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: LegSecurityAltIDSource");
        }

        return legSecurityAltIDSourceLength;
    }

    public String legSecurityAltIDSourceAsString()
    {
        return hasLegSecurityAltIDSource ? new String(legSecurityAltIDSource, 0, legSecurityAltIDSourceLength) : null;
    }

    public void legSecurityAltIDSource(final AsciiSequenceView view)
    {
        if (!hasLegSecurityAltIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: LegSecurityAltIDSource");
        }

        view.wrap(buffer, legSecurityAltIDSourceOffset, legSecurityAltIDSourceLength);
    }


    private final CharArrayWrapper legSecurityAltIDSourceWrapper = new CharArrayWrapper();
    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode LegSecurityAltIDGroup
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
                    next = new LegSecurityAltIDGroupDecoder(trailer, messageFields);
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
            case Constants.LEG_SECURITY_ALT_ID:
                hasLegSecurityAltID = true;
                legSecurityAltID = buffer.getChars(legSecurityAltID, valueOffset, valueLength);
                legSecurityAltIDOffset = valueOffset;
                legSecurityAltIDLength = valueLength;
                break;

            case Constants.LEG_SECURITY_ALT_ID_SOURCE:
                hasLegSecurityAltIDSource = true;
                legSecurityAltIDSource = buffer.getChars(legSecurityAltIDSource, valueOffset, valueLength);
                legSecurityAltIDSourceOffset = valueOffset;
                legSecurityAltIDSourceLength = valueLength;
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
        this.resetLegSecurityAltID();
        this.resetLegSecurityAltIDSource();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetLegSecurityAltID()
    {
        hasLegSecurityAltID = false;
    }

    public void resetLegSecurityAltIDSource()
    {
        hasLegSecurityAltIDSource = false;
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
        builder.append("\"MessageName\": \"LegSecurityAltIDGroup\",\n");
        if (hasLegSecurityAltID())
        {
            indent(builder, level);
            builder.append("\"LegSecurityAltID\": \"");
            builder.append(this.legSecurityAltID(), 0, legSecurityAltIDLength());
            builder.append("\",\n");
        }

        if (hasLegSecurityAltIDSource())
        {
            indent(builder, level);
            builder.append("\"LegSecurityAltIDSource\": \"");
            builder.append(this.legSecurityAltIDSource(), 0, legSecurityAltIDSourceLength());
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public LegSecAltIDGrpEncoder.LegSecurityAltIDGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((LegSecAltIDGrpEncoder.LegSecurityAltIDGroupEncoder)encoder);
    }

    public LegSecAltIDGrpEncoder.LegSecurityAltIDGroupEncoder toEncoder(final LegSecAltIDGrpEncoder.LegSecurityAltIDGroupEncoder encoder)
    {
        encoder.reset();
        if (hasLegSecurityAltID())
        {
            encoder.legSecurityAltID(this.legSecurityAltID(), 0, legSecurityAltIDLength());
        }

        if (hasLegSecurityAltIDSource())
        {
            encoder.legSecurityAltIDSource(this.legSecurityAltIDSource(), 0, legSecurityAltIDSourceLength());
        }
        return encoder;
    }

}
    public class LegSecurityAltIDGroupIterator implements Iterable<LegSecurityAltIDGroupDecoder>, java.util.Iterator<LegSecurityAltIDGroupDecoder>
    {
        private final LegSecAltIDGrpDecoder parent;
        private int remainder;
        private LegSecurityAltIDGroupDecoder current;

        public LegSecurityAltIDGroupIterator(final LegSecAltIDGrpDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }

        public LegSecurityAltIDGroupDecoder next()
        {
            remainder--;
            final LegSecurityAltIDGroupDecoder value = current;
            current = current.next();
            return value;
        }

        public int numberFieldValue()
        {
            return parent.hasNoLegSecurityAltIDGroupCounter() ? parent.noLegSecurityAltIDGroupCounter() : 0;
        }

        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.legSecurityAltIDGroup();
        }

        public LegSecurityAltIDGroupIterator iterator()
        {
            reset();
            return this;
        }

    }

    public LegSecurityAltIDGroupIterator legSecurityAltIDGroupIterator();
    public int noLegSecurityAltIDGroupCounter();
    public boolean hasNoLegSecurityAltIDGroupCounter();
    public LegSecurityAltIDGroupDecoder legSecurityAltIDGroup();

}
