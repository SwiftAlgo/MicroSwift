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
import com.swiftalgo.ms.codecs.fix50sp2.builder.MDRjctGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.MDRjctGrpEncoder.AltMDSourceGroupEncoder;

public interface MDRjctGrpDecoder 
{



public class AltMDSourceGroupDecoder extends CommonDecoderImpl
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(0);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
        }
    }

    public final IntHashSet ALL_GROUP_FIELDS = new IntHashSet(2);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            ALL_GROUP_FIELDS.add(Constants.ALT_M_D_SOURCE_ID);
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
    public AltMDSourceGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private AltMDSourceGroupDecoder next = null;

    public AltMDSourceGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(2);

    private char[] altMDSourceID = new char[1];

    private boolean hasAltMDSourceID;

    public char[] altMDSourceID()
    {
        if (!hasAltMDSourceID)
        {
            throw new IllegalArgumentException("No value for optional field: AltMDSourceID");
        }

        return altMDSourceID;
    }

    public boolean hasAltMDSourceID()
    {
        return hasAltMDSourceID;
    }


    private int altMDSourceIDOffset;

    private int altMDSourceIDLength;

    public int altMDSourceIDLength()
    {
        if (!hasAltMDSourceID)
        {
            throw new IllegalArgumentException("No value for optional field: AltMDSourceID");
        }

        return altMDSourceIDLength;
    }

    public String altMDSourceIDAsString()
    {
        return hasAltMDSourceID ? new String(altMDSourceID, 0, altMDSourceIDLength) : null;
    }

    public void altMDSourceID(final AsciiSequenceView view)
    {
        if (!hasAltMDSourceID)
        {
            throw new IllegalArgumentException("No value for optional field: AltMDSourceID");
        }

        view.wrap(buffer, altMDSourceIDOffset, altMDSourceIDLength);
    }


    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode AltMDSourceGroup
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
                    next = new AltMDSourceGroupDecoder(trailer, messageFields);
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
            case Constants.ALT_M_D_SOURCE_ID:
                hasAltMDSourceID = true;
                altMDSourceID = buffer.getChars(altMDSourceID, valueOffset, valueLength);
                altMDSourceIDOffset = valueOffset;
                altMDSourceIDLength = valueLength;
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
        this.resetAltMDSourceID();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetAltMDSourceID()
    {
        hasAltMDSourceID = false;
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
        builder.append("\"MessageName\": \"AltMDSourceGroup\",\n");
        if (hasAltMDSourceID())
        {
            indent(builder, level);
            builder.append("\"AltMDSourceID\": \"");
            builder.append(this.altMDSourceID(), 0, altMDSourceIDLength());
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public AltMDSourceGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((AltMDSourceGroupEncoder)encoder);
    }

    public AltMDSourceGroupEncoder toEncoder(final AltMDSourceGroupEncoder encoder)
    {
        encoder.reset();
        if (hasAltMDSourceID())
        {
            encoder.altMDSourceID(this.altMDSourceID(), 0, altMDSourceIDLength());
        }
        return encoder;
    }

}
    public class AltMDSourceGroupIterator implements Iterable<AltMDSourceGroupDecoder>, java.util.Iterator<AltMDSourceGroupDecoder>
    {
        private final MDRjctGrpDecoder parent;
        private int remainder;
        private AltMDSourceGroupDecoder current;

        public AltMDSourceGroupIterator(final MDRjctGrpDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }
        public AltMDSourceGroupDecoder next()
        {
            remainder--;
            final AltMDSourceGroupDecoder value = current;
            current = current.next();
            return value;
        }
        public int numberFieldValue()
        {
            return parent.hasNoAltMDSourceGroupCounter() ? parent.noAltMDSourceGroupCounter() : 0;
        }
        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.altMDSourceGroup();
        }
        public AltMDSourceGroupIterator iterator()
        {
            reset();
            return this;
        }
    }

public AltMDSourceGroupIterator altMDSourceGroupIterator();
    public int noAltMDSourceGroupCounter();
    public boolean hasNoAltMDSourceGroupCounter();
    public AltMDSourceGroupDecoder altMDSourceGroup();

}
