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
import com.swiftalgo.ms.codecs.fix50sp2.builder.UsernameGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.UsernameGrpEncoder.UsernamesGroupEncoder;

public interface UsernameGrpDecoder 
{



public class UsernamesGroupDecoder extends CommonDecoderImpl
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
            ALL_GROUP_FIELDS.add(Constants.USERNAME);
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
    public UsernamesGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private UsernamesGroupDecoder next = null;

    public UsernamesGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(2);

    private char[] username = new char[1];

    private boolean hasUsername;

    public char[] username()
    {
        if (!hasUsername)
        {
            throw new IllegalArgumentException("No value for optional field: Username");
        }

        return username;
    }

    public boolean hasUsername()
    {
        return hasUsername;
    }


    private int usernameOffset;

    private int usernameLength;

    public int usernameLength()
    {
        if (!hasUsername)
        {
            throw new IllegalArgumentException("No value for optional field: Username");
        }

        return usernameLength;
    }

    public String usernameAsString()
    {
        return hasUsername ? new String(username, 0, usernameLength) : null;
    }

    public void username(final AsciiSequenceView view)
    {
        if (!hasUsername)
        {
            throw new IllegalArgumentException("No value for optional field: Username");
        }

        view.wrap(buffer, usernameOffset, usernameLength);
    }


    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode UsernamesGroup
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
                    next = new UsernamesGroupDecoder(trailer, messageFields);
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
            case Constants.USERNAME:
                hasUsername = true;
                username = buffer.getChars(username, valueOffset, valueLength);
                usernameOffset = valueOffset;
                usernameLength = valueLength;
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
        this.resetUsername();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetUsername()
    {
        hasUsername = false;
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
        builder.append("\"MessageName\": \"UsernamesGroup\",\n");
        if (hasUsername())
        {
            indent(builder, level);
            builder.append("\"Username\": \"");
            builder.append(this.username(), 0, usernameLength());
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public UsernamesGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((UsernamesGroupEncoder)encoder);
    }

    public UsernamesGroupEncoder toEncoder(final UsernamesGroupEncoder encoder)
    {
        encoder.reset();
        if (hasUsername())
        {
            encoder.username(this.username(), 0, usernameLength());
        }
        return encoder;
    }

}
    public class UsernamesGroupIterator implements Iterable<UsernamesGroupDecoder>, java.util.Iterator<UsernamesGroupDecoder>
    {
        private final UsernameGrpDecoder parent;
        private int remainder;
        private UsernamesGroupDecoder current;

        public UsernamesGroupIterator(final UsernameGrpDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }
        public UsernamesGroupDecoder next()
        {
            remainder--;
            final UsernamesGroupDecoder value = current;
            current = current.next();
            return value;
        }
        public int numberFieldValue()
        {
            return parent.hasNoUsernamesGroupCounter() ? parent.noUsernamesGroupCounter() : 0;
        }
        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.usernamesGroup();
        }
        public UsernamesGroupIterator iterator()
        {
            reset();
            return this;
        }
    }

public UsernamesGroupIterator usernamesGroupIterator();
    public int noUsernamesGroupCounter();
    public boolean hasNoUsernamesGroupCounter();
    public UsernamesGroupDecoder usernamesGroup();

}
