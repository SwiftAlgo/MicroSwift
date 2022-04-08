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
import com.swiftalgo.ms.codecs.fix50sp2.builder.StrikeRulesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.StrikeRulesEncoder.StrikeRulesGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.MaturityRulesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.MaturityRulesEncoder.MaturityRulesGroupEncoder;

public interface StrikeRulesDecoder 
{



public class StrikeRulesGroupDecoder extends CommonDecoderImpl implements MaturityRulesDecoder
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(0);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
        }
    }

    public final IntHashSet GROUP_FIELDS = new IntHashSet(10);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            GROUP_FIELDS.add(Constants.STRIKE_RULE_ID);
            GROUP_FIELDS.add(Constants.START_STRIKE_PX_RANGE);
            GROUP_FIELDS.add(Constants.END_STRIKE_PX_RANGE);
            GROUP_FIELDS.add(Constants.STRIKE_INCREMENT);
            GROUP_FIELDS.add(Constants.STRIKE_EXERCISE_STYLE);
        }
    }

    public final IntHashSet ALL_GROUP_FIELDS = new IntHashSet(10);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            ALL_GROUP_FIELDS.add(Constants.STRIKE_RULE_ID);
            ALL_GROUP_FIELDS.add(Constants.START_STRIKE_PX_RANGE);
            ALL_GROUP_FIELDS.add(Constants.END_STRIKE_PX_RANGE);
            ALL_GROUP_FIELDS.add(Constants.STRIKE_INCREMENT);
            ALL_GROUP_FIELDS.add(Constants.STRIKE_EXERCISE_STYLE);
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
        if (hasNoMaturityRulesGroupCounter)
        {
            {
                int count = 0;
                final MaturityRulesGroupIterator iterator = maturityRulesGroupIterator.iterator();
                for (final MaturityRulesGroupDecoder group : iterator)
                {
                    count++;                    if (!group.validate())
                    {
                        invalidTagId = group.invalidTagId();
                        rejectReason = group.rejectReason();
                        return false;
                    }
                }
                if (count != iterator.numberFieldValue())
                {
                    invalidTagId = 1236;
                    rejectReason = 16;
                    return false;
                }
            }
        }
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public StrikeRulesGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private StrikeRulesGroupDecoder next = null;

    public StrikeRulesGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(12);

    private char[] strikeRuleID = new char[1];

    private boolean hasStrikeRuleID;

    public char[] strikeRuleID()
    {
        if (!hasStrikeRuleID)
        {
            throw new IllegalArgumentException("No value for optional field: StrikeRuleID");
        }

        return strikeRuleID;
    }

    public boolean hasStrikeRuleID()
    {
        return hasStrikeRuleID;
    }


    private int strikeRuleIDOffset;

    private int strikeRuleIDLength;

    public int strikeRuleIDLength()
    {
        if (!hasStrikeRuleID)
        {
            throw new IllegalArgumentException("No value for optional field: StrikeRuleID");
        }

        return strikeRuleIDLength;
    }

    public String strikeRuleIDAsString()
    {
        return hasStrikeRuleID ? new String(strikeRuleID, 0, strikeRuleIDLength) : null;
    }

    public void strikeRuleID(final AsciiSequenceView view)
    {
        if (!hasStrikeRuleID)
        {
            throw new IllegalArgumentException("No value for optional field: StrikeRuleID");
        }

        view.wrap(buffer, strikeRuleIDOffset, strikeRuleIDLength);
    }


    private final CharArrayWrapper strikeRuleIDWrapper = new CharArrayWrapper();
    private DecimalFloat startStrikePxRange = DecimalFloat.newNaNValue();

    private boolean hasStartStrikePxRange;

    public DecimalFloat startStrikePxRange()
    {
        if (!hasStartStrikePxRange)
        {
            throw new IllegalArgumentException("No value for optional field: StartStrikePxRange");
        }

        return startStrikePxRange;
    }

    public boolean hasStartStrikePxRange()
    {
        return hasStartStrikePxRange;
    }



    private DecimalFloat endStrikePxRange = DecimalFloat.newNaNValue();

    private boolean hasEndStrikePxRange;

    public DecimalFloat endStrikePxRange()
    {
        if (!hasEndStrikePxRange)
        {
            throw new IllegalArgumentException("No value for optional field: EndStrikePxRange");
        }

        return endStrikePxRange;
    }

    public boolean hasEndStrikePxRange()
    {
        return hasEndStrikePxRange;
    }



    private DecimalFloat strikeIncrement = DecimalFloat.newNaNValue();

    private boolean hasStrikeIncrement;

    public DecimalFloat strikeIncrement()
    {
        if (!hasStrikeIncrement)
        {
            throw new IllegalArgumentException("No value for optional field: StrikeIncrement");
        }

        return strikeIncrement;
    }

    public boolean hasStrikeIncrement()
    {
        return hasStrikeIncrement;
    }



    private int strikeExerciseStyle = MISSING_INT;

    private boolean hasStrikeExerciseStyle;

    public int strikeExerciseStyle()
    {
        if (!hasStrikeExerciseStyle)
        {
            throw new IllegalArgumentException("No value for optional field: StrikeExerciseStyle");
        }

        return strikeExerciseStyle;
    }

    public boolean hasStrikeExerciseStyle()
    {
        return hasStrikeExerciseStyle;
    }





    private MaturityRulesGroupDecoder maturityRulesGroup = null;
    public MaturityRulesGroupDecoder maturityRulesGroup()
    {
        return maturityRulesGroup;
    }

    private int noMaturityRulesGroupCounter = MISSING_INT;

    private boolean hasNoMaturityRulesGroupCounter;

    public int noMaturityRulesGroupCounter()
    {
        if (!hasNoMaturityRulesGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoMaturityRulesGroupCounter");
        }

        return noMaturityRulesGroupCounter;
    }

    public boolean hasNoMaturityRulesGroupCounter()
    {
        return hasNoMaturityRulesGroupCounter;
    }




    private MaturityRulesGroupIterator maturityRulesGroupIterator = new MaturityRulesGroupIterator(this);
    public MaturityRulesGroupIterator maturityRulesGroupIterator()
    {
        return maturityRulesGroupIterator.iterator();
    }


    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode StrikeRulesGroup
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
                    next = new StrikeRulesGroupDecoder(trailer, messageFields);
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
            case Constants.STRIKE_RULE_ID:
                hasStrikeRuleID = true;
                strikeRuleID = buffer.getChars(strikeRuleID, valueOffset, valueLength);
                strikeRuleIDOffset = valueOffset;
                strikeRuleIDLength = valueLength;
                break;

            case Constants.START_STRIKE_PX_RANGE:
                hasStartStrikePxRange = true;
                startStrikePxRange = getFloat(buffer, startStrikePxRange, valueOffset, valueLength, 1202, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.END_STRIKE_PX_RANGE:
                hasEndStrikePxRange = true;
                endStrikePxRange = getFloat(buffer, endStrikePxRange, valueOffset, valueLength, 1203, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.STRIKE_INCREMENT:
                hasStrikeIncrement = true;
                strikeIncrement = getFloat(buffer, strikeIncrement, valueOffset, valueLength, 1204, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.STRIKE_EXERCISE_STYLE:
                hasStrikeExerciseStyle = true;
                strikeExerciseStyle = getInt(buffer, valueOffset, endOfField, 1304, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.NO_MATURITY_RULES_GROUP_COUNTER:
                hasNoMaturityRulesGroupCounter = true;
                noMaturityRulesGroupCounter = getInt(buffer, valueOffset, endOfField, 1236, CODEC_VALIDATION_ENABLED);
                if (maturityRulesGroup == null)
                {
                    maturityRulesGroup = new MaturityRulesGroupDecoder(trailer, messageFields);
                }
                MaturityRulesGroupDecoder maturityRulesGroupCurrent = maturityRulesGroup;
                position = endOfField + 1;
                final int noMaturityRulesGroupCounter = this.noMaturityRulesGroupCounter;
                for (int i = 0; i < noMaturityRulesGroupCounter && position < end; i++)
                {
                    if (maturityRulesGroupCurrent != null)
                    {
                        position += maturityRulesGroupCurrent.decode(buffer, position, end - position);
                        maturityRulesGroupCurrent = maturityRulesGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (maturityRulesGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
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
        this.resetStrikeRuleID();
        this.resetStartStrikePxRange();
        this.resetEndStrikePxRange();
        this.resetStrikeIncrement();
        this.resetStrikeExerciseStyle();
        this.resetMaturityRulesGroup();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetStrikeRuleID()
    {
        hasStrikeRuleID = false;
    }

    public void resetStartStrikePxRange()
    {
        hasStartStrikePxRange = false;
    }

    public void resetEndStrikePxRange()
    {
        hasEndStrikePxRange = false;
    }

    public void resetStrikeIncrement()
    {
        hasStrikeIncrement = false;
    }

    public void resetStrikeExerciseStyle()
    {
        hasStrikeExerciseStyle = false;
    }

    public void resetMaturityRulesGroup()
    {
        for (final MaturityRulesGroupDecoder maturityRulesGroupDecoder : maturityRulesGroupIterator.iterator())
        {
            maturityRulesGroupDecoder.reset();
            if (maturityRulesGroupDecoder.next() == null)
            {
                break;
            }
        }
        noMaturityRulesGroupCounter = MISSING_INT;
        hasNoMaturityRulesGroupCounter = false;
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
        builder.append("\"MessageName\": \"StrikeRulesGroup\",\n");
        if (hasStrikeRuleID())
        {
            indent(builder, level);
            builder.append("\"StrikeRuleID\": \"");
            builder.append(this.strikeRuleID(), 0, strikeRuleIDLength());
            builder.append("\",\n");
        }

        if (hasStartStrikePxRange())
        {
            indent(builder, level);
            builder.append("\"StartStrikePxRange\": \"");
            startStrikePxRange.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasEndStrikePxRange())
        {
            indent(builder, level);
            builder.append("\"EndStrikePxRange\": \"");
            endStrikePxRange.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasStrikeIncrement())
        {
            indent(builder, level);
            builder.append("\"StrikeIncrement\": \"");
            strikeIncrement.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasStrikeExerciseStyle())
        {
            indent(builder, level);
            builder.append("\"StrikeExerciseStyle\": \"");
            builder.append(strikeExerciseStyle);
            builder.append("\",\n");
        }

        if (hasNoMaturityRulesGroupCounter)
        {
            indent(builder, level);
            builder.append("\"MaturityRulesGroup\": [\n");
            MaturityRulesGroupDecoder maturityRulesGroup = this.maturityRulesGroup;
            for (int i = 0, size = this.noMaturityRulesGroupCounter; i < size; i++)
            {
                indent(builder, level);
                maturityRulesGroup.appendTo(builder, level + 1);
                if (maturityRulesGroup.next() != null)
                {
                    builder.append(',');
                }
                builder.append('\n');
                maturityRulesGroup = maturityRulesGroup.next();            }
            indent(builder, level);
            builder.append("],\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public StrikeRulesEncoder.StrikeRulesGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((StrikeRulesEncoder.StrikeRulesGroupEncoder)encoder);
    }

    public StrikeRulesEncoder.StrikeRulesGroupEncoder toEncoder(final StrikeRulesEncoder.StrikeRulesGroupEncoder encoder)
    {
        encoder.reset();
        if (hasStrikeRuleID())
        {
            encoder.strikeRuleID(this.strikeRuleID(), 0, strikeRuleIDLength());
        }

        if (hasStartStrikePxRange())
        {
            encoder.startStrikePxRange(this.startStrikePxRange());
        }

        if (hasEndStrikePxRange())
        {
            encoder.endStrikePxRange(this.endStrikePxRange());
        }

        if (hasStrikeIncrement())
        {
            encoder.strikeIncrement(this.strikeIncrement());
        }

        if (hasStrikeExerciseStyle())
        {
            encoder.strikeExerciseStyle(this.strikeExerciseStyle());
        }


        final MaturityRulesEncoder maturityRules = encoder.maturityRules();        if (hasNoMaturityRulesGroupCounter)
        {
            final int size = this.noMaturityRulesGroupCounter;
            MaturityRulesGroupDecoder maturityRulesGroup = this.maturityRulesGroup;
            MaturityRulesGroupEncoder maturityRulesGroupEncoder = maturityRules.maturityRulesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (maturityRulesGroup != null)
                {
                    maturityRulesGroup.toEncoder(maturityRulesGroupEncoder);
                    maturityRulesGroup = maturityRulesGroup.next();
                    maturityRulesGroupEncoder = maturityRulesGroupEncoder.next();
                }
            }
        }

        return encoder;
    }

}
    public class StrikeRulesGroupIterator implements Iterable<StrikeRulesGroupDecoder>, java.util.Iterator<StrikeRulesGroupDecoder>
    {
        private final StrikeRulesDecoder parent;
        private int remainder;
        private StrikeRulesGroupDecoder current;

        public StrikeRulesGroupIterator(final StrikeRulesDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }

        public StrikeRulesGroupDecoder next()
        {
            remainder--;
            final StrikeRulesGroupDecoder value = current;
            current = current.next();
            return value;
        }

        public int numberFieldValue()
        {
            return parent.hasNoStrikeRulesGroupCounter() ? parent.noStrikeRulesGroupCounter() : 0;
        }

        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.strikeRulesGroup();
        }

        public StrikeRulesGroupIterator iterator()
        {
            reset();
            return this;
        }

    }

    public StrikeRulesGroupIterator strikeRulesGroupIterator();
    public int noStrikeRulesGroupCounter();
    public boolean hasNoStrikeRulesGroupCounter();
    public StrikeRulesGroupDecoder strikeRulesGroup();

}
