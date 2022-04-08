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
import com.swiftalgo.ms.codecs.fix50sp2.builder.MaturityRulesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.MaturityRulesEncoder.MaturityRulesGroupEncoder;

public interface MaturityRulesDecoder 
{



public class MaturityRulesGroupDecoder extends CommonDecoderImpl
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(0);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
        }
    }

    public final IntHashSet ALL_GROUP_FIELDS = new IntHashSet(12);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            ALL_GROUP_FIELDS.add(Constants.MATURITY_RULE_ID);
            ALL_GROUP_FIELDS.add(Constants.MATURITY_MONTH_YEAR_FORMAT);
            ALL_GROUP_FIELDS.add(Constants.MATURITY_MONTH_YEAR_INCREMENT_UNITS);
            ALL_GROUP_FIELDS.add(Constants.START_MATURITY_MONTH_YEAR);
            ALL_GROUP_FIELDS.add(Constants.END_MATURITY_MONTH_YEAR);
            ALL_GROUP_FIELDS.add(Constants.MATURITY_MONTH_YEAR_INCREMENT);
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
        if (hasMaturityMonthYearFormat)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !MaturityMonthYearFormat.isValid(maturityMonthYearFormat()))
        {
            invalidTagId = 1303;
            rejectReason = 5;
            return false;
        }
        }

        if (hasMaturityMonthYearIncrementUnits)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !MaturityMonthYearIncrementUnits.isValid(maturityMonthYearIncrementUnits()))
        {
            invalidTagId = 1302;
            rejectReason = 5;
            return false;
        }
        }
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public MaturityRulesGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private MaturityRulesGroupDecoder next = null;

    public MaturityRulesGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(12);

    private char[] maturityRuleID = new char[1];

    private boolean hasMaturityRuleID;

    public char[] maturityRuleID()
    {
        if (!hasMaturityRuleID)
        {
            throw new IllegalArgumentException("No value for optional field: MaturityRuleID");
        }

        return maturityRuleID;
    }

    public boolean hasMaturityRuleID()
    {
        return hasMaturityRuleID;
    }


    private int maturityRuleIDOffset;

    private int maturityRuleIDLength;

    public int maturityRuleIDLength()
    {
        if (!hasMaturityRuleID)
        {
            throw new IllegalArgumentException("No value for optional field: MaturityRuleID");
        }

        return maturityRuleIDLength;
    }

    public String maturityRuleIDAsString()
    {
        return hasMaturityRuleID ? new String(maturityRuleID, 0, maturityRuleIDLength) : null;
    }

    public void maturityRuleID(final AsciiSequenceView view)
    {
        if (!hasMaturityRuleID)
        {
            throw new IllegalArgumentException("No value for optional field: MaturityRuleID");
        }

        view.wrap(buffer, maturityRuleIDOffset, maturityRuleIDLength);
    }


    private final CharArrayWrapper maturityRuleIDWrapper = new CharArrayWrapper();
    private int maturityMonthYearFormat = MISSING_INT;

    private boolean hasMaturityMonthYearFormat;

    public int maturityMonthYearFormat()
    {
        if (!hasMaturityMonthYearFormat)
        {
            throw new IllegalArgumentException("No value for optional field: MaturityMonthYearFormat");
        }

        return maturityMonthYearFormat;
    }

    public boolean hasMaturityMonthYearFormat()
    {
        return hasMaturityMonthYearFormat;
    }



    private final CharArrayWrapper maturityMonthYearFormatWrapper = new CharArrayWrapper();
    public MaturityMonthYearFormat maturityMonthYearFormatAsEnum()
    {
        if (!hasMaturityMonthYearFormat)
 return MaturityMonthYearFormat.NULL_VAL;
        return MaturityMonthYearFormat.decode(maturityMonthYearFormat);
    }

    private int maturityMonthYearIncrementUnits = MISSING_INT;

    private boolean hasMaturityMonthYearIncrementUnits;

    public int maturityMonthYearIncrementUnits()
    {
        if (!hasMaturityMonthYearIncrementUnits)
        {
            throw new IllegalArgumentException("No value for optional field: MaturityMonthYearIncrementUnits");
        }

        return maturityMonthYearIncrementUnits;
    }

    public boolean hasMaturityMonthYearIncrementUnits()
    {
        return hasMaturityMonthYearIncrementUnits;
    }



    private final CharArrayWrapper maturityMonthYearIncrementUnitsWrapper = new CharArrayWrapper();
    public MaturityMonthYearIncrementUnits maturityMonthYearIncrementUnitsAsEnum()
    {
        if (!hasMaturityMonthYearIncrementUnits)
 return MaturityMonthYearIncrementUnits.NULL_VAL;
        return MaturityMonthYearIncrementUnits.decode(maturityMonthYearIncrementUnits);
    }

    private byte[] startMaturityMonthYear = new byte[8];

    private boolean hasStartMaturityMonthYear;

    public byte[] startMaturityMonthYear()
    {
        if (!hasStartMaturityMonthYear)
        {
            throw new IllegalArgumentException("No value for optional field: StartMaturityMonthYear");
        }

        return startMaturityMonthYear;
    }

    public boolean hasStartMaturityMonthYear()
    {
        return hasStartMaturityMonthYear;
    }


    private int startMaturityMonthYearOffset;

    private int startMaturityMonthYearLength;

    public int startMaturityMonthYearLength()
    {
        if (!hasStartMaturityMonthYear)
        {
            throw new IllegalArgumentException("No value for optional field: StartMaturityMonthYear");
        }

        return startMaturityMonthYearLength;
    }

    public String startMaturityMonthYearAsString()
    {
        return hasStartMaturityMonthYear ? new String(startMaturityMonthYear, 0, startMaturityMonthYearLength) : null;
    }

    public void startMaturityMonthYear(final AsciiSequenceView view)
    {
        if (!hasStartMaturityMonthYear)
        {
            throw new IllegalArgumentException("No value for optional field: StartMaturityMonthYear");
        }

        view.wrap(buffer, startMaturityMonthYearOffset, startMaturityMonthYearLength);
    }


    private byte[] endMaturityMonthYear = new byte[8];

    private boolean hasEndMaturityMonthYear;

    public byte[] endMaturityMonthYear()
    {
        if (!hasEndMaturityMonthYear)
        {
            throw new IllegalArgumentException("No value for optional field: EndMaturityMonthYear");
        }

        return endMaturityMonthYear;
    }

    public boolean hasEndMaturityMonthYear()
    {
        return hasEndMaturityMonthYear;
    }


    private int endMaturityMonthYearOffset;

    private int endMaturityMonthYearLength;

    public int endMaturityMonthYearLength()
    {
        if (!hasEndMaturityMonthYear)
        {
            throw new IllegalArgumentException("No value for optional field: EndMaturityMonthYear");
        }

        return endMaturityMonthYearLength;
    }

    public String endMaturityMonthYearAsString()
    {
        return hasEndMaturityMonthYear ? new String(endMaturityMonthYear, 0, endMaturityMonthYearLength) : null;
    }

    public void endMaturityMonthYear(final AsciiSequenceView view)
    {
        if (!hasEndMaturityMonthYear)
        {
            throw new IllegalArgumentException("No value for optional field: EndMaturityMonthYear");
        }

        view.wrap(buffer, endMaturityMonthYearOffset, endMaturityMonthYearLength);
    }


    private int maturityMonthYearIncrement = MISSING_INT;

    private boolean hasMaturityMonthYearIncrement;

    public int maturityMonthYearIncrement()
    {
        if (!hasMaturityMonthYearIncrement)
        {
            throw new IllegalArgumentException("No value for optional field: MaturityMonthYearIncrement");
        }

        return maturityMonthYearIncrement;
    }

    public boolean hasMaturityMonthYearIncrement()
    {
        return hasMaturityMonthYearIncrement;
    }



    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode MaturityRulesGroup
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
                    next = new MaturityRulesGroupDecoder(trailer, messageFields);
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
            case Constants.MATURITY_RULE_ID:
                hasMaturityRuleID = true;
                maturityRuleID = buffer.getChars(maturityRuleID, valueOffset, valueLength);
                maturityRuleIDOffset = valueOffset;
                maturityRuleIDLength = valueLength;
                break;

            case Constants.MATURITY_MONTH_YEAR_FORMAT:
                hasMaturityMonthYearFormat = true;
                maturityMonthYearFormat = getInt(buffer, valueOffset, endOfField, 1303, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.MATURITY_MONTH_YEAR_INCREMENT_UNITS:
                hasMaturityMonthYearIncrementUnits = true;
                maturityMonthYearIncrementUnits = getInt(buffer, valueOffset, endOfField, 1302, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.START_MATURITY_MONTH_YEAR:
                hasStartMaturityMonthYear = true;
                startMaturityMonthYear = buffer.getBytes(startMaturityMonthYear, valueOffset, valueLength);
                startMaturityMonthYearOffset = valueOffset;
                startMaturityMonthYearLength = valueLength;
                break;

            case Constants.END_MATURITY_MONTH_YEAR:
                hasEndMaturityMonthYear = true;
                endMaturityMonthYear = buffer.getBytes(endMaturityMonthYear, valueOffset, valueLength);
                endMaturityMonthYearOffset = valueOffset;
                endMaturityMonthYearLength = valueLength;
                break;

            case Constants.MATURITY_MONTH_YEAR_INCREMENT:
                hasMaturityMonthYearIncrement = true;
                maturityMonthYearIncrement = getInt(buffer, valueOffset, endOfField, 1229, CODEC_VALIDATION_ENABLED);
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
        this.resetMaturityRuleID();
        this.resetMaturityMonthYearFormat();
        this.resetMaturityMonthYearIncrementUnits();
        this.resetStartMaturityMonthYear();
        this.resetEndMaturityMonthYear();
        this.resetMaturityMonthYearIncrement();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetMaturityRuleID()
    {
        hasMaturityRuleID = false;
    }

    public void resetMaturityMonthYearFormat()
    {
        hasMaturityMonthYearFormat = false;
    }

    public void resetMaturityMonthYearIncrementUnits()
    {
        hasMaturityMonthYearIncrementUnits = false;
    }

    public void resetStartMaturityMonthYear()
    {
        hasStartMaturityMonthYear = false;
    }

    public void resetEndMaturityMonthYear()
    {
        hasEndMaturityMonthYear = false;
    }

    public void resetMaturityMonthYearIncrement()
    {
        hasMaturityMonthYearIncrement = false;
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
        builder.append("\"MessageName\": \"MaturityRulesGroup\",\n");
        if (hasMaturityRuleID())
        {
            indent(builder, level);
            builder.append("\"MaturityRuleID\": \"");
            builder.append(this.maturityRuleID(), 0, maturityRuleIDLength());
            builder.append("\",\n");
        }

        if (hasMaturityMonthYearFormat())
        {
            indent(builder, level);
            builder.append("\"MaturityMonthYearFormat\": \"");
            builder.append(maturityMonthYearFormat);
            builder.append("\",\n");
        }

        if (hasMaturityMonthYearIncrementUnits())
        {
            indent(builder, level);
            builder.append("\"MaturityMonthYearIncrementUnits\": \"");
            builder.append(maturityMonthYearIncrementUnits);
            builder.append("\",\n");
        }

        if (hasStartMaturityMonthYear())
        {
            indent(builder, level);
            builder.append("\"StartMaturityMonthYear\": \"");
            appendData(builder, startMaturityMonthYear, startMaturityMonthYearLength);
            builder.append("\",\n");
        }

        if (hasEndMaturityMonthYear())
        {
            indent(builder, level);
            builder.append("\"EndMaturityMonthYear\": \"");
            appendData(builder, endMaturityMonthYear, endMaturityMonthYearLength);
            builder.append("\",\n");
        }

        if (hasMaturityMonthYearIncrement())
        {
            indent(builder, level);
            builder.append("\"MaturityMonthYearIncrement\": \"");
            builder.append(maturityMonthYearIncrement);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public MaturityRulesEncoder.MaturityRulesGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((MaturityRulesEncoder.MaturityRulesGroupEncoder)encoder);
    }

    public MaturityRulesEncoder.MaturityRulesGroupEncoder toEncoder(final MaturityRulesEncoder.MaturityRulesGroupEncoder encoder)
    {
        encoder.reset();
        if (hasMaturityRuleID())
        {
            encoder.maturityRuleID(this.maturityRuleID(), 0, maturityRuleIDLength());
        }

        if (hasMaturityMonthYearFormat())
        {
            encoder.maturityMonthYearFormat(this.maturityMonthYearFormat());
        }

        if (hasMaturityMonthYearIncrementUnits())
        {
            encoder.maturityMonthYearIncrementUnits(this.maturityMonthYearIncrementUnits());
        }

        if (hasStartMaturityMonthYear())
        {
            encoder.startMaturityMonthYearAsCopy(this.startMaturityMonthYear(), 0, startMaturityMonthYearLength());
        }

        if (hasEndMaturityMonthYear())
        {
            encoder.endMaturityMonthYearAsCopy(this.endMaturityMonthYear(), 0, endMaturityMonthYearLength());
        }

        if (hasMaturityMonthYearIncrement())
        {
            encoder.maturityMonthYearIncrement(this.maturityMonthYearIncrement());
        }
        return encoder;
    }

}
    public class MaturityRulesGroupIterator implements Iterable<MaturityRulesGroupDecoder>, java.util.Iterator<MaturityRulesGroupDecoder>
    {
        private final MaturityRulesDecoder parent;
        private int remainder;
        private MaturityRulesGroupDecoder current;

        public MaturityRulesGroupIterator(final MaturityRulesDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }

        public MaturityRulesGroupDecoder next()
        {
            remainder--;
            final MaturityRulesGroupDecoder value = current;
            current = current.next();
            return value;
        }

        public int numberFieldValue()
        {
            return parent.hasNoMaturityRulesGroupCounter() ? parent.noMaturityRulesGroupCounter() : 0;
        }

        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.maturityRulesGroup();
        }

        public MaturityRulesGroupIterator iterator()
        {
            reset();
            return this;
        }

    }

    public MaturityRulesGroupIterator maturityRulesGroupIterator();
    public int noMaturityRulesGroupCounter();
    public boolean hasNoMaturityRulesGroupCounter();
    public MaturityRulesGroupDecoder maturityRulesGroup();

}
