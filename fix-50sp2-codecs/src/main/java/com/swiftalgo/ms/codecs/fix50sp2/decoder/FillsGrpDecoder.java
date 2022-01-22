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
import com.swiftalgo.ms.codecs.fix50sp2.builder.FillsGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.FillsGrpEncoder.FillsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.NestedParties4Encoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.NestedParties4Encoder.Nested4PartyIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.NstdPtys4SubGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.NstdPtys4SubGrpEncoder.Nested4PartySubIDsGroupEncoder;

public interface FillsGrpDecoder 
{



public class FillsGroupDecoder extends CommonDecoderImpl implements NestedParties4Decoder
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(0);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
        }
    }

    public final IntHashSet GROUP_FIELDS = new IntHashSet(8);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            GROUP_FIELDS.add(Constants.FILL_EXEC_ID);
            GROUP_FIELDS.add(Constants.FILL_PX);
            GROUP_FIELDS.add(Constants.FILL_QTY);
            GROUP_FIELDS.add(Constants.FILL_LIQUIDITY_IND);
        }
    }

    public final IntHashSet ALL_GROUP_FIELDS = new IntHashSet(8);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            ALL_GROUP_FIELDS.add(Constants.FILL_EXEC_ID);
            ALL_GROUP_FIELDS.add(Constants.FILL_PX);
            ALL_GROUP_FIELDS.add(Constants.FILL_QTY);
            ALL_GROUP_FIELDS.add(Constants.FILL_LIQUIDITY_IND);
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
        if (hasNoNested4PartyIDsGroupCounter)
        {
            {
                int count = 0;
                final Nested4PartyIDsGroupIterator iterator = nested4PartyIDsGroupIterator.iterator();
                for (final Nested4PartyIDsGroupDecoder group : iterator)
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
                    invalidTagId = 1414;
                    rejectReason = 16;
                    return false;
                }
            }
        }
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public FillsGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private FillsGroupDecoder next = null;

    public FillsGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(10);

    private char[] fillExecID = new char[1];

    private boolean hasFillExecID;

    public char[] fillExecID()
    {
        if (!hasFillExecID)
        {
            throw new IllegalArgumentException("No value for optional field: FillExecID");
        }

        return fillExecID;
    }

    public boolean hasFillExecID()
    {
        return hasFillExecID;
    }


    private int fillExecIDOffset;

    private int fillExecIDLength;

    public int fillExecIDLength()
    {
        if (!hasFillExecID)
        {
            throw new IllegalArgumentException("No value for optional field: FillExecID");
        }

        return fillExecIDLength;
    }

    public String fillExecIDAsString()
    {
        return hasFillExecID ? new String(fillExecID, 0, fillExecIDLength) : null;
    }

    public void fillExecID(final AsciiSequenceView view)
    {
        if (!hasFillExecID)
        {
            throw new IllegalArgumentException("No value for optional field: FillExecID");
        }

        view.wrap(buffer, fillExecIDOffset, fillExecIDLength);
    }


    private final CharArrayWrapper fillExecIDWrapper = new CharArrayWrapper();
    private DecimalFloat fillPx = DecimalFloat.newNaNValue();

    private boolean hasFillPx;

    public DecimalFloat fillPx()
    {
        if (!hasFillPx)
        {
            throw new IllegalArgumentException("No value for optional field: FillPx");
        }

        return fillPx;
    }

    public boolean hasFillPx()
    {
        return hasFillPx;
    }



    private DecimalFloat fillQty = DecimalFloat.newNaNValue();

    private boolean hasFillQty;

    public DecimalFloat fillQty()
    {
        if (!hasFillQty)
        {
            throw new IllegalArgumentException("No value for optional field: FillQty");
        }

        return fillQty;
    }

    public boolean hasFillQty()
    {
        return hasFillQty;
    }



    private int fillLiquidityInd = MISSING_INT;

    private boolean hasFillLiquidityInd;

    public int fillLiquidityInd()
    {
        if (!hasFillLiquidityInd)
        {
            throw new IllegalArgumentException("No value for optional field: FillLiquidityInd");
        }

        return fillLiquidityInd;
    }

    public boolean hasFillLiquidityInd()
    {
        return hasFillLiquidityInd;
    }





    private Nested4PartyIDsGroupDecoder nested4PartyIDsGroup = null;
    public Nested4PartyIDsGroupDecoder nested4PartyIDsGroup()
    {
        return nested4PartyIDsGroup;
    }

    private int noNested4PartyIDsGroupCounter = MISSING_INT;

    private boolean hasNoNested4PartyIDsGroupCounter;

    public int noNested4PartyIDsGroupCounter()
    {
        if (!hasNoNested4PartyIDsGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoNested4PartyIDsGroupCounter");
        }

        return noNested4PartyIDsGroupCounter;
    }

    public boolean hasNoNested4PartyIDsGroupCounter()
    {
        return hasNoNested4PartyIDsGroupCounter;
    }




    private Nested4PartyIDsGroupIterator nested4PartyIDsGroupIterator = new Nested4PartyIDsGroupIterator(this);
    public Nested4PartyIDsGroupIterator nested4PartyIDsGroupIterator()
    {
        return nested4PartyIDsGroupIterator.iterator();
    }


    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode FillsGroup
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
                    next = new FillsGroupDecoder(trailer, messageFields);
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
            case Constants.FILL_EXEC_ID:
                hasFillExecID = true;
                fillExecID = buffer.getChars(fillExecID, valueOffset, valueLength);
                fillExecIDOffset = valueOffset;
                fillExecIDLength = valueLength;
                break;

            case Constants.FILL_PX:
                hasFillPx = true;
                fillPx = getFloat(buffer, fillPx, valueOffset, valueLength, 1364, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.FILL_QTY:
                hasFillQty = true;
                fillQty = getFloat(buffer, fillQty, valueOffset, valueLength, 1365, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.FILL_LIQUIDITY_IND:
                hasFillLiquidityInd = true;
                fillLiquidityInd = getInt(buffer, valueOffset, endOfField, 1443, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.NO_NESTED4_PARTY_IDS_GROUP_COUNTER:
                hasNoNested4PartyIDsGroupCounter = true;
                noNested4PartyIDsGroupCounter = getInt(buffer, valueOffset, endOfField, 1414, CODEC_VALIDATION_ENABLED);
                if (nested4PartyIDsGroup == null)
                {
                    nested4PartyIDsGroup = new Nested4PartyIDsGroupDecoder(trailer, messageFields);
                }
                Nested4PartyIDsGroupDecoder nested4PartyIDsGroupCurrent = nested4PartyIDsGroup;
                position = endOfField + 1;
                final int noNested4PartyIDsGroupCounter = this.noNested4PartyIDsGroupCounter;
                for (int i = 0; i < noNested4PartyIDsGroupCounter && position < end; i++)
                {
                    if (nested4PartyIDsGroupCurrent != null)
                    {
                        position += nested4PartyIDsGroupCurrent.decode(buffer, position, end - position);
                        nested4PartyIDsGroupCurrent = nested4PartyIDsGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (nested4PartyIDsGroup.ALL_GROUP_FIELDS.contains(checkTag))
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
        this.resetFillExecID();
        this.resetFillPx();
        this.resetFillQty();
        this.resetFillLiquidityInd();
        this.resetNested4PartyIDsGroup();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetFillExecID()
    {
        hasFillExecID = false;
    }

    public void resetFillPx()
    {
        hasFillPx = false;
    }

    public void resetFillQty()
    {
        hasFillQty = false;
    }

    public void resetFillLiquidityInd()
    {
        hasFillLiquidityInd = false;
    }

    public void resetNested4PartyIDsGroup()
    {
        for (final Nested4PartyIDsGroupDecoder nested4PartyIDsGroupDecoder : nested4PartyIDsGroupIterator.iterator())
        {
            nested4PartyIDsGroupDecoder.reset();
            if (nested4PartyIDsGroupDecoder.next() == null)
            {
                break;
            }
        }
        noNested4PartyIDsGroupCounter = MISSING_INT;
        hasNoNested4PartyIDsGroupCounter = false;
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
        builder.append("\"MessageName\": \"FillsGroup\",\n");
        if (hasFillExecID())
        {
            indent(builder, level);
            builder.append("\"FillExecID\": \"");
            builder.append(this.fillExecID(), 0, fillExecIDLength());
            builder.append("\",\n");
        }

        if (hasFillPx())
        {
            indent(builder, level);
            builder.append("\"FillPx\": \"");
            fillPx.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasFillQty())
        {
            indent(builder, level);
            builder.append("\"FillQty\": \"");
            fillQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasFillLiquidityInd())
        {
            indent(builder, level);
            builder.append("\"FillLiquidityInd\": \"");
            builder.append(fillLiquidityInd);
            builder.append("\",\n");
        }

        if (hasNoNested4PartyIDsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"Nested4PartyIDsGroup\": [\n");
            Nested4PartyIDsGroupDecoder nested4PartyIDsGroup = this.nested4PartyIDsGroup;
            for (int i = 0, size = this.noNested4PartyIDsGroupCounter; i < size; i++)
            {
                indent(builder, level);
                nested4PartyIDsGroup.appendTo(builder, level + 1);
                if (nested4PartyIDsGroup.next() != null)
                {
                    builder.append(',');
                }
                builder.append('\n');
                nested4PartyIDsGroup = nested4PartyIDsGroup.next();            }
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
    public FillsGrpEncoder.FillsGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((FillsGrpEncoder.FillsGroupEncoder)encoder);
    }

    public FillsGrpEncoder.FillsGroupEncoder toEncoder(final FillsGrpEncoder.FillsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasFillExecID())
        {
            encoder.fillExecID(this.fillExecID(), 0, fillExecIDLength());
        }

        if (hasFillPx())
        {
            encoder.fillPx(this.fillPx());
        }

        if (hasFillQty())
        {
            encoder.fillQty(this.fillQty());
        }

        if (hasFillLiquidityInd())
        {
            encoder.fillLiquidityInd(this.fillLiquidityInd());
        }


        final NestedParties4Encoder nestedParties4 = encoder.nestedParties4();        if (hasNoNested4PartyIDsGroupCounter)
        {
            final int size = this.noNested4PartyIDsGroupCounter;
            Nested4PartyIDsGroupDecoder nested4PartyIDsGroup = this.nested4PartyIDsGroup;
            Nested4PartyIDsGroupEncoder nested4PartyIDsGroupEncoder = nestedParties4.nested4PartyIDsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (nested4PartyIDsGroup != null)
                {
                    nested4PartyIDsGroup.toEncoder(nested4PartyIDsGroupEncoder);
                    nested4PartyIDsGroup = nested4PartyIDsGroup.next();
                    nested4PartyIDsGroupEncoder = nested4PartyIDsGroupEncoder.next();
                }
            }
        }

        return encoder;
    }

}
    public class FillsGroupIterator implements Iterable<FillsGroupDecoder>, java.util.Iterator<FillsGroupDecoder>
    {
        private final FillsGrpDecoder parent;
        private int remainder;
        private FillsGroupDecoder current;

        public FillsGroupIterator(final FillsGrpDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }

        public FillsGroupDecoder next()
        {
            remainder--;
            final FillsGroupDecoder value = current;
            current = current.next();
            return value;
        }

        public int numberFieldValue()
        {
            return parent.hasNoFillsGroupCounter() ? parent.noFillsGroupCounter() : 0;
        }

        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.fillsGroup();
        }

        public FillsGroupIterator iterator()
        {
            reset();
            return this;
        }

    }

    public FillsGroupIterator fillsGroupIterator();
    public int noFillsGroupCounter();
    public boolean hasNoFillsGroupCounter();
    public FillsGroupDecoder fillsGroup();

}
