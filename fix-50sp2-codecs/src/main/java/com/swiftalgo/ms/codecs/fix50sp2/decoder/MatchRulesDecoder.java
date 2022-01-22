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
import com.swiftalgo.ms.codecs.fix50sp2.builder.MatchRulesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.MatchRulesEncoder.MatchRulesGroupEncoder;

public interface MatchRulesDecoder 
{



public class MatchRulesGroupDecoder extends CommonDecoderImpl
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
            ALL_GROUP_FIELDS.add(Constants.MATCH_ALGORITHM);
            ALL_GROUP_FIELDS.add(Constants.MATCH_TYPE);
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
        if (hasMatchType)
        {
        matchTypeWrapper.wrap(this.matchType(), matchTypeLength);
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !MatchType.isValid(matchTypeWrapper))
        {
            invalidTagId = 574;
            rejectReason = 5;
            return false;
        }
        }
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public MatchRulesGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private MatchRulesGroupDecoder next = null;

    public MatchRulesGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(4);

    private char[] matchAlgorithm = new char[1];

    private boolean hasMatchAlgorithm;

    public char[] matchAlgorithm()
    {
        if (!hasMatchAlgorithm)
        {
            throw new IllegalArgumentException("No value for optional field: MatchAlgorithm");
        }

        return matchAlgorithm;
    }

    public boolean hasMatchAlgorithm()
    {
        return hasMatchAlgorithm;
    }


    private int matchAlgorithmOffset;

    private int matchAlgorithmLength;

    public int matchAlgorithmLength()
    {
        if (!hasMatchAlgorithm)
        {
            throw new IllegalArgumentException("No value for optional field: MatchAlgorithm");
        }

        return matchAlgorithmLength;
    }

    public String matchAlgorithmAsString()
    {
        return hasMatchAlgorithm ? new String(matchAlgorithm, 0, matchAlgorithmLength) : null;
    }

    public void matchAlgorithm(final AsciiSequenceView view)
    {
        if (!hasMatchAlgorithm)
        {
            throw new IllegalArgumentException("No value for optional field: MatchAlgorithm");
        }

        view.wrap(buffer, matchAlgorithmOffset, matchAlgorithmLength);
    }


    private final CharArrayWrapper matchAlgorithmWrapper = new CharArrayWrapper();
    private char[] matchType = new char[1];

    private boolean hasMatchType;

    public char[] matchType()
    {
        if (!hasMatchType)
        {
            throw new IllegalArgumentException("No value for optional field: MatchType");
        }

        return matchType;
    }

    public boolean hasMatchType()
    {
        return hasMatchType;
    }


    private int matchTypeOffset;

    private int matchTypeLength;

    public int matchTypeLength()
    {
        if (!hasMatchType)
        {
            throw new IllegalArgumentException("No value for optional field: MatchType");
        }

        return matchTypeLength;
    }

    public String matchTypeAsString()
    {
        return hasMatchType ? new String(matchType, 0, matchTypeLength) : null;
    }

    public void matchType(final AsciiSequenceView view)
    {
        if (!hasMatchType)
        {
            throw new IllegalArgumentException("No value for optional field: MatchType");
        }

        view.wrap(buffer, matchTypeOffset, matchTypeLength);
    }


    private final CharArrayWrapper matchTypeWrapper = new CharArrayWrapper();
    public MatchType matchTypeAsEnum()
    {
        if (!hasMatchType)
 return MatchType.NULL_VAL;
        matchTypeWrapper.wrap(this.matchType(), matchTypeLength);
        return MatchType.decode(matchTypeWrapper);
    }

    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode MatchRulesGroup
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
                    next = new MatchRulesGroupDecoder(trailer, messageFields);
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
            case Constants.MATCH_ALGORITHM:
                hasMatchAlgorithm = true;
                matchAlgorithm = buffer.getChars(matchAlgorithm, valueOffset, valueLength);
                matchAlgorithmOffset = valueOffset;
                matchAlgorithmLength = valueLength;
                break;

            case Constants.MATCH_TYPE:
                hasMatchType = true;
                matchType = buffer.getChars(matchType, valueOffset, valueLength);
                matchTypeOffset = valueOffset;
                matchTypeLength = valueLength;
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
        this.resetMatchAlgorithm();
        this.resetMatchType();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetMatchAlgorithm()
    {
        hasMatchAlgorithm = false;
    }

    public void resetMatchType()
    {
        hasMatchType = false;
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
        builder.append("\"MessageName\": \"MatchRulesGroup\",\n");
        if (hasMatchAlgorithm())
        {
            indent(builder, level);
            builder.append("\"MatchAlgorithm\": \"");
            builder.append(this.matchAlgorithm(), 0, matchAlgorithmLength());
            builder.append("\",\n");
        }

        if (hasMatchType())
        {
            indent(builder, level);
            builder.append("\"MatchType\": \"");
            builder.append(this.matchType(), 0, matchTypeLength());
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public MatchRulesEncoder.MatchRulesGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((MatchRulesEncoder.MatchRulesGroupEncoder)encoder);
    }

    public MatchRulesEncoder.MatchRulesGroupEncoder toEncoder(final MatchRulesEncoder.MatchRulesGroupEncoder encoder)
    {
        encoder.reset();
        if (hasMatchAlgorithm())
        {
            encoder.matchAlgorithm(this.matchAlgorithm(), 0, matchAlgorithmLength());
        }

        if (hasMatchType())
        {
            encoder.matchType(this.matchType(), 0, matchTypeLength());
        }
        return encoder;
    }

}
    public class MatchRulesGroupIterator implements Iterable<MatchRulesGroupDecoder>, java.util.Iterator<MatchRulesGroupDecoder>
    {
        private final MatchRulesDecoder parent;
        private int remainder;
        private MatchRulesGroupDecoder current;

        public MatchRulesGroupIterator(final MatchRulesDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }

        public MatchRulesGroupDecoder next()
        {
            remainder--;
            final MatchRulesGroupDecoder value = current;
            current = current.next();
            return value;
        }

        public int numberFieldValue()
        {
            return parent.hasNoMatchRulesGroupCounter() ? parent.noMatchRulesGroupCounter() : 0;
        }

        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.matchRulesGroup();
        }

        public MatchRulesGroupIterator iterator()
        {
            reset();
            return this;
        }

    }

    public MatchRulesGroupIterator matchRulesGroupIterator();
    public int noMatchRulesGroupCounter();
    public boolean hasNoMatchRulesGroupCounter();
    public MatchRulesGroupDecoder matchRulesGroup();

}
